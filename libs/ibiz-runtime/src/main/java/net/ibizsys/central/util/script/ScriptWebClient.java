package net.ibizsys.central.util.script;


import java.util.Map;

import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.service.RequestMethods;
import net.ibizsys.central.service.client.IWebClient;
import net.ibizsys.central.service.client.WebClientRepEntity;
import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.script.IScriptEntity;
import net.ibizsys.runtime.util.script.ScriptUtils;

public class ScriptWebClient implements IScriptWebClient{

	private ISystemRuntime iSystemRuntime = null;
	private IModelRuntime iModelRuntime = null;
	private IWebClient iWebClient = null;
	
	public ScriptWebClient(ISystemRuntime iSystemRuntime, IModelRuntime iModelRuntime, IWebClient iWebClient) {
		this.iSystemRuntime = iSystemRuntime;
		this.iModelRuntime = iModelRuntime;
		this.iWebClient = iWebClient;
	}
	
	protected ISystemRuntime getSystemRuntime() {
		return this.iSystemRuntime;
	}
	
	protected IModelRuntime getModelRuntime() {
		return this.iModelRuntime;
	}
	
	protected IWebClient getWebClient() {
		return this.iWebClient;
	}
	
	
	@Override
	public String getServiceUrl() {
		return this.getWebClient().getServiceUrl();
	}

	@Override
	public IScriptEntity get(Object param) {
		return execute(RequestMethods.GET, param);
	}

	@Override
	public IScriptEntity post(Object param) {
		return execute(RequestMethods.POST, param);
	}

	@Override
	public IScriptEntity head(Object param) {
		return execute(RequestMethods.HEAD, param);
	}
	
	@Override
	public IScriptEntity put(Object param) {
		return execute(RequestMethods.PUT, param);
	}

	@Override
	public IScriptEntity patch(Object param) {
		return execute(RequestMethods.PATCH, param);
	}

	@Override
	public IScriptEntity delete(Object param) {
		return execute(RequestMethods.DELETE, param);
	}

	@Override
	public IScriptEntity options(Object param) {
		return execute(RequestMethods.OPTIONS, param);
	}
	
	@Override
	public IScriptEntity trace(Object param) {
		return execute(RequestMethods.TRACE, param);
	}
	
	
	@Override
	public IScriptEntity upload(Object param) {
		return execute(METHOD_UPLOAD, param);
	}
	
	@Override
	public IScriptEntity download(Object param) {
		return execute(METHOD_DOWNLOAD, param);
	}
	

	@Override
	public IScriptEntity execute(String strMethod, Object param) {
		Assert.hasLength(strMethod, "未传入请求方式");
		return this.onExecute(strMethod, param);
	}
	
	
	protected IScriptEntity onExecute(String strMethod, Object param) {
		param = ScriptUtils.getReal(param);
		if(param == null) {
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getModelRuntime(), String.format("传入参数无效"));
		}
		String strUri = null;
		Map<String, Object> uriParams = null;
		Map<String, Object> headers = null;
		Map<String, Object> queries = null;
		Object objBody = null;
		Object objTag = null;
		String strContentType = null;
		if(param instanceof String) {
			strUri = (String)param;
		}
		else
			if(param instanceof Map) {
				Map map = (Map)param;
				Object obj = map.get("uri");
				if(obj instanceof String) {
					strUri = (String)obj;
				}
				else
				{
					obj = map.get("url");
					if(obj instanceof String) {
						strUri = (String)obj;
					}
				}
				
				obj = map.get("param");
				if(obj instanceof Map) {
					uriParams = (Map)obj;
					if(uriParams.size() == 0) {
						uriParams = null;
					}
				}
				
				obj = map.get("header");
				if(obj instanceof Map) {
					headers = (Map)obj;
					if(headers.size() == 0) {
						headers = null;
					}
				}
				
				obj = map.get("query");
				if(obj instanceof Map) {
					queries = (Map)obj;
					if(queries.size() == 0) {
						queries = null;
					}
				}
				
				obj = map.get("contenttype");
				if(obj instanceof String) {
					strContentType = (String)obj;
				}
				
				objBody = map.get("body");
				objTag = map.get("tag");
				
			}
			else
				throw new SystemRuntimeException(this.getSystemRuntime(), this.getModelRuntime(), String.format("无法识别的传入参数"));
		
		if(!StringUtils.hasLength(strUri)) {
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getModelRuntime(), String.format("未传入远程路径"));
		}
		
		try {
			
			if (RequestMethods.GET.equalsIgnoreCase(strMethod)) {
				if(queries == null) {
					if(objBody instanceof Map) {
						queries = (Map)objBody;
					}
				}
				return this.getSystemRuntime().createScriptEntity(WebClientRepEntity.from(this.getWebClient().get(strUri, uriParams, headers, queries, String.class, objTag)));
			}
			if (RequestMethods.POST.equalsIgnoreCase(strMethod)) {
				return this.getSystemRuntime().createScriptEntity(WebClientRepEntity.from(this.getWebClient().post(strUri, uriParams, headers, queries, objBody, strContentType, String.class, objTag)));
			}
			if (RequestMethods.PUT.equalsIgnoreCase(strMethod)) {
				return this.getSystemRuntime().createScriptEntity(WebClientRepEntity.from(this.getWebClient().put(strUri, uriParams, headers, queries,  objBody, strContentType, String.class, objTag)));
			}
			if (RequestMethods.PATCH.equalsIgnoreCase(strMethod)) {
				return this.getSystemRuntime().createScriptEntity(WebClientRepEntity.from(this.getWebClient().patch(strUri, uriParams, headers, queries,  objBody, strContentType, String.class, objTag)));
			}
			
			if (RequestMethods.DELETE.equalsIgnoreCase(strMethod)) {
				if(queries == null) {
					if(objBody instanceof Map) {
						queries = (Map)objBody;
					}
				}
				return this.getSystemRuntime().createScriptEntity(WebClientRepEntity.from(this.getWebClient().delete(strUri, uriParams, headers, queries, String.class, objTag)));
			}
			
			if (RequestMethods.HEAD.equalsIgnoreCase(strMethod)) {
				if(queries == null) {
					if(objBody instanceof Map) {
						queries = (Map)objBody;
					}
				}
				return this.getSystemRuntime().createScriptEntity(WebClientRepEntity.from(this.getWebClient().head(strUri, uriParams, headers, queries, String.class, objTag)));
			}
			
			if (METHOD_UPLOAD.equalsIgnoreCase(strMethod)) {
				return this.getSystemRuntime().createScriptEntity(WebClientRepEntity.from(this.getWebClient().upload(strUri, uriParams, headers, queries, objBody, objTag)));
			}
			
			if (METHOD_DOWNLOAD.equalsIgnoreCase(strMethod)) {
				return this.getSystemRuntime().createScriptEntity(WebClientRepEntity.from(this.getWebClient().download(strUri, uriParams, headers, queries, objBody, objTag)));
			}
			
//			if (RequestMethods.TRACE.equalsIgnoreCase(strMethod)) {
//				return this.getSystemRuntime().createScriptEntity(WebClientRepEntity.from(this.getWebClient().trace(strUri, uriParams, headers, objBody, String.class, objTag)));
//			}
//			
//			if (RequestMethods.OPTIONS.equalsIgnoreCase(strMethod)) {
//				return this.getSystemRuntime().createScriptEntity(WebClientRepEntity.from(this.getWebClient().options(strUri, uriParams, headers, objBody, String.class, objTag)));
//			}
		//				
//			if ("UPLOAD".equalsIgnoreCase(strMethod)) {
//			return this.upload(strUri, uriParams, headers, objData, cls, objTag);
//		}
//		if ("DOWNLOAD".equalsIgnoreCase(strMethod)) {
//			return this.download(strUri, uriParams, headers, objData, cls, objTag);
//		}
			
			throw new Exception(String.format("无法识别的请求方式[%1$s]", strMethod));
			
		}
		catch(Throwable ex) {
			//throw new SystemRuntimeException(this.getSystemRuntime(), this.getModelRuntime(), String.format("Web请求发生异常，%1$s", ex.getMessage()), ex);
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getModelRuntime(), ex.getMessage(), ex);
		}
	}

	
}
