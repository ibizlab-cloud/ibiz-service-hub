package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEFORM 过滤器对象
 */
public class PSDEFormFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEFormFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter codename__like(String value){
        this.setFieldCond("codename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[复制数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter copypsdeactionid__eq(String value){
        this.setFieldCond("copypsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[复制数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter copypsdeactionname__eq(String value){
        this.setFieldCond("copypsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[复制数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter copypsdeactionname__like(String value){
        this.setFieldCond("copypsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[建立数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter createpsdeactionid__eq(String value){
        this.setFieldCond("createpsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[建立数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter createpsdeactionname__eq(String value){
        this.setFieldCond("createpsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[建立数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter createpsdeactionname__like(String value){
        this.setFieldCond("createpsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[成员默认样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter detailstyle__eq(String value){
        this.setFieldCond("detailstyle", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[表单项默认样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter formitemstyle__eq(String value){
        this.setFieldCond("formitemstyle", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[表单样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter formstyle__eq(String value){
        this.setFieldCond("formstyle", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[表单类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter formtype__eq(String value){
        this.setFieldCond("formtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter funcmode__eq(String value){
        this.setFieldCond("funcmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[获取草稿数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter getdraftpsdeactionid__eq(String value){
        this.setFieldCond("getdraftpsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[获取草稿实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter getdraftpsdeactionname__eq(String value){
        this.setFieldCond("getdraftpsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[获取草稿实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter getdraftpsdeactionname__like(String value){
        this.setFieldCond("getdraftpsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[获取数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter getpsdeactionid__eq(String value){
        this.setFieldCond("getpsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[获取数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter getpsdeactionname__eq(String value){
        this.setFieldCond("getpsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[获取数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter getpsdeactionname__like(String value){
        this.setFieldCond("getpsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[布局模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter layoutmode__eq(String value){
        this.setFieldCond("layoutmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[导航栏位置]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter navbarpos__eq(String value){
        this.setFieldCond("navbarpos", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[导航栏样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter navbarpssyscssid__eq(String value){
        this.setFieldCond("navbarpssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[导航栏样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter navbarpssyscssname__eq(String value){
        this.setFieldCond("navbarpssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[导航栏样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter navbarpssyscssname__like(String value){
        this.setFieldCond("navbarpssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[导航栏内置样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter navbarstyle__eq(String value){
        this.setFieldCond("navbarstyle", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认后台处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter psachandlerid__eq(String value){
        this.setFieldCond("psachandlerid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter psachandlername__eq(String value){
        this.setFieldCond("psachandlername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认处理对象]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter psachandlername__like(String value){
        this.setFieldCond("psachandlername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter psctrllogicgroupid__eq(String value){
        this.setFieldCond("psctrllogicgroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter psctrllogicgroupname__eq(String value){
        this.setFieldCond("psctrllogicgroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter psctrllogicgroupname__like(String value){
        this.setFieldCond("psctrllogicgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[部件消息]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter psctrlmsgid__eq(String value){
        this.setFieldCond("psctrlmsgid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[部件消息]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter psctrlmsgname__eq(String value){
        this.setFieldCond("psctrlmsgname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[部件消息]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter psctrlmsgname__like(String value){
        this.setFieldCond("psctrlmsgname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[表单名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter psdeformname__like(String value){
        this.setFieldCond("psdeformname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态系统实例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter psdynainstname__eq(String value){
        this.setFieldCond("psdynainstname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统实例]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter psdynainstname__like(String value){
        this.setFieldCond("psdynainstname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter pspfid__eq(String value){
        this.setFieldCond("pspfid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter pspfname__eq(String value){
        this.setFieldCond("pspfname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端模板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter pspfname__like(String value){
        this.setFieldCond("pspfname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[删除数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter removepsdeactionid__eq(String value){
        this.setFieldCond("removepsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[删除数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter removepsdeactionname__eq(String value){
        this.setFieldCond("removepsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[删除数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter removepsdeactionname__like(String value){
        this.setFieldCond("removepsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[搜索按钮位置]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter searchbtnpos__eq(String value){
        this.setFieldCond("searchbtnpos", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[搜索按钮样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter searchbtnstyle__eq(String value){
        this.setFieldCond("searchbtnstyle", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分页头部位置]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter tabheaderpos__eq(String value){
        this.setFieldCond("tabheaderpos", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[更新数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter updatepsdeactionid__eq(String value){
        this.setFieldCond("updatepsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[更新数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter updatepsdeactionname__eq(String value){
        this.setFieldCond("updatepsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[更新数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter updatepsdeactionname__like(String value){
        this.setFieldCond("updatepsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[自定义实体行为2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter user2psdeactionid__eq(String value){
        this.setFieldCond("user2psdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义实体行为2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter user2psdeactionname__eq(String value){
        this.setFieldCond("user2psdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义实体行为2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter user2psdeactionname__like(String value){
        this.setFieldCond("user2psdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户自定义实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter userpsdeactionid__eq(String value){
        this.setFieldCond("userpsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter userpsdeactionname__eq(String value){
        this.setFieldCond("userpsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormFilter userpsdeactionname__like(String value){
        this.setFieldCond("userpsdeactionname", Conditions.LIKE, value);
        return this;
    }

}
