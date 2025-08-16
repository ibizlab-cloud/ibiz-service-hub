package net.ibizsys.central.util;

import org.springframework.util.Assert;

import com.fasterxml.jackson.core.type.TypeReference;

import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.IAction;


public class UserContextActionBuilder  {

	private IUserContext iUserContext = null;
	private IAction realAction = null;
	
	public UserContextActionBuilder(IUserContext iUserContext) {
		Assert.notNull(iUserContext, "传入用户上下文对象无效");
		this.setUserContext(iUserContext);
	}
	
	protected IAction getRealAction() {
		return realAction;
	}

	protected void setRealAction(IAction realAction) {
		this.realAction = realAction;
	}


	
	public IUserContext getUserContext() {
		return this.iUserContext;
	}
	
	protected void setUserContext(IUserContext iUserContext) {
		this.iUserContext = iUserContext;
	}
	

	
	public UserContextActionBuilder action(IAction iAction) {
		this.setRealAction(iAction);
		return this;
	}
	

	public IUserContextAction build() throws Throwable{
		
		if(getRealAction() == null) {
			throw new Exception("未指定实际行为");
		}
		
		if(getUserContext() == null) {
			throw new Exception("用户上下文对象无效");
		}
		
		return new IUserContextAction() {
			@Override
			public void execute(Object[] args) throws Throwable {
				IUserContext lastUserContext = UserContext.getCurrent();
				try {
					UserContext.setCurrent(getUserContext());
					getRealAction().execute(args);
				}
				finally {
					UserContext.setCurrent(lastUserContext);
				}
			}
			
			@Override
			public void execute() throws Throwable {
				IUserContext lastUserContext = UserContext.getCurrent();
				try {
					UserContext.setCurrent(getUserContext());
					getRealAction().execute(null);
				}
				finally {
					UserContext.setCurrent(lastUserContext);
				}
			}
			
			@Override
			public <T> T execute(Object[] args, TypeReference<T> type) throws Throwable {
				IUserContext lastUserContext = UserContext.getCurrent();
				try {
					UserContext.setCurrent(getUserContext());
					return (T)getRealAction().execute(args);
				}
				finally {
					UserContext.setCurrent(lastUserContext);
				}
			}
			
			@Override
			public <T> T execute(Object[] args, Class<T> cls) throws Throwable {
				IUserContext lastUserContext = UserContext.getCurrent();
				try {
					UserContext.setCurrent(getUserContext());
					return (T) getRealAction().execute(args);
				}
				finally {
					UserContext.setCurrent(lastUserContext);
				}
			}
			
			@Override
			public <T> T execute(TypeReference<T> type) throws Throwable {
				IUserContext lastUserContext = UserContext.getCurrent();
				try {
					UserContext.setCurrent(getUserContext());
					return (T)getRealAction().execute(null);
				}
				finally {
					UserContext.setCurrent(lastUserContext);
				}
			}
			
			@Override
			public <T> T execute(Class<T> cls) throws Throwable {
				IUserContext lastUserContext = UserContext.getCurrent();
				try {
					UserContext.setCurrent(getUserContext());
					return (T)getRealAction().execute(null);
				}
				finally {
					UserContext.setCurrent(lastUserContext);
				}
			}
		};
	}
	


}
