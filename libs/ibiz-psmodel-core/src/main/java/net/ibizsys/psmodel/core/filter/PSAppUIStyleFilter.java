package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPUISTYLE 过滤器对象
 */
public class PSAppUIStyleFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSAppUIStyleFilter(){
    
    }      

    /**
     * 设置属性[主菜单方向]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUIStyleFilter mainmenuside__eq(String value){
        this.setFieldCond("mainmenuside", EQ, value);
        return this;
    }

    /**
     * 设置属性[模式名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUIStyleFilter psappuistylename__eq(String value){
        this.setFieldCond("psappuistylename", EQ, value);
        return this;
    }

    /**
     * 设置属性[模式名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUIStyleFilter psappuistylename__like(String value){
        this.setFieldCond("psappuistylename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUIStyleFilter pspfid__eq(String value){
        this.setFieldCond("pspfid", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUIStyleFilter pspfname__eq(String value){
        this.setFieldCond("pspfname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端模板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUIStyleFilter pspfname__like(String value){
        this.setFieldCond("pspfname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUIStyleFilter pspfstyleid__eq(String value){
        this.setFieldCond("pspfstyleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUIStyleFilter pspfstylename__eq(String value){
        this.setFieldCond("pspfstylename", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用样式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUIStyleFilter pspfstylename__like(String value){
        this.setFieldCond("pspfstylename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUIStyleFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUIStyleFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUIStyleFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[根应用视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUIStyleFilter rootpsappviewid__eq(String value){
        this.setFieldCond("rootpsappviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[根应用视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUIStyleFilter rootpsappviewname__eq(String value){
        this.setFieldCond("rootpsappviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[根应用视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUIStyleFilter rootpsappviewname__like(String value){
        this.setFieldCond("rootpsappviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUIStyleFilter uistyle__eq(String value){
        this.setFieldCond("uistyle", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUIStyleFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUIStyleFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUIStyleFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUIStyleFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUIStyleFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
