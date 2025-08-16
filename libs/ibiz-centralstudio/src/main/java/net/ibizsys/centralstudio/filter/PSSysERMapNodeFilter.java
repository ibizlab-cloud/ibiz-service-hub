package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSERMAPNODE 过滤器对象
 */
public class PSSysERMapNodeFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysERMapNodeFilter(){
    
    }      

    /**
     * 设置属性[应用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter psappdataentityid__eq(String value){
        this.setFieldCond("psappdataentityid", Conditions.EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("psapplocaldeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter psappdataentityname__eq(String value){
        this.setFieldCond("psappdataentityname", Conditions.EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("psapplocaldename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter psappdataentityname__like(String value){
        this.setFieldCond("psappdataentityname", Conditions.LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("psapplocaldename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter psdeserviceapiid__eq(String value){
        this.setFieldCond("psdeserviceapiid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter psdeserviceapiname__eq(String value){
        this.setFieldCond("psdeserviceapiname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体服务接口]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter psdeserviceapiname__like(String value){
        this.setFieldCond("psdeserviceapiname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[外部系统接口实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter pssubsyssadeid__eq(String value){
        this.setFieldCond("pssubsyssadeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[外部系统接口实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter pssubsyssadename__eq(String value){
        this.setFieldCond("pssubsyssadename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[外部系统接口实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter pssubsyssadename__like(String value){
        this.setFieldCond("pssubsyssadename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[外部系统接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter pssubsysserviceapiid__eq(String value){
        this.setFieldCond("pssubsysserviceapiid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[外部系统接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter pssubsysserviceapiname__eq(String value){
        this.setFieldCond("pssubsysserviceapiname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[外部系统接口]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter pssubsysserviceapiname__like(String value){
        this.setFieldCond("pssubsysserviceapiname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[大数据库]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter pssysbdschemeid__eq(String value){
        this.setFieldCond("pssysbdschemeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据库]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter pssysbdschemename__eq(String value){
        this.setFieldCond("pssysbdschemename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据库]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter pssysbdschemename__like(String value){
        this.setFieldCond("pssysbdschemename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[大数据库表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter pssysbdtableid__eq(String value){
        this.setFieldCond("pssysbdtableid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据库表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter pssysbdtablename__eq(String value){
        this.setFieldCond("pssysbdtablename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据库表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter pssysbdtablename__like(String value){
        this.setFieldCond("pssysbdtablename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[关系数据库]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter pssysdbschemeid__eq(String value){
        this.setFieldCond("pssysdbschemeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关系数据库]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter pssysdbschemename__eq(String value){
        this.setFieldCond("pssysdbschemename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关系数据库]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter pssysdbschemename__like(String value){
        this.setFieldCond("pssysdbschemename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[关系数据库表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter pssysdbtableid__eq(String value){
        this.setFieldCond("pssysdbtableid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关系数据库表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter pssysdbtablename__eq(String value){
        this.setFieldCond("pssysdbtablename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关系数据库表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter pssysdbtablename__like(String value){
        this.setFieldCond("pssysdbtablename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[ER图例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter pssysermapid__eq(String value){
        this.setFieldCond("pssysermapid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[ER图例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter pssysermapname__eq(String value){
        this.setFieldCond("pssysermapname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[ER图例]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter pssysermapname__like(String value){
        this.setFieldCond("pssysermapname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统ER图节点名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter pssysermapnodename__like(String value){
        this.setFieldCond("pssysermapnodename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[全文检索文档]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter pssyssearchdocid__eq(String value){
        this.setFieldCond("pssyssearchdocid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[全文检索文档]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter pssyssearchdocname__eq(String value){
        this.setFieldCond("pssyssearchdocname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[全文检索文档]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter pssyssearchdocname__like(String value){
        this.setFieldCond("pssyssearchdocname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[全文检索]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter pssyssearchschemeid__eq(String value){
        this.setFieldCond("pssyssearchschemeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[全文检索]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter pssyssearchschemename__eq(String value){
        this.setFieldCond("pssyssearchschemename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[全文检索]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter pssyssearchschemename__like(String value){
        this.setFieldCond("pssyssearchschemename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter pssysserviceapiid__eq(String value){
        this.setFieldCond("pssysserviceapiid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter pssysserviceapiname__eq(String value){
        this.setFieldCond("pssysserviceapiname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统服务接口]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter pssysserviceapiname__like(String value){
        this.setFieldCond("pssysserviceapiname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysERMapNodeFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
