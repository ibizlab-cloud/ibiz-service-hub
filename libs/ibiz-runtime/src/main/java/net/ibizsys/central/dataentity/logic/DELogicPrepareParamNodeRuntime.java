package net.ibizsys.central.dataentity.logic;

import org.springframework.util.StringUtils;

import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.model.dataentity.logic.IPSDELogicNodeParam;
import net.ibizsys.model.res.IPSSysTranslator;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.res.ISysTranslatorRuntime;

/**
 * 实体逻辑准备参数节点运行时对象
 * @author lionlau
 *
 */
public class DELogicPrepareParamNodeRuntime extends DELogicNodeRuntimeBase{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DELogicPrepareParamNodeRuntime.class);
	
	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
		java.util.List<IPSDELogicNodeParam> psDELogicNodeParamList = iPSDELogicNode.getPSDELogicNodeParams();
		if(psDELogicNodeParamList == null || psDELogicNodeParamList.size() == 0) {
			//throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format(arg0, arg1)., strInfo);
			return;
		}
		
		for(IPSDELogicNodeParam iPSDELogicNodeParam : psDELogicNodeParamList) {
			String strParamAction = iPSDELogicNodeParam.getParamAction();
			if(DELogicNodeParamTypes.SETPARAMVALUE.equals(strParamAction)) {
//				IEntity dstEntity = iDELogicSession.getParam(iPSDELogicNodeParam.getDstPSDELogicParamMust().getCodeName());
//				if(StringUtils.isEmpty(iPSDELogicNodeParam.getDstFieldName())) {
//					throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点参数[%1$s]未指定目标属性名称", iPSDELogicNodeParam.getName()));
//				}
//				this.onSetParamValue(iDELogicRuntimeContext, iDELogicSession, dstEntity, iPSDELogicNodeParam);
				onSetParamValue(iDELogicRuntimeContext, iDELogicSession, iPSDELogicNodeParam);
				continue;
			}
			
			if(DELogicNodeParamTypes.RESETPARAM.equals(strParamAction)) {
				//IEntity dstEntity = iDELogicSession.getParam(iPSDELogicNodeParam.getDstPSDELogicParamMust().getCodeName());
				onResetParam(iDELogicRuntimeContext, iDELogicSession, iPSDELogicNodeParam);
				continue;
			}
			
			if(DELogicNodeParamTypes.COPYPARAM.equals(strParamAction)) {
				//IEntity srcEntity = iDELogicSession.getParam(iPSDELogicNodeParam.getSrcPSDELogicParamMust().getCodeName());
				//IEntity dstEntity = iDELogicSession.getParam(iPSDELogicNodeParam.getDstPSDELogicParamMust().getCodeName());
				
				//onCopyParam(iDELogicRuntimeContext, iDELogicSession, srcEntity, dstEntity);
				onCopyParam(iDELogicRuntimeContext, iDELogicSession, iPSDELogicNodeParam);
				continue;
			}
			
			if(DELogicNodeParamTypes.BINDPARAM.equals(strParamAction)) {
				onBindParam(iDELogicRuntimeContext, iDELogicSession, iPSDELogicNodeParam);
				continue;
			}
			
			if(DELogicNodeParamTypes.RENEWPARAM.equals(strParamAction)) {
				onRenewParam(iDELogicRuntimeContext, iDELogicSession, iPSDELogicNodeParam);
				continue;
			}
			
			if(DELogicNodeParamTypes.APPENDPARAM.equals(strParamAction)) {
				onAppendParam(iDELogicRuntimeContext, iDELogicSession, iPSDELogicNodeParam);
				continue;
			}
			
			if(DELogicNodeParamTypes.SORTPARAM.equals(strParamAction)) {
				onSortParam(iDELogicRuntimeContext, iDELogicSession, iPSDELogicNodeParam);
				continue;
			}
			
			log.warn(String.format("未支持的参数设置操作[%1$s]", strParamAction));
			if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
				iDELogicSession.debugInfo(String.format("未支持的参数设置操作[%1$s]", strParamAction));
			}
		}
	}
	

	
	protected void onCopyParam(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNodeParam iPSDELogicNodeParam) throws Throwable {
		IDELogicParamRuntime srcDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDELogicNodeParam.getSrcPSDELogicParamMust().getCodeName(), false);
		IDELogicParamRuntime dstDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDELogicNodeParam.getDstPSDELogicParamMust().getCodeName(), false);
		srcDELogicParamRuntime.copyTo(iDELogicSession, dstDELogicParamRuntime.getParamObject(iDELogicSession));
		
		if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
			iDELogicSession.debugInfo(String.format("拷贝参数[%1$s] ==> %2$s", srcDELogicParamRuntime.getCodeName(), dstDELogicParamRuntime.getCodeName()));
		}
	}
	
	
	
	protected void onBindParam(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNodeParam iPSDELogicNodeParam) throws Throwable {
		IDELogicParamRuntime srcDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDELogicNodeParam.getSrcPSDELogicParamMust().getCodeName(), false);
		IDELogicParamRuntime dstDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDELogicNodeParam.getDstPSDELogicParamMust().getCodeName(), false);
		String strSrcFieldName = iPSDELogicNodeParam.getSrcFieldName();
		Object objValue = null;
		if(StringUtils.hasLength(strSrcFieldName)){
			objValue = srcDELogicParamRuntime.get(iDELogicSession, strSrcFieldName);
			if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
				iDELogicSession.debugInfo(String.format("源参数[%1$s]属性[%2$s] ==> %3$s", srcDELogicParamRuntime.getCodeName(), strSrcFieldName, objValue));
			}
		}
		else {
			objValue = srcDELogicParamRuntime.getParamObject(iDELogicSession);
			if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
				iDELogicSession.debugInfo(String.format("源参数[%1$s] ==> %2$s", srcDELogicParamRuntime.getCodeName(), objValue));
			}
		}
		
		
		IPSSysTranslator iPSSysTranslator = iPSDELogicNodeParam.getPSSysTranslator();
		if(iPSSysTranslator!=null) {
			ISysTranslatorRuntime iSysTranslatorRuntime = iDELogicRuntimeContext.getSystemRuntime().getSysTranslatorRuntime(iPSSysTranslator);
			objValue = iSysTranslatorRuntime.translate(objValue, !iPSDELogicNodeParam.isOutTranslate(), null, null, null);
			
			if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
				iDELogicSession.debugInfo(String.format("转换器[%1$s]值输入转换 ==> %2$s", iSysTranslatorRuntime.getName(), objValue));
			}
		}
		dstDELogicParamRuntime.bind(iDELogicSession, objValue);
		
		if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
			iDELogicSession.debugInfo(String.format("绑定参数[%1$s] <== %2$s", dstDELogicParamRuntime.getCodeName(), objValue));
		}
	}
	
	
	protected void onRenewParam(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNodeParam iPSDELogicNodeParam) throws Throwable {
		IDELogicParamRuntime dstDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDELogicNodeParam.getDstPSDELogicParamMust().getCodeName(), false);
		dstDELogicParamRuntime.renew(iDELogicSession);
		
		if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
			iDELogicSession.debugInfo(String.format("重建参数[%1$s]", dstDELogicParamRuntime.getCodeName()));
		}
	}
	
	protected void onResetParam(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNodeParam iPSDELogicNodeParam) throws Throwable {
		IDELogicParamRuntime dstDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDELogicNodeParam.getDstPSDELogicParamMust().getCodeName(), false);
		dstDELogicParamRuntime.resetAll(iDELogicSession);
		
		if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
			iDELogicSession.debugInfo(String.format("重置参数[%1$s]", dstDELogicParamRuntime.getCodeName()));
		}
	}
	
	
	protected void onSetParamValue(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNodeParam iPSDELogicNodeParam) throws Throwable {
		IDELogicParamRuntime dstDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDELogicNodeParam.getDstPSDELogicParamMust().getCodeName(), false);
		
		if(!StringUtils.hasLength(iPSDELogicNodeParam.getDstFieldName())) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点参数[%1$s]未指定设置目标属性", iPSDELogicNodeParam.getName()));
		}
		
		
		if(DELogicPrepareParamValueTypes.NONEVALUE.equals(iPSDELogicNodeParam.getSrcValueType())) {			
		//	dstEntity.reset(iPSDELogicNodeParam.getDstFieldName().toLowerCase());
			dstDELogicParamRuntime.reset(iDELogicSession, iPSDELogicNodeParam.getDstFieldName().toLowerCase());
			if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
				iDELogicSession.debugInfo(String.format("重置参数[%1$s]属性[%2$s]", dstDELogicParamRuntime.getCodeName(), iPSDELogicNodeParam.getDstFieldName()));
			}
			return ;
		}
		
		Object objValue = this.calcDELogicNodeParamValue(iDELogicRuntimeContext, iDELogicSession, iPSDELogicNodeParam);
		
		if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
			iDELogicSession.debugInfo(String.format("计算节点参数[%1$s] ==> %2$s", iPSDELogicNodeParam.getName(), objValue));
		}
		
		IPSSysTranslator iPSSysTranslator = iPSDELogicNodeParam.getPSSysTranslator();
		if(iPSSysTranslator!=null) {
			ISysTranslatorRuntime iSysTranslatorRuntime = iDELogicRuntimeContext.getSystemRuntime().getSysTranslatorRuntime(iPSSysTranslator);
			objValue = iSysTranslatorRuntime.translate(objValue, !iPSDELogicNodeParam.isOutTranslate(), null, null, null);
			
			if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
				iDELogicSession.debugInfo(String.format("转换器[%1$s]值输入转换 ==> %2$s", iSysTranslatorRuntime.getName(), objValue));
			}
		}
		dstDELogicParamRuntime.set(iDELogicSession, iPSDELogicNodeParam.getDstFieldName().toLowerCase(), objValue);
		
		if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
			iDELogicSession.debugInfo(String.format("设置参数[%1$s]属性[%2$s] <== %3$s", dstDELogicParamRuntime.getCodeName(), iPSDELogicNodeParam.getDstFieldName(), objValue));
		}
		return ;
	}
	
	protected void onAppendParam(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNodeParam iPSDELogicNodeParam) throws Throwable {
		IDELogicParamRuntime dstDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDELogicNodeParam.getDstPSDELogicParamMust().getCodeName(), false);
		IDELogicParamRuntime srcDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDELogicNodeParam.getSrcPSDELogicParamMust().getCodeName(), false);
		String strSrcFieldName = iPSDELogicNodeParam.getSrcFieldName();
		Object objValue = null;
		if(StringUtils.hasLength(strSrcFieldName)){
			objValue =  srcDELogicParamRuntime.get(iDELogicSession, strSrcFieldName);
			if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
				iDELogicSession.debugInfo(String.format("源参数[%1$s]属性[%2$s] ==> %3$s", srcDELogicParamRuntime.getCodeName(), strSrcFieldName, objValue));
			}
		}
		else {
			objValue = srcDELogicParamRuntime.getParamObject(iDELogicSession);
			if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
				iDELogicSession.debugInfo(String.format("源参数[%1$s] ==> %2$s", srcDELogicParamRuntime.getCodeName(), objValue));
			}
		}
		IPSSysTranslator iPSSysTranslator = iPSDELogicNodeParam.getPSSysTranslator();
		if(iPSSysTranslator!=null) {
			ISysTranslatorRuntime iSysTranslatorRuntime = iDELogicRuntimeContext.getSystemRuntime().getSysTranslatorRuntime(iPSSysTranslator);
			objValue = iSysTranslatorRuntime.translate(objValue, !iPSDELogicNodeParam.isOutTranslate(), null, null, null);
			if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
				iDELogicSession.debugInfo(String.format("转换器[%1$s]值输入转换 ==> %2$s", iSysTranslatorRuntime.getName(), objValue));
			}
		}
		dstDELogicParamRuntime.append(iDELogicSession, iPSDELogicNodeParam.getDstIndex(), objValue, iPSDELogicNodeParam.getSrcIndex(), iPSDELogicNodeParam.getSrcSize());
		if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
			if(iPSDELogicNodeParam.getSrcIndex() >= 0 ) {
				iDELogicSession.debugInfo(String.format("附加数组参数[%1$s][%2$s] <== %3$s{%4$s, %5$s}", dstDELogicParamRuntime.getCodeName(), iPSDELogicNodeParam.getDstIndex(), objValue, iPSDELogicNodeParam.getSrcIndex(), iPSDELogicNodeParam.getSrcSize()));
			}
			else {
				iDELogicSession.debugInfo(String.format("附加数组参数[%1$s][%2$s] <== %3$s", dstDELogicParamRuntime.getCodeName(), iPSDELogicNodeParam.getDstIndex(), objValue));
			}
		}
	}
	
	protected void onSortParam(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNodeParam iPSDELogicNodeParam) throws Throwable {
		IDELogicParamRuntime dstDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDELogicNodeParam.getDstPSDELogicParamMust().getCodeName(), false);
		String strDstFieldName = iPSDELogicNodeParam.getDstFieldName();
		if(!StringUtils.hasLength(iPSDELogicNodeParam.getDstFieldName())) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点参数[%1$s]未指定设置排序属性", iPSDELogicNodeParam.getName()));
		}
		dstDELogicParamRuntime.sort(iDELogicSession, strDstFieldName, iPSDELogicNodeParam.getDstSortDir());
		if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
			iDELogicSession.debugInfo(String.format("排序数组参数[%1$s] <== %2$s, %3$s", dstDELogicParamRuntime.getCodeName(), strDstFieldName, iPSDELogicNodeParam.getDstSortDir()));
		}
	}
}
