package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSWFUTILUIACTION 过滤器对象
 */
public class PSWFUtilUIActionFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSWFUtilUIActionFilter(){
    
    }      

    /**
     * 设置属性[系统界面行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFUtilUIActionFilter psdeuiactionid__eq(String value){
        this.setFieldCond("psdeuiactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统界面行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFUtilUIActionFilter psdeuiactionname__eq(String value){
        this.setFieldCond("psdeuiactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统界面行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFUtilUIActionFilter psdeuiactionname__like(String value){
        this.setFieldCond("psdeuiactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[工作流设置]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFUtilUIActionFilter pssyswfsettingid__eq(String value){
        this.setFieldCond("pssyswfsettingid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流设置]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFUtilUIActionFilter pssyswfsettingname__eq(String value){
        this.setFieldCond("pssyswfsettingname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流设置]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFUtilUIActionFilter pssyswfsettingname__like(String value){
        this.setFieldCond("pssyswfsettingname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能操作名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFUtilUIActionFilter pswfutiluiactionname__like(String value){
        this.setFieldCond("pswfutiluiactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[工作流版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFUtilUIActionFilter pswfversionid__eq(String value){
        this.setFieldCond("pswfversionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFUtilUIActionFilter pswfversionname__eq(String value){
        this.setFieldCond("pswfversionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流版本]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFUtilUIActionFilter pswfversionname__like(String value){
        this.setFieldCond("pswfversionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[工作流]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFUtilUIActionFilter psworkflowid__eq(String value){
        this.setFieldCond("psworkflowid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFUtilUIActionFilter psworkflowname__eq(String value){
        this.setFieldCond("psworkflowname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFUtilUIActionFilter psworkflowname__like(String value){
        this.setFieldCond("psworkflowname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFUtilUIActionFilter utiltype__eq(String value){
        this.setFieldCond("utiltype", Conditions.EQ, value);
        return this;
    }

}
