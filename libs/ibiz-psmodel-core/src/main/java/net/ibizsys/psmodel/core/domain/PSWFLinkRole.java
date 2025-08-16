package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSWFLINKROLE</B>流程处理连接角色 模型传输对象
 * <P>
 * 
 */
public class PSWFLinkRole extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSWFLinkRole(){
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
    public PSWFLinkRole createdate(String createDate){
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
    public PSWFLinkRole createman(String createMan){
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
    public PSWFLinkRole memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSSYSMSGTEMPLID</B>&nbsp;消息模板
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysMsgTempl} 
     */
    public final static String FIELD_PSSYSMSGTEMPLID = "pssysmsgtemplid";

    /**
     * 设置 消息模板
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
     * 设置 消息模板
     * <P>
     * 等同 {@link #setPSSysMsgTemplId}
     * @param pSSysMsgTemplId
     */
    @JsonIgnore
    public PSWFLinkRole pssysmsgtemplid(String pSSysMsgTemplId){
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
    public PSWFLinkRole pssysmsgtemplid(PSSysMsgTempl pSSysMsgTempl){
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
     * <B>PSSYSMSGTEMPLNAME</B>&nbsp;消息模板
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSMSGTEMPLID}
     */
    public final static String FIELD_PSSYSMSGTEMPLNAME = "pssysmsgtemplname";

    /**
     * 设置 消息模板
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
     * 设置 消息模板
     * <P>
     * 等同 {@link #setPSSysMsgTemplName}
     * @param pSSysMsgTemplName
     */
    @JsonIgnore
    public PSWFLinkRole pssysmsgtemplname(String pSSysMsgTemplName){
        this.setPSSysMsgTemplName(pSSysMsgTemplName);
        return this;
    }

    /**
     * <B>PSWFLINKID</B>&nbsp;流程处理连接
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSWFLink} 
     */
    public final static String FIELD_PSWFLINKID = "pswflinkid";

    /**
     * 设置 流程处理连接
     * 
     * @param pSWFLinkId
     * 
     */
    @JsonProperty(FIELD_PSWFLINKID)
    public void setPSWFLinkId(String pSWFLinkId){
        this.set(FIELD_PSWFLINKID, pSWFLinkId);
    }
    
    /**
     * 获取 流程处理连接  
     * @return
     */
    @JsonIgnore
    public String getPSWFLinkId(){
        Object objValue = this.get(FIELD_PSWFLINKID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程处理连接 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFLinkIdDirty(){
        if(this.contains(FIELD_PSWFLINKID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程处理连接
     */
    @JsonIgnore
    public void resetPSWFLinkId(){
        this.reset(FIELD_PSWFLINKID);
    }

    /**
     * 设置 流程处理连接
     * <P>
     * 等同 {@link #setPSWFLinkId}
     * @param pSWFLinkId
     */
    @JsonIgnore
    public PSWFLinkRole pswflinkid(String pSWFLinkId){
        this.setPSWFLinkId(pSWFLinkId);
        return this;
    }

    /**
     * 设置 流程处理连接，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSWFLinkId}
     * @param pSWFLink 引用对象
     */
    @JsonIgnore
    public PSWFLinkRole pswflinkid(PSWFLink pSWFLink){
        if(pSWFLink == null){
            this.setPSWFLinkId(null);
            this.setPSWFLinkName(null);
            this.setPSWFProcessId(null);
            this.setPSWFVersionId(null);
        }
        else{
            this.setPSWFLinkId(pSWFLink.getPSWFLinkId());
            this.setPSWFLinkName(pSWFLink.getPSWFLinkName());
            this.setPSWFProcessId(pSWFLink.getFromPSWFProcId());
            this.setPSWFVersionId(pSWFLink.getPSWFVersionId());
        }
        return this;
    }

    /**
     * <B>PSWFLINKNAME</B>&nbsp;流程处理连接
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWFLINKID}
     */
    public final static String FIELD_PSWFLINKNAME = "pswflinkname";

    /**
     * 设置 流程处理连接
     * 
     * @param pSWFLinkName
     * 
     */
    @JsonProperty(FIELD_PSWFLINKNAME)
    public void setPSWFLinkName(String pSWFLinkName){
        this.set(FIELD_PSWFLINKNAME, pSWFLinkName);
    }
    
    /**
     * 获取 流程处理连接  
     * @return
     */
    @JsonIgnore
    public String getPSWFLinkName(){
        Object objValue = this.get(FIELD_PSWFLINKNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程处理连接 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFLinkNameDirty(){
        if(this.contains(FIELD_PSWFLINKNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程处理连接
     */
    @JsonIgnore
    public void resetPSWFLinkName(){
        this.reset(FIELD_PSWFLINKNAME);
    }

    /**
     * 设置 流程处理连接
     * <P>
     * 等同 {@link #setPSWFLinkName}
     * @param pSWFLinkName
     */
    @JsonIgnore
    public PSWFLinkRole pswflinkname(String pSWFLinkName){
        this.setPSWFLinkName(pSWFLinkName);
        return this;
    }

    /**
     * <B>PSWFLINKROLEID</B>&nbsp;流程处理连接角色标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSWFLINKROLEID = "pswflinkroleid";

    /**
     * 设置 流程处理连接角色标识
     * 
     * @param pSWFLinkRoleId
     * 
     */
    @JsonProperty(FIELD_PSWFLINKROLEID)
    public void setPSWFLinkRoleId(String pSWFLinkRoleId){
        this.set(FIELD_PSWFLINKROLEID, pSWFLinkRoleId);
    }
    
    /**
     * 获取 流程处理连接角色标识  
     * @return
     */
    @JsonIgnore
    public String getPSWFLinkRoleId(){
        Object objValue = this.get(FIELD_PSWFLINKROLEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程处理连接角色标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFLinkRoleIdDirty(){
        if(this.contains(FIELD_PSWFLINKROLEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程处理连接角色标识
     */
    @JsonIgnore
    public void resetPSWFLinkRoleId(){
        this.reset(FIELD_PSWFLINKROLEID);
    }

    /**
     * 设置 流程处理连接角色标识
     * <P>
     * 等同 {@link #setPSWFLinkRoleId}
     * @param pSWFLinkRoleId
     */
    @JsonIgnore
    public PSWFLinkRole pswflinkroleid(String pSWFLinkRoleId){
        this.setPSWFLinkRoleId(pSWFLinkRoleId);
        return this;
    }

    /**
     * <B>PSWFLINKROLENAME</B>&nbsp;处理角色
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSWFLINKROLENAME = "pswflinkrolename";

    /**
     * 设置 处理角色
     * 
     * @param pSWFLinkRoleName
     * 
     */
    @JsonProperty(FIELD_PSWFLINKROLENAME)
    public void setPSWFLinkRoleName(String pSWFLinkRoleName){
        this.set(FIELD_PSWFLINKROLENAME, pSWFLinkRoleName);
    }
    
    /**
     * 获取 处理角色  
     * @return
     */
    @JsonIgnore
    public String getPSWFLinkRoleName(){
        Object objValue = this.get(FIELD_PSWFLINKROLENAME);
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
    public boolean isPSWFLinkRoleNameDirty(){
        if(this.contains(FIELD_PSWFLINKROLENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 处理角色
     */
    @JsonIgnore
    public void resetPSWFLinkRoleName(){
        this.reset(FIELD_PSWFLINKROLENAME);
    }

    /**
     * 设置 处理角色
     * <P>
     * 等同 {@link #setPSWFLinkRoleName}
     * @param pSWFLinkRoleName
     */
    @JsonIgnore
    public PSWFLinkRole pswflinkrolename(String pSWFLinkRoleName){
        this.setPSWFLinkRoleName(pSWFLinkRoleName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSWFLinkRoleName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSWFLinkRoleName(strName);
    }

    @JsonIgnore
    public PSWFLinkRole name(String strName){
        this.setPSWFLinkRoleName(strName);
        return this;
    }

    /**
     * <B>PSWFPROCESSID</B>&nbsp;PSWFPROCESSID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWFLINKID}
     */
    public final static String FIELD_PSWFPROCESSID = "pswfprocessid";

    /**
     * 设置 PSWFPROCESSID
     * 
     * @param pSWFProcessId
     * 
     */
    @JsonProperty(FIELD_PSWFPROCESSID)
    public void setPSWFProcessId(String pSWFProcessId){
        this.set(FIELD_PSWFPROCESSID, pSWFProcessId);
    }
    
    /**
     * 获取 PSWFPROCESSID  
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
     * 判断 PSWFPROCESSID 是否指定值，包括空值
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
     * 重置 PSWFPROCESSID
     */
    @JsonIgnore
    public void resetPSWFProcessId(){
        this.reset(FIELD_PSWFPROCESSID);
    }

    /**
     * 设置 PSWFPROCESSID
     * <P>
     * 等同 {@link #setPSWFProcessId}
     * @param pSWFProcessId
     */
    @JsonIgnore
    public PSWFLinkRole pswfprocessid(String pSWFProcessId){
        this.setPSWFProcessId(pSWFProcessId);
        return this;
    }

    /**
     * <B>PSWFPROCROLEID</B>&nbsp;流程处理角色
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSWFProcRole} 
     */
    public final static String FIELD_PSWFPROCROLEID = "pswfprocroleid";

    /**
     * 设置 流程处理角色
     * 
     * @param pSWFProcRoleId
     * 
     */
    @JsonProperty(FIELD_PSWFPROCROLEID)
    public void setPSWFProcRoleId(String pSWFProcRoleId){
        this.set(FIELD_PSWFPROCROLEID, pSWFProcRoleId);
    }
    
    /**
     * 获取 流程处理角色  
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
     * 判断 流程处理角色 是否指定值，包括空值
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
     * 重置 流程处理角色
     */
    @JsonIgnore
    public void resetPSWFProcRoleId(){
        this.reset(FIELD_PSWFPROCROLEID);
    }

    /**
     * 设置 流程处理角色
     * <P>
     * 等同 {@link #setPSWFProcRoleId}
     * @param pSWFProcRoleId
     */
    @JsonIgnore
    public PSWFLinkRole pswfprocroleid(String pSWFProcRoleId){
        this.setPSWFProcRoleId(pSWFProcRoleId);
        return this;
    }

    /**
     * 设置 流程处理角色，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSWFProcRoleId}
     * @param pSWFProcRole 引用对象
     */
    @JsonIgnore
    public PSWFLinkRole pswfprocroleid(PSWFProcRole pSWFProcRole){
        if(pSWFProcRole == null){
            this.setPSWFProcRoleId(null);
            this.setPSWFProcRoleName(null);
        }
        else{
            this.setPSWFProcRoleId(pSWFProcRole.getPSWFProcRoleId());
            this.setPSWFProcRoleName(pSWFProcRole.getPSWFProcRoleName());
        }
        return this;
    }

    /**
     * <B>PSWFPROCROLENAME</B>&nbsp;流程处理角色
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWFPROCROLEID}
     */
    public final static String FIELD_PSWFPROCROLENAME = "pswfprocrolename";

    /**
     * 设置 流程处理角色
     * 
     * @param pSWFProcRoleName
     * 
     */
    @JsonProperty(FIELD_PSWFPROCROLENAME)
    public void setPSWFProcRoleName(String pSWFProcRoleName){
        this.set(FIELD_PSWFPROCROLENAME, pSWFProcRoleName);
    }
    
    /**
     * 获取 流程处理角色  
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
     * 判断 流程处理角色 是否指定值，包括空值
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
     * 重置 流程处理角色
     */
    @JsonIgnore
    public void resetPSWFProcRoleName(){
        this.reset(FIELD_PSWFPROCROLENAME);
    }

    /**
     * 设置 流程处理角色
     * <P>
     * 等同 {@link #setPSWFProcRoleName}
     * @param pSWFProcRoleName
     */
    @JsonIgnore
    public PSWFLinkRole pswfprocrolename(String pSWFProcRoleName){
        this.setPSWFProcRoleName(pSWFProcRoleName);
        return this;
    }

    /**
     * <B>PSWFVERSIONID</B>&nbsp;PSWFVERSIONID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWFLINKID}
     */
    public final static String FIELD_PSWFVERSIONID = "pswfversionid";

    /**
     * 设置 PSWFVERSIONID
     * 
     * @param pSWFVersionId
     * 
     */
    @JsonProperty(FIELD_PSWFVERSIONID)
    public void setPSWFVersionId(String pSWFVersionId){
        this.set(FIELD_PSWFVERSIONID, pSWFVersionId);
    }
    
    /**
     * 获取 PSWFVERSIONID  
     * @return
     */
    @JsonIgnore
    public String getPSWFVersionId(){
        Object objValue = this.get(FIELD_PSWFVERSIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 PSWFVERSIONID 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFVersionIdDirty(){
        if(this.contains(FIELD_PSWFVERSIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 PSWFVERSIONID
     */
    @JsonIgnore
    public void resetPSWFVersionId(){
        this.reset(FIELD_PSWFVERSIONID);
    }

    /**
     * 设置 PSWFVERSIONID
     * <P>
     * 等同 {@link #setPSWFVersionId}
     * @param pSWFVersionId
     */
    @JsonIgnore
    public PSWFLinkRole pswfversionid(String pSWFVersionId){
        this.setPSWFVersionId(pSWFVersionId);
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
    public PSWFLinkRole updatedate(String updateDate){
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
    public PSWFLinkRole updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSWFLinkRoleId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSWFLinkRoleId(strValue);
    }

    @JsonIgnore
    public PSWFLinkRole id(String strValue){
        this.setPSWFLinkRoleId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSWFLinkRole){
            PSWFLinkRole model = (PSWFLinkRole)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
