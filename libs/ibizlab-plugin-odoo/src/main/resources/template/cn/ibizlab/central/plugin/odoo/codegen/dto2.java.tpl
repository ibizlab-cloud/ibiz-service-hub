<% if (pub.isEnableModelRT() && (item.type) && item.type != 'LINK' ) { %>\
package cn.ibizlab.central.plugin.odoo.dataentity.dto;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;
import java.util.Map;
import net.ibizsys.central.util.IEntityDTO;


public interface I${item.realCodeName} extends IEntityDTO {

<% if(item.type=='DEFAULT'||item.type=='DEACTIONINPUT'){
    item.getPSDEMethodDTOFields().each{ field ->
        %>\
<% } %>\
<% item.getPSDEMethodDTOFields().each{ field -> %>\
    /**
     * 设置「${field.getLogicName()}」
<% if (field.getPSDEField() && field.getPSDEField().getPSCodeList() ) { %>\
     * 代码表[${field.getPSDEField().getPSCodeList().getName()}]
<% if (field.getPSDEField().getPSCodeList().getCodeListType()=='STATIC') { %>\
     * //@see ${sys.getPKGCodeName()}.core.runtime.dict.StaticDict.${field.getPSDEField().getPSCodeList().getCodeName()}
<%  }}%>\
     * @param val
     */
    I${item.realCodeName} set${field.realCodeName.capitalize()}(${field.javaType} val);
    
    /**
     * 获取「${field.getLogicName()}」值
<% if (field.getPSDEField() && field.getPSDEField().getPSCodeList() ) { %>\
     * 代码表[${field.getPSDEField().getPSCodeList().getName()}]
<% if (field.getPSDEField().getPSCodeList().getCodeListType() == 'STATIC') { %>\
     * //@see ${sys.getPKGCodeName()}.core.runtime.dict.StaticDict.${field.getPSDEField().getPSCodeList().getCodeName()}
<%  }}%>\
     *
     */
    ${field.javaType} get${field.realCodeName.capitalize()}();
    
    /**
     * 判断 「${field.getLogicName()}」是否有值
     *
     */
    boolean contains${field.realCodeName.capitalize()}();

    /**
     * 重置 「${field.getLogicName()}」
     *
     */
    I${item.realCodeName} reset${field.realCodeName.capitalize()}();

<%
    }
}
%>\
}
<% } %>