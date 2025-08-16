package net.ibizsys.runtime.dataentity.dataimport;

import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import net.ibizsys.model.dataentity.dataimport.IPSDEDataImport;
import net.ibizsys.runtime.dataentity.IDataEntityModelRuntime;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeBaseContext;
import net.ibizsys.runtime.util.EntityError;
import net.ibizsys.runtime.util.IEntity;

/**
 * 实体数据导入运行时接口
 * @author lionlau
 *
 */
public interface IDEDataImportRuntime extends IDataEntityModelRuntime{

	/**
	 * 初始化实体打印运行时	
	 * @param iDataEntityRuntimeBase
	 * @param iPSDEDataImport
	 * @throws Exception
	 */
	void init(IDataEntityRuntimeBaseContext iDataEntityRuntimeBaseContext, IPSDEDataImport iPSDEDataImport) throws Exception;
	
	
	
	/**
	 * 获取实体数据导入模型对象
	 * @return
	 */
	IPSDEDataImport getPSDEDataImport();
	
	

	/**
	 * 导入数据
	 * @param baseEntity
	 * @param list
	 * @param bTestPriv 是否测试权限
	 * @return 错误信息
	 * @throws Throwable
	 */
	Map<Integer, EntityError> importData(IEntity baseEntity, List<Map<String, Object>> list, boolean bTestPriv) throws Throwable;
	
	
	
	/**
	 * 导入数据
	 * @param baseEntity
	 * @param list
	 * @param bTestPriv 是否测试权限
	 * @param parentDataEntityRuntime
	 * @param strParentKey 
	 * @return 错误信息
	 * @throws Throwable
	 */
	Map<Integer, EntityError> importData(IEntity baseEntity, List<Map<String, Object>> list, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable;
	
	
	
	
	/**
	 * 导入数据
	 * @param baseEntity
	 * @param file 数据文件
	 * @param bTestPriv 是否测试权限
	 * @param parentDataEntityRuntime
	 * @param strParentKey 
	 * @return 错误信息
	 * @throws Throwable
	 */
	Map<Integer, EntityError> importFile(IEntity baseEntity, File file, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable;
	
	
	
	/**
	 * 导入数据
	 * @param baseEntity
	 * @param inputStream 数据流
	 * @param bTestPriv 是否测试权限
	 * @param parentDataEntityRuntime
	 * @param strParentKey 
	 * @return 错误信息
	 * @throws Throwable
	 */
	Map<Integer, EntityError> importStream(IEntity baseEntity, InputStream inputStream, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable;
}
