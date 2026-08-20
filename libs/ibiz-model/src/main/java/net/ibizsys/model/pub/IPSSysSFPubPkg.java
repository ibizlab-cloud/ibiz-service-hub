package net.ibizsys.model.pub;



/**
 *
 */
public interface IPSSysSFPubPkg extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取排序值
	 * @return
	 */
	int getOrderValue();
	
	
	/**
	 * 获取包参数
	 * @return
	 */
	String getPkgParam();
	
	
	/**
	 * 获取包参数2
	 * @return
	 */
	String getPkgParam2();
	
	
	/**
	 * 获取包参数3
	 * @return
	 */
	String getPkgParam3();
	
	
	/**
	 * 获取包参数4
	 * @return
	 */
	String getPkgParam4();
	
	
	/**
	 * 获取版本参数
	 * @return
	 */
	String getVerParam();
	
	
	/**
	 * 获取版本标记
	 * @return
	 */
	String getVerTag();
	
	
	/**
	 * 获取版本标记2
	 * @return
	 */
	String getVerTag2();
}