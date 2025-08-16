package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSWXENTAPP 过滤器对象
 */
public class PSWXEntAppFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSWXEntAppFilter(){
    
    }      

    /**
     * 设置属性[应用类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXEntAppFilter apptype__eq(String value){
        this.setFieldCond("apptype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXEntAppFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXEntAppFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXEntAppFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[微信公众号]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXEntAppFilter pswxaccountid__eq(String value){
        this.setFieldCond("pswxaccountid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[微信公众号]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXEntAppFilter pswxaccountname__eq(String value){
        this.setFieldCond("pswxaccountname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[微信公众号]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXEntAppFilter pswxaccountname__like(String value){
        this.setFieldCond("pswxaccountname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXEntAppFilter pswxentappname__like(String value){
        this.setFieldCond("pswxentappname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXEntAppFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
