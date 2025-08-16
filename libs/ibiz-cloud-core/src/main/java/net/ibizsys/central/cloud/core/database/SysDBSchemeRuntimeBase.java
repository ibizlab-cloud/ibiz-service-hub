package net.ibizsys.central.cloud.core.database;

import java.util.ArrayDeque;
import java.util.Deque;

import org.springframework.util.ObjectUtils;

import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;


/**
 * @author lionlau
 *
 */
public abstract class SysDBSchemeRuntimeBase extends net.ibizsys.central.database.SysDBSchemeRuntimeBase implements ISysDBSchemeRuntime {

	private final ThreadLocal<Deque<String>> dataSourceTagHolder = new ThreadLocal<Deque<String>>() {
        @Override
        protected Deque<String> initialValue() {
            return new ArrayDeque<String>();
        }
    };
    
    private boolean bSelfUpdateSchema = false;
    
    /**
     * 获取默认数据源
     * @return
     */
    protected Object getDefaultDataSourceTag() {
    	return super.getDataSourceTag();
    }
    
    
    @Override
    public Object getDataSourceTag() {
    	Deque<String> deque = dataSourceTagHolder.get();
    	if(!ObjectUtils.isEmpty(deque)) {
    		return deque.peek();
    	}
    	return super.getDataSourceTag();
    }
    
    protected void pushDynaDataSourceTag(String strDataSourceTag) {
    	dataSourceTagHolder.get().push(strDataSourceTag);
    }
    
    protected void pollDynaDataSourceTag() {
    	dataSourceTagHolder.get().poll();
    }
    
    @Override
    protected void onPush() throws Throwable {
    	super.onPush();
    }
    
    @Override
    protected void onPoll() throws Throwable {
    	super.onPoll();
    }
    
    @Override
    protected void onInstall() throws Exception {
    	if(this.getSystemRuntime() instanceof IServiceSystemRuntime) {
    		IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime)this.getSystemRuntime();
    		if(iServiceSystemRuntime.isUpdateDBSchema() && this.isUpdateSchema()) {
    			ServiceHub.getInstance().updateDBSchema(this);
    			this.bSelfUpdateSchema = true;
    		}
    	}
    	super.onInstall();
    }


	@Override
	public boolean isSelfUpdateSchema() {
		return this.bSelfUpdateSchema;
	}
    
    
}
