package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSBDCOLSET 过滤器对象
 */
public class PSSysBDColSetFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysBDColSetFilter(){
    
    }      

    /**
     * 设置属性[列族名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColSetFilter pssysbdcolsetname__like(String value){
        this.setFieldCond("pssysbdcolsetname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[大数据表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColSetFilter pssysbdtableid__eq(String value){
        this.setFieldCond("pssysbdtableid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColSetFilter pssysbdtablename__eq(String value){
        this.setFieldCond("pssysbdtablename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColSetFilter pssysbdtablename__like(String value){
        this.setFieldCond("pssysbdtablename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColSetFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
