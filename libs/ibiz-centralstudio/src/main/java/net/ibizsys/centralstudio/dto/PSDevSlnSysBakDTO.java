package net.ibizsys.centralstudio.dto;

import net.ibizsys.centralstudio.util.CentralEntityDTOBase;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;


public class PSDevSlnSysBakDTO extends CentralEntityDTOBase{

    /**
     * <B>LINKCODE</B>&nbsp;链接代码
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_LINKCODE = "linkcode";

    /**
     * 设置 链接代码
     * 
     * @param linkCode
     * 
     */
    @JsonProperty(FIELD_LINKCODE)
    public void setLinkCode(String linkCode){
        this.set(FIELD_LINKCODE, linkCode);
    }
    
    /**
     * 获取 链接代码  
     * @return
     */
    @JsonIgnore
    public String getLinkCode(){
        Object objValue = this.get(FIELD_LINKCODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 链接代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLinkCodeDirty(){
        if(this.contains(FIELD_LINKCODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 链接代码
     */
    @JsonIgnore
    public void resetLinkCode(){
        this.reset(FIELD_LINKCODE);
    }

    /**
     * 设置 链接代码
     * <P>
     * 等同 {@link #setLinkCode}
     * @param linkCode
     */
    @JsonIgnore
    public PSDevSlnSysBakDTO linkcode(String linkCode){
        this.setLinkCode(linkCode);
        return this;
    }

    /**
     * <B>PSDEVSLNSYSBAKNAME</B>&nbsp;开发系统备份名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEVSLNSYSBAKNAME = "psdevslnsysbakname";

    /**
     * 设置 开发系统备份名称
     * 
     * @param pSDevSlnSysBakName
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNSYSBAKNAME)
    public void setPSDevSlnSysBakName(String pSDevSlnSysBakName){
        this.set(FIELD_PSDEVSLNSYSBAKNAME, pSDevSlnSysBakName);
    }
    
    /**
     * 获取 开发系统备份名称  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnSysBakName(){
        Object objValue = this.get(FIELD_PSDEVSLNSYSBAKNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发系统备份名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnSysBakNameDirty(){
        if(this.contains(FIELD_PSDEVSLNSYSBAKNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发系统备份名称
     */
    @JsonIgnore
    public void resetPSDevSlnSysBakName(){
        this.reset(FIELD_PSDEVSLNSYSBAKNAME);
    }

    /**
     * 设置 开发系统备份名称
     * <P>
     * 等同 {@link #setPSDevSlnSysBakName}
     * @param pSDevSlnSysBakName
     */
    @JsonIgnore
    public PSDevSlnSysBakDTO psdevslnsysbakname(String pSDevSlnSysBakName){
        this.setPSDevSlnSysBakName(pSDevSlnSysBakName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDevSlnSysBakName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDevSlnSysBakName(strName);
    }

    @JsonIgnore
    public PSDevSlnSysBakDTO name(String strName){
        this.setPSDevSlnSysBakName(strName);
        return this;
    }

    /**
     * <B>LINKREPMSG</B>&nbsp;链接反馈消息
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_LINKREPMSG = "linkrepmsg";

    /**
     * 设置 链接反馈消息
     * 
     * @param linkRepMsg
     * 
     */
    @JsonProperty(FIELD_LINKREPMSG)
    public void setLinkRepMsg(String linkRepMsg){
        this.set(FIELD_LINKREPMSG, linkRepMsg);
    }
    
    /**
     * 获取 链接反馈消息  
     * @return
     */
    @JsonIgnore
    public String getLinkRepMsg(){
        Object objValue = this.get(FIELD_LINKREPMSG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 链接反馈消息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLinkRepMsgDirty(){
        if(this.contains(FIELD_LINKREPMSG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 链接反馈消息
     */
    @JsonIgnore
    public void resetLinkRepMsg(){
        this.reset(FIELD_LINKREPMSG);
    }

    /**
     * 设置 链接反馈消息
     * <P>
     * 等同 {@link #setLinkRepMsg}
     * @param linkRepMsg
     */
    @JsonIgnore
    public PSDevSlnSysBakDTO linkrepmsg(String linkRepMsg){
        this.setLinkRepMsg(linkRepMsg);
        return this;
    }

    /**
     * <B>BACKUPFILEPATH</B>&nbsp;备份文件路径
     * <P>
     * 字符串：最大长度 400
     */
    public final static String FIELD_BACKUPFILEPATH = "backupfilepath";

    /**
     * 设置 备份文件路径
     * 
     * @param backupFilePath
     * 
     */
    @JsonProperty(FIELD_BACKUPFILEPATH)
    public void setBackupFilePath(String backupFilePath){
        this.set(FIELD_BACKUPFILEPATH, backupFilePath);
    }
    
    /**
     * 获取 备份文件路径  
     * @return
     */
    @JsonIgnore
    public String getBackupFilePath(){
        Object objValue = this.get(FIELD_BACKUPFILEPATH);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 备份文件路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBackupFilePathDirty(){
        if(this.contains(FIELD_BACKUPFILEPATH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 备份文件路径
     */
    @JsonIgnore
    public void resetBackupFilePath(){
        this.reset(FIELD_BACKUPFILEPATH);
    }

    /**
     * 设置 备份文件路径
     * <P>
     * 等同 {@link #setBackupFilePath}
     * @param backupFilePath
     */
    @JsonIgnore
    public PSDevSlnSysBakDTO backupfilepath(String backupFilePath){
        this.setBackupFilePath(backupFilePath);
        return this;
    }

    /**
     * <B>PSSYSMODELINSTID</B>&nbsp;系统模型实例标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSMODELINSTID = "pssysmodelinstid";

    /**
     * 设置 系统模型实例标识
     * 
     * @param pSSysModelInstId
     * 
     */
    @JsonProperty(FIELD_PSSYSMODELINSTID)
    public void setPSSysModelInstId(String pSSysModelInstId){
        this.set(FIELD_PSSYSMODELINSTID, pSSysModelInstId);
    }
    
    /**
     * 获取 系统模型实例标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysModelInstId(){
        Object objValue = this.get(FIELD_PSSYSMODELINSTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统模型实例标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysModelInstIdDirty(){
        if(this.contains(FIELD_PSSYSMODELINSTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统模型实例标识
     */
    @JsonIgnore
    public void resetPSSysModelInstId(){
        this.reset(FIELD_PSSYSMODELINSTID);
    }

    /**
     * 设置 系统模型实例标识
     * <P>
     * 等同 {@link #setPSSysModelInstId}
     * @param pSSysModelInstId
     */
    @JsonIgnore
    public PSDevSlnSysBakDTO pssysmodelinstid(String pSSysModelInstId){
        this.setPSSysModelInstId(pSSysModelInstId);
        return this;
    }

    /**
     * <B>ACCESSTOKEN</B>&nbsp;访问标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ACCESSTOKEN = "accesstoken";

    /**
     * 设置 访问标识
     * 
     * @param accessToken
     * 
     */
    @JsonProperty(FIELD_ACCESSTOKEN)
    public void setAccessToken(String accessToken){
        this.set(FIELD_ACCESSTOKEN, accessToken);
    }
    
    /**
     * 获取 访问标识  
     * @return
     */
    @JsonIgnore
    public String getAccessToken(){
        Object objValue = this.get(FIELD_ACCESSTOKEN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 访问标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAccessTokenDirty(){
        if(this.contains(FIELD_ACCESSTOKEN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 访问标识
     */
    @JsonIgnore
    public void resetAccessToken(){
        this.reset(FIELD_ACCESSTOKEN);
    }

    /**
     * 设置 访问标识
     * <P>
     * 等同 {@link #setAccessToken}
     * @param accessToken
     */
    @JsonIgnore
    public PSDevSlnSysBakDTO accesstoken(String accessToken){
        this.setAccessToken(accessToken);
        return this;
    }

    /**
     * <B>LINKREQMSG</B>&nbsp;链接请求消息
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_LINKREQMSG = "linkreqmsg";

    /**
     * 设置 链接请求消息
     * 
     * @param linkReqMsg
     * 
     */
    @JsonProperty(FIELD_LINKREQMSG)
    public void setLinkReqMsg(String linkReqMsg){
        this.set(FIELD_LINKREQMSG, linkReqMsg);
    }
    
    /**
     * 获取 链接请求消息  
     * @return
     */
    @JsonIgnore
    public String getLinkReqMsg(){
        Object objValue = this.get(FIELD_LINKREQMSG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 链接请求消息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLinkReqMsgDirty(){
        if(this.contains(FIELD_LINKREQMSG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 链接请求消息
     */
    @JsonIgnore
    public void resetLinkReqMsg(){
        this.reset(FIELD_LINKREQMSG);
    }

    /**
     * 设置 链接请求消息
     * <P>
     * 等同 {@link #setLinkReqMsg}
     * @param linkReqMsg
     */
    @JsonIgnore
    public PSDevSlnSysBakDTO linkreqmsg(String linkReqMsg){
        this.setLinkReqMsg(linkReqMsg);
        return this;
    }

    /**
     * <B>BACKUPTIME</B>&nbsp;备份时间
     */
    public final static String FIELD_BACKUPTIME = "backuptime";

    /**
     * 设置 备份时间
     * 
     * @param backupTime
     * 
     */
    @JsonProperty(FIELD_BACKUPTIME)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setBackupTime(Timestamp backupTime){
        this.set(FIELD_BACKUPTIME, backupTime);
    }
    
    /**
     * 获取 备份时间  
     * @return
     */
    @JsonIgnore
    public Timestamp getBackupTime(){
        Object objValue = this.get(FIELD_BACKUPTIME);
        if(objValue==null){
            return null;
        }
        return (Timestamp)objValue;
    }

    /**
     * 判断 备份时间 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBackupTimeDirty(){
        if(this.contains(FIELD_BACKUPTIME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 备份时间
     */
    @JsonIgnore
    public void resetBackupTime(){
        this.reset(FIELD_BACKUPTIME);
    }

    /**
     * 设置 备份时间
     * <P>
     * 等同 {@link #setBackupTime}
     * @param backupTime
     */
    @JsonIgnore
    public PSDevSlnSysBakDTO backuptime(Timestamp backupTime){
        this.setBackupTime(backupTime);
        return this;
    }

    /**
     * <B>BEGINBACKUPTIME</B>&nbsp;开始备份时间
     */
    public final static String FIELD_BEGINBACKUPTIME = "beginbackuptime";

    /**
     * 设置 开始备份时间
     * 
     * @param beginBackupTime
     * 
     */
    @JsonProperty(FIELD_BEGINBACKUPTIME)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setBeginBackupTime(Timestamp beginBackupTime){
        this.set(FIELD_BEGINBACKUPTIME, beginBackupTime);
    }
    
    /**
     * 获取 开始备份时间  
     * @return
     */
    @JsonIgnore
    public Timestamp getBeginBackupTime(){
        Object objValue = this.get(FIELD_BEGINBACKUPTIME);
        if(objValue==null){
            return null;
        }
        return (Timestamp)objValue;
    }

    /**
     * 判断 开始备份时间 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBeginBackupTimeDirty(){
        if(this.contains(FIELD_BEGINBACKUPTIME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开始备份时间
     */
    @JsonIgnore
    public void resetBeginBackupTime(){
        this.reset(FIELD_BEGINBACKUPTIME);
    }

    /**
     * 设置 开始备份时间
     * <P>
     * 等同 {@link #setBeginBackupTime}
     * @param beginBackupTime
     */
    @JsonIgnore
    public PSDevSlnSysBakDTO beginbackuptime(Timestamp beginBackupTime){
        this.setBeginBackupTime(beginBackupTime);
        return this;
    }

    /**
     * <B>ENDBACKUPTIME</B>&nbsp;结束备份时间
     */
    public final static String FIELD_ENDBACKUPTIME = "endbackuptime";

    /**
     * 设置 结束备份时间
     * 
     * @param endBackupTime
     * 
     */
    @JsonProperty(FIELD_ENDBACKUPTIME)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setEndBackupTime(Timestamp endBackupTime){
        this.set(FIELD_ENDBACKUPTIME, endBackupTime);
    }
    
    /**
     * 获取 结束备份时间  
     * @return
     */
    @JsonIgnore
    public Timestamp getEndBackupTime(){
        Object objValue = this.get(FIELD_ENDBACKUPTIME);
        if(objValue==null){
            return null;
        }
        return (Timestamp)objValue;
    }

    /**
     * 判断 结束备份时间 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEndBackupTimeDirty(){
        if(this.contains(FIELD_ENDBACKUPTIME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 结束备份时间
     */
    @JsonIgnore
    public void resetEndBackupTime(){
        this.reset(FIELD_ENDBACKUPTIME);
    }

    /**
     * 设置 结束备份时间
     * <P>
     * 等同 {@link #setEndBackupTime}
     * @param endBackupTime
     */
    @JsonIgnore
    public PSDevSlnSysBakDTO endbackuptime(Timestamp endBackupTime){
        this.setEndBackupTime(endBackupTime);
        return this;
    }

    /**
     * <B>LINKFLAG</B>&nbsp;链接备份
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.YesNo} 
     */
    public final static String FIELD_LINKFLAG = "linkflag";

    /**
     * 设置 链接备份
     * 
     * @param linkFlag
     * 
     */
    @JsonProperty(FIELD_LINKFLAG)
    public void setLinkFlag(Integer linkFlag){
        this.set(FIELD_LINKFLAG, linkFlag);
    }
    
    /**
     * 获取 链接备份  
     * @return
     */
    @JsonIgnore
    public Integer getLinkFlag(){
        Object objValue = this.get(FIELD_LINKFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 链接备份 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLinkFlagDirty(){
        if(this.contains(FIELD_LINKFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 链接备份
     */
    @JsonIgnore
    public void resetLinkFlag(){
        this.reset(FIELD_LINKFLAG);
    }

    /**
     * 设置 链接备份
     * <P>
     * 等同 {@link #setLinkFlag}
     * @param linkFlag
     */
    @JsonIgnore
    public PSDevSlnSysBakDTO linkflag(Integer linkFlag){
        this.setLinkFlag(linkFlag);
        return this;
    }

     /**
     * 设置 链接备份
     * <P>
     * 等同 {@link #setLinkFlag}
     * @param linkFlag
     */
    @JsonIgnore
    public PSDevSlnSysBakDTO linkflag(Boolean linkFlag){
        if(linkFlag == null){
            this.setLinkFlag(null);
        }
        else{
            this.setLinkFlag(linkFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLELINK</B>&nbsp;支持外部链接
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.YesNo} 
     */
    public final static String FIELD_ENABLELINK = "enablelink";

    /**
     * 设置 支持外部链接
     * 
     * @param enableLink
     * 
     */
    @JsonProperty(FIELD_ENABLELINK)
    public void setEnableLink(Integer enableLink){
        this.set(FIELD_ENABLELINK, enableLink);
    }
    
    /**
     * 获取 支持外部链接  
     * @return
     */
    @JsonIgnore
    public Integer getEnableLink(){
        Object objValue = this.get(FIELD_ENABLELINK);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持外部链接 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableLinkDirty(){
        if(this.contains(FIELD_ENABLELINK)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持外部链接
     */
    @JsonIgnore
    public void resetEnableLink(){
        this.reset(FIELD_ENABLELINK);
    }

    /**
     * 设置 支持外部链接
     * <P>
     * 等同 {@link #setEnableLink}
     * @param enableLink
     */
    @JsonIgnore
    public PSDevSlnSysBakDTO enablelink(Integer enableLink){
        this.setEnableLink(enableLink);
        return this;
    }

     /**
     * 设置 支持外部链接
     * <P>
     * 等同 {@link #setEnableLink}
     * @param enableLink
     */
    @JsonIgnore
    public PSDevSlnSysBakDTO enablelink(Boolean enableLink){
        if(enableLink == null){
            this.setEnableLink(null);
        }
        else{
            this.setEnableLink(enableLink?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
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
    public PSDevSlnSysBakDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>OFFLINEFLAG</B>&nbsp;离线备份
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.YesNo} 
     */
    public final static String FIELD_OFFLINEFLAG = "offlineflag";

    /**
     * 设置 离线备份
     * 
     * @param offlineFlag
     * 
     */
    @JsonProperty(FIELD_OFFLINEFLAG)
    public void setOfflineFlag(Integer offlineFlag){
        this.set(FIELD_OFFLINEFLAG, offlineFlag);
    }
    
    /**
     * 获取 离线备份  
     * @return
     */
    @JsonIgnore
    public Integer getOfflineFlag(){
        Object objValue = this.get(FIELD_OFFLINEFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 离线备份 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOfflineFlagDirty(){
        if(this.contains(FIELD_OFFLINEFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 离线备份
     */
    @JsonIgnore
    public void resetOfflineFlag(){
        this.reset(FIELD_OFFLINEFLAG);
    }

    /**
     * 设置 离线备份
     * <P>
     * 等同 {@link #setOfflineFlag}
     * @param offlineFlag
     */
    @JsonIgnore
    public PSDevSlnSysBakDTO offlineflag(Integer offlineFlag){
        this.setOfflineFlag(offlineFlag);
        return this;
    }

     /**
     * 设置 离线备份
     * <P>
     * 等同 {@link #setOfflineFlag}
     * @param offlineFlag
     */
    @JsonIgnore
    public PSDevSlnSysBakDTO offlineflag(Boolean offlineFlag){
        if(offlineFlag == null){
            this.setOfflineFlag(null);
        }
        else{
            this.setOfflineFlag(offlineFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
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
    public PSDevSlnSysBakDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>PSDEVSLNSYSBAKID</B>&nbsp;开发系统备份标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVSLNSYSBAKID = "psdevslnsysbakid";

    /**
     * 设置 开发系统备份标识
     * 
     * @param pSDevSlnSysBakId
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNSYSBAKID)
    public void setPSDevSlnSysBakId(String pSDevSlnSysBakId){
        this.set(FIELD_PSDEVSLNSYSBAKID, pSDevSlnSysBakId);
    }
    
    /**
     * 获取 开发系统备份标识  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnSysBakId(){
        Object objValue = this.get(FIELD_PSDEVSLNSYSBAKID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发系统备份标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnSysBakIdDirty(){
        if(this.contains(FIELD_PSDEVSLNSYSBAKID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发系统备份标识
     */
    @JsonIgnore
    public void resetPSDevSlnSysBakId(){
        this.reset(FIELD_PSDEVSLNSYSBAKID);
    }

    /**
     * 设置 开发系统备份标识
     * <P>
     * 等同 {@link #setPSDevSlnSysBakId}
     * @param pSDevSlnSysBakId
     */
    @JsonIgnore
    public PSDevSlnSysBakDTO psdevslnsysbakid(String pSDevSlnSysBakId){
        this.setPSDevSlnSysBakId(pSDevSlnSysBakId);
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
    public PSDevSlnSysBakDTO updatedate(Timestamp updateDate){
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
    public PSDevSlnSysBakDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
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
    public PSDevSlnSysBakDTO createdate(Timestamp createDate){
        this.setCreateDate(createDate);
        return this;
    }

    /**
     * <B>BACKUPMODE</B>&nbsp;备份模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.DevSlnSysBKMode} 
     */
    public final static String FIELD_BACKUPMODE = "backupmode";

    /**
     * 设置 备份模式
     * 
     * @param backupMode
     * 
     */
    @JsonProperty(FIELD_BACKUPMODE)
    public void setBackupMode(String backupMode){
        this.set(FIELD_BACKUPMODE, backupMode);
        //属性名称与代码标识不一致，设置属性名称
        this.set("bkmode", backupMode);
    }
    
    /**
     * 获取 备份模式  
     * @return
     */
    @JsonIgnore
    public String getBackupMode(){
        Object objValue = this.get(FIELD_BACKUPMODE);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("bkmode");
            if(objValue == null){
                    return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 备份模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBackupModeDirty(){
        if(this.contains(FIELD_BACKUPMODE)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("bkmode")){
            return true;
        }
        return false;
    }

    /**
     * 重置 备份模式
     */
    @JsonIgnore
    public void resetBackupMode(){
        this.reset(FIELD_BACKUPMODE);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("bkmode");
    }

    /**
     * 设置 备份模式
     * <P>
     * 等同 {@link #setBackupMode}
     * @param backupMode
     */
    @JsonIgnore
    public PSDevSlnSysBakDTO backupmode(String backupMode){
        this.setBackupMode(backupMode);
        return this;
    }

     /**
     * 设置 备份模式
     * <P>
     * 等同 {@link #setBackupMode}
     * @param backupMode
     */
    @JsonIgnore
    public PSDevSlnSysBakDTO backupmode(net.ibizsys.centralstudio.util.CentralEnums.DevSlnSysBKMode backupMode){
        if(backupMode == null){
            this.setBackupMode(null);
        }
        else{
            this.setBackupMode(backupMode.value);
        }
        return this;
    }

    /**
     * <B>BACKUPSTATE</B>&nbsp;备份状态
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.DevSlnSysBkState} 
     */
    public final static String FIELD_BACKUPSTATE = "backupstate";

    /**
     * 设置 备份状态
     * 
     * @param backupState
     * 
     */
    @JsonProperty(FIELD_BACKUPSTATE)
    public void setBackupState(Integer backupState){
        this.set(FIELD_BACKUPSTATE, backupState);
    }
    
    /**
     * 获取 备份状态  
     * @return
     */
    @JsonIgnore
    public Integer getBackupState(){
        Object objValue = this.get(FIELD_BACKUPSTATE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 备份状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBackupStateDirty(){
        if(this.contains(FIELD_BACKUPSTATE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 备份状态
     */
    @JsonIgnore
    public void resetBackupState(){
        this.reset(FIELD_BACKUPSTATE);
    }

    /**
     * 设置 备份状态
     * <P>
     * 等同 {@link #setBackupState}
     * @param backupState
     */
    @JsonIgnore
    public PSDevSlnSysBakDTO backupstate(Integer backupState){
        this.setBackupState(backupState);
        return this;
    }

     /**
     * 设置 备份状态
     * <P>
     * 等同 {@link #setBackupState}
     * @param backupState
     */
    @JsonIgnore
    public PSDevSlnSysBakDTO backupstate(net.ibizsys.centralstudio.util.CentralEnums.DevSlnSysBkState backupState){
        if(backupState == null){
            this.setBackupState(null);
        }
        else{
            this.setBackupState(backupState.value);
        }
        return this;
    }

    /**
     * <B>PSDEVSLNSYSNAME</B>&nbsp;开发系统
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVSLNSYSID}
     */
    public final static String FIELD_PSDEVSLNSYSNAME = "psdevslnsysname";

    /**
     * 设置 开发系统
     * 
     * @param pSDevSlnSysName
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNSYSNAME)
    public void setPSDevSlnSysName(String pSDevSlnSysName){
        this.set(FIELD_PSDEVSLNSYSNAME, pSDevSlnSysName);
    }
    
    /**
     * 获取 开发系统  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnSysName(){
        Object objValue = this.get(FIELD_PSDEVSLNSYSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发系统 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnSysNameDirty(){
        if(this.contains(FIELD_PSDEVSLNSYSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发系统
     */
    @JsonIgnore
    public void resetPSDevSlnSysName(){
        this.reset(FIELD_PSDEVSLNSYSNAME);
    }

    /**
     * 设置 开发系统
     * <P>
     * 等同 {@link #setPSDevSlnSysName}
     * @param pSDevSlnSysName
     */
    @JsonIgnore
    public PSDevSlnSysBakDTO psdevslnsysname(String pSDevSlnSysName){
        this.setPSDevSlnSysName(pSDevSlnSysName);
        return this;
    }

    /**
     * <B>PSDEVSLNSYSID</B>&nbsp;开发系统
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVSLNSYSID = "psdevslnsysid";

    /**
     * 设置 开发系统
     * 
     * @param pSDevSlnSysId
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNSYSID)
    public void setPSDevSlnSysId(String pSDevSlnSysId){
        this.set(FIELD_PSDEVSLNSYSID, pSDevSlnSysId);
    }
    
    /**
     * 获取 开发系统  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnSysId(){
        Object objValue = this.get(FIELD_PSDEVSLNSYSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发系统 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnSysIdDirty(){
        if(this.contains(FIELD_PSDEVSLNSYSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发系统
     */
    @JsonIgnore
    public void resetPSDevSlnSysId(){
        this.reset(FIELD_PSDEVSLNSYSID);
    }

    /**
     * 设置 开发系统
     * <P>
     * 等同 {@link #setPSDevSlnSysId}
     * @param pSDevSlnSysId
     */
    @JsonIgnore
    public PSDevSlnSysBakDTO psdevslnsysid(String pSDevSlnSysId){
        this.setPSDevSlnSysId(pSDevSlnSysId);
        return this;
    }

    /**
     * <B>PSDEVCENTERNAME</B>&nbsp;应用中心
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVCENTERID}
     */
    public final static String FIELD_PSDEVCENTERNAME = "psdevcentername";

    /**
     * 设置 应用中心
     * 
     * @param pSDevCenterName
     * 
     */
    @JsonProperty(FIELD_PSDEVCENTERNAME)
    public void setPSDevCenterName(String pSDevCenterName){
        this.set(FIELD_PSDEVCENTERNAME, pSDevCenterName);
    }
    
    /**
     * 获取 应用中心  
     * @return
     */
    @JsonIgnore
    public String getPSDevCenterName(){
        Object objValue = this.get(FIELD_PSDEVCENTERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用中心 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevCenterNameDirty(){
        if(this.contains(FIELD_PSDEVCENTERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用中心
     */
    @JsonIgnore
    public void resetPSDevCenterName(){
        this.reset(FIELD_PSDEVCENTERNAME);
    }

    /**
     * 设置 应用中心
     * <P>
     * 等同 {@link #setPSDevCenterName}
     * @param pSDevCenterName
     */
    @JsonIgnore
    public PSDevSlnSysBakDTO psdevcentername(String pSDevCenterName){
        this.setPSDevCenterName(pSDevCenterName);
        return this;
    }

    /**
     * <B>PSDEVCENTERID</B>&nbsp;应用中心
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVCENTERID = "psdevcenterid";

    /**
     * 设置 应用中心
     * 
     * @param pSDevCenterId
     * 
     */
    @JsonProperty(FIELD_PSDEVCENTERID)
    public void setPSDevCenterId(String pSDevCenterId){
        this.set(FIELD_PSDEVCENTERID, pSDevCenterId);
    }
    
    /**
     * 获取 应用中心  
     * @return
     */
    @JsonIgnore
    public String getPSDevCenterId(){
        Object objValue = this.get(FIELD_PSDEVCENTERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用中心 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevCenterIdDirty(){
        if(this.contains(FIELD_PSDEVCENTERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用中心
     */
    @JsonIgnore
    public void resetPSDevCenterId(){
        this.reset(FIELD_PSDEVCENTERID);
    }

    /**
     * 设置 应用中心
     * <P>
     * 等同 {@link #setPSDevCenterId}
     * @param pSDevCenterId
     */
    @JsonIgnore
    public PSDevSlnSysBakDTO psdevcenterid(String pSDevCenterId){
        this.setPSDevCenterId(pSDevCenterId);
        return this;
    }

    /**
     * <B>BACKUPSIZE</B>&nbsp;备份大小
     */
    public final static String FIELD_BACKUPSIZE = "backupsize";

    /**
     * 设置 备份大小
     * 
     * @param backupSize
     * 
     */
    @JsonProperty(FIELD_BACKUPSIZE)
    public void setBackupSize(Integer backupSize){
        this.set(FIELD_BACKUPSIZE, backupSize);
    }
    
    /**
     * 获取 备份大小  
     * @return
     */
    @JsonIgnore
    public Integer getBackupSize(){
        Object objValue = this.get(FIELD_BACKUPSIZE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 备份大小 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBackupSizeDirty(){
        if(this.contains(FIELD_BACKUPSIZE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 备份大小
     */
    @JsonIgnore
    public void resetBackupSize(){
        this.reset(FIELD_BACKUPSIZE);
    }

    /**
     * 设置 备份大小
     * <P>
     * 等同 {@link #setBackupSize}
     * @param backupSize
     */
    @JsonIgnore
    public PSDevSlnSysBakDTO backupsize(Integer backupSize){
        this.setBackupSize(backupSize);
        return this;
    }

    /**
     * <B>MODELVER</B>&nbsp;模型版本
     */
    public final static String FIELD_MODELVER = "modelver";

    /**
     * 设置 模型版本
     * 
     * @param modelVer
     * 
     */
    @JsonProperty(FIELD_MODELVER)
    public void setModelVer(Integer modelVer){
        this.set(FIELD_MODELVER, modelVer);
    }
    
    /**
     * 获取 模型版本  
     * @return
     */
    @JsonIgnore
    public Integer getModelVer(){
        Object objValue = this.get(FIELD_MODELVER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 模型版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isModelVerDirty(){
        if(this.contains(FIELD_MODELVER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模型版本
     */
    @JsonIgnore
    public void resetModelVer(){
        this.reset(FIELD_MODELVER);
    }

    /**
     * 设置 模型版本
     * <P>
     * 等同 {@link #setModelVer}
     * @param modelVer
     */
    @JsonIgnore
    public PSDevSlnSysBakDTO modelver(Integer modelVer){
        this.setModelVer(modelVer);
        return this;
    }

    @JsonIgnore
    @Override
    public Object getSrfkey(){
        return this.getPSDevSlnSysBakId();
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDevSlnSysBakDTO){
            PSDevSlnSysBakDTO dto = (PSDevSlnSysBakDTO)iEntity;
        }
        super.copyTo(iEntity);
    }

    @Override
    protected Map<String, Object> prepareAny() {
        Map<String, Object> any = super.prepareAny();
        if(any != null){
            any.remove(FIELD_CREATEMAN);
            any.remove(FIELD_UPDATEMAN);
            any.remove(FIELD_CREATEDATE);
            any.remove(FIELD_UPDATEDATE);
        }
        return any;
    }
    
}