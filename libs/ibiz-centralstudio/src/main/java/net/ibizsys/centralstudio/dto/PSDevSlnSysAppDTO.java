package net.ibizsys.centralstudio.dto;

import net.ibizsys.centralstudio.util.CentralEntityDTOBase;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;


public class PSDevSlnSysAppDTO extends CentralEntityDTOBase{

    /**
     * <B>PSDEVSLNSYSAPPID</B>&nbsp;开发系统应用标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVSLNSYSAPPID = "psdevslnsysappid";

    /**
     * 设置 开发系统应用标识
     * 
     * @param pSDevSlnSysAppId
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNSYSAPPID)
    public void setPSDevSlnSysAppId(String pSDevSlnSysAppId){
        this.set(FIELD_PSDEVSLNSYSAPPID, pSDevSlnSysAppId);
    }
    
    /**
     * 获取 开发系统应用标识  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnSysAppId(){
        Object objValue = this.get(FIELD_PSDEVSLNSYSAPPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发系统应用标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnSysAppIdDirty(){
        if(this.contains(FIELD_PSDEVSLNSYSAPPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发系统应用标识
     */
    @JsonIgnore
    public void resetPSDevSlnSysAppId(){
        this.reset(FIELD_PSDEVSLNSYSAPPID);
    }

    /**
     * 设置 开发系统应用标识
     * <P>
     * 等同 {@link #setPSDevSlnSysAppId}
     * @param pSDevSlnSysAppId
     */
    @JsonIgnore
    public PSDevSlnSysAppDTO psdevslnsysappid(String pSDevSlnSysAppId){
        this.setPSDevSlnSysAppId(pSDevSlnSysAppId);
        return this;
    }

    /**
     * <B>PSDEVSLNSYSAPPNAME</B>&nbsp;开发系统应用名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEVSLNSYSAPPNAME = "psdevslnsysappname";

    /**
     * 设置 开发系统应用名称
     * 
     * @param pSDevSlnSysAppName
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNSYSAPPNAME)
    public void setPSDevSlnSysAppName(String pSDevSlnSysAppName){
        this.set(FIELD_PSDEVSLNSYSAPPNAME, pSDevSlnSysAppName);
    }
    
    /**
     * 获取 开发系统应用名称  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnSysAppName(){
        Object objValue = this.get(FIELD_PSDEVSLNSYSAPPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发系统应用名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnSysAppNameDirty(){
        if(this.contains(FIELD_PSDEVSLNSYSAPPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发系统应用名称
     */
    @JsonIgnore
    public void resetPSDevSlnSysAppName(){
        this.reset(FIELD_PSDEVSLNSYSAPPNAME);
    }

    /**
     * 设置 开发系统应用名称
     * <P>
     * 等同 {@link #setPSDevSlnSysAppName}
     * @param pSDevSlnSysAppName
     */
    @JsonIgnore
    public PSDevSlnSysAppDTO psdevslnsysappname(String pSDevSlnSysAppName){
        this.setPSDevSlnSysAppName(pSDevSlnSysAppName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDevSlnSysAppName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDevSlnSysAppName(strName);
    }

    @JsonIgnore
    public PSDevSlnSysAppDTO name(String strName){
        this.setPSDevSlnSysAppName(strName);
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
    public PSDevSlnSysAppDTO createdate(Timestamp createDate){
        this.setCreateDate(createDate);
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
    public PSDevSlnSysAppDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
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
    public PSDevSlnSysAppDTO updatedate(Timestamp updateDate){
        this.setUpdateDate(updateDate);
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
    public PSDevSlnSysAppDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>ORGID</B>&nbsp;组织机构标识
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_ORGID = "orgid";

    /**
     * 设置 组织机构标识
     * 
     * @param orgId
     * 
     */
    @JsonProperty(FIELD_ORGID)
    public void setOrgId(String orgId){
        this.set(FIELD_ORGID, orgId);
    }
    
    /**
     * 获取 组织机构标识  
     * @return
     */
    @JsonIgnore
    public String getOrgId(){
        Object objValue = this.get(FIELD_ORGID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 组织机构标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOrgIdDirty(){
        if(this.contains(FIELD_ORGID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 组织机构标识
     */
    @JsonIgnore
    public void resetOrgId(){
        this.reset(FIELD_ORGID);
    }

    /**
     * 设置 组织机构标识
     * <P>
     * 等同 {@link #setOrgId}
     * @param orgId
     */
    @JsonIgnore
    public PSDevSlnSysAppDTO orgid(String orgId){
        this.setOrgId(orgId);
        return this;
    }

    /**
     * <B>DEPTID</B>&nbsp;组织部门标识
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_DEPTID = "deptid";

    /**
     * 设置 组织部门标识
     * 
     * @param deptId
     * 
     */
    @JsonProperty(FIELD_DEPTID)
    public void setDeptId(String deptId){
        this.set(FIELD_DEPTID, deptId);
    }
    
    /**
     * 获取 组织部门标识  
     * @return
     */
    @JsonIgnore
    public String getDeptId(){
        Object objValue = this.get(FIELD_DEPTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 组织部门标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDeptIdDirty(){
        if(this.contains(FIELD_DEPTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 组织部门标识
     */
    @JsonIgnore
    public void resetDeptId(){
        this.reset(FIELD_DEPTID);
    }

    /**
     * 设置 组织部门标识
     * <P>
     * 等同 {@link #setDeptId}
     * @param deptId
     */
    @JsonIgnore
    public PSDevSlnSysAppDTO deptid(String deptId){
        this.setDeptId(deptId);
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
    public PSDevSlnSysAppDTO psdevslnsysname(String pSDevSlnSysName){
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
    public PSDevSlnSysAppDTO psdevslnsysid(String pSDevSlnSysId){
        this.setPSDevSlnSysId(pSDevSlnSysId);
        return this;
    }

    /**
     * <B>APPPKGNAME</B>&nbsp;应用代码包名
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_APPPKGNAME = "apppkgname";

    /**
     * 设置 应用代码包名
     * 
     * @param appPKGName
     * 
     */
    @JsonProperty(FIELD_APPPKGNAME)
    public void setAppPKGName(String appPKGName){
        this.set(FIELD_APPPKGNAME, appPKGName);
    }
    
    /**
     * 获取 应用代码包名  
     * @return
     */
    @JsonIgnore
    public String getAppPKGName(){
        Object objValue = this.get(FIELD_APPPKGNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用代码包名 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAppPKGNameDirty(){
        if(this.contains(FIELD_APPPKGNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用代码包名
     */
    @JsonIgnore
    public void resetAppPKGName(){
        this.reset(FIELD_APPPKGNAME);
    }

    /**
     * 设置 应用代码包名
     * <P>
     * 等同 {@link #setAppPKGName}
     * @param appPKGName
     */
    @JsonIgnore
    public PSDevSlnSysAppDTO apppkgname(String appPKGName){
        this.setAppPKGName(appPKGName);
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;逻辑名称
     * <P>
     * 字符串：最大长度 200
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
    public PSDevSlnSysAppDTO logicname(String logicName){
        this.setLogicName(logicName);
        return this;
    }

    /**
     * <B>PSAPPTYPENAME</B>&nbsp;应用类型
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSAPPTYPENAME = "psapptypename";

    /**
     * 设置 应用类型
     * 
     * @param pSAppTypeName
     * 
     */
    @JsonProperty(FIELD_PSAPPTYPENAME)
    public void setPSAppTypeName(String pSAppTypeName){
        this.set(FIELD_PSAPPTYPENAME, pSAppTypeName);
    }
    
    /**
     * 获取 应用类型  
     * @return
     */
    @JsonIgnore
    public String getPSAppTypeName(){
        Object objValue = this.get(FIELD_PSAPPTYPENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppTypeNameDirty(){
        if(this.contains(FIELD_PSAPPTYPENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用类型
     */
    @JsonIgnore
    public void resetPSAppTypeName(){
        this.reset(FIELD_PSAPPTYPENAME);
    }

    /**
     * 设置 应用类型
     * <P>
     * 等同 {@link #setPSAppTypeName}
     * @param pSAppTypeName
     */
    @JsonIgnore
    public PSDevSlnSysAppDTO psapptypename(String pSAppTypeName){
        this.setPSAppTypeName(pSAppTypeName);
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
    public PSDevSlnSysAppDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSAPPTYPEID</B>&nbsp;应用类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.SysAppType} 
     */
    public final static String FIELD_PSAPPTYPEID = "psapptypeid";

    /**
     * 设置 应用类型
     * 
     * @param pSAppTypeId
     * 
     */
    @JsonProperty(FIELD_PSAPPTYPEID)
    public void setPSAppTypeId(String pSAppTypeId){
        this.set(FIELD_PSAPPTYPEID, pSAppTypeId);
    }
    
    /**
     * 获取 应用类型  
     * @return
     */
    @JsonIgnore
    public String getPSAppTypeId(){
        Object objValue = this.get(FIELD_PSAPPTYPEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppTypeIdDirty(){
        if(this.contains(FIELD_PSAPPTYPEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用类型
     */
    @JsonIgnore
    public void resetPSAppTypeId(){
        this.reset(FIELD_PSAPPTYPEID);
    }

    /**
     * 设置 应用类型
     * <P>
     * 等同 {@link #setPSAppTypeId}
     * @param pSAppTypeId
     */
    @JsonIgnore
    public PSDevSlnSysAppDTO psapptypeid(String pSAppTypeId){
        this.setPSAppTypeId(pSAppTypeId);
        return this;
    }

     /**
     * 设置 应用类型
     * <P>
     * 等同 {@link #setPSAppTypeId}
     * @param pSAppTypeId
     */
    @JsonIgnore
    public PSDevSlnSysAppDTO psapptypeid(net.ibizsys.centralstudio.util.CentralEnums.SysAppType pSAppTypeId){
        if(pSAppTypeId == null){
            this.setPSAppTypeId(null);
        }
        else{
            this.setPSAppTypeId(pSAppTypeId.value);
        }
        return this;
    }

    /**
     * <B>PSDEVSLNID</B>&nbsp;开发方案标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVSLNSYSID}
     */
    public final static String FIELD_PSDEVSLNID = "psdevslnid";

    /**
     * 设置 开发方案标识
     * 
     * @param pSDevSlnId
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNID)
    public void setPSDevSlnId(String pSDevSlnId){
        this.set(FIELD_PSDEVSLNID, pSDevSlnId);
    }
    
    /**
     * 获取 开发方案标识  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnId(){
        Object objValue = this.get(FIELD_PSDEVSLNID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发方案标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnIdDirty(){
        if(this.contains(FIELD_PSDEVSLNID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发方案标识
     */
    @JsonIgnore
    public void resetPSDevSlnId(){
        this.reset(FIELD_PSDEVSLNID);
    }

    /**
     * 设置 开发方案标识
     * <P>
     * 等同 {@link #setPSDevSlnId}
     * @param pSDevSlnId
     */
    @JsonIgnore
    public PSDevSlnSysAppDTO psdevslnid(String pSDevSlnId){
        this.setPSDevSlnId(pSDevSlnId);
        return this;
    }

    /**
     * <B>PSSYSAPPID</B>&nbsp;系统应用
     * <P>
     * 字符串：最大长度 100
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
    public PSDevSlnSysAppDTO pssysappid(String pSSysAppId){
        this.setPSSysAppId(pSSysAppId);
        return this;
    }

    /**
     * <B>PSSYSAPPNAME</B>&nbsp;前端应用
     * <P>
     * 字符串：最大长度 100
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
    public PSDevSlnSysAppDTO pssysappname(String pSSysAppName){
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    /**
     * <B>DEVSYSSTATE</B>&nbsp;开发系统状态
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_DEVSYSSTATE = "devsysstate";

    /**
     * 设置 开发系统状态
     * 
     * @param devSysState
     * 
     */
    @JsonProperty(FIELD_DEVSYSSTATE)
    public void setDevSysState(String devSysState){
        this.set(FIELD_DEVSYSSTATE, devSysState);
    }
    
    /**
     * 获取 开发系统状态  
     * @return
     */
    @JsonIgnore
    public String getDevSysState(){
        Object objValue = this.get(FIELD_DEVSYSSTATE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发系统状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDevSysStateDirty(){
        if(this.contains(FIELD_DEVSYSSTATE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发系统状态
     */
    @JsonIgnore
    public void resetDevSysState(){
        this.reset(FIELD_DEVSYSSTATE);
    }

    /**
     * 设置 开发系统状态
     * <P>
     * 等同 {@link #setDevSysState}
     * @param devSysState
     */
    @JsonIgnore
    public PSDevSlnSysAppDTO devsysstate(String devSysState){
        this.setDevSysState(devSysState);
        return this;
    }

    /**
     * <B>PSPFNAME</B>&nbsp;应用框架
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSPFID}
     */
    public final static String FIELD_PSPFNAME = "pspfname";

    /**
     * 设置 应用框架
     * 
     * @param pSPFName
     * 
     */
    @JsonProperty(FIELD_PSPFNAME)
    public void setPSPFName(String pSPFName){
        this.set(FIELD_PSPFNAME, pSPFName);
    }
    
    /**
     * 获取 应用框架  
     * @return
     */
    @JsonIgnore
    public String getPSPFName(){
        Object objValue = this.get(FIELD_PSPFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用框架 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSPFNameDirty(){
        if(this.contains(FIELD_PSPFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用框架
     */
    @JsonIgnore
    public void resetPSPFName(){
        this.reset(FIELD_PSPFNAME);
    }

    /**
     * 设置 应用框架
     * <P>
     * 等同 {@link #setPSPFName}
     * @param pSPFName
     */
    @JsonIgnore
    public PSDevSlnSysAppDTO pspfname(String pSPFName){
        this.setPSPFName(pSPFName);
        return this;
    }

    /**
     * <B>PSPFID</B>&nbsp;应用框架
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSPFID = "pspfid";

    /**
     * 设置 应用框架
     * 
     * @param pSPFId
     * 
     */
    @JsonProperty(FIELD_PSPFID)
    public void setPSPFId(String pSPFId){
        this.set(FIELD_PSPFID, pSPFId);
    }
    
    /**
     * 获取 应用框架  
     * @return
     */
    @JsonIgnore
    public String getPSPFId(){
        Object objValue = this.get(FIELD_PSPFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用框架 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSPFIdDirty(){
        if(this.contains(FIELD_PSPFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用框架
     */
    @JsonIgnore
    public void resetPSPFId(){
        this.reset(FIELD_PSPFID);
    }

    /**
     * 设置 应用框架
     * <P>
     * 等同 {@link #setPSPFId}
     * @param pSPFId
     */
    @JsonIgnore
    public PSDevSlnSysAppDTO pspfid(String pSPFId){
        this.setPSPFId(pSPFId);
        return this;
    }

    /**
     * <B>PSPFSTYLENAME</B>&nbsp;应用样式
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSPFSTYLEID}
     */
    public final static String FIELD_PSPFSTYLENAME = "pspfstylename";

    /**
     * 设置 应用样式
     * 
     * @param pSPFStyleName
     * 
     */
    @JsonProperty(FIELD_PSPFSTYLENAME)
    public void setPSPFStyleName(String pSPFStyleName){
        this.set(FIELD_PSPFSTYLENAME, pSPFStyleName);
    }
    
    /**
     * 获取 应用样式  
     * @return
     */
    @JsonIgnore
    public String getPSPFStyleName(){
        Object objValue = this.get(FIELD_PSPFSTYLENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSPFStyleNameDirty(){
        if(this.contains(FIELD_PSPFSTYLENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用样式
     */
    @JsonIgnore
    public void resetPSPFStyleName(){
        this.reset(FIELD_PSPFSTYLENAME);
    }

    /**
     * 设置 应用样式
     * <P>
     * 等同 {@link #setPSPFStyleName}
     * @param pSPFStyleName
     */
    @JsonIgnore
    public PSDevSlnSysAppDTO pspfstylename(String pSPFStyleName){
        this.setPSPFStyleName(pSPFStyleName);
        return this;
    }

    /**
     * <B>PSPFSTYLEID</B>&nbsp;应用样式
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSPFSTYLEID = "pspfstyleid";

    /**
     * 设置 应用样式
     * 
     * @param pSPFStyleId
     * 
     */
    @JsonProperty(FIELD_PSPFSTYLEID)
    public void setPSPFStyleId(String pSPFStyleId){
        this.set(FIELD_PSPFSTYLEID, pSPFStyleId);
    }
    
    /**
     * 获取 应用样式  
     * @return
     */
    @JsonIgnore
    public String getPSPFStyleId(){
        Object objValue = this.get(FIELD_PSPFSTYLEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSPFStyleIdDirty(){
        if(this.contains(FIELD_PSPFSTYLEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用样式
     */
    @JsonIgnore
    public void resetPSPFStyleId(){
        this.reset(FIELD_PSPFSTYLEID);
    }

    /**
     * 设置 应用样式
     * <P>
     * 等同 {@link #setPSPFStyleId}
     * @param pSPFStyleId
     */
    @JsonIgnore
    public PSDevSlnSysAppDTO pspfstyleid(String pSPFStyleId){
        this.setPSPFStyleId(pSPFStyleId);
        return this;
    }

    @JsonIgnore
    @Override
    public Object getSrfkey(){
        return this.getPSDevSlnSysAppId();
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDevSlnSysAppDTO){
            PSDevSlnSysAppDTO dto = (PSDevSlnSysAppDTO)iEntity;
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