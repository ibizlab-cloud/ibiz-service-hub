package net.ibizsys.central.dataentity.logic;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.dataentity.logic.IPSDELogicLink;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.DateUtils;
import net.ibizsys.runtime.util.IAppContext;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.ITransactionalUtil;
import net.ibizsys.runtime.util.IWebContext;
import net.ibizsys.runtime.util.JsonUtils;

/**
 * 实体逻辑会话接口实现
 * @author lionlau
 *
 */
public class DELogicSession implements IDELogicSession, Cloneable {

	private static final Log log = LogFactory.getLog(DELogicSession.class);
	
	private static ThreadLocal<IDELogicSession> current = new ThreadLocal<IDELogicSession>();
	private static ThreadLocal<Object> next = new ThreadLocal<Object>();
	
	private Map<String, Object> paramMap = new HashMap<>();
	private Object result = null;
	private Object lastReturn = null;
	private IDELogicRuntimeContext iDELogicRuntimeContext = null;
	//private IAppContext iAppContext = null;
	
	private ArrayNode debugArrayNode = null;
	
	private int transactionCount = 0;  // 事务计数
	
	public static IDELogicSession getCurrent() {
		return current.get();
	}
	
	public static void setCurrent(IDELogicSession iDELogicSession) {
		current.set(iDELogicSession);
	}
	
	/**
	 * 获取当前会话，必须存在
	 * 
	 * @return
	 */
	static public IDELogicSession getCurrentMust() {
		IDELogicSession iDELogicSession = getCurrent();
		if(iDELogicSession==null) {
			throw new RuntimeException("当前逻辑会话无效"); 
		}	
		return iDELogicSession;
	}
	
	public DELogicSession(IDELogicRuntimeContext iDELogicRuntimeContext, Map<String, Object> params) {
		this.iDELogicRuntimeContext = iDELogicRuntimeContext;
		this.debugArrayNode = JsonUtils.createArrayNode();
		if(!ObjectUtils.isEmpty(params)) {
			for(java.util.Map.Entry<String, Object> entry : params.entrySet()) {
				this.setParamObject(entry.getKey(), entry.getValue());
			}
		}
	}
	

	public DELogicSession(IDELogicRuntimeContext iDELogicRuntimeContext) {
		this(iDELogicRuntimeContext, null);
	}
	
	protected IDELogicRuntimeContext getDELogicRuntimeContext() {
		return this.iDELogicRuntimeContext;
	}
	
	@Override
	@Deprecated
	public IEntity getParam(String strName) throws Throwable {
		return this.getParam(strName, false);
	}
	
	@Override
	@Deprecated
	public IEntity getParam(String strName, boolean bTryMode) throws Throwable {
		Object obj =  paramMap.get(strName.toUpperCase());
		IEntity iEntity = null;
		if(obj!=null) {
			if(obj instanceof IEntity) {
				iEntity = (IEntity)obj;
			}
			else {
				throw new Exception(String.format("参数[%1$s]类型不正确", strName));
			}
		}
		
		if(iEntity != null || bTryMode) {
			return iEntity;
		}
		throw new Exception(String.format("未存在指定参数[%1$s]", strName));
	}

	@Override
	@Deprecated
	public void setParam(String strName, IEntity iEntity) {
		paramMap.put(strName.toUpperCase(), iEntity);
	}
	
	
	

	@Override
	public Object getParamObject(String strName) throws Throwable {
		return this.getParamObject(strName, false);
	}

	@Override
	public void setParamObject(String strName, Object object) {
		paramMap.put(strName.toUpperCase(), object);
	}

	@Override
	public Object getParamObject(String strName, boolean bTryMode) throws Throwable {
		Object obj =  paramMap.get(strName.toUpperCase());
		if(obj != null || bTryMode) {
			return obj;
		}
		throw new Exception(String.format("未存在指定参数[%1$s]", strName));
	}

	@Override
	public IUserContext getUserContext() {
		ActionSession actionSession = ActionSessionManager.getCurrentSession();
		if (actionSession != null && actionSession.getUserContext() != null) {
			return actionSession.getUserContext();
		}
		return UserContext.getCurrent();
	}


	@Override
	public Object getResult() {
		return this.result;
	}

	@Override
	public void setResult(Object result) {
		this.result = result;
	}

	@Override
	public Object getLastReturn() {
		return this.lastReturn;
	}

	@Override
	public void setLastReturn(Object lastReturn) {
		this.lastReturn = lastReturn;
	}

	@Override
	public void debugEnterNode(IDELogicNodeRuntime iDELogicNodeRuntime, IPSDELogicNode iPSDELogicNode) {
		
		if(log.isDebugEnabled()) {
			log.debug(String.format("进入节点[%1$s]", iPSDELogicNode.getName()));
		}
		
		if(getDebugArrayNode() == null) {
			return;
		}
		ObjectNode objectNode =	getDebugArrayNode().addObject();
		objectNode.put("type", "enternode");
		objectNode.put("time", DateUtils.getCurTimeString2());
		objectNode.put("name", iPSDELogicNode.getName());
		objectNode.put("codeName", iPSDELogicNode.getCodeName());
		
	}

	@Override
	public void debugExitNode(IDELogicNodeRuntime iDELogicNodeRuntime, IPSDELogicNode iPSDELogicNode) {
		
		if(log.isDebugEnabled()) {
			log.debug(String.format("离开节点[%1$s]", iPSDELogicNode.getName()));
		}
		
		if(getDebugArrayNode() == null) {
			return;
		}
		ObjectNode objectNode =	getDebugArrayNode().addObject();
		objectNode.put("type", "exitnode");
		objectNode.put("time", DateUtils.getCurTimeString2());
		objectNode.put("name", iPSDELogicNode.getName());
		objectNode.put("codeName", iPSDELogicNode.getCodeName());
		
	}
	


	@Override
	public void debugEnterLink(IDELogicNodeRuntime iDELogicNodeRuntime, IPSDELogicNode iPSDELogicNode, IPSDELogicLink iPSDELogicLink) {
		
		if(log.isDebugEnabled()) {
			log.debug(String.format("进入连接[%1$s@%2$s]", iPSDELogicLink.getName(), iPSDELogicNode.getName()));
		}
		
		
		if(getDebugArrayNode() == null) {
			return;
		}
		ObjectNode objectNode =	getDebugArrayNode().addObject();
		objectNode.put("type", "enterlink");
		objectNode.put("time", DateUtils.getCurTimeString2());
		objectNode.put("name", String.format("%1$s@%2$s", iPSDELogicLink.getName(), iPSDELogicNode.getName()));
	}



	@Override
	public void debugParam(IDELogicParamRuntime iDELogicParamRuntime) {
		
		if(getDebugArrayNode() == null) {
			return;
		}
		ObjectNode objectNode =	getDebugArrayNode().addObject();
		objectNode.put("type", "debugparam");
		objectNode.put("time", DateUtils.getCurTimeString2());
		iDELogicParamRuntime.debug(this, objectNode);
		
		if(log.isDebugEnabled()) {
			log.debug(String.format("输出参数[%1$s]\r\n%2$s", iDELogicParamRuntime.getName(), objectNode));
		}
		
	}
	
	@Override
	public void debugInfo(String strInfo) {
		if(log.isDebugEnabled()) {
			log.debug(strInfo);
		}
		
		if(getDebugArrayNode() == null) {
			return;
		}
		ObjectNode objectNode =	getDebugArrayNode().addObject();
		objectNode.put("type", "debuginfo");
		objectNode.put("time", DateUtils.getCurTimeString2());
		objectNode.put("info", strInfo);
	}
	
	
	public ArrayNode getDebugArrayNode() {
		return this.debugArrayNode;
	}

	@Override
	public IAppContext getAppContext() {
		if (ActionSessionManager.getCurrentSession() != null) {
			return ActionSessionManager.getCurrentSession().getAppContext();
		}
		else {
			return UserContext.getCurrentMust().getAppContext();
		}
	}
	
	

//	@Override
//	public void setAppContext(IAppContext iAppContext) {
//		this.iAppContext = iAppContext;
//	}

	
	@Override
	public IWebContext getWebContext() {
		return UserContext.getCurrentMust().getWebContext();
	}

	@Override
	public IDELogicRuntime getDELogicRuntime() {
		return this.getDELogicRuntimeContext().getDELogicRuntime();
	}

	@Override
	public void setNext(Object value) {
		DELogicSession.next.set(value);
	}

	@Override
	public Object getNext() {
		return DELogicSession.next.get();
	}

	@Override
	public DELogicSession clone(){
		DELogicSession dst = clone(this.iDELogicRuntimeContext, this.paramMap);
		this.onFillDELogicSession(dst);
		return dst;
	}
	
	protected DELogicSession clone(IDELogicRuntimeContext iDELogicRuntimeContext, Map<String, Object> params) {
		return new DELogicSession(iDELogicRuntimeContext, params);
	}
	
	protected void onFillDELogicSession(DELogicSession dst) {
		
	}

	@Override
    public void beginTrans(int propagation) throws Throwable {
        ITransactionalUtil iTransactionalUtil = getTransactionalUtil();
        iTransactionalUtil.begin(propagation);
        transactionCount++;
    }

    @Override
    public void commitTrans() throws Throwable {
        if (transactionCount <= 0) {
            throw new IllegalStateException("没有正在进行的事务");
        }
        ITransactionalUtil iTransactionalUtil = getTransactionalUtil();
        iTransactionalUtil.commit();
        transactionCount--;
    }

    @Override
    public void rollbackTrans() throws Throwable {
        if (transactionCount <= 0) {
            throw new IllegalStateException("没有正在进行的事务");
        }
        ITransactionalUtil iTransactionalUtil = getTransactionalUtil();
        iTransactionalUtil.rollback();
        transactionCount--;
    }

    @Override
    public void close(boolean commit) {
        while (transactionCount > 0) {
            try {
                ITransactionalUtil iTransactionalUtil = getTransactionalUtil();
                if (commit) {
                    iTransactionalUtil.commit();
                } else {
                    iTransactionalUtil.rollback();
                }
                transactionCount--;
            } catch (Throwable e) {
                log.error("关闭会话时处理事务失败，剩余事务数：" + transactionCount, e);
                break;
            }
        }
        this.onClose(commit);
    }
    
   
    
    protected void onClose(boolean commit) {
    	
    }
    
    protected static ITransactionalUtil getTransactionalUtil() {
        ITransactionalUtil util = ActionSessionManager.getTransactionalUtil();
        if (util == null) {
            throw new IllegalStateException("TransactionalUtil 未初始化或不可用，请检查事务管理器配置。");
        }
        return util;
    }

	
}
