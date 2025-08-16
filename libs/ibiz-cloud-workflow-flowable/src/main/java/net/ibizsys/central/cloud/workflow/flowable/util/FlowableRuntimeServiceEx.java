package net.ibizsys.central.cloud.workflow.flowable.util;

import java.util.List;

import org.apache.commons.logging.LogFactory;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.runtime.Execution;
import org.springframework.util.ObjectUtils;

public class FlowableRuntimeServiceEx implements IFlowableRuntimeServiceEx {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(FlowableRuntimeServiceEx.class);
	
	private RuntimeService runtimeService = null;
	
	public FlowableRuntimeServiceEx(RuntimeService runtimeService) {
		this.setRuntimeService(runtimeService);
	}
	
	protected RuntimeService getRuntimeService() {
		if(this.runtimeService == null) {
			throw new RuntimeException("引擎运行时服务对象无效");
		}
		return this.runtimeService;
	}
	
	protected void setRuntimeService(RuntimeService runtimeService) {
		this.runtimeService = runtimeService;
	}
	
	public void markReadTask(String strTaskId, String strUserId) throws Throwable{
		//String strSql = String.format("UPDATE ACT_RU_IDENTITYLINK  T  SET T.SCOPE_TYPE_= 'READ'  WHERE  T.TASK_ID_ = '%1$s'  AND T.USER_ID_= '%2$s'", strTaskId, strUserId);
		String strSql = String.format("UPDATE ACT_RU_IDENTITYLINK  T  SET T.SCOPE_TYPE_= 'READ'  WHERE  T.TASK_ID_ = #{taskid}  AND T.USER_ID_= #{userid}");
		getRuntimeService().createNativeExecutionQuery().sql(strSql).parameter("taskid", strTaskId).parameter("userid", strUserId).singleResult();	
	}
	
	public void sendCopyTask(String strScope, String strTaskId, String strUserId) throws Throwable{
		//String strSql = String.format("UPDATE ACT_RU_IDENTITYLINK  T  SET T.SCOPE_ID_= '%1$s'  WHERE  T.TASK_ID_ = '%2$s'  AND T.USER_ID_= '%3$s' and TYPE_='sendcopy'", strScope, strTaskId, strUserId);
		String strSql = String.format("UPDATE ACT_RU_IDENTITYLINK  T  SET T.SCOPE_ID_= #{scopeid}  WHERE  T.TASK_ID_ = #{taskid}  AND T.USER_ID_= #{userid} and TYPE_='sendcopy'");
		getRuntimeService().createNativeExecutionQuery().sql(strSql).parameter("scopeid", strScope).parameter("taskid", strTaskId).parameter("userid", strUserId).singleResult();		
	}
	
	public void reassignTask(String strOriginUserId, String strTaskId, String strUserId) throws Throwable{
		// UPDATE ACT_RU_IDENTITYLINK  T  SET T.USER_ID_=#{et.userid}  WHERE  T.TASK_ID_ = #{et.taskid}  AND T.USER_ID_=#{et.orignuserid} and TYPE_='candidate'
	//	String strSql = String.format(" UPDATE ACT_RU_IDENTITYLINK  T  SET T.USER_ID_= '%1$s'  WHERE  T.TASK_ID_ = '%2$s'  AND T.USER_ID_= '%3$s' and TYPE_='candidate'", strUserId, strTaskId, strOriginUserId);
		String strSql = String.format(" UPDATE ACT_RU_IDENTITYLINK  T  SET T.USER_ID_= #{userid}  WHERE  T.TASK_ID_ = #{taskid}  AND T.USER_ID_= #{originuserid} and TYPE_='candidate'", strUserId, strTaskId, strOriginUserId);
		Object objRet = getRuntimeService().createNativeExecutionQuery().sql(strSql).parameter("userid", strUserId).parameter("taskid", strTaskId).parameter("originuserid", strOriginUserId).singleResult();
		//log.debug(String.format("reassignTask(%1$s, %2$s, %3$s) ==> %4$s", strOriginUserId, strTaskId, strUserId, objRet));
	}

	public List<?> searchHistoryTask(String strCategory, String strUserId) throws Throwable{
		String strSql = String.format(" SELECT\r\n" + 
				"        t1.PROC_DEF_ID_,\r\n" + 
				"        t1.TASK_DEF_KEY_,\r\n" + 
				"        T1.PROC_INST_ID_,\r\n" + 
				"        T1.EXECUTION_ID_\r\n" + 
				"    FROM\r\n" + 
				"        act_hi_taskinst t1\r\n" + 
				"    INNER JOIN act_hi_identitylink t2 ON t1.ID_ = t2.TASK_ID_\r\n" + 
				"    INNER JOIN act_hi_procinst t3 ON t1.PROC_INST_ID_ = t3.ID_\r\n" + 
				"    WHERE\r\n" + 
				"        t1.CATEGORY_ LIKE concat ('%%', #{category} ,'%%')\r\n" + 
				"    AND  (t2.USER_ID_ = '%2$s'  or  t3.START_USER_ID_ = #{userid} ) ", strCategory, strUserId);
		return getRuntimeService().createNativeExecutionQuery().sql(strSql).parameter("category", strCategory).parameter("userid", strUserId).list();
	}
	
	public Execution selectOneHistoryTask(String strCategory, String strUserId) throws Throwable{
		String strSql = String.format(" SELECT\r\n" + 
				"        t1.PROC_DEF_ID_,\r\n" + 
				"        t1.TASK_DEF_KEY_,\r\n" + 
				"        T1.PROC_INST_ID_,\r\n" + 
				"        T1.EXECUTION_ID_\r\n" + 
				"    FROM\r\n" + 
				"        act_hi_taskinst t1\r\n" + 
				"    INNER JOIN act_hi_identitylink t2 ON t1.ID_ = t2.TASK_ID_\r\n" + 
				"    INNER JOIN act_hi_procinst t3 ON t1.PROC_INST_ID_ = t3.ID_\r\n" + 
				"    WHERE\r\n" + 
				"        t1.CATEGORY_ LIKE concat ('%%', #{category} ,'%%')\r\n" + 
				"    AND  (t2.USER_ID_ = '%2$s'  or  t3.START_USER_ID_ = #{userid} ) ", strCategory, strUserId);
		List<Execution> list = getRuntimeService().createNativeExecutionQuery().sql(strSql).parameter("category", strCategory).parameter("userid", strUserId).listPage(0, 1);
		if(ObjectUtils.isEmpty(list)) {
			return null;
		}
		return list.get(0);
	}
	
	@Override
	public void delegateTask(String strOriginUserId, String strTaskId, String strUserId) throws Throwable {
		
	}
	
	
	@Override
	public void resolveTask(String strTaskId, String strUserId) throws Throwable {
		
	}
}
