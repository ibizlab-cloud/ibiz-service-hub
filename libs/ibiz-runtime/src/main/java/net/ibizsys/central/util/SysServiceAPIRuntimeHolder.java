package net.ibizsys.central.util;

import java.util.ArrayDeque;
import java.util.Deque;

import net.ibizsys.central.service.ISysServiceAPIRuntime;

/**
 * 系统服务接口运行时对象持有对象
 * @author lionlau
 *
 */
public final class SysServiceAPIRuntimeHolder {

    private static final ThreadLocal<Deque<ISysServiceAPIRuntime>> LOOKUP_KEY_HOLDER = new ThreadLocal<Deque<ISysServiceAPIRuntime>>() {
        @Override
        protected Deque<ISysServiceAPIRuntime> initialValue() {
            return new ArrayDeque<ISysServiceAPIRuntime>();
        }
    };
    
    private static final ThreadLocal<Deque<String>> URL_LOOKUP_KEY_HOLDER = new ThreadLocal<Deque<String>>() {
        @Override
        protected Deque<String> initialValue() {
            return new ArrayDeque<String>();
        }
    };
    
    private SysServiceAPIRuntimeHolder() {

    }

    public static ISysServiceAPIRuntime peek() {
        return LOOKUP_KEY_HOLDER.get().peek();
    }
    
    public static ISysServiceAPIRuntime peekMust() {
    	ISysServiceAPIRuntime iSysServiceAPIRuntime = peek();
    	if(iSysServiceAPIRuntime == null) {
    		throw new RuntimeException("未指定当前系统服务接口运行时对象");
    	}
    	return iSysServiceAPIRuntime;
    }


    public static void push(ISysServiceAPIRuntime ds) {
        LOOKUP_KEY_HOLDER.get().push(ds);
    }

    public static void poll() {
        Deque<ISysServiceAPIRuntime> deque = LOOKUP_KEY_HOLDER.get();
        deque.poll();
        if (deque.isEmpty()) {
            LOOKUP_KEY_HOLDER.remove();
        }
    }

    public static void clear() {
        LOOKUP_KEY_HOLDER.remove();
    }
    
    public static void pushUrl(String strUrl) {
    	URL_LOOKUP_KEY_HOLDER.get().push(strUrl);
    }

    public static void pollUrl() {
        Deque<String> deque = URL_LOOKUP_KEY_HOLDER.get();
        deque.poll();
        if (deque.isEmpty()) {
        	URL_LOOKUP_KEY_HOLDER.remove();
        }
    }

    public static void clearUrl() {
    	URL_LOOKUP_KEY_HOLDER.remove();
    }
    
    public static String peekUrl() {
        return URL_LOOKUP_KEY_HOLDER.get().peek();
    }
    
    
}
