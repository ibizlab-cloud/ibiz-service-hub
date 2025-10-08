<% if (pub.isEnableModelRT() && (item.type) && item.type != 'LINK') { %>\
package cn.ibizlab.central.plugin.odoo.dataentity.dto;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.central.util.IEntityDTO;


public class ${item.realCodeName} extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

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
    @JsonProperty(FIELD_${field.name.toUpperCase()})
    public ${item.realCodeName} set${field.realCodeName.capitalize()}(${field.javaType} val) {
        this._set(FIELD_${field.name.toUpperCase()}, val);
        return this;
    }
<% if (item.type == 'DEFAULT' && field.getPSDEField() && field.getPSDEField().isKeyDEField() && field.name.capitalize() != 'Id'
 && !(item.getPSDEMethodDTOFields().find { f -> f.name.capitalize() == 'Id'})) { %>\

    public ${item.realCodeName} setId(${field.javaType} val) {
        this.set${field.realCodeName.capitalize()}(val);
        return this;
    }
<%}%>\
<% if (item.type == 'DEFAULT' && field.getPSDEField() && field.getPSDEField().isMajorDEField() && field.name.capitalize() != 'Name'
 && !(item.getPSDEMethodDTOFields().find { f -> f.name.capitalize() == 'Name'})) { %>\

    public ${item.realCodeName} setName(${field.javaType} val) {
        this.set${field.realCodeName.capitalize()}(val);
        return this;
    }
<%}%>\

    /**
     * 获取「${field.getLogicName()}」值
<% if (field.getPSDEField() && field.getPSDEField().getPSCodeList() ) { %>\
     * 代码表[${field.getPSDEField().getPSCodeList().getName()}]
<% if (field.getPSDEField().getPSCodeList().getCodeListType() == 'STATIC') { %>\
     * //@see ${sys.getPKGCodeName()}.core.runtime.dict.StaticDict.${field.getPSDEField().getPSCodeList().getCodeName()}
<%  }}%>\
     *
     */
    @JsonIgnore
    public ${field.javaType} get${field.realCodeName.capitalize()}() {
<% if (field.javaType == 'String' || field.javaType == 'Integer' || field.javaType == 'Long' || field.javaType == 'Double' || field.javaType == 'BigInteger' || field.javaType == 'BigDecimal' || field.javaType == 'Timestamp') { %>\
<% if (field.javaType == 'Timestamp')  { %>\
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_${field.name.toUpperCase()}), null);
<% } else {%>\
        return DataTypeUtils.as${field.javaType}(this._get(FIELD_${field.name.toUpperCase()}), null);
<% } %>\
<% } else {%>\
        return (${field.javaType}) this._get(FIELD_${field.name.toUpperCase()});
<% } %>\
    }
<% if (item.type == 'DEFAULT' && field.getPSDEField() && field.getPSDEField().isKeyDEField() && field.name.capitalize() != 'Id'
  && !(item.getPSDEMethodDTOFields().find { f -> f.name.capitalize() == 'Id'})) { %>\

    @JsonIgnore
    public ${field.javaType} getId() {
        return get${field.realCodeName.capitalize()}();
    }
<%}%>\
<% if (item.type == 'DEFAULT' && field.getPSDEField() && field.getPSDEField().isMajorDEField() && field.name.capitalize() != 'Name'
  && !(item.getPSDEMethodDTOFields().find { f -> f.name.capitalize() == 'Name'})) { %>\

    @JsonIgnore
    public ${field.javaType} getName() {
        return get${field.realCodeName.capitalize()}();
    }
<%}%>\

    /**
     * 判断 「${field.getLogicName()}」是否有值
     *
     */
    @JsonIgnore
    public boolean contains${field.realCodeName.capitalize()}() {
        return this._contains(FIELD_${field.name.toUpperCase()});
    }

    /**
     * 重置 「${field.getLogicName()}」
     *
     */
    @JsonIgnore
    public ${item.realCodeName} reset${field.realCodeName.capitalize()}() {
        this._reset(FIELD_${field.name.toUpperCase()});
        return this;
    }

<%
    }
}
%>\
}
<% } %>