package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEFGROUP 过滤器对象
 */
public class PSDEFGroupFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSDEFGroupFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[属性组类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter grouptype__eq(String value){
        this.setFieldCond("grouptype", EQ, value);
        return this;
    }

    /**
     * 设置属性[初始化模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter initpssysdynamodelid__eq(String value){
        this.setFieldCond("initpssysdynamodelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[初始化模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter initpssysdynamodelname__eq(String value){
        this.setFieldCond("initpssysdynamodelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[初始化模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter initpssysdynamodelname__like(String value){
        this.setFieldCond("initpssysdynamodelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[逻辑模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter logicmode__eq(String value){
        this.setFieldCond("logicmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性组名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter psdefgroupname__eq(String value){
        this.setFieldCond("psdefgroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性组名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter psdefgroupname__like(String value){
        this.setFieldCond("psdefgroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体编辑表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter psdeformid__eq(String value){
        this.setFieldCond("psdeformid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体编辑表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter psdeformname__eq(String value){
        this.setFieldCond("psdeformname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体编辑表单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter psdeformname__like(String value){
        this.setFieldCond("psdeformname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体值规则组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter psdevrgroupid__eq(String value){
        this.setFieldCond("psdevrgroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体值规则组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter psdevrgroupname__eq(String value){
        this.setFieldCond("psdevrgroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体值规则组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter psdevrgroupname__like(String value){
        this.setFieldCond("psdevrgroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标识2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
