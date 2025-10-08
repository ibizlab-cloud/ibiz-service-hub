package cn.ibizlab.central.plugin.odoo.util;

public class OdooModels {

<% if(item.getAllPSDataEntities()){ item.getAllPSDataEntities().each{ dataEntity -> %>\
   public final static String ${dataEntity.name}= "${dataEntity.fullUniqueTag}"; //${dataEntity.logicName}
<% }} %>\

}
