package net.ibizsys.central.plugin.extension.psmodel.service;

import java.util.ArrayList;
import java.util.Base64;
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

import net.ibizsys.central.cloud.core.util.domain.V2DeploySystem;
import net.ibizsys.central.cloud.core.util.domain.V2System;
import net.ibizsys.central.cloud.core.util.domain.V2SystemType;
import net.ibizsys.central.plugin.extension.psmodel.util.IExtensionPSModelRTServiceSession;
import net.ibizsys.central.service.client.IWebClientRep;
import net.ibizsys.central.service.client.WebClientBase;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.model.util.Conditions;
import net.ibizsys.model.util.Errors;
import net.ibizsys.psmodel.core.domain.PSCorePrd;
import net.ibizsys.psmodel.core.filter.PSCorePrdFilter;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.ErrorException;

public class PSCorePrdRTService extends net.ibizsys.psmodel.runtime.service.PSCorePrdRTService{

	private static final Log log = LogFactory.getLog(PSCorePrdRTService.class);

	public static final String CURRENTID = "_CURRENT_";


	public final static String FIELD_INFO = "info";

//	/**
//	 * 行为：建立产品版本
//	 */
//	final public static String METHOD_CREATEVERSION = "CREATEVERSION";
//
//
//	/**
//	 * 行为：建立产品版本
//	 */
//	final public static String METHOD_CREATEMERGEVERSION = "CREATEMERGEVERSION";
//
//
//	@Override
//	protected Object doInvoke(String methodName, String key, Object params) throws Exception {
//		if (METHOD_CREATEVERSION.equalsIgnoreCase(methodName)
//				||METHOD_CREATEMERGEVERSION.equalsIgnoreCase(methodName)) {
//			PSCorePrd domain = this.getDomain(params);
//			return this.createVersion(domain);
//		}
//
//		return super.doInvoke(methodName, key, params);
//	}

	@Override
	protected PSCorePrd doGet(String key, boolean tryMode) throws Exception {

		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();

		Map<String, Object> queryParams = new LinkedHashMap<String, Object>();
		Map<String, Object> uriParams = new LinkedHashMap<String, Object>();

		PSCorePrd psCorePrd = null;
		String strPath = "";

		if(IExtensionPSModelRTServiceSession.PRODUCTMARKETMODE_V2.equalsIgnoreCase(iExtensionPSModelRTServiceSession.getProductMarketMode())) {

			PSCorePrdFilter psCorePrdFilter = new PSCorePrdFilter();
			psCorePrdFilter.setFieldCond(PSCorePrd.FIELD_PSCOREPRDID, Conditions.EQ, key);
			List<PSCorePrd> list = getDomainList(DATASET_DEFAULT, psCorePrdFilter);
			if(ObjectUtils.isEmpty(list)) {
				throw new ErrorException(String.format("无法获取指定数据[%1$s]", key), Errors.INVALIDDATA);
			}

			psCorePrd = list.get(0);
			//uriParams.put("projectid", java.net.URLEncoder.encode(psCorePrd.getPath().substring(1), "UTF-8"));
			if(StringUtils.hasLength(psCorePrd.getPath())) {
				if(psCorePrd.getPath().indexOf("/") == 0) {
					uriParams.put("projectid", psCorePrd.getPath().substring(1));
				}
				else {
					uriParams.put("projectid", psCorePrd.getPath());
				}
			}
		}
		else {

			strPath = "/projects/{projectid}";
			uriParams.put("projectid",  key);

			String strUrl = String.format("%1$s%2$s", iExtensionPSModelRTServiceSession.getProductMarketServiceUrl(), strPath);

			IWebClientRep<String> rep;
			try {
				rep = iExtensionPSModelRTServiceSession.getSystemRuntime().getDefaultWebClient().get(strUrl, uriParams, null, queryParams, String.class, null);
			} catch (Throwable ex) {
				throw new Exception(String.format("请求市场发生异常，%1$s", ex.getMessage()), ex);
			}

			Map item = WebClientBase.MAPPER.readValue(rep.getBody(), Map.class);
			psCorePrd = getPSCorePrd(item);
		}


		//读取 README.md
		strPath = "/projects/{projectid}/repository/files/{filepath}?ref={branch}";
		uriParams.put("filepath", "README.md");
		uriParams.put("branch", DataTypeUtils.getStringValue(psCorePrd.get("default_branch"), "master"));

		String strUrl = String.format("%1$s%2$s", iExtensionPSModelRTServiceSession.getProductMarketServiceUrl(), strPath);
		IWebClientRep<String> rep;

		try {
			rep = iExtensionPSModelRTServiceSession.getSystemRuntime().getDefaultWebClient().get(strUrl, uriParams, null, queryParams, String.class, null);
		}
		catch (Throwable ex) {
			boolean bIgnore = false;
			rep = null;
			if(ex.getCause() instanceof WebClientResponseException) {
				WebClientResponseException webClientResponseException = (WebClientResponseException)ex.getCause();
				if(webClientResponseException.getStatusCode().value() == HttpStatus.NOT_FOUND.value()) {
					bIgnore = true;
				}
			}

			if(!bIgnore)
				throw new Exception(String.format("获取README.md文件发生异常，%1$s", ex.getMessage()), ex);
		}

		if(rep != null) {
			try {
				Map item = WebClientBase.MAPPER.readValue(rep.getBody(), Map.class);
				String content = (String)item.get("content");
				if(StringUtils.hasLength(content)) {
					content = new String(Base64.getDecoder().decode(content));
				}
				psCorePrd.set(FIELD_INFO, content);
			}
			catch (Exception ex) {
				throw new Exception(String.format("解析README.md文件发生异常，%1$s", ex.getMessage()), ex);
			}
		}
		return psCorePrd;
	}


	@Override
	protected List<PSCorePrd> getDomainList(String dataSetName, PSCorePrdFilter f) throws Exception {
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();

		Map<String, Object> queryParams = new LinkedHashMap<String, Object>();
		Map<String, Object> uriParams = new LinkedHashMap<String, Object>();

		List<PSCorePrd> dtoList = new ArrayList<PSCorePrd>();

		if(IExtensionPSModelRTServiceSession.PRODUCTMARKETMODE_V2.equalsIgnoreCase(iExtensionPSModelRTServiceSession.getProductMarketMode())) {
			//读取 projects.yml
			String strPath = "/projects/{projectid}/repository/files/{filepath}?ref={branch}";
			uriParams.put("projectid", iExtensionPSModelRTServiceSession.getProductMarketProjectId());
			uriParams.put("filepath", "projects.yml");
			uriParams.put("branch", DataTypeUtils.getStringValue(null, "master"));

			String strUrl = String.format("%1$s%2$s", iExtensionPSModelRTServiceSession.getProductMarketServiceUrl(), strPath);
			IWebClientRep<String> rep;
			try {
				rep = iExtensionPSModelRTServiceSession.getSystemRuntime().getDefaultWebClient().get(strUrl, uriParams, null, queryParams, String.class, null);
			}
			catch (Throwable ex) {
				boolean bIgnore = false;
				rep = null;
				if(ex.getCause() instanceof WebClientResponseException) {
					WebClientResponseException webClientResponseException = (WebClientResponseException)ex.getCause();
					if(webClientResponseException.getStatusCode().value() == HttpStatus.NOT_FOUND.value()) {
						bIgnore = true;
					}
				}

				if(!bIgnore)
					throw new Exception(String.format("获取projects.yml文件发生异常，%1$s", ex.getMessage()), ex);
			}

			if(rep != null) {
				try {
					Map body = WebClientBase.MAPPER.readValue(rep.getBody(), Map.class);
					String content = (String)body.get("content");
					if(StringUtils.hasLength(content)) {
						content = new String(Base64.getDecoder().decode(content));
					}

					Yaml yaml = new Yaml();
					Map map = yaml.loadAs(content, Map.class);

					Object projects = map.get("projects");
					if(projects instanceof List) {
						List list = (List)projects;
						for(Object item : list) {
							if(!(item instanceof Map)) {
								continue;
							}

							PSCorePrd psCorePrd = this.getPSCorePrdV2((Map)item);
							dtoList.add(psCorePrd);
						}
					}
				}
				catch (Exception ex) {
					throw new Exception(String.format("解析projects.yml文件发生异常，%1$s", ex.getMessage()), ex);
				}
			}
		}
		else {
			queryParams.put("per_page", 2000);
			queryParams.put("order_by", "path");

			// 判断是否指定了父分类
			String strPId = DataTypeUtils.getStringValue(f.get("n_" + PSCorePrd.FIELD_PSCOREPRDCATID + "_eq"), "");
			if (!StringUtils.hasLength(strPId)) {
				strPId = iExtensionPSModelRTServiceSession.getProductMarketGroupId();
			}

			String strPath = "";
			if (DATASET_DEFAULT.equalsIgnoreCase(dataSetName)) {
				strPath = "/groups/{groupid}/projects";
				uriParams.put("groupid", strPId);
			} else if (DATASET_CURCATDESCENDANT.equalsIgnoreCase(dataSetName)) {
				strPath = "/groups/{groupid}/projects";
				uriParams.put("groupid", strPId);
				queryParams.put("include_subgroups", true);
				//要去除分类值
				f.reset("n_" + PSCorePrd.FIELD_PSCOREPRDCATID + "_eq");
			} else
				throw new Exception(String.format("无法识别的数据集标识[%1$s]", dataSetName));

			String strQuery = DataTypeUtils.getStringValue(f.get(IPSModelFilter.PARAM_QUERY), null);
			if (StringUtils.hasLength(strQuery)) {
				queryParams.put("search", strQuery);
			}

			String strUrl = String.format("%1$s%2$s", iExtensionPSModelRTServiceSession.getProductMarketServiceUrl(), strPath);

			IWebClientRep<String> rep;
			try {
				rep = iExtensionPSModelRTServiceSession.getSystemRuntime().getDefaultWebClient().get(strUrl, uriParams, null, queryParams, String.class, null);
			} catch (Throwable ex) {
				throw new Exception(String.format("请求市场发生异常，%1$s", ex.getMessage()), ex);
			}

			int nTotal = DataTypeUtils.getIntegerValue(rep.getHeader("X-Total"), 0);
			List list = WebClientBase.MAPPER.readValue(rep.getBody(), List.class);

			for (Object objItem : list) {
				if (!(objItem instanceof Map)) {
					continue;
				}

				Map item = (Map) objItem;
				PSCorePrd psCorePrd = getPSCorePrd(item);
				// psCorePrd.set("marketurl",
				// iExtensionPSModelRTServiceSession.getProductMarketServiceUrl());
				dtoList.add(psCorePrd);
			}
		}

		// 放入分页
		// per_page=100&page=2
//		if (f.getPageable() != null && f.getPageable() != Pageable.unpaged()) {
//			queryParams.put("per_page", f.getPageable().getPageSize());
//			queryParams.put("page", f.getPageable().getPageNumber() + 1);
//		}



		return this.filterDomainList(dtoList, dataSetName, f);
	}


//	@Override
//	protected Page<PSCorePrd> doFetch(String dataSetName, PSCorePrdFilter f) throws Exception {
//
//		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
//
//		Map<String, Object> queryParams = new LinkedHashMap<String, Object>();
//		Map<String, Object> uriParams = new LinkedHashMap<String, Object>();
//
//		// 放入分页
//		// per_page=100&page=2
//		if (f.getPageable() != null && f.getPageable() != Pageable.unpaged()) {
//			queryParams.put("per_page", f.getPageable().getPageSize());
//			queryParams.put("page", f.getPageable().getPageNumber() + 1);
//		}
//
//		queryParams.put("order_by", "path");
//
//		// 判断是否指定了父分类
//		String strPId = DataTypeUtils.getStringValue(f.get("n_" + PSCorePrd.FIELD_PSCOREPRDCATID + "_eq"), "");
//		if (!StringUtils.hasLength(strPId)) {
//			strPId = iExtensionPSModelRTServiceSession.getProductMarketGroupId();
//		}
//
//		String strPath = "";
//		if (DATASET_DEFAULT.equalsIgnoreCase(dataSetName)) {
//			strPath = "/groups/{groupid}/projects";
//			uriParams.put("groupid", strPId);
//		} else if (DATASET_CURCATDESCENDANT.equalsIgnoreCase(dataSetName)) {
//			strPath = "/groups/{groupid}/projects";
//			uriParams.put("groupid", strPId);
//			queryParams.put("include_subgroups", true);
//		} else
//			throw new Exception(String.format("无法识别的数据集标识[%1$s]", dataSetName));
//
//		String strQuery = DataTypeUtils.getStringValue(f.get(IPSModelFilter.PARAM_QUERY), null);
//		if (StringUtils.hasLength(strQuery)) {
//			queryParams.put("search", strQuery);
//		}
//
//		String strUrl = String.format("%1$s%2$s", iExtensionPSModelRTServiceSession.getProductMarketServiceUrl(), strPath);
//
//		IWebClientRep<String> rep;
//		try {
//			rep = iExtensionPSModelRTServiceSession.getSystemRuntime().getDefaultWebClient().get(strUrl, uriParams, null, queryParams, String.class, null);
//		} catch (Throwable ex) {
//			throw new Exception(String.format("请求市场发生异常，%1$s", ex.getMessage()), ex);
//		}
//
//		int nTotal = DataTypeUtils.getIntegerValue(rep.getHeader("X-Total"), 0);
//		List list = WebClientBase.MAPPER.readValue(rep.getBody(), List.class);
//		List<PSCorePrd> dtoList = new ArrayList<PSCorePrd>();
//		for (Object objItem : list) {
//			if (!(objItem instanceof Map)) {
//				continue;
//			}
//
//			Map item = (Map) objItem;
//			PSCorePrd psCorePrd = getPSCorePrd(item);
//			// psCorePrd.set("marketurl",
//			// iExtensionPSModelRTServiceSession.getProductMarketServiceUrl());
//			dtoList.add(psCorePrd);
//		}
//
//		return new PageImpl<PSCorePrd>(dtoList, f.getPageable(), nTotal);
//	}

	protected PSCorePrd getPSCorePrd(Map item) {
		PSCorePrd psCorePrd = new PSCorePrd();
		psCorePrd.setId(DataTypeUtils.getStringValue(item.get("id"), null));
		psCorePrd.setName(DataTypeUtils.getStringValue(item.get("name"), null));

		psCorePrd.setPath(DataTypeUtils.getStringValue(item.get("path"), null));
		psCorePrd.setMemo(DataTypeUtils.getStringValue(item.get("description"), null));

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
		psCorePrd.setFullName(strFullName);

		psCorePrd.setFullPath(DataTypeUtils.getStringValue(item.get("path_with_namespace"), null));

		psCorePrd.setAvatarUrl(DataTypeUtils.getStringValue(item.get("avatar_url"), null));

		psCorePrd.setHttpUrlToRepo(DataTypeUtils.getStringValue(item.get("http_url_to_repo"), null));

		psCorePrd.setPkgFolder(DataTypeUtils.getStringValue(item.get("default_branch"), null));
		psCorePrd.set("default_branch", DataTypeUtils.getStringValue(item.get("default_branch"), null));

		//
		// data.put(MARKETPRODUCT.FIELD_READMEURL, item.get("readme_url"));
		// data.put(MARKETPRODUCT.FIELD_HTTPURLTOREPO,
		// item.get("http_url_to_repo"));
		// data.put(MARKETPRODUCT.FIELD_WEBURL, item.get("web_url"));
		//
		// String strHttpUrl =
		// (String)data.get(MARKETPRODUCT.FIELD_HTTPURLTOREPO);
		// if(StringUtils.hasLength(strHttpUrl)) {
		//
		// //b56b7ac7db5d/172.16.240.55
		// strHttpUrl = strHttpUrl.replace("b56b7ac7db5d", "172.16.240.55");
		// data.put(MARKETPRODUCT.FIELD_HTTPURLTOREPO, strHttpUrl);
		// }
		//
		//
		// Object tag_list = item.get("tag_list");
		// if(tag_list instanceof List) {
		// List list = (List)tag_list;
		// String tags = "";
		// for(Object tag : list) {
		// if(ObjectUtils.isEmpty(tag)) {
		// continue;
		// }
		// String strTag = tag.toString();
		// if(strTag.toLowerCase().indexOf("ibiz-") == 0) {
		// String strProductType = strTag.substring(5).toUpperCase();
		// data.put(MARKETPRODUCT.FIELD_PRODUCTTYPE, strProductType);
		// }
		// else {
		// if(StringUtils.hasLength(tags)) {
		// tags += ",";
		// }
		// tags += strTag;
		// }
		// }
		// data.put(MARKETPRODUCT.FIELD_TAGS, tags);
		// }
		//

		Object namespace = item.get("namespace");
		if (namespace instanceof Map) {
			Map map = (Map) namespace;
			psCorePrd.setPSCorePrdCatId(DataTypeUtils.getStringValue(map.get("id"), null));
			psCorePrd.setPSCorePrdCatName(DataTypeUtils.getStringValue(map.get("name"), null));
			psCorePrd.setPSCorePrdCatPath(DataTypeUtils.getStringValue(map.get("path"), null));

			if("core".equalsIgnoreCase(psCorePrd.getPath())) {
				psCorePrd.setName(psCorePrd.getPSCorePrdCatName());
			}
		}
		return psCorePrd;
	}

	protected PSCorePrd getPSCorePrdV2(Map item) {
		PSCorePrd psCorePrd = new PSCorePrd();
		psCorePrd.setId(DataTypeUtils.getStringValue(item.get("key"), null));
		psCorePrd.setName(DataTypeUtils.getStringValue(item.get("name"), null));

		psCorePrd.setPath(DataTypeUtils.getStringValue(item.get("path"), null));
		psCorePrd.setMemo(DataTypeUtils.getStringValue(item.get("description"), null));
		if(item.get("catalog") instanceof List){
			psCorePrd.setPSCorePrdCatId(((List<String>) item.get("catalog")).get(0));
		}
		psCorePrd.setAvatarUrl(DataTypeUtils.getStringValue(item.get("avatar_url"), null));
		psCorePrd.setSettingUrl(DataTypeUtils.getStringValue(item.get("setting_url"), null));
		psCorePrd.setHttpUrlToRepo(DataTypeUtils.getStringValue(item.get("http_url_to_repo"), null));
		return psCorePrd;
	}

	@Override
	protected Object doInstall(PSCorePrd m) throws Exception {
		if (CURRENTID.equalsIgnoreCase(m.getId())) {
			log.error(String.format("当前产品已经安装"));
			return null;
		}

		String strSystemId = DataTypeUtils.getStringValue(m.get("system_id"), null);
		//String strDeploySystemId = DataTypeUtils.getStringValue(m.get("deploy_system_id"), null);

		this.getV2SystemIf(this.get(m.getId(), false), strSystemId);

		return null;
	}

	public V2System getV2SystemIf(String strPSCorePrdId) throws Exception {
		return this.getV2SystemIf(this.get(strPSCorePrdId, false), null);
	}

	protected V2System getV2SystemIf(PSCorePrd psCorePrd, String strSystemId) throws Exception {

		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
		if(StringUtils.hasLength(strSystemId)) {
			strSystemId = strSystemId.toLowerCase();
		}

		// 检查系统是否已经安装
		if(true) {
			SearchContextDTO searchContextDTO = new SearchContextDTO();
			searchContextDTO.all();

			searchContextDTO.eq(V2System.FIELD_MARKET_URL, iExtensionPSModelRTServiceSession.getProductMarketServiceUrl());
			searchContextDTO.eq(V2System.FIELD_PRODUCT_ID, psCorePrd.getId());
			if (StringUtils.hasLength(psCorePrd.getPSCorePrdCatId())) {
				searchContextDTO.eq(V2System.FIELD_PRODUCT_GROUP_ID, psCorePrd.getPSCorePrdCatId());
			}
			if(StringUtils.hasLength(strSystemId)) {
				searchContextDTO.eq(V2System.FIELD_ID, strSystemId);
			}

			Page<V2System> page = iExtensionPSModelRTServiceSession.getCloudExtensionClient().fetchSystems(searchContextDTO);
			if (!ObjectUtils.isEmpty(page) && !ObjectUtils.isEmpty(page.getContent())) {
				return page.getContent().get(0);
			}
		}

		if(StringUtils.hasLength(strSystemId)) {
			SearchContextDTO searchContextDTO = new SearchContextDTO();
			searchContextDTO.all();

			searchContextDTO.eq(V2DeploySystem.FIELD_ID, strSystemId);

			Page<V2DeploySystem> page = iExtensionPSModelRTServiceSession.getCloudExtensionClient().fetchDeploySystems(searchContextDTO);
			if (!ObjectUtils.isEmpty(page) && !ObjectUtils.isEmpty(page.getContent())) {
				throw new Exception(String.format("指定部署系统[%1$s]已经存在", strSystemId));
			}
		}

		V2System v2System = new V2System();
		if(StringUtils.hasLength(strSystemId)) {
			v2System.setId(strSystemId);
		}
		v2System.setName(psCorePrd.getName());
		if (StringUtils.hasLength(psCorePrd.getPSCorePrdCatName())) {
			v2System.setName(psCorePrd.getPSCorePrdCatName());
		}
		v2System.setMarketUrl(iExtensionPSModelRTServiceSession.getProductMarketServiceUrl());
		v2System.setProductId(psCorePrd.getId());
		v2System.setProductGroupId(psCorePrd.getPSCorePrdCatId());
		v2System.setType(V2SystemType.CORE.value);
		v2System.setHttpUrlToRepo(psCorePrd.getHttpUrlToRepo());
		v2System.setDefaultBranch(psCorePrd.getPkgFolder());

		v2System = iExtensionPSModelRTServiceSession.getCloudExtensionClient().createSystem(v2System);

		if(StringUtils.hasLength(strSystemId)) {
			V2DeploySystem v2DeploySystem = new V2DeploySystem();
			v2DeploySystem.setId(strSystemId);
			v2DeploySystem.setName(v2System.getName());
			v2DeploySystem.setSystemId(strSystemId);
			v2DeploySystem = iExtensionPSModelRTServiceSession.getCloudExtensionClient().createDeploySystem(v2DeploySystem);
		}

		return v2System;
	}

	protected V2System getV2System(PSCorePrd psCorePrd, String strSystemId, boolean tryMode) throws Exception {

		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();

		// 检查系统是否已经安装
		SearchContextDTO searchContextDTO = new SearchContextDTO();
		searchContextDTO.all();

		searchContextDTO.eq(V2System.FIELD_MARKET_URL, iExtensionPSModelRTServiceSession.getProductMarketServiceUrl());
		searchContextDTO.eq(V2System.FIELD_PRODUCT_ID, psCorePrd.getId());
		if (StringUtils.hasLength(psCorePrd.getPSCorePrdCatId())) {
			searchContextDTO.eq(V2System.FIELD_PRODUCT_GROUP_ID, psCorePrd.getPSCorePrdCatId());
		}

		if(StringUtils.hasLength(strSystemId)) {
			searchContextDTO.eq(V2System.FIELD_ID, strSystemId);
		}

		Page<V2System> page = iExtensionPSModelRTServiceSession.getCloudExtensionClient().fetchSystems(searchContextDTO);
		if (!ObjectUtils.isEmpty(page) && !ObjectUtils.isEmpty(page.getContent())) {
			return page.getContent().get(0);
		}

		if (tryMode) {
			return null;
		}

		throw new Exception(String.format("无法获取指定产品[%1$s]的本地系统数据", psCorePrd.getId()));
	}

}
