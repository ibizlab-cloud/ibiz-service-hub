package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEWIZARD 过滤器对象
 */
public class PSDEWizardFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSDEWizardFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[完成操作实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter finishpsdeactionid__eq(String value){
        this.setFieldCond("finishpsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[完成操作实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter finishpsdeactionname__eq(String value){
        this.setFieldCond("finishpsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[完成操作实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter finishpsdeactionname__like(String value){
        this.setFieldCond("finishpsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[完成语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter finishpslanresid__eq(String value){
        this.setFieldCond("finishpslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[完成语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter finishpslanresname__eq(String value){
        this.setFieldCond("finishpslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[完成语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter finishpslanresname__like(String value){
        this.setFieldCond("finishpslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[初始化实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter initpsdeactionid__eq(String value){
        this.setFieldCond("initpsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[初始化实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter initpsdeactionname__eq(String value){
        this.setFieldCond("initpsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[初始化实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter initpsdeactionname__like(String value){
        this.setFieldCond("initpsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[下一步语言标题]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter nextpslanresid__eq(String value){
        this.setFieldCond("nextpslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[下一步语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter nextpslanresname__eq(String value){
        this.setFieldCond("nextpslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[下一步语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter nextpslanresname__like(String value){
        this.setFieldCond("nextpslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[上一步语言标题]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter prevpslanresid__eq(String value){
        this.setFieldCond("prevpslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[上一步语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter prevpslanresname__eq(String value){
        this.setFieldCond("prevpslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[上一步语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter prevpslanresname__like(String value){
        this.setFieldCond("prevpslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter psctrllogicgroupid__eq(String value){
        this.setFieldCond("psctrllogicgroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter psctrllogicgroupname__eq(String value){
        this.setFieldCond("psctrllogicgroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter psctrllogicgroupname__like(String value){
        this.setFieldCond("psctrllogicgroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[部件消息]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter psctrlmsgid__eq(String value){
        this.setFieldCond("psctrlmsgid", EQ, value);
        return this;
    }

    /**
     * 设置属性[部件消息]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter psctrlmsgname__eq(String value){
        this.setFieldCond("psctrlmsgname", EQ, value);
        return this;
    }

    /**
     * 设置属性[部件消息]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter psctrlmsgname__like(String value){
        this.setFieldCond("psctrlmsgname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体主状态逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter psdemslogicid__eq(String value){
        this.setFieldCond("psdemslogicid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体主状态逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter psdemslogicname__eq(String value){
        this.setFieldCond("psdemslogicname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体主状态逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter psdemslogicname__like(String value){
        this.setFieldCond("psdemslogicname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体向导名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter psdewizardname__eq(String value){
        this.setFieldCond("psdewizardname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体向导名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter psdewizardname__like(String value){
        this.setFieldCond("psdewizardname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[部件样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter psviewmsggroupid__eq(String value){
        this.setFieldCond("psviewmsggroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter psviewmsggroupname__eq(String value){
        this.setFieldCond("psviewmsggroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter psviewmsggroupname__like(String value){
        this.setFieldCond("psviewmsggroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[状态属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter statepsdefid__eq(String value){
        this.setFieldCond("statepsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[状态属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter statepsdefname__eq(String value){
        this.setFieldCond("statepsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[状态属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter statepsdefname__like(String value){
        this.setFieldCond("statepsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
