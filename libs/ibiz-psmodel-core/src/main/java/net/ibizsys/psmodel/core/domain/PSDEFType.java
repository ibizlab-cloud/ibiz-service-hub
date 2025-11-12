package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEFTYPE</B>实体属性类型 模型传输对象
 * <P>
 * 
 */
public class PSDEFType extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEFType(){
    }      

    /**
     * <B>CREATEDATE</B>&nbsp;建立时间
     */
    public final static String FIELD_CREATEDATE = "createdate";

    /**
     * 设置 建立时间
     * 
     * @param createDate
     * 
     */
    @JsonProperty(FIELD_CREATEDATE)
    public void setCreateDate(String createDate){
        this.set(FIELD_CREATEDATE, createDate);
    }
    
    /**
     * 获取 建立时间  
     * @return
     */
    @JsonIgnore
    public String getCreateDate(){
        Object objValue = this.get(FIELD_CREATEDATE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 建立时间 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCreateDateDirty(){
        if(this.contains(FIELD_CREATEDATE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 建立时间
     */
    @JsonIgnore
    public void resetCreateDate(){
        this.reset(FIELD_CREATEDATE);
    }

    /**
     * 设置 建立时间
     * <P>
     * 等同 {@link #setCreateDate}
     * @param createDate
     */
    @JsonIgnore
    public PSDEFType createdate(String createDate){
        this.setCreateDate(createDate);
        return this;
    }

    /**
     * <B>CREATEMAN</B>&nbsp;建立人
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_CREATEMAN = "createman";

    /**
     * 设置 建立人
     * 
     * @param createMan
     * 
     */
    @JsonProperty(FIELD_CREATEMAN)
    public void setCreateMan(String createMan){
        this.set(FIELD_CREATEMAN, createMan);
    }
    
    /**
     * 获取 建立人  
     * @return
     */
    @JsonIgnore
    public String getCreateMan(){
        Object objValue = this.get(FIELD_CREATEMAN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 建立人 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCreateManDirty(){
        if(this.contains(FIELD_CREATEMAN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 建立人
     */
    @JsonIgnore
    public void resetCreateMan(){
        this.reset(FIELD_CREATEMAN);
    }

    /**
     * 设置 建立人
     * <P>
     * 等同 {@link #setCreateMan}
     * @param createMan
     */
    @JsonIgnore
    public PSDEFType createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DATATYPES</B>&nbsp;支持数据类型
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_DATATYPES = "datatypes";

    /**
     * 设置 支持数据类型
     * 
     * @param dataTypes
     * 
     */
    @JsonProperty(FIELD_DATATYPES)
    public void setDataTypes(String dataTypes){
        this.set(FIELD_DATATYPES, dataTypes);
    }
    
    /**
     * 获取 支持数据类型  
     * @return
     */
    @JsonIgnore
    public String getDataTypes(){
        Object objValue = this.get(FIELD_DATATYPES);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 支持数据类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDataTypesDirty(){
        if(this.contains(FIELD_DATATYPES)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持数据类型
     */
    @JsonIgnore
    public void resetDataTypes(){
        this.reset(FIELD_DATATYPES);
    }

    /**
     * 设置 支持数据类型
     * <P>
     * 等同 {@link #setDataTypes}
     * @param dataTypes
     */
    @JsonIgnore
    public PSDEFType datatypes(String dataTypes){
        this.setDataTypes(dataTypes);
        return this;
    }

    /**
     * <B>DOTNETFORMAT</B>&nbsp;.NET格式化
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_DOTNETFORMAT = "dotnetformat";

    /**
     * 设置 .NET格式化
     * 
     * @param dotNETFormat
     * 
     */
    @JsonProperty(FIELD_DOTNETFORMAT)
    public void setDotNETFormat(String dotNETFormat){
        this.set(FIELD_DOTNETFORMAT, dotNETFormat);
    }
    
    /**
     * 获取 .NET格式化  
     * @return
     */
    @JsonIgnore
    public String getDotNETFormat(){
        Object objValue = this.get(FIELD_DOTNETFORMAT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 .NET格式化 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDotNETFormatDirty(){
        if(this.contains(FIELD_DOTNETFORMAT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 .NET格式化
     */
    @JsonIgnore
    public void resetDotNETFormat(){
        this.reset(FIELD_DOTNETFORMAT);
    }

    /**
     * 设置 .NET格式化
     * <P>
     * 等同 {@link #setDotNETFormat}
     * @param dotNETFormat
     */
    @JsonIgnore
    public PSDEFType dotnetformat(String dotNETFormat){
        this.setDotNETFormat(dotNETFormat);
        return this;
    }

    /**
     * <B>EDITORHEIGHT</B>&nbsp;编辑器高度
     */
    public final static String FIELD_EDITORHEIGHT = "editorheight";

    /**
     * 设置 编辑器高度
     * 
     * @param editorHeight
     * 
     */
    @JsonProperty(FIELD_EDITORHEIGHT)
    public void setEditorHeight(Integer editorHeight){
        this.set(FIELD_EDITORHEIGHT, editorHeight);
    }
    
    /**
     * 获取 编辑器高度  
     * @return
     */
    @JsonIgnore
    public Integer getEditorHeight(){
        Object objValue = this.get(FIELD_EDITORHEIGHT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 编辑器高度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEditorHeightDirty(){
        if(this.contains(FIELD_EDITORHEIGHT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 编辑器高度
     */
    @JsonIgnore
    public void resetEditorHeight(){
        this.reset(FIELD_EDITORHEIGHT);
    }

    /**
     * 设置 编辑器高度
     * <P>
     * 等同 {@link #setEditorHeight}
     * @param editorHeight
     */
    @JsonIgnore
    public PSDEFType editorheight(Integer editorHeight){
        this.setEditorHeight(editorHeight);
        return this;
    }

    /**
     * <B>EDITORTYPE</B>&nbsp;编辑器类型
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_EDITORTYPE = "editortype";

    /**
     * 设置 编辑器类型
     * 
     * @param editorType
     * 
     */
    @JsonProperty(FIELD_EDITORTYPE)
    public void setEditorType(String editorType){
        this.set(FIELD_EDITORTYPE, editorType);
    }
    
    /**
     * 获取 编辑器类型  
     * @return
     */
    @JsonIgnore
    public String getEditorType(){
        Object objValue = this.get(FIELD_EDITORTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 编辑器类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEditorTypeDirty(){
        if(this.contains(FIELD_EDITORTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 编辑器类型
     */
    @JsonIgnore
    public void resetEditorType(){
        this.reset(FIELD_EDITORTYPE);
    }

    /**
     * 设置 编辑器类型
     * <P>
     * 等同 {@link #setEditorType}
     * @param editorType
     */
    @JsonIgnore
    public PSDEFType editortype(String editorType){
        this.setEditorType(editorType);
        return this;
    }

    /**
     * <B>EDITORWIDTH</B>&nbsp;编辑器宽度
     */
    public final static String FIELD_EDITORWIDTH = "editorwidth";

    /**
     * 设置 编辑器宽度
     * 
     * @param editorWidth
     * 
     */
    @JsonProperty(FIELD_EDITORWIDTH)
    public void setEditorWidth(Integer editorWidth){
        this.set(FIELD_EDITORWIDTH, editorWidth);
    }
    
    /**
     * 获取 编辑器宽度  
     * @return
     */
    @JsonIgnore
    public Integer getEditorWidth(){
        Object objValue = this.get(FIELD_EDITORWIDTH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 编辑器宽度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEditorWidthDirty(){
        if(this.contains(FIELD_EDITORWIDTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 编辑器宽度
     */
    @JsonIgnore
    public void resetEditorWidth(){
        this.reset(FIELD_EDITORWIDTH);
    }

    /**
     * 设置 编辑器宽度
     * <P>
     * 等同 {@link #setEditorWidth}
     * @param editorWidth
     */
    @JsonIgnore
    public PSDEFType editorwidth(Integer editorWidth){
        this.setEditorWidth(editorWidth);
        return this;
    }

    /**
     * <B>FIELDS</B>&nbsp;属性名称
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_FIELDS = "fields";

    /**
     * 设置 属性名称
     * 
     * @param fields
     * 
     */
    @JsonProperty(FIELD_FIELDS)
    public void setFields(String fields){
        this.set(FIELD_FIELDS, fields);
    }
    
    /**
     * 获取 属性名称  
     * @return
     */
    @JsonIgnore
    public String getFields(){
        Object objValue = this.get(FIELD_FIELDS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFieldsDirty(){
        if(this.contains(FIELD_FIELDS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性名称
     */
    @JsonIgnore
    public void resetFields(){
        this.reset(FIELD_FIELDS);
    }

    /**
     * 设置 属性名称
     * <P>
     * 等同 {@link #setFields}
     * @param fields
     */
    @JsonIgnore
    public PSDEFType fields(String fields){
        this.setFields(fields);
        return this;
    }

    /**
     * <B>FORMITEMOBJ</B>&nbsp;属性表单项对象
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_FORMITEMOBJ = "formitemobj";

    /**
     * 设置 属性表单项对象
     * 
     * @param formItemObj
     * 
     */
    @JsonProperty(FIELD_FORMITEMOBJ)
    public void setFormItemObj(String formItemObj){
        this.set(FIELD_FORMITEMOBJ, formItemObj);
    }
    
    /**
     * 获取 属性表单项对象  
     * @return
     */
    @JsonIgnore
    public String getFormItemObj(){
        Object objValue = this.get(FIELD_FORMITEMOBJ);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性表单项对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFormItemObjDirty(){
        if(this.contains(FIELD_FORMITEMOBJ)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性表单项对象
     */
    @JsonIgnore
    public void resetFormItemObj(){
        this.reset(FIELD_FORMITEMOBJ);
    }

    /**
     * 设置 属性表单项对象
     * <P>
     * 等同 {@link #setFormItemObj}
     * @param formItemObj
     */
    @JsonIgnore
    public PSDEFType formitemobj(String formItemObj){
        this.setFormItemObj(formItemObj);
        return this;
    }

    /**
     * <B>GRIDCOLALIGN</B>&nbsp;表格列对齐
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.GridColAlign} 
     */
    public final static String FIELD_GRIDCOLALIGN = "gridcolalign";

    /**
     * 设置 表格列对齐
     * 
     * @param gridColAlign
     * 
     */
    @JsonProperty(FIELD_GRIDCOLALIGN)
    public void setGridColAlign(String gridColAlign){
        this.set(FIELD_GRIDCOLALIGN, gridColAlign);
    }
    
    /**
     * 获取 表格列对齐  
     * @return
     */
    @JsonIgnore
    public String getGridColAlign(){
        Object objValue = this.get(FIELD_GRIDCOLALIGN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表格列对齐 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGridColAlignDirty(){
        if(this.contains(FIELD_GRIDCOLALIGN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表格列对齐
     */
    @JsonIgnore
    public void resetGridColAlign(){
        this.reset(FIELD_GRIDCOLALIGN);
    }

    /**
     * 设置 表格列对齐
     * <P>
     * 等同 {@link #setGridColAlign}
     * @param gridColAlign
     */
    @JsonIgnore
    public PSDEFType gridcolalign(String gridColAlign){
        this.setGridColAlign(gridColAlign);
        return this;
    }

     /**
     * 设置 表格列对齐
     * <P>
     * 等同 {@link #setGridColAlign}
     * @param gridColAlign
     */
    @JsonIgnore
    public PSDEFType gridcolalign(net.ibizsys.psmodel.core.util.PSModelEnums.GridColAlign gridColAlign){
        if(gridColAlign == null){
            this.setGridColAlign(null);
        }
        else{
            this.setGridColAlign(gridColAlign.value);
        }
        return this;
    }

    /**
     * <B>GRIDCOLCLMODE</B>&nbsp;表格列代码值转换
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.CodeListConvertMode} 
     */
    public final static String FIELD_GRIDCOLCLMODE = "gridcolclmode";

    /**
     * 设置 表格列代码值转换
     * 
     * @param gridColCLMode
     * 
     */
    @JsonProperty(FIELD_GRIDCOLCLMODE)
    public void setGridColCLMode(String gridColCLMode){
        this.set(FIELD_GRIDCOLCLMODE, gridColCLMode);
    }
    
    /**
     * 获取 表格列代码值转换  
     * @return
     */
    @JsonIgnore
    public String getGridColCLMode(){
        Object objValue = this.get(FIELD_GRIDCOLCLMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表格列代码值转换 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGridColCLModeDirty(){
        if(this.contains(FIELD_GRIDCOLCLMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表格列代码值转换
     */
    @JsonIgnore
    public void resetGridColCLMode(){
        this.reset(FIELD_GRIDCOLCLMODE);
    }

    /**
     * 设置 表格列代码值转换
     * <P>
     * 等同 {@link #setGridColCLMode}
     * @param gridColCLMode
     */
    @JsonIgnore
    public PSDEFType gridcolclmode(String gridColCLMode){
        this.setGridColCLMode(gridColCLMode);
        return this;
    }

     /**
     * 设置 表格列代码值转换
     * <P>
     * 等同 {@link #setGridColCLMode}
     * @param gridColCLMode
     */
    @JsonIgnore
    public PSDEFType gridcolclmode(net.ibizsys.psmodel.core.util.PSModelEnums.CodeListConvertMode gridColCLMode){
        if(gridColCLMode == null){
            this.setGridColCLMode(null);
        }
        else{
            this.setGridColCLMode(gridColCLMode.value);
        }
        return this;
    }

    /**
     * <B>GRIDCOLOBJ</B>&nbsp;属性表格列对象
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_GRIDCOLOBJ = "gridcolobj";

    /**
     * 设置 属性表格列对象
     * 
     * @param gridColObj
     * 
     */
    @JsonProperty(FIELD_GRIDCOLOBJ)
    public void setGridColObj(String gridColObj){
        this.set(FIELD_GRIDCOLOBJ, gridColObj);
    }
    
    /**
     * 获取 属性表格列对象  
     * @return
     */
    @JsonIgnore
    public String getGridColObj(){
        Object objValue = this.get(FIELD_GRIDCOLOBJ);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性表格列对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGridColObjDirty(){
        if(this.contains(FIELD_GRIDCOLOBJ)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性表格列对象
     */
    @JsonIgnore
    public void resetGridColObj(){
        this.reset(FIELD_GRIDCOLOBJ);
    }

    /**
     * 设置 属性表格列对象
     * <P>
     * 等同 {@link #setGridColObj}
     * @param gridColObj
     */
    @JsonIgnore
    public PSDEFType gridcolobj(String gridColObj){
        this.setGridColObj(gridColObj);
        return this;
    }

    /**
     * <B>GRIDCOLWIDTH</B>&nbsp;默认列宽
     */
    public final static String FIELD_GRIDCOLWIDTH = "gridcolwidth";

    /**
     * 设置 默认列宽
     * 
     * @param gridColWidth
     * 
     */
    @JsonProperty(FIELD_GRIDCOLWIDTH)
    public void setGridColWidth(Integer gridColWidth){
        this.set(FIELD_GRIDCOLWIDTH, gridColWidth);
    }
    
    /**
     * 获取 默认列宽  
     * @return
     */
    @JsonIgnore
    public Integer getGridColWidth(){
        Object objValue = this.get(FIELD_GRIDCOLWIDTH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认列宽 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGridColWidthDirty(){
        if(this.contains(FIELD_GRIDCOLWIDTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认列宽
     */
    @JsonIgnore
    public void resetGridColWidth(){
        this.reset(FIELD_GRIDCOLWIDTH);
    }

    /**
     * 设置 默认列宽
     * <P>
     * 等同 {@link #setGridColWidth}
     * @param gridColWidth
     */
    @JsonIgnore
    public PSDEFType gridcolwidth(Integer gridColWidth){
        this.setGridColWidth(gridColWidth);
        return this;
    }

    /**
     * <B>ICONPATH</B>&nbsp;图标路径
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_ICONPATH = "iconpath";

    /**
     * 设置 图标路径
     * 
     * @param iconPath
     * 
     */
    @JsonProperty(FIELD_ICONPATH)
    public void setIconPath(String iconPath){
        this.set(FIELD_ICONPATH, iconPath);
    }
    
    /**
     * 获取 图标路径  
     * @return
     */
    @JsonIgnore
    public String getIconPath(){
        Object objValue = this.get(FIELD_ICONPATH);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 图标路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIconPathDirty(){
        if(this.contains(FIELD_ICONPATH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图标路径
     */
    @JsonIgnore
    public void resetIconPath(){
        this.reset(FIELD_ICONPATH);
    }

    /**
     * 设置 图标路径
     * <P>
     * 等同 {@link #setIconPath}
     * @param iconPath
     */
    @JsonIgnore
    public PSDEFType iconpath(String iconPath){
        this.setIconPath(iconPath);
        return this;
    }

    /**
     * <B>INCREMENTFLAG</B>&nbsp;是否自增
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_INCREMENTFLAG = "incrementflag";

    /**
     * 设置 是否自增
     * 
     * @param incrementFlag
     * 
     */
    @JsonProperty(FIELD_INCREMENTFLAG)
    public void setIncrementFlag(Integer incrementFlag){
        this.set(FIELD_INCREMENTFLAG, incrementFlag);
    }
    
    /**
     * 获取 是否自增  
     * @return
     */
    @JsonIgnore
    public Integer getIncrementFlag(){
        Object objValue = this.get(FIELD_INCREMENTFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 是否自增 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIncrementFlagDirty(){
        if(this.contains(FIELD_INCREMENTFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 是否自增
     */
    @JsonIgnore
    public void resetIncrementFlag(){
        this.reset(FIELD_INCREMENTFLAG);
    }

    /**
     * 设置 是否自增
     * <P>
     * 等同 {@link #setIncrementFlag}
     * @param incrementFlag
     */
    @JsonIgnore
    public PSDEFType incrementflag(Integer incrementFlag){
        this.setIncrementFlag(incrementFlag);
        return this;
    }

     /**
     * 设置 是否自增
     * <P>
     * 等同 {@link #setIncrementFlag}
     * @param incrementFlag
     */
    @JsonIgnore
    public PSDEFType incrementflag(Boolean incrementFlag){
        if(incrementFlag == null){
            this.setIncrementFlag(null);
        }
        else{
            this.setIncrementFlag(incrementFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>JAVAFORMAT</B>&nbsp;JAVA格式化
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_JAVAFORMAT = "javaformat";

    /**
     * 设置 JAVA格式化
     * 
     * @param jAVAFormat
     * 
     */
    @JsonProperty(FIELD_JAVAFORMAT)
    public void setJAVAFormat(String jAVAFormat){
        this.set(FIELD_JAVAFORMAT, jAVAFormat);
    }
    
    /**
     * 获取 JAVA格式化  
     * @return
     */
    @JsonIgnore
    public String getJAVAFormat(){
        Object objValue = this.get(FIELD_JAVAFORMAT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 JAVA格式化 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isJAVAFormatDirty(){
        if(this.contains(FIELD_JAVAFORMAT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 JAVA格式化
     */
    @JsonIgnore
    public void resetJAVAFormat(){
        this.reset(FIELD_JAVAFORMAT);
    }

    /**
     * 设置 JAVA格式化
     * <P>
     * 等同 {@link #setJAVAFormat}
     * @param jAVAFormat
     */
    @JsonIgnore
    public PSDEFType javaformat(String jAVAFormat){
        this.setJAVAFormat(jAVAFormat);
        return this;
    }

    /**
     * <B>JSFORMAT</B>&nbsp;JS格式化
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_JSFORMAT = "jsformat";

    /**
     * 设置 JS格式化
     * 
     * @param jSFormat
     * 
     */
    @JsonProperty(FIELD_JSFORMAT)
    public void setJSFormat(String jSFormat){
        this.set(FIELD_JSFORMAT, jSFormat);
    }
    
    /**
     * 获取 JS格式化  
     * @return
     */
    @JsonIgnore
    public String getJSFormat(){
        Object objValue = this.get(FIELD_JSFORMAT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 JS格式化 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isJSFormatDirty(){
        if(this.contains(FIELD_JSFORMAT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 JS格式化
     */
    @JsonIgnore
    public void resetJSFormat(){
        this.reset(FIELD_JSFORMAT);
    }

    /**
     * 设置 JS格式化
     * <P>
     * 等同 {@link #setJSFormat}
     * @param jSFormat
     */
    @JsonIgnore
    public PSDEFType jsformat(String jSFormat){
        this.setJSFormat(jSFormat);
        return this;
    }

    /**
     * <B>MAXVALUESTR</B>&nbsp;最大值
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_MAXVALUESTR = "maxvaluestr";

    /**
     * 设置 最大值
     * 
     * @param maxValueStr
     * 
     */
    @JsonProperty(FIELD_MAXVALUESTR)
    public void setMaxValueStr(String maxValueStr){
        this.set(FIELD_MAXVALUESTR, maxValueStr);
    }
    
    /**
     * 获取 最大值  
     * @return
     */
    @JsonIgnore
    public String getMaxValueStr(){
        Object objValue = this.get(FIELD_MAXVALUESTR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 最大值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMaxValueStrDirty(){
        if(this.contains(FIELD_MAXVALUESTR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 最大值
     */
    @JsonIgnore
    public void resetMaxValueStr(){
        this.reset(FIELD_MAXVALUESTR);
    }

    /**
     * 设置 最大值
     * <P>
     * 等同 {@link #setMaxValueStr}
     * @param maxValueStr
     */
    @JsonIgnore
    public PSDEFType maxvaluestr(String maxValueStr){
        this.setMaxValueStr(maxValueStr);
        return this;
    }

    /**
     * <B>MBEDITORHEIGHT</B>&nbsp;编辑器高度
     */
    public final static String FIELD_MBEDITORHEIGHT = "mbeditorheight";

    /**
     * 设置 编辑器高度
     * 
     * @param mBEditorHeight
     * 
     */
    @JsonProperty(FIELD_MBEDITORHEIGHT)
    public void setMBEditorHeight(Integer mBEditorHeight){
        this.set(FIELD_MBEDITORHEIGHT, mBEditorHeight);
    }
    
    /**
     * 获取 编辑器高度  
     * @return
     */
    @JsonIgnore
    public Integer getMBEditorHeight(){
        Object objValue = this.get(FIELD_MBEDITORHEIGHT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 编辑器高度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMBEditorHeightDirty(){
        if(this.contains(FIELD_MBEDITORHEIGHT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 编辑器高度
     */
    @JsonIgnore
    public void resetMBEditorHeight(){
        this.reset(FIELD_MBEDITORHEIGHT);
    }

    /**
     * 设置 编辑器高度
     * <P>
     * 等同 {@link #setMBEditorHeight}
     * @param mBEditorHeight
     */
    @JsonIgnore
    public PSDEFType mbeditorheight(Integer mBEditorHeight){
        this.setMBEditorHeight(mBEditorHeight);
        return this;
    }

    /**
     * <B>MBEDITORTYPE</B>&nbsp;移动端编辑器类型
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_MBEDITORTYPE = "mbeditortype";

    /**
     * 设置 移动端编辑器类型
     * 
     * @param mBEditorType
     * 
     */
    @JsonProperty(FIELD_MBEDITORTYPE)
    public void setMBEditorType(String mBEditorType){
        this.set(FIELD_MBEDITORTYPE, mBEditorType);
    }
    
    /**
     * 获取 移动端编辑器类型  
     * @return
     */
    @JsonIgnore
    public String getMBEditorType(){
        Object objValue = this.get(FIELD_MBEDITORTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端编辑器类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMBEditorTypeDirty(){
        if(this.contains(FIELD_MBEDITORTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端编辑器类型
     */
    @JsonIgnore
    public void resetMBEditorType(){
        this.reset(FIELD_MBEDITORTYPE);
    }

    /**
     * 设置 移动端编辑器类型
     * <P>
     * 等同 {@link #setMBEditorType}
     * @param mBEditorType
     */
    @JsonIgnore
    public PSDEFType mbeditortype(String mBEditorType){
        this.setMBEditorType(mBEditorType);
        return this;
    }

    /**
     * <B>MBEDITORWIDTH</B>&nbsp;编辑器宽度
     */
    public final static String FIELD_MBEDITORWIDTH = "mbeditorwidth";

    /**
     * 设置 编辑器宽度
     * 
     * @param mBEditorWidth
     * 
     */
    @JsonProperty(FIELD_MBEDITORWIDTH)
    public void setMBEditorWidth(Integer mBEditorWidth){
        this.set(FIELD_MBEDITORWIDTH, mBEditorWidth);
    }
    
    /**
     * 获取 编辑器宽度  
     * @return
     */
    @JsonIgnore
    public Integer getMBEditorWidth(){
        Object objValue = this.get(FIELD_MBEDITORWIDTH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 编辑器宽度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMBEditorWidthDirty(){
        if(this.contains(FIELD_MBEDITORWIDTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 编辑器宽度
     */
    @JsonIgnore
    public void resetMBEditorWidth(){
        this.reset(FIELD_MBEDITORWIDTH);
    }

    /**
     * 设置 编辑器宽度
     * <P>
     * 等同 {@link #setMBEditorWidth}
     * @param mBEditorWidth
     */
    @JsonIgnore
    public PSDEFType mbeditorwidth(Integer mBEditorWidth){
        this.setMBEditorWidth(mBEditorWidth);
        return this;
    }

    /**
     * <B>MEMO</B>&nbsp;备注
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_MEMO = "memo";

    /**
     * 设置 备注
     * 
     * @param memo
     * 
     */
    @JsonProperty(FIELD_MEMO)
    public void setMemo(String memo){
        this.set(FIELD_MEMO, memo);
    }
    
    /**
     * 获取 备注  
     * @return
     */
    @JsonIgnore
    public String getMemo(){
        Object objValue = this.get(FIELD_MEMO);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 备注 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMemoDirty(){
        if(this.contains(FIELD_MEMO)){
            return true;
        }
        return false;
    }

    /**
     * 重置 备注
     */
    @JsonIgnore
    public void resetMemo(){
        this.reset(FIELD_MEMO);
    }

    /**
     * 设置 备注
     * <P>
     * 等同 {@link #setMemo}
     * @param memo
     */
    @JsonIgnore
    public PSDEFType memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MINSTRLENGTH</B>&nbsp;最小字符长度
     */
    public final static String FIELD_MINSTRLENGTH = "minstrlength";

    /**
     * 设置 最小字符长度
     * 
     * @param minStrLength
     * 
     */
    @JsonProperty(FIELD_MINSTRLENGTH)
    public void setMinStrLength(Integer minStrLength){
        this.set(FIELD_MINSTRLENGTH, minStrLength);
    }
    
    /**
     * 获取 最小字符长度  
     * @return
     */
    @JsonIgnore
    public Integer getMinStrLength(){
        Object objValue = this.get(FIELD_MINSTRLENGTH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 最小字符长度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinStrLengthDirty(){
        if(this.contains(FIELD_MINSTRLENGTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 最小字符长度
     */
    @JsonIgnore
    public void resetMinStrLength(){
        this.reset(FIELD_MINSTRLENGTH);
    }

    /**
     * 设置 最小字符长度
     * <P>
     * 等同 {@link #setMinStrLength}
     * @param minStrLength
     */
    @JsonIgnore
    public PSDEFType minstrlength(Integer minStrLength){
        this.setMinStrLength(minStrLength);
        return this;
    }

    /**
     * <B>MINVALUESTR</B>&nbsp;最小值
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_MINVALUESTR = "minvaluestr";

    /**
     * 设置 最小值
     * 
     * @param minValueStr
     * 
     */
    @JsonProperty(FIELD_MINVALUESTR)
    public void setMinValueStr(String minValueStr){
        this.set(FIELD_MINVALUESTR, minValueStr);
    }
    
    /**
     * 获取 最小值  
     * @return
     */
    @JsonIgnore
    public String getMinValueStr(){
        Object objValue = this.get(FIELD_MINVALUESTR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 最小值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinValueStrDirty(){
        if(this.contains(FIELD_MINVALUESTR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 最小值
     */
    @JsonIgnore
    public void resetMinValueStr(){
        this.reset(FIELD_MINVALUESTR);
    }

    /**
     * 设置 最小值
     * <P>
     * 等同 {@link #setMinValueStr}
     * @param minValueStr
     */
    @JsonIgnore
    public PSDEFType minvaluestr(String minValueStr){
        this.setMinValueStr(minValueStr);
        return this;
    }

    /**
     * <B>OBJHELPER</B>&nbsp;属性处理对象
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_OBJHELPER = "objhelper";

    /**
     * 设置 属性处理对象
     * 
     * @param objHelper
     * 
     */
    @JsonProperty(FIELD_OBJHELPER)
    public void setObjHelper(String objHelper){
        this.set(FIELD_OBJHELPER, objHelper);
    }
    
    /**
     * 获取 属性处理对象  
     * @return
     */
    @JsonIgnore
    public String getObjHelper(){
        Object objValue = this.get(FIELD_OBJHELPER);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性处理对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isObjHelperDirty(){
        if(this.contains(FIELD_OBJHELPER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性处理对象
     */
    @JsonIgnore
    public void resetObjHelper(){
        this.reset(FIELD_OBJHELPER);
    }

    /**
     * 设置 属性处理对象
     * <P>
     * 等同 {@link #setObjHelper}
     * @param objHelper
     */
    @JsonIgnore
    public PSDEFType objhelper(String objHelper){
        this.setObjHelper(objHelper);
        return this;
    }

    /**
     * <B>OBJHELPER2</B>&nbsp;扩展处理对象
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_OBJHELPER2 = "objhelper2";

    /**
     * 设置 扩展处理对象
     * 
     * @param objHelper2
     * 
     */
    @JsonProperty(FIELD_OBJHELPER2)
    public void setObjHelper2(String objHelper2){
        this.set(FIELD_OBJHELPER2, objHelper2);
    }
    
    /**
     * 获取 扩展处理对象  
     * @return
     */
    @JsonIgnore
    public String getObjHelper2(){
        Object objValue = this.get(FIELD_OBJHELPER2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 扩展处理对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isObjHelper2Dirty(){
        if(this.contains(FIELD_OBJHELPER2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 扩展处理对象
     */
    @JsonIgnore
    public void resetObjHelper2(){
        this.reset(FIELD_OBJHELPER2);
    }

    /**
     * 设置 扩展处理对象
     * <P>
     * 等同 {@link #setObjHelper2}
     * @param objHelper2
     */
    @JsonIgnore
    public PSDEFType objhelper2(String objHelper2){
        this.setObjHelper2(objHelper2);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;处理次序
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 处理次序
     * 
     * @param orderValue
     * 
     */
    @JsonProperty(FIELD_ORDERVALUE)
    public void setOrderValue(Integer orderValue){
        this.set(FIELD_ORDERVALUE, orderValue);
    }
    
    /**
     * 获取 处理次序  
     * @return
     */
    @JsonIgnore
    public Integer getOrderValue(){
        Object objValue = this.get(FIELD_ORDERVALUE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 处理次序 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOrderValueDirty(){
        if(this.contains(FIELD_ORDERVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 处理次序
     */
    @JsonIgnore
    public void resetOrderValue(){
        this.reset(FIELD_ORDERVALUE);
    }

    /**
     * 设置 处理次序
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSDEFType ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>SCALE</B>&nbsp;小数位数
     */
    public final static String FIELD_SCALE = "scale";

    /**
     * 设置 小数位数
     * 
     * @param scale
     * 
     */
    @JsonProperty(FIELD_SCALE)
    public void setScale(Integer scale){
        this.set(FIELD_SCALE, scale);
        //属性名称与代码标识不一致，设置属性名称
        this.set("precision2", scale);
    }
    
    /**
     * 获取 小数位数  
     * @return
     */
    @JsonIgnore
    public Integer getScale(){
        Object objValue = this.get(FIELD_SCALE);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("precision2");
            if(objValue == null){
                return null;
            }
        }
        return (Integer)objValue;
    }

    /**
     * 判断 小数位数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isScaleDirty(){
        if(this.contains(FIELD_SCALE)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("precision2")){
            return true;
        }
        return false;
    }

    /**
     * 重置 小数位数
     */
    @JsonIgnore
    public void resetScale(){
        this.reset(FIELD_SCALE);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("precision2");
    }

    /**
     * 设置 小数位数
     * <P>
     * 等同 {@link #setScale}
     * @param scale
     */
    @JsonIgnore
    public PSDEFType scale(Integer scale){
        this.setScale(scale);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public Integer getPrecision2(){
        return this.getScale();
    }

    @JsonIgnore
    @Deprecated        
    public void setPrecision2(Integer precision2){
        this.setScale(precision2);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPrecision2Dirty(){
        return this.isScaleDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPrecision2(){
        this.resetScale();
    }

    /**
     * <B>PSCODELISTTEMPLID</B>&nbsp;云平台代码表模版
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSCODELISTTEMPLID = "pscodelisttemplid";

    /**
     * 设置 云平台代码表模版
     * 
     * @param pSCodeListTemplId
     * 
     */
    @JsonProperty(FIELD_PSCODELISTTEMPLID)
    public void setPSCodeListTemplId(String pSCodeListTemplId){
        this.set(FIELD_PSCODELISTTEMPLID, pSCodeListTemplId);
    }
    
    /**
     * 获取 云平台代码表模版  
     * @return
     */
    @JsonIgnore
    public String getPSCodeListTemplId(){
        Object objValue = this.get(FIELD_PSCODELISTTEMPLID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 云平台代码表模版 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCodeListTemplIdDirty(){
        if(this.contains(FIELD_PSCODELISTTEMPLID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 云平台代码表模版
     */
    @JsonIgnore
    public void resetPSCodeListTemplId(){
        this.reset(FIELD_PSCODELISTTEMPLID);
    }

    /**
     * 设置 云平台代码表模版
     * <P>
     * 等同 {@link #setPSCodeListTemplId}
     * @param pSCodeListTemplId
     */
    @JsonIgnore
    public PSDEFType pscodelisttemplid(String pSCodeListTemplId){
        this.setPSCodeListTemplId(pSCodeListTemplId);
        return this;
    }

    /**
     * <B>PSCODELISTTEMPLNAME</B>&nbsp;云平台代码表模版
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCODELISTTEMPLID}
     */
    public final static String FIELD_PSCODELISTTEMPLNAME = "pscodelisttemplname";

    /**
     * 设置 云平台代码表模版
     * 
     * @param pSCodeListTemplName
     * 
     */
    @JsonProperty(FIELD_PSCODELISTTEMPLNAME)
    public void setPSCodeListTemplName(String pSCodeListTemplName){
        this.set(FIELD_PSCODELISTTEMPLNAME, pSCodeListTemplName);
    }
    
    /**
     * 获取 云平台代码表模版  
     * @return
     */
    @JsonIgnore
    public String getPSCodeListTemplName(){
        Object objValue = this.get(FIELD_PSCODELISTTEMPLNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 云平台代码表模版 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCodeListTemplNameDirty(){
        if(this.contains(FIELD_PSCODELISTTEMPLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 云平台代码表模版
     */
    @JsonIgnore
    public void resetPSCodeListTemplName(){
        this.reset(FIELD_PSCODELISTTEMPLNAME);
    }

    /**
     * 设置 云平台代码表模版
     * <P>
     * 等同 {@link #setPSCodeListTemplName}
     * @param pSCodeListTemplName
     */
    @JsonIgnore
    public PSDEFType pscodelisttemplname(String pSCodeListTemplName){
        this.setPSCodeListTemplName(pSCodeListTemplName);
        return this;
    }

    /**
     * <B>PSDEFTYPEID</B>&nbsp;实体属性类型标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEFTYPEID = "psdeftypeid";

    /**
     * 设置 实体属性类型标识
     * 
     * @param pSDEFTypeId
     * 
     */
    @JsonProperty(FIELD_PSDEFTYPEID)
    public void setPSDEFTypeId(String pSDEFTypeId){
        this.set(FIELD_PSDEFTYPEID, pSDEFTypeId);
    }
    
    /**
     * 获取 实体属性类型标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEFTypeId(){
        Object objValue = this.get(FIELD_PSDEFTYPEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体属性类型标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFTypeIdDirty(){
        if(this.contains(FIELD_PSDEFTYPEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体属性类型标识
     */
    @JsonIgnore
    public void resetPSDEFTypeId(){
        this.reset(FIELD_PSDEFTYPEID);
    }

    /**
     * 设置 实体属性类型标识
     * <P>
     * 等同 {@link #setPSDEFTypeId}
     * @param pSDEFTypeId
     */
    @JsonIgnore
    public PSDEFType psdeftypeid(String pSDEFTypeId){
        this.setPSDEFTypeId(pSDEFTypeId);
        return this;
    }

    /**
     * <B>PSDEFTYPENAME</B>&nbsp;实体属性类型名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEFTYPENAME = "psdeftypename";

    /**
     * 设置 实体属性类型名称
     * 
     * @param pSDEFTypeName
     * 
     */
    @JsonProperty(FIELD_PSDEFTYPENAME)
    public void setPSDEFTypeName(String pSDEFTypeName){
        this.set(FIELD_PSDEFTYPENAME, pSDEFTypeName);
    }
    
    /**
     * 获取 实体属性类型名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEFTypeName(){
        Object objValue = this.get(FIELD_PSDEFTYPENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体属性类型名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFTypeNameDirty(){
        if(this.contains(FIELD_PSDEFTYPENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体属性类型名称
     */
    @JsonIgnore
    public void resetPSDEFTypeName(){
        this.reset(FIELD_PSDEFTYPENAME);
    }

    /**
     * 设置 实体属性类型名称
     * <P>
     * 等同 {@link #setPSDEFTypeName}
     * @param pSDEFTypeName
     */
    @JsonIgnore
    public PSDEFType psdeftypename(String pSDEFTypeName){
        this.setPSDEFTypeName(pSDEFTypeName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEFTypeName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEFTypeName(strName);
    }

    @JsonIgnore
    public PSDEFType name(String strName){
        this.setPSDEFTypeName(strName);
        return this;
    }

    /**
     * <B>PSUNITID</B>&nbsp;平台预置单位
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSUNITID = "psunitid";

    /**
     * 设置 平台预置单位
     * 
     * @param pSUnitId
     * 
     */
    @JsonProperty(FIELD_PSUNITID)
    public void setPSUnitId(String pSUnitId){
        this.set(FIELD_PSUNITID, pSUnitId);
    }
    
    /**
     * 获取 平台预置单位  
     * @return
     */
    @JsonIgnore
    public String getPSUnitId(){
        Object objValue = this.get(FIELD_PSUNITID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 平台预置单位 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSUnitIdDirty(){
        if(this.contains(FIELD_PSUNITID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 平台预置单位
     */
    @JsonIgnore
    public void resetPSUnitId(){
        this.reset(FIELD_PSUNITID);
    }

    /**
     * 设置 平台预置单位
     * <P>
     * 等同 {@link #setPSUnitId}
     * @param pSUnitId
     */
    @JsonIgnore
    public PSDEFType psunitid(String pSUnitId){
        this.setPSUnitId(pSUnitId);
        return this;
    }

    /**
     * <B>PSUNITNAME</B>&nbsp;平台预置单位
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSUNITID}
     */
    public final static String FIELD_PSUNITNAME = "psunitname";

    /**
     * 设置 平台预置单位
     * 
     * @param pSUnitName
     * 
     */
    @JsonProperty(FIELD_PSUNITNAME)
    public void setPSUnitName(String pSUnitName){
        this.set(FIELD_PSUNITNAME, pSUnitName);
    }
    
    /**
     * 获取 平台预置单位  
     * @return
     */
    @JsonIgnore
    public String getPSUnitName(){
        Object objValue = this.get(FIELD_PSUNITNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 平台预置单位 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSUnitNameDirty(){
        if(this.contains(FIELD_PSUNITNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 平台预置单位
     */
    @JsonIgnore
    public void resetPSUnitName(){
        this.reset(FIELD_PSUNITNAME);
    }

    /**
     * 设置 平台预置单位
     * <P>
     * 等同 {@link #setPSUnitName}
     * @param pSUnitName
     */
    @JsonIgnore
    public PSDEFType psunitname(String pSUnitName){
        this.setPSUnitName(pSUnitName);
        return this;
    }

    /**
     * <B>PSVALUERULEID</B>&nbsp;平台预置值规则
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSVALUERULEID = "psvalueruleid";

    /**
     * 设置 平台预置值规则
     * 
     * @param pSValueRuleId
     * 
     */
    @JsonProperty(FIELD_PSVALUERULEID)
    public void setPSValueRuleId(String pSValueRuleId){
        this.set(FIELD_PSVALUERULEID, pSValueRuleId);
    }
    
    /**
     * 获取 平台预置值规则  
     * @return
     */
    @JsonIgnore
    public String getPSValueRuleId(){
        Object objValue = this.get(FIELD_PSVALUERULEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 平台预置值规则 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSValueRuleIdDirty(){
        if(this.contains(FIELD_PSVALUERULEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 平台预置值规则
     */
    @JsonIgnore
    public void resetPSValueRuleId(){
        this.reset(FIELD_PSVALUERULEID);
    }

    /**
     * 设置 平台预置值规则
     * <P>
     * 等同 {@link #setPSValueRuleId}
     * @param pSValueRuleId
     */
    @JsonIgnore
    public PSDEFType psvalueruleid(String pSValueRuleId){
        this.setPSValueRuleId(pSValueRuleId);
        return this;
    }

    /**
     * <B>PSVALUERULENAME</B>&nbsp;平台预置值规则
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSVALUERULEID}
     */
    public final static String FIELD_PSVALUERULENAME = "psvaluerulename";

    /**
     * 设置 平台预置值规则
     * 
     * @param pSValueRuleName
     * 
     */
    @JsonProperty(FIELD_PSVALUERULENAME)
    public void setPSValueRuleName(String pSValueRuleName){
        this.set(FIELD_PSVALUERULENAME, pSValueRuleName);
    }
    
    /**
     * 获取 平台预置值规则  
     * @return
     */
    @JsonIgnore
    public String getPSValueRuleName(){
        Object objValue = this.get(FIELD_PSVALUERULENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 平台预置值规则 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSValueRuleNameDirty(){
        if(this.contains(FIELD_PSVALUERULENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 平台预置值规则
     */
    @JsonIgnore
    public void resetPSValueRuleName(){
        this.reset(FIELD_PSVALUERULENAME);
    }

    /**
     * 设置 平台预置值规则
     * <P>
     * 等同 {@link #setPSValueRuleName}
     * @param pSValueRuleName
     */
    @JsonIgnore
    public PSDEFType psvaluerulename(String pSValueRuleName){
        this.setPSValueRuleName(pSValueRuleName);
        return this;
    }

    /**
     * <B>PYFORMAT</B>&nbsp;PY格式化
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_PYFORMAT = "pyformat";

    /**
     * 设置 PY格式化
     * 
     * @param pYFormat
     * 
     */
    @JsonProperty(FIELD_PYFORMAT)
    public void setPYFormat(String pYFormat){
        this.set(FIELD_PYFORMAT, pYFormat);
    }
    
    /**
     * 获取 PY格式化  
     * @return
     */
    @JsonIgnore
    public String getPYFormat(){
        Object objValue = this.get(FIELD_PYFORMAT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 PY格式化 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPYFormatDirty(){
        if(this.contains(FIELD_PYFORMAT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 PY格式化
     */
    @JsonIgnore
    public void resetPYFormat(){
        this.reset(FIELD_PYFORMAT);
    }

    /**
     * 设置 PY格式化
     * <P>
     * 等同 {@link #setPYFormat}
     * @param pYFormat
     */
    @JsonIgnore
    public PSDEFType pyformat(String pYFormat){
        this.setPYFormat(pYFormat);
        return this;
    }

    /**
     * <B>SEARCHEDITORHEIGHT</B>&nbsp;搜索编辑器高度
     */
    public final static String FIELD_SEARCHEDITORHEIGHT = "searcheditorheight";

    /**
     * 设置 搜索编辑器高度
     * 
     * @param searchEditorHeight
     * 
     */
    @JsonProperty(FIELD_SEARCHEDITORHEIGHT)
    public void setSearchEditorHeight(Integer searchEditorHeight){
        this.set(FIELD_SEARCHEDITORHEIGHT, searchEditorHeight);
    }
    
    /**
     * 获取 搜索编辑器高度  
     * @return
     */
    @JsonIgnore
    public Integer getSearchEditorHeight(){
        Object objValue = this.get(FIELD_SEARCHEDITORHEIGHT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 搜索编辑器高度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSearchEditorHeightDirty(){
        if(this.contains(FIELD_SEARCHEDITORHEIGHT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 搜索编辑器高度
     */
    @JsonIgnore
    public void resetSearchEditorHeight(){
        this.reset(FIELD_SEARCHEDITORHEIGHT);
    }

    /**
     * 设置 搜索编辑器高度
     * <P>
     * 等同 {@link #setSearchEditorHeight}
     * @param searchEditorHeight
     */
    @JsonIgnore
    public PSDEFType searcheditorheight(Integer searchEditorHeight){
        this.setSearchEditorHeight(searchEditorHeight);
        return this;
    }

    /**
     * <B>SEARCHEDITORTYPE</B>&nbsp;搜索编辑器类型
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_SEARCHEDITORTYPE = "searcheditortype";

    /**
     * 设置 搜索编辑器类型
     * 
     * @param searchEditorType
     * 
     */
    @JsonProperty(FIELD_SEARCHEDITORTYPE)
    public void setSearchEditorType(String searchEditorType){
        this.set(FIELD_SEARCHEDITORTYPE, searchEditorType);
    }
    
    /**
     * 获取 搜索编辑器类型  
     * @return
     */
    @JsonIgnore
    public String getSearchEditorType(){
        Object objValue = this.get(FIELD_SEARCHEDITORTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 搜索编辑器类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSearchEditorTypeDirty(){
        if(this.contains(FIELD_SEARCHEDITORTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 搜索编辑器类型
     */
    @JsonIgnore
    public void resetSearchEditorType(){
        this.reset(FIELD_SEARCHEDITORTYPE);
    }

    /**
     * 设置 搜索编辑器类型
     * <P>
     * 等同 {@link #setSearchEditorType}
     * @param searchEditorType
     */
    @JsonIgnore
    public PSDEFType searcheditortype(String searchEditorType){
        this.setSearchEditorType(searchEditorType);
        return this;
    }

    /**
     * <B>SEARCHEDITORWIDTH</B>&nbsp;搜索编辑器宽度
     */
    public final static String FIELD_SEARCHEDITORWIDTH = "searcheditorwidth";

    /**
     * 设置 搜索编辑器宽度
     * 
     * @param searchEditorWidth
     * 
     */
    @JsonProperty(FIELD_SEARCHEDITORWIDTH)
    public void setSearchEditorWidth(Integer searchEditorWidth){
        this.set(FIELD_SEARCHEDITORWIDTH, searchEditorWidth);
    }
    
    /**
     * 获取 搜索编辑器宽度  
     * @return
     */
    @JsonIgnore
    public Integer getSearchEditorWidth(){
        Object objValue = this.get(FIELD_SEARCHEDITORWIDTH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 搜索编辑器宽度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSearchEditorWidthDirty(){
        if(this.contains(FIELD_SEARCHEDITORWIDTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 搜索编辑器宽度
     */
    @JsonIgnore
    public void resetSearchEditorWidth(){
        this.reset(FIELD_SEARCHEDITORWIDTH);
    }

    /**
     * 设置 搜索编辑器宽度
     * <P>
     * 等同 {@link #setSearchEditorWidth}
     * @param searchEditorWidth
     */
    @JsonIgnore
    public PSDEFType searcheditorwidth(Integer searchEditorWidth){
        this.setSearchEditorWidth(searchEditorWidth);
        return this;
    }

    /**
     * <B>SEARCHMBEDITORHEIGHT</B>&nbsp;搜索移动端编辑器高度
     */
    public final static String FIELD_SEARCHMBEDITORHEIGHT = "searchmbeditorheight";

    /**
     * 设置 搜索移动端编辑器高度
     * 
     * @param searchMBEditorHeight
     * 
     */
    @JsonProperty(FIELD_SEARCHMBEDITORHEIGHT)
    public void setSearchMBEditorHeight(Integer searchMBEditorHeight){
        this.set(FIELD_SEARCHMBEDITORHEIGHT, searchMBEditorHeight);
    }
    
    /**
     * 获取 搜索移动端编辑器高度  
     * @return
     */
    @JsonIgnore
    public Integer getSearchMBEditorHeight(){
        Object objValue = this.get(FIELD_SEARCHMBEDITORHEIGHT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 搜索移动端编辑器高度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSearchMBEditorHeightDirty(){
        if(this.contains(FIELD_SEARCHMBEDITORHEIGHT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 搜索移动端编辑器高度
     */
    @JsonIgnore
    public void resetSearchMBEditorHeight(){
        this.reset(FIELD_SEARCHMBEDITORHEIGHT);
    }

    /**
     * 设置 搜索移动端编辑器高度
     * <P>
     * 等同 {@link #setSearchMBEditorHeight}
     * @param searchMBEditorHeight
     */
    @JsonIgnore
    public PSDEFType searchmbeditorheight(Integer searchMBEditorHeight){
        this.setSearchMBEditorHeight(searchMBEditorHeight);
        return this;
    }

    /**
     * <B>SEARCHMBEDITORTYPE</B>&nbsp;搜索移动端编辑器类型
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_SEARCHMBEDITORTYPE = "searchmbeditortype";

    /**
     * 设置 搜索移动端编辑器类型
     * 
     * @param searchMBEditorType
     * 
     */
    @JsonProperty(FIELD_SEARCHMBEDITORTYPE)
    public void setSearchMBEditorType(String searchMBEditorType){
        this.set(FIELD_SEARCHMBEDITORTYPE, searchMBEditorType);
    }
    
    /**
     * 获取 搜索移动端编辑器类型  
     * @return
     */
    @JsonIgnore
    public String getSearchMBEditorType(){
        Object objValue = this.get(FIELD_SEARCHMBEDITORTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 搜索移动端编辑器类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSearchMBEditorTypeDirty(){
        if(this.contains(FIELD_SEARCHMBEDITORTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 搜索移动端编辑器类型
     */
    @JsonIgnore
    public void resetSearchMBEditorType(){
        this.reset(FIELD_SEARCHMBEDITORTYPE);
    }

    /**
     * 设置 搜索移动端编辑器类型
     * <P>
     * 等同 {@link #setSearchMBEditorType}
     * @param searchMBEditorType
     */
    @JsonIgnore
    public PSDEFType searchmbeditortype(String searchMBEditorType){
        this.setSearchMBEditorType(searchMBEditorType);
        return this;
    }

    /**
     * <B>SEARCHMBEDITORWIDTH</B>&nbsp;搜索移动端编辑器宽度
     */
    public final static String FIELD_SEARCHMBEDITORWIDTH = "searchmbeditorwidth";

    /**
     * 设置 搜索移动端编辑器宽度
     * 
     * @param searchMBEditorWidth
     * 
     */
    @JsonProperty(FIELD_SEARCHMBEDITORWIDTH)
    public void setSearchMBEditorWidth(Integer searchMBEditorWidth){
        this.set(FIELD_SEARCHMBEDITORWIDTH, searchMBEditorWidth);
    }
    
    /**
     * 获取 搜索移动端编辑器宽度  
     * @return
     */
    @JsonIgnore
    public Integer getSearchMBEditorWidth(){
        Object objValue = this.get(FIELD_SEARCHMBEDITORWIDTH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 搜索移动端编辑器宽度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSearchMBEditorWidthDirty(){
        if(this.contains(FIELD_SEARCHMBEDITORWIDTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 搜索移动端编辑器宽度
     */
    @JsonIgnore
    public void resetSearchMBEditorWidth(){
        this.reset(FIELD_SEARCHMBEDITORWIDTH);
    }

    /**
     * 设置 搜索移动端编辑器宽度
     * <P>
     * 等同 {@link #setSearchMBEditorWidth}
     * @param searchMBEditorWidth
     */
    @JsonIgnore
    public PSDEFType searchmbeditorwidth(Integer searchMBEditorWidth){
        this.setSearchMBEditorWidth(searchMBEditorWidth);
        return this;
    }

    /**
     * <B>SEARCHMODEOBJ</B>&nbsp;属性搜索模式对象
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_SEARCHMODEOBJ = "searchmodeobj";

    /**
     * 设置 属性搜索模式对象
     * 
     * @param searchModeObj
     * 
     */
    @JsonProperty(FIELD_SEARCHMODEOBJ)
    public void setSearchModeObj(String searchModeObj){
        this.set(FIELD_SEARCHMODEOBJ, searchModeObj);
    }
    
    /**
     * 获取 属性搜索模式对象  
     * @return
     */
    @JsonIgnore
    public String getSearchModeObj(){
        Object objValue = this.get(FIELD_SEARCHMODEOBJ);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性搜索模式对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSearchModeObjDirty(){
        if(this.contains(FIELD_SEARCHMODEOBJ)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性搜索模式对象
     */
    @JsonIgnore
    public void resetSearchModeObj(){
        this.reset(FIELD_SEARCHMODEOBJ);
    }

    /**
     * 设置 属性搜索模式对象
     * <P>
     * 等同 {@link #setSearchModeObj}
     * @param searchModeObj
     */
    @JsonIgnore
    public PSDEFType searchmodeobj(String searchModeObj){
        this.setSearchModeObj(searchModeObj);
        return this;
    }

    /**
     * <B>SFITEMOBJ</B>&nbsp;属性搜索表单项对象
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_SFITEMOBJ = "sfitemobj";

    /**
     * 设置 属性搜索表单项对象
     * 
     * @param sFItemObj
     * 
     */
    @JsonProperty(FIELD_SFITEMOBJ)
    public void setSFItemObj(String sFItemObj){
        this.set(FIELD_SFITEMOBJ, sFItemObj);
    }
    
    /**
     * 获取 属性搜索表单项对象  
     * @return
     */
    @JsonIgnore
    public String getSFItemObj(){
        Object objValue = this.get(FIELD_SFITEMOBJ);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性搜索表单项对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSFItemObjDirty(){
        if(this.contains(FIELD_SFITEMOBJ)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性搜索表单项对象
     */
    @JsonIgnore
    public void resetSFItemObj(){
        this.reset(FIELD_SFITEMOBJ);
    }

    /**
     * 设置 属性搜索表单项对象
     * <P>
     * 等同 {@link #setSFItemObj}
     * @param sFItemObj
     */
    @JsonIgnore
    public PSDEFType sfitemobj(String sFItemObj){
        this.setSFItemObj(sFItemObj);
        return this;
    }

    /**
     * <B>STDDATATYPE</B>&nbsp;标准数据类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.StdDataType} 
     */
    public final static String FIELD_STDDATATYPE = "stddatatype";

    /**
     * 设置 标准数据类型
     * 
     * @param stdDataType
     * 
     */
    @JsonProperty(FIELD_STDDATATYPE)
    public void setStdDataType(Integer stdDataType){
        this.set(FIELD_STDDATATYPE, stdDataType);
    }
    
    /**
     * 获取 标准数据类型  
     * @return
     */
    @JsonIgnore
    public Integer getStdDataType(){
        Object objValue = this.get(FIELD_STDDATATYPE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 标准数据类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStdDataTypeDirty(){
        if(this.contains(FIELD_STDDATATYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标准数据类型
     */
    @JsonIgnore
    public void resetStdDataType(){
        this.reset(FIELD_STDDATATYPE);
    }

    /**
     * 设置 标准数据类型
     * <P>
     * 等同 {@link #setStdDataType}
     * @param stdDataType
     */
    @JsonIgnore
    public PSDEFType stddatatype(Integer stdDataType){
        this.setStdDataType(stdDataType);
        return this;
    }

     /**
     * 设置 标准数据类型
     * <P>
     * 等同 {@link #setStdDataType}
     * @param stdDataType
     */
    @JsonIgnore
    public PSDEFType stddatatype(net.ibizsys.psmodel.core.util.PSModelEnums.StdDataType stdDataType){
        if(stdDataType == null){
            this.setStdDataType(null);
        }
        else{
            this.setStdDataType(stdDataType.value);
        }
        return this;
    }

    /**
     * <B>STRLENGTH</B>&nbsp;字符串长度
     */
    public final static String FIELD_STRLENGTH = "strlength";

    /**
     * 设置 字符串长度
     * 
     * @param strLength
     * 
     */
    @JsonProperty(FIELD_STRLENGTH)
    public void setStrLength(Integer strLength){
        this.set(FIELD_STRLENGTH, strLength);
    }
    
    /**
     * 获取 字符串长度  
     * @return
     */
    @JsonIgnore
    public Integer getStrLength(){
        Object objValue = this.get(FIELD_STRLENGTH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 字符串长度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStrLengthDirty(){
        if(this.contains(FIELD_STRLENGTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 字符串长度
     */
    @JsonIgnore
    public void resetStrLength(){
        this.reset(FIELD_STRLENGTH);
    }

    /**
     * 设置 字符串长度
     * <P>
     * 等同 {@link #setStrLength}
     * @param strLength
     */
    @JsonIgnore
    public PSDEFType strlength(Integer strLength){
        this.setStrLength(strLength);
        return this;
    }

    /**
     * <B>TESTDATA</B>&nbsp;测试数据，属性类型的默认测试数据。
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_TESTDATA = "testdata";

    /**
     * 设置 测试数据，详细说明：{@link #FIELD_TESTDATA}
     * 
     * @param testData
     * 
     */
    @JsonProperty(FIELD_TESTDATA)
    public void setTestData(String testData){
        this.set(FIELD_TESTDATA, testData);
    }
    
    /**
     * 获取 测试数据  
     * @return
     */
    @JsonIgnore
    public String getTestData(){
        Object objValue = this.get(FIELD_TESTDATA);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 测试数据 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTestDataDirty(){
        if(this.contains(FIELD_TESTDATA)){
            return true;
        }
        return false;
    }

    /**
     * 重置 测试数据
     */
    @JsonIgnore
    public void resetTestData(){
        this.reset(FIELD_TESTDATA);
    }

    /**
     * 设置 测试数据，详细说明：{@link #FIELD_TESTDATA}
     * <P>
     * 等同 {@link #setTestData}
     * @param testData
     */
    @JsonIgnore
    public PSDEFType testdata(String testData){
        this.setTestData(testData);
        return this;
    }

    /**
     * <B>TSFORMAT</B>&nbsp;TS格式化
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_TSFORMAT = "tsformat";

    /**
     * 设置 TS格式化
     * 
     * @param tSFormat
     * 
     */
    @JsonProperty(FIELD_TSFORMAT)
    public void setTSFormat(String tSFormat){
        this.set(FIELD_TSFORMAT, tSFormat);
    }
    
    /**
     * 获取 TS格式化  
     * @return
     */
    @JsonIgnore
    public String getTSFormat(){
        Object objValue = this.get(FIELD_TSFORMAT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 TS格式化 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTSFormatDirty(){
        if(this.contains(FIELD_TSFORMAT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 TS格式化
     */
    @JsonIgnore
    public void resetTSFormat(){
        this.reset(FIELD_TSFORMAT);
    }

    /**
     * 设置 TS格式化
     * <P>
     * 等同 {@link #setTSFormat}
     * @param tSFormat
     */
    @JsonIgnore
    public PSDEFType tsformat(String tSFormat){
        this.setTSFormat(tSFormat);
        return this;
    }

    /**
     * <B>UIMODEOBJ</B>&nbsp;属性界面配置对象
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_UIMODEOBJ = "uimodeobj";

    /**
     * 设置 属性界面配置对象
     * 
     * @param uIModeObj
     * 
     */
    @JsonProperty(FIELD_UIMODEOBJ)
    public void setUIModeObj(String uIModeObj){
        this.set(FIELD_UIMODEOBJ, uIModeObj);
    }
    
    /**
     * 获取 属性界面配置对象  
     * @return
     */
    @JsonIgnore
    public String getUIModeObj(){
        Object objValue = this.get(FIELD_UIMODEOBJ);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性界面配置对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUIModeObjDirty(){
        if(this.contains(FIELD_UIMODEOBJ)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性界面配置对象
     */
    @JsonIgnore
    public void resetUIModeObj(){
        this.reset(FIELD_UIMODEOBJ);
    }

    /**
     * 设置 属性界面配置对象
     * <P>
     * 等同 {@link #setUIModeObj}
     * @param uIModeObj
     */
    @JsonIgnore
    public PSDEFType uimodeobj(String uIModeObj){
        this.setUIModeObj(uIModeObj);
        return this;
    }

    /**
     * <B>UNSIGNEDFLAG</B>&nbsp;是否无符号
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_UNSIGNEDFLAG = "unsignedflag";

    /**
     * 设置 是否无符号
     * 
     * @param unsignedFlag
     * 
     */
    @JsonProperty(FIELD_UNSIGNEDFLAG)
    public void setUnsignedFlag(Integer unsignedFlag){
        this.set(FIELD_UNSIGNEDFLAG, unsignedFlag);
    }
    
    /**
     * 获取 是否无符号  
     * @return
     */
    @JsonIgnore
    public Integer getUnsignedFlag(){
        Object objValue = this.get(FIELD_UNSIGNEDFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 是否无符号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUnsignedFlagDirty(){
        if(this.contains(FIELD_UNSIGNEDFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 是否无符号
     */
    @JsonIgnore
    public void resetUnsignedFlag(){
        this.reset(FIELD_UNSIGNEDFLAG);
    }

    /**
     * 设置 是否无符号
     * <P>
     * 等同 {@link #setUnsignedFlag}
     * @param unsignedFlag
     */
    @JsonIgnore
    public PSDEFType unsignedflag(Integer unsignedFlag){
        this.setUnsignedFlag(unsignedFlag);
        return this;
    }

     /**
     * 设置 是否无符号
     * <P>
     * 等同 {@link #setUnsignedFlag}
     * @param unsignedFlag
     */
    @JsonIgnore
    public PSDEFType unsignedflag(Boolean unsignedFlag){
        if(unsignedFlag == null){
            this.setUnsignedFlag(null);
        }
        else{
            this.setUnsignedFlag(unsignedFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>UPDATEDATE</B>&nbsp;更新时间
     */
    public final static String FIELD_UPDATEDATE = "updatedate";

    /**
     * 设置 更新时间
     * 
     * @param updateDate
     * 
     */
    @JsonProperty(FIELD_UPDATEDATE)
    public void setUpdateDate(String updateDate){
        this.set(FIELD_UPDATEDATE, updateDate);
    }
    
    /**
     * 获取 更新时间  
     * @return
     */
    @JsonIgnore
    public String getUpdateDate(){
        Object objValue = this.get(FIELD_UPDATEDATE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 更新时间 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUpdateDateDirty(){
        if(this.contains(FIELD_UPDATEDATE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 更新时间
     */
    @JsonIgnore
    public void resetUpdateDate(){
        this.reset(FIELD_UPDATEDATE);
    }

    /**
     * 设置 更新时间
     * <P>
     * 等同 {@link #setUpdateDate}
     * @param updateDate
     */
    @JsonIgnore
    public PSDEFType updatedate(String updateDate){
        this.setUpdateDate(updateDate);
        return this;
    }

    /**
     * <B>UPDATEMAN</B>&nbsp;更新人
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_UPDATEMAN = "updateman";

    /**
     * 设置 更新人
     * 
     * @param updateMan
     * 
     */
    @JsonProperty(FIELD_UPDATEMAN)
    public void setUpdateMan(String updateMan){
        this.set(FIELD_UPDATEMAN, updateMan);
    }
    
    /**
     * 获取 更新人  
     * @return
     */
    @JsonIgnore
    public String getUpdateMan(){
        Object objValue = this.get(FIELD_UPDATEMAN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 更新人 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUpdateManDirty(){
        if(this.contains(FIELD_UPDATEMAN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 更新人
     */
    @JsonIgnore
    public void resetUpdateMan(){
        this.reset(FIELD_UPDATEMAN);
    }

    /**
     * 设置 更新人
     * <P>
     * 等同 {@link #setUpdateMan}
     * @param updateMan
     */
    @JsonIgnore
    public PSDEFType updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEFTypeId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEFTypeId(strValue);
    }

    @JsonIgnore
    public PSDEFType id(String strValue){
        this.setPSDEFTypeId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEFType){
            PSDEFType model = (PSDEFType)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
