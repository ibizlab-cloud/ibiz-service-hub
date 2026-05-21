package net.ibizsys.central.cloud.oss.poi.addin;

import java.io.File;
import java.util.Base64;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

public class CsvPOIOSSTextProvider extends XlsxPOIOSSTextProvider {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(CsvPOIOSSTextProvider.class);
	
	public final static String TYPE_BASE64_XLSX = TYPE_BASE64_PREFIX + "xlsx";
	
	@Override
	protected Object doGetText(String cat, String fileId, File file, String type, Map<String, Object> params, File textFile) throws Throwable {

		if ((type.equals(TYPE_JSON) || type.equals(TYPE_BASE64_XLSX)) && StringUtils.hasLength(getLibreOfficeCommandPath())) {
			//需要进一步转为为Excel文件
			File folder = this.getTextFolder(file, "xlsx");
			File xlsxFile = null;
			File[] files = folder.listFiles();
			if(files != null && files.length > 0) {
				for(File item : files) {
					String strExt = FilenameUtils.getExtension(item.getName());
					if("xlsx".equalsIgnoreCase(strExt)) {
						xlsxFile = item;
						break;
					}
				}
			}
			
			int nIndex = 0;
			while(xlsxFile == null) {
				File command = new File(getLibreOfficeCommandPath());
				//String strCommand = String.format("%1$s --headless --invisible --convert-to pdf --outdir \"%2$s\" \"%3$s\"", command.getCanonicalPath(), pdfDir.getCanonicalPath(), file.getCanonicalPath());
				String[] commandArray = {
						command.getCanonicalPath(),
						"--headless",
						"--invisible",
						"--convert-to", "xlsx",
						"--outdir", folder.getCanonicalPath(),
						file.getCanonicalPath()  // 自动处理空格
				};
				ExecuteResult result = executeCommandArray(commandArray, null, COMMAND_TIMEOUT);
				files = folder.listFiles();
				if(files != null && files.length > 0) {
					for(File item : files) {
						String strExt = FilenameUtils.getExtension(item.getName());
						if("xlsx".equalsIgnoreCase(strExt)) {
							xlsxFile = item;
							break;
						}
					}
				}
				
				if(xlsxFile == null) {
					log.error(String.format("生成Xlsx文件发生异常，exit_code[%1$s]\r\ninfo: %2$s\r\nerror: %3$s", result.exitValue, result.standardOutput, result.errorOutput));
					nIndex ++;
					if(nIndex == 5) {
						throw new Exception("生成Xlsx文件发生异常，请稍后重试");
					}
					Thread.sleep(200);
				}
				else {
					break;
				}
			}
			
			if(type.equals(TYPE_BASE64_XLSX)) {
				return Base64.getEncoder().encodeToString(FileUtils.readFileToByteArray(xlsxFile));
			}
			
			return super.doGetText(cat, fileId, xlsxFile, type, params, textFile);
		}

		return super.doGetText(cat, fileId, file, type, params, textFile);
	}
}
