package net.ibizsys.model.bi;



/**
 *
 */
public interface IPSBIReportDimension extends net.ibizsys.model.bi.IPSBIReportItem{

	
	
	/**
	 * 获取放置类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.BIReportItemPlaceType}
	 * @return
	 */
	java.lang.String getPlaceType();
	
	
	/**
	 * 获取放置位置
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.BIReportItemPlacement}
	 * @return
	 */
	java.lang.String getPlacement();
}