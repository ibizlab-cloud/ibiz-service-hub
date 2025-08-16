package net.ibizsys.centralstudio.dto;

import net.ibizsys.centralstudio.util.CentralEntityDTOBase;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;


public class PSDCWorkspaceDTO extends CentralEntityDTOBase{

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
    public PSDCWorkspaceDTO createman(String createMan){
        this.setCreateMan(createMan);
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
    public PSDCWorkspaceDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>PSDCWORKSPACENAME</B>&nbsp;生产线名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDCWORKSPACENAME = "psdcworkspacename";

    /**
     * 设置 生产线名称
     * 
     * @param pSDCWorkspaceName
     * 
     */
    @JsonProperty(FIELD_PSDCWORKSPACENAME)
    public void setPSDCWorkspaceName(String pSDCWorkspaceName){
        this.set(FIELD_PSDCWORKSPACENAME, pSDCWorkspaceName);
    }
    
    /**
     * 获取 生产线名称  
     * @return
     */
    @JsonIgnore
    public String getPSDCWorkspaceName(){
        Object objValue = this.get(FIELD_PSDCWORKSPACENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 生产线名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDCWorkspaceNameDirty(){
        if(this.contains(FIELD_PSDCWORKSPACENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 生产线名称
     */
    @JsonIgnore
    public void resetPSDCWorkspaceName(){
        this.reset(FIELD_PSDCWORKSPACENAME);
    }

    /**
     * 设置 生产线名称
     * <P>
     * 等同 {@link #setPSDCWorkspaceName}
     * @param pSDCWorkspaceName
     */
    @JsonIgnore
    public PSDCWorkspaceDTO psdcworkspacename(String pSDCWorkspaceName){
        this.setPSDCWorkspaceName(pSDCWorkspaceName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDCWorkspaceName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDCWorkspaceName(strName);
    }

    @JsonIgnore
    public PSDCWorkspaceDTO name(String strName){
        this.setPSDCWorkspaceName(strName);
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
    public PSDCWorkspaceDTO createdate(Timestamp createDate){
        this.setCreateDate(createDate);
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
    public PSDCWorkspaceDTO updatedate(Timestamp updateDate){
        this.setUpdateDate(updateDate);
        return this;
    }

    /**
     * <B>PSDCWORKSPACEID</B>&nbsp;中心生产线标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDCWORKSPACEID = "psdcworkspaceid";

    /**
     * 设置 中心生产线标识
     * 
     * @param pSDCWorkspaceId
     * 
     */
    @JsonProperty(FIELD_PSDCWORKSPACEID)
    public void setPSDCWorkspaceId(String pSDCWorkspaceId){
        this.set(FIELD_PSDCWORKSPACEID, pSDCWorkspaceId);
    }
    
    /**
     * 获取 中心生产线标识  
     * @return
     */
    @JsonIgnore
    public String getPSDCWorkspaceId(){
        Object objValue = this.get(FIELD_PSDCWORKSPACEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 中心生产线标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDCWorkspaceIdDirty(){
        if(this.contains(FIELD_PSDCWORKSPACEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 中心生产线标识
     */
    @JsonIgnore
    public void resetPSDCWorkspaceId(){
        this.reset(FIELD_PSDCWORKSPACEID);
    }

    /**
     * 设置 中心生产线标识
     * <P>
     * 等同 {@link #setPSDCWorkspaceId}
     * @param pSDCWorkspaceId
     */
    @JsonIgnore
    public PSDCWorkspaceDTO psdcworkspaceid(String pSDCWorkspaceId){
        this.setPSDCWorkspaceId(pSDCWorkspaceId);
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
    public PSDCWorkspaceDTO orgid(String orgId){
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
    public PSDCWorkspaceDTO deptid(String deptId){
        this.setDeptId(deptId);
        return this;
    }

    /**
     * <B>EXPIREDTIME</B>&nbsp;过期时间
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_EXPIREDTIME = "expiredtime";

    /**
     * 设置 过期时间
     * 
     * @param expiredTime
     * 
     */
    @JsonProperty(FIELD_EXPIREDTIME)
    public void setExpiredTime(String expiredTime){
        this.set(FIELD_EXPIREDTIME, expiredTime);
    }
    
    /**
     * 获取 过期时间  
     * @return
     */
    @JsonIgnore
    public String getExpiredTime(){
        Object objValue = this.get(FIELD_EXPIREDTIME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 过期时间 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExpiredTimeDirty(){
        if(this.contains(FIELD_EXPIREDTIME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 过期时间
     */
    @JsonIgnore
    public void resetExpiredTime(){
        this.reset(FIELD_EXPIREDTIME);
    }

    /**
     * 设置 过期时间
     * <P>
     * 等同 {@link #setExpiredTime}
     * @param expiredTime
     */
    @JsonIgnore
    public PSDCWorkspaceDTO expiredtime(String expiredTime){
        this.setExpiredTime(expiredTime);
        return this;
    }

    /**
     * <B>ACTIONOWNER</B>&nbsp;作业所有者
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ACTIONOWNER = "actionowner";

    /**
     * 设置 作业所有者
     * 
     * @param actionOwner
     * 
     */
    @JsonProperty(FIELD_ACTIONOWNER)
    public void setActionOwner(String actionOwner){
        this.set(FIELD_ACTIONOWNER, actionOwner);
    }
    
    /**
     * 获取 作业所有者  
     * @return
     */
    @JsonIgnore
    public String getActionOwner(){
        Object objValue = this.get(FIELD_ACTIONOWNER);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 作业所有者 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionOwnerDirty(){
        if(this.contains(FIELD_ACTIONOWNER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 作业所有者
     */
    @JsonIgnore
    public void resetActionOwner(){
        this.reset(FIELD_ACTIONOWNER);
    }

    /**
     * 设置 作业所有者
     * <P>
     * 等同 {@link #setActionOwner}
     * @param actionOwner
     */
    @JsonIgnore
    public PSDCWorkspaceDTO actionowner(String actionOwner){
        this.setActionOwner(actionOwner);
        return this;
    }

    /**
     * <B>WORKSPACELEVEL</B>&nbsp;生产线级别
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_WORKSPACELEVEL = "workspacelevel";

    /**
     * 设置 生产线级别
     * 
     * @param workspaceLevel
     * 
     */
    @JsonProperty(FIELD_WORKSPACELEVEL)
    public void setWorkspaceLevel(String workspaceLevel){
        this.set(FIELD_WORKSPACELEVEL, workspaceLevel);
    }
    
    /**
     * 获取 生产线级别  
     * @return
     */
    @JsonIgnore
    public String getWorkspaceLevel(){
        Object objValue = this.get(FIELD_WORKSPACELEVEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 生产线级别 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWorkspaceLevelDirty(){
        if(this.contains(FIELD_WORKSPACELEVEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 生产线级别
     */
    @JsonIgnore
    public void resetWorkspaceLevel(){
        this.reset(FIELD_WORKSPACELEVEL);
    }

    /**
     * 设置 生产线级别
     * <P>
     * 等同 {@link #setWorkspaceLevel}
     * @param workspaceLevel
     */
    @JsonIgnore
    public PSDCWorkspaceDTO workspacelevel(String workspaceLevel){
        this.setWorkspaceLevel(workspaceLevel);
        return this;
    }

    /**
     * <B>WORKSPACEUSAGE</B>&nbsp;生产线用途
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_WORKSPACEUSAGE = "workspaceusage";

    /**
     * 设置 生产线用途
     * 
     * @param workspaceUsage
     * 
     */
    @JsonProperty(FIELD_WORKSPACEUSAGE)
    public void setWorkspaceUsage(String workspaceUsage){
        this.set(FIELD_WORKSPACEUSAGE, workspaceUsage);
    }
    
    /**
     * 获取 生产线用途  
     * @return
     */
    @JsonIgnore
    public String getWorkspaceUsage(){
        Object objValue = this.get(FIELD_WORKSPACEUSAGE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 生产线用途 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWorkspaceUsageDirty(){
        if(this.contains(FIELD_WORKSPACEUSAGE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 生产线用途
     */
    @JsonIgnore
    public void resetWorkspaceUsage(){
        this.reset(FIELD_WORKSPACEUSAGE);
    }

    /**
     * 设置 生产线用途
     * <P>
     * 等同 {@link #setWorkspaceUsage}
     * @param workspaceUsage
     */
    @JsonIgnore
    public PSDCWorkspaceDTO workspaceusage(String workspaceUsage){
        this.setWorkspaceUsage(workspaceUsage);
        return this;
    }

    /**
     * <B>WORKSPACETYPE</B>&nbsp;生产线类型
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_WORKSPACETYPE = "workspacetype";

    /**
     * 设置 生产线类型
     * 
     * @param workspaceType
     * 
     */
    @JsonProperty(FIELD_WORKSPACETYPE)
    public void setWorkspaceType(String workspaceType){
        this.set(FIELD_WORKSPACETYPE, workspaceType);
    }
    
    /**
     * 获取 生产线类型  
     * @return
     */
    @JsonIgnore
    public String getWorkspaceType(){
        Object objValue = this.get(FIELD_WORKSPACETYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 生产线类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWorkspaceTypeDirty(){
        if(this.contains(FIELD_WORKSPACETYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 生产线类型
     */
    @JsonIgnore
    public void resetWorkspaceType(){
        this.reset(FIELD_WORKSPACETYPE);
    }

    /**
     * 设置 生产线类型
     * <P>
     * 等同 {@link #setWorkspaceType}
     * @param workspaceType
     */
    @JsonIgnore
    public PSDCWorkspaceDTO workspacetype(String workspaceType){
        this.setWorkspaceType(workspaceType);
        return this;
    }

    /**
     * <B>IPADDRS</B>&nbsp;访问IP地址
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_IPADDRS = "ipaddrs";

    /**
     * 设置 访问IP地址
     * 
     * @param iPAddrs
     * 
     */
    @JsonProperty(FIELD_IPADDRS)
    public void setIPAddrs(String iPAddrs){
        this.set(FIELD_IPADDRS, iPAddrs);
    }
    
    /**
     * 获取 访问IP地址  
     * @return
     */
    @JsonIgnore
    public String getIPAddrs(){
        Object objValue = this.get(FIELD_IPADDRS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 访问IP地址 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIPAddrsDirty(){
        if(this.contains(FIELD_IPADDRS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 访问IP地址
     */
    @JsonIgnore
    public void resetIPAddrs(){
        this.reset(FIELD_IPADDRS);
    }

    /**
     * 设置 访问IP地址
     * <P>
     * 等同 {@link #setIPAddrs}
     * @param iPAddrs
     */
    @JsonIgnore
    public PSDCWorkspaceDTO ipaddrs(String iPAddrs){
        this.setIPAddrs(iPAddrs);
        return this;
    }

    /**
     * <B>WORKSPACEUPDATEDATE</B>&nbsp;生产线更新时间
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_WORKSPACEUPDATEDATE = "workspaceupdatedate";

    /**
     * 设置 生产线更新时间
     * 
     * @param workspaceUpdateDate
     * 
     */
    @JsonProperty(FIELD_WORKSPACEUPDATEDATE)
    public void setWorkspaceUpdateDate(String workspaceUpdateDate){
        this.set(FIELD_WORKSPACEUPDATEDATE, workspaceUpdateDate);
    }
    
    /**
     * 获取 生产线更新时间  
     * @return
     */
    @JsonIgnore
    public String getWorkspaceUpdateDate(){
        Object objValue = this.get(FIELD_WORKSPACEUPDATEDATE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 生产线更新时间 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWorkspaceUpdateDateDirty(){
        if(this.contains(FIELD_WORKSPACEUPDATEDATE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 生产线更新时间
     */
    @JsonIgnore
    public void resetWorkspaceUpdateDate(){
        this.reset(FIELD_WORKSPACEUPDATEDATE);
    }

    /**
     * 设置 生产线更新时间
     * <P>
     * 等同 {@link #setWorkspaceUpdateDate}
     * @param workspaceUpdateDate
     */
    @JsonIgnore
    public PSDCWorkspaceDTO workspaceupdatedate(String workspaceUpdateDate){
        this.setWorkspaceUpdateDate(workspaceUpdateDate);
        return this;
    }

    /**
     * <B>CUREXPIREDTIME</B>&nbsp;当前过期时间
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CUREXPIREDTIME = "curexpiredtime";

    /**
     * 设置 当前过期时间
     * 
     * @param curExpiredTime
     * 
     */
    @JsonProperty(FIELD_CUREXPIREDTIME)
    public void setCurExpiredTime(String curExpiredTime){
        this.set(FIELD_CUREXPIREDTIME, curExpiredTime);
    }
    
    /**
     * 获取 当前过期时间  
     * @return
     */
    @JsonIgnore
    public String getCurExpiredTime(){
        Object objValue = this.get(FIELD_CUREXPIREDTIME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 当前过期时间 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCurExpiredTimeDirty(){
        if(this.contains(FIELD_CUREXPIREDTIME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 当前过期时间
     */
    @JsonIgnore
    public void resetCurExpiredTime(){
        this.reset(FIELD_CUREXPIREDTIME);
    }

    /**
     * 设置 当前过期时间
     * <P>
     * 等同 {@link #setCurExpiredTime}
     * @param curExpiredTime
     */
    @JsonIgnore
    public PSDCWorkspaceDTO curexpiredtime(String curExpiredTime){
        this.setCurExpiredTime(curExpiredTime);
        return this;
    }

    /**
     * <B>CURACTIVETIME</B>&nbsp;当前激活时间
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CURACTIVETIME = "curactivetime";

    /**
     * 设置 当前激活时间
     * 
     * @param curActiveTime
     * 
     */
    @JsonProperty(FIELD_CURACTIVETIME)
    public void setCurActiveTime(String curActiveTime){
        this.set(FIELD_CURACTIVETIME, curActiveTime);
    }
    
    /**
     * 获取 当前激活时间  
     * @return
     */
    @JsonIgnore
    public String getCurActiveTime(){
        Object objValue = this.get(FIELD_CURACTIVETIME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 当前激活时间 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCurActiveTimeDirty(){
        if(this.contains(FIELD_CURACTIVETIME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 当前激活时间
     */
    @JsonIgnore
    public void resetCurActiveTime(){
        this.reset(FIELD_CURACTIVETIME);
    }

    /**
     * 设置 当前激活时间
     * <P>
     * 等同 {@link #setCurActiveTime}
     * @param curActiveTime
     */
    @JsonIgnore
    public PSDCWorkspaceDTO curactivetime(String curActiveTime){
        this.setCurActiveTime(curActiveTime);
        return this;
    }

    /**
     * <B>ACTIONPARAM</B>&nbsp;作业参数
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ACTIONPARAM = "actionparam";

    /**
     * 设置 作业参数
     * 
     * @param actionParam
     * 
     */
    @JsonProperty(FIELD_ACTIONPARAM)
    public void setActionParam(String actionParam){
        this.set(FIELD_ACTIONPARAM, actionParam);
    }
    
    /**
     * 获取 作业参数  
     * @return
     */
    @JsonIgnore
    public String getActionParam(){
        Object objValue = this.get(FIELD_ACTIONPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 作业参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionParamDirty(){
        if(this.contains(FIELD_ACTIONPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 作业参数
     */
    @JsonIgnore
    public void resetActionParam(){
        this.reset(FIELD_ACTIONPARAM);
    }

    /**
     * 设置 作业参数
     * <P>
     * 等同 {@link #setActionParam}
     * @param actionParam
     */
    @JsonIgnore
    public PSDCWorkspaceDTO actionparam(String actionParam){
        this.setActionParam(actionParam);
        return this;
    }

    /**
     * <B>ACTIONPARAM3</B>&nbsp;作业参数3
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ACTIONPARAM3 = "actionparam3";

    /**
     * 设置 作业参数3
     * 
     * @param actionParam3
     * 
     */
    @JsonProperty(FIELD_ACTIONPARAM3)
    public void setActionParam3(String actionParam3){
        this.set(FIELD_ACTIONPARAM3, actionParam3);
    }
    
    /**
     * 获取 作业参数3  
     * @return
     */
    @JsonIgnore
    public String getActionParam3(){
        Object objValue = this.get(FIELD_ACTIONPARAM3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 作业参数3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionParam3Dirty(){
        if(this.contains(FIELD_ACTIONPARAM3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 作业参数3
     */
    @JsonIgnore
    public void resetActionParam3(){
        this.reset(FIELD_ACTIONPARAM3);
    }

    /**
     * 设置 作业参数3
     * <P>
     * 等同 {@link #setActionParam3}
     * @param actionParam3
     */
    @JsonIgnore
    public PSDCWorkspaceDTO actionparam3(String actionParam3){
        this.setActionParam3(actionParam3);
        return this;
    }

    /**
     * <B>ACTIONPARAM2</B>&nbsp;作业参数2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ACTIONPARAM2 = "actionparam2";

    /**
     * 设置 作业参数2
     * 
     * @param actionParam2
     * 
     */
    @JsonProperty(FIELD_ACTIONPARAM2)
    public void setActionParam2(String actionParam2){
        this.set(FIELD_ACTIONPARAM2, actionParam2);
    }
    
    /**
     * 获取 作业参数2  
     * @return
     */
    @JsonIgnore
    public String getActionParam2(){
        Object objValue = this.get(FIELD_ACTIONPARAM2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 作业参数2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionParam2Dirty(){
        if(this.contains(FIELD_ACTIONPARAM2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 作业参数2
     */
    @JsonIgnore
    public void resetActionParam2(){
        this.reset(FIELD_ACTIONPARAM2);
    }

    /**
     * 设置 作业参数2
     * <P>
     * 等同 {@link #setActionParam2}
     * @param actionParam2
     */
    @JsonIgnore
    public PSDCWorkspaceDTO actionparam2(String actionParam2){
        this.setActionParam2(actionParam2);
        return this;
    }

    /**
     * <B>ACTIONPARAM4</B>&nbsp;作业参数4
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ACTIONPARAM4 = "actionparam4";

    /**
     * 设置 作业参数4
     * 
     * @param actionParam4
     * 
     */
    @JsonProperty(FIELD_ACTIONPARAM4)
    public void setActionParam4(String actionParam4){
        this.set(FIELD_ACTIONPARAM4, actionParam4);
    }
    
    /**
     * 获取 作业参数4  
     * @return
     */
    @JsonIgnore
    public String getActionParam4(){
        Object objValue = this.get(FIELD_ACTIONPARAM4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 作业参数4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionParam4Dirty(){
        if(this.contains(FIELD_ACTIONPARAM4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 作业参数4
     */
    @JsonIgnore
    public void resetActionParam4(){
        this.reset(FIELD_ACTIONPARAM4);
    }

    /**
     * 设置 作业参数4
     * <P>
     * 等同 {@link #setActionParam4}
     * @param actionParam4
     */
    @JsonIgnore
    public PSDCWorkspaceDTO actionparam4(String actionParam4){
        this.setActionParam4(actionParam4);
        return this;
    }

    /**
     * <B>CURACTION</B>&nbsp;当前作业
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CURACTION = "curaction";

    /**
     * 设置 当前作业
     * 
     * @param curAction
     * 
     */
    @JsonProperty(FIELD_CURACTION)
    public void setCurAction(String curAction){
        this.set(FIELD_CURACTION, curAction);
    }
    
    /**
     * 获取 当前作业  
     * @return
     */
    @JsonIgnore
    public String getCurAction(){
        Object objValue = this.get(FIELD_CURACTION);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 当前作业 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCurActionDirty(){
        if(this.contains(FIELD_CURACTION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 当前作业
     */
    @JsonIgnore
    public void resetCurAction(){
        this.reset(FIELD_CURACTION);
    }

    /**
     * 设置 当前作业
     * <P>
     * 等同 {@link #setCurAction}
     * @param curAction
     */
    @JsonIgnore
    public PSDCWorkspaceDTO curaction(String curAction){
        this.setCurAction(curAction);
        return this;
    }

    /**
     * <B>ACCESSUSERS</B>&nbsp;授权访问用户
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_ACCESSUSERS = "accessusers";

    /**
     * 设置 授权访问用户
     * 
     * @param accessUsers
     * 
     */
    @JsonProperty(FIELD_ACCESSUSERS)
    public void setAccessUsers(String accessUsers){
        this.set(FIELD_ACCESSUSERS, accessUsers);
    }
    
    /**
     * 获取 授权访问用户  
     * @return
     */
    @JsonIgnore
    public String getAccessUsers(){
        Object objValue = this.get(FIELD_ACCESSUSERS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 授权访问用户 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAccessUsersDirty(){
        if(this.contains(FIELD_ACCESSUSERS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 授权访问用户
     */
    @JsonIgnore
    public void resetAccessUsers(){
        this.reset(FIELD_ACCESSUSERS);
    }

    /**
     * 设置 授权访问用户
     * <P>
     * 等同 {@link #setAccessUsers}
     * @param accessUsers
     */
    @JsonIgnore
    public PSDCWorkspaceDTO accessusers(String accessUsers){
        this.setAccessUsers(accessUsers);
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
    public PSDCWorkspaceDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>RESSTATE</B>&nbsp;资源状态
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.DevCenterResState} 
     */
    public final static String FIELD_RESSTATE = "resstate";

    /**
     * 设置 资源状态
     * 
     * @param resState
     * 
     */
    @JsonProperty(FIELD_RESSTATE)
    public void setResState(Integer resState){
        this.set(FIELD_RESSTATE, resState);
    }
    
    /**
     * 获取 资源状态  
     * @return
     */
    @JsonIgnore
    public Integer getResState(){
        Object objValue = this.get(FIELD_RESSTATE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 资源状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isResStateDirty(){
        if(this.contains(FIELD_RESSTATE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 资源状态
     */
    @JsonIgnore
    public void resetResState(){
        this.reset(FIELD_RESSTATE);
    }

    /**
     * 设置 资源状态
     * <P>
     * 等同 {@link #setResState}
     * @param resState
     */
    @JsonIgnore
    public PSDCWorkspaceDTO resstate(Integer resState){
        this.setResState(resState);
        return this;
    }

     /**
     * 设置 资源状态
     * <P>
     * 等同 {@link #setResState}
     * @param resState
     */
    @JsonIgnore
    public PSDCWorkspaceDTO resstate(net.ibizsys.centralstudio.util.CentralEnums.DevCenterResState resState){
        if(resState == null){
            this.setResState(null);
        }
        else{
            this.setResState(resState.value);
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
    public PSDCWorkspaceDTO psdevslnsysname(String pSDevSlnSysName){
        this.setPSDevSlnSysName(pSDevSlnSysName);
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
    public PSDCWorkspaceDTO psdevcentername(String pSDevCenterName){
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
    public PSDCWorkspaceDTO psdevcenterid(String pSDevCenterId){
        this.setPSDevCenterId(pSDevCenterId);
        return this;
    }

    /**
     * <B>PSDEVSLNSYSID</B>&nbsp;当前开发系统
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVSLNSYSID = "psdevslnsysid";

    /**
     * 设置 当前开发系统
     * 
     * @param pSDevSlnSysId
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNSYSID)
    public void setPSDevSlnSysId(String pSDevSlnSysId){
        this.set(FIELD_PSDEVSLNSYSID, pSDevSlnSysId);
    }
    
    /**
     * 获取 当前开发系统  
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
     * 判断 当前开发系统 是否指定值，包括空值
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
     * 重置 当前开发系统
     */
    @JsonIgnore
    public void resetPSDevSlnSysId(){
        this.reset(FIELD_PSDEVSLNSYSID);
    }

    /**
     * 设置 当前开发系统
     * <P>
     * 等同 {@link #setPSDevSlnSysId}
     * @param pSDevSlnSysId
     */
    @JsonIgnore
    public PSDCWorkspaceDTO psdevslnsysid(String pSDevSlnSysId){
        this.setPSDevSlnSysId(pSDevSlnSysId);
        return this;
    }

    /**
     * <B>PSDEVSLNNAME</B>&nbsp;分配开发方案
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVSLNID}
     */
    public final static String FIELD_PSDEVSLNNAME = "psdevslnname";

    /**
     * 设置 分配开发方案
     * 
     * @param pSDevSlnName
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNNAME)
    public void setPSDevSlnName(String pSDevSlnName){
        this.set(FIELD_PSDEVSLNNAME, pSDevSlnName);
    }
    
    /**
     * 获取 分配开发方案  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnName(){
        Object objValue = this.get(FIELD_PSDEVSLNNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分配开发方案 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnNameDirty(){
        if(this.contains(FIELD_PSDEVSLNNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分配开发方案
     */
    @JsonIgnore
    public void resetPSDevSlnName(){
        this.reset(FIELD_PSDEVSLNNAME);
    }

    /**
     * 设置 分配开发方案
     * <P>
     * 等同 {@link #setPSDevSlnName}
     * @param pSDevSlnName
     */
    @JsonIgnore
    public PSDCWorkspaceDTO psdevslnname(String pSDevSlnName){
        this.setPSDevSlnName(pSDevSlnName);
        return this;
    }

    /**
     * <B>PSDEVSLNID</B>&nbsp;分配开发方案
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVSLNID = "psdevslnid";

    /**
     * 设置 分配开发方案
     * 
     * @param pSDevSlnId
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNID)
    public void setPSDevSlnId(String pSDevSlnId){
        this.set(FIELD_PSDEVSLNID, pSDevSlnId);
    }
    
    /**
     * 获取 分配开发方案  
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
     * 判断 分配开发方案 是否指定值，包括空值
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
     * 重置 分配开发方案
     */
    @JsonIgnore
    public void resetPSDevSlnId(){
        this.reset(FIELD_PSDEVSLNID);
    }

    /**
     * 设置 分配开发方案
     * <P>
     * 等同 {@link #setPSDevSlnId}
     * @param pSDevSlnId
     */
    @JsonIgnore
    public PSDCWorkspaceDTO psdevslnid(String pSDevSlnId){
        this.setPSDevSlnId(pSDevSlnId);
        return this;
    }

    /**
     * <B>PSWORKSPACENAME</B>&nbsp;平台生产线
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSWORKSPACENAME = "psworkspacename";

    /**
     * 设置 平台生产线
     * 
     * @param pSWorkspaceName
     * 
     */
    @JsonProperty(FIELD_PSWORKSPACENAME)
    public void setPSWorkspaceName(String pSWorkspaceName){
        this.set(FIELD_PSWORKSPACENAME, pSWorkspaceName);
    }
    
    /**
     * 获取 平台生产线  
     * @return
     */
    @JsonIgnore
    public String getPSWorkspaceName(){
        Object objValue = this.get(FIELD_PSWORKSPACENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 平台生产线 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWorkspaceNameDirty(){
        if(this.contains(FIELD_PSWORKSPACENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 平台生产线
     */
    @JsonIgnore
    public void resetPSWorkspaceName(){
        this.reset(FIELD_PSWORKSPACENAME);
    }

    /**
     * 设置 平台生产线
     * <P>
     * 等同 {@link #setPSWorkspaceName}
     * @param pSWorkspaceName
     */
    @JsonIgnore
    public PSDCWorkspaceDTO psworkspacename(String pSWorkspaceName){
        this.setPSWorkspaceName(pSWorkspaceName);
        return this;
    }

    /**
     * <B>PSWORKSPACEID</B>&nbsp;平台生产线
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSWORKSPACEID = "psworkspaceid";

    /**
     * 设置 平台生产线
     * 
     * @param pSWorkspaceId
     * 
     */
    @JsonProperty(FIELD_PSWORKSPACEID)
    public void setPSWorkspaceId(String pSWorkspaceId){
        this.set(FIELD_PSWORKSPACEID, pSWorkspaceId);
    }
    
    /**
     * 获取 平台生产线  
     * @return
     */
    @JsonIgnore
    public String getPSWorkspaceId(){
        Object objValue = this.get(FIELD_PSWORKSPACEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 平台生产线 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWorkspaceIdDirty(){
        if(this.contains(FIELD_PSWORKSPACEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 平台生产线
     */
    @JsonIgnore
    public void resetPSWorkspaceId(){
        this.reset(FIELD_PSWORKSPACEID);
    }

    /**
     * 设置 平台生产线
     * <P>
     * 等同 {@link #setPSWorkspaceId}
     * @param pSWorkspaceId
     */
    @JsonIgnore
    public PSDCWorkspaceDTO psworkspaceid(String pSWorkspaceId){
        this.setPSWorkspaceId(pSWorkspaceId);
        return this;
    }

    /**
     * <B>WORKSPACESTATE</B>&nbsp;生产线状态
     */
    public final static String FIELD_WORKSPACESTATE = "workspacestate";

    /**
     * 设置 生产线状态
     * 
     * @param workspaceState
     * 
     */
    @JsonProperty(FIELD_WORKSPACESTATE)
    public void setWorkspaceState(Integer workspaceState){
        this.set(FIELD_WORKSPACESTATE, workspaceState);
    }
    
    /**
     * 获取 生产线状态  
     * @return
     */
    @JsonIgnore
    public Integer getWorkspaceState(){
        Object objValue = this.get(FIELD_WORKSPACESTATE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 生产线状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWorkspaceStateDirty(){
        if(this.contains(FIELD_WORKSPACESTATE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 生产线状态
     */
    @JsonIgnore
    public void resetWorkspaceState(){
        this.reset(FIELD_WORKSPACESTATE);
    }

    /**
     * 设置 生产线状态
     * <P>
     * 等同 {@link #setWorkspaceState}
     * @param workspaceState
     */
    @JsonIgnore
    public PSDCWorkspaceDTO workspacestate(Integer workspaceState){
        this.setWorkspaceState(workspaceState);
        return this;
    }

    /**
     * <B>ASSIGNSTATUS</B>&nbsp;生产线分配状态
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ASSIGNSTATUS = "assignstatus";

    /**
     * 设置 生产线分配状态
     * 
     * @param assignStatus
     * 
     */
    @JsonProperty(FIELD_ASSIGNSTATUS)
    public void setAssignStatus(String assignStatus){
        this.set(FIELD_ASSIGNSTATUS, assignStatus);
    }
    
    /**
     * 获取 生产线分配状态  
     * @return
     */
    @JsonIgnore
    public String getAssignStatus(){
        Object objValue = this.get(FIELD_ASSIGNSTATUS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 生产线分配状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAssignStatusDirty(){
        if(this.contains(FIELD_ASSIGNSTATUS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 生产线分配状态
     */
    @JsonIgnore
    public void resetAssignStatus(){
        this.reset(FIELD_ASSIGNSTATUS);
    }

    /**
     * 设置 生产线分配状态
     * <P>
     * 等同 {@link #setAssignStatus}
     * @param assignStatus
     */
    @JsonIgnore
    public PSDCWorkspaceDTO assignstatus(String assignStatus){
        this.setAssignStatus(assignStatus);
        return this;
    }

    @JsonIgnore
    @Override
    public Object getSrfkey(){
        return this.getPSDCWorkspaceId();
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDCWorkspaceDTO){
            PSDCWorkspaceDTO dto = (PSDCWorkspaceDTO)iEntity;
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