package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSWXMENUFUNC</B>微信菜单功能 模型传输对象
 * <P>
 * 微信菜单功能模型，定义微信公众号或微信应用的菜单功能，供微信菜单项调用
 */
public class PSWXMenuFunc extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSWXMenuFunc(){
    }      

    /**
     * <B>CLICKTAG</B>&nbsp;点击标识，指定微信菜单功能的点击标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CLICKTAG = "clicktag";

    /**
     * 设置 点击标识，详细说明：{@link #FIELD_CLICKTAG}
     * 
     * @param clickTag
     * 
     */
    @JsonProperty(FIELD_CLICKTAG)
    public void setClickTag(String clickTag){
        this.set(FIELD_CLICKTAG, clickTag);
    }
    
    /**
     * 获取 点击标识  
     * @return
     */
    @JsonIgnore
    public String getClickTag(){
        Object objValue = this.get(FIELD_CLICKTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 点击标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isClickTagDirty(){
        if(this.contains(FIELD_CLICKTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 点击标识
     */
    @JsonIgnore
    public void resetClickTag(){
        this.reset(FIELD_CLICKTAG);
    }

    /**
     * 设置 点击标识，详细说明：{@link #FIELD_CLICKTAG}
     * <P>
     * 等同 {@link #setClickTag}
     * @param clickTag
     */
    @JsonIgnore
    public PSWXMenuFunc clicktag(String clickTag){
        this.setClickTag(clickTag);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定微信菜单功能的代码标识，需在所属模型域（微信公众号或微信应用）中具备唯一性
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
    public PSWXMenuFunc codename(String codeName){
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
    public PSWXMenuFunc createdate(String createDate){
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
    public PSWXMenuFunc createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>FUNCTYPE</B>&nbsp;功能类型，指定微信菜单功能的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.WXMenuFuncType} 
     */
    public final static String FIELD_FUNCTYPE = "functype";

    /**
     * 设置 功能类型，详细说明：{@link #FIELD_FUNCTYPE}
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
     * 设置 功能类型，详细说明：{@link #FIELD_FUNCTYPE}
     * <P>
     * 等同 {@link #setFuncType}
     * @param funcType
     */
    @JsonIgnore
    public PSWXMenuFunc functype(String funcType){
        this.setFuncType(funcType);
        return this;
    }

     /**
     * 设置 功能类型，详细说明：{@link #FIELD_FUNCTYPE}
     * <P>
     * 等同 {@link #setFuncType}
     * @param funcType
     */
    @JsonIgnore
    public PSWXMenuFunc functype(net.ibizsys.psmodel.core.util.PSModelEnums.WXMenuFuncType funcType){
        if(funcType == null){
            this.setFuncType(null);
        }
        else{
            this.setFuncType(funcType.value);
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
    public PSWXMenuFunc memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSWXACCOUNTID</B>&nbsp;微信公众号，指定微信菜单功能所属的微信公众号
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
    public PSWXMenuFunc pswxaccountid(String pSWXAccountId){
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
    public PSWXMenuFunc pswxaccountid(PSWXAccount pSWXAccount){
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
     * <B>PSWXACCOUNTNAME</B>&nbsp;微信公众号，指定微信菜单功能所属的微信公众号
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
    public PSWXMenuFunc pswxaccountname(String pSWXAccountName){
        this.setPSWXAccountName(pSWXAccountName);
        return this;
    }

    /**
     * <B>PSWXENTAPPID</B>&nbsp;微信企业应用，指定微信菜单功能所属的微信应用
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
    public PSWXMenuFunc pswxentappid(String pSWXEntAppId){
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
    public PSWXMenuFunc pswxentappid(PSWXEntApp pSWXEntApp){
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
     * <B>PSWXENTAPPNAME</B>&nbsp;微信企业应用，指定微信菜单功能所属的微信应用
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
    public PSWXMenuFunc pswxentappname(String pSWXEntAppName){
        this.setPSWXEntAppName(pSWXEntAppName);
        return this;
    }

    /**
     * <B>PSWXMENUFUNCID</B>&nbsp;微信菜单功能标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSWXMENUFUNCID = "pswxmenufuncid";

    /**
     * 设置 微信菜单功能标识
     * 
     * @param pSWXMenuFuncId
     * 
     */
    @JsonProperty(FIELD_PSWXMENUFUNCID)
    public void setPSWXMenuFuncId(String pSWXMenuFuncId){
        this.set(FIELD_PSWXMENUFUNCID, pSWXMenuFuncId);
    }
    
    /**
     * 获取 微信菜单功能标识  
     * @return
     */
    @JsonIgnore
    public String getPSWXMenuFuncId(){
        Object objValue = this.get(FIELD_PSWXMENUFUNCID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 微信菜单功能标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWXMenuFuncIdDirty(){
        if(this.contains(FIELD_PSWXMENUFUNCID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 微信菜单功能标识
     */
    @JsonIgnore
    public void resetPSWXMenuFuncId(){
        this.reset(FIELD_PSWXMENUFUNCID);
    }

    /**
     * 设置 微信菜单功能标识
     * <P>
     * 等同 {@link #setPSWXMenuFuncId}
     * @param pSWXMenuFuncId
     */
    @JsonIgnore
    public PSWXMenuFunc pswxmenufuncid(String pSWXMenuFuncId){
        this.setPSWXMenuFuncId(pSWXMenuFuncId);
        return this;
    }

    /**
     * <B>PSWXMENUFUNCNAME</B>&nbsp;功能名称，指定微信菜单功能的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSWXMENUFUNCNAME = "pswxmenufuncname";

    /**
     * 设置 功能名称，详细说明：{@link #FIELD_PSWXMENUFUNCNAME}
     * 
     * @param pSWXMenuFuncName
     * 
     */
    @JsonProperty(FIELD_PSWXMENUFUNCNAME)
    public void setPSWXMenuFuncName(String pSWXMenuFuncName){
        this.set(FIELD_PSWXMENUFUNCNAME, pSWXMenuFuncName);
    }
    
    /**
     * 获取 功能名称  
     * @return
     */
    @JsonIgnore
    public String getPSWXMenuFuncName(){
        Object objValue = this.get(FIELD_PSWXMENUFUNCNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWXMenuFuncNameDirty(){
        if(this.contains(FIELD_PSWXMENUFUNCNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能名称
     */
    @JsonIgnore
    public void resetPSWXMenuFuncName(){
        this.reset(FIELD_PSWXMENUFUNCNAME);
    }

    /**
     * 设置 功能名称，详细说明：{@link #FIELD_PSWXMENUFUNCNAME}
     * <P>
     * 等同 {@link #setPSWXMenuFuncName}
     * @param pSWXMenuFuncName
     */
    @JsonIgnore
    public PSWXMenuFunc pswxmenufuncname(String pSWXMenuFuncName){
        this.setPSWXMenuFuncName(pSWXMenuFuncName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSWXMenuFuncName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSWXMenuFuncName(strName);
    }

    @JsonIgnore
    public PSWXMenuFunc name(String strName){
        this.setPSWXMenuFuncName(strName);
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
    public PSWXMenuFunc updatedate(String updateDate){
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
    public PSWXMenuFunc updateman(String updateMan){
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
    public PSWXMenuFunc usercat(String userCat){
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
    public PSWXMenuFunc usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSWXMenuFunc usertag(String userTag){
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
    public PSWXMenuFunc usertag2(String userTag2){
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
    public PSWXMenuFunc usertag3(String userTag3){
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
    public PSWXMenuFunc usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>VIEWURL</B>&nbsp;打开视图地址，微信菜单功能类型为【跳转URL】时指定打开视图地址
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_VIEWURL = "viewurl";

    /**
     * 设置 打开视图地址，详细说明：{@link #FIELD_VIEWURL}
     * 
     * @param viewURL
     * 
     */
    @JsonProperty(FIELD_VIEWURL)
    public void setViewURL(String viewURL){
        this.set(FIELD_VIEWURL, viewURL);
    }
    
    /**
     * 获取 打开视图地址  
     * @return
     */
    @JsonIgnore
    public String getViewURL(){
        Object objValue = this.get(FIELD_VIEWURL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 打开视图地址 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewURLDirty(){
        if(this.contains(FIELD_VIEWURL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 打开视图地址
     */
    @JsonIgnore
    public void resetViewURL(){
        this.reset(FIELD_VIEWURL);
    }

    /**
     * 设置 打开视图地址，详细说明：{@link #FIELD_VIEWURL}
     * <P>
     * 等同 {@link #setViewURL}
     * @param viewURL
     */
    @JsonIgnore
    public PSWXMenuFunc viewurl(String viewURL){
        this.setViewURL(viewURL);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSWXMenuFuncId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSWXMenuFuncId(strValue);
    }

    @JsonIgnore
    public PSWXMenuFunc id(String strValue){
        this.setPSWXMenuFuncId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSWXMenuFunc){
            PSWXMenuFunc model = (PSWXMenuFunc)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
