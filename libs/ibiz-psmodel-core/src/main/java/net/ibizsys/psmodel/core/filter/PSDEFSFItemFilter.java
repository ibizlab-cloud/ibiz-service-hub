package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEFSFITEM 过滤器对象
 */
public class PSDEFSFItemFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSDEFSFItemFilter(){
    
    }      

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter cappslanresid__eq(String value){
        this.setFieldCond("cappslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter cappslanresname__eq(String value){
        this.setFieldCond("cappslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter cappslanresname__like(String value){
        this.setFieldCond("cappslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[代码名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[目标搜索模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter dstpsdefsfitemid__eq(String value){
        this.setFieldCond("dstpsdefsfitemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[目标搜索模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter dstpsdefsfitemname__eq(String value){
        this.setFieldCond("dstpsdefsfitemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[目标搜索模式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter dstpsdefsfitemname__like(String value){
        this.setFieldCond("dstpsdefsfitemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[编辑器类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter editortype__eq(String value){
        this.setFieldCond("editortype", EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter extendmode__eq(Integer value){
        this.setFieldCond("extendmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[占位提示语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter phpslanresid__eq(String value){
        this.setFieldCond("phpslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[占位提示语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter phpslanresname__eq(String value){
        this.setFieldCond("phpslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[占位提示语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter phpslanresname__like(String value){
        this.setFieldCond("phpslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter pscodelistid__eq(String value){
        this.setFieldCond("pscodelistid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter pscodelistname__eq(String value){
        this.setFieldCond("pscodelistname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter pscodelistname__like(String value){
        this.setFieldCond("pscodelistname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[操作符号]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter psdbvalueopid__eq(String value){
        this.setFieldCond("psdbvalueopid", EQ, value);
        return this;
    }

    /**
     * 设置属性[操作符号]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter psdbvalueopname__eq(String value){
        this.setFieldCond("psdbvalueopname", EQ, value);
        return this;
    }

    /**
     * 设置属性[操作符号]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter psdbvalueopname__like(String value){
        this.setFieldCond("psdbvalueopname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter psdefid__eq(String value){
        this.setFieldCond("psdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter psdefname__eq(String value){
        this.setFieldCond("psdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter psdefname__like(String value){
        this.setFieldCond("psdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[搜索模式标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter psdefsfitemname__eq(String value){
        this.setFieldCond("psdefsfitemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[搜索模式标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter psdefsfitemname__like(String value){
        this.setFieldCond("psdefsfitemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[属性值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter psdefvalueruleid__eq(String value){
        this.setFieldCond("psdefvalueruleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[属性值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter psdefvaluerulename__eq(String value){
        this.setFieldCond("psdefvaluerulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[属性值规则]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter psdefvaluerulename__like(String value){
        this.setFieldCond("psdefvaluerulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[值处理]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter pssysdbvfid__eq(String value){
        this.setFieldCond("pssysdbvfid", EQ, value);
        return this;
    }

    /**
     * 设置属性[值处理]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter pssysdbvfname__eq(String value){
        this.setFieldCond("pssysdbvfname", EQ, value);
        return this;
    }

    /**
     * 设置属性[值处理]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter pssysdbvfname__like(String value){
        this.setFieldCond("pssysdbvfname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[云系统编辑器样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter pssyseditorstyleid__eq(String value){
        this.setFieldCond("pssyseditorstyleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑器样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter pssyseditorstylename__eq(String value){
        this.setFieldCond("pssyseditorstylename", EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑器样式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter pssyseditorstylename__like(String value){
        this.setFieldCond("pssyseditorstylename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[显示图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter pssysimageid__eq(String value){
        this.setFieldCond("pssysimageid", EQ, value);
        return this;
    }

    /**
     * 设置属性[显示图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter pssysimagename__eq(String value){
        this.setFieldCond("pssysimagename", EQ, value);
        return this;
    }

    /**
     * 设置属性[显示图标]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter pssysimagename__like(String value){
        this.setFieldCond("pssysimagename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统转换器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter pssystranslatorid__eq(String value){
        this.setFieldCond("pssystranslatorid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统转换器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter pssystranslatorname__eq(String value){
        this.setFieldCond("pssystranslatorname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统转换器]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter pssystranslatorname__like(String value){
        this.setFieldCond("pssystranslatorname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter pssysvalueruleid__eq(String value){
        this.setFieldCond("pssysvalueruleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter pssysvaluerulename__eq(String value){
        this.setFieldCond("pssysvaluerulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统值规则]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter pssysvaluerulename__like(String value){
        this.setFieldCond("pssysvaluerulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用数据集查询逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refadpsdelogicid__eq(String value){
        this.setFieldCond("refadpsdelogicid", EQ, value);
        return this;
    }

    /**
     * 设置属性[引用数据集查询逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refadpsdelogicname__eq(String value){
        this.setFieldCond("refadpsdelogicname", EQ, value);
        return this;
    }

    /**
     * 设置属性[引用数据集查询逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refadpsdelogicname__like(String value){
        this.setFieldCond("refadpsdelogicname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用实体移动端多项选择视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refmobmpickuppsdeviewid__eq(String value){
        this.setFieldCond("refmobmpickuppsdeviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体移动端多项选择视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refmobmpickuppsdeviewname__eq(String value){
        this.setFieldCond("refmobmpickuppsdeviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体移动端多项选择视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refmobmpickuppsdeviewname__like(String value){
        this.setFieldCond("refmobmpickuppsdeviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用实体移动端选择视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refmobpickuppsdeviewid__eq(String value){
        this.setFieldCond("refmobpickuppsdeviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体移动端选择视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refmobpickuppsdeviewname__eq(String value){
        this.setFieldCond("refmobpickuppsdeviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体移动端选择视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refmobpickuppsdeviewname__like(String value){
        this.setFieldCond("refmobpickuppsdeviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[关联实体多选视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refmpickuppsdeviewid__eq(String value){
        this.setFieldCond("refmpickuppsdeviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体多选视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refmpickuppsdeviewname__eq(String value){
        this.setFieldCond("refmpickuppsdeviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体多选视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refmpickuppsdeviewname__like(String value){
        this.setFieldCond("refmpickuppsdeviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[关联实体选择视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refpickuppsdeviewid__eq(String value){
        this.setFieldCond("refpickuppsdeviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体选择视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refpickuppsdeviewname__eq(String value){
        this.setFieldCond("refpickuppsdeviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体选择视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refpickuppsdeviewname__like(String value){
        this.setFieldCond("refpickuppsdeviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[关联实体自填模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refpsdeacmodeid__eq(String value){
        this.setFieldCond("refpsdeacmodeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体自填模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refpsdeacmodename__eq(String value){
        this.setFieldCond("refpsdeacmodename", EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体自填模式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refpsdeacmodename__like(String value){
        this.setFieldCond("refpsdeacmodename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[关联实体数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refpsdedatasetid__eq(String value){
        this.setFieldCond("refpsdedatasetid", EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refpsdedatasetname__eq(String value){
        this.setFieldCond("refpsdedatasetname", EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体数据集合]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refpsdedatasetname__like(String value){
        this.setFieldCond("refpsdedatasetname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[关联实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refpsdeid__eq(String value){
        this.setFieldCond("refpsdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refpsdename__eq(String value){
        this.setFieldCond("refpsdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refpsdename__like(String value){
        this.setFieldCond("refpsdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refpsderid__eq(String value){
        this.setFieldCond("refpsderid", EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refpsdername__eq(String value){
        this.setFieldCond("refpsdername", EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refpsdername__like(String value){
        this.setFieldCond("refpsdername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[扩展模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter searchmode__eq(String value){
        this.setFieldCond("searchmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
