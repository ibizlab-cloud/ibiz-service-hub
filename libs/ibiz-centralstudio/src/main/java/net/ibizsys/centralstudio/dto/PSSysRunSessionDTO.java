package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSRUNSESSION</B>系统运行会话 模型传输对象
 * <P>
 * 
 */
public class PSSysRunSessionDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysRunSessionDTO(){
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
    public PSSysRunSessionDTO createdate(Timestamp createDate){
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
    public PSSysRunSessionDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DEBUGMODE</B>&nbsp;输出调试信息
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEBUGMODE = "debugmode";

    /**
     * 设置 输出调试信息
     * 
     * @param debugMode
     * 
     */
    @JsonProperty(FIELD_DEBUGMODE)
    public void setDebugMode(Integer debugMode){
        this.set(FIELD_DEBUGMODE, debugMode);
    }
    
    /**
     * 获取 输出调试信息  
     * @return
     */
    @JsonIgnore
    public Integer getDebugMode(){
        Object objValue = this.get(FIELD_DEBUGMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 输出调试信息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDebugModeDirty(){
        if(this.contains(FIELD_DEBUGMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输出调试信息
     */
    @JsonIgnore
    public void resetDebugMode(){
        this.reset(FIELD_DEBUGMODE);
    }

    /**
     * 设置 输出调试信息
     * <P>
     * 等同 {@link #setDebugMode}
     * @param debugMode
     */
    @JsonIgnore
    public PSSysRunSessionDTO debugmode(Integer debugMode){
        this.setDebugMode(debugMode);
        return this;
    }

     /**
     * 设置 输出调试信息
     * <P>
     * 等同 {@link #setDebugMode}
     * @param debugMode
     */
    @JsonIgnore
    public PSSysRunSessionDTO debugmode(Boolean debugMode){
        if(debugMode == null){
            this.setDebugMode(null);
        }
        else{
            this.setDebugMode(debugMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEVC</B>&nbsp;签入版本库
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEVC = "enablevc";

    /**
     * 设置 签入版本库
     * 
     * @param enableVC
     * 
     */
    @JsonProperty(FIELD_ENABLEVC)
    public void setEnableVC(Integer enableVC){
        this.set(FIELD_ENABLEVC, enableVC);
    }
    
    /**
     * 获取 签入版本库  
     * @return
     */
    @JsonIgnore
    public Integer getEnableVC(){
        Object objValue = this.get(FIELD_ENABLEVC);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 签入版本库 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableVCDirty(){
        if(this.contains(FIELD_ENABLEVC)){
            return true;
        }
        return false;
    }

    /**
     * 重置 签入版本库
     */
    @JsonIgnore
    public void resetEnableVC(){
        this.reset(FIELD_ENABLEVC);
    }

    /**
     * 设置 签入版本库
     * <P>
     * 等同 {@link #setEnableVC}
     * @param enableVC
     */
    @JsonIgnore
    public PSSysRunSessionDTO enablevc(Integer enableVC){
        this.setEnableVC(enableVC);
        return this;
    }

     /**
     * 设置 签入版本库
     * <P>
     * 等同 {@link #setEnableVC}
     * @param enableVC
     */
    @JsonIgnore
    public PSSysRunSessionDTO enablevc(Boolean enableVC){
        if(enableVC == null){
            this.setEnableVC(null);
        }
        else{
            this.setEnableVC(enableVC?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENDTIME</B>&nbsp;结束时间
     */
    public final static String FIELD_ENDTIME = "endtime";

    /**
     * 设置 结束时间
     * 
     * @param endTime
     * 
     */
    @JsonProperty(FIELD_ENDTIME)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setEndTime(Timestamp endTime){
        this.set(FIELD_ENDTIME, endTime);
    }
    
    /**
     * 获取 结束时间  
     * @return
     */
    @JsonIgnore
    public Timestamp getEndTime(){
        Object objValue = this.get(FIELD_ENDTIME);
        if(objValue==null){
            return null;
        }
        return (Timestamp)objValue;
    }

    /**
     * 判断 结束时间 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEndTimeDirty(){
        if(this.contains(FIELD_ENDTIME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 结束时间
     */
    @JsonIgnore
    public void resetEndTime(){
        this.reset(FIELD_ENDTIME);
    }

    /**
     * 设置 结束时间
     * <P>
     * 等同 {@link #setEndTime}
     * @param endTime
     */
    @JsonIgnore
    public PSSysRunSessionDTO endtime(Timestamp endTime){
        this.setEndTime(endTime);
        return this;
    }

    /**
     * <B>FIXDBMODEL</B>&nbsp;修复数据结构
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_FIXDBMODEL = "fixdbmodel";

    /**
     * 设置 修复数据结构
     * 
     * @param fixDBModel
     * 
     */
    @JsonProperty(FIELD_FIXDBMODEL)
    public void setFixDBModel(Integer fixDBModel){
        this.set(FIELD_FIXDBMODEL, fixDBModel);
    }
    
    /**
     * 获取 修复数据结构  
     * @return
     */
    @JsonIgnore
    public Integer getFixDBModel(){
        Object objValue = this.get(FIELD_FIXDBMODEL);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 修复数据结构 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFixDBModelDirty(){
        if(this.contains(FIELD_FIXDBMODEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 修复数据结构
     */
    @JsonIgnore
    public void resetFixDBModel(){
        this.reset(FIELD_FIXDBMODEL);
    }

    /**
     * 设置 修复数据结构
     * <P>
     * 等同 {@link #setFixDBModel}
     * @param fixDBModel
     */
    @JsonIgnore
    public PSSysRunSessionDTO fixdbmodel(Integer fixDBModel){
        this.setFixDBModel(fixDBModel);
        return this;
    }

     /**
     * 设置 修复数据结构
     * <P>
     * 等同 {@link #setFixDBModel}
     * @param fixDBModel
     */
    @JsonIgnore
    public PSSysRunSessionDTO fixdbmodel(Boolean fixDBModel){
        if(fixDBModel == null){
            this.setFixDBModel(null);
        }
        else{
            this.setFixDBModel(fixDBModel?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSSysRunSessionDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PACKMODE</B>&nbsp;打包模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.SysRunPackMode} 
     */
    public final static String FIELD_PACKMODE = "packmode";

    /**
     * 设置 打包模式
     * 
     * @param packMode
     * 
     */
    @JsonProperty(FIELD_PACKMODE)
    public void setPackMode(String packMode){
        this.set(FIELD_PACKMODE, packMode);
    }
    
    /**
     * 获取 打包模式  
     * @return
     */
    @JsonIgnore
    public String getPackMode(){
        Object objValue = this.get(FIELD_PACKMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 打包模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPackModeDirty(){
        if(this.contains(FIELD_PACKMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 打包模式
     */
    @JsonIgnore
    public void resetPackMode(){
        this.reset(FIELD_PACKMODE);
    }

    /**
     * 设置 打包模式
     * <P>
     * 等同 {@link #setPackMode}
     * @param packMode
     */
    @JsonIgnore
    public PSSysRunSessionDTO packmode(String packMode){
        this.setPackMode(packMode);
        return this;
    }

     /**
     * 设置 打包模式
     * <P>
     * 等同 {@link #setPackMode}
     * @param packMode
     */
    @JsonIgnore
    public PSSysRunSessionDTO packmode(net.ibizsys.model.PSModelEnums.SysRunPackMode packMode){
        if(packMode == null){
            this.setPackMode(null);
        }
        else{
            this.setPackMode(packMode.value);
        }
        return this;
    }

    /**
     * <B>PSDEVSLNMSDEPAPIID</B>&nbsp;微服务接口部署
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVSLNMSDEPAPIID = "psdevslnmsdepapiid";

    /**
     * 设置 微服务接口部署
     * 
     * @param pSDevSlnMSDepAPIId
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNMSDEPAPIID)
    public void setPSDevSlnMSDepAPIId(String pSDevSlnMSDepAPIId){
        this.set(FIELD_PSDEVSLNMSDEPAPIID, pSDevSlnMSDepAPIId);
    }
    
    /**
     * 获取 微服务接口部署  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnMSDepAPIId(){
        Object objValue = this.get(FIELD_PSDEVSLNMSDEPAPIID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 微服务接口部署 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnMSDepAPIIdDirty(){
        if(this.contains(FIELD_PSDEVSLNMSDEPAPIID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 微服务接口部署
     */
    @JsonIgnore
    public void resetPSDevSlnMSDepAPIId(){
        this.reset(FIELD_PSDEVSLNMSDEPAPIID);
    }

    /**
     * 设置 微服务接口部署
     * <P>
     * 等同 {@link #setPSDevSlnMSDepAPIId}
     * @param pSDevSlnMSDepAPIId
     */
    @JsonIgnore
    public PSSysRunSessionDTO psdevslnmsdepapiid(String pSDevSlnMSDepAPIId){
        this.setPSDevSlnMSDepAPIId(pSDevSlnMSDepAPIId);
        return this;
    }

    /**
     * <B>PSDEVSLNMSDEPAPINAME</B>&nbsp;微服务接口部署
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVSLNMSDEPAPIID}
     */
    public final static String FIELD_PSDEVSLNMSDEPAPINAME = "psdevslnmsdepapiname";

    /**
     * 设置 微服务接口部署
     * 
     * @param pSDevSlnMSDepAPIName
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNMSDEPAPINAME)
    public void setPSDevSlnMSDepAPIName(String pSDevSlnMSDepAPIName){
        this.set(FIELD_PSDEVSLNMSDEPAPINAME, pSDevSlnMSDepAPIName);
    }
    
    /**
     * 获取 微服务接口部署  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnMSDepAPIName(){
        Object objValue = this.get(FIELD_PSDEVSLNMSDEPAPINAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 微服务接口部署 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnMSDepAPINameDirty(){
        if(this.contains(FIELD_PSDEVSLNMSDEPAPINAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 微服务接口部署
     */
    @JsonIgnore
    public void resetPSDevSlnMSDepAPIName(){
        this.reset(FIELD_PSDEVSLNMSDEPAPINAME);
    }

    /**
     * 设置 微服务接口部署
     * <P>
     * 等同 {@link #setPSDevSlnMSDepAPIName}
     * @param pSDevSlnMSDepAPIName
     */
    @JsonIgnore
    public PSSysRunSessionDTO psdevslnmsdepapiname(String pSDevSlnMSDepAPIName){
        this.setPSDevSlnMSDepAPIName(pSDevSlnMSDepAPIName);
        return this;
    }

    /**
     * <B>PSDEVSLNMSDEPAPPID</B>&nbsp;微服务应用部署
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVSLNMSDEPAPPID = "psdevslnmsdepappid";

    /**
     * 设置 微服务应用部署
     * 
     * @param pSDevSlnMSDepAppId
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNMSDEPAPPID)
    public void setPSDevSlnMSDepAppId(String pSDevSlnMSDepAppId){
        this.set(FIELD_PSDEVSLNMSDEPAPPID, pSDevSlnMSDepAppId);
    }
    
    /**
     * 获取 微服务应用部署  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnMSDepAppId(){
        Object objValue = this.get(FIELD_PSDEVSLNMSDEPAPPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 微服务应用部署 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnMSDepAppIdDirty(){
        if(this.contains(FIELD_PSDEVSLNMSDEPAPPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 微服务应用部署
     */
    @JsonIgnore
    public void resetPSDevSlnMSDepAppId(){
        this.reset(FIELD_PSDEVSLNMSDEPAPPID);
    }

    /**
     * 设置 微服务应用部署
     * <P>
     * 等同 {@link #setPSDevSlnMSDepAppId}
     * @param pSDevSlnMSDepAppId
     */
    @JsonIgnore
    public PSSysRunSessionDTO psdevslnmsdepappid(String pSDevSlnMSDepAppId){
        this.setPSDevSlnMSDepAppId(pSDevSlnMSDepAppId);
        return this;
    }

    /**
     * <B>PSDEVSLNMSDEPAPPNAME</B>&nbsp;微服务应用部署
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVSLNMSDEPAPPID}
     */
    public final static String FIELD_PSDEVSLNMSDEPAPPNAME = "psdevslnmsdepappname";

    /**
     * 设置 微服务应用部署
     * 
     * @param pSDevSlnMSDepAppName
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNMSDEPAPPNAME)
    public void setPSDevSlnMSDepAppName(String pSDevSlnMSDepAppName){
        this.set(FIELD_PSDEVSLNMSDEPAPPNAME, pSDevSlnMSDepAppName);
    }
    
    /**
     * 获取 微服务应用部署  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnMSDepAppName(){
        Object objValue = this.get(FIELD_PSDEVSLNMSDEPAPPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 微服务应用部署 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnMSDepAppNameDirty(){
        if(this.contains(FIELD_PSDEVSLNMSDEPAPPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 微服务应用部署
     */
    @JsonIgnore
    public void resetPSDevSlnMSDepAppName(){
        this.reset(FIELD_PSDEVSLNMSDEPAPPNAME);
    }

    /**
     * 设置 微服务应用部署
     * <P>
     * 等同 {@link #setPSDevSlnMSDepAppName}
     * @param pSDevSlnMSDepAppName
     */
    @JsonIgnore
    public PSSysRunSessionDTO psdevslnmsdepappname(String pSDevSlnMSDepAppName){
        this.setPSDevSlnMSDepAppName(pSDevSlnMSDepAppName);
        return this;
    }

    /**
     * <B>PSDEVSLNMSDEPFUNCID</B>&nbsp;微服务功能部署
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVSLNMSDEPFUNCID = "psdevslnmsdepfuncid";

    /**
     * 设置 微服务功能部署
     * 
     * @param pSDevSlnMSDepFuncId
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNMSDEPFUNCID)
    public void setPSDevSlnMSDepFuncId(String pSDevSlnMSDepFuncId){
        this.set(FIELD_PSDEVSLNMSDEPFUNCID, pSDevSlnMSDepFuncId);
    }
    
    /**
     * 获取 微服务功能部署  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnMSDepFuncId(){
        Object objValue = this.get(FIELD_PSDEVSLNMSDEPFUNCID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 微服务功能部署 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnMSDepFuncIdDirty(){
        if(this.contains(FIELD_PSDEVSLNMSDEPFUNCID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 微服务功能部署
     */
    @JsonIgnore
    public void resetPSDevSlnMSDepFuncId(){
        this.reset(FIELD_PSDEVSLNMSDEPFUNCID);
    }

    /**
     * 设置 微服务功能部署
     * <P>
     * 等同 {@link #setPSDevSlnMSDepFuncId}
     * @param pSDevSlnMSDepFuncId
     */
    @JsonIgnore
    public PSSysRunSessionDTO psdevslnmsdepfuncid(String pSDevSlnMSDepFuncId){
        this.setPSDevSlnMSDepFuncId(pSDevSlnMSDepFuncId);
        return this;
    }

    /**
     * <B>PSDEVSLNMSDEPFUNCNAME</B>&nbsp;微服务功能部署
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVSLNMSDEPFUNCID}
     */
    public final static String FIELD_PSDEVSLNMSDEPFUNCNAME = "psdevslnmsdepfuncname";

    /**
     * 设置 微服务功能部署
     * 
     * @param pSDevSlnMSDepFuncName
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNMSDEPFUNCNAME)
    public void setPSDevSlnMSDepFuncName(String pSDevSlnMSDepFuncName){
        this.set(FIELD_PSDEVSLNMSDEPFUNCNAME, pSDevSlnMSDepFuncName);
    }
    
    /**
     * 获取 微服务功能部署  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnMSDepFuncName(){
        Object objValue = this.get(FIELD_PSDEVSLNMSDEPFUNCNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 微服务功能部署 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnMSDepFuncNameDirty(){
        if(this.contains(FIELD_PSDEVSLNMSDEPFUNCNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 微服务功能部署
     */
    @JsonIgnore
    public void resetPSDevSlnMSDepFuncName(){
        this.reset(FIELD_PSDEVSLNMSDEPFUNCNAME);
    }

    /**
     * 设置 微服务功能部署
     * <P>
     * 等同 {@link #setPSDevSlnMSDepFuncName}
     * @param pSDevSlnMSDepFuncName
     */
    @JsonIgnore
    public PSSysRunSessionDTO psdevslnmsdepfuncname(String pSDevSlnMSDepFuncName){
        this.setPSDevSlnMSDepFuncName(pSDevSlnMSDepFuncName);
        return this;
    }

    /**
     * <B>PSDSCONSOLEID</B>&nbsp;控制台标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDSCONSOLEID = "psdsconsoleid";

    /**
     * 设置 控制台标识
     * 
     * @param pSDSConsoleId
     * 
     */
    @JsonProperty(FIELD_PSDSCONSOLEID)
    public void setPSDSConsoleId(String pSDSConsoleId){
        this.set(FIELD_PSDSCONSOLEID, pSDSConsoleId);
    }
    
    /**
     * 获取 控制台标识  
     * @return
     */
    @JsonIgnore
    public String getPSDSConsoleId(){
        Object objValue = this.get(FIELD_PSDSCONSOLEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 控制台标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDSConsoleIdDirty(){
        if(this.contains(FIELD_PSDSCONSOLEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 控制台标识
     */
    @JsonIgnore
    public void resetPSDSConsoleId(){
        this.reset(FIELD_PSDSCONSOLEID);
    }

    /**
     * 设置 控制台标识
     * <P>
     * 等同 {@link #setPSDSConsoleId}
     * @param pSDSConsoleId
     */
    @JsonIgnore
    public PSSysRunSessionDTO psdsconsoleid(String pSDSConsoleId){
        this.setPSDSConsoleId(pSDSConsoleId);
        return this;
    }

    /**
     * <B>PSDYNAINSTID</B>&nbsp;动态实例标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDYNAINSTID = "psdynainstid";

    /**
     * 设置 动态实例标识
     * 
     * @param pSDynaInstId
     * 
     */
    @JsonProperty(FIELD_PSDYNAINSTID)
    public void setPSDynaInstId(String pSDynaInstId){
        this.set(FIELD_PSDYNAINSTID, pSDynaInstId);
    }
    
    /**
     * 获取 动态实例标识  
     * @return
     */
    @JsonIgnore
    public String getPSDynaInstId(){
        Object objValue = this.get(FIELD_PSDYNAINSTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 动态实例标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDynaInstIdDirty(){
        if(this.contains(FIELD_PSDYNAINSTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 动态实例标识
     */
    @JsonIgnore
    public void resetPSDynaInstId(){
        this.reset(FIELD_PSDYNAINSTID);
    }

    /**
     * 设置 动态实例标识
     * <P>
     * 等同 {@link #setPSDynaInstId}
     * @param pSDynaInstId
     */
    @JsonIgnore
    public PSSysRunSessionDTO psdynainstid(String pSDynaInstId){
        this.setPSDynaInstId(pSDynaInstId);
        return this;
    }

    /**
     * <B>PSMOBAPPPACKID</B>&nbsp;移动应用打包
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSMobAppPackDTO} 
     */
    public final static String FIELD_PSMOBAPPPACKID = "psmobapppackid";

    /**
     * 设置 移动应用打包
     * 
     * @param pSMobAppPackId
     * 
     */
    @JsonProperty(FIELD_PSMOBAPPPACKID)
    public void setPSMobAppPackId(String pSMobAppPackId){
        this.set(FIELD_PSMOBAPPPACKID, pSMobAppPackId);
    }
    
    /**
     * 获取 移动应用打包  
     * @return
     */
    @JsonIgnore
    public String getPSMobAppPackId(){
        Object objValue = this.get(FIELD_PSMOBAPPPACKID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动应用打包 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSMobAppPackIdDirty(){
        if(this.contains(FIELD_PSMOBAPPPACKID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动应用打包
     */
    @JsonIgnore
    public void resetPSMobAppPackId(){
        this.reset(FIELD_PSMOBAPPPACKID);
    }

    /**
     * 设置 移动应用打包
     * <P>
     * 等同 {@link #setPSMobAppPackId}
     * @param pSMobAppPackId
     */
    @JsonIgnore
    public PSSysRunSessionDTO psmobapppackid(String pSMobAppPackId){
        this.setPSMobAppPackId(pSMobAppPackId);
        return this;
    }

    /**
     * 设置 移动应用打包，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSMobAppPackId}
     * @param pSMobAppPack 引用对象
     */
    @JsonIgnore
    public PSSysRunSessionDTO psmobapppackid(PSMobAppPackDTO pSMobAppPack){
        if(pSMobAppPack == null){
            this.setPSMobAppPackId(null);
            this.setPSMobAppPackName(null);
        }
        else{
            this.setPSMobAppPackId(pSMobAppPack.getPSMobAppPackId());
            this.setPSMobAppPackName(pSMobAppPack.getPSMobAppPackName());
        }
        return this;
    }

    /**
     * <B>PSMOBAPPPACKNAME</B>&nbsp;移动应用打包
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSMOBAPPPACKID}
     */
    public final static String FIELD_PSMOBAPPPACKNAME = "psmobapppackname";

    /**
     * 设置 移动应用打包
     * 
     * @param pSMobAppPackName
     * 
     */
    @JsonProperty(FIELD_PSMOBAPPPACKNAME)
    public void setPSMobAppPackName(String pSMobAppPackName){
        this.set(FIELD_PSMOBAPPPACKNAME, pSMobAppPackName);
    }
    
    /**
     * 获取 移动应用打包  
     * @return
     */
    @JsonIgnore
    public String getPSMobAppPackName(){
        Object objValue = this.get(FIELD_PSMOBAPPPACKNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动应用打包 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSMobAppPackNameDirty(){
        if(this.contains(FIELD_PSMOBAPPPACKNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动应用打包
     */
    @JsonIgnore
    public void resetPSMobAppPackName(){
        this.reset(FIELD_PSMOBAPPPACKNAME);
    }

    /**
     * 设置 移动应用打包
     * <P>
     * 等同 {@link #setPSMobAppPackName}
     * @param pSMobAppPackName
     */
    @JsonIgnore
    public PSSysRunSessionDTO psmobapppackname(String pSMobAppPackName){
        this.setPSMobAppPackName(pSMobAppPackName);
        return this;
    }

    /**
     * <B>PSSYSAPPID</B>&nbsp;系统应用
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysAppDTO} 
     */
    public final static String FIELD_PSSYSAPPID = "pssysappid";

    /**
     * 设置 系统应用
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
     * 设置 系统应用
     * <P>
     * 等同 {@link #setPSSysAppId}
     * @param pSSysAppId
     */
    @JsonIgnore
    public PSSysRunSessionDTO pssysappid(String pSSysAppId){
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
    public PSSysRunSessionDTO pssysappid(PSSysAppDTO pSSysApp){
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
     * <B>PSSYSAPPID2</B>&nbsp;系统应用2
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysAppDTO} 
     */
    public final static String FIELD_PSSYSAPPID2 = "pssysappid2";

    /**
     * 设置 系统应用2
     * 
     * @param pSSysAppId2
     * 
     */
    @JsonProperty(FIELD_PSSYSAPPID2)
    public void setPSSysAppId2(String pSSysAppId2){
        this.set(FIELD_PSSYSAPPID2, pSSysAppId2);
    }
    
    /**
     * 获取 系统应用2  
     * @return
     */
    @JsonIgnore
    public String getPSSysAppId2(){
        Object objValue = this.get(FIELD_PSSYSAPPID2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统应用2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysAppId2Dirty(){
        if(this.contains(FIELD_PSSYSAPPID2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统应用2
     */
    @JsonIgnore
    public void resetPSSysAppId2(){
        this.reset(FIELD_PSSYSAPPID2);
    }

    /**
     * 设置 系统应用2
     * <P>
     * 等同 {@link #setPSSysAppId2}
     * @param pSSysAppId2
     */
    @JsonIgnore
    public PSSysRunSessionDTO pssysappid2(String pSSysAppId2){
        this.setPSSysAppId2(pSSysAppId2);
        return this;
    }

    /**
     * 设置 系统应用2，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysAppId2}
     * @param pSSysApp 引用对象
     */
    @JsonIgnore
    public PSSysRunSessionDTO pssysappid2(PSSysAppDTO pSSysApp){
        if(pSSysApp == null){
            this.setPSSysAppId2(null);
            this.setPSSysAppName2(null);
        }
        else{
            this.setPSSysAppId2(pSSysApp.getPSSysAppId());
            this.setPSSysAppName2(pSSysApp.getPSSysAppName());
        }
        return this;
    }

    /**
     * <B>PSSYSAPPNAME</B>&nbsp;前端应用
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSAPPID}
     */
    public final static String FIELD_PSSYSAPPNAME = "pssysappname";

    /**
     * 设置 前端应用
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
     * 设置 前端应用
     * <P>
     * 等同 {@link #setPSSysAppName}
     * @param pSSysAppName
     */
    @JsonIgnore
    public PSSysRunSessionDTO pssysappname(String pSSysAppName){
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    /**
     * <B>PSSYSAPPNAME2</B>&nbsp;前端应用2
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSAPPID2}
     */
    public final static String FIELD_PSSYSAPPNAME2 = "pssysappname2";

    /**
     * 设置 前端应用2
     * 
     * @param pSSysAppName2
     * 
     */
    @JsonProperty(FIELD_PSSYSAPPNAME2)
    public void setPSSysAppName2(String pSSysAppName2){
        this.set(FIELD_PSSYSAPPNAME2, pSSysAppName2);
    }
    
    /**
     * 获取 前端应用2  
     * @return
     */
    @JsonIgnore
    public String getPSSysAppName2(){
        Object objValue = this.get(FIELD_PSSYSAPPNAME2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端应用2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysAppName2Dirty(){
        if(this.contains(FIELD_PSSYSAPPNAME2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端应用2
     */
    @JsonIgnore
    public void resetPSSysAppName2(){
        this.reset(FIELD_PSSYSAPPNAME2);
    }

    /**
     * 设置 前端应用2
     * <P>
     * 等同 {@link #setPSSysAppName2}
     * @param pSSysAppName2
     */
    @JsonIgnore
    public PSSysRunSessionDTO pssysappname2(String pSSysAppName2){
        this.setPSSysAppName2(pSSysAppName2);
        return this;
    }

    /**
     * <B>PSSYSBDINSTCFGID</B>&nbsp;大数据源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysBDInstCfgDTO} 
     */
    public final static String FIELD_PSSYSBDINSTCFGID = "pssysbdinstcfgid";

    /**
     * 设置 大数据源
     * 
     * @param pSSysBDInstCfgId
     * 
     */
    @JsonProperty(FIELD_PSSYSBDINSTCFGID)
    public void setPSSysBDInstCfgId(String pSSysBDInstCfgId){
        this.set(FIELD_PSSYSBDINSTCFGID, pSSysBDInstCfgId);
    }
    
    /**
     * 获取 大数据源  
     * @return
     */
    @JsonIgnore
    public String getPSSysBDInstCfgId(){
        Object objValue = this.get(FIELD_PSSYSBDINSTCFGID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 大数据源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBDInstCfgIdDirty(){
        if(this.contains(FIELD_PSSYSBDINSTCFGID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 大数据源
     */
    @JsonIgnore
    public void resetPSSysBDInstCfgId(){
        this.reset(FIELD_PSSYSBDINSTCFGID);
    }

    /**
     * 设置 大数据源
     * <P>
     * 等同 {@link #setPSSysBDInstCfgId}
     * @param pSSysBDInstCfgId
     */
    @JsonIgnore
    public PSSysRunSessionDTO pssysbdinstcfgid(String pSSysBDInstCfgId){
        this.setPSSysBDInstCfgId(pSSysBDInstCfgId);
        return this;
    }

    /**
     * 设置 大数据源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysBDInstCfgId}
     * @param pSSysBDInstCfg 引用对象
     */
    @JsonIgnore
    public PSSysRunSessionDTO pssysbdinstcfgid(PSSysBDInstCfgDTO pSSysBDInstCfg){
        if(pSSysBDInstCfg == null){
            this.setPSSysBDInstCfgId(null);
            this.setPSSysBDInstCfgName(null);
        }
        else{
            this.setPSSysBDInstCfgId(pSSysBDInstCfg.getPSSysBDInstCfgId());
            this.setPSSysBDInstCfgName(pSSysBDInstCfg.getPSSysBDInstCfgName());
        }
        return this;
    }

    /**
     * <B>PSSYSBDINSTCFGNAME</B>&nbsp;大数据源
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.BDType} 
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBDINSTCFGID}
     */
    public final static String FIELD_PSSYSBDINSTCFGNAME = "pssysbdinstcfgname";

    /**
     * 设置 大数据源
     * 
     * @param pSSysBDInstCfgName
     * 
     */
    @JsonProperty(FIELD_PSSYSBDINSTCFGNAME)
    public void setPSSysBDInstCfgName(String pSSysBDInstCfgName){
        this.set(FIELD_PSSYSBDINSTCFGNAME, pSSysBDInstCfgName);
    }
    
    /**
     * 获取 大数据源  
     * @return
     */
    @JsonIgnore
    public String getPSSysBDInstCfgName(){
        Object objValue = this.get(FIELD_PSSYSBDINSTCFGNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 大数据源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBDInstCfgNameDirty(){
        if(this.contains(FIELD_PSSYSBDINSTCFGNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 大数据源
     */
    @JsonIgnore
    public void resetPSSysBDInstCfgName(){
        this.reset(FIELD_PSSYSBDINSTCFGNAME);
    }

    /**
     * 设置 大数据源
     * <P>
     * 等同 {@link #setPSSysBDInstCfgName}
     * @param pSSysBDInstCfgName
     */
    @JsonIgnore
    public PSSysRunSessionDTO pssysbdinstcfgname(String pSSysBDInstCfgName){
        this.setPSSysBDInstCfgName(pSSysBDInstCfgName);
        return this;
    }

    /**
     * <B>PSSYSRUNSESSIONID</B>&nbsp;系统运行会话标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSRUNSESSIONID = "pssysrunsessionid";

    /**
     * 设置 系统运行会话标识
     * 
     * @param pSSysRunSessionId
     * 
     */
    @JsonProperty(FIELD_PSSYSRUNSESSIONID)
    public void setPSSysRunSessionId(String pSSysRunSessionId){
        this.set(FIELD_PSSYSRUNSESSIONID, pSSysRunSessionId);
    }
    
    /**
     * 获取 系统运行会话标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysRunSessionId(){
        Object objValue = this.get(FIELD_PSSYSRUNSESSIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统运行会话标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysRunSessionIdDirty(){
        if(this.contains(FIELD_PSSYSRUNSESSIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统运行会话标识
     */
    @JsonIgnore
    public void resetPSSysRunSessionId(){
        this.reset(FIELD_PSSYSRUNSESSIONID);
    }

    /**
     * 设置 系统运行会话标识
     * <P>
     * 等同 {@link #setPSSysRunSessionId}
     * @param pSSysRunSessionId
     */
    @JsonIgnore
    public PSSysRunSessionDTO pssysrunsessionid(String pSSysRunSessionId){
        this.setPSSysRunSessionId(pSSysRunSessionId);
        return this;
    }

    /**
     * <B>PSSYSRUNSESSIONNAME</B>&nbsp;系统运行会话
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSRUNSESSIONNAME = "pssysrunsessionname";

    /**
     * 设置 系统运行会话
     * 
     * @param pSSysRunSessionName
     * 
     */
    @JsonProperty(FIELD_PSSYSRUNSESSIONNAME)
    public void setPSSysRunSessionName(String pSSysRunSessionName){
        this.set(FIELD_PSSYSRUNSESSIONNAME, pSSysRunSessionName);
    }
    
    /**
     * 获取 系统运行会话  
     * @return
     */
    @JsonIgnore
    public String getPSSysRunSessionName(){
        Object objValue = this.get(FIELD_PSSYSRUNSESSIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统运行会话 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysRunSessionNameDirty(){
        if(this.contains(FIELD_PSSYSRUNSESSIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统运行会话
     */
    @JsonIgnore
    public void resetPSSysRunSessionName(){
        this.reset(FIELD_PSSYSRUNSESSIONNAME);
    }

    /**
     * 设置 系统运行会话
     * <P>
     * 等同 {@link #setPSSysRunSessionName}
     * @param pSSysRunSessionName
     */
    @JsonIgnore
    public PSSysRunSessionDTO pssysrunsessionname(String pSSysRunSessionName){
        this.setPSSysRunSessionName(pSSysRunSessionName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysRunSessionName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysRunSessionName(strName);
    }

    @JsonIgnore
    public PSSysRunSessionDTO name(String strName){
        this.setPSSysRunSessionName(strName);
        return this;
    }

    /**
     * <B>PSSYSSERVICEAPIID</B>&nbsp;系统服务接口
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysServiceAPIDTO} 
     */
    public final static String FIELD_PSSYSSERVICEAPIID = "pssysserviceapiid";

    /**
     * 设置 系统服务接口
     * 
     * @param pSSysServiceAPIId
     * 
     */
    @JsonProperty(FIELD_PSSYSSERVICEAPIID)
    public void setPSSysServiceAPIId(String pSSysServiceAPIId){
        this.set(FIELD_PSSYSSERVICEAPIID, pSSysServiceAPIId);
    }
    
    /**
     * 获取 系统服务接口  
     * @return
     */
    @JsonIgnore
    public String getPSSysServiceAPIId(){
        Object objValue = this.get(FIELD_PSSYSSERVICEAPIID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统服务接口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysServiceAPIIdDirty(){
        if(this.contains(FIELD_PSSYSSERVICEAPIID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统服务接口
     */
    @JsonIgnore
    public void resetPSSysServiceAPIId(){
        this.reset(FIELD_PSSYSSERVICEAPIID);
    }

    /**
     * 设置 系统服务接口
     * <P>
     * 等同 {@link #setPSSysServiceAPIId}
     * @param pSSysServiceAPIId
     */
    @JsonIgnore
    public PSSysRunSessionDTO pssysserviceapiid(String pSSysServiceAPIId){
        this.setPSSysServiceAPIId(pSSysServiceAPIId);
        return this;
    }

    /**
     * 设置 系统服务接口，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysServiceAPIId}
     * @param pSSysServiceAPI 引用对象
     */
    @JsonIgnore
    public PSSysRunSessionDTO pssysserviceapiid(PSSysServiceAPIDTO pSSysServiceAPI){
        if(pSSysServiceAPI == null){
            this.setPSSysServiceAPIId(null);
            this.setPSSysServiceAPIName(null);
        }
        else{
            this.setPSSysServiceAPIId(pSSysServiceAPI.getPSSysServiceAPIId());
            this.setPSSysServiceAPIName(pSSysServiceAPI.getPSSysServiceAPIName());
        }
        return this;
    }

    /**
     * <B>PSSYSSERVICEAPINAME</B>&nbsp;系统服务接口
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSERVICEAPIID}
     */
    public final static String FIELD_PSSYSSERVICEAPINAME = "pssysserviceapiname";

    /**
     * 设置 系统服务接口
     * 
     * @param pSSysServiceAPIName
     * 
     */
    @JsonProperty(FIELD_PSSYSSERVICEAPINAME)
    public void setPSSysServiceAPIName(String pSSysServiceAPIName){
        this.set(FIELD_PSSYSSERVICEAPINAME, pSSysServiceAPIName);
    }
    
    /**
     * 获取 系统服务接口  
     * @return
     */
    @JsonIgnore
    public String getPSSysServiceAPIName(){
        Object objValue = this.get(FIELD_PSSYSSERVICEAPINAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统服务接口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysServiceAPINameDirty(){
        if(this.contains(FIELD_PSSYSSERVICEAPINAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统服务接口
     */
    @JsonIgnore
    public void resetPSSysServiceAPIName(){
        this.reset(FIELD_PSSYSSERVICEAPINAME);
    }

    /**
     * 设置 系统服务接口
     * <P>
     * 等同 {@link #setPSSysServiceAPIName}
     * @param pSSysServiceAPIName
     */
    @JsonIgnore
    public PSSysRunSessionDTO pssysserviceapiname(String pSSysServiceAPIName){
        this.setPSSysServiceAPIName(pSSysServiceAPIName);
        return this;
    }

    /**
     * <B>PSSYSSFPUBID</B>&nbsp;后台体系
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysSFPubDTO} 
     */
    public final static String FIELD_PSSYSSFPUBID = "pssyssfpubid";

    /**
     * 设置 后台体系
     * 
     * @param pSSysSFPubId
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPUBID)
    public void setPSSysSFPubId(String pSSysSFPubId){
        this.set(FIELD_PSSYSSFPUBID, pSSysSFPubId);
    }
    
    /**
     * 获取 后台体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysSFPubId(){
        Object objValue = this.get(FIELD_PSSYSSFPUBID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSFPubIdDirty(){
        if(this.contains(FIELD_PSSYSSFPUBID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台体系
     */
    @JsonIgnore
    public void resetPSSysSFPubId(){
        this.reset(FIELD_PSSYSSFPUBID);
    }

    /**
     * 设置 后台体系
     * <P>
     * 等同 {@link #setPSSysSFPubId}
     * @param pSSysSFPubId
     */
    @JsonIgnore
    public PSSysRunSessionDTO pssyssfpubid(String pSSysSFPubId){
        this.setPSSysSFPubId(pSSysSFPubId);
        return this;
    }

    /**
     * 设置 后台体系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSFPubId}
     * @param pSSysSFPub 引用对象
     */
    @JsonIgnore
    public PSSysRunSessionDTO pssyssfpubid(PSSysSFPubDTO pSSysSFPub){
        if(pSSysSFPub == null){
            this.setPSSysSFPubId(null);
            this.setPSSysSFPubName(null);
        }
        else{
            this.setPSSysSFPubId(pSSysSFPub.getPSSysSFPubId());
            this.setPSSysSFPubName(pSSysSFPub.getPSSysSFPubName());
        }
        return this;
    }

    /**
     * <B>PSSYSSFPUBNAME</B>&nbsp;后台体系
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSFPUBID}
     */
    public final static String FIELD_PSSYSSFPUBNAME = "pssyssfpubname";

    /**
     * 设置 后台体系
     * 
     * @param pSSysSFPubName
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPUBNAME)
    public void setPSSysSFPubName(String pSSysSFPubName){
        this.set(FIELD_PSSYSSFPUBNAME, pSSysSFPubName);
    }
    
    /**
     * 获取 后台体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysSFPubName(){
        Object objValue = this.get(FIELD_PSSYSSFPUBNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSFPubNameDirty(){
        if(this.contains(FIELD_PSSYSSFPUBNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台体系
     */
    @JsonIgnore
    public void resetPSSysSFPubName(){
        this.reset(FIELD_PSSYSSFPUBNAME);
    }

    /**
     * 设置 后台体系
     * <P>
     * 等同 {@link #setPSSysSFPubName}
     * @param pSSysSFPubName
     */
    @JsonIgnore
    public PSSysRunSessionDTO pssyssfpubname(String pSSysSFPubName){
        this.setPSSysSFPubName(pSSysSFPubName);
        return this;
    }

    /**
     * <B>PSSYSTEMASID</B>&nbsp;系统应用服务器
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSTEMASID = "pssystemasid";

    /**
     * 设置 系统应用服务器
     * 
     * @param pSSystemASId
     * 
     */
    @JsonProperty(FIELD_PSSYSTEMASID)
    public void setPSSystemASId(String pSSystemASId){
        this.set(FIELD_PSSYSTEMASID, pSSystemASId);
    }
    
    /**
     * 获取 系统应用服务器  
     * @return
     */
    @JsonIgnore
    public String getPSSystemASId(){
        Object objValue = this.get(FIELD_PSSYSTEMASID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统应用服务器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSystemASIdDirty(){
        if(this.contains(FIELD_PSSYSTEMASID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统应用服务器
     */
    @JsonIgnore
    public void resetPSSystemASId(){
        this.reset(FIELD_PSSYSTEMASID);
    }

    /**
     * 设置 系统应用服务器
     * <P>
     * 等同 {@link #setPSSystemASId}
     * @param pSSystemASId
     */
    @JsonIgnore
    public PSSysRunSessionDTO pssystemasid(String pSSystemASId){
        this.setPSSystemASId(pSSystemASId);
        return this;
    }

    /**
     * <B>PSSYSTEMASNAME</B>&nbsp;应用服务器
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSTEMASID}
     */
    public final static String FIELD_PSSYSTEMASNAME = "pssystemasname";

    /**
     * 设置 应用服务器
     * 
     * @param pSSystemASName
     * 
     */
    @JsonProperty(FIELD_PSSYSTEMASNAME)
    public void setPSSystemASName(String pSSystemASName){
        this.set(FIELD_PSSYSTEMASNAME, pSSystemASName);
    }
    
    /**
     * 获取 应用服务器  
     * @return
     */
    @JsonIgnore
    public String getPSSystemASName(){
        Object objValue = this.get(FIELD_PSSYSTEMASNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用服务器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSystemASNameDirty(){
        if(this.contains(FIELD_PSSYSTEMASNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用服务器
     */
    @JsonIgnore
    public void resetPSSystemASName(){
        this.reset(FIELD_PSSYSTEMASNAME);
    }

    /**
     * 设置 应用服务器
     * <P>
     * 等同 {@link #setPSSystemASName}
     * @param pSSystemASName
     */
    @JsonIgnore
    public PSSysRunSessionDTO pssystemasname(String pSSystemASName){
        this.setPSSystemASName(pSSystemASName);
        return this;
    }

    /**
     * <B>PSSYSTEMDBCFGID</B>&nbsp;系统数据库
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSystemDBCfgDTO} 
     */
    public final static String FIELD_PSSYSTEMDBCFGID = "pssystemdbcfgid";

    /**
     * 设置 系统数据库
     * 
     * @param pSSystemDBCfgId
     * 
     */
    @JsonProperty(FIELD_PSSYSTEMDBCFGID)
    public void setPSSystemDBCfgId(String pSSystemDBCfgId){
        this.set(FIELD_PSSYSTEMDBCFGID, pSSystemDBCfgId);
    }
    
    /**
     * 获取 系统数据库  
     * @return
     */
    @JsonIgnore
    public String getPSSystemDBCfgId(){
        Object objValue = this.get(FIELD_PSSYSTEMDBCFGID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统数据库 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSystemDBCfgIdDirty(){
        if(this.contains(FIELD_PSSYSTEMDBCFGID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统数据库
     */
    @JsonIgnore
    public void resetPSSystemDBCfgId(){
        this.reset(FIELD_PSSYSTEMDBCFGID);
    }

    /**
     * 设置 系统数据库
     * <P>
     * 等同 {@link #setPSSystemDBCfgId}
     * @param pSSystemDBCfgId
     */
    @JsonIgnore
    public PSSysRunSessionDTO pssystemdbcfgid(String pSSystemDBCfgId){
        this.setPSSystemDBCfgId(pSSystemDBCfgId);
        return this;
    }

    /**
     * 设置 系统数据库，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSystemDBCfgId}
     * @param pSSystemDBCfg 引用对象
     */
    @JsonIgnore
    public PSSysRunSessionDTO pssystemdbcfgid(PSSystemDBCfgDTO pSSystemDBCfg){
        if(pSSystemDBCfg == null){
            this.setPSSystemDBCfgId(null);
            this.setPSSystemDBCfgName(null);
        }
        else{
            this.setPSSystemDBCfgId(pSSystemDBCfg.getPSSystemDBCfgId());
            this.setPSSystemDBCfgName(pSSystemDBCfg.getPSSystemDBCfgName());
        }
        return this;
    }

    /**
     * <B>PSSYSTEMDBCFGNAME</B>&nbsp;运行数据库
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DBType} 
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSTEMDBCFGID}
     */
    public final static String FIELD_PSSYSTEMDBCFGNAME = "pssystemdbcfgname";

    /**
     * 设置 运行数据库
     * 
     * @param pSSystemDBCfgName
     * 
     */
    @JsonProperty(FIELD_PSSYSTEMDBCFGNAME)
    public void setPSSystemDBCfgName(String pSSystemDBCfgName){
        this.set(FIELD_PSSYSTEMDBCFGNAME, pSSystemDBCfgName);
    }
    
    /**
     * 获取 运行数据库  
     * @return
     */
    @JsonIgnore
    public String getPSSystemDBCfgName(){
        Object objValue = this.get(FIELD_PSSYSTEMDBCFGNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 运行数据库 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSystemDBCfgNameDirty(){
        if(this.contains(FIELD_PSSYSTEMDBCFGNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 运行数据库
     */
    @JsonIgnore
    public void resetPSSystemDBCfgName(){
        this.reset(FIELD_PSSYSTEMDBCFGNAME);
    }

    /**
     * 设置 运行数据库
     * <P>
     * 等同 {@link #setPSSystemDBCfgName}
     * @param pSSystemDBCfgName
     */
    @JsonIgnore
    public PSSysRunSessionDTO pssystemdbcfgname(String pSSystemDBCfgName){
        this.setPSSystemDBCfgName(pSSystemDBCfgName);
        return this;
    }

    /**
     * <B>QUICKMODE</B>&nbsp;快速模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_QUICKMODE = "quickmode";

    /**
     * 设置 快速模式
     * 
     * @param quickMode
     * 
     */
    @JsonProperty(FIELD_QUICKMODE)
    public void setQuickMode(Integer quickMode){
        this.set(FIELD_QUICKMODE, quickMode);
    }
    
    /**
     * 获取 快速模式  
     * @return
     */
    @JsonIgnore
    public Integer getQuickMode(){
        Object objValue = this.get(FIELD_QUICKMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 快速模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isQuickModeDirty(){
        if(this.contains(FIELD_QUICKMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 快速模式
     */
    @JsonIgnore
    public void resetQuickMode(){
        this.reset(FIELD_QUICKMODE);
    }

    /**
     * 设置 快速模式
     * <P>
     * 等同 {@link #setQuickMode}
     * @param quickMode
     */
    @JsonIgnore
    public PSSysRunSessionDTO quickmode(Integer quickMode){
        this.setQuickMode(quickMode);
        return this;
    }

     /**
     * 设置 快速模式
     * <P>
     * 等同 {@link #setQuickMode}
     * @param quickMode
     */
    @JsonIgnore
    public PSSysRunSessionDTO quickmode(Boolean quickMode){
        if(quickMode == null){
            this.setQuickMode(null);
        }
        else{
            this.setQuickMode(quickMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>REBUILDMODE</B>&nbsp;重新构建
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.SysRunRebuildMode} 
     */
    public final static String FIELD_REBUILDMODE = "rebuildmode";

    /**
     * 设置 重新构建
     * 
     * @param rebuildMode
     * 
     */
    @JsonProperty(FIELD_REBUILDMODE)
    public void setRebuildMode(Integer rebuildMode){
        this.set(FIELD_REBUILDMODE, rebuildMode);
    }
    
    /**
     * 获取 重新构建  
     * @return
     */
    @JsonIgnore
    public Integer getRebuildMode(){
        Object objValue = this.get(FIELD_REBUILDMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 重新构建 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRebuildModeDirty(){
        if(this.contains(FIELD_REBUILDMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 重新构建
     */
    @JsonIgnore
    public void resetRebuildMode(){
        this.reset(FIELD_REBUILDMODE);
    }

    /**
     * 设置 重新构建
     * <P>
     * 等同 {@link #setRebuildMode}
     * @param rebuildMode
     */
    @JsonIgnore
    public PSSysRunSessionDTO rebuildmode(Integer rebuildMode){
        this.setRebuildMode(rebuildMode);
        return this;
    }

     /**
     * 设置 重新构建
     * <P>
     * 等同 {@link #setRebuildMode}
     * @param rebuildMode
     */
    @JsonIgnore
    public PSSysRunSessionDTO rebuildmode(net.ibizsys.model.PSModelEnums.SysRunRebuildMode rebuildMode){
        if(rebuildMode == null){
            this.setRebuildMode(null);
        }
        else{
            this.setRebuildMode(rebuildMode.value);
        }
        return this;
    }

    /**
     * <B>RUNMODE</B>&nbsp;运行模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.SysRunMode} 
     */
    public final static String FIELD_RUNMODE = "runmode";

    /**
     * 设置 运行模式
     * 
     * @param runMode
     * 
     */
    @JsonProperty(FIELD_RUNMODE)
    public void setRunMode(String runMode){
        this.set(FIELD_RUNMODE, runMode);
    }
    
    /**
     * 获取 运行模式  
     * @return
     */
    @JsonIgnore
    public String getRunMode(){
        Object objValue = this.get(FIELD_RUNMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 运行模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRunModeDirty(){
        if(this.contains(FIELD_RUNMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 运行模式
     */
    @JsonIgnore
    public void resetRunMode(){
        this.reset(FIELD_RUNMODE);
    }

    /**
     * 设置 运行模式
     * <P>
     * 等同 {@link #setRunMode}
     * @param runMode
     */
    @JsonIgnore
    public PSSysRunSessionDTO runmode(String runMode){
        this.setRunMode(runMode);
        return this;
    }

     /**
     * 设置 运行模式
     * <P>
     * 等同 {@link #setRunMode}
     * @param runMode
     */
    @JsonIgnore
    public PSSysRunSessionDTO runmode(net.ibizsys.model.PSModelEnums.SysRunMode runMode){
        if(runMode == null){
            this.setRunMode(null);
        }
        else{
            this.setRunMode(runMode.value);
        }
        return this;
    }

    /**
     * <B>RUNPARAM</B>&nbsp;运行参数
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_RUNPARAM = "runparam";

    /**
     * 设置 运行参数
     * 
     * @param runParam
     * 
     */
    @JsonProperty(FIELD_RUNPARAM)
    public void setRunParam(String runParam){
        this.set(FIELD_RUNPARAM, runParam);
    }
    
    /**
     * 获取 运行参数  
     * @return
     */
    @JsonIgnore
    public String getRunParam(){
        Object objValue = this.get(FIELD_RUNPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 运行参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRunParamDirty(){
        if(this.contains(FIELD_RUNPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 运行参数
     */
    @JsonIgnore
    public void resetRunParam(){
        this.reset(FIELD_RUNPARAM);
    }

    /**
     * 设置 运行参数
     * <P>
     * 等同 {@link #setRunParam}
     * @param runParam
     */
    @JsonIgnore
    public PSSysRunSessionDTO runparam(String runParam){
        this.setRunParam(runParam);
        return this;
    }

    /**
     * <B>RUNPARAM10</B>&nbsp;运行参数10
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_RUNPARAM10 = "runparam10";

    /**
     * 设置 运行参数10
     * 
     * @param runParam10
     * 
     */
    @JsonProperty(FIELD_RUNPARAM10)
    public void setRunParam10(String runParam10){
        this.set(FIELD_RUNPARAM10, runParam10);
    }
    
    /**
     * 获取 运行参数10  
     * @return
     */
    @JsonIgnore
    public String getRunParam10(){
        Object objValue = this.get(FIELD_RUNPARAM10);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 运行参数10 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRunParam10Dirty(){
        if(this.contains(FIELD_RUNPARAM10)){
            return true;
        }
        return false;
    }

    /**
     * 重置 运行参数10
     */
    @JsonIgnore
    public void resetRunParam10(){
        this.reset(FIELD_RUNPARAM10);
    }

    /**
     * 设置 运行参数10
     * <P>
     * 等同 {@link #setRunParam10}
     * @param runParam10
     */
    @JsonIgnore
    public PSSysRunSessionDTO runparam10(String runParam10){
        this.setRunParam10(runParam10);
        return this;
    }

    /**
     * <B>RUNPARAM11</B>&nbsp;运行参数11
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_RUNPARAM11 = "runparam11";

    /**
     * 设置 运行参数11
     * 
     * @param runParam11
     * 
     */
    @JsonProperty(FIELD_RUNPARAM11)
    public void setRunParam11(String runParam11){
        this.set(FIELD_RUNPARAM11, runParam11);
    }
    
    /**
     * 获取 运行参数11  
     * @return
     */
    @JsonIgnore
    public String getRunParam11(){
        Object objValue = this.get(FIELD_RUNPARAM11);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 运行参数11 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRunParam11Dirty(){
        if(this.contains(FIELD_RUNPARAM11)){
            return true;
        }
        return false;
    }

    /**
     * 重置 运行参数11
     */
    @JsonIgnore
    public void resetRunParam11(){
        this.reset(FIELD_RUNPARAM11);
    }

    /**
     * 设置 运行参数11
     * <P>
     * 等同 {@link #setRunParam11}
     * @param runParam11
     */
    @JsonIgnore
    public PSSysRunSessionDTO runparam11(String runParam11){
        this.setRunParam11(runParam11);
        return this;
    }

    /**
     * <B>RUNPARAM12</B>&nbsp;运行参数12
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_RUNPARAM12 = "runparam12";

    /**
     * 设置 运行参数12
     * 
     * @param runParam12
     * 
     */
    @JsonProperty(FIELD_RUNPARAM12)
    public void setRunParam12(String runParam12){
        this.set(FIELD_RUNPARAM12, runParam12);
    }
    
    /**
     * 获取 运行参数12  
     * @return
     */
    @JsonIgnore
    public String getRunParam12(){
        Object objValue = this.get(FIELD_RUNPARAM12);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 运行参数12 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRunParam12Dirty(){
        if(this.contains(FIELD_RUNPARAM12)){
            return true;
        }
        return false;
    }

    /**
     * 重置 运行参数12
     */
    @JsonIgnore
    public void resetRunParam12(){
        this.reset(FIELD_RUNPARAM12);
    }

    /**
     * 设置 运行参数12
     * <P>
     * 等同 {@link #setRunParam12}
     * @param runParam12
     */
    @JsonIgnore
    public PSSysRunSessionDTO runparam12(String runParam12){
        this.setRunParam12(runParam12);
        return this;
    }

    /**
     * <B>RUNPARAM2</B>&nbsp;运行参数2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_RUNPARAM2 = "runparam2";

    /**
     * 设置 运行参数2
     * 
     * @param runParam2
     * 
     */
    @JsonProperty(FIELD_RUNPARAM2)
    public void setRunParam2(String runParam2){
        this.set(FIELD_RUNPARAM2, runParam2);
    }
    
    /**
     * 获取 运行参数2  
     * @return
     */
    @JsonIgnore
    public String getRunParam2(){
        Object objValue = this.get(FIELD_RUNPARAM2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 运行参数2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRunParam2Dirty(){
        if(this.contains(FIELD_RUNPARAM2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 运行参数2
     */
    @JsonIgnore
    public void resetRunParam2(){
        this.reset(FIELD_RUNPARAM2);
    }

    /**
     * 设置 运行参数2
     * <P>
     * 等同 {@link #setRunParam2}
     * @param runParam2
     */
    @JsonIgnore
    public PSSysRunSessionDTO runparam2(String runParam2){
        this.setRunParam2(runParam2);
        return this;
    }

    /**
     * <B>RUNPARAM3</B>&nbsp;运行参数3
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_RUNPARAM3 = "runparam3";

    /**
     * 设置 运行参数3
     * 
     * @param runParam3
     * 
     */
    @JsonProperty(FIELD_RUNPARAM3)
    public void setRunParam3(String runParam3){
        this.set(FIELD_RUNPARAM3, runParam3);
    }
    
    /**
     * 获取 运行参数3  
     * @return
     */
    @JsonIgnore
    public String getRunParam3(){
        Object objValue = this.get(FIELD_RUNPARAM3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 运行参数3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRunParam3Dirty(){
        if(this.contains(FIELD_RUNPARAM3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 运行参数3
     */
    @JsonIgnore
    public void resetRunParam3(){
        this.reset(FIELD_RUNPARAM3);
    }

    /**
     * 设置 运行参数3
     * <P>
     * 等同 {@link #setRunParam3}
     * @param runParam3
     */
    @JsonIgnore
    public PSSysRunSessionDTO runparam3(String runParam3){
        this.setRunParam3(runParam3);
        return this;
    }

    /**
     * <B>RUNPARAM4</B>&nbsp;运行参数4
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_RUNPARAM4 = "runparam4";

    /**
     * 设置 运行参数4
     * 
     * @param runParam4
     * 
     */
    @JsonProperty(FIELD_RUNPARAM4)
    public void setRunParam4(String runParam4){
        this.set(FIELD_RUNPARAM4, runParam4);
    }
    
    /**
     * 获取 运行参数4  
     * @return
     */
    @JsonIgnore
    public String getRunParam4(){
        Object objValue = this.get(FIELD_RUNPARAM4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 运行参数4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRunParam4Dirty(){
        if(this.contains(FIELD_RUNPARAM4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 运行参数4
     */
    @JsonIgnore
    public void resetRunParam4(){
        this.reset(FIELD_RUNPARAM4);
    }

    /**
     * 设置 运行参数4
     * <P>
     * 等同 {@link #setRunParam4}
     * @param runParam4
     */
    @JsonIgnore
    public PSSysRunSessionDTO runparam4(String runParam4){
        this.setRunParam4(runParam4);
        return this;
    }

    /**
     * <B>RUNPARAM5</B>&nbsp;运行参数5
     */
    public final static String FIELD_RUNPARAM5 = "runparam5";

    /**
     * 设置 运行参数5
     * 
     * @param runParam5
     * 
     */
    @JsonProperty(FIELD_RUNPARAM5)
    public void setRunParam5(Integer runParam5){
        this.set(FIELD_RUNPARAM5, runParam5);
    }
    
    /**
     * 获取 运行参数5  
     * @return
     */
    @JsonIgnore
    public Integer getRunParam5(){
        Object objValue = this.get(FIELD_RUNPARAM5);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 运行参数5 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRunParam5Dirty(){
        if(this.contains(FIELD_RUNPARAM5)){
            return true;
        }
        return false;
    }

    /**
     * 重置 运行参数5
     */
    @JsonIgnore
    public void resetRunParam5(){
        this.reset(FIELD_RUNPARAM5);
    }

    /**
     * 设置 运行参数5
     * <P>
     * 等同 {@link #setRunParam5}
     * @param runParam5
     */
    @JsonIgnore
    public PSSysRunSessionDTO runparam5(Integer runParam5){
        this.setRunParam5(runParam5);
        return this;
    }

    /**
     * <B>RUNPARAM6</B>&nbsp;运行参数6
     */
    public final static String FIELD_RUNPARAM6 = "runparam6";

    /**
     * 设置 运行参数6
     * 
     * @param runParam6
     * 
     */
    @JsonProperty(FIELD_RUNPARAM6)
    public void setRunParam6(Integer runParam6){
        this.set(FIELD_RUNPARAM6, runParam6);
    }
    
    /**
     * 获取 运行参数6  
     * @return
     */
    @JsonIgnore
    public Integer getRunParam6(){
        Object objValue = this.get(FIELD_RUNPARAM6);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 运行参数6 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRunParam6Dirty(){
        if(this.contains(FIELD_RUNPARAM6)){
            return true;
        }
        return false;
    }

    /**
     * 重置 运行参数6
     */
    @JsonIgnore
    public void resetRunParam6(){
        this.reset(FIELD_RUNPARAM6);
    }

    /**
     * 设置 运行参数6
     * <P>
     * 等同 {@link #setRunParam6}
     * @param runParam6
     */
    @JsonIgnore
    public PSSysRunSessionDTO runparam6(Integer runParam6){
        this.setRunParam6(runParam6);
        return this;
    }

    /**
     * <B>RUNPARAM7</B>&nbsp;运行参数7
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_RUNPARAM7 = "runparam7";

    /**
     * 设置 运行参数7
     * 
     * @param runParam7
     * 
     */
    @JsonProperty(FIELD_RUNPARAM7)
    public void setRunParam7(String runParam7){
        this.set(FIELD_RUNPARAM7, runParam7);
    }
    
    /**
     * 获取 运行参数7  
     * @return
     */
    @JsonIgnore
    public String getRunParam7(){
        Object objValue = this.get(FIELD_RUNPARAM7);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 运行参数7 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRunParam7Dirty(){
        if(this.contains(FIELD_RUNPARAM7)){
            return true;
        }
        return false;
    }

    /**
     * 重置 运行参数7
     */
    @JsonIgnore
    public void resetRunParam7(){
        this.reset(FIELD_RUNPARAM7);
    }

    /**
     * 设置 运行参数7
     * <P>
     * 等同 {@link #setRunParam7}
     * @param runParam7
     */
    @JsonIgnore
    public PSSysRunSessionDTO runparam7(String runParam7){
        this.setRunParam7(runParam7);
        return this;
    }

    /**
     * <B>RUNPARAM8</B>&nbsp;运行参数8
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_RUNPARAM8 = "runparam8";

    /**
     * 设置 运行参数8
     * 
     * @param runParam8
     * 
     */
    @JsonProperty(FIELD_RUNPARAM8)
    public void setRunParam8(String runParam8){
        this.set(FIELD_RUNPARAM8, runParam8);
    }
    
    /**
     * 获取 运行参数8  
     * @return
     */
    @JsonIgnore
    public String getRunParam8(){
        Object objValue = this.get(FIELD_RUNPARAM8);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 运行参数8 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRunParam8Dirty(){
        if(this.contains(FIELD_RUNPARAM8)){
            return true;
        }
        return false;
    }

    /**
     * 重置 运行参数8
     */
    @JsonIgnore
    public void resetRunParam8(){
        this.reset(FIELD_RUNPARAM8);
    }

    /**
     * 设置 运行参数8
     * <P>
     * 等同 {@link #setRunParam8}
     * @param runParam8
     */
    @JsonIgnore
    public PSSysRunSessionDTO runparam8(String runParam8){
        this.setRunParam8(runParam8);
        return this;
    }

    /**
     * <B>RUNPARAM9</B>&nbsp;运行参数9
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_RUNPARAM9 = "runparam9";

    /**
     * 设置 运行参数9
     * 
     * @param runParam9
     * 
     */
    @JsonProperty(FIELD_RUNPARAM9)
    public void setRunParam9(String runParam9){
        this.set(FIELD_RUNPARAM9, runParam9);
    }
    
    /**
     * 获取 运行参数9  
     * @return
     */
    @JsonIgnore
    public String getRunParam9(){
        Object objValue = this.get(FIELD_RUNPARAM9);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 运行参数9 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRunParam9Dirty(){
        if(this.contains(FIELD_RUNPARAM9)){
            return true;
        }
        return false;
    }

    /**
     * 重置 运行参数9
     */
    @JsonIgnore
    public void resetRunParam9(){
        this.reset(FIELD_RUNPARAM9);
    }

    /**
     * 设置 运行参数9
     * <P>
     * 等同 {@link #setRunParam9}
     * @param runParam9
     */
    @JsonIgnore
    public PSSysRunSessionDTO runparam9(String runParam9){
        this.setRunParam9(runParam9);
        return this;
    }

    /**
     * <B>RUNPSSYSDYNAMODELID</B>&nbsp;运行动态模型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysDynaModelDTO} 
     */
    public final static String FIELD_RUNPSSYSDYNAMODELID = "runpssysdynamodelid";

    /**
     * 设置 运行动态模型
     * 
     * @param runPSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_RUNPSSYSDYNAMODELID)
    public void setRunPSSysDynaModelId(String runPSSysDynaModelId){
        this.set(FIELD_RUNPSSYSDYNAMODELID, runPSSysDynaModelId);
    }
    
    /**
     * 获取 运行动态模型  
     * @return
     */
    @JsonIgnore
    public String getRunPSSysDynaModelId(){
        Object objValue = this.get(FIELD_RUNPSSYSDYNAMODELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 运行动态模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRunPSSysDynaModelIdDirty(){
        if(this.contains(FIELD_RUNPSSYSDYNAMODELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 运行动态模型
     */
    @JsonIgnore
    public void resetRunPSSysDynaModelId(){
        this.reset(FIELD_RUNPSSYSDYNAMODELID);
    }

    /**
     * 设置 运行动态模型
     * <P>
     * 等同 {@link #setRunPSSysDynaModelId}
     * @param runPSSysDynaModelId
     */
    @JsonIgnore
    public PSSysRunSessionDTO runpssysdynamodelid(String runPSSysDynaModelId){
        this.setRunPSSysDynaModelId(runPSSysDynaModelId);
        return this;
    }

    /**
     * 设置 运行动态模型，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRunPSSysDynaModelId}
     * @param pSSysDynaModel 引用对象
     */
    @JsonIgnore
    public PSSysRunSessionDTO runpssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel){
        if(pSSysDynaModel == null){
            this.setRunPSSysDynaModelId(null);
            this.setRunPSSysDynaModelName(null);
        }
        else{
            this.setRunPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setRunPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    /**
     * <B>RUNPSSYSDYNAMODELNAME</B>&nbsp;动态运行模型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_RUNPSSYSDYNAMODELID}
     */
    public final static String FIELD_RUNPSSYSDYNAMODELNAME = "runpssysdynamodelname";

    /**
     * 设置 动态运行模型
     * 
     * @param runPSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_RUNPSSYSDYNAMODELNAME)
    public void setRunPSSysDynaModelName(String runPSSysDynaModelName){
        this.set(FIELD_RUNPSSYSDYNAMODELNAME, runPSSysDynaModelName);
    }
    
    /**
     * 获取 动态运行模型  
     * @return
     */
    @JsonIgnore
    public String getRunPSSysDynaModelName(){
        Object objValue = this.get(FIELD_RUNPSSYSDYNAMODELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 动态运行模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRunPSSysDynaModelNameDirty(){
        if(this.contains(FIELD_RUNPSSYSDYNAMODELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 动态运行模型
     */
    @JsonIgnore
    public void resetRunPSSysDynaModelName(){
        this.reset(FIELD_RUNPSSYSDYNAMODELNAME);
    }

    /**
     * 设置 动态运行模型
     * <P>
     * 等同 {@link #setRunPSSysDynaModelName}
     * @param runPSSysDynaModelName
     */
    @JsonIgnore
    public PSSysRunSessionDTO runpssysdynamodelname(String runPSSysDynaModelName){
        this.setRunPSSysDynaModelName(runPSSysDynaModelName);
        return this;
    }

    /**
     * <B>RUNSTATE</B>&nbsp;运行状态
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.SysRunSessionState} 
     */
    public final static String FIELD_RUNSTATE = "runstate";

    /**
     * 设置 运行状态
     * 
     * @param runState
     * 
     */
    @JsonProperty(FIELD_RUNSTATE)
    public void setRunState(Integer runState){
        this.set(FIELD_RUNSTATE, runState);
    }
    
    /**
     * 获取 运行状态  
     * @return
     */
    @JsonIgnore
    public Integer getRunState(){
        Object objValue = this.get(FIELD_RUNSTATE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 运行状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRunStateDirty(){
        if(this.contains(FIELD_RUNSTATE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 运行状态
     */
    @JsonIgnore
    public void resetRunState(){
        this.reset(FIELD_RUNSTATE);
    }

    /**
     * 设置 运行状态
     * <P>
     * 等同 {@link #setRunState}
     * @param runState
     */
    @JsonIgnore
    public PSSysRunSessionDTO runstate(Integer runState){
        this.setRunState(runState);
        return this;
    }

     /**
     * 设置 运行状态
     * <P>
     * 等同 {@link #setRunState}
     * @param runState
     */
    @JsonIgnore
    public PSSysRunSessionDTO runstate(net.ibizsys.model.PSModelEnums.SysRunSessionState runState){
        if(runState == null){
            this.setRunState(null);
        }
        else{
            this.setRunState(runState.value);
        }
        return this;
    }

    /**
     * <B>SRCPSSYSDMVERID</B>&nbsp;源数据模型版本
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysDMVerDTO} 
     */
    public final static String FIELD_SRCPSSYSDMVERID = "srcpssysdmverid";

    /**
     * 设置 源数据模型版本
     * 
     * @param srcPSSysDMVerId
     * 
     */
    @JsonProperty(FIELD_SRCPSSYSDMVERID)
    public void setSrcPSSysDMVerId(String srcPSSysDMVerId){
        this.set(FIELD_SRCPSSYSDMVERID, srcPSSysDMVerId);
    }
    
    /**
     * 获取 源数据模型版本  
     * @return
     */
    @JsonIgnore
    public String getSrcPSSysDMVerId(){
        Object objValue = this.get(FIELD_SRCPSSYSDMVERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 源数据模型版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSrcPSSysDMVerIdDirty(){
        if(this.contains(FIELD_SRCPSSYSDMVERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 源数据模型版本
     */
    @JsonIgnore
    public void resetSrcPSSysDMVerId(){
        this.reset(FIELD_SRCPSSYSDMVERID);
    }

    /**
     * 设置 源数据模型版本
     * <P>
     * 等同 {@link #setSrcPSSysDMVerId}
     * @param srcPSSysDMVerId
     */
    @JsonIgnore
    public PSSysRunSessionDTO srcpssysdmverid(String srcPSSysDMVerId){
        this.setSrcPSSysDMVerId(srcPSSysDMVerId);
        return this;
    }

    /**
     * 设置 源数据模型版本，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setSrcPSSysDMVerId}
     * @param pSSysDMVer 引用对象
     */
    @JsonIgnore
    public PSSysRunSessionDTO srcpssysdmverid(PSSysDMVerDTO pSSysDMVer){
        if(pSSysDMVer == null){
            this.setSrcPSSysDMVerId(null);
            this.setSrcPSSysDMVerName(null);
        }
        else{
            this.setSrcPSSysDMVerId(pSSysDMVer.getPSSysDMVerId());
            this.setSrcPSSysDMVerName(pSSysDMVer.getPSSysDMVerName());
        }
        return this;
    }

    /**
     * <B>SRCPSSYSDMVERNAME</B>&nbsp;源数据模型版本
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_SRCPSSYSDMVERID}
     */
    public final static String FIELD_SRCPSSYSDMVERNAME = "srcpssysdmvername";

    /**
     * 设置 源数据模型版本
     * 
     * @param srcPSSysDMVerName
     * 
     */
    @JsonProperty(FIELD_SRCPSSYSDMVERNAME)
    public void setSrcPSSysDMVerName(String srcPSSysDMVerName){
        this.set(FIELD_SRCPSSYSDMVERNAME, srcPSSysDMVerName);
    }
    
    /**
     * 获取 源数据模型版本  
     * @return
     */
    @JsonIgnore
    public String getSrcPSSysDMVerName(){
        Object objValue = this.get(FIELD_SRCPSSYSDMVERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 源数据模型版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSrcPSSysDMVerNameDirty(){
        if(this.contains(FIELD_SRCPSSYSDMVERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 源数据模型版本
     */
    @JsonIgnore
    public void resetSrcPSSysDMVerName(){
        this.reset(FIELD_SRCPSSYSDMVERNAME);
    }

    /**
     * 设置 源数据模型版本
     * <P>
     * 等同 {@link #setSrcPSSysDMVerName}
     * @param srcPSSysDMVerName
     */
    @JsonIgnore
    public PSSysRunSessionDTO srcpssysdmvername(String srcPSSysDMVerName){
        this.setSrcPSSysDMVerName(srcPSSysDMVerName);
        return this;
    }

    /**
     * <B>STARTTIME</B>&nbsp;开始时间
     */
    public final static String FIELD_STARTTIME = "starttime";

    /**
     * 设置 开始时间
     * 
     * @param startTime
     * 
     */
    @JsonProperty(FIELD_STARTTIME)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setStartTime(Timestamp startTime){
        this.set(FIELD_STARTTIME, startTime);
    }
    
    /**
     * 获取 开始时间  
     * @return
     */
    @JsonIgnore
    public Timestamp getStartTime(){
        Object objValue = this.get(FIELD_STARTTIME);
        if(objValue==null){
            return null;
        }
        return (Timestamp)objValue;
    }

    /**
     * 判断 开始时间 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStartTimeDirty(){
        if(this.contains(FIELD_STARTTIME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开始时间
     */
    @JsonIgnore
    public void resetStartTime(){
        this.reset(FIELD_STARTTIME);
    }

    /**
     * 设置 开始时间
     * <P>
     * 等同 {@link #setStartTime}
     * @param startTime
     */
    @JsonIgnore
    public PSSysRunSessionDTO starttime(Timestamp startTime){
        this.setStartTime(startTime);
        return this;
    }

    /**
     * <B>STOPWHENTEMPLERROR</B>&nbsp;模板出错时终止
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_STOPWHENTEMPLERROR = "stopwhentemplerror";

    /**
     * 设置 模板出错时终止
     * 
     * @param stopWhenTemplError
     * 
     */
    @JsonProperty(FIELD_STOPWHENTEMPLERROR)
    public void setStopWhenTemplError(Integer stopWhenTemplError){
        this.set(FIELD_STOPWHENTEMPLERROR, stopWhenTemplError);
    }
    
    /**
     * 获取 模板出错时终止  
     * @return
     */
    @JsonIgnore
    public Integer getStopWhenTemplError(){
        Object objValue = this.get(FIELD_STOPWHENTEMPLERROR);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 模板出错时终止 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStopWhenTemplErrorDirty(){
        if(this.contains(FIELD_STOPWHENTEMPLERROR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模板出错时终止
     */
    @JsonIgnore
    public void resetStopWhenTemplError(){
        this.reset(FIELD_STOPWHENTEMPLERROR);
    }

    /**
     * 设置 模板出错时终止
     * <P>
     * 等同 {@link #setStopWhenTemplError}
     * @param stopWhenTemplError
     */
    @JsonIgnore
    public PSSysRunSessionDTO stopwhentemplerror(Integer stopWhenTemplError){
        this.setStopWhenTemplError(stopWhenTemplError);
        return this;
    }

     /**
     * 设置 模板出错时终止
     * <P>
     * 等同 {@link #setStopWhenTemplError}
     * @param stopWhenTemplError
     */
    @JsonIgnore
    public PSSysRunSessionDTO stopwhentemplerror(Boolean stopWhenTemplError){
        if(stopWhenTemplError == null){
            this.setStopWhenTemplError(null);
        }
        else{
            this.setStopWhenTemplError(stopWhenTemplError?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSSysRunSessionDTO updatedate(Timestamp updateDate){
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
    public PSSysRunSessionDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
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
    public PSSysRunSessionDTO usertag(String userTag){
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
    public PSSysRunSessionDTO usertag2(String userTag2){
        this.setUserTag2(userTag2);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSSysRunSessionId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysRunSessionId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysRunSessionId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysRunSessionId(strValue);
    }

    @JsonIgnore
    public PSSysRunSessionDTO id(String strValue){
        this.setPSSysRunSessionId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysRunSessionDTO){
            PSSysRunSessionDTO dto = (PSSysRunSessionDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
