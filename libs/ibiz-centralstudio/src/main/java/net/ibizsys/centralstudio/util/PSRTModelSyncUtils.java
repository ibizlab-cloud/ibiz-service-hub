package net.ibizsys.centralstudio.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.centralstudio.dto.PSDEActionDTO;
import net.ibizsys.centralstudio.dto.PSDEDataSetDTO;
import net.ibizsys.centralstudio.dto.PSDEFieldDTO;
import net.ibizsys.centralstudio.dto.PSDEFormDTO;
import net.ibizsys.centralstudio.dto.PSDERDTO;
import net.ibizsys.centralstudio.dto.PSDEViewBaseDTO;
import net.ibizsys.centralstudio.dto.PSDataEntityDTO;
import net.ibizsys.centralstudio.dto.PSModuleDTO;
import net.ibizsys.centralstudio.dto.PSSysDELogicNodeDTO;
import net.ibizsys.centralstudio.dto.PSSysModelGroupDTO;
import net.ibizsys.centralstudio.dto.PSSysMsgTemplDTO;
import net.ibizsys.centralstudio.dto.PSSysRefDTO;
import net.ibizsys.centralstudio.dto.PSWFDEDTO;
import net.ibizsys.centralstudio.dto.PSWFRoleDTO;
import net.ibizsys.centralstudio.dto.PSWFWorkTimeDTO;
import net.ibizsys.centralstudio.dto.PSWorkflowDTO;
import net.ibizsys.centralstudio.filter.PSDEActionFilter;
import net.ibizsys.centralstudio.filter.PSDEDataSetFilter;
import net.ibizsys.centralstudio.filter.PSDEFieldFilter;
import net.ibizsys.centralstudio.filter.PSDEFormFilter;
import net.ibizsys.centralstudio.filter.PSDERFilter;
import net.ibizsys.centralstudio.filter.PSDEViewBaseFilter;
import net.ibizsys.centralstudio.filter.PSDataEntityFilter;
import net.ibizsys.centralstudio.filter.PSModuleFilter;
import net.ibizsys.centralstudio.filter.PSSysDELogicNodeFilter;
import net.ibizsys.centralstudio.filter.PSSysModelGroupFilter;
import net.ibizsys.centralstudio.filter.PSSysMsgTemplFilter;
import net.ibizsys.centralstudio.filter.PSSysRefFilter;
import net.ibizsys.centralstudio.filter.PSWFDEFilter;
import net.ibizsys.centralstudio.filter.PSWFRoleFilter;
import net.ibizsys.centralstudio.filter.PSWFWorkTimeFilter;
import net.ibizsys.centralstudio.filter.PSWorkflowFilter;
import net.ibizsys.model.IPSModelData;
import net.ibizsys.model.IPSSystem;
import net.ibizsys.model.PSModelEnums.DEActionType;
import net.ibizsys.model.PSModelEnums.DEFDataType;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.defield.IPSLinkDEField;
import net.ibizsys.model.dataentity.defield.IPSOne2ManyDataDEField;
import net.ibizsys.model.dataentity.defield.IPSOne2OneDataDEField;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.model.dataentity.wf.IPSDEWF;
import net.ibizsys.model.msg.IPSSysMsgTempl;
import net.ibizsys.model.res.IPSSysLogic;
import net.ibizsys.model.system.IPSSysModelGroup;
import net.ibizsys.model.system.IPSSysRef;
import net.ibizsys.model.system.IPSSystemModule;
import net.ibizsys.model.wf.IPSWFRole;
import net.ibizsys.model.wf.IPSWFWorkTime;
import net.ibizsys.model.wf.IPSWorkflow;

/**
 * 模型同步辅助对象
 * 
 * @author lionlau
 *
 */
public class PSRTModelSyncUtils {

	private static final Log log = LogFactory.getLog(PSRTModelSyncUtils.class);
	
	private static PSRTModelSyncUtils instance = null;

	public static PSRTModelSyncUtils getInstance() {
		if (PSRTModelSyncUtils.instance == null) {
			PSRTModelSyncUtils.instance = new PSRTModelSyncUtils();
		}
		return PSRTModelSyncUtils.instance;
	}

	public static void setInstance(PSRTModelSyncUtils instance) {
		PSRTModelSyncUtils.instance = instance;
	}

	private Map<String, PSModuleDTO> globalPSModuleDTOMap = new HashMap<>();
	private Map<String, PSSysRefDTO> globalPSSysRefDTOMap = new HashMap<>();
	private Map<String, PSSysModelGroupDTO> globalPSSysModelGroupDTOMap = new HashMap<>();
	private Map<String, PSDataEntityDTO> globalPSDataEntityDTOMap = new HashMap<>();
	private Map<String, PSDERDTO> globalPSDERDTOMap = new HashMap<>();
	private Map<String, PSDEFieldDTO> globalPSDEFieldDTOMap = new HashMap<>();
	private Map<String, PSWorkflowDTO> globalPSWorkflowDTOMap = new HashMap<>();
	private Map<String, PSDEActionDTO> globalPSDEActionDTOMap = new HashMap<>();
	private Map<String, PSDEDataSetDTO> globalPSDEDataSetDTOMap = new HashMap<>();
	private Map<String, PSWFDEDTO> globalPSWFDEDTOMap = new HashMap<>();
	private Map<String, PSDEFormDTO> globalPSDEFormDTOMap = new HashMap<>();
	private Map<String, PSDEViewBaseDTO> globalPSDEViewBaseDTOMap = new HashMap<>();
	private Map<String, PSWFRoleDTO> globalPSWFRoleDTOMap = new HashMap<>();
	private Map<String, PSWFWorkTimeDTO> globalPSWFWorkTimeDTOMap = new HashMap<>();
	private Map<String, PSSysMsgTemplDTO> globalPSSysMsgTemplDTOMap = new HashMap<>();
	private Map<String, PSSysDELogicNodeDTO> globalPSSysDELogicNodeDTOMap = new HashMap<>();

	public void sync(IPSSystem iPSSystem) throws Throwable {
		syncPSSysRefs(iPSSystem, false);
		syncPSSysModelGroups(iPSSystem, false);
		syncPSModules(iPSSystem, false);
		syncPSDataEntities(iPSSystem, false);
		syncPSDERs(iPSSystem, false);
		syncPSDEFields(iPSSystem, false);
		syncPSDEActions(iPSSystem, false);
		syncPSDEDataSets(iPSSystem, false);
		syncPSDEForms(iPSSystem, false);
		syncPSDEViewBases(iPSSystem, false);
		syncPSSysMsgTempls(iPSSystem, false);
		syncPSWorkflows(iPSSystem, false);
		syncPSWFDEs(iPSSystem, false);
		syncPSWFRoles(iPSSystem, false);
		syncPSWFWorkTimes(iPSSystem, false);
		syncPSSysDELogicNodes(iPSSystem, false);
	}

	protected void syncPSModules(IPSSystem iPSSystem, boolean bRefreshOnly) throws Throwable {
		globalPSModuleDTOMap.clear();
		// 查询全部模块
		PSModuleFilter psModelSearchContextDTO = new PSModuleFilter();
		List<PSModuleDTO> list = PSModelServiceUtils.getInstance().searchAllPSModules(psModelSearchContextDTO);
		Map<String, PSModuleDTO> psModuleDTOMap = new HashMap<>();
		if(!ObjectUtils.isEmpty(list)) {
			for (PSModuleDTO psModuleDTO : list) {
				String strTag = null;
				if (StringUtils.hasLength(psModuleDTO.getPSSysRefId())) {
					strTag = String.format("PSSYSREF|%1$s|%2$s", psModuleDTO.getPSSysRefId(), psModuleDTO.getCodeName());
				} else if (StringUtils.hasLength(psModuleDTO.getPSSysModelGroupId())) {
					strTag = String.format("PSSYSMODELGROUP|%1$s|%2$s", psModuleDTO.getPSSysModelGroupId(), psModuleDTO.getCodeName());
				} else {
					strTag = psModuleDTO.getCodeName();
				}

				psModuleDTOMap.put(strTag, psModuleDTO);
			}
		}
		

		List<PSModuleDTO> psModuleDTOList = new ArrayList<PSModuleDTO>();

		// 获取当前系统模块
		java.util.List<IPSSystemModule> psSystemModules = iPSSystem.getAllPSSystemModules();
		if (psSystemModules != null) {
			for (IPSSystemModule iPSSystemModule : psSystemModules) {
				String strTag = null;
				if (iPSSystemModule.getPSSysRef() != null) {
					strTag = String.format("PSSYSREF|%1$s|%2$s", iPSSystemModule.getPSSysRef().getSysRefTag(), iPSSystemModule.getCodeName());
				} else if (iPSSystemModule.getPSSysModelGroup() != null) {
					strTag = String.format("PSSYSMODELGROUP|%1$s|%2$s", iPSSystemModule.getPSSysModelGroup().getCodeName(), iPSSystemModule.getCodeName());
				} else {
					strTag = iPSSystemModule.getCodeName();
				}

				PSModuleDTO psModuleDTO = psModuleDTOMap.get(strTag);
				if (psModuleDTO != null) {
					globalPSModuleDTOMap.put(iPSSystemModule.getId(), psModuleDTO);
					continue;
				}
				if (bRefreshOnly) {
					continue;
				}
				psModuleDTO = new PSModuleDTO();
				psModuleDTO.setPSModuleName(iPSSystemModule.getName());
				psModuleDTO.setCodeName(iPSSystemModule.getCodeName());
				if (iPSSystemModule.isSubSysModule()) {
					psModuleDTO.setSubSysModule(1);
				} else {
					psModuleDTO.setSubSysModule(0);
				}
				if (iPSSystemModule.getPSSysRef() != null) {
					PSSysRefDTO psSysRefDTO = globalPSSysRefDTOMap.get(iPSSystemModule.getPSSysRef().getId());
					if (psSysRefDTO == null) {
						throw new Exception(String.format("无法获取系统引用[%1$s]数据对象", iPSSystemModule.getPSSysRef().getId()));
					}
					psModuleDTO.setPSSysRefId(psSysRefDTO.getPSSysRefId());
					psModuleDTO.setPSSysRefName(psSysRefDTO.getPSSysRefName());
				} else if (iPSSystemModule.getPSSysModelGroup() != null) {
					PSSysModelGroupDTO psSysModelGroupDTO = globalPSSysModelGroupDTOMap.get(iPSSystemModule.getPSSysModelGroup().getId());
					if (psSysModelGroupDTO == null) {
						throw new Exception(String.format("无法获取系统模型组[%1$s]数据对象", iPSSystemModule.getPSSysModelGroup().getId()));
					}
					psModuleDTO.setPSSysModelGroupId(psSysModelGroupDTO.getPSSysModelGroupId());
					psModuleDTO.setPSSysModelGroupName(psSysModelGroupDTO.getPSSysModelGroupName());
				}
				psModuleDTO.setSrfSystemFlag(1);
				psModuleDTOList.add(psModuleDTO);
			}
		}

		// 批建立
		if (!bRefreshOnly && psModuleDTOList.size() > 0) {
			PSModelServiceUtils.getInstance().createPSModules(psModuleDTOList);
			syncPSModules(iPSSystem, true);
		}
	}

	protected void syncPSDataEntities(IPSSystem iPSSystem, boolean bRefreshOnly) throws Throwable {
		
		globalPSDataEntityDTOMap.clear();
		// 查询全部模块
		PSDataEntityFilter psModelSearchContextDTO = new PSDataEntityFilter();
		List<PSDataEntityDTO> list = PSModelServiceUtils.getInstance().searchAllPSDataEntities(psModelSearchContextDTO);
		Map<String, PSDataEntityDTO> psDataEntityDTOMap = new HashMap<>();
		if(!ObjectUtils.isEmpty(list)) {
			for (PSDataEntityDTO psDataEntityDTO : list) {
				String strTag = String.format("PSMODULE|%1$s|%2$s", psDataEntityDTO.getPSModuleId(), psDataEntityDTO.getPSDataEntityName());
				psDataEntityDTOMap.put(strTag, psDataEntityDTO);
			}
		}
		
		

		List<PSDataEntityDTO> psDataEntityDTOList = new ArrayList<PSDataEntityDTO>();

		// 获取当前实体
		java.util.List<IPSDataEntity> psDataEntities = iPSSystem.getAllPSDataEntities();
		if (psDataEntities != null) {
			for (IPSDataEntity iPSDataEntity : psDataEntities) {
				PSModuleDTO psModuleDTO = globalPSModuleDTOMap.get(iPSDataEntity.getPSSystemModuleMust().getId());
				if(psModuleDTO == null) {
					throw new Exception(String.format("无法获取系统模块[%1$s]数据对象", iPSDataEntity.getPSSystemModuleMust().getId()));
				}
				String strTag = String.format("PSMODULE|%1$s|%2$s", psModuleDTO.getPSModuleId(), iPSDataEntity.getName());

				PSDataEntityDTO psDataEntityDTO = psDataEntityDTOMap.get(strTag);
				if (psDataEntityDTO != null) {
					globalPSDataEntityDTOMap.put(iPSDataEntity.getId(), psDataEntityDTO);
					continue;
				}
				if (bRefreshOnly) {
					continue;
				}
				psDataEntityDTO = new PSDataEntityDTO();
				psDataEntityDTO.setPSDataEntityName(iPSDataEntity.getName());
				psDataEntityDTO.setCodeName(iPSDataEntity.getCodeName());
				psDataEntityDTO.setPSModuleId(psModuleDTO.getPSModuleId());
				psDataEntityDTO.setPSModuleName(psModuleDTO.getPSModuleName());
				psDataEntityDTO.setDEType(iPSDataEntity.getDEType());
				psDataEntityDTO.setLogicName(iPSDataEntity.getLogicName());
				psDataEntityDTO.setSrfSystemFlag(1);
				psDataEntityDTOList.add(psDataEntityDTO);
			}
		}

		// 批建立
		if (!bRefreshOnly && psDataEntityDTOList.size() > 0) {
			PSModelServiceUtils.getInstance().createPSDataEntities(psDataEntityDTOList);
			syncPSDataEntities(iPSSystem, true);
		}
	}
	
	protected void syncPSDEFields(IPSSystem iPSSystem, boolean bRefreshOnly) throws Throwable {
		
		globalPSDEFieldDTOMap.clear();
		Map<String, PSDEFieldDTO> psDEFieldDTOMap = new HashMap<>();
		PSDEFieldFilter psModelSearchContextDTO = new PSDEFieldFilter();
		List<PSDEFieldDTO> list = PSModelServiceUtils.getInstance().searchAllPSDEFields(psModelSearchContextDTO);
		if(!ObjectUtils.isEmpty(list)) {
			for (PSDEFieldDTO psDEFieldDTO : list) {
				String strTag = String.format("%1$s|%2$s", psDEFieldDTO.getPSDEId(), psDEFieldDTO.getPSDEFieldName());
				if(psDEFieldDTOMap.containsKey(strTag)) {
					log.warn(String.format("实体属性[%1$s]已经在列表中", strTag));
					continue;
				}
				psDEFieldDTOMap.put(strTag, psDEFieldDTO);
			}
		}
		
				
		List<PSDEFieldDTO> psDEFieldDTOList = new ArrayList<PSDEFieldDTO>();

		java.util.List<IPSDataEntity> psDataEntities = iPSSystem.getAllPSDataEntities();
		if (psDataEntities != null) {
			for (IPSDataEntity iPSDataEntity : psDataEntities) {
				java.util.List<IPSDEField> psDEFields = iPSDataEntity.getAllPSDEFields();
				if (psDEFields != null) {
					for (IPSDEField iPSDEField : psDEFields) {
						PSDataEntityDTO psDataEntityDTO = globalPSDataEntityDTOMap.get(iPSDataEntity.getId());
						if(psDataEntityDTO == null) {
							throw new Exception(String.format("无法获取系统实体[%1$s]数据对象", iPSDataEntity.getId()));
						}
						String strTag = String.format("%1$s|%2$s", psDataEntityDTO.getPSDataEntityId(), iPSDEField.getName());

						PSDEFieldDTO psDEFieldDTO = psDEFieldDTOMap.get(strTag);
						if (psDEFieldDTO != null) {
							//globalPSDEFieldDTOMap.put(iPSDEField.getId(), psDEFieldDTO);
							globalPSDEFieldDTOMap.put(strTag, psDEFieldDTO);
							continue;
						}
						if (bRefreshOnly) {
							continue;
						}
						psDEFieldDTO = new PSDEFieldDTO();
						psDEFieldDTO.setPSDEFieldName(iPSDEField.getName());
						psDEFieldDTO.setCodeName(iPSDEField.getCodeName());
						psDEFieldDTO.setLogicName(iPSDEField.getLogicName());
						psDEFieldDTO.setSrfSystemFlag(1);
						psDEFieldDTO.setDEFType(iPSDEField.getDEFType());
						psDEFieldDTO.setPSDEId(psDataEntityDTO.getPSDataEntityId());
						psDEFieldDTO.setPSDEName(psDataEntityDTO.getPSDataEntityName());
						psDEFieldDTO.setAllowEmpty(iPSDEField.isAllowEmpty()?1:0);
						psDEFieldDTO.setPSDataTypeId(iPSDEField.getDataType());
						psDEFieldDTO.setPSDataTypeName(DEFDataType.from(iPSDEField.getDataType()).text);
						if(iPSDEField.isKeyDEField() && iPSDEField.isUniTagField()) {
							psDEFieldDTO.setPKey(1);
						}
						else
							if(iPSDEField.isUniTagField()) {
								psDEFieldDTO.setPKey(2);
							}
						
						if(iPSDEField.isMajorDEField()) {
							psDEFieldDTO.setMajorField(1);
						}
						
						
						if(iPSDEField instanceof IPSLinkDEField) {
							IPSLinkDEField iPSLinkDEField = (IPSLinkDEField)iPSDEField;
							IPSDERBase iPSDER = iPSLinkDEField.getPSDERMust();
							PSDERDTO psDERDTO = globalPSDERDTOMap.get(iPSDER.getId());
							if(psDERDTO == null) {
								throw new Exception(String.format("无法获取实体关系[%1$s]数据对象", iPSDER.getId()));
							}
							psDEFieldDTO.setPSDERId(psDERDTO.getPSDERId());
							psDEFieldDTO.setPSDERName(psDERDTO.getPSDERName());
						}
						else
							if(iPSDEField instanceof IPSOne2ManyDataDEField) {
								IPSOne2ManyDataDEField iPSLinkDEField = (IPSOne2ManyDataDEField)iPSDEField;
								IPSDERBase iPSDER = iPSLinkDEField.getPSDERMust();
								PSDERDTO psDERDTO = globalPSDERDTOMap.get(iPSDER.getId());
								if(psDERDTO == null) {
									throw new Exception(String.format("无法获取实体关系[%1$s]数据对象", iPSDER.getId()));
								}
								psDEFieldDTO.setO2MPSDERId(psDERDTO.getPSDERId());
								psDEFieldDTO.setO2MPSDERName(psDERDTO.getPSDERName());
							}
							else
								if(iPSDEField instanceof IPSOne2OneDataDEField) {
									IPSOne2OneDataDEField iPSLinkDEField = (IPSOne2OneDataDEField)iPSDEField;
									IPSDERBase iPSDER = iPSLinkDEField.getPSDERMust();
									PSDERDTO psDERDTO = globalPSDERDTOMap.get(iPSDER.getId());
									if(psDERDTO == null) {
										throw new Exception(String.format("无法获取实体关系[%1$s]数据对象", iPSDER.getId()));
									}
									psDEFieldDTO.setO2OPSDERId(psDERDTO.getPSDERId());
									psDEFieldDTO.setO2OPSDERName(psDERDTO.getPSDERName());
								}
						psDEFieldDTOList.add(psDEFieldDTO);
					}
				}
			}
		}
	
		// 批建立
		if (!bRefreshOnly && psDEFieldDTOList.size() > 0) {
			PSModelServiceUtils.getInstance().createPSDEFields(psDEFieldDTOList);
			syncPSDEFields(iPSSystem, true);
		}
	}

	
	protected void syncPSDEActions(IPSSystem iPSSystem, boolean bRefreshOnly) throws Throwable {
		
		globalPSDEActionDTOMap.clear();
		Map<String, PSDEActionDTO> psDEActionDTOMap = new HashMap<>();
		PSDEActionFilter psModelSearchContextDTO = new PSDEActionFilter();
		List<PSDEActionDTO> list = PSModelServiceUtils.getInstance().searchAllPSDEActions(psModelSearchContextDTO);
		if(!ObjectUtils.isEmpty(list)) {
			for (PSDEActionDTO psDEActionDTO : list) {
				String strTag = String.format("%1$s|%2$s", psDEActionDTO.getPSDEId(), psDEActionDTO.getPSDEActionName());
				if(psDEActionDTOMap.containsKey(strTag)) {
					log.warn(String.format("实体行为[%1$s]已经在列表中", strTag));
					continue;
				}
				psDEActionDTOMap.put(strTag, psDEActionDTO);
			}
		}
		
				
		List<PSDEActionDTO> psDEActionDTOList = new ArrayList<PSDEActionDTO>();

		java.util.List<IPSDataEntity> psDataEntities = iPSSystem.getAllPSDataEntities();
		if (psDataEntities != null) {
			for (IPSDataEntity iPSDataEntity : psDataEntities) {
				java.util.List<IPSDEAction> psDEActions = iPSDataEntity.getAllPSDEActions();
				if (psDEActions != null) {
					for (IPSDEAction iPSDEAction : psDEActions) {
						PSDataEntityDTO psDataEntityDTO = globalPSDataEntityDTOMap.get(iPSDataEntity.getId());
						if(psDataEntityDTO == null) {
							throw new Exception(String.format("无法获取系统实体[%1$s]数据对象", iPSDataEntity.getId()));
						}
						String strTag = String.format("%1$s|%2$s", psDataEntityDTO.getPSDataEntityId(), iPSDEAction.getName());

						PSDEActionDTO psDEActionDTO = psDEActionDTOMap.get(strTag);
						if (psDEActionDTO != null) {
							globalPSDEActionDTOMap.put(iPSDEAction.getId(), psDEActionDTO);
							continue;
						}
						if (bRefreshOnly) {
							continue;
						}
						psDEActionDTO = new PSDEActionDTO();
						psDEActionDTO.setPSDEActionName(iPSDEAction.getName());
						psDEActionDTO.setCodeName(iPSDEAction.getCodeName());
						psDEActionDTO.setLogicName(iPSDEAction.getLogicName());
						psDEActionDTO.setSrfSystemFlag(1);
						psDEActionDTO.setPSDEId(psDataEntityDTO.getPSDataEntityId());
						psDEActionDTO.setPSDEName(psDataEntityDTO.getPSDataEntityName());
						psDEActionDTO.setActionType( DEActionType.BUILTIN.value);
						psDEActionDTO.setActionMode(iPSDEAction.getActionMode());
						
						psDEActionDTOList.add(psDEActionDTO);
					}
				}
			}
		}
	
		// 批建立
		if (!bRefreshOnly && psDEActionDTOList.size() > 0) {
			PSModelServiceUtils.getInstance().createPSDEActions(psDEActionDTOList);
			syncPSDEActions(iPSSystem, true);
		}
	}


	protected void syncPSDEDataSets(IPSSystem iPSSystem, boolean bRefreshOnly) throws Throwable {
		
		globalPSDEDataSetDTOMap.clear();
		Map<String, PSDEDataSetDTO> psDEDataSetDTOMap = new HashMap<>();
		
		PSDEDataSetFilter psModelSearchContextDTO = new PSDEDataSetFilter();
		List<PSDEDataSetDTO> list = PSModelServiceUtils.getInstance().searchAllPSDEDataSets(psModelSearchContextDTO);
		if(!ObjectUtils.isEmpty(list)) {
			for (PSDEDataSetDTO psDEDataSetDTO : list) {
				String strTag = String.format("%1$s|%2$s", psDEDataSetDTO.getPSDEId(), psDEDataSetDTO.getPSDEDataSetName());
				if(psDEDataSetDTOMap.containsKey(strTag)) {
					log.warn(String.format("实体行为[%1$s]已经在列表中", strTag));
					continue;
				}
				psDEDataSetDTOMap.put(strTag, psDEDataSetDTO);
			}
		}
		
				
		List<PSDEDataSetDTO> psDEDataSetDTOList = new ArrayList<PSDEDataSetDTO>();

		java.util.List<IPSDataEntity> psDataEntities = iPSSystem.getAllPSDataEntities();
		if (psDataEntities != null) {
			for (IPSDataEntity iPSDataEntity : psDataEntities) {
				java.util.List<IPSDEDataSet> psDEDataSets = iPSDataEntity.getAllPSDEDataSets();
				if (psDEDataSets != null) {
					for (IPSDEDataSet iPSDEDataSet : psDEDataSets) {
						PSDataEntityDTO psDataEntityDTO = globalPSDataEntityDTOMap.get(iPSDataEntity.getId());
						if(psDataEntityDTO == null) {
							throw new Exception(String.format("无法获取系统实体[%1$s]数据对象", iPSDataEntity.getId()));
						}
						String strTag = String.format("%1$s|%2$s", psDataEntityDTO.getPSDataEntityId(), iPSDEDataSet.getName());

						PSDEDataSetDTO psDEDataSetDTO = psDEDataSetDTOMap.get(strTag);
						if (psDEDataSetDTO != null) {
							globalPSDEDataSetDTOMap.put(iPSDEDataSet.getId(), psDEDataSetDTO);
							continue;
						}
						if (bRefreshOnly) {
							continue;
						}
						psDEDataSetDTO = new PSDEDataSetDTO();
						psDEDataSetDTO.setPSDEDataSetName(iPSDEDataSet.getName());
						psDEDataSetDTO.setCodeName(iPSDEDataSet.getCodeName());
						psDEDataSetDTO.setLogicName(iPSDEDataSet.getLogicName());
						psDEDataSetDTO.setSrfSystemFlag(1);
						psDEDataSetDTO.setPSDEId(psDataEntityDTO.getPSDataEntityId());
						psDEDataSetDTO.setPSDEName(psDataEntityDTO.getPSDataEntityName());
						
						psDEDataSetDTOList.add(psDEDataSetDTO);
					}
				}
			}
		}
	
		// 批建立
		if (!bRefreshOnly && psDEDataSetDTOList.size() > 0) {
			PSModelServiceUtils.getInstance().createPSDEDataSets(psDEDataSetDTOList);
			syncPSDEDataSets(iPSSystem, true);
		}
	}
	
	
	protected void syncPSDEForms(IPSSystem iPSSystem, boolean bRefreshOnly) throws Throwable {
		
		globalPSDEFormDTOMap.clear();
		Map<String, PSDEFormDTO> psDEFormDTOMap = new HashMap<>();
		PSDEFormFilter psModelSearchContextDTO = new PSDEFormFilter();
		List<PSDEFormDTO> list = PSModelServiceUtils.getInstance().searchAllPSDEForms(psModelSearchContextDTO);
		if(!ObjectUtils.isEmpty(list)) {
			for (PSDEFormDTO psDEFormDTO : list) {
				String strTag = String.format("%1$s|%2$s", psDEFormDTO.getPSDEId(), psDEFormDTO.getCodeName());
				if(psDEFormDTOMap.containsKey(strTag)) {
					log.warn(String.format("实体表单[%1$s]已经在列表中", strTag));
					continue;
				}
				psDEFormDTOMap.put(strTag, psDEFormDTO);
			}
		}
		
				
		List<PSDEFormDTO> psDEFormDTOList = new ArrayList<PSDEFormDTO>();

		java.util.List<IPSDataEntity> psDataEntities = iPSSystem.getAllPSDataEntities();
		if (psDataEntities != null) {
			for (IPSDataEntity iPSDataEntity : psDataEntities) {
				java.util.List<IPSModelData> psModelDatas = iPSDataEntity.getAllPSModelDatas();
				if (psModelDatas != null) {
					for (IPSModelData iPSModelData : psModelDatas) {
						if(!PSModels.PSDEFORM.equals(iPSModelData.getRealModelType())) {
							continue;
						}
						PSDataEntityDTO psDataEntityDTO = globalPSDataEntityDTOMap.get(iPSDataEntity.getId());
						if(psDataEntityDTO == null) {
							throw new Exception(String.format("无法获取系统实体[%1$s]数据对象", iPSDataEntity.getId()));
						}
						String strTag = String.format("%1$s|%2$s", psDataEntityDTO.getPSDataEntityId(), iPSModelData.getCodeName());

						PSDEFormDTO psDEFormDTO = psDEFormDTOMap.get(strTag);
						if (psDEFormDTO != null) {
							globalPSDEFormDTOMap.put(strTag, psDEFormDTO);
							continue;
						}
						if (bRefreshOnly) {
							continue;
						}
						psDEFormDTO = new PSDEFormDTO();
						psDEFormDTO.setPSDEFormName(iPSModelData.getName());
						psDEFormDTO.setCodeName(iPSModelData.getCodeName());
						psDEFormDTO.setSrfSystemFlag(1);
						psDEFormDTO.setPSDEId(psDataEntityDTO.getPSDataEntityId());
						psDEFormDTO.setPSDEName(psDataEntityDTO.getPSDataEntityName());
						psDEFormDTO.setFormType(iPSModelData.getRealModelSubType());
						psDEFormDTO.setFuncMode(iPSModelData.getModelTag());
						
						psDEFormDTOList.add(psDEFormDTO);
					}
				}
			}
		}
	
		// 批建立
		if (!bRefreshOnly && psDEFormDTOList.size() > 0) {
			PSModelServiceUtils.getInstance().createPSDEForms(psDEFormDTOList);
			syncPSDEForms(iPSSystem, true);
		}
	}

	
	protected void syncPSDEViewBases(IPSSystem iPSSystem, boolean bRefreshOnly) throws Throwable {
		
		globalPSDEViewBaseDTOMap.clear();
		Map<String, PSDEViewBaseDTO> psDEViewBaseDTOMap = new HashMap<>();
		PSDEViewBaseFilter psModelSearchContextDTO = new PSDEViewBaseFilter();
		List<PSDEViewBaseDTO> list = PSModelServiceUtils.getInstance().searchAllPSDEViewBases(psModelSearchContextDTO);
		if(!ObjectUtils.isEmpty(list)) {
			for (PSDEViewBaseDTO psDEViewBaseDTO : list) {
				String strTag = String.format("%1$s|%2$s", psDEViewBaseDTO.getPSDEId(), psDEViewBaseDTO.getCodeName());
				if(psDEViewBaseDTOMap.containsKey(strTag)) {
					log.warn(String.format("实体视图[%1$s]已经在列表中", strTag));
					continue;
				}
				psDEViewBaseDTOMap.put(strTag, psDEViewBaseDTO);
			}
		}
		
				
		List<PSDEViewBaseDTO> psDEViewBaseDTOList = new ArrayList<PSDEViewBaseDTO>();

		java.util.List<IPSDataEntity> psDataEntities = iPSSystem.getAllPSDataEntities();
		if (psDataEntities != null) {
			for (IPSDataEntity iPSDataEntity : psDataEntities) {
				java.util.List<IPSModelData> psModelDatas = iPSDataEntity.getAllPSModelDatas();
				if (psModelDatas != null) {
					for (IPSModelData iPSModelData : psModelDatas) {
						if(!PSModels.PSDEVIEWBASE.equals(iPSModelData.getRealModelType())) {
							continue;
						}
						PSDataEntityDTO psDataEntityDTO = globalPSDataEntityDTOMap.get(iPSDataEntity.getId());
						if(psDataEntityDTO == null) {
							throw new Exception(String.format("无法获取系统实体[%1$s]数据对象", iPSDataEntity.getId()));
						}
						String strTag = String.format("%1$s|%2$s", psDataEntityDTO.getPSDataEntityId(), iPSModelData.getCodeName());

						PSDEViewBaseDTO psDEViewBaseDTO = psDEViewBaseDTOMap.get(strTag);
						if (psDEViewBaseDTO != null) {
							globalPSDEViewBaseDTOMap.put(strTag, psDEViewBaseDTO);
							continue;
						}
						if (bRefreshOnly) {
							continue;
						}
						psDEViewBaseDTO = new PSDEViewBaseDTO();
						psDEViewBaseDTO.setPSDEViewBaseName(iPSModelData.getName());
						psDEViewBaseDTO.setCodeName(iPSModelData.getCodeName());
						psDEViewBaseDTO.setSrfSystemFlag(1);
						psDEViewBaseDTO.setPSDEId(psDataEntityDTO.getPSDataEntityId());
						psDEViewBaseDTO.setPSDEName(psDataEntityDTO.getPSDataEntityName());
						psDEViewBaseDTO.setPSDEViewBaseType(iPSModelData.getRealModelSubType());
						psDEViewBaseDTO.setPredefinedViewType(iPSModelData.getModelTag());
						psDEViewBaseDTO.setPDVTParam(iPSModelData.getModelTag2());
						
						psDEViewBaseDTOList.add(psDEViewBaseDTO);
					}
				}
			}
		}
	
		// 批建立
		if (!bRefreshOnly && psDEViewBaseDTOList.size() > 0) {
			PSModelServiceUtils.getInstance().createPSDEViewBases(psDEViewBaseDTOList);
			syncPSDEViewBases(iPSSystem, true);
		}
	}


	protected void syncPSWFDEs(IPSSystem iPSSystem, boolean bRefreshOnly) throws Throwable {
		
		globalPSWFDEDTOMap.clear();
		Map<String, PSWFDEDTO> psWFDEDTOMap = new HashMap<>();
		PSWFDEFilter psModelSearchContextDTO = new PSWFDEFilter();
		List<PSWFDEDTO> list = PSModelServiceUtils.getInstance().searchAllPSWFDEs(psModelSearchContextDTO);
		if(!ObjectUtils.isEmpty(list)) {
			for (PSWFDEDTO psWFDEDTO : list) {
				String strTag = String.format("%1$s|%2$s", psWFDEDTO.getPSDEId(), psWFDEDTO.getPSWFId());
				if(psWFDEDTOMap.containsKey(strTag)) {
					log.warn(String.format("实体工作流[%1$s]已经在列表中", strTag));
					continue;
				}
				psWFDEDTOMap.put(strTag, psWFDEDTO);
			}
		}
		
				
		List<PSWFDEDTO> psWFDEDTOList = new ArrayList<PSWFDEDTO>();

		java.util.List<IPSDataEntity> psDataEntities = iPSSystem.getAllPSDataEntities();
		if (psDataEntities != null) {
			for (IPSDataEntity iPSDataEntity : psDataEntities) {
				java.util.List<IPSDEWF> psWFDEs = iPSDataEntity.getAllPSDEWFs();
				if (psWFDEs != null) {
					for (IPSDEWF iPSWFDE : psWFDEs) {
						PSDataEntityDTO psDataEntityDTO = globalPSDataEntityDTOMap.get(iPSDataEntity.getId());
						if(psDataEntityDTO == null) {
							throw new Exception(String.format("无法获取系统实体[%1$s]数据对象", iPSDataEntity.getId()));
						}
						
						PSWorkflowDTO psWorkflowDTO = globalPSWorkflowDTOMap.get(iPSWFDE.getPSWorkflowMust().getId());
						if(psWorkflowDTO == null) {
							throw new Exception(String.format("无法获取系统工作流[%1$s]数据对象", iPSWFDE.getPSWorkflowMust().getId()));
						}
						
						String strTag = String.format("%1$s|%2$s", psDataEntityDTO.getPSDataEntityId(), psWorkflowDTO.getPSWorkflowId());

						PSWFDEDTO psWFDEDTO = psWFDEDTOMap.get(strTag);
						if (psWFDEDTO != null) {
							globalPSWFDEDTOMap.put(iPSWFDE.getId(), psWFDEDTO);
							continue;
						}
						if (bRefreshOnly) {
							continue;
						}
						psWFDEDTO = new PSWFDEDTO();
						psWFDEDTO.setPSWFDEName(iPSWFDE.getName());
						psWFDEDTO.setCodeName(iPSWFDE.getCodeName());
						psWFDEDTO.setSrfSystemFlag(1);
						psWFDEDTO.setPSDEId(psDataEntityDTO.getPSDataEntityId());
						psWFDEDTO.setPSDEName(psDataEntityDTO.getPSDataEntityName());
						
						psWFDEDTO.setPSWFId(psWorkflowDTO.getPSWorkflowId());
						psWFDEDTO.setPSWFName(psWorkflowDTO.getPSWorkflowName());
						
						String strTag2 = String.format("%1$s|%2$s", psDataEntityDTO.getPSDataEntityId(), iPSWFDE.getUDStatePSDEFieldMust().getName());
						
						PSDEFieldDTO udStatePSDEFieldDTO = globalPSDEFieldDTOMap.get(strTag2);
						if(udStatePSDEFieldDTO == null) {
							throw new Exception(String.format("无法获取实体属性[%1$s]数据对象", strTag2));
						}
						
						psWFDEDTO.setStatePSDEFId(udStatePSDEFieldDTO.getPSDEFieldId());
						psWFDEDTO.setStatePSDEFName(udStatePSDEFieldDTO.getPSDEFieldName());
						
						psWFDEDTOList.add(psWFDEDTO);
					}
				}
			}
		}
	
		// 批建立
		if (!bRefreshOnly && psWFDEDTOList.size() > 0) {
			PSModelServiceUtils.getInstance().createPSWFDEs(psWFDEDTOList);
			syncPSWFDEs(iPSSystem, true);
		}
	}


	
	protected void syncPSDERs(IPSSystem iPSSystem, boolean bRefreshOnly) throws Throwable {
		
		globalPSDERDTOMap.clear();
		// 查询全部关系
		PSDERFilter psModelSearchContextDTO = new PSDERFilter();
		List<PSDERDTO> list = PSModelServiceUtils.getInstance().searchAllPSDERs(psModelSearchContextDTO);
		Map<String, PSDERDTO> psDERDTOMap = new HashMap<>();
		if(!ObjectUtils.isEmpty(list)) {
			for (PSDERDTO psDERDTO : list) {
				String strTag = String.format("%1$s|%2$s|%3$s", psDERDTO.getDERType(), psDERDTO.getMajorPSDEId(), psDERDTO.getMinorPSDEId());
				psDERDTOMap.put(strTag, psDERDTO);
			}
		}
	

		List<PSDERDTO> psDERDTOList = new ArrayList<PSDERDTO>();

		java.util.List<IPSDataEntity> psDataEntities = iPSSystem.getAllPSDataEntities();
		if (psDataEntities != null) {
			for (IPSDataEntity iPSDataEntity : psDataEntities) {
				java.util.List<IPSDERBase> psDERs = iPSDataEntity.getMinorPSDERs();
				if (psDERs != null) {
					for (IPSDERBase iPSDER : psDERs) {
						PSDataEntityDTO majorPSDataEntityDTO = globalPSDataEntityDTOMap.get(iPSDER.getMajorPSDataEntityMust().getId());
						if(majorPSDataEntityDTO == null) {
							throw new Exception(String.format("无法获取系统实体[%1$s]数据对象", iPSDER.getMajorPSDataEntityMust().getId()));
						}
						PSDataEntityDTO minorPSDataEntityDTO = globalPSDataEntityDTOMap.get(iPSDER.getMinorPSDataEntityMust().getId());
						if(minorPSDataEntityDTO == null) {
							throw new Exception(String.format("无法获取系统实体[%1$s]数据对象", iPSDER.getMinorPSDataEntityMust().getId()));
						}
						String strTag = String.format("%1$s|%2$s|%3$s", iPSDER.getDERType(), majorPSDataEntityDTO.getPSDataEntityId(), minorPSDataEntityDTO.getPSDataEntityId());

						PSDERDTO psDERDTO = psDERDTOMap.get(strTag);
						if (psDERDTO != null) {
							globalPSDERDTOMap.put(iPSDER.getId(), psDERDTO);
							continue;
						}
						if (bRefreshOnly) {
							continue;
						}
						psDERDTO = new PSDERDTO();
						psDERDTO.setPSDERName(iPSDER.getName());
						psDERDTO.setCodeName(iPSDER.getCodeName());
						psDERDTO.setDERType(iPSDER.getDERType());
						psDERDTO.setMajorPSDEId(majorPSDataEntityDTO.getPSDataEntityId());
						psDERDTO.setMajorPSDEName(majorPSDataEntityDTO.getPSDataEntityName());
						psDERDTO.setMinorPSDEId(minorPSDataEntityDTO.getPSDataEntityId());
						psDERDTO.setMinorPSDEName(minorPSDataEntityDTO.getPSDataEntityName());
						psDERDTO.setLogicName(iPSDER.getLogicName());
						psDERDTO.setSrfSystemFlag(1);
						psDERDTOList.add(psDERDTO);
					}
				}
				
				
			}
		}
	
		// 批建立
		if (!bRefreshOnly && psDERDTOList.size() > 0) {
			PSModelServiceUtils.getInstance().createPSDERs(psDERDTOList);
			syncPSDERs(iPSSystem, true);
		}
	}

	
	protected void syncPSSysRefs(IPSSystem iPSSystem, boolean bRefreshOnly) throws Throwable {
		globalPSSysRefDTOMap.clear();
		// 查询全部子系统
		PSSysRefFilter psModelSearchContextDTO = new PSSysRefFilter();
		List<PSSysRefDTO> list = PSModelServiceUtils.getInstance().searchAllPSSysRefs(psModelSearchContextDTO);
		Map<String, PSSysRefDTO> psSysRefDTOMap = new HashMap<>();
		if(!ObjectUtils.isEmpty(list)) {
			for (PSSysRefDTO psSysRefDTO : list) {

				psSysRefDTOMap.put(psSysRefDTO.getRealSysId(), psSysRefDTO);

			}
		}
		

		List<PSSysRefDTO> psSysRefDTOList = new ArrayList<PSSysRefDTO>();

		// 获取当前系统模块
		java.util.List<IPSSysRef> psSysRefs = iPSSystem.getAllPSSysRefs();
		if (psSysRefs != null) {
			for (IPSSysRef iPSSysRef : psSysRefs) {
				if (!StringUtils.hasLength(iPSSysRef.getSysRefTag())) {
					continue;
				}

				PSSysRefDTO psSysRefDTO = psSysRefDTOMap.get(iPSSysRef.getSysRefTag());
				if (psSysRefDTO != null) {
					globalPSSysRefDTOMap.put(iPSSysRef.getId(), psSysRefDTOMap.get(iPSSysRef.getSysRefTag()));
					continue;
				}
				if (bRefreshOnly) {
					continue;
				}
				psSysRefDTO = new PSSysRefDTO();
				psSysRefDTO.setPSSysRefName(iPSSysRef.getName());
				psSysRefDTO.setSysRefType(iPSSysRef.getSysRefType());
				psSysRefDTO.setRealSysId(iPSSysRef.getSysRefTag());
				psSysRefDTO.setSrfSystemFlag(1);
				psSysRefDTOList.add(psSysRefDTO);

			}
		}
		// 批建立
		if (!bRefreshOnly && psSysRefDTOList.size() > 0) {
			PSModelServiceUtils.getInstance().createPSSysRefs(psSysRefDTOList);
			syncPSSysRefs(iPSSystem, true);
		}
	}

	protected void syncPSSysModelGroups(IPSSystem iPSSystem, boolean bRefreshOnly) throws Throwable {
		globalPSSysModelGroupDTOMap.clear();
		// 查询全部模型组
		PSSysModelGroupFilter psModelSearchContextDTO = new PSSysModelGroupFilter();
		List<PSSysModelGroupDTO> list = PSModelServiceUtils.getInstance().searchAllPSSysModelGroups(psModelSearchContextDTO);
		Map<String, PSSysModelGroupDTO> psSysModelGroupDTOMap = new HashMap<>();
		if(!ObjectUtils.isEmpty(list)) {
			for (PSSysModelGroupDTO psSysModelGroupDTO : list) {

				psSysModelGroupDTOMap.put(psSysModelGroupDTO.getCodeName(), psSysModelGroupDTO);

			}
		}
		

		List<PSSysModelGroupDTO> psSysModelGroupDTOList = new ArrayList<PSSysModelGroupDTO>();

		// 获取当前系统模块
		java.util.List<IPSSysModelGroup> psSysModelGroups = iPSSystem.getAllPSSysModelGroups();
		if (psSysModelGroups != null) {
			for (IPSSysModelGroup iPSSysModelGroup : psSysModelGroups) {
				if (!StringUtils.hasLength(iPSSysModelGroup.getCodeName())) {
					continue;
				}

				PSSysModelGroupDTO psSysModelGroupDTO = psSysModelGroupDTOMap.get(iPSSysModelGroup.getCodeName());
				if (psSysModelGroupDTO != null) {
					globalPSSysModelGroupDTOMap.put(iPSSysModelGroup.getId(), psSysModelGroupDTOMap.get(iPSSysModelGroup.getCodeName()));
					continue;
				}
				if (bRefreshOnly) {
					continue;
				}
				psSysModelGroupDTO = new PSSysModelGroupDTO();
				psSysModelGroupDTO.setPSSysModelGroupName(iPSSysModelGroup.getName());
				psSysModelGroupDTO.setCodeName(iPSSysModelGroup.getCodeName());
				psSysModelGroupDTO.setSrfSystemFlag(1);
				psSysModelGroupDTOList.add(psSysModelGroupDTO);
			}
		}
		// 批建立
		if (!bRefreshOnly && psSysModelGroupDTOList.size() > 0) {
			PSModelServiceUtils.getInstance().createPSSysModelGroups(psSysModelGroupDTOList);
			syncPSSysModelGroups(iPSSystem, true);
		}
	}
	
	
	
	protected void syncPSWorkflows(IPSSystem iPSSystem, boolean bRefreshOnly) throws Throwable {
		
		globalPSWorkflowDTOMap.clear();
		// 查询全部工作流
		PSWorkflowFilter psModelSearchContextDTO = new PSWorkflowFilter();
		List<PSWorkflowDTO> list = PSModelServiceUtils.getInstance().searchAllPSWorkflows(psModelSearchContextDTO);
		Map<String, PSWorkflowDTO> psWorkflowDTOMap = new HashMap<>();
		if(!ObjectUtils.isEmpty(list)) {
			for (PSWorkflowDTO psWorkflowDTO : list) {
				String strTag = null;
				if(StringUtils.hasLength(psWorkflowDTO.getPSModuleId())) {
					strTag = String.format("PSMODULE|%1$s|%2$s", psWorkflowDTO.getPSModuleId(), psWorkflowDTO.getCodeName());
				}else {
					strTag = psWorkflowDTO.getCodeName();
				}
				psWorkflowDTOMap.put(strTag, psWorkflowDTO);
			}
		}
		

		List<PSWorkflowDTO> psWorkflowDTOList = new ArrayList<PSWorkflowDTO>();

		// 获取当前实体
		java.util.List<IPSWorkflow> psWorkflows = iPSSystem.getAllPSWorkflows();
		if (psWorkflows != null) {
			for (IPSWorkflow iPSWorkflow : psWorkflows) {
				String strTag = null;
				PSModuleDTO psModuleDTO = null;
				if(iPSWorkflow.getPSSystemModule()!=null) {
					psModuleDTO = globalPSModuleDTOMap.get(iPSWorkflow.getPSSystemModuleMust().getId());
					if(psModuleDTO == null) {
						throw new Exception(String.format("无法获取系统模块[%1$s]数据对象", iPSWorkflow.getPSSystemModuleMust().getId()));
					}
					strTag = String.format("PSMODULE|%1$s|%2$s", psModuleDTO.getPSModuleId(), iPSWorkflow.getCodeName());
				}
				else {
					strTag = iPSWorkflow.getCodeName();
				}
				PSWorkflowDTO psWorkflowDTO = psWorkflowDTOMap.get(strTag);
				if (psWorkflowDTO != null) {
					globalPSWorkflowDTOMap.put(iPSWorkflow.getId(), psWorkflowDTO);
					continue;
				}
				if (bRefreshOnly) {
					continue;
				}
				psWorkflowDTO = new PSWorkflowDTO();
				psWorkflowDTO.setPSWorkflowName(iPSWorkflow.getName());
				psWorkflowDTO.setCodeName(iPSWorkflow.getCodeName());
				if(psModuleDTO!=null) {
					psWorkflowDTO.setPSModuleId(psModuleDTO.getPSModuleId());
					psWorkflowDTO.setPSModuleName(psModuleDTO.getPSModuleName());
				}

				psWorkflowDTO.setSrfSystemFlag(1);
				psWorkflowDTOList.add(psWorkflowDTO);
			}
		}

		// 批建立
		if (!bRefreshOnly && psWorkflowDTOList.size() > 0) {
			PSModelServiceUtils.getInstance().createPSWorkflows(psWorkflowDTOList);
			syncPSWorkflows(iPSSystem, true);
		}
	}
	
	
	protected void syncPSWFRoles(IPSSystem iPSSystem, boolean bRefreshOnly) throws Throwable {
		
		globalPSWFRoleDTOMap.clear();
		// 查询全部工作流角色
		PSWFRoleFilter psModelSearchContextDTO = new PSWFRoleFilter();
		List<PSWFRoleDTO> list = PSModelServiceUtils.getInstance().searchAllPSWFRoles(psModelSearchContextDTO);
		Map<String, PSWFRoleDTO> psWFRoleDTOMap = new HashMap<>();
		if(!ObjectUtils.isEmpty(list)) {
			for (PSWFRoleDTO psWFRoleDTO : list) {
				String strTag = null;
				if(StringUtils.hasLength(psWFRoleDTO.getPSModuleId())) {
					strTag = String.format("PSMODULE|%1$s|%2$s", psWFRoleDTO.getPSModuleId(), psWFRoleDTO.getCodeName());
				}else {
					strTag = psWFRoleDTO.getCodeName();
				}
				psWFRoleDTOMap.put(strTag, psWFRoleDTO);
			}
		}
		

		List<PSWFRoleDTO> psWFRoleDTOList = new ArrayList<PSWFRoleDTO>();

		// 获取当前实体
		java.util.List<IPSWFRole> psWFRoles = iPSSystem.getAllPSWFRoles();
		if (psWFRoles != null) {
			for (IPSWFRole iPSWFRole : psWFRoles) {
				String strTag = null;
				PSModuleDTO psModuleDTO = null;
				if(iPSWFRole.getPSSystemModule()!=null) {
					psModuleDTO = globalPSModuleDTOMap.get(iPSWFRole.getPSSystemModuleMust().getId());
					if(psModuleDTO == null) {
						throw new Exception(String.format("无法获取系统模块[%1$s]数据对象", iPSWFRole.getPSSystemModuleMust().getId()));
					}
					strTag = String.format("PSMODULE|%1$s|%2$s", psModuleDTO.getPSModuleId(), iPSWFRole.getCodeName());
				}
				else {
					strTag = iPSWFRole.getCodeName();
				}
				PSWFRoleDTO psWFRoleDTO = psWFRoleDTOMap.get(strTag);
				if (psWFRoleDTO != null) {
					globalPSWFRoleDTOMap.put(iPSWFRole.getId(), psWFRoleDTO);
					continue;
				}
				if (bRefreshOnly) {
					continue;
				}
				psWFRoleDTO = new PSWFRoleDTO();
				psWFRoleDTO.setPSWFRoleName(iPSWFRole.getName());
				psWFRoleDTO.setCodeName(iPSWFRole.getCodeName());
				psWFRoleDTO.setWFRoleType(iPSWFRole.getWFRoleType());
				psWFRoleDTO.setWFRoleSN(iPSWFRole.getWFRoleSN());
				if(psModuleDTO!=null) {
					psWFRoleDTO.setPSModuleId(psModuleDTO.getPSModuleId());
					psWFRoleDTO.setPSModuleName(psModuleDTO.getPSModuleName());
				}

				psWFRoleDTO.setSrfSystemFlag(1);
				psWFRoleDTOList.add(psWFRoleDTO);
			}
		}

		// 批建立
		if (!bRefreshOnly && psWFRoleDTOList.size() > 0) {
			PSModelServiceUtils.getInstance().createPSWFRoles(psWFRoleDTOList);
			syncPSWFRoles(iPSSystem, true);
		}
	}
	
	
	protected void syncPSWFWorkTimes(IPSSystem iPSSystem, boolean bRefreshOnly) throws Throwable {
		
		globalPSWFWorkTimeDTOMap.clear();
		// 查询全部工作流时间
		PSWFWorkTimeFilter psModelSearchContextDTO = new PSWFWorkTimeFilter();
		List<PSWFWorkTimeDTO> list = PSModelServiceUtils.getInstance().searchAllPSWFWorkTimes(psModelSearchContextDTO);
		Map<String, PSWFWorkTimeDTO> psWFWorkTimeDTOMap = new HashMap<>();
		if(!ObjectUtils.isEmpty(list)) {
			for (PSWFWorkTimeDTO psWFWorkTimeDTO : list) {
				String strTag = null;
				if(StringUtils.hasLength(psWFWorkTimeDTO.getPSModuleId())) {
					strTag = String.format("PSMODULE|%1$s|%2$s", psWFWorkTimeDTO.getPSModuleId(), psWFWorkTimeDTO.getCodeName());
				}else {
					strTag = psWFWorkTimeDTO.getCodeName();
				}
				psWFWorkTimeDTOMap.put(strTag, psWFWorkTimeDTO);
			}
		}
		

		List<PSWFWorkTimeDTO> psWFWorkTimeDTOList = new ArrayList<PSWFWorkTimeDTO>();

		// 获取当前实体
		java.util.List<IPSWFWorkTime> psWFWorkTimes = iPSSystem.getAllPSWFWorkTimes();
		if (psWFWorkTimes != null) {
			for (IPSWFWorkTime iPSWFWorkTime : psWFWorkTimes) {
				String strTag = null;
				PSModuleDTO psModuleDTO = null;
				if(iPSWFWorkTime.getPSSystemModule()!=null) {
					psModuleDTO = globalPSModuleDTOMap.get(iPSWFWorkTime.getPSSystemModuleMust().getId());
					if(psModuleDTO == null) {
						throw new Exception(String.format("无法获取系统模块[%1$s]数据对象", iPSWFWorkTime.getPSSystemModuleMust().getId()));
					}
					strTag = String.format("PSMODULE|%1$s|%2$s", psModuleDTO.getPSModuleId(), iPSWFWorkTime.getCodeName());
				}
				else {
					strTag = iPSWFWorkTime.getCodeName();
				}
				PSWFWorkTimeDTO psWFWorkTimeDTO = psWFWorkTimeDTOMap.get(strTag);
				if (psWFWorkTimeDTO != null) {
					globalPSWFWorkTimeDTOMap.put(iPSWFWorkTime.getId(), psWFWorkTimeDTO);
					continue;
				}
				if (bRefreshOnly) {
					continue;
				}
				psWFWorkTimeDTO = new PSWFWorkTimeDTO();
				psWFWorkTimeDTO.setPSWFWorkTimeName(iPSWFWorkTime.getName());
				psWFWorkTimeDTO.setCodeName(iPSWFWorkTime.getCodeName());
				psWFWorkTimeDTO.setWFWorktimeSN(iPSWFWorkTime.getWFWorkTimeSN());
				if(psModuleDTO!=null) {
					psWFWorkTimeDTO.setPSModuleId(psModuleDTO.getPSModuleId());
					psWFWorkTimeDTO.setPSModuleName(psModuleDTO.getPSModuleName());
				}

				psWFWorkTimeDTO.setSrfSystemFlag(1);
				psWFWorkTimeDTOList.add(psWFWorkTimeDTO);
			}
		}

		// 批建立
		if (!bRefreshOnly && psWFWorkTimeDTOList.size() > 0) {
			PSModelServiceUtils.getInstance().createPSWFWorkTimes(psWFWorkTimeDTOList);
			syncPSWFWorkTimes(iPSSystem, true);
		}
	}
	
	
	protected void syncPSSysMsgTempls(IPSSystem iPSSystem, boolean bRefreshOnly) throws Throwable {
		
		globalPSSysMsgTemplDTOMap.clear();
		// 查询全部系统消息模板
		PSSysMsgTemplFilter psModelSearchContextDTO = new PSSysMsgTemplFilter();
		List<PSSysMsgTemplDTO> list = PSModelServiceUtils.getInstance().searchAllPSSysMsgTempls(psModelSearchContextDTO);
		Map<String, PSSysMsgTemplDTO> psSysMsgTemplDTOMap = new HashMap<>();
		if(!ObjectUtils.isEmpty(list)) {
			for (PSSysMsgTemplDTO psSysMsgTemplDTO : list) {
				String strTag = null;
				if(StringUtils.hasLength(psSysMsgTemplDTO.getPSModuleId())) {
					strTag = String.format("PSMODULE|%1$s|%2$s", psSysMsgTemplDTO.getPSModuleId(), psSysMsgTemplDTO.getCodeName());
				}else {
					strTag = psSysMsgTemplDTO.getCodeName();
				}
				psSysMsgTemplDTOMap.put(strTag, psSysMsgTemplDTO);
			}
		}
		
		

		List<PSSysMsgTemplDTO> psSysMsgTemplDTOList = new ArrayList<PSSysMsgTemplDTO>();

		// 获取当前实体
		java.util.List<IPSSysMsgTempl> psSysMsgTempls = iPSSystem.getAllPSSysMsgTempls();
		if (psSysMsgTempls != null) {
			for (IPSSysMsgTempl iPSSysMsgTempl : psSysMsgTempls) {
				String strTag = null;
				PSModuleDTO psModuleDTO = null;
				if(iPSSysMsgTempl.getPSSystemModule()!=null) {
					psModuleDTO = globalPSModuleDTOMap.get(iPSSysMsgTempl.getPSSystemModuleMust().getId());
					if(psModuleDTO == null) {
						throw new Exception(String.format("无法获取系统模块[%1$s]数据对象", iPSSysMsgTempl.getPSSystemModuleMust().getId()));
					}
					strTag = String.format("PSMODULE|%1$s|%2$s", psModuleDTO.getPSModuleId(), iPSSysMsgTempl.getCodeName());
				}
				else {
					strTag = iPSSysMsgTempl.getCodeName();
				}
				PSSysMsgTemplDTO psSysMsgTemplDTO = psSysMsgTemplDTOMap.get(strTag);
				if (psSysMsgTemplDTO != null) {
					globalPSSysMsgTemplDTOMap.put(iPSSysMsgTempl.getId(), psSysMsgTemplDTO);
					continue;
				}
				if (bRefreshOnly) {
					continue;
				}
				psSysMsgTemplDTO = new PSSysMsgTemplDTO();
				psSysMsgTemplDTO.setPSSysMsgTemplName(iPSSysMsgTempl.getName());
				psSysMsgTemplDTO.setCodeName(iPSSysMsgTempl.getCodeName());
				psSysMsgTemplDTO.setContentType(iPSSysMsgTempl.getContentType());
				psSysMsgTemplDTO.setContent(iPSSysMsgTempl.getContent());
				if(psModuleDTO!=null) {
					psSysMsgTemplDTO.setPSModuleId(psModuleDTO.getPSModuleId());
					psSysMsgTemplDTO.setPSModuleName(psModuleDTO.getPSModuleName());
				}

				psSysMsgTemplDTO.setSrfSystemFlag(1);
				psSysMsgTemplDTOList.add(psSysMsgTemplDTO);
			}
		}

		// 批建立
		if (!bRefreshOnly && psSysMsgTemplDTOList.size() > 0) {
			PSModelServiceUtils.getInstance().createPSSysMsgTempls(psSysMsgTemplDTOList);
			syncPSSysMsgTempls(iPSSystem, true);
		}
	}
	
	
	
	protected void syncPSSysDELogicNodes(IPSSystem iPSSystem, boolean bRefreshOnly) throws Throwable {
		
		globalPSSysDELogicNodeDTOMap.clear();
		// 查询全部系统消息模板
		PSSysDELogicNodeFilter psModelSearchContextDTO = new PSSysDELogicNodeFilter();
		List<PSSysDELogicNodeDTO> list = PSModelServiceUtils.getInstance().searchAllPSSysDELogicNodes(psModelSearchContextDTO);
		Map<String, PSSysDELogicNodeDTO> psSysDELogicNodeDTOMap = new HashMap<>();
		if(!ObjectUtils.isEmpty(list)) {
			for (PSSysDELogicNodeDTO psSysDELogicNodeDTO : list) {
				String strTag = null;
				if(StringUtils.hasLength(psSysDELogicNodeDTO.getPSModuleId())) {
					strTag = String.format("PSMODULE|%1$s|%2$s", psSysDELogicNodeDTO.getPSModuleId(), psSysDELogicNodeDTO.getCodeName());
				}else {
					strTag = psSysDELogicNodeDTO.getCodeName();
				}
				psSysDELogicNodeDTOMap.put(strTag, psSysDELogicNodeDTO);
			}
		}
		

		List<PSSysDELogicNodeDTO> psSysDELogicNodeDTOList = new ArrayList<PSSysDELogicNodeDTO>();

		// 获取当前实体
		java.util.List<IPSSysLogic> psSysDELogicNodes = iPSSystem.getAllPSSysLogics();
		if (psSysDELogicNodes != null) {
			for (IPSSysLogic iPSSysDELogicNode : psSysDELogicNodes) {
				String strTag = null;
				PSModuleDTO psModuleDTO = null;
				if(iPSSysDELogicNode.getPSSystemModule()!=null) {
					psModuleDTO = globalPSModuleDTOMap.get(iPSSysDELogicNode.getPSSystemModuleMust().getId());
					if(psModuleDTO == null) {
						throw new Exception(String.format("无法获取系统模块[%1$s]数据对象", iPSSysDELogicNode.getPSSystemModuleMust().getId()));
					}
					strTag = String.format("PSMODULE|%1$s|%2$s", psModuleDTO.getPSModuleId(), iPSSysDELogicNode.getCodeName());
				}
				else {
					strTag = iPSSysDELogicNode.getCodeName();
				}
				PSSysDELogicNodeDTO psSysDELogicNodeDTO = psSysDELogicNodeDTOMap.get(strTag);
				if (psSysDELogicNodeDTO != null) {
					globalPSSysDELogicNodeDTOMap.put(iPSSysDELogicNode.getId(), psSysDELogicNodeDTO);
					continue;
				}
				if (bRefreshOnly) {
					continue;
				}
				psSysDELogicNodeDTO = new PSSysDELogicNodeDTO();
				psSysDELogicNodeDTO.setPSSysDELogicNodeName(iPSSysDELogicNode.getName());
				psSysDELogicNodeDTO.setCodeName(iPSSysDELogicNode.getCodeName());
				
				if(psModuleDTO!=null) {
					psSysDELogicNodeDTO.setPSModuleId(psModuleDTO.getPSModuleId());
					psSysDELogicNodeDTO.setPSModuleName(psModuleDTO.getPSModuleName());
				}

				psSysDELogicNodeDTO.setSrfSystemFlag(1);
				psSysDELogicNodeDTOList.add(psSysDELogicNodeDTO);
			}
		}

		// 批建立
		if (!bRefreshOnly && psSysDELogicNodeDTOList.size() > 0) {
			PSModelServiceUtils.getInstance().createPSSysDELogicNodes(psSysDELogicNodeDTOList);
			syncPSSysDELogicNodes(iPSSystem, true);
		}
	}
}
