package net.ibizsys.central.plugin.extension.psmodel.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jgit.api.CloneCommand;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.PullCommand;
import org.eclipse.jgit.internal.storage.file.FileRepository;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;
import org.springframework.data.domain.Page;
import org.springframework.util.DigestUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.yaml.snakeyaml.Yaml;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.spring.configuration.NacosServiceHubSettingBase;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.sysutil.ISysExtensionUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.V2DeploySystem;
import net.ibizsys.central.cloud.core.util.domain.V2System;
import net.ibizsys.central.cloud.core.util.domain.V2SystemMerge;
import net.ibizsys.central.cloud.core.util.domain.V2SystemSource;
import net.ibizsys.central.cloud.core.util.domain.V2SystemType;
import net.ibizsys.central.cloud.core.util.domain.V2SystemVersion;
import net.ibizsys.central.cloud.core.util.domain.V2SystemVersionSource;
import net.ibizsys.central.cloud.core.util.domain.V2SystemVersionState;
import net.ibizsys.central.cloud.core.util.domain.V2SystemVersionType;
import net.ibizsys.central.plugin.extension.psmodel.merger.ExtensionPSModelMergeContext;
import net.ibizsys.central.plugin.extension.psmodel.util.IExtensionPSModelRTServiceSession;
import net.ibizsys.central.service.client.IWebClientRep;
import net.ibizsys.central.service.client.WebClientBase;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.model.IPSSystem;
import net.ibizsys.model.PSModelEnums.DevSysType;
import net.ibizsys.model.PSModelServiceImpl;
import net.ibizsys.model.PSSystemImpl;
import net.ibizsys.model.system.PSSysRefImpl;
import net.ibizsys.model.util.PSModelMergeUtils;
import net.ibizsys.model.util.merger.PSModelListMergerBase;
import net.ibizsys.psmodel.core.domain.PSCorePrdVer;
import net.ibizsys.psmodel.core.filter.PSCorePrdVerFilter;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.runtime.sysutil.ISysFileUtilRuntime;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.ZipUtils;

public class PSCorePrdVerRTService extends net.ibizsys.psmodel.runtime.service.PSCorePrdVerRTService {

	private static final Log log = LogFactory.getLog(PSCorePrdVerRTService.class);

	/**
	 * 行为：建立产品版本
	 */
	final public static String METHOD_CREATEMERGEVERSION = "CREATEMERGEVERSION";
	
	
	/**
	 * 行为：构建版本
	 */
	final public static String METHOD_BUILD = "BUILD";
	
	
	 /**
   	 * 行为：应用当前版本
   	 */
   	final public static String METHOD_APPLY = "APPLY";
   	
	
	//final public static String OSSCAT_V2SYSTEMSOURCE = "V2SYSTEMSOURCE";
	


	@Override
	protected Object doInvoke(String methodName, String key, Object params) throws Exception {
		if (METHOD_CREATEMERGEVERSION.equalsIgnoreCase(methodName)) {
			PSCorePrdVer domain = this.getDomain(params);
			return this.createMergeVersion(domain);
		}
		
		if (METHOD_BUILD.equalsIgnoreCase(methodName)) {
			PSCorePrdVer domain = this.getDomain(params);
			return this.build(domain);
		}
		
		if(METHOD_APPLY.equalsIgnoreCase(methodName)) {
   			PSCorePrdVer domain = this.getDomain(params);
   			return this.apply(domain);
   		}
   		

		return super.doInvoke(methodName, key, params);
	}

	@Override
	protected PSCorePrdVer doGet(String key, boolean tryMode) throws Exception {
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();

		String[] items = key.split("[.]");
		if (items.length != 3) {
			throw new Exception("传入键值无效");
		}

		if ("FUNC".equalsIgnoreCase(items[0])) {
			PSCorePrdFuncRTService psCorePrdFuncRTService = (PSCorePrdFuncRTService) this.getPSModelRTServiceSession().getPSModelService(PSModels.PSCOREPRDFUNC);
			V2System v2System = psCorePrdFuncRTService.getV2SystemIf(items[1]);
			V2SystemVersion v2SystemVersion = iExtensionPSModelRTServiceSession.getCloudExtensionClient().getSystemVersion(v2System.getId(), items[2]);
			PSCorePrdVer psCorePrdVer = this.fillPSCorePrdVer(null, v2SystemVersion);
			psCorePrdVer.setVerType(v2SystemVersion.getType());
			psCorePrdVer.setPSCorePrdFuncId(items[1]);
			psCorePrdVer.setId(String.format("%1$s.%2$s.%3$s", "FUNC", psCorePrdVer.getPSCorePrdFuncId(), v2SystemVersion.getId()));
			return psCorePrdVer;
		}

		if ("PRD".equalsIgnoreCase(items[0])) {
			//判断传入标识是否为系统标识
			String strSystemId = null;
			try {
				Integer.parseInt(items[1]);
			}
			catch (Throwable ex) {
				strSystemId = items[1];
				strSystemId = strSystemId.toLowerCase();
			}
			V2System v2System = null;
			if(StringUtils.hasLength(strSystemId)) {
				v2System = iExtensionPSModelRTServiceSession.getCloudExtensionClient().getSystem(strSystemId);
			}
			else {
				PSCorePrdRTService psCorePrdRTService = (PSCorePrdRTService) this.getPSModelRTServiceSession().getPSModelService(PSModels.PSCOREPRD);
				v2System = psCorePrdRTService.getV2SystemIf(items[1]);
			}
			V2SystemVersion v2SystemVersion = iExtensionPSModelRTServiceSession.getCloudExtensionClient().getSystemVersion(v2System.getId(), items[2]);
			PSCorePrdVer psCorePrdVer = this.fillPSCorePrdVer(null, v2SystemVersion);
			psCorePrdVer.setVerType(v2SystemVersion.getType());
			psCorePrdVer.setPSCorePrdId(items[1]);
			psCorePrdVer.setId(String.format("%1$s.%2$s.%3$s", "PRD", psCorePrdVer.getPSCorePrdId(), v2SystemVersion.getId()));
			
			
			return psCorePrdVer;
		}

		throw new Exception("传入键值无效");
	}

	@Override
	protected List<PSCorePrdVer> getDomainList(String strDataSetName, PSCorePrdVerFilter f) throws Exception {
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
		List<PSCorePrdVer> psCorePrdVerList = new ArrayList<PSCorePrdVer>();
		Object objPSCorePrdFuncId = f.getFieldCond(PSCorePrdVer.FIELD_PSCOREPRDFUNCID, IPSModelFilter.EQ);
		if (!ObjectUtils.isEmpty(objPSCorePrdFuncId)) {
			// 查询指定产品功能的版本信息
			PSCorePrdFuncRTService psCorePrdFuncRTService = (PSCorePrdFuncRTService) this.getPSModelRTServiceSession().getPSModelService(PSModels.PSCOREPRDFUNC);
			V2System v2System = psCorePrdFuncRTService.getV2SystemIf(objPSCorePrdFuncId.toString());
			List<V2SystemVersion> v2SystemVersionList = this.getV2SystemVersionList(v2System, true);
			if (!ObjectUtils.isEmpty(v2SystemVersionList)) {
				for (V2SystemVersion v2SystemVersion : v2SystemVersionList) {
					PSCorePrdVer psCorePrdVer = fillPSCorePrdVer(null, v2SystemVersion);
					psCorePrdVer.setVerType(v2SystemVersion.getType());
					psCorePrdVer.setPSCorePrdFuncId(objPSCorePrdFuncId.toString());
					psCorePrdVer.setId(String.format("%1$s.%2$s.%3$s", "FUNC", psCorePrdVer.getPSCorePrdFuncId(), v2SystemVersion.getId()));
					psCorePrdVerList.add(psCorePrdVer);
				}
			}
			return this.filterDomainList(psCorePrdVerList, strDataSetName, f);
		}

		Object objPSCorePrdId = f.getFieldCond(PSCorePrdVer.FIELD_PSCOREPRDID, IPSModelFilter.EQ);
		if (!ObjectUtils.isEmpty(objPSCorePrdId)) {
			
			//判断传入标识是否为系统标识
			String strSystemId = null;
			try {
				Integer.parseInt((String)objPSCorePrdId);
			}
			catch (Throwable ex) {
				strSystemId = (String)objPSCorePrdId;
				strSystemId = strSystemId.toLowerCase();
			}
			V2System v2System = null;
			if(StringUtils.hasLength(strSystemId)) {
				v2System = iExtensionPSModelRTServiceSession.getCloudExtensionClient().getSystem(strSystemId);
			}
			else {
				PSCorePrdRTService psCorePrdRTService = (PSCorePrdRTService) this.getPSModelRTServiceSession().getPSModelService(PSModels.PSCOREPRD);
				v2System = psCorePrdRTService.getV2SystemIf(objPSCorePrdId.toString());
			}
			
			// 查询指定产品的版本信息
			List<V2SystemVersion> v2SystemVersionList = this.getV2SystemVersionList(v2System, true);
			if (!ObjectUtils.isEmpty(v2SystemVersionList)) {
				for (V2SystemVersion v2SystemVersion : v2SystemVersionList) {
					PSCorePrdVer psCorePrdVer = fillPSCorePrdVer(null, v2SystemVersion);
					psCorePrdVer.setPSCorePrdId(objPSCorePrdId.toString());
					psCorePrdVer.setVerType(v2SystemVersion.getType());
					if(StringUtils.hasLength(strSystemId)) {
						psCorePrdVer.setId(String.format("%1$s.%2$s.%3$s", "PRD", strSystemId, v2SystemVersion.getId()));
					}
					else {
						psCorePrdVer.setId(String.format("%1$s.%2$s.%3$s", "PRD", psCorePrdVer.getPSCorePrdId(), v2SystemVersion.getId()));
					}
					
					psCorePrdVerList.add(psCorePrdVer);
				}
			}
			return this.filterDomainList(psCorePrdVerList, strDataSetName, f);
		}

		return this.filterDomainList(psCorePrdVerList, strDataSetName, f);
	}

	protected PSCorePrdVer fillPSCorePrdVer(PSCorePrdVer psCorePrdVer, V2SystemVersion v2SystemVersion) {
		if (psCorePrdVer == null) {
			psCorePrdVer = new PSCorePrdVer();
		}

		psCorePrdVer.setName(v2SystemVersion.getName());
		psCorePrdVer.setPubState(v2SystemVersion.getState());
		psCorePrdVer.setDefaultFlag(v2SystemVersion.getDefaultFlag());
		
		if(V2SystemVersionType.MERGE.value.equals(v2SystemVersion.getType())) {
			if(!ObjectUtils.isEmpty(v2SystemVersion.getSources())) {
				StringBuilder sb = new StringBuilder();
				sb.append(String.format("模块信息："));
				
				for(V2SystemVersionSource v2SystemVersionSource : v2SystemVersion.getSources()) {
					sb.append(String.format("\r\n%1$s [%2$s]", v2SystemVersionSource.getMergeSystemName(), v2SystemVersionSource.getSystemSourceName()));
				}
				psCorePrdVer.setMemo(sb.toString());
			}
		}
		
		// psCorePrdVer.setver
		// psCorePrdVer.

		return psCorePrdVer;
	}

	protected List<V2SystemVersion> getV2SystemVersionList(V2System v2System, boolean bRebuild) throws Exception {

		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();

		List<V2SystemVersion> v2SystemVersionList = new ArrayList<V2SystemVersion>();

		Map<String, V2SystemVersion> v2SystemVersionMap = new HashMap<String, V2SystemVersion>();
		if (true) {
			SearchContextDTO searchContextDTO = new SearchContextDTO();
			searchContextDTO.all();
			// searchContextDTO.eq(V2SystemVersion.FIELD_TYPE, "CORE");
			Page<V2SystemVersion> v2SystemVersionPage = iExtensionPSModelRTServiceSession.getCloudExtensionClient().fetchSystemVersions(v2System.getId(), searchContextDTO);
			if (!ObjectUtils.isEmpty(v2SystemVersionPage) && !ObjectUtils.isEmpty(v2SystemVersionPage.getContent())) {
				v2SystemVersionList.addAll(v2SystemVersionPage.getContent());
				for (V2SystemVersion v2SystemVersion : v2SystemVersionPage.getContent()) {
					if (V2SystemVersionType.CORE.value.equals(v2SystemVersion.getType())) {
						v2SystemVersionMap.put(v2SystemVersion.getName().toLowerCase(), v2SystemVersion);
					}
				}
			}
		}

		Map<String, V2SystemSource> v2SystemSourceMap = new HashMap<String, V2SystemSource>();
		if (bRebuild) {
			SearchContextDTO searchContextDTO = new SearchContextDTO();
			searchContextDTO.all();
			Page<V2SystemSource> v2SystemSourcePage = iExtensionPSModelRTServiceSession.getCloudExtensionClient().fetchSystemSources(v2System.getId(), searchContextDTO);
			if (!ObjectUtils.isEmpty(v2SystemSourcePage) && !ObjectUtils.isEmpty(v2SystemSourcePage.getContent())) {
				for (V2SystemSource v2SystemSource : v2SystemSourcePage.getContent()) {
					v2SystemSourceMap.put(v2SystemSource.getName().toLowerCase(), v2SystemSource);
				}
			}

			Map<String, Object> queryParams = new LinkedHashMap<String, Object>();
			Map<String, Object> uriParams = new LinkedHashMap<String, Object>();

			String strPath = "";
			strPath = "/projects/{projectid}/repository/branches";
			uriParams.put("projectid", v2System.getProductId());

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
				String strName = DataTypeUtils.getStringValue(item.get("name"), null);
				if (!StringUtils.hasLength(strName)) {
					continue;
				}

				V2SystemSource v2SystemSource = v2SystemSourceMap.get(strName.toLowerCase());
				if (v2SystemSource == null) {
					v2SystemSource = new V2SystemSource();
					v2SystemSource.setName(strName.toLowerCase());
					v2SystemSource = iExtensionPSModelRTServiceSession.getCloudExtensionClient().createSystemSource(v2System.getId(), v2SystemSource);
					v2SystemSourceMap.put(strName.toLowerCase(), v2SystemSource);
				}

			}

			// 构建版本
			for (V2SystemSource v2SystemSource : v2SystemSourceMap.values()) {

				V2SystemVersion v2SystemVersion = v2SystemVersionMap.get(v2SystemSource.getName());
				if (v2SystemVersion == null) {
					v2SystemVersion = new V2SystemVersion();
					v2SystemVersion.setType(V2SystemVersionType.CORE.value);
					v2SystemVersion.setName(v2SystemSource.getName());
					v2SystemVersion.setSystemSourceId(v2SystemSource.getId());
					v2SystemVersion = iExtensionPSModelRTServiceSession.getCloudExtensionClient().createSystemVersion(v2System.getId(), v2SystemVersion);
					v2SystemVersionMap.put(v2SystemSource.getName(), v2SystemVersion);

					v2SystemVersionList.add(v2SystemVersion);
				}
			}
		}

		return v2SystemVersionList;

	}

	public Object createMergeVersion(PSCorePrdVer m) throws Exception {
		return this.doCreateMergeVersion(m);
	}
	
	protected Object doCreateMergeVersion(PSCorePrdVer m) throws Exception {
		return this.doCreateMergeVersion(m, null);
	}

	protected Object doCreateMergeVersion(PSCorePrdVer psCorePrdVer, V2System v2System) throws Exception {

		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();

		String[] items = psCorePrdVer.getId().split("[.]");
		if (items.length != 3) {
			throw new Exception("传入键值无效");
		}

		if (v2System == null) {
			if ("FUNC".equalsIgnoreCase(items[0])) {
				PSCorePrdFuncRTService psCorePrdFuncRTService = (PSCorePrdFuncRTService) this.getPSModelRTServiceSession().getPSModelService(PSModels.PSCOREPRDFUNC);
				v2System = psCorePrdFuncRTService.getV2SystemIf(items[1]);
			} else if ("PRD".equalsIgnoreCase(items[0])) {
				//判断传入标识是否为系统标识
				String strSystemId = null;
				try {
					Integer.parseInt(items[1]);
				}
				catch (Throwable ex) {
					strSystemId = items[1];
					strSystemId = strSystemId.toLowerCase();
				}
				if(StringUtils.hasLength(strSystemId)) {
					v2System = iExtensionPSModelRTServiceSession.getCloudExtensionClient().getSystem(strSystemId);
				}
				else {
					PSCorePrdRTService psCorePrdRTService = (PSCorePrdRTService) this.getPSModelRTServiceSession().getPSModelService(PSModels.PSCOREPRD);
					v2System = psCorePrdRTService.getV2SystemIf(items[1]);
				}
			} else {
				throw new Exception("传入键值无效");
			}
		}

		Map<String, V2SystemMerge> v2SystemMergeMap = new LinkedHashMap<String, V2SystemMerge>();
		if (true) {
			SearchContextDTO searchContextDTO = new SearchContextDTO();
			searchContextDTO.eq(V2SystemMerge.FIELD_VALID_FLAG, 1);
			searchContextDTO.sort(V2SystemMerge.FIELD_ORDER_VALUE);
			searchContextDTO.all();
			Page<V2SystemMerge> v2SystemMergePage = iExtensionPSModelRTServiceSession.getCloudExtensionClient().fetchSystemMerges(v2System.getId(), searchContextDTO);
			if (!ObjectUtils.isEmpty(v2SystemMergePage) && !ObjectUtils.isEmpty(v2SystemMergePage.getContent())) {
				for (V2SystemMerge v2SystemMerge : v2SystemMergePage.getContent()) {
					v2SystemMergeMap.put(v2SystemMerge.getMergeSystemId(), v2SystemMerge);
				}
			}
		}

		List<V2SystemVersionSource> sourceList = new ArrayList<V2SystemVersionSource>();
		for (V2SystemMerge v2SystemMerge : v2SystemMergeMap.values()) {

			String strSystemSourceId = v2SystemMerge.getMergeSystemSourceId();
			if (!StringUtils.hasLength(strSystemSourceId)) {

				SearchContextDTO searchContextDTO = new SearchContextDTO();
				searchContextDTO.eq(V2SystemVersion.FIELD_TYPE, V2SystemType.CORE.value);
				searchContextDTO.all();
				
				V2System mergeV2System = iExtensionPSModelRTServiceSession.getCloudExtensionClient().getSystem(v2SystemMerge.getMergeSystemId());
				
				List<V2SystemVersion> v2SystemVersionList = getV2SystemVersionList(mergeV2System, true);
				if (!ObjectUtils.isEmpty(v2SystemVersionList)) {
					for (V2SystemVersion v2SystemVersion : v2SystemVersionList) {
						if (DataTypeUtils.getBooleanValue(v2SystemVersion.getDefaultFlag(), false)) {
							if (!ObjectUtils.isEmpty(v2SystemVersion.getSources())) {
								strSystemSourceId = v2SystemVersion.getSources().get(0).getSystemSourceId();
								break;
							}
						}
					}
					if (!StringUtils.hasLength(strSystemSourceId)) {
						for (V2SystemVersion v2SystemVersion : v2SystemVersionList) {
							strSystemSourceId = v2SystemVersion.getSystemSourceId();
							break;
						}
					}
				}
			}

			if (!StringUtils.hasLength(strSystemSourceId)) {
				throw new Exception(String.format("未获取功能系统[%1$s]源系统", v2SystemMerge.getId()));
			}

			V2SystemVersionSource v2SystemVersionSource = new V2SystemVersionSource();
			v2SystemVersionSource.setSystemSourceId(strSystemSourceId);
			sourceList.add(v2SystemVersionSource);
		}

		V2SystemVersion v2SystemVersion = iExtensionPSModelRTServiceSession.getCloudExtensionClient().getSystemVersion(v2System.getId(), items[2]);

		V2SystemVersion mergeV2SystemVersion = new V2SystemVersion();
		mergeV2SystemVersion.setType(V2SystemVersionType.MERGE.value);
		mergeV2SystemVersion.setSystemSourceId(v2SystemVersion.getSystemSourceId());
		mergeV2SystemVersion.setName(String.format("%2$s_%1$tY%1$tm%1$td%1$tH%1$tM%1$tS", new java.util.Date(), v2SystemVersion.getName()));
		mergeV2SystemVersion.setSources(sourceList);
		mergeV2SystemVersion = iExtensionPSModelRTServiceSession.getCloudExtensionClient().createSystemVersion(v2System.getId(), mergeV2SystemVersion);

		return mergeV2SystemVersion;

	}
	
	public Object build(PSCorePrdVer m) throws Exception {
		return this.doBuild(m);
	}
	
	protected Object doBuild(PSCorePrdVer m) throws Exception {
		return this.doBuild(m, null);
	}

	protected Object doBuild(PSCorePrdVer psCorePrdVer, V2System v2System) throws Exception {
		
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
		ISysFileUtilRuntime iSysFileUtilRuntime = iExtensionPSModelRTServiceSession.getSystemRuntime().getSysFileUtilRuntime(false);
		
		String[] items = psCorePrdVer.getId().split("[.]");
		if (items.length != 3) {
			throw new Exception("传入键值无效");
		}

		if (v2System == null) {
			if ("FUNC".equalsIgnoreCase(items[0])) {
				PSCorePrdFuncRTService psCorePrdFuncRTService = (PSCorePrdFuncRTService) this.getPSModelRTServiceSession().getPSModelService(PSModels.PSCOREPRDFUNC);
				v2System = psCorePrdFuncRTService.getV2SystemIf(items[1]);
			} else if ("PRD".equalsIgnoreCase(items[0])) {
				String strSystemId = null;
				try {
					Integer.parseInt(items[1]);
				}
				catch (Throwable ex) {
					strSystemId = items[1];
					strSystemId = strSystemId.toLowerCase();
				}
				if(StringUtils.hasLength(strSystemId)) {
					v2System = iExtensionPSModelRTServiceSession.getCloudExtensionClient().getSystem(strSystemId);
				}
				else {
					PSCorePrdRTService psCorePrdRTService = (PSCorePrdRTService) this.getPSModelRTServiceSession().getPSModelService(PSModels.PSCOREPRD);
					v2System = psCorePrdRTService.getV2SystemIf(items[1]);
				}
			} else {
				throw new Exception("传入键值无效");
			}
		}
		
		V2SystemVersion v2SystemVersion = iExtensionPSModelRTServiceSession.getCloudExtensionClient().getSystemVersion(v2System.getId(), items[2]);
		
		File majorFile = null;
		V2SystemSource majorV2SystemSource = null;
		if(StringUtils.hasLength(v2SystemVersion.getSystemSourceId())) {
			majorV2SystemSource = iExtensionPSModelRTServiceSession.getCloudExtensionClient().getSystemSource(v2System.getId(), v2SystemVersion.getSystemSourceId());
			majorFile = this.getV2SystemSource(v2System, v2System, majorV2SystemSource);
			if(majorFile == null) {
				throw new Exception(String.format("系统[%1$s]未提供源", v2System.getName()));
			}
		}
		
		Map<V2SystemSource, File> v2SystemFileMap = new LinkedHashMap<V2SystemSource, File>();
		List<V2SystemVersionSource> list = v2SystemVersion.getSources();
		if(!ObjectUtils.isEmpty(list)) {
			for(V2SystemVersionSource v2SystemVersionSource : list) {
				V2SystemSource v2SystemSource = iExtensionPSModelRTServiceSession.getCloudExtensionClient().getSystemSource(v2SystemVersionSource.getMergeSystemId(), v2SystemVersionSource.getSystemSourceId());
				V2System mergeV2system = iExtensionPSModelRTServiceSession.getCloudExtensionClient().getSystem(v2SystemVersionSource.getMergeSystemId());
				File file = this.getV2SystemSource(v2System, mergeV2system, v2SystemSource);
				if(file != null) {
					v2SystemFileMap.put(v2SystemSource, file);
				}
				else {
					log.warn(String.format("系统[%1$s]未提供源", mergeV2system.getName()));
				}
			}
		}
		
		majorFile = doMergeSystem(psCorePrdVer, v2System, majorV2SystemSource, majorFile, v2SystemFileMap);
		
		// 建立模型压缩文件
		File zipTempFile = File.createTempFile("model_" + v2System.getId(), ".zip");
		ZipUtils.zip(majorFile, zipTempFile);
		String strFileHashCode = "";
		try (FileInputStream fis = new FileInputStream(zipTempFile)) {
			strFileHashCode = DigestUtils.md5DigestAsHex(fis);
		}
		
		
		String strMD5Code = v2SystemVersion.getDigest();
		String strOSSFileId = v2SystemVersion.getOssFile();
		int nVersion = DataTypeUtils.getIntegerValue(v2SystemVersion.getVersion(), 1);
		if (!StringUtils.hasLength(strMD5Code)
				|| !StringUtils.hasLength(strOSSFileId)
				|| !strMD5Code.equals(strFileHashCode)) {
			//上传更新
			String strOSSCat =  ISysExtensionUtilRuntime.OSSCAT_DYNAMODEL;
			net.ibizsys.runtime.util.domain.File ossFile = iSysFileUtilRuntime.createOSSFile(zipTempFile, strOSSCat);
			V2SystemVersion v2SystemVersion2 = new V2SystemVersion();
			v2SystemVersion2.setOssFile(ossFile.getOSSId());
			v2SystemVersion2.setDigest(strFileHashCode);
			v2SystemVersion2.setVersion(nVersion+1);
			v2SystemVersion2.setState(V2SystemVersionState.BUILDED.value);
			v2SystemVersion2 = iExtensionPSModelRTServiceSession.getCloudExtensionClient().updateSystemVersion(v2SystemVersion.getSystemId(), v2SystemVersion.getId(), v2SystemVersion2);
		
			strMD5Code = v2SystemVersion2.getDigest();
			strOSSFileId = v2SystemVersion2.getOssFile();
			nVersion = v2SystemVersion2.getVersion();
		}
					
		return null;
	}
	
	protected File doMergeSystem(PSCorePrdVer psCorePrdVer, V2System v2System, V2SystemSource v2SystemSource, File majorFile, Map<V2SystemSource, File> v2SystemFileMap) throws Exception {
		
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
		ISysFileUtilRuntime iSysFileUtilRuntime = iExtensionPSModelRTServiceSession.getSystemRuntime().getSysFileUtilRuntime(false);
		File tempFile = File.createTempFile("model.", "");
		String strPSModelFolderPath = majorFile.getCanonicalPath();
		
		
		List<ObjectNode> objectNodeList = new ArrayList<ObjectNode>();
		
		for(java.util.Map.Entry<V2SystemSource, File> entry : v2SystemFileMap.entrySet()) {
			//进行合并
			// 建立模型压缩文件
			File zipTempFile = File.createTempFile("model_" + entry.getKey().getId(), ".zip");
			ZipUtils.zip(entry.getValue(), zipTempFile);
			String strFileHashCode = "";
			try (FileInputStream fis = new FileInputStream(zipTempFile)) {
				strFileHashCode = DigestUtils.md5DigestAsHex(fis);
			}
			
			
			String strMD5Code = entry.getKey().getDigest();
			String strOSSFileId = entry.getKey().getOssFile();
			int nVersion = DataTypeUtils.getIntegerValue(entry.getKey().getVersion(), 1);
			if (!StringUtils.hasLength(strMD5Code)
					|| !StringUtils.hasLength(strOSSFileId)
					|| !strMD5Code.equals(strFileHashCode)) {
				//上传更新
				String strOSSCat = ISysExtensionUtilRuntime.OSSCAT_DYNAMODEL;
				net.ibizsys.runtime.util.domain.File ossFile = iSysFileUtilRuntime.createOSSFile(zipTempFile, strOSSCat);
				V2SystemSource v2SystemSource2 = new V2SystemSource();
				v2SystemSource2.setOssFile(ossFile.getOSSId());
				v2SystemSource2.setDigest(strFileHashCode);
				v2SystemSource2.setVersion(nVersion+1);
				v2SystemSource2 = iExtensionPSModelRTServiceSession.getCloudExtensionClient().updateSystemSource(entry.getKey().getSystemId(), entry.getKey().getId(), v2SystemSource2);
			
				strMD5Code = v2SystemSource2.getDigest();
				strOSSFileId = v2SystemSource2.getOssFile();
				nVersion = v2SystemSource2.getVersion();
			}

			//建立临时目录
			File folder = new File(tempFile.getCanonicalPath() + "." + entry.getKey().getId());
			folder.mkdirs();
			
			PSModelServiceImpl psModelServiceImpl = new PSModelServiceImpl();
			psModelServiceImpl.setPSModelFolderPath(entry.getValue().getCanonicalPath(), false);
			IPSSystem iPSSystem = psModelServiceImpl.getPSSystem();
			
			String strSysType = iPSSystem.getSysType();
			if(!StringUtils.hasLength(strSysType)) {
				strSysType = DevSysType.DEVSYS.value;
			}
			
			//仅合并类型DEVSYS
			if(DevSysType.DEVSYS.value.equals(strSysType)) {
				ExtensionPSModelMergeContext psModelMergeContext = new ExtensionPSModelMergeContext();
				psModelMergeContext.setPSModelFolderPath(strPSModelFolderPath);
				psModelMergeContext.setMergePSModelFolderPath(entry.getValue().getCanonicalPath());
				psModelMergeContext.setDstPSModelFolderPath(folder.getCanonicalPath());
				
				PSModelMergeUtils.merge(psModelMergeContext);
				strPSModelFolderPath = folder.getCanonicalPath();
			}
			
			
			//写入子系统信息
			ObjectNode objectNode = JsonUtils.createObjectNode();
			objectNode.put(PSSysRefImpl.ATTR_GETSYSREFTYPE, String.format("EXTENSION_%1$s", strSysType));
			objectNode.put(PSSysRefImpl.ATTR_GETNAME, iPSSystem.getLogicName());
			objectNode.put(PSSysRefImpl.ATTR_GETID, entry.getKey().getId());
			objectNode.put(PSSysRefImpl.ATTR_GETSYSREFTAG, entry.getKey().getSystemId());
			objectNode.put(PSSysRefImpl.ATTR_GETREFPARAM, strOSSFileId);
			objectNode.put(PSSysRefImpl.ATTR_GETREFPARAM2, strMD5Code);
			
			objectNodeList.add(objectNode);
			
		}
		
		//根据系统类型，附加子系统引用
		if(!ObjectUtils.isEmpty(objectNodeList)) {
			File modelFile = new File(strPSModelFolderPath + File.separator + "PSSYSTEM.json");
			ObjectNode objectNode = (ObjectNode) PSModelListMergerBase.MAPPER.readTree(modelFile);
			JsonNode jsonNode = objectNode.get(PSSystemImpl.ATTR_GETALLPSSYSREFS);
			ArrayNode arrayNode = null;
			if(jsonNode != null) {
				arrayNode = (ArrayNode)jsonNode;
			}
			else {
				arrayNode = objectNode.putArray(PSSystemImpl.ATTR_GETALLPSSYSREFS);
			}
			for(ObjectNode node : objectNodeList) {
				arrayNode.add(node);
			}
			
			try (FileOutputStream os = new FileOutputStream(modelFile)) {
				PSModelListMergerBase.MAPPER.writerWithDefaultPrettyPrinter().writeValue(os, objectNode);
			}
		}	
		
		if(!majorFile.getCanonicalPath().equals(strPSModelFolderPath)) {
			//拷贝应用
			FileUtils.copyDirectory(new File(majorFile.getCanonicalPath()+File.separator+"PSSYSAPPS"), new File(strPSModelFolderPath+File.separator+"PSSYSAPPS"));
			PSModelMergeUtils.verify(strPSModelFolderPath);
		}
		return new File(strPSModelFolderPath);
	}
	
	
	
	protected File getV2SystemSource(V2System v2System, V2System mergeV2System, V2SystemSource mergeV2SystemSource) throws Exception {
		
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
		
		//判断系统是否有定义仓库地址
		
		
		String strSystemPath = v2System.getName();
		String strMergeSystemPath = mergeV2System.getName();
		if(StringUtils.hasLength(v2System.getHttpUrlToRepo())) {
			String[] items = v2System.getHttpUrlToRepo().split("[/]");
			strSystemPath = items[items.length-1].replace(".git", "");
		}
		
		if(StringUtils.hasLength(mergeV2System.getHttpUrlToRepo())) {
			String[] items = mergeV2System.getHttpUrlToRepo().split("[/]");
			strMergeSystemPath = items[items.length-1].replace(".git", "");
		}
		
		
		String strFilePath = String.format("%1$s%2$s%3$s%2$s%4$s_%7$s%2$s%5$s_%8$s%2$s%6$s"
				, ServiceHub.getInstance().getServiceHubSetting().getSystemModelFolder() 
				, File.separator 
				, "systemsources"
				, strSystemPath
				, strMergeSystemPath 
				, mergeV2SystemSource.getName()
				, v2System.getId()
				, mergeV2System.getId());
		
		File file = new File(strFilePath);
		
		String strPath = file.getCanonicalPath();
		String strGitPath = mergeV2System.getHttpUrlToRepo();
		String strBranch = mergeV2SystemSource.getName();
		if (!StringUtils.hasLength(strBranch)) {
			strBranch = "master";
		}
		String strGitUserName = null;
		String strGitPassword = null;
	
		if (file.exists()) {
			try (FileRepository fr = new FileRepository(new File(String.format("%1$s%2$s.git", strPath, File.separator))); Git git = new Git(fr)) {
				PullCommand pullCommand = git.pull().setRemoteBranchName(strBranch);
				if (StringUtils.hasLength(strGitUserName)) {
					if (StringUtils.hasLength(strGitPassword)) {
						pullCommand.setCredentialsProvider(new UsernamePasswordCredentialsProvider(strGitUserName, strGitPassword));
					} else {
						pullCommand.setCredentialsProvider(new UsernamePasswordCredentialsProvider(strGitUserName, ""));
					}
				}
				pullCommand.call();
			}

		} else {
			file.mkdirs();
			CloneCommand cloneCommand = Git.cloneRepository().setURI(strGitPath).setDirectory(file).setBranch(strBranch);
			if (StringUtils.hasLength(strGitUserName)) {
				if (StringUtils.hasLength(strGitPassword)) {
					cloneCommand.setCredentialsProvider(new UsernamePasswordCredentialsProvider(strGitUserName, strGitPassword));
				} else {
					cloneCommand.setCredentialsProvider(new UsernamePasswordCredentialsProvider(strGitUserName, ""));
				}
			}
			cloneCommand.call();
		}
		
		File modelFile = new File(String.format("%1$s%2$sibizmodel.yaml", strPath, File.separator));
		if(modelFile.exists()) {
			//从配置文件中提取目录
			try {
				Yaml yaml = new Yaml();
				Map config = yaml.loadAs(new FileInputStream(modelFile) , Map.class);
				if(config != null) {
					String strModelFolder = (String)config.get("modelfolder");
					if(StringUtils.hasLength(strModelFolder)) {
						return new File(strPath + File.separator + strModelFolder);
					}
				}
			}
			catch (Throwable ex) {
				log.error(String.format("加载系统模型配置发生异常，%1$s", ex.getMessage()), ex);
				throw new Exception(String.format("加载系统模型配置发生异常，%1$s", ex.getMessage()), ex);
			}
		}
		
		return null;
	}
	

   	public Object apply(PSCorePrdVer m) throws Exception {
   		return this.doApply(m);
   	}

   	protected Object doApply(PSCorePrdVer m) throws Exception {
   		
   		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
   		
   		String[] items = m.getId().split("[.]");
		if (items.length != 3) {
			throw new Exception("传入键值无效");
		}
   		
   		
   		ISystemRuntime iSystemRuntime = iExtensionPSModelRTServiceSession.getSystemRuntime();
   		if(!(iSystemRuntime instanceof IServiceSystemRuntime)) {
   			throw new Exception("当前系统类型不正确");
   		}
   		
   		IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime)iSystemRuntime;
   		V2DeploySystem v2DeploySystem = iServiceSystemRuntime.getV2DeploySystem();
   		if(v2DeploySystem == null) {
   			throw new Exception("当前系统未提供部署信息");
   		}

 		if ("FUNC".equalsIgnoreCase(items[0])) {
			throw new Exception("无法应用功能版本");
		}

		if ("PRD".equalsIgnoreCase(items[0])) {
			String strSystemId = null;
			V2System v2System = null;
			try {
				Integer.parseInt(items[1]);
			}
			catch (Throwable ex) {
				strSystemId = items[1];
				strSystemId = strSystemId.toLowerCase();
			}
			if(StringUtils.hasLength(strSystemId)) {
				v2System = iExtensionPSModelRTServiceSession.getCloudExtensionClient().getSystem(strSystemId);
			}
			else {
				PSCorePrdRTService psCorePrdRTService = (PSCorePrdRTService) this.getPSModelRTServiceSession().getPSModelService(PSModels.PSCOREPRD);
				v2System = psCorePrdRTService.getV2SystemIf(items[1]);
			}
			
			V2SystemVersion v2SystemVersion = iExtensionPSModelRTServiceSession.getCloudExtensionClient().getSystemVersion(v2System.getId(), items[2]);
			if(V2SystemVersionState.BUILDED.value != DataTypeUtils.getIntegerValue(v2SystemVersion.getState(), V2SystemVersionState.NOT_BUILD.value)) {
				throw new Exception("产品版本未构建");
			}
			
			if(!v2SystemVersion.getSystemId().equals(v2DeploySystem.getSystemId())) {
				throw new Exception("当前系统使用产品与指定产品版本不一致");
			}
			
			if(!v2SystemVersion.getId().equals(v2DeploySystem.getSystemVersionId())) {
				V2DeploySystem v2DeploySystem2 = new V2DeploySystem();
				v2DeploySystem2.setSystemVersionId(v2SystemVersion.getId());
				v2DeploySystem2 = iExtensionPSModelRTServiceSession.getCloudExtensionClient().updateDeploySystem(v2DeploySystem.getId(), v2DeploySystem2);
				
				//更新
				//写入系统配置版本
				try {
					String strConfigId = String.format("%1$s%2$s-ver", NacosServiceHubSettingBase.DATAID_DEPLOYSYSTEM_PREFIX, v2DeploySystem.getId());
					Map<String, Object> map = new LinkedHashMap<String, Object>();
					map.put("v2modeldigest", v2SystemVersion.getDigest());
					map.put("v2modelossid", v2SystemVersion.getOssFile());
					ServiceHub.getInstance().publishConfig(strConfigId, map);
				}
				catch (Throwable ex) {
					log.error(String.format("更新系统配置版本发生异常，%1$s", ex.getMessage()), ex);
				}
			}
			
			return null;
		}
		
   		
		throw new Exception(String.format("未支持的版本类型"));
   	}
   	
   	@Override
   	protected void onBeforeRemove(PSCorePrdVer m) throws Exception {
   		if(!V2SystemVersionType.MERGE.value.equals(m.getVerType())) {
   			throw new Exception("仅支持删除合并版本");
   		}
   		super.onBeforeRemove(m);
   	}
   	
   	@Override
   	protected void doRemove(PSCorePrdVer m) throws Exception {
   		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();

		String[] items = m.getId().split("[.]");
		if (items.length != 3) {
			throw new Exception("传入键值无效");
		}

		if ("PRD".equalsIgnoreCase(items[0])) {
			String strSystemId = null;
			V2System v2System = null;
			try {
				Integer.parseInt(items[1]);
			}
			catch (Throwable ex) {
				strSystemId = items[1];
				strSystemId = strSystemId.toLowerCase();
			}
			if(StringUtils.hasLength(strSystemId)) {
				v2System = iExtensionPSModelRTServiceSession.getCloudExtensionClient().getSystem(strSystemId);
			}
			else {
				PSCorePrdRTService psCorePrdRTService = (PSCorePrdRTService) this.getPSModelRTServiceSession().getPSModelService(PSModels.PSCOREPRD);
				v2System = psCorePrdRTService.getV2SystemIf(items[1]);
			}
			iExtensionPSModelRTServiceSession.getCloudExtensionClient().removeSystemVersion(v2System.getId(), items[2]);
		}
   	}
   	
   	@Override
   	protected void doUpdate(PSCorePrdVer m) throws Exception {
   		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();

		String[] items = m.getId().split("[.]");
		if (items.length != 3) {
			throw new Exception("传入键值无效");
		}
		
		if ("PRD".equalsIgnoreCase(items[0])) {
			
			String strSystemId = null;
			V2System v2System = null;
			try {
				Integer.parseInt(items[1]);
			}
			catch (Throwable ex) {
				strSystemId = items[1];
				strSystemId = strSystemId.toLowerCase();
			}
			if(StringUtils.hasLength(strSystemId)) {
				v2System = iExtensionPSModelRTServiceSession.getCloudExtensionClient().getSystem(strSystemId);
			}
			else {
				PSCorePrdRTService psCorePrdRTService = (PSCorePrdRTService) this.getPSModelRTServiceSession().getPSModelService(PSModels.PSCOREPRD);
				v2System = psCorePrdRTService.getV2SystemIf(items[1]);
			}
			
			V2SystemVersion v2SystemVersion2 = new V2SystemVersion();
			if(StringUtils.hasLength(m.getName())) {
				v2SystemVersion2.setName(m.getName());
			}
			if(m.isDefaultFlagDirty()) {
				v2SystemVersion2.setDefaultFlag(m.getDefaultFlag());
			}
			
			iExtensionPSModelRTServiceSession.getCloudExtensionClient().updateSystemVersion(v2System.getId(), items[2], v2SystemVersion2);
		}
   	}
}
