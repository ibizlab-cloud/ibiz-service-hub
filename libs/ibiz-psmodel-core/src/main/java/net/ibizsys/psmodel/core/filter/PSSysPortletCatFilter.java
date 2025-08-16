package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSPORTLETCAT 过滤器对象
 */
public class PSSysPortletCatFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysPortletCatFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletCatFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[名称语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletCatFilter namepslanresid__eq(String value){
        this.setFieldCond("namepslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[名称语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletCatFilter namepslanresname__eq(String value){
        this.setFieldCond("namepslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[名称语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletCatFilter namepslanresname__like(String value){
        this.setFieldCond("namepslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletCatFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletCatFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletCatFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[分类界面样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletCatFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletCatFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletCatFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[分类系统图片]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletCatFilter pssysimageid__eq(String value){
        this.setFieldCond("pssysimageid", EQ, value);
        return this;
    }

    /**
     * 设置属性[分类系统图片]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletCatFilter pssysimagename__eq(String value){
        this.setFieldCond("pssysimagename", EQ, value);
        return this;
    }

    /**
     * 设置属性[分类系统图片]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletCatFilter pssysimagename__like(String value){
        this.setFieldCond("pssysimagename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[分类名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletCatFilter pssysportletcatname__eq(String value){
        this.setFieldCond("pssysportletcatname", EQ, value);
        return this;
    }

    /**
     * 设置属性[分类名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletCatFilter pssysportletcatname__like(String value){
        this.setFieldCond("pssysportletcatname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletCatFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletCatFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletCatFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletCatFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletCatFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletCatFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletCatFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletCatFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
