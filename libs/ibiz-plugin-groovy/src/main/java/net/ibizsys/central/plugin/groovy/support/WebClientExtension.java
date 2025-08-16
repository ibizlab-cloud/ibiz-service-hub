package net.ibizsys.central.plugin.groovy.support;

import java.util.Map;

import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import net.ibizsys.central.service.RequestMethods;
import net.ibizsys.central.service.client.IWebClient;
import net.ibizsys.central.service.client.WebClientRepEntity;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.script.ScriptUtils;

public class WebClientExtension {

	/**
	 * 扩展方式：下载文件
	 */
	final static String METHOD_DOWNLOAD = "DOWNLOAD";
	
	
	/**
	 * 扩展方式：上传文件
	 */
	final static String METHOD_UPLOAD = "UPLOAD";
	
	public static IEntity get(IWebClient iWebClient, Object param) {
		return execute(iWebClient, RequestMethods.GET, param);
	}

	public static IEntity post(IWebClient iWebClient, Object param) {
		return execute(iWebClient, RequestMethods.POST, param);
	}

	public static IEntity head(IWebClient iWebClient, Object param) {
		return execute(iWebClient, RequestMethods.HEAD, param);
	}

	public static IEntity put(IWebClient iWebClient, Object param) {
		return execute(iWebClient, RequestMethods.PUT, param);
	}

	public static IEntity patch(IWebClient iWebClient, Object param) {
		return execute(iWebClient, RequestMethods.PATCH, param);
	}

	public static IEntity delete(IWebClient iWebClient, Object param) {
		return execute(iWebClient, RequestMethods.DELETE, param);
	}

	public static IEntity options(IWebClient iWebClient, Object param) {
		return execute(iWebClient, RequestMethods.OPTIONS, param);
	}

	public static IEntity trace(IWebClient iWebClient, Object param) {
		return execute(iWebClient, RequestMethods.TRACE, param);
	}

	public static IEntity upload(IWebClient iWebClient, Object param) {
		return execute(iWebClient, METHOD_UPLOAD, param);
	}

	public static IEntity download(IWebClient iWebClient, Object param) {
		return execute(iWebClient, METHOD_DOWNLOAD, param);
	}

	public static IEntity execute(IWebClient iWebClient, String strMethod, Object param) {
		Assert.hasLength(strMethod, "未传入请求方式");
		return onExecute(iWebClient, strMethod, param);
	}

	protected static IEntity onExecute(IWebClient iWebClient, String strMethod, Object param) {
		param = ScriptUtils.getReal(param);
		if (param == null) {
			throw new SystemRuntimeException(iWebClient.getSystemRuntime(), null, String.format("传入参数无效"));
		}
		String strUri = null;
		Map<String, Object> uriParams = null;
		Map<String, Object> headers = null;
		Map<String, Object> queries = null;
		Object objBody = null;
		Object objTag = null;
		String strContentType = null;
		if (param instanceof String) {
			strUri = (String) param;
		} else if (param instanceof Map) {
			Map map = (Map) param;
			Object obj = map.get("uri");
			if (obj instanceof String) {
				strUri = (String) obj;
			} else {
				obj = map.get("url");
				if (obj instanceof String) {
					strUri = (String) obj;
				}
			}

			obj = map.get("param");
			if (obj instanceof Map) {
				uriParams = (Map) obj;
				if (uriParams.size() == 0) {
					uriParams = null;
				}
			}

			obj = map.get("header");
			if (obj instanceof Map) {
				headers = (Map) obj;
				if (headers.size() == 0) {
					headers = null;
				}
			}

			obj = map.get("query");
			if (obj instanceof Map) {
				queries = (Map) obj;
				if (queries.size() == 0) {
					queries = null;
				}
			}

			obj = map.get("contenttype");
			if (obj instanceof String) {
				strContentType = (String) obj;
			}

			objBody = map.get("body");
			objTag = map.get("tag");

		} else
			throw new SystemRuntimeException(iWebClient.getSystemRuntime(), null, String.format("无法识别的传入参数"));

		if (!StringUtils.hasLength(strUri)) {
			throw new SystemRuntimeException(iWebClient.getSystemRuntime(), null, String.format("未传入远程路径"));
		}

		try {

			if (RequestMethods.GET.equalsIgnoreCase(strMethod)) {
				if (queries == null) {
					if (objBody instanceof Map) {
						queries = (Map) objBody;
					}
				}
				return WebClientRepEntity.from(iWebClient.get(strUri, uriParams, headers, queries, String.class, objTag));
			}
			if (RequestMethods.POST.equalsIgnoreCase(strMethod)) {
				return WebClientRepEntity.from(iWebClient.post(strUri, uriParams, headers, queries, objBody, strContentType, String.class, objTag));
			}
			if (RequestMethods.PUT.equalsIgnoreCase(strMethod)) {
				return WebClientRepEntity.from(iWebClient.put(strUri, uriParams, headers, queries, objBody, strContentType, String.class, objTag));
			}
			if (RequestMethods.PATCH.equalsIgnoreCase(strMethod)) {
				return WebClientRepEntity.from(iWebClient.patch(strUri, uriParams, headers, queries, objBody, strContentType, String.class, objTag));
			}

			if (RequestMethods.DELETE.equalsIgnoreCase(strMethod)) {
				if (queries == null) {
					if (objBody instanceof Map) {
						queries = (Map) objBody;
					}
				}
				return WebClientRepEntity.from(iWebClient.delete(strUri, uriParams, headers, queries, String.class, objTag));
			}

			if (RequestMethods.HEAD.equalsIgnoreCase(strMethod)) {
				if (queries == null) {
					if (objBody instanceof Map) {
						queries = (Map) objBody;
					}
				}
				return WebClientRepEntity.from(iWebClient.head(strUri, uriParams, headers, queries, String.class, objTag));
			}

			if (METHOD_UPLOAD.equalsIgnoreCase(strMethod)) {
				return WebClientRepEntity.from(iWebClient.upload(strUri, uriParams, headers, queries, objBody, objTag));
			}

			if (METHOD_DOWNLOAD.equalsIgnoreCase(strMethod)) {
				return WebClientRepEntity.from(iWebClient.download(strUri, uriParams, headers, queries, objBody, objTag));
			}

			// if (RequestMethods.TRACE.equalsIgnoreCase(strMethod)) {
			// return
			// WebClientRepEntity.from(iWebClient.trace(strUri,
			// uriParams, headers, objBody, String.class, objTag)));
			// }
			//
			// if (RequestMethods.OPTIONS.equalsIgnoreCase(strMethod)) {
			// return
			// WebClientRepEntity.from(iWebClient.options(strUri,
			// uriParams, headers, objBody, String.class, objTag)));
			// }
			//
			// if ("UPLOAD".equalsIgnoreCase(strMethod)) {
			// return this.upload(strUri, uriParams, headers, objData, cls,
			// objTag);
			// }
			// if ("DOWNLOAD".equalsIgnoreCase(strMethod)) {
			// return this.download(strUri, uriParams, headers, objData, cls,
			// objTag);
			// }

			throw new Exception(String.format("无法识别的请求方式[%1$s]", strMethod));

		} catch (Throwable ex) {
			// throw new SystemRuntimeException(iWebClient.getSystemRuntime(),
			// this.getModelRuntime(), String.format("Web请求发生异常，%1$s",
			// ex.getMessage()), ex);
			throw new SystemRuntimeException(iWebClient.getSystemRuntime(), null, ex.getMessage(), ex);
		}
	}
}
