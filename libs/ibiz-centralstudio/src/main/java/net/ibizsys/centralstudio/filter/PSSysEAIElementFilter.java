package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSEAIELEMENT 过滤器对象
 */
public class PSSysEAIElementFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysEAIElementFilter(){
    
    }      

    /**
     * 设置属性[集成元素类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIElementFilter eaielementtype__eq(String value){
        this.setFieldCond("eaielementtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[元素排序模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIElementFilter ordermode__eq(String value){
        this.setFieldCond("ordermode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[集成元素名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIElementFilter pssyseaielementname__like(String value){
        this.setFieldCond("pssyseaielementname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用集成体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIElementFilter pssyseaischemeid__eq(String value){
        this.setFieldCond("pssyseaischemeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用集成体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIElementFilter pssyseaischemename__eq(String value){
        this.setFieldCond("pssyseaischemename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用集成体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIElementFilter pssyseaischemename__like(String value){
        this.setFieldCond("pssyseaischemename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIElementFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
