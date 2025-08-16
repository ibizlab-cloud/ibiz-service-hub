package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEWIZARDFORM 过滤器对象
 */
public class PSDEWizardFormFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEWizardFormFilter(){
    
    }      

    /**
     * 设置属性[确认消息语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFormFilter cmpslanresid__eq(String value){
        this.setFieldCond("cmpslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[确认消息语言资源2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFormFilter cmpslanresid2__eq(String value){
        this.setFieldCond("cmpslanresid2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[确认消息语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFormFilter cmpslanresname__eq(String value){
        this.setFieldCond("cmpslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[确认消息语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFormFilter cmpslanresname__like(String value){
        this.setFieldCond("cmpslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[确认消息语言资源2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFormFilter cmpslanresname2__eq(String value){
        this.setFieldCond("cmpslanresname2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[确认消息语言资源2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFormFilter cmpslanresname2__like(String value){
        this.setFieldCond("cmpslanresname2", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[加载操作]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFormFilter loadpsdeactionid__eq(String value){
        this.setFieldCond("loadpsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[加载操作]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFormFilter loadpsdeactionname__eq(String value){
        this.setFieldCond("loadpsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[加载操作]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFormFilter loadpsdeactionname__like(String value){
        this.setFieldCond("loadpsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[上一步操作]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFormFilter prevpsdeactionid__eq(String value){
        this.setFieldCond("prevpsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[上一步操作]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFormFilter prevpsdeactionname__eq(String value){
        this.setFieldCond("prevpsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[上一步操作]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFormFilter prevpsdeactionname__like(String value){
        this.setFieldCond("prevpsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFormFilter psdeformid__eq(String value){
        this.setFieldCond("psdeformid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFormFilter psdeformname__eq(String value){
        this.setFieldCond("psdeformname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体表单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFormFilter psdeformname__like(String value){
        this.setFieldCond("psdeformname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[向导表单名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFormFilter psdewizardformname__like(String value){
        this.setFieldCond("psdewizardformname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体向导]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFormFilter psdewizardid__eq(String value){
        this.setFieldCond("psdewizardid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体向导]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFormFilter psdewizardname__eq(String value){
        this.setFieldCond("psdewizardname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体向导]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFormFilter psdewizardname__like(String value){
        this.setFieldCond("psdewizardname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[向导步骤]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFormFilter psdewizardstepid__eq(String value){
        this.setFieldCond("psdewizardstepid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[向导步骤]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFormFilter psdewizardstepname__eq(String value){
        this.setFieldCond("psdewizardstepname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[向导步骤]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFormFilter psdewizardstepname__like(String value){
        this.setFieldCond("psdewizardstepname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[下一步操作]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFormFilter savepsdeactionid__eq(String value){
        this.setFieldCond("savepsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[下一步操作]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFormFilter savepsdeactionname__eq(String value){
        this.setFieldCond("savepsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[下一步操作]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFormFilter savepsdeactionname__like(String value){
        this.setFieldCond("savepsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardFormFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
