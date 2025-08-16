package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSVIEWMSG</B>视图消息 模型传输对象
 * <P>
 * 系统视图消息模型，支持定义静态及动态视图消息
 */
public class PSViewMsgDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSViewMsgDTO(){
    }      

    /**
     * <B>CACHESCOPE</B>&nbsp;缓存范围，指定动态视图消息的缓存范围，当前仅支持【全局】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.ViewMsgCacheScope} 
     */
    public final static String FIELD_CACHESCOPE = "cachescope";

    /**
     * 设置 缓存范围，详细说明：{@link #FIELD_CACHESCOPE}
     * 
     * @param cacheScope
     * 
     */
    @JsonProperty(FIELD_CACHESCOPE)
    public void setCacheScope(String cacheScope){
        this.set(FIELD_CACHESCOPE, cacheScope);
    }
    
    /**
     * 获取 缓存范围  
     * @return
     */
    @JsonIgnore
    public String getCacheScope(){
        Object objValue = this.get(FIELD_CACHESCOPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 缓存范围 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCacheScopeDirty(){
        if(this.contains(FIELD_CACHESCOPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 缓存范围
     */
    @JsonIgnore
    public void resetCacheScope(){
        this.reset(FIELD_CACHESCOPE);
    }

    /**
     * 设置 缓存范围，详细说明：{@link #FIELD_CACHESCOPE}
     * <P>
     * 等同 {@link #setCacheScope}
     * @param cacheScope
     */
    @JsonIgnore
    public PSViewMsgDTO cachescope(String cacheScope){
        this.setCacheScope(cacheScope);
        return this;
    }

     /**
     * 设置 缓存范围，详细说明：{@link #FIELD_CACHESCOPE}
     * <P>
     * 等同 {@link #setCacheScope}
     * @param cacheScope
     */
    @JsonIgnore
    public PSViewMsgDTO cachescope(net.ibizsys.model.PSModelEnums.ViewMsgCacheScope cacheScope){
        if(cacheScope == null){
            this.setCacheScope(null);
        }
        else{
            this.setCacheScope(cacheScope.value);
        }
        return this;
    }

    /**
     * <B>CACHETAG2PSDEFID</B>&nbsp;缓存标识2属性，指定动态视图消息缓存标记2的存储属性对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_CACHETAG2PSDEFID = "cachetag2psdefid";

    /**
     * 设置 缓存标识2属性，详细说明：{@link #FIELD_CACHETAG2PSDEFID}
     * 
     * @param cacheTag2PSDEFId
     * 
     */
    @JsonProperty(FIELD_CACHETAG2PSDEFID)
    public void setCacheTag2PSDEFId(String cacheTag2PSDEFId){
        this.set(FIELD_CACHETAG2PSDEFID, cacheTag2PSDEFId);
    }
    
    /**
     * 获取 缓存标识2属性  
     * @return
     */
    @JsonIgnore
    public String getCacheTag2PSDEFId(){
        Object objValue = this.get(FIELD_CACHETAG2PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 缓存标识2属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCacheTag2PSDEFIdDirty(){
        if(this.contains(FIELD_CACHETAG2PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 缓存标识2属性
     */
    @JsonIgnore
    public void resetCacheTag2PSDEFId(){
        this.reset(FIELD_CACHETAG2PSDEFID);
    }

    /**
     * 设置 缓存标识2属性，详细说明：{@link #FIELD_CACHETAG2PSDEFID}
     * <P>
     * 等同 {@link #setCacheTag2PSDEFId}
     * @param cacheTag2PSDEFId
     */
    @JsonIgnore
    public PSViewMsgDTO cachetag2psdefid(String cacheTag2PSDEFId){
        this.setCacheTag2PSDEFId(cacheTag2PSDEFId);
        return this;
    }

    /**
     * 设置 缓存标识2属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setCacheTag2PSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSViewMsgDTO cachetag2psdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setCacheTag2PSDEFId(null);
            this.setCacheTag2PSDEFName(null);
        }
        else{
            this.setCacheTag2PSDEFId(pSDEField.getPSDEFieldId());
            this.setCacheTag2PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>CACHETAG2PSDEFNAME</B>&nbsp;缓存标识2属性，指定动态视图消息缓存标记2的存储属性对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CACHETAG2PSDEFID}
     */
    public final static String FIELD_CACHETAG2PSDEFNAME = "cachetag2psdefname";

    /**
     * 设置 缓存标识2属性，详细说明：{@link #FIELD_CACHETAG2PSDEFNAME}
     * 
     * @param cacheTag2PSDEFName
     * 
     */
    @JsonProperty(FIELD_CACHETAG2PSDEFNAME)
    public void setCacheTag2PSDEFName(String cacheTag2PSDEFName){
        this.set(FIELD_CACHETAG2PSDEFNAME, cacheTag2PSDEFName);
    }
    
    /**
     * 获取 缓存标识2属性  
     * @return
     */
    @JsonIgnore
    public String getCacheTag2PSDEFName(){
        Object objValue = this.get(FIELD_CACHETAG2PSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 缓存标识2属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCacheTag2PSDEFNameDirty(){
        if(this.contains(FIELD_CACHETAG2PSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 缓存标识2属性
     */
    @JsonIgnore
    public void resetCacheTag2PSDEFName(){
        this.reset(FIELD_CACHETAG2PSDEFNAME);
    }

    /**
     * 设置 缓存标识2属性，详细说明：{@link #FIELD_CACHETAG2PSDEFNAME}
     * <P>
     * 等同 {@link #setCacheTag2PSDEFName}
     * @param cacheTag2PSDEFName
     */
    @JsonIgnore
    public PSViewMsgDTO cachetag2psdefname(String cacheTag2PSDEFName){
        this.setCacheTag2PSDEFName(cacheTag2PSDEFName);
        return this;
    }

    /**
     * <B>CACHETAGPSDEFID</B>&nbsp;缓存标识属性，指定动态视图消息缓存标记的存储属性对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_CACHETAGPSDEFID = "cachetagpsdefid";

    /**
     * 设置 缓存标识属性，详细说明：{@link #FIELD_CACHETAGPSDEFID}
     * 
     * @param cacheTagPSDEFId
     * 
     */
    @JsonProperty(FIELD_CACHETAGPSDEFID)
    public void setCacheTagPSDEFId(String cacheTagPSDEFId){
        this.set(FIELD_CACHETAGPSDEFID, cacheTagPSDEFId);
    }
    
    /**
     * 获取 缓存标识属性  
     * @return
     */
    @JsonIgnore
    public String getCacheTagPSDEFId(){
        Object objValue = this.get(FIELD_CACHETAGPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 缓存标识属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCacheTagPSDEFIdDirty(){
        if(this.contains(FIELD_CACHETAGPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 缓存标识属性
     */
    @JsonIgnore
    public void resetCacheTagPSDEFId(){
        this.reset(FIELD_CACHETAGPSDEFID);
    }

    /**
     * 设置 缓存标识属性，详细说明：{@link #FIELD_CACHETAGPSDEFID}
     * <P>
     * 等同 {@link #setCacheTagPSDEFId}
     * @param cacheTagPSDEFId
     */
    @JsonIgnore
    public PSViewMsgDTO cachetagpsdefid(String cacheTagPSDEFId){
        this.setCacheTagPSDEFId(cacheTagPSDEFId);
        return this;
    }

    /**
     * 设置 缓存标识属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setCacheTagPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSViewMsgDTO cachetagpsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setCacheTagPSDEFId(null);
            this.setCacheTagPSDEFName(null);
        }
        else{
            this.setCacheTagPSDEFId(pSDEField.getPSDEFieldId());
            this.setCacheTagPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>CACHETAGPSDEFNAME</B>&nbsp;缓存标识属性，指定动态视图消息缓存标记的存储属性对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CACHETAGPSDEFID}
     */
    public final static String FIELD_CACHETAGPSDEFNAME = "cachetagpsdefname";

    /**
     * 设置 缓存标识属性，详细说明：{@link #FIELD_CACHETAGPSDEFNAME}
     * 
     * @param cacheTagPSDEFName
     * 
     */
    @JsonProperty(FIELD_CACHETAGPSDEFNAME)
    public void setCacheTagPSDEFName(String cacheTagPSDEFName){
        this.set(FIELD_CACHETAGPSDEFNAME, cacheTagPSDEFName);
    }
    
    /**
     * 获取 缓存标识属性  
     * @return
     */
    @JsonIgnore
    public String getCacheTagPSDEFName(){
        Object objValue = this.get(FIELD_CACHETAGPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 缓存标识属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCacheTagPSDEFNameDirty(){
        if(this.contains(FIELD_CACHETAGPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 缓存标识属性
     */
    @JsonIgnore
    public void resetCacheTagPSDEFName(){
        this.reset(FIELD_CACHETAGPSDEFNAME);
    }

    /**
     * 设置 缓存标识属性，详细说明：{@link #FIELD_CACHETAGPSDEFNAME}
     * <P>
     * 等同 {@link #setCacheTagPSDEFName}
     * @param cacheTagPSDEFName
     */
    @JsonIgnore
    public PSViewMsgDTO cachetagpsdefname(String cacheTagPSDEFName){
        this.setCacheTagPSDEFName(cacheTagPSDEFName);
        return this;
    }

    /**
     * <B>CACHETIMEOUT</B>&nbsp;缓存失效时长，指定动态视图消息的缓存失效时长，单位为毫秒，-1为永不失效。未定义值时为【-1】
     */
    public final static String FIELD_CACHETIMEOUT = "cachetimeout";

    /**
     * 设置 缓存失效时长，详细说明：{@link #FIELD_CACHETIMEOUT}
     * 
     * @param cacheTimeout
     * 
     */
    @JsonProperty(FIELD_CACHETIMEOUT)
    public void setCacheTimeout(Integer cacheTimeout){
        this.set(FIELD_CACHETIMEOUT, cacheTimeout);
    }
    
    /**
     * 获取 缓存失效时长  
     * @return
     */
    @JsonIgnore
    public Integer getCacheTimeout(){
        Object objValue = this.get(FIELD_CACHETIMEOUT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 缓存失效时长 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCacheTimeoutDirty(){
        if(this.contains(FIELD_CACHETIMEOUT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 缓存失效时长
     */
    @JsonIgnore
    public void resetCacheTimeout(){
        this.reset(FIELD_CACHETIMEOUT);
    }

    /**
     * 设置 缓存失效时长，详细说明：{@link #FIELD_CACHETIMEOUT}
     * <P>
     * 等同 {@link #setCacheTimeout}
     * @param cacheTimeout
     */
    @JsonIgnore
    public PSViewMsgDTO cachetimeout(Integer cacheTimeout){
        this.setCacheTimeout(cacheTimeout);
        return this;
    }

    /**
     * <B>CLSPSDEFID</B>&nbsp;样式表属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_CLSPSDEFID = "clspsdefid";

    /**
     * 设置 样式表属性
     * 
     * @param clsPSDEFId
     * 
     */
    @JsonProperty(FIELD_CLSPSDEFID)
    public void setClsPSDEFId(String clsPSDEFId){
        this.set(FIELD_CLSPSDEFID, clsPSDEFId);
    }
    
    /**
     * 获取 样式表属性  
     * @return
     */
    @JsonIgnore
    public String getClsPSDEFId(){
        Object objValue = this.get(FIELD_CLSPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 样式表属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isClsPSDEFIdDirty(){
        if(this.contains(FIELD_CLSPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 样式表属性
     */
    @JsonIgnore
    public void resetClsPSDEFId(){
        this.reset(FIELD_CLSPSDEFID);
    }

    /**
     * 设置 样式表属性
     * <P>
     * 等同 {@link #setClsPSDEFId}
     * @param clsPSDEFId
     */
    @JsonIgnore
    public PSViewMsgDTO clspsdefid(String clsPSDEFId){
        this.setClsPSDEFId(clsPSDEFId);
        return this;
    }

    /**
     * 设置 样式表属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setClsPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSViewMsgDTO clspsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setClsPSDEFId(null);
            this.setClsPSDEFName(null);
        }
        else{
            this.setClsPSDEFId(pSDEField.getPSDEFieldId());
            this.setClsPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>CLSPSDEFNAME</B>&nbsp;样式表属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CLSPSDEFID}
     */
    public final static String FIELD_CLSPSDEFNAME = "clspsdefname";

    /**
     * 设置 样式表属性
     * 
     * @param clsPSDEFName
     * 
     */
    @JsonProperty(FIELD_CLSPSDEFNAME)
    public void setClsPSDEFName(String clsPSDEFName){
        this.set(FIELD_CLSPSDEFNAME, clsPSDEFName);
    }
    
    /**
     * 获取 样式表属性  
     * @return
     */
    @JsonIgnore
    public String getClsPSDEFName(){
        Object objValue = this.get(FIELD_CLSPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 样式表属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isClsPSDEFNameDirty(){
        if(this.contains(FIELD_CLSPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 样式表属性
     */
    @JsonIgnore
    public void resetClsPSDEFName(){
        this.reset(FIELD_CLSPSDEFNAME);
    }

    /**
     * 设置 样式表属性
     * <P>
     * 等同 {@link #setClsPSDEFName}
     * @param clsPSDEFName
     */
    @JsonIgnore
    public PSViewMsgDTO clspsdefname(String clsPSDEFName){
        this.setClsPSDEFName(clsPSDEFName);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定视图消息的代码标识，需要在所在的模型域（系统模块或系统）中具有唯一性
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
    public PSViewMsgDTO codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>CONTENT</B>&nbsp;内容，指定静态视图消息的内容
     * <P>
     * 字符串：最大长度 4000
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
    public PSViewMsgDTO content(String content){
        this.setContent(content);
        return this;
    }

    /**
     * <B>CONTENTPSDEFID</B>&nbsp;内容值属性，指定动态视图消息内容的存储属性对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_CONTENTPSDEFID = "contentpsdefid";

    /**
     * 设置 内容值属性，详细说明：{@link #FIELD_CONTENTPSDEFID}
     * 
     * @param contentPSDEFId
     * 
     */
    @JsonProperty(FIELD_CONTENTPSDEFID)
    public void setContentPSDEFId(String contentPSDEFId){
        this.set(FIELD_CONTENTPSDEFID, contentPSDEFId);
    }
    
    /**
     * 获取 内容值属性  
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
     * 判断 内容值属性 是否指定值，包括空值
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
     * 重置 内容值属性
     */
    @JsonIgnore
    public void resetContentPSDEFId(){
        this.reset(FIELD_CONTENTPSDEFID);
    }

    /**
     * 设置 内容值属性，详细说明：{@link #FIELD_CONTENTPSDEFID}
     * <P>
     * 等同 {@link #setContentPSDEFId}
     * @param contentPSDEFId
     */
    @JsonIgnore
    public PSViewMsgDTO contentpsdefid(String contentPSDEFId){
        this.setContentPSDEFId(contentPSDEFId);
        return this;
    }

    /**
     * 设置 内容值属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setContentPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSViewMsgDTO contentpsdefid(PSDEFieldDTO pSDEField){
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
     * <B>CONTENTPSDEFNAME</B>&nbsp;内容值属性，指定动态视图消息内容的存储属性对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CONTENTPSDEFID}
     */
    public final static String FIELD_CONTENTPSDEFNAME = "contentpsdefname";

    /**
     * 设置 内容值属性，详细说明：{@link #FIELD_CONTENTPSDEFNAME}
     * 
     * @param contentPSDEFName
     * 
     */
    @JsonProperty(FIELD_CONTENTPSDEFNAME)
    public void setContentPSDEFName(String contentPSDEFName){
        this.set(FIELD_CONTENTPSDEFNAME, contentPSDEFName);
    }
    
    /**
     * 获取 内容值属性  
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
     * 判断 内容值属性 是否指定值，包括空值
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
     * 重置 内容值属性
     */
    @JsonIgnore
    public void resetContentPSDEFName(){
        this.reset(FIELD_CONTENTPSDEFNAME);
    }

    /**
     * 设置 内容值属性，详细说明：{@link #FIELD_CONTENTPSDEFNAME}
     * <P>
     * 等同 {@link #setContentPSDEFName}
     * @param contentPSDEFName
     */
    @JsonIgnore
    public PSViewMsgDTO contentpsdefname(String contentPSDEFName){
        this.setContentPSDEFName(contentPSDEFName);
        return this;
    }

    /**
     * <B>CONTENTPSLANRESID</B>&nbsp;内容语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSLanguageResDTO} 
     */
    public final static String FIELD_CONTENTPSLANRESID = "contentpslanresid";

    /**
     * 设置 内容语言资源
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
     * 设置 内容语言资源
     * <P>
     * 等同 {@link #setContentPSLanResId}
     * @param contentPSLanResId
     */
    @JsonIgnore
    public PSViewMsgDTO contentpslanresid(String contentPSLanResId){
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
    public PSViewMsgDTO contentpslanresid(PSLanguageResDTO pSLanguageRes){
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
     * <B>CONTENTPSLANRESNAME</B>&nbsp;内容语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CONTENTPSLANRESID}
     */
    public final static String FIELD_CONTENTPSLANRESNAME = "contentpslanresname";

    /**
     * 设置 内容语言资源
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
     * 设置 内容语言资源
     * <P>
     * 等同 {@link #setContentPSLanResName}
     * @param contentPSLanResName
     */
    @JsonIgnore
    public PSViewMsgDTO contentpslanresname(String contentPSLanResName){
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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setCreateDate(Timestamp createDate){
        this.set(FIELD_CREATEDATE, createDate);
    }
    
    /**
     * 获取 建立时间  
     * @return
     */
    @JsonIgnore
    public Timestamp getCreateDate(){
        Object objValue = this.get(FIELD_CREATEDATE);
        if(objValue==null){
            return null;
        }
        return (Timestamp)objValue;
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
    public PSViewMsgDTO createdate(Timestamp createDate){
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
    public PSViewMsgDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DSLINK</B>&nbsp;数据源，指定动态视图消息的数据源
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DataSourceLink} 
     */
    public final static String FIELD_DSLINK = "dslink";

    /**
     * 设置 数据源，详细说明：{@link #FIELD_DSLINK}
     * 
     * @param dSLink
     * 
     */
    @JsonProperty(FIELD_DSLINK)
    public void setDSLink(String dSLink){
        this.set(FIELD_DSLINK, dSLink);
    }
    
    /**
     * 获取 数据源  
     * @return
     */
    @JsonIgnore
    public String getDSLink(){
        Object objValue = this.get(FIELD_DSLINK);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDSLinkDirty(){
        if(this.contains(FIELD_DSLINK)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据源
     */
    @JsonIgnore
    public void resetDSLink(){
        this.reset(FIELD_DSLINK);
    }

    /**
     * 设置 数据源，详细说明：{@link #FIELD_DSLINK}
     * <P>
     * 等同 {@link #setDSLink}
     * @param dSLink
     */
    @JsonIgnore
    public PSViewMsgDTO dslink(String dSLink){
        this.setDSLink(dSLink);
        return this;
    }

     /**
     * 设置 数据源，详细说明：{@link #FIELD_DSLINK}
     * <P>
     * 等同 {@link #setDSLink}
     * @param dSLink
     */
    @JsonIgnore
    public PSViewMsgDTO dslink(net.ibizsys.model.PSModelEnums.DataSourceLink dSLink){
        if(dSLink == null){
            this.setDSLink(null);
        }
        else{
            this.setDSLink(dSLink.value);
        }
        return this;
    }

    /**
     * <B>DYNAMICMODE</B>&nbsp;动态模式，指定视图消息的动态模式，未定义时为【静态内容】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.ViewMsgDynamicMode} 
     */
    public final static String FIELD_DYNAMICMODE = "dynamicmode";

    /**
     * 设置 动态模式，详细说明：{@link #FIELD_DYNAMICMODE}
     * 
     * @param dynamicMode
     * 
     */
    @JsonProperty(FIELD_DYNAMICMODE)
    public void setDynamicMode(Integer dynamicMode){
        this.set(FIELD_DYNAMICMODE, dynamicMode);
    }
    
    /**
     * 获取 动态模式  
     * @return
     */
    @JsonIgnore
    public Integer getDynamicMode(){
        Object objValue = this.get(FIELD_DYNAMICMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 动态模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDynamicModeDirty(){
        if(this.contains(FIELD_DYNAMICMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 动态模式
     */
    @JsonIgnore
    public void resetDynamicMode(){
        this.reset(FIELD_DYNAMICMODE);
    }

    /**
     * 设置 动态模式，详细说明：{@link #FIELD_DYNAMICMODE}
     * <P>
     * 等同 {@link #setDynamicMode}
     * @param dynamicMode
     */
    @JsonIgnore
    public PSViewMsgDTO dynamicmode(Integer dynamicMode){
        this.setDynamicMode(dynamicMode);
        return this;
    }

     /**
     * 设置 动态模式，详细说明：{@link #FIELD_DYNAMICMODE}
     * <P>
     * 等同 {@link #setDynamicMode}
     * @param dynamicMode
     */
    @JsonIgnore
    public PSViewMsgDTO dynamicmode(net.ibizsys.model.PSModelEnums.ViewMsgDynamicMode dynamicMode){
        if(dynamicMode == null){
            this.setDynamicMode(null);
        }
        else{
            this.setDynamicMode(dynamicMode.value);
        }
        return this;
    }

    /**
     * <B>ENABLECACHE</B>&nbsp;启用缓存，指定是否启用动态视图消息缓存，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLECACHE = "enablecache";

    /**
     * 设置 启用缓存，详细说明：{@link #FIELD_ENABLECACHE}
     * 
     * @param enableCache
     * 
     */
    @JsonProperty(FIELD_ENABLECACHE)
    public void setEnableCache(Integer enableCache){
        this.set(FIELD_ENABLECACHE, enableCache);
    }
    
    /**
     * 获取 启用缓存  
     * @return
     */
    @JsonIgnore
    public Integer getEnableCache(){
        Object objValue = this.get(FIELD_ENABLECACHE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用缓存 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableCacheDirty(){
        if(this.contains(FIELD_ENABLECACHE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用缓存
     */
    @JsonIgnore
    public void resetEnableCache(){
        this.reset(FIELD_ENABLECACHE);
    }

    /**
     * 设置 启用缓存，详细说明：{@link #FIELD_ENABLECACHE}
     * <P>
     * 等同 {@link #setEnableCache}
     * @param enableCache
     */
    @JsonIgnore
    public PSViewMsgDTO enablecache(Integer enableCache){
        this.setEnableCache(enableCache);
        return this;
    }

     /**
     * 设置 启用缓存，详细说明：{@link #FIELD_ENABLECACHE}
     * <P>
     * 等同 {@link #setEnableCache}
     * @param enableCache
     */
    @JsonIgnore
    public PSViewMsgDTO enablecache(Boolean enableCache){
        if(enableCache == null){
            this.setEnableCache(null);
        }
        else{
            this.setEnableCache(enableCache?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEREMOVE</B>&nbsp;关闭模式，指定视图消息的关闭模式，未定义时为【无关闭】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.ViewMsgRemoveMode} 
     */
    public final static String FIELD_ENABLEREMOVE = "enableremove";

    /**
     * 设置 关闭模式，详细说明：{@link #FIELD_ENABLEREMOVE}
     * 
     * @param enableRemove
     * 
     */
    @JsonProperty(FIELD_ENABLEREMOVE)
    public void setEnableRemove(Integer enableRemove){
        this.set(FIELD_ENABLEREMOVE, enableRemove);
    }
    
    /**
     * 获取 关闭模式  
     * @return
     */
    @JsonIgnore
    public Integer getEnableRemove(){
        Object objValue = this.get(FIELD_ENABLEREMOVE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 关闭模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableRemoveDirty(){
        if(this.contains(FIELD_ENABLEREMOVE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关闭模式
     */
    @JsonIgnore
    public void resetEnableRemove(){
        this.reset(FIELD_ENABLEREMOVE);
    }

    /**
     * 设置 关闭模式，详细说明：{@link #FIELD_ENABLEREMOVE}
     * <P>
     * 等同 {@link #setEnableRemove}
     * @param enableRemove
     */
    @JsonIgnore
    public PSViewMsgDTO enableremove(Integer enableRemove){
        this.setEnableRemove(enableRemove);
        return this;
    }

     /**
     * 设置 关闭模式，详细说明：{@link #FIELD_ENABLEREMOVE}
     * <P>
     * 等同 {@link #setEnableRemove}
     * @param enableRemove
     */
    @JsonIgnore
    public PSViewMsgDTO enableremove(net.ibizsys.model.PSModelEnums.ViewMsgRemoveMode enableRemove){
        if(enableRemove == null){
            this.setEnableRemove(null);
        }
        else{
            this.setEnableRemove(enableRemove.value);
        }
        return this;
    }

    /**
     * <B>GROUPPSDEFID</B>&nbsp;消息分组值属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_GROUPPSDEFID = "grouppsdefid";

    /**
     * 设置 消息分组值属性
     * 
     * @param groupPSDEFId
     * 
     */
    @JsonProperty(FIELD_GROUPPSDEFID)
    public void setGroupPSDEFId(String groupPSDEFId){
        this.set(FIELD_GROUPPSDEFID, groupPSDEFId);
    }
    
    /**
     * 获取 消息分组值属性  
     * @return
     */
    @JsonIgnore
    public String getGroupPSDEFId(){
        Object objValue = this.get(FIELD_GROUPPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 消息分组值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSDEFIdDirty(){
        if(this.contains(FIELD_GROUPPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 消息分组值属性
     */
    @JsonIgnore
    public void resetGroupPSDEFId(){
        this.reset(FIELD_GROUPPSDEFID);
    }

    /**
     * 设置 消息分组值属性
     * <P>
     * 等同 {@link #setGroupPSDEFId}
     * @param groupPSDEFId
     */
    @JsonIgnore
    public PSViewMsgDTO grouppsdefid(String groupPSDEFId){
        this.setGroupPSDEFId(groupPSDEFId);
        return this;
    }

    /**
     * 设置 消息分组值属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setGroupPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSViewMsgDTO grouppsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setGroupPSDEFId(null);
            this.setGroupPSDEFName(null);
        }
        else{
            this.setGroupPSDEFId(pSDEField.getPSDEFieldId());
            this.setGroupPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>GROUPPSDEFNAME</B>&nbsp;消息分组值属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GROUPPSDEFID}
     */
    public final static String FIELD_GROUPPSDEFNAME = "grouppsdefname";

    /**
     * 设置 消息分组值属性
     * 
     * @param groupPSDEFName
     * 
     */
    @JsonProperty(FIELD_GROUPPSDEFNAME)
    public void setGroupPSDEFName(String groupPSDEFName){
        this.set(FIELD_GROUPPSDEFNAME, groupPSDEFName);
    }
    
    /**
     * 获取 消息分组值属性  
     * @return
     */
    @JsonIgnore
    public String getGroupPSDEFName(){
        Object objValue = this.get(FIELD_GROUPPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 消息分组值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSDEFNameDirty(){
        if(this.contains(FIELD_GROUPPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 消息分组值属性
     */
    @JsonIgnore
    public void resetGroupPSDEFName(){
        this.reset(FIELD_GROUPPSDEFNAME);
    }

    /**
     * 设置 消息分组值属性
     * <P>
     * 等同 {@link #setGroupPSDEFName}
     * @param groupPSDEFName
     */
    @JsonIgnore
    public PSViewMsgDTO grouppsdefname(String groupPSDEFName){
        this.setGroupPSDEFName(groupPSDEFName);
        return this;
    }

    /**
     * <B>ICONPSDEFID</B>&nbsp;图标属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_ICONPSDEFID = "iconpsdefid";

    /**
     * 设置 图标属性
     * 
     * @param iconPSDEFId
     * 
     */
    @JsonProperty(FIELD_ICONPSDEFID)
    public void setIconPSDEFId(String iconPSDEFId){
        this.set(FIELD_ICONPSDEFID, iconPSDEFId);
    }
    
    /**
     * 获取 图标属性  
     * @return
     */
    @JsonIgnore
    public String getIconPSDEFId(){
        Object objValue = this.get(FIELD_ICONPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 图标属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIconPSDEFIdDirty(){
        if(this.contains(FIELD_ICONPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图标属性
     */
    @JsonIgnore
    public void resetIconPSDEFId(){
        this.reset(FIELD_ICONPSDEFID);
    }

    /**
     * 设置 图标属性
     * <P>
     * 等同 {@link #setIconPSDEFId}
     * @param iconPSDEFId
     */
    @JsonIgnore
    public PSViewMsgDTO iconpsdefid(String iconPSDEFId){
        this.setIconPSDEFId(iconPSDEFId);
        return this;
    }

    /**
     * 设置 图标属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setIconPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSViewMsgDTO iconpsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setIconPSDEFId(null);
            this.setIconPSDEFName(null);
        }
        else{
            this.setIconPSDEFId(pSDEField.getPSDEFieldId());
            this.setIconPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>ICONPSDEFNAME</B>&nbsp;图标属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ICONPSDEFID}
     */
    public final static String FIELD_ICONPSDEFNAME = "iconpsdefname";

    /**
     * 设置 图标属性
     * 
     * @param iconPSDEFName
     * 
     */
    @JsonProperty(FIELD_ICONPSDEFNAME)
    public void setIconPSDEFName(String iconPSDEFName){
        this.set(FIELD_ICONPSDEFNAME, iconPSDEFName);
    }
    
    /**
     * 获取 图标属性  
     * @return
     */
    @JsonIgnore
    public String getIconPSDEFName(){
        Object objValue = this.get(FIELD_ICONPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 图标属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIconPSDEFNameDirty(){
        if(this.contains(FIELD_ICONPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图标属性
     */
    @JsonIgnore
    public void resetIconPSDEFName(){
        this.reset(FIELD_ICONPSDEFNAME);
    }

    /**
     * 设置 图标属性
     * <P>
     * 等同 {@link #setIconPSDEFName}
     * @param iconPSDEFName
     */
    @JsonIgnore
    public PSViewMsgDTO iconpsdefname(String iconPSDEFName){
        this.setIconPSDEFName(iconPSDEFName);
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
    public PSViewMsgDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MSGGROUP</B>&nbsp;消息分组
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_MSGGROUP = "msggroup";

    /**
     * 设置 消息分组
     * 
     * @param msgGroup
     * 
     */
    @JsonProperty(FIELD_MSGGROUP)
    public void setMsgGroup(String msgGroup){
        this.set(FIELD_MSGGROUP, msgGroup);
    }
    
    /**
     * 获取 消息分组  
     * @return
     */
    @JsonIgnore
    public String getMsgGroup(){
        Object objValue = this.get(FIELD_MSGGROUP);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 消息分组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMsgGroupDirty(){
        if(this.contains(FIELD_MSGGROUP)){
            return true;
        }
        return false;
    }

    /**
     * 重置 消息分组
     */
    @JsonIgnore
    public void resetMsgGroup(){
        this.reset(FIELD_MSGGROUP);
    }

    /**
     * 设置 消息分组
     * <P>
     * 等同 {@link #setMsgGroup}
     * @param msgGroup
     */
    @JsonIgnore
    public PSViewMsgDTO msggroup(String msgGroup){
        this.setMsgGroup(msgGroup);
        return this;
    }

    /**
     * <B>MSGPOS</B>&nbsp;默认消息位置，指定视图消息的显示位置，动态消息在显示位置未指定值时默认使用此配置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.ViewMsgPos} 
     */
    public final static String FIELD_MSGPOS = "msgpos";

    /**
     * 设置 默认消息位置，详细说明：{@link #FIELD_MSGPOS}
     * 
     * @param msgPos
     * 
     */
    @JsonProperty(FIELD_MSGPOS)
    public void setMsgPos(String msgPos){
        this.set(FIELD_MSGPOS, msgPos);
    }
    
    /**
     * 获取 默认消息位置  
     * @return
     */
    @JsonIgnore
    public String getMsgPos(){
        Object objValue = this.get(FIELD_MSGPOS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认消息位置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMsgPosDirty(){
        if(this.contains(FIELD_MSGPOS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认消息位置
     */
    @JsonIgnore
    public void resetMsgPos(){
        this.reset(FIELD_MSGPOS);
    }

    /**
     * 设置 默认消息位置，详细说明：{@link #FIELD_MSGPOS}
     * <P>
     * 等同 {@link #setMsgPos}
     * @param msgPos
     */
    @JsonIgnore
    public PSViewMsgDTO msgpos(String msgPos){
        this.setMsgPos(msgPos);
        return this;
    }

     /**
     * 设置 默认消息位置，详细说明：{@link #FIELD_MSGPOS}
     * <P>
     * 等同 {@link #setMsgPos}
     * @param msgPos
     */
    @JsonIgnore
    public PSViewMsgDTO msgpos(net.ibizsys.model.PSModelEnums.ViewMsgPos msgPos){
        if(msgPos == null){
            this.setMsgPos(null);
        }
        else{
            this.setMsgPos(msgPos.value);
        }
        return this;
    }

    /**
     * <B>MSGPOSPSDEFID</B>&nbsp;消息位置值属性，指定动态视图消息消息位置的存储属性对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_MSGPOSPSDEFID = "msgpospsdefid";

    /**
     * 设置 消息位置值属性，详细说明：{@link #FIELD_MSGPOSPSDEFID}
     * 
     * @param msgPosPSDEFId
     * 
     */
    @JsonProperty(FIELD_MSGPOSPSDEFID)
    public void setMsgPosPSDEFId(String msgPosPSDEFId){
        this.set(FIELD_MSGPOSPSDEFID, msgPosPSDEFId);
    }
    
    /**
     * 获取 消息位置值属性  
     * @return
     */
    @JsonIgnore
    public String getMsgPosPSDEFId(){
        Object objValue = this.get(FIELD_MSGPOSPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 消息位置值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMsgPosPSDEFIdDirty(){
        if(this.contains(FIELD_MSGPOSPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 消息位置值属性
     */
    @JsonIgnore
    public void resetMsgPosPSDEFId(){
        this.reset(FIELD_MSGPOSPSDEFID);
    }

    /**
     * 设置 消息位置值属性，详细说明：{@link #FIELD_MSGPOSPSDEFID}
     * <P>
     * 等同 {@link #setMsgPosPSDEFId}
     * @param msgPosPSDEFId
     */
    @JsonIgnore
    public PSViewMsgDTO msgpospsdefid(String msgPosPSDEFId){
        this.setMsgPosPSDEFId(msgPosPSDEFId);
        return this;
    }

    /**
     * 设置 消息位置值属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMsgPosPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSViewMsgDTO msgpospsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setMsgPosPSDEFId(null);
            this.setMsgPosPSDEFName(null);
        }
        else{
            this.setMsgPosPSDEFId(pSDEField.getPSDEFieldId());
            this.setMsgPosPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>MSGPOSPSDEFNAME</B>&nbsp;消息位置值属性，指定动态视图消息消息位置的存储属性对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MSGPOSPSDEFID}
     */
    public final static String FIELD_MSGPOSPSDEFNAME = "msgpospsdefname";

    /**
     * 设置 消息位置值属性，详细说明：{@link #FIELD_MSGPOSPSDEFNAME}
     * 
     * @param msgPosPSDEFName
     * 
     */
    @JsonProperty(FIELD_MSGPOSPSDEFNAME)
    public void setMsgPosPSDEFName(String msgPosPSDEFName){
        this.set(FIELD_MSGPOSPSDEFNAME, msgPosPSDEFName);
    }
    
    /**
     * 获取 消息位置值属性  
     * @return
     */
    @JsonIgnore
    public String getMsgPosPSDEFName(){
        Object objValue = this.get(FIELD_MSGPOSPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 消息位置值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMsgPosPSDEFNameDirty(){
        if(this.contains(FIELD_MSGPOSPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 消息位置值属性
     */
    @JsonIgnore
    public void resetMsgPosPSDEFName(){
        this.reset(FIELD_MSGPOSPSDEFNAME);
    }

    /**
     * 设置 消息位置值属性，详细说明：{@link #FIELD_MSGPOSPSDEFNAME}
     * <P>
     * 等同 {@link #setMsgPosPSDEFName}
     * @param msgPosPSDEFName
     */
    @JsonIgnore
    public PSViewMsgDTO msgpospsdefname(String msgPosPSDEFName){
        this.setMsgPosPSDEFName(msgPosPSDEFName);
        return this;
    }

    /**
     * <B>MSGTYPE</B>&nbsp;消息类型，指定视图消息的类型，动态消息在消息类型未指定值时默认使用此配置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.ViewMsgType} 
     */
    public final static String FIELD_MSGTYPE = "msgtype";

    /**
     * 设置 消息类型，详细说明：{@link #FIELD_MSGTYPE}
     * 
     * @param msgType
     * 
     */
    @JsonProperty(FIELD_MSGTYPE)
    public void setMsgType(String msgType){
        this.set(FIELD_MSGTYPE, msgType);
    }
    
    /**
     * 获取 消息类型  
     * @return
     */
    @JsonIgnore
    public String getMsgType(){
        Object objValue = this.get(FIELD_MSGTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 消息类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMsgTypeDirty(){
        if(this.contains(FIELD_MSGTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 消息类型
     */
    @JsonIgnore
    public void resetMsgType(){
        this.reset(FIELD_MSGTYPE);
    }

    /**
     * 设置 消息类型，详细说明：{@link #FIELD_MSGTYPE}
     * <P>
     * 等同 {@link #setMsgType}
     * @param msgType
     */
    @JsonIgnore
    public PSViewMsgDTO msgtype(String msgType){
        this.setMsgType(msgType);
        return this;
    }

     /**
     * 设置 消息类型，详细说明：{@link #FIELD_MSGTYPE}
     * <P>
     * 等同 {@link #setMsgType}
     * @param msgType
     */
    @JsonIgnore
    public PSViewMsgDTO msgtype(net.ibizsys.model.PSModelEnums.ViewMsgType msgType){
        if(msgType == null){
            this.setMsgType(null);
        }
        else{
            this.setMsgType(msgType.value);
        }
        return this;
    }

    /**
     * <B>MSGTYPEPSDEFID</B>&nbsp;消息类型值属性，指定动态视图消息消息类型的存储属性对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_MSGTYPEPSDEFID = "msgtypepsdefid";

    /**
     * 设置 消息类型值属性，详细说明：{@link #FIELD_MSGTYPEPSDEFID}
     * 
     * @param msgTypePSDEFId
     * 
     */
    @JsonProperty(FIELD_MSGTYPEPSDEFID)
    public void setMsgTypePSDEFId(String msgTypePSDEFId){
        this.set(FIELD_MSGTYPEPSDEFID, msgTypePSDEFId);
    }
    
    /**
     * 获取 消息类型值属性  
     * @return
     */
    @JsonIgnore
    public String getMsgTypePSDEFId(){
        Object objValue = this.get(FIELD_MSGTYPEPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 消息类型值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMsgTypePSDEFIdDirty(){
        if(this.contains(FIELD_MSGTYPEPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 消息类型值属性
     */
    @JsonIgnore
    public void resetMsgTypePSDEFId(){
        this.reset(FIELD_MSGTYPEPSDEFID);
    }

    /**
     * 设置 消息类型值属性，详细说明：{@link #FIELD_MSGTYPEPSDEFID}
     * <P>
     * 等同 {@link #setMsgTypePSDEFId}
     * @param msgTypePSDEFId
     */
    @JsonIgnore
    public PSViewMsgDTO msgtypepsdefid(String msgTypePSDEFId){
        this.setMsgTypePSDEFId(msgTypePSDEFId);
        return this;
    }

    /**
     * 设置 消息类型值属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMsgTypePSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSViewMsgDTO msgtypepsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setMsgTypePSDEFId(null);
            this.setMsgTypePSDEFName(null);
        }
        else{
            this.setMsgTypePSDEFId(pSDEField.getPSDEFieldId());
            this.setMsgTypePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>MSGTYPEPSDEFNAME</B>&nbsp;消息类型值属性，指定动态视图消息消息类型的存储属性对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MSGTYPEPSDEFID}
     */
    public final static String FIELD_MSGTYPEPSDEFNAME = "msgtypepsdefname";

    /**
     * 设置 消息类型值属性，详细说明：{@link #FIELD_MSGTYPEPSDEFNAME}
     * 
     * @param msgTypePSDEFName
     * 
     */
    @JsonProperty(FIELD_MSGTYPEPSDEFNAME)
    public void setMsgTypePSDEFName(String msgTypePSDEFName){
        this.set(FIELD_MSGTYPEPSDEFNAME, msgTypePSDEFName);
    }
    
    /**
     * 获取 消息类型值属性  
     * @return
     */
    @JsonIgnore
    public String getMsgTypePSDEFName(){
        Object objValue = this.get(FIELD_MSGTYPEPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 消息类型值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMsgTypePSDEFNameDirty(){
        if(this.contains(FIELD_MSGTYPEPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 消息类型值属性
     */
    @JsonIgnore
    public void resetMsgTypePSDEFName(){
        this.reset(FIELD_MSGTYPEPSDEFNAME);
    }

    /**
     * 设置 消息类型值属性，详细说明：{@link #FIELD_MSGTYPEPSDEFNAME}
     * <P>
     * 等同 {@link #setMsgTypePSDEFName}
     * @param msgTypePSDEFName
     */
    @JsonIgnore
    public PSViewMsgDTO msgtypepsdefname(String msgTypePSDEFName){
        this.setMsgTypePSDEFName(msgTypePSDEFName);
        return this;
    }

    /**
     * <B>ORDERVALUEPSDEFID</B>&nbsp;排序值属性，指定动态视图消息显示排序值的存储属性对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_ORDERVALUEPSDEFID = "ordervaluepsdefid";

    /**
     * 设置 排序值属性，详细说明：{@link #FIELD_ORDERVALUEPSDEFID}
     * 
     * @param orderValuePSDEFId
     * 
     */
    @JsonProperty(FIELD_ORDERVALUEPSDEFID)
    public void setOrderValuePSDEFId(String orderValuePSDEFId){
        this.set(FIELD_ORDERVALUEPSDEFID, orderValuePSDEFId);
    }
    
    /**
     * 获取 排序值属性  
     * @return
     */
    @JsonIgnore
    public String getOrderValuePSDEFId(){
        Object objValue = this.get(FIELD_ORDERVALUEPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 排序值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOrderValuePSDEFIdDirty(){
        if(this.contains(FIELD_ORDERVALUEPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 排序值属性
     */
    @JsonIgnore
    public void resetOrderValuePSDEFId(){
        this.reset(FIELD_ORDERVALUEPSDEFID);
    }

    /**
     * 设置 排序值属性，详细说明：{@link #FIELD_ORDERVALUEPSDEFID}
     * <P>
     * 等同 {@link #setOrderValuePSDEFId}
     * @param orderValuePSDEFId
     */
    @JsonIgnore
    public PSViewMsgDTO ordervaluepsdefid(String orderValuePSDEFId){
        this.setOrderValuePSDEFId(orderValuePSDEFId);
        return this;
    }

    /**
     * 设置 排序值属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setOrderValuePSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSViewMsgDTO ordervaluepsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setOrderValuePSDEFId(null);
            this.setOrderValuePSDEFName(null);
        }
        else{
            this.setOrderValuePSDEFId(pSDEField.getPSDEFieldId());
            this.setOrderValuePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>ORDERVALUEPSDEFNAME</B>&nbsp;排序值属性，指定动态视图消息显示排序值的存储属性对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ORDERVALUEPSDEFID}
     */
    public final static String FIELD_ORDERVALUEPSDEFNAME = "ordervaluepsdefname";

    /**
     * 设置 排序值属性，详细说明：{@link #FIELD_ORDERVALUEPSDEFNAME}
     * 
     * @param orderValuePSDEFName
     * 
     */
    @JsonProperty(FIELD_ORDERVALUEPSDEFNAME)
    public void setOrderValuePSDEFName(String orderValuePSDEFName){
        this.set(FIELD_ORDERVALUEPSDEFNAME, orderValuePSDEFName);
    }
    
    /**
     * 获取 排序值属性  
     * @return
     */
    @JsonIgnore
    public String getOrderValuePSDEFName(){
        Object objValue = this.get(FIELD_ORDERVALUEPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 排序值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOrderValuePSDEFNameDirty(){
        if(this.contains(FIELD_ORDERVALUEPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 排序值属性
     */
    @JsonIgnore
    public void resetOrderValuePSDEFName(){
        this.reset(FIELD_ORDERVALUEPSDEFNAME);
    }

    /**
     * 设置 排序值属性，详细说明：{@link #FIELD_ORDERVALUEPSDEFNAME}
     * <P>
     * 等同 {@link #setOrderValuePSDEFName}
     * @param orderValuePSDEFName
     */
    @JsonIgnore
    public PSViewMsgDTO ordervaluepsdefname(String orderValuePSDEFName){
        this.setOrderValuePSDEFName(orderValuePSDEFName);
        return this;
    }

    /**
     * <B>PSDEDSID</B>&nbsp;实体数据集，指定动态视图消息的数据源实体数据集对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO} 
     */
    public final static String FIELD_PSDEDSID = "psdedsid";

    /**
     * 设置 实体数据集，详细说明：{@link #FIELD_PSDEDSID}
     * 
     * @param pSDEDSId
     * 
     */
    @JsonProperty(FIELD_PSDEDSID)
    public void setPSDEDSId(String pSDEDSId){
        this.set(FIELD_PSDEDSID, pSDEDSId);
    }
    
    /**
     * 获取 实体数据集  
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
     * 判断 实体数据集 是否指定值，包括空值
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
     * 重置 实体数据集
     */
    @JsonIgnore
    public void resetPSDEDSId(){
        this.reset(FIELD_PSDEDSID);
    }

    /**
     * 设置 实体数据集，详细说明：{@link #FIELD_PSDEDSID}
     * <P>
     * 等同 {@link #setPSDEDSId}
     * @param pSDEDSId
     */
    @JsonIgnore
    public PSViewMsgDTO psdedsid(String pSDEDSId){
        this.setPSDEDSId(pSDEDSId);
        return this;
    }

    /**
     * 设置 实体数据集，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDSId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSViewMsgDTO psdedsid(PSDEDataSetDTO pSDEDataSet){
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
     * <B>PSDEDSNAME</B>&nbsp;实体数据集，指定动态视图消息的数据源实体数据集对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDSID}
     */
    public final static String FIELD_PSDEDSNAME = "psdedsname";

    /**
     * 设置 实体数据集，详细说明：{@link #FIELD_PSDEDSNAME}
     * 
     * @param pSDEDSName
     * 
     */
    @JsonProperty(FIELD_PSDEDSNAME)
    public void setPSDEDSName(String pSDEDSName){
        this.set(FIELD_PSDEDSNAME, pSDEDSName);
    }
    
    /**
     * 获取 实体数据集  
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
     * 判断 实体数据集 是否指定值，包括空值
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
     * 重置 实体数据集
     */
    @JsonIgnore
    public void resetPSDEDSName(){
        this.reset(FIELD_PSDEDSNAME);
    }

    /**
     * 设置 实体数据集，详细说明：{@link #FIELD_PSDEDSNAME}
     * <P>
     * 等同 {@link #setPSDEDSName}
     * @param pSDEDSName
     */
    @JsonIgnore
    public PSViewMsgDTO psdedsname(String pSDEDSName){
        this.setPSDEDSName(pSDEDSName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定动态视图消息的数据集对象所在实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDataEntityDTO} 
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 实体，详细说明：{@link #FIELD_PSDEID}
     * 
     * @param pSDEId
     * 
     */
    @JsonProperty(FIELD_PSDEID)
    public void setPSDEId(String pSDEId){
        this.set(FIELD_PSDEID, pSDEId);
    }
    
    /**
     * 获取 实体  
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
     * 判断 实体 是否指定值，包括空值
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
     * 重置 实体
     */
    @JsonIgnore
    public void resetPSDEId(){
        this.reset(FIELD_PSDEID);
    }

    /**
     * 设置 实体，详细说明：{@link #FIELD_PSDEID}
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSViewMsgDTO psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * 设置 实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSViewMsgDTO psdeid(PSDataEntityDTO pSDataEntity){
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
     * <B>PSDELOGICID</B>&nbsp;上下文数据逻辑，指定动态视图消息的数据查询上下文转换逻辑对象，上下文转换逻辑负责将当前会话的变量转换为数据查询条件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDELogicDTO} 
     */
    public final static String FIELD_PSDELOGICID = "psdelogicid";

    /**
     * 设置 上下文数据逻辑，详细说明：{@link #FIELD_PSDELOGICID}
     * 
     * @param pSDELogicId
     * 
     */
    @JsonProperty(FIELD_PSDELOGICID)
    public void setPSDELogicId(String pSDELogicId){
        this.set(FIELD_PSDELOGICID, pSDELogicId);
    }
    
    /**
     * 获取 上下文数据逻辑  
     * @return
     */
    @JsonIgnore
    public String getPSDELogicId(){
        Object objValue = this.get(FIELD_PSDELOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 上下文数据逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDELogicIdDirty(){
        if(this.contains(FIELD_PSDELOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 上下文数据逻辑
     */
    @JsonIgnore
    public void resetPSDELogicId(){
        this.reset(FIELD_PSDELOGICID);
    }

    /**
     * 设置 上下文数据逻辑，详细说明：{@link #FIELD_PSDELOGICID}
     * <P>
     * 等同 {@link #setPSDELogicId}
     * @param pSDELogicId
     */
    @JsonIgnore
    public PSViewMsgDTO psdelogicid(String pSDELogicId){
        this.setPSDELogicId(pSDELogicId);
        return this;
    }

    /**
     * 设置 上下文数据逻辑，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDELogicId}
     * @param pSDELogic 引用对象
     */
    @JsonIgnore
    public PSViewMsgDTO psdelogicid(PSDELogicDTO pSDELogic){
        if(pSDELogic == null){
            this.setPSDELogicId(null);
            this.setPSDELogicName(null);
        }
        else{
            this.setPSDELogicId(pSDELogic.getPSDELogicId());
            this.setPSDELogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    /**
     * <B>PSDELOGICNAME</B>&nbsp;上下文数据逻辑，指定动态视图消息的数据查询上下文转换逻辑对象，上下文转换逻辑负责将当前会话的变量转换为数据查询条件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDELOGICID}
     */
    public final static String FIELD_PSDELOGICNAME = "psdelogicname";

    /**
     * 设置 上下文数据逻辑，详细说明：{@link #FIELD_PSDELOGICNAME}
     * 
     * @param pSDELogicName
     * 
     */
    @JsonProperty(FIELD_PSDELOGICNAME)
    public void setPSDELogicName(String pSDELogicName){
        this.set(FIELD_PSDELOGICNAME, pSDELogicName);
    }
    
    /**
     * 获取 上下文数据逻辑  
     * @return
     */
    @JsonIgnore
    public String getPSDELogicName(){
        Object objValue = this.get(FIELD_PSDELOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 上下文数据逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDELogicNameDirty(){
        if(this.contains(FIELD_PSDELOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 上下文数据逻辑
     */
    @JsonIgnore
    public void resetPSDELogicName(){
        this.reset(FIELD_PSDELOGICNAME);
    }

    /**
     * 设置 上下文数据逻辑，详细说明：{@link #FIELD_PSDELOGICNAME}
     * <P>
     * 等同 {@link #setPSDELogicName}
     * @param pSDELogicName
     */
    @JsonIgnore
    public PSViewMsgDTO psdelogicname(String pSDELogicName){
        this.setPSDELogicName(pSDELogicName);
        return this;
    }

    /**
     * <B>PSDENAME</B>&nbsp;实体，指定动态视图消息的数据集对象所在实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_PSDENAME = "psdename";

    /**
     * 设置 实体，详细说明：{@link #FIELD_PSDENAME}
     * 
     * @param pSDEName
     * 
     */
    @JsonProperty(FIELD_PSDENAME)
    public void setPSDEName(String pSDEName){
        this.set(FIELD_PSDENAME, pSDEName);
    }
    
    /**
     * 获取 实体  
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
     * 判断 实体 是否指定值，包括空值
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
     * 重置 实体
     */
    @JsonIgnore
    public void resetPSDEName(){
        this.reset(FIELD_PSDENAME);
    }

    /**
     * 设置 实体，详细说明：{@link #FIELD_PSDENAME}
     * <P>
     * 等同 {@link #setPSDEName}
     * @param pSDEName
     */
    @JsonIgnore
    public PSViewMsgDTO psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定视图消息所在的系统模块
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSModuleDTO} 
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
    public PSViewMsgDTO psmoduleid(String pSModuleId){
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
    public PSViewMsgDTO psmoduleid(PSModuleDTO pSModule){
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
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定视图消息所在的系统模块
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
    public PSViewMsgDTO psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSYSCSSID</B>&nbsp;消息样式表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysCssDTO} 
     */
    public final static String FIELD_PSSYSCSSID = "pssyscssid";

    /**
     * 设置 消息样式表
     * 
     * @param pSSysCssId
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSID)
    public void setPSSysCssId(String pSSysCssId){
        this.set(FIELD_PSSYSCSSID, pSSysCssId);
    }
    
    /**
     * 获取 消息样式表  
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
     * 判断 消息样式表 是否指定值，包括空值
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
     * 重置 消息样式表
     */
    @JsonIgnore
    public void resetPSSysCssId(){
        this.reset(FIELD_PSSYSCSSID);
    }

    /**
     * 设置 消息样式表
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCssId
     */
    @JsonIgnore
    public PSViewMsgDTO pssyscssid(String pSSysCssId){
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    /**
     * 设置 消息样式表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSViewMsgDTO pssyscssid(PSSysCssDTO pSSysCss){
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
     * <B>PSSYSCSSNAME</B>&nbsp;消息样式表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSCSSID}
     */
    public final static String FIELD_PSSYSCSSNAME = "pssyscssname";

    /**
     * 设置 消息样式表
     * 
     * @param pSSysCssName
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSNAME)
    public void setPSSysCssName(String pSSysCssName){
        this.set(FIELD_PSSYSCSSNAME, pSSysCssName);
    }
    
    /**
     * 获取 消息样式表  
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
     * 判断 消息样式表 是否指定值，包括空值
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
     * 重置 消息样式表
     */
    @JsonIgnore
    public void resetPSSysCssName(){
        this.reset(FIELD_PSSYSCSSNAME);
    }

    /**
     * 设置 消息样式表
     * <P>
     * 等同 {@link #setPSSysCssName}
     * @param pSSysCssName
     */
    @JsonIgnore
    public PSViewMsgDTO pssyscssname(String pSSysCssName){
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELID</B>&nbsp;动态系统模型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysDynaModelDTO} 
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
    public PSViewMsgDTO pssysdynamodelid(String pSSysDynaModelId){
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
    public PSViewMsgDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel){
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
    public PSViewMsgDTO pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSSYSIMAGEID</B>&nbsp;消息图标
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysImageDTO} 
     */
    public final static String FIELD_PSSYSIMAGEID = "pssysimageid";

    /**
     * 设置 消息图标
     * 
     * @param pSSysImageId
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGEID)
    public void setPSSysImageId(String pSSysImageId){
        this.set(FIELD_PSSYSIMAGEID, pSSysImageId);
    }
    
    /**
     * 获取 消息图标  
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
     * 判断 消息图标 是否指定值，包括空值
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
     * 重置 消息图标
     */
    @JsonIgnore
    public void resetPSSysImageId(){
        this.reset(FIELD_PSSYSIMAGEID);
    }

    /**
     * 设置 消息图标
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImageId
     */
    @JsonIgnore
    public PSViewMsgDTO pssysimageid(String pSSysImageId){
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    /**
     * 设置 消息图标，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImage 引用对象
     */
    @JsonIgnore
    public PSViewMsgDTO pssysimageid(PSSysImageDTO pSSysImage){
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
     * <B>PSSYSIMAGENAME</B>&nbsp;消息图标
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSIMAGEID}
     */
    public final static String FIELD_PSSYSIMAGENAME = "pssysimagename";

    /**
     * 设置 消息图标
     * 
     * @param pSSysImageName
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGENAME)
    public void setPSSysImageName(String pSSysImageName){
        this.set(FIELD_PSSYSIMAGENAME, pSSysImageName);
    }
    
    /**
     * 获取 消息图标  
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
     * 判断 消息图标 是否指定值，包括空值
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
     * 重置 消息图标
     */
    @JsonIgnore
    public void resetPSSysImageName(){
        this.reset(FIELD_PSSYSIMAGENAME);
    }

    /**
     * 设置 消息图标
     * <P>
     * 等同 {@link #setPSSysImageName}
     * @param pSSysImageName
     */
    @JsonIgnore
    public PSViewMsgDTO pssysimagename(String pSSysImageName){
        this.setPSSysImageName(pSSysImageName);
        return this;
    }

    /**
     * <B>PSSYSMSGTEMPLID</B>&nbsp;系统消息模板，指定动态视图消息的消息模板对象，指定消息模板则将行记录通过模板转化为消息内容
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysMsgTemplDTO} 
     */
    public final static String FIELD_PSSYSMSGTEMPLID = "pssysmsgtemplid";

    /**
     * 设置 系统消息模板，详细说明：{@link #FIELD_PSSYSMSGTEMPLID}
     * 
     * @param pSSysMsgTemplId
     * 
     */
    @JsonProperty(FIELD_PSSYSMSGTEMPLID)
    public void setPSSysMsgTemplId(String pSSysMsgTemplId){
        this.set(FIELD_PSSYSMSGTEMPLID, pSSysMsgTemplId);
    }
    
    /**
     * 获取 系统消息模板  
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
     * 判断 系统消息模板 是否指定值，包括空值
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
     * 重置 系统消息模板
     */
    @JsonIgnore
    public void resetPSSysMsgTemplId(){
        this.reset(FIELD_PSSYSMSGTEMPLID);
    }

    /**
     * 设置 系统消息模板，详细说明：{@link #FIELD_PSSYSMSGTEMPLID}
     * <P>
     * 等同 {@link #setPSSysMsgTemplId}
     * @param pSSysMsgTemplId
     */
    @JsonIgnore
    public PSViewMsgDTO pssysmsgtemplid(String pSSysMsgTemplId){
        this.setPSSysMsgTemplId(pSSysMsgTemplId);
        return this;
    }

    /**
     * 设置 系统消息模板，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysMsgTemplId}
     * @param pSSysMsgTempl 引用对象
     */
    @JsonIgnore
    public PSViewMsgDTO pssysmsgtemplid(PSSysMsgTemplDTO pSSysMsgTempl){
        if(pSSysMsgTempl == null){
            this.setPSSysMsgTemplId(null);
            this.setPSSysMsgTemplName(null);
        }
        else{
            this.setPSSysMsgTemplId(pSSysMsgTempl.getPSSysMsgTemplId());
            this.setPSSysMsgTemplName(pSSysMsgTempl.getPSSysMsgTemplName());
        }
        return this;
    }

    /**
     * <B>PSSYSMSGTEMPLNAME</B>&nbsp;系统消息模板，指定动态视图消息的消息模板对象，指定消息模板则将行记录通过模板转化为消息内容
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSMSGTEMPLID}
     */
    public final static String FIELD_PSSYSMSGTEMPLNAME = "pssysmsgtemplname";

    /**
     * 设置 系统消息模板，详细说明：{@link #FIELD_PSSYSMSGTEMPLNAME}
     * 
     * @param pSSysMsgTemplName
     * 
     */
    @JsonProperty(FIELD_PSSYSMSGTEMPLNAME)
    public void setPSSysMsgTemplName(String pSSysMsgTemplName){
        this.set(FIELD_PSSYSMSGTEMPLNAME, pSSysMsgTemplName);
    }
    
    /**
     * 获取 系统消息模板  
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
     * 判断 系统消息模板 是否指定值，包括空值
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
     * 重置 系统消息模板
     */
    @JsonIgnore
    public void resetPSSysMsgTemplName(){
        this.reset(FIELD_PSSYSMSGTEMPLNAME);
    }

    /**
     * 设置 系统消息模板，详细说明：{@link #FIELD_PSSYSMSGTEMPLNAME}
     * <P>
     * 等同 {@link #setPSSysMsgTemplName}
     * @param pSSysMsgTemplName
     */
    @JsonIgnore
    public PSViewMsgDTO pssysmsgtemplname(String pSSysMsgTemplName){
        this.setPSSysMsgTemplName(pSSysMsgTemplName);
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELID</B>&nbsp;视图消息布局面板
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysViewPanelDTO} 
     */
    public final static String FIELD_PSSYSVIEWPANELID = "pssysviewpanelid";

    /**
     * 设置 视图消息布局面板
     * 
     * @param pSSysViewPanelId
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELID)
    public void setPSSysViewPanelId(String pSSysViewPanelId){
        this.set(FIELD_PSSYSVIEWPANELID, pSSysViewPanelId);
    }
    
    /**
     * 获取 视图消息布局面板  
     * @return
     */
    @JsonIgnore
    public String getPSSysViewPanelId(){
        Object objValue = this.get(FIELD_PSSYSVIEWPANELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图消息布局面板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysViewPanelIdDirty(){
        if(this.contains(FIELD_PSSYSVIEWPANELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图消息布局面板
     */
    @JsonIgnore
    public void resetPSSysViewPanelId(){
        this.reset(FIELD_PSSYSVIEWPANELID);
    }

    /**
     * 设置 视图消息布局面板
     * <P>
     * 等同 {@link #setPSSysViewPanelId}
     * @param pSSysViewPanelId
     */
    @JsonIgnore
    public PSViewMsgDTO pssysviewpanelid(String pSSysViewPanelId){
        this.setPSSysViewPanelId(pSSysViewPanelId);
        return this;
    }

    /**
     * 设置 视图消息布局面板，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysViewPanelId}
     * @param pSSysViewPanel 引用对象
     */
    @JsonIgnore
    public PSViewMsgDTO pssysviewpanelid(PSSysViewPanelDTO pSSysViewPanel){
        if(pSSysViewPanel == null){
            this.setPSSysViewPanelId(null);
            this.setPSSysViewPanelName(null);
        }
        else{
            this.setPSSysViewPanelId(pSSysViewPanel.getPSSysViewPanelId());
            this.setPSSysViewPanelName(pSSysViewPanel.getPSSysViewPanelName());
        }
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELNAME</B>&nbsp;视图消息布局面板
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSVIEWPANELID}
     */
    public final static String FIELD_PSSYSVIEWPANELNAME = "pssysviewpanelname";

    /**
     * 设置 视图消息布局面板
     * 
     * @param pSSysViewPanelName
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELNAME)
    public void setPSSysViewPanelName(String pSSysViewPanelName){
        this.set(FIELD_PSSYSVIEWPANELNAME, pSSysViewPanelName);
    }
    
    /**
     * 获取 视图消息布局面板  
     * @return
     */
    @JsonIgnore
    public String getPSSysViewPanelName(){
        Object objValue = this.get(FIELD_PSSYSVIEWPANELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图消息布局面板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysViewPanelNameDirty(){
        if(this.contains(FIELD_PSSYSVIEWPANELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图消息布局面板
     */
    @JsonIgnore
    public void resetPSSysViewPanelName(){
        this.reset(FIELD_PSSYSVIEWPANELNAME);
    }

    /**
     * 设置 视图消息布局面板
     * <P>
     * 等同 {@link #setPSSysViewPanelName}
     * @param pSSysViewPanelName
     */
    @JsonIgnore
    public PSViewMsgDTO pssysviewpanelname(String pSSysViewPanelName){
        this.setPSSysViewPanelName(pSSysViewPanelName);
        return this;
    }

    /**
     * <B>PSVIEWMSGID</B>&nbsp;视图消息标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSVIEWMSGID = "psviewmsgid";

    /**
     * 设置 视图消息标识
     * 
     * @param pSViewMsgId
     * 
     */
    @JsonProperty(FIELD_PSVIEWMSGID)
    public void setPSViewMsgId(String pSViewMsgId){
        this.set(FIELD_PSVIEWMSGID, pSViewMsgId);
    }
    
    /**
     * 获取 视图消息标识  
     * @return
     */
    @JsonIgnore
    public String getPSViewMsgId(){
        Object objValue = this.get(FIELD_PSVIEWMSGID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图消息标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSViewMsgIdDirty(){
        if(this.contains(FIELD_PSVIEWMSGID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图消息标识
     */
    @JsonIgnore
    public void resetPSViewMsgId(){
        this.reset(FIELD_PSVIEWMSGID);
    }

    /**
     * 设置 视图消息标识
     * <P>
     * 等同 {@link #setPSViewMsgId}
     * @param pSViewMsgId
     */
    @JsonIgnore
    public PSViewMsgDTO psviewmsgid(String pSViewMsgId){
        this.setPSViewMsgId(pSViewMsgId);
        return this;
    }

    /**
     * <B>PSVIEWMSGNAME</B>&nbsp;视图消息名称，指定视图消息的名称，需要在所在的模型域（系统模块或系统）中具有唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSVIEWMSGNAME = "psviewmsgname";

    /**
     * 设置 视图消息名称，详细说明：{@link #FIELD_PSVIEWMSGNAME}
     * 
     * @param pSViewMsgName
     * 
     */
    @JsonProperty(FIELD_PSVIEWMSGNAME)
    public void setPSViewMsgName(String pSViewMsgName){
        this.set(FIELD_PSVIEWMSGNAME, pSViewMsgName);
    }
    
    /**
     * 获取 视图消息名称  
     * @return
     */
    @JsonIgnore
    public String getPSViewMsgName(){
        Object objValue = this.get(FIELD_PSVIEWMSGNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图消息名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSViewMsgNameDirty(){
        if(this.contains(FIELD_PSVIEWMSGNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图消息名称
     */
    @JsonIgnore
    public void resetPSViewMsgName(){
        this.reset(FIELD_PSVIEWMSGNAME);
    }

    /**
     * 设置 视图消息名称，详细说明：{@link #FIELD_PSVIEWMSGNAME}
     * <P>
     * 等同 {@link #setPSViewMsgName}
     * @param pSViewMsgName
     */
    @JsonIgnore
    public PSViewMsgDTO psviewmsgname(String pSViewMsgName){
        this.setPSViewMsgName(pSViewMsgName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSViewMsgName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSViewMsgName(strName);
    }

    @JsonIgnore
    public PSViewMsgDTO name(String strName){
        this.setPSViewMsgName(strName);
        return this;
    }

    /**
     * <B>REMOVEPSDEFID</B>&nbsp;删除模式值属性，指定动态视图消息删除模式的存储属性对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_REMOVEPSDEFID = "removepsdefid";

    /**
     * 设置 删除模式值属性，详细说明：{@link #FIELD_REMOVEPSDEFID}
     * 
     * @param removePSDEFId
     * 
     */
    @JsonProperty(FIELD_REMOVEPSDEFID)
    public void setRemovePSDEFId(String removePSDEFId){
        this.set(FIELD_REMOVEPSDEFID, removePSDEFId);
    }
    
    /**
     * 获取 删除模式值属性  
     * @return
     */
    @JsonIgnore
    public String getRemovePSDEFId(){
        Object objValue = this.get(FIELD_REMOVEPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 删除模式值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRemovePSDEFIdDirty(){
        if(this.contains(FIELD_REMOVEPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 删除模式值属性
     */
    @JsonIgnore
    public void resetRemovePSDEFId(){
        this.reset(FIELD_REMOVEPSDEFID);
    }

    /**
     * 设置 删除模式值属性，详细说明：{@link #FIELD_REMOVEPSDEFID}
     * <P>
     * 等同 {@link #setRemovePSDEFId}
     * @param removePSDEFId
     */
    @JsonIgnore
    public PSViewMsgDTO removepsdefid(String removePSDEFId){
        this.setRemovePSDEFId(removePSDEFId);
        return this;
    }

    /**
     * 设置 删除模式值属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRemovePSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSViewMsgDTO removepsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setRemovePSDEFId(null);
            this.setRemovePSDEFName(null);
        }
        else{
            this.setRemovePSDEFId(pSDEField.getPSDEFieldId());
            this.setRemovePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>REMOVEPSDEFNAME</B>&nbsp;删除模式值属性，指定动态视图消息删除模式的存储属性对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REMOVEPSDEFID}
     */
    public final static String FIELD_REMOVEPSDEFNAME = "removepsdefname";

    /**
     * 设置 删除模式值属性，详细说明：{@link #FIELD_REMOVEPSDEFNAME}
     * 
     * @param removePSDEFName
     * 
     */
    @JsonProperty(FIELD_REMOVEPSDEFNAME)
    public void setRemovePSDEFName(String removePSDEFName){
        this.set(FIELD_REMOVEPSDEFNAME, removePSDEFName);
    }
    
    /**
     * 获取 删除模式值属性  
     * @return
     */
    @JsonIgnore
    public String getRemovePSDEFName(){
        Object objValue = this.get(FIELD_REMOVEPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 删除模式值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRemovePSDEFNameDirty(){
        if(this.contains(FIELD_REMOVEPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 删除模式值属性
     */
    @JsonIgnore
    public void resetRemovePSDEFName(){
        this.reset(FIELD_REMOVEPSDEFNAME);
    }

    /**
     * 设置 删除模式值属性，详细说明：{@link #FIELD_REMOVEPSDEFNAME}
     * <P>
     * 等同 {@link #setRemovePSDEFName}
     * @param removePSDEFName
     */
    @JsonIgnore
    public PSViewMsgDTO removepsdefname(String removePSDEFName){
        this.setRemovePSDEFName(removePSDEFName);
        return this;
    }

    /**
     * <B>TIMEOUT</B>&nbsp;显示时长，指定视图消息的显示时长，到期后将自动关闭，单位为【毫秒】，-1为永不关闭。未定义时为【-1】
     */
    public final static String FIELD_TIMEOUT = "timeout";

    /**
     * 设置 显示时长，详细说明：{@link #FIELD_TIMEOUT}
     * 
     * @param timeout
     * 
     */
    @JsonProperty(FIELD_TIMEOUT)
    public void setTimeout(Integer timeout){
        this.set(FIELD_TIMEOUT, timeout);
    }
    
    /**
     * 获取 显示时长  
     * @return
     */
    @JsonIgnore
    public Integer getTimeout(){
        Object objValue = this.get(FIELD_TIMEOUT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 显示时长 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTimeoutDirty(){
        if(this.contains(FIELD_TIMEOUT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 显示时长
     */
    @JsonIgnore
    public void resetTimeout(){
        this.reset(FIELD_TIMEOUT);
    }

    /**
     * 设置 显示时长，详细说明：{@link #FIELD_TIMEOUT}
     * <P>
     * 等同 {@link #setTimeout}
     * @param timeout
     */
    @JsonIgnore
    public PSViewMsgDTO timeout(Integer timeout){
        this.setTimeout(timeout);
        return this;
    }

    /**
     * <B>TITLE</B>&nbsp;标题，指定视图消息的标题，动态消息在消息标题未指定值时默认使用此配置
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_TITLE = "title";

    /**
     * 设置 标题，详细说明：{@link #FIELD_TITLE}
     * 
     * @param title
     * 
     */
    @JsonProperty(FIELD_TITLE)
    public void setTitle(String title){
        this.set(FIELD_TITLE, title);
    }
    
    /**
     * 获取 标题  
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
     * 判断 标题 是否指定值，包括空值
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
     * 重置 标题
     */
    @JsonIgnore
    public void resetTitle(){
        this.reset(FIELD_TITLE);
    }

    /**
     * 设置 标题，详细说明：{@link #FIELD_TITLE}
     * <P>
     * 等同 {@link #setTitle}
     * @param title
     */
    @JsonIgnore
    public PSViewMsgDTO title(String title){
        this.setTitle(title);
        return this;
    }

    /**
     * <B>TITLELANRESTAGPSDEFID</B>&nbsp;标题语言资源值属性，指定视图消息标题的多语言资源对象，动态消息在消息标题多语言资源对象未指定值时默认使用此配置
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_TITLELANRESTAGPSDEFID = "titlelanrestagpsdefid";

    /**
     * 设置 标题语言资源值属性，详细说明：{@link #FIELD_TITLELANRESTAGPSDEFID}
     * 
     * @param titleLanResTagPSDEFId
     * 
     */
    @JsonProperty(FIELD_TITLELANRESTAGPSDEFID)
    public void setTitleLanResTagPSDEFId(String titleLanResTagPSDEFId){
        this.set(FIELD_TITLELANRESTAGPSDEFID, titleLanResTagPSDEFId);
    }
    
    /**
     * 获取 标题语言资源值属性  
     * @return
     */
    @JsonIgnore
    public String getTitleLanResTagPSDEFId(){
        Object objValue = this.get(FIELD_TITLELANRESTAGPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标题语言资源值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTitleLanResTagPSDEFIdDirty(){
        if(this.contains(FIELD_TITLELANRESTAGPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题语言资源值属性
     */
    @JsonIgnore
    public void resetTitleLanResTagPSDEFId(){
        this.reset(FIELD_TITLELANRESTAGPSDEFID);
    }

    /**
     * 设置 标题语言资源值属性，详细说明：{@link #FIELD_TITLELANRESTAGPSDEFID}
     * <P>
     * 等同 {@link #setTitleLanResTagPSDEFId}
     * @param titleLanResTagPSDEFId
     */
    @JsonIgnore
    public PSViewMsgDTO titlelanrestagpsdefid(String titleLanResTagPSDEFId){
        this.setTitleLanResTagPSDEFId(titleLanResTagPSDEFId);
        return this;
    }

    /**
     * 设置 标题语言资源值属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTitleLanResTagPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSViewMsgDTO titlelanrestagpsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setTitleLanResTagPSDEFId(null);
            this.setTitleLanResTagPSDEFName(null);
        }
        else{
            this.setTitleLanResTagPSDEFId(pSDEField.getPSDEFieldId());
            this.setTitleLanResTagPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>TITLELANRESTAGPSDEFNAME</B>&nbsp;标题语言资源值属性，指定视图消息标题的多语言资源对象，动态消息在消息标题多语言资源对象未指定值时默认使用此配置
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TITLELANRESTAGPSDEFID}
     */
    public final static String FIELD_TITLELANRESTAGPSDEFNAME = "titlelanrestagpsdefname";

    /**
     * 设置 标题语言资源值属性，详细说明：{@link #FIELD_TITLELANRESTAGPSDEFNAME}
     * 
     * @param titleLanResTagPSDEFName
     * 
     */
    @JsonProperty(FIELD_TITLELANRESTAGPSDEFNAME)
    public void setTitleLanResTagPSDEFName(String titleLanResTagPSDEFName){
        this.set(FIELD_TITLELANRESTAGPSDEFNAME, titleLanResTagPSDEFName);
    }
    
    /**
     * 获取 标题语言资源值属性  
     * @return
     */
    @JsonIgnore
    public String getTitleLanResTagPSDEFName(){
        Object objValue = this.get(FIELD_TITLELANRESTAGPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标题语言资源值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTitleLanResTagPSDEFNameDirty(){
        if(this.contains(FIELD_TITLELANRESTAGPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题语言资源值属性
     */
    @JsonIgnore
    public void resetTitleLanResTagPSDEFName(){
        this.reset(FIELD_TITLELANRESTAGPSDEFNAME);
    }

    /**
     * 设置 标题语言资源值属性，详细说明：{@link #FIELD_TITLELANRESTAGPSDEFNAME}
     * <P>
     * 等同 {@link #setTitleLanResTagPSDEFName}
     * @param titleLanResTagPSDEFName
     */
    @JsonIgnore
    public PSViewMsgDTO titlelanrestagpsdefname(String titleLanResTagPSDEFName){
        this.setTitleLanResTagPSDEFName(titleLanResTagPSDEFName);
        return this;
    }

    /**
     * <B>TITLEPSDEFID</B>&nbsp;消息标题值属性，指定动态视图消息消息标题的存储属性对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_TITLEPSDEFID = "titlepsdefid";

    /**
     * 设置 消息标题值属性，详细说明：{@link #FIELD_TITLEPSDEFID}
     * 
     * @param titlePSDEFId
     * 
     */
    @JsonProperty(FIELD_TITLEPSDEFID)
    public void setTitlePSDEFId(String titlePSDEFId){
        this.set(FIELD_TITLEPSDEFID, titlePSDEFId);
    }
    
    /**
     * 获取 消息标题值属性  
     * @return
     */
    @JsonIgnore
    public String getTitlePSDEFId(){
        Object objValue = this.get(FIELD_TITLEPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 消息标题值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTitlePSDEFIdDirty(){
        if(this.contains(FIELD_TITLEPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 消息标题值属性
     */
    @JsonIgnore
    public void resetTitlePSDEFId(){
        this.reset(FIELD_TITLEPSDEFID);
    }

    /**
     * 设置 消息标题值属性，详细说明：{@link #FIELD_TITLEPSDEFID}
     * <P>
     * 等同 {@link #setTitlePSDEFId}
     * @param titlePSDEFId
     */
    @JsonIgnore
    public PSViewMsgDTO titlepsdefid(String titlePSDEFId){
        this.setTitlePSDEFId(titlePSDEFId);
        return this;
    }

    /**
     * 设置 消息标题值属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTitlePSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSViewMsgDTO titlepsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setTitlePSDEFId(null);
            this.setTitlePSDEFName(null);
        }
        else{
            this.setTitlePSDEFId(pSDEField.getPSDEFieldId());
            this.setTitlePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>TITLEPSDEFNAME</B>&nbsp;消息标题值属性，指定动态视图消息消息标题的存储属性对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TITLEPSDEFID}
     */
    public final static String FIELD_TITLEPSDEFNAME = "titlepsdefname";

    /**
     * 设置 消息标题值属性，详细说明：{@link #FIELD_TITLEPSDEFNAME}
     * 
     * @param titlePSDEFName
     * 
     */
    @JsonProperty(FIELD_TITLEPSDEFNAME)
    public void setTitlePSDEFName(String titlePSDEFName){
        this.set(FIELD_TITLEPSDEFNAME, titlePSDEFName);
    }
    
    /**
     * 获取 消息标题值属性  
     * @return
     */
    @JsonIgnore
    public String getTitlePSDEFName(){
        Object objValue = this.get(FIELD_TITLEPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 消息标题值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTitlePSDEFNameDirty(){
        if(this.contains(FIELD_TITLEPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 消息标题值属性
     */
    @JsonIgnore
    public void resetTitlePSDEFName(){
        this.reset(FIELD_TITLEPSDEFNAME);
    }

    /**
     * 设置 消息标题值属性，详细说明：{@link #FIELD_TITLEPSDEFNAME}
     * <P>
     * 等同 {@link #setTitlePSDEFName}
     * @param titlePSDEFName
     */
    @JsonIgnore
    public PSViewMsgDTO titlepsdefname(String titlePSDEFName){
        this.setTitlePSDEFName(titlePSDEFName);
        return this;
    }

    /**
     * <B>TITLEPSLANRESID</B>&nbsp;抬头语言资源，指定动态视图消息消息标题多语言资源对象的存储属性对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSLanguageResDTO} 
     */
    public final static String FIELD_TITLEPSLANRESID = "titlepslanresid";

    /**
     * 设置 抬头语言资源，详细说明：{@link #FIELD_TITLEPSLANRESID}
     * 
     * @param titlePSLanResId
     * 
     */
    @JsonProperty(FIELD_TITLEPSLANRESID)
    public void setTitlePSLanResId(String titlePSLanResId){
        this.set(FIELD_TITLEPSLANRESID, titlePSLanResId);
    }
    
    /**
     * 获取 抬头语言资源  
     * @return
     */
    @JsonIgnore
    public String getTitlePSLanResId(){
        Object objValue = this.get(FIELD_TITLEPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 抬头语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTitlePSLanResIdDirty(){
        if(this.contains(FIELD_TITLEPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 抬头语言资源
     */
    @JsonIgnore
    public void resetTitlePSLanResId(){
        this.reset(FIELD_TITLEPSLANRESID);
    }

    /**
     * 设置 抬头语言资源，详细说明：{@link #FIELD_TITLEPSLANRESID}
     * <P>
     * 等同 {@link #setTitlePSLanResId}
     * @param titlePSLanResId
     */
    @JsonIgnore
    public PSViewMsgDTO titlepslanresid(String titlePSLanResId){
        this.setTitlePSLanResId(titlePSLanResId);
        return this;
    }

    /**
     * 设置 抬头语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTitlePSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSViewMsgDTO titlepslanresid(PSLanguageResDTO pSLanguageRes){
        if(pSLanguageRes == null){
            this.setTitlePSLanResId(null);
            this.setTitlePSLanResName(null);
        }
        else{
            this.setTitlePSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setTitlePSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>TITLEPSLANRESNAME</B>&nbsp;标题语言资源，指定动态视图消息消息标题多语言资源对象的存储属性对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TITLEPSLANRESID}
     */
    public final static String FIELD_TITLEPSLANRESNAME = "titlepslanresname";

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_TITLEPSLANRESNAME}
     * 
     * @param titlePSLanResName
     * 
     */
    @JsonProperty(FIELD_TITLEPSLANRESNAME)
    public void setTitlePSLanResName(String titlePSLanResName){
        this.set(FIELD_TITLEPSLANRESNAME, titlePSLanResName);
    }
    
    /**
     * 获取 标题语言资源  
     * @return
     */
    @JsonIgnore
    public String getTitlePSLanResName(){
        Object objValue = this.get(FIELD_TITLEPSLANRESNAME);
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
    public boolean isTitlePSLanResNameDirty(){
        if(this.contains(FIELD_TITLEPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题语言资源
     */
    @JsonIgnore
    public void resetTitlePSLanResName(){
        this.reset(FIELD_TITLEPSLANRESNAME);
    }

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_TITLEPSLANRESNAME}
     * <P>
     * 等同 {@link #setTitlePSLanResName}
     * @param titlePSLanResName
     */
    @JsonIgnore
    public PSViewMsgDTO titlepslanresname(String titlePSLanResName){
        this.setTitlePSLanResName(titlePSLanResName);
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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setUpdateDate(Timestamp updateDate){
        this.set(FIELD_UPDATEDATE, updateDate);
    }
    
    /**
     * 获取 更新时间  
     * @return
     */
    @JsonIgnore
    public Timestamp getUpdateDate(){
        Object objValue = this.get(FIELD_UPDATEDATE);
        if(objValue==null){
            return null;
        }
        return (Timestamp)objValue;
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
    public PSViewMsgDTO updatedate(Timestamp updateDate){
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
    public PSViewMsgDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>USERCAT</B>&nbsp;用户分类
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.ModelUserCat} 
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
    public PSViewMsgDTO usercat(String userCat){
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
    public PSViewMsgDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSViewMsgDTO usertag(String userTag){
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
    public PSViewMsgDTO usertag2(String userTag2){
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
    public PSViewMsgDTO usertag3(String userTag3){
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
    public PSViewMsgDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSViewMsgId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSViewMsgId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSViewMsgId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSViewMsgId(strValue);
    }

    @JsonIgnore
    public PSViewMsgDTO id(String strValue){
        this.setPSViewMsgId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSViewMsgDTO){
            PSViewMsgDTO dto = (PSViewMsgDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
