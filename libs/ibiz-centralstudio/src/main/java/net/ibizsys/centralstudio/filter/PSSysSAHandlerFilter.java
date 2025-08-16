package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSSAHANDLER 过滤器对象
 */
public class PSSysSAHandlerFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysSAHandlerFilter(){
    
    }      

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSAHandlerFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSAHandlerFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSAHandlerFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[预置接口处理器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSAHandlerFilter pssfsahandlerid__eq(String value){
        this.setFieldCond("pssfsahandlerid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[预置接口处理器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSAHandlerFilter pssfsahandlername__eq(String value){
        this.setFieldCond("pssfsahandlername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[预置接口处理器]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSAHandlerFilter pssfsahandlername__like(String value){
        this.setFieldCond("pssfsahandlername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSAHandlerFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSAHandlerFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSAHandlerFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[处理器名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSAHandlerFilter pssyssahandlername__like(String value){
        this.setFieldCond("pssyssahandlername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSAHandlerFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSAHandlerFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSAHandlerFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[接口类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSAHandlerFilter satype__eq(String value){
        this.setFieldCond("satype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSAHandlerFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
