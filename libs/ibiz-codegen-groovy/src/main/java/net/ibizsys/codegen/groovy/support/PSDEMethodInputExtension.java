package net.ibizsys.codegen.groovy.support;

import net.ibizsys.codegen.groovy.util.GroovyUtils;
import net.ibizsys.model.PSModelEnums.DEMethodInputType;
import net.ibizsys.model.PSModelEnums.StdDataType;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.action.IPSDEActionInput;
import net.ibizsys.model.dataentity.ds.IPSDEDataSetInput;
import net.ibizsys.model.dataentity.service.IPSDEMethodInput;

public class PSDEMethodInputExtension {

	public static String getGroovyType(IPSDEMethodInput iPSDEMethodInput){
		
		DEMethodInputType returnType = DEMethodInputType.from(iPSDEMethodInput.getType());
		if(DEMethodInputType.NONE == returnType) {
			return "";
		}
		
		if(DEMethodInputType.DTOS == returnType) {
			
			if(iPSDEMethodInput instanceof IPSDEActionInput) {
				IPSDEActionInput iPSDEActionInput = (IPSDEActionInput)iPSDEMethodInput;
				return String.format("List<%1$s>", iPSDEActionInput.getPSDEMethodDTOMust().getName());
			}
						
			return "List";
		}
				
		if(DEMethodInputType.DTO == returnType) {
			
			if(iPSDEMethodInput instanceof IPSDEActionInput) {
				IPSDEActionInput iPSDEActionInput = (IPSDEActionInput)iPSDEMethodInput;
				return iPSDEActionInput.getPSDEMethodDTOMust().getName();
			}
			
			if(iPSDEMethodInput instanceof IPSDEDataSetInput) {
				IPSDEDataSetInput iPSDEDataSetInput = (IPSDEDataSetInput)iPSDEMethodInput;
				return iPSDEDataSetInput.getPSDEFilterDTOMust().getName();
			}
			
			return "def";
		}
		
		if(DEMethodInputType.FILTER == returnType) {
			
			if(iPSDEMethodInput instanceof IPSDEDataSetInput) {
				IPSDEDataSetInput iPSDEDataSetInput = (IPSDEDataSetInput)iPSDEMethodInput;
				return iPSDEDataSetInput.getPSDEFilterDTOMust().getName();
			}
			
			return "def";
		}
		
		if(DEMethodInputType.KEYFIELD == returnType || DEMethodInputType.KEYFIELDS == returnType ) {
			
			if(iPSDEMethodInput instanceof IPSDEActionInput) {
				IPSDEActionInput iPSDEActionInput = (IPSDEActionInput)iPSDEMethodInput;
				IPSDataEntity iPSDataEntity = iPSDEActionInput.getParentPSModelObject(IPSDataEntity.class, false);
						
				String strGroovyType = GroovyUtils.getGroovyType(StdDataType.from(iPSDataEntity.getKeyPSDEFieldMust().getStdDataType()));
				if(DEMethodInputType.KEYFIELDS == returnType) {
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
