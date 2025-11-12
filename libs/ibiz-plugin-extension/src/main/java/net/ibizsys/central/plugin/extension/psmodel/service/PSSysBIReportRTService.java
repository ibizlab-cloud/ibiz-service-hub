package net.ibizsys.central.plugin.extension.psmodel.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.domain.Page;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionBICube;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionBICubeItemType;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionScopeType;
import net.ibizsys.central.plugin.extension.psmodel.util.ExtensionUtils;
import net.ibizsys.central.plugin.extension.psmodel.util.IExtensionPSModelRTServiceSession;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.app.bi.IPSAppBICube;
import net.ibizsys.model.app.bi.IPSAppBICubeDimension;
import net.ibizsys.model.app.bi.IPSAppBICubeMeasure;
import net.ibizsys.model.app.bi.IPSAppBIReport;
import net.ibizsys.model.app.bi.IPSAppBIReportDimension;
import net.ibizsys.model.app.bi.IPSAppBIReportMeasure;
import net.ibizsys.model.app.bi.IPSAppBIScheme;
import net.ibizsys.model.app.bi.PSAppBICubeDimensionImpl;
import net.ibizsys.model.app.bi.PSAppBICubeImpl;
import net.ibizsys.model.app.bi.PSAppBICubeMeasureImpl;
import net.ibizsys.model.app.bi.PSAppBIReportDimensionImpl;
import net.ibizsys.model.app.bi.PSAppBIReportMeasureImpl;
import net.ibizsys.model.bi.IPSSysBIReport;
import net.ibizsys.model.bi.IPSSysBIScheme;
import net.ibizsys.model.util.PSModelMergeUtils;
import net.ibizsys.psmodel.core.domain.PSSysBICube;
import net.ibizsys.psmodel.core.domain.PSSysBICubeDimension;
import net.ibizsys.psmodel.core.domain.PSSysBIReport;
import net.ibizsys.psmodel.core.filter.PSSysBIReportFilter;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.IPSModelRTService;
import net.ibizsys.runtime.util.JsonUtils;

public class PSSysBIReportRTService extends net.ibizsys.psmodel.runtime.service.PSSysBIReportRTService {

	private static final Log log = LogFactory.getLog(PSSysBIReportRTService.class);

	/**
	 * 行为：应用指定扩展智能报表立方体维度
	 */
	final public static String METHOD_APPLY = "APPLY";

	/**
	 * 行为：编译应用智能报表
	 */
	final public static String METHOD_COMPILEAPPBIREPORT = "COMPILEAPPBIREPORT";

	@Override
	protected Object doInvoke(String methodName, String key, Object params) throws Exception {

		if (METHOD_APPLY.equalsIgnoreCase(methodName)) {
			PSSysBIReport domain = this.getDomain(params);
			if (StringUtils.hasLength(key)) {
				domain.setId(key);
			}
			return this.apply(domain);
		}

		if (METHOD_COMPILEAPPBIREPORT.equalsIgnoreCase(methodName)) {
			PSSysBIReport domain = this.getDomain(params);
//			if (StringUtils.hasLength(key)) {
//				if(!key.equalsIgnoreCase("__UNKNOWN__")) {
//					domain.setId(key);
//				}
//			}
			return this.compileAppDEReportModel(domain);
		}

		return super.doInvoke(methodName, key, params);
	}

	@Override
	protected PSSysBIReport doGet(String key, boolean tryMode) throws Exception {
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
		if (StringUtils.hasLength(iExtensionPSModelRTServiceSession.getExtensionId())) {
			String strPSSysBISchemeId = getParentId(key);
			String strScopeTag = null;
			if(strPSSysBISchemeId.indexOf("@") != -1) {
				String[] items = strPSSysBISchemeId.split("[@]");
				if(items.length == 2) {
					strScopeTag = items[0];
					strPSSysBISchemeId = items[1];
				}
			}

			SearchContextDTO searchContextDTO = new SearchContextDTO();
			searchContextDTO.all();

			if(StringUtils.hasLength(strScopeTag)) {
				searchContextDTO.eq(V2SystemExtensionBICube.FIELD_SCOPE_TYPE, V2SystemExtensionScopeType.DATA.value);
				searchContextDTO.eq(V2SystemExtensionBICube.FIELD_SCOPE_TAG, strScopeTag);
			}
			else {
				searchContextDTO.eq(V2SystemExtensionBICube.FIELD_SCOPE_TYPE, V2SystemExtensionScopeType.BICUBE.value);
			}

			searchContextDTO.eq(V2SystemExtensionBICube.FIELD_BI_SCHEME_TAG, strPSSysBISchemeId);
			searchContextDTO.eq(V2SystemExtensionBICube.FIELD_ITEM_TAG, key);
			searchContextDTO.eq(V2SystemExtensionBICube.FIELD_TYPE, V2SystemExtensionBICubeItemType.BIREPORT.value);

			Page<V2SystemExtensionBICube> page = iExtensionPSModelRTServiceSession.getCloudExtensionClient().fetchSystemExtensionBICubes(iExtensionPSModelRTServiceSession.getExtensionId(), searchContextDTO);
			if (!ObjectUtils.isEmpty(page) && !ObjectUtils.isEmpty(page.getContent())) {
				List<PSSysBIReport> psSysBIReportList = ExtensionUtils.toPSModelList(page.getContent(), V2SystemExtensionBICube.FIELD_ITEM_TAG, PSSysBIReport.class);
				if (!ObjectUtils.isEmpty(psSysBIReportList)) {
					return psSysBIReportList.get(0);
				}
			}
		}
		return super.doGet(key, tryMode);
	}

	@Override
	protected void onBeforeCreate(PSSysBIReport m) throws Exception {
		String strPSSysBISchemeId = m.getPSSysBISchemeId();
		if(StringUtils.hasLength(strPSSysBISchemeId) && strPSSysBISchemeId.indexOf("@")!=-1) {
			m.setPSSysBISchemeId(strPSSysBISchemeId.split("[@]")[1]);
		}
		super.onBeforeCreate(m);
		if(StringUtils.hasLength(strPSSysBISchemeId) && strPSSysBISchemeId.indexOf("@")!=-1) {
			m.setPSSysBIReportId(String.format("%1$s@%2$s", strPSSysBISchemeId.split("[@]")[0], m.getPSSysBIReportId()));
		}
	}


	@Override
	protected void doCreate(PSSysBIReport m) throws Exception {

		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
		if (!StringUtils.hasLength(iExtensionPSModelRTServiceSession.getExtensionId())) {
			throw new Exception("未支持扩展");
		}

		String strPSSysBIReportId = m.getId();
		String strPSSysBISchemeId = m.getPSSysBISchemeId();
		String strScopeTag = null;
		if(strPSSysBIReportId.indexOf("@") != -1) {
			String[] items = strPSSysBIReportId.split("[@]");
			if(items.length == 2) {
				strScopeTag = items[0];
				strPSSysBISchemeId = getParentId(items[1]);
			}
		}

		PSSysBICube psSysBICube = (PSSysBICube) this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSSYSBICUBE, m.getPSSysBICubeId());


		V2SystemExtensionBICube v2SystemExtensionBICube = new V2SystemExtensionBICube();
		if(StringUtils.hasLength(strScopeTag)) {
			v2SystemExtensionBICube.setScopeType(V2SystemExtensionScopeType.DATA.value);
			v2SystemExtensionBICube.setScopeTag(strScopeTag);
		}
		else {
			v2SystemExtensionBICube.setScopeType(V2SystemExtensionScopeType.BICUBE.value);
			v2SystemExtensionBICube.setScopeTag(m.getPSSysBICubeId());
		}

		v2SystemExtensionBICube.setBICubeTag(m.getPSSysBICubeId());
		v2SystemExtensionBICube.setBISchemeTag(strPSSysBISchemeId);
		v2SystemExtensionBICube.setItemTag(m.getId());
		v2SystemExtensionBICube.setType(V2SystemExtensionBICubeItemType.BIREPORT.value);
		v2SystemExtensionBICube.setPendingExtensionModel(ExtensionUtils.toExtensionModel(m));
		v2SystemExtensionBICube.setApplyFlag(0);

		String strPSDynaInstId = iExtensionPSModelRTServiceSession.getCloudExtensionClient().createSystemExtensionBICube(iExtensionPSModelRTServiceSession.getExtensionId(), v2SystemExtensionBICube).getId();

		m.set("applyflag", 0);

		if (!StringUtils.hasLength(strPSDynaInstId)) {
			return;
		}

		ObjectNode objectNode = iExtensionPSModelRTServiceSession.getPSModelTranspiler(IPSSysBIReport.class, false).compile(iExtensionPSModelRTServiceSession, m, null);

		IPSModelRTService iPSSysBISchemeService = (IPSModelRTService) this.getPSModelRTServiceSession().getPSModelService(PSModels.PSSYSBISCHEME);
		IPSSysBIScheme iPSSysBIScheme = (IPSSysBIScheme) iPSSysBISchemeService.getPSModelObject(strPSSysBISchemeId, IPSSysBIScheme.class, false);
		IPSSysBIReport iPSSysBIReport = iExtensionPSModelRTServiceSession.getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime) iPSSysBIScheme, IPSSysBIReport.class, objectNode);
		// 验证模型
		PSModelMergeUtils.verify(iPSSysBIReport, true);

		// 获取当前模型

		V2SystemExtensionBICube v2SystemExtensionBICube2 = new V2SystemExtensionBICube();
		v2SystemExtensionBICube2.setExtensionModel(ExtensionUtils.toExtensionModel(m));
		v2SystemExtensionBICube2.setRuntimeModel(JsonUtils.toString(objectNode));
		v2SystemExtensionBICube2.setPendingExtensionModel(null);
		v2SystemExtensionBICube2.setApplyFlag(1);

		iExtensionPSModelRTServiceSession.getCloudExtensionClient().updateSystemExtensionBICube(iExtensionPSModelRTServiceSession.getExtensionId(), strPSDynaInstId, v2SystemExtensionBICube2);

		m.set("applyflag", 1);

	}

	@Override
	protected List<PSSysBIReport> getDomainList(String strDataSetName, PSSysBIReportFilter f) throws Exception {
		
		Object objPSSysBICubeId = f.getFieldCond(PSSysBICubeDimension.FIELD_PSSYSBICUBEID, IPSModelFilter.EQ);
		String strPSSysBICubeId = null;
		if(!ObjectUtils.isEmpty(objPSSysBICubeId)) {
			strPSSysBICubeId = objPSSysBICubeId.toString();
			if(strPSSysBICubeId.indexOf("@") != -1) {
				String[] items = strPSSysBICubeId.split("[@]");
				f.setFieldCond(PSSysBICubeDimension.FIELD_PSSYSBICUBEID, IPSModelFilter.EQ, items[1]);
			}
		}
		
		List<PSSysBIReport> list = super.getDomainList(strDataSetName, f);
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
		if (!StringUtils.hasLength(iExtensionPSModelRTServiceSession.getExtensionId())) {
			return list;
		}

		if(ObjectUtils.isEmpty(strPSSysBICubeId)) {
			return list;
		}

		if (true) {
			SearchContextDTO searchContextDTO = new SearchContextDTO();
			searchContextDTO.all();

			searchContextDTO.eq(V2SystemExtensionBICube.FIELD_TYPE, V2SystemExtensionBICubeItemType.BIREPORT.value);
			if(strPSSysBICubeId.indexOf("@") == -1) {
				searchContextDTO.eq(V2SystemExtensionBICube.FIELD_SCOPE_TYPE, V2SystemExtensionScopeType.BICUBE.value);
				searchContextDTO.eq(V2SystemExtensionBICube.FIELD_BI_CUBE_TAG, strPSSysBICubeId);
			}
			else {
				String[] items = strPSSysBICubeId.split("[@]");
				searchContextDTO.eq(V2SystemExtensionBICube.FIELD_SCOPE_TYPE, V2SystemExtensionScopeType.DATA.value);
				searchContextDTO.eq(V2SystemExtensionBICube.FIELD_SCOPE_TAG, items[0]);
				searchContextDTO.eq(V2SystemExtensionBICube.FIELD_BI_CUBE_TAG, items[1]);
				f.setFieldCond(PSSysBICubeDimension.FIELD_PSSYSBICUBEID, IPSModelFilter.EQ, items[1]);
			}


			Page<V2SystemExtensionBICube> page = iExtensionPSModelRTServiceSession.getCloudExtensionClient().fetchSystemExtensionBICubes(iExtensionPSModelRTServiceSession.getExtensionId(), searchContextDTO);
			if (!ObjectUtils.isEmpty(page) && !ObjectUtils.isEmpty(page.getContent())) {
				List<PSSysBIReport> psSysBIReportList = ExtensionUtils.toPSModelList(page.getContent(), V2SystemExtensionBICube.FIELD_ITEM_TAG, PSSysBIReport.class);
				list = ExtensionUtils.replacePSModelList(list, psSysBIReportList, PSSysBIReport.class);
			}
		}
		return this.filterDomainList(list, strDataSetName, f);
	}

	@Override
	protected PSSysBIReport getLast(PSSysBIReport m) throws Exception {
		return this.get(m.getId(), false);
	}

	@Override
	protected void doMergeLast(PSSysBIReport m, PSSysBIReport last) throws Exception {
//		m.resetPSSysBICubeId();
//		m.resetPSSysBICubeName();
		m.resetCodeName();
		m.reset("psdynainstid");
		super.doMergeLast(m, last);
	}

	@Override
	protected void doUpdate(PSSysBIReport m) throws Exception {

		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
		if (!StringUtils.hasLength(iExtensionPSModelRTServiceSession.getExtensionId())) {
			throw new Exception("未支持扩展");
		}
		String strPSDynaInstId = (String) m.get("psdynainstid");

		V2SystemExtensionBICube v2SystemExtensionBICube = new V2SystemExtensionBICube();
		v2SystemExtensionBICube.setPendingExtensionModel(ExtensionUtils.toExtensionModel(m));
		v2SystemExtensionBICube.setBICubeTag(m.getPSSysBICubeId());
		v2SystemExtensionBICube.setApplyFlag(0);

		iExtensionPSModelRTServiceSession.getCloudExtensionClient().updateSystemExtensionBICube(iExtensionPSModelRTServiceSession.getExtensionId(), strPSDynaInstId, v2SystemExtensionBICube);
		m.set("applyflag", 0);

		if (!StringUtils.hasLength(strPSDynaInstId)) {
			return;
		}

		String strPSSysBISchemeId = getParentId(m.getId());
		if(strPSSysBISchemeId.indexOf("@") != -1) {
			strPSSysBISchemeId = strPSSysBISchemeId.split("[@]")[1];
		}

		ObjectNode objectNode = iExtensionPSModelRTServiceSession.getPSModelTranspiler(IPSSysBIReport.class, false).compile(iExtensionPSModelRTServiceSession, m, null);

		IPSModelRTService iPSSysBISchemeService = (IPSModelRTService) this.getPSModelRTServiceSession().getPSModelService(PSModels.PSSYSBISCHEME);
		IPSSysBIScheme iPSSysBIScheme = (IPSSysBIScheme) iPSSysBISchemeService.getPSModelObject(strPSSysBISchemeId, IPSSysBIScheme.class, false);
		IPSSysBIReport iPSSysBIReport = iExtensionPSModelRTServiceSession.getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime) iPSSysBIScheme, IPSSysBIReport.class, objectNode);

		// 此处代码有问题扩展属性应该不支持

		// 验证模型
		// PSModelMergeUtils.verify(iPSSysBIReport, true);

		// 获取当前模型

		V2SystemExtensionBICube v2SystemExtensionBICube2 = new V2SystemExtensionBICube();
		v2SystemExtensionBICube2.setExtensionModel(ExtensionUtils.toExtensionModel(m));
		v2SystemExtensionBICube2.setRuntimeModel(JsonUtils.toString(objectNode));
		v2SystemExtensionBICube2.setPendingExtensionModel(null);
		v2SystemExtensionBICube2.setApplyFlag(1);

		iExtensionPSModelRTServiceSession.getCloudExtensionClient().updateSystemExtensionBICube(iExtensionPSModelRTServiceSession.getExtensionId(), strPSDynaInstId, v2SystemExtensionBICube2);

		m.set("applyflag", 1);
	}

	public Object apply(PSSysBIReport m) throws Exception {
		return this.doApply(m);
	}

	protected Object doApply(PSSysBIReport m) throws Exception {

		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
		String strExtensionId = iExtensionPSModelRTServiceSession.getExtensionIdMust();
		PSSysBIReport psSysBIReport = this.get(m.getId(), false);
		String strPSDynaInstId = (String) psSysBIReport.get("psdynainstid");
		if (!StringUtils.hasLength(strPSDynaInstId)) {
			throw new Exception("无法应用非动态扩展智能报表");
		}

		String strPSSysBISchemeId = getParentId(m.getId());
		if(strPSSysBISchemeId.indexOf("@") != -1) {
			strPSSysBISchemeId = strPSSysBISchemeId.split("[@]")[1];
		}

		ObjectNode objectNode = iExtensionPSModelRTServiceSession.getPSModelTranspiler(IPSSysBIReport.class, false).compile(iExtensionPSModelRTServiceSession, psSysBIReport, null);

		IPSModelRTService iPSSysBISchemeService = (IPSModelRTService) this.getPSModelRTServiceSession().getPSModelService(PSModels.PSSYSBISCHEME);
		IPSSysBIScheme iPSSysBIScheme = (IPSSysBIScheme) iPSSysBISchemeService.getPSModelObject(strPSSysBISchemeId, IPSSysBIScheme.class, false);
		IPSSysBIReport iPSSysBIReport = iExtensionPSModelRTServiceSession.getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime) iPSSysBIScheme, IPSSysBIReport.class, objectNode);
		// 验证模型
		PSModelMergeUtils.verify(iPSSysBIReport, true);

		// 获取当前模型
		// V2SystemExtensionBICube lastV2SystemExtensionBICube =
		// iExtensionPSModelRTServiceSession.getCloudExtensionClient().getSystemExtensionBICube(iExtensionPSModelRTServiceSession.getExtensionId(),
		// strPSDynaInstId);

		V2SystemExtensionBICube v2SystemExtensionBICube = new V2SystemExtensionBICube();
		v2SystemExtensionBICube.setExtensionModel(ExtensionUtils.toExtensionModel(psSysBIReport));
		v2SystemExtensionBICube.setRuntimeModel(JsonUtils.toString(objectNode));
		v2SystemExtensionBICube.setPendingExtensionModel(null);
		v2SystemExtensionBICube.setApplyFlag(1);

		iExtensionPSModelRTServiceSession.getCloudExtensionClient().updateSystemExtensionBICube(iExtensionPSModelRTServiceSession.getExtensionId(), strPSDynaInstId, v2SystemExtensionBICube);

		ExtensionUtils.notifySystemExtensionChanged(strExtensionId, null);
		return null;
	}

	@Override
	protected void doRemove(PSSysBIReport m) throws Exception {
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
		String strExtensionId = iExtensionPSModelRTServiceSession.getExtensionIdMust();
		PSSysBIReport psSysBIReport = this.get(m.getId(), false);
		String strPSDynaInstId = (String) psSysBIReport.get("psdynainstid");
		if (!StringUtils.hasLength(strPSDynaInstId)) {
			throw new Exception("无法删除非动态扩展报表");
		}

		iExtensionPSModelRTServiceSession.getCloudExtensionClient().removeSystemExtensionBICube(strExtensionId, strPSDynaInstId);
		super.doRemove(m);
	}

	public Object compileAppDEReportModel(PSSysBIReport m) throws Exception {
		return this.doCompileAppDEReportModel(m);
	}

	protected Object doCompileAppDEReportModel(PSSysBIReport m) throws Exception {

		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();

		if (!StringUtils.hasLength(m.getPSSysBISchemeId())) {
			throw new Exception("未指定智能报表体系标识");
		}

		String strPSSysBISchemeId = m.getPSSysBISchemeId();
		if(strPSSysBISchemeId.indexOf("@") != -1) {
			strPSSysBISchemeId = strPSSysBISchemeId.split("[@]")[1];
		}
		m.setPSSysBISchemeId(strPSSysBISchemeId);

		if (!StringUtils.hasLength(m.getPSSysBICubeId())) {
			throw new Exception("未指定智能报表立方体标识");
		}
		// PSSysBIReport psSysBIReport = this.get(m.getId(), false);
		String strPSSysAppId = (String) m.get("pssysappid");
		if (!StringUtils.hasLength(strPSSysAppId)) {
			throw new Exception("未指定应用标识");
		}

		IPSApplication iPSApplication = ExtensionUtils.getPSApplication(iExtensionPSModelRTServiceSession, iExtensionPSModelRTServiceSession.getPSSystem(), strPSSysAppId, true, true);
		if (iPSApplication == null) {
			throw new Exception(String.format("指定应用标识[%1$s]无效", strPSSysAppId));
		}
		IPSAppBIScheme iPSAppBIScheme = null;
		List<IPSAppBIScheme> psAppBISchemes = iPSApplication.getAllPSAppBISchemes();
		if (!ObjectUtils.isEmpty(psAppBISchemes)) {
			for (IPSAppBIScheme item : psAppBISchemes) {
				String strBISchemeId = item.getUniqueTag().replace("__", ".");
				if (m.getPSSysBISchemeId().equalsIgnoreCase(strBISchemeId)) {
					iPSAppBIScheme = item;
					break;
				}
			}
		}

		if (iPSAppBIScheme == null) {
			throw new Exception(String.format("指定智能报表体系标识[%1$s]无效", m.getPSSysBISchemeId()));
		}

		IPSAppBICube iPSAppBICube = iPSAppBIScheme.getPSAppBICube(PSModelUtils.getSimpleId(m.getPSSysBICubeId()), true);
		if (iPSAppBICube == null) {
			throw new Exception(String.format("指定智能报表立方体标识[%1$s]无效", m.getPSSysBICubeId()));
		}

		SearchContextDTO searchContextDTO = new SearchContextDTO();
		searchContextDTO.all().count(false);
		//
		// //全部查询报表相关（需要其它数据进行模型补充）
		//searchContextDTO.eq(V2SystemExtensionBICube.FIELD_SCOPE_TYPE, V2SystemExtensionScopeType.BICUBE.value);
		searchContextDTO.nn(V2SystemExtensionBICube.FIELD_RUNTIME_MODEL);
		searchContextDTO.eq(V2SystemExtensionBICube.FIELD_BI_CUBE_TAG, m.getPSSysBICubeId());
		searchContextDTO.eq(V2SystemExtensionBICube.FIELD_BI_SCHEME_TAG, m.getPSSysBISchemeId());
		// searchContextDTO.eq(V2SystemExtensionBICube.FIELD_TYPE,
		// V2SystemExtensionBICubeItemType.BIREPORT.value);

		Map<String, V2SystemExtensionBICube> v2SystemExtensionBICubeMap = new HashMap<String, V2SystemExtensionBICube>();
		Page<V2SystemExtensionBICube> all = iExtensionPSModelRTServiceSession.getCloudExtensionClient().fetchSystemExtensionBICubes(iExtensionPSModelRTServiceSession.getExtensionId(), searchContextDTO);
		if (!ObjectUtils.isEmpty(all)) {
			// List<PSSysBIReport> psSysBIReportList =
			// ExtensionUtils.toPSModelList(page.getContent(),
			// V2SystemExtensionBICube.FIELD_ITEM_TAG, PSSysBIReport.class);
			// list = ExtensionUtils.replacePSModelList(list, psSysBIReportList,
			// PSSysBIReport.class);
			// 提取维度和指标

			for (V2SystemExtensionBICube v2SystemExtensionBICube : all) {
				if (!StringUtils.hasLength(v2SystemExtensionBICube.getItemTag()) || !StringUtils.hasLength(v2SystemExtensionBICube.getRuntimeModel())) {
					continue;
				}
				if (V2SystemExtensionBICubeItemType.MEASURE.value.equals(v2SystemExtensionBICube.getType()) || V2SystemExtensionBICubeItemType.DIMENSION.value.equals(v2SystemExtensionBICube.getType())) {
					v2SystemExtensionBICubeMap.put(v2SystemExtensionBICube.getItemTag(), v2SystemExtensionBICube);
				}
			}
		}

		ObjectNode objectNode = iExtensionPSModelRTServiceSession.getPSModelTranspiler(IPSAppBIReport.class, false).compile(iExtensionPSModelRTServiceSession, m, null);

		IPSAppBIReport iPSAppBIReport = iExtensionPSModelRTServiceSession.getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime)iPSAppBIScheme, IPSAppBIReport.class, objectNode);
		// 进一步填充
		List<IPSAppBIReportDimension> psAppBIReportDimensionList = iPSAppBIReport.getPSAppBIReportDimensions();
		if (!ObjectUtils.isEmpty(psAppBIReportDimensionList)) {
			for (IPSAppBIReportDimension item : psAppBIReportDimensionList) {
				// 获取相关维度
				String strTag = item.getDimensionTag();
				if (!StringUtils.hasLength(strTag)) {
					continue;
				}

				IPSAppBICubeDimension iPSAppBICubeDimension = iPSAppBICube.getPSAppBICubeDimension(strTag, true);
				if (iPSAppBICubeDimension == null) {
					V2SystemExtensionBICube dimension = v2SystemExtensionBICubeMap.get(String.format("%1$s.%2$s", m.getPSSysBICubeId(), strTag));
					if (dimension != null) {
						iPSAppBICubeDimension = iExtensionPSModelRTServiceSession.getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime) iPSAppBICube, IPSAppBICubeDimension.class, JsonUtils.toObjectNode(dimension.getRuntimeModel()));
					}
				}
				if (iPSAppBICubeDimension == null) {
					log.error(String.format("无法获取应用智能报表立方体维度[%1$s.%2$s]", m.getPSSysBICubeId(), strTag));
					continue;
				}

				item.getObjectNode().put(PSAppBIReportDimensionImpl.ATTR_GETDIMENSIONTYPE, iPSAppBICubeDimension.getObjectNode().get(PSAppBICubeDimensionImpl.ATTR_GETDIMENSIONTYPE));
				if (iPSAppBICubeDimension.getObjectNode().has(PSAppBICubeDimensionImpl.ATTR_GETPSAPPCODELIST)) {
					item.getObjectNode().put(PSAppBIReportDimensionImpl.ATTR_GETPSAPPCODELIST, iPSAppBICubeDimension.getObjectNode().get(PSAppBICubeDimensionImpl.ATTR_GETPSAPPCODELIST).deepCopy());
				}

				if (iPSAppBICubeDimension.getObjectNode().has(PSAppBICubeDimensionImpl.ATTR_GETPSAPPDEFIELD)) {
					item.getObjectNode().put(PSAppBIReportDimensionImpl.ATTR_GETPSAPPDEFIELD, iPSAppBICubeDimension.getObjectNode().get(PSAppBICubeDimensionImpl.ATTR_GETPSAPPDEFIELD).deepCopy());
				}
				if(iPSAppBICubeDimension.getObjectNode().has(PSAppBICubeDimensionImpl.ATTR_GETTEXTPSAPPDEFIELD)) {
					item.getObjectNode().put(PSAppBIReportDimensionImpl.ATTR_GETTEXTPSAPPDEFIELD, iPSAppBICubeDimension.getObjectNode().get(PSAppBICubeDimensionImpl.ATTR_GETTEXTPSAPPDEFIELD).deepCopy());
				}
				if (iPSAppBICubeDimension.getObjectNode().has(PSAppBICubeDimensionImpl.ATTR_GETDIMENSIONFORMULA)) {
					item.getObjectNode().put(PSAppBIReportDimensionImpl.ATTR_GETDIMENSIONFORMULA, iPSAppBICubeDimension.getObjectNode().get(PSAppBICubeDimensionImpl.ATTR_GETDIMENSIONFORMULA).deepCopy());
				}

				if (iPSAppBICubeDimension.getObjectNode().has(PSAppBICubeDimensionImpl.ATTR_GETNAME)) {
					item.getObjectNode().put(PSAppBIReportDimensionImpl.ATTR_GETDIMENSIONNAME, iPSAppBICubeDimension.getObjectNode().get(PSAppBICubeDimensionImpl.ATTR_GETNAME).deepCopy());
				}

				if (iPSAppBICubeDimension.getObjectNode().has(PSAppBICubeDimensionImpl.ATTR_GETTEXTTEMPLATE)) {
					item.getObjectNode().put(PSAppBIReportDimensionImpl.ATTR_GETTEXTTEMPLATE, iPSAppBICubeDimension.getObjectNode().get(PSAppBICubeDimensionImpl.ATTR_GETTEXTTEMPLATE).deepCopy());
				}

				if (iPSAppBICubeDimension.getObjectNode().has(PSAppBICubeDimensionImpl.ATTR_GETTIPTEMPLATE)) {
					item.getObjectNode().put(PSAppBIReportDimensionImpl.ATTR_GETTIPTEMPLATE, iPSAppBICubeDimension.getObjectNode().get(PSAppBICubeDimensionImpl.ATTR_GETTIPTEMPLATE).deepCopy());
				}

				if (iPSAppBICubeDimension.getObjectNode().has(PSAppBICubeDimensionImpl.ATTR_GETSTDDATATYPE)) {
					item.getObjectNode().put(PSAppBIReportDimensionImpl.ATTR_GETSTDDATATYPE, iPSAppBICubeDimension.getObjectNode().get(PSAppBICubeDimensionImpl.ATTR_GETSTDDATATYPE).deepCopy());
				}
			}
		}

		List<IPSAppBIReportMeasure> psAppBIReportMeasureList = iPSAppBIReport.getPSAppBIReportMeasures();
		if (!ObjectUtils.isEmpty(psAppBIReportMeasureList)) {
			for (IPSAppBIReportMeasure item : psAppBIReportMeasureList) {
				// 获取相关指标
				String strTag = item.getMeasureTag();
				if (!StringUtils.hasLength(strTag)) {
					continue;
				}

				IPSAppBICubeMeasure iPSAppBICubeMeasure = iPSAppBICube.getPSAppBICubeMeasure(strTag, true);
				if (iPSAppBICubeMeasure == null) {
					V2SystemExtensionBICube Measure = v2SystemExtensionBICubeMap.get(String.format("%1$s.%2$s", m.getPSSysBICubeId(), strTag));
					if (Measure != null) {
						iPSAppBICubeMeasure = iExtensionPSModelRTServiceSession.getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime) iPSAppBICube, IPSAppBICubeMeasure.class, JsonUtils.toObjectNode(Measure.getRuntimeModel()));
					}
				}
				if (iPSAppBICubeMeasure == null) {
					log.error(String.format("无法获取应用智能报表立方体指标[%1$s.%2$s]", m.getPSSysBICubeId(), strTag));
					continue;
				}

				item.getObjectNode().put(PSAppBIReportMeasureImpl.ATTR_GETMEASURETYPE, iPSAppBICubeMeasure.getObjectNode().get(PSAppBICubeMeasureImpl.ATTR_GETMEASURETYPE));
				if (iPSAppBICubeMeasure.getObjectNode().has(PSAppBICubeMeasureImpl.ATTR_GETPSAPPCODELIST)) {
					item.getObjectNode().put(PSAppBIReportMeasureImpl.ATTR_GETPSAPPCODELIST, iPSAppBICubeMeasure.getObjectNode().get(PSAppBICubeMeasureImpl.ATTR_GETPSAPPCODELIST).deepCopy());
				}
				if(iPSAppBICubeMeasure.getObjectNode().has(PSAppBICubeMeasureImpl.ATTR_GETDRILLDOWNPSAPPVIEW)) {
					item.getObjectNode().put(PSAppBIReportMeasureImpl.ATTR_GETDRILLDOWNPSAPPVIEW, iPSAppBICubeMeasure.getObjectNode().get(PSAppBICubeMeasureImpl.ATTR_GETDRILLDOWNPSAPPVIEW).deepCopy());
				}
				if(iPSAppBICubeMeasure.getObjectNode().has(PSAppBICubeMeasureImpl.ATTR_GETDRILLDETAILPSAPPVIEW)) {
					item.getObjectNode().put(PSAppBIReportMeasureImpl.ATTR_GETDRILLDETAILPSAPPVIEW, iPSAppBICubeMeasure.getObjectNode().get(PSAppBICubeMeasureImpl.ATTR_GETDRILLDETAILPSAPPVIEW).deepCopy());
				}
				else
				if(iPSAppBICube.getObjectNode().has(PSAppBICubeImpl.ATTR_GETDRILLDETAILPSAPPVIEW)) {
					item.getObjectNode().put(PSAppBIReportMeasureImpl.ATTR_GETDRILLDETAILPSAPPVIEW, iPSAppBICube.getObjectNode().get(PSAppBICubeImpl.ATTR_GETDRILLDETAILPSAPPVIEW).deepCopy());
				}

				if (iPSAppBICubeMeasure.getObjectNode().has(PSAppBICubeMeasureImpl.ATTR_GETPSAPPDEFIELD)) {
					item.getObjectNode().put(PSAppBIReportMeasureImpl.ATTR_GETPSAPPDEFIELD, iPSAppBICubeMeasure.getObjectNode().get(PSAppBICubeMeasureImpl.ATTR_GETPSAPPDEFIELD).deepCopy());
				}
				if (iPSAppBICubeMeasure.getObjectNode().has(PSAppBICubeMeasureImpl.ATTR_GETMEASUREFORMULA)) {
					item.getObjectNode().put(PSAppBIReportMeasureImpl.ATTR_GETMEASUREFORMULA, iPSAppBICubeMeasure.getObjectNode().get(PSAppBICubeMeasureImpl.ATTR_GETMEASUREFORMULA).deepCopy());
				}
				if (iPSAppBICubeMeasure.getObjectNode().has(PSAppBICubeMeasureImpl.ATTR_GETMEASUREGROUP)) {
					item.getObjectNode().put(PSAppBIReportMeasureImpl.ATTR_GETMEASUREGROUP, iPSAppBICubeMeasure.getObjectNode().get(PSAppBICubeMeasureImpl.ATTR_GETMEASUREGROUP).deepCopy());
				}
				if (iPSAppBICubeMeasure.getObjectNode().has(PSAppBICubeMeasureImpl.ATTR_GETJSONFORMAT)) {
					item.getObjectNode().put(PSAppBIReportMeasureImpl.ATTR_GETJSONFORMAT, iPSAppBICubeMeasure.getObjectNode().get(PSAppBICubeMeasureImpl.ATTR_GETJSONFORMAT).deepCopy());
				}

				if (iPSAppBICubeMeasure.getObjectNode().has(PSAppBICubeMeasureImpl.ATTR_GETNAME)) {
					item.getObjectNode().put(PSAppBIReportMeasureImpl.ATTR_GETMEASURENAME, iPSAppBICubeMeasure.getObjectNode().get(PSAppBICubeMeasureImpl.ATTR_GETNAME).deepCopy());
				}

				if (iPSAppBICubeMeasure.getObjectNode().has(PSAppBICubeMeasureImpl.ATTR_GETTEXTTEMPLATE)) {
					item.getObjectNode().put(PSAppBIReportMeasureImpl.ATTR_GETTEXTTEMPLATE, iPSAppBICubeMeasure.getObjectNode().get(PSAppBICubeMeasureImpl.ATTR_GETTEXTTEMPLATE).deepCopy());
				}

				if (iPSAppBICubeMeasure.getObjectNode().has(PSAppBICubeMeasureImpl.ATTR_GETTIPTEMPLATE)) {
					item.getObjectNode().put(PSAppBIReportMeasureImpl.ATTR_GETTIPTEMPLATE, iPSAppBICubeMeasure.getObjectNode().get(PSAppBICubeMeasureImpl.ATTR_GETTIPTEMPLATE).deepCopy());
				}

				if (iPSAppBICubeMeasure.getObjectNode().has(PSAppBICubeMeasureImpl.ATTR_GETSTDDATATYPE)) {
					item.getObjectNode().put(PSAppBIReportMeasureImpl.ATTR_GETSTDDATATYPE, iPSAppBICubeMeasure.getObjectNode().get(PSAppBICubeMeasureImpl.ATTR_GETSTDDATATYPE).deepCopy());
				}
			}
		}

		return JsonUtils.asMap(objectNode);
		//return objectNode.toString();
	}
}
