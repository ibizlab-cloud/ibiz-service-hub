package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSPDTVIEW 过滤器对象
 */
public class PSSysPDTViewFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysPDTViewFilter(){
    
    }      

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter cappslanresid__eq(String value){
        this.setFieldCond("cappslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter cappslanresname__eq(String value){
        this.setFieldCond("cappslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter cappslanresname__like(String value){
        this.setFieldCond("cappslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体移动端视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter mobpsdeviewid__eq(String value){
        this.setFieldCond("mobpsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体移动端视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter mobpsdeviewname__eq(String value){
        this.setFieldCond("mobpsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体移动端视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter mobpsdeviewname__like(String value){
        this.setFieldCond("mobpsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter psdeviewbaseid__eq(String value){
        this.setFieldCond("psdeviewbaseid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter psdeviewbasename__eq(String value){
        this.setFieldCond("psdeviewbasename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter psdeviewbasename__like(String value){
        this.setFieldCond("psdeviewbasename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[云平台预置视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter pspdtviewid__eq(String value){
        this.setFieldCond("pspdtviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[云平台预置视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter pspdtviewname__eq(String value){
        this.setFieldCond("pspdtviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[云平台预置视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter pspdtviewname__like(String value){
        this.setFieldCond("pspdtviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[预置视图名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter pssyspdtviewname__like(String value){
        this.setFieldCond("pssyspdtviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPDTViewFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
