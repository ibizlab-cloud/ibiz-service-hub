package net.ibizsys.central.plugin.cloud.sysutil;

import java.util.Map;

import org.springframework.data.domain.Page;

import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudOSSClient;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysOSSUtilRuntime;
import net.ibizsys.central.sysutil.IObjectStorageServiceAdapter;
import net.ibizsys.central.sysutil.SysFileUtilRuntimeBase;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.domain.File;

/**
 * 系统对象存储（远程文件）功能组件基类
 * @author lionlau
 *
 */
public class SysOSSUtilRuntime extends SysFileUtilRuntimeBase implements ISysOSSUtilRuntime{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysOSSUtilRuntime.class);
	
	private ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime = null;
	private IObjectStorageServiceAdapter iObjectStorageServiceAdapter = null;
	private ICloudOSSClient iCloudOSSClient = null;
	
	
	@Override
	protected void onInstall() throws Exception {
		super.onInstall();
		
		//获取客户端组件
		if(this.getSysCloudClientUtilRuntime(true) == null) {
			this.prepareSysCloudClientUtilRuntime();
		}
	}
	
	protected ISysCloudClientUtilRuntime getSysCloudClientUtilRuntime() {
		return this.getSysCloudClientUtilRuntime(false);
	}
	
	protected ISysCloudClientUtilRuntime getSysCloudClientUtilRuntime(boolean bTryMode) {
		if(this.iSysCloudClientUtilRuntime != null || bTryMode) {
			return this.iSysCloudClientUtilRuntime;
		}
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, "未指定云体系客户端功能组件");
	}
	
	protected void setSysCloudClientUtilRuntime(ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime) {
		this.iSysCloudClientUtilRuntime = iSysCloudClientUtilRuntime;
	}
	
	protected void prepareSysCloudClientUtilRuntime() throws Exception {
		this.setSysCloudClientUtilRuntime(this.getSystemRuntime().getSysUtilRuntime(ISysCloudClientUtilRuntime.class, false));
	}
	


	protected IObjectStorageServiceAdapter getObjectStorageServiceAdapter() {
		if(this.iObjectStorageServiceAdapter == null) {
			this.iObjectStorageServiceAdapter = this.getSysCloudClientUtilRuntime().getSubSysServiceAPIRuntime().getObjectStorageServiceAdapter();
			if(this.iObjectStorageServiceAdapter == null) {
				throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, "对象存储服务插件无效");
			}
		}
		return this.iObjectStorageServiceAdapter;
	}
	
	
	protected ICloudOSSClient getCloudOSSClient() {
		if(this.iCloudOSSClient == null) {
			this.iCloudOSSClient = this.getSysCloudClientUtilRuntime().getServiceClient(ICloudUtilRuntime.CLOUDSERVICE_OSS, ICloudOSSClient.class);
			if(this.iCloudOSSClient == null) {
				throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, "CloudOSS客户端对象无效");
			}
		}
		return this.iCloudOSSClient;
	}
	
	
	@Override
	protected File onGet(String strKey, boolean bTryMode) throws Throwable {
		return this.onGetOSSFile(strKey, null, bTryMode);
	}
	
	@Override
	protected File onGetOSSFile(String strKey, String strCat, boolean bTryMode) throws Throwable {
		try {
			java.io.File tempFile =	java.io.File.createTempFile("oss", ".dat");
			File file =  getObjectStorageServiceAdapter().getFile(strKey, strCat, tempFile, null);
			file.setLocalPath(tempFile.getCanonicalPath());
			return  file;
		}
		catch(Throwable ex) {
			if(bTryMode) {
				return null;
			}
			throw ex;
		}
	}
	
	@Override
	protected File onCreateOSSFile(java.io.File file, String strCat) throws Throwable {
		return this.getObjectStorageServiceAdapter().saveFile(null, strCat, file, null);
	}

	@Override
	public String createObject(String strDBName, String strTableName, Map<String, Object> data) {
		return (String)this.executeAction("建立对象", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onCreateObject(strDBName, strTableName, data);
			}
		}, null);
	}

	
	protected String onCreateObject(String strDBName, String strTableName, Map<String, Object> data) throws Throwable {
		boolean disabled = EmployeeContext.isCurrentDisabled();
		EmployeeContext.setCurrentDisabled(true);
		try {
			return this.getCloudOSSClient().createObject(strDBName, strTableName, data);
		}
		finally {
			EmployeeContext.setCurrentDisabled(disabled);
		}
	}
	
	@Override
	public int updateObject(String strDBName, String strTableName, Map<String, Object> data, boolean bAppendMode) {
		return (Integer)this.executeAction("更新对象", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onUpdateObject(strDBName, strTableName, data, bAppendMode);
			}
		}, null);
	}
	
	protected int onUpdateObject(String strDBName, String strTableName, Map<String, Object> data, boolean bAppendMode) throws Throwable {
		boolean disabled = EmployeeContext.isCurrentDisabled();
		EmployeeContext.setCurrentDisabled(true);
		try {
			return this.getCloudOSSClient().updateObject(strDBName, strTableName, (String)data.get(OBJECT_UNIQUEKEY), data);
		}
		finally {
			EmployeeContext.setCurrentDisabled(disabled);
		}
	}
	

	@Override
	public int deleteObject(String strDBName, String strTableName, String key) {
		return (Integer)this.executeAction("删除对象", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onDeleteObject(strDBName, strTableName, key);
			}
		}, null);
	}
	
	protected int onDeleteObject(String strDBName, String strTableName, String key) throws Throwable {
		boolean disabled = EmployeeContext.isCurrentDisabled();
		EmployeeContext.setCurrentDisabled(true);
		try {
			return this.getCloudOSSClient().deleteObject(strDBName, strTableName, key);
		}
		finally {
			EmployeeContext.setCurrentDisabled(disabled);
		}
	}

	@Override
	public Page fetchObjects(String strDBName, String strTableName, ISearchContext iSearchContext) {
		return (Page)this.executeAction("获取对象数据集", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onFetchObjects(strDBName, strTableName, iSearchContext);
			}
		}, null);
	}
	
	protected Page onFetchObjects(String strDBName, String strTableName, ISearchContext iSearchContext) throws Throwable {
		boolean disabled = EmployeeContext.isCurrentDisabled();
		EmployeeContext.setCurrentDisabled(true);
		try {
			return this.getCloudOSSClient().fetchObjects(strDBName, strTableName, iSearchContext);
		}
		finally {
			EmployeeContext.setCurrentDisabled(disabled);
		}
	}
	
	
	@Override
	public Map getObject(String strDBName, String strTableName, String key) {
		return (Map)this.executeAction("获取对象", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetObject(strDBName, strTableName, key);
			}
		}, null);
	}
	
	protected Map onGetObject(String strDBName, String strTableName, String key) throws Throwable {
		boolean disabled = EmployeeContext.isCurrentDisabled();
		EmployeeContext.setCurrentDisabled(true);
		try {
			return this.getCloudOSSClient().getObject(strDBName, strTableName, key);
		}
		finally {
			EmployeeContext.setCurrentDisabled(disabled);
		}
	}
}
