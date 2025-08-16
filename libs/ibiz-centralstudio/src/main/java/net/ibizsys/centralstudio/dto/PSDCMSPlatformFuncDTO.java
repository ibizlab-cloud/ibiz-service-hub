package net.ibizsys.centralstudio.dto;

import net.ibizsys.centralstudio.util.CentralEntityDTOBase;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;


public class PSDCMSPlatformFuncDTO extends CentralEntityDTOBase{

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
    public PSDCMSPlatformFuncDTO updateman(String updateMan){
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
    public PSDCMSPlatformFuncDTO createdate(Timestamp createDate){
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
    public PSDCMSPlatformFuncDTO updatedate(Timestamp updateDate){
        this.setUpdateDate(updateDate);
        return this;
    }

    /**
     * <B>PSDCMSPLATFORMFUNCID</B>&nbsp;中心微服务平台功能标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDCMSPLATFORMFUNCID = "psdcmsplatformfuncid";

    /**
     * 设置 中心微服务平台功能标识
     * 
     * @param pSDCMSPlatformFuncId
     * 
     */
    @JsonProperty(FIELD_PSDCMSPLATFORMFUNCID)
    public void setPSDCMSPlatformFuncId(String pSDCMSPlatformFuncId){
        this.set(FIELD_PSDCMSPLATFORMFUNCID, pSDCMSPlatformFuncId);
    }
    
    /**
     * 获取 中心微服务平台功能标识  
     * @return
     */
    @JsonIgnore
    public String getPSDCMSPlatformFuncId(){
        Object objValue = this.get(FIELD_PSDCMSPLATFORMFUNCID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 中心微服务平台功能标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDCMSPlatformFuncIdDirty(){
        if(this.contains(FIELD_PSDCMSPLATFORMFUNCID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 中心微服务平台功能标识
     */
    @JsonIgnore
    public void resetPSDCMSPlatformFuncId(){
        this.reset(FIELD_PSDCMSPLATFORMFUNCID);
    }

    /**
     * 设置 中心微服务平台功能标识
     * <P>
     * 等同 {@link #setPSDCMSPlatformFuncId}
     * @param pSDCMSPlatformFuncId
     */
    @JsonIgnore
    public PSDCMSPlatformFuncDTO psdcmsplatformfuncid(String pSDCMSPlatformFuncId){
        this.setPSDCMSPlatformFuncId(pSDCMSPlatformFuncId);
        return this;
    }

    /**
     * <B>PSDCMSPLATFORMFUNCNAME</B>&nbsp;功能名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDCMSPLATFORMFUNCNAME = "psdcmsplatformfuncname";

    /**
     * 设置 功能名称
     * 
     * @param pSDCMSPlatformFuncName
     * 
     */
    @JsonProperty(FIELD_PSDCMSPLATFORMFUNCNAME)
    public void setPSDCMSPlatformFuncName(String pSDCMSPlatformFuncName){
        this.set(FIELD_PSDCMSPLATFORMFUNCNAME, pSDCMSPlatformFuncName);
    }
    
    /**
     * 获取 功能名称  
     * @return
     */
    @JsonIgnore
    public String getPSDCMSPlatformFuncName(){
        Object objValue = this.get(FIELD_PSDCMSPLATFORMFUNCNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDCMSPlatformFuncNameDirty(){
        if(this.contains(FIELD_PSDCMSPLATFORMFUNCNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能名称
     */
    @JsonIgnore
    public void resetPSDCMSPlatformFuncName(){
        this.reset(FIELD_PSDCMSPLATFORMFUNCNAME);
    }

    /**
     * 设置 功能名称
     * <P>
     * 等同 {@link #setPSDCMSPlatformFuncName}
     * @param pSDCMSPlatformFuncName
     */
    @JsonIgnore
    public PSDCMSPlatformFuncDTO psdcmsplatformfuncname(String pSDCMSPlatformFuncName){
        this.setPSDCMSPlatformFuncName(pSDCMSPlatformFuncName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDCMSPlatformFuncName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDCMSPlatformFuncName(strName);
    }

    @JsonIgnore
    public PSDCMSPlatformFuncDTO name(String strName){
        this.setPSDCMSPlatformFuncName(strName);
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
    public PSDCMSPlatformFuncDTO createman(String createMan){
        this.setCreateMan(createMan);
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
    public PSDCMSPlatformFuncDTO deptid(String deptId){
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
    public PSDCMSPlatformFuncDTO orgid(String orgId){
        this.setOrgId(orgId);
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
    public PSDCMSPlatformFuncDTO sshport(Integer sSHPort){
        this.setSSHPort(sSHPort);
        return this;
    }

    /**
     * <B>FUNCPARAM7</B>&nbsp;功能参数7
     */
    public final static String FIELD_FUNCPARAM7 = "funcparam7";

    /**
     * 设置 功能参数7
     * 
     * @param funcParam7
     * 
     */
    @JsonProperty(FIELD_FUNCPARAM7)
    public void setFuncParam7(Integer funcParam7){
        this.set(FIELD_FUNCPARAM7, funcParam7);
    }
    
    /**
     * 获取 功能参数7  
     * @return
     */
    @JsonIgnore
    public Integer getFuncParam7(){
        Object objValue = this.get(FIELD_FUNCPARAM7);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 功能参数7 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFuncParam7Dirty(){
        if(this.contains(FIELD_FUNCPARAM7)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能参数7
     */
    @JsonIgnore
    public void resetFuncParam7(){
        this.reset(FIELD_FUNCPARAM7);
    }

    /**
     * 设置 功能参数7
     * <P>
     * 等同 {@link #setFuncParam7}
     * @param funcParam7
     */
    @JsonIgnore
    public PSDCMSPlatformFuncDTO funcparam7(Integer funcParam7){
        this.setFuncParam7(funcParam7);
        return this;
    }

    /**
     * <B>FUNCPARAM8</B>&nbsp;功能参数8
     */
    public final static String FIELD_FUNCPARAM8 = "funcparam8";

    /**
     * 设置 功能参数8
     * 
     * @param funcParam8
     * 
     */
    @JsonProperty(FIELD_FUNCPARAM8)
    public void setFuncParam8(Integer funcParam8){
        this.set(FIELD_FUNCPARAM8, funcParam8);
    }
    
    /**
     * 获取 功能参数8  
     * @return
     */
    @JsonIgnore
    public Integer getFuncParam8(){
        Object objValue = this.get(FIELD_FUNCPARAM8);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 功能参数8 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFuncParam8Dirty(){
        if(this.contains(FIELD_FUNCPARAM8)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能参数8
     */
    @JsonIgnore
    public void resetFuncParam8(){
        this.reset(FIELD_FUNCPARAM8);
    }

    /**
     * 设置 功能参数8
     * <P>
     * 等同 {@link #setFuncParam8}
     * @param funcParam8
     */
    @JsonIgnore
    public PSDCMSPlatformFuncDTO funcparam8(Integer funcParam8){
        this.setFuncParam8(funcParam8);
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
    public PSDCMSPlatformFuncDTO port(Integer port){
        this.setPort(port);
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
    public PSDCMSPlatformFuncDTO passwd(String passwd){
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
    public PSDCMSPlatformFuncDTO sshipaddr(String sSHIPAddr){
        this.setSSHIPAddr(sSHIPAddr);
        return this;
    }

    /**
     * <B>FUNCPARAM9</B>&nbsp;功能参数9
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_FUNCPARAM9 = "funcparam9";

    /**
     * 设置 功能参数9
     * 
     * @param funcParam9
     * 
     */
    @JsonProperty(FIELD_FUNCPARAM9)
    public void setFuncParam9(String funcParam9){
        this.set(FIELD_FUNCPARAM9, funcParam9);
    }
    
    /**
     * 获取 功能参数9  
     * @return
     */
    @JsonIgnore
    public String getFuncParam9(){
        Object objValue = this.get(FIELD_FUNCPARAM9);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能参数9 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFuncParam9Dirty(){
        if(this.contains(FIELD_FUNCPARAM9)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能参数9
     */
    @JsonIgnore
    public void resetFuncParam9(){
        this.reset(FIELD_FUNCPARAM9);
    }

    /**
     * 设置 功能参数9
     * <P>
     * 等同 {@link #setFuncParam9}
     * @param funcParam9
     */
    @JsonIgnore
    public PSDCMSPlatformFuncDTO funcparam9(String funcParam9){
        this.setFuncParam9(funcParam9);
        return this;
    }

    /**
     * <B>FUNCPARAM10</B>&nbsp;功能参数10
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_FUNCPARAM10 = "funcparam10";

    /**
     * 设置 功能参数10
     * 
     * @param funcParam10
     * 
     */
    @JsonProperty(FIELD_FUNCPARAM10)
    public void setFuncParam10(String funcParam10){
        this.set(FIELD_FUNCPARAM10, funcParam10);
    }
    
    /**
     * 获取 功能参数10  
     * @return
     */
    @JsonIgnore
    public String getFuncParam10(){
        Object objValue = this.get(FIELD_FUNCPARAM10);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能参数10 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFuncParam10Dirty(){
        if(this.contains(FIELD_FUNCPARAM10)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能参数10
     */
    @JsonIgnore
    public void resetFuncParam10(){
        this.reset(FIELD_FUNCPARAM10);
    }

    /**
     * 设置 功能参数10
     * <P>
     * 等同 {@link #setFuncParam10}
     * @param funcParam10
     */
    @JsonIgnore
    public PSDCMSPlatformFuncDTO funcparam10(String funcParam10){
        this.setFuncParam10(funcParam10);
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
    public PSDCMSPlatformFuncDTO uploadpath(String uploadPath){
        this.setUploadPath(uploadPath);
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
    public PSDCMSPlatformFuncDTO ipaddr2(String ipAddr2){
        this.setIpAddr2(ipAddr2);
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
    public PSDCMSPlatformFuncDTO workshoppath(String workshopPath){
        this.setWorkshopPath(workshopPath);
        return this;
    }

    /**
     * <B>FUNCPARAM2</B>&nbsp;功能参数2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_FUNCPARAM2 = "funcparam2";

    /**
     * 设置 功能参数2
     * 
     * @param funcParam2
     * 
     */
    @JsonProperty(FIELD_FUNCPARAM2)
    public void setFuncParam2(String funcParam2){
        this.set(FIELD_FUNCPARAM2, funcParam2);
    }
    
    /**
     * 获取 功能参数2  
     * @return
     */
    @JsonIgnore
    public String getFuncParam2(){
        Object objValue = this.get(FIELD_FUNCPARAM2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能参数2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFuncParam2Dirty(){
        if(this.contains(FIELD_FUNCPARAM2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能参数2
     */
    @JsonIgnore
    public void resetFuncParam2(){
        this.reset(FIELD_FUNCPARAM2);
    }

    /**
     * 设置 功能参数2
     * <P>
     * 等同 {@link #setFuncParam2}
     * @param funcParam2
     */
    @JsonIgnore
    public PSDCMSPlatformFuncDTO funcparam2(String funcParam2){
        this.setFuncParam2(funcParam2);
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
    public PSDCMSPlatformFuncDTO serviceurl(String serviceUrl){
        this.setServiceUrl(serviceUrl);
        return this;
    }

    /**
     * <B>FUNCPARAM4</B>&nbsp;功能参数4
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_FUNCPARAM4 = "funcparam4";

    /**
     * 设置 功能参数4
     * 
     * @param funcParam4
     * 
     */
    @JsonProperty(FIELD_FUNCPARAM4)
    public void setFuncParam4(String funcParam4){
        this.set(FIELD_FUNCPARAM4, funcParam4);
    }
    
    /**
     * 获取 功能参数4  
     * @return
     */
    @JsonIgnore
    public String getFuncParam4(){
        Object objValue = this.get(FIELD_FUNCPARAM4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能参数4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFuncParam4Dirty(){
        if(this.contains(FIELD_FUNCPARAM4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能参数4
     */
    @JsonIgnore
    public void resetFuncParam4(){
        this.reset(FIELD_FUNCPARAM4);
    }

    /**
     * 设置 功能参数4
     * <P>
     * 等同 {@link #setFuncParam4}
     * @param funcParam4
     */
    @JsonIgnore
    public PSDCMSPlatformFuncDTO funcparam4(String funcParam4){
        this.setFuncParam4(funcParam4);
        return this;
    }

    /**
     * <B>FUNCPARAM</B>&nbsp;功能参数
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_FUNCPARAM = "funcparam";

    /**
     * 设置 功能参数
     * 
     * @param funcParam
     * 
     */
    @JsonProperty(FIELD_FUNCPARAM)
    public void setFuncParam(String funcParam){
        this.set(FIELD_FUNCPARAM, funcParam);
    }
    
    /**
     * 获取 功能参数  
     * @return
     */
    @JsonIgnore
    public String getFuncParam(){
        Object objValue = this.get(FIELD_FUNCPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFuncParamDirty(){
        if(this.contains(FIELD_FUNCPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能参数
     */
    @JsonIgnore
    public void resetFuncParam(){
        this.reset(FIELD_FUNCPARAM);
    }

    /**
     * 设置 功能参数
     * <P>
     * 等同 {@link #setFuncParam}
     * @param funcParam
     */
    @JsonIgnore
    public PSDCMSPlatformFuncDTO funcparam(String funcParam){
        this.setFuncParam(funcParam);
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
    public PSDCMSPlatformFuncDTO username(String userName){
        this.setUserName(userName);
        return this;
    }

    /**
     * <B>FUNCPARAM3</B>&nbsp;功能参数3
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_FUNCPARAM3 = "funcparam3";

    /**
     * 设置 功能参数3
     * 
     * @param funcParam3
     * 
     */
    @JsonProperty(FIELD_FUNCPARAM3)
    public void setFuncParam3(String funcParam3){
        this.set(FIELD_FUNCPARAM3, funcParam3);
    }
    
    /**
     * 获取 功能参数3  
     * @return
     */
    @JsonIgnore
    public String getFuncParam3(){
        Object objValue = this.get(FIELD_FUNCPARAM3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能参数3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFuncParam3Dirty(){
        if(this.contains(FIELD_FUNCPARAM3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能参数3
     */
    @JsonIgnore
    public void resetFuncParam3(){
        this.reset(FIELD_FUNCPARAM3);
    }

    /**
     * 设置 功能参数3
     * <P>
     * 等同 {@link #setFuncParam3}
     * @param funcParam3
     */
    @JsonIgnore
    public PSDCMSPlatformFuncDTO funcparam3(String funcParam3){
        this.setFuncParam3(funcParam3);
        return this;
    }

    /**
     * <B>FUNCPARAM6</B>&nbsp;功能参数6
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.YesNo} 
     */
    public final static String FIELD_FUNCPARAM6 = "funcparam6";

    /**
     * 设置 功能参数6
     * 
     * @param funcParam6
     * 
     */
    @JsonProperty(FIELD_FUNCPARAM6)
    public void setFuncParam6(Integer funcParam6){
        this.set(FIELD_FUNCPARAM6, funcParam6);
    }
    
    /**
     * 获取 功能参数6  
     * @return
     */
    @JsonIgnore
    public Integer getFuncParam6(){
        Object objValue = this.get(FIELD_FUNCPARAM6);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 功能参数6 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFuncParam6Dirty(){
        if(this.contains(FIELD_FUNCPARAM6)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能参数6
     */
    @JsonIgnore
    public void resetFuncParam6(){
        this.reset(FIELD_FUNCPARAM6);
    }

    /**
     * 设置 功能参数6
     * <P>
     * 等同 {@link #setFuncParam6}
     * @param funcParam6
     */
    @JsonIgnore
    public PSDCMSPlatformFuncDTO funcparam6(Integer funcParam6){
        this.setFuncParam6(funcParam6);
        return this;
    }

     /**
     * 设置 功能参数6
     * <P>
     * 等同 {@link #setFuncParam6}
     * @param funcParam6
     */
    @JsonIgnore
    public PSDCMSPlatformFuncDTO funcparam6(Boolean funcParam6){
        if(funcParam6 == null){
            this.setFuncParam6(null);
        }
        else{
            this.setFuncParam6(funcParam6?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
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
    public PSDCMSPlatformFuncDTO ipaddr(String ipAddr){
        this.setIpAddr(ipAddr);
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
    public PSDCMSPlatformFuncDTO validflag(Integer validFlag){
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
    public PSDCMSPlatformFuncDTO validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>FUNCPARAM5</B>&nbsp;功能参数5
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.YesNo} 
     */
    public final static String FIELD_FUNCPARAM5 = "funcparam5";

    /**
     * 设置 功能参数5
     * 
     * @param funcParam5
     * 
     */
    @JsonProperty(FIELD_FUNCPARAM5)
    public void setFuncParam5(Integer funcParam5){
        this.set(FIELD_FUNCPARAM5, funcParam5);
    }
    
    /**
     * 获取 功能参数5  
     * @return
     */
    @JsonIgnore
    public Integer getFuncParam5(){
        Object objValue = this.get(FIELD_FUNCPARAM5);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 功能参数5 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFuncParam5Dirty(){
        if(this.contains(FIELD_FUNCPARAM5)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能参数5
     */
    @JsonIgnore
    public void resetFuncParam5(){
        this.reset(FIELD_FUNCPARAM5);
    }

    /**
     * 设置 功能参数5
     * <P>
     * 等同 {@link #setFuncParam5}
     * @param funcParam5
     */
    @JsonIgnore
    public PSDCMSPlatformFuncDTO funcparam5(Integer funcParam5){
        this.setFuncParam5(funcParam5);
        return this;
    }

     /**
     * 设置 功能参数5
     * <P>
     * 等同 {@link #setFuncParam5}
     * @param funcParam5
     */
    @JsonIgnore
    public PSDCMSPlatformFuncDTO funcparam5(Boolean funcParam5){
        if(funcParam5 == null){
            this.setFuncParam5(null);
        }
        else{
            this.setFuncParam5(funcParam5?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
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
    public PSDCMSPlatformFuncDTO mincpu(Double minCPU){
        this.setMinCPU(minCPU);
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
    public PSDCMSPlatformFuncDTO minmem(Double minMem){
        this.setMinMem(minMem);
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
    public PSDCMSPlatformFuncDTO memo(String memo){
        this.setMemo(memo);
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
    public PSDCMSPlatformFuncDTO maxcpu(Double maxCPU){
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
    public PSDCMSPlatformFuncDTO maxmem(Double maxMem){
        this.setMaxMem(maxMem);
        return this;
    }

    /**
     * <B>MSFUNCTYPE</B>&nbsp;微服务功能类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.MSPlatformFuncType} 
     */
    public final static String FIELD_MSFUNCTYPE = "msfunctype";

    /**
     * 设置 微服务功能类型
     * 
     * @param mSFuncType
     * 
     */
    @JsonProperty(FIELD_MSFUNCTYPE)
    public void setMSFuncType(String mSFuncType){
        this.set(FIELD_MSFUNCTYPE, mSFuncType);
    }
    
    /**
     * 获取 微服务功能类型  
     * @return
     */
    @JsonIgnore
    public String getMSFuncType(){
        Object objValue = this.get(FIELD_MSFUNCTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 微服务功能类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMSFuncTypeDirty(){
        if(this.contains(FIELD_MSFUNCTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 微服务功能类型
     */
    @JsonIgnore
    public void resetMSFuncType(){
        this.reset(FIELD_MSFUNCTYPE);
    }

    /**
     * 设置 微服务功能类型
     * <P>
     * 等同 {@link #setMSFuncType}
     * @param mSFuncType
     */
    @JsonIgnore
    public PSDCMSPlatformFuncDTO msfunctype(String mSFuncType){
        this.setMSFuncType(mSFuncType);
        return this;
    }

     /**
     * 设置 微服务功能类型
     * <P>
     * 等同 {@link #setMSFuncType}
     * @param mSFuncType
     */
    @JsonIgnore
    public PSDCMSPlatformFuncDTO msfunctype(net.ibizsys.centralstudio.util.CentralEnums.MSPlatformFuncType mSFuncType){
        if(mSFuncType == null){
            this.setMSFuncType(null);
        }
        else{
            this.setMSFuncType(mSFuncType.value);
        }
        return this;
    }

    /**
     * <B>PSDCMSPLATFORMNAME</B>&nbsp;中心微服务平台
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDCMSPLATFORMID}
     */
    public final static String FIELD_PSDCMSPLATFORMNAME = "psdcmsplatformname";

    /**
     * 设置 中心微服务平台
     * 
     * @param pSDCMSPlatformName
     * 
     */
    @JsonProperty(FIELD_PSDCMSPLATFORMNAME)
    public void setPSDCMSPlatformName(String pSDCMSPlatformName){
        this.set(FIELD_PSDCMSPLATFORMNAME, pSDCMSPlatformName);
    }
    
    /**
     * 获取 中心微服务平台  
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
     * 判断 中心微服务平台 是否指定值，包括空值
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
     * 重置 中心微服务平台
     */
    @JsonIgnore
    public void resetPSDCMSPlatformName(){
        this.reset(FIELD_PSDCMSPLATFORMNAME);
    }

    /**
     * 设置 中心微服务平台
     * <P>
     * 等同 {@link #setPSDCMSPlatformName}
     * @param pSDCMSPlatformName
     */
    @JsonIgnore
    public PSDCMSPlatformFuncDTO psdcmsplatformname(String pSDCMSPlatformName){
        this.setPSDCMSPlatformName(pSDCMSPlatformName);
        return this;
    }

    /**
     * <B>PSDCMSPLATFORMID</B>&nbsp;中心微服务平台
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDCMSPLATFORMID = "psdcmsplatformid";

    /**
     * 设置 中心微服务平台
     * 
     * @param pSDCMSPlatformId
     * 
     */
    @JsonProperty(FIELD_PSDCMSPLATFORMID)
    public void setPSDCMSPlatformId(String pSDCMSPlatformId){
        this.set(FIELD_PSDCMSPLATFORMID, pSDCMSPlatformId);
    }
    
    /**
     * 获取 中心微服务平台  
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
     * 判断 中心微服务平台 是否指定值，包括空值
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
     * 重置 中心微服务平台
     */
    @JsonIgnore
    public void resetPSDCMSPlatformId(){
        this.reset(FIELD_PSDCMSPLATFORMID);
    }

    /**
     * 设置 中心微服务平台
     * <P>
     * 等同 {@link #setPSDCMSPlatformId}
     * @param pSDCMSPlatformId
     */
    @JsonIgnore
    public PSDCMSPlatformFuncDTO psdcmsplatformid(String pSDCMSPlatformId){
        this.setPSDCMSPlatformId(pSDCMSPlatformId);
        return this;
    }

    /**
     * <B>FUNCPARAMS</B>&nbsp;功能参数
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_FUNCPARAMS = "funcparams";

    /**
     * 设置 功能参数
     * 
     * @param funcParams
     * 
     */
    @JsonProperty(FIELD_FUNCPARAMS)
    public void setFuncParams(String funcParams){
        this.set(FIELD_FUNCPARAMS, funcParams);
    }
    
    /**
     * 获取 功能参数  
     * @return
     */
    @JsonIgnore
    public String getFuncParams(){
        Object objValue = this.get(FIELD_FUNCPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFuncParamsDirty(){
        if(this.contains(FIELD_FUNCPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能参数
     */
    @JsonIgnore
    public void resetFuncParams(){
        this.reset(FIELD_FUNCPARAMS);
    }

    /**
     * 设置 功能参数
     * <P>
     * 等同 {@link #setFuncParams}
     * @param funcParams
     */
    @JsonIgnore
    public PSDCMSPlatformFuncDTO funcparams(String funcParams){
        this.setFuncParams(funcParams);
        return this;
    }

    @JsonIgnore
    @Override
    public Object getSrfkey(){
        return this.getPSDCMSPlatformFuncId();
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDCMSPlatformFuncDTO){
            PSDCMSPlatformFuncDTO dto = (PSDCMSPlatformFuncDTO)iEntity;
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