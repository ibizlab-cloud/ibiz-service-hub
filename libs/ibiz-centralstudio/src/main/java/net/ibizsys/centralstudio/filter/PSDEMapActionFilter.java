package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEMAPACTION 过滤器对象
 */
public class PSDEMapActionFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEMapActionFilter(){
    
    }      

    /**
     * 设置属性[目标行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapActionFilter dstpsdeactionid__eq(String value){
        this.setFieldCond("dstpsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapActionFilter dstpsdeactionname__eq(String value){
        this.setFieldCond("dstpsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapActionFilter dstpsdeactionname__like(String value){
        this.setFieldCond("dstpsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[源行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapActionFilter psdeactionid__eq(String value){
        this.setFieldCond("psdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[源行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapActionFilter psdeactionname__eq(String value){
        this.setFieldCond("psdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[源行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapActionFilter psdeactionname__like(String value){
        this.setFieldCond("psdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体映射行为名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapActionFilter psdemapactionname__like(String value){
        this.setFieldCond("psdemapactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体映射]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapActionFilter psdemapid__eq(String value){
        this.setFieldCond("psdemapid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体映射]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapActionFilter psdemapname__eq(String value){
        this.setFieldCond("psdemapname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体映射]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapActionFilter psdemapname__like(String value){
        this.setFieldCond("psdemapname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapActionFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
