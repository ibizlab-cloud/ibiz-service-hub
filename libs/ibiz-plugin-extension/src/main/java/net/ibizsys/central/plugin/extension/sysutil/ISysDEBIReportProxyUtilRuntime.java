package net.ibizsys.central.plugin.extension.sysutil;

import net.ibizsys.central.cloud.core.sysutil.ISysUtilRuntime;
import net.ibizsys.model.dataentity.IPSDataEntity;

/**
 *  系统实体智能报表代理功能对象接口
 * @author lionlau
 *
 */
public interface ISysDEBIReportProxyUtilRuntime extends ISysUtilRuntime {

	/**
	 * 获取代理实体对象
	 * @return
	 */
	IPSDataEntity getProxyPSDataEntity();
}
