package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSWFSETTING 过滤器对象
 */
public class PSSysWFSettingFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysWFSettingFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysWFSettingFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[催办消息模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysWFSettingFilter pssysmsgtemplid__eq(String value){
        this.setFieldCond("pssysmsgtemplid", EQ, value);
        return this;
    }

    /**
     * 设置属性[催办消息模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysWFSettingFilter pssysmsgtemplname__eq(String value){
        this.setFieldCond("pssysmsgtemplname", EQ, value);
        return this;
    }

    /**
     * 设置属性[催办消息模板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysWFSettingFilter pssysmsgtemplname__like(String value){
        this.setFieldCond("pssysmsgtemplname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysWFSettingFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysWFSettingFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysWFSettingFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[设置名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysWFSettingFilter pssyswfsettingname__eq(String value){
        this.setFieldCond("pssyswfsettingname", EQ, value);
        return this;
    }

    /**
     * 设置属性[设置名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysWFSettingFilter pssyswfsettingname__like(String value){
        this.setFieldCond("pssyswfsettingname", LIKE, value);
        return this;
    }

}
