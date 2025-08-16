package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSUNISTATE</B>系统状态协同 模型传输对象
 * <P>
 * 系统全局状态协同的模型，协同模型以zk作为功能载体，定义节点的目录及数据项：/目录1/目录2/目录3/数据标识：{状态1、状态2、...状态8}
 */
public class PSSysUniStateDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysUniStateDTO(){
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
    public PSSysUniStateDTO createdate(Timestamp createDate){
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
    public PSSysUniStateDTO createman(String createMan){
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
    public PSSysUniStateDTO customcode(String customCode){
        this.setCustomCode(customCode);
        return this;
    }

    /**
     * <B>CUSTOMMODE</B>&nbsp;自定义模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_CUSTOMMODE = "custommode";

    /**
     * 设置 自定义模式
     * 
     * @param customMode
     * 
     */
    @JsonProperty(FIELD_CUSTOMMODE)
    public void setCustomMode(Integer customMode){
        this.set(FIELD_CUSTOMMODE, customMode);
    }
    
    /**
     * 获取 自定义模式  
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
     * 判断 自定义模式 是否指定值，包括空值
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
     * 重置 自定义模式
     */
    @JsonIgnore
    public void resetCustomMode(){
        this.reset(FIELD_CUSTOMMODE);
    }

    /**
     * 设置 自定义模式
     * <P>
     * 等同 {@link #setCustomMode}
     * @param customMode
     */
    @JsonIgnore
    public PSSysUniStateDTO custommode(Integer customMode){
        this.setCustomMode(customMode);
        return this;
    }

     /**
     * 设置 自定义模式
     * <P>
     * 等同 {@link #setCustomMode}
     * @param customMode
     */
    @JsonIgnore
    public PSSysUniStateDTO custommode(Boolean customMode){
        if(customMode == null){
            this.setCustomMode(null);
        }
        else{
            this.setCustomMode(customMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DEDEFAULTFLAG</B>&nbsp;实体默认统一状态，指定是否为当前实体的默认状态协同，未指定为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEDEFAULTFLAG = "dedefaultflag";

    /**
     * 设置 实体默认统一状态，详细说明：{@link #FIELD_DEDEFAULTFLAG}
     * 
     * @param dEDefaultFlag
     * 
     */
    @JsonProperty(FIELD_DEDEFAULTFLAG)
    public void setDEDefaultFlag(Integer dEDefaultFlag){
        this.set(FIELD_DEDEFAULTFLAG, dEDefaultFlag);
    }
    
    /**
     * 获取 实体默认统一状态  
     * @return
     */
    @JsonIgnore
    public Integer getDEDefaultFlag(){
        Object objValue = this.get(FIELD_DEDEFAULTFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 实体默认统一状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDEDefaultFlagDirty(){
        if(this.contains(FIELD_DEDEFAULTFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体默认统一状态
     */
    @JsonIgnore
    public void resetDEDefaultFlag(){
        this.reset(FIELD_DEDEFAULTFLAG);
    }

    /**
     * 设置 实体默认统一状态，详细说明：{@link #FIELD_DEDEFAULTFLAG}
     * <P>
     * 等同 {@link #setDEDefaultFlag}
     * @param dEDefaultFlag
     */
    @JsonIgnore
    public PSSysUniStateDTO dedefaultflag(Integer dEDefaultFlag){
        this.setDEDefaultFlag(dEDefaultFlag);
        return this;
    }

     /**
     * 设置 实体默认统一状态，详细说明：{@link #FIELD_DEDEFAULTFLAG}
     * <P>
     * 等同 {@link #setDEDefaultFlag}
     * @param dEDefaultFlag
     */
    @JsonIgnore
    public PSSysUniStateDTO dedefaultflag(Boolean dEDefaultFlag){
        if(dEDefaultFlag == null){
            this.setDEDefaultFlag(null);
        }
        else{
            this.setDEDefaultFlag(dEDefaultFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>KEY2PSDEFID</B>&nbsp;目录2属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_KEY2PSDEFID = "key2psdefid";

    /**
     * 设置 目录2属性
     * 
     * @param key2PSDEFId
     * 
     */
    @JsonProperty(FIELD_KEY2PSDEFID)
    public void setKey2PSDEFId(String key2PSDEFId){
        this.set(FIELD_KEY2PSDEFID, key2PSDEFId);
    }
    
    /**
     * 获取 目录2属性  
     * @return
     */
    @JsonIgnore
    public String getKey2PSDEFId(){
        Object objValue = this.get(FIELD_KEY2PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目录2属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isKey2PSDEFIdDirty(){
        if(this.contains(FIELD_KEY2PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目录2属性
     */
    @JsonIgnore
    public void resetKey2PSDEFId(){
        this.reset(FIELD_KEY2PSDEFID);
    }

    /**
     * 设置 目录2属性
     * <P>
     * 等同 {@link #setKey2PSDEFId}
     * @param key2PSDEFId
     */
    @JsonIgnore
    public PSSysUniStateDTO key2psdefid(String key2PSDEFId){
        this.setKey2PSDEFId(key2PSDEFId);
        return this;
    }

    /**
     * 设置 目录2属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setKey2PSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysUniStateDTO key2psdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setKey2PSDEFId(null);
            this.setKey2PSDEFName(null);
        }
        else{
            this.setKey2PSDEFId(pSDEField.getPSDEFieldId());
            this.setKey2PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>KEY2PSDEFNAME</B>&nbsp;目录1属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_KEY2PSDEFID}
     */
    public final static String FIELD_KEY2PSDEFNAME = "key2psdefname";

    /**
     * 设置 目录1属性
     * 
     * @param key2PSDEFName
     * 
     */
    @JsonProperty(FIELD_KEY2PSDEFNAME)
    public void setKey2PSDEFName(String key2PSDEFName){
        this.set(FIELD_KEY2PSDEFNAME, key2PSDEFName);
    }
    
    /**
     * 获取 目录1属性  
     * @return
     */
    @JsonIgnore
    public String getKey2PSDEFName(){
        Object objValue = this.get(FIELD_KEY2PSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目录1属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isKey2PSDEFNameDirty(){
        if(this.contains(FIELD_KEY2PSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目录1属性
     */
    @JsonIgnore
    public void resetKey2PSDEFName(){
        this.reset(FIELD_KEY2PSDEFNAME);
    }

    /**
     * 设置 目录1属性
     * <P>
     * 等同 {@link #setKey2PSDEFName}
     * @param key2PSDEFName
     */
    @JsonIgnore
    public PSSysUniStateDTO key2psdefname(String key2PSDEFName){
        this.setKey2PSDEFName(key2PSDEFName);
        return this;
    }

    /**
     * <B>KEY3PSDEFID</B>&nbsp;目录2属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_KEY3PSDEFID = "key3psdefid";

    /**
     * 设置 目录2属性
     * 
     * @param key3PSDEFId
     * 
     */
    @JsonProperty(FIELD_KEY3PSDEFID)
    public void setKey3PSDEFId(String key3PSDEFId){
        this.set(FIELD_KEY3PSDEFID, key3PSDEFId);
    }
    
    /**
     * 获取 目录2属性  
     * @return
     */
    @JsonIgnore
    public String getKey3PSDEFId(){
        Object objValue = this.get(FIELD_KEY3PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目录2属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isKey3PSDEFIdDirty(){
        if(this.contains(FIELD_KEY3PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目录2属性
     */
    @JsonIgnore
    public void resetKey3PSDEFId(){
        this.reset(FIELD_KEY3PSDEFID);
    }

    /**
     * 设置 目录2属性
     * <P>
     * 等同 {@link #setKey3PSDEFId}
     * @param key3PSDEFId
     */
    @JsonIgnore
    public PSSysUniStateDTO key3psdefid(String key3PSDEFId){
        this.setKey3PSDEFId(key3PSDEFId);
        return this;
    }

    /**
     * 设置 目录2属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setKey3PSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysUniStateDTO key3psdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setKey3PSDEFId(null);
            this.setKey3PSDEFName(null);
        }
        else{
            this.setKey3PSDEFId(pSDEField.getPSDEFieldId());
            this.setKey3PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>KEY3PSDEFNAME</B>&nbsp;目录2属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_KEY3PSDEFID}
     */
    public final static String FIELD_KEY3PSDEFNAME = "key3psdefname";

    /**
     * 设置 目录2属性
     * 
     * @param key3PSDEFName
     * 
     */
    @JsonProperty(FIELD_KEY3PSDEFNAME)
    public void setKey3PSDEFName(String key3PSDEFName){
        this.set(FIELD_KEY3PSDEFNAME, key3PSDEFName);
    }
    
    /**
     * 获取 目录2属性  
     * @return
     */
    @JsonIgnore
    public String getKey3PSDEFName(){
        Object objValue = this.get(FIELD_KEY3PSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目录2属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isKey3PSDEFNameDirty(){
        if(this.contains(FIELD_KEY3PSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目录2属性
     */
    @JsonIgnore
    public void resetKey3PSDEFName(){
        this.reset(FIELD_KEY3PSDEFNAME);
    }

    /**
     * 设置 目录2属性
     * <P>
     * 等同 {@link #setKey3PSDEFName}
     * @param key3PSDEFName
     */
    @JsonIgnore
    public PSSysUniStateDTO key3psdefname(String key3PSDEFName){
        this.setKey3PSDEFName(key3PSDEFName);
        return this;
    }

    /**
     * <B>KEY4PSDEFID</B>&nbsp;目录3属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_KEY4PSDEFID = "key4psdefid";

    /**
     * 设置 目录3属性
     * 
     * @param key4PSDEFId
     * 
     */
    @JsonProperty(FIELD_KEY4PSDEFID)
    public void setKey4PSDEFId(String key4PSDEFId){
        this.set(FIELD_KEY4PSDEFID, key4PSDEFId);
    }
    
    /**
     * 获取 目录3属性  
     * @return
     */
    @JsonIgnore
    public String getKey4PSDEFId(){
        Object objValue = this.get(FIELD_KEY4PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目录3属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isKey4PSDEFIdDirty(){
        if(this.contains(FIELD_KEY4PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目录3属性
     */
    @JsonIgnore
    public void resetKey4PSDEFId(){
        this.reset(FIELD_KEY4PSDEFID);
    }

    /**
     * 设置 目录3属性
     * <P>
     * 等同 {@link #setKey4PSDEFId}
     * @param key4PSDEFId
     */
    @JsonIgnore
    public PSSysUniStateDTO key4psdefid(String key4PSDEFId){
        this.setKey4PSDEFId(key4PSDEFId);
        return this;
    }

    /**
     * 设置 目录3属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setKey4PSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysUniStateDTO key4psdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setKey4PSDEFId(null);
            this.setKey4PSDEFName(null);
        }
        else{
            this.setKey4PSDEFId(pSDEField.getPSDEFieldId());
            this.setKey4PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>KEY4PSDEFNAME</B>&nbsp;目录3属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_KEY4PSDEFID}
     */
    public final static String FIELD_KEY4PSDEFNAME = "key4psdefname";

    /**
     * 设置 目录3属性
     * 
     * @param key4PSDEFName
     * 
     */
    @JsonProperty(FIELD_KEY4PSDEFNAME)
    public void setKey4PSDEFName(String key4PSDEFName){
        this.set(FIELD_KEY4PSDEFNAME, key4PSDEFName);
    }
    
    /**
     * 获取 目录3属性  
     * @return
     */
    @JsonIgnore
    public String getKey4PSDEFName(){
        Object objValue = this.get(FIELD_KEY4PSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目录3属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isKey4PSDEFNameDirty(){
        if(this.contains(FIELD_KEY4PSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目录3属性
     */
    @JsonIgnore
    public void resetKey4PSDEFName(){
        this.reset(FIELD_KEY4PSDEFNAME);
    }

    /**
     * 设置 目录3属性
     * <P>
     * 等同 {@link #setKey4PSDEFName}
     * @param key4PSDEFName
     */
    @JsonIgnore
    public PSSysUniStateDTO key4psdefname(String key4PSDEFName){
        this.setKey4PSDEFName(key4PSDEFName);
        return this;
    }

    /**
     * <B>KEYPSDEFID</B>&nbsp;标识属性，指定状态协同的数据标识属性，未指定时使用实体主键属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_KEYPSDEFID = "keypsdefid";

    /**
     * 设置 标识属性，详细说明：{@link #FIELD_KEYPSDEFID}
     * 
     * @param keyPSDEFId
     * 
     */
    @JsonProperty(FIELD_KEYPSDEFID)
    public void setKeyPSDEFId(String keyPSDEFId){
        this.set(FIELD_KEYPSDEFID, keyPSDEFId);
    }
    
    /**
     * 获取 标识属性  
     * @return
     */
    @JsonIgnore
    public String getKeyPSDEFId(){
        Object objValue = this.get(FIELD_KEYPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标识属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isKeyPSDEFIdDirty(){
        if(this.contains(FIELD_KEYPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标识属性
     */
    @JsonIgnore
    public void resetKeyPSDEFId(){
        this.reset(FIELD_KEYPSDEFID);
    }

    /**
     * 设置 标识属性，详细说明：{@link #FIELD_KEYPSDEFID}
     * <P>
     * 等同 {@link #setKeyPSDEFId}
     * @param keyPSDEFId
     */
    @JsonIgnore
    public PSSysUniStateDTO keypsdefid(String keyPSDEFId){
        this.setKeyPSDEFId(keyPSDEFId);
        return this;
    }

    /**
     * 设置 标识属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setKeyPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysUniStateDTO keypsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setKeyPSDEFId(null);
            this.setKeyPSDEFName(null);
        }
        else{
            this.setKeyPSDEFId(pSDEField.getPSDEFieldId());
            this.setKeyPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>KEYPSDEFNAME</B>&nbsp;标识属性，指定状态协同的数据标识属性，未指定时使用实体主键属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_KEYPSDEFID}
     */
    public final static String FIELD_KEYPSDEFNAME = "keypsdefname";

    /**
     * 设置 标识属性，详细说明：{@link #FIELD_KEYPSDEFNAME}
     * 
     * @param keyPSDEFName
     * 
     */
    @JsonProperty(FIELD_KEYPSDEFNAME)
    public void setKeyPSDEFName(String keyPSDEFName){
        this.set(FIELD_KEYPSDEFNAME, keyPSDEFName);
    }
    
    /**
     * 获取 标识属性  
     * @return
     */
    @JsonIgnore
    public String getKeyPSDEFName(){
        Object objValue = this.get(FIELD_KEYPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标识属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isKeyPSDEFNameDirty(){
        if(this.contains(FIELD_KEYPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标识属性
     */
    @JsonIgnore
    public void resetKeyPSDEFName(){
        this.reset(FIELD_KEYPSDEFNAME);
    }

    /**
     * 设置 标识属性，详细说明：{@link #FIELD_KEYPSDEFNAME}
     * <P>
     * 等同 {@link #setKeyPSDEFName}
     * @param keyPSDEFName
     */
    @JsonIgnore
    public PSSysUniStateDTO keypsdefname(String keyPSDEFName){
        this.setKeyPSDEFName(keyPSDEFName);
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
    public PSSysUniStateDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;相关实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDataEntityDTO} 
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 相关实体
     * 
     * @param pSDEId
     * 
     */
    @JsonProperty(FIELD_PSDEID)
    public void setPSDEId(String pSDEId){
        this.set(FIELD_PSDEID, pSDEId);
    }
    
    /**
     * 获取 相关实体  
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
     * 判断 相关实体 是否指定值，包括空值
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
     * 重置 相关实体
     */
    @JsonIgnore
    public void resetPSDEId(){
        this.reset(FIELD_PSDEID);
    }

    /**
     * 设置 相关实体
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSSysUniStateDTO psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * 设置 相关实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSSysUniStateDTO psdeid(PSDataEntityDTO pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;相关实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_PSDENAME = "psdename";

    /**
     * 设置 相关实体
     * 
     * @param pSDEName
     * 
     */
    @JsonProperty(FIELD_PSDENAME)
    public void setPSDEName(String pSDEName){
        this.set(FIELD_PSDENAME, pSDEName);
    }
    
    /**
     * 获取 相关实体  
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
     * 判断 相关实体 是否指定值，包括空值
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
     * 重置 相关实体
     */
    @JsonIgnore
    public void resetPSDEName(){
        this.reset(FIELD_PSDENAME);
    }

    /**
     * 设置 相关实体
     * <P>
     * 等同 {@link #setPSDEName}
     * @param pSDEName
     */
    @JsonIgnore
    public PSSysUniStateDTO psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定系统状态协同所在的系统模块
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
    public PSSysUniStateDTO psmoduleid(String pSModuleId){
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
    public PSSysUniStateDTO psmoduleid(PSModuleDTO pSModule){
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
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定系统状态协同所在的系统模块
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
    public PSSysUniStateDTO psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSYSUNISTATEID</B>&nbsp;系统状态协同标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSUNISTATEID = "pssysunistateid";

    /**
     * 设置 系统状态协同标识
     * 
     * @param pSSysUniStateId
     * 
     */
    @JsonProperty(FIELD_PSSYSUNISTATEID)
    public void setPSSysUniStateId(String pSSysUniStateId){
        this.set(FIELD_PSSYSUNISTATEID, pSSysUniStateId);
    }
    
    /**
     * 获取 系统状态协同标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysUniStateId(){
        Object objValue = this.get(FIELD_PSSYSUNISTATEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统状态协同标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUniStateIdDirty(){
        if(this.contains(FIELD_PSSYSUNISTATEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统状态协同标识
     */
    @JsonIgnore
    public void resetPSSysUniStateId(){
        this.reset(FIELD_PSSYSUNISTATEID);
    }

    /**
     * 设置 系统状态协同标识
     * <P>
     * 等同 {@link #setPSSysUniStateId}
     * @param pSSysUniStateId
     */
    @JsonIgnore
    public PSSysUniStateDTO pssysunistateid(String pSSysUniStateId){
        this.setPSSysUniStateId(pSSysUniStateId);
        return this;
    }

    /**
     * <B>PSSYSUNISTATENAME</B>&nbsp;系统状态协同名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSUNISTATENAME = "pssysunistatename";

    /**
     * 设置 系统状态协同名称
     * 
     * @param pSSysUniStateName
     * 
     */
    @JsonProperty(FIELD_PSSYSUNISTATENAME)
    public void setPSSysUniStateName(String pSSysUniStateName){
        this.set(FIELD_PSSYSUNISTATENAME, pSSysUniStateName);
    }
    
    /**
     * 获取 系统状态协同名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysUniStateName(){
        Object objValue = this.get(FIELD_PSSYSUNISTATENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统状态协同名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUniStateNameDirty(){
        if(this.contains(FIELD_PSSYSUNISTATENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统状态协同名称
     */
    @JsonIgnore
    public void resetPSSysUniStateName(){
        this.reset(FIELD_PSSYSUNISTATENAME);
    }

    /**
     * 设置 系统状态协同名称
     * <P>
     * 等同 {@link #setPSSysUniStateName}
     * @param pSSysUniStateName
     */
    @JsonIgnore
    public PSSysUniStateDTO pssysunistatename(String pSSysUniStateName){
        this.setPSSysUniStateName(pSSysUniStateName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysUniStateName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysUniStateName(strName);
    }

    @JsonIgnore
    public PSSysUniStateDTO name(String strName){
        this.setPSSysUniStateName(strName);
        return this;
    }

    /**
     * <B>STATE2PSDEFID</B>&nbsp;状态2属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_STATE2PSDEFID = "state2psdefid";

    /**
     * 设置 状态2属性
     * 
     * @param state2PSDEFId
     * 
     */
    @JsonProperty(FIELD_STATE2PSDEFID)
    public void setState2PSDEFId(String state2PSDEFId){
        this.set(FIELD_STATE2PSDEFID, state2PSDEFId);
    }
    
    /**
     * 获取 状态2属性  
     * @return
     */
    @JsonIgnore
    public String getState2PSDEFId(){
        Object objValue = this.get(FIELD_STATE2PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 状态2属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isState2PSDEFIdDirty(){
        if(this.contains(FIELD_STATE2PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 状态2属性
     */
    @JsonIgnore
    public void resetState2PSDEFId(){
        this.reset(FIELD_STATE2PSDEFID);
    }

    /**
     * 设置 状态2属性
     * <P>
     * 等同 {@link #setState2PSDEFId}
     * @param state2PSDEFId
     */
    @JsonIgnore
    public PSSysUniStateDTO state2psdefid(String state2PSDEFId){
        this.setState2PSDEFId(state2PSDEFId);
        return this;
    }

    /**
     * 设置 状态2属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setState2PSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysUniStateDTO state2psdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setState2PSDEFId(null);
            this.setState2PSDEFName(null);
        }
        else{
            this.setState2PSDEFId(pSDEField.getPSDEFieldId());
            this.setState2PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>STATE2PSDEFNAME</B>&nbsp;状态2属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_STATE2PSDEFID}
     */
    public final static String FIELD_STATE2PSDEFNAME = "state2psdefname";

    /**
     * 设置 状态2属性
     * 
     * @param state2PSDEFName
     * 
     */
    @JsonProperty(FIELD_STATE2PSDEFNAME)
    public void setState2PSDEFName(String state2PSDEFName){
        this.set(FIELD_STATE2PSDEFNAME, state2PSDEFName);
    }
    
    /**
     * 获取 状态2属性  
     * @return
     */
    @JsonIgnore
    public String getState2PSDEFName(){
        Object objValue = this.get(FIELD_STATE2PSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 状态2属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isState2PSDEFNameDirty(){
        if(this.contains(FIELD_STATE2PSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 状态2属性
     */
    @JsonIgnore
    public void resetState2PSDEFName(){
        this.reset(FIELD_STATE2PSDEFNAME);
    }

    /**
     * 设置 状态2属性
     * <P>
     * 等同 {@link #setState2PSDEFName}
     * @param state2PSDEFName
     */
    @JsonIgnore
    public PSSysUniStateDTO state2psdefname(String state2PSDEFName){
        this.setState2PSDEFName(state2PSDEFName);
        return this;
    }

    /**
     * <B>STATE3PSDEFID</B>&nbsp;状态3属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_STATE3PSDEFID = "state3psdefid";

    /**
     * 设置 状态3属性
     * 
     * @param state3PSDEFId
     * 
     */
    @JsonProperty(FIELD_STATE3PSDEFID)
    public void setState3PSDEFId(String state3PSDEFId){
        this.set(FIELD_STATE3PSDEFID, state3PSDEFId);
    }
    
    /**
     * 获取 状态3属性  
     * @return
     */
    @JsonIgnore
    public String getState3PSDEFId(){
        Object objValue = this.get(FIELD_STATE3PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 状态3属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isState3PSDEFIdDirty(){
        if(this.contains(FIELD_STATE3PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 状态3属性
     */
    @JsonIgnore
    public void resetState3PSDEFId(){
        this.reset(FIELD_STATE3PSDEFID);
    }

    /**
     * 设置 状态3属性
     * <P>
     * 等同 {@link #setState3PSDEFId}
     * @param state3PSDEFId
     */
    @JsonIgnore
    public PSSysUniStateDTO state3psdefid(String state3PSDEFId){
        this.setState3PSDEFId(state3PSDEFId);
        return this;
    }

    /**
     * 设置 状态3属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setState3PSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysUniStateDTO state3psdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setState3PSDEFId(null);
            this.setState3PSDEFName(null);
        }
        else{
            this.setState3PSDEFId(pSDEField.getPSDEFieldId());
            this.setState3PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>STATE3PSDEFNAME</B>&nbsp;状态3属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_STATE3PSDEFID}
     */
    public final static String FIELD_STATE3PSDEFNAME = "state3psdefname";

    /**
     * 设置 状态3属性
     * 
     * @param state3PSDEFName
     * 
     */
    @JsonProperty(FIELD_STATE3PSDEFNAME)
    public void setState3PSDEFName(String state3PSDEFName){
        this.set(FIELD_STATE3PSDEFNAME, state3PSDEFName);
    }
    
    /**
     * 获取 状态3属性  
     * @return
     */
    @JsonIgnore
    public String getState3PSDEFName(){
        Object objValue = this.get(FIELD_STATE3PSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 状态3属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isState3PSDEFNameDirty(){
        if(this.contains(FIELD_STATE3PSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 状态3属性
     */
    @JsonIgnore
    public void resetState3PSDEFName(){
        this.reset(FIELD_STATE3PSDEFNAME);
    }

    /**
     * 设置 状态3属性
     * <P>
     * 等同 {@link #setState3PSDEFName}
     * @param state3PSDEFName
     */
    @JsonIgnore
    public PSSysUniStateDTO state3psdefname(String state3PSDEFName){
        this.setState3PSDEFName(state3PSDEFName);
        return this;
    }

    /**
     * <B>STATE4PSDEFID</B>&nbsp;状态4属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_STATE4PSDEFID = "state4psdefid";

    /**
     * 设置 状态4属性
     * 
     * @param state4PSDEFId
     * 
     */
    @JsonProperty(FIELD_STATE4PSDEFID)
    public void setState4PSDEFId(String state4PSDEFId){
        this.set(FIELD_STATE4PSDEFID, state4PSDEFId);
    }
    
    /**
     * 获取 状态4属性  
     * @return
     */
    @JsonIgnore
    public String getState4PSDEFId(){
        Object objValue = this.get(FIELD_STATE4PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 状态4属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isState4PSDEFIdDirty(){
        if(this.contains(FIELD_STATE4PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 状态4属性
     */
    @JsonIgnore
    public void resetState4PSDEFId(){
        this.reset(FIELD_STATE4PSDEFID);
    }

    /**
     * 设置 状态4属性
     * <P>
     * 等同 {@link #setState4PSDEFId}
     * @param state4PSDEFId
     */
    @JsonIgnore
    public PSSysUniStateDTO state4psdefid(String state4PSDEFId){
        this.setState4PSDEFId(state4PSDEFId);
        return this;
    }

    /**
     * 设置 状态4属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setState4PSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysUniStateDTO state4psdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setState4PSDEFId(null);
            this.setState4PSDEFName(null);
        }
        else{
            this.setState4PSDEFId(pSDEField.getPSDEFieldId());
            this.setState4PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>STATE4PSDEFNAME</B>&nbsp;状态4属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_STATE4PSDEFID}
     */
    public final static String FIELD_STATE4PSDEFNAME = "state4psdefname";

    /**
     * 设置 状态4属性
     * 
     * @param state4PSDEFName
     * 
     */
    @JsonProperty(FIELD_STATE4PSDEFNAME)
    public void setState4PSDEFName(String state4PSDEFName){
        this.set(FIELD_STATE4PSDEFNAME, state4PSDEFName);
    }
    
    /**
     * 获取 状态4属性  
     * @return
     */
    @JsonIgnore
    public String getState4PSDEFName(){
        Object objValue = this.get(FIELD_STATE4PSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 状态4属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isState4PSDEFNameDirty(){
        if(this.contains(FIELD_STATE4PSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 状态4属性
     */
    @JsonIgnore
    public void resetState4PSDEFName(){
        this.reset(FIELD_STATE4PSDEFNAME);
    }

    /**
     * 设置 状态4属性
     * <P>
     * 等同 {@link #setState4PSDEFName}
     * @param state4PSDEFName
     */
    @JsonIgnore
    public PSSysUniStateDTO state4psdefname(String state4PSDEFName){
        this.setState4PSDEFName(state4PSDEFName);
        return this;
    }

    /**
     * <B>STATE5PSDEFID</B>&nbsp;状态5属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_STATE5PSDEFID = "state5psdefid";

    /**
     * 设置 状态5属性
     * 
     * @param state5PSDEFId
     * 
     */
    @JsonProperty(FIELD_STATE5PSDEFID)
    public void setState5PSDEFId(String state5PSDEFId){
        this.set(FIELD_STATE5PSDEFID, state5PSDEFId);
    }
    
    /**
     * 获取 状态5属性  
     * @return
     */
    @JsonIgnore
    public String getState5PSDEFId(){
        Object objValue = this.get(FIELD_STATE5PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 状态5属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isState5PSDEFIdDirty(){
        if(this.contains(FIELD_STATE5PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 状态5属性
     */
    @JsonIgnore
    public void resetState5PSDEFId(){
        this.reset(FIELD_STATE5PSDEFID);
    }

    /**
     * 设置 状态5属性
     * <P>
     * 等同 {@link #setState5PSDEFId}
     * @param state5PSDEFId
     */
    @JsonIgnore
    public PSSysUniStateDTO state5psdefid(String state5PSDEFId){
        this.setState5PSDEFId(state5PSDEFId);
        return this;
    }

    /**
     * 设置 状态5属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setState5PSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysUniStateDTO state5psdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setState5PSDEFId(null);
            this.setState5PSDEFName(null);
        }
        else{
            this.setState5PSDEFId(pSDEField.getPSDEFieldId());
            this.setState5PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>STATE5PSDEFNAME</B>&nbsp;状态5属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_STATE5PSDEFID}
     */
    public final static String FIELD_STATE5PSDEFNAME = "state5psdefname";

    /**
     * 设置 状态5属性
     * 
     * @param state5PSDEFName
     * 
     */
    @JsonProperty(FIELD_STATE5PSDEFNAME)
    public void setState5PSDEFName(String state5PSDEFName){
        this.set(FIELD_STATE5PSDEFNAME, state5PSDEFName);
    }
    
    /**
     * 获取 状态5属性  
     * @return
     */
    @JsonIgnore
    public String getState5PSDEFName(){
        Object objValue = this.get(FIELD_STATE5PSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 状态5属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isState5PSDEFNameDirty(){
        if(this.contains(FIELD_STATE5PSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 状态5属性
     */
    @JsonIgnore
    public void resetState5PSDEFName(){
        this.reset(FIELD_STATE5PSDEFNAME);
    }

    /**
     * 设置 状态5属性
     * <P>
     * 等同 {@link #setState5PSDEFName}
     * @param state5PSDEFName
     */
    @JsonIgnore
    public PSSysUniStateDTO state5psdefname(String state5PSDEFName){
        this.setState5PSDEFName(state5PSDEFName);
        return this;
    }

    /**
     * <B>STATE6PSDEFID</B>&nbsp;状态6属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_STATE6PSDEFID = "state6psdefid";

    /**
     * 设置 状态6属性
     * 
     * @param state6PSDEFId
     * 
     */
    @JsonProperty(FIELD_STATE6PSDEFID)
    public void setState6PSDEFId(String state6PSDEFId){
        this.set(FIELD_STATE6PSDEFID, state6PSDEFId);
    }
    
    /**
     * 获取 状态6属性  
     * @return
     */
    @JsonIgnore
    public String getState6PSDEFId(){
        Object objValue = this.get(FIELD_STATE6PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 状态6属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isState6PSDEFIdDirty(){
        if(this.contains(FIELD_STATE6PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 状态6属性
     */
    @JsonIgnore
    public void resetState6PSDEFId(){
        this.reset(FIELD_STATE6PSDEFID);
    }

    /**
     * 设置 状态6属性
     * <P>
     * 等同 {@link #setState6PSDEFId}
     * @param state6PSDEFId
     */
    @JsonIgnore
    public PSSysUniStateDTO state6psdefid(String state6PSDEFId){
        this.setState6PSDEFId(state6PSDEFId);
        return this;
    }

    /**
     * 设置 状态6属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setState6PSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysUniStateDTO state6psdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setState6PSDEFId(null);
            this.setState6PSDEFName(null);
        }
        else{
            this.setState6PSDEFId(pSDEField.getPSDEFieldId());
            this.setState6PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>STATE6PSDEFNAME</B>&nbsp;状态6属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_STATE6PSDEFID}
     */
    public final static String FIELD_STATE6PSDEFNAME = "state6psdefname";

    /**
     * 设置 状态6属性
     * 
     * @param state6PSDEFName
     * 
     */
    @JsonProperty(FIELD_STATE6PSDEFNAME)
    public void setState6PSDEFName(String state6PSDEFName){
        this.set(FIELD_STATE6PSDEFNAME, state6PSDEFName);
    }
    
    /**
     * 获取 状态6属性  
     * @return
     */
    @JsonIgnore
    public String getState6PSDEFName(){
        Object objValue = this.get(FIELD_STATE6PSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 状态6属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isState6PSDEFNameDirty(){
        if(this.contains(FIELD_STATE6PSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 状态6属性
     */
    @JsonIgnore
    public void resetState6PSDEFName(){
        this.reset(FIELD_STATE6PSDEFNAME);
    }

    /**
     * 设置 状态6属性
     * <P>
     * 等同 {@link #setState6PSDEFName}
     * @param state6PSDEFName
     */
    @JsonIgnore
    public PSSysUniStateDTO state6psdefname(String state6PSDEFName){
        this.setState6PSDEFName(state6PSDEFName);
        return this;
    }

    /**
     * <B>STATE7PSDEFID</B>&nbsp;状态7属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_STATE7PSDEFID = "state7psdefid";

    /**
     * 设置 状态7属性
     * 
     * @param state7PSDEFId
     * 
     */
    @JsonProperty(FIELD_STATE7PSDEFID)
    public void setState7PSDEFId(String state7PSDEFId){
        this.set(FIELD_STATE7PSDEFID, state7PSDEFId);
    }
    
    /**
     * 获取 状态7属性  
     * @return
     */
    @JsonIgnore
    public String getState7PSDEFId(){
        Object objValue = this.get(FIELD_STATE7PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 状态7属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isState7PSDEFIdDirty(){
        if(this.contains(FIELD_STATE7PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 状态7属性
     */
    @JsonIgnore
    public void resetState7PSDEFId(){
        this.reset(FIELD_STATE7PSDEFID);
    }

    /**
     * 设置 状态7属性
     * <P>
     * 等同 {@link #setState7PSDEFId}
     * @param state7PSDEFId
     */
    @JsonIgnore
    public PSSysUniStateDTO state7psdefid(String state7PSDEFId){
        this.setState7PSDEFId(state7PSDEFId);
        return this;
    }

    /**
     * 设置 状态7属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setState7PSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysUniStateDTO state7psdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setState7PSDEFId(null);
            this.setState7PSDEFName(null);
        }
        else{
            this.setState7PSDEFId(pSDEField.getPSDEFieldId());
            this.setState7PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>STATE7PSDEFNAME</B>&nbsp;状态7属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_STATE7PSDEFID}
     */
    public final static String FIELD_STATE7PSDEFNAME = "state7psdefname";

    /**
     * 设置 状态7属性
     * 
     * @param state7PSDEFName
     * 
     */
    @JsonProperty(FIELD_STATE7PSDEFNAME)
    public void setState7PSDEFName(String state7PSDEFName){
        this.set(FIELD_STATE7PSDEFNAME, state7PSDEFName);
    }
    
    /**
     * 获取 状态7属性  
     * @return
     */
    @JsonIgnore
    public String getState7PSDEFName(){
        Object objValue = this.get(FIELD_STATE7PSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 状态7属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isState7PSDEFNameDirty(){
        if(this.contains(FIELD_STATE7PSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 状态7属性
     */
    @JsonIgnore
    public void resetState7PSDEFName(){
        this.reset(FIELD_STATE7PSDEFNAME);
    }

    /**
     * 设置 状态7属性
     * <P>
     * 等同 {@link #setState7PSDEFName}
     * @param state7PSDEFName
     */
    @JsonIgnore
    public PSSysUniStateDTO state7psdefname(String state7PSDEFName){
        this.setState7PSDEFName(state7PSDEFName);
        return this;
    }

    /**
     * <B>STATE8PSDEFID</B>&nbsp;状态8属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_STATE8PSDEFID = "state8psdefid";

    /**
     * 设置 状态8属性
     * 
     * @param state8PSDEFId
     * 
     */
    @JsonProperty(FIELD_STATE8PSDEFID)
    public void setState8PSDEFId(String state8PSDEFId){
        this.set(FIELD_STATE8PSDEFID, state8PSDEFId);
    }
    
    /**
     * 获取 状态8属性  
     * @return
     */
    @JsonIgnore
    public String getState8PSDEFId(){
        Object objValue = this.get(FIELD_STATE8PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 状态8属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isState8PSDEFIdDirty(){
        if(this.contains(FIELD_STATE8PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 状态8属性
     */
    @JsonIgnore
    public void resetState8PSDEFId(){
        this.reset(FIELD_STATE8PSDEFID);
    }

    /**
     * 设置 状态8属性
     * <P>
     * 等同 {@link #setState8PSDEFId}
     * @param state8PSDEFId
     */
    @JsonIgnore
    public PSSysUniStateDTO state8psdefid(String state8PSDEFId){
        this.setState8PSDEFId(state8PSDEFId);
        return this;
    }

    /**
     * 设置 状态8属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setState8PSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysUniStateDTO state8psdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setState8PSDEFId(null);
            this.setState8PSDEFName(null);
        }
        else{
            this.setState8PSDEFId(pSDEField.getPSDEFieldId());
            this.setState8PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>STATE8PSDEFNAME</B>&nbsp;状态8属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_STATE8PSDEFID}
     */
    public final static String FIELD_STATE8PSDEFNAME = "state8psdefname";

    /**
     * 设置 状态8属性
     * 
     * @param state8PSDEFName
     * 
     */
    @JsonProperty(FIELD_STATE8PSDEFNAME)
    public void setState8PSDEFName(String state8PSDEFName){
        this.set(FIELD_STATE8PSDEFNAME, state8PSDEFName);
    }
    
    /**
     * 获取 状态8属性  
     * @return
     */
    @JsonIgnore
    public String getState8PSDEFName(){
        Object objValue = this.get(FIELD_STATE8PSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 状态8属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isState8PSDEFNameDirty(){
        if(this.contains(FIELD_STATE8PSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 状态8属性
     */
    @JsonIgnore
    public void resetState8PSDEFName(){
        this.reset(FIELD_STATE8PSDEFNAME);
    }

    /**
     * 设置 状态8属性
     * <P>
     * 等同 {@link #setState8PSDEFName}
     * @param state8PSDEFName
     */
    @JsonIgnore
    public PSSysUniStateDTO state8psdefname(String state8PSDEFName){
        this.setState8PSDEFName(state8PSDEFName);
        return this;
    }

    /**
     * <B>STATEPSDEFID</B>&nbsp;状态1属性，指定状态协同的状态1属性，未指定时使用实体预置的【最后更新时间】属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_STATEPSDEFID = "statepsdefid";

    /**
     * 设置 状态1属性，详细说明：{@link #FIELD_STATEPSDEFID}
     * 
     * @param statePSDEFId
     * 
     */
    @JsonProperty(FIELD_STATEPSDEFID)
    public void setStatePSDEFId(String statePSDEFId){
        this.set(FIELD_STATEPSDEFID, statePSDEFId);
    }
    
    /**
     * 获取 状态1属性  
     * @return
     */
    @JsonIgnore
    public String getStatePSDEFId(){
        Object objValue = this.get(FIELD_STATEPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 状态1属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStatePSDEFIdDirty(){
        if(this.contains(FIELD_STATEPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 状态1属性
     */
    @JsonIgnore
    public void resetStatePSDEFId(){
        this.reset(FIELD_STATEPSDEFID);
    }

    /**
     * 设置 状态1属性，详细说明：{@link #FIELD_STATEPSDEFID}
     * <P>
     * 等同 {@link #setStatePSDEFId}
     * @param statePSDEFId
     */
    @JsonIgnore
    public PSSysUniStateDTO statepsdefid(String statePSDEFId){
        this.setStatePSDEFId(statePSDEFId);
        return this;
    }

    /**
     * 设置 状态1属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setStatePSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysUniStateDTO statepsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setStatePSDEFId(null);
            this.setStatePSDEFName(null);
        }
        else{
            this.setStatePSDEFId(pSDEField.getPSDEFieldId());
            this.setStatePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>STATEPSDEFNAME</B>&nbsp;状态1属性，指定状态协同的状态1属性，未指定时使用实体预置的【最后更新时间】属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_STATEPSDEFID}
     */
    public final static String FIELD_STATEPSDEFNAME = "statepsdefname";

    /**
     * 设置 状态1属性，详细说明：{@link #FIELD_STATEPSDEFNAME}
     * 
     * @param statePSDEFName
     * 
     */
    @JsonProperty(FIELD_STATEPSDEFNAME)
    public void setStatePSDEFName(String statePSDEFName){
        this.set(FIELD_STATEPSDEFNAME, statePSDEFName);
    }
    
    /**
     * 获取 状态1属性  
     * @return
     */
    @JsonIgnore
    public String getStatePSDEFName(){
        Object objValue = this.get(FIELD_STATEPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 状态1属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStatePSDEFNameDirty(){
        if(this.contains(FIELD_STATEPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 状态1属性
     */
    @JsonIgnore
    public void resetStatePSDEFName(){
        this.reset(FIELD_STATEPSDEFNAME);
    }

    /**
     * 设置 状态1属性，详细说明：{@link #FIELD_STATEPSDEFNAME}
     * <P>
     * 等同 {@link #setStatePSDEFName}
     * @param statePSDEFName
     */
    @JsonIgnore
    public PSSysUniStateDTO statepsdefname(String statePSDEFName){
        this.setStatePSDEFName(statePSDEFName);
        return this;
    }

    /**
     * <B>UNIQUETAG</B>&nbsp;唯一业务标识，指定系统状态协同的的业务标记，需要在所在的模型域（系统模块或系统）中具有唯一性
     * <P>
     * 字符串：最大长度 100，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_UNIQUETAG = "uniquetag";

    /**
     * 设置 唯一业务标识，详细说明：{@link #FIELD_UNIQUETAG}
     * 
     * @param uniqueTag
     * 
     */
    @JsonProperty(FIELD_UNIQUETAG)
    public void setUniqueTag(String uniqueTag){
        this.set(FIELD_UNIQUETAG, uniqueTag);
    }
    
    /**
     * 获取 唯一业务标识  
     * @return
     */
    @JsonIgnore
    public String getUniqueTag(){
        Object objValue = this.get(FIELD_UNIQUETAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 唯一业务标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUniqueTagDirty(){
        if(this.contains(FIELD_UNIQUETAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 唯一业务标识
     */
    @JsonIgnore
    public void resetUniqueTag(){
        this.reset(FIELD_UNIQUETAG);
    }

    /**
     * 设置 唯一业务标识，详细说明：{@link #FIELD_UNIQUETAG}
     * <P>
     * 等同 {@link #setUniqueTag}
     * @param uniqueTag
     */
    @JsonIgnore
    public PSSysUniStateDTO uniquetag(String uniqueTag){
        this.setUniqueTag(uniqueTag);
        return this;
    }

    /**
     * <B>UNISTATETYPE</B>&nbsp;统一状态类型，指定协同状态的类型，默认为【实体】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.UniStateType} 
     */
    public final static String FIELD_UNISTATETYPE = "unistatetype";

    /**
     * 设置 统一状态类型，详细说明：{@link #FIELD_UNISTATETYPE}
     * 
     * @param uniStateType
     * 
     */
    @JsonProperty(FIELD_UNISTATETYPE)
    public void setUniStateType(String uniStateType){
        this.set(FIELD_UNISTATETYPE, uniStateType);
    }
    
    /**
     * 获取 统一状态类型  
     * @return
     */
    @JsonIgnore
    public String getUniStateType(){
        Object objValue = this.get(FIELD_UNISTATETYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 统一状态类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUniStateTypeDirty(){
        if(this.contains(FIELD_UNISTATETYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 统一状态类型
     */
    @JsonIgnore
    public void resetUniStateType(){
        this.reset(FIELD_UNISTATETYPE);
    }

    /**
     * 设置 统一状态类型，详细说明：{@link #FIELD_UNISTATETYPE}
     * <P>
     * 等同 {@link #setUniStateType}
     * @param uniStateType
     */
    @JsonIgnore
    public PSSysUniStateDTO unistatetype(String uniStateType){
        this.setUniStateType(uniStateType);
        return this;
    }

     /**
     * 设置 统一状态类型，详细说明：{@link #FIELD_UNISTATETYPE}
     * <P>
     * 等同 {@link #setUniStateType}
     * @param uniStateType
     */
    @JsonIgnore
    public PSSysUniStateDTO unistatetype(net.ibizsys.model.PSModelEnums.UniStateType uniStateType){
        if(uniStateType == null){
            this.setUniStateType(null);
        }
        else{
            this.setUniStateType(uniStateType.value);
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
    public PSSysUniStateDTO updatedate(Timestamp updateDate){
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
    public PSSysUniStateDTO updateman(String updateMan){
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
    public PSSysUniStateDTO usercat(String userCat){
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
    public PSSysUniStateDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSSysUniStateDTO usertag(String userTag){
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
    public PSSysUniStateDTO usertag2(String userTag2){
        this.setUserTag2(userTag2);
        return this;
    }

    /**
     * <B>USERTAG3</B>&nbsp;用户标识3
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_USERTAG3 = "usertag3";

    /**
     * 设置 用户标识3
     * 
     * @param userTag3
     * 
     */
    @JsonProperty(FIELD_USERTAG3)
    public void setUserTag3(String userTag3){
        this.set(FIELD_USERTAG3, userTag3);
    }
    
    /**
     * 获取 用户标识3  
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
     * 判断 用户标识3 是否指定值，包括空值
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
     * 重置 用户标识3
     */
    @JsonIgnore
    public void resetUserTag3(){
        this.reset(FIELD_USERTAG3);
    }

    /**
     * 设置 用户标识3
     * <P>
     * 等同 {@link #setUserTag3}
     * @param userTag3
     */
    @JsonIgnore
    public PSSysUniStateDTO usertag3(String userTag3){
        this.setUserTag3(userTag3);
        return this;
    }

    /**
     * <B>USERTAG4</B>&nbsp;用户标识4
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_USERTAG4 = "usertag4";

    /**
     * 设置 用户标识4
     * 
     * @param userTag4
     * 
     */
    @JsonProperty(FIELD_USERTAG4)
    public void setUserTag4(String userTag4){
        this.set(FIELD_USERTAG4, userTag4);
    }
    
    /**
     * 获取 用户标识4  
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
     * 判断 用户标识4 是否指定值，包括空值
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
     * 重置 用户标识4
     */
    @JsonIgnore
    public void resetUserTag4(){
        this.reset(FIELD_USERTAG4);
    }

    /**
     * 设置 用户标识4
     * <P>
     * 等同 {@link #setUserTag4}
     * @param userTag4
     */
    @JsonIgnore
    public PSSysUniStateDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>VALIDFLAG</B>&nbsp;启用
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
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
    public PSSysUniStateDTO validflag(Integer validFlag){
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
    public PSSysUniStateDTO validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSSysUniStateId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysUniStateId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysUniStateId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysUniStateId(strValue);
    }

    @JsonIgnore
    public PSSysUniStateDTO id(String strValue){
        this.setPSSysUniStateId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysUniStateDTO){
            PSSysUniStateDTO dto = (PSSysUniStateDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
