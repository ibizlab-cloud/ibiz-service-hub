package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSMSGTEMPL 过滤器对象
 */
public class PSSysMsgTemplFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysMsgTemplFilter(){
    
    }      

    /**
     * 设置属性[内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter contentpslanresid__eq(String value){
        this.setFieldCond("contentpslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter contentpslanresname__eq(String value){
        this.setFieldCond("contentpslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[内容语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter contentpslanresname__like(String value){
        this.setFieldCond("contentpslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[内容类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter contenttype__eq(String value){
        this.setFieldCond("contenttype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[钉钉内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter ddpslanresid__eq(String value){
        this.setFieldCond("ddpslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[钉钉内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter ddpslanresname__eq(String value){
        this.setFieldCond("ddpslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[钉钉内容语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter ddpslanresname__like(String value){
        this.setFieldCond("ddpslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[IM内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter impslanresid__eq(String value){
        this.setFieldCond("impslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[IM语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter impslanresname__eq(String value){
        this.setFieldCond("impslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[IM语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter impslanresname__like(String value){
        this.setFieldCond("impslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[消息模板名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter pssysmsgtemplname__like(String value){
        this.setFieldCond("pssysmsgtemplname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[短消息语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter smspslanresid__eq(String value){
        this.setFieldCond("smspslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[短消息语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter smspslanresname__eq(String value){
        this.setFieldCond("smspslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[短消息语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter smspslanresname__like(String value){
        this.setFieldCond("smspslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter subpslanresid__eq(String value){
        this.setFieldCond("subpslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter subpslanresname__eq(String value){
        this.setFieldCond("subpslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter subpslanresname__like(String value){
        this.setFieldCond("subpslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[微信内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter wxpslanresid__eq(String value){
        this.setFieldCond("wxpslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[微信内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter wxpslanresname__eq(String value){
        this.setFieldCond("wxpslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[微信内容语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTemplFilter wxpslanresname__like(String value){
        this.setFieldCond("wxpslanresname", Conditions.LIKE, value);
        return this;
    }

}
