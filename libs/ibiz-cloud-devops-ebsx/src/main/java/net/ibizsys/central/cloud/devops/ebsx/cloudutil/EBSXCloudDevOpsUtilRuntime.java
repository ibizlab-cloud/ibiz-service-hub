package net.ibizsys.central.cloud.devops.ebsx.cloudutil;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jgit.api.CloneCommand;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.PullCommand;
import org.eclipse.jgit.internal.storage.file.FileRepository;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;
import org.springframework.util.DigestUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.yaml.snakeyaml.Yaml;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.cloudutil.ICloudSaaSUtilRuntime;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.spring.configuration.NacosServiceHubSettingBase;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.spring.util.GatewayUtils;
import net.ibizsys.central.cloud.core.sysutil.ISysWFUtilRuntime;
import net.ibizsys.central.cloud.core.util.ConfigEntity;
import net.ibizsys.central.cloud.core.util.domain.DCSystem;
import net.ibizsys.central.cloud.core.util.domain.DevSysTypes;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.cloud.core.util.domain.MetaDynaModel;
import net.ibizsys.central.cloud.core.util.domain.WFGroup;
import net.ibizsys.central.cloud.devops.core.cloudutil.CloudDevOpsUtilRuntimeBase;
import net.ibizsys.central.cloud.saas.ebsx.EBSXSystemRuntime;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.center.dto.DCMetaDynaModelDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.dict.dto.DictCatalogDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.dict.service.IDictCatalogService;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto.DstConfigDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto.MetaDynaModelDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto.MetaEntityDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IDstConfigService;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IMetaDynaModelService;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IMetaEntityService;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.task.dto.JobsInfoDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.task.service.IJobsInfoService;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.ApplicationDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.DCSystemDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.DynaInstDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.PermissionActionDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.PermissionDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.RoleDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.RolePermissionDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.SystemDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IApplicationService;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IDCSystemService;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IDynaInstService;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IPermissionService;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IRolePermissionService;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IRoleService;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.dto.WFGroupDTO;
import net.ibizsys.central.cloud.saas.ebsx.util.StaticDict;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.centralstudio.util.DataTypeUtils;
import net.ibizsys.model.IPSSystem;
import net.ibizsys.model.IPSSystemService;
import net.ibizsys.model.PSModelEnums.DynaSysMode;
import net.ibizsys.model.PSModelServiceImpl;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.app.appmenu.IPSAppMenuModel;
import net.ibizsys.model.app.wf.IPSAppWF;
import net.ibizsys.model.backservice.IPSSysBackService;
import net.ibizsys.model.codelist.IPSCodeList;
import net.ibizsys.model.control.menu.IPSAppMenuItem;
import net.ibizsys.model.database.IPSSysDBScheme;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.priv.IPSDEUserRole;
import net.ibizsys.model.dataentity.priv.IPSDEUserRoleOPPriv;
import net.ibizsys.model.security.IPSSysUniRes;
import net.ibizsys.model.security.IPSSysUserRole;
import net.ibizsys.model.security.IPSSysUserRoleData;
import net.ibizsys.model.security.IPSSysUserRoleRes;
import net.ibizsys.model.util.PSModelMergeUtils;
import net.ibizsys.model.util.merger.PSModelMergeContext;
import net.ibizsys.model.wf.IPSWFDEDataSetRole;
import net.ibizsys.model.wf.IPSWFRole;
import net.ibizsys.model.wf.IPSWFVersion;
import net.ibizsys.model.wf.IPSWorkflow;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.codelist.CodeListTypes;
import net.ibizsys.runtime.security.SysUserRoleDefaultModes;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.DataTypes;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.ITransactionalUtil;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.LogCats;
import net.ibizsys.runtime.util.LogLevels;
import net.ibizsys.runtime.util.ZipUtils;
import net.ibizsys.runtime.wf.WFRoleTypes;

public class EBSXCloudDevOpsUtilRuntime extends CloudDevOpsUtilRuntimeBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(EBSXCloudDevOpsUtilRuntime.class);

	/**
	 * 开发系统操作参数：线程模式
	 */
	public final static String DEVSYSTEMACTIONPARAM_THREADMODE = "THREADMODE";
	
	protected final static String TAG_IGNOREUPDATEMODELOSS = "ignoreupdatemodeloss";

	private String strGitUserName = null;

	private String strGitPassword = null;

	@Override
	protected void onReloadSetting(boolean bFirst) throws Throwable {
		super.onReloadSetting(bFirst);

		this.setGitUserName(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".gitusername", null));
		this.setGitPassword(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".gitpassword", null));
	}

	@Override
	protected void onInit() throws Exception {
		super.onInit();

	}

	@Override
	protected void onInstall() throws Exception {

		super.onInstall();
	}

	protected String getGitUserName() {
		return strGitUserName;
	}

	protected void setGitUserName(String strGitUserName) {
		this.strGitUserName = strGitUserName;
	}

	protected String getGitPassword() {
		return strGitPassword;
	}

	protected void setGitPassword(String strGitPassword) {
		this.strGitPassword = strGitPassword;
	}

	@Override
	public Object executeDevSystemAction(String strSystemId, String strAction, Map<String, Object> params) {

		boolean bThreadMode = true;
		if (params != null) {
			Object objThreadMode = params.get(DEVSYSTEMACTIONPARAM_THREADMODE);
			if (objThreadMode != null) {
				bThreadMode = objThreadMode.toString().equalsIgnoreCase("true");
			}
		}
		if (bThreadMode) {
			if (DEVSYSTEMACTION_STARTMSAPI.equals(strAction) || DEVSYSTEMACTION_STARTMSAPP.equals(strAction) || DEVSYSTEMACTION_PUBCODE.equals(strAction)) {

				this.getSystemRuntime().threadRun(new Runnable() {
					@Override
					public void run() {
						superExecuteDevSystemAction(strSystemId, strAction, params);
					}
				});
				return null;
			}
		}

		return super.executeDevSystemAction(strSystemId, strAction, params);
	}

	private Object superExecuteDevSystemAction(String strSystemId, String strAction, Map<String, Object> params) {
		return super.executeDevSystemAction(strSystemId, strAction, params);
	}

	@Override
	protected Object onExecuteDevSystemAction(String strSystemId, String strAction, Map<String, Object> params) throws Throwable {
		log.debug(String.format("开发系统回调操作[%1$s][%2$s]", strSystemId, strAction));

		// if (DEVSYSTEMACTION_STARTX.equals(strAction)) {
		// return onExecuteDevSystemStartX(strSystemId, strAction, params);
		// }

		if (DEVSYSTEMACTION_STARTMSAPI.equals(strAction)) {
			return onExecuteDevSystemStartMSAPI(strSystemId, strAction, params);
		}

		if (DEVSYSTEMACTION_STARTMSAPP.equals(strAction) || DEVSYSTEMACTION_PUBCODE.equals(strAction)) {
			return onExecuteDevSystemStartMSApp(strSystemId, strAction, params);
		}

		log.warn(String.format("未支持的开发系统回调操作[%1$s][%2$s]", strSystemId, strAction));
		return null;
		// return super.onExecuteDevSystemAction(strSystemId, strAction,
		// params);
	}

	protected Object onExecuteDevSystemStartMSAPI(String strSystemId, String strAction, Map<String, Object> params) throws Throwable {
		if (!this.isDevMode()) {
			log.warn(String.format("未设置开发模式，忽略远程指令"));
			return null;
		}

		if (!StringUtils.hasLength(strSystemId) || strSystemId.length() > ICloudSaaSUtilRuntime.MAXSERVICEIDLENGTH) {
			log.warn(String.format("系统标识[%1$s]无效", strSystemId));
			return null;
		}
		
	
		SystemDTO systemDTO = this.getSystemIf(strSystemId, true);

		// 获取参数
		String strSysModelPath = this.getSysModelPath(systemDTO);
		if (!StringUtils.hasLength(strSysModelPath)) {
			log.warn(String.format("无法获取部署系统[%1$s]模型路径，无法进行部署操作", systemDTO.getPSSystemId()));
			return null;
		}

		// 进行合并
		String strPSModelFolderPath = strSysModelPath;
		// 进行系统合并
		try {
			String strConfigId = String.format("%1$s%2$s", NacosServiceHubSettingBase.DATAID_SYSTEMHUB_PREFIX, systemDTO.getPSSystemId());
			String strConfig = ServiceHub.getInstance().getConfig(strConfigId);
			if (StringUtils.hasLength(strConfig)) {
				Map<String, Object> config = null;
				if (StringUtils.hasLength(strConfig)) {
					Yaml yaml = new Yaml();
					config = yaml.loadAs(strConfig, Map.class);
				}
				if (config != null && config.containsKey("mergesystems")) {
					List list = (List) config.get("mergesystems");
					if (!ObjectUtils.isEmpty((list))) {

						for (Object objSystemId : list) {
							String strSubSystemId = (String) objSystemId;
							SystemDTO subSystemDTO = this.getSystemIf(strSubSystemId, false);
							// 获取参数
							String strSubSysModelPath = this.getSysModelPath(subSystemDTO);
							if (!StringUtils.hasLength(strSubSysModelPath)) {
								throw new Exception(String.format("无法获取部署系统[%1$s]模型路径，无法进行合并操作", subSystemDTO.getPSSystemId()));
							}

							// 进行合并
							// 建立临时目录
							File tempFile = File.createTempFile("model_" + systemDTO.getPSSystemId(), ".dir");
							File folder = new File(tempFile.getCanonicalPath() + "." + subSystemDTO.getPSSystemId());
							folder.mkdirs();

							PSModelMergeContext psModelMergeContext = new PSModelMergeContext();
							psModelMergeContext.setPSModelFolderPath(strPSModelFolderPath);
							psModelMergeContext.setMergePSModelFolderPath(strSubSysModelPath);
							psModelMergeContext.setDstPSModelFolderPath(folder.getCanonicalPath());

							PSModelMergeUtils.merge(psModelMergeContext);

							strPSModelFolderPath = folder.getCanonicalPath();

							this.getSystemRuntime().log(LogLevels.INFO, LogCats.DEPLOY_PUBLISHDYNAMODEL, String.format("总线系统[%1$s]合入模型[%2$s]", systemDTO.getPSSystemId(), subSystemDTO.getPSSystemId()), null);

						}
					}
				}
			}

		} catch (Throwable ex) {
			throw new Exception(String.format("获取系统总线配置发生异常，%1$s", ex.getMessage()), ex);
		}

		IPSSystemService iPSSystemService = this.getPSSystemService(strPSModelFolderPath);
		String strSysType = (String) params.get("systype");
		if (!StringUtils.hasLength(strSysType)) {
			strSysType = iPSSystemService.getPSSystem().getSysType();
		}
		if (!StringUtils.hasLength(strSysType)) {
			strSysType = DevSysTypes.DEVSYS;
		}

		this.syncSystemModel(systemDTO, iPSSystemService, strSysType, params);
		this.pubSystemConfig(systemDTO, iPSSystemService, strSysType, params);

		return null;
	}

	protected Object onExecuteDevSystemStartMSApp(String strSystemId, String strAction, Map<String, Object> params) throws Throwable {
		if (!this.isDevMode()) {
			log.warn(String.format("未设置开发模式，忽略远程指令"));
			return null;
		}

		if (!StringUtils.hasLength(strSystemId) || strSystemId.length() > ICloudSaaSUtilRuntime.MAXSERVICEIDLENGTH) {
			log.warn(String.format("系统标识[%1$s]无效", strSystemId));
			return null;
		}

	
		
		SystemDTO systemDTO = this.getSystemIf(strSystemId, true);

		String strSysModelPath = this.getSysModelPath(systemDTO);
		if (!StringUtils.hasLength(strSysModelPath)) {
			log.warn(String.format("无法获取部署系统[%1$s]模型路径，无法进行部署操作", systemDTO.getPSSystemId()));
			return null;
		}

		// 进行合并
		String strPSModelFolderPath = strSysModelPath;
		// 进行系统合并
		try {
			String strConfigId = String.format("%1$s%2$s", NacosServiceHubSettingBase.DATAID_SYSTEMHUB_PREFIX, systemDTO.getPSSystemId());
			String strConfig = ServiceHub.getInstance().getConfig(strConfigId);
			if (StringUtils.hasLength(strConfig)) {
				Map<String, Object> config = null;
				if (StringUtils.hasLength(strConfig)) {
					Yaml yaml = new Yaml();
					config = yaml.loadAs(strConfig, Map.class);
				}
				if (config != null && config.containsKey("mergesystems")) {
					List list = (List) config.get("mergesystems");
					if (!ObjectUtils.isEmpty((list))) {

						for (Object objSystemId : list) {
							String strSubSystemId = (String) objSystemId;
							SystemDTO subSystemDTO = this.getSystemIf(strSubSystemId, false);
							// 获取参数
							String strSubSysModelPath = this.getSysModelPath(subSystemDTO);
							if (!StringUtils.hasLength(strSubSysModelPath)) {
								throw new Exception(String.format("无法获取部署系统[%1$s]模型路径，无法进行合并操作", subSystemDTO.getPSSystemId()));
							}

							// 进行合并
							// 建立临时目录
							File tempFile = File.createTempFile("model_" + systemDTO.getPSSystemId(), ".dir");
							File folder = new File(tempFile.getCanonicalPath() + "." + subSystemDTO.getPSSystemId());
							folder.mkdirs();

							PSModelMergeContext psModelMergeContext = new PSModelMergeContext();
							psModelMergeContext.setPSModelFolderPath(strPSModelFolderPath);
							psModelMergeContext.setMergePSModelFolderPath(strSubSysModelPath);
							psModelMergeContext.setDstPSModelFolderPath(folder.getCanonicalPath());

							PSModelMergeUtils.merge(psModelMergeContext);

							strPSModelFolderPath = folder.getCanonicalPath();

							this.getSystemRuntime().log(LogLevels.INFO, LogCats.DEPLOY_PUBLISHDYNAMODEL, String.format("总线系统[%1$s]合入模型[%2$s]", systemDTO.getPSSystemId(), subSystemDTO.getPSSystemId()), null);

						}
					}
				}
			}

		} catch (Throwable ex) {
			throw new Exception(String.format("获取系统总线配置发生异常，%1$s", ex.getMessage()), ex);
		}

		IPSSystemService iPSSystemService = this.getPSSystemService(strPSModelFolderPath);

		String strDevCenterId = (String) params.get("devcenterid");
		if (!StringUtils.hasLength(strDevCenterId)) {
			strDevCenterId = iPSSystemService.getPSSystem().getDeploySysTag();
		}
		if (!StringUtils.hasLength(strDevCenterId)) {
			strDevCenterId = this.getDevCenterId();
		}

		DCSystemDTO dcSystemDTO = null;
		if (StringUtils.hasLength(strDevCenterId)) {
			dcSystemDTO = this.getDCSystem(systemDTO, strDevCenterId);
		}

		DynaInstDTO dynaInstDTO = null;
		if (dcSystemDTO != null) {
			dynaInstDTO = getDynaInst(dcSystemDTO);
		}

		String strSysType = (String) params.get("systype");
		if (!StringUtils.hasLength(strSysType)) {
			strSysType = iPSSystemService.getPSSystem().getSysType();
		}
		if (!StringUtils.hasLength(strSysType)) {
			strSysType = DevSysTypes.DEVSYS;
		}
		this.syncSystemModel(systemDTO, iPSSystemService, strSysType, params);
		if (dcSystemDTO != null && dynaInstDTO != null) {

			dcSystemDTO.set("modeldigest", systemDTO.get("modeldigest"));
			dcSystemDTO.set("modelossid", systemDTO.get("modelossid"));
			dcSystemDTO.set("modelossname", systemDTO.get("modelossname"));

			this.syncDCSystemModel(dcSystemDTO, dynaInstDTO, iPSSystemService, strSysType, false, params);
		}
		this.pubSystemConfig(systemDTO, iPSSystemService, strSysType, params);

		return null;
	}

	protected void updateSystemModelDigest(SystemDTO systemDTO, IPSSystemService iPSSystemService, Map<String, Object> params) throws Throwable {

		// 建立模型压缩文件
		File tempFile = File.createTempFile("model_" + systemDTO.getPSSystemId(), ".zip");
		ZipUtils.zip(new File(iPSSystemService.getPSModelFolderPath()), tempFile);
		String strFileHashCode = "";
		try (FileInputStream fis = new FileInputStream(tempFile)) {
			strFileHashCode = DigestUtils.md5DigestAsHex(fis);
		}
		String strMD5Code = systemDTO.getMD5Check();
		if (StringUtils.hasLength(strMD5Code)) {
			// 判断是否一致
			String[] items = strMD5Code.split("[|]");
			if (items.length == 2 && strFileHashCode.equals(items[0])) {
				systemDTO.set("modeldigest", strFileHashCode);
				systemDTO.set("modelossid", items[1]);
				systemDTO.set("modelossname", String.format("%1$s.zip", systemDTO.getPSSystemId()));
				return;
			}
		}

		// 进行文件上传
		String strOSSCat = OSSCAT_DYNAMODEL;
		net.ibizsys.runtime.util.domain.File ossFile = this.getSysFileUtilRuntime().createOSSFile(tempFile, strOSSCat);
		strMD5Code = String.format("%1$s|%2$s", strFileHashCode, ossFile.getOSSId());

		// 局部更新
		SystemDTO systemDTO2 = new SystemDTO();
		systemDTO2.setPSSystemId(systemDTO.getPSSystemId());
		systemDTO2.setMD5Check(strMD5Code);
		EBSXSystemRuntime.getInstance().getSystemService().update(systemDTO2);

		//
		systemDTO.setMD5Check(strMD5Code);

		systemDTO.set("modeldigest", strFileHashCode);
		systemDTO.set("modelossid", ossFile.getOSSId());
		systemDTO.set("modelossname", String.format("%1$s.zip", systemDTO.getPSSystemId()));

		// 写入系统配置版本
		try {
			String strConfigId = String.format("%1$s%2$s-ver", NacosServiceHubSettingBase.DATAID_DEPLOYSYSTEM_PREFIX, systemDTO.getPSSystemId());
			Map<String, Object> map = new LinkedHashMap<String, Object>();
			map.put("modeldigest", strFileHashCode);
			map.put("modelossid", ossFile.getOSSId());
			ServiceHub.getInstance().publishConfig(strConfigId, map);
		} catch (Throwable ex) {
			log.error(String.format("更新系统配置版本发生异常，%1$s", ex.getMessage()), ex);
		}

	}

	// protected SystemDTO getSystem(String strSystemId) throws Throwable {
	//
	// }
	/**
	 * 获取指定标识系统，没有则新建
	 *
	 * @param strSystemId
	 * @return
	 * @throws Throwable
	 */
	protected SystemDTO getSystemIf(String strSystemId, boolean bCreateIf) throws Throwable {

		SystemDTO systemDTO = this.onGetSystem(strSystemId, bCreateIf);
		if (systemDTO != null) {
			if (!StringUtils.hasLength(systemDTO.getSysModel()) && !StringUtils.hasLength(systemDTO.getRemoteSysModel())) {
				// 未指定模型地址，尝试从nacos中获取系统信息
				String strConfigId = String.format("systemsource-%1$s", strSystemId);
				String strConfig = ServiceHub.getInstance().getConfig(strConfigId);
				if (StringUtils.hasLength(strConfig)) {
					ConfigEntity configEntity = new ConfigEntity(strConfig);

					String strGitPath = configEntity.getString("gitpath", null);
					if (StringUtils.hasLength(strGitPath)) {
						// 去除.git
						systemDTO.setRemoteSysModel(strGitPath.substring(0, strGitPath.length() - 4));
						// 置空模型目录，重新计算
						systemDTO.setRemoteSysModelPath(null);

						// 设置Git分支，用户名及密码等
						String strGitUserName = configEntity.getString("gitusername", null);
						String strGitPassword = configEntity.getString("gitpassword", null);
						String strGitBranch = configEntity.getString("gitbranch", null);

						systemDTO.setRemoteSysModelUser(strGitUserName);
						systemDTO.setRemoteSysModelPwd(strGitPassword);
						systemDTO.setRemoteSysModelBranch(strGitBranch);
					} else {
						String strOSSFileId = configEntity.getString("modelossid", null);
						if (StringUtils.hasLength(strOSSFileId)) {
							// 上传文件
							String strOSSCat = OSSCAT_DYNAMODEL;
							net.ibizsys.runtime.util.domain.File ossFile = this.getSysFileUtilRuntime().getOSSFile(strOSSFileId, strOSSCat, true);
							if (ossFile == null) {
								ossFile = this.getSysFileUtilRuntime().getOSSFile(strOSSFileId, null, true);
								if (ossFile == null) {
									throw new Exception(String.format("系统[%1$s]指定模型文件[%2$s]不存在", strSystemId, strOSSFileId));
								}
							}

							File dynaModelFolder = null;
							String strFolder = KeyValueUtils.genUniqueId(strSystemId, strOSSFileId).toLowerCase();
							if (StringUtils.hasLength(this.getDynaModelPath())) {
								dynaModelFolder = new File(this.getDynaModelPath() + File.separator + strFolder.substring(0, 2) + File.separator + strFolder);
							} else {
								Path pathTempDirectory = Files.createTempDirectory("model");
								dynaModelFolder = pathTempDirectory.toFile();
							}

							// 解压缩
							// 判断文件是否存在
							File systemModelFile = new File(dynaModelFolder.getAbsolutePath() + File.separator + "PSSYSTEM.json");
							if (!systemModelFile.exists()) {
								ZipUtils.unzip(new File(ossFile.getLocalPath()), dynaModelFolder);
							}
							systemDTO.setSysModel(dynaModelFolder.getAbsolutePath());
							//写入摘要信息
							String strFileHashCode = "";
							try (FileInputStream fis = new FileInputStream(new File(ossFile.getLocalPath()))) {
								strFileHashCode = DigestUtils.md5DigestAsHex(fis);
							}
							systemDTO.set("modeldigest", strFileHashCode);
							systemDTO.set("modelossid", strOSSFileId);
							systemDTO.set("modelossname", String.format("%1$s.zip", systemDTO.getPSSystemId()));	
							systemDTO.set(TAG_IGNOREUPDATEMODELOSS, "true");	
						}
						else {
							String strLocalPath = configEntity.getString("localpath", null);
							if (StringUtils.hasLength(strLocalPath)) {
								systemDTO.setSysModel(strLocalPath);
							}
						}
					}
				}
			}
		}
		return systemDTO;
	}

	protected SystemDTO onGetSystem(String strSystemId, boolean bCreateIf) throws Throwable {
		SystemDTO systemDTO = EBSXSystemRuntime.getInstance().getSystemService().get(strSystemId, true);
		if (systemDTO != null) {
			return systemDTO;
		}

		if (bCreateIf) {
			systemDTO = new SystemDTO();
			systemDTO.setPSSystemId(strSystemId).setPSSystemName(strSystemId);
			EBSXSystemRuntime.getInstance().getSystemService().create(systemDTO);
		}
		return systemDTO;
	}

	/**
	 * 获取指定标识系统，没有则新建
	 *
	 * @param strSystemId
	 * @return
	 * @throws Throwable
	 */
	protected DCSystemDTO getDCSystem(SystemDTO systemDTO, String strDevCenterId) throws Throwable {

		SearchContextDTO searchContextDTO = new SearchContextDTO().limit(1).eq(IDCSystemService.FIELD_SYSTEMID, systemDTO.getPSSystemId()).eq(IDCSystemService.FIELD_SRFDCID, strDevCenterId);

		List<DCSystemDTO> list = EBSXSystemRuntime.getInstance().getDCSystemService().selectDefault(searchContextDTO);
		if (!ObjectUtils.isEmpty(list)) {
			return list.get(0);
		}

		DCSystemDTO dcSystemDTO = new DCSystemDTO();
		dcSystemDTO.setSystemId(systemDTO.getPSSystemId());
		dcSystemDTO.setSystemName(systemDTO.getPSSystemName());
		dcSystemDTO.setSrfdcid(strDevCenterId);
		dcSystemDTO.setDCSystemName(systemDTO.getPSSystemName());

		// 判断是否默认中心，默认中心使用System标识
		if (StringUtils.hasLength(this.getDevCenterId()) && this.getDevCenterId().equals(strDevCenterId)) {
			// 判断默认标识是否已经使用
			if (EBSXSystemRuntime.getInstance().getDCSystemService().get(systemDTO.getPSSystemId(), true) == null) {
				dcSystemDTO.setDCSystemId(systemDTO.getPSSystemId());
			}
		}

		EBSXSystemRuntime.getInstance().getDCSystemService().create(dcSystemDTO);
		return dcSystemDTO;

	}

	/**
	 * 获取指定标识系统，没有则新建
	 *
	 * @param strSystemId
	 * @return
	 * @throws Throwable
	 */
	protected DynaInstDTO getDynaInst(DCSystemDTO dcSystemDTO) throws Throwable {

		DynaInstDTO dynaInstDTO = EBSXSystemRuntime.getInstance().getDynaInstService().selectOne(new SearchContextDTO().eq(IDynaInstService.FIELD_DCSYSTEMID, dcSystemDTO.getDCSystemId()).eq(IDynaInstService.FIELD_ISVALID, 1).eq(IDynaInstService.FIELD_INTERNALINST, 1).eq(IDynaInstService.FIELD_DEFAULTINST, 1).eq(IDynaInstService.FIELD_SRFDCID, dcSystemDTO.getSrfdcid()), true);

		if (dynaInstDTO == null) {
			dynaInstDTO = new DynaInstDTO();
			// 建立之后同时建立默认动态实例及模型
			dynaInstDTO.setDynaInstName(String.format("默认实例[%1$s]", dcSystemDTO.getDCSystemName()));
			dynaInstDTO.setDCSystemId(dcSystemDTO.getDCSystemId());
			dynaInstDTO.setSystemId(dcSystemDTO.getSystemId());
			dynaInstDTO.setInternalInst(1);
			dynaInstDTO.setIsValid(1);
			dynaInstDTO.setSrfdcid(dcSystemDTO.getSrfdcid());
			dynaInstDTO.setDefaultInst(1);

			EBSXSystemRuntime.getInstance().getDynaInstService().create(dynaInstDTO);
		}
		return dynaInstDTO;
	}

	/**
	 * 获取指定标识系统，没有则新建
	 *
	 * @param strSystemId
	 * @return
	 * @throws Throwable
	 */
	protected MetaDynaModelDTO getMetaDynaModelDTO(DCSystemDTO dcSystemDTO, DynaInstDTO dynaInstDTO, IPSSystemService iPSSystemService) throws Throwable {

		// 判断是否已经完成上传操作
		String strFileHashCode = dcSystemDTO.getString("modeldigest", null);
		String strModelOSSId = dcSystemDTO.getString("modelossid", null);
		String strModelOSSName = dcSystemDTO.getString("modelossname", null);

		File tempFile = null;
		if (!StringUtils.hasLength(strFileHashCode)) {
			// 建立模型压缩文件
			tempFile = File.createTempFile("model_" + dcSystemDTO.getDCSystemId(), ".zip");
			ZipUtils.zip(new File(iPSSystemService.getPSModelFolderPath()), tempFile);
			try (FileInputStream fis = new FileInputStream(tempFile)) {
				strFileHashCode = DigestUtils.md5DigestAsHex(fis);
			}
		}

		String strConfigId = KeyValueUtils.genUniqueId(dynaInstDTO.getDynaInstId(), strFileHashCode);
		// 判断指定数据是否存在
		MetaDynaModelDTO metaDynaModelDTO = EBSXSystemRuntime.getInstance().getMetaDynaModelService().get(strConfigId, true);
		if (metaDynaModelDTO != null) {
			// 判断动态实例是否相同
			if (dynaInstDTO.getDynaInstId().equals(metaDynaModelDTO.getSysDynaInstId())) {
				// 相同实体，判断状态
				return metaDynaModelDTO;
			}
			strConfigId = KeyValueUtils.genUniqueId();
			metaDynaModelDTO = null;
		}

		ObjectNode cfgNode = JsonUtils.createObjectNode();
		if (!StringUtils.hasLength(strModelOSSId)) {
			// 进行文件上传
			String strOSSCat = OSSCAT_DYNAMODEL;
			net.ibizsys.runtime.util.domain.File ossFile = this.getSysFileUtilRuntime().createOSSFile(tempFile, strOSSCat);

			cfgNode.put("digest", strFileHashCode);
			cfgNode.put("id", ossFile.getOSSId());
			cfgNode.put("name", tempFile.getName());
		} else {
			cfgNode.put("digest", strFileHashCode);
			cfgNode.put("id", strModelOSSId);
			cfgNode.put("name", strModelOSSName);
		}

		ArrayNode arrayNode = JsonUtils.createArrayNode();
		arrayNode.add(cfgNode);

		String strModelFile = JsonUtils.toString(arrayNode);

		// 判断是否有默认
		metaDynaModelDTO = EBSXSystemRuntime.getInstance().getMetaDynaModelService().selectOne(new SearchContextDTO().eq(IMetaDynaModelService.FIELD_SYSDYNAINSTID, dynaInstDTO.getDynaInstId()).eq(IMetaDynaModelService.FIELD_STATUS, "1").eq(IMetaDynaModelService.FIELD_SRFDCID, dcSystemDTO.getSrfdcid()).nvl(IMetaDynaModelService.FIELD_PDYNAINSTID), true);
		if (metaDynaModelDTO == null) {
			// 建立默认
			metaDynaModelDTO = new MetaDynaModelDTO();
			metaDynaModelDTO.setConfigId(KeyValueUtils.genUniqueId());
			metaDynaModelDTO.setConfigName(String.format("默认配置[%1$s]", dcSystemDTO.getDCSystemName()));
			metaDynaModelDTO.setSysDynaInstId(dynaInstDTO.getDynaInstId());
			metaDynaModelDTO.setSysDynaInstName(dynaInstDTO.getDynaInstName());
			metaDynaModelDTO.setStatus("1");
			metaDynaModelDTO.setSrfdcid(dcSystemDTO.getSrfdcid());
			EBSXSystemRuntime.getInstance().getMetaDynaModelService().create(metaDynaModelDTO);
		}

		metaDynaModelDTO = null;
		metaDynaModelDTO = new MetaDynaModelDTO();
		metaDynaModelDTO.setConfigId(strConfigId);
		String strDateTimeString = String.format("%1$tY%1$tm%1$td%1$tH%1$tM%1$tS", new java.sql.Timestamp(System.currentTimeMillis()));
		metaDynaModelDTO.setConfigName(String.format("配置[%1$s][%2$s]", dcSystemDTO.getDCSystemName(), strDateTimeString));
		metaDynaModelDTO.setSysDynaInstId(dynaInstDTO.getDynaInstId());
		metaDynaModelDTO.setSysDynaInstName(dynaInstDTO.getDynaInstName());
		metaDynaModelDTO.setModelFile(strModelFile);
		metaDynaModelDTO.setStatus("0");
		metaDynaModelDTO.setSrfdcid(dcSystemDTO.getSrfdcid());
		EBSXSystemRuntime.getInstance().getMetaDynaModelService().create(metaDynaModelDTO);

		return metaDynaModelDTO;
	}

	protected void syncSystemModel(SystemDTO systemDTO, IPSSystemService iPSSystemService, String strSysType, Map<String, Object> params) throws Throwable {

		Object value = systemDTO.get(TAG_IGNOREUPDATEMODELOSS);
		if(value == null || (!value.toString().equalsIgnoreCase("true"))){
			updateSystemModelDigest(systemDTO, iPSSystemService, params);
		}
		

		if (strSysType.equals(DevSysTypes.DEVSYS) || strSysType.equals(DevSysTypes.DEVSYS_APP)) {
			this.installPSApplications(systemDTO, iPSSystemService, params);
		}

		if (strSysType.equals(DevSysTypes.DEVSYS) || strSysType.equals(DevSysTypes.DEVSYS_SVR)) {
			this.installPSSysDBSchemes(systemDTO, iPSSystemService, params);
		}

	}

	protected void installPSApplications(SystemDTO systemDTO, IPSSystemService iPSSystemService, Map<String, Object> params) throws Throwable {

		IPSSystem iPSSystem = iPSSystemService.getPSSystem();
		String strServiceId = (String) params.get("serviceid");
		if (!StringUtils.hasLength(strServiceId)) {
			strServiceId = iPSSystem.getDeploySysTag2();
			// strServiceId = iPSSystem.getd.getPSSystemId();
		}
		if (!StringUtils.hasLength(strServiceId)) {
			strServiceId = systemDTO.getPSSystemId();
		}

		// 查出当前系统应用
		Map<String, ApplicationDTO> applicationDTOMap = new HashMap<String, ApplicationDTO>();
		List<ApplicationDTO> applicationDTOList = EBSXSystemRuntime.getInstance().getApplicationService().selectDefault(new SearchContextDTO().all().eq(IApplicationService.FIELD_SYSTEMID, systemDTO.getPSSystemId()));
		if (!ObjectUtils.isEmpty(applicationDTOList)) {
			applicationDTOList.forEach(t -> applicationDTOMap.put(t.getCodeName().toLowerCase(), t));
		}

		java.util.List<IPSApplication> psApplicationList = iPSSystem.getAllPSApps();
		if (!ObjectUtils.isEmpty(psApplicationList)) {
			for (IPSApplication iPSApplication : psApplicationList) {

				String strAppWFs = null;
				List<IPSAppWF> list = iPSApplication.getAllPSAppWFs();
				if (!ObjectUtils.isEmpty(list)) {
					Map<String, IPSAppWF> psAppWFMap = new TreeMap<String, IPSAppWF>();
					for (IPSAppWF iPSAppWF : list) {
						if (!StringUtils.hasLength(iPSAppWF.getCodeName())) {
							continue;
						}
						psAppWFMap.put(iPSAppWF.getCodeName().toLowerCase(), iPSAppWF);
					}

					if (!ObjectUtils.isEmpty(psAppWFMap)) {
						strAppWFs = StringUtils.collectionToDelimitedString(psAppWFMap.keySet(), ";");
					}
				}

				ApplicationDTO applicationDTO = applicationDTOMap.get(iPSApplication.getCodeName().toLowerCase());
				if (applicationDTO == null) {
					applicationDTO = new ApplicationDTO();
					applicationDTO.setPSSystemAppId(KeyValueUtils.genUniqueId(systemDTO.getPSSystemId(), iPSApplication.getCodeName().toLowerCase()));
					applicationDTO.setPSSystemAppName(iPSApplication.getName());
					applicationDTO.setSystemId(systemDTO.getPSSystemId());
					applicationDTO.setCodeName(iPSApplication.getCodeName());
					applicationDTO.setMobileApp(iPSApplication.isMobileApp() ? 1 : 0);
					applicationDTO.setAppCategory("200");
					applicationDTO.setServiceId(strServiceId);
					applicationDTO.setAppWFs(strAppWFs);
					// 计算默认视图
					if (iPSApplication.getDefaultPSAppIndexView() != null) {
						if (StringUtils.hasLength(iPSApplication.getDefaultPSAppIndexView().getCodeName())) {
							applicationDTO.setIndexCodeName(iPSApplication.getDefaultPSAppIndexView().getCodeName().toLowerCase());
						}
					}
					// [{"formattype":"APPDEVIEW","formattempl":"/${indexView}/${appDataEntity}/views/${appView}"},{"formattype":"APPVIEW","formattempl":"/${indexView}/views/${appView}"},{"formattype":"WFGLOBALREDIRECT","formattempl":"appredirectview?processDefinitionKey=${processDefinitionKey};taskDefinitionKey=${taskDefinitionKey};srfwf=${srfwf};srftaskid=${srftaskid};srfdcsystem=${srfdcsystem};srfdename=${srfdename};srfindexname=${srfindexname};${srfdename}=${srfkey};srffullscreen=true"},{"formattype":"TODOGLOBALREDIRECT","formattempl":"appredirectview?processDefinitionKey=${processDefinitionKey};taskDefinitionKey=${taskDefinitionKey};srfwf=${srfwf};srftaskid=${srftaskid};srfdcsystem=${srfdcsystem};srfdename=${srfdename};srfindexname=${srfindexname};${srfdename}=${srfkey};srffullscreen=true"}]
					applicationDTO.setViewPathFormat("[{\"formattype\":\"APPDEVIEW\",\"formattempl\":\"/${indexView}/${appDataEntity}/views/${appView}\"},{\"formattype\":\"APPVIEW\",\"formattempl\":\"/${indexView}/views/${appView}\"},{\"formattype\":\"WFGLOBALREDIRECT\",\"formattempl\":\"appredirectview?processDefinitionKey=${processDefinitionKey};taskDefinitionKey=${taskDefinitionKey};srfwf=${srfwf};srftaskid=${srftaskid};srfdcsystem=${srfdcsystem};srfdename=${srfdename};srfindexname=${srfindexname};${srfdename}=${srfkey};srffullscreen=true\"},{\"formattype\":\"TODOGLOBALREDIRECT\",\"formattempl\":\"appredirectview?processDefinitionKey=${processDefinitionKey};taskDefinitionKey=${taskDefinitionKey};srfwf=${srfwf};srftaskid=${srftaskid};srfdcsystem=${srfdcsystem};srfdename=${srfdename};srfindexname=${srfindexname};${srfdename}=${srfkey};srffullscreen=true\"}]");
					try {
						EBSXSystemRuntime.getInstance().getApplicationService().create(applicationDTO);
					} catch (Throwable ex) {
						throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("建立系统应用数据发生异常， %1$s", ex.getMessage()), ex);
					}
				} else {
					if (!strServiceId.equals(applicationDTO.getServiceId()) || (DataTypeUtils.compare(DataTypes.VARCHAR, strAppWFs, applicationDTO.getAppWFs()) != 0)) {

						ApplicationDTO applicationDTO2 = new ApplicationDTO();
						applicationDTO2.setPSSystemAppId(applicationDTO.getPSSystemAppId());
						applicationDTO2.setServiceId(strServiceId);
						applicationDTO2.setAppWFs(strAppWFs);

						try {
							EBSXSystemRuntime.getInstance().getApplicationService().update(applicationDTO2);
						} catch (Throwable ex) {
							throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("更新系统应用数据发生异常， %1$s", ex.getMessage()), ex);
						}
					}
				}
			}
		}
	}

	protected void installPSSysDBSchemes(SystemDTO systemDTO, IPSSystemService iPSSystemService, Map<String, Object> params) throws Throwable {

		// 发布默认
		this.installPSSysDBScheme(null, systemDTO, iPSSystemService, params);

		IPSSystem iPSSystem = iPSSystemService.getPSSystem();
		// 查出当前系统应用
		List<IPSSysDBScheme> psSysDBSchemes = iPSSystem.getAllPSSysDBSchemes();
		if (ObjectUtils.isEmpty(psSysDBSchemes)) {
			return;
		}

		for (IPSSysDBScheme iPSSysDBScheme : psSysDBSchemes) {
			if (iPSSysDBScheme.getPSSysModelGroup() != null) {
				// 不处理模型组
				continue;
			}

			if (iPSSysDBScheme.isExistingModel()) {
				continue;
			}

			this.installPSSysDBScheme(iPSSysDBScheme, systemDTO, iPSSystemService, params);

		}

	}

	protected void installPSSysDBScheme(IPSSysDBScheme iPSSysDBScheme, SystemDTO systemDTO, IPSSystemService iPSSystemService, Map<String, Object> params) throws Throwable {

		String strLiquibaseFolder = "/src/main/resources/liquibase/";
		String strConfigType = "DBSCHEME";

		String strFolder = iPSSystemService.getPSModelFolderPath();
		strFolder = strFolder.replace("\\", "/");
		strFolder = strFolder.replace("/src/main/resources/model/", strLiquibaseFolder);

		IDstConfigService dstConfigService = EBSXSystemRuntime.getInstance().getDstConfigService();

		String strDSLink2 = null;
		File file = null;

		if (iPSSysDBScheme != null) {
			strDSLink2 = iPSSysDBScheme.getDSLink();
			// 尝试获取文件
			String strFile = String.format("%1$s/%2$s/h2_table.xml", strFolder, strDSLink2);
			file = new File(strFile);
			if (!file.exists()) {
				return;
			}
		} else {
			// 默认
			strDSLink2 = "SYSTEM";
			int nPos = strFolder.indexOf(strLiquibaseFolder);
			if (nPos == -1) {
				return;
			}

			String strFile = String.format("%1$sh2_table.xml", strFolder.substring(0, nPos + strLiquibaseFolder.length()));
			file = new File(strFile);
			if (!file.exists()) {
				return;
			}
		}

		String strDSLink = strDSLink2;

		// 提取内容
		String strContent = FileUtils.readFileToString(file, "UTF-8");
		if (!StringUtils.hasLength(strContent)) {
			return;
		}

		// String fileId = DigestUtils.md5DigestAsHex(file);
		String strFileDigest = KeyValueUtils.genUniqueId(strContent);

		String strConfigKey = String.format("%1$s.%2$s", strDSLink, "LAST");
		// 尝试获取数据
		String strKey = KeyValueUtils.genUniqueId(systemDTO.getPSSystemId(), strConfigType, strConfigKey, "SYSTEM");
		DstConfigDTO dstConfigDTO = dstConfigService.get(strKey, true);
		if (dstConfigDTO != null) {
			if (StringUtils.hasLength(dstConfigDTO.getCfg())) {
				ObjectNode objectNode = JsonUtils.toObjectNode(dstConfigDTO.getCfg());
				JsonNode digestNode = objectNode.get("digest");
				if (digestNode != null && !digestNode.isNull()) {
					if (strFileDigest.equals(digestNode.asText())) {
						// 摘要一致，忽略
						return;
					}
				}
			}
		}

		// 上传文件
		String strOSSCat = String.format("devops-%1$s", strConfigType).toLowerCase();
		net.ibizsys.runtime.util.domain.File ossFile = this.getSysFileUtilRuntime().createOSSFile(file, strOSSCat);
		ObjectNode cfgNode = JsonUtils.createObjectNode();
		cfgNode.put("fileid", ossFile.getOSSId());
		cfgNode.put("digest", strFileDigest);

		// 建立快照
		dstConfigService.rawExecute(new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {

				// 建立快照
				if (true) {
					String strSnapshotKey = String.format("%1$s.%2$s-%3$s", strDSLink, "SNAPSHOT", String.format("%1$tY%1$tm%1$td%1$tH%1$tM%1$tS", new Date()));
					String strKey2 = KeyValueUtils.genUniqueId(systemDTO.getPSSystemId(), strConfigType, strSnapshotKey, "SYSTEM");
					DstConfigDTO dstConfigDTO2 = new DstConfigDTO();
					dstConfigDTO2.setSystemId(systemDTO.getPSSystemId());
					dstConfigDTO2.setCfgType(strConfigType);
					dstConfigDTO2.setTargetType(strSnapshotKey);
					dstConfigDTO2.setUserId("SYSTEM");
					dstConfigDTO2.setCfg(cfgNode.toString());
					dstConfigDTO2.setCfgId(strKey2);

					dstConfigService.create(dstConfigDTO2);
				}

				if (true) {
					String strSnapshotKey = String.format("%1$s.%2$s", strDSLink, "LAST");
					String strKey2 = KeyValueUtils.genUniqueId(systemDTO.getPSSystemId(), strConfigType, strSnapshotKey, "SYSTEM");
					DstConfigDTO dstConfigDTO2 = new DstConfigDTO();
					dstConfigDTO2.setSystemId(systemDTO.getPSSystemId());
					dstConfigDTO2.setCfgType(strConfigType);
					dstConfigDTO2.setTargetType(strSnapshotKey);
					dstConfigDTO2.setUserId("SYSTEM");
					dstConfigDTO2.setCfg(cfgNode.toString());
					dstConfigDTO2.setCfgId(strKey2);
					if (dstConfigDTO == null) {
						dstConfigService.create(dstConfigDTO2);
					} else {
						dstConfigService.update(dstConfigDTO2);
					}
				}
				return null;
			}
		}, null);
	}

	protected void pubSystemConfig(SystemDTO systemDTO, IPSSystemService iPSSystemService, String strSysType, Map<String, Object> params) throws Throwable {

		IPSSystem iPSSystem = iPSSystemService.getPSSystem();

		// 发布系统示例配置
		if (strSysType.equals(DevSysTypes.DEVSYS) || strSysType.equals(DevSysTypes.DEVSYS_SVR)) {
			pubSystemConfig(iPSSystem, systemDTO, iPSSystemService, params);
		}

		if (strSysType.equals(DevSysTypes.DEVSYS) || strSysType.equals(DevSysTypes.DEVSYS_APP)) {
			java.util.List<IPSApplication> psApplicationList = iPSSystem.getAllPSApps();
			if (!ObjectUtils.isEmpty(psApplicationList)) {
				for (IPSApplication iPSApplication : psApplicationList) {
					pubApplicationConfig(iPSApplication, systemDTO, iPSSystemService, params);
				}
			}

			this.pubAppGatewayConfig(params);
		}

	}

	protected void pubSystemConfig(IPSSystem iPSSystem, SystemDTO systemDTO, IPSSystemService iPSSystemService, Map<String, Object> params) throws Throwable {
		
		String strConfigId = String.format("deploysystem-%1$s", systemDTO.getPSSystemId()).toLowerCase();
		// 无配置时发布
		String strConfig = ServiceHub.getInstance().getConfig(strConfigId);
		if (StringUtils.hasLength(strConfig)) {
			return;		
		}
		
		
		ObjectNode objectNode = JsonUtils.createObjectNode();
		// 放入Class类
//		IPSSysSFPub defaultPSSysSFPub = iPSSystemService.getPSSystem().getDefaultPSSysSFPub();
//		if (defaultPSSysSFPub != null) {
//			objectNode.put("runtimeclassname", String.format("%1$s.runtime.%2$s", defaultPSSysSFPub.getPKGCodeName(), "SystemRuntime"));
//		}
		objectNode.put("updatedbschema", true);
		
		ObjectNode settings = objectNode.putObject("settings");
		ObjectNode sysdbscheme = settings.putObject("sysdbscheme");
		List<IPSSysDBScheme> psSysDBSchemeList = iPSSystemService.getPSSystem().getAllPSSysDBSchemes();
		if (!ObjectUtils.isEmpty(psSysDBSchemeList)) {
			for (IPSSysDBScheme iPSSysDBScheme : psSysDBSchemeList) {
				if (iPSSysDBScheme.getPSSysModelGroup() != null) {
					continue;
				}
				ObjectNode dsnode = sysdbscheme.putObject(iPSSysDBScheme.getDSLink().toLowerCase());
				dsnode.put("datasource", String.format("%1$s__%2$s", iPSSystemService.getPSSystem().getName(), iPSSysDBScheme.getDSLink()).toLowerCase());
			}
		}

		Map map = JsonUtils.MAPPER.convertValue(objectNode, Map.class);
		ServiceHub.getInstance().publishConfig(strConfigId, map);
	}

	protected void pubApplicationConfig(IPSApplication iPSApplication, SystemDTO systemDTO, IPSSystemService iPSSystemService, Map<String, Object> params) throws Throwable {

		// 仅发布不支持动态系统的应用
		if (iPSApplication.getDynaSysMode() != DynaSysMode.DISABLED.value) {
			return;
		}

		String strServiceId = (String) params.get("serviceid");
		if (!StringUtils.hasLength(strServiceId)) {
			strServiceId = systemDTO.getPSSystemId();
		}

		strServiceId = strServiceId.toLowerCase();

		ObjectNode objectNode = GatewayUtils.getAppGatewayNode(systemDTO.getPSSystemId(), strServiceId, iPSApplication);
		String strConfigId = String.format("deployapp-%1$s-%2$s", systemDTO.getPSSystemId(), iPSApplication.getCodeName()).toLowerCase();
		ServiceHub.getInstance().publishConfig(strConfigId, objectNode);

	}

	protected void pubAppGatewayConfig(Map<String, Object> params) throws Throwable {
		String strAppGateway = (String) params.get("appgateway");
		if (!StringUtils.hasLength(strAppGateway)) {
			strAppGateway = this.getAppGatewayId();
		}
		if (!StringUtils.hasLength(strAppGateway)) {
			log.warn(String.format("未指定应用网关，无法更新应用网关配置"));
			return;
		}

		ObjectNode objectNode = JsonUtils.createObjectNode();
		ArrayNode deployapps = objectNode.putArray("deployapps");
		
		Map<String, String> keyMap = new HashMap<String, String>();
		// 查出当前系统应用
		List<ApplicationDTO> applicationDTOList = EBSXSystemRuntime.getInstance().getApplicationService().selectDefault(new SearchContextDTO().all().nn(IApplicationService.FIELD_SERVICEID).sort("codename"));
		if(!ObjectUtils.isEmpty(applicationDTOList)) {
			for (ApplicationDTO applicationDTO : applicationDTOList) {
				deployapps.add(String.format("%1$s-%2$s", applicationDTO.getSystemId(), applicationDTO.getCodeName()).toLowerCase());
				keyMap.put(String.format("%1$s-%2$s", applicationDTO.getSystemId(), applicationDTO.getCodeName()).toLowerCase(), "");
			}
		}

		// 补充网关默认扩展
		deployapps.add(String.format("%1$s-ex", strAppGateway).toLowerCase());

		List<SystemDTO> systemDTOList = EBSXSystemRuntime.getInstance().getSystemService().selectDefault(new SearchContextDTO().all().sort(SystemDTO.FIELD_PSSYSTEMID));
		if(!ObjectUtils.isEmpty(systemDTOList)) {
			for(SystemDTO systemDTO : systemDTOList) {
				if(systemDTO.getPSSystemId().length()<=20) {
					String strKey = String.format("%1$s-%2$s", systemDTO.getPSSystemId(), "apigateway").toLowerCase();
					if(!keyMap.containsKey(strKey)) {
						deployapps.add(strKey);
					}
				}
			}
		}
		
		Map map = JsonUtils.MAPPER.convertValue(objectNode, Map.class);
		String strConfigId = String.format("appgateway-%1$s", strAppGateway).toLowerCase();
		ServiceHub.getInstance().publishConfig(strConfigId, map);
	}

	protected void syncDCSystemModel(DCSystemDTO dcSystemDTO, DynaInstDTO dynaInstDTO, IPSSystemService iPSSystemService, String strSysType, boolean bMust, Map<String, Object> params) throws Throwable {

		IPSSystem iPSSystem = iPSSystemService.getPSSystem();
		IEmployeeContext lastEmployeeContext = EmployeeContext.getCurrentMust();
		Employee employee = new Employee();
		employee.setUserId(lastEmployeeContext.getUserid());
		employee.setPersonName(lastEmployeeContext.getUsername());
		employee.setDCSystemId(dcSystemDTO.getDCSystemId());
		employee.setSrfdcid(dcSystemDTO.getSrfdcid());

		IEmployeeContext iEmployeeContext = new EmployeeContext(employee, null, dcSystemDTO.getSystemId());
		EmployeeContext.setCurrent(iEmployeeContext);
		try {

			MetaDynaModelDTO metaDynaModelDTO = getMetaDynaModelDTO(dcSystemDTO, dynaInstDTO, iPSSystemService);
			if (bMust || !"1".equals(metaDynaModelDTO.getStatus())) {
				this.publishDynaModel(metaDynaModelDTO.getConfigId(), params);
			} else {
				this.getSystemRuntime().log(LogLevels.WARN, LogCats.DEPLOY_PUBLISHDYNAMODEL, String.format("动态实例模型[%1$s]已激活，忽略发布操作", metaDynaModelDTO.getConfigId()), null);
			}

			// installDefaultDynaInst(et, iPSSystem, sysDCSystemId);
			//
			// //同步系统结构，用于dst
			// if (Boolean.valueOf(enableSysModel)) {
			// sysStructSyncService.installSysStructure(sysPSSystem);
			// installPSDEField(et, iPSSystem);
			// installPSDERS(et, iPSSystem);
			// installDataSource(et, iPSSystem);
			// }
		} catch (Throwable ex) {

			this.getSystemRuntime().log(LogLevels.ERROR, this.getLogCat(), String.format("系统模型部署发生异常，%1$s", ex.getMessage()), null);

			throw ex;

		} finally {

			EmployeeContext.setCurrent(lastEmployeeContext);
		}

	}

	@Override
	protected void onPublishDynaModel(String strDynaModelId, Map<String, Object> params) throws Throwable {

		// 获取机构动态模型（匹配其它用户进入）
		DCMetaDynaModelDTO dcMetaDynaModelDTO = EBSXSystemRuntime.getInstance().getDCMetaDynaModelService().get(strDynaModelId);

		MetaDynaModelDTO metaDynaModelDTO = new MetaDynaModelDTO();
		dcMetaDynaModelDTO.copyTo(metaDynaModelDTO, true);
		metaDynaModelDTO.setSrfdcid(EmployeeContext.getCurrentMust().getTenant());
		// 强行修改状态，支持重新发布
		metaDynaModelDTO.setStatus("0");
		publishDynaModel(metaDynaModelDTO, params);
	}

	/**
	 * 发布动态模型
	 *
	 * @param metaDynaModelDTO
	 * @throws Throwable
	 */
	protected void publishDynaModel(MetaDynaModelDTO metaDynaModelDTO, Map<String, Object> params) throws Throwable {

		if ("1".equals(metaDynaModelDTO.getStatus())) {
			this.getSystemRuntime().log(LogLevels.WARN, LogCats.DEPLOY_PUBLISHDYNAMODEL, String.format("动态配置[%1$s]已经激活，无法再次发布", metaDynaModelDTO.getConfigName()), null);
			return;
		}

		// 下载配置
		String strModelFile = metaDynaModelDTO.getModelFile();
		if (!StringUtils.hasLength(strModelFile)) {
			throw new Exception(String.format("动态配置[%1$s]未指定模型文件", metaDynaModelDTO.getConfigName()));
		}

		// 下载文件
		ArrayNode arrayNode = JsonUtils.toArrayNode(strModelFile);
		if (arrayNode.size() == 0) {
			throw new Exception(String.format("动态配置[%1$s]模型文件不正确", metaDynaModelDTO.getConfigName()));
		}
		ObjectNode fileNode = (ObjectNode) arrayNode.get(0);
		String strFileId = fileNode.get("id").asText();
		if (!StringUtils.hasLength(strFileId)) {
			throw new Exception(String.format("动态配置[%1$s]未指定模型文件", metaDynaModelDTO.getConfigName()));
		}

		// 上传文件
		String strOSSCat = OSSCAT_DYNAMODEL;
		net.ibizsys.runtime.util.domain.File ossFile = this.getSysFileUtilRuntime().getOSSFile(strFileId, strOSSCat, true);
		if (ossFile == null) {
			ossFile = this.getSysFileUtilRuntime().getOSSFile(strFileId, null, true);
			if (ossFile == null) {
				throw new Exception(String.format("动态配置[%1$s]指定模型文件不存在", metaDynaModelDTO.getConfigName()));
			}
		}

		File dynaModelFolder = null;
		String strFolder = KeyValueUtils.genUniqueId(metaDynaModelDTO.getSysDynaInstId(), strFileId).toLowerCase();
		if (StringUtils.hasLength(this.getDynaModelPath())) {
			dynaModelFolder = new File(this.getDynaModelPath() + File.separator + strFolder.substring(0, 2) + File.separator + strFolder);
		} else {
			Path pathTempDirectory = Files.createTempDirectory("model");
			dynaModelFolder = pathTempDirectory.toFile();
		}

		// 解压缩
		// 判断文件是否存在
		File systemModelFile = new File(dynaModelFolder.getAbsolutePath() + File.separator + "PSSYSTEM.json");
		if (!systemModelFile.exists()) {
			ZipUtils.unzip(new File(ossFile.getLocalPath()), dynaModelFolder);
		}

		IPSSystemService iPSSystemService = getPSSystemService(dynaModelFolder.getAbsolutePath());

		// 获取当前激活
		DynaInstDTO dynaInstDTO = EBSXSystemRuntime.getInstance().getDynaInstService().get(metaDynaModelDTO.getSysDynaInstId());
		DCSystemDTO dcSystemDTO = EBSXSystemRuntime.getInstance().getDCSystemService().get(dynaInstDTO.getDCSystemId());

		MetaDynaModelDTO lastMetaDynaModelDTO = EBSXSystemRuntime.getInstance().getMetaDynaModelService().selectOne(new SearchContextDTO().eq(IMetaDynaModelService.FIELD_SYSDYNAINSTID, metaDynaModelDTO.getSysDynaInstId()).eq(IMetaDynaModelService.FIELD_STATUS, 1).eq(IMetaDynaModelService.FIELD_SRFDCID, metaDynaModelDTO.getSrfdcid()).nvl(IMetaDynaModelService.FIELD_PDYNAINSTID), true);

		if (this.isReuseActiveMetaDynaModel() && lastMetaDynaModelDTO != null) {

			lastMetaDynaModelDTO.setModelFile(strModelFile);
			// 执行安装
			this.installDynaModel(dcSystemDTO, dynaInstDTO, lastMetaDynaModelDTO, iPSSystemService, params);

			// 直接修改默认
			if (!lastMetaDynaModelDTO.getConfigId().equals(metaDynaModelDTO.getConfigId())) {
				MetaDynaModelDTO item = new MetaDynaModelDTO();
				item.setConfigName(metaDynaModelDTO.getConfigName());
				item.setModelFile(strModelFile);
				item.setConfigId(lastMetaDynaModelDTO.getConfigId());
				EBSXSystemRuntime.getInstance().getMetaDynaModelService().update(item);
			}

			return;
		}

		// 执行安装
		this.installDynaModel(dcSystemDTO, dynaInstDTO, metaDynaModelDTO, iPSSystemService, params);

		// ActionSessionManager.getTransactionalUtil().required(iAction, args)
		ActionSessionManager.execute(new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				if (lastMetaDynaModelDTO != null) {
					if (lastMetaDynaModelDTO.getConfigId().equals(metaDynaModelDTO.getConfigId())) {
						return null;
					}

					MetaDynaModelDTO item = new MetaDynaModelDTO();
					item.setStatus("0");
					item.setConfigId(lastMetaDynaModelDTO.getConfigId());
					EBSXSystemRuntime.getInstance().getMetaDynaModelService().update(item);
				}

				MetaDynaModelDTO item = new MetaDynaModelDTO();
				item.setStatus("1");
				item.setConfigId(metaDynaModelDTO.getConfigId());
				EBSXSystemRuntime.getInstance().getMetaDynaModelService().update(item);
				return null;
			}
		}, null, ITransactionalUtil.PROPAGATION_REQUIRED);

	}

	protected void installDynaModel(DCSystemDTO dcSystemDTO, DynaInstDTO dynaInstDTO, MetaDynaModelDTO metaDynaModelDTO, IPSSystemService iPSSystemService, Map<String, Object> params) throws Throwable {

		this.getSystemRuntime().log(LogLevels.INFO, LogCats.DEPLOY_PUBLISHDYNAMODEL, String.format("开始系统模型部署"), null);

		this.getSystemRuntime().log(LogLevels.INFO, LogCats.DEPLOY_PUBLISHDYNAMODEL, String.format("安装实体模型"), null);
		installPSDataEntities(dcSystemDTO, dynaInstDTO, metaDynaModelDTO, iPSSystemService, params);
		this.getSystemRuntime().log(LogLevels.INFO, LogCats.DEPLOY_PUBLISHDYNAMODEL, String.format("安装代码表模型"), null);
		installPSCodelists(dcSystemDTO, dynaInstDTO, metaDynaModelDTO, iPSSystemService, params);
		this.getSystemRuntime().log(LogLevels.INFO, LogCats.DEPLOY_PUBLISHDYNAMODEL, String.format("安装授权资源模型"), null);
		installPSSysUniReses(dcSystemDTO, dynaInstDTO, metaDynaModelDTO, iPSSystemService, params);
		this.getSystemRuntime().log(LogLevels.INFO, LogCats.DEPLOY_PUBLISHDYNAMODEL, String.format("安装后台任务模型"), null);
		installPSSysBackServices(dcSystemDTO, dynaInstDTO, metaDynaModelDTO, iPSSystemService, params);

		// 本来就是注释： installMenu(et, dynaInstDTO, metaDynaModelDTO,
		// iPSSystemService);
		this.getSystemRuntime().log(LogLevels.INFO, LogCats.DEPLOY_PUBLISHDYNAMODEL, String.format("安装系统角色模型"), null);
		installPSSysUserRoles(dcSystemDTO, dynaInstDTO, metaDynaModelDTO, iPSSystemService, params);
		this.getSystemRuntime().log(LogLevels.INFO, LogCats.DEPLOY_PUBLISHDYNAMODEL, String.format("安装应用功能模型"), null);
		installPSAppFuncs(dcSystemDTO, dynaInstDTO, metaDynaModelDTO, iPSSystemService, params);
		this.getSystemRuntime().log(LogLevels.INFO, LogCats.DEPLOY_PUBLISHDYNAMODEL, String.format("安装工作流角色模型"), null);
		installPSWFRoles(dcSystemDTO, dynaInstDTO, metaDynaModelDTO, iPSSystemService, params);
		this.getSystemRuntime().log(LogLevels.INFO, LogCats.DEPLOY_PUBLISHDYNAMODEL, String.format("安装工作流模型"), null);
		installPSWorkflows(dcSystemDTO, dynaInstDTO, metaDynaModelDTO, iPSSystemService, params);

		this.getSystemRuntime().log(LogLevels.INFO, LogCats.DEPLOY_PUBLISHDYNAMODEL, String.format("结束系统模型部署"), null);
	}

	protected IPSSystemService getPSSystemService(String strModelPath) throws Throwable {
		PSModelServiceImpl psModelServiceImpl = new PSModelServiceImpl();
		psModelServiceImpl.setPSModelFolderPath(strModelPath);
		psModelServiceImpl.getPSSystem();
		return psModelServiceImpl;
	}

	protected String getSysModelPath(SystemDTO systemDTO) throws Throwable {
		return this.getSysModelPath(systemDTO, false);
	}

	protected String getSysModelPath(SystemDTO systemDTO, boolean bCache) throws Throwable {

		if (StringUtils.hasLength(systemDTO.getSysModel())) {
			return systemDTO.getSysModel();
		}

		if (!StringUtils.hasLength(systemDTO.getRemoteSysModel())) {
			// 未定义远程仓库信息
			this.getSystemRuntime().log(LogLevels.WARN, LogCats.DEPLOY_PUBLISHSYSTEM, String.format("系统[%1$s]未定义远程模型仓库地址，忽略同步", systemDTO.getPSSystemId()), null);
			return null;
		}
		String strBranch = systemDTO.getRemoteSysModelBranch();
		if (!StringUtils.hasLength(strBranch)) {
			strBranch = "master";
		}

		if (!StringUtils.hasLength(this.getModelPath())) {
			throw new Exception("未定义模型存储路径");
		}

		String[] items = systemDTO.getRemoteSysModel().split("[/]");
		String strFolder = items[items.length - 1];
		String strPath = String.format("%1$s%2$s%3$s%2$s%4$s%2$s%5$s", this.getModelPath(), File.separator, "systemmodel", systemDTO.getPSSystemId(), strFolder);
		File file = new File(strPath);
		if (file.exists() && bCache) {

		} else {
			String strGitUserName = systemDTO.getRemoteSysModelUser();
			String strGitPassword = systemDTO.getRemoteSysModelPwd();
			if (!StringUtils.hasLength(strGitUserName)) {
				strGitUserName = this.getGitUserName();
				strGitPassword = this.getGitPassword();
			}

			this.getSystemRuntime().log(LogLevels.INFO, LogCats.DEPLOY_PUBLISHSYSTEM, String.format("开始同步系统模型[%1$s]", systemDTO.getRemoteSysModel()), null);

			try {

				if (file.exists()) {
					try (FileRepository fr = new FileRepository(new File(String.format("%1$s%2$s.git", strPath, File.separator))); Git git = new Git(fr)) {
						PullCommand pullCommand = git.pull().setRemoteBranchName(strBranch);
						// if (StringUtils.hasLength(strGitUserName) &&
						// StringUtils.hasLength(strGitPassword)) {
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
					CloneCommand cloneCommand = Git.cloneRepository().setURI(systemDTO.getRemoteSysModel()).setDirectory(file).setBranch(strBranch);
					// if (StringUtils.hasLength(strGitUserName) &&
					// StringUtils.hasLength(strGitPassword)) {
					if (StringUtils.hasLength(strGitUserName)) {
						if (StringUtils.hasLength(strGitPassword)) {
							cloneCommand.setCredentialsProvider(new UsernamePasswordCredentialsProvider(strGitUserName, strGitPassword));
						} else {
							cloneCommand.setCredentialsProvider(new UsernamePasswordCredentialsProvider(strGitUserName, ""));
						}
					}
					cloneCommand.call();
				}
				this.getSystemRuntime().log(LogLevels.INFO, LogCats.DEPLOY_PUBLISHSYSTEM, String.format("结束同步系统模型[%1$s]", systemDTO.getRemoteSysModel()), null);
			} catch (Exception ex) {
				log.error(String.format("获取远程模型失败：%1$s", ex.getMessage()), ex);
				throw new Exception(String.format("获取远程模型失败：%1$s", ex.getMessage()), ex);
			}
		}

		//
		File modelFile = new File(String.format("%1$s%2$sibizmodel.yaml", strPath, File.separator));
		if (modelFile.exists()) {
			// 从配置文件中提取目录
			try {
				Yaml yaml = new Yaml();
				Map config = yaml.loadAs(new FileInputStream(modelFile), Map.class);
				if (config != null) {
					String strModelFolder = (String) config.get("modelfolder");
					if (StringUtils.hasLength(strModelFolder)) {
						return strPath + File.separator + strModelFolder;
					}
				}
			} catch (Throwable ex) {
				log.error(String.format("加载系统模型配置发生异常，%1$s", ex.getMessage()), ex);
				throw new Exception(String.format("加载系统模型配置发生异常，%1$s", ex.getMessage()), ex);
			}
		}

		if (!StringUtils.hasLength(systemDTO.getRemoteSysModelPath())) {
			if (!bCache) {
				this.getSystemRuntime().log(LogLevels.WARN, LogCats.DEPLOY_PUBLISHSYSTEM, String.format("系统[%1$s]未定义模型路径，忽略同步", systemDTO.getPSSystemId()), null);
			}
			return null;
		}

		return file.getParent() + File.separator + systemDTO.getRemoteSysModelPath();
	}

	/**
	 * 初始化系统数据源
	 *
	 * @param et
	 * @param iPSSystem
	 */
	protected void installDataSource(DCSystemDTO et, IPSSystemService iPSSystemService) {
		// DstDataSource dataSource = new DstDataSource();
		// dataSource.setDsId(String.format("%s-master",
		// iEmployeeContext.getSystemid()));
		// dataSource.setDsName(String.format("[%s]主数据源", et.getSystemname()));
		// dataSourceService.save(dataSource);
	}

	/**
	 * 安装实体关系
	 *
	 * @param et
	 * @param iPSSystem
	 */
	private void installPSDERs(DCSystemDTO et, IPSSystemService iPSSystemService, Map<String, Object> params) throws Exception {

		// List<IPSDataEntity> psDataEntities =
		// iPSSystem.getAllPSDataEntities();
		// if (psDataEntities != null) {
		// for (IPSDataEntity psDataEntity : psDataEntities) {
		// Map<String, MetaRelationship> psDERSList = new HashMap<>();
		// //实体主关系
		// if (psDataEntity.getMajorPSDERs() != null) {
		// for (IPSDERBase majorDER : psDataEntity.getMajorPSDERs()) {
		// String strRelationId =
		// KeyValueUtils.genUniqueId(iEmployeeContext.getTenant(),
		// iEmployeeContext.getSystemid(), majorDER.getName());
		// if (psDERSList.containsKey(strRelationId))
		// continue;
		// MetaRelationship major = new MetaRelationship();
		// major.setId(strRelationId);
		// major.setEntityId(KeyValueUtils.genUniqueId(iEmployeeContext.getTenant(),
		// iEmployeeContext.getSystemid(),
		// majorDER.getMinorPSDataEntity().getName()));
		// major.setEntityName(majorDER.getMinorPSDataEntity().getName());
		// major.setRefEntityId(KeyValueUtils.genUniqueId(iEmployeeContext.getTenant(),
		// iEmployeeContext.getSystemid(),
		// majorDER.getMajorPSDataEntity().getName()));
		// major.setRefEntityName(majorDER.getMajorPSDataEntity().getName());
		// major.setCodeName(majorDER.getCodeName());
		// major.setRelationType(majorDER.getDERType());
		// major.setName(majorDER.getName());
		// psDERSList.put(strRelationId, major);
		// }
		// }
		// //实体从关系
		// if (psDataEntity.getMinorPSDERs() != null) {
		// for (IPSDERBase minorDER : psDataEntity.getMinorPSDERs()) {
		// String strRelationId =
		// KeyValueUtils.genUniqueId(iEmployeeContext.getTenant(),
		// iEmployeeContext.getSystemid(), minorDER.getName());
		// if (psDERSList.containsKey(strRelationId))
		// continue;
		// MetaRelationship minor = new MetaRelationship();
		// minor.setId(strRelationId);
		// minor.setEntityId(KeyValueUtils.genUniqueId(iEmployeeContext.getTenant(),
		// iEmployeeContext.getSystemid(),
		// minorDER.getMinorPSDataEntity().getName()));
		// minor.setEntityName(minorDER.getMinorPSDataEntity().getName());
		// minor.setRefEntityId(KeyValueUtils.genUniqueId(iEmployeeContext.getTenant(),
		// iEmployeeContext.getSystemid(),
		// minorDER.getMajorPSDataEntity().getName()));
		// minor.setRefEntityName(minorDER.getMajorPSDataEntity().getName());
		// minor.setCodeName(minorDER.getCodeName());
		// minor.setRelationType(minorDER.getDERType());
		// minor.setName(minorDER.getName());
		// psDERSList.put(strRelationId, minor);
		// }
		// }
		// if (!ObjectUtils.isEmpty(psDERSList))
		// relationshipService.saveOrUpdateBatch(psDERSList.values());
		//
		// }
		// }
	}

	/**
	 * 安装实体属性
	 *
	 * @param et
	 * @param iPSSystem
	 * @throws Exception
	 */
	private void installPSDEFields(DCSystemDTO et, IPSSystemService iPSSystemService, Map<String, Object> params) throws Exception {
		// List<IPSDataEntity> psDataEntities =
		// iPSSystem.getAllPSDataEntities();
		// if (psDataEntities != null) {
		// for (IPSDataEntity psDataEntity : psDataEntities) {
		// int orderValue = 1000;
		// List<MetaField> fieldList = new ArrayList<>();
		// String strEntityId =
		// KeyValueUtils.genUniqueId(iEmployeeContext.getTenant(),
		// iEmployeeContext.getSystemid(), psDataEntity.getName());
		// if (psDataEntity.getAllPSDEFields() != null) {
		// for (IPSDEField defield : psDataEntity.getAllPSDEFields()) {
		// String strFileId =
		// KeyValueUtils.genUniqueId(iEmployeeContext.getTenant(),
		// iEmployeeContext.getSystemid(), psDataEntity.getName(),
		// defield.getName());
		// int showorder = defield.getImportOrder();
		// MetaField field = new MetaField();
		// field.setFieldId(strFileId);
		// field.setFieldName(defield.getName());
		// field.setCodeName(defield.getCodeName());
		// field.setFieldLogicName(defield.getLogicName());
		// field.setEntityId(strEntityId);
		// field.setEntityName(psDataEntity.getName());
		// //field.setRelationId("");
		// //field.setRelationName("");
		// field.setFieldType(defield.getDataType());
		// if (!ObjectUtils.isEmpty(defield.getPSCodeList()))
		// field.setDict(defield.getPSCodeList().getCodeName());
		// field.setNullable(defield.isAllowEmpty() ? 1 : 0);
		// field.setPhysicalField(defield.isPhisicalDEField() ? 1 : 0);
		// field.setDataType(defield.getDataType());
		// field.setDataLength(defield.getLength());
		// field.setDataPreci(defield.getPrecision());
		// field.setPredefined(defield.getPredefinedType());
		// field.setKeyField(defield.isKeyDEField() ? 1 : 0);
		// field.setUnionKey(defield.getUnionKeyValue());
		// field.setShowOrder(ObjectUtils.isEmpty(showorder) ? orderValue :
		// showorder);
		// field.setMajorField(defield.isMajorDEField() ? 1 : 0);
		// fieldList.add(field);
		//
		// orderValue++;
		// }
		// }
		// if (!ObjectUtils.isEmpty(fieldList))
		// fieldService.saveOrUpdateBatch(fieldList);
		// }
		// }
	}

	/**
	 * 安装实体、实体能力相关
	 *
	 * @param et
	 * @param iPSSystem
	 * @throws Exception
	 */
	protected void installPSDataEntities(DCSystemDTO et, DynaInstDTO dynaInstDTO, MetaDynaModelDTO metaDynaModelDTO, IPSSystemService iPSSystemService, Map<String, Object> params) throws Throwable {
		IPSSystem iPSSystem = iPSSystemService.getPSSystem();
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();

		List<MetaEntityDTO> aEntity = new ArrayList<>();
		List<PermissionDTO> aPermission = new ArrayList<>();
		List<PermissionActionDTO> aPermissionAction = new ArrayList<>();

		// 查出当前数据
		Map<String, MetaEntityDTO> lastMetaEntityMap = new HashMap<String, MetaEntityDTO>();
		List<MetaEntityDTO> lastMetaEntityList = EBSXSystemRuntime.getInstance().getMetaEntityService().selectDefault(new SearchContextDTO().all().eq(IMetaEntityService.FIELD_DCSYSTEMID, et.getDCSystemId()));
		if (!ObjectUtils.isEmpty(lastMetaEntityList)) {
			lastMetaEntityList.forEach(t -> {
				lastMetaEntityMap.put(t.getEntityId(), t);
			});
		}

		Map<String, PermissionDTO> lastPermissionMap = new HashMap<String, PermissionDTO>();
		List<PermissionDTO> lastPermissionList = EBSXSystemRuntime.getInstance().getPermissionService().selectDefault(new SearchContextDTO().all().eq(IPermissionService.FIELD_PERMISSIONTYPE, StaticDict.PermissionType.OPPRIV.toString()).eq(IPermissionService.FIELD_DCSYSTEMID, et.getDCSystemId()));
		if (!ObjectUtils.isEmpty(lastPermissionList)) {
			lastPermissionList.forEach(t -> {
				lastPermissionMap.put(t.getPermissionId(), t);
			});
		}

		Map<String, PermissionActionDTO> lastPermissionActionMap = new HashMap<String, PermissionActionDTO>();
		List<PermissionActionDTO> lastPermissionActionList = EBSXSystemRuntime.getInstance().getPermissionActionService().selectCurDCSystem(new SearchContextDTO().all().param("dcsystemid", et.getDCSystemId()));
		if (!ObjectUtils.isEmpty(lastPermissionActionList)) {
			lastPermissionActionList.forEach(t -> {
				lastPermissionActionMap.put(t.getPermissionActionId(), t);
			});
		}

		// 实体 实体角色能力
		List<IPSDataEntity> psDataEntities = iPSSystem.getAllPSDataEntities();
		if (psDataEntities != null) {
			for (IPSDataEntity psDataEntity : psDataEntities) {

				// 要排除带模型组并且同名非模型组实体
				if (psDataEntity.getPSSystemModuleMust().getPSSysModelGroup() != null) {
					if(iPSSystem.getAllPSDataEntities().stream().filter(ipsDataEntity -> (ipsDataEntity.getPSSystemModuleMust().getPSSysModelGroup() == null && ipsDataEntity.getName().equals(psDataEntity.getName()))).count() > 0)
						continue;
				}

				String strEntityId = KeyValueUtils.genUniqueId(iEmployeeContext.getTenant(), iEmployeeContext.getSystemid(), psDataEntity.getName());
				// // 要排除带模型组
				// if (psDataEntity.getPSSystemModuleMust().getPSSysModelGroup()
				// != null) {
				// strEntityId =
				// KeyValueUtils.genUniqueId(iEmployeeContext.getTenant(),
				// iEmployeeContext.getSystemid(),
				// psDataEntity.getPSSystemModuleMust().getPSSysModelGroup().getCodeName().toUpperCase(),
				// psDataEntity.getName());
				// }

				MetaEntityDTO metaEntity = lastMetaEntityMap.get(strEntityId);
				if (metaEntity != null) {
					if (StringUtils.hasLength(psDataEntity.getLogicName()) && !psDataEntity.getLogicName().equals(metaEntity.getLogicName())) {
						metaEntity = null;
					}
				}
				if (metaEntity == null) {
					metaEntity = new MetaEntityDTO();
					metaEntity.setEntityId(strEntityId);
					// metaEntity.setSrfdcid(iEmployeeContext.getTenant());
					metaEntity.setSystemId(iEmployeeContext.getSystemid());
					metaEntity.setEntityName(psDataEntity.getName());
					metaEntity.setDCSystemId(et.getDCSystemId());
					metaEntity.setCodeName(psDataEntity.getCodeName());
					metaEntity.setLogicName(psDataEntity.getLogicName());
					metaEntity.setTableName(psDataEntity.getTableName());
					aEntity.add(metaEntity);
				}

				List<IPSDEUserRole> psDEUserRoles = psDataEntity.getAllPSDEUserRoles();
				if (psDEUserRoles != null) {
					for (IPSDEUserRole psDEUserRole : psDEUserRoles) {
						// 实体默认能力 和 系统保留能力 忽略
						if (psDEUserRole.isDefaultMode() || psDEUserRole.isSystemReserved())
							continue;

						String strPermissionId = KeyValueUtils.genUniqueId(strEntityId, StaticDict.PermissionType.OPPRIV.toString(), psDEUserRole.getRoleTag());
						PermissionDTO sysPermission = lastPermissionMap.get(strPermissionId);
						if (sysPermission != null) {
							if (StringUtils.hasLength(psDEUserRole.getName()) && !psDEUserRole.getName().equals(sysPermission.getPermissionName())) {
								sysPermission = null;
							}
						}
						if (sysPermission == null) {
							sysPermission = new PermissionDTO();
							sysPermission.setPermissionId(strPermissionId);
							// sysPermission.setSrfdcid(iEmployeeContext.getTenant());
							sysPermission.setPSSystemId(iEmployeeContext.getSystemid());
							sysPermission.setEntityId(strEntityId);
							sysPermission.setPermissionTag(psDEUserRole.getRoleTag());
							sysPermission.setPermissionType(StaticDict.PermissionType.OPPRIV.toString());

							// sysPermission.setEnable(1);
							sysPermission.setDCSystemId(et.getDCSystemId());
							sysPermission.setSystemFlag(1);
							sysPermission.setPermissionName(psDEUserRole.getName());
							sysPermission.setIsAllData(psDEUserRole.isAllData() ? 1 : 0);
							sysPermission.setEnableOrgDR(psDEUserRole.isEnableOrgDR() ? 1 : 0);
							sysPermission.setOrgDR(psDEUserRole.getOrgDR());
							sysPermission.setEnableDeptDR(psDEUserRole.isEnableSecDR() ? 1 : 0);
							sysPermission.setDeptDR(psDEUserRole.getSecDR());
							sysPermission.setEnableDeptBC(psDEUserRole.isEnableSecBC() ? 1 : 0);
							sysPermission.setDeptBC(psDEUserRole.getSecBC());
							sysPermission.setBScope(psDEUserRole.getCustomCond());
							aPermission.add(sysPermission);
						}

						java.util.List<IPSDEUserRoleOPPriv> psDEUserRoleOPPrivs = psDEUserRole.getPSDEUserRoleOPPrivs();
						if (psDEUserRoleOPPrivs != null) {
							for (IPSDEUserRoleOPPriv psDEUserRoleOPPriv : psDEUserRoleOPPrivs) {
								String strPermissionActionId = KeyValueUtils.genUniqueId(strPermissionId, psDEUserRoleOPPriv.getName());
								PermissionActionDTO sysPermissionAction = lastPermissionActionMap.get(strPermissionActionId);
								if (sysPermissionAction != null) {
									// if(StringUtils.hasLength(psDEUserRole.getName())
									// &&
									// !psDEUserRole.getName().equals(sysPermission.getPermissionName()))
									// {
									// sysPermission = null;
									// }
								}
								if (sysPermissionAction == null) {
									sysPermissionAction = new PermissionActionDTO();
									sysPermissionAction.setPermissionActionId(strPermissionActionId);

									// sysPermissionAction.setSrfdcid(iEmployeeContext.getTenant());
									sysPermissionAction.setPermissionId(sysPermission.getPermissionId());
									sysPermissionAction.setPermissionActionName(psDEUserRoleOPPriv.getName());
									sysPermissionAction.setSystemFlag(1);
									sysPermissionAction.setOPPriv(psDEUserRoleOPPriv.getDataAccessAction());
									sysPermissionAction.setBScope(psDEUserRoleOPPriv.getCustomCond());
									aPermissionAction.add(sysPermissionAction);
								}
							}
						}
					}
				}
			}

			if (!ObjectUtils.isEmpty(aEntity)) {
				try {
					EBSXSystemRuntime.getInstance().getMetaEntityService().rawSave(aEntity, false);
				} catch (Throwable ex) {
					throw new Exception(String.format("同步实体模型发生异常，%1$s", ex.getMessage()), ex);
				}
			}
			if (!ObjectUtils.isEmpty(aPermission)) {
				try {
					EBSXSystemRuntime.getInstance().getPermissionService().rawSave(aPermission, false);
				} catch (Throwable ex) {
					throw new Exception(String.format("同步权限/资源发生异常，%1$s", ex.getMessage()), ex);
				}
			}
			if (!ObjectUtils.isEmpty(aPermissionAction)) {
				try {
					EBSXSystemRuntime.getInstance().getPermissionActionService().rawCreate(aPermissionAction, false);
				} catch (Throwable ex) {
					throw new Exception(String.format("同步权限操作发生异常，%1$s", ex.getMessage()), ex);
				}
			}

			// metaEntityService.saveOrUpdateBatch(aEntity);
			//
			// sysPermissionService.saveOrUpdateBatch(aPermission);
			//
			// sysPermissionActionService.saveOrUpdateBatch(aPermissionAction);

		}
	}

	/**
	 * 安装代码表
	 *
	 * @param et
	 * @param dynaInstDTO
	 * @param metaDynaModelDTO
	 * @param iPSSystemService
	 * @param params
	 * @throws Throwable
	 */
	protected void installPSCodelists(DCSystemDTO et, DynaInstDTO dynaInstDTO, MetaDynaModelDTO metaDynaModelDTO, IPSSystemService iPSSystemService, Map<String, Object> params) throws Throwable {
		IPSSystem iPSSystem = iPSSystemService.getPSSystem();
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		List<IPSCodeList> psCodeLists = iPSSystem.getAllPSCodeLists();
		if (psCodeLists != null) {
			for (IPSCodeList psCodeList : psCodeLists) {
				if ((CodeListTypes.PREDEFINED.equals(psCodeList.getCodeListType()) && "RUNTIME".equals(psCodeList.getPredefinedType())) || (CodeListTypes.DYNAMIC.equals(psCodeList.getCodeListType()) && "RUNTIME".equals(psCodeList.getPredefinedType()))) {

					if (!EBSXSystemRuntime.getInstance().getDictCatalogService().existsData(new SearchContextDTO().eq(IDictCatalogService.FIELD_CCODE, psCodeList.getCodeName()))) {
						DictCatalogDTO dictCatalog = new DictCatalogDTO();
						// dictCatalog.setSrfdcid(iEmployeeContext.getTenant());
						dictCatalog.setCode(psCodeList.getCodeName());
						// dictCatalog.setCode(psCodeList.getCodeListTag());
						dictCatalog.setName(psCodeList.getName());
						try {
							EBSXSystemRuntime.getInstance().getDictCatalogService().create(dictCatalog);
						} catch (Throwable ex) {
							throw new Exception(String.format("同步字典[%1$s]发生异常，%2$s", psCodeList.getName(), ex.getMessage()), ex);
						}
					}
				}
			}
		}
	}

	/**
	 * 安装系统后台任务
	 *
	 * @param et
	 * @param dynaInstDTO
	 * @param metaDynaModelDTO
	 * @param iPSSystemService
	 * @param params
	 * @throws Throwable
	 */
	protected void installPSSysBackServices(DCSystemDTO et, DynaInstDTO dynaInstDTO, MetaDynaModelDTO metaDynaModelDTO, IPSSystemService iPSSystemService, Map<String, Object> params) throws Throwable {
		IPSSystem iPSSystem = iPSSystemService.getPSSystem();
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		List<IPSSysBackService> psSysBackServices = iPSSystem.getAllPSSysBackServices();
		if (!ObjectUtils.isEmpty(psSysBackServices)) {
			// 判断类型
			Map<String, JobsInfoDTO> jobsInfoMap = new HashMap<String, JobsInfoDTO>();
			// SearchContextDTO searchContextDTO = new
			// SearchContextDTO().limit(1).eq(IJobsRegistryService.FIELD_APP,
			// et.getDCSystemId()).eq(IJobsRegistryService.FIELD_SRFDCID,
			// iEmployeeContext.getTenant());
			// JobsRegistryDTO jobsRegistryDTO =
			// EBSXSystemRuntime.getInstance().getJobsRegistryService().selectOne(searchContextDTO,
			// true);
			// if(jobsRegistryDTO == null) {
			// jobsRegistryDTO = new JobsRegistryDTO();
			// jobsRegistryDTO.setApp(et.getDCSystemId());
			// jobsRegistryDTO.setAppName(et.getDCSystemName());
			// jobsRegistryDTO.setStatus(1);
			// jobsRegistryDTO.setSrfdcid(iEmployeeContext.getTenant());
			// EBSXSystemRuntime.getInstance().getJobsRegistryService().create(jobsRegistryDTO);
			// }
			// 查出全部任务
			List<JobsInfoDTO> list = EBSXSystemRuntime.getInstance().getJobsInfoService().selectDefault(new SearchContextDTO().all().eq(IJobsInfoService.FIELD_APP, et.getDCSystemId()).eq(IJobsInfoService.FIELD_SRFDCID, iEmployeeContext.getTenant()));
			if (!ObjectUtils.isEmpty(list)) {
				for (JobsInfoDTO jobsInfoDTO : list) {
					String strHandler = jobsInfoDTO.getHandler();
					// if(StringUtils.hasLength(strHandler)) {
					// strHandler = strHandler.replace("DeamonJobHandler", "");
					// }
					String strTag = String.format("%1$s|%2$s", jobsInfoDTO.getTaskType(), strHandler).toUpperCase();
					jobsInfoMap.put(strTag, jobsInfoDTO);
				}
			}

			for (IPSSysBackService iPSSysBackService : psSysBackServices) {
				String strTag = String.format("%1$s|%2$sJobHandler", iPSSysBackService.getTaskType(), iPSSysBackService.getCodeName()).toUpperCase();
				if (jobsInfoMap.containsKey(strTag)) {
					continue;
				}
				JobsInfoDTO jobsInfoDTO = new JobsInfoDTO();
				jobsInfoDTO.setApp(et.getDCSystemId());
				jobsInfoDTO.setAppName(et.getDCSystemName());
				jobsInfoDTO.setStatus(1);
				jobsInfoDTO.setSrfdcid(iEmployeeContext.getTenant());
				// jobsInfoDTO.setSrfdcid(et.getSrfdcid());
				jobsInfoDTO.setTaskType(iPSSysBackService.getTaskType());
				jobsInfoDTO.setPredefinedType(iPSSysBackService.getPredefinedType());
				jobsInfoDTO.setHandler(iPSSysBackService.getCodeName() + "JobHandler");
				jobsInfoDTO.setParam(iPSSysBackService.getServiceParams());
				if (iPSSysBackService.isTimerMode()
						&& !iPSSysBackService.isLocalMode()) {
					jobsInfoDTO.setCron(iPSSysBackService.getTimerPolicy());
				}
				try {
					EBSXSystemRuntime.getInstance().getJobsInfoService().create(jobsInfoDTO);
				} catch (Throwable ex) {
					throw new Exception(String.format("同步后台作业[%1$s]发生异常，%2$s", iPSSysBackService.getName(), ex.getMessage()), ex);
				}

			}
		}

	}

	/**
	 * 安装统一资源
	 *
	 * @param et
	 * @param iPSSystem
	 * @throws Exception
	 */
	protected void installPSSysUniReses(DCSystemDTO et, DynaInstDTO dynaInstDTO, MetaDynaModelDTO metaDynaModelDTO, IPSSystemService iPSSystemService, Map<String, Object> params) throws Throwable {
		IPSSystem iPSSystem = iPSSystemService.getPSSystem();
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		List<PermissionDTO> aPermission = new ArrayList<>();

		Map<String, PermissionDTO> lastPermissionMap = new HashMap<String, PermissionDTO>();
		List<PermissionDTO> lastPermissionList = EBSXSystemRuntime.getInstance().getPermissionService().selectDefault(new SearchContextDTO().all().eq(IPermissionService.FIELD_PERMISSIONTYPE, StaticDict.PermissionType.UNIRES.toString()).eq(IPermissionService.FIELD_DCSYSTEMID, et.getDCSystemId()));
		if (!ObjectUtils.isEmpty(lastPermissionList)) {
			lastPermissionList.forEach(t -> {
				lastPermissionMap.put(t.getPermissionId(), t);
			});
		}

		List<IPSSysUniRes> psSysUniReses = iPSSystem.getAllPSSysUniReses();
		if (psSysUniReses != null) {
			for (IPSSysUniRes psSysUniRes : psSysUniReses) {

				String strPermissionId = KeyValueUtils.genUniqueId(iEmployeeContext.getTenant(), iEmployeeContext.getSystemid(), StaticDict.PermissionType.OPPRIV.toString(), psSysUniRes.getResCode());

				PermissionDTO sysPermission = lastPermissionMap.get(strPermissionId);
				if (sysPermission != null) {
					if (StringUtils.hasLength(psSysUniRes.getName()) && !psSysUniRes.getName().equals(sysPermission.getPermissionName())) {
						sysPermission = null;
					}
				}
				if (sysPermission == null) {
					sysPermission = new PermissionDTO();

					sysPermission.setPermissionId(strPermissionId);
					// sysPermission.setSrfdcid(iEmployeeContext.getTenant());
					sysPermission.setPSSystemId(iEmployeeContext.getSystemid());
					sysPermission.setPermissionTag(psSysUniRes.getResCode());
					sysPermission.setPermissionType(StaticDict.PermissionType.UNIRES.toString());
					// sysPermission.setEnable(1);
					sysPermission.setDCSystemId(et.getDCSystemId());
					sysPermission.setSystemFlag(1);
					sysPermission.setPermissionName(psSysUniRes.getName());
					aPermission.add(sysPermission);
				}

			}
		}

		// sysPermissionService.saveOrUpdateBatch(aPermission);
		if (!ObjectUtils.isEmpty(aPermission)) {
			try {
				EBSXSystemRuntime.getInstance().getPermissionService().rawSave(aPermission, false);
			} catch (Throwable ex) {
				throw new Exception(String.format("同步统一资源发生异常，%1$s", ex.getMessage()), ex);
			}
		}

	}

	/**
	 * 安装系统菜单
	 *
	 * @param et
	 * @param iPSSystem
	 * @throws Exception
	 */
	protected void installMenus(DCSystemDTO et, IPSSystemService iPSSystemService, Map<String, Object> params) throws Exception {
		IPSSystem iPSSystem = iPSSystemService.getPSSystem();
		List<IPSApplication> psApplications = iPSSystem.getAllPSApps();
		for (IPSApplication psApplication : psApplications) {
			List<IPSAppMenuModel> psAppMenuModels = psApplication.getAllPSAppMenuModels();
			if (psAppMenuModels != null) {
				for (IPSAppMenuModel psAppMenuModel : psAppMenuModels) {
					List<IPSAppMenuItem> psAppMenuItems = psAppMenuModel.getPSAppMenuItems();
					if (psAppMenuItems != null) {
						for (IPSAppMenuItem psAppMenuItem : psAppMenuItems) {
							installSubMenu(et, psApplication, psAppMenuModel, psAppMenuItem, null, params);
						}
					}
				}
			}
		}
	}

	/**
	 * 安装子菜单
	 *
	 * @param et
	 * @param psAppMenuItem
	 * @param parentPermissionDTO
	 * @throws Exception
	 */
	protected void installSubMenu(DCSystemDTO et, IPSApplication psApplication, IPSAppMenuModel psAppMenuModel, IPSAppMenuItem psAppMenuItem, PermissionDTO parentPermissionDTO, Map<String, Object> params) throws Exception {
		// PermissionDTO sysPermission = new PermissionDTO();
		// sysPermission.setSrfdcid(iEmployeeContext.getTenant());
		// sysPermission.setPSSystemId(iEmployeeContext.getSystemid());
		// sysPermission.setPermissionTag(String.format("%s-%s-%s",
		// psApplication.getCodeName(), psAppMenuModel.getCodeName(),
		// psAppMenuItem.getName()));
		// sysPermission.setPermissionType(StaticDict.PermissionType.APPMENU.getValue());
		// PermissionDTO existsPermissionDTO =
		// sysPermissionService.getOne(Wrappers.query(sysPermission));
		// if (existsPermissionDTO != null) {
		// if (existsPermissionDTO != null &&
		// existsPermissionDTO.getSystemflag() == 1) {
		// sysPermission.setPermissionId(existsPermissionDTO.getPermissionId());
		// sysPermission.setPermissionName(psAppMenuItem.getCaption());
		// if (parentPermissionDTO != null)
		// sysPermission.setPsysPermissionid(parentPermissionDTO.getPermissionId());
		// //sysPermissionService.update(sysPermission);
		// }
		// } else {
		// sysPermission.setSystemFlag(1);
		// sysPermission.setPermissionName(psAppMenuItem.getCaption());
		// if (parentPermissionDTO != null)
		// sysPermission.setPsysPermissionid(parentPermissionDTO.getPermissionId());
		// sysPermissionService.create(sysPermission);
		// }
		//
		// //子菜单
		// List<IPSAppMenuItem> psChildAppMenuItems =
		// psAppMenuItem.getPSAppMenuItems();
		// if (psChildAppMenuItems != null) {
		// for (IPSAppMenuItem psChildAppMenuItem : psChildAppMenuItems) {
		// installSubMenu(et, psApplication, psAppMenuModel, psChildAppMenuItem,
		// sysPermission);
		// }
		//
		// }
	}

	/**
	 * 安装系统角色
	 *
	 * @param et
	 * @param psSystem
	 * @throws Exception
	 */
	protected void installPSSysUserRoles(DCSystemDTO et, DynaInstDTO dynaInstDTO, MetaDynaModelDTO metaDynaModelDTO, IPSSystemService iPSSystemService, Map<String, Object> params) throws Throwable {
		IPSSystem iPSSystem = iPSSystemService.getPSSystem();
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		List<IPSSysUserRole> psSysUserRoles = iPSSystem.getAllPSSysUserRoles();

		Map<String, String> psSysUserRoleMap = new HashMap<String, String>();
		if (psSysUserRoles != null) {
			for (IPSSysUserRole psSysUserRole : psSysUserRoles) {
				// 系统默认用户 忽略进RT配置 有系统自身控制
				if (SysUserRoleDefaultModes.USER.equals(psSysUserRole.getDefaultUser()) || SysUserRoleDefaultModes.ADMIN.equals(psSysUserRole.getDefaultUser()))
					continue;
				// 系统保留角色 忽略
				if (psSysUserRole.isSystemReserved())
					continue;

				SearchContextDTO searchContextDTO = new SearchContextDTO();
				searchContextDTO.eq(IRoleService.FIELD_ROLETAG, psSysUserRole.getRoleTag());
				// if (StringUtils.hasLength(psSysUserRole.getDefaultUser())) {
				// searchContextDTO.eq(IRoleService.FIELD_USERMODE,
				// psSysUserRole.getDefaultUser());
				// } else {
				// searchContextDTO.nvl(IRoleService.FIELD_USERMODE);
				// }
				if (!psSysUserRole.isGlobalRole()) {
					searchContextDTO.eq(IRoleService.FIELD_DCSYSTEMID, et.getDCSystemId());
				} else {
					searchContextDTO.nvl(IRoleService.FIELD_DCSYSTEMID);
				}

				RoleDTO existsSysRole = EBSXSystemRuntime.getInstance().getRoleService().selectOne(searchContextDTO, true);
				if (existsSysRole != null) {

					boolean bUpdate = false;

					if (existsSysRole.getSystemFlag() != null && existsSysRole.getSystemFlag() == 1 && (existsSysRole.getGlobalFlag() == null || !existsSysRole.getRoleName().equals(psSysUserRole.getName()))) {
						existsSysRole.setRoleName(psSysUserRole.getName());
						existsSysRole.setGlobalFlag(psSysUserRole.isGlobalRole() ? 1 : 0);
						bUpdate = true;
					}

					if ((StringUtils.hasLength(existsSysRole.getUserMode()) && !existsSysRole.getUserMode().equals(psSysUserRole.getDefaultUser())) || (!StringUtils.hasLength(existsSysRole.getUserMode()) && StringUtils.hasLength(psSysUserRole.getDefaultUser()))) {
						existsSysRole.setUserMode(psSysUserRole.getDefaultUser());
						bUpdate = true;
					}

					if (bUpdate) {
						try {
							EBSXSystemRuntime.getInstance().getRoleService().update(existsSysRole);
						} catch (Throwable ex) {
							throw new Exception(String.format("同步系统角色[%1$s]发生异常，%2$s", psSysUserRole.getName(), ex.getMessage()), ex);
						}
					}

					psSysUserRoleMap.put(psSysUserRole.getId(), existsSysRole.getRoleId());
				} else {
					RoleDTO sysRole = new RoleDTO();
					sysRole.setRoleTag(psSysUserRole.getRoleTag());
					// 授权用户
					if (StringUtils.hasLength(psSysUserRole.getDefaultUser())) {
						sysRole.setUserMode(psSysUserRole.getDefaultUser());
					}
					// 是否全局角色
					if (!psSysUserRole.isGlobalRole()) {
						sysRole.setDCSystemId(et.getDCSystemId());
					}

					sysRole.setSystemFlag(1);
					sysRole.setRoleName(psSysUserRole.getName());
					sysRole.setGlobalFlag(psSysUserRole.isGlobalRole() ? 1 : 0);

					try {
						EBSXSystemRuntime.getInstance().getRoleService().create(sysRole);
					} catch (Throwable ex) {
						throw new Exception(String.format("同步系统角色[%1$s]发生异常，%2$s", psSysUserRole.getName(), ex.getMessage()), ex);
					}

					psSysUserRoleMap.put(psSysUserRole.getId(), sysRole.getRoleId());
				}
			}

			// 查出全部
			if (ObjectUtils.isEmpty(psSysUserRoleMap)) {
				return;
			}

			// 查出全部相关数据
			List<RolePermissionDTO> rolePermissionDTOList = EBSXSystemRuntime.getInstance().getRolePermissionService().selectDefault(new SearchContextDTO().all().in(IRolePermissionService.FIELD_SYS_ROLEID, String.join(",", psSysUserRoleMap.values())));

			Map<String, RolePermissionDTO> rolePermissionDTOMap = new HashMap<String, RolePermissionDTO>();
			if (!ObjectUtils.isEmpty(rolePermissionDTOList)) {
				rolePermissionDTOList.forEach(t -> {
					rolePermissionDTOMap.put(t.getRolePermissionId(), t);
				});
			}

			List<RolePermissionDTO> aRolePermissionDTO = new ArrayList<>();

			for (IPSSysUserRole psSysUserRole : psSysUserRoles) {

				String strRoleId = psSysUserRoleMap.get(psSysUserRole.getId());
				if (!StringUtils.hasLength(strRoleId)) {
					continue;
				}

				List<IPSSysUserRoleData> psSysUserRoleDatas = psSysUserRole.getPSSysUserRoleDatas();
				if (psSysUserRoleDatas != null) {
					for (IPSSysUserRoleData psSysUserRoleData : psSysUserRoleDatas) {
						// 实体默认能力 和 系统保留能力 忽略
						if (psSysUserRoleData.getPSDEUserRoleMust().isDefaultMode() || psSysUserRoleData.getPSDEUserRoleMust().isSystemReserved())
							continue;

						// 要排除带模型组并且同名非模型组实体
						if (psSysUserRoleData.getPSDataEntityMust().getPSSystemModuleMust().getPSSysModelGroup() != null) {
							if(iPSSystem.getAllPSDataEntities().stream().filter(ipsDataEntity -> (ipsDataEntity.getPSSystemModuleMust().getPSSysModelGroup() == null && ipsDataEntity.getName().equals(psSysUserRoleData.getPSDataEntityMust().getName()))).count() > 0)
								continue;
						}

						String strEntityId = KeyValueUtils.genUniqueId(iEmployeeContext.getTenant(), iEmployeeContext.getSystemid(), psSysUserRoleData.getPSDataEntity().getName());
						String strPermissionId = KeyValueUtils.genUniqueId(strEntityId, StaticDict.PermissionType.OPPRIV.getValue(), psSysUserRoleData.getPSDEUserRole().getRoleTag());
						String strRolePermissionDTOId = KeyValueUtils.genUniqueId(strRoleId, strPermissionId);
						if (rolePermissionDTOMap.containsKey(strRolePermissionDTOId)) {
							continue;
						}

						RolePermissionDTO sysRolePermission = new RolePermissionDTO();
						sysRolePermission.setRolePermissionId(strRolePermissionDTOId);
						// sysRolePermission.setSrfdcid(iEmployeeContext.getTenant());
						sysRolePermission.setRoleId(strRoleId);
						sysRolePermission.setPermissionId(strPermissionId);

						sysRolePermission.setIsValid(1);
						sysRolePermission.setSystemFlag(1);
						aRolePermissionDTO.add(sysRolePermission);
					}
				}

				// 统一资源
				List<IPSSysUserRoleRes> psSysUserRoleReses = psSysUserRole.getPSSysUserRoleReses();
				if (psSysUserRoleReses != null) {
					for (IPSSysUserRoleRes psSysUserRoleRes : psSysUserRoleReses) {
						String strPermissionId = KeyValueUtils.genUniqueId(iEmployeeContext.getTenant(), iEmployeeContext.getSystemid(), StaticDict.PermissionType.OPPRIV.getValue(), psSysUserRoleRes.getPSSysUniRes().getResCode());
						String strRolePermissionDTOId = KeyValueUtils.genUniqueId(strRoleId, strPermissionId);

						if (rolePermissionDTOMap.containsKey(strRolePermissionDTOId)) {
							continue;
						}

						RolePermissionDTO sysRolePermission = new RolePermissionDTO();
						sysRolePermission.setRolePermissionId(strRolePermissionDTOId);
						// sysRolePermission.setSrfdcid(iEmployeeContext.getTenant());
						sysRolePermission.setRoleId(strRoleId);
						sysRolePermission.setPermissionId(strPermissionId);
						sysRolePermission.setIsValid(1);
						sysRolePermission.setSystemFlag(1);
						aRolePermissionDTO.add(sysRolePermission);
					}
				}

			}

			if (!ObjectUtils.isEmpty(aRolePermissionDTO)) {
				try {
					EBSXSystemRuntime.getInstance().getRolePermissionService().rawCreate(aRolePermissionDTO, false);
				} catch (Throwable ex) {
					throw new Exception(String.format("同步系统角色能力发生异常，%1$s", ex.getMessage()), ex);
				}

			}
		}
	}

	protected void installPSAppFuncs(DCSystemDTO et, DynaInstDTO dynaInstDTO, MetaDynaModelDTO metaDynaModelDTO, IPSSystemService iPSSystemService, Map<String, Object> params) throws Throwable {
		// IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		// List<IPSApplication> psApplications = iPSSystem.getAllPSApps();
		// HashMap<String, ApplicationDTO> systemAppMap = new HashMap<>();
		// List<ApplicationDTO> list =
		// sysPSSystemAppService.selectBySystemid(iEmployeeContext.getSystemid());
		// for (ApplicationDTO sysPSSystemApp : list) {
		// systemAppMap.put(sysPSSystemApp.getCodeName(), sysPSSystemApp);
		// }
		// for (IPSApplication psApplication : psApplications) {
		// String appCodeName = psApplication.getCodeName();
		// log.info(String.format("install check func %1$s ", appCodeName));
		// if (systemAppMap.containsKey(appCodeName)) {
		// log.info(String.format("install %1$s func start", appCodeName));
		// ApplicationDTO sysPSSystemApp = systemAppMap.get(appCodeName);
		// Integer appShowOrder =
		// DataTypeUtils.getIntegerValue(sysPSSystemApp.getShowOrder(), 1000);
		// IPSAppIndexView psAppIndexView =
		// psApplication.getDefaultPSAppIndexView();
		// if (psAppIndexView != null) {
		// IPSAppMenuModel psAppMenuModel = null;
		// if (psAppIndexView.getPSControls() != null) {
		// for (IPSControl control : psAppIndexView.getPSControls()) {
		// if (control instanceof IPSAppMenuModel) {
		// psAppMenuModel = (IPSAppMenuModel) control;
		// break;
		// }
		// }
		// }
		// //IPSAppMenuModel psAppMenuModel =
		// (IPSAppMenuModel)psAppIndexView.getPSControl("AppIndexView",false);
		// if (psAppMenuModel != null) {
		// List<IPSAppMenuItem> psAppMenuItems =
		// psAppMenuModel.getPSAppMenuItems();
		// if (psAppMenuItems != null) {
		// for (IPSAppMenuItem psAppMenuItem : psAppMenuItems) {
		// if (psAppMenuItem.isValid() && !psAppMenuItem.isSeperator() &&
		// !psAppMenuItem.isHidden()) {
		// appShowOrder = installSubMenuFunc(et, psApplication, sysPSSystemApp,
		// psAppIndexView, psAppMenuModel, psAppMenuItem, appShowOrder);
		// }
		// }
		// }
		// }
		// }
		// log.info(String.format("install %1$s func start", appCodeName));
		// }
		//
		// }
	}

	// protected Integer installSubMenuFunc(DCSystemDTO et, IPSApplication
	// psApplication, ApplicationDTO sysPSSystemApp, IPSAppIndexView
	// psAppIndexView, IPSAppMenuModel psAppMenuModel, IPSAppMenuItem
	// psAppMenuItem, Integer showOrder) throws Exception {
	// IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
	// IPSAppFunc psAppFunc = psAppMenuItem.getPSAppFunc();
	// if (psAppFunc != null &&
	// "APPVIEW".equalsIgnoreCase(psAppFunc.getAppFuncType())) {
	// IPSAppView psAppView = psAppFunc.getPSAppView();
	// if (psAppView != null) {
	// AppFuncDTO sysAppFunc = new AppFuncDTO();
	// String sysAppFuncId =
	// DigestUtils.md5DigestAsHex(String.format("%1$s||%2$s||%3$s||%4$s",
	// iEmployeeContext.getSystemid(), iEmployeeContext.getTenant(),
	// psApplication.getCodeName(), psAppFunc.getCodeName()).getBytes());
	// sysAppFunc.setPSSysAppFuncId(sysAppFuncId);
	// sysAppFunc.setPSSysAppFuncName(psAppMenuItem.getCaption());
	// sysAppFunc.setTip(psAppMenuItem.getTooltip());
	// sysAppFunc.setPermissionTag(psAppMenuItem.getAccessKey());
	// sysAppFunc.setDynainstid(iEmployeeContext.getSystemid() + ":default");
	// IPSSysImage img = psAppMenuItem.getPSSysImage();
	// if (img != null) {
	// if (StringUtils.hasLength(img.getImagePath())) {
	// sysAppFunc.setIcon(psAppMenuItem.getPSSysImage().getImagePath());
	// } else if (StringUtils.hasLength(img.getCssClass())) {
	// sysAppFunc.setIconcss(psAppMenuItem.getPSSysImage().getCssClass());
	// }
	// }
	// sysAppFunc.setSystemId(iEmployeeContext.getSystemid());
	// sysAppFunc.setPssystemappid(sysPSSystemApp.getPssystemappid());
	// sysAppFunc.setPssystemappname(sysPSSystemApp.getPssystemappname());
	// sysAppFunc.setAppcategory(sysPSSystemApp.getAppcategory());
	//
	// ViewPathParams viewPathParams = new ViewPathParams();
	// viewPathParams.setIndexView(psAppIndexView.getCodeName());
	// viewPathParams.setAppView(psAppView.getCodeName());
	// IPSAppDataEntity appDataEntity = psAppView.getPSAppDataEntity();
	// if (appDataEntity != null) {
	// viewPathParams.setAppDataEntity(appDataEntity.getCodeName());
	// viewPathParams.setViewType("APPDEVIEW");
	// } else {
	// viewPathParams.setViewType("APPVIEW");
	// }
	// sysAppFunc.setViewpathparams(JSONObject.toJSONString(viewPathParams));
	// sysAppFunc.setSrfdcid(iEmployeeContext.getTenant());
	// sysAppFunc.setShoworder(showOrder++);
	// if (psApplication.isMobileApp()) {
	// sysAppFunc.setMobileapp(1);
	// } else {
	// sysAppFunc.setMobileapp(0);
	// }
	//// if (!sysPSSysAppFuncService.checkKey(sysAppFunc)) {
	//// sysPSSysAppFuncService.save(sysAppFunc);
	//// }
	// log.info(String.format("install func: %1$s",
	// sysAppFunc.getViewpathparams()));
	// sysPSSysAppFuncService.save(sysAppFunc);
	// }
	// }
	// //子菜单
	// List<IPSAppMenuItem> psChildAppMenuItems =
	// psAppMenuItem.getPSAppMenuItems();
	// if (psChildAppMenuItems != null) {
	// for (IPSAppMenuItem psChildAppMenuItem : psChildAppMenuItems) {
	// if (psChildAppMenuItem.isValid() && !psChildAppMenuItem.isSeperator() &&
	// !psChildAppMenuItem.isHidden()) {
	// showOrder = installSubMenuFunc(et, psApplication, sysPSSystemApp,
	// psAppIndexView, psAppMenuModel, psChildAppMenuItem, showOrder);
	// }
	// }
	//
	// }
	// return showOrder;
	// }
	//
	// protected void installDefaultDynaInst(DCSystemDTO et, IPSSystem
	// iPSSystem, String sysDCSystemId) throws Exception {
	// SysDynaInstSearchContext context = new SysDynaInstSearchContext();
	// context.setN_dcsystemid_eq(sysDCSystemId);
	// context.getSearchCond().eq("INTERNALINST", 1);
	// List<SysDynaInst> intenalInsts =
	// sysDynaInstService.searchDefault(context).getContent();
	// if (intenalInsts.size() == 0) {
	// //建立租户内置动态实例
	// SysDynaInst intenalInst = new SysDynaInst();
	// intenalInst.setDCSystemId(sysDCSystemId);
	// intenalInst.setSrfdcid(iEmployeeContext.getTenant());
	// intenalInst.setDefaultinst(1);
	// intenalInst.setDynainstname("租户系统预置实例");
	// intenalInst.setInternalinst(1);
	// sysDynaInstService.create(intenalInst);
	// //建立内置动态实例模型版本
	// MetaDynamicModel intenalDynaModel = new MetaDynamicModel();
	// intenalDynaModel.setConfigname("租户系统预置实例");
	// intenalDynaModel.setSystemId(iEmployeeContext.getSystemid());
	// intenalDynaModel.setSrfdcid(iEmployeeContext.getTenant());
	// intenalDynaModel.setSysdynainstid(intenalInst.getDynainstid());
	// metaDynamicModelService.create(intenalDynaModel);
	// //远程调用RT发布模型
	// }
	// }

	protected void installPSWorkflows(DCSystemDTO dcSystemDTO, DynaInstDTO dynaInstDTO, MetaDynaModelDTO metaDynaModelDTO, IPSSystemService iPSSystemService, Map<String, Object> params) throws Throwable {

		IPSSystem iPSSystem = iPSSystemService.getPSSystem();
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();

		List<IPSWorkflow> psWorkflowList = iPSSystem.getAllPSWorkflows();
		if (ObjectUtils.isEmpty(psWorkflowList)) {
			return;
		}

		List<Map<String, Object>> models = new ArrayList<>();

		for (IPSWorkflow iPSWorkflow : psWorkflowList) {

			java.util.List<IPSWFVersion> psWFVersionList = iPSWorkflow.getPSWFVersions();
			if (ObjectUtils.isEmpty(psWFVersionList)) {
				continue;
			}

			for (IPSWFVersion iPSWFVersion : psWFVersionList) {
				String strBpmnFile = iPSSystemService.getPSModelFolderPath() + File.separator + iPSWFVersion.getDynaModelFilePath() + ".bpmn";
				File file = new File(strBpmnFile);
				if (!file.exists()) {
					log.warn(String.format("工作流BPMN文件[%1$s]不存在", strBpmnFile));
					continue;
				}

				String strContent = FileUtils.readFileToString(file, "UTF-8");
				if (!StringUtils.hasLength(strContent)) {
					continue;
				}

				Map<String, Object> fileMap = new HashMap<String, Object>();
				fileMap.put(file.getName() + ":" + metaDynaModelDTO.getConfigId() + ":" + dcSystemDTO.getSystemId(), strContent);
				models.add(fileMap);

			}
		}

		ISysWFUtilRuntime iSysWFUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysWFUtilRuntime.class, false);
		try {
			iSysWFUtilRuntime.createWFDefinitions(models);
		} catch (Throwable ex) {
			throw new Exception(String.format("部署工作流发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected void installPSWFRoles(DCSystemDTO dcSystemDTO, DynaInstDTO dynaInstDTO, MetaDynaModelDTO metaDynaModelDTO, IPSSystemService iPSSystemService, Map<String, Object> params) throws Throwable {

		IPSSystem iPSSystem = iPSSystemService.getPSSystem();
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();

		List<IPSWFRole> psWFRoleList = iPSSystem.getAllPSWFRoles();
		if (ObjectUtils.isEmpty(psWFRoleList)) {
			return;
		}

		// 查出当前机构的全部工作流组
		Collection<WFGroup> wfGroups = this.getAllWFGroups();
		Map<String, WFGroup> wfGroupMap = new HashMap<String, WFGroup>();
		if (!ObjectUtils.isEmpty(wfGroups)) {
			wfGroups.forEach(t -> {
				if (StringUtils.hasLength(t.getGroupCode())) {
					wfGroupMap.put(t.getGroupCode().toLowerCase(), t);
				}
			});
		}

		List<WFGroupDTO> wfGroupDTOList = new ArrayList<WFGroupDTO>();
		List<WFGroupDTO> wfGroupDTOList2 = new ArrayList<WFGroupDTO>();

		for (IPSWFRole iPSWFRole : psWFRoleList) {
			if (!StringUtils.hasLength(iPSWFRole.getCodeName())) {
				continue;
			}

			WFGroup wfGroup = wfGroupMap.get(iPSWFRole.getCodeName().toLowerCase());
			if (wfGroup != null) {
				// 判断是否需要更新
				boolean bUpdate = false;
				String strGroupScope = iPSWFRole.getWFRoleType();
				if (WFRoleTypes.DEDATASET.equals(iPSWFRole.getWFRoleType())) {
					if (!(iPSWFRole instanceof IPSWFDEDataSetRole)) {
						continue;
					}
					IPSWFDEDataSetRole iPSWFDEDataSetRole = (IPSWFDEDataSetRole) iPSWFRole;
					if (iPSWFDEDataSetRole.getPSDataEntity() == null || iPSWFDEDataSetRole.getPSDEDataSet() == null || iPSWFDEDataSetRole.getWFUserIdPSDEF() == null) {
						continue;
					}

					strGroupScope = String.format("%1$s/%2$s/%3$s/%4$s", WFRoleTypes.DEDATASET, iPSWFDEDataSetRole.getPSDataEntity().getName().toLowerCase(), iPSWFDEDataSetRole.getPSDEDataSet().getName().toLowerCase(), iPSWFDEDataSetRole.getWFUserIdPSDEF().getName().toLowerCase());
				}
				if (StringUtils.hasLength(wfGroup.getGroupScope())) {
					if (!wfGroup.getGroupScope().equals(strGroupScope)) {
						bUpdate = true;
					}
				} else {
					bUpdate = true;
				}

				if (!bUpdate) {
					if (StringUtils.hasLength(wfGroup.getName())) {
						if (!wfGroup.getName().equals(iPSWFRole.getName())) {
							bUpdate = true;
						}
					} else {
						bUpdate = true;
					}
				}

				if (!bUpdate) {
					continue;
				}

				WFGroupDTO wfGroupDTO = new WFGroupDTO();
				wfGroupDTO.setId(wfGroup.getId());
				wfGroupDTO.setGroupCode(iPSWFRole.getCodeName());
				wfGroupDTO.setName(iPSWFRole.getName());
				wfGroupDTO.setGroupScope(strGroupScope);
				wfGroupDTO.setMemo(iPSWFRole.getMemo());

				wfGroupDTOList2.add(wfGroupDTO);

			} else {
				// 新建角色
				WFGroupDTO wfGroupDTO = new WFGroupDTO();
				wfGroupDTO.setId(String.format("%1$s-%2$s", iEmployeeContext.getTenant(), iPSWFRole.getCodeName()));
				wfGroupDTO.setGroupCode(iPSWFRole.getCodeName());
				wfGroupDTO.setName(iPSWFRole.getName());
				wfGroupDTO.setGroupScope(iPSWFRole.getWFRoleType());
				wfGroupDTO.setMemo(iPSWFRole.getMemo());
				if (WFRoleTypes.DEDATASET.equals(iPSWFRole.getWFRoleType())) {
					if (!(iPSWFRole instanceof IPSWFDEDataSetRole)) {
						continue;
					}
					IPSWFDEDataSetRole iPSWFDEDataSetRole = (IPSWFDEDataSetRole) iPSWFRole;
					if (iPSWFDEDataSetRole.getPSDataEntity() == null || iPSWFDEDataSetRole.getPSDEDataSet() == null || iPSWFDEDataSetRole.getWFUserIdPSDEF() == null) {
						continue;
					}

					String strGroupScope = String.format("%1$s/%2$s/%3$s/%4$s", WFRoleTypes.DEDATASET, iPSWFDEDataSetRole.getPSDataEntity().getName().toLowerCase(), iPSWFDEDataSetRole.getPSDEDataSet().getName().toLowerCase(), iPSWFDEDataSetRole.getWFUserIdPSDEF().getName().toLowerCase());
					wfGroupDTO.setGroupScope(strGroupScope);
				}

				wfGroupDTOList.add(wfGroupDTO);
			}

		}

		if (!ObjectUtils.isEmpty(wfGroupDTOList)) {
			try {
				EBSXSystemRuntime.getInstance().getWFGroupService().rawCreate(wfGroupDTOList, false);
			} catch (Throwable ex) {
				throw new Exception(String.format("建立工作流用户组发生异常，%1$s", ex.getMessage()), ex);
			}
		}

		if (!ObjectUtils.isEmpty(wfGroupDTOList2)) {
			try {
				EBSXSystemRuntime.getInstance().getWFGroupService().rawUpdate(wfGroupDTOList2, false);
			} catch (Throwable ex) {
				throw new Exception(String.format("更新工作流用户组发生异常，%1$s", ex.getMessage()), ex);
			}
		}
	}

	@Override
	protected String onGetMetaDynaModelPath(String strSystemId, String strOrgId) throws Throwable {
		MetaDynaModel metaDynaModel = this.getMetaDynaModel(strSystemId, strOrgId);

		// 下载配置
		String strModelFile = metaDynaModel.getModelFile();
		if (!StringUtils.hasLength(strModelFile)) {
			throw new Exception(String.format("动态配置[%1$s]未指定模型文件", metaDynaModel.getConfigName()));
		}

		// 下载文件
		ArrayNode arrayNode = JsonUtils.toArrayNode(strModelFile);
		if (arrayNode.size() == 0) {
			throw new Exception(String.format("动态配置[%1$s]模型文件不正确", metaDynaModel.getConfigName()));
		}
		ObjectNode fileNode = (ObjectNode) arrayNode.get(0);
		String strFileId = fileNode.get("id").asText();
		if (!StringUtils.hasLength(strFileId)) {
			throw new Exception(String.format("动态配置[%1$s]未指定模型文件", metaDynaModel.getConfigName()));
		}

		File dynaModelFolder = null;
		String strFolder = KeyValueUtils.genUniqueId(metaDynaModel.getSysDynaInstId(), strFileId).toLowerCase();
		if (StringUtils.hasLength(this.getDynaModelPath())) {
			// dynaModelFolder = new File(this.getDynaModelPath() +
			// File.separator + strFolder.substring(0, 2) + File.separator +
			// strFolder);
			String strCat = strSystemId.toLowerCase();
			if (strCat.length() > 20) {
				strCat = strCat.substring(0, 20);
			}
			dynaModelFolder = new File(this.getDynaModelPath() + File.separator + strCat + File.separator + strFolder);
		} else {
			Path pathTempDirectory = Files.createTempDirectory("model");
			dynaModelFolder = pathTempDirectory.toFile();
		}

		File systemModelFile = new File(dynaModelFolder.getAbsolutePath() + File.separator + "PSSYSTEM.json");
		if (systemModelFile.exists()) {
			return dynaModelFolder.getAbsolutePath();
		}

		// 下载文件
		String strOSSCat = OSSCAT_DYNAMODEL;
		net.ibizsys.runtime.util.domain.File ossFile = this.getSysFileUtilRuntime().getOSSFile(strFileId, strOSSCat, true);
		if (ossFile == null) {
			ossFile = this.getSysFileUtilRuntime().getOSSFile(strFileId, null, true);
			if (ossFile == null) {
				throw new Exception(String.format("动态配置[%1$s]指定模型文件不存在", metaDynaModel.getConfigName()));
			}
		}

		File zipFile = new File(ossFile.getLocalPath());
		// 判断文件是否存在，进行解压缩
		if (!systemModelFile.exists()) {
			ZipUtils.unzip(zipFile, dynaModelFolder);
		}

		try {
			// 移除下载的zip文件
			if (zipFile.exists()) {
				zipFile.delete();
			}
		} catch (Throwable ex) {
			log.error(String.format("删除下载临时文件发生异常，%1$s", ex.getMessage()), ex);
		}

		return dynaModelFolder.getAbsolutePath();

	}

	@Override
	protected void onPublishSystem(String strSystemId, Map<String, Object> params) throws Throwable {
		// SystemDTO systemDTO =
		// EBSXSystemRuntime.getInstance().getSystemService().get(strSystemId,
		// true);
		SystemDTO systemDTO = this.getSystemIf(strSystemId, false);
		if (systemDTO == null) {
			throw new Exception(String.format("指定系统[%1$s]不存在"));
		}

		// 获取参数
		String strSysModelPath = this.getSysModelPath(systemDTO);
		if (!StringUtils.hasLength(strSysModelPath)) {
			throw new Exception(String.format("无法获取部署系统[%1$s]模型路径，无法进行发布操作", systemDTO.getPSSystemId()));
		}

		IPSSystemService iPSSystemService = this.getPSSystemService(strSysModelPath);
		String strSysType = (String) params.get("systype");
		if (!StringUtils.hasLength(strSysType)) {
			strSysType = iPSSystemService.getPSSystem().getSysType();
		}
		if (!StringUtils.hasLength(strSysType)) {
			strSysType = DevSysTypes.DEVSYS;
		}
		this.syncSystemModel(systemDTO, iPSSystemService, strSysType, params);
		this.pubSystemConfig(systemDTO, iPSSystemService, strSysType, params);

	}

	@Override
	protected void onPublishDCSystem(String strDCSystemId, Map<String, Object> params) throws Throwable {

		DCSystemDTO dcSystemDTO = EBSXSystemRuntime.getInstance().getDCSystemService().get(strDCSystemId, true);
		if (dcSystemDTO == null) {
			throw new Exception(String.format("指定机构系统[%1$s]不存在"));
		}

		// SystemDTO systemDTO =
		// EBSXSystemRuntime.getInstance().getSystemService().get(dcSystemDTO.getSystemId(),
		// true);
		SystemDTO systemDTO = this.getSystemIf(dcSystemDTO.getSystemId(), false);
		if (systemDTO == null) {
			throw new Exception(String.format("指定系统[%1$s]不存在"));
		}

		String strSysModelPath = this.getSysModelPath(systemDTO);
		if (!StringUtils.hasLength(strSysModelPath)) {
			throw new Exception(String.format("无法获取部署系统[%1$s]模型路径，无法进行发布操作", systemDTO.getPSSystemId()));
		}

		IPSSystemService iPSSystemService = this.getPSSystemService(strSysModelPath);

		DynaInstDTO dynaInstDTO = null;
		if (dcSystemDTO != null) {
			dynaInstDTO = getDynaInst(dcSystemDTO);
		}

		String strSysType = (String) params.get("systype");
		if (!StringUtils.hasLength(strSysType)) {
			strSysType = iPSSystemService.getPSSystem().getSysType();
		}
		if (!StringUtils.hasLength(strSysType)) {
			strSysType = DevSysTypes.DEVSYS;
		}

		if (dcSystemDTO != null && dynaInstDTO != null) {
			this.syncDCSystemModel(dcSystemDTO, dynaInstDTO, iPSSystemService, strSysType, true, params);
		}
	}

	@Override
	protected Object onInitTestProjects(String strDCSystemId, Map<String, Object> params) throws Throwable {

		DCSystemDTO dcSystemDTO = EBSXSystemRuntime.getInstance().getDCSystemService().get(strDCSystemId, true);
		if (dcSystemDTO == null) {
			throw new Exception(String.format("指定机构系统[%1$s]不存在"));
		}

		// SystemDTO systemDTO =
		// EBSXSystemRuntime.getInstance().getSystemService().get(dcSystemDTO.getSystemId(),
		// true);
		SystemDTO systemDTO = this.getSystemIf(dcSystemDTO.getSystemId(), false);
		if (systemDTO == null) {
			throw new Exception(String.format("指定系统[%1$s]不存在"));
		}

		String strSysModelPath = this.getSysModelPath(systemDTO);
		if (!StringUtils.hasLength(strSysModelPath)) {
			throw new Exception(String.format("无法获取部署系统[%1$s]模型路径，无法进行初始化测试项目操作", systemDTO.getPSSystemId()));
		}

		IPSSystemService iPSSystemService = this.getPSSystemService(strSysModelPath);
		DCSystem dcSystem = new DCSystem();
		dcSystemDTO.copyTo(dcSystem, true);
		return this.getDefaultTestTool().initTestProjects(dcSystem, iPSSystemService, params);
	}

	@Override
	protected Object onRunTestProject(String strDCSystemId, Map<String, Object> params) throws Throwable {
		DCSystemDTO dcSystemDTO = EBSXSystemRuntime.getInstance().getDCSystemService().get(strDCSystemId, true);
		if (dcSystemDTO == null) {
			throw new Exception(String.format("指定机构系统[%1$s]不存在"));
		}

		// SystemDTO systemDTO =
		// EBSXSystemRuntime.getInstance().getSystemService().get(dcSystemDTO.getSystemId(),
		// true);
		SystemDTO systemDTO = this.getSystemIf(dcSystemDTO.getSystemId(), false);
		if (systemDTO == null) {
			throw new Exception(String.format("指定系统[%1$s]不存在"));
		}

		String strSysModelPath = this.getSysModelPath(systemDTO);
		if (!StringUtils.hasLength(strSysModelPath)) {
			throw new Exception(String.format("无法获取部署系统[%1$s]模型路径，无法进行运行测试项目操作", systemDTO.getPSSystemId()));
		}

		IPSSystemService iPSSystemService = this.getPSSystemService(strSysModelPath);
		DCSystem dcSystem = new DCSystem();
		dcSystemDTO.copyTo(dcSystem, true);
		return this.getDefaultTestTool().runTestProject(dcSystem, iPSSystemService, params);
	}

	@Override
	protected Object onSyncPSModels(String strDCSystemId, Map<String, Object> params) throws Throwable {
		DCSystemDTO dcSystemDTO = EBSXSystemRuntime.getInstance().getDCSystemService().get(strDCSystemId, true);
		if (dcSystemDTO == null) {
			throw new Exception(String.format("指定机构系统[%1$s]不存在"));
		}

		// SystemDTO systemDTO =
		// EBSXSystemRuntime.getInstance().getSystemService().get(dcSystemDTO.getSystemId(),
		// true);
		SystemDTO systemDTO = this.getSystemIf(dcSystemDTO.getSystemId(), false);
		if (systemDTO == null) {
			throw new Exception(String.format("指定系统[%1$s]不存在"));
		}

		String strSysModelPath = this.getSysModelPath(systemDTO);
		if (!StringUtils.hasLength(strSysModelPath)) {
			throw new Exception(String.format("无法获取部署系统[%1$s]模型路径，无法进行平台模型同步操作", systemDTO.getPSSystemId()));
		}

		IPSSystemService iPSSystemService = this.getPSSystemService(strSysModelPath);
		DCSystem dcSystem = new DCSystem();
		dcSystemDTO.copyTo(dcSystem, true);
		this.getPSModelTool("ODOO", false).syncPSModels(dcSystem, iPSSystemService, params);
		return null;
	}

	protected boolean isReuseActiveMetaDynaModel() {
		return true;
	}

	@Override
	protected Object onGenerateCodeSnippet(String strSystemId, Map<String, Object> params) throws Throwable {

		SystemDTO systemDTO = this.getSystemIf(strSystemId, false);
		if (systemDTO == null) {
			throw new Exception(String.format("指定系统[%1$s]不存在"));
		}

		this.getDefaultCodeGenTool();

		String strSysModelPath = this.getSysModelPath(systemDTO, false);
		if (!StringUtils.hasLength(strSysModelPath)) {
			throw new Exception(String.format("无法获取部署系统[%1$s]模型路径，无法进行产生代码片段操作", systemDTO.getPSSystemId()));
		}

		IPSSystemService iPSSystemService = this.getPSSystemService(strSysModelPath);
		net.ibizsys.central.cloud.core.util.domain.System system = new net.ibizsys.central.cloud.core.util.domain.System();
		systemDTO.copyTo(system, true);

		return this.getDefaultCodeGenTool().generateCodeSnippet(system, iPSSystemService, params);
	}

	@Override
	protected Object onInvokeDynaModelAPI(String strSystemId, String strPModel, String strPKey, String strModel, String strMethod, String strKey, Object params) throws Throwable {
		SystemDTO systemDTO = this.getSystemIf(strSystemId, false);
		if (systemDTO == null) {
			throw new Exception(String.format("指定系统[%1$s]不存在"));
		}

		this.getDefaultDynaModelAPI();

		String strSysModelPath = this.getSysModelPath(systemDTO, false);
		if (!StringUtils.hasLength(strSysModelPath)) {
			throw new Exception(String.format("无法获取部署系统[%1$s]模型路径，无法进行动态模型接口调用", systemDTO.getPSSystemId()));
		}

		IPSSystemService iPSSystemService = this.getPSSystemService(strSysModelPath);
		net.ibizsys.central.cloud.core.util.domain.System system = new net.ibizsys.central.cloud.core.util.domain.System();
		systemDTO.copyTo(system, true);

		return this.getDefaultDynaModelAPI().invoke(system, iPSSystemService, strPModel, strPKey, strModel, strMethod, strKey, params);
	}
}
