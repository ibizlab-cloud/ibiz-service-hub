package net.ibizsys.central.cloud.core.ai;

import net.ibizsys.central.ISystemRuntime;

public abstract class SysAIChatSkillBase implements ISysAIChatSkill {
	
	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysAIChatSkillBase.class);
	
	private ISysAIFactoryRuntimeContext ctx = null;
	private Object skillData = null;
	private String strId = null;
	private String strName = null;
	private String strDescription = null;
	private String strPrompt = null;
	private String strAccessUserMode = ACCESSUSERMODE_ALL;
	private String strUserId = null;
	private String strUniResId = null;
	
	private ISysAIChatSkill inheritSkill = null;
	private boolean bExtended = false;
	private boolean bRemote = false;
	private String strVersion = null;
	
	@Override
	public void init(ISysAIFactoryRuntimeContext iSysAIFactoryRuntimeContext, Object skillData, ISysAIChatSkill inheritSkill, boolean extended) throws Exception {
		this.skillData = skillData;
		this.inheritSkill = inheritSkill;
		this.bExtended = extended;
		this.init(iSysAIFactoryRuntimeContext);
	}
	
	
	protected void init(ISysAIFactoryRuntimeContext ctx) throws Exception {
		this.ctx = ctx;
		onInit();
	}
	
	protected void onInit() throws Exception {
		
	}

	protected ISysAIFactoryRuntimeContext getSysAIFactoryRuntimeContext() {
		return this.ctx;
	}

	//@Override
	public ISysAIFactoryRuntime getAIFactoryRuntime() {
		return this.getSysAIFactoryRuntimeContext().getAIFactoryRuntime();
	}
	
	
	protected ISystemRuntime getSystemRuntime() {
		return getSysAIFactoryRuntimeContext().getAIFactoryRuntime().getSystemRuntime();
	}
	
	@Override
	public Object getSkillData() {
		return this.skillData;
	}
	
	@Override
	public ISysAIChatSkill getInheritSkill() {
		return this.inheritSkill;
	}
	
	@Override
	public String getId() {
		return this.strId;
	}
	
	protected void setId(String strId) {
		this.strId = strId;
	}

	@Override
	public String getName() {
		return this.strName;
	}
	
	protected void setName(String strName) {
		this.strName = strName;
	}

	@Override
	public String getDescription() {
		return this.strDescription;
	}
	
	protected void setDescription(String strDescription) {
		this.strDescription = strDescription;
	}
	
	@Override
	public String getPrompt() {
		return this.strPrompt;
	}
	
	protected void setPrompt(String strPrompt) {
		this.strPrompt = strPrompt;
	}
	

	@Override
	public boolean isExtended() {
		return this.bExtended;
	}

	
	@Override
	public String getAccessUserMode() {
		return this.strAccessUserMode;
	}
	
	protected void setAccessUserMode(String strAccessUserMode) {
		this.strAccessUserMode = strAccessUserMode;
	}
	
	@Override
	public String getUserId() {
		return this.strUserId;
	}
	
	protected void setUserId(String strUserId) {
		this.strUserId = strUserId;
	}
	
	@Override
	public String getUniResId() {
		return this.strUniResId;
	}
	
	protected void setUniResId(String strUniResId) {
		this.strUniResId = strUniResId;
	}
	
	@Override
	public boolean isRemote() {
		return this.bRemote;
	}
	
	protected void setRemote(boolean bRemote) {
		this.bRemote = bRemote;
	}
	
	@Override
	public String getVersion() {
		return this.strVersion;
	}
	
	protected void setVersion(String strVersion) {
		this.strVersion = strVersion;
	}
	
//	@Override
//	public void reload() {
//		try {
//			this.onReload();
//		}
//		catch (Throwable ex) {
//			log.error(ex);
//		}
//	}
//	
//	protected void onReload() throws Throwable {
//		
//	}
}
