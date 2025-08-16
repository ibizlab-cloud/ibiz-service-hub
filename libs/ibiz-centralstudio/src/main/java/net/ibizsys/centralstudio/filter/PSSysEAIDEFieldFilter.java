package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSEAIDEFIELD 过滤器对象
 */
public class PSSysEAIDEFieldFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysEAIDEFieldFilter(){
    
    }      

    /**
     * 设置属性[映射类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDEFieldFilter maptype__eq(String value){
        this.setFieldCond("maptype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDEFieldFilter psdefid__eq(String value){
        this.setFieldCond("psdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDEFieldFilter psdefname__eq(String value){
        this.setFieldCond("psdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDEFieldFilter psdefname__like(String value){
        this.setFieldCond("psdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[属性映射名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDEFieldFilter pssyseaidefieldname__like(String value){
        this.setFieldCond("pssyseaidefieldname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[集成实体映射]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDEFieldFilter pssyseaideid__eq(String value){
        this.setFieldCond("pssyseaideid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[集成实体映射]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDEFieldFilter pssyseaidename__eq(String value){
        this.setFieldCond("pssyseaidename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[集成实体映射]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDEFieldFilter pssyseaidename__like(String value){
        this.setFieldCond("pssyseaidename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[集成元素属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDEFieldFilter pssyseaielementattrid__eq(String value){
        this.setFieldCond("pssyseaielementattrid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[集成元素属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDEFieldFilter pssyseaielementattrname__eq(String value){
        this.setFieldCond("pssyseaielementattrname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[集成元素属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDEFieldFilter pssyseaielementattrname__like(String value){
        this.setFieldCond("pssyseaielementattrname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[集成元素引用元素]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDEFieldFilter pssyseaielementreid__eq(String value){
        this.setFieldCond("pssyseaielementreid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[集成元素元素]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDEFieldFilter pssyseaielementrename__eq(String value){
        this.setFieldCond("pssyseaielementrename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[集成元素元素]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDEFieldFilter pssyseaielementrename__like(String value){
        this.setFieldCond("pssyseaielementrename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEAIDEFieldFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
