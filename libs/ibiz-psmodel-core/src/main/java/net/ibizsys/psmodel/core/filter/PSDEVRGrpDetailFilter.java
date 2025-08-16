package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEVRGRPDETAIL 过滤器对象
 */
public class PSDEVRGrpDetailFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSDEVRGrpDetailFilter(){
    
    }      

    /**
     * 设置属性[属性值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEVRGrpDetailFilter psdefvalueruleid__eq(String value){
        this.setFieldCond("psdefvalueruleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[属性值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEVRGrpDetailFilter psdefvaluerulename__eq(String value){
        this.setFieldCond("psdefvaluerulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[属性值规则]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEVRGrpDetailFilter psdefvaluerulename__like(String value){
        this.setFieldCond("psdefvaluerulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[属性值规则组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEVRGrpDetailFilter psdevrgroupid__eq(String value){
        this.setFieldCond("psdevrgroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[属性值规则组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEVRGrpDetailFilter psdevrgroupname__eq(String value){
        this.setFieldCond("psdevrgroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[属性值规则组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEVRGrpDetailFilter psdevrgroupname__like(String value){
        this.setFieldCond("psdevrgroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[成员名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEVRGrpDetailFilter psdevrgrpdetailname__eq(String value){
        this.setFieldCond("psdevrgrpdetailname", EQ, value);
        return this;
    }

    /**
     * 设置属性[成员名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEVRGrpDetailFilter psdevrgrpdetailname__like(String value){
        this.setFieldCond("psdevrgrpdetailname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEVRGrpDetailFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEVRGrpDetailFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标识2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEVRGrpDetailFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEVRGrpDetailFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEVRGrpDetailFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
