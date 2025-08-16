package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSPFPITEMPL 过滤器对象
 */
public class PSSysPFPITemplFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysPFPITemplFilter(){
    
    }      

    /**
     * 设置属性[前端模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPITemplFilter pspfid__eq(String value){
        this.setFieldCond("pspfid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPITemplFilter pspfname__eq(String value){
        this.setFieldCond("pspfname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端模板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPITemplFilter pspfname__like(String value){
        this.setFieldCond("pspfname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[发布代码类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPITemplFilter pspfpubcodename__eq(String value){
        this.setFieldCond("pspfpubcodename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[发布代码类型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPITemplFilter pspfpubcodename__like(String value){
        this.setFieldCond("pspfpubcodename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPITemplFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPITemplFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPITemplFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPITemplFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPITemplFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPITemplFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[插件代码名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPITemplFilter pssyspfpitemplname__like(String value){
        this.setFieldCond("pssyspfpitemplname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPITemplFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPITemplFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端模板插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPITemplFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

}
