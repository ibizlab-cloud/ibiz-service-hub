package cn.ibizlab.central.plugin.odoo.bi;

import org.springframework.util.StringUtils;

import cn.ibizlab.central.plugin.odoo.dataentity.OdooDataEntityRuntimeBase;
import net.ibizsys.central.bi.util.IBISearchContext;
import net.ibizsys.central.cloud.core.bi.SysBICubeRuntimeBase;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.util.DataTypeUtils;

public class OdooSysBICubeRuntime extends SysBICubeRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(OdooSysBICubeRuntime.class);
	
	@Override
	protected IPSDEDataSet getPSDEDataSet(IBISearchContext iBISearchContext) {
		String strDataSetName = DataTypeUtils.asString(iBISearchContext.getSearchContext().get(OdooDataEntityRuntimeBase.SEARCHCONTEXTPARAM_BICUBEDATASET));
		if(StringUtils.hasLength(strDataSetName)) {
			IPSDEDataSet iPSDEDataSet = this.getDataEntityRuntime().getPSDEDataSet(strDataSetName);
			if(iPSDEDataSet != null) {
				return iPSDEDataSet;
			}
			log.error(String.format("指定BI立方体数据集[%1$s]无效", strDataSetName));
		}
		return super.getPSDEDataSet(iBISearchContext);
	}
}
