package cn.ibizlab.central.plugin.groovy.res

import net.ibizsys.model.dataentity.defield.IPSDEField
import net.ibizsys.runtime.dataentity.IDataEntityRuntime
import net.ibizsys.central.res.SysTranslatorRuntimeBase
import net.ibizsys.runtime.util.IEntityBase

class SimpleSysTranslatorRuntime extends SysTranslatorRuntimeBase{

	@Override
	protected Object onTranslate(Object objValue, boolean bIn) throws Throwable {
		return super.onTranslate(objValue, bIn);
	}
}
