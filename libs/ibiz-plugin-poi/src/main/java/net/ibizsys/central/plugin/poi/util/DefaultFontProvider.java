package net.ibizsys.central.plugin.poi.util;

import java.awt.Color;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.util.StringUtils;

import com.lowagie.text.Font;
import com.lowagie.text.pdf.BaseFont;

import fr.opensagres.xdocreport.itext.extension.font.IFontProvider;

public class DefaultFontProvider implements IFontProvider{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DefaultFontProvider.class);
	
	private Map<String, Font> fontMap = new ConcurrentHashMap<>();
	
	private static String[] defaultFonts = new String[] {"simsun.ttc,1", "simsun.ttf"};
	
	
	@Override
	public Font getFont(String familyName, String encoding, float size, int style, Color color) {
		try {
			String strKey = String.format("%1$s|%2$s", familyName, style);
			Font font = fontMap.get(strKey);
			if(font == null) {
				font = this.createFont(familyName, encoding, size, style, color);
				if(font != null) {
					//fontMap.put(strKey, font);
				}
			}
			return font;
			
			
		} catch (Exception ex) {
			log.error(ex);
			return null;
		}
	}
	
	protected Font createFont(String familyName, String encoding, float size, int style, Color color) throws Exception{
	
		if(!StringUtils.hasLength(FontProviderHolder.getFontFolder())) {
			throw new Exception("未定义字体目录");
		}
		
		String strPath = FontProviderHolder.getFontFilePath(familyName, style, false);
		if(!StringUtils.hasLength(strPath)) {
			strPath = FontProviderHolder.getFontFilePath(familyName, style, true);
		}
		
		
		if(StringUtils.hasLength(strPath)) {
			String[] paths = strPath.split("[;]");
			for(String path : paths) {
				
				//判断文件是否存在
				String[] items = path.split("[,]");
				String strFullPath = String.format("%1$s%2$s%3$s", FontProviderHolder.getFontFolder(), File.separator, items[0]);
				if(new File(strFullPath).exists()) {
					if(items.length==2) {
						strFullPath += (","+items[1]);
					}
					BaseFont bfChinese = BaseFont.createFont(strFullPath, encoding, BaseFont.NOT_EMBEDDED);
					Font fontChinese = new Font(bfChinese, size, style, color);
					if (familyName != null) {
						fontChinese.setFamily(familyName);
					}
					return fontChinese;
				}
				
			}
			
		}
		
		for(String path : defaultFonts) {
			strPath = path;
			String[] items = strPath.split("[,]");
			String strFullPath = String.format("%1$s%2$s%3$s", FontProviderHolder.getFontFolder(), File.separator, items[0]);
			if(new File(strFullPath).exists()) {
				if(items.length==2) {
					strFullPath += (","+items[1]);
				}
				BaseFont bfChinese = BaseFont.createFont(strFullPath, encoding, BaseFont.NOT_EMBEDDED);
				Font fontChinese = new Font(bfChinese, size, style, color);
				if (familyName != null) {
					fontChinese.setFamily(familyName);
				}
				return fontChinese;
			}
		}
		
		
		return null;
		
	}
}
