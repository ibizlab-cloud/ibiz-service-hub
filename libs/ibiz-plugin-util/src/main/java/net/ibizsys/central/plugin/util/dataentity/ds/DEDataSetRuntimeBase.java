package net.ibizsys.central.plugin.util.dataentity.ds;

import org.springframework.data.domain.Page;

import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.central.util.ISearchContextDTO;

public abstract class DEDataSetRuntimeBase extends net.ibizsys.central.dataentity.ds.DEDataSetRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DEDataSetRuntimeBase.class);
	
	@Override
	protected Object onFetch(ISearchContext iSearchContext) throws Throwable {
		ISearchContextDTO iSearchContextDTO = (ISearchContextDTO)iSearchContext;
		Page<?> ret = this.doFetchReal((ISearchContextDTO)iSearchContext);
		return this.translatePageAfterProceed(ret, iSearchContextDTO);
	}
	
	protected abstract Page<?> doFetchReal(ISearchContextDTO iSearchContextDTO) throws Throwable;
	
	protected boolean isFillEntityDTOPageNestedFields() {
		return this.getDataEntityRuntime().getSystemPersistentAdapter()!=null;
	}
	
	protected Page<IEntityDTO> translatePageAfterProceed(Page<?> ret, ISearchContextDTO iSearchContextDTO) throws Throwable{
		Page<IEntityDTO> page = this.getDataEntityRuntime().getEntityDTOPage(ret, this.getPSDEDataSet(), iSearchContextDTO.getPageable());
		if(isFillEntityDTOPageNestedFields() && iSearchContextDTO.isFillNestedFields()) {
			this.getDataEntityRuntime().fillEntityDTOPageNestedFields(page, this.getPSDEDataSet());
		}
		return page;
	}
}
