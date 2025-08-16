package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSCOREPRDINSTLOG 过滤器对象
 */
public class PSCorePrdInstLogFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSCorePrdInstLogFilter(){
    
    }      

    /**
     * 设置属性[安装状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCorePrdInstLogFilter inststate__eq(Integer value){
        this.setFieldCond("inststate", EQ, value);
        return this;
    }

    /**
     * 设置属性[核心产品]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCorePrdInstLogFilter pscoreprdid__eq(String value){
        this.setFieldCond("pscoreprdid", EQ, value);
        return this;
    }

    /**
     * 设置属性[核心产品安装日志名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCorePrdInstLogFilter pscoreprdinstlogname__like(String value){
        this.setFieldCond("pscoreprdinstlogname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[核心产品]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCorePrdInstLogFilter pscoreprdname__eq(String value){
        this.setFieldCond("pscoreprdname", EQ, value);
        return this;
    }

    /**
     * 设置属性[核心产品]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCorePrdInstLogFilter pscoreprdname__like(String value){
        this.setFieldCond("pscoreprdname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[产品版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCorePrdInstLogFilter pscoreprdverid__eq(String value){
        this.setFieldCond("pscoreprdverid", EQ, value);
        return this;
    }

    /**
     * 设置属性[产品版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCorePrdInstLogFilter pscoreprdvername__eq(String value){
        this.setFieldCond("pscoreprdvername", EQ, value);
        return this;
    }

    /**
     * 设置属性[产品版本]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCorePrdInstLogFilter pscoreprdvername__like(String value){
        this.setFieldCond("pscoreprdvername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[配置服务器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCorePrdInstLogFilter psstudioserverid__eq(String value){
        this.setFieldCond("psstudioserverid", EQ, value);
        return this;
    }

    /**
     * 设置属性[配置服务器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCorePrdInstLogFilter psstudioservername__eq(String value){
        this.setFieldCond("psstudioservername", EQ, value);
        return this;
    }

    /**
     * 设置属性[配置服务器]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCorePrdInstLogFilter psstudioservername__like(String value){
        this.setFieldCond("psstudioservername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[任务服务器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCorePrdInstLogFilter pstaskserverid__eq(String value){
        this.setFieldCond("pstaskserverid", EQ, value);
        return this;
    }

    /**
     * 设置属性[任务服务器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCorePrdInstLogFilter pstaskservername__eq(String value){
        this.setFieldCond("pstaskservername", EQ, value);
        return this;
    }

    /**
     * 设置属性[任务服务器]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCorePrdInstLogFilter pstaskservername__like(String value){
        this.setFieldCond("pstaskservername", LIKE, value);
        return this;
    }

}
