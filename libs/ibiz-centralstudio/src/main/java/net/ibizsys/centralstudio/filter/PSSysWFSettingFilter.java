package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSWFSETTING 过滤器对象
 */
public class PSSysWFSettingFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysWFSettingFilter(){
    
    }      

    /**
     * 设置属性[催办消息模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysWFSettingFilter pssysmsgtemplid__eq(String value){
        this.setFieldCond("pssysmsgtemplid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[催办消息模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysWFSettingFilter pssysmsgtemplname__eq(String value){
        this.setFieldCond("pssysmsgtemplname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[催办消息模板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysWFSettingFilter pssysmsgtemplname__like(String value){
        this.setFieldCond("pssysmsgtemplname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysWFSettingFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysWFSettingFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysWFSettingFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[设置名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysWFSettingFilter pssyswfsettingname__like(String value){
        this.setFieldCond("pssyswfsettingname", Conditions.LIKE, value);
        return this;
    }

}
