package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSMOBAPPSTARTPAGE 过滤器对象
 */
public class PSMobAppStartPageFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSMobAppStartPageFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSMobAppStartPageFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSMobAppStartPageFilter psappviewid__eq(String value){
        this.setFieldCond("psappviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSMobAppStartPageFilter psappviewname__eq(String value){
        this.setFieldCond("psappviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSMobAppStartPageFilter psappviewname__like(String value){
        this.setFieldCond("psappviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[资源名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSMobAppStartPageFilter psmobappstartpagename__eq(String value){
        this.setFieldCond("psmobappstartpagename", EQ, value);
        return this;
    }

    /**
     * 设置属性[资源名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSMobAppStartPageFilter psmobappstartpagename__like(String value){
        this.setFieldCond("psmobappstartpagename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[移动端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSMobAppStartPageFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSMobAppStartPageFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSMobAppStartPageFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统图片资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSMobAppStartPageFilter pssysimageid__eq(String value){
        this.setFieldCond("pssysimageid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统图片资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSMobAppStartPageFilter pssysimagename__eq(String value){
        this.setFieldCond("pssysimagename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统图片资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSMobAppStartPageFilter pssysimagename__like(String value){
        this.setFieldCond("pssysimagename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[资源规格]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSMobAppStartPageFilter resspec__eq(String value){
        this.setFieldCond("resspec", EQ, value);
        return this;
    }

    /**
     * 设置属性[资源类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSMobAppStartPageFilter restype__eq(String value){
        this.setFieldCond("restype", EQ, value);
        return this;
    }

}
