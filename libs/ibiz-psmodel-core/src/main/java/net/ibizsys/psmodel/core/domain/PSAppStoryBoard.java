package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSAPPSTORYBOARD</B>应用故事板 模型传输对象
 * <P>
 * 应用故事板模型，定义应用中视图的迁移信息，提供应用及视图的全局关联展示场景
 */
public class PSAppStoryBoard extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSAppStoryBoard(){
        this.setValidFlag(1);
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定应用故事板的代码标识，需要在所在的前端应用中具有唯一性
     * <P>
     * 字符串：最大长度 50，由字母、数字、下划线组成，且开始必须为字母
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
    public PSAppStoryBoard codename(String codeName){
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
    public PSAppStoryBoard createdate(String createDate){
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
    public PSAppStoryBoard createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DEFAULTFLAG</B>&nbsp;应用默认，指定应用故事板是否为应用的默认故事板，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEFAULTFLAG = "defaultflag";

    /**
     * 设置 应用默认，详细说明：{@link #FIELD_DEFAULTFLAG}
     * 
     * @param defaultFlag
     * 
     */
    @JsonProperty(FIELD_DEFAULTFLAG)
    public void setDefaultFlag(Integer defaultFlag){
        this.set(FIELD_DEFAULTFLAG, defaultFlag);
    }
    
    /**
     * 获取 应用默认  
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
     * 判断 应用默认 是否指定值，包括空值
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
     * 重置 应用默认
     */
    @JsonIgnore
    public void resetDefaultFlag(){
        this.reset(FIELD_DEFAULTFLAG);
    }

    /**
     * 设置 应用默认，详细说明：{@link #FIELD_DEFAULTFLAG}
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSAppStoryBoard defaultflag(Integer defaultFlag){
        this.setDefaultFlag(defaultFlag);
        return this;
    }

     /**
     * 设置 应用默认，详细说明：{@link #FIELD_DEFAULTFLAG}
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSAppStoryBoard defaultflag(Boolean defaultFlag){
        if(defaultFlag == null){
            this.setDefaultFlag(null);
        }
        else{
            this.setDefaultFlag(defaultFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
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
    public PSAppStoryBoard memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSAPPSTORYBOARDID</B>&nbsp;故事板标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSAPPSTORYBOARDID = "psappstoryboardid";

    /**
     * 设置 故事板标识
     * 
     * @param pSAppStoryBoardId
     * 
     */
    @JsonProperty(FIELD_PSAPPSTORYBOARDID)
    public void setPSAppStoryBoardId(String pSAppStoryBoardId){
        this.set(FIELD_PSAPPSTORYBOARDID, pSAppStoryBoardId);
    }
    
    /**
     * 获取 故事板标识  
     * @return
     */
    @JsonIgnore
    public String getPSAppStoryBoardId(){
        Object objValue = this.get(FIELD_PSAPPSTORYBOARDID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 故事板标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppStoryBoardIdDirty(){
        if(this.contains(FIELD_PSAPPSTORYBOARDID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 故事板标识
     */
    @JsonIgnore
    public void resetPSAppStoryBoardId(){
        this.reset(FIELD_PSAPPSTORYBOARDID);
    }

    /**
     * 设置 故事板标识
     * <P>
     * 等同 {@link #setPSAppStoryBoardId}
     * @param pSAppStoryBoardId
     */
    @JsonIgnore
    public PSAppStoryBoard psappstoryboardid(String pSAppStoryBoardId){
        this.setPSAppStoryBoardId(pSAppStoryBoardId);
        return this;
    }

    /**
     * <B>PSAPPSTORYBOARDNAME</B>&nbsp;故事板名称，指定应用故事板的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSAPPSTORYBOARDNAME = "psappstoryboardname";

    /**
     * 设置 故事板名称，详细说明：{@link #FIELD_PSAPPSTORYBOARDNAME}
     * 
     * @param pSAppStoryBoardName
     * 
     */
    @JsonProperty(FIELD_PSAPPSTORYBOARDNAME)
    public void setPSAppStoryBoardName(String pSAppStoryBoardName){
        this.set(FIELD_PSAPPSTORYBOARDNAME, pSAppStoryBoardName);
    }
    
    /**
     * 获取 故事板名称  
     * @return
     */
    @JsonIgnore
    public String getPSAppStoryBoardName(){
        Object objValue = this.get(FIELD_PSAPPSTORYBOARDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 故事板名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppStoryBoardNameDirty(){
        if(this.contains(FIELD_PSAPPSTORYBOARDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 故事板名称
     */
    @JsonIgnore
    public void resetPSAppStoryBoardName(){
        this.reset(FIELD_PSAPPSTORYBOARDNAME);
    }

    /**
     * 设置 故事板名称，详细说明：{@link #FIELD_PSAPPSTORYBOARDNAME}
     * <P>
     * 等同 {@link #setPSAppStoryBoardName}
     * @param pSAppStoryBoardName
     */
    @JsonIgnore
    public PSAppStoryBoard psappstoryboardname(String pSAppStoryBoardName){
        this.setPSAppStoryBoardName(pSAppStoryBoardName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSAppStoryBoardName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSAppStoryBoardName(strName);
    }

    @JsonIgnore
    public PSAppStoryBoard name(String strName){
        this.setPSAppStoryBoardName(strName);
        return this;
    }

    /**
     * <B>PSDYNAINSTID</B>&nbsp;动态实例标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDYNAINSTID = "psdynainstid";

    /**
     * 设置 动态实例标识
     * 
     * @param pSDynaInstId
     * 
     */
    @JsonProperty(FIELD_PSDYNAINSTID)
    public void setPSDynaInstId(String pSDynaInstId){
        this.set(FIELD_PSDYNAINSTID, pSDynaInstId);
    }
    
    /**
     * 获取 动态实例标识  
     * @return
     */
    @JsonIgnore
    public String getPSDynaInstId(){
        Object objValue = this.get(FIELD_PSDYNAINSTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 动态实例标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDynaInstIdDirty(){
        if(this.contains(FIELD_PSDYNAINSTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 动态实例标识
     */
    @JsonIgnore
    public void resetPSDynaInstId(){
        this.reset(FIELD_PSDYNAINSTID);
    }

    /**
     * 设置 动态实例标识
     * <P>
     * 等同 {@link #setPSDynaInstId}
     * @param pSDynaInstId
     */
    @JsonIgnore
    public PSAppStoryBoard psdynainstid(String pSDynaInstId){
        this.setPSDynaInstId(pSDynaInstId);
        return this;
    }

    /**
     * <B>PSSYSAPPID</B>&nbsp;系统应用，指定应用故事板所属的前端应用
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
    public PSAppStoryBoard pssysappid(String pSSysAppId){
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
    public PSAppStoryBoard pssysappid(PSSysApp pSSysApp){
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
     * <B>PSSYSAPPNAME</B>&nbsp;前端应用，指定应用故事板所属的前端应用
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
    public PSAppStoryBoard pssysappname(String pSSysAppName){
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    /**
     * <B>SBTAG</B>&nbsp;故事板标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_SBTAG = "sbtag";

    /**
     * 设置 故事板标记
     * 
     * @param sBTag
     * 
     */
    @JsonProperty(FIELD_SBTAG)
    public void setSBTag(String sBTag){
        this.set(FIELD_SBTAG, sBTag);
    }
    
    /**
     * 获取 故事板标记  
     * @return
     */
    @JsonIgnore
    public String getSBTag(){
        Object objValue = this.get(FIELD_SBTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 故事板标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSBTagDirty(){
        if(this.contains(FIELD_SBTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 故事板标记
     */
    @JsonIgnore
    public void resetSBTag(){
        this.reset(FIELD_SBTAG);
    }

    /**
     * 设置 故事板标记
     * <P>
     * 等同 {@link #setSBTag}
     * @param sBTag
     */
    @JsonIgnore
    public PSAppStoryBoard sbtag(String sBTag){
        this.setSBTag(sBTag);
        return this;
    }

    /**
     * <B>SBTAG2</B>&nbsp;故事板标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_SBTAG2 = "sbtag2";

    /**
     * 设置 故事板标记2
     * 
     * @param sBTag2
     * 
     */
    @JsonProperty(FIELD_SBTAG2)
    public void setSBTag2(String sBTag2){
        this.set(FIELD_SBTAG2, sBTag2);
    }
    
    /**
     * 获取 故事板标记2  
     * @return
     */
    @JsonIgnore
    public String getSBTag2(){
        Object objValue = this.get(FIELD_SBTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 故事板标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSBTag2Dirty(){
        if(this.contains(FIELD_SBTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 故事板标记2
     */
    @JsonIgnore
    public void resetSBTag2(){
        this.reset(FIELD_SBTAG2);
    }

    /**
     * 设置 故事板标记2
     * <P>
     * 等同 {@link #setSBTag2}
     * @param sBTag2
     */
    @JsonIgnore
    public PSAppStoryBoard sbtag2(String sBTag2){
        this.setSBTag2(sBTag2);
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
    public PSAppStoryBoard updatedate(String updateDate){
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
    public PSAppStoryBoard updateman(String updateMan){
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
    public PSAppStoryBoard usercat(String userCat){
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
    public PSAppStoryBoard usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSAppStoryBoard usertag(String userTag){
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
    public PSAppStoryBoard usertag2(String userTag2){
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
    public PSAppStoryBoard usertag3(String userTag3){
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
    public PSAppStoryBoard usertag4(String userTag4){
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
    public PSAppStoryBoard validflag(Integer validFlag){
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
    public PSAppStoryBoard validflag(Boolean validFlag){
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
        return this.getPSAppStoryBoardId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSAppStoryBoardId(strValue);
    }

    @JsonIgnore
    public PSAppStoryBoard id(String strValue){
        this.setPSAppStoryBoardId(strValue);
        return this;
    }


    /**
     *  应用故事板项目 成员集合
     */
    public final static String FIELD_PSAPPSBITEMS = "psappsbitems";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSAppSBItem> psappsbitems;

    /**
     * 获取 应用故事板项目 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSAPPSBITEMS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSAppSBItem> getPSAppSBItems(){
        return this.psappsbitems;
    }

    /**
     * 设置 应用故事板项目 成员集合  
     * @param psappsbitems
     */
    @JsonProperty(FIELD_PSAPPSBITEMS)
    public void setPSAppSBItems(java.util.List<net.ibizsys.psmodel.core.domain.PSAppSBItem> psappsbitems){
        this.psappsbitems = psappsbitems;
    }

    /**
     * 获取 应用故事板项目 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSAppSBItem> getPSAppSBItemsIf(){
        if(this.psappsbitems == null){
            this.psappsbitems = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSAppSBItem>();          
        }
        return this.psappsbitems;
    }


    /**
     *  应用故事板项目关系 成员集合
     */
    public final static String FIELD_PSAPPSBITEMRSS = "psappsbitemrs";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSAppSBItemRS> psappsbitemrs;

    /**
     * 获取 应用故事板项目关系 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSAPPSBITEMRSS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSAppSBItemRS> getPSAppSBItemRSs(){
        return this.psappsbitemrs;
    }

    /**
     * 设置 应用故事板项目关系 成员集合  
     * @param psappsbitemrs
     */
    @JsonProperty(FIELD_PSAPPSBITEMRSS)
    public void setPSAppSBItemRSs(java.util.List<net.ibizsys.psmodel.core.domain.PSAppSBItemRS> psappsbitemrs){
        this.psappsbitemrs = psappsbitemrs;
    }

    /**
     * 获取 应用故事板项目关系 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSAppSBItemRS> getPSAppSBItemRSsIf(){
        if(this.psappsbitemrs == null){
            this.psappsbitemrs = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSAppSBItemRS>();          
        }
        return this.psappsbitemrs;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSAppStoryBoard){
            PSAppStoryBoard model = (PSAppStoryBoard)iPSModel;
            model.setPSAppSBItems(this.getPSAppSBItems());
            model.setPSAppSBItemRSs(this.getPSAppSBItemRSs());
        }
        super.copyTo(iPSModel);
    }
}
