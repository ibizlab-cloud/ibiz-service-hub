package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEDQCODECOND 过滤器对象
 */
public class PSDEDQCodeCondFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSDEDQCodeCondFilter(){
    
    }      

    /**
     * 设置属性[条件代码]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCodeCondFilter condcode__like(String value){
        this.setFieldCond("condcode", LIKE, value);
        return this;
    }

    /**
     * 设置属性[条件名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCodeCondFilter psdedqcodecondname__eq(String value){
        this.setFieldCond("psdedqcodecondname", EQ, value);
        return this;
    }

    /**
     * 设置属性[条件名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCodeCondFilter psdedqcodecondname__like(String value){
        this.setFieldCond("psdedqcodecondname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据查询代码]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCodeCondFilter psdedqcodeid__eq(String value){
        this.setFieldCond("psdedqcodeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据查询代码]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCodeCondFilter psdedqcodename__eq(String value){
        this.setFieldCond("psdedqcodename", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据查询代码]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCodeCondFilter psdedqcodename__like(String value){
        this.setFieldCond("psdedqcodename", LIKE, value);
        return this;
    }

}
