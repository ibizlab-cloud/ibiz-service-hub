package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSMOBAPPSTARTPAGE 过滤器对象
 */
public class PSMobAppStartPageFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSMobAppStartPageFilter(){
    
    }      

    /**
     * 设置属性[应用视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSMobAppStartPageFilter psappviewid__eq(String value){
        this.setFieldCond("psappviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSMobAppStartPageFilter psappviewname__eq(String value){
        this.setFieldCond("psappviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSMobAppStartPageFilter psappviewname__like(String value){
        this.setFieldCond("psappviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[资源名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSMobAppStartPageFilter psmobappstartpagename__eq(String value){
        this.setFieldCond("psmobappstartpagename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[资源名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSMobAppStartPageFilter psmobappstartpagename__like(String value){
        this.setFieldCond("psmobappstartpagename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[移动端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSMobAppStartPageFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSMobAppStartPageFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSMobAppStartPageFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统图片资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSMobAppStartPageFilter pssysimageid__eq(String value){
        this.setFieldCond("pssysimageid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统图片资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSMobAppStartPageFilter pssysimagename__eq(String value){
        this.setFieldCond("pssysimagename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统图片资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSMobAppStartPageFilter pssysimagename__like(String value){
        this.setFieldCond("pssysimagename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[资源规格]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSMobAppStartPageFilter resspec__eq(String value){
        this.setFieldCond("resspec", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[资源类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSMobAppStartPageFilter restype__eq(String value){
        this.setFieldCond("restype", Conditions.EQ, value);
        return this;
    }

}
