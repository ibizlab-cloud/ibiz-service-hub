package net.ibizsys.runtime.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.runtime.IModelRuntime;

/**
 * 行为会话日志
 * @author lionlau
 *
 */
public class ActionSessionLog implements IActionSessionLog{

	private String strDEName = null;
	private String strAction = null;
	private String strInfo = null;
	
	/**
	 * 行为模式
	 */
	private String strActionMode = null;
	
	/**
	 * 逻辑名称
	 */
	private String strLogicName = null;
	private long nBeginTime = -1;
	private long nEndTime = -1;
	private boolean bError = false;
	private List<ActionSessionLog> actionSessionLogList = null;
	private ActionSessionLog parent = null;
	private IModelRuntime iModelRuntime = null;
	private Throwable cause = null;
	
	
	public ActionSessionLog(ActionSessionLog parent) {
		this.parent = parent;
	}
	
	@Override
	public ActionSessionLog getParent() {
		return this.parent;
	}
	
	@Override
	public ActionSessionLog getRoot() {
		ActionSessionLog curActionSessionLog = this;
		while(curActionSessionLog != null) {
			if(curActionSessionLog.getParent() != null) {
				curActionSessionLog = curActionSessionLog.getParent();
			}
			else {
				return curActionSessionLog;
			}
		}
		return null;
	}
	
	@Override
	public String getDEName() {
		return strDEName;
	}
	
	/**
	 * 设置实体名称
	 * @param strDEName
	 */
	public void setDEName(String strDEName) {
		this.strDEName = strDEName;
	}
	

	@Override
	public String getAction() {
		return strAction;
	}
	
	/**
	 * 设置行为名称
	 * @param strAction
	 */
	public void setAction(String strAction) {
		this.strAction = strAction;
	}
	
	
	
	
	public String getActionMode() {
		return strActionMode;
	}

	public void setActionMode(String strActionMode) {
		this.strActionMode = strActionMode;
	}

	public String getLogicName() {
		return strLogicName;
	}

	public void setLogicName(String strLogicName) {
		this.strLogicName = strLogicName;
	}

	@Override
	public String getInfo() {
		return strInfo;
	}
	
	/**
	 * 设置日志信息
	 * @param strInfo
	 */
	public void setInfo(String strInfo) {
		this.strInfo = strInfo;
	}
	
	@Override
	public long getBeginTime() {
		return nBeginTime;
	}
	
	/**
	 * 设置开始时间
	 * @param nBeginTime
	 */
	public void setBeginTime(long nBeginTime) {
		this.nBeginTime = nBeginTime;
	}
	
	@Override
	public long getEndTime() {
		return nEndTime;
	}
	
	/**
	 * 设置结束时间
	 * @param nEndTime
	 */
	public void setEndTime(long nEndTime) {
		this.nEndTime = nEndTime;
	}
	
	
	
	
	
	/**
	 * 开始子操作
	 * @param strDEName
	 * @param strAction
	 * @return
	 */
	public ActionSessionLog beginSubAction(String strDEName, String strAction) {
		
		if(this.actionSessionLogList == null) {
			this.actionSessionLogList = new ArrayList<ActionSessionLog>();
		}
		
		ActionSessionLog actionSessionLog = new ActionSessionLog(this);
		actionSessionLog.setDEName(strDEName);
		actionSessionLog.setAction(strAction);
		actionSessionLog.setBeginTime(System.currentTimeMillis());
		this.actionSessionLogList.add(actionSessionLog);
		
		return actionSessionLog;
	}
	
	/**
	 * 开始子操作
	 * @param iModelRuntime
	 * @param strAction
	 * @return
	 */
	public ActionSessionLog beginSubAction(IModelRuntime iModelRuntime, String strAction) {
		
		if(this.actionSessionLogList == null) {
			this.actionSessionLogList = new ArrayList<ActionSessionLog>();
		}
		
		ActionSessionLog actionSessionLog = new ActionSessionLog(this);
		
		if(iModelRuntime != null) {
			actionSessionLog.setModelRuntime(iModelRuntime);
			actionSessionLog.setDEName(iModelRuntime.getName());
		}
		
		actionSessionLog.setAction(strAction);
		actionSessionLog.setBeginTime(System.currentTimeMillis());
		this.actionSessionLogList.add(actionSessionLog);
		
		return actionSessionLog;
	}
	
	/**
	 * 结束操作
	 * @param strInfo
	 * @return
	 */
	public ActionSessionLog endAction(String strInfo) {
//		if(this.getEndTime() != -1) {
//			throw new RuntimeException(String.format("行为[%1$s][%2$s]已结束",this.getDEName(),this.getAction()));
//		}
//		this.setInfo(strInfo);
//		this.setEndTime(System.currentTimeMillis());
//		return this.getParent();
		return this.endAction(strInfo, false, null);
	}
	
	
	/**
	 * 结束操作
	 * @param strInfo
	 * @param bError
	 * @return
	 */
	public ActionSessionLog endAction(String strInfo, boolean bError) {
		return this.endAction(strInfo, bError, null);
	}
	
	/**
	 * 结束操作
	 * @param strInfo
	 * @param bError 是否错误
	 * @param throwable 错误原因
	 * @return
	 */
	public ActionSessionLog endAction(String strInfo, boolean bError, Throwable cause) {
		if(this.getEndTime() != -1) {
			throw new RuntimeException(String.format("行为[%1$s][%2$s]已结束",this.getDEName(),this.getAction()));
		}
		
		this.setInfo(strInfo);
		this.setError(bError);
		this.setCause(cause);
		this.setEndTime(System.currentTimeMillis());
		return this.getParent();
	}
	

	@Override
	public long getTime() {
		return this.getEndTime() - this.getBeginTime();
	}
	
	 
	@Override
	public boolean isError() {
		return bError;
	}
	
	
	public void setError(boolean bError) {
		this.bError = bError;
	}

	
	@Override
	public IModelRuntime getModelRuntime() {
		return iModelRuntime;
	}

	public void setModelRuntime(IModelRuntime iModelRuntime) {
		this.iModelRuntime = iModelRuntime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		toString(sb, 0, this.getBeginTime());
		return sb.toString();
	}
	
	public void toString(StringBuilder sb,int nLevel,long nBeginTime) {
		for(int i =0; i<nLevel; i++) {
			sb.append("\t");
		}
		if(nLevel == 0) {
			sb.append(String.format("[%1$s][%2$s]耗时[%3$s]ms",this.getDEName(),this.getAction(),this.getTime()));
		}
		else {
			sb.append(String.format("[%1$s][%2$s]开始[+%3$s]结束[+%4$s]耗时[%5$s]ms",this.getDEName(),this.getAction(),this.getBeginTime() - nBeginTime, this.getEndTime() - nBeginTime,this.getTime()));
		}
		
		if(this.actionSessionLogList != null) {
			nLevel ++;
			for(ActionSessionLog childActionSessionLog : this.actionSessionLogList) {
				sb.append("\r\n");
				childActionSessionLog.toString(sb, nLevel, nBeginTime);
			}
		}
	}
	
	@Override
	public ObjectNode toObjectNode() {
		return toObjectNode(this.getBeginTime());
	}
	
	public ObjectNode toObjectNode(long nBeginTime) {
		ObjectNode objectNode = JsonUtils.createObjectNode();
		objectNode.put("dename", this.getDEName());
		objectNode.put("action", this.getAction());
		objectNode.put("begin", this.getBeginTime() - nBeginTime);
		objectNode.put("end", this.getEndTime() - nBeginTime);
		objectNode.put("duration", this.getTime());
		if(StringUtils.hasLength(this.getInfo())) {
			objectNode.put("info", this.getInfo());
		}
		else if(this.getCause() != null){
			objectNode.put("info", this.getCause().getMessage());
		}
		if(this.isError()) {
			objectNode.put("error", true);
		}
		
		if(StringUtils.hasLength(this.getLogicName())) {
			objectNode.put("logicname", this.getLogicName());
		}
		if(StringUtils.hasLength(this.getActionMode())) {
			objectNode.put("actionmode", this.getActionMode());
		}
		
		if(!ObjectUtils.isEmpty(this.actionSessionLogList)) {
			ArrayNode arrayNode = objectNode.putArray("actions");
			for(ActionSessionLog childActionSessionLog : this.actionSessionLogList) {
				ObjectNode childNode = childActionSessionLog.toObjectNode(nBeginTime);
				arrayNode.add(childNode);
			}
		}
		
		return objectNode;
	}
	
	
	@Override
	public String toString(boolean bJsonDetail) {
		if(bJsonDetail) {
			StringBuilder sb = new StringBuilder();
			sb.append(String.format("[%1$s][%2$s]耗时[%3$s]ms",this.getDEName(),this.getAction(),this.getTime()));
			sb.append("\r\n");
			sb.append(toObjectNode().toString());
			return sb.toString();
		}
		
		return this.toString();
	}
	
	
	@Override
	public Throwable getCause() {
		return this.cause;
	}
	
	
	public void setCause(Throwable cause) {
		this.cause = cause;
	}
	
}

