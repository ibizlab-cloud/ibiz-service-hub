package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEDATAQUERY 过滤器对象
 */
public class PSDEDataQueryFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSDEDataQueryFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataQueryFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataQueryFilter codename__like(String value){
        this.setFieldCond("codename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[扩展模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataQueryFilter extendmode__eq(Integer value){
        this.setFieldCond("extendmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[中文名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataQueryFilter logicname__like(String value){
        this.setFieldCond("logicname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[查询标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataQueryFilter psdedataqueryname__eq(String value){
        this.setFieldCond("psdedataqueryname", EQ, value);
        return this;
    }

    /**
     * 设置属性[查询标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataQueryFilter psdedataqueryname__like(String value){
        this.setFieldCond("psdedataqueryname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[属性组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataQueryFilter psdefgroupid__eq(String value){
        this.setFieldCond("psdefgroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[属性组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataQueryFilter psdefgroupname__eq(String value){
        this.setFieldCond("psdefgroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[属性组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataQueryFilter psdefgroupname__like(String value){
        this.setFieldCond("psdefgroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataQueryFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[主状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataQueryFilter psdemainstateid__eq(String value){
        this.setFieldCond("psdemainstateid", EQ, value);
        return this;
    }

    /**
     * 设置属性[主状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataQueryFilter psdemainstatename__eq(String value){
        this.setFieldCond("psdemainstatename", EQ, value);
        return this;
    }

    /**
     * 设置属性[主状态]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataQueryFilter psdemainstatename__like(String value){
        this.setFieldCond("psdemainstatename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataQueryFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataQueryFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataQueryFilter requestmethod__eq(String value){
        this.setFieldCond("requestmethod", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataQueryFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataQueryFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataQueryFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataQueryFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataQueryFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

    /**
     * 设置属性[选择列级别]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataQueryFilter viewcollevel__eq(Integer value){
        this.setFieldCond("viewcollevel", EQ, value);
        return this;
    }

}
