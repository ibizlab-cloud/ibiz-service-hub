package net.ibizsys.model.control.map;



/**
 * 系统地图部件模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysMapDTO}运行时对象
 *
 */
public interface IPSSysMap extends net.ibizsys.model.control.map.IPSMap{

	
	
	/**
	 * 获取图例位置
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.LabelPos}
	 * @return
	 */
	java.lang.String getLegendPos();
	
	
	/**
	 * 获取地图项集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.map.IPSSysMapItem> getPSSysMapItems();
	
	/**
	 * 获取地图项集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.map.IPSSysMapItem getPSSysMapItem(Object objKey, boolean bTryMode);
	
	/**
	 * 设置地图项集合
	 * @param list 地图项集合
	 */
	void setPSSysMapItems(java.util.List<net.ibizsys.model.control.map.IPSSysMapItem> list);
}