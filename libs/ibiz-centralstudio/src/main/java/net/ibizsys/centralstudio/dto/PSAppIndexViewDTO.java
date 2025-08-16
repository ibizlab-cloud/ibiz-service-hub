package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSAPPINDEXVIEW</B>应用首页视图 模型传输对象
 * <P>
 * 应用首页视图模型，应用首页视图一般作为应用的起始视图，加载主菜单，提供应用功能的入口
 */
public class PSAppIndexViewDTO extends PSAppViewDTO {

    public PSAppIndexViewDTO(){
        this.setPSAppViewType("APPINDEXVIEW");
    }      

    /**
     * <B>APPICONPATH</B>&nbsp;应用图标路径，指定应用首页视图的图标路径
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_APPICONPATH = "appiconpath";

    /**
     * 设置 应用图标路径，详细说明：{@link #FIELD_APPICONPATH}
     * 
     * @param appIconPath
     * 
     */
    @JsonProperty(FIELD_APPICONPATH)
    public void setAppIconPath(String appIconPath){
        this.set(FIELD_APPICONPATH, appIconPath);
    }
    
    /**
     * 获取 应用图标路径  
     * @return
     */
    @JsonIgnore
    public String getAppIconPath(){
        Object objValue = this.get(FIELD_APPICONPATH);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用图标路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAppIconPathDirty(){
        if(this.contains(FIELD_APPICONPATH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用图标路径
     */
    @JsonIgnore
    public void resetAppIconPath(){
        this.reset(FIELD_APPICONPATH);
    }

    /**
     * 设置 应用图标路径，详细说明：{@link #FIELD_APPICONPATH}
     * <P>
     * 等同 {@link #setAppIconPath}
     * @param appIconPath
     */
    @JsonIgnore
    public PSAppIndexViewDTO appiconpath(String appIconPath){
        this.setAppIconPath(appIconPath);
        return this;
    }

    /**
     * <B>APPICONPATH2</B>&nbsp;应用图标路径2，指定应用首页视图的图标路径2
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_APPICONPATH2 = "appiconpath2";

    /**
     * 设置 应用图标路径2，详细说明：{@link #FIELD_APPICONPATH2}
     * 
     * @param appIconPath2
     * 
     */
    @JsonProperty(FIELD_APPICONPATH2)
    public void setAppIconPath2(String appIconPath2){
        this.set(FIELD_APPICONPATH2, appIconPath2);
    }
    
    /**
     * 获取 应用图标路径2  
     * @return
     */
    @JsonIgnore
    public String getAppIconPath2(){
        Object objValue = this.get(FIELD_APPICONPATH2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用图标路径2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAppIconPath2Dirty(){
        if(this.contains(FIELD_APPICONPATH2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用图标路径2
     */
    @JsonIgnore
    public void resetAppIconPath2(){
        this.reset(FIELD_APPICONPATH2);
    }

    /**
     * 设置 应用图标路径2，详细说明：{@link #FIELD_APPICONPATH2}
     * <P>
     * 等同 {@link #setAppIconPath2}
     * @param appIconPath2
     */
    @JsonIgnore
    public PSAppIndexViewDTO appiconpath2(String appIconPath2){
        this.setAppIconPath2(appIconPath2);
        return this;
    }

    /**
     * <B>APPSWITCHMODE</B>&nbsp;应用选择器模式，指定应用首页视图的应用选择器模式，未定义时为【无】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.AppSwitchMode} 
     */
    public final static String FIELD_APPSWITCHMODE = "appswitchmode";

    /**
     * 设置 应用选择器模式，详细说明：{@link #FIELD_APPSWITCHMODE}
     * 
     * @param appSwitchMode
     * 
     */
    @JsonProperty(FIELD_APPSWITCHMODE)
    public void setAppSwitchMode(Integer appSwitchMode){
        this.set(FIELD_APPSWITCHMODE, appSwitchMode);
    }
    
    /**
     * 获取 应用选择器模式  
     * @return
     */
    @JsonIgnore
    public Integer getAppSwitchMode(){
        Object objValue = this.get(FIELD_APPSWITCHMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 应用选择器模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAppSwitchModeDirty(){
        if(this.contains(FIELD_APPSWITCHMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用选择器模式
     */
    @JsonIgnore
    public void resetAppSwitchMode(){
        this.reset(FIELD_APPSWITCHMODE);
    }

    /**
     * 设置 应用选择器模式，详细说明：{@link #FIELD_APPSWITCHMODE}
     * <P>
     * 等同 {@link #setAppSwitchMode}
     * @param appSwitchMode
     */
    @JsonIgnore
    public PSAppIndexViewDTO appswitchmode(Integer appSwitchMode){
        this.setAppSwitchMode(appSwitchMode);
        return this;
    }

     /**
     * 设置 应用选择器模式，详细说明：{@link #FIELD_APPSWITCHMODE}
     * <P>
     * 等同 {@link #setAppSwitchMode}
     * @param appSwitchMode
     */
    @JsonIgnore
    public PSAppIndexViewDTO appswitchmode(net.ibizsys.model.PSModelEnums.AppSwitchMode appSwitchMode){
        if(appSwitchMode == null){
            this.setAppSwitchMode(null);
        }
        else{
            this.setAppSwitchMode(appSwitchMode.value);
        }
        return this;
    }

    /**
     * <B>BLANKMODE</B>&nbsp;空白首页模式，指定应用首页视图是否为空白首页模式，空白首页作为实际内容视图的容器，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_BLANKMODE = "blankmode";

    /**
     * 设置 空白首页模式，详细说明：{@link #FIELD_BLANKMODE}
     * 
     * @param blankMode
     * 
     */
    @JsonProperty(FIELD_BLANKMODE)
    public void setBlankMode(Integer blankMode){
        this.set(FIELD_BLANKMODE, blankMode);
    }
    
    /**
     * 获取 空白首页模式  
     * @return
     */
    @JsonIgnore
    public Integer getBlankMode(){
        Object objValue = this.get(FIELD_BLANKMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 空白首页模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBlankModeDirty(){
        if(this.contains(FIELD_BLANKMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 空白首页模式
     */
    @JsonIgnore
    public void resetBlankMode(){
        this.reset(FIELD_BLANKMODE);
    }

    /**
     * 设置 空白首页模式，详细说明：{@link #FIELD_BLANKMODE}
     * <P>
     * 等同 {@link #setBlankMode}
     * @param blankMode
     */
    @JsonIgnore
    public PSAppIndexViewDTO blankmode(Integer blankMode){
        this.setBlankMode(blankMode);
        return this;
    }

     /**
     * 设置 空白首页模式，详细说明：{@link #FIELD_BLANKMODE}
     * <P>
     * 等同 {@link #setBlankMode}
     * @param blankMode
     */
    @JsonIgnore
    public PSAppIndexViewDTO blankmode(Boolean blankMode){
        if(blankMode == null){
            this.setBlankMode(null);
        }
        else{
            this.setBlankMode(blankMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setCreateDate(Timestamp createDate){
        this.set(FIELD_CREATEDATE, createDate);
    }
    
    /**
     * 获取 建立时间  
     * @return
     */
    @JsonIgnore
    public Timestamp getCreateDate(){
        Object objValue = this.get(FIELD_CREATEDATE);
        if(objValue==null){
            return null;
        }
        return (Timestamp)objValue;
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
    public PSAppIndexViewDTO createdate(Timestamp createDate){
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
    public PSAppIndexViewDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DEFAULTPAGE</B>&nbsp;系统默认页，指定应用首页视图是否为所属应用的默认页，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEFAULTPAGE = "defaultpage";

    /**
     * 设置 系统默认页，详细说明：{@link #FIELD_DEFAULTPAGE}
     * 
     * @param defaultPage
     * 
     */
    @JsonProperty(FIELD_DEFAULTPAGE)
    public void setDefaultPage(Integer defaultPage){
        this.set(FIELD_DEFAULTPAGE, defaultPage);
    }
    
    /**
     * 获取 系统默认页  
     * @return
     */
    @JsonIgnore
    public Integer getDefaultPage(){
        Object objValue = this.get(FIELD_DEFAULTPAGE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 系统默认页 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefaultPageDirty(){
        if(this.contains(FIELD_DEFAULTPAGE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统默认页
     */
    @JsonIgnore
    public void resetDefaultPage(){
        this.reset(FIELD_DEFAULTPAGE);
    }

    /**
     * 设置 系统默认页，详细说明：{@link #FIELD_DEFAULTPAGE}
     * <P>
     * 等同 {@link #setDefaultPage}
     * @param defaultPage
     */
    @JsonIgnore
    public PSAppIndexViewDTO defaultpage(Integer defaultPage){
        this.setDefaultPage(defaultPage);
        return this;
    }

     /**
     * 设置 系统默认页，详细说明：{@link #FIELD_DEFAULTPAGE}
     * <P>
     * 等同 {@link #setDefaultPage}
     * @param defaultPage
     */
    @JsonIgnore
    public PSAppIndexViewDTO defaultpage(Boolean defaultPage){
        if(defaultPage == null){
            this.setDefaultPage(null);
        }
        else{
            this.setDefaultPage(defaultPage?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DEFPSAPPVIEWID</B>&nbsp;默认视图，指定应用首页视图默认加载的应用视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSAppViewDTO} 
     */
    public final static String FIELD_DEFPSAPPVIEWID = "defpsappviewid";

    /**
     * 设置 默认视图，详细说明：{@link #FIELD_DEFPSAPPVIEWID}
     * 
     * @param defPSAppViewId
     * 
     */
    @JsonProperty(FIELD_DEFPSAPPVIEWID)
    public void setDefPSAppViewId(String defPSAppViewId){
        this.set(FIELD_DEFPSAPPVIEWID, defPSAppViewId);
    }
    
    /**
     * 获取 默认视图  
     * @return
     */
    @JsonIgnore
    public String getDefPSAppViewId(){
        Object objValue = this.get(FIELD_DEFPSAPPVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefPSAppViewIdDirty(){
        if(this.contains(FIELD_DEFPSAPPVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认视图
     */
    @JsonIgnore
    public void resetDefPSAppViewId(){
        this.reset(FIELD_DEFPSAPPVIEWID);
    }

    /**
     * 设置 默认视图，详细说明：{@link #FIELD_DEFPSAPPVIEWID}
     * <P>
     * 等同 {@link #setDefPSAppViewId}
     * @param defPSAppViewId
     */
    @JsonIgnore
    public PSAppIndexViewDTO defpsappviewid(String defPSAppViewId){
        this.setDefPSAppViewId(defPSAppViewId);
        return this;
    }

    /**
     * 设置 默认视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDefPSAppViewId}
     * @param pSAppView 引用对象
     */
    @JsonIgnore
    public PSAppIndexViewDTO defpsappviewid(PSAppViewDTO pSAppView){
        if(pSAppView == null){
            this.setDefPSAppViewId(null);
            this.setDefPSAppViewName(null);
        }
        else{
            this.setDefPSAppViewId(pSAppView.getPSAppViewId());
            this.setDefPSAppViewName(pSAppView.getPSAppViewName());
        }
        return this;
    }

    /**
     * <B>DEFPSAPPVIEWNAME</B>&nbsp;默认视图，指定应用首页视图默认加载的应用视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DEFPSAPPVIEWID}
     */
    public final static String FIELD_DEFPSAPPVIEWNAME = "defpsappviewname";

    /**
     * 设置 默认视图，详细说明：{@link #FIELD_DEFPSAPPVIEWNAME}
     * 
     * @param defPSAppViewName
     * 
     */
    @JsonProperty(FIELD_DEFPSAPPVIEWNAME)
    public void setDefPSAppViewName(String defPSAppViewName){
        this.set(FIELD_DEFPSAPPVIEWNAME, defPSAppViewName);
    }
    
    /**
     * 获取 默认视图  
     * @return
     */
    @JsonIgnore
    public String getDefPSAppViewName(){
        Object objValue = this.get(FIELD_DEFPSAPPVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefPSAppViewNameDirty(){
        if(this.contains(FIELD_DEFPSAPPVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认视图
     */
    @JsonIgnore
    public void resetDefPSAppViewName(){
        this.reset(FIELD_DEFPSAPPVIEWNAME);
    }

    /**
     * 设置 默认视图，详细说明：{@link #FIELD_DEFPSAPPVIEWNAME}
     * <P>
     * 等同 {@link #setDefPSAppViewName}
     * @param defPSAppViewName
     */
    @JsonIgnore
    public PSAppIndexViewDTO defpsappviewname(String defPSAppViewName){
        this.setDefPSAppViewName(defPSAppViewName);
        return this;
    }

    /**
     * <B>ENABLECOUNTER</B>&nbsp;启用计数器，指定应用首页视图是否启用界面计数器，未定义时为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLECOUNTER = "enablecounter";

    /**
     * 设置 启用计数器，详细说明：{@link #FIELD_ENABLECOUNTER}
     * 
     * @param enableCounter
     * 
     */
    @JsonProperty(FIELD_ENABLECOUNTER)
    public void setEnableCounter(Integer enableCounter){
        this.set(FIELD_ENABLECOUNTER, enableCounter);
    }
    
    /**
     * 获取 启用计数器  
     * @return
     */
    @JsonIgnore
    public Integer getEnableCounter(){
        Object objValue = this.get(FIELD_ENABLECOUNTER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用计数器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableCounterDirty(){
        if(this.contains(FIELD_ENABLECOUNTER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用计数器
     */
    @JsonIgnore
    public void resetEnableCounter(){
        this.reset(FIELD_ENABLECOUNTER);
    }

    /**
     * 设置 启用计数器，详细说明：{@link #FIELD_ENABLECOUNTER}
     * <P>
     * 等同 {@link #setEnableCounter}
     * @param enableCounter
     */
    @JsonIgnore
    public PSAppIndexViewDTO enablecounter(Integer enableCounter){
        this.setEnableCounter(enableCounter);
        return this;
    }

     /**
     * 设置 启用计数器，详细说明：{@link #FIELD_ENABLECOUNTER}
     * <P>
     * 等同 {@link #setEnableCounter}
     * @param enableCounter
     */
    @JsonIgnore
    public PSAppIndexViewDTO enablecounter(Boolean enableCounter){
        if(enableCounter == null){
            this.setEnableCounter(null);
        }
        else{
            this.setEnableCounter(enableCounter?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>MAINMENUSIDE</B>&nbsp;菜单方向，指定应用首页视图主菜单的方向
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.AppIndexViewMenuAlign} 
     */
    public final static String FIELD_MAINMENUSIDE = "mainmenuside";

    /**
     * 设置 菜单方向，详细说明：{@link #FIELD_MAINMENUSIDE}
     * 
     * @param mainMenuSide
     * 
     */
    @JsonProperty(FIELD_MAINMENUSIDE)
    public void setMainMenuSide(String mainMenuSide){
        this.set(FIELD_MAINMENUSIDE, mainMenuSide);
    }
    
    /**
     * 获取 菜单方向  
     * @return
     */
    @JsonIgnore
    public String getMainMenuSide(){
        Object objValue = this.get(FIELD_MAINMENUSIDE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 菜单方向 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMainMenuSideDirty(){
        if(this.contains(FIELD_MAINMENUSIDE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 菜单方向
     */
    @JsonIgnore
    public void resetMainMenuSide(){
        this.reset(FIELD_MAINMENUSIDE);
    }

    /**
     * 设置 菜单方向，详细说明：{@link #FIELD_MAINMENUSIDE}
     * <P>
     * 等同 {@link #setMainMenuSide}
     * @param mainMenuSide
     */
    @JsonIgnore
    public PSAppIndexViewDTO mainmenuside(String mainMenuSide){
        this.setMainMenuSide(mainMenuSide);
        return this;
    }

     /**
     * 设置 菜单方向，详细说明：{@link #FIELD_MAINMENUSIDE}
     * <P>
     * 等同 {@link #setMainMenuSide}
     * @param mainMenuSide
     */
    @JsonIgnore
    public PSAppIndexViewDTO mainmenuside(net.ibizsys.model.PSModelEnums.AppIndexViewMenuAlign mainMenuSide){
        if(mainMenuSide == null){
            this.setMainMenuSide(null);
        }
        else{
            this.setMainMenuSide(mainMenuSide.value);
        }
        return this;
    }

    /**
     * <B>PSAPPINDEXVIEWID</B>&nbsp;应用首页视图标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSAPPINDEXVIEWID = "psappindexviewid";

    /**
     * 设置 应用首页视图标识
     * 
     * @param pSAppIndexViewId
     * 
     */
    @JsonProperty(FIELD_PSAPPINDEXVIEWID)
    public void setPSAppIndexViewId(String pSAppIndexViewId){
        this.set(FIELD_PSAPPINDEXVIEWID, pSAppIndexViewId);
        this.set(FIELD_PSAPPVIEWID, pSAppIndexViewId);        
    }
    
    /**
     * 获取 应用首页视图标识  
     * @return
     */
    @JsonIgnore
    public String getPSAppIndexViewId(){
        Object objValue = this.get(FIELD_PSAPPINDEXVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用首页视图标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppIndexViewIdDirty(){
        if(this.contains(FIELD_PSAPPINDEXVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用首页视图标识
     */
    @JsonIgnore
    public void resetPSAppIndexViewId(){
        this.reset(FIELD_PSAPPINDEXVIEWID);
        this.reset(FIELD_PSAPPVIEWID);        
    }

    /**
     * 设置 应用首页视图标识
     * <P>
     * 等同 {@link #setPSAppIndexViewId}
     * @param pSAppIndexViewId
     */
    @JsonIgnore
    public PSAppIndexViewDTO psappindexviewid(String pSAppIndexViewId){
        this.setPSAppIndexViewId(pSAppIndexViewId);
        return this;
    }

    /**
     * <B>PSAPPINDEXVIEWNAME</B>&nbsp;代码标识，指定应用首页视图的代码标识，需在所在前端应用中具备唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSAPPINDEXVIEWNAME = "psappindexviewname";

    /**
     * 设置 代码标识，详细说明：{@link #FIELD_PSAPPINDEXVIEWNAME}
     * 
     * @param pSAppIndexViewName
     * 
     */
    @JsonProperty(FIELD_PSAPPINDEXVIEWNAME)
    public void setPSAppIndexViewName(String pSAppIndexViewName){
        this.set(FIELD_PSAPPINDEXVIEWNAME, pSAppIndexViewName);
        this.set(FIELD_PSAPPVIEWNAME, pSAppIndexViewName);        
    }
    
    /**
     * 获取 代码标识  
     * @return
     */
    @JsonIgnore
    public String getPSAppIndexViewName(){
        Object objValue = this.get(FIELD_PSAPPINDEXVIEWNAME);
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
    public boolean isPSAppIndexViewNameDirty(){
        if(this.contains(FIELD_PSAPPINDEXVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码标识
     */
    @JsonIgnore
    public void resetPSAppIndexViewName(){
        this.reset(FIELD_PSAPPINDEXVIEWNAME);
        this.reset(FIELD_PSAPPVIEWNAME);        
    }

    /**
     * 设置 代码标识，详细说明：{@link #FIELD_PSAPPINDEXVIEWNAME}
     * <P>
     * 等同 {@link #setPSAppIndexViewName}
     * @param pSAppIndexViewName
     */
    @JsonIgnore
    public PSAppIndexViewDTO psappindexviewname(String pSAppIndexViewName){
        this.setPSAppIndexViewName(pSAppIndexViewName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSAppIndexViewName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSAppIndexViewName(strName);
    }

    @JsonIgnore
    public PSAppIndexViewDTO name(String strName){
        this.setPSAppIndexViewName(strName);
        return this;
    }

    /**
     * <B>PSAPPMENUID</B>&nbsp;应用菜单，指定应用首页视图加载的应用菜单
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSAppMenuDTO} 
     */
    public final static String FIELD_PSAPPMENUID = "psappmenuid";

    /**
     * 设置 应用菜单，详细说明：{@link #FIELD_PSAPPMENUID}
     * 
     * @param pSAppMenuId
     * 
     */
    @JsonProperty(FIELD_PSAPPMENUID)
    public void setPSAppMenuId(String pSAppMenuId){
        this.set(FIELD_PSAPPMENUID, pSAppMenuId);
    }
    
    /**
     * 获取 应用菜单  
     * @return
     */
    @JsonIgnore
    public String getPSAppMenuId(){
        Object objValue = this.get(FIELD_PSAPPMENUID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用菜单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppMenuIdDirty(){
        if(this.contains(FIELD_PSAPPMENUID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用菜单
     */
    @JsonIgnore
    public void resetPSAppMenuId(){
        this.reset(FIELD_PSAPPMENUID);
    }

    /**
     * 设置 应用菜单，详细说明：{@link #FIELD_PSAPPMENUID}
     * <P>
     * 等同 {@link #setPSAppMenuId}
     * @param pSAppMenuId
     */
    @JsonIgnore
    public PSAppIndexViewDTO psappmenuid(String pSAppMenuId){
        this.setPSAppMenuId(pSAppMenuId);
        return this;
    }

    /**
     * 设置 应用菜单，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSAppMenuId}
     * @param pSAppMenu 引用对象
     */
    @JsonIgnore
    public PSAppIndexViewDTO psappmenuid(PSAppMenuDTO pSAppMenu){
        if(pSAppMenu == null){
            this.setPSAppMenuId(null);
            this.setPSAppMenuName(null);
        }
        else{
            this.setPSAppMenuId(pSAppMenu.getPSAppMenuId());
            this.setPSAppMenuName(pSAppMenu.getPSAppMenuName());
        }
        return this;
    }

    /**
     * <B>PSAPPMENUNAME</B>&nbsp;应用菜单，指定应用首页视图加载的应用菜单
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSAPPMENUID}
     */
    public final static String FIELD_PSAPPMENUNAME = "psappmenuname";

    /**
     * 设置 应用菜单，详细说明：{@link #FIELD_PSAPPMENUNAME}
     * 
     * @param pSAppMenuName
     * 
     */
    @JsonProperty(FIELD_PSAPPMENUNAME)
    public void setPSAppMenuName(String pSAppMenuName){
        this.set(FIELD_PSAPPMENUNAME, pSAppMenuName);
    }
    
    /**
     * 获取 应用菜单  
     * @return
     */
    @JsonIgnore
    public String getPSAppMenuName(){
        Object objValue = this.get(FIELD_PSAPPMENUNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用菜单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppMenuNameDirty(){
        if(this.contains(FIELD_PSAPPMENUNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用菜单
     */
    @JsonIgnore
    public void resetPSAppMenuName(){
        this.reset(FIELD_PSAPPMENUNAME);
    }

    /**
     * 设置 应用菜单，详细说明：{@link #FIELD_PSAPPMENUNAME}
     * <P>
     * 等同 {@link #setPSAppMenuName}
     * @param pSAppMenuName
     */
    @JsonIgnore
    public PSAppIndexViewDTO psappmenuname(String pSAppMenuName){
        this.setPSAppMenuName(pSAppMenuName);
        return this;
    }

    /**
     * <B>PSSYSCOUNTERID</B>&nbsp;界面计数器，指定应用首页视图加载的界面计数器
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysCounterDTO} 
     */
    public final static String FIELD_PSSYSCOUNTERID = "pssyscounterid";

    /**
     * 设置 界面计数器，详细说明：{@link #FIELD_PSSYSCOUNTERID}
     * 
     * @param pSSysCounterId
     * 
     */
    @JsonProperty(FIELD_PSSYSCOUNTERID)
    public void setPSSysCounterId(String pSSysCounterId){
        this.set(FIELD_PSSYSCOUNTERID, pSSysCounterId);
    }
    
    /**
     * 获取 界面计数器  
     * @return
     */
    @JsonIgnore
    public String getPSSysCounterId(){
        Object objValue = this.get(FIELD_PSSYSCOUNTERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面计数器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCounterIdDirty(){
        if(this.contains(FIELD_PSSYSCOUNTERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面计数器
     */
    @JsonIgnore
    public void resetPSSysCounterId(){
        this.reset(FIELD_PSSYSCOUNTERID);
    }

    /**
     * 设置 界面计数器，详细说明：{@link #FIELD_PSSYSCOUNTERID}
     * <P>
     * 等同 {@link #setPSSysCounterId}
     * @param pSSysCounterId
     */
    @JsonIgnore
    public PSAppIndexViewDTO pssyscounterid(String pSSysCounterId){
        this.setPSSysCounterId(pSSysCounterId);
        return this;
    }

    /**
     * 设置 界面计数器，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCounterId}
     * @param pSSysCounter 引用对象
     */
    @JsonIgnore
    public PSAppIndexViewDTO pssyscounterid(PSSysCounterDTO pSSysCounter){
        if(pSSysCounter == null){
            this.setPSSysCounterId(null);
            this.setPSSysCounterName(null);
        }
        else{
            this.setPSSysCounterId(pSSysCounter.getPSSysCounterId());
            this.setPSSysCounterName(pSSysCounter.getPSSysCounterName());
        }
        return this;
    }

    /**
     * <B>PSSYSCOUNTERNAME</B>&nbsp;界面计数器，指定应用首页视图加载的界面计数器
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSCOUNTERID}
     */
    public final static String FIELD_PSSYSCOUNTERNAME = "pssyscountername";

    /**
     * 设置 界面计数器，详细说明：{@link #FIELD_PSSYSCOUNTERNAME}
     * 
     * @param pSSysCounterName
     * 
     */
    @JsonProperty(FIELD_PSSYSCOUNTERNAME)
    public void setPSSysCounterName(String pSSysCounterName){
        this.set(FIELD_PSSYSCOUNTERNAME, pSSysCounterName);
    }
    
    /**
     * 获取 界面计数器  
     * @return
     */
    @JsonIgnore
    public String getPSSysCounterName(){
        Object objValue = this.get(FIELD_PSSYSCOUNTERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面计数器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCounterNameDirty(){
        if(this.contains(FIELD_PSSYSCOUNTERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面计数器
     */
    @JsonIgnore
    public void resetPSSysCounterName(){
        this.reset(FIELD_PSSYSCOUNTERNAME);
    }

    /**
     * 设置 界面计数器，详细说明：{@link #FIELD_PSSYSCOUNTERNAME}
     * <P>
     * 等同 {@link #setPSSysCounterName}
     * @param pSSysCounterName
     */
    @JsonIgnore
    public PSAppIndexViewDTO pssyscountername(String pSSysCounterName){
        this.setPSSysCounterName(pSSysCounterName);
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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setUpdateDate(Timestamp updateDate){
        this.set(FIELD_UPDATEDATE, updateDate);
    }
    
    /**
     * 获取 更新时间  
     * @return
     */
    @JsonIgnore
    public Timestamp getUpdateDate(){
        Object objValue = this.get(FIELD_UPDATEDATE);
        if(objValue==null){
            return null;
        }
        return (Timestamp)objValue;
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
    public PSAppIndexViewDTO updatedate(Timestamp updateDate){
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
    public PSAppIndexViewDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSAppIndexViewId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSAppIndexViewId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSAppIndexViewId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSAppIndexViewId(strValue);
    }

    @JsonIgnore
    public PSAppIndexViewDTO id(String strValue){
        this.setPSAppIndexViewId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSAppIndexViewDTO){
            PSAppIndexViewDTO dto = (PSAppIndexViewDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
