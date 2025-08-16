package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEFSFITEM 过滤器对象
 */
public class PSDEFSFItemFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEFSFItemFilter(){
    
    }      

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter cappslanresid__eq(String value){
        this.setFieldCond("cappslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter cappslanresname__eq(String value){
        this.setFieldCond("cappslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter cappslanresname__like(String value){
        this.setFieldCond("cappslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[代码名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter codename__eq(String value){
        this.setFieldCond("codename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标搜索模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter dstpsdefsfitemid__eq(String value){
        this.setFieldCond("dstpsdefsfitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标搜索模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter dstpsdefsfitemname__eq(String value){
        this.setFieldCond("dstpsdefsfitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标搜索模式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter dstpsdefsfitemname__like(String value){
        this.setFieldCond("dstpsdefsfitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[编辑器类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter editortype__eq(String value){
        this.setFieldCond("editortype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter extendmode__eq(Integer value){
        this.setFieldCond("extendmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[占位提示语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter phpslanresid__eq(String value){
        this.setFieldCond("phpslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[占位提示语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter phpslanresname__eq(String value){
        this.setFieldCond("phpslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[占位提示语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter phpslanresname__like(String value){
        this.setFieldCond("phpslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter pscodelistid__eq(String value){
        this.setFieldCond("pscodelistid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter pscodelistname__eq(String value){
        this.setFieldCond("pscodelistname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter pscodelistname__like(String value){
        this.setFieldCond("pscodelistname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[操作符号]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter psdbvalueopid__eq(String value){
        this.setFieldCond("psdbvalueopid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[操作符号]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter psdbvalueopname__eq(String value){
        this.setFieldCond("psdbvalueopname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[操作符号]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter psdbvalueopname__like(String value){
        this.setFieldCond("psdbvalueopname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter psdefid__eq(String value){
        this.setFieldCond("psdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter psdefname__eq(String value){
        this.setFieldCond("psdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter psdefname__like(String value){
        this.setFieldCond("psdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[搜索模式标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter psdefsfitemname__eq(String value){
        this.setFieldCond("psdefsfitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[搜索模式标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter psdefsfitemname__like(String value){
        this.setFieldCond("psdefsfitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[属性值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter psdefvalueruleid__eq(String value){
        this.setFieldCond("psdefvalueruleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[属性值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter psdefvaluerulename__eq(String value){
        this.setFieldCond("psdefvaluerulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[属性值规则]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter psdefvaluerulename__like(String value){
        this.setFieldCond("psdefvaluerulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[值处理]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter pssysdbvfid__eq(String value){
        this.setFieldCond("pssysdbvfid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[值处理]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter pssysdbvfname__eq(String value){
        this.setFieldCond("pssysdbvfname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[值处理]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter pssysdbvfname__like(String value){
        this.setFieldCond("pssysdbvfname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[云系统编辑器样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter pssyseditorstyleid__eq(String value){
        this.setFieldCond("pssyseditorstyleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑器样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter pssyseditorstylename__eq(String value){
        this.setFieldCond("pssyseditorstylename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑器样式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter pssyseditorstylename__like(String value){
        this.setFieldCond("pssyseditorstylename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[显示图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter pssysimageid__eq(String value){
        this.setFieldCond("pssysimageid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[显示图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter pssysimagename__eq(String value){
        this.setFieldCond("pssysimagename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[显示图标]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter pssysimagename__like(String value){
        this.setFieldCond("pssysimagename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter pssysvalueruleid__eq(String value){
        this.setFieldCond("pssysvalueruleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter pssysvaluerulename__eq(String value){
        this.setFieldCond("pssysvaluerulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统值规则]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter pssysvaluerulename__like(String value){
        this.setFieldCond("pssysvaluerulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用数据集查询逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refadpsdelogicid__eq(String value){
        this.setFieldCond("refadpsdelogicid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用数据集查询逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refadpsdelogicname__eq(String value){
        this.setFieldCond("refadpsdelogicname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用数据集查询逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refadpsdelogicname__like(String value){
        this.setFieldCond("refadpsdelogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用实体移动端多项选择视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refmobmpickuppsdeviewid__eq(String value){
        this.setFieldCond("refmobmpickuppsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体移动端多项选择视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refmobmpickuppsdeviewname__eq(String value){
        this.setFieldCond("refmobmpickuppsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体移动端多项选择视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refmobmpickuppsdeviewname__like(String value){
        this.setFieldCond("refmobmpickuppsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用实体移动端选择视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refmobpickuppsdeviewid__eq(String value){
        this.setFieldCond("refmobpickuppsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体移动端选择视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refmobpickuppsdeviewname__eq(String value){
        this.setFieldCond("refmobpickuppsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体移动端选择视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refmobpickuppsdeviewname__like(String value){
        this.setFieldCond("refmobpickuppsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[关联实体多选视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refmpickuppsdeviewid__eq(String value){
        this.setFieldCond("refmpickuppsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体多选视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refmpickuppsdeviewname__eq(String value){
        this.setFieldCond("refmpickuppsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体多选视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refmpickuppsdeviewname__like(String value){
        this.setFieldCond("refmpickuppsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[关联实体选择视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refpickuppsdeviewid__eq(String value){
        this.setFieldCond("refpickuppsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体选择视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refpickuppsdeviewname__eq(String value){
        this.setFieldCond("refpickuppsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体选择视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refpickuppsdeviewname__like(String value){
        this.setFieldCond("refpickuppsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[关联实体自填模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refpsdeacmodeid__eq(String value){
        this.setFieldCond("refpsdeacmodeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体自填模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refpsdeacmodename__eq(String value){
        this.setFieldCond("refpsdeacmodename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体自填模式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refpsdeacmodename__like(String value){
        this.setFieldCond("refpsdeacmodename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[关联实体数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refpsdedatasetid__eq(String value){
        this.setFieldCond("refpsdedatasetid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refpsdedatasetname__eq(String value){
        this.setFieldCond("refpsdedatasetname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体数据集合]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refpsdedatasetname__like(String value){
        this.setFieldCond("refpsdedatasetname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[关联实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refpsdeid__eq(String value){
        this.setFieldCond("refpsdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refpsdename__eq(String value){
        this.setFieldCond("refpsdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refpsdename__like(String value){
        this.setFieldCond("refpsdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refpsderid__eq(String value){
        this.setFieldCond("refpsderid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refpsdername__eq(String value){
        this.setFieldCond("refpsdername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter refpsdername__like(String value){
        this.setFieldCond("refpsdername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[扩展模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter searchmode__eq(String value){
        this.setFieldCond("searchmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter usertag__eq(String value){
        this.setFieldCond("usertag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFSFItemFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", Conditions.EQ, value);
        return this;
    }

}
