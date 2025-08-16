package net.ibizsys.centralstudio.dto;

import net.ibizsys.centralstudio.util.CentralEntityDTOBase;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;


public class PSDCMSPlatformNodeDTO extends CentralEntityDTOBase{

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
    public PSDCMSPlatformNodeDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>PSDCMSPLATFORMNODENAME</B>&nbsp;名称
     * <P>
     * 字符串：最大长度 200，服务标识
     */
    public final static String FIELD_PSDCMSPLATFORMNODENAME = "psdcmsplatformnodename";

    /**
     * 设置 名称
     * 
     * @param pSDCMSPlatformNodeName
     * 
     */
    @JsonProperty(FIELD_PSDCMSPLATFORMNODENAME)
    public void setPSDCMSPlatformNodeName(String pSDCMSPlatformNodeName){
        this.set(FIELD_PSDCMSPLATFORMNODENAME, pSDCMSPlatformNodeName);
    }
    
    /**
     * 获取 名称  
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
     * 判断 名称 是否指定值，包括空值
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
     * 重置 名称
     */
    @JsonIgnore
    public void resetPSDCMSPlatformNodeName(){
        this.reset(FIELD_PSDCMSPLATFORMNODENAME);
    }

    /**
     * 设置 名称
     * <P>
     * 等同 {@link #setPSDCMSPlatformNodeName}
     * @param pSDCMSPlatformNodeName
     */
    @JsonIgnore
    public PSDCMSPlatformNodeDTO psdcmsplatformnodename(String pSDCMSPlatformNodeName){
        this.setPSDCMSPlatformNodeName(pSDCMSPlatformNodeName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDCMSPlatformNodeName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDCMSPlatformNodeName(strName);
    }

    @JsonIgnore
    public PSDCMSPlatformNodeDTO name(String strName){
        this.setPSDCMSPlatformNodeName(strName);
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
    public PSDCMSPlatformNodeDTO createdate(Timestamp createDate){
        this.setCreateDate(createDate);
        return this;
    }

    /**
     * <B>PSDCMSPLATFORMNODEID</B>&nbsp;中心微服务平台节点标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDCMSPLATFORMNODEID = "psdcmsplatformnodeid";

    /**
     * 设置 中心微服务平台节点标识
     * 
     * @param pSDCMSPlatformNodeId
     * 
     */
    @JsonProperty(FIELD_PSDCMSPLATFORMNODEID)
    public void setPSDCMSPlatformNodeId(String pSDCMSPlatformNodeId){
        this.set(FIELD_PSDCMSPLATFORMNODEID, pSDCMSPlatformNodeId);
    }
    
    /**
     * 获取 中心微服务平台节点标识  
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
     * 判断 中心微服务平台节点标识 是否指定值，包括空值
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
     * 重置 中心微服务平台节点标识
     */
    @JsonIgnore
    public void resetPSDCMSPlatformNodeId(){
        this.reset(FIELD_PSDCMSPLATFORMNODEID);
    }

    /**
     * 设置 中心微服务平台节点标识
     * <P>
     * 等同 {@link #setPSDCMSPlatformNodeId}
     * @param pSDCMSPlatformNodeId
     */
    @JsonIgnore
    public PSDCMSPlatformNodeDTO psdcmsplatformnodeid(String pSDCMSPlatformNodeId){
        this.setPSDCMSPlatformNodeId(pSDCMSPlatformNodeId);
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
    public PSDCMSPlatformNodeDTO updateman(String updateMan){
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
    public PSDCMSPlatformNodeDTO updatedate(Timestamp updateDate){
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
    public PSDCMSPlatformNodeDTO orgid(String orgId){
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
    public PSDCMSPlatformNodeDTO deptid(String deptId){
        this.setDeptId(deptId);
        return this;
    }

    /**
     * <B>PSDCMSPLATFORMNAME</B>&nbsp;Cloud平台
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDCMSPLATFORMID}
     */
    public final static String FIELD_PSDCMSPLATFORMNAME = "psdcmsplatformname";

    /**
     * 设置 Cloud平台
     * 
     * @param pSDCMSPlatformName
     * 
     */
    @JsonProperty(FIELD_PSDCMSPLATFORMNAME)
    public void setPSDCMSPlatformName(String pSDCMSPlatformName){
        this.set(FIELD_PSDCMSPLATFORMNAME, pSDCMSPlatformName);
    }
    
    /**
     * 获取 Cloud平台  
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
     * 判断 Cloud平台 是否指定值，包括空值
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
     * 重置 Cloud平台
     */
    @JsonIgnore
    public void resetPSDCMSPlatformName(){
        this.reset(FIELD_PSDCMSPLATFORMNAME);
    }

    /**
     * 设置 Cloud平台
     * <P>
     * 等同 {@link #setPSDCMSPlatformName}
     * @param pSDCMSPlatformName
     */
    @JsonIgnore
    public PSDCMSPlatformNodeDTO psdcmsplatformname(String pSDCMSPlatformName){
        this.setPSDCMSPlatformName(pSDCMSPlatformName);
        return this;
    }

    /**
     * <B>PSDCMSPLATFORMID</B>&nbsp;Cloud平台
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDCMSPLATFORMID = "psdcmsplatformid";

    /**
     * 设置 Cloud平台
     * 
     * @param pSDCMSPlatformId
     * 
     */
    @JsonProperty(FIELD_PSDCMSPLATFORMID)
    public void setPSDCMSPlatformId(String pSDCMSPlatformId){
        this.set(FIELD_PSDCMSPLATFORMID, pSDCMSPlatformId);
    }
    
    /**
     * 获取 Cloud平台  
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
     * 判断 Cloud平台 是否指定值，包括空值
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
     * 重置 Cloud平台
     */
    @JsonIgnore
    public void resetPSDCMSPlatformId(){
        this.reset(FIELD_PSDCMSPLATFORMID);
    }

    /**
     * 设置 Cloud平台
     * <P>
     * 等同 {@link #setPSDCMSPlatformId}
     * @param pSDCMSPlatformId
     */
    @JsonIgnore
    public PSDCMSPlatformNodeDTO psdcmsplatformid(String pSDCMSPlatformId){
        this.setPSDCMSPlatformId(pSDCMSPlatformId);
        return this;
    }

    /**
     * <B>MINCPU</B>&nbsp;最小CPU
     */
    public final static String FIELD_MINCPU = "mincpu";

    /**
     * 设置 最小CPU
     * 
     * @param minCPU
     * 
     */
    @JsonProperty(FIELD_MINCPU)
    public void setMinCPU(Double minCPU){
        this.set(FIELD_MINCPU, minCPU);
    }
    
    /**
     * 获取 最小CPU  
     * @return
     */
    @JsonIgnore
    public Double getMinCPU(){
        Object objValue = this.get(FIELD_MINCPU);
        if(objValue==null){
            return null;
        }
        return (Double)objValue;
    }

    /**
     * 判断 最小CPU 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinCPUDirty(){
        if(this.contains(FIELD_MINCPU)){
            return true;
        }
        return false;
    }

    /**
     * 重置 最小CPU
     */
    @JsonIgnore
    public void resetMinCPU(){
        this.reset(FIELD_MINCPU);
    }

    /**
     * 设置 最小CPU
     * <P>
     * 等同 {@link #setMinCPU}
     * @param minCPU
     */
    @JsonIgnore
    public PSDCMSPlatformNodeDTO mincpu(Double minCPU){
        this.setMinCPU(minCPU);
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
    public PSDCMSPlatformNodeDTO uploadfilemode(String uploadFileMode){
        this.setUploadFileMode(uploadFileMode);
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
    public PSDCMSPlatformNodeDTO sshport(Integer sSHPort){
        this.setSSHPort(sSHPort);
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
    public PSDCMSPlatformNodeDTO ipaddr2(String ipAddr2){
        this.setIpAddr2(ipAddr2);
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
    public PSDCMSPlatformNodeDTO port(Integer port){
        this.setPort(port);
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
    public PSDCMSPlatformNodeDTO sshipaddr(String sSHIPAddr){
        this.setSSHIPAddr(sSHIPAddr);
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
    public PSDCMSPlatformNodeDTO usertag2(String userTag2){
        this.setUserTag2(userTag2);
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
    public PSDCMSPlatformNodeDTO workshoppath(String workshopPath){
        this.setWorkshopPath(workshopPath);
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
    public PSDCMSPlatformNodeDTO ipaddr(String ipAddr){
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
    public PSDCMSPlatformNodeDTO uploadpath(String uploadPath){
        this.setUploadPath(uploadPath);
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
    public PSDCMSPlatformNodeDTO username(String userName){
        this.setUserName(userName);
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
    public PSDCMSPlatformNodeDTO usertag3(String userTag3){
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
    public PSDCMSPlatformNodeDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
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
    public PSDCMSPlatformNodeDTO usertag(String userTag){
        this.setUserTag(userTag);
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
    public PSDCMSPlatformNodeDTO passwd(String passwd){
        this.setPasswd(passwd);
        return this;
    }

    /**
     * <B>VALIDFLAG</B>&nbsp;启用
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.YesNo} 
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
    public PSDCMSPlatformNodeDTO validflag(Integer validFlag){
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
    public PSDCMSPlatformNodeDTO validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>MAXCPU</B>&nbsp;最大CPU
     */
    public final static String FIELD_MAXCPU = "maxcpu";

    /**
     * 设置 最大CPU
     * 
     * @param maxCPU
     * 
     */
    @JsonProperty(FIELD_MAXCPU)
    public void setMaxCPU(Double maxCPU){
        this.set(FIELD_MAXCPU, maxCPU);
    }
    
    /**
     * 获取 最大CPU  
     * @return
     */
    @JsonIgnore
    public Double getMaxCPU(){
        Object objValue = this.get(FIELD_MAXCPU);
        if(objValue==null){
            return null;
        }
        return (Double)objValue;
    }

    /**
     * 判断 最大CPU 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMaxCPUDirty(){
        if(this.contains(FIELD_MAXCPU)){
            return true;
        }
        return false;
    }

    /**
     * 重置 最大CPU
     */
    @JsonIgnore
    public void resetMaxCPU(){
        this.reset(FIELD_MAXCPU);
    }

    /**
     * 设置 最大CPU
     * <P>
     * 等同 {@link #setMaxCPU}
     * @param maxCPU
     */
    @JsonIgnore
    public PSDCMSPlatformNodeDTO maxcpu(Double maxCPU){
        this.setMaxCPU(maxCPU);
        return this;
    }

    /**
     * <B>MAXMEM</B>&nbsp;最大内存
     */
    public final static String FIELD_MAXMEM = "maxmem";

    /**
     * 设置 最大内存
     * 
     * @param maxMem
     * 
     */
    @JsonProperty(FIELD_MAXMEM)
    public void setMaxMem(Double maxMem){
        this.set(FIELD_MAXMEM, maxMem);
        //属性名称与代码标识不一致，设置属性名称
        this.set("maxmen", maxMem);
    }
    
    /**
     * 获取 最大内存  
     * @return
     */
    @JsonIgnore
    public Double getMaxMem(){
        Object objValue = this.get(FIELD_MAXMEM);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("maxmen");
            if(objValue == null){
                    return null;
            }
        }
        return (Double)objValue;
    }

    /**
     * 判断 最大内存 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMaxMemDirty(){
        if(this.contains(FIELD_MAXMEM)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("maxmen")){
            return true;
        }
        return false;
    }

    /**
     * 重置 最大内存
     */
    @JsonIgnore
    public void resetMaxMem(){
        this.reset(FIELD_MAXMEM);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("maxmen");
    }

    /**
     * 设置 最大内存
     * <P>
     * 等同 {@link #setMaxMem}
     * @param maxMem
     */
    @JsonIgnore
    public PSDCMSPlatformNodeDTO maxmem(Double maxMem){
        this.setMaxMem(maxMem);
        return this;
    }

    /**
     * <B>MINMEM</B>&nbsp;最小内存
     */
    public final static String FIELD_MINMEM = "minmem";

    /**
     * 设置 最小内存
     * 
     * @param minMem
     * 
     */
    @JsonProperty(FIELD_MINMEM)
    public void setMinMem(Double minMem){
        this.set(FIELD_MINMEM, minMem);
        //属性名称与代码标识不一致，设置属性名称
        this.set("minmen", minMem);
    }
    
    /**
     * 获取 最小内存  
     * @return
     */
    @JsonIgnore
    public Double getMinMem(){
        Object objValue = this.get(FIELD_MINMEM);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("minmen");
            if(objValue == null){
                    return null;
            }
        }
        return (Double)objValue;
    }

    /**
     * 判断 最小内存 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinMemDirty(){
        if(this.contains(FIELD_MINMEM)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("minmen")){
            return true;
        }
        return false;
    }

    /**
     * 重置 最小内存
     */
    @JsonIgnore
    public void resetMinMem(){
        this.reset(FIELD_MINMEM);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("minmen");
    }

    /**
     * 设置 最小内存
     * <P>
     * 等同 {@link #setMinMem}
     * @param minMem
     */
    @JsonIgnore
    public PSDCMSPlatformNodeDTO minmem(Double minMem){
        this.setMinMem(minMem);
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
    public PSDCMSPlatformNodeDTO userparams(String userParams){
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
    public PSDCMSPlatformNodeDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSDCREGISTRYITEMID</B>&nbsp;中心镜像仓库项标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDCREGISTRYITEMID = "psdcregistryitemid";

    /**
     * 设置 中心镜像仓库项标识
     * 
     * @param pSDCRegistryItemId
     * 
     */
    @JsonProperty(FIELD_PSDCREGISTRYITEMID)
    public void setPSDCRegistryItemId(String pSDCRegistryItemId){
        this.set(FIELD_PSDCREGISTRYITEMID, pSDCRegistryItemId);
    }
    
    /**
     * 获取 中心镜像仓库项标识  
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
     * 判断 中心镜像仓库项标识 是否指定值，包括空值
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
     * 重置 中心镜像仓库项标识
     */
    @JsonIgnore
    public void resetPSDCRegistryItemId(){
        this.reset(FIELD_PSDCREGISTRYITEMID);
    }

    /**
     * 设置 中心镜像仓库项标识
     * <P>
     * 等同 {@link #setPSDCRegistryItemId}
     * @param pSDCRegistryItemId
     */
    @JsonIgnore
    public PSDCMSPlatformNodeDTO psdcregistryitemid(String pSDCRegistryItemId){
        this.setPSDCRegistryItemId(pSDCRegistryItemId);
        return this;
    }

    /**
     * <B>PSDCREGISTRYITEMNAME</B>&nbsp;挂载镜像
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDCREGISTRYITEMID}
     */
    public final static String FIELD_PSDCREGISTRYITEMNAME = "psdcregistryitemname";

    /**
     * 设置 挂载镜像
     * 
     * @param pSDCRegistryItemName
     * 
     */
    @JsonProperty(FIELD_PSDCREGISTRYITEMNAME)
    public void setPSDCRegistryItemName(String pSDCRegistryItemName){
        this.set(FIELD_PSDCREGISTRYITEMNAME, pSDCRegistryItemName);
    }
    
    /**
     * 获取 挂载镜像  
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
     * 判断 挂载镜像 是否指定值，包括空值
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
     * 重置 挂载镜像
     */
    @JsonIgnore
    public void resetPSDCRegistryItemName(){
        this.reset(FIELD_PSDCREGISTRYITEMNAME);
    }

    /**
     * 设置 挂载镜像
     * <P>
     * 等同 {@link #setPSDCRegistryItemName}
     * @param pSDCRegistryItemName
     */
    @JsonIgnore
    public PSDCMSPlatformNodeDTO psdcregistryitemname(String pSDCRegistryItemName){
        this.setPSDCRegistryItemName(pSDCRegistryItemName);
        return this;
    }

    /**
     * <B>NODESTATE</B>&nbsp;服务状态
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_NODESTATE = "nodestate";

    /**
     * 设置 服务状态
     * 
     * @param nodeState
     * 
     */
    @JsonProperty(FIELD_NODESTATE)
    public void setNodeState(String nodeState){
        this.set(FIELD_NODESTATE, nodeState);
    }
    
    /**
     * 获取 服务状态  
     * @return
     */
    @JsonIgnore
    public String getNodeState(){
        Object objValue = this.get(FIELD_NODESTATE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 服务状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNodeStateDirty(){
        if(this.contains(FIELD_NODESTATE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务状态
     */
    @JsonIgnore
    public void resetNodeState(){
        this.reset(FIELD_NODESTATE);
    }

    /**
     * 设置 服务状态
     * <P>
     * 等同 {@link #setNodeState}
     * @param nodeState
     */
    @JsonIgnore
    public PSDCMSPlatformNodeDTO nodestate(String nodeState){
        this.setNodeState(nodeState);
        return this;
    }

    /**
     * <B>NODEINFO</B>&nbsp;服务信息
     */
    public final static String FIELD_NODEINFO = "nodeinfo";

    /**
     * 设置 服务信息
     * 
     * @param nodeInfo
     * 
     */
    @JsonProperty(FIELD_NODEINFO)
    public void setNodeInfo(String nodeInfo){
        this.set(FIELD_NODEINFO, nodeInfo);
    }
    
    /**
     * 获取 服务信息  
     * @return
     */
    @JsonIgnore
    public String getNodeInfo(){
        Object objValue = this.get(FIELD_NODEINFO);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 服务信息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNodeInfoDirty(){
        if(this.contains(FIELD_NODEINFO)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务信息
     */
    @JsonIgnore
    public void resetNodeInfo(){
        this.reset(FIELD_NODEINFO);
    }

    /**
     * 设置 服务信息
     * <P>
     * 等同 {@link #setNodeInfo}
     * @param nodeInfo
     */
    @JsonIgnore
    public PSDCMSPlatformNodeDTO nodeinfo(String nodeInfo){
        this.setNodeInfo(nodeInfo);
        return this;
    }

    /**
     * <B>CONSOLEURL</B>&nbsp;控制台路径
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_CONSOLEURL = "consoleurl";

    /**
     * 设置 控制台路径
     * 
     * @param consoleUrl
     * 
     */
    @JsonProperty(FIELD_CONSOLEURL)
    public void setConsoleUrl(String consoleUrl){
        this.set(FIELD_CONSOLEURL, consoleUrl);
    }
    
    /**
     * 获取 控制台路径  
     * @return
     */
    @JsonIgnore
    public String getConsoleUrl(){
        Object objValue = this.get(FIELD_CONSOLEURL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 控制台路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isConsoleUrlDirty(){
        if(this.contains(FIELD_CONSOLEURL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 控制台路径
     */
    @JsonIgnore
    public void resetConsoleUrl(){
        this.reset(FIELD_CONSOLEURL);
    }

    /**
     * 设置 控制台路径
     * <P>
     * 等同 {@link #setConsoleUrl}
     * @param consoleUrl
     */
    @JsonIgnore
    public PSDCMSPlatformNodeDTO consoleurl(String consoleUrl){
        this.setConsoleUrl(consoleUrl);
        return this;
    }

    /**
     * <B>SERVICEURL</B>&nbsp;服务路径
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_SERVICEURL = "serviceurl";

    /**
     * 设置 服务路径
     * 
     * @param serviceUrl
     * 
     */
    @JsonProperty(FIELD_SERVICEURL)
    public void setServiceUrl(String serviceUrl){
        this.set(FIELD_SERVICEURL, serviceUrl);
    }
    
    /**
     * 获取 服务路径  
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
     * 判断 服务路径 是否指定值，包括空值
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
     * 重置 服务路径
     */
    @JsonIgnore
    public void resetServiceUrl(){
        this.reset(FIELD_SERVICEURL);
    }

    /**
     * 设置 服务路径
     * <P>
     * 等同 {@link #setServiceUrl}
     * @param serviceUrl
     */
    @JsonIgnore
    public PSDCMSPlatformNodeDTO serviceurl(String serviceUrl){
        this.setServiceUrl(serviceUrl);
        return this;
    }

    /**
     * <B>SERVICEID</B>&nbsp;服务标识
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_SERVICEID = "serviceid";

    /**
     * 设置 服务标识
     * 
     * @param serviceId
     * 
     */
    @JsonProperty(FIELD_SERVICEID)
    public void setServiceId(String serviceId){
        this.set(FIELD_SERVICEID, serviceId);
    }
    
    /**
     * 获取 服务标识  
     * @return
     */
    @JsonIgnore
    public String getServiceId(){
        Object objValue = this.get(FIELD_SERVICEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 服务标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isServiceIdDirty(){
        if(this.contains(FIELD_SERVICEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务标识
     */
    @JsonIgnore
    public void resetServiceId(){
        this.reset(FIELD_SERVICEID);
    }

    /**
     * 设置 服务标识
     * <P>
     * 等同 {@link #setServiceId}
     * @param serviceId
     */
    @JsonIgnore
    public PSDCMSPlatformNodeDTO serviceid(String serviceId){
        this.setServiceId(serviceId);
        return this;
    }

    /**
     * <B>REPLICATED</B>&nbsp;运行副本
     */
    public final static String FIELD_REPLICATED = "replicated";

    /**
     * 设置 运行副本
     * 
     * @param replicated
     * 
     */
    @JsonProperty(FIELD_REPLICATED)
    public void setReplicated(Integer replicated){
        this.set(FIELD_REPLICATED, replicated);
    }
    
    /**
     * 获取 运行副本  
     * @return
     */
    @JsonIgnore
    public Integer getReplicated(){
        Object objValue = this.get(FIELD_REPLICATED);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 运行副本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isReplicatedDirty(){
        if(this.contains(FIELD_REPLICATED)){
            return true;
        }
        return false;
    }

    /**
     * 重置 运行副本
     */
    @JsonIgnore
    public void resetReplicated(){
        this.reset(FIELD_REPLICATED);
    }

    /**
     * 设置 运行副本
     * <P>
     * 等同 {@link #setReplicated}
     * @param replicated
     */
    @JsonIgnore
    public PSDCMSPlatformNodeDTO replicated(Integer replicated){
        this.setReplicated(replicated);
        return this;
    }

    /**
     * <B>IMAGEURL</B>&nbsp;镜像路径
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_IMAGEURL = "imageurl";

    /**
     * 设置 镜像路径
     * 
     * @param imageUrl
     * 
     */
    @JsonProperty(FIELD_IMAGEURL)
    public void setImageUrl(String imageUrl){
        this.set(FIELD_IMAGEURL, imageUrl);
    }
    
    /**
     * 获取 镜像路径  
     * @return
     */
    @JsonIgnore
    public String getImageUrl(){
        Object objValue = this.get(FIELD_IMAGEURL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 镜像路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isImageUrlDirty(){
        if(this.contains(FIELD_IMAGEURL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 镜像路径
     */
    @JsonIgnore
    public void resetImageUrl(){
        this.reset(FIELD_IMAGEURL);
    }

    /**
     * 设置 镜像路径
     * <P>
     * 等同 {@link #setImageUrl}
     * @param imageUrl
     */
    @JsonIgnore
    public PSDCMSPlatformNodeDTO imageurl(String imageUrl){
        this.setImageUrl(imageUrl);
        return this;
    }

    /**
     * <B>SERVICENAME</B>&nbsp;完整名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_SERVICENAME = "servicename";

    /**
     * 设置 完整名称
     * 
     * @param serviceName
     * 
     */
    @JsonProperty(FIELD_SERVICENAME)
    public void setServiceName(String serviceName){
        this.set(FIELD_SERVICENAME, serviceName);
    }
    
    /**
     * 获取 完整名称  
     * @return
     */
    @JsonIgnore
    public String getServiceName(){
        Object objValue = this.get(FIELD_SERVICENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 完整名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isServiceNameDirty(){
        if(this.contains(FIELD_SERVICENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 完整名称
     */
    @JsonIgnore
    public void resetServiceName(){
        this.reset(FIELD_SERVICENAME);
    }

    /**
     * 设置 完整名称
     * <P>
     * 等同 {@link #setServiceName}
     * @param serviceName
     */
    @JsonIgnore
    public PSDCMSPlatformNodeDTO servicename(String serviceName){
        this.setServiceName(serviceName);
        return this;
    }

    /**
     * <B>PORT2</B>&nbsp;内部端口
     */
    public final static String FIELD_PORT2 = "port2";

    /**
     * 设置 内部端口
     * 
     * @param port2
     * 
     */
    @JsonProperty(FIELD_PORT2)
    public void setPort2(Integer port2){
        this.set(FIELD_PORT2, port2);
    }
    
    /**
     * 获取 内部端口  
     * @return
     */
    @JsonIgnore
    public Integer getPort2(){
        Object objValue = this.get(FIELD_PORT2);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 内部端口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPort2Dirty(){
        if(this.contains(FIELD_PORT2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内部端口
     */
    @JsonIgnore
    public void resetPort2(){
        this.reset(FIELD_PORT2);
    }

    /**
     * 设置 内部端口
     * <P>
     * 等同 {@link #setPort2}
     * @param port2
     */
    @JsonIgnore
    public PSDCMSPlatformNodeDTO port2(Integer port2){
        this.setPort2(port2);
        return this;
    }

    /**
     * <B>NODETAG</B>&nbsp;节点标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_NODETAG = "nodetag";

    /**
     * 设置 节点标记
     * 
     * @param nodeTag
     * 
     */
    @JsonProperty(FIELD_NODETAG)
    public void setNodeTag(String nodeTag){
        this.set(FIELD_NODETAG, nodeTag);
    }
    
    /**
     * 获取 节点标记  
     * @return
     */
    @JsonIgnore
    public String getNodeTag(){
        Object objValue = this.get(FIELD_NODETAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 节点标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNodeTagDirty(){
        if(this.contains(FIELD_NODETAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 节点标记
     */
    @JsonIgnore
    public void resetNodeTag(){
        this.reset(FIELD_NODETAG);
    }

    /**
     * 设置 节点标记
     * <P>
     * 等同 {@link #setNodeTag}
     * @param nodeTag
     */
    @JsonIgnore
    public PSDCMSPlatformNodeDTO nodetag(String nodeTag){
        this.setNodeTag(nodeTag);
        return this;
    }

    /**
     * <B>NODETAG2</B>&nbsp;节点标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_NODETAG2 = "nodetag2";

    /**
     * 设置 节点标记2
     * 
     * @param nodeTag2
     * 
     */
    @JsonProperty(FIELD_NODETAG2)
    public void setNodeTag2(String nodeTag2){
        this.set(FIELD_NODETAG2, nodeTag2);
    }
    
    /**
     * 获取 节点标记2  
     * @return
     */
    @JsonIgnore
    public String getNodeTag2(){
        Object objValue = this.get(FIELD_NODETAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 节点标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNodeTag2Dirty(){
        if(this.contains(FIELD_NODETAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 节点标记2
     */
    @JsonIgnore
    public void resetNodeTag2(){
        this.reset(FIELD_NODETAG2);
    }

    /**
     * 设置 节点标记2
     * <P>
     * 等同 {@link #setNodeTag2}
     * @param nodeTag2
     */
    @JsonIgnore
    public PSDCMSPlatformNodeDTO nodetag2(String nodeTag2){
        this.setNodeTag2(nodeTag2);
        return this;
    }

    /**
     * <B>ENVPARAMS</B>&nbsp;环境参数
     */
    public final static String FIELD_ENVPARAMS = "envparams";

    /**
     * 设置 环境参数
     * 
     * @param envParams
     * 
     */
    @JsonProperty(FIELD_ENVPARAMS)
    public void setEnvParams(String envParams){
        this.set(FIELD_ENVPARAMS, envParams);
    }
    
    /**
     * 获取 环境参数  
     * @return
     */
    @JsonIgnore
    public String getEnvParams(){
        Object objValue = this.get(FIELD_ENVPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 环境参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnvParamsDirty(){
        if(this.contains(FIELD_ENVPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 环境参数
     */
    @JsonIgnore
    public void resetEnvParams(){
        this.reset(FIELD_ENVPARAMS);
    }

    /**
     * 设置 环境参数
     * <P>
     * 等同 {@link #setEnvParams}
     * @param envParams
     */
    @JsonIgnore
    public PSDCMSPlatformNodeDTO envparams(String envParams){
        this.setEnvParams(envParams);
        return this;
    }

    /**
     * <B>DCREGISTRYITEMTAG2</B>&nbsp;镜像项标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_DCREGISTRYITEMTAG2 = "dcregistryitemtag2";

    /**
     * 设置 镜像项标记2
     * 
     * @param dCRegistryItemTag2
     * 
     */
    @JsonProperty(FIELD_DCREGISTRYITEMTAG2)
    public void setDCRegistryItemTag2(String dCRegistryItemTag2){
        this.set(FIELD_DCREGISTRYITEMTAG2, dCRegistryItemTag2);
    }
    
    /**
     * 获取 镜像项标记2  
     * @return
     */
    @JsonIgnore
    public String getDCRegistryItemTag2(){
        Object objValue = this.get(FIELD_DCREGISTRYITEMTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 镜像项标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDCRegistryItemTag2Dirty(){
        if(this.contains(FIELD_DCREGISTRYITEMTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 镜像项标记2
     */
    @JsonIgnore
    public void resetDCRegistryItemTag2(){
        this.reset(FIELD_DCREGISTRYITEMTAG2);
    }

    /**
     * 设置 镜像项标记2
     * <P>
     * 等同 {@link #setDCRegistryItemTag2}
     * @param dCRegistryItemTag2
     */
    @JsonIgnore
    public PSDCMSPlatformNodeDTO dcregistryitemtag2(String dCRegistryItemTag2){
        this.setDCRegistryItemTag2(dCRegistryItemTag2);
        return this;
    }

    /**
     * <B>DCREGISTRYITEMTAG</B>&nbsp;镜像项类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.RegistryItemType} 
     */
    public final static String FIELD_DCREGISTRYITEMTAG = "dcregistryitemtag";

    /**
     * 设置 镜像项类型
     * 
     * @param dCRegistryItemTag
     * 
     */
    @JsonProperty(FIELD_DCREGISTRYITEMTAG)
    public void setDCRegistryItemTag(String dCRegistryItemTag){
        this.set(FIELD_DCREGISTRYITEMTAG, dCRegistryItemTag);
    }
    
    /**
     * 获取 镜像项类型  
     * @return
     */
    @JsonIgnore
    public String getDCRegistryItemTag(){
        Object objValue = this.get(FIELD_DCREGISTRYITEMTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 镜像项类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDCRegistryItemTagDirty(){
        if(this.contains(FIELD_DCREGISTRYITEMTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 镜像项类型
     */
    @JsonIgnore
    public void resetDCRegistryItemTag(){
        this.reset(FIELD_DCREGISTRYITEMTAG);
    }

    /**
     * 设置 镜像项类型
     * <P>
     * 等同 {@link #setDCRegistryItemTag}
     * @param dCRegistryItemTag
     */
    @JsonIgnore
    public PSDCMSPlatformNodeDTO dcregistryitemtag(String dCRegistryItemTag){
        this.setDCRegistryItemTag(dCRegistryItemTag);
        return this;
    }

     /**
     * 设置 镜像项类型
     * <P>
     * 等同 {@link #setDCRegistryItemTag}
     * @param dCRegistryItemTag
     */
    @JsonIgnore
    public PSDCMSPlatformNodeDTO dcregistryitemtag(net.ibizsys.centralstudio.util.CentralEnums.RegistryItemType dCRegistryItemTag){
        if(dCRegistryItemTag == null){
            this.setDCRegistryItemTag(null);
        }
        else{
            this.setDCRegistryItemTag(dCRegistryItemTag.value);
        }
        return this;
    }

    /**
     * <B>DCREGISTRYITEMTAG4</B>&nbsp;镜像项标记4
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_DCREGISTRYITEMTAG4 = "dcregistryitemtag4";

    /**
     * 设置 镜像项标记4
     * 
     * @param dCRegistryItemTag4
     * 
     */
    @JsonProperty(FIELD_DCREGISTRYITEMTAG4)
    public void setDCRegistryItemTag4(String dCRegistryItemTag4){
        this.set(FIELD_DCREGISTRYITEMTAG4, dCRegistryItemTag4);
    }
    
    /**
     * 获取 镜像项标记4  
     * @return
     */
    @JsonIgnore
    public String getDCRegistryItemTag4(){
        Object objValue = this.get(FIELD_DCREGISTRYITEMTAG4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 镜像项标记4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDCRegistryItemTag4Dirty(){
        if(this.contains(FIELD_DCREGISTRYITEMTAG4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 镜像项标记4
     */
    @JsonIgnore
    public void resetDCRegistryItemTag4(){
        this.reset(FIELD_DCREGISTRYITEMTAG4);
    }

    /**
     * 设置 镜像项标记4
     * <P>
     * 等同 {@link #setDCRegistryItemTag4}
     * @param dCRegistryItemTag4
     */
    @JsonIgnore
    public PSDCMSPlatformNodeDTO dcregistryitemtag4(String dCRegistryItemTag4){
        this.setDCRegistryItemTag4(dCRegistryItemTag4);
        return this;
    }

    /**
     * <B>DCREGISTRYITEMTAG3</B>&nbsp;镜像项标记3
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_DCREGISTRYITEMTAG3 = "dcregistryitemtag3";

    /**
     * 设置 镜像项标记3
     * 
     * @param dCRegistryItemTag3
     * 
     */
    @JsonProperty(FIELD_DCREGISTRYITEMTAG3)
    public void setDCRegistryItemTag3(String dCRegistryItemTag3){
        this.set(FIELD_DCREGISTRYITEMTAG3, dCRegistryItemTag3);
    }
    
    /**
     * 获取 镜像项标记3  
     * @return
     */
    @JsonIgnore
    public String getDCRegistryItemTag3(){
        Object objValue = this.get(FIELD_DCREGISTRYITEMTAG3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 镜像项标记3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDCRegistryItemTag3Dirty(){
        if(this.contains(FIELD_DCREGISTRYITEMTAG3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 镜像项标记3
     */
    @JsonIgnore
    public void resetDCRegistryItemTag3(){
        this.reset(FIELD_DCREGISTRYITEMTAG3);
    }

    /**
     * 设置 镜像项标记3
     * <P>
     * 等同 {@link #setDCRegistryItemTag3}
     * @param dCRegistryItemTag3
     */
    @JsonIgnore
    public PSDCMSPlatformNodeDTO dcregistryitemtag3(String dCRegistryItemTag3){
        this.setDCRegistryItemTag3(dCRegistryItemTag3);
        return this;
    }

    /**
     * <B>REFCOUNT</B>&nbsp;引用次数
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_REFCOUNT = "refcount";

    /**
     * 设置 引用次数
     * 
     * @param refCount
     * 
     */
    @JsonProperty(FIELD_REFCOUNT)
    public void setRefCount(String refCount){
        this.set(FIELD_REFCOUNT, refCount);
    }
    
    /**
     * 获取 引用次数  
     * @return
     */
    @JsonIgnore
    public String getRefCount(){
        Object objValue = this.get(FIELD_REFCOUNT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
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
    public PSDCMSPlatformNodeDTO refcount(String refCount){
        this.setRefCount(refCount);
        return this;
    }

    /**
     * <B>REFINFO</B>&nbsp;引用信息
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_REFINFO = "refinfo";

    /**
     * 设置 引用信息
     * 
     * @param refInfo
     * 
     */
    @JsonProperty(FIELD_REFINFO)
    public void setRefInfo(String refInfo){
        this.set(FIELD_REFINFO, refInfo);
    }
    
    /**
     * 获取 引用信息  
     * @return
     */
    @JsonIgnore
    public String getRefInfo(){
        Object objValue = this.get(FIELD_REFINFO);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用信息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefInfoDirty(){
        if(this.contains(FIELD_REFINFO)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用信息
     */
    @JsonIgnore
    public void resetRefInfo(){
        this.reset(FIELD_REFINFO);
    }

    /**
     * 设置 引用信息
     * <P>
     * 等同 {@link #setRefInfo}
     * @param refInfo
     */
    @JsonIgnore
    public PSDCMSPlatformNodeDTO refinfo(String refInfo){
        this.setRefInfo(refInfo);
        return this;
    }

    @JsonIgnore
    @Override
    public Object getSrfkey(){
        return this.getPSDCMSPlatformNodeId();
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDCMSPlatformNodeDTO){
            PSDCMSPlatformNodeDTO dto = (PSDCMSPlatformNodeDTO)iEntity;
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