package net.ibizsys.model.data;



/**
 * 数据项模型基础对象接口
 *
 */
public interface IPSDataItem extends net.ibizsys.model.IPSModelObject{

	
	
	
	
	
	
	
	
	/**
	 * 获取标准数据类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.StdDataType}
	 * @return
	 */
	int getDataType();
	
	
	/**
	 * 获取格式化
	 * @return
	 */
	java.lang.String getFormat();
	
	
	/**
	 * 获取代码表对象
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getPSCodeList();


	/**
	 * 获取代码表对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getPSCodeListMust();
	
	
	/**
	 * 获取是否转换为代码项文本
	 * @return
	 */
	boolean isConvertToCodeItemText();
}