package net.ibizsys.codegen.core.engine;

import java.util.Map;

import net.ibizsys.model.IPSObject;

public interface ICodeGenEngineContext {

	/**
	 * 
	 * @param iPSObject
	 * @param strTemplateId
	 * @return
	 * @throws Exception
	 */
	String output(IPSObject iPSObject, String strTemplateId) throws Exception;
	
	
	
	/**
	 * 
	 * @param iPSObject
	 * @param strTemplateId
	 * @param strIndent
	 * @return
	 * @throws Exception
	 */
	String output(IPSObject iPSObject, String strTemplateId, String strIndent) throws Exception;
	
	
	/**
	 * 
	 * @param iPSObject
	 * @param strTemplateId
	 * @param params 额外发布参数
	 * @return
	 * @throws Exception
	 */
	String output(IPSObject iPSObject, String strTemplateId, Map<String, Object> params) throws Exception;
	
	
	/**
	 * 
	 * @param iPSObject
	 * @param strTemplateId
	 * @param params 额外发布参数
	 * @return
	 * @throws Exception
	 */
	String output(IPSObject iPSObject, String strTemplateId, Map<String, Object> params, String strIndent) throws Exception;
	
	
	
	/**
	 * 判断指定模板是否存在
	 * @param strTemplateId
	 * @return
	 */
	boolean contains(String strTemplateId);
}
