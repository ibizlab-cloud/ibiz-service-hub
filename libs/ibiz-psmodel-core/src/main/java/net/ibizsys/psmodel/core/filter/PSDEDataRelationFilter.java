package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEDATARELATION 过滤器对象
 */
public class PSDEDataRelationFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSDEDataRelationFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑项标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter formcappslanresid__eq(String value){
        this.setFieldCond("formcappslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑项标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter formcappslanresname__eq(String value){
        this.setFieldCond("formcappslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑项标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter formcappslanresname__like(String value){
        this.setFieldCond("formcappslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[编辑项视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter formpsdeviewbaseid__eq(String value){
        this.setFieldCond("formpsdeviewbaseid", EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑项视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter formpsdeviewbasename__eq(String value){
        this.setFieldCond("formpsdeviewbasename", EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑项视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter formpsdeviewbasename__like(String value){
        this.setFieldCond("formpsdeviewbasename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[编辑项图片资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter formpssysimageid__eq(String value){
        this.setFieldCond("formpssysimageid", EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑项图片资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter formpssysimagename__eq(String value){
        this.setFieldCond("formpssysimagename", EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑项图片资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter formpssysimagename__like(String value){
        this.setFieldCond("formpssysimagename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter psctrllogicgroupid__eq(String value){
        this.setFieldCond("psctrllogicgroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter psctrllogicgroupname__eq(String value){
        this.setFieldCond("psctrllogicgroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter psctrllogicgroupname__like(String value){
        this.setFieldCond("psctrllogicgroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[关系界面组名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter psdedatarelationname__eq(String value){
        this.setFieldCond("psdedatarelationname", EQ, value);
        return this;
    }

    /**
     * 设置属性[关系界面组名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter psdedatarelationname__like(String value){
        this.setFieldCond("psdedatarelationname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[关系计数器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter pssyscounterid__eq(String value){
        this.setFieldCond("pssyscounterid", EQ, value);
        return this;
    }

    /**
     * 设置属性[关系计数器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter pssyscountername__eq(String value){
        this.setFieldCond("pssyscountername", EQ, value);
        return this;
    }

    /**
     * 设置属性[关系计数器]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter pssyscountername__like(String value){
        this.setFieldCond("pssyscountername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataRelationFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
