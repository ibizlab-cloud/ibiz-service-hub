package net.ibizsys.central.cloud.core.dataentity.dataimport;

import java.io.InputStream;
import java.util.Map;

import net.ibizsys.central.cloud.core.util.domain.V2ImportSchema;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.domain.ImportDataResult;
import net.ibizsys.runtime.util.EntityError;
import net.ibizsys.runtime.util.IEntity;

/**
 * Cloud 实体数据导入运行时对象接口
 * @author lionlau
 *
 */
public interface IDEDataImportRuntime extends net.ibizsys.central.dataentity.dataimport.IDEDataImportRuntime,net.ibizsys.central.dataentity.dataimport.IDEDataImportRuntime2 {

	
	/**
	 * 导入数据
	 * @param baseEntity
	 * @param inputStream
	 * @param v2ImportSchema
	 * @param bTestPriv
	 * @param parentDataEntityRuntime
	 * @param strParentKey
	 * @return
	 * @throws Throwable
	 */
	Map<Integer, EntityError> importStream(IEntity baseEntity, InputStream inputStream, V2ImportSchema v2ImportSchema, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable;
	
	/**
	 * 导入数据
	 * @param baseEntity
	 * @param inputStream
	 * @param v2ImportSchema
	 * @param bTestPriv 是否测试权限
	 * @param parentDataEntityRuntime
	 * @param strParentKey 
	 * @return 错误信息
	 * @throws Throwable
	 */
	ImportDataResult importStream2(IEntity baseEntity, InputStream inputStream, V2ImportSchema v2ImportSchema, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable;
}
