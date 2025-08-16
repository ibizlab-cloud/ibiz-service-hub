package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEDRDETAIL 过滤器对象
 */
public class PSDEDRDetailFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEDRDetailFilter(){
    
    }      

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRDetailFilter cappslanresid__eq(String value){
        this.setFieldCond("cappslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRDetailFilter cappslanresname__eq(String value){
        this.setFieldCond("cappslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRDetailFilter cappslanresname__like(String value){
        this.setFieldCond("cappslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[标题]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRDetailFilter caption__like(String value){
        this.setFieldCond("caption", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[计数显示模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRDetailFilter countermode__eq(Integer value){
        this.setFieldCond("countermode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[成员类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRDetailFilter detailtype__eq(String value){
        this.setFieldCond("detailtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[启用模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRDetailFilter enablemode__eq(String value){
        this.setFieldCond("enablemode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[成员标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRDetailFilter psdedrdetailname__like(String value){
        this.setFieldCond("psdedrdetailname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面分组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRDetailFilter psdedrgroupid__eq(String value){
        this.setFieldCond("psdedrgroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关系分组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRDetailFilter psdedrgroupname__eq(String value){
        this.setFieldCond("psdedrgroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关系分组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRDetailFilter psdedrgroupname__like(String value){
        this.setFieldCond("psdedrgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[关系界面组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRDetailFilter psdedrid__eq(String value){
        this.setFieldCond("psdedrid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体关系界面]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRDetailFilter psdedritemid__eq(String value){
        this.setFieldCond("psdedritemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关系界面]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRDetailFilter psdedritemname__eq(String value){
        this.setFieldCond("psdedritemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关系界面]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRDetailFilter psdedritemname__like(String value){
        this.setFieldCond("psdedritemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[关系界面组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRDetailFilter psdedrname__eq(String value){
        this.setFieldCond("psdedrname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关系界面组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRDetailFilter psdedrname__like(String value){
        this.setFieldCond("psdedrname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体操作标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRDetailFilter psdeopprivid__eq(String value){
        this.setFieldCond("psdeopprivid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体操作标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRDetailFilter psdeopprivname__eq(String value){
        this.setFieldCond("psdeopprivname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体操作标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRDetailFilter psdeopprivname__like(String value){
        this.setFieldCond("psdeopprivname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据树视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRDetailFilter psdetreeviewid__eq(String value){
        this.setFieldCond("psdetreeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据树视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRDetailFilter psdetreeviewname__eq(String value){
        this.setFieldCond("psdetreeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据树视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRDetailFilter psdetreeviewname__like(String value){
        this.setFieldCond("psdetreeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRDetailFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRDetailFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRDetailFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[显示图标资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRDetailFilter pssysimageid__eq(String value){
        this.setFieldCond("pssysimageid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[显示图标资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRDetailFilter pssysimagename__eq(String value){
        this.setFieldCond("pssysimagename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[显示图标资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRDetailFilter pssysimagename__like(String value){
        this.setFieldCond("pssysimagename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统预置视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRDetailFilter pssyspdtviewid__eq(String value){
        this.setFieldCond("pssyspdtviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统预置视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRDetailFilter pssyspdtviewname__eq(String value){
        this.setFieldCond("pssyspdtviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统预置视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRDetailFilter pssyspdtviewname__like(String value){
        this.setFieldCond("pssyspdtviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[判断启用实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRDetailFilter testpsdeactionid__eq(String value){
        this.setFieldCond("testpsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[判断启用实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRDetailFilter testpsdeactionname__eq(String value){
        this.setFieldCond("testpsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[判断启用实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRDetailFilter testpsdeactionname__like(String value){
        this.setFieldCond("testpsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRDetailFilter tippslanresid__eq(String value){
        this.setFieldCond("tippslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRDetailFilter tippslanresname__eq(String value){
        this.setFieldCond("tippslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRDetailFilter tippslanresname__like(String value){
        this.setFieldCond("tippslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRDetailFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
