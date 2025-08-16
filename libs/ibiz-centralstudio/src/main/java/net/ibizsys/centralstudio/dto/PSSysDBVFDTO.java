package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSDBVF</B>系统值函数 模型传输对象
 * <P>
 * 
 */
public class PSSysDBVFDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysDBVFDTO(){
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识
     * <P>
     * 字符串：最大长度 30，由字母、数字、下划线及点号组成，且开始必须字母
     */
    public final static String FIELD_CODENAME = "codename";

    /**
     * 设置 代码标识
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
     * 设置 代码标识
     * <P>
     * 等同 {@link #setCodeName}
     * @param codeName
     */
    @JsonIgnore
    public PSSysDBVFDTO codename(String codeName){
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
    public PSSysDBVFDTO createdate(Timestamp createDate){
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
    public PSSysDBVFDTO createman(String createMan){
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
    public PSSysDBVFDTO customcode(String customCode){
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
    public PSSysDBVFDTO custommode(Integer customMode){
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
    public PSSysDBVFDTO custommode(Boolean customMode){
        if(customMode == null){
            this.setCustomMode(null);
        }
        else{
            this.setCustomMode(customMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>INPUTSTDDATATYPE</B>&nbsp;输入数据类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.StdDataType} 
     */
    public final static String FIELD_INPUTSTDDATATYPE = "inputstddatatype";

    /**
     * 设置 输入数据类型
     * 
     * @param inputStdDataType
     * 
     */
    @JsonProperty(FIELD_INPUTSTDDATATYPE)
    public void setInputStdDataType(Integer inputStdDataType){
        this.set(FIELD_INPUTSTDDATATYPE, inputStdDataType);
    }
    
    /**
     * 获取 输入数据类型  
     * @return
     */
    @JsonIgnore
    public Integer getInputStdDataType(){
        Object objValue = this.get(FIELD_INPUTSTDDATATYPE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 输入数据类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isInputStdDataTypeDirty(){
        if(this.contains(FIELD_INPUTSTDDATATYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输入数据类型
     */
    @JsonIgnore
    public void resetInputStdDataType(){
        this.reset(FIELD_INPUTSTDDATATYPE);
    }

    /**
     * 设置 输入数据类型
     * <P>
     * 等同 {@link #setInputStdDataType}
     * @param inputStdDataType
     */
    @JsonIgnore
    public PSSysDBVFDTO inputstddatatype(Integer inputStdDataType){
        this.setInputStdDataType(inputStdDataType);
        return this;
    }

     /**
     * 设置 输入数据类型
     * <P>
     * 等同 {@link #setInputStdDataType}
     * @param inputStdDataType
     */
    @JsonIgnore
    public PSSysDBVFDTO inputstddatatype(net.ibizsys.model.PSModelEnums.StdDataType inputStdDataType){
        if(inputStdDataType == null){
            this.setInputStdDataType(null);
        }
        else{
            this.setInputStdDataType(inputStdDataType.value);
        }
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;逻辑名称
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_LOGICNAME = "logicname";

    /**
     * 设置 逻辑名称
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
     * 设置 逻辑名称
     * <P>
     * 等同 {@link #setLogicName}
     * @param logicName
     */
    @JsonIgnore
    public PSSysDBVFDTO logicname(String logicName){
        this.setLogicName(logicName);
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
    public PSSysDBVFDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;排序值
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 排序值
     * 
     * @param orderValue
     * 
     */
    @JsonProperty(FIELD_ORDERVALUE)
    public void setOrderValue(Integer orderValue){
        this.set(FIELD_ORDERVALUE, orderValue);
    }
    
    /**
     * 获取 排序值  
     * @return
     */
    @JsonIgnore
    public Integer getOrderValue(){
        Object objValue = this.get(FIELD_ORDERVALUE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 排序值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOrderValueDirty(){
        if(this.contains(FIELD_ORDERVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 排序值
     */
    @JsonIgnore
    public void resetOrderValue(){
        this.reset(FIELD_ORDERVALUE);
    }

    /**
     * 设置 排序值
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSSysDBVFDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>OUTPUTSTDDATATYPE</B>&nbsp;输出数据类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.StdDataType} 
     */
    public final static String FIELD_OUTPUTSTDDATATYPE = "outputstddatatype";

    /**
     * 设置 输出数据类型
     * 
     * @param outputStdDataType
     * 
     */
    @JsonProperty(FIELD_OUTPUTSTDDATATYPE)
    public void setOutputStdDataType(Integer outputStdDataType){
        this.set(FIELD_OUTPUTSTDDATATYPE, outputStdDataType);
    }
    
    /**
     * 获取 输出数据类型  
     * @return
     */
    @JsonIgnore
    public Integer getOutputStdDataType(){
        Object objValue = this.get(FIELD_OUTPUTSTDDATATYPE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 输出数据类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOutputStdDataTypeDirty(){
        if(this.contains(FIELD_OUTPUTSTDDATATYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输出数据类型
     */
    @JsonIgnore
    public void resetOutputStdDataType(){
        this.reset(FIELD_OUTPUTSTDDATATYPE);
    }

    /**
     * 设置 输出数据类型
     * <P>
     * 等同 {@link #setOutputStdDataType}
     * @param outputStdDataType
     */
    @JsonIgnore
    public PSSysDBVFDTO outputstddatatype(Integer outputStdDataType){
        this.setOutputStdDataType(outputStdDataType);
        return this;
    }

     /**
     * 设置 输出数据类型
     * <P>
     * 等同 {@link #setOutputStdDataType}
     * @param outputStdDataType
     */
    @JsonIgnore
    public PSSysDBVFDTO outputstddatatype(net.ibizsys.model.PSModelEnums.StdDataType outputStdDataType){
        if(outputStdDataType == null){
            this.setOutputStdDataType(null);
        }
        else{
            this.setOutputStdDataType(outputStdDataType.value);
        }
        return this;
    }

    /**
     * <B>OUTPUTVALUEFORMAT</B>&nbsp;输出值格式化
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_OUTPUTVALUEFORMAT = "outputvalueformat";

    /**
     * 设置 输出值格式化
     * 
     * @param outputValueFormat
     * 
     */
    @JsonProperty(FIELD_OUTPUTVALUEFORMAT)
    public void setOutputValueFormat(String outputValueFormat){
        this.set(FIELD_OUTPUTVALUEFORMAT, outputValueFormat);
    }
    
    /**
     * 获取 输出值格式化  
     * @return
     */
    @JsonIgnore
    public String getOutputValueFormat(){
        Object objValue = this.get(FIELD_OUTPUTVALUEFORMAT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输出值格式化 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOutputValueFormatDirty(){
        if(this.contains(FIELD_OUTPUTVALUEFORMAT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输出值格式化
     */
    @JsonIgnore
    public void resetOutputValueFormat(){
        this.reset(FIELD_OUTPUTVALUEFORMAT);
    }

    /**
     * 设置 输出值格式化
     * <P>
     * 等同 {@link #setOutputValueFormat}
     * @param outputValueFormat
     */
    @JsonIgnore
    public PSSysDBVFDTO outputvalueformat(String outputValueFormat){
        this.setOutputValueFormat(outputValueFormat);
        return this;
    }

    /**
     * <B>PSDBVFID</B>&nbsp;云平台数据库值函数
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDBVFID = "psdbvfid";

    /**
     * 设置 云平台数据库值函数
     * 
     * @param pSDBVFId
     * 
     */
    @JsonProperty(FIELD_PSDBVFID)
    public void setPSDBVFId(String pSDBVFId){
        this.set(FIELD_PSDBVFID, pSDBVFId);
    }
    
    /**
     * 获取 云平台数据库值函数  
     * @return
     */
    @JsonIgnore
    public String getPSDBVFId(){
        Object objValue = this.get(FIELD_PSDBVFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 云平台数据库值函数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDBVFIdDirty(){
        if(this.contains(FIELD_PSDBVFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 云平台数据库值函数
     */
    @JsonIgnore
    public void resetPSDBVFId(){
        this.reset(FIELD_PSDBVFID);
    }

    /**
     * 设置 云平台数据库值函数
     * <P>
     * 等同 {@link #setPSDBVFId}
     * @param pSDBVFId
     */
    @JsonIgnore
    public PSSysDBVFDTO psdbvfid(String pSDBVFId){
        this.setPSDBVFId(pSDBVFId);
        return this;
    }

    /**
     * <B>PSDBVFNAME</B>&nbsp;云平台数据库值函数
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDBVFID}
     */
    public final static String FIELD_PSDBVFNAME = "psdbvfname";

    /**
     * 设置 云平台数据库值函数
     * 
     * @param pSDBVFName
     * 
     */
    @JsonProperty(FIELD_PSDBVFNAME)
    public void setPSDBVFName(String pSDBVFName){
        this.set(FIELD_PSDBVFNAME, pSDBVFName);
    }
    
    /**
     * 获取 云平台数据库值函数  
     * @return
     */
    @JsonIgnore
    public String getPSDBVFName(){
        Object objValue = this.get(FIELD_PSDBVFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 云平台数据库值函数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDBVFNameDirty(){
        if(this.contains(FIELD_PSDBVFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 云平台数据库值函数
     */
    @JsonIgnore
    public void resetPSDBVFName(){
        this.reset(FIELD_PSDBVFNAME);
    }

    /**
     * 设置 云平台数据库值函数
     * <P>
     * 等同 {@link #setPSDBVFName}
     * @param pSDBVFName
     */
    @JsonIgnore
    public PSSysDBVFDTO psdbvfname(String pSDBVFName){
        this.setPSDBVFName(pSDBVFName);
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
    public PSSysDBVFDTO psmoduleid(String pSModuleId){
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
    public PSSysDBVFDTO psmoduleid(PSModuleDTO pSModule){
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
    public PSSysDBVFDTO psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSYSDBVFID</B>&nbsp;系统数据库值函数标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSDBVFID = "pssysdbvfid";

    /**
     * 设置 系统数据库值函数标识
     * 
     * @param pSSysDBVFId
     * 
     */
    @JsonProperty(FIELD_PSSYSDBVFID)
    public void setPSSysDBVFId(String pSSysDBVFId){
        this.set(FIELD_PSSYSDBVFID, pSSysDBVFId);
    }
    
    /**
     * 获取 系统数据库值函数标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysDBVFId(){
        Object objValue = this.get(FIELD_PSSYSDBVFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统数据库值函数标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDBVFIdDirty(){
        if(this.contains(FIELD_PSSYSDBVFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统数据库值函数标识
     */
    @JsonIgnore
    public void resetPSSysDBVFId(){
        this.reset(FIELD_PSSYSDBVFID);
    }

    /**
     * 设置 系统数据库值函数标识
     * <P>
     * 等同 {@link #setPSSysDBVFId}
     * @param pSSysDBVFId
     */
    @JsonIgnore
    public PSSysDBVFDTO pssysdbvfid(String pSSysDBVFId){
        this.setPSSysDBVFId(pSSysDBVFId);
        return this;
    }

    /**
     * <B>PSSYSDBVFNAME</B>&nbsp;函数名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSDBVFNAME = "pssysdbvfname";

    /**
     * 设置 函数名称
     * 
     * @param pSSysDBVFName
     * 
     */
    @JsonProperty(FIELD_PSSYSDBVFNAME)
    public void setPSSysDBVFName(String pSSysDBVFName){
        this.set(FIELD_PSSYSDBVFNAME, pSSysDBVFName);
    }
    
    /**
     * 获取 函数名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysDBVFName(){
        Object objValue = this.get(FIELD_PSSYSDBVFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 函数名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDBVFNameDirty(){
        if(this.contains(FIELD_PSSYSDBVFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 函数名称
     */
    @JsonIgnore
    public void resetPSSysDBVFName(){
        this.reset(FIELD_PSSYSDBVFNAME);
    }

    /**
     * 设置 函数名称
     * <P>
     * 等同 {@link #setPSSysDBVFName}
     * @param pSSysDBVFName
     */
    @JsonIgnore
    public PSSysDBVFDTO pssysdbvfname(String pSSysDBVFName){
        this.setPSSysDBVFName(pSSysDBVFName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysDBVFName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysDBVFName(strName);
    }

    @JsonIgnore
    public PSSysDBVFDTO name(String strName){
        this.setPSSysDBVFName(strName);
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
    public PSSysDBVFDTO pssysdynamodelid(String pSSysDynaModelId){
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
    public PSSysDBVFDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel){
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
    public PSSysDBVFDTO pssysdynamodelname(String pSSysDynaModelName){
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
    public PSSysDBVFDTO pssyssfpluginid(String pSSysSFPluginId){
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
    public PSSysDBVFDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin){
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
    public PSSysDBVFDTO pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
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
    public PSSysDBVFDTO updatedate(Timestamp updateDate){
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
    public PSSysDBVFDTO updateman(String updateMan){
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
    public PSSysDBVFDTO usercat(String userCat){
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
    public PSSysDBVFDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSSysDBVFDTO usertag(String userTag){
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
    public PSSysDBVFDTO usertag2(String userTag2){
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
    public PSSysDBVFDTO usertag3(String userTag3){
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
    public PSSysDBVFDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>UXCODENAME</B>&nbsp;用户扩展代码标识
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_UXCODENAME = "uxcodename";

    /**
     * 设置 用户扩展代码标识
     * 
     * @param uXCodeName
     * 
     */
    @JsonProperty(FIELD_UXCODENAME)
    public void setUXCodeName(String uXCodeName){
        this.set(FIELD_UXCODENAME, uXCodeName);
    }
    
    /**
     * 获取 用户扩展代码标识  
     * @return
     */
    @JsonIgnore
    public String getUXCodeName(){
        Object objValue = this.get(FIELD_UXCODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户扩展代码标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUXCodeNameDirty(){
        if(this.contains(FIELD_UXCODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户扩展代码标识
     */
    @JsonIgnore
    public void resetUXCodeName(){
        this.reset(FIELD_UXCODENAME);
    }

    /**
     * 设置 用户扩展代码标识
     * <P>
     * 等同 {@link #setUXCodeName}
     * @param uXCodeName
     */
    @JsonIgnore
    public PSSysDBVFDTO uxcodename(String uXCodeName){
        this.setUXCodeName(uXCodeName);
        return this;
    }

    /**
     * <B>VFTAG</B>&nbsp;值函数标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_VFTAG = "vftag";

    /**
     * 设置 值函数标记
     * 
     * @param vFTag
     * 
     */
    @JsonProperty(FIELD_VFTAG)
    public void setVFTag(String vFTag){
        this.set(FIELD_VFTAG, vFTag);
    }
    
    /**
     * 获取 值函数标记  
     * @return
     */
    @JsonIgnore
    public String getVFTag(){
        Object objValue = this.get(FIELD_VFTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值函数标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isVFTagDirty(){
        if(this.contains(FIELD_VFTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值函数标记
     */
    @JsonIgnore
    public void resetVFTag(){
        this.reset(FIELD_VFTAG);
    }

    /**
     * 设置 值函数标记
     * <P>
     * 等同 {@link #setVFTag}
     * @param vFTag
     */
    @JsonIgnore
    public PSSysDBVFDTO vftag(String vFTag){
        this.setVFTag(vFTag);
        return this;
    }

    /**
     * <B>VFTAG2</B>&nbsp;值函数标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_VFTAG2 = "vftag2";

    /**
     * 设置 值函数标记2
     * 
     * @param vFTag2
     * 
     */
    @JsonProperty(FIELD_VFTAG2)
    public void setVFTag2(String vFTag2){
        this.set(FIELD_VFTAG2, vFTag2);
    }
    
    /**
     * 获取 值函数标记2  
     * @return
     */
    @JsonIgnore
    public String getVFTag2(){
        Object objValue = this.get(FIELD_VFTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值函数标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isVFTag2Dirty(){
        if(this.contains(FIELD_VFTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值函数标记2
     */
    @JsonIgnore
    public void resetVFTag2(){
        this.reset(FIELD_VFTAG2);
    }

    /**
     * 设置 值函数标记2
     * <P>
     * 等同 {@link #setVFTag2}
     * @param vFTag2
     */
    @JsonIgnore
    public PSSysDBVFDTO vftag2(String vFTag2){
        this.setVFTag2(vFTag2);
        return this;
    }

    /**
     * <B>VFTYPE</B>&nbsp;函数类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DBValueFuncType} 
     */
    public final static String FIELD_VFTYPE = "vftype";

    /**
     * 设置 函数类型
     * 
     * @param vFType
     * 
     */
    @JsonProperty(FIELD_VFTYPE)
    public void setVFType(String vFType){
        this.set(FIELD_VFTYPE, vFType);
    }
    
    /**
     * 获取 函数类型  
     * @return
     */
    @JsonIgnore
    public String getVFType(){
        Object objValue = this.get(FIELD_VFTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 函数类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isVFTypeDirty(){
        if(this.contains(FIELD_VFTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 函数类型
     */
    @JsonIgnore
    public void resetVFType(){
        this.reset(FIELD_VFTYPE);
    }

    /**
     * 设置 函数类型
     * <P>
     * 等同 {@link #setVFType}
     * @param vFType
     */
    @JsonIgnore
    public PSSysDBVFDTO vftype(String vFType){
        this.setVFType(vFType);
        return this;
    }

     /**
     * 设置 函数类型
     * <P>
     * 等同 {@link #setVFType}
     * @param vFType
     */
    @JsonIgnore
    public PSSysDBVFDTO vftype(net.ibizsys.model.PSModelEnums.DBValueFuncType vFType){
        if(vFType == null){
            this.setVFType(null);
        }
        else{
            this.setVFType(vFType.value);
        }
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSSysDBVFId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysDBVFId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysDBVFId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysDBVFId(strValue);
    }

    @JsonIgnore
    public PSSysDBVFDTO id(String strValue){
        this.setPSSysDBVFId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysDBVFDTO){
            PSSysDBVFDTO dto = (PSSysDBVFDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
