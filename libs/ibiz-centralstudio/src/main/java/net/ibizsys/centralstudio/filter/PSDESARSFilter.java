package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDESARS 过滤器对象
 */
public class PSDESARSFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDESARSFilter(){
    
    }      

    /**
     * 设置属性[从实体服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter cpsdeserviceapiid__eq(String value){
        this.setFieldCond("cpsdeserviceapiid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[从实体服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter cpsdeserviceapiname__eq(String value){
        this.setFieldCond("cpsdeserviceapiname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[从实体服务接口]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter cpsdeserviceapiname__like(String value){
        this.setFieldCond("cpsdeserviceapiname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[访问控制方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter dataaccmode__eq(Integer value){
        this.setFieldCond("dataaccmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[导出模型关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter exportmodel__eq(Integer value){
        this.setFieldCond("exportmodel", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义导出范畴]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter exportscope__eq(Integer value){
        this.setFieldCond("exportscope", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义导出范畴2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter exportscope2__eq(Integer value){
        this.setFieldCond("exportscope2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义导出范畴3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter exportscope3__eq(Integer value){
        this.setFieldCond("exportscope3", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义导出范畴4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter exportscope4__eq(Integer value){
        this.setFieldCond("exportscope4", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主实体服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter ppsdeserviceapiid__eq(String value){
        this.setFieldCond("ppsdeserviceapiid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主实体服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter ppsdeserviceapiname__eq(String value){
        this.setFieldCond("ppsdeserviceapiname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主实体服务接口]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter ppsdeserviceapiname__like(String value){
        this.setFieldCond("ppsdeserviceapiname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter psderid__eq(String value){
        this.setFieldCond("psderid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter psdername__eq(String value){
        this.setFieldCond("psdername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter psdername__like(String value){
        this.setFieldCond("psdername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[接口关系名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter psdesarsname__like(String value){
        this.setFieldCond("psdesarsname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter pssysserviceapiid__eq(String value){
        this.setFieldCond("pssysserviceapiid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter pssysserviceapiname__eq(String value){
        this.setFieldCond("pssysserviceapiname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统服务接口]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter pssysserviceapiname__like(String value){
        this.setFieldCond("pssysserviceapiname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[模型同步]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter syncexportmodel__eq(Integer value){
        this.setFieldCond("syncexportmodel", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
