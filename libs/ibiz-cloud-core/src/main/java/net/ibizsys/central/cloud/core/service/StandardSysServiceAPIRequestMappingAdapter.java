package net.ibizsys.central.cloud.core.service;

import java.io.ByteArrayOutputStream;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo.Builder;

import net.ibizsys.central.cloud.core.app.IServiceAppRuntime;
import net.ibizsys.central.cloud.core.dataentity.ac.IDEChatCompletionRuntime;
import net.ibizsys.central.cloud.core.service.util.MethodHandlerBase;
import net.ibizsys.central.cloud.core.util.RestUtils;
import net.ibizsys.central.dataentity.service.DEServiceAPIModes;
import net.ibizsys.central.dataentity.service.IDEServiceAPIRSRuntime;
import net.ibizsys.central.dataentity.service.IDEServiceAPIRuntime;
import net.ibizsys.central.service.ISysServiceAPIRuntime;
import net.ibizsys.central.service.RequestMethods;
import net.ibizsys.central.util.Inflector;
import net.ibizsys.model.dataentity.service.IPSDEServiceAPI;
import net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod;
import net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS;

public class StandardSysServiceAPIRequestMappingAdapter extends SysServiceAPIRequestMappingAdapterBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(StandardSysServiceAPIRequestMappingAdapter.class);
	
	public static final class RequestMappingInfoEx{
		public static Builder paths(String... paths) {
			boolean bEmpty = false;
			for(String strPath : paths) {
				if(!StringUtils.hasLength(strPath)) {
					bEmpty = true;
					break;
				}
			}
			if(!bEmpty) {
				return RequestMappingInfo.paths(paths);
			}
			else {
				List<String> newList = new ArrayList<String>();
				for(String strPath : paths) {
					if(!StringUtils.hasLength(strPath)) {
						continue;
					}
					newList.add(strPath);
				}
				return RequestMappingInfo.paths(newList.toArray(new String[newList.size()]));
			}
		}
	}
	
	private Map<ISysServiceAPIRuntime, List<RequestMappingInfo>> requestMappingInfoMap = new HashMap<ISysServiceAPIRuntime, List<RequestMappingInfo>>();
	private Map<IServiceAppRuntime, List<RequestMappingInfo>> requestMappingInfoMap2 = new HashMap<IServiceAppRuntime, List<RequestMappingInfo>>();
	
	@Override
	public void registerMapping(ISysServiceAPIRuntime iSysServiceAPIRuntime) throws Exception {

		List<IPSDEServiceAPI> psDEServiceAPIs = iSysServiceAPIRuntime.getPSSysServiceAPI().getPSDEServiceAPIs();
		if (!ObjectUtils.isEmpty(psDEServiceAPIs)) {
			for (IPSDEServiceAPI iPSDEServiceAPI : psDEServiceAPIs) {
				// 只注册默认接口
				if (iPSDEServiceAPI.getAPIMode() == 1 || iPSDEServiceAPI.getAPIMode() == 0) {
					IDEServiceAPIRuntime iDEServiceAPIRuntime = iSysServiceAPIRuntime.getDEServiceAPIRuntime(iPSDEServiceAPI.getCodeName(), false);
					this.registerDEServiceAPIMapping(iDEServiceAPIRuntime, iSysServiceAPIRuntime);
				}
			}
		}
		
	}

	protected void registerDEServiceAPIMapping(IDEServiceAPIRuntime iDEServiceAPIRuntime, ISysServiceAPIRuntime iSysServiceAPIRuntime) throws Exception {

		String strDeploySystemId = iSysServiceAPIRuntime.getSystemRuntime().getServiceId();
		String strAPICodeName = iSysServiceAPIRuntime.getPSSysServiceAPI().getServiceCodeName().toLowerCase();
		String strCurId = iDEServiceAPIRuntime.getPSDEServiceAPI().getId();

		List<IPSDEServiceAPIRS> psDEServiceAPIRSs = iSysServiceAPIRuntime.getPSSysServiceAPI().getPSDEServiceAPIRSs();
		if (psDEServiceAPIRSs != null) {
			for (IPSDEServiceAPIRS iPSDEServiceAPIRS : psDEServiceAPIRSs) {
				if (iPSDEServiceAPIRS.getMinorPSDEServiceAPIMust().getId().equals(strCurId)) {
					List<IPSDEServiceAPIMethod> psDEServiceAPIMethods = iPSDEServiceAPIRS.getPSDEServiceAPIMethods();
					if (psDEServiceAPIMethods == null) {
						continue;
					}

					IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime = iSysServiceAPIRuntime.getDEServiceAPIRSRuntime(iPSDEServiceAPIRS.getId(), true);

					IPSDEServiceAPI majorPSDEServiceAPI = iPSDEServiceAPIRS.getMajorPSDEServiceAPIMust();

					String strPath = String.format("/%1$s/%2$s/%3$s/{pkey}/%4$s", strDeploySystemId, strAPICodeName, Inflector.getInstance().pluralize(majorPSDEServiceAPI.getCodeName()).toLowerCase(), Inflector.getInstance().pluralize(iDEServiceAPIRuntime.getPSDEServiceAPI().getCodeName()).toLowerCase());
					if(majorPSDEServiceAPI.getAPIMode() != DEServiceAPIModes.MAJOR) {
						strPath = "";
					}
					// 支持多层父
					String strPath2 = String.format("/%1$s/%2$s/**/%3$s/{pkey}/%4$s", strDeploySystemId, strAPICodeName, Inflector.getInstance().pluralize(majorPSDEServiceAPI.getCodeName()).toLowerCase(), Inflector.getInstance().pluralize(iDEServiceAPIRuntime.getPSDEServiceAPI().getCodeName()).toLowerCase());

					for (IPSDEServiceAPIMethod iPSDEServiceAPIMethod : psDEServiceAPIMethods) {

						if ("FETCH".equals(iPSDEServiceAPIMethod.getMethodType())) {
							String strRequestPath = StringUtils.hasLength(strPath)? (strPath + "/" + iPSDEServiceAPIMethod.getCodeName().toLowerCase()):null;
							String strRequestPath2 = strPath2 + "/" + iPSDEServiceAPIMethod.getCodeName().toLowerCase();
							RequestMappingInfo requestMappingInfo = RequestMappingInfoEx.paths(strRequestPath, strRequestPath2).methods(RequestMethod.valueOf(iPSDEServiceAPIMethod.getRequestMethod())).build();

							if (RequestMethods.POST.equals(iPSDEServiceAPIMethod.getRequestMethod())) {
								MethodHandlerBase methodHandlerBase = new MethodHandlerBase() {
									@Override
									protected Object onExecute(String pkey, Object requestData, String key) throws Throwable {
										return iSysServiceAPIRuntime.invokeDEMethod(null, majorPSDEServiceAPI.getName(), pkey, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), iPSDEServiceAPIMethod.getCodeName(), requestData, null, null);
									}
								};
								this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, methodHandlerBase, MethodHandlerBase.getPFetchMethod());
								if (this.getSysServiceAPIDocAdapter() != null) {
									this.getSysServiceAPIDocAdapter().registerMapping(iDEServiceAPIRuntime, iDEServiceAPIRSRuntime, iPSDEServiceAPIMethod, strRequestPath, strRequestPath2);
								}
							} else if (RequestMethods.GET.equals(iPSDEServiceAPIMethod.getRequestMethod())) {
								MethodHandlerBase methodHandlerBase = new MethodHandlerBase() {
									@Override
									protected Object onExecute(String pkey, Object requestData, String key) throws Throwable {
										return iSysServiceAPIRuntime.invokeDEMethod(null, majorPSDEServiceAPI.getName(), pkey, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), iPSDEServiceAPIMethod.getCodeName(), requestData, null, null);
									}
								};
								this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, methodHandlerBase, MethodHandlerBase.getPFetch0Method());
								if (this.getSysServiceAPIDocAdapter() != null) {
									this.getSysServiceAPIDocAdapter().registerMapping(iDEServiceAPIRuntime, iDEServiceAPIRSRuntime, iPSDEServiceAPIMethod, strRequestPath, strRequestPath2);
								}
							} else {
								log.warn(String.format("无法注册：FETCH[%1$s] %2$s", iPSDEServiceAPIMethod.getRequestMethod(), strRequestPath2));
							}

							continue;
						}

						if ("DEACTION".equals(iPSDEServiceAPIMethod.getMethodType())) {

							String strRequestPath = StringUtils.hasLength(strPath)?(strPath + getRequestPath(iPSDEServiceAPIMethod)):null;
							String strRequestPath2 = strPath2 + getRequestPath(iPSDEServiceAPIMethod);
							RequestMappingInfo requestMappingInfo = RequestMappingInfoEx.paths(strRequestPath, strRequestPath2).methods(RequestMethod.valueOf(iPSDEServiceAPIMethod.getRequestMethod())).build();

							if (RequestMethods.GET.equals(iPSDEServiceAPIMethod.getRequestMethod()) || RequestMethods.DELETE.equals(iPSDEServiceAPIMethod.getRequestMethod())) {
								if (iPSDEServiceAPIMethod.isNeedResourceKey()) {
									this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, new MethodHandlerBase() {
										@Override
										protected Object onExecute(String pkey, Object requestData, String key) throws Throwable {
											if(iPSDEServiceAPIMethod.isNoServiceCodeName()) {
												return iSysServiceAPIRuntime.invokeDEMethod(null, majorPSDEServiceAPI.getName(), pkey, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), iPSDEServiceAPIMethod.getPSDEActionMust().getCodeName(), null, key, null);
											}
											else {
												return iSysServiceAPIRuntime.invokeDEMethod(null, majorPSDEServiceAPI.getName(), pkey, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), iPSDEServiceAPIMethod.getCodeName(), null, key, null);
											}
											
										}
									}, MethodHandlerBase.getPGetMethod());
									if (this.getSysServiceAPIDocAdapter() != null) {
										this.getSysServiceAPIDocAdapter().registerMapping(iDEServiceAPIRuntime, iDEServiceAPIRSRuntime, iPSDEServiceAPIMethod, strRequestPath, strRequestPath2);
									}
								} else {
									this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, new MethodHandlerBase() {
										@Override
										protected Object onExecute(String pkey, Object requestData, String key) throws Throwable {
											if(iPSDEServiceAPIMethod.isNoServiceCodeName()) {
												return iSysServiceAPIRuntime.invokeDEMethod(null, majorPSDEServiceAPI.getName(), pkey, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), iPSDEServiceAPIMethod.getPSDEActionMust().getCodeName(), requestData, null, null);
											}
											else {
												return iSysServiceAPIRuntime.invokeDEMethod(null, majorPSDEServiceAPI.getName(), pkey, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), iPSDEServiceAPIMethod.getCodeName(), requestData, null, null);
											}
											
										}
									}, MethodHandlerBase.getPGet0Method());
									if (this.getSysServiceAPIDocAdapter() != null) {
										this.getSysServiceAPIDocAdapter().registerMapping(iDEServiceAPIRuntime, iDEServiceAPIRSRuntime, iPSDEServiceAPIMethod, strRequestPath, strRequestPath2);
									}
								}
								continue;
							}

							if (RequestMethods.POST.equals(iPSDEServiceAPIMethod.getRequestMethod()) || RequestMethods.PUT.equals(iPSDEServiceAPIMethod.getRequestMethod())) {
								if (iPSDEServiceAPIMethod.isNeedResourceKey()) {
									this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, new MethodHandlerBase() {
										@Override
										protected Object onExecute(String pkey, Object requestData, String key) throws Throwable {
											if(iPSDEServiceAPIMethod.isNoServiceCodeName()) {
												return iSysServiceAPIRuntime.invokeDEMethod(null, majorPSDEServiceAPI.getName(), pkey, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), iPSDEServiceAPIMethod.getPSDEActionMust().getCodeName(), requestData, key, null);
											}
											else {
												return iSysServiceAPIRuntime.invokeDEMethod(null, majorPSDEServiceAPI.getName(), pkey, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), iPSDEServiceAPIMethod.getCodeName(), requestData, key, null);
											}
											
										}
									}, MethodHandlerBase.getPPostMethod());

									if (this.getSysServiceAPIDocAdapter() != null) {
										this.getSysServiceAPIDocAdapter().registerMapping(iDEServiceAPIRuntime, iDEServiceAPIRSRuntime, iPSDEServiceAPIMethod, strRequestPath, strRequestPath2);
									}
								} else {
									this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, new MethodHandlerBase() {
										@Override
										protected Object onExecute(String pkey, Object requestData, String key) throws Throwable {
											if(iPSDEServiceAPIMethod.isNoServiceCodeName()) {
												return iSysServiceAPIRuntime.invokeDEMethod(null, majorPSDEServiceAPI.getName(), pkey, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), iPSDEServiceAPIMethod.getPSDEActionMust().getCodeName(), requestData, null, null);
											}
											else {
												return iSysServiceAPIRuntime.invokeDEMethod(null, majorPSDEServiceAPI.getName(), pkey, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), iPSDEServiceAPIMethod.getCodeName(), requestData, null, null);
											}
											
										}
									}, MethodHandlerBase.getPPost0Method());

									if (this.getSysServiceAPIDocAdapter() != null) {
										this.getSysServiceAPIDocAdapter().registerMapping(iDEServiceAPIRuntime, iDEServiceAPIRSRuntime, iPSDEServiceAPIMethod, strRequestPath, strRequestPath2);
									}
								}
								continue;
							}

							continue;
						}
					}

					// 文件上传，下载等
					if (true) {
						String strRequestPath = StringUtils.hasLength(strPath)?(strPath + "/importtemplate"):null;
						String strRequestPath2 = strPath2 + "/importtemplate";
						RequestMappingInfo requestMappingInfo = RequestMappingInfoEx.paths(strRequestPath, strRequestPath2).methods(RequestMethod.GET).build();

						this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, new MethodHandlerBase() {

							@Override
							protected void onDownloadX(String pkey, Object requestData, String key, String param, String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Throwable {
								String strImportTag = null;
								// 从请求中构建参数对象
								String strQueryString = httpServletRequest.getQueryString();
								Map<String, Object> map = RestUtils.queryString2Map(strQueryString);
								if (map != null) {
									strImportTag = (String) map.get("srfimporttag");
								}

								ByteArrayOutputStream bos = new ByteArrayOutputStream();
								Object ret = iSysServiceAPIRuntime.invokeDEGetImportTemplate(null, majorPSDEServiceAPI.getName(), pkey, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), strImportTag, bos);
								if(ret == ISysServiceAPIRuntime.RET_IGNOREPOSTPROCESS) {
									return;
								}
								String strLogicName = iDEServiceAPIRuntime.getPSDEServiceAPI().getLogicName();
								String strTemplateName = String.format("%1$s数据导入模板.xlsx", StringUtils.hasLength(strLogicName)?strLogicName:"");
								String strFileName = new String(URLEncoder.encode(strTemplateName, "utf-8").getBytes("utf-8"), "iso8859-1");

								httpServletResponse.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
								httpServletResponse.setHeader("Pragma", "no-cache");
								httpServletResponse.setHeader("Expires", "0");
								httpServletResponse.setHeader("charset", "utf-8");
								httpServletResponse.setHeader("Content-Disposition", String.format("attachment;filename=%s;filename*=utf-8''%s", strFileName, URLEncoder.encode(strTemplateName, "utf-8")));

								bos.writeTo(httpServletResponse.getOutputStream());
							}
						}, MethodHandlerBase.getDownloadXMethod());

					}
					
					if (true) {
				            
						String strRequestPath = StringUtils.hasLength(strPath)?(strPath + "/exportdata/{param}"):null;
						String strRequestPath2 = StringUtils.hasLength(strPath)?(strPath + "/exportdata/{param}/{key}"):null;
						String strRequestPath3 = strPath2 + "/exportdata/{param}";
						String strRequestPath4 = strPath2 + "/exportdata/{param}/{key}";
						
						
						RequestMappingInfo requestMappingInfo = RequestMappingInfoEx.paths(strRequestPath, strRequestPath2, strRequestPath3, strRequestPath4).methods(RequestMethod.POST).build();

						this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, new MethodHandlerBase() {

							@Override
							protected void onDownloadX(String pkey, Object requestData, String key, String param, String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Throwable {
								String strExportTag = null;
								// 从请求中构建参数对象
								String strQueryString = httpServletRequest.getQueryString();
								Map<String, Object> map = RestUtils.queryString2Map(strQueryString);
								if (map != null) {
									strExportTag = (String) map.get("srfexporttag");
								}

								ByteArrayOutputStream bos = new ByteArrayOutputStream();
								Object ret = iSysServiceAPIRuntime.invokeDEExportData(null, majorPSDEServiceAPI.getName(), pkey, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), strExportTag, param, requestData, key, bos);
								if(ret == ISysServiceAPIRuntime.RET_IGNOREPOSTPROCESS) {
									return;
								}
								
								String strTemplateName = "数据导出.xlsx";
								String strFileName = new String(URLEncoder.encode(strTemplateName, "utf-8").getBytes("utf-8"), "iso8859-1");
								httpServletResponse.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
								httpServletResponse.setHeader("Pragma", "no-cache");
								httpServletResponse.setHeader("Expires", "0");
								httpServletResponse.setHeader("charset", "utf-8");
								httpServletResponse.setHeader("Content-Disposition", String.format("attachment;filename=%s;filename*=utf-8''%s", strFileName, URLEncoder.encode(strTemplateName, "utf-8")));

								bos.writeTo(httpServletResponse.getOutputStream());
							}
						}, MethodHandlerBase.getDownloadXMethod());

					}
					
					if(true) {
						String strRequestPath = StringUtils.hasLength(strPath)?(strPath + "/asyncexportdata/{param}"):null;
						String strRequestPath2 = StringUtils.hasLength(strPath)?(strPath + "/asyncexportdata/{param}/{key}"):null;
						String strRequestPath3 = strPath2 + "/asyncexportdata/{param}";
						String strRequestPath4 = strPath2 + "/asyncexportdata/{param}/{key}";
						
						RequestMappingInfo requestMappingInfo = RequestMappingInfoEx.paths(strRequestPath, strRequestPath2, strRequestPath3, strRequestPath4).methods(RequestMethod.POST).build();
						this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, new MethodHandlerBase() {
							@Override
							protected Object onExecute(String pkey, Object requestData, String key, String param, String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletRespons) throws Throwable {
								String strExportTag = null;
								// 从请求中构建参数对象
								String strQueryString = httpServletRequest.getQueryString();
								Map<String, Object> map = RestUtils.queryString2Map(strQueryString);
								if (map != null) {
									strExportTag = (String) map.get("srfexporttag");
								}
								
								return iSysServiceAPIRuntime.invokeDEAsyncExportData(null, majorPSDEServiceAPI.getName(), pkey, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), strExportTag, param, requestData, key, null);
							}
						}, MethodHandlerBase.getExecuteMethod());
					}
					
					if(true) {
						String strRequestPath = StringUtils.hasLength(strPath)?(strPath + "/importdata"):null;
						String strRequestPath2 = strPath2 + "/importdata";
						RequestMappingInfo requestMappingInfo = RequestMappingInfoEx.paths(strRequestPath, strRequestPath2).methods(RequestMethod.POST).build();

						this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, new MethodHandlerBase() {

							@Override
							protected Object onUploadX(String pkey, MultipartFile multipartFile, String key, String param, String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Throwable {
								String strImportTag = null;
								// 从请求中构建参数对象
								String strQueryString = httpServletRequest.getQueryString();
								Map<String, Object> map = RestUtils.queryString2Map(strQueryString);
								if (map != null) {
									strImportTag = (String) map.get("srfimporttag");
								}
								
								return iSysServiceAPIRuntime.invokeDEImportData(null, majorPSDEServiceAPI.getName(), pkey, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), strImportTag, multipartFile, null);
							}
						}, MethodHandlerBase.getUploadXMethod());
					}
					
					if(true) {
						String strRequestPath = StringUtils.hasLength(strPath)?(strPath + "/importdata2"):null;
						String strRequestPath2 = strPath2 + "/importdata2";
						RequestMappingInfo requestMappingInfo = RequestMappingInfoEx.paths(strRequestPath, strRequestPath2).methods(RequestMethod.POST).build();

						this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, new MethodHandlerBase() {

							@Override
							protected Object onUploadX(String pkey, MultipartFile multipartFile, String key, String param, String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Throwable {
								String strImportTag = null;
								// 从请求中构建参数对象
								String strQueryString = httpServletRequest.getQueryString();
								Map<String, Object> map = RestUtils.queryString2Map(strQueryString);
								if (map != null) {
									strImportTag = (String) map.get("srfimporttag");
								}
								
								return iSysServiceAPIRuntime.invokeDEImportData2(null, majorPSDEServiceAPI.getName(), pkey, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), strImportTag, multipartFile, null);
							}
						}, MethodHandlerBase.getUploadXMethod());
					}
					
					if(true) {
						String strRequestPath = StringUtils.hasLength(strPath)?(strPath + "/asyncimportdata"):null;
						String strRequestPath2 = strPath2 + "/asyncimportdata";
						if(true) {
							RequestMappingInfo requestMappingInfo = RequestMappingInfoEx.paths(strRequestPath, strRequestPath2).methods(RequestMethod.POST).build();
							
							this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, new MethodHandlerBase() {

								@Override
								protected Object onUploadX(String pkey, MultipartFile multipartFile, String key, String param, String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Throwable {
									String strImportTag = null;
									// 从请求中构建参数对象
									String strQueryString = httpServletRequest.getQueryString();
									Map<String, Object> map = RestUtils.queryString2Map(strQueryString);
									if (map != null) {
										strImportTag = (String) map.get("srfimporttag");
									}
									
									return iSysServiceAPIRuntime.invokeDEAsyncImportData(null, majorPSDEServiceAPI.getName(), pkey, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), strImportTag, multipartFile, null);
								}
							}, MethodHandlerBase.getUploadXMethod());
						}
						
						if(true) {
							RequestMappingInfo requestMappingInfo = RequestMappingInfoEx.paths(strRequestPath, strRequestPath2).methods(RequestMethod.GET).build();
							this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, new MethodHandlerBase() {
								@Override
								protected Object onExecute(String pkey, Object requestData, String key, String param, String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletRespons) throws Throwable {
									String strImportTag = null;
									String strOSSFileId = null;
									String strImportSchemaId = null;
									// 从请求中构建参数对象
									String strQueryString = httpServletRequest.getQueryString();
									Map<String, Object> map = RestUtils.queryString2Map(strQueryString);
									if (map != null) {
										strImportTag = (String) map.get("srfimporttag");
										strOSSFileId = (String) map.get("srfossfileid");
										strImportSchemaId = (String) map.get("srfimportschemaid");
									}
									
									net.ibizsys.central.cloud.core.service.ISysServiceAPIRuntime realSysServiceAPIRuntime = (net.ibizsys.central.cloud.core.service.ISysServiceAPIRuntime)iSysServiceAPIRuntime;
									
									return realSysServiceAPIRuntime.invokeDEAsyncImportData(null, majorPSDEServiceAPI.getName(), pkey, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), strImportTag, strOSSFileId, strImportSchemaId, null);
								}
							}, MethodHandlerBase.getExecuteMethod());
						}
					}
					
					if(true) {
						String strRequestPath = StringUtils.hasLength(strPath)?(strPath + "/asyncimportdata2"):null;
						String strRequestPath2 = strPath2 + "/asyncimportdata2";
						if(true) {
							RequestMappingInfo requestMappingInfo = RequestMappingInfoEx.paths(strRequestPath, strRequestPath2).methods(RequestMethod.POST).build();

							this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, new MethodHandlerBase() {
								@Override
								protected Object onUploadX(String pkey, MultipartFile multipartFile, String key, String param, String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Throwable {
									String strImportTag = null;
									// 从请求中构建参数对象
									String strQueryString = httpServletRequest.getQueryString();
									Map<String, Object> map = RestUtils.queryString2Map(strQueryString);
									if (map != null) {
										strImportTag = (String) map.get("srfimporttag");
									}
									
									return iSysServiceAPIRuntime.invokeDEAsyncImportData2(null, majorPSDEServiceAPI.getName(), pkey, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), strImportTag, multipartFile, null);
								}
							}, MethodHandlerBase.getUploadXMethod());
						}
						
						if(true) {
							RequestMappingInfo requestMappingInfo = RequestMappingInfoEx.paths(strRequestPath, strRequestPath2).methods(RequestMethod.GET).build();
							this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, new MethodHandlerBase() {
								@Override
								protected Object onExecute(String pkey, Object requestData, String key, String param, String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletRespons) throws Throwable {
									String strImportTag = null;
									String strOSSFileId = null;
									String strImportSchemaId = null;
									// 从请求中构建参数对象
									String strQueryString = httpServletRequest.getQueryString();
									Map<String, Object> map = RestUtils.queryString2Map(strQueryString);
									if (map != null) {
										strImportTag = (String) map.get("srfimporttag");
										strOSSFileId = (String) map.get("srfossfileid");
										strImportSchemaId = (String) map.get("srfimportschemaid");
									}
									
									net.ibizsys.central.cloud.core.service.ISysServiceAPIRuntime realSysServiceAPIRuntime = (net.ibizsys.central.cloud.core.service.ISysServiceAPIRuntime)iSysServiceAPIRuntime;
									
									return realSysServiceAPIRuntime.invokeDEAsyncImportData2(null, majorPSDEServiceAPI.getName(), pkey, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), strImportTag, strOSSFileId, strImportSchemaId, null);
								}
							}, MethodHandlerBase.getExecuteMethod());
						}
						
					}
					
					
					// 打印数据
					if (true) {
						String strRequestPath = StringUtils.hasLength(strPath)?(strPath + "/printdata/{key}"):null;
						String strRequestPath2 = strPath2 + "/printdata/{key}";
						RequestMappingInfo requestMappingInfo = RequestMappingInfoEx.paths(strRequestPath, strRequestPath2).methods(RequestMethod.GET).build();

						this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, new MethodHandlerBase() {

							@Override
							protected void onDownloadX(String pkey, Object requestData, String key, String param, String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Throwable {
								String strPrintTag = null;
								String strContentType = null;
								// 从请求中构建参数对象
								String strQueryString = httpServletRequest.getQueryString();
								Map<String, Object> map = RestUtils.queryString2Map(strQueryString);
								if (map != null) {
									strPrintTag = (String) map.get("srfprinttag");
									strContentType = (String) map.get("srfcontenttype");
								}

								iSysServiceAPIRuntime.invokeDEPrintData(null, majorPSDEServiceAPI.getName(), pkey, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), strPrintTag, strContentType, requestData, key, httpServletResponse);
								 
//								ByteArrayOutputStream bos = new ByteArrayOutputStream();
//								Object ret = iSysServiceAPIRuntime.invokeDEPrintData(null, majorPSDEServiceAPI.getName(), pkey, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), strPrintTag, strContentType, requestData, key, bos);
//								if(ret == ISysServiceAPIRuntime.RET_IGNOREPOSTPROCESS) {
//									return;
//								}
//
//								String strPrintName = "print.pdf";
//								String strFileName = new String(URLEncoder.encode(strPrintName, "utf-8").getBytes("utf-8"), "iso8859-1");
//								httpServletResponse.setContentType("application/pdf");
//								httpServletResponse.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
//								httpServletResponse.setHeader("Pragma", "no-cache");
//								httpServletResponse.setHeader("Expires", "0");
//								httpServletResponse.setHeader("charset", "utf-8");
//								httpServletResponse.setHeader("Content-Disposition", String.format("attachment;filename=%s;filename*=utf-8''%s", strFileName, URLEncoder.encode(strPrintTag, "utf-8")));
//
//								bos.writeTo(httpServletResponse.getOutputStream());
							}
						}, MethodHandlerBase.getDownloadXMethod());
					}
					
					// 实体报表
					if (true) {
						String strRequestPath = StringUtils.hasLength(strPath)?(strPath + "/report"):null;
						String strRequestPath2 = strPath2 + "/report";
						RequestMappingInfo requestMappingInfo = RequestMappingInfoEx.paths(strRequestPath, strRequestPath2).methods(RequestMethod.POST).build();

						this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, new MethodHandlerBase() {

							@Override
							protected void onDownloadX(String pkey, Object requestData, String key, String param, String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Throwable {
								String strReportTag = null;
								String strContentType = null;
								// 从请求中构建参数对象
								String strQueryString = httpServletRequest.getQueryString();
								Map<String, Object> map = RestUtils.queryString2Map(strQueryString);
								if (map != null) {
									strReportTag = (String) map.get("srfreporttag");
									strContentType = (String) map.get("srfcontenttype");
								}

								iSysServiceAPIRuntime.invokeDEReport(null, majorPSDEServiceAPI.getName(), pkey, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), strReportTag, strContentType, requestData, httpServletResponse);
								
//								ByteArrayOutputStream bos = new ByteArrayOutputStream();
//								Object ret = iSysServiceAPIRuntime.invokeDEReport(null, majorPSDEServiceAPI.getName(), pkey, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), strReportTag, strContentType, requestData, bos);
//								if(ret == ISysServiceAPIRuntime.RET_IGNOREPOSTPROCESS) {
//									return;
//								}
//
//								String strReportName = "report.pdf";
//								String strFileName = new String(URLEncoder.encode(strReportName, "utf-8").getBytes("utf-8"), "iso8859-1");
//								httpServletResponse.setContentType("application/pdf");
//								httpServletResponse.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
//								httpServletResponse.setHeader("Pragma", "no-cache");
//								httpServletResponse.setHeader("Expires", "0");
//								httpServletResponse.setHeader("charset", "utf-8");
//								httpServletResponse.setHeader("Content-Disposition", String.format("attachment;filename=%s;filename*=utf-8''%s", strFileName, URLEncoder.encode(strReportTag, "utf-8")));
//
//								bos.writeTo(httpServletResponse.getOutputStream());
							}
						}, MethodHandlerBase.getDownloadXMethod());
					}
					
					if (true) {
						String strRequestPath = StringUtils.hasLength(strPath)?(strPath + "/ac/{param}"):null;
						String strRequestPath2 = strPath2 + "/ac/{param}";
						RequestMappingInfo requestMappingInfo = RequestMappingInfoEx.paths(strRequestPath, strRequestPath2).methods(RequestMethod.POST).build();

						this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, new MethodHandlerBase() {
							@Override
							protected Object onExecute(String pkey, Object requestData, String key, String param, String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletRespons) throws Throwable {
								
								String strACTag = null;
								
								// 从请求中构建参数对象
								String strQueryString = httpServletRequest.getQueryString();
								Map<String, Object> map = RestUtils.queryString2Map(strQueryString);
								if (map != null) {
									strACTag = (String) map.get("srfactag");
								}
								
								return iSysServiceAPIRuntime.invokeDEAutoComplete(null, majorPSDEServiceAPI.getName(), pkey, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), strACTag, param, requestData, null);
							}
						}, MethodHandlerBase.getExecuteMethod());
					}
					
					if (true) {
						String strRequestPath = StringUtils.hasLength(strPath)?(strPath + "/chatcompletion"):null;
						String strRequestPath2 = strPath2 + "/chatcompletion";
						String strRequestPath3 = StringUtils.hasLength(strPath)?(strPath + "/chatcompletion/{key}"):null;
						String strRequestPath4 = strPath2 + "/chatcompletion/{key}";
						RequestMappingInfo requestMappingInfo = RequestMappingInfoEx.paths(strRequestPath, strRequestPath2, strRequestPath3, strRequestPath4).methods(RequestMethod.POST).build();

						this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, new MethodHandlerBase() {
							@Override
							protected Object onExecute(String pkey, Object requestData, String key, String param, String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletRespons) throws Throwable {
								
								String strACTag = null;
								
								// 从请求中构建参数对象
								String strQueryString = httpServletRequest.getQueryString();
								Map<String, Object> map = RestUtils.queryString2Map(strQueryString);
								if (map != null) {
									strACTag = (String) map.get("srfactag");
								}
								
								net.ibizsys.central.cloud.core.service.ISysServiceAPIRuntime realSysServiceAPIRuntime = (net.ibizsys.central.cloud.core.service.ISysServiceAPIRuntime)iSysServiceAPIRuntime;
								
								return realSysServiceAPIRuntime.invokeDEChatCompletion(null, majorPSDEServiceAPI.getName(), pkey, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), strACTag, IDEChatCompletionRuntime.METHOD_CHATCOMPLETION, requestData, key, null);
							}
						}, MethodHandlerBase.getExecuteMethod());
					}
					
					if (true) {
						String strRequestPath = StringUtils.hasLength(strPath)?(strPath + "/chatsuggestion"):null;
						String strRequestPath2 = strPath2 + "/chatsuggestion";
						String strRequestPath3 = StringUtils.hasLength(strPath)?(strPath + "/chatsuggestion/{key}"):null;
						String strRequestPath4 = strPath2 + "/chatsuggestion/{key}";
						RequestMappingInfo requestMappingInfo = RequestMappingInfoEx.paths(strRequestPath, strRequestPath2, strRequestPath3, strRequestPath4).methods(RequestMethod.POST).build();

						this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, new MethodHandlerBase() {
							@Override
							protected Object onExecute(String pkey, Object requestData, String key, String param, String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletRespons) throws Throwable {
								
								String strACTag = null;
								
								// 从请求中构建参数对象
								String strQueryString = httpServletRequest.getQueryString();
								Map<String, Object> map = RestUtils.queryString2Map(strQueryString);
								if (map != null) {
									strACTag = (String) map.get("srfactag");
								}
								
								net.ibizsys.central.cloud.core.service.ISysServiceAPIRuntime realSysServiceAPIRuntime = (net.ibizsys.central.cloud.core.service.ISysServiceAPIRuntime)iSysServiceAPIRuntime;
								
								return realSysServiceAPIRuntime.invokeDEChatCompletion(null, majorPSDEServiceAPI.getName(), pkey, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), strACTag, IDEChatCompletionRuntime.METHOD_CHATSUGGESTION, requestData, key, null);
							}
						}, MethodHandlerBase.getExecuteMethod());
					}
					
					
					if (true) {
						String strRequestPath = StringUtils.hasLength(strPath)?(strPath + "/ssechatcompletion"):null;
						String strRequestPath2 = strPath2 + "/ssechatcompletion";
						String strRequestPath3 = StringUtils.hasLength(strPath)?(strPath + "/ssechatcompletion/{key}"):null;
						String strRequestPath4 = strPath2 + "/ssechatcompletion/{key}";
						
						RequestMappingInfo requestMappingInfo = RequestMappingInfoEx.paths(strRequestPath, strRequestPath2, strRequestPath3, strRequestPath4).methods(RequestMethod.POST).build();

						this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, new MethodHandlerBase() {
							@Override
							protected Object onExecute(String pkey, Object requestData, String key, String param, String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletRespons) throws Throwable {
								
								String strACTag = null;
								
								// 从请求中构建参数对象
								String strQueryString = httpServletRequest.getQueryString();
								Map<String, Object> map = RestUtils.queryString2Map(strQueryString);
								if (map != null) {
									strACTag = (String) map.get("srfactag");
								}
								
								net.ibizsys.central.cloud.core.service.ISysServiceAPIRuntime realSysServiceAPIRuntime = (net.ibizsys.central.cloud.core.service.ISysServiceAPIRuntime)iSysServiceAPIRuntime;
								
								return realSysServiceAPIRuntime.invokeDEChatCompletion(null, majorPSDEServiceAPI.getName(), pkey, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), strACTag, IDEChatCompletionRuntime.METHOD_SSECHATCOMPLETION, requestData, key, null);
							}
						}, MethodHandlerBase.getExecuteMethod());
					}
					
					if (true) {
						String strRequestPath = StringUtils.hasLength(strPath)?(strPath + "/ssechatcompletion/histories"):null;
						String strRequestPath2 = strPath2 + "/ssechatcompletion/histories";
						String strRequestPath3 = StringUtils.hasLength(strPath)?(strPath + "/chatcompletion/histories"):null;
						String strRequestPath4 = strPath2 + "/chatcompletion/histories";
						String strRequestPath5 = StringUtils.hasLength(strPath)?(strPath + "/ssechatcompletion/histories/{key}"):null;
						String strRequestPath6 = strPath2 + "/ssechatcompletion/histories/{key}";
						String strRequestPath7 = StringUtils.hasLength(strPath)?(strPath + "/chatcompletion/histories/{key}"):null;
						String strRequestPath8 = strPath2 + "/chatcompletion/histories/{key}";
						
						
						RequestMappingInfo requestMappingInfo = RequestMappingInfoEx.paths(
								strRequestPath, strRequestPath2, strRequestPath3, strRequestPath4
								,strRequestPath5, strRequestPath6, strRequestPath7, strRequestPath8
								
								).methods(RequestMethod.POST).build();

						this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, new MethodHandlerBase() {
							@Override
							protected Object onExecute(String pkey, Object requestData, String key, String param, String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletRespons) throws Throwable {
								
								String strACTag = null;
								
								// 从请求中构建参数对象
								String strQueryString = httpServletRequest.getQueryString();
								Map<String, Object> map = RestUtils.queryString2Map(strQueryString);
								if (map != null) {
									strACTag = (String) map.get("srfactag");
								}
								
								net.ibizsys.central.cloud.core.service.ISysServiceAPIRuntime realSysServiceAPIRuntime = (net.ibizsys.central.cloud.core.service.ISysServiceAPIRuntime)iSysServiceAPIRuntime;
								
								return realSysServiceAPIRuntime.invokeDEChatCompletion(null, majorPSDEServiceAPI.getName(), pkey, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), strACTag, IDEChatCompletionRuntime.METHOD_HISTORIES, requestData, key, null);
							}
						}, MethodHandlerBase.getExecuteMethod());
					}
					
					if (true) {
						String strRequestPath = StringUtils.hasLength(strPath)?(strPath + "/ssechatcompletion/resources"):null;
						String strRequestPath2 = strPath2 + "/ssechatcompletion/resources";
						String strRequestPath3 = StringUtils.hasLength(strPath)?(strPath + "/chatcompletion/resources"):null;
						String strRequestPath4 = strPath2 + "/chatcompletion/resources";
						String strRequestPath5 = StringUtils.hasLength(strPath)?(strPath + "/ssechatcompletion/resources/{key}"):null;
						String strRequestPath6 = strPath2 + "/ssechatcompletion/resources/{key}";
						String strRequestPath7 = StringUtils.hasLength(strPath)?(strPath + "/chatcompletion/resources/{key}"):null;
						String strRequestPath8 = strPath2 + "/chatcompletion/resources/{key}";
						
						
						RequestMappingInfo requestMappingInfo = RequestMappingInfoEx.paths(
								strRequestPath, strRequestPath2, strRequestPath3, strRequestPath4
								,strRequestPath5, strRequestPath6, strRequestPath7, strRequestPath8
								
								).methods(RequestMethod.POST).build();

						this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, new MethodHandlerBase() {
							@Override
							protected Object onExecute(String pkey, Object requestData, String key, String param, String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletRespons) throws Throwable {
								
								String strACTag = null;
								
								// 从请求中构建参数对象
								String strQueryString = httpServletRequest.getQueryString();
								Map<String, Object> map = RestUtils.queryString2Map(strQueryString);
								if (map != null) {
									strACTag = (String) map.get("srfactag");
								}
								
								net.ibizsys.central.cloud.core.service.ISysServiceAPIRuntime realSysServiceAPIRuntime = (net.ibizsys.central.cloud.core.service.ISysServiceAPIRuntime)iSysServiceAPIRuntime;
								
								return realSysServiceAPIRuntime.invokeDEChatCompletion(null, majorPSDEServiceAPI.getName(), pkey, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), strACTag, IDEChatCompletionRuntime.METHOD_RESOURCES, requestData, key, null);
							}
						}, MethodHandlerBase.getExecuteMethod());
					}
				}
			}
		}
		
		if(iDEServiceAPIRuntime.getAPIMode() == DEServiceAPIModes.MINOR) {
			return;
		}

		List<IPSDEServiceAPIMethod> psDEServiceAPIMethods = iDEServiceAPIRuntime.getPSDEServiceAPI().getPSDEServiceAPIMethods();
		if (psDEServiceAPIMethods == null) {
			return;
		}

		String strPath = String.format("/%1$s/%2$s/%3$s", iSysServiceAPIRuntime.getSystemRuntime().getServiceId(), iSysServiceAPIRuntime.getPSSysServiceAPI().getServiceCodeName().toLowerCase(), Inflector.getInstance().pluralize(iDEServiceAPIRuntime.getPSDEServiceAPI().getCodeName()).toLowerCase());
		// String strServiceCodeName =
		for (IPSDEServiceAPIMethod iPSDEServiceAPIMethod : psDEServiceAPIMethods) {

			if ("FETCH".equals(iPSDEServiceAPIMethod.getMethodType())) {
				String strRequestPath = strPath + "/" + iPSDEServiceAPIMethod.getCodeName().toLowerCase();
				RequestMappingInfo requestMappingInfo = RequestMappingInfo.paths(strRequestPath).methods(RequestMethod.valueOf(iPSDEServiceAPIMethod.getRequestMethod())).build();

				if (RequestMethods.POST.equals(iPSDEServiceAPIMethod.getRequestMethod())) {
					MethodHandlerBase methodHandlerBase = new MethodHandlerBase() {
						@Override
						protected Object onExecute(String pkey, Object requestData, String key) throws Throwable {
							return iSysServiceAPIRuntime.invokeDEMethod(null, null, null, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), iPSDEServiceAPIMethod.getCodeName(), requestData, key, null);
						}
					};
					this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, methodHandlerBase, MethodHandlerBase.getFetchMethod());
					if (this.getSysServiceAPIDocAdapter() != null) {
						this.getSysServiceAPIDocAdapter().registerMapping(iDEServiceAPIRuntime, null, iPSDEServiceAPIMethod, strRequestPath);
					}

				} else if (RequestMethods.GET.equals(iPSDEServiceAPIMethod.getRequestMethod())) {
					MethodHandlerBase methodHandlerBase = new MethodHandlerBase() {
						@Override
						protected Object onExecute(String pkey, Object requestData, String key) throws Throwable {
							return iSysServiceAPIRuntime.invokeDEMethod(null, null, null, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), iPSDEServiceAPIMethod.getCodeName(), requestData, key, null);
						}
					};
					this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, methodHandlerBase, MethodHandlerBase.getFetch0Method());
					if (this.getSysServiceAPIDocAdapter() != null) {
						this.getSysServiceAPIDocAdapter().registerMapping(iDEServiceAPIRuntime, null, iPSDEServiceAPIMethod, strRequestPath);
					}
				} else {
					log.warn(String.format("无法注册：FETCH[%1$s] %2$s", iPSDEServiceAPIMethod.getRequestMethod(), strRequestPath));
				}

				continue;
			}

			if ("DEACTION".equals(iPSDEServiceAPIMethod.getMethodType())) {

				String strRequestPath = strPath + getRequestPath(iPSDEServiceAPIMethod);
				RequestMappingInfo requestMappingInfo = RequestMappingInfo.paths(strRequestPath).methods(RequestMethod.valueOf(iPSDEServiceAPIMethod.getRequestMethod())).build();

				if (RequestMethods.GET.equals(iPSDEServiceAPIMethod.getRequestMethod()) || RequestMethods.DELETE.equals(iPSDEServiceAPIMethod.getRequestMethod())) {
					if (iPSDEServiceAPIMethod.isNeedResourceKey()) {
						this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, new MethodHandlerBase() {
							@Override
							protected Object onExecute(String pkey, Object requestData, String key) throws Throwable {
								if(iPSDEServiceAPIMethod.isNoServiceCodeName()) {
									return iSysServiceAPIRuntime.invokeDEMethod(null, null, null, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), iPSDEServiceAPIMethod.getPSDEActionMust().getCodeName(), requestData, key, null);
								}
								else {
									return iSysServiceAPIRuntime.invokeDEMethod(null, null, null, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), iPSDEServiceAPIMethod.getCodeName(), requestData, key, null);
								}
							}
						}, MethodHandlerBase.getGetMethod());
						if (this.getSysServiceAPIDocAdapter() != null) {
							this.getSysServiceAPIDocAdapter().registerMapping(iDEServiceAPIRuntime, null, iPSDEServiceAPIMethod, strRequestPath);
						}
					} else {
						this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, new MethodHandlerBase() {
							@Override
							protected Object onExecute(String pkey, Object requestData, String key) throws Throwable {
								if(iPSDEServiceAPIMethod.isNoServiceCodeName()) {
									return iSysServiceAPIRuntime.invokeDEMethod(null, null, null, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), iPSDEServiceAPIMethod.getPSDEActionMust().getCodeName(), requestData, key, null);
								}
								else {
									return iSysServiceAPIRuntime.invokeDEMethod(null, null, null, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), iPSDEServiceAPIMethod.getCodeName(), requestData, key, null);
								}
							}
						}, MethodHandlerBase.getGet0Method());
						
						if (this.getSysServiceAPIDocAdapter() != null) {
							this.getSysServiceAPIDocAdapter().registerMapping(iDEServiceAPIRuntime, null, iPSDEServiceAPIMethod, strRequestPath);
						}
					}
					continue;
				}

				if (RequestMethods.POST.equals(iPSDEServiceAPIMethod.getRequestMethod()) || RequestMethods.PUT.equals(iPSDEServiceAPIMethod.getRequestMethod())) {
					if (iPSDEServiceAPIMethod.isNeedResourceKey()) {
						this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, new MethodHandlerBase() {
							@Override
							protected Object onExecute(String pkey, Object requestData, String key) throws Throwable {
								if(iPSDEServiceAPIMethod.isNoServiceCodeName()) {
									return iSysServiceAPIRuntime.invokeDEMethod(null, null, null, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), iPSDEServiceAPIMethod.getPSDEActionMust().getCodeName(), requestData, key, null);
								}
								else {
									return iSysServiceAPIRuntime.invokeDEMethod(null, null, null, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), iPSDEServiceAPIMethod.getCodeName(), requestData, key, null);
								}
							}
						}, MethodHandlerBase.getPostMethod());

						if (this.getSysServiceAPIDocAdapter() != null) {
							this.getSysServiceAPIDocAdapter().registerMapping(iDEServiceAPIRuntime, null, iPSDEServiceAPIMethod, strRequestPath);
						}
					} else {
						this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, new MethodHandlerBase() {
							@Override
							protected Object onExecute(String pkey, Object requestData, String key) throws Throwable {
								if(iPSDEServiceAPIMethod.isNoServiceCodeName()) {
									return iSysServiceAPIRuntime.invokeDEMethod(null, null, null, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), iPSDEServiceAPIMethod.getPSDEActionMust().getCodeName(), requestData, key, null);
								}
								else {
									return iSysServiceAPIRuntime.invokeDEMethod(null, null, null, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), iPSDEServiceAPIMethod.getCodeName(), requestData, key, null);
								}
							}
						}, MethodHandlerBase.getPost0Method());
						
						if (this.getSysServiceAPIDocAdapter() != null) {
							this.getSysServiceAPIDocAdapter().registerMapping(iDEServiceAPIRuntime, null, iPSDEServiceAPIMethod, strRequestPath);
						}
					}
					continue;
				}

				continue;
			}
		}

		// 文件上传，下载等
		if (true) {
			String strRequestPath = strPath + "/importtemplate";
			RequestMappingInfo requestMappingInfo = RequestMappingInfo.paths(strRequestPath).methods(RequestMethod.GET).build();

			this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, new MethodHandlerBase() {

				@Override
				protected void onDownloadX(String pkey, Object requestData, String key, String param, String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Throwable {
					String strImportTag = null;
					// 从请求中构建参数对象
					String strQueryString = httpServletRequest.getQueryString();
					Map<String, Object> map = RestUtils.queryString2Map(strQueryString);
					if (map != null) {
						strImportTag = (String) map.get("srfimporttag");
					}

					ByteArrayOutputStream bos = new ByteArrayOutputStream();
					Object ret = iSysServiceAPIRuntime.invokeDEGetImportTemplate(null, null, null, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), strImportTag, bos);
					if(ret == ISysServiceAPIRuntime.RET_IGNOREPOSTPROCESS) {
						return;
					}
					
					String strLogicName = iDEServiceAPIRuntime.getPSDEServiceAPI().getLogicName();
					String strTemplateName = String.format("%1$s数据导入模板.xlsx", StringUtils.hasLength(strLogicName)?strLogicName:"");
					String strFileName = new String(URLEncoder.encode(strTemplateName, "utf-8").getBytes("utf-8"), "iso8859-1");
					httpServletResponse.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
					httpServletResponse.setHeader("Pragma", "no-cache");
					httpServletResponse.setHeader("Expires", "0");
					httpServletResponse.setHeader("charset", "utf-8");
					httpServletResponse.setHeader("Content-Disposition", String.format("attachment;filename=%s;filename*=utf-8''%s", strFileName, URLEncoder.encode(strTemplateName, "utf-8")));

					bos.writeTo(httpServletResponse.getOutputStream());
				}
			}, MethodHandlerBase.getDownloadXMethod());
		}
		
		if (true) {

			String strRequestPath = strPath + "/exportdata/{param}";
			String strRequestPath2 = strPath + "/exportdata/{param}/{key}";
			
			RequestMappingInfo requestMappingInfo = RequestMappingInfoEx.paths(strRequestPath, strRequestPath2).methods(RequestMethod.POST).build();

			this.registerMapping(iSysServiceAPIRuntime,requestMappingInfo, new MethodHandlerBase() {

				@Override
				protected void onDownloadX(String pkey, Object requestData, String key, String param, String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Throwable {
					String strExportTag = null;
					// 从请求中构建参数对象
					String strQueryString = httpServletRequest.getQueryString();
					Map<String, Object> map = RestUtils.queryString2Map(strQueryString);
					if (map != null) {
						strExportTag = (String) map.get("srfexporttag");
					}

					ByteArrayOutputStream bos = new ByteArrayOutputStream();
					Object ret = iSysServiceAPIRuntime.invokeDEExportData(null, null, null, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), strExportTag, param, requestData, key, bos);
					if(ret == ISysServiceAPIRuntime.RET_IGNOREPOSTPROCESS) {
						return;
					}
					
					String strTemplateName = "数据导出.xlsx";
					String strFileName = new String(URLEncoder.encode(strTemplateName, "utf-8").getBytes("utf-8"), "iso8859-1");

					httpServletResponse.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
					httpServletResponse.setHeader("Pragma", "no-cache");
					httpServletResponse.setHeader("Expires", "0");
					httpServletResponse.setHeader("charset", "utf-8");
					httpServletResponse.setHeader("Content-Disposition", String.format("attachment;filename=%s;filename*=utf-8''%s", strFileName, URLEncoder.encode(strTemplateName, "utf-8")));

					bos.writeTo(httpServletResponse.getOutputStream());
				}
			}, MethodHandlerBase.getDownloadXMethod());
		}
		
		if(true) {
			String strRequestPath = strPath + "/asyncexportdata/{param}";
			String strRequestPath2 = strPath + "/asyncexportdata/{param}/{key}";
			
			RequestMappingInfo requestMappingInfo = RequestMappingInfoEx.paths(strRequestPath, strRequestPath2).methods(RequestMethod.POST).build();
			this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, new MethodHandlerBase() {
				@Override
				protected Object onExecute(String pkey, Object requestData, String key, String param, String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletRespons) throws Throwable {
					String strExportTag = null;
					// 从请求中构建参数对象
					String strQueryString = httpServletRequest.getQueryString();
					Map<String, Object> map = RestUtils.queryString2Map(strQueryString);
					if (map != null) {
						strExportTag = (String) map.get("srfexporttag");
					}
					
					return iSysServiceAPIRuntime.invokeDEAsyncExportData(null, null, null, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), strExportTag, param, requestData, key, null);
				}
			}, MethodHandlerBase.getExecuteMethod());
		}
		
		if(true) {
			String strRequestPath = strPath + "/importdata";
			RequestMappingInfo requestMappingInfo = RequestMappingInfo.paths(strRequestPath).methods(RequestMethod.POST).build();

			this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, new MethodHandlerBase() {

				@Override
				protected Object onUploadX(String pkey, MultipartFile multipartFile, String key, String param, String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Throwable {
					String strImportTag = null;
					// 从请求中构建参数对象
					String strQueryString = httpServletRequest.getQueryString();
					Map<String, Object> map = RestUtils.queryString2Map(strQueryString);
					if (map != null) {
						strImportTag = (String) map.get("srfimporttag");
					}
					
					return iSysServiceAPIRuntime.invokeDEImportData(null, null, null, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), strImportTag, multipartFile, null);
				}
			}, MethodHandlerBase.getUploadXMethod());
		}
		
		if(true) {
			String strRequestPath = strPath + "/importdata2";
			RequestMappingInfo requestMappingInfo = RequestMappingInfo.paths(strRequestPath).methods(RequestMethod.POST).build();

			this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, new MethodHandlerBase() {

				@Override
				protected Object onUploadX(String pkey, MultipartFile multipartFile, String key, String param, String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Throwable {
					String strImportTag = null;
					// 从请求中构建参数对象
					String strQueryString = httpServletRequest.getQueryString();
					Map<String, Object> map = RestUtils.queryString2Map(strQueryString);
					if (map != null) {
						strImportTag = (String) map.get("srfimporttag");
					}
					
					return iSysServiceAPIRuntime.invokeDEImportData2(null, null, null, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), strImportTag, multipartFile, null);
				}
			}, MethodHandlerBase.getUploadXMethod());
		}
		
		if(true) {
			String strRequestPath = strPath + "/asyncimportdata";
			if(true) {
				RequestMappingInfo requestMappingInfo = RequestMappingInfo.paths(strRequestPath).methods(RequestMethod.POST).build();

				this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, new MethodHandlerBase() {

					@Override
					protected Object onUploadX(String pkey, MultipartFile multipartFile, String key, String param, String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Throwable {
						String strImportTag = null;
						// 从请求中构建参数对象
						String strQueryString = httpServletRequest.getQueryString();
						Map<String, Object> map = RestUtils.queryString2Map(strQueryString);
						if (map != null) {
							strImportTag = (String) map.get("srfimporttag");
						}
						
						return iSysServiceAPIRuntime.invokeDEAsyncImportData(null, null, null, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), strImportTag, multipartFile, null);
					}
				}, MethodHandlerBase.getUploadXMethod());
			}
			if(true) {
				RequestMappingInfo requestMappingInfo = RequestMappingInfo.paths(strRequestPath).methods(RequestMethod.GET).build();
				this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, new MethodHandlerBase() {
					@Override
					protected Object onExecute(String pkey, Object requestData, String key, String param, String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletRespons) throws Throwable {
						String strImportTag = null;
						String strOSSFileId = null;
						String strImportSchemaId = null;
						// 从请求中构建参数对象
						String strQueryString = httpServletRequest.getQueryString();
						Map<String, Object> map = RestUtils.queryString2Map(strQueryString);
						if (map != null) {
							strImportTag = (String) map.get("srfimporttag");
							strOSSFileId = (String) map.get("srfossfileid");
							strImportSchemaId = (String) map.get("srfimportschemaid");
						}
						
						net.ibizsys.central.cloud.core.service.ISysServiceAPIRuntime realSysServiceAPIRuntime = (net.ibizsys.central.cloud.core.service.ISysServiceAPIRuntime)iSysServiceAPIRuntime;
						
						return realSysServiceAPIRuntime.invokeDEAsyncImportData(null, null, null, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), strImportTag, strOSSFileId, strImportSchemaId, null);
					}
				}, MethodHandlerBase.getExecuteMethod());
			}
			
		}
		
		if(true) {
			String strRequestPath = strPath + "/asyncimportdata2";
			if(true) {
				RequestMappingInfo requestMappingInfo = RequestMappingInfo.paths(strRequestPath).methods(RequestMethod.POST).build();
				this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, new MethodHandlerBase() {

					@Override
					protected Object onUploadX(String pkey, MultipartFile multipartFile, String key, String param, String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Throwable {
						String strImportTag = null;
						// 从请求中构建参数对象
						String strQueryString = httpServletRequest.getQueryString();
						Map<String, Object> map = RestUtils.queryString2Map(strQueryString);
						if (map != null) {
							strImportTag = (String) map.get("srfimporttag");
						}
						
						return iSysServiceAPIRuntime.invokeDEAsyncImportData2(null, null, null, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), strImportTag, multipartFile, null);
					}
				}, MethodHandlerBase.getUploadXMethod());
			}
			if(true) {
				RequestMappingInfo requestMappingInfo = RequestMappingInfo.paths(strRequestPath).methods(RequestMethod.GET).build();
				this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, new MethodHandlerBase() {
					@Override
					protected Object onExecute(String pkey, Object requestData, String key, String param, String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletRespons) throws Throwable {
						String strImportTag = null;
						String strOSSFileId = null;
						String strImportSchemaId = null;
						// 从请求中构建参数对象
						String strQueryString = httpServletRequest.getQueryString();
						Map<String, Object> map = RestUtils.queryString2Map(strQueryString);
						if (map != null) {
							strImportTag = (String) map.get("srfimporttag");
							strOSSFileId = (String) map.get("srfossfileid");
							strImportSchemaId = (String) map.get("srfimportschemaid");
						}
						
						net.ibizsys.central.cloud.core.service.ISysServiceAPIRuntime realSysServiceAPIRuntime = (net.ibizsys.central.cloud.core.service.ISysServiceAPIRuntime)iSysServiceAPIRuntime;
						
						return realSysServiceAPIRuntime.invokeDEAsyncImportData2(null, null, null, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), strImportTag, strOSSFileId, strImportSchemaId, null);
					}
				}, MethodHandlerBase.getExecuteMethod());
			}
		}
		
		// 打印数据
		if (true) {
			String strRequestPath = strPath + "/printdata/{key}";
			RequestMappingInfo requestMappingInfo = RequestMappingInfo.paths(strRequestPath).methods(RequestMethod.GET).build();

			this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, new MethodHandlerBase() {

				@Override
				protected void onDownloadX(String pkey, Object requestData, String key, String param, String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Throwable {
					String strPrintTag = null;
					String strContentType = null;
					// 从请求中构建参数对象
					String strQueryString = httpServletRequest.getQueryString();
					Map<String, Object> map = RestUtils.queryString2Map(strQueryString);
					if (map != null) {
						strPrintTag = (String) map.get("srfprinttag");
						strContentType = (String) map.get("srfcontenttype");
					}
					
					iSysServiceAPIRuntime.invokeDEPrintData(null, null, null, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), strPrintTag, strContentType, requestData, key, httpServletResponse);
					
//
//					ByteArrayOutputStream bos = new ByteArrayOutputStream();
//					Object ret = iSysServiceAPIRuntime.invokeDEPrintData(null, null, null, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), strPrintTag, strContentType, requestData, key, bos);
//					if(ret == ISysServiceAPIRuntime.RET_IGNOREPOSTPROCESS) {
//						return;
//					}
//					
//					String strPrintName = "print.pdf";
//					String strFileName = new String(URLEncoder.encode(strPrintName, "utf-8").getBytes("utf-8"), "iso8859-1");
//
//					httpServletResponse.setContentType("application/pdf");
//					httpServletResponse.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
//					httpServletResponse.setHeader("Pragma", "no-cache");
//					httpServletResponse.setHeader("Expires", "0");
//					httpServletResponse.setHeader("charset", "utf-8");
//					httpServletResponse.setHeader("Content-Disposition", String.format("attachment;filename=%s;filename*=utf-8''%s", strFileName, URLEncoder.encode(strPrintTag, "utf-8")));
//
//					bos.writeTo(httpServletResponse.getOutputStream());
				}
			}, MethodHandlerBase.getDownloadXMethod());
		}
		
		//实体报表
		if (true) {
			String strRequestPath = strPath + "/report";
			RequestMappingInfo requestMappingInfo = RequestMappingInfo.paths(strRequestPath).methods(RequestMethod.POST).build();

			this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, new MethodHandlerBase() {

				@Override
				protected void onDownloadX(String pkey, Object requestData, String key, String param, String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Throwable {
					String strReportTag = null;
					String strContentType = null;
					// 从请求中构建参数对象
					String strQueryString = httpServletRequest.getQueryString();
					Map<String, Object> map = RestUtils.queryString2Map(strQueryString);
					if (map != null) {
						strReportTag = (String) map.get("srfreporttag");
						strContentType = (String) map.get("srfcontenttype");
					}

					iSysServiceAPIRuntime.invokeDEReport(null, null, null, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), strReportTag, strContentType, requestData, httpServletResponse);
					
//					ByteArrayOutputStream bos = new ByteArrayOutputStream();
//					Object ret = iSysServiceAPIRuntime.invokeDEReport(null, null, null, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), strReportTag, strContentType, requestData, bos);
//					if(ret == ISysServiceAPIRuntime.RET_IGNOREPOSTPROCESS) {
//						return;
//					}
//					
//					String strPrintName = "report.pdf";
//					String strFileName = new String(URLEncoder.encode(strPrintName, "utf-8").getBytes("utf-8"), "iso8859-1");
//
//					httpServletResponse.setContentType("application/pdf");
//					httpServletResponse.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
//					httpServletResponse.setHeader("Pragma", "no-cache");
//					httpServletResponse.setHeader("Expires", "0");
//					httpServletResponse.setHeader("charset", "utf-8");
//					httpServletResponse.setHeader("Content-Disposition", String.format("attachment;filename=%s;filename*=utf-8''%s", strFileName, URLEncoder.encode(strReportTag, "utf-8")));
//
//					bos.writeTo(httpServletResponse.getOutputStream());
				}
			}, MethodHandlerBase.getDownloadXMethod());
		}
		
		if (true) {
			String strRequestPath = strPath + "/ac/{param}";
			RequestMappingInfo requestMappingInfo = RequestMappingInfo.paths(strRequestPath).methods(RequestMethod.POST).build();

			this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, new MethodHandlerBase() {
				@Override
				protected Object onExecute(String pkey, Object requestData, String key, String param, String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletRespons) throws Throwable {
					
					String strACTag = null;
					
					// 从请求中构建参数对象
					String strQueryString = httpServletRequest.getQueryString();
					Map<String, Object> map = RestUtils.queryString2Map(strQueryString);
					if (map != null) {
						strACTag = (String) map.get("srfactag");
					}
					
					return iSysServiceAPIRuntime.invokeDEAutoComplete(null, null, pkey, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), strACTag, param, requestData, null);
				}
			}, MethodHandlerBase.getExecuteMethod());
		}
		
		if (true) {
			String strRequestPath = strPath + "/chatcompletion";
			String strRequestPath2 = strPath + "/chatcompletion/{key}";
			RequestMappingInfo requestMappingInfo = RequestMappingInfoEx.paths(strRequestPath, strRequestPath2).methods(RequestMethod.POST).build();

			this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, new MethodHandlerBase() {
				@Override
				protected Object onExecute(String pkey, Object requestData, String key, String param, String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletRespons) throws Throwable {
					
					String strACTag = null;
					
					// 从请求中构建参数对象
					String strQueryString = httpServletRequest.getQueryString();
					Map<String, Object> map = RestUtils.queryString2Map(strQueryString);
					if (map != null) {
						strACTag = (String) map.get("srfactag");
					}
					
					net.ibizsys.central.cloud.core.service.ISysServiceAPIRuntime realSysServiceAPIRuntime = (net.ibizsys.central.cloud.core.service.ISysServiceAPIRuntime)iSysServiceAPIRuntime;
					
					return realSysServiceAPIRuntime.invokeDEChatCompletion(null, null, pkey, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), strACTag, IDEChatCompletionRuntime.METHOD_CHATCOMPLETION, requestData, key, null);
				}
			}, MethodHandlerBase.getExecuteMethod());
		}
		
		if (true) {
			String strRequestPath = strPath + "/chatsuggestion";
			String strRequestPath2 = strPath + "/chatsuggestion/{key}";
			RequestMappingInfo requestMappingInfo = RequestMappingInfoEx.paths(strRequestPath, strRequestPath2).methods(RequestMethod.POST).build();

			this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, new MethodHandlerBase() {
				@Override
				protected Object onExecute(String pkey, Object requestData, String key, String param, String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletRespons) throws Throwable {
					
					String strACTag = null;
					
					// 从请求中构建参数对象
					String strQueryString = httpServletRequest.getQueryString();
					Map<String, Object> map = RestUtils.queryString2Map(strQueryString);
					if (map != null) {
						strACTag = (String) map.get("srfactag");
					}
					
					net.ibizsys.central.cloud.core.service.ISysServiceAPIRuntime realSysServiceAPIRuntime = (net.ibizsys.central.cloud.core.service.ISysServiceAPIRuntime)iSysServiceAPIRuntime;
					
					return realSysServiceAPIRuntime.invokeDEChatCompletion(null, null, pkey, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), strACTag, IDEChatCompletionRuntime.METHOD_CHATSUGGESTION, requestData, key, null);
				}
			}, MethodHandlerBase.getExecuteMethod());
		}
		
		
		if (true) {
			String strRequestPath = strPath + "/ssechatcompletion";
			String strRequestPath2 = strPath + "/ssechatcompletion/{key}";
			RequestMappingInfo requestMappingInfo = RequestMappingInfoEx.paths(strRequestPath, strRequestPath2).methods(RequestMethod.POST).build();

			this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, new MethodHandlerBase() {
				@Override
				protected Object onExecute(String pkey, Object requestData, String key, String param, String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletRespons) throws Throwable {
					
					String strACTag = null;
					
					// 从请求中构建参数对象
					String strQueryString = httpServletRequest.getQueryString();
					Map<String, Object> map = RestUtils.queryString2Map(strQueryString);
					if (map != null) {
						strACTag = (String) map.get("srfactag");
					}
					
					net.ibizsys.central.cloud.core.service.ISysServiceAPIRuntime realSysServiceAPIRuntime = (net.ibizsys.central.cloud.core.service.ISysServiceAPIRuntime)iSysServiceAPIRuntime;
					
					return realSysServiceAPIRuntime.invokeDEChatCompletion(null, null, pkey, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), strACTag, IDEChatCompletionRuntime.METHOD_SSECHATCOMPLETION, requestData, key, null);
				}
			}, MethodHandlerBase.getExecuteMethod());
		}
		
		if (true) {
			String strRequestPath = strPath + "/ssechatcompletion/histories";
			String strRequestPath2 = strPath + "/chatcompletion/histories";
			String strRequestPath3 = strPath + "/ssechatcompletion/histories/{key}";
			String strRequestPath4 = strPath + "/chatcompletion/histories/{key}";
			
			RequestMappingInfo requestMappingInfo = RequestMappingInfoEx.paths(strRequestPath, strRequestPath2, strRequestPath3, strRequestPath4).methods(RequestMethod.POST).build();

			this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, new MethodHandlerBase() {
				@Override
				protected Object onExecute(String pkey, Object requestData, String key, String param, String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletRespons) throws Throwable {
					
					String strACTag = null;
					
					// 从请求中构建参数对象
					String strQueryString = httpServletRequest.getQueryString();
					Map<String, Object> map = RestUtils.queryString2Map(strQueryString);
					if (map != null) {
						strACTag = (String) map.get("srfactag");
					}
					
					net.ibizsys.central.cloud.core.service.ISysServiceAPIRuntime realSysServiceAPIRuntime = (net.ibizsys.central.cloud.core.service.ISysServiceAPIRuntime)iSysServiceAPIRuntime;
					
					return realSysServiceAPIRuntime.invokeDEChatCompletion(null, null, pkey, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), strACTag, IDEChatCompletionRuntime.METHOD_HISTORIES, requestData, key, null);
				}
			}, MethodHandlerBase.getExecuteMethod());
		}
		
		if (true) {
			String strRequestPath = strPath + "/ssechatcompletion/resources";
			String strRequestPath2 = strPath + "/chatcompletion/resources";
			String strRequestPath3 = strPath + "/ssechatcompletion/resources/{key}";
			String strRequestPath4 = strPath + "/chatcompletion/resources/{key}";
			
			RequestMappingInfo requestMappingInfo = RequestMappingInfoEx.paths(strRequestPath, strRequestPath2, strRequestPath3, strRequestPath4).methods(RequestMethod.POST).build();

			this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, new MethodHandlerBase() {
				@Override
				protected Object onExecute(String pkey, Object requestData, String key, String param, String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletRespons) throws Throwable {
					
					String strACTag = null;
					
					// 从请求中构建参数对象
					String strQueryString = httpServletRequest.getQueryString();
					Map<String, Object> map = RestUtils.queryString2Map(strQueryString);
					if (map != null) {
						strACTag = (String) map.get("srfactag");
					}
					
					net.ibizsys.central.cloud.core.service.ISysServiceAPIRuntime realSysServiceAPIRuntime = (net.ibizsys.central.cloud.core.service.ISysServiceAPIRuntime)iSysServiceAPIRuntime;
					
					return realSysServiceAPIRuntime.invokeDEChatCompletion(null, null, pkey, iDEServiceAPIRuntime.getPSDEServiceAPI().getName(), strACTag, IDEChatCompletionRuntime.METHOD_RESOURCES, requestData, key, null);
				}
			}, MethodHandlerBase.getExecuteMethod());
		}
	}

	protected String getRequestPath(IPSDEServiceAPIMethod iPSDEServiceAPIMethod) {
		if (iPSDEServiceAPIMethod.isNeedResourceKey()) {
			if (iPSDEServiceAPIMethod.isNoServiceCodeName()) {
				return "/{key}";
			} else {
				return "/{key}/" + iPSDEServiceAPIMethod.getCodeName().toLowerCase();
			}
		} else {
			if (iPSDEServiceAPIMethod.isNoServiceCodeName()) {
				return "";
			} else {
				return "/" + iPSDEServiceAPIMethod.getCodeName().toLowerCase();
			}
		}
	}
	
	@Override
	public RequestMappingInfo registerMapping(ISysServiceAPIRuntime iSysServiceAPIRuntime, Object handler, Method method) {
		
		String[] uris = null;
		RequestMethod[] requstmethods = null;
		RequestMapping requestMapping = method.getAnnotation(RequestMapping.class);
		if(requestMapping != null) {
			uris = requestMapping.value();
			requstmethods = requestMapping.method();
		}
		else {
			GetMapping getMapping = method.getAnnotation(GetMapping.class);
			if(getMapping != null) {
				uris = getMapping.value();
				requstmethods = new RequestMethod[] { RequestMethod.GET };
			}
			else
			{
				PostMapping postMapping = method.getAnnotation(PostMapping.class);
				if(postMapping != null) {
					uris = postMapping.value();
					requstmethods =  new RequestMethod[] {RequestMethod.POST };
				}
				else
				{
					PutMapping putMapping = method.getAnnotation(PutMapping.class);
					if(putMapping != null) {
						uris = putMapping.value();
						requstmethods =  new RequestMethod[] {RequestMethod.PUT };
					}
					else
					{
						DeleteMapping deleteMapping = method.getAnnotation(DeleteMapping.class);
						if(deleteMapping != null) {
							uris = deleteMapping.value();
							requstmethods =  new RequestMethod[] { RequestMethod.DELETE };
						}
					}
				}
			}
		}
		
		if(uris == null || requstmethods == null) {
			return null;
		}
		
		RequestMappingInfo requestMappingInfo = this.getRequestMappingInfo(iSysServiceAPIRuntime, uris, requstmethods, handler, method);
		if(requestMappingInfo != null) {
			if (this.getSysServiceAPIDocAdapter() != null) {
				String[] uris2 = requestMappingInfo.getPatternValues().toArray(new String[requestMappingInfo.getPatternValues().size()]);
				this.getSysServiceAPIDocAdapter().registerMapping(iSysServiceAPIRuntime, uris2, requstmethods, handler, method);
			}
		}
		
		return requestMappingInfo;
	}

	
	
	@Override
	public void registerMapping(ISysServiceAPIRuntime iSysServiceAPIRuntime, RequestMappingInfo mapping, Object handler, Method method) {
		
		log.info(String.format("Mapped URL path[%1$s] method[%2$s] onto API[%3$s]", StringUtils.collectionToDelimitedString(mapping.getPatternValues(), ","),
				StringUtils.collectionToDelimitedString(mapping.getMethodsCondition().getMethods(), ","), iSysServiceAPIRuntime.getName()));
		
		this.getRequestMappingHandlerMapping().registerMapping(mapping, handler, method);
		this.registerRequestMappingInfo(iSysServiceAPIRuntime, mapping);
	}
	
	@Override
	public void registerMapping(IServiceAppRuntime iServiceAppRuntime, RequestMappingInfo mapping, Object handler, Method method) {
		this.getRequestMappingHandlerMapping().registerMapping(mapping, handler, method);
		this.registerRequestMappingInfo(iServiceAppRuntime, mapping);
	}
	
	
	protected RequestMappingInfo getRequestMappingInfo(ISysServiceAPIRuntime iSysServiceAPIRuntime, String[] uris, RequestMethod[] methods, Object handler, Method method) {
		String[] fulluris = uris;
		if(iSysServiceAPIRuntime instanceof net.ibizsys.central.cloud.core.service.ISysServiceAPIRuntime) {
			String baseUrl = ((net.ibizsys.central.cloud.core.service.ISysServiceAPIRuntime)iSysServiceAPIRuntime).getBaseUrl();
			if(StringUtils.hasLength(baseUrl)) {
				fulluris = new String[uris.length];
				for(int i =0;i<uris.length;i++) {
					fulluris[i] = String.format("%1$s%2$s", baseUrl, uris[i]);
				}
			}
		}
		RequestMappingInfo requestMappingInfo = RequestMappingInfo.paths(fulluris).methods(methods).build();
		this.registerMapping(iSysServiceAPIRuntime, requestMappingInfo, handler, method);
		return requestMappingInfo;
	}
	
	protected void registerRequestMappingInfo(ISysServiceAPIRuntime iSysServiceAPIRuntime, RequestMappingInfo requestMappingInfo) {
		List<RequestMappingInfo> list = null;
		synchronized (this.requestMappingInfoMap) {
			list = this.requestMappingInfoMap.get(iSysServiceAPIRuntime);
			if(list == null) {
				list = new ArrayList<RequestMappingInfo>();
				this.requestMappingInfoMap.put(iSysServiceAPIRuntime, list);
			}
		}
		list.add(requestMappingInfo);
	}

	protected void registerRequestMappingInfo(IServiceAppRuntime iServiceAppRuntime, RequestMappingInfo requestMappingInfo) {
		List<RequestMappingInfo> list = null;
		synchronized (this.requestMappingInfoMap2) {
			list = this.requestMappingInfoMap2.get(iServiceAppRuntime);
			if(list == null) {
				list = new ArrayList<RequestMappingInfo>();
				this.requestMappingInfoMap2.put(iServiceAppRuntime, list);
			}
		}
		list.add(requestMappingInfo);
	}
	
	@Override
	public void unregisterMapping(ISysServiceAPIRuntime iSysServiceAPIRuntime) {
		List<RequestMappingInfo> list = null;
		synchronized (this.requestMappingInfoMap) {
			list = this.requestMappingInfoMap.remove(iSysServiceAPIRuntime);
		}
		if(list != null) {
			for(RequestMappingInfo requestMappingInfo : list) {
				try {
					this.getRequestMappingHandlerMapping().unregisterMapping(requestMappingInfo);
				}
				catch (Throwable ex) {
					log.error(String.format("注销服务映射发生异常，%1$s", ex.getMessage()), ex);
				}
			}
		}
		
		if (this.getSysServiceAPIDocAdapter() != null) {
			this.getSysServiceAPIDocAdapter().unregisterMapping(iSysServiceAPIRuntime);
		}
	}
	
	@Override
	public void registerMapping(IServiceAppRuntime iServiceAppRuntime) throws Exception {

//		List<IPSDEServiceAPI> psDEServiceAPIs = iSysServiceAPIRuntime.getPSSysServiceAPI().getPSDEServiceAPIs();
//		if (ObjectUtils.isEmpty(psDEServiceAPIs)) {
//			return;
//		}
//
//		for (IPSDEServiceAPI iPSDEServiceAPI : psDEServiceAPIs) {
//			// 只注册默认接口
//			if (iPSDEServiceAPI.getAPIMode() == 1 || iPSDEServiceAPI.getAPIMode() == 0) {
//				IDEServiceAPIRuntime iDEServiceAPIRuntime = iSysServiceAPIRuntime.getDEServiceAPIRuntime(iPSDEServiceAPI.getCodeName(), false);
//				this.registerDEServiceAPIMapping(iDEServiceAPIRuntime, iSysServiceAPIRuntime);
//			}
//		}
	}
	
	
	@Override
	public void unregisterMapping(IServiceAppRuntime iServiceAppRuntime) {
		List<RequestMappingInfo> list = null;
		synchronized (this.requestMappingInfoMap2) {
			list = this.requestMappingInfoMap2.remove(iServiceAppRuntime);
		}
		if(list != null) {
			for(RequestMappingInfo requestMappingInfo : list) {
				try {
					this.getRequestMappingHandlerMapping().unregisterMapping(requestMappingInfo);
				}
				catch (Throwable ex) {
					log.error(String.format("注销服务映射发生异常，%1$s", ex.getMessage()), ex);
				}
			}
		}
	}

	@Override
	public Map<String, String> getAppContext(ISysServiceAPIRuntime iSysServiceAPIRuntime, String strUrl, String strLastParentDEName) throws Exception{
		
		Assert.notNull(iSysServiceAPIRuntime, "未传入服务接口运行时对象");
		Assert.hasLength(strUrl, "未传入服务请求路径");
		Assert.hasLength(strLastParentDEName, "未传入父实体服务接口");
		
		String strBaseUrl = null;
		if (iSysServiceAPIRuntime instanceof net.ibizsys.central.cloud.core.service.ISysServiceAPIRuntime) {
			strBaseUrl = ((net.ibizsys.central.cloud.core.service.ISysServiceAPIRuntime) iSysServiceAPIRuntime).getBaseUrl();
		} 
		
		if(!StringUtils.hasLength(strBaseUrl)) {
			String strDeploySystemId = iSysServiceAPIRuntime.getSystemRuntime().getServiceId();
			String strAPICodeName = iSysServiceAPIRuntime.getPSSysServiceAPI().getServiceCodeName();
			strBaseUrl = String.format("/%1$s/%2$s", strDeploySystemId, strAPICodeName).toLowerCase();
		}
		
		int nPos = strUrl.indexOf(strBaseUrl);
		if(nPos != 0) {
			return null;
		}
		
		String strRealUrl = strUrl.substring(strBaseUrl.length() + 1);
		if(!StringUtils.hasLength(strRealUrl)) {
			return null;
		}
		//按照 / 分隔
		String[] items = strRealUrl.split("[/]");
		
		Map<String, IPSDEServiceAPI> map = null;
		String strTag = String.format("__SYSAPI_DEAPI_%1$s", iSysServiceAPIRuntime.getPSSysServiceAPI().getServiceCodeName());
		Object param = iSysServiceAPIRuntime.getSystemRuntime().getGlobalParam(strTag);
		if(param != null) {
			map = (Map<String, IPSDEServiceAPI>)param;
		}
		else {
			map = this.getPSDEServiceAPIMap(iSysServiceAPIRuntime);
			iSysServiceAPIRuntime.getSystemRuntime().setGlobalParam(strTag, map);
		}
		
		IPSDEServiceAPI parentPSDEServiceAPI = map.get(strLastParentDEName.toUpperCase());
		if(parentPSDEServiceAPI == null) {
			throw new Exception(String.format("无法获取服务标记[%1$s]对应的实体服务接口对象", strLastParentDEName));
		}
		
		IPSDEServiceAPI lastPSDEServiceAPI = null;
		
		Map<String, String> context = new LinkedHashMap<String, String>();
		
		for(int i = 0;i<items.length/2;i++) {
			String strDEServiceCodeName = items[i*2];
			String strValue = items[i*2+1];
			IPSDEServiceAPI iPSDEServiceAPI = map.get(strDEServiceCodeName);
			if(iPSDEServiceAPI == null) {
				throw new Exception(String.format("无法获取服务代码[%1$s]对应的实体服务接口对象", strDEServiceCodeName));
			}
			
			if(i == 0) {
				lastPSDEServiceAPI = iPSDEServiceAPI;
			}
			else{
				//判断关系是否存在
				IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime = iSysServiceAPIRuntime.getDEServiceAPIRSRuntime(lastPSDEServiceAPI.getName(), iPSDEServiceAPI.getName(), true);
				if(iDEServiceAPIRSRuntime == null) {
					throw new Exception(String.format("无法获取实体服务接口关系[%1$s-%2$s]", lastPSDEServiceAPI.getName(), iPSDEServiceAPI.getName()));
				}
			}
			
			context.put(iPSDEServiceAPI.getName(), strValue);
			//判断是否退出
			if(parentPSDEServiceAPI.getName().equals(iPSDEServiceAPI.getName())) {
				break;
			}
			lastPSDEServiceAPI = iPSDEServiceAPI;
		}
		
		return context;
	}
	
	protected Map<String, IPSDEServiceAPI> getPSDEServiceAPIMap(ISysServiceAPIRuntime iSysServiceAPIRuntime) {
		Map<String, IPSDEServiceAPI> map = new LinkedHashMap<String, IPSDEServiceAPI>();
		
		List<IPSDEServiceAPI> list = iSysServiceAPIRuntime.getPSSysServiceAPI().getPSDEServiceAPIs();
		if(!ObjectUtils.isEmpty(list)) {
			for(IPSDEServiceAPI iPSDEServiceAPI : list) {
				String strServiceCodeName = iPSDEServiceAPI.getCodeName2();
				if(!StringUtils.hasLength(strServiceCodeName)) {
					strServiceCodeName = Inflector.getInstance().pluralize(iPSDEServiceAPI.getCodeName());
				}
				if(StringUtils.hasLength(strServiceCodeName)) {
					map.put(strServiceCodeName.toLowerCase(), iPSDEServiceAPI);
				}
				map.put(iPSDEServiceAPI.getName().toUpperCase(), iPSDEServiceAPI);
			}
		}
		
		return map;
	}
	
}
