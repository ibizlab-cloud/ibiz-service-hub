package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSWORKFLOW 过滤器对象
 */
public class PSWorkflowFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSWorkflowFilter(){
    
    }      

    /**
     * 设置属性[移动端操作视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter actionmobpsdeviewid__eq(String value){
        this.setFieldCond("actionmobpsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端操作视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter actionmobpsdeviewname__eq(String value){
        this.setFieldCond("actionmobpsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端操作视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter actionmobpsdeviewname__like(String value){
        this.setFieldCond("actionmobpsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[操作视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter actionpsdeviewid__eq(String value){
        this.setFieldCond("actionpsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[操作视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter actionpsdeviewname__eq(String value){
        this.setFieldCond("actionpsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[操作视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter actionpsdeviewname__like(String value){
        this.setFieldCond("actionpsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[移动端流程编辑视图类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter mobwfeditviewtype__eq(String value){
        this.setFieldCond("mobwfeditviewtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[名称语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter namepslanresid__eq(String value){
        this.setFieldCond("namepslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[名称语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter namepslanresname__eq(String value){
        this.setFieldCond("namepslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[名称语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter namepslanresname__like(String value){
        this.setFieldCond("namepslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[工作流分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter pssyswfcatid__eq(String value){
        this.setFieldCond("pssyswfcatid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter pssyswfcatname__eq(String value){
        this.setFieldCond("pssyswfcatname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流分类]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter pssyswfcatname__like(String value){
        this.setFieldCond("pssyswfcatname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[工作流名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter psworkflowname__like(String value){
        this.setFieldCond("psworkflowname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[微信通知公众号]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter pswxaccountid__eq(String value){
        this.setFieldCond("pswxaccountid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[微信通知公众号]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter pswxaccountname__eq(String value){
        this.setFieldCond("pswxaccountname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[微信通知公众号]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter pswxaccountname__like(String value){
        this.setFieldCond("pswxaccountname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[微信企业应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter pswxentappid__eq(String value){
        this.setFieldCond("pswxentappid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[微信企业应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter pswxentappname__eq(String value){
        this.setFieldCond("pswxentappname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[微信企业应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter pswxentappname__like(String value){
        this.setFieldCond("pswxentappname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[催办消息模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter remindpssysmsgtemplid__eq(String value){
        this.setFieldCond("remindpssysmsgtemplid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[催办消息模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter remindpssysmsgtemplname__eq(String value){
        this.setFieldCond("remindpssysmsgtemplname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[催办消息模板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter remindpssysmsgtemplname__like(String value){
        this.setFieldCond("remindpssysmsgtemplname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[移动端启动视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter startmobpsdeviewid__eq(String value){
        this.setFieldCond("startmobpsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端启动视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter startmobpsdeviewname__eq(String value){
        this.setFieldCond("startmobpsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端启动视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter startmobpsdeviewname__like(String value){
        this.setFieldCond("startmobpsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[启动视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter startpsdeviewid__eq(String value){
        this.setFieldCond("startpsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[启动视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter startpsdeviewname__eq(String value){
        this.setFieldCond("startpsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[启动视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter startpsdeviewname__like(String value){
        this.setFieldCond("startpsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[业务状态代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter statecodelistid__eq(String value){
        this.setFieldCond("statecodelistid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[业务状态代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter statecodelistname__eq(String value){
        this.setFieldCond("statecodelistname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[业务状态代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter statecodelistname__like(String value){
        this.setFieldCond("statecodelistname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程编辑视图类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter wfeditviewtype__eq(String value){
        this.setFieldCond("wfeditviewtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程引擎类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter wfenginetype__eq(String value){
        this.setFieldCond("wfenginetype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程步骤代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter wfstepcodelistid__eq(String value){
        this.setFieldCond("wfstepcodelistid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程步骤代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter wfstepcodelistname__eq(String value){
        this.setFieldCond("wfstepcodelistname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程步骤代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter wfstepcodelistname__like(String value){
        this.setFieldCond("wfstepcodelistname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[工作流类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter wftype__eq(String value){
        this.setFieldCond("wftype", Conditions.EQ, value);
        return this;
    }

}
