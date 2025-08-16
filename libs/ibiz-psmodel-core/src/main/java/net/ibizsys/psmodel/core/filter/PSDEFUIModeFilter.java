package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEFUIMODE 过滤器对象
 */
public class PSDEFUIModeFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSDEFUIModeFilter(){
    
    }      

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter cappslanresid__eq(String value){
        this.setFieldCond("cappslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter cappslanresname__eq(String value){
        this.setFieldCond("cappslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter cappslanresname__like(String value){
        this.setFieldCond("cappslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[标题]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter caption__like(String value){
        this.setFieldCond("caption", LIKE, value);
        return this;
    }

    /**
     * 设置属性[输出代码表配置模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter codelistconfigmode__eq(Integer value){
        this.setFieldCond("codelistconfigmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[新建默认值类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter createdvt__eq(String value){
        this.setFieldCond("createdvt", EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑器类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter editortype__eq(String value){
        this.setFieldCond("editortype", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter ftmode__eq(String value){
        this.setFieldCond("ftmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[表格列绘制插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter gcrpssyspfpluginid__eq(String value){
        this.setFieldCond("gcrpssyspfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[表格列绘制插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter gcrpssyspfpluginname__eq(String value){
        this.setFieldCond("gcrpssyspfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[表格列绘制插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter gcrpssyspfpluginname__like(String value){
        this.setFieldCond("gcrpssyspfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[表格列对齐]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter gridcolalign__eq(String value){
        this.setFieldCond("gridcolalign", EQ, value);
        return this;
    }

    /**
     * 设置属性[表格列代码值转换]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter gridcolclmode__eq(String value){
        this.setFieldCond("gridcolclmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[忽略输入值]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter ignoreinput__eq(Integer value){
        this.setFieldCond("ignoreinput", EQ, value);
        return this;
    }

    /**
     * 设置属性[项处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter itempsachandlerid__eq(String value){
        this.setFieldCond("itempsachandlerid", EQ, value);
        return this;
    }

    /**
     * 设置属性[占位提示语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter phpslanresid__eq(String value){
        this.setFieldCond("phpslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[占位提示语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter phpslanresname__eq(String value){
        this.setFieldCond("phpslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[占位提示语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter phpslanresname__like(String value){
        this.setFieldCond("phpslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter pscodelistid__eq(String value){
        this.setFieldCond("pscodelistid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter pscodelistname__eq(String value){
        this.setFieldCond("pscodelistname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter pscodelistname__like(String value){
        this.setFieldCond("pscodelistname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[属性界面模式名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter psdefuimodename__eq(String value){
        this.setFieldCond("psdefuimodename", EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("psdefformitemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[属性界面模式名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter psdefuimodename__like(String value){
        this.setFieldCond("psdefuimodename", LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("psdefformitemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter psdefid__eq(String value){
        this.setFieldCond("psdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[属性输入提示]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter psdefinputtipid__eq(String value){
        this.setFieldCond("psdefinputtipid", EQ, value);
        return this;
    }

    /**
     * 设置属性[属性输入提示]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter psdefinputtipname__eq(String value){
        this.setFieldCond("psdefinputtipname", EQ, value);
        return this;
    }

    /**
     * 设置属性[属性输入提示]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter psdefinputtipname__like(String value){
        this.setFieldCond("psdefinputtipname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter psdefname__eq(String value){
        this.setFieldCond("psdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter psdefname__like(String value){
        this.setFieldCond("psdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[输入词条类别]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter pssysdictcatid__eq(String value){
        this.setFieldCond("pssysdictcatid", EQ, value);
        return this;
    }

    /**
     * 设置属性[输入词条类别]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter pssysdictcatname__eq(String value){
        this.setFieldCond("pssysdictcatname", EQ, value);
        return this;
    }

    /**
     * 设置属性[输入词条类别]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter pssysdictcatname__like(String value){
        this.setFieldCond("pssysdictcatname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[编辑器样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter pssyseditorstyleid__eq(String value){
        this.setFieldCond("pssyseditorstyleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑器样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter pssyseditorstylename__eq(String value){
        this.setFieldCond("pssyseditorstylename", EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑器样式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter pssyseditorstylename__like(String value){
        this.setFieldCond("pssyseditorstylename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[编辑项图片]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter pssysimageid__eq(String value){
        this.setFieldCond("pssysimageid", EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑项图片]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter pssysimagename__eq(String value){
        this.setFieldCond("pssysimagename", EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑项图片]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter pssysimagename__like(String value){
        this.setFieldCond("pssysimagename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[单位]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter pssysunitid__eq(String value){
        this.setFieldCond("pssysunitid", EQ, value);
        return this;
    }

    /**
     * 设置属性[单位]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter pssysunitname__eq(String value){
        this.setFieldCond("pssysunitname", EQ, value);
        return this;
    }

    /**
     * 设置属性[单位]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter pssysunitname__like(String value){
        this.setFieldCond("pssysunitname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用数据集查询逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter refadpsdelogicid__eq(String value){
        this.setFieldCond("refadpsdelogicid", EQ, value);
        return this;
    }

    /**
     * 设置属性[引用数据集查询逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter refadpsdelogicname__eq(String value){
        this.setFieldCond("refadpsdelogicname", EQ, value);
        return this;
    }

    /**
     * 设置属性[引用数据集查询逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter refadpsdelogicname__like(String value){
        this.setFieldCond("refadpsdelogicname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[关联实体链接视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter reflinkpsdeviewid__eq(String value){
        this.setFieldCond("reflinkpsdeviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体链接视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter reflinkpsdeviewname__eq(String value){
        this.setFieldCond("reflinkpsdeviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体链接视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter reflinkpsdeviewname__like(String value){
        this.setFieldCond("reflinkpsdeviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[关联实体多选视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter refmpickuppsdeviewid__eq(String value){
        this.setFieldCond("refmpickuppsdeviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体多选视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter refmpickuppsdeviewname__eq(String value){
        this.setFieldCond("refmpickuppsdeviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体多选视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter refmpickuppsdeviewname__like(String value){
        this.setFieldCond("refmpickuppsdeviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[关联实体单选视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter refpickuppsdeviewid__eq(String value){
        this.setFieldCond("refpickuppsdeviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体单选视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter refpickuppsdeviewname__eq(String value){
        this.setFieldCond("refpickuppsdeviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体单选视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter refpickuppsdeviewname__like(String value){
        this.setFieldCond("refpickuppsdeviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[关联实体自填模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter refpsdeacmodeid__eq(String value){
        this.setFieldCond("refpsdeacmodeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体自填模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter refpsdeacmodename__eq(String value){
        this.setFieldCond("refpsdeacmodename", EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体自填模式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter refpsdeacmodename__like(String value){
        this.setFieldCond("refpsdeacmodename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[关联实体数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter refpsdedatasetid__eq(String value){
        this.setFieldCond("refpsdedatasetid", EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter refpsdedatasetname__eq(String value){
        this.setFieldCond("refpsdedatasetname", EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体数据集合]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter refpsdedatasetname__like(String value){
        this.setFieldCond("refpsdedatasetname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[关联实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter refpsdeid__eq(String value){
        this.setFieldCond("refpsdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter refpsdename__eq(String value){
        this.setFieldCond("refpsdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter refpsdename__like(String value){
        this.setFieldCond("refpsdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter refpsderid__eq(String value){
        this.setFieldCond("refpsderid", EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter refpsdername__eq(String value){
        this.setFieldCond("refpsdername", EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter refpsdername__like(String value){
        this.setFieldCond("refpsdername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[字符转换]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter stringcase__eq(String value){
        this.setFieldCond("stringcase", EQ, value);
        return this;
    }

    /**
     * 设置属性[更新默认值类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter updatedvt__eq(String value){
        this.setFieldCond("updatedvt", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
