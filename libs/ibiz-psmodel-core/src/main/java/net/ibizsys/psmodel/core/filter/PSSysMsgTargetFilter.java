package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSMSGTARGET 过滤器对象
 */
public class PSSysMsgTargetFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysMsgTargetFilter(){
    
    }      

    /**
     * 设置属性[代码名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[消息目标标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter msgtargettag__eq(String value){
        this.setFieldCond("msgtargettag", EQ, value);
        return this;
    }

    /**
     * 设置属性[消息目标标记]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter msgtargettag__like(String value){
        this.setFieldCond("msgtargettag", LIKE, value);
        return this;
    }

    /**
     * 设置属性[消息目标标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter msgtargettag2__eq(String value){
        this.setFieldCond("msgtargettag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[消息目标标记2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter msgtargettag2__like(String value){
        this.setFieldCond("msgtargettag2", LIKE, value);
        return this;
    }

    /**
     * 设置属性[消息目标类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter msgtargettype__eq(String value){
        this.setFieldCond("msgtargettype", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据源数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter psdedsid__eq(String value){
        this.setFieldCond("psdedsid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter psdedsname__eq(String value){
        this.setFieldCond("psdedsname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter psdedsname__like(String value){
        this.setFieldCond("psdedsname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据源实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据源实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据源实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[消息目标名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter pssysmsgtargetname__eq(String value){
        this.setFieldCond("pssysmsgtargetname", EQ, value);
        return this;
    }

    /**
     * 设置属性[消息目标名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter pssysmsgtargetname__like(String value){
        this.setFieldCond("pssysmsgtargetname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统功能组件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter pssysutildeid__eq(String value){
        this.setFieldCond("pssysutildeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统功能组件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter pssysutildename__eq(String value){
        this.setFieldCond("pssysutildename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统功能组件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter pssysutildename__like(String value){
        this.setFieldCond("pssysutildename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[目标标识属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter targetpsdefid__eq(String value){
        this.setFieldCond("targetpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[目标标识属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter targetpsdefname__eq(String value){
        this.setFieldCond("targetpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[目标标识属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter targetpsdefname__like(String value){
        this.setFieldCond("targetpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[目标类型属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter targettypepsdefid__eq(String value){
        this.setFieldCond("targettypepsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[目标类型属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter targettypepsdefname__eq(String value){
        this.setFieldCond("targettypepsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[目标类型属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter targettypepsdefname__like(String value){
        this.setFieldCond("targettypepsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户自定义属性2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter user2psdefid__eq(String value){
        this.setFieldCond("user2psdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户自定义属性2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter user2psdefname__eq(String value){
        this.setFieldCond("user2psdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户自定义属性2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter user2psdefname__like(String value){
        this.setFieldCond("user2psdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户自定义属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter userpsdefid__eq(String value){
        this.setFieldCond("userpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户自定义属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter userpsdefname__eq(String value){
        this.setFieldCond("userpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户自定义属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter userpsdefname__like(String value){
        this.setFieldCond("userpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标识2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标识3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标识4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgTargetFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
