package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSTESTDATA 过滤器对象
 */
public class PSSysTestDataFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysTestDataFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestDataFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展测试数据]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestDataFilter mainpssystdid__eq(String value){
        this.setFieldCond("mainpssystdid", EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展测试数据]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestDataFilter mainpssystdname__eq(String value){
        this.setFieldCond("mainpssystdname", EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展测试数据]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestDataFilter mainpssystdname__like(String value){
        this.setFieldCond("mainpssystdname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestDataFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体主状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestDataFilter psdemainstateid__eq(String value){
        this.setFieldCond("psdemainstateid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体主状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestDataFilter psdemainstatename__eq(String value){
        this.setFieldCond("psdemainstatename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体主状态]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestDataFilter psdemainstatename__like(String value){
        this.setFieldCond("psdemainstatename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestDataFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestDataFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体示例数据]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestDataFilter psdesampledataid__eq(String value){
        this.setFieldCond("psdesampledataid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体示例数据]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestDataFilter psdesampledataname__eq(String value){
        this.setFieldCond("psdesampledataname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体示例数据]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestDataFilter psdesampledataname__like(String value){
        this.setFieldCond("psdesampledataname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestDataFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestDataFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestDataFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestDataFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestDataFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestDataFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestDataFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestDataFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestDataFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[测试数据名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestDataFilter pssystestdataname__eq(String value){
        this.setFieldCond("pssystestdataname", EQ, value);
        return this;
    }

    /**
     * 设置属性[测试数据名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestDataFilter pssystestdataname__like(String value){
        this.setFieldCond("pssystestdataname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[测试数据类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestDataFilter testdatatype__eq(String value){
        this.setFieldCond("testdatatype", EQ, value);
        return this;
    }

    /**
     * 设置属性[使用方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestDataFilter usage__eq(String value){
        this.setFieldCond("usage", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestDataFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户自建]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestDataFilter userflag__eq(Integer value){
        this.setFieldCond("userflag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestDataFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestDataFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestDataFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestDataFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

    /**
     * 设置属性[启用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestDataFilter validflag__eq(Integer value){
        this.setFieldCond("validflag", EQ, value);
        return this;
    }

}
