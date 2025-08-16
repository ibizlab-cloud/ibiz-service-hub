package net.ibizsys.central.res;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.util.KeyValueUtils;

public abstract class SysDEFileResourceRuntimeBase extends SysFileResourceRuntimeBase implements ISysDEFileResourceRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysDEFileResourceRuntimeBase.class);

	@Override
	protected void onInit() throws Exception {
		super.onInit();
	}
	
	@Override
	protected void prepareDefaultFile() throws Exception {
	
		IDataEntityRuntime iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(this.getPSSysResource().getPSDataEntityMust().getId());
		IPSDEDataSet iPSDEDataSet = this.getPSSysResource().getPSDEDataSet();
		if(iPSDEDataSet == null) {
			iPSDEDataSet = iDataEntityRuntime.getDefaultPSDEDataSet();
		}
		
		IPSDEField namePSDEField = this.getPSSysResource().getNamePSDEFieldMust();
		IPSDEField contentPSDEField = this.getPSSysResource().getContentPSDEFieldMust();
		IPSDEField pathPSDEField = this.getPSSysResource().getPathPSDEField();
		
		ISearchContextDTO iSearchContextDTO = iDataEntityRuntime.createSearchContext();
		iSearchContextDTO.all().count(false);
		
		File tempFile = File.createTempFile("resource", ".cat");
		String folderPath = tempFile.getParentFile().getAbsolutePath() + File.separator + KeyValueUtils.genUniqueId();
		File folder = new File(folderPath);
		
		List<IEntityDTO> list = iDataEntityRuntime.selectDataSet(iPSDEDataSet, iSearchContextDTO);
		if(!ObjectUtils.isEmpty(list)) {
			for(IEntityDTO iEntityDTO : list) {
				String strFilePath = null;
				String strName =  iEntityDTO.getString(namePSDEField.getLowerCaseName(), null);;
				String strContent =  iEntityDTO.getString(contentPSDEField.getLowerCaseName(), null);;
			
				if(pathPSDEField != null) {
					strFilePath = iEntityDTO.getString(pathPSDEField.getLowerCaseName(), null);
				}
				if(!StringUtils.hasLength(strFilePath)) {
					strFilePath = strName;
				}
				
				if(strFilePath.indexOf("/") == 0 || strFilePath.indexOf("\\") == 0) {
					strFilePath = strFilePath.substring(1);
				}
				
				String strFullPath = String.format("%1$s%2$s%3$s", folderPath, File.separator, strFilePath);
				File file = new File(strFullPath);
				file.getParentFile().mkdirs();
				FileUtils.writeStringToFile(file, strContent, "UTF-8");
				
				if(!file.exists()) {
					throw new Exception(String.format("无法写入内容[%1$s]至[%2$s]", strName, strFullPath));
				}
			}
		}

		this.setDefaultFile(folder);
		this.setDefaultFileMode(true);
		
		//super.prepareFile();
	}

	@Override
	protected void onReload() throws Throwable {
		prepareDefaultFile();
		super.onReload();
	}
	
	
}
