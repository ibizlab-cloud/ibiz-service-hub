package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEDATARELATION 过滤器对象
 */
public class PSDEDataRelationFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEDataRelationFilter(){
    
    }      

    /**
     * 设置属性[编辑项标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter formcappslanresid__eq(String value){
        this.setFieldCond("formcappslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑项标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter formcappslanresname__eq(String value){
        this.setFieldCond("formcappslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑项标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter formcappslanresname__like(String value){
        this.setFieldCond("formcappslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[编辑项视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter formpsdeviewbaseid__eq(String value){
        this.setFieldCond("formpsdeviewbaseid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑项视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter formpsdeviewbasename__eq(String value){
        this.setFieldCond("formpsdeviewbasename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑项视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter formpsdeviewbasename__like(String value){
        this.setFieldCond("formpsdeviewbasename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[编辑项图片资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter formpssysimageid__eq(String value){
        this.setFieldCond("formpssysimageid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑项图片资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter formpssysimagename__eq(String value){
        this.setFieldCond("formpssysimagename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑项图片资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter formpssysimagename__like(String value){
        this.setFieldCond("formpssysimagename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter psctrllogicgroupid__eq(String value){
        this.setFieldCond("psctrllogicgroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter psctrllogicgroupname__eq(String value){
        this.setFieldCond("psctrllogicgroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter psctrllogicgroupname__like(String value){
        this.setFieldCond("psctrllogicgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[关系界面组名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter psdedatarelationname__like(String value){
        this.setFieldCond("psdedatarelationname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[关系计数器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter pssyscounterid__eq(String value){
        this.setFieldCond("pssyscounterid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关系计数器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter pssyscountername__eq(String value){
        this.setFieldCond("pssyscountername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关系计数器]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter pssyscountername__like(String value){
        this.setFieldCond("pssyscountername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
