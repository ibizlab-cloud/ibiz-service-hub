package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSIMAGE 过滤器对象
 */
public class PSSysImageFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysImageFilter(){
    
    }      

    /**
     * 设置属性[样式表名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysImageFilter cssclass__like(String value){
        this.setFieldCond("cssclass", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[样式表名称（X）]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysImageFilter cssclassx__like(String value){
        this.setFieldCond("cssclassx", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[字体标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysImageFilter glyph__like(String value){
        this.setFieldCond("glyph", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[图片路径]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysImageFilter imagepath__like(String value){
        this.setFieldCond("imagepath", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[图片路径（X）]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysImageFilter imagepathx__like(String value){
        this.setFieldCond("imagepathx", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[来源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysImageFilter imagesrc__eq(String value){
        this.setFieldCond("imagesrc", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysImageFilter imagetype__eq(String value){
        this.setFieldCond("imagetype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[平台预置图片]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysImageFilter psimagetemplid__eq(String value){
        this.setFieldCond("psimagetemplid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[平台预置图片]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysImageFilter psimagetemplname__eq(String value){
        this.setFieldCond("psimagetemplname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[平台预置图片]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysImageFilter psimagetemplname__like(String value){
        this.setFieldCond("psimagetemplname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysImageFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysImageFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysImageFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[图片名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysImageFilter pssysimagename__like(String value){
        this.setFieldCond("pssysimagename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysImageFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysImageFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysImageFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysImageFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
