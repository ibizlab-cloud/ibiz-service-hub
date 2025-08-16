package net.ibizsys.central.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.util.StringUtils;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.sysutil.IObjectStorageServiceAdapter;
import net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.domain.File;

public class SubSysServiceAPIOSSAdapter implements IObjectStorageServiceAdapter {

	private ISubSysServiceAPIRuntimeContext iSubSysServiceAPIRuntimeContext = null;
	private ISubSysServiceAPIDERuntime utilSubSysServiceAPIDERuntime = null;
	private IPSSubSysServiceAPIDEMethod uploadPSSubSysServiceAPIDEMethod = null;
	private IPSSubSysServiceAPIDEMethod downloadPSSubSysServiceAPIDEMethod = null;
	public SubSysServiceAPIOSSAdapter(ISubSysServiceAPIRuntimeContext iSubSysServiceAPIRuntimeContext) {
		this.iSubSysServiceAPIRuntimeContext = iSubSysServiceAPIRuntimeContext;
		
		this.utilSubSysServiceAPIDERuntime = this.getSubSysServiceAPIRuntime().getSubSysServiceAPIDERuntime(ISubSysServiceAPIRuntime.UTILDE, false);
		this.uploadPSSubSysServiceAPIDEMethod = getUtilSubSysServiceAPIDERuntime().getPSSubSysServiceAPIDEMethod(ISubSysServiceAPIRuntime.UTILMETHOD_UPLOADFILE, false);
		this.downloadPSSubSysServiceAPIDEMethod = getUtilSubSysServiceAPIDERuntime().getPSSubSysServiceAPIDEMethod(ISubSysServiceAPIRuntime.UTILMETHOD_DOWNLOADFILE, false);
	}
	
	protected ISubSysServiceAPIRuntimeContext getSubSysServiceAPIRuntimeContext() {
		return this.iSubSysServiceAPIRuntimeContext;
	}
	
	
	protected ISubSysServiceAPIRuntime getSubSysServiceAPIRuntime() {
		return this.getSubSysServiceAPIRuntimeContext().getSubSysServiceAPIRuntime();
	}
	
	protected ISystemRuntime getSystemRuntime() {
		return this.getSubSysServiceAPIRuntime().getSystemRuntime();
	}
	
	protected ISubSysServiceAPIDERuntime getUtilSubSysServiceAPIDERuntime() {
		return this.utilSubSysServiceAPIDERuntime;
	}
	
	protected IPSSubSysServiceAPIDEMethod getUploadPSSubSysServiceAPIDEMethod() {
		return this.uploadPSSubSysServiceAPIDEMethod;
	}
	
	protected IPSSubSysServiceAPIDEMethod getDownloadPSSubSysServiceAPIDEMethod() {
		return this.downloadPSSubSysServiceAPIDEMethod;
	}
	
	@Override
	public File saveFile(File file, String strCat, Object objFile, Object objTag) {
		try {
			return this.onSaveFile(file, strCat, objFile, objTag);
		}
		catch(Throwable ex) {
			throw new SubSysServiceAPIRuntimeException(getSubSysServiceAPIRuntime(), String.format("上传文件发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected File onSaveFile(File file, String strCat, Object objFile, Object objTag) throws Throwable {
		Map<String, Object> context = new HashMap<String, Object>();
		if(StringUtils.hasLength(strCat)) {
			context.put("cat", strCat);
		}
		else {
			context.put("cat", "default");
		}
		
		Object objRet = getUtilSubSysServiceAPIDERuntime().invokeMethod(this.getUploadPSSubSysServiceAPIDEMethod(), context, objFile, null, objTag);
		if(!(objRet instanceof IEntity)) {
			throw new Exception("返回结果类型不正确");
		}
		IEntity iEntity = (IEntity)objRet;
		if(file == null) {
			file = new File();
		}
		String strOSSId = DataTypeUtils.getStringValue(iEntity.get("id"), null);
		if(!StringUtils.hasLength(strOSSId)) {
			throw new Exception("返回结果类型不正确");
		}
		file.setOSSId(strOSSId);
		if(!StringUtils.hasLength(file.getFileId())) {
			file.setFileId(strOSSId);
		}
		file.setFolder(DataTypeUtils.getStringValue(iEntity.get("folder"), null));
		return file;
	}
	
	@Override
	public File getFile(String strId, String strCat, Object objFile, Object objTag){
		try {
			return this.onGetFile(strId, strCat, objFile, objTag);
		}
		catch(Throwable ex) {
			throw new SubSysServiceAPIRuntimeException(getSubSysServiceAPIRuntime(), String.format("下载文件发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected File onGetFile(String strId, String strCat, Object objFile, Object objTag) throws Throwable {
		Map<String, Object> context = new HashMap<String, Object>();
		if(StringUtils.hasLength(this.getDownloadPSSubSysServiceAPIDEMethod().getRequestField())) {
			context.put(this.getDownloadPSSubSysServiceAPIDEMethod().getRequestField(), strId);
		}
		else {
			context.put("id", strId);
		}
		if(StringUtils.hasLength(strCat)) {
			context.put("cat", strCat);
		}
		else {
			context.put("cat", "default");
		}
		
		Object objRet = getUtilSubSysServiceAPIDERuntime().invokeMethod(this.getDownloadPSSubSysServiceAPIDEMethod(), context, objFile, null, objTag);
		if(!(objRet instanceof IEntity)) {
			throw new Exception("返回结果类型不正确");
		}
		IEntity iEntity = (IEntity)objRet;
		
		File file = new File();
		iEntity.copyTo(file);
		file.setOSSId(strId);
		file.setFileId(strId);
		return file;
	}

}
