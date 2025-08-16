package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEMAINSTATE 过滤器对象
 */
public class PSDEMainStateFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSDEMainStateFilter(){
    
    }      

    /**
     * 设置属性[行为控制模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter allowmode__eq(String value){
        this.setFieldCond("allowmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[行为拒绝消息语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter deactiondmpslanresid__eq(String value){
        this.setFieldCond("deactiondmpslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[行为拒绝消息语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter deactiondmpslanresname__eq(String value){
        this.setFieldCond("deactiondmpslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[行为拒绝消息语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter deactiondmpslanresname__like(String value){
        this.setFieldCond("deactiondmpslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[操作标识拒绝消息语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter deopprivdmpslanresid__eq(String value){
        this.setFieldCond("deopprivdmpslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[操作标识拒绝消息语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter deopprivdmpslanresname__eq(String value){
        this.setFieldCond("deopprivdmpslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[操作标识拒绝消息语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter deopprivdmpslanresname__like(String value){
        this.setFieldCond("deopprivdmpslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[编辑视图类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter editviewtype__eq(String value){
        this.setFieldCond("editviewtype", EQ, value);
        return this;
    }

    /**
     * 设置属性[进入状态实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter enterpsdeactionid__eq(String value){
        this.setFieldCond("enterpsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[进入状态实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter enterpsdeactionname__eq(String value){
        this.setFieldCond("enterpsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[进入状态实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter enterpsdeactionname__like(String value){
        this.setFieldCond("enterpsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[属性允许模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter fieldallowmode__eq(String value){
        this.setFieldCond("fieldallowmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端编辑视图类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter mobeditviewtype__eq(String value){
        this.setFieldCond("mobeditviewtype", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter mobpsdeformid__eq(String value){
        this.setFieldCond("mobpsdeformid", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter mobpsdeformname__eq(String value){
        this.setFieldCond("mobpsdeformname", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端表单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter mobpsdeformname__like(String value){
        this.setFieldCond("mobpsdeformname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[移动端快速表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter mobquickpsdeformid__eq(String value){
        this.setFieldCond("mobquickpsdeformid", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端快速表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter mobquickpsdeformname__eq(String value){
        this.setFieldCond("mobquickpsdeformname", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端快速表单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter mobquickpsdeformname__like(String value){
        this.setFieldCond("mobquickpsdeformname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[移动端功能表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter mobutilpsdeformid__eq(String value){
        this.setFieldCond("mobutilpsdeformid", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端功能表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter mobutilpsdeformname__eq(String value){
        this.setFieldCond("mobutilpsdeformname", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端功能表单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter mobutilpsdeformname__like(String value){
        this.setFieldCond("mobutilpsdeformname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[操作标识允许模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter opprivallowmode__eq(String value){
        this.setFieldCond("opprivallowmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据查询]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter psdedqid__eq(String value){
        this.setFieldCond("psdedqid", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据查询]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter psdedqname__eq(String value){
        this.setFieldCond("psdedqname", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据查询]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter psdedqname__like(String value){
        this.setFieldCond("psdedqname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[主状态表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter psdeformid__eq(String value){
        this.setFieldCond("psdeformid", EQ, value);
        return this;
    }

    /**
     * 设置属性[主状态表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter psdeformname__eq(String value){
        this.setFieldCond("psdeformname", EQ, value);
        return this;
    }

    /**
     * 设置属性[主状态表单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter psdeformname__like(String value){
        this.setFieldCond("psdeformname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[主状态名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter psdemainstatename__eq(String value){
        this.setFieldCond("psdemainstatename", EQ, value);
        return this;
    }

    /**
     * 设置属性[主状态名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter psdemainstatename__like(String value){
        this.setFieldCond("psdemainstatename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[主状态图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter pssysimageid__eq(String value){
        this.setFieldCond("pssysimageid", EQ, value);
        return this;
    }

    /**
     * 设置属性[主状态图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter pssysimagename__eq(String value){
        this.setFieldCond("pssysimagename", EQ, value);
        return this;
    }

    /**
     * 设置属性[主状态图标]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter pssysimagename__like(String value){
        this.setFieldCond("pssysimagename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[主状态快速表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter quickpsdeformid__eq(String value){
        this.setFieldCond("quickpsdeformid", EQ, value);
        return this;
    }

    /**
     * 设置属性[主状态快速表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter quickpsdeformname__eq(String value){
        this.setFieldCond("quickpsdeformname", EQ, value);
        return this;
    }

    /**
     * 设置属性[主状态快速表单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter quickpsdeformname__like(String value){
        this.setFieldCond("quickpsdeformname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter textpslanresid__eq(String value){
        this.setFieldCond("textpslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter textpslanresname__eq(String value){
        this.setFieldCond("textpslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter textpslanresname__like(String value){
        this.setFieldCond("textpslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter tippslanresid__eq(String value){
        this.setFieldCond("tippslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter tippslanresname__eq(String value){
        this.setFieldCond("tippslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter tippslanresname__like(String value){
        this.setFieldCond("tippslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter utilpsdeformid__eq(String value){
        this.setFieldCond("utilpsdeformid", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter utilpsdeformname__eq(String value){
        this.setFieldCond("utilpsdeformname", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能表单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMainStateFilter utilpsdeformname__like(String value){
        this.setFieldCond("utilpsdeformname", LIKE, value);
        return this;
    }

}
