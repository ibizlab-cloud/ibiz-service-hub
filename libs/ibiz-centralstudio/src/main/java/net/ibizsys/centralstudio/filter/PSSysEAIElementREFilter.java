package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSEAIELEMENTRE 过滤器对象
 */
public class PSSysEAIElementREFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysEAIElementREFilter(){
    
    }      

    /**
     * 设置属性[引用元素类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIElementREFilter eaielementretype__eq(String value){
        this.setFieldCond("eaielementretype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[集成数据类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIElementREFilter pssyseaidatatypeid__eq(String value){
        this.setFieldCond("pssyseaidatatypeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[集成数据类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIElementREFilter pssyseaidatatypename__eq(String value){
        this.setFieldCond("pssyseaidatatypename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[集成数据类型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIElementREFilter pssyseaidatatypename__like(String value){
        this.setFieldCond("pssyseaidatatypename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[集成元素]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIElementREFilter pssyseaielementid__eq(String value){
        this.setFieldCond("pssyseaielementid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[集成元素]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIElementREFilter pssyseaielementname__eq(String value){
        this.setFieldCond("pssyseaielementname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[集成元素]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIElementREFilter pssyseaielementname__like(String value){
        this.setFieldCond("pssyseaielementname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用元素名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIElementREFilter pssyseaielementrename__like(String value){
        this.setFieldCond("pssyseaielementrename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用集成元素]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIElementREFilter refpssyseaielementid__eq(String value){
        this.setFieldCond("refpssyseaielementid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用集成元素]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIElementREFilter refpssyseaielementname__eq(String value){
        this.setFieldCond("refpssyseaielementname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用集成元素]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIElementREFilter refpssyseaielementname__like(String value){
        this.setFieldCond("refpssyseaielementname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIElementREFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
