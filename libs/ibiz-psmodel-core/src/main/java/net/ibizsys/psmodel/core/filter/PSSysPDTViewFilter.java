package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSPDTVIEW 过滤器对象
 */
public class PSSysPDTViewFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysPDTViewFilter(){
    
    }      

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter cappslanresid__eq(String value){
        this.setFieldCond("cappslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter cappslanresname__eq(String value){
        this.setFieldCond("cappslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter cappslanresname__like(String value){
        this.setFieldCond("cappslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体移动端视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter mobpsdeviewid__eq(String value){
        this.setFieldCond("mobpsdeviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体移动端视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter mobpsdeviewname__eq(String value){
        this.setFieldCond("mobpsdeviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体移动端视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter mobpsdeviewname__like(String value){
        this.setFieldCond("mobpsdeviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter psdeviewbaseid__eq(String value){
        this.setFieldCond("psdeviewbaseid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter psdeviewbasename__eq(String value){
        this.setFieldCond("psdeviewbasename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter psdeviewbasename__like(String value){
        this.setFieldCond("psdeviewbasename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[云平台预置视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter pspdtviewid__eq(String value){
        this.setFieldCond("pspdtviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[云平台预置视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter pspdtviewname__eq(String value){
        this.setFieldCond("pspdtviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[云平台预置视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter pspdtviewname__like(String value){
        this.setFieldCond("pspdtviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[预置视图名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter pssyspdtviewname__eq(String value){
        this.setFieldCond("pssyspdtviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[预置视图名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter pssyspdtviewname__like(String value){
        this.setFieldCond("pssyspdtviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
