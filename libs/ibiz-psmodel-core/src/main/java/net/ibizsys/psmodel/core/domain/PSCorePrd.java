package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSCOREPRD</B>云平台核心产品 模型传输对象
 * <P>
 * 
 */
public class PSCorePrd extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSCorePrd(){
    }      

    /**
     * <B>SETTINGURL</B>&nbsp;设置路径
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_SETTINGURL = "settingurl";

    /**
     * 设置 设置路径
     * 
     * @param settingUrl
     * 
     */
    @JsonProperty(FIELD_SETTINGURL)
    public void setSettingUrl(String settingUrl){
        this.set(FIELD_SETTINGURL, settingUrl);
    }
    
    /**
     * 获取 设置路径  
     * @return
     */
    @JsonIgnore
    public String getSettingUrl(){
        Object objValue = this.get(FIELD_SETTINGURL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 设置路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSettingUrlDirty(){
        if(this.contains(FIELD_SETTINGURL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 设置路径
     */
    @JsonIgnore
    public void resetSettingUrl(){
        this.reset(FIELD_SETTINGURL);
    }

    /**
     * 设置 设置路径
     * <P>
     * 等同 {@link #setSettingUrl}
     * @param settingUrl
     */
    @JsonIgnore
    public PSCorePrd settingurl(String settingUrl){
        this.setSettingUrl(settingUrl);
        return this;
    }
    
    /**
     * <B>AVATARURL</B>&nbsp;图标路径
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_AVATARURL = "avatarurl";

    /**
     * 设置 图标路径
     * 
     * @param avatarUrl
     * 
     */
    @JsonProperty(FIELD_AVATARURL)
    public void setAvatarUrl(String avatarUrl){
        this.set(FIELD_AVATARURL, avatarUrl);
    }
    
    /**
     * 获取 图标路径  
     * @return
     */
    @JsonIgnore
    public String getAvatarUrl(){
        Object objValue = this.get(FIELD_AVATARURL);
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
    public boolean isAvatarUrlDirty(){
        if(this.contains(FIELD_AVATARURL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图标路径
     */
    @JsonIgnore
    public void resetAvatarUrl(){
        this.reset(FIELD_AVATARURL);
    }

    /**
     * 设置 图标路径
     * <P>
     * 等同 {@link #setAvatarUrl}
     * @param avatarUrl
     */
    @JsonIgnore
    public PSCorePrd avatarurl(String avatarUrl){
        this.setAvatarUrl(avatarUrl);
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
    public PSCorePrd createdate(String createDate){
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
    public PSCorePrd createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CURRENTVERSION</B>&nbsp;当前版本
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CURRENTVERSION = "currentversion";

    /**
     * 设置 当前版本
     * 
     * @param currentVersion
     * 
     */
    @JsonProperty(FIELD_CURRENTVERSION)
    public void setCurrentVersion(String currentVersion){
        this.set(FIELD_CURRENTVERSION, currentVersion);
    }
    
    /**
     * 获取 当前版本  
     * @return
     */
    @JsonIgnore
    public String getCurrentVersion(){
        Object objValue = this.get(FIELD_CURRENTVERSION);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 当前版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCurrentVersionDirty(){
        if(this.contains(FIELD_CURRENTVERSION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 当前版本
     */
    @JsonIgnore
    public void resetCurrentVersion(){
        this.reset(FIELD_CURRENTVERSION);
    }

    /**
     * 设置 当前版本
     * <P>
     * 等同 {@link #setCurrentVersion}
     * @param currentVersion
     */
    @JsonIgnore
    public PSCorePrd currentversion(String currentVersion){
        this.setCurrentVersion(currentVersion);
        return this;
    }

    /**
     * <B>FULLNAME</B>&nbsp;完全名称
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_FULLNAME = "fullname";

    /**
     * 设置 完全名称
     * 
     * @param fullName
     * 
     */
    @JsonProperty(FIELD_FULLNAME)
    public void setFullName(String fullName){
        this.set(FIELD_FULLNAME, fullName);
    }
    
    /**
     * 获取 完全名称  
     * @return
     */
    @JsonIgnore
    public String getFullName(){
        Object objValue = this.get(FIELD_FULLNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 完全名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFullNameDirty(){
        if(this.contains(FIELD_FULLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 完全名称
     */
    @JsonIgnore
    public void resetFullName(){
        this.reset(FIELD_FULLNAME);
    }

    /**
     * 设置 完全名称
     * <P>
     * 等同 {@link #setFullName}
     * @param fullName
     */
    @JsonIgnore
    public PSCorePrd fullname(String fullName){
        this.setFullName(fullName);
        return this;
    }

    /**
     * <B>FULLPATH</B>&nbsp;完全路径
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_FULLPATH = "fullpath";

    /**
     * 设置 完全路径
     * 
     * @param fullPath
     * 
     */
    @JsonProperty(FIELD_FULLPATH)
    public void setFullPath(String fullPath){
        this.set(FIELD_FULLPATH, fullPath);
    }
    
    /**
     * 获取 完全路径  
     * @return
     */
    @JsonIgnore
    public String getFullPath(){
        Object objValue = this.get(FIELD_FULLPATH);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 完全路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFullPathDirty(){
        if(this.contains(FIELD_FULLPATH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 完全路径
     */
    @JsonIgnore
    public void resetFullPath(){
        this.reset(FIELD_FULLPATH);
    }

    /**
     * 设置 完全路径
     * <P>
     * 等同 {@link #setFullPath}
     * @param fullPath
     */
    @JsonIgnore
    public PSCorePrd fullpath(String fullPath){
        this.setFullPath(fullPath);
        return this;
    }

    /**
     * <B>HTTPURLTOREPO</B>&nbsp;Http仓库地址
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_HTTPURLTOREPO = "httpurltorepo";

    /**
     * 设置 Http仓库地址
     * 
     * @param httpUrlToRepo
     * 
     */
    @JsonProperty(FIELD_HTTPURLTOREPO)
    public void setHttpUrlToRepo(String httpUrlToRepo){
        this.set(FIELD_HTTPURLTOREPO, httpUrlToRepo);
    }
    
    /**
     * 获取 Http仓库地址  
     * @return
     */
    @JsonIgnore
    public String getHttpUrlToRepo(){
        Object objValue = this.get(FIELD_HTTPURLTOREPO);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 Http仓库地址 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHttpUrlToRepoDirty(){
        if(this.contains(FIELD_HTTPURLTOREPO)){
            return true;
        }
        return false;
    }

    /**
     * 重置 Http仓库地址
     */
    @JsonIgnore
    public void resetHttpUrlToRepo(){
        this.reset(FIELD_HTTPURLTOREPO);
    }

    /**
     * 设置 Http仓库地址
     * <P>
     * 等同 {@link #setHttpUrlToRepo}
     * @param httpUrlToRepo
     */
    @JsonIgnore
    public PSCorePrd httpurltorepo(String httpUrlToRepo){
        this.setHttpUrlToRepo(httpUrlToRepo);
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
    public PSCorePrd memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PATH</B>&nbsp;路径
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PATH = "path";

    /**
     * 设置 路径
     * 
     * @param path
     * 
     */
    @JsonProperty(FIELD_PATH)
    public void setPath(String path){
        this.set(FIELD_PATH, path);
    }
    
    /**
     * 获取 路径  
     * @return
     */
    @JsonIgnore
    public String getPath(){
        Object objValue = this.get(FIELD_PATH);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPathDirty(){
        if(this.contains(FIELD_PATH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 路径
     */
    @JsonIgnore
    public void resetPath(){
        this.reset(FIELD_PATH);
    }

    /**
     * 设置 路径
     * <P>
     * 等同 {@link #setPath}
     * @param path
     */
    @JsonIgnore
    public PSCorePrd path(String path){
        this.setPath(path);
        return this;
    }

    /**
     * <B>PKGFOLDER</B>&nbsp;安装包路径
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_PKGFOLDER = "pkgfolder";

    /**
     * 设置 安装包路径
     * 
     * @param pkgFolder
     * 
     */
    @JsonProperty(FIELD_PKGFOLDER)
    public void setPkgFolder(String pkgFolder){
        this.set(FIELD_PKGFOLDER, pkgFolder);
    }
    
    /**
     * 获取 安装包路径  
     * @return
     */
    @JsonIgnore
    public String getPkgFolder(){
        Object objValue = this.get(FIELD_PKGFOLDER);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 安装包路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPkgFolderDirty(){
        if(this.contains(FIELD_PKGFOLDER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 安装包路径
     */
    @JsonIgnore
    public void resetPkgFolder(){
        this.reset(FIELD_PKGFOLDER);
    }

    /**
     * 设置 安装包路径
     * <P>
     * 等同 {@link #setPkgFolder}
     * @param pkgFolder
     */
    @JsonIgnore
    public PSCorePrd pkgfolder(String pkgFolder){
        this.setPkgFolder(pkgFolder);
        return this;
    }

    /**
     * <B>PRDSN</B>&nbsp;产品编号
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PRDSN = "prdsn";

    /**
     * 设置 产品编号
     * 
     * @param prdSN
     * 
     */
    @JsonProperty(FIELD_PRDSN)
    public void setPrdSN(String prdSN){
        this.set(FIELD_PRDSN, prdSN);
    }
    
    /**
     * 获取 产品编号  
     * @return
     */
    @JsonIgnore
    public String getPrdSN(){
        Object objValue = this.get(FIELD_PRDSN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 产品编号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPrdSNDirty(){
        if(this.contains(FIELD_PRDSN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 产品编号
     */
    @JsonIgnore
    public void resetPrdSN(){
        this.reset(FIELD_PRDSN);
    }

    /**
     * 设置 产品编号
     * <P>
     * 等同 {@link #setPrdSN}
     * @param prdSN
     */
    @JsonIgnore
    public PSCorePrd prdsn(String prdSN){
        this.setPrdSN(prdSN);
        return this;
    }

    /**
     * <B>PRDTAG</B>&nbsp;产品标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PRDTAG = "prdtag";

    /**
     * 设置 产品标记
     * 
     * @param prdTag
     * 
     */
    @JsonProperty(FIELD_PRDTAG)
    public void setPrdTag(String prdTag){
        this.set(FIELD_PRDTAG, prdTag);
    }
    
    /**
     * 获取 产品标记  
     * @return
     */
    @JsonIgnore
    public String getPrdTag(){
        Object objValue = this.get(FIELD_PRDTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 产品标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPrdTagDirty(){
        if(this.contains(FIELD_PRDTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 产品标记
     */
    @JsonIgnore
    public void resetPrdTag(){
        this.reset(FIELD_PRDTAG);
    }

    /**
     * 设置 产品标记
     * <P>
     * 等同 {@link #setPrdTag}
     * @param prdTag
     */
    @JsonIgnore
    public PSCorePrd prdtag(String prdTag){
        this.setPrdTag(prdTag);
        return this;
    }

    /**
     * <B>PRDTAG2</B>&nbsp;产品标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PRDTAG2 = "prdtag2";

    /**
     * 设置 产品标记2
     * 
     * @param prdTag2
     * 
     */
    @JsonProperty(FIELD_PRDTAG2)
    public void setPrdTag2(String prdTag2){
        this.set(FIELD_PRDTAG2, prdTag2);
    }
    
    /**
     * 获取 产品标记2  
     * @return
     */
    @JsonIgnore
    public String getPrdTag2(){
        Object objValue = this.get(FIELD_PRDTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 产品标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPrdTag2Dirty(){
        if(this.contains(FIELD_PRDTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 产品标记2
     */
    @JsonIgnore
    public void resetPrdTag2(){
        this.reset(FIELD_PRDTAG2);
    }

    /**
     * 设置 产品标记2
     * <P>
     * 等同 {@link #setPrdTag2}
     * @param prdTag2
     */
    @JsonIgnore
    public PSCorePrd prdtag2(String prdTag2){
        this.setPrdTag2(prdTag2);
        return this;
    }

    /**
     * <B>PSCOREPRDCATID</B>&nbsp;产品分类
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSCOREPRDCATID = "pscoreprdcatid";

    /**
     * 设置 产品分类
     * 
     * @param pSCorePrdCatId
     * 
     */
    @JsonProperty(FIELD_PSCOREPRDCATID)
    public void setPSCorePrdCatId(String pSCorePrdCatId){
        this.set(FIELD_PSCOREPRDCATID, pSCorePrdCatId);
    }
    
    /**
     * 获取 产品分类  
     * @return
     */
    @JsonIgnore
    public String getPSCorePrdCatId(){
        Object objValue = this.get(FIELD_PSCOREPRDCATID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 产品分类 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCorePrdCatIdDirty(){
        if(this.contains(FIELD_PSCOREPRDCATID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 产品分类
     */
    @JsonIgnore
    public void resetPSCorePrdCatId(){
        this.reset(FIELD_PSCOREPRDCATID);
    }

    /**
     * 设置 产品分类
     * <P>
     * 等同 {@link #setPSCorePrdCatId}
     * @param pSCorePrdCatId
     */
    @JsonIgnore
    public PSCorePrd pscoreprdcatid(String pSCorePrdCatId){
        this.setPSCorePrdCatId(pSCorePrdCatId);
        return this;
    }

    /**
     * <B>PSCOREPRDCATNAME</B>&nbsp;产品分类
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCOREPRDCATID}
     */
    public final static String FIELD_PSCOREPRDCATNAME = "pscoreprdcatname";

    /**
     * 设置 产品分类
     * 
     * @param pSCorePrdCatName
     * 
     */
    @JsonProperty(FIELD_PSCOREPRDCATNAME)
    public void setPSCorePrdCatName(String pSCorePrdCatName){
        this.set(FIELD_PSCOREPRDCATNAME, pSCorePrdCatName);
    }
    
    /**
     * 获取 产品分类  
     * @return
     */
    @JsonIgnore
    public String getPSCorePrdCatName(){
        Object objValue = this.get(FIELD_PSCOREPRDCATNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 产品分类 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCorePrdCatNameDirty(){
        if(this.contains(FIELD_PSCOREPRDCATNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 产品分类
     */
    @JsonIgnore
    public void resetPSCorePrdCatName(){
        this.reset(FIELD_PSCOREPRDCATNAME);
    }

    /**
     * 设置 产品分类
     * <P>
     * 等同 {@link #setPSCorePrdCatName}
     * @param pSCorePrdCatName
     */
    @JsonIgnore
    public PSCorePrd pscoreprdcatname(String pSCorePrdCatName){
        this.setPSCorePrdCatName(pSCorePrdCatName);
        return this;
    }

    /**
     * <B>PSCOREPRDCATPATH</B>&nbsp;产品分类路径
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCOREPRDCATID}
     */
    public final static String FIELD_PSCOREPRDCATPATH = "pscoreprdcatpath";

    /**
     * 设置 产品分类路径
     * 
     * @param pSCorePrdCatPath
     * 
     */
    @JsonProperty(FIELD_PSCOREPRDCATPATH)
    public void setPSCorePrdCatPath(String pSCorePrdCatPath){
        this.set(FIELD_PSCOREPRDCATPATH, pSCorePrdCatPath);
    }
    
    /**
     * 获取 产品分类路径  
     * @return
     */
    @JsonIgnore
    public String getPSCorePrdCatPath(){
        Object objValue = this.get(FIELD_PSCOREPRDCATPATH);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 产品分类路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCorePrdCatPathDirty(){
        if(this.contains(FIELD_PSCOREPRDCATPATH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 产品分类路径
     */
    @JsonIgnore
    public void resetPSCorePrdCatPath(){
        this.reset(FIELD_PSCOREPRDCATPATH);
    }

    /**
     * 设置 产品分类路径
     * <P>
     * 等同 {@link #setPSCorePrdCatPath}
     * @param pSCorePrdCatPath
     */
    @JsonIgnore
    public PSCorePrd pscoreprdcatpath(String pSCorePrdCatPath){
        this.setPSCorePrdCatPath(pSCorePrdCatPath);
        return this;
    }

    /**
     * <B>PSCOREPRDID</B>&nbsp;产品标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSCOREPRDID = "pscoreprdid";

    /**
     * 设置 产品标识
     * 
     * @param pSCorePrdId
     * 
     */
    @JsonProperty(FIELD_PSCOREPRDID)
    public void setPSCorePrdId(String pSCorePrdId){
        this.set(FIELD_PSCOREPRDID, pSCorePrdId);
    }
    
    /**
     * 获取 产品标识  
     * @return
     */
    @JsonIgnore
    public String getPSCorePrdId(){
        Object objValue = this.get(FIELD_PSCOREPRDID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 产品标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCorePrdIdDirty(){
        if(this.contains(FIELD_PSCOREPRDID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 产品标识
     */
    @JsonIgnore
    public void resetPSCorePrdId(){
        this.reset(FIELD_PSCOREPRDID);
    }

    /**
     * 设置 产品标识
     * <P>
     * 等同 {@link #setPSCorePrdId}
     * @param pSCorePrdId
     */
    @JsonIgnore
    public PSCorePrd pscoreprdid(String pSCorePrdId){
        this.setPSCorePrdId(pSCorePrdId);
        return this;
    }

    /**
     * <B>PSCOREPRDNAME</B>&nbsp;产品名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSCOREPRDNAME = "pscoreprdname";

    /**
     * 设置 产品名称
     * 
     * @param pSCorePrdName
     * 
     */
    @JsonProperty(FIELD_PSCOREPRDNAME)
    public void setPSCorePrdName(String pSCorePrdName){
        this.set(FIELD_PSCOREPRDNAME, pSCorePrdName);
    }
    
    /**
     * 获取 产品名称  
     * @return
     */
    @JsonIgnore
    public String getPSCorePrdName(){
        Object objValue = this.get(FIELD_PSCOREPRDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 产品名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCorePrdNameDirty(){
        if(this.contains(FIELD_PSCOREPRDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 产品名称
     */
    @JsonIgnore
    public void resetPSCorePrdName(){
        this.reset(FIELD_PSCOREPRDNAME);
    }

    /**
     * 设置 产品名称
     * <P>
     * 等同 {@link #setPSCorePrdName}
     * @param pSCorePrdName
     */
    @JsonIgnore
    public PSCorePrd pscoreprdname(String pSCorePrdName){
        this.setPSCorePrdName(pSCorePrdName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSCorePrdName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSCorePrdName(strName);
    }

    @JsonIgnore
    public PSCorePrd name(String strName){
        this.setPSCorePrdName(strName);
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
    public PSCorePrd updatedate(String updateDate){
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
    public PSCorePrd updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSCorePrdId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSCorePrdId(strValue);
    }

    @JsonIgnore
    public PSCorePrd id(String strValue){
        this.setPSCorePrdId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSCorePrd){
            PSCorePrd model = (PSCorePrd)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
