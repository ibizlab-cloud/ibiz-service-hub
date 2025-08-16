package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSVIEWPANELLOGIC 过滤器对象
 */
public class PSSysViewPanelLogicFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysViewPanelLogicFilter(){
    
    }      

    /**
     * 设置属性[目标逻辑类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelLogicFilter dstlogictype__eq(String value){
        this.setFieldCond("dstlogictype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[布局系统面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelLogicFilter layoutpssysviewpanelid__eq(String value){
        this.setFieldCond("layoutpssysviewpanelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[布局系统面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelLogicFilter layoutpssysviewpanelname__eq(String value){
        this.setFieldCond("layoutpssysviewpanelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[布局系统面板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelLogicFilter layoutpssysviewpanelname__like(String value){
        this.setFieldCond("layoutpssysviewpanelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[逻辑类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelLogicFilter logictype__eq(String value){
        this.setFieldCond("logictype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[参数面板项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelLogicFilter parampspanelitemid__eq(String value){
        this.setFieldCond("parampspanelitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[参数面板项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelLogicFilter parampspanelitemname__eq(String value){
        this.setFieldCond("parampspanelitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[参数面板项]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelLogicFilter parampspanelitemname__like(String value){
        this.setFieldCond("parampspanelitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用功能]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelLogicFilter psappfuncid__eq(String value){
        this.setFieldCond("psappfuncid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用功能]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelLogicFilter psappfuncname__eq(String value){
        this.setFieldCond("psappfuncname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用功能]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelLogicFilter psappfuncname__like(String value){
        this.setFieldCond("psappfuncname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelLogicFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面处理逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelLogicFilter psdelogicid__eq(String value){
        this.setFieldCond("psdelogicid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面处理逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelLogicFilter psdelogicname__eq(String value){
        this.setFieldCond("psdelogicname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面处理逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelLogicFilter psdelogicname__like(String value){
        this.setFieldCond("psdelogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelLogicFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelLogicFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[调用界面行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelLogicFilter psdeuiactionid__eq(String value){
        this.setFieldCond("psdeuiactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[调用界面行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelLogicFilter psdeuiactionname__eq(String value){
        this.setFieldCond("psdeuiactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[调用界面行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelLogicFilter psdeuiactionname__like(String value){
        this.setFieldCond("psdeuiactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelLogicFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelLogicFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelLogicFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统视图逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelLogicFilter pssysviewlogicid__eq(String value){
        this.setFieldCond("pssysviewlogicid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统视图逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelLogicFilter pssysviewlogicname__eq(String value){
        this.setFieldCond("pssysviewlogicname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统视图逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelLogicFilter pssysviewlogicname__like(String value){
        this.setFieldCond("pssysviewlogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelLogicFilter pssysviewpanelid__eq(String value){
        this.setFieldCond("pssysviewpanelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[面板项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelLogicFilter pssysviewpanelitemid__eq(String value){
        this.setFieldCond("pssysviewpanelitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[面板项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelLogicFilter pssysviewpanelitemname__eq(String value){
        this.setFieldCond("pssysviewpanelitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[面板项]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelLogicFilter pssysviewpanelitemname__like(String value){
        this.setFieldCond("pssysviewpanelitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[逻辑标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelLogicFilter pssysviewpanellogicname__eq(String value){
        this.setFieldCond("pssysviewpanellogicname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[逻辑标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelLogicFilter pssysviewpanellogicname__like(String value){
        this.setFieldCond("pssysviewpanellogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[面板模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelLogicFilter pssysviewpanelmodelid__eq(String value){
        this.setFieldCond("pssysviewpanelmodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[面板模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelLogicFilter pssysviewpanelmodelname__eq(String value){
        this.setFieldCond("pssysviewpanelmodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[面板模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelLogicFilter pssysviewpanelmodelname__like(String value){
        this.setFieldCond("pssysviewpanelmodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelLogicFilter pssysviewpanelname__eq(String value){
        this.setFieldCond("pssysviewpanelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统面板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelLogicFilter pssysviewpanelname__like(String value){
        this.setFieldCond("pssysviewpanelname", Conditions.LIKE, value);
        return this;
    }

}
