package net.ibizsys.central.util.script;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.util.Assert;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.service.ISubSysServiceAPIRuntime;
import net.ibizsys.model.res.IPSSysSequence;
import net.ibizsys.model.res.IPSSysTranslator;
import net.ibizsys.model.service.IPSSubSysServiceAPI;
import net.ibizsys.runtime.util.DateUtils;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.script.IScriptEntity;
import net.ibizsys.runtime.util.script.ScriptUtils;

public class SystemRTScriptContext extends net.ibizsys.runtime.util.script.SystemRTScriptContext implements ISystemRTScriptContext {

	private ISystemRuntimeContext iSystemRuntimeContext = null;
	private IScriptWebClient iScriptWebClient = null;

	public SystemRTScriptContext(ISystemRuntimeContext iSystemRuntimeContext) {
		super(iSystemRuntimeContext);
		this.iSystemRuntimeContext = iSystemRuntimeContext;
	}

	protected ISystemRuntimeContext getSystemRuntimeContext() {
		return this.iSystemRuntimeContext;
	}

	@Override
	public ISystemRuntime getSystemRuntime() {
		return this.getSystemRuntimeContext().getSystemRuntime();
	}

	@Override
	public IScriptEntity entity() {
		return entity(true, null);
	}

	@Override
	public IScriptEntity entity(String strName) {
		return entity(strName, null);
	}

	@Override
	public IScriptEntity entity(Object obj) {
		return entity(obj, null);
	}

	@Override
	public IScriptEntity entity(Object obj, Object data) {

		if (data != null) {
			data = ScriptUtils.getReal(data);
		}

		if (obj instanceof String) {
			String strName = obj.toString();
			IDataEntityRuntime iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(strName);
			IEntityBase iEntityBase = null;
			if (data != null) {
				iEntityBase = iDataEntityRuntime.deserializeEntity(data);
			} else {
				iEntityBase = iDataEntityRuntime.createEntity();
			}
			return iDataEntityRuntime.createScriptEntity(iEntityBase);
		}

		boolean bLowerCaseField = true;
		if (obj instanceof Boolean) {
			bLowerCaseField = (Boolean) obj;
		}

		Map map = null;
		if (data != null) {
			map = this.getSystemRuntime().deserialize(data, Map.class);
		}

		IEntity iEntity = this.getSystemRuntime().createEntity(map, bLowerCaseField);
		return this.getSystemRuntime().createScriptEntity(iEntity);
	}

	@Override
	public IScriptList list() {
		return list(null);
	}

	@Override
	public IScriptList list(Object obj) {
		return list(obj, null);
	}

	@Override
	public IScriptList list(Object obj, Object data) {
		
		List source = null;
		if(data != null) {
			if(obj instanceof String) {
				String strName = obj.toString();
				IDataEntityRuntime iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(strName);
				source = iDataEntityRuntime.deserializeEntityList(data);
			}
			else {
				source = this.getSystemRuntime().deserialize(data, List.class);
			}
		}
		List list =  new ArrayList();
		if(obj instanceof Boolean) {
			IScriptList scriptList = this.getSystemRuntime().createScriptList(list, (Boolean)obj);
			if(source != null) {
				scriptList.addAll(source);
			}
			return scriptList;
		}
		
		IScriptList scriptList = this.getSystemRuntime().createScriptList(list);
		if(source != null) {
			scriptList.addAll(source);
		}
		return scriptList;
	}

	@Override
	public IScriptPage page() {
		return page(null);
	}

	@Override
	public IScriptPage page(Object obj) {
		return page(obj, null);
	}

	@Override
	public IScriptPage page(Object obj, Object data) {
		List source = null;
		if (data != null) {
			if (obj instanceof String) {
				String strName = obj.toString();
				IDataEntityRuntime iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(strName);
				source = iDataEntityRuntime.deserializeEntityList(data);
			} else {
				source = this.getSystemRuntime().deserialize(data, List.class);
			}
		}
		Page page = new ScriptPageImpl(new ArrayList<>(), Pageable.unpaged(), 0);
		if (obj instanceof Boolean) {
			IScriptPage iScriptPage = this.getSystemRuntime().createScriptPage(page, (Boolean) obj);
			if (source != null) {
				iScriptPage.addAll(source);
			}
			return iScriptPage;
		}

		IScriptPage iScriptPage = this.getSystemRuntime().createScriptPage(page);
		if (source != null) {
			iScriptPage.addAll(source);
		}
		return iScriptPage;
	}

	@Override
	public IScriptPage page(Object obj, Object data, int pageNo, int size) {
		List source = null;
		if (data != null) {
			if (obj instanceof String) {
				String strName = obj.toString();
				IDataEntityRuntime iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(strName);
				source = iDataEntityRuntime.deserializeEntityList(data);
			} else {
				source = this.getSystemRuntime().deserialize(data, List.class);
			}
		}
		Page page = new ScriptPageImpl(new ArrayList<>(), PageRequest.of(pageNo, size), 0);
		if (obj instanceof Boolean) {
			IScriptPage iScriptPage = this.getSystemRuntime().createScriptPage(page, (Boolean) obj);
			if (source != null) {
				iScriptPage.addAll(source);
			}
			return iScriptPage;
		}

		IScriptPage iScriptPage = this.getSystemRuntime().createScriptPage(page);
		if (source != null) {
			iScriptPage.addAll(source);
		}
		return iScriptPage;
	}

	@Override
	public IScriptSequence sequence(String strTag) {
		Assert.hasLength(strTag, "传入标识无效");
		String strCacheTag = String.format("_IScriptSequence_%1$s", strTag).toLowerCase();
		Object obj = this.getCache(strCacheTag);
		if (obj == null) {
			IPSSysSequence iPSSysSequence = this.getSystemRuntimeContext().getPSSystemService().getPSSysSequence(strTag, false);
			IScriptSequence iScriptSequence = new ScriptSequence(this.getSystemRuntime().getSysSequenceRuntime(iPSSysSequence));
			this.setCache(strCacheTag, iScriptSequence);
			return iScriptSequence;
		}
		return (IScriptSequence) obj;
	}

	@Override
	public IScriptTranslator translator(String strTag) {
		Assert.hasLength(strTag, "传入标识无效");
		String strCacheTag = String.format("_IScriptTranslator_%1$s", strTag).toLowerCase();
		Object obj = this.getCache(strCacheTag);
		if (obj == null) {
			IPSSysTranslator iPSSysTranslator = this.getSystemRuntime().getPSSystemService().getPSSysTranslator(strTag, false);
			IScriptTranslator iScriptTranslator = new ScriptTranslator(this.getSystemRuntime().getSysTranslatorRuntime(iPSSysTranslator));
			this.setCache(strCacheTag, iScriptTranslator);
			return iScriptTranslator;
		}
		return (IScriptTranslator) obj;
	}

	@Override
	public IScriptWebClient webclient() {
		if (this.iScriptWebClient == null) {
			this.iScriptWebClient = new ScriptWebClient(this.getSystemRuntime(), null, this.getSystemRuntime().getDefaultWebClient());
		}
		return this.iScriptWebClient;
	}

	@Override
	public IScriptWebClient webclient(String strTag) {
		Assert.hasLength(strTag, "传入标识无效");
		String strCacheTag = String.format("_IScriptWebClient_%1$s", strTag).toLowerCase();
		Object obj = this.getCache(strCacheTag);
		if (obj == null) {
			IPSSubSysServiceAPI iPSSubServiceAPI = this.getSystemRuntime().getPSSystemService().getPSSubSysServiceAPI(strTag, false);
			ISubSysServiceAPIRuntime iSubSysServiceAPIRuntime = this.getSystemRuntime().getSubSysServiceAPIRuntime(iPSSubServiceAPI);
			IScriptWebClient iScriptWebClient = new ScriptWebClient(this.getSystemRuntime(), iSubSysServiceAPIRuntime, iSubSysServiceAPIRuntime.getWebClient());
			this.setCache(strCacheTag, iScriptWebClient);
			return iScriptWebClient;
		}
		return (IScriptWebClient) obj;
	}

	@Override
	public Object config(String strKey, Object defValue) {
		Object objValue = this.getSystemRuntime().getSystemRuntimeSetting().getParam(strKey);
		if (objValue != null) {
			return objValue;
		}
		return defValue;
	}

	@Override
	public IScriptEntity selectone(String strName, String strCondition) {
		return this.selectOne(strName, strCondition);
	}

	@Override
	public void info(String strInfo, Object... infos) {
		StringBuilder sb = new StringBuilder();
		sb.append(strInfo);
		for(Object objInfo : infos) {
			if(objInfo == null) {
				sb.append(objInfo);
				continue;
			}
			Object objReal = ScriptUtils.getReal(objInfo);
			if(objReal instanceof java.util.Date) {
				sb.append(DateUtils.toDateTimeString((java.util.Date)objReal));
				continue;
			}
			
			sb.append(objReal.toString());
		}
		
		this.info(sb.toString());
	}

	@Override
	public void warn(String strInfo, Object... infos) {
		StringBuilder sb = new StringBuilder();
		sb.append(strInfo);
		for(Object objInfo : infos) {
			if(objInfo == null) {
				sb.append(objInfo);
				continue;
			}
			Object objReal = ScriptUtils.getReal(objInfo);
			if(objReal instanceof java.util.Date) {
				sb.append(DateUtils.toDateTimeString((java.util.Date)objReal));
				continue;
			}
			
			sb.append(objReal.toString());
		}
		
		this.warn(sb.toString());
	}

	@Override
	public void error(String strInfo, Object... infos) {
		StringBuilder sb = new StringBuilder();
		sb.append(strInfo);
		for(Object objInfo : infos) {
			if(objInfo == null) {
				sb.append(objInfo);
				continue;
			}
			Object objReal = ScriptUtils.getReal(objInfo);
			if(objReal instanceof java.util.Date) {
				sb.append(DateUtils.toDateTimeString((java.util.Date)objReal));
				continue;
			}
			
			sb.append(objReal.toString());
		}
		
		this.error(sb.toString());
	}
	
	
}
