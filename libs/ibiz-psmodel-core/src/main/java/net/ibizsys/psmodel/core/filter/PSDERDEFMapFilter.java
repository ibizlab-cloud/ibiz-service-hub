package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDERDEFMAP 过滤器对象
 */
public class PSDERDEFMapFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSDERDEFMapFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERDEFMapFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[主实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERDEFMapFilter majorpsdefid__eq(String value){
        this.setFieldCond("majorpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[主实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERDEFMapFilter majorpsdefname__eq(String value){
        this.setFieldCond("majorpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[主实体属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERDEFMapFilter majorpsdefname__like(String value){
        this.setFieldCond("majorpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[映射类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERDEFMapFilter maptype__eq(String value){
        this.setFieldCond("maptype", EQ, value);
        return this;
    }

    /**
     * 设置属性[从实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERDEFMapFilter minorpsdefid__eq(String value){
        this.setFieldCond("minorpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[从实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERDEFMapFilter minorpsdefname__eq(String value){
        this.setFieldCond("minorpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[从实体属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERDEFMapFilter minorpsdefname__like(String value){
        this.setFieldCond("minorpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[从实体数据查询]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERDEFMapFilter psdedqid__eq(String value){
        this.setFieldCond("psdedqid", EQ, value);
        return this;
    }

    /**
     * 设置属性[从实体数据查询]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERDEFMapFilter psdedqname__eq(String value){
        this.setFieldCond("psdedqname", EQ, value);
        return this;
    }

    /**
     * 设置属性[从实体数据查询]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERDEFMapFilter psdedqname__like(String value){
        this.setFieldCond("psdedqname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[映射名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERDEFMapFilter psderdefmapname__eq(String value){
        this.setFieldCond("psderdefmapname", EQ, value);
        return this;
    }

    /**
     * 设置属性[映射名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERDEFMapFilter psderdefmapname__like(String value){
        this.setFieldCond("psderdefmapname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERDEFMapFilter psderid__eq(String value){
        this.setFieldCond("psderid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERDEFMapFilter psdername__eq(String value){
        this.setFieldCond("psdername", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERDEFMapFilter psdername__like(String value){
        this.setFieldCond("psdername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERDEFMapFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERDEFMapFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERDEFMapFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERDEFMapFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERDEFMapFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERDEFMapFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERDEFMapFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERDEFMapFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
