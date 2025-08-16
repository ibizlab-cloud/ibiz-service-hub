package net.ibizsys.central.cloud.core.util.domain;

public enum V2SystemVersionState {

	  NOT_BUILD(0,"未构建")
      ,

      BUILDING(1,"构建中")
      ,

      BUILDED(2,"已构建")
      ,

      BUILD_FAILED(3,"构建失败")
      ;
      public final String text;

      public final int value;

      private V2SystemVersionState(int value, String text){
          this.value = value;
          this.text = text;
      }
}
