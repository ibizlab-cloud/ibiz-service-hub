package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEFORM 过滤器对象
 */
public class PSDEFormFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSDEFormFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter codename__like(String value){
        this.setFieldCond("codename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[复制数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter copypsdeactionid__eq(String value){
        this.setFieldCond("copypsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[复制数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter copypsdeactionname__eq(String value){
        this.setFieldCond("copypsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[复制数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter copypsdeactionname__like(String value){
        this.setFieldCond("copypsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[建立数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter createpsdeactionid__eq(String value){
        this.setFieldCond("createpsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[建立数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter createpsdeactionname__eq(String value){
        this.setFieldCond("createpsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[建立数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter createpsdeactionname__like(String value){
        this.setFieldCond("createpsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[成员默认样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter detailstyle__eq(String value){
        this.setFieldCond("detailstyle", EQ, value);
        return this;
    }

    /**
     * 设置属性[表单项默认样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter formitemstyle__eq(String value){
        this.setFieldCond("formitemstyle", EQ, value);
        return this;
    }

    /**
     * 设置属性[表单样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter formstyle__eq(String value){
        this.setFieldCond("formstyle", EQ, value);
        return this;
    }

    /**
     * 设置属性[表单类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter formtype__eq(String value){
        this.setFieldCond("formtype", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter funcmode__eq(String value){
        this.setFieldCond("funcmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[获取草稿数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter getdraftpsdeactionid__eq(String value){
        this.setFieldCond("getdraftpsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[获取草稿实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter getdraftpsdeactionname__eq(String value){
        this.setFieldCond("getdraftpsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[获取草稿实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter getdraftpsdeactionname__like(String value){
        this.setFieldCond("getdraftpsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[获取数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter getpsdeactionid__eq(String value){
        this.setFieldCond("getpsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[获取数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter getpsdeactionname__eq(String value){
        this.setFieldCond("getpsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[获取数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter getpsdeactionname__like(String value){
        this.setFieldCond("getpsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[布局模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter layoutmode__eq(String value){
        this.setFieldCond("layoutmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[导航栏位置]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter navbarpos__eq(String value){
        this.setFieldCond("navbarpos", EQ, value);
        return this;
    }

    /**
     * 设置属性[导航栏样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter navbarpssyscssid__eq(String value){
        this.setFieldCond("navbarpssyscssid", EQ, value);
        return this;
    }

    /**
     * 设置属性[导航栏样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter navbarpssyscssname__eq(String value){
        this.setFieldCond("navbarpssyscssname", EQ, value);
        return this;
    }

    /**
     * 设置属性[导航栏样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter navbarpssyscssname__like(String value){
        this.setFieldCond("navbarpssyscssname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[导航栏内置样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter navbarstyle__eq(String value){
        this.setFieldCond("navbarstyle", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认后台处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter psachandlerid__eq(String value){
        this.setFieldCond("psachandlerid", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter psachandlername__eq(String value){
        this.setFieldCond("psachandlername", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认处理对象]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter psachandlername__like(String value){
        this.setFieldCond("psachandlername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter psctrllogicgroupid__eq(String value){
        this.setFieldCond("psctrllogicgroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter psctrllogicgroupname__eq(String value){
        this.setFieldCond("psctrllogicgroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter psctrllogicgroupname__like(String value){
        this.setFieldCond("psctrllogicgroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[部件消息]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter psctrlmsgid__eq(String value){
        this.setFieldCond("psctrlmsgid", EQ, value);
        return this;
    }

    /**
     * 设置属性[部件消息]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter psctrlmsgname__eq(String value){
        this.setFieldCond("psctrlmsgname", EQ, value);
        return this;
    }

    /**
     * 设置属性[部件消息]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter psctrlmsgname__like(String value){
        this.setFieldCond("psctrlmsgname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[表单名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter psdeformname__eq(String value){
        this.setFieldCond("psdeformname", EQ, value);
        return this;
    }

    /**
     * 设置属性[表单名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter psdeformname__like(String value){
        this.setFieldCond("psdeformname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态系统实例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter psdynainstname__eq(String value){
        this.setFieldCond("psdynainstname", EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统实例]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter psdynainstname__like(String value){
        this.setFieldCond("psdynainstname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter pspfid__eq(String value){
        this.setFieldCond("pspfid", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter pspfname__eq(String value){
        this.setFieldCond("pspfname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端模板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter pspfname__like(String value){
        this.setFieldCond("pspfname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统计数器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter pssyscounterid__eq(String value){
        this.setFieldCond("pssyscounterid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统计数器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter pssyscountername__eq(String value){
        this.setFieldCond("pssyscountername", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统计数器]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter pssyscountername__like(String value){
        this.setFieldCond("pssyscountername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter psviewmsggroupid__eq(String value){
        this.setFieldCond("psviewmsggroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter psviewmsggroupname__eq(String value){
        this.setFieldCond("psviewmsggroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter psviewmsggroupname__like(String value){
        this.setFieldCond("psviewmsggroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体工作流]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter pswfdeid__eq(String value){
        this.setFieldCond("pswfdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体工作流]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter pswfdename__eq(String value){
        this.setFieldCond("pswfdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体工作流]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter pswfdename__like(String value){
        this.setFieldCond("pswfdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[删除数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter removepsdeactionid__eq(String value){
        this.setFieldCond("removepsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[删除数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter removepsdeactionname__eq(String value){
        this.setFieldCond("removepsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[删除数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter removepsdeactionname__like(String value){
        this.setFieldCond("removepsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[搜索按钮位置]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter searchbtnpos__eq(String value){
        this.setFieldCond("searchbtnpos", EQ, value);
        return this;
    }

    /**
     * 设置属性[搜索按钮样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter searchbtnstyle__eq(String value){
        this.setFieldCond("searchbtnstyle", EQ, value);
        return this;
    }

    /**
     * 设置属性[分页头部位置]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter tabheaderpos__eq(String value){
        this.setFieldCond("tabheaderpos", EQ, value);
        return this;
    }

    /**
     * 设置属性[更新数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter updatepsdeactionid__eq(String value){
        this.setFieldCond("updatepsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[更新数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter updatepsdeactionname__eq(String value){
        this.setFieldCond("updatepsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[更新数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter updatepsdeactionname__like(String value){
        this.setFieldCond("updatepsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[自定义实体行为2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter user2psdeactionid__eq(String value){
        this.setFieldCond("user2psdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义实体行为2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter user2psdeactionname__eq(String value){
        this.setFieldCond("user2psdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义实体行为2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter user2psdeactionname__like(String value){
        this.setFieldCond("user2psdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户自定义实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter userpsdeactionid__eq(String value){
        this.setFieldCond("userpsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter userpsdeactionname__eq(String value){
        this.setFieldCond("userpsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter userpsdeactionname__like(String value){
        this.setFieldCond("userpsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

}
