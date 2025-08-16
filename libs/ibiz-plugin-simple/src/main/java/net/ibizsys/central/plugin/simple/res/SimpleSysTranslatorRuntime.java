package net.ibizsys.central.plugin.simple.res;

import java.util.Random;

import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.res.SysTranslatorRuntimeBase;
import net.ibizsys.runtime.util.IEntityBase;

public class SimpleSysTranslatorRuntime extends SysTranslatorRuntimeBase {

	@Override
	public Object translate(Object objValue, boolean bIn, IEntityBase iEntityBase, IPSDEField iPSDEField, IDataEntityRuntime entityDataEntityRuntime) throws Throwable {
		
		return (new Random()).nextInt(1000);
	}

}
