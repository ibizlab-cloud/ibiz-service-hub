package net.ibizsys.central.dataentity.der;

import org.springframework.util.Assert;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.PSModelEnums.DERType;
import net.ibizsys.model.dataentity.der.IPSDERBase;

public abstract class DERRuntimeBaseBase implements IDERRuntimeBase{

	final IDataEntityRuntime minorDataEntityRuntime;
	final IPSDERBase iPSDERBase;
	final DERType derType;
	public DERRuntimeBaseBase(IDataEntityRuntime minorDataEntityRuntime, IPSDERBase iPSDERBase) {
		Assert.notNull(minorDataEntityRuntime, "传入从实体运行时对象无效");
		Assert.notNull(iPSDERBase, "传入实体关系模型对象无效");
		this.minorDataEntityRuntime = minorDataEntityRuntime;
		this.iPSDERBase = iPSDERBase;
		this.derType = DERType.from(getPSDER().getDERType());
	}
	
	@Override
	public DERType getDERType() {
		return this.derType;
	}
	
	@Override
	public IDataEntityRuntime getMinorDataEntityRuntime() {
		return this.minorDataEntityRuntime;
	}
	
	@Override
	public IPSDERBase getPSDER() {
		return this.iPSDERBase;
	}
	
	
}
