package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSWXMENU 过滤器对象
 */
public class PSWXMenuFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSWXMenuFilter(){
    
    }      

    /**
     * 设置属性[微信公众号]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXMenuFilter pswxaccountid__eq(String value){
        this.setFieldCond("pswxaccountid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[微信公众号]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXMenuFilter pswxaccountname__eq(String value){
        this.setFieldCond("pswxaccountname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[微信公众号]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXMenuFilter pswxaccountname__like(String value){
        this.setFieldCond("pswxaccountname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[微信企业应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXMenuFilter pswxentappid__eq(String value){
        this.setFieldCond("pswxentappid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[微信企业应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXMenuFilter pswxentappname__eq(String value){
        this.setFieldCond("pswxentappname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[微信企业应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXMenuFilter pswxentappname__like(String value){
        this.setFieldCond("pswxentappname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[微信菜单名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXMenuFilter pswxmenuname__like(String value){
        this.setFieldCond("pswxmenuname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXMenuFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
