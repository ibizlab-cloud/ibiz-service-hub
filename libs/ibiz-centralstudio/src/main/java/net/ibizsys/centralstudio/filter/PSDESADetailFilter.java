package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDESADETAIL 过滤器对象
 */
public class PSDESADetailFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDESADetailFilter(){
    
    }      

    /**
     * 设置属性[成员类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter detailtype__eq(String value){
        this.setFieldCond("detailtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter inpsdeserviceapiid__eq(String value){
        this.setFieldCond("inpsdeserviceapiid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter inpsdeserviceapiname__eq(String value){
        this.setFieldCond("inpsdeserviceapiname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入对象]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter inpsdeserviceapiname__like(String value){
        this.setFieldCond("inpsdeserviceapiname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[输出对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter outpsdeserviceapiid__eq(String value){
        this.setFieldCond("outpsdeserviceapiid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输出对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter outpsdeserviceapiname__eq(String value){
        this.setFieldCond("outpsdeserviceapiname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输出对象]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter outpsdeserviceapiname__like(String value){
        this.setFieldCond("outpsdeserviceapiname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[父值处理模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter parentkeymode__eq(String value){
        this.setFieldCond("parentkeymode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter psdeactionid__eq(String value){
        this.setFieldCond("psdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter psdeactionname__eq(String value){
        this.setFieldCond("psdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter psdeactionname__like(String value){
        this.setFieldCond("psdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据查询]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter psdedqid__eq(String value){
        this.setFieldCond("psdedqid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据查询]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter psdedqname__eq(String value){
        this.setFieldCond("psdedqname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据查询]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter psdedqname__like(String value){
        this.setFieldCond("psdedqname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter psdedsid__eq(String value){
        this.setFieldCond("psdedsid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter psdedsname__eq(String value){
        this.setFieldCond("psdedsname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集合]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter psdedsname__like(String value){
        this.setFieldCond("psdedsname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体操作标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter psdeopprivid__eq(String value){
        this.setFieldCond("psdeopprivid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体操作标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter psdeopprivname__eq(String value){
        this.setFieldCond("psdeopprivname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体操作标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter psdeopprivname__like(String value){
        this.setFieldCond("psdeopprivname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[成员名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter psdesadetailname__like(String value){
        this.setFieldCond("psdesadetailname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[接口关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter psdesarsid__eq(String value){
        this.setFieldCond("psdesarsid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[接口关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter psdesarsname__eq(String value){
        this.setFieldCond("psdesarsname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[接口关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter psdesarsname__like(String value){
        this.setFieldCond("psdesarsname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter psdeserviceapiid__eq(String value){
        this.setFieldCond("psdeserviceapiid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体服务接口名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter psdeserviceapiname__eq(String value){
        this.setFieldCond("psdeserviceapiname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体服务接口名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter psdeserviceapiname__like(String value){
        this.setFieldCond("psdeserviceapiname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[PSSYSSERVICEAPIID]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter pssysserviceapiid__eq(String value){
        this.setFieldCond("pssysserviceapiid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter requestmethod__eq(String value){
        this.setFieldCond("requestmethod", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[请求参数类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter requestparamtype__eq(String value){
        this.setFieldCond("requestparamtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[返回值类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter retvaltype__eq(String value){
        this.setFieldCond("retvaltype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
