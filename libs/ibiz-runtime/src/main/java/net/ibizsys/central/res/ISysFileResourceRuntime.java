package net.ibizsys.central.res;

import java.io.File;

/**
 * 系统文件资源运行时对象
 * @author lionlau
 *
 */
public interface ISysFileResourceRuntime extends ISysResourceRuntime {

	/**
	 * 获取文件对象
	 * @param target 目标数据 
	 * @return
	 */
	File getFile(Object target);
	
	
	/**
	 * 是否提供存在指定文件
	 * @param target
	 * @return
	 */
	boolean hasFile(Object target);
	
	
	
}
