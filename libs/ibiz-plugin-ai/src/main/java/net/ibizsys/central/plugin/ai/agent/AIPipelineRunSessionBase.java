package net.ibizsys.central.plugin.ai.agent;

import java.util.HashMap;
import java.util.Map;

import org.springframework.util.Assert;

import net.ibizsys.runtime.util.IAction;

public abstract class AIPipelineRunSessionBase implements IAIPipelineRunSession{

	private Map<String, Object> params = new HashMap<String, Object>();
	
	private static ThreadLocal<IAIPipelineRunSession> _current = new ThreadLocal<IAIPipelineRunSession>();
	
	public static IAIPipelineRunSession getCurrent() {
		return _current.get();
	}
	
	public static IAIPipelineRunSession getCurrentMust() throws Throwable {
		IAIPipelineRunSession iPipelineRunSession = getCurrent();
		if(iPipelineRunSession!=null) {
			return iPipelineRunSession;
		}
		throw new Exception("未指定当前运行会话");
	}
	
	public static void setCurrent(IAIPipelineRunSession iPipelineRunSession) {
		_current.set(iPipelineRunSession);
	}
	
	public AIPipelineRunSessionBase(Map<String, Object> params) {
		if(params!=null) {
			for(java.util.Map.Entry<String, Object> entry : params.entrySet()) {
				this.setParam(entry.getKey(), entry.getValue());
			}
		}
	}
	

	@Override
	public void setParam(String strKey, Object value) {
		Assert.hasLength(strKey, "未传入键名");
		params.put(strKey.toUpperCase(), value);
	}

	@Override
	public Object getParam(String strKey) {
		Assert.hasLength(strKey, "未传入键名");
		
		Object value = this.params.get(strKey.toUpperCase());
		if(value instanceof IAction) {
			try {
				return ((IAction)value).execute(new Object[] {this});
			} catch (Throwable e) {
				throw new RuntimeException(e);
			}
		}
		return value;
	}

	@Override
	public Object resetParam(String strKey) {
		Assert.hasLength(strKey, "未传入键名");
		return this.params.remove(strKey.toUpperCase());
	}
	
	
	
	
}
