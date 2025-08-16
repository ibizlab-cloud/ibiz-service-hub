package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSTEMRUN 过滤器对象
 */
public class PSSystemRunFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSystemRunFilter(){
    
    }      

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssysappid2__eq(String value){
        this.setFieldCond("pssysappid2", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端应用2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssysappname2__eq(String value){
        this.setFieldCond("pssysappname2", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssysappname2__like(String value){
        this.setFieldCond("pssysappname2", LIKE, value);
        return this;
    }

    /**
     * 设置属性[大数据源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssysbdinstcfgid__eq(String value){
        this.setFieldCond("pssysbdinstcfgid", EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssysbdinstcfgname__eq(String value){
        this.setFieldCond("pssysbdinstcfgname", EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssysbdinstcfgname__like(String value){
        this.setFieldCond("pssysbdinstcfgname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssyssfpubid__eq(String value){
        this.setFieldCond("pssyssfpubid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后台体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssyssfpubname__eq(String value){
        this.setFieldCond("pssyssfpubname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后台体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssyssfpubname__like(String value){
        this.setFieldCond("pssyssfpubname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统应用服务器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssystemasid__eq(String value){
        this.setFieldCond("pssystemasid", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用服务器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssystemasname__eq(String value){
        this.setFieldCond("pssystemasname", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用服务器]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssystemasname__like(String value){
        this.setFieldCond("pssystemasname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[运行数据库]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssystemdbcfgid__eq(String value){
        this.setFieldCond("pssystemdbcfgid", EQ, value);
        return this;
    }

    /**
     * 设置属性[运行数据库]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssystemdbcfgname__eq(String value){
        this.setFieldCond("pssystemdbcfgname", EQ, value);
        return this;
    }

    /**
     * 设置属性[运行数据库]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssystemdbcfgname__like(String value){
        this.setFieldCond("pssystemdbcfgname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[运行名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssystemrunname__eq(String value){
        this.setFieldCond("pssystemrunname", EQ, value);
        return this;
    }

    /**
     * 设置属性[运行名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssystemrunname__like(String value){
        this.setFieldCond("pssystemrunname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[运行动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter runpssysdynamodelid__eq(String value){
        this.setFieldCond("runpssysdynamodelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[运行动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter runpssysdynamodelname__eq(String value){
        this.setFieldCond("runpssysdynamodelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[运行动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter runpssysdynamodelname__like(String value){
        this.setFieldCond("runpssysdynamodelname", LIKE, value);
        return this;
    }

}
