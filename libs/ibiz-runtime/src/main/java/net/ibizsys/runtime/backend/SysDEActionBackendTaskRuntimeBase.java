package net.ibizsys.runtime.backend;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.data.domain.Page;

import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.ISearchContextBase;

/**
 * 系统实体行为后台任务运行时对象
 * @author lionlau
 *
 */
public abstract class SysDEActionBackendTaskRuntimeBase extends SysBackendTaskRuntimeBase{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysDEActionBackendTaskRuntimeBase.class);
	
	
	private IPSDataEntity iPSDataEntity = null;
	private IPSDEAction iPSDEAction = null;
	private IPSDEDataSet iPSDEDataSet = null;
	
	@Override
	protected void onInit() throws Exception {

		this.iPSDataEntity = this.getPSSysBackService().getPSDataEntity();
		this.iPSDEAction = this.getPSSysBackService().getPSDEAction();
		this.iPSDEDataSet = this.getPSSysBackService().getPSDEDataSet();
		
		if(this.getPSDataEntity() == null) {
			throw new SystemRuntimeException(this.getSystemRuntime(), String.format("后台作业[%1$s]没有指定调用实体对象",this.getName()));
		}

		if(this.getPSDEAction() == null) {
			throw new SystemRuntimeException(this.getSystemRuntime(), String.format("后台作业[%1$s]没有指定调用实体行为",this.getName()));
		}
		
		super.onInit();
	}
	
	@Override
	protected Object onExecute(String strDynaInstId, String strParam, ProceedingJoinPoint joinPoint) throws Throwable {
		
//		JsonNode jsonNode = MAPPER.readTree(strParam);
//		ObjectNode packageNode = (ObjectNode)jsonNode;
//		
//		String strAction = null;
//		if(packageNode.has("action")) {
//			strAction = packageNode.get("action").asText();
//		}
//		
//		String strDEName = null;
//		if(packageNode.has("dEName")) {
//			strDEName = packageNode.get("dEName").asText();
//		}
//		
//		String strData = null;
//		if(packageNode.has("data")) {
//			strData = packageNode.get("data").asText();
//		}
//		
//		if(!StringUtils.hasLength(strAction)
//				|| !StringUtils.hasLength(strDEName)
//				|| !StringUtils.hasLength(strData)) {
//			log.error(String.format("工作流回调传入参数无效，%1$s",strParam));
//			return joinPoint.proceed();
//		}
		
		IDataEntityRuntime iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(this.getPSDataEntity().getId());
		if(this.getPSDEDataSet() != null) {
			ISearchContextBase iSearchContextBase = iDataEntityRuntime.createSearchContext();
			//未来考虑从任务参数填充条件
			Page<? extends IEntityBase> page = iDataEntityRuntime.searchDataSet(this.getPSDEDataSet(), iSearchContextBase);
			if(page != null && page.getNumberOfElements() > 0) {
				for(IEntityBase iEntityBase : page.getContent()) {
					iDataEntityRuntime.executeAction(this.getPSDEAction().getName(), this.getPSDEAction(), new Object[] {iEntityBase});
				}
			}
		}
		else {
			IEntityBase iEntityBase = iDataEntityRuntime.createEntity();
			//未来考虑从任务参数填充属性
			iDataEntityRuntime.executeAction(this.getPSDEAction().getName(), this.getPSDEAction(), new Object[] {iEntityBase});
		}
		
		
		if(joinPoint != null) {
			return joinPoint.proceed();
		}
		return null;
	}
	
	
	protected IPSDataEntity getPSDataEntity() {
		return this.iPSDataEntity;
	}
	
	protected IPSDEAction getPSDEAction() {
		return this.iPSDEAction;
	}
	
	protected IPSDEDataSet getPSDEDataSet() {
		return this.iPSDEDataSet;
	}
}
