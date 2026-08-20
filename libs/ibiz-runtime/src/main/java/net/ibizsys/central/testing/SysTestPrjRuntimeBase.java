package net.ibizsys.central.testing;

import java.io.File;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.Assert;

import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.central.ISystemRuntimeSetting;
import net.ibizsys.central.SystemModelRuntimeBase;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.testing.IPSSysTestPrj;
import net.ibizsys.runtime.util.LogCats;

/**
 * 系统测试项目运行时基类
 * 
 * @author lionlau
 *
 */
public abstract class SysTestPrjRuntimeBase extends SystemModelRuntimeBase implements ISysTestPrjRuntime {

	private static final Log log = LogFactory.getLog(SysTestPrjRuntimeBase.class);

	/**
	 * 获取AI工厂的配置目录
	 *
	 * @param iPSSysTestPrj
	 * @return
	 */
	public static String getConfigFolder(IPSSysTestPrj iPSSysTestPrj) {
		return ISystemRuntimeSetting.CONFIGFOLDER_SYSTESTPRJ + "." + PSModelUtils.calcUniqueTag(iPSSysTestPrj.getPSSystemModule(), iPSSysTestPrj.getCodeName());
	}

	
	private IPSSysTestPrj iPSSysTestPrj = null;
	private ISysTestPrjRuntimeContext iSysTestPrjRuntimeContext = null;
	private File workspace = null;

	@Override
	public void init(ISystemRuntimeContext iSystemRuntimeContext, IPSSysTestPrj iPSSysTestPrj) throws Exception {
		Assert.notNull(iSystemRuntimeContext, "传入系统运行时上下文对象无效");
		Assert.notNull(iPSSysTestPrj, "传入测试项目模型对象无效");
		this.setSystemRuntimeBase(iSystemRuntimeContext.getSystemRuntime());
		this.setSystemRuntimeBaseContext(iSystemRuntimeContext);
		this.iPSSysTestPrj = iPSSysTestPrj;
		
		this.setConfigFolder(getConfigFolder(iPSSysTestPrj));
		
		this.workspace = new File(new StringBuilder(this.getSystemRuntime().getFileFolder())
				.append(File.separator)
				.append(this.getConfigFolder().toLowerCase()).toString());
		if(!this.workspace.exists()) {
			this.workspace.mkdirs();
		}
		
		prepareDefaultSetting();
		this.onInit();
	}
	
	@Override
	protected void onInit() throws Exception {
		super.onInit();
	}

	@Override
	public IPSSysTestPrj getPSModelObject() {
		return this.iPSSysTestPrj;
	}
	
	/**
	 * 准备默认设置
	 * @throws Exception
	 */
	protected void prepareDefaultSetting() throws Exception{
		this.onPrepareDefaultSetting();
	}
	
	protected void onPrepareDefaultSetting() throws Exception{
		
	}
	
	protected ISysTestPrjRuntimeContext getSysTestPrjRuntimeContext() {
		if(this.iSysTestPrjRuntimeContext == null) {
			this.iSysTestPrjRuntimeContext = this.createSysTestPrjRuntimeContext();
		}
		return this.iSysTestPrjRuntimeContext;
	}
	
	protected ISysTestPrjRuntimeContext createSysTestPrjRuntimeContext() {
		return new ISysTestPrjRuntimeContext() {

			@Override
			public ISysTestPrjRuntime getModelRuntime() {
				return getSelf();
			}

			@Override
			public String getParam(String strKey, String strDefault) {
				return getSystemRuntimeSetting().getParam(getConfigFolder() + strKey, strDefault);
			}

			@Override
			public int getParam(String strKey, int nDefault) {
				return getSystemRuntimeSetting().getParam(getConfigFolder() + strKey, nDefault);
			}

			@Override
			public long getParam(String strKey, long nDefault) {
				return getSystemRuntimeSetting().getParam(getConfigFolder() + strKey, nDefault);
			}

			@Override
			public double getParam(String strKey, double fDefault) {
				return getSystemRuntimeSetting().getParam(getConfigFolder() + strKey, fDefault);
			}

			@Override
			public boolean getParam(String strKey, boolean bDefault) {
				return getSystemRuntimeSetting().getParam(getConfigFolder() + strKey, bDefault);
			}

			@Override
			public Map<String, Object> getParams(String strPKey, Map<String, Object> params) {
				return getSystemRuntimeSetting().getParams(getConfigFolder() + strPKey, params);
			}

			
			@Override
			public File getWorkspace() {
				return getSelf().getWorkspace();
			}
		};
	}
	
	private SysTestPrjRuntimeBase getSelf() {
		return this;
	}
	
	protected File getWorkspace() {
		return this.workspace;
	}
	
	@Override
	public void shutdown() throws Exception {
		onShutdown();
	}

	protected void onShutdown() throws Exception {

	}

	protected String getLogCat() {
		return LogCats.TESTPRJ;
	}
}
