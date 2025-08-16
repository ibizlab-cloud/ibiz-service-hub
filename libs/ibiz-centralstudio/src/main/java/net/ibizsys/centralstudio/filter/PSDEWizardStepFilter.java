package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEWIZARDSTEP 过滤器对象
 */
public class PSDEWizardStepFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEWizardStepFilter(){
    
    }      

    /**
     * 设置属性[初始化实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardStepFilter initpsdeactionid__eq(String value){
        this.setFieldCond("initpsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[初始化实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardStepFilter initpsdeactionname__eq(String value){
        this.setFieldCond("initpsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[初始化实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardStepFilter initpsdeactionname__like(String value){
        this.setFieldCond("initpsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardStepFilter lnpslanresid__eq(String value){
        this.setFieldCond("lnpslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardStepFilter lnpslanresname__eq(String value){
        this.setFieldCond("lnpslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardStepFilter lnpslanresname__like(String value){
        this.setFieldCond("lnpslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[下一步实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardStepFilter nextpsdeactionid__eq(String value){
        this.setFieldCond("nextpsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[下一步实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardStepFilter nextpsdeactionname__eq(String value){
        this.setFieldCond("nextpsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[下一步实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardStepFilter nextpsdeactionname__like(String value){
        this.setFieldCond("nextpsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardStepFilter psdeformid__eq(String value){
        this.setFieldCond("psdeformid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardStepFilter psdeformname__eq(String value){
        this.setFieldCond("psdeformname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体表单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardStepFilter psdeformname__like(String value){
        this.setFieldCond("psdeformname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体向导]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardStepFilter psdewizardid__eq(String value){
        this.setFieldCond("psdewizardid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体向导]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardStepFilter psdewizardname__eq(String value){
        this.setFieldCond("psdewizardname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体向导]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardStepFilter psdewizardname__like(String value){
        this.setFieldCond("psdewizardname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[步骤标题]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardStepFilter psdewizardstepname__like(String value){
        this.setFieldCond("psdewizardstepname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[标题样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardStepFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardStepFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardStepFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[标题图片]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardStepFilter pssysimageid__eq(String value){
        this.setFieldCond("pssysimageid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题图片]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardStepFilter pssysimagename__eq(String value){
        this.setFieldCond("pssysimagename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题图片]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardStepFilter pssysimagename__like(String value){
        this.setFieldCond("pssysimagename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[子标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardStepFilter subtitlepslanresid__eq(String value){
        this.setFieldCond("subtitlepslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[子标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardStepFilter subtitlepslanresname__eq(String value){
        this.setFieldCond("subtitlepslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[子标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardStepFilter subtitlepslanresname__like(String value){
        this.setFieldCond("subtitlepslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEWizardStepFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
