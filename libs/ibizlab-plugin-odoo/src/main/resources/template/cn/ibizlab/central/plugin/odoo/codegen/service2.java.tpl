package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;

/**
 * 抽象实体[${item.name}]服务对象接口
 * 
 */
public interface I${item.realCodeName}Service<T extends IEntityDTO, F extends ISearchContextDTO> extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<T, F>{

<% if(item.getAllPSDEActions()){ item.getAllPSDEActions().each{ action ->  %>\
    /**
     * 行为: ${action.getLogicName()}
     */
    String ACTION_${action.getName().toUpperCase()} = "${action.getName().toUpperCase()}";
<% }} %>\


<% if(item.getAllPSDEActions()){ item.getAllPSDEActions().each{ action ->
        if(action.isEnableBackend() && !action.builtinAction) { %>\
    /**
     * 行为: ${action.getLogicName()}
     */
    ${action.getPSDEActionReturn().javaType} ${action.realCodeName.uncapitalize()}(${action.getPSDEActionInput().input}) throws Throwable;
<% }}} %>\

}