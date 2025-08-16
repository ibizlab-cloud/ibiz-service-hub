package net.ibizsys.central.plugin.extension.psmodel.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.domain.Page;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionField;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionScopeType;
import net.ibizsys.central.plugin.extension.psmodel.util.ExtensionUtils;
import net.ibizsys.central.plugin.extension.psmodel.util.IExtensionPSModelRTServiceSession;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.PSModelEnums.DEFType;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.util.PSModelMergeUtils;
import net.ibizsys.psmodel.core.domain.PSDEField;
import net.ibizsys.psmodel.core.domain.PSDataEntity;
import net.ibizsys.psmodel.core.filter.PSDEFieldFilter;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.IPSModelRTService;
import net.ibizsys.runtime.util.JsonUtils;

public class PSDEFieldRTService extends net.ibizsys.psmodel.runtime.service.PSDEFieldRTService {

	private static final Log log = LogFactory.getLog(PSDEFieldRTService.class);

	/**
	 * 行为：应用指定扩展属性
	 */
	final public static String METHOD_APPLY = "APPLY";

	@Override
	protected Object doInvoke(String methodName, String key, Object params) throws Exception {

		if(METHOD_APPLY.equalsIgnoreCase(methodName)) {
			PSDEField domain = this.getDomain(params);
			return this.apply(domain);
		}


		return super.doInvoke(methodName, key, params);
	}

	@Override
	protected PSDEField doGet(String key, boolean tryMode) throws Exception {
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession)this.getPSModelRTServiceSession();
		if(StringUtils.hasLength(iExtensionPSModelRTServiceSession.getExtensionId())) {
			String strPSDEId = getParentId(key);

			SearchContextDTO searchContextDTO = new SearchContextDTO();
			searchContextDTO.all();

			if(strPSDEId.indexOf("@") == -1) {
				searchContextDTO.eq(V2SystemExtensionField.FIELD_SCOPE_TYPE, V2SystemExtensionScopeType.DATAENTITY.value);
				searchContextDTO.eq(V2SystemExtensionField.FIELD_DATA_ENTITY_TAG, strPSDEId);
			}
			else {
				searchContextDTO.eq(V2SystemExtensionField.FIELD_SCOPE_TYPE, V2SystemExtensionScopeType.DATA.value);
				searchContextDTO.eq(V2SystemExtensionField.FIELD_DATA_ENTITY_TAG, strPSDEId.split("[@]")[1]);
			}
			searchContextDTO.eq(V2SystemExtensionField.FIELD_SCOPE_TAG, strPSDEId);
			searchContextDTO.eq(V2SystemExtensionField.FIELD_FIELD_TAG, key);

			Page<V2SystemExtensionField> page = iExtensionPSModelRTServiceSession.getCloudExtensionClient().fetchSystemExtensionFields(iExtensionPSModelRTServiceSession.getExtensionId(), searchContextDTO);
			if(!ObjectUtils.isEmpty(page) && !ObjectUtils.isEmpty(page.getContent())) {
				List<PSDEField> psDEFieldList = ExtensionUtils.toPSModelList(page.getContent(), V2SystemExtensionField.FIELD_FIELD_TAG, PSDEField.class);
				if(!ObjectUtils.isEmpty(psDEFieldList)) {
					return psDEFieldList.get(0);
				}
			}


		}
		return super.doGet(key, tryMode);
	}

	@Override
	protected void doCreate(PSDEField m) throws Exception {

		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession)this.getPSModelRTServiceSession();
		if(!StringUtils.hasLength(iExtensionPSModelRTServiceSession.getExtensionId())) {
			throw new Exception("未支持扩展");
		}



		PSDataEntity psDataEntity = (PSDataEntity)this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDATAENTITY, m.getPSDEId());

		V2SystemExtensionField v2SystemExtensionField = new V2SystemExtensionField();
		if(m.getPSDEId().indexOf("@") == -1) {
			v2SystemExtensionField.setScopeType(V2SystemExtensionScopeType.DATAENTITY.value);
		}
		else {
			v2SystemExtensionField.setScopeType(V2SystemExtensionScopeType.DATA.value);
		}
		v2SystemExtensionField.setScopeTag(m.getPSDEId());
		v2SystemExtensionField.setFieldTag(m.getId());
		v2SystemExtensionField.setDataEntityTag(psDataEntity.getPSDataEntityId());
		v2SystemExtensionField.setPendingExtensionModel(ExtensionUtils.toExtensionModel(m));
		v2SystemExtensionField.setApplyFlag(0);

		V2SystemExtensionField ret =iExtensionPSModelRTServiceSession.getCloudExtensionClient().createSystemExtensionField(iExtensionPSModelRTServiceSession.getExtensionId(), v2SystemExtensionField);
		String strPSDynaInstId = ret.getId();

		m.set("applyflag", 0);

		if(!StringUtils.hasLength(strPSDynaInstId)) {
			return;
		}


		m.setDEFType(DEFType.DYNASTORAGE.value);

		ObjectNode objectNode = iExtensionPSModelRTServiceSession.getPSModelTranspiler(IPSDEField.class, false).compile(iExtensionPSModelRTServiceSession, m, null);


		IPSModelRTService iPSDataEntityService = (IPSModelRTService)this.getPSModelRTServiceSession().getPSModelService(PSModels.PSDATAENTITY);
		IPSDataEntity iPSDataEntity = (IPSDataEntity)iPSDataEntityService.getPSModelObject(m.getPSDEId(), IPSDataEntity.class, false);
		IPSDEField iPSDEField = iExtensionPSModelRTServiceSession.getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime)iPSDataEntity, IPSDEField.class, objectNode);
		//验证模型
		PSModelMergeUtils.verify(iPSDEField, true);

		//获取当前模型

		V2SystemExtensionField v2SystemExtensionField2 = new V2SystemExtensionField();
		v2SystemExtensionField2.setExtensionModel(ExtensionUtils.toExtensionModel(m));
		v2SystemExtensionField2.setRuntimeModel(JsonUtils.toString(objectNode));
		v2SystemExtensionField2.setPendingExtensionModel(null);
		v2SystemExtensionField2.setApplyFlag(1);

		iExtensionPSModelRTServiceSession.getCloudExtensionClient().updateSystemExtensionField(iExtensionPSModelRTServiceSession.getExtensionId(), strPSDynaInstId, v2SystemExtensionField2);

		m.set("applyflag", 1);

	}


	@Override
	protected List<PSDEField> getDomainList(String strDataSetName, PSDEFieldFilter f) throws Exception {
		List<PSDEField> list = super.getDomainList(strDataSetName, f);
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession)this.getPSModelRTServiceSession();
		if(!StringUtils.hasLength(iExtensionPSModelRTServiceSession.getExtensionId())) {
			return list;
		}

		Object objPSDEId = f.getFieldCond(PSDEField.FIELD_PSDEID, IPSModelFilter.EQ);
		if(ObjectUtils.isEmpty(objPSDEId)) {
			return list;
		}

		String strPSDEId = objPSDEId.toString();

		if(true) {
			SearchContextDTO searchContextDTO = new SearchContextDTO();
			searchContextDTO.all();

			searchContextDTO.eq(V2SystemExtensionField.FIELD_SCOPE_TYPE, V2SystemExtensionScopeType.DATAENTITY.value);
			if(strPSDEId.indexOf("@") == -1) {
				searchContextDTO.eq(V2SystemExtensionField.FIELD_DATA_ENTITY_TAG, strPSDEId);
				searchContextDTO.eq(V2SystemExtensionField.FIELD_SCOPE_TAG, strPSDEId);
			}
			else {
				searchContextDTO.eq(V2SystemExtensionField.FIELD_DATA_ENTITY_TAG, strPSDEId.split("[@]")[1]);
				searchContextDTO.eq(V2SystemExtensionField.FIELD_SCOPE_TAG, strPSDEId.split("[@]")[1]);
			}
			Page<V2SystemExtensionField> page = iExtensionPSModelRTServiceSession.getCloudExtensionClient().fetchSystemExtensionFields(iExtensionPSModelRTServiceSession.getExtensionId(), searchContextDTO);
			if(!ObjectUtils.isEmpty(page) && !ObjectUtils.isEmpty(page.getContent())) {
				List<PSDEField> psDEFieldList = ExtensionUtils.toPSModelList(page.getContent(), V2SystemExtensionField.FIELD_FIELD_TAG, PSDEField.class);
				list = ExtensionUtils.replacePSModelList(list, psDEFieldList, PSDEField.class);
			}
		}

		if(strPSDEId.indexOf("@") != -1) {
			SearchContextDTO searchContextDTO = new SearchContextDTO();
			searchContextDTO.all();

			searchContextDTO.eq(V2SystemExtensionField.FIELD_SCOPE_TYPE, V2SystemExtensionScopeType.DATA.value);
			searchContextDTO.eq(V2SystemExtensionField.FIELD_DATA_ENTITY_TAG, strPSDEId.split("[@]")[1]);
			searchContextDTO.eq(V2SystemExtensionField.FIELD_SCOPE_TAG, strPSDEId);

			Page<V2SystemExtensionField> page = iExtensionPSModelRTServiceSession.getCloudExtensionClient().fetchSystemExtensionFields(iExtensionPSModelRTServiceSession.getExtensionId(), searchContextDTO);
			if(!ObjectUtils.isEmpty(page) && !ObjectUtils.isEmpty(page.getContent())) {
				List<PSDEField> psDEFieldList = ExtensionUtils.toPSModelList(page.getContent(), V2SystemExtensionField.FIELD_FIELD_TAG, PSDEField.class);
				list = ExtensionUtils.replacePSModelList(list, psDEFieldList, PSDEField.class);
			}
		}

		return this.filterDomainList(list, strDataSetName, f) ;
	}
	@Override
	protected boolean testQueryDomain(PSDEField m,String strQuery) throws Exception {
		if (!StringUtils.hasLength(m.getName())) {
			return false;
		}
		if (m.getName().toUpperCase().indexOf(strQuery) == -1 && m.getLogicName().toUpperCase().indexOf(strQuery) == -1) {
			return false;
		}
		return true;
	}

	@Override
	protected PSDEField getLast(PSDEField m) throws Exception {
		return this.get(m.getId(), false);
	}

	@Override
	protected void doMergeLast(PSDEField m, PSDEField last) throws Exception {
		m.resetPSDEFieldName();
		m.resetPSDEId();
		m.resetPSDEName();
		m.resetCodeName();
		m.reset("psdynainstid");
		super.doMergeLast(m, last);
	}

	@Override
	protected void doUpdate(PSDEField m) throws Exception {

		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession)this.getPSModelRTServiceSession();
		if(!StringUtils.hasLength(iExtensionPSModelRTServiceSession.getExtensionId())) {
			throw new Exception("未支持扩展");
		}
		String strPSDynaInstId = (String)m.get("psdynainstid");

		V2SystemExtensionField v2SystemExtensionField = new V2SystemExtensionField();
		v2SystemExtensionField.setPendingExtensionModel(ExtensionUtils.toExtensionModel(m));
		v2SystemExtensionField.setApplyFlag(0);

		iExtensionPSModelRTServiceSession.getCloudExtensionClient().updateSystemExtensionField(iExtensionPSModelRTServiceSession.getExtensionId(), strPSDynaInstId, v2SystemExtensionField);
		m.set("applyflag", 0);

		if(!StringUtils.hasLength(strPSDynaInstId)) {
			return;
		}


		m.setDEFType(DEFType.DYNASTORAGE.value);

		ObjectNode objectNode = iExtensionPSModelRTServiceSession.getPSModelTranspiler(IPSDEField.class, false).compile(iExtensionPSModelRTServiceSession, m, null);


		IPSModelRTService iPSDataEntityService = (IPSModelRTService)this.getPSModelRTServiceSession().getPSModelService(PSModels.PSDATAENTITY);
		IPSDataEntity iPSDataEntity = (IPSDataEntity)iPSDataEntityService.getPSModelObject(m.getPSDEId(), IPSDataEntity.class, false);
		IPSDEField iPSDEField = iExtensionPSModelRTServiceSession.getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime)iPSDataEntity, IPSDEField.class, objectNode);
		//验证模型
		PSModelMergeUtils.verify(iPSDEField, true);

		//获取当前模型

		V2SystemExtensionField v2SystemExtensionField2 = new V2SystemExtensionField();
		v2SystemExtensionField2.setExtensionModel(ExtensionUtils.toExtensionModel(m));
		v2SystemExtensionField2.setRuntimeModel(JsonUtils.toString(objectNode));
		v2SystemExtensionField2.setPendingExtensionModel(null);
		v2SystemExtensionField2.setApplyFlag(1);

		iExtensionPSModelRTServiceSession.getCloudExtensionClient().updateSystemExtensionField(iExtensionPSModelRTServiceSession.getExtensionId(), strPSDynaInstId, v2SystemExtensionField2);

		m.set("applyflag", 1);
	}


	public Object apply(PSDEField m) throws Exception {
		return this.doApply(m);
	}

	protected Object doApply(PSDEField m) throws Exception {

		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
		String strExtensionId = iExtensionPSModelRTServiceSession.getExtensionIdMust();
		PSDEField psDEField = this.get(m.getId(), false);
		String strPSDynaInstId = (String)psDEField.get("psdynainstid");
		if(!StringUtils.hasLength(strPSDynaInstId)) {
			throw new Exception("无法应用非动态扩展属性");
		}

		m.setDEFType(DEFType.DYNASTORAGE.value);

		ObjectNode objectNode = iExtensionPSModelRTServiceSession.getPSModelTranspiler(IPSDEField.class, false).compile(iExtensionPSModelRTServiceSession, psDEField, null);


		IPSModelRTService iPSDataEntityService = (IPSModelRTService)this.getPSModelRTServiceSession().getPSModelService(PSModels.PSDATAENTITY);
		IPSDataEntity iPSDataEntity = (IPSDataEntity)iPSDataEntityService.getPSModelObject(psDEField.getPSDEId(), IPSDataEntity.class, false);
		IPSDEField iPSDEField = iExtensionPSModelRTServiceSession.getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime)iPSDataEntity, IPSDEField.class, objectNode);
		//验证模型
		PSModelMergeUtils.verify(iPSDEField, true);

		//获取当前模型
		//V2SystemExtensionField lastV2SystemExtensionField = iExtensionPSModelRTServiceSession.getCloudExtensionClient().getSystemExtensionField(iExtensionPSModelRTServiceSession.getExtensionId(), strPSDynaInstId);


		V2SystemExtensionField v2SystemExtensionField = new V2SystemExtensionField();
		v2SystemExtensionField.setExtensionModel(ExtensionUtils.toExtensionModel(psDEField));
		v2SystemExtensionField.setRuntimeModel(JsonUtils.toString(objectNode));
		v2SystemExtensionField.setPendingExtensionModel(null);
		v2SystemExtensionField.setApplyFlag(1);

		iExtensionPSModelRTServiceSession.getCloudExtensionClient().updateSystemExtensionField(iExtensionPSModelRTServiceSession.getExtensionId(), strPSDynaInstId, v2SystemExtensionField);


		//ExtensionUtils.notifySystemExtensionChanged(strExtensionId, null);
		return null;
	}

	@Override
	protected void doRemove(PSDEField m) throws Exception {
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession)this.getPSModelRTServiceSession();
		String strExtensionId = iExtensionPSModelRTServiceSession.getExtensionIdMust();


		String strPSDynaInstId = (String)m.get(ExtensionUtils.FIELD_PSDYNAINSTID);
		if(!StringUtils.hasLength(strPSDynaInstId)
				|| ExtensionUtils.DYNAINSTID_PARENT.equals(strPSDynaInstId)) {
			throw new Exception(String.format("无法删除默认数据"));
		}
		iExtensionPSModelRTServiceSession.getCloudExtensionClient().removeSystemExtensionField(strExtensionId, strPSDynaInstId);
		super.doRemove(m);
	}
}
