package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSTRANSLATOR</B>系统值转换 模型传输对象
 * <P>
 * 系统值转换器模型，为属性值提供转换功能
 */
public class PSSysTranslatorDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysTranslatorDTO(){
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码名称
     * <P>
     * 字符串：最大长度 50，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_CODENAME = "codename";

    /**
     * 设置 代码名称
     * 
     * @param codeName
     * 
     */
    @JsonProperty(FIELD_CODENAME)
    public void setCodeName(String codeName){
        this.set(FIELD_CODENAME, codeName);
    }
    
    /**
     * 获取 代码名称  
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
     * 判断 代码名称 是否指定值，包括空值
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
     * 重置 代码名称
     */
    @JsonIgnore
    public void resetCodeName(){
        this.reset(FIELD_CODENAME);
    }

    /**
     * 设置 代码名称
     * <P>
     * 等同 {@link #setCodeName}
     * @param codeName
     */
    @JsonIgnore
    public PSSysTranslatorDTO codename(String codeName){
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
    public PSSysTranslatorDTO createdate(Timestamp createDate){
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
    public PSSysTranslatorDTO createman(String createMan){
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
    public PSSysTranslatorDTO customcode(String customCode){
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
    public PSSysTranslatorDTO custommode(Integer customMode){
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
    public PSSysTranslatorDTO custommode(Boolean customMode){
        if(customMode == null){
            this.setCustomMode(null);
        }
        else{
            this.setCustomMode(customMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>KEYPSDEFID</B>&nbsp;标识属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_KEYPSDEFID = "keypsdefid";

    /**
     * 设置 标识属性
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
     * 设置 标识属性
     * <P>
     * 等同 {@link #setKeyPSDEFId}
     * @param keyPSDEFId
     */
    @JsonIgnore
    public PSSysTranslatorDTO keypsdefid(String keyPSDEFId){
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
    public PSSysTranslatorDTO keypsdefid(PSDEFieldDTO pSDEField){
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
     * <B>KEYPSDEFNAME</B>&nbsp;标识属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_KEYPSDEFID}
     */
    public final static String FIELD_KEYPSDEFNAME = "keypsdefname";

    /**
     * 设置 标识属性
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
     * 设置 标识属性
     * <P>
     * 等同 {@link #setKeyPSDEFName}
     * @param keyPSDEFName
     */
    @JsonIgnore
    public PSSysTranslatorDTO keypsdefname(String keyPSDEFName){
        this.setKeyPSDEFName(keyPSDEFName);
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
    public PSSysTranslatorDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDataEntityDTO} 
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 实体
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
     * 设置 实体
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSSysTranslatorDTO psdeid(String pSDEId){
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
    public PSSysTranslatorDTO psdeid(PSDataEntityDTO pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_PSDENAME = "psdename";

    /**
     * 设置 实体
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
     * 设置 实体
     * <P>
     * 等同 {@link #setPSDEName}
     * @param pSDEName
     */
    @JsonIgnore
    public PSSysTranslatorDTO psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSModuleDTO} 
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
    public PSSysTranslatorDTO psmoduleid(String pSModuleId){
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
    public PSSysTranslatorDTO psmoduleid(PSModuleDTO pSModule){
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
    public PSSysTranslatorDTO psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELID</B>&nbsp;系统动态模型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysDynaModelDTO} 
     */
    public final static String FIELD_PSSYSDYNAMODELID = "pssysdynamodelid";

    /**
     * 设置 系统动态模型
     * 
     * @param pSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELID)
    public void setPSSysDynaModelId(String pSSysDynaModelId){
        this.set(FIELD_PSSYSDYNAMODELID, pSSysDynaModelId);
    }
    
    /**
     * 获取 系统动态模型  
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
     * 判断 系统动态模型 是否指定值，包括空值
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
     * 重置 系统动态模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelId(){
        this.reset(FIELD_PSSYSDYNAMODELID);
    }

    /**
     * 设置 系统动态模型
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModelId
     */
    @JsonIgnore
    public PSSysTranslatorDTO pssysdynamodelid(String pSSysDynaModelId){
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    /**
     * 设置 系统动态模型，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModel 引用对象
     */
    @JsonIgnore
    public PSSysTranslatorDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel){
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
     * <B>PSSYSDYNAMODELNAME</B>&nbsp;系统动态模型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDYNAMODELID}
     */
    public final static String FIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";

    /**
     * 设置 系统动态模型
     * 
     * @param pSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELNAME)
    public void setPSSysDynaModelName(String pSSysDynaModelName){
        this.set(FIELD_PSSYSDYNAMODELNAME, pSSysDynaModelName);
    }
    
    /**
     * 获取 系统动态模型  
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
     * 判断 系统动态模型 是否指定值，包括空值
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
     * 重置 系统动态模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelName(){
        this.reset(FIELD_PSSYSDYNAMODELNAME);
    }

    /**
     * 设置 系统动态模型
     * <P>
     * 等同 {@link #setPSSysDynaModelName}
     * @param pSSysDynaModelName
     */
    @JsonIgnore
    public PSSysTranslatorDTO pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINID</B>&nbsp;后端扩展插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysSFPluginDTO} 
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
    public PSSysTranslatorDTO pssyssfpluginid(String pSSysSFPluginId){
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
    public PSSysTranslatorDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin){
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
    public PSSysTranslatorDTO pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    /**
     * <B>PSSYSTRANSLATORID</B>&nbsp;系统值转换标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSTRANSLATORID = "pssystranslatorid";

    /**
     * 设置 系统值转换标识
     * 
     * @param pSSysTranslatorId
     * 
     */
    @JsonProperty(FIELD_PSSYSTRANSLATORID)
    public void setPSSysTranslatorId(String pSSysTranslatorId){
        this.set(FIELD_PSSYSTRANSLATORID, pSSysTranslatorId);
    }
    
    /**
     * 获取 系统值转换标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysTranslatorId(){
        Object objValue = this.get(FIELD_PSSYSTRANSLATORID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统值转换标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysTranslatorIdDirty(){
        if(this.contains(FIELD_PSSYSTRANSLATORID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统值转换标识
     */
    @JsonIgnore
    public void resetPSSysTranslatorId(){
        this.reset(FIELD_PSSYSTRANSLATORID);
    }

    /**
     * 设置 系统值转换标识
     * <P>
     * 等同 {@link #setPSSysTranslatorId}
     * @param pSSysTranslatorId
     */
    @JsonIgnore
    public PSSysTranslatorDTO pssystranslatorid(String pSSysTranslatorId){
        this.setPSSysTranslatorId(pSSysTranslatorId);
        return this;
    }

    /**
     * <B>PSSYSTRANSLATORNAME</B>&nbsp;值转换器名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSTRANSLATORNAME = "pssystranslatorname";

    /**
     * 设置 值转换器名称
     * 
     * @param pSSysTranslatorName
     * 
     */
    @JsonProperty(FIELD_PSSYSTRANSLATORNAME)
    public void setPSSysTranslatorName(String pSSysTranslatorName){
        this.set(FIELD_PSSYSTRANSLATORNAME, pSSysTranslatorName);
    }
    
    /**
     * 获取 值转换器名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysTranslatorName(){
        Object objValue = this.get(FIELD_PSSYSTRANSLATORNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值转换器名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysTranslatorNameDirty(){
        if(this.contains(FIELD_PSSYSTRANSLATORNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值转换器名称
     */
    @JsonIgnore
    public void resetPSSysTranslatorName(){
        this.reset(FIELD_PSSYSTRANSLATORNAME);
    }

    /**
     * 设置 值转换器名称
     * <P>
     * 等同 {@link #setPSSysTranslatorName}
     * @param pSSysTranslatorName
     */
    @JsonIgnore
    public PSSysTranslatorDTO pssystranslatorname(String pSSysTranslatorName){
        this.setPSSysTranslatorName(pSSysTranslatorName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysTranslatorName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysTranslatorName(strName);
    }

    @JsonIgnore
    public PSSysTranslatorDTO name(String strName){
        this.setPSSysTranslatorName(strName);
        return this;
    }

    /**
     * <B>TRANSLATORTAG</B>&nbsp;转换标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_TRANSLATORTAG = "translatortag";

    /**
     * 设置 转换标记
     * 
     * @param translatorTag
     * 
     */
    @JsonProperty(FIELD_TRANSLATORTAG)
    public void setTranslatorTag(String translatorTag){
        this.set(FIELD_TRANSLATORTAG, translatorTag);
    }
    
    /**
     * 获取 转换标记  
     * @return
     */
    @JsonIgnore
    public String getTranslatorTag(){
        Object objValue = this.get(FIELD_TRANSLATORTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 转换标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTranslatorTagDirty(){
        if(this.contains(FIELD_TRANSLATORTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 转换标记
     */
    @JsonIgnore
    public void resetTranslatorTag(){
        this.reset(FIELD_TRANSLATORTAG);
    }

    /**
     * 设置 转换标记
     * <P>
     * 等同 {@link #setTranslatorTag}
     * @param translatorTag
     */
    @JsonIgnore
    public PSSysTranslatorDTO translatortag(String translatorTag){
        this.setTranslatorTag(translatorTag);
        return this;
    }

    /**
     * <B>TRANSLATORTAG2</B>&nbsp;转换标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_TRANSLATORTAG2 = "translatortag2";

    /**
     * 设置 转换标记2
     * 
     * @param translatorTag2
     * 
     */
    @JsonProperty(FIELD_TRANSLATORTAG2)
    public void setTranslatorTag2(String translatorTag2){
        this.set(FIELD_TRANSLATORTAG2, translatorTag2);
    }
    
    /**
     * 获取 转换标记2  
     * @return
     */
    @JsonIgnore
    public String getTranslatorTag2(){
        Object objValue = this.get(FIELD_TRANSLATORTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 转换标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTranslatorTag2Dirty(){
        if(this.contains(FIELD_TRANSLATORTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 转换标记2
     */
    @JsonIgnore
    public void resetTranslatorTag2(){
        this.reset(FIELD_TRANSLATORTAG2);
    }

    /**
     * 设置 转换标记2
     * <P>
     * 等同 {@link #setTranslatorTag2}
     * @param translatorTag2
     */
    @JsonIgnore
    public PSSysTranslatorDTO translatortag2(String translatorTag2){
        this.setTranslatorTag2(translatorTag2);
        return this;
    }

    /**
     * <B>TRANSLATORTYPE</B>&nbsp;转换器类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.TranslatorType} 
     */
    public final static String FIELD_TRANSLATORTYPE = "translatortype";

    /**
     * 设置 转换器类型
     * 
     * @param translatorType
     * 
     */
    @JsonProperty(FIELD_TRANSLATORTYPE)
    public void setTranslatorType(String translatorType){
        this.set(FIELD_TRANSLATORTYPE, translatorType);
    }
    
    /**
     * 获取 转换器类型  
     * @return
     */
    @JsonIgnore
    public String getTranslatorType(){
        Object objValue = this.get(FIELD_TRANSLATORTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 转换器类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTranslatorTypeDirty(){
        if(this.contains(FIELD_TRANSLATORTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 转换器类型
     */
    @JsonIgnore
    public void resetTranslatorType(){
        this.reset(FIELD_TRANSLATORTYPE);
    }

    /**
     * 设置 转换器类型
     * <P>
     * 等同 {@link #setTranslatorType}
     * @param translatorType
     */
    @JsonIgnore
    public PSSysTranslatorDTO translatortype(String translatorType){
        this.setTranslatorType(translatorType);
        return this;
    }

     /**
     * 设置 转换器类型
     * <P>
     * 等同 {@link #setTranslatorType}
     * @param translatorType
     */
    @JsonIgnore
    public PSSysTranslatorDTO translatortype(net.ibizsys.model.PSModelEnums.TranslatorType translatorType){
        if(translatorType == null){
            this.setTranslatorType(null);
        }
        else{
            this.setTranslatorType(translatorType.value);
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
    public PSSysTranslatorDTO updatedate(Timestamp updateDate){
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
    public PSSysTranslatorDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>USER2PSDEFID</B>&nbsp;用户自定义属性2
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
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
    public PSSysTranslatorDTO user2psdefid(String user2PSDEFId){
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
    public PSSysTranslatorDTO user2psdefid(PSDEFieldDTO pSDEField){
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
    public PSSysTranslatorDTO user2psdefname(String user2PSDEFName){
        this.setUser2PSDEFName(user2PSDEFName);
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
    public PSSysTranslatorDTO usercat(String userCat){
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
    public PSSysTranslatorDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
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
    public PSSysTranslatorDTO userpsdefid(String userPSDEFId){
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
    public PSSysTranslatorDTO userpsdefid(PSDEFieldDTO pSDEField){
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
    public PSSysTranslatorDTO userpsdefname(String userPSDEFName){
        this.setUserPSDEFName(userPSDEFName);
        return this;
    }

    /**
     * <B>USERTAG</B>&nbsp;用户标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_USERTAG = "usertag";

    /**
     * 设置 用户标识
     * 
     * @param userTag
     * 
     */
    @JsonProperty(FIELD_USERTAG)
    public void setUserTag(String userTag){
        this.set(FIELD_USERTAG, userTag);
    }
    
    /**
     * 获取 用户标识  
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
     * 判断 用户标识 是否指定值，包括空值
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
     * 重置 用户标识
     */
    @JsonIgnore
    public void resetUserTag(){
        this.reset(FIELD_USERTAG);
    }

    /**
     * 设置 用户标识
     * <P>
     * 等同 {@link #setUserTag}
     * @param userTag
     */
    @JsonIgnore
    public PSSysTranslatorDTO usertag(String userTag){
        this.setUserTag(userTag);
        return this;
    }

    /**
     * <B>USERTAG2</B>&nbsp;用户标识2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_USERTAG2 = "usertag2";

    /**
     * 设置 用户标识2
     * 
     * @param userTag2
     * 
     */
    @JsonProperty(FIELD_USERTAG2)
    public void setUserTag2(String userTag2){
        this.set(FIELD_USERTAG2, userTag2);
    }
    
    /**
     * 获取 用户标识2  
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
     * 判断 用户标识2 是否指定值，包括空值
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
     * 重置 用户标识2
     */
    @JsonIgnore
    public void resetUserTag2(){
        this.reset(FIELD_USERTAG2);
    }

    /**
     * 设置 用户标识2
     * <P>
     * 等同 {@link #setUserTag2}
     * @param userTag2
     */
    @JsonIgnore
    public PSSysTranslatorDTO usertag2(String userTag2){
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
    public PSSysTranslatorDTO usertag3(String userTag3){
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
    public PSSysTranslatorDTO usertag4(String userTag4){
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
    public PSSysTranslatorDTO validflag(Integer validFlag){
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
    public PSSysTranslatorDTO validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>VALUEPSDEFID</B>&nbsp;值属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_VALUEPSDEFID = "valuepsdefid";

    /**
     * 设置 值属性
     * 
     * @param valuePSDEFId
     * 
     */
    @JsonProperty(FIELD_VALUEPSDEFID)
    public void setValuePSDEFId(String valuePSDEFId){
        this.set(FIELD_VALUEPSDEFID, valuePSDEFId);
    }
    
    /**
     * 获取 值属性  
     * @return
     */
    @JsonIgnore
    public String getValuePSDEFId(){
        Object objValue = this.get(FIELD_VALUEPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isValuePSDEFIdDirty(){
        if(this.contains(FIELD_VALUEPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值属性
     */
    @JsonIgnore
    public void resetValuePSDEFId(){
        this.reset(FIELD_VALUEPSDEFID);
    }

    /**
     * 设置 值属性
     * <P>
     * 等同 {@link #setValuePSDEFId}
     * @param valuePSDEFId
     */
    @JsonIgnore
    public PSSysTranslatorDTO valuepsdefid(String valuePSDEFId){
        this.setValuePSDEFId(valuePSDEFId);
        return this;
    }

    /**
     * 设置 值属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setValuePSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysTranslatorDTO valuepsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setValuePSDEFId(null);
            this.setValuePSDEFName(null);
        }
        else{
            this.setValuePSDEFId(pSDEField.getPSDEFieldId());
            this.setValuePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>VALUEPSDEFNAME</B>&nbsp;值属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_VALUEPSDEFID}
     */
    public final static String FIELD_VALUEPSDEFNAME = "valuepsdefname";

    /**
     * 设置 值属性
     * 
     * @param valuePSDEFName
     * 
     */
    @JsonProperty(FIELD_VALUEPSDEFNAME)
    public void setValuePSDEFName(String valuePSDEFName){
        this.set(FIELD_VALUEPSDEFNAME, valuePSDEFName);
    }
    
    /**
     * 获取 值属性  
     * @return
     */
    @JsonIgnore
    public String getValuePSDEFName(){
        Object objValue = this.get(FIELD_VALUEPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isValuePSDEFNameDirty(){
        if(this.contains(FIELD_VALUEPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值属性
     */
    @JsonIgnore
    public void resetValuePSDEFName(){
        this.reset(FIELD_VALUEPSDEFNAME);
    }

    /**
     * 设置 值属性
     * <P>
     * 等同 {@link #setValuePSDEFName}
     * @param valuePSDEFName
     */
    @JsonIgnore
    public PSSysTranslatorDTO valuepsdefname(String valuePSDEFName){
        this.setValuePSDEFName(valuePSDEFName);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSSysTranslatorId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysTranslatorId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysTranslatorId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysTranslatorId(strValue);
    }

    @JsonIgnore
    public PSSysTranslatorDTO id(String strValue){
        this.setPSSysTranslatorId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysTranslatorDTO){
            PSSysTranslatorDTO dto = (PSSysTranslatorDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
