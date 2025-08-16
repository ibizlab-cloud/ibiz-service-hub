package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSWFLINKCOND 过滤器对象
 */
public class PSWFLinkCondFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSWFLinkCondFilter(){
    
    }      

    /**
     * 设置属性[目标属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkCondFilter dstpsdefid__eq(String value){
        this.setFieldCond("dstpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkCondFilter dstpsdefname__eq(String value){
        this.setFieldCond("dstpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkCondFilter dstpsdefname__like(String value){
        this.setFieldCond("dstpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[组合方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkCondFilter groupop__eq(String value){
        this.setFieldCond("groupop", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[逻辑类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkCondFilter logictype__eq(String value){
        this.setFieldCond("logictype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[条件值类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkCondFilter paramtype__eq(String value){
        this.setFieldCond("paramtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父条件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkCondFilter ppswflinkcondid__eq(String value){
        this.setFieldCond("ppswflinkcondid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父条件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkCondFilter ppswflinkcondname__eq(String value){
        this.setFieldCond("ppswflinkcondname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父条件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkCondFilter ppswflinkcondname__like(String value){
        this.setFieldCond("ppswflinkcondname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[值操作]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkCondFilter psdbvalueopid__eq(String value){
        this.setFieldCond("psdbvalueopid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[值操作]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkCondFilter psdbvalueopname__eq(String value){
        this.setFieldCond("psdbvalueopname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[值操作]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkCondFilter psdbvalueopname__like(String value){
        this.setFieldCond("psdbvalueopname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[条件名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkCondFilter pswflinkcondname__like(String value){
        this.setFieldCond("pswflinkcondname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[流程连接]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkCondFilter pswflinkid__eq(String value){
        this.setFieldCond("pswflinkid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程连接]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkCondFilter pswflinkname__eq(String value){
        this.setFieldCond("pswflinkname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程连接]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkCondFilter pswflinkname__like(String value){
        this.setFieldCond("pswflinkname", Conditions.LIKE, value);
        return this;
    }

}
