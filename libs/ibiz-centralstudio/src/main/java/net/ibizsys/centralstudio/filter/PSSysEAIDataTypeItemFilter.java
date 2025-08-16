package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSEAIDATATYPEITEM 过滤器对象
 */
public class PSSysEAIDataTypeItemFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysEAIDataTypeItemFilter(){
    
    }      

    /**
     * 设置属性[集成数据类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDataTypeItemFilter pssyseaidatatypeid__eq(String value){
        this.setFieldCond("pssyseaidatatypeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[项名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDataTypeItemFilter pssyseaidatatypeitemname__like(String value){
        this.setFieldCond("pssyseaidatatypeitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[集成数据类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDataTypeItemFilter pssyseaidatatypename__eq(String value){
        this.setFieldCond("pssyseaidatatypename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[集成数据类型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDataTypeItemFilter pssyseaidatatypename__like(String value){
        this.setFieldCond("pssyseaidatatypename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDataTypeItemFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
