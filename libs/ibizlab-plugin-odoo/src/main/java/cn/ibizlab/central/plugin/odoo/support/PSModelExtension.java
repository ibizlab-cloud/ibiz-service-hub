package cn.ibizlab.central.plugin.odoo.support;

import org.springframework.util.StringUtils;

import com.google.common.base.CaseFormat;

import net.ibizsys.codegen.core.util.JavaTypeUtils;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.PSModelEnums.DEMethodDTOFieldType;
import net.ibizsys.model.PSModelEnums.DEMethodInputType;
import net.ibizsys.model.PSModelEnums.DEMethodReturnType;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.action.IPSDEActionInput;
import net.ibizsys.model.dataentity.action.IPSDEActionReturn;
import net.ibizsys.model.dataentity.ds.IPSDEDataSetInput;
import net.ibizsys.model.dataentity.ds.IPSDEDataSetReturn;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTO;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTOField;
import net.ibizsys.model.dataentity.service.IPSDEMethodInput;
import net.ibizsys.model.dataentity.service.IPSDEMethodReturn;

public class PSModelExtension {

	public static String getRealCodeName(IPSModelObject iPSModelObject) {
		String strCodeName = iPSModelObject.getCodeName();
		if (!StringUtils.hasLength(strCodeName)) {
			strCodeName = iPSModelObject.getName();
		}
		// 判断是否有下划线
		if (strCodeName.indexOf("_") != -1) {
			strCodeName = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, strCodeName.toLowerCase());
		} else {
			strCodeName = StringUtils.capitalize(strCodeName);
		}
		if (StringUtils.hasLength(strCodeName)) {
			if (iPSModelObject instanceof IPSDEMethodDTO) {
				if (strCodeName.endsWith("filterDto")) {
					strCodeName = strCodeName.substring(0, strCodeName.length() - 9) + "FilterDTO";
				}
				if (strCodeName.endsWith("filterdto")) {
					strCodeName = strCodeName.substring(0, strCodeName.length() - 9) + "FilterDTO";
				}
				if (strCodeName.endsWith("Dto")) {
					strCodeName = strCodeName.substring(0, strCodeName.length() - 3) + "DTO";
				}
				if (strCodeName.endsWith("dto")) {
					strCodeName = strCodeName.substring(0, strCodeName.length() - 3) + "DTO";
				}
			}
		}
		return strCodeName;
	}
	
	
	public static String getFullUniqueTag(IPSModelObject iPSModelObject) {
		return PSModelUtils.calcFullUniqueTag2(iPSModelObject, true);
	}

	public static String getLowerCaseFullUniqueTag(IPSModelObject iPSModelObject) {
		return PSModelUtils.calcFullUniqueTag(iPSModelObject, true);
	}
	

	public static String getBaseClass(IPSDEMethodDTO iPSDEMethodDTO) {
		String baseClass = "EntityDTOBase";
		if (PSModelEnums.DEMethodDTOType.DEFAULT.value.equals(iPSDEMethodDTO.getType())) {
			baseClass = "EntityDTOBase";
		} else if (PSModelEnums.DEMethodDTOType.DEFILTER.value.equals(iPSDEMethodDTO.getType()) || PSModelEnums.DEMethodDTOType.DEDATASETINPUT.value.equals(iPSDEMethodDTO.getType())) {
			baseClass = "SearchContextDTOBase";
		}
		return baseClass;
	}
	
	public static String getJavaType(IPSDEMethodDTOField iPSDEMethodDTOField) {
		String ret = "Object";

		DEMethodDTOFieldType type = DEMethodDTOFieldType.from(iPSDEMethodDTOField.getType());
		if(DEMethodDTOFieldType.DTOS == type) {
			if(iPSDEMethodDTOField.getRefPSDEMethodDTO()!=null)
				ret = "List<" + getRealCodeName(iPSDEMethodDTOField.getRefPSDEMethodDTO()) + ">";
			else
				ret = "List<IEntityDTO>";
		}

		if(DEMethodDTOFieldType.DTO == type) {
			if(iPSDEMethodDTOField.getRefPSDEMethodDTO()!=null)
				ret = getRealCodeName(iPSDEMethodDTOField.getRefPSDEMethodDTO());
			else
				ret = "IEntityDTO";
		}

		if(DEMethodDTOFieldType.SIMPLE == type || DEMethodDTOFieldType.SIMPLES == type ) {
			String strJavaType = JavaTypeUtils.getJavaType(iPSDEMethodDTOField.getStdDataType());
			if(DEMethodDTOFieldType.SIMPLES == type) {
				if("Object".equals(strJavaType)) {
					return "List";
				}
				return String.format("List<%s>", strJavaType);
			}
			return strJavaType;
		}

		return ret;
	}

	
	public static String getInputParams(IPSDEActionInput iPSDEActionInput) {
        String ret = "";
        if (PSModelEnums.DEMethodInputType.KEYFIELD.value.equals(iPSDEActionInput.getType())) {
            ret = "key";
        } else if (PSModelEnums.DEMethodInputType.KEYFIELDS.value.equals(iPSDEActionInput.getType())) {
            ret = "keys";
        } else if (PSModelEnums.DEMethodInputType.DTO.value.equals(iPSDEActionInput.getType())) {
            ret = "dto";
        } else if (PSModelEnums.DEMethodInputType.DTOS.value.equals(iPSDEActionInput.getType())) {
            ret = "dtos";
        }
        return ret;
    }
	
	public static String getJavaType(IPSDEMethodInput iPSDEMethodInput){
		
		DEMethodInputType returnType = DEMethodInputType.from(iPSDEMethodInput.getType());
		if(DEMethodInputType.NONE == returnType) {
			return "";
		}
		
		if(DEMethodInputType.DTOS == returnType) {
			
			if(iPSDEMethodInput instanceof IPSDEActionInput) {
				IPSDEActionInput iPSDEActionInput = (IPSDEActionInput)iPSDEMethodInput;
				return String.format("List<%s>", getRealCodeName(iPSDEActionInput.getPSDEMethodDTOMust()));
			}
						
			return "List";
		}
				
		if(DEMethodInputType.DTO == returnType) {
			
			if(iPSDEMethodInput instanceof IPSDEActionInput) {
				IPSDEActionInput iPSDEActionInput = (IPSDEActionInput)iPSDEMethodInput;
				return getRealCodeName(iPSDEActionInput.getPSDEMethodDTOMust());
			}
			
			if(iPSDEMethodInput instanceof IPSDEDataSetInput) {
				IPSDEDataSetInput iPSDEDataSetInput = (IPSDEDataSetInput)iPSDEMethodInput;
				return getRealCodeName(iPSDEDataSetInput.getPSDEFilterDTOMust());
			}
			
			return "Object";
		}
		
		if(DEMethodInputType.FILTER == returnType) {
			
			if(iPSDEMethodInput instanceof IPSDEDataSetInput) {
				IPSDEDataSetInput iPSDEDataSetInput = (IPSDEDataSetInput)iPSDEMethodInput;
				return getRealCodeName(iPSDEDataSetInput.getPSDEFilterDTOMust());
			}
			
			return "Object";
		}
		
		if(DEMethodInputType.KEYFIELD == returnType || DEMethodInputType.KEYFIELDS == returnType ) {
			
			if(iPSDEMethodInput instanceof IPSDEActionInput) {
				IPSDEActionInput iPSDEActionInput = (IPSDEActionInput)iPSDEMethodInput;
				IPSDataEntity iPSDataEntity = iPSDEActionInput.getParentPSModelObject(IPSDataEntity.class, false);
				String strJavaType = JavaTypeUtils.getJavaType(iPSDataEntity.getKeyPSDEFieldMust().getStdDataType());
				if(DEMethodInputType.KEYFIELDS == returnType) {
					if("Object".equals(strJavaType)) {
						return "List";
					}
					return String.format("List<%s>", strJavaType);
				}
				return strJavaType;
			}
			return "Object";
		}

		
		return "Object";
	}
	
	
	public static String getJavaType(IPSDEMethodReturn iPSDEMethodReturn){
		
		DEMethodReturnType returnType = DEMethodReturnType.from(iPSDEMethodReturn.getType());
		if(DEMethodReturnType.VOID == returnType) {
			return "void";
		}
		
		
		
		if(DEMethodReturnType.DTOS == returnType) {
			
			if(iPSDEMethodReturn instanceof IPSDEActionReturn) {
				IPSDEActionReturn iPSDEActionReturn = (IPSDEActionReturn)iPSDEMethodReturn;
				return String.format("List<%s>", getRealCodeName(iPSDEActionReturn.getPSDEMethodDTOMust()));
			}
			
			if(iPSDEMethodReturn instanceof IPSDEDataSetReturn) {
				IPSDEDataSetReturn iPSDEDataSetReturn = (IPSDEDataSetReturn)iPSDEMethodReturn;
				return String.format("List<%s>", getRealCodeName(iPSDEDataSetReturn.getPSDEMethodDTOMust()));
			}
			
			return "List";
		}
		
		if(DEMethodReturnType.PAGE == returnType) {
				if(iPSDEMethodReturn instanceof IPSDEDataSetReturn) {
				IPSDEDataSetReturn iPSDEDataSetReturn = (IPSDEDataSetReturn)iPSDEMethodReturn;
				return String.format("Page<%s>", getRealCodeName(iPSDEDataSetReturn.getPSDEMethodDTOMust()));
			}
			
			return "Page";
		}

		
		if(DEMethodReturnType.DTO == returnType) {
			
			if(iPSDEMethodReturn instanceof IPSDEActionReturn) {
				IPSDEActionReturn iPSDEActionReturn = (IPSDEActionReturn)iPSDEMethodReturn;
				return getRealCodeName(iPSDEActionReturn.getPSDEMethodDTOMust());
			}
			
			if(iPSDEMethodReturn instanceof IPSDEDataSetReturn) {
				IPSDEDataSetReturn iPSDEDataSetReturn = (IPSDEDataSetReturn)iPSDEMethodReturn;
				return getRealCodeName(iPSDEDataSetReturn.getPSDEMethodDTOMust());
			}
			
			return "Object";
		}
		
		if(DEMethodReturnType.SIMPLE == returnType || DEMethodReturnType.SIMPLES == returnType ) {
			if(iPSDEMethodReturn instanceof IPSDEActionReturn) {
				IPSDEActionReturn iPSDEActionReturn = (IPSDEActionReturn)iPSDEMethodReturn;
				String strJavaType = JavaTypeUtils.getJavaType(iPSDEActionReturn.getStdDataType());
				if(DEMethodReturnType.SIMPLES == returnType) {
					if("Object" == strJavaType) {
						return "List";
					}
					return String.format("List<%s>", strJavaType);
				}
				
				return strJavaType;
			}
			return "Object";
		}

		return "Object";
	}




	public  static String getInput(IPSDEActionInput iPSDEActionInput) {
        return String.format("%s %s", getJavaType(iPSDEActionInput), getInputParams(iPSDEActionInput));
    }

	
}
