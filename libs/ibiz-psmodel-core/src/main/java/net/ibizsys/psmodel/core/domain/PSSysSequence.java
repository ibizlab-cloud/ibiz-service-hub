package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSSEQUENCE</B>系统值序列 模型传输对象
 * <P>
 * 系统值序列模型，提供数据库、实体类型的值序列功能，支持定义格式化等参数
 */
public class PSSysSequence extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysSequence(){
        this.setValidFlag(1);
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
    public PSSysSequence codename(String codeName){
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
    public PSSysSequence createdate(String createDate){
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
    public PSSysSequence createman(String createMan){
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
    public PSSysSequence customcode(String customCode){
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
    public PSSysSequence custommode(Integer customMode){
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
    public PSSysSequence custommode(net.ibizsys.psmodel.core.util.PSModelEnums.ScriptMode2 customMode){
        if(customMode == null){
            this.setCustomMode(null);
        }
        else{
            this.setCustomMode(customMode.value);
        }
        return this;
    }

    /**
     * <B>EXTFORMATPARAMS</B>&nbsp;附加格式化参数
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_EXTFORMATPARAMS = "extformatparams";

    /**
     * 设置 附加格式化参数
     * 
     * @param extFormatParams
     * 
     */
    @JsonProperty(FIELD_EXTFORMATPARAMS)
    public void setExtFormatParams(String extFormatParams){
        this.set(FIELD_EXTFORMATPARAMS, extFormatParams);
    }
    
    /**
     * 获取 附加格式化参数  
     * @return
     */
    @JsonIgnore
    public String getExtFormatParams(){
        Object objValue = this.get(FIELD_EXTFORMATPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 附加格式化参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExtFormatParamsDirty(){
        if(this.contains(FIELD_EXTFORMATPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 附加格式化参数
     */
    @JsonIgnore
    public void resetExtFormatParams(){
        this.reset(FIELD_EXTFORMATPARAMS);
    }

    /**
     * 设置 附加格式化参数
     * <P>
     * 等同 {@link #setExtFormatParams}
     * @param extFormatParams
     */
    @JsonIgnore
    public PSSysSequence extformatparams(String extFormatParams){
        this.setExtFormatParams(extFormatParams);
        return this;
    }

    /**
     * <B>KEYPSDEFID</B>&nbsp;标识属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
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
    public PSSysSequence keypsdefid(String keyPSDEFId){
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
    public PSSysSequence keypsdefid(PSDEField pSDEField){
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
    public PSSysSequence keypsdefname(String keyPSDEFName){
        this.setKeyPSDEFName(keyPSDEFName);
        return this;
    }

    /**
     * <B>MAXVALUE</B>&nbsp;最大值
     */
    public final static String FIELD_MAXVALUE = "maxvalue";

    /**
     * 设置 最大值
     * 
     * @param maxValue
     * 
     */
    @JsonProperty(FIELD_MAXVALUE)
    public void setMaxValue(Integer maxValue){
        this.set(FIELD_MAXVALUE, maxValue);
    }
    
    /**
     * 获取 最大值  
     * @return
     */
    @JsonIgnore
    public Integer getMaxValue(){
        Object objValue = this.get(FIELD_MAXVALUE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 最大值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMaxValueDirty(){
        if(this.contains(FIELD_MAXVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 最大值
     */
    @JsonIgnore
    public void resetMaxValue(){
        this.reset(FIELD_MAXVALUE);
    }

    /**
     * 设置 最大值
     * <P>
     * 等同 {@link #setMaxValue}
     * @param maxValue
     */
    @JsonIgnore
    public PSSysSequence maxvalue(Integer maxValue){
        this.setMaxValue(maxValue);
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
    public PSSysSequence memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MINVALUE</B>&nbsp;最小值
     */
    public final static String FIELD_MINVALUE = "minvalue";

    /**
     * 设置 最小值
     * 
     * @param minValue
     * 
     */
    @JsonProperty(FIELD_MINVALUE)
    public void setMinValue(Integer minValue){
        this.set(FIELD_MINVALUE, minValue);
    }
    
    /**
     * 获取 最小值  
     * @return
     */
    @JsonIgnore
    public Integer getMinValue(){
        Object objValue = this.get(FIELD_MINVALUE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 最小值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinValueDirty(){
        if(this.contains(FIELD_MINVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 最小值
     */
    @JsonIgnore
    public void resetMinValue(){
        this.reset(FIELD_MINVALUE);
    }

    /**
     * 设置 最小值
     * <P>
     * 等同 {@link #setMinValue}
     * @param minValue
     */
    @JsonIgnore
    public PSSysSequence minvalue(Integer minValue){
        this.setMinValue(minValue);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
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
    public PSSysSequence psdeid(String pSDEId){
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
    public PSSysSequence psdeid(PSDataEntity pSDataEntity){
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
    public PSSysSequence psdename(String pSDEName){
        this.setPSDEName(pSDEName);
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
    public PSSysSequence psmoduleid(String pSModuleId){
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
    public PSSysSequence psmoduleid(PSModule pSModule){
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
    public PSSysSequence psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELID</B>&nbsp;系统动态模型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDynaModel} 
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
    public PSSysSequence pssysdynamodelid(String pSSysDynaModelId){
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
    public PSSysSequence pssysdynamodelid(PSSysDynaModel pSSysDynaModel){
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
    public PSSysSequence pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSSYSSEQUENCEID</B>&nbsp;系统序列标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSSEQUENCEID = "pssyssequenceid";

    /**
     * 设置 系统序列标识
     * 
     * @param pSSysSequenceId
     * 
     */
    @JsonProperty(FIELD_PSSYSSEQUENCEID)
    public void setPSSysSequenceId(String pSSysSequenceId){
        this.set(FIELD_PSSYSSEQUENCEID, pSSysSequenceId);
    }
    
    /**
     * 获取 系统序列标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysSequenceId(){
        Object objValue = this.get(FIELD_PSSYSSEQUENCEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统序列标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSequenceIdDirty(){
        if(this.contains(FIELD_PSSYSSEQUENCEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统序列标识
     */
    @JsonIgnore
    public void resetPSSysSequenceId(){
        this.reset(FIELD_PSSYSSEQUENCEID);
    }

    /**
     * 设置 系统序列标识
     * <P>
     * 等同 {@link #setPSSysSequenceId}
     * @param pSSysSequenceId
     */
    @JsonIgnore
    public PSSysSequence pssyssequenceid(String pSSysSequenceId){
        this.setPSSysSequenceId(pSSysSequenceId);
        return this;
    }

    /**
     * <B>PSSYSSEQUENCENAME</B>&nbsp;值序列名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSSEQUENCENAME = "pssyssequencename";

    /**
     * 设置 值序列名称
     * 
     * @param pSSysSequenceName
     * 
     */
    @JsonProperty(FIELD_PSSYSSEQUENCENAME)
    public void setPSSysSequenceName(String pSSysSequenceName){
        this.set(FIELD_PSSYSSEQUENCENAME, pSSysSequenceName);
    }
    
    /**
     * 获取 值序列名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysSequenceName(){
        Object objValue = this.get(FIELD_PSSYSSEQUENCENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值序列名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSequenceNameDirty(){
        if(this.contains(FIELD_PSSYSSEQUENCENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值序列名称
     */
    @JsonIgnore
    public void resetPSSysSequenceName(){
        this.reset(FIELD_PSSYSSEQUENCENAME);
    }

    /**
     * 设置 值序列名称
     * <P>
     * 等同 {@link #setPSSysSequenceName}
     * @param pSSysSequenceName
     */
    @JsonIgnore
    public PSSysSequence pssyssequencename(String pSSysSequenceName){
        this.setPSSysSequenceName(pSSysSequenceName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysSequenceName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysSequenceName(strName);
    }

    @JsonIgnore
    public PSSysSequence name(String strName){
        this.setPSSysSequenceName(strName);
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
    public PSSysSequence pssyssfpluginid(String pSSysSFPluginId){
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
    public PSSysSequence pssyssfpluginid(PSSysSFPlugin pSSysSFPlugin){
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
    public PSSysSequence pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    /**
     * <B>SEQUENCEFORMAT</B>&nbsp;系列格式化
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_SEQUENCEFORMAT = "sequenceformat";

    /**
     * 设置 系列格式化
     * 
     * @param sequenceFormat
     * 
     */
    @JsonProperty(FIELD_SEQUENCEFORMAT)
    public void setSequenceFormat(String sequenceFormat){
        this.set(FIELD_SEQUENCEFORMAT, sequenceFormat);
    }
    
    /**
     * 获取 系列格式化  
     * @return
     */
    @JsonIgnore
    public String getSequenceFormat(){
        Object objValue = this.get(FIELD_SEQUENCEFORMAT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系列格式化 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSequenceFormatDirty(){
        if(this.contains(FIELD_SEQUENCEFORMAT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系列格式化
     */
    @JsonIgnore
    public void resetSequenceFormat(){
        this.reset(FIELD_SEQUENCEFORMAT);
    }

    /**
     * 设置 系列格式化
     * <P>
     * 等同 {@link #setSequenceFormat}
     * @param sequenceFormat
     */
    @JsonIgnore
    public PSSysSequence sequenceformat(String sequenceFormat){
        this.setSequenceFormat(sequenceFormat);
        return this;
    }

    /**
     * <B>SEQUENCEPARAMS</B>&nbsp;值序列参数
     */
    public final static String FIELD_SEQUENCEPARAMS = "sequenceparams";

    /**
     * 设置 值序列参数
     * 
     * @param sequenceParams
     * 
     */
    @JsonProperty(FIELD_SEQUENCEPARAMS)
    public void setSequenceParams(String sequenceParams){
        this.set(FIELD_SEQUENCEPARAMS, sequenceParams);
    }
    
    /**
     * 获取 值序列参数  
     * @return
     */
    @JsonIgnore
    public String getSequenceParams(){
        Object objValue = this.get(FIELD_SEQUENCEPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值序列参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSequenceParamsDirty(){
        if(this.contains(FIELD_SEQUENCEPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值序列参数
     */
    @JsonIgnore
    public void resetSequenceParams(){
        this.reset(FIELD_SEQUENCEPARAMS);
    }

    /**
     * 设置 值序列参数
     * <P>
     * 等同 {@link #setSequenceParams}
     * @param sequenceParams
     */
    @JsonIgnore
    public PSSysSequence sequenceparams(String sequenceParams){
        this.setSequenceParams(sequenceParams);
        return this;
    }

    /**
     * <B>SEQUENCETAG</B>&nbsp;序列标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_SEQUENCETAG = "sequencetag";

    /**
     * 设置 序列标记
     * 
     * @param sequenceTag
     * 
     */
    @JsonProperty(FIELD_SEQUENCETAG)
    public void setSequenceTag(String sequenceTag){
        this.set(FIELD_SEQUENCETAG, sequenceTag);
    }
    
    /**
     * 获取 序列标记  
     * @return
     */
    @JsonIgnore
    public String getSequenceTag(){
        Object objValue = this.get(FIELD_SEQUENCETAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 序列标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSequenceTagDirty(){
        if(this.contains(FIELD_SEQUENCETAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 序列标记
     */
    @JsonIgnore
    public void resetSequenceTag(){
        this.reset(FIELD_SEQUENCETAG);
    }

    /**
     * 设置 序列标记
     * <P>
     * 等同 {@link #setSequenceTag}
     * @param sequenceTag
     */
    @JsonIgnore
    public PSSysSequence sequencetag(String sequenceTag){
        this.setSequenceTag(sequenceTag);
        return this;
    }

    /**
     * <B>SEQUENCETAG2</B>&nbsp;序列标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_SEQUENCETAG2 = "sequencetag2";

    /**
     * 设置 序列标记2
     * 
     * @param sequenceTag2
     * 
     */
    @JsonProperty(FIELD_SEQUENCETAG2)
    public void setSequenceTag2(String sequenceTag2){
        this.set(FIELD_SEQUENCETAG2, sequenceTag2);
    }
    
    /**
     * 获取 序列标记2  
     * @return
     */
    @JsonIgnore
    public String getSequenceTag2(){
        Object objValue = this.get(FIELD_SEQUENCETAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 序列标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSequenceTag2Dirty(){
        if(this.contains(FIELD_SEQUENCETAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 序列标记2
     */
    @JsonIgnore
    public void resetSequenceTag2(){
        this.reset(FIELD_SEQUENCETAG2);
    }

    /**
     * 设置 序列标记2
     * <P>
     * 等同 {@link #setSequenceTag2}
     * @param sequenceTag2
     */
    @JsonIgnore
    public PSSysSequence sequencetag2(String sequenceTag2){
        this.setSequenceTag2(sequenceTag2);
        return this;
    }

    /**
     * <B>SEQUENCETYPE</B>&nbsp;序列类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SequenceType} 
     */
    public final static String FIELD_SEQUENCETYPE = "sequencetype";

    /**
     * 设置 序列类型
     * 
     * @param sequenceType
     * 
     */
    @JsonProperty(FIELD_SEQUENCETYPE)
    public void setSequenceType(String sequenceType){
        this.set(FIELD_SEQUENCETYPE, sequenceType);
    }
    
    /**
     * 获取 序列类型  
     * @return
     */
    @JsonIgnore
    public String getSequenceType(){
        Object objValue = this.get(FIELD_SEQUENCETYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 序列类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSequenceTypeDirty(){
        if(this.contains(FIELD_SEQUENCETYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 序列类型
     */
    @JsonIgnore
    public void resetSequenceType(){
        this.reset(FIELD_SEQUENCETYPE);
    }

    /**
     * 设置 序列类型
     * <P>
     * 等同 {@link #setSequenceType}
     * @param sequenceType
     */
    @JsonIgnore
    public PSSysSequence sequencetype(String sequenceType){
        this.setSequenceType(sequenceType);
        return this;
    }

     /**
     * 设置 序列类型
     * <P>
     * 等同 {@link #setSequenceType}
     * @param sequenceType
     */
    @JsonIgnore
    public PSSysSequence sequencetype(net.ibizsys.psmodel.core.util.PSModelEnums.SequenceType sequenceType){
        if(sequenceType == null){
            this.setSequenceType(null);
        }
        else{
            this.setSequenceType(sequenceType.value);
        }
        return this;
    }

    /**
     * <B>TIMEFORMAT</B>&nbsp;时间格式化
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_TIMEFORMAT = "timeformat";

    /**
     * 设置 时间格式化
     * 
     * @param timeFormat
     * 
     */
    @JsonProperty(FIELD_TIMEFORMAT)
    public void setTimeFormat(String timeFormat){
        this.set(FIELD_TIMEFORMAT, timeFormat);
    }
    
    /**
     * 获取 时间格式化  
     * @return
     */
    @JsonIgnore
    public String getTimeFormat(){
        Object objValue = this.get(FIELD_TIMEFORMAT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 时间格式化 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTimeFormatDirty(){
        if(this.contains(FIELD_TIMEFORMAT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 时间格式化
     */
    @JsonIgnore
    public void resetTimeFormat(){
        this.reset(FIELD_TIMEFORMAT);
    }

    /**
     * 设置 时间格式化
     * <P>
     * 等同 {@link #setTimeFormat}
     * @param timeFormat
     */
    @JsonIgnore
    public PSSysSequence timeformat(String timeFormat){
        this.setTimeFormat(timeFormat);
        return this;
    }

    /**
     * <B>TIMEPSDEFID</B>&nbsp;时间属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_TIMEPSDEFID = "timepsdefid";

    /**
     * 设置 时间属性
     * 
     * @param timePSDEFId
     * 
     */
    @JsonProperty(FIELD_TIMEPSDEFID)
    public void setTimePSDEFId(String timePSDEFId){
        this.set(FIELD_TIMEPSDEFID, timePSDEFId);
    }
    
    /**
     * 获取 时间属性  
     * @return
     */
    @JsonIgnore
    public String getTimePSDEFId(){
        Object objValue = this.get(FIELD_TIMEPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 时间属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTimePSDEFIdDirty(){
        if(this.contains(FIELD_TIMEPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 时间属性
     */
    @JsonIgnore
    public void resetTimePSDEFId(){
        this.reset(FIELD_TIMEPSDEFID);
    }

    /**
     * 设置 时间属性
     * <P>
     * 等同 {@link #setTimePSDEFId}
     * @param timePSDEFId
     */
    @JsonIgnore
    public PSSysSequence timepsdefid(String timePSDEFId){
        this.setTimePSDEFId(timePSDEFId);
        return this;
    }

    /**
     * 设置 时间属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTimePSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysSequence timepsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setTimePSDEFId(null);
            this.setTimePSDEFName(null);
        }
        else{
            this.setTimePSDEFId(pSDEField.getPSDEFieldId());
            this.setTimePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>TIMEPSDEFNAME</B>&nbsp;时间属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TIMEPSDEFID}
     */
    public final static String FIELD_TIMEPSDEFNAME = "timepsdefname";

    /**
     * 设置 时间属性
     * 
     * @param timePSDEFName
     * 
     */
    @JsonProperty(FIELD_TIMEPSDEFNAME)
    public void setTimePSDEFName(String timePSDEFName){
        this.set(FIELD_TIMEPSDEFNAME, timePSDEFName);
    }
    
    /**
     * 获取 时间属性  
     * @return
     */
    @JsonIgnore
    public String getTimePSDEFName(){
        Object objValue = this.get(FIELD_TIMEPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 时间属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTimePSDEFNameDirty(){
        if(this.contains(FIELD_TIMEPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 时间属性
     */
    @JsonIgnore
    public void resetTimePSDEFName(){
        this.reset(FIELD_TIMEPSDEFNAME);
    }

    /**
     * 设置 时间属性
     * <P>
     * 等同 {@link #setTimePSDEFName}
     * @param timePSDEFName
     */
    @JsonIgnore
    public PSSysSequence timepsdefname(String timePSDEFName){
        this.setTimePSDEFName(timePSDEFName);
        return this;
    }

    /**
     * <B>TYPEPSDEFID</B>&nbsp;类型属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_TYPEPSDEFID = "typepsdefid";

    /**
     * 设置 类型属性
     * 
     * @param typePSDEFId
     * 
     */
    @JsonProperty(FIELD_TYPEPSDEFID)
    public void setTypePSDEFId(String typePSDEFId){
        this.set(FIELD_TYPEPSDEFID, typePSDEFId);
    }
    
    /**
     * 获取 类型属性  
     * @return
     */
    @JsonIgnore
    public String getTypePSDEFId(){
        Object objValue = this.get(FIELD_TYPEPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 类型属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTypePSDEFIdDirty(){
        if(this.contains(FIELD_TYPEPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 类型属性
     */
    @JsonIgnore
    public void resetTypePSDEFId(){
        this.reset(FIELD_TYPEPSDEFID);
    }

    /**
     * 设置 类型属性
     * <P>
     * 等同 {@link #setTypePSDEFId}
     * @param typePSDEFId
     */
    @JsonIgnore
    public PSSysSequence typepsdefid(String typePSDEFId){
        this.setTypePSDEFId(typePSDEFId);
        return this;
    }

    /**
     * 设置 类型属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTypePSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysSequence typepsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setTypePSDEFId(null);
            this.setTypePSDEFName(null);
        }
        else{
            this.setTypePSDEFId(pSDEField.getPSDEFieldId());
            this.setTypePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>TYPEPSDEFNAME</B>&nbsp;类型属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TYPEPSDEFID}
     */
    public final static String FIELD_TYPEPSDEFNAME = "typepsdefname";

    /**
     * 设置 类型属性
     * 
     * @param typePSDEFName
     * 
     */
    @JsonProperty(FIELD_TYPEPSDEFNAME)
    public void setTypePSDEFName(String typePSDEFName){
        this.set(FIELD_TYPEPSDEFNAME, typePSDEFName);
    }
    
    /**
     * 获取 类型属性  
     * @return
     */
    @JsonIgnore
    public String getTypePSDEFName(){
        Object objValue = this.get(FIELD_TYPEPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 类型属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTypePSDEFNameDirty(){
        if(this.contains(FIELD_TYPEPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 类型属性
     */
    @JsonIgnore
    public void resetTypePSDEFName(){
        this.reset(FIELD_TYPEPSDEFNAME);
    }

    /**
     * 设置 类型属性
     * <P>
     * 等同 {@link #setTypePSDEFName}
     * @param typePSDEFName
     */
    @JsonIgnore
    public PSSysSequence typepsdefname(String typePSDEFName){
        this.setTypePSDEFName(typePSDEFName);
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
    public PSSysSequence updatedate(String updateDate){
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
    public PSSysSequence updateman(String updateMan){
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
    public PSSysSequence user2psdefid(String user2PSDEFId){
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
    public PSSysSequence user2psdefid(PSDEField pSDEField){
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
    public PSSysSequence user2psdefname(String user2PSDEFName){
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
    public PSSysSequence usercat(String userCat){
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
    public PSSysSequence usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysSequence userpsdefid(String userPSDEFId){
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
    public PSSysSequence userpsdefid(PSDEField pSDEField){
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
    public PSSysSequence userpsdefname(String userPSDEFName){
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
    public PSSysSequence usertag(String userTag){
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
    public PSSysSequence usertag2(String userTag2){
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
    public PSSysSequence usertag3(String userTag3){
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
    public PSSysSequence usertag4(String userTag4){
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
    public PSSysSequence validflag(Integer validFlag){
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
    public PSSysSequence validflag(Boolean validFlag){
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
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
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
    public PSSysSequence valuepsdefid(String valuePSDEFId){
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
    public PSSysSequence valuepsdefid(PSDEField pSDEField){
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
    public PSSysSequence valuepsdefname(String valuePSDEFName){
        this.setValuePSDEFName(valuePSDEFName);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysSequenceId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysSequenceId(strValue);
    }

    @JsonIgnore
    public PSSysSequence id(String strValue){
        this.setPSSysSequenceId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysSequence){
            PSSysSequence model = (PSSysSequence)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
