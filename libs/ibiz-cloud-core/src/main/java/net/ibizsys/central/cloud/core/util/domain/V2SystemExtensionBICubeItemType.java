package net.ibizsys.central.cloud.core.util.domain;

public enum V2SystemExtensionBICubeItemType {

	 DIMENSION("DIMENSION","维度")
     ,
     MEASURE("MEASURE","指标")
     ,
     BIREPORT("BIREPORT","智能报表")
     ;
     public final String text;
     public final String value;
     private V2SystemExtensionBICubeItemType(String value, String text){
         this.value = value;
         this.text = text;
     }
}
