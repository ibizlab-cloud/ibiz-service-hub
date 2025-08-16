package net.ibizsys.model.bi;



/**
 *
 */
public interface IPSBIReportItem extends net.ibizsys.model.bi.IPSBIReportObject
		,net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_CODENAME}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_BIREPITEMTAG}
	 * @return
	 */
	java.lang.String getItemTag();
	
	
	/**
	 * 获取报表项标记2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_BIREPITEMTAG2}
	 * @return
	 */
	java.lang.String getItemTag2();
	
	
	/**
	 * 获取报表项类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_BIREPITEMTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.BIReportItemType}
	 * @return
	 */
	java.lang.String getItemType();
}