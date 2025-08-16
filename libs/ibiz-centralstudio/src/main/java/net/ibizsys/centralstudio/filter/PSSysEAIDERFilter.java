package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSEAIDER 过滤器对象
 */
public class PSSysEAIDERFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysEAIDERFilter(){
    
    }      

    /**
     * 设置属性[实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDERFilter psderid__eq(String value){
        this.setFieldCond("psderid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDERFilter psdername__eq(String value){
        this.setFieldCond("psdername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDERFilter psdername__like(String value){
        this.setFieldCond("psdername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用集成实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDERFilter pssyseaideid__eq(String value){
        this.setFieldCond("pssyseaideid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用集成实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDERFilter pssyseaidename__eq(String value){
        this.setFieldCond("pssyseaidename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用集成实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDERFilter pssyseaidename__like(String value){
        this.setFieldCond("pssyseaidename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[关系映射名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDERFilter pssyseaidername__like(String value){
        this.setFieldCond("pssyseaidername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用集成元素引用元素]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDERFilter pssyseaielementreid__eq(String value){
        this.setFieldCond("pssyseaielementreid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[集成元素元素]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDERFilter pssyseaielementrename__eq(String value){
        this.setFieldCond("pssyseaielementrename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[集成元素元素]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDERFilter pssyseaielementrename__like(String value){
        this.setFieldCond("pssyseaielementrename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDERFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
