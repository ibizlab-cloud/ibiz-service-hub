package net.ibizsys.central.cloud.core.util.domain;

public enum V2SystemMergeStatus {

	 NOTINSTALLED(0, "未安装")
     ,
     INSTALLED(1,"已安装")
     ,
     INSTALLEDNEEDRELOAD(2, "已安装（需重载）")
     ,
     DISABLEDNEEDRELOAD(3,"已禁用（须重载）");

     public final String text;
     public final int value;
     
     private V2SystemMergeStatus(int value, String text){
         this.value = value;
         this.text = text;
     }
}
