package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDENOTIFYTARGET 过滤器对象
 */
public class PSDENotifyTargetFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDENotifyTargetFilter(){
    
    }      

    /**
     * 设置属性[实体通知]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyTargetFilter psdenotifyid__eq(String value){
        this.setFieldCond("psdenotifyid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体通知]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyTargetFilter psdenotifyname__eq(String value){
        this.setFieldCond("psdenotifyname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体通知]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyTargetFilter psdenotifyname__like(String value){
        this.setFieldCond("psdenotifyname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[通知目标名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyTargetFilter psdenotifytargetname__like(String value){
        this.setFieldCond("psdenotifytargetname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统消息目标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyTargetFilter pssysmsgtargetid__eq(String value){
        this.setFieldCond("pssysmsgtargetid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统消息目标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyTargetFilter pssysmsgtargetname__eq(String value){
        this.setFieldCond("pssysmsgtargetname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统消息目标]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyTargetFilter pssysmsgtargetname__like(String value){
        this.setFieldCond("pssysmsgtargetname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[目标标识属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyTargetFilter targetpsdefid__eq(String value){
        this.setFieldCond("targetpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标标识属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyTargetFilter targetpsdefname__eq(String value){
        this.setFieldCond("targetpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标标识属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyTargetFilter targetpsdefname__like(String value){
        this.setFieldCond("targetpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[目标类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyTargetFilter targettype__eq(String value){
        this.setFieldCond("targettype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标类型属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyTargetFilter targettypepsdefid__eq(String value){
        this.setFieldCond("targettypepsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标类型属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyTargetFilter targettypepsdefname__eq(String value){
        this.setFieldCond("targettypepsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标类型属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyTargetFilter targettypepsdefname__like(String value){
        this.setFieldCond("targettypepsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyTargetFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
