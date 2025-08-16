package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPUTILVIEW 过滤器对象
 */
public class PSAppUtilViewFilter extends PSAppViewFilter {

    public PSAppUtilViewFilter(){
    
    }      

    /**
     * 设置属性[源应用菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilViewFilter psappmenuid__eq(String value){
        this.setFieldCond("psappmenuid", EQ, value);
        return this;
    }

    /**
     * 设置属性[源应用菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilViewFilter psappmenuname__eq(String value){
        this.setFieldCond("psappmenuname", EQ, value);
        return this;
    }

    /**
     * 设置属性[源应用菜单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilViewFilter psappmenuname__like(String value){
        this.setFieldCond("psappmenuname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilViewFilter psapputilviewname__eq(String value){
        this.setFieldCond("psapputilviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilViewFilter psapputilviewname__like(String value){
        this.setFieldCond("psapputilviewname", LIKE, value);
        return this;
    }

}
