package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEDBTABLE 过滤器对象
 */
public class PSDEDBTableFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEDBTableFilter(){
    
    }      

    /**
     * 设置属性[列继承模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBTableFilter colinheritmode__eq(Integer value){
        this.setFieldCond("colinheritmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBTableFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBTableFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBTableFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBTableFilter psdedbtablename__like(String value){
        this.setFieldCond("psdedbtablename", Conditions.LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("psdetablename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据库表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBTableFilter pssysdbtableid__eq(String value){
        this.setFieldCond("pssysdbtableid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据库表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBTableFilter pssysdbtablename__eq(String value){
        this.setFieldCond("pssysdbtablename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据库表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBTableFilter pssysdbtablename__like(String value){
        this.setFieldCond("pssysdbtablename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[表类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBTableFilter tabletype__eq(String value){
        this.setFieldCond("tabletype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBTableFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
