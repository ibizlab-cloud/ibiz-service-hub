package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEUAGROUPDETAIL 过滤器对象
 */
public class PSDEUAGroupDetailFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEUAGroupDetailFilter(){
    
    }      

    /**
     * 设置属性[行为级别]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUAGroupDetailFilter actionlevel__eq(Integer value){
        this.setFieldCond("actionlevel", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后置内容样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUAGroupDetailFilter afterpssyscssid__eq(String value){
        this.setFieldCond("afterpssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后置内容样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUAGroupDetailFilter afterpssyscssname__eq(String value){
        this.setFieldCond("afterpssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后置内容样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUAGroupDetailFilter afterpssyscssname__like(String value){
        this.setFieldCond("afterpssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后置预置系统资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUAGroupDetailFilter afterpssysresourceid__eq(String value){
        this.setFieldCond("afterpssysresourceid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后置预置系统资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUAGroupDetailFilter afterpssysresourcename__eq(String value){
        this.setFieldCond("afterpssysresourcename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后置预置系统资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUAGroupDetailFilter afterpssysresourcename__like(String value){
        this.setFieldCond("afterpssysresourcename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前置内容样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUAGroupDetailFilter beforepssyscssid__eq(String value){
        this.setFieldCond("beforepssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前置内容样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUAGroupDetailFilter beforepssyscssname__eq(String value){
        this.setFieldCond("beforepssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前置内容样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUAGroupDetailFilter beforepssyscssname__like(String value){
        this.setFieldCond("beforepssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前置预置系统资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUAGroupDetailFilter beforepssysresourceid__eq(String value){
        this.setFieldCond("beforepssysresourceid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前置预置系统资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUAGroupDetailFilter beforepssysresourcename__eq(String value){
        this.setFieldCond("beforepssysresourcename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前置预置系统资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUAGroupDetailFilter beforepssysresourcename__like(String value){
        this.setFieldCond("beforepssysresourcename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[成员类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUAGroupDetailFilter detailtype__eq(String value){
        this.setFieldCond("detailtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUAGroupDetailFilter psdeuagroupid__eq(String value){
        this.setFieldCond("psdeuagroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUAGroupDetailFilter psdeuagroupname__eq(String value){
        this.setFieldCond("psdeuagroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUAGroupDetailFilter psdeuagroupname__like(String value){
        this.setFieldCond("psdeuagroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[成员名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUAGroupDetailFilter psdeuagrpdetailname__like(String value){
        this.setFieldCond("psdeuagrpdetailname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUAGroupDetailFilter psdeuiactionid__eq(String value){
        this.setFieldCond("psdeuiactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUAGroupDetailFilter psdeuiactionname__eq(String value){
        this.setFieldCond("psdeuiactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUAGroupDetailFilter psdeuiactionname__like(String value){
        this.setFieldCond("psdeuiactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[显示样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUAGroupDetailFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUAGroupDetailFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUAGroupDetailFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[显示图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUAGroupDetailFilter pssysimageid__eq(String value){
        this.setFieldCond("pssysimageid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[显示图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUAGroupDetailFilter pssysimagename__eq(String value){
        this.setFieldCond("pssysimagename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[显示图标]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUAGroupDetailFilter pssysimagename__like(String value){
        this.setFieldCond("pssysimagename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[显示模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUAGroupDetailFilter showmode__eq(String value){
        this.setFieldCond("showmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUAGroupDetailFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
