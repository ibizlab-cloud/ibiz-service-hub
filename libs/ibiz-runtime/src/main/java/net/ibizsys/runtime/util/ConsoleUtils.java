package net.ibizsys.runtime.util;

/**
 * 控制台信息辅助对象
 * @author lionlau
 *
 */
public class ConsoleUtils {


	public static String getContent(String strContent,int nColor) {
		return getContent(strContent,nColor,-1);
	}

	public static String getContent(String strContent,int nColor,int nBKColor) {
		return getContent(strContent,nColor,nBKColor,-1);
	}
	/*
	 * 
显示方式:0（默认值）、1（高亮）、22（非粗体）、4（下划线）、24（非下划线）、5（闪烁）、25（非闪烁）、7（反显）、27（非反显） 
 
前景色:30（黑色）、31（红色）、32（绿色）、 33（黄色）、34（蓝色）、35（洋红）、36（青色）、37（白色） 
 
背景色:40（黑色）、41（红色）、42（绿色）、 43（黄色）、44（蓝色）、45（洋红）、46（青色）、47（白色）
	 */
	public static String getContent(String strContent,int nColor,int nBKColor,int nMode) {
		StringBuilder sb = new StringBuilder();
		sb.append("\033[");
		if(nMode>=0) {
			sb.append(String.format("%1$s",nMode));
		}
		if(nColor>0) {
			if(nMode>=0) {
				sb.append(";");
			}
			sb.append(String.format("%1$s",nColor));
		}
		if(nBKColor>0) {
			if(nMode>=0 || nColor>0) {
				sb.append(";");
			}
			sb.append(String.format("%1$s",nBKColor));
		}
		sb.append("m");
		sb.append(strContent);
		sb.append("\033[0m");
		return sb.toString();
	}
	
	public static String getWarnContent(String strContent) {
		return getContent(strContent, 33, -1, 0);
	}
	
	
	public static String getErrorContent(String strContent) {
		return getContent(strContent, 31, -1, 0);
	}
	
	
}
