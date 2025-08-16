package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEVIEWLOGIC 过滤器对象
 */
public class PSDEViewLogicFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEViewLogicFilter(){
    
    }      

    /**
     * 设置属性[目标逻辑类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewLogicFilter dstlogictype__eq(String value){
        this.setFieldCond("dstlogictype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewLogicFilter psdelogicid__eq(String value){
        this.setFieldCond("psdelogicid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewLogicFilter psdelogicname__eq(String value){
        this.setFieldCond("psdelogicname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewLogicFilter psdelogicname__like(String value){
        this.setFieldCond("psdelogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewLogicFilter psdeviewbaseid__eq(String value){
        this.setFieldCond("psdeviewbaseid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewLogicFilter psdeviewbasename__eq(String value){
        this.setFieldCond("psdeviewbasename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewLogicFilter psdeviewbasename__like(String value){
        this.setFieldCond("psdeviewbasename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[事件部件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewLogicFilter psdeviewctrlid__eq(String value){
        this.setFieldCond("psdeviewctrlid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[部件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewLogicFilter psdeviewctrlname__eq(String value){
        this.setFieldCond("psdeviewctrlname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[部件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewLogicFilter psdeviewctrlname__like(String value){
        this.setFieldCond("psdeviewctrlname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[处理标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewLogicFilter psdeviewlogicname__eq(String value){
        this.setFieldCond("psdeviewlogicname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[处理标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewLogicFilter psdeviewlogicname__like(String value){
        this.setFieldCond("psdeviewlogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[逻辑触发类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewLogicFilter psdeviewlogictype__eq(String value){
        this.setFieldCond("psdeviewlogictype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewLogicFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewLogicFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewLogicFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统视图逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewLogicFilter pssysviewlogicid__eq(String value){
        this.setFieldCond("pssysviewlogicid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统界面逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewLogicFilter pssysviewlogicname__eq(String value){
        this.setFieldCond("pssysviewlogicname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统界面逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewLogicFilter pssysviewlogicname__like(String value){
        this.setFieldCond("pssysviewlogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewLogicFilter pssysviewpanelid__eq(String value){
        this.setFieldCond("pssysviewpanelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewLogicFilter pssysviewpanelname__eq(String value){
        this.setFieldCond("pssysviewpanelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[布局面板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewLogicFilter pssysviewpanelname__like(String value){
        this.setFieldCond("pssysviewpanelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewLogicFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewLogicFilter usertag__eq(String value){
        this.setFieldCond("usertag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewLogicFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewLogicFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewLogicFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", Conditions.EQ, value);
        return this;
    }

}
