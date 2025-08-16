package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEMAINSTATE 过滤器对象
 */
public class PSDEMainStateFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEMainStateFilter(){
    
    }      

    /**
     * 设置属性[行为控制模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter allowmode__eq(String value){
        this.setFieldCond("allowmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[行为拒绝消息语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter deactiondmpslanresid__eq(String value){
        this.setFieldCond("deactiondmpslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[行为拒绝消息语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter deactiondmpslanresname__eq(String value){
        this.setFieldCond("deactiondmpslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[行为拒绝消息语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter deactiondmpslanresname__like(String value){
        this.setFieldCond("deactiondmpslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[操作标识拒绝消息语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter deopprivdmpslanresid__eq(String value){
        this.setFieldCond("deopprivdmpslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[操作标识拒绝消息语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter deopprivdmpslanresname__eq(String value){
        this.setFieldCond("deopprivdmpslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[操作标识拒绝消息语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter deopprivdmpslanresname__like(String value){
        this.setFieldCond("deopprivdmpslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[编辑视图类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter editviewtype__eq(String value){
        this.setFieldCond("editviewtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[进入状态实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter enterpsdeactionid__eq(String value){
        this.setFieldCond("enterpsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[进入状态实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter enterpsdeactionname__eq(String value){
        this.setFieldCond("enterpsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[进入状态实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter enterpsdeactionname__like(String value){
        this.setFieldCond("enterpsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[属性允许模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter fieldallowmode__eq(String value){
        this.setFieldCond("fieldallowmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端编辑视图类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter mobeditviewtype__eq(String value){
        this.setFieldCond("mobeditviewtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter mobpsdeformid__eq(String value){
        this.setFieldCond("mobpsdeformid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter mobpsdeformname__eq(String value){
        this.setFieldCond("mobpsdeformname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端表单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter mobpsdeformname__like(String value){
        this.setFieldCond("mobpsdeformname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[移动端快速表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter mobquickpsdeformid__eq(String value){
        this.setFieldCond("mobquickpsdeformid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端快速表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter mobquickpsdeformname__eq(String value){
        this.setFieldCond("mobquickpsdeformname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端快速表单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter mobquickpsdeformname__like(String value){
        this.setFieldCond("mobquickpsdeformname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[移动端功能表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter mobutilpsdeformid__eq(String value){
        this.setFieldCond("mobutilpsdeformid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端功能表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter mobutilpsdeformname__eq(String value){
        this.setFieldCond("mobutilpsdeformname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端功能表单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter mobutilpsdeformname__like(String value){
        this.setFieldCond("mobutilpsdeformname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[操作标识允许模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter opprivallowmode__eq(String value){
        this.setFieldCond("opprivallowmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据查询]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter psdedqid__eq(String value){
        this.setFieldCond("psdedqid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据查询]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter psdedqname__eq(String value){
        this.setFieldCond("psdedqname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据查询]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter psdedqname__like(String value){
        this.setFieldCond("psdedqname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[主状态表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter psdeformid__eq(String value){
        this.setFieldCond("psdeformid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主状态表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter psdeformname__eq(String value){
        this.setFieldCond("psdeformname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主状态表单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter psdeformname__like(String value){
        this.setFieldCond("psdeformname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主状态名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter psdemainstatename__like(String value){
        this.setFieldCond("psdemainstatename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[主状态图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter pssysimageid__eq(String value){
        this.setFieldCond("pssysimageid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主状态图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter pssysimagename__eq(String value){
        this.setFieldCond("pssysimagename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主状态图标]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter pssysimagename__like(String value){
        this.setFieldCond("pssysimagename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[主状态快速表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter quickpsdeformid__eq(String value){
        this.setFieldCond("quickpsdeformid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主状态快速表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter quickpsdeformname__eq(String value){
        this.setFieldCond("quickpsdeformname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主状态快速表单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter quickpsdeformname__like(String value){
        this.setFieldCond("quickpsdeformname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter textpslanresid__eq(String value){
        this.setFieldCond("textpslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter textpslanresname__eq(String value){
        this.setFieldCond("textpslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter textpslanresname__like(String value){
        this.setFieldCond("textpslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter tippslanresid__eq(String value){
        this.setFieldCond("tippslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter tippslanresname__eq(String value){
        this.setFieldCond("tippslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter tippslanresname__like(String value){
        this.setFieldCond("tippslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter utilpsdeformid__eq(String value){
        this.setFieldCond("utilpsdeformid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter utilpsdeformname__eq(String value){
        this.setFieldCond("utilpsdeformname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能表单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter utilpsdeformname__like(String value){
        this.setFieldCond("utilpsdeformname", Conditions.LIKE, value);
        return this;
    }

}
