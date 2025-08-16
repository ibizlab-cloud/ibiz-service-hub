package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSVIEWTYPE 过滤器对象
 */
public class PSViewTypeFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSViewTypeFilter(){
    
    }      

    /**
     * 设置属性[视图引擎]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewTypeFilter psviewengineid__eq(String value){
        this.setFieldCond("psviewengineid", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图引擎]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewTypeFilter psviewenginename__eq(String value){
        this.setFieldCond("psviewenginename", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图引擎]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewTypeFilter psviewenginename__like(String value){
        this.setFieldCond("psviewenginename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图类型标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewTypeFilter psviewtypeid__like(String value){
        this.setFieldCond("psviewtypeid", LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图类型名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewTypeFilter psviewtypename__like(String value){
        this.setFieldCond("psviewtypename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewTypeFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

}
