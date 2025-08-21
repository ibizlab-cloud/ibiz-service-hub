package net.ibizsys.model.bi;



/**
 *
 */
public interface IPSBIReportItem extends net.ibizsys.model.bi.IPSBIReportObject
		,net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取报表项动态参数
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getItemParams();
	
	
	/**
	 * 获取报表项标记
	 * @return
	 */
	java.lang.String getItemTag();
	
	
	/**
	 * 获取报表项标记2
	 * @return
	 */
	java.lang.String getItemTag2();
	
	
	/**
	 * 获取报表项类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.BIReportItemType}
	 * @return
	 */
	java.lang.String getItemType();
}