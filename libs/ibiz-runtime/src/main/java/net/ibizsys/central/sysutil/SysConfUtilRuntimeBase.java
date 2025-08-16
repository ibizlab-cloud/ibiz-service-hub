package net.ibizsys.central.sysutil;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.core.type.TypeReference;

import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.Errors;

public abstract class SysConfUtilRuntimeBase extends SysUtilRuntimeBase implements ISysConfUtilRuntime {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysConfUtilRuntimeBase.class);
	

	@Override
	public String getLogicName() {
		return String.format("系统配置功能组件[%1$s]", this.getName());
	}
	
	@Override
	public String get(String strCat, String strName) {
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
		try {
			this.onSet(strCat, strName, strValue);
		}
		catch(Throwable ex) {
			throw dealException(String.format("设置数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	

	
	protected void onSet(String strCat, String strName, String strValue) throws Throwable {
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("没有实现"), Errors.NOTIMPL);
	}

	@Override
	public void set(String strCat, String strName, Object objValue) {
		try {
			this.onSet(strCat, strName, objValue);
		}
		catch(Throwable ex) {
			throw dealException(String.format("设置数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}


	
	protected void onSet(String strCat, String strName, Object objValue) throws Throwable {
		Object objData = this.getSystemRuntime().serialize(objValue);
		this.set(strCat, strName, (String)objData);
	}

	@Override
	public void reset(String strCat, String strName) {
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
	
	
	


}
