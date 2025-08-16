package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEWIZARD 过滤器对象
 */
public class PSDEWizardFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEWizardFilter(){
    
    }      

    /**
     * 设置属性[完成操作实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter finishpsdeactionid__eq(String value){
        this.setFieldCond("finishpsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[完成操作实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter finishpsdeactionname__eq(String value){
        this.setFieldCond("finishpsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[完成操作实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter finishpsdeactionname__like(String value){
        this.setFieldCond("finishpsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[完成语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter finishpslanresid__eq(String value){
        this.setFieldCond("finishpslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[完成语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter finishpslanresname__eq(String value){
        this.setFieldCond("finishpslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[完成语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter finishpslanresname__like(String value){
        this.setFieldCond("finishpslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[初始化实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter initpsdeactionid__eq(String value){
        this.setFieldCond("initpsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[初始化实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter initpsdeactionname__eq(String value){
        this.setFieldCond("initpsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[初始化实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter initpsdeactionname__like(String value){
        this.setFieldCond("initpsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[下一步语言标题]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter nextpslanresid__eq(String value){
        this.setFieldCond("nextpslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[下一步语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter nextpslanresname__eq(String value){
        this.setFieldCond("nextpslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[下一步语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter nextpslanresname__like(String value){
        this.setFieldCond("nextpslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[上一步语言标题]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter prevpslanresid__eq(String value){
        this.setFieldCond("prevpslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[上一步语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter prevpslanresname__eq(String value){
        this.setFieldCond("prevpslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[上一步语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter prevpslanresname__like(String value){
        this.setFieldCond("prevpslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter psctrllogicgroupid__eq(String value){
        this.setFieldCond("psctrllogicgroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter psctrllogicgroupname__eq(String value){
        this.setFieldCond("psctrllogicgroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter psctrllogicgroupname__like(String value){
        this.setFieldCond("psctrllogicgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[部件消息]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter psctrlmsgid__eq(String value){
        this.setFieldCond("psctrlmsgid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[部件消息]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter psctrlmsgname__eq(String value){
        this.setFieldCond("psctrlmsgname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[部件消息]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter psctrlmsgname__like(String value){
        this.setFieldCond("psctrlmsgname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体向导名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter psdewizardname__like(String value){
        this.setFieldCond("psdewizardname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[部件样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[状态属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter statepsdefid__eq(String value){
        this.setFieldCond("statepsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[状态属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter statepsdefname__eq(String value){
        this.setFieldCond("statepsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[状态属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter statepsdefname__like(String value){
        this.setFieldCond("statepsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
