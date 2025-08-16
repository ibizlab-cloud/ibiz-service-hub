package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSSEARCHBARITEM</B>系统搜索栏项 模型传输对象
 * <P>
 * 搜索栏部件子项模型，定义搜索栏提供的分组条件过滤能力、属性过滤能力及快速搜索能力
 */
public class PSSysSearchBarItem extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysSearchBarItem(){
        this.setValidFlag(1);
    }      

    /**
     * <B>ADDSEPARATOR</B>&nbsp;增加分隔栏，指定输出搜素项界面时是否先输出分隔栏，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ADDSEPARATOR = "addseparator";

    /**
     * 设置 增加分隔栏，详细说明：{@link #FIELD_ADDSEPARATOR}
     * 
     * @param addSeparator
     * 
     */
    @JsonProperty(FIELD_ADDSEPARATOR)
    public void setAddSeparator(Integer addSeparator){
        this.set(FIELD_ADDSEPARATOR, addSeparator);
    }
    
    /**
     * 获取 增加分隔栏  
     * @return
     */
    @JsonIgnore
    public Integer getAddSeparator(){
        Object objValue = this.get(FIELD_ADDSEPARATOR);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 增加分隔栏 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAddSeparatorDirty(){
        if(this.contains(FIELD_ADDSEPARATOR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 增加分隔栏
     */
    @JsonIgnore
    public void resetAddSeparator(){
        this.reset(FIELD_ADDSEPARATOR);
    }

    /**
     * 设置 增加分隔栏，详细说明：{@link #FIELD_ADDSEPARATOR}
     * <P>
     * 等同 {@link #setAddSeparator}
     * @param addSeparator
     */
    @JsonIgnore
    public PSSysSearchBarItem addseparator(Integer addSeparator){
        this.setAddSeparator(addSeparator);
        return this;
    }

     /**
     * 设置 增加分隔栏，详细说明：{@link #FIELD_ADDSEPARATOR}
     * <P>
     * 等同 {@link #setAddSeparator}
     * @param addSeparator
     */
    @JsonIgnore
    public PSSysSearchBarItem addseparator(Boolean addSeparator){
        if(addSeparator == null){
            this.setAddSeparator(null);
        }
        else{
            this.setAddSeparator(addSeparator?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CAPPSLANRESID</B>&nbsp;标题语言资源，指定搜索栏部件成员的标题的多语言资源对象，未定义时搜索栏过滤项使用关联属性搜索模式的配置
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_CAPPSLANRESID = "cappslanresid";

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_CAPPSLANRESID}
     * 
     * @param capPSLanResId
     * 
     */
    @JsonProperty(FIELD_CAPPSLANRESID)
    public void setCapPSLanResId(String capPSLanResId){
        this.set(FIELD_CAPPSLANRESID, capPSLanResId);
    }
    
    /**
     * 获取 标题语言资源  
     * @return
     */
    @JsonIgnore
    public String getCapPSLanResId(){
        Object objValue = this.get(FIELD_CAPPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标题语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCapPSLanResIdDirty(){
        if(this.contains(FIELD_CAPPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题语言资源
     */
    @JsonIgnore
    public void resetCapPSLanResId(){
        this.reset(FIELD_CAPPSLANRESID);
    }

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_CAPPSLANRESID}
     * <P>
     * 等同 {@link #setCapPSLanResId}
     * @param capPSLanResId
     */
    @JsonIgnore
    public PSSysSearchBarItem cappslanresid(String capPSLanResId){
        this.setCapPSLanResId(capPSLanResId);
        return this;
    }

    /**
     * 设置 标题语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setCapPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSSysSearchBarItem cappslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setCapPSLanResId(null);
            this.setCapPSLanResName(null);
        }
        else{
            this.setCapPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setCapPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>CAPPSLANRESNAME</B>&nbsp;标题语言资源，指定搜索栏部件成员的标题的多语言资源对象，未定义时搜索栏过滤项使用关联属性搜索模式的配置
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CAPPSLANRESID}
     */
    public final static String FIELD_CAPPSLANRESNAME = "cappslanresname";

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_CAPPSLANRESNAME}
     * 
     * @param capPSLanResName
     * 
     */
    @JsonProperty(FIELD_CAPPSLANRESNAME)
    public void setCapPSLanResName(String capPSLanResName){
        this.set(FIELD_CAPPSLANRESNAME, capPSLanResName);
    }
    
    /**
     * 获取 标题语言资源  
     * @return
     */
    @JsonIgnore
    public String getCapPSLanResName(){
        Object objValue = this.get(FIELD_CAPPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标题语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCapPSLanResNameDirty(){
        if(this.contains(FIELD_CAPPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题语言资源
     */
    @JsonIgnore
    public void resetCapPSLanResName(){
        this.reset(FIELD_CAPPSLANRESNAME);
    }

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_CAPPSLANRESNAME}
     * <P>
     * 等同 {@link #setCapPSLanResName}
     * @param capPSLanResName
     */
    @JsonIgnore
    public PSSysSearchBarItem cappslanresname(String capPSLanResName){
        this.setCapPSLanResName(capPSLanResName);
        return this;
    }

    /**
     * <B>CAPTION</B>&nbsp;标题，指定搜索栏部件成员的标题，未定义时搜索栏过滤项使用关联属性搜索模式的标题
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CAPTION = "caption";

    /**
     * 设置 标题，详细说明：{@link #FIELD_CAPTION}
     * 
     * @param caption
     * 
     */
    @JsonProperty(FIELD_CAPTION)
    public void setCaption(String caption){
        this.set(FIELD_CAPTION, caption);
    }
    
    /**
     * 获取 标题  
     * @return
     */
    @JsonIgnore
    public String getCaption(){
        Object objValue = this.get(FIELD_CAPTION);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标题 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCaptionDirty(){
        if(this.contains(FIELD_CAPTION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题
     */
    @JsonIgnore
    public void resetCaption(){
        this.reset(FIELD_CAPTION);
    }

    /**
     * 设置 标题，详细说明：{@link #FIELD_CAPTION}
     * <P>
     * 等同 {@link #setCaption}
     * @param caption
     */
    @JsonIgnore
    public PSSysSearchBarItem caption(String caption){
        this.setCaption(caption);
        return this;
    }

    /**
     * <B>CONTENTTYPE</B>&nbsp;内容类型，指定搜索栏直接内容项的内容类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.RawItemContentType} 
     */
    public final static String FIELD_CONTENTTYPE = "contenttype";

    /**
     * 设置 内容类型，详细说明：{@link #FIELD_CONTENTTYPE}
     * 
     * @param contentType
     * 
     */
    @JsonProperty(FIELD_CONTENTTYPE)
    public void setContentType(String contentType){
        this.set(FIELD_CONTENTTYPE, contentType);
    }
    
    /**
     * 获取 内容类型  
     * @return
     */
    @JsonIgnore
    public String getContentType(){
        Object objValue = this.get(FIELD_CONTENTTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 内容类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isContentTypeDirty(){
        if(this.contains(FIELD_CONTENTTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内容类型
     */
    @JsonIgnore
    public void resetContentType(){
        this.reset(FIELD_CONTENTTYPE);
    }

    /**
     * 设置 内容类型，详细说明：{@link #FIELD_CONTENTTYPE}
     * <P>
     * 等同 {@link #setContentType}
     * @param contentType
     */
    @JsonIgnore
    public PSSysSearchBarItem contenttype(String contentType){
        this.setContentType(contentType);
        return this;
    }

     /**
     * 设置 内容类型，详细说明：{@link #FIELD_CONTENTTYPE}
     * <P>
     * 等同 {@link #setContentType}
     * @param contentType
     */
    @JsonIgnore
    public PSSysSearchBarItem contenttype(net.ibizsys.psmodel.core.util.PSModelEnums.RawItemContentType contentType){
        if(contentType == null){
            this.setContentType(null);
        }
        else{
            this.setContentType(contentType.value);
        }
        return this;
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
    public PSSysSearchBarItem createdate(String createDate){
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
    public PSSysSearchBarItem createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CTRLDYNACLASS</B>&nbsp;部件动态样式表
     */
    public final static String FIELD_CTRLDYNACLASS = "ctrldynaclass";

    /**
     * 设置 部件动态样式表
     * 
     * @param ctrlDynaClass
     * 
     */
    @JsonProperty(FIELD_CTRLDYNACLASS)
    public void setCtrlDynaClass(String ctrlDynaClass){
        this.set(FIELD_CTRLDYNACLASS, ctrlDynaClass);
    }
    
    /**
     * 获取 部件动态样式表  
     * @return
     */
    @JsonIgnore
    public String getCtrlDynaClass(){
        Object objValue = this.get(FIELD_CTRLDYNACLASS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件动态样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlDynaClassDirty(){
        if(this.contains(FIELD_CTRLDYNACLASS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件动态样式表
     */
    @JsonIgnore
    public void resetCtrlDynaClass(){
        this.reset(FIELD_CTRLDYNACLASS);
    }

    /**
     * 设置 部件动态样式表
     * <P>
     * 等同 {@link #setCtrlDynaClass}
     * @param ctrlDynaClass
     */
    @JsonIgnore
    public PSSysSearchBarItem ctrldynaclass(String ctrlDynaClass){
        this.setCtrlDynaClass(ctrlDynaClass);
        return this;
    }

    /**
     * <B>CTRLHEIGHT</B>&nbsp;控件高度
     */
    public final static String FIELD_CTRLHEIGHT = "ctrlheight";

    /**
     * 设置 控件高度
     * 
     * @param ctrlHeight
     * 
     */
    @JsonProperty(FIELD_CTRLHEIGHT)
    public void setCtrlHeight(Integer ctrlHeight){
        this.set(FIELD_CTRLHEIGHT, ctrlHeight);
    }
    
    /**
     * 获取 控件高度  
     * @return
     */
    @JsonIgnore
    public Integer getCtrlHeight(){
        Object objValue = this.get(FIELD_CTRLHEIGHT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 控件高度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlHeightDirty(){
        if(this.contains(FIELD_CTRLHEIGHT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 控件高度
     */
    @JsonIgnore
    public void resetCtrlHeight(){
        this.reset(FIELD_CTRLHEIGHT);
    }

    /**
     * 设置 控件高度
     * <P>
     * 等同 {@link #setCtrlHeight}
     * @param ctrlHeight
     */
    @JsonIgnore
    public PSSysSearchBarItem ctrlheight(Integer ctrlHeight){
        this.setCtrlHeight(ctrlHeight);
        return this;
    }

    /**
     * <B>CTRLPSSYSCSSID</B>&nbsp;部件样式表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCss} 
     */
    public final static String FIELD_CTRLPSSYSCSSID = "ctrlpssyscssid";

    /**
     * 设置 部件样式表
     * 
     * @param ctrlPSSysCssId
     * 
     */
    @JsonProperty(FIELD_CTRLPSSYSCSSID)
    public void setCtrlPSSysCssId(String ctrlPSSysCssId){
        this.set(FIELD_CTRLPSSYSCSSID, ctrlPSSysCssId);
    }
    
    /**
     * 获取 部件样式表  
     * @return
     */
    @JsonIgnore
    public String getCtrlPSSysCssId(){
        Object objValue = this.get(FIELD_CTRLPSSYSCSSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlPSSysCssIdDirty(){
        if(this.contains(FIELD_CTRLPSSYSCSSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件样式表
     */
    @JsonIgnore
    public void resetCtrlPSSysCssId(){
        this.reset(FIELD_CTRLPSSYSCSSID);
    }

    /**
     * 设置 部件样式表
     * <P>
     * 等同 {@link #setCtrlPSSysCssId}
     * @param ctrlPSSysCssId
     */
    @JsonIgnore
    public PSSysSearchBarItem ctrlpssyscssid(String ctrlPSSysCssId){
        this.setCtrlPSSysCssId(ctrlPSSysCssId);
        return this;
    }

    /**
     * 设置 部件样式表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setCtrlPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSSysSearchBarItem ctrlpssyscssid(PSSysCss pSSysCss){
        if(pSSysCss == null){
            this.setCtrlPSSysCssId(null);
            this.setCtrlPSSysCssName(null);
        }
        else{
            this.setCtrlPSSysCssId(pSSysCss.getPSSysCssId());
            this.setCtrlPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    /**
     * <B>CTRLPSSYSCSSNAME</B>&nbsp;部件样式表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CTRLPSSYSCSSID}
     */
    public final static String FIELD_CTRLPSSYSCSSNAME = "ctrlpssyscssname";

    /**
     * 设置 部件样式表
     * 
     * @param ctrlPSSysCssName
     * 
     */
    @JsonProperty(FIELD_CTRLPSSYSCSSNAME)
    public void setCtrlPSSysCssName(String ctrlPSSysCssName){
        this.set(FIELD_CTRLPSSYSCSSNAME, ctrlPSSysCssName);
    }
    
    /**
     * 获取 部件样式表  
     * @return
     */
    @JsonIgnore
    public String getCtrlPSSysCssName(){
        Object objValue = this.get(FIELD_CTRLPSSYSCSSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlPSSysCssNameDirty(){
        if(this.contains(FIELD_CTRLPSSYSCSSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件样式表
     */
    @JsonIgnore
    public void resetCtrlPSSysCssName(){
        this.reset(FIELD_CTRLPSSYSCSSNAME);
    }

    /**
     * 设置 部件样式表
     * <P>
     * 等同 {@link #setCtrlPSSysCssName}
     * @param ctrlPSSysCssName
     */
    @JsonIgnore
    public PSSysSearchBarItem ctrlpssyscssname(String ctrlPSSysCssName){
        this.setCtrlPSSysCssName(ctrlPSSysCssName);
        return this;
    }

    /**
     * <B>CTRLRAWCSSSTYLE</B>&nbsp;部件直接样式
     */
    public final static String FIELD_CTRLRAWCSSSTYLE = "ctrlrawcssstyle";

    /**
     * 设置 部件直接样式
     * 
     * @param ctrlRawCssStyle
     * 
     */
    @JsonProperty(FIELD_CTRLRAWCSSSTYLE)
    public void setCtrlRawCssStyle(String ctrlRawCssStyle){
        this.set(FIELD_CTRLRAWCSSSTYLE, ctrlRawCssStyle);
    }
    
    /**
     * 获取 部件直接样式  
     * @return
     */
    @JsonIgnore
    public String getCtrlRawCssStyle(){
        Object objValue = this.get(FIELD_CTRLRAWCSSSTYLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件直接样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlRawCssStyleDirty(){
        if(this.contains(FIELD_CTRLRAWCSSSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件直接样式
     */
    @JsonIgnore
    public void resetCtrlRawCssStyle(){
        this.reset(FIELD_CTRLRAWCSSSTYLE);
    }

    /**
     * 设置 部件直接样式
     * <P>
     * 等同 {@link #setCtrlRawCssStyle}
     * @param ctrlRawCssStyle
     */
    @JsonIgnore
    public PSSysSearchBarItem ctrlrawcssstyle(String ctrlRawCssStyle){
        this.setCtrlRawCssStyle(ctrlRawCssStyle);
        return this;
    }

    /**
     * <B>CTRLWIDTH</B>&nbsp;控件宽度
     */
    public final static String FIELD_CTRLWIDTH = "ctrlwidth";

    /**
     * 设置 控件宽度
     * 
     * @param ctrlWidth
     * 
     */
    @JsonProperty(FIELD_CTRLWIDTH)
    public void setCtrlWidth(Integer ctrlWidth){
        this.set(FIELD_CTRLWIDTH, ctrlWidth);
    }
    
    /**
     * 获取 控件宽度  
     * @return
     */
    @JsonIgnore
    public Integer getCtrlWidth(){
        Object objValue = this.get(FIELD_CTRLWIDTH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 控件宽度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlWidthDirty(){
        if(this.contains(FIELD_CTRLWIDTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 控件宽度
     */
    @JsonIgnore
    public void resetCtrlWidth(){
        this.reset(FIELD_CTRLWIDTH);
    }

    /**
     * 设置 控件宽度
     * <P>
     * 等同 {@link #setCtrlWidth}
     * @param ctrlWidth
     */
    @JsonIgnore
    public PSSysSearchBarItem ctrlwidth(Integer ctrlWidth){
        this.setCtrlWidth(ctrlWidth);
        return this;
    }

    /**
     * <B>DATA</B>&nbsp;项数据，指定搜索栏快速分组项的过滤条件数据
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_DATA = "data";

    /**
     * 设置 项数据，详细说明：{@link #FIELD_DATA}
     * 
     * @param data
     * 
     */
    @JsonProperty(FIELD_DATA)
    public void setData(String data){
        this.set(FIELD_DATA, data);
    }
    
    /**
     * 获取 项数据  
     * @return
     */
    @JsonIgnore
    public String getData(){
        Object objValue = this.get(FIELD_DATA);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项数据 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDataDirty(){
        if(this.contains(FIELD_DATA)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项数据
     */
    @JsonIgnore
    public void resetData(){
        this.reset(FIELD_DATA);
    }

    /**
     * 设置 项数据，详细说明：{@link #FIELD_DATA}
     * <P>
     * 等同 {@link #setData}
     * @param data
     */
    @JsonIgnore
    public PSSysSearchBarItem data(String data){
        this.setData(data);
        return this;
    }

    /**
     * <B>DEFAULTFLAG</B>&nbsp;默认搜索项
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEFAULTFLAG = "defaultflag";

    /**
     * 设置 默认搜索项
     * 
     * @param defaultFlag
     * 
     */
    @JsonProperty(FIELD_DEFAULTFLAG)
    public void setDefaultFlag(Integer defaultFlag){
        this.set(FIELD_DEFAULTFLAG, defaultFlag);
    }
    
    /**
     * 获取 默认搜索项  
     * @return
     */
    @JsonIgnore
    public Integer getDefaultFlag(){
        Object objValue = this.get(FIELD_DEFAULTFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认搜索项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefaultFlagDirty(){
        if(this.contains(FIELD_DEFAULTFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认搜索项
     */
    @JsonIgnore
    public void resetDefaultFlag(){
        this.reset(FIELD_DEFAULTFLAG);
    }

    /**
     * 设置 默认搜索项
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSSysSearchBarItem defaultflag(Integer defaultFlag){
        this.setDefaultFlag(defaultFlag);
        return this;
    }

     /**
     * 设置 默认搜索项
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSSysSearchBarItem defaultflag(Boolean defaultFlag){
        if(defaultFlag == null){
            this.setDefaultFlag(null);
        }
        else{
            this.setDefaultFlag(defaultFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DYNACLASS</B>&nbsp;动态样式表
     */
    public final static String FIELD_DYNACLASS = "dynaclass";

    /**
     * 设置 动态样式表
     * 
     * @param dynaClass
     * 
     */
    @JsonProperty(FIELD_DYNACLASS)
    public void setDynaClass(String dynaClass){
        this.set(FIELD_DYNACLASS, dynaClass);
    }
    
    /**
     * 获取 动态样式表  
     * @return
     */
    @JsonIgnore
    public String getDynaClass(){
        Object objValue = this.get(FIELD_DYNACLASS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 动态样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDynaClassDirty(){
        if(this.contains(FIELD_DYNACLASS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 动态样式表
     */
    @JsonIgnore
    public void resetDynaClass(){
        this.reset(FIELD_DYNACLASS);
    }

    /**
     * 设置 动态样式表
     * <P>
     * 等同 {@link #setDynaClass}
     * @param dynaClass
     */
    @JsonIgnore
    public PSSysSearchBarItem dynaclass(String dynaClass){
        this.setDynaClass(dynaClass);
        return this;
    }

    /**
     * <B>EDITORPARAMS</B>&nbsp;编辑器参数
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_EDITORPARAMS = "editorparams";

    /**
     * 设置 编辑器参数
     * 
     * @param editorParams
     * 
     */
    @JsonProperty(FIELD_EDITORPARAMS)
    public void setEditorParams(String editorParams){
        this.set(FIELD_EDITORPARAMS, editorParams);
    }
    
    /**
     * 获取 编辑器参数  
     * @return
     */
    @JsonIgnore
    public String getEditorParams(){
        Object objValue = this.get(FIELD_EDITORPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 编辑器参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEditorParamsDirty(){
        if(this.contains(FIELD_EDITORPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 编辑器参数
     */
    @JsonIgnore
    public void resetEditorParams(){
        this.reset(FIELD_EDITORPARAMS);
    }

    /**
     * 设置 编辑器参数
     * <P>
     * 等同 {@link #setEditorParams}
     * @param editorParams
     */
    @JsonIgnore
    public PSSysSearchBarItem editorparams(String editorParams){
        this.setEditorParams(editorParams);
        return this;
    }

    /**
     * <B>EDITORTYPE</B>&nbsp;编辑器类型，指定搜索栏过滤项的编辑器类型
     * <P>
     * 字符串：最大长度 100
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
    public PSSysSearchBarItem editortype(String editorType){
        this.setEditorType(editorType);
        return this;
    }

    /**
     * <B>FILTERPSDEDSID</B>&nbsp;过滤数据集合
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataSet} 
     */
    public final static String FIELD_FILTERPSDEDSID = "filterpsdedsid";

    /**
     * 设置 过滤数据集合
     * 
     * @param filterPSDEDSId
     * 
     */
    @JsonProperty(FIELD_FILTERPSDEDSID)
    public void setFilterPSDEDSId(String filterPSDEDSId){
        this.set(FIELD_FILTERPSDEDSID, filterPSDEDSId);
    }
    
    /**
     * 获取 过滤数据集合  
     * @return
     */
    @JsonIgnore
    public String getFilterPSDEDSId(){
        Object objValue = this.get(FIELD_FILTERPSDEDSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 过滤数据集合 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFilterPSDEDSIdDirty(){
        if(this.contains(FIELD_FILTERPSDEDSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 过滤数据集合
     */
    @JsonIgnore
    public void resetFilterPSDEDSId(){
        this.reset(FIELD_FILTERPSDEDSID);
    }

    /**
     * 设置 过滤数据集合
     * <P>
     * 等同 {@link #setFilterPSDEDSId}
     * @param filterPSDEDSId
     */
    @JsonIgnore
    public PSSysSearchBarItem filterpsdedsid(String filterPSDEDSId){
        this.setFilterPSDEDSId(filterPSDEDSId);
        return this;
    }

    /**
     * 设置 过滤数据集合，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setFilterPSDEDSId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSSysSearchBarItem filterpsdedsid(PSDEDataSet pSDEDataSet){
        if(pSDEDataSet == null){
            this.setFilterPSDEDSId(null);
            this.setFilterPSDEDSName(null);
        }
        else{
            this.setFilterPSDEDSId(pSDEDataSet.getPSDEDataSetId());
            this.setFilterPSDEDSName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    /**
     * <B>FILTERPSDEDSNAME</B>&nbsp;过滤数据集合
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_FILTERPSDEDSID}
     */
    public final static String FIELD_FILTERPSDEDSNAME = "filterpsdedsname";

    /**
     * 设置 过滤数据集合
     * 
     * @param filterPSDEDSName
     * 
     */
    @JsonProperty(FIELD_FILTERPSDEDSNAME)
    public void setFilterPSDEDSName(String filterPSDEDSName){
        this.set(FIELD_FILTERPSDEDSNAME, filterPSDEDSName);
    }
    
    /**
     * 获取 过滤数据集合  
     * @return
     */
    @JsonIgnore
    public String getFilterPSDEDSName(){
        Object objValue = this.get(FIELD_FILTERPSDEDSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 过滤数据集合 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFilterPSDEDSNameDirty(){
        if(this.contains(FIELD_FILTERPSDEDSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 过滤数据集合
     */
    @JsonIgnore
    public void resetFilterPSDEDSName(){
        this.reset(FIELD_FILTERPSDEDSNAME);
    }

    /**
     * 设置 过滤数据集合
     * <P>
     * 等同 {@link #setFilterPSDEDSName}
     * @param filterPSDEDSName
     */
    @JsonIgnore
    public PSSysSearchBarItem filterpsdedsname(String filterPSDEDSName){
        this.setFilterPSDEDSName(filterPSDEDSName);
        return this;
    }

    /**
     * <B>HEIGHT</B>&nbsp;高度
     */
    public final static String FIELD_HEIGHT = "height";

    /**
     * 设置 高度
     * 
     * @param height
     * 
     */
    @JsonProperty(FIELD_HEIGHT)
    public void setHeight(Integer height){
        this.set(FIELD_HEIGHT, height);
    }
    
    /**
     * 获取 高度  
     * @return
     */
    @JsonIgnore
    public Integer getHeight(){
        Object objValue = this.get(FIELD_HEIGHT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 高度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHeightDirty(){
        if(this.contains(FIELD_HEIGHT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 高度
     */
    @JsonIgnore
    public void resetHeight(){
        this.reset(FIELD_HEIGHT);
    }

    /**
     * 设置 高度
     * <P>
     * 等同 {@link #setHeight}
     * @param height
     */
    @JsonIgnore
    public PSSysSearchBarItem height(Integer height){
        this.setHeight(height);
        return this;
    }

    /**
     * <B>HTMLCONTENT</B>&nbsp;HTML内容，直接内容项内容类型为【Html内容】时指定Html内容，未指定时使用指定的系统资源定义内容
     */
    public final static String FIELD_HTMLCONTENT = "htmlcontent";

    /**
     * 设置 HTML内容，详细说明：{@link #FIELD_HTMLCONTENT}
     * 
     * @param htmlContent
     * 
     */
    @JsonProperty(FIELD_HTMLCONTENT)
    public void setHtmlContent(String htmlContent){
        this.set(FIELD_HTMLCONTENT, htmlContent);
    }
    
    /**
     * 获取 HTML内容  
     * @return
     */
    @JsonIgnore
    public String getHtmlContent(){
        Object objValue = this.get(FIELD_HTMLCONTENT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 HTML内容 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHtmlContentDirty(){
        if(this.contains(FIELD_HTMLCONTENT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 HTML内容
     */
    @JsonIgnore
    public void resetHtmlContent(){
        this.reset(FIELD_HTMLCONTENT);
    }

    /**
     * 设置 HTML内容，详细说明：{@link #FIELD_HTMLCONTENT}
     * <P>
     * 等同 {@link #setHtmlContent}
     * @param htmlContent
     */
    @JsonIgnore
    public PSSysSearchBarItem htmlcontent(String htmlContent){
        this.setHtmlContent(htmlContent);
        return this;
    }

    /**
     * <B>ITEMSUBTYPE</B>&nbsp;项子类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SearchBarItemSubType} 
     */
    public final static String FIELD_ITEMSUBTYPE = "itemsubtype";

    /**
     * 设置 项子类型
     * 
     * @param itemSubType
     * 
     */
    @JsonProperty(FIELD_ITEMSUBTYPE)
    public void setItemSubType(String itemSubType){
        this.set(FIELD_ITEMSUBTYPE, itemSubType);
    }
    
    /**
     * 获取 项子类型  
     * @return
     */
    @JsonIgnore
    public String getItemSubType(){
        Object objValue = this.get(FIELD_ITEMSUBTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项子类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemSubTypeDirty(){
        if(this.contains(FIELD_ITEMSUBTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项子类型
     */
    @JsonIgnore
    public void resetItemSubType(){
        this.reset(FIELD_ITEMSUBTYPE);
    }

    /**
     * 设置 项子类型
     * <P>
     * 等同 {@link #setItemSubType}
     * @param itemSubType
     */
    @JsonIgnore
    public PSSysSearchBarItem itemsubtype(String itemSubType){
        this.setItemSubType(itemSubType);
        return this;
    }

     /**
     * 设置 项子类型
     * <P>
     * 等同 {@link #setItemSubType}
     * @param itemSubType
     */
    @JsonIgnore
    public PSSysSearchBarItem itemsubtype(net.ibizsys.psmodel.core.util.PSModelEnums.SearchBarItemSubType itemSubType){
        if(itemSubType == null){
            this.setItemSubType(null);
        }
        else{
            this.setItemSubType(itemSubType.value);
        }
        return this;
    }

    /**
     * <B>ITEMTAG</B>&nbsp;项标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ITEMTAG = "itemtag";

    /**
     * 设置 项标记
     * 
     * @param itemTag
     * 
     */
    @JsonProperty(FIELD_ITEMTAG)
    public void setItemTag(String itemTag){
        this.set(FIELD_ITEMTAG, itemTag);
    }
    
    /**
     * 获取 项标记  
     * @return
     */
    @JsonIgnore
    public String getItemTag(){
        Object objValue = this.get(FIELD_ITEMTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemTagDirty(){
        if(this.contains(FIELD_ITEMTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项标记
     */
    @JsonIgnore
    public void resetItemTag(){
        this.reset(FIELD_ITEMTAG);
    }

    /**
     * 设置 项标记
     * <P>
     * 等同 {@link #setItemTag}
     * @param itemTag
     */
    @JsonIgnore
    public PSSysSearchBarItem itemtag(String itemTag){
        this.setItemTag(itemTag);
        return this;
    }

    /**
     * <B>ITEMTAG2</B>&nbsp;项标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ITEMTAG2 = "itemtag2";

    /**
     * 设置 项标记2
     * 
     * @param itemTag2
     * 
     */
    @JsonProperty(FIELD_ITEMTAG2)
    public void setItemTag2(String itemTag2){
        this.set(FIELD_ITEMTAG2, itemTag2);
    }
    
    /**
     * 获取 项标记2  
     * @return
     */
    @JsonIgnore
    public String getItemTag2(){
        Object objValue = this.get(FIELD_ITEMTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemTag2Dirty(){
        if(this.contains(FIELD_ITEMTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项标记2
     */
    @JsonIgnore
    public void resetItemTag2(){
        this.reset(FIELD_ITEMTAG2);
    }

    /**
     * 设置 项标记2
     * <P>
     * 等同 {@link #setItemTag2}
     * @param itemTag2
     */
    @JsonIgnore
    public PSSysSearchBarItem itemtag2(String itemTag2){
        this.setItemTag2(itemTag2);
        return this;
    }

    /**
     * <B>ITEMTYPE</B>&nbsp;项类型，指定搜索栏部件成员的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SearchBarItemType} 
     */
    public final static String FIELD_ITEMTYPE = "itemtype";

    /**
     * 设置 项类型，详细说明：{@link #FIELD_ITEMTYPE}
     * 
     * @param itemType
     * 
     */
    @JsonProperty(FIELD_ITEMTYPE)
    public void setItemType(String itemType){
        this.set(FIELD_ITEMTYPE, itemType);
    }
    
    /**
     * 获取 项类型  
     * @return
     */
    @JsonIgnore
    public String getItemType(){
        Object objValue = this.get(FIELD_ITEMTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemTypeDirty(){
        if(this.contains(FIELD_ITEMTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项类型
     */
    @JsonIgnore
    public void resetItemType(){
        this.reset(FIELD_ITEMTYPE);
    }

    /**
     * 设置 项类型，详细说明：{@link #FIELD_ITEMTYPE}
     * <P>
     * 等同 {@link #setItemType}
     * @param itemType
     */
    @JsonIgnore
    public PSSysSearchBarItem itemtype(String itemType){
        this.setItemType(itemType);
        return this;
    }

     /**
     * 设置 项类型，详细说明：{@link #FIELD_ITEMTYPE}
     * <P>
     * 等同 {@link #setItemType}
     * @param itemType
     */
    @JsonIgnore
    public PSSysSearchBarItem itemtype(net.ibizsys.psmodel.core.util.PSModelEnums.SearchBarItemType itemType){
        if(itemType == null){
            this.setItemType(null);
        }
        else{
            this.setItemType(itemType.value);
        }
        return this;
    }

    /**
     * <B>LABELDYNACLASS</B>&nbsp;标签动态样式表
     */
    public final static String FIELD_LABELDYNACLASS = "labeldynaclass";

    /**
     * 设置 标签动态样式表
     * 
     * @param labelDynaClass
     * 
     */
    @JsonProperty(FIELD_LABELDYNACLASS)
    public void setLabelDynaClass(String labelDynaClass){
        this.set(FIELD_LABELDYNACLASS, labelDynaClass);
    }
    
    /**
     * 获取 标签动态样式表  
     * @return
     */
    @JsonIgnore
    public String getLabelDynaClass(){
        Object objValue = this.get(FIELD_LABELDYNACLASS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标签动态样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLabelDynaClassDirty(){
        if(this.contains(FIELD_LABELDYNACLASS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标签动态样式表
     */
    @JsonIgnore
    public void resetLabelDynaClass(){
        this.reset(FIELD_LABELDYNACLASS);
    }

    /**
     * 设置 标签动态样式表
     * <P>
     * 等同 {@link #setLabelDynaClass}
     * @param labelDynaClass
     */
    @JsonIgnore
    public PSSysSearchBarItem labeldynaclass(String labelDynaClass){
        this.setLabelDynaClass(labelDynaClass);
        return this;
    }

    /**
     * <B>LABELPOS</B>&nbsp;标签位置，指定搜索栏过滤项的标签位置，未定义时为【不显示】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.LabelPos} 
     */
    public final static String FIELD_LABELPOS = "labelpos";

    /**
     * 设置 标签位置，详细说明：{@link #FIELD_LABELPOS}
     * 
     * @param labelPos
     * 
     */
    @JsonProperty(FIELD_LABELPOS)
    public void setLabelPos(String labelPos){
        this.set(FIELD_LABELPOS, labelPos);
    }
    
    /**
     * 获取 标签位置  
     * @return
     */
    @JsonIgnore
    public String getLabelPos(){
        Object objValue = this.get(FIELD_LABELPOS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标签位置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLabelPosDirty(){
        if(this.contains(FIELD_LABELPOS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标签位置
     */
    @JsonIgnore
    public void resetLabelPos(){
        this.reset(FIELD_LABELPOS);
    }

    /**
     * 设置 标签位置，详细说明：{@link #FIELD_LABELPOS}
     * <P>
     * 等同 {@link #setLabelPos}
     * @param labelPos
     */
    @JsonIgnore
    public PSSysSearchBarItem labelpos(String labelPos){
        this.setLabelPos(labelPos);
        return this;
    }

     /**
     * 设置 标签位置，详细说明：{@link #FIELD_LABELPOS}
     * <P>
     * 等同 {@link #setLabelPos}
     * @param labelPos
     */
    @JsonIgnore
    public PSSysSearchBarItem labelpos(net.ibizsys.psmodel.core.util.PSModelEnums.LabelPos labelPos){
        if(labelPos == null){
            this.setLabelPos(null);
        }
        else{
            this.setLabelPos(labelPos.value);
        }
        return this;
    }

    /**
     * <B>LABELPSSYSCSSID</B>&nbsp;标题样式表，指定搜索栏部件成员的标题样式表对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCss} 
     */
    public final static String FIELD_LABELPSSYSCSSID = "labelpssyscssid";

    /**
     * 设置 标题样式表，详细说明：{@link #FIELD_LABELPSSYSCSSID}
     * 
     * @param labelPSSysCssId
     * 
     */
    @JsonProperty(FIELD_LABELPSSYSCSSID)
    public void setLabelPSSysCssId(String labelPSSysCssId){
        this.set(FIELD_LABELPSSYSCSSID, labelPSSysCssId);
    }
    
    /**
     * 获取 标题样式表  
     * @return
     */
    @JsonIgnore
    public String getLabelPSSysCssId(){
        Object objValue = this.get(FIELD_LABELPSSYSCSSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标题样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLabelPSSysCssIdDirty(){
        if(this.contains(FIELD_LABELPSSYSCSSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题样式表
     */
    @JsonIgnore
    public void resetLabelPSSysCssId(){
        this.reset(FIELD_LABELPSSYSCSSID);
    }

    /**
     * 设置 标题样式表，详细说明：{@link #FIELD_LABELPSSYSCSSID}
     * <P>
     * 等同 {@link #setLabelPSSysCssId}
     * @param labelPSSysCssId
     */
    @JsonIgnore
    public PSSysSearchBarItem labelpssyscssid(String labelPSSysCssId){
        this.setLabelPSSysCssId(labelPSSysCssId);
        return this;
    }

    /**
     * 设置 标题样式表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setLabelPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSSysSearchBarItem labelpssyscssid(PSSysCss pSSysCss){
        if(pSSysCss == null){
            this.setLabelPSSysCssId(null);
            this.setLabelPSSysCssName(null);
        }
        else{
            this.setLabelPSSysCssId(pSSysCss.getPSSysCssId());
            this.setLabelPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    /**
     * <B>LABELPSSYSCSSNAME</B>&nbsp;标题样式表，指定搜索栏部件成员的标题样式表对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_LABELPSSYSCSSID}
     */
    public final static String FIELD_LABELPSSYSCSSNAME = "labelpssyscssname";

    /**
     * 设置 标题样式表，详细说明：{@link #FIELD_LABELPSSYSCSSNAME}
     * 
     * @param labelPSSysCssName
     * 
     */
    @JsonProperty(FIELD_LABELPSSYSCSSNAME)
    public void setLabelPSSysCssName(String labelPSSysCssName){
        this.set(FIELD_LABELPSSYSCSSNAME, labelPSSysCssName);
    }
    
    /**
     * 获取 标题样式表  
     * @return
     */
    @JsonIgnore
    public String getLabelPSSysCssName(){
        Object objValue = this.get(FIELD_LABELPSSYSCSSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标题样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLabelPSSysCssNameDirty(){
        if(this.contains(FIELD_LABELPSSYSCSSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题样式表
     */
    @JsonIgnore
    public void resetLabelPSSysCssName(){
        this.reset(FIELD_LABELPSSYSCSSNAME);
    }

    /**
     * 设置 标题样式表，详细说明：{@link #FIELD_LABELPSSYSCSSNAME}
     * <P>
     * 等同 {@link #setLabelPSSysCssName}
     * @param labelPSSysCssName
     */
    @JsonIgnore
    public PSSysSearchBarItem labelpssyscssname(String labelPSSysCssName){
        this.setLabelPSSysCssName(labelPSSysCssName);
        return this;
    }

    /**
     * <B>LABELRAWCSSSTYLE</B>&nbsp;标签直接样式
     */
    public final static String FIELD_LABELRAWCSSSTYLE = "labelrawcssstyle";

    /**
     * 设置 标签直接样式
     * 
     * @param labelRawCssStyle
     * 
     */
    @JsonProperty(FIELD_LABELRAWCSSSTYLE)
    public void setLabelRawCssStyle(String labelRawCssStyle){
        this.set(FIELD_LABELRAWCSSSTYLE, labelRawCssStyle);
    }
    
    /**
     * 获取 标签直接样式  
     * @return
     */
    @JsonIgnore
    public String getLabelRawCssStyle(){
        Object objValue = this.get(FIELD_LABELRAWCSSSTYLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标签直接样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLabelRawCssStyleDirty(){
        if(this.contains(FIELD_LABELRAWCSSSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标签直接样式
     */
    @JsonIgnore
    public void resetLabelRawCssStyle(){
        this.reset(FIELD_LABELRAWCSSSTYLE);
    }

    /**
     * 设置 标签直接样式
     * <P>
     * 等同 {@link #setLabelRawCssStyle}
     * @param labelRawCssStyle
     */
    @JsonIgnore
    public PSSysSearchBarItem labelrawcssstyle(String labelRawCssStyle){
        this.setLabelRawCssStyle(labelRawCssStyle);
        return this;
    }

    /**
     * <B>LABELWIDTH</B>&nbsp;标签宽度，指定搜索栏过滤项标签的宽度，0为自动计算，未定义时为【0】
     */
    public final static String FIELD_LABELWIDTH = "labelwidth";

    /**
     * 设置 标签宽度，详细说明：{@link #FIELD_LABELWIDTH}
     * 
     * @param labelWidth
     * 
     */
    @JsonProperty(FIELD_LABELWIDTH)
    public void setLabelWidth(Integer labelWidth){
        this.set(FIELD_LABELWIDTH, labelWidth);
    }
    
    /**
     * 获取 标签宽度  
     * @return
     */
    @JsonIgnore
    public Integer getLabelWidth(){
        Object objValue = this.get(FIELD_LABELWIDTH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 标签宽度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLabelWidthDirty(){
        if(this.contains(FIELD_LABELWIDTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标签宽度
     */
    @JsonIgnore
    public void resetLabelWidth(){
        this.reset(FIELD_LABELWIDTH);
    }

    /**
     * 设置 标签宽度，详细说明：{@link #FIELD_LABELWIDTH}
     * <P>
     * 等同 {@link #setLabelWidth}
     * @param labelWidth
     */
    @JsonIgnore
    public PSSysSearchBarItem labelwidth(Integer labelWidth){
        this.setLabelWidth(labelWidth);
        return this;
    }

    /**
     * <B>MEMO</B>&nbsp;备注
     * <P>
     * 字符串：最大长度 1000
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
    public PSSysSearchBarItem memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MOBFLAG</B>&nbsp;移动端搜索栏
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSEARCHBARID}
     */
    public final static String FIELD_MOBFLAG = "mobflag";

    /**
     * 设置 移动端搜索栏
     * 
     * @param mobFlag
     * 
     */
    @JsonProperty(FIELD_MOBFLAG)
    public void setMobFlag(Integer mobFlag){
        this.set(FIELD_MOBFLAG, mobFlag);
    }
    
    /**
     * 获取 移动端搜索栏  
     * @return
     */
    @JsonIgnore
    public Integer getMobFlag(){
        Object objValue = this.get(FIELD_MOBFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 移动端搜索栏 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobFlagDirty(){
        if(this.contains(FIELD_MOBFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端搜索栏
     */
    @JsonIgnore
    public void resetMobFlag(){
        this.reset(FIELD_MOBFLAG);
    }

    /**
     * 设置 移动端搜索栏
     * <P>
     * 等同 {@link #setMobFlag}
     * @param mobFlag
     */
    @JsonIgnore
    public PSSysSearchBarItem mobflag(Integer mobFlag){
        this.setMobFlag(mobFlag);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;排序值，指定搜索栏成员的显示次序
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 排序值，详细说明：{@link #FIELD_ORDERVALUE}
     * 
     * @param orderValue
     * 
     */
    @JsonProperty(FIELD_ORDERVALUE)
    public void setOrderValue(Integer orderValue){
        this.set(FIELD_ORDERVALUE, orderValue);
    }
    
    /**
     * 获取 排序值  
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
     * 判断 排序值 是否指定值，包括空值
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
     * 重置 排序值
     */
    @JsonIgnore
    public void resetOrderValue(){
        this.reset(FIELD_ORDERVALUE);
    }

    /**
     * 设置 排序值，详细说明：{@link #FIELD_ORDERVALUE}
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSSysSearchBarItem ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PHPSLANRESID</B>&nbsp;占位提示语言资源，指定搜索栏过滤项编辑器的占位提示信息的多语言资源对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_PHPSLANRESID = "phpslanresid";

    /**
     * 设置 占位提示语言资源，详细说明：{@link #FIELD_PHPSLANRESID}
     * 
     * @param pHPSLanResId
     * 
     */
    @JsonProperty(FIELD_PHPSLANRESID)
    public void setPHPSLanResId(String pHPSLanResId){
        this.set(FIELD_PHPSLANRESID, pHPSLanResId);
    }
    
    /**
     * 获取 占位提示语言资源  
     * @return
     */
    @JsonIgnore
    public String getPHPSLanResId(){
        Object objValue = this.get(FIELD_PHPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 占位提示语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPHPSLanResIdDirty(){
        if(this.contains(FIELD_PHPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 占位提示语言资源
     */
    @JsonIgnore
    public void resetPHPSLanResId(){
        this.reset(FIELD_PHPSLANRESID);
    }

    /**
     * 设置 占位提示语言资源，详细说明：{@link #FIELD_PHPSLANRESID}
     * <P>
     * 等同 {@link #setPHPSLanResId}
     * @param pHPSLanResId
     */
    @JsonIgnore
    public PSSysSearchBarItem phpslanresid(String pHPSLanResId){
        this.setPHPSLanResId(pHPSLanResId);
        return this;
    }

    /**
     * 设置 占位提示语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPHPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSSysSearchBarItem phpslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setPHPSLanResId(null);
            this.setPHPSLanResName(null);
        }
        else{
            this.setPHPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setPHPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>PHPSLANRESNAME</B>&nbsp;占位提示语言资源，指定搜索栏过滤项编辑器的占位提示信息的多语言资源对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PHPSLANRESID}
     */
    public final static String FIELD_PHPSLANRESNAME = "phpslanresname";

    /**
     * 设置 占位提示语言资源，详细说明：{@link #FIELD_PHPSLANRESNAME}
     * 
     * @param pHPSLanResName
     * 
     */
    @JsonProperty(FIELD_PHPSLANRESNAME)
    public void setPHPSLanResName(String pHPSLanResName){
        this.set(FIELD_PHPSLANRESNAME, pHPSLanResName);
    }
    
    /**
     * 获取 占位提示语言资源  
     * @return
     */
    @JsonIgnore
    public String getPHPSLanResName(){
        Object objValue = this.get(FIELD_PHPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 占位提示语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPHPSLanResNameDirty(){
        if(this.contains(FIELD_PHPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 占位提示语言资源
     */
    @JsonIgnore
    public void resetPHPSLanResName(){
        this.reset(FIELD_PHPSLANRESNAME);
    }

    /**
     * 设置 占位提示语言资源，详细说明：{@link #FIELD_PHPSLANRESNAME}
     * <P>
     * 等同 {@link #setPHPSLanResName}
     * @param pHPSLanResName
     */
    @JsonIgnore
    public PSSysSearchBarItem phpslanresname(String pHPSLanResName){
        this.setPHPSLanResName(pHPSLanResName);
        return this;
    }

    /**
     * <B>PLACEHOLDER</B>&nbsp;占位提示，指定搜索栏过滤项编辑器的占位提示信息
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PLACEHOLDER = "placeholder";

    /**
     * 设置 占位提示，详细说明：{@link #FIELD_PLACEHOLDER}
     * 
     * @param placeHolder
     * 
     */
    @JsonProperty(FIELD_PLACEHOLDER)
    public void setPlaceHolder(String placeHolder){
        this.set(FIELD_PLACEHOLDER, placeHolder);
    }
    
    /**
     * 获取 占位提示  
     * @return
     */
    @JsonIgnore
    public String getPlaceHolder(){
        Object objValue = this.get(FIELD_PLACEHOLDER);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 占位提示 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPlaceHolderDirty(){
        if(this.contains(FIELD_PLACEHOLDER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 占位提示
     */
    @JsonIgnore
    public void resetPlaceHolder(){
        this.reset(FIELD_PLACEHOLDER);
    }

    /**
     * 设置 占位提示，详细说明：{@link #FIELD_PLACEHOLDER}
     * <P>
     * 等同 {@link #setPlaceHolder}
     * @param placeHolder
     */
    @JsonIgnore
    public PSSysSearchBarItem placeholder(String placeHolder){
        this.setPlaceHolder(placeHolder);
        return this;
    }

    /**
     * <B>PSCODELISTID</B>&nbsp;代码表，指定搜索栏过滤项使用的代码表对象，未定义时使用关联属性搜索模式配置
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSCodeList} 
     */
    public final static String FIELD_PSCODELISTID = "pscodelistid";

    /**
     * 设置 代码表，详细说明：{@link #FIELD_PSCODELISTID}
     * 
     * @param pSCodeListId
     * 
     */
    @JsonProperty(FIELD_PSCODELISTID)
    public void setPSCodeListId(String pSCodeListId){
        this.set(FIELD_PSCODELISTID, pSCodeListId);
    }
    
    /**
     * 获取 代码表  
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
     * 判断 代码表 是否指定值，包括空值
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
     * 重置 代码表
     */
    @JsonIgnore
    public void resetPSCodeListId(){
        this.reset(FIELD_PSCODELISTID);
    }

    /**
     * 设置 代码表，详细说明：{@link #FIELD_PSCODELISTID}
     * <P>
     * 等同 {@link #setPSCodeListId}
     * @param pSCodeListId
     */
    @JsonIgnore
    public PSSysSearchBarItem pscodelistid(String pSCodeListId){
        this.setPSCodeListId(pSCodeListId);
        return this;
    }

    /**
     * 设置 代码表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSCodeListId}
     * @param pSCodeList 引用对象
     */
    @JsonIgnore
    public PSSysSearchBarItem pscodelistid(PSCodeList pSCodeList){
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
     * <B>PSCODELISTNAME</B>&nbsp;代码表，指定搜索栏过滤项使用的代码表对象，未定义时使用关联属性搜索模式配置
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCODELISTID}
     */
    public final static String FIELD_PSCODELISTNAME = "pscodelistname";

    /**
     * 设置 代码表，详细说明：{@link #FIELD_PSCODELISTNAME}
     * 
     * @param pSCodeListName
     * 
     */
    @JsonProperty(FIELD_PSCODELISTNAME)
    public void setPSCodeListName(String pSCodeListName){
        this.set(FIELD_PSCODELISTNAME, pSCodeListName);
    }
    
    /**
     * 获取 代码表  
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
     * 判断 代码表 是否指定值，包括空值
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
     * 重置 代码表
     */
    @JsonIgnore
    public void resetPSCodeListName(){
        this.reset(FIELD_PSCODELISTNAME);
    }

    /**
     * 设置 代码表，详细说明：{@link #FIELD_PSCODELISTNAME}
     * <P>
     * 等同 {@link #setPSCodeListName}
     * @param pSCodeListName
     */
    @JsonIgnore
    public PSSysSearchBarItem pscodelistname(String pSCodeListName){
        this.setPSCodeListName(pSCodeListName);
        return this;
    }

    /**
     * <B>PSDEFID</B>&nbsp;实体属性，指定搜索栏过滤项关联的实体属性对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_PSDEFID = "psdefid";

    /**
     * 设置 实体属性，详细说明：{@link #FIELD_PSDEFID}
     * 
     * @param pSDEFId
     * 
     */
    @JsonProperty(FIELD_PSDEFID)
    public void setPSDEFId(String pSDEFId){
        this.set(FIELD_PSDEFID, pSDEFId);
    }
    
    /**
     * 获取 实体属性  
     * @return
     */
    @JsonIgnore
    public String getPSDEFId(){
        Object objValue = this.get(FIELD_PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFIdDirty(){
        if(this.contains(FIELD_PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体属性
     */
    @JsonIgnore
    public void resetPSDEFId(){
        this.reset(FIELD_PSDEFID);
    }

    /**
     * 设置 实体属性，详细说明：{@link #FIELD_PSDEFID}
     * <P>
     * 等同 {@link #setPSDEFId}
     * @param pSDEFId
     */
    @JsonIgnore
    public PSSysSearchBarItem psdefid(String pSDEFId){
        this.setPSDEFId(pSDEFId);
        return this;
    }

    /**
     * 设置 实体属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysSearchBarItem psdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setPSDEFId(null);
            this.setPSDEFName(null);
        }
        else{
            this.setPSDEFId(pSDEField.getPSDEFieldId());
            this.setPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>PSDEFNAME</B>&nbsp;实体属性，指定搜索栏过滤项关联的实体属性对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFID}
     */
    public final static String FIELD_PSDEFNAME = "psdefname";

    /**
     * 设置 实体属性，详细说明：{@link #FIELD_PSDEFNAME}
     * 
     * @param pSDEFName
     * 
     */
    @JsonProperty(FIELD_PSDEFNAME)
    public void setPSDEFName(String pSDEFName){
        this.set(FIELD_PSDEFNAME, pSDEFName);
    }
    
    /**
     * 获取 实体属性  
     * @return
     */
    @JsonIgnore
    public String getPSDEFName(){
        Object objValue = this.get(FIELD_PSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFNameDirty(){
        if(this.contains(FIELD_PSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体属性
     */
    @JsonIgnore
    public void resetPSDEFName(){
        this.reset(FIELD_PSDEFNAME);
    }

    /**
     * 设置 实体属性，详细说明：{@link #FIELD_PSDEFNAME}
     * <P>
     * 等同 {@link #setPSDEFName}
     * @param pSDEFName
     */
    @JsonIgnore
    public PSSysSearchBarItem psdefname(String pSDEFName){
        this.setPSDEFName(pSDEFName);
        return this;
    }

    /**
     * <B>PSDEFSFITEMID</B>&nbsp;属性搜索模式，指定搜索栏过滤项关联的实体属性搜索模式
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEFSFItem} 
     */
    public final static String FIELD_PSDEFSFITEMID = "psdefsfitemid";

    /**
     * 设置 属性搜索模式，详细说明：{@link #FIELD_PSDEFSFITEMID}
     * 
     * @param pSDEFSFItemId
     * 
     */
    @JsonProperty(FIELD_PSDEFSFITEMID)
    public void setPSDEFSFItemId(String pSDEFSFItemId){
        this.set(FIELD_PSDEFSFITEMID, pSDEFSFItemId);
    }
    
    /**
     * 获取 属性搜索模式  
     * @return
     */
    @JsonIgnore
    public String getPSDEFSFItemId(){
        Object objValue = this.get(FIELD_PSDEFSFITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性搜索模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFSFItemIdDirty(){
        if(this.contains(FIELD_PSDEFSFITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性搜索模式
     */
    @JsonIgnore
    public void resetPSDEFSFItemId(){
        this.reset(FIELD_PSDEFSFITEMID);
    }

    /**
     * 设置 属性搜索模式，详细说明：{@link #FIELD_PSDEFSFITEMID}
     * <P>
     * 等同 {@link #setPSDEFSFItemId}
     * @param pSDEFSFItemId
     */
    @JsonIgnore
    public PSSysSearchBarItem psdefsfitemid(String pSDEFSFItemId){
        this.setPSDEFSFItemId(pSDEFSFItemId);
        return this;
    }

    /**
     * 设置 属性搜索模式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEFSFItemId}
     * @param pSDEFSFItem 引用对象
     */
    @JsonIgnore
    public PSSysSearchBarItem psdefsfitemid(PSDEFSFItem pSDEFSFItem){
        if(pSDEFSFItem == null){
            this.setPSDEFSFItemId(null);
            this.setPSDEFSFItemName(null);
        }
        else{
            this.setPSDEFSFItemId(pSDEFSFItem.getPSDEFSFItemId());
            this.setPSDEFSFItemName(pSDEFSFItem.getPSDEFSFItemName());
        }
        return this;
    }

    /**
     * <B>PSDEFSFITEMNAME</B>&nbsp;属性搜索模式，指定搜索栏过滤项关联的实体属性搜索模式
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFSFITEMID}
     */
    public final static String FIELD_PSDEFSFITEMNAME = "psdefsfitemname";

    /**
     * 设置 属性搜索模式，详细说明：{@link #FIELD_PSDEFSFITEMNAME}
     * 
     * @param pSDEFSFItemName
     * 
     */
    @JsonProperty(FIELD_PSDEFSFITEMNAME)
    public void setPSDEFSFItemName(String pSDEFSFItemName){
        this.set(FIELD_PSDEFSFITEMNAME, pSDEFSFItemName);
    }
    
    /**
     * 获取 属性搜索模式  
     * @return
     */
    @JsonIgnore
    public String getPSDEFSFItemName(){
        Object objValue = this.get(FIELD_PSDEFSFITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性搜索模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFSFItemNameDirty(){
        if(this.contains(FIELD_PSDEFSFITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性搜索模式
     */
    @JsonIgnore
    public void resetPSDEFSFItemName(){
        this.reset(FIELD_PSDEFSFITEMNAME);
    }

    /**
     * 设置 属性搜索模式，详细说明：{@link #FIELD_PSDEFSFITEMNAME}
     * <P>
     * 等同 {@link #setPSDEFSFItemName}
     * @param pSDEFSFItemName
     */
    @JsonIgnore
    public PSSysSearchBarItem psdefsfitemname(String pSDEFSFItemName){
        this.setPSDEFSFItemName(pSDEFSFItemName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;PSDEID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSEARCHBARID}
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 PSDEID
     * 
     * @param pSDEId
     * 
     */
    @JsonProperty(FIELD_PSDEID)
    public void setPSDEId(String pSDEId){
        this.set(FIELD_PSDEID, pSDEId);
    }
    
    /**
     * 获取 PSDEID  
     * @return
     */
    @JsonIgnore
    public String getPSDEId(){
        Object objValue = this.get(FIELD_PSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 PSDEID 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEIdDirty(){
        if(this.contains(FIELD_PSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 PSDEID
     */
    @JsonIgnore
    public void resetPSDEId(){
        this.reset(FIELD_PSDEID);
    }

    /**
     * 设置 PSDEID
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSSysSearchBarItem psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * <B>PSSYSCSSID</B>&nbsp;系统样式，指定搜索栏成员的界面容器样式表对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCss} 
     */
    public final static String FIELD_PSSYSCSSID = "pssyscssid";

    /**
     * 设置 系统样式，详细说明：{@link #FIELD_PSSYSCSSID}
     * 
     * @param pSSysCssId
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSID)
    public void setPSSysCssId(String pSSysCssId){
        this.set(FIELD_PSSYSCSSID, pSSysCssId);
    }
    
    /**
     * 获取 系统样式  
     * @return
     */
    @JsonIgnore
    public String getPSSysCssId(){
        Object objValue = this.get(FIELD_PSSYSCSSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCssIdDirty(){
        if(this.contains(FIELD_PSSYSCSSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统样式
     */
    @JsonIgnore
    public void resetPSSysCssId(){
        this.reset(FIELD_PSSYSCSSID);
    }

    /**
     * 设置 系统样式，详细说明：{@link #FIELD_PSSYSCSSID}
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCssId
     */
    @JsonIgnore
    public PSSysSearchBarItem pssyscssid(String pSSysCssId){
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    /**
     * 设置 系统样式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSSysSearchBarItem pssyscssid(PSSysCss pSSysCss){
        if(pSSysCss == null){
            this.setPSSysCssId(null);
            this.setPSSysCssName(null);
        }
        else{
            this.setPSSysCssId(pSSysCss.getPSSysCssId());
            this.setPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    /**
     * <B>PSSYSCSSNAME</B>&nbsp;界面样式表，指定搜索栏成员的界面容器样式表对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSCSSID}
     */
    public final static String FIELD_PSSYSCSSNAME = "pssyscssname";

    /**
     * 设置 界面样式表，详细说明：{@link #FIELD_PSSYSCSSNAME}
     * 
     * @param pSSysCssName
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSNAME)
    public void setPSSysCssName(String pSSysCssName){
        this.set(FIELD_PSSYSCSSNAME, pSSysCssName);
    }
    
    /**
     * 获取 界面样式表  
     * @return
     */
    @JsonIgnore
    public String getPSSysCssName(){
        Object objValue = this.get(FIELD_PSSYSCSSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCssNameDirty(){
        if(this.contains(FIELD_PSSYSCSSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面样式表
     */
    @JsonIgnore
    public void resetPSSysCssName(){
        this.reset(FIELD_PSSYSCSSNAME);
    }

    /**
     * 设置 界面样式表，详细说明：{@link #FIELD_PSSYSCSSNAME}
     * <P>
     * 等同 {@link #setPSSysCssName}
     * @param pSSysCssName
     */
    @JsonIgnore
    public PSSysSearchBarItem pssyscssname(String pSSysCssName){
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    /**
     * <B>PSSYSEDITORSTYLEID</B>&nbsp;系统编辑器样式，指定搜索栏过滤项的编辑器的扩展样式
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysEditorStyle} 
     */
    public final static String FIELD_PSSYSEDITORSTYLEID = "pssyseditorstyleid";

    /**
     * 设置 系统编辑器样式，详细说明：{@link #FIELD_PSSYSEDITORSTYLEID}
     * 
     * @param pSSysEditorStyleId
     * 
     */
    @JsonProperty(FIELD_PSSYSEDITORSTYLEID)
    public void setPSSysEditorStyleId(String pSSysEditorStyleId){
        this.set(FIELD_PSSYSEDITORSTYLEID, pSSysEditorStyleId);
    }
    
    /**
     * 获取 系统编辑器样式  
     * @return
     */
    @JsonIgnore
    public String getPSSysEditorStyleId(){
        Object objValue = this.get(FIELD_PSSYSEDITORSTYLEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统编辑器样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEditorStyleIdDirty(){
        if(this.contains(FIELD_PSSYSEDITORSTYLEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统编辑器样式
     */
    @JsonIgnore
    public void resetPSSysEditorStyleId(){
        this.reset(FIELD_PSSYSEDITORSTYLEID);
    }

    /**
     * 设置 系统编辑器样式，详细说明：{@link #FIELD_PSSYSEDITORSTYLEID}
     * <P>
     * 等同 {@link #setPSSysEditorStyleId}
     * @param pSSysEditorStyleId
     */
    @JsonIgnore
    public PSSysSearchBarItem pssyseditorstyleid(String pSSysEditorStyleId){
        this.setPSSysEditorStyleId(pSSysEditorStyleId);
        return this;
    }

    /**
     * 设置 系统编辑器样式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysEditorStyleId}
     * @param pSSysEditorStyle 引用对象
     */
    @JsonIgnore
    public PSSysSearchBarItem pssyseditorstyleid(PSSysEditorStyle pSSysEditorStyle){
        if(pSSysEditorStyle == null){
            this.setPSSysEditorStyleId(null);
            this.setPSSysEditorStyleName(null);
        }
        else{
            this.setPSSysEditorStyleId(pSSysEditorStyle.getPSSysEditorStyleId());
            this.setPSSysEditorStyleName(pSSysEditorStyle.getPSSysEditorStyleName());
        }
        return this;
    }

    /**
     * <B>PSSYSEDITORSTYLENAME</B>&nbsp;编辑器样式，指定搜索栏过滤项的编辑器的扩展样式
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSEDITORSTYLEID}
     */
    public final static String FIELD_PSSYSEDITORSTYLENAME = "pssyseditorstylename";

    /**
     * 设置 编辑器样式，详细说明：{@link #FIELD_PSSYSEDITORSTYLENAME}
     * 
     * @param pSSysEditorStyleName
     * 
     */
    @JsonProperty(FIELD_PSSYSEDITORSTYLENAME)
    public void setPSSysEditorStyleName(String pSSysEditorStyleName){
        this.set(FIELD_PSSYSEDITORSTYLENAME, pSSysEditorStyleName);
    }
    
    /**
     * 获取 编辑器样式  
     * @return
     */
    @JsonIgnore
    public String getPSSysEditorStyleName(){
        Object objValue = this.get(FIELD_PSSYSEDITORSTYLENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 编辑器样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEditorStyleNameDirty(){
        if(this.contains(FIELD_PSSYSEDITORSTYLENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 编辑器样式
     */
    @JsonIgnore
    public void resetPSSysEditorStyleName(){
        this.reset(FIELD_PSSYSEDITORSTYLENAME);
    }

    /**
     * 设置 编辑器样式，详细说明：{@link #FIELD_PSSYSEDITORSTYLENAME}
     * <P>
     * 等同 {@link #setPSSysEditorStyleName}
     * @param pSSysEditorStyleName
     */
    @JsonIgnore
    public PSSysSearchBarItem pssyseditorstylename(String pSSysEditorStyleName){
        this.setPSSysEditorStyleName(pSSysEditorStyleName);
        return this;
    }

    /**
     * <B>PSSYSIMAGEID</B>&nbsp;系统图片，指定搜索栏部件成员的系统图片对象，未定义时搜索栏过滤项使用关联属性搜索模式的配置
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysImage} 
     */
    public final static String FIELD_PSSYSIMAGEID = "pssysimageid";

    /**
     * 设置 系统图片，详细说明：{@link #FIELD_PSSYSIMAGEID}
     * 
     * @param pSSysImageId
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGEID)
    public void setPSSysImageId(String pSSysImageId){
        this.set(FIELD_PSSYSIMAGEID, pSSysImageId);
    }
    
    /**
     * 获取 系统图片  
     * @return
     */
    @JsonIgnore
    public String getPSSysImageId(){
        Object objValue = this.get(FIELD_PSSYSIMAGEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统图片 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysImageIdDirty(){
        if(this.contains(FIELD_PSSYSIMAGEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统图片
     */
    @JsonIgnore
    public void resetPSSysImageId(){
        this.reset(FIELD_PSSYSIMAGEID);
    }

    /**
     * 设置 系统图片，详细说明：{@link #FIELD_PSSYSIMAGEID}
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImageId
     */
    @JsonIgnore
    public PSSysSearchBarItem pssysimageid(String pSSysImageId){
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    /**
     * 设置 系统图片，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImage 引用对象
     */
    @JsonIgnore
    public PSSysSearchBarItem pssysimageid(PSSysImage pSSysImage){
        if(pSSysImage == null){
            this.setPSSysImageId(null);
            this.setPSSysImageName(null);
        }
        else{
            this.setPSSysImageId(pSSysImage.getPSSysImageId());
            this.setPSSysImageName(pSSysImage.getPSSysImageName());
        }
        return this;
    }

    /**
     * <B>PSSYSIMAGENAME</B>&nbsp;系统图片，指定搜索栏部件成员的系统图片对象，未定义时搜索栏过滤项使用关联属性搜索模式的配置
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSIMAGEID}
     */
    public final static String FIELD_PSSYSIMAGENAME = "pssysimagename";

    /**
     * 设置 系统图片，详细说明：{@link #FIELD_PSSYSIMAGENAME}
     * 
     * @param pSSysImageName
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGENAME)
    public void setPSSysImageName(String pSSysImageName){
        this.set(FIELD_PSSYSIMAGENAME, pSSysImageName);
    }
    
    /**
     * 获取 系统图片  
     * @return
     */
    @JsonIgnore
    public String getPSSysImageName(){
        Object objValue = this.get(FIELD_PSSYSIMAGENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统图片 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysImageNameDirty(){
        if(this.contains(FIELD_PSSYSIMAGENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统图片
     */
    @JsonIgnore
    public void resetPSSysImageName(){
        this.reset(FIELD_PSSYSIMAGENAME);
    }

    /**
     * 设置 系统图片，详细说明：{@link #FIELD_PSSYSIMAGENAME}
     * <P>
     * 等同 {@link #setPSSysImageName}
     * @param pSSysImageName
     */
    @JsonIgnore
    public PSSysSearchBarItem pssysimagename(String pSSysImageName){
        this.setPSSysImageName(pSSysImageName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端扩展插件，指定系统搜索栏项使用的前端模板扩展插件，使用插件类型【搜索栏项绘制插件】
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysPFPlugin} 
     */
    public final static String FIELD_PSSYSPFPLUGINID = "pssyspfpluginid";

    /**
     * 设置 前端扩展插件，详细说明：{@link #FIELD_PSSYSPFPLUGINID}
     * 
     * @param pSSysPFPluginId
     * 
     */
    @JsonProperty(FIELD_PSSYSPFPLUGINID)
    public void setPSSysPFPluginId(String pSSysPFPluginId){
        this.set(FIELD_PSSYSPFPLUGINID, pSSysPFPluginId);
    }
    
    /**
     * 获取 前端扩展插件  
     * @return
     */
    @JsonIgnore
    public String getPSSysPFPluginId(){
        Object objValue = this.get(FIELD_PSSYSPFPLUGINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端扩展插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysPFPluginIdDirty(){
        if(this.contains(FIELD_PSSYSPFPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端扩展插件
     */
    @JsonIgnore
    public void resetPSSysPFPluginId(){
        this.reset(FIELD_PSSYSPFPLUGINID);
    }

    /**
     * 设置 前端扩展插件，详细说明：{@link #FIELD_PSSYSPFPLUGINID}
     * <P>
     * 等同 {@link #setPSSysPFPluginId}
     * @param pSSysPFPluginId
     */
    @JsonIgnore
    public PSSysSearchBarItem pssyspfpluginid(String pSSysPFPluginId){
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    /**
     * 设置 前端扩展插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysPFPluginId}
     * @param pSSysPFPlugin 引用对象
     */
    @JsonIgnore
    public PSSysSearchBarItem pssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
        if(pSSysPFPlugin == null){
            this.setPSSysPFPluginId(null);
            this.setPSSysPFPluginName(null);
        }
        else{
            this.setPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端扩展插件，指定系统搜索栏项使用的前端模板扩展插件，使用插件类型【搜索栏项绘制插件】
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSPFPLUGINID}
     */
    public final static String FIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";

    /**
     * 设置 前端扩展插件，详细说明：{@link #FIELD_PSSYSPFPLUGINNAME}
     * 
     * @param pSSysPFPluginName
     * 
     */
    @JsonProperty(FIELD_PSSYSPFPLUGINNAME)
    public void setPSSysPFPluginName(String pSSysPFPluginName){
        this.set(FIELD_PSSYSPFPLUGINNAME, pSSysPFPluginName);
    }
    
    /**
     * 获取 前端扩展插件  
     * @return
     */
    @JsonIgnore
    public String getPSSysPFPluginName(){
        Object objValue = this.get(FIELD_PSSYSPFPLUGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端扩展插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysPFPluginNameDirty(){
        if(this.contains(FIELD_PSSYSPFPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端扩展插件
     */
    @JsonIgnore
    public void resetPSSysPFPluginName(){
        this.reset(FIELD_PSSYSPFPLUGINNAME);
    }

    /**
     * 设置 前端扩展插件，详细说明：{@link #FIELD_PSSYSPFPLUGINNAME}
     * <P>
     * 等同 {@link #setPSSysPFPluginName}
     * @param pSSysPFPluginName
     */
    @JsonIgnore
    public PSSysSearchBarItem pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    /**
     * <B>PSSYSRESOURCEID</B>&nbsp;系统资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysResource} 
     */
    public final static String FIELD_PSSYSRESOURCEID = "pssysresourceid";

    /**
     * 设置 系统资源
     * 
     * @param pSSysResourceId
     * 
     */
    @JsonProperty(FIELD_PSSYSRESOURCEID)
    public void setPSSysResourceId(String pSSysResourceId){
        this.set(FIELD_PSSYSRESOURCEID, pSSysResourceId);
    }
    
    /**
     * 获取 系统资源  
     * @return
     */
    @JsonIgnore
    public String getPSSysResourceId(){
        Object objValue = this.get(FIELD_PSSYSRESOURCEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysResourceIdDirty(){
        if(this.contains(FIELD_PSSYSRESOURCEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统资源
     */
    @JsonIgnore
    public void resetPSSysResourceId(){
        this.reset(FIELD_PSSYSRESOURCEID);
    }

    /**
     * 设置 系统资源
     * <P>
     * 等同 {@link #setPSSysResourceId}
     * @param pSSysResourceId
     */
    @JsonIgnore
    public PSSysSearchBarItem pssysresourceid(String pSSysResourceId){
        this.setPSSysResourceId(pSSysResourceId);
        return this;
    }

    /**
     * 设置 系统资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysResourceId}
     * @param pSSysResource 引用对象
     */
    @JsonIgnore
    public PSSysSearchBarItem pssysresourceid(PSSysResource pSSysResource){
        if(pSSysResource == null){
            this.setPSSysResourceId(null);
            this.setPSSysResourceName(null);
        }
        else{
            this.setPSSysResourceId(pSSysResource.getPSSysResourceId());
            this.setPSSysResourceName(pSSysResource.getPSSysResourceName());
        }
        return this;
    }

    /**
     * <B>PSSYSRESOURCENAME</B>&nbsp;系统资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSRESOURCEID}
     */
    public final static String FIELD_PSSYSRESOURCENAME = "pssysresourcename";

    /**
     * 设置 系统资源
     * 
     * @param pSSysResourceName
     * 
     */
    @JsonProperty(FIELD_PSSYSRESOURCENAME)
    public void setPSSysResourceName(String pSSysResourceName){
        this.set(FIELD_PSSYSRESOURCENAME, pSSysResourceName);
    }
    
    /**
     * 获取 系统资源  
     * @return
     */
    @JsonIgnore
    public String getPSSysResourceName(){
        Object objValue = this.get(FIELD_PSSYSRESOURCENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysResourceNameDirty(){
        if(this.contains(FIELD_PSSYSRESOURCENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统资源
     */
    @JsonIgnore
    public void resetPSSysResourceName(){
        this.reset(FIELD_PSSYSRESOURCENAME);
    }

    /**
     * 设置 系统资源
     * <P>
     * 等同 {@link #setPSSysResourceName}
     * @param pSSysResourceName
     */
    @JsonIgnore
    public PSSysSearchBarItem pssysresourcename(String pSSysResourceName){
        this.setPSSysResourceName(pSSysResourceName);
        return this;
    }

    /**
     * <B>PSSYSSEARCHBARID</B>&nbsp;系统搜索栏，指定搜素栏部件成员所在的搜索栏对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysSearchBar} 
     */
    public final static String FIELD_PSSYSSEARCHBARID = "pssyssearchbarid";

    /**
     * 设置 系统搜索栏，详细说明：{@link #FIELD_PSSYSSEARCHBARID}
     * 
     * @param pSSysSearchBarId
     * 
     */
    @JsonProperty(FIELD_PSSYSSEARCHBARID)
    public void setPSSysSearchBarId(String pSSysSearchBarId){
        this.set(FIELD_PSSYSSEARCHBARID, pSSysSearchBarId);
    }
    
    /**
     * 获取 系统搜索栏  
     * @return
     */
    @JsonIgnore
    public String getPSSysSearchBarId(){
        Object objValue = this.get(FIELD_PSSYSSEARCHBARID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统搜索栏 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSearchBarIdDirty(){
        if(this.contains(FIELD_PSSYSSEARCHBARID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统搜索栏
     */
    @JsonIgnore
    public void resetPSSysSearchBarId(){
        this.reset(FIELD_PSSYSSEARCHBARID);
    }

    /**
     * 设置 系统搜索栏，详细说明：{@link #FIELD_PSSYSSEARCHBARID}
     * <P>
     * 等同 {@link #setPSSysSearchBarId}
     * @param pSSysSearchBarId
     */
    @JsonIgnore
    public PSSysSearchBarItem pssyssearchbarid(String pSSysSearchBarId){
        this.setPSSysSearchBarId(pSSysSearchBarId);
        return this;
    }

    /**
     * 设置 系统搜索栏，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSearchBarId}
     * @param pSSysSearchBar 引用对象
     */
    @JsonIgnore
    public PSSysSearchBarItem pssyssearchbarid(PSSysSearchBar pSSysSearchBar){
        if(pSSysSearchBar == null){
            this.setMobFlag(null);
            this.setPSDEId(null);
            this.setPSSysSearchBarId(null);
            this.setPSSysSearchBarName(null);
        }
        else{
            this.setMobFlag(pSSysSearchBar.getMobFlag());
            this.setPSDEId(pSSysSearchBar.getPSDEId());
            this.setPSSysSearchBarId(pSSysSearchBar.getPSSysSearchBarId());
            this.setPSSysSearchBarName(pSSysSearchBar.getPSSysSearchBarName());
        }
        return this;
    }

    /**
     * <B>PSSYSSEARCHBARITEMID</B>&nbsp;系统搜索栏项标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSSEARCHBARITEMID = "pssyssearchbaritemid";

    /**
     * 设置 系统搜索栏项标识
     * 
     * @param pSSysSearchBarItemId
     * 
     */
    @JsonProperty(FIELD_PSSYSSEARCHBARITEMID)
    public void setPSSysSearchBarItemId(String pSSysSearchBarItemId){
        this.set(FIELD_PSSYSSEARCHBARITEMID, pSSysSearchBarItemId);
    }
    
    /**
     * 获取 系统搜索栏项标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysSearchBarItemId(){
        Object objValue = this.get(FIELD_PSSYSSEARCHBARITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统搜索栏项标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSearchBarItemIdDirty(){
        if(this.contains(FIELD_PSSYSSEARCHBARITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统搜索栏项标识
     */
    @JsonIgnore
    public void resetPSSysSearchBarItemId(){
        this.reset(FIELD_PSSYSSEARCHBARITEMID);
    }

    /**
     * 设置 系统搜索栏项标识
     * <P>
     * 等同 {@link #setPSSysSearchBarItemId}
     * @param pSSysSearchBarItemId
     */
    @JsonIgnore
    public PSSysSearchBarItem pssyssearchbaritemid(String pSSysSearchBarItemId){
        this.setPSSysSearchBarItemId(pSSysSearchBarItemId);
        return this;
    }

    /**
     * <B>PSSYSSEARCHBARITEMNAME</B>&nbsp;项名称，指定搜索栏部件项的名称，需在所在搜素栏部件具备唯一性
     * <P>
     * 字符串：最大长度 20，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSSYSSEARCHBARITEMNAME = "pssyssearchbaritemname";

    /**
     * 设置 项名称，详细说明：{@link #FIELD_PSSYSSEARCHBARITEMNAME}
     * 
     * @param pSSysSearchBarItemName
     * 
     */
    @JsonProperty(FIELD_PSSYSSEARCHBARITEMNAME)
    public void setPSSysSearchBarItemName(String pSSysSearchBarItemName){
        this.set(FIELD_PSSYSSEARCHBARITEMNAME, pSSysSearchBarItemName);
    }
    
    /**
     * 获取 项名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysSearchBarItemName(){
        Object objValue = this.get(FIELD_PSSYSSEARCHBARITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSearchBarItemNameDirty(){
        if(this.contains(FIELD_PSSYSSEARCHBARITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项名称
     */
    @JsonIgnore
    public void resetPSSysSearchBarItemName(){
        this.reset(FIELD_PSSYSSEARCHBARITEMNAME);
    }

    /**
     * 设置 项名称，详细说明：{@link #FIELD_PSSYSSEARCHBARITEMNAME}
     * <P>
     * 等同 {@link #setPSSysSearchBarItemName}
     * @param pSSysSearchBarItemName
     */
    @JsonIgnore
    public PSSysSearchBarItem pssyssearchbaritemname(String pSSysSearchBarItemName){
        this.setPSSysSearchBarItemName(pSSysSearchBarItemName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysSearchBarItemName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysSearchBarItemName(strName);
    }

    @JsonIgnore
    public PSSysSearchBarItem name(String strName){
        this.setPSSysSearchBarItemName(strName);
        return this;
    }

    /**
     * <B>PSSYSSEARCHBARNAME</B>&nbsp;系统搜索栏，指定搜素栏部件成员所在的搜索栏对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSEARCHBARID}
     */
    public final static String FIELD_PSSYSSEARCHBARNAME = "pssyssearchbarname";

    /**
     * 设置 系统搜索栏，详细说明：{@link #FIELD_PSSYSSEARCHBARNAME}
     * 
     * @param pSSysSearchBarName
     * 
     */
    @JsonProperty(FIELD_PSSYSSEARCHBARNAME)
    public void setPSSysSearchBarName(String pSSysSearchBarName){
        this.set(FIELD_PSSYSSEARCHBARNAME, pSSysSearchBarName);
    }
    
    /**
     * 获取 系统搜索栏  
     * @return
     */
    @JsonIgnore
    public String getPSSysSearchBarName(){
        Object objValue = this.get(FIELD_PSSYSSEARCHBARNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统搜索栏 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSearchBarNameDirty(){
        if(this.contains(FIELD_PSSYSSEARCHBARNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统搜索栏
     */
    @JsonIgnore
    public void resetPSSysSearchBarName(){
        this.reset(FIELD_PSSYSSEARCHBARNAME);
    }

    /**
     * 设置 系统搜索栏，详细说明：{@link #FIELD_PSSYSSEARCHBARNAME}
     * <P>
     * 等同 {@link #setPSSysSearchBarName}
     * @param pSSysSearchBarName
     */
    @JsonIgnore
    public PSSysSearchBarItem pssyssearchbarname(String pSSysSearchBarName){
        this.setPSSysSearchBarName(pSSysSearchBarName);
        return this;
    }

    /**
     * <B>RAWCONTENT</B>&nbsp;直接内容，直接内容项内容类型为【直接内容】时指定直接内容，未指定时使用指定的系统资源定义内容
     */
    public final static String FIELD_RAWCONTENT = "rawcontent";

    /**
     * 设置 直接内容，详细说明：{@link #FIELD_RAWCONTENT}
     * 
     * @param rawContent
     * 
     */
    @JsonProperty(FIELD_RAWCONTENT)
    public void setRawContent(String rawContent){
        this.set(FIELD_RAWCONTENT, rawContent);
    }
    
    /**
     * 获取 直接内容  
     * @return
     */
    @JsonIgnore
    public String getRawContent(){
        Object objValue = this.get(FIELD_RAWCONTENT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 直接内容 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRawContentDirty(){
        if(this.contains(FIELD_RAWCONTENT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 直接内容
     */
    @JsonIgnore
    public void resetRawContent(){
        this.reset(FIELD_RAWCONTENT);
    }

    /**
     * 设置 直接内容，详细说明：{@link #FIELD_RAWCONTENT}
     * <P>
     * 等同 {@link #setRawContent}
     * @param rawContent
     */
    @JsonIgnore
    public PSSysSearchBarItem rawcontent(String rawContent){
        this.setRawContent(rawContent);
        return this;
    }

    /**
     * <B>RAWCSSSTYLE</B>&nbsp;直接样式
     */
    public final static String FIELD_RAWCSSSTYLE = "rawcssstyle";

    /**
     * 设置 直接样式
     * 
     * @param rawCssStyle
     * 
     */
    @JsonProperty(FIELD_RAWCSSSTYLE)
    public void setRawCssStyle(String rawCssStyle){
        this.set(FIELD_RAWCSSSTYLE, rawCssStyle);
    }
    
    /**
     * 获取 直接样式  
     * @return
     */
    @JsonIgnore
    public String getRawCssStyle(){
        Object objValue = this.get(FIELD_RAWCSSSTYLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 直接样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRawCssStyleDirty(){
        if(this.contains(FIELD_RAWCSSSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 直接样式
     */
    @JsonIgnore
    public void resetRawCssStyle(){
        this.reset(FIELD_RAWCSSSTYLE);
    }

    /**
     * 设置 直接样式
     * <P>
     * 等同 {@link #setRawCssStyle}
     * @param rawCssStyle
     */
    @JsonIgnore
    public PSSysSearchBarItem rawcssstyle(String rawCssStyle){
        this.setRawCssStyle(rawCssStyle);
        return this;
    }

    /**
     * <B>RAWSERVICEMETHOD</B>&nbsp;直接服务请求方式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.RequestMethod} 
     */
    public final static String FIELD_RAWSERVICEMETHOD = "rawservicemethod";

    /**
     * 设置 直接服务请求方式
     * 
     * @param rawServiceMethod
     * 
     */
    @JsonProperty(FIELD_RAWSERVICEMETHOD)
    public void setRawServiceMethod(String rawServiceMethod){
        this.set(FIELD_RAWSERVICEMETHOD, rawServiceMethod);
    }
    
    /**
     * 获取 直接服务请求方式  
     * @return
     */
    @JsonIgnore
    public String getRawServiceMethod(){
        Object objValue = this.get(FIELD_RAWSERVICEMETHOD);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 直接服务请求方式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRawServiceMethodDirty(){
        if(this.contains(FIELD_RAWSERVICEMETHOD)){
            return true;
        }
        return false;
    }

    /**
     * 重置 直接服务请求方式
     */
    @JsonIgnore
    public void resetRawServiceMethod(){
        this.reset(FIELD_RAWSERVICEMETHOD);
    }

    /**
     * 设置 直接服务请求方式
     * <P>
     * 等同 {@link #setRawServiceMethod}
     * @param rawServiceMethod
     */
    @JsonIgnore
    public PSSysSearchBarItem rawservicemethod(String rawServiceMethod){
        this.setRawServiceMethod(rawServiceMethod);
        return this;
    }

     /**
     * 设置 直接服务请求方式
     * <P>
     * 等同 {@link #setRawServiceMethod}
     * @param rawServiceMethod
     */
    @JsonIgnore
    public PSSysSearchBarItem rawservicemethod(net.ibizsys.psmodel.core.util.PSModelEnums.RequestMethod rawServiceMethod){
        if(rawServiceMethod == null){
            this.setRawServiceMethod(null);
        }
        else{
            this.setRawServiceMethod(rawServiceMethod.value);
        }
        return this;
    }

    /**
     * <B>RAWSERVICEURL</B>&nbsp;直接服务路径
     */
    public final static String FIELD_RAWSERVICEURL = "rawserviceurl";

    /**
     * 设置 直接服务路径
     * 
     * @param rawServiceUrl
     * 
     */
    @JsonProperty(FIELD_RAWSERVICEURL)
    public void setRawServiceUrl(String rawServiceUrl){
        this.set(FIELD_RAWSERVICEURL, rawServiceUrl);
    }
    
    /**
     * 获取 直接服务路径  
     * @return
     */
    @JsonIgnore
    public String getRawServiceUrl(){
        Object objValue = this.get(FIELD_RAWSERVICEURL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 直接服务路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRawServiceUrlDirty(){
        if(this.contains(FIELD_RAWSERVICEURL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 直接服务路径
     */
    @JsonIgnore
    public void resetRawServiceUrl(){
        this.reset(FIELD_RAWSERVICEURL);
    }

    /**
     * 设置 直接服务路径
     * <P>
     * 等同 {@link #setRawServiceUrl}
     * @param rawServiceUrl
     */
    @JsonIgnore
    public PSSysSearchBarItem rawserviceurl(String rawServiceUrl){
        this.setRawServiceUrl(rawServiceUrl);
        return this;
    }

    /**
     * <B>RESETITEMNAME</B>&nbsp;重置项名称
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_RESETITEMNAME = "resetitemname";

    /**
     * 设置 重置项名称
     * 
     * @param resetItemName
     * 
     */
    @JsonProperty(FIELD_RESETITEMNAME)
    public void setResetItemName(String resetItemName){
        this.set(FIELD_RESETITEMNAME, resetItemName);
    }
    
    /**
     * 获取 重置项名称  
     * @return
     */
    @JsonIgnore
    public String getResetItemName(){
        Object objValue = this.get(FIELD_RESETITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 重置项名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isResetItemNameDirty(){
        if(this.contains(FIELD_RESETITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 重置项名称
     */
    @JsonIgnore
    public void resetResetItemName(){
        this.reset(FIELD_RESETITEMNAME);
    }

    /**
     * 设置 重置项名称
     * <P>
     * 等同 {@link #setResetItemName}
     * @param resetItemName
     */
    @JsonIgnore
    public PSSysSearchBarItem resetitemname(String resetItemName){
        this.setResetItemName(resetItemName);
        return this;
    }

    /**
     * <B>SHOWCAPTION</B>&nbsp;显示标题
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_SHOWCAPTION = "showcaption";

    /**
     * 设置 显示标题
     * 
     * @param showCaption
     * 
     */
    @JsonProperty(FIELD_SHOWCAPTION)
    public void setShowCaption(Integer showCaption){
        this.set(FIELD_SHOWCAPTION, showCaption);
    }
    
    /**
     * 获取 显示标题  
     * @return
     */
    @JsonIgnore
    public Integer getShowCaption(){
        Object objValue = this.get(FIELD_SHOWCAPTION);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 显示标题 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isShowCaptionDirty(){
        if(this.contains(FIELD_SHOWCAPTION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 显示标题
     */
    @JsonIgnore
    public void resetShowCaption(){
        this.reset(FIELD_SHOWCAPTION);
    }

    /**
     * 设置 显示标题
     * <P>
     * 等同 {@link #setShowCaption}
     * @param showCaption
     */
    @JsonIgnore
    public PSSysSearchBarItem showcaption(Integer showCaption){
        this.setShowCaption(showCaption);
        return this;
    }

     /**
     * 设置 显示标题
     * <P>
     * 等同 {@link #setShowCaption}
     * @param showCaption
     */
    @JsonIgnore
    public PSSysSearchBarItem showcaption(Boolean showCaption){
        if(showCaption == null){
            this.setShowCaption(null);
        }
        else{
            this.setShowCaption(showCaption?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>TEMPLATEMODE</B>&nbsp;模板模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_TEMPLATEMODE = "templatemode";

    /**
     * 设置 模板模式
     * 
     * @param templateMode
     * 
     */
    @JsonProperty(FIELD_TEMPLATEMODE)
    public void setTemplateMode(Integer templateMode){
        this.set(FIELD_TEMPLATEMODE, templateMode);
    }
    
    /**
     * 获取 模板模式  
     * @return
     */
    @JsonIgnore
    public Integer getTemplateMode(){
        Object objValue = this.get(FIELD_TEMPLATEMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 模板模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTemplateModeDirty(){
        if(this.contains(FIELD_TEMPLATEMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模板模式
     */
    @JsonIgnore
    public void resetTemplateMode(){
        this.reset(FIELD_TEMPLATEMODE);
    }

    /**
     * 设置 模板模式
     * <P>
     * 等同 {@link #setTemplateMode}
     * @param templateMode
     */
    @JsonIgnore
    public PSSysSearchBarItem templatemode(Integer templateMode){
        this.setTemplateMode(templateMode);
        return this;
    }

     /**
     * 设置 模板模式
     * <P>
     * 等同 {@link #setTemplateMode}
     * @param templateMode
     */
    @JsonIgnore
    public PSSysSearchBarItem templatemode(Boolean templateMode){
        if(templateMode == null){
            this.setTemplateMode(null);
        }
        else{
            this.setTemplateMode(templateMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>TIPPSLANRESID</B>&nbsp;工具提示语言资源，指定搜索栏部件成员的提示信息的多语言资源对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_TIPPSLANRESID = "tippslanresid";

    /**
     * 设置 工具提示语言资源，详细说明：{@link #FIELD_TIPPSLANRESID}
     * 
     * @param tipPSLanResId
     * 
     */
    @JsonProperty(FIELD_TIPPSLANRESID)
    public void setTipPSLanResId(String tipPSLanResId){
        this.set(FIELD_TIPPSLANRESID, tipPSLanResId);
    }
    
    /**
     * 获取 工具提示语言资源  
     * @return
     */
    @JsonIgnore
    public String getTipPSLanResId(){
        Object objValue = this.get(FIELD_TIPPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工具提示语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTipPSLanResIdDirty(){
        if(this.contains(FIELD_TIPPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工具提示语言资源
     */
    @JsonIgnore
    public void resetTipPSLanResId(){
        this.reset(FIELD_TIPPSLANRESID);
    }

    /**
     * 设置 工具提示语言资源，详细说明：{@link #FIELD_TIPPSLANRESID}
     * <P>
     * 等同 {@link #setTipPSLanResId}
     * @param tipPSLanResId
     */
    @JsonIgnore
    public PSSysSearchBarItem tippslanresid(String tipPSLanResId){
        this.setTipPSLanResId(tipPSLanResId);
        return this;
    }

    /**
     * 设置 工具提示语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTipPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSSysSearchBarItem tippslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setTipPSLanResId(null);
            this.setTipPSLanResName(null);
        }
        else{
            this.setTipPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setTipPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>TIPPSLANRESNAME</B>&nbsp;工具提示语言资源，指定搜索栏部件成员的提示信息的多语言资源对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TIPPSLANRESID}
     */
    public final static String FIELD_TIPPSLANRESNAME = "tippslanresname";

    /**
     * 设置 工具提示语言资源，详细说明：{@link #FIELD_TIPPSLANRESNAME}
     * 
     * @param tipPSLanResName
     * 
     */
    @JsonProperty(FIELD_TIPPSLANRESNAME)
    public void setTipPSLanResName(String tipPSLanResName){
        this.set(FIELD_TIPPSLANRESNAME, tipPSLanResName);
    }
    
    /**
     * 获取 工具提示语言资源  
     * @return
     */
    @JsonIgnore
    public String getTipPSLanResName(){
        Object objValue = this.get(FIELD_TIPPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工具提示语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTipPSLanResNameDirty(){
        if(this.contains(FIELD_TIPPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工具提示语言资源
     */
    @JsonIgnore
    public void resetTipPSLanResName(){
        this.reset(FIELD_TIPPSLANRESNAME);
    }

    /**
     * 设置 工具提示语言资源，详细说明：{@link #FIELD_TIPPSLANRESNAME}
     * <P>
     * 等同 {@link #setTipPSLanResName}
     * @param tipPSLanResName
     */
    @JsonIgnore
    public PSSysSearchBarItem tippslanresname(String tipPSLanResName){
        this.setTipPSLanResName(tipPSLanResName);
        return this;
    }

    /**
     * <B>TOOLTIPINFO</B>&nbsp;提示信息，指定搜索栏部件成员的提示信息
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_TOOLTIPINFO = "tooltipinfo";

    /**
     * 设置 提示信息，详细说明：{@link #FIELD_TOOLTIPINFO}
     * 
     * @param tooltipInfo
     * 
     */
    @JsonProperty(FIELD_TOOLTIPINFO)
    public void setTooltipInfo(String tooltipInfo){
        this.set(FIELD_TOOLTIPINFO, tooltipInfo);
    }
    
    /**
     * 获取 提示信息  
     * @return
     */
    @JsonIgnore
    public String getTooltipInfo(){
        Object objValue = this.get(FIELD_TOOLTIPINFO);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 提示信息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTooltipInfoDirty(){
        if(this.contains(FIELD_TOOLTIPINFO)){
            return true;
        }
        return false;
    }

    /**
     * 重置 提示信息
     */
    @JsonIgnore
    public void resetTooltipInfo(){
        this.reset(FIELD_TOOLTIPINFO);
    }

    /**
     * 设置 提示信息，详细说明：{@link #FIELD_TOOLTIPINFO}
     * <P>
     * 等同 {@link #setTooltipInfo}
     * @param tooltipInfo
     */
    @JsonIgnore
    public PSSysSearchBarItem tooltipinfo(String tooltipInfo){
        this.setTooltipInfo(tooltipInfo);
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
    public PSSysSearchBarItem updatedate(String updateDate){
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
    public PSSysSearchBarItem updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>USERCAT</B>&nbsp;用户分类
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat} 
     */
    public final static String FIELD_USERCAT = "usercat";

    /**
     * 设置 用户分类
     * 
     * @param userCat
     * 
     */
    @JsonProperty(FIELD_USERCAT)
    public void setUserCat(String userCat){
        this.set(FIELD_USERCAT, userCat);
    }
    
    /**
     * 获取 用户分类  
     * @return
     */
    @JsonIgnore
    public String getUserCat(){
        Object objValue = this.get(FIELD_USERCAT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户分类 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserCatDirty(){
        if(this.contains(FIELD_USERCAT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户分类
     */
    @JsonIgnore
    public void resetUserCat(){
        this.reset(FIELD_USERCAT);
    }

    /**
     * 设置 用户分类
     * <P>
     * 等同 {@link #setUserCat}
     * @param userCat
     */
    @JsonIgnore
    public PSSysSearchBarItem usercat(String userCat){
        this.setUserCat(userCat);
        return this;
    }

     /**
     * 设置 用户分类
     * <P>
     * 等同 {@link #setUserCat}
     * @param userCat
     */
    @JsonIgnore
    public PSSysSearchBarItem usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat.value);
        }
        return this;
    }

    /**
     * <B>USERPARAMS</B>&nbsp;自定义参数
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_USERPARAMS = "userparams";

    /**
     * 设置 自定义参数
     * 
     * @param userParams
     * 
     */
    @JsonProperty(FIELD_USERPARAMS)
    public void setUserParams(String userParams){
        this.set(FIELD_USERPARAMS, userParams);
    }
    
    /**
     * 获取 自定义参数  
     * @return
     */
    @JsonIgnore
    public String getUserParams(){
        Object objValue = this.get(FIELD_USERPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserParamsDirty(){
        if(this.contains(FIELD_USERPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义参数
     */
    @JsonIgnore
    public void resetUserParams(){
        this.reset(FIELD_USERPARAMS);
    }

    /**
     * 设置 自定义参数
     * <P>
     * 等同 {@link #setUserParams}
     * @param userParams
     */
    @JsonIgnore
    public PSSysSearchBarItem userparams(String userParams){
        this.setUserParams(userParams);
        return this;
    }

    /**
     * <B>USERTAG</B>&nbsp;用户标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_USERTAG = "usertag";

    /**
     * 设置 用户标记
     * 
     * @param userTag
     * 
     */
    @JsonProperty(FIELD_USERTAG)
    public void setUserTag(String userTag){
        this.set(FIELD_USERTAG, userTag);
    }
    
    /**
     * 获取 用户标记  
     * @return
     */
    @JsonIgnore
    public String getUserTag(){
        Object objValue = this.get(FIELD_USERTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserTagDirty(){
        if(this.contains(FIELD_USERTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户标记
     */
    @JsonIgnore
    public void resetUserTag(){
        this.reset(FIELD_USERTAG);
    }

    /**
     * 设置 用户标记
     * <P>
     * 等同 {@link #setUserTag}
     * @param userTag
     */
    @JsonIgnore
    public PSSysSearchBarItem usertag(String userTag){
        this.setUserTag(userTag);
        return this;
    }

    /**
     * <B>USERTAG2</B>&nbsp;用户标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_USERTAG2 = "usertag2";

    /**
     * 设置 用户标记2
     * 
     * @param userTag2
     * 
     */
    @JsonProperty(FIELD_USERTAG2)
    public void setUserTag2(String userTag2){
        this.set(FIELD_USERTAG2, userTag2);
    }
    
    /**
     * 获取 用户标记2  
     * @return
     */
    @JsonIgnore
    public String getUserTag2(){
        Object objValue = this.get(FIELD_USERTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserTag2Dirty(){
        if(this.contains(FIELD_USERTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户标记2
     */
    @JsonIgnore
    public void resetUserTag2(){
        this.reset(FIELD_USERTAG2);
    }

    /**
     * 设置 用户标记2
     * <P>
     * 等同 {@link #setUserTag2}
     * @param userTag2
     */
    @JsonIgnore
    public PSSysSearchBarItem usertag2(String userTag2){
        this.setUserTag2(userTag2);
        return this;
    }

    /**
     * <B>USERTAG3</B>&nbsp;用户标记3
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_USERTAG3 = "usertag3";

    /**
     * 设置 用户标记3
     * 
     * @param userTag3
     * 
     */
    @JsonProperty(FIELD_USERTAG3)
    public void setUserTag3(String userTag3){
        this.set(FIELD_USERTAG3, userTag3);
    }
    
    /**
     * 获取 用户标记3  
     * @return
     */
    @JsonIgnore
    public String getUserTag3(){
        Object objValue = this.get(FIELD_USERTAG3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户标记3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserTag3Dirty(){
        if(this.contains(FIELD_USERTAG3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户标记3
     */
    @JsonIgnore
    public void resetUserTag3(){
        this.reset(FIELD_USERTAG3);
    }

    /**
     * 设置 用户标记3
     * <P>
     * 等同 {@link #setUserTag3}
     * @param userTag3
     */
    @JsonIgnore
    public PSSysSearchBarItem usertag3(String userTag3){
        this.setUserTag3(userTag3);
        return this;
    }

    /**
     * <B>USERTAG4</B>&nbsp;用户标记4
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_USERTAG4 = "usertag4";

    /**
     * 设置 用户标记4
     * 
     * @param userTag4
     * 
     */
    @JsonProperty(FIELD_USERTAG4)
    public void setUserTag4(String userTag4){
        this.set(FIELD_USERTAG4, userTag4);
    }
    
    /**
     * 获取 用户标记4  
     * @return
     */
    @JsonIgnore
    public String getUserTag4(){
        Object objValue = this.get(FIELD_USERTAG4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户标记4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserTag4Dirty(){
        if(this.contains(FIELD_USERTAG4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户标记4
     */
    @JsonIgnore
    public void resetUserTag4(){
        this.reset(FIELD_USERTAG4);
    }

    /**
     * 设置 用户标记4
     * <P>
     * 等同 {@link #setUserTag4}
     * @param userTag4
     */
    @JsonIgnore
    public PSSysSearchBarItem usertag4(String userTag4){
        this.setUserTag4(userTag4);
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
    public PSSysSearchBarItem validflag(Integer validFlag){
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
    public PSSysSearchBarItem validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>VALUEITEMNAME</B>&nbsp;值项名称
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_VALUEITEMNAME = "valueitemname";

    /**
     * 设置 值项名称
     * 
     * @param valueItemName
     * 
     */
    @JsonProperty(FIELD_VALUEITEMNAME)
    public void setValueItemName(String valueItemName){
        this.set(FIELD_VALUEITEMNAME, valueItemName);
    }
    
    /**
     * 获取 值项名称  
     * @return
     */
    @JsonIgnore
    public String getValueItemName(){
        Object objValue = this.get(FIELD_VALUEITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值项名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isValueItemNameDirty(){
        if(this.contains(FIELD_VALUEITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值项名称
     */
    @JsonIgnore
    public void resetValueItemName(){
        this.reset(FIELD_VALUEITEMNAME);
    }

    /**
     * 设置 值项名称
     * <P>
     * 等同 {@link #setValueItemName}
     * @param valueItemName
     */
    @JsonIgnore
    public PSSysSearchBarItem valueitemname(String valueItemName){
        this.setValueItemName(valueItemName);
        return this;
    }

    /**
     * <B>WIDTH</B>&nbsp;宽度
     */
    public final static String FIELD_WIDTH = "width";

    /**
     * 设置 宽度
     * 
     * @param width
     * 
     */
    @JsonProperty(FIELD_WIDTH)
    public void setWidth(BigDecimal width){
        this.set(FIELD_WIDTH, width);
    }
    
    /**
     * 获取 宽度  
     * @return
     */
    @JsonIgnore
    public BigDecimal getWidth(){
        Object objValue = this.get(FIELD_WIDTH);
        if(objValue==null){
            return null;
        }
        return (BigDecimal)objValue;
    }

    /**
     * 判断 宽度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWidthDirty(){
        if(this.contains(FIELD_WIDTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 宽度
     */
    @JsonIgnore
    public void resetWidth(){
        this.reset(FIELD_WIDTH);
    }

    /**
     * 设置 宽度
     * <P>
     * 等同 {@link #setWidth}
     * @param width
     */
    @JsonIgnore
    public PSSysSearchBarItem width(BigDecimal width){
        this.setWidth(width);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysSearchBarItemId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysSearchBarItemId(strValue);
    }

    @JsonIgnore
    public PSSysSearchBarItem id(String strValue){
        this.setPSSysSearchBarItemId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysSearchBarItem){
            PSSysSearchBarItem model = (PSSysSearchBarItem)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
