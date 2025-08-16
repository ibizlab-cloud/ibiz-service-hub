package net.ibizsys.central.dataentity.ac;

import org.springframework.data.domain.Page;

import net.ibizsys.central.util.domain.ACDataItem;

public interface IDEAutoCompleteRuntimeBase {

	/**
	 * 注册排序值：优先
	 */
	public final int PRIORITY_PRIMARY = 50;
	
	/**
	 * 注册排序值：默认
	 */
	public final int PRIORITY_DEFAULT = 100;
	
	/**
	 * 获取优先级
	 * @return
	 */
	default int getPriority() {
		return PRIORITY_DEFAULT;
	}
	
	/**
	 * 获取数据项分页结构
	 * @param objData 数据集合
	 * @param objTag
	 * @return
	 */
	Page<ACDataItem> fetch(Object objData, Object objTag) throws Throwable;
}
