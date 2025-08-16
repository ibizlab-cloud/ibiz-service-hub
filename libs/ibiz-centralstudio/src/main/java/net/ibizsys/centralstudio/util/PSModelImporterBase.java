package net.ibizsys.centralstudio.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.domain.Page;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.yaml.snakeyaml.Yaml;

import net.ibizsys.centralstudio.dto.PSCodeListDTO;
import net.ibizsys.centralstudio.dto.PSDEActionDTO;
import net.ibizsys.centralstudio.dto.PSDEDataSetDTO;
import net.ibizsys.centralstudio.dto.PSDEFieldDTO;
import net.ibizsys.centralstudio.dto.PSDEOPPrivDTO;
import net.ibizsys.centralstudio.dto.PSDERDTO;
import net.ibizsys.centralstudio.dto.PSDESADetailDTO;
import net.ibizsys.centralstudio.dto.PSDESARSDTO;
import net.ibizsys.centralstudio.dto.PSDEServiceAPIDTO;
import net.ibizsys.centralstudio.dto.PSDataEntityDTO;
import net.ibizsys.centralstudio.dto.PSModuleDTO;
import net.ibizsys.centralstudio.dto.PSSubSysSADEDTO;
import net.ibizsys.centralstudio.dto.PSSubSysSADEFieldDTO;
import net.ibizsys.centralstudio.dto.PSSubSysSADetailDTO;
import net.ibizsys.centralstudio.dto.PSSubSysServiceAPIDTO;
import net.ibizsys.centralstudio.dto.PSSysDBColumnDTO;
import net.ibizsys.centralstudio.dto.PSSysDBSchemeDTO;
import net.ibizsys.centralstudio.dto.PSSysDBTableDTO;
import net.ibizsys.centralstudio.dto.PSSysModelGroupDTO;
import net.ibizsys.centralstudio.dto.PSSysServiceAPIDTO;
import net.ibizsys.centralstudio.filter.PSCodeListFilter;
import net.ibizsys.centralstudio.filter.PSDEActionFilter;
import net.ibizsys.centralstudio.filter.PSDEDataSetFilter;
import net.ibizsys.centralstudio.filter.PSDEFieldFilter;
import net.ibizsys.centralstudio.filter.PSDEOPPrivFilter;
import net.ibizsys.centralstudio.filter.PSDERFilter;
import net.ibizsys.centralstudio.filter.PSDESADetailFilter;
import net.ibizsys.centralstudio.filter.PSDESARSFilter;
import net.ibizsys.centralstudio.filter.PSDEServiceAPIFilter;
import net.ibizsys.centralstudio.filter.PSDataEntityFilter;
import net.ibizsys.centralstudio.filter.PSModuleFilter;
import net.ibizsys.centralstudio.filter.PSSubSysSADEFieldFilter;
import net.ibizsys.centralstudio.filter.PSSubSysSADEFilter;
import net.ibizsys.centralstudio.filter.PSSubSysSADetailFilter;
import net.ibizsys.centralstudio.filter.PSSubSysServiceAPIFilter;
import net.ibizsys.centralstudio.filter.PSSysDBColumnFilter;
import net.ibizsys.centralstudio.filter.PSSysDBSchemeFilter;
import net.ibizsys.centralstudio.filter.PSSysDBTableFilter;
import net.ibizsys.centralstudio.filter.PSSysModelGroupFilter;
import net.ibizsys.centralstudio.filter.PSSysServiceAPIFilter;
import net.ibizsys.model.IPSSystemService;
import net.ibizsys.model.PSModelEnums.DERType;
import net.ibizsys.model.PSModelServiceImpl;

/**
 * 模型导入应用基类
 * 
 * @author lionlau
 *
 */
public abstract class PSModelImporterBase {

	private static final Log log = LogFactory.getLog(PSModelImporterBase.class);

	final public static int DEFAULTORDERVALUE = 99999;

	private static Random random = new Random();

	/**
	 * 系统参数：模型接口配置
	 */
	public final static String SYSPARAM_PSMODELAPI = "psmodelapi";

	public void run(String... args) throws Exception {

		Map<String, String> argMap = new HashMap<String, String>();
		this.fillArgMap(argMap);

		String strKey = null;

		for (int i = 0; i < args.length; i++) {
			if (StringUtils.hasLength(strKey)) {
				argMap.put(strKey, args[i]);
				strKey = null;
			} else {
				if (argMap.containsKey(args[i])) {
					strKey = args[i];
				} else {
					// 放入内容
					argMap.put("", args[i]);
				}
			}
		}

		// 提取系统参数
		String strSysArg = argMap.get("-s");

		if (!StringUtils.hasLength(strSysArg)) {
			// throw new Exception("未传入系统参数");
			System.out.print("未传入系统参数");
			return;
		}

		strSysArg = new String(java.util.Base64.getDecoder().decode(strSysArg));

		String strParamArg = argMap.get("-p");
		if (!StringUtils.hasLength(strParamArg)) {
			// throw new Exception("未传入导入参数");
			System.out.print("未传入导入参数");
			return;
		}

		strParamArg = new String(java.util.Base64.getDecoder().decode(strParamArg));

		Yaml yaml = new Yaml();
		Map sysMap = yaml.loadAs(strSysArg, Map.class);
		Map paramMap = yaml.loadAs(strParamArg, Map.class);
		
		this.run(sysMap, paramMap, argMap);
	}
	
	
	public void run(Map sysMap, Map paramMap, Map argMap) throws Exception {
		
		Object psmodelapi = sysMap.get(SYSPARAM_PSMODELAPI);
		Map psmodelapiMap = null;
		if (psmodelapi instanceof Map) {
			psmodelapiMap = (Map) psmodelapi;
		}

		if (psmodelapiMap == null && !isEnableNoPSModelAPIMode()) {
			throw new Exception("未指定模型API配置");
		}

		// 进行PSMODELAPI调用
		PSModelServiceSession psModelServiceSession = null;
		if(psmodelapiMap != null) {
			psModelServiceSession = openPSModelServiceSession(psmodelapiMap);
		}
		
		String strPSSysDevBKTaskId = null;
		try {
			// 开启日志
			if(psModelServiceSession != null) {
				strPSSysDevBKTaskId = PSModelServiceUtils.getInstance().beginPSSysDevBKTask(getPSSysDevBKTaskName(paramMap));
				PSModelServiceUtils.getInstance().updateCurrentPSSysDevBKTask("开始执行");
			}

			onRun(sysMap, paramMap, argMap);

			if(psModelServiceSession != null) {
				PSModelServiceUtils.getInstance().finishCurrentPSSysDevBKTask(null);
				PSModelServiceSession.close(true);
			}
			
		} catch (Throwable ex) {

			if(psModelServiceSession != null) {
				if (StringUtils.hasLength(strPSSysDevBKTaskId)) {
					PSModelServiceUtils.getInstance().errorCurrentPSSysDevBKTask(ex.getMessage());
				}
				PSModelServiceSession.close(false);
			}
			
			log.error(ex);
			ex.printStackTrace();
		}
		
	}

	protected PSModelServiceSession openPSModelServiceSession(Map psmodelapiMap) throws Exception {
		return PSModelServiceSession.open(psmodelapiMap);
	}
	
	/**
	 * 是否支持无模型API模式
	 * @return
	 */
	protected boolean isEnableNoPSModelAPIMode() {
		return false;
	}

	protected void onRun(Map sysMap, Map paramMap, Map argMap) throws Throwable{
		throw new Exception("没有实现");
	}

	
	protected String getPSSysDevBKTaskName(Map paramMap) {
		String strName = DataTypeUtils.getStringValue(paramMap.get("name"), null);
		if(StringUtils.hasLength(strName)) {
			return strName;
		}
		return this.onGetPSSysDevBKTaskName(paramMap);
	}
	
	protected String onGetPSSysDevBKTaskName(Map paramMap) {
		return String.format("模型导入任务");
	}

	/**
	 * 更新当前后台任务
	 * 
	 * @param strTaskInfo
	 * @throws Throwable
	 */
	protected void updateCurrentPSSysDevBKTask(String strTaskInfo) {
		PSModelServiceUtils.getInstance().updateCurrentPSSysDevBKTask(strTaskInfo);
	}

	/**
	 * 更新当前后台任务
	 * 
	 * @param nLogLevel
	 * @param strTaskInfo
	 * @throws Throwable
	 */
	protected void updateCurrentPSSysDevBKTask(int nLogLevel, String strTaskInfo) {
		PSModelServiceUtils.getInstance().updateCurrentPSSysDevBKTask(nLogLevel, strTaskInfo);
	}

	protected void fillPSModelDTO(IPSModelDTO iPSModelDTO, boolean bCreate) {

		if (!iPSModelDTO.contains(PSModelDTO.IGNORECHECK)) {
			iPSModelDTO.set(PSModelDTO.IGNORECHECK, 1);
		}

		if (!iPSModelDTO.contains(PSModelDTO.IGNORECHECKKEY)) {
			iPSModelDTO.set(PSModelDTO.IGNORECHECKKEY, 1);
		}
	}

	

	protected IPSSystemService getPSSystemService(String strModelPath) throws Throwable {
		PSModelServiceImpl psModelServiceImpl = new PSModelServiceImpl();
		psModelServiceImpl.setPSModelFolderPath(strModelPath);
		psModelServiceImpl.getPSSystem();
		return psModelServiceImpl;
	}

	protected PSSysModelGroupDTO getPSSysModelGroupDTO(PSSysModelGroupDTO srcPSSysModelGroupDTO) throws Throwable {

		Page<PSSysModelGroupDTO> page = PSModelServiceUtils.getInstance().searchPSSysModelGroups(new PSSysModelGroupFilter());
		if (!ObjectUtils.isEmpty(page.getContent())) {
			for (PSSysModelGroupDTO psSysModelGroupDTO : page.getContent()) {
				if (StringUtils.hasLength(srcPSSysModelGroupDTO.getCodeName())) {
					if (!srcPSSysModelGroupDTO.getCodeName().equalsIgnoreCase(psSysModelGroupDTO.getCodeName())) {
						continue;
					}
				}

				if (StringUtils.hasLength(srcPSSysModelGroupDTO.getPSSysModelGroupName())) {
					if (!srcPSSysModelGroupDTO.getPSSysModelGroupName().equalsIgnoreCase(psSysModelGroupDTO.getPSSysModelGroupName())) {
						continue;
					}
				}

				return psSysModelGroupDTO;
			}
		}
		if (!StringUtils.hasLength(srcPSSysModelGroupDTO.getPSSysModelGroupName())) {
			srcPSSysModelGroupDTO.setPSSysModelGroupName(String.format("模型组%1$s", random.nextInt(999999)));
		}
		PSModelServiceUtils.getInstance().createPSSysModelGroup(srcPSSysModelGroupDTO);
		this.updateCurrentPSSysDevBKTask(LogLevels.INFO, String.format("新建模型组[%1$s][%2$s]", srcPSSysModelGroupDTO.getPSSysModelGroupName(), srcPSSysModelGroupDTO.getCodeName()));

		return srcPSSysModelGroupDTO;
	}

	protected PSModuleDTO getPSModuleDTO(PSModuleDTO srcPSModuleDTO) throws Throwable {

		Page<PSModuleDTO> page = PSModelServiceUtils.getInstance().searchPSModules(new PSModuleFilter());
		if (!ObjectUtils.isEmpty(page.getContent())) {
			for (PSModuleDTO psModuleDTO : page.getContent()) {

				if (StringUtils.hasLength(srcPSModuleDTO.getPSSysModelGroupId())) {
					if (!srcPSModuleDTO.getPSSysModelGroupId().equalsIgnoreCase(psModuleDTO.getPSSysModelGroupId())) {
						continue;
					}
				} else {
					if (StringUtils.hasLength(psModuleDTO.getPSSysModelGroupId())) {
						continue;
					}
				}

				if (StringUtils.hasLength(srcPSModuleDTO.getCodeName())) {
					if (!srcPSModuleDTO.getCodeName().equalsIgnoreCase(psModuleDTO.getCodeName())) {
						continue;
					}
				}
				return psModuleDTO;
			}
		}
		
		if (!StringUtils.hasLength(srcPSModuleDTO.getPSModuleName())) {
			srcPSModuleDTO.setPSModuleName(String.format("模块%1$s", random.nextInt(999999)));
		}

		PSModelServiceUtils.getInstance().createPSModule(srcPSModuleDTO);

		this.updateCurrentPSSysDevBKTask(LogLevels.INFO, String.format("新建模块[%1$s][%2$s]", srcPSModuleDTO.getPSModuleName(), srcPSModuleDTO.getCodeName()));
		return srcPSModuleDTO;
	}

	protected PSSysDBSchemeDTO getPSSysDBSchemeDTO(PSSysDBSchemeDTO srcPSSysDBSchemeDTO) throws Throwable {

		List<PSSysDBSchemeDTO> list = PSModelServiceUtils.getInstance().searchAllPSSysDBSchemes(new PSSysDBSchemeFilter());
		if (!ObjectUtils.isEmpty(list)) {
			for (PSSysDBSchemeDTO psSysDBSchemeDTO : list) {

				if (StringUtils.hasLength(srcPSSysDBSchemeDTO.getPSSysModelGroupId())) {
					if (!srcPSSysDBSchemeDTO.getPSSysModelGroupId().equalsIgnoreCase(psSysDBSchemeDTO.getPSSysModelGroupId())) {
						continue;
					}
				} else {
					if (StringUtils.hasLength(psSysDBSchemeDTO.getPSSysModelGroupId())) {
						continue;
					}
				}

				if (StringUtils.hasLength(srcPSSysDBSchemeDTO.getDSLink())) {
					if (!srcPSSysDBSchemeDTO.getDSLink().equalsIgnoreCase(psSysDBSchemeDTO.getDSLink())) {
						continue;
					}
				}
				return psSysDBSchemeDTO;
			}
		}
		if (!StringUtils.hasLength(srcPSSysDBSchemeDTO.getPSSysDBSchemeName())) {
			srcPSSysDBSchemeDTO.setPSSysDBSchemeName(srcPSSysDBSchemeDTO.getDSLink());
		}

		PSModelServiceUtils.getInstance().createPSSysDBScheme(srcPSSysDBSchemeDTO);

		this.updateCurrentPSSysDevBKTask(LogLevels.INFO, String.format("新建数据库体系[%1$s][%2$s]", srcPSSysDBSchemeDTO.getPSSysDBSchemeName(), srcPSSysDBSchemeDTO.getDSLink()));
		return srcPSSysDBSchemeDTO;
	}

	protected PSSysServiceAPIDTO getPSSysServiceAPIDTO(PSSysServiceAPIDTO srcPSSysServiceAPIDTO) throws Throwable {

		Page<PSSysServiceAPIDTO> page = PSModelServiceUtils.getInstance().searchPSSysServiceAPIs(new PSSysServiceAPIFilter());
		if (!ObjectUtils.isEmpty(page.getContent())) {
			for (PSSysServiceAPIDTO PSSysServiceAPIDTO : page.getContent()) {

				if (StringUtils.hasLength(srcPSSysServiceAPIDTO.getPSModuleId())) {
					if (!srcPSSysServiceAPIDTO.getPSModuleId().equalsIgnoreCase(PSSysServiceAPIDTO.getPSModuleId())) {
						continue;
					}
				} else {
					if (StringUtils.hasLength(PSSysServiceAPIDTO.getPSModuleId())) {
						continue;
					}
				}

				if (StringUtils.hasLength(srcPSSysServiceAPIDTO.getCodeName())) {
					if (!srcPSSysServiceAPIDTO.getCodeName().equalsIgnoreCase(PSSysServiceAPIDTO.getCodeName())) {
						continue;
					}
				}
				return PSSysServiceAPIDTO;
			}
		}
		PSModelServiceUtils.getInstance().createPSSysServiceAPI(srcPSSysServiceAPIDTO);
		return srcPSSysServiceAPIDTO;
	}

	protected PSSubSysServiceAPIDTO getPSSubSysServiceAPIDTO(PSSubSysServiceAPIDTO srcPSSubSysServiceAPIDTO) throws Throwable {

		Page<PSSubSysServiceAPIDTO> page = PSModelServiceUtils.getInstance().searchPSSubSysServiceAPIs(new PSSubSysServiceAPIFilter());
		if (!ObjectUtils.isEmpty(page.getContent())) {
			for (PSSubSysServiceAPIDTO PSSubSysServiceAPIDTO : page.getContent()) {

				if (StringUtils.hasLength(srcPSSubSysServiceAPIDTO.getPSModuleId())) {
					if (!srcPSSubSysServiceAPIDTO.getPSModuleId().equalsIgnoreCase(PSSubSysServiceAPIDTO.getPSModuleId())) {
						continue;
					}
				} else {
					if (StringUtils.hasLength(PSSubSysServiceAPIDTO.getPSModuleId())) {
						continue;
					}
				}

				if (StringUtils.hasLength(srcPSSubSysServiceAPIDTO.getCodeName())) {
					if (!srcPSSubSysServiceAPIDTO.getCodeName().equalsIgnoreCase(PSSubSysServiceAPIDTO.getCodeName())) {
						continue;
					}
				}
				return PSSubSysServiceAPIDTO;
			}
		}
		PSModelServiceUtils.getInstance().createPSSubSysServiceAPI(srcPSSubSysServiceAPIDTO);
		return srcPSSubSysServiceAPIDTO;
	}

	protected PSDataEntityDTO getPSDataEntityDTO(PSDataEntityDTO srcPSDataEntityDTO) throws Throwable {

		PSDataEntityFilter psModelSearchContextDTO = new PSDataEntityFilter();
		psModelSearchContextDTO.eq(PSDataEntityDTO.FIELD_PSMODULEID, srcPSDataEntityDTO.getPSModuleId());
		psModelSearchContextDTO.eq(PSDataEntityDTO.FIELD_PSDATAENTITYNAME, srcPSDataEntityDTO.getPSDataEntityName());
		psModelSearchContextDTO.setCount(false);

		Page<PSDataEntityDTO> page = PSModelServiceUtils.getInstance().searchPSDataEntities(psModelSearchContextDTO);
		if (!ObjectUtils.isEmpty(page.getContent())) {
			for (PSDataEntityDTO psDataEntityDTO : page.getContent()) {

				if (StringUtils.hasLength(srcPSDataEntityDTO.getPSModuleId())) {
					if (!srcPSDataEntityDTO.getPSModuleId().equalsIgnoreCase(psDataEntityDTO.getPSModuleId())) {
						continue;
					}
				} else {
					if (StringUtils.hasLength(psDataEntityDTO.getPSModuleId())) {
						continue;
					}
				}

				if (StringUtils.hasLength(srcPSDataEntityDTO.getCodeName())) {
					if (!srcPSDataEntityDTO.getCodeName().equalsIgnoreCase(psDataEntityDTO.getCodeName())) {
						continue;
					}
				}
				return psDataEntityDTO;
			}
		}
		PSModelServiceUtils.getInstance().createPSDataEntity(srcPSDataEntityDTO);

		this.updateCurrentPSSysDevBKTask(LogLevels.INFO, String.format("新建实体[%1$s][%2$s]", srcPSDataEntityDTO.getPSDataEntityName(), srcPSDataEntityDTO.getCodeName()));

		return srcPSDataEntityDTO;
	}

	protected List<PSDEFieldDTO> getPSDEFieldDTOs(PSDataEntityDTO srcPSDataEntityDTO, List<PSDEFieldDTO> srcPSDEFieldDTOList) throws Throwable {

		PSDEFieldFilter psModelSearchContextDTO = new PSDEFieldFilter();
		psModelSearchContextDTO.eq(PSDEFieldDTO.FIELD_PSDEID, srcPSDataEntityDTO.getPSDataEntityId());
		psModelSearchContextDTO.setCount(false);

		List<PSDEFieldDTO> psDEFieldDTOList = new ArrayList<PSDEFieldDTO>();

		Map<String, PSDEFieldDTO> psDEFieldDTOMap = new HashMap<String, PSDEFieldDTO>();
		Page<PSDEFieldDTO> page = PSModelServiceUtils.getInstance().searchPSDEFields(psModelSearchContextDTO);
		if (!ObjectUtils.isEmpty(page.getContent())) {
			for (PSDEFieldDTO psDEFieldDTO : page.getContent()) {
				psDEFieldDTOMap.put(psDEFieldDTO.getPSDEFieldName().toUpperCase(), psDEFieldDTO);

			}
		}

		for (PSDEFieldDTO srcPSDEField : srcPSDEFieldDTOList) {
			PSDEFieldDTO psDEFieldDTO = psDEFieldDTOMap.get(srcPSDEField.getPSDEFieldName().toUpperCase());
			if (psDEFieldDTO != null) {
				psDEFieldDTOList.add(psDEFieldDTO);
				continue;
			}

			PSModelServiceUtils.getInstance().createPSDEField(srcPSDEField);
			psDEFieldDTOList.add(srcPSDEField);
		}

		return psDEFieldDTOList;
	}

	protected List<PSDEDataSetDTO> getPSDEDataSetDTOs(PSDataEntityDTO srcPSDataEntityDTO, List<PSDEDataSetDTO> srcPSDEDataSetDTOList) throws Throwable {

		PSDEDataSetFilter psModelSearchContextDTO = new PSDEDataSetFilter().psdeid__eq(srcPSDataEntityDTO.getPSDataEntityId());
		psModelSearchContextDTO.setCount(false);

		List<PSDEDataSetDTO> psDEDataSetDTOList = new ArrayList<PSDEDataSetDTO>();

		Map<String, PSDEDataSetDTO> psDEDataSetDTOMap = new HashMap<String, PSDEDataSetDTO>();
		Page<PSDEDataSetDTO> page = PSModelServiceUtils.getInstance().searchPSDEDataSets(psModelSearchContextDTO);
		if (!ObjectUtils.isEmpty(page.getContent())) {
			for (PSDEDataSetDTO psDEDataSetDTO : page.getContent()) {
				psDEDataSetDTOMap.put(psDEDataSetDTO.getPSDEDataSetName().toUpperCase(), psDEDataSetDTO);

			}
		}

		for (PSDEDataSetDTO srcPSDEDataSet : srcPSDEDataSetDTOList) {
			PSDEDataSetDTO psDEDataSetDTO = psDEDataSetDTOMap.get(srcPSDEDataSet.getPSDEDataSetName().toUpperCase());
			if (psDEDataSetDTO != null) {
				psDEDataSetDTOList.add(psDEDataSetDTO);
				continue;
			}

			PSModelServiceUtils.getInstance().createPSDEDataSet(srcPSDEDataSet);
			psDEDataSetDTOList.add(srcPSDEDataSet);
		}

		return psDEDataSetDTOList;
	}

	protected List<PSDEActionDTO> getPSDEActionDTOs(PSDataEntityDTO srcPSDataEntityDTO, List<PSDEActionDTO> srcPSDEActionDTOList) throws Throwable {

		PSDEActionFilter psModelSearchContextDTO = new PSDEActionFilter();
		psModelSearchContextDTO.eq(PSDEActionDTO.FIELD_PSDEID, srcPSDataEntityDTO.getPSDataEntityId());
		psModelSearchContextDTO.setCount(false);

		List<PSDEActionDTO> psDEActionDTOList = new ArrayList<PSDEActionDTO>();

		Map<String, PSDEActionDTO> psDEActionDTOMap = new HashMap<String, PSDEActionDTO>();
		Page<PSDEActionDTO> page = PSModelServiceUtils.getInstance().searchPSDEActions(psModelSearchContextDTO);
		if (!ObjectUtils.isEmpty(page.getContent())) {
			for (PSDEActionDTO psDEActionDTO : page.getContent()) {
				psDEActionDTOMap.put(psDEActionDTO.getPSDEActionName().toUpperCase(), psDEActionDTO);

			}
		}

		for (PSDEActionDTO srcPSDEAction : srcPSDEActionDTOList) {
			PSDEActionDTO psDEActionDTO = psDEActionDTOMap.get(srcPSDEAction.getPSDEActionName().toUpperCase());
			if (psDEActionDTO != null) {
				psDEActionDTOList.add(psDEActionDTO);
				continue;
			}

			PSModelServiceUtils.getInstance().createPSDEAction(srcPSDEAction);
			psDEActionDTOList.add(srcPSDEAction);
		}

		return psDEActionDTOList;
	}

	protected PSCodeListDTO getPSCodeListDTO(PSCodeListDTO srcPSCodeListDTO) throws Throwable {

		PSCodeListFilter psCodeListFilter = new PSCodeListFilter();
		if (StringUtils.hasLength(srcPSCodeListDTO.getPSModuleId())) {
			psCodeListFilter.psmoduleid__eq(srcPSCodeListDTO.getPSModuleId());
		}
		
		psCodeListFilter.setCount(false);

		Page<PSCodeListDTO> page = PSModelServiceUtils.getInstance().searchPSCodeLists(psCodeListFilter);
		if (!ObjectUtils.isEmpty(page.getContent())) {
			for (PSCodeListDTO psCodeListDTO : page.getContent()) {
				if (StringUtils.hasLength(srcPSCodeListDTO.getPSModuleId())) {
					if (!srcPSCodeListDTO.getPSModuleId().equalsIgnoreCase(psCodeListDTO.getPSModuleId())) {
						continue;
					}
				} else {
					if (StringUtils.hasLength(psCodeListDTO.getPSModuleId())) {
						continue;
					}
				}

				if (StringUtils.hasLength(srcPSCodeListDTO.getCodeName())) {
					if (!srcPSCodeListDTO.getCodeName().equalsIgnoreCase(psCodeListDTO.getCodeName())) {
						continue;
					}
				}
				return psCodeListDTO;
			}
		}

		PSModelServiceUtils.getInstance().createPSCodeList(srcPSCodeListDTO);

		this.updateCurrentPSSysDevBKTask(LogLevels.INFO, String.format("新建代码表[%1$s][%2$s]", srcPSCodeListDTO.getPSCodeListName(), srcPSCodeListDTO.getCodeName()));
		return srcPSCodeListDTO;
	}

	protected List<PSDEServiceAPIDTO> getPSDEServiceAPIDTOs(PSSysServiceAPIDTO srcPSSysServiceAPIDTO, List<PSDEServiceAPIDTO> srcPSDEServiceAPIDTOList) throws Throwable {

		PSDEServiceAPIFilter psModelSearchContextDTO = new PSDEServiceAPIFilter();
		psModelSearchContextDTO.eq(PSDEServiceAPIDTO.FIELD_PSSYSSERVICEAPIID, srcPSSysServiceAPIDTO.getPSSysServiceAPIId());
		psModelSearchContextDTO.setCount(false);

		List<PSDEServiceAPIDTO> psDEServiceAPIDTOList = new ArrayList<PSDEServiceAPIDTO>();

		Map<String, PSDEServiceAPIDTO> psDEServiceAPIDTOMap = new HashMap<String, PSDEServiceAPIDTO>();
		Page<PSDEServiceAPIDTO> page = PSModelServiceUtils.getInstance().searchPSDEServiceAPIs(psModelSearchContextDTO);
		if (!ObjectUtils.isEmpty(page.getContent())) {
			for (PSDEServiceAPIDTO psDEServiceAPIDTO : page.getContent()) {
				psDEServiceAPIDTOMap.put(psDEServiceAPIDTO.getPSDEServiceAPIName().toUpperCase(), psDEServiceAPIDTO);

			}
		}

		for (PSDEServiceAPIDTO srcPSDEServiceAPI : srcPSDEServiceAPIDTOList) {
			PSDEServiceAPIDTO psDEServiceAPIDTO = psDEServiceAPIDTOMap.get(srcPSDEServiceAPI.getPSDEServiceAPIName().toUpperCase());
			if (psDEServiceAPIDTO != null) {
				psDEServiceAPIDTOList.add(psDEServiceAPIDTO);
				continue;
			}

			PSModelServiceUtils.getInstance().createPSDEServiceAPI(srcPSDEServiceAPI);
			
			this.updateCurrentPSSysDevBKTask(LogLevels.INFO, String.format("新建服务接口实体[%1$s][%2$s]", srcPSDEServiceAPI.getPSDEServiceAPIName(), srcPSSysServiceAPIDTO.getPSSysServiceAPIName()));
			
			
			psDEServiceAPIDTOList.add(srcPSDEServiceAPI);
		}

		return psDEServiceAPIDTOList;
	}

	protected List<PSDESARSDTO> getPSDESARSDTOs(PSSysServiceAPIDTO srcPSSysServiceAPIDTO, List<PSDESARSDTO> srcPSDESARSDTOList) throws Throwable {

		PSDESARSFilter psModelSearchContextDTO = new PSDESARSFilter();
		psModelSearchContextDTO.eq(PSDESARSDTO.FIELD_PSSYSSERVICEAPIID, srcPSSysServiceAPIDTO.getPSSysServiceAPIId());
		psModelSearchContextDTO.setCount(false);

		List<PSDESARSDTO> psDESARSDTOList = new ArrayList<PSDESARSDTO>();

		Map<String, PSDESARSDTO> psDESARSDTOMap = new HashMap<String, PSDESARSDTO>();
		Page<PSDESARSDTO> page = PSModelServiceUtils.getInstance().searchPSDESARs(psModelSearchContextDTO);
		if (!ObjectUtils.isEmpty(page.getContent())) {
			for (PSDESARSDTO psDESARSDTO : page.getContent()) {
				String strTag = String.format("%1$s|%2$s", psDESARSDTO.getPPSDEServiceAPIId(), psDESARSDTO.getCPSDEServiceAPIId()).toUpperCase();
				psDESARSDTOMap.put(strTag, psDESARSDTO);

			}
		}

		for (PSDESARSDTO srcPSDESARS : srcPSDESARSDTOList) {

			String strTag = String.format("%1$s|%2$s", srcPSDESARS.getPPSDEServiceAPIId(), srcPSDESARS.getCPSDEServiceAPIId()).toUpperCase();
			PSDESARSDTO psDESARSDTO = psDESARSDTOMap.get(strTag);
			if (psDESARSDTO != null) {
				psDESARSDTOList.add(psDESARSDTO);
				continue;
			}

			PSModelServiceUtils.getInstance().createPSDESARS(srcPSDESARS);
			
			this.updateCurrentPSSysDevBKTask(LogLevels.INFO, String.format("新建服务接口实体关系[%1$s][%2$s]", srcPSDESARS.getPSDESARSName(), srcPSSysServiceAPIDTO.getPSSysServiceAPIName()));
			
			psDESARSDTOList.add(srcPSDESARS);
		}

		return psDESARSDTOList;
	}

	protected List<PSDESADetailDTO> getPSDESADetailDTOs(PSSysServiceAPIDTO srcPSSysServiceAPIDTO, List<PSDESADetailDTO> srcPSDESADetailDTOList) throws Throwable {

		PSDESADetailFilter psModelSearchContextDTO = new PSDESADetailFilter();
		psModelSearchContextDTO.eq(PSDESADetailDTO.FIELD_PSSYSSERVICEAPIID, srcPSSysServiceAPIDTO.getPSSysServiceAPIId());
		psModelSearchContextDTO.setCount(false);

		List<PSDESADetailDTO> psDESADetailDTOList = new ArrayList<PSDESADetailDTO>();

		Map<String, PSDESADetailDTO> psDESADetailDTOMap = new HashMap<String, PSDESADetailDTO>();
		List<PSDESADetailDTO> list = PSModelServiceUtils.getInstance().searchAllPSDESADetails(psModelSearchContextDTO);
		if (!ObjectUtils.isEmpty(list)) {
			for (PSDESADetailDTO psDESADetailDTO : list) {
				String strTag = String.format("%1$s|%2$s|%3$s|%4$s", psDESADetailDTO.getPSDEServiceAPIId(), psDESADetailDTO.getPSDESARSId(), psDESADetailDTO.getPSDEActionId(), psDESADetailDTO.getPSDEDSId());
				psDESADetailDTOMap.put(strTag, psDESADetailDTO);

			}
		}

		for (PSDESADetailDTO srcPSDESADetailDTO : srcPSDESADetailDTOList) {

			String strTag = String.format("%1$s|%2$s|%3$s|%4$s", srcPSDESADetailDTO.getPSDEServiceAPIId(), srcPSDESADetailDTO.getPSDESARSId(), srcPSDESADetailDTO.getPSDEActionId(), srcPSDESADetailDTO.getPSDEDSId());
			PSDESADetailDTO psDESADetailDTO = psDESADetailDTOMap.get(strTag);
			if (psDESADetailDTO != null) {
				psDESADetailDTOList.add(psDESADetailDTO);
				continue;
			}

			PSModelServiceUtils.getInstance().createPSDESADetail(srcPSDESADetailDTO);
			
			this.updateCurrentPSSysDevBKTask(LogLevels.INFO, String.format("新建服务接口实体方法[%1$s][%2$s][%3$s]", srcPSDESADetailDTO.getPSDESADetailName(), srcPSDESADetailDTO.getPSDEServiceAPIName(), srcPSSysServiceAPIDTO.getPSSysServiceAPIName()));
			
			psDESADetailDTOList.add(srcPSDESADetailDTO);
		}

		return psDESADetailDTOList;
	}

	protected PSDERDTO getPSDERDTO(PSDERDTO srcPSDERDTO) throws Throwable {

		PSDERFilter psModelSearchContextDTO = new PSDERFilter();
		psModelSearchContextDTO.eq(PSDERDTO.FIELD_MAJORPSDEID, srcPSDERDTO.getMajorPSDEId());
		psModelSearchContextDTO.eq(PSDERDTO.FIELD_MINORPSDEID, srcPSDERDTO.getMinorPSDEId());
		psModelSearchContextDTO.setCount(false);

		Page<PSDERDTO> page = PSModelServiceUtils.getInstance().searchPSDERs(psModelSearchContextDTO);
		if (!ObjectUtils.isEmpty(page.getContent())) {
			for (PSDERDTO psDERDTO : page.getContent()) {

				if (DERType.DERCUSTOM.value.equals(psDERDTO.getDERType())) {
					if (psDERDTO.getPSDERName().equals(srcPSDERDTO.getPSDERName())) {
						return psDERDTO;
					}
				} else {
					return psDERDTO;
				}
			}
		}
		PSModelServiceUtils.getInstance().createPSDER(srcPSDERDTO);

		this.updateCurrentPSSysDevBKTask(LogLevels.INFO, String.format("新建实体关系[%1$s][%2$s]", srcPSDERDTO.getPSDERName(), srcPSDERDTO.getCodeName()));

		return srcPSDERDTO;
	}

	protected List<PSSubSysSADEDTO> getPSSubSysSADEDTOs(PSSubSysServiceAPIDTO srcPSSubSysServiceAPIDTO, List<PSSubSysSADEDTO> srcPSSubSysSADEDTOList) throws Throwable {

		PSSubSysSADEFilter psModelSearchContextDTO = new PSSubSysSADEFilter();
		psModelSearchContextDTO.pssubsysserviceapiid__eq(srcPSSubSysServiceAPIDTO.getPSSubSysServiceAPIId());
		
		psModelSearchContextDTO.setCount(false);

		List<PSSubSysSADEDTO> psSubSysSADEDTOList = new ArrayList<PSSubSysSADEDTO>();

		Map<String, PSSubSysSADEDTO> psSubSysSADEDTOMap = new HashMap<String, PSSubSysSADEDTO>();
		List<PSSubSysSADEDTO> list = PSModelServiceUtils.getInstance().searchAllPSSubSysSADEs(psModelSearchContextDTO);
		if (!ObjectUtils.isEmpty(list)) {
			for (PSSubSysSADEDTO psSubSysSADEDTO : list) {
				psSubSysSADEDTOMap.put(psSubSysSADEDTO.getPSSubSysSADEName().toUpperCase(), psSubSysSADEDTO);
			}
		}

		for (PSSubSysSADEDTO srcPSSubSysSADEDTO : srcPSSubSysSADEDTOList) {
			PSSubSysSADEDTO psSubSysSADEDTO = psSubSysSADEDTOMap.get(srcPSSubSysSADEDTO.getPSSubSysSADEName().toUpperCase());
			if (psSubSysSADEDTO != null) {

				if (DataTypeUtils.compare(DataTypes.VARCHAR, psSubSysSADEDTO.getCodeName(), srcPSSubSysSADEDTO.getCodeName()) == 0) {
					psSubSysSADEDTOList.add(psSubSysSADEDTO);
					continue;
				}
			}

			fillPSModelDTO(srcPSSubSysSADEDTO, psSubSysSADEDTO == null);
			if (psSubSysSADEDTO == null) {
				PSModelServiceUtils.getInstance().createPSSubSysSADE(srcPSSubSysSADEDTO);
				this.updateCurrentPSSysDevBKTask(LogLevels.INFO, String.format("新建外部服务接口实体[%1$s][%2$s]", srcPSSubSysSADEDTO.getPSSubSysSADEName(), srcPSSubSysServiceAPIDTO.getPSSubSysServiceAPIName()));
				
			} else {
				PSModelServiceUtils.getInstance().updatePSSubSysSADE(srcPSSubSysSADEDTO);
				this.updateCurrentPSSysDevBKTask(LogLevels.INFO, String.format("更新外部服务接口实体[%1$s][%2$s]", srcPSSubSysSADEDTO.getPSSubSysSADEName(), srcPSSubSysServiceAPIDTO.getPSSubSysServiceAPIName()));
			}
			psSubSysSADEDTOList.add(srcPSSubSysSADEDTO);
		}

		return psSubSysSADEDTOList;
	}

	protected List<PSSubSysSADEFieldDTO> getPSSubSysSADEFieldDTOs(PSSubSysServiceAPIDTO srcPSSubSysServiceAPIDTO, List<PSSubSysSADEFieldDTO> srcPSSubSysSADEFieldDTOList) throws Throwable {

		PSSubSysSADEFieldFilter psModelSearchContextDTO = new PSSubSysSADEFieldFilter().pssubsysserviceapiid__eq(srcPSSubSysServiceAPIDTO.getPSSubSysServiceAPIId());
		psModelSearchContextDTO.setCount(false);

		List<PSSubSysSADEFieldDTO> psSubSysSADEFieldDTOList = new ArrayList<PSSubSysSADEFieldDTO>();

		Map<String, PSSubSysSADEFieldDTO> psSubSysSADEFieldDTOMap = new HashMap<String, PSSubSysSADEFieldDTO>();
		List<PSSubSysSADEFieldDTO> list = PSModelServiceUtils.getInstance().searchAllPSSubSysSADEFields(psModelSearchContextDTO);
		if (!ObjectUtils.isEmpty(list)) {
			for (PSSubSysSADEFieldDTO psSubSysSADEFieldDTO : list) {
				psSubSysSADEFieldDTOMap.put(String.format("%1$s|%2$s", psSubSysSADEFieldDTO.getPSSubSysSADEId(), psSubSysSADEFieldDTO.getPSSubSysSADEFieldName().toUpperCase()), psSubSysSADEFieldDTO);
			}
		}

		for (PSSubSysSADEFieldDTO srcPSSubSysSADEFieldDTO : srcPSSubSysSADEFieldDTOList) {
			String strTag = String.format("%1$s|%2$s", srcPSSubSysSADEFieldDTO.getPSSubSysSADEId(), srcPSSubSysSADEFieldDTO.getPSSubSysSADEFieldName().toUpperCase());
			PSSubSysSADEFieldDTO psSubSysSADEFieldDTO = psSubSysSADEFieldDTOMap.get(strTag);
			if (psSubSysSADEFieldDTO != null) {
				// 进一步判断
				if (DataTypeUtils.compare(DataTypes.VARCHAR, psSubSysSADEFieldDTO.getCodeName(), srcPSSubSysSADEFieldDTO.getCodeName()) == 0) {
					psSubSysSADEFieldDTOList.add(psSubSysSADEFieldDTO);
					continue;
				}
			}

			fillPSModelDTO(srcPSSubSysSADEFieldDTO, psSubSysSADEFieldDTO == null);

			if (psSubSysSADEFieldDTO == null) {
				PSModelServiceUtils.getInstance().createPSSubSysSADEField(srcPSSubSysSADEFieldDTO);
				this.updateCurrentPSSysDevBKTask(LogLevels.INFO, String.format("新建外部服务接口实体属性[%1$s][%2$s][%3$s]", srcPSSubSysSADEFieldDTO.getPSSubSysSADEFieldName(), srcPSSubSysSADEFieldDTO.getPSSubSysSADEName(), srcPSSubSysServiceAPIDTO.getPSSubSysServiceAPIName()));
			} else {
				PSModelServiceUtils.getInstance().updatePSSubSysSADEField(srcPSSubSysSADEFieldDTO);
				this.updateCurrentPSSysDevBKTask(LogLevels.INFO, String.format("更新外部服务接口实体属性[%1$s][%2$s][%3$s]", srcPSSubSysSADEFieldDTO.getPSSubSysSADEFieldName(), srcPSSubSysSADEFieldDTO.getPSSubSysSADEName(), srcPSSubSysServiceAPIDTO.getPSSubSysServiceAPIName()));
			}

			psSubSysSADEFieldDTOList.add(srcPSSubSysSADEFieldDTO);
		}

		return psSubSysSADEFieldDTOList;
	}

	protected List<PSSubSysSADetailDTO> getPSSubSysSADetailDTOs(PSSubSysServiceAPIDTO srcPSSubSysServiceAPIDTO, List<PSSubSysSADetailDTO> srcPSSubSysSADetailDTOList) throws Throwable {

		PSSubSysSADetailFilter psModelSearchContextDTO = new PSSubSysSADetailFilter();
		psModelSearchContextDTO.eq(PSSubSysSADetailDTO.FIELD_PSSUBSYSSERVICEAPIID, srcPSSubSysServiceAPIDTO.getPSSubSysServiceAPIId());
		psModelSearchContextDTO.setCount(false);

		List<PSSubSysSADetailDTO> psSubSysSADetailDTOList = new ArrayList<PSSubSysSADetailDTO>();

		Map<String, PSSubSysSADetailDTO> codeNameMap = new HashMap<String, PSSubSysSADetailDTO>();
		Map<String, PSSubSysSADetailDTO> psSubSysSADetailDTOMap = new HashMap<String, PSSubSysSADetailDTO>();
		List<PSSubSysSADetailDTO> list = PSModelServiceUtils.getInstance().searchAllPSSubSysSADetails(psModelSearchContextDTO);
		if (!ObjectUtils.isEmpty(list)) {
			for (PSSubSysSADetailDTO psSubSysSADetailDTO : list) {
				psSubSysSADetailDTOMap.put(String.format("%1$s", psSubSysSADetailDTO.getPSSubSysSADetailName().toUpperCase()), psSubSysSADetailDTO);
				if (StringUtils.hasLength(psSubSysSADetailDTO.getCodeName())) {
					codeNameMap.put(psSubSysSADetailDTO.getCodeName().toUpperCase(), psSubSysSADetailDTO);
				}
			}
		}

		for (PSSubSysSADetailDTO srcPSSubSysSADetailDTO : srcPSSubSysSADetailDTOList) {
			String strTag = String.format("%1$s", srcPSSubSysSADetailDTO.getPSSubSysSADetailName().toUpperCase());
			PSSubSysSADetailDTO psSubSysSADetailDTO = psSubSysSADetailDTOMap.get(strTag);
			if (psSubSysSADetailDTO != null) {
				// 进一步判断
				if (!StringUtils.hasLength(srcPSSubSysSADetailDTO.getCodeName())) {
					psSubSysSADetailDTOList.add(psSubSysSADetailDTO);
					continue;
				}
				if (DataTypeUtils.compare(DataTypes.VARCHAR, psSubSysSADetailDTO.getCodeName(), srcPSSubSysSADetailDTO.getCodeName()) == 0) {
					psSubSysSADetailDTOList.add(psSubSysSADetailDTO);
					continue;
				}
			}

			fillPSModelDTO(srcPSSubSysSADetailDTO, psSubSysSADetailDTO == null);

			// 未指定代码标识
			if (!StringUtils.hasLength(srcPSSubSysSADetailDTO.getCodeName())) {
				String strBaseCodeName = srcPSSubSysSADetailDTO.getCodeName2();
				if (!StringUtils.hasLength(strBaseCodeName)) {
					strBaseCodeName = "Auto";
				}
				int nIndex = 0;
				while (true) {
					nIndex++;
					String strCodeName = (nIndex == 1) ? strBaseCodeName : String.format("%1$s%2$s", strBaseCodeName, nIndex);
					if (!codeNameMap.containsKey(strCodeName.toUpperCase())) {
						srcPSSubSysSADetailDTO.setCodeName(strCodeName);
						codeNameMap.put(srcPSSubSysSADetailDTO.getCodeName().toUpperCase(), srcPSSubSysSADetailDTO);
						break;
					}
				}
			}

			if (psSubSysSADetailDTO == null) {
				PSModelServiceUtils.getInstance().createPSSubSysSADetail(srcPSSubSysSADetailDTO);
				this.updateCurrentPSSysDevBKTask(LogLevels.INFO, String.format("新建外部服务接口服务路径[%1$s][%2$s]", srcPSSubSysSADetailDTO.getPSSubSysSADetailName(), srcPSSubSysServiceAPIDTO.getPSSubSysServiceAPIName()));
			} else {
				PSModelServiceUtils.getInstance().updatePSSubSysSADetail(srcPSSubSysSADetailDTO);
				this.updateCurrentPSSysDevBKTask(LogLevels.INFO, String.format("更新外部服务接口服务路径[%1$s][%2$s]", srcPSSubSysSADetailDTO.getPSSubSysSADetailName(), srcPSSubSysServiceAPIDTO.getPSSubSysServiceAPIName()));
			}

			psSubSysSADetailDTOList.add(srcPSSubSysSADetailDTO);
		}

		return psSubSysSADetailDTOList;
	}

	protected List<PSSysDBTableDTO> getPSSysDBTableDTOs(PSSysDBSchemeDTO srcPSSysDBSchemeDTO, List<PSSysDBTableDTO> srcPSSysDBTableDTOList) throws Throwable {

		PSSysDBTableFilter psModelSearchContextDTO = new PSSysDBTableFilter();
		psModelSearchContextDTO.eq(PSSysDBTableDTO.FIELD_PSSYSDBSCHEMEID, srcPSSysDBSchemeDTO.getPSSysDBSchemeId());
		psModelSearchContextDTO.setCount(false);

		List<PSSysDBTableDTO> psSysDBTableDTOList = new ArrayList<PSSysDBTableDTO>();

		Map<String, PSSysDBTableDTO> psSysDBTableDTOMap = new HashMap<String, PSSysDBTableDTO>();
		List<PSSysDBTableDTO> list = PSModelServiceUtils.getInstance().searchAllPSSysDBTables(psModelSearchContextDTO);
		if (!ObjectUtils.isEmpty(list)) {
			for (PSSysDBTableDTO psSysDBTableDTO : list) {
				psSysDBTableDTOMap.put(psSysDBTableDTO.getPSSysDBTableName().toUpperCase(), psSysDBTableDTO);
			}
		}

		for (PSSysDBTableDTO srcPSSysDBTableDTO : srcPSSysDBTableDTOList) {
			PSSysDBTableDTO psSysDBTableDTO = psSysDBTableDTOMap.get(srcPSSysDBTableDTO.getPSSysDBTableName().toUpperCase());
			if (psSysDBTableDTO != null) {
				psSysDBTableDTOList.add(psSysDBTableDTO);
				continue;
			}

			fillPSModelDTO(srcPSSysDBTableDTO, psSysDBTableDTO == null);

			PSModelServiceUtils.getInstance().createPSSysDBTable(srcPSSysDBTableDTO);

			this.updateCurrentPSSysDevBKTask(LogLevels.INFO, String.format("新建数据表[%1$s][%2$s]", srcPSSysDBTableDTO.getPSSysDBTableName(), srcPSSysDBSchemeDTO.getPSSysDBSchemeName()));
			
			psSysDBTableDTOList.add(srcPSSysDBTableDTO);
		}

		return psSysDBTableDTOList;
	}

	protected List<PSSysDBColumnDTO> getPSSysDBColumnDTOs(PSSysDBSchemeDTO srcPSSysDBSchemeDTO, List<PSSysDBColumnDTO> srcPSSysDBColumnDTOList) throws Throwable {

		PSSysDBColumnFilter psModelSearchContextDTO = new PSSysDBColumnFilter().pssysdbschemeid__eq(srcPSSysDBSchemeDTO.getPSSysDBSchemeId());
		psModelSearchContextDTO.setCount(false);

		List<PSSysDBColumnDTO> psSysDBColumnDTOList = new ArrayList<PSSysDBColumnDTO>();

		Map<String, PSSysDBColumnDTO> psSysDBColumnDTOMap = new HashMap<String, PSSysDBColumnDTO>();
		List<PSSysDBColumnDTO> list = PSModelServiceUtils.getInstance().searchAllPSSysDBColumns(psModelSearchContextDTO);
		if (!ObjectUtils.isEmpty(list)) {
			for (PSSysDBColumnDTO psSysDBColumnDTO : list) {
				psSysDBColumnDTOMap.put(String.format("%1$s|%2$s", psSysDBColumnDTO.getPSSysDBTableId(), psSysDBColumnDTO.getPSSysDBColumnName().toUpperCase()), psSysDBColumnDTO);
			}
		}

		for (PSSysDBColumnDTO srcPSSysDBColumnDTO : srcPSSysDBColumnDTOList) {
			String strTag = String.format("%1$s|%2$s", srcPSSysDBColumnDTO.getPSSysDBTableId(), srcPSSysDBColumnDTO.getPSSysDBColumnName().toUpperCase());
			PSSysDBColumnDTO psSysDBColumnDTO = psSysDBColumnDTOMap.get(strTag);
			if (psSysDBColumnDTO != null) {

				psSysDBColumnDTOList.add(psSysDBColumnDTO);
				continue;

			}

			fillPSModelDTO(srcPSSysDBColumnDTO, psSysDBColumnDTO == null);

			PSModelServiceUtils.getInstance().createPSSysDBColumn(srcPSSysDBColumnDTO);
			
			this.updateCurrentPSSysDevBKTask(LogLevels.INFO, String.format("新建数据列[%1$s][%2$s]", srcPSSysDBColumnDTO.getPSSysDBColumnName(), srcPSSysDBColumnDTO.getPSSysDBTableName()));

			psSysDBColumnDTOList.add(srcPSSysDBColumnDTO);
		}

		return psSysDBColumnDTOList;
	}
	
	
	protected List<PSDEOPPrivDTO> getPSDEOPPrivDTOs(PSDataEntityDTO srcPSDataEntityDTO, List<PSDEOPPrivDTO> srcPSDEOPPrivDTOList) throws Throwable {

		PSDEOPPrivFilter psModelSearchContextDTO = new PSDEOPPrivFilter();
		psModelSearchContextDTO.eq(PSDEOPPrivDTO.FIELD_PSDEID, srcPSDataEntityDTO.getPSDataEntityId());
		psModelSearchContextDTO.setCount(false);

		List<PSDEOPPrivDTO> psDEOPPrivDTOList = new ArrayList<PSDEOPPrivDTO>();

		Map<String, PSDEOPPrivDTO> psDEOPPrivDTOMap = new HashMap<String, PSDEOPPrivDTO>();
		List<PSDEOPPrivDTO> list = PSModelServiceUtils.getInstance().searchAllPSDEOPPrivs(psModelSearchContextDTO);
		if (!ObjectUtils.isEmpty(list)) {
			for (PSDEOPPrivDTO psDEOPPrivDTO : list) {
				psDEOPPrivDTOMap.put(psDEOPPrivDTO.getPSDEOPPrivName().toUpperCase(), psDEOPPrivDTO);

			}
		}

		for (PSDEOPPrivDTO srcPSDEOPPriv : srcPSDEOPPrivDTOList) {
			PSDEOPPrivDTO psDEOPPrivDTO = psDEOPPrivDTOMap.get(srcPSDEOPPriv.getPSDEOPPrivName().toUpperCase());
			if (psDEOPPrivDTO != null) {
				psDEOPPrivDTOList.add(psDEOPPrivDTO);
				continue;
			}

			PSModelServiceUtils.getInstance().createPSDEOPPriv(srcPSDEOPPriv);
			
			this.updateCurrentPSSysDevBKTask(LogLevels.INFO, String.format("新建实体操作标识[%1$s][%2$s]", srcPSDEOPPriv.getPSDEOPPrivName(), srcPSDataEntityDTO.getPSDataEntityName()));
			
			psDEOPPrivDTOList.add(srcPSDEOPPriv);
		}

		return psDEOPPrivDTOList;
	}

	
	protected void fillArgMap(Map<String, String> argMap) {
		argMap.put("-s", "");
		argMap.put("-p", "");
		argMap.put("", "");
	}
}
