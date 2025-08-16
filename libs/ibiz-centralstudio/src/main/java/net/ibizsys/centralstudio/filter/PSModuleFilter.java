package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSMODULE 过滤器对象
 */
public class PSModuleFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSModuleFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter codename__like(String value){
        this.setFieldCond("codename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[模块名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模型组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter pssysmodelgroupid__eq(String value){
        this.setFieldCond("pssysmodelgroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模型组]过滤操作[ISNULL]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter pssysmodelgroupid__isnull(String value){
        this.setFieldCond("pssysmodelgroupid", Conditions.ISNULL, value);
        return this;
    }

    /**
     * 设置属性[系统模型组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter pssysmodelgroupname__eq(String value){
        this.setFieldCond("pssysmodelgroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模型组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter pssysmodelgroupname__like(String value){
        this.setFieldCond("pssysmodelgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[子系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter pssysrefid__eq(String value){
        this.setFieldCond("pssysrefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[子系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter pssysrefname__eq(String value){
        this.setFieldCond("pssysrefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[子系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter pssysrefname__like(String value){
        this.setFieldCond("pssysrefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter pssyssfpubid__eq(String value){
        this.setFieldCond("pssyssfpubid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter pssyssfpubname__eq(String value){
        this.setFieldCond("pssyssfpubname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter pssyssfpubname__like(String value){
        this.setFieldCond("pssyssfpubname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[服务API模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter serviceapiflag__eq(Integer value){
        this.setFieldCond("serviceapiflag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[子系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter subsysmodule__eq(Integer value){
        this.setFieldCond("subsysmodule", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[子系统类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter sysreftype__eq(String value){
        this.setFieldCond("sysreftype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
