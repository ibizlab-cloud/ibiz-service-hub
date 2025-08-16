package net.ibizsys.central.sysutil;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import net.ibizsys.central.ba.ISysBDSchemeRuntime;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.Errors;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.domain.File;
import net.ibizsys.runtime.util.domain.FileTypes;

public class DefaultSysFileUtilRuntime extends SysFileUtilRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DefaultSysFileUtilRuntime.class);
	
	/**
	 * 运行时文件对象表名称
	 */
	public final static String RTFILE_TABLENAME = "_rt_file";
//	private Map<String, OSSOutputStreamInvocationHandler> ossOutputStreamInvocationHandlerMap = new HashMap<>();
	
//	private class OSSOutputStreamInvocationHandler implements InvocationHandler{
//
//		private File file = null;
//		private OutputStream realOutputStream = null;
//		private Closeable proxyOutputStream = null;
//		public OSSOutputStreamInvocationHandler(File file, OutputStream outputStream) {
//			this.file = file;
//			this.realOutputStream = outputStream;
//			
//			this.proxyOutputStream = (Closeable)Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[] {Closeable.class}, this);
//			
//			ossOutputStreamInvocationHandlerMap.put(file.getFileId(), this);
//			
//		}
//		
//		public OutputStream getOutputStream() {
//			return this.proxyOutputStream;
//		}
//		
//		@Override
//		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//			
//			if("close".equals(method.getName())) {
//				//从Map表移除
//				ossOutputStreamInvocationHandlerMap.remove(file.getFileId());
//			}
//			
//			Object objRet = method.invoke(this.realOutputStream, args);
//			
//			if("close".equals(method.getName())) {
//				//进行后续操作 
//				closeOSSOutputStream(file);
//			}
//			
//			return objRet;
//		}
//		
//	}
	
	private class ProxyOutputStream extends OutputStream{

		private File file = null;
		private OutputStream realOutputStream = null;
		public ProxyOutputStream(File file, OutputStream outputStream) {
			this.file = file;
			this.realOutputStream = outputStream;
			proxyOutputStreamMap.put(file.getFileId(), this);
		}
		
		public OutputStream getReal() {
			return this.realOutputStream;
		}
		
		@Override
		public void write(int b) throws IOException {
			getReal().write(b);
		}

		@Override
		public void close() throws IOException {
			proxyOutputStreamMap.remove(file.getFileId());
			getReal().close();
			try {
				closeProxyOutputStream(file);
			}
			catch(Throwable ex) {
				log.error(ex);
				throw new IOException(ex);
			}
		}

		@Override
		public void flush() throws IOException {
			getReal().flush();
		}

		@Override
		public void write(byte[] b, int off, int len) throws IOException {
			getReal().write(b, off, len);
		}

		@Override
		public void write(byte[] b) throws IOException {
			getReal().write(b);
		}
	}
	
	private Map<String, ProxyOutputStream> proxyOutputStreamMap = new HashMap<>();
	
	
	private IObjectStorageServiceAdapter iObjectStorageServiceAdapter = null;
	
	private ISysBDSchemeRuntime iSysBDSchemeRuntime = null;
	
	@Override
	protected void onInit() throws Exception {

		super.onInit();
		
		if(this.getObjectStorageServiceAdapter() == null) {
			this.prepareObjectStorageServiceAdapter();
		}
		
		if(this.getSysBDSchemeRuntime() == null) {
			this.prepareSysBDSchemeRuntime();
		}
		
	}
	
	protected void prepareObjectStorageServiceAdapter() throws Exception{
		if(this.getSubSysServiceAPIRuntime() == null) {
			return;
		}
		
		this.setObjectStorageServiceAdapter(this.getSubSysServiceAPIRuntime().getObjectStorageServiceAdapter());
	}
	
	protected IObjectStorageServiceAdapter getObjectStorageServiceAdapter() {
		return this.iObjectStorageServiceAdapter;
	}
	
	protected void setObjectStorageServiceAdapter(IObjectStorageServiceAdapter iObjectStorageServiceAdapter) {
		this.iObjectStorageServiceAdapter = iObjectStorageServiceAdapter;
	}
	
	protected void prepareSysBDSchemeRuntime() throws Exception{
		this.setSysBDSchemeRuntime(this.getSystemRuntime().getDefaultSysBDSchemeRuntime());
	}
	
	protected ISysBDSchemeRuntime getSysBDSchemeRuntime() {
		return this.iSysBDSchemeRuntime;
	}
	
	protected void setSysBDSchemeRuntime(ISysBDSchemeRuntime iSysBDSchemeRuntime) {
		this.iSysBDSchemeRuntime = iSysBDSchemeRuntime;
	}
	
	
	@Override
	protected File onCreateUrlFile(String strUrl) throws Throwable {
		File file = new File();
		file.setFileType(FileTypes.URL);
		file.setUrl(strUrl);
		return file;
	}
	
	@Override
	protected File onGetDraft() throws Throwable {
		File file = new File();
		file.setFileType(FileTypes.STORAGESERVICE);
		return file;
	}
	


	@Override
	protected void onCreate(File data) throws Throwable {
		
		//仅支持建立OSS文件
		
//		String strFileId = null;
//		boolean bTryGet = false;
//		if(FileTypes.TEMP.equals(data.getFileType())) {
//			strFileId = FILEIDPREFIX_TEMP + KeyValueUtils.genUniqueId();
//		}
//		else
//			if(FileTypes.URL.equals(data.getFileType())) {
//				if(StringUtils.hasLength(data.getUrl())) {
//					bTryGet = true;
//					strFileId = FILEIDPREFIX_URL + KeyValueUtils.genUniqueId(data.getUrl());
//				}
//				else {
//					strFileId = FILEIDPREFIX_URL_T + KeyValueUtils.genUniqueId();
//				}
//			}
//			else
//				if(FileTypes.STORAGESERVICE.equals(data.getFileType())) {
//					strFileId = FILEIDPREFIX_OSS + KeyValueUtils.genUniqueId();
//				}
//				else
//					throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("未支持的文件类型[%1$s]", data.getFileType()));
//		
//		if(bTryGet) {
//			File last = this.get(strFileId, true);
//			if(last != null) {
//				last.copyTo(data);
//			}
//			return;
//		}
//		
//		data.setFileId(strFileId);
//		
//		if(this.getSysBDSchemeRuntime()!=null) {
//			Map<String, Object> map = new HashMap<String, Object>();
//			map.put(Entity.KEY, data.getFileId());
//			if(data.any()!=null) {
//				map.putAll(data.any());
//			}
//			this.getSysBDSchemeRuntime().insert(RTFILE_TABLENAME, map, null);
//		}
//		else {
//			String strFileFolder = this.getFileFolder(strFileId, true);
//			String strJsonFile = String.format("%1$s%2$sfile.json", strFileFolder, java.io.File.separator);
//			MAPPER.writerWithDefaultPrettyPrinter().writeValue(new java.io.File(strJsonFile), data);
//		}
	}
	
//	@Override
//	protected void onUpdate(File data, boolean bAppendMode) throws Throwable {
//		Assert.notNull(data, "未传入文件对象");
//		
//		if(this.getSysBDSchemeRuntime()!=null) {
//			Map<String, Object> map = new HashMap<String, Object>();
//			map.put(Entity.KEY, data.getFileId());
//			if(data.any()!=null) {
//				map.putAll(data.any());
//			}
//			this.getSysBDSchemeRuntime().update(RTFILE_TABLENAME, map, null, bAppendMode);
//		}
//		else {
//			String strKey = data.getFileId();
//			String strFileFolder = this.getFileFolder(strKey, false);
//			String strJsonFile = String.format("%1$s%2$sfile.json", strFileFolder, java.io.File.separator);
//			java.io.File file = new java.io.File(strJsonFile);
//			if(!file.exists()) {
//				throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("指定文件不存在"), Errors.INVALIDDATA);
//			}
//			
//			File writedata = null;
//			if(bAppendMode) {
//				writedata = MAPPER.readValue(file, File.class);
//				if(writedata.any() != null) {
//					writedata.any().putAll(data.any());
//				}
//				else {
//					writedata = data;
//				}
//			}
//			else {
//				writedata = data;
//			}
//			MAPPER.writerWithDefaultPrettyPrinter().writeValue(new java.io.File(strJsonFile), writedata);
//		}
//	}

	@Override
	protected File onGet(String strKey, boolean bTryMode) throws Throwable {
		Assert.hasLength(strKey, "未传入文件标识");
		
		String strFileFolder = this.getFileFolder(strKey, false);
		String strJsonFile = String.format("%1$s%2$sfile.json", strFileFolder, java.io.File.separator);
		java.io.File file = new java.io.File(strJsonFile);
		if(!file.exists()) {
			if(bTryMode) {
				return null;
			}
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("指定文件不存在"), Errors.INVALIDDATA);
		}
		
		File data = JsonUtils.MAPPER.readValue(file, File.class);
		data.setFileId(strKey);
		return data;
	}

	@Override
	protected void onRemove(String strKey) throws Throwable {
		Assert.hasLength(strKey, "未传入文件标识");
		
		String strFileFolder = this.getFileFolder(strKey, false);
		String strJsonFile = String.format("%1$s%2$sfile.json", strFileFolder, java.io.File.separator);
		java.io.File file = new java.io.File(strJsonFile);
		if(!file.exists()) {
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("指定文件不存在"), Errors.INVALIDDATA);
		}
		
		File data = JsonUtils.MAPPER.readValue(file, File.class);
		file.delete();
		
		JsonUtils.MAPPER.writerWithDefaultPrettyPrinter().writeValue(new java.io.File(strJsonFile+".delete"), data);
	}

	@Override
	protected InputStream onGetInputStream(File file) throws Throwable {
		// TODO Auto-generated method stub
		return super.onGetInputStream(file);
	}

	@Override
	protected OutputStream onGetOutputStream(File file, boolean bAppendMode) throws Throwable {
		if(FileTypes.TEMP.equals(file.getFileType())) {
			String strFileFolder = this.getFileFolder(file.getFileId(), false);
			String strDataFile = String.format("%1$s%2$sfile.data", strFileFolder, java.io.File.separator);
			return new FileOutputStream(new java.io.File(strDataFile), bAppendMode);
		}
		else
			if(FileTypes.URL.equals(file.getFileType())) {
				throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("文件类型[%1$s]不支持写入", file.getFileType()));
			}
			else
				if(FileTypes.STORAGESERVICE.equals(file.getFileType())) {
					
					String strFileFolder = this.getFileFolder(file.getFileId(), true);
					String strDataFile = String.format("%1$s%2$sfile.data", strFileFolder, java.io.File.separator);
					OutputStream outputStream = new FileOutputStream(new java.io.File(strDataFile), bAppendMode);
					
					return new ProxyOutputStream(file, outputStream);
				}
				
//			if(FileTypes.URL.equals(data.getFileType())) {
//				strFileId = FILEIDPREFIX_URL + KeyValueUtils.genUniqueId(data.getUrl());
//			}
//			else
				
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("未支持的文件类型[%1$s]", file.getFileType()));
	}
	
	protected void closeProxyOutputStream(File file) throws Throwable{
		if(this.getObjectStorageServiceAdapter() != null) {
			//使用远程
			String strFileFolder = this.getFileFolder(file.getFileId(), false);
			String strDataFile = String.format("%1$s%2$sfile.data", strFileFolder, java.io.File.separator);
			this.getObjectStorageServiceAdapter().saveFile(file, file.getFolder(), new java.io.File(strDataFile), null);
			//重新存盘
			//this.update(file, true);
		}
		else {
			throw new Exception("未指定对象存储服务插件");
		}
	}

	protected String getFileFolder(String strFileId, boolean bCreate) throws Throwable {
		if(!StringUtils.hasLength(strFileId) || strFileId.length()<10) {
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("传入文件标识不正确"));
		}
		String strFileFolder = this.getSystemRuntime().getFileFolder();
		if (!StringUtils.hasLength(strFileFolder)) {
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("系统未定义文件存储路径"));
		}

		String strFilePath = String.format("%1$s%2$s%3$s%2$s%4$s%2$s%5$s", strFileFolder, java.io.File.separator, strFileId.substring(0, 7), strFileId.substring(7, 9), strFileId);
		if (bCreate) {
			java.io.File file = new java.io.File(strFilePath);
			file.mkdirs();
		}
		return strFilePath;
	}

	@Override
	protected File onCreateOSSFile(java.io.File file, String strCat) throws Throwable {
		if(this.getObjectStorageServiceAdapter() != null) {
			//使用远程
			File ossFile = this.getObjectStorageServiceAdapter().saveFile(null, strCat, file, null);
			return ossFile;
		}
		else {
			throw new Exception("未指定对象存储服务插件");
		}
	}

}
