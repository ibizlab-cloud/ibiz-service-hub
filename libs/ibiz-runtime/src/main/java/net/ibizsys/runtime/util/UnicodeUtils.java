package net.ibizsys.runtime.util;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import org.springframework.util.ObjectUtils;

public class UnicodeUtils {
	
	public final static String UTF8MB4_PREFIX = "data:utf8mb4;base64,";

	/**
     * 检查字符串是否包含 4 字节字符
     */
    public static boolean has4ByteChars(String text) {
    	if(ObjectUtils.isEmpty(text)) {
    		return false;
    	}
        for (int i = 0; i < text.length(); ) {
            int codePoint = text.codePointAt(i);
            if (codePoint > 0xFFFF) {
                return true;
            }
            i += Character.charCount(codePoint);
        }
        return false;
    }

    /**
     * 移除字符串中的 4 字节字符
     */
    public static String remove4ByteChars(String text) {
    	if(ObjectUtils.isEmpty(text)) {
    		return text;
    	}
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); ) {
            int codePoint = text.codePointAt(i);
            if (codePoint <= 0xFFFF) {
                sb.appendCodePoint(codePoint);
            }
            i += Character.charCount(codePoint);
        }
        return sb.toString();
    }
    
    
    public static void from4ByteChars(IEntity iEntity, String[] fields) {
    	for(String field : fields) {
    		Object value = iEntity.get(field);
    		if(value instanceof String) {
    			if(has4ByteChars((String)value)) {
    				String text = (String)value;
    				byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
    				text = UTF8MB4_PREFIX + Base64.getEncoder().encodeToString(bytes);
    				iEntity.set(field, text);
    			}
    		}
    	}
    }
    
    public static void to4ByteChars(IEntity iEntity, String[] fields) {
    	for(String field : fields) {
    		Object value = iEntity.get(field);
    		if(value instanceof String) {
    			String text = (String)value;
    			if(!ObjectUtils.isEmpty(text) && text.indexOf(UTF8MB4_PREFIX) == 0) {
    				text = text.substring(UTF8MB4_PREFIX.length());
    				text = new String(Base64.getDecoder().decode(text), StandardCharsets.UTF_8);
    				iEntity.set(field, text);
    			}
    		}
    	}
    }
}
