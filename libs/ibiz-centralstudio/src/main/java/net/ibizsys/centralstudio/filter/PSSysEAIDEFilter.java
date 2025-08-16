package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSEAIDE 过滤器对象
 */
public class PSSysEAIDEFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysEAIDEFilter(){
    
    }      

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDEFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDEFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDEFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[集成实体名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDEFilter pssyseaidename__like(String value){
        this.setFieldCond("pssyseaidename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用集成元素]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDEFilter pssyseaielementid__eq(String value){
        this.setFieldCond("pssyseaielementid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[集成元素]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDEFilter pssyseaielementname__eq(String value){
        this.setFieldCond("pssyseaielementname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[集成元素]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDEFilter pssyseaielementname__like(String value){
        this.setFieldCond("pssyseaielementname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用集成体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDEFilter pssyseaischemeid__eq(String value){
        this.setFieldCond("pssyseaischemeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用集成体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDEFilter pssyseaischemename__eq(String value){
        this.setFieldCond("pssyseaischemename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用集成体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDEFilter pssyseaischemename__like(String value){
        this.setFieldCond("pssyseaischemename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDEFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
