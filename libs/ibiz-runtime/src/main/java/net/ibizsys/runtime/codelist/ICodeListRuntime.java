package net.ibizsys.runtime.codelist;

import java.util.List;

import net.ibizsys.model.codelist.IPSCodeItem;
import net.ibizsys.model.codelist.IPSCodeList;
import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.ISystemRuntimeBaseContext;
import net.ibizsys.runtime.security.IUserContext;

/**
 * 代码表运行时对象接口
 * @author lionlau
 *
 */
public interface ICodeListRuntime extends IModelRuntime{

	/**
	 * 初始化代码表运行时
	 * @param iSystemRuntimeBaseContext
	 * @param iPSCodeList
	 * @throws Exception
	 */
	void init(ISystemRuntimeBaseContext iSystemRuntimeBaseContext, IPSCodeList iPSCodeList) throws Exception;
	
	
	
	/**
	 * 获取代码表模型对象
	 * @return
	 */
	IPSCodeList getPSCodeList();
	
	/**
	 * 获取代码项集合
	 * @return
	 */
	List<IPSCodeItem> getPSCodeItems();
	
	
	/**
	 * 获取代码表文本
	 * @param objValue
	 * @return
	 */
	String getText(Object objValue);
	
	
	/**
	 * 获取代码表文本
	 * @param objValue
	 * @return
	 */
	String getText(Object objValue, IUserContext iUserContext);
	
	
	/**
	 * 获取指定值的代码项
	 * @param strItemValue
	 * @return
	 */
	IPSCodeItem getPSCodeItem(String strItemValue);
	
	
	
	/**
	 * 获取指定值的代码项
	 * @param strItemValue
	 * @param bTryMode  产生模式
	 * @return
	 */
	IPSCodeItem getPSCodeItem(String strItemValue, boolean bTryMode);
	
	
	/**
	 * 获取指定文本的代码项
	 * @param strItemValue
	 * @param bTryMode
	 * @return
	 */
	IPSCodeItem getPSCodeItemByText(String strText, boolean bTryMode);
	
	/**
	 * 获取指定文本的代码项
	 * @param strItemValue
	 * @param iUserContext
	 * @param bTryMode
	 * @return
	 */
	IPSCodeItem getPSCodeItemByText(String strText, IUserContext iUserContext, boolean bTryMode);
	
	
	/**
	 * 重置代码表
	 */
	void reset();
	
	
	
	/**
	 * 值分隔符
	 * @return
	 */
	String getValueSeparator();
	
	
	/**
	 * 文本分隔符
	 * @return
	 */
	String getTextSeparator();
	
	
	/**
	 * 获取空白内容
	 * @return
	 */
	String getEmptyText();
}
