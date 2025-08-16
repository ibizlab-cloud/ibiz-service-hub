package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEDATAIMP 过滤器对象
 */
public class PSDEDataImpFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEDataImpFilter(){
    
    }      

    /**
     * 设置属性[行为持有者]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter actionholder__eq(Integer value){
        this.setFieldCond("actionholder", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[建立数据行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter createpsdeactionid__eq(String value){
        this.setFieldCond("createpsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[建立数据行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter createpsdeactionname__eq(String value){
        this.setFieldCond("createpsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[建立数据行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter createpsdeactionname__like(String value){
        this.setFieldCond("createpsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[建立要求权限]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter createpsdeopprivid__eq(String value){
        this.setFieldCond("createpsdeopprivid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[建立要求权限]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter createpsdeoppriviname__eq(String value){
        this.setFieldCond("createpsdeoppriviname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[建立要求权限]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter createpsdeoppriviname__like(String value){
        this.setFieldCond("createpsdeoppriviname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[扩展模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter extendmode__eq(Integer value){
        this.setFieldCond("extendmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[导入名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter psdedataimpname__like(String value){
        this.setFieldCond("psdedataimpname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[更新数据行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter updatepsdeactionid__eq(String value){
        this.setFieldCond("updatepsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[更新数据行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter updatepsdeactionname__eq(String value){
        this.setFieldCond("updatepsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[更新数据行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter updatepsdeactionname__like(String value){
        this.setFieldCond("updatepsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[更新要求权限]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter updatepsdeopprivid__eq(String value){
        this.setFieldCond("updatepsdeopprivid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[更新要求权限]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter updatepsdeopprivname__eq(String value){
        this.setFieldCond("updatepsdeopprivname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[更新要求权限]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter updatepsdeopprivname__like(String value){
        this.setFieldCond("updatepsdeopprivname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
