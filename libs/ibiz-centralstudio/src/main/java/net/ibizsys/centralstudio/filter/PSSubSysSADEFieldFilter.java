package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSUBSYSSADEFIELD 过滤器对象
 */
public class PSSubSysSADEFieldFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSubSysSADEFieldFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter codename__like(String value){
        this.setFieldCond("codename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[属性类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter fieldtype__eq(String value){
        this.setFieldCond("fieldtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[逻辑名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter logicname__like(String value){
        this.setFieldCond("logicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[主键属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter pkey__eq(Integer value){
        this.setFieldCond("pkey", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[预定义类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter predefinedtype__eq(String value){
        this.setFieldCond("predefinedtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter pscodelistid__eq(String value){
        this.setFieldCond("pscodelistid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter pscodelistname__eq(String value){
        this.setFieldCond("pscodelistname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter pscodelistname__like(String value){
        this.setFieldCond("pscodelistname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter psdatatypeid__eq(String value){
        this.setFieldCond("psdatatypeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter psdatatypename__eq(String value){
        this.setFieldCond("psdatatypename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据类型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter psdatatypename__like(String value){
        this.setFieldCond("psdatatypename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[属性名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter pssubsyssadefieldname__like(String value){
        this.setFieldCond("pssubsyssadefieldname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[子系统接口实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter pssubsyssadeid__eq(String value){
        this.setFieldCond("pssubsyssadeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[接口实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter pssubsyssadename__eq(String value){
        this.setFieldCond("pssubsyssadename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[接口实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter pssubsyssadename__like(String value){
        this.setFieldCond("pssubsyssadename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[PSSUBSYSSERVICEAPIID]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter pssubsysserviceapiid__eq(String value){
        this.setFieldCond("pssubsysserviceapiid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter pssysvalueruleid__eq(String value){
        this.setFieldCond("pssysvalueruleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter pssysvaluerulename__eq(String value){
        this.setFieldCond("pssysvaluerulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[值规则]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter pssysvaluerulename__like(String value){
        this.setFieldCond("pssysvaluerulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用接口实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter refpssubsyssadeid__eq(String value){
        this.setFieldCond("refpssubsyssadeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用接口实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter refpssubsyssadename__eq(String value){
        this.setFieldCond("refpssubsyssadename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用接口实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter refpssubsyssadename__like(String value){
        this.setFieldCond("refpssubsyssadename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[标准数据类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter stddatatype__eq(Integer value){
        this.setFieldCond("stddatatype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFieldFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
