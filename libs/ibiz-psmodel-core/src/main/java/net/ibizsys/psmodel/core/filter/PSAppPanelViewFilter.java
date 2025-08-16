package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPPANELVIEW 过滤器对象
 */
public class PSAppPanelViewFilter extends PSAppViewFilter {

    public PSAppPanelViewFilter(){
    
    }      

    /**
     * 设置属性[布局模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPanelViewFilter layoutmode__eq(String value){
        this.setFieldCond("layoutmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPanelViewFilter psapppanelviewname__eq(String value){
        this.setFieldCond("psapppanelviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPanelViewFilter psapppanelviewname__like(String value){
        this.setFieldCond("psapppanelviewname", LIKE, value);
        return this;
    }

}
