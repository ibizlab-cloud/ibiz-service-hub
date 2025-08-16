package net.ibizsys.central.sysutil;

public interface ISysUtilRuntimeBase {

	/**
	 * 安装数据模式
	 */
	public final static String INSTALLDATAMODE_DEFAULT = "DEFAULT";
	/**
	 * 安装功能
	 * @throws Throwable
	 */
	void install() throws Exception;

	
	/**
	 * 是否已经安装
	 * @return
	 */
	boolean isInstalled();
	
	/**
	 * 卸载功能
	 */
	void uninstall();
	

	/**
	 * 安装数据
	 */
	default void installData(String strMode) throws Exception{
		
	}
}
