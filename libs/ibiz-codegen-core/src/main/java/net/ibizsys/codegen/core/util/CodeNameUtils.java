package net.ibizsys.codegen.core.util;

import org.springframework.util.ObjectUtils;

import com.google.common.base.CaseFormat;



public class CodeNameUtils {

	/**
     *  小写（下划线分隔），注意：值为对象值，不能直接用于 == 比较
     */
    public final static String CODENAMEMODE_LOWER_UNDERSCORE = "LOWER_UNDERSCORE";
    /**
     *  大写（下划线分隔），注意：值为对象值，不能直接用于 == 比较
     */
    public final static String CODENAMEMODE_UPPER_UNDERSCORE = "UPPER_UNDERSCORE";
    /**
     *  驼峰（首字母小写），注意：值为对象值，不能直接用于 == 比较
     */
    public final static String CODENAMEMODE_LOWER_CAMEL = "LOWER_CAMEL";
    /**
     *  驼峰（首字母大写），注意：值为对象值，不能直接用于 == 比较
     */
    public final static String CODENAMEMODE_UPPER_CAMEL = "UPPER_CAMEL";
    /**
     *  小写（直接，不做转化），注意：值为对象值，不能直接用于 == 比较
     */
    public final static String CODENAMEMODE_LOWER = "LOWER";
    /**
     *  大写（直接，不做转化），注意：值为对象值，不能直接用于 == 比较
     */
    public final static String CODENAMEMODE_UPPER = "UPPER";
    /**
     *  小写（中划线分隔），注意：值为对象值，不能直接用于 == 比较
     */
    public final static String CODENAMEMODE_LOWER_HYPHEN = "LOWER_HYPHEN";
    
    /**
     *  无转换，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String CODENAMEMODE_NONE = "NONE";
	
	public static String to(String strCodeNameMode, String strCodeName) {
		return to(strCodeNameMode, null, strCodeName, null);
	}
	
	
	public static String to(String strCodeNameMode, String strPrefix, String strCodeName) {
		return to(strCodeNameMode, strPrefix, strCodeName, null);
	}
	
	public static String to(String strCodeNameMode, String strPrefix, String strCodeName, String strSuffix) {
		if(ObjectUtils.isEmpty(strCodeNameMode)
				|| CODENAMEMODE_NONE.equalsIgnoreCase(strCodeNameMode)) {
			if(ObjectUtils.isEmpty(strPrefix) 
					&& ObjectUtils.isEmpty(strSuffix)) {
				return strCodeName;
			}
			StringBuilder sb = new StringBuilder();
			if(!ObjectUtils.isEmpty(strPrefix)) {
				sb.append(strPrefix);
			}
			
			if(!ObjectUtils.isEmpty(strCodeName)) {
				sb.append(strCodeName);
			}
			
			if(!ObjectUtils.isEmpty(strSuffix)) {
				sb.append(strSuffix);
			}
			return sb.toString();
		}
		
		boolean bRemoveConsecutiveUppercase = false;
		switch(strCodeNameMode) {
		case CODENAMEMODE_LOWER_UNDERSCORE:
		case CODENAMEMODE_UPPER_UNDERSCORE:
		case CODENAMEMODE_LOWER_HYPHEN:
			bRemoveConsecutiveUppercase = true;
			break;
		}
	
		if(!ObjectUtils.isEmpty(strPrefix)) {
			strPrefix = toUpperCamel(strPrefix, bRemoveConsecutiveUppercase);
		}
		
		if(!ObjectUtils.isEmpty(strCodeName)) {
			strCodeName = toUpperCamel(strCodeName, bRemoveConsecutiveUppercase);
		}
		
		if(!ObjectUtils.isEmpty(strSuffix)) {
			strSuffix = toUpperCamel(strSuffix, bRemoveConsecutiveUppercase);
		}
		
		StringBuilder sb = new StringBuilder();
		if(!ObjectUtils.isEmpty(strPrefix)) {
			switch(strCodeNameMode) {
			case CODENAMEMODE_LOWER_UNDERSCORE:
				sb.append(CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, strPrefix));
				sb.append("_");
				break;
			case CODENAMEMODE_UPPER_UNDERSCORE:
				sb.append(CaseFormat.UPPER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, strPrefix));
				sb.append("_");
				break;
			case CODENAMEMODE_LOWER_HYPHEN:
				sb.append(CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_HYPHEN, strPrefix));
				sb.append("-");
				break;
			case CODENAMEMODE_LOWER:
				sb.append(strPrefix.toLowerCase());
				break;
			case CODENAMEMODE_UPPER:
				sb.append(strPrefix.toUpperCase());
				break;
			default:
				sb.append(strPrefix);
				break;
			}
			
		}
		
		if(!ObjectUtils.isEmpty(strCodeName)) {
			switch(strCodeNameMode) {
			case CODENAMEMODE_LOWER_UNDERSCORE:
				sb.append(CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, strCodeName));
				break;
			case CODENAMEMODE_UPPER_UNDERSCORE:
				sb.append(CaseFormat.UPPER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, strCodeName));
				break;
			case CODENAMEMODE_LOWER_HYPHEN:
				sb.append(CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_HYPHEN, strCodeName));
				break;
			case CODENAMEMODE_LOWER:
				sb.append(strCodeName.toLowerCase());
				break;
			case CODENAMEMODE_UPPER:
				sb.append(strCodeName.toUpperCase());
				break;
			default:
				sb.append(strCodeName);
				break;
			}
		}
		
		if(!ObjectUtils.isEmpty(strSuffix)) {
			switch(strCodeNameMode) {
			case CODENAMEMODE_LOWER_UNDERSCORE:
				sb.append("_");
				sb.append(CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, strSuffix));
				
				break;
			case CODENAMEMODE_UPPER_UNDERSCORE:
				sb.append("_");
				sb.append(CaseFormat.UPPER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, strSuffix));
				
				break;
			case CODENAMEMODE_LOWER_HYPHEN:
				sb.append("-");
				sb.append(CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_HYPHEN, strSuffix));
				break;
			case CODENAMEMODE_LOWER:
				sb.append(strSuffix.toLowerCase());
				break;
			case CODENAMEMODE_UPPER:
				sb.append(strSuffix.toUpperCase());
				break;
			default:
				sb.append(strSuffix);
				break;
			}
			
		}
		
		if(strCodeNameMode.equals(CODENAMEMODE_LOWER_CAMEL)) {
			return CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_CAMEL, sb.toString());
		}
		
		return sb.toString();
	}
	
	
	
	/**
	 * 将传入代码转为首字母大写的驼峰
	 * @param strCodeName
	 * @return
	 */
	public static String toUpperCamel(String strCodeName, boolean bRemoveConsecutiveUppercase) {
		if(ObjectUtils.isEmpty(strCodeName)) {
			return strCodeName;
		}
		
		//解决连续大写的问题
		if(bRemoveConsecutiveUppercase) {
			StringBuilder sb = new StringBuilder();
			boolean bLastUpper = false;
			boolean bUpper = false;
			for(int i = 0;i<strCodeName.length();i++) {
				if(i == 0) {
					sb.append(strCodeName.substring(i, i + 1).toUpperCase());
					bLastUpper = true;
				}
				else {
					String strItem = strCodeName.substring(i, i + 1);
					if(!strItem.toUpperCase().equals(strItem)) {
						sb.append(strItem);
						bLastUpper = false;
						continue;
					}
					else {
						if(i == strCodeName.length() - 1) {
							//最后一位
							if(bLastUpper) {
								sb.append(strItem.toLowerCase());
								bLastUpper = false;
								continue;
							}
							else {
								sb.append(strItem);
								bLastUpper = true;
								bUpper = true;
								continue;
							}
						}
						else {
							if(bLastUpper) {
								String strItem2 = strCodeName.substring(i+1, i + 2);
								if(strItem2.toUpperCase().equals(strItem2)) {
									sb.append(strItem.toLowerCase());
									//上一位还是大写
									//bLastUpper = false;
									continue;
								}
								else {
									sb.append(strItem);
									bLastUpper = true;
									bUpper = true;
									continue;
								}
							}
							else {
								sb.append(strItem);
								bLastUpper = true;
								bUpper = true;
								continue;
							}
						}
						//Main5EditView9
						//判断上一次是否大写，且下一个字母大写，转为为小写
					}
				}
			}
			strCodeName = sb.toString();
		}
		

		//判断是否有下划线
		if(strCodeName.indexOf("_") != -1) {
			if(!strCodeName.equals(strCodeName.toLowerCase())) {
				//字符中存在大写
				StringBuilder sb2 = new StringBuilder();
				for(int i = 0;i<strCodeName.length();i++) {
					if(i == 0) {
						sb2.append(strCodeName.substring(i, i + 1).toLowerCase());
					}
					else {
						String strItem = strCodeName.substring(i, i + 1);
						if(!strItem.toUpperCase().equals(strItem)) {
							sb2.append(strItem);
							continue;
						}
						else {
							sb2.append("_");
							sb2.append(strItem.toLowerCase());
							continue;
						}
					}
				}
				strCodeName = sb2.toString();
			}
			strCodeName = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, strCodeName);
		}
		return strCodeName;
	}
	
	
	public static String capitalize(String strCodeName) {
		if(!ObjectUtils.isEmpty(strCodeName)) {
			String strHeader = strCodeName.substring(0, 1).toUpperCase();
			return String.format("%1$s%2$s", strHeader ,strCodeName.substring(1));
		}
		return strCodeName;		
	}
}
