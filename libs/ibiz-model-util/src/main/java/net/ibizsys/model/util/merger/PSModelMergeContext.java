package net.ibizsys.model.util.merger;

import java.util.HashMap;
import java.util.Map;

import net.ibizsys.model.IPSModelData;
import net.ibizsys.model.app.dataentity.IPSAppDEMethod;
import net.ibizsys.model.app.dataentity.IPSAppDERS;
import net.ibizsys.model.app.dataentity.IPSAppDEUIAction;
import net.ibizsys.model.app.dataentity.IPSAppDEUIActionGroup;
import net.ibizsys.model.app.dataentity.PSAppDEMethodImpl;
import net.ibizsys.model.app.view.IPSAppView;
import net.ibizsys.model.control.IPSControl;
import net.ibizsys.model.control.form.PSDEFDLogicImpl;
import net.ibizsys.model.control.panel.PSPanelItemLogicImpl;
import net.ibizsys.model.control.tree.PSDETreeImpl;
import net.ibizsys.model.dataentity.action.IPSDEActionLogic;
import net.ibizsys.model.dataentity.dataflow.PSDEDataFlowImpl;
import net.ibizsys.model.dataentity.datamap.IPSDEMapAction;
import net.ibizsys.model.dataentity.datamap.IPSDEMapDataQuery;
import net.ibizsys.model.dataentity.datamap.IPSDEMapDataSet;
import net.ibizsys.model.dataentity.datamap.IPSDEMapField;
import net.ibizsys.model.dataentity.ds.IPSDEDQCondition;
import net.ibizsys.model.dataentity.ds.IPSDEDQGroupCondition;
import net.ibizsys.model.dataentity.ds.IPSDEDataQueryCode;
import net.ibizsys.model.dataentity.ds.PSDEDQConditionImpl;
import net.ibizsys.model.dataentity.ds.PSDEDataQueryCodeImpl;
import net.ibizsys.model.dataentity.logic.PSDELogicImpl;
import net.ibizsys.model.dataentity.logic.PSDEMSLogicImpl;
import net.ibizsys.model.dataentity.logic.PSDEUILogicImpl;
import net.ibizsys.model.dataentity.search.IPSDESearch;
import net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS;
import net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup;
import net.ibizsys.model.res.IPSLanguageItem;
import net.ibizsys.model.service.IPSSubSysServiceAPIDERS;
import net.ibizsys.model.util.merger.extend.app.PSApplicationMergerEx;
import net.ibizsys.model.util.merger.extend.control.menu.PSAppMenuMergerEx;
import net.ibizsys.model.util.merger.extend.dataentity.uiaction.PSDEUIActionGroupMergerEx;
import net.ibizsys.model.wf.PSWFVersionImpl;

public class PSModelMergeContext implements IPSModelMergeContext {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(PSModelMergeContext.class);
	
	private static Map<String, String> psModelMergeTagMap = new HashMap<String, String>();
	private static Map<String, Boolean> psModelMergeAppendOnlyMap = new HashMap<String, Boolean>();
	private static Map<String, Boolean> psModelMergeChildMap = new HashMap<String, Boolean>();
	private static Map<String, Boolean> psModelMergeSingleMap = new HashMap<String, Boolean>();
	private static Map<String, String> mergeObjectMap = new HashMap<String, String>();
	
	static {
		psModelMergeTagMap.put(IPSLanguageItem.class.getSimpleName(), "lanResTag");
		psModelMergeTagMap.put(IPSAppDERS.class.getSimpleName(), "name");
		psModelMergeTagMap.put(IPSDEServiceAPIRS.class.getSimpleName(), "name");
		psModelMergeTagMap.put(IPSSubSysServiceAPIDERS.class.getSimpleName(), "name");
		psModelMergeTagMap.put(IPSControl.class.getSimpleName(), "name");
		psModelMergeTagMap.put(IPSAppDEMethod.class.getSimpleName(), "methodType;codeName");
		
		psModelMergeAppendOnlyMap.put(IPSAppDEUIAction.class.getSimpleName(), true);
		psModelMergeAppendOnlyMap.put(IPSDEActionLogic.class.getSimpleName(), true);
		
		//实体映射支持附加
		psModelMergeAppendOnlyMap.put(IPSDEMapField.class.getSimpleName(), true);
		psModelMergeAppendOnlyMap.put(IPSDEMapAction.class.getSimpleName(), true);
		psModelMergeAppendOnlyMap.put(IPSDEMapDataSet.class.getSimpleName(), true);
		psModelMergeAppendOnlyMap.put(IPSDEMapDataQuery.class.getSimpleName(), true);
		
		//实体搜索
		psModelMergeAppendOnlyMap.put(IPSDESearch.class.getSimpleName(), true);
		
		
		psModelMergeChildMap.put(IPSDEDQCondition.class.getSimpleName(), false);
		psModelMergeChildMap.put(IPSDEDQGroupCondition.class.getSimpleName(), false);
		psModelMergeChildMap.put(IPSDEDataQueryCode.class.getSimpleName(), false);
		psModelMergeChildMap.put(IPSAppView.class.getSimpleName(), false);
		
		
		psModelMergeChildMap.put(IPSModelData.class.getSimpleName(), false);
		
		//psModelMergeChildMap.put(IPSApplication.class.getSimpleName(), false);
		
		
		psModelMergeChildMap.put(PSDEDataFlowImpl.class.getSimpleName(), false);
		psModelMergeChildMap.put(PSDELogicImpl.class.getSimpleName(), false);
		psModelMergeChildMap.put(PSDEMSLogicImpl.class.getSimpleName(), false);
		psModelMergeChildMap.put(PSDEUILogicImpl.class.getSimpleName(), false);
		psModelMergeChildMap.put(PSDEDataFlowImpl.class.getSimpleName(), false);
		psModelMergeChildMap.put(PSWFVersionImpl.class.getSimpleName(), false);
		psModelMergeChildMap.put(PSAppDEMethodImpl.class.getSimpleName(), false);
		
		
		psModelMergeChildMap.put(PSDETreeImpl.class.getSimpleName(), false);
		psModelMergeChildMap.put(PSDEFDLogicImpl.class.getSimpleName(), false);
		psModelMergeChildMap.put(PSPanelItemLogicImpl.class.getSimpleName(), false);
		
		psModelMergeChildMap.put(PSDEDQConditionImpl.class.getSimpleName(), false);
		psModelMergeChildMap.put(PSDEDataQueryCodeImpl.class.getSimpleName(), false);
		
		
		psModelMergeSingleMap.put(IPSAppDEUIActionGroup.class.getSimpleName(), true);
		psModelMergeSingleMap.put(IPSDEUIActionGroup.class.getSimpleName(), true);
		//psModelMergeChildMap.put(PSDETreeGridExImpl.class.getSimpleName(), false);
	}
	
	private String strPSModelFolderPath = null;
	private String strMergePSModelFolderPath = null;
	private String strDstPSModelFolderPath = null;
	
	private Map<String, Object> paramMap = new HashMap<String, Object>();
	private Map<Class<?>, IPSModelMerger> psModelMergerMap = new HashMap<>();
	private Map<Class<?>, IPSModelListMerger> psModelListMergerMap = new HashMap<>();
	
	private static PSApplicationMergerEx psApplicationMergerEx = new PSApplicationMergerEx();
	private static PSDEUIActionGroupMergerEx psDEUIActionGroupMergerEx = new PSDEUIActionGroupMergerEx();
	private static PSAppMenuMergerEx psAppMenuMergerEx = new PSAppMenuMergerEx();
	
	
	public PSModelMergeContext() {
		this.registerPSModelMerger(net.ibizsys.model.app.PSApplicationImpl.class, psApplicationMergerEx);
		this.registerPSModelMerger(net.ibizsys.model.dataentity.uiaction.PSDEUIActionGroupImpl.class, psDEUIActionGroupMergerEx);
		this.registerPSModelMerger(net.ibizsys.model.control.menu.PSAppMenuImpl.class, psAppMenuMergerEx);
	}
	
	@Override
	public String getPSModelFolderPath() {
		return this.strPSModelFolderPath;
	}

	@Override
	public String getMergePSModelFolderPath() {
		return this.strMergePSModelFolderPath;
	}

	@Override
	public String getDstPSModelFolderPath() {
		return this.strDstPSModelFolderPath;
	}

	public void setPSModelFolderPath(String strPSModelFolderPath) {
		this.strPSModelFolderPath = strPSModelFolderPath;
	}

	public void setMergePSModelFolderPath(String strMergePSModelFolderPath) {
		this.strMergePSModelFolderPath = strMergePSModelFolderPath;
	}

	public void setDstPSModelFolderPath(String strDstPSModelFolderPath) {
		this.strDstPSModelFolderPath = strDstPSModelFolderPath;
	}

	@Override
	public String getPSModelTagField(Class<?> cls) {
		return psModelMergeTagMap.get(cls.getSimpleName());
	}

	@Override
	public Boolean isEnableMergeChild(Class<?> cls) {
		return psModelMergeChildMap.get(cls.getSimpleName());
	}
	
	@Override
	public Boolean isEnableMergeSingle(Class<?> cls) {
		return psModelMergeSingleMap.get(cls.getSimpleName());
	}

	

	@Override
	public Boolean isAppendChildOnly(Class<?> cls) {
		return psModelMergeAppendOnlyMap.get(cls.getSimpleName());
	}

	@Override
	public Boolean isEnableMergeChild(Class<?> cls, String strFieldName) {
		return isEnableMergeChild(cls);
	}

	@Override
	public Object getParam(String strKey) {
		return this.paramMap.get(strKey);
	}

	@Override
	public void setParam(String strKey, Object objValue) {
		this.paramMap.put(strKey, objValue);
		
	}
	
	public void registerPSModelMerger(Class<?> cls, IPSModelMerger iPSModelMerger) {
		this.psModelMergerMap.put(cls, iPSModelMerger);
	}
	
	public void registerPSModelListMerger(Class<?> cls, IPSModelListMerger iPSModelListMerger) {
		this.psModelListMergerMap.put(cls, iPSModelListMerger);
	}

	@Override
	public IPSModelMerger getPSModelMerger(Class<?> cls, boolean bTryMode) throws Exception {
		IPSModelMerger iPSModelMerger = psModelMergerMap.get(cls);
		if(iPSModelMerger != null) {
			return iPSModelMerger;
		}
		return PSModelMergerFactory.getInstance().getPSModelMerger(cls, bTryMode);
	}
	
	@Override
	public IPSModelListMerger getPSModelListMerger(Class<?> cls, boolean bTryMode) throws Exception {
		IPSModelListMerger iPSModelListMerger = psModelListMergerMap.get(cls);
		if(iPSModelListMerger != null) {
			return iPSModelListMerger;
		}
		return PSModelMergerFactory.getInstance().getPSModelListMerger(cls, bTryMode);
	}

	@Override
	public boolean logMerge(Object object, String strFieldName) {
		
//		long address = VM.current().addressOf(object);
//		
//		String strLogTag = String.format("%1$s|%2$s",Long.toHexString(address), strFieldName);
//		if(mergeObjectMap.containsKey(strLogTag)) {
//			return false;
//		}
//		mergeObjectMap.put(strLogTag, "");
		return true;
	}
	
	
	

}
