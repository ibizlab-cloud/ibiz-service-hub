package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSVIEWMSGGROUP 过滤器对象
 */
public class PSViewMsgGroupFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSViewMsgGroupFilter(){
    
    }      

    /**
     * 设置属性[内容消息区样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter bodymsgpssyscssid__eq(String value){
        this.setFieldCond("bodymsgpssyscssid", EQ, value);
        return this;
    }

    /**
     * 设置属性[内容消息区样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter bodymsgpssyscssname__eq(String value){
        this.setFieldCond("bodymsgpssyscssname", EQ, value);
        return this;
    }

    /**
     * 设置属性[内容消息区样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter bodymsgpssyscssname__like(String value){
        this.setFieldCond("bodymsgpssyscssname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[内容区消息区样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter bodymsgstyle__eq(String value){
        this.setFieldCond("bodymsgstyle", EQ, value);
        return this;
    }

    /**
     * 设置属性[尾部消息区样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter bottommsgpssyscssid__eq(String value){
        this.setFieldCond("bottommsgpssyscssid", EQ, value);
        return this;
    }

    /**
     * 设置属性[尾部消息区样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter bottommsgpssyscssname__eq(String value){
        this.setFieldCond("bottommsgpssyscssname", EQ, value);
        return this;
    }

    /**
     * 设置属性[尾部消息区样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter bottommsgpssyscssname__like(String value){
        this.setFieldCond("bottommsgpssyscssname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[尾部消息区样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter bottommsgstyle__eq(String value){
        this.setFieldCond("bottommsgstyle", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter codename__like(String value){
        this.setFieldCond("codename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[相关实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[相关实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[相关实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图消息组名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter psviewmsggroupname__eq(String value){
        this.setFieldCond("psviewmsggroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图消息组名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter psviewmsggroupname__like(String value){
        this.setFieldCond("psviewmsggroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[头部消息区样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter topmsgpssyscssid__eq(String value){
        this.setFieldCond("topmsgpssyscssid", EQ, value);
        return this;
    }

    /**
     * 设置属性[头部消息区样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter topmsgpssyscssname__eq(String value){
        this.setFieldCond("topmsgpssyscssname", EQ, value);
        return this;
    }

    /**
     * 设置属性[头部消息区样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter topmsgpssyscssname__like(String value){
        this.setFieldCond("topmsgpssyscssname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[头部消息区样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter topmsgstyle__eq(String value){
        this.setFieldCond("topmsgstyle", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
