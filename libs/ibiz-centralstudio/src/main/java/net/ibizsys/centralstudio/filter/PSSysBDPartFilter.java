package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSBDPART 过滤器对象
 */
public class PSSysBDPartFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysBDPartFilter(){
    
    }      

    /**
     * 设置属性[大数据分区名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDPartFilter pssysbdpartname__like(String value){
        this.setFieldCond("pssysbdpartname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[大数据体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDPartFilter pssysbdschemeid__eq(String value){
        this.setFieldCond("pssysbdschemeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDPartFilter pssysbdschemename__eq(String value){
        this.setFieldCond("pssysbdschemename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDPartFilter pssysbdschemename__like(String value){
        this.setFieldCond("pssysbdschemename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDPartFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
