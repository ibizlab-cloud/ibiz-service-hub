package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDETREENODERS 过滤器对象
 */
public class PSDETreeNodeRSFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDETreeNodeRSFilter(){
    
    }      

    /**
     * 设置属性[子节点]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeRSFilter cpsdetreenodeid__eq(String value){
        this.setFieldCond("cpsdetreenodeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[子节点]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeRSFilter cpsdetreenodename__eq(String value){
        this.setFieldCond("cpsdetreenodename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[子节点]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeRSFilter cpsdetreenodename__like(String value){
        this.setFieldCond("cpsdetreenodename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[父节点]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeRSFilter ppsdetreenodeid__eq(String value){
        this.setFieldCond("ppsdetreenodeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父节点]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeRSFilter ppsdetreenodename__eq(String value){
        this.setFieldCond("ppsdetreenodename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父节点]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeRSFilter ppsdetreenodename__like(String value){
        this.setFieldCond("ppsdetreenodename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[过滤实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeRSFilter psdeactionid__eq(String value){
        this.setFieldCond("psdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[过滤实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeRSFilter psdeactionname__eq(String value){
        this.setFieldCond("psdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[过滤实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeRSFilter psdeactionname__like(String value){
        this.setFieldCond("psdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeRSFilter psderid__eq(String value){
        this.setFieldCond("psderid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeRSFilter psdername__eq(String value){
        this.setFieldCond("psdername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeRSFilter psdername__like(String value){
        this.setFieldCond("psdername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体树节点关系名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeRSFilter psdetreenodersname__like(String value){
        this.setFieldCond("psdetreenodersname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体树视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeRSFilter psdetreeviewid__eq(String value){
        this.setFieldCond("psdetreeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体树视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeRSFilter psdetreeviewname__eq(String value){
        this.setFieldCond("psdetreeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体树视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeRSFilter psdetreeviewname__like(String value){
        this.setFieldCond("psdetreeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[关系父值节点]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeRSFilter pvaluelevel__eq(Integer value){
        this.setFieldCond("pvaluelevel", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeRSFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
