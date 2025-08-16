package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDBVALUEOP 过滤器对象
 */
public class PSDBValueOPFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSDBValueOPFilter(){
    
    }      

    /**
     * 设置属性[操作符名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDBValueOPFilter psdbvalueopname__like(String value){
        this.setFieldCond("psdbvalueopname", LIKE, value);
        return this;
    }

}
