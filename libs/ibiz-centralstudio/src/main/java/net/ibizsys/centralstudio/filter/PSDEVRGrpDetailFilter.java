package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEVRGRPDETAIL 过滤器对象
 */
public class PSDEVRGrpDetailFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEVRGrpDetailFilter(){
    
    }      

    /**
     * 设置属性[属性值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEVRGrpDetailFilter psdefvalueruleid__eq(String value){
        this.setFieldCond("psdefvalueruleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[属性值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEVRGrpDetailFilter psdefvaluerulename__eq(String value){
        this.setFieldCond("psdefvaluerulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[属性值规则]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEVRGrpDetailFilter psdefvaluerulename__like(String value){
        this.setFieldCond("psdefvaluerulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[属性值规则组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEVRGrpDetailFilter psdevrgroupid__eq(String value){
        this.setFieldCond("psdevrgroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[属性值规则组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEVRGrpDetailFilter psdevrgroupname__eq(String value){
        this.setFieldCond("psdevrgroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[属性值规则组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEVRGrpDetailFilter psdevrgroupname__like(String value){
        this.setFieldCond("psdevrgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[成员名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEVRGrpDetailFilter psdevrgrpdetailname__like(String value){
        this.setFieldCond("psdevrgrpdetailname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEVRGrpDetailFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
