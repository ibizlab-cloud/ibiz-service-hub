package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEFORMRF 过滤器对象
 */
public class PSDEFormRFFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEFormRFFilter(){
    
    }      

    /**
     * 设置属性[主实体表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormRFFilter majorpsdeformid__eq(String value){
        this.setFieldCond("majorpsdeformid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主实体表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormRFFilter majorpsdeformname__eq(String value){
        this.setFieldCond("majorpsdeformname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主实体表单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormRFFilter majorpsdeformname__like(String value){
        this.setFieldCond("majorpsdeformname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[从实体表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormRFFilter minorpsdeformid__eq(String value){
        this.setFieldCond("minorpsdeformid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[从实体表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormRFFilter minorpsdeformname__eq(String value){
        this.setFieldCond("minorpsdeformname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[从实体表单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormRFFilter minorpsdeformname__like(String value){
        this.setFieldCond("minorpsdeformname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormRFFilter psdeformrfname__like(String value){
        this.setFieldCond("psdeformrfname", Conditions.LIKE, value);
        return this;
    }

}
