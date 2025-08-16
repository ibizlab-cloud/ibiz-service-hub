package net.ibizsys.model.dynamodel;



/**
 *
 */
public interface IPSJsonSimpleSchema extends net.ibizsys.model.dynamodel.IPSJsonNodeSchema{

	
	
	/**
	 * 获取格式
	 * @return
	 */
	java.lang.String getFormat();
	
	
	/**
	 * 获取标准值类型
	 * @return
	 */
	int getStdDataType();
}