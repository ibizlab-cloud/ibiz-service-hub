package net.ibizsys.central.plugin.groovy.support;

public class StringExtension {

	public static String safeSubstring(String self, int beginIndex) {
		return safeSubstring(self, beginIndex, -1);
	}
	
	public static String safeSubstring(String self, int beginIndex, int endIndex) {
        if (self == null) return null;
        
        int length = self.length();
        int safeBegin = Math.max(0, beginIndex);
        int safeEnd = endIndex == -1 ? length : Math.min(length, endIndex);
        
        if (safeBegin >= safeEnd) return "";
        return self.substring(safeBegin, safeEnd);
    }
	
}
