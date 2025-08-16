package net.ibizsys.central.dataentity.ds;

import java.util.List;

import org.springframework.data.domain.Page;

import net.ibizsys.central.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;

public abstract class DEDataSetLogicRuntimeBaseBase implements IDEDataSetLogicRuntimeBase {

	@Override
	public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEDataSet iPSDEDataSet, Object[] args, Object ret) throws Throwable {
		if (args != null && args.length > 0) {
			Object objSearchContext = args[0];
			if (objSearchContext instanceof ISearchContext) {
				ISearchContext iSearchContext = (ISearchContext) objSearchContext;
				return this.onExecute(iDataEntityRuntimeContext, iPSDEDataSet, iSearchContext, ret);
			}
		}

		throw new Exception("没有实现");
	}
	
	protected Object onExecute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEDataSet iPSDEDataSet, ISearchContext iSearchContext, Object ret) throws Throwable {
		if(ret == null) {
			return this.onExecute(iDataEntityRuntimeContext, iPSDEDataSet, iSearchContext, null);
		}
		
		if(ret instanceof Page) {
			return this.onExecute(iDataEntityRuntimeContext, iPSDEDataSet, iSearchContext, ((Page)ret).getContent());

		}
		
		if(ret instanceof List) {
			return this.onExecute(iDataEntityRuntimeContext, iPSDEDataSet, iSearchContext, (List)ret);
		}
		
		throw new Exception("没有实现");
	}

	protected Object onExecute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEDataSet iPSDEDataSet, ISearchContext iSearchContext, List<?> ret) throws Throwable{
		throw new Exception("没有实现");
	}
}
