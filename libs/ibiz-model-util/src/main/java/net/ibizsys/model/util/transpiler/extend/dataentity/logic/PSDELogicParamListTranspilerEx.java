package net.ibizsys.model.util.transpiler.extend.dataentity.logic;

import java.util.HashMap;
import java.util.Map;

import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.logic.IPSDELogicParam;
import net.ibizsys.model.dataentity.logic.PSDELogicParamImpl;
import net.ibizsys.model.util.DataTypeUtils;
import net.ibizsys.model.util.JsonUtils;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSDELogicParam;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDELogicParamListTranspilerEx extends net.ibizsys.model.util.transpiler.dataentity.logic.PSDELogicParamListTranspiler {

	/**
	 * 常规变量
	 */
	public final static int PARAMTYPE_COMMON = 0;

	/**
	 * 全局变量
	 */
	public final static int PARAMTYPE_GLOBAL = 1;

	/**
	 * 环境变量
	 */
	public final static int PARAMTYPE_ENV = 2;

	/**
	 * 最后数据变量
	 */
	public final static int PARAMTYPE_LAST = 3;

	/**
	 * 最后返回变量
	 */
	public final static int PARAMTYPE_LASTRETURN = 4;

	/**
	 * 过滤器变量
	 */
	public final static int PARAMTYPE_FILTER = 5;

	/**
	 * 数据对象列表变量
	 */
	public final static int PARAMTYPE_ENTITYLIST = 6;

	/**
	 * 分页查询结果变量
	 */
	public final static int PARAMTYPE_ENTITYPAGE = 7;

	/**
	 * 文件对象变量
	 */
	public final static int PARAMTYPE_FILE = 8;

	/**
	 * 文件对象列表变量
	 */
	public final static int PARAMTYPE_FILELIST = 9;

	/**
	 * 简单对象变量
	 */
	public final static int PARAMTYPE_SIMPLE = 10;

	/**
	 * 简单对象列表变量
	 */
	public final static int PARAMTYPE_SIMPLELIST = 11;

	/**
	 * 数据对象字典变量
	 */
	public final static int PARAMTYPE_ENTITYMAP = 12;

	/**
	 * 应用上下文变量
	 */
	public final static int PARAMTYPE_APPCONTEXT = 24;

	/**
	 * 应用全局变量
	 */
	public final static int PARAMTYPE_APPGLOBAL = 27;
	
	/**
	*Web上下文变量
	*/
	public final static int PARAMTYPE_WEBCONTEXT = 31 ;
	
	/**
	*Web反馈变量
	*/
	public final static int PARAMTYPE_WEBRESPONSE = 32 ;
	
	private static Map<String, String> SystemFieldMap = new HashMap<String, String>();
	static {
		SystemFieldMap.put("cloneparamflag","");
		SystemFieldMap.put("createdate","");
		SystemFieldMap.put("createman","");
		SystemFieldMap.put("defaultparam","");
		SystemFieldMap.put("defaultvalue","");
		SystemFieldMap.put("defaultvaluetype","");
		SystemFieldMap.put("dynamodelflag","");
		SystemFieldMap.put("filetype","");
		SystemFieldMap.put("fileurl","");
		SystemFieldMap.put("globalparam","");
		SystemFieldMap.put("logicname","");
		SystemFieldMap.put("memo","");
		SystemFieldMap.put("originentityflag","");
		SystemFieldMap.put("parampsdefgroupid","");
		SystemFieldMap.put("parampsdefgroupname","");
		SystemFieldMap.put("parampsdeid","");
		SystemFieldMap.put("parampsdename","");
		SystemFieldMap.put("params","");
		SystemFieldMap.put("paramtag","");
		SystemFieldMap.put("paramtag2","");
		SystemFieldMap.put("psdelogicid","");
		SystemFieldMap.put("psdelogicname","");
		SystemFieldMap.put("psdelogicparamid","");
		SystemFieldMap.put("psdelogicparamname","");
		SystemFieldMap.put("psdynainstid","");
		SystemFieldMap.put("pssysdynamodelid","");
		SystemFieldMap.put("pssysdynamodelname","");
		SystemFieldMap.put("pssyspfpluginid","");
		SystemFieldMap.put("pssyspfpluginname","");
		SystemFieldMap.put("pssysresourceid","");
		SystemFieldMap.put("pssysresourcename","");
		SystemFieldMap.put("pssyssfpluginid","");
		SystemFieldMap.put("pssyssfpluginname","");
		SystemFieldMap.put("pssystemid","");
		SystemFieldMap.put("reffieldname","");
		SystemFieldMap.put("refparamname","");
		SystemFieldMap.put("stddatatype","");
		SystemFieldMap.put("updatedate","");
		SystemFieldMap.put("updateman","");
		SystemFieldMap.put("usercat","");
		SystemFieldMap.put("userparams","");
		SystemFieldMap.put("usertag","");
		SystemFieldMap.put("usertag2","");
		SystemFieldMap.put("usertag3","");
		SystemFieldMap.put("usertag4","");
	}
	

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		
		IPSDELogicParam iPSDELogicParam = (IPSDELogicParam) iPSModelObject;
		PSDELogicParam psDELogicParam = (PSDELogicParam) domain;
		
		psDELogicParam.setGlobalParam(this.getParamType(iPSDELogicParam));

	}

	protected int getParamType(IPSDELogicParam iPSDELogicParam) {
		if (iPSDELogicParam.isSessionParam()) {
			return PARAMTYPE_GLOBAL;
		}

		/**
		 * 环境变量
		 */
		if (iPSDELogicParam.isEnvParam()) {
			return PARAMTYPE_ENV;
		}

		/**
		 * 最后数据变量
		 */
		if (iPSDELogicParam.isLastParam()) {
			return PARAMTYPE_LAST;
		}

		/**
		 * 最后返回变量
		 */
		if (iPSDELogicParam.isLastReturnParam()) {
			return PARAMTYPE_LASTRETURN;
		}

		/**
		 * 过滤器变量
		 */
		if (iPSDELogicParam.isFilterParam()) {
			return PARAMTYPE_FILTER;
		}

		/**
		 * 数据对象列表变量
		 */
		if (iPSDELogicParam.isEntityListParam()) {
			return PARAMTYPE_ENTITYLIST;
		}

		/**
		 * 分页查询结果变量
		 */
		if (iPSDELogicParam.isEntityPageParam()) {
			return PARAMTYPE_ENTITYPAGE;
		}

		/**
		 * 文件对象变量
		 */
		if (iPSDELogicParam.isFileParam()) {
			return PARAMTYPE_FILE;
		}

		/**
		 * 文件对象列表变量
		 */
		if (iPSDELogicParam.isFileListParam()) {
			return PARAMTYPE_FILELIST;
		}

		/**
		 * 简单对象变量
		 */
		if (iPSDELogicParam.isSimpleParam()) {
			return PARAMTYPE_SIMPLE;
		}

		/**
		 * 简单对象列表变量
		 */
		if (iPSDELogicParam.isSimpleListParam()) {
			return PARAMTYPE_SIMPLELIST;
		}

		/**
		 * 数据对象字典变量
		 */
		if (iPSDELogicParam.isEntityMapParam()) {
			return PARAMTYPE_ENTITYMAP;
		}

		/**
		 * 应用上下文变量
		 */
		if (iPSDELogicParam.isAppContextParam()) {
			return PARAMTYPE_APPCONTEXT;
		}

		/**
		 * 应用全局变量
		 */
		if (iPSDELogicParam.isAppGlobalParam()) {
			return PARAMTYPE_APPGLOBAL;
		}
		
		/**
		 * Web请求上下文
		 */
		if (iPSDELogicParam.isWebContextParam()) {
			return PARAMTYPE_WEBCONTEXT;
		}

		/**
		 * Web反馈
		 */
		if (iPSDELogicParam.isWebResponseParam()) {
			return PARAMTYPE_WEBRESPONSE;
		}
		
		return PARAMTYPE_COMMON;
	}
	
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
		
		PSDELogicParam psDELogicParam = (PSDELogicParam) domain;
		objectNode.put(PSDELogicParamImpl.ATTR_GETCODENAME, psDELogicParam.getName());
		
		switch(DataTypeUtils.getIntegerValue(psDELogicParam.getGlobalParam(), PARAMTYPE_COMMON)) {
		case PARAMTYPE_GLOBAL:
			objectNode.put(PSDELogicParamImpl.ATTR_ISSESSIONPARAM, true);
			break;
		case PARAMTYPE_ENV:
			objectNode.put(PSDELogicParamImpl.ATTR_ISENVPARAM, true);
			break;
		case PARAMTYPE_LAST:
			objectNode.put(PSDELogicParamImpl.ATTR_ISLASTPARAM, true);
			break;
		case PARAMTYPE_LASTRETURN:
			objectNode.put(PSDELogicParamImpl.ATTR_ISLASTRETURNPARAM, true);
			break;
		case PARAMTYPE_FILTER:
			objectNode.put(PSDELogicParamImpl.ATTR_ISFILTERPARAM, true);
			break;
		case PARAMTYPE_ENTITYLIST:
			objectNode.put(PSDELogicParamImpl.ATTR_ISENTITYLISTPARAM, true);
			break;
		case PARAMTYPE_ENTITYPAGE:
			objectNode.put(PSDELogicParamImpl.ATTR_ISENTITYPAGEPARAM, true);
			break;
		case PARAMTYPE_FILE:
			objectNode.put(PSDELogicParamImpl.ATTR_ISFILEPARAM, true);
			break;
		case PARAMTYPE_FILELIST:
			objectNode.put(PSDELogicParamImpl.ATTR_ISFILELISTPARAM, true);
			break;
			
		case PARAMTYPE_SIMPLE:
			objectNode.put(PSDELogicParamImpl.ATTR_ISSIMPLEPARAM, true);
			break;
		case PARAMTYPE_SIMPLELIST:
			objectNode.put(PSDELogicParamImpl.ATTR_ISSIMPLELISTPARAM, true);
			break;
		case PARAMTYPE_ENTITYMAP:
			objectNode.put(PSDELogicParamImpl.ATTR_ISENTITYMAPPARAM, true);
			break;
		case PARAMTYPE_APPCONTEXT:
			objectNode.put(PSDELogicParamImpl.ATTR_ISAPPCONTEXTPARAM, true);
			break;
		case PARAMTYPE_APPGLOBAL:
			objectNode.put(PSDELogicParamImpl.ATTR_ISAPPGLOBALPARAM, true);
			break;
		case PARAMTYPE_WEBCONTEXT:
			objectNode.put(PSDELogicParamImpl.ATTR_ISWEBCONTEXTPARAM, true);
			break;
		case PARAMTYPE_WEBRESPONSE:
			objectNode.put(PSDELogicParamImpl.ATTR_ISWEBRESPONSEPARAM, true);
			break;
		case PARAMTYPE_COMMON:
			objectNode.put(PSDELogicParamImpl.ATTR_ISENTITYPARAM, true);
			break;
		default:
			objectNode.put(PSDELogicParamImpl.ATTR_ISENTITYPARAM, true);
			break;
		}
	
		
		//将数据对象中的值额外放入动态参数中
		ObjectNode paramsNode = null;
		if(objectNode.has(PSDELogicParamImpl.ATTR_GETPARAMS)) {
			paramsNode = (ObjectNode)objectNode.get(PSDELogicParamImpl.ATTR_GETPARAMS);
		}
		else {
			paramsNode = objectNode.putObject(PSDELogicParamImpl.ATTR_GETPARAMS);
		}
		
		Map<String, Object> map = psDELogicParam.any();
		if(!ObjectUtils.isEmpty(map)) {
			ObjectNode entityNode = JsonUtils.toObjectNode(map);
			java.util.Iterator<String> fields = entityNode.fieldNames();
			if(fields!=null) {
				while(fields.hasNext()) {
					String strFieldName = fields.next();
					if(paramsNode.has(strFieldName)) {
						continue;
					}
					if(SystemFieldMap.containsKey(strFieldName)) {
						continue;
					}
					paramsNode.set(strFieldName, entityNode.get(strFieldName));
				}
			}
		}
	}
}