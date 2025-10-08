package cn.ibizlab.central.plugin.odoo.util;

import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.security.IEmployeeContext;

public class OdooEmployeeContextUtils {

	/**
	 * 会话参数：partnerid
	 */
	public final static String SESSIONPARAM_PARTNERID = "srfpartnerid";
	
	public static String getParterId(IEmployeeContext iEmployeeContext) {
		return (String) iEmployeeContext.getSessionParam(SESSIONPARAM_PARTNERID);
	}
	
	
	/**
	 * 获取合作伙伴标识，没有则返回UserId
	 * @param iEmployeeContext
	 * @return
	 */
	public static String getParterIdIf(IEmployeeContext iEmployeeContext) {
		String strParterId = (String) iEmployeeContext.getSessionParam(SESSIONPARAM_PARTNERID);
		if(StringUtils.hasLength(strParterId)) {
			return strParterId;
		}
		return iEmployeeContext.getUserid();
	}
}
