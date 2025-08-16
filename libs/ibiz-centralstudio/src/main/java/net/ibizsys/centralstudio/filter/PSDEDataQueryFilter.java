package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEDATAQUERY 过滤器对象
 */
public class PSDEDataQueryFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEDataQueryFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataQueryFilter codename__like(String value){
        this.setFieldCond("codename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[扩展模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataQueryFilter extendmode__eq(Integer value){
        this.setFieldCond("extendmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[中文名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataQueryFilter logicname__like(String value){
        this.setFieldCond("logicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[查询标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataQueryFilter psdedataqueryname__like(String value){
        this.setFieldCond("psdedataqueryname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[属性组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataQueryFilter psdefgroupid__eq(String value){
        this.setFieldCond("psdefgroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[属性组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataQueryFilter psdefgroupname__eq(String value){
        this.setFieldCond("psdefgroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[属性组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataQueryFilter psdefgroupname__like(String value){
        this.setFieldCond("psdefgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataQueryFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataQueryFilter psdemainstateid__eq(String value){
        this.setFieldCond("psdemainstateid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataQueryFilter psdemainstatename__eq(String value){
        this.setFieldCond("psdemainstatename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主状态]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataQueryFilter psdemainstatename__like(String value){
        this.setFieldCond("psdemainstatename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataQueryFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataQueryFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataQueryFilter requestmethod__eq(String value){
        this.setFieldCond("requestmethod", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataQueryFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[选择列级别]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataQueryFilter viewcollevel__eq(Integer value){
        this.setFieldCond("viewcollevel", Conditions.EQ, value);
        return this;
    }

}
