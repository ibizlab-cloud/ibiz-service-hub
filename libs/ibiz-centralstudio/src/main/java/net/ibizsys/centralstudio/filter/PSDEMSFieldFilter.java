package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEMSFIELD 过滤器对象
 */
public class PSDEMSFieldFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEMSFieldFilter(){
    
    }      

    /**
     * 设置属性[默认值类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMSFieldFilter defaultvaluetype__eq(String value){
        this.setFieldCond("defaultvaluetype", Conditions.EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("dvt", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMSFieldFilter psdefid__eq(String value){
        this.setFieldCond("psdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMSFieldFilter psdefname__eq(String value){
        this.setFieldCond("psdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMSFieldFilter psdefname__like(String value){
        this.setFieldCond("psdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[主状态属性名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMSFieldFilter psdemsfieldname__eq(String value){
        this.setFieldCond("psdemsfieldname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主状态属性名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMSFieldFilter psdemsfieldname__like(String value){
        this.setFieldCond("psdemsfieldname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体主状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMSFieldFilter psdemsid__eq(String value){
        this.setFieldCond("psdemsid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体主状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMSFieldFilter psdemsname__eq(String value){
        this.setFieldCond("psdemsname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体主状态]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMSFieldFilter psdemsname__like(String value){
        this.setFieldCond("psdemsname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMSFieldFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMSFieldFilter usertag__eq(String value){
        this.setFieldCond("usertag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMSFieldFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMSFieldFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMSFieldFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", Conditions.EQ, value);
        return this;
    }

}
