package net.ibizsys.central.cloud.core.ai;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.io.FileUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.util.ConfigEntityEx;

public abstract class DefaultSysAIChatSkillBase extends SysAIChatSkillBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DefaultSysAIChatSkillBase.class);
	private File skillFolder = null;
	private Map<String, String> extendedData = new HashMap<String, String>();
	private Map<String, File> extendedFileMap = new HashMap<String, File>();
	private Map<String, String> extendedScripts = new HashMap<String, String>();
	
	@Override
	public void init(ISysAIFactoryRuntimeContext iSysAIFactoryRuntimeContext, Object skillData) throws Exception {
		this.init(iSysAIFactoryRuntimeContext, skillData, null, false);
	}

	@Override
	public void init(ISysAIFactoryRuntimeContext iSysAIFactoryRuntimeContext, Object skillData, ISysAIChatSkill inheritSkill, boolean extended) throws Exception {
		if(skillData instanceof File) {
			this.skillFolder = (File)skillData;
			if(!this.skillFolder.isDirectory()) {
				throw new Exception("传入技能数据不是文件夹");
			}
			this.setId(this.skillFolder.getName());
		}
		else {
			throw new Exception("传入技能数据不是文件夹类型");
		}
		super.init(iSysAIFactoryRuntimeContext, skillData, inheritSkill, extended);
	}
	
	@Override
	protected void onInit() throws Exception {
		//获取SKILL文件
		prepareSkillInfo();
		if(!this.isRemote()) {
			prepareSkillFiles();
		}
		
		super.onInit();
	}
	
	protected void prepareSkillInfo()throws Exception {
		
		//判断是否存在元数据文件
		File metadataFile = new File(this.getSkillFolder().getCanonicalPath() + File.separator + METADATAFILE);
		if(metadataFile.exists()) {
			String strYamlContent = FileUtils.readFileToString(metadataFile, "UTF-8");
			ConfigEntityEx configEntityEx = new ConfigEntityEx(strYamlContent, true);
			this.setName(configEntityEx.getString("name", null));
			this.setDescription(configEntityEx.getString("description", null));
			this.setVersion(configEntityEx.getString("version", this.getVersion()));
			this.setRemote(true);
			return;
		}
		
		
		File skillFile = new File(this.getSkillFolder().getCanonicalPath() + File.separator + SKILLFILE);
		if(!skillFile.exists() || !skillFile.isFile()) {
			if(this.getInheritSkill() != null) {
				this.setName(this.getInheritSkill().getName());
				this.setDescription(this.getInheritSkill().getDescription());
				this.setVersion(this.getInheritSkill().getVersion());
				this.setPrompt(this.getInheritSkill().getPrompt());
				return;
			}
			throw new Exception("技能文件不存在");
		}
		
		String strOriginContent = FileUtils.readFileToString(skillFile, "UTF-8");
		String strSkillContent = strOriginContent;
		//找到第一个 ---
		int nPos = strSkillContent.indexOf("---");
		if(nPos == -1) {
			throw new Exception("无法定位第一个`---`");
		}
		
		strSkillContent = strSkillContent.substring(nPos + 3);
		nPos = strSkillContent.indexOf("---");
		if(nPos == -1) {
			throw new Exception("无法定位第二个`---`");
		}
		
		String strYamlContent = strSkillContent.substring(0, nPos);
		ConfigEntityEx configEntityEx = new ConfigEntityEx(strYamlContent, true);
		this.setName(configEntityEx.getString("name", null));
		this.setDescription(configEntityEx.getString("description", null));
		this.setVersion(configEntityEx.getString("version", this.getVersion()));
		
		//String strPrompt = strSkillContent.substring(nPos + 3);
		this.setPrompt(strOriginContent);
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
		
		File realFile = new File(this.getSkillFolder().getCanonicalPath() + File.separator + filePath);
		if(realFile.exists()) {
			return FileUtils.readFileToString(realFile, "UTF-8");
		}
		if(this.getInheritSkill() != null) {
			return this.getInheritSkill().readFile(filePath);
		}
		throw new IOException("指定文件不存在");
	}
	
	@Override
	public boolean containsFile(String filePath){
		try {
			File realFile = new File(this.getSkillFolder().getCanonicalPath() + File.separator + filePath);
			if(realFile.exists()) {
				return true;
			}
		} catch (IOException e) {
			
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
		if(!this.isExtended()) {
			return;
		}
	    Path startingPath = this.getSkillFolder().toPath();
	    try (Stream<Path> paths = Files.walk(startingPath)) {
	        this.extendedFileMap = Collections.unmodifiableMap(paths
	                .filter(Files::isRegularFile)
	                .collect(Collectors.toMap(
	                        path -> startingPath.relativize(path).toString().replace('\\', '/'),
	                        Path::toFile,
	                        (existing, replacement) -> existing, // 如果出现重复key，保留已存在的值
	                        LinkedHashMap::new // 使用LinkedHashMap保持插入顺序
	                )));
	    }
	    
	    for(java.util.Map.Entry<String, File> entry : this.extendedFileMap.entrySet()) {
	    	String strContent = FileUtils.readFileToString(entry.getValue(), "UTF-8");
	    	if(StringUtils.hasLength(strContent)) {
	    		this.extendedData.put(entry.getKey(), strContent);
	    	}
	    	
	    }
	    
	    //**Job 配置模板**: 参见 `references/job_templates.md`
	    String strPrompt = this.getPrompt();
	    
	    StringBuilder sb = new StringBuilder();
	    
	    //扩展描述文件
	    for(java.util.Map.Entry<String, String> entry : this.extendedData.entrySet()) {
	    	
	    	if(entry.getKey().indexOf(SCRIPTFILE_PREFIX) ==0 ) {
	    		extendedScripts.put(entry.getKey(), entry.getValue());
	    		continue;
	    	}
	    	
	    	if(entry.getKey().indexOf(REFERENCEFILE_PREFIX) !=0 ) {
	    		continue;
	    	}
	    	
	    	if(strPrompt.indexOf(entry.getKey()) != -1) {
	    		log.error(String.format("忽略扩展参考[%1$s]，提示词已经定义", entry.getKey()));
	    		continue;
	    	}
	    	
	    	String strSkillContent = entry.getValue();
	    	
	    	try {
		    	//提取内容
		    	int nPos = strSkillContent.indexOf("---");
				if(nPos == -1) {
					throw new Exception("无法定位第一个`---`");
				}
				
				strSkillContent = strSkillContent.substring(nPos + 3);
				nPos = strSkillContent.indexOf("---");
				if(nPos == -1) {
					throw new Exception("无法定位第二个`---`");
				}
				
				String strYamlContent = strSkillContent.substring(0, nPos);
				ConfigEntityEx configEntityEx = new ConfigEntityEx(strYamlContent, true);
				String strName = configEntityEx.getString("name", null);
				String strDescription = configEntityEx.getString("description", null);
				
				if(!StringUtils.hasLength(strName)) {
					continue;
				}
				
				sb.append(String.format("- **%1$s**", strName));
				if(StringUtils.hasLength(strDescription)) {
					sb.append(String.format(": %1$s", strDescription));
				}
				sb.append(String.format("。参见`%1$s`\n", entry.getKey()));
	    	}
	    	catch (Throwable ex) {
				log.error(String.format("展开扩展参考[%1$s]发生异常，%2$s", entry.getKey(), ex.getMessage()), ex);
			}
	    }
	    
	    if(sb.length() > 0) {
	    	
	    	strPrompt += "\n## 用户扩展参考\n";
	    	strPrompt += sb.toString();
	    	this.setPrompt(strPrompt);
	    }
	}
	
	
	@Override
	public Map<String, String> getExtendedData() {
		return this.extendedData;
	}

	@Override
	public Map<String, String> getExtendedScripts() {
		return extendedScripts;
	}
	
	@Override
	public String getPrompt() {
		if(!StringUtils.hasLength(super.getPrompt()) && this.isRemote()) {
			//提取
			try {
				File realFile = new File(this.getSkillFolder().getCanonicalPath() + File.separator + SKILLFILE);
				String strOriginContent = FileUtils.readFileToString(realFile, "UTF-8");
				this.setPrompt(strOriginContent);
			}
			catch (Exception ex) {
				log.error(String.format("重新加载技能提示词发生异常，%1$s", ex.getMessage()), ex);
			}
		}
		
		return super.getPrompt();
	}
	
}
