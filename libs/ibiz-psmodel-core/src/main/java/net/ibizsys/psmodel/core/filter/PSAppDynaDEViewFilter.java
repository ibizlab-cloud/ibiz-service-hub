package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPDYNADEVIEW 过滤器对象
 */
public class PSAppDynaDEViewFilter extends PSAppViewFilter {

    public PSAppDynaDEViewFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDynaDEViewFilter psappdynadeviewname__eq(String value){
        this.setFieldCond("psappdynadeviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDynaDEViewFilter psappdynadeviewname__like(String value){
        this.setFieldCond("psappdynadeviewname", LIKE, value);
        return this;
    }

}
