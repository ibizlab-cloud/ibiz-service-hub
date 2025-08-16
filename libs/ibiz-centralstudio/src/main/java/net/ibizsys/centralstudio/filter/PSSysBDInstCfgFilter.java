package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSBDINSTCFG 过滤器对象
 */
public class PSSysBDInstCfgFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysBDInstCfgFilter(){
    
    }      

    /**
     * 设置属性[大数据实例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDInstCfgFilter psdcbdinstid__eq(String value){
        this.setFieldCond("psdcbdinstid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据实例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDInstCfgFilter psdcbdinstname__eq(String value){
        this.setFieldCond("psdcbdinstname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据实例]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDInstCfgFilter psdcbdinstname__like(String value){
        this.setFieldCond("psdcbdinstname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实例类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDInstCfgFilter pssysbdinstcfgname__eq(String value){
        this.setFieldCond("pssysbdinstcfgname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实例类型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDInstCfgFilter pssysbdinstcfgname__like(String value){
        this.setFieldCond("pssysbdinstcfgname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDInstCfgFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDInstCfgFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDInstCfgFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDInstCfgFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
