package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDELOGICPARAM 过滤器对象
 */
public class PSDELogicParamFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDELogicParamFilter(){
    
    }      

    /**
     * 设置属性[默认值类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicParamFilter defaultvaluetype__eq(String value){
        this.setFieldCond("defaultvaluetype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[参数实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicParamFilter parampsdeid__eq(String value){
        this.setFieldCond("parampsdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[参数实体类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicParamFilter parampsdename__eq(String value){
        this.setFieldCond("parampsdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[参数实体类型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicParamFilter parampsdename__like(String value){
        this.setFieldCond("parampsdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体处理逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicParamFilter psdelogicid__eq(String value){
        this.setFieldCond("psdelogicid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体处理逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicParamFilter psdelogicname__eq(String value){
        this.setFieldCond("psdelogicname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体处理逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicParamFilter psdelogicname__like(String value){
        this.setFieldCond("psdelogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[参数标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicParamFilter psdelogicparamname__like(String value){
        this.setFieldCond("psdelogicparamname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicParamFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicParamFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicParamFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicParamFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicParamFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicParamFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicParamFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicParamFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicParamFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicParamFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
