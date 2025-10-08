<% if (pub.isEnableModelRT() && (item.type) && item.type != 'LINK' ) { %>\
package cn.ibizlab.central.plugin.odoo.dataentity.dto;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;
import java.util.Map;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.central.util.IEntityDTO;


public class ${item.realCodeName}Utils {

<% if(item.type=='DEFAULT'||item.type=='DEACTIONINPUT'){
    item.getPSDEMethodDTOFields().each{ field ->
        %>\
    /**
     * 属性: ${field.getLogicName()}
     */
    public final static String FIELD_${field.name.toUpperCase()} = "${field.name.toLowerCase()}";

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
    public static void set${field.realCodeName.capitalize()}(IEntityDTO iEntityDTO, ${field.javaType} val) {
        iEntityDTO.set(FIELD_${field.name.toUpperCase()}, val);
    }

    /**
     * 获取「${field.getLogicName()}」值
<% if (field.getPSDEField() && field.getPSDEField().getPSCodeList() ) { %>\
     * 代码表[${field.getPSDEField().getPSCodeList().getName()}]
<% if (field.getPSDEField().getPSCodeList().getCodeListType() == 'STATIC') { %>\
     * //@see ${sys.getPKGCodeName()}.core.runtime.dict.StaticDict.${field.getPSDEField().getPSCodeList().getCodeName()}
<%  }}%>\
     *
     */
    public static ${field.javaType} get${field.realCodeName.capitalize()}(IEntityDTO iEntityDTO) {
<% if (field.javaType == 'String' || field.javaType == 'Integer' || field.javaType == 'Long' || field.javaType == 'Double' || field.javaType == 'BigInteger' || field.javaType == 'BigDecimal' || field.javaType == 'Timestamp') { %>\
<% if (field.javaType == 'Timestamp')  { %>\
        return DataTypeUtils.asDateTimeValue(iEntityDTO.get(FIELD_${field.name.toUpperCase()}), null);
<% } else {%>\
        return DataTypeUtils.as${field.javaType}(iEntityDTO.get(FIELD_${field.name.toUpperCase()}), null);
<% } %>\
<% } else {%>\
        return (${field.javaType})iEntityDTO.get(FIELD_${field.name.toUpperCase()});
<% } %>\
    }

    /**
     * 判断 「${field.getLogicName()}」是否有值
     *
     */
    public static boolean contains${field.realCodeName.capitalize()}(IEntityDTO iEntityDTO) {
        return iEntityDTO.contains(FIELD_${field.name.toUpperCase()});
    }

    /**
     * 重置 「${field.getLogicName()}」
     *
     */
    public static void reset${field.realCodeName.capitalize()}(IEntityDTO iEntityDTO) {
        iEntityDTO.reset(FIELD_${field.name.toUpperCase()});
    }

<%
    }
}
%>\
}
<% } %>