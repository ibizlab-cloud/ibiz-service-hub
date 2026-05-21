package net.ibizsys.central.plugin.ai.sysutil;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.ai.IAIChatSkillUtil;
import net.ibizsys.central.cloud.core.ai.ISysAIChatSkill;
import net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime;
import net.ibizsys.central.cloud.core.sysutil.SysUtilRuntimeBase;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.Entity;
import net.ibizsys.runtime.util.ExceptionUtils;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.ITransactionalUtil;
import net.ibizsys.runtime.util.KeyValueUtils;

public abstract class SysChatSkillUtilRuntimeBase extends SysUtilRuntimeBase implements ISysChatSkillUtilRuntime {

	private static final Log log = LogFactory.getLog(SysChatSkillUtilRuntimeBase.class);
	private IDataEntityRuntime skillDataEntityRuntime = null;
	private Map<String, IPSDEField> skillPSDEFieldMap = new LinkedHashMap<String, IPSDEField>();

	private Map<String, IAIChatSkillUtil> aiChatSkillUtilMap = new ConcurrentHashMap<String, IAIChatSkillUtil>();
	private IPSDEDataSet validPSDEDataSet = null;
	private IPSDEAction createPSDEAction = null;
	private File skillsFolder = null;

	@Override
	protected void onInit() throws Exception {
		final IPSDataEntity toolPSDataEntity = this.getSkillPSDataEntity();
		if (toolPSDataEntity == null) {
			throw new Exception("未指定工具定义实体模型对象");
		}

		// 初始化skill临时目录
		this.skillsFolder = new File(this.getSystemRuntime().getTempFolder() + File.separator + KeyValueUtils.genUniqueId());
		if (!this.skillsFolder.exists()) {
			this.skillsFolder.mkdirs();
		}

		super.onInit();
	}

	protected IPSDataEntity getSkillPSDataEntity() {
		return this.getPSModelObject().getUtilPSDE();
	}

	protected final IDataEntityRuntime getSkillDERuntime(boolean tryMode) throws Exception {
		if (this.skillDataEntityRuntime != null || tryMode) {
			return this.skillDataEntityRuntime;
		}
		throw new Exception(String.format("技能定义实体运行时对象无效"));
	}

	protected void setSkillDERuntime(IDataEntityRuntime skillDataEntityRuntime) {
		this.skillDataEntityRuntime = skillDataEntityRuntime;
	}

	protected File getSkillsFolder() {
		return this.skillsFolder;
	}

	@Override
	protected void onInstall() throws Exception {
		super.onInstall();

		if (this.getSkillDERuntime(true) == null) {
			this.setSkillDERuntime((IDataEntityRuntime) this.getSystemRuntime().getDataEntityRuntime(getSkillPSDataEntity().getId()));
		}

		fillSkillPSDEFieldMap(this.skillPSDEFieldMap);
		String strValidDataSetTag = this.getUtilParam("SKILL.DATASET.VALID", SKILL_DATASET_VALID);
		this.validPSDEDataSet = this.getSkillDERuntime(false).getPSDEDataSetByTag(strValidDataSetTag, false);

		this.createPSDEAction = this.getSkillDERuntime(false).getPSDEActionByTag(SKILL_ACTION_CREATE, true);

		// 侦听Cloud重置信号
		this.listenReloadSignal();
		// 加载配置
		this.localReload();
	}

	@Override
	protected void onReload() throws Throwable {
		this.reloadSkills();
		super.onReload();
	}

	protected void reloadSkills() throws Throwable {

	}

	protected void fillSkillPSDEFieldMap(Map<String, IPSDEField> skillPSDEFieldMap) throws Exception {

		Map<String, String> skillFieldAliasMap = new LinkedHashMap<String, String>();

		final IDataEntityRuntime skillDERuntime = this.getSkillDERuntime(false);
		skillPSDEFieldMap.put(SKILL_FIELD_NAME, null);
		skillPSDEFieldMap.put(SKILL_FIELD_PROMPT, null);
		skillPSDEFieldMap.put(SKILL_FIELD_SCRIPTS, null);
		skillPSDEFieldMap.put(SKILL_FIELD_REFERENCES, null);
		skillPSDEFieldMap.put(skillDERuntime.getKeyPSDEField().getName(), null);

		for (String strFieldTag : skillPSDEFieldMap.keySet()) {
			String realTag = this.getUtilParam(String.format("SKILL.FIELD.%1$s", strFieldTag), strFieldTag);
			skillFieldAliasMap.put(realTag, strFieldTag);
		}

		List<IPSDEField> psDEFieldList = skillDERuntime.getPSDataEntity().getAllPSDEFields();
		if (!ObjectUtils.isEmpty(psDEFieldList)) {
			for (IPSDEField iPSDEField : psDEFieldList) {
				if (!StringUtils.hasLength(iPSDEField.getFieldTag())) {
					continue;
				}
				String strTag = iPSDEField.getFieldTag().toUpperCase();
				if (!skillPSDEFieldMap.containsKey(strTag)) {
					continue;
				}

				if (skillPSDEFieldMap.get(strTag) == null) {
					skillPSDEFieldMap.put(strTag, iPSDEField);
				}
			}

			for (IPSDEField iPSDEField : psDEFieldList) {
				String strTag = iPSDEField.getName().toUpperCase();

				if (skillFieldAliasMap.containsKey(strTag)) {
					strTag = skillFieldAliasMap.get(strTag);
				}

				if (!skillPSDEFieldMap.containsKey(strTag)) {
					continue;
				}

				if (skillPSDEFieldMap.get(strTag) == null) {
					skillPSDEFieldMap.put(strTag, iPSDEField);
				}
			}
		}
	}

	@Override
	public IAIChatSkillUtil getAIChatSkillUtil(String mode) {
		Assert.hasLength(mode, "传入模式无效");
		IAIChatSkillUtil iAIChatSkillUtil = aiChatSkillUtilMap.get(mode);
		if (iAIChatSkillUtil == null) {
			iAIChatSkillUtil = this.createAIChatSkillUtil(mode);
			this.aiChatSkillUtilMap.put(mode, iAIChatSkillUtil);
		}
		return iAIChatSkillUtil;
	}

	protected IAIChatSkillUtil createAIChatSkillUtil(String mode) {
		return new IAIChatSkillUtil() {

			@Override
			public List<File> listSkills() throws Exception {
				try {
					return SysChatSkillUtilRuntimeBase.this.listSkills();
				} catch (Throwable ex) {
					ExceptionUtils.rethrowException(ex);
				}
				return Collections.EMPTY_LIST;
			}

			@Override
			public void writeFile(String skillId, String filePath, String content) throws Exception {
				try {
					SysChatSkillUtilRuntimeBase.this.writeFile(skillId, filePath, content);
				} catch (Throwable ex) {
					ExceptionUtils.rethrowException(ex);
				}
			}

			@Override
			public String readFile(String skillId, String filePath) throws Exception {
				try {
					return SysChatSkillUtilRuntimeBase.this.readFile(skillId, filePath);
				} catch (Throwable ex) {
					ExceptionUtils.rethrowException(ex);
				}
				return "";
			}

			@Override
			public void deleteFile(String skillId, String filePath) throws Exception {
				try {
					SysChatSkillUtilRuntimeBase.this.deleteFile(skillId, filePath);
				} catch (Throwable ex) {
					ExceptionUtils.rethrowException(ex);
				}
			}

			@Override
			public boolean supportFile(String skillId, String filePath) {
				return SysChatSkillUtilRuntimeBase.this.supportFile(skillId, filePath);
			}
		};
	}

	protected boolean supportFile(String skillId, String filePath) {
		if (filePath.equals(ISysAIChatSkill.SKILLFILE)) {
			return true;
		} else if (filePath.indexOf(ISysAIChatSkill.SCRIPTFILE_PREFIX) == 0 || filePath.indexOf(ISysAIChatSkill.REFERENCEFILE_PREFIX) == 0) {
			return true;
		}
		return false;
	}

	protected List<File> listSkills() throws Throwable {
		ISearchContextDTO iSearchContextDTO = this.getSkillDERuntime(false).createSearchContext().all().count(false);
		List<IEntityDTO> list = this.getSkillDERuntime(false).selectDataSet(this.validPSDEDataSet, iSearchContextDTO);

		IPSDEField promptPSDEField = skillPSDEFieldMap.get(SKILL_FIELD_PROMPT);
		IPSDEField scriptsPSDEField = skillPSDEFieldMap.get(SKILL_FIELD_SCRIPTS);
		IPSDEField referencesPSDEField = skillPSDEFieldMap.get(SKILL_FIELD_REFERENCES);

		String strPromptField = promptPSDEField != null ? promptPSDEField.getLowerCaseName() : SKILL_FIELD_PROMPT.toLowerCase();
		String strScriptsField = scriptsPSDEField != null ? scriptsPSDEField.getLowerCaseName() : SKILL_FIELD_SCRIPTS.toLowerCase();
		String strReferencesField = referencesPSDEField != null ? referencesPSDEField.getLowerCaseName() : SKILL_FIELD_REFERENCES.toLowerCase();
		//
		// File[] lastSkills = this.getSkillsFolder().listFiles();
		// Map<String, File> lastSkillMap = new HashMap<String, File>();
		// if(lastSkillMap != null) {
		//
		// }

		List<File> allList = new ArrayList<File>();

		for (IEntityDTO skillEntityDTO : list) {
			String skillId = skillEntityDTO.getString(this.getSkillDERuntime(false).getMajorPSDEField().getLowerCaseName(), "");
			if (ObjectUtils.isEmpty(skillId)) {
				log.error(String.format("Skill数据[%1$s]未指定名称", this.getSkillDERuntime(false).getKeyFieldValue(skillEntityDTO)));
				continue;
			}

			try {

				// 建立目录
				File skillFolder = new File(this.getSkillsFolder().getCanonicalPath() + File.separator + skillId);
				if (!skillFolder.exists()) {
					skillFolder.mkdirs();
				}

				String strPrompt = skillEntityDTO.getString(strPromptField, null);
				if (StringUtils.hasLength(strPrompt)) {
					FileUtils.write(new File(skillFolder.getCanonicalPath() + File.separator + ISysAIChatSkill.SKILLFILE), strPrompt, "UTF-8");
				}

				Object scripts = skillEntityDTO.get(strScriptsField);
				if (!ObjectUtils.isEmpty(scripts)) {
					File scriptFolder = new File(skillFolder.getCanonicalPath() + File.separator + "scripts");
					if (!scriptFolder.exists()) {
						scriptFolder.mkdirs();
					}
					Map<String, File> lastMap = new LinkedHashMap<String, File>();
					try (Stream<Path> paths = Files.walk(scriptFolder.toPath())) {
						lastMap = paths.filter(Files::isRegularFile).collect(Collectors.toMap(path -> {
							try {
								return path.toFile().getCanonicalPath();
							} catch (IOException e) {
								log.error(e);
								return path.toFile().getName();
							}
						}, path -> path.toFile(), (existing, replacement) -> existing));
					}

					List<IEntity> files = (List) scripts;
					for (IEntity file : files) {
						String strPath = (String) file.get("path");
						String strContent = (String) file.get("content");
						if (ObjectUtils.isEmpty(strPath) || ObjectUtils.isEmpty(strContent)) {
							continue;
						}
						File scriptFile = new File(skillFolder.getCanonicalPath() + File.separator + strPath);
						if (!scriptFile.getParentFile().exists()) {
							scriptFile.getParentFile().mkdirs();
						}

						FileUtils.write(scriptFile, strContent, "UTF-8");
						lastMap.remove(scriptFile.getCanonicalPath());
					}

					// 删除文件
					for (File removeFile : lastMap.values()) {
						removeFile.delete();
					}
				}

				Object referencess = skillEntityDTO.get(strReferencesField);
				if (!ObjectUtils.isEmpty(referencess)) {
					File referencesFolder = new File(skillFolder.getCanonicalPath() + File.separator + "references");
					if (!referencesFolder.exists()) {
						referencesFolder.mkdirs();
					}
					Map<String, File> lastMap = new LinkedHashMap<String, File>();
					try (Stream<Path> paths = Files.walk(referencesFolder.toPath())) {
						lastMap = paths.filter(Files::isRegularFile).collect(Collectors.toMap(path -> {
							try {
								return path.toFile().getCanonicalPath();
							} catch (IOException e) {
								log.error(e);
								return path.toFile().getName();
							}
						}, path -> path.toFile(), (existing, replacement) -> existing));
					}

					List<IEntity> files = (List) referencess;
					for (IEntity file : files) {
						String strPath = (String) file.get("path");
						String strContent = (String) file.get("content");
						if (ObjectUtils.isEmpty(strPath) || ObjectUtils.isEmpty(strContent)) {
							continue;
						}
						File referencesFile = new File(skillFolder.getCanonicalPath() + File.separator + strPath);
						if (!referencesFile.getParentFile().exists()) {
							referencesFile.getParentFile().mkdirs();
						}

						FileUtils.write(referencesFile, strContent, "UTF-8");
						lastMap.remove(referencesFile.getCanonicalPath());
					}

					// 删除文件
					for (File removeFile : lastMap.values()) {
						removeFile.delete();
					}
				}

				allList.add(skillFolder);

			} catch (Throwable ex) {
				log.error(String.format("加载skill[%1$s]发生异常，%2$s", skillId, ex.getMessage()), ex);
			}

		}

		return allList;
	}

	protected IEntityDTO getSkillEntityDTO(String skillId, boolean tryMode) throws Throwable {
		ISearchContextDTO iSearchContextDTO = this.getSkillDERuntime(false).createSearchContext().limit(1).count(false);
		iSearchContextDTO.eq(this.getSkillDERuntime(false).getMajorPSDEField().getLowerCaseName(), skillId);
		List<IEntityDTO> list = this.getSkillDERuntime(false).selectDataSet(this.validPSDEDataSet, iSearchContextDTO);
		if (!ObjectUtils.isEmpty(list)) {
			return list.get(0);
		}
		if (tryMode) {
			return null;
		}
		throw new Exception(String.format("指定数据不存在"));
	}

	protected void writeFile(String skillId, String filePath, String content) throws Throwable {
		ActionSessionManager.execute(new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onWriteFile(skillId, filePath, content);
				return null;
			}
		}, null, ITransactionalUtil.PROPAGATION_REQUIRES_NEW);

	}

	protected void onWriteFile(String skillId, String filePath, String content) throws Throwable {

		IEntityDTO skillEntityDTO = this.getSkillEntityDTO(skillId, true);
		boolean bCreate = false;
		if (skillEntityDTO == null) {
			bCreate = true;
			skillEntityDTO = this.getSkillDERuntime(false).createEntity();
			skillEntityDTO.set(this.getSkillDERuntime(false).getMajorPSDEField().getLowerCaseName(), skillId);
		}
		// 判断文件是否合法
		if (filePath.equals(ISysAIChatSkill.SKILLFILE)) {
			// 根文件
			IPSDEField promptPSDEField = skillPSDEFieldMap.get(SKILL_FIELD_PROMPT);
			if (promptPSDEField != null) {
				skillEntityDTO.set(promptPSDEField.getLowerCaseName(), content);
			} else {
				skillEntityDTO.set(SKILL_FIELD_PROMPT.toLowerCase(), content);
			}
		} else if (filePath.indexOf(ISysAIChatSkill.SCRIPTFILE_PREFIX) == 0 || filePath.indexOf(ISysAIChatSkill.REFERENCEFILE_PREFIX) == 0) {

			String strFieldTag = (filePath.indexOf(ISysAIChatSkill.SCRIPTFILE_PREFIX) == 0) ? SKILL_FIELD_SCRIPTS : SKILL_FIELD_REFERENCES;

			// 附加脚本文件
			IPSDEField scriptsPSDEField = skillPSDEFieldMap.get(strFieldTag);
			String strFieldName = scriptsPSDEField != null ? scriptsPSDEField.getLowerCaseName() : strFieldTag.toLowerCase();
			Object last = skillEntityDTO.get(strFieldName);

			List<IEntity> files = new ArrayList<IEntity>();
			if (last instanceof List) {
				files.addAll((List) last);
			}

			// 判断路径是否存在
			boolean bAdd = true;
			for (IEntity file : files) {
				String strPath = (String) file.get("path");
				if (filePath.equals(strPath)) {
					file.set("content", content);
					bAdd = false;
					break;
				}
			}

			if (bAdd) {
				IEntity file = new Entity();
				file.set("path", filePath);
				file.set("content", content);
				files.add(file);
			}
			skillEntityDTO.set(strFieldName, files);
		} else {
			throw new Exception(String.format("禁止写入路径[%1$s]，SKILL仅支持写入`scripts/`及`references/`，作业数据必须在AGENT工作目录中！", filePath));
		}

		if (bCreate) {
			if (this.createPSDEAction != null) {
				this.getSkillDERuntime(false).executeAction(this.createPSDEAction.getName(), this.createPSDEAction, new Object[] { skillEntityDTO });
			} else {
				this.getSkillDERuntime(false).create(skillEntityDTO);
			}
		} else {
			this.getSkillDERuntime(false).update(skillEntityDTO);
		}
	}

	protected String readFile(String skillId, String filePath) throws Throwable {
		IEntityDTO skillEntityDTO = this.getSkillEntityDTO(skillId, true);
		if (skillEntityDTO == null) {
			throw new Exception(String.format("指定路径[%1$s]文件不存在", filePath));
		}
		// 判断文件是否合法
		if (filePath.equals(ISysAIChatSkill.SKILLFILE)) {
			// 根文件
			IPSDEField promptPSDEField = skillPSDEFieldMap.get(SKILL_FIELD_PROMPT);
			if (promptPSDEField != null) {
				return DataTypeUtils.asString(skillEntityDTO.get(promptPSDEField.getLowerCaseName()), "");
			} else {
				return DataTypeUtils.asString(skillEntityDTO.get(SKILL_FIELD_PROMPT.toLowerCase()), "");
			}
		} else if (filePath.indexOf(ISysAIChatSkill.SCRIPTFILE_PREFIX) == 0 || filePath.indexOf(ISysAIChatSkill.REFERENCEFILE_PREFIX) == 0) {

			String strFieldTag = (filePath.indexOf(ISysAIChatSkill.SCRIPTFILE_PREFIX) == 0) ? SKILL_FIELD_SCRIPTS : SKILL_FIELD_REFERENCES;

			// 附加脚本文件
			IPSDEField scriptsPSDEField = skillPSDEFieldMap.get(strFieldTag);
			String strFieldName = scriptsPSDEField != null ? scriptsPSDEField.getLowerCaseName() : strFieldTag.toLowerCase();
			Object last = skillEntityDTO.get(strFieldName);

			List<IEntity> files = new ArrayList<IEntity>();
			if (last instanceof List) {
				files.addAll((List) last);
			}

			// 判断路径是否存在
			for (IEntity file : files) {
				String strPath = (String) file.get("path");
				if (filePath.equals(strPath)) {
					return DataTypeUtils.asString(file.get("content"), "");
				}
			}

			throw new Exception(String.format("指定路径[%1$s]文件不存在", filePath));
		} else {
			throw new Exception(String.format("不支持读取路径[%1$s]", filePath));
		}
	}

	protected void deleteFile(String skillId, String filePath) throws Throwable {
		ActionSessionManager.execute(new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onDeleteFile(skillId, filePath);
				return null;
			}
		}, null, ITransactionalUtil.PROPAGATION_REQUIRES_NEW);
	}

	protected void onDeleteFile(String skillId, String filePath) throws Throwable {
		IEntityDTO skillEntityDTO = this.getSkillEntityDTO(skillId, true);
		if (skillEntityDTO == null) {
			throw new Exception(String.format("指定路径[%1$s]文件不存在", filePath));
		}
		// 判断文件是否合法
		if (filePath.equals(ISysAIChatSkill.SKILLFILE)) {
			// 直接删除
			this.getSkillDERuntime(false).remove(this.getSkillDERuntime(false).getKeyFieldValue(skillEntityDTO));
			return;
		} else if (filePath.indexOf(ISysAIChatSkill.SCRIPTFILE_PREFIX) == 0 || filePath.indexOf(ISysAIChatSkill.REFERENCEFILE_PREFIX) == 0) {
			
			String strFieldTag = (filePath.indexOf(ISysAIChatSkill.SCRIPTFILE_PREFIX) == 0) ? SKILL_FIELD_SCRIPTS : SKILL_FIELD_REFERENCES;
			// 附加脚本文件
			IPSDEField scriptsPSDEField = skillPSDEFieldMap.get(strFieldTag);
			String strFieldName = scriptsPSDEField != null ? scriptsPSDEField.getLowerCaseName() : strFieldTag.toLowerCase();
			Object last = skillEntityDTO.get(strFieldName);

			List<IEntity> files = new ArrayList<IEntity>();
			if (last instanceof List) {
				files.addAll((List) last);
			}

			// 判断路径是否存在
			IEntity removeFile = null;
			for (IEntity file : files) {
				String strPath = (String) file.get("path");
				if (filePath.equals(strPath)) {
					removeFile = file;
					break;
				}
			}

			if (removeFile != null) {
				files.remove(removeFile);
				skillEntityDTO.set(strFieldName, files);
				this.getSkillDERuntime(false).update(skillEntityDTO);
				return;
			}

			throw new Exception(String.format("指定路径[%1$s]文件不存在", filePath));
		} else {
			throw new Exception(String.format("不支持读取路径[%1$s]", filePath));
		}
	}

}
