package net.ibizsys.model;

public interface IPSDynaInstServiceRuntime {

	/**
	 * 设置模型文件夹路径
	 * @param strPSModelFolderPath
	 */
	void setPSModelFolderPath(String strPSModelFolderPath);

	
	
	/**
	 * 设置动态实例标识
	 * @param strPSModelFolderPath
	 */
	void setPSDynaInstId(String strPSDynaInstId);
	
	
	
	/**
	 * 获取模型文件夹路径
	 * @return
	 */
	String getPSModelFolderPath();
	
	
	
	/**
	 * 设置动态实例的核心系统模型服务
	 * @return
	 */
	void setPSSystemService(IPSSystemService iPSSystemService);
	
}
