package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDESERVICEAPI 过滤器对象
 */
public class PSDEServiceAPIFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSDEServiceAPIFilter(){
    
    }      

    /**
     * 设置属性[访问控制体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter accctrlarch__eq(Integer value){
        this.setFieldCond("accctrlarch", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[访问控制方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter dataaccmode__eq(Integer value){
        this.setFieldCond("dataaccmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[属性组模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter defgroupmode__eq(String value){
        this.setFieldCond("defgroupmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[逻辑名称语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter lnpslanresid__eq(String value){
        this.setFieldCond("lnpslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[逻辑名称语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter lnpslanresname__eq(String value){
        this.setFieldCond("lnpslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[逻辑名称语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter lnpslanresname__like(String value){
        this.setFieldCond("lnpslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[输出转换器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter outpssystranslatorid__eq(String value){
        this.setFieldCond("outpssystranslatorid", EQ, value);
        return this;
    }

    /**
     * 设置属性[输出转换器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter outpssystranslatorname__eq(String value){
        this.setFieldCond("outpssystranslatorname", EQ, value);
        return this;
    }

    /**
     * 设置属性[输出转换器]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter outpssystranslatorname__like(String value){
        this.setFieldCond("outpssystranslatorname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体属性组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter psdefgroupid__eq(String value){
        this.setFieldCond("psdefgroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter psdefgroupname__eq(String value){
        this.setFieldCond("psdefgroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter psdefgroupname__like(String value){
        this.setFieldCond("psdefgroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体接口名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter psdeserviceapiname__eq(String value){
        this.setFieldCond("psdeserviceapiname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体接口名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter psdeserviceapiname__like(String value){
        this.setFieldCond("psdeserviceapiname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter pssysserviceapiid__eq(String value){
        this.setFieldCond("pssysserviceapiid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter pssysserviceapiname__eq(String value){
        this.setFieldCond("pssysserviceapiname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统服务接口]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter pssysserviceapiname__like(String value){
        this.setFieldCond("pssysserviceapiname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
