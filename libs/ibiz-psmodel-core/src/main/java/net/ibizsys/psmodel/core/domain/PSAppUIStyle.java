package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSAPPUISTYLE</B>应用界面模式 模型传输对象
 * <P>
 * 应用界面模式模型，定义界面模式支持定义前端模板、模板样式及应用界面的相关参数。界面模式就是前端应用的界面构型
 */
public class PSAppUIStyle extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSAppUIStyle(){
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
    public PSAppUIStyle acminchars(Integer aCMinChars){
        this.setACMinChars(aCMinChars);
        return this;
    }

    /**
     * <B>APPFOLDER</B>&nbsp;应用目录，指定前端应用的应用目录名称，未定义时使用前端应用默认定义
     * <P>
     * 字符串：最大长度 500
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
    public PSAppUIStyle appfolder(String appFolder){
        this.setAppFolder(appFolder);
        return this;
    }

    /**
     * <B>APPPKGNAME</B>&nbsp;模式代码，指定应用界面模式的模式代码，需在所在前端应用中具备唯一性
     * <P>
     * 字符串：最大长度 10，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_APPPKGNAME = "apppkgname";

    /**
     * 设置 模式代码，详细说明：{@link #FIELD_APPPKGNAME}
     * 
     * @param appPKGName
     * 
     */
    @JsonProperty(FIELD_APPPKGNAME)
    public void setAppPKGName(String appPKGName){
        this.set(FIELD_APPPKGNAME, appPKGName);
    }
    
    /**
     * 获取 模式代码  
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
     * 判断 模式代码 是否指定值，包括空值
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
     * 重置 模式代码
     */
    @JsonIgnore
    public void resetAppPKGName(){
        this.reset(FIELD_APPPKGNAME);
    }

    /**
     * 设置 模式代码，详细说明：{@link #FIELD_APPPKGNAME}
     * <P>
     * 等同 {@link #setAppPKGName}
     * @param appPKGName
     */
    @JsonIgnore
    public PSAppUIStyle apppkgname(String appPKGName){
        this.setAppPKGName(appPKGName);
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
    public PSAppUIStyle createdate(String createDate){
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
    public PSAppUIStyle createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>MAINMENUSIDE</B>&nbsp;主菜单方向，指定应用界面模式的视图主菜单位置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.AppIndexViewMenuAlign} 
     */
    public final static String FIELD_MAINMENUSIDE = "mainmenuside";

    /**
     * 设置 主菜单方向，详细说明：{@link #FIELD_MAINMENUSIDE}
     * 
     * @param mainMenuSide
     * 
     */
    @JsonProperty(FIELD_MAINMENUSIDE)
    public void setMainMenuSide(String mainMenuSide){
        this.set(FIELD_MAINMENUSIDE, mainMenuSide);
    }
    
    /**
     * 获取 主菜单方向  
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
     * 判断 主菜单方向 是否指定值，包括空值
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
     * 重置 主菜单方向
     */
    @JsonIgnore
    public void resetMainMenuSide(){
        this.reset(FIELD_MAINMENUSIDE);
    }

    /**
     * 设置 主菜单方向，详细说明：{@link #FIELD_MAINMENUSIDE}
     * <P>
     * 等同 {@link #setMainMenuSide}
     * @param mainMenuSide
     */
    @JsonIgnore
    public PSAppUIStyle mainmenuside(String mainMenuSide){
        this.setMainMenuSide(mainMenuSide);
        return this;
    }

     /**
     * 设置 主菜单方向，详细说明：{@link #FIELD_MAINMENUSIDE}
     * <P>
     * 等同 {@link #setMainMenuSide}
     * @param mainMenuSide
     */
    @JsonIgnore
    public PSAppUIStyle mainmenuside(net.ibizsys.psmodel.core.util.PSModelEnums.AppIndexViewMenuAlign mainMenuSide){
        if(mainMenuSide == null){
            this.setMainMenuSide(null);
        }
        else{
            this.setMainMenuSide(mainMenuSide.value);
        }
        return this;
    }

    /**
     * <B>MEMO</B>&nbsp;备注
     * <P>
     * 字符串：最大长度 4000
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
    public PSAppUIStyle memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PFSTYLEPARAM</B>&nbsp;应用样式参数，指定应用界面模式使用的前端模板样式的附加参数
     * <P>
     * 字符串：最大长度 4000
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
    public PSAppUIStyle pfstyleparam(String pFStyleParam){
        this.setPFStyleParam(pFStyleParam);
        return this;
    }

    /**
     * <B>PSAPPUISTYLEID</B>&nbsp;应用界面模式标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSAPPUISTYLEID = "psappuistyleid";

    /**
     * 设置 应用界面模式标识
     * 
     * @param pSAppUIStyleId
     * 
     */
    @JsonProperty(FIELD_PSAPPUISTYLEID)
    public void setPSAppUIStyleId(String pSAppUIStyleId){
        this.set(FIELD_PSAPPUISTYLEID, pSAppUIStyleId);
    }
    
    /**
     * 获取 应用界面模式标识  
     * @return
     */
    @JsonIgnore
    public String getPSAppUIStyleId(){
        Object objValue = this.get(FIELD_PSAPPUISTYLEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用界面模式标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppUIStyleIdDirty(){
        if(this.contains(FIELD_PSAPPUISTYLEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用界面模式标识
     */
    @JsonIgnore
    public void resetPSAppUIStyleId(){
        this.reset(FIELD_PSAPPUISTYLEID);
    }

    /**
     * 设置 应用界面模式标识
     * <P>
     * 等同 {@link #setPSAppUIStyleId}
     * @param pSAppUIStyleId
     */
    @JsonIgnore
    public PSAppUIStyle psappuistyleid(String pSAppUIStyleId){
        this.setPSAppUIStyleId(pSAppUIStyleId);
        return this;
    }

    /**
     * <B>PSAPPUISTYLENAME</B>&nbsp;模式名称，指定应用界面模式的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSAPPUISTYLENAME = "psappuistylename";

    /**
     * 设置 模式名称，详细说明：{@link #FIELD_PSAPPUISTYLENAME}
     * 
     * @param pSAppUIStyleName
     * 
     */
    @JsonProperty(FIELD_PSAPPUISTYLENAME)
    public void setPSAppUIStyleName(String pSAppUIStyleName){
        this.set(FIELD_PSAPPUISTYLENAME, pSAppUIStyleName);
    }
    
    /**
     * 获取 模式名称  
     * @return
     */
    @JsonIgnore
    public String getPSAppUIStyleName(){
        Object objValue = this.get(FIELD_PSAPPUISTYLENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模式名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppUIStyleNameDirty(){
        if(this.contains(FIELD_PSAPPUISTYLENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模式名称
     */
    @JsonIgnore
    public void resetPSAppUIStyleName(){
        this.reset(FIELD_PSAPPUISTYLENAME);
    }

    /**
     * 设置 模式名称，详细说明：{@link #FIELD_PSAPPUISTYLENAME}
     * <P>
     * 等同 {@link #setPSAppUIStyleName}
     * @param pSAppUIStyleName
     */
    @JsonIgnore
    public PSAppUIStyle psappuistylename(String pSAppUIStyleName){
        this.setPSAppUIStyleName(pSAppUIStyleName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSAppUIStyleName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSAppUIStyleName(strName);
    }

    @JsonIgnore
    public PSAppUIStyle name(String strName){
        this.setPSAppUIStyleName(strName);
        return this;
    }

    /**
     * <B>PSPFID</B>&nbsp;前端模板，指定应用界面模式使用的前端模板
     * <P>
     * 字符串：最大长度 100
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
    public PSAppUIStyle pspfid(String pSPFId){
        this.setPSPFId(pSPFId);
        return this;
    }

    /**
     * <B>PSPFNAME</B>&nbsp;前端模板，指定应用界面模式使用的前端模板
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
    public PSAppUIStyle pspfname(String pSPFName){
        this.setPSPFName(pSPFName);
        return this;
    }

    /**
     * <B>PSPFSTYLEID</B>&nbsp;应用样式，指定应用界面模式使用的前端模板的样式
     * <P>
     * 字符串：最大长度 100
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
    public PSAppUIStyle pspfstyleid(String pSPFStyleId){
        this.setPSPFStyleId(pSPFStyleId);
        return this;
    }

    /**
     * <B>PSPFSTYLENAME</B>&nbsp;应用样式，指定应用界面模式使用的前端模板的样式
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
    public PSAppUIStyle pspfstylename(String pSPFStyleName){
        this.setPSPFStyleName(pSPFStyleName);
        return this;
    }

    /**
     * <B>PSSYSAPPID</B>&nbsp;系统应用，指定应用界面模式所属的前端应用
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysApp} 
     */
    public final static String FIELD_PSSYSAPPID = "pssysappid";

    /**
     * 设置 系统应用，详细说明：{@link #FIELD_PSSYSAPPID}
     * 
     * @param pSSysAppId
     * 
     */
    @JsonProperty(FIELD_PSSYSAPPID)
    public void setPSSysAppId(String pSSysAppId){
        this.set(FIELD_PSSYSAPPID, pSSysAppId);
    }
    
    /**
     * 获取 系统应用  
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
     * 判断 系统应用 是否指定值，包括空值
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
     * 重置 系统应用
     */
    @JsonIgnore
    public void resetPSSysAppId(){
        this.reset(FIELD_PSSYSAPPID);
    }

    /**
     * 设置 系统应用，详细说明：{@link #FIELD_PSSYSAPPID}
     * <P>
     * 等同 {@link #setPSSysAppId}
     * @param pSSysAppId
     */
    @JsonIgnore
    public PSAppUIStyle pssysappid(String pSSysAppId){
        this.setPSSysAppId(pSSysAppId);
        return this;
    }

    /**
     * 设置 系统应用，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysAppId}
     * @param pSSysApp 引用对象
     */
    @JsonIgnore
    public PSAppUIStyle pssysappid(PSSysApp pSSysApp){
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
     * <B>PSSYSAPPNAME</B>&nbsp;前端应用，指定应用界面模式所属的前端应用
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
    public PSAppUIStyle pssysappname(String pSSysAppName){
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    /**
     * <B>ROOTPSAPPVIEWID</B>&nbsp;根应用视图，指定应用界面模式的默认启动视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSAppView} 
     */
    public final static String FIELD_ROOTPSAPPVIEWID = "rootpsappviewid";

    /**
     * 设置 根应用视图，详细说明：{@link #FIELD_ROOTPSAPPVIEWID}
     * 
     * @param rootPSAppViewId
     * 
     */
    @JsonProperty(FIELD_ROOTPSAPPVIEWID)
    public void setRootPSAppViewId(String rootPSAppViewId){
        this.set(FIELD_ROOTPSAPPVIEWID, rootPSAppViewId);
    }
    
    /**
     * 获取 根应用视图  
     * @return
     */
    @JsonIgnore
    public String getRootPSAppViewId(){
        Object objValue = this.get(FIELD_ROOTPSAPPVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 根应用视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRootPSAppViewIdDirty(){
        if(this.contains(FIELD_ROOTPSAPPVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 根应用视图
     */
    @JsonIgnore
    public void resetRootPSAppViewId(){
        this.reset(FIELD_ROOTPSAPPVIEWID);
    }

    /**
     * 设置 根应用视图，详细说明：{@link #FIELD_ROOTPSAPPVIEWID}
     * <P>
     * 等同 {@link #setRootPSAppViewId}
     * @param rootPSAppViewId
     */
    @JsonIgnore
    public PSAppUIStyle rootpsappviewid(String rootPSAppViewId){
        this.setRootPSAppViewId(rootPSAppViewId);
        return this;
    }

    /**
     * 设置 根应用视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRootPSAppViewId}
     * @param pSAppView 引用对象
     */
    @JsonIgnore
    public PSAppUIStyle rootpsappviewid(PSAppView pSAppView){
        if(pSAppView == null){
            this.setRootPSAppViewId(null);
            this.setRootPSAppViewName(null);
        }
        else{
            this.setRootPSAppViewId(pSAppView.getPSAppViewId());
            this.setRootPSAppViewName(pSAppView.getPSAppViewName());
        }
        return this;
    }

    /**
     * <B>ROOTPSAPPVIEWNAME</B>&nbsp;根应用视图，指定应用界面模式的默认启动视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ROOTPSAPPVIEWID}
     */
    public final static String FIELD_ROOTPSAPPVIEWNAME = "rootpsappviewname";

    /**
     * 设置 根应用视图，详细说明：{@link #FIELD_ROOTPSAPPVIEWNAME}
     * 
     * @param rootPSAppViewName
     * 
     */
    @JsonProperty(FIELD_ROOTPSAPPVIEWNAME)
    public void setRootPSAppViewName(String rootPSAppViewName){
        this.set(FIELD_ROOTPSAPPVIEWNAME, rootPSAppViewName);
    }
    
    /**
     * 获取 根应用视图  
     * @return
     */
    @JsonIgnore
    public String getRootPSAppViewName(){
        Object objValue = this.get(FIELD_ROOTPSAPPVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 根应用视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRootPSAppViewNameDirty(){
        if(this.contains(FIELD_ROOTPSAPPVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 根应用视图
     */
    @JsonIgnore
    public void resetRootPSAppViewName(){
        this.reset(FIELD_ROOTPSAPPVIEWNAME);
    }

    /**
     * 设置 根应用视图，详细说明：{@link #FIELD_ROOTPSAPPVIEWNAME}
     * <P>
     * 等同 {@link #setRootPSAppViewName}
     * @param rootPSAppViewName
     */
    @JsonIgnore
    public PSAppUIStyle rootpsappviewname(String rootPSAppViewName){
        this.setRootPSAppViewName(rootPSAppViewName);
        return this;
    }

    /**
     * <B>UISTYLE</B>&nbsp;界面模式，指定应用界面模式的模式标识，需在所在前端应用中具备唯一性
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.AppUIStyle} 
     */
    public final static String FIELD_UISTYLE = "uistyle";

    /**
     * 设置 界面模式，详细说明：{@link #FIELD_UISTYLE}
     * 
     * @param uIStyle
     * 
     */
    @JsonProperty(FIELD_UISTYLE)
    public void setUIStyle(String uIStyle){
        this.set(FIELD_UISTYLE, uIStyle);
    }
    
    /**
     * 获取 界面模式  
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
     * 判断 界面模式 是否指定值，包括空值
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
     * 重置 界面模式
     */
    @JsonIgnore
    public void resetUIStyle(){
        this.reset(FIELD_UISTYLE);
    }

    /**
     * 设置 界面模式，详细说明：{@link #FIELD_UISTYLE}
     * <P>
     * 等同 {@link #setUIStyle}
     * @param uIStyle
     */
    @JsonIgnore
    public PSAppUIStyle uistyle(String uIStyle){
        this.setUIStyle(uIStyle);
        return this;
    }

     /**
     * 设置 界面模式，详细说明：{@link #FIELD_UISTYLE}
     * <P>
     * 等同 {@link #setUIStyle}
     * @param uIStyle
     */
    @JsonIgnore
    public PSAppUIStyle uistyle(net.ibizsys.psmodel.core.util.PSModelEnums.AppUIStyle uIStyle){
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
    public PSAppUIStyle updatedate(String updateDate){
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
    public PSAppUIStyle updateman(String updateMan){
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
    public PSAppUIStyle usercat(String userCat){
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
    public PSAppUIStyle usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSAppUIStyle usertag(String userTag){
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
    public PSAppUIStyle usertag2(String userTag2){
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
    public PSAppUIStyle usertag3(String userTag3){
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
    public PSAppUIStyle usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSAppUIStyleId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSAppUIStyleId(strValue);
    }

    @JsonIgnore
    public PSAppUIStyle id(String strValue){
        this.setPSAppUIStyleId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSAppUIStyle){
            PSAppUIStyle model = (PSAppUIStyle)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
