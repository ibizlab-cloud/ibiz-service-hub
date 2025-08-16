package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPDEVIEW 过滤器对象
 */
public class PSAppDEViewFilter extends PSAppViewFilter {

    public PSAppDEViewFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDEViewFilter psappdeviewname__eq(String value){
        this.setFieldCond("psappdeviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDEViewFilter psappdeviewname__like(String value){
        this.setFieldCond("psappdeviewname", LIKE, value);
        return this;
    }

}
