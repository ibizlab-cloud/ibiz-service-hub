package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEDATAEXP 过滤器对象
 */
public class PSDEDataExpFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEDataExpFilter(){
    
    }      

    /**
     * 设置属性[行为持有者]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataExpFilter actionholder__eq(Integer value){
        this.setFieldCond("actionholder", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataExpFilter extendmode__eq(Integer value){
        this.setFieldCond("extendmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据导出名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataExpFilter psdedataexpname__like(String value){
        this.setFieldCond("psdedataexpname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataExpFilter psdedatasetid__eq(String value){
        this.setFieldCond("psdedatasetid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataExpFilter psdedatasetname__eq(String value){
        this.setFieldCond("psdedatasetname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataExpFilter psdedatasetname__like(String value){
        this.setFieldCond("psdedatasetname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据表格]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataExpFilter psdegridid__eq(String value){
        this.setFieldCond("psdegridid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据表格]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataExpFilter psdegridname__eq(String value){
        this.setFieldCond("psdegridname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据表格]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataExpFilter psdegridname__like(String value){
        this.setFieldCond("psdegridname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataExpFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataExpFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataExpFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataExpFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataExpFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataExpFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataExpFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataExpFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataExpFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataExpFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataExpFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataExpFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataExpFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
