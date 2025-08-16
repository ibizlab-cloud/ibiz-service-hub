package net.ibizsys.central.sysutil;

import org.springframework.util.Assert;

import net.ibizsys.runtime.util.IAction;

public abstract	class SysSCMUtilRuntimeBase extends SysUtilRuntimeBase implements ISysSCMUtilRuntime{

	@Override
	public String checkout(String strSCMPath) {
		return this.checkout(strSCMPath, (String)null);
	}

	@Override
	public String checkout(String strSCMPath, String strLocalPath) {
		return this.checkout(strSCMPath, strLocalPath, null);
	}
	
	@Override
	public String checkout(String strSCMPath, IAction iAction) {
		return this.checkout(strSCMPath, null, iAction);
	}

	@Override
	public String checkout(String strSCMPath, String strLocalPath, IAction iAction) {
		Assert.hasLength(strSCMPath, String.format("未传入仓库远程路径"));
		
		return (String)this.executeAction("签出仓库", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onCheckout(strSCMPath, strLocalPath, iAction);
			}
		}, null);
	}
	
	protected String onCheckout(String strSCMPath, String strLocalPath, IAction iAction) throws Throwable{
		throw new Exception("没有实现");
	}

	@Override
	public void checkin(String strLocalPath) {
		Assert.hasLength(strLocalPath, String.format("未传入仓库本地路径"));
		this.executeAction("签入仓库", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onCheckin(strLocalPath);
				return null;
			}
		}, null);
	}

	protected void onCheckin(String strLocalPath) throws Throwable{
		throw new Exception("没有实现");
	}
}
