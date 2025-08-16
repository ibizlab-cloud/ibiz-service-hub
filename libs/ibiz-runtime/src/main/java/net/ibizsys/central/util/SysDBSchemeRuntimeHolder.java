package net.ibizsys.central.util;

import java.util.ArrayDeque;
import java.util.Deque;

import net.ibizsys.central.database.ISysDBSchemeRuntime;

/**
 * 系统数据库运行时对象持有对象
 * @author lionlau
 *
 */
public final class SysDBSchemeRuntimeHolder {

    private static final ThreadLocal<Deque<ISysDBSchemeRuntime>> LOOKUP_KEY_HOLDER = new ThreadLocal<Deque<ISysDBSchemeRuntime>>() {
        @Override
        protected Deque<ISysDBSchemeRuntime> initialValue() {
            return new ArrayDeque<ISysDBSchemeRuntime>();
        }
    };
    
    private SysDBSchemeRuntimeHolder() {

    }

    public static ISysDBSchemeRuntime peek() {
        return LOOKUP_KEY_HOLDER.get().peek();
    }


    public static void push(ISysDBSchemeRuntime ds) {
        LOOKUP_KEY_HOLDER.get().push(ds);
    }

    public static void poll() {
        Deque<ISysDBSchemeRuntime> deque = LOOKUP_KEY_HOLDER.get();
        deque.poll();
        if (deque.isEmpty()) {
            LOOKUP_KEY_HOLDER.remove();
        }
    }

    public static void clear() {
        LOOKUP_KEY_HOLDER.remove();
    }
    
}
