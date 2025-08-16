package net.ibizsys.central.plugin.jgit.sysutil;

import java.io.File;

import org.springframework.util.StringUtils;

import net.ibizsys.central.sysutil.SysSCMUtilRuntimeBase;
import net.ibizsys.runtime.util.IAction;

public abstract class JGitSysSCMUtilRuntimeBase extends SysSCMUtilRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(JGitSysSCMUtilRuntimeBase.class);
	private String strRootFolderPath = null;
	
	@Override
	protected void onInit() throws Exception {
		// TODO Auto-generated method stub
		super.onInit();
		
		String strRootFolderPath = this.getSystemRuntime().getFileFolder() + File.separator + "scm" + File.separator + this.getPSSysUtil().getCodeName();
		this.setRootFolderPath(strRootFolderPath);
	}
	
	protected String getRootFolderPath() {
		return this.strRootFolderPath;
	}

	protected void setRootFolderPath(String strRootFolderPath) {
		this.strRootFolderPath = strRootFolderPath;
	}
	
	
	@Override
	protected String onCheckout(String strSCMPath, String strLocalPath, IAction iAction) throws Throwable {
		if(!StringUtils.hasLength(strLocalPath)) {
			//未指定路径，重新计算
			String[] items = strSCMPath.split("[/]");
			String strGitPrj = items[items.length-1];
			if(strGitPrj.indexOf(".git") == strGitPrj.length() -4 ) {
				strGitPrj = strGitPrj.substring(0, strGitPrj.length() -4);
				strLocalPath = String.format("%1$s%2$s%3$s", this.getRootFolderPath(), File.separator, strGitPrj);
			}
		}
		
		return strLocalPath;
	}
	
	
	@Override
	protected void onCheckin(String strLocalPath) throws Throwable {
		// TODO Auto-generated method stub
		super.onCheckin(strLocalPath);
	}
}
