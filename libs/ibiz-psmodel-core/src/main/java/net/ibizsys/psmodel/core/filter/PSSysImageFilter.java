package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSIMAGE 过滤器对象
 */
public class PSSysImageFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysImageFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysImageFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[样式表名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysImageFilter cssclass__like(String value){
        this.setFieldCond("cssclass", LIKE, value);
        return this;
    }

    /**
     * 设置属性[样式表名称（X）]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysImageFilter cssclassx__like(String value){
        this.setFieldCond("cssclassx", LIKE, value);
        return this;
    }

    /**
     * 设置属性[字体标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysImageFilter glyph__like(String value){
        this.setFieldCond("glyph", LIKE, value);
        return this;
    }

    /**
     * 设置属性[图片路径]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysImageFilter imagepath__like(String value){
        this.setFieldCond("imagepath", LIKE, value);
        return this;
    }

    /**
     * 设置属性[图片路径（X）]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysImageFilter imagepathx__like(String value){
        this.setFieldCond("imagepathx", LIKE, value);
        return this;
    }

    /**
     * 设置属性[来源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysImageFilter imagesrc__eq(String value){
        this.setFieldCond("imagesrc", EQ, value);
        return this;
    }

    /**
     * 设置属性[类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysImageFilter imagetype__eq(String value){
        this.setFieldCond("imagetype", EQ, value);
        return this;
    }

    /**
     * 设置属性[平台预置图片]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysImageFilter psimagetemplid__eq(String value){
        this.setFieldCond("psimagetemplid", EQ, value);
        return this;
    }

    /**
     * 设置属性[平台预置图片]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysImageFilter psimagetemplname__eq(String value){
        this.setFieldCond("psimagetemplname", EQ, value);
        return this;
    }

    /**
     * 设置属性[平台预置图片]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysImageFilter psimagetemplname__like(String value){
        this.setFieldCond("psimagetemplname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysImageFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysImageFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysImageFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[图片名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysImageFilter pssysimagename__eq(String value){
        this.setFieldCond("pssysimagename", EQ, value);
        return this;
    }

    /**
     * 设置属性[图片名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysImageFilter pssysimagename__like(String value){
        this.setFieldCond("pssysimagename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysImageFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysImageFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysImageFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysImageFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysImageFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysImageFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysImageFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysImageFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
