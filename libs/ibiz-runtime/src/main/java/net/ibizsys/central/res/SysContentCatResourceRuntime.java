package net.ibizsys.central.res;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.model.res.IPSSysContent;
import net.ibizsys.model.res.IPSSysContentCat;
import net.ibizsys.runtime.util.KeyValueUtils;

public class SysContentCatResourceRuntime extends SysFileResourceRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysContentCatResourceRuntime.class);
	

	@Override
	protected void prepareDefaultFile() throws Exception {
	
		IPSSysContentCat iPSSysContentCat = this.getPSSysResource().getPSSysContentCat();
		
		if(iPSSysContentCat == null) {
			String strSysContentTag = this.getContent();
			if(!StringUtils.hasLength(strSysContentTag)) {
				//throw new Exception("未指定内容分类标识");
				strSysContentTag = this.getFullUniqueTag();
			}
			iPSSysContentCat = this.getSystemRuntime().getPSSystemService().getPSSysContentCat(strSysContentTag, false);
		}
		
		File tempFile = File.createTempFile("resource", ".cat");
		String folderPath = tempFile.getParentFile().getAbsolutePath() + File.separator + KeyValueUtils.genUniqueId();
		File folder = new File(folderPath);
		
		//写入文件
		List<IPSSysContent> psSysContents = iPSSysContentCat.getPSSysContents();
		if(!ObjectUtils.isEmpty(psSysContents)) {
			for(IPSSysContent iPSSysContent : psSysContents) {
				String strContentPath = iPSSysContent.getContentPath();
				if(!StringUtils.hasLength(strContentPath)) {
					log.warn(String.format("系统内容[%1$s]未定义内容路径，使用内容名称", iPSSysContent.getName()));
					//continue;
					strContentPath = iPSSysContent.getName();
				}
				
				if(strContentPath.indexOf("/") == 0 || strContentPath.indexOf("\\") == 0) {
					strContentPath = strContentPath.substring(1);
				}
				
				String strFullPath = String.format("%1$s%2$s%3$s", folderPath, File.separator, strContentPath);
				File file = new File(strFullPath);
				file.getParentFile().mkdirs();
				FileUtils.writeStringToFile(file, iPSSysContent.getContent(), "UTF-8");
				
				if(!file.exists()) {
					throw new Exception(String.format("无法写入内容[%1$s]至[%2$s]", iPSSysContent.getName(), strFullPath));
				}
			}
		}
		

		this.setDefaultFile(folder);
		this.setDefaultFileMode(true);
		
		//super.prepareFile();
	}



	
}
