package net.ibizsys.codegen.groovy.support;

import net.ibizsys.codegen.groovy.util.GroovyUtils;
import net.ibizsys.model.PSModelEnums.DEMethodReturnType;
import net.ibizsys.model.PSModelEnums.StdDataType;
import net.ibizsys.model.dataentity.action.IPSDEActionReturn;
import net.ibizsys.model.dataentity.ds.IPSDEDataSetReturn;
import net.ibizsys.model.dataentity.service.IPSDEMethodReturn;

public class PSDEMethodReturnExtension {

	public static String getGroovyType(IPSDEMethodReturn iPSDEMethodReturn){
	
		DEMethodReturnType returnType = DEMethodReturnType.from(iPSDEMethodReturn.getType());
		if(returnType == DEMethodReturnType.VOID) {
			return "void";
		}
		
		if(DEMethodReturnType.DTOS == returnType) {
			
			if(iPSDEMethodReturn instanceof IPSDEActionReturn) {
				IPSDEActionReturn iPSDEActionReturn = (IPSDEActionReturn)iPSDEMethodReturn;
				return String.format("List<%1$s>", iPSDEActionReturn.getPSDEMethodDTOMust().getName());
			}
			
			if(iPSDEMethodReturn instanceof IPSDEDataSetReturn) {
				IPSDEDataSetReturn iPSDEDataSetReturn = (IPSDEDataSetReturn)iPSDEMethodReturn;
				return String.format("List<%1$s>", iPSDEDataSetReturn.getPSDEMethodDTOMust().getName());
			}
			
			return "List";
		}
		
		if(DEMethodReturnType.PAGE == returnType) {
				if(iPSDEMethodReturn instanceof IPSDEDataSetReturn) {
				IPSDEDataSetReturn iPSDEDataSetReturn = (IPSDEDataSetReturn)iPSDEMethodReturn;
				return String.format("Page<%1$s>", iPSDEDataSetReturn.getPSDEMethodDTOMust().getName());
			}
			
			return "Page";
		}

		
		if(DEMethodReturnType.DTO == returnType) {
			
			if(iPSDEMethodReturn instanceof IPSDEActionReturn) {
				IPSDEActionReturn iPSDEActionReturn = (IPSDEActionReturn)iPSDEMethodReturn;
				return iPSDEActionReturn.getPSDEMethodDTOMust().getName();
			}
			
			if(iPSDEMethodReturn instanceof IPSDEDataSetReturn) {
				IPSDEDataSetReturn iPSDEDataSetReturn = (IPSDEDataSetReturn)iPSDEMethodReturn;
				return iPSDEDataSetReturn.getPSDEMethodDTOMust().getName();
			}
			
			return "def";
		}
		
		if(DEMethodReturnType.SIMPLE == returnType || DEMethodReturnType.SIMPLES == returnType ) {
			
			if(iPSDEMethodReturn instanceof IPSDEActionReturn) {
				IPSDEActionReturn iPSDEActionReturn = (IPSDEActionReturn)iPSDEMethodReturn;
				String strGroovyType = GroovyUtils.getGroovyType(StdDataType.from(iPSDEActionReturn.getStdDataType()));
				if(DEMethodReturnType.SIMPLES == returnType) {
					if("def".equals(strGroovyType)) {
						return "List";
					}
					return String.format("List<%1$s>", strGroovyType);
				}
				
				return strGroovyType;
			}
			return "def";
		}

		
		return "def";
	}

		
}
