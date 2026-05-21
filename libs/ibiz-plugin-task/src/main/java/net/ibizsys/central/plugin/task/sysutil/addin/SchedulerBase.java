package net.ibizsys.central.plugin.task.sysutil.addin;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import net.ibizsys.central.plugin.task.addin.IScheduler;
import net.ibizsys.runtime.util.JsonUtils;

public abstract class SchedulerBase extends SysTaskUtilRTAddinBase implements IScheduler {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SchedulerBase.class);
	private boolean bStarted = false;
	private Map<Object, String> lastItemMap = new LinkedHashMap<Object, String>();
	
	@Override
	public void start() throws Exception {
		if(this.bStarted) {
			log.warn("任务调度器已经启动");
			return;
		}
		this.onStart();
		this.bStarted = true;
	}
	
	protected void onStart() throws Exception{
		
	}
	
	@Override
	public void stop() throws Exception{
		if(!this.bStarted) {
			return;
		}
		this.bStarted = false;
		this.onStop();
	}
	
	protected void onStop() throws Exception{
		
	}
	

	
	@Override
	public String getType() {
		return (String) this.getAddinData();
	}

	@Override
	public synchronized void refreshSchedules(List<Map> list) throws Throwable{
		Map<Object, String> lastItemMap2 = new LinkedHashMap<Object, String>();
		lastItemMap2.putAll(this.lastItemMap);
		for(Map item : list) {
			Object key = item.get(SCHEDULEPARAM_ID);
			String data = JsonUtils.toString(item);
			String lastData = lastItemMap2.remove(key);
			if(data.equals(lastData)) {
				//相同
				continue;
			}
			if(StringUtils.hasLength(lastData)) {
				//已存在，需要移除
				Map<String, Object> lastItem = JsonUtils.asMap(lastData);
				try {
					this.doStopSchedule(lastItem);
					this.lastItemMap.remove(key);
				}
				catch (Throwable ex) {
					log.error(String.format("停止计划[%1$s]发生异常，%2$s", lastItem.get(SCHEDULEPARAM_NAME), ex.getMessage()), ex);
					continue;
				}
			}
			//新增
			try {
				this.doStartSchedule(item);
				this.lastItemMap.put(key, data);
			}
			catch (Throwable ex) {
				log.error(String.format("启动计划[%1$s]发生异常，%2$s", item.get(SCHEDULEPARAM_NAME), ex.getMessage()), ex);
				continue;
			}
		}
		
		for(java.util.Map.Entry<Object, String> entry : lastItemMap2.entrySet()) {
			Map<String, Object> lastItem = JsonUtils.asMap(entry.getValue());
			try {
				this.doStopSchedule(lastItem);
				this.lastItemMap.remove(entry.getKey());
			}
			catch (Throwable ex) {
				log.error(String.format("停止计划[%1$s]发生异常，%2$s", lastItem.get(SCHEDULEPARAM_NAME), ex.getMessage()), ex);
				continue;
			}
		}
	}
	
	abstract protected void doStartSchedule(Map<String, Object> item)throws Throwable;
	
	abstract protected void doStopSchedule(Map<String, Object> item)throws Throwable;
}