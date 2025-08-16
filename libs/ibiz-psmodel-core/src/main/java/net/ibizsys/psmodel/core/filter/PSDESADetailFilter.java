package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDESADETAIL 过滤器对象
 */
public class PSDESADetailFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSDESADetailFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[成员类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter detailtype__eq(String value){
        this.setFieldCond("detailtype", EQ, value);
        return this;
    }

    /**
     * 设置属性[输入对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter inpsdeserviceapiid__eq(String value){
        this.setFieldCond("inpsdeserviceapiid", EQ, value);
        return this;
    }

    /**
     * 设置属性[输入对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter inpsdeserviceapiname__eq(String value){
        this.setFieldCond("inpsdeserviceapiname", EQ, value);
        return this;
    }

    /**
     * 设置属性[输入对象]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter inpsdeserviceapiname__like(String value){
        this.setFieldCond("inpsdeserviceapiname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[输出对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter outpsdeserviceapiid__eq(String value){
        this.setFieldCond("outpsdeserviceapiid", EQ, value);
        return this;
    }

    /**
     * 设置属性[输出对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter outpsdeserviceapiname__eq(String value){
        this.setFieldCond("outpsdeserviceapiname", EQ, value);
        return this;
    }

    /**
     * 设置属性[输出对象]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter outpsdeserviceapiname__like(String value){
        this.setFieldCond("outpsdeserviceapiname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[父值处理模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter parentkeymode__eq(String value){
        this.setFieldCond("parentkeymode", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter psdeactionid__eq(String value){
        this.setFieldCond("psdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter psdeactionname__eq(String value){
        this.setFieldCond("psdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter psdeactionname__like(String value){
        this.setFieldCond("psdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据查询]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter psdedqid__eq(String value){
        this.setFieldCond("psdedqid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据查询]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter psdedqname__eq(String value){
        this.setFieldCond("psdedqname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据查询]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter psdedqname__like(String value){
        this.setFieldCond("psdedqname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter psdedsid__eq(String value){
        this.setFieldCond("psdedsid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter psdedsname__eq(String value){
        this.setFieldCond("psdedsname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集合]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter psdedsname__like(String value){
        this.setFieldCond("psdedsname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体操作标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter psdeopprivid__eq(String value){
        this.setFieldCond("psdeopprivid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体操作标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter psdeopprivname__eq(String value){
        this.setFieldCond("psdeopprivname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体操作标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter psdeopprivname__like(String value){
        this.setFieldCond("psdeopprivname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[成员名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter psdesadetailname__eq(String value){
        this.setFieldCond("psdesadetailname", EQ, value);
        return this;
    }

    /**
     * 设置属性[成员名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter psdesadetailname__like(String value){
        this.setFieldCond("psdesadetailname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[接口关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter psdesarsid__eq(String value){
        this.setFieldCond("psdesarsid", EQ, value);
        return this;
    }

    /**
     * 设置属性[接口关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter psdesarsname__eq(String value){
        this.setFieldCond("psdesarsname", EQ, value);
        return this;
    }

    /**
     * 设置属性[接口关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter psdesarsname__like(String value){
        this.setFieldCond("psdesarsname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter psdeserviceapiid__eq(String value){
        this.setFieldCond("psdeserviceapiid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体服务接口名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter psdeserviceapiname__eq(String value){
        this.setFieldCond("psdeserviceapiname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体服务接口名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter psdeserviceapiname__like(String value){
        this.setFieldCond("psdeserviceapiname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[PSSYSSERVICEAPIID]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter pssysserviceapiid__eq(String value){
        this.setFieldCond("pssysserviceapiid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter requestmethod__eq(String value){
        this.setFieldCond("requestmethod", EQ, value);
        return this;
    }

    /**
     * 设置属性[请求参数类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter requestparamtype__eq(String value){
        this.setFieldCond("requestparamtype", EQ, value);
        return this;
    }

    /**
     * 设置属性[返回值类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter retvaltype__eq(String value){
        this.setFieldCond("retvaltype", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
