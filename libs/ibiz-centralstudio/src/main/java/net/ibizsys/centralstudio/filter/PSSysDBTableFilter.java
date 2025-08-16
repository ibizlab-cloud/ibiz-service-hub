package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSDBTABLE 过滤器对象
 */
public class PSSysDBTableFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysDBTableFilter(){
    
    }      

    /**
     * 设置属性[数据库体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBTableFilter pssysdbschemeid__eq(String value){
        this.setFieldCond("pssysdbschemeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据库体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBTableFilter pssysdbschemename__eq(String value){
        this.setFieldCond("pssysdbschemename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据库体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBTableFilter pssysdbschemename__like(String value){
        this.setFieldCond("pssysdbschemename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[对象名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBTableFilter pssysdbtablename__like(String value){
        this.setFieldCond("pssysdbtablename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBTableFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBTableFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBTableFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[对象类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBTableFilter tabletype__eq(String value){
        this.setFieldCond("tabletype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBTableFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
