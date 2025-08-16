package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDESARS 过滤器对象
 */
public class PSDESARSFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSDESARSFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[从实体服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter cpsdeserviceapiid__eq(String value){
        this.setFieldCond("cpsdeserviceapiid", EQ, value);
        return this;
    }

    /**
     * 设置属性[从实体服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter cpsdeserviceapiname__eq(String value){
        this.setFieldCond("cpsdeserviceapiname", EQ, value);
        return this;
    }

    /**
     * 设置属性[从实体服务接口]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter cpsdeserviceapiname__like(String value){
        this.setFieldCond("cpsdeserviceapiname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[访问控制方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter dataaccmode__eq(Integer value){
        this.setFieldCond("dataaccmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[导出模型关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter exportmodel__eq(Integer value){
        this.setFieldCond("exportmodel", EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义导出范畴]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter exportscope__eq(Integer value){
        this.setFieldCond("exportscope", EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义导出范畴2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter exportscope2__eq(Integer value){
        this.setFieldCond("exportscope2", EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义导出范畴3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter exportscope3__eq(Integer value){
        this.setFieldCond("exportscope3", EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义导出范畴4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter exportscope4__eq(Integer value){
        this.setFieldCond("exportscope4", EQ, value);
        return this;
    }

    /**
     * 设置属性[主实体服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter ppsdeserviceapiid__eq(String value){
        this.setFieldCond("ppsdeserviceapiid", EQ, value);
        return this;
    }

    /**
     * 设置属性[主实体服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter ppsdeserviceapiname__eq(String value){
        this.setFieldCond("ppsdeserviceapiname", EQ, value);
        return this;
    }

    /**
     * 设置属性[主实体服务接口]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter ppsdeserviceapiname__like(String value){
        this.setFieldCond("ppsdeserviceapiname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter psderid__eq(String value){
        this.setFieldCond("psderid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter psdername__eq(String value){
        this.setFieldCond("psdername", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter psdername__like(String value){
        this.setFieldCond("psdername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[接口关系名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter psdesarsname__eq(String value){
        this.setFieldCond("psdesarsname", EQ, value);
        return this;
    }

    /**
     * 设置属性[接口关系名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter psdesarsname__like(String value){
        this.setFieldCond("psdesarsname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter pssysserviceapiid__eq(String value){
        this.setFieldCond("pssysserviceapiid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter pssysserviceapiname__eq(String value){
        this.setFieldCond("pssysserviceapiname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统服务接口]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter pssysserviceapiname__like(String value){
        this.setFieldCond("pssysserviceapiname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[模型同步]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter syncexportmodel__eq(Integer value){
        this.setFieldCond("syncexportmodel", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESARSFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
