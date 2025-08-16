package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSDMITEM 过滤器对象
 */
public class PSSysDMItemFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysDMItemFilter(){
    
    }      

    /**
     * 设置属性[对象类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDMItemFilter dbobjtype__eq(String value){
        this.setFieldCond("dbobjtype", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDMItemFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDMItemFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDMItemFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[模型项名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDMItemFilter pssysdmitemname__eq(String value){
        this.setFieldCond("pssysdmitemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[模型项名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDMItemFilter pssysdmitemname__like(String value){
        this.setFieldCond("pssysdmitemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据库模型版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDMItemFilter pssysdmverid__eq(String value){
        this.setFieldCond("pssysdmverid", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据库模型版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDMItemFilter pssysdmvername__eq(String value){
        this.setFieldCond("pssysdmvername", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据库模型版本]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDMItemFilter pssysdmvername__like(String value){
        this.setFieldCond("pssysdmvername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统数据库]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDMItemFilter pssystemdbcfgid__eq(String value){
        this.setFieldCond("pssystemdbcfgid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统数据库]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDMItemFilter pssystemdbcfgname__eq(String value){
        this.setFieldCond("pssystemdbcfgname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统数据库]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDMItemFilter pssystemdbcfgname__like(String value){
        this.setFieldCond("pssystemdbcfgname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户自定义]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDMItemFilter userflag__eq(Integer value){
        this.setFieldCond("userflag", EQ, value);
        return this;
    }

}
