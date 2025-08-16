package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSCOREPRD 过滤器对象
 */
public class PSCorePrdFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSCorePrdFilter(){
    
    }      

    /**
     * 设置属性[产品分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCorePrdFilter pscoreprdcatid__eq(String value){
        this.setFieldCond("pscoreprdcatid", EQ, value);
        return this;
    }

    /**
     * 设置属性[产品分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCorePrdFilter pscoreprdcatname__eq(String value){
        this.setFieldCond("pscoreprdcatname", EQ, value);
        return this;
    }

    /**
     * 设置属性[产品分类]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCorePrdFilter pscoreprdcatname__like(String value){
        this.setFieldCond("pscoreprdcatname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[产品名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCorePrdFilter pscoreprdname__like(String value){
        this.setFieldCond("pscoreprdname", LIKE, value);
        return this;
    }

}
