package net.ibizsys.runtime.res;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.Assert;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.res.IPSSysDataSyncAgent;
import net.ibizsys.runtime.ISystemRuntimeBaseContext;
import net.ibizsys.runtime.ISystemRuntimeException;
import net.ibizsys.runtime.ISystemRuntimeSetting;
import net.ibizsys.runtime.SystemModelRuntimeBase;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.dataentity.datasync.IDEDataSyncInRuntime;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.domain.DataSyncIn;
import net.ibizsys.runtime.util.domain.DataSyncOut;

/**
 * 系统数据同步代理运行时基类
 * 
 * @author lionlau
 *
 */
public abstract class SysDataSyncAgentRuntimeBase extends SystemModelRuntimeBase implements ISysDataSyncAgentRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysDataSyncAgentRuntimeBase.class);

	private IPSSysDataSyncAgent iPSSysDataSyncAgent = null;
	private List<IDEDataSyncInRuntime> deDataSyncInRuntimeList = null;
	private boolean bRawDataMode = false;
	
	
	
	@Override
	public void init(ISystemRuntimeBaseContext iSystemRuntimeBaseContext, IPSSysDataSyncAgent iPSSysDataSyncAgent) throws Exception {
		this.setSystemRuntimeBaseContext(iSystemRuntimeBaseContext);
		this.iPSSysDataSyncAgent = iPSSysDataSyncAgent;
		if (SysDataSyncAgentDirs.IN.equals(iPSSysDataSyncAgent.getSyncDir()) || SysDataSyncAgentDirs.INOUT.equals(iPSSysDataSyncAgent.getSyncDir())) {
			deDataSyncInRuntimeList = new ArrayList<IDEDataSyncInRuntime>();
		}
		this.setRawDataMode(this.getPSSysDataSyncAgent().isRawDataMode());
		this.onInit();
	}

	@Override
	protected void onInit() throws Exception {
		
		
		
		super.onInit();
	}
	
	@Override
	public IPSSysDataSyncAgent getPSSysDataSyncAgent() {
		return this.iPSSysDataSyncAgent;
	}

	@Override
	public String getId() {
		return getPSSysDataSyncAgent().getDynaModelFilePath();
	}

	@Override
	public String getName() {
		return getPSSysDataSyncAgent().getName();
	}
	
	public ISystemRuntimeSetting getSystemRuntimeSetting() {
		if(this.getSystemRuntime() != null) {
			return this.getSystemRuntime().getSystemRuntimeSetting();
		}
		return null;
	}

	@Override
	public String getAgentType() {
		return this.getPSSysDataSyncAgent().getAgentType();
	}
	
	
	
	
	
	@Override
	public void send(DataSyncOut[] dataSyncOuts) {
		
		if (dataSyncOuts == null || dataSyncOuts.length == 0) {
			return;
		}
		
		try {
			if(!this.isRawDataMode()) {
				String strSendData = null;
				try {
					if (dataSyncOuts.length == 1) {
						strSendData = (String)this.serializeSendData(dataSyncOuts[0]);
					} else {
						strSendData = (String)this.serializeSendData(dataSyncOuts);
					}
				} catch (Throwable ex) {
					throw new Exception(String.format("序列化同步数据异常，%1$s", ex.getMessage()), ex);
				}

				this.onSend(getSendData(strSendData, dataSyncOuts), dataSyncOuts);
			}
			else {
				for(DataSyncOut dataSyncOut: dataSyncOuts) {
					this.onSend(dataSyncOut.getData(), new DataSyncOut[] {dataSyncOut});
				}
			}

		} catch (Throwable ex) {
			if(ex instanceof ISystemRuntimeException) {
				throw (RuntimeException)ex;
			}
			
			log.error(String.format("发送数据发生异常，%1$s", ex.getMessage()), ex);
			throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("发送数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected String getSendData(String strSendData, DataSyncOut[] dataSyncOuts) throws Throwable {
		ObjectNode packageNode = JsonUtils.createObjectNode();
		packageNode.put("agent", this.getPSSysDataSyncAgent().getCodeName());
		packageNode.put("data", strSendData);
		this.onFillSendData(packageNode, strSendData, dataSyncOuts);
		return packageNode.toString();
	}
	
	protected void onFillSendData(ObjectNode packageNode, String strSendData, DataSyncOut[] dataSyncOuts) throws Throwable {
		
	}
	
	/**
	 * 获取发送数据
	 * @param data
	 * @return
	 * @throws Throwable
	 */
	protected String serializeSendData(Object data) throws Throwable{
		return (String)this.getSystemRuntime().serialize(data);
	}

	protected void onSend(String strSendData, DataSyncOut[] dataSyncOuts) throws Throwable{
		throw new Exception("没有实现");
	}

	@Override
	public void recv(DataSyncIn[] dataSyncIns) {
		
		final List<IDEDataSyncInRuntime> deDataSyncInRuntimeList = this.deDataSyncInRuntimeList;
		if (deDataSyncInRuntimeList == null) {
			return;
		}

		for (IDEDataSyncInRuntime iDEDataSyncInRuntime : deDataSyncInRuntimeList) {
			try {
				iDEDataSyncInRuntime.recv(dataSyncIns);
			} catch (RuntimeException ex) {
				log.error(String.format("实体数据同步[%1$s]处理接收数据发生异常，%2$s", iDEDataSyncInRuntime.getName(), ex.getMessage()), ex);
			}
		}
	}

	@Override
	public synchronized void registerDEDataSyncInRuntime(IDEDataSyncInRuntime iDEDataSyncInRuntime) {
		Assert.notNull(iDEDataSyncInRuntime, "传入实体数据同步输入运行时对象无效");
		if (this.deDataSyncInRuntimeList == null) {
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("系统数据同步代理[%1$s]不是输入代理", this.getPSSysDataSyncAgent().getName()));
		}
		
		List<IDEDataSyncInRuntime> deDataSyncInRuntimeList = new ArrayList<IDEDataSyncInRuntime>();
		deDataSyncInRuntimeList.addAll(this.deDataSyncInRuntimeList);
		if(!deDataSyncInRuntimeList.contains(iDEDataSyncInRuntime)) {
			deDataSyncInRuntimeList.add(iDEDataSyncInRuntime);
		}
		else {
			log.warn(String.format("忽略注册重复的实体数据同步代理[%1$s]", iDEDataSyncInRuntime.getName()));
		}
		
		this.deDataSyncInRuntimeList = deDataSyncInRuntimeList;
	}
	
	

	@Override
	public synchronized void unregisterDEDataSyncInRuntime(IDEDataSyncInRuntime iDEDataSyncInRuntime) {
		Assert.notNull(iDEDataSyncInRuntime, "传入实体数据同步输入运行时对象无效");
		if (this.deDataSyncInRuntimeList == null) {
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("系统数据同步代理[%1$s]不是输入代理", this.getPSSysDataSyncAgent().getName()));
		}
		
		List<IDEDataSyncInRuntime> deDataSyncInRuntimeList = new ArrayList<IDEDataSyncInRuntime>();
		deDataSyncInRuntimeList.addAll(this.deDataSyncInRuntimeList);
		if(!deDataSyncInRuntimeList.remove(iDEDataSyncInRuntime)) {
			log.warn(String.format("忽略注销实体数据同步代理[%1$s]", iDEDataSyncInRuntime.getName()));
		}
		
		this.deDataSyncInRuntimeList = deDataSyncInRuntimeList;
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSSysDataSyncAgent();
	}

	protected List<IDEDataSyncInRuntime> getDEDataSyncInRuntimeList() {
		return this.deDataSyncInRuntimeList;
	}

	@Override
	public boolean isInternalAgent() {
		return false;
	}

	@Override
	public boolean isRawDataMode() {
		return this.bRawDataMode;
	}
	
	protected void setRawDataMode(boolean bRawDataMode) {
		this.bRawDataMode = bRawDataMode;
	}
	
	
	protected String getAgentParam(String strName, String strDefault) {
		if(this.getPSSysDataSyncAgent().getAgentParams() != null) {
			JsonNode jsonNode = this.getPSSysDataSyncAgent().getAgentParams().get(strName);
			if(jsonNode != null) {
				return jsonNode.asText(strDefault);
			}
		}
		return strDefault;
	}
	 
}
