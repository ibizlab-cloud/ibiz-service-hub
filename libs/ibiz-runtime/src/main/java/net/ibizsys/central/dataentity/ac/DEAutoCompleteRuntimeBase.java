package net.ibizsys.central.dataentity.ac;

import org.springframework.data.domain.Page;

import net.ibizsys.central.dataentity.DataEntityModelRuntimeBase;
import net.ibizsys.central.util.domain.ACDataItem;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelEnums.ScriptMode;
import net.ibizsys.model.dataentity.ac.IPSDEACMode;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.runtime.util.IAction;

public abstract class DEAutoCompleteRuntimeBase extends DataEntityModelRuntimeBase implements IDEAutoCompleteRuntime  {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DEAutoCompleteRuntimeBase.class);
	
	private IPSDEACMode iPSDEACMode = null;
	
	
	@Override
	public void init(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEACMode iPSDEACMode) throws Exception {
		
		this.setDataEntityRuntimeBase(iDataEntityRuntimeContext.getDataEntityRuntime());
		this.setPSDEACMode(iPSDEACMode);

		if(getPSDEACMode().getScriptMode() == ScriptMode.MODELRTSCRIPT.value && this.getModelRTScript() == null) {
			this.prepareModelRTScript(getPSDEACMode().getScriptCode(), DEAutoCompleteRTScriptBase.class);
		}
		
		this.onInit();
	}
	
	@Override
	protected void onInit() throws Exception {
		super.onInit();
	}
	
	
	@Override
	public IPSDEACMode getPSDEACMode() {
		return this.iPSDEACMode;
	}
	
	protected void setPSDEACMode(IPSDEACMode iPSDEACMode) {
		this.iPSDEACMode = iPSDEACMode;
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSDEACMode();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Page<ACDataItem> fetch(Object objData, Object objTag) throws Throwable{
		try {
			if(this.getModelRTScript() == null || !this.getModelRTScript().support("fetch")) {
				return this.onFetch(objData, objTag);
			}
			else {
				return (Page<ACDataItem>)this.getModelRTScript().callAround("fetch", new IAction() {
					@Override
					public Object execute(Object[] args) throws Throwable {
						return onFetch(objData, objTag);
					}
				}, new Object[] {objData, objTag});
			}
		}
		catch (Throwable ex) {
			if(ex instanceof DataEntityRuntimeException) {
				throw ex;
			}
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("获取数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected Page<ACDataItem> onFetch(Object objData, Object objTag) throws Throwable{
		throw new Exception("没有实现");
	}
	
	
	
}
