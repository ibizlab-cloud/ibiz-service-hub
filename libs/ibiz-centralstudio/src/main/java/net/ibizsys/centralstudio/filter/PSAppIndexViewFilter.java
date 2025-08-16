package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

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
        this.setFieldCond("appswitchmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppIndexViewFilter defpsappviewid__eq(String value){
        this.setFieldCond("defpsappviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppIndexViewFilter defpsappviewname__eq(String value){
        this.setFieldCond("defpsappviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppIndexViewFilter defpsappviewname__like(String value){
        this.setFieldCond("defpsappviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[菜单方向]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppIndexViewFilter mainmenuside__eq(String value){
        this.setFieldCond("mainmenuside", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppIndexViewFilter psappindexviewname__like(String value){
        this.setFieldCond("psappindexviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppIndexViewFilter psappmenuid__eq(String value){
        this.setFieldCond("psappmenuid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppIndexViewFilter psappmenuname__eq(String value){
        this.setFieldCond("psappmenuname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用菜单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppIndexViewFilter psappmenuname__like(String value){
        this.setFieldCond("psappmenuname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面计数器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppIndexViewFilter pssyscounterid__eq(String value){
        this.setFieldCond("pssyscounterid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面计数器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppIndexViewFilter pssyscountername__eq(String value){
        this.setFieldCond("pssyscountername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面计数器]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppIndexViewFilter pssyscountername__like(String value){
        this.setFieldCond("pssyscountername", Conditions.LIKE, value);
        return this;
    }

}
