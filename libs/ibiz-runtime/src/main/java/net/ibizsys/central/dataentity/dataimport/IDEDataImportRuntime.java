package net.ibizsys.central.dataentity.dataimport;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.util.EntityError;
import net.ibizsys.runtime.util.IEntity;

/**
 * 实体数据导入运行时接口
 * @author lionlau
 *
 */
public interface IDEDataImportRuntime extends net.ibizsys.runtime.dataentity.dataimport.IDEDataImportRuntime{

	/**
	 * 传入数据对象扩展属性：导入文件名称
	 */
	public final static String FIELD_IMPORTFILENAME = "srfimportfilename";
	
	
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
	
	
	
	
	/**
	 * 获取导入数据模板
	 * @param strImportTag
	 * @param outputStream 
	 * @param bTestPriv
	 * @param parentDataEntityRuntime
	 * @param strParentKey 
	 * @return
	 * @throws Throwable
	 */
	void getImportTemplate(String strImportTag, OutputStream outputStream, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable;
}
