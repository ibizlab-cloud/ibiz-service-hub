package net.ibizsys.centralstudio.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jgit.api.CloneCommand;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;
import org.springframework.util.StringUtils;
import org.yaml.snakeyaml.Yaml;

import net.ibizsys.model.IPSSystemService;
import net.ibizsys.model.PSModelServiceImpl;

public abstract class PSRTModelExporterBase extends PSModelImporterBase {

	private static final Log log = LogFactory.getLog(PSRTModelExporterBase.class);

	/**
	 * 系统参数：运行时模型配置
	 */
	public final static String SYSPARAM_PSRTMODEL = "psrtmodel";
	
	@Override
	protected void onRun(Map sysMap, Map paramMap, Map argMap) throws Throwable {
		//super.onRun(sysMap, paramMap, argMap);
		
		Object psrtmodel = sysMap.get(SYSPARAM_PSRTMODEL);
		Map psrtmodelMap = null;
		if (psrtmodel instanceof Map) {
			psrtmodelMap = (Map) psrtmodel;
		}

		if (psrtmodelMap == null) {
			throw new Exception("未指定运行时模型配置");
		}
		
		IPSSystemService iPSSystemService = this.getPSRTModelService(psrtmodelMap);
		this.onRun(iPSSystemService, sysMap, paramMap, argMap);
	}
	
	
	
	protected void onRun(IPSSystemService iPSSystemService, Map sysMap, Map paramMap, Map argMap) throws Throwable{
		throw new Exception("没有实现");
	}
	
	protected String onGetPSSysDevBKTaskName(Map paramMap) {
		return String.format("模型导出任务");
	}

	protected IPSSystemService getPSRTModelService(Map psrtmodelMap) throws Exception {

		String strRTModelUrl = DataTypeUtils.getStringValue(psrtmodelMap.get("url"), null);
		String strBranch = DataTypeUtils.getStringValue(psrtmodelMap.get("branch"), "master");
		String strGitUserName = DataTypeUtils.getStringValue(psrtmodelMap.get("username"), null);
		String strGitPassword = DataTypeUtils.getStringValue(psrtmodelMap.get("password"), null);

		if (!StringUtils.hasLength(strRTModelUrl)) {
			throw new Exception("未指定运行时模型仓库路径");
		}

		// 签出文件
		this.updateCurrentPSSysDevBKTask(LogLevels.INFO, String.format("开始下载运行时模型[%1$s]", strRTModelUrl));

		String strPath = String.format("%1$s%2$s%3$s", File.createTempFile("folder", ".txt").getParent(), File.separator, KeyValueUtils.genUniqueId());
		File folder = new File(strPath);
		folder.mkdirs();
		try {
			CloneCommand cloneCommand = Git.cloneRepository().setURI(strRTModelUrl).setDirectory(folder).setBranch(strBranch);
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
		} catch (Throwable ex) {
			throw new Exception(String.format("获取运行时模型发生异常，%1$s", ex.getMessage()), ex);
		}
		
		this.updateCurrentPSSysDevBKTask(LogLevels.INFO, String.format("结束下载运行时模型"));
		
		String strModelPath = "";
		File modelFile = new File(String.format("%1$s%2$sibizmodel.yaml", strPath, File.separator));
		if(modelFile.exists()) {
			//从配置文件中提取目录
			try {
				Yaml yaml = new Yaml();
				Map config = yaml.loadAs(new FileInputStream(modelFile) , Map.class);
				if(config != null) {
					String strModelFolder = (String)config.get("modelfolder");
					if(StringUtils.hasLength(strModelFolder)) {
						strModelPath = strPath + File.separator + strModelFolder;
					}
				}
			}
			catch (Throwable ex) {
				throw new Exception(String.format("加载运行时模型配置发生异常，%1$s", ex.getMessage()), ex);
			}
		}
		if(!StringUtils.hasLength(strModelPath)) {
			//未指定直接使用根目录
			strModelPath = strPath;
		}
		
		IPSSystemService iPSSystemService = null;
		try {
			iPSSystemService = this.getPSSystemService(strModelPath);
		}
		catch (Throwable ex) {
			throw new Exception(String.format("加载运行时模型发生异常，%1$s", ex.getMessage()), ex);
		}
		
		return iPSSystemService;
	}
	
	protected IPSSystemService getPSSystemService(String strModelPath) throws Throwable {
		PSModelServiceImpl psModelServiceImpl = new PSModelServiceImpl();
		psModelServiceImpl.setPSModelFolderPath(strModelPath);
		psModelServiceImpl.getPSSystem();
		return psModelServiceImpl;
	}
	
	
	
}
