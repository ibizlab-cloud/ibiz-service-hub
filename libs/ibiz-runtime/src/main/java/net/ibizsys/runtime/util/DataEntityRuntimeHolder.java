package net.ibizsys.runtime.util;

import java.util.ArrayDeque;
import java.util.Deque;

import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;

/**
 * 实体运行时对象持有对象
 * @author lionlau
 *
 */
public final class DataEntityRuntimeHolder {

    private static final ThreadLocal<Deque<IDataEntityRuntime>> LOOKUP_KEY_HOLDER = new ThreadLocal<Deque<IDataEntityRuntime>>() {
        @Override
        protected Deque<IDataEntityRuntime> initialValue() {
            return new ArrayDeque<IDataEntityRuntime>();
        }
    };
    
    
    private static final ThreadLocal<Deque<IPSDEAction>> PSDEACTION_LOOKUP_KEY_HOLDER = new ThreadLocal<Deque<IPSDEAction>>() {
        @Override
        protected Deque<IPSDEAction> initialValue() {
            return new ArrayDeque<IPSDEAction>();
        }
    };
    
    private static final ThreadLocal<Deque<IPSDEDataSet>> PSDEDATASET_LOOKUP_KEY_HOLDER = new ThreadLocal<Deque<IPSDEDataSet>>() {
        @Override
        protected Deque<IPSDEDataSet> initialValue() {
            return new ArrayDeque<IPSDEDataSet>();
        }
    };
    
    private static final ThreadLocal<Deque<IDataEntityRuntime>> CHILDDATAENTITYRUNTIME_LOOKUP_KEY_HOLDER = new ThreadLocal<Deque<IDataEntityRuntime>>() {
        @Override
        protected Deque<IDataEntityRuntime> initialValue() {
            return new ArrayDeque<IDataEntityRuntime>();
        }
    };
    

    private DataEntityRuntimeHolder() {

    }

    public static IDataEntityRuntime peek() {
        return LOOKUP_KEY_HOLDER.get().peek();
    }

    

    public static void push(IDataEntityRuntime ds) {
        LOOKUP_KEY_HOLDER.get().push(ds);
    }

    public static void poll() {
        Deque<IDataEntityRuntime> deque = LOOKUP_KEY_HOLDER.get();
        deque.poll();
        if (deque.isEmpty()) {
            LOOKUP_KEY_HOLDER.remove();
        }
    }

    public static void clear() {
        LOOKUP_KEY_HOLDER.remove();
    }
    
    
    
    
    public static IPSDEAction peekPSDEAction() {
        return PSDEACTION_LOOKUP_KEY_HOLDER.get().peek();
    }

    public static void pushPSDEAction(IPSDEAction ds) {
    	PSDEACTION_LOOKUP_KEY_HOLDER.get().push(ds);
    }

    public static void pollPSDEAction() {
        Deque<IPSDEAction> deque = PSDEACTION_LOOKUP_KEY_HOLDER.get();
        deque.poll();
        if (deque.isEmpty()) {
        	PSDEACTION_LOOKUP_KEY_HOLDER.remove();
        }
    }

    public static void clearPSDEAction() {
    	PSDEACTION_LOOKUP_KEY_HOLDER.remove();
    }
    
    
    public static IPSDEDataSet peekPSDEDataSet() {
        return PSDEDATASET_LOOKUP_KEY_HOLDER.get().peek();
    }

    public static void pushPSDEDataSet(IPSDEDataSet ds) {
    	PSDEDATASET_LOOKUP_KEY_HOLDER.get().push(ds);
    }

    public static void pollPSDEDataSet() {
        Deque<IPSDEDataSet> deque = PSDEDATASET_LOOKUP_KEY_HOLDER.get();
        deque.poll();
        if (deque.isEmpty()) {
        	PSDEDATASET_LOOKUP_KEY_HOLDER.remove();
        }
    }

    public static void clearPSDEDataSet() {
    	PSDEDATASET_LOOKUP_KEY_HOLDER.remove();
    }
    
    public static IDataEntityRuntime peekChildDataEntityRuntime() {
        return CHILDDATAENTITYRUNTIME_LOOKUP_KEY_HOLDER.get().peek();
    }

    public static IDataEntityRuntime peekChildDataEntityRuntimeMust() {
    	IDataEntityRuntime childDataEntityRuntime = peekChildDataEntityRuntime();
    	if(childDataEntityRuntime == null) {
    		throw new RuntimeException("子实体运行时对象无效");
    	}
    	return childDataEntityRuntime;
    }

    public static void pushChildDataEntityRuntime(IDataEntityRuntime ds) {
    	CHILDDATAENTITYRUNTIME_LOOKUP_KEY_HOLDER.get().push(ds);
    }

    public static void pollChildDataEntityRuntime() {
        Deque<IDataEntityRuntime> deque = CHILDDATAENTITYRUNTIME_LOOKUP_KEY_HOLDER.get();
        deque.poll();
        if (deque.isEmpty()) {
        	CHILDDATAENTITYRUNTIME_LOOKUP_KEY_HOLDER.remove();
        }
    }

    public static void clearChildDataEntityRuntime() {
    	CHILDDATAENTITYRUNTIME_LOOKUP_KEY_HOLDER.remove();
    }
    
}
