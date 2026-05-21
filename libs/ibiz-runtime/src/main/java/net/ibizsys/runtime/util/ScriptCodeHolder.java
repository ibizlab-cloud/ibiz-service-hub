package net.ibizsys.runtime.util;

import java.util.ArrayDeque;
import java.util.Deque;

public class ScriptCodeHolder {

    private static final ThreadLocal<Deque<String>> LOOKUP_KEY_HOLDER = new ThreadLocal<Deque<String>>() {
        @Override
        protected Deque<String> initialValue() {
            return new ArrayDeque<String>();
        }
    };
    
    

    private ScriptCodeHolder() {

    }

    public static String peek() {
        return LOOKUP_KEY_HOLDER.get().peek();
    }

    public static String peekMust() {
    	String request = peek();
    	if(request != null) {
    		return request;
    	}
    	throw new RuntimeException("脚本代码无效");
    }
    

    public static void push(String ds) {
        LOOKUP_KEY_HOLDER.get().push(ds!=null?ds:"");
    }

    public static void poll() {
        Deque<String> deque = LOOKUP_KEY_HOLDER.get();
        deque.poll();
        if (deque.isEmpty()) {
            LOOKUP_KEY_HOLDER.remove();
        }
    }

    public static void clear() {
        LOOKUP_KEY_HOLDER.remove();
    }
}
