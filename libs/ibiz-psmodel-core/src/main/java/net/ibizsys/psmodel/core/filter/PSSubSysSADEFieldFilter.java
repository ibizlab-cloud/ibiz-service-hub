package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSUBSYSSADEFIELD 过滤器对象
 */
public class PSSubSysSADEFieldFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSubSysSADEFieldFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter codename__like(String value){
        this.setFieldCond("codename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[属性类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter fieldtype__eq(String value){
        this.setFieldCond("fieldtype", EQ, value);
        return this;
    }

    /**
     * 设置属性[逻辑名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter logicname__like(String value){
        this.setFieldCond("logicname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[主键属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter pkey__eq(Integer value){
        this.setFieldCond("pkey", EQ, value);
        return this;
    }

    /**
     * 设置属性[预定义类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter predefinedtype__eq(String value){
        this.setFieldCond("predefinedtype", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter pscodelistid__eq(String value){
        this.setFieldCond("pscodelistid", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter pscodelistname__eq(String value){
        this.setFieldCond("pscodelistname", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter pscodelistname__like(String value){
        this.setFieldCond("pscodelistname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter psdatatypeid__eq(String value){
        this.setFieldCond("psdatatypeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter psdatatypename__eq(String value){
        this.setFieldCond("psdatatypename", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据类型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter psdatatypename__like(String value){
        this.setFieldCond("psdatatypename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[属性名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter pssubsyssadefieldname__eq(String value){
        this.setFieldCond("pssubsyssadefieldname", EQ, value);
        return this;
    }

    /**
     * 设置属性[属性名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter pssubsyssadefieldname__like(String value){
        this.setFieldCond("pssubsyssadefieldname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[子系统接口实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter pssubsyssadeid__eq(String value){
        this.setFieldCond("pssubsyssadeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[接口实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter pssubsyssadename__eq(String value){
        this.setFieldCond("pssubsyssadename", EQ, value);
        return this;
    }

    /**
     * 设置属性[接口实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter pssubsyssadename__like(String value){
        this.setFieldCond("pssubsyssadename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[PSSUBSYSSERVICEAPIID]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter pssubsysserviceapiid__eq(String value){
        this.setFieldCond("pssubsysserviceapiid", EQ, value);
        return this;
    }

    /**
     * 设置属性[值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter pssysvalueruleid__eq(String value){
        this.setFieldCond("pssysvalueruleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter pssysvaluerulename__eq(String value){
        this.setFieldCond("pssysvaluerulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[值规则]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter pssysvaluerulename__like(String value){
        this.setFieldCond("pssysvaluerulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用接口实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter refpssubsyssadeid__eq(String value){
        this.setFieldCond("refpssubsyssadeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[引用接口实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter refpssubsyssadename__eq(String value){
        this.setFieldCond("refpssubsyssadename", EQ, value);
        return this;
    }

    /**
     * 设置属性[引用接口实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter refpssubsyssadename__like(String value){
        this.setFieldCond("refpssubsyssadename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[标准数据类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter stddatatype__eq(Integer value){
        this.setFieldCond("stddatatype", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
