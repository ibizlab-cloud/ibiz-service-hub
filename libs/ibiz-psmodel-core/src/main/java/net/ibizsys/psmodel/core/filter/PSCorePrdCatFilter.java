package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSCOREPRDCAT 过滤器对象
 */
public class PSCorePrdCatFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSCorePrdCatFilter(){
    
    }      

    /**
     * 设置属性[云平台核心产品分类名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCorePrdCatFilter pscoreprdcatname__like(String value){
        this.setFieldCond("pscoreprdcatname", LIKE, value);
        return this;
    }

}
