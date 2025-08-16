package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSTEM 过滤器对象
 */
public class PSSystemFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSystemFilter(){
    
    }      

    /**
     * 设置属性[访问控制体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter accctrlarch__eq(Integer value){
        this.setFieldCond("accctrlarch", EQ, value);
        return this;
    }

    /**
     * 设置属性[引擎问题修复]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter bugfixs__eq(Integer value){
        this.setFieldCond("bugfixs", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码表无值文本语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter clemptytextpslanresid__eq(String value){
        this.setFieldCond("clemptytextpslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码表无值文本语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter clemptytextpslanresname__eq(String value){
        this.setFieldCond("clemptytextpslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码表无值文本语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter clemptytextpslanresname__like(String value){
        this.setFieldCond("clemptytextpslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[属性默认排序]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter defsortmode__eq(String value){
        this.setFieldCond("defsortmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体主状态行为控制模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter demsactionlogicflag__eq(Integer value){
        this.setFieldCond("demsactionlogicflag", EQ, value);
        return this;
    }

    /**
     * 设置属性[低代码模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter lowcodemode__eq(Integer value){
        this.setFieldCond("lowcodemode", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统默认语言]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter pslanguageid__eq(String value){
        this.setFieldCond("pslanguageid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统默认语言]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter pslanguagename__eq(String value){
        this.setFieldCond("pslanguagename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统默认语言]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter pslanguagename__like(String value){
        this.setFieldCond("pslanguagename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台技术架构]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter pssfid__eq(String value){
        this.setFieldCond("pssfid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后台技术架构]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter pssfname__eq(String value){
        this.setFieldCond("pssfname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后台技术架构]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter pssfname__like(String value){
        this.setFieldCond("pssfname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统引擎配置]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter pssysenginecfgid__eq(String value){
        this.setFieldCond("pssysenginecfgid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统引擎配置]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter pssysenginecfgname__eq(String value){
        this.setFieldCond("pssysenginecfgname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统引擎配置]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter pssysenginecfgname__like(String value){
        this.setFieldCond("pssysenginecfgname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[SaaS构型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter saasmode__eq(Integer value){
        this.setFieldCond("saasmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[服务API模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter serviceapiflag__eq(Integer value){
        this.setFieldCond("serviceapiflag", EQ, value);
        return this;
    }

    /**
     * 设置属性[源系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter srcpssystemid__eq(String value){
        this.setFieldCond("srcpssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[源系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter srcpssystemname__eq(String value){
        this.setFieldCond("srcpssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[源系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter srcpssystemname__like(String value){
        this.setFieldCond("srcpssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[子系统实体主状态行为控制模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter ssdemsactionlogicflag__eq(Integer value){
        this.setFieldCond("ssdemsactionlogicflag", EQ, value);
        return this;
    }

    /**
     * 设置属性[模板引擎]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter templengine__eq(String value){
        this.setFieldCond("templengine", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图界面行为注册]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter viewuaregmode__eq(Integer value){
        this.setFieldCond("viewuaregmode", EQ, value);
        return this;
    }

}
