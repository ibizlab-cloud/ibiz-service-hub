package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEJOINTYPE 过滤器对象
 */
public class PSDEJoinTypeFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSDEJoinTypeFilter(){
    
    }      

    /**
     * 设置属性[连接类型名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEJoinTypeFilter psdejointypename__like(String value){
        this.setFieldCond("psdejointypename", LIKE, value);
        return this;
    }

}
