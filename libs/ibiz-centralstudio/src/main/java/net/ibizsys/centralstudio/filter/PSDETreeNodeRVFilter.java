package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDETREENODERV 过滤器对象
 */
public class PSDETreeNodeRVFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDETreeNodeRVFilter(){
    
    }      

    /**
     * 设置属性[树节点]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeRVFilter psdetreenodeid__eq(String value){
        this.setFieldCond("psdetreenodeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[树节点]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeRVFilter psdetreenodename__eq(String value){
        this.setFieldCond("psdetreenodename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[树节点]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeRVFilter psdetreenodename__like(String value){
        this.setFieldCond("psdetreenodename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用模式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeRVFilter psdetreenodervname__like(String value){
        this.setFieldCond("psdetreenodervname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeRVFilter psdeviewbaseid__eq(String value){
        this.setFieldCond("psdeviewbaseid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeRVFilter psdeviewbasename__eq(String value){
        this.setFieldCond("psdeviewbasename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeRVFilter psdeviewbasename__like(String value){
        this.setFieldCond("psdeviewbasename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeRVFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
