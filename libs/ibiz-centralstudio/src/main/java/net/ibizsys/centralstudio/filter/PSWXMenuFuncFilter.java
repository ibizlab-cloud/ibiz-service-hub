package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSWXMENUFUNC 过滤器对象
 */
public class PSWXMenuFuncFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSWXMenuFuncFilter(){
    
    }      

    /**
     * 设置属性[功能类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXMenuFuncFilter functype__eq(String value){
        this.setFieldCond("functype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[微信公众号]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXMenuFuncFilter pswxaccountid__eq(String value){
        this.setFieldCond("pswxaccountid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[微信公众号]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXMenuFuncFilter pswxaccountname__eq(String value){
        this.setFieldCond("pswxaccountname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[微信公众号]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXMenuFuncFilter pswxaccountname__like(String value){
        this.setFieldCond("pswxaccountname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[微信企业应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXMenuFuncFilter pswxentappid__eq(String value){
        this.setFieldCond("pswxentappid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[微信企业应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXMenuFuncFilter pswxentappname__eq(String value){
        this.setFieldCond("pswxentappname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[微信企业应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXMenuFuncFilter pswxentappname__like(String value){
        this.setFieldCond("pswxentappname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXMenuFuncFilter pswxmenufuncname__like(String value){
        this.setFieldCond("pswxmenufuncname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXMenuFuncFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
