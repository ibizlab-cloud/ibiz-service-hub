package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSWXMENU</B>微信菜单 模型传输对象
 * <P>
 * 微信菜单模型，定义微信公众号或微信应用使用的菜单。微信菜单包含多层级的菜单项模型
 */
public class PSWXMenu extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSWXMenu(){
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定微信菜单的代码标识，需在所属模型域（微信公众号或微信应用）中具备唯一性
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
    public PSWXMenu codename(String codeName){
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
    public PSWXMenu createdate(String createDate){
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
    public PSWXMenu createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DEFAULTFLAG</B>&nbsp;默认菜单，指定微信菜单是否为所属微信公共号或是微信应用的默认菜单，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEFAULTFLAG = "defaultflag";

    /**
     * 设置 默认菜单，详细说明：{@link #FIELD_DEFAULTFLAG}
     * 
     * @param defaultFlag
     * 
     */
    @JsonProperty(FIELD_DEFAULTFLAG)
    public void setDefaultFlag(Integer defaultFlag){
        this.set(FIELD_DEFAULTFLAG, defaultFlag);
    }
    
    /**
     * 获取 默认菜单  
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
     * 判断 默认菜单 是否指定值，包括空值
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
     * 重置 默认菜单
     */
    @JsonIgnore
    public void resetDefaultFlag(){
        this.reset(FIELD_DEFAULTFLAG);
    }

    /**
     * 设置 默认菜单，详细说明：{@link #FIELD_DEFAULTFLAG}
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSWXMenu defaultflag(Integer defaultFlag){
        this.setDefaultFlag(defaultFlag);
        return this;
    }

     /**
     * 设置 默认菜单，详细说明：{@link #FIELD_DEFAULTFLAG}
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSWXMenu defaultflag(Boolean defaultFlag){
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
    public PSWXMenu memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSWXACCOUNTID</B>&nbsp;微信公众号，指定微信菜单所属的微信公众号
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSWXAccount} 
     */
    public final static String FIELD_PSWXACCOUNTID = "pswxaccountid";

    /**
     * 设置 微信公众号，详细说明：{@link #FIELD_PSWXACCOUNTID}
     * 
     * @param pSWXAccountId
     * 
     */
    @JsonProperty(FIELD_PSWXACCOUNTID)
    public void setPSWXAccountId(String pSWXAccountId){
        this.set(FIELD_PSWXACCOUNTID, pSWXAccountId);
    }
    
    /**
     * 获取 微信公众号  
     * @return
     */
    @JsonIgnore
    public String getPSWXAccountId(){
        Object objValue = this.get(FIELD_PSWXACCOUNTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 微信公众号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWXAccountIdDirty(){
        if(this.contains(FIELD_PSWXACCOUNTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 微信公众号
     */
    @JsonIgnore
    public void resetPSWXAccountId(){
        this.reset(FIELD_PSWXACCOUNTID);
    }

    /**
     * 设置 微信公众号，详细说明：{@link #FIELD_PSWXACCOUNTID}
     * <P>
     * 等同 {@link #setPSWXAccountId}
     * @param pSWXAccountId
     */
    @JsonIgnore
    public PSWXMenu pswxaccountid(String pSWXAccountId){
        this.setPSWXAccountId(pSWXAccountId);
        return this;
    }

    /**
     * 设置 微信公众号，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSWXAccountId}
     * @param pSWXAccount 引用对象
     */
    @JsonIgnore
    public PSWXMenu pswxaccountid(PSWXAccount pSWXAccount){
        if(pSWXAccount == null){
            this.setPSWXAccountId(null);
            this.setPSWXAccountName(null);
        }
        else{
            this.setPSWXAccountId(pSWXAccount.getPSWXAccountId());
            this.setPSWXAccountName(pSWXAccount.getPSWXAccountName());
        }
        return this;
    }

    /**
     * <B>PSWXACCOUNTNAME</B>&nbsp;微信公众号，指定微信菜单所属的微信公众号
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWXACCOUNTID}
     */
    public final static String FIELD_PSWXACCOUNTNAME = "pswxaccountname";

    /**
     * 设置 微信公众号，详细说明：{@link #FIELD_PSWXACCOUNTNAME}
     * 
     * @param pSWXAccountName
     * 
     */
    @JsonProperty(FIELD_PSWXACCOUNTNAME)
    public void setPSWXAccountName(String pSWXAccountName){
        this.set(FIELD_PSWXACCOUNTNAME, pSWXAccountName);
    }
    
    /**
     * 获取 微信公众号  
     * @return
     */
    @JsonIgnore
    public String getPSWXAccountName(){
        Object objValue = this.get(FIELD_PSWXACCOUNTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 微信公众号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWXAccountNameDirty(){
        if(this.contains(FIELD_PSWXACCOUNTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 微信公众号
     */
    @JsonIgnore
    public void resetPSWXAccountName(){
        this.reset(FIELD_PSWXACCOUNTNAME);
    }

    /**
     * 设置 微信公众号，详细说明：{@link #FIELD_PSWXACCOUNTNAME}
     * <P>
     * 等同 {@link #setPSWXAccountName}
     * @param pSWXAccountName
     */
    @JsonIgnore
    public PSWXMenu pswxaccountname(String pSWXAccountName){
        this.setPSWXAccountName(pSWXAccountName);
        return this;
    }

    /**
     * <B>PSWXENTAPPID</B>&nbsp;微信企业应用，指定微信菜单所属的微信应用
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSWXEntApp} 
     */
    public final static String FIELD_PSWXENTAPPID = "pswxentappid";

    /**
     * 设置 微信企业应用，详细说明：{@link #FIELD_PSWXENTAPPID}
     * 
     * @param pSWXEntAppId
     * 
     */
    @JsonProperty(FIELD_PSWXENTAPPID)
    public void setPSWXEntAppId(String pSWXEntAppId){
        this.set(FIELD_PSWXENTAPPID, pSWXEntAppId);
    }
    
    /**
     * 获取 微信企业应用  
     * @return
     */
    @JsonIgnore
    public String getPSWXEntAppId(){
        Object objValue = this.get(FIELD_PSWXENTAPPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 微信企业应用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWXEntAppIdDirty(){
        if(this.contains(FIELD_PSWXENTAPPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 微信企业应用
     */
    @JsonIgnore
    public void resetPSWXEntAppId(){
        this.reset(FIELD_PSWXENTAPPID);
    }

    /**
     * 设置 微信企业应用，详细说明：{@link #FIELD_PSWXENTAPPID}
     * <P>
     * 等同 {@link #setPSWXEntAppId}
     * @param pSWXEntAppId
     */
    @JsonIgnore
    public PSWXMenu pswxentappid(String pSWXEntAppId){
        this.setPSWXEntAppId(pSWXEntAppId);
        return this;
    }

    /**
     * 设置 微信企业应用，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSWXEntAppId}
     * @param pSWXEntApp 引用对象
     */
    @JsonIgnore
    public PSWXMenu pswxentappid(PSWXEntApp pSWXEntApp){
        if(pSWXEntApp == null){
            this.setPSWXEntAppId(null);
            this.setPSWXEntAppName(null);
        }
        else{
            this.setPSWXEntAppId(pSWXEntApp.getPSWXEntAppId());
            this.setPSWXEntAppName(pSWXEntApp.getPSWXEntAppName());
        }
        return this;
    }

    /**
     * <B>PSWXENTAPPNAME</B>&nbsp;微信企业应用，指定微信菜单所属的微信应用
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWXENTAPPID}
     */
    public final static String FIELD_PSWXENTAPPNAME = "pswxentappname";

    /**
     * 设置 微信企业应用，详细说明：{@link #FIELD_PSWXENTAPPNAME}
     * 
     * @param pSWXEntAppName
     * 
     */
    @JsonProperty(FIELD_PSWXENTAPPNAME)
    public void setPSWXEntAppName(String pSWXEntAppName){
        this.set(FIELD_PSWXENTAPPNAME, pSWXEntAppName);
    }
    
    /**
     * 获取 微信企业应用  
     * @return
     */
    @JsonIgnore
    public String getPSWXEntAppName(){
        Object objValue = this.get(FIELD_PSWXENTAPPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 微信企业应用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWXEntAppNameDirty(){
        if(this.contains(FIELD_PSWXENTAPPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 微信企业应用
     */
    @JsonIgnore
    public void resetPSWXEntAppName(){
        this.reset(FIELD_PSWXENTAPPNAME);
    }

    /**
     * 设置 微信企业应用，详细说明：{@link #FIELD_PSWXENTAPPNAME}
     * <P>
     * 等同 {@link #setPSWXEntAppName}
     * @param pSWXEntAppName
     */
    @JsonIgnore
    public PSWXMenu pswxentappname(String pSWXEntAppName){
        this.setPSWXEntAppName(pSWXEntAppName);
        return this;
    }

    /**
     * <B>PSWXMENUID</B>&nbsp;微信菜单标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSWXMENUID = "pswxmenuid";

    /**
     * 设置 微信菜单标识
     * 
     * @param pSWXMenuId
     * 
     */
    @JsonProperty(FIELD_PSWXMENUID)
    public void setPSWXMenuId(String pSWXMenuId){
        this.set(FIELD_PSWXMENUID, pSWXMenuId);
    }
    
    /**
     * 获取 微信菜单标识  
     * @return
     */
    @JsonIgnore
    public String getPSWXMenuId(){
        Object objValue = this.get(FIELD_PSWXMENUID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 微信菜单标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWXMenuIdDirty(){
        if(this.contains(FIELD_PSWXMENUID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 微信菜单标识
     */
    @JsonIgnore
    public void resetPSWXMenuId(){
        this.reset(FIELD_PSWXMENUID);
    }

    /**
     * 设置 微信菜单标识
     * <P>
     * 等同 {@link #setPSWXMenuId}
     * @param pSWXMenuId
     */
    @JsonIgnore
    public PSWXMenu pswxmenuid(String pSWXMenuId){
        this.setPSWXMenuId(pSWXMenuId);
        return this;
    }

    /**
     * <B>PSWXMENUNAME</B>&nbsp;微信菜单名称，指定微信菜单的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSWXMENUNAME = "pswxmenuname";

    /**
     * 设置 微信菜单名称，详细说明：{@link #FIELD_PSWXMENUNAME}
     * 
     * @param pSWXMenuName
     * 
     */
    @JsonProperty(FIELD_PSWXMENUNAME)
    public void setPSWXMenuName(String pSWXMenuName){
        this.set(FIELD_PSWXMENUNAME, pSWXMenuName);
    }
    
    /**
     * 获取 微信菜单名称  
     * @return
     */
    @JsonIgnore
    public String getPSWXMenuName(){
        Object objValue = this.get(FIELD_PSWXMENUNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 微信菜单名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWXMenuNameDirty(){
        if(this.contains(FIELD_PSWXMENUNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 微信菜单名称
     */
    @JsonIgnore
    public void resetPSWXMenuName(){
        this.reset(FIELD_PSWXMENUNAME);
    }

    /**
     * 设置 微信菜单名称，详细说明：{@link #FIELD_PSWXMENUNAME}
     * <P>
     * 等同 {@link #setPSWXMenuName}
     * @param pSWXMenuName
     */
    @JsonIgnore
    public PSWXMenu pswxmenuname(String pSWXMenuName){
        this.setPSWXMenuName(pSWXMenuName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSWXMenuName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSWXMenuName(strName);
    }

    @JsonIgnore
    public PSWXMenu name(String strName){
        this.setPSWXMenuName(strName);
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
    public PSWXMenu updatedate(String updateDate){
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
    public PSWXMenu updateman(String updateMan){
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
    public PSWXMenu usercat(String userCat){
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
    public PSWXMenu usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSWXMenu usertag(String userTag){
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
    public PSWXMenu usertag2(String userTag2){
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
    public PSWXMenu usertag3(String userTag3){
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
    public PSWXMenu usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSWXMenuId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSWXMenuId(strValue);
    }

    @JsonIgnore
    public PSWXMenu id(String strValue){
        this.setPSWXMenuId(strValue);
        return this;
    }


    /**
     *  微信菜单项 成员集合
     */
    public final static String FIELD_PSWXMENUITEMS = "pswxmenuitems";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSWXMenuItem> pswxmenuitems;

    /**
     * 获取 微信菜单项 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSWXMENUITEMS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSWXMenuItem> getPSWXMenuItems(){
        return this.pswxmenuitems;
    }

    /**
     * 设置 微信菜单项 成员集合  
     * @param pswxmenuitems
     */
    @JsonProperty(FIELD_PSWXMENUITEMS)
    public void setPSWXMenuItems(java.util.List<net.ibizsys.psmodel.core.domain.PSWXMenuItem> pswxmenuitems){
        this.pswxmenuitems = pswxmenuitems;
    }

    /**
     * 获取 微信菜单项 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSWXMenuItem> getPSWXMenuItemsIf(){
        if(this.pswxmenuitems == null){
            this.pswxmenuitems = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSWXMenuItem>();          
        }
        return this.pswxmenuitems;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSWXMenu){
            PSWXMenu model = (PSWXMenu)iPSModel;
            model.setPSWXMenuItems(this.getPSWXMenuItems());
        }
        super.copyTo(iPSModel);
    }
}
