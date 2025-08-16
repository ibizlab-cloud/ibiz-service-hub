package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEFGROUP 过滤器对象
 */
public class PSDEFGroupFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEFGroupFilter(){
    
    }      

    /**
     * 设置属性[属性组类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter grouptype__eq(String value){
        this.setFieldCond("grouptype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[初始化模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter initpssysdynamodelid__eq(String value){
        this.setFieldCond("initpssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[初始化模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter initpssysdynamodelname__eq(String value){
        this.setFieldCond("initpssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[初始化模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter initpssysdynamodelname__like(String value){
        this.setFieldCond("initpssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[逻辑模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter logicmode__eq(String value){
        this.setFieldCond("logicmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性组名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter psdefgroupname__like(String value){
        this.setFieldCond("psdefgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体编辑表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter psdeformid__eq(String value){
        this.setFieldCond("psdeformid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体编辑表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter psdeformname__eq(String value){
        this.setFieldCond("psdeformname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体编辑表单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter psdeformname__like(String value){
        this.setFieldCond("psdeformname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体值规则组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter psdevrgroupid__eq(String value){
        this.setFieldCond("psdevrgroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体值规则组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter psdevrgroupname__eq(String value){
        this.setFieldCond("psdevrgroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体值规则组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter psdevrgroupname__like(String value){
        this.setFieldCond("psdevrgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
