package net.ibizsys.central.cloud.workflow.flowable.cloudutil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import net.ibizsys.central.cloud.core.util.domain.*;
import net.ibizsys.central.cloud.saas.ebsx.EBSXSystemRuntime;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto.MetaDynaModelDTO;
import net.ibizsys.central.cloud.saas.ebsx.util.StaticDict;
import net.ibizsys.central.cloud.workflow.core.util.enums.WFUtilAction;
import net.ibizsys.central.util.SearchContextDTO;
import org.apache.commons.logging.LogFactory;
import org.flowable.bpmn.model.UserTask;
import org.flowable.common.engine.impl.cfg.TransactionState;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.flowable.engine.runtime.Execution;
import org.flowable.engine.runtime.ProcessInstance;
import org.flowable.task.api.Task;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.util.ObjectUtils;

import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.dto.CarbonCopyDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.dto.TodoDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.UserRoleDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IUserRoleService;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.dto.WFDefinitionDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.dto.WFInstanceDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.dto.WFMemberDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFMemberService;
import net.ibizsys.central.cloud.workflow.core.util.WFConsts;
import net.ibizsys.central.cloud.workflow.flowable.listener.EBSXWFInstanceListener;
import net.ibizsys.central.cloud.workflow.flowable.listener.EBSXWFRollbackListener;
import net.ibizsys.central.cloud.workflow.flowable.listener.EBSXWFStepListener;
import net.ibizsys.central.cloud.workflow.flowable.util.FlowableRuntimeServiceEx;
import net.ibizsys.central.cloud.workflow.flowable.util.IFlowableRuntimeServiceEx;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.runtime.wf.WFRoleTypes;

public class EBSXCloudFlowableUtilRuntime extends CloudFlowableUtilRuntime implements IFlowableRuntimeServiceEx{

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(EBSXCloudFlowableUtilRuntime.class);
	private IFlowableRuntimeServiceEx iFlowableRuntimeServiceEx = null;

	@Override
	protected IFlowableRuntimeServiceEx createFlowableRuntimeServiceEx(RuntimeService runtimeService) {
		this.iFlowableRuntimeServiceEx = new FlowableRuntimeServiceEx(runtimeService);
		//返回自己
		return this;
	}

	@Override
	protected void prepareProcessEngineConfiguration(ProcessEngineConfigurationImpl processEngineConfiguration) throws Exception {

		EBSXWFStepListener ebsxWFStepListener = new EBSXWFStepListener();
		ebsxWFStepListener.init(this.getCloudWFUtilRuntimeContext(), null);
		//加入回滚监听器
		EBSXWFRollbackListener ebsxWFRollbackListener = new EBSXWFRollbackListener();
		ebsxWFRollbackListener.setOnTransaction(TransactionState.ROLLED_BACK.name());
		ebsxWFRollbackListener.init(this.getCloudWFUtilRuntimeContext(),null);

		processEngineConfiguration.setEventListeners(Arrays.asList(ebsxWFStepListener,ebsxWFRollbackListener));

		super.prepareProcessEngineConfiguration(processEngineConfiguration);
	}

	@Override
	protected void prepareProcessEngineBeans(Map<Object, Object> beans) throws Exception {
		if(!beans.containsKey("processInstanceListener")) {
			EBSXWFInstanceListener ebsxWFInstanceListener = new EBSXWFInstanceListener();
			ebsxWFInstanceListener.init(this.getCloudWFUtilRuntimeContext(), null);
			beans.put("processInstanceListener", ebsxWFInstanceListener);
		}


		super.prepareProcessEngineBeans(beans);
	}

	@Override
	protected WFDefinition getWFDefinition(String strKey, boolean bTryMode) throws Throwable {

		WFDefinitionDTO wfDefinitionDTO = EBSXSystemRuntime.getInstance().getWFDefinitionService().get(strKey, bTryMode);
		if(wfDefinitionDTO == null) {
			return null;
		}
		WFDefinition wfDefinition = new WFDefinition();
		wfDefinitionDTO.copyTo(wfDefinition, true);
		return wfDefinition;
	}

	@Override
	protected void saveWFDefinition(WFDefinition wfDefinition) throws Throwable {
		WFDefinitionDTO wfDefinitionDTO = new WFDefinitionDTO();
		wfDefinition.copyTo(wfDefinitionDTO);
		EBSXSystemRuntime.getInstance().getWFDefinitionService().save(wfDefinitionDTO);
		wfDefinition.resetAll();
		wfDefinitionDTO.copyTo(wfDefinition, true);
	}

	@Override
	protected WFInstance getWFInstance(String strKey, boolean bTryMode) throws Throwable {
		WFInstanceDTO wfInstanceDTO = EBSXSystemRuntime.getInstance().getWFInstanceService().get(strKey, bTryMode);
		if(wfInstanceDTO == null) {
			return null;
		}
		WFInstance wfInstance = new WFInstance();
		wfInstanceDTO.copyTo(wfInstance, true);
		return wfInstance;
	}

	@Override
	protected void updateWFInstance(WFInstance wfInstance) throws Throwable {
		WFInstanceDTO wfInstanceDTO = new WFInstanceDTO();
		//wfInstance.copyTo(wfInstanceDTO);
		wfInstanceDTO.reload(wfInstance, true);
		EBSXSystemRuntime.getInstance().getWFInstanceService().update(wfInstanceDTO);
		wfInstance.resetAll();
		wfInstanceDTO.copyTo(wfInstance, true);
	}

	@Override
	protected void saveWFInstance(WFInstance wfInstance) throws Throwable {
		WFInstanceDTO wfInstanceDTO = new WFInstanceDTO();
		//wfInstance.copyTo(wfInstanceDTO);
		wfInstanceDTO.reload(wfInstance, true);
		EBSXSystemRuntime.getInstance().getWFInstanceService().save(wfInstanceDTO);
		wfInstance.resetAll();
		wfInstanceDTO.copyTo(wfInstance, true);
	}

	@Override
	protected void removeWFInstance(String strWFInstanceId) throws Throwable {
		EBSXSystemRuntime.getInstance().getWFInstanceService().remove(Arrays.asList(strWFInstanceId));
	}

//	@Override
//	protected void markReadTodoTask(Task task, String userId) throws Throwable {
//		super.markReadTodoTask(task, userId);
//	
////		// 待办标记为已读
////		SysTodo todoTask = new SysTodo();
////		todoTask.setParam01(task.getId());
////		todoTask.setUserid(userId);
////		todoService.markRead(todoTask);
//		
//		TodoDTO todo = new TodoDTO();
//		todo.setParam01(task.getId());
//		todo.setUserId(userId);
//		EBSXSystemRuntime.getInstance().getTodoService().markRead(todo);
//
//	}


	@Override
	protected void markReadSCTask(String taskId, String userId) throws Throwable {

		super.markReadSCTask(taskId, userId);

		CarbonCopyDTO scTask = new CarbonCopyDTO();
		scTask.setParam01(taskId);
		scTask.setUserId(userId);
		EBSXSystemRuntime.getInstance().getCarbonCopyService().markRead(scTask);



//		try {
//			
//		} catch (Exception e) {
//			log.error("将用户[{}]待办[{}]标记为已读出现异常" + e, userId, taskId);
//		}
	}


	@Override
	protected void saveSendCopyTask(String title, String userIds, String businesskey, String entity, String param01, String param02, String param03, String param04, String param05, String clobparam01) throws Throwable {

		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();

		if (ObjectUtils.isEmpty(iEmployeeContext.getDcsystemid())) {
			throw new Exception("获取用户信息失败");
		}

		log.debug(String.format("正在生成抄送任务，抄送用户为:[%1$s]", userIds));

		String[] ids = userIds.split("[;]");
		for(String strUserId : ids) {
			CarbonCopyDTO scTask = new CarbonCopyDTO();
			scTask.setTitle(title);
			scTask.setTodoType(WFConsts.TPS_SENDCOPY);
			//scTask.set("scusers",userIds);
			scTask.setUserId(strUserId);
			scTask.setBizKey(businesskey);
			scTask.setBizType(entity);
			scTask.setParam01(param01);
			scTask.setParam02(param02);
			scTask.setParam03(param03);
			scTask.setParam04(param04);
			scTask.setParam05(param05);
			scTask.setClobParam01(clobparam01);
			scTask.setDCSystemId(iEmployeeContext.getDcsystemid());

			EBSXSystemRuntime.getInstance().getCarbonCopyService().create(scTask);
		}


	}



	@Override
	public void markReadTask(String strTaskId, String strUserId) throws Throwable{
		iFlowableRuntimeServiceEx.markReadTask(strTaskId, strUserId);

		TodoDTO todo = new TodoDTO();
		todo.setParam01(strTaskId);
		todo.setUserId(strUserId);
		EBSXSystemRuntime.getInstance().getTodoService().markRead(todo);
	}

	@Override
	public void sendCopyTask(String strScope, String strTaskId, String strUserId) throws Throwable{
		iFlowableRuntimeServiceEx.sendCopyTask(strScope, strTaskId, strUserId);
	}

	@Override
	public void reassignTask(String strOriginUserId, String strTaskId, String strUserId) throws Throwable{
		iFlowableRuntimeServiceEx.reassignTask(strOriginUserId, strTaskId, strUserId);

		//todo转办
		TodoDTO todo = new TodoDTO();
		todo.setUserId(strOriginUserId);
		todo.setParam01(strTaskId);
		todo.setParam02(strUserId);

		EBSXSystemRuntime.getInstance().getTodoService().reassign(todo);
	}

	@Override
	public void delegateTask(String strOriginUserId, String strTaskId, String strUserId) throws Throwable {
		iFlowableRuntimeServiceEx.delegateTask(strOriginUserId, strTaskId, strUserId);

		TodoDTO todo = new TodoDTO();
		todo.setUserId(strOriginUserId);
		todo.setParam01(strTaskId);
		todo.setParam02(strUserId);

		EBSXSystemRuntime.getInstance().getTodoService().delegate(todo);
	}

	@Override
	public void resolveTask(String strTaskId, String strUserId) throws Throwable {
		iFlowableRuntimeServiceEx.resolveTask(strTaskId, strUserId);

		TodoDTO todo = new TodoDTO();
		todo.setUserId(strUserId);
		todo.setParam01(strTaskId);

		EBSXSystemRuntime.getInstance().getTodoService().resolve(todo);
	}

	@Override
	public List<?> searchHistoryTask(String strCategory, String strUserId) throws Throwable {
		return iFlowableRuntimeServiceEx.searchHistoryTask(strCategory, strUserId);
	}

	@Override
	public Execution selectOneHistoryTask(String strCategory, String strUserId) throws Throwable {
		return iFlowableRuntimeServiceEx.selectOneHistoryTask(strCategory, strUserId);
	}

	@Override
	protected Page<WFMember> onFetchWFMembers(String strGroupId, Map<String, Object> conds) throws Throwable {

		WFGroup wfGroup = this.getCloudWFUtilRuntimeContext().getWFGroup(strGroupId);
		if(WFRoleTypes.SYSUSERROLE.equals(wfGroup.getGroupScope())) {

			Role role = this.getCloudWFUtilRuntimeContext().getGlobalRole(wfGroup.getGroupCode());

			ISearchContextDTO iSearchContextDTO = EBSXSystemRuntime.getInstance().getUserRoleService().createSearchContextDTO(conds);
			iSearchContextDTO.eq(IUserRoleService.FIELD_SYS_ROLEID, role.getRoleId());
			iSearchContextDTO.eq(IUserRoleService.FIELD_ISVALID, 1);
			iSearchContextDTO.sort("showorder");

			Page<UserRoleDTO> page = EBSXSystemRuntime.getInstance().getUserRoleService().fetchDefault(iSearchContextDTO);
			List<WFMember> list = new ArrayList<WFMember>();
			if(!ObjectUtils.isEmpty(page) && !ObjectUtils.isEmpty(page.getContent())) {
				for(UserRoleDTO dto : page.getContent()) {
					WFMember wfMember = new WFMember();
					dto.copyTo(wfMember, true);
					wfMember.setMemberId(dto.getUserRoleId());
					list.add(wfMember);
				}
			}
			if(page != null) {
				return new PageImpl<WFMember>(list, page.getPageable(), page.getTotalElements());
			}
			else {
				return new PageImpl<WFMember>(list);
			}


		}
		else {
			ISearchContextDTO iSearchContextDTO = EBSXSystemRuntime.getInstance().getWFMemberService().createSearchContextDTO(conds);

			iSearchContextDTO.eq(IWFMemberService.FIELD_GROUPCODE, strGroupId);
			Page<WFMemberDTO> page = EBSXSystemRuntime.getInstance().getWFMemberService().fetchDefault(iSearchContextDTO);
			List<WFMember> list = new ArrayList<WFMember>();
			if(!ObjectUtils.isEmpty(page) && !ObjectUtils.isEmpty(page.getContent())) {
				for(WFMemberDTO dto : page.getContent()) {
					WFMember wfMember = new WFMember();
					dto.copyTo(wfMember, true);
					list.add(wfMember);
				}
			}
			if(page != null) {
				return new PageImpl<WFMember>(list, page.getPageable(), page.getTotalElements());
			}
			else {
				return new PageImpl<WFMember>(list);
			}
		}


	}

	@Override
	protected Page<WFMember> onFetchWFMembersExcludeMode(String strGroupId, Map<String, Object> conds) throws Throwable {

		WFGroup wfGroup = this.getCloudWFUtilRuntimeContext().getWFGroup(strGroupId);
		if(WFRoleTypes.SYSUSERROLE.equals(wfGroup.getGroupScope())) {

			Role role = this.getCloudWFUtilRuntimeContext().getGlobalRole(wfGroup.getGroupCode());

			ISearchContextDTO iSearchContextDTO = EBSXSystemRuntime.getInstance().getUserRoleService().createSearchContextDTO(conds);
			iSearchContextDTO.eq(IUserRoleService.FIELD_SYS_ROLEID, role.getRoleId());
			iSearchContextDTO.eq(IUserRoleService.FIELD_ISVALID, 1);
			iSearchContextDTO.sort("showorder");

			Page<UserRoleDTO> page = EBSXSystemRuntime.getInstance().getUserRoleService().fetchExclude(iSearchContextDTO);
			List<WFMember> list = new ArrayList<WFMember>();
			if(!ObjectUtils.isEmpty(page) && !ObjectUtils.isEmpty(page.getContent())) {
				for(UserRoleDTO dto : page.getContent()) {
					WFMember wfMember = new WFMember();
					dto.copyTo(wfMember, true);
					wfMember.setMemberId(dto.getUserRoleId());
					list.add(wfMember);
				}
			}
			if(page != null) {
				return new PageImpl<WFMember>(list, page.getPageable(), page.getTotalElements());
			}
			else {
				return new PageImpl<WFMember>(list);
			}
		}
		else {
			ISearchContextDTO iSearchContextDTO = EBSXSystemRuntime.getInstance().getWFMemberService().createSearchContextDTO(conds);

			iSearchContextDTO.eq(IWFMemberService.FIELD_GROUPCODE, strGroupId);
			Page<WFMemberDTO> page = EBSXSystemRuntime.getInstance().getWFMemberService().fetchExclude(iSearchContextDTO);
			List<WFMember> list = new ArrayList<WFMember>();
			if(!ObjectUtils.isEmpty(page) && !ObjectUtils.isEmpty(page.getContent())) {
				for(WFMemberDTO dto : page.getContent()) {
					WFMember wfMember = new WFMember();
					dto.copyTo(wfMember, true);
					list.add(wfMember);
				}
			}
			if(page != null) {
				return new PageImpl<WFMember>(list, page.getPageable(), page.getTotalElements());
			}
			else {
				return new PageImpl<WFMember>(list);
			}
		}


	}

	@Override
	protected Page<WFMember> onFetchWFMembersMultiDeptMode(String strGroupId, Map<String, Object> conds) throws Throwable {

		WFGroup wfGroup = this.getCloudWFUtilRuntimeContext().getWFGroup(strGroupId);
		if(WFRoleTypes.SYSUSERROLE.equals(wfGroup.getGroupScope())) {

			Role role = this.getCloudWFUtilRuntimeContext().getGlobalRole(wfGroup.getGroupCode());

			ISearchContextDTO iSearchContextDTO = EBSXSystemRuntime.getInstance().getUserRoleService().createSearchContextDTO(conds);
			iSearchContextDTO.eq(IUserRoleService.FIELD_SYS_ROLEID, role.getRoleId());
			iSearchContextDTO.eq(IUserRoleService.FIELD_ISVALID, 1);
			iSearchContextDTO.sort("showorder");

			Page<UserRoleDTO> page = EBSXSystemRuntime.getInstance().getUserRoleService().fetchDefault(iSearchContextDTO);
			List<WFMember> list = new ArrayList<WFMember>();
			if(!ObjectUtils.isEmpty(page) && !ObjectUtils.isEmpty(page.getContent())) {
				for(UserRoleDTO dto : page.getContent()) {
					WFMember wfMember = new WFMember();
					dto.copyTo(wfMember, true);
					wfMember.setMemberId(dto.getUserRoleId());
					list.add(wfMember);
				}
			}
			if(page != null) {
				return new PageImpl<WFMember>(list, page.getPageable(), page.getTotalElements());
			}
			else {
				return new PageImpl<WFMember>(list);
			}
		}
		else {
			ISearchContextDTO iSearchContextDTO = EBSXSystemRuntime.getInstance().getWFMemberService().createSearchContextDTO(conds);

			iSearchContextDTO.eq(IWFMemberService.FIELD_GROUPCODE, strGroupId);
			Page<WFMemberDTO> page = EBSXSystemRuntime.getInstance().getWFMemberService().fetchMultiDeptUser(iSearchContextDTO);
			List<WFMember> list = new ArrayList<WFMember>();
			if(!ObjectUtils.isEmpty(page) && !ObjectUtils.isEmpty(page.getContent())) {
				for(WFMemberDTO dto : page.getContent()) {
					WFMember wfMember = new WFMember();
					dto.copyTo(wfMember, true);
					list.add(wfMember);
				}
			}
			if(page != null) {
				return new PageImpl<WFMember>(list, page.getPageable(), page.getTotalElements());
			}
			else {
				return new PageImpl<WFMember>(list);
			}

		}

	}


	@Override
	protected Collection<WFMember> onGetWFMembers(WFGroup wfGroup, Object activeData) throws Throwable {

		return super.onGetWFMembers(wfGroup, activeData);
	}


	@Override
	protected void onCancelWFInstance(String strSystemTag, String strDataEntity, String strKey, WFInstance wfInstance, String strAppTag) throws Throwable {
		String wfInstanceId = wfInstance.getId();
		WFInstanceDTO wfInstanceDTO = null;
		//查询当前流程实例
		if (!ObjectUtils.isEmpty(wfInstanceId)) {
			wfInstanceDTO = EBSXSystemRuntime.getInstance().getWFInstanceService().get(wfInstanceId);
		}
		strSystemTag = wfInstanceDTO.getDCSystemId();
		strDataEntity = wfInstanceDTO.getEntityId();
		if (wfInstanceDTO == null) {
			throw new Exception(String.format("未能获取到流程实例[%s]信息", wfInstanceId));
		}
		String processInstanceId = wfInstanceDTO.getRealInstId();
		String appName = wfInstanceDTO.getAppId();
		if (ObjectUtils.isEmpty(processInstanceId)) {
			throw new Exception(String.format("未能获取到流程实例[%s]对应的工作流实例信息", wfInstanceId));
		}
		//查询当前流程定义
		String processDefinitionKey = wfInstanceDTO.getProcessDefinitionKey();
		if (ObjectUtils.isEmpty(processDefinitionKey)) {
			throw new Exception(String.format("未能获取到流程实例[%s]对应的工作流定义信息", wfInstanceId));
		}
		WFDefinitionDTO wfDefinitionDTO = EBSXSystemRuntime.getInstance().getWFDefinitionService().get(processDefinitionKey);
		String dynaModelId = wfDefinitionDTO.getDynaModelId();
		if (ObjectUtils.isEmpty(dynaModelId)) {
			throw new Exception(String.format("未能从流程定义[%s]中获取到动态模型信息", wfDefinitionDTO.getDefinitionKey()));
		}
		//通过当前取消的流程实例的动态模型，查找最新的动态模型
		MetaDynaModelDTO lastDynaModel = getLastDynaModel(dynaModelId);
		if (lastDynaModel == null) {
			throw new Exception("无法获取最新动态模型信息");
		}
		//获取最新的流程定义
		Collection<WFDefinition> wfDefinitions = getWFDefinitions(strSystemTag, lastDynaModel.getDynaInstTag(), lastDynaModel.getDynaInstTag2(), strDataEntity, appName);
		if (ObjectUtils.isEmpty(wfDefinitions)) {
			throw new Exception(String.format("未能获取到实体[%s]流程定义信息", strDataEntity));
		}
		WFDefinition lastProcessDefinition = (WFDefinition) ((ArrayList) wfDefinitions).get(0);
		//流程状态为流程中时，取消流程
		if (StaticDict.WFStates.ITEM_1.getValue().equals(wfInstanceDTO.getWfstate())) {
			//准备上下文参数
			Map activeData = this.getProcessEngine().getRuntimeService().getVariables(processInstanceId, Collections.singleton(WFConsts.ACTIVEDATA));
			if (activeData == null) {
				throw new Exception("无法获取流程上下文参数");
			}
			//记录重启流程动作，用于审批日志展示
			List<Task> tasks = this.getProcessEngine().getTaskService().createTaskQuery().processInstanceId(processInstanceId).list();
			if (ObjectUtils.isEmpty(tasks)) {
				throw new Exception("未能获取到运行任务");
			}
			Task task = tasks.get(0);
			createHistoryRecord(WFUtilAction.CANCEL, task, activeData);
			WFInstance instance = new WFInstance();
			wfInstanceDTO.copyTo(instance, true);
			instance.setBusinessKey(wfInstanceDTO.getBusinessKey());
			instance.setProcessDefinitionKey(lastProcessDefinition.getDefinitionKey());
			instance.set(WFConsts.ACTIVEDATA, activeData.get(WFConsts.ACTIVEDATA));
			//取消当前流程实例，删除运行时任务
			this.getProcessEngine().getRuntimeService().deleteProcessInstance(processInstanceId, "取消流程");
			instance.setWfstate(String.valueOf(WFStates.CANCEL));
			//修改流程实例为已取消
			updateWFInstance(instance);
		}
	}

	/**
	 * 获取同一系统实例内已激活的动态模型
	 *
	 * @param dynaModelId
	 * @return
	 */
	protected MetaDynaModelDTO getLastDynaModel(String dynaModelId) throws Throwable {
		//获取动态实例标记
		MetaDynaModelDTO lastModel = null;
		MetaDynaModelDTO metaDynaModelDTO = EBSXSystemRuntime.getInstance().getMetaDynaModelService().get(dynaModelId);
		String instTag = metaDynaModelDTO.getDynaInstTag();
		String instTag2 = metaDynaModelDTO.getDynaInstTag2();

		//查询系统实例下已激活的模型
		SearchContextDTO ctx = new SearchContextDTO();
		ctx.eq("sysdynainstid", metaDynaModelDTO.getSysDynaInstId());
		ctx.eq("status", StaticDict.DynamicModelStatus.ITEM_1.getValue());
		ctx.nvl("pdynainstid");
		List<MetaDynaModelDTO> metaDynaModelDTOS = EBSXSystemRuntime.getInstance().getMetaDynaModelService().selectView(ctx);
		if (!ObjectUtils.isEmpty(metaDynaModelDTOS)) {
			MetaDynaModelDTO masterModelDTO = metaDynaModelDTOS.get(0);
			//查询已激活的副本模型
			if (!ObjectUtils.isEmpty(instTag) && !ObjectUtils.isEmpty(instTag2)) {
				SearchContextDTO ctx2 = new SearchContextDTO();
				ctx2.eq("dynainsttag", instTag);
				ctx2.eq("dynainsttag2", instTag2);
				ctx2.eq("sysdynainstid", metaDynaModelDTO.getSysDynaInstId());
				ctx2.eq("status", StaticDict.DynamicModelStatus.ITEM_1.getValue());
				ctx2.eq("pdynainstid", masterModelDTO.getConfigId());
				List<MetaDynaModelDTO> backupModels = EBSXSystemRuntime.getInstance().getMetaDynaModelService().selectView(ctx2);
				if (!ObjectUtils.isEmpty(backupModels)) {
					lastModel = backupModels.get(0);
				}
			} else {
				lastModel = masterModelDTO;
			}
		}
		return lastModel;
	}

	@Override
	public void createTodo(Todo[] todos) {
		try {
			//临时重写为直接同步调用模式，以应对报错回滚，可能有性能问题
			onCreateTodo(todos);
		} catch (Throwable e) {
			log.error(String.format("建立待办任务发生错误，%1$s",  e.getMessage()), e);
		}
	}

	@Override
	protected List<WFDefinitionNode> onGetWFDefinitionNodes(String strSystemTag, String strDataEntity, String strWFInstanceId, String strAppTag) throws Throwable {
		List<WFDefinitionNode> processNodes = new ArrayList<>();
		WFInstanceDTO wfInstanceEntity = EBSXSystemRuntime.getInstance().getWFInstanceService().get(strWFInstanceId);
		if (ObjectUtils.isEmpty(wfInstanceEntity)) {
			throw new Exception(String.format("流程实例[%s]不存在", strWFInstanceId));
		}
		String processInstanceId = wfInstanceEntity.getRealInstId();
		if (ObjectUtils.isEmpty(processInstanceId)) {
			throw new Exception(String.format("流程实例[%s]缺失运行实例标识", processInstanceId));
		}
		ProcessInstance processInstance = this.getProcessEngine().getRuntimeService().createProcessInstanceQuery()
				.processInstanceId(processInstanceId)
				.singleResult();

		if (processInstance != null) {
			// 获取流程定义ID
			String processDefinitionId = processInstance.getProcessDefinitionId();

			Map<String, UserTask> usertasks = getUserTasksByDefinitionId(processDefinitionId);
			if (!ObjectUtils.isEmpty(usertasks)) {
				for (Map.Entry<String, UserTask> entry : usertasks.entrySet()) {
					String userTaskId = entry.getKey();
					UserTask userTask = entry.getValue();

					WFDefinitionNode node = new WFDefinitionNode();
					node.setUserTaskId(userTaskId);
					node.setUserTaskName(userTask.getName());
					node.setProcessDefinitionKey(wfInstanceEntity.getProcessDefinitionKey());
					node.setProcessDefinitionName(wfInstanceEntity.getProcessDefinitionName());
					processNodes.add(node);
				}
			}
		}

//		WFInstanceDTO wfInstanceEntity = EBSXSystemRuntime.getInstance().getWFInstanceService().get(strWFInstanceId);
//		if (ObjectUtils.isEmpty(wfInstanceEntity)) {
//			throw new Exception(String.format("流程实例[%s]不存在", strWFInstanceId));
//		}
//		String processDefinitionKey = wfInstanceEntity.getProcessDefinitionKey();
//		if (ObjectUtils.isEmpty(processDefinitionKey)) {
//			throw new Exception(String.format("流程实例[%s]缺失流程定义标识", processDefinitionKey));
//		}
//
//		Map<String, UserTask> usertasks = getUserTasksByDefinitionKey(processDefinitionKey);
//		if(!ObjectUtils.isEmpty(usertasks)){
//			for(Map.Entry<String,UserTask> entry : usertasks.entrySet()){
//				String userTaskId = entry.getKey();
//				UserTask userTask = entry.getValue();
//
//				WFDefinitionNode node = new WFDefinitionNode();
//				node.setUserTaskId(userTaskId);
//				node.setUserTaskName(userTask.getName());
//				node.setProcessDefinitionKey(processDefinitionKey);
//				node.setProcessDefinitionName(wfInstanceEntity.getProcessDefinitionName());
//				processNodes.add(node);
//			}
//		}
		return processNodes;
	}
}
