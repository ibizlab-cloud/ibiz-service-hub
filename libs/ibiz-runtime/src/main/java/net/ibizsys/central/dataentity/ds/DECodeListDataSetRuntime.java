package net.ibizsys.central.dataentity.ds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.PageImpl;
import org.springframework.util.StringUtils;

import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.codelist.IPSCodeItem;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTO;
import net.ibizsys.runtime.codelist.ICodeListRuntime;

public class DECodeListDataSetRuntime extends DEDataSetRuntimeBase {

	@Override
	protected void onInit() throws Exception {
		this.getPSDEDataSet().getPSCodeListMust();
		super.onInit();
	}
	
	@Override
	protected Object onFetch(ISearchContext iSearchContext) throws Throwable {

		ISearchContextDTO iSearchContextDTO = (ISearchContextDTO)iSearchContext;
		ICodeListRuntime iCodeListRuntime = this.getSystemRuntime().getCodeListRuntime(this.getPSDEDataSet().getPSCodeList());
		String strQuery = iSearchContextDTO.getQuery();
		if(strQuery != null) {
			strQuery = strQuery.toUpperCase();
		}
		IPSDEMethodDTO iPSDEMethodDTO = this.getPSDEDataSet().getPSDEDataSetReturnMust().getPSDEMethodDTOMust();
		List<IPSCodeItem> psCodeItemList = iCodeListRuntime.getPSCodeItems();
		List<IEntityDTO> entityDTOList = new ArrayList<IEntityDTO>();
		int nTotalSize = 0;
		if(psCodeItemList != null) {
			nTotalSize = psCodeItemList.size();
			for(IPSCodeItem item : psCodeItemList) {
				if(StringUtils.hasLength(strQuery)) {
					if(item.getText().toUpperCase().indexOf(strQuery)==-1) {
						continue;						
					}
				}

				Map<String, Object> map = new HashMap<String, Object>();
				if(this.getDataEntityRuntime().getKeyPSDEField()!=null) {
					map.put(this.getDataEntityRuntime().getKeyPSDEField().getName(), item.getValue());
				}
				if(this.getDataEntityRuntime().getMajorPSDEField()!=null) {
					map.put(this.getDataEntityRuntime().getMajorPSDEField().getName(), item.getText());
				}
				
				entityDTOList.add((IEntityDTO)this.getDataEntityRuntime().getDEMethodDTO(iPSDEMethodDTO, map, false));
			}
		}
		
		return new PageImpl<IEntityDTO>(entityDTOList, iSearchContext.getPageable(), nTotalSize );
	}

}
