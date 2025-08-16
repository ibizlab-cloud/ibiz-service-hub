package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSCOREPRDVER 过滤器对象
 */
public class PSCorePrdVerFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSCorePrdVerFilter(){
    
    }      

    /**
     * 设置属性[核心产品]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCorePrdVerFilter pscoreprdid__eq(String value){
        this.setFieldCond("pscoreprdid", EQ, value);
        return this;
    }

    /**
     * 设置属性[核心产品]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCorePrdVerFilter pscoreprdname__eq(String value){
        this.setFieldCond("pscoreprdname", EQ, value);
        return this;
    }

    /**
     * 设置属性[核心产品]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCorePrdVerFilter pscoreprdname__like(String value){
        this.setFieldCond("pscoreprdname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[产品版本]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCorePrdVerFilter pscoreprdvername__like(String value){
        this.setFieldCond("pscoreprdvername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[发布状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCorePrdVerFilter pubstate__eq(Integer value){
        this.setFieldCond("pubstate", EQ, value);
        return this;
    }

}
