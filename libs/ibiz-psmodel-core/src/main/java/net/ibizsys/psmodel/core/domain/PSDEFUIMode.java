package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEFUIMODE</B>实体属性界面配置 模型传输对象
 * <P>
 * 实体属性的界面模式模型，属性在桌面端或移动端会存在不同的表现样式，在不同业务场景甚至不同的前端应用中也会有不同的展现需求。属性界面模式就是将属性的表现需求进行归纳，以默认或显式的方式进行使用
 */
public class PSDEFUIMode extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEFUIMode(){
    }      

    /**
     * <B>ALLOWEMPTY</B>&nbsp;允许空输入，指定应用属性界面模式的编辑项是否允许空值输入，未定义时使用实体属性的【允许为空】配置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ALLOWEMPTY = "allowempty";

    /**
     * 设置 允许空输入，详细说明：{@link #FIELD_ALLOWEMPTY}
     * 
     * @param allowEmpty
     * 
     */
    @JsonProperty(FIELD_ALLOWEMPTY)
    public void setAllowEmpty(Integer allowEmpty){
        this.set(FIELD_ALLOWEMPTY, allowEmpty);
    }
    
    /**
     * 获取 允许空输入  
     * @return
     */
    @JsonIgnore
    public Integer getAllowEmpty(){
        Object objValue = this.get(FIELD_ALLOWEMPTY);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 允许空输入 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAllowEmptyDirty(){
        if(this.contains(FIELD_ALLOWEMPTY)){
            return true;
        }
        return false;
    }

    /**
     * 重置 允许空输入
     */
    @JsonIgnore
    public void resetAllowEmpty(){
        this.reset(FIELD_ALLOWEMPTY);
    }

    /**
     * 设置 允许空输入，详细说明：{@link #FIELD_ALLOWEMPTY}
     * <P>
     * 等同 {@link #setAllowEmpty}
     * @param allowEmpty
     */
    @JsonIgnore
    public PSDEFUIMode allowempty(Integer allowEmpty){
        this.setAllowEmpty(allowEmpty);
        return this;
    }

     /**
     * 设置 允许空输入，详细说明：{@link #FIELD_ALLOWEMPTY}
     * <P>
     * 等同 {@link #setAllowEmpty}
     * @param allowEmpty
     */
    @JsonIgnore
    public PSDEFUIMode allowempty(Boolean allowEmpty){
        if(allowEmpty == null){
            this.setAllowEmpty(null);
        }
        else{
            this.setAllowEmpty(allowEmpty?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CAPPSLANRESID</B>&nbsp;标题语言资源，指定属性界面模式标题多语言资源对象，未定义时使用属性逻辑名称的多语言资源对象
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
    public PSDEFUIMode cappslanresid(String capPSLanResId){
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
    public PSDEFUIMode cappslanresid(PSLanguageRes pSLanguageRes){
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
     * <B>CAPPSLANRESNAME</B>&nbsp;标题语言资源，指定属性界面模式标题多语言资源对象，未定义时使用属性逻辑名称的多语言资源对象
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
    public PSDEFUIMode cappslanresname(String capPSLanResName){
        this.setCapPSLanResName(capPSLanResName);
        return this;
    }

    /**
     * <B>CAPTION</B>&nbsp;标题，指定属性界面模式的标题，未定义时使用属性的逻辑名称
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
    public PSDEFUIMode caption(String caption){
        this.setCaption(caption);
        return this;
    }

    /**
     * <B>CODELISTCONFIGMODE</B>&nbsp;输出代码表配置模式，指定代码表配置的输出模式，此配置应用于早期技术的前端模板。未定义时为【无】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.OutputCodeListMode} 
     */
    public final static String FIELD_CODELISTCONFIGMODE = "codelistconfigmode";

    /**
     * 设置 输出代码表配置模式，详细说明：{@link #FIELD_CODELISTCONFIGMODE}
     * 
     * @param codeListConfigMode
     * 
     */
    @JsonProperty(FIELD_CODELISTCONFIGMODE)
    public void setCodeListConfigMode(Integer codeListConfigMode){
        this.set(FIELD_CODELISTCONFIGMODE, codeListConfigMode);
    }
    
    /**
     * 获取 输出代码表配置模式  
     * @return
     */
    @JsonIgnore
    public Integer getCodeListConfigMode(){
        Object objValue = this.get(FIELD_CODELISTCONFIGMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 输出代码表配置模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCodeListConfigModeDirty(){
        if(this.contains(FIELD_CODELISTCONFIGMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输出代码表配置模式
     */
    @JsonIgnore
    public void resetCodeListConfigMode(){
        this.reset(FIELD_CODELISTCONFIGMODE);
    }

    /**
     * 设置 输出代码表配置模式，详细说明：{@link #FIELD_CODELISTCONFIGMODE}
     * <P>
     * 等同 {@link #setCodeListConfigMode}
     * @param codeListConfigMode
     */
    @JsonIgnore
    public PSDEFUIMode codelistconfigmode(Integer codeListConfigMode){
        this.setCodeListConfigMode(codeListConfigMode);
        return this;
    }

     /**
     * 设置 输出代码表配置模式，详细说明：{@link #FIELD_CODELISTCONFIGMODE}
     * <P>
     * 等同 {@link #setCodeListConfigMode}
     * @param codeListConfigMode
     */
    @JsonIgnore
    public PSDEFUIMode codelistconfigmode(net.ibizsys.psmodel.core.util.PSModelEnums.OutputCodeListMode codeListConfigMode){
        if(codeListConfigMode == null){
            this.setCodeListConfigMode(null);
        }
        else{
            this.setCodeListConfigMode(codeListConfigMode.value);
        }
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定属性界面模式的代码标识，需要在所在的实体属性中具有唯一性
     * <P>
     * 字符串：最大长度 30，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_CODENAME = "codename";

    /**
     * 设置 代码标识，详细说明：{@link #FIELD_CODENAME}
     * 
     * @param codeName
     * 
     */
    @JsonProperty(FIELD_CODENAME)
    public void setCodeName(String codeName){
        this.set(FIELD_CODENAME, codeName);
    }
    
    /**
     * 获取 代码标识  
     * @return
     */
    @JsonIgnore
    public String getCodeName(){
        Object objValue = this.get(FIELD_CODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCodeNameDirty(){
        if(this.contains(FIELD_CODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码标识
     */
    @JsonIgnore
    public void resetCodeName(){
        this.reset(FIELD_CODENAME);
    }

    /**
     * 设置 代码标识，详细说明：{@link #FIELD_CODENAME}
     * <P>
     * 等同 {@link #setCodeName}
     * @param codeName
     */
    @JsonIgnore
    public PSDEFUIMode codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>CONVERTCITEXT</B>&nbsp;转换代码项文本，指定是否将代码值转换为显示文本输出
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_CONVERTCITEXT = "convertcitext";

    /**
     * 设置 转换代码项文本，详细说明：{@link #FIELD_CONVERTCITEXT}
     * 
     * @param convertCIText
     * 
     */
    @JsonProperty(FIELD_CONVERTCITEXT)
    public void setConvertCIText(Integer convertCIText){
        this.set(FIELD_CONVERTCITEXT, convertCIText);
    }
    
    /**
     * 获取 转换代码项文本  
     * @return
     */
    @JsonIgnore
    public Integer getConvertCIText(){
        Object objValue = this.get(FIELD_CONVERTCITEXT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 转换代码项文本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isConvertCITextDirty(){
        if(this.contains(FIELD_CONVERTCITEXT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 转换代码项文本
     */
    @JsonIgnore
    public void resetConvertCIText(){
        this.reset(FIELD_CONVERTCITEXT);
    }

    /**
     * 设置 转换代码项文本，详细说明：{@link #FIELD_CONVERTCITEXT}
     * <P>
     * 等同 {@link #setConvertCIText}
     * @param convertCIText
     */
    @JsonIgnore
    public PSDEFUIMode convertcitext(Integer convertCIText){
        this.setConvertCIText(convertCIText);
        return this;
    }

     /**
     * 设置 转换代码项文本，详细说明：{@link #FIELD_CONVERTCITEXT}
     * <P>
     * 等同 {@link #setConvertCIText}
     * @param convertCIText
     */
    @JsonIgnore
    public PSDEFUIMode convertcitext(Boolean convertCIText){
        if(convertCIText == null){
            this.setConvertCIText(null);
        }
        else{
            this.setConvertCIText(convertCIText?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSDEFUIMode createdate(String createDate){
        this.setCreateDate(createDate);
        return this;
    }

    /**
     * <B>CREATEDV</B>&nbsp;建立默认值，指定应用属性界面模式的编辑项的建立默认值，未指定默认值类型时按直接值处理
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_CREATEDV = "createdv";

    /**
     * 设置 建立默认值，详细说明：{@link #FIELD_CREATEDV}
     * 
     * @param createDV
     * 
     */
    @JsonProperty(FIELD_CREATEDV)
    public void setCreateDV(String createDV){
        this.set(FIELD_CREATEDV, createDV);
    }
    
    /**
     * 获取 建立默认值  
     * @return
     */
    @JsonIgnore
    public String getCreateDV(){
        Object objValue = this.get(FIELD_CREATEDV);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 建立默认值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCreateDVDirty(){
        if(this.contains(FIELD_CREATEDV)){
            return true;
        }
        return false;
    }

    /**
     * 重置 建立默认值
     */
    @JsonIgnore
    public void resetCreateDV(){
        this.reset(FIELD_CREATEDV);
    }

    /**
     * 设置 建立默认值，详细说明：{@link #FIELD_CREATEDV}
     * <P>
     * 等同 {@link #setCreateDV}
     * @param createDV
     */
    @JsonIgnore
    public PSDEFUIMode createdv(String createDV){
        this.setCreateDV(createDV);
        return this;
    }

    /**
     * <B>CREATEDVT</B>&nbsp;新建默认值类型，指定应用属性界面模式的编辑项的建立默认值类型，未定义时为【直接值】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.CreateDefaultValueType} 
     */
    public final static String FIELD_CREATEDVT = "createdvt";

    /**
     * 设置 新建默认值类型，详细说明：{@link #FIELD_CREATEDVT}
     * 
     * @param createDVT
     * 
     */
    @JsonProperty(FIELD_CREATEDVT)
    public void setCreateDVT(String createDVT){
        this.set(FIELD_CREATEDVT, createDVT);
    }
    
    /**
     * 获取 新建默认值类型  
     * @return
     */
    @JsonIgnore
    public String getCreateDVT(){
        Object objValue = this.get(FIELD_CREATEDVT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 新建默认值类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCreateDVTDirty(){
        if(this.contains(FIELD_CREATEDVT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 新建默认值类型
     */
    @JsonIgnore
    public void resetCreateDVT(){
        this.reset(FIELD_CREATEDVT);
    }

    /**
     * 设置 新建默认值类型，详细说明：{@link #FIELD_CREATEDVT}
     * <P>
     * 等同 {@link #setCreateDVT}
     * @param createDVT
     */
    @JsonIgnore
    public PSDEFUIMode createdvt(String createDVT){
        this.setCreateDVT(createDVT);
        return this;
    }

     /**
     * 设置 新建默认值类型，详细说明：{@link #FIELD_CREATEDVT}
     * <P>
     * 等同 {@link #setCreateDVT}
     * @param createDVT
     */
    @JsonIgnore
    public PSDEFUIMode createdvt(net.ibizsys.psmodel.core.util.PSModelEnums.CreateDefaultValueType createDVT){
        if(createDVT == null){
            this.setCreateDVT(null);
        }
        else{
            this.setCreateDVT(createDVT.value);
        }
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
    public PSDEFUIMode createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>EDITORPARAMS</B>&nbsp;编辑器参数，指定属性界面模式的编辑器参数集合
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_EDITORPARAMS = "editorparams";

    /**
     * 设置 编辑器参数，详细说明：{@link #FIELD_EDITORPARAMS}
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
     * 设置 编辑器参数，详细说明：{@link #FIELD_EDITORPARAMS}
     * <P>
     * 等同 {@link #setEditorParams}
     * @param editorParams
     */
    @JsonIgnore
    public PSDEFUIMode editorparams(String editorParams){
        this.setEditorParams(editorParams);
        return this;
    }

    /**
     * <B>EDITORTYPE</B>&nbsp;编辑器类型，指定应用属性界面模式的编辑项的编辑器类型
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
    public PSDEFUIMode editortype(String editorType){
        this.setEditorType(editorType);
        return this;
    }

    /**
     * <B>ENABLEINPUTTIP</B>&nbsp;启用输入提示，指定应用属性界面模式的编辑项是否指定输入提示，未定义时为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEINPUTTIP = "enableinputtip";

    /**
     * 设置 启用输入提示，详细说明：{@link #FIELD_ENABLEINPUTTIP}
     * 
     * @param enableInputTip
     * 
     */
    @JsonProperty(FIELD_ENABLEINPUTTIP)
    public void setEnableInputTip(Integer enableInputTip){
        this.set(FIELD_ENABLEINPUTTIP, enableInputTip);
    }
    
    /**
     * 获取 启用输入提示  
     * @return
     */
    @JsonIgnore
    public Integer getEnableInputTip(){
        Object objValue = this.get(FIELD_ENABLEINPUTTIP);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用输入提示 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableInputTipDirty(){
        if(this.contains(FIELD_ENABLEINPUTTIP)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用输入提示
     */
    @JsonIgnore
    public void resetEnableInputTip(){
        this.reset(FIELD_ENABLEINPUTTIP);
    }

    /**
     * 设置 启用输入提示，详细说明：{@link #FIELD_ENABLEINPUTTIP}
     * <P>
     * 等同 {@link #setEnableInputTip}
     * @param enableInputTip
     */
    @JsonIgnore
    public PSDEFUIMode enableinputtip(Integer enableInputTip){
        this.setEnableInputTip(enableInputTip);
        return this;
    }

     /**
     * 设置 启用输入提示，详细说明：{@link #FIELD_ENABLEINPUTTIP}
     * <P>
     * 等同 {@link #setEnableInputTip}
     * @param enableInputTip
     */
    @JsonIgnore
    public PSDEFUIMode enableinputtip(Boolean enableInputTip){
        if(enableInputTip == null){
            this.setEnableInputTip(null);
        }
        else{
            this.setEnableInputTip(enableInputTip?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLERESETITEMNAME</B>&nbsp;启用重置项名称，指定应用属性界面模式的编辑项是否启用重置项名称配置，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLERESETITEMNAME = "enableresetitemname";

    /**
     * 设置 启用重置项名称，详细说明：{@link #FIELD_ENABLERESETITEMNAME}
     * 
     * @param enableResetItemName
     * 
     */
    @JsonProperty(FIELD_ENABLERESETITEMNAME)
    public void setEnableResetItemName(Integer enableResetItemName){
        this.set(FIELD_ENABLERESETITEMNAME, enableResetItemName);
    }
    
    /**
     * 获取 启用重置项名称  
     * @return
     */
    @JsonIgnore
    public Integer getEnableResetItemName(){
        Object objValue = this.get(FIELD_ENABLERESETITEMNAME);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用重置项名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableResetItemNameDirty(){
        if(this.contains(FIELD_ENABLERESETITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用重置项名称
     */
    @JsonIgnore
    public void resetEnableResetItemName(){
        this.reset(FIELD_ENABLERESETITEMNAME);
    }

    /**
     * 设置 启用重置项名称，详细说明：{@link #FIELD_ENABLERESETITEMNAME}
     * <P>
     * 等同 {@link #setEnableResetItemName}
     * @param enableResetItemName
     */
    @JsonIgnore
    public PSDEFUIMode enableresetitemname(Integer enableResetItemName){
        this.setEnableResetItemName(enableResetItemName);
        return this;
    }

     /**
     * 设置 启用重置项名称，详细说明：{@link #FIELD_ENABLERESETITEMNAME}
     * <P>
     * 等同 {@link #setEnableResetItemName}
     * @param enableResetItemName
     */
    @JsonIgnore
    public PSDEFUIMode enableresetitemname(Boolean enableResetItemName){
        if(enableResetItemName == null){
            this.setEnableResetItemName(null);
        }
        else{
            this.setEnableResetItemName(enableResetItemName?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEUNITNAME</B>&nbsp;启用单位名称，指定属性界面模式是否启用单位名称配置，未定义时为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEUNITNAME = "enableunitname";

    /**
     * 设置 启用单位名称，详细说明：{@link #FIELD_ENABLEUNITNAME}
     * 
     * @param enableUnitName
     * 
     */
    @JsonProperty(FIELD_ENABLEUNITNAME)
    public void setEnableUnitName(Integer enableUnitName){
        this.set(FIELD_ENABLEUNITNAME, enableUnitName);
    }
    
    /**
     * 获取 启用单位名称  
     * @return
     */
    @JsonIgnore
    public Integer getEnableUnitName(){
        Object objValue = this.get(FIELD_ENABLEUNITNAME);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用单位名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableUnitNameDirty(){
        if(this.contains(FIELD_ENABLEUNITNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用单位名称
     */
    @JsonIgnore
    public void resetEnableUnitName(){
        this.reset(FIELD_ENABLEUNITNAME);
    }

    /**
     * 设置 启用单位名称，详细说明：{@link #FIELD_ENABLEUNITNAME}
     * <P>
     * 等同 {@link #setEnableUnitName}
     * @param enableUnitName
     */
    @JsonIgnore
    public PSDEFUIMode enableunitname(Integer enableUnitName){
        this.setEnableUnitName(enableUnitName);
        return this;
    }

     /**
     * 设置 启用单位名称，详细说明：{@link #FIELD_ENABLEUNITNAME}
     * <P>
     * 等同 {@link #setEnableUnitName}
     * @param enableUnitName
     */
    @JsonIgnore
    public PSDEFUIMode enableunitname(Boolean enableUnitName){
        if(enableUnitName == null){
            this.setEnableUnitName(null);
        }
        else{
            this.setEnableUnitName(enableUnitName?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEVALUERULE</B>&nbsp;启用值规则
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEVALUERULE = "enablevaluerule";

    /**
     * 设置 启用值规则
     * 
     * @param enableValueRule
     * 
     */
    @JsonProperty(FIELD_ENABLEVALUERULE)
    public void setEnableValueRule(Integer enableValueRule){
        this.set(FIELD_ENABLEVALUERULE, enableValueRule);
    }
    
    /**
     * 获取 启用值规则  
     * @return
     */
    @JsonIgnore
    public Integer getEnableValueRule(){
        Object objValue = this.get(FIELD_ENABLEVALUERULE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用值规则 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableValueRuleDirty(){
        if(this.contains(FIELD_ENABLEVALUERULE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用值规则
     */
    @JsonIgnore
    public void resetEnableValueRule(){
        this.reset(FIELD_ENABLEVALUERULE);
    }

    /**
     * 设置 启用值规则
     * <P>
     * 等同 {@link #setEnableValueRule}
     * @param enableValueRule
     */
    @JsonIgnore
    public PSDEFUIMode enablevaluerule(Integer enableValueRule){
        this.setEnableValueRule(enableValueRule);
        return this;
    }

     /**
     * 设置 启用值规则
     * <P>
     * 等同 {@link #setEnableValueRule}
     * @param enableValueRule
     */
    @JsonIgnore
    public PSDEFUIMode enablevaluerule(Boolean enableValueRule){
        if(enableValueRule == null){
            this.setEnableValueRule(null);
        }
        else{
            this.setEnableValueRule(enableValueRule?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>FTMODE</B>&nbsp;应用模式，指定属性界面模式的应用场合
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEFUIMode} 
     */
    public final static String FIELD_FTMODE = "ftmode";

    /**
     * 设置 应用模式，详细说明：{@link #FIELD_FTMODE}
     * 
     * @param fTMode
     * 
     */
    @JsonProperty(FIELD_FTMODE)
    public void setFTMode(String fTMode){
        this.set(FIELD_FTMODE, fTMode);
    }
    
    /**
     * 获取 应用模式  
     * @return
     */
    @JsonIgnore
    public String getFTMode(){
        Object objValue = this.get(FIELD_FTMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFTModeDirty(){
        if(this.contains(FIELD_FTMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用模式
     */
    @JsonIgnore
    public void resetFTMode(){
        this.reset(FIELD_FTMODE);
    }

    /**
     * 设置 应用模式，详细说明：{@link #FIELD_FTMODE}
     * <P>
     * 等同 {@link #setFTMode}
     * @param fTMode
     */
    @JsonIgnore
    public PSDEFUIMode ftmode(String fTMode){
        this.setFTMode(fTMode);
        return this;
    }

     /**
     * 设置 应用模式，详细说明：{@link #FIELD_FTMODE}
     * <P>
     * 等同 {@link #setFTMode}
     * @param fTMode
     */
    @JsonIgnore
    public PSDEFUIMode ftmode(net.ibizsys.psmodel.core.util.PSModelEnums.DEFUIMode fTMode){
        if(fTMode == null){
            this.setFTMode(null);
        }
        else{
            this.setFTMode(fTMode.value);
        }
        return this;
    }

    /**
     * <B>GCRPSSYSPFPLUGINID</B>&nbsp;表格列绘制插件，指定应用属性界面模式的表格列绘制插件使用的前端模板扩展插件，使用插件类型【数据表格列绘制插件】
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysPFPlugin} 
     */
    public final static String FIELD_GCRPSSYSPFPLUGINID = "gcrpssyspfpluginid";

    /**
     * 设置 表格列绘制插件，详细说明：{@link #FIELD_GCRPSSYSPFPLUGINID}
     * 
     * @param gCRPSSysPFPluginId
     * 
     */
    @JsonProperty(FIELD_GCRPSSYSPFPLUGINID)
    public void setGCRPSSysPFPluginId(String gCRPSSysPFPluginId){
        this.set(FIELD_GCRPSSYSPFPLUGINID, gCRPSSysPFPluginId);
    }
    
    /**
     * 获取 表格列绘制插件  
     * @return
     */
    @JsonIgnore
    public String getGCRPSSysPFPluginId(){
        Object objValue = this.get(FIELD_GCRPSSYSPFPLUGINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表格列绘制插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGCRPSSysPFPluginIdDirty(){
        if(this.contains(FIELD_GCRPSSYSPFPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表格列绘制插件
     */
    @JsonIgnore
    public void resetGCRPSSysPFPluginId(){
        this.reset(FIELD_GCRPSSYSPFPLUGINID);
    }

    /**
     * 设置 表格列绘制插件，详细说明：{@link #FIELD_GCRPSSYSPFPLUGINID}
     * <P>
     * 等同 {@link #setGCRPSSysPFPluginId}
     * @param gCRPSSysPFPluginId
     */
    @JsonIgnore
    public PSDEFUIMode gcrpssyspfpluginid(String gCRPSSysPFPluginId){
        this.setGCRPSSysPFPluginId(gCRPSSysPFPluginId);
        return this;
    }

    /**
     * 设置 表格列绘制插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setGCRPSSysPFPluginId}
     * @param pSSysPFPlugin 引用对象
     */
    @JsonIgnore
    public PSDEFUIMode gcrpssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
        if(pSSysPFPlugin == null){
            this.setGCRPSSysPFPluginId(null);
            this.setGCRPSSysPFPluginName(null);
        }
        else{
            this.setGCRPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setGCRPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    /**
     * <B>GCRPSSYSPFPLUGINNAME</B>&nbsp;表格列绘制插件，指定应用属性界面模式的表格列绘制插件使用的前端模板扩展插件，使用插件类型【数据表格列绘制插件】
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GCRPSSYSPFPLUGINID}
     */
    public final static String FIELD_GCRPSSYSPFPLUGINNAME = "gcrpssyspfpluginname";

    /**
     * 设置 表格列绘制插件，详细说明：{@link #FIELD_GCRPSSYSPFPLUGINNAME}
     * 
     * @param gCRPSSysPFPluginName
     * 
     */
    @JsonProperty(FIELD_GCRPSSYSPFPLUGINNAME)
    public void setGCRPSSysPFPluginName(String gCRPSSysPFPluginName){
        this.set(FIELD_GCRPSSYSPFPLUGINNAME, gCRPSSysPFPluginName);
    }
    
    /**
     * 获取 表格列绘制插件  
     * @return
     */
    @JsonIgnore
    public String getGCRPSSysPFPluginName(){
        Object objValue = this.get(FIELD_GCRPSSYSPFPLUGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表格列绘制插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGCRPSSysPFPluginNameDirty(){
        if(this.contains(FIELD_GCRPSSYSPFPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表格列绘制插件
     */
    @JsonIgnore
    public void resetGCRPSSysPFPluginName(){
        this.reset(FIELD_GCRPSSYSPFPLUGINNAME);
    }

    /**
     * 设置 表格列绘制插件，详细说明：{@link #FIELD_GCRPSSYSPFPLUGINNAME}
     * <P>
     * 等同 {@link #setGCRPSSysPFPluginName}
     * @param gCRPSSysPFPluginName
     */
    @JsonIgnore
    public PSDEFUIMode gcrpssyspfpluginname(String gCRPSSysPFPluginName){
        this.setGCRPSSysPFPluginName(gCRPSSysPFPluginName);
        return this;
    }

    /**
     * <B>GRIDCOLALIGN</B>&nbsp;表格列对齐，指定应用属性界面模式的表格列的对齐方式，未定义时为【左对齐】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.GridColAlign} 
     */
    public final static String FIELD_GRIDCOLALIGN = "gridcolalign";

    /**
     * 设置 表格列对齐，详细说明：{@link #FIELD_GRIDCOLALIGN}
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
     * 设置 表格列对齐，详细说明：{@link #FIELD_GRIDCOLALIGN}
     * <P>
     * 等同 {@link #setGridColAlign}
     * @param gridColAlign
     */
    @JsonIgnore
    public PSDEFUIMode gridcolalign(String gridColAlign){
        this.setGridColAlign(gridColAlign);
        return this;
    }

     /**
     * 设置 表格列对齐，详细说明：{@link #FIELD_GRIDCOLALIGN}
     * <P>
     * 等同 {@link #setGridColAlign}
     * @param gridColAlign
     */
    @JsonIgnore
    public PSDEFUIMode gridcolalign(net.ibizsys.psmodel.core.util.PSModelEnums.GridColAlign gridColAlign){
        if(gridColAlign == null){
            this.setGridColAlign(null);
        }
        else{
            this.setGridColAlign(gridColAlign.value);
        }
        return this;
    }

    /**
     * <B>GRIDCOLCLMODE</B>&nbsp;表格列代码值转换，指定应用属性界面模式的表格列代码值的转换模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.CodeListConvertMode} 
     */
    public final static String FIELD_GRIDCOLCLMODE = "gridcolclmode";

    /**
     * 设置 表格列代码值转换，详细说明：{@link #FIELD_GRIDCOLCLMODE}
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
     * 设置 表格列代码值转换，详细说明：{@link #FIELD_GRIDCOLCLMODE}
     * <P>
     * 等同 {@link #setGridColCLMode}
     * @param gridColCLMode
     */
    @JsonIgnore
    public PSDEFUIMode gridcolclmode(String gridColCLMode){
        this.setGridColCLMode(gridColCLMode);
        return this;
    }

     /**
     * 设置 表格列代码值转换，详细说明：{@link #FIELD_GRIDCOLCLMODE}
     * <P>
     * 等同 {@link #setGridColCLMode}
     * @param gridColCLMode
     */
    @JsonIgnore
    public PSDEFUIMode gridcolclmode(net.ibizsys.psmodel.core.util.PSModelEnums.CodeListConvertMode gridColCLMode){
        if(gridColCLMode == null){
            this.setGridColCLMode(null);
        }
        else{
            this.setGridColCLMode(gridColCLMode.value);
        }
        return this;
    }

    /**
     * <B>GRIDCOLWIDTH</B>&nbsp;默认列宽，指定应用属性界面模式的表格列的默认宽度，未定义时为【100】
     */
    public final static String FIELD_GRIDCOLWIDTH = "gridcolwidth";

    /**
     * 设置 默认列宽，详细说明：{@link #FIELD_GRIDCOLWIDTH}
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
     * 设置 默认列宽，详细说明：{@link #FIELD_GRIDCOLWIDTH}
     * <P>
     * 等同 {@link #setGridColWidth}
     * @param gridColWidth
     */
    @JsonIgnore
    public PSDEFUIMode gridcolwidth(Integer gridColWidth){
        this.setGridColWidth(gridColWidth);
        return this;
    }

    /**
     * <B>HEIGHT</B>&nbsp;默认控件高度，指定应用属性界面模式的编辑项编辑器的默认高度，未定义时为编辑器默认高度
     */
    public final static String FIELD_HEIGHT = "height";

    /**
     * 设置 默认控件高度，详细说明：{@link #FIELD_HEIGHT}
     * 
     * @param height
     * 
     */
    @JsonProperty(FIELD_HEIGHT)
    public void setHeight(Integer height){
        this.set(FIELD_HEIGHT, height);
    }
    
    /**
     * 获取 默认控件高度  
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
     * 判断 默认控件高度 是否指定值，包括空值
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
     * 重置 默认控件高度
     */
    @JsonIgnore
    public void resetHeight(){
        this.reset(FIELD_HEIGHT);
    }

    /**
     * 设置 默认控件高度，详细说明：{@link #FIELD_HEIGHT}
     * <P>
     * 等同 {@link #setHeight}
     * @param height
     */
    @JsonIgnore
    public PSDEFUIMode height(Integer height){
        this.setHeight(height);
        return this;
    }

    /**
     * <B>IGNOREINPUT</B>&nbsp;忽略输入值，指定应用属性界面模式的编辑项忽略输入值的方式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.EditItemIgnoreMode} 
     */
    public final static String FIELD_IGNOREINPUT = "ignoreinput";

    /**
     * 设置 忽略输入值，详细说明：{@link #FIELD_IGNOREINPUT}
     * 
     * @param ignoreInput
     * 
     */
    @JsonProperty(FIELD_IGNOREINPUT)
    public void setIgnoreInput(Integer ignoreInput){
        this.set(FIELD_IGNOREINPUT, ignoreInput);
    }
    
    /**
     * 获取 忽略输入值  
     * @return
     */
    @JsonIgnore
    public Integer getIgnoreInput(){
        Object objValue = this.get(FIELD_IGNOREINPUT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 忽略输入值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIgnoreInputDirty(){
        if(this.contains(FIELD_IGNOREINPUT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 忽略输入值
     */
    @JsonIgnore
    public void resetIgnoreInput(){
        this.reset(FIELD_IGNOREINPUT);
    }

    /**
     * 设置 忽略输入值，详细说明：{@link #FIELD_IGNOREINPUT}
     * <P>
     * 等同 {@link #setIgnoreInput}
     * @param ignoreInput
     */
    @JsonIgnore
    public PSDEFUIMode ignoreinput(Integer ignoreInput){
        this.setIgnoreInput(ignoreInput);
        return this;
    }

     /**
     * 设置 忽略输入值，详细说明：{@link #FIELD_IGNOREINPUT}
     * <P>
     * 等同 {@link #setIgnoreInput}
     * @param ignoreInput
     */
    @JsonIgnore
    public PSDEFUIMode ignoreinput(net.ibizsys.psmodel.core.util.PSModelEnums.EditItemIgnoreMode ignoreInput){
        if(ignoreInput == null){
            this.setIgnoreInput(null);
        }
        else{
            this.setIgnoreInput(ignoreInput.value);
        }
        return this;
    }

    /**
     * <B>ITEMPSACHANDLERID</B>&nbsp;项处理对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSACHandler} 
     */
    public final static String FIELD_ITEMPSACHANDLERID = "itempsachandlerid";

    /**
     * 设置 项处理对象
     * 
     * @param itemPSACHandlerId
     * 
     */
    @JsonProperty(FIELD_ITEMPSACHANDLERID)
    public void setItemPSACHandlerId(String itemPSACHandlerId){
        this.set(FIELD_ITEMPSACHANDLERID, itemPSACHandlerId);
    }
    
    /**
     * 获取 项处理对象  
     * @return
     */
    @JsonIgnore
    public String getItemPSACHandlerId(){
        Object objValue = this.get(FIELD_ITEMPSACHANDLERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项处理对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemPSACHandlerIdDirty(){
        if(this.contains(FIELD_ITEMPSACHANDLERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项处理对象
     */
    @JsonIgnore
    public void resetItemPSACHandlerId(){
        this.reset(FIELD_ITEMPSACHANDLERID);
    }

    /**
     * 设置 项处理对象
     * <P>
     * 等同 {@link #setItemPSACHandlerId}
     * @param itemPSACHandlerId
     */
    @JsonIgnore
    public PSDEFUIMode itempsachandlerid(String itemPSACHandlerId){
        this.setItemPSACHandlerId(itemPSACHandlerId);
        return this;
    }

    /**
     * 设置 项处理对象，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setItemPSACHandlerId}
     * @param pSACHandler 引用对象
     */
    @JsonIgnore
    public PSDEFUIMode itempsachandlerid(PSACHandler pSACHandler){
        if(pSACHandler == null){
            this.setItemPSACHandlerId(null);
        }
        else{
            this.setItemPSACHandlerId(pSACHandler.getPSACHandlerId());
        }
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
    public PSDEFUIMode jsformat(String jSFormat){
        this.setJSFormat(jSFormat);
        return this;
    }

    /**
     * <B>MAXVALUE</B>&nbsp;最大值
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_MAXVALUE = "maxvalue";

    /**
     * 设置 最大值
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
     * 设置 最大值
     * <P>
     * 等同 {@link #setMaxValue}
     * @param maxValue
     */
    @JsonIgnore
    public PSDEFUIMode maxvalue(String maxValue){
        this.setMaxValue(maxValue);
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
    public PSDEFUIMode memo(String memo){
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
    public PSDEFUIMode minstrlength(Integer minStrLength){
        this.setMinStrLength(minStrLength);
        return this;
    }

    /**
     * <B>MINVALUE</B>&nbsp;最小值
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_MINVALUE = "minvalue";

    /**
     * 设置 最小值
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
     * 设置 最小值
     * <P>
     * 等同 {@link #setMinValue}
     * @param minValue
     */
    @JsonIgnore
    public PSDEFUIMode minvalue(String minValue){
        this.setMinValue(minValue);
        return this;
    }

    /**
     * <B>NEEDCODELISTCONFIG</B>&nbsp;需要提供代码表配置，指定应用属性界面模式的编辑项是否需要提供代码表配置，未定义由编辑器类型决定
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_NEEDCODELISTCONFIG = "needcodelistconfig";

    /**
     * 设置 需要提供代码表配置，详细说明：{@link #FIELD_NEEDCODELISTCONFIG}
     * 
     * @param needCodeListConfig
     * 
     */
    @JsonProperty(FIELD_NEEDCODELISTCONFIG)
    public void setNeedCodeListConfig(Integer needCodeListConfig){
        this.set(FIELD_NEEDCODELISTCONFIG, needCodeListConfig);
    }
    
    /**
     * 获取 需要提供代码表配置  
     * @return
     */
    @JsonIgnore
    public Integer getNeedCodeListConfig(){
        Object objValue = this.get(FIELD_NEEDCODELISTCONFIG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 需要提供代码表配置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNeedCodeListConfigDirty(){
        if(this.contains(FIELD_NEEDCODELISTCONFIG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 需要提供代码表配置
     */
    @JsonIgnore
    public void resetNeedCodeListConfig(){
        this.reset(FIELD_NEEDCODELISTCONFIG);
    }

    /**
     * 设置 需要提供代码表配置，详细说明：{@link #FIELD_NEEDCODELISTCONFIG}
     * <P>
     * 等同 {@link #setNeedCodeListConfig}
     * @param needCodeListConfig
     */
    @JsonIgnore
    public PSDEFUIMode needcodelistconfig(Integer needCodeListConfig){
        this.setNeedCodeListConfig(needCodeListConfig);
        return this;
    }

     /**
     * 设置 需要提供代码表配置，详细说明：{@link #FIELD_NEEDCODELISTCONFIG}
     * <P>
     * 等同 {@link #setNeedCodeListConfig}
     * @param needCodeListConfig
     */
    @JsonIgnore
    public PSDEFUIMode needcodelistconfig(Boolean needCodeListConfig){
        if(needCodeListConfig == null){
            this.setNeedCodeListConfig(null);
        }
        else{
            this.setNeedCodeListConfig(needCodeListConfig?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>NOSORT</B>&nbsp;禁用排序，指定应用属性界面模式的表格列的是否禁用排序，未定义时为长文本属性（CLOB）为【是】，其它为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_NOSORT = "nosort";

    /**
     * 设置 禁用排序，详细说明：{@link #FIELD_NOSORT}
     * 
     * @param noSort
     * 
     */
    @JsonProperty(FIELD_NOSORT)
    public void setNoSort(Integer noSort){
        this.set(FIELD_NOSORT, noSort);
    }
    
    /**
     * 获取 禁用排序  
     * @return
     */
    @JsonIgnore
    public Integer getNoSort(){
        Object objValue = this.get(FIELD_NOSORT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 禁用排序 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNoSortDirty(){
        if(this.contains(FIELD_NOSORT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 禁用排序
     */
    @JsonIgnore
    public void resetNoSort(){
        this.reset(FIELD_NOSORT);
    }

    /**
     * 设置 禁用排序，详细说明：{@link #FIELD_NOSORT}
     * <P>
     * 等同 {@link #setNoSort}
     * @param noSort
     */
    @JsonIgnore
    public PSDEFUIMode nosort(Integer noSort){
        this.setNoSort(noSort);
        return this;
    }

     /**
     * 设置 禁用排序，详细说明：{@link #FIELD_NOSORT}
     * <P>
     * 等同 {@link #setNoSort}
     * @param noSort
     */
    @JsonIgnore
    public PSDEFUIMode nosort(Boolean noSort){
        if(noSort == null){
            this.setNoSort(null);
        }
        else{
            this.setNoSort(noSort?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>PHPSLANRESID</B>&nbsp;占位提示语言资源，指定应用属性界面模式的编辑项的占位提示多语言资源对象
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
    public PSDEFUIMode phpslanresid(String pHPSLanResId){
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
    public PSDEFUIMode phpslanresid(PSLanguageRes pSLanguageRes){
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
     * <B>PHPSLANRESNAME</B>&nbsp;占位提示语言资源，指定应用属性界面模式的编辑项的占位提示多语言资源对象
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
    public PSDEFUIMode phpslanresname(String pHPSLanResName){
        this.setPHPSLanResName(pHPSLanResName);
        return this;
    }

    /**
     * <B>PICKUPTEXTOPTS</B>&nbsp;外键文本属性设定，指定应用属性界面模式的外键文本编辑项的设定，默认情况下外键文本编辑项会使用引用关系中定义的配置信息，外键文本属性设定支持定义使用引用关系配置的模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.FieldUIPickupTextOpt} 
     */
    public final static String FIELD_PICKUPTEXTOPTS = "pickuptextopts";

    /**
     * 设置 外键文本属性设定，详细说明：{@link #FIELD_PICKUPTEXTOPTS}
     * 
     * @param pickupTextOpts
     * 
     */
    @JsonProperty(FIELD_PICKUPTEXTOPTS)
    public void setPickupTextOpts(Integer pickupTextOpts){
        this.set(FIELD_PICKUPTEXTOPTS, pickupTextOpts);
    }
    
    /**
     * 获取 外键文本属性设定  
     * @return
     */
    @JsonIgnore
    public Integer getPickupTextOpts(){
        Object objValue = this.get(FIELD_PICKUPTEXTOPTS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 外键文本属性设定 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPickupTextOptsDirty(){
        if(this.contains(FIELD_PICKUPTEXTOPTS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 外键文本属性设定
     */
    @JsonIgnore
    public void resetPickupTextOpts(){
        this.reset(FIELD_PICKUPTEXTOPTS);
    }

    /**
     * 设置 外键文本属性设定，详细说明：{@link #FIELD_PICKUPTEXTOPTS}
     * <P>
     * 等同 {@link #setPickupTextOpts}
     * @param pickupTextOpts
     */
    @JsonIgnore
    public PSDEFUIMode pickuptextopts(Integer pickupTextOpts){
        this.setPickupTextOpts(pickupTextOpts);
        return this;
    }

     /**
     * 设置 外键文本属性设定，详细说明：{@link #FIELD_PICKUPTEXTOPTS}
     * <P>
     * 等同 {@link #setPickupTextOpts}
     * @param pickupTextOpts
     */
    @JsonIgnore
    public PSDEFUIMode pickuptextopts(net.ibizsys.psmodel.core.util.PSModelEnums.FieldUIPickupTextOpt[] pickupTextOpts){
        if(pickupTextOpts == null || pickupTextOpts.length == 0){
            this.setPickupTextOpts(null);
        }
        else{
            int _value = 0;
            for(net.ibizsys.psmodel.core.util.PSModelEnums.FieldUIPickupTextOpt _item : pickupTextOpts){
                _value |= _item.value;
            }
            this.setPickupTextOpts(_value);
        }
        return this;
    }

    /**
     * <B>PLACEHOLDER</B>&nbsp;占位提示，指定应用属性界面模式的编辑项的占位提示
     * <P>
     * 字符串：最大长度 100
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
    public PSDEFUIMode placeholder(String placeHolder){
        this.setPlaceHolder(placeHolder);
        return this;
    }

    /**
     * <B>PRECISION</B>&nbsp;浮点精度
     */
    public final static String FIELD_PRECISION = "precision";

    /**
     * 设置 浮点精度
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
     * 设置 浮点精度
     * <P>
     * 等同 {@link #setPrecision}
     * @param precision
     */
    @JsonIgnore
    public PSDEFUIMode precision(Integer precision){
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
     * <B>PSCODELISTID</B>&nbsp;系统代码表，指定属性界面模式相关的代码表对象，未定义时使用属性配置
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
    public PSDEFUIMode pscodelistid(String pSCodeListId){
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
    public PSDEFUIMode pscodelistid(PSCodeList pSCodeList){
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
     * <B>PSCODELISTNAME</B>&nbsp;系统代码表，指定属性界面模式相关的代码表对象，未定义时使用属性配置
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
    public PSDEFUIMode pscodelistname(String pSCodeListName){
        this.setPSCodeListName(pSCodeListName);
        return this;
    }

    /**
     * <B>PSDEFUIMODEID</B>&nbsp;实体属性表单项标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEFUIMODEID = "psdefuimodeid";

    /**
     * 设置 实体属性表单项标识
     * 
     * @param pSDEFUIModeId
     * 
     */
    @JsonProperty(FIELD_PSDEFUIMODEID)
    public void setPSDEFUIModeId(String pSDEFUIModeId){
        this.set(FIELD_PSDEFUIMODEID, pSDEFUIModeId);
        //属性名称与代码标识不一致，设置属性名称
        this.set("psdefformitemid", pSDEFUIModeId);
    }
    
    /**
     * 获取 实体属性表单项标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEFUIModeId(){
        Object objValue = this.get(FIELD_PSDEFUIMODEID);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("psdefformitemid");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 实体属性表单项标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFUIModeIdDirty(){
        if(this.contains(FIELD_PSDEFUIMODEID)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("psdefformitemid")){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体属性表单项标识
     */
    @JsonIgnore
    public void resetPSDEFUIModeId(){
        this.reset(FIELD_PSDEFUIMODEID);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("psdefformitemid");
    }

    /**
     * 设置 实体属性表单项标识
     * <P>
     * 等同 {@link #setPSDEFUIModeId}
     * @param pSDEFUIModeId
     */
    @JsonIgnore
    public PSDEFUIMode psdefuimodeid(String pSDEFUIModeId){
        this.setPSDEFUIModeId(pSDEFUIModeId);
        return this;
    }

    /**
     * <B>PSDEFUIMODENAME</B>&nbsp;属性界面模式名称，指定界面模式的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEFUIMODENAME = "psdefuimodename";

    /**
     * 设置 属性界面模式名称，详细说明：{@link #FIELD_PSDEFUIMODENAME}
     * 
     * @param pSDEFUIModeName
     * 
     */
    @JsonProperty(FIELD_PSDEFUIMODENAME)
    public void setPSDEFUIModeName(String pSDEFUIModeName){
        this.set(FIELD_PSDEFUIMODENAME, pSDEFUIModeName);
        //属性名称与代码标识不一致，设置属性名称
        this.set("psdefformitemname", pSDEFUIModeName);
    }
    
    /**
     * 获取 属性界面模式名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEFUIModeName(){
        Object objValue = this.get(FIELD_PSDEFUIMODENAME);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("psdefformitemname");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 属性界面模式名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFUIModeNameDirty(){
        if(this.contains(FIELD_PSDEFUIMODENAME)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("psdefformitemname")){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性界面模式名称
     */
    @JsonIgnore
    public void resetPSDEFUIModeName(){
        this.reset(FIELD_PSDEFUIMODENAME);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("psdefformitemname");
    }

    /**
     * 设置 属性界面模式名称，详细说明：{@link #FIELD_PSDEFUIMODENAME}
     * <P>
     * 等同 {@link #setPSDEFUIModeName}
     * @param pSDEFUIModeName
     */
    @JsonIgnore
    public PSDEFUIMode psdefuimodename(String pSDEFUIModeName){
        this.setPSDEFUIModeName(pSDEFUIModeName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEFUIModeName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEFUIModeName(strName);
    }

    @JsonIgnore
    public PSDEFUIMode name(String strName){
        this.setPSDEFUIModeName(strName);
        return this;
    }

    /**
     * <B>PSDEFID</B>&nbsp;实体属性，指定属性界面模式所在的实体属性对象
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
    public PSDEFUIMode psdefid(String pSDEFId){
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
    public PSDEFUIMode psdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setPSDEFId(null);
            this.setPSDEFName(null);
            this.setPSDEId(null);
            this.setPSDEName(null);
        }
        else{
            this.setPSDEFId(pSDEField.getPSDEFieldId());
            this.setPSDEFName(pSDEField.getPSDEFieldName());
            this.setPSDEId(pSDEField.getPSDEId());
            this.setPSDEName(pSDEField.getPSDEName());
        }
        return this;
    }

    /**
     * <B>PSDEFINPUTTIPID</B>&nbsp;属性输入提示，指定属性界面模式相关的属性输入提示对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEFInputTip} 
     */
    public final static String FIELD_PSDEFINPUTTIPID = "psdefinputtipid";

    /**
     * 设置 属性输入提示，详细说明：{@link #FIELD_PSDEFINPUTTIPID}
     * 
     * @param pSDEFInputTipId
     * 
     */
    @JsonProperty(FIELD_PSDEFINPUTTIPID)
    public void setPSDEFInputTipId(String pSDEFInputTipId){
        this.set(FIELD_PSDEFINPUTTIPID, pSDEFInputTipId);
    }
    
    /**
     * 获取 属性输入提示  
     * @return
     */
    @JsonIgnore
    public String getPSDEFInputTipId(){
        Object objValue = this.get(FIELD_PSDEFINPUTTIPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性输入提示 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFInputTipIdDirty(){
        if(this.contains(FIELD_PSDEFINPUTTIPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性输入提示
     */
    @JsonIgnore
    public void resetPSDEFInputTipId(){
        this.reset(FIELD_PSDEFINPUTTIPID);
    }

    /**
     * 设置 属性输入提示，详细说明：{@link #FIELD_PSDEFINPUTTIPID}
     * <P>
     * 等同 {@link #setPSDEFInputTipId}
     * @param pSDEFInputTipId
     */
    @JsonIgnore
    public PSDEFUIMode psdefinputtipid(String pSDEFInputTipId){
        this.setPSDEFInputTipId(pSDEFInputTipId);
        return this;
    }

    /**
     * 设置 属性输入提示，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEFInputTipId}
     * @param pSDEFInputTip 引用对象
     */
    @JsonIgnore
    public PSDEFUIMode psdefinputtipid(PSDEFInputTip pSDEFInputTip){
        if(pSDEFInputTip == null){
            this.setPSDEFInputTipId(null);
            this.setPSDEFInputTipName(null);
        }
        else{
            this.setPSDEFInputTipId(pSDEFInputTip.getPSDEFInputTipId());
            this.setPSDEFInputTipName(pSDEFInputTip.getPSDEFInputTipName());
        }
        return this;
    }

    /**
     * <B>PSDEFINPUTTIPNAME</B>&nbsp;属性输入提示，指定属性界面模式相关的属性输入提示对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFINPUTTIPID}
     */
    public final static String FIELD_PSDEFINPUTTIPNAME = "psdefinputtipname";

    /**
     * 设置 属性输入提示，详细说明：{@link #FIELD_PSDEFINPUTTIPNAME}
     * 
     * @param pSDEFInputTipName
     * 
     */
    @JsonProperty(FIELD_PSDEFINPUTTIPNAME)
    public void setPSDEFInputTipName(String pSDEFInputTipName){
        this.set(FIELD_PSDEFINPUTTIPNAME, pSDEFInputTipName);
    }
    
    /**
     * 获取 属性输入提示  
     * @return
     */
    @JsonIgnore
    public String getPSDEFInputTipName(){
        Object objValue = this.get(FIELD_PSDEFINPUTTIPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性输入提示 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFInputTipNameDirty(){
        if(this.contains(FIELD_PSDEFINPUTTIPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性输入提示
     */
    @JsonIgnore
    public void resetPSDEFInputTipName(){
        this.reset(FIELD_PSDEFINPUTTIPNAME);
    }

    /**
     * 设置 属性输入提示，详细说明：{@link #FIELD_PSDEFINPUTTIPNAME}
     * <P>
     * 等同 {@link #setPSDEFInputTipName}
     * @param pSDEFInputTipName
     */
    @JsonIgnore
    public PSDEFUIMode psdefinputtipname(String pSDEFInputTipName){
        this.setPSDEFInputTipName(pSDEFInputTipName);
        return this;
    }

    /**
     * <B>PSDEFNAME</B>&nbsp;实体属性，指定属性界面模式所在的实体属性对象
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
    public PSDEFUIMode psdefname(String pSDEFName){
        this.setPSDEFName(pSDEFName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFID}
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 实体
     * 
     * @param pSDEId
     * 
     */
    @JsonProperty(FIELD_PSDEID)
    public void setPSDEId(String pSDEId){
        this.set(FIELD_PSDEID, pSDEId);
    }
    
    /**
     * 获取 实体  
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
     * 判断 实体 是否指定值，包括空值
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
     * 重置 实体
     */
    @JsonIgnore
    public void resetPSDEId(){
        this.reset(FIELD_PSDEID);
    }

    /**
     * 设置 实体
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSDEFUIMode psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * <B>PSDENAME</B>&nbsp;实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFID}
     */
    public final static String FIELD_PSDENAME = "psdename";

    /**
     * 设置 实体
     * 
     * @param pSDEName
     * 
     */
    @JsonProperty(FIELD_PSDENAME)
    public void setPSDEName(String pSDEName){
        this.set(FIELD_PSDENAME, pSDEName);
    }
    
    /**
     * 获取 实体  
     * @return
     */
    @JsonIgnore
    public String getPSDEName(){
        Object objValue = this.get(FIELD_PSDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDENameDirty(){
        if(this.contains(FIELD_PSDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体
     */
    @JsonIgnore
    public void resetPSDEName(){
        this.reset(FIELD_PSDENAME);
    }

    /**
     * 设置 实体
     * <P>
     * 等同 {@link #setPSDEName}
     * @param pSDEName
     */
    @JsonIgnore
    public PSDEFUIMode psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSSYSAPPID</B>&nbsp;前端应用，属性界面模式应用场合为指定前端应用默认时指前端应用对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysApp} 
     */
    public final static String FIELD_PSSYSAPPID = "pssysappid";

    /**
     * 设置 前端应用，详细说明：{@link #FIELD_PSSYSAPPID}
     * 
     * @param pSSysAppId
     * 
     */
    @JsonProperty(FIELD_PSSYSAPPID)
    public void setPSSysAppId(String pSSysAppId){
        this.set(FIELD_PSSYSAPPID, pSSysAppId);
    }
    
    /**
     * 获取 前端应用  
     * @return
     */
    @JsonIgnore
    public String getPSSysAppId(){
        Object objValue = this.get(FIELD_PSSYSAPPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端应用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysAppIdDirty(){
        if(this.contains(FIELD_PSSYSAPPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端应用
     */
    @JsonIgnore
    public void resetPSSysAppId(){
        this.reset(FIELD_PSSYSAPPID);
    }

    /**
     * 设置 前端应用，详细说明：{@link #FIELD_PSSYSAPPID}
     * <P>
     * 等同 {@link #setPSSysAppId}
     * @param pSSysAppId
     */
    @JsonIgnore
    public PSDEFUIMode pssysappid(String pSSysAppId){
        this.setPSSysAppId(pSSysAppId);
        return this;
    }

    /**
     * 设置 前端应用，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysAppId}
     * @param pSSysApp 引用对象
     */
    @JsonIgnore
    public PSDEFUIMode pssysappid(PSSysApp pSSysApp){
        if(pSSysApp == null){
            this.setPSSysAppId(null);
            this.setPSSysAppName(null);
        }
        else{
            this.setPSSysAppId(pSSysApp.getPSSysAppId());
            this.setPSSysAppName(pSSysApp.getPSSysAppName());
        }
        return this;
    }

    /**
     * <B>PSSYSAPPNAME</B>&nbsp;前端应用，属性界面模式应用场合为指定前端应用默认时指前端应用对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSAPPID}
     */
    public final static String FIELD_PSSYSAPPNAME = "pssysappname";

    /**
     * 设置 前端应用，详细说明：{@link #FIELD_PSSYSAPPNAME}
     * 
     * @param pSSysAppName
     * 
     */
    @JsonProperty(FIELD_PSSYSAPPNAME)
    public void setPSSysAppName(String pSSysAppName){
        this.set(FIELD_PSSYSAPPNAME, pSSysAppName);
    }
    
    /**
     * 获取 前端应用  
     * @return
     */
    @JsonIgnore
    public String getPSSysAppName(){
        Object objValue = this.get(FIELD_PSSYSAPPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端应用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysAppNameDirty(){
        if(this.contains(FIELD_PSSYSAPPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端应用
     */
    @JsonIgnore
    public void resetPSSysAppName(){
        this.reset(FIELD_PSSYSAPPNAME);
    }

    /**
     * 设置 前端应用，详细说明：{@link #FIELD_PSSYSAPPNAME}
     * <P>
     * 等同 {@link #setPSSysAppName}
     * @param pSSysAppName
     */
    @JsonIgnore
    public PSDEFUIMode pssysappname(String pSSysAppName){
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    /**
     * <B>PSSYSDICTCATID</B>&nbsp;输入词条类别，指定应用属性界面模式的编辑项的辅助输入词条类别对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDictCat} 
     */
    public final static String FIELD_PSSYSDICTCATID = "pssysdictcatid";

    /**
     * 设置 输入词条类别，详细说明：{@link #FIELD_PSSYSDICTCATID}
     * 
     * @param pSSysDictCatId
     * 
     */
    @JsonProperty(FIELD_PSSYSDICTCATID)
    public void setPSSysDictCatId(String pSSysDictCatId){
        this.set(FIELD_PSSYSDICTCATID, pSSysDictCatId);
    }
    
    /**
     * 获取 输入词条类别  
     * @return
     */
    @JsonIgnore
    public String getPSSysDictCatId(){
        Object objValue = this.get(FIELD_PSSYSDICTCATID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输入词条类别 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDictCatIdDirty(){
        if(this.contains(FIELD_PSSYSDICTCATID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输入词条类别
     */
    @JsonIgnore
    public void resetPSSysDictCatId(){
        this.reset(FIELD_PSSYSDICTCATID);
    }

    /**
     * 设置 输入词条类别，详细说明：{@link #FIELD_PSSYSDICTCATID}
     * <P>
     * 等同 {@link #setPSSysDictCatId}
     * @param pSSysDictCatId
     */
    @JsonIgnore
    public PSDEFUIMode pssysdictcatid(String pSSysDictCatId){
        this.setPSSysDictCatId(pSSysDictCatId);
        return this;
    }

    /**
     * 设置 输入词条类别，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDictCatId}
     * @param pSSysDictCat 引用对象
     */
    @JsonIgnore
    public PSDEFUIMode pssysdictcatid(PSSysDictCat pSSysDictCat){
        if(pSSysDictCat == null){
            this.setPSSysDictCatId(null);
            this.setPSSysDictCatName(null);
        }
        else{
            this.setPSSysDictCatId(pSSysDictCat.getPSSysDictCatId());
            this.setPSSysDictCatName(pSSysDictCat.getPSSysDictCatName());
        }
        return this;
    }

    /**
     * <B>PSSYSDICTCATNAME</B>&nbsp;输入词条类别，指定应用属性界面模式的编辑项的辅助输入词条类别对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDICTCATID}
     */
    public final static String FIELD_PSSYSDICTCATNAME = "pssysdictcatname";

    /**
     * 设置 输入词条类别，详细说明：{@link #FIELD_PSSYSDICTCATNAME}
     * 
     * @param pSSysDictCatName
     * 
     */
    @JsonProperty(FIELD_PSSYSDICTCATNAME)
    public void setPSSysDictCatName(String pSSysDictCatName){
        this.set(FIELD_PSSYSDICTCATNAME, pSSysDictCatName);
    }
    
    /**
     * 获取 输入词条类别  
     * @return
     */
    @JsonIgnore
    public String getPSSysDictCatName(){
        Object objValue = this.get(FIELD_PSSYSDICTCATNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输入词条类别 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDictCatNameDirty(){
        if(this.contains(FIELD_PSSYSDICTCATNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输入词条类别
     */
    @JsonIgnore
    public void resetPSSysDictCatName(){
        this.reset(FIELD_PSSYSDICTCATNAME);
    }

    /**
     * 设置 输入词条类别，详细说明：{@link #FIELD_PSSYSDICTCATNAME}
     * <P>
     * 等同 {@link #setPSSysDictCatName}
     * @param pSSysDictCatName
     */
    @JsonIgnore
    public PSDEFUIMode pssysdictcatname(String pSSysDictCatName){
        this.setPSSysDictCatName(pSSysDictCatName);
        return this;
    }

    /**
     * <B>PSSYSEDITORSTYLEID</B>&nbsp;编辑器样式，指定应用属性界面模式的编辑项的编辑器扩展样式对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysEditorStyle} 
     */
    public final static String FIELD_PSSYSEDITORSTYLEID = "pssyseditorstyleid";

    /**
     * 设置 编辑器样式，详细说明：{@link #FIELD_PSSYSEDITORSTYLEID}
     * 
     * @param pSSysEditorStyleId
     * 
     */
    @JsonProperty(FIELD_PSSYSEDITORSTYLEID)
    public void setPSSysEditorStyleId(String pSSysEditorStyleId){
        this.set(FIELD_PSSYSEDITORSTYLEID, pSSysEditorStyleId);
    }
    
    /**
     * 获取 编辑器样式  
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
     * 判断 编辑器样式 是否指定值，包括空值
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
     * 重置 编辑器样式
     */
    @JsonIgnore
    public void resetPSSysEditorStyleId(){
        this.reset(FIELD_PSSYSEDITORSTYLEID);
    }

    /**
     * 设置 编辑器样式，详细说明：{@link #FIELD_PSSYSEDITORSTYLEID}
     * <P>
     * 等同 {@link #setPSSysEditorStyleId}
     * @param pSSysEditorStyleId
     */
    @JsonIgnore
    public PSDEFUIMode pssyseditorstyleid(String pSSysEditorStyleId){
        this.setPSSysEditorStyleId(pSSysEditorStyleId);
        return this;
    }

    /**
     * 设置 编辑器样式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysEditorStyleId}
     * @param pSSysEditorStyle 引用对象
     */
    @JsonIgnore
    public PSDEFUIMode pssyseditorstyleid(PSSysEditorStyle pSSysEditorStyle){
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
     * <B>PSSYSEDITORSTYLENAME</B>&nbsp;编辑器样式，指定应用属性界面模式的编辑项的编辑器扩展样式对象
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
    public PSDEFUIMode pssyseditorstylename(String pSSysEditorStyleName){
        this.setPSSysEditorStyleName(pSSysEditorStyleName);
        return this;
    }

    /**
     * <B>PSSYSIMAGEID</B>&nbsp;编辑项图片，指定应用属性界面模式的编辑项的图片对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysImage} 
     */
    public final static String FIELD_PSSYSIMAGEID = "pssysimageid";

    /**
     * 设置 编辑项图片，详细说明：{@link #FIELD_PSSYSIMAGEID}
     * 
     * @param pSSysImageId
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGEID)
    public void setPSSysImageId(String pSSysImageId){
        this.set(FIELD_PSSYSIMAGEID, pSSysImageId);
    }
    
    /**
     * 获取 编辑项图片  
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
     * 判断 编辑项图片 是否指定值，包括空值
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
     * 重置 编辑项图片
     */
    @JsonIgnore
    public void resetPSSysImageId(){
        this.reset(FIELD_PSSYSIMAGEID);
    }

    /**
     * 设置 编辑项图片，详细说明：{@link #FIELD_PSSYSIMAGEID}
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImageId
     */
    @JsonIgnore
    public PSDEFUIMode pssysimageid(String pSSysImageId){
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    /**
     * 设置 编辑项图片，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImage 引用对象
     */
    @JsonIgnore
    public PSDEFUIMode pssysimageid(PSSysImage pSSysImage){
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
     * <B>PSSYSIMAGENAME</B>&nbsp;编辑项图片，指定应用属性界面模式的编辑项的图片对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSIMAGEID}
     */
    public final static String FIELD_PSSYSIMAGENAME = "pssysimagename";

    /**
     * 设置 编辑项图片，详细说明：{@link #FIELD_PSSYSIMAGENAME}
     * 
     * @param pSSysImageName
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGENAME)
    public void setPSSysImageName(String pSSysImageName){
        this.set(FIELD_PSSYSIMAGENAME, pSSysImageName);
    }
    
    /**
     * 获取 编辑项图片  
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
     * 判断 编辑项图片 是否指定值，包括空值
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
     * 重置 编辑项图片
     */
    @JsonIgnore
    public void resetPSSysImageName(){
        this.reset(FIELD_PSSYSIMAGENAME);
    }

    /**
     * 设置 编辑项图片，详细说明：{@link #FIELD_PSSYSIMAGENAME}
     * <P>
     * 等同 {@link #setPSSysImageName}
     * @param pSSysImageName
     */
    @JsonIgnore
    public PSDEFUIMode pssysimagename(String pSSysImageName){
        this.setPSSysImageName(pSSysImageName);
        return this;
    }

    /**
     * <B>PSSYSUNITID</B>&nbsp;单位，指定属性界面模式指定的单位对象，未定义时使用所属属性定义的单位对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysUnit} 
     */
    public final static String FIELD_PSSYSUNITID = "pssysunitid";

    /**
     * 设置 单位，详细说明：{@link #FIELD_PSSYSUNITID}
     * 
     * @param pSSysUnitId
     * 
     */
    @JsonProperty(FIELD_PSSYSUNITID)
    public void setPSSysUnitId(String pSSysUnitId){
        this.set(FIELD_PSSYSUNITID, pSSysUnitId);
    }
    
    /**
     * 获取 单位  
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
     * 判断 单位 是否指定值，包括空值
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
     * 重置 单位
     */
    @JsonIgnore
    public void resetPSSysUnitId(){
        this.reset(FIELD_PSSYSUNITID);
    }

    /**
     * 设置 单位，详细说明：{@link #FIELD_PSSYSUNITID}
     * <P>
     * 等同 {@link #setPSSysUnitId}
     * @param pSSysUnitId
     */
    @JsonIgnore
    public PSDEFUIMode pssysunitid(String pSSysUnitId){
        this.setPSSysUnitId(pSSysUnitId);
        return this;
    }

    /**
     * 设置 单位，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysUnitId}
     * @param pSSysUnit 引用对象
     */
    @JsonIgnore
    public PSDEFUIMode pssysunitid(PSSysUnit pSSysUnit){
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
     * <B>PSSYSUNITNAME</B>&nbsp;单位，指定属性界面模式指定的单位对象，未定义时使用所属属性定义的单位对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSUNITID}
     */
    public final static String FIELD_PSSYSUNITNAME = "pssysunitname";

    /**
     * 设置 单位，详细说明：{@link #FIELD_PSSYSUNITNAME}
     * 
     * @param pSSysUnitName
     * 
     */
    @JsonProperty(FIELD_PSSYSUNITNAME)
    public void setPSSysUnitName(String pSSysUnitName){
        this.set(FIELD_PSSYSUNITNAME, pSSysUnitName);
    }
    
    /**
     * 获取 单位  
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
     * 判断 单位 是否指定值，包括空值
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
     * 重置 单位
     */
    @JsonIgnore
    public void resetPSSysUnitName(){
        this.reset(FIELD_PSSYSUNITNAME);
    }

    /**
     * 设置 单位，详细说明：{@link #FIELD_PSSYSUNITNAME}
     * <P>
     * 等同 {@link #setPSSysUnitName}
     * @param pSSysUnitName
     */
    @JsonIgnore
    public PSDEFUIMode pssysunitname(String pSSysUnitName){
        this.setPSSysUnitName(pSSysUnitName);
        return this;
    }

    /**
     * <B>REFADPSDELOGICID</B>&nbsp;引用数据集查询逻辑，指定应用属性界面模式的编辑项的引用数据集上下文转换逻辑对象，将调用环境参数转换为数据集的调用参数
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDELogic} 
     */
    public final static String FIELD_REFADPSDELOGICID = "refadpsdelogicid";

    /**
     * 设置 引用数据集查询逻辑，详细说明：{@link #FIELD_REFADPSDELOGICID}
     * 
     * @param refADPSDELogicId
     * 
     */
    @JsonProperty(FIELD_REFADPSDELOGICID)
    public void setRefADPSDELogicId(String refADPSDELogicId){
        this.set(FIELD_REFADPSDELOGICID, refADPSDELogicId);
    }
    
    /**
     * 获取 引用数据集查询逻辑  
     * @return
     */
    @JsonIgnore
    public String getRefADPSDELogicId(){
        Object objValue = this.get(FIELD_REFADPSDELOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用数据集查询逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefADPSDELogicIdDirty(){
        if(this.contains(FIELD_REFADPSDELOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用数据集查询逻辑
     */
    @JsonIgnore
    public void resetRefADPSDELogicId(){
        this.reset(FIELD_REFADPSDELOGICID);
    }

    /**
     * 设置 引用数据集查询逻辑，详细说明：{@link #FIELD_REFADPSDELOGICID}
     * <P>
     * 等同 {@link #setRefADPSDELogicId}
     * @param refADPSDELogicId
     */
    @JsonIgnore
    public PSDEFUIMode refadpsdelogicid(String refADPSDELogicId){
        this.setRefADPSDELogicId(refADPSDELogicId);
        return this;
    }

    /**
     * 设置 引用数据集查询逻辑，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefADPSDELogicId}
     * @param pSDELogic 引用对象
     */
    @JsonIgnore
    public PSDEFUIMode refadpsdelogicid(PSDELogic pSDELogic){
        if(pSDELogic == null){
            this.setRefADPSDELogicId(null);
            this.setRefADPSDELogicName(null);
        }
        else{
            this.setRefADPSDELogicId(pSDELogic.getPSDELogicId());
            this.setRefADPSDELogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    /**
     * <B>REFADPSDELOGICNAME</B>&nbsp;引用数据集查询逻辑，指定应用属性界面模式的编辑项的引用数据集上下文转换逻辑对象，将调用环境参数转换为数据集的调用参数
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFADPSDELOGICID}
     */
    public final static String FIELD_REFADPSDELOGICNAME = "refadpsdelogicname";

    /**
     * 设置 引用数据集查询逻辑，详细说明：{@link #FIELD_REFADPSDELOGICNAME}
     * 
     * @param refADPSDELogicName
     * 
     */
    @JsonProperty(FIELD_REFADPSDELOGICNAME)
    public void setRefADPSDELogicName(String refADPSDELogicName){
        this.set(FIELD_REFADPSDELOGICNAME, refADPSDELogicName);
    }
    
    /**
     * 获取 引用数据集查询逻辑  
     * @return
     */
    @JsonIgnore
    public String getRefADPSDELogicName(){
        Object objValue = this.get(FIELD_REFADPSDELOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用数据集查询逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefADPSDELogicNameDirty(){
        if(this.contains(FIELD_REFADPSDELOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用数据集查询逻辑
     */
    @JsonIgnore
    public void resetRefADPSDELogicName(){
        this.reset(FIELD_REFADPSDELOGICNAME);
    }

    /**
     * 设置 引用数据集查询逻辑，详细说明：{@link #FIELD_REFADPSDELOGICNAME}
     * <P>
     * 等同 {@link #setRefADPSDELogicName}
     * @param refADPSDELogicName
     */
    @JsonIgnore
    public PSDEFUIMode refadpsdelogicname(String refADPSDELogicName){
        this.setRefADPSDELogicName(refADPSDELogicName);
        return this;
    }

    /**
     * <B>REFLINKPSDEVIEWID</B>&nbsp;关联实体链接视图，指定应用属性界面模式的编辑项的引用数据链接视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_REFLINKPSDEVIEWID = "reflinkpsdeviewid";

    /**
     * 设置 关联实体链接视图，详细说明：{@link #FIELD_REFLINKPSDEVIEWID}
     * 
     * @param refLinkPSDEViewId
     * 
     */
    @JsonProperty(FIELD_REFLINKPSDEVIEWID)
    public void setRefLinkPSDEViewId(String refLinkPSDEViewId){
        this.set(FIELD_REFLINKPSDEVIEWID, refLinkPSDEViewId);
    }
    
    /**
     * 获取 关联实体链接视图  
     * @return
     */
    @JsonIgnore
    public String getRefLinkPSDEViewId(){
        Object objValue = this.get(FIELD_REFLINKPSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关联实体链接视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefLinkPSDEViewIdDirty(){
        if(this.contains(FIELD_REFLINKPSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关联实体链接视图
     */
    @JsonIgnore
    public void resetRefLinkPSDEViewId(){
        this.reset(FIELD_REFLINKPSDEVIEWID);
    }

    /**
     * 设置 关联实体链接视图，详细说明：{@link #FIELD_REFLINKPSDEVIEWID}
     * <P>
     * 等同 {@link #setRefLinkPSDEViewId}
     * @param refLinkPSDEViewId
     */
    @JsonIgnore
    public PSDEFUIMode reflinkpsdeviewid(String refLinkPSDEViewId){
        this.setRefLinkPSDEViewId(refLinkPSDEViewId);
        return this;
    }

    /**
     * 设置 关联实体链接视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefLinkPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSDEFUIMode reflinkpsdeviewid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setRefLinkPSDEViewId(null);
            this.setRefLinkPSDEViewName(null);
        }
        else{
            this.setRefLinkPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setRefLinkPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>REFLINKPSDEVIEWNAME</B>&nbsp;关联实体链接视图，指定应用属性界面模式的编辑项的引用数据链接视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFLINKPSDEVIEWID}
     */
    public final static String FIELD_REFLINKPSDEVIEWNAME = "reflinkpsdeviewname";

    /**
     * 设置 关联实体链接视图，详细说明：{@link #FIELD_REFLINKPSDEVIEWNAME}
     * 
     * @param refLinkPSDEViewName
     * 
     */
    @JsonProperty(FIELD_REFLINKPSDEVIEWNAME)
    public void setRefLinkPSDEViewName(String refLinkPSDEViewName){
        this.set(FIELD_REFLINKPSDEVIEWNAME, refLinkPSDEViewName);
    }
    
    /**
     * 获取 关联实体链接视图  
     * @return
     */
    @JsonIgnore
    public String getRefLinkPSDEViewName(){
        Object objValue = this.get(FIELD_REFLINKPSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关联实体链接视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefLinkPSDEViewNameDirty(){
        if(this.contains(FIELD_REFLINKPSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关联实体链接视图
     */
    @JsonIgnore
    public void resetRefLinkPSDEViewName(){
        this.reset(FIELD_REFLINKPSDEVIEWNAME);
    }

    /**
     * 设置 关联实体链接视图，详细说明：{@link #FIELD_REFLINKPSDEVIEWNAME}
     * <P>
     * 等同 {@link #setRefLinkPSDEViewName}
     * @param refLinkPSDEViewName
     */
    @JsonIgnore
    public PSDEFUIMode reflinkpsdeviewname(String refLinkPSDEViewName){
        this.setRefLinkPSDEViewName(refLinkPSDEViewName);
        return this;
    }

    /**
     * <B>REFMPICKUPPSDEVIEWID</B>&nbsp;关联实体多选视图，指定应用属性界面模式的编辑项的引用数据的多项选择视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_REFMPICKUPPSDEVIEWID = "refmpickuppsdeviewid";

    /**
     * 设置 关联实体多选视图，详细说明：{@link #FIELD_REFMPICKUPPSDEVIEWID}
     * 
     * @param refMPickupPSDEViewId
     * 
     */
    @JsonProperty(FIELD_REFMPICKUPPSDEVIEWID)
    public void setRefMPickupPSDEViewId(String refMPickupPSDEViewId){
        this.set(FIELD_REFMPICKUPPSDEVIEWID, refMPickupPSDEViewId);
    }
    
    /**
     * 获取 关联实体多选视图  
     * @return
     */
    @JsonIgnore
    public String getRefMPickupPSDEViewId(){
        Object objValue = this.get(FIELD_REFMPICKUPPSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关联实体多选视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefMPickupPSDEViewIdDirty(){
        if(this.contains(FIELD_REFMPICKUPPSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关联实体多选视图
     */
    @JsonIgnore
    public void resetRefMPickupPSDEViewId(){
        this.reset(FIELD_REFMPICKUPPSDEVIEWID);
    }

    /**
     * 设置 关联实体多选视图，详细说明：{@link #FIELD_REFMPICKUPPSDEVIEWID}
     * <P>
     * 等同 {@link #setRefMPickupPSDEViewId}
     * @param refMPickupPSDEViewId
     */
    @JsonIgnore
    public PSDEFUIMode refmpickuppsdeviewid(String refMPickupPSDEViewId){
        this.setRefMPickupPSDEViewId(refMPickupPSDEViewId);
        return this;
    }

    /**
     * 设置 关联实体多选视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefMPickupPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSDEFUIMode refmpickuppsdeviewid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setRefMPickupPSDEViewId(null);
            this.setRefMPickupPSDEViewName(null);
        }
        else{
            this.setRefMPickupPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setRefMPickupPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>REFMPICKUPPSDEVIEWNAME</B>&nbsp;关联实体多选视图，指定应用属性界面模式的编辑项的引用数据的多项选择视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFMPICKUPPSDEVIEWID}
     */
    public final static String FIELD_REFMPICKUPPSDEVIEWNAME = "refmpickuppsdeviewname";

    /**
     * 设置 关联实体多选视图，详细说明：{@link #FIELD_REFMPICKUPPSDEVIEWNAME}
     * 
     * @param refMPickupPSDEViewName
     * 
     */
    @JsonProperty(FIELD_REFMPICKUPPSDEVIEWNAME)
    public void setRefMPickupPSDEViewName(String refMPickupPSDEViewName){
        this.set(FIELD_REFMPICKUPPSDEVIEWNAME, refMPickupPSDEViewName);
    }
    
    /**
     * 获取 关联实体多选视图  
     * @return
     */
    @JsonIgnore
    public String getRefMPickupPSDEViewName(){
        Object objValue = this.get(FIELD_REFMPICKUPPSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关联实体多选视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefMPickupPSDEViewNameDirty(){
        if(this.contains(FIELD_REFMPICKUPPSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关联实体多选视图
     */
    @JsonIgnore
    public void resetRefMPickupPSDEViewName(){
        this.reset(FIELD_REFMPICKUPPSDEVIEWNAME);
    }

    /**
     * 设置 关联实体多选视图，详细说明：{@link #FIELD_REFMPICKUPPSDEVIEWNAME}
     * <P>
     * 等同 {@link #setRefMPickupPSDEViewName}
     * @param refMPickupPSDEViewName
     */
    @JsonIgnore
    public PSDEFUIMode refmpickuppsdeviewname(String refMPickupPSDEViewName){
        this.setRefMPickupPSDEViewName(refMPickupPSDEViewName);
        return this;
    }

    /**
     * <B>REFPICKUPPSDEVIEWID</B>&nbsp;关联实体单选视图，指定应用属性界面模式的编辑项的引用数据的单项数据选择视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_REFPICKUPPSDEVIEWID = "refpickuppsdeviewid";

    /**
     * 设置 关联实体单选视图，详细说明：{@link #FIELD_REFPICKUPPSDEVIEWID}
     * 
     * @param refPickupPSDEViewId
     * 
     */
    @JsonProperty(FIELD_REFPICKUPPSDEVIEWID)
    public void setRefPickupPSDEViewId(String refPickupPSDEViewId){
        this.set(FIELD_REFPICKUPPSDEVIEWID, refPickupPSDEViewId);
    }
    
    /**
     * 获取 关联实体单选视图  
     * @return
     */
    @JsonIgnore
    public String getRefPickupPSDEViewId(){
        Object objValue = this.get(FIELD_REFPICKUPPSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关联实体单选视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPickupPSDEViewIdDirty(){
        if(this.contains(FIELD_REFPICKUPPSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关联实体单选视图
     */
    @JsonIgnore
    public void resetRefPickupPSDEViewId(){
        this.reset(FIELD_REFPICKUPPSDEVIEWID);
    }

    /**
     * 设置 关联实体单选视图，详细说明：{@link #FIELD_REFPICKUPPSDEVIEWID}
     * <P>
     * 等同 {@link #setRefPickupPSDEViewId}
     * @param refPickupPSDEViewId
     */
    @JsonIgnore
    public PSDEFUIMode refpickuppsdeviewid(String refPickupPSDEViewId){
        this.setRefPickupPSDEViewId(refPickupPSDEViewId);
        return this;
    }

    /**
     * 设置 关联实体单选视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefPickupPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSDEFUIMode refpickuppsdeviewid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setRefPickupPSDEViewId(null);
            this.setRefPickupPSDEViewName(null);
        }
        else{
            this.setRefPickupPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setRefPickupPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>REFPICKUPPSDEVIEWNAME</B>&nbsp;关联实体单选视图，指定应用属性界面模式的编辑项的引用数据的单项数据选择视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPICKUPPSDEVIEWID}
     */
    public final static String FIELD_REFPICKUPPSDEVIEWNAME = "refpickuppsdeviewname";

    /**
     * 设置 关联实体单选视图，详细说明：{@link #FIELD_REFPICKUPPSDEVIEWNAME}
     * 
     * @param refPickupPSDEViewName
     * 
     */
    @JsonProperty(FIELD_REFPICKUPPSDEVIEWNAME)
    public void setRefPickupPSDEViewName(String refPickupPSDEViewName){
        this.set(FIELD_REFPICKUPPSDEVIEWNAME, refPickupPSDEViewName);
    }
    
    /**
     * 获取 关联实体单选视图  
     * @return
     */
    @JsonIgnore
    public String getRefPickupPSDEViewName(){
        Object objValue = this.get(FIELD_REFPICKUPPSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关联实体单选视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPickupPSDEViewNameDirty(){
        if(this.contains(FIELD_REFPICKUPPSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关联实体单选视图
     */
    @JsonIgnore
    public void resetRefPickupPSDEViewName(){
        this.reset(FIELD_REFPICKUPPSDEVIEWNAME);
    }

    /**
     * 设置 关联实体单选视图，详细说明：{@link #FIELD_REFPICKUPPSDEVIEWNAME}
     * <P>
     * 等同 {@link #setRefPickupPSDEViewName}
     * @param refPickupPSDEViewName
     */
    @JsonIgnore
    public PSDEFUIMode refpickuppsdeviewname(String refPickupPSDEViewName){
        this.setRefPickupPSDEViewName(refPickupPSDEViewName);
        return this;
    }

    /**
     * <B>REFPSDEACMODEID</B>&nbsp;关联实体自填模式，指定应用属性界面模式的编辑项的引用自填模式，提供自动填充能力的编辑器都需要指定引用的自填模式
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEACMode} 
     */
    public final static String FIELD_REFPSDEACMODEID = "refpsdeacmodeid";

    /**
     * 设置 关联实体自填模式，详细说明：{@link #FIELD_REFPSDEACMODEID}
     * 
     * @param refPSDEACModeId
     * 
     */
    @JsonProperty(FIELD_REFPSDEACMODEID)
    public void setRefPSDEACModeId(String refPSDEACModeId){
        this.set(FIELD_REFPSDEACMODEID, refPSDEACModeId);
    }
    
    /**
     * 获取 关联实体自填模式  
     * @return
     */
    @JsonIgnore
    public String getRefPSDEACModeId(){
        Object objValue = this.get(FIELD_REFPSDEACMODEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关联实体自填模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDEACModeIdDirty(){
        if(this.contains(FIELD_REFPSDEACMODEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关联实体自填模式
     */
    @JsonIgnore
    public void resetRefPSDEACModeId(){
        this.reset(FIELD_REFPSDEACMODEID);
    }

    /**
     * 设置 关联实体自填模式，详细说明：{@link #FIELD_REFPSDEACMODEID}
     * <P>
     * 等同 {@link #setRefPSDEACModeId}
     * @param refPSDEACModeId
     */
    @JsonIgnore
    public PSDEFUIMode refpsdeacmodeid(String refPSDEACModeId){
        this.setRefPSDEACModeId(refPSDEACModeId);
        return this;
    }

    /**
     * 设置 关联实体自填模式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefPSDEACModeId}
     * @param pSDEACMode 引用对象
     */
    @JsonIgnore
    public PSDEFUIMode refpsdeacmodeid(PSDEACMode pSDEACMode){
        if(pSDEACMode == null){
            this.setRefPSDEACModeId(null);
            this.setRefPSDEACModeName(null);
        }
        else{
            this.setRefPSDEACModeId(pSDEACMode.getPSDEACModeId());
            this.setRefPSDEACModeName(pSDEACMode.getPSDEACModeName());
        }
        return this;
    }

    /**
     * <B>REFPSDEACMODENAME</B>&nbsp;关联实体自填模式，指定应用属性界面模式的编辑项的引用自填模式，提供自动填充能力的编辑器都需要指定引用的自填模式
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPSDEACMODEID}
     */
    public final static String FIELD_REFPSDEACMODENAME = "refpsdeacmodename";

    /**
     * 设置 关联实体自填模式，详细说明：{@link #FIELD_REFPSDEACMODENAME}
     * 
     * @param refPSDEACModeName
     * 
     */
    @JsonProperty(FIELD_REFPSDEACMODENAME)
    public void setRefPSDEACModeName(String refPSDEACModeName){
        this.set(FIELD_REFPSDEACMODENAME, refPSDEACModeName);
    }
    
    /**
     * 获取 关联实体自填模式  
     * @return
     */
    @JsonIgnore
    public String getRefPSDEACModeName(){
        Object objValue = this.get(FIELD_REFPSDEACMODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关联实体自填模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDEACModeNameDirty(){
        if(this.contains(FIELD_REFPSDEACMODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关联实体自填模式
     */
    @JsonIgnore
    public void resetRefPSDEACModeName(){
        this.reset(FIELD_REFPSDEACMODENAME);
    }

    /**
     * 设置 关联实体自填模式，详细说明：{@link #FIELD_REFPSDEACMODENAME}
     * <P>
     * 等同 {@link #setRefPSDEACModeName}
     * @param refPSDEACModeName
     */
    @JsonIgnore
    public PSDEFUIMode refpsdeacmodename(String refPSDEACModeName){
        this.setRefPSDEACModeName(refPSDEACModeName);
        return this;
    }

    /**
     * <B>REFPSDEDATASETID</B>&nbsp;关联实体数据集合，指定应用属性界面模式的编辑项的引用数据集，提供自动填充能力的编辑器都需要指定引用的数据集
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataSet} 
     */
    public final static String FIELD_REFPSDEDATASETID = "refpsdedatasetid";

    /**
     * 设置 关联实体数据集合，详细说明：{@link #FIELD_REFPSDEDATASETID}
     * 
     * @param refPSDEDataSetId
     * 
     */
    @JsonProperty(FIELD_REFPSDEDATASETID)
    public void setRefPSDEDataSetId(String refPSDEDataSetId){
        this.set(FIELD_REFPSDEDATASETID, refPSDEDataSetId);
    }
    
    /**
     * 获取 关联实体数据集合  
     * @return
     */
    @JsonIgnore
    public String getRefPSDEDataSetId(){
        Object objValue = this.get(FIELD_REFPSDEDATASETID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关联实体数据集合 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDEDataSetIdDirty(){
        if(this.contains(FIELD_REFPSDEDATASETID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关联实体数据集合
     */
    @JsonIgnore
    public void resetRefPSDEDataSetId(){
        this.reset(FIELD_REFPSDEDATASETID);
    }

    /**
     * 设置 关联实体数据集合，详细说明：{@link #FIELD_REFPSDEDATASETID}
     * <P>
     * 等同 {@link #setRefPSDEDataSetId}
     * @param refPSDEDataSetId
     */
    @JsonIgnore
    public PSDEFUIMode refpsdedatasetid(String refPSDEDataSetId){
        this.setRefPSDEDataSetId(refPSDEDataSetId);
        return this;
    }

    /**
     * 设置 关联实体数据集合，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefPSDEDataSetId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSDEFUIMode refpsdedatasetid(PSDEDataSet pSDEDataSet){
        if(pSDEDataSet == null){
            this.setRefPSDEDataSetId(null);
            this.setRefPSDEDataSetName(null);
        }
        else{
            this.setRefPSDEDataSetId(pSDEDataSet.getPSDEDataSetId());
            this.setRefPSDEDataSetName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    /**
     * <B>REFPSDEDATASETNAME</B>&nbsp;关联实体数据集合，指定应用属性界面模式的编辑项的引用数据集，提供自动填充能力的编辑器都需要指定引用的数据集
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPSDEDATASETID}
     */
    public final static String FIELD_REFPSDEDATASETNAME = "refpsdedatasetname";

    /**
     * 设置 关联实体数据集合，详细说明：{@link #FIELD_REFPSDEDATASETNAME}
     * 
     * @param refPSDEDataSetName
     * 
     */
    @JsonProperty(FIELD_REFPSDEDATASETNAME)
    public void setRefPSDEDataSetName(String refPSDEDataSetName){
        this.set(FIELD_REFPSDEDATASETNAME, refPSDEDataSetName);
    }
    
    /**
     * 获取 关联实体数据集合  
     * @return
     */
    @JsonIgnore
    public String getRefPSDEDataSetName(){
        Object objValue = this.get(FIELD_REFPSDEDATASETNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关联实体数据集合 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDEDataSetNameDirty(){
        if(this.contains(FIELD_REFPSDEDATASETNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关联实体数据集合
     */
    @JsonIgnore
    public void resetRefPSDEDataSetName(){
        this.reset(FIELD_REFPSDEDATASETNAME);
    }

    /**
     * 设置 关联实体数据集合，详细说明：{@link #FIELD_REFPSDEDATASETNAME}
     * <P>
     * 等同 {@link #setRefPSDEDataSetName}
     * @param refPSDEDataSetName
     */
    @JsonIgnore
    public PSDEFUIMode refpsdedatasetname(String refPSDEDataSetName){
        this.setRefPSDEDataSetName(refPSDEDataSetName);
        return this;
    }

    /**
     * <B>REFPSDEID</B>&nbsp;关联实体，指定应用属性界面模式的编辑项的引用数据集的所在实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_REFPSDEID = "refpsdeid";

    /**
     * 设置 关联实体，详细说明：{@link #FIELD_REFPSDEID}
     * 
     * @param refPSDEId
     * 
     */
    @JsonProperty(FIELD_REFPSDEID)
    public void setRefPSDEId(String refPSDEId){
        this.set(FIELD_REFPSDEID, refPSDEId);
    }
    
    /**
     * 获取 关联实体  
     * @return
     */
    @JsonIgnore
    public String getRefPSDEId(){
        Object objValue = this.get(FIELD_REFPSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关联实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDEIdDirty(){
        if(this.contains(FIELD_REFPSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关联实体
     */
    @JsonIgnore
    public void resetRefPSDEId(){
        this.reset(FIELD_REFPSDEID);
    }

    /**
     * 设置 关联实体，详细说明：{@link #FIELD_REFPSDEID}
     * <P>
     * 等同 {@link #setRefPSDEId}
     * @param refPSDEId
     */
    @JsonIgnore
    public PSDEFUIMode refpsdeid(String refPSDEId){
        this.setRefPSDEId(refPSDEId);
        return this;
    }

    /**
     * 设置 关联实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDEFUIMode refpsdeid(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setRefPSDEId(null);
            this.setRefPSDEName(null);
        }
        else{
            this.setRefPSDEId(pSDataEntity.getPSDataEntityId());
            this.setRefPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>REFPSDENAME</B>&nbsp;关联实体，指定应用属性界面模式的编辑项的引用数据集的所在实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPSDEID}
     */
    public final static String FIELD_REFPSDENAME = "refpsdename";

    /**
     * 设置 关联实体，详细说明：{@link #FIELD_REFPSDENAME}
     * 
     * @param refPSDEName
     * 
     */
    @JsonProperty(FIELD_REFPSDENAME)
    public void setRefPSDEName(String refPSDEName){
        this.set(FIELD_REFPSDENAME, refPSDEName);
    }
    
    /**
     * 获取 关联实体  
     * @return
     */
    @JsonIgnore
    public String getRefPSDEName(){
        Object objValue = this.get(FIELD_REFPSDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关联实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDENameDirty(){
        if(this.contains(FIELD_REFPSDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关联实体
     */
    @JsonIgnore
    public void resetRefPSDEName(){
        this.reset(FIELD_REFPSDENAME);
    }

    /**
     * 设置 关联实体，详细说明：{@link #FIELD_REFPSDENAME}
     * <P>
     * 等同 {@link #setRefPSDEName}
     * @param refPSDEName
     */
    @JsonIgnore
    public PSDEFUIMode refpsdename(String refPSDEName){
        this.setRefPSDEName(refPSDEName);
        return this;
    }

    /**
     * <B>REFPSDERID</B>&nbsp;引用实体关系，指定应用属性界面模式的编辑项的引用数据集的使用关系
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDER} 
     */
    public final static String FIELD_REFPSDERID = "refpsderid";

    /**
     * 设置 引用实体关系，详细说明：{@link #FIELD_REFPSDERID}
     * 
     * @param refPSDERId
     * 
     */
    @JsonProperty(FIELD_REFPSDERID)
    public void setRefPSDERId(String refPSDERId){
        this.set(FIELD_REFPSDERID, refPSDERId);
    }
    
    /**
     * 获取 引用实体关系  
     * @return
     */
    @JsonIgnore
    public String getRefPSDERId(){
        Object objValue = this.get(FIELD_REFPSDERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用实体关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDERIdDirty(){
        if(this.contains(FIELD_REFPSDERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用实体关系
     */
    @JsonIgnore
    public void resetRefPSDERId(){
        this.reset(FIELD_REFPSDERID);
    }

    /**
     * 设置 引用实体关系，详细说明：{@link #FIELD_REFPSDERID}
     * <P>
     * 等同 {@link #setRefPSDERId}
     * @param refPSDERId
     */
    @JsonIgnore
    public PSDEFUIMode refpsderid(String refPSDERId){
        this.setRefPSDERId(refPSDERId);
        return this;
    }

    /**
     * 设置 引用实体关系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefPSDERId}
     * @param pSDER 引用对象
     */
    @JsonIgnore
    public PSDEFUIMode refpsderid(PSDER pSDER){
        if(pSDER == null){
            this.setRefPSDERId(null);
            this.setRefPSDERName(null);
        }
        else{
            this.setRefPSDERId(pSDER.getPSDERId());
            this.setRefPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    /**
     * <B>REFPSDERNAME</B>&nbsp;引用实体关系，指定应用属性界面模式的编辑项的引用数据集的使用关系
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPSDERID}
     */
    public final static String FIELD_REFPSDERNAME = "refpsdername";

    /**
     * 设置 引用实体关系，详细说明：{@link #FIELD_REFPSDERNAME}
     * 
     * @param refPSDERName
     * 
     */
    @JsonProperty(FIELD_REFPSDERNAME)
    public void setRefPSDERName(String refPSDERName){
        this.set(FIELD_REFPSDERNAME, refPSDERName);
    }
    
    /**
     * 获取 引用实体关系  
     * @return
     */
    @JsonIgnore
    public String getRefPSDERName(){
        Object objValue = this.get(FIELD_REFPSDERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用实体关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDERNameDirty(){
        if(this.contains(FIELD_REFPSDERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用实体关系
     */
    @JsonIgnore
    public void resetRefPSDERName(){
        this.reset(FIELD_REFPSDERNAME);
    }

    /**
     * 设置 引用实体关系，详细说明：{@link #FIELD_REFPSDERNAME}
     * <P>
     * 等同 {@link #setRefPSDERName}
     * @param refPSDERName
     */
    @JsonIgnore
    public PSDEFUIMode refpsdername(String refPSDERName){
        this.setRefPSDERName(refPSDERName);
        return this;
    }

    /**
     * <B>REFTEMPDATA</B>&nbsp;引用临时数据，指定引用数据集是否为临时数据模式，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_REFTEMPDATA = "reftempdata";

    /**
     * 设置 引用临时数据，详细说明：{@link #FIELD_REFTEMPDATA}
     * 
     * @param refTempData
     * 
     */
    @JsonProperty(FIELD_REFTEMPDATA)
    public void setRefTempData(Integer refTempData){
        this.set(FIELD_REFTEMPDATA, refTempData);
    }
    
    /**
     * 获取 引用临时数据  
     * @return
     */
    @JsonIgnore
    public Integer getRefTempData(){
        Object objValue = this.get(FIELD_REFTEMPDATA);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 引用临时数据 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefTempDataDirty(){
        if(this.contains(FIELD_REFTEMPDATA)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用临时数据
     */
    @JsonIgnore
    public void resetRefTempData(){
        this.reset(FIELD_REFTEMPDATA);
    }

    /**
     * 设置 引用临时数据，详细说明：{@link #FIELD_REFTEMPDATA}
     * <P>
     * 等同 {@link #setRefTempData}
     * @param refTempData
     */
    @JsonIgnore
    public PSDEFUIMode reftempdata(Integer refTempData){
        this.setRefTempData(refTempData);
        return this;
    }

     /**
     * 设置 引用临时数据，详细说明：{@link #FIELD_REFTEMPDATA}
     * <P>
     * 等同 {@link #setRefTempData}
     * @param refTempData
     */
    @JsonIgnore
    public PSDEFUIMode reftempdata(Boolean refTempData){
        if(refTempData == null){
            this.setRefTempData(null);
        }
        else{
            this.setRefTempData(refTempData?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>RESETITEMNAME</B>&nbsp;重置项名称，指定属性界面模式的重置项名称，需配置启用重置项名称
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_RESETITEMNAME = "resetitemname";

    /**
     * 设置 重置项名称，详细说明：{@link #FIELD_RESETITEMNAME}
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
     * 设置 重置项名称，详细说明：{@link #FIELD_RESETITEMNAME}
     * <P>
     * 等同 {@link #setResetItemName}
     * @param resetItemName
     */
    @JsonIgnore
    public PSDEFUIMode resetitemname(String resetItemName){
        this.setResetItemName(resetItemName);
        return this;
    }

    /**
     * <B>STRINGCASE</B>&nbsp;字符转换
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.StringCaseMode} 
     */
    public final static String FIELD_STRINGCASE = "stringcase";

    /**
     * 设置 字符转换
     * 
     * @param stringCase
     * 
     */
    @JsonProperty(FIELD_STRINGCASE)
    public void setStringCase(String stringCase){
        this.set(FIELD_STRINGCASE, stringCase);
    }
    
    /**
     * 获取 字符转换  
     * @return
     */
    @JsonIgnore
    public String getStringCase(){
        Object objValue = this.get(FIELD_STRINGCASE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 字符转换 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStringCaseDirty(){
        if(this.contains(FIELD_STRINGCASE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 字符转换
     */
    @JsonIgnore
    public void resetStringCase(){
        this.reset(FIELD_STRINGCASE);
    }

    /**
     * 设置 字符转换
     * <P>
     * 等同 {@link #setStringCase}
     * @param stringCase
     */
    @JsonIgnore
    public PSDEFUIMode stringcase(String stringCase){
        this.setStringCase(stringCase);
        return this;
    }

     /**
     * 设置 字符转换
     * <P>
     * 等同 {@link #setStringCase}
     * @param stringCase
     */
    @JsonIgnore
    public PSDEFUIMode stringcase(net.ibizsys.psmodel.core.util.PSModelEnums.StringCaseMode stringCase){
        if(stringCase == null){
            this.setStringCase(null);
        }
        else{
            this.setStringCase(stringCase.value);
        }
        return this;
    }

    /**
     * <B>STRLENGTH</B>&nbsp;字符长度
     */
    public final static String FIELD_STRLENGTH = "strlength";

    /**
     * 设置 字符长度
     * 
     * @param strLength
     * 
     */
    @JsonProperty(FIELD_STRLENGTH)
    public void setStrLength(Integer strLength){
        this.set(FIELD_STRLENGTH, strLength);
    }
    
    /**
     * 获取 字符长度  
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
     * 判断 字符长度 是否指定值，包括空值
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
     * 重置 字符长度
     */
    @JsonIgnore
    public void resetStrLength(){
        this.reset(FIELD_STRLENGTH);
    }

    /**
     * 设置 字符长度
     * <P>
     * 等同 {@link #setStrLength}
     * @param strLength
     */
    @JsonIgnore
    public PSDEFUIMode strlength(Integer strLength){
        this.setStrLength(strLength);
        return this;
    }

    /**
     * <B>UNITNAME</B>&nbsp;单位，指定属性界面模式的单位名称，早期模式
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_UNITNAME = "unitname";

    /**
     * 设置 单位，详细说明：{@link #FIELD_UNITNAME}
     * 
     * @param unitName
     * 
     */
    @JsonProperty(FIELD_UNITNAME)
    public void setUnitName(String unitName){
        this.set(FIELD_UNITNAME, unitName);
    }
    
    /**
     * 获取 单位  
     * @return
     */
    @JsonIgnore
    public String getUnitName(){
        Object objValue = this.get(FIELD_UNITNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 单位 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUnitNameDirty(){
        if(this.contains(FIELD_UNITNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 单位
     */
    @JsonIgnore
    public void resetUnitName(){
        this.reset(FIELD_UNITNAME);
    }

    /**
     * 设置 单位，详细说明：{@link #FIELD_UNITNAME}
     * <P>
     * 等同 {@link #setUnitName}
     * @param unitName
     */
    @JsonIgnore
    public PSDEFUIMode unitname(String unitName){
        this.setUnitName(unitName);
        return this;
    }

    /**
     * <B>UNITNAMEWIDTH</B>&nbsp;单位宽度，指定属性界面模式的单位名称宽度，早期模式
     */
    public final static String FIELD_UNITNAMEWIDTH = "unitnamewidth";

    /**
     * 设置 单位宽度，详细说明：{@link #FIELD_UNITNAMEWIDTH}
     * 
     * @param unitNameWidth
     * 
     */
    @JsonProperty(FIELD_UNITNAMEWIDTH)
    public void setUnitNameWidth(Integer unitNameWidth){
        this.set(FIELD_UNITNAMEWIDTH, unitNameWidth);
    }
    
    /**
     * 获取 单位宽度  
     * @return
     */
    @JsonIgnore
    public Integer getUnitNameWidth(){
        Object objValue = this.get(FIELD_UNITNAMEWIDTH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 单位宽度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUnitNameWidthDirty(){
        if(this.contains(FIELD_UNITNAMEWIDTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 单位宽度
     */
    @JsonIgnore
    public void resetUnitNameWidth(){
        this.reset(FIELD_UNITNAMEWIDTH);
    }

    /**
     * 设置 单位宽度，详细说明：{@link #FIELD_UNITNAMEWIDTH}
     * <P>
     * 等同 {@link #setUnitNameWidth}
     * @param unitNameWidth
     */
    @JsonIgnore
    public PSDEFUIMode unitnamewidth(Integer unitNameWidth){
        this.setUnitNameWidth(unitNameWidth);
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
    public PSDEFUIMode updatedate(String updateDate){
        this.setUpdateDate(updateDate);
        return this;
    }

    /**
     * <B>UPDATEDV</B>&nbsp;更新默认值，指定属性界面模式的更新默认值，未指定默认值类型时按直接值处理
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_UPDATEDV = "updatedv";

    /**
     * 设置 更新默认值，详细说明：{@link #FIELD_UPDATEDV}
     * 
     * @param updateDV
     * 
     */
    @JsonProperty(FIELD_UPDATEDV)
    public void setUpdateDV(String updateDV){
        this.set(FIELD_UPDATEDV, updateDV);
    }
    
    /**
     * 获取 更新默认值  
     * @return
     */
    @JsonIgnore
    public String getUpdateDV(){
        Object objValue = this.get(FIELD_UPDATEDV);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 更新默认值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUpdateDVDirty(){
        if(this.contains(FIELD_UPDATEDV)){
            return true;
        }
        return false;
    }

    /**
     * 重置 更新默认值
     */
    @JsonIgnore
    public void resetUpdateDV(){
        this.reset(FIELD_UPDATEDV);
    }

    /**
     * 设置 更新默认值，详细说明：{@link #FIELD_UPDATEDV}
     * <P>
     * 等同 {@link #setUpdateDV}
     * @param updateDV
     */
    @JsonIgnore
    public PSDEFUIMode updatedv(String updateDV){
        this.setUpdateDV(updateDV);
        return this;
    }

    /**
     * <B>UPDATEDVT</B>&nbsp;更新默认值类型，指定属性界面模式的更新默认值类型，未定义时为【直接值】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.UpdateDefaultValueType} 
     */
    public final static String FIELD_UPDATEDVT = "updatedvt";

    /**
     * 设置 更新默认值类型，详细说明：{@link #FIELD_UPDATEDVT}
     * 
     * @param updateDVT
     * 
     */
    @JsonProperty(FIELD_UPDATEDVT)
    public void setUpdateDVT(String updateDVT){
        this.set(FIELD_UPDATEDVT, updateDVT);
    }
    
    /**
     * 获取 更新默认值类型  
     * @return
     */
    @JsonIgnore
    public String getUpdateDVT(){
        Object objValue = this.get(FIELD_UPDATEDVT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 更新默认值类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUpdateDVTDirty(){
        if(this.contains(FIELD_UPDATEDVT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 更新默认值类型
     */
    @JsonIgnore
    public void resetUpdateDVT(){
        this.reset(FIELD_UPDATEDVT);
    }

    /**
     * 设置 更新默认值类型，详细说明：{@link #FIELD_UPDATEDVT}
     * <P>
     * 等同 {@link #setUpdateDVT}
     * @param updateDVT
     */
    @JsonIgnore
    public PSDEFUIMode updatedvt(String updateDVT){
        this.setUpdateDVT(updateDVT);
        return this;
    }

     /**
     * 设置 更新默认值类型，详细说明：{@link #FIELD_UPDATEDVT}
     * <P>
     * 等同 {@link #setUpdateDVT}
     * @param updateDVT
     */
    @JsonIgnore
    public PSDEFUIMode updatedvt(net.ibizsys.psmodel.core.util.PSModelEnums.UpdateDefaultValueType updateDVT){
        if(updateDVT == null){
            this.setUpdateDVT(null);
        }
        else{
            this.setUpdateDVT(updateDVT.value);
        }
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
    public PSDEFUIMode updateman(String updateMan){
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
    public PSDEFUIMode usercat(String userCat){
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
    public PSDEFUIMode usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDEFUIMode userparams(String userParams){
        this.setUserParams(userParams);
        return this;
    }

    /**
     * <B>USERTAG</B>&nbsp;用户标记
     * <P>
     * 字符串：最大长度 100
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
    public PSDEFUIMode usertag(String userTag){
        this.setUserTag(userTag);
        return this;
    }

    /**
     * <B>USERTAG2</B>&nbsp;用户标记2
     * <P>
     * 字符串：最大长度 100
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
    public PSDEFUIMode usertag2(String userTag2){
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
    public PSDEFUIMode usertag3(String userTag3){
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
    public PSDEFUIMode usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>VALUEFORMAT</B>&nbsp;值格式化，指定属性界面模式的值格式化串，转化原始值到界面展示内容，未定义时使用属性的格式化串配置
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
    public PSDEFUIMode valueformat(String valueFormat){
        this.setValueFormat(valueFormat);
        return this;
    }

    /**
     * <B>VALUEITEMNAME</B>&nbsp;值项名称，指定属性界面模式的值项名称
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_VALUEITEMNAME = "valueitemname";

    /**
     * 设置 值项名称，详细说明：{@link #FIELD_VALUEITEMNAME}
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
     * 设置 值项名称，详细说明：{@link #FIELD_VALUEITEMNAME}
     * <P>
     * 等同 {@link #setValueItemName}
     * @param valueItemName
     */
    @JsonIgnore
    public PSDEFUIMode valueitemname(String valueItemName){
        this.setValueItemName(valueItemName);
        return this;
    }

    /**
     * <B>WIDTH</B>&nbsp;默认控件宽度，指定属性表单项编辑器的默认宽度，未定义时为编辑器默认宽度
     */
    public final static String FIELD_WIDTH = "width";

    /**
     * 设置 默认控件宽度，详细说明：{@link #FIELD_WIDTH}
     * 
     * @param width
     * 
     */
    @JsonProperty(FIELD_WIDTH)
    public void setWidth(Integer width){
        this.set(FIELD_WIDTH, width);
    }
    
    /**
     * 获取 默认控件宽度  
     * @return
     */
    @JsonIgnore
    public Integer getWidth(){
        Object objValue = this.get(FIELD_WIDTH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认控件宽度 是否指定值，包括空值
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
     * 重置 默认控件宽度
     */
    @JsonIgnore
    public void resetWidth(){
        this.reset(FIELD_WIDTH);
    }

    /**
     * 设置 默认控件宽度，详细说明：{@link #FIELD_WIDTH}
     * <P>
     * 等同 {@link #setWidth}
     * @param width
     */
    @JsonIgnore
    public PSDEFUIMode width(Integer width){
        this.setWidth(width);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEFUIModeId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEFUIModeId(strValue);
    }

    @JsonIgnore
    public PSDEFUIMode id(String strValue){
        this.setPSDEFUIModeId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEFUIMode){
            PSDEFUIMode model = (PSDEFUIMode)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
