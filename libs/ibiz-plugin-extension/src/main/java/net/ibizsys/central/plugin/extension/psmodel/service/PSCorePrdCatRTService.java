package net.ibizsys.central.plugin.extension.psmodel.service;

import java.util.ArrayList;
import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.yaml.snakeyaml.Yaml;

import net.ibizsys.central.plugin.extension.psmodel.util.IExtensionPSModelRTServiceSession;
import net.ibizsys.central.service.client.IWebClientRep;
import net.ibizsys.central.service.client.WebClientBase;
import net.ibizsys.model.util.Conditions;
import net.ibizsys.psmodel.core.domain.PSCorePrdCat;
import net.ibizsys.psmodel.core.filter.PSCorePrdCatFilter;
import net.ibizsys.runtime.util.DataTypeUtils;

public class PSCorePrdCatRTService extends net.ibizsys.psmodel.runtime.service.PSCorePrdCatRTService {

//	public final static String PARAM_BASEPSCOREPRDCAT = "_BASEPSCOREPRDCAT_";
//	
//	public PSCorePrdCat getBasePSCorePrdCat() throws Exception {
//		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession)this.getPSModelRTServiceSession();
//		
//		Object value = iExtensionPSModelRTServiceSession.getParam(PARAM_BASEPSCOREPRDCAT);
//		if(value == null) {
//			value = this.doGetBasePSCorePrdCat();
//			iExtensionPSModelRTServiceSession.setParam(PARAM_BASEPSCOREPRDCAT, value);
//		}
//		return (PSCorePrdCat)value;
//	}
//	
//	protected PSCorePrdCat doGetBasePSCorePrdCat() throws Exception {
//		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession)this.getPSModelRTServiceSession();
//		
//		Map<String, Object> queryParams = new LinkedHashMap<String, Object>();
//		Map<String, Object> uriParams = new LinkedHashMap<String, Object>();
//		
//	
//		
//		String strPath = "";
//		strPath = "/groups/{groupid}/subgroups/{subgroupid}";
//		uriParams.put("groupid", iExtensionPSModelRTServiceSession.getProductMarketGroupId());
//		uriParams.put("subgroupid", iExtensionPSModelRTServiceSession.getProductMarketBaseGroupId());
//		
//		
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
//		Map item = WebClientBase.MAPPER.readValue(rep.getBody(), Map.class);
//		return this.getPSCorePrdCat(item);
//	}
	
	@Override
	protected List<PSCorePrdCat> getDomainList(String dataSetName, PSCorePrdCatFilter f) throws Exception {
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession)this.getPSModelRTServiceSession();
		
		Map<String, Object> queryParams = new LinkedHashMap<String, Object>();
		Map<String, Object> uriParams = new LinkedHashMap<String, Object>();
		
		List<PSCorePrdCat> dtoList = new ArrayList<PSCorePrdCat>();
		
		if(IExtensionPSModelRTServiceSession.PRODUCTMARKETMODE_V2.equalsIgnoreCase(iExtensionPSModelRTServiceSession.getProductMarketMode())) {
			//读取 README.md
			String strPath = "/projects/{projectid}/repository/files/{filepath}?ref={branch}";
			uriParams.put("projectid", iExtensionPSModelRTServiceSession.getProductMarketProjectId());
			uriParams.put("filepath", "catalogs.yml");
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
					throw new Exception(String.format("获取catalogs.yml文件发生异常，%1$s", ex.getMessage()), ex);
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
				 
					Object catalogs = map.get("catalogs");
					if(catalogs instanceof List) {
						List list = (List)catalogs;
						for(Object item : list) {
							if(!(item instanceof Map)) {
								continue;
							}
							
							PSCorePrdCat psCorePrdCat = this.getPSCorePrdCatV2((Map)item);			
							dtoList.add(psCorePrdCat);
						}
					}
				}
				catch (Exception ex) {
					throw new Exception(String.format("解析catalogs.yml文件发生异常，%1$s", ex.getMessage()), ex);
				}
			}
		}
		else {
			//放入分页
			//per_page=100&page=2
//			if(f.getPageable() != null && f.getPageable() != Pageable.unpaged()) {
//				queryParams.put("per_page", f.getPageable().getPageSize());
//				queryParams.put("page", f.getPageable().getPageNumber()+1);
//			}
			
			queryParams.put("per_page", 2000);
			
			queryParams.put("order_by", "path");
			
			//判断是否指定了父分类
			String strPId = DataTypeUtils.getStringValue(f.getFieldCond(PSCorePrdCat.FIELD_PPSCOREPRDCATID, Conditions.EQ), "");
			if(!StringUtils.hasLength(strPId)) {
				strPId = iExtensionPSModelRTServiceSession.getProductMarketGroupId();
				
			}
			
			String strPath = "";
			if("DEFAULT".equalsIgnoreCase(dataSetName)) {
				strPath = "/groups/{groupid}/subgroups";
				uriParams.put("groupid", strPId);
			}
			else 
				throw new Exception(String.format("无法识别的数据集标识[%1$s]", dataSetName));
			
			
			String strUrl = String.format("%1$s%2$s", iExtensionPSModelRTServiceSession.getProductMarketServiceUrl(), strPath);
			
			IWebClientRep<String> rep;
			try {
				rep = iExtensionPSModelRTServiceSession.getSystemRuntime().getDefaultWebClient().get(strUrl, uriParams, null, queryParams, String.class, null);
			} catch (Throwable ex) {
				throw new Exception(String.format("请求市场发生异常，%1$s", ex.getMessage()), ex);
			}
			
			int nTotal = DataTypeUtils.getIntegerValue(rep.getHeader("X-Total"), 0);
			List list = WebClientBase.MAPPER.readValue(rep.getBody(), List.class);
			
			for(Object objItem : list) {
				if(!(objItem instanceof Map)) {
					continue;
				}
				
				Map item = (Map)objItem;
				PSCorePrdCat psCorePrdCat = this.getPSCorePrdCat(item);			
				dtoList.add(psCorePrdCat);
			}
			
			f.reset("n_ppscoreprdcatid_eq");
		}
		
		
		
		return this.filterDomainList(dtoList, dataSetName, f);
	}
	
//	@Override
//	protected Page<PSCorePrdCat> doFetch(String dataSetName, PSCorePrdCatFilter f) throws Exception {
//
//		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession)this.getPSModelRTServiceSession();
//		
//		Map<String, Object> queryParams = new LinkedHashMap<String, Object>();
//		Map<String, Object> uriParams = new LinkedHashMap<String, Object>();
//		
//		//放入分页
//		//per_page=100&page=2
//		if(f.getPageable() != null && f.getPageable() != Pageable.unpaged()) {
//			queryParams.put("per_page", f.getPageable().getPageSize());
//			queryParams.put("page", f.getPageable().getPageNumber()+1);
//		}
//		
//		queryParams.put("order_by", "path");
//		
//		//判断是否指定了父分类
//		String strPId = DataTypeUtils.getStringValue(f.getFieldCond(PSCorePrdCat.FIELD_PPSCOREPRDCATID, Conditions.EQ), "");
//		if(!StringUtils.hasLength(strPId)) {
//			strPId = iExtensionPSModelRTServiceSession.getProductMarketGroupId();
//			
//		}
//		
//		String strPath = "";
//		if("DEFAULT".equalsIgnoreCase(dataSetName)) {
//			strPath = "/groups/{groupid}/subgroups";
//			uriParams.put("groupid", strPId);
//		}
//		else 
//			throw new Exception(String.format("无法识别的数据集标识[%1$s]", dataSetName));
//		
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
//		List<PSCorePrdCat> dtoList = new ArrayList<PSCorePrdCat>();
//		for(Object objItem : list) {
//			if(!(objItem instanceof Map)) {
//				continue;
//			}
//			
//			Map item = (Map)objItem;
//			PSCorePrdCat psCorePrdCat = this.getPSCorePrdCat(item);			
//			dtoList.add(psCorePrdCat);
//		}
//
//		return new PageImpl<PSCorePrdCat>(dtoList, f.getPageable(), nTotal);
//	}
	
	protected PSCorePrdCat getPSCorePrdCat(Map item) throws Exception{
		PSCorePrdCat psCorePrdCat = new PSCorePrdCat();
		psCorePrdCat.setId(DataTypeUtils.getStringValue(item.get("id"), null));
		psCorePrdCat.setName(DataTypeUtils.getStringValue(item.get("name"), null));
		psCorePrdCat.setPPSCorePrdCatId(DataTypeUtils.getStringValue(item.get("parent_id"), null));
		psCorePrdCat.setPath(DataTypeUtils.getStringValue(item.get("path"), null));
		psCorePrdCat.setFullName(DataTypeUtils.getStringValue(item.get("full_name"), null));
		psCorePrdCat.setFullPath(DataTypeUtils.getStringValue(item.get("full_path"), null));
		psCorePrdCat.setAvatarUrl(DataTypeUtils.getStringValue(item.get("avatar_url"), null));
		return psCorePrdCat;
	}
	
	
	protected PSCorePrdCat getPSCorePrdCatV2(Map item) throws Exception{
		PSCorePrdCat psCorePrdCat = new PSCorePrdCat();
		psCorePrdCat.setId(DataTypeUtils.getStringValue(item.get("key"), null));
		psCorePrdCat.setName(DataTypeUtils.getStringValue(item.get("name"), null));
		psCorePrdCat.setMemo(DataTypeUtils.getStringValue(item.get("description"), null));
		
		String strKey = psCorePrdCat.getId();
		int nPos = strKey.lastIndexOf("/");
		if(nPos > 0) {
			psCorePrdCat.setPPSCorePrdCatId(strKey.substring(0, nPos));
		}
		
//		psCorePrdCat.setPath(DataTypeUtils.getStringValue(item.get("path"), null));
//		psCorePrdCat.setFullName(DataTypeUtils.getStringValue(item.get("full_name"), null));
//		psCorePrdCat.setFullPath(DataTypeUtils.getStringValue(item.get("full_path"), null));
//		psCorePrdCat.setAvatarUrl(DataTypeUtils.getStringValue(item.get("avatar_url"), null));
		return psCorePrdCat;
	}
}
