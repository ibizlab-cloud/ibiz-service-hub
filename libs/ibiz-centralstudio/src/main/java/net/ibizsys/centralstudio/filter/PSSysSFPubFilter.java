package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSSFPUB 过滤器对象
 */
public class PSSysSFPubFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysSFPubFilter(){
    
    }      

    /**
     * 设置属性[发布内容类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter contenttype__eq(String value){
        this.setFieldCond("contenttype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[文档模板样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter docpssfstyleid__eq(String value){
        this.setFieldCond("docpssfstyleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[文档模板样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter docpssfstylename__eq(String value){
        this.setFieldCond("docpssfstylename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[文档模板样式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter docpssfstylename__like(String value){
        this.setFieldCond("docpssfstylename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态模型使用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter dynamodelmode__eq(String value){
        this.setFieldCond("dynamodelmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter ppssyssfpubid__eq(String value){
        this.setFieldCond("ppssyssfpubid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter ppssyssfpubname__eq(String value){
        this.setFieldCond("ppssyssfpubname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter ppssyssfpubname__like(String value){
        this.setFieldCond("ppssyssfpubname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[服务框架]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter pssfstyleid__eq(String value){
        this.setFieldCond("pssfstyleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[服务框架]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter pssfstylename__eq(String value){
        this.setFieldCond("pssfstylename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[服务框架]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter pssfstylename__like(String value){
        this.setFieldCond("pssfstylename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[服务框架参数]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter pssfstyleparamid__eq(String value){
        this.setFieldCond("pssfstyleparamid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[服务框架参数]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter pssfstyleparamname__eq(String value){
        this.setFieldCond("pssfstyleparamname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[服务框架参数]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter pssfstyleparamname__like(String value){
        this.setFieldCond("pssfstyleparamname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[服务框架扩展]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter pssfstyleverid__eq(String value){
        this.setFieldCond("pssfstyleverid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[服务框架扩展]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter pssfstylevername__eq(String value){
        this.setFieldCond("pssfstylevername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[服务框架扩展]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter pssfstylevername__like(String value){
        this.setFieldCond("pssfstylevername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台体系名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter pssyssfpubname__like(String value){
        this.setFieldCond("pssyssfpubname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[删除标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter removeflag__eq(Integer value){
        this.setFieldCond("removeflag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
