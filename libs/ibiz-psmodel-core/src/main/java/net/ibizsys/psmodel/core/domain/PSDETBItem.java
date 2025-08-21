package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDETBITEM</B>工具栏项 模型传输对象
 * <P>
 * 工具栏项模型，支持界面行为、直接内容、分组等类型
 */
public class PSDETBItem extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDETBItem(){
    }      

    /**
     * <B>ACTIONLEVEL</B>&nbsp;行为级别，指定工具栏项的行为级别，未定义时为【一般操作】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.UIActionLevel} 
     */
    public final static String FIELD_ACTIONLEVEL = "actionlevel";

    /**
     * 设置 行为级别，详细说明：{@link #FIELD_ACTIONLEVEL}
     * 
     * @param actionLevel
     * 
     */
    @JsonProperty(FIELD_ACTIONLEVEL)
    public void setActionLevel(Integer actionLevel){
        this.set(FIELD_ACTIONLEVEL, actionLevel);
    }
    
    /**
     * 获取 行为级别  
     * @return
     */
    @JsonIgnore
    public Integer getActionLevel(){
        Object objValue = this.get(FIELD_ACTIONLEVEL);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 行为级别 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionLevelDirty(){
        if(this.contains(FIELD_ACTIONLEVEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 行为级别
     */
    @JsonIgnore
    public void resetActionLevel(){
        this.reset(FIELD_ACTIONLEVEL);
    }

    /**
     * 设置 行为级别，详细说明：{@link #FIELD_ACTIONLEVEL}
     * <P>
     * 等同 {@link #setActionLevel}
     * @param actionLevel
     */
    @JsonIgnore
    public PSDETBItem actionlevel(Integer actionLevel){
        this.setActionLevel(actionLevel);
        return this;
    }

     /**
     * 设置 行为级别，详细说明：{@link #FIELD_ACTIONLEVEL}
     * <P>
     * 等同 {@link #setActionLevel}
     * @param actionLevel
     */
    @JsonIgnore
    public PSDETBItem actionlevel(net.ibizsys.psmodel.core.util.PSModelEnums.UIActionLevel actionLevel){
        if(actionLevel == null){
            this.setActionLevel(null);
        }
        else{
            this.setActionLevel(actionLevel.value);
        }
        return this;
    }

    /**
     * <B>BORDERSTYLE</B>&nbsp;边框样式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.BorderStyle} 
     */
    public final static String FIELD_BORDERSTYLE = "borderstyle";

    /**
     * 设置 边框样式
     * 
     * @param borderStyle
     * 
     */
    @JsonProperty(FIELD_BORDERSTYLE)
    public void setBorderStyle(String borderStyle){
        this.set(FIELD_BORDERSTYLE, borderStyle);
    }
    
    /**
     * 获取 边框样式  
     * @return
     */
    @JsonIgnore
    public String getBorderStyle(){
        Object objValue = this.get(FIELD_BORDERSTYLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 边框样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBorderStyleDirty(){
        if(this.contains(FIELD_BORDERSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 边框样式
     */
    @JsonIgnore
    public void resetBorderStyle(){
        this.reset(FIELD_BORDERSTYLE);
    }

    /**
     * 设置 边框样式
     * <P>
     * 等同 {@link #setBorderStyle}
     * @param borderStyle
     */
    @JsonIgnore
    public PSDETBItem borderstyle(String borderStyle){
        this.setBorderStyle(borderStyle);
        return this;
    }

     /**
     * 设置 边框样式
     * <P>
     * 等同 {@link #setBorderStyle}
     * @param borderStyle
     */
    @JsonIgnore
    public PSDETBItem borderstyle(net.ibizsys.psmodel.core.util.PSModelEnums.BorderStyle borderStyle){
        if(borderStyle == null){
            this.setBorderStyle(null);
        }
        else{
            this.setBorderStyle(borderStyle.value);
        }
        return this;
    }

    /**
     * <B>BTNACTIONTYPE</B>&nbsp;按钮行为类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ToolbarButtonActionType} 
     */
    public final static String FIELD_BTNACTIONTYPE = "btnactiontype";

    /**
     * 设置 按钮行为类型
     * 
     * @param btnActionType
     * 
     */
    @JsonProperty(FIELD_BTNACTIONTYPE)
    public void setBtnActionType(String btnActionType){
        this.set(FIELD_BTNACTIONTYPE, btnActionType);
    }
    
    /**
     * 获取 按钮行为类型  
     * @return
     */
    @JsonIgnore
    public String getBtnActionType(){
        Object objValue = this.get(FIELD_BTNACTIONTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 按钮行为类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBtnActionTypeDirty(){
        if(this.contains(FIELD_BTNACTIONTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 按钮行为类型
     */
    @JsonIgnore
    public void resetBtnActionType(){
        this.reset(FIELD_BTNACTIONTYPE);
    }

    /**
     * 设置 按钮行为类型
     * <P>
     * 等同 {@link #setBtnActionType}
     * @param btnActionType
     */
    @JsonIgnore
    public PSDETBItem btnactiontype(String btnActionType){
        this.setBtnActionType(btnActionType);
        return this;
    }

     /**
     * 设置 按钮行为类型
     * <P>
     * 等同 {@link #setBtnActionType}
     * @param btnActionType
     */
    @JsonIgnore
    public PSDETBItem btnactiontype(net.ibizsys.psmodel.core.util.PSModelEnums.ToolbarButtonActionType btnActionType){
        if(btnActionType == null){
            this.setBtnActionType(null);
        }
        else{
            this.setBtnActionType(btnActionType.value);
        }
        return this;
    }

    /**
     * <B>CAPPSLANRESID</B>&nbsp;标题语言资源，指定工具栏项标题的多语言资源对象，未定义时界面行为项使用绑定界面行为的标题多语言资源对象
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
    public PSDETBItem cappslanresid(String capPSLanResId){
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
    public PSDETBItem cappslanresid(PSLanguageRes pSLanguageRes){
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
     * <B>CAPPSLANRESNAME</B>&nbsp;标题语言资源，指定工具栏项标题的多语言资源对象，未定义时界面行为项使用绑定界面行为的标题多语言资源对象
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
    public PSDETBItem cappslanresname(String capPSLanResName){
        this.setCapPSLanResName(capPSLanResName);
        return this;
    }

    /**
     * <B>CAPTION</B>&nbsp;标题，指定工具栏项的标题，未定义时界面行为项使用绑定界面行为的标题
     * <P>
     * 字符串：最大长度 60
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
    public PSDETBItem caption(String caption){
        this.setCaption(caption);
        return this;
    }

    /**
     * <B>CONTENTTYPE</B>&nbsp;内容类型，指定工具栏直接内容项的内容类型
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
    public PSDETBItem contenttype(String contentType){
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
    public PSDETBItem contenttype(net.ibizsys.psmodel.core.util.PSModelEnums.RawItemContentType contentType){
        if(contentType == null){
            this.setContentType(null);
        }
        else{
            this.setContentType(contentType.value);
        }
        return this;
    }

    /**
     * <B>COUNTERID</B>&nbsp;计数器标示
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_COUNTERID = "counterid";

    /**
     * 设置 计数器标示
     * 
     * @param counterId
     * 
     */
    @JsonProperty(FIELD_COUNTERID)
    public void setCounterId(String counterId){
        this.set(FIELD_COUNTERID, counterId);
    }
    
    /**
     * 获取 计数器标示  
     * @return
     */
    @JsonIgnore
    public String getCounterId(){
        Object objValue = this.get(FIELD_COUNTERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 计数器标示 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCounterIdDirty(){
        if(this.contains(FIELD_COUNTERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 计数器标示
     */
    @JsonIgnore
    public void resetCounterId(){
        this.reset(FIELD_COUNTERID);
    }

    /**
     * 设置 计数器标示
     * <P>
     * 等同 {@link #setCounterId}
     * @param counterId
     */
    @JsonIgnore
    public PSDETBItem counterid(String counterId){
        this.setCounterId(counterId);
        return this;
    }

    /**
     * <B>COUNTERMODE</B>&nbsp;计数器模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.TreeNodeCounterMode} 
     */
    public final static String FIELD_COUNTERMODE = "countermode";

    /**
     * 设置 计数器模式
     * 
     * @param counterMode
     * 
     */
    @JsonProperty(FIELD_COUNTERMODE)
    public void setCounterMode(Integer counterMode){
        this.set(FIELD_COUNTERMODE, counterMode);
    }
    
    /**
     * 获取 计数器模式  
     * @return
     */
    @JsonIgnore
    public Integer getCounterMode(){
        Object objValue = this.get(FIELD_COUNTERMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 计数器模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCounterModeDirty(){
        if(this.contains(FIELD_COUNTERMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 计数器模式
     */
    @JsonIgnore
    public void resetCounterMode(){
        this.reset(FIELD_COUNTERMODE);
    }

    /**
     * 设置 计数器模式
     * <P>
     * 等同 {@link #setCounterMode}
     * @param counterMode
     */
    @JsonIgnore
    public PSDETBItem countermode(Integer counterMode){
        this.setCounterMode(counterMode);
        return this;
    }

     /**
     * 设置 计数器模式
     * <P>
     * 等同 {@link #setCounterMode}
     * @param counterMode
     */
    @JsonIgnore
    public PSDETBItem countermode(net.ibizsys.psmodel.core.util.PSModelEnums.TreeNodeCounterMode counterMode){
        if(counterMode == null){
            this.setCounterMode(null);
        }
        else{
            this.setCounterMode(counterMode.value);
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
    public PSDETBItem createdate(String createDate){
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
    public PSDETBItem createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CUSTOMCODE</B>&nbsp;自定义代码
     */
    public final static String FIELD_CUSTOMCODE = "customcode";

    /**
     * 设置 自定义代码
     * 
     * @param customCode
     * 
     */
    @JsonProperty(FIELD_CUSTOMCODE)
    public void setCustomCode(String customCode){
        this.set(FIELD_CUSTOMCODE, customCode);
    }
    
    /**
     * 获取 自定义代码  
     * @return
     */
    @JsonIgnore
    public String getCustomCode(){
        Object objValue = this.get(FIELD_CUSTOMCODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomCodeDirty(){
        if(this.contains(FIELD_CUSTOMCODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义代码
     */
    @JsonIgnore
    public void resetCustomCode(){
        this.reset(FIELD_CUSTOMCODE);
    }

    /**
     * 设置 自定义代码
     * <P>
     * 等同 {@link #setCustomCode}
     * @param customCode
     */
    @JsonIgnore
    public PSDETBItem customcode(String customCode){
        this.setCustomCode(customCode);
        return this;
    }

    /**
     * <B>DATA</B>&nbsp;项数据，指定工具栏项的数据
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
    public PSDETBItem data(String data){
        this.setData(data);
        return this;
    }

    /**
     * <B>DEFAULTFLAG</B>&nbsp;默认项
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEFAULTFLAG = "defaultflag";

    /**
     * 设置 默认项
     * 
     * @param defaultFlag
     * 
     */
    @JsonProperty(FIELD_DEFAULTFLAG)
    public void setDefaultFlag(Integer defaultFlag){
        this.set(FIELD_DEFAULTFLAG, defaultFlag);
    }
    
    /**
     * 获取 默认项  
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
     * 判断 默认项 是否指定值，包括空值
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
     * 重置 默认项
     */
    @JsonIgnore
    public void resetDefaultFlag(){
        this.reset(FIELD_DEFAULTFLAG);
    }

    /**
     * 设置 默认项
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSDETBItem defaultflag(Integer defaultFlag){
        this.setDefaultFlag(defaultFlag);
        return this;
    }

     /**
     * 设置 默认项
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSDETBItem defaultflag(Boolean defaultFlag){
        if(defaultFlag == null){
            this.setDefaultFlag(null);
        }
        else{
            this.setDefaultFlag(defaultFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DEUACAP</B>&nbsp;实体界面行为标题
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEUIACTIONID}
     */
    public final static String FIELD_DEUACAP = "deuacap";

    /**
     * 设置 实体界面行为标题
     * 
     * @param dEUACap
     * 
     */
    @JsonProperty(FIELD_DEUACAP)
    public void setDEUACap(String dEUACap){
        this.set(FIELD_DEUACAP, dEUACap);
    }
    
    /**
     * 获取 实体界面行为标题  
     * @return
     */
    @JsonIgnore
    public String getDEUACap(){
        Object objValue = this.get(FIELD_DEUACAP);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体界面行为标题 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDEUACapDirty(){
        if(this.contains(FIELD_DEUACAP)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体界面行为标题
     */
    @JsonIgnore
    public void resetDEUACap(){
        this.reset(FIELD_DEUACAP);
    }

    /**
     * 设置 实体界面行为标题
     * <P>
     * 等同 {@link #setDEUACap}
     * @param dEUACap
     */
    @JsonIgnore
    public PSDETBItem deuacap(String dEUACap){
        this.setDEUACap(dEUACap);
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
    public PSDETBItem dynaclass(String dynaClass){
        this.setDynaClass(dynaClass);
        return this;
    }

    /**
     * <B>ENABLELOGIC</B>&nbsp;启用逻辑
     */
    public final static String FIELD_ENABLELOGIC = "enablelogic";

    /**
     * 设置 启用逻辑
     * 
     * @param enableLogic
     * 
     */
    @JsonProperty(FIELD_ENABLELOGIC)
    public void setEnableLogic(String enableLogic){
        this.set(FIELD_ENABLELOGIC, enableLogic);
    }
    
    /**
     * 获取 启用逻辑  
     * @return
     */
    @JsonIgnore
    public String getEnableLogic(){
        Object objValue = this.get(FIELD_ENABLELOGIC);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 启用逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableLogicDirty(){
        if(this.contains(FIELD_ENABLELOGIC)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用逻辑
     */
    @JsonIgnore
    public void resetEnableLogic(){
        this.reset(FIELD_ENABLELOGIC);
    }

    /**
     * 设置 启用逻辑
     * <P>
     * 等同 {@link #setEnableLogic}
     * @param enableLogic
     */
    @JsonIgnore
    public PSDETBItem enablelogic(String enableLogic){
        this.setEnableLogic(enableLogic);
        return this;
    }

    /**
     * <B>GROUPEXTRACTMODE</B>&nbsp;行为组展开模式，指定界面行为项对界面行为组的展开模式，未定义时为【按项展开】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.UGExtractMode} 
     */
    public final static String FIELD_GROUPEXTRACTMODE = "groupextractmode";

    /**
     * 设置 行为组展开模式，详细说明：{@link #FIELD_GROUPEXTRACTMODE}
     * 
     * @param groupExtractMode
     * 
     */
    @JsonProperty(FIELD_GROUPEXTRACTMODE)
    public void setGroupExtractMode(String groupExtractMode){
        this.set(FIELD_GROUPEXTRACTMODE, groupExtractMode);
    }
    
    /**
     * 获取 行为组展开模式  
     * @return
     */
    @JsonIgnore
    public String getGroupExtractMode(){
        Object objValue = this.get(FIELD_GROUPEXTRACTMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 行为组展开模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupExtractModeDirty(){
        if(this.contains(FIELD_GROUPEXTRACTMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 行为组展开模式
     */
    @JsonIgnore
    public void resetGroupExtractMode(){
        this.reset(FIELD_GROUPEXTRACTMODE);
    }

    /**
     * 设置 行为组展开模式，详细说明：{@link #FIELD_GROUPEXTRACTMODE}
     * <P>
     * 等同 {@link #setGroupExtractMode}
     * @param groupExtractMode
     */
    @JsonIgnore
    public PSDETBItem groupextractmode(String groupExtractMode){
        this.setGroupExtractMode(groupExtractMode);
        return this;
    }

     /**
     * 设置 行为组展开模式，详细说明：{@link #FIELD_GROUPEXTRACTMODE}
     * <P>
     * 等同 {@link #setGroupExtractMode}
     * @param groupExtractMode
     */
    @JsonIgnore
    public PSDETBItem groupextractmode(net.ibizsys.psmodel.core.util.PSModelEnums.UGExtractMode groupExtractMode){
        if(groupExtractMode == null){
            this.setGroupExtractMode(null);
        }
        else{
            this.setGroupExtractMode(groupExtractMode.value);
        }
        return this;
    }

    /**
     * <B>HEIGHT</B>&nbsp;高度，指定工具栏项的高度，0为自动。未定义时为【0】
     */
    public final static String FIELD_HEIGHT = "height";

    /**
     * 设置 高度，详细说明：{@link #FIELD_HEIGHT}
     * 
     * @param height
     * 
     */
    @JsonProperty(FIELD_HEIGHT)
    public void setHeight(Double height){
        this.set(FIELD_HEIGHT, height);
    }
    
    /**
     * 获取 高度  
     * @return
     */
    @JsonIgnore
    public Double getHeight(){
        Object objValue = this.get(FIELD_HEIGHT);
        if(objValue==null){
            return null;
        }
        return (Double)objValue;
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
     * 设置 高度，详细说明：{@link #FIELD_HEIGHT}
     * <P>
     * 等同 {@link #setHeight}
     * @param height
     */
    @JsonIgnore
    public PSDETBItem height(Double height){
        this.setHeight(height);
        return this;
    }

    /**
     * <B>HIDDENITEM</B>&nbsp;隐藏项，指定是否隐藏界面行为项，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_HIDDENITEM = "hiddenitem";

    /**
     * 设置 隐藏项，详细说明：{@link #FIELD_HIDDENITEM}
     * 
     * @param hiddenItem
     * 
     */
    @JsonProperty(FIELD_HIDDENITEM)
    public void setHiddenItem(Integer hiddenItem){
        this.set(FIELD_HIDDENITEM, hiddenItem);
    }
    
    /**
     * 获取 隐藏项  
     * @return
     */
    @JsonIgnore
    public Integer getHiddenItem(){
        Object objValue = this.get(FIELD_HIDDENITEM);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 隐藏项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHiddenItemDirty(){
        if(this.contains(FIELD_HIDDENITEM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 隐藏项
     */
    @JsonIgnore
    public void resetHiddenItem(){
        this.reset(FIELD_HIDDENITEM);
    }

    /**
     * 设置 隐藏项，详细说明：{@link #FIELD_HIDDENITEM}
     * <P>
     * 等同 {@link #setHiddenItem}
     * @param hiddenItem
     */
    @JsonIgnore
    public PSDETBItem hiddenitem(Integer hiddenItem){
        this.setHiddenItem(hiddenItem);
        return this;
    }

     /**
     * 设置 隐藏项，详细说明：{@link #FIELD_HIDDENITEM}
     * <P>
     * 等同 {@link #setHiddenItem}
     * @param hiddenItem
     */
    @JsonIgnore
    public PSDETBItem hiddenitem(Boolean hiddenItem){
        if(hiddenItem == null){
            this.setHiddenItem(null);
        }
        else{
            this.setHiddenItem(hiddenItem?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
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
    public PSDETBItem htmlcontent(String htmlContent){
        this.setHtmlContent(htmlContent);
        return this;
    }

    /**
     * <B>HTMLPAGEURL</B>&nbsp;HTML页面地址
     * <P>
     * 字符串：最大长度 300
     */
    public final static String FIELD_HTMLPAGEURL = "htmlpageurl";

    /**
     * 设置 HTML页面地址
     * 
     * @param htmlPageUrl
     * 
     */
    @JsonProperty(FIELD_HTMLPAGEURL)
    public void setHtmlPageUrl(String htmlPageUrl){
        this.set(FIELD_HTMLPAGEURL, htmlPageUrl);
    }
    
    /**
     * 获取 HTML页面地址  
     * @return
     */
    @JsonIgnore
    public String getHtmlPageUrl(){
        Object objValue = this.get(FIELD_HTMLPAGEURL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 HTML页面地址 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHtmlPageUrlDirty(){
        if(this.contains(FIELD_HTMLPAGEURL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 HTML页面地址
     */
    @JsonIgnore
    public void resetHtmlPageUrl(){
        this.reset(FIELD_HTMLPAGEURL);
    }

    /**
     * 设置 HTML页面地址
     * <P>
     * 等同 {@link #setHtmlPageUrl}
     * @param htmlPageUrl
     */
    @JsonIgnore
    public PSDETBItem htmlpageurl(String htmlPageUrl){
        this.setHtmlPageUrl(htmlPageUrl);
        return this;
    }

    /**
     * <B>ITEMSTYLE</B>&nbsp;项样式
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_ITEMSTYLE = "itemstyle";

    /**
     * 设置 项样式
     * 
     * @param itemStyle
     * 
     */
    @JsonProperty(FIELD_ITEMSTYLE)
    public void setItemStyle(String itemStyle){
        this.set(FIELD_ITEMSTYLE, itemStyle);
    }
    
    /**
     * 获取 项样式  
     * @return
     */
    @JsonIgnore
    public String getItemStyle(){
        Object objValue = this.get(FIELD_ITEMSTYLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemStyleDirty(){
        if(this.contains(FIELD_ITEMSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项样式
     */
    @JsonIgnore
    public void resetItemStyle(){
        this.reset(FIELD_ITEMSTYLE);
    }

    /**
     * 设置 项样式
     * <P>
     * 等同 {@link #setItemStyle}
     * @param itemStyle
     */
    @JsonIgnore
    public PSDETBItem itemstyle(String itemStyle){
        this.setItemStyle(itemStyle);
        return this;
    }

    /**
     * <B>ITEMSTYLETEXT</B>&nbsp;项样式
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_ITEMSTYLETEXT = "itemstyletext";

    /**
     * 设置 项样式
     * 
     * @param itemStyleText
     * 
     */
    @JsonProperty(FIELD_ITEMSTYLETEXT)
    public void setItemStyleText(String itemStyleText){
        this.set(FIELD_ITEMSTYLETEXT, itemStyleText);
    }
    
    /**
     * 获取 项样式  
     * @return
     */
    @JsonIgnore
    public String getItemStyleText(){
        Object objValue = this.get(FIELD_ITEMSTYLETEXT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemStyleTextDirty(){
        if(this.contains(FIELD_ITEMSTYLETEXT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项样式
     */
    @JsonIgnore
    public void resetItemStyleText(){
        this.reset(FIELD_ITEMSTYLETEXT);
    }

    /**
     * 设置 项样式
     * <P>
     * 等同 {@link #setItemStyleText}
     * @param itemStyleText
     */
    @JsonIgnore
    public PSDETBItem itemstyletext(String itemStyleText){
        this.setItemStyleText(itemStyleText);
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
    public PSDETBItem memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>NOPRIVDM</B>&nbsp;无权限显示模式，指定界面行为项无权限显示模式，未定义时为使用绑定的界面行为的配置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.BtnNoPrivDisplayMode} 
     */
    public final static String FIELD_NOPRIVDM = "noprivdm";

    /**
     * 设置 无权限显示模式，详细说明：{@link #FIELD_NOPRIVDM}
     * 
     * @param noPrivDM
     * 
     */
    @JsonProperty(FIELD_NOPRIVDM)
    public void setNoPrivDM(Integer noPrivDM){
        this.set(FIELD_NOPRIVDM, noPrivDM);
    }
    
    /**
     * 获取 无权限显示模式  
     * @return
     */
    @JsonIgnore
    public Integer getNoPrivDM(){
        Object objValue = this.get(FIELD_NOPRIVDM);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 无权限显示模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNoPrivDMDirty(){
        if(this.contains(FIELD_NOPRIVDM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 无权限显示模式
     */
    @JsonIgnore
    public void resetNoPrivDM(){
        this.reset(FIELD_NOPRIVDM);
    }

    /**
     * 设置 无权限显示模式，详细说明：{@link #FIELD_NOPRIVDM}
     * <P>
     * 等同 {@link #setNoPrivDM}
     * @param noPrivDM
     */
    @JsonIgnore
    public PSDETBItem noprivdm(Integer noPrivDM){
        this.setNoPrivDM(noPrivDM);
        return this;
    }

     /**
     * 设置 无权限显示模式，详细说明：{@link #FIELD_NOPRIVDM}
     * <P>
     * 等同 {@link #setNoPrivDM}
     * @param noPrivDM
     */
    @JsonIgnore
    public PSDETBItem noprivdm(net.ibizsys.psmodel.core.util.PSModelEnums.BtnNoPrivDisplayMode noPrivDM){
        if(noPrivDM == null){
            this.setNoPrivDM(null);
        }
        else{
            this.setNoPrivDM(noPrivDM.value);
        }
        return this;
    }

    /**
     * <B>OPENPSAPPVIEWID</B>&nbsp;打开应用视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSAppView} 
     */
    public final static String FIELD_OPENPSAPPVIEWID = "openpsappviewid";

    /**
     * 设置 打开应用视图
     * 
     * @param openPSAppViewId
     * 
     */
    @JsonProperty(FIELD_OPENPSAPPVIEWID)
    public void setOpenPSAppViewId(String openPSAppViewId){
        this.set(FIELD_OPENPSAPPVIEWID, openPSAppViewId);
    }
    
    /**
     * 获取 打开应用视图  
     * @return
     */
    @JsonIgnore
    public String getOpenPSAppViewId(){
        Object objValue = this.get(FIELD_OPENPSAPPVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 打开应用视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOpenPSAppViewIdDirty(){
        if(this.contains(FIELD_OPENPSAPPVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 打开应用视图
     */
    @JsonIgnore
    public void resetOpenPSAppViewId(){
        this.reset(FIELD_OPENPSAPPVIEWID);
    }

    /**
     * 设置 打开应用视图
     * <P>
     * 等同 {@link #setOpenPSAppViewId}
     * @param openPSAppViewId
     */
    @JsonIgnore
    public PSDETBItem openpsappviewid(String openPSAppViewId){
        this.setOpenPSAppViewId(openPSAppViewId);
        return this;
    }

    /**
     * 设置 打开应用视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setOpenPSAppViewId}
     * @param pSAppView 引用对象
     */
    @JsonIgnore
    public PSDETBItem openpsappviewid(PSAppView pSAppView){
        if(pSAppView == null){
            this.setOpenPSAppViewId(null);
            this.setOpenPSAppViewName(null);
        }
        else{
            this.setOpenPSAppViewId(pSAppView.getPSAppViewId());
            this.setOpenPSAppViewName(pSAppView.getPSAppViewName());
        }
        return this;
    }

    /**
     * <B>OPENPSAPPVIEWNAME</B>&nbsp;打开应用视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_OPENPSAPPVIEWID}
     */
    public final static String FIELD_OPENPSAPPVIEWNAME = "openpsappviewname";

    /**
     * 设置 打开应用视图
     * 
     * @param openPSAppViewName
     * 
     */
    @JsonProperty(FIELD_OPENPSAPPVIEWNAME)
    public void setOpenPSAppViewName(String openPSAppViewName){
        this.set(FIELD_OPENPSAPPVIEWNAME, openPSAppViewName);
    }
    
    /**
     * 获取 打开应用视图  
     * @return
     */
    @JsonIgnore
    public String getOpenPSAppViewName(){
        Object objValue = this.get(FIELD_OPENPSAPPVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 打开应用视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOpenPSAppViewNameDirty(){
        if(this.contains(FIELD_OPENPSAPPVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 打开应用视图
     */
    @JsonIgnore
    public void resetOpenPSAppViewName(){
        this.reset(FIELD_OPENPSAPPVIEWNAME);
    }

    /**
     * 设置 打开应用视图
     * <P>
     * 等同 {@link #setOpenPSAppViewName}
     * @param openPSAppViewName
     */
    @JsonIgnore
    public PSDETBItem openpsappviewname(String openPSAppViewName){
        this.setOpenPSAppViewName(openPSAppViewName);
        return this;
    }

    /**
     * <B>OPENPSDEVIEWID</B>&nbsp;打开实体视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_OPENPSDEVIEWID = "openpsdeviewid";

    /**
     * 设置 打开实体视图
     * 
     * @param openPSDEViewId
     * 
     */
    @JsonProperty(FIELD_OPENPSDEVIEWID)
    public void setOpenPSDEViewId(String openPSDEViewId){
        this.set(FIELD_OPENPSDEVIEWID, openPSDEViewId);
    }
    
    /**
     * 获取 打开实体视图  
     * @return
     */
    @JsonIgnore
    public String getOpenPSDEViewId(){
        Object objValue = this.get(FIELD_OPENPSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 打开实体视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOpenPSDEViewIdDirty(){
        if(this.contains(FIELD_OPENPSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 打开实体视图
     */
    @JsonIgnore
    public void resetOpenPSDEViewId(){
        this.reset(FIELD_OPENPSDEVIEWID);
    }

    /**
     * 设置 打开实体视图
     * <P>
     * 等同 {@link #setOpenPSDEViewId}
     * @param openPSDEViewId
     */
    @JsonIgnore
    public PSDETBItem openpsdeviewid(String openPSDEViewId){
        this.setOpenPSDEViewId(openPSDEViewId);
        return this;
    }

    /**
     * 设置 打开实体视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setOpenPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSDETBItem openpsdeviewid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setOpenPSDEViewId(null);
            this.setOpenPSDEViewName(null);
        }
        else{
            this.setOpenPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setOpenPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>OPENPSDEVIEWNAME</B>&nbsp;打开实体视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_OPENPSDEVIEWID}
     */
    public final static String FIELD_OPENPSDEVIEWNAME = "openpsdeviewname";

    /**
     * 设置 打开实体视图
     * 
     * @param openPSDEViewName
     * 
     */
    @JsonProperty(FIELD_OPENPSDEVIEWNAME)
    public void setOpenPSDEViewName(String openPSDEViewName){
        this.set(FIELD_OPENPSDEVIEWNAME, openPSDEViewName);
    }
    
    /**
     * 获取 打开实体视图  
     * @return
     */
    @JsonIgnore
    public String getOpenPSDEViewName(){
        Object objValue = this.get(FIELD_OPENPSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 打开实体视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOpenPSDEViewNameDirty(){
        if(this.contains(FIELD_OPENPSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 打开实体视图
     */
    @JsonIgnore
    public void resetOpenPSDEViewName(){
        this.reset(FIELD_OPENPSDEVIEWNAME);
    }

    /**
     * 设置 打开实体视图
     * <P>
     * 等同 {@link #setOpenPSDEViewName}
     * @param openPSDEViewName
     */
    @JsonIgnore
    public PSDETBItem openpsdeviewname(String openPSDEViewName){
        this.setOpenPSDEViewName(openPSDEViewName);
        return this;
    }

    /**
     * <B>OPENPSSYSPDTVIEWID</B>&nbsp;打开系统预置视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysPDTView} 
     */
    public final static String FIELD_OPENPSSYSPDTVIEWID = "openpssyspdtviewid";

    /**
     * 设置 打开系统预置视图
     * 
     * @param openPSSysPDTViewId
     * 
     */
    @JsonProperty(FIELD_OPENPSSYSPDTVIEWID)
    public void setOpenPSSysPDTViewId(String openPSSysPDTViewId){
        this.set(FIELD_OPENPSSYSPDTVIEWID, openPSSysPDTViewId);
    }
    
    /**
     * 获取 打开系统预置视图  
     * @return
     */
    @JsonIgnore
    public String getOpenPSSysPDTViewId(){
        Object objValue = this.get(FIELD_OPENPSSYSPDTVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 打开系统预置视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOpenPSSysPDTViewIdDirty(){
        if(this.contains(FIELD_OPENPSSYSPDTVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 打开系统预置视图
     */
    @JsonIgnore
    public void resetOpenPSSysPDTViewId(){
        this.reset(FIELD_OPENPSSYSPDTVIEWID);
    }

    /**
     * 设置 打开系统预置视图
     * <P>
     * 等同 {@link #setOpenPSSysPDTViewId}
     * @param openPSSysPDTViewId
     */
    @JsonIgnore
    public PSDETBItem openpssyspdtviewid(String openPSSysPDTViewId){
        this.setOpenPSSysPDTViewId(openPSSysPDTViewId);
        return this;
    }

    /**
     * 设置 打开系统预置视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setOpenPSSysPDTViewId}
     * @param pSSysPDTView 引用对象
     */
    @JsonIgnore
    public PSDETBItem openpssyspdtviewid(PSSysPDTView pSSysPDTView){
        if(pSSysPDTView == null){
            this.setOpenPSSysPDTViewId(null);
            this.setOpenPSSysPDTViewName(null);
        }
        else{
            this.setOpenPSSysPDTViewId(pSSysPDTView.getPSSysPDTViewId());
            this.setOpenPSSysPDTViewName(pSSysPDTView.getPSSysPDTViewName());
        }
        return this;
    }

    /**
     * <B>OPENPSSYSPDTVIEWNAME</B>&nbsp;打开系统预置视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_OPENPSSYSPDTVIEWID}
     */
    public final static String FIELD_OPENPSSYSPDTVIEWNAME = "openpssyspdtviewname";

    /**
     * 设置 打开系统预置视图
     * 
     * @param openPSSysPDTViewName
     * 
     */
    @JsonProperty(FIELD_OPENPSSYSPDTVIEWNAME)
    public void setOpenPSSysPDTViewName(String openPSSysPDTViewName){
        this.set(FIELD_OPENPSSYSPDTVIEWNAME, openPSSysPDTViewName);
    }
    
    /**
     * 获取 打开系统预置视图  
     * @return
     */
    @JsonIgnore
    public String getOpenPSSysPDTViewName(){
        Object objValue = this.get(FIELD_OPENPSSYSPDTVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 打开系统预置视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOpenPSSysPDTViewNameDirty(){
        if(this.contains(FIELD_OPENPSSYSPDTVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 打开系统预置视图
     */
    @JsonIgnore
    public void resetOpenPSSysPDTViewName(){
        this.reset(FIELD_OPENPSSYSPDTVIEWNAME);
    }

    /**
     * 设置 打开系统预置视图
     * <P>
     * 等同 {@link #setOpenPSSysPDTViewName}
     * @param openPSSysPDTViewName
     */
    @JsonIgnore
    public PSDETBItem openpssyspdtviewname(String openPSSysPDTViewName){
        this.setOpenPSSysPDTViewName(openPSSysPDTViewName);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;次序
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 次序
     * 
     * @param orderValue
     * 
     */
    @JsonProperty(FIELD_ORDERVALUE)
    public void setOrderValue(Integer orderValue){
        this.set(FIELD_ORDERVALUE, orderValue);
    }
    
    /**
     * 获取 次序  
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
     * 判断 次序 是否指定值，包括空值
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
     * 重置 次序
     */
    @JsonIgnore
    public void resetOrderValue(){
        this.reset(FIELD_ORDERVALUE);
    }

    /**
     * 设置 次序
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSDETBItem ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PPSDETBITEMID</B>&nbsp;父工具栏项，指定父工具栏项
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDETBItem} 
     */
    public final static String FIELD_PPSDETBITEMID = "ppsdetbitemid";

    /**
     * 设置 父工具栏项，详细说明：{@link #FIELD_PPSDETBITEMID}
     * 
     * @param pPSDETBItemId
     * 
     */
    @JsonProperty(FIELD_PPSDETBITEMID)
    public void setPPSDETBItemId(String pPSDETBItemId){
        this.set(FIELD_PPSDETBITEMID, pPSDETBItemId);
    }
    
    /**
     * 获取 父工具栏项  
     * @return
     */
    @JsonIgnore
    public String getPPSDETBItemId(){
        Object objValue = this.get(FIELD_PPSDETBITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父工具栏项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSDETBItemIdDirty(){
        if(this.contains(FIELD_PPSDETBITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父工具栏项
     */
    @JsonIgnore
    public void resetPPSDETBItemId(){
        this.reset(FIELD_PPSDETBITEMID);
    }

    /**
     * 设置 父工具栏项，详细说明：{@link #FIELD_PPSDETBITEMID}
     * <P>
     * 等同 {@link #setPPSDETBItemId}
     * @param pPSDETBItemId
     */
    @JsonIgnore
    public PSDETBItem ppsdetbitemid(String pPSDETBItemId){
        this.setPPSDETBItemId(pPSDETBItemId);
        return this;
    }

    /**
     * 设置 父工具栏项，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPPSDETBItemId}
     * @param pSDETBItem 引用对象
     */
    @JsonIgnore
    public PSDETBItem ppsdetbitemid(PSDETBItem pSDETBItem){
        if(pSDETBItem == null){
            this.setPPSDETBItemId(null);
            this.setPPSDETBItemName(null);
        }
        else{
            this.setPPSDETBItemId(pSDETBItem.getPSDETBItemId());
            this.setPPSDETBItemName(pSDETBItem.getPSDETBItemName());
        }
        return this;
    }

    /**
     * <B>PPSDETBITEMNAME</B>&nbsp;父工具栏项，指定父工具栏项
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PPSDETBITEMID}
     */
    public final static String FIELD_PPSDETBITEMNAME = "ppsdetbitemname";

    /**
     * 设置 父工具栏项，详细说明：{@link #FIELD_PPSDETBITEMNAME}
     * 
     * @param pPSDETBItemName
     * 
     */
    @JsonProperty(FIELD_PPSDETBITEMNAME)
    public void setPPSDETBItemName(String pPSDETBItemName){
        this.set(FIELD_PPSDETBITEMNAME, pPSDETBItemName);
    }
    
    /**
     * 获取 父工具栏项  
     * @return
     */
    @JsonIgnore
    public String getPPSDETBItemName(){
        Object objValue = this.get(FIELD_PPSDETBITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父工具栏项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSDETBItemNameDirty(){
        if(this.contains(FIELD_PPSDETBITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父工具栏项
     */
    @JsonIgnore
    public void resetPPSDETBItemName(){
        this.reset(FIELD_PPSDETBITEMNAME);
    }

    /**
     * 设置 父工具栏项，详细说明：{@link #FIELD_PPSDETBITEMNAME}
     * <P>
     * 等同 {@link #setPPSDETBItemName}
     * @param pPSDETBItemName
     */
    @JsonIgnore
    public PSDETBItem ppsdetbitemname(String pPSDETBItemName){
        this.setPPSDETBItemName(pPSDETBItemName);
        return this;
    }

    /**
     * <B>PREDEFINEDTYPE</B>&nbsp;预定义类型
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_PREDEFINEDTYPE = "predefinedtype";

    /**
     * 设置 预定义类型
     * 
     * @param predefinedType
     * 
     */
    @JsonProperty(FIELD_PREDEFINEDTYPE)
    public void setPredefinedType(String predefinedType){
        this.set(FIELD_PREDEFINEDTYPE, predefinedType);
    }
    
    /**
     * 获取 预定义类型  
     * @return
     */
    @JsonIgnore
    public String getPredefinedType(){
        Object objValue = this.get(FIELD_PREDEFINEDTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预定义类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPredefinedTypeDirty(){
        if(this.contains(FIELD_PREDEFINEDTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预定义类型
     */
    @JsonIgnore
    public void resetPredefinedType(){
        this.reset(FIELD_PREDEFINEDTYPE);
    }

    /**
     * 设置 预定义类型
     * <P>
     * 等同 {@link #setPredefinedType}
     * @param predefinedType
     */
    @JsonIgnore
    public PSDETBItem predefinedtype(String predefinedType){
        this.setPredefinedType(predefinedType);
        return this;
    }

    /**
     * <B>PREDEFINEDTYPETEXT</B>&nbsp;预定义类型
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_PREDEFINEDTYPETEXT = "predefinedtypetext";

    /**
     * 设置 预定义类型
     * 
     * @param predefinedTypeText
     * 
     */
    @JsonProperty(FIELD_PREDEFINEDTYPETEXT)
    public void setPredefinedTypeText(String predefinedTypeText){
        this.set(FIELD_PREDEFINEDTYPETEXT, predefinedTypeText);
    }
    
    /**
     * 获取 预定义类型  
     * @return
     */
    @JsonIgnore
    public String getPredefinedTypeText(){
        Object objValue = this.get(FIELD_PREDEFINEDTYPETEXT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预定义类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPredefinedTypeTextDirty(){
        if(this.contains(FIELD_PREDEFINEDTYPETEXT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预定义类型
     */
    @JsonIgnore
    public void resetPredefinedTypeText(){
        this.reset(FIELD_PREDEFINEDTYPETEXT);
    }

    /**
     * 设置 预定义类型
     * <P>
     * 等同 {@link #setPredefinedTypeText}
     * @param predefinedTypeText
     */
    @JsonIgnore
    public PSDETBItem predefinedtypetext(String predefinedTypeText){
        this.setPredefinedTypeText(predefinedTypeText);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;PSDEID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDETOOLBARID}
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
    public PSDETBItem psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * <B>PSDELOGICID</B>&nbsp;实体界面逻辑
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDELogic} 
     */
    public final static String FIELD_PSDELOGICID = "psdelogicid";

    /**
     * 设置 实体界面逻辑
     * 
     * @param pSDELogicId
     * 
     */
    @JsonProperty(FIELD_PSDELOGICID)
    public void setPSDELogicId(String pSDELogicId){
        this.set(FIELD_PSDELOGICID, pSDELogicId);
    }
    
    /**
     * 获取 实体界面逻辑  
     * @return
     */
    @JsonIgnore
    public String getPSDELogicId(){
        Object objValue = this.get(FIELD_PSDELOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体界面逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDELogicIdDirty(){
        if(this.contains(FIELD_PSDELOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体界面逻辑
     */
    @JsonIgnore
    public void resetPSDELogicId(){
        this.reset(FIELD_PSDELOGICID);
    }

    /**
     * 设置 实体界面逻辑
     * <P>
     * 等同 {@link #setPSDELogicId}
     * @param pSDELogicId
     */
    @JsonIgnore
    public PSDETBItem psdelogicid(String pSDELogicId){
        this.setPSDELogicId(pSDELogicId);
        return this;
    }

    /**
     * 设置 实体界面逻辑，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDELogicId}
     * @param pSDELogic 引用对象
     */
    @JsonIgnore
    public PSDETBItem psdelogicid(PSDELogic pSDELogic){
        if(pSDELogic == null){
            this.setPSDELogicId(null);
            this.setPSDELogicName(null);
        }
        else{
            this.setPSDELogicId(pSDELogic.getPSDELogicId());
            this.setPSDELogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    /**
     * <B>PSDELOGICNAME</B>&nbsp;实体界面逻辑
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDELOGICID}
     */
    public final static String FIELD_PSDELOGICNAME = "psdelogicname";

    /**
     * 设置 实体界面逻辑
     * 
     * @param pSDELogicName
     * 
     */
    @JsonProperty(FIELD_PSDELOGICNAME)
    public void setPSDELogicName(String pSDELogicName){
        this.set(FIELD_PSDELOGICNAME, pSDELogicName);
    }
    
    /**
     * 获取 实体界面逻辑  
     * @return
     */
    @JsonIgnore
    public String getPSDELogicName(){
        Object objValue = this.get(FIELD_PSDELOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体界面逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDELogicNameDirty(){
        if(this.contains(FIELD_PSDELOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体界面逻辑
     */
    @JsonIgnore
    public void resetPSDELogicName(){
        this.reset(FIELD_PSDELOGICNAME);
    }

    /**
     * 设置 实体界面逻辑
     * <P>
     * 等同 {@link #setPSDELogicName}
     * @param pSDELogicName
     */
    @JsonIgnore
    public PSDETBItem psdelogicname(String pSDELogicName){
        this.setPSDELogicName(pSDELogicName);
        return this;
    }

    /**
     * <B>PSDETBITEMID</B>&nbsp;实体工具栏项标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDETBITEMID = "psdetbitemid";

    /**
     * 设置 实体工具栏项标识
     * 
     * @param pSDETBItemId
     * 
     */
    @JsonProperty(FIELD_PSDETBITEMID)
    public void setPSDETBItemId(String pSDETBItemId){
        this.set(FIELD_PSDETBITEMID, pSDETBItemId);
    }
    
    /**
     * 获取 实体工具栏项标识  
     * @return
     */
    @JsonIgnore
    public String getPSDETBItemId(){
        Object objValue = this.get(FIELD_PSDETBITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体工具栏项标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDETBItemIdDirty(){
        if(this.contains(FIELD_PSDETBITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体工具栏项标识
     */
    @JsonIgnore
    public void resetPSDETBItemId(){
        this.reset(FIELD_PSDETBITEMID);
    }

    /**
     * 设置 实体工具栏项标识
     * <P>
     * 等同 {@link #setPSDETBItemId}
     * @param pSDETBItemId
     */
    @JsonIgnore
    public PSDETBItem psdetbitemid(String pSDETBItemId){
        this.setPSDETBItemId(pSDETBItemId);
        return this;
    }

    /**
     * <B>PSDETBITEMNAME</B>&nbsp;项标识，指定工具栏项的标识，需在所在工具栏中具备唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDETBITEMNAME = "psdetbitemname";

    /**
     * 设置 项标识，详细说明：{@link #FIELD_PSDETBITEMNAME}
     * 
     * @param pSDETBItemName
     * 
     */
    @JsonProperty(FIELD_PSDETBITEMNAME)
    public void setPSDETBItemName(String pSDETBItemName){
        this.set(FIELD_PSDETBITEMNAME, pSDETBItemName);
    }
    
    /**
     * 获取 项标识  
     * @return
     */
    @JsonIgnore
    public String getPSDETBItemName(){
        Object objValue = this.get(FIELD_PSDETBITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDETBItemNameDirty(){
        if(this.contains(FIELD_PSDETBITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项标识
     */
    @JsonIgnore
    public void resetPSDETBItemName(){
        this.reset(FIELD_PSDETBITEMNAME);
    }

    /**
     * 设置 项标识，详细说明：{@link #FIELD_PSDETBITEMNAME}
     * <P>
     * 等同 {@link #setPSDETBItemName}
     * @param pSDETBItemName
     */
    @JsonIgnore
    public PSDETBItem psdetbitemname(String pSDETBItemName){
        this.setPSDETBItemName(pSDETBItemName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDETBItemName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDETBItemName(strName);
    }

    @JsonIgnore
    public PSDETBItem name(String strName){
        this.setPSDETBItemName(strName);
        return this;
    }

    /**
     * <B>PSDETOOLBARID</B>&nbsp;实体工具栏，指定工具栏项所在的工具栏对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEToolbar} 
     */
    public final static String FIELD_PSDETOOLBARID = "psdetoolbarid";

    /**
     * 设置 实体工具栏，详细说明：{@link #FIELD_PSDETOOLBARID}
     * 
     * @param pSDEToolbarId
     * 
     */
    @JsonProperty(FIELD_PSDETOOLBARID)
    public void setPSDEToolbarId(String pSDEToolbarId){
        this.set(FIELD_PSDETOOLBARID, pSDEToolbarId);
    }
    
    /**
     * 获取 实体工具栏  
     * @return
     */
    @JsonIgnore
    public String getPSDEToolbarId(){
        Object objValue = this.get(FIELD_PSDETOOLBARID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体工具栏 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEToolbarIdDirty(){
        if(this.contains(FIELD_PSDETOOLBARID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体工具栏
     */
    @JsonIgnore
    public void resetPSDEToolbarId(){
        this.reset(FIELD_PSDETOOLBARID);
    }

    /**
     * 设置 实体工具栏，详细说明：{@link #FIELD_PSDETOOLBARID}
     * <P>
     * 等同 {@link #setPSDEToolbarId}
     * @param pSDEToolbarId
     */
    @JsonIgnore
    public PSDETBItem psdetoolbarid(String pSDEToolbarId){
        this.setPSDEToolbarId(pSDEToolbarId);
        return this;
    }

    /**
     * 设置 实体工具栏，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEToolbarId}
     * @param pSDEToolbar 引用对象
     */
    @JsonIgnore
    public PSDETBItem psdetoolbarid(PSDEToolbar pSDEToolbar){
        if(pSDEToolbar == null){
            this.setPSDEId(null);
            this.setPSDEToolbarId(null);
            this.setPSDEToolbarName(null);
        }
        else{
            this.setPSDEId(pSDEToolbar.getPSDEId());
            this.setPSDEToolbarId(pSDEToolbar.getPSDEToolbarId());
            this.setPSDEToolbarName(pSDEToolbar.getPSDEToolbarName());
        }
        return this;
    }

    /**
     * <B>PSDETOOLBARNAME</B>&nbsp;实体工具栏，指定工具栏项所在的工具栏对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDETOOLBARID}
     */
    public final static String FIELD_PSDETOOLBARNAME = "psdetoolbarname";

    /**
     * 设置 实体工具栏，详细说明：{@link #FIELD_PSDETOOLBARNAME}
     * 
     * @param pSDEToolbarName
     * 
     */
    @JsonProperty(FIELD_PSDETOOLBARNAME)
    public void setPSDEToolbarName(String pSDEToolbarName){
        this.set(FIELD_PSDETOOLBARNAME, pSDEToolbarName);
    }
    
    /**
     * 获取 实体工具栏  
     * @return
     */
    @JsonIgnore
    public String getPSDEToolbarName(){
        Object objValue = this.get(FIELD_PSDETOOLBARNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体工具栏 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEToolbarNameDirty(){
        if(this.contains(FIELD_PSDETOOLBARNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体工具栏
     */
    @JsonIgnore
    public void resetPSDEToolbarName(){
        this.reset(FIELD_PSDETOOLBARNAME);
    }

    /**
     * 设置 实体工具栏，详细说明：{@link #FIELD_PSDETOOLBARNAME}
     * <P>
     * 等同 {@link #setPSDEToolbarName}
     * @param pSDEToolbarName
     */
    @JsonIgnore
    public PSDETBItem psdetoolbarname(String pSDEToolbarName){
        this.setPSDEToolbarName(pSDEToolbarName);
        return this;
    }

    /**
     * <B>PSDEUAGROUPID</B>&nbsp;实体界面行为组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEUAGroup} 
     */
    public final static String FIELD_PSDEUAGROUPID = "psdeuagroupid";

    /**
     * 设置 实体界面行为组
     * 
     * @param pSDEUAGroupId
     * 
     */
    @JsonProperty(FIELD_PSDEUAGROUPID)
    public void setPSDEUAGroupId(String pSDEUAGroupId){
        this.set(FIELD_PSDEUAGROUPID, pSDEUAGroupId);
    }
    
    /**
     * 获取 实体界面行为组  
     * @return
     */
    @JsonIgnore
    public String getPSDEUAGroupId(){
        Object objValue = this.get(FIELD_PSDEUAGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体界面行为组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEUAGroupIdDirty(){
        if(this.contains(FIELD_PSDEUAGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体界面行为组
     */
    @JsonIgnore
    public void resetPSDEUAGroupId(){
        this.reset(FIELD_PSDEUAGROUPID);
    }

    /**
     * 设置 实体界面行为组
     * <P>
     * 等同 {@link #setPSDEUAGroupId}
     * @param pSDEUAGroupId
     */
    @JsonIgnore
    public PSDETBItem psdeuagroupid(String pSDEUAGroupId){
        this.setPSDEUAGroupId(pSDEUAGroupId);
        return this;
    }

    /**
     * 设置 实体界面行为组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEUAGroupId}
     * @param pSDEUAGroup 引用对象
     */
    @JsonIgnore
    public PSDETBItem psdeuagroupid(PSDEUAGroup pSDEUAGroup){
        if(pSDEUAGroup == null){
            this.setPSDEUAGroupId(null);
            this.setPSDEUAGroupName(null);
        }
        else{
            this.setPSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setPSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    /**
     * <B>PSDEUAGROUPNAME</B>&nbsp;实体界面行为组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEUAGROUPID}
     */
    public final static String FIELD_PSDEUAGROUPNAME = "psdeuagroupname";

    /**
     * 设置 实体界面行为组
     * 
     * @param pSDEUAGroupName
     * 
     */
    @JsonProperty(FIELD_PSDEUAGROUPNAME)
    public void setPSDEUAGroupName(String pSDEUAGroupName){
        this.set(FIELD_PSDEUAGROUPNAME, pSDEUAGroupName);
    }
    
    /**
     * 获取 实体界面行为组  
     * @return
     */
    @JsonIgnore
    public String getPSDEUAGroupName(){
        Object objValue = this.get(FIELD_PSDEUAGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体界面行为组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEUAGroupNameDirty(){
        if(this.contains(FIELD_PSDEUAGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体界面行为组
     */
    @JsonIgnore
    public void resetPSDEUAGroupName(){
        this.reset(FIELD_PSDEUAGROUPNAME);
    }

    /**
     * 设置 实体界面行为组
     * <P>
     * 等同 {@link #setPSDEUAGroupName}
     * @param pSDEUAGroupName
     */
    @JsonIgnore
    public PSDETBItem psdeuagroupname(String pSDEUAGroupName){
        this.setPSDEUAGroupName(pSDEUAGroupName);
        return this;
    }

    /**
     * <B>PSDEUIACTIONID</B>&nbsp;实体界面行为，指定界面行为项绑定的界面行为对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEUIAction} 
     */
    public final static String FIELD_PSDEUIACTIONID = "psdeuiactionid";

    /**
     * 设置 实体界面行为，详细说明：{@link #FIELD_PSDEUIACTIONID}
     * 
     * @param pSDEUIActionId
     * 
     */
    @JsonProperty(FIELD_PSDEUIACTIONID)
    public void setPSDEUIActionId(String pSDEUIActionId){
        this.set(FIELD_PSDEUIACTIONID, pSDEUIActionId);
    }
    
    /**
     * 获取 实体界面行为  
     * @return
     */
    @JsonIgnore
    public String getPSDEUIActionId(){
        Object objValue = this.get(FIELD_PSDEUIACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体界面行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEUIActionIdDirty(){
        if(this.contains(FIELD_PSDEUIACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体界面行为
     */
    @JsonIgnore
    public void resetPSDEUIActionId(){
        this.reset(FIELD_PSDEUIACTIONID);
    }

    /**
     * 设置 实体界面行为，详细说明：{@link #FIELD_PSDEUIACTIONID}
     * <P>
     * 等同 {@link #setPSDEUIActionId}
     * @param pSDEUIActionId
     */
    @JsonIgnore
    public PSDETBItem psdeuiactionid(String pSDEUIActionId){
        this.setPSDEUIActionId(pSDEUIActionId);
        return this;
    }

    /**
     * 设置 实体界面行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEUIActionId}
     * @param pSDEUIAction 引用对象
     */
    @JsonIgnore
    public PSDETBItem psdeuiactionid(PSDEUIAction pSDEUIAction){
        if(pSDEUIAction == null){
            this.setDEUACap(null);
            this.setPSDEUIActionId(null);
            this.setPSDEUIActionName(null);
        }
        else{
            this.setDEUACap(pSDEUIAction.getCaption());
            this.setPSDEUIActionId(pSDEUIAction.getPSDEUIActionId());
            this.setPSDEUIActionName(pSDEUIAction.getPSDEUIActionName());
        }
        return this;
    }

    /**
     * <B>PSDEUIACTIONNAME</B>&nbsp;实体界面行为，指定界面行为项绑定的界面行为对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEUIACTIONID}
     */
    public final static String FIELD_PSDEUIACTIONNAME = "psdeuiactionname";

    /**
     * 设置 实体界面行为，详细说明：{@link #FIELD_PSDEUIACTIONNAME}
     * 
     * @param pSDEUIActionName
     * 
     */
    @JsonProperty(FIELD_PSDEUIACTIONNAME)
    public void setPSDEUIActionName(String pSDEUIActionName){
        this.set(FIELD_PSDEUIACTIONNAME, pSDEUIActionName);
    }
    
    /**
     * 获取 实体界面行为  
     * @return
     */
    @JsonIgnore
    public String getPSDEUIActionName(){
        Object objValue = this.get(FIELD_PSDEUIACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体界面行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEUIActionNameDirty(){
        if(this.contains(FIELD_PSDEUIACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体界面行为
     */
    @JsonIgnore
    public void resetPSDEUIActionName(){
        this.reset(FIELD_PSDEUIACTIONNAME);
    }

    /**
     * 设置 实体界面行为，详细说明：{@link #FIELD_PSDEUIACTIONNAME}
     * <P>
     * 等同 {@link #setPSDEUIActionName}
     * @param pSDEUIActionName
     */
    @JsonIgnore
    public PSDETBItem psdeuiactionname(String pSDEUIActionName){
        this.setPSDEUIActionName(pSDEUIActionName);
        return this;
    }

    /**
     * <B>PSSYSCSSID</B>&nbsp;系统界面样式表，指定工具栏项的界面样式表对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCss} 
     */
    public final static String FIELD_PSSYSCSSID = "pssyscssid";

    /**
     * 设置 系统界面样式表，详细说明：{@link #FIELD_PSSYSCSSID}
     * 
     * @param pSSysCssId
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSID)
    public void setPSSysCssId(String pSSysCssId){
        this.set(FIELD_PSSYSCSSID, pSSysCssId);
    }
    
    /**
     * 获取 系统界面样式表  
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
     * 判断 系统界面样式表 是否指定值，包括空值
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
     * 重置 系统界面样式表
     */
    @JsonIgnore
    public void resetPSSysCssId(){
        this.reset(FIELD_PSSYSCSSID);
    }

    /**
     * 设置 系统界面样式表，详细说明：{@link #FIELD_PSSYSCSSID}
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCssId
     */
    @JsonIgnore
    public PSDETBItem pssyscssid(String pSSysCssId){
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    /**
     * 设置 系统界面样式表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSDETBItem pssyscssid(PSSysCss pSSysCss){
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
     * <B>PSSYSCSSNAME</B>&nbsp;界面样式表，指定工具栏项的界面样式表对象
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
    public PSDETBItem pssyscssname(String pSSysCssName){
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    /**
     * <B>PSSYSIMAGEID</B>&nbsp;显示图标，指定工具栏项的图片资源对象，未定义时界面行为项使用绑定界面行为的图片资源对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysImage} 
     */
    public final static String FIELD_PSSYSIMAGEID = "pssysimageid";

    /**
     * 设置 显示图标，详细说明：{@link #FIELD_PSSYSIMAGEID}
     * 
     * @param pSSysImageId
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGEID)
    public void setPSSysImageId(String pSSysImageId){
        this.set(FIELD_PSSYSIMAGEID, pSSysImageId);
    }
    
    /**
     * 获取 显示图标  
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
     * 判断 显示图标 是否指定值，包括空值
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
     * 重置 显示图标
     */
    @JsonIgnore
    public void resetPSSysImageId(){
        this.reset(FIELD_PSSYSIMAGEID);
    }

    /**
     * 设置 显示图标，详细说明：{@link #FIELD_PSSYSIMAGEID}
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImageId
     */
    @JsonIgnore
    public PSDETBItem pssysimageid(String pSSysImageId){
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    /**
     * 设置 显示图标，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImage 引用对象
     */
    @JsonIgnore
    public PSDETBItem pssysimageid(PSSysImage pSSysImage){
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
     * <B>PSSYSIMAGENAME</B>&nbsp;显示图标，指定工具栏项的图片资源对象，未定义时界面行为项使用绑定界面行为的图片资源对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSIMAGEID}
     */
    public final static String FIELD_PSSYSIMAGENAME = "pssysimagename";

    /**
     * 设置 显示图标，详细说明：{@link #FIELD_PSSYSIMAGENAME}
     * 
     * @param pSSysImageName
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGENAME)
    public void setPSSysImageName(String pSSysImageName){
        this.set(FIELD_PSSYSIMAGENAME, pSSysImageName);
    }
    
    /**
     * 获取 显示图标  
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
     * 判断 显示图标 是否指定值，包括空值
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
     * 重置 显示图标
     */
    @JsonIgnore
    public void resetPSSysImageName(){
        this.reset(FIELD_PSSYSIMAGENAME);
    }

    /**
     * 设置 显示图标，详细说明：{@link #FIELD_PSSYSIMAGENAME}
     * <P>
     * 等同 {@link #setPSSysImageName}
     * @param pSSysImageName
     */
    @JsonIgnore
    public PSDETBItem pssysimagename(String pSSysImageName){
        this.setPSSysImageName(pSSysImageName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端扩展插件，指定实体工具栏项使用的前端模板扩展插件，使用插件类型【工具栏项绘制插件】
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
    public PSDETBItem pssyspfpluginid(String pSSysPFPluginId){
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
    public PSDETBItem pssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
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
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端扩展插件，指定实体工具栏项使用的前端模板扩展插件，使用插件类型【工具栏项绘制插件】
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
    public PSDETBItem pssyspfpluginname(String pSSysPFPluginName){
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
    public PSDETBItem pssysresourceid(String pSSysResourceId){
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
    public PSDETBItem pssysresourceid(PSSysResource pSSysResource){
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
    public PSDETBItem pssysresourcename(String pSSysResourceName){
        this.setPSSysResourceName(pSSysResourceName);
        return this;
    }

    /**
     * <B>PSSYSUNIRESID</B>&nbsp;资源统一资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysUniRes} 
     */
    public final static String FIELD_PSSYSUNIRESID = "pssysuniresid";

    /**
     * 设置 资源统一资源
     * 
     * @param pSSysUniResId
     * 
     */
    @JsonProperty(FIELD_PSSYSUNIRESID)
    public void setPSSysUniResId(String pSSysUniResId){
        this.set(FIELD_PSSYSUNIRESID, pSSysUniResId);
    }
    
    /**
     * 获取 资源统一资源  
     * @return
     */
    @JsonIgnore
    public String getPSSysUniResId(){
        Object objValue = this.get(FIELD_PSSYSUNIRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 资源统一资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUniResIdDirty(){
        if(this.contains(FIELD_PSSYSUNIRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 资源统一资源
     */
    @JsonIgnore
    public void resetPSSysUniResId(){
        this.reset(FIELD_PSSYSUNIRESID);
    }

    /**
     * 设置 资源统一资源
     * <P>
     * 等同 {@link #setPSSysUniResId}
     * @param pSSysUniResId
     */
    @JsonIgnore
    public PSDETBItem pssysuniresid(String pSSysUniResId){
        this.setPSSysUniResId(pSSysUniResId);
        return this;
    }

    /**
     * 设置 资源统一资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysUniResId}
     * @param pSSysUniRes 引用对象
     */
    @JsonIgnore
    public PSDETBItem pssysuniresid(PSSysUniRes pSSysUniRes){
        if(pSSysUniRes == null){
            this.setPSSysUniResId(null);
            this.setPSSysUniResName(null);
        }
        else{
            this.setPSSysUniResId(pSSysUniRes.getPSSysUniResId());
            this.setPSSysUniResName(pSSysUniRes.getPSSysUniResName());
        }
        return this;
    }

    /**
     * <B>PSSYSUNIRESNAME</B>&nbsp;资源统一资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSUNIRESID}
     */
    public final static String FIELD_PSSYSUNIRESNAME = "pssysuniresname";

    /**
     * 设置 资源统一资源
     * 
     * @param pSSysUniResName
     * 
     */
    @JsonProperty(FIELD_PSSYSUNIRESNAME)
    public void setPSSysUniResName(String pSSysUniResName){
        this.set(FIELD_PSSYSUNIRESNAME, pSSysUniResName);
    }
    
    /**
     * 获取 资源统一资源  
     * @return
     */
    @JsonIgnore
    public String getPSSysUniResName(){
        Object objValue = this.get(FIELD_PSSYSUNIRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 资源统一资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUniResNameDirty(){
        if(this.contains(FIELD_PSSYSUNIRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 资源统一资源
     */
    @JsonIgnore
    public void resetPSSysUniResName(){
        this.reset(FIELD_PSSYSUNIRESNAME);
    }

    /**
     * 设置 资源统一资源
     * <P>
     * 等同 {@link #setPSSysUniResName}
     * @param pSSysUniResName
     */
    @JsonIgnore
    public PSDETBItem pssysuniresname(String pSSysUniResName){
        this.setPSSysUniResName(pSSysUniResName);
        return this;
    }

    /**
     * <B>RAWCONTENT</B>&nbsp;直接内容，直接内容项内容类型为【直接内容】时指定直接内容，未指定时使用指定的系统资源定义内容
     * <P>
     * 字符串：最大长度 4000
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
    public PSDETBItem rawcontent(String rawContent){
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
    public PSDETBItem rawcssstyle(String rawCssStyle){
        this.setRawCssStyle(rawCssStyle);
        return this;
    }

    /**
     * <B>SHOWMODE</B>&nbsp;显示模式，指定工具栏项的显示模式，未定义时为【图标+短词】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.TBItemShowMode} 
     */
    public final static String FIELD_SHOWMODE = "showmode";

    /**
     * 设置 显示模式，详细说明：{@link #FIELD_SHOWMODE}
     * 
     * @param showMode
     * 
     */
    @JsonProperty(FIELD_SHOWMODE)
    public void setShowMode(String showMode){
        this.set(FIELD_SHOWMODE, showMode);
    }
    
    /**
     * 获取 显示模式  
     * @return
     */
    @JsonIgnore
    public String getShowMode(){
        Object objValue = this.get(FIELD_SHOWMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 显示模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isShowModeDirty(){
        if(this.contains(FIELD_SHOWMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 显示模式
     */
    @JsonIgnore
    public void resetShowMode(){
        this.reset(FIELD_SHOWMODE);
    }

    /**
     * 设置 显示模式，详细说明：{@link #FIELD_SHOWMODE}
     * <P>
     * 等同 {@link #setShowMode}
     * @param showMode
     */
    @JsonIgnore
    public PSDETBItem showmode(String showMode){
        this.setShowMode(showMode);
        return this;
    }

     /**
     * 设置 显示模式，详细说明：{@link #FIELD_SHOWMODE}
     * <P>
     * 等同 {@link #setShowMode}
     * @param showMode
     */
    @JsonIgnore
    public PSDETBItem showmode(net.ibizsys.psmodel.core.util.PSModelEnums.TBItemShowMode showMode){
        if(showMode == null){
            this.setShowMode(null);
        }
        else{
            this.setShowMode(showMode.value);
        }
        return this;
    }

    /**
     * <B>SPANFLAG</B>&nbsp;中间占位，分隔项指定是否作为中间内容延展占位，如是则分隔项后面的内容将从右侧排布。未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_SPANFLAG = "spanflag";

    /**
     * 设置 中间占位，详细说明：{@link #FIELD_SPANFLAG}
     * 
     * @param spanFlag
     * 
     */
    @JsonProperty(FIELD_SPANFLAG)
    public void setSpanFlag(Integer spanFlag){
        this.set(FIELD_SPANFLAG, spanFlag);
    }
    
    /**
     * 获取 中间占位  
     * @return
     */
    @JsonIgnore
    public Integer getSpanFlag(){
        Object objValue = this.get(FIELD_SPANFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 中间占位 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSpanFlagDirty(){
        if(this.contains(FIELD_SPANFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 中间占位
     */
    @JsonIgnore
    public void resetSpanFlag(){
        this.reset(FIELD_SPANFLAG);
    }

    /**
     * 设置 中间占位，详细说明：{@link #FIELD_SPANFLAG}
     * <P>
     * 等同 {@link #setSpanFlag}
     * @param spanFlag
     */
    @JsonIgnore
    public PSDETBItem spanflag(Integer spanFlag){
        this.setSpanFlag(spanFlag);
        return this;
    }

     /**
     * 设置 中间占位，详细说明：{@link #FIELD_SPANFLAG}
     * <P>
     * 等同 {@link #setSpanFlag}
     * @param spanFlag
     */
    @JsonIgnore
    public PSDETBItem spanflag(Boolean spanFlag){
        if(spanFlag == null){
            this.setSpanFlag(null);
        }
        else{
            this.setSpanFlag(spanFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>TBITEMTYPE</B>&nbsp;项类型，指定工具栏项的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.TBItemType} 
     */
    public final static String FIELD_TBITEMTYPE = "tbitemtype";

    /**
     * 设置 项类型，详细说明：{@link #FIELD_TBITEMTYPE}
     * 
     * @param tBItemType
     * 
     */
    @JsonProperty(FIELD_TBITEMTYPE)
    public void setTBItemType(String tBItemType){
        this.set(FIELD_TBITEMTYPE, tBItemType);
    }
    
    /**
     * 获取 项类型  
     * @return
     */
    @JsonIgnore
    public String getTBItemType(){
        Object objValue = this.get(FIELD_TBITEMTYPE);
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
    public boolean isTBItemTypeDirty(){
        if(this.contains(FIELD_TBITEMTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项类型
     */
    @JsonIgnore
    public void resetTBItemType(){
        this.reset(FIELD_TBITEMTYPE);
    }

    /**
     * 设置 项类型，详细说明：{@link #FIELD_TBITEMTYPE}
     * <P>
     * 等同 {@link #setTBItemType}
     * @param tBItemType
     */
    @JsonIgnore
    public PSDETBItem tbitemtype(String tBItemType){
        this.setTBItemType(tBItemType);
        return this;
    }

     /**
     * 设置 项类型，详细说明：{@link #FIELD_TBITEMTYPE}
     * <P>
     * 等同 {@link #setTBItemType}
     * @param tBItemType
     */
    @JsonIgnore
    public PSDETBItem tbitemtype(net.ibizsys.psmodel.core.util.PSModelEnums.TBItemType tBItemType){
        if(tBItemType == null){
            this.setTBItemType(null);
        }
        else{
            this.setTBItemType(tBItemType.value);
        }
        return this;
    }

    /**
     * <B>TEMPLATEMODE</B>&nbsp;模板模式，指定直接内容输出是否使用模板机制，默认为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_TEMPLATEMODE = "templatemode";

    /**
     * 设置 模板模式，详细说明：{@link #FIELD_TEMPLATEMODE}
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
     * 设置 模板模式，详细说明：{@link #FIELD_TEMPLATEMODE}
     * <P>
     * 等同 {@link #setTemplateMode}
     * @param templateMode
     */
    @JsonIgnore
    public PSDETBItem templatemode(Integer templateMode){
        this.setTemplateMode(templateMode);
        return this;
    }

     /**
     * 设置 模板模式，详细说明：{@link #FIELD_TEMPLATEMODE}
     * <P>
     * 等同 {@link #setTemplateMode}
     * @param templateMode
     */
    @JsonIgnore
    public PSDETBItem templatemode(Boolean templateMode){
        if(templateMode == null){
            this.setTemplateMode(null);
        }
        else{
            this.setTemplateMode(templateMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>TIPPSLANRESID</B>&nbsp;提示语言资源，指定工具栏项提示的多语言资源对象，未定义时界面行为项使用绑定界面行为的提示多语言资源对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_TIPPSLANRESID = "tippslanresid";

    /**
     * 设置 提示语言资源，详细说明：{@link #FIELD_TIPPSLANRESID}
     * 
     * @param tipPSLanResId
     * 
     */
    @JsonProperty(FIELD_TIPPSLANRESID)
    public void setTipPSLanResId(String tipPSLanResId){
        this.set(FIELD_TIPPSLANRESID, tipPSLanResId);
    }
    
    /**
     * 获取 提示语言资源  
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
     * 判断 提示语言资源 是否指定值，包括空值
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
     * 重置 提示语言资源
     */
    @JsonIgnore
    public void resetTipPSLanResId(){
        this.reset(FIELD_TIPPSLANRESID);
    }

    /**
     * 设置 提示语言资源，详细说明：{@link #FIELD_TIPPSLANRESID}
     * <P>
     * 等同 {@link #setTipPSLanResId}
     * @param tipPSLanResId
     */
    @JsonIgnore
    public PSDETBItem tippslanresid(String tipPSLanResId){
        this.setTipPSLanResId(tipPSLanResId);
        return this;
    }

    /**
     * 设置 提示语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTipPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSDETBItem tippslanresid(PSLanguageRes pSLanguageRes){
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
     * <B>TIPPSLANRESNAME</B>&nbsp;提示语言资源，指定工具栏项提示的多语言资源对象，未定义时界面行为项使用绑定界面行为的提示多语言资源对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TIPPSLANRESID}
     */
    public final static String FIELD_TIPPSLANRESNAME = "tippslanresname";

    /**
     * 设置 提示语言资源，详细说明：{@link #FIELD_TIPPSLANRESNAME}
     * 
     * @param tipPSLanResName
     * 
     */
    @JsonProperty(FIELD_TIPPSLANRESNAME)
    public void setTipPSLanResName(String tipPSLanResName){
        this.set(FIELD_TIPPSLANRESNAME, tipPSLanResName);
    }
    
    /**
     * 获取 提示语言资源  
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
     * 判断 提示语言资源 是否指定值，包括空值
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
     * 重置 提示语言资源
     */
    @JsonIgnore
    public void resetTipPSLanResName(){
        this.reset(FIELD_TIPPSLANRESNAME);
    }

    /**
     * 设置 提示语言资源，详细说明：{@link #FIELD_TIPPSLANRESNAME}
     * <P>
     * 等同 {@link #setTipPSLanResName}
     * @param tipPSLanResName
     */
    @JsonIgnore
    public PSDETBItem tippslanresname(String tipPSLanResName){
        this.setTipPSLanResName(tipPSLanResName);
        return this;
    }

    /**
     * <B>TOGGLEMODE</B>&nbsp;切换模式
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_TOGGLEMODE = "togglemode";

    /**
     * 设置 切换模式
     * 
     * @param toggleMode
     * 
     */
    @JsonProperty(FIELD_TOGGLEMODE)
    public void setToggleMode(String toggleMode){
        this.set(FIELD_TOGGLEMODE, toggleMode);
    }
    
    /**
     * 获取 切换模式  
     * @return
     */
    @JsonIgnore
    public String getToggleMode(){
        Object objValue = this.get(FIELD_TOGGLEMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 切换模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isToggleModeDirty(){
        if(this.contains(FIELD_TOGGLEMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 切换模式
     */
    @JsonIgnore
    public void resetToggleMode(){
        this.reset(FIELD_TOGGLEMODE);
    }

    /**
     * 设置 切换模式
     * <P>
     * 等同 {@link #setToggleMode}
     * @param toggleMode
     */
    @JsonIgnore
    public PSDETBItem togglemode(String toggleMode){
        this.setToggleMode(toggleMode);
        return this;
    }

    /**
     * <B>TOOLTIPINFO</B>&nbsp;提示信息，指定工具栏项的提示信息，未定义时界面行为项使用绑定界面行为的提示信息
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
    public PSDETBItem tooltipinfo(String tooltipInfo){
        this.setTooltipInfo(tooltipInfo);
        return this;
    }

    /**
     * <B>UIACTIONPARAMS</B>&nbsp;界面行为附加参数，额外指定界面行为项的界面行为参数
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_UIACTIONPARAMS = "uiactionparams";

    /**
     * 设置 界面行为附加参数，详细说明：{@link #FIELD_UIACTIONPARAMS}
     * 
     * @param uIActionParams
     * 
     */
    @JsonProperty(FIELD_UIACTIONPARAMS)
    public void setUIActionParams(String uIActionParams){
        this.set(FIELD_UIACTIONPARAMS, uIActionParams);
    }
    
    /**
     * 获取 界面行为附加参数  
     * @return
     */
    @JsonIgnore
    public String getUIActionParams(){
        Object objValue = this.get(FIELD_UIACTIONPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面行为附加参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUIActionParamsDirty(){
        if(this.contains(FIELD_UIACTIONPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面行为附加参数
     */
    @JsonIgnore
    public void resetUIActionParams(){
        this.reset(FIELD_UIACTIONPARAMS);
    }

    /**
     * 设置 界面行为附加参数，详细说明：{@link #FIELD_UIACTIONPARAMS}
     * <P>
     * 等同 {@link #setUIActionParams}
     * @param uIActionParams
     */
    @JsonIgnore
    public PSDETBItem uiactionparams(String uIActionParams){
        this.setUIActionParams(uIActionParams);
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
    public PSDETBItem updatedate(String updateDate){
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
    public PSDETBItem updateman(String updateMan){
        this.setUpdateMan(updateMan);
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
    public PSDETBItem userparams(String userParams){
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
    public PSDETBItem usertag(String userTag){
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
    public PSDETBItem usertag2(String userTag2){
        this.setUserTag2(userTag2);
        return this;
    }

    /**
     * <B>VISIBLELOGIC</B>&nbsp;可见逻辑
     */
    public final static String FIELD_VISIBLELOGIC = "visiblelogic";

    /**
     * 设置 可见逻辑
     * 
     * @param visibleLogic
     * 
     */
    @JsonProperty(FIELD_VISIBLELOGIC)
    public void setVisibleLogic(String visibleLogic){
        this.set(FIELD_VISIBLELOGIC, visibleLogic);
    }
    
    /**
     * 获取 可见逻辑  
     * @return
     */
    @JsonIgnore
    public String getVisibleLogic(){
        Object objValue = this.get(FIELD_VISIBLELOGIC);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 可见逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isVisibleLogicDirty(){
        if(this.contains(FIELD_VISIBLELOGIC)){
            return true;
        }
        return false;
    }

    /**
     * 重置 可见逻辑
     */
    @JsonIgnore
    public void resetVisibleLogic(){
        this.reset(FIELD_VISIBLELOGIC);
    }

    /**
     * 设置 可见逻辑
     * <P>
     * 等同 {@link #setVisibleLogic}
     * @param visibleLogic
     */
    @JsonIgnore
    public PSDETBItem visiblelogic(String visibleLogic){
        this.setVisibleLogic(visibleLogic);
        return this;
    }

    /**
     * <B>WIDTH</B>&nbsp;宽度，指定工具栏项的宽度，0为自动。未定义时为【0】
     */
    public final static String FIELD_WIDTH = "width";

    /**
     * 设置 宽度，详细说明：{@link #FIELD_WIDTH}
     * 
     * @param width
     * 
     */
    @JsonProperty(FIELD_WIDTH)
    public void setWidth(Double width){
        this.set(FIELD_WIDTH, width);
    }
    
    /**
     * 获取 宽度  
     * @return
     */
    @JsonIgnore
    public Double getWidth(){
        Object objValue = this.get(FIELD_WIDTH);
        if(objValue==null){
            return null;
        }
        return (Double)objValue;
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
     * 设置 宽度，详细说明：{@link #FIELD_WIDTH}
     * <P>
     * 等同 {@link #setWidth}
     * @param width
     */
    @JsonIgnore
    public PSDETBItem width(Double width){
        this.setWidth(width);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDETBItemId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDETBItemId(strValue);
    }

    @JsonIgnore
    public PSDETBItem id(String strValue){
        this.setPSDETBItemId(strValue);
        return this;
    }


    /**
     *  工具栏项 成员集合
     */
    public final static String FIELD_PSDETBITEMS = "psdetbitems";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSDETBItem> psdetbitems;

    /**
     * 获取 工具栏项 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDETBITEMS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDETBItem> getPSDETBItems(){
        return this.psdetbitems;
    }

    /**
     * 设置 工具栏项 成员集合  
     * @param psdetbitems
     */
    @JsonProperty(FIELD_PSDETBITEMS)
    public void setPSDETBItems(java.util.List<net.ibizsys.psmodel.core.domain.PSDETBItem> psdetbitems){
        this.psdetbitems = psdetbitems;
    }

    /**
     * 获取 工具栏项 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDETBItem> getPSDETBItemsIf(){
        if(this.psdetbitems == null){
            this.psdetbitems = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSDETBItem>();          
        }
        return this.psdetbitems;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDETBItem){
            PSDETBItem model = (PSDETBItem)iPSModel;
            model.setPSDETBItems(this.getPSDETBItems());
        }
        super.copyTo(iPSModel);
    }
}
