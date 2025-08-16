package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSWFUTILUIACTION 过滤器对象
 */
public class PSWFUtilUIActionFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSWFUtilUIActionFilter(){
    
    }      

    /**
     * 设置属性[系统界面行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFUtilUIActionFilter psdeuiactionid__eq(String value){
        this.setFieldCond("psdeuiactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统界面行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFUtilUIActionFilter psdeuiactionname__eq(String value){
        this.setFieldCond("psdeuiactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统界面行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFUtilUIActionFilter psdeuiactionname__like(String value){
        this.setFieldCond("psdeuiactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[工作流设置]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFUtilUIActionFilter pssyswfsettingid__eq(String value){
        this.setFieldCond("pssyswfsettingid", EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流设置]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFUtilUIActionFilter pssyswfsettingname__eq(String value){
        this.setFieldCond("pssyswfsettingname", EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流设置]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFUtilUIActionFilter pssyswfsettingname__like(String value){
        this.setFieldCond("pssyswfsettingname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能操作名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFUtilUIActionFilter pswfutiluiactionname__eq(String value){
        this.setFieldCond("pswfutiluiactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能操作名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFUtilUIActionFilter pswfutiluiactionname__like(String value){
        this.setFieldCond("pswfutiluiactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[工作流版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFUtilUIActionFilter pswfversionid__eq(String value){
        this.setFieldCond("pswfversionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFUtilUIActionFilter pswfversionname__eq(String value){
        this.setFieldCond("pswfversionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流版本]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFUtilUIActionFilter pswfversionname__like(String value){
        this.setFieldCond("pswfversionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[工作流]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFUtilUIActionFilter psworkflowid__eq(String value){
        this.setFieldCond("psworkflowid", EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFUtilUIActionFilter psworkflowname__eq(String value){
        this.setFieldCond("psworkflowname", EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFUtilUIActionFilter psworkflowname__like(String value){
        this.setFieldCond("psworkflowname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFUtilUIActionFilter utiltype__eq(String value){
        this.setFieldCond("utiltype", EQ, value);
        return this;
    }

}
