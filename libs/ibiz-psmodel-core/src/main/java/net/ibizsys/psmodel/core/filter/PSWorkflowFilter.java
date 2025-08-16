package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSWORKFLOW 过滤器对象
 */
public class PSWorkflowFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSWorkflowFilter(){
    
    }      

    /**
     * 设置属性[移动端操作视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter actionmobpsdeviewid__eq(String value){
        this.setFieldCond("actionmobpsdeviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端操作视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter actionmobpsdeviewname__eq(String value){
        this.setFieldCond("actionmobpsdeviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端操作视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter actionmobpsdeviewname__like(String value){
        this.setFieldCond("actionmobpsdeviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[操作视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter actionpsdeviewid__eq(String value){
        this.setFieldCond("actionpsdeviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[操作视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter actionpsdeviewname__eq(String value){
        this.setFieldCond("actionpsdeviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[操作视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter actionpsdeviewname__like(String value){
        this.setFieldCond("actionpsdeviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端流程编辑视图类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter mobwfeditviewtype__eq(String value){
        this.setFieldCond("mobwfeditviewtype", EQ, value);
        return this;
    }

    /**
     * 设置属性[名称语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter namepslanresid__eq(String value){
        this.setFieldCond("namepslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[名称语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter namepslanresname__eq(String value){
        this.setFieldCond("namepslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[名称语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter namepslanresname__like(String value){
        this.setFieldCond("namepslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[工作流分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter pssyswfcatid__eq(String value){
        this.setFieldCond("pssyswfcatid", EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter pssyswfcatname__eq(String value){
        this.setFieldCond("pssyswfcatname", EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流分类]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter pssyswfcatname__like(String value){
        this.setFieldCond("pssyswfcatname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[工作流名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter psworkflowname__eq(String value){
        this.setFieldCond("psworkflowname", EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter psworkflowname__like(String value){
        this.setFieldCond("psworkflowname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[微信通知公众号]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter pswxaccountid__eq(String value){
        this.setFieldCond("pswxaccountid", EQ, value);
        return this;
    }

    /**
     * 设置属性[微信通知公众号]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter pswxaccountname__eq(String value){
        this.setFieldCond("pswxaccountname", EQ, value);
        return this;
    }

    /**
     * 设置属性[微信通知公众号]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter pswxaccountname__like(String value){
        this.setFieldCond("pswxaccountname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[微信企业应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter pswxentappid__eq(String value){
        this.setFieldCond("pswxentappid", EQ, value);
        return this;
    }

    /**
     * 设置属性[微信企业应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter pswxentappname__eq(String value){
        this.setFieldCond("pswxentappname", EQ, value);
        return this;
    }

    /**
     * 设置属性[微信企业应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter pswxentappname__like(String value){
        this.setFieldCond("pswxentappname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[催办消息模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter remindpssysmsgtemplid__eq(String value){
        this.setFieldCond("remindpssysmsgtemplid", EQ, value);
        return this;
    }

    /**
     * 设置属性[催办消息模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter remindpssysmsgtemplname__eq(String value){
        this.setFieldCond("remindpssysmsgtemplname", EQ, value);
        return this;
    }

    /**
     * 设置属性[催办消息模板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter remindpssysmsgtemplname__like(String value){
        this.setFieldCond("remindpssysmsgtemplname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[移动端启动视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter startmobpsdeviewid__eq(String value){
        this.setFieldCond("startmobpsdeviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端启动视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter startmobpsdeviewname__eq(String value){
        this.setFieldCond("startmobpsdeviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端启动视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter startmobpsdeviewname__like(String value){
        this.setFieldCond("startmobpsdeviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[启动视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter startpsdeviewid__eq(String value){
        this.setFieldCond("startpsdeviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[启动视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter startpsdeviewname__eq(String value){
        this.setFieldCond("startpsdeviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[启动视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter startpsdeviewname__like(String value){
        this.setFieldCond("startpsdeviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[业务状态代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter statecodelistid__eq(String value){
        this.setFieldCond("statecodelistid", EQ, value);
        return this;
    }

    /**
     * 设置属性[业务状态代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter statecodelistname__eq(String value){
        this.setFieldCond("statecodelistname", EQ, value);
        return this;
    }

    /**
     * 设置属性[业务状态代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter statecodelistname__like(String value){
        this.setFieldCond("statecodelistname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

    /**
     * 设置属性[流程编辑视图类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter wfeditviewtype__eq(String value){
        this.setFieldCond("wfeditviewtype", EQ, value);
        return this;
    }

    /**
     * 设置属性[流程引擎类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter wfenginetype__eq(String value){
        this.setFieldCond("wfenginetype", EQ, value);
        return this;
    }

    /**
     * 设置属性[流程步骤代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter wfstepcodelistid__eq(String value){
        this.setFieldCond("wfstepcodelistid", EQ, value);
        return this;
    }

    /**
     * 设置属性[流程步骤代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter wfstepcodelistname__eq(String value){
        this.setFieldCond("wfstepcodelistname", EQ, value);
        return this;
    }

    /**
     * 设置属性[流程步骤代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter wfstepcodelistname__like(String value){
        this.setFieldCond("wfstepcodelistname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[工作流类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWorkflowFilter wftype__eq(String value){
        this.setFieldCond("wftype", EQ, value);
        return this;
    }

}
