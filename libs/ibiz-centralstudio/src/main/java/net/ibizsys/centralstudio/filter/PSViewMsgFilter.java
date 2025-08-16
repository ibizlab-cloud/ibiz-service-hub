package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSVIEWMSG 过滤器对象
 */
public class PSViewMsgFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSViewMsgFilter(){
    
    }      

    /**
     * 设置属性[缓存范围]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter cachescope__eq(String value){
        this.setFieldCond("cachescope", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[缓存标识2属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter cachetag2psdefid__eq(String value){
        this.setFieldCond("cachetag2psdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[缓存标识2属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter cachetag2psdefname__eq(String value){
        this.setFieldCond("cachetag2psdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[缓存标识2属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter cachetag2psdefname__like(String value){
        this.setFieldCond("cachetag2psdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[缓存标识属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter cachetagpsdefid__eq(String value){
        this.setFieldCond("cachetagpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[缓存标识属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter cachetagpsdefname__eq(String value){
        this.setFieldCond("cachetagpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[缓存标识属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter cachetagpsdefname__like(String value){
        this.setFieldCond("cachetagpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[样式表属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter clspsdefid__eq(String value){
        this.setFieldCond("clspsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[样式表属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter clspsdefname__eq(String value){
        this.setFieldCond("clspsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[样式表属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter clspsdefname__like(String value){
        this.setFieldCond("clspsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter codename__like(String value){
        this.setFieldCond("codename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[内容值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter contentpsdefid__eq(String value){
        this.setFieldCond("contentpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[内容值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter contentpsdefname__eq(String value){
        this.setFieldCond("contentpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[内容值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter contentpsdefname__like(String value){
        this.setFieldCond("contentpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter contentpslanresid__eq(String value){
        this.setFieldCond("contentpslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter contentpslanresname__eq(String value){
        this.setFieldCond("contentpslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[内容语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter contentpslanresname__like(String value){
        this.setFieldCond("contentpslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter dynamicmode__eq(Integer value){
        this.setFieldCond("dynamicmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[消息分组值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter grouppsdefid__eq(String value){
        this.setFieldCond("grouppsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[消息分组值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter grouppsdefname__eq(String value){
        this.setFieldCond("grouppsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[消息分组值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter grouppsdefname__like(String value){
        this.setFieldCond("grouppsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[图标属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter iconpsdefid__eq(String value){
        this.setFieldCond("iconpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[图标属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter iconpsdefname__eq(String value){
        this.setFieldCond("iconpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[图标属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter iconpsdefname__like(String value){
        this.setFieldCond("iconpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认消息位置]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter msgpos__eq(String value){
        this.setFieldCond("msgpos", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[消息位置值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter msgpospsdefid__eq(String value){
        this.setFieldCond("msgpospsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[消息位置值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter msgpospsdefname__eq(String value){
        this.setFieldCond("msgpospsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[消息位置值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter msgpospsdefname__like(String value){
        this.setFieldCond("msgpospsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[消息类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter msgtype__eq(String value){
        this.setFieldCond("msgtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[消息类型值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter msgtypepsdefid__eq(String value){
        this.setFieldCond("msgtypepsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[消息类型值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter msgtypepsdefname__eq(String value){
        this.setFieldCond("msgtypepsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[消息类型值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter msgtypepsdefname__like(String value){
        this.setFieldCond("msgtypepsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[排序值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter ordervaluepsdefid__eq(String value){
        this.setFieldCond("ordervaluepsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[排序值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter ordervaluepsdefname__eq(String value){
        this.setFieldCond("ordervaluepsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[排序值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter ordervaluepsdefname__like(String value){
        this.setFieldCond("ordervaluepsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter psdedsid__eq(String value){
        this.setFieldCond("psdedsid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter psdedsname__eq(String value){
        this.setFieldCond("psdedsname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter psdedsname__like(String value){
        this.setFieldCond("psdedsname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[上下文数据逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter psdelogicid__eq(String value){
        this.setFieldCond("psdelogicid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[上下文数据逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter psdelogicname__eq(String value){
        this.setFieldCond("psdelogicname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[上下文数据逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter psdelogicname__like(String value){
        this.setFieldCond("psdelogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[消息样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[消息样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[消息样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[消息图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter pssysimageid__eq(String value){
        this.setFieldCond("pssysimageid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[消息图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter pssysimagename__eq(String value){
        this.setFieldCond("pssysimagename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[消息图标]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter pssysimagename__like(String value){
        this.setFieldCond("pssysimagename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统消息模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter pssysmsgtemplid__eq(String value){
        this.setFieldCond("pssysmsgtemplid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统消息模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter pssysmsgtemplname__eq(String value){
        this.setFieldCond("pssysmsgtemplname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统消息模板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter pssysmsgtemplname__like(String value){
        this.setFieldCond("pssysmsgtemplname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图消息布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter pssysviewpanelid__eq(String value){
        this.setFieldCond("pssysviewpanelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[视图消息布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter pssysviewpanelname__eq(String value){
        this.setFieldCond("pssysviewpanelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[视图消息布局面板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter pssysviewpanelname__like(String value){
        this.setFieldCond("pssysviewpanelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图消息名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter psviewmsgname__like(String value){
        this.setFieldCond("psviewmsgname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[删除模式值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter removepsdefid__eq(String value){
        this.setFieldCond("removepsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[删除模式值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter removepsdefname__eq(String value){
        this.setFieldCond("removepsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[删除模式值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter removepsdefname__like(String value){
        this.setFieldCond("removepsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter titlelanrestagpsdefid__eq(String value){
        this.setFieldCond("titlelanrestagpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter titlelanrestagpsdefname__eq(String value){
        this.setFieldCond("titlelanrestagpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter titlelanrestagpsdefname__like(String value){
        this.setFieldCond("titlelanrestagpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[消息标题值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter titlepsdefid__eq(String value){
        this.setFieldCond("titlepsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[消息标题值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter titlepsdefname__eq(String value){
        this.setFieldCond("titlepsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[消息标题值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter titlepsdefname__like(String value){
        this.setFieldCond("titlepsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[抬头语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter titlepslanresid__eq(String value){
        this.setFieldCond("titlepslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter titlepslanresname__eq(String value){
        this.setFieldCond("titlepslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter titlepslanresname__like(String value){
        this.setFieldCond("titlepslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter usertag__like(String value){
        this.setFieldCond("usertag", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgFilter usertag2__like(String value){
        this.setFieldCond("usertag2", Conditions.LIKE, value);
        return this;
    }

}
