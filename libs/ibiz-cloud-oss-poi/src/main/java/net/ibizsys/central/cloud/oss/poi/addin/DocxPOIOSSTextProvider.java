package net.ibizsys.central.cloud.oss.poi.addin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import fr.opensagres.poi.xwpf.converter.core.ImageManager;
import fr.opensagres.poi.xwpf.converter.xhtml.XHTMLConverter;
import fr.opensagres.poi.xwpf.converter.xhtml.XHTMLOptions;

public class DocxPOIOSSTextProvider extends POIOSSTextProviderBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(DocxPOIOSSTextProvider.class);

	@Override
	protected Object doGetText(String cat, String fileId, File file, String type, Map<String, Object> params, File textFile) throws Throwable {
		if (!isSuperEnabled()) {
			if (type.equals(TYPE_HTML)) {
				// 以下功能会丢失emf文件
				//加载.docx文档
				try (FileInputStream fis = new FileInputStream(file); XWPFDocument document = new XWPFDocument(fis); FileOutputStream fos = new FileOutputStream(textFile)) {
					// 配置转换选项，设置图片保存路径
					XHTMLOptions options = XHTMLOptions.create();
					ImageManager imageManager = new ImageManager(textFile.getParentFile(), textFile.getName() + ".images");
					options.setImageManager(imageManager);
					//执行转换
					XHTMLConverter.getInstance().convert(document, fos, options);
					return null;
				}
			}
		}
		return super.doGetText(cat, fileId, file, type, params, textFile);
	}
	
	
}
