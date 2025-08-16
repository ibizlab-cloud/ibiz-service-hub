package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEDRGROUP 过滤器对象
 */
public class PSDEDRGroupFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEDRGroupFilter(){
    
    }      

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRGroupFilter cappslanresid__eq(String value){
        this.setFieldCond("cappslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRGroupFilter cappslanresname__eq(String value){
        this.setFieldCond("cappslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRGroupFilter cappslanresname__like(String value){
        this.setFieldCond("cappslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组标题]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRGroupFilter psdedrgroupname__like(String value){
        this.setFieldCond("psdedrgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRGroupFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRGroupFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRGroupFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统计数器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRGroupFilter pssyscounterid__eq(String value){
        this.setFieldCond("pssyscounterid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统计数器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRGroupFilter pssyscountername__eq(String value){
        this.setFieldCond("pssyscountername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统计数器]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRGroupFilter pssyscountername__like(String value){
        this.setFieldCond("pssyscountername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组显示图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRGroupFilter pssysimageid__eq(String value){
        this.setFieldCond("pssysimageid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组显示图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRGroupFilter pssysimagename__eq(String value){
        this.setFieldCond("pssysimagename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组显示图标]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRGroupFilter pssysimagename__like(String value){
        this.setFieldCond("pssysimagename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRGroupFilter tippslanresid__eq(String value){
        this.setFieldCond("tippslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRGroupFilter tippslanresname__eq(String value){
        this.setFieldCond("tippslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRGroupFilter tippslanresname__like(String value){
        this.setFieldCond("tippslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRGroupFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
