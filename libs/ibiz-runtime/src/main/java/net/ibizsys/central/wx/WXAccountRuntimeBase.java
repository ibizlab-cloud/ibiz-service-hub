package net.ibizsys.central.wx;

import org.springframework.util.Assert;

import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.central.ISystemRuntimeSetting;
import net.ibizsys.central.SystemModelRuntimeBase;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.wx.IPSWXAccount;

public abstract class WXAccountRuntimeBase extends SystemModelRuntimeBase implements IWXAccountRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(WXAccountRuntimeBase.class);

	private IPSWXAccount iPSWXAccount = null;


	/**
	 * 获取微信账户的配置目录
	 * @param iPSWXAccount
	 * @return
	 */
	public static String getConfigFolder(IPSWXAccount iPSWXAccount) {
		return ISystemRuntimeSetting.CONFIGFOLDER_WXACCOUNT + "." + PSModelUtils.calcUniqueTag(iPSWXAccount.getPSSystemModule(), iPSWXAccount.getCodeName());
	}
	
	
	private IWXAccountRuntimeContext iWXAccountRuntimeContext = new IWXAccountRuntimeContext() {

		@Override
		public IWXAccountRuntime getWXAccountRuntime() {
			return getSelf();
		}

	};

	@Override
	public void init(ISystemRuntimeContext iSystemRuntimeContext, IPSWXAccount iPSWXAccount) throws Exception {
		this.setSystemRuntimeBaseContext(iSystemRuntimeContext);
		this.iPSWXAccount = iPSWXAccount;
		Assert.notNull(this.iPSWXAccount, "传入系统微信账户模型对象无效");
		this.setConfigFolder(getConfigFolder(iPSWXAccount));
		
		this.onInit();
	}

	@Override
	protected void onInit() throws Exception {

		super.onInit();

	}
	
	
	@Override
	public IPSWXAccount getPSWXAccount() {
		return this.iPSWXAccount;
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSWXAccount();
	}

	@Override
	public String getId() {
		return getPSWXAccount().getId();
	}

	@Override
	public String getName() {
		return getPSWXAccount().getName();
	}

	protected IWXAccountRuntimeContext getWXAccountRuntimeContext() {
		return this.iWXAccountRuntimeContext;
	}

	protected ISystemRuntimeContext getSystemRuntimeContext() {
		return (ISystemRuntimeContext) super.getSystemRuntimeBaseContext();
	}

	private IWXAccountRuntime getSelf() {
		return this;
	}

	
	
}
