package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSVIEWMSGGROUP 过滤器对象
 */
public class PSViewMsgGroupFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSViewMsgGroupFilter(){
    
    }      

    /**
     * 设置属性[内容消息区样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter bodymsgpssyscssid__eq(String value){
        this.setFieldCond("bodymsgpssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[内容消息区样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter bodymsgpssyscssname__eq(String value){
        this.setFieldCond("bodymsgpssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[内容消息区样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter bodymsgpssyscssname__like(String value){
        this.setFieldCond("bodymsgpssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[内容区消息区样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter bodymsgstyle__eq(String value){
        this.setFieldCond("bodymsgstyle", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[尾部消息区样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter bottommsgpssyscssid__eq(String value){
        this.setFieldCond("bottommsgpssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[尾部消息区样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter bottommsgpssyscssname__eq(String value){
        this.setFieldCond("bottommsgpssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[尾部消息区样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter bottommsgpssyscssname__like(String value){
        this.setFieldCond("bottommsgpssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[尾部消息区样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter bottommsgstyle__eq(String value){
        this.setFieldCond("bottommsgstyle", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter codename__like(String value){
        this.setFieldCond("codename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[相关实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[相关实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[相关实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图消息组名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter psviewmsggroupname__like(String value){
        this.setFieldCond("psviewmsggroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[头部消息区样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter topmsgpssyscssid__eq(String value){
        this.setFieldCond("topmsgpssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[头部消息区样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter topmsgpssyscssname__eq(String value){
        this.setFieldCond("topmsgpssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[头部消息区样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter topmsgpssyscssname__like(String value){
        this.setFieldCond("topmsgpssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[头部消息区样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter topmsgstyle__eq(String value){
        this.setFieldCond("topmsgstyle", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGroupFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
