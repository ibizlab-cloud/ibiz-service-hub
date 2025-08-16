package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPINDEXVIEW 过滤器对象
 */
public class PSAppIndexViewFilter extends PSAppViewFilter {

    public PSAppIndexViewFilter(){
    
    }      

    /**
     * 设置属性[应用选择器模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppIndexViewFilter appswitchmode__eq(Integer value){
        this.setFieldCond("appswitchmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[下边栏应用菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppIndexViewFilter bottomsidepsappmenuid__eq(String value){
        this.setFieldCond("bottomsidepsappmenuid", EQ, value);
        return this;
    }

    /**
     * 设置属性[下边栏应用菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppIndexViewFilter bottomsidepsappmenuname__eq(String value){
        this.setFieldCond("bottomsidepsappmenuname", EQ, value);
        return this;
    }

    /**
     * 设置属性[下边栏应用菜单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppIndexViewFilter bottomsidepsappmenuname__like(String value){
        this.setFieldCond("bottomsidepsappmenuname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppIndexViewFilter defpsappviewid__eq(String value){
        this.setFieldCond("defpsappviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppIndexViewFilter defpsappviewname__eq(String value){
        this.setFieldCond("defpsappviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppIndexViewFilter defpsappviewname__like(String value){
        this.setFieldCond("defpsappviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[左边栏应用菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppIndexViewFilter leftsidepsappmenuid__eq(String value){
        this.setFieldCond("leftsidepsappmenuid", EQ, value);
        return this;
    }

    /**
     * 设置属性[左边栏应用菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppIndexViewFilter leftsidepsappmenuname__eq(String value){
        this.setFieldCond("leftsidepsappmenuname", EQ, value);
        return this;
    }

    /**
     * 设置属性[左边栏应用菜单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppIndexViewFilter leftsidepsappmenuname__like(String value){
        this.setFieldCond("leftsidepsappmenuname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[菜单方向]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppIndexViewFilter mainmenuside__eq(String value){
        this.setFieldCond("mainmenuside", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppIndexViewFilter psappindexviewname__eq(String value){
        this.setFieldCond("psappindexviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppIndexViewFilter psappindexviewname__like(String value){
        this.setFieldCond("psappindexviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppIndexViewFilter psappmenuid__eq(String value){
        this.setFieldCond("psappmenuid", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppIndexViewFilter psappmenuname__eq(String value){
        this.setFieldCond("psappmenuname", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用菜单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppIndexViewFilter psappmenuname__like(String value){
        this.setFieldCond("psappmenuname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面计数器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppIndexViewFilter pssyscounterid__eq(String value){
        this.setFieldCond("pssyscounterid", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面计数器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppIndexViewFilter pssyscountername__eq(String value){
        this.setFieldCond("pssyscountername", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面计数器]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppIndexViewFilter pssyscountername__like(String value){
        this.setFieldCond("pssyscountername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[右边栏应用菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppIndexViewFilter rightsidepsappmenuid__eq(String value){
        this.setFieldCond("rightsidepsappmenuid", EQ, value);
        return this;
    }

    /**
     * 设置属性[右边栏应用菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppIndexViewFilter rightsidepsappmenuname__eq(String value){
        this.setFieldCond("rightsidepsappmenuname", EQ, value);
        return this;
    }

    /**
     * 设置属性[右边栏应用菜单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppIndexViewFilter rightsidepsappmenuname__like(String value){
        this.setFieldCond("rightsidepsappmenuname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[上边栏应用菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppIndexViewFilter topsidepsappmenuid__eq(String value){
        this.setFieldCond("topsidepsappmenuid", EQ, value);
        return this;
    }

    /**
     * 设置属性[上边栏应用菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppIndexViewFilter topsidepsappmenuname__eq(String value){
        this.setFieldCond("topsidepsappmenuname", EQ, value);
        return this;
    }

    /**
     * 设置属性[上边栏应用菜单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppIndexViewFilter topsidepsappmenuname__like(String value){
        this.setFieldCond("topsidepsappmenuname", LIKE, value);
        return this;
    }

}
