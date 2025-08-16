package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSUBSYSSADE</B>外部接口实体 模型传输对象
 * <P>
 * 外部接口实体模型，定义外部服务接口中的对象，包括代码标识，类型等信息
 */
public class PSSubSysSADEDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSubSysSADEDTO(){
    }      

    /**
     * <B>BASECLSPARAMS</B>&nbsp;基类参数
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_BASECLSPARAMS = "baseclsparams";

    /**
     * 设置 基类参数
     * 
     * @param baseClsParams
     * 
     */
    @JsonProperty(FIELD_BASECLSPARAMS)
    public void setBaseClsParams(String baseClsParams){
        this.set(FIELD_BASECLSPARAMS, baseClsParams);
    }
    
    /**
     * 获取 基类参数  
     * @return
     */
    @JsonIgnore
    public String getBaseClsParams(){
        Object objValue = this.get(FIELD_BASECLSPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 基类参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBaseClsParamsDirty(){
        if(this.contains(FIELD_BASECLSPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 基类参数
     */
    @JsonIgnore
    public void resetBaseClsParams(){
        this.reset(FIELD_BASECLSPARAMS);
    }

    /**
     * 设置 基类参数
     * <P>
     * 等同 {@link #setBaseClsParams}
     * @param baseClsParams
     */
    @JsonIgnore
    public PSSubSysSADEDTO baseclsparams(String baseClsParams){
        this.setBaseClsParams(baseClsParams);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定外部接口实体的代码标识，需在所属外部服务接口中具备唯一性
     * <P>
     * 字符串：最大长度 60，由字母、数字、下划线组成，且开始必须为字母
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
    public PSSubSysSADEDTO codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>CODENAME2</B>&nbsp;代码标识2，指定外部接口实体的代码标识2
     * <P>
     * 字符串：最大长度 60，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_CODENAME2 = "codename2";

    /**
     * 设置 代码标识2，详细说明：{@link #FIELD_CODENAME2}
     * 
     * @param codeName2
     * 
     */
    @JsonProperty(FIELD_CODENAME2)
    public void setCodeName2(String codeName2){
        this.set(FIELD_CODENAME2, codeName2);
    }
    
    /**
     * 获取 代码标识2  
     * @return
     */
    @JsonIgnore
    public String getCodeName2(){
        Object objValue = this.get(FIELD_CODENAME2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码标识2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCodeName2Dirty(){
        if(this.contains(FIELD_CODENAME2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码标识2
     */
    @JsonIgnore
    public void resetCodeName2(){
        this.reset(FIELD_CODENAME2);
    }

    /**
     * 设置 代码标识2，详细说明：{@link #FIELD_CODENAME2}
     * <P>
     * 等同 {@link #setCodeName2}
     * @param codeName2
     */
    @JsonIgnore
    public PSSubSysSADEDTO codename2(String codeName2){
        this.setCodeName2(codeName2);
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
    public PSSubSysSADEDTO createdate(Timestamp createDate){
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
    public PSSubSysSADEDTO createman(String createMan){
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
    public PSSubSysSADEDTO customcode(String customCode){
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
    public PSSubSysSADEDTO custommode(Integer customMode){
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
    public PSSubSysSADEDTO custommode(Boolean customMode){
        if(customMode == null){
            this.setCustomMode(null);
        }
        else{
            this.setCustomMode(customMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DEPARAMS</B>&nbsp;对象参数
     */
    public final static String FIELD_DEPARAMS = "deparams";

    /**
     * 设置 对象参数
     * 
     * @param dEParams
     * 
     */
    @JsonProperty(FIELD_DEPARAMS)
    public void setDEParams(String dEParams){
        this.set(FIELD_DEPARAMS, dEParams);
    }
    
    /**
     * 获取 对象参数  
     * @return
     */
    @JsonIgnore
    public String getDEParams(){
        Object objValue = this.get(FIELD_DEPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 对象参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDEParamsDirty(){
        if(this.contains(FIELD_DEPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 对象参数
     */
    @JsonIgnore
    public void resetDEParams(){
        this.reset(FIELD_DEPARAMS);
    }

    /**
     * 设置 对象参数
     * <P>
     * 等同 {@link #setDEParams}
     * @param dEParams
     */
    @JsonIgnore
    public PSSubSysSADEDTO deparams(String dEParams){
        this.setDEParams(dEParams);
        return this;
    }

    /**
     * <B>DETAG</B>&nbsp;实体标记，指定外部接口实体的标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_DETAG = "detag";

    /**
     * 设置 实体标记，详细说明：{@link #FIELD_DETAG}
     * 
     * @param dETag
     * 
     */
    @JsonProperty(FIELD_DETAG)
    public void setDETag(String dETag){
        this.set(FIELD_DETAG, dETag);
    }
    
    /**
     * 获取 实体标记  
     * @return
     */
    @JsonIgnore
    public String getDETag(){
        Object objValue = this.get(FIELD_DETAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDETagDirty(){
        if(this.contains(FIELD_DETAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体标记
     */
    @JsonIgnore
    public void resetDETag(){
        this.reset(FIELD_DETAG);
    }

    /**
     * 设置 实体标记，详细说明：{@link #FIELD_DETAG}
     * <P>
     * 等同 {@link #setDETag}
     * @param dETag
     */
    @JsonIgnore
    public PSSubSysSADEDTO detag(String dETag){
        this.setDETag(dETag);
        return this;
    }

    /**
     * <B>DETAG2</B>&nbsp;实体标记2，指定外部接口实体的标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_DETAG2 = "detag2";

    /**
     * 设置 实体标记2，详细说明：{@link #FIELD_DETAG2}
     * 
     * @param dETag2
     * 
     */
    @JsonProperty(FIELD_DETAG2)
    public void setDETag2(String dETag2){
        this.set(FIELD_DETAG2, dETag2);
    }
    
    /**
     * 获取 实体标记2  
     * @return
     */
    @JsonIgnore
    public String getDETag2(){
        Object objValue = this.get(FIELD_DETAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDETag2Dirty(){
        if(this.contains(FIELD_DETAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体标记2
     */
    @JsonIgnore
    public void resetDETag2(){
        this.reset(FIELD_DETAG2);
    }

    /**
     * 设置 实体标记2，详细说明：{@link #FIELD_DETAG2}
     * <P>
     * 等同 {@link #setDETag2}
     * @param dETag2
     */
    @JsonIgnore
    public PSSubSysSADEDTO detag2(String dETag2){
        this.setDETag2(dETag2);
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;逻辑名称，指定外部接口实体的逻辑名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_LOGICNAME = "logicname";

    /**
     * 设置 逻辑名称，详细说明：{@link #FIELD_LOGICNAME}
     * 
     * @param logicName
     * 
     */
    @JsonProperty(FIELD_LOGICNAME)
    public void setLogicName(String logicName){
        this.set(FIELD_LOGICNAME, logicName);
    }
    
    /**
     * 获取 逻辑名称  
     * @return
     */
    @JsonIgnore
    public String getLogicName(){
        Object objValue = this.get(FIELD_LOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 逻辑名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLogicNameDirty(){
        if(this.contains(FIELD_LOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 逻辑名称
     */
    @JsonIgnore
    public void resetLogicName(){
        this.reset(FIELD_LOGICNAME);
    }

    /**
     * 设置 逻辑名称，详细说明：{@link #FIELD_LOGICNAME}
     * <P>
     * 等同 {@link #setLogicName}
     * @param logicName
     */
    @JsonIgnore
    public PSSubSysSADEDTO logicname(String logicName){
        this.setLogicName(logicName);
        return this;
    }

    /**
     * <B>MAJORFLAG</B>&nbsp;接口模式，指定外部接口实体的接口模式，未定义时为【主接口】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.SADEMode} 
     */
    public final static String FIELD_MAJORFLAG = "majorflag";

    /**
     * 设置 接口模式，详细说明：{@link #FIELD_MAJORFLAG}
     * 
     * @param majorFlag
     * 
     */
    @JsonProperty(FIELD_MAJORFLAG)
    public void setMajorFlag(Integer majorFlag){
        this.set(FIELD_MAJORFLAG, majorFlag);
    }
    
    /**
     * 获取 接口模式  
     * @return
     */
    @JsonIgnore
    public Integer getMajorFlag(){
        Object objValue = this.get(FIELD_MAJORFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 接口模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMajorFlagDirty(){
        if(this.contains(FIELD_MAJORFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 接口模式
     */
    @JsonIgnore
    public void resetMajorFlag(){
        this.reset(FIELD_MAJORFLAG);
    }

    /**
     * 设置 接口模式，详细说明：{@link #FIELD_MAJORFLAG}
     * <P>
     * 等同 {@link #setMajorFlag}
     * @param majorFlag
     */
    @JsonIgnore
    public PSSubSysSADEDTO majorflag(Integer majorFlag){
        this.setMajorFlag(majorFlag);
        return this;
    }

     /**
     * 设置 接口模式，详细说明：{@link #FIELD_MAJORFLAG}
     * <P>
     * 等同 {@link #setMajorFlag}
     * @param majorFlag
     */
    @JsonIgnore
    public PSSubSysSADEDTO majorflag(net.ibizsys.model.PSModelEnums.SADEMode majorFlag){
        if(majorFlag == null){
            this.setMajorFlag(null);
        }
        else{
            this.setMajorFlag(majorFlag.value);
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
    public PSSubSysSADEDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>METHODCODE</B>&nbsp;方法代码
     */
    public final static String FIELD_METHODCODE = "methodcode";

    /**
     * 设置 方法代码
     * 
     * @param methodCode
     * 
     */
    @JsonProperty(FIELD_METHODCODE)
    public void setMethodCode(String methodCode){
        this.set(FIELD_METHODCODE, methodCode);
    }
    
    /**
     * 获取 方法代码  
     * @return
     */
    @JsonIgnore
    public String getMethodCode(){
        Object objValue = this.get(FIELD_METHODCODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 方法代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMethodCodeDirty(){
        if(this.contains(FIELD_METHODCODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 方法代码
     */
    @JsonIgnore
    public void resetMethodCode(){
        this.reset(FIELD_METHODCODE);
    }

    /**
     * 设置 方法代码
     * <P>
     * 等同 {@link #setMethodCode}
     * @param methodCode
     */
    @JsonIgnore
    public PSSubSysSADEDTO methodcode(String methodCode){
        this.setMethodCode(methodCode);
        return this;
    }

    /**
     * <B>PREDEFINEDTYPE</B>&nbsp;预定义类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.SubSysSADEPredefinedType} 
     */
    public final static String FIELD_PREDEFINEDTYPE = "predefinedtype";

    /**
     * 设置 预定义类型
     * 
     * @param predefinedType
     * 
     */
    @JsonProperty(FIELD_PREDEFINEDTYPE)
    public void setPredefinedType(String predefinedType){
        this.set(FIELD_PREDEFINEDTYPE, predefinedType);
    }
    
    /**
     * 获取 预定义类型  
     * @return
     */
    @JsonIgnore
    public String getPredefinedType(){
        Object objValue = this.get(FIELD_PREDEFINEDTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预定义类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPredefinedTypeDirty(){
        if(this.contains(FIELD_PREDEFINEDTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预定义类型
     */
    @JsonIgnore
    public void resetPredefinedType(){
        this.reset(FIELD_PREDEFINEDTYPE);
    }

    /**
     * 设置 预定义类型
     * <P>
     * 等同 {@link #setPredefinedType}
     * @param predefinedType
     */
    @JsonIgnore
    public PSSubSysSADEDTO predefinedtype(String predefinedType){
        this.setPredefinedType(predefinedType);
        return this;
    }

     /**
     * 设置 预定义类型
     * <P>
     * 等同 {@link #setPredefinedType}
     * @param predefinedType
     */
    @JsonIgnore
    public PSSubSysSADEDTO predefinedtype(net.ibizsys.model.PSModelEnums.SubSysSADEPredefinedType predefinedType){
        if(predefinedType == null){
            this.setPredefinedType(null);
        }
        else{
            this.setPredefinedType(predefinedType.value);
        }
        return this;
    }

    /**
     * <B>PSSUBSYSSADEID</B>&nbsp;子系统接口实体标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSUBSYSSADEID = "pssubsyssadeid";

    /**
     * 设置 子系统接口实体标识
     * 
     * @param pSSubSysSADEId
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSADEID)
    public void setPSSubSysSADEId(String pSSubSysSADEId){
        this.set(FIELD_PSSUBSYSSADEID, pSSubSysSADEId);
    }
    
    /**
     * 获取 子系统接口实体标识  
     * @return
     */
    @JsonIgnore
    public String getPSSubSysSADEId(){
        Object objValue = this.get(FIELD_PSSUBSYSSADEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 子系统接口实体标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubSysSADEIdDirty(){
        if(this.contains(FIELD_PSSUBSYSSADEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 子系统接口实体标识
     */
    @JsonIgnore
    public void resetPSSubSysSADEId(){
        this.reset(FIELD_PSSUBSYSSADEID);
    }

    /**
     * 设置 子系统接口实体标识
     * <P>
     * 等同 {@link #setPSSubSysSADEId}
     * @param pSSubSysSADEId
     */
    @JsonIgnore
    public PSSubSysSADEDTO pssubsyssadeid(String pSSubSysSADEId){
        this.setPSSubSysSADEId(pSSubSysSADEId);
        return this;
    }

    /**
     * <B>PSSUBSYSSADENAME</B>&nbsp;接口实体名称，指定外部接口实体的名称，需在所属外部服务接口中具备唯一性
     * <P>
     * 字符串：最大长度 100，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSSUBSYSSADENAME = "pssubsyssadename";

    /**
     * 设置 接口实体名称，详细说明：{@link #FIELD_PSSUBSYSSADENAME}
     * 
     * @param pSSubSysSADEName
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSADENAME)
    public void setPSSubSysSADEName(String pSSubSysSADEName){
        this.set(FIELD_PSSUBSYSSADENAME, pSSubSysSADEName);
    }
    
    /**
     * 获取 接口实体名称  
     * @return
     */
    @JsonIgnore
    public String getPSSubSysSADEName(){
        Object objValue = this.get(FIELD_PSSUBSYSSADENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 接口实体名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubSysSADENameDirty(){
        if(this.contains(FIELD_PSSUBSYSSADENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 接口实体名称
     */
    @JsonIgnore
    public void resetPSSubSysSADEName(){
        this.reset(FIELD_PSSUBSYSSADENAME);
    }

    /**
     * 设置 接口实体名称，详细说明：{@link #FIELD_PSSUBSYSSADENAME}
     * <P>
     * 等同 {@link #setPSSubSysSADEName}
     * @param pSSubSysSADEName
     */
    @JsonIgnore
    public PSSubSysSADEDTO pssubsyssadename(String pSSubSysSADEName){
        this.setPSSubSysSADEName(pSSubSysSADEName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSubSysSADEName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSubSysSADEName(strName);
    }

    @JsonIgnore
    public PSSubSysSADEDTO name(String strName){
        this.setPSSubSysSADEName(strName);
        return this;
    }

    /**
     * <B>PSSUBSYSSERVICEAPIID</B>&nbsp;外部服务接口，指定外部接口实体所属的外部服务接口
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSubSysServiceAPIDTO} 
     */
    public final static String FIELD_PSSUBSYSSERVICEAPIID = "pssubsysserviceapiid";

    /**
     * 设置 外部服务接口，详细说明：{@link #FIELD_PSSUBSYSSERVICEAPIID}
     * 
     * @param pSSubSysServiceAPIId
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSERVICEAPIID)
    public void setPSSubSysServiceAPIId(String pSSubSysServiceAPIId){
        this.set(FIELD_PSSUBSYSSERVICEAPIID, pSSubSysServiceAPIId);
    }
    
    /**
     * 获取 外部服务接口  
     * @return
     */
    @JsonIgnore
    public String getPSSubSysServiceAPIId(){
        Object objValue = this.get(FIELD_PSSUBSYSSERVICEAPIID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 外部服务接口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubSysServiceAPIIdDirty(){
        if(this.contains(FIELD_PSSUBSYSSERVICEAPIID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 外部服务接口
     */
    @JsonIgnore
    public void resetPSSubSysServiceAPIId(){
        this.reset(FIELD_PSSUBSYSSERVICEAPIID);
    }

    /**
     * 设置 外部服务接口，详细说明：{@link #FIELD_PSSUBSYSSERVICEAPIID}
     * <P>
     * 等同 {@link #setPSSubSysServiceAPIId}
     * @param pSSubSysServiceAPIId
     */
    @JsonIgnore
    public PSSubSysSADEDTO pssubsysserviceapiid(String pSSubSysServiceAPIId){
        this.setPSSubSysServiceAPIId(pSSubSysServiceAPIId);
        return this;
    }

    /**
     * 设置 外部服务接口，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSubSysServiceAPIId}
     * @param pSSubSysServiceAPI 引用对象
     */
    @JsonIgnore
    public PSSubSysSADEDTO pssubsysserviceapiid(PSSubSysServiceAPIDTO pSSubSysServiceAPI){
        if(pSSubSysServiceAPI == null){
            this.setPSSubSysServiceAPIId(null);
            this.setPSSubSysServiceAPIName(null);
        }
        else{
            this.setPSSubSysServiceAPIId(pSSubSysServiceAPI.getPSSubSysServiceAPIId());
            this.setPSSubSysServiceAPIName(pSSubSysServiceAPI.getPSSubSysServiceAPIName());
        }
        return this;
    }

    /**
     * <B>PSSUBSYSSERVICEAPINAME</B>&nbsp;外部服务接口，指定外部接口实体所属的外部服务接口
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSUBSYSSERVICEAPIID}
     */
    public final static String FIELD_PSSUBSYSSERVICEAPINAME = "pssubsysserviceapiname";

    /**
     * 设置 外部服务接口，详细说明：{@link #FIELD_PSSUBSYSSERVICEAPINAME}
     * 
     * @param pSSubSysServiceAPIName
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSERVICEAPINAME)
    public void setPSSubSysServiceAPIName(String pSSubSysServiceAPIName){
        this.set(FIELD_PSSUBSYSSERVICEAPINAME, pSSubSysServiceAPIName);
    }
    
    /**
     * 获取 外部服务接口  
     * @return
     */
    @JsonIgnore
    public String getPSSubSysServiceAPIName(){
        Object objValue = this.get(FIELD_PSSUBSYSSERVICEAPINAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 外部服务接口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubSysServiceAPINameDirty(){
        if(this.contains(FIELD_PSSUBSYSSERVICEAPINAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 外部服务接口
     */
    @JsonIgnore
    public void resetPSSubSysServiceAPIName(){
        this.reset(FIELD_PSSUBSYSSERVICEAPINAME);
    }

    /**
     * 设置 外部服务接口，详细说明：{@link #FIELD_PSSUBSYSSERVICEAPINAME}
     * <P>
     * 等同 {@link #setPSSubSysServiceAPIName}
     * @param pSSubSysServiceAPIName
     */
    @JsonIgnore
    public PSSubSysSADEDTO pssubsysserviceapiname(String pSSubSysServiceAPIName){
        this.setPSSubSysServiceAPIName(pSSubSysServiceAPIName);
        return this;
    }

    /**
     * <B>PSSYSREQITEMID</B>&nbsp;系统设计需求
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysReqItemDTO} 
     */
    public final static String FIELD_PSSYSREQITEMID = "pssysreqitemid";

    /**
     * 设置 系统设计需求
     * 
     * @param pSSysReqItemId
     * 
     */
    @JsonProperty(FIELD_PSSYSREQITEMID)
    public void setPSSysReqItemId(String pSSysReqItemId){
        this.set(FIELD_PSSYSREQITEMID, pSSysReqItemId);
    }
    
    /**
     * 获取 系统设计需求  
     * @return
     */
    @JsonIgnore
    public String getPSSysReqItemId(){
        Object objValue = this.get(FIELD_PSSYSREQITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统设计需求 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysReqItemIdDirty(){
        if(this.contains(FIELD_PSSYSREQITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统设计需求
     */
    @JsonIgnore
    public void resetPSSysReqItemId(){
        this.reset(FIELD_PSSYSREQITEMID);
    }

    /**
     * 设置 系统设计需求
     * <P>
     * 等同 {@link #setPSSysReqItemId}
     * @param pSSysReqItemId
     */
    @JsonIgnore
    public PSSubSysSADEDTO pssysreqitemid(String pSSysReqItemId){
        this.setPSSysReqItemId(pSSysReqItemId);
        return this;
    }

    /**
     * 设置 系统设计需求，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysReqItemId}
     * @param pSSysReqItem 引用对象
     */
    @JsonIgnore
    public PSSubSysSADEDTO pssysreqitemid(PSSysReqItemDTO pSSysReqItem){
        if(pSSysReqItem == null){
            this.setPSSysReqItemId(null);
            this.setPSSysReqItemName(null);
        }
        else{
            this.setPSSysReqItemId(pSSysReqItem.getPSSysReqItemId());
            this.setPSSysReqItemName(pSSysReqItem.getPSSysReqItemName());
        }
        return this;
    }

    /**
     * <B>PSSYSREQITEMNAME</B>&nbsp;系统设计需求
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSREQITEMID}
     */
    public final static String FIELD_PSSYSREQITEMNAME = "pssysreqitemname";

    /**
     * 设置 系统设计需求
     * 
     * @param pSSysReqItemName
     * 
     */
    @JsonProperty(FIELD_PSSYSREQITEMNAME)
    public void setPSSysReqItemName(String pSSysReqItemName){
        this.set(FIELD_PSSYSREQITEMNAME, pSSysReqItemName);
    }
    
    /**
     * 获取 系统设计需求  
     * @return
     */
    @JsonIgnore
    public String getPSSysReqItemName(){
        Object objValue = this.get(FIELD_PSSYSREQITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统设计需求 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysReqItemNameDirty(){
        if(this.contains(FIELD_PSSYSREQITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统设计需求
     */
    @JsonIgnore
    public void resetPSSysReqItemName(){
        this.reset(FIELD_PSSYSREQITEMNAME);
    }

    /**
     * 设置 系统设计需求
     * <P>
     * 等同 {@link #setPSSysReqItemName}
     * @param pSSysReqItemName
     */
    @JsonIgnore
    public PSSubSysSADEDTO pssysreqitemname(String pSSysReqItemName){
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINID</B>&nbsp;后台扩展插件，指定外部接口实体使用的后台模板扩展插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysSFPluginDTO} 
     */
    public final static String FIELD_PSSYSSFPLUGINID = "pssyssfpluginid";

    /**
     * 设置 后台扩展插件，详细说明：{@link #FIELD_PSSYSSFPLUGINID}
     * 
     * @param pSSysSFPluginId
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINID)
    public void setPSSysSFPluginId(String pSSysSFPluginId){
        this.set(FIELD_PSSYSSFPLUGINID, pSSysSFPluginId);
    }
    
    /**
     * 获取 后台扩展插件  
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
     * 判断 后台扩展插件 是否指定值，包括空值
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
     * 重置 后台扩展插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginId(){
        this.reset(FIELD_PSSYSSFPLUGINID);
    }

    /**
     * 设置 后台扩展插件，详细说明：{@link #FIELD_PSSYSSFPLUGINID}
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPluginId
     */
    @JsonIgnore
    public PSSubSysSADEDTO pssyssfpluginid(String pSSysSFPluginId){
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    /**
     * 设置 后台扩展插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPlugin 引用对象
     */
    @JsonIgnore
    public PSSubSysSADEDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin){
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
     * <B>PSSYSSFPLUGINNAME</B>&nbsp;后台扩展插件，指定外部接口实体使用的后台模板扩展插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSFPLUGINID}
     */
    public final static String FIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";

    /**
     * 设置 后台扩展插件，详细说明：{@link #FIELD_PSSYSSFPLUGINNAME}
     * 
     * @param pSSysSFPluginName
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINNAME)
    public void setPSSysSFPluginName(String pSSysSFPluginName){
        this.set(FIELD_PSSYSSFPLUGINNAME, pSSysSFPluginName);
    }
    
    /**
     * 获取 后台扩展插件  
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
     * 判断 后台扩展插件 是否指定值，包括空值
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
     * 重置 后台扩展插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginName(){
        this.reset(FIELD_PSSYSSFPLUGINNAME);
    }

    /**
     * 设置 后台扩展插件，详细说明：{@link #FIELD_PSSYSSFPLUGINNAME}
     * <P>
     * 等同 {@link #setPSSysSFPluginName}
     * @param pSSysSFPluginName
     */
    @JsonIgnore
    public PSSubSysSADEDTO pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    /**
     * <B>SYNCMODELMODE</B>&nbsp;同步模型模式，指定服务接口实体的同步模式，未定义时为【不同步】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.SADESyncMode} 
     */
    public final static String FIELD_SYNCMODELMODE = "syncmodelmode";

    /**
     * 设置 同步模型模式，详细说明：{@link #FIELD_SYNCMODELMODE}
     * 
     * @param syncModelMode
     * 
     */
    @JsonProperty(FIELD_SYNCMODELMODE)
    public void setSyncModelMode(String syncModelMode){
        this.set(FIELD_SYNCMODELMODE, syncModelMode);
    }
    
    /**
     * 获取 同步模型模式  
     * @return
     */
    @JsonIgnore
    public String getSyncModelMode(){
        Object objValue = this.get(FIELD_SYNCMODELMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 同步模型模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSyncModelModeDirty(){
        if(this.contains(FIELD_SYNCMODELMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 同步模型模式
     */
    @JsonIgnore
    public void resetSyncModelMode(){
        this.reset(FIELD_SYNCMODELMODE);
    }

    /**
     * 设置 同步模型模式，详细说明：{@link #FIELD_SYNCMODELMODE}
     * <P>
     * 等同 {@link #setSyncModelMode}
     * @param syncModelMode
     */
    @JsonIgnore
    public PSSubSysSADEDTO syncmodelmode(String syncModelMode){
        this.setSyncModelMode(syncModelMode);
        return this;
    }

     /**
     * 设置 同步模型模式，详细说明：{@link #FIELD_SYNCMODELMODE}
     * <P>
     * 等同 {@link #setSyncModelMode}
     * @param syncModelMode
     */
    @JsonIgnore
    public PSSubSysSADEDTO syncmodelmode(net.ibizsys.model.PSModelEnums.SADESyncMode syncModelMode){
        if(syncModelMode == null){
            this.setSyncModelMode(null);
        }
        else{
            this.setSyncModelMode(syncModelMode.value);
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
    public PSSubSysSADEDTO updatedate(Timestamp updateDate){
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
    public PSSubSysSADEDTO updateman(String updateMan){
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
    public PSSubSysSADEDTO usercat(String userCat){
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
    public PSSubSysSADEDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSSubSysSADEDTO usertag(String userTag){
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
    public PSSubSysSADEDTO usertag2(String userTag2){
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
    public PSSubSysSADEDTO usertag3(String userTag3){
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
    public PSSubSysSADEDTO usertag4(String userTag4){
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
    public PSSubSysSADEDTO validflag(Integer validFlag){
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
    public PSSubSysSADEDTO validflag(Boolean validFlag){
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
        return this.getPSSubSysSADEId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSubSysSADEId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSubSysSADEId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSubSysSADEId(strValue);
    }

    @JsonIgnore
    public PSSubSysSADEDTO id(String strValue){
        this.setPSSubSysSADEId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSubSysSADEDTO){
            PSSubSysSADEDTO dto = (PSSubSysSADEDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
