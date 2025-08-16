package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSCOREPRDFUNC 过滤器对象
 */
public class PSCorePrdFuncFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSCorePrdFuncFilter(){
    
    }      

    /**
     * 设置属性[功能状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCorePrdFuncFilter funcstate__eq(Integer value){
        this.setFieldCond("funcstate", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能标题]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCorePrdFuncFilter pscoreprdfuncname__like(String value){
        this.setFieldCond("pscoreprdfuncname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[核心产品]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCorePrdFuncFilter pscoreprdid__eq(String value){
        this.setFieldCond("pscoreprdid", EQ, value);
        return this;
    }

    /**
     * 设置属性[核心产品]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCorePrdFuncFilter pscoreprdname__eq(String value){
        this.setFieldCond("pscoreprdname", EQ, value);
        return this;
    }

    /**
     * 设置属性[核心产品]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCorePrdFuncFilter pscoreprdname__like(String value){
        this.setFieldCond("pscoreprdname", LIKE, value);
        return this;
    }

}
