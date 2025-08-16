package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSAPPRESOURCE</B>应用资源 模型传输对象
 * <P>
 * 前端应用资源模型，定义应用预置的资源内容。应用资源属于前端应用的通用内容定义模型，一般在模板中通过资源标记获取使用
 */
public class PSAppResource extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSAppResource(){
        this.setValidFlag(1);
    }      

    /**
     * <B>CONTENT</B>&nbsp;资源内容，指定应用资源的内容
     */
    public final static String FIELD_CONTENT = "content";

    /**
     * 设置 资源内容，详细说明：{@link #FIELD_CONTENT}
     * 
     * @param content
     * 
     */
    @JsonProperty(FIELD_CONTENT)
    public void setContent(String content){
        this.set(FIELD_CONTENT, content);
    }
    
    /**
     * 获取 资源内容  
     * @return
     */
    @JsonIgnore
    public String getContent(){
        Object objValue = this.get(FIELD_CONTENT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 资源内容 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isContentDirty(){
        if(this.contains(FIELD_CONTENT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 资源内容
     */
    @JsonIgnore
    public void resetContent(){
        this.reset(FIELD_CONTENT);
    }

    /**
     * 设置 资源内容，详细说明：{@link #FIELD_CONTENT}
     * <P>
     * 等同 {@link #setContent}
     * @param content
     */
    @JsonIgnore
    public PSAppResource content(String content){
        this.setContent(content);
        return this;
    }

    /**
     * <B>CONTENTPSLANRESID</B>&nbsp;内容语言资源，指定应用资源的内容的多语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_CONTENTPSLANRESID = "contentpslanresid";

    /**
     * 设置 内容语言资源，详细说明：{@link #FIELD_CONTENTPSLANRESID}
     * 
     * @param contentPSLanResId
     * 
     */
    @JsonProperty(FIELD_CONTENTPSLANRESID)
    public void setContentPSLanResId(String contentPSLanResId){
        this.set(FIELD_CONTENTPSLANRESID, contentPSLanResId);
    }
    
    /**
     * 获取 内容语言资源  
     * @return
     */
    @JsonIgnore
    public String getContentPSLanResId(){
        Object objValue = this.get(FIELD_CONTENTPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 内容语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isContentPSLanResIdDirty(){
        if(this.contains(FIELD_CONTENTPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内容语言资源
     */
    @JsonIgnore
    public void resetContentPSLanResId(){
        this.reset(FIELD_CONTENTPSLANRESID);
    }

    /**
     * 设置 内容语言资源，详细说明：{@link #FIELD_CONTENTPSLANRESID}
     * <P>
     * 等同 {@link #setContentPSLanResId}
     * @param contentPSLanResId
     */
    @JsonIgnore
    public PSAppResource contentpslanresid(String contentPSLanResId){
        this.setContentPSLanResId(contentPSLanResId);
        return this;
    }

    /**
     * 设置 内容语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setContentPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSAppResource contentpslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setContentPSLanResId(null);
            this.setContentPSLanResName(null);
        }
        else{
            this.setContentPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setContentPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>CONTENTPSLANRESNAME</B>&nbsp;内容语言资源，指定应用资源的内容的多语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CONTENTPSLANRESID}
     */
    public final static String FIELD_CONTENTPSLANRESNAME = "contentpslanresname";

    /**
     * 设置 内容语言资源，详细说明：{@link #FIELD_CONTENTPSLANRESNAME}
     * 
     * @param contentPSLanResName
     * 
     */
    @JsonProperty(FIELD_CONTENTPSLANRESNAME)
    public void setContentPSLanResName(String contentPSLanResName){
        this.set(FIELD_CONTENTPSLANRESNAME, contentPSLanResName);
    }
    
    /**
     * 获取 内容语言资源  
     * @return
     */
    @JsonIgnore
    public String getContentPSLanResName(){
        Object objValue = this.get(FIELD_CONTENTPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 内容语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isContentPSLanResNameDirty(){
        if(this.contains(FIELD_CONTENTPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内容语言资源
     */
    @JsonIgnore
    public void resetContentPSLanResName(){
        this.reset(FIELD_CONTENTPSLANRESNAME);
    }

    /**
     * 设置 内容语言资源，详细说明：{@link #FIELD_CONTENTPSLANRESNAME}
     * <P>
     * 等同 {@link #setContentPSLanResName}
     * @param contentPSLanResName
     */
    @JsonIgnore
    public PSAppResource contentpslanresname(String contentPSLanResName){
        this.setContentPSLanResName(contentPSLanResName);
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
    public PSAppResource createdate(String createDate){
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
    public PSAppResource createman(String createMan){
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
    public PSAppResource memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSAPPRESOURCEID</B>&nbsp;应用资源标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSAPPRESOURCEID = "psappresourceid";

    /**
     * 设置 应用资源标识
     * 
     * @param pSAppResourceId
     * 
     */
    @JsonProperty(FIELD_PSAPPRESOURCEID)
    public void setPSAppResourceId(String pSAppResourceId){
        this.set(FIELD_PSAPPRESOURCEID, pSAppResourceId);
    }
    
    /**
     * 获取 应用资源标识  
     * @return
     */
    @JsonIgnore
    public String getPSAppResourceId(){
        Object objValue = this.get(FIELD_PSAPPRESOURCEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用资源标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppResourceIdDirty(){
        if(this.contains(FIELD_PSAPPRESOURCEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用资源标识
     */
    @JsonIgnore
    public void resetPSAppResourceId(){
        this.reset(FIELD_PSAPPRESOURCEID);
    }

    /**
     * 设置 应用资源标识
     * <P>
     * 等同 {@link #setPSAppResourceId}
     * @param pSAppResourceId
     */
    @JsonIgnore
    public PSAppResource psappresourceid(String pSAppResourceId){
        this.setPSAppResourceId(pSAppResourceId);
        return this;
    }

    /**
     * <B>PSAPPRESOURCENAME</B>&nbsp;应用资源名称，指定应用资源的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSAPPRESOURCENAME = "psappresourcename";

    /**
     * 设置 应用资源名称，详细说明：{@link #FIELD_PSAPPRESOURCENAME}
     * 
     * @param pSAppResourceName
     * 
     */
    @JsonProperty(FIELD_PSAPPRESOURCENAME)
    public void setPSAppResourceName(String pSAppResourceName){
        this.set(FIELD_PSAPPRESOURCENAME, pSAppResourceName);
    }
    
    /**
     * 获取 应用资源名称  
     * @return
     */
    @JsonIgnore
    public String getPSAppResourceName(){
        Object objValue = this.get(FIELD_PSAPPRESOURCENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用资源名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppResourceNameDirty(){
        if(this.contains(FIELD_PSAPPRESOURCENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用资源名称
     */
    @JsonIgnore
    public void resetPSAppResourceName(){
        this.reset(FIELD_PSAPPRESOURCENAME);
    }

    /**
     * 设置 应用资源名称，详细说明：{@link #FIELD_PSAPPRESOURCENAME}
     * <P>
     * 等同 {@link #setPSAppResourceName}
     * @param pSAppResourceName
     */
    @JsonIgnore
    public PSAppResource psappresourcename(String pSAppResourceName){
        this.setPSAppResourceName(pSAppResourceName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSAppResourceName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSAppResourceName(strName);
    }

    @JsonIgnore
    public PSAppResource name(String strName){
        this.setPSAppResourceName(strName);
        return this;
    }

    /**
     * <B>PSSYSAPPID</B>&nbsp;系统应用，指定应用资源的所属的前端应用
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
    public PSAppResource pssysappid(String pSSysAppId){
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
    public PSAppResource pssysappid(PSSysApp pSSysApp){
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
     * <B>PSSYSAPPNAME</B>&nbsp;前端应用，指定应用资源的所属的前端应用
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
    public PSAppResource pssysappname(String pSSysAppName){
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    /**
     * <B>RESOURCETYPE</B>&nbsp;资源类型，指定应用资源的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.AppResourceType} 
     */
    public final static String FIELD_RESOURCETYPE = "resourcetype";

    /**
     * 设置 资源类型，详细说明：{@link #FIELD_RESOURCETYPE}
     * 
     * @param resourceType
     * 
     */
    @JsonProperty(FIELD_RESOURCETYPE)
    public void setResourceType(String resourceType){
        this.set(FIELD_RESOURCETYPE, resourceType);
    }
    
    /**
     * 获取 资源类型  
     * @return
     */
    @JsonIgnore
    public String getResourceType(){
        Object objValue = this.get(FIELD_RESOURCETYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 资源类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isResourceTypeDirty(){
        if(this.contains(FIELD_RESOURCETYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 资源类型
     */
    @JsonIgnore
    public void resetResourceType(){
        this.reset(FIELD_RESOURCETYPE);
    }

    /**
     * 设置 资源类型，详细说明：{@link #FIELD_RESOURCETYPE}
     * <P>
     * 等同 {@link #setResourceType}
     * @param resourceType
     */
    @JsonIgnore
    public PSAppResource resourcetype(String resourceType){
        this.setResourceType(resourceType);
        return this;
    }

     /**
     * 设置 资源类型，详细说明：{@link #FIELD_RESOURCETYPE}
     * <P>
     * 等同 {@link #setResourceType}
     * @param resourceType
     */
    @JsonIgnore
    public PSAppResource resourcetype(net.ibizsys.psmodel.core.util.PSModelEnums.AppResourceType resourceType){
        if(resourceType == null){
            this.setResourceType(null);
        }
        else{
            this.setResourceType(resourceType.value);
        }
        return this;
    }

    /**
     * <B>RESTAG</B>&nbsp;资源标记，指定应用资源的标记，需在所在的前端应用中具备唯一性
     * <P>
     * 字符串：最大长度 50，由字母、数字、下划线及点号组成，且开始必须字母
     */
    public final static String FIELD_RESTAG = "restag";

    /**
     * 设置 资源标记，详细说明：{@link #FIELD_RESTAG}
     * 
     * @param resTag
     * 
     */
    @JsonProperty(FIELD_RESTAG)
    public void setResTag(String resTag){
        this.set(FIELD_RESTAG, resTag);
    }
    
    /**
     * 获取 资源标记  
     * @return
     */
    @JsonIgnore
    public String getResTag(){
        Object objValue = this.get(FIELD_RESTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 资源标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isResTagDirty(){
        if(this.contains(FIELD_RESTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 资源标记
     */
    @JsonIgnore
    public void resetResTag(){
        this.reset(FIELD_RESTAG);
    }

    /**
     * 设置 资源标记，详细说明：{@link #FIELD_RESTAG}
     * <P>
     * 等同 {@link #setResTag}
     * @param resTag
     */
    @JsonIgnore
    public PSAppResource restag(String resTag){
        this.setResTag(resTag);
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
    public PSAppResource updatedate(String updateDate){
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
    public PSAppResource updateman(String updateMan){
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
    public PSAppResource usercat(String userCat){
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
    public PSAppResource usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSAppResource usertag(String userTag){
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
    public PSAppResource usertag2(String userTag2){
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
    public PSAppResource usertag3(String userTag3){
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
    public PSAppResource usertag4(String userTag4){
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
    public PSAppResource validflag(Integer validFlag){
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
    public PSAppResource validflag(Boolean validFlag){
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
        return this.getPSAppResourceId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSAppResourceId(strValue);
    }

    @JsonIgnore
    public PSAppResource id(String strValue){
        this.setPSAppResourceId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSAppResource){
            PSAppResource model = (PSAppResource)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
