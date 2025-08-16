package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSACHANDLERACTION 过滤器对象
 */
public class PSACHandlerActionFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSACHandlerActionFilter(){
    
    }      

    /**
     * 设置属性[行为类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerActionFilter actiontype__eq(String value){
        this.setFieldCond("actiontype", EQ, value);
        return this;
    }

    /**
     * 设置属性[行为标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerActionFilter psachandleractionname__eq(String value){
        this.setFieldCond("psachandleractionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[行为标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerActionFilter psachandleractionname__like(String value){
        this.setFieldCond("psachandleractionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerActionFilter psachandlerid__eq(String value){
        this.setFieldCond("psachandlerid", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerActionFilter psachandlername__eq(String value){
        this.setFieldCond("psachandlername", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面处理对象]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerActionFilter psachandlername__like(String value){
        this.setFieldCond("psachandlername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerActionFilter psdeactionid__eq(String value){
        this.setFieldCond("psdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerActionFilter psdeactionname__eq(String value){
        this.setFieldCond("psdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerActionFilter psdeactionname__like(String value){
        this.setFieldCond("psdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体操作标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerActionFilter psdeopprivid__eq(String value){
        this.setFieldCond("psdeopprivid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体操作标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerActionFilter psdeopprivname__eq(String value){
        this.setFieldCond("psdeopprivname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体操作标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerActionFilter psdeopprivname__like(String value){
        this.setFieldCond("psdeopprivname", LIKE, value);
        return this;
    }

}
