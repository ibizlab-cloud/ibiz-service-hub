package net.ibizsys.model.util;

import java.util.List;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.model.PSModelEnums.LogicNodeType;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.database.IPSSysDBScheme;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.logic.IPSDEDEActionLogic;
import net.ibizsys.model.dataentity.logic.IPSDEEndLogic;
import net.ibizsys.model.dataentity.logic.IPSDELogic;
import net.ibizsys.model.dataentity.logic.IPSDELogicLink;
import net.ibizsys.model.dataentity.logic.IPSDELogicLinkCond;
import net.ibizsys.model.dataentity.logic.IPSDELogicLinkGroupCond;
import net.ibizsys.model.dataentity.logic.IPSDELogicLinkSingleCond;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.model.dataentity.logic.IPSDELogicNodeParam;
import net.ibizsys.model.dataentity.logic.IPSDELogicParam;
import net.ibizsys.model.dataentity.logic.IPSDERawCodeLogic;
import net.ibizsys.model.dataentity.logic.IPSDERawSqlAndLoopCallLogic;
import net.ibizsys.model.dataentity.logic.IPSDERawSqlCallLogic;
import net.ibizsys.model.dataentity.logic.IPSDESFPluginLogic;
import net.ibizsys.model.dataentity.logic.IPSDEThrowExceptionLogic;

public class RuleEngineUtils {

	public static String INDENT = "    ";
	/**
	 * 等于操作
	 */
	public final static String COND_EQ = "EQ";

	/**
	 * 绝对等于（保留）
	 */
	public final static String COND_ABSEQ = "ABSEQ";

	/**
	 * 大于操作
	 */
	public final static String COND_GT = "GT";

	/**
	 * 大于等于操作
	 */
	public final static String COND_GTANDEQ = "GTANDEQ";

	/**
	 * 小于操作
	 */
	public final static String COND_LT = "LT";

	/**
	 * 小于等于操作
	 */
	public final static String COND_LTANDEQ = "LTANDEQ";

	/**
	 * 不等于操作
	 */
	public final static String COND_NOTEQ = "NOTEQ";

	/**
	 * 为空判断操作
	 */
	public final static String COND_ISNULL = "ISNULL";

	/**
	 * 不为空判断操作
	 */
	public final static String COND_ISNOTNULL = "ISNOTNULL";

	/**
	 * 文本包含
	 */
	public final static String COND_USERLIKE = "USERLIKE";

	/**
	 * 文本包含
	 */
	public final static String COND_LIKE = "LIKE";

	/**
	 * 文本左包含
	 */
	public final static String COND_LEFTLIKE = "LEFTLIKE";

	/**
	 * 文本右包含
	 */
	public final static String COND_RIGHTLIKE = "RIGHTLIKE";

	/**
	 * 空判断
	 */
	public final static String COND_TESTNULL = "TESTNULL";

	/**
	 * 值包含在给定的范围中
	 */
	public final static String COND_IN = "IN";
	
	
	
	/**
	 * 值不包含在给定的范围中
	 */
	public final static String COND_NOTIN = "NOTIN";
	
	/**
	 * 组逻辑操作，或处理
	 */
	public final static String COND_OR = "OR";

	/**
	 * 组逻辑操作，与处理
	 */
	public final static String COND_AND = "AND";

	public static String toDELogicDSL(IPSDELogic iPSDELogic) throws Exception {
		String strIndent = "";

		StringBuilder stringBuilder = new StringBuilder();

	//	stringBuilder.append("{\n");

		stringBuilder.append(strIndent + "params {\n");
		List<IPSDELogicParam> psDELogicParamList = iPSDELogic.getPSDELogicParams();
		if (!ObjectUtils.isEmpty(psDELogicParamList)) {
			for (IPSDELogicParam iPSDELogicParam : psDELogicParamList) {
				appendPSDELogicParam(stringBuilder, strIndent + INDENT, iPSDELogicParam);
			}
		}
		stringBuilder.append(strIndent + "}\n");

		stringBuilder.append(strIndent + "nodes {\n");
		List<IPSDELogicNode> psDELogicNodeList = iPSDELogic.getPSDELogicNodes();
		if (!ObjectUtils.isEmpty(psDELogicNodeList)) {
			for (IPSDELogicNode iPSDELogicNode : psDELogicNodeList) {
				appendPSDELogicNode(stringBuilder, strIndent + INDENT, iPSDELogicNode);
			}
		}
		stringBuilder.append(strIndent + "}\n");

	//	stringBuilder.append("}");
		return stringBuilder.toString();
	}

	/*
	 * 
	 * params { entity { name 'default' dataEntity 'ab.dd' defaultParam true }
	 * entity { name 'param1' } } nodes { begin { name 'begin' routes { route {
	 * cond { and { eq { dstParam 'default' dstField 'field2' srcValue '条件值' } }
	 * } to 'prepareParams' } } } prepareParam { name 'prepareParams' params {
	 * set { dstParam 'default' dstField 'field' srcValueType 'SRCVALUE'
	 * srcValue 'value' }
	 * 
	 * set { dstParam 'default' dstField 'field2' srcValueType 'SRCDLPARAM'
	 * srcParam 'param1' srcValue '''
	 * 
	 * select * from aa inner join ''' } }
	 * 
	 * } end { returnType 'NONEVALUE' } }
	 * 
	 */

	protected static void appendPSDELogicParam(StringBuilder stringBuilder, String strIndent, IPSDELogicParam iPSDELogicParam) throws Exception {
		if (iPSDELogicParam.isEntityParam()) {
			stringBuilder.append(strIndent + "entity {\n");
			stringBuilder.append(strIndent + INDENT + String.format("name '%1$s'\n", iPSDELogicParam.getCodeName()));
			IPSDataEntity paramPSDataEntity = iPSDELogicParam.getParamPSDataEntity();
			if (paramPSDataEntity != null) {
				stringBuilder.append(strIndent + INDENT + String.format("dataEntity '%1$s'\n", PSModelUtils.calcUniqueTag(paramPSDataEntity.getPSSystemModule(), paramPSDataEntity.getCodeName())));
			}
			if (iPSDELogicParam.isDefault()) {
				stringBuilder.append(strIndent + INDENT + String.format("defaultParam true\n"));
			}
			stringBuilder.append(strIndent + "}\n");
			return;
		}

		throw new Exception(String.format("无法识别的逻辑参数[%1$s]", iPSDELogicParam.getName()));
	}

	protected static void appendPSDELogicNode(StringBuilder stringBuilder, String strIndent, IPSDELogicNode iPSDELogicNode) throws Exception {

		String strLogicNodeType = iPSDELogicNode.getLogicNodeType();
		if (LogicNodeType.BEGIN.value.equals(strLogicNodeType)) {
			stringBuilder.append(strIndent + "begin {\n");
			stringBuilder.append(strIndent + INDENT + String.format("name '%1$s'\n", iPSDELogicNode.getCodeName()));
			appendPSDELogicLinks(stringBuilder, strIndent + INDENT, iPSDELogicNode);

			stringBuilder.append(strIndent + "}\n");
			return;
		} 
		
		if (LogicNodeType.END.value.equals(strLogicNodeType)) {
			
			IPSDEEndLogic iPSDEEndLogic = (IPSDEEndLogic)iPSDELogicNode;
			
			stringBuilder.append(strIndent + "end {\n");
			stringBuilder.append(strIndent + INDENT + String.format("name '%1$s'\n", iPSDELogicNode.getCodeName()));
			if(StringUtils.hasLength(iPSDEEndLogic.getReturnType())) {
				stringBuilder.append(strIndent + INDENT + String.format("returnType '%1$s'\n", iPSDEEndLogic.getReturnType()));
			}
			if(StringUtils.hasLength(iPSDEEndLogic.getRawValue())) {
				stringBuilder.append(strIndent + INDENT + String.format("rawValue '%1$s'\n", groovyString(iPSDEEndLogic.getRawValue())));
				if(iPSDEEndLogic.getRawValueStdDataType()>0) {
					stringBuilder.append(strIndent + INDENT + String.format("rawValueStdDataType %1$s\n", iPSDEEndLogic.getRawValueStdDataType()));
				}
			}
			
			if(iPSDEEndLogic.getReturnParam()!=null) {
				stringBuilder.append(strIndent + INDENT + String.format("dstParam '%1$s'\n", iPSDEEndLogic.getReturnParam().getCodeName()));
				if(StringUtils.hasLength(iPSDEEndLogic.getDstFieldName())) {
					stringBuilder.append(strIndent + INDENT + String.format("dstField '%1$s'\n", iPSDEEndLogic.getDstFieldName()));
				}
			}

			stringBuilder.append(strIndent + "}\n");
			return;
		} 
		
		if (LogicNodeType.PREPAREPARAM.value.equals(strLogicNodeType)) {
			stringBuilder.append(strIndent + "prepareParam {\n");
			stringBuilder.append(strIndent + INDENT + String.format("name '%1$s'\n", iPSDELogicNode.getCodeName()));
			appendPSDELogicNodeParams(stringBuilder, strIndent + INDENT, iPSDELogicNode);
			appendPSDELogicLinks(stringBuilder, strIndent + INDENT, iPSDELogicNode);
			stringBuilder.append(strIndent + "}\n");
			return;
		} 
		
		if (LogicNodeType.RAWSQLCALL.value.equals(strLogicNodeType)) {
			
			IPSDERawSqlCallLogic iPSDERawSqlCallLogic = (IPSDERawSqlCallLogic)iPSDELogicNode;
			
			stringBuilder.append(strIndent + "rawSql {\n");
			stringBuilder.append(strIndent + INDENT + String.format("name '%1$s'\n", iPSDELogicNode.getCodeName()));
			IPSSysDBScheme iPSSysDBScheme = iPSDERawSqlCallLogic.getPSSysDBScheme();
			if(iPSSysDBScheme!=null) {
				stringBuilder.append(strIndent + INDENT + String.format("DBSchema '%1$s'\n", PSModelUtils.calcUniqueTag(iPSSysDBScheme.getPSSysModelGroup(), iPSSysDBScheme.getDSLink())));
			}
			if(StringUtils.hasLength(iPSDERawSqlCallLogic.getSql())) {
				stringBuilder.append(strIndent + INDENT + String.format("sql '''\n"));
				append(stringBuilder, iPSDERawSqlCallLogic.getSql(), strIndent + INDENT+ INDENT);
				stringBuilder.append(strIndent + INDENT + String.format("\n"));
				stringBuilder.append(strIndent + INDENT + String.format("'''\n"));
			}
			
			if(iPSDERawSqlCallLogic.getDstPSDELogicParam()!=null) {
				stringBuilder.append(strIndent + INDENT + String.format("dstParam '%1$s'\n", iPSDERawSqlCallLogic.getDstPSDELogicParam().getCodeName()));
				stringBuilder.append(strIndent + INDENT + String.format("fillDstParam %1$s\n", iPSDERawSqlCallLogic.isFillDstLogicParam()));
				stringBuilder.append(strIndent + INDENT + String.format("ignoreResetDstParam %1$s\n", iPSDERawSqlCallLogic.isIgnoreResetDstLogicParam()));
			}
			
			appendPSDELogicNodeParams(stringBuilder, strIndent + INDENT, iPSDELogicNode);
			appendPSDELogicLinks(stringBuilder, strIndent + INDENT, iPSDELogicNode);
			stringBuilder.append(strIndent + "}\n");
			return;
		} 
		
		if (LogicNodeType.RAWSQLANDLOOPCALL.value.equals(strLogicNodeType)) {
			
			IPSDERawSqlAndLoopCallLogic iPSDERawSqlAndLoopCallLogic = (IPSDERawSqlAndLoopCallLogic)iPSDELogicNode;
			
			stringBuilder.append(strIndent + "rawSqlAndLoop {\n");
			stringBuilder.append(strIndent + INDENT + String.format("name '%1$s'\n", iPSDELogicNode.getCodeName()));
			IPSSysDBScheme iPSSysDBScheme = iPSDERawSqlAndLoopCallLogic.getPSSysDBScheme();
			if(iPSSysDBScheme!=null) {
				stringBuilder.append(strIndent + INDENT + String.format("DBSchema '%1$s'\n", PSModelUtils.calcUniqueTag(iPSSysDBScheme.getPSSysModelGroup(), iPSSysDBScheme.getDSLink())));
			}
			if(StringUtils.hasLength(iPSDERawSqlAndLoopCallLogic.getSql())) {
				stringBuilder.append(strIndent + INDENT + String.format("sql '''\n"));
				append(stringBuilder, iPSDERawSqlAndLoopCallLogic.getSql(), strIndent + INDENT+ INDENT);
				stringBuilder.append(strIndent + INDENT + String.format("\n"));
				stringBuilder.append(strIndent + INDENT + String.format("'''\n"));
			}
			
			if(iPSDERawSqlAndLoopCallLogic.getSrcPSDELogicParam()!=null) {
				stringBuilder.append(strIndent + INDENT + String.format("srcParam '%1$s'\n", iPSDERawSqlAndLoopCallLogic.getSrcPSDELogicParam().getCodeName()));
			}
			
			IPSDataEntity dstPSDataEntity = iPSDERawSqlAndLoopCallLogic.getDstPSDataEntity();
			if (dstPSDataEntity != null) {
				stringBuilder.append(strIndent + INDENT + String.format("dstDataEntity '%1$s'\n", PSModelUtils.calcUniqueTag(dstPSDataEntity.getPSSystemModule(), dstPSDataEntity.getCodeName())));
				if(iPSDERawSqlAndLoopCallLogic.getDstPSDEAction()!=null) {
					stringBuilder.append(strIndent + INDENT + String.format("dstDEAction '%1$s'\n", iPSDERawSqlAndLoopCallLogic.getDstPSDEAction().getCodeName()));
				}
			}
			
			appendPSDELogicNodeParams(stringBuilder, strIndent + INDENT, iPSDELogicNode);
			appendPSDELogicLinks(stringBuilder, strIndent + INDENT, iPSDELogicNode);
			stringBuilder.append(strIndent + "}\n");
			return;
		} 

		if (LogicNodeType.DEACTION.value.equals(strLogicNodeType)) {
			
			IPSDEDEActionLogic iPSDEDEActionLogic = (IPSDEDEActionLogic)iPSDELogicNode;
			
			stringBuilder.append(strIndent + "action {\n");
			stringBuilder.append(strIndent + INDENT + String.format("name '%1$s'\n", iPSDELogicNode.getCodeName()));
			IPSDataEntity dstPSDataEntity = iPSDEDEActionLogic.getDstPSDataEntity();
			if (dstPSDataEntity != null) {
				stringBuilder.append(strIndent + INDENT + String.format("dstDataEntity '%1$s'\n", PSModelUtils.calcUniqueTag(dstPSDataEntity.getPSSystemModule(), dstPSDataEntity.getCodeName())));
				if(iPSDEDEActionLogic.getDstPSDEAction()!=null) {
					stringBuilder.append(strIndent + INDENT + String.format("dstDEAction '%1$s'\n", iPSDEDEActionLogic.getDstPSDEAction().getCodeName()));
				}
			}
			if(iPSDEDEActionLogic.getDstPSDELogicParam()!=null) {
				stringBuilder.append(strIndent + INDENT + String.format("dstParam '%1$s'\n", iPSDEDEActionLogic.getDstPSDELogicParam().getCodeName()));
			}
			if(iPSDEDEActionLogic.getRetPSDELogicParam()!=null) {
				stringBuilder.append(strIndent + INDENT + String.format("retParam '%1$s'\n", iPSDEDEActionLogic.getRetPSDELogicParam().getCodeName()));
			}
			
			appendPSDELogicNodeParams(stringBuilder, strIndent + INDENT, iPSDELogicNode);
			appendPSDELogicLinks(stringBuilder, strIndent + INDENT, iPSDELogicNode);
			stringBuilder.append(strIndent + "}\n");
			return;
		} 

		if (LogicNodeType.RAWSFCODE.value.equals(strLogicNodeType)) {
			
			IPSDERawCodeLogic iPSDERawCodeLogic = (IPSDERawCodeLogic)iPSDELogicNode;
			
			stringBuilder.append(strIndent + "rawCode {\n");
			stringBuilder.append(strIndent + INDENT + String.format("name '%1$s'\n", iPSDELogicNode.getCodeName()));
			
			if(StringUtils.hasLength(iPSDERawCodeLogic.getCode())) {
				stringBuilder.append(strIndent + INDENT + String.format("code '''\n"));
				append(stringBuilder, iPSDERawCodeLogic.getCode(), strIndent + INDENT+ INDENT);
				stringBuilder.append(strIndent + INDENT + String.format("\n"));
				stringBuilder.append(strIndent + INDENT + String.format("'''\n"));
			}
			
			if(iPSDERawCodeLogic.getDstPSDELogicParam()!=null) {
				stringBuilder.append(strIndent + INDENT + String.format("dstParam '%1$s'\n", iPSDERawCodeLogic.getDstPSDELogicParam().getCodeName()));
			}
			if(iPSDERawCodeLogic.getRetPSDELogicParam()!=null) {
				stringBuilder.append(strIndent + INDENT + String.format("retParam '%1$s'\n", iPSDERawCodeLogic.getRetPSDELogicParam().getCodeName()));
			}
			
			appendPSDELogicNodeParams(stringBuilder, strIndent + INDENT, iPSDELogicNode);
			appendPSDELogicLinks(stringBuilder, strIndent + INDENT, iPSDELogicNode);
			stringBuilder.append(strIndent + "}\n");
			return;
		} 
		
		if (LogicNodeType.SFPLUGIN.value.equals(strLogicNodeType)) {
			
			IPSDESFPluginLogic iPSDESFPluginLogic = (IPSDESFPluginLogic)iPSDELogicNode;
			
			stringBuilder.append(strIndent + "plugin {\n");
			stringBuilder.append(strIndent + INDENT + String.format("name '%1$s'\n", iPSDELogicNode.getCodeName()));
			
			if(iPSDESFPluginLogic.getPSSysSFPlugin()!=null) {
				stringBuilder.append(strIndent + INDENT + String.format("plugin '%1$s'\n", iPSDESFPluginLogic.getPSSysSFPlugin().getRTObjectName()));
			}
			
			if(iPSDESFPluginLogic.getDstPSDELogicParam()!=null) {
				stringBuilder.append(strIndent + INDENT + String.format("dstParam '%1$s'\n", iPSDESFPluginLogic.getDstPSDELogicParam().getCodeName()));
			}
			if(iPSDESFPluginLogic.getRetPSDELogicParam()!=null) {
				stringBuilder.append(strIndent + INDENT + String.format("retParam '%1$s'\n", iPSDESFPluginLogic.getRetPSDELogicParam().getCodeName()));
			}
			
			appendPSDELogicNodeParams(stringBuilder, strIndent + INDENT, iPSDELogicNode);
			appendPSDELogicLinks(stringBuilder, strIndent + INDENT, iPSDELogicNode);
			stringBuilder.append(strIndent + "}\n");
			return;
		} 

		if (LogicNodeType.THROWEXCEPTION.value.equals(strLogicNodeType)) {
			
			IPSDEThrowExceptionLogic iPSDEThrowExceptionLogic = (IPSDEThrowExceptionLogic)iPSDELogicNode;
			
			stringBuilder.append(strIndent + "error {\n");
			stringBuilder.append(strIndent + INDENT + String.format("name '%1$s'\n", iPSDELogicNode.getCodeName()));
			
			stringBuilder.append(strIndent + INDENT + String.format("errorCode %1$s\n", iPSDEThrowExceptionLogic.getErrorCode()));
			if(StringUtils.hasLength(iPSDEThrowExceptionLogic.getErrorInfo())) {
				stringBuilder.append(strIndent + INDENT + String.format("errorInfo '%1$s'\n", groovyString(iPSDEThrowExceptionLogic.getErrorInfo())));
			}
			if(StringUtils.hasLength(iPSDEThrowExceptionLogic.getExceptionObj())) {
				stringBuilder.append(strIndent + INDENT + String.format("exceptionObj '%1$s'\n", groovyString(iPSDEThrowExceptionLogic.getExceptionObj())));
			}
			
			if(iPSDEThrowExceptionLogic.getExceptionParam()!=null) {
				stringBuilder.append(strIndent + INDENT + String.format("dstParam '%1$s'\n", iPSDEThrowExceptionLogic.getExceptionParam().getCodeName()));
			}
			
			appendPSDELogicNodeParams(stringBuilder, strIndent + INDENT, iPSDELogicNode);
			//appendPSDELogicLinks(stringBuilder, strIndent + INDENT, iPSDELogicNode);
			stringBuilder.append(strIndent + "}\n");
			return;
		} 

		
//		{
//			stringBuilder.append(strIndent + "node {\n");
//			stringBuilder.append(strIndent + INDENT + String.format("name '%1$s'\n", iPSDELogicNode.getCodeName()));
//			appendPSDELogicLinks(stringBuilder, strIndent + INDENT, iPSDELogicNode);
//
//			stringBuilder.append(strIndent + "}\n");
//			return;
//		}

	
		// if (LogicNodeType.DEACTION.value.equals(strLogicNodeType)) {
		// return new DELogicDEActionNodeRuntime();
		// }
		// if (LogicNodeType.RAWSQLANDLOOPCALL.value.equals(strLogicNodeType)) {
		// return new DELogicRawSqlAndLoopCallNodeRuntime();
		// }
		// if (LogicNodeType.RAWSQLCALL.value.equals(strLogicNodeType)) {
		// return new DELogicRawSqlCallNodeRuntime();
		// }
		//// if (LogicNodeType.STARTWF.value.equals(strLogicNodeType)) {
		//// return new DELogicStartWFNodeRuntime();
		//// }
		//// if (LogicNodeType.SYSLOGIC.value.equals(strLogicNodeType)) {
		//// return new DELogicSysLogicNodeRuntime();
		//// }
		//// if (LogicNodeType.THROWEXCEPTION.value.equals(strLogicNodeType)) {
		//// return new DELogicThrowExceptionNodeRuntime();
		//// }
		//// if (LogicNodeType.SFPLUGIN.value.equals(strLogicNodeType)) {
		//// return new DELogicSFPluginNodeRuntime();
		//// }
		// if (LogicNodeType.RAWSFCODE.value.equals(strLogicNodeType)) {
		// return new DELogicRawSFCodeNodeRuntime();
		// }
		//// if (LogicNodeType.DEDATASET.value.equals(strLogicNodeType)) {
		//// return new DELogicDEDataSetNodeRuntime();
		//// }
		//// if (LogicNodeType.DELOGIC.value.equals(strLogicNodeType)) {
		//// return new DELogicDELogicNodeRuntime();
		//// }
		// if (LogicNodeType.END.value.equals(strLogicNodeType)) {
		// return new DELogicEndNodeRuntime();
		// }
		//// if (LogicNodeType.DENOTIFY.value.equals(strLogicNodeType)) {
		//// return new DELogicDENotifyNodeRuntime();
		//// }
		//// if (LogicNodeType.COMMIT.value.equals(strLogicNodeType)) {
		//// return new DELogicCommitNodeRuntime();
		//// }
		//// if (LogicNodeType.ROLLBACK.value.equals(strLogicNodeType)) {
		//// return new DELogicRollbackNodeRuntime();
		//// }
		//// if (LogicNodeType.DEDATAQUERY.value.equals(strLogicNodeType)) {
		//// return new DELogicDEDataQueryNodeRuntime();
		//// }
		//// if (LogicNodeType.DEBUGPARAM.value.equals(strLogicNodeType)) {
		//// return new DELogicDebugParamNodeRuntime();
		//// }
		//// if (LogicNodeType.SUBSYSSAMETHOD.value.equals(strLogicNodeType)) {
		//// return new DELogicSubSysSAMethodNodeRuntime();
		//// }
		//// if (LogicNodeType.DEDATASYNC.value.equals(strLogicNodeType)) {
		//// return new DELogicDEDataSyncNodeRuntime();
		//// }
		//// if (LogicNodeType.APPENDPARAM.value.equals(strLogicNodeType)) {
		//// return new DELogicAppendParamNodeRuntime();
		//// }
		//// if (LogicNodeType.BINDPARAM.value.equals(strLogicNodeType)) {
		//// return new DELogicBindParamNodeRuntime();
		//// }
		//// if (LogicNodeType.COPYPARAM.value.equals(strLogicNodeType)) {
		//// return new DELogicCopyParamNodeRuntime();
		//// }
		//// if (LogicNodeType.RENEWPARAM.value.equals(strLogicNodeType)) {
		//// return new DELogicRenewParamNodeRuntime();
		//// }
		//// if (LogicNodeType.RESETPARAM.value.equals(strLogicNodeType)) {
		//// return new DELogicResetParamNodeRuntime();
		//// }
		//// if (LogicNodeType.SORTPARAM.value.equals(strLogicNodeType)) {
		//// return new DELogicSortParamNodeRuntime();
		//// }
		//// if (LogicNodeType.RAWWEBCALL.value.equals(strLogicNodeType)) {
		//// return new DELogicRawWebCallNodeRuntime();
		//// }
		//// if (LogicNodeType.DEPRINT.value.equals(strLogicNodeType)) {
		//// return new DELogicDEPrintNodeRuntime();
		//// }

		//throw new Exception(String.format("无法识别的逻辑节点[%1$s]", iPSDELogicNode.getName()));
	}
	
	protected static void appendPSDELogicNodeParams(StringBuilder stringBuilder, String strIndent, IPSDELogicNode iPSDELogicNode) throws Exception {
		List<IPSDELogicNodeParam> psDELogicNodeParamList = iPSDELogicNode.getPSDELogicNodeParams();
		if (ObjectUtils.isEmpty(psDELogicNodeParamList)) {
			return;
		}

		stringBuilder.append(strIndent + "params {\n");
		for (IPSDELogicNodeParam iPSDELogicNodeParam : psDELogicNodeParamList) {
			appendPSDELogicNodeParam(stringBuilder, strIndent + INDENT, iPSDELogicNodeParam);
		}
		stringBuilder.append(strIndent + "}\n");
	}
	
	protected static void appendPSDELogicNodeParam(StringBuilder stringBuilder, String strIndent, IPSDELogicNodeParam iPSDELogicNodeParam) throws Exception {
		String strParamAction = iPSDELogicNodeParam.getParamAction();
		if("SETPARAMVALUE".equals(strParamAction)) {
			stringBuilder.append(strIndent + "setParamValue {\n");
			if(iPSDELogicNodeParam.getDstPSDELogicParam()!=null) {
				stringBuilder.append(strIndent + INDENT + String.format("dstParam '%1$s'\n", iPSDELogicNodeParam.getDstPSDELogicParam().getCodeName()));
			}
			
			if(StringUtils.hasLength(iPSDELogicNodeParam.getDstFieldName())) {
				stringBuilder.append(strIndent + INDENT + String.format("dstField '%1$s'\n", iPSDELogicNodeParam.getDstFieldName()));
			}
			
			if(StringUtils.hasLength(iPSDELogicNodeParam.getSrcValueType())) {
				stringBuilder.append(strIndent + INDENT + String.format("srcValueType '%1$s'\n", iPSDELogicNodeParam.getSrcValueType()));
			}
			
			if(iPSDELogicNodeParam.getSrcPSDELogicParam()!=null) {
				stringBuilder.append(strIndent + INDENT + String.format("srcParam '%1$s'\n", iPSDELogicNodeParam.getSrcPSDELogicParam().getCodeName()));
			}
			
			if(StringUtils.hasLength(iPSDELogicNodeParam.getSrcFieldName())) {
				stringBuilder.append(strIndent + INDENT + String.format("srcField '%1$s'\n", iPSDELogicNodeParam.getSrcFieldName()));
			}
			
			if(StringUtils.hasLength(iPSDELogicNodeParam.getSrcValue())) {
				stringBuilder.append(strIndent + INDENT + String.format("srcValue '%1$s'\n", groovyString(iPSDELogicNodeParam.getSrcValue())));
				if(iPSDELogicNodeParam.getSrcValueStdDataType()>0) {
					stringBuilder.append(strIndent + INDENT + String.format("srcValueStdDataType %1$s\n", iPSDELogicNodeParam.getSrcValueStdDataType()));
				}
			}
			
			if(StringUtils.hasLength(iPSDELogicNodeParam.getExpression())) {
				stringBuilder.append(strIndent + INDENT + String.format("expression '''\n"));
				append(stringBuilder, iPSDELogicNodeParam.getExpression(), strIndent + INDENT+ INDENT);
				stringBuilder.append(strIndent + INDENT + String.format("\n"));
				stringBuilder.append(strIndent + INDENT + String.format("'''\n"));
			}
			
			stringBuilder.append(strIndent + "}\n");
			return;
		}
		
		if("RESETPARAM".equals(strParamAction)) {
			stringBuilder.append(strIndent + "resetParam {\n");
			if(iPSDELogicNodeParam.getDstPSDELogicParam()!=null) {
				stringBuilder.append(strIndent + INDENT + String.format("dstParam '%1$s'\n", iPSDELogicNodeParam.getDstPSDELogicParam().getCodeName()));
			}
			
			stringBuilder.append(strIndent + "}\n");
			return;
		}
		
		if("COPYPARAM".equals(strParamAction)) {
			stringBuilder.append(strIndent + "copyParam {\n");
			if(iPSDELogicNodeParam.getDstPSDELogicParam()!=null) {
				stringBuilder.append(strIndent + INDENT + String.format("dstParam '%1$s'\n", iPSDELogicNodeParam.getDstPSDELogicParam().getCodeName()));
			}
			
			if(iPSDELogicNodeParam.getSrcPSDELogicParam()!=null) {
				stringBuilder.append(strIndent + INDENT + String.format("srcParam '%1$s'\n", iPSDELogicNodeParam.getSrcPSDELogicParam().getCodeName()));
			}

			stringBuilder.append(strIndent + "}\n");
			return;
		}
		
		if("BINDPARAM".equals(strParamAction)) {
			stringBuilder.append(strIndent + "bindParam {\n");
			if(iPSDELogicNodeParam.getDstPSDELogicParam()!=null) {
				stringBuilder.append(strIndent + INDENT + String.format("dstParam '%1$s'\n", iPSDELogicNodeParam.getDstPSDELogicParam().getCodeName()));
			}
			
			if(iPSDELogicNodeParam.getSrcPSDELogicParam()!=null) {
				stringBuilder.append(strIndent + INDENT + String.format("srcParam '%1$s'\n", iPSDELogicNodeParam.getSrcPSDELogicParam().getCodeName()));
			}
			
			if(StringUtils.hasLength(iPSDELogicNodeParam.getSrcFieldName())) {
				stringBuilder.append(strIndent + INDENT + String.format("srcField '%1$s'\n", iPSDELogicNodeParam.getSrcFieldName()));
			}

			stringBuilder.append(strIndent + "}\n");
			return;
		}
		
		if("RENEWPARAM".equals(strParamAction)) {
			stringBuilder.append(strIndent + "renewParam {\n");
			if(iPSDELogicNodeParam.getDstPSDELogicParam()!=null) {
				stringBuilder.append(strIndent + INDENT + String.format("dstParam '%1$s'\n", iPSDELogicNodeParam.getDstPSDELogicParam().getCodeName()));
			}
			stringBuilder.append(strIndent + "}\n");
			return;
		}
		
		if("APPENDPARAM".equals(strParamAction)) {
			stringBuilder.append(strIndent + "appendParam {\n");
			if(iPSDELogicNodeParam.getDstPSDELogicParam()!=null) {
				stringBuilder.append(strIndent + INDENT + String.format("dstParam '%1$s'\n", iPSDELogicNodeParam.getDstPSDELogicParam().getCodeName()));
			}
			
			if(iPSDELogicNodeParam.getSrcPSDELogicParam()!=null) {
				stringBuilder.append(strIndent + INDENT + String.format("srcParam '%1$s'\n", iPSDELogicNodeParam.getSrcPSDELogicParam().getCodeName()));
			}
			
			if(StringUtils.hasLength(iPSDELogicNodeParam.getSrcFieldName())) {
				stringBuilder.append(strIndent + INDENT + String.format("srcField '%1$s'\n", iPSDELogicNodeParam.getSrcFieldName()));
			}
			
			if(iPSDELogicNodeParam.getSrcIndex()>=0) {
				stringBuilder.append(strIndent + INDENT + String.format("srcIndex %1$s\n", iPSDELogicNodeParam.getSrcIndex()));
			}
			
			if(iPSDELogicNodeParam.getSrcSize()>=0) {
				stringBuilder.append(strIndent + INDENT + String.format("srcSize %1$s\n", iPSDELogicNodeParam.getSrcSize()));
			}
			
			if(iPSDELogicNodeParam.getDstIndex()>=0) {
				stringBuilder.append(strIndent + INDENT + String.format("dstIndex %1$s\n", iPSDELogicNodeParam.getDstIndex()));
			}
			
			stringBuilder.append(strIndent + "}\n");
			return;
		}
		
		if("SORTPARAM".equals(strParamAction)) {
			stringBuilder.append(strIndent + "renewParam {\n");
			if(iPSDELogicNodeParam.getDstPSDELogicParam()!=null) {
				stringBuilder.append(strIndent + INDENT + String.format("dstParam '%1$s'\n", iPSDELogicNodeParam.getDstPSDELogicParam().getCodeName()));
			}
			
			if(StringUtils.hasLength(iPSDELogicNodeParam.getDstFieldName())) {
				stringBuilder.append(strIndent + INDENT + String.format("dstField '%1$s'\n", iPSDELogicNodeParam.getDstFieldName()));
			}
			
			if(StringUtils.hasLength(iPSDELogicNodeParam.getDstSortDir())) {
				stringBuilder.append(strIndent + INDENT + String.format("dstSortDir '%1$s'\n", iPSDELogicNodeParam.getDstSortDir()));
			}
			stringBuilder.append(strIndent + "}\n");
			return;
		}
		
		if("SQLPARAM".equals(strParamAction)) {
			stringBuilder.append(strIndent + "param {\n");
			
			if(StringUtils.hasLength(iPSDELogicNodeParam.getSrcValueType())) {
				stringBuilder.append(strIndent + INDENT + String.format("srcValueType '%1$s'\n", iPSDELogicNodeParam.getSrcValueType()));
			}
			
			if(iPSDELogicNodeParam.getDstPSDELogicParam()!=null) {
				stringBuilder.append(strIndent + INDENT + String.format("dstParam '%1$s'\n", iPSDELogicNodeParam.getDstPSDELogicParam().getCodeName()));
			}
			
			if(StringUtils.hasLength(iPSDELogicNodeParam.getDstFieldName())) {
				stringBuilder.append(strIndent + INDENT + String.format("dstField '%1$s'\n", iPSDELogicNodeParam.getDstFieldName()));
			}
			
			if(iPSDELogicNodeParam.getSrcPSDELogicParam()!=null) {
				stringBuilder.append(strIndent + INDENT + String.format("srcParam '%1$s'\n", iPSDELogicNodeParam.getSrcPSDELogicParam().getCodeName()));
			}
			
			if(StringUtils.hasLength(iPSDELogicNodeParam.getSrcFieldName())) {
				stringBuilder.append(strIndent + INDENT + String.format("srcField '%1$s'\n", iPSDELogicNodeParam.getSrcFieldName()));
			}
			
			if(StringUtils.hasLength(iPSDELogicNodeParam.getSrcValue())) {
				stringBuilder.append(strIndent + INDENT + String.format("srcValue '%1$s'\n", groovyString(iPSDELogicNodeParam.getSrcValue())));
				if(iPSDELogicNodeParam.getSrcValueStdDataType()>0) {
					stringBuilder.append(strIndent + INDENT + String.format("srcValueStdDataType %1$s\n", iPSDELogicNodeParam.getSrcValueStdDataType()));
				}
			}
			
			if(StringUtils.hasLength(iPSDELogicNodeParam.getExpression())) {
				stringBuilder.append(strIndent + INDENT + String.format("expression '''\n"));
				append(stringBuilder, iPSDELogicNodeParam.getExpression(), strIndent + INDENT+ INDENT);
				stringBuilder.append(strIndent + INDENT + String.format("\n"));
				stringBuilder.append(strIndent + INDENT + String.format("'''\n"));
			}
			
			stringBuilder.append(strIndent + "}\n");
			return;
		}

		throw new Exception(String.format("无法识别的逻辑节点参数操作[%1$s]", strParamAction));
	}
	
	

	protected static void appendPSDELogicLinks(StringBuilder stringBuilder, String strIndent, IPSDELogicNode iPSDELogicNode) throws Exception {
		List<IPSDELogicLink> psDELogicLinkList = iPSDELogicNode.getPSDELogicLinks();
		if (ObjectUtils.isEmpty(psDELogicLinkList)) {
			return;
		}

		stringBuilder.append(strIndent + "routes {\n");
		stringBuilder.append(strIndent + INDENT + String.format("parallel %1$s\n", iPSDELogicNode.isParallelOutput()));
		for (IPSDELogicLink iPSDELogicLink : psDELogicLinkList) {
			appendPSDELogicLink(stringBuilder, strIndent + INDENT, iPSDELogicLink);
		}
		stringBuilder.append(strIndent + "}\n");
	}

	protected static void appendPSDELogicLink(StringBuilder stringBuilder, String strIndent, IPSDELogicLink iPSDELogicLink) throws Exception {

		if (iPSDELogicLink.isCatchLink()) {
			stringBuilder.append(strIndent + "error {\n");
			stringBuilder.append(strIndent + INDENT + String.format("to '%1$s'\n", iPSDELogicLink.getDstPSDELogicNodeMust().getCodeName()));
			if (iPSDELogicLink.getPSDELogicLinkGroupCond() != null) {
				appendPSDELogicLinkCond(stringBuilder, strIndent + INDENT, iPSDELogicLink.getPSDELogicLinkGroupCond(), true);
			}

			stringBuilder.append(strIndent + "}\n");
			return;
		} else {
			stringBuilder.append(strIndent + "route {\n");
			stringBuilder.append(strIndent + INDENT + String.format("to '%1$s'\n", iPSDELogicLink.getDstPSDELogicNodeMust().getCodeName()));
			if (iPSDELogicLink.getPSDELogicLinkGroupCond() != null) {
				appendPSDELogicLinkCond(stringBuilder, strIndent + INDENT, iPSDELogicLink.getPSDELogicLinkGroupCond(), true);
			}
			stringBuilder.append(strIndent + "}\n");
			return;
		}

	}

	protected static void appendPSDELogicLinkCond(StringBuilder stringBuilder, String strIndent, IPSDELogicLinkCond iPSDELogicLinkCond, boolean bFirst) throws Exception {
		if (iPSDELogicLinkCond instanceof IPSDELogicLinkGroupCond) {

			IPSDELogicLinkGroupCond iPSDELogicLinkGroupCond = (IPSDELogicLinkGroupCond) iPSDELogicLinkCond;
			if (bFirst) {
				stringBuilder.append(strIndent + "cond {\n");
			} else {
				if (COND_AND.equals(iPSDELogicLinkGroupCond.getGroupOP())) {
					stringBuilder.append(strIndent + "and {\n");
				} else {
					stringBuilder.append(strIndent + "or {\n");
				}
			}

			if (iPSDELogicLinkGroupCond.isNotMode()) {
				stringBuilder.append(strIndent + INDENT + String.format("not true\n"));
			}

			if (!ObjectUtils.isEmpty(iPSDELogicLinkGroupCond.getPSDELogicLinkConds())) {
				for (IPSDELogicLinkCond item : iPSDELogicLinkGroupCond.getPSDELogicLinkConds()) {
					appendPSDELogicLinkCond(stringBuilder, strIndent + INDENT, item, false);
				}
			}

			stringBuilder.append(strIndent + "}\n");

		}
		else {
			IPSDELogicLinkSingleCond iPSDELogicLinkSingleCond = (IPSDELogicLinkSingleCond) iPSDELogicLinkCond;
			switch(iPSDELogicLinkSingleCond.getCondOP()) {
			case COND_EQ:
				stringBuilder.append(strIndent + "eq {\n");
				break;
			case COND_NOTEQ:
				stringBuilder.append(strIndent + "ne {\n");
				break;
			case COND_GT:
				stringBuilder.append(strIndent + "gt {\n");
				break;
			case COND_GTANDEQ:
				stringBuilder.append(strIndent + "gte {\n");
				break;
			case COND_LT:
				stringBuilder.append(strIndent + "lt {\n");
				break;
			case COND_LTANDEQ:
				stringBuilder.append(strIndent + "lte {\n");
				break;
			case COND_LIKE:
				stringBuilder.append(strIndent + "like {\n");
				break;
			case COND_LEFTLIKE:
				stringBuilder.append(strIndent + "ll {\n");
				break;
			case COND_RIGHTLIKE:
				stringBuilder.append(strIndent + "rl {\n");
				break;
			case COND_ISNULL:
				stringBuilder.append(strIndent + "nvl {\n");
				break;
			case COND_ISNOTNULL:
				stringBuilder.append(strIndent + "nn {\n");
				break;
			case COND_IN:
				stringBuilder.append(strIndent + "in {\n");
				break;
			case COND_NOTIN:
				stringBuilder.append(strIndent + "ni {\n");
				break;
			default:
				throw new Exception(String.format("无法识别的条件[%1$s]", iPSDELogicLinkSingleCond.getCondOP()));
			}
			
			if(iPSDELogicLinkSingleCond.getDstLogicParam()!=null) {
				stringBuilder.append(strIndent + INDENT + String.format("dstParam '%1$s'\n", iPSDELogicLinkSingleCond.getDstLogicParam().getCodeName()));
			}
			
			if(StringUtils.hasLength(iPSDELogicLinkSingleCond.getDstFieldName())) {
				stringBuilder.append(strIndent + INDENT + String.format("dstField '%1$s'\n", iPSDELogicLinkSingleCond.getDstFieldName()));
			}
			
			
			if(StringUtils.hasLength(iPSDELogicLinkSingleCond.getParamType())) {
				stringBuilder.append(strIndent + INDENT + String.format("srcValueType '%1$s'\n", iPSDELogicLinkSingleCond.getParamType()));
			}
			
			
			if(iPSDELogicLinkSingleCond.getSrcLogicParam()!=null) {
				stringBuilder.append(strIndent + INDENT + String.format("srcParam '%1$s'\n", iPSDELogicLinkSingleCond.getSrcLogicParam().getCodeName()));
				if(StringUtils.hasLength(iPSDELogicLinkSingleCond.getParamValue())) {
					stringBuilder.append(strIndent + INDENT + String.format("srcField '%1$s'\n",groovyString(iPSDELogicLinkSingleCond.getParamValue())));
				}
			}
			else
				if(StringUtils.hasLength(iPSDELogicLinkSingleCond.getParamValue())) {
					stringBuilder.append(strIndent + INDENT + String.format("srcValue '%1$s'\n",groovyString(iPSDELogicLinkSingleCond.getParamValue())));
				}
			stringBuilder.append(strIndent + "}\n");

		}

		return;
	}
	
	
	protected static void append(StringBuilder stringBuilder, String strContent, String strIndent) throws Exception {
		String[] lines = strContent.replace("\r\n", "\n").replace("\r", "\n").split("\n");
		for(int i =0;i<lines.length;i++) {
			if(i != 0) {
				stringBuilder.append("\n");
			}
			stringBuilder.append(strIndent);
			if(StringUtils.hasLength(lines[i])) {
				stringBuilder.append(lines[i]);
			}
		}
	}
	
	
	protected static String groovyString(String strContent) {
		if(StringUtils.hasLength(strContent)) {
			return strContent.replace("'","\\'");
		}
		return "";
	}
}
