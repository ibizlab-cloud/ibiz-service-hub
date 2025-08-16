package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDERDEFMAP 过滤器对象
 */
public class PSDERDEFMapFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDERDEFMapFilter(){
    
    }      

    /**
     * 设置属性[主实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERDEFMapFilter majorpsdefid__eq(String value){
        this.setFieldCond("majorpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERDEFMapFilter majorpsdefname__eq(String value){
        this.setFieldCond("majorpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主实体属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERDEFMapFilter majorpsdefname__like(String value){
        this.setFieldCond("majorpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[映射类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERDEFMapFilter maptype__eq(String value){
        this.setFieldCond("maptype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[从实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERDEFMapFilter minorpsdefid__eq(String value){
        this.setFieldCond("minorpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[从实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERDEFMapFilter minorpsdefname__eq(String value){
        this.setFieldCond("minorpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[从实体属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERDEFMapFilter minorpsdefname__like(String value){
        this.setFieldCond("minorpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[从实体数据查询]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERDEFMapFilter psdedqid__eq(String value){
        this.setFieldCond("psdedqid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[从实体数据查询]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERDEFMapFilter psdedqname__eq(String value){
        this.setFieldCond("psdedqname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[从实体数据查询]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERDEFMapFilter psdedqname__like(String value){
        this.setFieldCond("psdedqname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[映射名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERDEFMapFilter psderdefmapname__like(String value){
        this.setFieldCond("psderdefmapname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERDEFMapFilter psderid__eq(String value){
        this.setFieldCond("psderid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERDEFMapFilter psdername__eq(String value){
        this.setFieldCond("psdername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERDEFMapFilter psdername__like(String value){
        this.setFieldCond("psdername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERDEFMapFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERDEFMapFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERDEFMapFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERDEFMapFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
