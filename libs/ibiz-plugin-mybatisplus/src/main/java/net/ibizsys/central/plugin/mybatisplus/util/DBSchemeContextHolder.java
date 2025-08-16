package net.ibizsys.central.plugin.mybatisplus.util;

import net.ibizsys.central.database.ISysDBSchemeRuntime;

import java.util.ArrayDeque;
import java.util.Deque;

public final class DBSchemeContextHolder {

    private static final ThreadLocal<Deque<ISysDBSchemeRuntime>> LOOKUP_KEY_HOLDER = new ThreadLocal() {
        @Override
        protected Object initialValue() {
            return new ArrayDeque();
        }
    };

    private DBSchemeContextHolder() {

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
