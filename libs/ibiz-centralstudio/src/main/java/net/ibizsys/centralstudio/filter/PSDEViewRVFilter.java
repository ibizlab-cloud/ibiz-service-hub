package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEVIEWRV 过滤器对象
 */
public class PSDEViewRVFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEViewRVFilter(){
    
    }      

    /**
     * 设置属性[预置功能视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewRVFilter defviewtype__eq(String value){
        this.setFieldCond("defviewtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主实体视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewRVFilter majorpsdeviewid__eq(String value){
        this.setFieldCond("majorpsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主实体视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewRVFilter majorpsdeviewname__eq(String value){
        this.setFieldCond("majorpsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主实体视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewRVFilter majorpsdeviewname__like(String value){
        this.setFieldCond("majorpsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[关联实体视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewRVFilter minorpsdeviewid__eq(String value){
        this.setFieldCond("minorpsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewRVFilter minorpsdeviewname__eq(String value){
        this.setFieldCond("minorpsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewRVFilter minorpsdeviewname__like(String value){
        this.setFieldCond("minorpsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[打开方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewRVFilter openmode__eq(String value){
        this.setFieldCond("openmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关联视图模式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewRVFilter psdeviewrvname__like(String value){
        this.setFieldCond("psdeviewrvname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewRVFilter titlepslanresid__eq(String value){
        this.setFieldCond("titlepslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewRVFilter titlepslanresname__eq(String value){
        this.setFieldCond("titlepslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewRVFilter titlepslanresname__like(String value){
        this.setFieldCond("titlepslanresname", Conditions.LIKE, value);
        return this;
    }

}
