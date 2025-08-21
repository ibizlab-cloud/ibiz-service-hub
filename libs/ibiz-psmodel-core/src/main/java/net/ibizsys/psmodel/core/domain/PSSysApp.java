package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSAPP</B>应用程序 模型传输对象
 * <P>
 * 提供人机交互的应用程序模型，指定应用使用的技术及界面样式，包括使用的服务接口等。前端应用是前端模板的顶级目标模型对象
 */
public class PSSysApp extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysApp(){
        this.setValidFlag(1);
    }      

    /**
     * <B>ACMINCHARS</B>&nbsp;自填编辑器触发字符数
     */
    public final static String FIELD_ACMINCHARS = "acminchars";

    /**
     * 设置 自填编辑器触发字符数
     * 
     * @param aCMinChars
     * 
     */
    @JsonProperty(FIELD_ACMINCHARS)
    public void setACMinChars(Integer aCMinChars){
        this.set(FIELD_ACMINCHARS, aCMinChars);
    }
    
    /**
     * 获取 自填编辑器触发字符数  
     * @return
     */
    @JsonIgnore
    public Integer getACMinChars(){
        Object objValue = this.get(FIELD_ACMINCHARS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 自填编辑器触发字符数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isACMinCharsDirty(){
        if(this.contains(FIELD_ACMINCHARS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自填编辑器触发字符数
     */
    @JsonIgnore
    public void resetACMinChars(){
        this.reset(FIELD_ACMINCHARS);
    }

    /**
     * 设置 自填编辑器触发字符数
     * <P>
     * 等同 {@link #setACMinChars}
     * @param aCMinChars
     */
    @JsonIgnore
    public PSSysApp acminchars(Integer aCMinChars){
        this.setACMinChars(aCMinChars);
        return this;
    }

    /**
     * <B>APPFOLDER</B>&nbsp;应用目录，指定前端应用的应用目录名称，未定义时使用【代码标识】
     * <P>
     * 字符串：最大长度 20，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_APPFOLDER = "appfolder";

    /**
     * 设置 应用目录，详细说明：{@link #FIELD_APPFOLDER}
     * 
     * @param appFolder
     * 
     */
    @JsonProperty(FIELD_APPFOLDER)
    public void setAppFolder(String appFolder){
        this.set(FIELD_APPFOLDER, appFolder);
    }
    
    /**
     * 获取 应用目录  
     * @return
     */
    @JsonIgnore
    public String getAppFolder(){
        Object objValue = this.get(FIELD_APPFOLDER);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用目录 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAppFolderDirty(){
        if(this.contains(FIELD_APPFOLDER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用目录
     */
    @JsonIgnore
    public void resetAppFolder(){
        this.reset(FIELD_APPFOLDER);
    }

    /**
     * 设置 应用目录，详细说明：{@link #FIELD_APPFOLDER}
     * <P>
     * 等同 {@link #setAppFolder}
     * @param appFolder
     */
    @JsonIgnore
    public PSSysApp appfolder(String appFolder){
        this.setAppFolder(appFolder);
        return this;
    }

    /**
     * <B>APPMODE</B>&nbsp;应用模式，指定当前应用的应用模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.AppMode} 
     */
    public final static String FIELD_APPMODE = "appmode";

    /**
     * 设置 应用模式，详细说明：{@link #FIELD_APPMODE}
     * 
     * @param appMode
     * 
     */
    @JsonProperty(FIELD_APPMODE)
    public void setAppMode(String appMode){
        this.set(FIELD_APPMODE, appMode);
    }
    
    /**
     * 获取 应用模式  
     * @return
     */
    @JsonIgnore
    public String getAppMode(){
        Object objValue = this.get(FIELD_APPMODE);
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
    public boolean isAppModeDirty(){
        if(this.contains(FIELD_APPMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用模式
     */
    @JsonIgnore
    public void resetAppMode(){
        this.reset(FIELD_APPMODE);
    }

    /**
     * 设置 应用模式，详细说明：{@link #FIELD_APPMODE}
     * <P>
     * 等同 {@link #setAppMode}
     * @param appMode
     */
    @JsonIgnore
    public PSSysApp appmode(String appMode){
        this.setAppMode(appMode);
        return this;
    }

     /**
     * 设置 应用模式，详细说明：{@link #FIELD_APPMODE}
     * <P>
     * 等同 {@link #setAppMode}
     * @param appMode
     */
    @JsonIgnore
    public PSSysApp appmode(net.ibizsys.psmodel.core.util.PSModelEnums.AppMode appMode){
        if(appMode == null){
            this.setAppMode(null);
        }
        else{
            this.setAppMode(appMode.value);
        }
        return this;
    }

    /**
     * <B>APPPKGNAME</B>&nbsp;代码标识，指定前端应用的代码标识，需要在前端应用所在的模型域（系统模块或系统）中具有唯一性
     * <P>
     * 字符串：最大长度 60，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_APPPKGNAME = "apppkgname";

    /**
     * 设置 代码标识，详细说明：{@link #FIELD_APPPKGNAME}
     * 
     * @param appPKGName
     * 
     */
    @JsonProperty(FIELD_APPPKGNAME)
    public void setAppPKGName(String appPKGName){
        this.set(FIELD_APPPKGNAME, appPKGName);
    }
    
    /**
     * 获取 代码标识  
     * @return
     */
    @JsonIgnore
    public String getAppPKGName(){
        Object objValue = this.get(FIELD_APPPKGNAME);
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
    public boolean isAppPKGNameDirty(){
        if(this.contains(FIELD_APPPKGNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码标识
     */
    @JsonIgnore
    public void resetAppPKGName(){
        this.reset(FIELD_APPPKGNAME);
    }

    /**
     * 设置 代码标识，详细说明：{@link #FIELD_APPPKGNAME}
     * <P>
     * 等同 {@link #setAppPKGName}
     * @param appPKGName
     */
    @JsonIgnore
    public PSSysApp apppkgname(String appPKGName){
        this.setAppPKGName(appPKGName);
        return this;
    }

    /**
     * <B>APPSN</B>&nbsp;应用编号，指定前端应用的编号
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_APPSN = "appsn";

    /**
     * 设置 应用编号，详细说明：{@link #FIELD_APPSN}
     * 
     * @param appSN
     * 
     */
    @JsonProperty(FIELD_APPSN)
    public void setAppSN(String appSN){
        this.set(FIELD_APPSN, appSN);
    }
    
    /**
     * 获取 应用编号  
     * @return
     */
    @JsonIgnore
    public String getAppSN(){
        Object objValue = this.get(FIELD_APPSN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用编号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAppSNDirty(){
        if(this.contains(FIELD_APPSN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用编号
     */
    @JsonIgnore
    public void resetAppSN(){
        this.reset(FIELD_APPSN);
    }

    /**
     * 设置 应用编号，详细说明：{@link #FIELD_APPSN}
     * <P>
     * 等同 {@link #setAppSN}
     * @param appSN
     */
    @JsonIgnore
    public PSSysApp appsn(String appSN){
        this.setAppSN(appSN);
        return this;
    }

    /**
     * <B>APPTAG</B>&nbsp;应用标记，指定前端应用的标记
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_APPTAG = "apptag";

    /**
     * 设置 应用标记，详细说明：{@link #FIELD_APPTAG}
     * 
     * @param appTag
     * 
     */
    @JsonProperty(FIELD_APPTAG)
    public void setAppTag(String appTag){
        this.set(FIELD_APPTAG, appTag);
    }
    
    /**
     * 获取 应用标记  
     * @return
     */
    @JsonIgnore
    public String getAppTag(){
        Object objValue = this.get(FIELD_APPTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAppTagDirty(){
        if(this.contains(FIELD_APPTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用标记
     */
    @JsonIgnore
    public void resetAppTag(){
        this.reset(FIELD_APPTAG);
    }

    /**
     * 设置 应用标记，详细说明：{@link #FIELD_APPTAG}
     * <P>
     * 等同 {@link #setAppTag}
     * @param appTag
     */
    @JsonIgnore
    public PSSysApp apptag(String appTag){
        this.setAppTag(appTag);
        return this;
    }

    /**
     * <B>APPTAG2</B>&nbsp;应用标记2，指定前端应用的标记2
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_APPTAG2 = "apptag2";

    /**
     * 设置 应用标记2，详细说明：{@link #FIELD_APPTAG2}
     * 
     * @param appTag2
     * 
     */
    @JsonProperty(FIELD_APPTAG2)
    public void setAppTag2(String appTag2){
        this.set(FIELD_APPTAG2, appTag2);
    }
    
    /**
     * 获取 应用标记2  
     * @return
     */
    @JsonIgnore
    public String getAppTag2(){
        Object objValue = this.get(FIELD_APPTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAppTag2Dirty(){
        if(this.contains(FIELD_APPTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用标记2
     */
    @JsonIgnore
    public void resetAppTag2(){
        this.reset(FIELD_APPTAG2);
    }

    /**
     * 设置 应用标记2，详细说明：{@link #FIELD_APPTAG2}
     * <P>
     * 等同 {@link #setAppTag2}
     * @param appTag2
     */
    @JsonIgnore
    public PSSysApp apptag2(String appTag2){
        this.setAppTag2(appTag2);
        return this;
    }

    /**
     * <B>APPTAG3</B>&nbsp;应用标记3，指定前端应用的标记3
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_APPTAG3 = "apptag3";

    /**
     * 设置 应用标记3，详细说明：{@link #FIELD_APPTAG3}
     * 
     * @param appTag3
     * 
     */
    @JsonProperty(FIELD_APPTAG3)
    public void setAppTag3(String appTag3){
        this.set(FIELD_APPTAG3, appTag3);
    }
    
    /**
     * 获取 应用标记3  
     * @return
     */
    @JsonIgnore
    public String getAppTag3(){
        Object objValue = this.get(FIELD_APPTAG3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用标记3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAppTag3Dirty(){
        if(this.contains(FIELD_APPTAG3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用标记3
     */
    @JsonIgnore
    public void resetAppTag3(){
        this.reset(FIELD_APPTAG3);
    }

    /**
     * 设置 应用标记3，详细说明：{@link #FIELD_APPTAG3}
     * <P>
     * 等同 {@link #setAppTag3}
     * @param appTag3
     */
    @JsonIgnore
    public PSSysApp apptag3(String appTag3){
        this.setAppTag3(appTag3);
        return this;
    }

    /**
     * <B>APPTAG4</B>&nbsp;应用标记4，指定前端应用的标记4
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_APPTAG4 = "apptag4";

    /**
     * 设置 应用标记4，详细说明：{@link #FIELD_APPTAG4}
     * 
     * @param appTag4
     * 
     */
    @JsonProperty(FIELD_APPTAG4)
    public void setAppTag4(String appTag4){
        this.set(FIELD_APPTAG4, appTag4);
    }
    
    /**
     * 获取 应用标记4  
     * @return
     */
    @JsonIgnore
    public String getAppTag4(){
        Object objValue = this.get(FIELD_APPTAG4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用标记4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAppTag4Dirty(){
        if(this.contains(FIELD_APPTAG4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用标记4
     */
    @JsonIgnore
    public void resetAppTag4(){
        this.reset(FIELD_APPTAG4);
    }

    /**
     * 设置 应用标记4，详细说明：{@link #FIELD_APPTAG4}
     * <P>
     * 等同 {@link #setAppTag4}
     * @param appTag4
     */
    @JsonIgnore
    public PSSysApp apptag4(String appTag4){
        this.setAppTag4(appTag4);
        return this;
    }

    /**
     * <B>APPVERSION</B>&nbsp;应用版本
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_APPVERSION = "appversion";

    /**
     * 设置 应用版本
     * 
     * @param appVersion
     * 
     */
    @JsonProperty(FIELD_APPVERSION)
    public void setAppVersion(String appVersion){
        this.set(FIELD_APPVERSION, appVersion);
    }
    
    /**
     * 获取 应用版本  
     * @return
     */
    @JsonIgnore
    public String getAppVersion(){
        Object objValue = this.get(FIELD_APPVERSION);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAppVersionDirty(){
        if(this.contains(FIELD_APPVERSION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用版本
     */
    @JsonIgnore
    public void resetAppVersion(){
        this.reset(FIELD_APPVERSION);
    }

    /**
     * 设置 应用版本
     * <P>
     * 等同 {@link #setAppVersion}
     * @param appVersion
     */
    @JsonIgnore
    public PSSysApp appversion(String appVersion){
        this.setAppVersion(appVersion);
        return this;
    }

    /**
     * <B>APPVIEWPRIORITY</B>&nbsp;应用视图优先级
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.AppViewPriority} 
     */
    public final static String FIELD_APPVIEWPRIORITY = "appviewpriority";

    /**
     * 设置 应用视图优先级
     * 
     * @param appViewPriority
     * 
     */
    @JsonProperty(FIELD_APPVIEWPRIORITY)
    public void setAppViewPriority(Integer appViewPriority){
        this.set(FIELD_APPVIEWPRIORITY, appViewPriority);
    }
    
    /**
     * 获取 应用视图优先级  
     * @return
     */
    @JsonIgnore
    public Integer getAppViewPriority(){
        Object objValue = this.get(FIELD_APPVIEWPRIORITY);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 应用视图优先级 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAppViewPriorityDirty(){
        if(this.contains(FIELD_APPVIEWPRIORITY)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用视图优先级
     */
    @JsonIgnore
    public void resetAppViewPriority(){
        this.reset(FIELD_APPVIEWPRIORITY);
    }

    /**
     * 设置 应用视图优先级
     * <P>
     * 等同 {@link #setAppViewPriority}
     * @param appViewPriority
     */
    @JsonIgnore
    public PSSysApp appviewpriority(Integer appViewPriority){
        this.setAppViewPriority(appViewPriority);
        return this;
    }

     /**
     * 设置 应用视图优先级
     * <P>
     * 等同 {@link #setAppViewPriority}
     * @param appViewPriority
     */
    @JsonIgnore
    public PSSysApp appviewpriority(net.ibizsys.psmodel.core.util.PSModelEnums.AppViewPriority appViewPriority){
        if(appViewPriority == null){
            this.setAppViewPriority(null);
        }
        else{
            this.setAppViewPriority(appViewPriority.value);
        }
        return this;
    }

    /**
     * <B>AUTOADDAPPVIEW</B>&nbsp;自动添加应用视图，指定应用是否自动添加引用到的实体视图，实体视图之间存在引用关系，添加某一实体视图到应用后其它相关的视图也必须被添加，启用该功能将自动完成这个过程。默认为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_AUTOADDAPPVIEW = "autoaddappview";

    /**
     * 设置 自动添加应用视图，详细说明：{@link #FIELD_AUTOADDAPPVIEW}
     * 
     * @param autoAddAppView
     * 
     */
    @JsonProperty(FIELD_AUTOADDAPPVIEW)
    public void setAutoAddAppView(Integer autoAddAppView){
        this.set(FIELD_AUTOADDAPPVIEW, autoAddAppView);
    }
    
    /**
     * 获取 自动添加应用视图  
     * @return
     */
    @JsonIgnore
    public Integer getAutoAddAppView(){
        Object objValue = this.get(FIELD_AUTOADDAPPVIEW);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 自动添加应用视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAutoAddAppViewDirty(){
        if(this.contains(FIELD_AUTOADDAPPVIEW)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自动添加应用视图
     */
    @JsonIgnore
    public void resetAutoAddAppView(){
        this.reset(FIELD_AUTOADDAPPVIEW);
    }

    /**
     * 设置 自动添加应用视图，详细说明：{@link #FIELD_AUTOADDAPPVIEW}
     * <P>
     * 等同 {@link #setAutoAddAppView}
     * @param autoAddAppView
     */
    @JsonIgnore
    public PSSysApp autoaddappview(Integer autoAddAppView){
        this.setAutoAddAppView(autoAddAppView);
        return this;
    }

     /**
     * 设置 自动添加应用视图，详细说明：{@link #FIELD_AUTOADDAPPVIEW}
     * <P>
     * 等同 {@link #setAutoAddAppView}
     * @param autoAddAppView
     */
    @JsonIgnore
    public PSSysApp autoaddappview(Boolean autoAddAppView){
        if(autoAddAppView == null){
            this.setAutoAddAppView(null);
        }
        else{
            this.setAutoAddAppView(autoAddAppView?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>BOTTOMINFO</B>&nbsp;下方信息，指定应用的下方信息，默认首页视图下方信息将优先使用此内容
     */
    public final static String FIELD_BOTTOMINFO = "bottominfo";

    /**
     * 设置 下方信息，详细说明：{@link #FIELD_BOTTOMINFO}
     * 
     * @param bottomInfo
     * 
     */
    @JsonProperty(FIELD_BOTTOMINFO)
    public void setBottomInfo(String bottomInfo){
        this.set(FIELD_BOTTOMINFO, bottomInfo);
    }
    
    /**
     * 获取 下方信息  
     * @return
     */
    @JsonIgnore
    public String getBottomInfo(){
        Object objValue = this.get(FIELD_BOTTOMINFO);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 下方信息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBottomInfoDirty(){
        if(this.contains(FIELD_BOTTOMINFO)){
            return true;
        }
        return false;
    }

    /**
     * 重置 下方信息
     */
    @JsonIgnore
    public void resetBottomInfo(){
        this.reset(FIELD_BOTTOMINFO);
    }

    /**
     * 设置 下方信息，详细说明：{@link #FIELD_BOTTOMINFO}
     * <P>
     * 等同 {@link #setBottomInfo}
     * @param bottomInfo
     */
    @JsonIgnore
    public PSSysApp bottominfo(String bottomInfo){
        this.setBottomInfo(bottomInfo);
        return this;
    }

    /**
     * <B>BTNNOPRIVDM</B>&nbsp;按钮无权限显示模式，指定当前应用是如何处理无权限按钮的显示，未定义时为【隐藏】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.BtnNoPrivDisplayMode} 
     */
    public final static String FIELD_BTNNOPRIVDM = "btnnoprivdm";

    /**
     * 设置 按钮无权限显示模式，详细说明：{@link #FIELD_BTNNOPRIVDM}
     * 
     * @param btnNoPrivDM
     * 
     */
    @JsonProperty(FIELD_BTNNOPRIVDM)
    public void setBtnNoPrivDM(Integer btnNoPrivDM){
        this.set(FIELD_BTNNOPRIVDM, btnNoPrivDM);
    }
    
    /**
     * 获取 按钮无权限显示模式  
     * @return
     */
    @JsonIgnore
    public Integer getBtnNoPrivDM(){
        Object objValue = this.get(FIELD_BTNNOPRIVDM);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 按钮无权限显示模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBtnNoPrivDMDirty(){
        if(this.contains(FIELD_BTNNOPRIVDM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 按钮无权限显示模式
     */
    @JsonIgnore
    public void resetBtnNoPrivDM(){
        this.reset(FIELD_BTNNOPRIVDM);
    }

    /**
     * 设置 按钮无权限显示模式，详细说明：{@link #FIELD_BTNNOPRIVDM}
     * <P>
     * 等同 {@link #setBtnNoPrivDM}
     * @param btnNoPrivDM
     */
    @JsonIgnore
    public PSSysApp btnnoprivdm(Integer btnNoPrivDM){
        this.setBtnNoPrivDM(btnNoPrivDM);
        return this;
    }

     /**
     * 设置 按钮无权限显示模式，详细说明：{@link #FIELD_BTNNOPRIVDM}
     * <P>
     * 等同 {@link #setBtnNoPrivDM}
     * @param btnNoPrivDM
     */
    @JsonIgnore
    public PSSysApp btnnoprivdm(net.ibizsys.psmodel.core.util.PSModelEnums.BtnNoPrivDisplayMode btnNoPrivDM){
        if(btnNoPrivDM == null){
            this.setBtnNoPrivDM(null);
        }
        else{
            this.setBtnNoPrivDM(btnNoPrivDM.value);
        }
        return this;
    }

    /**
     * <B>CAPTION</B>&nbsp;应用标题，指定应用的标题，默认首页视图标题将优先使用此内容
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_CAPTION = "caption";

    /**
     * 设置 应用标题，详细说明：{@link #FIELD_CAPTION}
     * 
     * @param caption
     * 
     */
    @JsonProperty(FIELD_CAPTION)
    public void setCaption(String caption){
        this.set(FIELD_CAPTION, caption);
    }
    
    /**
     * 获取 应用标题  
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
     * 判断 应用标题 是否指定值，包括空值
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
     * 重置 应用标题
     */
    @JsonIgnore
    public void resetCaption(){
        this.reset(FIELD_CAPTION);
    }

    /**
     * 设置 应用标题，详细说明：{@link #FIELD_CAPTION}
     * <P>
     * 等同 {@link #setCaption}
     * @param caption
     */
    @JsonIgnore
    public PSSysApp caption(String caption){
        this.setCaption(caption);
        return this;
    }

    /**
     * <B>CODENAMEMODE</B>&nbsp;视图代码标识模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.CodeNameMode} 
     */
    public final static String FIELD_CODENAMEMODE = "codenamemode";

    /**
     * 设置 视图代码标识模式
     * 
     * @param codeNameMode
     * 
     */
    @JsonProperty(FIELD_CODENAMEMODE)
    public void setCodeNameMode(String codeNameMode){
        this.set(FIELD_CODENAMEMODE, codeNameMode);
    }
    
    /**
     * 获取 视图代码标识模式  
     * @return
     */
    @JsonIgnore
    public String getCodeNameMode(){
        Object objValue = this.get(FIELD_CODENAMEMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图代码标识模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCodeNameModeDirty(){
        if(this.contains(FIELD_CODENAMEMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图代码标识模式
     */
    @JsonIgnore
    public void resetCodeNameMode(){
        this.reset(FIELD_CODENAMEMODE);
    }

    /**
     * 设置 视图代码标识模式
     * <P>
     * 等同 {@link #setCodeNameMode}
     * @param codeNameMode
     */
    @JsonIgnore
    public PSSysApp codenamemode(String codeNameMode){
        this.setCodeNameMode(codeNameMode);
        return this;
    }

     /**
     * 设置 视图代码标识模式
     * <P>
     * 等同 {@link #setCodeNameMode}
     * @param codeNameMode
     */
    @JsonIgnore
    public PSSysApp codenamemode(net.ibizsys.psmodel.core.util.PSModelEnums.CodeNameMode codeNameMode){
        if(codeNameMode == null){
            this.setCodeNameMode(null);
        }
        else{
            this.setCodeNameMode(codeNameMode.value);
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
    public PSSysApp createdate(String createDate){
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
    public PSSysApp createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DEFAULTPORT</B>&nbsp;默认端口，指定应用的默认端口，一般在开发环境使用
     */
    public final static String FIELD_DEFAULTPORT = "defaultport";

    /**
     * 设置 默认端口，详细说明：{@link #FIELD_DEFAULTPORT}
     * 
     * @param defaultPort
     * 
     */
    @JsonProperty(FIELD_DEFAULTPORT)
    public void setDefaultPort(Integer defaultPort){
        this.set(FIELD_DEFAULTPORT, defaultPort);
    }
    
    /**
     * 获取 默认端口  
     * @return
     */
    @JsonIgnore
    public Integer getDefaultPort(){
        Object objValue = this.get(FIELD_DEFAULTPORT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认端口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefaultPortDirty(){
        if(this.contains(FIELD_DEFAULTPORT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认端口
     */
    @JsonIgnore
    public void resetDefaultPort(){
        this.reset(FIELD_DEFAULTPORT);
    }

    /**
     * 设置 默认端口，详细说明：{@link #FIELD_DEFAULTPORT}
     * <P>
     * 等同 {@link #setDefaultPort}
     * @param defaultPort
     */
    @JsonIgnore
    public PSSysApp defaultport(Integer defaultPort){
        this.setDefaultPort(defaultPort);
        return this;
    }

    /**
     * <B>DEFAULTPUB</B>&nbsp;默认应用，指定当前应用是否作为系统的默认应用，默认为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEFAULTPUB = "defaultpub";

    /**
     * 设置 默认应用，详细说明：{@link #FIELD_DEFAULTPUB}
     * 
     * @param defaultPub
     * 
     */
    @JsonProperty(FIELD_DEFAULTPUB)
    public void setDefaultPub(Integer defaultPub){
        this.set(FIELD_DEFAULTPUB, defaultPub);
    }
    
    /**
     * 获取 默认应用  
     * @return
     */
    @JsonIgnore
    public Integer getDefaultPub(){
        Object objValue = this.get(FIELD_DEFAULTPUB);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认应用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefaultPubDirty(){
        if(this.contains(FIELD_DEFAULTPUB)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认应用
     */
    @JsonIgnore
    public void resetDefaultPub(){
        this.reset(FIELD_DEFAULTPUB);
    }

    /**
     * 设置 默认应用，详细说明：{@link #FIELD_DEFAULTPUB}
     * <P>
     * 等同 {@link #setDefaultPub}
     * @param defaultPub
     */
    @JsonIgnore
    public PSSysApp defaultpub(Integer defaultPub){
        this.setDefaultPub(defaultPub);
        return this;
    }

     /**
     * 设置 默认应用，详细说明：{@link #FIELD_DEFAULTPUB}
     * <P>
     * 等同 {@link #setDefaultPub}
     * @param defaultPub
     */
    @JsonIgnore
    public PSSysApp defaultpub(Boolean defaultPub){
        if(defaultPub == null){
            this.setDefaultPub(null);
        }
        else{
            this.setDefaultPub(defaultPub?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DEPSSYSSFPLUGINID</B>&nbsp;应用实体后端插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysSFPlugin} 
     */
    public final static String FIELD_DEPSSYSSFPLUGINID = "depssyssfpluginid";

    /**
     * 设置 应用实体后端插件
     * 
     * @param dEPSSysSFPluginId
     * 
     */
    @JsonProperty(FIELD_DEPSSYSSFPLUGINID)
    public void setDEPSSysSFPluginId(String dEPSSysSFPluginId){
        this.set(FIELD_DEPSSYSSFPLUGINID, dEPSSysSFPluginId);
    }
    
    /**
     * 获取 应用实体后端插件  
     * @return
     */
    @JsonIgnore
    public String getDEPSSysSFPluginId(){
        Object objValue = this.get(FIELD_DEPSSYSSFPLUGINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用实体后端插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDEPSSysSFPluginIdDirty(){
        if(this.contains(FIELD_DEPSSYSSFPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用实体后端插件
     */
    @JsonIgnore
    public void resetDEPSSysSFPluginId(){
        this.reset(FIELD_DEPSSYSSFPLUGINID);
    }

    /**
     * 设置 应用实体后端插件
     * <P>
     * 等同 {@link #setDEPSSysSFPluginId}
     * @param dEPSSysSFPluginId
     */
    @JsonIgnore
    public PSSysApp depssyssfpluginid(String dEPSSysSFPluginId){
        this.setDEPSSysSFPluginId(dEPSSysSFPluginId);
        return this;
    }

    /**
     * 设置 应用实体后端插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDEPSSysSFPluginId}
     * @param pSSysSFPlugin 引用对象
     */
    @JsonIgnore
    public PSSysApp depssyssfpluginid(PSSysSFPlugin pSSysSFPlugin){
        if(pSSysSFPlugin == null){
            this.setDEPSSysSFPluginId(null);
            this.setDEPSSysSFPluginName(null);
        }
        else{
            this.setDEPSSysSFPluginId(pSSysSFPlugin.getPSSysSFPluginId());
            this.setDEPSSysSFPluginName(pSSysSFPlugin.getPSSysSFPluginName());
        }
        return this;
    }

    /**
     * <B>DEPSSYSSFPLUGINNAME</B>&nbsp;应用实体后端插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DEPSSYSSFPLUGINID}
     */
    public final static String FIELD_DEPSSYSSFPLUGINNAME = "depssyssfpluginname";

    /**
     * 设置 应用实体后端插件
     * 
     * @param dEPSSysSFPluginName
     * 
     */
    @JsonProperty(FIELD_DEPSSYSSFPLUGINNAME)
    public void setDEPSSysSFPluginName(String dEPSSysSFPluginName){
        this.set(FIELD_DEPSSYSSFPLUGINNAME, dEPSSysSFPluginName);
    }
    
    /**
     * 获取 应用实体后端插件  
     * @return
     */
    @JsonIgnore
    public String getDEPSSysSFPluginName(){
        Object objValue = this.get(FIELD_DEPSSYSSFPLUGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用实体后端插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDEPSSysSFPluginNameDirty(){
        if(this.contains(FIELD_DEPSSYSSFPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用实体后端插件
     */
    @JsonIgnore
    public void resetDEPSSysSFPluginName(){
        this.reset(FIELD_DEPSSYSSFPLUGINNAME);
    }

    /**
     * 设置 应用实体后端插件
     * <P>
     * 等同 {@link #setDEPSSysSFPluginName}
     * @param dEPSSysSFPluginName
     */
    @JsonIgnore
    public PSSysApp depssyssfpluginname(String dEPSSysSFPluginName){
        this.setDEPSSysSFPluginName(dEPSSysSFPluginName);
        return this;
    }

    /**
     * <B>ENABLEC12TOC24</B>&nbsp;转换12列至24列布局，指定应用是否启用转换12列至24列布局，早期的应用设计使用【12列】布局，启用转换将能使用当前普遍【24列】布局的模板进行发布。默认为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEC12TOC24 = "enablec12toc24";

    /**
     * 设置 转换12列至24列布局，详细说明：{@link #FIELD_ENABLEC12TOC24}
     * 
     * @param enableC12ToC24
     * 
     */
    @JsonProperty(FIELD_ENABLEC12TOC24)
    public void setEnableC12ToC24(Integer enableC12ToC24){
        this.set(FIELD_ENABLEC12TOC24, enableC12ToC24);
    }
    
    /**
     * 获取 转换12列至24列布局  
     * @return
     */
    @JsonIgnore
    public Integer getEnableC12ToC24(){
        Object objValue = this.get(FIELD_ENABLEC12TOC24);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 转换12列至24列布局 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableC12ToC24Dirty(){
        if(this.contains(FIELD_ENABLEC12TOC24)){
            return true;
        }
        return false;
    }

    /**
     * 重置 转换12列至24列布局
     */
    @JsonIgnore
    public void resetEnableC12ToC24(){
        this.reset(FIELD_ENABLEC12TOC24);
    }

    /**
     * 设置 转换12列至24列布局，详细说明：{@link #FIELD_ENABLEC12TOC24}
     * <P>
     * 等同 {@link #setEnableC12ToC24}
     * @param enableC12ToC24
     */
    @JsonIgnore
    public PSSysApp enablec12toc24(Integer enableC12ToC24){
        this.setEnableC12ToC24(enableC12ToC24);
        return this;
    }

     /**
     * 设置 转换12列至24列布局，详细说明：{@link #FIELD_ENABLEC12TOC24}
     * <P>
     * 等同 {@link #setEnableC12ToC24}
     * @param enableC12ToC24
     */
    @JsonIgnore
    public PSSysApp enablec12toc24(Boolean enableC12ToC24){
        if(enableC12ToC24 == null){
            this.setEnableC12ToC24(null);
        }
        else{
            this.setEnableC12ToC24(enableC12ToC24?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEDYNASYS</B>&nbsp;支持动态系统
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DynaSysMode} 
     */
    public final static String FIELD_ENABLEDYNASYS = "enabledynasys";

    /**
     * 设置 支持动态系统
     * 
     * @param enableDynaSys
     * 
     */
    @JsonProperty(FIELD_ENABLEDYNASYS)
    public void setEnableDynaSys(Integer enableDynaSys){
        this.set(FIELD_ENABLEDYNASYS, enableDynaSys);
    }
    
    /**
     * 获取 支持动态系统  
     * @return
     */
    @JsonIgnore
    public Integer getEnableDynaSys(){
        Object objValue = this.get(FIELD_ENABLEDYNASYS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持动态系统 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableDynaSysDirty(){
        if(this.contains(FIELD_ENABLEDYNASYS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持动态系统
     */
    @JsonIgnore
    public void resetEnableDynaSys(){
        this.reset(FIELD_ENABLEDYNASYS);
    }

    /**
     * 设置 支持动态系统
     * <P>
     * 等同 {@link #setEnableDynaSys}
     * @param enableDynaSys
     */
    @JsonIgnore
    public PSSysApp enabledynasys(Integer enableDynaSys){
        this.setEnableDynaSys(enableDynaSys);
        return this;
    }

     /**
     * 设置 支持动态系统
     * <P>
     * 等同 {@link #setEnableDynaSys}
     * @param enableDynaSys
     */
    @JsonIgnore
    public PSSysApp enabledynasys(net.ibizsys.psmodel.core.util.PSModelEnums.DynaSysMode enableDynaSys){
        if(enableDynaSys == null){
            this.setEnableDynaSys(null);
        }
        else{
            this.setEnableDynaSys(enableDynaSys.value);
        }
        return this;
    }

    /**
     * <B>ENABLEUIMODELEX</B>&nbsp;启用界面模型扩展
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEUIMODELEX = "enableuimodelex";

    /**
     * 设置 启用界面模型扩展
     * 
     * @param enableUIModelEx
     * 
     */
    @JsonProperty(FIELD_ENABLEUIMODELEX)
    public void setEnableUIModelEx(Integer enableUIModelEx){
        this.set(FIELD_ENABLEUIMODELEX, enableUIModelEx);
    }
    
    /**
     * 获取 启用界面模型扩展  
     * @return
     */
    @JsonIgnore
    public Integer getEnableUIModelEx(){
        Object objValue = this.get(FIELD_ENABLEUIMODELEX);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用界面模型扩展 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableUIModelExDirty(){
        if(this.contains(FIELD_ENABLEUIMODELEX)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用界面模型扩展
     */
    @JsonIgnore
    public void resetEnableUIModelEx(){
        this.reset(FIELD_ENABLEUIMODELEX);
    }

    /**
     * 设置 启用界面模型扩展
     * <P>
     * 等同 {@link #setEnableUIModelEx}
     * @param enableUIModelEx
     */
    @JsonIgnore
    public PSSysApp enableuimodelex(Integer enableUIModelEx){
        this.setEnableUIModelEx(enableUIModelEx);
        return this;
    }

     /**
     * 设置 启用界面模型扩展
     * <P>
     * 等同 {@link #setEnableUIModelEx}
     * @param enableUIModelEx
     */
    @JsonIgnore
    public PSSysApp enableuimodelex(Boolean enableUIModelEx){
        if(enableUIModelEx == null){
            this.setEnableUIModelEx(null);
        }
        else{
            this.setEnableUIModelEx(enableUIModelEx?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENALOCALSERVICE</B>&nbsp;启用本地服务
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENALOCALSERVICE = "enalocalservice";

    /**
     * 设置 启用本地服务
     * 
     * @param enaLocalService
     * 
     */
    @JsonProperty(FIELD_ENALOCALSERVICE)
    public void setEnaLocalService(Integer enaLocalService){
        this.set(FIELD_ENALOCALSERVICE, enaLocalService);
    }
    
    /**
     * 获取 启用本地服务  
     * @return
     */
    @JsonIgnore
    public Integer getEnaLocalService(){
        Object objValue = this.get(FIELD_ENALOCALSERVICE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用本地服务 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnaLocalServiceDirty(){
        if(this.contains(FIELD_ENALOCALSERVICE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用本地服务
     */
    @JsonIgnore
    public void resetEnaLocalService(){
        this.reset(FIELD_ENALOCALSERVICE);
    }

    /**
     * 设置 启用本地服务
     * <P>
     * 等同 {@link #setEnaLocalService}
     * @param enaLocalService
     */
    @JsonIgnore
    public PSSysApp enalocalservice(Integer enaLocalService){
        this.setEnaLocalService(enaLocalService);
        return this;
    }

     /**
     * 设置 启用本地服务
     * <P>
     * 等同 {@link #setEnaLocalService}
     * @param enaLocalService
     */
    @JsonIgnore
    public PSSysApp enalocalservice(Boolean enaLocalService){
        if(enaLocalService == null){
            this.setEnaLocalService(null);
        }
        else{
            this.setEnaLocalService(enaLocalService?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>FIEMPTYTEXT</B>&nbsp;表单项无值显示
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_FIEMPTYTEXT = "fiemptytext";

    /**
     * 设置 表单项无值显示
     * 
     * @param fIEmptyText
     * 
     */
    @JsonProperty(FIELD_FIEMPTYTEXT)
    public void setFIEmptyText(String fIEmptyText){
        this.set(FIELD_FIEMPTYTEXT, fIEmptyText);
    }
    
    /**
     * 获取 表单项无值显示  
     * @return
     */
    @JsonIgnore
    public String getFIEmptyText(){
        Object objValue = this.get(FIELD_FIEMPTYTEXT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表单项无值显示 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFIEmptyTextDirty(){
        if(this.contains(FIELD_FIEMPTYTEXT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表单项无值显示
     */
    @JsonIgnore
    public void resetFIEmptyText(){
        this.reset(FIELD_FIEMPTYTEXT);
    }

    /**
     * 设置 表单项无值显示
     * <P>
     * 等同 {@link #setFIEmptyText}
     * @param fIEmptyText
     */
    @JsonIgnore
    public PSSysApp fiemptytext(String fIEmptyText){
        this.setFIEmptyText(fIEmptyText);
        return this;
    }

    /**
     * <B>FINOPRIVDM</B>&nbsp;表单项无权限显示模式，指定应用中无权限表单项的默认的显示方式，未定义时为【显示空或*内容】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.NoPrivDisplayMode} 
     */
    public final static String FIELD_FINOPRIVDM = "finoprivdm";

    /**
     * 设置 表单项无权限显示模式，详细说明：{@link #FIELD_FINOPRIVDM}
     * 
     * @param fINoPrivDM
     * 
     */
    @JsonProperty(FIELD_FINOPRIVDM)
    public void setFINoPrivDM(Integer fINoPrivDM){
        this.set(FIELD_FINOPRIVDM, fINoPrivDM);
    }
    
    /**
     * 获取 表单项无权限显示模式  
     * @return
     */
    @JsonIgnore
    public Integer getFINoPrivDM(){
        Object objValue = this.get(FIELD_FINOPRIVDM);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 表单项无权限显示模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFINoPrivDMDirty(){
        if(this.contains(FIELD_FINOPRIVDM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表单项无权限显示模式
     */
    @JsonIgnore
    public void resetFINoPrivDM(){
        this.reset(FIELD_FINOPRIVDM);
    }

    /**
     * 设置 表单项无权限显示模式，详细说明：{@link #FIELD_FINOPRIVDM}
     * <P>
     * 等同 {@link #setFINoPrivDM}
     * @param fINoPrivDM
     */
    @JsonIgnore
    public PSSysApp finoprivdm(Integer fINoPrivDM){
        this.setFINoPrivDM(fINoPrivDM);
        return this;
    }

     /**
     * 设置 表单项无权限显示模式，详细说明：{@link #FIELD_FINOPRIVDM}
     * <P>
     * 等同 {@link #setFINoPrivDM}
     * @param fINoPrivDM
     */
    @JsonIgnore
    public PSSysApp finoprivdm(net.ibizsys.psmodel.core.util.PSModelEnums.NoPrivDisplayMode fINoPrivDM){
        if(fINoPrivDM == null){
            this.setFINoPrivDM(null);
        }
        else{
            this.setFINoPrivDM(fINoPrivDM.value);
        }
        return this;
    }

    /**
     * <B>FIUPDATEPRIVTAG</B>&nbsp;输出表单项更新权限标记
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_FIUPDATEPRIVTAG = "fiupdateprivtag";

    /**
     * 设置 输出表单项更新权限标记
     * 
     * @param fIUpdatePrivTag
     * 
     */
    @JsonProperty(FIELD_FIUPDATEPRIVTAG)
    public void setFIUpdatePrivTag(Integer fIUpdatePrivTag){
        this.set(FIELD_FIUPDATEPRIVTAG, fIUpdatePrivTag);
    }
    
    /**
     * 获取 输出表单项更新权限标记  
     * @return
     */
    @JsonIgnore
    public Integer getFIUpdatePrivTag(){
        Object objValue = this.get(FIELD_FIUPDATEPRIVTAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 输出表单项更新权限标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFIUpdatePrivTagDirty(){
        if(this.contains(FIELD_FIUPDATEPRIVTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输出表单项更新权限标记
     */
    @JsonIgnore
    public void resetFIUpdatePrivTag(){
        this.reset(FIELD_FIUPDATEPRIVTAG);
    }

    /**
     * 设置 输出表单项更新权限标记
     * <P>
     * 等同 {@link #setFIUpdatePrivTag}
     * @param fIUpdatePrivTag
     */
    @JsonIgnore
    public PSSysApp fiupdateprivtag(Integer fIUpdatePrivTag){
        this.setFIUpdatePrivTag(fIUpdatePrivTag);
        return this;
    }

     /**
     * 设置 输出表单项更新权限标记
     * <P>
     * 等同 {@link #setFIUpdatePrivTag}
     * @param fIUpdatePrivTag
     */
    @JsonIgnore
    public PSSysApp fiupdateprivtag(Boolean fIUpdatePrivTag){
        if(fIUpdatePrivTag == null){
            this.setFIUpdatePrivTag(null);
        }
        else{
            this.setFIUpdatePrivTag(fIUpdatePrivTag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>GCNOPRIVDM</B>&nbsp;表格列无权限显示模式，指定应用中无权限表格列的默认的显示方式，未定义时为【显示空或*内容】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.NoPrivDisplayMode} 
     */
    public final static String FIELD_GCNOPRIVDM = "gcnoprivdm";

    /**
     * 设置 表格列无权限显示模式，详细说明：{@link #FIELD_GCNOPRIVDM}
     * 
     * @param gCNoPrivDM
     * 
     */
    @JsonProperty(FIELD_GCNOPRIVDM)
    public void setGCNoPrivDM(Integer gCNoPrivDM){
        this.set(FIELD_GCNOPRIVDM, gCNoPrivDM);
    }
    
    /**
     * 获取 表格列无权限显示模式  
     * @return
     */
    @JsonIgnore
    public Integer getGCNoPrivDM(){
        Object objValue = this.get(FIELD_GCNOPRIVDM);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 表格列无权限显示模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGCNoPrivDMDirty(){
        if(this.contains(FIELD_GCNOPRIVDM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表格列无权限显示模式
     */
    @JsonIgnore
    public void resetGCNoPrivDM(){
        this.reset(FIELD_GCNOPRIVDM);
    }

    /**
     * 设置 表格列无权限显示模式，详细说明：{@link #FIELD_GCNOPRIVDM}
     * <P>
     * 等同 {@link #setGCNoPrivDM}
     * @param gCNoPrivDM
     */
    @JsonIgnore
    public PSSysApp gcnoprivdm(Integer gCNoPrivDM){
        this.setGCNoPrivDM(gCNoPrivDM);
        return this;
    }

     /**
     * 设置 表格列无权限显示模式，详细说明：{@link #FIELD_GCNOPRIVDM}
     * <P>
     * 等同 {@link #setGCNoPrivDM}
     * @param gCNoPrivDM
     */
    @JsonIgnore
    public PSSysApp gcnoprivdm(net.ibizsys.psmodel.core.util.PSModelEnums.NoPrivDisplayMode gCNoPrivDM){
        if(gCNoPrivDM == null){
            this.setGCNoPrivDM(null);
        }
        else{
            this.setGCNoPrivDM(gCNoPrivDM.value);
        }
        return this;
    }

    /**
     * <B>GRIDCOLENABLEFILTER</B>&nbsp;表格列启用过滤器
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEGridColLinkMode} 
     */
    public final static String FIELD_GRIDCOLENABLEFILTER = "gridcolenablefilter";

    /**
     * 设置 表格列启用过滤器
     * 
     * @param gridColEnableFilter
     * 
     */
    @JsonProperty(FIELD_GRIDCOLENABLEFILTER)
    public void setGridColEnableFilter(Integer gridColEnableFilter){
        this.set(FIELD_GRIDCOLENABLEFILTER, gridColEnableFilter);
    }
    
    /**
     * 获取 表格列启用过滤器  
     * @return
     */
    @JsonIgnore
    public Integer getGridColEnableFilter(){
        Object objValue = this.get(FIELD_GRIDCOLENABLEFILTER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 表格列启用过滤器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGridColEnableFilterDirty(){
        if(this.contains(FIELD_GRIDCOLENABLEFILTER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表格列启用过滤器
     */
    @JsonIgnore
    public void resetGridColEnableFilter(){
        this.reset(FIELD_GRIDCOLENABLEFILTER);
    }

    /**
     * 设置 表格列启用过滤器
     * <P>
     * 等同 {@link #setGridColEnableFilter}
     * @param gridColEnableFilter
     */
    @JsonIgnore
    public PSSysApp gridcolenablefilter(Integer gridColEnableFilter){
        this.setGridColEnableFilter(gridColEnableFilter);
        return this;
    }

     /**
     * 设置 表格列启用过滤器
     * <P>
     * 等同 {@link #setGridColEnableFilter}
     * @param gridColEnableFilter
     */
    @JsonIgnore
    public PSSysApp gridcolenablefilter(net.ibizsys.psmodel.core.util.PSModelEnums.DEGridColLinkMode gridColEnableFilter){
        if(gridColEnableFilter == null){
            this.setGridColEnableFilter(null);
        }
        else{
            this.setGridColEnableFilter(gridColEnableFilter.value);
        }
        return this;
    }

    /**
     * <B>GRIDCOLENABLELINK</B>&nbsp;表格列启用链接，指定应用全局启用表格列链接模式，默认为【不启用】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.AppGridColLinkMode} 
     */
    public final static String FIELD_GRIDCOLENABLELINK = "gridcolenablelink";

    /**
     * 设置 表格列启用链接，详细说明：{@link #FIELD_GRIDCOLENABLELINK}
     * 
     * @param gridColEnableLink
     * 
     */
    @JsonProperty(FIELD_GRIDCOLENABLELINK)
    public void setGridColEnableLink(Integer gridColEnableLink){
        this.set(FIELD_GRIDCOLENABLELINK, gridColEnableLink);
    }
    
    /**
     * 获取 表格列启用链接  
     * @return
     */
    @JsonIgnore
    public Integer getGridColEnableLink(){
        Object objValue = this.get(FIELD_GRIDCOLENABLELINK);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 表格列启用链接 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGridColEnableLinkDirty(){
        if(this.contains(FIELD_GRIDCOLENABLELINK)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表格列启用链接
     */
    @JsonIgnore
    public void resetGridColEnableLink(){
        this.reset(FIELD_GRIDCOLENABLELINK);
    }

    /**
     * 设置 表格列启用链接，详细说明：{@link #FIELD_GRIDCOLENABLELINK}
     * <P>
     * 等同 {@link #setGridColEnableLink}
     * @param gridColEnableLink
     */
    @JsonIgnore
    public PSSysApp gridcolenablelink(Integer gridColEnableLink){
        this.setGridColEnableLink(gridColEnableLink);
        return this;
    }

     /**
     * 设置 表格列启用链接，详细说明：{@link #FIELD_GRIDCOLENABLELINK}
     * <P>
     * 等同 {@link #setGridColEnableLink}
     * @param gridColEnableLink
     */
    @JsonIgnore
    public PSSysApp gridcolenablelink(net.ibizsys.psmodel.core.util.PSModelEnums.AppGridColLinkMode gridColEnableLink){
        if(gridColEnableLink == null){
            this.setGridColEnableLink(null);
        }
        else{
            this.setGridColEnableLink(gridColEnableLink.value);
        }
        return this;
    }

    /**
     * <B>GRIDENABLECUSTOMIZED</B>&nbsp;表格启用定制
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_GRIDENABLECUSTOMIZED = "gridenablecustomized";

    /**
     * 设置 表格启用定制
     * 
     * @param gridEnableCustomized
     * 
     */
    @JsonProperty(FIELD_GRIDENABLECUSTOMIZED)
    public void setGridEnableCustomized(Integer gridEnableCustomized){
        this.set(FIELD_GRIDENABLECUSTOMIZED, gridEnableCustomized);
    }
    
    /**
     * 获取 表格启用定制  
     * @return
     */
    @JsonIgnore
    public Integer getGridEnableCustomized(){
        Object objValue = this.get(FIELD_GRIDENABLECUSTOMIZED);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 表格启用定制 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGridEnableCustomizedDirty(){
        if(this.contains(FIELD_GRIDENABLECUSTOMIZED)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表格启用定制
     */
    @JsonIgnore
    public void resetGridEnableCustomized(){
        this.reset(FIELD_GRIDENABLECUSTOMIZED);
    }

    /**
     * 设置 表格启用定制
     * <P>
     * 等同 {@link #setGridEnableCustomized}
     * @param gridEnableCustomized
     */
    @JsonIgnore
    public PSSysApp gridenablecustomized(Integer gridEnableCustomized){
        this.setGridEnableCustomized(gridEnableCustomized);
        return this;
    }

     /**
     * 设置 表格启用定制
     * <P>
     * 等同 {@link #setGridEnableCustomized}
     * @param gridEnableCustomized
     */
    @JsonIgnore
    public PSSysApp gridenablecustomized(Boolean gridEnableCustomized){
        if(gridEnableCustomized == null){
            this.setGridEnableCustomized(null);
        }
        else{
            this.setGridEnableCustomized(gridEnableCustomized?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>GRIDFORCEFIT</B>&nbsp;表格适应屏宽，指定应用全局启用表格适应屏宽，默认为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_GRIDFORCEFIT = "gridforcefit";

    /**
     * 设置 表格适应屏宽，详细说明：{@link #FIELD_GRIDFORCEFIT}
     * 
     * @param gridForceFit
     * 
     */
    @JsonProperty(FIELD_GRIDFORCEFIT)
    public void setGridForceFit(Integer gridForceFit){
        this.set(FIELD_GRIDFORCEFIT, gridForceFit);
    }
    
    /**
     * 获取 表格适应屏宽  
     * @return
     */
    @JsonIgnore
    public Integer getGridForceFit(){
        Object objValue = this.get(FIELD_GRIDFORCEFIT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 表格适应屏宽 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGridForceFitDirty(){
        if(this.contains(FIELD_GRIDFORCEFIT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表格适应屏宽
     */
    @JsonIgnore
    public void resetGridForceFit(){
        this.reset(FIELD_GRIDFORCEFIT);
    }

    /**
     * 设置 表格适应屏宽，详细说明：{@link #FIELD_GRIDFORCEFIT}
     * <P>
     * 等同 {@link #setGridForceFit}
     * @param gridForceFit
     */
    @JsonIgnore
    public PSSysApp gridforcefit(Integer gridForceFit){
        this.setGridForceFit(gridForceFit);
        return this;
    }

     /**
     * 设置 表格适应屏宽，详细说明：{@link #FIELD_GRIDFORCEFIT}
     * <P>
     * 等同 {@link #setGridForceFit}
     * @param gridForceFit
     */
    @JsonIgnore
    public PSSysApp gridforcefit(Boolean gridForceFit){
        if(gridForceFit == null){
            this.setGridForceFit(null);
        }
        else{
            this.setGridForceFit(gridForceFit?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>GRIDROWACTIVEMODE</B>&nbsp;表格行激活模式，激活数据是指执行选中数据的默认逻辑，如打开视图。指定应用全局表格行数据的激活模式，默认为【双击】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.GridRowActiveMode} 
     */
    public final static String FIELD_GRIDROWACTIVEMODE = "gridrowactivemode";

    /**
     * 设置 表格行激活模式，详细说明：{@link #FIELD_GRIDROWACTIVEMODE}
     * 
     * @param gridRowActiveMode
     * 
     */
    @JsonProperty(FIELD_GRIDROWACTIVEMODE)
    public void setGridRowActiveMode(Integer gridRowActiveMode){
        this.set(FIELD_GRIDROWACTIVEMODE, gridRowActiveMode);
    }
    
    /**
     * 获取 表格行激活模式  
     * @return
     */
    @JsonIgnore
    public Integer getGridRowActiveMode(){
        Object objValue = this.get(FIELD_GRIDROWACTIVEMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 表格行激活模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGridRowActiveModeDirty(){
        if(this.contains(FIELD_GRIDROWACTIVEMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表格行激活模式
     */
    @JsonIgnore
    public void resetGridRowActiveMode(){
        this.reset(FIELD_GRIDROWACTIVEMODE);
    }

    /**
     * 设置 表格行激活模式，详细说明：{@link #FIELD_GRIDROWACTIVEMODE}
     * <P>
     * 等同 {@link #setGridRowActiveMode}
     * @param gridRowActiveMode
     */
    @JsonIgnore
    public PSSysApp gridrowactivemode(Integer gridRowActiveMode){
        this.setGridRowActiveMode(gridRowActiveMode);
        return this;
    }

     /**
     * 设置 表格行激活模式，详细说明：{@link #FIELD_GRIDROWACTIVEMODE}
     * <P>
     * 等同 {@link #setGridRowActiveMode}
     * @param gridRowActiveMode
     */
    @JsonIgnore
    public PSSysApp gridrowactivemode(net.ibizsys.psmodel.core.util.PSModelEnums.GridRowActiveMode gridRowActiveMode){
        if(gridRowActiveMode == null){
            this.setGridRowActiveMode(null);
        }
        else{
            this.setGridRowActiveMode(gridRowActiveMode.value);
        }
        return this;
    }

    /**
     * <B>HEADERINFO</B>&nbsp;头部信息，指定应用的头部信息，默认首页视图头部信息将优先使用此内容
     */
    public final static String FIELD_HEADERINFO = "headerinfo";

    /**
     * 设置 头部信息，详细说明：{@link #FIELD_HEADERINFO}
     * 
     * @param headerInfo
     * 
     */
    @JsonProperty(FIELD_HEADERINFO)
    public void setHeaderInfo(String headerInfo){
        this.set(FIELD_HEADERINFO, headerInfo);
    }
    
    /**
     * 获取 头部信息  
     * @return
     */
    @JsonIgnore
    public String getHeaderInfo(){
        Object objValue = this.get(FIELD_HEADERINFO);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 头部信息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHeaderInfoDirty(){
        if(this.contains(FIELD_HEADERINFO)){
            return true;
        }
        return false;
    }

    /**
     * 重置 头部信息
     */
    @JsonIgnore
    public void resetHeaderInfo(){
        this.reset(FIELD_HEADERINFO);
    }

    /**
     * 设置 头部信息，详细说明：{@link #FIELD_HEADERINFO}
     * <P>
     * 等同 {@link #setHeaderInfo}
     * @param headerInfo
     */
    @JsonIgnore
    public PSSysApp headerinfo(String headerInfo){
        this.setHeaderInfo(headerInfo);
        return this;
    }

    /**
     * <B>ICONFILE</B>&nbsp;图标文件
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ICONFILE = "iconfile";

    /**
     * 设置 图标文件
     * 
     * @param iconFile
     * 
     */
    @JsonProperty(FIELD_ICONFILE)
    public void setIconFile(String iconFile){
        this.set(FIELD_ICONFILE, iconFile);
    }
    
    /**
     * 获取 图标文件  
     * @return
     */
    @JsonIgnore
    public String getIconFile(){
        Object objValue = this.get(FIELD_ICONFILE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 图标文件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIconFileDirty(){
        if(this.contains(FIELD_ICONFILE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图标文件
     */
    @JsonIgnore
    public void resetIconFile(){
        this.reset(FIELD_ICONFILE);
    }

    /**
     * 设置 图标文件
     * <P>
     * 等同 {@link #setIconFile}
     * @param iconFile
     */
    @JsonIgnore
    public PSSysApp iconfile(String iconFile){
        this.setIconFile(iconFile);
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;中文名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_LOGICNAME = "logicname";

    /**
     * 设置 中文名称
     * 
     * @param logicName
     * 
     */
    @JsonProperty(FIELD_LOGICNAME)
    public void setLogicName(String logicName){
        this.set(FIELD_LOGICNAME, logicName);
    }
    
    /**
     * 获取 中文名称  
     * @return
     */
    @JsonIgnore
    public String getLogicName(){
        Object objValue = this.get(FIELD_LOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 中文名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLogicNameDirty(){
        if(this.contains(FIELD_LOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 中文名称
     */
    @JsonIgnore
    public void resetLogicName(){
        this.reset(FIELD_LOGICNAME);
    }

    /**
     * 设置 中文名称
     * <P>
     * 等同 {@link #setLogicName}
     * @param logicName
     */
    @JsonIgnore
    public PSSysApp logicname(String logicName){
        this.setLogicName(logicName);
        return this;
    }

    /**
     * <B>MAINMENUSIDE</B>&nbsp;视图主菜单位置，指定应用全局默认的视图主菜单位置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.AppIndexViewMenuAlign} 
     */
    public final static String FIELD_MAINMENUSIDE = "mainmenuside";

    /**
     * 设置 视图主菜单位置，详细说明：{@link #FIELD_MAINMENUSIDE}
     * 
     * @param mainMenuSide
     * 
     */
    @JsonProperty(FIELD_MAINMENUSIDE)
    public void setMainMenuSide(String mainMenuSide){
        this.set(FIELD_MAINMENUSIDE, mainMenuSide);
    }
    
    /**
     * 获取 视图主菜单位置  
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
     * 判断 视图主菜单位置 是否指定值，包括空值
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
     * 重置 视图主菜单位置
     */
    @JsonIgnore
    public void resetMainMenuSide(){
        this.reset(FIELD_MAINMENUSIDE);
    }

    /**
     * 设置 视图主菜单位置，详细说明：{@link #FIELD_MAINMENUSIDE}
     * <P>
     * 等同 {@link #setMainMenuSide}
     * @param mainMenuSide
     */
    @JsonIgnore
    public PSSysApp mainmenuside(String mainMenuSide){
        this.setMainMenuSide(mainMenuSide);
        return this;
    }

     /**
     * 设置 视图主菜单位置，详细说明：{@link #FIELD_MAINMENUSIDE}
     * <P>
     * 等同 {@link #setMainMenuSide}
     * @param mainMenuSide
     */
    @JsonIgnore
    public PSSysApp mainmenuside(net.ibizsys.psmodel.core.util.PSModelEnums.AppIndexViewMenuAlign mainMenuSide){
        if(mainMenuSide == null){
            this.setMainMenuSide(null);
        }
        else{
            this.setMainMenuSide(mainMenuSide.value);
        }
        return this;
    }

    /**
     * <B>MDCTRLEMPTYTEXT</B>&nbsp;多数据部件无值显示内容，指定前端应用默认的多数据部件无值显示内容
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_MDCTRLEMPTYTEXT = "mdctrlemptytext";

    /**
     * 设置 多数据部件无值显示内容，详细说明：{@link #FIELD_MDCTRLEMPTYTEXT}
     * 
     * @param mDCtrlEmptyText
     * 
     */
    @JsonProperty(FIELD_MDCTRLEMPTYTEXT)
    public void setMDCtrlEmptyText(String mDCtrlEmptyText){
        this.set(FIELD_MDCTRLEMPTYTEXT, mDCtrlEmptyText);
    }
    
    /**
     * 获取 多数据部件无值显示内容  
     * @return
     */
    @JsonIgnore
    public String getMDCtrlEmptyText(){
        Object objValue = this.get(FIELD_MDCTRLEMPTYTEXT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 多数据部件无值显示内容 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMDCtrlEmptyTextDirty(){
        if(this.contains(FIELD_MDCTRLEMPTYTEXT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 多数据部件无值显示内容
     */
    @JsonIgnore
    public void resetMDCtrlEmptyText(){
        this.reset(FIELD_MDCTRLEMPTYTEXT);
    }

    /**
     * 设置 多数据部件无值显示内容，详细说明：{@link #FIELD_MDCTRLEMPTYTEXT}
     * <P>
     * 等同 {@link #setMDCtrlEmptyText}
     * @param mDCtrlEmptyText
     */
    @JsonIgnore
    public PSSysApp mdctrlemptytext(String mDCtrlEmptyText){
        this.setMDCtrlEmptyText(mDCtrlEmptyText);
        return this;
    }

    /**
     * <B>MDCTRLEMPTYTEXTPSLANRESID</B>&nbsp;多数据部件无值内容语言资源，指定前端应用默认的多数据部件无值显示内容的多语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_MDCTRLEMPTYTEXTPSLANRESID = "mdctrlemptytextpslanresid";

    /**
     * 设置 多数据部件无值内容语言资源，详细说明：{@link #FIELD_MDCTRLEMPTYTEXTPSLANRESID}
     * 
     * @param mDCtrlEmptyTextPSLanResId
     * 
     */
    @JsonProperty(FIELD_MDCTRLEMPTYTEXTPSLANRESID)
    public void setMDCtrlEmptyTextPSLanResId(String mDCtrlEmptyTextPSLanResId){
        this.set(FIELD_MDCTRLEMPTYTEXTPSLANRESID, mDCtrlEmptyTextPSLanResId);
    }
    
    /**
     * 获取 多数据部件无值内容语言资源  
     * @return
     */
    @JsonIgnore
    public String getMDCtrlEmptyTextPSLanResId(){
        Object objValue = this.get(FIELD_MDCTRLEMPTYTEXTPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 多数据部件无值内容语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMDCtrlEmptyTextPSLanResIdDirty(){
        if(this.contains(FIELD_MDCTRLEMPTYTEXTPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 多数据部件无值内容语言资源
     */
    @JsonIgnore
    public void resetMDCtrlEmptyTextPSLanResId(){
        this.reset(FIELD_MDCTRLEMPTYTEXTPSLANRESID);
    }

    /**
     * 设置 多数据部件无值内容语言资源，详细说明：{@link #FIELD_MDCTRLEMPTYTEXTPSLANRESID}
     * <P>
     * 等同 {@link #setMDCtrlEmptyTextPSLanResId}
     * @param mDCtrlEmptyTextPSLanResId
     */
    @JsonIgnore
    public PSSysApp mdctrlemptytextpslanresid(String mDCtrlEmptyTextPSLanResId){
        this.setMDCtrlEmptyTextPSLanResId(mDCtrlEmptyTextPSLanResId);
        return this;
    }

    /**
     * 设置 多数据部件无值内容语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMDCtrlEmptyTextPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSSysApp mdctrlemptytextpslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setMDCtrlEmptyTextPSLanResId(null);
            this.setMDCtrlEmptyTextPSLanResName(null);
        }
        else{
            this.setMDCtrlEmptyTextPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setMDCtrlEmptyTextPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>MDCTRLEMPTYTEXTPSLANRESNAME</B>&nbsp;多数据部件无值内容语言资源，指定前端应用默认的多数据部件无值显示内容的多语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MDCTRLEMPTYTEXTPSLANRESID}
     */
    public final static String FIELD_MDCTRLEMPTYTEXTPSLANRESNAME = "mdctrlemptytextpslanresname";

    /**
     * 设置 多数据部件无值内容语言资源，详细说明：{@link #FIELD_MDCTRLEMPTYTEXTPSLANRESNAME}
     * 
     * @param mDCtrlEmptyTextPSLanResName
     * 
     */
    @JsonProperty(FIELD_MDCTRLEMPTYTEXTPSLANRESNAME)
    public void setMDCtrlEmptyTextPSLanResName(String mDCtrlEmptyTextPSLanResName){
        this.set(FIELD_MDCTRLEMPTYTEXTPSLANRESNAME, mDCtrlEmptyTextPSLanResName);
    }
    
    /**
     * 获取 多数据部件无值内容语言资源  
     * @return
     */
    @JsonIgnore
    public String getMDCtrlEmptyTextPSLanResName(){
        Object objValue = this.get(FIELD_MDCTRLEMPTYTEXTPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 多数据部件无值内容语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMDCtrlEmptyTextPSLanResNameDirty(){
        if(this.contains(FIELD_MDCTRLEMPTYTEXTPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 多数据部件无值内容语言资源
     */
    @JsonIgnore
    public void resetMDCtrlEmptyTextPSLanResName(){
        this.reset(FIELD_MDCTRLEMPTYTEXTPSLANRESNAME);
    }

    /**
     * 设置 多数据部件无值内容语言资源，详细说明：{@link #FIELD_MDCTRLEMPTYTEXTPSLANRESNAME}
     * <P>
     * 等同 {@link #setMDCtrlEmptyTextPSLanResName}
     * @param mDCtrlEmptyTextPSLanResName
     */
    @JsonIgnore
    public PSSysApp mdctrlemptytextpslanresname(String mDCtrlEmptyTextPSLanResName){
        this.setMDCtrlEmptyTextPSLanResName(mDCtrlEmptyTextPSLanResName);
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
    public PSSysApp memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;排序值
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 排序值
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
     * 设置 排序值
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSSysApp ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>ORIENTATIONMODE</B>&nbsp;移动端横竖屏设置，指定应用在移动端模型下的横竖屏设置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.MobAppOrientationMode} 
     */
    public final static String FIELD_ORIENTATIONMODE = "orientationmode";

    /**
     * 设置 移动端横竖屏设置，详细说明：{@link #FIELD_ORIENTATIONMODE}
     * 
     * @param orientationMode
     * 
     */
    @JsonProperty(FIELD_ORIENTATIONMODE)
    public void setOrientationMode(String orientationMode){
        this.set(FIELD_ORIENTATIONMODE, orientationMode);
    }
    
    /**
     * 获取 移动端横竖屏设置  
     * @return
     */
    @JsonIgnore
    public String getOrientationMode(){
        Object objValue = this.get(FIELD_ORIENTATIONMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端横竖屏设置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOrientationModeDirty(){
        if(this.contains(FIELD_ORIENTATIONMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端横竖屏设置
     */
    @JsonIgnore
    public void resetOrientationMode(){
        this.reset(FIELD_ORIENTATIONMODE);
    }

    /**
     * 设置 移动端横竖屏设置，详细说明：{@link #FIELD_ORIENTATIONMODE}
     * <P>
     * 等同 {@link #setOrientationMode}
     * @param orientationMode
     */
    @JsonIgnore
    public PSSysApp orientationmode(String orientationMode){
        this.setOrientationMode(orientationMode);
        return this;
    }

     /**
     * 设置 移动端横竖屏设置，详细说明：{@link #FIELD_ORIENTATIONMODE}
     * <P>
     * 等同 {@link #setOrientationMode}
     * @param orientationMode
     */
    @JsonIgnore
    public PSSysApp orientationmode(net.ibizsys.psmodel.core.util.PSModelEnums.MobAppOrientationMode orientationMode){
        if(orientationMode == null){
            this.setOrientationMode(null);
        }
        else{
            this.setOrientationMode(orientationMode.value);
        }
        return this;
    }

    /**
     * <B>PFSTYLEPARAM</B>&nbsp;应用样式参数，指定前端应用的前端模板样式参数，前端模板发布时引擎将注入样式参数，模板可根据这些参数动态控制输出内容
     */
    public final static String FIELD_PFSTYLEPARAM = "pfstyleparam";

    /**
     * 设置 应用样式参数，详细说明：{@link #FIELD_PFSTYLEPARAM}
     * 
     * @param pFStyleParam
     * 
     */
    @JsonProperty(FIELD_PFSTYLEPARAM)
    public void setPFStyleParam(String pFStyleParam){
        this.set(FIELD_PFSTYLEPARAM, pFStyleParam);
    }
    
    /**
     * 获取 应用样式参数  
     * @return
     */
    @JsonIgnore
    public String getPFStyleParam(){
        Object objValue = this.get(FIELD_PFSTYLEPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用样式参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPFStyleParamDirty(){
        if(this.contains(FIELD_PFSTYLEPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用样式参数
     */
    @JsonIgnore
    public void resetPFStyleParam(){
        this.reset(FIELD_PFSTYLEPARAM);
    }

    /**
     * 设置 应用样式参数，详细说明：{@link #FIELD_PFSTYLEPARAM}
     * <P>
     * 等同 {@link #setPFStyleParam}
     * @param pFStyleParam
     */
    @JsonIgnore
    public PSSysApp pfstyleparam(String pFStyleParam){
        this.setPFStyleParam(pFStyleParam);
        return this;
    }

    /**
     * <B>PSAPPTYPEID</B>&nbsp;应用类型，应用程序类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SysAppType} 
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSAppType} 
     */
    public final static String FIELD_PSAPPTYPEID = "psapptypeid";

    /**
     * 设置 应用类型，详细说明：{@link #FIELD_PSAPPTYPEID}
     * 
     * @param pSAppTypeId
     * 
     */
    @JsonProperty(FIELD_PSAPPTYPEID)
    public void setPSAppTypeId(String pSAppTypeId){
        this.set(FIELD_PSAPPTYPEID, pSAppTypeId);
    }
    
    /**
     * 获取 应用类型  
     * @return
     */
    @JsonIgnore
    public String getPSAppTypeId(){
        Object objValue = this.get(FIELD_PSAPPTYPEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppTypeIdDirty(){
        if(this.contains(FIELD_PSAPPTYPEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用类型
     */
    @JsonIgnore
    public void resetPSAppTypeId(){
        this.reset(FIELD_PSAPPTYPEID);
    }

    /**
     * 设置 应用类型，详细说明：{@link #FIELD_PSAPPTYPEID}
     * <P>
     * 等同 {@link #setPSAppTypeId}
     * @param pSAppTypeId
     */
    @JsonIgnore
    public PSSysApp psapptypeid(String pSAppTypeId){
        this.setPSAppTypeId(pSAppTypeId);
        return this;
    }

    /**
     * 设置 应用类型，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSAppTypeId}
     * @param pSAppType 引用对象
     */
    @JsonIgnore
    public PSSysApp psapptypeid(PSAppType pSAppType){
        if(pSAppType == null){
            this.setPSAppTypeId(null);
            this.setPSAppTypeName(null);
        }
        else{
            this.setPSAppTypeId(pSAppType.getPSAppTypeId());
            this.setPSAppTypeName(pSAppType.getPSAppTypeName());
        }
        return this;
    }

    /**
     * <B>PSAPPTYPENAME</B>&nbsp;应用类型，应用程序类型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSAPPTYPEID}
     */
    public final static String FIELD_PSAPPTYPENAME = "psapptypename";

    /**
     * 设置 应用类型，详细说明：{@link #FIELD_PSAPPTYPENAME}
     * 
     * @param pSAppTypeName
     * 
     */
    @JsonProperty(FIELD_PSAPPTYPENAME)
    public void setPSAppTypeName(String pSAppTypeName){
        this.set(FIELD_PSAPPTYPENAME, pSAppTypeName);
    }
    
    /**
     * 获取 应用类型  
     * @return
     */
    @JsonIgnore
    public String getPSAppTypeName(){
        Object objValue = this.get(FIELD_PSAPPTYPENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppTypeNameDirty(){
        if(this.contains(FIELD_PSAPPTYPENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用类型
     */
    @JsonIgnore
    public void resetPSAppTypeName(){
        this.reset(FIELD_PSAPPTYPENAME);
    }

    /**
     * 设置 应用类型，详细说明：{@link #FIELD_PSAPPTYPENAME}
     * <P>
     * 等同 {@link #setPSAppTypeName}
     * @param pSAppTypeName
     */
    @JsonIgnore
    public PSSysApp psapptypename(String pSAppTypeName){
        this.setPSAppTypeName(pSAppTypeName);
        return this;
    }

    /**
     * <B>PSCTRLLOGICGROUPID</B>&nbsp;应用全局逻辑组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSCtrlLogicGroup} 
     */
    public final static String FIELD_PSCTRLLOGICGROUPID = "psctrllogicgroupid";

    /**
     * 设置 应用全局逻辑组
     * 
     * @param pSCtrlLogicGroupId
     * 
     */
    @JsonProperty(FIELD_PSCTRLLOGICGROUPID)
    public void setPSCtrlLogicGroupId(String pSCtrlLogicGroupId){
        this.set(FIELD_PSCTRLLOGICGROUPID, pSCtrlLogicGroupId);
    }
    
    /**
     * 获取 应用全局逻辑组  
     * @return
     */
    @JsonIgnore
    public String getPSCtrlLogicGroupId(){
        Object objValue = this.get(FIELD_PSCTRLLOGICGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用全局逻辑组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCtrlLogicGroupIdDirty(){
        if(this.contains(FIELD_PSCTRLLOGICGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用全局逻辑组
     */
    @JsonIgnore
    public void resetPSCtrlLogicGroupId(){
        this.reset(FIELD_PSCTRLLOGICGROUPID);
    }

    /**
     * 设置 应用全局逻辑组
     * <P>
     * 等同 {@link #setPSCtrlLogicGroupId}
     * @param pSCtrlLogicGroupId
     */
    @JsonIgnore
    public PSSysApp psctrllogicgroupid(String pSCtrlLogicGroupId){
        this.setPSCtrlLogicGroupId(pSCtrlLogicGroupId);
        return this;
    }

    /**
     * 设置 应用全局逻辑组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSCtrlLogicGroupId}
     * @param pSCtrlLogicGroup 引用对象
     */
    @JsonIgnore
    public PSSysApp psctrllogicgroupid(PSCtrlLogicGroup pSCtrlLogicGroup){
        if(pSCtrlLogicGroup == null){
            this.setPSCtrlLogicGroupId(null);
            this.setPSCtrlLogicGroupName(null);
        }
        else{
            this.setPSCtrlLogicGroupId(pSCtrlLogicGroup.getPSCtrlLogicGroupId());
            this.setPSCtrlLogicGroupName(pSCtrlLogicGroup.getPSCtrlLogicGroupName());
        }
        return this;
    }

    /**
     * <B>PSCTRLLOGICGROUPNAME</B>&nbsp;应用逻辑组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCTRLLOGICGROUPID}
     */
    public final static String FIELD_PSCTRLLOGICGROUPNAME = "psctrllogicgroupname";

    /**
     * 设置 应用逻辑组
     * 
     * @param pSCtrlLogicGroupName
     * 
     */
    @JsonProperty(FIELD_PSCTRLLOGICGROUPNAME)
    public void setPSCtrlLogicGroupName(String pSCtrlLogicGroupName){
        this.set(FIELD_PSCTRLLOGICGROUPNAME, pSCtrlLogicGroupName);
    }
    
    /**
     * 获取 应用逻辑组  
     * @return
     */
    @JsonIgnore
    public String getPSCtrlLogicGroupName(){
        Object objValue = this.get(FIELD_PSCTRLLOGICGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用逻辑组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCtrlLogicGroupNameDirty(){
        if(this.contains(FIELD_PSCTRLLOGICGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用逻辑组
     */
    @JsonIgnore
    public void resetPSCtrlLogicGroupName(){
        this.reset(FIELD_PSCTRLLOGICGROUPNAME);
    }

    /**
     * 设置 应用逻辑组
     * <P>
     * 等同 {@link #setPSCtrlLogicGroupName}
     * @param pSCtrlLogicGroupName
     */
    @JsonIgnore
    public PSSysApp psctrllogicgroupname(String pSCtrlLogicGroupName){
        this.setPSCtrlLogicGroupName(pSCtrlLogicGroupName);
        return this;
    }

    /**
     * <B>PSPFID</B>&nbsp;前端模板，指定应用使用的前端模板
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSPF} 
     */
    public final static String FIELD_PSPFID = "pspfid";

    /**
     * 设置 前端模板，详细说明：{@link #FIELD_PSPFID}
     * 
     * @param pSPFId
     * 
     */
    @JsonProperty(FIELD_PSPFID)
    public void setPSPFId(String pSPFId){
        this.set(FIELD_PSPFID, pSPFId);
    }
    
    /**
     * 获取 前端模板  
     * @return
     */
    @JsonIgnore
    public String getPSPFId(){
        Object objValue = this.get(FIELD_PSPFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端模板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSPFIdDirty(){
        if(this.contains(FIELD_PSPFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端模板
     */
    @JsonIgnore
    public void resetPSPFId(){
        this.reset(FIELD_PSPFID);
    }

    /**
     * 设置 前端模板，详细说明：{@link #FIELD_PSPFID}
     * <P>
     * 等同 {@link #setPSPFId}
     * @param pSPFId
     */
    @JsonIgnore
    public PSSysApp pspfid(String pSPFId){
        this.setPSPFId(pSPFId);
        return this;
    }

    /**
     * <B>PSPFNAME</B>&nbsp;前端模板，指定应用使用的前端模板
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSPFID}
     */
    public final static String FIELD_PSPFNAME = "pspfname";

    /**
     * 设置 前端模板，详细说明：{@link #FIELD_PSPFNAME}
     * 
     * @param pSPFName
     * 
     */
    @JsonProperty(FIELD_PSPFNAME)
    public void setPSPFName(String pSPFName){
        this.set(FIELD_PSPFNAME, pSPFName);
    }
    
    /**
     * 获取 前端模板  
     * @return
     */
    @JsonIgnore
    public String getPSPFName(){
        Object objValue = this.get(FIELD_PSPFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端模板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSPFNameDirty(){
        if(this.contains(FIELD_PSPFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端模板
     */
    @JsonIgnore
    public void resetPSPFName(){
        this.reset(FIELD_PSPFNAME);
    }

    /**
     * 设置 前端模板，详细说明：{@link #FIELD_PSPFNAME}
     * <P>
     * 等同 {@link #setPSPFName}
     * @param pSPFName
     */
    @JsonIgnore
    public PSSysApp pspfname(String pSPFName){
        this.setPSPFName(pSPFName);
        return this;
    }

    /**
     * <B>PSPFSTYLEID</B>&nbsp;应用样式，指定应用使用的前端模板样式
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSPFStyle} 
     */
    public final static String FIELD_PSPFSTYLEID = "pspfstyleid";

    /**
     * 设置 应用样式，详细说明：{@link #FIELD_PSPFSTYLEID}
     * 
     * @param pSPFStyleId
     * 
     */
    @JsonProperty(FIELD_PSPFSTYLEID)
    public void setPSPFStyleId(String pSPFStyleId){
        this.set(FIELD_PSPFSTYLEID, pSPFStyleId);
    }
    
    /**
     * 获取 应用样式  
     * @return
     */
    @JsonIgnore
    public String getPSPFStyleId(){
        Object objValue = this.get(FIELD_PSPFSTYLEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSPFStyleIdDirty(){
        if(this.contains(FIELD_PSPFSTYLEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用样式
     */
    @JsonIgnore
    public void resetPSPFStyleId(){
        this.reset(FIELD_PSPFSTYLEID);
    }

    /**
     * 设置 应用样式，详细说明：{@link #FIELD_PSPFSTYLEID}
     * <P>
     * 等同 {@link #setPSPFStyleId}
     * @param pSPFStyleId
     */
    @JsonIgnore
    public PSSysApp pspfstyleid(String pSPFStyleId){
        this.setPSPFStyleId(pSPFStyleId);
        return this;
    }

    /**
     * <B>PSPFSTYLENAME</B>&nbsp;应用样式，指定应用使用的前端模板样式
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSPFSTYLEID}
     */
    public final static String FIELD_PSPFSTYLENAME = "pspfstylename";

    /**
     * 设置 应用样式，详细说明：{@link #FIELD_PSPFSTYLENAME}
     * 
     * @param pSPFStyleName
     * 
     */
    @JsonProperty(FIELD_PSPFSTYLENAME)
    public void setPSPFStyleName(String pSPFStyleName){
        this.set(FIELD_PSPFSTYLENAME, pSPFStyleName);
    }
    
    /**
     * 获取 应用样式  
     * @return
     */
    @JsonIgnore
    public String getPSPFStyleName(){
        Object objValue = this.get(FIELD_PSPFSTYLENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSPFStyleNameDirty(){
        if(this.contains(FIELD_PSPFSTYLENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用样式
     */
    @JsonIgnore
    public void resetPSPFStyleName(){
        this.reset(FIELD_PSPFSTYLENAME);
    }

    /**
     * 设置 应用样式，详细说明：{@link #FIELD_PSPFSTYLENAME}
     * <P>
     * 等同 {@link #setPSPFStyleName}
     * @param pSPFStyleName
     */
    @JsonIgnore
    public PSSysApp pspfstylename(String pSPFStyleName){
        this.setPSPFStyleName(pSPFStyleName);
        return this;
    }

    /**
     * <B>PSSTUDIOTHEMEID</B>&nbsp;应用主题
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSTUDIOTHEMEID = "psstudiothemeid";

    /**
     * 设置 应用主题
     * 
     * @param pSStudioThemeId
     * 
     */
    @JsonProperty(FIELD_PSSTUDIOTHEMEID)
    public void setPSStudioThemeId(String pSStudioThemeId){
        this.set(FIELD_PSSTUDIOTHEMEID, pSStudioThemeId);
    }
    
    /**
     * 获取 应用主题  
     * @return
     */
    @JsonIgnore
    public String getPSStudioThemeId(){
        Object objValue = this.get(FIELD_PSSTUDIOTHEMEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用主题 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSStudioThemeIdDirty(){
        if(this.contains(FIELD_PSSTUDIOTHEMEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用主题
     */
    @JsonIgnore
    public void resetPSStudioThemeId(){
        this.reset(FIELD_PSSTUDIOTHEMEID);
    }

    /**
     * 设置 应用主题
     * <P>
     * 等同 {@link #setPSStudioThemeId}
     * @param pSStudioThemeId
     */
    @JsonIgnore
    public PSSysApp psstudiothemeid(String pSStudioThemeId){
        this.setPSStudioThemeId(pSStudioThemeId);
        return this;
    }

    /**
     * <B>PSSTUDIOTHEMENAME</B>&nbsp;应用主题
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSTUDIOTHEMEID}
     */
    public final static String FIELD_PSSTUDIOTHEMENAME = "psstudiothemename";

    /**
     * 设置 应用主题
     * 
     * @param pSStudioThemeName
     * 
     */
    @JsonProperty(FIELD_PSSTUDIOTHEMENAME)
    public void setPSStudioThemeName(String pSStudioThemeName){
        this.set(FIELD_PSSTUDIOTHEMENAME, pSStudioThemeName);
    }
    
    /**
     * 获取 应用主题  
     * @return
     */
    @JsonIgnore
    public String getPSStudioThemeName(){
        Object objValue = this.get(FIELD_PSSTUDIOTHEMENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用主题 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSStudioThemeNameDirty(){
        if(this.contains(FIELD_PSSTUDIOTHEMENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用主题
     */
    @JsonIgnore
    public void resetPSStudioThemeName(){
        this.reset(FIELD_PSSTUDIOTHEMENAME);
    }

    /**
     * 设置 应用主题
     * <P>
     * 等同 {@link #setPSStudioThemeName}
     * @param pSStudioThemeName
     */
    @JsonIgnore
    public PSSysApp psstudiothemename(String pSStudioThemeName){
        this.setPSStudioThemeName(pSStudioThemeName);
        return this;
    }

    /**
     * <B>PSSYSAPPID</B>&nbsp;系统应用标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSAPPID = "pssysappid";

    /**
     * 设置 系统应用标识
     * 
     * @param pSSysAppId
     * 
     */
    @JsonProperty(FIELD_PSSYSAPPID)
    public void setPSSysAppId(String pSSysAppId){
        this.set(FIELD_PSSYSAPPID, pSSysAppId);
    }
    
    /**
     * 获取 系统应用标识  
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
     * 判断 系统应用标识 是否指定值，包括空值
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
     * 重置 系统应用标识
     */
    @JsonIgnore
    public void resetPSSysAppId(){
        this.reset(FIELD_PSSYSAPPID);
    }

    /**
     * 设置 系统应用标识
     * <P>
     * 等同 {@link #setPSSysAppId}
     * @param pSSysAppId
     */
    @JsonIgnore
    public PSSysApp pssysappid(String pSSysAppId){
        this.setPSSysAppId(pSSysAppId);
        return this;
    }

    /**
     * <B>PSSYSAPPNAME</B>&nbsp;应用名称，指定前端应用的名称，需要在前端应用所在的模型域（系统模块或系统）中具有唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSAPPNAME = "pssysappname";

    /**
     * 设置 应用名称，详细说明：{@link #FIELD_PSSYSAPPNAME}
     * 
     * @param pSSysAppName
     * 
     */
    @JsonProperty(FIELD_PSSYSAPPNAME)
    public void setPSSysAppName(String pSSysAppName){
        this.set(FIELD_PSSYSAPPNAME, pSSysAppName);
    }
    
    /**
     * 获取 应用名称  
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
     * 判断 应用名称 是否指定值，包括空值
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
     * 重置 应用名称
     */
    @JsonIgnore
    public void resetPSSysAppName(){
        this.reset(FIELD_PSSYSAPPNAME);
    }

    /**
     * 设置 应用名称，详细说明：{@link #FIELD_PSSYSAPPNAME}
     * <P>
     * 等同 {@link #setPSSysAppName}
     * @param pSSysAppName
     */
    @JsonIgnore
    public PSSysApp pssysappname(String pSSysAppName){
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysAppName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysAppName(strName);
    }

    @JsonIgnore
    public PSSysApp name(String strName){
        this.setPSSysAppName(strName);
        return this;
    }

    /**
     * <B>PSSYSCSSID</B>&nbsp;应用挂载样式表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCss} 
     */
    public final static String FIELD_PSSYSCSSID = "pssyscssid";

    /**
     * 设置 应用挂载样式表
     * 
     * @param pSSysCssId
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSID)
    public void setPSSysCssId(String pSSysCssId){
        this.set(FIELD_PSSYSCSSID, pSSysCssId);
    }
    
    /**
     * 获取 应用挂载样式表  
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
     * 判断 应用挂载样式表 是否指定值，包括空值
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
     * 重置 应用挂载样式表
     */
    @JsonIgnore
    public void resetPSSysCssId(){
        this.reset(FIELD_PSSYSCSSID);
    }

    /**
     * 设置 应用挂载样式表
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCssId
     */
    @JsonIgnore
    public PSSysApp pssyscssid(String pSSysCssId){
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    /**
     * 设置 应用挂载样式表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSSysApp pssyscssid(PSSysCss pSSysCss){
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
     * <B>PSSYSCSSNAME</B>&nbsp;应用挂载样式表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSCSSID}
     */
    public final static String FIELD_PSSYSCSSNAME = "pssyscssname";

    /**
     * 设置 应用挂载样式表
     * 
     * @param pSSysCssName
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSNAME)
    public void setPSSysCssName(String pSSysCssName){
        this.set(FIELD_PSSYSCSSNAME, pSSysCssName);
    }
    
    /**
     * 获取 应用挂载样式表  
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
     * 判断 应用挂载样式表 是否指定值，包括空值
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
     * 重置 应用挂载样式表
     */
    @JsonIgnore
    public void resetPSSysCssName(){
        this.reset(FIELD_PSSYSCSSNAME);
    }

    /**
     * 设置 应用挂载样式表
     * <P>
     * 等同 {@link #setPSSysCssName}
     * @param pSSysCssName
     */
    @JsonIgnore
    public PSSysApp pssyscssname(String pSSysCssName){
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELID</B>&nbsp;扩展动态模型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDynaModel} 
     */
    public final static String FIELD_PSSYSDYNAMODELID = "pssysdynamodelid";

    /**
     * 设置 扩展动态模型
     * 
     * @param pSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELID)
    public void setPSSysDynaModelId(String pSSysDynaModelId){
        this.set(FIELD_PSSYSDYNAMODELID, pSSysDynaModelId);
    }
    
    /**
     * 获取 扩展动态模型  
     * @return
     */
    @JsonIgnore
    public String getPSSysDynaModelId(){
        Object objValue = this.get(FIELD_PSSYSDYNAMODELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 扩展动态模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDynaModelIdDirty(){
        if(this.contains(FIELD_PSSYSDYNAMODELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 扩展动态模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelId(){
        this.reset(FIELD_PSSYSDYNAMODELID);
    }

    /**
     * 设置 扩展动态模型
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModelId
     */
    @JsonIgnore
    public PSSysApp pssysdynamodelid(String pSSysDynaModelId){
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    /**
     * 设置 扩展动态模型，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModel 引用对象
     */
    @JsonIgnore
    public PSSysApp pssysdynamodelid(PSSysDynaModel pSSysDynaModel){
        if(pSSysDynaModel == null){
            this.setPSSysDynaModelId(null);
            this.setPSSysDynaModelName(null);
        }
        else{
            this.setPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELNAME</B>&nbsp;扩展动态模型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDYNAMODELID}
     */
    public final static String FIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";

    /**
     * 设置 扩展动态模型
     * 
     * @param pSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELNAME)
    public void setPSSysDynaModelName(String pSSysDynaModelName){
        this.set(FIELD_PSSYSDYNAMODELNAME, pSSysDynaModelName);
    }
    
    /**
     * 获取 扩展动态模型  
     * @return
     */
    @JsonIgnore
    public String getPSSysDynaModelName(){
        Object objValue = this.get(FIELD_PSSYSDYNAMODELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 扩展动态模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDynaModelNameDirty(){
        if(this.contains(FIELD_PSSYSDYNAMODELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 扩展动态模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelName(){
        this.reset(FIELD_PSSYSDYNAMODELNAME);
    }

    /**
     * 设置 扩展动态模型
     * <P>
     * 等同 {@link #setPSSysDynaModelName}
     * @param pSSysDynaModelName
     */
    @JsonIgnore
    public PSSysApp pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSSYSIMAGEID</B>&nbsp;应用图标，指定应用的图标，默认首页视图图标将优先使用此内容
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysImage} 
     */
    public final static String FIELD_PSSYSIMAGEID = "pssysimageid";

    /**
     * 设置 应用图标，详细说明：{@link #FIELD_PSSYSIMAGEID}
     * 
     * @param pSSysImageId
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGEID)
    public void setPSSysImageId(String pSSysImageId){
        this.set(FIELD_PSSYSIMAGEID, pSSysImageId);
    }
    
    /**
     * 获取 应用图标  
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
     * 判断 应用图标 是否指定值，包括空值
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
     * 重置 应用图标
     */
    @JsonIgnore
    public void resetPSSysImageId(){
        this.reset(FIELD_PSSYSIMAGEID);
    }

    /**
     * 设置 应用图标，详细说明：{@link #FIELD_PSSYSIMAGEID}
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImageId
     */
    @JsonIgnore
    public PSSysApp pssysimageid(String pSSysImageId){
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    /**
     * 设置 应用图标，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImage 引用对象
     */
    @JsonIgnore
    public PSSysApp pssysimageid(PSSysImage pSSysImage){
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
     * <B>PSSYSIMAGENAME</B>&nbsp;应用图标，指定应用的图标，默认首页视图图标将优先使用此内容
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSIMAGEID}
     */
    public final static String FIELD_PSSYSIMAGENAME = "pssysimagename";

    /**
     * 设置 应用图标，详细说明：{@link #FIELD_PSSYSIMAGENAME}
     * 
     * @param pSSysImageName
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGENAME)
    public void setPSSysImageName(String pSSysImageName){
        this.set(FIELD_PSSYSIMAGENAME, pSSysImageName);
    }
    
    /**
     * 获取 应用图标  
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
     * 判断 应用图标 是否指定值，包括空值
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
     * 重置 应用图标
     */
    @JsonIgnore
    public void resetPSSysImageName(){
        this.reset(FIELD_PSSYSIMAGENAME);
    }

    /**
     * 设置 应用图标，详细说明：{@link #FIELD_PSSYSIMAGENAME}
     * <P>
     * 等同 {@link #setPSSysImageName}
     * @param pSSysImageName
     */
    @JsonIgnore
    public PSSysApp pssysimagename(String pSSysImageName){
        this.setPSSysImageName(pSSysImageName);
        return this;
    }

    /**
     * <B>PSSYSREQITEMID</B>&nbsp;系统设计需求
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysReqItem} 
     */
    public final static String FIELD_PSSYSREQITEMID = "pssysreqitemid";

    /**
     * 设置 系统设计需求
     * 
     * @param pSSysReqItemId
     * 
     */
    @JsonProperty(FIELD_PSSYSREQITEMID)
    public void setPSSysReqItemId(String pSSysReqItemId){
        this.set(FIELD_PSSYSREQITEMID, pSSysReqItemId);
    }
    
    /**
     * 获取 系统设计需求  
     * @return
     */
    @JsonIgnore
    public String getPSSysReqItemId(){
        Object objValue = this.get(FIELD_PSSYSREQITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统设计需求 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysReqItemIdDirty(){
        if(this.contains(FIELD_PSSYSREQITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统设计需求
     */
    @JsonIgnore
    public void resetPSSysReqItemId(){
        this.reset(FIELD_PSSYSREQITEMID);
    }

    /**
     * 设置 系统设计需求
     * <P>
     * 等同 {@link #setPSSysReqItemId}
     * @param pSSysReqItemId
     */
    @JsonIgnore
    public PSSysApp pssysreqitemid(String pSSysReqItemId){
        this.setPSSysReqItemId(pSSysReqItemId);
        return this;
    }

    /**
     * 设置 系统设计需求，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysReqItemId}
     * @param pSSysReqItem 引用对象
     */
    @JsonIgnore
    public PSSysApp pssysreqitemid(PSSysReqItem pSSysReqItem){
        if(pSSysReqItem == null){
            this.setPSSysReqItemId(null);
            this.setPSSysReqItemName(null);
        }
        else{
            this.setPSSysReqItemId(pSSysReqItem.getPSSysReqItemId());
            this.setPSSysReqItemName(pSSysReqItem.getPSSysReqItemName());
        }
        return this;
    }

    /**
     * <B>PSSYSREQITEMNAME</B>&nbsp;系统设计需求
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSREQITEMID}
     */
    public final static String FIELD_PSSYSREQITEMNAME = "pssysreqitemname";

    /**
     * 设置 系统设计需求
     * 
     * @param pSSysReqItemName
     * 
     */
    @JsonProperty(FIELD_PSSYSREQITEMNAME)
    public void setPSSysReqItemName(String pSSysReqItemName){
        this.set(FIELD_PSSYSREQITEMNAME, pSSysReqItemName);
    }
    
    /**
     * 获取 系统设计需求  
     * @return
     */
    @JsonIgnore
    public String getPSSysReqItemName(){
        Object objValue = this.get(FIELD_PSSYSREQITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统设计需求 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysReqItemNameDirty(){
        if(this.contains(FIELD_PSSYSREQITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统设计需求
     */
    @JsonIgnore
    public void resetPSSysReqItemName(){
        this.reset(FIELD_PSSYSREQITEMNAME);
    }

    /**
     * 设置 系统设计需求
     * <P>
     * 等同 {@link #setPSSysReqItemName}
     * @param pSSysReqItemName
     */
    @JsonIgnore
    public PSSysApp pssysreqitemname(String pSSysReqItemName){
        this.setPSSysReqItemName(pSSysReqItemName);
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
    public PSSysApp pssysresourceid(String pSSysResourceId){
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
    public PSSysApp pssysresourceid(PSSysResource pSSysResource){
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
    public PSSysApp pssysresourcename(String pSSysResourceName){
        this.setPSSysResourceName(pSSysResourceName);
        return this;
    }

    /**
     * <B>PSSYSSERVICEAPIID</B>&nbsp;默认服务接口，指定应用使用的默认服务接口，前后端分离体系应用是通过服务接口与后台交互，应用同时支持使用多个服务接口
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysServiceAPI} 
     */
    public final static String FIELD_PSSYSSERVICEAPIID = "pssysserviceapiid";

    /**
     * 设置 默认服务接口，详细说明：{@link #FIELD_PSSYSSERVICEAPIID}
     * 
     * @param pSSysServiceAPIId
     * 
     */
    @JsonProperty(FIELD_PSSYSSERVICEAPIID)
    public void setPSSysServiceAPIId(String pSSysServiceAPIId){
        this.set(FIELD_PSSYSSERVICEAPIID, pSSysServiceAPIId);
    }
    
    /**
     * 获取 默认服务接口  
     * @return
     */
    @JsonIgnore
    public String getPSSysServiceAPIId(){
        Object objValue = this.get(FIELD_PSSYSSERVICEAPIID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认服务接口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysServiceAPIIdDirty(){
        if(this.contains(FIELD_PSSYSSERVICEAPIID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认服务接口
     */
    @JsonIgnore
    public void resetPSSysServiceAPIId(){
        this.reset(FIELD_PSSYSSERVICEAPIID);
    }

    /**
     * 设置 默认服务接口，详细说明：{@link #FIELD_PSSYSSERVICEAPIID}
     * <P>
     * 等同 {@link #setPSSysServiceAPIId}
     * @param pSSysServiceAPIId
     */
    @JsonIgnore
    public PSSysApp pssysserviceapiid(String pSSysServiceAPIId){
        this.setPSSysServiceAPIId(pSSysServiceAPIId);
        return this;
    }

    /**
     * 设置 默认服务接口，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysServiceAPIId}
     * @param pSSysServiceAPI 引用对象
     */
    @JsonIgnore
    public PSSysApp pssysserviceapiid(PSSysServiceAPI pSSysServiceAPI){
        if(pSSysServiceAPI == null){
            this.setPSSysServiceAPIId(null);
            this.setPSSysServiceAPIName(null);
        }
        else{
            this.setPSSysServiceAPIId(pSSysServiceAPI.getPSSysServiceAPIId());
            this.setPSSysServiceAPIName(pSSysServiceAPI.getPSSysServiceAPIName());
        }
        return this;
    }

    /**
     * <B>PSSYSSERVICEAPINAME</B>&nbsp;默认服务接口，指定应用使用的默认服务接口，前后端分离体系应用是通过服务接口与后台交互，应用同时支持使用多个服务接口
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSERVICEAPIID}
     */
    public final static String FIELD_PSSYSSERVICEAPINAME = "pssysserviceapiname";

    /**
     * 设置 默认服务接口，详细说明：{@link #FIELD_PSSYSSERVICEAPINAME}
     * 
     * @param pSSysServiceAPIName
     * 
     */
    @JsonProperty(FIELD_PSSYSSERVICEAPINAME)
    public void setPSSysServiceAPIName(String pSSysServiceAPIName){
        this.set(FIELD_PSSYSSERVICEAPINAME, pSSysServiceAPIName);
    }
    
    /**
     * 获取 默认服务接口  
     * @return
     */
    @JsonIgnore
    public String getPSSysServiceAPIName(){
        Object objValue = this.get(FIELD_PSSYSSERVICEAPINAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认服务接口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysServiceAPINameDirty(){
        if(this.contains(FIELD_PSSYSSERVICEAPINAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认服务接口
     */
    @JsonIgnore
    public void resetPSSysServiceAPIName(){
        this.reset(FIELD_PSSYSSERVICEAPINAME);
    }

    /**
     * 设置 默认服务接口，详细说明：{@link #FIELD_PSSYSSERVICEAPINAME}
     * <P>
     * 等同 {@link #setPSSysServiceAPIName}
     * @param pSSysServiceAPIName
     */
    @JsonIgnore
    public PSSysApp pssysserviceapiname(String pSSysServiceAPIName){
        this.setPSSysServiceAPIName(pSSysServiceAPIName);
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINID</B>&nbsp;后端模板插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysSFPlugin} 
     */
    public final static String FIELD_PSSYSSFPLUGINID = "pssyssfpluginid";

    /**
     * 设置 后端模板插件
     * 
     * @param pSSysSFPluginId
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINID)
    public void setPSSysSFPluginId(String pSSysSFPluginId){
        this.set(FIELD_PSSYSSFPLUGINID, pSSysSFPluginId);
    }
    
    /**
     * 获取 后端模板插件  
     * @return
     */
    @JsonIgnore
    public String getPSSysSFPluginId(){
        Object objValue = this.get(FIELD_PSSYSSFPLUGINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后端模板插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSFPluginIdDirty(){
        if(this.contains(FIELD_PSSYSSFPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后端模板插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginId(){
        this.reset(FIELD_PSSYSSFPLUGINID);
    }

    /**
     * 设置 后端模板插件
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPluginId
     */
    @JsonIgnore
    public PSSysApp pssyssfpluginid(String pSSysSFPluginId){
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    /**
     * 设置 后端模板插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPlugin 引用对象
     */
    @JsonIgnore
    public PSSysApp pssyssfpluginid(PSSysSFPlugin pSSysSFPlugin){
        if(pSSysSFPlugin == null){
            this.setPSSysSFPluginId(null);
            this.setPSSysSFPluginName(null);
        }
        else{
            this.setPSSysSFPluginId(pSSysSFPlugin.getPSSysSFPluginId());
            this.setPSSysSFPluginName(pSSysSFPlugin.getPSSysSFPluginName());
        }
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINNAME</B>&nbsp;后端模板插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSFPLUGINID}
     */
    public final static String FIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";

    /**
     * 设置 后端模板插件
     * 
     * @param pSSysSFPluginName
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINNAME)
    public void setPSSysSFPluginName(String pSSysSFPluginName){
        this.set(FIELD_PSSYSSFPLUGINNAME, pSSysSFPluginName);
    }
    
    /**
     * 获取 后端模板插件  
     * @return
     */
    @JsonIgnore
    public String getPSSysSFPluginName(){
        Object objValue = this.get(FIELD_PSSYSSFPLUGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后端模板插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSFPluginNameDirty(){
        if(this.contains(FIELD_PSSYSSFPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后端模板插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginName(){
        this.reset(FIELD_PSSYSSFPLUGINNAME);
    }

    /**
     * 设置 后端模板插件
     * <P>
     * 等同 {@link #setPSSysSFPluginName}
     * @param pSSysSFPluginName
     */
    @JsonIgnore
    public PSSysApp pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    /**
     * <B>PSSYSSFPUBID</B>&nbsp;后台体系，指定应用的后台服务体系，在多后台服务发布的场景下，未指定的应用参与每个后台服务的代码发布，指定的应用只参与指定的后台服务的代码发布
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysSFPub} 
     */
    public final static String FIELD_PSSYSSFPUBID = "pssyssfpubid";

    /**
     * 设置 后台体系，详细说明：{@link #FIELD_PSSYSSFPUBID}
     * 
     * @param pSSysSFPubId
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPUBID)
    public void setPSSysSFPubId(String pSSysSFPubId){
        this.set(FIELD_PSSYSSFPUBID, pSSysSFPubId);
    }
    
    /**
     * 获取 后台体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysSFPubId(){
        Object objValue = this.get(FIELD_PSSYSSFPUBID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSFPubIdDirty(){
        if(this.contains(FIELD_PSSYSSFPUBID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台体系
     */
    @JsonIgnore
    public void resetPSSysSFPubId(){
        this.reset(FIELD_PSSYSSFPUBID);
    }

    /**
     * 设置 后台体系，详细说明：{@link #FIELD_PSSYSSFPUBID}
     * <P>
     * 等同 {@link #setPSSysSFPubId}
     * @param pSSysSFPubId
     */
    @JsonIgnore
    public PSSysApp pssyssfpubid(String pSSysSFPubId){
        this.setPSSysSFPubId(pSSysSFPubId);
        return this;
    }

    /**
     * 设置 后台体系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSFPubId}
     * @param pSSysSFPub 引用对象
     */
    @JsonIgnore
    public PSSysApp pssyssfpubid(PSSysSFPub pSSysSFPub){
        if(pSSysSFPub == null){
            this.setPSSysSFPubId(null);
            this.setPSSysSFPubName(null);
        }
        else{
            this.setPSSysSFPubId(pSSysSFPub.getPSSysSFPubId());
            this.setPSSysSFPubName(pSSysSFPub.getPSSysSFPubName());
        }
        return this;
    }

    /**
     * <B>PSSYSSFPUBNAME</B>&nbsp;后台体系，指定应用的后台服务体系，在多后台服务发布的场景下，未指定的应用参与每个后台服务的代码发布，指定的应用只参与指定的后台服务的代码发布
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSFPUBID}
     */
    public final static String FIELD_PSSYSSFPUBNAME = "pssyssfpubname";

    /**
     * 设置 后台体系，详细说明：{@link #FIELD_PSSYSSFPUBNAME}
     * 
     * @param pSSysSFPubName
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPUBNAME)
    public void setPSSysSFPubName(String pSSysSFPubName){
        this.set(FIELD_PSSYSSFPUBNAME, pSSysSFPubName);
    }
    
    /**
     * 获取 后台体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysSFPubName(){
        Object objValue = this.get(FIELD_PSSYSSFPUBNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSFPubNameDirty(){
        if(this.contains(FIELD_PSSYSSFPUBNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台体系
     */
    @JsonIgnore
    public void resetPSSysSFPubName(){
        this.reset(FIELD_PSSYSSFPUBNAME);
    }

    /**
     * 设置 后台体系，详细说明：{@link #FIELD_PSSYSSFPUBNAME}
     * <P>
     * 等同 {@link #setPSSysSFPubName}
     * @param pSSysSFPubName
     */
    @JsonIgnore
    public PSSysApp pssyssfpubname(String pSSysSFPubName){
        this.setPSSysSFPubName(pSSysSFPubName);
        return this;
    }

    /**
     * <B>PSVIEWMSGGROUPID</B>&nbsp;应用消息组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSViewMsgGroup} 
     */
    public final static String FIELD_PSVIEWMSGGROUPID = "psviewmsggroupid";

    /**
     * 设置 应用消息组
     * 
     * @param pSViewMsgGroupId
     * 
     */
    @JsonProperty(FIELD_PSVIEWMSGGROUPID)
    public void setPSViewMsgGroupId(String pSViewMsgGroupId){
        this.set(FIELD_PSVIEWMSGGROUPID, pSViewMsgGroupId);
    }
    
    /**
     * 获取 应用消息组  
     * @return
     */
    @JsonIgnore
    public String getPSViewMsgGroupId(){
        Object objValue = this.get(FIELD_PSVIEWMSGGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用消息组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSViewMsgGroupIdDirty(){
        if(this.contains(FIELD_PSVIEWMSGGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用消息组
     */
    @JsonIgnore
    public void resetPSViewMsgGroupId(){
        this.reset(FIELD_PSVIEWMSGGROUPID);
    }

    /**
     * 设置 应用消息组
     * <P>
     * 等同 {@link #setPSViewMsgGroupId}
     * @param pSViewMsgGroupId
     */
    @JsonIgnore
    public PSSysApp psviewmsggroupid(String pSViewMsgGroupId){
        this.setPSViewMsgGroupId(pSViewMsgGroupId);
        return this;
    }

    /**
     * 设置 应用消息组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSViewMsgGroupId}
     * @param pSViewMsgGroup 引用对象
     */
    @JsonIgnore
    public PSSysApp psviewmsggroupid(PSViewMsgGroup pSViewMsgGroup){
        if(pSViewMsgGroup == null){
            this.setPSViewMsgGroupId(null);
            this.setPSViewMsgGroupName(null);
        }
        else{
            this.setPSViewMsgGroupId(pSViewMsgGroup.getPSViewMsgGroupId());
            this.setPSViewMsgGroupName(pSViewMsgGroup.getPSViewMsgGroupName());
        }
        return this;
    }

    /**
     * <B>PSVIEWMSGGROUPNAME</B>&nbsp;应用消息组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSVIEWMSGGROUPID}
     */
    public final static String FIELD_PSVIEWMSGGROUPNAME = "psviewmsggroupname";

    /**
     * 设置 应用消息组
     * 
     * @param pSViewMsgGroupName
     * 
     */
    @JsonProperty(FIELD_PSVIEWMSGGROUPNAME)
    public void setPSViewMsgGroupName(String pSViewMsgGroupName){
        this.set(FIELD_PSVIEWMSGGROUPNAME, pSViewMsgGroupName);
    }
    
    /**
     * 获取 应用消息组  
     * @return
     */
    @JsonIgnore
    public String getPSViewMsgGroupName(){
        Object objValue = this.get(FIELD_PSVIEWMSGGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用消息组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSViewMsgGroupNameDirty(){
        if(this.contains(FIELD_PSVIEWMSGGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用消息组
     */
    @JsonIgnore
    public void resetPSViewMsgGroupName(){
        this.reset(FIELD_PSVIEWMSGGROUPNAME);
    }

    /**
     * 设置 应用消息组
     * <P>
     * 等同 {@link #setPSViewMsgGroupName}
     * @param pSViewMsgGroupName
     */
    @JsonIgnore
    public PSSysApp psviewmsggroupname(String pSViewMsgGroupName){
        this.setPSViewMsgGroupName(pSViewMsgGroupName);
        return this;
    }

    /**
     * <B>PUBREFVIEWONLY</B>&nbsp;只发布引用视图，指定应用是否只发布被引用到视图，由于调整或是其它原因应用中视图可能没有被实际使用，过多的未引用视图导致应用体积臃肿，加载变慢。只发布应用视图将从应用默认视图展开所有使用到视图，未被计算的视图可以手动标记使用。默认为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_PUBREFVIEWONLY = "pubrefviewonly";

    /**
     * 设置 只发布引用视图，详细说明：{@link #FIELD_PUBREFVIEWONLY}
     * 
     * @param pubRefViewOnly
     * 
     */
    @JsonProperty(FIELD_PUBREFVIEWONLY)
    public void setPubRefViewOnly(Integer pubRefViewOnly){
        this.set(FIELD_PUBREFVIEWONLY, pubRefViewOnly);
    }
    
    /**
     * 获取 只发布引用视图  
     * @return
     */
    @JsonIgnore
    public Integer getPubRefViewOnly(){
        Object objValue = this.get(FIELD_PUBREFVIEWONLY);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 只发布引用视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPubRefViewOnlyDirty(){
        if(this.contains(FIELD_PUBREFVIEWONLY)){
            return true;
        }
        return false;
    }

    /**
     * 重置 只发布引用视图
     */
    @JsonIgnore
    public void resetPubRefViewOnly(){
        this.reset(FIELD_PUBREFVIEWONLY);
    }

    /**
     * 设置 只发布引用视图，详细说明：{@link #FIELD_PUBREFVIEWONLY}
     * <P>
     * 等同 {@link #setPubRefViewOnly}
     * @param pubRefViewOnly
     */
    @JsonIgnore
    public PSSysApp pubrefviewonly(Integer pubRefViewOnly){
        this.setPubRefViewOnly(pubRefViewOnly);
        return this;
    }

     /**
     * 设置 只发布引用视图，详细说明：{@link #FIELD_PUBREFVIEWONLY}
     * <P>
     * 等同 {@link #setPubRefViewOnly}
     * @param pubRefViewOnly
     */
    @JsonIgnore
    public PSSysApp pubrefviewonly(Boolean pubRefViewOnly){
        if(pubRefViewOnly == null){
            this.setPubRefViewOnly(null);
        }
        else{
            this.setPubRefViewOnly(pubRefViewOnly?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>PUBSYSREFVIEWONLY</B>&nbsp;只发布系统引用视图（废弃）
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_PUBSYSREFVIEWONLY = "pubsysrefviewonly";

    /**
     * 设置 只发布系统引用视图（废弃）
     * 
     * @param pubSysRefViewOnly
     * 
     */
    @JsonProperty(FIELD_PUBSYSREFVIEWONLY)
    public void setPubSysRefViewOnly(Integer pubSysRefViewOnly){
        this.set(FIELD_PUBSYSREFVIEWONLY, pubSysRefViewOnly);
    }
    
    /**
     * 获取 只发布系统引用视图（废弃）  
     * @return
     */
    @JsonIgnore
    public Integer getPubSysRefViewOnly(){
        Object objValue = this.get(FIELD_PUBSYSREFVIEWONLY);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 只发布系统引用视图（废弃） 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPubSysRefViewOnlyDirty(){
        if(this.contains(FIELD_PUBSYSREFVIEWONLY)){
            return true;
        }
        return false;
    }

    /**
     * 重置 只发布系统引用视图（废弃）
     */
    @JsonIgnore
    public void resetPubSysRefViewOnly(){
        this.reset(FIELD_PUBSYSREFVIEWONLY);
    }

    /**
     * 设置 只发布系统引用视图（废弃）
     * <P>
     * 等同 {@link #setPubSysRefViewOnly}
     * @param pubSysRefViewOnly
     */
    @JsonIgnore
    public PSSysApp pubsysrefviewonly(Integer pubSysRefViewOnly){
        this.setPubSysRefViewOnly(pubSysRefViewOnly);
        return this;
    }

     /**
     * 设置 只发布系统引用视图（废弃）
     * <P>
     * 等同 {@link #setPubSysRefViewOnly}
     * @param pubSysRefViewOnly
     */
    @JsonIgnore
    public PSSysApp pubsysrefviewonly(Boolean pubSysRefViewOnly){
        if(pubSysRefViewOnly == null){
            this.setPubSysRefViewOnly(null);
        }
        else{
            this.setPubSysRefViewOnly(pubSysRefViewOnly?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>REMOVEFLAG</B>&nbsp;删除标记，前端应用需要标记为【允许删除】才允许进行删除，防止用户对关键模型进行误操作
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ModelRemoveMode} 
     */
    public final static String FIELD_REMOVEFLAG = "removeflag";

    /**
     * 设置 删除标记，详细说明：{@link #FIELD_REMOVEFLAG}
     * 
     * @param removeFlag
     * 
     */
    @JsonProperty(FIELD_REMOVEFLAG)
    public void setRemoveFlag(Integer removeFlag){
        this.set(FIELD_REMOVEFLAG, removeFlag);
    }
    
    /**
     * 获取 删除标记  
     * @return
     */
    @JsonIgnore
    public Integer getRemoveFlag(){
        Object objValue = this.get(FIELD_REMOVEFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 删除标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRemoveFlagDirty(){
        if(this.contains(FIELD_REMOVEFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 删除标记
     */
    @JsonIgnore
    public void resetRemoveFlag(){
        this.reset(FIELD_REMOVEFLAG);
    }

    /**
     * 设置 删除标记，详细说明：{@link #FIELD_REMOVEFLAG}
     * <P>
     * 等同 {@link #setRemoveFlag}
     * @param removeFlag
     */
    @JsonIgnore
    public PSSysApp removeflag(Integer removeFlag){
        this.setRemoveFlag(removeFlag);
        return this;
    }

     /**
     * 设置 删除标记，详细说明：{@link #FIELD_REMOVEFLAG}
     * <P>
     * 等同 {@link #setRemoveFlag}
     * @param removeFlag
     */
    @JsonIgnore
    public PSSysApp removeflag(net.ibizsys.psmodel.core.util.PSModelEnums.ModelRemoveMode removeFlag){
        if(removeFlag == null){
            this.setRemoveFlag(null);
        }
        else{
            this.setRemoveFlag(removeFlag.value);
        }
        return this;
    }

    /**
     * <B>SERVICECODENAME</B>&nbsp;服务代码标识，指定应用作为服务的代码标识，未指定时使用【代码标识】
     * <P>
     * 字符串：最大长度 30，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_SERVICECODENAME = "servicecodename";

    /**
     * 设置 服务代码标识，详细说明：{@link #FIELD_SERVICECODENAME}
     * 
     * @param serviceCodeName
     * 
     */
    @JsonProperty(FIELD_SERVICECODENAME)
    public void setServiceCodeName(String serviceCodeName){
        this.set(FIELD_SERVICECODENAME, serviceCodeName);
    }
    
    /**
     * 获取 服务代码标识  
     * @return
     */
    @JsonIgnore
    public String getServiceCodeName(){
        Object objValue = this.get(FIELD_SERVICECODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 服务代码标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isServiceCodeNameDirty(){
        if(this.contains(FIELD_SERVICECODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务代码标识
     */
    @JsonIgnore
    public void resetServiceCodeName(){
        this.reset(FIELD_SERVICECODENAME);
    }

    /**
     * 设置 服务代码标识，详细说明：{@link #FIELD_SERVICECODENAME}
     * <P>
     * 等同 {@link #setServiceCodeName}
     * @param serviceCodeName
     */
    @JsonIgnore
    public PSSysApp servicecodename(String serviceCodeName){
        this.setServiceCodeName(serviceCodeName);
        return this;
    }

    /**
     * <B>STARTPAGEFILE</B>&nbsp;起始页图片文件
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_STARTPAGEFILE = "startpagefile";

    /**
     * 设置 起始页图片文件
     * 
     * @param startPageFile
     * 
     */
    @JsonProperty(FIELD_STARTPAGEFILE)
    public void setStartPageFile(String startPageFile){
        this.set(FIELD_STARTPAGEFILE, startPageFile);
    }
    
    /**
     * 获取 起始页图片文件  
     * @return
     */
    @JsonIgnore
    public String getStartPageFile(){
        Object objValue = this.get(FIELD_STARTPAGEFILE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 起始页图片文件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStartPageFileDirty(){
        if(this.contains(FIELD_STARTPAGEFILE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 起始页图片文件
     */
    @JsonIgnore
    public void resetStartPageFile(){
        this.reset(FIELD_STARTPAGEFILE);
    }

    /**
     * 设置 起始页图片文件
     * <P>
     * 等同 {@link #setStartPageFile}
     * @param startPageFile
     */
    @JsonIgnore
    public PSSysApp startpagefile(String startPageFile){
        this.setStartPageFile(startPageFile);
        return this;
    }

    /**
     * <B>SUBCAPTION</B>&nbsp;应用子标题，指定应用的子标题，默认首页视图子标题将优先使用此内容
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_SUBCAPTION = "subcaption";

    /**
     * 设置 应用子标题，详细说明：{@link #FIELD_SUBCAPTION}
     * 
     * @param subCaption
     * 
     */
    @JsonProperty(FIELD_SUBCAPTION)
    public void setSubCaption(String subCaption){
        this.set(FIELD_SUBCAPTION, subCaption);
    }
    
    /**
     * 获取 应用子标题  
     * @return
     */
    @JsonIgnore
    public String getSubCaption(){
        Object objValue = this.get(FIELD_SUBCAPTION);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用子标题 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSubCaptionDirty(){
        if(this.contains(FIELD_SUBCAPTION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用子标题
     */
    @JsonIgnore
    public void resetSubCaption(){
        this.reset(FIELD_SUBCAPTION);
    }

    /**
     * 设置 应用子标题，详细说明：{@link #FIELD_SUBCAPTION}
     * <P>
     * 等同 {@link #setSubCaption}
     * @param subCaption
     */
    @JsonIgnore
    public PSSysApp subcaption(String subCaption){
        this.setSubCaption(subCaption);
        return this;
    }

    /**
     * <B>TITLE</B>&nbsp;应用抬头，指定应用的抬头，默认首页视图抬头将优先使用此内容
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_TITLE = "title";

    /**
     * 设置 应用抬头，详细说明：{@link #FIELD_TITLE}
     * 
     * @param title
     * 
     */
    @JsonProperty(FIELD_TITLE)
    public void setTitle(String title){
        this.set(FIELD_TITLE, title);
    }
    
    /**
     * 获取 应用抬头  
     * @return
     */
    @JsonIgnore
    public String getTitle(){
        Object objValue = this.get(FIELD_TITLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用抬头 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTitleDirty(){
        if(this.contains(FIELD_TITLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用抬头
     */
    @JsonIgnore
    public void resetTitle(){
        this.reset(FIELD_TITLE);
    }

    /**
     * 设置 应用抬头，详细说明：{@link #FIELD_TITLE}
     * <P>
     * 等同 {@link #setTitle}
     * @param title
     */
    @JsonIgnore
    public PSSysApp title(String title){
        this.setTitle(title);
        return this;
    }

    /**
     * <B>UACLOGIN</B>&nbsp;启用统一认证，指定应用是否启用启用统一认证，默认为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_UACLOGIN = "uaclogin";

    /**
     * 设置 启用统一认证，详细说明：{@link #FIELD_UACLOGIN}
     * 
     * @param uACLogin
     * 
     */
    @JsonProperty(FIELD_UACLOGIN)
    public void setUACLogin(Integer uACLogin){
        this.set(FIELD_UACLOGIN, uACLogin);
    }
    
    /**
     * 获取 启用统一认证  
     * @return
     */
    @JsonIgnore
    public Integer getUACLogin(){
        Object objValue = this.get(FIELD_UACLOGIN);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用统一认证 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUACLoginDirty(){
        if(this.contains(FIELD_UACLOGIN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用统一认证
     */
    @JsonIgnore
    public void resetUACLogin(){
        this.reset(FIELD_UACLOGIN);
    }

    /**
     * 设置 启用统一认证，详细说明：{@link #FIELD_UACLOGIN}
     * <P>
     * 等同 {@link #setUACLogin}
     * @param uACLogin
     */
    @JsonIgnore
    public PSSysApp uaclogin(Integer uACLogin){
        this.setUACLogin(uACLogin);
        return this;
    }

     /**
     * 设置 启用统一认证，详细说明：{@link #FIELD_UACLOGIN}
     * <P>
     * 等同 {@link #setUACLogin}
     * @param uACLogin
     */
    @JsonIgnore
    public PSSysApp uaclogin(Boolean uACLogin){
        if(uACLogin == null){
            this.setUACLogin(null);
        }
        else{
            this.setUACLogin(uACLogin?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>UISTYLE</B>&nbsp;默认视图样式，指定应用的默认视图样式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.AppUIStyle} 
     */
    public final static String FIELD_UISTYLE = "uistyle";

    /**
     * 设置 默认视图样式，详细说明：{@link #FIELD_UISTYLE}
     * 
     * @param uIStyle
     * 
     */
    @JsonProperty(FIELD_UISTYLE)
    public void setUIStyle(String uIStyle){
        this.set(FIELD_UISTYLE, uIStyle);
    }
    
    /**
     * 获取 默认视图样式  
     * @return
     */
    @JsonIgnore
    public String getUIStyle(){
        Object objValue = this.get(FIELD_UISTYLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认视图样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUIStyleDirty(){
        if(this.contains(FIELD_UISTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认视图样式
     */
    @JsonIgnore
    public void resetUIStyle(){
        this.reset(FIELD_UISTYLE);
    }

    /**
     * 设置 默认视图样式，详细说明：{@link #FIELD_UISTYLE}
     * <P>
     * 等同 {@link #setUIStyle}
     * @param uIStyle
     */
    @JsonIgnore
    public PSSysApp uistyle(String uIStyle){
        this.setUIStyle(uIStyle);
        return this;
    }

     /**
     * 设置 默认视图样式，详细说明：{@link #FIELD_UISTYLE}
     * <P>
     * 等同 {@link #setUIStyle}
     * @param uIStyle
     */
    @JsonIgnore
    public PSSysApp uistyle(net.ibizsys.psmodel.core.util.PSModelEnums.AppUIStyle uIStyle){
        if(uIStyle == null){
            this.setUIStyle(null);
        }
        else{
            this.setUIStyle(uIStyle.value);
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
    public PSSysApp updatedate(String updateDate){
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
    public PSSysApp updateman(String updateMan){
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
    public PSSysApp usercat(String userCat){
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
    public PSSysApp usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysApp userparams(String userParams){
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
    public PSSysApp usertag(String userTag){
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
    public PSSysApp usertag2(String userTag2){
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
    public PSSysApp usertag3(String userTag3){
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
    public PSSysApp usertag4(String userTag4){
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
    public PSSysApp validflag(Integer validFlag){
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
    public PSSysApp validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysAppId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysAppId(strValue);
    }

    @JsonIgnore
    public PSSysApp id(String strValue){
        this.setPSSysAppId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysApp){
            PSSysApp model = (PSSysApp)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
