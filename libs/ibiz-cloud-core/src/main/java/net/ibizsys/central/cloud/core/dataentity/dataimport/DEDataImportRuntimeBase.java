package net.ibizsys.central.cloud.core.dataentity.dataimport;

import java.io.InputStream;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.cloud.core.util.domain.V2ImportSchema;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.dataimport.DEDataImportRuntime;
import net.ibizsys.central.util.domain.ImportDataResult;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.EntityError;
import net.ibizsys.runtime.util.IEntity;

public abstract class DEDataImportRuntimeBase extends DEDataImportRuntime implements IDEDataImportRuntime {

	private static final Log log = LogFactory.getLog(DEDataImportRuntimeBase.class);
	
	@Override
	public Map<Integer, EntityError> importStream(IEntity baseEntity, InputStream inputStream, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable {
		try {
			return this.onImportStream(baseEntity, inputStream, bTestPriv, parentDataEntityRuntime, strParentKey);
		}
		catch (Throwable ex) {
			if(ex instanceof DataEntityRuntimeException) {
				DataEntityRuntimeException dataEntityRuntimeException = (DataEntityRuntimeException)ex;
				if(dataEntityRuntimeException.getModelRuntime() == this) {
					throw (DataEntityRuntimeException)ex;
				}
			}
			
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("导入数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected Map<Integer, EntityError> onImportStream(IEntity baseEntity, InputStream inputStream, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable {
		throw new Exception("没有实现");
	}
		
	@Override
	public ImportDataResult importStream2(IEntity baseEntity, InputStream inputStream, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable {
		try {
			return this.onImportStream2(baseEntity, inputStream, bTestPriv, parentDataEntityRuntime, strParentKey);
		}
		catch (Throwable ex) {
			if(ex instanceof DataEntityRuntimeException) {
				DataEntityRuntimeException dataEntityRuntimeException = (DataEntityRuntimeException)ex;
				if(dataEntityRuntimeException.getModelRuntime() == this) {
					throw (DataEntityRuntimeException)ex;
				}
			}
			
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("导入数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected ImportDataResult onImportStream2(IEntity baseEntity, InputStream inputStream, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable {
		throw new Exception("没有实现");
	}

	@Override
	public Map<Integer, EntityError> importStream(IEntity baseEntity, InputStream inputStream, V2ImportSchema v2ImportSchema, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable {
		try {
			return this.onImportStream(baseEntity, inputStream, v2ImportSchema, bTestPriv, parentDataEntityRuntime, strParentKey);
		}
		catch (Throwable ex) {
			if(ex instanceof DataEntityRuntimeException) {
				DataEntityRuntimeException dataEntityRuntimeException = (DataEntityRuntimeException)ex;
				if(dataEntityRuntimeException.getModelRuntime() == this) {
					throw (DataEntityRuntimeException)ex;
				}
			}
			
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("导入数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected Map<Integer, EntityError> onImportStream(IEntity baseEntity, InputStream inputStream, V2ImportSchema v2ImportSchema, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable {
		throw new Exception("没有实现");
	}
	

	@Override
	public ImportDataResult importStream2(IEntity baseEntity, InputStream inputStream, V2ImportSchema v2ImportSchema, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable {
		try {
			return this.onImportStream2(baseEntity, inputStream, v2ImportSchema, bTestPriv, parentDataEntityRuntime, strParentKey);
		}
		catch (Throwable ex) {
			if(ex instanceof DataEntityRuntimeException) {
				DataEntityRuntimeException dataEntityRuntimeException = (DataEntityRuntimeException)ex;
				if(dataEntityRuntimeException.getModelRuntime() == this) {
					throw (DataEntityRuntimeException)ex;
				}
			}
			
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("导入数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected ImportDataResult onImportStream2(IEntity baseEntity, InputStream inputStream, V2ImportSchema v2ImportSchema, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable {
		throw new Exception("没有实现");
	}
	
	


}
