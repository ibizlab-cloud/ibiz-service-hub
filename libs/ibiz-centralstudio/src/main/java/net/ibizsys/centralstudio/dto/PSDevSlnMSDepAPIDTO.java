package net.ibizsys.centralstudio.dto;

import net.ibizsys.centralstudio.util.CentralEntityDTOBase;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;


public class PSDevSlnMSDepAPIDTO extends CentralEntityDTOBase{

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
    public PSDevSlnMSDepAPIDTO psdevslnmsdeployid(String pSDevSlnMSDeployId){
        this.setPSDevSlnMSDeployId(pSDevSlnMSDeployId);
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
    public PSDevSlnMSDepAPIDTO psdevslnmsdeployname(String pSDevSlnMSDeployName){
        this.setPSDevSlnMSDeployName(pSDevSlnMSDeployName);
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
    public PSDevSlnMSDepAPIDTO psdevcenterdbinstid(String pSDevCenterDBInstId){
        this.setPSDevCenterDBInstId(pSDevCenterDBInstId);
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
    public PSDevSlnMSDepAPIDTO psdevcenterdbinstname(String pSDevCenterDBInstName){
        this.setPSDevCenterDBInstName(pSDevCenterDBInstName);
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
    public PSDevSlnMSDepAPIDTO psdevslnsysname(String pSDevSlnSysName){
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
    public PSDevSlnMSDepAPIDTO psdevslnsysid(String pSDevSlnSysId){
        this.setPSDevSlnSysId(pSDevSlnSysId);
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
    public PSDevSlnMSDepAPIDTO psdevslnid(String pSDevSlnId){
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
    public PSDevSlnMSDepAPIDTO psdevslnname(String pSDevSlnName){
        this.setPSDevSlnName(pSDevSlnName);
        return this;
    }

    /**
     * <B>PSDEVSLNMSDEPAPIID</B>&nbsp;开发方案微服务服务部署标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVSLNMSDEPAPIID = "psdevslnmsdepapiid";

    /**
     * 设置 开发方案微服务服务部署标识
     * 
     * @param pSDevSlnMSDepAPIId
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNMSDEPAPIID)
    public void setPSDevSlnMSDepAPIId(String pSDevSlnMSDepAPIId){
        this.set(FIELD_PSDEVSLNMSDEPAPIID, pSDevSlnMSDepAPIId);
    }
    
    /**
     * 获取 开发方案微服务服务部署标识  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnMSDepAPIId(){
        Object objValue = this.get(FIELD_PSDEVSLNMSDEPAPIID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发方案微服务服务部署标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnMSDepAPIIdDirty(){
        if(this.contains(FIELD_PSDEVSLNMSDEPAPIID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发方案微服务服务部署标识
     */
    @JsonIgnore
    public void resetPSDevSlnMSDepAPIId(){
        this.reset(FIELD_PSDEVSLNMSDEPAPIID);
    }

    /**
     * 设置 开发方案微服务服务部署标识
     * <P>
     * 等同 {@link #setPSDevSlnMSDepAPIId}
     * @param pSDevSlnMSDepAPIId
     */
    @JsonIgnore
    public PSDevSlnMSDepAPIDTO psdevslnmsdepapiid(String pSDevSlnMSDepAPIId){
        this.setPSDevSlnMSDepAPIId(pSDevSlnMSDepAPIId);
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
    public PSDevSlnMSDepAPIDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
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
    public PSDevSlnMSDepAPIDTO createman(String createMan){
        this.setCreateMan(createMan);
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
    public PSDevSlnMSDepAPIDTO createdate(Timestamp createDate){
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
    public PSDevSlnMSDepAPIDTO updatedate(Timestamp updateDate){
        this.setUpdateDate(updateDate);
        return this;
    }

    /**
     * <B>PSDEVSLNMSDEPAPINAME</B>&nbsp;部署名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEVSLNMSDEPAPINAME = "psdevslnmsdepapiname";

    /**
     * 设置 部署名称
     * 
     * @param pSDevSlnMSDepAPIName
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNMSDEPAPINAME)
    public void setPSDevSlnMSDepAPIName(String pSDevSlnMSDepAPIName){
        this.set(FIELD_PSDEVSLNMSDEPAPINAME, pSDevSlnMSDepAPIName);
    }
    
    /**
     * 获取 部署名称  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnMSDepAPIName(){
        Object objValue = this.get(FIELD_PSDEVSLNMSDEPAPINAME);
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
    public boolean isPSDevSlnMSDepAPINameDirty(){
        if(this.contains(FIELD_PSDEVSLNMSDEPAPINAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部署名称
     */
    @JsonIgnore
    public void resetPSDevSlnMSDepAPIName(){
        this.reset(FIELD_PSDEVSLNMSDEPAPINAME);
    }

    /**
     * 设置 部署名称
     * <P>
     * 等同 {@link #setPSDevSlnMSDepAPIName}
     * @param pSDevSlnMSDepAPIName
     */
    @JsonIgnore
    public PSDevSlnMSDepAPIDTO psdevslnmsdepapiname(String pSDevSlnMSDepAPIName){
        this.setPSDevSlnMSDepAPIName(pSDevSlnMSDepAPIName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDevSlnMSDepAPIName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDevSlnMSDepAPIName(strName);
    }

    @JsonIgnore
    public PSDevSlnMSDepAPIDTO name(String strName){
        this.setPSDevSlnMSDepAPIName(strName);
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
    public PSDevSlnMSDepAPIDTO httpsport(Integer httpsPort){
        this.setHttpsPort(httpsPort);
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
    public PSDevSlnMSDepAPIDTO httpport(Integer httpPort){
        this.setHttpPort(httpPort);
        return this;
    }

    /**
     * <B>AUTHCHECKTOKENURI</B>&nbsp;认证token路径
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_AUTHCHECKTOKENURI = "authchecktokenuri";

    /**
     * 设置 认证token路径
     * 
     * @param authCheckTokenUri
     * 
     */
    @JsonProperty(FIELD_AUTHCHECKTOKENURI)
    public void setAuthCheckTokenUri(String authCheckTokenUri){
        this.set(FIELD_AUTHCHECKTOKENURI, authCheckTokenUri);
    }
    
    /**
     * 获取 认证token路径  
     * @return
     */
    @JsonIgnore
    public String getAuthCheckTokenUri(){
        Object objValue = this.get(FIELD_AUTHCHECKTOKENURI);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 认证token路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAuthCheckTokenUriDirty(){
        if(this.contains(FIELD_AUTHCHECKTOKENURI)){
            return true;
        }
        return false;
    }

    /**
     * 重置 认证token路径
     */
    @JsonIgnore
    public void resetAuthCheckTokenUri(){
        this.reset(FIELD_AUTHCHECKTOKENURI);
    }

    /**
     * 设置 认证token路径
     * <P>
     * 等同 {@link #setAuthCheckTokenUri}
     * @param authCheckTokenUri
     */
    @JsonIgnore
    public PSDevSlnMSDepAPIDTO authchecktokenuri(String authCheckTokenUri){
        this.setAuthCheckTokenUri(authCheckTokenUri);
        return this;
    }

    /**
     * <B>AUTHCLIENTSECRET</B>&nbsp;认证客户端密钥
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_AUTHCLIENTSECRET = "authclientsecret";

    /**
     * 设置 认证客户端密钥
     * 
     * @param authClientSecret
     * 
     */
    @JsonProperty(FIELD_AUTHCLIENTSECRET)
    public void setAuthClientSecret(String authClientSecret){
        this.set(FIELD_AUTHCLIENTSECRET, authClientSecret);
    }
    
    /**
     * 获取 认证客户端密钥  
     * @return
     */
    @JsonIgnore
    public String getAuthClientSecret(){
        Object objValue = this.get(FIELD_AUTHCLIENTSECRET);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 认证客户端密钥 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAuthClientSecretDirty(){
        if(this.contains(FIELD_AUTHCLIENTSECRET)){
            return true;
        }
        return false;
    }

    /**
     * 重置 认证客户端密钥
     */
    @JsonIgnore
    public void resetAuthClientSecret(){
        this.reset(FIELD_AUTHCLIENTSECRET);
    }

    /**
     * 设置 认证客户端密钥
     * <P>
     * 等同 {@link #setAuthClientSecret}
     * @param authClientSecret
     */
    @JsonIgnore
    public PSDevSlnMSDepAPIDTO authclientsecret(String authClientSecret){
        this.setAuthClientSecret(authClientSecret);
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
    public PSDevSlnMSDepAPIDTO httpaddress(String httpAddress){
        this.setHttpAddress(httpAddress);
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
    public PSDevSlnMSDepAPIDTO memo(String memo){
        this.setMemo(memo);
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
    public PSDevSlnMSDepAPIDTO validflag(Integer validFlag){
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
    public PSDevSlnMSDepAPIDTO validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>AUTHCLIENTID</B>&nbsp;认证客户端标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_AUTHCLIENTID = "authclientid";

    /**
     * 设置 认证客户端标识
     * 
     * @param authClientId
     * 
     */
    @JsonProperty(FIELD_AUTHCLIENTID)
    public void setAuthClientId(String authClientId){
        this.set(FIELD_AUTHCLIENTID, authClientId);
    }
    
    /**
     * 获取 认证客户端标识  
     * @return
     */
    @JsonIgnore
    public String getAuthClientId(){
        Object objValue = this.get(FIELD_AUTHCLIENTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 认证客户端标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAuthClientIdDirty(){
        if(this.contains(FIELD_AUTHCLIENTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 认证客户端标识
     */
    @JsonIgnore
    public void resetAuthClientId(){
        this.reset(FIELD_AUTHCLIENTID);
    }

    /**
     * 设置 认证客户端标识
     * <P>
     * 等同 {@link #setAuthClientId}
     * @param authClientId
     */
    @JsonIgnore
    public PSDevSlnMSDepAPIDTO authclientid(String authClientId){
        this.setAuthClientId(authClientId);
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
    public PSDevSlnMSDepAPIDTO userparams(String userParams){
        this.setUserParams(userParams);
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
    public PSDevSlnMSDepAPIDTO psdcmsplatformid(String pSDCMSPlatformId){
        this.setPSDCMSPlatformId(pSDCMSPlatformId);
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
    public PSDevSlnMSDepAPIDTO psdcmsplatformnodename(String pSDCMSPlatformNodeName){
        this.setPSDCMSPlatformNodeName(pSDCMSPlatformNodeName);
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
    public PSDevSlnMSDepAPIDTO psdcmsplatformnodeid(String pSDCMSPlatformNodeId){
        this.setPSDCMSPlatformNodeId(pSDCMSPlatformNodeId);
        return this;
    }

    /**
     * <B>PSDEVSLNSYSAPINAME</B>&nbsp;服务接口
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVSLNSYSAPIID}
     */
    public final static String FIELD_PSDEVSLNSYSAPINAME = "psdevslnsysapiname";

    /**
     * 设置 服务接口
     * 
     * @param pSDevSlnSysAPIName
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNSYSAPINAME)
    public void setPSDevSlnSysAPIName(String pSDevSlnSysAPIName){
        this.set(FIELD_PSDEVSLNSYSAPINAME, pSDevSlnSysAPIName);
    }
    
    /**
     * 获取 服务接口  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnSysAPIName(){
        Object objValue = this.get(FIELD_PSDEVSLNSYSAPINAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 服务接口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnSysAPINameDirty(){
        if(this.contains(FIELD_PSDEVSLNSYSAPINAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务接口
     */
    @JsonIgnore
    public void resetPSDevSlnSysAPIName(){
        this.reset(FIELD_PSDEVSLNSYSAPINAME);
    }

    /**
     * 设置 服务接口
     * <P>
     * 等同 {@link #setPSDevSlnSysAPIName}
     * @param pSDevSlnSysAPIName
     */
    @JsonIgnore
    public PSDevSlnMSDepAPIDTO psdevslnsysapiname(String pSDevSlnSysAPIName){
        this.setPSDevSlnSysAPIName(pSDevSlnSysAPIName);
        return this;
    }

    /**
     * <B>PSDEVSLNSYSAPIID</B>&nbsp;开发系统服务接口
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVSLNSYSAPIID = "psdevslnsysapiid";

    /**
     * 设置 开发系统服务接口
     * 
     * @param pSDevSlnSysAPIId
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNSYSAPIID)
    public void setPSDevSlnSysAPIId(String pSDevSlnSysAPIId){
        this.set(FIELD_PSDEVSLNSYSAPIID, pSDevSlnSysAPIId);
    }
    
    /**
     * 获取 开发系统服务接口  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnSysAPIId(){
        Object objValue = this.get(FIELD_PSDEVSLNSYSAPIID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发系统服务接口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnSysAPIIdDirty(){
        if(this.contains(FIELD_PSDEVSLNSYSAPIID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发系统服务接口
     */
    @JsonIgnore
    public void resetPSDevSlnSysAPIId(){
        this.reset(FIELD_PSDEVSLNSYSAPIID);
    }

    /**
     * 设置 开发系统服务接口
     * <P>
     * 等同 {@link #setPSDevSlnSysAPIId}
     * @param pSDevSlnSysAPIId
     */
    @JsonIgnore
    public PSDevSlnMSDepAPIDTO psdevslnsysapiid(String pSDevSlnSysAPIId){
        this.setPSDevSlnSysAPIId(pSDevSlnSysAPIId);
        return this;
    }

    /**
     * <B>AUTHMODE</B>&nbsp;认证模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.APIAuthMode} 
     */
    public final static String FIELD_AUTHMODE = "authmode";

    /**
     * 设置 认证模式
     * 
     * @param authMode
     * 
     */
    @JsonProperty(FIELD_AUTHMODE)
    public void setAuthMode(String authMode){
        this.set(FIELD_AUTHMODE, authMode);
    }
    
    /**
     * 获取 认证模式  
     * @return
     */
    @JsonIgnore
    public String getAuthMode(){
        Object objValue = this.get(FIELD_AUTHMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 认证模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAuthModeDirty(){
        if(this.contains(FIELD_AUTHMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 认证模式
     */
    @JsonIgnore
    public void resetAuthMode(){
        this.reset(FIELD_AUTHMODE);
    }

    /**
     * 设置 认证模式
     * <P>
     * 等同 {@link #setAuthMode}
     * @param authMode
     */
    @JsonIgnore
    public PSDevSlnMSDepAPIDTO authmode(String authMode){
        this.setAuthMode(authMode);
        return this;
    }

     /**
     * 设置 认证模式
     * <P>
     * 等同 {@link #setAuthMode}
     * @param authMode
     */
    @JsonIgnore
    public PSDevSlnMSDepAPIDTO authmode(net.ibizsys.centralstudio.util.CentralEnums.APIAuthMode authMode){
        if(authMode == null){
            this.setAuthMode(null);
        }
        else{
            this.setAuthMode(authMode.value);
        }
        return this;
    }

    /**
     * <B>DEPLOYSTATE</B>&nbsp;部署状态
     */
    public final static String FIELD_DEPLOYSTATE = "deploystate";

    /**
     * 设置 部署状态
     * 
     * @param deployState
     * 
     */
    @JsonProperty(FIELD_DEPLOYSTATE)
    public void setDeployState(Integer deployState){
        this.set(FIELD_DEPLOYSTATE, deployState);
    }
    
    /**
     * 获取 部署状态  
     * @return
     */
    @JsonIgnore
    public Integer getDeployState(){
        Object objValue = this.get(FIELD_DEPLOYSTATE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 部署状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDeployStateDirty(){
        if(this.contains(FIELD_DEPLOYSTATE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部署状态
     */
    @JsonIgnore
    public void resetDeployState(){
        this.reset(FIELD_DEPLOYSTATE);
    }

    /**
     * 设置 部署状态
     * <P>
     * 等同 {@link #setDeployState}
     * @param deployState
     */
    @JsonIgnore
    public PSDevSlnMSDepAPIDTO deploystate(Integer deployState){
        this.setDeployState(deployState);
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
    public PSDevSlnMSDepAPIDTO psdcregistryitemname(String pSDCRegistryItemName){
        this.setPSDCRegistryItemName(pSDCRegistryItemName);
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
    public PSDevSlnMSDepAPIDTO psdcregistryitemid(String pSDCRegistryItemId){
        this.setPSDCRegistryItemId(pSDCRegistryItemId);
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
    public PSDevSlnMSDepAPIDTO nodeipaddr(String nodeIPAddr){
        this.setNodeIPAddr(nodeIPAddr);
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
    public PSDevSlnMSDepAPIDTO nodeport(Integer nodePort){
        this.setNodePort(nodePort);
        return this;
    }

    @JsonIgnore
    @Override
    public Object getSrfkey(){
        return this.getPSDevSlnMSDepAPIId();
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDevSlnMSDepAPIDTO){
            PSDevSlnMSDepAPIDTO dto = (PSDevSlnMSDepAPIDTO)iEntity;
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