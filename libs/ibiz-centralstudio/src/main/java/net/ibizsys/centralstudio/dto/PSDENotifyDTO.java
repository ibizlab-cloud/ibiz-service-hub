package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDENOTIFY</B>实体通知 模型传输对象
 * <P>
 * 
 */
public class PSDENotifyDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSDENotifyDTO(){
    }      

    /**
     * <B>ATTACHMENTTYPE</B>&nbsp;附件类型
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_ATTACHMENTTYPE = "attachmenttype";

    /**
     * 设置 附件类型
     * 
     * @param attachmentType
     * 
     */
    @JsonProperty(FIELD_ATTACHMENTTYPE)
    public void setAttachmentType(String attachmentType){
        this.set(FIELD_ATTACHMENTTYPE, attachmentType);
    }
    
    /**
     * 获取 附件类型  
     * @return
     */
    @JsonIgnore
    public String getAttachmentType(){
        Object objValue = this.get(FIELD_ATTACHMENTTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 附件类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAttachmentTypeDirty(){
        if(this.contains(FIELD_ATTACHMENTTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 附件类型
     */
    @JsonIgnore
    public void resetAttachmentType(){
        this.reset(FIELD_ATTACHMENTTYPE);
    }

    /**
     * 设置 附件类型
     * <P>
     * 等同 {@link #setAttachmentType}
     * @param attachmentType
     */
    @JsonIgnore
    public PSDENotifyDTO attachmenttype(String attachmentType){
        this.setAttachmentType(attachmentType);
        return this;
    }

    /**
     * <B>BEGINPSDEFID</B>&nbsp;开始时间属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_BEGINPSDEFID = "beginpsdefid";

    /**
     * 设置 开始时间属性
     * 
     * @param beginPSDEFId
     * 
     */
    @JsonProperty(FIELD_BEGINPSDEFID)
    public void setBeginPSDEFId(String beginPSDEFId){
        this.set(FIELD_BEGINPSDEFID, beginPSDEFId);
    }
    
    /**
     * 获取 开始时间属性  
     * @return
     */
    @JsonIgnore
    public String getBeginPSDEFId(){
        Object objValue = this.get(FIELD_BEGINPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开始时间属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBeginPSDEFIdDirty(){
        if(this.contains(FIELD_BEGINPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开始时间属性
     */
    @JsonIgnore
    public void resetBeginPSDEFId(){
        this.reset(FIELD_BEGINPSDEFID);
    }

    /**
     * 设置 开始时间属性
     * <P>
     * 等同 {@link #setBeginPSDEFId}
     * @param beginPSDEFId
     */
    @JsonIgnore
    public PSDENotifyDTO beginpsdefid(String beginPSDEFId){
        this.setBeginPSDEFId(beginPSDEFId);
        return this;
    }

    /**
     * 设置 开始时间属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setBeginPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDENotifyDTO beginpsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setBeginPSDEFId(null);
            this.setBeginPSDEFName(null);
        }
        else{
            this.setBeginPSDEFId(pSDEField.getPSDEFieldId());
            this.setBeginPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>BEGINPSDEFNAME</B>&nbsp;开始时间属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_BEGINPSDEFID}
     */
    public final static String FIELD_BEGINPSDEFNAME = "beginpsdefname";

    /**
     * 设置 开始时间属性
     * 
     * @param beginPSDEFName
     * 
     */
    @JsonProperty(FIELD_BEGINPSDEFNAME)
    public void setBeginPSDEFName(String beginPSDEFName){
        this.set(FIELD_BEGINPSDEFNAME, beginPSDEFName);
    }
    
    /**
     * 获取 开始时间属性  
     * @return
     */
    @JsonIgnore
    public String getBeginPSDEFName(){
        Object objValue = this.get(FIELD_BEGINPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开始时间属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBeginPSDEFNameDirty(){
        if(this.contains(FIELD_BEGINPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开始时间属性
     */
    @JsonIgnore
    public void resetBeginPSDEFName(){
        this.reset(FIELD_BEGINPSDEFNAME);
    }

    /**
     * 设置 开始时间属性
     * <P>
     * 等同 {@link #setBeginPSDEFName}
     * @param beginPSDEFName
     */
    @JsonIgnore
    public PSDENotifyDTO beginpsdefname(String beginPSDEFName){
        this.setBeginPSDEFName(beginPSDEFName);
        return this;
    }

    /**
     * <B>CHECKTIMER</B>&nbsp;检查间隔，指定实体通知的检查间隔，以分钟为单位
     */
    public final static String FIELD_CHECKTIMER = "checktimer";

    /**
     * 设置 检查间隔，详细说明：{@link #FIELD_CHECKTIMER}
     * 
     * @param checkTimer
     * 
     */
    @JsonProperty(FIELD_CHECKTIMER)
    public void setCheckTimer(Integer checkTimer){
        this.set(FIELD_CHECKTIMER, checkTimer);
    }
    
    /**
     * 获取 检查间隔  
     * @return
     */
    @JsonIgnore
    public Integer getCheckTimer(){
        Object objValue = this.get(FIELD_CHECKTIMER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 检查间隔 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCheckTimerDirty(){
        if(this.contains(FIELD_CHECKTIMER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 检查间隔
     */
    @JsonIgnore
    public void resetCheckTimer(){
        this.reset(FIELD_CHECKTIMER);
    }

    /**
     * 设置 检查间隔，详细说明：{@link #FIELD_CHECKTIMER}
     * <P>
     * 等同 {@link #setCheckTimer}
     * @param checkTimer
     */
    @JsonIgnore
    public PSDENotifyDTO checktimer(Integer checkTimer){
        this.setCheckTimer(checkTimer);
        return this;
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
    public PSDENotifyDTO codename(String codeName){
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
    public PSDENotifyDTO createdate(Timestamp createDate){
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
    public PSDENotifyDTO createman(String createMan){
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
    public PSDENotifyDTO customcode(String customCode){
        this.setCustomCode(customCode);
        return this;
    }

    /**
     * <B>CUSTOMCOND</B>&nbsp;自定义条件
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_CUSTOMCOND = "customcond";

    /**
     * 设置 自定义条件
     * 
     * @param customCond
     * 
     */
    @JsonProperty(FIELD_CUSTOMCOND)
    public void setCustomCond(String customCond){
        this.set(FIELD_CUSTOMCOND, customCond);
    }
    
    /**
     * 获取 自定义条件  
     * @return
     */
    @JsonIgnore
    public String getCustomCond(){
        Object objValue = this.get(FIELD_CUSTOMCOND);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义条件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomCondDirty(){
        if(this.contains(FIELD_CUSTOMCOND)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义条件
     */
    @JsonIgnore
    public void resetCustomCond(){
        this.reset(FIELD_CUSTOMCOND);
    }

    /**
     * 设置 自定义条件
     * <P>
     * 等同 {@link #setCustomCond}
     * @param customCond
     */
    @JsonIgnore
    public PSDENotifyDTO customcond(String customCond){
        this.setCustomCond(customCond);
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
    public PSDENotifyDTO custommode(Integer customMode){
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
    public PSDENotifyDTO custommode(Boolean customMode){
        if(customMode == null){
            this.setCustomMode(null);
        }
        else{
            this.setCustomMode(customMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENDPSDEFID</B>&nbsp;结束时间属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_ENDPSDEFID = "endpsdefid";

    /**
     * 设置 结束时间属性
     * 
     * @param endPSDEFId
     * 
     */
    @JsonProperty(FIELD_ENDPSDEFID)
    public void setEndPSDEFId(String endPSDEFId){
        this.set(FIELD_ENDPSDEFID, endPSDEFId);
    }
    
    /**
     * 获取 结束时间属性  
     * @return
     */
    @JsonIgnore
    public String getEndPSDEFId(){
        Object objValue = this.get(FIELD_ENDPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 结束时间属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEndPSDEFIdDirty(){
        if(this.contains(FIELD_ENDPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 结束时间属性
     */
    @JsonIgnore
    public void resetEndPSDEFId(){
        this.reset(FIELD_ENDPSDEFID);
    }

    /**
     * 设置 结束时间属性
     * <P>
     * 等同 {@link #setEndPSDEFId}
     * @param endPSDEFId
     */
    @JsonIgnore
    public PSDENotifyDTO endpsdefid(String endPSDEFId){
        this.setEndPSDEFId(endPSDEFId);
        return this;
    }

    /**
     * 设置 结束时间属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setEndPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDENotifyDTO endpsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setEndPSDEFId(null);
            this.setEndPSDEFName(null);
        }
        else{
            this.setEndPSDEFId(pSDEField.getPSDEFieldId());
            this.setEndPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>ENDPSDEFNAME</B>&nbsp;结束时间属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ENDPSDEFID}
     */
    public final static String FIELD_ENDPSDEFNAME = "endpsdefname";

    /**
     * 设置 结束时间属性
     * 
     * @param endPSDEFName
     * 
     */
    @JsonProperty(FIELD_ENDPSDEFNAME)
    public void setEndPSDEFName(String endPSDEFName){
        this.set(FIELD_ENDPSDEFNAME, endPSDEFName);
    }
    
    /**
     * 获取 结束时间属性  
     * @return
     */
    @JsonIgnore
    public String getEndPSDEFName(){
        Object objValue = this.get(FIELD_ENDPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 结束时间属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEndPSDEFNameDirty(){
        if(this.contains(FIELD_ENDPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 结束时间属性
     */
    @JsonIgnore
    public void resetEndPSDEFName(){
        this.reset(FIELD_ENDPSDEFNAME);
    }

    /**
     * 设置 结束时间属性
     * <P>
     * 等同 {@link #setEndPSDEFName}
     * @param endPSDEFName
     */
    @JsonIgnore
    public PSDENotifyDTO endpsdefname(String endPSDEFName){
        this.setEndPSDEFName(endPSDEFName);
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
    public PSDENotifyDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MSGTYPE</B>&nbsp;通知消息类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.InfomMsgType} 
     */
    public final static String FIELD_MSGTYPE = "msgtype";

    /**
     * 设置 通知消息类型
     * 
     * @param msgType
     * 
     */
    @JsonProperty(FIELD_MSGTYPE)
    public void setMsgType(Integer msgType){
        this.set(FIELD_MSGTYPE, msgType);
    }
    
    /**
     * 获取 通知消息类型  
     * @return
     */
    @JsonIgnore
    public Integer getMsgType(){
        Object objValue = this.get(FIELD_MSGTYPE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 通知消息类型 是否指定值，包括空值
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
     * 重置 通知消息类型
     */
    @JsonIgnore
    public void resetMsgType(){
        this.reset(FIELD_MSGTYPE);
    }

    /**
     * 设置 通知消息类型
     * <P>
     * 等同 {@link #setMsgType}
     * @param msgType
     */
    @JsonIgnore
    public PSDENotifyDTO msgtype(Integer msgType){
        this.setMsgType(msgType);
        return this;
    }

     /**
     * 设置 通知消息类型
     * <P>
     * 等同 {@link #setMsgType}
     * @param msgType
     */
    @JsonIgnore
    public PSDENotifyDTO msgtype(net.ibizsys.model.PSModelEnums.InfomMsgType[] msgType){
        if(msgType == null || msgType.length == 0){
            this.setMsgType(null);
        }
        else{
            int _value = 0;
            for(net.ibizsys.model.PSModelEnums.InfomMsgType _item : msgType){
                _value |= _item.value;
            }
            this.setMsgType(_value);
        }
        return this;
    }

    /**
     * <B>NOTIFYEND</B>&nbsp;延后通知间隔，指定实体通知的结束通知时间间隔，以分钟为单位。如定义结束时间则相对于结束时间，没有则相对于开始时间
     */
    public final static String FIELD_NOTIFYEND = "notifyend";

    /**
     * 设置 延后通知间隔，详细说明：{@link #FIELD_NOTIFYEND}
     * 
     * @param notifyEnd
     * 
     */
    @JsonProperty(FIELD_NOTIFYEND)
    public void setNotifyEnd(Integer notifyEnd){
        this.set(FIELD_NOTIFYEND, notifyEnd);
    }
    
    /**
     * 获取 延后通知间隔  
     * @return
     */
    @JsonIgnore
    public Integer getNotifyEnd(){
        Object objValue = this.get(FIELD_NOTIFYEND);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 延后通知间隔 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNotifyEndDirty(){
        if(this.contains(FIELD_NOTIFYEND)){
            return true;
        }
        return false;
    }

    /**
     * 重置 延后通知间隔
     */
    @JsonIgnore
    public void resetNotifyEnd(){
        this.reset(FIELD_NOTIFYEND);
    }

    /**
     * 设置 延后通知间隔，详细说明：{@link #FIELD_NOTIFYEND}
     * <P>
     * 等同 {@link #setNotifyEnd}
     * @param notifyEnd
     */
    @JsonIgnore
    public PSDENotifyDTO notifyend(Integer notifyEnd){
        this.setNotifyEnd(notifyEnd);
        return this;
    }

    /**
     * <B>NOTIFYSTART</B>&nbsp;提前通知间隔，指定实体通知的起始通知时间间隔，以分钟为单位。相对于开始时间
     */
    public final static String FIELD_NOTIFYSTART = "notifystart";

    /**
     * 设置 提前通知间隔，详细说明：{@link #FIELD_NOTIFYSTART}
     * 
     * @param notifyStart
     * 
     */
    @JsonProperty(FIELD_NOTIFYSTART)
    public void setNotifyStart(Integer notifyStart){
        this.set(FIELD_NOTIFYSTART, notifyStart);
    }
    
    /**
     * 获取 提前通知间隔  
     * @return
     */
    @JsonIgnore
    public Integer getNotifyStart(){
        Object objValue = this.get(FIELD_NOTIFYSTART);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 提前通知间隔 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNotifyStartDirty(){
        if(this.contains(FIELD_NOTIFYSTART)){
            return true;
        }
        return false;
    }

    /**
     * 重置 提前通知间隔
     */
    @JsonIgnore
    public void resetNotifyStart(){
        this.reset(FIELD_NOTIFYSTART);
    }

    /**
     * 设置 提前通知间隔，详细说明：{@link #FIELD_NOTIFYSTART}
     * <P>
     * 等同 {@link #setNotifyStart}
     * @param notifyStart
     */
    @JsonIgnore
    public PSDENotifyDTO notifystart(Integer notifyStart){
        this.setNotifyStart(notifyStart);
        return this;
    }

    /**
     * <B>NOTIFYTAG</B>&nbsp;通知标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_NOTIFYTAG = "notifytag";

    /**
     * 设置 通知标记
     * 
     * @param notifyTag
     * 
     */
    @JsonProperty(FIELD_NOTIFYTAG)
    public void setNotifyTag(String notifyTag){
        this.set(FIELD_NOTIFYTAG, notifyTag);
    }
    
    /**
     * 获取 通知标记  
     * @return
     */
    @JsonIgnore
    public String getNotifyTag(){
        Object objValue = this.get(FIELD_NOTIFYTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 通知标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNotifyTagDirty(){
        if(this.contains(FIELD_NOTIFYTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 通知标记
     */
    @JsonIgnore
    public void resetNotifyTag(){
        this.reset(FIELD_NOTIFYTAG);
    }

    /**
     * 设置 通知标记
     * <P>
     * 等同 {@link #setNotifyTag}
     * @param notifyTag
     */
    @JsonIgnore
    public PSDENotifyDTO notifytag(String notifyTag){
        this.setNotifyTag(notifyTag);
        return this;
    }

    /**
     * <B>NOTIFYTAG2</B>&nbsp;通知标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_NOTIFYTAG2 = "notifytag2";

    /**
     * 设置 通知标记2
     * 
     * @param notifyTag2
     * 
     */
    @JsonProperty(FIELD_NOTIFYTAG2)
    public void setNotifyTag2(String notifyTag2){
        this.set(FIELD_NOTIFYTAG2, notifyTag2);
    }
    
    /**
     * 获取 通知标记2  
     * @return
     */
    @JsonIgnore
    public String getNotifyTag2(){
        Object objValue = this.get(FIELD_NOTIFYTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 通知标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNotifyTag2Dirty(){
        if(this.contains(FIELD_NOTIFYTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 通知标记2
     */
    @JsonIgnore
    public void resetNotifyTag2(){
        this.reset(FIELD_NOTIFYTAG2);
    }

    /**
     * 设置 通知标记2
     * <P>
     * 等同 {@link #setNotifyTag2}
     * @param notifyTag2
     */
    @JsonIgnore
    public PSDENotifyDTO notifytag2(String notifyTag2){
        this.setNotifyTag2(notifyTag2);
        return this;
    }

    /**
     * <B>PROPERTYMAP</B>&nbsp;参数映射
     */
    public final static String FIELD_PROPERTYMAP = "propertymap";

    /**
     * 设置 参数映射
     * 
     * @param propertyMap
     * 
     */
    @JsonProperty(FIELD_PROPERTYMAP)
    public void setPropertyMap(String propertyMap){
        this.set(FIELD_PROPERTYMAP, propertyMap);
    }
    
    /**
     * 获取 参数映射  
     * @return
     */
    @JsonIgnore
    public String getPropertyMap(){
        Object objValue = this.get(FIELD_PROPERTYMAP);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数映射 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPropertyMapDirty(){
        if(this.contains(FIELD_PROPERTYMAP)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数映射
     */
    @JsonIgnore
    public void resetPropertyMap(){
        this.reset(FIELD_PROPERTYMAP);
    }

    /**
     * 设置 参数映射
     * <P>
     * 等同 {@link #setPropertyMap}
     * @param propertyMap
     */
    @JsonIgnore
    public PSDENotifyDTO propertymap(String propertyMap){
        this.setPropertyMap(propertyMap);
        return this;
    }

    /**
     * <B>PSDEDSID</B>&nbsp;实体数据集
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO} 
     */
    public final static String FIELD_PSDEDSID = "psdedsid";

    /**
     * 设置 实体数据集
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
     * 设置 实体数据集
     * <P>
     * 等同 {@link #setPSDEDSId}
     * @param pSDEDSId
     */
    @JsonIgnore
    public PSDENotifyDTO psdedsid(String pSDEDSId){
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
    public PSDENotifyDTO psdedsid(PSDEDataSetDTO pSDEDataSet){
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
     * <B>PSDEDSNAME</B>&nbsp;实体数据集
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDSID}
     */
    public final static String FIELD_PSDEDSNAME = "psdedsname";

    /**
     * 设置 实体数据集
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
     * 设置 实体数据集
     * <P>
     * 等同 {@link #setPSDEDSName}
     * @param pSDEDSName
     */
    @JsonIgnore
    public PSDENotifyDTO psdedsname(String pSDEDSName){
        this.setPSDEDSName(pSDEDSName);
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
    public PSDENotifyDTO psdeid(String pSDEId){
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
    public PSDENotifyDTO psdeid(PSDataEntityDTO pSDataEntity){
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
    public PSDENotifyDTO psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSDENOTIFYID</B>&nbsp;实体通知标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDENOTIFYID = "psdenotifyid";

    /**
     * 设置 实体通知标识
     * 
     * @param pSDENotifyId
     * 
     */
    @JsonProperty(FIELD_PSDENOTIFYID)
    public void setPSDENotifyId(String pSDENotifyId){
        this.set(FIELD_PSDENOTIFYID, pSDENotifyId);
    }
    
    /**
     * 获取 实体通知标识  
     * @return
     */
    @JsonIgnore
    public String getPSDENotifyId(){
        Object objValue = this.get(FIELD_PSDENOTIFYID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体通知标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDENotifyIdDirty(){
        if(this.contains(FIELD_PSDENOTIFYID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体通知标识
     */
    @JsonIgnore
    public void resetPSDENotifyId(){
        this.reset(FIELD_PSDENOTIFYID);
    }

    /**
     * 设置 实体通知标识
     * <P>
     * 等同 {@link #setPSDENotifyId}
     * @param pSDENotifyId
     */
    @JsonIgnore
    public PSDENotifyDTO psdenotifyid(String pSDENotifyId){
        this.setPSDENotifyId(pSDENotifyId);
        return this;
    }

    /**
     * <B>PSDENOTIFYNAME</B>&nbsp;实体通知名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDENOTIFYNAME = "psdenotifyname";

    /**
     * 设置 实体通知名称
     * 
     * @param pSDENotifyName
     * 
     */
    @JsonProperty(FIELD_PSDENOTIFYNAME)
    public void setPSDENotifyName(String pSDENotifyName){
        this.set(FIELD_PSDENOTIFYNAME, pSDENotifyName);
    }
    
    /**
     * 获取 实体通知名称  
     * @return
     */
    @JsonIgnore
    public String getPSDENotifyName(){
        Object objValue = this.get(FIELD_PSDENOTIFYNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体通知名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDENotifyNameDirty(){
        if(this.contains(FIELD_PSDENOTIFYNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体通知名称
     */
    @JsonIgnore
    public void resetPSDENotifyName(){
        this.reset(FIELD_PSDENOTIFYNAME);
    }

    /**
     * 设置 实体通知名称
     * <P>
     * 等同 {@link #setPSDENotifyName}
     * @param pSDENotifyName
     */
    @JsonIgnore
    public PSDENotifyDTO psdenotifyname(String pSDENotifyName){
        this.setPSDENotifyName(pSDENotifyName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDENotifyName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDENotifyName(strName);
    }

    @JsonIgnore
    public PSDENotifyDTO name(String strName){
        this.setPSDENotifyName(strName);
        return this;
    }

    /**
     * <B>PSDEPRINTID</B>&nbsp;实体打印
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEPrintDTO} 
     */
    public final static String FIELD_PSDEPRINTID = "psdeprintid";

    /**
     * 设置 实体打印
     * 
     * @param pSDEPrintId
     * 
     */
    @JsonProperty(FIELD_PSDEPRINTID)
    public void setPSDEPrintId(String pSDEPrintId){
        this.set(FIELD_PSDEPRINTID, pSDEPrintId);
    }
    
    /**
     * 获取 实体打印  
     * @return
     */
    @JsonIgnore
    public String getPSDEPrintId(){
        Object objValue = this.get(FIELD_PSDEPRINTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体打印 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEPrintIdDirty(){
        if(this.contains(FIELD_PSDEPRINTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体打印
     */
    @JsonIgnore
    public void resetPSDEPrintId(){
        this.reset(FIELD_PSDEPRINTID);
    }

    /**
     * 设置 实体打印
     * <P>
     * 等同 {@link #setPSDEPrintId}
     * @param pSDEPrintId
     */
    @JsonIgnore
    public PSDENotifyDTO psdeprintid(String pSDEPrintId){
        this.setPSDEPrintId(pSDEPrintId);
        return this;
    }

    /**
     * 设置 实体打印，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEPrintId}
     * @param pSDEPrint 引用对象
     */
    @JsonIgnore
    public PSDENotifyDTO psdeprintid(PSDEPrintDTO pSDEPrint){
        if(pSDEPrint == null){
            this.setPSDEPrintId(null);
            this.setPSDEPrintName(null);
        }
        else{
            this.setPSDEPrintId(pSDEPrint.getPSDEPrintId());
            this.setPSDEPrintName(pSDEPrint.getPSDEPrintName());
        }
        return this;
    }

    /**
     * <B>PSDEPRINTNAME</B>&nbsp;实体打印
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEPRINTID}
     */
    public final static String FIELD_PSDEPRINTNAME = "psdeprintname";

    /**
     * 设置 实体打印
     * 
     * @param pSDEPrintName
     * 
     */
    @JsonProperty(FIELD_PSDEPRINTNAME)
    public void setPSDEPrintName(String pSDEPrintName){
        this.set(FIELD_PSDEPRINTNAME, pSDEPrintName);
    }
    
    /**
     * 获取 实体打印  
     * @return
     */
    @JsonIgnore
    public String getPSDEPrintName(){
        Object objValue = this.get(FIELD_PSDEPRINTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体打印 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEPrintNameDirty(){
        if(this.contains(FIELD_PSDEPRINTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体打印
     */
    @JsonIgnore
    public void resetPSDEPrintName(){
        this.reset(FIELD_PSDEPRINTNAME);
    }

    /**
     * 设置 实体打印
     * <P>
     * 等同 {@link #setPSDEPrintName}
     * @param pSDEPrintName
     */
    @JsonIgnore
    public PSDENotifyDTO psdeprintname(String pSDEPrintName){
        this.setPSDEPrintName(pSDEPrintName);
        return this;
    }

    /**
     * <B>PSDEREPORTID</B>&nbsp;实体报表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEReportDTO} 
     */
    public final static String FIELD_PSDEREPORTID = "psdereportid";

    /**
     * 设置 实体报表
     * 
     * @param pSDEReportId
     * 
     */
    @JsonProperty(FIELD_PSDEREPORTID)
    public void setPSDEReportId(String pSDEReportId){
        this.set(FIELD_PSDEREPORTID, pSDEReportId);
    }
    
    /**
     * 获取 实体报表  
     * @return
     */
    @JsonIgnore
    public String getPSDEReportId(){
        Object objValue = this.get(FIELD_PSDEREPORTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体报表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEReportIdDirty(){
        if(this.contains(FIELD_PSDEREPORTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体报表
     */
    @JsonIgnore
    public void resetPSDEReportId(){
        this.reset(FIELD_PSDEREPORTID);
    }

    /**
     * 设置 实体报表
     * <P>
     * 等同 {@link #setPSDEReportId}
     * @param pSDEReportId
     */
    @JsonIgnore
    public PSDENotifyDTO psdereportid(String pSDEReportId){
        this.setPSDEReportId(pSDEReportId);
        return this;
    }

    /**
     * 设置 实体报表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEReportId}
     * @param pSDEReport 引用对象
     */
    @JsonIgnore
    public PSDENotifyDTO psdereportid(PSDEReportDTO pSDEReport){
        if(pSDEReport == null){
            this.setPSDEReportId(null);
            this.setPSDEReportName(null);
        }
        else{
            this.setPSDEReportId(pSDEReport.getPSDEReportId());
            this.setPSDEReportName(pSDEReport.getPSDEReportName());
        }
        return this;
    }

    /**
     * <B>PSDEREPORTNAME</B>&nbsp;实体报表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEREPORTID}
     */
    public final static String FIELD_PSDEREPORTNAME = "psdereportname";

    /**
     * 设置 实体报表
     * 
     * @param pSDEReportName
     * 
     */
    @JsonProperty(FIELD_PSDEREPORTNAME)
    public void setPSDEReportName(String pSDEReportName){
        this.set(FIELD_PSDEREPORTNAME, pSDEReportName);
    }
    
    /**
     * 获取 实体报表  
     * @return
     */
    @JsonIgnore
    public String getPSDEReportName(){
        Object objValue = this.get(FIELD_PSDEREPORTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体报表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEReportNameDirty(){
        if(this.contains(FIELD_PSDEREPORTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体报表
     */
    @JsonIgnore
    public void resetPSDEReportName(){
        this.reset(FIELD_PSDEREPORTNAME);
    }

    /**
     * 设置 实体报表
     * <P>
     * 等同 {@link #setPSDEReportName}
     * @param pSDEReportName
     */
    @JsonIgnore
    public PSDENotifyDTO psdereportname(String pSDEReportName){
        this.setPSDEReportName(pSDEReportName);
        return this;
    }

    /**
     * <B>PSSYSMSGQUEUEID</B>&nbsp;系统消息队列
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysMsgQueueDTO} 
     */
    public final static String FIELD_PSSYSMSGQUEUEID = "pssysmsgqueueid";

    /**
     * 设置 系统消息队列
     * 
     * @param pSSysMsgQueueId
     * 
     */
    @JsonProperty(FIELD_PSSYSMSGQUEUEID)
    public void setPSSysMsgQueueId(String pSSysMsgQueueId){
        this.set(FIELD_PSSYSMSGQUEUEID, pSSysMsgQueueId);
    }
    
    /**
     * 获取 系统消息队列  
     * @return
     */
    @JsonIgnore
    public String getPSSysMsgQueueId(){
        Object objValue = this.get(FIELD_PSSYSMSGQUEUEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统消息队列 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysMsgQueueIdDirty(){
        if(this.contains(FIELD_PSSYSMSGQUEUEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统消息队列
     */
    @JsonIgnore
    public void resetPSSysMsgQueueId(){
        this.reset(FIELD_PSSYSMSGQUEUEID);
    }

    /**
     * 设置 系统消息队列
     * <P>
     * 等同 {@link #setPSSysMsgQueueId}
     * @param pSSysMsgQueueId
     */
    @JsonIgnore
    public PSDENotifyDTO pssysmsgqueueid(String pSSysMsgQueueId){
        this.setPSSysMsgQueueId(pSSysMsgQueueId);
        return this;
    }

    /**
     * 设置 系统消息队列，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysMsgQueueId}
     * @param pSSysMsgQueue 引用对象
     */
    @JsonIgnore
    public PSDENotifyDTO pssysmsgqueueid(PSSysMsgQueueDTO pSSysMsgQueue){
        if(pSSysMsgQueue == null){
            this.setPSSysMsgQueueId(null);
            this.setPSSysMsgQueueName(null);
        }
        else{
            this.setPSSysMsgQueueId(pSSysMsgQueue.getPSSysMsgQueueId());
            this.setPSSysMsgQueueName(pSSysMsgQueue.getPSSysMsgQueueName());
        }
        return this;
    }

    /**
     * <B>PSSYSMSGQUEUENAME</B>&nbsp;系统消息队列
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSMSGQUEUEID}
     */
    public final static String FIELD_PSSYSMSGQUEUENAME = "pssysmsgqueuename";

    /**
     * 设置 系统消息队列
     * 
     * @param pSSysMsgQueueName
     * 
     */
    @JsonProperty(FIELD_PSSYSMSGQUEUENAME)
    public void setPSSysMsgQueueName(String pSSysMsgQueueName){
        this.set(FIELD_PSSYSMSGQUEUENAME, pSSysMsgQueueName);
    }
    
    /**
     * 获取 系统消息队列  
     * @return
     */
    @JsonIgnore
    public String getPSSysMsgQueueName(){
        Object objValue = this.get(FIELD_PSSYSMSGQUEUENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统消息队列 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysMsgQueueNameDirty(){
        if(this.contains(FIELD_PSSYSMSGQUEUENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统消息队列
     */
    @JsonIgnore
    public void resetPSSysMsgQueueName(){
        this.reset(FIELD_PSSYSMSGQUEUENAME);
    }

    /**
     * 设置 系统消息队列
     * <P>
     * 等同 {@link #setPSSysMsgQueueName}
     * @param pSSysMsgQueueName
     */
    @JsonIgnore
    public PSDENotifyDTO pssysmsgqueuename(String pSSysMsgQueueName){
        this.setPSSysMsgQueueName(pSSysMsgQueueName);
        return this;
    }

    /**
     * <B>PSSYSMSGTEMPLID</B>&nbsp;系统消息模板
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysMsgTemplDTO} 
     */
    public final static String FIELD_PSSYSMSGTEMPLID = "pssysmsgtemplid";

    /**
     * 设置 系统消息模板
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
     * 设置 系统消息模板
     * <P>
     * 等同 {@link #setPSSysMsgTemplId}
     * @param pSSysMsgTemplId
     */
    @JsonIgnore
    public PSDENotifyDTO pssysmsgtemplid(String pSSysMsgTemplId){
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
    public PSDENotifyDTO pssysmsgtemplid(PSSysMsgTemplDTO pSSysMsgTempl){
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
     * <B>PSSYSMSGTEMPLNAME</B>&nbsp;系统消息模板
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSMSGTEMPLID}
     */
    public final static String FIELD_PSSYSMSGTEMPLNAME = "pssysmsgtemplname";

    /**
     * 设置 系统消息模板
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
     * 设置 系统消息模板
     * <P>
     * 等同 {@link #setPSSysMsgTemplName}
     * @param pSSysMsgTemplName
     */
    @JsonIgnore
    public PSDENotifyDTO pssysmsgtemplname(String pSSysMsgTemplName){
        this.setPSSysMsgTemplName(pSSysMsgTemplName);
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
    public PSDENotifyDTO pssyssfpluginid(String pSSysSFPluginId){
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
    public PSDENotifyDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin){
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
    public PSDENotifyDTO pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    /**
     * <B>TASKMODE</B>&nbsp;附加任务模式，指定实体通知的附加任务模式，未定义时为【无任务】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DENotifyTaskMode} 
     */
    public final static String FIELD_TASKMODE = "taskmode";

    /**
     * 设置 附加任务模式，详细说明：{@link #FIELD_TASKMODE}
     * 
     * @param taskMode
     * 
     */
    @JsonProperty(FIELD_TASKMODE)
    public void setTaskMode(Integer taskMode){
        this.set(FIELD_TASKMODE, taskMode);
    }
    
    /**
     * 获取 附加任务模式  
     * @return
     */
    @JsonIgnore
    public Integer getTaskMode(){
        Object objValue = this.get(FIELD_TASKMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 附加任务模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTaskModeDirty(){
        if(this.contains(FIELD_TASKMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 附加任务模式
     */
    @JsonIgnore
    public void resetTaskMode(){
        this.reset(FIELD_TASKMODE);
    }

    /**
     * 设置 附加任务模式，详细说明：{@link #FIELD_TASKMODE}
     * <P>
     * 等同 {@link #setTaskMode}
     * @param taskMode
     */
    @JsonIgnore
    public PSDENotifyDTO taskmode(Integer taskMode){
        this.setTaskMode(taskMode);
        return this;
    }

     /**
     * 设置 附加任务模式，详细说明：{@link #FIELD_TASKMODE}
     * <P>
     * 等同 {@link #setTaskMode}
     * @param taskMode
     */
    @JsonIgnore
    public PSDENotifyDTO taskmode(net.ibizsys.model.PSModelEnums.DENotifyTaskMode taskMode){
        if(taskMode == null){
            this.setTaskMode(null);
        }
        else{
            this.setTaskMode(taskMode.value);
        }
        return this;
    }

    /**
     * <B>TIMERMODE</B>&nbsp;定时触发模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_TIMERMODE = "timermode";

    /**
     * 设置 定时触发模式
     * 
     * @param timerMode
     * 
     */
    @JsonProperty(FIELD_TIMERMODE)
    public void setTimerMode(Integer timerMode){
        this.set(FIELD_TIMERMODE, timerMode);
    }
    
    /**
     * 获取 定时触发模式  
     * @return
     */
    @JsonIgnore
    public Integer getTimerMode(){
        Object objValue = this.get(FIELD_TIMERMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 定时触发模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTimerModeDirty(){
        if(this.contains(FIELD_TIMERMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 定时触发模式
     */
    @JsonIgnore
    public void resetTimerMode(){
        this.reset(FIELD_TIMERMODE);
    }

    /**
     * 设置 定时触发模式
     * <P>
     * 等同 {@link #setTimerMode}
     * @param timerMode
     */
    @JsonIgnore
    public PSDENotifyDTO timermode(Integer timerMode){
        this.setTimerMode(timerMode);
        return this;
    }

     /**
     * 设置 定时触发模式
     * <P>
     * 等同 {@link #setTimerMode}
     * @param timerMode
     */
    @JsonIgnore
    public PSDENotifyDTO timermode(Boolean timerMode){
        if(timerMode == null){
            this.setTimerMode(null);
        }
        else{
            this.setTimerMode(timerMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSDENotifyDTO updatedate(Timestamp updateDate){
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
    public PSDENotifyDTO updateman(String updateMan){
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
    public PSDENotifyDTO usercat(String userCat){
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
    public PSDENotifyDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat.value);
        }
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
    public PSDENotifyDTO usertag(String userTag){
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
    public PSDENotifyDTO usertag2(String userTag2){
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
    public PSDENotifyDTO usertag3(String userTag3){
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
    public PSDENotifyDTO usertag4(String userTag4){
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
    public PSDENotifyDTO validflag(Integer validFlag){
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
    public PSDENotifyDTO validflag(Boolean validFlag){
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
        return this.getPSDENotifyId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSDENotifyId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDENotifyId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDENotifyId(strValue);
    }

    @JsonIgnore
    public PSDENotifyDTO id(String strValue){
        this.setPSDENotifyId(strValue);
        return this;
    }


    /**
     *  实体通知目标 成员集合
     */
    public final static String FIELD_PSDENOTIFYTARGETS = "psdenotifytargets";

    private java.util.List<net.ibizsys.centralstudio.dto.PSDENotifyTargetDTO> psdenotifytargets;

    /**
     * 获取 实体通知目标 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDENOTIFYTARGETS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSDENotifyTargetDTO> getPSDENotifyTargets(){
        return this.psdenotifytargets;
    }

    /**
     * 设置 实体通知目标 成员集合  
     * @param psdenotifytargets
     */
    @JsonProperty(FIELD_PSDENOTIFYTARGETS)
    public void setPSDENotifyTargets(java.util.List<net.ibizsys.centralstudio.dto.PSDENotifyTargetDTO> psdenotifytargets){
        this.psdenotifytargets = psdenotifytargets;
    }

    /**
     * 获取 实体通知目标 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSDENotifyTargetDTO> getPSDENotifyTargetsIf(){
        if(this.psdenotifytargets == null){
            this.psdenotifytargets = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSDENotifyTargetDTO>();          
        }
        return this.psdenotifytargets;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDENotifyDTO){
            PSDENotifyDTO dto = (PSDENotifyDTO)iEntity;
            dto.setPSDENotifyTargets(this.getPSDENotifyTargets());
        }
        super.copyTo(iEntity);
    }
}
