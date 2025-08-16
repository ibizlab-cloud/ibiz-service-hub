package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSCSS 过滤器对象
 */
public class PSSysCssFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysCssFilter(){
    
    }      

    /**
     * 设置属性[边框样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCssFilter borderstyle__eq(String value){
        this.setFieldCond("borderstyle", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[水平对齐]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCssFilter halign__eq(String value){
        this.setFieldCond("halign", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[预置界面样式表模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCssFilter pscsstemplid__eq(String value){
        this.setFieldCond("pscsstemplid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[预置界面样式表模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCssFilter pscsstemplname__eq(String value){
        this.setFieldCond("pscsstemplname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[预置界面样式表模板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCssFilter pscsstemplname__like(String value){
        this.setFieldCond("pscsstemplname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCssFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCssFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCssFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[样式表分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCssFilter pssyscsscatid__eq(String value){
        this.setFieldCond("pssyscsscatid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[样式表分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCssFilter pssyscsscatname__eq(String value){
        this.setFieldCond("pssyscsscatname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[样式表分类]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCssFilter pssyscsscatname__like(String value){
        this.setFieldCond("pssyscsscatname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[样式表名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCssFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCssFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCssFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCssFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCssFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[垂直对齐]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCssFilter valign__eq(String value){
        this.setFieldCond("valign", Conditions.EQ, value);
        return this;
    }

}
