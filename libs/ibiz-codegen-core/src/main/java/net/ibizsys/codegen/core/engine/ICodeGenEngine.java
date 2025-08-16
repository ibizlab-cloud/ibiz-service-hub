package net.ibizsys.codegen.core.engine;

import java.util.Map;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.IPSObject;
import net.ibizsys.model.IPSSystem;

/**
 * 代码产生引擎对象接口
 * @author lionlau
 *
 */
public interface ICodeGenEngine {

	
	/**
	 * 初始化
	 * @param strTemplatePath
	 * @param bFromResource
	 * @param params
	 * @throws Exception
	 */
	void init(String strTemplatePath, boolean bFromResource, Map<String, Object> params) throws Exception;
	
	/**
	 * 获取模板路径
	 * @return
	 */
	public String getTemplatePath();
	
	
	

	/**
	 *  输出内容
	 * @param iPSSystem
	 * @param strOutputPath
	 * @param filters
	 * @param fileMap
	 * @param bIgnoreException
	 * @throws Exception
	 */
	void output(IPSSystem iPSSystem, String strOutputPath, Object[] filters, Map<String, IPSModelObject> fileMap, boolean bIgnoreException) throws Exception;
	
	
	
	/**
	 * 对传入模型对象的进行模板发布
	 * @param iPSObject
	 * @param strTemplateId
	 * @return
	 * @throws Exception
	 */
	String getContent(IPSObject iPSObject, String strTemplateId) throws Exception;
	
	
	
	/**
	 * 对传入模型对象的进行模板发布
	 * @param iPSObject
	 * @param strTemplateId
	 * @param params
	 * @return
	 * @throws Exception
	 */
	String getContent(IPSObject iPSObject, String strTemplateId, Map<String, Object> params) throws Exception;
}
