package net.ibizsys.central.plugin.extension.psmodel.service;

import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.yaml.snakeyaml.Yaml;

import net.ibizsys.central.cloud.core.util.domain.V2System;
import net.ibizsys.central.cloud.core.util.domain.V2SystemMerge;
import net.ibizsys.central.cloud.core.util.domain.V2SystemMergeStatus;
import net.ibizsys.central.cloud.core.util.domain.V2SystemType;
import net.ibizsys.central.plugin.extension.psmodel.util.IExtensionPSModelRTServiceSession;
import net.ibizsys.central.service.client.IWebClientRep;
import net.ibizsys.central.service.client.WebClientBase;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.model.PSModelEnums.ProductFuncState;
import net.ibizsys.model.util.Conditions;
import net.ibizsys.model.util.Errors;
import net.ibizsys.psmodel.core.domain.PSCorePrd;
import net.ibizsys.psmodel.core.domain.PSCorePrdCat;
import net.ibizsys.psmodel.core.domain.PSCorePrdFunc;
import net.ibizsys.psmodel.core.filter.PSCorePrdCatFilter;
import net.ibizsys.psmodel.core.filter.PSCorePrdFilter;
import net.ibizsys.psmodel.core.filter.PSCorePrdFuncFilter;
import net.ibizsys.psmodel.core.service.IPSCorePrdService;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.ErrorException;

public class PSCorePrdFuncRTService extends net.ibizsys.psmodel.runtime.service.PSCorePrdFuncRTService {

	private static final Log log = LogFactory.getLog(PSCorePrdFuncRTService.class);

	public final static String FIELD_INFO = "info";
	
	public final static String FIELD_V2SYSTEMMERGE = "_v2systemmerge";
	
	 

	@Override
	protected PSCorePrdFunc doGet(String key, boolean tryMode) throws Exception {

		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();

		String[] items = key.split("[.]");
		if (items.length < 3) {
			throw new Exception("传入键值无效");
		}

		Map<String, Object> queryParams = new LinkedHashMap<String, Object>();
		Map<String, Object> uriParams = new LinkedHashMap<String, Object>();

		String strPath = "";
		PSCorePrdFunc psCorePrdFunc = null;
		IWebClientRep<String> rep;

		if(IExtensionPSModelRTServiceSession.PRODUCTMARKETMODE_V2.equalsIgnoreCase(iExtensionPSModelRTServiceSession.getProductMarketMode())) {

			PSCorePrdFuncFilter psCorePrdFuncFilter = new PSCorePrdFuncFilter();
			psCorePrdFuncFilter.setFieldCond(PSCorePrdFunc.FIELD_PSCOREPRDID, Conditions.EQ, items[1]);
			psCorePrdFuncFilter.setFieldCond(PSCorePrdFunc.FIELD_PSCOREPRDFUNCID, Conditions.EQ, key);
			List<PSCorePrdFunc> list = getDomainList(DATASET_DEFAULT, psCorePrdFuncFilter);
			if(ObjectUtils.isEmpty(list)) {
				throw new ErrorException(String.format("无法获取指定数据[%1$s]", key), Errors.INVALIDDATA);
			}

			psCorePrdFunc = list.get(0);
			//uriParams.put("projectid", java.net.URLEncoder.encode(psCorePrd.getPath().substring(1), "UTF-8"));
			if(StringUtils.hasLength(psCorePrdFunc.getPath())) {
				if(psCorePrdFunc.getPath().indexOf("/") == 0) {
					uriParams.put("projectid", psCorePrdFunc.getPath().substring(1));
				}
				else {
					uriParams.put("projectid", psCorePrdFunc.getPath());
				}
			}
		}
		else {
			strPath = "/projects/{projectid}";
			uriParams.put("projectid", items[2]);

			String strUrl = String.format("%1$s%2$s", iExtensionPSModelRTServiceSession.getProductMarketServiceUrl(), strPath);


			try {
				rep = iExtensionPSModelRTServiceSession.getSystemRuntime().getDefaultWebClient().get(strUrl, uriParams, null, queryParams, String.class, null);
			} catch (Throwable ex) {
				throw new Exception(String.format("请求市场发生异常，%1$s", ex.getMessage()), ex);
			}

			Map item = WebClientBase.MAPPER.readValue(rep.getBody(), Map.class);
			psCorePrdFunc = getPSCorePrdFunc(item);
			psCorePrdFunc.setPSCorePrdId(items[1]);
			// psCorePrdFunc.setPSCorePrdName(psCorePrd.getPSCorePrdName());
			psCorePrdFunc.setFuncType(items[0]);
			psCorePrdFunc.setId(String.format("%1$s.%2$s.%3$s", psCorePrdFunc.getFuncType(), psCorePrdFunc.getPSCorePrdId(), psCorePrdFunc.getId()));

		}

		boolean bEnableReadme = uriParams.containsKey("projectid");
		boolean bEnableChangelog = uriParams.containsKey("projectid");
		if(bEnableReadme) {
			// 读取 README.md
			strPath = "/projects/{projectid}/repository/files/{filepath}?ref={branch}";
			uriParams.put("filepath", "README.md");
			uriParams.put("branch", DataTypeUtils.getStringValue(psCorePrdFunc.get("default_branch"), "master"));

			String strUrl = String.format("%1$s%2$s", iExtensionPSModelRTServiceSession.getProductMarketServiceUrl(), strPath);
			try {
				rep = iExtensionPSModelRTServiceSession.getSystemRuntime().getDefaultWebClient().get(strUrl, uriParams, null, queryParams, String.class, null);
			} catch (Throwable ex) {
				boolean bIgnore = false;
				rep = null;
				if (ex.getCause() instanceof WebClientResponseException) {
					WebClientResponseException webClientResponseException = (WebClientResponseException) ex.getCause();
					if (webClientResponseException.getStatusCode().value() == HttpStatus.NOT_FOUND.value()) {
						bIgnore = true;
					}
				}

//				if (!bIgnore)
//					throw new Exception(String.format("获取README.md文件发生异常，%1$s", ex.getMessage()), ex);
			}

			if (rep != null) {
				try {
					Map item = WebClientBase.MAPPER.readValue(rep.getBody(), Map.class);
					String content = (String) item.get("content");
					if (StringUtils.hasLength(content)) {
						content = new String(Base64.getDecoder().decode(content));
					}
					psCorePrdFunc.setInfo(content);
				} catch (Exception ex) {
					throw new Exception(String.format("解析README.md文件发生异常，%1$s", ex.getMessage()), ex);
				}
			}
		}
		
		if(bEnableChangelog) {
			// 读取 README.md
			strPath = "/projects/{projectid}/repository/files/{filepath}?ref={branch}";
			uriParams.put("filepath", "CHANGELOG");
			uriParams.put("branch", DataTypeUtils.getStringValue(psCorePrdFunc.get("default_branch"), "master"));

			String strUrl = String.format("%1$s%2$s", iExtensionPSModelRTServiceSession.getProductMarketServiceUrl(), strPath);
			try {
				rep = iExtensionPSModelRTServiceSession.getSystemRuntime().getDefaultWebClient().get(strUrl, uriParams, null, queryParams, String.class, null);
			} catch (Throwable ex) {
				boolean bIgnore = false;
				rep = null;
				if (ex.getCause() instanceof WebClientResponseException) {
					WebClientResponseException webClientResponseException = (WebClientResponseException) ex.getCause();
					if (webClientResponseException.getStatusCode().value() == HttpStatus.NOT_FOUND.value()) {
						bIgnore = true;
					}
				}

//				if (!bIgnore)
//					throw new Exception(String.format("获取CHANGELOG文件发生异常，%1$s", ex.getMessage()), ex);
			}

			if (rep != null) {
				try {
					Map item = WebClientBase.MAPPER.readValue(rep.getBody(), Map.class);
					String content = (String) item.get("content");
					if (StringUtils.hasLength(content)) {
						content = new String(Base64.getDecoder().decode(content));
					}
					psCorePrdFunc.setChangelog(content);
				} catch (Exception ex) {
					throw new Exception(String.format("解析CHANGELOG文件发生异常，%1$s", ex.getMessage()), ex);
				}
			}
		}

		return psCorePrdFunc;
	}

	@Override
	protected List<PSCorePrdFunc> getDomainList(String strDataSetName, PSCorePrdFuncFilter f) throws Exception {

		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
		PSCorePrdRTService psCorePrdRTService = (PSCorePrdRTService) this.getPSModelRTServiceSession().getPSModelService(PSModels.PSCOREPRD);
		String strPSCorePrdId = DataTypeUtils.getStringValue(f.get("n_" + PSCorePrdFunc.FIELD_PSCOREPRDID + "_eq"), "");
		if (!StringUtils.hasLength(strPSCorePrdId)) {
			throw new Exception("未指定产品标识");
		}

		List<PSCorePrdFunc> dtoList = new ArrayList<PSCorePrdFunc>();

		if(IExtensionPSModelRTServiceSession.PRODUCTMARKETMODE_V2.equalsIgnoreCase(iExtensionPSModelRTServiceSession.getProductMarketMode())) {

			try {
				Map itemMap = psCorePrdRTService.getV2ProjectConfig(strPSCorePrdId);

				if (itemMap != null) {

					String strKey = DataTypeUtils.getStringValue(itemMap.get("key"), null);

					if(StringUtils.hasLength(strKey)) {
						if(itemMap.containsKey("addons")) {

							String strName = DataTypeUtils.getStringValue(itemMap.get("name"), null);

							Object addons = itemMap.get("addons");
							if(addons instanceof Map) {
								Map addonsMap = (Map)addons;
								Object tools = addonsMap.get("tools");
								if(tools instanceof List) {
									List toolsList = (List)tools;
									for(Object toolItem : toolsList) {
										if(toolItem instanceof Map) {
											Map toolMap = (Map)toolItem;
											String toolTag = DataTypeUtils.getStringValue(toolMap.get("tooltag"), null);
											String toolName = DataTypeUtils.getStringValue(toolMap.get("name"), null);
											Object sub_projects = toolMap.get("sub_projects");
											if(sub_projects instanceof List) {
												List sub_projectsList = (List)sub_projects;
												for(Object sub_project : sub_projectsList) {
													if(!(sub_project instanceof Map)) {
														continue;
													}

													PSCorePrdFunc psCorePrdFunc = this.getPSCorePrdFuncV2((Map)sub_project);
													
													psCorePrdFunc.setFuncType(V2SystemType.BASE.value);
													psCorePrdFunc.setPSCorePrdId(strKey);
													psCorePrdFunc.setPSCorePrdName(strName);
													psCorePrdFunc.setFuncState(0);

													psCorePrdFunc.setId(String.format("%1$s.%2$s.%3$s.%4$s", psCorePrdFunc.getFuncType(), strKey, toolTag, psCorePrdFunc.getId()));

													dtoList.add(psCorePrdFunc);
												}
											}
										}
									}
								}
								
								Object components = addonsMap.get("components");
								if(components instanceof List) {
									List componentsList = (List)components;
									for(Object componentItem : componentsList) {
										if(componentItem instanceof Map) {
											Map componentMap = (Map)componentItem;
											String componentTag = DataTypeUtils.getStringValue(componentMap.get("componenttag"), null);
											String componentName = DataTypeUtils.getStringValue(componentMap.get("name"), null);
											Object sub_projects = componentMap.get("sub_projects");
											if(sub_projects instanceof List) {
												List sub_projectsList = (List)sub_projects;
												for(Object sub_project : sub_projectsList) {
													if(!(sub_project instanceof Map)) {
														continue;
													}

													PSCorePrdFunc psCorePrdFunc = this.getPSCorePrdFuncV2((Map)sub_project);
													psCorePrdFunc.setFuncType(V2SystemType.COMPONENT.value);
													psCorePrdFunc.setPSCorePrdId(strKey);
													psCorePrdFunc.setPSCorePrdName(strName);
													psCorePrdFunc.setFuncState(0);

													psCorePrdFunc.setId(String.format("%1$s.%2$s.%3$s.%4$s", psCorePrdFunc.getFuncType(), strKey, componentTag, psCorePrdFunc.getId()));

													dtoList.add(psCorePrdFunc);
												}
											}
										}
									}
								}
								

								Object applications = addonsMap.get("applications");
								if(applications instanceof List) {

									List applicationsList = (List)applications;
									for(Object applicationItem : applicationsList) {
										if(applicationItem instanceof Map) {
											Map applicationMap = (Map)applicationItem;
											//	String tapplicationTag = DataTypeUtils.getStringValue(applicationMap.get("tag"), null);
											String applicationName = DataTypeUtils.getStringValue(applicationMap.get("name"), null);
											Object sub_projects = applicationMap.get("sub_projects");
											if(sub_projects instanceof List) {
												List sub_projectsList = (List)sub_projects;
												for(Object sub_project : sub_projectsList) {
													if(!(sub_project instanceof Map)) {
														continue;
													}

													PSCorePrdFunc psCorePrdFunc = this.getPSCorePrdFuncV2((Map)sub_project);
													
													if(DataTypeUtils.asBoolean(((Map)sub_project).get("mergesystem"), false)) {
														psCorePrdFunc.setFuncType(V2SystemType.MERGENCE.value);
													}
													else {
														psCorePrdFunc.setFuncType(V2SystemType.EXTENSION.value);
													}
													
													psCorePrdFunc.setPSCorePrdId(strKey);
													psCorePrdFunc.setPSCorePrdName(strName);
													psCorePrdFunc.setFuncState(0);
//													if (StringUtils.hasLength(strSystemId)) {
//														psCorePrdFunc.setPSCorePrdId(strSystemId);
//														psCorePrdFunc.setId(String.format("%1$s.%2$s.%3$s", psCorePrdFunc.getFuncType(), strSystemId, psCorePrdFunc.getId()));
//													} else {
//														psCorePrdFunc.setPSCorePrdId(psCorePrd.getPSCorePrdId());
//														psCorePrdFunc.setId(String.format("%1$s.%2$s.%3$s", psCorePrdFunc.getFuncType(), psCorePrd.getId(), psCorePrdFunc.getId()));
//													}

													psCorePrdFunc.setId(String.format("%1$s.%2$s.%3$s", psCorePrdFunc.getFuncType(), strKey, psCorePrdFunc.getId()));

													dtoList.add(psCorePrdFunc);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			catch (Exception ex) {
				throw new Exception(String.format("解析projects.yml文件发生异常，%1$s", ex.getMessage()), ex);
			}

			if (!ObjectUtils.isEmpty(dtoList)) {

				Map<String, PSCorePrdFunc> psCorePrdFuncMap = new HashMap<String, PSCorePrdFunc>();
				for (PSCorePrdFunc psCorePrdFunc : dtoList) {
					String[] psCorePrdFunctags = psCorePrdFunc.getId().split("[.]");
					if(psCorePrdFunctags.length == 3) {
						psCorePrdFuncMap.put(psCorePrdFunc.getId().split("[.]")[2], psCorePrdFunc);
					}else if(psCorePrdFunctags.length == 4 && "BASE".equals(psCorePrdFunctags[0])){
						psCorePrdFuncMap.put(psCorePrdFunc.getId().split("[.]")[3], psCorePrdFunc);
					}
				}



				V2System v2System = psCorePrdRTService.getV2SystemIf(strPSCorePrdId);

				SearchContextDTO searchContextDTO = new SearchContextDTO();
				searchContextDTO.sort(V2SystemMerge.FIELD_ORDER_VALUE);
				searchContextDTO.all();
				Page<V2SystemMerge> v2SystemMergePage = iExtensionPSModelRTServiceSession.getCloudExtensionClientMust().fetchSystemMerges(v2System.getId(), searchContextDTO);
				if (!ObjectUtils.isEmpty(v2SystemMergePage) && !ObjectUtils.isEmpty(v2SystemMergePage.getContent())) {
					for (V2SystemMerge v2SystemMerge : v2SystemMergePage.getContent()) {
						PSCorePrdFunc psCorePrdFunc = psCorePrdFuncMap.get(v2SystemMerge.getMergeSystemProductId());
						if (psCorePrdFunc == null) {
							continue;
						}

						psCorePrdFunc.setOrderValue(v2SystemMerge.getOrderValue());
						int nStatus = DataTypeUtils.asInteger(v2SystemMerge.getValidFlag(), 0);
						if(V2SystemMergeStatus.INSTALLED.value == nStatus) {
							psCorePrdFunc.setFuncState(ProductFuncState.INSTALLED.value);
						}
						else if(V2SystemMergeStatus.INSTALLEDNEEDRELOAD.value == nStatus) {
							psCorePrdFunc.setFuncState(ProductFuncState.INSTALLEDNEEDRELOAD.value);
						}
						else if(V2SystemMergeStatus.DISABLEDNEEDRELOAD.value == nStatus) {
							psCorePrdFunc.setFuncState(ProductFuncState.DISABLEDNEEDRELOAD.value);
						}
						else {
							psCorePrdFunc.setFuncState(ProductFuncState.DISABLED.value);
						}

						psCorePrdFunc.setCurrentVersion(v2SystemMerge.getMergeSystemSourceName());
					}
				}
			}

		}
		else {
			// 判断传入标识是否为系统标识
			String strSystemId = null;
			try {
				Integer.parseInt(strPSCorePrdId);
			} catch (Throwable ex) {
				strSystemId = strPSCorePrdId;
			}

			V2System v2System = null;
			if (StringUtils.hasLength(strSystemId)) {
				v2System = iExtensionPSModelRTServiceSession.getCloudExtensionClientMust().getSystem(strSystemId);
				strPSCorePrdId = v2System.getProductId();
			}

			// 获取产品基本信息
			PSCorePrd psCorePrd = (PSCorePrd) this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSCOREPRD, strPSCorePrdId);

			PSCorePrdCatRTService psCorePrdCatRTService = (PSCorePrdCatRTService) this.getPSModelRTServiceSession().getPSModelService(PSModels.PSCOREPRDCAT);

			// 获取父类型
			if (StringUtils.hasLength(psCorePrd.getPSCorePrdCatId())) {

				PSCorePrdCatFilter psCorePrdCatFilter = new PSCorePrdCatFilter();
				psCorePrdCatFilter.setFieldCond(PSCorePrdCat.FIELD_PPSCOREPRDCATID, Conditions.EQ, psCorePrd.getPSCorePrdCatId());
				psCorePrdCatFilter.setSize(Integer.MAX_VALUE);
				Page<PSCorePrdCat> page = psCorePrdCatRTService.fetch(DATASET_DEFAULT, psCorePrdCatFilter);
				if (!ObjectUtils.isEmpty(page) && !ObjectUtils.isEmpty(page.getContent())) {
					IPSCorePrdService iPSCorePrdService = (IPSCorePrdService) this.getPSModelRTServiceSession().getPSModelService(PSModels.PSCOREPRD);
					for (PSCorePrdCat psCorePrdCat : page.getContent()) {
						PSCorePrdFilter psCorePrdFilter = new PSCorePrdFilter();
						psCorePrdFilter.setFieldCond(PSCorePrd.FIELD_PSCOREPRDCATID, Conditions.EQ, psCorePrdCat.getPSCorePrdCatId());
						psCorePrdFilter.setSize(Integer.MAX_VALUE);

						Page<PSCorePrd> prdPage = iPSCorePrdService.fetch(DATASET_DEFAULT, psCorePrdFilter);
						if (!ObjectUtils.isEmpty(prdPage) && !ObjectUtils.isEmpty(prdPage.getContent())) {
							for (PSCorePrd funcPSCorePrd : prdPage.getContent()) {
								PSCorePrdFunc psCorePrdFunc = this.fillPSCorePrdFunc(null, funcPSCorePrd);

								psCorePrdFunc.setPSCorePrdName(psCorePrd.getPSCorePrdName());
								psCorePrdFunc.setFuncType(V2SystemType.EXTENSION.value);

								if (StringUtils.hasLength(strSystemId)) {
									psCorePrdFunc.setPSCorePrdId(strSystemId);
									psCorePrdFunc.setId(String.format("%1$s.%2$s.%3$s", psCorePrdFunc.getFuncType(), strSystemId, psCorePrdFunc.getId()));
								} else {
									psCorePrdFunc.setPSCorePrdId(psCorePrd.getPSCorePrdId());
									psCorePrdFunc.setId(String.format("%1$s.%2$s.%3$s", psCorePrdFunc.getFuncType(), psCorePrd.getId(), psCorePrdFunc.getId()));
								}
								dtoList.add(psCorePrdFunc);
							}
						}
					}
				}
			}

			if (StringUtils.hasLength(iExtensionPSModelRTServiceSession.getProductMarketBaseGroupId())) {
				String strCatId = iExtensionPSModelRTServiceSession.getProductMarketBaseGroupId();

				PSCorePrdCatFilter psCorePrdCatFilter = new PSCorePrdCatFilter();
				psCorePrdCatFilter.setFieldCond(PSCorePrdCat.FIELD_PPSCOREPRDCATID, Conditions.EQ, strCatId);
				psCorePrdCatFilter.setSize(Integer.MAX_VALUE);
				Page<PSCorePrdCat> page = psCorePrdCatRTService.fetch(DATASET_DEFAULT, psCorePrdCatFilter);
				if (!ObjectUtils.isEmpty(page) && !ObjectUtils.isEmpty(page.getContent())) {
					IPSCorePrdService iPSCorePrdService = (IPSCorePrdService) this.getPSModelRTServiceSession().getPSModelService(PSModels.PSCOREPRD);
					for (PSCorePrdCat psCorePrdCat : page.getContent()) {
						PSCorePrdFilter psCorePrdFilter = new PSCorePrdFilter();
						psCorePrdFilter.setFieldCond(PSCorePrd.FIELD_PSCOREPRDCATID, Conditions.EQ, psCorePrdCat.getPSCorePrdCatId());
						psCorePrdFilter.setSize(Integer.MAX_VALUE);

						Page<PSCorePrd> prdPage = iPSCorePrdService.fetch(DATASET_DEFAULT, psCorePrdFilter);
						if (!ObjectUtils.isEmpty(prdPage) && !ObjectUtils.isEmpty(prdPage.getContent())) {
							for (PSCorePrd funcPSCorePrd : prdPage.getContent()) {
								PSCorePrdFunc psCorePrdFunc = this.fillPSCorePrdFunc(null, funcPSCorePrd);
								psCorePrdFunc.setPSCorePrdName(psCorePrd.getPSCorePrdName());
								psCorePrdFunc.setFuncType(V2SystemType.BASE.value);
								if (StringUtils.hasLength(strSystemId)) {
									psCorePrdFunc.setPSCorePrdId(strSystemId);
									psCorePrdFunc.setId(String.format("%1$s.%2$s.%3$s", psCorePrdFunc.getFuncType(), strSystemId, psCorePrdFunc.getId()));
								} else {
									psCorePrdFunc.setPSCorePrdId(psCorePrd.getPSCorePrdId());
									psCorePrdFunc.setId(String.format("%1$s.%2$s.%3$s", psCorePrdFunc.getFuncType(), psCorePrd.getId(), psCorePrdFunc.getId()));
								}
								dtoList.add(psCorePrdFunc);
							}
						}
					}
				}
			}

			if (!ObjectUtils.isEmpty(dtoList)) {

				Map<String, PSCorePrdFunc> psCorePrdFuncMap = new HashMap<String, PSCorePrdFunc>();
				for (PSCorePrdFunc psCorePrdFunc : dtoList) {
					psCorePrdFuncMap.put(psCorePrdFunc.getId().split("[.]")[2], psCorePrdFunc);
				}

				if (v2System == null) {
					v2System = psCorePrdRTService.getV2SystemIf(strPSCorePrdId);
				}

				SearchContextDTO searchContextDTO = new SearchContextDTO();
				searchContextDTO.sort(V2SystemMerge.FIELD_ORDER_VALUE);
				searchContextDTO.all();
				Page<V2SystemMerge> v2SystemMergePage = iExtensionPSModelRTServiceSession.getCloudExtensionClientMust().fetchSystemMerges(v2System.getId(), searchContextDTO);
				if (!ObjectUtils.isEmpty(v2SystemMergePage) && !ObjectUtils.isEmpty(v2SystemMergePage.getContent())) {
					for (V2SystemMerge v2SystemMerge : v2SystemMergePage.getContent()) {
						PSCorePrdFunc psCorePrdFunc = psCorePrdFuncMap.get(v2SystemMerge.getMergeSystemProductId());
						if (psCorePrdFunc == null) {
							continue;
						}

						psCorePrdFunc.setOrderValue(v2SystemMerge.getOrderValue());
						int nStatus = DataTypeUtils.asInteger(v2SystemMerge.getValidFlag(), 0);
						if(V2SystemMergeStatus.INSTALLED.value == nStatus) {
							psCorePrdFunc.setFuncState(ProductFuncState.INSTALLED.value);
						}
						else if(V2SystemMergeStatus.INSTALLEDNEEDRELOAD.value == nStatus) {
							psCorePrdFunc.setFuncState(ProductFuncState.INSTALLEDNEEDRELOAD.value);
						}
						else if(V2SystemMergeStatus.DISABLEDNEEDRELOAD.value == nStatus) {
							psCorePrdFunc.setFuncState(ProductFuncState.DISABLEDNEEDRELOAD.value);
						}
						else {
							psCorePrdFunc.setFuncState(ProductFuncState.DISABLED.value);
						}
						
						psCorePrdFunc.setCurrentVersion(v2SystemMerge.getMergeSystemSourceName());
					}
				}
			}

			f.reset("n_" + PSCorePrdFunc.FIELD_PSCOREPRDID + "_eq");
		}

		return this.filterDomainList(dtoList, strDataSetName, f);

	}

	protected PSCorePrdFunc fillPSCorePrdFunc(PSCorePrdFunc psCorePrdFunc, PSCorePrd funcPSCorePrd) {
		if (psCorePrdFunc == null) {
			psCorePrdFunc = new PSCorePrdFunc();
		}
		psCorePrdFunc.setId(funcPSCorePrd.getId());
		psCorePrdFunc.setName(funcPSCorePrd.getName());
		psCorePrdFunc.setFullName(funcPSCorePrd.getFullName());
		psCorePrdFunc.setPath(funcPSCorePrd.getPath());
		psCorePrdFunc.setFullPath(funcPSCorePrd.getFullPath());
		psCorePrdFunc.setHttpUrlToRepo(funcPSCorePrd.getHttpUrlToRepo());
		psCorePrdFunc.setAvatarUrl(funcPSCorePrd.getAvatarUrl());
		psCorePrdFunc.set("default_branch", DataTypeUtils.getStringValue(funcPSCorePrd.get("default_branch"), null));

		psCorePrdFunc.setFuncTag(funcPSCorePrd.getPSCorePrdCatId());
		psCorePrdFunc.setFuncTag2(funcPSCorePrd.getPSCorePrdCatPath());
		psCorePrdFunc.setFuncState(0);

		return psCorePrdFunc;
	}

	protected PSCorePrdFunc getPSCorePrdFunc(Map item) {
		PSCorePrdFunc psCorePrdFunc = new PSCorePrdFunc();
		psCorePrdFunc.setId(DataTypeUtils.getStringValue(item.get("id"), null));
		psCorePrdFunc.setName(DataTypeUtils.getStringValue(item.get("name"), null));

		psCorePrdFunc.setPath(DataTypeUtils.getStringValue(item.get("path"), null));
		psCorePrdFunc.setMemo(DataTypeUtils.getStringValue(item.get("description"), null));

		String strFullName = (String) item.get("name_with_namespace");
		if (StringUtils.hasLength(strFullName)) {

			String[] items = strFullName.split("[/]");
			strFullName = "";
			for (int i = 2; i < items.length; i++) {
				if (StringUtils.hasLength(strFullName)) {
					strFullName += "/";
				}
				strFullName += items[i].trim();
			}

		}
		psCorePrdFunc.setFullName(strFullName);

		psCorePrdFunc.setFullPath(DataTypeUtils.getStringValue(item.get("path_with_namespace"), null));

		psCorePrdFunc.setAvatarUrl(DataTypeUtils.getStringValue(item.get("avatar_url"), null));

		psCorePrdFunc.setHttpUrlToRepo(DataTypeUtils.getStringValue(item.get("http_url_to_repo"), null));

		psCorePrdFunc.set("default_branch", DataTypeUtils.getStringValue(item.get("default_branch"), null));

		Object namespace = item.get("namespace");
		if (namespace instanceof Map) {
			Map map = (Map) namespace;
			psCorePrdFunc.setFuncTag(DataTypeUtils.getStringValue(map.get("id"), null));
			psCorePrdFunc.setFuncTag2(DataTypeUtils.getStringValue(map.get("path"), null));
		}
		return psCorePrdFunc;
	}


	protected PSCorePrdFunc getPSCorePrdFuncV2(Map item) {
		PSCorePrdFunc psCorePrdFunc = new PSCorePrdFunc();
		psCorePrdFunc.setId(DataTypeUtils.getStringValue(item.get("key"), null));
		psCorePrdFunc.setName(DataTypeUtils.getStringValue(item.get("name"), null));

		psCorePrdFunc.setPath(DataTypeUtils.getStringValue(item.get("path"), null));
		psCorePrdFunc.setMemo(DataTypeUtils.getStringValue(item.get("description"), null));
		if(item.get("catalog") instanceof List){
			psCorePrdFunc.setFuncTag(((List<String>) item.get("catalog")).get(0));
		}
		psCorePrdFunc.setAvatarUrl(DataTypeUtils.getStringValue(item.get("avatar_url"), null));
		psCorePrdFunc.setSettingUrl(DataTypeUtils.getStringValue(item.get("setting_url"), null));
		psCorePrdFunc.setSettings(DataTypeUtils.getStringValue(item.get("settings"), null));
		psCorePrdFunc.setVers(DataTypeUtils.getStringValue(item.get("vers"), null));
		psCorePrdFunc.setCategory(DataTypeUtils.getStringValue(item.get("category"), null));
		psCorePrdFunc.setInfo(DataTypeUtils.getStringValue(item.get("info"), null));
		psCorePrdFunc.setChangelog(DataTypeUtils.getStringValue(item.get("changelog"), null));
		
		psCorePrdFunc.setHttpUrlToRepo(DataTypeUtils.getStringValue(item.get("http_url_to_repo"), null));
		psCorePrdFunc.setFuncTag(DataTypeUtils.getStringValue(item.get("func_tag"), null));
		psCorePrdFunc.setFuncTag2(DataTypeUtils.getStringValue(item.get("func_tag2"), null));
		
		psCorePrdFunc.setDependencies(DataTypeUtils.getStringValue(item.get("dependencies"), null));
		
		return psCorePrdFunc;
	}

	@Override
	protected Object doInstall(PSCorePrdFunc m) throws Exception {

		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();

		String[] items = m.getId().split("[.]");
		if (items.length < 3) {
			throw new Exception("传入键值无效");
		}
		
		Object reload = m.get("reload");
		boolean bReload = true;
		if(!ObjectUtils.isEmpty(reload)) {
			bReload = DataTypeUtils.asBoolean(reload, bReload);
		}

		V2System v2System = getV2SystemIf(m.getId());

		String strCurrentVersion = m.getCurrentVersion();

		// 判断传入标识是否为系统标识
		String strSystemId = null;
		try {
			Integer.parseInt(items[1]);
		} catch (Throwable ex) {
			strSystemId = items[1];
		}

		V2System prdV2System = null;
		if(IExtensionPSModelRTServiceSession.PRODUCTMARKETMODE_V2.equalsIgnoreCase(iExtensionPSModelRTServiceSession.getProductMarketMode())) {
			PSCorePrdRTService psCorePrdRTService = (PSCorePrdRTService) this.getPSModelRTServiceSession().getPSModelService(PSModels.PSCOREPRD);
			prdV2System = psCorePrdRTService.getV2SystemIf(items[1]);
		}else {
			if (StringUtils.hasLength(strSystemId)) {
				prdV2System = iExtensionPSModelRTServiceSession.getCloudExtensionClientMust().getSystem(strSystemId);
			} else {
				PSCorePrdRTService psCorePrdRTService = (PSCorePrdRTService) this.getPSModelRTServiceSession().getPSModelService(PSModels.PSCOREPRD);
				prdV2System = psCorePrdRTService.getV2SystemIf(items[1]);
			}
		}

		// 查询系统引用关系
		SearchContextDTO searchContextDTO = new SearchContextDTO();
		searchContextDTO.all();

		// searchContextDTO.eq(V2SystemMerge.FIELD_MERGE_SYSTEM_ID,
		// v2System.getId());

		int nMaxOrderValue = 100;
		Page<V2SystemMerge> v2SystemMergePage = iExtensionPSModelRTServiceSession.getCloudExtensionClientMust().fetchSystemMerges(prdV2System.getId(), searchContextDTO);
		if (!ObjectUtils.isEmpty(v2SystemMergePage) && !ObjectUtils.isEmpty(v2SystemMergePage.getContent())) {
			for (V2SystemMerge v2SystemMerge : v2SystemMergePage.getContent()) {

				int nOrderValue = DataTypeUtils.getIntegerValue(v2SystemMerge.getOrderValue(), 100);
				if (nOrderValue > nMaxOrderValue) {
					nMaxOrderValue = nOrderValue;
				}

				if (v2System.getId().equals(v2SystemMerge.getMergeSystemId())) {
					int nStatus = DataTypeUtils.asInteger(v2SystemMerge.getValidFlag(), 0);
					if(V2SystemMergeStatus.NOTINSTALLED.value == nStatus || V2SystemMergeStatus.DISABLEDNEEDRELOAD.value == nStatus) {
						// 执行更新操作
						V2SystemMerge v2SystemMerge2 = new V2SystemMerge();
						v2SystemMerge2.setId(v2SystemMerge.getId());
						v2SystemMerge2.setValidFlag(V2SystemMergeStatus.INSTALLED.value);
						if(V2SystemType.MERGENCE.value.equals(v2System.getType())) {
//							if(!bReload) {
							//MERGENCE类型要求先进入准备状态
							v2SystemMerge2.setValidFlag(V2SystemMergeStatus.INSTALLEDNEEDRELOAD.value);
//							}
						}
						
						v2SystemMerge2.setSettings(m.getSettings());
						v2SystemMerge2.setDependencies(m.getDependencies());
						V2SystemMerge ret = iExtensionPSModelRTServiceSession.getCloudExtensionClientMust().updateSystemMerge(prdV2System.getId(), v2SystemMerge2.getId(), v2SystemMerge2);
						
						//设置返回，供外部使用
						m.set(FIELD_V2SYSTEMMERGE, ret);

						if(IExtensionPSModelRTServiceSession.PRODUCTMARKETMODE_V2.equalsIgnoreCase(iExtensionPSModelRTServiceSession.getProductMarketMode())) {
							if(V2SystemType.MERGENCE.value.equals(ret.getMergeSystemType())) {
								if(bReload) {
									//iExtensionPSModelRTServiceSession.getSysCloudExtensionUtilRuntimeMust().publishDeploySystemVer(iExtensionPSModelRTServiceSession.getSystemRuntime().getDeploySystemId());
									this.doReload(m, prdV2System);
								}
							}
							else {
								iExtensionPSModelRTServiceSession.getSysCloudExtensionUtilRuntimeMust().publishSystemMergencesVer(prdV2System.getId());
							}
						}
					}
					else {
						m.set(FIELD_V2SYSTEMMERGE, v2SystemMerge);
					}
					return null;
				}
			}
		}

		// 执行新建操作
		V2SystemMerge v2SystemMerge = new V2SystemMerge();
		v2SystemMerge.setMergeSystemId(v2System.getId());
		v2SystemMerge.setOrderValue(nMaxOrderValue + 100);
		v2SystemMerge.setSettings(m.getSettings());
		v2SystemMerge.setDependencies(m.getDependencies());
		//判断安装系统类型
		if(V2SystemType.MERGENCE.value.equals(v2System.getType())) {
//			if(!bReload) {
			//MERGENCE类型要求先进入准备状态
			v2SystemMerge.setValidFlag(V2SystemMergeStatus.INSTALLEDNEEDRELOAD.value);
//			}
		}
	
		V2SystemMerge ret = iExtensionPSModelRTServiceSession.getCloudExtensionClientMust().createSystemMerge(prdV2System.getId(), v2SystemMerge);

		//设置返回，供外部使用
		m.set(FIELD_V2SYSTEMMERGE, ret);
		
		if(IExtensionPSModelRTServiceSession.PRODUCTMARKETMODE_V2.equalsIgnoreCase(iExtensionPSModelRTServiceSession.getProductMarketMode())) {
			if(V2SystemType.MERGENCE.value.equals(ret.getMergeSystemType())) {
				if(bReload) {
					//iExtensionPSModelRTServiceSession.getSysCloudExtensionUtilRuntimeMust().publishDeploySystemVer(iExtensionPSModelRTServiceSession.getSystemRuntime().getDeploySystemId());
					this.doReload(m, prdV2System);
				}
			}
			else {
				iExtensionPSModelRTServiceSession.getSysCloudExtensionUtilRuntimeMust().publishSystemMergencesVer(prdV2System.getId());
			}
		}

		return null;
	}
	
	@Override
	protected Object doReload(PSCorePrdFunc m) throws Exception {
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();

		String[] items = m.getId().split("[.]");
		if (items.length < 3) {
			throw new Exception("传入键值无效");
		}

		// 查询系统引用关系
		// 判断传入标识是否为系统标识
		String strSystemId = null;
		try {
			Integer.parseInt(items[1]);
		} catch (Throwable ex) {
			strSystemId = items[1];
		}

		V2System prdV2System = null;
		if(IExtensionPSModelRTServiceSession.PRODUCTMARKETMODE_V2.equalsIgnoreCase(iExtensionPSModelRTServiceSession.getProductMarketMode())) {
			PSCorePrdRTService psCorePrdRTService = (PSCorePrdRTService) this.getPSModelRTServiceSession().getPSModelService(PSModels.PSCOREPRD);
			prdV2System = psCorePrdRTService.getV2SystemIf(items[1]);
		}else {
			if (StringUtils.hasLength(strSystemId)) {
				prdV2System = iExtensionPSModelRTServiceSession.getCloudExtensionClientMust().getSystem(strSystemId);
			} else {
				PSCorePrdRTService psCorePrdRTService = (PSCorePrdRTService) this.getPSModelRTServiceSession().getPSModelService(PSModels.PSCOREPRD);
				prdV2System = psCorePrdRTService.getV2SystemIf(items[1]);
			}
		}

		return this.doReload(m, prdV2System);
	}
	
	protected Object doReload(PSCorePrdFunc m, V2System prdV2System) throws Exception {
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
		SearchContextDTO searchContextDTO = new SearchContextDTO();
		searchContextDTO.all();
		
		//查出全部功能
		Page<V2SystemMerge> v2SystemMergePage = iExtensionPSModelRTServiceSession.getCloudExtensionClientMust().fetchSystemMerges(prdV2System.getId(), searchContextDTO);
		if (!ObjectUtils.isEmpty(v2SystemMergePage) && !ObjectUtils.isEmpty(v2SystemMergePage.getContent())) {
			boolean bReload = false;
			for (V2SystemMerge v2SystemMerge : v2SystemMergePage.getContent()) {
				int nStatus = DataTypeUtils.asInteger(v2SystemMerge.getValidFlag(), 0);
				if(V2SystemMergeStatus.INSTALLEDNEEDRELOAD.value == nStatus || V2SystemMergeStatus.DISABLEDNEEDRELOAD.value == nStatus) {
					// 执行更新操作
					V2SystemMerge v2SystemMerge2 = new V2SystemMerge();
					v2SystemMerge2.setId(v2SystemMerge.getId());
					if(V2SystemMergeStatus.INSTALLEDNEEDRELOAD.value == nStatus) {
						v2SystemMerge2.setValidFlag(1);
					}
					else {
						v2SystemMerge2.setValidFlag(0);
					}
					
					V2SystemMerge ret = iExtensionPSModelRTServiceSession.getCloudExtensionClientMust().updateSystemMerge(prdV2System.getId(), v2SystemMerge2.getId(), v2SystemMerge2);
					bReload = true;
				}
			}
			if(bReload) {
				if(IExtensionPSModelRTServiceSession.PRODUCTMARKETMODE_V2.equalsIgnoreCase(iExtensionPSModelRTServiceSession.getProductMarketMode())) {
					iExtensionPSModelRTServiceSession.getSysCloudExtensionUtilRuntimeMust().publishDeploySystemVer(iExtensionPSModelRTServiceSession.getSystemRuntime().getDeploySystemId());
				}
			}
			return null;
		}
		return null;
	}

	@Override
	protected Object doUninstall(PSCorePrdFunc m) throws Exception {
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();

		String[] items = m.getId().split("[.]");
		if (items.length < 3) {
			throw new Exception("传入键值无效");
		}

		V2System v2System = getV2SystemIf(m.getId());
		
		Object reload = m.get("reload");
		boolean bReload = true;
		if(!ObjectUtils.isEmpty(reload)) {
			bReload = DataTypeUtils.asBoolean(reload, bReload);
		}
		
		// 查询系统引用关系
		// 判断传入标识是否为系统标识
		String strSystemId = null;
		try {
			Integer.parseInt(items[1]);
		} catch (Throwable ex) {
			strSystemId = items[1];
		}

		V2System prdV2System = null;
		if(IExtensionPSModelRTServiceSession.PRODUCTMARKETMODE_V2.equalsIgnoreCase(iExtensionPSModelRTServiceSession.getProductMarketMode())) {
			PSCorePrdRTService psCorePrdRTService = (PSCorePrdRTService) this.getPSModelRTServiceSession().getPSModelService(PSModels.PSCOREPRD);
			prdV2System = psCorePrdRTService.getV2SystemIf(items[1]);
		}else {
			if (StringUtils.hasLength(strSystemId)) {
				prdV2System = iExtensionPSModelRTServiceSession.getCloudExtensionClientMust().getSystem(strSystemId);
			} else {
				PSCorePrdRTService psCorePrdRTService = (PSCorePrdRTService) this.getPSModelRTServiceSession().getPSModelService(PSModels.PSCOREPRD);
				prdV2System = psCorePrdRTService.getV2SystemIf(items[1]);
			}
		}

		SearchContextDTO searchContextDTO = new SearchContextDTO();
		searchContextDTO.all();

		searchContextDTO.eq(V2SystemMerge.FIELD_MERGE_SYSTEM_ID, v2System.getId());

		Page<V2SystemMerge> v2SystemMergePage = iExtensionPSModelRTServiceSession.getCloudExtensionClientMust().fetchSystemMerges(prdV2System.getId(), searchContextDTO);
		if (!ObjectUtils.isEmpty(v2SystemMergePage) && !ObjectUtils.isEmpty(v2SystemMergePage.getContent())) {
			for (V2SystemMerge v2SystemMerge : v2SystemMergePage.getContent()) {
				int nStatus = DataTypeUtils.asInteger(v2SystemMerge.getValidFlag(), 0);
				if(V2SystemMergeStatus.INSTALLED.value == nStatus || V2SystemMergeStatus.INSTALLEDNEEDRELOAD.value == nStatus) {
					// 执行更新操作
					V2SystemMerge v2SystemMerge2 = new V2SystemMerge();
					v2SystemMerge2.setId(v2SystemMerge.getId());
					v2SystemMerge2.setValidFlag(V2SystemMergeStatus.NOTINSTALLED.value);
					if(V2SystemType.MERGENCE.value.equals(v2System.getType())) {
//						if(!bReload) {
						//MERGENCE类型要求先进入准备状态
						v2SystemMerge2.setValidFlag(V2SystemMergeStatus.DISABLEDNEEDRELOAD.value);
//						}
					}
					
					V2SystemMerge ret = iExtensionPSModelRTServiceSession.getCloudExtensionClientMust().updateSystemMerge(prdV2System.getId(), v2SystemMerge2.getId(), v2SystemMerge2);

					//设置返回，供外部使用
					m.set(FIELD_V2SYSTEMMERGE, ret);
					
					if(IExtensionPSModelRTServiceSession.PRODUCTMARKETMODE_V2.equalsIgnoreCase(iExtensionPSModelRTServiceSession.getProductMarketMode())) {
						if(V2SystemType.MERGENCE.value.equals(ret.getMergeSystemType())) {
							if(bReload) {
								//iExtensionPSModelRTServiceSession.getSysCloudExtensionUtilRuntimeMust().publishDeploySystemVer(iExtensionPSModelRTServiceSession.getSystemRuntime().getDeploySystemId());
								this.doReload(m, prdV2System);
							}
						}
						else {
							iExtensionPSModelRTServiceSession.getSysCloudExtensionUtilRuntimeMust().publishSystemMergencesVer(prdV2System.getId());
						}
					}
				}
				else {
					m.set(FIELD_V2SYSTEMMERGE, v2SystemMerge);
				}
			}
			return null;
		}

		return null;
	}

	public V2System getV2SystemIf(String strPSCorePrdFuncId) throws Exception {
		return this.getV2SystemIf(this.get(strPSCorePrdFuncId, false));
	}

	protected V2System getV2SystemIf(PSCorePrdFunc psCorePrdFunc) throws Exception {

		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();

		V2System v2System = this.getV2System(psCorePrdFunc, true);
		if (v2System != null) {
			return v2System;
		}

		String[] items = psCorePrdFunc.getId().split("[.]");
		if (items.length < 3) {
			throw new Exception("传入键值无效");
		}

		// 检查系统是否已经安装
		SearchContextDTO searchContextDTO = new SearchContextDTO();
		searchContextDTO.all();

		searchContextDTO.eq(V2System.FIELD_MARKET_URL, iExtensionPSModelRTServiceSession.getProductMarketServiceUrl());
		searchContextDTO.eq(V2System.FIELD_PRODUCT_ID, items[2]);
		searchContextDTO.eq(V2System.FIELD_TYPE, psCorePrdFunc.getFuncType());

		// if (StringUtils.hasLength(psCorePrd.getPSCorePrdCatId())) {
		// searchContextDTO.eq(V2System.FIELD_PRODUCT_GROUP_ID,
		// psCorePrd.getPSCorePrdCatId());
		// }

		Page<V2System> page = iExtensionPSModelRTServiceSession.getCloudExtensionClientMust().fetchSystems(searchContextDTO);
		if (!ObjectUtils.isEmpty(page) && !ObjectUtils.isEmpty(page.getContent())) {
			return page.getContent().get(0);
		}

		v2System = new V2System();
		v2System.setName(psCorePrdFunc.getName());
		// if (StringUtils.hasLength(psCorePrd.getPSCorePrdCatName())) {
		// v2System.setName(psCorePrd.getPSCorePrdCatName());
		// }
		v2System.setMarketUrl(iExtensionPSModelRTServiceSession.getProductMarketServiceUrl());
		v2System.setProductId(items[2]);
		// v2System.setProductGroupId(psCorePrdFunc.getPSCorePrdCatId());
		v2System.setType(psCorePrdFunc.getFuncType());
		v2System.setHttpUrlToRepo(psCorePrdFunc.getHttpUrlToRepo());

		v2System.setProductGroupId(psCorePrdFunc.getFuncTag());

		v2System.setDefaultBranch((String) psCorePrdFunc.get("default_branch"));

		if (V2SystemType.EXTENSION.value.equals(v2System.getType())) {
			// 填充父系统标识
			// PSCorePrdRTService psCorePrdRTService =
			// (PSCorePrdRTService)this.getPSModelRTServiceSession().getPSModelService(PSModels.PSCOREPRD);
			// V2System v2System2 =
			// psCorePrdRTService.getV2SystemIf(psCorePrdFunc.getPSCorePrdId());
			// v2System.setSystemId(v2System2.getId());
			v2System.setSystemTag(psCorePrdFunc.getFuncTag2());
		}

		return iExtensionPSModelRTServiceSession.getCloudExtensionClientMust().createSystem(v2System);
	}

	protected V2System getV2System(PSCorePrdFunc psCorePrdFunc, boolean tryMode) throws Exception {

		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();

		String[] items = psCorePrdFunc.getId().split("[.]");
		if (items.length < 3) {
			throw new Exception("传入键值无效");
		}

		// 检查系统是否已经安装
		SearchContextDTO searchContextDTO = new SearchContextDTO();
		searchContextDTO.all();

		searchContextDTO.eq(V2System.FIELD_MARKET_URL, iExtensionPSModelRTServiceSession.getProductMarketServiceUrl());
		searchContextDTO.eq(V2System.FIELD_PRODUCT_ID, items[2]);
		// if (StringUtils.hasLength(psCorePrd.getPSCorePrdCatId())) {
		// searchContextDTO.eq(V2System.FIELD_PRODUCT_GROUP_ID,
		// psCorePrd.getPSCorePrdCatId());
		// }

		Page<V2System> page = iExtensionPSModelRTServiceSession.getCloudExtensionClientMust().fetchSystems(searchContextDTO);
		if (!ObjectUtils.isEmpty(page) && !ObjectUtils.isEmpty(page.getContent())) {
			return page.getContent().get(0);
		}

		if (tryMode) {
			return null;
		}

		throw new Exception(String.format("无法获取指定产品功能[%1$s]的本地系统数据", psCorePrdFunc.getId()));
	}

}
