package net.ibizsys.centralstudio.dto;

import net.ibizsys.centralstudio.util.CentralEntityDTOBase;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;


public class PSDCMSPlatformDTO extends CentralEntityDTOBase{

    /**
     * <B>PSDCMSPLATFORMID</B>&nbsp;中心微服务平台标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDCMSPLATFORMID = "psdcmsplatformid";

    /**
     * 设置 中心微服务平台标识
     * 
     * @param pSDCMSPlatformId
     * 
     */
    @JsonProperty(FIELD_PSDCMSPLATFORMID)
    public void setPSDCMSPlatformId(String pSDCMSPlatformId){
        this.set(FIELD_PSDCMSPLATFORMID, pSDCMSPlatformId);
    }
    
    /**
     * 获取 中心微服务平台标识  
     * @return
     */
    @JsonIgnore
    public String getPSDCMSPlatformId(){
        Object objValue = this.get(FIELD_PSDCMSPLATFORMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 中心微服务平台标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDCMSPlatformIdDirty(){
        if(this.contains(FIELD_PSDCMSPLATFORMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 中心微服务平台标识
     */
    @JsonIgnore
    public void resetPSDCMSPlatformId(){
        this.reset(FIELD_PSDCMSPLATFORMID);
    }

    /**
     * 设置 中心微服务平台标识
     * <P>
     * 等同 {@link #setPSDCMSPlatformId}
     * @param pSDCMSPlatformId
     */
    @JsonIgnore
    public PSDCMSPlatformDTO psdcmsplatformid(String pSDCMSPlatformId){
        this.setPSDCMSPlatformId(pSDCMSPlatformId);
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
    public PSDCMSPlatformDTO createman(String createMan){
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
    public PSDCMSPlatformDTO updateman(String updateMan){
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
    public PSDCMSPlatformDTO createdate(Timestamp createDate){
        this.setCreateDate(createDate);
        return this;
    }

    /**
     * <B>PSDCMSPLATFORMNAME</B>&nbsp;平台名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDCMSPLATFORMNAME = "psdcmsplatformname";

    /**
     * 设置 平台名称
     * 
     * @param pSDCMSPlatformName
     * 
     */
    @JsonProperty(FIELD_PSDCMSPLATFORMNAME)
    public void setPSDCMSPlatformName(String pSDCMSPlatformName){
        this.set(FIELD_PSDCMSPLATFORMNAME, pSDCMSPlatformName);
    }
    
    /**
     * 获取 平台名称  
     * @return
     */
    @JsonIgnore
    public String getPSDCMSPlatformName(){
        Object objValue = this.get(FIELD_PSDCMSPLATFORMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 平台名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDCMSPlatformNameDirty(){
        if(this.contains(FIELD_PSDCMSPLATFORMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 平台名称
     */
    @JsonIgnore
    public void resetPSDCMSPlatformName(){
        this.reset(FIELD_PSDCMSPLATFORMNAME);
    }

    /**
     * 设置 平台名称
     * <P>
     * 等同 {@link #setPSDCMSPlatformName}
     * @param pSDCMSPlatformName
     */
    @JsonIgnore
    public PSDCMSPlatformDTO psdcmsplatformname(String pSDCMSPlatformName){
        this.setPSDCMSPlatformName(pSDCMSPlatformName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDCMSPlatformName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDCMSPlatformName(strName);
    }

    @JsonIgnore
    public PSDCMSPlatformDTO name(String strName){
        this.setPSDCMSPlatformName(strName);
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
    public PSDCMSPlatformDTO updatedate(Timestamp updateDate){
        this.setUpdateDate(updateDate);
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
    public PSDCMSPlatformDTO deptid(String deptId){
        this.setDeptId(deptId);
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
    public PSDCMSPlatformDTO orgid(String orgId){
        this.setOrgId(orgId);
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
    public PSDCMSPlatformDTO psdevcentername(String pSDevCenterName){
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
    public PSDCMSPlatformDTO psdevcenterid(String pSDevCenterId){
        this.setPSDevCenterId(pSDevCenterId);
        return this;
    }

    /**
     * <B>USERPARAMS</B>&nbsp;自定义参数
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_USERPARAMS = "userparams";

    /**
     * 设置 自定义参数
     * 
     * @param userParams
     * 
     */
    @JsonProperty(FIELD_USERPARAMS)
    public void setUserParams(String userParams){
        this.set(FIELD_USERPARAMS, userParams);
    }
    
    /**
     * 获取 自定义参数  
     * @return
     */
    @JsonIgnore
    public String getUserParams(){
        Object objValue = this.get(FIELD_USERPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserParamsDirty(){
        if(this.contains(FIELD_USERPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义参数
     */
    @JsonIgnore
    public void resetUserParams(){
        this.reset(FIELD_USERPARAMS);
    }

    /**
     * 设置 自定义参数
     * <P>
     * 等同 {@link #setUserParams}
     * @param userParams
     */
    @JsonIgnore
    public PSDCMSPlatformDTO userparams(String userParams){
        this.setUserParams(userParams);
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
    public PSDCMSPlatformDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>WEBCONSOLEPATH</B>&nbsp;WebConsole路径
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_WEBCONSOLEPATH = "webconsolepath";

    /**
     * 设置 WebConsole路径
     * 
     * @param webConsolePath
     * 
     */
    @JsonProperty(FIELD_WEBCONSOLEPATH)
    public void setWebConsolePath(String webConsolePath){
        this.set(FIELD_WEBCONSOLEPATH, webConsolePath);
    }
    
    /**
     * 获取 WebConsole路径  
     * @return
     */
    @JsonIgnore
    public String getWebConsolePath(){
        Object objValue = this.get(FIELD_WEBCONSOLEPATH);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 WebConsole路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWebConsolePathDirty(){
        if(this.contains(FIELD_WEBCONSOLEPATH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 WebConsole路径
     */
    @JsonIgnore
    public void resetWebConsolePath(){
        this.reset(FIELD_WEBCONSOLEPATH);
    }

    /**
     * 设置 WebConsole路径
     * <P>
     * 等同 {@link #setWebConsolePath}
     * @param webConsolePath
     */
    @JsonIgnore
    public PSDCMSPlatformDTO webconsolepath(String webConsolePath){
        this.setWebConsolePath(webConsolePath);
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
    public PSDCMSPlatformDTO expriedtime(Timestamp expriedTime){
        this.setExpriedTime(expriedTime);
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
    public PSDCMSPlatformDTO usertag3(String userTag3){
        this.setUserTag3(userTag3);
        return this;
    }

    /**
     * <B>IPADDR2</B>&nbsp;内部IP
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_IPADDR2 = "ipaddr2";

    /**
     * 设置 内部IP
     * 
     * @param ipAddr2
     * 
     */
    @JsonProperty(FIELD_IPADDR2)
    public void setIpAddr2(String ipAddr2){
        this.set(FIELD_IPADDR2, ipAddr2);
    }
    
    /**
     * 获取 内部IP  
     * @return
     */
    @JsonIgnore
    public String getIpAddr2(){
        Object objValue = this.get(FIELD_IPADDR2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 内部IP 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIpAddr2Dirty(){
        if(this.contains(FIELD_IPADDR2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内部IP
     */
    @JsonIgnore
    public void resetIpAddr2(){
        this.reset(FIELD_IPADDR2);
    }

    /**
     * 设置 内部IP
     * <P>
     * 等同 {@link #setIpAddr2}
     * @param ipAddr2
     */
    @JsonIgnore
    public PSDCMSPlatformDTO ipaddr2(String ipAddr2){
        this.setIpAddr2(ipAddr2);
        return this;
    }

    /**
     * <B>RESREADYTIME</B>&nbsp;资源就绪时间
     */
    public final static String FIELD_RESREADYTIME = "resreadytime";

    /**
     * 设置 资源就绪时间
     * 
     * @param resReadyTime
     * 
     */
    @JsonProperty(FIELD_RESREADYTIME)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setResReadyTime(Timestamp resReadyTime){
        this.set(FIELD_RESREADYTIME, resReadyTime);
    }
    
    /**
     * 获取 资源就绪时间  
     * @return
     */
    @JsonIgnore
    public Timestamp getResReadyTime(){
        Object objValue = this.get(FIELD_RESREADYTIME);
        if(objValue==null){
            return null;
        }
        return (Timestamp)objValue;
    }

    /**
     * 判断 资源就绪时间 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isResReadyTimeDirty(){
        if(this.contains(FIELD_RESREADYTIME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 资源就绪时间
     */
    @JsonIgnore
    public void resetResReadyTime(){
        this.reset(FIELD_RESREADYTIME);
    }

    /**
     * 设置 资源就绪时间
     * <P>
     * 等同 {@link #setResReadyTime}
     * @param resReadyTime
     */
    @JsonIgnore
    public PSDCMSPlatformDTO resreadytime(Timestamp resReadyTime){
        this.setResReadyTime(resReadyTime);
        return this;
    }

    /**
     * <B>ADMINUSERNAME</B>&nbsp;主机管理员
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_ADMINUSERNAME = "adminusername";

    /**
     * 设置 主机管理员
     * 
     * @param adminUserName
     * 
     */
    @JsonProperty(FIELD_ADMINUSERNAME)
    public void setAdminUserName(String adminUserName){
        this.set(FIELD_ADMINUSERNAME, adminUserName);
    }
    
    /**
     * 获取 主机管理员  
     * @return
     */
    @JsonIgnore
    public String getAdminUserName(){
        Object objValue = this.get(FIELD_ADMINUSERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主机管理员 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAdminUserNameDirty(){
        if(this.contains(FIELD_ADMINUSERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主机管理员
     */
    @JsonIgnore
    public void resetAdminUserName(){
        this.reset(FIELD_ADMINUSERNAME);
    }

    /**
     * 设置 主机管理员
     * <P>
     * 等同 {@link #setAdminUserName}
     * @param adminUserName
     */
    @JsonIgnore
    public PSDCMSPlatformDTO adminusername(String adminUserName){
        this.setAdminUserName(adminUserName);
        return this;
    }

    /**
     * <B>IPADDR</B>&nbsp;服务IP
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_IPADDR = "ipaddr";

    /**
     * 设置 服务IP
     * 
     * @param ipAddr
     * 
     */
    @JsonProperty(FIELD_IPADDR)
    public void setIpAddr(String ipAddr){
        this.set(FIELD_IPADDR, ipAddr);
    }
    
    /**
     * 获取 服务IP  
     * @return
     */
    @JsonIgnore
    public String getIpAddr(){
        Object objValue = this.get(FIELD_IPADDR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 服务IP 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIpAddrDirty(){
        if(this.contains(FIELD_IPADDR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务IP
     */
    @JsonIgnore
    public void resetIpAddr(){
        this.reset(FIELD_IPADDR);
    }

    /**
     * 设置 服务IP
     * <P>
     * 等同 {@link #setIpAddr}
     * @param ipAddr
     */
    @JsonIgnore
    public PSDCMSPlatformDTO ipaddr(String ipAddr){
        this.setIpAddr(ipAddr);
        return this;
    }

    /**
     * <B>UPLOADPATH</B>&nbsp;文件上传路径
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_UPLOADPATH = "uploadpath";

    /**
     * 设置 文件上传路径
     * 
     * @param uploadPath
     * 
     */
    @JsonProperty(FIELD_UPLOADPATH)
    public void setUploadPath(String uploadPath){
        this.set(FIELD_UPLOADPATH, uploadPath);
    }
    
    /**
     * 获取 文件上传路径  
     * @return
     */
    @JsonIgnore
    public String getUploadPath(){
        Object objValue = this.get(FIELD_UPLOADPATH);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 文件上传路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUploadPathDirty(){
        if(this.contains(FIELD_UPLOADPATH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 文件上传路径
     */
    @JsonIgnore
    public void resetUploadPath(){
        this.reset(FIELD_UPLOADPATH);
    }

    /**
     * 设置 文件上传路径
     * <P>
     * 等同 {@link #setUploadPath}
     * @param uploadPath
     */
    @JsonIgnore
    public PSDCMSPlatformDTO uploadpath(String uploadPath){
        this.setUploadPath(uploadPath);
        return this;
    }

    /**
     * <B>WORKSHOPPATH</B>&nbsp;工程目录路径
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_WORKSHOPPATH = "workshoppath";

    /**
     * 设置 工程目录路径
     * 
     * @param workshopPath
     * 
     */
    @JsonProperty(FIELD_WORKSHOPPATH)
    public void setWorkshopPath(String workshopPath){
        this.set(FIELD_WORKSHOPPATH, workshopPath);
    }
    
    /**
     * 获取 工程目录路径  
     * @return
     */
    @JsonIgnore
    public String getWorkshopPath(){
        Object objValue = this.get(FIELD_WORKSHOPPATH);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工程目录路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWorkshopPathDirty(){
        if(this.contains(FIELD_WORKSHOPPATH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工程目录路径
     */
    @JsonIgnore
    public void resetWorkshopPath(){
        this.reset(FIELD_WORKSHOPPATH);
    }

    /**
     * 设置 工程目录路径
     * <P>
     * 等同 {@link #setWorkshopPath}
     * @param workshopPath
     */
    @JsonIgnore
    public PSDCMSPlatformDTO workshoppath(String workshopPath){
        this.setWorkshopPath(workshopPath);
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
    public PSDCMSPlatformDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
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
    public PSDCMSPlatformDTO usertag2(String userTag2){
        this.setUserTag2(userTag2);
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
    public PSDCMSPlatformDTO usertag(String userTag){
        this.setUserTag(userTag);
        return this;
    }

    /**
     * <B>ADMINPASSWD</B>&nbsp;管理员密码
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_ADMINPASSWD = "adminpasswd";

    /**
     * 设置 管理员密码
     * 
     * @param adminPasswd
     * 
     */
    @JsonProperty(FIELD_ADMINPASSWD)
    public void setAdminPasswd(String adminPasswd){
        this.set(FIELD_ADMINPASSWD, adminPasswd);
    }
    
    /**
     * 获取 管理员密码  
     * @return
     */
    @JsonIgnore
    public String getAdminPasswd(){
        Object objValue = this.get(FIELD_ADMINPASSWD);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 管理员密码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAdminPasswdDirty(){
        if(this.contains(FIELD_ADMINPASSWD)){
            return true;
        }
        return false;
    }

    /**
     * 重置 管理员密码
     */
    @JsonIgnore
    public void resetAdminPasswd(){
        this.reset(FIELD_ADMINPASSWD);
    }

    /**
     * 设置 管理员密码
     * <P>
     * 等同 {@link #setAdminPasswd}
     * @param adminPasswd
     */
    @JsonIgnore
    public PSDCMSPlatformDTO adminpasswd(String adminPasswd){
        this.setAdminPasswd(adminPasswd);
        return this;
    }

    /**
     * <B>USERNAME</B>&nbsp;主机用户名
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_USERNAME = "username";

    /**
     * 设置 主机用户名
     * 
     * @param userName
     * 
     */
    @JsonProperty(FIELD_USERNAME)
    public void setUserName(String userName){
        this.set(FIELD_USERNAME, userName);
    }
    
    /**
     * 获取 主机用户名  
     * @return
     */
    @JsonIgnore
    public String getUserName(){
        Object objValue = this.get(FIELD_USERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主机用户名 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserNameDirty(){
        if(this.contains(FIELD_USERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主机用户名
     */
    @JsonIgnore
    public void resetUserName(){
        this.reset(FIELD_USERNAME);
    }

    /**
     * 设置 主机用户名
     * <P>
     * 等同 {@link #setUserName}
     * @param userName
     */
    @JsonIgnore
    public PSDCMSPlatformDTO username(String userName){
        this.setUserName(userName);
        return this;
    }

    /**
     * <B>PASSWD</B>&nbsp;主机密码
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_PASSWD = "passwd";

    /**
     * 设置 主机密码
     * 
     * @param passwd
     * 
     */
    @JsonProperty(FIELD_PASSWD)
    public void setPasswd(String passwd){
        this.set(FIELD_PASSWD, passwd);
    }
    
    /**
     * 获取 主机密码  
     * @return
     */
    @JsonIgnore
    public String getPasswd(){
        Object objValue = this.get(FIELD_PASSWD);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主机密码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPasswdDirty(){
        if(this.contains(FIELD_PASSWD)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主机密码
     */
    @JsonIgnore
    public void resetPasswd(){
        this.reset(FIELD_PASSWD);
    }

    /**
     * 设置 主机密码
     * <P>
     * 等同 {@link #setPasswd}
     * @param passwd
     */
    @JsonIgnore
    public PSDCMSPlatformDTO passwd(String passwd){
        this.setPasswd(passwd);
        return this;
    }

    /**
     * <B>SSHIPADDR</B>&nbsp;内部IP
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_SSHIPADDR = "sshipaddr";

    /**
     * 设置 内部IP
     * 
     * @param sSHIPAddr
     * 
     */
    @JsonProperty(FIELD_SSHIPADDR)
    public void setSSHIPAddr(String sSHIPAddr){
        this.set(FIELD_SSHIPADDR, sSHIPAddr);
    }
    
    /**
     * 获取 内部IP  
     * @return
     */
    @JsonIgnore
    public String getSSHIPAddr(){
        Object objValue = this.get(FIELD_SSHIPADDR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 内部IP 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSSHIPAddrDirty(){
        if(this.contains(FIELD_SSHIPADDR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内部IP
     */
    @JsonIgnore
    public void resetSSHIPAddr(){
        this.reset(FIELD_SSHIPADDR);
    }

    /**
     * 设置 内部IP
     * <P>
     * 等同 {@link #setSSHIPAddr}
     * @param sSHIPAddr
     */
    @JsonIgnore
    public PSDCMSPlatformDTO sshipaddr(String sSHIPAddr){
        this.setSSHIPAddr(sSHIPAddr);
        return this;
    }

    /**
     * <B>SSHPORT</B>&nbsp;SSH端口
     */
    public final static String FIELD_SSHPORT = "sshport";

    /**
     * 设置 SSH端口
     * 
     * @param sSHPort
     * 
     */
    @JsonProperty(FIELD_SSHPORT)
    public void setSSHPort(Integer sSHPort){
        this.set(FIELD_SSHPORT, sSHPort);
    }
    
    /**
     * 获取 SSH端口  
     * @return
     */
    @JsonIgnore
    public Integer getSSHPort(){
        Object objValue = this.get(FIELD_SSHPORT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 SSH端口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSSHPortDirty(){
        if(this.contains(FIELD_SSHPORT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 SSH端口
     */
    @JsonIgnore
    public void resetSSHPort(){
        this.reset(FIELD_SSHPORT);
    }

    /**
     * 设置 SSH端口
     * <P>
     * 等同 {@link #setSSHPort}
     * @param sSHPort
     */
    @JsonIgnore
    public PSDCMSPlatformDTO sshport(Integer sSHPort){
        this.setSSHPort(sSHPort);
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
    public PSDCMSPlatformDTO resver(Integer resVer){
        this.setResVer(resVer);
        return this;
    }

    /**
     * <B>REFCOUNT</B>&nbsp;引用次数
     */
    public final static String FIELD_REFCOUNT = "refcount";

    /**
     * 设置 引用次数
     * 
     * @param refCount
     * 
     */
    @JsonProperty(FIELD_REFCOUNT)
    public void setRefCount(Integer refCount){
        this.set(FIELD_REFCOUNT, refCount);
    }
    
    /**
     * 获取 引用次数  
     * @return
     */
    @JsonIgnore
    public Integer getRefCount(){
        Object objValue = this.get(FIELD_REFCOUNT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 引用次数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefCountDirty(){
        if(this.contains(FIELD_REFCOUNT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用次数
     */
    @JsonIgnore
    public void resetRefCount(){
        this.reset(FIELD_REFCOUNT);
    }

    /**
     * 设置 引用次数
     * <P>
     * 等同 {@link #setRefCount}
     * @param refCount
     */
    @JsonIgnore
    public PSDCMSPlatformDTO refcount(Integer refCount){
        this.setRefCount(refCount);
        return this;
    }

    /**
     * <B>PORT</B>&nbsp;服务端口
     */
    public final static String FIELD_PORT = "port";

    /**
     * 设置 服务端口
     * 
     * @param port
     * 
     */
    @JsonProperty(FIELD_PORT)
    public void setPort(Integer port){
        this.set(FIELD_PORT, port);
    }
    
    /**
     * 获取 服务端口  
     * @return
     */
    @JsonIgnore
    public Integer getPort(){
        Object objValue = this.get(FIELD_PORT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 服务端口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPortDirty(){
        if(this.contains(FIELD_PORT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务端口
     */
    @JsonIgnore
    public void resetPort(){
        this.reset(FIELD_PORT);
    }

    /**
     * 设置 服务端口
     * <P>
     * 等同 {@link #setPort}
     * @param port
     */
    @JsonIgnore
    public PSDCMSPlatformDTO port(Integer port){
        this.setPort(port);
        return this;
    }

    /**
     * <B>VALIDFLAG</B>&nbsp;是否启用
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.YesNo} 
     */
    public final static String FIELD_VALIDFLAG = "validflag";

    /**
     * 设置 是否启用
     * 
     * @param validFlag
     * 
     */
    @JsonProperty(FIELD_VALIDFLAG)
    public void setValidFlag(Integer validFlag){
        this.set(FIELD_VALIDFLAG, validFlag);
    }
    
    /**
     * 获取 是否启用  
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
     * 判断 是否启用 是否指定值，包括空值
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
     * 重置 是否启用
     */
    @JsonIgnore
    public void resetValidFlag(){
        this.reset(FIELD_VALIDFLAG);
    }

    /**
     * 设置 是否启用
     * <P>
     * 等同 {@link #setValidFlag}
     * @param validFlag
     */
    @JsonIgnore
    public PSDCMSPlatformDTO validflag(Integer validFlag){
        this.setValidFlag(validFlag);
        return this;
    }

     /**
     * 设置 是否启用
     * <P>
     * 等同 {@link #setValidFlag}
     * @param validFlag
     */
    @JsonIgnore
    public PSDCMSPlatformDTO validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>MSTYPE</B>&nbsp;微服务框架
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.MSPlatformType} 
     */
    public final static String FIELD_MSTYPE = "mstype";

    /**
     * 设置 微服务框架
     * 
     * @param mSType
     * 
     */
    @JsonProperty(FIELD_MSTYPE)
    public void setMSType(String mSType){
        this.set(FIELD_MSTYPE, mSType);
    }
    
    /**
     * 获取 微服务框架  
     * @return
     */
    @JsonIgnore
    public String getMSType(){
        Object objValue = this.get(FIELD_MSTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 微服务框架 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMSTypeDirty(){
        if(this.contains(FIELD_MSTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 微服务框架
     */
    @JsonIgnore
    public void resetMSType(){
        this.reset(FIELD_MSTYPE);
    }

    /**
     * 设置 微服务框架
     * <P>
     * 等同 {@link #setMSType}
     * @param mSType
     */
    @JsonIgnore
    public PSDCMSPlatformDTO mstype(String mSType){
        this.setMSType(mSType);
        return this;
    }

     /**
     * 设置 微服务框架
     * <P>
     * 等同 {@link #setMSType}
     * @param mSType
     */
    @JsonIgnore
    public PSDCMSPlatformDTO mstype(net.ibizsys.centralstudio.util.CentralEnums.MSPlatformType mSType){
        if(mSType == null){
            this.setMSType(null);
        }
        else{
            this.setMSType(mSType.value);
        }
        return this;
    }

    /**
     * <B>UPLOADFILEMODE</B>&nbsp;上传文件模式
     * <P>
     * 字符串：最大长度 20
     */
    public final static String FIELD_UPLOADFILEMODE = "uploadfilemode";

    /**
     * 设置 上传文件模式
     * 
     * @param uploadFileMode
     * 
     */
    @JsonProperty(FIELD_UPLOADFILEMODE)
    public void setUploadFileMode(String uploadFileMode){
        this.set(FIELD_UPLOADFILEMODE, uploadFileMode);
    }
    
    /**
     * 获取 上传文件模式  
     * @return
     */
    @JsonIgnore
    public String getUploadFileMode(){
        Object objValue = this.get(FIELD_UPLOADFILEMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 上传文件模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUploadFileModeDirty(){
        if(this.contains(FIELD_UPLOADFILEMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 上传文件模式
     */
    @JsonIgnore
    public void resetUploadFileMode(){
        this.reset(FIELD_UPLOADFILEMODE);
    }

    /**
     * 设置 上传文件模式
     * <P>
     * 等同 {@link #setUploadFileMode}
     * @param uploadFileMode
     */
    @JsonIgnore
    public PSDCMSPlatformDTO uploadfilemode(String uploadFileMode){
        this.setUploadFileMode(uploadFileMode);
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
    public PSDCMSPlatformDTO resstate(Integer resState){
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
    public PSDCMSPlatformDTO resstate(net.ibizsys.centralstudio.util.CentralEnums.DevCenterResState resState){
        if(resState == null){
            this.setResState(null);
        }
        else{
            this.setResState(resState.value);
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
    public PSDCMSPlatformDTO respos(Integer resPos){
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
    public PSDCMSPlatformDTO respos(net.ibizsys.centralstudio.util.CentralEnums.DevCenterResPos resPos){
        if(resPos == null){
            this.setResPos(null);
        }
        else{
            this.setResPos(resPos.value);
        }
        return this;
    }

    /**
     * <B>PSDCCLUSTERID</B>&nbsp;应用中心集群标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDCCLUSTERID = "psdcclusterid";

    /**
     * 设置 应用中心集群标识
     * 
     * @param pSDCClusterId
     * 
     */
    @JsonProperty(FIELD_PSDCCLUSTERID)
    public void setPSDCClusterId(String pSDCClusterId){
        this.set(FIELD_PSDCCLUSTERID, pSDCClusterId);
    }
    
    /**
     * 获取 应用中心集群标识  
     * @return
     */
    @JsonIgnore
    public String getPSDCClusterId(){
        Object objValue = this.get(FIELD_PSDCCLUSTERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用中心集群标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDCClusterIdDirty(){
        if(this.contains(FIELD_PSDCCLUSTERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用中心集群标识
     */
    @JsonIgnore
    public void resetPSDCClusterId(){
        this.reset(FIELD_PSDCCLUSTERID);
    }

    /**
     * 设置 应用中心集群标识
     * <P>
     * 等同 {@link #setPSDCClusterId}
     * @param pSDCClusterId
     */
    @JsonIgnore
    public PSDCMSPlatformDTO psdcclusterid(String pSDCClusterId){
        this.setPSDCClusterId(pSDCClusterId);
        return this;
    }

    /**
     * <B>PSDCCLUSTERNAME</B>&nbsp;运行集群
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDCCLUSTERID}
     */
    public final static String FIELD_PSDCCLUSTERNAME = "psdcclustername";

    /**
     * 设置 运行集群
     * 
     * @param pSDCClusterName
     * 
     */
    @JsonProperty(FIELD_PSDCCLUSTERNAME)
    public void setPSDCClusterName(String pSDCClusterName){
        this.set(FIELD_PSDCCLUSTERNAME, pSDCClusterName);
    }
    
    /**
     * 获取 运行集群  
     * @return
     */
    @JsonIgnore
    public String getPSDCClusterName(){
        Object objValue = this.get(FIELD_PSDCCLUSTERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 运行集群 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDCClusterNameDirty(){
        if(this.contains(FIELD_PSDCCLUSTERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 运行集群
     */
    @JsonIgnore
    public void resetPSDCClusterName(){
        this.reset(FIELD_PSDCCLUSTERNAME);
    }

    /**
     * 设置 运行集群
     * <P>
     * 等同 {@link #setPSDCClusterName}
     * @param pSDCClusterName
     */
    @JsonIgnore
    public PSDCMSPlatformDTO psdcclustername(String pSDCClusterName){
        this.setPSDCClusterName(pSDCClusterName);
        return this;
    }

    /**
     * <B>CLUSTERNAMESPACE</B>&nbsp;集群命名空间
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_CLUSTERNAMESPACE = "clusternamespace";

    /**
     * 设置 集群命名空间
     * 
     * @param clusterNamespace
     * 
     */
    @JsonProperty(FIELD_CLUSTERNAMESPACE)
    public void setClusterNamespace(String clusterNamespace){
        this.set(FIELD_CLUSTERNAMESPACE, clusterNamespace);
    }
    
    /**
     * 获取 集群命名空间  
     * @return
     */
    @JsonIgnore
    public String getClusterNamespace(){
        Object objValue = this.get(FIELD_CLUSTERNAMESPACE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 集群命名空间 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isClusterNamespaceDirty(){
        if(this.contains(FIELD_CLUSTERNAMESPACE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 集群命名空间
     */
    @JsonIgnore
    public void resetClusterNamespace(){
        this.reset(FIELD_CLUSTERNAMESPACE);
    }

    /**
     * 设置 集群命名空间
     * <P>
     * 等同 {@link #setClusterNamespace}
     * @param clusterNamespace
     */
    @JsonIgnore
    public PSDCMSPlatformDTO clusternamespace(String clusterNamespace){
        this.setClusterNamespace(clusterNamespace);
        return this;
    }

    /**
     * <B>CFGSERVICEURL</B>&nbsp;配置服务地址
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_CFGSERVICEURL = "cfgserviceurl";

    /**
     * 设置 配置服务地址
     * 
     * @param cfgServiceUrl
     * 
     */
    @JsonProperty(FIELD_CFGSERVICEURL)
    public void setCfgServiceUrl(String cfgServiceUrl){
        this.set(FIELD_CFGSERVICEURL, cfgServiceUrl);
    }
    
    /**
     * 获取 配置服务地址  
     * @return
     */
    @JsonIgnore
    public String getCfgServiceUrl(){
        Object objValue = this.get(FIELD_CFGSERVICEURL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 配置服务地址 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCfgServiceUrlDirty(){
        if(this.contains(FIELD_CFGSERVICEURL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 配置服务地址
     */
    @JsonIgnore
    public void resetCfgServiceUrl(){
        this.reset(FIELD_CFGSERVICEURL);
    }

    /**
     * 设置 配置服务地址
     * <P>
     * 等同 {@link #setCfgServiceUrl}
     * @param cfgServiceUrl
     */
    @JsonIgnore
    public PSDCMSPlatformDTO cfgserviceurl(String cfgServiceUrl){
        this.setCfgServiceUrl(cfgServiceUrl);
        return this;
    }

    /**
     * <B>SERVICEURL</B>&nbsp;服务地址
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_SERVICEURL = "serviceurl";

    /**
     * 设置 服务地址
     * 
     * @param serviceUrl
     * 
     */
    @JsonProperty(FIELD_SERVICEURL)
    public void setServiceUrl(String serviceUrl){
        this.set(FIELD_SERVICEURL, serviceUrl);
    }
    
    /**
     * 获取 服务地址  
     * @return
     */
    @JsonIgnore
    public String getServiceUrl(){
        Object objValue = this.get(FIELD_SERVICEURL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 服务地址 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isServiceUrlDirty(){
        if(this.contains(FIELD_SERVICEURL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务地址
     */
    @JsonIgnore
    public void resetServiceUrl(){
        this.reset(FIELD_SERVICEURL);
    }

    /**
     * 设置 服务地址
     * <P>
     * 等同 {@link #setServiceUrl}
     * @param serviceUrl
     */
    @JsonIgnore
    public PSDCMSPlatformDTO serviceurl(String serviceUrl){
        this.setServiceUrl(serviceUrl);
        return this;
    }

    @JsonIgnore
    @Override
    public Object getSrfkey(){
        return this.getPSDCMSPlatformId();
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDCMSPlatformDTO){
            PSDCMSPlatformDTO dto = (PSDCMSPlatformDTO)iEntity;
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