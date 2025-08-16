package net.ibizsys.central.sysutil;

import java.util.Map;
import java.util.Set;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.core.type.TypeReference;

import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.ErrorException;
import net.ibizsys.runtime.util.Errors;

public abstract class SysCacheUtilRuntimeBase extends SysUtilRuntimeBase implements ISysCacheUtilRuntime {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysCacheUtilRuntimeBase.class);
	

	@Override
	public String getLogicName() {
		return String.format("系统缓存功能组件[%1$s]", this.getName());
	}
	
	@Override
	public String get(String strName) {
		try {
			return this.onGet(strName);
		}
		catch(Throwable ex) {
			throw dealException(String.format("获取数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected String onGet(String strName) throws Throwable {
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("没有实现"), Errors.NOTIMPL);
	}

	@Override
	public boolean contains(String strName) {
		try {
			return this.onContains(strName);
		}
		catch(Throwable ex) {
			throw dealException(String.format("判断数据是否存在发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected boolean onContains(String strName) throws Throwable {
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("没有实现"), Errors.NOTIMPL);
	}

	@Override
	public void set(String strName, String strValue) {
		this.set(strName, strValue, 0);
	}
	
	@Override
	public void set(String strName, String strValue, int nSeconds) {
		if(strValue == null) {
			this.reset(strName);
		}
		try {
			this.onSet(strName, strValue, nSeconds);
		}
		catch(Throwable ex) {
			throw dealException(String.format("设置数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected void onSet(String strName, String strValue, int nSeconds) throws Throwable {
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("没有实现"), Errors.NOTIMPL);
	}
	
	@Override
	public void expire(String strName, int nSeconds) {
		try {
			this.onExpire(strName, nSeconds);
		}
		catch(Throwable ex) {
			throw dealException(String.format("设置过期时间发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	

	
	protected void onExpire(String strName, int nSeconds) throws Throwable {
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("没有实现"), Errors.NOTIMPL);
	}
	
	@Override
	public void rename(String strName, String strNewName) {
		try {
			this.onRename(strName, strNewName);
		}
		catch(Throwable ex) {
			throw dealException(String.format("重命名键名发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	 
	protected void onRename(String strName, String strNewName) throws Throwable {
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("没有实现"), Errors.NOTIMPL);
	}
	
	
	@Override
	public void copyAll(String strSrcCat, String strDstCat) {
		try {
			this.onCopyAll(strSrcCat, strDstCat);
		}
		catch(Throwable ex) {
			throw dealException(String.format("拷贝分类内容发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	 
	protected void onCopyAll(String strSrcCat, String strDstCat) throws Throwable {
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("没有实现"), Errors.NOTIMPL);
	}

	@Override
	public Map<String, String> getAll(String strCat) {
		try {
			return this.onGetAll(strCat);
		}
		catch(Throwable ex) {
			throw dealException(String.format("拷贝分类内容发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	 
	protected Map<String, String> onGetAll(String strCat) throws Throwable {
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("没有实现"), Errors.NOTIMPL);
	}
	
	
	@Override
	public void set(String strName, Object objValue) {
		this.set(strName, objValue, 0);
	}

	@Override
	public void set(String strName, Object objValue, int nSeconds) {
		if(objValue == null) {
			this.reset(strName);
		}
		try {
			this.onSet(strName, objValue, nSeconds);
		}
		catch(Throwable ex) {
			throw dealException(String.format("设置数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected void onSet(String strName, Object objValue, int nSeconds) throws Throwable {
		Object objData = this.getSystemRuntime().serialize(objValue);
		this.set(strName, (String)objData, nSeconds);
	}

	@Override
	public void reset(String strName) {
		try {
			this.onReset(strName);
		}
		catch(Throwable ex) {
			throw dealException(String.format("重置数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected void onReset(String strName) throws Throwable {
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("没有实现"), Errors.NOTIMPL);
	}

	@Override
	public void resetAll(String strCat) {
		try {
			this.onResetAll(strCat);
		}
		catch(Throwable ex) {
			throw dealException(String.format("重置数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected void onResetAll(String strCat) throws Throwable {
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("没有实现"), Errors.NOTIMPL);
	}

	

	@Override
	public <T> T get(String strName, Class<T> cls) {
		try {
			return this.onGet(strName, cls);
		}
		catch(Throwable ex) {
			throw dealException(String.format("获取对象数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected <T> T onGet(String strName, Class<T> cls) throws Throwable {
		String strData = this.get(strName);
		if(StringUtils.hasLength(strData)) {
			return this.getSystemRuntime().deserialize(strData, cls);
		}
		return null;
	}
	
	@Override
	public <T> T get(String strName, TypeReference<T> type) {
		try {
			return this.onGet(strName, type);
		}
		catch(Throwable ex) {
			throw dealException(String.format("获取对象数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected <T> T onGet(String strName, TypeReference<T> type) throws Throwable {
		String strData = this.get(strName);
		if(StringUtils.hasLength(strData)) {
			return this.getSystemRuntime().deserialize(strData, type);
		}
		return null;
	}
	
	
	@Override
	public String get(String strCat, String strName) {
		if(!StringUtils.hasLength(strCat)) {
			return this.get(strName);
		}
		try {
			return this.onGet(strCat, strName);
		}
		catch(Throwable ex) {
			throw dealException(String.format("获取数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected String onGet(String strCat, String strName) throws Throwable {
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("没有实现"), Errors.NOTIMPL);
	}

	@Override
	public boolean contains(String strCat, String strName) {
		if(!StringUtils.hasLength(strCat)) {
			return this.contains(strName);
		}
		try {
			return this.onContains(strCat, strName);
		}
		catch(Throwable ex) {
			throw dealException(String.format("判断数据是否存在发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected boolean onContains(String strCat, String strName) throws Throwable {
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("没有实现"), Errors.NOTIMPL);
	}
	
	

	@Override
	public void set(String strCat, String strName, String strValue) {
		this.set(strCat, strName, strValue, 0);
	}
	
	@Override
	public void set(String strCat, String strName, String strValue, int nSeconds) {
		if(!StringUtils.hasLength(strCat)) {
			this.set(strName, strValue, nSeconds);
			return;
		}
		if(strValue == null) {
			this.reset(strCat, strName);
		}
		try {
			this.onSet(strCat, strName, strValue, nSeconds);
		}
		catch(Throwable ex) {
			throw dealException(String.format("设置数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected void onSet(String strCat, String strName, String strValue, int nSeconds) throws Throwable {
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("没有实现"), Errors.NOTIMPL);
	}

	
	@Override
	public void set(String strCat, Map<String, String> map) {
		this.set(strCat, map, 0);
	}
	
	@Override
	public void set(String strCat, Map<String, String> map, int nSeconds) {
		try {
			this.onSet(strCat, map, nSeconds);
		}
		catch(Throwable ex) {
			throw dealException(String.format("设置数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected void onSet(String strCat, Map<String, String> map, int nSeconds) throws Throwable {
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("没有实现"), Errors.NOTIMPL);
	}
	
	
	@Override
	public void set(String strCat, String strName, Object objValue) {
		this.set(strCat, strName, objValue, 0);
	}

	@Override
	public void set(String strCat, String strName, Object objValue, int nSeconds) {
		if(!StringUtils.hasLength(strCat)) {
			this.set(strName, objValue, nSeconds);
			return;
		}
		
		if(objValue == null) {
			this.reset(strCat, strName);
		}
		try {
			this.onSet(strCat, strName, objValue, nSeconds);
		}
		catch(Throwable ex) {
			throw dealException(String.format("设置数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected void onSet(String strCat, String strName, Object objValue, int nSeconds) throws Throwable {
		Object objData = this.getSystemRuntime().serialize(objValue);
		this.set(strCat, strName, (String)objData, nSeconds);
	}

	@Override
	public void reset(String strCat, String strName) {
		if(!StringUtils.hasLength(strCat)) {
			this.reset(strName);
			return;
		}
		try {
			this.onReset(strCat, strName);
		}
		catch(Throwable ex) {
			throw dealException(String.format("重置数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected void onReset(String strCat, String strName) throws Throwable {
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("没有实现"), Errors.NOTIMPL);
	}



	@Override
	public <T> T get(String strCat, String strName, Class<T> cls) {
		if(!StringUtils.hasLength(strCat)) {
			return this.get(strName, cls);
		}
		
		try {
			return this.onGet(strCat, strName, cls);
		}
		catch(Throwable ex) {
			throw dealException(String.format("获取对象数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected <T> T onGet(String strCat, String strName, Class<T> cls) throws Throwable {
		String strData = this.get(strCat, strName);
		if(StringUtils.hasLength(strData)) {
			return this.getSystemRuntime().deserialize(strData, cls);
		}
		return null;
	}
	
	@Override
	public <T> T get(String strCat, String strName, TypeReference<T> type) {
		if(!StringUtils.hasLength(strCat)) {
			return this.get(strName, type);
		}
		try {
			return this.onGet(strCat, strName, type);
		}
		catch(Throwable ex) {
			throw dealException(String.format("获取对象数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected <T> T onGet(String strCat, String strName, TypeReference<T> type) throws Throwable {
		String strData = this.get(strCat, strName);
		if(StringUtils.hasLength(strData)) {
			return this.getSystemRuntime().deserialize(strData, type);
		}
		return null;
	}
	
	
	
	@Override
	protected void prepareSysCacheUtilRuntime() throws Exception{
		//自身就是缓存组件
		//super.prepareSysCacheUtilRuntime();
	}
	
	@Override
	protected ISysCacheUtilRuntime getSysCacheUtilRuntime(boolean bTryMode) {
		return this;
	}
	
	
	@Override
	public ISysCacheUtilRuntime local() {
		return this;
	}

	@Override
	public String getPathFormat(Set<String> folderList) {
		Assert.notEmpty(folderList, "传入路径列表无效");
		try {
			return this.onGetPathFormat(folderList);
		}
		catch (Throwable ex) {
			throw dealException(String.format("获取路径格式化发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected String onGetPathFormat(Set<String> folderList) throws Throwable{
		throw new ErrorException("没有实现", Errors.NOTIMPL);
	}

	@Override
	public boolean isEnableListener(boolean bPattern) {
		return false;
	}
	
	@Override
	public void registerListener(String strPath, boolean bPattern, ISysUniStateListener iSysUniStateListener) {
		Assert.hasLength(strPath, "传入路径无效");
		Assert.notNull(iSysUniStateListener, "传入侦听器对象无效");
		try {
			this.onRegisterListener(strPath, bPattern, iSysUniStateListener);
		}
		catch (Throwable ex) {
			throw dealException(String.format("注册侦听器发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected void onRegisterListener(String strPath, boolean bPattern, ISysUniStateListener iSysUniStateListener) throws Throwable{
		throw new ErrorException("没有实现", Errors.NOTIMPL);
	}

	@Override
	public void unregisterListener(String strPath, boolean bPattern, ISysUniStateListener iSysUniStateListener) {
		Assert.hasLength(strPath, "传入路径无效");
		Assert.notNull(iSysUniStateListener, "传入侦听器对象无效");
		try {
			this.onUnregisterListener(strPath, bPattern, iSysUniStateListener);
		}
		catch (Throwable ex) {
			throw dealException(String.format("注销侦听器发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected void onUnregisterListener(String strPath, boolean bPattern, ISysUniStateListener iSysUniStateListener) throws Throwable{
		throw new ErrorException("没有实现", Errors.NOTIMPL);
	}

}
