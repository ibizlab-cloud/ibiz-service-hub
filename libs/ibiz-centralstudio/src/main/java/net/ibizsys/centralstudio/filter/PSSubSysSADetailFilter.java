package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSUBSYSSADETAIL 过滤器对象
 */
public class PSSubSysSADetailFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSubSysSADetailFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter codename__like(String value){
        this.setFieldCond("codename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[方法类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter detailtype__eq(String value){
        this.setFieldCond("detailtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter inpssubsyssadeid__eq(String value){
        this.setFieldCond("inpssubsyssadeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter inpssubsyssadename__eq(String value){
        this.setFieldCond("inpssubsyssadename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入对象]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter inpssubsyssadename__like(String value){
        this.setFieldCond("inpssubsyssadename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[输入对象模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter inpssysdynamodelid__eq(String value){
        this.setFieldCond("inpssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入对象模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter inpssysdynamodelname__eq(String value){
        this.setFieldCond("inpssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入对象模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter inpssysdynamodelname__like(String value){
        this.setFieldCond("inpssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[输出对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter outpssubsyssadeid__eq(String value){
        this.setFieldCond("outpssubsyssadeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输出对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter outpssubsyssadename__eq(String value){
        this.setFieldCond("outpssubsyssadename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输出对象]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter outpssubsyssadename__like(String value){
        this.setFieldCond("outpssubsyssadename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[输出对象模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter outpssysdynamodelid__eq(String value){
        this.setFieldCond("outpssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输出对象模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter outpssysdynamodelname__eq(String value){
        this.setFieldCond("outpssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输出对象模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter outpssysdynamodelname__like(String value){
        this.setFieldCond("outpssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体逻辑名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter psdelogicname__like(String value){
        this.setFieldCond("psdelogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[外部接口实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter pssubsyssadeid__eq(String value){
        this.setFieldCond("pssubsyssadeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[外部接口实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter pssubsyssadename__eq(String value){
        this.setFieldCond("pssubsyssadename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[外部接口实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter pssubsyssadename__like(String value){
        this.setFieldCond("pssubsyssadename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[方法名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter pssubsyssadetailname__like(String value){
        this.setFieldCond("pssubsyssadetailname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[外部服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter pssubsysserviceapiid__eq(String value){
        this.setFieldCond("pssubsysserviceapiid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[外部服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter pssubsysserviceapiname__eq(String value){
        this.setFieldCond("pssubsysserviceapiname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[外部服务接口]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter pssubsysserviceapiname__like(String value){
        this.setFieldCond("pssubsysserviceapiname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter requestmethod__eq(String value){
        this.setFieldCond("requestmethod", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[请求参数类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter requestparamtype__eq(String value){
        this.setFieldCond("requestparamtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[结果对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter retpssubsyssadeid__eq(String value){
        this.setFieldCond("retpssubsyssadeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[结果对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter retpssubsyssadename__eq(String value){
        this.setFieldCond("retpssubsyssadename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[结果对象]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter retpssubsyssadename__like(String value){
        this.setFieldCond("retpssubsyssadename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[返回数据类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter retstddatatype__eq(Integer value){
        this.setFieldCond("retstddatatype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[返回值类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter retvaltype__eq(String value){
        this.setFieldCond("retvaltype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[服务路径]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter serviceurl__like(String value){
        this.setFieldCond("serviceurl", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
