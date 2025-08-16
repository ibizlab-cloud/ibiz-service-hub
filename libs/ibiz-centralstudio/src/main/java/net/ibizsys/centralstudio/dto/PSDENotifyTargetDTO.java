package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDENOTIFYTARGET</B>实体通知目标 模型传输对象
 * <P>
 * 
 */
public class PSDENotifyTargetDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSDENotifyTargetDTO(){
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
    public PSDENotifyTargetDTO createdate(Timestamp createDate){
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
    public PSDENotifyTargetDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>FILTER</B>&nbsp;过滤项
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_FILTER = "filter";

    /**
     * 设置 过滤项
     * 
     * @param filter
     * 
     */
    @JsonProperty(FIELD_FILTER)
    public void setFilter(String filter){
        this.set(FIELD_FILTER, filter);
    }
    
    /**
     * 获取 过滤项  
     * @return
     */
    @JsonIgnore
    public String getFilter(){
        Object objValue = this.get(FIELD_FILTER);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 过滤项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFilterDirty(){
        if(this.contains(FIELD_FILTER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 过滤项
     */
    @JsonIgnore
    public void resetFilter(){
        this.reset(FIELD_FILTER);
    }

    /**
     * 设置 过滤项
     * <P>
     * 等同 {@link #setFilter}
     * @param filter
     */
    @JsonIgnore
    public PSDENotifyTargetDTO filter(String filter){
        this.setFilter(filter);
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
    public PSDENotifyTargetDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;PSDEID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDENOTIFYID}
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 PSDEID
     * 
     * @param pSDEId
     * 
     */
    @JsonProperty(FIELD_PSDEID)
    public void setPSDEId(String pSDEId){
        this.set(FIELD_PSDEID, pSDEId);
    }
    
    /**
     * 获取 PSDEID  
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
     * 判断 PSDEID 是否指定值，包括空值
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
     * 重置 PSDEID
     */
    @JsonIgnore
    public void resetPSDEId(){
        this.reset(FIELD_PSDEID);
    }

    /**
     * 设置 PSDEID
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSDENotifyTargetDTO psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * <B>PSDENOTIFYID</B>&nbsp;实体通知
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDENotifyDTO} 
     */
    public final static String FIELD_PSDENOTIFYID = "psdenotifyid";

    /**
     * 设置 实体通知
     * 
     * @param pSDENotifyId
     * 
     */
    @JsonProperty(FIELD_PSDENOTIFYID)
    public void setPSDENotifyId(String pSDENotifyId){
        this.set(FIELD_PSDENOTIFYID, pSDENotifyId);
    }
    
    /**
     * 获取 实体通知  
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
     * 判断 实体通知 是否指定值，包括空值
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
     * 重置 实体通知
     */
    @JsonIgnore
    public void resetPSDENotifyId(){
        this.reset(FIELD_PSDENOTIFYID);
    }

    /**
     * 设置 实体通知
     * <P>
     * 等同 {@link #setPSDENotifyId}
     * @param pSDENotifyId
     */
    @JsonIgnore
    public PSDENotifyTargetDTO psdenotifyid(String pSDENotifyId){
        this.setPSDENotifyId(pSDENotifyId);
        return this;
    }

    /**
     * 设置 实体通知，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDENotifyId}
     * @param pSDENotify 引用对象
     */
    @JsonIgnore
    public PSDENotifyTargetDTO psdenotifyid(PSDENotifyDTO pSDENotify){
        if(pSDENotify == null){
            this.setPSDEId(null);
            this.setPSDENotifyId(null);
            this.setPSDENotifyName(null);
        }
        else{
            this.setPSDEId(pSDENotify.getPSDEId());
            this.setPSDENotifyId(pSDENotify.getPSDENotifyId());
            this.setPSDENotifyName(pSDENotify.getPSDENotifyName());
        }
        return this;
    }

    /**
     * <B>PSDENOTIFYNAME</B>&nbsp;实体通知
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDENOTIFYID}
     */
    public final static String FIELD_PSDENOTIFYNAME = "psdenotifyname";

    /**
     * 设置 实体通知
     * 
     * @param pSDENotifyName
     * 
     */
    @JsonProperty(FIELD_PSDENOTIFYNAME)
    public void setPSDENotifyName(String pSDENotifyName){
        this.set(FIELD_PSDENOTIFYNAME, pSDENotifyName);
    }
    
    /**
     * 获取 实体通知  
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
     * 判断 实体通知 是否指定值，包括空值
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
     * 重置 实体通知
     */
    @JsonIgnore
    public void resetPSDENotifyName(){
        this.reset(FIELD_PSDENOTIFYNAME);
    }

    /**
     * 设置 实体通知
     * <P>
     * 等同 {@link #setPSDENotifyName}
     * @param pSDENotifyName
     */
    @JsonIgnore
    public PSDENotifyTargetDTO psdenotifyname(String pSDENotifyName){
        this.setPSDENotifyName(pSDENotifyName);
        return this;
    }

    /**
     * <B>PSDENOTIFYTARGETID</B>&nbsp;实体通知目标标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDENOTIFYTARGETID = "psdenotifytargetid";

    /**
     * 设置 实体通知目标标识
     * 
     * @param pSDENotifyTargetId
     * 
     */
    @JsonProperty(FIELD_PSDENOTIFYTARGETID)
    public void setPSDENotifyTargetId(String pSDENotifyTargetId){
        this.set(FIELD_PSDENOTIFYTARGETID, pSDENotifyTargetId);
    }
    
    /**
     * 获取 实体通知目标标识  
     * @return
     */
    @JsonIgnore
    public String getPSDENotifyTargetId(){
        Object objValue = this.get(FIELD_PSDENOTIFYTARGETID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体通知目标标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDENotifyTargetIdDirty(){
        if(this.contains(FIELD_PSDENOTIFYTARGETID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体通知目标标识
     */
    @JsonIgnore
    public void resetPSDENotifyTargetId(){
        this.reset(FIELD_PSDENOTIFYTARGETID);
    }

    /**
     * 设置 实体通知目标标识
     * <P>
     * 等同 {@link #setPSDENotifyTargetId}
     * @param pSDENotifyTargetId
     */
    @JsonIgnore
    public PSDENotifyTargetDTO psdenotifytargetid(String pSDENotifyTargetId){
        this.setPSDENotifyTargetId(pSDENotifyTargetId);
        return this;
    }

    /**
     * <B>PSDENOTIFYTARGETNAME</B>&nbsp;通知目标名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDENOTIFYTARGETNAME = "psdenotifytargetname";

    /**
     * 设置 通知目标名称
     * 
     * @param pSDENotifyTargetName
     * 
     */
    @JsonProperty(FIELD_PSDENOTIFYTARGETNAME)
    public void setPSDENotifyTargetName(String pSDENotifyTargetName){
        this.set(FIELD_PSDENOTIFYTARGETNAME, pSDENotifyTargetName);
    }
    
    /**
     * 获取 通知目标名称  
     * @return
     */
    @JsonIgnore
    public String getPSDENotifyTargetName(){
        Object objValue = this.get(FIELD_PSDENOTIFYTARGETNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 通知目标名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDENotifyTargetNameDirty(){
        if(this.contains(FIELD_PSDENOTIFYTARGETNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 通知目标名称
     */
    @JsonIgnore
    public void resetPSDENotifyTargetName(){
        this.reset(FIELD_PSDENOTIFYTARGETNAME);
    }

    /**
     * 设置 通知目标名称
     * <P>
     * 等同 {@link #setPSDENotifyTargetName}
     * @param pSDENotifyTargetName
     */
    @JsonIgnore
    public PSDENotifyTargetDTO psdenotifytargetname(String pSDENotifyTargetName){
        this.setPSDENotifyTargetName(pSDENotifyTargetName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDENotifyTargetName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDENotifyTargetName(strName);
    }

    @JsonIgnore
    public PSDENotifyTargetDTO name(String strName){
        this.setPSDENotifyTargetName(strName);
        return this;
    }

    /**
     * <B>PSSYSMSGTARGETID</B>&nbsp;系统消息目标
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysMsgTargetDTO} 
     */
    public final static String FIELD_PSSYSMSGTARGETID = "pssysmsgtargetid";

    /**
     * 设置 系统消息目标
     * 
     * @param pSSysMsgTargetId
     * 
     */
    @JsonProperty(FIELD_PSSYSMSGTARGETID)
    public void setPSSysMsgTargetId(String pSSysMsgTargetId){
        this.set(FIELD_PSSYSMSGTARGETID, pSSysMsgTargetId);
    }
    
    /**
     * 获取 系统消息目标  
     * @return
     */
    @JsonIgnore
    public String getPSSysMsgTargetId(){
        Object objValue = this.get(FIELD_PSSYSMSGTARGETID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统消息目标 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysMsgTargetIdDirty(){
        if(this.contains(FIELD_PSSYSMSGTARGETID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统消息目标
     */
    @JsonIgnore
    public void resetPSSysMsgTargetId(){
        this.reset(FIELD_PSSYSMSGTARGETID);
    }

    /**
     * 设置 系统消息目标
     * <P>
     * 等同 {@link #setPSSysMsgTargetId}
     * @param pSSysMsgTargetId
     */
    @JsonIgnore
    public PSDENotifyTargetDTO pssysmsgtargetid(String pSSysMsgTargetId){
        this.setPSSysMsgTargetId(pSSysMsgTargetId);
        return this;
    }

    /**
     * 设置 系统消息目标，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysMsgTargetId}
     * @param pSSysMsgTarget 引用对象
     */
    @JsonIgnore
    public PSDENotifyTargetDTO pssysmsgtargetid(PSSysMsgTargetDTO pSSysMsgTarget){
        if(pSSysMsgTarget == null){
            this.setPSSysMsgTargetId(null);
            this.setPSSysMsgTargetName(null);
        }
        else{
            this.setPSSysMsgTargetId(pSSysMsgTarget.getPSSysMsgTargetId());
            this.setPSSysMsgTargetName(pSSysMsgTarget.getPSSysMsgTargetName());
        }
        return this;
    }

    /**
     * <B>PSSYSMSGTARGETNAME</B>&nbsp;系统消息目标
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSMSGTARGETID}
     */
    public final static String FIELD_PSSYSMSGTARGETNAME = "pssysmsgtargetname";

    /**
     * 设置 系统消息目标
     * 
     * @param pSSysMsgTargetName
     * 
     */
    @JsonProperty(FIELD_PSSYSMSGTARGETNAME)
    public void setPSSysMsgTargetName(String pSSysMsgTargetName){
        this.set(FIELD_PSSYSMSGTARGETNAME, pSSysMsgTargetName);
    }
    
    /**
     * 获取 系统消息目标  
     * @return
     */
    @JsonIgnore
    public String getPSSysMsgTargetName(){
        Object objValue = this.get(FIELD_PSSYSMSGTARGETNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统消息目标 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysMsgTargetNameDirty(){
        if(this.contains(FIELD_PSSYSMSGTARGETNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统消息目标
     */
    @JsonIgnore
    public void resetPSSysMsgTargetName(){
        this.reset(FIELD_PSSYSMSGTARGETNAME);
    }

    /**
     * 设置 系统消息目标
     * <P>
     * 等同 {@link #setPSSysMsgTargetName}
     * @param pSSysMsgTargetName
     */
    @JsonIgnore
    public PSDENotifyTargetDTO pssysmsgtargetname(String pSSysMsgTargetName){
        this.setPSSysMsgTargetName(pSSysMsgTargetName);
        return this;
    }

    /**
     * <B>TARGETPSDEFID</B>&nbsp;目标标识属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_TARGETPSDEFID = "targetpsdefid";

    /**
     * 设置 目标标识属性
     * 
     * @param targetPSDEFId
     * 
     */
    @JsonProperty(FIELD_TARGETPSDEFID)
    public void setTargetPSDEFId(String targetPSDEFId){
        this.set(FIELD_TARGETPSDEFID, targetPSDEFId);
    }
    
    /**
     * 获取 目标标识属性  
     * @return
     */
    @JsonIgnore
    public String getTargetPSDEFId(){
        Object objValue = this.get(FIELD_TARGETPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标标识属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTargetPSDEFIdDirty(){
        if(this.contains(FIELD_TARGETPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标标识属性
     */
    @JsonIgnore
    public void resetTargetPSDEFId(){
        this.reset(FIELD_TARGETPSDEFID);
    }

    /**
     * 设置 目标标识属性
     * <P>
     * 等同 {@link #setTargetPSDEFId}
     * @param targetPSDEFId
     */
    @JsonIgnore
    public PSDENotifyTargetDTO targetpsdefid(String targetPSDEFId){
        this.setTargetPSDEFId(targetPSDEFId);
        return this;
    }

    /**
     * 设置 目标标识属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTargetPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDENotifyTargetDTO targetpsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setTargetPSDEFId(null);
            this.setTargetPSDEFName(null);
        }
        else{
            this.setTargetPSDEFId(pSDEField.getPSDEFieldId());
            this.setTargetPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>TARGETPSDEFNAME</B>&nbsp;目标标识属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TARGETPSDEFID}
     */
    public final static String FIELD_TARGETPSDEFNAME = "targetpsdefname";

    /**
     * 设置 目标标识属性
     * 
     * @param targetPSDEFName
     * 
     */
    @JsonProperty(FIELD_TARGETPSDEFNAME)
    public void setTargetPSDEFName(String targetPSDEFName){
        this.set(FIELD_TARGETPSDEFNAME, targetPSDEFName);
    }
    
    /**
     * 获取 目标标识属性  
     * @return
     */
    @JsonIgnore
    public String getTargetPSDEFName(){
        Object objValue = this.get(FIELD_TARGETPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标标识属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTargetPSDEFNameDirty(){
        if(this.contains(FIELD_TARGETPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标标识属性
     */
    @JsonIgnore
    public void resetTargetPSDEFName(){
        this.reset(FIELD_TARGETPSDEFNAME);
    }

    /**
     * 设置 目标标识属性
     * <P>
     * 等同 {@link #setTargetPSDEFName}
     * @param targetPSDEFName
     */
    @JsonIgnore
    public PSDENotifyTargetDTO targetpsdefname(String targetPSDEFName){
        this.setTargetPSDEFName(targetPSDEFName);
        return this;
    }

    /**
     * <B>TARGETTYPE</B>&nbsp;目标类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DENotifyTargetType} 
     */
    public final static String FIELD_TARGETTYPE = "targettype";

    /**
     * 设置 目标类型
     * 
     * @param targetType
     * 
     */
    @JsonProperty(FIELD_TARGETTYPE)
    public void setTargetType(String targetType){
        this.set(FIELD_TARGETTYPE, targetType);
    }
    
    /**
     * 获取 目标类型  
     * @return
     */
    @JsonIgnore
    public String getTargetType(){
        Object objValue = this.get(FIELD_TARGETTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTargetTypeDirty(){
        if(this.contains(FIELD_TARGETTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标类型
     */
    @JsonIgnore
    public void resetTargetType(){
        this.reset(FIELD_TARGETTYPE);
    }

    /**
     * 设置 目标类型
     * <P>
     * 等同 {@link #setTargetType}
     * @param targetType
     */
    @JsonIgnore
    public PSDENotifyTargetDTO targettype(String targetType){
        this.setTargetType(targetType);
        return this;
    }

     /**
     * 设置 目标类型
     * <P>
     * 等同 {@link #setTargetType}
     * @param targetType
     */
    @JsonIgnore
    public PSDENotifyTargetDTO targettype(net.ibizsys.model.PSModelEnums.DENotifyTargetType targetType){
        if(targetType == null){
            this.setTargetType(null);
        }
        else{
            this.setTargetType(targetType.value);
        }
        return this;
    }

    /**
     * <B>TARGETTYPEPSDEFID</B>&nbsp;目标类型属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_TARGETTYPEPSDEFID = "targettypepsdefid";

    /**
     * 设置 目标类型属性
     * 
     * @param targetTypePSDEFId
     * 
     */
    @JsonProperty(FIELD_TARGETTYPEPSDEFID)
    public void setTargetTypePSDEFId(String targetTypePSDEFId){
        this.set(FIELD_TARGETTYPEPSDEFID, targetTypePSDEFId);
    }
    
    /**
     * 获取 目标类型属性  
     * @return
     */
    @JsonIgnore
    public String getTargetTypePSDEFId(){
        Object objValue = this.get(FIELD_TARGETTYPEPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标类型属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTargetTypePSDEFIdDirty(){
        if(this.contains(FIELD_TARGETTYPEPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标类型属性
     */
    @JsonIgnore
    public void resetTargetTypePSDEFId(){
        this.reset(FIELD_TARGETTYPEPSDEFID);
    }

    /**
     * 设置 目标类型属性
     * <P>
     * 等同 {@link #setTargetTypePSDEFId}
     * @param targetTypePSDEFId
     */
    @JsonIgnore
    public PSDENotifyTargetDTO targettypepsdefid(String targetTypePSDEFId){
        this.setTargetTypePSDEFId(targetTypePSDEFId);
        return this;
    }

    /**
     * 设置 目标类型属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTargetTypePSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDENotifyTargetDTO targettypepsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setTargetTypePSDEFId(null);
            this.setTargetTypePSDEFName(null);
        }
        else{
            this.setTargetTypePSDEFId(pSDEField.getPSDEFieldId());
            this.setTargetTypePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>TARGETTYPEPSDEFNAME</B>&nbsp;目标类型属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TARGETTYPEPSDEFID}
     */
    public final static String FIELD_TARGETTYPEPSDEFNAME = "targettypepsdefname";

    /**
     * 设置 目标类型属性
     * 
     * @param targetTypePSDEFName
     * 
     */
    @JsonProperty(FIELD_TARGETTYPEPSDEFNAME)
    public void setTargetTypePSDEFName(String targetTypePSDEFName){
        this.set(FIELD_TARGETTYPEPSDEFNAME, targetTypePSDEFName);
    }
    
    /**
     * 获取 目标类型属性  
     * @return
     */
    @JsonIgnore
    public String getTargetTypePSDEFName(){
        Object objValue = this.get(FIELD_TARGETTYPEPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标类型属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTargetTypePSDEFNameDirty(){
        if(this.contains(FIELD_TARGETTYPEPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标类型属性
     */
    @JsonIgnore
    public void resetTargetTypePSDEFName(){
        this.reset(FIELD_TARGETTYPEPSDEFNAME);
    }

    /**
     * 设置 目标类型属性
     * <P>
     * 等同 {@link #setTargetTypePSDEFName}
     * @param targetTypePSDEFName
     */
    @JsonIgnore
    public PSDENotifyTargetDTO targettypepsdefname(String targetTypePSDEFName){
        this.setTargetTypePSDEFName(targetTypePSDEFName);
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
    public PSDENotifyTargetDTO updatedate(Timestamp updateDate){
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
    public PSDENotifyTargetDTO updateman(String updateMan){
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
    public PSDENotifyTargetDTO usercat(String userCat){
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
    public PSDENotifyTargetDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSDENotifyTargetDTO usertag(String userTag){
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
    public PSDENotifyTargetDTO usertag2(String userTag2){
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
    public PSDENotifyTargetDTO usertag3(String userTag3){
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
    public PSDENotifyTargetDTO usertag4(String userTag4){
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
    public PSDENotifyTargetDTO validflag(Integer validFlag){
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
    public PSDENotifyTargetDTO validflag(Boolean validFlag){
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
        return this.getPSDENotifyTargetId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSDENotifyTargetId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDENotifyTargetId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDENotifyTargetId(strValue);
    }

    @JsonIgnore
    public PSDENotifyTargetDTO id(String strValue){
        this.setPSDENotifyTargetId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDENotifyTargetDTO){
            PSDENotifyTargetDTO dto = (PSDENotifyTargetDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
