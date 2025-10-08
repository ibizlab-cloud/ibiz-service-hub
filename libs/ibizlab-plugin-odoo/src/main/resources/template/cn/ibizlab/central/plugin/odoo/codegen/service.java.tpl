package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.${item.getDefaultPSDEMethodDTO().realCodeName};

/**
 * 实体[${item.name}]服务对象接口
 * 
 */
@Qualifier(OdooModels.${item.name.toUpperCase()})
public interface I${item.realCodeName}Service extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<${item.getDefaultPSDEMethodDTO().realCodeName}, net.ibizsys.central.util.ISearchContextDTO>{

<% if(item.getAllPSDEActions()){ item.getAllPSDEActions().each{ action ->  %>\
    /**
     * 行为: ${action.getLogicName()}
     */
    String ACTION_${action.getName().toUpperCase()} = "${action.getName().toUpperCase()}";
<% }} %>\
<% if(item.getAllPSDEDataQueries()){item.getAllPSDEDataQueries().each{ query ->  %>\
    /**
     * 查询: ${query.getLogicName()}
     */
    String DATAQUERY_${query.getName().toUpperCase()} = "${query.getName().toUpperCase()}";
<% }} %>\
<% if(item.getAllPSDEDataSets()){ item.getAllPSDEDataSets().each{ dataset ->  %>\
    /**
     * 集合: ${dataset.getLogicName()}
     */
    String DATASET_${dataset.getName().toUpperCase()} = "${dataset.getName().toUpperCase()}";
<% }} %>\

<% if(item.getAllPSDEActions()){ item.getAllPSDEActions().each{ action ->
        if(action.isEnableBackend() && !action.builtinAction) { %>\
    /**
     * 行为: ${action.getLogicName()}
     */
    ${action.getPSDEActionReturn().javaType} ${action.realCodeName.uncapitalize()}(${action.getPSDEActionInput().input}) throws Throwable;
<% }}} %>\

<% if(item.getAllPSDEDataSets()){ item.getAllPSDEDataSets().each{ dataset ->
        if(dataset.isEnableBackend()) { %>\
    /**
     * 集合: ${dataset.getLogicName()}
     */
    Page<${item.realCodeName}DTO> fetch${dataset.realCodeName.capitalize()}(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
<% }}} %>\
}