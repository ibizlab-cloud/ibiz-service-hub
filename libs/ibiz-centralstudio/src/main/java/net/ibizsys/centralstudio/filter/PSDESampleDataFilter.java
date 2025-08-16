package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDESAMPLEDATA 过滤器对象
 */
public class PSDESampleDataFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDESampleDataFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESampleDataFilter codename__eq(String value){
        this.setFieldCond("codename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESampleDataFilter datatype__eq(String value){
        this.setFieldCond("datatype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[逻辑模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESampleDataFilter logicmode__eq(String value){
        this.setFieldCond("logicmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESampleDataFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体主状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESampleDataFilter psdemainstateid__eq(String value){
        this.setFieldCond("psdemainstateid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体主状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESampleDataFilter psdemainstatename__eq(String value){
        this.setFieldCond("psdemainstatename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体主状态]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESampleDataFilter psdemainstatename__like(String value){
        this.setFieldCond("psdemainstatename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESampleDataFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESampleDataFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[示例数据名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESampleDataFilter psdesampledataname__eq(String value){
        this.setFieldCond("psdesampledataname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[示例数据名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESampleDataFilter psdesampledataname__like(String value){
        this.setFieldCond("psdesampledataname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统需求项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESampleDataFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统需求项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESampleDataFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统需求项]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESampleDataFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESampleDataFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESampleDataFilter usertag__eq(String value){
        this.setFieldCond("usertag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESampleDataFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESampleDataFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESampleDataFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", Conditions.EQ, value);
        return this;
    }

}
