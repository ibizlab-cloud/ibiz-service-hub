package net.ibizsys.central.cloud.oss.poi.addin;

import java.io.File;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.springframework.util.StringUtils;

public class PdfPOIOSSTextProvider extends POIOSSTextProviderBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(PdfPOIOSSTextProvider.class);

	
	@Override
	protected Object doGetText(String cat, String fileId, File file, String type, Map<String, Object> params, File textFile) throws Throwable {
		
		if (type.equals(TYPE_PAGEINDEX)) {
			String strMarkdown = this.getPdfText(cat, file, TYPE_MD, params, textFile, true);
			return this.getPageIndexContent(strMarkdown);
		}
		
		if (type.equals(TYPE_MD)) {
			if(isAlwaysUseImageMode()) {
				return this.getPdfText(cat, file, type, params, textFile, true);
			}
			boolean bImageMode = false;
			
			//判断是否为图片
			try (PDDocument document = PDDocument.load(file)) {
				PDFTextStripper stripper = new PDFTextStripper();
				int totalPages = document.getNumberOfPages();
				if(totalPages > 0) {
					//System.out.println("总页数: " + totalPages);
					int nTotalLength = 0;
		            // 遍历每一页
		            for (int pageIndex = 1; pageIndex <= totalPages; pageIndex++) {
		                // 设置起始和结束页为当前页，实现逐页提取
		                stripper.setStartPage(pageIndex);
		                stripper.setEndPage(pageIndex);
		                // 提取当前页的文本
		                String pageText = stripper.getText(document);
		                if(StringUtils.hasLength(pageText)) {
		                	nTotalLength += pageText.length();
		                }
		            }
		            bImageMode = ( nTotalLength/totalPages)<=30;
				}
				else
					return "";            
			} catch (Throwable ex) {
				log.error(String.format("提取PDF文本内容发生异常，%1$s", ex.getMessage()), ex);
				throw new Exception(String.format("提取PDF文本内容发生异常，%1$s", ex.getMessage()), ex);
			}
			
			return this.getPdfText(cat, file, type, params, textFile, bImageMode);
		}
		
		return super.doGetText(cat, fileId, file, type, params, textFile);
	}

	protected boolean isAlwaysUseImageMode() {
		return true;
	}
}
