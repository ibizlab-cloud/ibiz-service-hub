package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSBIDIMENSION 过滤器对象
 */
public class PSSysBIDimensionFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysBIDimensionFilter(){
    
    }      

    /**
     * 设置属性[维度名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIDimensionFilter pssysbidimensionname__like(String value){
        this.setFieldCond("pssysbidimensionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[智能报表体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIDimensionFilter pssysbischemeid__eq(String value){
        this.setFieldCond("pssysbischemeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[智能报表体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIDimensionFilter pssysbischemename__eq(String value){
        this.setFieldCond("pssysbischemename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[智能报表体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIDimensionFilter pssysbischemename__like(String value){
        this.setFieldCond("pssysbischemename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIDimensionFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
