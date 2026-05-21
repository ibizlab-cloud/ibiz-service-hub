package net.ibizsys.central.cloud.oss.poi.addin;

import java.io.File;
import java.util.Map;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

public class PptxPOIOSSTextProvider extends POIOSSTextProviderBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(PptxPOIOSSTextProvider.class);

	@Override
	protected Object doGetText(String cat, String fileId, File file, String type, Map<String, Object> params, File textFile) throws Throwable {
		//先生成PDF文件
		if (type.equals(TYPE_MD)) {
			if (StringUtils.hasLength(this.getLibreOfficeCommandPath())) {
				File pdfDir = new File(file.getParentFile().getAbsolutePath() + File.separator + ".pdf");
				if (!pdfDir.exists()) {
					pdfDir.mkdirs();
				}
				
				File pdfFile = null;
				File[] files = pdfDir.listFiles();
				if(files != null && files.length > 0) {
					for(File item : files) {
						String strExt = FilenameUtils.getExtension(item.getName());
						if("pdf".equalsIgnoreCase(strExt)) {
							pdfFile = item;
							break;
						}
					}
				}
				if(pdfFile == null) {
					File command = new File(getLibreOfficeCommandPath());
					//String strCommand = String.format("%1$s --headless --invisible --convert-to pdf --outdir \"%2$s\" \"%3$s\"", command.getCanonicalPath(), pdfDir.getCanonicalPath(), file.getCanonicalPath());
					String[] commandArray = {
							command.getCanonicalPath(),
							"--headless",
							"--invisible",
							"--convert-to", "pdf",
							"--outdir", pdfDir.getCanonicalPath(),
							file.getCanonicalPath()  // 自动处理空格
					};
					ExecuteResult result = executeCommandArray(commandArray, null, COMMAND_TIMEOUT);
					files = pdfDir.listFiles();
					if(files != null && files.length > 0) {
						for(File item : files) {
							String strExt = FilenameUtils.getExtension(item.getName());
							if("pdf".equalsIgnoreCase(strExt)) {
								pdfFile = item;
								break;
							}
						}
					}
				}
				
				if(pdfFile != null) {
					return getPdfText(cat, pdfFile, type, null, textFile, true);
				}
			}
		}
		
		
		return super.doGetText(cat, fileId, file, type, params, textFile);
	}
	
	
}
