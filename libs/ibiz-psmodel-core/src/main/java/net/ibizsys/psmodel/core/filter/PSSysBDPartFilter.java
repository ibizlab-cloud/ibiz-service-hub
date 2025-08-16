package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSBDPART 过滤器对象
 */
public class PSSysBDPartFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysBDPartFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDPartFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据分区名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDPartFilter pssysbdpartname__eq(String value){
        this.setFieldCond("pssysbdpartname", EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据分区名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDPartFilter pssysbdpartname__like(String value){
        this.setFieldCond("pssysbdpartname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[大数据体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDPartFilter pssysbdschemeid__eq(String value){
        this.setFieldCond("pssysbdschemeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDPartFilter pssysbdschemename__eq(String value){
        this.setFieldCond("pssysbdschemename", EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDPartFilter pssysbdschemename__like(String value){
        this.setFieldCond("pssysbdschemename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDPartFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDPartFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDPartFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDPartFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDPartFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
