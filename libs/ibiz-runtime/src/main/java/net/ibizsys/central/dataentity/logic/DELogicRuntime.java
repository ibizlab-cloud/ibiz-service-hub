package net.ibizsys.central.dataentity.logic;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.IDynaInstRuntime;
import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.dataentity.DataEntityModelRuntimeBase;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.ExceptionEntity;
import net.ibizsys.central.util.IExceptionEntity;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelEnums.DEFLogicMode;
import net.ibizsys.model.PSModelEnums.LogicSubType;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.logic.IPSDEEndLogic;
import net.ibizsys.model.dataentity.logic.IPSDEFLogic;
import net.ibizsys.model.dataentity.logic.IPSDELogic;
import net.ibizsys.model.dataentity.logic.IPSDELogicLink;
import net.ibizsys.model.dataentity.logic.IPSDELogicLinkCond;
import net.ibizsys.model.dataentity.logic.IPSDELogicLinkGroupCond;
import net.ibizsys.model.dataentity.logic.IPSDELogicLinkSingleCond;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.model.dataentity.logic.IPSDELogicNodeParam;
import net.ibizsys.model.dataentity.logic.IPSDELogicParam;
import net.ibizsys.model.dataentity.logic.IPSDERawCodeLogic;
import net.ibizsys.model.dataentity.logic.IPSDESFPluginLogic;
import net.ibizsys.model.dataentity.logic.IPSDEThrowExceptionLogic;
import net.ibizsys.runtime.ISystemUtilRuntime;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeBaseContext;
import net.ibizsys.runtime.dataentity.action.IDEScriptLogicRuntime;
import net.ibizsys.runtime.res.ISysSequenceRuntime;
import net.ibizsys.runtime.util.Conditions;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.LogCats;

public class DELogicRuntime extends DataEntityModelRuntimeBase implements IDELogicRuntime {

	private static final Log log = LogFactory.getLog(DELogicRuntime.class);
	
	private Map<Integer, IDELogicScriptNodeRuntime> deLogicScriptNodeRuntimeMap = new HashMap<Integer, IDELogicScriptNodeRuntime>();
	
	private IDataEntityRuntimeBaseContext iDataEntityRuntimeBaseContext = null;
	private IPSDELogic iPSDELogic = null; 
	private Map<String, IDataEntityRuntime> paramDataEntityRuntimeMap = new HashMap<>();
	private Map<String, IDELogicNodeRuntime> deLogicNodeRuntimeMap = new HashMap<>();
	private Map<String, IDELogicParamRuntime> deLogicParamRuntimeMap = new HashMap<>();
	private IDEScriptLogicRuntime iDEScriptLogicRuntime = null;
	private int nDebugMode = DELogicDebugModes.NONE;
	private IDELogicParamRuntime defaultDELogicParamRuntime = null;
	
	private IDELogicRuntimeContext iDELogicRuntimeContext = new IDELogicRuntimeContext() {

		@Override
		public IDataEntityRuntime getDataEntityRuntime() {
			return getSelf().getDataEntityRuntime();
		}
		
		@Override
		public IDELogicRuntime getDELogicRuntime() {
			return getSelf();
		}

		@Override
		public IDynaInstRuntime getDynaInstRuntime() {
			return getSelf().getDynaInstRuntime();
		}

		@Override
		public ISystemRuntime getSystemRuntime() {
			return getSelf().getSystemRuntime();
		}

//		@Override
//		public IDELogicNodeRuntime getDELogicNodeRuntime(IPSDELogicNode iPSDELogicNode) {
//			return getSelf().getDELogicNodeRuntime(iPSDELogicNode);
//		}

		@Override
		public Object getNodeParamValue(IDELogicSession iDELogicSession, IPSDELogicNodeParam iPSDELogicNodeParam) throws Throwable {
			return getSelf().getNodeParamValue(iDELogicSession, iPSDELogicNodeParam);
		}
		
		@Override
		public IDELogicScriptNodeRuntime getDEScriptLogicRuntime(IPSDELogicNode iPSDELogicNode, String strScriptCode, String strMode, boolean bTryMode) throws Throwable{
			return getSelf().getDEScriptLogicRuntime(iPSDELogicNode, strScriptCode, strMode, bTryMode);
		}
		
		@Override
		public void executeNode(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable{
			getSelf().executePSDELogicNode(iDELogicSession, iPSDELogicNode);
		}
		
		@Override
		public boolean testLinkCond(IDELogicSession iDELogicSession, IPSDELogicLinkCond iPSDELogicLinkCond) throws Throwable {
			return getSelf().testPSDELogicLinkCond(iDELogicSession, iPSDELogicLinkCond);
		}

		@Override
		public Object getLogicParamValue(IDELogicSession iDELogicSession, String strLogicParamCodeName) throws Throwable {
			return getSelf().getLogicParamValue(iDELogicSession, strLogicParamCodeName);
		}

		@Override
		public Object getNodeParamValue(IPSDELogicNodeParam iPSDELogicNodeParam) throws Throwable {
			return getSelf().getNodeParamValue(DELogicSession.getCurrentMust(), iPSDELogicNodeParam);
		}

		@Override
		public Object getLogicParamValue(String strLogicParamCodeName) throws Throwable {
			return getSelf().getLogicParamValue(DELogicSession.getCurrentMust(), strLogicParamCodeName);
		}
	};
	
	@Override
	public void init(IDataEntityRuntimeBaseContext iDataEntityRuntimeBaseContext, IPSDELogic iPSDELogic) throws Exception {
		
		this.setDataEntityRuntimeBase(iDataEntityRuntimeBaseContext.getDataEntityRuntime());
		this.iDataEntityRuntimeBaseContext = iDataEntityRuntimeBaseContext;
		this.iPSDELogic = iPSDELogic;
		this.setDebugMode(this.getPSDELogic().getDebugMode());
		this.onInit();
	}
	
	@Override
	protected void onInit() throws Exception {
		
		List<IPSDELogicParam> psDELogicParamList = getPSDELogic().getPSDELogicParams();
		if(psDELogicParamList != null) {
			for(IPSDELogicParam iPSDELogicParam : psDELogicParamList) {
				if(!StringUtils.hasLength(iPSDELogicParam.getCodeName())) {
					throw new Exception(String.format("逻辑参数[%1$s]未指定代码标识", iPSDELogicParam.getName()));
				}
				if(iPSDELogicParam.getParamPSDataEntity() != null) {
					IDataEntityRuntime iDataEntityRuntime = null;
					if(iPSDELogicParam.getParamPSDataEntity().getId().equals(this.getDataEntityRuntime().getId())) {
						iDataEntityRuntime = this.getDataEntityRuntime();
					}
					else {
						iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDELogicParam.getParamPSDataEntity().getId(), false);
					}
					paramDataEntityRuntimeMap.put(iPSDELogicParam.getCodeName(), iDataEntityRuntime);
				}
				IDELogicParamRuntime iDELogicParamRuntime = this.createDELogicParamRuntime(iPSDELogicParam);
				iDELogicParamRuntime.init(iDELogicRuntimeContext, iPSDELogicParam);
				deLogicParamRuntimeMap.put(iPSDELogicParam.getCodeName().toUpperCase(), iDELogicParamRuntime);
				
				if(iPSDELogicParam.isDefault()) {
					if(this.getDefaultDELogicParamRuntime()!=null) {
						throw new Exception(String.format("存在多个默认逻辑参数"));
					}
					this.setDefaultDELogicParamRuntime(iDELogicParamRuntime);
				}
			}
		}
		
		if(this.getPSDELogic().isCustomCode()) {
			String strScriptCode = this.getPSDELogic().getScriptCode();
			if(!StringUtils.hasLength(this.getPSDELogic().getScriptCode())) {
				throw new Exception("未指定自定义脚本代码");
			}
			this.iDEScriptLogicRuntime = this.getDataEntityRuntimeBase().getDEScriptLogicRuntime(IDEScriptLogicRuntime.LOGICMODE_DELOGIC, strScriptCode);
		}
		else {
			//建立各节点运行时对象
			List<IPSDELogicNode> psDELogicNodeList = this.getPSDELogic().getPSDELogicNodes();
			if(psDELogicNodeList != null) {
				for(IPSDELogicNode iPSDELogicNode : psDELogicNodeList) {
					IDELogicNodeRuntime iDELogicNodeRuntime = createDELogicNodeRuntime(iPSDELogicNode);
					if(iDELogicNodeRuntime == null) {
						//throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("无法建立逻辑节点[%1$s][%2$s]运行时对象", iPSDELogicNode.getName(), iPSDELogicNode.getLogicNodeType()));
						throw new Exception(String.format("无法建立逻辑节点[%1$s][%2$s]运行时对象", iPSDELogicNode.getName(), iPSDELogicNode.getLogicNodeType()));
					}
					deLogicNodeRuntimeMap.put(iPSDELogicNode.getCodeName().toUpperCase(), iDELogicNodeRuntime);
				}
			}
			
			this.getPSDELogic().getStartPSDELogicNodeMust();
		}
		
		
		
		super.onInit();
	}
	
	protected IDEScriptLogicRuntime getDEScriptLogicRuntime() {
		return this.iDEScriptLogicRuntime;
	}
	
	protected IDELogicRuntimeContext getDELogicRuntimeContext() {
		return this.iDELogicRuntimeContext;
	}
	
	protected IDataEntityRuntimeBaseContext getDataEntityRuntimeContext() {
		return iDataEntityRuntimeBaseContext;
	}
	
	protected IDELogicNodeRuntime createDELogicNodeRuntime(IPSDELogicNode iPSDELogicNode) {
		if(iPSDELogicNode instanceof IPSDESFPluginLogic) {
			IPSDESFPluginLogic iPSDESFPluginLogic = (IPSDESFPluginLogic)iPSDELogicNode;
			return this.getDataEntityRuntime().getSystemRuntime().getRuntimeObject(iPSDESFPluginLogic.getPSSysSFPluginMust(), IDELogicNodeRuntime.class, false);
		}
		return this.getDataEntityRuntime().getSystemRuntime().getDELogicNodeRuntime(iPSDELogicNode, false);
	}
	
	protected IDELogicNodeRuntime getDELogicNodeRuntime(IPSDELogicNode iPSDELogicNode) {
		IDELogicNodeRuntime iDELogicNodeRuntime = null;
		try {
			iDELogicNodeRuntime = this.getDELogicNodeRuntime(iPSDELogicNode.getCodeName(), true);
		} catch (Throwable ex) {
			log.debug(ex);
		}
		if(iDELogicNodeRuntime == null) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("无法获取逻辑节点[%1$s][%2$s]运行时对象", iPSDELogicNode.getName(), iPSDELogicNode.getLogicNodeType()));
		}
		return iDELogicNodeRuntime;
	}
	
	protected IDELogicParamRuntime createDELogicParamRuntime(IPSDELogicParam iPSDELogicParam) {
		if(iPSDELogicParam.getPSSysSFPlugin() != null) {
			return this.getDataEntityRuntime().getSystemRuntime().getRuntimeObject(iPSDELogicParam.getPSSysSFPlugin(), IDELogicParamRuntime.class, true);
		}
		return this.getDataEntityRuntime().getSystemRuntime().getDELogicParamRuntime(iPSDELogicParam);
	}
	
	
	private DELogicRuntime getSelf() {
		return this;
	}
	
	@Override
	public IPSDELogic getPSDELogic() {
		return this.iPSDELogic;
	}
	
	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSDELogic();
	}
	
	
	@Override
	public IDELogicParamRuntime getDELogicParamRuntime(String strName, boolean bTryMode) throws Throwable {
		IDELogicParamRuntime iDELogicParamRuntime =  deLogicParamRuntimeMap.get(strName.toUpperCase());
		if(iDELogicParamRuntime != null || bTryMode) {
			return iDELogicParamRuntime;
		}
		throw new Exception(String.format("未存在指定参数[%1$s]", strName));
	}
	
	@Override
	public IDELogicNodeRuntime getDELogicNodeRuntime(String strName, boolean bTryMode) throws Throwable {
		IDELogicNodeRuntime iDELogicNodeRuntime =  deLogicNodeRuntimeMap.get(strName.toUpperCase());
		if(iDELogicNodeRuntime != null || bTryMode) {
			return iDELogicNodeRuntime;
		}
		throw new Exception(String.format("未存在指定节点[%1$s]", strName));
	}

	
	@Override
	public Object execute(Object[] args) throws Throwable{
		
		if(args == null || args.length == 0) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("传入参数无效"));
		}
		
		if(this.getDEScriptLogicRuntime() != null) {
			IEntityBase iEntity = null;
			if(args[0] instanceof IEntityBase) {
				iEntity = (IEntityBase)args[0];
			}
			if(iEntity == null) {
				throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("传入参数无效"));
			}
			return this.getDEScriptLogicRuntime().execute(args);
		}
		else {
			return this.onExecute(args);
		}
	}
	
	protected Object onExecute(Object[] args) throws Throwable{
		Map<String, Object> params = null;
		if(args.length>1 && args[1] instanceof Map) {
			params = (Map)args[1];
		}
		else {
			if(LogicSubType.DEFIELD.value.equals(this.getPSDELogic().getLogicSubType())) {
				if(this.getPSDELogic() instanceof IPSDEFLogic) {
					IPSDEFLogic iPSDEFLogic = (IPSDEFLogic)this.getPSDELogic();
					if(DEFLogicMode.DEFAULT.value.equals(iPSDEFLogic.getDEFLogicMode())) {
						if(args.length >= 4) {
							params = new LinkedHashMap<String, Object>();
							params.put("actionmode", args[1]);
						}
					}
				}
			}
		}
		
		IDELogicSession iDELogicSession = this.createDELogicSession(params);
		
		if(this.getDefaultDELogicParamRuntime() != null ) {
			String strParamName = this.getDefaultDELogicParamRuntime().getCodeName();
			this.getDELogicParamRuntime(strParamName, false).bind(iDELogicSession, args[0]);
		}
		
		List<IPSDELogicParam> psDELogicParamList = getPSDELogic().getPSDELogicParams();
		if(psDELogicParamList != null && psDELogicParamList.size() > 0) {
			for(IPSDELogicParam iPSDELogicParam : psDELogicParamList) {
				String strParamName = iPSDELogicParam.getCodeName();
				if(iPSDELogicParam.isDefault()) {
					//iDELogicSession.setParamObject(strParamName, iEntity);
					continue;
				}
				
				if(iPSDELogicParam.isLastReturnParam()
						|| iPSDELogicParam.isFilterParam()
						|| iPSDELogicParam.isEntityListParam()
						|| iPSDELogicParam.isEntityMapParam()
						|| iPSDELogicParam.isEntityPageParam()
						|| iPSDELogicParam.isFileParam()
						|| iPSDELogicParam.isFileListParam()
						|| iPSDELogicParam.isSimpleParam()
						|| iPSDELogicParam.isSimpleListParam()) {
					continue;
				}
				
				if(iPSDELogicParam.isLastParam()) {
					Object lastEntity = this.getDataEntityRuntime().getLastEntity();
					if(lastEntity instanceof IEntity) {
						iDELogicSession.setParam(strParamName, (IEntity)lastEntity);
					}
					continue;
				}
				
				if(iPSDELogicParam.isSessionParam()) {
//					String strSessionTag = String.format("DELOGIC_%1$s", strParamName);
//					Object objParam = ActionSessionManager.getCurrentSessionMust().getActionParam(strSessionTag);
//					if(objParam == null) {
//						objParam = new SimpleEntity();
//						ActionSessionManager.getCurrentSessionMust().setActionParam(strSessionTag, objParam);
//					}
//					if(objParam instanceof IEntity) {
//						iDELogicSession.setParam(strParamName, (IEntity)objParam);
//					}
					continue;
				}
				
				if(iPSDELogicParam.isEnvParam()) {
					//iDELogicSession.setParam(strParamName, ActionSessionManager.getCurrentSessionMust().getEnvEntity(true));
					continue;
				}
				
				//默认按数据对象参数处理，兼容早期代码
				Object value = iDELogicSession.getParamObject(strParamName, true);
				if(value == null) {
					this.getDELogicParamRuntime(strParamName, false).getReal(iDELogicSession);
				}
				else {
					this.getDELogicParamRuntime(strParamName, false).bind(iDELogicSession, value);
				}
//				
//				if(iPSDELogicParam.getParamPSDataEntity() != null) {
//					if(value == null) {
//						IDataEntityRuntime iDataEntityRuntime = paramDataEntityRuntimeMap.get(strParamName);
//						iDELogicSession.setParam(strParamName, iDataEntityRuntime.createEntity());
//					}
//					else {
//						this.getDELogicParamRuntime(strParamName, false).bind(value);
//					}
//				}
//				else {
//					if(value == null) {
//						iDELogicSession.setParam(strParamName, this.getSystemRuntime().createEntity());
//					}
//				}
			}
		}
		
		//进行参数准备
		IDELogicSession lastDELogicSession = DELogicSession.getCurrent();
		try {
			DELogicSession.setCurrent(iDELogicSession);
			this.beginSession(iDELogicSession);
			//this.executePSDELogicNode(iDELogicSession, this.getPSDELogic().getStartPSDELogicNodeMust());
			this.onExecute(iDELogicSession, args);
			this.endSession(iDELogicSession);
			this.outputDebugInfo(iDELogicSession, null);
			DELogicSession.setCurrent(lastDELogicSession);
		}
		catch(Throwable ex) {
			this.endSession(iDELogicSession);
			outputDebugInfo(iDELogicSession, ex);
			DELogicSession.setCurrent(lastDELogicSession);
			throw ex;
		}
		
		return iDELogicSession.getResult();
	}
	
	protected void onExecute(IDELogicSession iDELogicSession, Object[] args) throws Throwable{
		this.executePSDELogicNode(iDELogicSession, this.getPSDELogic().getStartPSDELogicNodeMust());
	}
	
	protected void beginSession(IDELogicSession iDELogicSession) throws Throwable{
		if(this.deLogicParamRuntimeMap != null) {
			for(IDELogicParamRuntime iDELogicParamRuntime:this.deLogicParamRuntimeMap.values()) {
				iDELogicParamRuntime.beginSession(iDELogicSession);
			}
		}
	}
	
	protected void endSession(IDELogicSession iDELogicSession){
		if(this.deLogicParamRuntimeMap != null) {
			for(IDELogicParamRuntime iDELogicParamRuntime:this.deLogicParamRuntimeMap.values()) {
				iDELogicParamRuntime.endSession(iDELogicSession);
			}
		}
	}
	
	
	protected void executePSDELogicNode(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable{
		onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode);
	}
	
	protected void onExecutePSDELogicNode(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable{
		this.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true);
	}
	
	protected void onExecutePSDELogicNode(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode, boolean bExecuteLink) throws Throwable{
		
		IDELogicNodeRuntime iDELogicNodeRuntime = this.getDELogicNodeRuntime(iPSDELogicNode);
		iDELogicSession.debugEnterNode(iDELogicNodeRuntime, iPSDELogicNode);
		
		Throwable exception = null;
		try {
			iDELogicNodeRuntime.execute(this.getDELogicRuntimeContext(), iDELogicSession, iPSDELogicNode);
			if(iPSDELogicNode instanceof IPSDEEndLogic) {
				iDELogicSession.debugExitNode(iDELogicNodeRuntime, iPSDELogicNode);
				return;
			}
			
			
		}
		catch(Throwable ex) {
			if(iPSDELogicNode instanceof IPSDEThrowExceptionLogic) {
				throw ex;
			}
			exception = ex;
		}
		
		if(!bExecuteLink) {
			if(exception != null) {
				throw exception;
			}
			return;
		}
		
		
		List<IPSDELogicLink> psDELogicLinkList = iPSDELogicNode.getPSDELogicLinks();
		if(exception == null) {
			if(psDELogicLinkList != null && psDELogicLinkList.size() > 0) {
				Object lastReturn = iDELogicSession.getLastReturn();
				boolean bParallelOutput = iPSDELogicNode.isParallelOutput();
				if(bParallelOutput) {
					int nCount = 0;
					for(IPSDELogicLink iPSDELogicLink : psDELogicLinkList) {
						if(iPSDELogicLink.isCatchLink()
								|| iPSDELogicLink.isSubCallLink()) {
							continue;
						}
						nCount++;
					}
					if(nCount <= 1) {
						bParallelOutput = false;
					}
				}
				
				for(IPSDELogicLink iPSDELogicLink : psDELogicLinkList) {
					if(iPSDELogicLink.isCatchLink()
							|| iPSDELogicLink.isSubCallLink()) {
						continue;
					}
					if(iPSDELogicLink.getPSDELogicLinkGroupCond() == null 
							|| iPSDELogicLink.getPSDELogicLinkGroupCond().getPSDELogicLinkConds() == null) {
						iDELogicSession.debugEnterLink(iDELogicNodeRuntime, iPSDELogicNode, iPSDELogicLink);
						if(!bParallelOutput) {
							iDELogicSession.debugExitNode(iDELogicNodeRuntime, iPSDELogicNode);
						}
						iDELogicSession.setLastReturn(lastReturn);
						this.executePSDELogicNode(iDELogicSession, iPSDELogicLink.getDstPSDELogicNodeMust());
						if(!bParallelOutput) {
							return;
						}
						continue;
					}
					else if(testPSDELogicLinkCond(iDELogicSession, iPSDELogicLink.getPSDELogicLinkGroupCond())){
						iDELogicSession.debugEnterLink(iDELogicNodeRuntime, iPSDELogicNode, iPSDELogicLink);
						if(!bParallelOutput) {
							iDELogicSession.debugExitNode(iDELogicNodeRuntime, iPSDELogicNode);
						}
						iDELogicSession.setLastReturn(lastReturn);
						this.executePSDELogicNode(iDELogicSession, iPSDELogicLink.getDstPSDELogicNodeMust());
						if(!bParallelOutput) {
							return;
						}
						continue;
					}
				}
			}
		}
		else {
			if(psDELogicLinkList != null && psDELogicLinkList.size() > 0) {
				
				IExceptionEntity iExceptionEntity = null;
				
				for(IPSDELogicLink iPSDELogicLink : psDELogicLinkList) {
					if(!iPSDELogicLink.isCatchLink()) {
						continue;
					}
					
					if(iExceptionEntity == null) {
						iExceptionEntity = ExceptionEntity.from(exception);
						iDELogicSession.setLastReturn(iExceptionEntity);
					}
					
					if(iPSDELogicLink.getPSDELogicLinkGroupCond() == null 
							|| iPSDELogicLink.getPSDELogicLinkGroupCond().getPSDELogicLinkConds() == null) {
						iDELogicSession.debugInfo(exception.getMessage());
						exception = null;
						iDELogicSession.debugEnterLink(iDELogicNodeRuntime, iPSDELogicNode, iPSDELogicLink);
						iDELogicSession.debugExitNode(iDELogicNodeRuntime, iPSDELogicNode);
						this.executePSDELogicNode(iDELogicSession, iPSDELogicLink.getDstPSDELogicNodeMust());
						return;
					}
					else if(testPSDELogicLinkCond(iDELogicSession, iPSDELogicLink.getPSDELogicLinkGroupCond())){
						iDELogicSession.debugInfo(exception.getMessage());
						exception = null;
						iDELogicSession.debugEnterLink(iDELogicNodeRuntime, iPSDELogicNode, iPSDELogicLink);
						iDELogicSession.debugExitNode(iDELogicNodeRuntime, iPSDELogicNode);
						this.executePSDELogicNode(iDELogicSession, iPSDELogicLink.getDstPSDELogicNodeMust());
						return;
					}
				}
			}
			
			if(exception != null) {
				throw exception;
			}
		}
		
		iDELogicSession.debugExitNode(iDELogicNodeRuntime, iPSDELogicNode);
		
	}
	
	protected boolean testPSDELogicLinkCond(IDELogicSession iDELogicSession, IPSDELogicLinkCond iPSDELogicLinkCond) throws Throwable{
		if(iPSDELogicLinkCond instanceof IPSDELogicLinkGroupCond) {
			IPSDELogicLinkGroupCond iPSDELogicLinkGroupCond = (IPSDELogicLinkGroupCond)iPSDELogicLinkCond;
			boolean bRet = true;
			if(iPSDELogicLinkGroupCond.getGroupOP().equals(Conditions.AND)) {
				if(iPSDELogicLinkGroupCond.getPSDELogicLinkConds() != null && iPSDELogicLinkGroupCond.getPSDELogicLinkConds().size()>0) {
					bRet = true;
					for(IPSDELogicLinkCond childPSDELogicLinkCond : iPSDELogicLinkGroupCond.getPSDELogicLinkConds()) {
						if(!testPSDELogicLinkCond(iDELogicSession, childPSDELogicLinkCond)) {
							bRet = false;
							break;
						}
					}
				}
			}
			else
				if(iPSDELogicLinkGroupCond.getGroupOP().equals(Conditions.OR)) {
					if(iPSDELogicLinkGroupCond.getPSDELogicLinkConds() != null && iPSDELogicLinkGroupCond.getPSDELogicLinkConds().size()>0) {
						bRet = false;
						for(IPSDELogicLinkCond childPSDELogicLinkCond : iPSDELogicLinkGroupCond.getPSDELogicLinkConds()) {
							if(testPSDELogicLinkCond(iDELogicSession, childPSDELogicLinkCond)) {
								bRet = true;
								break;
							}
						}
					}
				}
				else
					throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("连接条件[%1$s]组逻辑操作[%2$s]无效", iPSDELogicLinkCond.getName(), iPSDELogicLinkGroupCond.getGroupOP()));
			
			if(iPSDELogicLinkGroupCond.isNotMode()) {
				bRet = !bRet;
			}
			return bRet;
		}
		if(iPSDELogicLinkCond instanceof IPSDELogicLinkSingleCond) {
			IPSDELogicLinkSingleCond iPSDELogicLinkSingleCond = (IPSDELogicLinkSingleCond)iPSDELogicLinkCond;
			String strParamType = iPSDELogicLinkSingleCond.getParamType();
			
			IDELogicParamRuntime dstDELogicParamRuntime = this.getDELogicParamRuntime(iPSDELogicLinkSingleCond.getDstLogicParamMust().getCodeName(), false);
//			IEntity iEntity = iDELogicSession.getParam(iPSDELogicLinkSingleCond.getDstLogicParamMust().getCodeName());
//			if(iEntity == null) {
//				throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("连接条件[%1$s]指定目标参数对象[%2$s]无效", iPSDELogicLinkCond.getName(), iPSDELogicLinkSingleCond.getDstLogicParamMust().getCodeName()));
//			}
			
			String strDstFieldName = iPSDELogicLinkSingleCond.getDstFieldName();
			if(Conditions.CONTAINS.equalsIgnoreCase(iPSDELogicLinkSingleCond.getCondOP())) {
				if(ObjectUtils.isEmpty(strDstFieldName)) {
					throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("连接条件[%1$s]未指定目标属性名称", iPSDELogicLinkCond.getName()));
				}
				return dstDELogicParamRuntime.contains(iDELogicSession, strDstFieldName.toLowerCase());
			}
			
			Object objValue = null;
			if(ObjectUtils.isEmpty(strDstFieldName)) {
				//throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("连接条件[%1$s]指定目标参数属性无效", iPSDELogicLinkCond.getName()));
				objValue = dstDELogicParamRuntime.getReal(iDELogicSession);
			}
			else{
				objValue = dstDELogicParamRuntime.get(iDELogicSession, strDstFieldName.toLowerCase());
			}
			Object dstValue = iPSDELogicLinkSingleCond.getParamValue();
			
			if(StringUtils.hasLength(strParamType)) {
				if(strParamType.equals(DELogicLinkSingleCondParamTypes.ENTITYFIELD)) {
					if(ObjectUtils.isEmpty(dstValue)) {
						throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("连接条件[%1$s]未指定参数项名称", iPSDELogicLinkCond.getName()));
					}
					dstValue = dstDELogicParamRuntime.get(iDELogicSession, ((String)dstValue).toLowerCase());
				}
				else
					if(strParamType.equals(DELogicLinkSingleCondParamTypes.CURTIME)) {
						dstValue = new java.sql.Timestamp(System.currentTimeMillis());
					}
					else
						if(strParamType.equals(DELogicLinkSingleCondParamTypes.SRCENTITYFIELD)) {
							if(ObjectUtils.isEmpty(dstValue)) {
								throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("连接条件[%1$s]未指定参数项名称", iPSDELogicLinkCond.getName()));
							}
							IDELogicParamRuntime srcDELogicParamRuntime = this.getDELogicParamRuntime(iPSDELogicLinkSingleCond.getSrcLogicParamMust().getCodeName(), false);
							dstValue =  srcDELogicParamRuntime.get(iDELogicSession, ((String)dstValue).toLowerCase());
						}
						else
							if(strParamType.equals(DELogicLinkSingleCondParamTypes.SRCDLPARAM)) {
								IDELogicParamRuntime srcDELogicParamRuntime = this.getDELogicParamRuntime(iPSDELogicLinkSingleCond.getSrcLogicParamMust().getCodeName(), false);
								dstValue =  srcDELogicParamRuntime.getReal(iDELogicSession);
							}
							else if(strParamType.equals(DELogicLinkSingleCondParamTypes.LASTRETURN)) {
								dstValue = iDELogicSession.getLastReturn();
							}
			}
			return testValueCond(objValue, iPSDELogicLinkSingleCond.getCondOP(), dstValue);
		}
		
		throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("无法识别连接条件[%1$s][%2$s]", iPSDELogicLinkCond.getName(), iPSDELogicLinkCond.getLogicType()));
	}
	
	/**
	 * 测试条件是否成立
	 * 
	 * @param objSrcValue
	 * @param strOP
	 * @param strDstValue
	 * @return
	 * @throws Exception
	 */
	protected boolean testValueCond(Object objSrcValue, String strOP, Object objDstValue) throws Exception {
		return DataTypeUtils.testCond(objSrcValue, strOP, objDstValue);
	}
	
	/**
	 * 测试条件是否成立，等同testValueCond
	 * @param objSrcValue
	 * @param strOP
	 * @param objDstValue
	 * @return
	 * @throws Exception
	 */
	protected boolean test(Object objSrcValue, String strOP, Object objDstValue) throws Exception {
		return testValueCond(objSrcValue, strOP, objDstValue);
	}
	
	/***
	 * 后续提供的方法，再未提供参数的情况会掉用原有方法
	 * @param params
	 * @return
	 */
	protected IDELogicSession createDELogicSession(Map<String, Object> params) {
		if(params != null) {
			return new DELogicSession(this.getDELogicRuntimeContext(), params);
		}
		return this.createDELogicSession();
	}

	protected IDELogicSession createDELogicSession() {
		return new DELogicSession(this.getDELogicRuntimeContext());
	}
	
	

	@Override
	public int getDebugMode() {
		return this.nDebugMode;
	}
	
	protected void setDebugMode(int nDebugMode) {
		this.nDebugMode = nDebugMode;
	}
	
	@Override
	public boolean isOutputDebugInfo() {
		return getDebugMode() == DELogicDebugModes.INFO;
	}

	@Override
	public IDELogicParamRuntime getDefaultDELogicParamRuntime() {
		return this.defaultDELogicParamRuntime;
	}
	
	protected void setDefaultDELogicParamRuntime(IDELogicParamRuntime defaultDELogicParamRuntime) {
		this.defaultDELogicParamRuntime = defaultDELogicParamRuntime;
	}
	
	protected void outputDebugInfo(IDELogicSession iDELogicSession, Throwable ex) {
		if(iDELogicSession.getDebugArrayNode() != null) {
			String strDebugInfo = null;
			if(ex==null) {
				strDebugInfo = String.format("实体[%1$s]处理逻辑[%2$s]\r\n%3$s", this.getDataEntityRuntimeBase().getName(), this.getPSDELogic().getName(),
						iDELogicSession.getDebugArrayNode().toString());
			}
			else {
				String strException = ex.getMessage();
				if(StringUtils.hasLength(strException)) {
					strException = strException.replace("\r\n"," ");
				}
				strDebugInfo = String.format("实体[%1$s]处理逻辑[%2$s]发生异常，%3$s\r\n%4$s", this.getDataEntityRuntimeBase().getName(), this.getPSDELogic().getName(),
						strException, iDELogicSession.getDebugArrayNode().toString());
			}
		
			if(ex == null) {
				log.debug(strDebugInfo);	
				this.getDELogicRuntimeContext().getSystemRuntime().log(ISystemUtilRuntime.LOGLEVEL_INFO, LogCats.DELOGIC, strDebugInfo, iDELogicSession.getDebugArrayNode());
			}
			else {
				log.error(strDebugInfo, ex);
				this.getDELogicRuntimeContext().getSystemRuntime().log(ISystemUtilRuntime.LOGLEVEL_ERROR, LogCats.DELOGIC, strDebugInfo, iDELogicSession.getDebugArrayNode());
			}
		}
	}
	
	
	@Override
	public Object getNodeParamValue(IPSDELogicNodeParam iPSDELogicNodeParam) throws Throwable {
		return getNodeParamValue(null, iPSDELogicNodeParam);
	}
	
	@Override
	public Object getNodeParamValue(IDELogicSession iDELogicSession, IPSDELogicNodeParam iPSDELogicNodeParam) throws Throwable {
		if(iDELogicSession == null) {
			iDELogicSession = DELogicSession.getCurrentMust();
		}
		
		if(DELogicPrepareParamValueTypes.SRCDLPARAM.equals(iPSDELogicNodeParam.getSrcValueType())) {
			IDELogicParamRuntime srcDELogicParamRuntime = this.getDELogicParamRuntime(iPSDELogicNodeParam.getSrcPSDELogicParamMust().getCodeName(), false);
			if(ObjectUtils.isEmpty(iPSDELogicNodeParam.getSrcFieldName())) {
				return srcDELogicParamRuntime.getReal(iDELogicSession);
			}
			return srcDELogicParamRuntime.get(iDELogicSession, iPSDELogicNodeParam.getSrcFieldName().toLowerCase());
		}
		
		if(DELogicPrepareParamValueTypes.NULLVALUE.equals(iPSDELogicNodeParam.getSrcValueType())) {			
			return null;
		}

		if(DELogicPrepareParamValueTypes.SRCVALUE.equals(iPSDELogicNodeParam.getSrcValueType())) {			
			return iPSDELogicNodeParam.getSrcValue();
		}
		
		if(DELogicPrepareParamValueTypes.SESSION.equals(iPSDELogicNodeParam.getSrcValueType())) {	
			if(ObjectUtils.isEmpty(iPSDELogicNodeParam.getSrcFieldName())) {
				throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("处理节点参数[%1$s]未指定源属性名称", iPSDELogicNodeParam.getName()));
			}
			
			if(iDELogicSession.getUserContext() == null) {
				throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("用户上下文对象无效"));
			}
			
			return iDELogicSession.getUserContext().getSessionParam(iPSDELogicNodeParam.getSrcFieldName());
		}
		
		
		if(DELogicPrepareParamValueTypes.APPLICATION.equals(iPSDELogicNodeParam.getSrcValueType())) {	
			if(ObjectUtils.isEmpty(iPSDELogicNodeParam.getSrcFieldName())) {
				throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("处理节点参数[%1$s]未指定源属性名称", iPSDELogicNodeParam.getName()));
			}
			
			// 系统全局对象属性
			return this.getSystemRuntime().getGlobalParam(iPSDELogicNodeParam.getSrcFieldName());
		}
		
		if(DELogicPrepareParamValueTypes.EXPRESSION.equals(iPSDELogicNodeParam.getSrcValueType())) {	
			if(ObjectUtils.isEmpty(iPSDELogicNodeParam.getExpression())) {
				throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("处理节点参数[%1$s]未指定表达式", iPSDELogicNodeParam.getName()));
			}
			IDELogicScriptNodeRuntime iDELogicScriptNodeRuntime = this.getDEScriptLogicRuntime(iPSDELogicNodeParam.getParentPSModelObject(IPSDELogicNode.class, false), iPSDELogicNodeParam.getExpression(), IDELogicScriptNodeRuntime.MODE_EXPRESSION, false);
			return iDELogicScriptNodeRuntime.execute(iDELogicRuntimeContext, iDELogicSession, iPSDELogicNodeParam);
		}
			
		if(DELogicPrepareParamValueTypes.COUNT.equals(iPSDELogicNodeParam.getSrcValueType())) {	
			IDELogicParamRuntime srcDELogicParamRuntime = this.getDELogicParamRuntime(iPSDELogicNodeParam.getSrcPSDELogicParamMust().getCodeName(), false);
			return srcDELogicParamRuntime.count(iDELogicSession);
		}
		
		if(DELogicPrepareParamValueTypes.AGGREGATION.equals(iPSDELogicNodeParam.getSrcValueType())) {	
			IDELogicParamRuntime srcDELogicParamRuntime = this.getDELogicParamRuntime(iPSDELogicNodeParam.getSrcPSDELogicParamMust().getCodeName(), false);
			
			if(ObjectUtils.isEmpty(iPSDELogicNodeParam.getSrcFieldName())) {
				throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("处理节点参数[%1$s]未指定源属性名称", iPSDELogicNodeParam.getName()));
			}
			
			if(ObjectUtils.isEmpty(iPSDELogicNodeParam.getAggMode())) {
				throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("处理节点参数[%1$s]未指定聚合模式", iPSDELogicNodeParam.getName()));
			}
			
			return srcDELogicParamRuntime.aggregate(iDELogicSession, iPSDELogicNodeParam.getSrcFieldName(), iPSDELogicNodeParam.getAggMode());
		}
		
		if(DELogicPrepareParamValueTypes.SEQUENCE.equals(iPSDELogicNodeParam.getSrcValueType())) {
			ISysSequenceRuntime iSysSequenceRuntime = this.getSystemRuntime().getSysSequenceRuntime(iPSDELogicNodeParam.getPSSysSequenceMust());
			
			IDELogicParamRuntime dstDELogicParamRuntime = this.getDELogicParamRuntime(iPSDELogicNodeParam.getDstPSDELogicParamMust().getCodeName(), false);
			if(ObjectUtils.isEmpty(iPSDELogicNodeParam.getDstFieldName())) {
				throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("处理节点参数[%1$s]未指定目标属性名称", iPSDELogicNodeParam.getName()));
			}
			
			Object objEntity = dstDELogicParamRuntime.getParamObject(iDELogicSession);
			IEntityBase iEntityBase = null;
			if(objEntity instanceof IEntityBase) {
				iEntityBase = (IEntityBase)objEntity;
			}
			
			IDataEntityRuntime iDataEntityRuntime = dstDELogicParamRuntime.getDataEntityRuntime();
			IPSDEField iPSDEField = null;
			if(iDataEntityRuntime!=null) {
				iPSDEField = iDataEntityRuntime.getPSDEField(iPSDELogicNodeParam.getDstFieldName(), true);
			}
			
			return iSysSequenceRuntime.get(iEntityBase, iPSDEField, iDataEntityRuntime);
		}
		
		/**
		 * 以下实现暂时忽略，模型后续调整为取源值
		 */
//		if(DELogicPrepareParamValueTypes.TRANSLATOR.equals(iPSDELogicNodeParam.getSrcValueType())) {	
//			
//			ISysTranslatorRuntime iSysTranslatorRuntime = this.getSystemRuntime().getSysTranslatorRuntime(iPSDELogicNodeParam.getPSSysTranslatorMust());
//			
//			IDELogicParamRuntime dstDELogicParamRuntime = this.getDELogicParamRuntime(iPSDELogicNodeParam.getDstPSDELogicParamMust().getCodeName(), false);
//			if(ObjectUtils.isEmpty(iPSDELogicNodeParam.getDstFieldName())) {
//				throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("处理节点参数[%1$s]未指定目标属性名称", iPSDELogicNodeParam.getName()));
//			}
//			
//			Object objValue = dstDELogicParamRuntime.get(iDELogicSession, iPSDELogicNodeParam.getDstFieldName());
//			
//			Object objEntity = dstDELogicParamRuntime.getParamObject(iDELogicSession);
//			IEntityBase iEntityBase = null;
//			if(objEntity instanceof IEntityBase) {
//				iEntityBase = (IEntityBase)objEntity;
//			}
//			
//			IDataEntityRuntime iDataEntityRuntime = dstDELogicParamRuntime.getDataEntityRuntime();
//			IPSDEField iPSDEField = null;
//			if(iDataEntityRuntime!=null) {
//				iPSDEField = iDataEntityRuntime.getPSDEField(iPSDELogicNodeParam.getDstFieldName(), true);
//			}
//			
//			return iSysTranslatorRuntime.translate(objValue, true, iEntityBase, iPSDEField, iDataEntityRuntime);
//		}
//		

		
		
		throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("处理节点参数[%1$s]源值类型[%2$s]未支持", iPSDELogicNodeParam.getName(), iPSDELogicNodeParam.getSrcValueType()));
	}
	
	
	/**
	 * 建立实体脚本逻辑运行时对象
	 * @param strScriptCode
	 * @return
	 */
	public IDELogicScriptNodeRuntime createDELogicScriptNodeRuntime(String strScriptCode, String strMode) {
		return new DELogicScriptNodeRuntime();
	}
	
	protected IDELogicScriptNodeRuntime getDEScriptLogicRuntime(IPSDELogicNode iPSDELogicNode, String strScriptCode, String strMode, boolean bTryMode) {
		String strLogicTag = String.format("%1$s|%2$s|%3$s", iPSDELogicNode.getCodeName(), strScriptCode, strMode);
		IDELogicScriptNodeRuntime iDELogicScriptNodeRuntime = this.deLogicScriptNodeRuntimeMap.get(strLogicTag.hashCode());
		if(iDELogicScriptNodeRuntime != null || bTryMode ) {
			return iDELogicScriptNodeRuntime;
		}
			
		String strCodeType = null;
		if(iPSDELogicNode instanceof IPSDERawCodeLogic) {
			IPSDERawCodeLogic iPSDERawCodeLogic = (IPSDERawCodeLogic)iPSDELogicNode;
			strCodeType = iPSDERawCodeLogic.getCodeType();
		}
		
		
		
		iDELogicScriptNodeRuntime = createDELogicScriptNodeRuntime(strScriptCode, strMode);
		try {
			iDELogicScriptNodeRuntime.init(getSystemRuntime().getSystemRTScriptContext(), this.getDELogicNodeRuntime(iPSDELogicNode), strCodeType, strScriptCode, strMode);
		} catch (Exception e) {
			log.error(String.format("初始化实体处理逻辑脚本节点逻辑运行时对象发生异常，%1$s",e.getMessage()),e);
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("初始化实体处理逻辑脚本节点逻辑运行时对象发生异常，%1$s",e.getMessage()), e);
		}
		this.deLogicScriptNodeRuntimeMap.put(strLogicTag.hashCode(), iDELogicScriptNodeRuntime);
		return iDELogicScriptNodeRuntime;
	}
	
	/**
	 * 获取逻辑参数实际值
	 * @param iDELogicSession
	 * @param strLogicParamCodeName
	 * @return
	 * @throws Throwable
	 */
	@Override
	public Object getLogicParamValue(IDELogicSession iDELogicSession, String strLogicParamCodeName) throws Throwable {
		IDELogicParamRuntime iDELogicParamRuntime = this.getDELogicParamRuntime(strLogicParamCodeName, false);
		return iDELogicParamRuntime.getReal(iDELogicSession);
	}

	@Override
	public Object getLogicParamValue(String strLogicParamCodeName) throws Throwable {
		return this.getLogicParamValue(DELogicSession.getCurrentMust(), strLogicParamCodeName);
	}
}
