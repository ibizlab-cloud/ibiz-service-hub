package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSDEFTYPE</B>系统属性类型逻辑 模型传输对象
 * <P>
 * 系统属性类型逻辑模型，定义系统级别的属性类型处理逻辑对平台预置逻辑进行覆盖，逻辑值未配置时将默认使用预置逻辑的定义
 */
public class PSSysDEFType extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysDEFType(){
        this.setValidFlag(1);
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
    public PSSysDEFType createdate(String createDate){
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
    public PSSysDEFType createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>EDITORHEIGHT</B>&nbsp;编辑器高度，指定系统属性类型逻辑的默认编辑器高度，未定义时使用平台预置逻辑配置
     */
    public final static String FIELD_EDITORHEIGHT = "editorheight";

    /**
     * 设置 编辑器高度，详细说明：{@link #FIELD_EDITORHEIGHT}
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
     * 设置 编辑器高度，详细说明：{@link #FIELD_EDITORHEIGHT}
     * <P>
     * 等同 {@link #setEditorHeight}
     * @param editorHeight
     */
    @JsonIgnore
    public PSSysDEFType editorheight(Integer editorHeight){
        this.setEditorHeight(editorHeight);
        return this;
    }

    /**
     * <B>EDITORTYPE</B>&nbsp;编辑器类型，指定系统属性类型逻辑的默认编辑器类型，未定义时使用平台预置逻辑配置
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_EDITORTYPE = "editortype";

    /**
     * 设置 编辑器类型，详细说明：{@link #FIELD_EDITORTYPE}
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
     * 设置 编辑器类型，详细说明：{@link #FIELD_EDITORTYPE}
     * <P>
     * 等同 {@link #setEditorType}
     * @param editorType
     */
    @JsonIgnore
    public PSSysDEFType editortype(String editorType){
        this.setEditorType(editorType);
        return this;
    }

    /**
     * <B>EDITORWIDTH</B>&nbsp;编辑器宽度，指定系统属性类型逻辑的默认编辑器宽度，未定义时使用平台预置逻辑配置
     */
    public final static String FIELD_EDITORWIDTH = "editorwidth";

    /**
     * 设置 编辑器宽度，详细说明：{@link #FIELD_EDITORWIDTH}
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
     * 设置 编辑器宽度，详细说明：{@link #FIELD_EDITORWIDTH}
     * <P>
     * 等同 {@link #setEditorWidth}
     * @param editorWidth
     */
    @JsonIgnore
    public PSSysDEFType editorwidth(Integer editorWidth){
        this.setEditorWidth(editorWidth);
        return this;
    }

    /**
     * <B>FIELDS</B>&nbsp;属性选择表达式，指定系统属性类型逻辑的属性选择表格式，定义属性类型逻辑针对的目标属性，未定义时使用平台预置逻辑配置
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_FIELDS = "fields";

    /**
     * 设置 属性选择表达式，详细说明：{@link #FIELD_FIELDS}
     * 
     * @param fields
     * 
     */
    @JsonProperty(FIELD_FIELDS)
    public void setFields(String fields){
        this.set(FIELD_FIELDS, fields);
    }
    
    /**
     * 获取 属性选择表达式  
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
     * 判断 属性选择表达式 是否指定值，包括空值
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
     * 重置 属性选择表达式
     */
    @JsonIgnore
    public void resetFields(){
        this.reset(FIELD_FIELDS);
    }

    /**
     * 设置 属性选择表达式，详细说明：{@link #FIELD_FIELDS}
     * <P>
     * 等同 {@link #setFields}
     * @param fields
     */
    @JsonIgnore
    public PSSysDEFType fields(String fields){
        this.setFields(fields);
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
    public PSSysDEFType gridcolalign(String gridColAlign){
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
    public PSSysDEFType gridcolalign(net.ibizsys.psmodel.core.util.PSModelEnums.GridColAlign gridColAlign){
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
    public PSSysDEFType gridcolclmode(String gridColCLMode){
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
    public PSSysDEFType gridcolclmode(net.ibizsys.psmodel.core.util.PSModelEnums.CodeListConvertMode gridColCLMode){
        if(gridColCLMode == null){
            this.setGridColCLMode(null);
        }
        else{
            this.setGridColCLMode(gridColCLMode.value);
        }
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
    public PSSysDEFType gridcolwidth(Integer gridColWidth){
        this.setGridColWidth(gridColWidth);
        return this;
    }

    /**
     * <B>JSFORMAT</B>&nbsp;JS格式化，指定系统属性类型逻辑的默认JS格式化串，未定义时使用平台预置逻辑配置
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_JSFORMAT = "jsformat";

    /**
     * 设置 JS格式化，详细说明：{@link #FIELD_JSFORMAT}
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
     * 设置 JS格式化，详细说明：{@link #FIELD_JSFORMAT}
     * <P>
     * 等同 {@link #setJSFormat}
     * @param jSFormat
     */
    @JsonIgnore
    public PSSysDEFType jsformat(String jSFormat){
        this.setJSFormat(jSFormat);
        return this;
    }

    /**
     * <B>MAXVALUE</B>&nbsp;最大值，指定系统属性类型逻辑的默认最大值，未定义时使用平台预置逻辑配置
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_MAXVALUE = "maxvalue";

    /**
     * 设置 最大值，详细说明：{@link #FIELD_MAXVALUE}
     * 
     * @param maxValue
     * 
     */
    @JsonProperty(FIELD_MAXVALUE)
    public void setMaxValue(String maxValue){
        this.set(FIELD_MAXVALUE, maxValue);
    }
    
    /**
     * 获取 最大值  
     * @return
     */
    @JsonIgnore
    public String getMaxValue(){
        Object objValue = this.get(FIELD_MAXVALUE);
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
    public boolean isMaxValueDirty(){
        if(this.contains(FIELD_MAXVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 最大值
     */
    @JsonIgnore
    public void resetMaxValue(){
        this.reset(FIELD_MAXVALUE);
    }

    /**
     * 设置 最大值，详细说明：{@link #FIELD_MAXVALUE}
     * <P>
     * 等同 {@link #setMaxValue}
     * @param maxValue
     */
    @JsonIgnore
    public PSSysDEFType maxvalue(String maxValue){
        this.setMaxValue(maxValue);
        return this;
    }

    /**
     * <B>MBEDITORHEIGHT</B>&nbsp;移动端编辑器高度，指定系统属性类型逻辑的默认移动端编辑器高度，未定义时使用平台预置逻辑配置
     */
    public final static String FIELD_MBEDITORHEIGHT = "mbeditorheight";

    /**
     * 设置 移动端编辑器高度，详细说明：{@link #FIELD_MBEDITORHEIGHT}
     * 
     * @param mBEditorHeight
     * 
     */
    @JsonProperty(FIELD_MBEDITORHEIGHT)
    public void setMBEditorHeight(Integer mBEditorHeight){
        this.set(FIELD_MBEDITORHEIGHT, mBEditorHeight);
    }
    
    /**
     * 获取 移动端编辑器高度  
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
     * 判断 移动端编辑器高度 是否指定值，包括空值
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
     * 重置 移动端编辑器高度
     */
    @JsonIgnore
    public void resetMBEditorHeight(){
        this.reset(FIELD_MBEDITORHEIGHT);
    }

    /**
     * 设置 移动端编辑器高度，详细说明：{@link #FIELD_MBEDITORHEIGHT}
     * <P>
     * 等同 {@link #setMBEditorHeight}
     * @param mBEditorHeight
     */
    @JsonIgnore
    public PSSysDEFType mbeditorheight(Integer mBEditorHeight){
        this.setMBEditorHeight(mBEditorHeight);
        return this;
    }

    /**
     * <B>MBEDITORTYPE</B>&nbsp;移动端编辑器类型，指定系统属性类型逻辑的默认移动端编辑器类型，未定义时使用平台预置逻辑配置
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_MBEDITORTYPE = "mbeditortype";

    /**
     * 设置 移动端编辑器类型，详细说明：{@link #FIELD_MBEDITORTYPE}
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
     * 设置 移动端编辑器类型，详细说明：{@link #FIELD_MBEDITORTYPE}
     * <P>
     * 等同 {@link #setMBEditorType}
     * @param mBEditorType
     */
    @JsonIgnore
    public PSSysDEFType mbeditortype(String mBEditorType){
        this.setMBEditorType(mBEditorType);
        return this;
    }

    /**
     * <B>MBEDITORWIDTH</B>&nbsp;移动端编辑器宽度，指定系统属性类型逻辑的默认移动端编辑器宽度，未定义时使用平台预置逻辑配置
     */
    public final static String FIELD_MBEDITORWIDTH = "mbeditorwidth";

    /**
     * 设置 移动端编辑器宽度，详细说明：{@link #FIELD_MBEDITORWIDTH}
     * 
     * @param mBEditorWidth
     * 
     */
    @JsonProperty(FIELD_MBEDITORWIDTH)
    public void setMBEditorWidth(Integer mBEditorWidth){
        this.set(FIELD_MBEDITORWIDTH, mBEditorWidth);
    }
    
    /**
     * 获取 移动端编辑器宽度  
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
     * 判断 移动端编辑器宽度 是否指定值，包括空值
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
     * 重置 移动端编辑器宽度
     */
    @JsonIgnore
    public void resetMBEditorWidth(){
        this.reset(FIELD_MBEDITORWIDTH);
    }

    /**
     * 设置 移动端编辑器宽度，详细说明：{@link #FIELD_MBEDITORWIDTH}
     * <P>
     * 等同 {@link #setMBEditorWidth}
     * @param mBEditorWidth
     */
    @JsonIgnore
    public PSSysDEFType mbeditorwidth(Integer mBEditorWidth){
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
    public PSSysDEFType memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MINSTRLENGTH</B>&nbsp;最小字符长度，指定系统属性类型逻辑的默认最小字符串长度，未定义时使用平台预置逻辑配置
     */
    public final static String FIELD_MINSTRLENGTH = "minstrlength";

    /**
     * 设置 最小字符长度，详细说明：{@link #FIELD_MINSTRLENGTH}
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
     * 设置 最小字符长度，详细说明：{@link #FIELD_MINSTRLENGTH}
     * <P>
     * 等同 {@link #setMinStrLength}
     * @param minStrLength
     */
    @JsonIgnore
    public PSSysDEFType minstrlength(Integer minStrLength){
        this.setMinStrLength(minStrLength);
        return this;
    }

    /**
     * <B>MINVALUE</B>&nbsp;最小值，指定系统属性类型逻辑的默认最小值，未定义时使用平台预置逻辑配置
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_MINVALUE = "minvalue";

    /**
     * 设置 最小值，详细说明：{@link #FIELD_MINVALUE}
     * 
     * @param minValue
     * 
     */
    @JsonProperty(FIELD_MINVALUE)
    public void setMinValue(String minValue){
        this.set(FIELD_MINVALUE, minValue);
    }
    
    /**
     * 获取 最小值  
     * @return
     */
    @JsonIgnore
    public String getMinValue(){
        Object objValue = this.get(FIELD_MINVALUE);
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
    public boolean isMinValueDirty(){
        if(this.contains(FIELD_MINVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 最小值
     */
    @JsonIgnore
    public void resetMinValue(){
        this.reset(FIELD_MINVALUE);
    }

    /**
     * 设置 最小值，详细说明：{@link #FIELD_MINVALUE}
     * <P>
     * 等同 {@link #setMinValue}
     * @param minValue
     */
    @JsonIgnore
    public PSSysDEFType minvalue(String minValue){
        this.setMinValue(minValue);
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
    public PSSysDEFType ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PRECISION</B>&nbsp;浮点精度，指定系统属性类型逻辑的默认浮点精度，未定义时使用平台预置逻辑配置
     */
    public final static String FIELD_PRECISION = "precision";

    /**
     * 设置 浮点精度，详细说明：{@link #FIELD_PRECISION}
     * 
     * @param precision
     * 
     */
    @JsonProperty(FIELD_PRECISION)
    public void setPrecision(Integer precision){
        this.set(FIELD_PRECISION, precision);
        //属性名称与代码标识不一致，设置属性名称
        this.set("precision2", precision);
    }
    
    /**
     * 获取 浮点精度  
     * @return
     */
    @JsonIgnore
    public Integer getPrecision(){
        Object objValue = this.get(FIELD_PRECISION);
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
     * 判断 浮点精度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPrecisionDirty(){
        if(this.contains(FIELD_PRECISION)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("precision2")){
            return true;
        }
        return false;
    }

    /**
     * 重置 浮点精度
     */
    @JsonIgnore
    public void resetPrecision(){
        this.reset(FIELD_PRECISION);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("precision2");
    }

    /**
     * 设置 浮点精度，详细说明：{@link #FIELD_PRECISION}
     * <P>
     * 等同 {@link #setPrecision}
     * @param precision
     */
    @JsonIgnore
    public PSSysDEFType precision(Integer precision){
        this.setPrecision(precision);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public Integer getPrecision2(){
        return this.getPrecision();
    }

    @JsonIgnore
    @Deprecated        
    public void setPrecision2(Integer precision2){
        this.setPrecision(precision2);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPrecision2Dirty(){
        return this.isPrecisionDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPrecision2(){
        this.resetPrecision();
    }

    /**
     * <B>PSCODELISTID</B>&nbsp;系统代码表，指定系统属性类型逻辑的默认代码表，未定义时使用平台预置逻辑配置
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSCodeList} 
     */
    public final static String FIELD_PSCODELISTID = "pscodelistid";

    /**
     * 设置 系统代码表，详细说明：{@link #FIELD_PSCODELISTID}
     * 
     * @param pSCodeListId
     * 
     */
    @JsonProperty(FIELD_PSCODELISTID)
    public void setPSCodeListId(String pSCodeListId){
        this.set(FIELD_PSCODELISTID, pSCodeListId);
    }
    
    /**
     * 获取 系统代码表  
     * @return
     */
    @JsonIgnore
    public String getPSCodeListId(){
        Object objValue = this.get(FIELD_PSCODELISTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统代码表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCodeListIdDirty(){
        if(this.contains(FIELD_PSCODELISTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统代码表
     */
    @JsonIgnore
    public void resetPSCodeListId(){
        this.reset(FIELD_PSCODELISTID);
    }

    /**
     * 设置 系统代码表，详细说明：{@link #FIELD_PSCODELISTID}
     * <P>
     * 等同 {@link #setPSCodeListId}
     * @param pSCodeListId
     */
    @JsonIgnore
    public PSSysDEFType pscodelistid(String pSCodeListId){
        this.setPSCodeListId(pSCodeListId);
        return this;
    }

    /**
     * 设置 系统代码表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSCodeListId}
     * @param pSCodeList 引用对象
     */
    @JsonIgnore
    public PSSysDEFType pscodelistid(PSCodeList pSCodeList){
        if(pSCodeList == null){
            this.setPSCodeListId(null);
            this.setPSCodeListName(null);
        }
        else{
            this.setPSCodeListId(pSCodeList.getPSCodeListId());
            this.setPSCodeListName(pSCodeList.getPSCodeListName());
        }
        return this;
    }

    /**
     * <B>PSCODELISTNAME</B>&nbsp;系统代码表，指定系统属性类型逻辑的默认代码表，未定义时使用平台预置逻辑配置
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCODELISTID}
     */
    public final static String FIELD_PSCODELISTNAME = "pscodelistname";

    /**
     * 设置 系统代码表，详细说明：{@link #FIELD_PSCODELISTNAME}
     * 
     * @param pSCodeListName
     * 
     */
    @JsonProperty(FIELD_PSCODELISTNAME)
    public void setPSCodeListName(String pSCodeListName){
        this.set(FIELD_PSCODELISTNAME, pSCodeListName);
    }
    
    /**
     * 获取 系统代码表  
     * @return
     */
    @JsonIgnore
    public String getPSCodeListName(){
        Object objValue = this.get(FIELD_PSCODELISTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统代码表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCodeListNameDirty(){
        if(this.contains(FIELD_PSCODELISTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统代码表
     */
    @JsonIgnore
    public void resetPSCodeListName(){
        this.reset(FIELD_PSCODELISTNAME);
    }

    /**
     * 设置 系统代码表，详细说明：{@link #FIELD_PSCODELISTNAME}
     * <P>
     * 等同 {@link #setPSCodeListName}
     * @param pSCodeListName
     */
    @JsonIgnore
    public PSSysDEFType pscodelistname(String pSCodeListName){
        this.setPSCodeListName(pSCodeListName);
        return this;
    }

    /**
     * <B>PSDEFTYPEID</B>&nbsp;平台预置逻辑，指定系统属性类型逻辑重写的平台预置逻辑
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEFType} 
     */
    public final static String FIELD_PSDEFTYPEID = "psdeftypeid";

    /**
     * 设置 平台预置逻辑，详细说明：{@link #FIELD_PSDEFTYPEID}
     * 
     * @param pSDEFTypeId
     * 
     */
    @JsonProperty(FIELD_PSDEFTYPEID)
    public void setPSDEFTypeId(String pSDEFTypeId){
        this.set(FIELD_PSDEFTYPEID, pSDEFTypeId);
    }
    
    /**
     * 获取 平台预置逻辑  
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
     * 判断 平台预置逻辑 是否指定值，包括空值
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
     * 重置 平台预置逻辑
     */
    @JsonIgnore
    public void resetPSDEFTypeId(){
        this.reset(FIELD_PSDEFTYPEID);
    }

    /**
     * 设置 平台预置逻辑，详细说明：{@link #FIELD_PSDEFTYPEID}
     * <P>
     * 等同 {@link #setPSDEFTypeId}
     * @param pSDEFTypeId
     */
    @JsonIgnore
    public PSSysDEFType psdeftypeid(String pSDEFTypeId){
        this.setPSDEFTypeId(pSDEFTypeId);
        return this;
    }

    /**
     * <B>PSDEFTYPENAME</B>&nbsp;平台预置逻辑，指定系统属性类型逻辑重写的平台预置逻辑
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFTYPEID}
     */
    public final static String FIELD_PSDEFTYPENAME = "psdeftypename";

    /**
     * 设置 平台预置逻辑，详细说明：{@link #FIELD_PSDEFTYPENAME}
     * 
     * @param pSDEFTypeName
     * 
     */
    @JsonProperty(FIELD_PSDEFTYPENAME)
    public void setPSDEFTypeName(String pSDEFTypeName){
        this.set(FIELD_PSDEFTYPENAME, pSDEFTypeName);
    }
    
    /**
     * 获取 平台预置逻辑  
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
     * 判断 平台预置逻辑 是否指定值，包括空值
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
     * 重置 平台预置逻辑
     */
    @JsonIgnore
    public void resetPSDEFTypeName(){
        this.reset(FIELD_PSDEFTYPENAME);
    }

    /**
     * 设置 平台预置逻辑，详细说明：{@link #FIELD_PSDEFTYPENAME}
     * <P>
     * 等同 {@link #setPSDEFTypeName}
     * @param pSDEFTypeName
     */
    @JsonIgnore
    public PSSysDEFType psdeftypename(String pSDEFTypeName){
        this.setPSDEFTypeName(pSDEFTypeName);
        return this;
    }

    /**
     * <B>PSSYSDEFTYPEID</B>&nbsp;系统属性类型定义标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSDEFTYPEID = "pssysdeftypeid";

    /**
     * 设置 系统属性类型定义标识
     * 
     * @param pSSysDEFTypeId
     * 
     */
    @JsonProperty(FIELD_PSSYSDEFTYPEID)
    public void setPSSysDEFTypeId(String pSSysDEFTypeId){
        this.set(FIELD_PSSYSDEFTYPEID, pSSysDEFTypeId);
    }
    
    /**
     * 获取 系统属性类型定义标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysDEFTypeId(){
        Object objValue = this.get(FIELD_PSSYSDEFTYPEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统属性类型定义标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDEFTypeIdDirty(){
        if(this.contains(FIELD_PSSYSDEFTYPEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统属性类型定义标识
     */
    @JsonIgnore
    public void resetPSSysDEFTypeId(){
        this.reset(FIELD_PSSYSDEFTYPEID);
    }

    /**
     * 设置 系统属性类型定义标识
     * <P>
     * 等同 {@link #setPSSysDEFTypeId}
     * @param pSSysDEFTypeId
     */
    @JsonIgnore
    public PSSysDEFType pssysdeftypeid(String pSSysDEFTypeId){
        this.setPSSysDEFTypeId(pSSysDEFTypeId);
        return this;
    }

    /**
     * <B>PSSYSDEFTYPENAME</B>&nbsp;系统属性类型名称，指定系统属性类型的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSDEFTYPENAME = "pssysdeftypename";

    /**
     * 设置 系统属性类型名称，详细说明：{@link #FIELD_PSSYSDEFTYPENAME}
     * 
     * @param pSSysDEFTypeName
     * 
     */
    @JsonProperty(FIELD_PSSYSDEFTYPENAME)
    public void setPSSysDEFTypeName(String pSSysDEFTypeName){
        this.set(FIELD_PSSYSDEFTYPENAME, pSSysDEFTypeName);
    }
    
    /**
     * 获取 系统属性类型名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysDEFTypeName(){
        Object objValue = this.get(FIELD_PSSYSDEFTYPENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统属性类型名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDEFTypeNameDirty(){
        if(this.contains(FIELD_PSSYSDEFTYPENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统属性类型名称
     */
    @JsonIgnore
    public void resetPSSysDEFTypeName(){
        this.reset(FIELD_PSSYSDEFTYPENAME);
    }

    /**
     * 设置 系统属性类型名称，详细说明：{@link #FIELD_PSSYSDEFTYPENAME}
     * <P>
     * 等同 {@link #setPSSysDEFTypeName}
     * @param pSSysDEFTypeName
     */
    @JsonIgnore
    public PSSysDEFType pssysdeftypename(String pSSysDEFTypeName){
        this.setPSSysDEFTypeName(pSSysDEFTypeName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysDEFTypeName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysDEFTypeName(strName);
    }

    @JsonIgnore
    public PSSysDEFType name(String strName){
        this.setPSSysDEFTypeName(strName);
        return this;
    }

    /**
     * <B>PSSYSUNITID</B>&nbsp;系统单位，指定系统属性类型逻辑的默认系统单位，未定义时使用平台预置逻辑配置
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysUnit} 
     */
    public final static String FIELD_PSSYSUNITID = "pssysunitid";

    /**
     * 设置 系统单位，详细说明：{@link #FIELD_PSSYSUNITID}
     * 
     * @param pSSysUnitId
     * 
     */
    @JsonProperty(FIELD_PSSYSUNITID)
    public void setPSSysUnitId(String pSSysUnitId){
        this.set(FIELD_PSSYSUNITID, pSSysUnitId);
    }
    
    /**
     * 获取 系统单位  
     * @return
     */
    @JsonIgnore
    public String getPSSysUnitId(){
        Object objValue = this.get(FIELD_PSSYSUNITID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统单位 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUnitIdDirty(){
        if(this.contains(FIELD_PSSYSUNITID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统单位
     */
    @JsonIgnore
    public void resetPSSysUnitId(){
        this.reset(FIELD_PSSYSUNITID);
    }

    /**
     * 设置 系统单位，详细说明：{@link #FIELD_PSSYSUNITID}
     * <P>
     * 等同 {@link #setPSSysUnitId}
     * @param pSSysUnitId
     */
    @JsonIgnore
    public PSSysDEFType pssysunitid(String pSSysUnitId){
        this.setPSSysUnitId(pSSysUnitId);
        return this;
    }

    /**
     * 设置 系统单位，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysUnitId}
     * @param pSSysUnit 引用对象
     */
    @JsonIgnore
    public PSSysDEFType pssysunitid(PSSysUnit pSSysUnit){
        if(pSSysUnit == null){
            this.setPSSysUnitId(null);
            this.setPSSysUnitName(null);
        }
        else{
            this.setPSSysUnitId(pSSysUnit.getPSSysUnitId());
            this.setPSSysUnitName(pSSysUnit.getPSSysUnitName());
        }
        return this;
    }

    /**
     * <B>PSSYSUNITNAME</B>&nbsp;系统单位，指定系统属性类型逻辑的默认系统单位，未定义时使用平台预置逻辑配置
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSUNITID}
     */
    public final static String FIELD_PSSYSUNITNAME = "pssysunitname";

    /**
     * 设置 系统单位，详细说明：{@link #FIELD_PSSYSUNITNAME}
     * 
     * @param pSSysUnitName
     * 
     */
    @JsonProperty(FIELD_PSSYSUNITNAME)
    public void setPSSysUnitName(String pSSysUnitName){
        this.set(FIELD_PSSYSUNITNAME, pSSysUnitName);
    }
    
    /**
     * 获取 系统单位  
     * @return
     */
    @JsonIgnore
    public String getPSSysUnitName(){
        Object objValue = this.get(FIELD_PSSYSUNITNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统单位 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUnitNameDirty(){
        if(this.contains(FIELD_PSSYSUNITNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统单位
     */
    @JsonIgnore
    public void resetPSSysUnitName(){
        this.reset(FIELD_PSSYSUNITNAME);
    }

    /**
     * 设置 系统单位，详细说明：{@link #FIELD_PSSYSUNITNAME}
     * <P>
     * 等同 {@link #setPSSysUnitName}
     * @param pSSysUnitName
     */
    @JsonIgnore
    public PSSysDEFType pssysunitname(String pSSysUnitName){
        this.setPSSysUnitName(pSSysUnitName);
        return this;
    }

    /**
     * <B>PSSYSVALUERULEID</B>&nbsp;系统值规则，指定系统属性类型逻辑的默认系统值规则，未定义时使用平台预置逻辑配置
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysValueRule} 
     */
    public final static String FIELD_PSSYSVALUERULEID = "pssysvalueruleid";

    /**
     * 设置 系统值规则，详细说明：{@link #FIELD_PSSYSVALUERULEID}
     * 
     * @param pSSysValueRuleId
     * 
     */
    @JsonProperty(FIELD_PSSYSVALUERULEID)
    public void setPSSysValueRuleId(String pSSysValueRuleId){
        this.set(FIELD_PSSYSVALUERULEID, pSSysValueRuleId);
    }
    
    /**
     * 获取 系统值规则  
     * @return
     */
    @JsonIgnore
    public String getPSSysValueRuleId(){
        Object objValue = this.get(FIELD_PSSYSVALUERULEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统值规则 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysValueRuleIdDirty(){
        if(this.contains(FIELD_PSSYSVALUERULEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统值规则
     */
    @JsonIgnore
    public void resetPSSysValueRuleId(){
        this.reset(FIELD_PSSYSVALUERULEID);
    }

    /**
     * 设置 系统值规则，详细说明：{@link #FIELD_PSSYSVALUERULEID}
     * <P>
     * 等同 {@link #setPSSysValueRuleId}
     * @param pSSysValueRuleId
     */
    @JsonIgnore
    public PSSysDEFType pssysvalueruleid(String pSSysValueRuleId){
        this.setPSSysValueRuleId(pSSysValueRuleId);
        return this;
    }

    /**
     * 设置 系统值规则，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysValueRuleId}
     * @param pSSysValueRule 引用对象
     */
    @JsonIgnore
    public PSSysDEFType pssysvalueruleid(PSSysValueRule pSSysValueRule){
        if(pSSysValueRule == null){
            this.setPSSysValueRuleId(null);
            this.setPSSysValueRuleName(null);
        }
        else{
            this.setPSSysValueRuleId(pSSysValueRule.getPSSysValueRuleId());
            this.setPSSysValueRuleName(pSSysValueRule.getPSSysValueRuleName());
        }
        return this;
    }

    /**
     * <B>PSSYSVALUERULENAME</B>&nbsp;系统值规则，指定系统属性类型逻辑的默认系统值规则，未定义时使用平台预置逻辑配置
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSVALUERULEID}
     */
    public final static String FIELD_PSSYSVALUERULENAME = "pssysvaluerulename";

    /**
     * 设置 系统值规则，详细说明：{@link #FIELD_PSSYSVALUERULENAME}
     * 
     * @param pSSysValueRuleName
     * 
     */
    @JsonProperty(FIELD_PSSYSVALUERULENAME)
    public void setPSSysValueRuleName(String pSSysValueRuleName){
        this.set(FIELD_PSSYSVALUERULENAME, pSSysValueRuleName);
    }
    
    /**
     * 获取 系统值规则  
     * @return
     */
    @JsonIgnore
    public String getPSSysValueRuleName(){
        Object objValue = this.get(FIELD_PSSYSVALUERULENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统值规则 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysValueRuleNameDirty(){
        if(this.contains(FIELD_PSSYSVALUERULENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统值规则
     */
    @JsonIgnore
    public void resetPSSysValueRuleName(){
        this.reset(FIELD_PSSYSVALUERULENAME);
    }

    /**
     * 设置 系统值规则，详细说明：{@link #FIELD_PSSYSVALUERULENAME}
     * <P>
     * 等同 {@link #setPSSysValueRuleName}
     * @param pSSysValueRuleName
     */
    @JsonIgnore
    public PSSysDEFType pssysvaluerulename(String pSSysValueRuleName){
        this.setPSSysValueRuleName(pSSysValueRuleName);
        return this;
    }

    /**
     * <B>PYFORMAT</B>&nbsp;PY格式化，指定系统属性类型逻辑的默认PY格式化串，未定义时使用平台预置逻辑配置
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_PYFORMAT = "pyformat";

    /**
     * 设置 PY格式化，详细说明：{@link #FIELD_PYFORMAT}
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
     * 设置 PY格式化，详细说明：{@link #FIELD_PYFORMAT}
     * <P>
     * 等同 {@link #setPYFormat}
     * @param pYFormat
     */
    @JsonIgnore
    public PSSysDEFType pyformat(String pYFormat){
        this.setPYFormat(pYFormat);
        return this;
    }

    /**
     * <B>SEARCHEDITORHEIGHT</B>&nbsp;搜索编辑器高度，指定系统属性类型逻辑的默认搜索编辑器高度，未定义时使用平台预置逻辑配置
     */
    public final static String FIELD_SEARCHEDITORHEIGHT = "searcheditorheight";

    /**
     * 设置 搜索编辑器高度，详细说明：{@link #FIELD_SEARCHEDITORHEIGHT}
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
     * 设置 搜索编辑器高度，详细说明：{@link #FIELD_SEARCHEDITORHEIGHT}
     * <P>
     * 等同 {@link #setSearchEditorHeight}
     * @param searchEditorHeight
     */
    @JsonIgnore
    public PSSysDEFType searcheditorheight(Integer searchEditorHeight){
        this.setSearchEditorHeight(searchEditorHeight);
        return this;
    }

    /**
     * <B>SEARCHEDITORTYPE</B>&nbsp;搜索编辑器类型，指定系统属性类型逻辑的默认搜索编辑器类型，未定义时使用平台预置逻辑配置
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_SEARCHEDITORTYPE = "searcheditortype";

    /**
     * 设置 搜索编辑器类型，详细说明：{@link #FIELD_SEARCHEDITORTYPE}
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
     * 设置 搜索编辑器类型，详细说明：{@link #FIELD_SEARCHEDITORTYPE}
     * <P>
     * 等同 {@link #setSearchEditorType}
     * @param searchEditorType
     */
    @JsonIgnore
    public PSSysDEFType searcheditortype(String searchEditorType){
        this.setSearchEditorType(searchEditorType);
        return this;
    }

    /**
     * <B>SEARCHEDITORWIDTH</B>&nbsp;搜索编辑器宽度，指定系统属性类型逻辑的默认搜索编辑器宽度，未定义时使用平台预置逻辑配置
     */
    public final static String FIELD_SEARCHEDITORWIDTH = "searcheditorwidth";

    /**
     * 设置 搜索编辑器宽度，详细说明：{@link #FIELD_SEARCHEDITORWIDTH}
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
     * 设置 搜索编辑器宽度，详细说明：{@link #FIELD_SEARCHEDITORWIDTH}
     * <P>
     * 等同 {@link #setSearchEditorWidth}
     * @param searchEditorWidth
     */
    @JsonIgnore
    public PSSysDEFType searcheditorwidth(Integer searchEditorWidth){
        this.setSearchEditorWidth(searchEditorWidth);
        return this;
    }

    /**
     * <B>SEARCHMBEDITORHEIGHT</B>&nbsp;搜索移动端编辑器高度，指定系统属性类型逻辑的默认移动端搜索编辑器高度，未定义时使用平台预置逻辑配置
     */
    public final static String FIELD_SEARCHMBEDITORHEIGHT = "searchmbeditorheight";

    /**
     * 设置 搜索移动端编辑器高度，详细说明：{@link #FIELD_SEARCHMBEDITORHEIGHT}
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
     * 设置 搜索移动端编辑器高度，详细说明：{@link #FIELD_SEARCHMBEDITORHEIGHT}
     * <P>
     * 等同 {@link #setSearchMBEditorHeight}
     * @param searchMBEditorHeight
     */
    @JsonIgnore
    public PSSysDEFType searchmbeditorheight(Integer searchMBEditorHeight){
        this.setSearchMBEditorHeight(searchMBEditorHeight);
        return this;
    }

    /**
     * <B>SEARCHMBEDITORTYPE</B>&nbsp;搜索移动端编辑器类型，指定系统属性类型逻辑的默认移动端搜索编辑器类型，未定义时使用平台预置逻辑配置
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_SEARCHMBEDITORTYPE = "searchmbeditortype";

    /**
     * 设置 搜索移动端编辑器类型，详细说明：{@link #FIELD_SEARCHMBEDITORTYPE}
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
     * 设置 搜索移动端编辑器类型，详细说明：{@link #FIELD_SEARCHMBEDITORTYPE}
     * <P>
     * 等同 {@link #setSearchMBEditorType}
     * @param searchMBEditorType
     */
    @JsonIgnore
    public PSSysDEFType searchmbeditortype(String searchMBEditorType){
        this.setSearchMBEditorType(searchMBEditorType);
        return this;
    }

    /**
     * <B>SEARCHMBEDITORWIDTH</B>&nbsp;搜索移动端编辑器宽度，指定系统属性类型逻辑的默认移动端搜索编辑器宽度，未定义时使用平台预置逻辑配置
     */
    public final static String FIELD_SEARCHMBEDITORWIDTH = "searchmbeditorwidth";

    /**
     * 设置 搜索移动端编辑器宽度，详细说明：{@link #FIELD_SEARCHMBEDITORWIDTH}
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
     * 设置 搜索移动端编辑器宽度，详细说明：{@link #FIELD_SEARCHMBEDITORWIDTH}
     * <P>
     * 等同 {@link #setSearchMBEditorWidth}
     * @param searchMBEditorWidth
     */
    @JsonIgnore
    public PSSysDEFType searchmbeditorwidth(Integer searchMBEditorWidth){
        this.setSearchMBEditorWidth(searchMBEditorWidth);
        return this;
    }

    /**
     * <B>STDDATATYPE</B>&nbsp;标准数据类型，指定系统属性类型逻辑的标准数据类型，未定义时使用默认属性类型逻辑配置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.StdDataType} 
     */
    public final static String FIELD_STDDATATYPE = "stddatatype";

    /**
     * 设置 标准数据类型，详细说明：{@link #FIELD_STDDATATYPE}
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
     * 设置 标准数据类型，详细说明：{@link #FIELD_STDDATATYPE}
     * <P>
     * 等同 {@link #setStdDataType}
     * @param stdDataType
     */
    @JsonIgnore
    public PSSysDEFType stddatatype(Integer stdDataType){
        this.setStdDataType(stdDataType);
        return this;
    }

     /**
     * 设置 标准数据类型，详细说明：{@link #FIELD_STDDATATYPE}
     * <P>
     * 等同 {@link #setStdDataType}
     * @param stdDataType
     */
    @JsonIgnore
    public PSSysDEFType stddatatype(net.ibizsys.psmodel.core.util.PSModelEnums.StdDataType stdDataType){
        if(stdDataType == null){
            this.setStdDataType(null);
        }
        else{
            this.setStdDataType(stdDataType.value);
        }
        return this;
    }

    /**
     * <B>STRLENGTH</B>&nbsp;长度，指定系统属性类型逻辑的默认字符串长度，未定义时使用平台预置逻辑配置
     */
    public final static String FIELD_STRLENGTH = "strlength";

    /**
     * 设置 长度，详细说明：{@link #FIELD_STRLENGTH}
     * 
     * @param strLength
     * 
     */
    @JsonProperty(FIELD_STRLENGTH)
    public void setStrLength(Integer strLength){
        this.set(FIELD_STRLENGTH, strLength);
    }
    
    /**
     * 获取 长度  
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
     * 判断 长度 是否指定值，包括空值
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
     * 重置 长度
     */
    @JsonIgnore
    public void resetStrLength(){
        this.reset(FIELD_STRLENGTH);
    }

    /**
     * 设置 长度，详细说明：{@link #FIELD_STRLENGTH}
     * <P>
     * 等同 {@link #setStrLength}
     * @param strLength
     */
    @JsonIgnore
    public PSSysDEFType strlength(Integer strLength){
        this.setStrLength(strLength);
        return this;
    }

    /**
     * <B>TSFORMAT</B>&nbsp;TS格式化，指定系统属性类型逻辑的默认TS格式化串，未定义时使用平台预置逻辑配置
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_TSFORMAT = "tsformat";

    /**
     * 设置 TS格式化，详细说明：{@link #FIELD_TSFORMAT}
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
     * 设置 TS格式化，详细说明：{@link #FIELD_TSFORMAT}
     * <P>
     * 等同 {@link #setTSFormat}
     * @param tSFormat
     */
    @JsonIgnore
    public PSSysDEFType tsformat(String tSFormat){
        this.setTSFormat(tSFormat);
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
    public PSSysDEFType updatedate(String updateDate){
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
    public PSSysDEFType updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>VALIDFLAG</B>&nbsp;启用
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_VALIDFLAG = "validflag";

    /**
     * 设置 启用
     * 
     * @param validFlag
     * 
     */
    @JsonProperty(FIELD_VALIDFLAG)
    public void setValidFlag(Integer validFlag){
        this.set(FIELD_VALIDFLAG, validFlag);
    }
    
    /**
     * 获取 启用  
     * @return
     */
    @JsonIgnore
    public Integer getValidFlag(){
        Object objValue = this.get(FIELD_VALIDFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isValidFlagDirty(){
        if(this.contains(FIELD_VALIDFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用
     */
    @JsonIgnore
    public void resetValidFlag(){
        this.reset(FIELD_VALIDFLAG);
    }

    /**
     * 设置 启用
     * <P>
     * 等同 {@link #setValidFlag}
     * @param validFlag
     */
    @JsonIgnore
    public PSSysDEFType validflag(Integer validFlag){
        this.setValidFlag(validFlag);
        return this;
    }

     /**
     * 设置 启用
     * <P>
     * 等同 {@link #setValidFlag}
     * @param validFlag
     */
    @JsonIgnore
    public PSSysDEFType validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>VALUEFORMAT</B>&nbsp;值格式化，指定系统属性类型逻辑的默认值格式化串，未定义时使用平台预置逻辑配置
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_VALUEFORMAT = "valueformat";

    /**
     * 设置 值格式化，详细说明：{@link #FIELD_VALUEFORMAT}
     * 
     * @param valueFormat
     * 
     */
    @JsonProperty(FIELD_VALUEFORMAT)
    public void setValueFormat(String valueFormat){
        this.set(FIELD_VALUEFORMAT, valueFormat);
    }
    
    /**
     * 获取 值格式化  
     * @return
     */
    @JsonIgnore
    public String getValueFormat(){
        Object objValue = this.get(FIELD_VALUEFORMAT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值格式化 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isValueFormatDirty(){
        if(this.contains(FIELD_VALUEFORMAT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值格式化
     */
    @JsonIgnore
    public void resetValueFormat(){
        this.reset(FIELD_VALUEFORMAT);
    }

    /**
     * 设置 值格式化，详细说明：{@link #FIELD_VALUEFORMAT}
     * <P>
     * 等同 {@link #setValueFormat}
     * @param valueFormat
     */
    @JsonIgnore
    public PSSysDEFType valueformat(String valueFormat){
        this.setValueFormat(valueFormat);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysDEFTypeId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysDEFTypeId(strValue);
    }

    @JsonIgnore
    public PSSysDEFType id(String strValue){
        this.setPSSysDEFTypeId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysDEFType){
            PSSysDEFType model = (PSSysDEFType)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
