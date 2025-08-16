package net.ibizsys.centralstudio.dto;

import net.ibizsys.centralstudio.util.CentralEntityDTOBase;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;


public class PSDevCenterSVNDTO extends CentralEntityDTOBase{

    /**
     * <B>PSDEVCENTERSVNID</B>&nbsp;应用中心代码库标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVCENTERSVNID = "psdevcentersvnid";

    /**
     * 设置 应用中心代码库标识
     * 
     * @param pSDevCenterSVNId
     * 
     */
    @JsonProperty(FIELD_PSDEVCENTERSVNID)
    public void setPSDevCenterSVNId(String pSDevCenterSVNId){
        this.set(FIELD_PSDEVCENTERSVNID, pSDevCenterSVNId);
    }
    
    /**
     * 获取 应用中心代码库标识  
     * @return
     */
    @JsonIgnore
    public String getPSDevCenterSVNId(){
        Object objValue = this.get(FIELD_PSDEVCENTERSVNID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用中心代码库标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevCenterSVNIdDirty(){
        if(this.contains(FIELD_PSDEVCENTERSVNID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用中心代码库标识
     */
    @JsonIgnore
    public void resetPSDevCenterSVNId(){
        this.reset(FIELD_PSDEVCENTERSVNID);
    }

    /**
     * 设置 应用中心代码库标识
     * <P>
     * 等同 {@link #setPSDevCenterSVNId}
     * @param pSDevCenterSVNId
     */
    @JsonIgnore
    public PSDevCenterSVNDTO psdevcentersvnid(String pSDevCenterSVNId){
        this.setPSDevCenterSVNId(pSDevCenterSVNId);
        return this;
    }

    /**
     * <B>PSDEVCENTERSVNNAME</B>&nbsp;应用中心代码库名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEVCENTERSVNNAME = "psdevcentersvnname";

    /**
     * 设置 应用中心代码库名称
     * 
     * @param pSDevCenterSVNName
     * 
     */
    @JsonProperty(FIELD_PSDEVCENTERSVNNAME)
    public void setPSDevCenterSVNName(String pSDevCenterSVNName){
        this.set(FIELD_PSDEVCENTERSVNNAME, pSDevCenterSVNName);
    }
    
    /**
     * 获取 应用中心代码库名称  
     * @return
     */
    @JsonIgnore
    public String getPSDevCenterSVNName(){
        Object objValue = this.get(FIELD_PSDEVCENTERSVNNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用中心代码库名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevCenterSVNNameDirty(){
        if(this.contains(FIELD_PSDEVCENTERSVNNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用中心代码库名称
     */
    @JsonIgnore
    public void resetPSDevCenterSVNName(){
        this.reset(FIELD_PSDEVCENTERSVNNAME);
    }

    /**
     * 设置 应用中心代码库名称
     * <P>
     * 等同 {@link #setPSDevCenterSVNName}
     * @param pSDevCenterSVNName
     */
    @JsonIgnore
    public PSDevCenterSVNDTO psdevcentersvnname(String pSDevCenterSVNName){
        this.setPSDevCenterSVNName(pSDevCenterSVNName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDevCenterSVNName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDevCenterSVNName(strName);
    }

    @JsonIgnore
    public PSDevCenterSVNDTO name(String strName){
        this.setPSDevCenterSVNName(strName);
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
    public PSDevCenterSVNDTO createdate(Timestamp createDate){
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
    public PSDevCenterSVNDTO createman(String createMan){
        this.setCreateMan(createMan);
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
    public PSDevCenterSVNDTO updatedate(Timestamp updateDate){
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
    public PSDevCenterSVNDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
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
    public PSDevCenterSVNDTO orgid(String orgId){
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
    public PSDevCenterSVNDTO deptid(String deptId){
        this.setDeptId(deptId);
        return this;
    }

    /**
     * <B>LOCKOBJTYPE</B>&nbsp;锁定对象类型
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_LOCKOBJTYPE = "lockobjtype";

    /**
     * 设置 锁定对象类型
     * 
     * @param lockObjType
     * 
     */
    @JsonProperty(FIELD_LOCKOBJTYPE)
    public void setLockObjType(String lockObjType){
        this.set(FIELD_LOCKOBJTYPE, lockObjType);
    }
    
    /**
     * 获取 锁定对象类型  
     * @return
     */
    @JsonIgnore
    public String getLockObjType(){
        Object objValue = this.get(FIELD_LOCKOBJTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 锁定对象类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLockObjTypeDirty(){
        if(this.contains(FIELD_LOCKOBJTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 锁定对象类型
     */
    @JsonIgnore
    public void resetLockObjType(){
        this.reset(FIELD_LOCKOBJTYPE);
    }

    /**
     * 设置 锁定对象类型
     * <P>
     * 等同 {@link #setLockObjType}
     * @param lockObjType
     */
    @JsonIgnore
    public PSDevCenterSVNDTO lockobjtype(String lockObjType){
        this.setLockObjType(lockObjType);
        return this;
    }

    /**
     * <B>GITPRJ</B>&nbsp;GIT项目
     * <P>
     * 字符串：最大长度 400
     */
    public final static String FIELD_GITPRJ = "gitprj";

    /**
     * 设置 GIT项目
     * 
     * @param gitPrj
     * 
     */
    @JsonProperty(FIELD_GITPRJ)
    public void setGitPrj(String gitPrj){
        this.set(FIELD_GITPRJ, gitPrj);
    }
    
    /**
     * 获取 GIT项目  
     * @return
     */
    @JsonIgnore
    public String getGitPrj(){
        Object objValue = this.get(FIELD_GITPRJ);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 GIT项目 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGitPrjDirty(){
        if(this.contains(FIELD_GITPRJ)){
            return true;
        }
        return false;
    }

    /**
     * 重置 GIT项目
     */
    @JsonIgnore
    public void resetGitPrj(){
        this.reset(FIELD_GITPRJ);
    }

    /**
     * 设置 GIT项目
     * <P>
     * 等同 {@link #setGitPrj}
     * @param gitPrj
     */
    @JsonIgnore
    public PSDevCenterSVNDTO gitprj(String gitPrj){
        this.setGitPrj(gitPrj);
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
    public PSDevCenterSVNDTO usertag3(String userTag3){
        this.setUserTag3(userTag3);
        return this;
    }

    /**
     * <B>REFOBJID</B>&nbsp;引用对象标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_REFOBJID = "refobjid";

    /**
     * 设置 引用对象标识
     * 
     * @param refObjId
     * 
     */
    @JsonProperty(FIELD_REFOBJID)
    public void setRefObjId(String refObjId){
        this.set(FIELD_REFOBJID, refObjId);
    }
    
    /**
     * 获取 引用对象标识  
     * @return
     */
    @JsonIgnore
    public String getRefObjId(){
        Object objValue = this.get(FIELD_REFOBJID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用对象标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefObjIdDirty(){
        if(this.contains(FIELD_REFOBJID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用对象标识
     */
    @JsonIgnore
    public void resetRefObjId(){
        this.reset(FIELD_REFOBJID);
    }

    /**
     * 设置 引用对象标识
     * <P>
     * 等同 {@link #setRefObjId}
     * @param refObjId
     */
    @JsonIgnore
    public PSDevCenterSVNDTO refobjid(String refObjId){
        this.setRefObjId(refObjId);
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
    public PSDevCenterSVNDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>REFOBJNAME</B>&nbsp;引用对象信息
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_REFOBJNAME = "refobjname";

    /**
     * 设置 引用对象信息
     * 
     * @param refObjName
     * 
     */
    @JsonProperty(FIELD_REFOBJNAME)
    public void setRefObjName(String refObjName){
        this.set(FIELD_REFOBJNAME, refObjName);
    }
    
    /**
     * 获取 引用对象信息  
     * @return
     */
    @JsonIgnore
    public String getRefObjName(){
        Object objValue = this.get(FIELD_REFOBJNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用对象信息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefObjNameDirty(){
        if(this.contains(FIELD_REFOBJNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用对象信息
     */
    @JsonIgnore
    public void resetRefObjName(){
        this.reset(FIELD_REFOBJNAME);
    }

    /**
     * 设置 引用对象信息
     * <P>
     * 等同 {@link #setRefObjName}
     * @param refObjName
     */
    @JsonIgnore
    public PSDevCenterSVNDTO refobjname(String refObjName){
        this.setRefObjName(refObjName);
        return this;
    }

    /**
     * <B>LOCKOBJID</B>&nbsp;锁定对象标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_LOCKOBJID = "lockobjid";

    /**
     * 设置 锁定对象标识
     * 
     * @param lockObjId
     * 
     */
    @JsonProperty(FIELD_LOCKOBJID)
    public void setLockObjId(String lockObjId){
        this.set(FIELD_LOCKOBJID, lockObjId);
    }
    
    /**
     * 获取 锁定对象标识  
     * @return
     */
    @JsonIgnore
    public String getLockObjId(){
        Object objValue = this.get(FIELD_LOCKOBJID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 锁定对象标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLockObjIdDirty(){
        if(this.contains(FIELD_LOCKOBJID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 锁定对象标识
     */
    @JsonIgnore
    public void resetLockObjId(){
        this.reset(FIELD_LOCKOBJID);
    }

    /**
     * 设置 锁定对象标识
     * <P>
     * 等同 {@link #setLockObjId}
     * @param lockObjId
     */
    @JsonIgnore
    public PSDevCenterSVNDTO lockobjid(String lockObjId){
        this.setLockObjId(lockObjId);
        return this;
    }

    /**
     * <B>PARAM2</B>&nbsp;参数2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PARAM2 = "param2";

    /**
     * 设置 参数2
     * 
     * @param param2
     * 
     */
    @JsonProperty(FIELD_PARAM2)
    public void setParam2(String param2){
        this.set(FIELD_PARAM2, param2);
    }
    
    /**
     * 获取 参数2  
     * @return
     */
    @JsonIgnore
    public String getParam2(){
        Object objValue = this.get(FIELD_PARAM2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParam2Dirty(){
        if(this.contains(FIELD_PARAM2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数2
     */
    @JsonIgnore
    public void resetParam2(){
        this.reset(FIELD_PARAM2);
    }

    /**
     * 设置 参数2
     * <P>
     * 等同 {@link #setParam2}
     * @param param2
     */
    @JsonIgnore
    public PSDevCenterSVNDTO param2(String param2){
        this.setParam2(param2);
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
    public PSDevCenterSVNDTO usertag(String userTag){
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
    public PSDevCenterSVNDTO usertag2(String userTag2){
        this.setUserTag2(userTag2);
        return this;
    }

    /**
     * <B>GITBRANCH</B>&nbsp;GIT库分支
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_GITBRANCH = "gitbranch";

    /**
     * 设置 GIT库分支
     * 
     * @param gitBranch
     * 
     */
    @JsonProperty(FIELD_GITBRANCH)
    public void setGitBranch(String gitBranch){
        this.set(FIELD_GITBRANCH, gitBranch);
    }
    
    /**
     * 获取 GIT库分支  
     * @return
     */
    @JsonIgnore
    public String getGitBranch(){
        Object objValue = this.get(FIELD_GITBRANCH);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 GIT库分支 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGitBranchDirty(){
        if(this.contains(FIELD_GITBRANCH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 GIT库分支
     */
    @JsonIgnore
    public void resetGitBranch(){
        this.reset(FIELD_GITBRANCH);
    }

    /**
     * 设置 GIT库分支
     * <P>
     * 等同 {@link #setGitBranch}
     * @param gitBranch
     */
    @JsonIgnore
    public PSDevCenterSVNDTO gitbranch(String gitBranch){
        this.setGitBranch(gitBranch);
        return this;
    }

    /**
     * <B>REFOBJTYPE</B>&nbsp;引用对象类型
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_REFOBJTYPE = "refobjtype";

    /**
     * 设置 引用对象类型
     * 
     * @param refObjType
     * 
     */
    @JsonProperty(FIELD_REFOBJTYPE)
    public void setRefObjType(String refObjType){
        this.set(FIELD_REFOBJTYPE, refObjType);
    }
    
    /**
     * 获取 引用对象类型  
     * @return
     */
    @JsonIgnore
    public String getRefObjType(){
        Object objValue = this.get(FIELD_REFOBJTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用对象类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefObjTypeDirty(){
        if(this.contains(FIELD_REFOBJTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用对象类型
     */
    @JsonIgnore
    public void resetRefObjType(){
        this.reset(FIELD_REFOBJTYPE);
    }

    /**
     * 设置 引用对象类型
     * <P>
     * 等同 {@link #setRefObjType}
     * @param refObjType
     */
    @JsonIgnore
    public PSDevCenterSVNDTO refobjtype(String refObjType){
        this.setRefObjType(refObjType);
        return this;
    }

    /**
     * <B>PARAM</B>&nbsp;参数
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PARAM = "param";

    /**
     * 设置 参数
     * 
     * @param param
     * 
     */
    @JsonProperty(FIELD_PARAM)
    public void setParam(String param){
        this.set(FIELD_PARAM, param);
    }
    
    /**
     * 获取 参数  
     * @return
     */
    @JsonIgnore
    public String getParam(){
        Object objValue = this.get(FIELD_PARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamDirty(){
        if(this.contains(FIELD_PARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数
     */
    @JsonIgnore
    public void resetParam(){
        this.reset(FIELD_PARAM);
    }

    /**
     * 设置 参数
     * <P>
     * 等同 {@link #setParam}
     * @param param
     */
    @JsonIgnore
    public PSDevCenterSVNDTO param(String param){
        this.setParam(param);
        return this;
    }

    /**
     * <B>REFFLAG</B>&nbsp;是否已使用
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.YesNo} 
     */
    public final static String FIELD_REFFLAG = "refflag";

    /**
     * 设置 是否已使用
     * 
     * @param refFlag
     * 
     */
    @JsonProperty(FIELD_REFFLAG)
    public void setRefFlag(Integer refFlag){
        this.set(FIELD_REFFLAG, refFlag);
    }
    
    /**
     * 获取 是否已使用  
     * @return
     */
    @JsonIgnore
    public Integer getRefFlag(){
        Object objValue = this.get(FIELD_REFFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 是否已使用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefFlagDirty(){
        if(this.contains(FIELD_REFFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 是否已使用
     */
    @JsonIgnore
    public void resetRefFlag(){
        this.reset(FIELD_REFFLAG);
    }

    /**
     * 设置 是否已使用
     * <P>
     * 等同 {@link #setRefFlag}
     * @param refFlag
     */
    @JsonIgnore
    public PSDevCenterSVNDTO refflag(Integer refFlag){
        this.setRefFlag(refFlag);
        return this;
    }

     /**
     * 设置 是否已使用
     * <P>
     * 等同 {@link #setRefFlag}
     * @param refFlag
     */
    @JsonIgnore
    public PSDevCenterSVNDTO refflag(Boolean refFlag){
        if(refFlag == null){
            this.setRefFlag(null);
        }
        else{
            this.setRefFlag(refFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSDevCenterSVNDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>EXPRIEDTIME</B>&nbsp;过期时间
     */
    public final static String FIELD_EXPRIEDTIME = "expriedtime";

    /**
     * 设置 过期时间
     * 
     * @param expriedTime
     * 
     */
    @JsonProperty(FIELD_EXPRIEDTIME)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setExpriedTime(Timestamp expriedTime){
        this.set(FIELD_EXPRIEDTIME, expriedTime);
    }
    
    /**
     * 获取 过期时间  
     * @return
     */
    @JsonIgnore
    public Timestamp getExpriedTime(){
        Object objValue = this.get(FIELD_EXPRIEDTIME);
        if(objValue==null){
            return null;
        }
        return (Timestamp)objValue;
    }

    /**
     * 判断 过期时间 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExpriedTimeDirty(){
        if(this.contains(FIELD_EXPRIEDTIME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 过期时间
     */
    @JsonIgnore
    public void resetExpriedTime(){
        this.reset(FIELD_EXPRIEDTIME);
    }

    /**
     * 设置 过期时间
     * <P>
     * 等同 {@link #setExpriedTime}
     * @param expriedTime
     */
    @JsonIgnore
    public PSDevCenterSVNDTO expriedtime(Timestamp expriedTime){
        this.setExpriedTime(expriedTime);
        return this;
    }

    /**
     * <B>GITPATH</B>&nbsp;GIT路径
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_GITPATH = "gitpath";

    /**
     * 设置 GIT路径
     * 
     * @param gitPath
     * 
     */
    @JsonProperty(FIELD_GITPATH)
    public void setGitPath(String gitPath){
        this.set(FIELD_GITPATH, gitPath);
    }
    
    /**
     * 获取 GIT路径  
     * @return
     */
    @JsonIgnore
    public String getGitPath(){
        Object objValue = this.get(FIELD_GITPATH);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 GIT路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGitPathDirty(){
        if(this.contains(FIELD_GITPATH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 GIT路径
     */
    @JsonIgnore
    public void resetGitPath(){
        this.reset(FIELD_GITPATH);
    }

    /**
     * 设置 GIT路径
     * <P>
     * 等同 {@link #setGitPath}
     * @param gitPath
     */
    @JsonIgnore
    public PSDevCenterSVNDTO gitpath(String gitPath){
        this.setGitPath(gitPath);
        return this;
    }

    /**
     * <B>RESVER</B>&nbsp;资源版本
     */
    public final static String FIELD_RESVER = "resver";

    /**
     * 设置 资源版本
     * 
     * @param resVer
     * 
     */
    @JsonProperty(FIELD_RESVER)
    public void setResVer(Integer resVer){
        this.set(FIELD_RESVER, resVer);
    }
    
    /**
     * 获取 资源版本  
     * @return
     */
    @JsonIgnore
    public Integer getResVer(){
        Object objValue = this.get(FIELD_RESVER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 资源版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isResVerDirty(){
        if(this.contains(FIELD_RESVER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 资源版本
     */
    @JsonIgnore
    public void resetResVer(){
        this.reset(FIELD_RESVER);
    }

    /**
     * 设置 资源版本
     * <P>
     * 等同 {@link #setResVer}
     * @param resVer
     */
    @JsonIgnore
    public PSDevCenterSVNDTO resver(Integer resVer){
        this.setResVer(resVer);
        return this;
    }

    /**
     * <B>PSDEVSLNNAME</B>&nbsp;开发方案
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVSLNID}
     */
    public final static String FIELD_PSDEVSLNNAME = "psdevslnname";

    /**
     * 设置 开发方案
     * 
     * @param pSDevSlnName
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNNAME)
    public void setPSDevSlnName(String pSDevSlnName){
        this.set(FIELD_PSDEVSLNNAME, pSDevSlnName);
    }
    
    /**
     * 获取 开发方案  
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
     * 判断 开发方案 是否指定值，包括空值
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
     * 重置 开发方案
     */
    @JsonIgnore
    public void resetPSDevSlnName(){
        this.reset(FIELD_PSDEVSLNNAME);
    }

    /**
     * 设置 开发方案
     * <P>
     * 等同 {@link #setPSDevSlnName}
     * @param pSDevSlnName
     */
    @JsonIgnore
    public PSDevCenterSVNDTO psdevslnname(String pSDevSlnName){
        this.setPSDevSlnName(pSDevSlnName);
        return this;
    }

    /**
     * <B>PSDEVCENTERID</B>&nbsp;云应用中心
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVCENTERID = "psdevcenterid";

    /**
     * 设置 云应用中心
     * 
     * @param pSDevCenterId
     * 
     */
    @JsonProperty(FIELD_PSDEVCENTERID)
    public void setPSDevCenterId(String pSDevCenterId){
        this.set(FIELD_PSDEVCENTERID, pSDevCenterId);
    }
    
    /**
     * 获取 云应用中心  
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
     * 判断 云应用中心 是否指定值，包括空值
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
     * 重置 云应用中心
     */
    @JsonIgnore
    public void resetPSDevCenterId(){
        this.reset(FIELD_PSDEVCENTERID);
    }

    /**
     * 设置 云应用中心
     * <P>
     * 等同 {@link #setPSDevCenterId}
     * @param pSDevCenterId
     */
    @JsonIgnore
    public PSDevCenterSVNDTO psdevcenterid(String pSDevCenterId){
        this.setPSDevCenterId(pSDevCenterId);
        return this;
    }

    /**
     * <B>PSDEVSLNID</B>&nbsp;开发方案
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVSLNID = "psdevslnid";

    /**
     * 设置 开发方案
     * 
     * @param pSDevSlnId
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNID)
    public void setPSDevSlnId(String pSDevSlnId){
        this.set(FIELD_PSDEVSLNID, pSDevSlnId);
    }
    
    /**
     * 获取 开发方案  
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
     * 判断 开发方案 是否指定值，包括空值
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
     * 重置 开发方案
     */
    @JsonIgnore
    public void resetPSDevSlnId(){
        this.reset(FIELD_PSDEVSLNID);
    }

    /**
     * 设置 开发方案
     * <P>
     * 等同 {@link #setPSDevSlnId}
     * @param pSDevSlnId
     */
    @JsonIgnore
    public PSDevCenterSVNDTO psdevslnid(String pSDevSlnId){
        this.setPSDevSlnId(pSDevSlnId);
        return this;
    }

    /**
     * <B>PSDEVCENTERNAME</B>&nbsp;云应用中心
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVCENTERID}
     */
    public final static String FIELD_PSDEVCENTERNAME = "psdevcentername";

    /**
     * 设置 云应用中心
     * 
     * @param pSDevCenterName
     * 
     */
    @JsonProperty(FIELD_PSDEVCENTERNAME)
    public void setPSDevCenterName(String pSDevCenterName){
        this.set(FIELD_PSDEVCENTERNAME, pSDevCenterName);
    }
    
    /**
     * 获取 云应用中心  
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
     * 判断 云应用中心 是否指定值，包括空值
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
     * 重置 云应用中心
     */
    @JsonIgnore
    public void resetPSDevCenterName(){
        this.reset(FIELD_PSDEVCENTERNAME);
    }

    /**
     * 设置 云应用中心
     * <P>
     * 等同 {@link #setPSDevCenterName}
     * @param pSDevCenterName
     */
    @JsonIgnore
    public PSDevCenterSVNDTO psdevcentername(String pSDevCenterName){
        this.setPSDevCenterName(pSDevCenterName);
        return this;
    }

    /**
     * <B>LOCKMODE</B>&nbsp;锁定模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.DCResLockMode} 
     */
    public final static String FIELD_LOCKMODE = "lockmode";

    /**
     * 设置 锁定模式
     * 
     * @param lockMode
     * 
     */
    @JsonProperty(FIELD_LOCKMODE)
    public void setLockMode(Integer lockMode){
        this.set(FIELD_LOCKMODE, lockMode);
    }
    
    /**
     * 获取 锁定模式  
     * @return
     */
    @JsonIgnore
    public Integer getLockMode(){
        Object objValue = this.get(FIELD_LOCKMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 锁定模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLockModeDirty(){
        if(this.contains(FIELD_LOCKMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 锁定模式
     */
    @JsonIgnore
    public void resetLockMode(){
        this.reset(FIELD_LOCKMODE);
    }

    /**
     * 设置 锁定模式
     * <P>
     * 等同 {@link #setLockMode}
     * @param lockMode
     */
    @JsonIgnore
    public PSDevCenterSVNDTO lockmode(Integer lockMode){
        this.setLockMode(lockMode);
        return this;
    }

     /**
     * 设置 锁定模式
     * <P>
     * 等同 {@link #setLockMode}
     * @param lockMode
     */
    @JsonIgnore
    public PSDevCenterSVNDTO lockmode(net.ibizsys.centralstudio.util.CentralEnums.DCResLockMode lockMode){
        if(lockMode == null){
            this.setLockMode(null);
        }
        else{
            this.setLockMode(lockMode.value);
        }
        return this;
    }

    /**
     * <B>RESPOS</B>&nbsp;资源来源
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.DevCenterResPos} 
     */
    public final static String FIELD_RESPOS = "respos";

    /**
     * 设置 资源来源
     * 
     * @param resPos
     * 
     */
    @JsonProperty(FIELD_RESPOS)
    public void setResPos(Integer resPos){
        this.set(FIELD_RESPOS, resPos);
    }
    
    /**
     * 获取 资源来源  
     * @return
     */
    @JsonIgnore
    public Integer getResPos(){
        Object objValue = this.get(FIELD_RESPOS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 资源来源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isResPosDirty(){
        if(this.contains(FIELD_RESPOS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 资源来源
     */
    @JsonIgnore
    public void resetResPos(){
        this.reset(FIELD_RESPOS);
    }

    /**
     * 设置 资源来源
     * <P>
     * 等同 {@link #setResPos}
     * @param resPos
     */
    @JsonIgnore
    public PSDevCenterSVNDTO respos(Integer resPos){
        this.setResPos(resPos);
        return this;
    }

     /**
     * 设置 资源来源
     * <P>
     * 等同 {@link #setResPos}
     * @param resPos
     */
    @JsonIgnore
    public PSDevCenterSVNDTO respos(net.ibizsys.centralstudio.util.CentralEnums.DevCenterResPos resPos){
        if(resPos == null){
            this.setResPos(null);
        }
        else{
            this.setResPos(resPos.value);
        }
        return this;
    }

    /**
     * <B>GITREPO</B>&nbsp;GIT仓库
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.GitRepoType} 
     */
    public final static String FIELD_GITREPO = "gitrepo";

    /**
     * 设置 GIT仓库
     * 
     * @param gitRepo
     * 
     */
    @JsonProperty(FIELD_GITREPO)
    public void setGitRepo(String gitRepo){
        this.set(FIELD_GITREPO, gitRepo);
    }
    
    /**
     * 获取 GIT仓库  
     * @return
     */
    @JsonIgnore
    public String getGitRepo(){
        Object objValue = this.get(FIELD_GITREPO);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 GIT仓库 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGitRepoDirty(){
        if(this.contains(FIELD_GITREPO)){
            return true;
        }
        return false;
    }

    /**
     * 重置 GIT仓库
     */
    @JsonIgnore
    public void resetGitRepo(){
        this.reset(FIELD_GITREPO);
    }

    /**
     * 设置 GIT仓库
     * <P>
     * 等同 {@link #setGitRepo}
     * @param gitRepo
     */
    @JsonIgnore
    public PSDevCenterSVNDTO gitrepo(String gitRepo){
        this.setGitRepo(gitRepo);
        return this;
    }

     /**
     * 设置 GIT仓库
     * <P>
     * 等同 {@link #setGitRepo}
     * @param gitRepo
     */
    @JsonIgnore
    public PSDevCenterSVNDTO gitrepo(net.ibizsys.centralstudio.util.CentralEnums.GitRepoType gitRepo){
        if(gitRepo == null){
            this.setGitRepo(null);
        }
        else{
            this.setGitRepo(gitRepo.value);
        }
        return this;
    }

    /**
     * <B>SVNTYPE</B>&nbsp;仓库类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.DevCenterSVNType} 
     */
    public final static String FIELD_SVNTYPE = "svntype";

    /**
     * 设置 仓库类型
     * 
     * @param sVNType
     * 
     */
    @JsonProperty(FIELD_SVNTYPE)
    public void setSVNType(String sVNType){
        this.set(FIELD_SVNTYPE, sVNType);
    }
    
    /**
     * 获取 仓库类型  
     * @return
     */
    @JsonIgnore
    public String getSVNType(){
        Object objValue = this.get(FIELD_SVNTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 仓库类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSVNTypeDirty(){
        if(this.contains(FIELD_SVNTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 仓库类型
     */
    @JsonIgnore
    public void resetSVNType(){
        this.reset(FIELD_SVNTYPE);
    }

    /**
     * 设置 仓库类型
     * <P>
     * 等同 {@link #setSVNType}
     * @param sVNType
     */
    @JsonIgnore
    public PSDevCenterSVNDTO svntype(String sVNType){
        this.setSVNType(sVNType);
        return this;
    }

     /**
     * 设置 仓库类型
     * <P>
     * 等同 {@link #setSVNType}
     * @param sVNType
     */
    @JsonIgnore
    public PSDevCenterSVNDTO svntype(net.ibizsys.centralstudio.util.CentralEnums.DevCenterSVNType sVNType){
        if(sVNType == null){
            this.setSVNType(null);
        }
        else{
            this.setSVNType(sVNType.value);
        }
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
    public PSDevCenterSVNDTO resstate(Integer resState){
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
    public PSDevCenterSVNDTO resstate(net.ibizsys.centralstudio.util.CentralEnums.DevCenterResState resState){
        if(resState == null){
            this.setResState(null);
        }
        else{
            this.setResState(resState.value);
        }
        return this;
    }

    /**
     * <B>PSSVNSERVERID</B>&nbsp;版本服务器标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSVNSERVERID = "pssvnserverid";

    /**
     * 设置 版本服务器标识
     * 
     * @param pSSVNServerId
     * 
     */
    @JsonProperty(FIELD_PSSVNSERVERID)
    public void setPSSVNServerId(String pSSVNServerId){
        this.set(FIELD_PSSVNSERVERID, pSSVNServerId);
    }
    
    /**
     * 获取 版本服务器标识  
     * @return
     */
    @JsonIgnore
    public String getPSSVNServerId(){
        Object objValue = this.get(FIELD_PSSVNSERVERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 版本服务器标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSVNServerIdDirty(){
        if(this.contains(FIELD_PSSVNSERVERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 版本服务器标识
     */
    @JsonIgnore
    public void resetPSSVNServerId(){
        this.reset(FIELD_PSSVNSERVERID);
    }

    /**
     * 设置 版本服务器标识
     * <P>
     * 等同 {@link #setPSSVNServerId}
     * @param pSSVNServerId
     */
    @JsonIgnore
    public PSDevCenterSVNDTO pssvnserverid(String pSSVNServerId){
        this.setPSSVNServerId(pSSVNServerId);
        return this;
    }

    @JsonIgnore
    @Override
    public Object getSrfkey(){
        return this.getPSDevCenterSVNId();
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDevCenterSVNDTO){
            PSDevCenterSVNDTO dto = (PSDevCenterSVNDTO)iEntity;
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