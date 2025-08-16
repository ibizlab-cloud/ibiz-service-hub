package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSWXLOGIC 过滤器对象
 */
public class PSWXLogicFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSWXLogicFilter(){
    
    }      

    /**
     * 设置属性[事件类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter eventtype__eq(String value){
        this.setFieldCond("eventtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter psdeactionid__eq(String value){
        this.setFieldCond("psdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter psdeactionname__eq(String value){
        this.setFieldCond("psdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter psdeactionname__like(String value){
        this.setFieldCond("psdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[公众微信号]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter pswxaccountid__eq(String value){
        this.setFieldCond("pswxaccountid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[公众微信号]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter pswxaccountname__eq(String value){
        this.setFieldCond("pswxaccountname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[公众微信号]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter pswxaccountname__like(String value){
        this.setFieldCond("pswxaccountname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[微信企业应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter pswxentappid__eq(String value){
        this.setFieldCond("pswxentappid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[微信企业应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter pswxentappname__eq(String value){
        this.setFieldCond("pswxentappname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[微信企业应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter pswxentappname__like(String value){
        this.setFieldCond("pswxentappname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[响应逻辑名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter pswxlogicname__like(String value){
        this.setFieldCond("pswxlogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[微信菜单功能]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter pswxmenufuncid__eq(String value){
        this.setFieldCond("pswxmenufuncid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[微信菜单功能]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter pswxmenufuncname__eq(String value){
        this.setFieldCond("pswxmenufuncname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[微信菜单功能]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter pswxmenufuncname__like(String value){
        this.setFieldCond("pswxmenufuncname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
