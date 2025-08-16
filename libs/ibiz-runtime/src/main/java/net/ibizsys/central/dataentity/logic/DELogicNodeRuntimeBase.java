package net.ibizsys.central.dataentity.logic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.ObjectUtils;

import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.model.dataentity.logic.IPSDELogicNodeParam;
import net.ibizsys.runtime.IModelRuntimeContext;
import net.ibizsys.runtime.addin.ISystemRTAddin;

public abstract class DELogicNodeRuntimeBase implements IDELogicNodeRuntime, ISystemRTAddin {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DELogicNodeRuntimeBase.class);
	
	
	//private Map<Integer, IDELogicScriptNodeRuntime> deLogicScriptNodeRuntimeMap = new HashMap<Integer, IDELogicScriptNodeRuntime>();
	private IModelRuntimeContext ctx = null;
	private Object addinData = null;
	
	@Override
	public void init(IModelRuntimeContext ctx, Object addinData) throws Exception {
		this.ctx = ctx;
		this.addinData = addinData;
		this.prepareDefaultSetting();
		this.onInit();
	}

	protected void prepareDefaultSetting() throws Exception{
		this.onPrepareDefaultSetting();
	}
	
	protected void onPrepareDefaultSetting() throws Exception{
		
	}
	
	protected void onInit() throws Exception{
		
	}
	
	protected IModelRuntimeContext getContext() {
		return this.ctx;
	}
	
	protected Object getAddinData() {
		return this.addinData;
	}
	
	public String getName() {
		return "插件";
	}
	
	
	@Override
	public void execute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
		onExecute(iDELogicRuntimeContext, iDELogicSession, iPSDELogicNode);
	}

	



	protected abstract void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable;

	
	protected Object calcDELogicNodeParamValue(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNodeParam iPSDELogicNodeParam) throws Throwable{
		return iDELogicRuntimeContext.getNodeParamValue(iDELogicSession, iPSDELogicNodeParam);
	}
	
	protected List getNodeParams(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
		java.util.List<net.ibizsys.model.dataentity.logic.IPSDELogicNodeParam> list = iPSDELogicNode.getPSDELogicNodeParams();
		if(ObjectUtils.isEmpty(list)) {
			return null;
		}
		List params = new ArrayList<>();
		for(IPSDELogicNodeParam IPSDELogicNodeParam : list) {
			params.add(this.calcDELogicNodeParamValue(iDELogicRuntimeContext, iDELogicSession, IPSDELogicNodeParam));
		}
		return params;
	}
	
	
	
	
//	protected Object calcDELogicNodeParamValue(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNodeParam iPSDELogicNodeParam) throws Throwable{
//		
//		if(DELogicPrepareParamValueTypes.SRCDLPARAM.equals(iPSDELogicNodeParam.getSrcValueType())) {
//			IDELogicParamRuntime srcDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDELogicNodeParam.getSrcPSDELogicParamMust().getCodeName(), false);
//			if(StringUtils.isEmpty(iPSDELogicNodeParam.getSrcFieldName())) {
//				//throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点参数[%1$s]未指定源属性名称", iPSDELogicNodeParam.getName()));
//				return srcDELogicParamRuntime.getReal(iDELogicSession);
//			}
//		//	IEntity srcEntity = iDELogicSession.getParam(iPSDELogicNodeParam.getSrcPSDELogicParamMust().getCodeName());
//		//	return srcEntity.get(iPSDELogicNodeParam.getSrcFieldName().toLowerCase());
//			
//			return srcDELogicParamRuntime.get(iDELogicSession, iPSDELogicNodeParam.getSrcFieldName().toLowerCase());
//		}
//		
//		if(DELogicPrepareParamValueTypes.NULLVALUE.equals(iPSDELogicNodeParam.getSrcValueType())) {			
//			return null;
//		}
//
//		if(DELogicPrepareParamValueTypes.SRCVALUE.equals(iPSDELogicNodeParam.getSrcValueType())) {			
//			return iPSDELogicNodeParam.getSrcValue();
//		}
//		
//		if(DELogicPrepareParamValueTypes.SESSION.equals(iPSDELogicNodeParam.getSrcValueType())) {	
//			if(StringUtils.isEmpty(iPSDELogicNodeParam.getSrcFieldName())) {
//				throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点参数[%1$s]未指定源属性名称", iPSDELogicNodeParam.getName()));
//			}
//			
//			if(iDELogicSession.getUserContext() == null) {
//				throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("用户上下文对象无效"));
//			}
//			
//			return iDELogicSession.getUserContext().getSessionParam(iPSDELogicNodeParam.getSrcFieldName());
//		}
//		
//		
//		if(DELogicPrepareParamValueTypes.APPLICATION.equals(iPSDELogicNodeParam.getSrcValueType())) {	
//			if(StringUtils.isEmpty(iPSDELogicNodeParam.getSrcFieldName())) {
//				throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点参数[%1$s]未指定源属性名称", iPSDELogicNodeParam.getName()));
//			}
//			
//			// 系统全局对象属性
//			return iDELogicRuntimeContext.getSystemRuntime().getGlobalParam(iPSDELogicNodeParam.getSrcFieldName());
//		}
//		
//		if(DELogicPrepareParamValueTypes.EXPRESSION.equals(iPSDELogicNodeParam.getSrcValueType())) {	
//			if(StringUtils.isEmpty(iPSDELogicNodeParam.getExpression())) {
//				throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点参数[%1$s]未指定表达式", iPSDELogicNodeParam.getName()));
//			}
//			IDELogicScriptNodeRuntime iDELogicScriptNodeRuntime = this.getDEScriptLogicRuntime(iDELogicRuntimeContext, iPSDELogicNodeParam.getExpression(), IDELogicScriptNodeRuntime.MODE_EXPRESSION, false);
//			return iDELogicScriptNodeRuntime.execute(iDELogicRuntimeContext, iDELogicSession, iPSDELogicNodeParam);
//		}
//			
//		if(DELogicPrepareParamValueTypes.COUNT.equals(iPSDELogicNodeParam.getSrcValueType())) {	
//			IDELogicParamRuntime srcDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDELogicNodeParam.getSrcPSDELogicParamMust().getCodeName(), false);
//			return srcDELogicParamRuntime.count(iDELogicSession);
//		}
//		
//		if(DELogicPrepareParamValueTypes.AGGREGATION.equals(iPSDELogicNodeParam.getSrcValueType())) {	
//			IDELogicParamRuntime srcDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDELogicNodeParam.getSrcPSDELogicParamMust().getCodeName(), false);
//			
//			if(StringUtils.isEmpty(iPSDELogicNodeParam.getSrcFieldName())) {
//				throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点参数[%1$s]未指定源属性名称", iPSDELogicNodeParam.getName()));
//			}
//			
//			if(StringUtils.isEmpty(iPSDELogicNodeParam.getAggMode())) {
//				throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点参数[%1$s]未指定聚合模式", iPSDELogicNodeParam.getName()));
//			}
//			
//			return srcDELogicParamRuntime.aggregate(iDELogicSession, iPSDELogicNodeParam.getSrcFieldName(), iPSDELogicNodeParam.getAggMode());
//		}
//		
//		if(DELogicPrepareParamValueTypes.TRANSLATOR.equals(iPSDELogicNodeParam.getSrcValueType())) {	
//			
//			ISysTranslatorRuntime iSysTranslatorRuntime = iDELogicRuntimeContext.getSystemRuntime().getSysTranslatorRuntime(iPSDELogicNodeParam.getPSSysTranslatorMust());
//			
//			IDELogicParamRuntime dstDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDELogicNodeParam.getDstPSDELogicParamMust().getCodeName(), false);
//			if(StringUtils.isEmpty(iPSDELogicNodeParam.getDstFieldName())) {
//				throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点参数[%1$s]未指定目标属性名称", iPSDELogicNodeParam.getName()));
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
//		if(DELogicPrepareParamValueTypes.SEQUENCE.equals(iPSDELogicNodeParam.getSrcValueType())) {
//			ISysSequenceRuntime iSysSequenceRuntime = iDELogicRuntimeContext.getSystemRuntime().getSysSequenceRuntime(iPSDELogicNodeParam.getPSSysSequenceMust());
//			
//			IDELogicParamRuntime dstDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDELogicNodeParam.getDstPSDELogicParamMust().getCodeName(), false);
//			if(StringUtils.isEmpty(iPSDELogicNodeParam.getDstFieldName())) {
//				throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点参数[%1$s]未指定目标属性名称", iPSDELogicNodeParam.getName()));
//			}
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
//			return iSysSequenceRuntime.get(iEntityBase, iPSDEField, iDataEntityRuntime);
//		}
//		
//		
//		throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点参数[%1$s]源值类型[%2$s]未支持", iPSDELogicNodeParam.getName(), iPSDELogicNodeParam.getSrcValueType()));
//	}
//	
//	
//	/**
//	 * 建立实体脚本逻辑运行时对象
//	 * @param strScriptCode
//	 * @return
//	 */
//	public IDELogicScriptNodeRuntime createDELogicScriptNodeRuntime(String strScriptCode, String strMode) {
//		return new DELogicScriptNodeRuntime();
//	}
//	
//	protected IDELogicScriptNodeRuntime getDEScriptLogicRuntime(IDELogicRuntimeContext iDELogicRuntimeContext, String strScriptCode, String strMode, boolean bTryMode) {
//		String strLogicTag = String.format("%1$s|%2$s", strScriptCode, strMode);
//		IDELogicScriptNodeRuntime iDELogicScriptNodeRuntime = this.deLogicScriptNodeRuntimeMap.get(strLogicTag.hashCode());
//		if(iDELogicScriptNodeRuntime != null || bTryMode ) {
//			return iDELogicScriptNodeRuntime;
//		}
//			
//		iDELogicScriptNodeRuntime = createDELogicScriptNodeRuntime(strScriptCode, strMode);
//		try {
//			iDELogicScriptNodeRuntime.init(iDELogicRuntimeContext.getSystemRuntime().getSystemRTScriptContext(), this, strScriptCode, strMode);
//		} catch (Exception e) {
//			log.error(String.format("初始化实体处理逻辑脚本节点逻辑运行时对象发生异常，%1$s",e.getMessage()),e);
//			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), String.format("初始化实体处理逻辑脚本节点逻辑运行时对象发生异常，%1$s",e.getMessage()), e);
//		}
//		this.deLogicScriptNodeRuntimeMap.put(strLogicTag.hashCode(), iDELogicScriptNodeRuntime);
//		return iDELogicScriptNodeRuntime;
//	}
	
}
	
