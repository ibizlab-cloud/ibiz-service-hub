package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSSFPUB 过滤器对象
 */
public class PSSysSFPubFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysSFPubFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[发布内容类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter contenttype__eq(String value){
        this.setFieldCond("contenttype", EQ, value);
        return this;
    }

    /**
     * 设置属性[文档模板样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter docpssfstyleid__eq(String value){
        this.setFieldCond("docpssfstyleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[文档模板样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter docpssfstylename__eq(String value){
        this.setFieldCond("docpssfstylename", EQ, value);
        return this;
    }

    /**
     * 设置属性[文档模板样式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter docpssfstylename__like(String value){
        this.setFieldCond("docpssfstylename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态模型使用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter dynamodelmode__eq(String value){
        this.setFieldCond("dynamodelmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[后台体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter ppssyssfpubid__eq(String value){
        this.setFieldCond("ppssyssfpubid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后台体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter ppssyssfpubname__eq(String value){
        this.setFieldCond("ppssyssfpubname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后台体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter ppssyssfpubname__like(String value){
        this.setFieldCond("ppssyssfpubname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[服务框架]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter pssfstyleid__eq(String value){
        this.setFieldCond("pssfstyleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[服务框架]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter pssfstylename__eq(String value){
        this.setFieldCond("pssfstylename", EQ, value);
        return this;
    }

    /**
     * 设置属性[服务框架]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter pssfstylename__like(String value){
        this.setFieldCond("pssfstylename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[服务框架参数]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter pssfstyleparamid__eq(String value){
        this.setFieldCond("pssfstyleparamid", EQ, value);
        return this;
    }

    /**
     * 设置属性[服务框架参数]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter pssfstyleparamname__eq(String value){
        this.setFieldCond("pssfstyleparamname", EQ, value);
        return this;
    }

    /**
     * 设置属性[服务框架参数]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter pssfstyleparamname__like(String value){
        this.setFieldCond("pssfstyleparamname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[服务框架扩展]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter pssfstyleverid__eq(String value){
        this.setFieldCond("pssfstyleverid", EQ, value);
        return this;
    }

    /**
     * 设置属性[服务框架扩展]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter pssfstylevername__eq(String value){
        this.setFieldCond("pssfstylevername", EQ, value);
        return this;
    }

    /**
     * 设置属性[服务框架扩展]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter pssfstylevername__like(String value){
        this.setFieldCond("pssfstylevername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台体系名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter pssyssfpubname__eq(String value){
        this.setFieldCond("pssyssfpubname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后台体系名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter pssyssfpubname__like(String value){
        this.setFieldCond("pssyssfpubname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[删除标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter removeflag__eq(Integer value){
        this.setFieldCond("removeflag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
