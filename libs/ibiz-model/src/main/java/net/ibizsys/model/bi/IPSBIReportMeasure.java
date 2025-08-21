package net.ibizsys.model.bi;



/**
 *
 */
public interface IPSBIReportMeasure extends net.ibizsys.model.bi.IPSBIReportItem{

	
	
	/**
	 * 获取聚合模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AggMode}
	 * @return
	 */
	java.lang.String getAggMode();
	
	
	/**
	 * 获取放置类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.BIReportItemPlaceType}
	 * @return
	 */
	java.lang.String getPlaceType();
}