package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSEAIDATATYPE 过滤器对象
 */
public class PSSysEAIDataTypeFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysEAIDataTypeFilter(){
    
    }      

    /**
     * 设置属性[数据类型名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDataTypeFilter pssyseaidatatypename__like(String value){
        this.setFieldCond("pssyseaidatatypename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用集成体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDataTypeFilter pssyseaischemeid__eq(String value){
        this.setFieldCond("pssyseaischemeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用集成体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDataTypeFilter pssyseaischemename__eq(String value){
        this.setFieldCond("pssyseaischemename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用集成体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDataTypeFilter pssyseaischemename__like(String value){
        this.setFieldCond("pssyseaischemename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[标准数据类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDataTypeFilter stddatatype__eq(Integer value){
        this.setFieldCond("stddatatype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDataTypeFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
