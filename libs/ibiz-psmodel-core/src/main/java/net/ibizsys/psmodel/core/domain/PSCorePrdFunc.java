package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSCOREPRDFUNC</B>云平台核心产品功能 模型传输对象
 * <P>
 * 
 */
public class PSCorePrdFunc extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSCorePrdFunc(){
    }      
    
    /**
     * <B>DEPENDENCIES</B>&nbsp;依赖
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_DEPENDENCIES = "dependencies";

    /**
     * 设置 依赖
     * 
     * @param dependencies
     * 
     */
    @JsonProperty(FIELD_DEPENDENCIES)
    public void setDependencies(String dependencies){
        this.set(FIELD_DEPENDENCIES, dependencies);
    }
    
    /**
     * 获取 依赖  
     * @return
     */
    @JsonIgnore
    public String getDependencies(){
        Object objValue = this.get(FIELD_DEPENDENCIES);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 依赖 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDependenciesDirty(){
        if(this.contains(FIELD_DEPENDENCIES)){
            return true;
        }
        return false;
    }

    /**
     * 重置 依赖
     */
    @JsonIgnore
    public void resetDependencies(){
        this.reset(FIELD_DEPENDENCIES);
    }

    /**
     * 设置 依赖
     * <P>
     * 等同 {@link #setDependencies}
     * @param dependencies
     */
    @JsonIgnore
    public PSCorePrdFunc dependencies(String dependencies){
        this.setDependencies(dependencies);
        return this;
    }
    

    /**
     * <B>CHANGELOG</B>&nbsp;变更日志
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_CHANGELOG = "changelog";

    /**
     * 设置 变更日志
     * 
     * @param changelog
     * 
     */
    @JsonProperty(FIELD_CHANGELOG)
    public void setChangelog(String changelog){
        this.set(FIELD_CHANGELOG, changelog);
    }
    
    /**
     * 获取 变更日志  
     * @return
     */
    @JsonIgnore
    public String getChangelog(){
        Object objValue = this.get(FIELD_CHANGELOG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 变更日志 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isChangelogDirty(){
        if(this.contains(FIELD_CHANGELOG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 变更日志
     */
    @JsonIgnore
    public void resetChangelog(){
        this.reset(FIELD_CHANGELOG);
    }

    /**
     * 设置 变更日志
     * <P>
     * 等同 {@link #setChangelog}
     * @param changelog
     */
    @JsonIgnore
    public PSCorePrdFunc changelog(String changelog){
        this.setChangelog(changelog);
        return this;
    }
    
    
    /**
     * <B>CATEGORY</B>&nbsp;分类
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_CATEGORY = "category";

    /**
     * 设置 分类
     * 
     * @param category
     * 
     */
    @JsonProperty(FIELD_CATEGORY)
    public void setCategory(String category){
        this.set(FIELD_CATEGORY, category);
    }
    
    /**
     * 获取 分类  
     * @return
     */
    @JsonIgnore
    public String getCategory(){
        Object objValue = this.get(FIELD_CATEGORY);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分类 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCategoryDirty(){
        if(this.contains(FIELD_CATEGORY)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分类
     */
    @JsonIgnore
    public void resetCategory(){
        this.reset(FIELD_CATEGORY);
    }

    /**
     * 设置 分类
     * <P>
     * 等同 {@link #setCategory}
     * @param category
     */
    @JsonIgnore
    public PSCorePrdFunc category(String category){
        this.setCategory(category);
        return this;
    }
    
    
    /**
     * <B>INFO</B>&nbsp;功能信息
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_INFO = "info";

    /**
     * 设置 功能信息
     * 
     * @param info
     * 
     */
    @JsonProperty(FIELD_INFO)
    public void setInfo(String info){
        this.set(FIELD_INFO, info);
    }
    
    /**
     * 获取 功能信息  
     * @return
     */
    @JsonIgnore
    public String getInfo(){
        Object objValue = this.get(FIELD_INFO);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能信息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isInfoDirty(){
        if(this.contains(FIELD_INFO)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能信息
     */
    @JsonIgnore
    public void resetInfo(){
        this.reset(FIELD_INFO);
    }

    /**
     * 设置 功能信息
     * <P>
     * 等同 {@link #setInfo}
     * @param info
     */
    @JsonIgnore
    public PSCorePrdFunc info(String info){
        this.setInfo(info);
        return this;
    }
    
    /**
     * <B>VERS</B>&nbsp;版本集合
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_VERS = "vers";

    /**
     * 设置 版本集合
     * 
     * @param vers
     * 
     */
    @JsonProperty(FIELD_VERS)
    public void setVers(String vers){
        this.set(FIELD_VERS, vers);
    }
    
    /**
     * 获取 版本集合  
     * @return
     */
    @JsonIgnore
    public String getVers(){
        Object objValue = this.get(FIELD_VERS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 版本集合 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isVersDirty(){
        if(this.contains(FIELD_VERS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 版本集合
     */
    @JsonIgnore
    public void resetVers(){
        this.reset(FIELD_VERS);
    }

    /**
     * 设置 版本集合
     * <P>
     * 等同 {@link #setVers}
     * @param vers
     */
    @JsonIgnore
    public PSCorePrdFunc vers(String vers){
        this.setVers(vers);
        return this;
    }
    
    /**
     * <B>SETTINGS</B>&nbsp;设置参数
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_SETTINGS = "settings";

    /**
     * 设置 设置参数
     * 
     * @param settings
     * 
     */
    @JsonProperty(FIELD_SETTINGS)
    public void setSettings(String settings){
        this.set(FIELD_SETTINGS, settings);
    }
    
    /**
     * 获取 设置参数  
     * @return
     */
    @JsonIgnore
    public String getSettings(){
        Object objValue = this.get(FIELD_SETTINGS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 设置参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSettingsDirty(){
        if(this.contains(FIELD_SETTINGS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 设置参数
     */
    @JsonIgnore
    public void resetSettings(){
        this.reset(FIELD_SETTINGS);
    }

    /**
     * 设置 设置参数
     * <P>
     * 等同 {@link #setSettings}
     * @param settings
     */
    @JsonIgnore
    public PSCorePrdFunc settings(String settings){
        this.setSettings(settings);
        return this;
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
    public PSCorePrdFunc settingurl(String settingUrl){
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
    public PSCorePrdFunc avatarurl(String avatarUrl){
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
    public PSCorePrdFunc createdate(String createDate){
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
    public PSCorePrdFunc createman(String createMan){
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
    public PSCorePrdFunc currentversion(String currentVersion){
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
    public PSCorePrdFunc fullname(String fullName){
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
    public PSCorePrdFunc fullpath(String fullPath){
        this.setFullPath(fullPath);
        return this;
    }

    /**
     * <B>FUNCPARAMS</B>&nbsp;功能参数
     */
    public final static String FIELD_FUNCPARAMS = "funcparams";

    /**
     * 设置 功能参数
     * 
     * @param funcParams
     * 
     */
    @JsonProperty(FIELD_FUNCPARAMS)
    public void setFuncParams(String funcParams){
        this.set(FIELD_FUNCPARAMS, funcParams);
    }
    
    /**
     * 获取 功能参数  
     * @return
     */
    @JsonIgnore
    public String getFuncParams(){
        Object objValue = this.get(FIELD_FUNCPARAMS);
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
    public boolean isFuncParamsDirty(){
        if(this.contains(FIELD_FUNCPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能参数
     */
    @JsonIgnore
    public void resetFuncParams(){
        this.reset(FIELD_FUNCPARAMS);
    }

    /**
     * 设置 功能参数
     * <P>
     * 等同 {@link #setFuncParams}
     * @param funcParams
     */
    @JsonIgnore
    public PSCorePrdFunc funcparams(String funcParams){
        this.setFuncParams(funcParams);
        return this;
    }

    /**
     * <B>FUNCSN</B>&nbsp;功能编号
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_FUNCSN = "funcsn";

    /**
     * 设置 功能编号
     * 
     * @param funcSN
     * 
     */
    @JsonProperty(FIELD_FUNCSN)
    public void setFuncSN(String funcSN){
        this.set(FIELD_FUNCSN, funcSN);
    }
    
    /**
     * 获取 功能编号  
     * @return
     */
    @JsonIgnore
    public String getFuncSN(){
        Object objValue = this.get(FIELD_FUNCSN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能编号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFuncSNDirty(){
        if(this.contains(FIELD_FUNCSN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能编号
     */
    @JsonIgnore
    public void resetFuncSN(){
        this.reset(FIELD_FUNCSN);
    }

    /**
     * 设置 功能编号
     * <P>
     * 等同 {@link #setFuncSN}
     * @param funcSN
     */
    @JsonIgnore
    public PSCorePrdFunc funcsn(String funcSN){
        this.setFuncSN(funcSN);
        return this;
    }

    /**
     * <B>FUNCSTATE</B>&nbsp;功能状态
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ProductFuncState} 
     */
    public final static String FIELD_FUNCSTATE = "funcstate";

    /**
     * 设置 功能状态
     * 
     * @param funcState
     * 
     */
    @JsonProperty(FIELD_FUNCSTATE)
    public void setFuncState(Integer funcState){
        this.set(FIELD_FUNCSTATE, funcState);
    }
    
    /**
     * 获取 功能状态  
     * @return
     */
    @JsonIgnore
    public Integer getFuncState(){
        Object objValue = this.get(FIELD_FUNCSTATE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 功能状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFuncStateDirty(){
        if(this.contains(FIELD_FUNCSTATE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能状态
     */
    @JsonIgnore
    public void resetFuncState(){
        this.reset(FIELD_FUNCSTATE);
    }

    /**
     * 设置 功能状态
     * <P>
     * 等同 {@link #setFuncState}
     * @param funcState
     */
    @JsonIgnore
    public PSCorePrdFunc funcstate(Integer funcState){
        this.setFuncState(funcState);
        return this;
    }

     /**
     * 设置 功能状态
     * <P>
     * 等同 {@link #setFuncState}
     * @param funcState
     */
    @JsonIgnore
    public PSCorePrdFunc funcstate(net.ibizsys.psmodel.core.util.PSModelEnums.ProductFuncState funcState){
        if(funcState == null){
            this.setFuncState(null);
        }
        else{
            this.setFuncState(funcState.value);
        }
        return this;
    }

    /**
     * <B>FUNCTAG</B>&nbsp;功能标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_FUNCTAG = "functag";

    /**
     * 设置 功能标记
     * 
     * @param funcTag
     * 
     */
    @JsonProperty(FIELD_FUNCTAG)
    public void setFuncTag(String funcTag){
        this.set(FIELD_FUNCTAG, funcTag);
    }
    
    /**
     * 获取 功能标记  
     * @return
     */
    @JsonIgnore
    public String getFuncTag(){
        Object objValue = this.get(FIELD_FUNCTAG);
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
    public boolean isFuncTagDirty(){
        if(this.contains(FIELD_FUNCTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能标记
     */
    @JsonIgnore
    public void resetFuncTag(){
        this.reset(FIELD_FUNCTAG);
    }

    /**
     * 设置 功能标记
     * <P>
     * 等同 {@link #setFuncTag}
     * @param funcTag
     */
    @JsonIgnore
    public PSCorePrdFunc functag(String funcTag){
        this.setFuncTag(funcTag);
        return this;
    }

    /**
     * <B>FUNCTAG2</B>&nbsp;功能标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_FUNCTAG2 = "functag2";

    /**
     * 设置 功能标记2
     * 
     * @param funcTag2
     * 
     */
    @JsonProperty(FIELD_FUNCTAG2)
    public void setFuncTag2(String funcTag2){
        this.set(FIELD_FUNCTAG2, funcTag2);
    }
    
    /**
     * 获取 功能标记2  
     * @return
     */
    @JsonIgnore
    public String getFuncTag2(){
        Object objValue = this.get(FIELD_FUNCTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFuncTag2Dirty(){
        if(this.contains(FIELD_FUNCTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能标记2
     */
    @JsonIgnore
    public void resetFuncTag2(){
        this.reset(FIELD_FUNCTAG2);
    }

    /**
     * 设置 功能标记2
     * <P>
     * 等同 {@link #setFuncTag2}
     * @param funcTag2
     */
    @JsonIgnore
    public PSCorePrdFunc functag2(String funcTag2){
        this.setFuncTag2(funcTag2);
        return this;
    }

    /**
     * <B>FUNCTYPE</B>&nbsp;功能类型
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_FUNCTYPE = "functype";

    /**
     * 设置 功能类型
     * 
     * @param funcType
     * 
     */
    @JsonProperty(FIELD_FUNCTYPE)
    public void setFuncType(String funcType){
        this.set(FIELD_FUNCTYPE, funcType);
    }
    
    /**
     * 获取 功能类型  
     * @return
     */
    @JsonIgnore
    public String getFuncType(){
        Object objValue = this.get(FIELD_FUNCTYPE);
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
    public boolean isFuncTypeDirty(){
        if(this.contains(FIELD_FUNCTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能类型
     */
    @JsonIgnore
    public void resetFuncType(){
        this.reset(FIELD_FUNCTYPE);
    }

    /**
     * 设置 功能类型
     * <P>
     * 等同 {@link #setFuncType}
     * @param funcType
     */
    @JsonIgnore
    public PSCorePrdFunc functype(String funcType){
        this.setFuncType(funcType);
        return this;
    }

    /**
     * <B>FUNCURL</B>&nbsp;功能描述链接
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_FUNCURL = "funcurl";

    /**
     * 设置 功能描述链接
     * 
     * @param funcUrl
     * 
     */
    @JsonProperty(FIELD_FUNCURL)
    public void setFuncUrl(String funcUrl){
        this.set(FIELD_FUNCURL, funcUrl);
    }
    
    /**
     * 获取 功能描述链接  
     * @return
     */
    @JsonIgnore
    public String getFuncUrl(){
        Object objValue = this.get(FIELD_FUNCURL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能描述链接 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFuncUrlDirty(){
        if(this.contains(FIELD_FUNCURL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能描述链接
     */
    @JsonIgnore
    public void resetFuncUrl(){
        this.reset(FIELD_FUNCURL);
    }

    /**
     * 设置 功能描述链接
     * <P>
     * 等同 {@link #setFuncUrl}
     * @param funcUrl
     */
    @JsonIgnore
    public PSCorePrdFunc funcurl(String funcUrl){
        this.setFuncUrl(funcUrl);
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
    public PSCorePrdFunc httpurltorepo(String httpUrlToRepo){
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
    public PSCorePrdFunc memo(String memo){
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
    public PSCorePrdFunc ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
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
    public PSCorePrdFunc path(String path){
        this.setPath(path);
        return this;
    }

    /**
     * <B>PSCOREPRDFUNCID</B>&nbsp;云平台核心产品功能标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSCOREPRDFUNCID = "pscoreprdfuncid";

    /**
     * 设置 云平台核心产品功能标识
     * 
     * @param pSCorePrdFuncId
     * 
     */
    @JsonProperty(FIELD_PSCOREPRDFUNCID)
    public void setPSCorePrdFuncId(String pSCorePrdFuncId){
        this.set(FIELD_PSCOREPRDFUNCID, pSCorePrdFuncId);
    }
    
    /**
     * 获取 云平台核心产品功能标识  
     * @return
     */
    @JsonIgnore
    public String getPSCorePrdFuncId(){
        Object objValue = this.get(FIELD_PSCOREPRDFUNCID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 云平台核心产品功能标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCorePrdFuncIdDirty(){
        if(this.contains(FIELD_PSCOREPRDFUNCID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 云平台核心产品功能标识
     */
    @JsonIgnore
    public void resetPSCorePrdFuncId(){
        this.reset(FIELD_PSCOREPRDFUNCID);
    }

    /**
     * 设置 云平台核心产品功能标识
     * <P>
     * 等同 {@link #setPSCorePrdFuncId}
     * @param pSCorePrdFuncId
     */
    @JsonIgnore
    public PSCorePrdFunc pscoreprdfuncid(String pSCorePrdFuncId){
        this.setPSCorePrdFuncId(pSCorePrdFuncId);
        return this;
    }

    /**
     * <B>PSCOREPRDFUNCNAME</B>&nbsp;功能标题
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSCOREPRDFUNCNAME = "pscoreprdfuncname";

    /**
     * 设置 功能标题
     * 
     * @param pSCorePrdFuncName
     * 
     */
    @JsonProperty(FIELD_PSCOREPRDFUNCNAME)
    public void setPSCorePrdFuncName(String pSCorePrdFuncName){
        this.set(FIELD_PSCOREPRDFUNCNAME, pSCorePrdFuncName);
    }
    
    /**
     * 获取 功能标题  
     * @return
     */
    @JsonIgnore
    public String getPSCorePrdFuncName(){
        Object objValue = this.get(FIELD_PSCOREPRDFUNCNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能标题 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCorePrdFuncNameDirty(){
        if(this.contains(FIELD_PSCOREPRDFUNCNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能标题
     */
    @JsonIgnore
    public void resetPSCorePrdFuncName(){
        this.reset(FIELD_PSCOREPRDFUNCNAME);
    }

    /**
     * 设置 功能标题
     * <P>
     * 等同 {@link #setPSCorePrdFuncName}
     * @param pSCorePrdFuncName
     */
    @JsonIgnore
    public PSCorePrdFunc pscoreprdfuncname(String pSCorePrdFuncName){
        this.setPSCorePrdFuncName(pSCorePrdFuncName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSCorePrdFuncName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSCorePrdFuncName(strName);
    }

    @JsonIgnore
    public PSCorePrdFunc name(String strName){
        this.setPSCorePrdFuncName(strName);
        return this;
    }

    /**
     * <B>PSCOREPRDID</B>&nbsp;核心产品
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSCOREPRDID = "pscoreprdid";

    /**
     * 设置 核心产品
     * 
     * @param pSCorePrdId
     * 
     */
    @JsonProperty(FIELD_PSCOREPRDID)
    public void setPSCorePrdId(String pSCorePrdId){
        this.set(FIELD_PSCOREPRDID, pSCorePrdId);
    }
    
    /**
     * 获取 核心产品  
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
     * 判断 核心产品 是否指定值，包括空值
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
     * 重置 核心产品
     */
    @JsonIgnore
    public void resetPSCorePrdId(){
        this.reset(FIELD_PSCOREPRDID);
    }

    /**
     * 设置 核心产品
     * <P>
     * 等同 {@link #setPSCorePrdId}
     * @param pSCorePrdId
     */
    @JsonIgnore
    public PSCorePrdFunc pscoreprdid(String pSCorePrdId){
        this.setPSCorePrdId(pSCorePrdId);
        return this;
    }

    /**
     * <B>PSCOREPRDNAME</B>&nbsp;核心产品
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCOREPRDID}
     */
    public final static String FIELD_PSCOREPRDNAME = "pscoreprdname";

    /**
     * 设置 核心产品
     * 
     * @param pSCorePrdName
     * 
     */
    @JsonProperty(FIELD_PSCOREPRDNAME)
    public void setPSCorePrdName(String pSCorePrdName){
        this.set(FIELD_PSCOREPRDNAME, pSCorePrdName);
    }
    
    /**
     * 获取 核心产品  
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
     * 判断 核心产品 是否指定值，包括空值
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
     * 重置 核心产品
     */
    @JsonIgnore
    public void resetPSCorePrdName(){
        this.reset(FIELD_PSCOREPRDNAME);
    }

    /**
     * 设置 核心产品
     * <P>
     * 等同 {@link #setPSCorePrdName}
     * @param pSCorePrdName
     */
    @JsonIgnore
    public PSCorePrdFunc pscoreprdname(String pSCorePrdName){
        this.setPSCorePrdName(pSCorePrdName);
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
    public PSCorePrdFunc updatedate(String updateDate){
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
    public PSCorePrdFunc updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSCorePrdFuncId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSCorePrdFuncId(strValue);
    }

    @JsonIgnore
    public PSCorePrdFunc id(String strValue){
        this.setPSCorePrdFuncId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSCorePrdFunc){
            PSCorePrdFunc model = (PSCorePrdFunc)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
