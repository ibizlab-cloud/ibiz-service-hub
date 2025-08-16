package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSWFPROCROLE</B>流程处理角色 模型传输对象
 * <P>
 * 流程处理角色模型，定义交互流程处理的工作流角色
 */
public class PSWFProcRole extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSWFProcRole(){
    }      

    /**
     * <B>CCMODE</B>&nbsp;仅抄送，指定流程处理角色是否仅做抄送处理，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_CCMODE = "ccmode";

    /**
     * 设置 仅抄送，详细说明：{@link #FIELD_CCMODE}
     * 
     * @param cCMode
     * 
     */
    @JsonProperty(FIELD_CCMODE)
    public void setCCMode(Integer cCMode){
        this.set(FIELD_CCMODE, cCMode);
    }
    
    /**
     * 获取 仅抄送  
     * @return
     */
    @JsonIgnore
    public Integer getCCMode(){
        Object objValue = this.get(FIELD_CCMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 仅抄送 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCCModeDirty(){
        if(this.contains(FIELD_CCMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 仅抄送
     */
    @JsonIgnore
    public void resetCCMode(){
        this.reset(FIELD_CCMODE);
    }

    /**
     * 设置 仅抄送，详细说明：{@link #FIELD_CCMODE}
     * <P>
     * 等同 {@link #setCCMode}
     * @param cCMode
     */
    @JsonIgnore
    public PSWFProcRole ccmode(Integer cCMode){
        this.setCCMode(cCMode);
        return this;
    }

     /**
     * 设置 仅抄送，详细说明：{@link #FIELD_CCMODE}
     * <P>
     * 等同 {@link #setCCMode}
     * @param cCMode
     */
    @JsonIgnore
    public PSWFProcRole ccmode(Boolean cCMode){
        if(cCMode == null){
            this.setCCMode(null);
        }
        else{
            this.setCCMode(cCMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
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
    public PSWFProcRole createdate(String createDate){
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
    public PSWFProcRole createman(String createMan){
        this.setCreateMan(createMan);
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
    public PSWFProcRole memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSSYSMSGTEMPLID</B>&nbsp;消息模板，指定流程处理角色的消息通知模板，未定义时使用处理的默认消息模板
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysMsgTempl} 
     */
    public final static String FIELD_PSSYSMSGTEMPLID = "pssysmsgtemplid";

    /**
     * 设置 消息模板，详细说明：{@link #FIELD_PSSYSMSGTEMPLID}
     * 
     * @param pSSysMsgTemplId
     * 
     */
    @JsonProperty(FIELD_PSSYSMSGTEMPLID)
    public void setPSSysMsgTemplId(String pSSysMsgTemplId){
        this.set(FIELD_PSSYSMSGTEMPLID, pSSysMsgTemplId);
    }
    
    /**
     * 获取 消息模板  
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
     * 判断 消息模板 是否指定值，包括空值
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
     * 重置 消息模板
     */
    @JsonIgnore
    public void resetPSSysMsgTemplId(){
        this.reset(FIELD_PSSYSMSGTEMPLID);
    }

    /**
     * 设置 消息模板，详细说明：{@link #FIELD_PSSYSMSGTEMPLID}
     * <P>
     * 等同 {@link #setPSSysMsgTemplId}
     * @param pSSysMsgTemplId
     */
    @JsonIgnore
    public PSWFProcRole pssysmsgtemplid(String pSSysMsgTemplId){
        this.setPSSysMsgTemplId(pSSysMsgTemplId);
        return this;
    }

    /**
     * 设置 消息模板，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysMsgTemplId}
     * @param pSSysMsgTempl 引用对象
     */
    @JsonIgnore
    public PSWFProcRole pssysmsgtemplid(PSSysMsgTempl pSSysMsgTempl){
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
     * <B>PSSYSMSGTEMPLNAME</B>&nbsp;消息模板，指定流程处理角色的消息通知模板，未定义时使用处理的默认消息模板
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSMSGTEMPLID}
     */
    public final static String FIELD_PSSYSMSGTEMPLNAME = "pssysmsgtemplname";

    /**
     * 设置 消息模板，详细说明：{@link #FIELD_PSSYSMSGTEMPLNAME}
     * 
     * @param pSSysMsgTemplName
     * 
     */
    @JsonProperty(FIELD_PSSYSMSGTEMPLNAME)
    public void setPSSysMsgTemplName(String pSSysMsgTemplName){
        this.set(FIELD_PSSYSMSGTEMPLNAME, pSSysMsgTemplName);
    }
    
    /**
     * 获取 消息模板  
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
     * 判断 消息模板 是否指定值，包括空值
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
     * 重置 消息模板
     */
    @JsonIgnore
    public void resetPSSysMsgTemplName(){
        this.reset(FIELD_PSSYSMSGTEMPLNAME);
    }

    /**
     * 设置 消息模板，详细说明：{@link #FIELD_PSSYSMSGTEMPLNAME}
     * <P>
     * 等同 {@link #setPSSysMsgTemplName}
     * @param pSSysMsgTemplName
     */
    @JsonIgnore
    public PSWFProcRole pssysmsgtemplname(String pSSysMsgTemplName){
        this.setPSSysMsgTemplName(pSSysMsgTemplName);
        return this;
    }

    /**
     * <B>PSWFID</B>&nbsp;流程标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWFVERSIONID}
     */
    public final static String FIELD_PSWFID = "pswfid";

    /**
     * 设置 流程标识
     * 
     * @param pSWFID
     * 
     */
    @JsonProperty(FIELD_PSWFID)
    public void setPSWFID(String pSWFID){
        this.set(FIELD_PSWFID, pSWFID);
    }
    
    /**
     * 获取 流程标识  
     * @return
     */
    @JsonIgnore
    public String getPSWFID(){
        Object objValue = this.get(FIELD_PSWFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFIDDirty(){
        if(this.contains(FIELD_PSWFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程标识
     */
    @JsonIgnore
    public void resetPSWFID(){
        this.reset(FIELD_PSWFID);
    }

    /**
     * 设置 流程标识
     * <P>
     * 等同 {@link #setPSWFID}
     * @param pSWFID
     */
    @JsonIgnore
    public PSWFProcRole pswfid(String pSWFID){
        this.setPSWFID(pSWFID);
        return this;
    }

    /**
     * <B>PSWFPROCESSID</B>&nbsp;流程处理，指定流程处理角色所属的流程处理
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSWFProcess} 
     */
    public final static String FIELD_PSWFPROCESSID = "pswfprocessid";

    /**
     * 设置 流程处理，详细说明：{@link #FIELD_PSWFPROCESSID}
     * 
     * @param pSWFProcessId
     * 
     */
    @JsonProperty(FIELD_PSWFPROCESSID)
    public void setPSWFProcessId(String pSWFProcessId){
        this.set(FIELD_PSWFPROCESSID, pSWFProcessId);
    }
    
    /**
     * 获取 流程处理  
     * @return
     */
    @JsonIgnore
    public String getPSWFProcessId(){
        Object objValue = this.get(FIELD_PSWFPROCESSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程处理 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFProcessIdDirty(){
        if(this.contains(FIELD_PSWFPROCESSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程处理
     */
    @JsonIgnore
    public void resetPSWFProcessId(){
        this.reset(FIELD_PSWFPROCESSID);
    }

    /**
     * 设置 流程处理，详细说明：{@link #FIELD_PSWFPROCESSID}
     * <P>
     * 等同 {@link #setPSWFProcessId}
     * @param pSWFProcessId
     */
    @JsonIgnore
    public PSWFProcRole pswfprocessid(String pSWFProcessId){
        this.setPSWFProcessId(pSWFProcessId);
        return this;
    }

    /**
     * 设置 流程处理，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSWFProcessId}
     * @param pSWFProcess 引用对象
     */
    @JsonIgnore
    public PSWFProcRole pswfprocessid(PSWFProcess pSWFProcess){
        if(pSWFProcess == null){
            this.setPSWFProcessId(null);
            this.setPSWFProcessName(null);
        }
        else{
            this.setPSWFProcessId(pSWFProcess.getPSWFProcessId());
            this.setPSWFProcessName(pSWFProcess.getPSWFProcessName());
        }
        return this;
    }

    /**
     * <B>PSWFPROCESSNAME</B>&nbsp;流程处理，指定流程处理角色所属的流程处理
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWFPROCESSID}
     */
    public final static String FIELD_PSWFPROCESSNAME = "pswfprocessname";

    /**
     * 设置 流程处理，详细说明：{@link #FIELD_PSWFPROCESSNAME}
     * 
     * @param pSWFProcessName
     * 
     */
    @JsonProperty(FIELD_PSWFPROCESSNAME)
    public void setPSWFProcessName(String pSWFProcessName){
        this.set(FIELD_PSWFPROCESSNAME, pSWFProcessName);
    }
    
    /**
     * 获取 流程处理  
     * @return
     */
    @JsonIgnore
    public String getPSWFProcessName(){
        Object objValue = this.get(FIELD_PSWFPROCESSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程处理 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFProcessNameDirty(){
        if(this.contains(FIELD_PSWFPROCESSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程处理
     */
    @JsonIgnore
    public void resetPSWFProcessName(){
        this.reset(FIELD_PSWFPROCESSNAME);
    }

    /**
     * 设置 流程处理，详细说明：{@link #FIELD_PSWFPROCESSNAME}
     * <P>
     * 等同 {@link #setPSWFProcessName}
     * @param pSWFProcessName
     */
    @JsonIgnore
    public PSWFProcRole pswfprocessname(String pSWFProcessName){
        this.setPSWFProcessName(pSWFProcessName);
        return this;
    }

    /**
     * <B>PSWFPROCROLEID</B>&nbsp;流程处理角色标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSWFPROCROLEID = "pswfprocroleid";

    /**
     * 设置 流程处理角色标识
     * 
     * @param pSWFProcRoleId
     * 
     */
    @JsonProperty(FIELD_PSWFPROCROLEID)
    public void setPSWFProcRoleId(String pSWFProcRoleId){
        this.set(FIELD_PSWFPROCROLEID, pSWFProcRoleId);
    }
    
    /**
     * 获取 流程处理角色标识  
     * @return
     */
    @JsonIgnore
    public String getPSWFProcRoleId(){
        Object objValue = this.get(FIELD_PSWFPROCROLEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程处理角色标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFProcRoleIdDirty(){
        if(this.contains(FIELD_PSWFPROCROLEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程处理角色标识
     */
    @JsonIgnore
    public void resetPSWFProcRoleId(){
        this.reset(FIELD_PSWFPROCROLEID);
    }

    /**
     * 设置 流程处理角色标识
     * <P>
     * 等同 {@link #setPSWFProcRoleId}
     * @param pSWFProcRoleId
     */
    @JsonIgnore
    public PSWFProcRole pswfprocroleid(String pSWFProcRoleId){
        this.setPSWFProcRoleId(pSWFProcRoleId);
        return this;
    }

    /**
     * <B>PSWFPROCROLENAME</B>&nbsp;处理角色，指定流程处理角色的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSWFPROCROLENAME = "pswfprocrolename";

    /**
     * 设置 处理角色，详细说明：{@link #FIELD_PSWFPROCROLENAME}
     * 
     * @param pSWFProcRoleName
     * 
     */
    @JsonProperty(FIELD_PSWFPROCROLENAME)
    public void setPSWFProcRoleName(String pSWFProcRoleName){
        this.set(FIELD_PSWFPROCROLENAME, pSWFProcRoleName);
    }
    
    /**
     * 获取 处理角色  
     * @return
     */
    @JsonIgnore
    public String getPSWFProcRoleName(){
        Object objValue = this.get(FIELD_PSWFPROCROLENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 处理角色 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFProcRoleNameDirty(){
        if(this.contains(FIELD_PSWFPROCROLENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 处理角色
     */
    @JsonIgnore
    public void resetPSWFProcRoleName(){
        this.reset(FIELD_PSWFPROCROLENAME);
    }

    /**
     * 设置 处理角色，详细说明：{@link #FIELD_PSWFPROCROLENAME}
     * <P>
     * 等同 {@link #setPSWFProcRoleName}
     * @param pSWFProcRoleName
     */
    @JsonIgnore
    public PSWFProcRole pswfprocrolename(String pSWFProcRoleName){
        this.setPSWFProcRoleName(pSWFProcRoleName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSWFProcRoleName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSWFProcRoleName(strName);
    }

    @JsonIgnore
    public PSWFProcRole name(String strName){
        this.setPSWFProcRoleName(strName);
        return this;
    }

    /**
     * <B>PSWFROLEID</B>&nbsp;流程角色，指定流程处理角色使用的工作流角色
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSWFRole} 
     */
    public final static String FIELD_PSWFROLEID = "pswfroleid";

    /**
     * 设置 流程角色，详细说明：{@link #FIELD_PSWFROLEID}
     * 
     * @param pSWFRoleId
     * 
     */
    @JsonProperty(FIELD_PSWFROLEID)
    public void setPSWFRoleId(String pSWFRoleId){
        this.set(FIELD_PSWFROLEID, pSWFRoleId);
    }
    
    /**
     * 获取 流程角色  
     * @return
     */
    @JsonIgnore
    public String getPSWFRoleId(){
        Object objValue = this.get(FIELD_PSWFROLEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程角色 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFRoleIdDirty(){
        if(this.contains(FIELD_PSWFROLEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程角色
     */
    @JsonIgnore
    public void resetPSWFRoleId(){
        this.reset(FIELD_PSWFROLEID);
    }

    /**
     * 设置 流程角色，详细说明：{@link #FIELD_PSWFROLEID}
     * <P>
     * 等同 {@link #setPSWFRoleId}
     * @param pSWFRoleId
     */
    @JsonIgnore
    public PSWFProcRole pswfroleid(String pSWFRoleId){
        this.setPSWFRoleId(pSWFRoleId);
        return this;
    }

    /**
     * 设置 流程角色，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSWFRoleId}
     * @param pSWFRole 引用对象
     */
    @JsonIgnore
    public PSWFProcRole pswfroleid(PSWFRole pSWFRole){
        if(pSWFRole == null){
            this.setPSWFRoleId(null);
            this.setPSWFRoleName(null);
        }
        else{
            this.setPSWFRoleId(pSWFRole.getPSWFRoleId());
            this.setPSWFRoleName(pSWFRole.getPSWFRoleName());
        }
        return this;
    }

    /**
     * <B>PSWFROLENAME</B>&nbsp;工作流角色，指定流程处理角色使用的工作流角色
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWFROLEID}
     */
    public final static String FIELD_PSWFROLENAME = "pswfrolename";

    /**
     * 设置 工作流角色，详细说明：{@link #FIELD_PSWFROLENAME}
     * 
     * @param pSWFRoleName
     * 
     */
    @JsonProperty(FIELD_PSWFROLENAME)
    public void setPSWFRoleName(String pSWFRoleName){
        this.set(FIELD_PSWFROLENAME, pSWFRoleName);
    }
    
    /**
     * 获取 工作流角色  
     * @return
     */
    @JsonIgnore
    public String getPSWFRoleName(){
        Object objValue = this.get(FIELD_PSWFROLENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工作流角色 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFRoleNameDirty(){
        if(this.contains(FIELD_PSWFROLENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工作流角色
     */
    @JsonIgnore
    public void resetPSWFRoleName(){
        this.reset(FIELD_PSWFROLENAME);
    }

    /**
     * 设置 工作流角色，详细说明：{@link #FIELD_PSWFROLENAME}
     * <P>
     * 等同 {@link #setPSWFRoleName}
     * @param pSWFRoleName
     */
    @JsonIgnore
    public PSWFProcRole pswfrolename(String pSWFRoleName){
        this.setPSWFRoleName(pSWFRoleName);
        return this;
    }

    /**
     * <B>ROLETYPE</B>&nbsp;角色类型，指定流程处理角色的来源
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.WFProcRoleType} 
     */
    public final static String FIELD_ROLETYPE = "roletype";

    /**
     * 设置 角色类型，详细说明：{@link #FIELD_ROLETYPE}
     * 
     * @param roleType
     * 
     */
    @JsonProperty(FIELD_ROLETYPE)
    public void setRoleType(String roleType){
        this.set(FIELD_ROLETYPE, roleType);
    }
    
    /**
     * 获取 角色类型  
     * @return
     */
    @JsonIgnore
    public String getRoleType(){
        Object objValue = this.get(FIELD_ROLETYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 角色类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRoleTypeDirty(){
        if(this.contains(FIELD_ROLETYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 角色类型
     */
    @JsonIgnore
    public void resetRoleType(){
        this.reset(FIELD_ROLETYPE);
    }

    /**
     * 设置 角色类型，详细说明：{@link #FIELD_ROLETYPE}
     * <P>
     * 等同 {@link #setRoleType}
     * @param roleType
     */
    @JsonIgnore
    public PSWFProcRole roletype(String roleType){
        this.setRoleType(roleType);
        return this;
    }

     /**
     * 设置 角色类型，详细说明：{@link #FIELD_ROLETYPE}
     * <P>
     * 等同 {@link #setRoleType}
     * @param roleType
     */
    @JsonIgnore
    public PSWFProcRole roletype(net.ibizsys.psmodel.core.util.PSModelEnums.WFProcRoleType roleType){
        if(roleType == null){
            this.setRoleType(null);
        }
        else{
            this.setRoleType(roleType.value);
        }
        return this;
    }

    /**
     * <B>UDFIELDS</B>&nbsp;数据属性，流程处理角色类型为【当前数据属性】时指定角色值存储的属性
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_UDFIELDS = "udfields";

    /**
     * 设置 数据属性，详细说明：{@link #FIELD_UDFIELDS}
     * 
     * @param uDFields
     * 
     */
    @JsonProperty(FIELD_UDFIELDS)
    public void setUDFields(String uDFields){
        this.set(FIELD_UDFIELDS, uDFields);
    }
    
    /**
     * 获取 数据属性  
     * @return
     */
    @JsonIgnore
    public String getUDFields(){
        Object objValue = this.get(FIELD_UDFIELDS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUDFieldsDirty(){
        if(this.contains(FIELD_UDFIELDS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据属性
     */
    @JsonIgnore
    public void resetUDFields(){
        this.reset(FIELD_UDFIELDS);
    }

    /**
     * 设置 数据属性，详细说明：{@link #FIELD_UDFIELDS}
     * <P>
     * 等同 {@link #setUDFields}
     * @param uDFields
     */
    @JsonIgnore
    public PSWFProcRole udfields(String uDFields){
        this.setUDFields(uDFields);
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
    public PSWFProcRole updatedate(String updateDate){
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
    public PSWFProcRole updateman(String updateMan){
        this.setUpdateMan(updateMan);
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
    public PSWFProcRole usercat(String userCat){
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
    public PSWFProcRole usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat.value);
        }
        return this;
    }

    /**
     * <B>USERDATA</B>&nbsp;处理角色数据，指定流程处理角色的数据
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_USERDATA = "userdata";

    /**
     * 设置 处理角色数据，详细说明：{@link #FIELD_USERDATA}
     * 
     * @param userData
     * 
     */
    @JsonProperty(FIELD_USERDATA)
    public void setUserData(String userData){
        this.set(FIELD_USERDATA, userData);
    }
    
    /**
     * 获取 处理角色数据  
     * @return
     */
    @JsonIgnore
    public String getUserData(){
        Object objValue = this.get(FIELD_USERDATA);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 处理角色数据 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserDataDirty(){
        if(this.contains(FIELD_USERDATA)){
            return true;
        }
        return false;
    }

    /**
     * 重置 处理角色数据
     */
    @JsonIgnore
    public void resetUserData(){
        this.reset(FIELD_USERDATA);
    }

    /**
     * 设置 处理角色数据，详细说明：{@link #FIELD_USERDATA}
     * <P>
     * 等同 {@link #setUserData}
     * @param userData
     */
    @JsonIgnore
    public PSWFProcRole userdata(String userData){
        this.setUserData(userData);
        return this;
    }

    /**
     * <B>USERDATA2</B>&nbsp;处理角色数据2，指定流程处理角色的数据2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_USERDATA2 = "userdata2";

    /**
     * 设置 处理角色数据2，详细说明：{@link #FIELD_USERDATA2}
     * 
     * @param userData2
     * 
     */
    @JsonProperty(FIELD_USERDATA2)
    public void setUserData2(String userData2){
        this.set(FIELD_USERDATA2, userData2);
    }
    
    /**
     * 获取 处理角色数据2  
     * @return
     */
    @JsonIgnore
    public String getUserData2(){
        Object objValue = this.get(FIELD_USERDATA2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 处理角色数据2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserData2Dirty(){
        if(this.contains(FIELD_USERDATA2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 处理角色数据2
     */
    @JsonIgnore
    public void resetUserData2(){
        this.reset(FIELD_USERDATA2);
    }

    /**
     * 设置 处理角色数据2，详细说明：{@link #FIELD_USERDATA2}
     * <P>
     * 等同 {@link #setUserData2}
     * @param userData2
     */
    @JsonIgnore
    public PSWFProcRole userdata2(String userData2){
        this.setUserData2(userData2);
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
    public PSWFProcRole usertag(String userTag){
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
    public PSWFProcRole usertag2(String userTag2){
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
    public PSWFProcRole usertag3(String userTag3){
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
    public PSWFProcRole usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSWFProcRoleId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSWFProcRoleId(strValue);
    }

    @JsonIgnore
    public PSWFProcRole id(String strValue){
        this.setPSWFProcRoleId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSWFProcRole){
            PSWFProcRole model = (PSWFProcRole)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
