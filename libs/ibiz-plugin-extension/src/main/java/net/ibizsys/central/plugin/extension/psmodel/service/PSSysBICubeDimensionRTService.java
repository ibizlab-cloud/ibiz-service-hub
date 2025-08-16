package net.ibizsys.central.plugin.extension.psmodel.service;

import java.util.List;

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
import net.ibizsys.model.bi.IPSSysBICube;
import net.ibizsys.model.bi.IPSSysBICubeDimension;
import net.ibizsys.model.util.PSModelMergeUtils;
import net.ibizsys.psmodel.core.domain.PSSysBICube;
import net.ibizsys.psmodel.core.domain.PSSysBICubeDimension;
import net.ibizsys.psmodel.core.filter.PSSysBICubeDimensionFilter;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.IPSModelRTService;
import net.ibizsys.runtime.util.JsonUtils;

public class PSSysBICubeDimensionRTService extends net.ibizsys.psmodel.runtime.service.PSSysBICubeDimensionRTService {

	private static final Log log = LogFactory.getLog(PSSysBICubeDimensionRTService.class);
	
	 /**
   	 * 行为：应用指定扩展智能报表立方体维度
   	 */
   	final public static String METHOD_APPLY = "APPLY";
   	
   	@Override
	protected Object doInvoke(String methodName, String key, Object params) throws Exception {
		
   		if(METHOD_APPLY.equalsIgnoreCase(methodName)) {
   			PSSysBICubeDimension domain = this.getDomain(params);
   			if (StringUtils.hasLength(key)) {
				domain.setId(key);
			}
   			return this.apply(domain);
   		}
   		

		return super.doInvoke(methodName, key, params);
	}
   	
	@Override
	protected PSSysBICubeDimension doGet(String key, boolean tryMode) throws Exception {
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession)this.getPSModelRTServiceSession();
		if(StringUtils.hasLength(iExtensionPSModelRTServiceSession.getExtensionId())) {
			String strPSSysBICubeId = getParentId(key);
			String strScopeTag = null;
			if(strPSSysBICubeId.indexOf("@")!=-1) {
				String[] items = strPSSysBICubeId.split("[@]");
				if(items.length == 2) {
					strScopeTag = items[0];
					strPSSysBICubeId = items[1];
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
			
			searchContextDTO.eq(V2SystemExtensionBICube.FIELD_BI_CUBE_TAG, strPSSysBICubeId);
			
			searchContextDTO.eq(V2SystemExtensionBICube.FIELD_ITEM_TAG, key);
			searchContextDTO.eq(V2SystemExtensionBICube.FIELD_TYPE, V2SystemExtensionBICubeItemType.DIMENSION.value);
			
			
			
			Page<V2SystemExtensionBICube> page = iExtensionPSModelRTServiceSession.getCloudExtensionClient().fetchSystemExtensionBICubes(iExtensionPSModelRTServiceSession.getExtensionId(), searchContextDTO);
			if(!ObjectUtils.isEmpty(page) && !ObjectUtils.isEmpty(page.getContent())) {
				List<PSSysBICubeDimension> psSysBICubeDimensionList = ExtensionUtils.toPSModelList(page.getContent(), V2SystemExtensionBICube.FIELD_ITEM_TAG, PSSysBICubeDimension.class);
				if(!ObjectUtils.isEmpty(psSysBICubeDimensionList)) {
					return psSysBICubeDimensionList.get(0);
				}
			}
		}
		return super.doGet(key, tryMode);
	}
	
	@Override
	protected void onBeforeCreate(PSSysBICubeDimension m) throws Exception {
		String strPSSysBICubeId = m.getPSSysBICubeId();
		if(StringUtils.hasLength(strPSSysBICubeId) && strPSSysBICubeId.indexOf("@")!=-1) {
			m.setPSSysBICubeId(strPSSysBICubeId.split("[@]")[1]);
		}
		super.onBeforeCreate(m);
		if(StringUtils.hasLength(strPSSysBICubeId) && strPSSysBICubeId.indexOf("@")!=-1) {
			m.setPSSysBICubeDimensionId(String.format("%1$s@%2$s", strPSSysBICubeId.split("[@]")[0], m.getPSSysBICubeDimensionId()));
		}
	}
	
	@Override
	protected void doCreate(PSSysBICubeDimension m) throws Exception {
		
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession)this.getPSModelRTServiceSession();
		if(!StringUtils.hasLength(iExtensionPSModelRTServiceSession.getExtensionId())) {
			throw new Exception("未支持扩展");
		}
		String strPSSysBICubeDimensionId = m.getId();
		String strPSSysBICubeId = m.getPSSysBICubeId();
		String strScopeTag = null;
		if(strPSSysBICubeDimensionId.indexOf("@")!=-1) {
			String[] items = strPSSysBICubeDimensionId.split("[@]");
			if(items.length == 2) {
				strScopeTag = items[0];
				strPSSysBICubeId = getParentId(items[1]);
			}
		}
		
		PSSysBICube psSysBICube = (PSSysBICube)this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSSYSBICUBE, strPSSysBICubeId);
		
		V2SystemExtensionBICube v2SystemExtensionBICube = new V2SystemExtensionBICube();
		if(StringUtils.hasLength(strScopeTag)) {
			v2SystemExtensionBICube.setScopeType(V2SystemExtensionScopeType.DATA.value);
			v2SystemExtensionBICube.setScopeTag(strScopeTag);
		}
		else {
			v2SystemExtensionBICube.setScopeType(V2SystemExtensionScopeType.BICUBE.value);
			v2SystemExtensionBICube.setScopeTag(strPSSysBICubeId);
		}
		
		v2SystemExtensionBICube.setBICubeTag(strPSSysBICubeId);
		v2SystemExtensionBICube.setBISchemeTag(getParentId(strPSSysBICubeId));
		v2SystemExtensionBICube.setItemTag(m.getId());
		v2SystemExtensionBICube.setType(V2SystemExtensionBICubeItemType.DIMENSION.value);
		v2SystemExtensionBICube.setPendingExtensionModel(ExtensionUtils.toExtensionModel(m));
		v2SystemExtensionBICube.setApplyFlag(0);
		

		String strPSDynaInstId = iExtensionPSModelRTServiceSession.getCloudExtensionClient().createSystemExtensionBICube(iExtensionPSModelRTServiceSession.getExtensionId(), v2SystemExtensionBICube).getId();

		m.set("applyflag", 0);
		
		if(!StringUtils.hasLength(strPSDynaInstId)) {
			return;
		}
		
		ObjectNode objectNode = iExtensionPSModelRTServiceSession.getPSModelTranspiler(IPSSysBICubeDimension.class, false).compile(iExtensionPSModelRTServiceSession, m, null);
   		
   		
   		IPSModelRTService iPSSysBICubeService = (IPSModelRTService)this.getPSModelRTServiceSession().getPSModelService(PSModels.PSSYSBICUBE);
   		IPSSysBICube iPSSysBICube = (IPSSysBICube)iPSSysBICubeService.getPSModelObject(strPSSysBICubeId, IPSSysBICube.class, false);
   		IPSSysBICubeDimension iPSSysBICubeDimension = iExtensionPSModelRTServiceSession.getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime)iPSSysBICube, IPSSysBICubeDimension.class, objectNode);
   		//验证模型
   		PSModelMergeUtils.verify(iPSSysBICubeDimension, true);
   		
   		//获取当前模型
   	
		V2SystemExtensionBICube v2SystemExtensionBICube2 = new V2SystemExtensionBICube();
		v2SystemExtensionBICube2.setExtensionModel(ExtensionUtils.toExtensionModel(m));
		v2SystemExtensionBICube2.setRuntimeModel(JsonUtils.toString(objectNode));
		v2SystemExtensionBICube2.setPendingExtensionModel(null);
		v2SystemExtensionBICube2.setApplyFlag(1);
		
		iExtensionPSModelRTServiceSession.getCloudExtensionClient().updateSystemExtensionBICube(iExtensionPSModelRTServiceSession.getExtensionId(), strPSDynaInstId, v2SystemExtensionBICube2);
	
		m.set("applyflag", 1);
		
	}
	
	
	@Override
	protected List<PSSysBICubeDimension> getDomainList(String strDataSetName, PSSysBICubeDimensionFilter f) throws Exception {
		Object objPSSysBICubeId = f.getFieldCond(PSSysBICubeDimension.FIELD_PSSYSBICUBEID, IPSModelFilter.EQ);
		String strPSSysBICubeId = null;
		if(!ObjectUtils.isEmpty(objPSSysBICubeId)) {
			strPSSysBICubeId = objPSSysBICubeId.toString();
			if(strPSSysBICubeId.indexOf("@") != -1) {
				String[] items = strPSSysBICubeId.split("[@]");
				f.setFieldCond(PSSysBICubeDimension.FIELD_PSSYSBICUBEID, IPSModelFilter.EQ, items[1]);
			}
		}
		
		List<PSSysBICubeDimension> list = super.getDomainList(strDataSetName, f);
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession)this.getPSModelRTServiceSession();
		if(!StringUtils.hasLength(iExtensionPSModelRTServiceSession.getExtensionId())) {
			return list;
		}
		
		if(ObjectUtils.isEmpty(strPSSysBICubeId)) {
			return list;
		}
		
		if(true) {
			SearchContextDTO searchContextDTO = new SearchContextDTO();
			searchContextDTO.all();
			
			searchContextDTO.eq(V2SystemExtensionBICube.FIELD_TYPE, V2SystemExtensionBICubeItemType.DIMENSION.value);
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
			if(!ObjectUtils.isEmpty(page) && !ObjectUtils.isEmpty(page.getContent())) {
				List<PSSysBICubeDimension> psSysBICubeDimensionList = ExtensionUtils.toPSModelList(page.getContent(), V2SystemExtensionBICube.FIELD_ITEM_TAG, PSSysBICubeDimension.class);
				list = ExtensionUtils.replacePSModelList(list, psSysBICubeDimensionList, PSSysBICubeDimension.class);
			}
		}
		
		return this.filterDomainList(list, strDataSetName, f) ;		
	}
	
	
	@Override
	protected PSSysBICubeDimension getLast(PSSysBICubeDimension m) throws Exception {
		return this.get(m.getId(), false);
	}
	
	@Override
	protected void doMergeLast(PSSysBICubeDimension m, PSSysBICubeDimension last) throws Exception {
		m.resetPSSysBICubeId();
		m.resetPSSysBICubeName();
		m.resetCodeName();
		m.reset("psdynainstid");
		super.doMergeLast(m, last);
	}
	
	@Override
	protected void doUpdate(PSSysBICubeDimension m) throws Exception {
		
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession)this.getPSModelRTServiceSession();
		if(!StringUtils.hasLength(iExtensionPSModelRTServiceSession.getExtensionId())) {
			throw new Exception("未支持扩展");
		}
		String strPSDynaInstId = (String)m.get("psdynainstid");
		
		V2SystemExtensionBICube v2SystemExtensionBICube = new V2SystemExtensionBICube();
		v2SystemExtensionBICube.setPendingExtensionModel(ExtensionUtils.toExtensionModel(m));
		v2SystemExtensionBICube.setApplyFlag(0);
		
		iExtensionPSModelRTServiceSession.getCloudExtensionClient().updateSystemExtensionBICube(iExtensionPSModelRTServiceSession.getExtensionId(), strPSDynaInstId, v2SystemExtensionBICube);
		m.set("applyflag", 0);
		
		if(!StringUtils.hasLength(strPSDynaInstId)) {
			return;
		}
		
		
   		ObjectNode objectNode = iExtensionPSModelRTServiceSession.getPSModelTranspiler(IPSSysBICubeDimension.class, false).compile(iExtensionPSModelRTServiceSession, m, null);
   		
   		
   		IPSModelRTService iPSSysBICubeService = (IPSModelRTService)this.getPSModelRTServiceSession().getPSModelService(PSModels.PSSYSBICUBE);
   		IPSSysBICube iPSSysBICube = (IPSSysBICube)iPSSysBICubeService.getPSModelObject(m.getPSSysBICubeId(), IPSSysBICube.class, false);
   		IPSSysBICubeDimension iPSSysBICubeDimension = iExtensionPSModelRTServiceSession.getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime)iPSSysBICube, IPSSysBICubeDimension.class, objectNode);
   		//验证模型
   		PSModelMergeUtils.verify(iPSSysBICubeDimension, true);
   		
   		//获取当前模型
   	
		V2SystemExtensionBICube v2SystemExtensionBICube2 = new V2SystemExtensionBICube();
		v2SystemExtensionBICube2.setExtensionModel(ExtensionUtils.toExtensionModel(m));
		v2SystemExtensionBICube2.setRuntimeModel(JsonUtils.toString(objectNode));
		v2SystemExtensionBICube2.setPendingExtensionModel(null);
		v2SystemExtensionBICube2.setApplyFlag(1);
		
		iExtensionPSModelRTServiceSession.getCloudExtensionClient().updateSystemExtensionBICube(iExtensionPSModelRTServiceSession.getExtensionId(), strPSDynaInstId, v2SystemExtensionBICube2);
	
		m.set("applyflag", 1);
	}
	
	
	public Object apply(PSSysBICubeDimension m) throws Exception {
   		return this.doApply(m);
   	}

   	protected Object doApply(PSSysBICubeDimension m) throws Exception {
   		
   		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
   		String strExtensionId = iExtensionPSModelRTServiceSession.getExtensionIdMust();
   		PSSysBICubeDimension psSysBICubeDimension = this.get(m.getId(), false);
   		String strPSDynaInstId = (String)psSysBICubeDimension.get("psdynainstid");
   		if(!StringUtils.hasLength(strPSDynaInstId)) {
   			throw new Exception("无法应用非动态扩展维度");
   		}
   	
   		ObjectNode objectNode = iExtensionPSModelRTServiceSession.getPSModelTranspiler(IPSSysBICubeDimension.class, false).compile(iExtensionPSModelRTServiceSession, psSysBICubeDimension, null);
   		
   		
   		IPSModelRTService iPSSysBICubeService = (IPSModelRTService)this.getPSModelRTServiceSession().getPSModelService(PSModels.PSSYSBICUBE);
   		IPSSysBICube iPSSysBICube = (IPSSysBICube)iPSSysBICubeService.getPSModelObject(psSysBICubeDimension.getPSSysBICubeId(), IPSSysBICube.class, false);
   		IPSSysBICubeDimension iPSSysBICubeDimension = iExtensionPSModelRTServiceSession.getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime)iPSSysBICube, IPSSysBICubeDimension.class, objectNode);
   		//验证模型
   		PSModelMergeUtils.verify(iPSSysBICubeDimension, true);
   		
   		//获取当前模型
   		//V2SystemExtensionBICube lastV2SystemExtensionBICube = iExtensionPSModelRTServiceSession.getCloudExtensionClient().getSystemExtensionBICube(iExtensionPSModelRTServiceSession.getExtensionId(), strPSDynaInstId);
   		
		
		V2SystemExtensionBICube v2SystemExtensionBICube = new V2SystemExtensionBICube();
		v2SystemExtensionBICube.setExtensionModel(ExtensionUtils.toExtensionModel(psSysBICubeDimension));
		v2SystemExtensionBICube.setRuntimeModel(JsonUtils.toString(objectNode));
		v2SystemExtensionBICube.setPendingExtensionModel(null);
		v2SystemExtensionBICube.setApplyFlag(1);
		
		iExtensionPSModelRTServiceSession.getCloudExtensionClient().updateSystemExtensionBICube(iExtensionPSModelRTServiceSession.getExtensionId(), strPSDynaInstId, v2SystemExtensionBICube);
		return null;
   	}
   	
   	@Override
   	protected void doRemove(PSSysBICubeDimension m) throws Exception {
   		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
   		String strExtensionId = iExtensionPSModelRTServiceSession.getExtensionIdMust();
   		PSSysBICubeDimension psSysBICubeDimension = this.get(m.getId(), false);
   		String strPSDynaInstId = (String)psSysBICubeDimension.get("psdynainstid");
   		if(!StringUtils.hasLength(strPSDynaInstId)) {
   			throw new Exception("无法删除非动态扩展维度");
   		}
   		
   		iExtensionPSModelRTServiceSession.getCloudExtensionClient().removeSystemExtensionBICube(strExtensionId, strPSDynaInstId);
   		
   		//super.doRemove(m);
   	}
}
