package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSLANGUAGEITEM</B>语言定义项 模型传输对象
 * <P>
 * 系统语言资源项模型，定义语言资源在不同语言下的内容
 */
public class PSLanguageItem extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSLanguageItem(){
    }      

    /**
     * <B>CONTENT</B>&nbsp;内容，指定语言资源项的内容
     * <P>
     * 字符串：最大长度 1048576
     */
    public final static String FIELD_CONTENT = "content";

    /**
     * 设置 内容，详细说明：{@link #FIELD_CONTENT}
     * 
     * @param content
     * 
     */
    @JsonProperty(FIELD_CONTENT)
    public void setContent(String content){
        this.set(FIELD_CONTENT, content);
    }
    
    /**
     * 获取 内容  
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
     * 判断 内容 是否指定值，包括空值
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
     * 重置 内容
     */
    @JsonIgnore
    public void resetContent(){
        this.reset(FIELD_CONTENT);
    }

    /**
     * 设置 内容，详细说明：{@link #FIELD_CONTENT}
     * <P>
     * 等同 {@link #setContent}
     * @param content
     */
    @JsonIgnore
    public PSLanguageItem content(String content){
        this.setContent(content);
        return this;
    }

    /**
     * <B>CONTENT2</B>&nbsp;长内容
     */
    public final static String FIELD_CONTENT2 = "content2";

    /**
     * 设置 长内容
     * 
     * @param content2
     * 
     */
    @JsonProperty(FIELD_CONTENT2)
    public void setContent2(String content2){
        this.set(FIELD_CONTENT2, content2);
    }
    
    /**
     * 获取 长内容  
     * @return
     */
    @JsonIgnore
    public String getContent2(){
        Object objValue = this.get(FIELD_CONTENT2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 长内容 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isContent2Dirty(){
        if(this.contains(FIELD_CONTENT2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 长内容
     */
    @JsonIgnore
    public void resetContent2(){
        this.reset(FIELD_CONTENT2);
    }

    /**
     * 设置 长内容
     * <P>
     * 等同 {@link #setContent2}
     * @param content2
     */
    @JsonIgnore
    public PSLanguageItem content2(String content2){
        this.setContent2(content2);
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
    public PSLanguageItem createdate(String createDate){
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
    public PSLanguageItem createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DEFCONTENT</B>&nbsp;默认内容
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSLANGUAGERESID}
     */
    public final static String FIELD_DEFCONTENT = "defcontent";

    /**
     * 设置 默认内容
     * 
     * @param defContent
     * 
     */
    @JsonProperty(FIELD_DEFCONTENT)
    public void setDefContent(String defContent){
        this.set(FIELD_DEFCONTENT, defContent);
    }
    
    /**
     * 获取 默认内容  
     * @return
     */
    @JsonIgnore
    public String getDefContent(){
        Object objValue = this.get(FIELD_DEFCONTENT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认内容 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefContentDirty(){
        if(this.contains(FIELD_DEFCONTENT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认内容
     */
    @JsonIgnore
    public void resetDefContent(){
        this.reset(FIELD_DEFCONTENT);
    }

    /**
     * 设置 默认内容
     * <P>
     * 等同 {@link #setDefContent}
     * @param defContent
     */
    @JsonIgnore
    public PSLanguageItem defcontent(String defContent){
        this.setDefContent(defContent);
        return this;
    }

    /**
     * <B>LANRESTAG</B>&nbsp;语言资源标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSLANGUAGERESID}
     */
    public final static String FIELD_LANRESTAG = "lanrestag";

    /**
     * 设置 语言资源标识
     * 
     * @param lanResTag
     * 
     */
    @JsonProperty(FIELD_LANRESTAG)
    public void setLanResTag(String lanResTag){
        this.set(FIELD_LANRESTAG, lanResTag);
    }
    
    /**
     * 获取 语言资源标识  
     * @return
     */
    @JsonIgnore
    public String getLanResTag(){
        Object objValue = this.get(FIELD_LANRESTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 语言资源标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLanResTagDirty(){
        if(this.contains(FIELD_LANRESTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 语言资源标识
     */
    @JsonIgnore
    public void resetLanResTag(){
        this.reset(FIELD_LANRESTAG);
    }

    /**
     * 设置 语言资源标识
     * <P>
     * 等同 {@link #setLanResTag}
     * @param lanResTag
     */
    @JsonIgnore
    public PSLanguageItem lanrestag(String lanResTag){
        this.setLanResTag(lanResTag);
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
    public PSLanguageItem memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSLANGUAGEID</B>&nbsp;语言，指定语言资源项相关的语言
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguage} 
     */
    public final static String FIELD_PSLANGUAGEID = "pslanguageid";

    /**
     * 设置 语言，详细说明：{@link #FIELD_PSLANGUAGEID}
     * 
     * @param pSLanguageId
     * 
     */
    @JsonProperty(FIELD_PSLANGUAGEID)
    public void setPSLanguageId(String pSLanguageId){
        this.set(FIELD_PSLANGUAGEID, pSLanguageId);
    }
    
    /**
     * 获取 语言  
     * @return
     */
    @JsonIgnore
    public String getPSLanguageId(){
        Object objValue = this.get(FIELD_PSLANGUAGEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 语言 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSLanguageIdDirty(){
        if(this.contains(FIELD_PSLANGUAGEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 语言
     */
    @JsonIgnore
    public void resetPSLanguageId(){
        this.reset(FIELD_PSLANGUAGEID);
    }

    /**
     * 设置 语言，详细说明：{@link #FIELD_PSLANGUAGEID}
     * <P>
     * 等同 {@link #setPSLanguageId}
     * @param pSLanguageId
     */
    @JsonIgnore
    public PSLanguageItem pslanguageid(String pSLanguageId){
        this.setPSLanguageId(pSLanguageId);
        return this;
    }

    /**
     * 设置 语言，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSLanguageId}
     * @param pSLanguage 引用对象
     */
    @JsonIgnore
    public PSLanguageItem pslanguageid(PSLanguage pSLanguage){
        if(pSLanguage == null){
            this.setPSLanguageId(null);
            this.setPSLanguageName(null);
        }
        else{
            this.setPSLanguageId(pSLanguage.getPSLanguageId());
            this.setPSLanguageName(pSLanguage.getPSLanguageName());
        }
        return this;
    }

    /**
     * <B>PSLANGUAGEITEMID</B>&nbsp;语言定义项标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSLANGUAGEITEMID = "pslanguageitemid";

    /**
     * 设置 语言定义项标识
     * 
     * @param pSLanguageItemId
     * 
     */
    @JsonProperty(FIELD_PSLANGUAGEITEMID)
    public void setPSLanguageItemId(String pSLanguageItemId){
        this.set(FIELD_PSLANGUAGEITEMID, pSLanguageItemId);
    }
    
    /**
     * 获取 语言定义项标识  
     * @return
     */
    @JsonIgnore
    public String getPSLanguageItemId(){
        Object objValue = this.get(FIELD_PSLANGUAGEITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 语言定义项标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSLanguageItemIdDirty(){
        if(this.contains(FIELD_PSLANGUAGEITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 语言定义项标识
     */
    @JsonIgnore
    public void resetPSLanguageItemId(){
        this.reset(FIELD_PSLANGUAGEITEMID);
    }

    /**
     * 设置 语言定义项标识
     * <P>
     * 等同 {@link #setPSLanguageItemId}
     * @param pSLanguageItemId
     */
    @JsonIgnore
    public PSLanguageItem pslanguageitemid(String pSLanguageItemId){
        this.setPSLanguageItemId(pSLanguageItemId);
        return this;
    }

    /**
     * <B>PSLANGUAGEITEMNAME</B>&nbsp;语言定义项标识，指定语言资源项的标识，需在系统中具备唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSLANGUAGEITEMNAME = "pslanguageitemname";

    /**
     * 设置 语言定义项标识，详细说明：{@link #FIELD_PSLANGUAGEITEMNAME}
     * 
     * @param pSLanguageItemName
     * 
     */
    @JsonProperty(FIELD_PSLANGUAGEITEMNAME)
    public void setPSLanguageItemName(String pSLanguageItemName){
        this.set(FIELD_PSLANGUAGEITEMNAME, pSLanguageItemName);
    }
    
    /**
     * 获取 语言定义项标识  
     * @return
     */
    @JsonIgnore
    public String getPSLanguageItemName(){
        Object objValue = this.get(FIELD_PSLANGUAGEITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 语言定义项标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSLanguageItemNameDirty(){
        if(this.contains(FIELD_PSLANGUAGEITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 语言定义项标识
     */
    @JsonIgnore
    public void resetPSLanguageItemName(){
        this.reset(FIELD_PSLANGUAGEITEMNAME);
    }

    /**
     * 设置 语言定义项标识，详细说明：{@link #FIELD_PSLANGUAGEITEMNAME}
     * <P>
     * 等同 {@link #setPSLanguageItemName}
     * @param pSLanguageItemName
     */
    @JsonIgnore
    public PSLanguageItem pslanguageitemname(String pSLanguageItemName){
        this.setPSLanguageItemName(pSLanguageItemName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSLanguageItemName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSLanguageItemName(strName);
    }

    @JsonIgnore
    public PSLanguageItem name(String strName){
        this.setPSLanguageItemName(strName);
        return this;
    }

    /**
     * <B>PSLANGUAGENAME</B>&nbsp;语言，指定语言资源项相关的语言
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSLANGUAGEID}
     */
    public final static String FIELD_PSLANGUAGENAME = "pslanguagename";

    /**
     * 设置 语言，详细说明：{@link #FIELD_PSLANGUAGENAME}
     * 
     * @param pSLanguageName
     * 
     */
    @JsonProperty(FIELD_PSLANGUAGENAME)
    public void setPSLanguageName(String pSLanguageName){
        this.set(FIELD_PSLANGUAGENAME, pSLanguageName);
    }
    
    /**
     * 获取 语言  
     * @return
     */
    @JsonIgnore
    public String getPSLanguageName(){
        Object objValue = this.get(FIELD_PSLANGUAGENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 语言 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSLanguageNameDirty(){
        if(this.contains(FIELD_PSLANGUAGENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 语言
     */
    @JsonIgnore
    public void resetPSLanguageName(){
        this.reset(FIELD_PSLANGUAGENAME);
    }

    /**
     * 设置 语言，详细说明：{@link #FIELD_PSLANGUAGENAME}
     * <P>
     * 等同 {@link #setPSLanguageName}
     * @param pSLanguageName
     */
    @JsonIgnore
    public PSLanguageItem pslanguagename(String pSLanguageName){
        this.setPSLanguageName(pSLanguageName);
        return this;
    }

    /**
     * <B>PSLANGUAGERESID</B>&nbsp;语言资源，指定语言资源项相关的语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_PSLANGUAGERESID = "pslanguageresid";

    /**
     * 设置 语言资源，详细说明：{@link #FIELD_PSLANGUAGERESID}
     * 
     * @param pSLanguageResId
     * 
     */
    @JsonProperty(FIELD_PSLANGUAGERESID)
    public void setPSLanguageResId(String pSLanguageResId){
        this.set(FIELD_PSLANGUAGERESID, pSLanguageResId);
    }
    
    /**
     * 获取 语言资源  
     * @return
     */
    @JsonIgnore
    public String getPSLanguageResId(){
        Object objValue = this.get(FIELD_PSLANGUAGERESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSLanguageResIdDirty(){
        if(this.contains(FIELD_PSLANGUAGERESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 语言资源
     */
    @JsonIgnore
    public void resetPSLanguageResId(){
        this.reset(FIELD_PSLANGUAGERESID);
    }

    /**
     * 设置 语言资源，详细说明：{@link #FIELD_PSLANGUAGERESID}
     * <P>
     * 等同 {@link #setPSLanguageResId}
     * @param pSLanguageResId
     */
    @JsonIgnore
    public PSLanguageItem pslanguageresid(String pSLanguageResId){
        this.setPSLanguageResId(pSLanguageResId);
        return this;
    }

    /**
     * 设置 语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSLanguageResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSLanguageItem pslanguageresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setDefContent(null);
            this.setLanResTag(null);
            this.setPSLanguageResId(null);
            this.setPSLanguageResName(null);
        }
        else{
            this.setDefContent(pSLanguageRes.getContent());
            this.setLanResTag(pSLanguageRes.getLanResTag());
            this.setPSLanguageResId(pSLanguageRes.getPSLanguageResId());
            this.setPSLanguageResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>PSLANGUAGERESNAME</B>&nbsp;语言资源，指定语言资源项相关的语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSLANGUAGERESID}
     */
    public final static String FIELD_PSLANGUAGERESNAME = "pslanguageresname";

    /**
     * 设置 语言资源，详细说明：{@link #FIELD_PSLANGUAGERESNAME}
     * 
     * @param pSLanguageResName
     * 
     */
    @JsonProperty(FIELD_PSLANGUAGERESNAME)
    public void setPSLanguageResName(String pSLanguageResName){
        this.set(FIELD_PSLANGUAGERESNAME, pSLanguageResName);
    }
    
    /**
     * 获取 语言资源  
     * @return
     */
    @JsonIgnore
    public String getPSLanguageResName(){
        Object objValue = this.get(FIELD_PSLANGUAGERESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSLanguageResNameDirty(){
        if(this.contains(FIELD_PSLANGUAGERESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 语言资源
     */
    @JsonIgnore
    public void resetPSLanguageResName(){
        this.reset(FIELD_PSLANGUAGERESNAME);
    }

    /**
     * 设置 语言资源，详细说明：{@link #FIELD_PSLANGUAGERESNAME}
     * <P>
     * 等同 {@link #setPSLanguageResName}
     * @param pSLanguageResName
     */
    @JsonIgnore
    public PSLanguageItem pslanguageresname(String pSLanguageResName){
        this.setPSLanguageResName(pSLanguageResName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSModule} 
     */
    public final static String FIELD_PSMODULEID = "psmoduleid";

    /**
     * 设置 系统模块
     * 
     * @param pSModuleId
     * 
     */
    @JsonProperty(FIELD_PSMODULEID)
    public void setPSModuleId(String pSModuleId){
        this.set(FIELD_PSMODULEID, pSModuleId);
    }
    
    /**
     * 获取 系统模块  
     * @return
     */
    @JsonIgnore
    public String getPSModuleId(){
        Object objValue = this.get(FIELD_PSMODULEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统模块 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSModuleIdDirty(){
        if(this.contains(FIELD_PSMODULEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统模块
     */
    @JsonIgnore
    public void resetPSModuleId(){
        this.reset(FIELD_PSMODULEID);
    }

    /**
     * 设置 系统模块
     * <P>
     * 等同 {@link #setPSModuleId}
     * @param pSModuleId
     */
    @JsonIgnore
    public PSLanguageItem psmoduleid(String pSModuleId){
        this.setPSModuleId(pSModuleId);
        return this;
    }

    /**
     * 设置 系统模块，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSModuleId}
     * @param pSModule 引用对象
     */
    @JsonIgnore
    public PSLanguageItem psmoduleid(PSModule pSModule){
        if(pSModule == null){
            this.setPSModuleId(null);
            this.setPSModuleName(null);
        }
        else{
            this.setPSModuleId(pSModule.getPSModuleId());
            this.setPSModuleName(pSModule.getPSModuleName());
        }
        return this;
    }

    /**
     * <B>PSMODULENAME</B>&nbsp;系统模块
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSMODULEID}
     */
    public final static String FIELD_PSMODULENAME = "psmodulename";

    /**
     * 设置 系统模块
     * 
     * @param pSModuleName
     * 
     */
    @JsonProperty(FIELD_PSMODULENAME)
    public void setPSModuleName(String pSModuleName){
        this.set(FIELD_PSMODULENAME, pSModuleName);
    }
    
    /**
     * 获取 系统模块  
     * @return
     */
    @JsonIgnore
    public String getPSModuleName(){
        Object objValue = this.get(FIELD_PSMODULENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统模块 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSModuleNameDirty(){
        if(this.contains(FIELD_PSMODULENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统模块
     */
    @JsonIgnore
    public void resetPSModuleName(){
        this.reset(FIELD_PSMODULENAME);
    }

    /**
     * 设置 系统模块
     * <P>
     * 等同 {@link #setPSModuleName}
     * @param pSModuleName
     */
    @JsonIgnore
    public PSLanguageItem psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
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
    public PSLanguageItem updatedate(String updateDate){
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
    public PSLanguageItem updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSLanguageItemId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSLanguageItemId(strValue);
    }

    @JsonIgnore
    public PSLanguageItem id(String strValue){
        this.setPSLanguageItemId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSLanguageItem){
            PSLanguageItem model = (PSLanguageItem)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
