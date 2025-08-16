package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEDQCOND 过滤器对象
 */
public class PSDEDQCondFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEDQCondFilter(){
    
    }      

    /**
     * 设置属性[条件类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCondFilter condtype__eq(String value){
        this.setFieldCond("condtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[组合逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCondFilter groupop__eq(String value){
        this.setFieldCond("groupop", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父数据查询条件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCondFilter ppsdedqcondid__eq(String value){
        this.setFieldCond("ppsdedqcondid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父数据查询条件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCondFilter ppsdedqcondname__eq(String value){
        this.setFieldCond("ppsdedqcondname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父数据查询条件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCondFilter ppsdedqcondname__like(String value){
        this.setFieldCond("ppsdedqcondname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[操作符号]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCondFilter psdbvalueopid__eq(String value){
        this.setFieldCond("psdbvalueopid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[操作符号]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCondFilter psdbvalueopname__eq(String value){
        this.setFieldCond("psdbvalueopname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[操作符号]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCondFilter psdbvalueopname__like(String value){
        this.setFieldCond("psdbvalueopname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[查询条件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCondFilter psdedqcondname__like(String value){
        this.setFieldCond("psdedqcondname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据查询]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCondFilter psdedqid__eq(String value){
        this.setFieldCond("psdedqid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据查询连接]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCondFilter psdedqjoinid__eq(String value){
        this.setFieldCond("psdedqjoinid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据查询连接]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCondFilter psdedqjoinname__eq(String value){
        this.setFieldCond("psdedqjoinname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据查询连接]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCondFilter psdedqjoinname__like(String value){
        this.setFieldCond("psdedqjoinname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据查询]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCondFilter psdedqname__eq(String value){
        this.setFieldCond("psdedqname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据查询]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCondFilter psdedqname__like(String value){
        this.setFieldCond("psdedqname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[查询预置条件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCondFilter psdedqpdcondid__eq(String value){
        this.setFieldCond("psdedqpdcondid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[查询预置条件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCondFilter psdedqpdcondname__eq(String value){
        this.setFieldCond("psdedqpdcondname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[查询预置条件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCondFilter psdedqpdcondname__like(String value){
        this.setFieldCond("psdedqpdcondname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCondFilter psdefid__eq(String value){
        this.setFieldCond("psdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCondFilter psdefname__eq(String value){
        this.setFieldCond("psdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCondFilter psdefname__like(String value){
        this.setFieldCond("psdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[值处理]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCondFilter pssysdbvfid__eq(String value){
        this.setFieldCond("pssysdbvfid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[值处理]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCondFilter pssysdbvfname__eq(String value){
        this.setFieldCond("pssysdbvfname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[值处理]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCondFilter pssysdbvfname__like(String value){
        this.setFieldCond("pssysdbvfname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[变量类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCondFilter psvartypeid__eq(String value){
        this.setFieldCond("psvartypeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[变量类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCondFilter psvartypename__eq(String value){
        this.setFieldCond("psvartypename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[变量类型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCondFilter psvartypename__like(String value){
        this.setFieldCond("psvartypename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCondFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
