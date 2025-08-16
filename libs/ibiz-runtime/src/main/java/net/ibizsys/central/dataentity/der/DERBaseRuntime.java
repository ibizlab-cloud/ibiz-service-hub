package net.ibizsys.central.dataentity.der;

import org.springframework.util.Assert;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelEnums.DERType;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.runtime.ModelRuntimeBase;

public abstract class DERBaseRuntime extends ModelRuntimeBase implements IDERRuntime {

	private IPSDERBase iPSDERBase = null;
	private IDERRuntimeContext iDERBaseRuntimeContext = new IDERRuntimeContext() {

		@Override
		public IDERRuntime getDERRuntime() {
			return getSelf();
		}
		
	};
	
	private IDataEntityRuntimeContext iDataEntityRuntimeContext = null;
	private IDataEntityRuntime minorDataEntityRuntime = null;
	private IDataEntityRuntime majorDataEntityRuntime = null;
	private DERType derType;
	
	@Override
	public void init(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDERBase iPSDERBase) throws Exception {
		Assert.notNull(iDataEntityRuntimeContext, "传入实体运行时对象无效");
		Assert.notNull(iPSDERBase, "传入实体关系模型对象无效");
		this.iDataEntityRuntimeContext = iDataEntityRuntimeContext;
		this.minorDataEntityRuntime = this.iDataEntityRuntimeContext.getDataEntityRuntime();
		if(iPSDERBase.getMinorPSDataEntityMust().getId().equals(iPSDERBase.getMajorPSDataEntityMust().getId())) {
			this.majorDataEntityRuntime = this.minorDataEntityRuntime;
		}
		else {
			this.majorDataEntityRuntime = this.minorDataEntityRuntime.getSystemRuntime().getDataEntityRuntime(iPSDERBase.getMajorPSDataEntityMust().getId(), false);
		}
		this.setPSDERBase(iPSDERBase);
		this.derType = DERType.from(getPSDER().getDERType());
		this.onInit();
	}
	
	protected void setPSDERBase(IPSDERBase iPSDERBase) {
		this.iPSDERBase = iPSDERBase;
	}
	
	public IPSDERBase getPSDERBase() {
		return this.iPSDERBase;
	}
	
	@Override
	public IPSDERBase getPSDER() {
		return getPSDERBase();
	}
	
	protected IDataEntityRuntimeContext getDataEntityRuntimeContext() {
		return this.iDataEntityRuntimeContext;
	}
	
	protected void setDataEntityRuntimeContext(IDataEntityRuntimeContext iDataEntityRuntimeContext) {
		this.iDataEntityRuntimeContext = iDataEntityRuntimeContext;
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSDERBase();
	}
	
	private DERBaseRuntime getSelf() {
		return this;
	}
	
	@Override
	public DERType getDERType() {
		return this.derType;
	}
	
	
	protected IDERRuntimeContext getDERBaseRuntimeContext() {
		return this.iDERBaseRuntimeContext;
	}
	
	@Override
	public IDataEntityRuntime getMajorDataEntityRuntime() {
		return this.majorDataEntityRuntime;
	}
	
	@Override
	public IDataEntityRuntime getMinorDataEntityRuntime() {
		return this.minorDataEntityRuntime;
	}

}
