package net.ibizsys.central.cloud.core.sysutil;

import net.ibizsys.central.cloud.core.util.domain.CodeList;

public interface ISysConfUtilRuntime extends net.ibizsys.central.sysutil.ISysConfUtilRuntime{

	/**
	 * 获取代码表对象
	 * @param strCodeListTag
	 * @param bTryMode 尝试模式
	 * @return
	 */
	CodeList getCodeList(String strCodeListTag, boolean bTryMode);
	
}
