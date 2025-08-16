package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSBICUBE 过滤器对象
 */
public class PSSysBICubeFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysBICubeFilter(){
    
    }      

    /**
     * 设置属性[键值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter keypsdefid__eq(String value){
        this.setFieldCond("keypsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[键值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter keypsdefname__eq(String value){
        this.setFieldCond("keypsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[键值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter keypsdefname__like(String value){
        this.setFieldCond("keypsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[立方体实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[立方体实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[立方体实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[立方体名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter pssysbicubename__like(String value){
        this.setFieldCond("pssysbicubename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[智能报表体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter pssysbischemeid__eq(String value){
        this.setFieldCond("pssysbischemeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[智能报表体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter pssysbischemename__eq(String value){
        this.setFieldCond("pssysbischemename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[智能报表体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter pssysbischemename__like(String value){
        this.setFieldCond("pssysbischemename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[类型属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter typepsdefid__eq(String value){
        this.setFieldCond("typepsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[类型属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter typepsdefname__eq(String value){
        this.setFieldCond("typepsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[类型属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter typepsdefname__like(String value){
        this.setFieldCond("typepsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
