package net.ibizsys.central.plugin.extension.psmodel.service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.domain.Page;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionMainState;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionScopeType;
import net.ibizsys.central.plugin.extension.psmodel.util.ExtensionUtils;
import net.ibizsys.central.plugin.extension.psmodel.util.IExtensionPSModelRTServiceSession;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.logic.IPSDEMSLogic;
import net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode;
import net.ibizsys.model.util.PSModelMergeUtils;
import net.ibizsys.psmodel.core.domain.PSDELogic;
import net.ibizsys.psmodel.core.domain.PSDataEntity;
import net.ibizsys.psmodel.core.filter.PSDELogicFilter;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.IPSModelRTService;
import net.ibizsys.runtime.util.JsonUtils;

public class PSDEMSLogicRTService extends net.ibizsys.psmodel.runtime.service.PSDEMSLogicRTService {

	private static final Log log = LogFactory.getLog(PSDEMSLogicRTService.class);

	/**
	 * 行为：应用指定扩展主状态逻辑
	 */
	final public static String METHOD_APPLY = "APPLY";
	
//	/**
//	 * 行为：启用指定扩展主状态逻辑
//	 */
//	final public static String METHOD_ENABLE = "ENABLE";
//
//	/**
//	 * 行为：禁用指定扩展主状态逻辑
//	 */
//	final public static String METHOD_DISABLE = "DISABLE";
	

	@Override
	protected Object doInvoke(String methodName, String key, Object params) throws Exception {

		if (METHOD_APPLY.equalsIgnoreCase(methodName)) {
			PSDELogic domain = this.getDomain(params);
			if (StringUtils.hasLength(key)) {
				domain.setId(key);
			}
			return this.apply(domain);
		}

//		if (METHOD_ENABLE.equalsIgnoreCase(methodName)) {
//			PSDELogic domain = this.getDomain(params);
//			if (StringUtils.hasLength(key)) {
//				domain.setId(key);
//			}
//			return this.enable(domain);
//		}
//
//		if (METHOD_DISABLE.equalsIgnoreCase(methodName)) {
//			PSDELogic domain = this.getDomain(params);
//			if (StringUtils.hasLength(key)) {
//				domain.setId(key);
//			}
//			return this.disable(domain);
//		}
		
		return super.doInvoke(methodName, key, params);
	}

	@Override
	protected PSDELogic doGet(String key, boolean tryMode) throws Exception {
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
		if (StringUtils.hasLength(iExtensionPSModelRTServiceSession.getExtensionId())) {
			String strPSDEId = getParentId(key);

			SearchContextDTO searchContextDTO = new SearchContextDTO();
			searchContextDTO.all();

			if (strPSDEId.indexOf("@") == -1) {
				searchContextDTO.eq(V2SystemExtensionMainState.FIELD_SCOPE_TYPE, V2SystemExtensionScopeType.DATAENTITY.value);
				searchContextDTO.eq(V2SystemExtensionMainState.FIELD_DATA_ENTITY_TAG, strPSDEId);
			} else {
				searchContextDTO.eq(V2SystemExtensionMainState.FIELD_SCOPE_TYPE, V2SystemExtensionScopeType.DATA.value);
				searchContextDTO.eq(V2SystemExtensionMainState.FIELD_DATA_ENTITY_TAG, strPSDEId.split("[@]")[1]);
			}
			searchContextDTO.eq(V2SystemExtensionMainState.FIELD_SCOPE_TAG, strPSDEId);
			searchContextDTO.eq(V2SystemExtensionMainState.FIELD_MAIN_STATE_LOGIC_TAG, key);

			Page<V2SystemExtensionMainState> page = iExtensionPSModelRTServiceSession.getCloudExtensionClient().fetchSystemExtensionMainStates(iExtensionPSModelRTServiceSession.getExtensionId(), searchContextDTO);
			if (!ObjectUtils.isEmpty(page) && !ObjectUtils.isEmpty(page.getContent())) {
				List<PSDELogic> psDELogicList = ExtensionUtils.toPSModelList(page.getContent(), V2SystemExtensionMainState.FIELD_MAIN_STATE_LOGIC_TAG, PSDELogic.class);
				if (!ObjectUtils.isEmpty(psDELogicList)) {
					return psDELogicList.get(0);
				}
			}

			// 没有找到，尝试
			if (key.indexOf("@") != -1) {
				// 取默认
				PSDELogic psDELogic = this.doGet(key.split("[@]")[1], tryMode);
				if (psDELogic != null) {
					// 重置动态实例
					psDELogic.set(ExtensionUtils.FIELD_PSDYNAINSTID, ExtensionUtils.DYNAINSTID_PARENT);
					psDELogic.setPSDELogicId(key);
					psDELogic.setPSDEId(getParentId(key));
					return psDELogic;
				}
			}
		}
		return super.doGet(key, tryMode);
	}

	@Override
	protected void doCreate(PSDELogic m) throws Exception {

		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
		if (!StringUtils.hasLength(iExtensionPSModelRTServiceSession.getExtensionId())) {
			throw new Exception("未支持扩展");
		}
		
		PSDataEntity psDataEntity = (PSDataEntity) this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDATAENTITY, m.getPSDEId());
		
		this.doCompile(m);
		
		V2SystemExtensionMainState v2SystemExtensionMainState = new V2SystemExtensionMainState();
		if (m.getPSDEId().indexOf("@") == -1) {
			v2SystemExtensionMainState.setScopeType(V2SystemExtensionScopeType.DATAENTITY.value);
		} else {
			v2SystemExtensionMainState.setScopeType(V2SystemExtensionScopeType.DATA.value);
		}
		v2SystemExtensionMainState.setScopeTag(m.getPSDEId());
		v2SystemExtensionMainState.setMainStateLogicTag(m.getId());
		v2SystemExtensionMainState.setDataEntityTag(psDataEntity.getPSDataEntityId());
		v2SystemExtensionMainState.setPendingExtensionModel(ExtensionUtils.toExtensionModel(m));
		v2SystemExtensionMainState.setApplyFlag(0);
		v2SystemExtensionMainState.setName(m.getName());

		iExtensionPSModelRTServiceSession.getCloudExtensionClient().createSystemExtensionMainState(iExtensionPSModelRTServiceSession.getExtensionId(), v2SystemExtensionMainState);
		m.set("applyflag", 0);
	}

	@Override
	protected List<PSDELogic> getDomainList(String strDataSetName, PSDELogicFilter f) throws Exception {
		List<PSDELogic> list = super.getDomainList(strDataSetName, f);
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
		if (!StringUtils.hasLength(iExtensionPSModelRTServiceSession.getExtensionId())) {
			return list;
		}

		Object objPSDEId = f.getFieldCond(PSDELogic.FIELD_PSDEID, IPSModelFilter.EQ);
		if (ObjectUtils.isEmpty(objPSDEId)) {
			return list;
		}

		String strPSDEId = objPSDEId.toString();

		if (true) {
			SearchContextDTO searchContextDTO = new SearchContextDTO();
			searchContextDTO.all();

			searchContextDTO.eq(V2SystemExtensionMainState.FIELD_SCOPE_TYPE, V2SystemExtensionScopeType.DATAENTITY.value);
			if (strPSDEId.indexOf("@") == -1) {
				searchContextDTO.eq(V2SystemExtensionMainState.FIELD_DATA_ENTITY_TAG, strPSDEId);
				searchContextDTO.eq(V2SystemExtensionMainState.FIELD_SCOPE_TAG, strPSDEId);
			} else {
				searchContextDTO.eq(V2SystemExtensionMainState.FIELD_DATA_ENTITY_TAG, strPSDEId.split("[@]")[1]);
				searchContextDTO.eq(V2SystemExtensionMainState.FIELD_SCOPE_TAG, strPSDEId.split("[@]")[1]);
			}
			Page<V2SystemExtensionMainState> page = iExtensionPSModelRTServiceSession.getCloudExtensionClient().fetchSystemExtensionMainStates(iExtensionPSModelRTServiceSession.getExtensionId(), searchContextDTO);
			if (!ObjectUtils.isEmpty(page) && !ObjectUtils.isEmpty(page.getContent())) {
				List<PSDELogic> psDELogicList = ExtensionUtils.toPSModelList(page.getContent(), V2SystemExtensionMainState.FIELD_MAIN_STATE_LOGIC_TAG, PSDELogic.class);
				list = ExtensionUtils.replacePSModelList(list, psDELogicList, PSDELogic.class);
			}
		}

		if (strPSDEId.indexOf("@") != -1) {
			SearchContextDTO searchContextDTO = new SearchContextDTO();
			searchContextDTO.all();

			searchContextDTO.eq(V2SystemExtensionMainState.FIELD_SCOPE_TYPE, V2SystemExtensionScopeType.DATA.value);
			searchContextDTO.eq(V2SystemExtensionMainState.FIELD_DATA_ENTITY_TAG, strPSDEId.split("[@]")[1]);
			searchContextDTO.eq(V2SystemExtensionMainState.FIELD_SCOPE_TAG, strPSDEId);

			Page<V2SystemExtensionMainState> page = iExtensionPSModelRTServiceSession.getCloudExtensionClient().fetchSystemExtensionMainStates(iExtensionPSModelRTServiceSession.getExtensionId(), searchContextDTO);
			if (!ObjectUtils.isEmpty(page) && !ObjectUtils.isEmpty(page.getContent())) {
				List<PSDELogic> psDELogicList = ExtensionUtils.toPSModelList(page.getContent(), V2SystemExtensionMainState.FIELD_MAIN_STATE_LOGIC_TAG, PSDELogic.class);
				list = ExtensionUtils.replacePSModelList(list, psDELogicList, PSDELogic.class);
			}
		}

		return this.filterDomainList(list, strDataSetName, f);
	}

	@Override
	protected PSDELogic getLast(PSDELogic m) throws Exception {
		return this.get(m.getId(), false);
	}

	@Override
	protected void doMergeLast(PSDELogic m, PSDELogic last) throws Exception {
		m.resetPSDEId();
		m.resetPSDEName();
		m.resetCodeName();
		m.resetLogicSubType();
		m.reset("psdynainstid");
		super.doMergeLast(m, last);
	}

	@Override
	protected void doUpdate(PSDELogic m) throws Exception {

		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
		String strExtensionId = iExtensionPSModelRTServiceSession.getExtensionIdMust();

		String strPSDynaInstId = (String) m.get(ExtensionUtils.FIELD_PSDYNAINSTID);
		if (!StringUtils.hasLength(strPSDynaInstId) || ExtensionUtils.DYNAINSTID_PARENT.equals(strPSDynaInstId)) {
			this.doCreate(m);
			return;
		}

		this.doCompile(m);
		
		V2SystemExtensionMainState v2SystemExtensionMainState = new V2SystemExtensionMainState();
		v2SystemExtensionMainState.setPendingExtensionModel(ExtensionUtils.toExtensionModel(m));
		v2SystemExtensionMainState.setApplyFlag(0);
		v2SystemExtensionMainState.setName(m.getName());

		iExtensionPSModelRTServiceSession.getCloudExtensionClient().updateSystemExtensionMainState(strExtensionId, strPSDynaInstId, v2SystemExtensionMainState);
		m.set("applyflag", 0);
	}

	@Override
	protected List<PSDELogic> filterDomainList(List<PSDELogic> domainList, String strDataSetName, PSDELogicFilter f) throws Exception {

		// if(!ObjectUtils.isEmpty(domainList)) {
		// Object objPSWFDEId = f.getFieldCond(PSDELogic.FIELD_PSWFDEID,
		// IPSModelFilter.EQ);
		// if(!ObjectUtils.isEmpty(objPSWFDEId)) {
		//
		// IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession =
		// (IExtensionPSModelRTServiceSession)this.getPSModelRTServiceSession();
		// PSWFDE psWFDE =
		// (PSWFDE)iExtensionPSModelRTServiceSession.getCachePSModel(PSModels.PSWFDE,
		// objPSWFDEId.toString());
		//
		// List<PSDELogic> domainList2 = new ArrayList<PSDELogic>();
		// //指定了流程实体标识
		// for(PSDELogic psDELogic : domainList) {
		// //先判断实体
		// if(DataTypeUtils.compare(DataTypes.VARCHAR, psWFDE.getPSDEId(),
		// psDELogic.getPSDEId())==0) {
		// if(!FormType.EDITFORM.value.equals(psDELogic.getFormType())) {
		// continue;
		// }
		// if(!StringUtils.hasLength(psDELogic.getPSWFDEId())) {
		// psDELogic.setPSWFDEId((String)objPSWFDEId);
		// }
		//
		// domainList2.add(psDELogic);
		// }
		// }
		//
		// domainList.clear();
		// domainList.addAll(domainList2);
		// }
		// }
		return super.filterDomainList(domainList, strDataSetName, f);
	}

	@Override
	protected void onBeforeRemove(PSDELogic m) throws Exception {
		// TODO Auto-generated method stub
		super.onBeforeRemove(m);
	}

	@Override
	protected void doRemove(PSDELogic m) throws Exception {
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
		String strExtensionId = iExtensionPSModelRTServiceSession.getExtensionIdMust();

		String strPSDynaInstId = (String) m.get(ExtensionUtils.FIELD_PSDYNAINSTID);
		if (!StringUtils.hasLength(strPSDynaInstId) || ExtensionUtils.DYNAINSTID_PARENT.equals(strPSDynaInstId)) {
			throw new Exception(String.format("无法删除默认数据"));
		}
		iExtensionPSModelRTServiceSession.getCloudExtensionClient().removeSystemExtensionMainState(strExtensionId, strPSDynaInstId);
		// 通知
		ExtensionUtils.notifySystemExtensionChanged(strExtensionId, null);
	}

	public Object apply(PSDELogic m) throws Exception {
		return this.doApply(m, null);
	}

	protected Object doApply(PSDELogic m, Boolean enable) throws Exception {

		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
		String strExtensionId = iExtensionPSModelRTServiceSession.getExtensionIdMust();
		PSDELogic psDELogic = this.get(m.getId(), false);
		String strPSDynaInstId = ExtensionUtils.getApplyPSDynaInstId(psDELogic, false);

		// 获取默认配置
		PSDELogic orginPSDELogic = super.doGet(m.getId(), true);
		if (orginPSDELogic != null) {
			// 放入默认配置
			psDELogic.setPSSysSFPluginId(orginPSDELogic.getPSSysSFPluginId());
			psDELogic.setPSSysSFPluginName(orginPSDELogic.getPSSysSFPluginName());
			psDELogic.setLogicTag(orginPSDELogic.getLogicTag());
			psDELogic.setLogicTag2(orginPSDELogic.getLogicTag2());
			psDELogic.setLogicTag3(orginPSDELogic.getLogicTag3());
			psDELogic.setLogicTag4(orginPSDELogic.getLogicTag4());
		}
		
		//设置有效标记
		if(enable!=null) {
			psDELogic.set("validflag", enable?1:0);
		}

		IPSDEMSLogic iPSDEMSLogic = this.doCompile(psDELogic);
		

		// 获取当前模型
		// V2SystemExtensionField lastV2SystemExtensionField =
		// iExtensionPSModelRTServiceSession.getCloudExtensionClient().getSystemExtensionField(iExtensionPSModelRTServiceSession.getExtensionId(),
		// strPSDynaInstId);

		V2SystemExtensionMainState v2SystemExtensionMainState = new V2SystemExtensionMainState();
		v2SystemExtensionMainState.setExtensionModel(ExtensionUtils.toExtensionModel(psDELogic));
		v2SystemExtensionMainState.setRuntimeModel(JsonUtils.toString(iPSDEMSLogic.getObjectNode()));
		v2SystemExtensionMainState.setPendingExtensionModel(null);
		v2SystemExtensionMainState.setApplyFlag(1);
		v2SystemExtensionMainState.setName(psDELogic.getName());
		
//		if(enable!=null) {
//			v2SystemExtensionMainState.setValidFlag(enable?1:0);
//		}

		iExtensionPSModelRTServiceSession.getCloudExtensionClient().updateSystemExtensionMainState(iExtensionPSModelRTServiceSession.getExtensionId(), strPSDynaInstId, v2SystemExtensionMainState);

		ExtensionUtils.notifySystemExtensionChanged(strExtensionId, null);
		return null;
	}
	
	protected IPSDEMSLogic doCompile(PSDELogic psDELogic) throws Exception {
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
		ObjectNode objectNode = iExtensionPSModelRTServiceSession.getPSModelTranspiler(IPSDEMSLogic.class, false).compile(iExtensionPSModelRTServiceSession, psDELogic, null);

		IPSModelRTService iPSDataEntityService = (IPSModelRTService) this.getPSModelRTServiceSession().getPSModelService(PSModels.PSDATAENTITY);
		IPSDataEntity iPSDataEntity = (IPSDataEntity) iPSDataEntityService.getPSModelObject(psDELogic.getPSDEId(), IPSDataEntity.class, false);
		IPSDEMSLogic iPSDEMSLogic = iExtensionPSModelRTServiceSession.getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime) iPSDataEntity, IPSDEMSLogic.class, objectNode);
		
		Map<String, IPSDEMSLogicNode> psDEMSLogicNodeMap = new LinkedHashMap<String, IPSDEMSLogicNode>();
		java.util.List<IPSDEMSLogicNode> psDEMSLogicNodes = iPSDEMSLogic.getPSDEMSLogicNodes();
		if(!ObjectUtils.isEmpty(psDEMSLogicNodes)) {
			for(IPSDEMSLogicNode iPSDEMSLogicNode : psDEMSLogicNodes) {
				String strState = iPSDEMSLogicNode.getStateValue();
				if(!StringUtils.hasLength(strState)) {
					strState = iPSDEMSLogicNode.getCodeName();
				}
				
				if(!StringUtils.hasLength(strState)) {
					throw new Exception(String.format("状态节点[%1$s]未定义状态值", iPSDEMSLogicNode.getName()));
				}
				
				if(psDEMSLogicNodeMap.containsKey(strState)) {
					IPSDEMSLogicNode lastPSDEMSLogicNode = psDEMSLogicNodeMap.get(strState);
					throw new Exception(String.format("状态节点[%2$s]状态值[%1$s]已在状态节点[%3$s]定义", strState, iPSDEMSLogicNode.getName(), lastPSDEMSLogicNode.getName()));
				}
				
				psDEMSLogicNodeMap.put(strState, iPSDEMSLogicNode);
				if(iPSDEMSLogicNode.isDefaultMode()){
					if(psDEMSLogicNodeMap.containsKey("")) {
						throw new Exception(String.format("出现重复的默认状态节点[%1$s]", iPSDEMSLogicNode.getName()));
					}
					psDEMSLogicNodeMap.put("", iPSDEMSLogicNode);
				}
			}
		}
		
		// 验证模型
		PSModelMergeUtils.verify(iPSDEMSLogic, true);

		return iPSDEMSLogic;
	}
//	
//	public Object enable(PSDELogic m) throws Exception {
//		return this.doEnable(m);
//	}
//
//	protected Object doEnable(PSDELogic m) throws Exception {
//		return this.doApply(m, true);
//	}
//
//	public Object disable(PSDELogic m) throws Exception {
//		return this.doDisable(m);
//	}
//
//	protected Object doDisable(PSDELogic m) throws Exception {
//		return this.doApply(m, false);
//	}
}
