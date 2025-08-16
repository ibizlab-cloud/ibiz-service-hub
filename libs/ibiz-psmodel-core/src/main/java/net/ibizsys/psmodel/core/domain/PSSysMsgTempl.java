package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSMSGTEMPL</B>系统消息模板 模型传输对象
 * <P>
 * 系统消息模板模型，定义系统对外发送消息的内容模板，支持为不同的接收目标定义不同的内容
 */
public class PSSysMsgTempl extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysMsgTempl(){
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定消息模板的代码标识，需要在所在的模型域（系统模块或系统）中具有唯一性
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
    public PSSysMsgTempl codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>CONTENT</B>&nbsp;内容，指定消息模板的内容
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
    public PSSysMsgTempl content(String content){
        this.setContent(content);
        return this;
    }

    /**
     * <B>CONTENTPSDEFID</B>&nbsp;内容属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_CONTENTPSDEFID = "contentpsdefid";

    /**
     * 设置 内容属性
     * 
     * @param contentPSDEFId
     * 
     */
    @JsonProperty(FIELD_CONTENTPSDEFID)
    public void setContentPSDEFId(String contentPSDEFId){
        this.set(FIELD_CONTENTPSDEFID, contentPSDEFId);
    }
    
    /**
     * 获取 内容属性  
     * @return
     */
    @JsonIgnore
    public String getContentPSDEFId(){
        Object objValue = this.get(FIELD_CONTENTPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 内容属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isContentPSDEFIdDirty(){
        if(this.contains(FIELD_CONTENTPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内容属性
     */
    @JsonIgnore
    public void resetContentPSDEFId(){
        this.reset(FIELD_CONTENTPSDEFID);
    }

    /**
     * 设置 内容属性
     * <P>
     * 等同 {@link #setContentPSDEFId}
     * @param contentPSDEFId
     */
    @JsonIgnore
    public PSSysMsgTempl contentpsdefid(String contentPSDEFId){
        this.setContentPSDEFId(contentPSDEFId);
        return this;
    }

    /**
     * 设置 内容属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setContentPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMsgTempl contentpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setContentPSDEFId(null);
            this.setContentPSDEFName(null);
        }
        else{
            this.setContentPSDEFId(pSDEField.getPSDEFieldId());
            this.setContentPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>CONTENTPSDEFNAME</B>&nbsp;内容属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CONTENTPSDEFID}
     */
    public final static String FIELD_CONTENTPSDEFNAME = "contentpsdefname";

    /**
     * 设置 内容属性
     * 
     * @param contentPSDEFName
     * 
     */
    @JsonProperty(FIELD_CONTENTPSDEFNAME)
    public void setContentPSDEFName(String contentPSDEFName){
        this.set(FIELD_CONTENTPSDEFNAME, contentPSDEFName);
    }
    
    /**
     * 获取 内容属性  
     * @return
     */
    @JsonIgnore
    public String getContentPSDEFName(){
        Object objValue = this.get(FIELD_CONTENTPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 内容属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isContentPSDEFNameDirty(){
        if(this.contains(FIELD_CONTENTPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内容属性
     */
    @JsonIgnore
    public void resetContentPSDEFName(){
        this.reset(FIELD_CONTENTPSDEFNAME);
    }

    /**
     * 设置 内容属性
     * <P>
     * 等同 {@link #setContentPSDEFName}
     * @param contentPSDEFName
     */
    @JsonIgnore
    public PSSysMsgTempl contentpsdefname(String contentPSDEFName){
        this.setContentPSDEFName(contentPSDEFName);
        return this;
    }

    /**
     * <B>CONTENTPSLANRESID</B>&nbsp;内容语言资源，指定消息模板的内容的多语言资源对象
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
    public PSSysMsgTempl contentpslanresid(String contentPSLanResId){
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
    public PSSysMsgTempl contentpslanresid(PSLanguageRes pSLanguageRes){
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
     * <B>CONTENTPSLANRESNAME</B>&nbsp;内容语言资源，指定消息模板的内容的多语言资源对象
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
    public PSSysMsgTempl contentpslanresname(String contentPSLanResName){
        this.setContentPSLanResName(contentPSLanResName);
        return this;
    }

    /**
     * <B>CONTENTTYPE</B>&nbsp;内容类型，指定消息模板的内容类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.MsgContentType} 
     */
    public final static String FIELD_CONTENTTYPE = "contenttype";

    /**
     * 设置 内容类型，详细说明：{@link #FIELD_CONTENTTYPE}
     * 
     * @param contentType
     * 
     */
    @JsonProperty(FIELD_CONTENTTYPE)
    public void setContentType(String contentType){
        this.set(FIELD_CONTENTTYPE, contentType);
    }
    
    /**
     * 获取 内容类型  
     * @return
     */
    @JsonIgnore
    public String getContentType(){
        Object objValue = this.get(FIELD_CONTENTTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 内容类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isContentTypeDirty(){
        if(this.contains(FIELD_CONTENTTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内容类型
     */
    @JsonIgnore
    public void resetContentType(){
        this.reset(FIELD_CONTENTTYPE);
    }

    /**
     * 设置 内容类型，详细说明：{@link #FIELD_CONTENTTYPE}
     * <P>
     * 等同 {@link #setContentType}
     * @param contentType
     */
    @JsonIgnore
    public PSSysMsgTempl contenttype(String contentType){
        this.setContentType(contentType);
        return this;
    }

     /**
     * 设置 内容类型，详细说明：{@link #FIELD_CONTENTTYPE}
     * <P>
     * 等同 {@link #setContentType}
     * @param contentType
     */
    @JsonIgnore
    public PSSysMsgTempl contenttype(net.ibizsys.psmodel.core.util.PSModelEnums.MsgContentType contentType){
        if(contentType == null){
            this.setContentType(null);
        }
        else{
            this.setContentType(contentType.value);
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
    public PSSysMsgTempl createdate(String createDate){
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
    public PSSysMsgTempl createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CUSTOMCODE</B>&nbsp;自定义代码
     */
    public final static String FIELD_CUSTOMCODE = "customcode";

    /**
     * 设置 自定义代码
     * 
     * @param customCode
     * 
     */
    @JsonProperty(FIELD_CUSTOMCODE)
    public void setCustomCode(String customCode){
        this.set(FIELD_CUSTOMCODE, customCode);
    }
    
    /**
     * 获取 自定义代码  
     * @return
     */
    @JsonIgnore
    public String getCustomCode(){
        Object objValue = this.get(FIELD_CUSTOMCODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomCodeDirty(){
        if(this.contains(FIELD_CUSTOMCODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义代码
     */
    @JsonIgnore
    public void resetCustomCode(){
        this.reset(FIELD_CUSTOMCODE);
    }

    /**
     * 设置 自定义代码
     * <P>
     * 等同 {@link #setCustomCode}
     * @param customCode
     */
    @JsonIgnore
    public PSSysMsgTempl customcode(String customCode){
        this.setCustomCode(customCode);
        return this;
    }

    /**
     * <B>CUSTOMMODE</B>&nbsp;脚本代码模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ScriptMode2} 
     */
    public final static String FIELD_CUSTOMMODE = "custommode";

    /**
     * 设置 脚本代码模式
     * 
     * @param customMode
     * 
     */
    @JsonProperty(FIELD_CUSTOMMODE)
    public void setCustomMode(Integer customMode){
        this.set(FIELD_CUSTOMMODE, customMode);
    }
    
    /**
     * 获取 脚本代码模式  
     * @return
     */
    @JsonIgnore
    public Integer getCustomMode(){
        Object objValue = this.get(FIELD_CUSTOMMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 脚本代码模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomModeDirty(){
        if(this.contains(FIELD_CUSTOMMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 脚本代码模式
     */
    @JsonIgnore
    public void resetCustomMode(){
        this.reset(FIELD_CUSTOMMODE);
    }

    /**
     * 设置 脚本代码模式
     * <P>
     * 等同 {@link #setCustomMode}
     * @param customMode
     */
    @JsonIgnore
    public PSSysMsgTempl custommode(Integer customMode){
        this.setCustomMode(customMode);
        return this;
    }

     /**
     * 设置 脚本代码模式
     * <P>
     * 等同 {@link #setCustomMode}
     * @param customMode
     */
    @JsonIgnore
    public PSSysMsgTempl custommode(net.ibizsys.psmodel.core.util.PSModelEnums.ScriptMode2 customMode){
        if(customMode == null){
            this.setCustomMode(null);
        }
        else{
            this.setCustomMode(customMode.value);
        }
        return this;
    }

    /**
     * <B>DDCONTENT</B>&nbsp;钉钉内容
     */
    public final static String FIELD_DDCONTENT = "ddcontent";

    /**
     * 设置 钉钉内容
     * 
     * @param dDContent
     * 
     */
    @JsonProperty(FIELD_DDCONTENT)
    public void setDDContent(String dDContent){
        this.set(FIELD_DDCONTENT, dDContent);
    }
    
    /**
     * 获取 钉钉内容  
     * @return
     */
    @JsonIgnore
    public String getDDContent(){
        Object objValue = this.get(FIELD_DDCONTENT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 钉钉内容 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDDContentDirty(){
        if(this.contains(FIELD_DDCONTENT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 钉钉内容
     */
    @JsonIgnore
    public void resetDDContent(){
        this.reset(FIELD_DDCONTENT);
    }

    /**
     * 设置 钉钉内容
     * <P>
     * 等同 {@link #setDDContent}
     * @param dDContent
     */
    @JsonIgnore
    public PSSysMsgTempl ddcontent(String dDContent){
        this.setDDContent(dDContent);
        return this;
    }

    /**
     * <B>DDPSLANRESID</B>&nbsp;钉钉内容语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_DDPSLANRESID = "ddpslanresid";

    /**
     * 设置 钉钉内容语言资源
     * 
     * @param dDPSLanResId
     * 
     */
    @JsonProperty(FIELD_DDPSLANRESID)
    public void setDDPSLanResId(String dDPSLanResId){
        this.set(FIELD_DDPSLANRESID, dDPSLanResId);
    }
    
    /**
     * 获取 钉钉内容语言资源  
     * @return
     */
    @JsonIgnore
    public String getDDPSLanResId(){
        Object objValue = this.get(FIELD_DDPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 钉钉内容语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDDPSLanResIdDirty(){
        if(this.contains(FIELD_DDPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 钉钉内容语言资源
     */
    @JsonIgnore
    public void resetDDPSLanResId(){
        this.reset(FIELD_DDPSLANRESID);
    }

    /**
     * 设置 钉钉内容语言资源
     * <P>
     * 等同 {@link #setDDPSLanResId}
     * @param dDPSLanResId
     */
    @JsonIgnore
    public PSSysMsgTempl ddpslanresid(String dDPSLanResId){
        this.setDDPSLanResId(dDPSLanResId);
        return this;
    }

    /**
     * 设置 钉钉内容语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDDPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSSysMsgTempl ddpslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setDDPSLanResId(null);
            this.setDDPSLanResName(null);
        }
        else{
            this.setDDPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setDDPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>DDPSLANRESNAME</B>&nbsp;钉钉内容语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DDPSLANRESID}
     */
    public final static String FIELD_DDPSLANRESNAME = "ddpslanresname";

    /**
     * 设置 钉钉内容语言资源
     * 
     * @param dDPSLanResName
     * 
     */
    @JsonProperty(FIELD_DDPSLANRESNAME)
    public void setDDPSLanResName(String dDPSLanResName){
        this.set(FIELD_DDPSLANRESNAME, dDPSLanResName);
    }
    
    /**
     * 获取 钉钉内容语言资源  
     * @return
     */
    @JsonIgnore
    public String getDDPSLanResName(){
        Object objValue = this.get(FIELD_DDPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 钉钉内容语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDDPSLanResNameDirty(){
        if(this.contains(FIELD_DDPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 钉钉内容语言资源
     */
    @JsonIgnore
    public void resetDDPSLanResName(){
        this.reset(FIELD_DDPSLANRESNAME);
    }

    /**
     * 设置 钉钉内容语言资源
     * <P>
     * 等同 {@link #setDDPSLanResName}
     * @param dDPSLanResName
     */
    @JsonIgnore
    public PSSysMsgTempl ddpslanresname(String dDPSLanResName){
        this.setDDPSLanResName(dDPSLanResName);
        return this;
    }

    /**
     * <B>IMCONTENT</B>&nbsp;IM消息内容，指定消息模板的即时消息内容
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_IMCONTENT = "imcontent";

    /**
     * 设置 IM消息内容，详细说明：{@link #FIELD_IMCONTENT}
     * 
     * @param iMContent
     * 
     */
    @JsonProperty(FIELD_IMCONTENT)
    public void setIMContent(String iMContent){
        this.set(FIELD_IMCONTENT, iMContent);
    }
    
    /**
     * 获取 IM消息内容  
     * @return
     */
    @JsonIgnore
    public String getIMContent(){
        Object objValue = this.get(FIELD_IMCONTENT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 IM消息内容 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIMContentDirty(){
        if(this.contains(FIELD_IMCONTENT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 IM消息内容
     */
    @JsonIgnore
    public void resetIMContent(){
        this.reset(FIELD_IMCONTENT);
    }

    /**
     * 设置 IM消息内容，详细说明：{@link #FIELD_IMCONTENT}
     * <P>
     * 等同 {@link #setIMContent}
     * @param iMContent
     */
    @JsonIgnore
    public PSSysMsgTempl imcontent(String iMContent){
        this.setIMContent(iMContent);
        return this;
    }

    /**
     * <B>IMPSLANRESID</B>&nbsp;IM内容语言资源，指定消息模板的即时消息内容的多语言资源对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_IMPSLANRESID = "impslanresid";

    /**
     * 设置 IM内容语言资源，详细说明：{@link #FIELD_IMPSLANRESID}
     * 
     * @param iMPSLanResId
     * 
     */
    @JsonProperty(FIELD_IMPSLANRESID)
    public void setIMPSLanResId(String iMPSLanResId){
        this.set(FIELD_IMPSLANRESID, iMPSLanResId);
    }
    
    /**
     * 获取 IM内容语言资源  
     * @return
     */
    @JsonIgnore
    public String getIMPSLanResId(){
        Object objValue = this.get(FIELD_IMPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 IM内容语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIMPSLanResIdDirty(){
        if(this.contains(FIELD_IMPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 IM内容语言资源
     */
    @JsonIgnore
    public void resetIMPSLanResId(){
        this.reset(FIELD_IMPSLANRESID);
    }

    /**
     * 设置 IM内容语言资源，详细说明：{@link #FIELD_IMPSLANRESID}
     * <P>
     * 等同 {@link #setIMPSLanResId}
     * @param iMPSLanResId
     */
    @JsonIgnore
    public PSSysMsgTempl impslanresid(String iMPSLanResId){
        this.setIMPSLanResId(iMPSLanResId);
        return this;
    }

    /**
     * 设置 IM内容语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setIMPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSSysMsgTempl impslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setIMPSLanResId(null);
            this.setIMPSLanResName(null);
        }
        else{
            this.setIMPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setIMPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>IMPSLANRESNAME</B>&nbsp;IM语言资源，指定消息模板的即时消息内容的多语言资源对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_IMPSLANRESID}
     */
    public final static String FIELD_IMPSLANRESNAME = "impslanresname";

    /**
     * 设置 IM语言资源，详细说明：{@link #FIELD_IMPSLANRESNAME}
     * 
     * @param iMPSLanResName
     * 
     */
    @JsonProperty(FIELD_IMPSLANRESNAME)
    public void setIMPSLanResName(String iMPSLanResName){
        this.set(FIELD_IMPSLANRESNAME, iMPSLanResName);
    }
    
    /**
     * 获取 IM语言资源  
     * @return
     */
    @JsonIgnore
    public String getIMPSLanResName(){
        Object objValue = this.get(FIELD_IMPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 IM语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIMPSLanResNameDirty(){
        if(this.contains(FIELD_IMPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 IM语言资源
     */
    @JsonIgnore
    public void resetIMPSLanResName(){
        this.reset(FIELD_IMPSLANRESNAME);
    }

    /**
     * 设置 IM语言资源，详细说明：{@link #FIELD_IMPSLANRESNAME}
     * <P>
     * 等同 {@link #setIMPSLanResName}
     * @param iMPSLanResName
     */
    @JsonIgnore
    public PSSysMsgTempl impslanresname(String iMPSLanResName){
        this.setIMPSLanResName(iMPSLanResName);
        return this;
    }

    /**
     * <B>MAILGROUPSEND</B>&nbsp;邮件群组发送，指定消息模板是否支持邮件群组发送，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_MAILGROUPSEND = "mailgroupsend";

    /**
     * 设置 邮件群组发送，详细说明：{@link #FIELD_MAILGROUPSEND}
     * 
     * @param mailGroupSend
     * 
     */
    @JsonProperty(FIELD_MAILGROUPSEND)
    public void setMailGroupSend(Integer mailGroupSend){
        this.set(FIELD_MAILGROUPSEND, mailGroupSend);
    }
    
    /**
     * 获取 邮件群组发送  
     * @return
     */
    @JsonIgnore
    public Integer getMailGroupSend(){
        Object objValue = this.get(FIELD_MAILGROUPSEND);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 邮件群组发送 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMailGroupSendDirty(){
        if(this.contains(FIELD_MAILGROUPSEND)){
            return true;
        }
        return false;
    }

    /**
     * 重置 邮件群组发送
     */
    @JsonIgnore
    public void resetMailGroupSend(){
        this.reset(FIELD_MAILGROUPSEND);
    }

    /**
     * 设置 邮件群组发送，详细说明：{@link #FIELD_MAILGROUPSEND}
     * <P>
     * 等同 {@link #setMailGroupSend}
     * @param mailGroupSend
     */
    @JsonIgnore
    public PSSysMsgTempl mailgroupsend(Integer mailGroupSend){
        this.setMailGroupSend(mailGroupSend);
        return this;
    }

     /**
     * 设置 邮件群组发送，详细说明：{@link #FIELD_MAILGROUPSEND}
     * <P>
     * 等同 {@link #setMailGroupSend}
     * @param mailGroupSend
     */
    @JsonIgnore
    public PSSysMsgTempl mailgroupsend(Boolean mailGroupSend){
        if(mailGroupSend == null){
            this.setMailGroupSend(null);
        }
        else{
            this.setMailGroupSend(mailGroupSend?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSSysMsgTempl memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MOBTASKURL</B>&nbsp;移动端任务路径，指定消息模板关联任务的移动端调整路径
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_MOBTASKURL = "mobtaskurl";

    /**
     * 设置 移动端任务路径，详细说明：{@link #FIELD_MOBTASKURL}
     * 
     * @param mobTaskUrl
     * 
     */
    @JsonProperty(FIELD_MOBTASKURL)
    public void setMobTaskUrl(String mobTaskUrl){
        this.set(FIELD_MOBTASKURL, mobTaskUrl);
    }
    
    /**
     * 获取 移动端任务路径  
     * @return
     */
    @JsonIgnore
    public String getMobTaskUrl(){
        Object objValue = this.get(FIELD_MOBTASKURL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端任务路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobTaskUrlDirty(){
        if(this.contains(FIELD_MOBTASKURL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端任务路径
     */
    @JsonIgnore
    public void resetMobTaskUrl(){
        this.reset(FIELD_MOBTASKURL);
    }

    /**
     * 设置 移动端任务路径，详细说明：{@link #FIELD_MOBTASKURL}
     * <P>
     * 等同 {@link #setMobTaskUrl}
     * @param mobTaskUrl
     */
    @JsonIgnore
    public PSSysMsgTempl mobtaskurl(String mobTaskUrl){
        this.setMobTaskUrl(mobTaskUrl);
        return this;
    }

    /**
     * <B>MSGTEMPLPARAMS</B>&nbsp;消息模板参数
     */
    public final static String FIELD_MSGTEMPLPARAMS = "msgtemplparams";

    /**
     * 设置 消息模板参数
     * 
     * @param msgTemplParams
     * 
     */
    @JsonProperty(FIELD_MSGTEMPLPARAMS)
    public void setMsgTemplParams(String msgTemplParams){
        this.set(FIELD_MSGTEMPLPARAMS, msgTemplParams);
    }
    
    /**
     * 获取 消息模板参数  
     * @return
     */
    @JsonIgnore
    public String getMsgTemplParams(){
        Object objValue = this.get(FIELD_MSGTEMPLPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 消息模板参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMsgTemplParamsDirty(){
        if(this.contains(FIELD_MSGTEMPLPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 消息模板参数
     */
    @JsonIgnore
    public void resetMsgTemplParams(){
        this.reset(FIELD_MSGTEMPLPARAMS);
    }

    /**
     * 设置 消息模板参数
     * <P>
     * 等同 {@link #setMsgTemplParams}
     * @param msgTemplParams
     */
    @JsonIgnore
    public PSSysMsgTempl msgtemplparams(String msgTemplParams){
        this.setMsgTemplParams(msgTemplParams);
        return this;
    }

    /**
     * <B>MSGTEMPLTAG</B>&nbsp;消息模板标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_MSGTEMPLTAG = "msgtempltag";

    /**
     * 设置 消息模板标记
     * 
     * @param msgTemplTag
     * 
     */
    @JsonProperty(FIELD_MSGTEMPLTAG)
    public void setMsgTemplTag(String msgTemplTag){
        this.set(FIELD_MSGTEMPLTAG, msgTemplTag);
    }
    
    /**
     * 获取 消息模板标记  
     * @return
     */
    @JsonIgnore
    public String getMsgTemplTag(){
        Object objValue = this.get(FIELD_MSGTEMPLTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 消息模板标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMsgTemplTagDirty(){
        if(this.contains(FIELD_MSGTEMPLTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 消息模板标记
     */
    @JsonIgnore
    public void resetMsgTemplTag(){
        this.reset(FIELD_MSGTEMPLTAG);
    }

    /**
     * 设置 消息模板标记
     * <P>
     * 等同 {@link #setMsgTemplTag}
     * @param msgTemplTag
     */
    @JsonIgnore
    public PSSysMsgTempl msgtempltag(String msgTemplTag){
        this.setMsgTemplTag(msgTemplTag);
        return this;
    }

    /**
     * <B>MSGTEMPLTAG2</B>&nbsp;消息模板标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_MSGTEMPLTAG2 = "msgtempltag2";

    /**
     * 设置 消息模板标记2
     * 
     * @param msgTemplTag2
     * 
     */
    @JsonProperty(FIELD_MSGTEMPLTAG2)
    public void setMsgTemplTag2(String msgTemplTag2){
        this.set(FIELD_MSGTEMPLTAG2, msgTemplTag2);
    }
    
    /**
     * 获取 消息模板标记2  
     * @return
     */
    @JsonIgnore
    public String getMsgTemplTag2(){
        Object objValue = this.get(FIELD_MSGTEMPLTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 消息模板标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMsgTemplTag2Dirty(){
        if(this.contains(FIELD_MSGTEMPLTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 消息模板标记2
     */
    @JsonIgnore
    public void resetMsgTemplTag2(){
        this.reset(FIELD_MSGTEMPLTAG2);
    }

    /**
     * 设置 消息模板标记2
     * <P>
     * 等同 {@link #setMsgTemplTag2}
     * @param msgTemplTag2
     */
    @JsonIgnore
    public PSSysMsgTempl msgtempltag2(String msgTemplTag2){
        this.setMsgTemplTag2(msgTemplTag2);
        return this;
    }

    /**
     * <B>MSGTEMPLTYPE</B>&nbsp;消息模板类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.MsgTemplType} 
     */
    public final static String FIELD_MSGTEMPLTYPE = "msgtempltype";

    /**
     * 设置 消息模板类型
     * 
     * @param msgTemplType
     * 
     */
    @JsonProperty(FIELD_MSGTEMPLTYPE)
    public void setMsgTemplType(String msgTemplType){
        this.set(FIELD_MSGTEMPLTYPE, msgTemplType);
    }
    
    /**
     * 获取 消息模板类型  
     * @return
     */
    @JsonIgnore
    public String getMsgTemplType(){
        Object objValue = this.get(FIELD_MSGTEMPLTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 消息模板类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMsgTemplTypeDirty(){
        if(this.contains(FIELD_MSGTEMPLTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 消息模板类型
     */
    @JsonIgnore
    public void resetMsgTemplType(){
        this.reset(FIELD_MSGTEMPLTYPE);
    }

    /**
     * 设置 消息模板类型
     * <P>
     * 等同 {@link #setMsgTemplType}
     * @param msgTemplType
     */
    @JsonIgnore
    public PSSysMsgTempl msgtempltype(String msgTemplType){
        this.setMsgTemplType(msgTemplType);
        return this;
    }

     /**
     * 设置 消息模板类型
     * <P>
     * 等同 {@link #setMsgTemplType}
     * @param msgTemplType
     */
    @JsonIgnore
    public PSSysMsgTempl msgtempltype(net.ibizsys.psmodel.core.util.PSModelEnums.MsgTemplType msgTemplType){
        if(msgTemplType == null){
            this.setMsgTemplType(null);
        }
        else{
            this.setMsgTemplType(msgTemplType.value);
        }
        return this;
    }

    /**
     * <B>PSDEDSID</B>&nbsp;数据源数据集
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataSet} 
     */
    public final static String FIELD_PSDEDSID = "psdedsid";

    /**
     * 设置 数据源数据集
     * 
     * @param pSDEDSId
     * 
     */
    @JsonProperty(FIELD_PSDEDSID)
    public void setPSDEDSId(String pSDEDSId){
        this.set(FIELD_PSDEDSID, pSDEDSId);
    }
    
    /**
     * 获取 数据源数据集  
     * @return
     */
    @JsonIgnore
    public String getPSDEDSId(){
        Object objValue = this.get(FIELD_PSDEDSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据源数据集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDSIdDirty(){
        if(this.contains(FIELD_PSDEDSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据源数据集
     */
    @JsonIgnore
    public void resetPSDEDSId(){
        this.reset(FIELD_PSDEDSID);
    }

    /**
     * 设置 数据源数据集
     * <P>
     * 等同 {@link #setPSDEDSId}
     * @param pSDEDSId
     */
    @JsonIgnore
    public PSSysMsgTempl psdedsid(String pSDEDSId){
        this.setPSDEDSId(pSDEDSId);
        return this;
    }

    /**
     * 设置 数据源数据集，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDSId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSSysMsgTempl psdedsid(PSDEDataSet pSDEDataSet){
        if(pSDEDataSet == null){
            this.setPSDEDSId(null);
            this.setPSDEDSName(null);
        }
        else{
            this.setPSDEDSId(pSDEDataSet.getPSDEDataSetId());
            this.setPSDEDSName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    /**
     * <B>PSDEDSNAME</B>&nbsp;数据源数据集
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDSID}
     */
    public final static String FIELD_PSDEDSNAME = "psdedsname";

    /**
     * 设置 数据源数据集
     * 
     * @param pSDEDSName
     * 
     */
    @JsonProperty(FIELD_PSDEDSNAME)
    public void setPSDEDSName(String pSDEDSName){
        this.set(FIELD_PSDEDSNAME, pSDEDSName);
    }
    
    /**
     * 获取 数据源数据集  
     * @return
     */
    @JsonIgnore
    public String getPSDEDSName(){
        Object objValue = this.get(FIELD_PSDEDSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据源数据集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDSNameDirty(){
        if(this.contains(FIELD_PSDEDSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据源数据集
     */
    @JsonIgnore
    public void resetPSDEDSName(){
        this.reset(FIELD_PSDEDSNAME);
    }

    /**
     * 设置 数据源数据集
     * <P>
     * 等同 {@link #setPSDEDSName}
     * @param pSDEDSName
     */
    @JsonIgnore
    public PSSysMsgTempl psdedsname(String pSDEDSName){
        this.setPSDEDSName(pSDEDSName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;数据源实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 数据源实体
     * 
     * @param pSDEId
     * 
     */
    @JsonProperty(FIELD_PSDEID)
    public void setPSDEId(String pSDEId){
        this.set(FIELD_PSDEID, pSDEId);
    }
    
    /**
     * 获取 数据源实体  
     * @return
     */
    @JsonIgnore
    public String getPSDEId(){
        Object objValue = this.get(FIELD_PSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据源实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEIdDirty(){
        if(this.contains(FIELD_PSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据源实体
     */
    @JsonIgnore
    public void resetPSDEId(){
        this.reset(FIELD_PSDEID);
    }

    /**
     * 设置 数据源实体
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSSysMsgTempl psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * 设置 数据源实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSSysMsgTempl psdeid(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setPSDEId(null);
            this.setPSDEName(null);
        }
        else{
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>PSDENAME</B>&nbsp;数据源实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_PSDENAME = "psdename";

    /**
     * 设置 数据源实体
     * 
     * @param pSDEName
     * 
     */
    @JsonProperty(FIELD_PSDENAME)
    public void setPSDEName(String pSDEName){
        this.set(FIELD_PSDENAME, pSDEName);
    }
    
    /**
     * 获取 数据源实体  
     * @return
     */
    @JsonIgnore
    public String getPSDEName(){
        Object objValue = this.get(FIELD_PSDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据源实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDENameDirty(){
        if(this.contains(FIELD_PSDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据源实体
     */
    @JsonIgnore
    public void resetPSDEName(){
        this.reset(FIELD_PSDENAME);
    }

    /**
     * 设置 数据源实体
     * <P>
     * 等同 {@link #setPSDEName}
     * @param pSDEName
     */
    @JsonIgnore
    public PSSysMsgTempl psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定消息模板所在的系统模块
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSModule} 
     */
    public final static String FIELD_PSMODULEID = "psmoduleid";

    /**
     * 设置 系统模块，详细说明：{@link #FIELD_PSMODULEID}
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
     * 设置 系统模块，详细说明：{@link #FIELD_PSMODULEID}
     * <P>
     * 等同 {@link #setPSModuleId}
     * @param pSModuleId
     */
    @JsonIgnore
    public PSSysMsgTempl psmoduleid(String pSModuleId){
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
    public PSSysMsgTempl psmoduleid(PSModule pSModule){
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
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定消息模板所在的系统模块
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSMODULEID}
     */
    public final static String FIELD_PSMODULENAME = "psmodulename";

    /**
     * 设置 系统模块，详细说明：{@link #FIELD_PSMODULENAME}
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
     * 设置 系统模块，详细说明：{@link #FIELD_PSMODULENAME}
     * <P>
     * 等同 {@link #setPSModuleName}
     * @param pSModuleName
     */
    @JsonIgnore
    public PSSysMsgTempl psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELID</B>&nbsp;动态系统模型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDynaModel} 
     */
    public final static String FIELD_PSSYSDYNAMODELID = "pssysdynamodelid";

    /**
     * 设置 动态系统模型
     * 
     * @param pSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELID)
    public void setPSSysDynaModelId(String pSSysDynaModelId){
        this.set(FIELD_PSSYSDYNAMODELID, pSSysDynaModelId);
    }
    
    /**
     * 获取 动态系统模型  
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
     * 判断 动态系统模型 是否指定值，包括空值
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
     * 重置 动态系统模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelId(){
        this.reset(FIELD_PSSYSDYNAMODELID);
    }

    /**
     * 设置 动态系统模型
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModelId
     */
    @JsonIgnore
    public PSSysMsgTempl pssysdynamodelid(String pSSysDynaModelId){
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    /**
     * 设置 动态系统模型，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModel 引用对象
     */
    @JsonIgnore
    public PSSysMsgTempl pssysdynamodelid(PSSysDynaModel pSSysDynaModel){
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
     * <B>PSSYSDYNAMODELNAME</B>&nbsp;动态系统模型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDYNAMODELID}
     */
    public final static String FIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";

    /**
     * 设置 动态系统模型
     * 
     * @param pSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELNAME)
    public void setPSSysDynaModelName(String pSSysDynaModelName){
        this.set(FIELD_PSSYSDYNAMODELNAME, pSSysDynaModelName);
    }
    
    /**
     * 获取 动态系统模型  
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
     * 判断 动态系统模型 是否指定值，包括空值
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
     * 重置 动态系统模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelName(){
        this.reset(FIELD_PSSYSDYNAMODELNAME);
    }

    /**
     * 设置 动态系统模型
     * <P>
     * 等同 {@link #setPSSysDynaModelName}
     * @param pSSysDynaModelName
     */
    @JsonIgnore
    public PSSysMsgTempl pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSSYSMSGTEMPLID</B>&nbsp;系统消息模板标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSMSGTEMPLID = "pssysmsgtemplid";

    /**
     * 设置 系统消息模板标识
     * 
     * @param pSSysMsgTemplId
     * 
     */
    @JsonProperty(FIELD_PSSYSMSGTEMPLID)
    public void setPSSysMsgTemplId(String pSSysMsgTemplId){
        this.set(FIELD_PSSYSMSGTEMPLID, pSSysMsgTemplId);
    }
    
    /**
     * 获取 系统消息模板标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysMsgTemplId(){
        Object objValue = this.get(FIELD_PSSYSMSGTEMPLID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统消息模板标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysMsgTemplIdDirty(){
        if(this.contains(FIELD_PSSYSMSGTEMPLID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统消息模板标识
     */
    @JsonIgnore
    public void resetPSSysMsgTemplId(){
        this.reset(FIELD_PSSYSMSGTEMPLID);
    }

    /**
     * 设置 系统消息模板标识
     * <P>
     * 等同 {@link #setPSSysMsgTemplId}
     * @param pSSysMsgTemplId
     */
    @JsonIgnore
    public PSSysMsgTempl pssysmsgtemplid(String pSSysMsgTemplId){
        this.setPSSysMsgTemplId(pSSysMsgTemplId);
        return this;
    }

    /**
     * <B>PSSYSMSGTEMPLNAME</B>&nbsp;消息模板名称，指定消息模板的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSMSGTEMPLNAME = "pssysmsgtemplname";

    /**
     * 设置 消息模板名称，详细说明：{@link #FIELD_PSSYSMSGTEMPLNAME}
     * 
     * @param pSSysMsgTemplName
     * 
     */
    @JsonProperty(FIELD_PSSYSMSGTEMPLNAME)
    public void setPSSysMsgTemplName(String pSSysMsgTemplName){
        this.set(FIELD_PSSYSMSGTEMPLNAME, pSSysMsgTemplName);
    }
    
    /**
     * 获取 消息模板名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysMsgTemplName(){
        Object objValue = this.get(FIELD_PSSYSMSGTEMPLNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 消息模板名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysMsgTemplNameDirty(){
        if(this.contains(FIELD_PSSYSMSGTEMPLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 消息模板名称
     */
    @JsonIgnore
    public void resetPSSysMsgTemplName(){
        this.reset(FIELD_PSSYSMSGTEMPLNAME);
    }

    /**
     * 设置 消息模板名称，详细说明：{@link #FIELD_PSSYSMSGTEMPLNAME}
     * <P>
     * 等同 {@link #setPSSysMsgTemplName}
     * @param pSSysMsgTemplName
     */
    @JsonIgnore
    public PSSysMsgTempl pssysmsgtemplname(String pSSysMsgTemplName){
        this.setPSSysMsgTemplName(pSSysMsgTemplName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysMsgTemplName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysMsgTemplName(strName);
    }

    @JsonIgnore
    public PSSysMsgTempl name(String strName){
        this.setPSSysMsgTemplName(strName);
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINID</B>&nbsp;后端扩展插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysSFPlugin} 
     */
    public final static String FIELD_PSSYSSFPLUGINID = "pssyssfpluginid";

    /**
     * 设置 后端扩展插件
     * 
     * @param pSSysSFPluginId
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINID)
    public void setPSSysSFPluginId(String pSSysSFPluginId){
        this.set(FIELD_PSSYSSFPLUGINID, pSSysSFPluginId);
    }
    
    /**
     * 获取 后端扩展插件  
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
     * 判断 后端扩展插件 是否指定值，包括空值
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
     * 重置 后端扩展插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginId(){
        this.reset(FIELD_PSSYSSFPLUGINID);
    }

    /**
     * 设置 后端扩展插件
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPluginId
     */
    @JsonIgnore
    public PSSysMsgTempl pssyssfpluginid(String pSSysSFPluginId){
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    /**
     * 设置 后端扩展插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPlugin 引用对象
     */
    @JsonIgnore
    public PSSysMsgTempl pssyssfpluginid(PSSysSFPlugin pSSysSFPlugin){
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
     * <B>PSSYSSFPLUGINNAME</B>&nbsp;后端扩展插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSFPLUGINID}
     */
    public final static String FIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";

    /**
     * 设置 后端扩展插件
     * 
     * @param pSSysSFPluginName
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINNAME)
    public void setPSSysSFPluginName(String pSSysSFPluginName){
        this.set(FIELD_PSSYSSFPLUGINNAME, pSSysSFPluginName);
    }
    
    /**
     * 获取 后端扩展插件  
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
     * 判断 后端扩展插件 是否指定值，包括空值
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
     * 重置 后端扩展插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginName(){
        this.reset(FIELD_PSSYSSFPLUGINNAME);
    }

    /**
     * 设置 后端扩展插件
     * <P>
     * 等同 {@link #setPSSysSFPluginName}
     * @param pSSysSFPluginName
     */
    @JsonIgnore
    public PSSysMsgTempl pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    /**
     * <B>SMSCONTENT</B>&nbsp;手机消息内容，指定消息模板的手机消息内容
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_SMSCONTENT = "smscontent";

    /**
     * 设置 手机消息内容，详细说明：{@link #FIELD_SMSCONTENT}
     * 
     * @param sMSContent
     * 
     */
    @JsonProperty(FIELD_SMSCONTENT)
    public void setSMSContent(String sMSContent){
        this.set(FIELD_SMSCONTENT, sMSContent);
    }
    
    /**
     * 获取 手机消息内容  
     * @return
     */
    @JsonIgnore
    public String getSMSContent(){
        Object objValue = this.get(FIELD_SMSCONTENT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 手机消息内容 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSMSContentDirty(){
        if(this.contains(FIELD_SMSCONTENT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 手机消息内容
     */
    @JsonIgnore
    public void resetSMSContent(){
        this.reset(FIELD_SMSCONTENT);
    }

    /**
     * 设置 手机消息内容，详细说明：{@link #FIELD_SMSCONTENT}
     * <P>
     * 等同 {@link #setSMSContent}
     * @param sMSContent
     */
    @JsonIgnore
    public PSSysMsgTempl smscontent(String sMSContent){
        this.setSMSContent(sMSContent);
        return this;
    }

    /**
     * <B>SMSPSLANRESID</B>&nbsp;短消息语言资源，指定消息模板的手机消息内容的多语言资源对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_SMSPSLANRESID = "smspslanresid";

    /**
     * 设置 短消息语言资源，详细说明：{@link #FIELD_SMSPSLANRESID}
     * 
     * @param sMSPSLanResId
     * 
     */
    @JsonProperty(FIELD_SMSPSLANRESID)
    public void setSMSPSLanResId(String sMSPSLanResId){
        this.set(FIELD_SMSPSLANRESID, sMSPSLanResId);
    }
    
    /**
     * 获取 短消息语言资源  
     * @return
     */
    @JsonIgnore
    public String getSMSPSLanResId(){
        Object objValue = this.get(FIELD_SMSPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 短消息语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSMSPSLanResIdDirty(){
        if(this.contains(FIELD_SMSPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 短消息语言资源
     */
    @JsonIgnore
    public void resetSMSPSLanResId(){
        this.reset(FIELD_SMSPSLANRESID);
    }

    /**
     * 设置 短消息语言资源，详细说明：{@link #FIELD_SMSPSLANRESID}
     * <P>
     * 等同 {@link #setSMSPSLanResId}
     * @param sMSPSLanResId
     */
    @JsonIgnore
    public PSSysMsgTempl smspslanresid(String sMSPSLanResId){
        this.setSMSPSLanResId(sMSPSLanResId);
        return this;
    }

    /**
     * 设置 短消息语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setSMSPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSSysMsgTempl smspslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setSMSPSLanResId(null);
            this.setSMSPSLanResName(null);
        }
        else{
            this.setSMSPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setSMSPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>SMSPSLANRESNAME</B>&nbsp;短消息语言资源，指定消息模板的手机消息内容的多语言资源对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_SMSPSLANRESID}
     */
    public final static String FIELD_SMSPSLANRESNAME = "smspslanresname";

    /**
     * 设置 短消息语言资源，详细说明：{@link #FIELD_SMSPSLANRESNAME}
     * 
     * @param sMSPSLanResName
     * 
     */
    @JsonProperty(FIELD_SMSPSLANRESNAME)
    public void setSMSPSLanResName(String sMSPSLanResName){
        this.set(FIELD_SMSPSLANRESNAME, sMSPSLanResName);
    }
    
    /**
     * 获取 短消息语言资源  
     * @return
     */
    @JsonIgnore
    public String getSMSPSLanResName(){
        Object objValue = this.get(FIELD_SMSPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 短消息语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSMSPSLanResNameDirty(){
        if(this.contains(FIELD_SMSPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 短消息语言资源
     */
    @JsonIgnore
    public void resetSMSPSLanResName(){
        this.reset(FIELD_SMSPSLANRESNAME);
    }

    /**
     * 设置 短消息语言资源，详细说明：{@link #FIELD_SMSPSLANRESNAME}
     * <P>
     * 等同 {@link #setSMSPSLanResName}
     * @param sMSPSLanResName
     */
    @JsonIgnore
    public PSSysMsgTempl smspslanresname(String sMSPSLanResName){
        this.setSMSPSLanResName(sMSPSLanResName);
        return this;
    }

    /**
     * <B>SUBJECT</B>&nbsp;标题，指定消息模板的标题
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_SUBJECT = "subject";

    /**
     * 设置 标题，详细说明：{@link #FIELD_SUBJECT}
     * 
     * @param subject
     * 
     */
    @JsonProperty(FIELD_SUBJECT)
    public void setSubject(String subject){
        this.set(FIELD_SUBJECT, subject);
    }
    
    /**
     * 获取 标题  
     * @return
     */
    @JsonIgnore
    public String getSubject(){
        Object objValue = this.get(FIELD_SUBJECT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标题 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSubjectDirty(){
        if(this.contains(FIELD_SUBJECT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题
     */
    @JsonIgnore
    public void resetSubject(){
        this.reset(FIELD_SUBJECT);
    }

    /**
     * 设置 标题，详细说明：{@link #FIELD_SUBJECT}
     * <P>
     * 等同 {@link #setSubject}
     * @param subject
     */
    @JsonIgnore
    public PSSysMsgTempl subject(String subject){
        this.setSubject(subject);
        return this;
    }

    /**
     * <B>SUBJECTPSDEFID</B>&nbsp;标题属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_SUBJECTPSDEFID = "subjectpsdefid";

    /**
     * 设置 标题属性
     * 
     * @param subjectPSDEFId
     * 
     */
    @JsonProperty(FIELD_SUBJECTPSDEFID)
    public void setSubjectPSDEFId(String subjectPSDEFId){
        this.set(FIELD_SUBJECTPSDEFID, subjectPSDEFId);
    }
    
    /**
     * 获取 标题属性  
     * @return
     */
    @JsonIgnore
    public String getSubjectPSDEFId(){
        Object objValue = this.get(FIELD_SUBJECTPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标题属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSubjectPSDEFIdDirty(){
        if(this.contains(FIELD_SUBJECTPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题属性
     */
    @JsonIgnore
    public void resetSubjectPSDEFId(){
        this.reset(FIELD_SUBJECTPSDEFID);
    }

    /**
     * 设置 标题属性
     * <P>
     * 等同 {@link #setSubjectPSDEFId}
     * @param subjectPSDEFId
     */
    @JsonIgnore
    public PSSysMsgTempl subjectpsdefid(String subjectPSDEFId){
        this.setSubjectPSDEFId(subjectPSDEFId);
        return this;
    }

    /**
     * 设置 标题属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setSubjectPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMsgTempl subjectpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setSubjectPSDEFId(null);
            this.setSubjectPSDEFName(null);
        }
        else{
            this.setSubjectPSDEFId(pSDEField.getPSDEFieldId());
            this.setSubjectPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>SUBJECTPSDEFNAME</B>&nbsp;标题属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_SUBJECTPSDEFID}
     */
    public final static String FIELD_SUBJECTPSDEFNAME = "subjectpsdefname";

    /**
     * 设置 标题属性
     * 
     * @param subjectPSDEFName
     * 
     */
    @JsonProperty(FIELD_SUBJECTPSDEFNAME)
    public void setSubjectPSDEFName(String subjectPSDEFName){
        this.set(FIELD_SUBJECTPSDEFNAME, subjectPSDEFName);
    }
    
    /**
     * 获取 标题属性  
     * @return
     */
    @JsonIgnore
    public String getSubjectPSDEFName(){
        Object objValue = this.get(FIELD_SUBJECTPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标题属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSubjectPSDEFNameDirty(){
        if(this.contains(FIELD_SUBJECTPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题属性
     */
    @JsonIgnore
    public void resetSubjectPSDEFName(){
        this.reset(FIELD_SUBJECTPSDEFNAME);
    }

    /**
     * 设置 标题属性
     * <P>
     * 等同 {@link #setSubjectPSDEFName}
     * @param subjectPSDEFName
     */
    @JsonIgnore
    public PSSysMsgTempl subjectpsdefname(String subjectPSDEFName){
        this.setSubjectPSDEFName(subjectPSDEFName);
        return this;
    }

    /**
     * <B>SUBPSLANRESID</B>&nbsp;标题语言资源，指定消息模板的标题的多语言资源对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_SUBPSLANRESID = "subpslanresid";

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_SUBPSLANRESID}
     * 
     * @param subPSLanResId
     * 
     */
    @JsonProperty(FIELD_SUBPSLANRESID)
    public void setSubPSLanResId(String subPSLanResId){
        this.set(FIELD_SUBPSLANRESID, subPSLanResId);
    }
    
    /**
     * 获取 标题语言资源  
     * @return
     */
    @JsonIgnore
    public String getSubPSLanResId(){
        Object objValue = this.get(FIELD_SUBPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标题语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSubPSLanResIdDirty(){
        if(this.contains(FIELD_SUBPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题语言资源
     */
    @JsonIgnore
    public void resetSubPSLanResId(){
        this.reset(FIELD_SUBPSLANRESID);
    }

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_SUBPSLANRESID}
     * <P>
     * 等同 {@link #setSubPSLanResId}
     * @param subPSLanResId
     */
    @JsonIgnore
    public PSSysMsgTempl subpslanresid(String subPSLanResId){
        this.setSubPSLanResId(subPSLanResId);
        return this;
    }

    /**
     * 设置 标题语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setSubPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSSysMsgTempl subpslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setSubPSLanResId(null);
            this.setSubPSLanResName(null);
        }
        else{
            this.setSubPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setSubPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>SUBPSLANRESNAME</B>&nbsp;标题语言资源，指定消息模板的标题的多语言资源对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_SUBPSLANRESID}
     */
    public final static String FIELD_SUBPSLANRESNAME = "subpslanresname";

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_SUBPSLANRESNAME}
     * 
     * @param subPSLanResName
     * 
     */
    @JsonProperty(FIELD_SUBPSLANRESNAME)
    public void setSubPSLanResName(String subPSLanResName){
        this.set(FIELD_SUBPSLANRESNAME, subPSLanResName);
    }
    
    /**
     * 获取 标题语言资源  
     * @return
     */
    @JsonIgnore
    public String getSubPSLanResName(){
        Object objValue = this.get(FIELD_SUBPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标题语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSubPSLanResNameDirty(){
        if(this.contains(FIELD_SUBPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题语言资源
     */
    @JsonIgnore
    public void resetSubPSLanResName(){
        this.reset(FIELD_SUBPSLANRESNAME);
    }

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_SUBPSLANRESNAME}
     * <P>
     * 等同 {@link #setSubPSLanResName}
     * @param subPSLanResName
     */
    @JsonIgnore
    public PSSysMsgTempl subpslanresname(String subPSLanResName){
        this.setSubPSLanResName(subPSLanResName);
        return this;
    }

    /**
     * <B>TASKURL</B>&nbsp;任务路径，指定消息模板关联任务的调整路径
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_TASKURL = "taskurl";

    /**
     * 设置 任务路径，详细说明：{@link #FIELD_TASKURL}
     * 
     * @param taskUrl
     * 
     */
    @JsonProperty(FIELD_TASKURL)
    public void setTaskUrl(String taskUrl){
        this.set(FIELD_TASKURL, taskUrl);
    }
    
    /**
     * 获取 任务路径  
     * @return
     */
    @JsonIgnore
    public String getTaskUrl(){
        Object objValue = this.get(FIELD_TASKURL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 任务路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTaskUrlDirty(){
        if(this.contains(FIELD_TASKURL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 任务路径
     */
    @JsonIgnore
    public void resetTaskUrl(){
        this.reset(FIELD_TASKURL);
    }

    /**
     * 设置 任务路径，详细说明：{@link #FIELD_TASKURL}
     * <P>
     * 等同 {@link #setTaskUrl}
     * @param taskUrl
     */
    @JsonIgnore
    public PSSysMsgTempl taskurl(String taskUrl){
        this.setTaskUrl(taskUrl);
        return this;
    }

    /**
     * <B>TEMPLENGINE</B>&nbsp;模板引擎
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.MsgTemplEngine} 
     */
    public final static String FIELD_TEMPLENGINE = "templengine";

    /**
     * 设置 模板引擎
     * 
     * @param templEngine
     * 
     */
    @JsonProperty(FIELD_TEMPLENGINE)
    public void setTemplEngine(String templEngine){
        this.set(FIELD_TEMPLENGINE, templEngine);
    }
    
    /**
     * 获取 模板引擎  
     * @return
     */
    @JsonIgnore
    public String getTemplEngine(){
        Object objValue = this.get(FIELD_TEMPLENGINE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模板引擎 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTemplEngineDirty(){
        if(this.contains(FIELD_TEMPLENGINE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模板引擎
     */
    @JsonIgnore
    public void resetTemplEngine(){
        this.reset(FIELD_TEMPLENGINE);
    }

    /**
     * 设置 模板引擎
     * <P>
     * 等同 {@link #setTemplEngine}
     * @param templEngine
     */
    @JsonIgnore
    public PSSysMsgTempl templengine(String templEngine){
        this.setTemplEngine(templEngine);
        return this;
    }

     /**
     * 设置 模板引擎
     * <P>
     * 等同 {@link #setTemplEngine}
     * @param templEngine
     */
    @JsonIgnore
    public PSSysMsgTempl templengine(net.ibizsys.psmodel.core.util.PSModelEnums.MsgTemplEngine templEngine){
        if(templEngine == null){
            this.setTemplEngine(null);
        }
        else{
            this.setTemplEngine(templEngine.value);
        }
        return this;
    }

    /**
     * <B>TEMPLTAGPSDEFID</B>&nbsp;模板标记属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_TEMPLTAGPSDEFID = "templtagpsdefid";

    /**
     * 设置 模板标记属性
     * 
     * @param templTagPSDEFId
     * 
     */
    @JsonProperty(FIELD_TEMPLTAGPSDEFID)
    public void setTemplTagPSDEFId(String templTagPSDEFId){
        this.set(FIELD_TEMPLTAGPSDEFID, templTagPSDEFId);
    }
    
    /**
     * 获取 模板标记属性  
     * @return
     */
    @JsonIgnore
    public String getTemplTagPSDEFId(){
        Object objValue = this.get(FIELD_TEMPLTAGPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模板标记属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTemplTagPSDEFIdDirty(){
        if(this.contains(FIELD_TEMPLTAGPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模板标记属性
     */
    @JsonIgnore
    public void resetTemplTagPSDEFId(){
        this.reset(FIELD_TEMPLTAGPSDEFID);
    }

    /**
     * 设置 模板标记属性
     * <P>
     * 等同 {@link #setTemplTagPSDEFId}
     * @param templTagPSDEFId
     */
    @JsonIgnore
    public PSSysMsgTempl templtagpsdefid(String templTagPSDEFId){
        this.setTemplTagPSDEFId(templTagPSDEFId);
        return this;
    }

    /**
     * 设置 模板标记属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTemplTagPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMsgTempl templtagpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setTemplTagPSDEFId(null);
            this.setTemplTagPSDEFName(null);
        }
        else{
            this.setTemplTagPSDEFId(pSDEField.getPSDEFieldId());
            this.setTemplTagPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>TEMPLTAGPSDEFNAME</B>&nbsp;模板标记属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TEMPLTAGPSDEFID}
     */
    public final static String FIELD_TEMPLTAGPSDEFNAME = "templtagpsdefname";

    /**
     * 设置 模板标记属性
     * 
     * @param templTagPSDEFName
     * 
     */
    @JsonProperty(FIELD_TEMPLTAGPSDEFNAME)
    public void setTemplTagPSDEFName(String templTagPSDEFName){
        this.set(FIELD_TEMPLTAGPSDEFNAME, templTagPSDEFName);
    }
    
    /**
     * 获取 模板标记属性  
     * @return
     */
    @JsonIgnore
    public String getTemplTagPSDEFName(){
        Object objValue = this.get(FIELD_TEMPLTAGPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模板标记属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTemplTagPSDEFNameDirty(){
        if(this.contains(FIELD_TEMPLTAGPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模板标记属性
     */
    @JsonIgnore
    public void resetTemplTagPSDEFName(){
        this.reset(FIELD_TEMPLTAGPSDEFNAME);
    }

    /**
     * 设置 模板标记属性
     * <P>
     * 等同 {@link #setTemplTagPSDEFName}
     * @param templTagPSDEFName
     */
    @JsonIgnore
    public PSSysMsgTempl templtagpsdefname(String templTagPSDEFName){
        this.setTemplTagPSDEFName(templTagPSDEFName);
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
    public PSSysMsgTempl updatedate(String updateDate){
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
    public PSSysMsgTempl updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>USER2PSDEFID</B>&nbsp;用户自定义属性2
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_USER2PSDEFID = "user2psdefid";

    /**
     * 设置 用户自定义属性2
     * 
     * @param user2PSDEFId
     * 
     */
    @JsonProperty(FIELD_USER2PSDEFID)
    public void setUser2PSDEFId(String user2PSDEFId){
        this.set(FIELD_USER2PSDEFID, user2PSDEFId);
    }
    
    /**
     * 获取 用户自定义属性2  
     * @return
     */
    @JsonIgnore
    public String getUser2PSDEFId(){
        Object objValue = this.get(FIELD_USER2PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户自定义属性2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUser2PSDEFIdDirty(){
        if(this.contains(FIELD_USER2PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户自定义属性2
     */
    @JsonIgnore
    public void resetUser2PSDEFId(){
        this.reset(FIELD_USER2PSDEFID);
    }

    /**
     * 设置 用户自定义属性2
     * <P>
     * 等同 {@link #setUser2PSDEFId}
     * @param user2PSDEFId
     */
    @JsonIgnore
    public PSSysMsgTempl user2psdefid(String user2PSDEFId){
        this.setUser2PSDEFId(user2PSDEFId);
        return this;
    }

    /**
     * 设置 用户自定义属性2，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUser2PSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMsgTempl user2psdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setUser2PSDEFId(null);
            this.setUser2PSDEFName(null);
        }
        else{
            this.setUser2PSDEFId(pSDEField.getPSDEFieldId());
            this.setUser2PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>USER2PSDEFNAME</B>&nbsp;用户自定义属性2
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_USER2PSDEFID}
     */
    public final static String FIELD_USER2PSDEFNAME = "user2psdefname";

    /**
     * 设置 用户自定义属性2
     * 
     * @param user2PSDEFName
     * 
     */
    @JsonProperty(FIELD_USER2PSDEFNAME)
    public void setUser2PSDEFName(String user2PSDEFName){
        this.set(FIELD_USER2PSDEFNAME, user2PSDEFName);
    }
    
    /**
     * 获取 用户自定义属性2  
     * @return
     */
    @JsonIgnore
    public String getUser2PSDEFName(){
        Object objValue = this.get(FIELD_USER2PSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户自定义属性2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUser2PSDEFNameDirty(){
        if(this.contains(FIELD_USER2PSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户自定义属性2
     */
    @JsonIgnore
    public void resetUser2PSDEFName(){
        this.reset(FIELD_USER2PSDEFNAME);
    }

    /**
     * 设置 用户自定义属性2
     * <P>
     * 等同 {@link #setUser2PSDEFName}
     * @param user2PSDEFName
     */
    @JsonIgnore
    public PSSysMsgTempl user2psdefname(String user2PSDEFName){
        this.setUser2PSDEFName(user2PSDEFName);
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
    public PSSysMsgTempl usercat(String userCat){
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
    public PSSysMsgTempl usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat.value);
        }
        return this;
    }

    /**
     * <B>USERPSDEFID</B>&nbsp;用户自定义属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_USERPSDEFID = "userpsdefid";

    /**
     * 设置 用户自定义属性
     * 
     * @param userPSDEFId
     * 
     */
    @JsonProperty(FIELD_USERPSDEFID)
    public void setUserPSDEFId(String userPSDEFId){
        this.set(FIELD_USERPSDEFID, userPSDEFId);
    }
    
    /**
     * 获取 用户自定义属性  
     * @return
     */
    @JsonIgnore
    public String getUserPSDEFId(){
        Object objValue = this.get(FIELD_USERPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户自定义属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserPSDEFIdDirty(){
        if(this.contains(FIELD_USERPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户自定义属性
     */
    @JsonIgnore
    public void resetUserPSDEFId(){
        this.reset(FIELD_USERPSDEFID);
    }

    /**
     * 设置 用户自定义属性
     * <P>
     * 等同 {@link #setUserPSDEFId}
     * @param userPSDEFId
     */
    @JsonIgnore
    public PSSysMsgTempl userpsdefid(String userPSDEFId){
        this.setUserPSDEFId(userPSDEFId);
        return this;
    }

    /**
     * 设置 用户自定义属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUserPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMsgTempl userpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setUserPSDEFId(null);
            this.setUserPSDEFName(null);
        }
        else{
            this.setUserPSDEFId(pSDEField.getPSDEFieldId());
            this.setUserPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>USERPSDEFNAME</B>&nbsp;用户自定义属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_USERPSDEFID}
     */
    public final static String FIELD_USERPSDEFNAME = "userpsdefname";

    /**
     * 设置 用户自定义属性
     * 
     * @param userPSDEFName
     * 
     */
    @JsonProperty(FIELD_USERPSDEFNAME)
    public void setUserPSDEFName(String userPSDEFName){
        this.set(FIELD_USERPSDEFNAME, userPSDEFName);
    }
    
    /**
     * 获取 用户自定义属性  
     * @return
     */
    @JsonIgnore
    public String getUserPSDEFName(){
        Object objValue = this.get(FIELD_USERPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户自定义属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserPSDEFNameDirty(){
        if(this.contains(FIELD_USERPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户自定义属性
     */
    @JsonIgnore
    public void resetUserPSDEFName(){
        this.reset(FIELD_USERPSDEFNAME);
    }

    /**
     * 设置 用户自定义属性
     * <P>
     * 等同 {@link #setUserPSDEFName}
     * @param userPSDEFName
     */
    @JsonIgnore
    public PSSysMsgTempl userpsdefname(String userPSDEFName){
        this.setUserPSDEFName(userPSDEFName);
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
    public PSSysMsgTempl usertag(String userTag){
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
    public PSSysMsgTempl usertag2(String userTag2){
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
    public PSSysMsgTempl usertag3(String userTag3){
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
    public PSSysMsgTempl usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>WCCONTENT</B>&nbsp;微信内容，指定消息模板的微信内容
     */
    public final static String FIELD_WCCONTENT = "wccontent";

    /**
     * 设置 微信内容，详细说明：{@link #FIELD_WCCONTENT}
     * 
     * @param wCContent
     * 
     */
    @JsonProperty(FIELD_WCCONTENT)
    public void setWCContent(String wCContent){
        this.set(FIELD_WCCONTENT, wCContent);
    }
    
    /**
     * 获取 微信内容  
     * @return
     */
    @JsonIgnore
    public String getWCContent(){
        Object objValue = this.get(FIELD_WCCONTENT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 微信内容 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWCContentDirty(){
        if(this.contains(FIELD_WCCONTENT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 微信内容
     */
    @JsonIgnore
    public void resetWCContent(){
        this.reset(FIELD_WCCONTENT);
    }

    /**
     * 设置 微信内容，详细说明：{@link #FIELD_WCCONTENT}
     * <P>
     * 等同 {@link #setWCContent}
     * @param wCContent
     */
    @JsonIgnore
    public PSSysMsgTempl wccontent(String wCContent){
        this.setWCContent(wCContent);
        return this;
    }

    /**
     * <B>WXPSLANRESID</B>&nbsp;微信内容语言资源，指定消息模板的微信内容的多语言资源对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_WXPSLANRESID = "wxpslanresid";

    /**
     * 设置 微信内容语言资源，详细说明：{@link #FIELD_WXPSLANRESID}
     * 
     * @param wXPSLanResId
     * 
     */
    @JsonProperty(FIELD_WXPSLANRESID)
    public void setWXPSLanResId(String wXPSLanResId){
        this.set(FIELD_WXPSLANRESID, wXPSLanResId);
    }
    
    /**
     * 获取 微信内容语言资源  
     * @return
     */
    @JsonIgnore
    public String getWXPSLanResId(){
        Object objValue = this.get(FIELD_WXPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 微信内容语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWXPSLanResIdDirty(){
        if(this.contains(FIELD_WXPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 微信内容语言资源
     */
    @JsonIgnore
    public void resetWXPSLanResId(){
        this.reset(FIELD_WXPSLANRESID);
    }

    /**
     * 设置 微信内容语言资源，详细说明：{@link #FIELD_WXPSLANRESID}
     * <P>
     * 等同 {@link #setWXPSLanResId}
     * @param wXPSLanResId
     */
    @JsonIgnore
    public PSSysMsgTempl wxpslanresid(String wXPSLanResId){
        this.setWXPSLanResId(wXPSLanResId);
        return this;
    }

    /**
     * 设置 微信内容语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setWXPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSSysMsgTempl wxpslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setWXPSLanResId(null);
            this.setWXPSLanResName(null);
        }
        else{
            this.setWXPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setWXPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>WXPSLANRESNAME</B>&nbsp;微信内容语言资源，指定消息模板的微信内容的多语言资源对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_WXPSLANRESID}
     */
    public final static String FIELD_WXPSLANRESNAME = "wxpslanresname";

    /**
     * 设置 微信内容语言资源，详细说明：{@link #FIELD_WXPSLANRESNAME}
     * 
     * @param wXPSLanResName
     * 
     */
    @JsonProperty(FIELD_WXPSLANRESNAME)
    public void setWXPSLanResName(String wXPSLanResName){
        this.set(FIELD_WXPSLANRESNAME, wXPSLanResName);
    }
    
    /**
     * 获取 微信内容语言资源  
     * @return
     */
    @JsonIgnore
    public String getWXPSLanResName(){
        Object objValue = this.get(FIELD_WXPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 微信内容语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWXPSLanResNameDirty(){
        if(this.contains(FIELD_WXPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 微信内容语言资源
     */
    @JsonIgnore
    public void resetWXPSLanResName(){
        this.reset(FIELD_WXPSLANRESNAME);
    }

    /**
     * 设置 微信内容语言资源，详细说明：{@link #FIELD_WXPSLANRESNAME}
     * <P>
     * 等同 {@link #setWXPSLanResName}
     * @param wXPSLanResName
     */
    @JsonIgnore
    public PSSysMsgTempl wxpslanresname(String wXPSLanResName){
        this.setWXPSLanResName(wXPSLanResName);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysMsgTemplId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysMsgTemplId(strValue);
    }

    @JsonIgnore
    public PSSysMsgTempl id(String strValue){
        this.setPSSysMsgTemplId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysMsgTempl){
            PSSysMsgTempl model = (PSSysMsgTempl)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
