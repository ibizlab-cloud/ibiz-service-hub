package net.ibizsys.central.cloud.core.dataentity.wf;

import net.ibizsys.central.cloud.core.util.domain.WFEditableFields;

/**
 * Cloud体系实体工作流运行时对象接口
 * @author lionlau
 *
 */
public interface IDEWFRuntime extends net.ibizsys.central.dataentity.wf.IDEWFRuntime {

	
	/**
     *  流程实例属性编辑模式：不支持
     */
    public final static String WFINSTFIELDEDITMODE_NONE = "0";
   
    /**
     *  流程实例属性编辑模式：支持（排除指定属性）
     */
    public final static String WFINSTFIELDEDITMODE_EXCLUDE = "1";
    
    /**
     *  流程实例属性编辑模式：支持（仅指定属性）
     */
    public final static String WFINSTFIELDEDITMODE_INCLUDE = "2";
    
    
	/**
	 * 获取传入数据访问模式
	 * 
	 * @param arg0
	 * @param actionData
	 * @return
	 * @throws Throwable
	 */
	int getAccessMode(Object arg0, Object actionData) throws Throwable;

	/**
	 * 获取传入流程实例支持编辑的属性集合对象
	 * 
	 * @param strDataEntity
	 * @param businessKey
	 * @return
	 */
	WFEditableFields getEditableFields(Object arg0, Object actionData) throws Throwable;
}
