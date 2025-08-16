package net.ibizsys.central.util;

import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.core.type.TypeReference;

import net.ibizsys.central.sysutil.ISysCacheUtilRuntime;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.IAction;

public class CacheableActionBuilder  {

	private ISysCacheUtilRuntime iSysCacheUtilRuntime = null;
	private int nSeconds = 0;
	private String strCat = null;
	private Object[] tags = null;
	private IAction realAction = null;
	private IUserContext iUserContext = null;
	


	public CacheableActionBuilder(ISysCacheUtilRuntime iSysCacheUtilRuntime, String strCat) {
		this.strCat = strCat;
		this.setSysCacheUtilRuntime(iSysCacheUtilRuntime);
		Assert.notNull(this.getSysCacheUtilRuntime(), "传入缓存组件对象无效");
	}
	
	public CacheableActionBuilder(ISysCacheUtilRuntime iSysCacheUtilRuntime) {
		this.setSysCacheUtilRuntime(iSysCacheUtilRuntime);
		Assert.notNull(this.getSysCacheUtilRuntime(), "传入缓存组件对象无效");
	}
	
	protected IAction getRealAction() {
		return realAction;
	}

	protected void setRealAction(IAction realAction) {
		this.realAction = realAction;
	}

	
//	
//	public static CacheableActionBuilder create(String strCat, ISysCacheUtilRuntime iSysCacheUtilRuntime) {
//		return new CacheableActionBuilder(strCat, iSysCacheUtilRuntime);
//	}
//	
//	public static CacheableActionBuilder create(ISysCacheUtilRuntime iSysCacheUtilRuntime) {
//		return new CacheableActionBuilder(null, iSysCacheUtilRuntime);
//	}
	
	public String getCat() {
		return this.strCat;
	}
	
	protected void setCat(String strCat) {
		this.strCat = strCat;
	}
	
	public ISysCacheUtilRuntime getSysCacheUtilRuntime() {
		return this.iSysCacheUtilRuntime;
	}
	
	protected void setSysCacheUtilRuntime(ISysCacheUtilRuntime iSysCacheUtilRuntime) {
		this.iSysCacheUtilRuntime = iSysCacheUtilRuntime;
	}
	
	
	public CacheableActionBuilder expire(int nSeconds) {
		this.nSeconds = nSeconds;
		return this;
	}
	
	public int getExpiredSeconds() {
		return this.nSeconds;
	}
	
	protected void setExpiredSeconds(int nSeconds){
		this.nSeconds = nSeconds;
	}
	
	public CacheableActionBuilder usercontext(IUserContext iUserContext) {
		setUserContext(iUserContext);
		return this;
	}
	
	public IUserContext getUserContext() {
		return this.iUserContext;
	}
	
	protected IUserContext getRealUserContext() {
		if(this.iUserContext != null) {
			return iUserContext;
		}
		return UserContext.getCurrent();
	}
	
	protected void setUserContext(IUserContext iUserContext){
		this.iUserContext = iUserContext;
	}
	
	public CacheableActionBuilder tags(Object... tags) {
		this.setTags(tags);
		return this;
	}
	
	
	public  Object[] getTags() {
		return this.tags;
	}
	
	protected void setTags(Object[] tags) {
		this.tags = tags;
	}
	
	public CacheableActionBuilder action(IAction iAction) {
		this.setRealAction(iAction);
		return this;
	}
	

	public ICacheableAction build() throws Throwable{
		
		if(getRealAction() == null) {
			throw new Exception("未指定实际行为");
		}
		
		if(getSysCacheUtilRuntime() == null) {
			throw new Exception("缓存组件无效");
		}
		
		return new ICacheableAction() {
			
			@Override
			public <T> T get(Class<T> cls) throws Throwable {
				return this.get((Object[])null, cls);
			}

			@Override
			public <T> T get(TypeReference<T> type) throws Throwable {
				return this.get((Object[])null, type);
			}

			@Override
			public <T> T get(Object[] args, Class<T> cls) throws Throwable {
				IUserContext lastUserContext = UserContext.getCurrent();
				try {
					UserContext.setCurrent(getRealUserContext());
					String strTag = getActionCacheTag();
					T objRet = getSysCacheUtilRuntime().get(getCat(), strTag, cls);
					if(objRet != null) {
						return objRet;
					}
					
					objRet = (T)getRealAction().execute(args);
					getSysCacheUtilRuntime().set(getCat(), strTag, objRet, getExpiredSeconds());
					return objRet;
				}
				finally {
					UserContext.setCurrent(lastUserContext);
				}
			}

			@Override
			public <T> T get(Object[] args, TypeReference<T> type) throws Throwable {
				IUserContext lastUserContext = UserContext.getCurrent();
				try {
					UserContext.setCurrent(getRealUserContext());
					String strTag = getActionCacheTag();
					T objRet = getSysCacheUtilRuntime().get(getCat(), strTag, type);
					if(objRet != null) {
						return objRet;
					}
					
					objRet = (T)getRealAction().execute(args);
					getSysCacheUtilRuntime().set(getCat(), strTag, objRet, getExpiredSeconds());
					return objRet;
				}
				finally {
					UserContext.setCurrent(lastUserContext);
				}
			}

			@Override
			public <T> T save(Class<T> cls) throws Throwable {
				return this.save((Object[])null, cls);
			}

			@Override
			public <T> T save(TypeReference<T> type) throws Throwable {
				return this.save((Object[])null, type);
			}

			@Override
			public <T> T save(Object[] args, Class<T> cls) throws Throwable {
				IUserContext lastUserContext = UserContext.getCurrent();
				try {
					UserContext.setCurrent(getRealUserContext());
					String strTag = getActionCacheTag();
					T objRet = (T)getRealAction().execute(args);
					getSysCacheUtilRuntime().set(getCat(), strTag, objRet, getExpiredSeconds());
					return objRet;
				}
				finally {
					UserContext.setCurrent(lastUserContext);
				}
			}

			@Override
			public <T> T save(Object[] args, TypeReference<T> type) throws Throwable {
				IUserContext lastUserContext = UserContext.getCurrent();
				try {
					UserContext.setCurrent(getRealUserContext());
					String strTag = getActionCacheTag();
					T objRet = (T)getRealAction().execute(args);
					getSysCacheUtilRuntime().set(getCat(), strTag, objRet, getExpiredSeconds());
					return objRet;
				}
				finally {
					UserContext.setCurrent(lastUserContext);
				}
			}

			@Override
			public void remove() throws Throwable {
				remove((Object[])null);
			}

			@Override
			public void remove(Object[] args) throws Throwable {
				IUserContext lastUserContext = UserContext.getCurrent();
				try {
					UserContext.setCurrent(getRealUserContext());
					getRealAction().execute(args);
					String strTag = getActionCacheTag();
					if(StringUtils.hasLength(strTag)) {
						getSysCacheUtilRuntime().reset(getCat(), strTag);
					}
					else {
						getSysCacheUtilRuntime().reset(getCat());
					}
				}
				finally {
					UserContext.setCurrent(lastUserContext);
				}
			}
		};
	}
	
	
	
	

	protected String getActionCacheTag() {
		Object[] catchTags = this.getTags();
		if(ObjectUtils.isEmpty(catchTags)) {
			return null;
		}
		
		Assert.isTrue(catchTags.length<=6, "缓存标记数组长度不能超过[6]");
		
		
		switch(catchTags.length) {
		case 1:
			return String.format("%1$s", catchTags[0]);
		case 2:
			return String.format("%1$s-%2$s", catchTags[0], catchTags[1]);
		case 3:
			return String.format("%1$s-%2$s-%3$s", catchTags[0], catchTags[1], catchTags[2]);
		case 4:
			return String.format("%1$s-%2$s-%3$s-%4$s", catchTags[0], catchTags[1], catchTags[2], catchTags[3]);
		case 5:
			return String.format("%1$s-%2$s-%3$s-%4$s-%5$s", catchTags[0], catchTags[1], catchTags[2], catchTags[3], catchTags[4]);
		//case 6:
		default:
			return String.format("%1$s-%2$s-%3$s-%4$s-%5$s-%6$s", catchTags[0], catchTags[1], catchTags[2], catchTags[3], catchTags[4], catchTags[5]);
		}
		
	}


}
