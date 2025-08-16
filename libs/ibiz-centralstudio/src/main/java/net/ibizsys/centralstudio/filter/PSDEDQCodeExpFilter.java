package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEDQCODEEXP 过滤器对象
 */
public class PSDEDQCodeExpFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEDQCodeExpFilter(){
    
    }      

    /**
     * 设置属性[表达式名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCodeExpFilter psdedqcodeexpname__like(String value){
        this.setFieldCond("psdedqcodeexpname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体查询代码]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCodeExpFilter psdedqcodeid__eq(String value){
        this.setFieldCond("psdedqcodeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体查询代码]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCodeExpFilter psdedqcodename__eq(String value){
        this.setFieldCond("psdedqcodename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体查询代码]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCodeExpFilter psdedqcodename__like(String value){
        this.setFieldCond("psdedqcodename", Conditions.LIKE, value);
        return this;
    }

}
