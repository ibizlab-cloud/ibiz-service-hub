package net.ibizsys.central.cloud.core.sysutil;

import java.util.Collection;
import java.util.List;

import net.ibizsys.central.cloud.core.util.domain.WFDefinition;
import net.ibizsys.central.cloud.core.util.domain.WFEditableFields;
import net.ibizsys.central.cloud.core.util.domain.WFInstance;
import net.ibizsys.central.cloud.core.util.domain.WFTaskWay;
import net.ibizsys.central.sysutil.ISysUtilRuntime;

/**
 * 系统工作流功能运行时接口
 * @author lionlau
 *
 */
public interface ISysWFUtilRuntime extends ISysUtilRuntime{




	/**
	 * 部署动态工作流
	 * @param bpmnfiles
	 */
	Collection<WFDefinition> createWFDefinitions(List bpmnfiles);



	/**
	 * 获取业务实体流程定义
	 * @param strDataEntity
	 * @return
	 */
	Collection<WFDefinition> getWFDefinitions(String strDataEntity);




	/**
	 * 获取业务实体流程定义
	 * @param strDataEntity
	 * @param strWFDefinitionId 定义标识
	 * @return
	 */
	WFDefinition getWFDefinition(String strDataEntity, String strWFDefinitionId);



	/**
	 * 注册工作流实例
	 * @param strDataEntity
	 * @param businessKey
	 * @param instance
	 * @return
	 */
	WFInstance registerWFInstance(String strDataEntity, Object businessKey, WFInstance instance);




	/**
	 * 注销工作流实例
	 * @param strDataEntity
	 * @param businessKey
	 * @return
	 */
	void unregisterWFInstance(String strDataEntity, Object businessKey);

	/**
	 * 获取工作流实例
	 * @param strDataEntity
	 * @param businessKey
	 * @return
	 */
	WFInstance getWFInstanceByBusinessKey(String strDataEntity, Object businessKey);

	/**
	 * 获取工作流实例访问模式
	 * @param strDataEntity
	 * @param businessKey
	 * @return
	 */
	int getWFInstanceAccessMode(String strDataEntity, Object businessKey);


	/**
	 * 获取传入流程实例支持编辑的属性集合对象
	 * @param strDataEntity
	 * @param businessKey
	 * @return
	 */
	WFEditableFields getWFInstanceEditableFields(String strDataEntity, Object businessKey);

	/**
	 * 启动流程实例
	 * @param strDataEntity
	 * @param businessKey
	 * @param instance
	 * @return
	 */
	WFInstance startWFInstance(String strDataEntity, Object businessKey, WFInstance instance);
	
	/**
	 * 提供工作流任务
	 * @param strDataEntity
	 * @param businessKey
	 * @param wfAction
	 * @param wfTaskWay
	 * @return
	 */
	WFInstance submitWFTaskWay(String strDataEntity, Object businessKey, String wfAction, WFTaskWay wfTaskWay);
}
