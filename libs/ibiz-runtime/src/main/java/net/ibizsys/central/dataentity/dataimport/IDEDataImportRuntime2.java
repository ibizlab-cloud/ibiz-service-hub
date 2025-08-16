package net.ibizsys.central.dataentity.dataimport;

import java.io.InputStream;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.domain.ImportDataResult;
import net.ibizsys.runtime.util.IEntity;

/**
 * 实体数据导入运行时接口2，增强导入结果返回
 * @author lionlau
 *
 */
public interface IDEDataImportRuntime2 extends IDEDataImportRuntime {

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
	ImportDataResult importStream2(IEntity baseEntity, InputStream inputStream, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable;
	
}
