package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDELOGIC 过滤器对象
 */
public class PSDELogicFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSDELogicFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicFilter codename__like(String value){
        this.setFieldCond("codename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[属性逻辑模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicFilter deflogicmode__eq(String value){
        this.setFieldCond("deflogicmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicFilter extendmode__eq(Integer value){
        this.setFieldCond("extendmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[逻辑持有者]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicFilter logicholder__eq(Integer value){
        this.setFieldCond("logicholder", EQ, value);
        return this;
    }

    /**
     * 设置属性[逻辑子类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicFilter logicsubtype__eq(String value){
        this.setFieldCond("logicsubtype", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicFilter psdefid__eq(String value){
        this.setFieldCond("psdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicFilter psdefname__eq(String value){
        this.setFieldCond("psdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicFilter psdefname__like(String value){
        this.setFieldCond("psdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[处理逻辑名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicFilter psdelogicname__eq(String value){
        this.setFieldCond("psdelogicname", EQ, value);
        return this;
    }

    /**
     * 设置属性[处理逻辑名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicFilter psdelogicname__like(String value){
        this.setFieldCond("psdelogicname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
