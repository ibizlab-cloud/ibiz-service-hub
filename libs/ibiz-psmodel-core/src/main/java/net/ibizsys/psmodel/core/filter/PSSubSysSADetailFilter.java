package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSUBSYSSADETAIL 过滤器对象
 */
public class PSSubSysSADetailFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSubSysSADetailFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter codename__like(String value){
        this.setFieldCond("codename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[方法类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter detailtype__eq(String value){
        this.setFieldCond("detailtype", EQ, value);
        return this;
    }

    /**
     * 设置属性[输入对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter inpssubsyssadeid__eq(String value){
        this.setFieldCond("inpssubsyssadeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[输入对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter inpssubsyssadename__eq(String value){
        this.setFieldCond("inpssubsyssadename", EQ, value);
        return this;
    }

    /**
     * 设置属性[输入对象]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter inpssubsyssadename__like(String value){
        this.setFieldCond("inpssubsyssadename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[输入对象模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter inpssysdynamodelid__eq(String value){
        this.setFieldCond("inpssysdynamodelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[输入对象模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter inpssysdynamodelname__eq(String value){
        this.setFieldCond("inpssysdynamodelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[输入对象模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter inpssysdynamodelname__like(String value){
        this.setFieldCond("inpssysdynamodelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[输出对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter outpssubsyssadeid__eq(String value){
        this.setFieldCond("outpssubsyssadeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[输出对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter outpssubsyssadename__eq(String value){
        this.setFieldCond("outpssubsyssadename", EQ, value);
        return this;
    }

    /**
     * 设置属性[输出对象]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter outpssubsyssadename__like(String value){
        this.setFieldCond("outpssubsyssadename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[输出对象模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter outpssysdynamodelid__eq(String value){
        this.setFieldCond("outpssysdynamodelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[输出对象模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter outpssysdynamodelname__eq(String value){
        this.setFieldCond("outpssysdynamodelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[输出对象模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter outpssysdynamodelname__like(String value){
        this.setFieldCond("outpssysdynamodelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体逻辑名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter psdelogicname__like(String value){
        this.setFieldCond("psdelogicname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[外部接口实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter pssubsyssadeid__eq(String value){
        this.setFieldCond("pssubsyssadeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[外部接口实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter pssubsyssadename__eq(String value){
        this.setFieldCond("pssubsyssadename", EQ, value);
        return this;
    }

    /**
     * 设置属性[外部接口实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter pssubsyssadename__like(String value){
        this.setFieldCond("pssubsyssadename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[方法名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter pssubsyssadetailname__eq(String value){
        this.setFieldCond("pssubsyssadetailname", EQ, value);
        return this;
    }

    /**
     * 设置属性[方法名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter pssubsyssadetailname__like(String value){
        this.setFieldCond("pssubsyssadetailname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[外部服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter pssubsysserviceapiid__eq(String value){
        this.setFieldCond("pssubsysserviceapiid", EQ, value);
        return this;
    }

    /**
     * 设置属性[外部服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter pssubsysserviceapiname__eq(String value){
        this.setFieldCond("pssubsysserviceapiname", EQ, value);
        return this;
    }

    /**
     * 设置属性[外部服务接口]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter pssubsysserviceapiname__like(String value){
        this.setFieldCond("pssubsysserviceapiname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter requestmethod__eq(String value){
        this.setFieldCond("requestmethod", EQ, value);
        return this;
    }

    /**
     * 设置属性[请求参数类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter requestparamtype__eq(String value){
        this.setFieldCond("requestparamtype", EQ, value);
        return this;
    }

    /**
     * 设置属性[结果对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter retpssubsyssadeid__eq(String value){
        this.setFieldCond("retpssubsyssadeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[结果对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter retpssubsyssadename__eq(String value){
        this.setFieldCond("retpssubsyssadename", EQ, value);
        return this;
    }

    /**
     * 设置属性[结果对象]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter retpssubsyssadename__like(String value){
        this.setFieldCond("retpssubsyssadename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[返回数据类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter retstddatatype__eq(Integer value){
        this.setFieldCond("retstddatatype", EQ, value);
        return this;
    }

    /**
     * 设置属性[返回值类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter retvaltype__eq(String value){
        this.setFieldCond("retvaltype", EQ, value);
        return this;
    }

    /**
     * 设置属性[服务路径]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter serviceurl__like(String value){
        this.setFieldCond("serviceurl", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
