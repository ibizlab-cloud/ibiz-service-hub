package net.ibizsys.centralstudio.dto;

import net.ibizsys.centralstudio.util.CentralEntityDTOBase;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;


public class PSDevSlnMSDepAppDTO extends CentralEntityDTOBase{

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
    public PSDevSlnMSDepAppDTO createdate(Timestamp createDate){
        this.setCreateDate(createDate);
        return this;
    }

    /**
     * <B>PSDEVSLNMSDEPAPPNAME</B>&nbsp;部署名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEVSLNMSDEPAPPNAME = "psdevslnmsdepappname";

    /**
     * 设置 部署名称
     * 
     * @param pSDevSlnMSDepAppName
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNMSDEPAPPNAME)
    public void setPSDevSlnMSDepAppName(String pSDevSlnMSDepAppName){
        this.set(FIELD_PSDEVSLNMSDEPAPPNAME, pSDevSlnMSDepAppName);
    }
    
    /**
     * 获取 部署名称  
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
     * 判断 部署名称 是否指定值，包括空值
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
     * 重置 部署名称
     */
    @JsonIgnore
    public void resetPSDevSlnMSDepAppName(){
        this.reset(FIELD_PSDEVSLNMSDEPAPPNAME);
    }

    /**
     * 设置 部署名称
     * <P>
     * 等同 {@link #setPSDevSlnMSDepAppName}
     * @param pSDevSlnMSDepAppName
     */
    @JsonIgnore
    public PSDevSlnMSDepAppDTO psdevslnmsdepappname(String pSDevSlnMSDepAppName){
        this.setPSDevSlnMSDepAppName(pSDevSlnMSDepAppName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDevSlnMSDepAppName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDevSlnMSDepAppName(strName);
    }

    @JsonIgnore
    public PSDevSlnMSDepAppDTO name(String strName){
        this.setPSDevSlnMSDepAppName(strName);
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
    public PSDevSlnMSDepAppDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>PSDEVSLNMSDEPAPPID</B>&nbsp;开发方案微服务应用部署标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVSLNMSDEPAPPID = "psdevslnmsdepappid";

    /**
     * 设置 开发方案微服务应用部署标识
     * 
     * @param pSDevSlnMSDepAppId
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNMSDEPAPPID)
    public void setPSDevSlnMSDepAppId(String pSDevSlnMSDepAppId){
        this.set(FIELD_PSDEVSLNMSDEPAPPID, pSDevSlnMSDepAppId);
    }
    
    /**
     * 获取 开发方案微服务应用部署标识  
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
     * 判断 开发方案微服务应用部署标识 是否指定值，包括空值
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
     * 重置 开发方案微服务应用部署标识
     */
    @JsonIgnore
    public void resetPSDevSlnMSDepAppId(){
        this.reset(FIELD_PSDEVSLNMSDEPAPPID);
    }

    /**
     * 设置 开发方案微服务应用部署标识
     * <P>
     * 等同 {@link #setPSDevSlnMSDepAppId}
     * @param pSDevSlnMSDepAppId
     */
    @JsonIgnore
    public PSDevSlnMSDepAppDTO psdevslnmsdepappid(String pSDevSlnMSDepAppId){
        this.setPSDevSlnMSDepAppId(pSDevSlnMSDepAppId);
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
    public PSDevSlnMSDepAppDTO updateman(String updateMan){
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
    public PSDevSlnMSDepAppDTO updatedate(Timestamp updateDate){
        this.setUpdateDate(updateDate);
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
    public PSDevSlnMSDepAppDTO orgid(String orgId){
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
    public PSDevSlnMSDepAppDTO deptid(String deptId){
        this.setDeptId(deptId);
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
    public PSDevSlnMSDepAppDTO psdevslnid(String pSDevSlnId){
        this.setPSDevSlnId(pSDevSlnId);
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
    public PSDevSlnMSDepAppDTO psdevslnname(String pSDevSlnName){
        this.setPSDevSlnName(pSDevSlnName);
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
    public PSDevSlnMSDepAppDTO psdevslnsysid(String pSDevSlnSysId){
        this.setPSDevSlnSysId(pSDevSlnSysId);
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
    public PSDevSlnMSDepAppDTO psdevslnsysname(String pSDevSlnSysName){
        this.setPSDevSlnSysName(pSDevSlnSysName);
        return this;
    }

    /**
     * <B>PSDCMSPLATFORMNODEID</B>&nbsp;微服务平台节点
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDCMSPLATFORMNODEID = "psdcmsplatformnodeid";

    /**
     * 设置 微服务平台节点
     * 
     * @param pSDCMSPlatformNodeId
     * 
     */
    @JsonProperty(FIELD_PSDCMSPLATFORMNODEID)
    public void setPSDCMSPlatformNodeId(String pSDCMSPlatformNodeId){
        this.set(FIELD_PSDCMSPLATFORMNODEID, pSDCMSPlatformNodeId);
    }
    
    /**
     * 获取 微服务平台节点  
     * @return
     */
    @JsonIgnore
    public String getPSDCMSPlatformNodeId(){
        Object objValue = this.get(FIELD_PSDCMSPLATFORMNODEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 微服务平台节点 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDCMSPlatformNodeIdDirty(){
        if(this.contains(FIELD_PSDCMSPLATFORMNODEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 微服务平台节点
     */
    @JsonIgnore
    public void resetPSDCMSPlatformNodeId(){
        this.reset(FIELD_PSDCMSPLATFORMNODEID);
    }

    /**
     * 设置 微服务平台节点
     * <P>
     * 等同 {@link #setPSDCMSPlatformNodeId}
     * @param pSDCMSPlatformNodeId
     */
    @JsonIgnore
    public PSDevSlnMSDepAppDTO psdcmsplatformnodeid(String pSDCMSPlatformNodeId){
        this.setPSDCMSPlatformNodeId(pSDCMSPlatformNodeId);
        return this;
    }

    /**
     * <B>PSDCMSPLATFORMNODENAME</B>&nbsp;部署节点
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDCMSPLATFORMNODEID}
     */
    public final static String FIELD_PSDCMSPLATFORMNODENAME = "psdcmsplatformnodename";

    /**
     * 设置 部署节点
     * 
     * @param pSDCMSPlatformNodeName
     * 
     */
    @JsonProperty(FIELD_PSDCMSPLATFORMNODENAME)
    public void setPSDCMSPlatformNodeName(String pSDCMSPlatformNodeName){
        this.set(FIELD_PSDCMSPLATFORMNODENAME, pSDCMSPlatformNodeName);
    }
    
    /**
     * 获取 部署节点  
     * @return
     */
    @JsonIgnore
    public String getPSDCMSPlatformNodeName(){
        Object objValue = this.get(FIELD_PSDCMSPLATFORMNODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部署节点 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDCMSPlatformNodeNameDirty(){
        if(this.contains(FIELD_PSDCMSPLATFORMNODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部署节点
     */
    @JsonIgnore
    public void resetPSDCMSPlatformNodeName(){
        this.reset(FIELD_PSDCMSPLATFORMNODENAME);
    }

    /**
     * 设置 部署节点
     * <P>
     * 等同 {@link #setPSDCMSPlatformNodeName}
     * @param pSDCMSPlatformNodeName
     */
    @JsonIgnore
    public PSDevSlnMSDepAppDTO psdcmsplatformnodename(String pSDCMSPlatformNodeName){
        this.setPSDCMSPlatformNodeName(pSDCMSPlatformNodeName);
        return this;
    }

    /**
     * <B>HTTPPORT</B>&nbsp;HTTP端口
     */
    public final static String FIELD_HTTPPORT = "httpport";

    /**
     * 设置 HTTP端口
     * 
     * @param httpPort
     * 
     */
    @JsonProperty(FIELD_HTTPPORT)
    public void setHttpPort(Integer httpPort){
        this.set(FIELD_HTTPPORT, httpPort);
    }
    
    /**
     * 获取 HTTP端口  
     * @return
     */
    @JsonIgnore
    public Integer getHttpPort(){
        Object objValue = this.get(FIELD_HTTPPORT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 HTTP端口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHttpPortDirty(){
        if(this.contains(FIELD_HTTPPORT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 HTTP端口
     */
    @JsonIgnore
    public void resetHttpPort(){
        this.reset(FIELD_HTTPPORT);
    }

    /**
     * 设置 HTTP端口
     * <P>
     * 等同 {@link #setHttpPort}
     * @param httpPort
     */
    @JsonIgnore
    public PSDevSlnMSDepAppDTO httpport(Integer httpPort){
        this.setHttpPort(httpPort);
        return this;
    }

    /**
     * <B>HTTPSPORT</B>&nbsp;HTTPS端口
     */
    public final static String FIELD_HTTPSPORT = "httpsport";

    /**
     * 设置 HTTPS端口
     * 
     * @param httpsPort
     * 
     */
    @JsonProperty(FIELD_HTTPSPORT)
    public void setHttpsPort(Integer httpsPort){
        this.set(FIELD_HTTPSPORT, httpsPort);
    }
    
    /**
     * 获取 HTTPS端口  
     * @return
     */
    @JsonIgnore
    public Integer getHttpsPort(){
        Object objValue = this.get(FIELD_HTTPSPORT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 HTTPS端口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHttpsPortDirty(){
        if(this.contains(FIELD_HTTPSPORT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 HTTPS端口
     */
    @JsonIgnore
    public void resetHttpsPort(){
        this.reset(FIELD_HTTPSPORT);
    }

    /**
     * 设置 HTTPS端口
     * <P>
     * 等同 {@link #setHttpsPort}
     * @param httpsPort
     */
    @JsonIgnore
    public PSDevSlnMSDepAppDTO httpsport(Integer httpsPort){
        this.setHttpsPort(httpsPort);
        return this;
    }

    /**
     * <B>HTTPADDRESS</B>&nbsp;Http地址
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_HTTPADDRESS = "httpaddress";

    /**
     * 设置 Http地址
     * 
     * @param httpAddress
     * 
     */
    @JsonProperty(FIELD_HTTPADDRESS)
    public void setHttpAddress(String httpAddress){
        this.set(FIELD_HTTPADDRESS, httpAddress);
    }
    
    /**
     * 获取 Http地址  
     * @return
     */
    @JsonIgnore
    public String getHttpAddress(){
        Object objValue = this.get(FIELD_HTTPADDRESS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 Http地址 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHttpAddressDirty(){
        if(this.contains(FIELD_HTTPADDRESS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 Http地址
     */
    @JsonIgnore
    public void resetHttpAddress(){
        this.reset(FIELD_HTTPADDRESS);
    }

    /**
     * 设置 Http地址
     * <P>
     * 等同 {@link #setHttpAddress}
     * @param httpAddress
     */
    @JsonIgnore
    public PSDevSlnMSDepAppDTO httpaddress(String httpAddress){
        this.setHttpAddress(httpAddress);
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
    public PSDevSlnMSDepAppDTO validflag(Integer validFlag){
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
    public PSDevSlnMSDepAppDTO validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSDevSlnMSDepAppDTO memo(String memo){
        this.setMemo(memo);
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
    public PSDevSlnMSDepAppDTO userparams(String userParams){
        this.setUserParams(userParams);
        return this;
    }

    /**
     * <B>PSDEVSLNSYSAPPNAME</B>&nbsp;前端应用
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVSLNSYSAPPID}
     */
    public final static String FIELD_PSDEVSLNSYSAPPNAME = "psdevslnsysappname";

    /**
     * 设置 前端应用
     * 
     * @param pSDevSlnSysAppName
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNSYSAPPNAME)
    public void setPSDevSlnSysAppName(String pSDevSlnSysAppName){
        this.set(FIELD_PSDEVSLNSYSAPPNAME, pSDevSlnSysAppName);
    }
    
    /**
     * 获取 前端应用  
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
     * 判断 前端应用 是否指定值，包括空值
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
     * 重置 前端应用
     */
    @JsonIgnore
    public void resetPSDevSlnSysAppName(){
        this.reset(FIELD_PSDEVSLNSYSAPPNAME);
    }

    /**
     * 设置 前端应用
     * <P>
     * 等同 {@link #setPSDevSlnSysAppName}
     * @param pSDevSlnSysAppName
     */
    @JsonIgnore
    public PSDevSlnMSDepAppDTO psdevslnsysappname(String pSDevSlnSysAppName){
        this.setPSDevSlnSysAppName(pSDevSlnSysAppName);
        return this;
    }

    /**
     * <B>PSDEVSLNSYSAPPID</B>&nbsp;开发系统应用
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVSLNSYSAPPID = "psdevslnsysappid";

    /**
     * 设置 开发系统应用
     * 
     * @param pSDevSlnSysAppId
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNSYSAPPID)
    public void setPSDevSlnSysAppId(String pSDevSlnSysAppId){
        this.set(FIELD_PSDEVSLNSYSAPPID, pSDevSlnSysAppId);
    }
    
    /**
     * 获取 开发系统应用  
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
     * 判断 开发系统应用 是否指定值，包括空值
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
     * 重置 开发系统应用
     */
    @JsonIgnore
    public void resetPSDevSlnSysAppId(){
        this.reset(FIELD_PSDEVSLNSYSAPPID);
    }

    /**
     * 设置 开发系统应用
     * <P>
     * 等同 {@link #setPSDevSlnSysAppId}
     * @param pSDevSlnSysAppId
     */
    @JsonIgnore
    public PSDevSlnMSDepAppDTO psdevslnsysappid(String pSDevSlnSysAppId){
        this.setPSDevSlnSysAppId(pSDevSlnSysAppId);
        return this;
    }

    /**
     * <B>PSDEVSLNMSDEPLOYNAME</B>&nbsp;微服务部署
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVSLNMSDEPLOYID}
     */
    public final static String FIELD_PSDEVSLNMSDEPLOYNAME = "psdevslnmsdeployname";

    /**
     * 设置 微服务部署
     * 
     * @param pSDevSlnMSDeployName
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNMSDEPLOYNAME)
    public void setPSDevSlnMSDeployName(String pSDevSlnMSDeployName){
        this.set(FIELD_PSDEVSLNMSDEPLOYNAME, pSDevSlnMSDeployName);
    }
    
    /**
     * 获取 微服务部署  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnMSDeployName(){
        Object objValue = this.get(FIELD_PSDEVSLNMSDEPLOYNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 微服务部署 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnMSDeployNameDirty(){
        if(this.contains(FIELD_PSDEVSLNMSDEPLOYNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 微服务部署
     */
    @JsonIgnore
    public void resetPSDevSlnMSDeployName(){
        this.reset(FIELD_PSDEVSLNMSDEPLOYNAME);
    }

    /**
     * 设置 微服务部署
     * <P>
     * 等同 {@link #setPSDevSlnMSDeployName}
     * @param pSDevSlnMSDeployName
     */
    @JsonIgnore
    public PSDevSlnMSDepAppDTO psdevslnmsdeployname(String pSDevSlnMSDeployName){
        this.setPSDevSlnMSDeployName(pSDevSlnMSDeployName);
        return this;
    }

    /**
     * <B>PSDEVSLNMSDEPLOYID</B>&nbsp;开发方案微服务部署
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVSLNMSDEPLOYID = "psdevslnmsdeployid";

    /**
     * 设置 开发方案微服务部署
     * 
     * @param pSDevSlnMSDeployId
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNMSDEPLOYID)
    public void setPSDevSlnMSDeployId(String pSDevSlnMSDeployId){
        this.set(FIELD_PSDEVSLNMSDEPLOYID, pSDevSlnMSDeployId);
    }
    
    /**
     * 获取 开发方案微服务部署  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnMSDeployId(){
        Object objValue = this.get(FIELD_PSDEVSLNMSDEPLOYID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发方案微服务部署 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnMSDeployIdDirty(){
        if(this.contains(FIELD_PSDEVSLNMSDEPLOYID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发方案微服务部署
     */
    @JsonIgnore
    public void resetPSDevSlnMSDeployId(){
        this.reset(FIELD_PSDEVSLNMSDEPLOYID);
    }

    /**
     * 设置 开发方案微服务部署
     * <P>
     * 等同 {@link #setPSDevSlnMSDeployId}
     * @param pSDevSlnMSDeployId
     */
    @JsonIgnore
    public PSDevSlnMSDepAppDTO psdevslnmsdeployid(String pSDevSlnMSDeployId){
        this.setPSDevSlnMSDeployId(pSDevSlnMSDeployId);
        return this;
    }

    /**
     * <B>PSDEVCENTERDBINSTNAME</B>&nbsp;数据库实例
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVCENTERDBINSTID}
     */
    public final static String FIELD_PSDEVCENTERDBINSTNAME = "psdevcenterdbinstname";

    /**
     * 设置 数据库实例
     * 
     * @param pSDevCenterDBInstName
     * 
     */
    @JsonProperty(FIELD_PSDEVCENTERDBINSTNAME)
    public void setPSDevCenterDBInstName(String pSDevCenterDBInstName){
        this.set(FIELD_PSDEVCENTERDBINSTNAME, pSDevCenterDBInstName);
    }
    
    /**
     * 获取 数据库实例  
     * @return
     */
    @JsonIgnore
    public String getPSDevCenterDBInstName(){
        Object objValue = this.get(FIELD_PSDEVCENTERDBINSTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据库实例 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevCenterDBInstNameDirty(){
        if(this.contains(FIELD_PSDEVCENTERDBINSTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据库实例
     */
    @JsonIgnore
    public void resetPSDevCenterDBInstName(){
        this.reset(FIELD_PSDEVCENTERDBINSTNAME);
    }

    /**
     * 设置 数据库实例
     * <P>
     * 等同 {@link #setPSDevCenterDBInstName}
     * @param pSDevCenterDBInstName
     */
    @JsonIgnore
    public PSDevSlnMSDepAppDTO psdevcenterdbinstname(String pSDevCenterDBInstName){
        this.setPSDevCenterDBInstName(pSDevCenterDBInstName);
        return this;
    }

    /**
     * <B>PSDEVCENTERDBINSTID</B>&nbsp;应用中心数据实例
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVCENTERDBINSTID = "psdevcenterdbinstid";

    /**
     * 设置 应用中心数据实例
     * 
     * @param pSDevCenterDBInstId
     * 
     */
    @JsonProperty(FIELD_PSDEVCENTERDBINSTID)
    public void setPSDevCenterDBInstId(String pSDevCenterDBInstId){
        this.set(FIELD_PSDEVCENTERDBINSTID, pSDevCenterDBInstId);
    }
    
    /**
     * 获取 应用中心数据实例  
     * @return
     */
    @JsonIgnore
    public String getPSDevCenterDBInstId(){
        Object objValue = this.get(FIELD_PSDEVCENTERDBINSTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用中心数据实例 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevCenterDBInstIdDirty(){
        if(this.contains(FIELD_PSDEVCENTERDBINSTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用中心数据实例
     */
    @JsonIgnore
    public void resetPSDevCenterDBInstId(){
        this.reset(FIELD_PSDEVCENTERDBINSTID);
    }

    /**
     * 设置 应用中心数据实例
     * <P>
     * 等同 {@link #setPSDevCenterDBInstId}
     * @param pSDevCenterDBInstId
     */
    @JsonIgnore
    public PSDevSlnMSDepAppDTO psdevcenterdbinstid(String pSDevCenterDBInstId){
        this.setPSDevCenterDBInstId(pSDevCenterDBInstId);
        return this;
    }

    /**
     * <B>PSDCMSPLATFORMID</B>&nbsp;PSDCMSPLATFORMID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVSLNMSDEPLOYID}
     */
    public final static String FIELD_PSDCMSPLATFORMID = "psdcmsplatformid";

    /**
     * 设置 PSDCMSPLATFORMID
     * 
     * @param pSDCMSPlatformId
     * 
     */
    @JsonProperty(FIELD_PSDCMSPLATFORMID)
    public void setPSDCMSPlatformId(String pSDCMSPlatformId){
        this.set(FIELD_PSDCMSPLATFORMID, pSDCMSPlatformId);
    }
    
    /**
     * 获取 PSDCMSPLATFORMID  
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
     * 判断 PSDCMSPLATFORMID 是否指定值，包括空值
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
     * 重置 PSDCMSPLATFORMID
     */
    @JsonIgnore
    public void resetPSDCMSPlatformId(){
        this.reset(FIELD_PSDCMSPLATFORMID);
    }

    /**
     * 设置 PSDCMSPLATFORMID
     * <P>
     * 等同 {@link #setPSDCMSPlatformId}
     * @param pSDCMSPlatformId
     */
    @JsonIgnore
    public PSDevSlnMSDepAppDTO psdcmsplatformid(String pSDCMSPlatformId){
        this.setPSDCMSPlatformId(pSDCMSPlatformId);
        return this;
    }

    /**
     * <B>NODEPORT</B>&nbsp;服务端口
     */
    public final static String FIELD_NODEPORT = "nodeport";

    /**
     * 设置 服务端口
     * 
     * @param nodePort
     * 
     */
    @JsonProperty(FIELD_NODEPORT)
    public void setNodePort(Integer nodePort){
        this.set(FIELD_NODEPORT, nodePort);
    }
    
    /**
     * 获取 服务端口  
     * @return
     */
    @JsonIgnore
    public Integer getNodePort(){
        Object objValue = this.get(FIELD_NODEPORT);
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
    public boolean isNodePortDirty(){
        if(this.contains(FIELD_NODEPORT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务端口
     */
    @JsonIgnore
    public void resetNodePort(){
        this.reset(FIELD_NODEPORT);
    }

    /**
     * 设置 服务端口
     * <P>
     * 等同 {@link #setNodePort}
     * @param nodePort
     */
    @JsonIgnore
    public PSDevSlnMSDepAppDTO nodeport(Integer nodePort){
        this.setNodePort(nodePort);
        return this;
    }

    /**
     * <B>NODEIPADDR</B>&nbsp;服务地址
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_NODEIPADDR = "nodeipaddr";

    /**
     * 设置 服务地址
     * 
     * @param nodeIPAddr
     * 
     */
    @JsonProperty(FIELD_NODEIPADDR)
    public void setNodeIPAddr(String nodeIPAddr){
        this.set(FIELD_NODEIPADDR, nodeIPAddr);
    }
    
    /**
     * 获取 服务地址  
     * @return
     */
    @JsonIgnore
    public String getNodeIPAddr(){
        Object objValue = this.get(FIELD_NODEIPADDR);
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
    public boolean isNodeIPAddrDirty(){
        if(this.contains(FIELD_NODEIPADDR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务地址
     */
    @JsonIgnore
    public void resetNodeIPAddr(){
        this.reset(FIELD_NODEIPADDR);
    }

    /**
     * 设置 服务地址
     * <P>
     * 等同 {@link #setNodeIPAddr}
     * @param nodeIPAddr
     */
    @JsonIgnore
    public PSDevSlnMSDepAppDTO nodeipaddr(String nodeIPAddr){
        this.setNodeIPAddr(nodeIPAddr);
        return this;
    }

    /**
     * <B>PSDCREGISTRYITEMID</B>&nbsp;镜像标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDCREGISTRYITEMID = "psdcregistryitemid";

    /**
     * 设置 镜像标识
     * 
     * @param pSDCRegistryItemId
     * 
     */
    @JsonProperty(FIELD_PSDCREGISTRYITEMID)
    public void setPSDCRegistryItemId(String pSDCRegistryItemId){
        this.set(FIELD_PSDCREGISTRYITEMID, pSDCRegistryItemId);
    }
    
    /**
     * 获取 镜像标识  
     * @return
     */
    @JsonIgnore
    public String getPSDCRegistryItemId(){
        Object objValue = this.get(FIELD_PSDCREGISTRYITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 镜像标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDCRegistryItemIdDirty(){
        if(this.contains(FIELD_PSDCREGISTRYITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 镜像标识
     */
    @JsonIgnore
    public void resetPSDCRegistryItemId(){
        this.reset(FIELD_PSDCREGISTRYITEMID);
    }

    /**
     * 设置 镜像标识
     * <P>
     * 等同 {@link #setPSDCRegistryItemId}
     * @param pSDCRegistryItemId
     */
    @JsonIgnore
    public PSDevSlnMSDepAppDTO psdcregistryitemid(String pSDCRegistryItemId){
        this.setPSDCRegistryItemId(pSDCRegistryItemId);
        return this;
    }

    /**
     * <B>PSDCREGISTRYITEMNAME</B>&nbsp;镜像名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDCREGISTRYITEMNAME = "psdcregistryitemname";

    /**
     * 设置 镜像名称
     * 
     * @param pSDCRegistryItemName
     * 
     */
    @JsonProperty(FIELD_PSDCREGISTRYITEMNAME)
    public void setPSDCRegistryItemName(String pSDCRegistryItemName){
        this.set(FIELD_PSDCREGISTRYITEMNAME, pSDCRegistryItemName);
    }
    
    /**
     * 获取 镜像名称  
     * @return
     */
    @JsonIgnore
    public String getPSDCRegistryItemName(){
        Object objValue = this.get(FIELD_PSDCREGISTRYITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 镜像名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDCRegistryItemNameDirty(){
        if(this.contains(FIELD_PSDCREGISTRYITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 镜像名称
     */
    @JsonIgnore
    public void resetPSDCRegistryItemName(){
        this.reset(FIELD_PSDCREGISTRYITEMNAME);
    }

    /**
     * 设置 镜像名称
     * <P>
     * 等同 {@link #setPSDCRegistryItemName}
     * @param pSDCRegistryItemName
     */
    @JsonIgnore
    public PSDevSlnMSDepAppDTO psdcregistryitemname(String pSDCRegistryItemName){
        this.setPSDCRegistryItemName(pSDCRegistryItemName);
        return this;
    }

    @JsonIgnore
    @Override
    public Object getSrfkey(){
        return this.getPSDevSlnMSDepAppId();
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDevSlnMSDepAppDTO){
            PSDevSlnMSDepAppDTO dto = (PSDevSlnMSDepAppDTO)iEntity;
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