package net.ibizsys.central.cloud.oss.poi.addin;

import java.io.File;
import java.nio.file.Paths;
import java.util.Map;

import org.ofdrw.converter.ConvertHelper;

public class OfdPOIOSSTextProvider extends PdfPOIOSSTextProvider {

	@Override
	protected Object doGetText(String cat, String fileId, File file, String type, Map<String, Object> params, File textFile) throws Throwable {

		File folder = this.getTextFolder(file, "pdf");
		File pdfFile = new File(folder.getAbsolutePath() + File.separator + file.getName() + "." + "pdf");
		if(!pdfFile.exists()) {
			try {
				ConvertHelper.toPdf(Paths.get(file.getCanonicalPath()), pdfFile);
			}
			catch (Throwable ex) {
				throw new Exception(String.format("转化ofd至pdf文件发生异常，%1$s", ex.getMessage()), ex);
			}
		}

		return super.doGetText(cat, fileId, pdfFile, type, params, textFile);
	}
}
