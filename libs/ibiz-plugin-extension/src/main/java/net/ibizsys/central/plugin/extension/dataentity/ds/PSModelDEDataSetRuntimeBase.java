package net.ibizsys.central.plugin.extension.dataentity.ds;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.util.ObjectUtils;

import net.ibizsys.central.cloud.core.sysutil.ISysUtilContainerOnly;
import net.ibizsys.central.plugin.extension.dataentity.IPSModelDataEntityRuntime;
import net.ibizsys.central.plugin.extension.sysutil.IHubSysExtensionUtilRuntime;
import net.ibizsys.central.plugin.extension.sysutil.ISysExtensionUtilRuntime;
import net.ibizsys.central.util.IEntity;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;

public abstract class PSModelDEDataSetRuntimeBase extends DEDataSetRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(PSModelDEDataSetRuntimeBase.class);
	private ISysExtensionUtilRuntime iSysExtensionUtilRuntime = null;
	
	@Override
	protected void onInit() throws Exception {
		
		super.onInit();
	}
	
	protected ISysExtensionUtilRuntime getSysExtensionUtilRuntime() {
		if(this.iSysExtensionUtilRuntime == null) {
			this.iSysExtensionUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysExtensionUtilRuntime.class, false);
		}
		return this.iSysExtensionUtilRuntime;
	}
	
	@Override
	public IPSModelDataEntityRuntime getDataEntityRuntime() {
		return (IPSModelDataEntityRuntime)super.getDataEntityRuntime();
	}
	
	@Override
	protected Object onFetch(ISearchContext iSearchContext) throws Throwable {
		//合成代码标识
		String strMethodName = String.format("Fetch%1$s", this.getPSDEDataSet().getCodeName());
		IPSModelFilter iPSModelFilter = this.getDataEntityRuntime().toPSModelFilter((ISearchContextDTO)iSearchContext);
		Map<String, Object> param = new LinkedHashMap<String, Object>();
		if(iPSModelFilter!=null) {
			param.putAll(iPSModelFilter.any());
		}
		Object ret = null;
		
		ISysExtensionUtilRuntime iSysExtensionUtilRuntime = this.getSysExtensionUtilRuntime();
		if(iSysExtensionUtilRuntime instanceof IHubSysExtensionUtilRuntime && !(iSysExtensionUtilRuntime instanceof ISysUtilContainerOnly)) {
			ret = ((IHubSysExtensionUtilRuntime)iSysExtensionUtilRuntime).invokeDynaModelAPI(this.getSystemRuntime(), null, null, this.getDataEntityRuntime().getPSModelTag(), strMethodName, null, param, true);
		}
		else {
			ret = iSysExtensionUtilRuntime.invokeDynaModelAPI(null, null, this.getDataEntityRuntime().getPSModelTag(), strMethodName, null, param, true);
		}
		
		if(ret instanceof Page) {
			Page page = (Page)ret;
			List<? extends IPSModel> contentList = page.getContent();
			if(!ObjectUtils.isEmpty(contentList)) {
				List<IEntity> dtoList = new ArrayList<IEntity>();
				for(IPSModel iPSModel : contentList) {
					IEntity iEntity = this.getDataEntityRuntime().fromPSModel(iPSModel);
					dtoList.add(iEntity);
				}
				return new PageImpl<IEntity>(dtoList, iSearchContext.getPageable(), page.getTotalElements());
			}
		}
		return ret;
	}

}
