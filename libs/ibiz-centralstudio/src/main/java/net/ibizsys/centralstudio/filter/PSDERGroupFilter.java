package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDERGROUP 过滤器对象
 */
public class PSDERGroupFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDERGroupFilter(){
    
    }      

    /**
     * 设置属性[初始化模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERGroupFilter initpssysdynamodelid__eq(String value){
        this.setFieldCond("initpssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[初始化模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERGroupFilter initpssysdynamodelname__eq(String value){
        this.setFieldCond("initpssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[初始化模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERGroupFilter initpssysdynamodelname__like(String value){
        this.setFieldCond("initpssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERGroupFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERGroupFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERGroupFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体关系组名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERGroupFilter psdergroupname__like(String value){
        this.setFieldCond("psdergroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERGroupFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERGroupFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERGroupFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERGroupFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERGroupFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERGroupFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERGroupFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERGroupFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERGroupFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERGroupFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
