package net.ibizsys.runtime.util;

import java.util.Map;

import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 应用上下文默认实现
 * 
 * @author lionlau
 *
 */
public class AppContext extends EntityBase implements IAppContext {

//	public static IAppContext getCurrent() {
//		if (ActionSessionManager.getCurrentSession() != null) {
//			return ActionSessionManager.getCurrentSession().getAppContext();
//		}
//		if (UserContext.getCurrent() != null) {
//			return UserContext.getCurrent().getAppContext();
//		}
//		return null;
//	}
	
	public AppContext() {
		
	}
	
	public AppContext(Map<String, Object> params) {
		if(!ObjectUtils.isEmpty(params)) {
			this.putAll(params);
		}
	}
	
	/**
	 * 新建应用上下文
	 * @param 克隆对象 
	 * @return
	 */
	public static IAppContext newInstance(IAppContext iAppContext) {
		AppContext appContext = new AppContext();
		if(iAppContext != null) {
			iAppContext.copyTo(appContext);
		}
		return appContext;
	}
	

	@Override
	@JsonIgnore
	protected boolean isLowerCaseName() {
		return false;
	}

	@Override
	public Object get(String strName) {
		return super.get(strName.toUpperCase());
	}

	@Override
	public void set(String strName, Object objValue) {
		super.set(strName.toUpperCase(), objValue);
	}

	@Override
	public boolean contains(String strName) {
		return super.contains(strName.toUpperCase());
	}

	@Override
	public void reset(String strName) {
		super.reset(strName.toUpperCase());
	}
	
	
	

}
