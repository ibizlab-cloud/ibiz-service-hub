package net.ibizsys.codegen.groovy.support;



import java.util.HashMap;
import java.util.Map;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.google.common.base.CaseFormat;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.IPSSystem;
import net.ibizsys.model.system.IPSSysModelGroup;
import net.ibizsys.model.system.IPSSystemModule;

public class PSSystemExtension {

	private static Map<String, CaseFormat> CaseFormatMap = new HashMap<>();
	static {
		CaseFormatMap.put("LOWER_CAMEL", CaseFormat.LOWER_CAMEL);
		CaseFormatMap.put("LOWER_HYPHEN", CaseFormat.LOWER_HYPHEN);
		CaseFormatMap.put("LOWER_UNDERSCORE", CaseFormat.LOWER_UNDERSCORE);
		CaseFormatMap.put("UPPER_CAMEL", CaseFormat.UPPER_CAMEL);
		CaseFormatMap.put("UPPER_UNDERSCORE", CaseFormat.UPPER_UNDERSCORE);
	}
	
	public static String getPKGCodeName(IPSSystem self) {
		if(self.getDefaultPSSysSFPub()==null) {
			throw new RuntimeException("系统未定义默认发布对象");
		}
		
		if(!StringUtils.hasLength(self.getDefaultPSSysSFPub().getPKGCodeName())) {
			if(!StringUtils.hasLength(self.getDefaultPSSysSFPub().getCodeName())) {
				throw new RuntimeException("默认发布对象未定义代码标识");
			}
			return getUpperCamelCodeName(self.getDefaultPSSysSFPub()).toLowerCase();
		}
		else {
			return self.getDefaultPSSysSFPub().getPKGCodeName();
		}
	}
	
	public static String getPKGCodeName(IPSSystemModule iPSSystemModule) {
		if(StringUtils.hasLength(iPSSystemModule.getPKGCodeName())) {
			return iPSSystemModule.getPKGCodeName();
		}
		
		IPSSysModelGroup iPSSysModelGroup = iPSSystemModule.getPSSysModelGroup();
		if(iPSSysModelGroup != null) {
			if(StringUtils.hasLength(iPSSysModelGroup.getPKGCodeName())) {
				return String.format("%1$s.%2$s", iPSSysModelGroup.getPKGCodeName(), getUpperCamelCodeName(iPSSystemModule).toLowerCase());
			}
		}
		return String.format("%1$s.%2$s", getPKGCodeName(iPSSystemModule.getParentPSModelObject(IPSSystem.class)), getUpperCamelCodeName(iPSSystemModule).toLowerCase());

	}
	
	
//	/**
//	 * 获取系统代码标识格式
//	 * @param iPSSystem
//	 * @return
//	 */
//	public static CaseFormat getCodeNameCaseFormat(IPSSystem iPSSystem) {
//		//CaseFormat caseFormat = CaseFormatMap.get(iPSSystem.getCodeNameMode());
//		//return caseFormat == null ? CaseFormat.UPPER_CAMEL:caseFormat;
//		return CaseFormat.UPPER_CAMEL;
//	}
	
	public static String getLowerCamelCodeName(IPSModelObject iPSModelObject) {
		String strCodeName = iPSModelObject.getCodeName();
		if(StringUtils.hasLength(strCodeName)) {
			return CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_CAMEL, toUpperCamelCodeName(strCodeName));
		}
		return strCodeName;
	}
	
	public static String getUpperCamelCodeName(IPSModelObject iPSModelObject) {
		String strCodeName = iPSModelObject.getCodeName();
		if(StringUtils.hasLength(strCodeName)) {
//			IPSSystem iPSSystem = iPSModelObject.getParentPSModelObject(IPSSystem.class);
//			CaseFormat caseFormat = PSSystemExtension.getCodeNameCaseFormat(iPSSystem);
//			return caseFormat.to(CaseFormat.UPPER_CAMEL, strCodeName);
			return toUpperCamelCodeName(strCodeName);
		}
		return strCodeName;
	}
	
	
	/**
	 * 获取大写+下划线代码标识
	 * @param strCodeName
	 * @return
	 * @throws Exception
	 */
	public static String getUpperUnderscoreCodeName(IPSModelObject iPSModelObject) {
		String strCodeName = iPSModelObject.getCodeName();
		if(StringUtils.hasLength(strCodeName)) {
//			IPSSystem iPSSystem = iPSModelObject.getParentPSModelObject(IPSSystem.class);
//			CaseFormat caseFormat = PSSystemExtension.getCodeNameCaseFormat(iPSSystem);
			return CaseFormat.UPPER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, toUpperCamelCodeName(strCodeName));
		}
		return strCodeName;
		
	}
	
	
	/**
	 * 获取小写+下划线代码标识
	 * @param strCodeName
	 * @return
	 * @throws Exception
	 */
	public static String getLowerUnderscoreCodeName(IPSModelObject iPSModelObject) {
		String strCodeName = iPSModelObject.getCodeName();
		if(StringUtils.hasLength(strCodeName)) {
			return CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, toUpperCamelCodeName(strCodeName));
		}
		return strCodeName;
	}
	
	
	
	/**
	 * 获取小写+中划线代码标识
	 * @param strCodeName
	 * @return
	 * @throws Exception
	 */
	public static String getLowerHyphenCodeName(IPSModelObject iPSModelObject) {
		String strCodeName = iPSModelObject.getCodeName();
		if(StringUtils.hasLength(strCodeName)) {
//			IPSSystem iPSSystem = iPSModelObject.getParentPSModelObject(IPSSystem.class);
//			CaseFormat caseFormat = PSSystemExtension.getCodeNameCaseFormat(iPSSystem);
//			return caseFormat.to(CaseFormat.LOWER_HYPHEN, strCodeName);
			return CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_HYPHEN, toUpperCamelCodeName(strCodeName));
		}
		return strCodeName;
	}
	
	/**
	 * 将传入代码转为首字母大写的驼峰
	 * @param strCodeName
	 * @return
	 */
	public static String toUpperCamelCodeName(String strCodeName) {
		if(ObjectUtils.isEmpty(strCodeName)) {
			return strCodeName;
		}
		
		//解决连续大写的问题
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
		//判断是否有下划线
		if(strCodeName.indexOf("_") != -1) {
			if(bUpper) {
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
}
