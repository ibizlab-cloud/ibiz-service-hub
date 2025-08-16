package net.ibizsys.central.sysutil;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import net.ibizsys.model.dataentity.util.IPSDEUtil;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.runtime.sysutil.ISysFileUtilRuntime;
import net.ibizsys.runtime.util.Errors;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.domain.File;
import net.ibizsys.runtime.util.domain.FileTypes;

public abstract class SysFileUtilRuntimeBase extends SysUtilRuntimeBase implements ISysFileUtilRuntime {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysFileUtilRuntimeBase.class);
	
	@Override
	public void init(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEUtil iPSDEUtil) throws Exception {
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, "没有实现", Errors.NOTIMPL);
	}
	
	@Override
	protected void prepareSysFileUtilRuntime() throws Exception {
		this.setSysFileUtilRuntime(this);
	}

	@Override
	public File createTempFile(String strFileExt){
		try {
			return onCreateTempFile(strFileExt);
		}
		catch(Throwable ex) {
			log.error(String.format("%1$s建立临时文件发生异常，%2$s", this.getLogicName(), ex.getMessage()), ex);
			throw this.dealException(String.format("建立临时文件发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected File onCreateTempFile(String strSuffix) throws Throwable {
		File file = new File();
		file.setFileType(FileTypes.TEMP);
		file.setLocalPath(java.io.File.createTempFile(null, strSuffix).getCanonicalPath());
		return file;
	}
	
	@Override
	public File createUrlFile(String strUrl) {
		try {
			return this.onCreateUrlFile(strUrl);
		}
		catch(Throwable ex) {
			log.error(String.format("%1$s建立远程文件发生异常，%2$s", this.getLogicName(), ex.getMessage()), ex);
			throw this.dealException(String.format("建立远程文件发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected File onCreateUrlFile(String strUrl) throws Throwable {
		throw new Exception("没有实现");
	}
	
	
	@Override
	public File createOSSFile(java.io.File file) {
//		try {
//			return this.onCreateOSSFile(file);
//		}
//		catch(Throwable ex) {
//			log.error(String.format("%1$s建立OSS文件发生异常，%2$s", this.getLogicName(), ex.getMessage()), ex);
//			throw this.dealException(String.format("建立OSS文件发生异常，%1$s", ex.getMessage()), ex);
//		}
		return this.createOSSFile(file, null);
	}
	
	@Override
	public File createOSSFile(java.io.File file, String strCat) {
		try {
			return this.onCreateOSSFile(file, strCat);
		}
		catch(Throwable ex) {
			log.error(String.format("%1$s建立OSS文件发生异常，%2$s", this.getLogicName(), ex.getMessage()), ex);
			throw this.dealException(String.format("建立OSS文件发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	
	protected File onCreateOSSFile(java.io.File file, String strCat) throws Throwable {
		throw new Exception("没有实现");
	}
	

	@Override
	public File getDraft()  {
		try {
			return onGetDraft();
		}
		catch(Throwable ex) {
			log.error(String.format("%1$s获取草稿文件发生异常，%2$s", this.getLogicName(), ex.getMessage()), ex);
			throw this.dealException(String.format("获取草稿文件发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected File onGetDraft() throws Throwable {
		throw new Exception("没有实现");
	}
	
	@Override
	public void copy(File srcFile, File dstFile) {
		try {
			onCopy(srcFile, dstFile);
		}
		catch(Throwable ex) {
			log.error(String.format("%1$s拷贝文件发生异常，%2$s", this.getLogicName(), ex.getMessage()), ex);
			throw this.dealException(String.format("拷贝文件发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected void onCopy(File srcFile, File dstFile) throws Throwable {
		throw new Exception("没有实现");
	}

//	@Override
//	public File download(String strUrl) throws Throwable {
//		return this.onDownload(strUrl);
//	}
//
//	protected File onDownload(String strUrl) throws Throwable {
//		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, "没有实现", Errors.NOTIMPL);
//	}
//	
//	@Override
//	public File download(String strUrl, boolean bCache) throws Throwable {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public void create(File file) {
		try {
			onCreate(file);
		}
		catch(Throwable ex) {
			log.error(String.format("%1$s建立文件发生异常，%2$s", this.getLogicName(), ex.getMessage()), ex);
			throw this.dealException(String.format("建立文件发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected void onCreate(File file) throws Throwable {
		throw new Exception("没有实现");
	}
	


	@Override
	public File createFrom(File srcFile) {
		try {
			return onCreateFrom(srcFile);
		}
		catch(Throwable ex) {
			log.error(String.format("%1$s从源文件建立文件发生异常，%2$s", this.getLogicName(), ex.getMessage()), ex);
			throw this.dealException(String.format("从源文件建立文件发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected File onCreateFrom(File srcFile) throws Throwable {
		throw new Exception("没有实现");
	}
	
//	@Override
//	public void update(File file, boolean bAppendMode) throws Throwable {
//		onUpdate(file, bAppendMode);
//	}
//	
//	protected void onUpdate(File file, boolean bAppendMode) throws Throwable {
//		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, "没有实现", Errors.NOTIMPL);
//	}

	@Override
	public File get(String strKey, boolean bTryMode){
		return this.executeAction("获取文件", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGet(strKey, bTryMode);
			}
		}, null, File.class);
	}
	
	protected File onGet(String strKey, boolean bTryMode) throws Throwable {
		throw new Exception("没有实现");
	}

	
	@Override
	public File getOSSFile(String strKey, String strCat, boolean bTryMode) {
		return this.executeAction("获取OSS文件", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetOSSFile(strKey, strCat, bTryMode);
			}
		}, null, File.class);
	}
	
	protected File onGetOSSFile(String strKey, String strCat, boolean bTryMode) throws Throwable {
		throw new Exception("没有实现");
	}
	
	
	@Override
	public void remove(String strKey) {
		try {
			onRemove(strKey);
		}
		catch(Throwable ex) {
			log.error(String.format("%1$s删除文件发生异常，%2$s", this.getLogicName(), ex.getMessage()), ex);
			throw this.dealException(String.format("删除文件发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected void onRemove(String strKey) throws Throwable {
		throw new Exception("没有实现");
	}

	@Override
	public InputStream getInputStream(Object keyOrFile) {
		Assert.notNull(keyOrFile, "传入文件参数无效");
		File file = null;
		if(keyOrFile instanceof File) {
			file = (File)keyOrFile;
		}
		else {
			file = this.get(keyOrFile.toString(), false);
		}
		try {
			return onGetInputStream(file);
		}
		catch(Throwable ex) {
			log.error(String.format("%1$s获取文件输入流发生异常，%2$s", this.getLogicName(), ex.getMessage()), ex);
			throw this.dealException(String.format("获取文件输入流发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected InputStream onGetInputStream(File file) throws Throwable {
		if(StringUtils.hasLength(file.getLocalPath())) {
			return new FileInputStream(new java.io.File(file.getLocalPath()));
		}
		throw new Exception("未定义本地文件信息");
	}

	@Override
	public OutputStream getOutputStream(Object keyOrFile, boolean bAppendMode) {
		Assert.notNull(keyOrFile, "传入文件参数无效");
		File file = null;
		if(keyOrFile instanceof File) {
			file = (File)keyOrFile;
		}
		else {
			file = this.get(keyOrFile.toString(), false);
		}
		try {
			return onGetOutputStream(file, bAppendMode);
		}
		catch(Throwable ex) {
			log.error(String.format("%1$s获取文件输出流发生异常，%2$s", this.getLogicName(), ex.getMessage()), ex);
			throw this.dealException(String.format("获取文件输出流发生异常，%1$s", ex.getMessage()), ex);
		}
		
	}
	
	protected OutputStream onGetOutputStream(File file, boolean bAppendMode) throws Throwable {
		throw new Exception("没有实现");
	}


	@Override
	public String getLogicName() {
		return String.format("系统文件功能组件[%1$s]", this.getName());
	}
	
}
