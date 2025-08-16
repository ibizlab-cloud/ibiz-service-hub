package net.ibizsys.central.plugin.python.service;

import java.io.File;
import java.net.URI;

import org.apache.commons.io.FileUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.service.SubSysRestServiceAPIRuntimeBase;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.service.ISubSysServiceAPIDERuntime;
import net.ibizsys.model.service.IPSSubSysServiceAPIDE;

public class PythonSubSysServiceAPIRuntime extends SubSysRestServiceAPIRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(PythonSubSysServiceAPIRuntime.class);
	
	/**
	 * 功能实体：清单对象
	 */
	public final static String UTILDE_REQUIREMENTS = "__REQUIREMENTS__";
	
	/**
	 * 功能实体：主对象
	 */
	public final static String UTILDE_MAIN = "__MAIN__";
	
	
	private String pythonProjectFolder = null;
	
	@Override
	protected void onInit() throws Exception {
		
		super.onInit();
		
		preparePythonProjectFolder();
		preparePythonProject();
	}
	
	protected void preparePythonProjectFolder() throws Exception{
		if(!StringUtils.hasLength(this.getPythonProjectFolder())) {
		//	String pythonProjectFolder = String.format("%1$s%2$spythons%2$s%3$s", this.getSystemRuntime().getFileFolder(), File.separator, this.getPSSubSysServiceAPI().getCodeName().toLowerCase());
			String pythonProjectFolder = String.format("%1$s%2$spythons%2$s%3$s", "/api_code", File.separator, this.getPSSubSysServiceAPI().getCodeName().toLowerCase());
			
			this.setPythonProjectFolder(pythonProjectFolder);
		}
		
		File folder = new File(this.getPythonProjectFolder());
		folder.mkdirs();
	}
	
	protected void setPythonProjectFolder(String pythonProjectFolder) {
		this.pythonProjectFolder = pythonProjectFolder;
	}
	
	public String getPythonProjectFolder() {
		return this.pythonProjectFolder;
	}
	
	protected void preparePythonProject() throws Exception{
		
		java.util.List<IPSSubSysServiceAPIDE> psSubSysServiceAPIDEList = this.getPSSubSysServiceAPI().getAllPSSubSysServiceAPIDEs();
		if(ObjectUtils.isEmpty(psSubSysServiceAPIDEList)) {
			return;
		}
		
		String serviceUrl = this.getServiceUrl();
		if(!StringUtils.hasLength(serviceUrl)) {
			serviceUrl = "";
		}
		//生成配置文件
		if(true) {
			String code = String.format("api_url = '%1$s'\r\n", serviceUrl);
			if(StringUtils.hasLength(serviceUrl)) {
				URI uri = new URI(serviceUrl);
				code += String.format("api_port = %1$s\r\n", uri.getPort());
			}
			else {
				code += String.format("api_port = %1$s\r\n", 80);
			}
			if(StringUtils.hasLength(this.getPSSubSysServiceAPI().getName())) {
				code += String.format("api_name = '%1$s'\r\n",this.getPSSubSysServiceAPI().getName());
			}
			else {
				code += String.format("api_name = ''\r\n");
			}
			if(StringUtils.hasLength(this.getPSSubSysServiceAPI().getCodeName())) {
				code += String.format("api_codename = '%1$s'\r\n",this.getPSSubSysServiceAPI().getCodeName());
			}
			else {
				code += String.format("api_codename = ''\r\n");
			}
			if(StringUtils.hasLength(this.getPSSubSysServiceAPI().getAPITag())) {
				code += String.format("api_tag = '%1$s'\r\n",this.getPSSubSysServiceAPI().getAPITag());
			}
			else {
				code += String.format("api_tag = ''\r\n");
			}
			if(StringUtils.hasLength(this.getPSSubSysServiceAPI().getAPITag2())) {
				code += String.format("api_tag2 = '%1$s'\r\n",this.getPSSubSysServiceAPI().getAPITag2());
			}
			else {
				code += String.format("api_tag2 = ''\r\n");
			}
			if(StringUtils.hasLength(getServiceParam())) {
				code += String.format("api_serviceparam = '%1$s'\r\n",getServiceParam());
			}
			else {
				code += String.format("api_serviceparam = ''\r\n");
			}
			if(StringUtils.hasLength(getServiceParam2())) {
				code += String.format("api_serviceparam2 = '%1$s'\r\n",getServiceParam2());
			}
			else {
				code += String.format("api_serviceparam2 = ''\r\n");
			}
			if(StringUtils.hasLength(getServiceParam3())) {
				code += String.format("api_serviceparam3 = '%1$s'\r\n",getServiceParam3());
			}
			else {
				code += String.format("api_serviceparam3 = ''\r\n");
			}
			if(StringUtils.hasLength(getServiceParam4())) {
				code += String.format("api_serviceparam4 = '%1$s'\r\n",getServiceParam4());
			}
			else {
				code += String.format("api_serviceparam4 = ''\r\n");
			}
			if(StringUtils.hasLength(getAuthMode())) {
				code += String.format("api_authmode = '%1$s'\r\n",getAuthMode());
			}
			else {
				code += String.format("api_authmode = ''\r\n");
			}
			if(StringUtils.hasLength(getClientId())) {
				code += String.format("api_clientid = '%1$s'\r\n",getClientId());
			}
			else {
				code += String.format("api_clientid = ''\r\n");
			}
			if(StringUtils.hasLength(getClientSecret())) {
				code += String.format("api_clientsecret = '%1$s'\r\n",getClientSecret());
			}
			else {
				code += String.format("api_clientsecret = ''\r\n");
			}
			if(StringUtils.hasLength(getAuthParam())) {
				code += String.format("api_authparam = '%1$s'\r\n",getAuthParam());
			}
			else {
				code += String.format("api_authparam = ''\r\n");
			}
			if(StringUtils.hasLength(getAuthParam2())) {
				code += String.format("api_authparam2 = '%1$s'\r\n",getAuthParam2());
			}
			else {
				code += String.format("api_authparam2 = ''\r\n");
			}
			if(StringUtils.hasLength(getAuthParam3())) {
				code += String.format("api_authparam3 = '%1$s'\r\n",getAuthParam3());
			}
			else {
				code += String.format("api_authparam3 = ''\r\n");
			}
			if(StringUtils.hasLength(getAuthParam4())) {
				code += String.format("api_authparam4 = '%1$s'\r\n",getAuthParam4());
			}
			else {
				code += String.format("api_authparam4 = ''\r\n");
			}
			//附加本地服务标识
			code += String.format("local_serviceid = '%1$s'\r\n",this.getSystemRuntime().getServiceId());
			code += String.format("local_port = %1$s\r\n", ServiceHub.getInstance().getPort());
			
			File file = new File(String.format("%1$s%2$s%3$s", this.getPythonProjectFolder(), File.separator, "config.py"));
			
			
			FileUtils.write(file, code, "UTF-8", false);
			
			log.debug(String.format("外部服务接口[%1$s]配置路径[%2$s]", this.getName(), file.getAbsolutePath()));
		}
		
		for(IPSSubSysServiceAPIDE psSubSysServiceAPIDE : psSubSysServiceAPIDEList) {
			//ISubSysServiceAPIDERuntime subSysServiceAPIDERuntime = this.getSubSysServiceAPIDERuntime(psSubSysServiceAPIDE.getId(), false);
			if(!PythonSubSysServiceAPIDERuntime.isUtilDE(psSubSysServiceAPIDE.getName())) {
				continue;
			}
			
			String code = psSubSysServiceAPIDE.getMethodScriptCode();
			if(!StringUtils.hasLength(code)) {
				continue;
			}
			
			File file = new File(String.format("%1$s%2$s%3$s", this.getPythonProjectFolder(), File.separator, this.getPythonFileName(psSubSysServiceAPIDE)));
			
			FileUtils.write(file, code, "UTF-8", false);
		}
	}
	
	protected String getPythonFileName(IPSSubSysServiceAPIDE psSubSysServiceAPIDE) {
		String name = psSubSysServiceAPIDE.getName();
		if(UTILDE_MAIN.equalsIgnoreCase(name)) {
			return "main.py";
		}
		
		if(UTILDE_REQUIREMENTS.equalsIgnoreCase(name)) {
			return "requirements.txt";
		}
		
		return String.format("%1$s.py", psSubSysServiceAPIDE.getCodeName()).toLowerCase();
	}
	
	@Override
	protected ISubSysServiceAPIDERuntime createDefaultSubSysServiceAPIDERuntime() {
		return new PythonSubSysServiceAPIDERuntime();
	}
	
	
	
}
