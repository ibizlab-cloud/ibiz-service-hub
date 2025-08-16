package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDESERVICEAPI 过滤器对象
 */
public class PSDEServiceAPIFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEServiceAPIFilter(){
    
    }      

    /**
     * 设置属性[访问控制体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter accctrlarch__eq(Integer value){
        this.setFieldCond("accctrlarch", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter codename__eq(String value){
        this.setFieldCond("codename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[访问控制方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter dataaccmode__eq(Integer value){
        this.setFieldCond("dataaccmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[属性组模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter defgroupmode__eq(String value){
        this.setFieldCond("defgroupmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[逻辑名称语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter lnpslanresid__eq(String value){
        this.setFieldCond("lnpslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[逻辑名称语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter lnpslanresname__eq(String value){
        this.setFieldCond("lnpslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[逻辑名称语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter lnpslanresname__like(String value){
        this.setFieldCond("lnpslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体属性组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter psdefgroupid__eq(String value){
        this.setFieldCond("psdefgroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter psdefgroupname__eq(String value){
        this.setFieldCond("psdefgroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter psdefgroupname__like(String value){
        this.setFieldCond("psdefgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体接口名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter psdeserviceapiname__eq(String value){
        this.setFieldCond("psdeserviceapiname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体接口名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter psdeserviceapiname__like(String value){
        this.setFieldCond("psdeserviceapiname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter pssysserviceapiid__eq(String value){
        this.setFieldCond("pssysserviceapiid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter pssysserviceapiname__eq(String value){
        this.setFieldCond("pssysserviceapiname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统服务接口]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter pssysserviceapiname__like(String value){
        this.setFieldCond("pssysserviceapiname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter usertag__eq(String value){
        this.setFieldCond("usertag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEServiceAPIFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", Conditions.EQ, value);
        return this;
    }

}
