package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSBDINSTCFG 过滤器对象
 */
public class PSSysBDInstCfgFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysBDInstCfgFilter(){
    
    }      

    /**
     * 设置属性[大数据实例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDInstCfgFilter psdcbdinstid__eq(String value){
        this.setFieldCond("psdcbdinstid", EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据实例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDInstCfgFilter psdcbdinstname__eq(String value){
        this.setFieldCond("psdcbdinstname", EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据实例]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDInstCfgFilter psdcbdinstname__like(String value){
        this.setFieldCond("psdcbdinstname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实例类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDInstCfgFilter pssysbdinstcfgname__eq(String value){
        this.setFieldCond("pssysbdinstcfgname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实例类型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDInstCfgFilter pssysbdinstcfgname__like(String value){
        this.setFieldCond("pssysbdinstcfgname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDInstCfgFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDInstCfgFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDInstCfgFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDInstCfgFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDInstCfgFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDInstCfgFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDInstCfgFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDInstCfgFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
