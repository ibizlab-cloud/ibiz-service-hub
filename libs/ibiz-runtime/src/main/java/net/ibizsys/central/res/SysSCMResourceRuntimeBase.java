package net.ibizsys.central.res;

import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import net.ibizsys.runtime.util.IAction;

public abstract class SysSCMResourceRuntimeBase extends SysFileResourceRuntimeBase implements ISysSCMResourceRuntime{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysSCMResourceRuntimeBase.class);
	private Map<String, File> checkoutFileMap = new ConcurrentHashMap<>();
	
	@Override
	public File checkout(Object target) {
		return this.checkout(target, null);
	}
	
	@Override
	public File checkout(Object target, IAction iAction) {
		
		return (File)this.executeAction("签出仓库", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				Object ret = onCheckout(target, iAction);
				String strResourceUri = getResourceUri(target);
				checkoutFileMap.put(strResourceUri, (File)ret);
				return ret;
			}
		}, null);
	}

	
	protected File onCheckout(Object target, IAction iAction) throws Throwable{
		throw new Exception("没有实现");
	}

	@Override
	public void checkin(Object target) {
		this.executeAction("签入仓库", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onCheckin(target);
				return null;
			}
		}, null);
	}

	protected void onCheckin(Object target) throws Throwable{
		throw new Exception("没有实现");
	}

	@Override
	public File checkoutIf(Object target) {
		return this.checkoutIf(target, null);
	}
	
	 

	@Override
	public File checkoutIf(Object target, IAction iAction) {
		return (File)this.executeAction("签出仓库", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				String strResourceUri = getResourceUri(target);
				Object ret = checkoutFileMap.get(strResourceUri);
				if(ret instanceof File) {
					return ret;
				}
				ret = onCheckout(target, iAction);
				checkoutFileMap.put(strResourceUri, (File)ret);
				return ret;
			}
		}, null);
	}

	@Override
	public void resetAllCheckoutLog() {
		this.checkoutFileMap.clear();
	}
	
	@Override
	protected void onReload() throws Throwable {
		this.resetAllCheckoutLog();
		super.onReload();
	}
	
}
