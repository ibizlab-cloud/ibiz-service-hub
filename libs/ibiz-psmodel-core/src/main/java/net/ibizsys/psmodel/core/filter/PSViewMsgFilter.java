package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSVIEWMSG 过滤器对象
 */
public class PSViewMsgFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSViewMsgFilter(){
    
    }      

    /**
     * 设置属性[缓存范围]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter cachescope__eq(String value){
        this.setFieldCond("cachescope", EQ, value);
        return this;
    }

    /**
     * 设置属性[缓存标识2属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter cachetag2psdefid__eq(String value){
        this.setFieldCond("cachetag2psdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[缓存标识2属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter cachetag2psdefname__eq(String value){
        this.setFieldCond("cachetag2psdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[缓存标识2属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter cachetag2psdefname__like(String value){
        this.setFieldCond("cachetag2psdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[缓存标识属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter cachetagpsdefid__eq(String value){
        this.setFieldCond("cachetagpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[缓存标识属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter cachetagpsdefname__eq(String value){
        this.setFieldCond("cachetagpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[缓存标识属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter cachetagpsdefname__like(String value){
        this.setFieldCond("cachetagpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[样式表属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter clspsdefid__eq(String value){
        this.setFieldCond("clspsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[样式表属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter clspsdefname__eq(String value){
        this.setFieldCond("clspsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[样式表属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter clspsdefname__like(String value){
        this.setFieldCond("clspsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter codename__like(String value){
        this.setFieldCond("codename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[内容值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter contentpsdefid__eq(String value){
        this.setFieldCond("contentpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[内容值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter contentpsdefname__eq(String value){
        this.setFieldCond("contentpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[内容值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter contentpsdefname__like(String value){
        this.setFieldCond("contentpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter contentpslanresid__eq(String value){
        this.setFieldCond("contentpslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter contentpslanresname__eq(String value){
        this.setFieldCond("contentpslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[内容语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter contentpslanresname__like(String value){
        this.setFieldCond("contentpslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[内容类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter contenttype__eq(String value){
        this.setFieldCond("contenttype", EQ, value);
        return this;
    }

    /**
     * 设置属性[内容类型属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter contenttypepsdefid__eq(String value){
        this.setFieldCond("contenttypepsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[内容类型属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter contenttypepsdefname__eq(String value){
        this.setFieldCond("contenttypepsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[内容类型属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter contenttypepsdefname__like(String value){
        this.setFieldCond("contenttypepsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter dynamicmode__eq(Integer value){
        this.setFieldCond("dynamicmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[启用模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter enablemode__eq(String value){
        this.setFieldCond("enablemode", EQ, value);
        return this;
    }

    /**
     * 设置属性[消息分组值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter grouppsdefid__eq(String value){
        this.setFieldCond("grouppsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[消息分组值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter grouppsdefname__eq(String value){
        this.setFieldCond("grouppsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[消息分组值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter grouppsdefname__like(String value){
        this.setFieldCond("grouppsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[图标属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter iconpsdefid__eq(String value){
        this.setFieldCond("iconpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[图标属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter iconpsdefname__eq(String value){
        this.setFieldCond("iconpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[图标属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter iconpsdefname__like(String value){
        this.setFieldCond("iconpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认消息位置]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter msgpos__eq(String value){
        this.setFieldCond("msgpos", EQ, value);
        return this;
    }

    /**
     * 设置属性[消息位置值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter msgpospsdefid__eq(String value){
        this.setFieldCond("msgpospsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[消息位置值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter msgpospsdefname__eq(String value){
        this.setFieldCond("msgpospsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[消息位置值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter msgpospsdefname__like(String value){
        this.setFieldCond("msgpospsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[消息类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter msgtype__eq(String value){
        this.setFieldCond("msgtype", EQ, value);
        return this;
    }

    /**
     * 设置属性[消息类型值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter msgtypepsdefid__eq(String value){
        this.setFieldCond("msgtypepsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[消息类型值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter msgtypepsdefname__eq(String value){
        this.setFieldCond("msgtypepsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[消息类型值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter msgtypepsdefname__like(String value){
        this.setFieldCond("msgtypepsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[排序值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter ordervaluepsdefid__eq(String value){
        this.setFieldCond("ordervaluepsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[排序值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter ordervaluepsdefname__eq(String value){
        this.setFieldCond("ordervaluepsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[排序值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter ordervaluepsdefname__like(String value){
        this.setFieldCond("ordervaluepsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter psdedsid__eq(String value){
        this.setFieldCond("psdedsid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter psdedsname__eq(String value){
        this.setFieldCond("psdedsname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter psdedsname__like(String value){
        this.setFieldCond("psdedsname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[上下文数据逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter psdelogicid__eq(String value){
        this.setFieldCond("psdelogicid", EQ, value);
        return this;
    }

    /**
     * 设置属性[上下文数据逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter psdelogicname__eq(String value){
        this.setFieldCond("psdelogicname", EQ, value);
        return this;
    }

    /**
     * 设置属性[上下文数据逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter psdelogicname__like(String value){
        this.setFieldCond("psdelogicname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据操作标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter psdeopprivid__eq(String value){
        this.setFieldCond("psdeopprivid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据操作标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter psdeopprivname__eq(String value){
        this.setFieldCond("psdeopprivname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据操作标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter psdeopprivname__like(String value){
        this.setFieldCond("psdeopprivname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[消息样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", EQ, value);
        return this;
    }

    /**
     * 设置属性[消息样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", EQ, value);
        return this;
    }

    /**
     * 设置属性[消息样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[消息图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter pssysimageid__eq(String value){
        this.setFieldCond("pssysimageid", EQ, value);
        return this;
    }

    /**
     * 设置属性[消息图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter pssysimagename__eq(String value){
        this.setFieldCond("pssysimagename", EQ, value);
        return this;
    }

    /**
     * 设置属性[消息图标]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter pssysimagename__like(String value){
        this.setFieldCond("pssysimagename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统消息模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter pssysmsgtemplid__eq(String value){
        this.setFieldCond("pssysmsgtemplid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统消息模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter pssysmsgtemplname__eq(String value){
        this.setFieldCond("pssysmsgtemplname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统消息模板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter pssysmsgtemplname__like(String value){
        this.setFieldCond("pssysmsgtemplname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图消息布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter pssysviewpanelid__eq(String value){
        this.setFieldCond("pssysviewpanelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图消息布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter pssysviewpanelname__eq(String value){
        this.setFieldCond("pssysviewpanelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图消息布局面板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter pssysviewpanelname__like(String value){
        this.setFieldCond("pssysviewpanelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图消息名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter psviewmsgname__eq(String value){
        this.setFieldCond("psviewmsgname", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图消息名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter psviewmsgname__like(String value){
        this.setFieldCond("psviewmsgname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[删除模式值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter removepsdefid__eq(String value){
        this.setFieldCond("removepsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[删除模式值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter removepsdefname__eq(String value){
        this.setFieldCond("removepsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[删除模式值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter removepsdefname__like(String value){
        this.setFieldCond("removepsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[判断输出实体逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter testpsdelogicid__eq(String value){
        this.setFieldCond("testpsdelogicid", EQ, value);
        return this;
    }

    /**
     * 设置属性[判断输出实体逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter testpsdelogicname__eq(String value){
        this.setFieldCond("testpsdelogicname", EQ, value);
        return this;
    }

    /**
     * 设置属性[判断输出实体逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter testpsdelogicname__like(String value){
        this.setFieldCond("testpsdelogicname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter titlelanrestagpsdefid__eq(String value){
        this.setFieldCond("titlelanrestagpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter titlelanrestagpsdefname__eq(String value){
        this.setFieldCond("titlelanrestagpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter titlelanrestagpsdefname__like(String value){
        this.setFieldCond("titlelanrestagpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[消息标题值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter titlepsdefid__eq(String value){
        this.setFieldCond("titlepsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[消息标题值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter titlepsdefname__eq(String value){
        this.setFieldCond("titlepsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[消息标题值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter titlepsdefname__like(String value){
        this.setFieldCond("titlepsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[抬头语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter titlepslanresid__eq(String value){
        this.setFieldCond("titlepslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter titlepslanresname__eq(String value){
        this.setFieldCond("titlepslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter titlepslanresname__like(String value){
        this.setFieldCond("titlepslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter usertag__like(String value){
        this.setFieldCond("usertag", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter usertag2__like(String value){
        this.setFieldCond("usertag2", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
