package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEDATAIMP 过滤器对象
 */
public class PSDEDataImpFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSDEDataImpFilter(){
    
    }      

    /**
     * 设置属性[行为持有者]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter actionholder__eq(Integer value){
        this.setFieldCond("actionholder", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[内容类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter contenttype__eq(String value){
        this.setFieldCond("contenttype", EQ, value);
        return this;
    }

    /**
     * 设置属性[建立数据行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter createpsdeactionid__eq(String value){
        this.setFieldCond("createpsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[建立数据行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter createpsdeactionname__eq(String value){
        this.setFieldCond("createpsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[建立数据行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter createpsdeactionname__like(String value){
        this.setFieldCond("createpsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[建立要求权限]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter createpsdeopprivid__eq(String value){
        this.setFieldCond("createpsdeopprivid", EQ, value);
        return this;
    }

    /**
     * 设置属性[建立要求权限]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter createpsdeoppriviname__eq(String value){
        this.setFieldCond("createpsdeoppriviname", EQ, value);
        return this;
    }

    /**
     * 设置属性[建立要求权限]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter createpsdeoppriviname__like(String value){
        this.setFieldCond("createpsdeoppriviname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[扩展模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter extendmode__eq(Integer value){
        this.setFieldCond("extendmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[导入名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter psdedataimpname__eq(String value){
        this.setFieldCond("psdedataimpname", EQ, value);
        return this;
    }

    /**
     * 设置属性[导入名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter psdedataimpname__like(String value){
        this.setFieldCond("psdedataimpname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[更新数据行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter updatepsdeactionid__eq(String value){
        this.setFieldCond("updatepsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[更新数据行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter updatepsdeactionname__eq(String value){
        this.setFieldCond("updatepsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[更新数据行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter updatepsdeactionname__like(String value){
        this.setFieldCond("updatepsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[更新要求权限]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter updatepsdeopprivid__eq(String value){
        this.setFieldCond("updatepsdeopprivid", EQ, value);
        return this;
    }

    /**
     * 设置属性[更新要求权限]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter updatepsdeopprivname__eq(String value){
        this.setFieldCond("updatepsdeopprivname", EQ, value);
        return this;
    }

    /**
     * 设置属性[更新要求权限]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter updatepsdeopprivname__like(String value){
        this.setFieldCond("updatepsdeopprivname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataImpFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
