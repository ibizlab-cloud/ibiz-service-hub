package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPUISTYLE 过滤器对象
 */
public class PSAppUIStyleFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSAppUIStyleFilter(){
    
    }      

    /**
     * 设置属性[主菜单方向]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUIStyleFilter mainmenuside__eq(String value){
        this.setFieldCond("mainmenuside", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[模式名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUIStyleFilter psappuistylename__like(String value){
        this.setFieldCond("psappuistylename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUIStyleFilter pspfid__eq(String value){
        this.setFieldCond("pspfid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUIStyleFilter pspfname__eq(String value){
        this.setFieldCond("pspfname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端模板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUIStyleFilter pspfname__like(String value){
        this.setFieldCond("pspfname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUIStyleFilter pspfstyleid__eq(String value){
        this.setFieldCond("pspfstyleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUIStyleFilter pspfstylename__eq(String value){
        this.setFieldCond("pspfstylename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用样式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUIStyleFilter pspfstylename__like(String value){
        this.setFieldCond("pspfstylename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUIStyleFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUIStyleFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUIStyleFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[根应用视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUIStyleFilter rootpsappviewid__eq(String value){
        this.setFieldCond("rootpsappviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[根应用视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUIStyleFilter rootpsappviewname__eq(String value){
        this.setFieldCond("rootpsappviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[根应用视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUIStyleFilter rootpsappviewname__like(String value){
        this.setFieldCond("rootpsappviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUIStyleFilter uistyle__eq(String value){
        this.setFieldCond("uistyle", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUIStyleFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
