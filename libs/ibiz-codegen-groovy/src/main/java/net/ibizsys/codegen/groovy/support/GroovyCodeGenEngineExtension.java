package net.ibizsys.codegen.groovy.support;

import java.util.Arrays;

import org.springframework.util.StringUtils;

public class GroovyCodeGenEngineExtension {

	public static String getGroovyString(String str) {
		if(StringUtils.hasLength(str)) {
			return String.format("'%1$s'", str.replace("'", "\\'"));
		}
		return "null";
	}
	
	public static String getCommentString(String str) {
		return commentString(str, "// ");
	}
	
	
	public static String  commentString(String str, String strPrefix) {
		if(StringUtils.hasLength(str)) {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(StringUtils.collectionToDelimitedString(Arrays.asList(str.replace("\r\n", "\n").replace("\r", "\n").split("\n")), "\n", strPrefix, ""));
			return stringBuilder.toString();
		}
		return null;
	}
}
