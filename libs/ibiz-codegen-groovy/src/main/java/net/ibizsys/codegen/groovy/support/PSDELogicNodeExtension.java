package net.ibizsys.codegen.groovy.support;

import java.util.Arrays;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.model.PSModelEnums.DELogicNodeParamType;
import net.ibizsys.model.PSModelEnums.DELogicParamValueType;
import net.ibizsys.model.dataentity.logic.IPSDELogicLink;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.model.dataentity.logic.IPSDELogicNodeParam;
import net.ibizsys.model.dataentity.logic.IPSDERawSqlCallLogic;


public class PSDELogicNodeExtension {

	public static String getComment(IPSDELogicNode iPSDELogicNode) {
		
		StringBuilder stringBuilder = new StringBuilder();
		if(iPSDELogicNode instanceof IPSDERawSqlCallLogic) {
			
		}
		
		return iPSDELogicNode.getMemo();
	}
	
	public static IPSDELogicLink getCatchPSDELogicLink(IPSDELogicNode iPSDELogicNode) {
		
		if(ObjectUtils.isEmpty(iPSDELogicNode.getPSDELogicLinks())) {
			return null;
		}
		
		for(IPSDELogicLink iPSDELogicLink : iPSDELogicNode.getPSDELogicLinks()) {
			if(iPSDELogicLink.isCatchLink()) {
				return iPSDELogicLink;
			}
		}
		return null;
	}
	
	
	public static String getPrepareParamGroovyExpression(IPSDELogicNodeParam iPSDELogicNodeParam) {
		
		String strParamAction = iPSDELogicNodeParam.getParamAction();
		if(DELogicNodeParamType.SETPARAMVALUE.value.equals(strParamAction)) {
			
			if(!StringUtils.hasLength(iPSDELogicNodeParam.getDstFieldName())) {
				throw new RuntimeException(String.format("处理节点参数[%1$s]未指定设置目标属性", iPSDELogicNodeParam.getName()));
			}
			
			if(DELogicParamValueType.NONEVALUE.value.equalsIgnoreCase(iPSDELogicNodeParam.getSrcValueType())) {
				return String.format("param(%1$s).reset(%2$s)"
						,GroovyCodeGenEngineExtension.getGroovyString(iPSDELogicNodeParam.getDstPSDELogicParamMust().getCodeName())
						,GroovyCodeGenEngineExtension.getGroovyString(iPSDELogicNodeParam.getDstFieldName()));
			}
			
			String strValueComment = getParamValueComment(iPSDELogicNodeParam);
			
			String strValueExp = getParamValueExpression(iPSDELogicNodeParam);
			String strExpression = String.format("param(%1$s).set(%2$s, %3$s)"
					,GroovyCodeGenEngineExtension.getGroovyString(iPSDELogicNodeParam.getDstPSDELogicParamMust().getCodeName())
					,GroovyCodeGenEngineExtension.getGroovyString(iPSDELogicNodeParam.getDstFieldName())
					,strValueExp);
			if(StringUtils.hasLength(strValueComment)) {
				StringBuilder stringBuilder = new StringBuilder();
				stringBuilder.append(StringUtils.collectionToDelimitedString(Arrays.asList(strValueComment.replace("\r\n", "\n").replace("\r", "\n").split("\n")), "\n", "// ", ""));
				stringBuilder.append("\n");
				
				strExpression = stringBuilder.toString() + strExpression;
			}
			return strExpression;
			
//			Object objValue = this.calcDELogicNodeParamValue(iDELogicRuntimeContext, iDELogicSession, iPSDELogicNodeParam);
//			dstDELogicParamRuntime.set(iDELogicSession, iPSDELogicNodeParam.getDstFieldName().toLowerCase(), objValue);
			
		}
		
//		for(IPSDELogicNodeParam iPSDELogicNodeParam : psDELogicNodeParamList) {
//			
//			if(DELogicNodeParamTypes.SETPARAMVALUE.equals(strParamAction)) {
////				IEntity dstEntity = iDELogicSession.getParam(iPSDELogicNodeParam.getDstPSDELogicParamMust().getCodeName());
////				if(StringUtils.isEmpty(iPSDELogicNodeParam.getDstFieldName())) {
////					throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点参数[%1$s]未指定目标属性名称", iPSDELogicNodeParam.getName()));
////				}
////				this.onSetParamValue(iDELogicRuntimeContext, iDELogicSession, dstEntity, iPSDELogicNodeParam);
//				onSetParamValue(iDELogicRuntimeContext, iDELogicSession, iPSDELogicNodeParam);
//				continue;
//			}
//			
//			if(DELogicNodeParamTypes.RESETPARAM.equals(strParamAction)) {
//				//IEntity dstEntity = iDELogicSession.getParam(iPSDELogicNodeParam.getDstPSDELogicParamMust().getCodeName());
//				onResetParam(iDELogicRuntimeContext, iDELogicSession, iPSDELogicNodeParam);
//				continue;
//			}
//			
//			if(DELogicNodeParamTypes.COPYPARAM.equals(strParamAction)) {
//				//IEntity srcEntity = iDELogicSession.getParam(iPSDELogicNodeParam.getSrcPSDELogicParamMust().getCodeName());
//				//IEntity dstEntity = iDELogicSession.getParam(iPSDELogicNodeParam.getDstPSDELogicParamMust().getCodeName());
//				
//				//onCopyParam(iDELogicRuntimeContext, iDELogicSession, srcEntity, dstEntity);
//				onCopyParam(iDELogicRuntimeContext, iDELogicSession, iPSDELogicNodeParam);
//				continue;
//			}
//			
//			if(DELogicNodeParamTypes.BINDPARAM.equals(strParamAction)) {
//				onBindParam(iDELogicRuntimeContext, iDELogicSession, iPSDELogicNodeParam);
//				continue;
//			}
//			
//			if(DELogicNodeParamTypes.RENEWPARAM.equals(strParamAction)) {
//				onRenewParam(iDELogicRuntimeContext, iDELogicSession, iPSDELogicNodeParam);
//				continue;
//			}
//			
//			if(DELogicNodeParamTypes.APPENDPARAM.equals(strParamAction)) {
//				onAppendParam(iDELogicRuntimeContext, iDELogicSession, iPSDELogicNodeParam);
//				continue;
//			}
//			
//			if(DELogicNodeParamTypes.SORTPARAM.equals(strParamAction)) {
//				onSortParam(iDELogicRuntimeContext, iDELogicSession, iPSDELogicNodeParam);
//				continue;
//			}
//		}
		
		throw new RuntimeException(String.format("处理节点参数[%1$s]准备参数类型[%2$s]未支持", iPSDELogicNodeParam.getName(), strParamAction));
	}
	
	
	public static String getParamValueExpression(IPSDELogicNodeParam iPSDELogicNodeParam) {
		
		if(DELogicParamValueType.SRCDLPARAM.value.equals(iPSDELogicNodeParam.getSrcValueType())) {
			if(StringUtils.isEmpty(iPSDELogicNodeParam.getSrcFieldName())) {
				return String.format("param(%1$s).real"
						,GroovyCodeGenEngineExtension.getGroovyString(iPSDELogicNodeParam.getSrcPSDELogicParamMust().getCodeName()));
			}
			else {
				return String.format("param(%1$s).get(%2$s)"
						,GroovyCodeGenEngineExtension.getGroovyString(iPSDELogicNodeParam.getSrcPSDELogicParamMust().getCodeName())
						,GroovyCodeGenEngineExtension.getGroovyString(iPSDELogicNodeParam.getSrcFieldName()));
			}
		}
		
		if(DELogicParamValueType.NULLVALUE.value.equals(iPSDELogicNodeParam.getSrcValueType())) {			
			return "null";
		}

		if(DELogicParamValueType.SRCVALUE.value.equals(iPSDELogicNodeParam.getSrcValueType())) {			
			return GroovyCodeGenEngineExtension.getGroovyString(iPSDELogicNodeParam.getSrcValue());
		}
		
		IPSDELogicNode iPSDELogcNode = iPSDELogicNodeParam.getParentPSModelObject(IPSDELogicNode.class, false);
		int nPos = iPSDELogcNode.getPSDELogicNodeParams().indexOf(iPSDELogicNodeParam);
		if(nPos != -1) {
			return String.format("getNodeParamValue(NODES['%1$s'].getPSDELogicNodeParams()[%2$s])", iPSDELogcNode.getCodeName().toUpperCase(), nPos);
		}
		
		
		
		
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
		
		
		throw new RuntimeException(String.format("处理节点参数[%1$s]源值类型[%2$s]未支持", iPSDELogicNodeParam.getName(), iPSDELogicNodeParam.getSrcValueType()));
	}
	
	public static String getParamValueComment(IPSDELogicNodeParam iPSDELogicNodeParam) {
		if(DELogicParamValueType.EXPRESSION.value.equals(iPSDELogicNodeParam.getSrcValueType())) {	
			StringBuilder stringBuilder = new StringBuilder();
			if(iPSDELogicNodeParam.getDstPSDELogicParam()!=null) {
				stringBuilder.append(String.format("当前参数：%1$s(%2$s)\n", iPSDELogicNodeParam.getDstPSDELogicParam().getName(), iPSDELogicNodeParam.getDstPSDELogicParam().getCodeName()));
			}
			stringBuilder.append(String.format("脚本代码：\n%1$s", iPSDELogicNodeParam.getExpression()));
			return stringBuilder.toString();
		}
		return null;
	}
	
	
	
}
