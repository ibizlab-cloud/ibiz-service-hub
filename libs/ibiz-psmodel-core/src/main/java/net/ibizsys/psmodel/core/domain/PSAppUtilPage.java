package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSAPPUTILPAGE</B>应用功能页面 模型传输对象
 * <P>
 * 应用功能页面模型，定义前端应用中使用的功能页面（路径）
 */
public class PSAppUtilPage extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSAppUtilPage(){
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码名称
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_CODENAME = "codename";

    /**
     * 设置 代码名称
     * 
     * @param codeName
     * 
     */
    @JsonProperty(FIELD_CODENAME)
    public void setCodeName(String codeName){
        this.set(FIELD_CODENAME, codeName);
    }
    
    /**
     * 获取 代码名称  
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
     * 判断 代码名称 是否指定值，包括空值
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
     * 重置 代码名称
     */
    @JsonIgnore
    public void resetCodeName(){
        this.reset(FIELD_CODENAME);
    }

    /**
     * 设置 代码名称
     * <P>
     * 等同 {@link #setCodeName}
     * @param codeName
     */
    @JsonIgnore
    public PSAppUtilPage codename(String codeName){
        this.setCodeName(codeName);
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
    public PSAppUtilPage createdate(String createDate){
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
    public PSAppUtilPage createman(String createMan){
        this.setCreateMan(createMan);
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
    public PSAppUtilPage memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PAGEURL</B>&nbsp;页面路径，指定应用功能页面的路径
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_PAGEURL = "pageurl";

    /**
     * 设置 页面路径，详细说明：{@link #FIELD_PAGEURL}
     * 
     * @param pageUrl
     * 
     */
    @JsonProperty(FIELD_PAGEURL)
    public void setPageUrl(String pageUrl){
        this.set(FIELD_PAGEURL, pageUrl);
    }
    
    /**
     * 获取 页面路径  
     * @return
     */
    @JsonIgnore
    public String getPageUrl(){
        Object objValue = this.get(FIELD_PAGEURL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 页面路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPageUrlDirty(){
        if(this.contains(FIELD_PAGEURL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 页面路径
     */
    @JsonIgnore
    public void resetPageUrl(){
        this.reset(FIELD_PAGEURL);
    }

    /**
     * 设置 页面路径，详细说明：{@link #FIELD_PAGEURL}
     * <P>
     * 等同 {@link #setPageUrl}
     * @param pageUrl
     */
    @JsonIgnore
    public PSAppUtilPage pageurl(String pageUrl){
        this.setPageUrl(pageUrl);
        return this;
    }

    /**
     * <B>PSAPPUTILPAGEID</B>&nbsp;应用功能页面标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSAPPUTILPAGEID = "psapputilpageid";

    /**
     * 设置 应用功能页面标识
     * 
     * @param pSAppUtilPageId
     * 
     */
    @JsonProperty(FIELD_PSAPPUTILPAGEID)
    public void setPSAppUtilPageId(String pSAppUtilPageId){
        this.set(FIELD_PSAPPUTILPAGEID, pSAppUtilPageId);
    }
    
    /**
     * 获取 应用功能页面标识  
     * @return
     */
    @JsonIgnore
    public String getPSAppUtilPageId(){
        Object objValue = this.get(FIELD_PSAPPUTILPAGEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用功能页面标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppUtilPageIdDirty(){
        if(this.contains(FIELD_PSAPPUTILPAGEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用功能页面标识
     */
    @JsonIgnore
    public void resetPSAppUtilPageId(){
        this.reset(FIELD_PSAPPUTILPAGEID);
    }

    /**
     * 设置 应用功能页面标识
     * <P>
     * 等同 {@link #setPSAppUtilPageId}
     * @param pSAppUtilPageId
     */
    @JsonIgnore
    public PSAppUtilPage psapputilpageid(String pSAppUtilPageId){
        this.setPSAppUtilPageId(pSAppUtilPageId);
        return this;
    }

    /**
     * <B>PSAPPUTILPAGENAME</B>&nbsp;功能页面，指定应用功能页面的类型，需在所在前端应用中具备唯一性
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.AppUtilPage} 
     */
    public final static String FIELD_PSAPPUTILPAGENAME = "psapputilpagename";

    /**
     * 设置 功能页面，详细说明：{@link #FIELD_PSAPPUTILPAGENAME}
     * 
     * @param pSAppUtilPageName
     * 
     */
    @JsonProperty(FIELD_PSAPPUTILPAGENAME)
    public void setPSAppUtilPageName(String pSAppUtilPageName){
        this.set(FIELD_PSAPPUTILPAGENAME, pSAppUtilPageName);
    }
    
    /**
     * 获取 功能页面  
     * @return
     */
    @JsonIgnore
    public String getPSAppUtilPageName(){
        Object objValue = this.get(FIELD_PSAPPUTILPAGENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能页面 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppUtilPageNameDirty(){
        if(this.contains(FIELD_PSAPPUTILPAGENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能页面
     */
    @JsonIgnore
    public void resetPSAppUtilPageName(){
        this.reset(FIELD_PSAPPUTILPAGENAME);
    }

    /**
     * 设置 功能页面，详细说明：{@link #FIELD_PSAPPUTILPAGENAME}
     * <P>
     * 等同 {@link #setPSAppUtilPageName}
     * @param pSAppUtilPageName
     */
    @JsonIgnore
    public PSAppUtilPage psapputilpagename(String pSAppUtilPageName){
        this.setPSAppUtilPageName(pSAppUtilPageName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSAppUtilPageName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSAppUtilPageName(strName);
    }

    @JsonIgnore
    public PSAppUtilPage name(String strName){
        this.setPSAppUtilPageName(strName);
        return this;
    }

    /**
     * <B>PSAPPVIEWID</B>&nbsp;绑定应用视图，指定应用功能页面绑定的应用视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSAppView} 
     */
    public final static String FIELD_PSAPPVIEWID = "psappviewid";

    /**
     * 设置 绑定应用视图，详细说明：{@link #FIELD_PSAPPVIEWID}
     * 
     * @param pSAppViewId
     * 
     */
    @JsonProperty(FIELD_PSAPPVIEWID)
    public void setPSAppViewId(String pSAppViewId){
        this.set(FIELD_PSAPPVIEWID, pSAppViewId);
    }
    
    /**
     * 获取 绑定应用视图  
     * @return
     */
    @JsonIgnore
    public String getPSAppViewId(){
        Object objValue = this.get(FIELD_PSAPPVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 绑定应用视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppViewIdDirty(){
        if(this.contains(FIELD_PSAPPVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 绑定应用视图
     */
    @JsonIgnore
    public void resetPSAppViewId(){
        this.reset(FIELD_PSAPPVIEWID);
    }

    /**
     * 设置 绑定应用视图，详细说明：{@link #FIELD_PSAPPVIEWID}
     * <P>
     * 等同 {@link #setPSAppViewId}
     * @param pSAppViewId
     */
    @JsonIgnore
    public PSAppUtilPage psappviewid(String pSAppViewId){
        this.setPSAppViewId(pSAppViewId);
        return this;
    }

    /**
     * 设置 绑定应用视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSAppViewId}
     * @param pSAppView 引用对象
     */
    @JsonIgnore
    public PSAppUtilPage psappviewid(PSAppView pSAppView){
        if(pSAppView == null){
            this.setPSAppViewId(null);
            this.setPSAppViewName(null);
        }
        else{
            this.setPSAppViewId(pSAppView.getPSAppViewId());
            this.setPSAppViewName(pSAppView.getPSAppViewName());
        }
        return this;
    }

    /**
     * <B>PSAPPVIEWNAME</B>&nbsp;绑定应用视图，指定应用功能页面绑定的应用视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSAPPVIEWID}
     */
    public final static String FIELD_PSAPPVIEWNAME = "psappviewname";

    /**
     * 设置 绑定应用视图，详细说明：{@link #FIELD_PSAPPVIEWNAME}
     * 
     * @param pSAppViewName
     * 
     */
    @JsonProperty(FIELD_PSAPPVIEWNAME)
    public void setPSAppViewName(String pSAppViewName){
        this.set(FIELD_PSAPPVIEWNAME, pSAppViewName);
    }
    
    /**
     * 获取 绑定应用视图  
     * @return
     */
    @JsonIgnore
    public String getPSAppViewName(){
        Object objValue = this.get(FIELD_PSAPPVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 绑定应用视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppViewNameDirty(){
        if(this.contains(FIELD_PSAPPVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 绑定应用视图
     */
    @JsonIgnore
    public void resetPSAppViewName(){
        this.reset(FIELD_PSAPPVIEWNAME);
    }

    /**
     * 设置 绑定应用视图，详细说明：{@link #FIELD_PSAPPVIEWNAME}
     * <P>
     * 等同 {@link #setPSAppViewName}
     * @param pSAppViewName
     */
    @JsonIgnore
    public PSAppUtilPage psappviewname(String pSAppViewName){
        this.setPSAppViewName(pSAppViewName);
        return this;
    }

    /**
     * <B>PSSYSAPPID</B>&nbsp;前端应用，指定应用功能页面所属的前端应用
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
    public PSAppUtilPage pssysappid(String pSSysAppId){
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
    public PSAppUtilPage pssysappid(PSSysApp pSSysApp){
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
     * <B>PSSYSAPPNAME</B>&nbsp;前端应用，指定应用功能页面所属的前端应用
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
    public PSAppUtilPage pssysappname(String pSSysAppName){
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELID</B>&nbsp;布局面板
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysViewPanel} 
     */
    public final static String FIELD_PSSYSVIEWPANELID = "pssysviewpanelid";

    /**
     * 设置 布局面板
     * 
     * @param pSSysViewPanelId
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELID)
    public void setPSSysViewPanelId(String pSSysViewPanelId){
        this.set(FIELD_PSSYSVIEWPANELID, pSSysViewPanelId);
    }
    
    /**
     * 获取 布局面板  
     * @return
     */
    @JsonIgnore
    public String getPSSysViewPanelId(){
        Object objValue = this.get(FIELD_PSSYSVIEWPANELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 布局面板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysViewPanelIdDirty(){
        if(this.contains(FIELD_PSSYSVIEWPANELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 布局面板
     */
    @JsonIgnore
    public void resetPSSysViewPanelId(){
        this.reset(FIELD_PSSYSVIEWPANELID);
    }

    /**
     * 设置 布局面板
     * <P>
     * 等同 {@link #setPSSysViewPanelId}
     * @param pSSysViewPanelId
     */
    @JsonIgnore
    public PSAppUtilPage pssysviewpanelid(String pSSysViewPanelId){
        this.setPSSysViewPanelId(pSSysViewPanelId);
        return this;
    }

    /**
     * 设置 布局面板，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysViewPanelId}
     * @param pSSysViewPanel 引用对象
     */
    @JsonIgnore
    public PSAppUtilPage pssysviewpanelid(PSSysViewPanel pSSysViewPanel){
        if(pSSysViewPanel == null){
            this.setPSSysViewPanelId(null);
            this.setPSSysViewPanelName(null);
        }
        else{
            this.setPSSysViewPanelId(pSSysViewPanel.getPSSysViewPanelId());
            this.setPSSysViewPanelName(pSSysViewPanel.getPSSysViewPanelName());
        }
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELNAME</B>&nbsp;布局面板
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSVIEWPANELID}
     */
    public final static String FIELD_PSSYSVIEWPANELNAME = "pssysviewpanelname";

    /**
     * 设置 布局面板
     * 
     * @param pSSysViewPanelName
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELNAME)
    public void setPSSysViewPanelName(String pSSysViewPanelName){
        this.set(FIELD_PSSYSVIEWPANELNAME, pSSysViewPanelName);
    }
    
    /**
     * 获取 布局面板  
     * @return
     */
    @JsonIgnore
    public String getPSSysViewPanelName(){
        Object objValue = this.get(FIELD_PSSYSVIEWPANELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 布局面板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysViewPanelNameDirty(){
        if(this.contains(FIELD_PSSYSVIEWPANELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 布局面板
     */
    @JsonIgnore
    public void resetPSSysViewPanelName(){
        this.reset(FIELD_PSSYSVIEWPANELNAME);
    }

    /**
     * 设置 布局面板
     * <P>
     * 等同 {@link #setPSSysViewPanelName}
     * @param pSSysViewPanelName
     */
    @JsonIgnore
    public PSAppUtilPage pssysviewpanelname(String pSSysViewPanelName){
        this.setPSSysViewPanelName(pSSysViewPanelName);
        return this;
    }

    /**
     * <B>TARGETTYPE</B>&nbsp;目标类型，指定应用功能页面映射的目标类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.AppUtilPageTargetType} 
     */
    public final static String FIELD_TARGETTYPE = "targettype";

    /**
     * 设置 目标类型，详细说明：{@link #FIELD_TARGETTYPE}
     * 
     * @param targetType
     * 
     */
    @JsonProperty(FIELD_TARGETTYPE)
    public void setTargetType(String targetType){
        this.set(FIELD_TARGETTYPE, targetType);
    }
    
    /**
     * 获取 目标类型  
     * @return
     */
    @JsonIgnore
    public String getTargetType(){
        Object objValue = this.get(FIELD_TARGETTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTargetTypeDirty(){
        if(this.contains(FIELD_TARGETTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标类型
     */
    @JsonIgnore
    public void resetTargetType(){
        this.reset(FIELD_TARGETTYPE);
    }

    /**
     * 设置 目标类型，详细说明：{@link #FIELD_TARGETTYPE}
     * <P>
     * 等同 {@link #setTargetType}
     * @param targetType
     */
    @JsonIgnore
    public PSAppUtilPage targettype(String targetType){
        this.setTargetType(targetType);
        return this;
    }

     /**
     * 设置 目标类型，详细说明：{@link #FIELD_TARGETTYPE}
     * <P>
     * 等同 {@link #setTargetType}
     * @param targetType
     */
    @JsonIgnore
    public PSAppUtilPage targettype(net.ibizsys.psmodel.core.util.PSModelEnums.AppUtilPageTargetType targetType){
        if(targetType == null){
            this.setTargetType(null);
        }
        else{
            this.setTargetType(targetType.value);
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
    public PSAppUtilPage updatedate(String updateDate){
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
    public PSAppUtilPage updateman(String updateMan){
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
    public PSAppUtilPage usercat(String userCat){
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
    public PSAppUtilPage usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat.value);
        }
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
    public PSAppUtilPage usertag(String userTag){
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
    public PSAppUtilPage usertag2(String userTag2){
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
    public PSAppUtilPage usertag3(String userTag3){
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
    public PSAppUtilPage usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>UTILPARAMS</B>&nbsp;功能参数
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_UTILPARAMS = "utilparams";

    /**
     * 设置 功能参数
     * 
     * @param utilParams
     * 
     */
    @JsonProperty(FIELD_UTILPARAMS)
    public void setUtilParams(String utilParams){
        this.set(FIELD_UTILPARAMS, utilParams);
    }
    
    /**
     * 获取 功能参数  
     * @return
     */
    @JsonIgnore
    public String getUtilParams(){
        Object objValue = this.get(FIELD_UTILPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilParamsDirty(){
        if(this.contains(FIELD_UTILPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能参数
     */
    @JsonIgnore
    public void resetUtilParams(){
        this.reset(FIELD_UTILPARAMS);
    }

    /**
     * 设置 功能参数
     * <P>
     * 等同 {@link #setUtilParams}
     * @param utilParams
     */
    @JsonIgnore
    public PSAppUtilPage utilparams(String utilParams){
        this.setUtilParams(utilParams);
        return this;
    }

    /**
     * <B>UTILTAG</B>&nbsp;功能标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_UTILTAG = "utiltag";

    /**
     * 设置 功能标记
     * 
     * @param utilTag
     * 
     */
    @JsonProperty(FIELD_UTILTAG)
    public void setUtilTag(String utilTag){
        this.set(FIELD_UTILTAG, utilTag);
    }
    
    /**
     * 获取 功能标记  
     * @return
     */
    @JsonIgnore
    public String getUtilTag(){
        Object objValue = this.get(FIELD_UTILTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilTagDirty(){
        if(this.contains(FIELD_UTILTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能标记
     */
    @JsonIgnore
    public void resetUtilTag(){
        this.reset(FIELD_UTILTAG);
    }

    /**
     * 设置 功能标记
     * <P>
     * 等同 {@link #setUtilTag}
     * @param utilTag
     */
    @JsonIgnore
    public PSAppUtilPage utiltag(String utilTag){
        this.setUtilTag(utilTag);
        return this;
    }

    /**
     * <B>UTILTYPE</B>&nbsp;功能类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.AppUtilPage} 
     */
    public final static String FIELD_UTILTYPE = "utiltype";

    /**
     * 设置 功能类型
     * 
     * @param utilType
     * 
     */
    @JsonProperty(FIELD_UTILTYPE)
    public void setUtilType(String utilType){
        this.set(FIELD_UTILTYPE, utilType);
    }
    
    /**
     * 获取 功能类型  
     * @return
     */
    @JsonIgnore
    public String getUtilType(){
        Object objValue = this.get(FIELD_UTILTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilTypeDirty(){
        if(this.contains(FIELD_UTILTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能类型
     */
    @JsonIgnore
    public void resetUtilType(){
        this.reset(FIELD_UTILTYPE);
    }

    /**
     * 设置 功能类型
     * <P>
     * 等同 {@link #setUtilType}
     * @param utilType
     */
    @JsonIgnore
    public PSAppUtilPage utiltype(String utilType){
        this.setUtilType(utilType);
        return this;
    }

     /**
     * 设置 功能类型
     * <P>
     * 等同 {@link #setUtilType}
     * @param utilType
     */
    @JsonIgnore
    public PSAppUtilPage utiltype(net.ibizsys.psmodel.core.util.PSModelEnums.AppUtilPage utilType){
        if(utilType == null){
            this.setUtilType(null);
        }
        else{
            this.setUtilType(utilType.value);
        }
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSAppUtilPageId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSAppUtilPageId(strValue);
    }

    @JsonIgnore
    public PSAppUtilPage id(String strValue){
        this.setPSAppUtilPageId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSAppUtilPage){
            PSAppUtilPage model = (PSAppUtilPage)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
