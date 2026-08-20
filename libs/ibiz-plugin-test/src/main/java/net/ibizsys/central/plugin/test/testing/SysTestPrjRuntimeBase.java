package net.ibizsys.central.plugin.test.testing;

import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;

import net.ibizsys.central.plugin.test.addin.ITestTool;
import net.ibizsys.central.plugin.test.testing.addin.DefaultTestTool;
import net.ibizsys.central.plugin.test.testing.addin.ISysTestPrjRTAddin;
import net.ibizsys.central.testing.SysTestPrjRuntimeException;
import net.ibizsys.runtime.IModelRuntimeContext;
import net.ibizsys.runtime.plugin.IModelRTAddin;
import net.ibizsys.runtime.plugin.ModelRTAddinRepo;
import net.ibizsys.runtime.plugin.RuntimeObjectFactory;
import net.ibizsys.runtime.util.ExceptionUtils;

public abstract class SysTestPrjRuntimeBase extends net.ibizsys.central.cloud.core.testing.SysTestPrjRuntimeBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysTestPrjRuntimeBase.class);
	
	static {
		RuntimeObjectFactory.getInstance().registerObjectIf(ISysTestPrjRTAddin.class, "*:" + ISysTestPrjRTAddin.ADDIN_TESTTOOL_PREFIX + ISysTestPrjRTAddin.TESTTOOL_DEFAULT, DefaultTestTool.class);
	}
	
	private ModelRTAddinRepo modelRTAddinRepo = null;
	
	private Map<String, ITestTool> testToolMap = null;
	
	@Override
	protected void onInstall() throws Exception {
		if(this.getAddinRepo(true) == null) {
			prepareAddinRepo();
		}
		
		this.testToolMap = this.getDefaultTestTools();
		super.onInstall();
	}
	
	protected Map<String, ITestTool> getDefaultTestTools() {
		return this.getAddins(ITestTool.class, ISysTestPrjRTAddin.ADDIN_TESTTOOL_PREFIX);
	}
	
	
	
	protected ModelRTAddinRepo getAddinRepo(boolean bTryMode) {
		if (this.modelRTAddinRepo != null || bTryMode) {
			return this.modelRTAddinRepo;
		}
		throw new SysTestPrjRuntimeException(this, "插件仓库无效");
	}

	protected ModelRTAddinRepo getAddinRepo() {
		return this.getAddinRepo(false);
	}

	protected void setAddinRepo(ModelRTAddinRepo modelRTAddinRepo) {
		this.modelRTAddinRepo = modelRTAddinRepo;
	}
	
	protected void prepareAddinRepo() throws Exception {
		this.prepareAddinRepo(this.getSysTestPrjRuntimeContext(), ISysTestPrjRTAddin.class, String.format("%1$s:",this.getFullUniqueTag()));
	}

	protected void prepareAddinRepo(IModelRuntimeContext ctx, Class<? extends IModelRTAddin> addinCls, String strTypePrefix) throws Exception {
		ModelRTAddinRepo modelRTAddinRepo = new ModelRTAddinRepo();
		modelRTAddinRepo.init(ctx, addinCls, strTypePrefix, this.getSystemRuntime().getRuntimeObjectFactory(), this.getSystemRuntime());
		this.setAddinRepo(modelRTAddinRepo);
	}

	protected <T> Map<String, T> getAddins(Class<T> cls, String strTypePrefix) {
		return this.getAddinRepo().getAddins(cls, strTypePrefix);
	}
	
	@Override
	protected Object onRun(String strPath, Map<String, Object> params) throws Throwable {
		//未来可以从测试项目及上下文参数中获取工具类型
		ITestTool iTestTool = this.getTestTool(ISysTestPrjRTAddin.TESTTOOL_DEFAULT, false);
		return iTestTool.run(strPath, params);
	}
	
	public ITestTool getTestTool(String strType, boolean bTryMode) {
		Assert.hasLength(strType, "传入测试工具类型无效");
		try {
			return this.onGetTestTool(strType, bTryMode);
		}
		catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			SysTestPrjRuntimeException.rethrow(this, ex);
			throw new SysTestPrjRuntimeException(this, String.format("获取测试工具发生异常，%1$s", ex.getMessage()), ex);
		}
		
	}
	
	protected ITestTool onGetTestTool(String strType, boolean bTryMode) throws Throwable {
		
		ITestTool iTestTool = this.testToolMap.get(strType);
		if(iTestTool == null) {
			if(bTryMode) {
				return null;
			}
			throw new Exception(String.format("测试工具[%1$s]无效", strType));
		}
		
		return iTestTool;
	}
	
	
	@Override
	protected void onUninstall() throws Throwable {
		
		if(!ObjectUtils.isEmpty(this.testToolMap)) {
			this.testToolMap.clear();
		}
		
		super.onUninstall();
		
		final ModelRTAddinRepo modelRTAddinRepo = this.getAddinRepo(true);
		if(modelRTAddinRepo != null) {
			modelRTAddinRepo.shutdown();
			this.setAddinRepo(null);
		}
	}
}
