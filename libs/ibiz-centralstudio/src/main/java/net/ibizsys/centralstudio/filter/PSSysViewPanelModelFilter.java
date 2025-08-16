package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSVIEWPANELMODEL 过滤器对象
 */
public class PSSysViewPanelModelFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysViewPanelModelFilter(){
    
    }      

    /**
     * 设置属性[数据类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelModelFilter datatype__eq(String value){
        this.setFieldCond("datatype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[模型类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelModelFilter modeltype__eq(String value){
        this.setFieldCond("modeltype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelModelFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelModelFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelModelFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelModelFilter pssysviewpanelid__eq(String value){
        this.setFieldCond("pssysviewpanelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[面板项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelModelFilter pssysviewpanelitemid__eq(String value){
        this.setFieldCond("pssysviewpanelitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[面板项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelModelFilter pssysviewpanelitemname__eq(String value){
        this.setFieldCond("pssysviewpanelitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[面板项]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelModelFilter pssysviewpanelitemname__like(String value){
        this.setFieldCond("pssysviewpanelitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelModelFilter pssysviewpanelmodelname__like(String value){
        this.setFieldCond("pssysviewpanelmodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelModelFilter pssysviewpanelname__eq(String value){
        this.setFieldCond("pssysviewpanelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统面板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelModelFilter pssysviewpanelname__like(String value){
        this.setFieldCond("pssysviewpanelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelModelFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
