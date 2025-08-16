package net.ibizsys.central.codelist;

import java.util.List;

import net.ibizsys.model.codelist.IPSCodeItem;
import net.ibizsys.runtime.codelist.ICodeListRuntime;
import net.ibizsys.runtime.security.IUserContext;

/**
 * 动态代码表运行时接口，进一步支持上下文接口
 * @author lionlau
 *
 */
public interface IDynamicCodeListRuntime extends ICodeListRuntime {

	
	/**
	 * 获取上下文实例
	 * @param dataOrKey
	 * @return
	 */
	ICodeListRuntime getInstance(Object dataOrKey);
	
	
	/**
	 * 获取代码项集合
	 * @param dataOrKey 数据或键值
	 * @return
	 */
	List<IPSCodeItem> getPSCodeItems(Object dataOrKey);
	
		
	/**
	 * 获取代码表文本
	 * @param dataOrKey 数据或键值
	 * @param objValue
	 * @param iUserContext
	 * @return
	 */
	String getText(Object dataOrKey, Object objValue, IUserContext iUserContext);
	
	
	/**
	 * 获取指定值的代码项
	 * @param dataOrKey 数据或键值
	 * @param strItemValue
	 * @param bTryMode  产生模式
	 * @return
	 */
	IPSCodeItem getPSCodeItem(Object dataOrKey, String strItemValue, boolean bTryMode);

	
	/**
	 * 获取指定文本的代码项
	 * @param dataOrKey 数据或键值
	 * @param strItemValue
	 * @param iUserContext
	 * @param bTryMode
	 * @return
	 */
	IPSCodeItem getPSCodeItemByText(Object dataOrKey, String strText, IUserContext iUserContext, boolean bTryMode);
	
	
	
	
}
