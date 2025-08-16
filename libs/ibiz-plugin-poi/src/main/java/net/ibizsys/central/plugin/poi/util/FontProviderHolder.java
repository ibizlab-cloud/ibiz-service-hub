package net.ibizsys.central.plugin.poi.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.lowagie.text.Font;

import fr.opensagres.xdocreport.itext.extension.font.IFontProvider;

public class FontProviderHolder {

	private static IFontProvider fontProvider = null;
	private static String strFontFolder = null;
	
	private static Map<String, String> fontFilePathMap = new ConcurrentHashMap<>();
	
	static {
		registerFontFilePath("宋体", Font.NORMAL, "simsun.ttc,1;simsun.ttf");
		registerFontFilePath("等线", Font.NORMAL, "Deng.ttf");
		registerFontFilePath("等线", Font.BOLD, "Dengb.ttf");
		registerFontFilePath("仿宋", Font.NORMAL, "simfang.ttf");
		registerFontFilePath("仿宋体", Font.NORMAL, "simfang.ttf");
		registerFontFilePath("黑体", Font.NORMAL, "simhei.ttf");
		
		//registerFontFilePath("等线", Font.NORMAL, "Dengl.ttf,1");
	}
	
//	/** this is a possible style. */
//	public static final int NORMAL = 0;
//
//	/** this is a possible style. */
//	public static final int BOLD = 1;
//
//	/** this is a possible style. */
//	public static final int ITALIC = 2;
//
//	/** this is a possible style. */
//	public static final int UNDERLINE = 4;
//
//	/** this is a possible style. */
//	public static final int STRIKETHRU = 8;
//
//	/** this is a possible style. */
//	public static final int BOLDITALIC = BOLD | ITALIC;
	
	
	public static IFontProvider getFontProvider() {
		if(FontProviderHolder.fontProvider == null) {
			FontProviderHolder.fontProvider = new DefaultFontProvider();
		}
		return FontProviderHolder.fontProvider;
	}
	
	public static void setFontProvider(IFontProvider fontProvider) {
		FontProviderHolder.fontProvider = fontProvider;
	}
	
	
	public static String getFontFolder() {
	return FontProviderHolder.strFontFolder;
	}
	
	public static void setFontFolder(String strFontFolder) {
		FontProviderHolder.strFontFolder = strFontFolder;
	}
	
	public static void registerFontFilePath(String strFontName, int nFontStyle, String strFilePath) {
		String strKey = String.format("%1$s|%2$s", strFontName, nFontStyle);
		FontProviderHolder.fontFilePathMap.put(strKey, strFilePath);
	}
	
	
	public static String getFontFilePath(String strFontName, int nFontStyle, boolean bIncludeStyle) {
		for(java.util.Map.Entry<String, String> entry : fontFilePathMap.entrySet()) {
			String strKey = entry.getKey();
			String[] items = strKey.split("[|]");
			if(items.length != 2) {
				continue;
			}
			if(!items[0].equals(strFontName)) {
				continue;
			}
			int nStyle = Integer.parseInt(items[1]);
			if(nStyle == nFontStyle) {
				return entry.getValue();
			}
			if(bIncludeStyle) {
				if((nStyle & nFontStyle) == nFontStyle) {
					return entry.getValue();
				}
				if(nFontStyle == 0 || nStyle == 0) {
					return entry.getValue();
				}
			}
			
		}
		return null;
	}
	
}
