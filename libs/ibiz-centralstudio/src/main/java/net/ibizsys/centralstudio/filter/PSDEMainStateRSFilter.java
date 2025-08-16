package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEMAINSTATERS 过滤器对象
 */
public class PSDEMainStateRSFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEMainStateRSFilter(){
    
    }      

    /**
     * 设置属性[进入状态实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateRSFilter enterpsdeactionid__eq(String value){
        this.setFieldCond("enterpsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[进入状态实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateRSFilter enterpsdeactionname__eq(String value){
        this.setFieldCond("enterpsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[进入状态实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateRSFilter enterpsdeactionname__like(String value){
        this.setFieldCond("enterpsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[进入状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateRSFilter nextpsdemsid__eq(String value){
        this.setFieldCond("nextpsdemsid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[进入状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateRSFilter nextpsdemsname__eq(String value){
        this.setFieldCond("nextpsdemsname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[进入状态]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateRSFilter nextpsdemsname__like(String value){
        this.setFieldCond("nextpsdemsname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前序状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateRSFilter prevpsdemsid__eq(String value){
        this.setFieldCond("prevpsdemsid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前序状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateRSFilter prevpsdemsname__eq(String value){
        this.setFieldCond("prevpsdemsname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前序状态]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateRSFilter prevpsdemsname__like(String value){
        this.setFieldCond("prevpsdemsname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateRSFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主状态关系名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateRSFilter psdemainstatersname__like(String value){
        this.setFieldCond("psdemainstatersname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateRSFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateRSFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateRSFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
