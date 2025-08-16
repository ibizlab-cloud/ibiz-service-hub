package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEFUIMODE 过滤器对象
 */
public class PSDEFUIModeFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEFUIModeFilter(){
    
    }      

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter cappslanresid__eq(String value){
        this.setFieldCond("cappslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter cappslanresname__eq(String value){
        this.setFieldCond("cappslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter cappslanresname__like(String value){
        this.setFieldCond("cappslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[标题]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter caption__like(String value){
        this.setFieldCond("caption", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[输出代码表配置模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter codelistconfigmode__eq(Integer value){
        this.setFieldCond("codelistconfigmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[新建默认值类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter createdvt__eq(String value){
        this.setFieldCond("createdvt", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑器类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter editortype__eq(String value){
        this.setFieldCond("editortype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter ftmode__eq(String value){
        this.setFieldCond("ftmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[表格列绘制插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter gcrpssyspfpluginid__eq(String value){
        this.setFieldCond("gcrpssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[表格列绘制插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter gcrpssyspfpluginname__eq(String value){
        this.setFieldCond("gcrpssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[表格列绘制插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter gcrpssyspfpluginname__like(String value){
        this.setFieldCond("gcrpssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[表格列对齐]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter gridcolalign__eq(String value){
        this.setFieldCond("gridcolalign", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[表格列代码值转换]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter gridcolclmode__eq(String value){
        this.setFieldCond("gridcolclmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[忽略输入值]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter ignoreinput__eq(Integer value){
        this.setFieldCond("ignoreinput", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[项处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter itempsachandlerid__eq(String value){
        this.setFieldCond("itempsachandlerid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[占位提示语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter phpslanresid__eq(String value){
        this.setFieldCond("phpslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[占位提示语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter phpslanresname__eq(String value){
        this.setFieldCond("phpslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[占位提示语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter phpslanresname__like(String value){
        this.setFieldCond("phpslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter pscodelistid__eq(String value){
        this.setFieldCond("pscodelistid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter pscodelistname__eq(String value){
        this.setFieldCond("pscodelistname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter pscodelistname__like(String value){
        this.setFieldCond("pscodelistname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[属性界面模式名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter psdefuimodename__like(String value){
        this.setFieldCond("psdefuimodename", Conditions.LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("psdefformitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter psdefid__eq(String value){
        this.setFieldCond("psdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[属性输入提示]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter psdefinputtipid__eq(String value){
        this.setFieldCond("psdefinputtipid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[属性输入提示]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter psdefinputtipname__eq(String value){
        this.setFieldCond("psdefinputtipname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[属性输入提示]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter psdefinputtipname__like(String value){
        this.setFieldCond("psdefinputtipname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter psdefname__eq(String value){
        this.setFieldCond("psdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter psdefname__like(String value){
        this.setFieldCond("psdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[输入词条类别]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter pssysdictcatid__eq(String value){
        this.setFieldCond("pssysdictcatid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入词条类别]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter pssysdictcatname__eq(String value){
        this.setFieldCond("pssysdictcatname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入词条类别]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter pssysdictcatname__like(String value){
        this.setFieldCond("pssysdictcatname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[编辑器样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter pssyseditorstyleid__eq(String value){
        this.setFieldCond("pssyseditorstyleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑器样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter pssyseditorstylename__eq(String value){
        this.setFieldCond("pssyseditorstylename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑器样式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter pssyseditorstylename__like(String value){
        this.setFieldCond("pssyseditorstylename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[编辑项图片]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter pssysimageid__eq(String value){
        this.setFieldCond("pssysimageid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑项图片]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter pssysimagename__eq(String value){
        this.setFieldCond("pssysimagename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑项图片]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter pssysimagename__like(String value){
        this.setFieldCond("pssysimagename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[单位]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter pssysunitid__eq(String value){
        this.setFieldCond("pssysunitid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[单位]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter pssysunitname__eq(String value){
        this.setFieldCond("pssysunitname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[单位]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter pssysunitname__like(String value){
        this.setFieldCond("pssysunitname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用数据集查询逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter refadpsdelogicid__eq(String value){
        this.setFieldCond("refadpsdelogicid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用数据集查询逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter refadpsdelogicname__eq(String value){
        this.setFieldCond("refadpsdelogicname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用数据集查询逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter refadpsdelogicname__like(String value){
        this.setFieldCond("refadpsdelogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[关联实体链接视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter reflinkpsdeviewid__eq(String value){
        this.setFieldCond("reflinkpsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体链接视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter reflinkpsdeviewname__eq(String value){
        this.setFieldCond("reflinkpsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体链接视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter reflinkpsdeviewname__like(String value){
        this.setFieldCond("reflinkpsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[关联实体多选视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter refmpickuppsdeviewid__eq(String value){
        this.setFieldCond("refmpickuppsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体多选视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter refmpickuppsdeviewname__eq(String value){
        this.setFieldCond("refmpickuppsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体多选视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter refmpickuppsdeviewname__like(String value){
        this.setFieldCond("refmpickuppsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[关联实体单选视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter refpickuppsdeviewid__eq(String value){
        this.setFieldCond("refpickuppsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体单选视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter refpickuppsdeviewname__eq(String value){
        this.setFieldCond("refpickuppsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体单选视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter refpickuppsdeviewname__like(String value){
        this.setFieldCond("refpickuppsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[关联实体自填模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter refpsdeacmodeid__eq(String value){
        this.setFieldCond("refpsdeacmodeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体自填模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter refpsdeacmodename__eq(String value){
        this.setFieldCond("refpsdeacmodename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体自填模式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter refpsdeacmodename__like(String value){
        this.setFieldCond("refpsdeacmodename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[关联实体数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter refpsdedatasetid__eq(String value){
        this.setFieldCond("refpsdedatasetid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter refpsdedatasetname__eq(String value){
        this.setFieldCond("refpsdedatasetname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体数据集合]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter refpsdedatasetname__like(String value){
        this.setFieldCond("refpsdedatasetname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[关联实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter refpsdeid__eq(String value){
        this.setFieldCond("refpsdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter refpsdename__eq(String value){
        this.setFieldCond("refpsdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关联实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter refpsdename__like(String value){
        this.setFieldCond("refpsdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter refpsderid__eq(String value){
        this.setFieldCond("refpsderid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter refpsdername__eq(String value){
        this.setFieldCond("refpsdername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter refpsdername__like(String value){
        this.setFieldCond("refpsdername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[字符转换]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter stringcase__eq(String value){
        this.setFieldCond("stringcase", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[更新默认值类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter updatedvt__eq(String value){
        this.setFieldCond("updatedvt", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFUIModeFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
