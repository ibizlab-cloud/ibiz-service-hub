package cn.ibizlab.central.plugin.odoo;

import net.ibizsys.central.bi.ISysBISchemeRuntime;
import net.ibizsys.central.cloud.core.IServiceSystemRuntime;

public interface IOdooSystemRuntimeBase extends IServiceSystemRuntime {
	/**
	 * 获取默认的BIScheme
	 * @return
	 */
	ISysBISchemeRuntime getDefaultSysBISchemeRuntime();
}
