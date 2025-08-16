package net.ibizsys.central.res;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.util.IEntityBase;

public class SysDESequenceRuntime extends net.ibizsys.runtime.res.SysDESequenceRuntime {

	@Override
	protected IDataEntityRuntime getDataEntityRuntime() {
		return (IDataEntityRuntime)super.getDataEntityRuntime();
	}
	
	@Override
	public synchronized Object get(IEntityBase iEntityBase, IPSDEField iPSDEField, net.ibizsys.runtime.dataentity.IDataEntityRuntime entityDataEntityRuntime) throws Throwable {
		//以下代码解决无存储实体请求序列时开启事务未指定当前实体数据源的问题
		try {
			if(this.getDataEntityRuntime().getSysDBSchemeRuntime()!=null) {
				this.getDataEntityRuntime().getSysDBSchemeRuntime().push();
			}
			return super.get(iEntityBase, iPSDEField, entityDataEntityRuntime);
		}
		finally {
			if(this.getDataEntityRuntime().getSysDBSchemeRuntime()!=null) {
				this.getDataEntityRuntime().getSysDBSchemeRuntime().poll();
			}
		}
	}
	
}
