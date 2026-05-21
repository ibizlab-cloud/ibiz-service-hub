package net.ibizsys.central.cloud.core.ai.util;

import java.util.ArrayDeque;
import java.util.Deque;

import net.ibizsys.central.cloud.core.ai.IAIFactoryRuntimeBase;

/**
 * AI工厂运行时对象持有对象
 * @author lionlau
 *
 */
public final class AIFactoryRuntimeHolder {

    private static final ThreadLocal<Deque<IAIFactoryRuntimeBase>> LOOKUP_KEY_HOLDER = new ThreadLocal<Deque<IAIFactoryRuntimeBase>>() {
        @Override
        protected Deque<IAIFactoryRuntimeBase> initialValue() {
            return new ArrayDeque<IAIFactoryRuntimeBase>();
        }
    };
    
    private AIFactoryRuntimeHolder() {

    }

    public static IAIFactoryRuntimeBase peek() {
        return LOOKUP_KEY_HOLDER.get().peek();
    }
    
    public static IAIFactoryRuntimeBase peekMust() {
    	IAIFactoryRuntimeBase iSysServiceAPIRuntime = peek();
    	if(iSysServiceAPIRuntime == null) {
    		throw new RuntimeException("未指定当前AI工厂运行时对象");
    	}
    	return iSysServiceAPIRuntime;
    }


    public static void push(IAIFactoryRuntimeBase ds) {
        LOOKUP_KEY_HOLDER.get().push(ds);
    }

    public static void poll() {
        Deque<IAIFactoryRuntimeBase> deque = LOOKUP_KEY_HOLDER.get();
        deque.poll();
        if (deque.isEmpty()) {
            LOOKUP_KEY_HOLDER.remove();
        }
    }

    public static void clear() {
        LOOKUP_KEY_HOLDER.remove();
    }
    
    
}
