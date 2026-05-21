package net.ibizsys.central.cloud.core.ai;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public abstract class ChatAgentSysAIChatSkillBase extends SysAIChatSkillBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(ChatAgentSysAIChatSkillBase.class);
	private File skillFolder = null;
	private Map<String, String> extendedData = new HashMap<String, String>();
	private Map<String, File> extendedFileMap = new HashMap<String, File>();
	private Map<String, String> extendedScripts = new HashMap<String, String>();
	private ISysAIChatAgentRuntime iSysAIChatAgentRuntime = null;
	
	@Override
	public void init(ISysAIFactoryRuntimeContext iSysAIFactoryRuntimeContext, Object skillData) throws Exception {
		this.init(iSysAIFactoryRuntimeContext, skillData, null, false);
	}

	@Override
	public void init(ISysAIFactoryRuntimeContext iSysAIFactoryRuntimeContext, Object skillData, ISysAIChatSkill inheritSkill, boolean extended) throws Exception {
		if(skillData instanceof ISysAIChatAgentRuntime) {
			this.iSysAIChatAgentRuntime = (ISysAIChatAgentRuntime)skillData;
			this.setId(this.iSysAIChatAgentRuntime.getUniqueTag()+"@agent");
			this.skillFolder = this.iSysAIChatAgentRuntime.getWorkspace();
		}
		else {
			throw new Exception("传入技能数据交谈代理运行时对象");
		}
		super.init(iSysAIFactoryRuntimeContext, skillData, inheritSkill, extended);
	}
	
	@Override
	protected void onInit() throws Exception {
		//获取SKILL文件
		prepareSkillInfo();
		prepareSkillFiles();
		super.onInit();
	}
	
	protected void prepareSkillInfo()throws Exception {
//		File skillFile = new File(this.getSkillFolder().getCanonicalPath() + File.separator + SKILLFILE);
//		if(!skillFile.exists() || !skillFile.isFile()) {
//			if(this.getInheritSkill() != null) {
//				this.setName(this.getInheritSkill().getName());
//				this.setDescription(this.getInheritSkill().getDescription());
//				this.setPrompt(this.getInheritSkill().getPrompt());
//				return;
//			}
//			throw new Exception("技能文件不存在");
//		}
//		
//		String strOriginContent = FileUtils.readFileToString(skillFile, "UTF-8");
//		String strSkillContent = strOriginContent;
//		//找到第一个 ---
//		int nPos = strSkillContent.indexOf("---");
//		if(nPos == -1) {
//			throw new Exception("无法定位第一个`---`");
//		}
//		
//		strSkillContent = strSkillContent.substring(nPos + 3);
//		nPos = strSkillContent.indexOf("---");
//		if(nPos == -1) {
//			throw new Exception("无法定位第二个`---`");
//		}
//		
//		String strYamlContent = strSkillContent.substring(0, nPos);
//		ConfigEntityEx configEntityEx = new ConfigEntityEx(strYamlContent, true);
		this.setName(getSysAIChatAgentRuntime().getName());
		this.setDescription(getSysAIChatAgentRuntime().getPSModelObject().getReadme());
		//String strPrompt = strSkillContent.substring(nPos + 3);
		this.setPrompt(getSysAIChatAgentRuntime().getPSModelObject().getSkillPrompt());
	}
	
	public ISysAIChatAgentRuntime getSysAIChatAgentRuntime() {
		return this.iSysAIChatAgentRuntime;
	}
	
	@Override
	public File getSkillFolder() {
		return skillFolder;
	}
	
	@Override
	public String readFile(String filePath) throws IOException {
		
		if(SKILLFILE.equals(filePath)) {
			return this.getPrompt();
		}
		
		if(this.getInheritSkill() != null) {
			return this.getInheritSkill().readFile(filePath);
		}
		throw new IOException("指定文件不存在");
	}
	
	@Override
	public boolean containsFile(String filePath){
		if(SKILLFILE.equals(filePath)) {
			return true;
		}
		if(this.getInheritSkill() != null) {
			return this.getInheritSkill().containsFile(filePath);
		}
		return false;
	}

	//	@Override
//	public List<File> getSkillFiles() {
//		return this.skillFileList;
//	}
//	
	protected void prepareSkillFiles() throws Exception {
		
	}
	
	
	@Override
	public Map<String, String> getExtendedData() {
		return this.extendedData;
	}

	@Override
	public Map<String, String> getExtendedScripts() {
		return extendedScripts;
	}
	
}
