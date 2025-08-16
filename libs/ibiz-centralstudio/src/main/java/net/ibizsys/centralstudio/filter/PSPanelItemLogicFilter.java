package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSPANELITEMLOGIC 过滤器对象
 */
public class PSPanelItemLogicFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSPanelItemLogicFilter(){
    
    }      

    /**
     * 设置属性[目标面板逻辑参数]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSPanelItemLogicFilter dstpspanelmodelid__eq(String value){
        this.setFieldCond("dstpspanelmodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSPanelItemLogicFilter dstpspanelmodelname__eq(String value){
        this.setFieldCond("dstpspanelmodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSPanelItemLogicFilter dstpspanelmodelname__like(String value){
        this.setFieldCond("dstpspanelmodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[组合方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSPanelItemLogicFilter groupop__eq(String value){
        this.setFieldCond("groupop", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[逻辑分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSPanelItemLogicFilter logiccat__eq(String value){
        this.setFieldCond("logiccat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[逻辑类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSPanelItemLogicFilter logictype__eq(String value){
        this.setFieldCond("logictype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSPanelItemLogicFilter ppspanelitemlogicid__eq(String value){
        this.setFieldCond("ppspanelitemlogicid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSPanelItemLogicFilter ppspanelitemlogicname__eq(String value){
        this.setFieldCond("ppspanelitemlogicname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSPanelItemLogicFilter ppspanelitemlogicname__like(String value){
        this.setFieldCond("ppspanelitemlogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[面板项逻辑名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSPanelItemLogicFilter pspanelitemlogicname__like(String value){
        this.setFieldCond("pspanelitemlogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSPanelItemLogicFilter pssysviewpanelid__eq(String value){
        this.setFieldCond("pssysviewpanelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[面板项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSPanelItemLogicFilter pssysviewpanelitemid__eq(String value){
        this.setFieldCond("pssysviewpanelitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[面板项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSPanelItemLogicFilter pssysviewpanelitemname__eq(String value){
        this.setFieldCond("pssysviewpanelitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[面板项]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSPanelItemLogicFilter pssysviewpanelitemname__like(String value){
        this.setFieldCond("pssysviewpanelitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSPanelItemLogicFilter pssysviewpanelname__eq(String value){
        this.setFieldCond("pssysviewpanelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统面板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSPanelItemLogicFilter pssysviewpanelname__like(String value){
        this.setFieldCond("pssysviewpanelname", Conditions.LIKE, value);
        return this;
    }

}
