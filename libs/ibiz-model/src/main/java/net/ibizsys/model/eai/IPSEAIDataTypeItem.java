package net.ibizsys.model.eai;



/**
 *
 */
public interface IPSEAIDataTypeItem extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取数据
	 * @return
	 */
	String getData();
	
	
	/**
	 * 获取项标记
	 * @return
	 */
	String getItemTag();
	
	
	/**
	 * 获取项标记2
	 * @return
	 */
	String getItemTag2();
	
	
	/**
	 * 获取值
	 * @return
	 */
	String getValue();
}