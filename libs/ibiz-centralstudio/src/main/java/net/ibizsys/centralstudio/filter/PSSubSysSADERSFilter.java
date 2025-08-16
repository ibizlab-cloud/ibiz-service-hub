package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSUBSYSSADERS 过滤器对象
 */
public class PSSubSysSADERSFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSubSysSADERSFilter(){
    
    }      

    /**
     * 设置属性[从接口实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADERSFilter cpssubsyssadeid__eq(String value){
        this.setFieldCond("cpssubsyssadeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[从接口实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADERSFilter cpssubsyssadename__eq(String value){
        this.setFieldCond("cpssubsyssadename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[从接口实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADERSFilter cpssubsyssadename__like(String value){
        this.setFieldCond("cpssubsyssadename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[主接口实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADERSFilter ppssubsyssadeid__eq(String value){
        this.setFieldCond("ppssubsyssadeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主接口实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADERSFilter ppssubsyssadename__eq(String value){
        this.setFieldCond("ppssubsyssadename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主接口实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADERSFilter ppssubsyssadename__like(String value){
        this.setFieldCond("ppssubsyssadename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[关系名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADERSFilter pssubsyssadersname__like(String value){
        this.setFieldCond("pssubsyssadersname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[外部服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADERSFilter pssubsysserviceapiid__eq(String value){
        this.setFieldCond("pssubsysserviceapiid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[外部服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADERSFilter pssubsysserviceapiname__eq(String value){
        this.setFieldCond("pssubsysserviceapiname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[外部服务接口]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADERSFilter pssubsysserviceapiname__like(String value){
        this.setFieldCond("pssubsysserviceapiname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADERSFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
