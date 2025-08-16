package net.ibizsys.runtime.util;

import java.util.ArrayDeque;
import java.util.Deque;

import net.ibizsys.runtime.ISystemRuntime;

/**
 * 系统运行时对象持有对象
 * @author lionlau
 *
 */
public final class SystemRuntimeHolder {

    private static final ThreadLocal<Deque<ISystemRuntime>> LOOKUP_KEY_HOLDER = new ThreadLocal<Deque<ISystemRuntime>>() {
        @Override
        protected Deque<ISystemRuntime> initialValue() {
            return new ArrayDeque<ISystemRuntime>();
        }
    };

    private SystemRuntimeHolder() {

    }

    public static ISystemRuntime peek() {
        return LOOKUP_KEY_HOLDER.get().peek();
    }


    public static void push(ISystemRuntime iSystemRuntime) {
        LOOKUP_KEY_HOLDER.get().push(iSystemRuntime);
    }

    public static void poll() {
        Deque<ISystemRuntime> deque = LOOKUP_KEY_HOLDER.get();
        deque.poll();
        if (deque.isEmpty()) {
            LOOKUP_KEY_HOLDER.remove();
        }
    }


    public static void clear() {
        LOOKUP_KEY_HOLDER.remove();
    }
}
