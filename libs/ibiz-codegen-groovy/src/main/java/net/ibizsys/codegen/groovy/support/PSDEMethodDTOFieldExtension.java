package net.ibizsys.codegen.groovy.support;

import net.ibizsys.codegen.groovy.util.GroovyUtils;
import net.ibizsys.model.PSModelEnums.DEMethodDTOFieldType;
import net.ibizsys.model.PSModelEnums.StdDataType;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTOField;


public class PSDEMethodDTOFieldExtension {

	public static String getGroovyType(IPSDEMethodDTOField iPSDEMethodDTOField) {
		
		DEMethodDTOFieldType type = DEMethodDTOFieldType.from(iPSDEMethodDTOField.getType());
		if(DEMethodDTOFieldType.DTOS == type) {
			return "List";
		}
		
		if(DEMethodDTOFieldType.DTO == type) {
			return "def";
		}
		
		if(DEMethodDTOFieldType.SIMPLE == type || DEMethodDTOFieldType.SIMPLES == type ) {
			String strGroovyType = GroovyUtils.getGroovyType(StdDataType.from(iPSDEMethodDTOField.getStdDataType()));
			if(DEMethodDTOFieldType.SIMPLES == type) {
				if("def".equals(strGroovyType)) {
					return "List";
				}
				return String.format("List<%1$s>", strGroovyType);
			}
			return strGroovyType;
		}
		
		return "def";
		
	}
	

}
