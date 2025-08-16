package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEMAP 过滤器对象
 */
public class PSDEMapFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEMapFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter codename__eq(String value){
        this.setFieldCond("codename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter dstpsdeid__eq(String value){
        this.setFieldCond("dstpsdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter dstpsdename__eq(String value){
        this.setFieldCond("dstpsdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter dstpsdename__like(String value){
        this.setFieldCond("dstpsdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[目标系统引用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter dstpssysrefdeid__eq(String value){
        this.setFieldCond("dstpssysrefdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标系统引用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter dstpssysrefdename__eq(String value){
        this.setFieldCond("dstpssysrefdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标系统引用实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter dstpssysrefdename__like(String value){
        this.setFieldCond("dstpssysrefdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[处理默认映射模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter mapmode__eq(String value){
        this.setFieldCond("mapmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[映射目标类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter maptarget__eq(String value){
        this.setFieldCond("maptarget", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体映射名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter psdemapname__eq(String value){
        this.setFieldCond("psdemapname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体映射名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter psdemapname__like(String value){
        this.setFieldCond("psdemapname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统引用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter pssysrefid__eq(String value){
        this.setFieldCond("pssysrefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统引用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter pssysrefname__eq(String value){
        this.setFieldCond("pssysrefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统引用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter pssysrefname__like(String value){
        this.setFieldCond("pssysrefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter usertag__eq(String value){
        this.setFieldCond("usertag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", Conditions.EQ, value);
        return this;
    }

}
