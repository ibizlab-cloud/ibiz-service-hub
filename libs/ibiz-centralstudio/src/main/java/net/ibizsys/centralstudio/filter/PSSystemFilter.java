package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSTEM 过滤器对象
 */
public class PSSystemFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSystemFilter(){
    
    }      

    /**
     * 设置属性[访问控制体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter accctrlarch__eq(Integer value){
        this.setFieldCond("accctrlarch", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引擎问题修复]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter bugfixs__eq(Integer value){
        this.setFieldCond("bugfixs", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[代码表无值文本语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter clemptytextpslanresid__eq(String value){
        this.setFieldCond("clemptytextpslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[代码表无值文本语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter clemptytextpslanresname__eq(String value){
        this.setFieldCond("clemptytextpslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[代码表无值文本语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter clemptytextpslanresname__like(String value){
        this.setFieldCond("clemptytextpslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[属性默认排序]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter defsortmode__eq(String value){
        this.setFieldCond("defsortmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体主状态行为控制模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter demsactionlogicflag__eq(Integer value){
        this.setFieldCond("demsactionlogicflag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[低代码模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter lowcodemode__eq(Integer value){
        this.setFieldCond("lowcodemode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统默认语言]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter pslanguageid__eq(String value){
        this.setFieldCond("pslanguageid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统默认语言]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter pslanguagename__eq(String value){
        this.setFieldCond("pslanguagename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统默认语言]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter pslanguagename__like(String value){
        this.setFieldCond("pslanguagename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台技术架构]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter pssfid__eq(String value){
        this.setFieldCond("pssfid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台技术架构]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter pssfname__eq(String value){
        this.setFieldCond("pssfname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台技术架构]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter pssfname__like(String value){
        this.setFieldCond("pssfname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统引擎配置]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter pssysenginecfgid__eq(String value){
        this.setFieldCond("pssysenginecfgid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统引擎配置]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter pssysenginecfgname__eq(String value){
        this.setFieldCond("pssysenginecfgname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统引擎配置]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter pssysenginecfgname__like(String value){
        this.setFieldCond("pssysenginecfgname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[SaaS构型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter saasmode__eq(Integer value){
        this.setFieldCond("saasmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[服务API模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter serviceapiflag__eq(Integer value){
        this.setFieldCond("serviceapiflag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[源系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter srcpssystemid__eq(String value){
        this.setFieldCond("srcpssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[源系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter srcpssystemname__eq(String value){
        this.setFieldCond("srcpssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[源系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter srcpssystemname__like(String value){
        this.setFieldCond("srcpssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[子系统实体主状态行为控制模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter ssdemsactionlogicflag__eq(Integer value){
        this.setFieldCond("ssdemsactionlogicflag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[模板引擎]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter templengine__eq(String value){
        this.setFieldCond("templengine", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[视图界面行为注册]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemFilter viewuaregmode__eq(Integer value){
        this.setFieldCond("viewuaregmode", Conditions.EQ, value);
        return this;
    }

}
