package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEMAP 过滤器对象
 */
public class PSDEMapFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSDEMapFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[目标实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter dstpsdeid__eq(String value){
        this.setFieldCond("dstpsdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[目标实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter dstpsdename__eq(String value){
        this.setFieldCond("dstpsdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[目标实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter dstpsdename__like(String value){
        this.setFieldCond("dstpsdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[目标系统引用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter dstpssysrefdeid__eq(String value){
        this.setFieldCond("dstpssysrefdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[目标系统引用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter dstpssysrefdename__eq(String value){
        this.setFieldCond("dstpssysrefdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[目标系统引用实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter dstpssysrefdename__like(String value){
        this.setFieldCond("dstpssysrefdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[逻辑所有者]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter logicholder__eq(Integer value){
        this.setFieldCond("logicholder", EQ, value);
        return this;
    }

    /**
     * 设置属性[处理默认映射模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter mapmode__eq(String value){
        this.setFieldCond("mapmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[映射目标类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter maptarget__eq(String value){
        this.setFieldCond("maptarget", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体映射名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter psdemapname__eq(String value){
        this.setFieldCond("psdemapname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体映射名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter psdemapname__like(String value){
        this.setFieldCond("psdemapname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端应用插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统引用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter pssysrefid__eq(String value){
        this.setFieldCond("pssysrefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统引用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter pssysrefname__eq(String value){
        this.setFieldCond("pssysrefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统引用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter pssysrefname__like(String value){
        this.setFieldCond("pssysrefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
