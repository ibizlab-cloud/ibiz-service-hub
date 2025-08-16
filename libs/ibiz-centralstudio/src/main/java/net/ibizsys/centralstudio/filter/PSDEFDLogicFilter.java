package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEFDLOGIC 过滤器对象
 */
public class PSDEFDLogicFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEFDLogicFilter(){
    
    }      

    /**
     * 设置属性[组合方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFDLogicFilter groupop__eq(String value){
        this.setFieldCond("groupop", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[逻辑分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFDLogicFilter logiccat__eq(String value){
        this.setFieldCond("logiccat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[逻辑类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFDLogicFilter logictype__eq(String value){
        this.setFieldCond("logictype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFDLogicFilter ppsdefdlogicid__eq(String value){
        this.setFieldCond("ppsdefdlogicid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFDLogicFilter ppsdefdlogicname__eq(String value){
        this.setFieldCond("ppsdefdlogicname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFDLogicFilter ppsdefdlogicname__like(String value){
        this.setFieldCond("ppsdefdlogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[操作符号]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFDLogicFilter psdbvalueopid__eq(String value){
        this.setFieldCond("psdbvalueopid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[操作符号]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFDLogicFilter psdbvalueopname__eq(String value){
        this.setFieldCond("psdbvalueopname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[操作符号]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFDLogicFilter psdbvalueopname__like(String value){
        this.setFieldCond("psdbvalueopname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[逻辑项名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFDLogicFilter psdefdlogicname__like(String value){
        this.setFieldCond("psdefdlogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[表单成员]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFDLogicFilter psdeformdetailid__eq(String value){
        this.setFieldCond("psdeformdetailid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[表单成员]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFDLogicFilter psdeformdetailname__eq(String value){
        this.setFieldCond("psdeformdetailname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[表单成员]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFDLogicFilter psdeformdetailname__like(String value){
        this.setFieldCond("psdeformdetailname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFDLogicFilter psdeformid__eq(String value){
        this.setFieldCond("psdeformid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFDLogicFilter psdeformname__eq(String value){
        this.setFieldCond("psdeformname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体表单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFDLogicFilter psdeformname__like(String value){
        this.setFieldCond("psdeformname", Conditions.LIKE, value);
        return this;
    }

}
