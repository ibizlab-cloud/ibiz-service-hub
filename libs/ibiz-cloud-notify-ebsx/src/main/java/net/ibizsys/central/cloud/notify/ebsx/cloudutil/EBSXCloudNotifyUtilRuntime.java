package net.ibizsys.central.cloud.notify.ebsx.cloudutil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.util.domain.CarbonCopy;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.cloud.core.util.domain.Todo;
import net.ibizsys.central.cloud.core.util.domain.TodoState;
import net.ibizsys.central.cloud.notify.core.cloudutil.CloudNotifyUtilRuntimeBase;
import net.ibizsys.central.cloud.saas.ebsx.EBSXSystemRuntime;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.dto.MsgSendQueueDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.dto.MsgSendQueueHisDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.dto.SysMsgSendQueueDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.dto.TodoDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.dto.TodoHisDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.IMsgSendQueueService;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.ISysMsgSendQueueService;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.ITodoService;
import net.ibizsys.central.cloud.saas.ebsx.util.StaticDict;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.LogLevels;
import net.ibizsys.runtime.util.domain.MsgSendQueue;

public class EBSXCloudNotifyUtilRuntime extends CloudNotifyUtilRuntimeBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(EBSXCloudNotifyUtilRuntime.class);
	
	
	
	@Override
	protected void onInstall() throws Exception {
		super.onInstall();

		// prepareJobs();
	}
	
	@Override
	protected void onNotifyTimer() throws Throwable {
		//查询未发送的消息
		
		long nCurrentTime = System.currentTimeMillis();
		java.sql.Timestamp fromDate = new java.sql.Timestamp(nCurrentTime - this.getNotifyTimeRangeFrom());
		java.sql.Timestamp toDate = new java.sql.Timestamp(nCurrentTime + this.getNotifyTimeRangeTo());
		
		SearchContextDTO searchContextDTO = new SearchContextDTO();
		searchContextDTO.eq(ISysMsgSendQueueService.FIELD_ISSEND, 0);
		searchContextDTO.eq(ISysMsgSendQueueService.FIELD_ISERROR, 0);
		searchContextDTO.nn(ISysMsgSendQueueService.FIELD_PLANSENDTIME);
		searchContextDTO.gt(ISysMsgSendQueueService.FIELD_PLANSENDTIME, fromDate);
		searchContextDTO.lte(ISysMsgSendQueueService.FIELD_PLANSENDTIME, toDate);
		searchContextDTO.count(false);
		searchContextDTO.limit(1000);
		
		List<SysMsgSendQueueDTO> list = EBSXSystemRuntime.getInstance().getSysMsgSendQueueService().selectView(searchContextDTO);
		if(ObjectUtils.isEmpty(list)) {
			return;
		}
		
		for(SysMsgSendQueueDTO item : list) {
			MsgSendQueue msgSendQueue = new MsgSendQueue();
			item.copyTo(msgSendQueue, true);
			
			this.doSendMsg(msgSendQueue, true);
		}
	}
	
	
	
	
	

	@Override
	protected void onCreateTodos(Todo[] todos) throws Throwable {

		for (Todo todo : todos) {
			
			//需要判断任务状态
			if(StringUtils.hasLength(todo.getTodoState())
					&& todo.getTodoState().equals(TodoState.COMPLETED.getValue())) {
				//存储到历史任务
				TodoHisDTO todoDTO = new TodoHisDTO();
				todo.copyTo(todoDTO);

				EBSXSystemRuntime.getInstance().getTodoHisService().create(todoDTO);

				todoDTO.copyTo(todo, true);
			}
			else {
				TodoDTO todoDTO = new TodoDTO();
				todo.copyTo(todoDTO);

				EBSXSystemRuntime.getInstance().getTodoService().create(todoDTO);

				todoDTO.copyTo(todo, true);
			}
		}
	}

	@Override
	protected Todo onMarkReadTodo(String strTodoId) throws Throwable {
		//EBSXSystemRuntime.getInstance().getTodoService().markRead(dto);
		return super.onMarkReadTodo(strTodoId);
	}

	@Override
	protected Todo onMarkReadTodo(String strTaskType, String strTaskId) throws Throwable {
		// TODO Auto-generated method stub
		return super.onMarkReadTodo(strTaskType, strTaskId);
	}

	@Override
	protected Todo onCompleteTodo(String strTaskType, String strTaskId) throws Throwable {
		// TODO Auto-generated method stub
		return super.onCompleteTodo(strTaskType, strTaskId);
	}

	@Override
	protected Todo onCancelTodo(String strTaskType, String strTaskId) throws Throwable {
		// TODO Auto-generated method stub
		return super.onCancelTodo(strTaskType, strTaskId);
	}

	@Override
	protected Todo onDelegateTodo(String strTaskType, String strTaskId, String strTargetUserId) throws Throwable {
		// TODO Auto-generated method stub
		return super.onDelegateTodo(strTaskType, strTaskId, strTargetUserId);
	}

	@Override
	protected Todo onResolveTodo(String strTaskType, String strTaskId) throws Throwable {
		// TODO Auto-generated method stub
		return super.onResolveTodo(strTaskType, strTaskId);
	}

	@Override
	protected Todo onReassignTodo(String strTaskType, String strTaskId, String strTargetUserId) throws Throwable {
		// TODO Auto-generated method stub
		return super.onReassignTodo(strTaskType, strTaskId, strTargetUserId);
	}

	@Override
	protected Page<Todo> onFetchTodos(String strTaskType, Map<String, Object> conds) throws Throwable {
		
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		
		//补充当前类型及用户
		ISearchContextDTO iSearchContextDTO = EBSXSystemRuntime.getInstance().getTodoService().createSearchContextDTO(conds);
		iSearchContextDTO.eq(ITodoService.FIELD_TODOTYPE, strTaskType);
		iSearchContextDTO.set("n_todosubtype_eq", StaticDict.TodoSubType.TODO.toString());
		if(!ObjectUtils.isEmpty(iEmployeeContext.getDcsystemid())) {
			iSearchContextDTO.eq(ITodoService.FIELD_DCSYSTEMID, iEmployeeContext.getDcsystemid());
		}
		
		
		Page<TodoDTO> page = EBSXSystemRuntime.getInstance().getTodoService().fetchCurUser(iSearchContextDTO);
		List<Todo> list = new ArrayList<Todo>();
		if(page != null && !ObjectUtils.isEmpty(page.getContent())) {
			for(TodoDTO dto : page.getContent()) {
				Todo todo = new Todo();
				dto.copyTo(todo, true);
				list.add(todo);
			}
		}
		
		if(page != null) {
			return new PageImpl<Todo>(list, page.getPageable(), page.getTotalElements());
		}
		else {
			return new PageImpl<Todo>(list);
		}
		
		
	}
	
	@Override
	protected void onCreateCarbonCopies(CarbonCopy[] todos) throws Throwable {
		// TODO Auto-generated method stub
		super.onCreateCarbonCopies(todos);
	}

	@Override
	protected CarbonCopy onMarkReadCarbonCopy(String strCarbonCopyId) throws Throwable {
		// TODO Auto-generated method stub
		return super.onMarkReadCarbonCopy(strCarbonCopyId);
	}

	@Override
	protected CarbonCopy onMarkReadCarbonCopy(String strTaskType, String strTaskId) throws Throwable {
		// TODO Auto-generated method stub
		return super.onMarkReadCarbonCopy(strTaskType, strTaskId);
	}

	@Override
	protected void onSendMessages(MsgSendQueue[] msgSendQueues) throws Throwable {
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		
		List<MsgSendQueueDTO> list = new ArrayList<MsgSendQueueDTO>();
		for(MsgSendQueue msgSendQueue : msgSendQueues) {
			MsgSendQueueDTO msgSendQueueDTO = new MsgSendQueueDTO();
			msgSendQueueDTO.reload(msgSendQueue, true);
			if(StringUtils.hasLength(msgSendQueueDTO.getMsgSendQueueId())) {
				msgSendQueueDTO.setMsgSendQueueId(KeyValueUtils.genUniqueId(iEmployeeContext.getDcsystemid(), msgSendQueueDTO.getMsgSendQueueId()));
				//考虑备份源主键
			}
			else {
				msgSendQueueDTO.setMsgSendQueueId(KeyValueUtils.genUniqueId());
			}
			msgSendQueueDTO.setIsError(0);
			msgSendQueueDTO.setIsSend(0);
			msgSendQueueDTO.setDCSystemId(iEmployeeContext.getDcsystemid());
			msgSendQueueDTO.setSystemId(iEmployeeContext.getSystemid());
			list.add(msgSendQueueDTO);
		}
		
		IMsgSendQueueService msgSendQueueService = EBSXSystemRuntime.getInstance().getMsgSendQueueService();
		msgSendQueueService.rawCreate(list, false);
		
		
		for(MsgSendQueueDTO item : list) {
			if(item.getPlanSendTime() != null) {
				continue;
			}
			MsgSendQueue msgSendQueue = new MsgSendQueue();
			item.copyTo(msgSendQueue, true);
			msgSendQueue.set("srfdcid", iEmployeeContext.getTenant());
			this.doSendMsg(msgSendQueue, false);
		}
	}
	
	@Override
	protected void doSendMsgReal(MsgSendQueue msgSendQueue) {
		
		
		
		super.doSendMsgReal(msgSendQueue);
		
		String strDCId = (String)msgSendQueue.get("srfdcid");
		String strDCSystemId = (String)msgSendQueue.get("dcsystemid");
		String strSystemId = (String)msgSendQueue.get("systemid");
		
		Employee employee = new Employee();
		employee.setSrfdcid(strDCId);
		employee.setUserId("SYSTEM");
		employee.setUserName("通知作业");
		employee.setPersonName("通知作业");
		employee.setDCSystemId(strDCSystemId);
		
		IEmployeeContext lastEmployeeContext = EmployeeContext.getCurrent();
		
		IEmployeeContext iEmployeeContext = new EmployeeContext(employee, null, strSystemId);
		EmployeeContext.setCurrent(iEmployeeContext);
		try {
			//更新日志或是备份
			int nError = DataTypeUtils.getIntegerValue(msgSendQueue.getIsError(), 0);
		//	if(nError == 0) {
			if(true) {
				//转移至历史表
				MsgSendQueueHisDTO msgSendQueueHisDTO = new MsgSendQueueHisDTO();
				msgSendQueueHisDTO.reload(msgSendQueue, true);
				msgSendQueueHisDTO.setMsgSendQueueHisId(KeyValueUtils.genUniqueId());
				msgSendQueueHisDTO.setMsgSendQueueHisName(msgSendQueue.getMsgSendQueueName());
				EBSXSystemRuntime.getInstance().getMsgSendQueueHisService().rawCreate(Arrays.asList(msgSendQueueHisDTO), false);
				
				EBSXSystemRuntime.getInstance().getMsgSendQueueService().rawRemove(Arrays.asList(msgSendQueue.getMsgSendQueueId()));
			}
			else {
				//错误
				MsgSendQueueDTO msgSendQueueDTO = new MsgSendQueueDTO();
				msgSendQueueDTO.setMsgSendQueueId(msgSendQueue.getMsgSendQueueId());
				msgSendQueueDTO.setProcessTime(msgSendQueue.getProcessTime());
				msgSendQueueDTO.setIsError(msgSendQueue.getIsError());
				msgSendQueueDTO.setIsSend(msgSendQueue.getIsSend());
				msgSendQueueDTO.setErrorInfo(msgSendQueue.getErrorInfo());
				EBSXSystemRuntime.getInstance().getMsgSendQueueService().rawUpdate(Arrays.asList(msgSendQueueDTO), false);
			}
		}
		catch(Throwable ex) {
			log.error(String.format("[%1$s]发送消息发生异常，%2$s", this.getLogicName(), ex.getMessage()), ex);
			this.getSystemRuntime().log(LogLevels.ERROR, this.getLogCat(), String.format("[%1$s]发送消息发生异常，%2$s", this.getLogicName(), ex.getMessage()), null);
		}
		finally {
			EmployeeContext.setCurrent(lastEmployeeContext);
		}
		
		
	}
	
	//protected boolean isAlwaysPutInHis
	
	

	@Override
	protected MsgSendQueue onSendMessage(String strMsgId) throws Throwable {
		// TODO Auto-generated method stub
		return super.onSendMessage(strMsgId);
	}

	@Override
	protected Collection<MsgSendQueue> onGetMessages(String[] ids) throws Throwable {
		// TODO Auto-generated method stub
		return super.onGetMessages(ids);
	}

}
