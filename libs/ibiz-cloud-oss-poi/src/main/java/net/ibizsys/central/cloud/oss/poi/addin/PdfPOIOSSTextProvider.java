package net.ibizsys.central.cloud.oss.poi.addin;

import java.io.File;

import org.apache.commons.logging.LogFactory;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PdfPOIOSSTextProvider extends POIOSSTextProviderBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(PdfPOIOSSTextProvider.class);

	@Override
	public String getText(File file) throws Throwable {
		try (PDDocument document = PDDocument.load(file)) {
			PDFTextStripper stripper = new PDFTextStripper();
			return stripper.getText(document);
		} catch (Throwable ex) {
			log.error(String.format("提取PDF文本内容发生异常，%1$s", ex.getMessage()), ex);
			throw new Exception(String.format("提取PDF文本内容发生异常，%1$s", ex.getMessage()), ex);
		}
	}
}
