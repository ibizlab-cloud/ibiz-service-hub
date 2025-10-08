package cn.ibizlab.central.plugin.odoo.util;

import cn.ibizlab.central.plugin.odoo.dataentity.dto.*;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.PSModelEnums.DEMethodDTOType;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTO;

public class OdooEntityDTOUtils {

	public static IEntityDTO createEntityDTO(String strName, IPSDEMethodDTO iPSDEMethodDTO) {
		if(DEMethodDTOType.DEFAULT.value.equals(iPSDEMethodDTO.getType())) {
			switch(iPSDEMethodDTO.getCodeName()) {
<% if(item.getAllPSDataEntities()){ item.getAllPSDataEntities().each{ dataEntity ->
        if(dataEntity.getDEType() != 6 && dataEntity.getAllPSDEMethodDTOs()) { dataEntity.getAllPSDEMethodDTOs().each{ dto -> 
          if(dto.getType() == 'DEFAULT'){ %>\
       	    case "${dto.getCodeName()}":
				return new ${dto.realCodeName}();
<% }}}}} %>\
			default:
				return new OdooEntityDTO();
			}
		}
		return new OdooEntityDTO();
	}
}
