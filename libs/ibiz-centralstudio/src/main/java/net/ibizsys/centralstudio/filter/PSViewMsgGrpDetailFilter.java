package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSVIEWMSGGRPDETAIL 过滤器对象
 */
public class PSViewMsgGrpDetailFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSViewMsgGrpDetailFilter(){
    
    }      

    /**
     * 设置属性[消息位置]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGrpDetailFilter msgpos__eq(String value){
        this.setFieldCond("msgpos", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGrpDetailFilter psviewmsggroupid__eq(String value){
        this.setFieldCond("psviewmsggroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGrpDetailFilter psviewmsggroupname__eq(String value){
        this.setFieldCond("psviewmsggroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGrpDetailFilter psviewmsggroupname__like(String value){
        this.setFieldCond("psviewmsggroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图消息]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGrpDetailFilter psviewmsgid__eq(String value){
        this.setFieldCond("psviewmsgid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[视图消息]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGrpDetailFilter psviewmsgname__eq(String value){
        this.setFieldCond("psviewmsgname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[视图消息]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGrpDetailFilter psviewmsgname__like(String value){
        this.setFieldCond("psviewmsgname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSViewMsgGrpDetailFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
