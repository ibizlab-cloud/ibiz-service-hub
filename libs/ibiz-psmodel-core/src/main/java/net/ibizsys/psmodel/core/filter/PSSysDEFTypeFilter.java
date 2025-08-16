package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSDEFTYPE 过滤器对象
 */
public class PSSysDEFTypeFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysDEFTypeFilter(){
    
    }      

    /**
     * 设置属性[编辑器类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDEFTypeFilter editortype__eq(String value){
        this.setFieldCond("editortype", EQ, value);
        return this;
    }

    /**
     * 设置属性[表格列对齐]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDEFTypeFilter gridcolalign__eq(String value){
        this.setFieldCond("gridcolalign", EQ, value);
        return this;
    }

    /**
     * 设置属性[表格列代码值转换]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDEFTypeFilter gridcolclmode__eq(String value){
        this.setFieldCond("gridcolclmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端编辑器类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDEFTypeFilter mbeditortype__eq(String value){
        this.setFieldCond("mbeditortype", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDEFTypeFilter pscodelistid__eq(String value){
        this.setFieldCond("pscodelistid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDEFTypeFilter pscodelistname__eq(String value){
        this.setFieldCond("pscodelistname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDEFTypeFilter pscodelistname__like(String value){
        this.setFieldCond("pscodelistname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[平台预置逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDEFTypeFilter psdeftypeid__eq(String value){
        this.setFieldCond("psdeftypeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[平台预置逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDEFTypeFilter psdeftypename__eq(String value){
        this.setFieldCond("psdeftypename", EQ, value);
        return this;
    }

    /**
     * 设置属性[平台预置逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDEFTypeFilter psdeftypename__like(String value){
        this.setFieldCond("psdeftypename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统属性类型名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDEFTypeFilter pssysdeftypename__eq(String value){
        this.setFieldCond("pssysdeftypename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统属性类型名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDEFTypeFilter pssysdeftypename__like(String value){
        this.setFieldCond("pssysdeftypename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDEFTypeFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDEFTypeFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDEFTypeFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统单位]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDEFTypeFilter pssysunitid__eq(String value){
        this.setFieldCond("pssysunitid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统单位]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDEFTypeFilter pssysunitname__eq(String value){
        this.setFieldCond("pssysunitname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统单位]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDEFTypeFilter pssysunitname__like(String value){
        this.setFieldCond("pssysunitname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDEFTypeFilter pssysvalueruleid__eq(String value){
        this.setFieldCond("pssysvalueruleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDEFTypeFilter pssysvaluerulename__eq(String value){
        this.setFieldCond("pssysvaluerulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统值规则]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDEFTypeFilter pssysvaluerulename__like(String value){
        this.setFieldCond("pssysvaluerulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[搜索编辑器类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDEFTypeFilter searcheditortype__eq(String value){
        this.setFieldCond("searcheditortype", EQ, value);
        return this;
    }

    /**
     * 设置属性[搜索移动端编辑器类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDEFTypeFilter searchmbeditortype__eq(String value){
        this.setFieldCond("searchmbeditortype", EQ, value);
        return this;
    }

    /**
     * 设置属性[标准数据类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDEFTypeFilter stddatatype__eq(Integer value){
        this.setFieldCond("stddatatype", EQ, value);
        return this;
    }

}
