package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSEAIELEMENTATTR 过滤器对象
 */
public class PSSysEAIElementAttrFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysEAIElementAttrFilter(){
    
    }      

    /**
     * 设置属性[元素属性类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIElementAttrFilter eaielementattrtype__eq(String value){
        this.setFieldCond("eaielementattrtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[集成数据类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIElementAttrFilter pssyseaidatatypeid__eq(String value){
        this.setFieldCond("pssyseaidatatypeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[集成数据类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIElementAttrFilter pssyseaidatatypename__eq(String value){
        this.setFieldCond("pssyseaidatatypename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[集成数据类型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIElementAttrFilter pssyseaidatatypename__like(String value){
        this.setFieldCond("pssyseaidatatypename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[元素属性名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIElementAttrFilter pssyseaielementattrname__like(String value){
        this.setFieldCond("pssyseaielementattrname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[集成元素]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIElementAttrFilter pssyseaielementid__eq(String value){
        this.setFieldCond("pssyseaielementid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[集成元素]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIElementAttrFilter pssyseaielementname__eq(String value){
        this.setFieldCond("pssyseaielementname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[集成元素]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIElementAttrFilter pssyseaielementname__like(String value){
        this.setFieldCond("pssyseaielementname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用属性组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIElementAttrFilter refpssyseaielementid__eq(String value){
        this.setFieldCond("refpssyseaielementid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用属性组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIElementAttrFilter refpssyseaielementname__eq(String value){
        this.setFieldCond("refpssyseaielementname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用属性组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIElementAttrFilter refpssyseaielementname__like(String value){
        this.setFieldCond("refpssyseaielementname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIElementAttrFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
