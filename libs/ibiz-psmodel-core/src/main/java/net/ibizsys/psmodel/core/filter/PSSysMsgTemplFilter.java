package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSMSGTEMPL 过滤器对象
 */
public class PSSysMsgTemplFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysMsgTemplFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[内容属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter contentpsdefid__eq(String value){
        this.setFieldCond("contentpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[内容属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter contentpsdefname__eq(String value){
        this.setFieldCond("contentpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[内容属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter contentpsdefname__like(String value){
        this.setFieldCond("contentpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter contentpslanresid__eq(String value){
        this.setFieldCond("contentpslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter contentpslanresname__eq(String value){
        this.setFieldCond("contentpslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[内容语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter contentpslanresname__like(String value){
        this.setFieldCond("contentpslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[内容类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter contenttype__eq(String value){
        this.setFieldCond("contenttype", EQ, value);
        return this;
    }

    /**
     * 设置属性[钉钉内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter ddpslanresid__eq(String value){
        this.setFieldCond("ddpslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[钉钉内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter ddpslanresname__eq(String value){
        this.setFieldCond("ddpslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[钉钉内容语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter ddpslanresname__like(String value){
        this.setFieldCond("ddpslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[IM内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter impslanresid__eq(String value){
        this.setFieldCond("impslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[IM语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter impslanresname__eq(String value){
        this.setFieldCond("impslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[IM语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter impslanresname__like(String value){
        this.setFieldCond("impslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[消息模板标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter msgtempltag__eq(String value){
        this.setFieldCond("msgtempltag", EQ, value);
        return this;
    }

    /**
     * 设置属性[消息模板标记]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter msgtempltag__like(String value){
        this.setFieldCond("msgtempltag", LIKE, value);
        return this;
    }

    /**
     * 设置属性[消息模板标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter msgtempltag2__eq(String value){
        this.setFieldCond("msgtempltag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[消息模板标记2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter msgtempltag2__like(String value){
        this.setFieldCond("msgtempltag2", LIKE, value);
        return this;
    }

    /**
     * 设置属性[消息模板类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter msgtempltype__eq(String value){
        this.setFieldCond("msgtempltype", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据源数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter psdedsid__eq(String value){
        this.setFieldCond("psdedsid", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据源数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter psdedsname__eq(String value){
        this.setFieldCond("psdedsname", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据源数据集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter psdedsname__like(String value){
        this.setFieldCond("psdedsname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据源实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据源实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据源实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[消息模板名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter pssysmsgtemplname__eq(String value){
        this.setFieldCond("pssysmsgtemplname", EQ, value);
        return this;
    }

    /**
     * 设置属性[消息模板名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter pssysmsgtemplname__like(String value){
        this.setFieldCond("pssysmsgtemplname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[短消息语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter smspslanresid__eq(String value){
        this.setFieldCond("smspslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[短消息语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter smspslanresname__eq(String value){
        this.setFieldCond("smspslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[短消息语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter smspslanresname__like(String value){
        this.setFieldCond("smspslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[标题属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter subjectpsdefid__eq(String value){
        this.setFieldCond("subjectpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[标题属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter subjectpsdefname__eq(String value){
        this.setFieldCond("subjectpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[标题属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter subjectpsdefname__like(String value){
        this.setFieldCond("subjectpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter subpslanresid__eq(String value){
        this.setFieldCond("subpslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter subpslanresname__eq(String value){
        this.setFieldCond("subpslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter subpslanresname__like(String value){
        this.setFieldCond("subpslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[模板标记属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter templtagpsdefid__eq(String value){
        this.setFieldCond("templtagpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[模板标记属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter templtagpsdefname__eq(String value){
        this.setFieldCond("templtagpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[模板标记属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter templtagpsdefname__like(String value){
        this.setFieldCond("templtagpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户自定义属性2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter user2psdefid__eq(String value){
        this.setFieldCond("user2psdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户自定义属性2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter user2psdefname__eq(String value){
        this.setFieldCond("user2psdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户自定义属性2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter user2psdefname__like(String value){
        this.setFieldCond("user2psdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户自定义属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter userpsdefid__eq(String value){
        this.setFieldCond("userpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户自定义属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter userpsdefname__eq(String value){
        this.setFieldCond("userpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户自定义属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter userpsdefname__like(String value){
        this.setFieldCond("userpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

    /**
     * 设置属性[微信内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter wxpslanresid__eq(String value){
        this.setFieldCond("wxpslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[微信内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter wxpslanresname__eq(String value){
        this.setFieldCond("wxpslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[微信内容语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter wxpslanresname__like(String value){
        this.setFieldCond("wxpslanresname", LIKE, value);
        return this;
    }

}
