package net.ibizsys.central.plugin.ai.util;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.util.StringUtils;

public class ChatCompletionSessionHolder {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(ChatCompletionSessionHolder.class);
	
    private static final ThreadLocal<Deque<IChatCompletionSession>> LOOKUP_KEY_HOLDER = new ThreadLocal<Deque<IChatCompletionSession>>() {
        @Override
        protected Deque<IChatCompletionSession> initialValue() {
            return new ArrayDeque<IChatCompletionSession>();
        }
    };
    
    
    public static final Map<String, IChatCompletionSession> chatCompletionSessionMap = new ConcurrentHashMap<String, IChatCompletionSession>();
    
    

    private ChatCompletionSessionHolder() {

    }
    
    public static IChatCompletionSession peekMust() {
    	IChatCompletionSession chatCompletionSession = peek();
    	if(chatCompletionSession == null) {
    		throw new RuntimeException("交互补全会话对象无效");
    	}
    	return chatCompletionSession;
    }

    public static IChatCompletionSession peek() {
        return LOOKUP_KEY_HOLDER.get().peek();
    }


    public static void push(IChatCompletionSession ds) {
    	 LOOKUP_KEY_HOLDER.get().push(ds);
    	 
    	log.debug(String.format("推入[%1$s]", ds));
       
        if(StringUtils.hasLength(ds.getSessionId())) {
        	//首个放入
        	if(ds.addRef() == 1) {
        		chatCompletionSessionMap.put(ds.getSessionId(), ds);
        		log.debug(String.format("登记会话[%1$s][%2$s]", ds, ds.getSessionId()));
        	}
        }
    }

    public static void poll() {
    	
        Deque<IChatCompletionSession> deque = LOOKUP_KEY_HOLDER.get();
        IChatCompletionSession ds = deque.poll();
        if(ds != null) {
        	log.debug(String.format("退出[%1$s]", ds));
        }
        if(ds != null && StringUtils.hasLength(ds.getSessionId())) {
        	if(ds.releaseRef() == 0) {
        		chatCompletionSessionMap.remove(ds.getSessionId());	
        		log.debug(String.format("注销会话[%1$s][%2$s]", ds, ds.getSessionId()));
        	}
        }
        if (deque.isEmpty()) {
            LOOKUP_KEY_HOLDER.remove();
        }
    }

    public static void clear() {
        LOOKUP_KEY_HOLDER.remove();
    }
    
    public static IChatCompletionSession getById(String sessionId, boolean tryMode) {
    	IChatCompletionSession ds = chatCompletionSessionMap.get(sessionId);
    	if(ds != null || tryMode) {
    		return ds;
    	}
    	throw new RuntimeException(String.format("指定交互补全会话[%1$s]不存在", sessionId));
    }
    
}
