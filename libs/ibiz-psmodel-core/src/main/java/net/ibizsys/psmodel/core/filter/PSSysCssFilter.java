package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSCSS 过滤器对象
 */
public class PSSysCssFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysCssFilter(){
    
    }      

    /**
     * 设置属性[边框样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCssFilter borderstyle__eq(String value){
        this.setFieldCond("borderstyle", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCssFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[水平对齐]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCssFilter halign__eq(String value){
        this.setFieldCond("halign", EQ, value);
        return this;
    }

    /**
     * 设置属性[预置界面样式表模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCssFilter pscsstemplid__eq(String value){
        this.setFieldCond("pscsstemplid", EQ, value);
        return this;
    }

    /**
     * 设置属性[预置界面样式表模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCssFilter pscsstemplname__eq(String value){
        this.setFieldCond("pscsstemplname", EQ, value);
        return this;
    }

    /**
     * 设置属性[预置界面样式表模板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCssFilter pscsstemplname__like(String value){
        this.setFieldCond("pscsstemplname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCssFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCssFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCssFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[样式表分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCssFilter pssyscsscatid__eq(String value){
        this.setFieldCond("pssyscsscatid", EQ, value);
        return this;
    }

    /**
     * 设置属性[样式表分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCssFilter pssyscsscatname__eq(String value){
        this.setFieldCond("pssyscsscatname", EQ, value);
        return this;
    }

    /**
     * 设置属性[样式表分类]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCssFilter pssyscsscatname__like(String value){
        this.setFieldCond("pssyscsscatname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[样式表名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCssFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", EQ, value);
        return this;
    }

    /**
     * 设置属性[样式表名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCssFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCssFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCssFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCssFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCssFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCssFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCssFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCssFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCssFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

    /**
     * 设置属性[垂直对齐]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCssFilter valign__eq(String value){
        this.setFieldCond("valign", EQ, value);
        return this;
    }

}
