package net.ibizsys.model.util.transpiler;

import java.util.HashMap;
import java.util.Map;

import net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowLink;
import net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNode;
import net.ibizsys.model.dataentity.logic.IPSDEMSLogicLink;
import net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode;
import net.ibizsys.model.dataentity.logic.IPSDEUILogicLink;
import net.ibizsys.model.dataentity.logic.IPSDEUILogicNode;
import net.ibizsys.model.dataentity.logic.IPSDELogicLink;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.IPSSystem;
import net.ibizsys.model.IPSSystemService;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.app.codelist.IPSAppCodeList;
import net.ibizsys.model.app.dataentity.IPSAppDEACMode;
import net.ibizsys.model.app.dataentity.IPSAppDEAction;
import net.ibizsys.model.app.dataentity.IPSAppDEDataSet;
import net.ibizsys.model.app.dataentity.IPSAppDEMethod;
import net.ibizsys.model.app.dataentity.IPSAppDEUIAction;
import net.ibizsys.model.app.dataentity.IPSAppDEUIActionGroup;
import net.ibizsys.model.app.dataentity.IPSAppDataEntity;
import net.ibizsys.model.codelist.IPSCodeList;
import net.ibizsys.model.control.IPSControl;
import net.ibizsys.model.control.drctrl.IPSDEDRCtrl;
import net.ibizsys.model.control.form.IPSDEForm;
import net.ibizsys.model.control.grid.IPSDEGrid;
import net.ibizsys.model.control.menu.IPSAppMenu;
import net.ibizsys.model.control.toolbar.IPSDEToolbar;
import net.ibizsys.model.control.tree.IPSDETree;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.action.IPSDEActionLogic;
import net.ibizsys.model.util.DataTypeUtils;
import net.ibizsys.model.valuerule.IPSSysValueRule;

public class PSModelTranspileContext implements IPSModelTranspileContext {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(PSModelTranspileContext.class);

	static {

	}

	private Map<String, Object> paramMap = new HashMap<String, Object>();
	private Map<Class<?>, IPSModelTranspiler> psModelTranspilerMap = new HashMap<>();
	private Map<Class<?>, IPSModelListTranspiler> psModelListTranspilerMap = new HashMap<>();
	private IPSSystemService iPSSystemService = null;
	private IPSApplication iPSApplication = null;
	//private IPSModelObject compileOwner = null;

	public PSModelTranspileContext() {

	}

	@Override
	public Object getParam(String strKey) {
		return this.paramMap.get(strKey);
	}

	@Override
	public void setParam(String strKey, Object objValue) {
		this.paramMap.put(strKey, objValue);

	}

	@Override
	public String getParam(String strKey, String strDefault) {
		Object objValue = this.getParam(strKey);
		if (objValue != null) {
			if (objValue instanceof String) {
				if (!ObjectUtils.isEmpty(objValue)) {
					return (String) objValue;
				}
			} else {
				return objValue.toString();
			}
		}
		return strDefault;
	}



	@Override
	public int getParam(String strKey, int nDefault) {
		Object objValue = this.getParam(strKey);
		if (objValue != null) {
			return DataTypeUtils.asInteger(objValue, nDefault);
		}
		return nDefault;
	}

	@Override
	public long getParam(String strKey, long nDefault) {
		Object objValue = this.getParam(strKey);
		if (objValue != null) {
			return DataTypeUtils.asLong(objValue, nDefault);
		}
		return nDefault;
	}


	@Override
	public double getParam(String strKey, double fDefault) {
		Object objValue = this.getParam(strKey);
		if (objValue != null) {
			return DataTypeUtils.asDouble(objValue, fDefault);
		}
		return fDefault;
	}

	@Override
	public boolean getParam(String strKey, boolean bDefault) {
		Object objValue = this.getParam(strKey);
		if (objValue != null) {
			return DataTypeUtils.asBoolean(objValue, bDefault);
		}
		return bDefault;
	}


	public void registerPSModelTranspiler(Class<?> cls, IPSModelTranspiler iPSModelTranspiler) {
		this.psModelTranspilerMap.put(cls, iPSModelTranspiler);
	}

	public void registerPSModelListTranspiler(Class<?> cls, IPSModelListTranspiler iPSModelListTranspiler) {
		this.psModelListTranspilerMap.put(cls, iPSModelListTranspiler);
	}

	@Override
	public IPSModelTranspiler getPSModelTranspiler(Class<?> cls, boolean bTryMode) throws Exception {
		IPSModelTranspiler iPSModelTranspiler = psModelTranspilerMap.get(cls);
		if(iPSModelTranspiler == null) {
			iPSModelTranspiler =  psModelListTranspilerMap.get(cls);
		}
		if (iPSModelTranspiler != null) {
			return iPSModelTranspiler;
		}
		return PSModelTranspilerFactory.getInstance().getPSModelTranspiler(cls, bTryMode);
	}

	@Override
	public IPSModelListTranspiler getPSModelListTranspiler(Class<?> cls, boolean bTryMode) throws Exception {
		IPSModelListTranspiler iPSModelListTranspiler = psModelListTranspilerMap.get(cls);
		if (iPSModelListTranspiler != null) {
			return iPSModelListTranspiler;
		}
		return PSModelTranspilerFactory.getInstance().getPSModelListTranspiler(cls, bTryMode);
	}

	@Override
	public String getPSModelUniqueTag(IPSModelObject iPSModelObject) throws Exception {
		return this.internalGetPSModelUniqueTag(iPSModelObject);
	}

	protected String internalGetPSModelUniqueTag(IPSModelObject iPSModelObject) throws Exception {
		if (iPSModelObject instanceof IPSDEForm
				|| iPSModelObject instanceof IPSDEGrid
				|| iPSModelObject instanceof IPSDEToolbar
				|| iPSModelObject instanceof IPSDETree
				|| iPSModelObject instanceof IPSDEDRCtrl) {
			IPSControl iPSControl = (IPSControl) iPSModelObject;
			if (iPSControl.getPSAppDataEntity() != null && iPSControl.getPSAppDataEntity().getPSDataEntity() != null) {
				return String.format("%1$s.%2$s", PSModelUtils.calcFullUniqueTag2((IPSModelObject) iPSControl.getPSAppDataEntity().getPSDataEntity(), true), iPSControl.getCodeName());
			}
		}
		else if (iPSModelObject instanceof IPSAppDEUIAction) {
			IPSAppDEUIAction iPSAppDEUIAction = (IPSAppDEUIAction) iPSModelObject;
			if (iPSAppDEUIAction.getPSAppDataEntity() != null && iPSAppDEUIAction.getPSAppDataEntity().getPSDataEntity() != null) {
				return String.format("%1$s.%2$s", PSModelUtils.calcFullUniqueTag2((IPSModelObject) iPSAppDEUIAction.getPSAppDataEntity().getPSDataEntity(), true), iPSAppDEUIAction.getCodeName());
			}
			else {
				//反馈全局应用实体界面行为
				return iPSAppDEUIAction.getCodeName();
			}

		}else if (iPSModelObject instanceof IPSAppDEUIActionGroup) {
			IPSAppDEUIActionGroup iPSAppDEUIActionGroup = (IPSAppDEUIActionGroup) iPSModelObject;
			if (iPSAppDEUIActionGroup.getPSAppDataEntity() != null && iPSAppDEUIActionGroup.getPSAppDataEntity().getPSDataEntity() != null) {
				return String.format("%1$s.%2$s", PSModelUtils.calcFullUniqueTag2((IPSModelObject) iPSAppDEUIActionGroup.getPSAppDataEntity().getPSDataEntity(), true), iPSAppDEUIActionGroup.getCodeName());
			}
			else {
				//反馈全局应用实体界面行为组
				return iPSAppDEUIActionGroup.getCodeName();
			}

		} else if (iPSModelObject instanceof IPSDEActionLogic) {
			IPSDEAction iPSDEAction = iPSModelObject.getParentPSModelObject(IPSDEAction.class, false);
			if (!ObjectUtils.isEmpty(iPSDEAction.getPreparePSDEActionLogics())) {
				int nPos = iPSDEAction.getPreparePSDEActionLogics().indexOf(iPSModelObject);
				if (nPos != -1) {
					return String.format("%1$s.prepare%2$s", getPSModelUniqueTag(iPSDEAction), (nPos + 1) * 100);
				}
			}
			if (!ObjectUtils.isEmpty(iPSDEAction.getCheckPSDEActionLogics())) {
				int nPos = iPSDEAction.getCheckPSDEActionLogics().indexOf(iPSModelObject);
				if (nPos != -1) {
					return String.format("%1$s.check%2$s", getPSModelUniqueTag(iPSDEAction), (nPos + 1) * 100);
				}
			}
			if (!ObjectUtils.isEmpty(iPSDEAction.getBeforePSDEActionLogics())) {
				int nPos = iPSDEAction.getBeforePSDEActionLogics().indexOf(iPSModelObject);
				if (nPos != -1) {
					return String.format("%1$s.before%2$s", getPSModelUniqueTag(iPSDEAction), (nPos + 1) * 100);
				}
			}
			if (!ObjectUtils.isEmpty(iPSDEAction.getAfterPSDEActionLogics())) {
				int nPos = iPSDEAction.getAfterPSDEActionLogics().indexOf(iPSModelObject);
				if (nPos != -1) {
					return String.format("%1$s.after%2$s", getPSModelUniqueTag(iPSDEAction), (nPos + 1) * 100);
				}
			}
		} else if (iPSModelObject instanceof IPSAppMenu) {
			IPSApplication iPSApplcation = iPSModelObject.getPSModelObject(IPSApplication.class, false);
			return String.format("%1$s.%2$s", PSModelUtils.calcFullUniqueTag2(iPSApplcation, true), iPSModelObject.getCodeName());
		} else if (iPSModelObject instanceof IPSAppCodeList) {
			IPSAppCodeList iPSAppCodeList = (IPSAppCodeList) iPSModelObject;
			if (StringUtils.hasLength(iPSAppCodeList.getCodeListTag())) {
				IPSSystem iPSSystem = iPSModelObject.getParentPSModelObject(IPSSystem.class, false);
				for (IPSCodeList iPSCodeList : iPSSystem.getAllPSCodeLists()) {
					if (iPSAppCodeList.getCodeListTag().equals(iPSCodeList.getCodeListTag())) {
						return PSModelUtils.calcFullUniqueTag2(iPSCodeList, true);
					}
				}
			}
		} else if (iPSModelObject instanceof IPSAppDEMethod) {
			IPSAppDEMethod iPSAppDEMethod = (IPSAppDEMethod) iPSModelObject;
			IPSAppDataEntity iPSAppDataEntity = iPSAppDEMethod.getParentPSModelObject(IPSAppDataEntity.class, false);
			if (iPSAppDataEntity.getPSDataEntity() != null) {
				if(net.ibizsys.model.PSModelEnums.AppDEMethodType.DEACTION.value.equals(iPSAppDEMethod.getMethodType())) {
					return String.format("%1$s.%2$s", PSModelUtils.calcFullUniqueTag2((IPSModelObject) iPSAppDataEntity.getPSDataEntity(), true), iPSAppDEMethod.getCodeName());
				}
				if(net.ibizsys.model.PSModelEnums.AppDEMethodType.FETCH.value.equals(iPSAppDEMethod.getMethodType())) {
					String strCodeName = iPSAppDEMethod.getCodeName();
					if (StringUtils.hasLength(strCodeName)) {
						String strCodeName2 = strCodeName.toLowerCase();
						if (strCodeName2.indexOf("fetch_") == 0) {
							strCodeName = strCodeName.substring(6);
						}
						else
						if (strCodeName2.indexOf("fetch") == 0) {
							strCodeName = strCodeName.substring(5);
						}
					}
					return String.format("%1$s.%2$s", PSModelUtils.calcFullUniqueTag2((IPSModelObject) iPSAppDataEntity.getPSDataEntity(), true), strCodeName);
				}
			}
		} else if (iPSModelObject instanceof IPSAppDEAction) {
			IPSAppDEAction iPSAppDEAction = (IPSAppDEAction) iPSModelObject;
			IPSAppDataEntity iPSAppDataEntity = iPSAppDEAction.getParentPSModelObject(IPSAppDataEntity.class, false);
			if (iPSAppDataEntity.getPSDataEntity() != null) {
				return String.format("%1$s.%2$s", PSModelUtils.calcFullUniqueTag2((IPSModelObject) iPSAppDataEntity.getPSDataEntity(), true), iPSAppDEAction.getCodeName());
			}
		} else if (iPSModelObject instanceof IPSAppDEDataSet) {
			IPSAppDEDataSet iPSAppDEDataSet = (IPSAppDEDataSet) iPSModelObject;
			IPSAppDataEntity iPSAppDataEntity = iPSAppDEDataSet.getParentPSModelObject(IPSAppDataEntity.class, false);
			if (iPSAppDataEntity.getPSDataEntity() != null) {
				String strCodeName = iPSAppDEDataSet.getCodeName();
				if (StringUtils.hasLength(strCodeName)) {
					String strCodeName2 = strCodeName.toLowerCase();
					if (strCodeName2.indexOf("fetch_") == 0) {
						strCodeName = strCodeName.substring(6);
					}
					else
					if (strCodeName2.indexOf("fetch") == 0) {
						strCodeName = strCodeName.substring(5);
					}
				}
				return String.format("%1$s.%2$s", PSModelUtils.calcFullUniqueTag2((IPSModelObject) iPSAppDataEntity.getPSDataEntity(), true), strCodeName);
			}
		} else if (iPSModelObject instanceof IPSAppDEACMode) {
			IPSAppDEACMode iPSAppDEACMode = (IPSAppDEACMode) iPSModelObject;
			IPSAppDataEntity iPSAppDataEntity = iPSAppDEACMode.getParentPSModelObject(IPSAppDataEntity.class, false);
			if (iPSAppDataEntity.getPSDataEntity() != null) {
				return String.format("%1$s.%2$s", PSModelUtils.calcFullUniqueTag2((IPSModelObject) iPSAppDataEntity.getPSDataEntity(), true), iPSAppDEACMode.getCodeName());
			}
		} else if (iPSModelObject instanceof IPSDEMSLogicLink) {
			IPSDEMSLogicLink iPSDEMSLogicLink = (IPSDEMSLogicLink) iPSModelObject;
			IPSDEMSLogicNode IPSDEMSLogicNode = iPSDEMSLogicLink.getParentPSModelObject(IPSDEMSLogicNode.class, false);
			return String.format("%1$s.%2$s", PSModelUtils.calcFullUniqueTag2((IPSModelObject) IPSDEMSLogicNode, true), iPSDEMSLogicLink.getDstPSDEMSLogicNode().getId());
		} else if (iPSModelObject instanceof IPSDELogicLink) {
			IPSDELogicLink iPSDELogicLink = (IPSDELogicLink) iPSModelObject;
			IPSDELogicNode iPSDELogicNode = iPSDELogicLink.getParentPSModelObject(IPSDELogicNode.class, false);
			return String.format("%1$s.%2$s", PSModelUtils.calcFullUniqueTag2((IPSModelObject) iPSDELogicNode, true), iPSDELogicLink.getDstPSDELogicNode().getId());
		} else if (iPSModelObject instanceof IPSDEUILogicLink) {
			IPSDEUILogicLink iPSDEUILogicLink = (IPSDEUILogicLink) iPSModelObject;
			IPSDEUILogicNode iPSDEUILogicNode = iPSDEUILogicLink.getParentPSModelObject(IPSDEUILogicNode.class, false);
			return String.format("%1$s.%2$s", PSModelUtils.calcFullUniqueTag2((IPSModelObject) iPSDEUILogicNode, true), iPSDEUILogicLink.getDstPSDEUILogicNode().getId());
		} else if (iPSModelObject instanceof IPSDEDataFlowLink) {
			IPSDEDataFlowLink iPSDEDataFlowLink = (IPSDEDataFlowLink) iPSModelObject;
			IPSDEDataFlowNode iPSDEDataFlowNode = iPSDEDataFlowLink.getParentPSModelObject(IPSDEDataFlowNode.class, false);
			return String.format("%1$s.%2$s", PSModelUtils.calcFullUniqueTag2((IPSModelObject) iPSDEDataFlowNode, true), iPSDEDataFlowLink.getDstPSDEDataFlowNode().getId());
		} else if (iPSModelObject instanceof IPSSysValueRule) {
			IPSSysValueRule iPSSysValueRule = (IPSSysValueRule)iPSModelObject;
			if(StringUtils.hasLength(iPSSysValueRule.getUniqueTag())) {
				return iPSSysValueRule.getUniqueTag().replace("__", ".");
			}
		}
		

		return PSModelUtils.calcFullUniqueTag2((IPSModelObject) iPSModelObject, true);
	}

	@Override
	public IPSSystemService getPSSystemService() {
		return iPSSystemService;
	}

	public void setPSSystemService(IPSSystemService iPSSystemService) {
		this.iPSSystemService = iPSSystemService;
	}

//	@Override
//	public IPSModelObject getCompileOwner() {
//		return this.compileOwner;
//	}
//	
//	//@Override
//	public void setCompileOwner(IPSModelObject iPSModelObject) {
//		this.compileOwner = iPSModelObject;
//	}

	@Override
	public IPSApplication getPSApplication() {
		return this.iPSApplication;
	}


	public void setPSApplication(IPSApplication iPSApplication) {
		this.iPSApplication = iPSApplication;
	}

	@Override
	public IPSSystem getPSSystem() {
		if(getPSSystemService()!=null) {
			return getPSSystemService().getPSSystem();
		}
		return null;
	}



}
