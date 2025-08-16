package net.ibizsys.runtime.util;

import net.ibizsys.runtime.IDynaInstRuntime;

public class ActionSessionBackup {

	private IDynaInstRuntime iDynaInstRuntime = null;
	private IDynaInstRuntime childDynaInstRuntime = null;
	private String strSessionId = null;
//	private IUserContext iUserContext = null;
//	private IAppContext iAppContext = null;
	
	private boolean bIgnoreDuplicateCheck = false;
	
	private boolean bIgnoreRecursionCheck = false;
	
	private boolean bIgnoreCheck = false;
	
	private boolean bIgnoreTranslateEntityNestedDERsAfterProceed = false;
	
	private boolean bEnableNestedDataLightMode = false;
	
	/**
	 * 设置会话的动态实例运行时
	 * @param iDynaInstRuntime
	 */
	public void setDynaInstRuntime(IDynaInstRuntime iDynaInstRuntime) {
		this.iDynaInstRuntime = iDynaInstRuntime;
	}
	
	
	/**
	 * 设置会话的动态实例运行时
	 * @return
	 */
	public IDynaInstRuntime getDynaInstRuntime() {
		return this.iDynaInstRuntime;
	}
	
	
	/**
	 * 设置会话的子动态实例运行时
	 * @param childDynaInstRuntime
	 */
	public void setChildDynaInstRuntime(IDynaInstRuntime childDynaInstRuntime) {
		this.childDynaInstRuntime = childDynaInstRuntime;
	}
	
	
	/**
	 * 设置会话的子动态实例运行时
	 * @return
	 */
	public IDynaInstRuntime getChildDynaInstRuntime() {
		return this.childDynaInstRuntime;
	}
	
	
	/**
	 * 获取当前会话标识
	 * @return
	 */
	public String getSessionId() {
		return this.strSessionId;
	}
	
	/**
	 * 设置当前会话标识
	 * @param strSessionId
	 */
	public void setSessionId(String strSessionId) {
		this.strSessionId = strSessionId;
	}
	
	public boolean isIgnoreCheck() {
		return bIgnoreCheck;
	}

	public void setIgnoreCheck(boolean bIgnoreCheck) {
		this.bIgnoreCheck = bIgnoreCheck;
	}
	
	public boolean isIgnoreDuplicateCheck() {
		return this.bIgnoreDuplicateCheck;
	}

	public void setIgnoreDuplicateCheck(boolean bIgnoreDuplicateCheck) {
		this.bIgnoreDuplicateCheck = bIgnoreDuplicateCheck;
	}

	public boolean isIgnoreRecursionCheck() {
		return this.bIgnoreRecursionCheck;
	}

	public void setIgnoreRecursionCheck(boolean bIgnoreRecursionCheck) {
		this.bIgnoreRecursionCheck = bIgnoreRecursionCheck;
	}
	
	public boolean isIgnoreTranslateEntityNestedDERsAfterProceed() {
		return bIgnoreTranslateEntityNestedDERsAfterProceed;
	}

	public void setIgnoreTranslateEntityNestedDERsAfterProceed(boolean bIgnoreTranslateEntityNestedDERsAfterProceed) {
		this.bIgnoreTranslateEntityNestedDERsAfterProceed = bIgnoreTranslateEntityNestedDERsAfterProceed;
	}
	

	public boolean isEnableNestedDataLightMode() {
		return bEnableNestedDataLightMode;
	}

	public void setEnableNestedDataLightMode(boolean bEnableNestedDataLightMode) {
		this.bEnableNestedDataLightMode = bEnableNestedDataLightMode;
	}
}
