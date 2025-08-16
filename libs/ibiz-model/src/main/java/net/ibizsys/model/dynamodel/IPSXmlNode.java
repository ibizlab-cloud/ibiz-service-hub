package net.ibizsys.model.dynamodel;



/**
 *
 */
public interface IPSXmlNode extends net.ibizsys.model.dynamodel.IPSXmlNodeOwner{

	
	
	/**
	 * 获取节点名称
	 * @return
	 */
	java.lang.String getNodeName();
	
	
	/**
	 * 获取节点值
	 * @return
	 */
	java.lang.String getNodeValue();
}