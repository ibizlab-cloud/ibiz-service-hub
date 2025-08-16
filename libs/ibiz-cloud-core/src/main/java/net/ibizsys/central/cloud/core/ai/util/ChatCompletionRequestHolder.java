package net.ibizsys.central.cloud.core.ai.util;

import java.util.ArrayDeque;
import java.util.Deque;

import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;

public class ChatCompletionRequestHolder {

    private static final ThreadLocal<Deque<ChatCompletionRequest>> LOOKUP_KEY_HOLDER = new ThreadLocal<Deque<ChatCompletionRequest>>() {
        @Override
        protected Deque<ChatCompletionRequest> initialValue() {
            return new ArrayDeque<ChatCompletionRequest>();
        }
    };
    
    

    private ChatCompletionRequestHolder() {

    }

    public static ChatCompletionRequest peek() {
        return LOOKUP_KEY_HOLDER.get().peek();
    }


    public static void push(ChatCompletionRequest ds) {
        LOOKUP_KEY_HOLDER.get().push(ds);
    }

    public static void poll() {
        Deque<ChatCompletionRequest> deque = LOOKUP_KEY_HOLDER.get();
        deque.poll();
        if (deque.isEmpty()) {
            LOOKUP_KEY_HOLDER.remove();
        }
    }

    public static void clear() {
        LOOKUP_KEY_HOLDER.remove();
    }
}
