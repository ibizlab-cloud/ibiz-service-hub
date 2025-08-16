package net.ibizsys.central.app.dataentity;

import org.springframework.util.Assert;

import net.ibizsys.central.app.IApplicationRuntimeContext;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.app.dataentity.IPSAppDERS;
import net.ibizsys.runtime.ModelRuntimeBase;

/**
 * 应用实体关系运行时对象接口
 * 
 * @author lionlau
 *
 */
public class AppDataEntityRSRuntime extends ModelRuntimeBase implements IAppDataEntityRSRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(AppDataEntityRSRuntime.class);

	private IApplicationRuntimeContext iApplicationRuntimeContext = null;
	private IPSAppDERS iPSAppDERS = null;
	private IAppDataEntityRuntime majorAppDataEntityRuntime = null;
	private IAppDataEntityRuntime minorAppDataEntityRuntime = null;

	@Override
	public void init(IApplicationRuntimeContext iApplicationRuntimeContext, IPSAppDERS iPSAppDERS) throws Exception {
		Assert.notNull(iApplicationRuntimeContext, "传入系统前端应用运行时上下文对象无效");
		Assert.notNull(iPSAppDERS, "传入应用实体关系模型对象无效");
		
		this.iApplicationRuntimeContext = iApplicationRuntimeContext;
	
		this.iPSAppDERS = iPSAppDERS;
		
		

		this.onInit();
	}
	
	@Override
	protected void onInit() throws Exception {
		
		this.majorAppDataEntityRuntime = this.getApplicationRuntimeContext().getApplicationRuntime().getAppDataEntityRuntime(this.getPSAppDERS().getMajorPSAppDataEntityMust().getId(), false);
		this.minorAppDataEntityRuntime = this.getApplicationRuntimeContext().getApplicationRuntime().getAppDataEntityRuntime(this.getPSAppDERS().getMinorPSAppDataEntityMust().getId(), false);
		
		
		
		super.onInit();
	}
	
	
	
	@Override
	public IPSAppDERS getPSAppDERS() {
		return this.iPSAppDERS;
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSAppDERS();
	}
	
	protected IApplicationRuntimeContext getApplicationRuntimeContext() {
		return this.iApplicationRuntimeContext;
	}


	@Override
	public IAppDataEntityRuntime getMajorAppDataEntityRuntime() {
		return this.majorAppDataEntityRuntime;
	}

	@Override
	public IAppDataEntityRuntime getMinorAppDataEntityRuntime() {
		return this.minorAppDataEntityRuntime;
	}
	
	

	
}
