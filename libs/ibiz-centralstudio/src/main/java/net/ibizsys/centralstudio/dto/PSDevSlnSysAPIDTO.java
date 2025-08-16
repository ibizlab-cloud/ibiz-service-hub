package net.ibizsys.centralstudio.dto;

import net.ibizsys.centralstudio.util.CentralEntityDTOBase;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;


public class PSDevSlnSysAPIDTO extends CentralEntityDTOBase{

    /**
     * <B>PSDEVSLNSYSAPIID</B>&nbsp;开发系统服务接口标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVSLNSYSAPIID = "psdevslnsysapiid";

    /**
     * 设置 开发系统服务接口标识
     * 
     * @param pSDevSlnSysAPIId
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNSYSAPIID)
    public void setPSDevSlnSysAPIId(String pSDevSlnSysAPIId){
        this.set(FIELD_PSDEVSLNSYSAPIID, pSDevSlnSysAPIId);
    }
    
    /**
     * 获取 开发系统服务接口标识  
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
     * 判断 开发系统服务接口标识 是否指定值，包括空值
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
     * 重置 开发系统服务接口标识
     */
    @JsonIgnore
    public void resetPSDevSlnSysAPIId(){
        this.reset(FIELD_PSDEVSLNSYSAPIID);
    }

    /**
     * 设置 开发系统服务接口标识
     * <P>
     * 等同 {@link #setPSDevSlnSysAPIId}
     * @param pSDevSlnSysAPIId
     */
    @JsonIgnore
    public PSDevSlnSysAPIDTO psdevslnsysapiid(String pSDevSlnSysAPIId){
        this.setPSDevSlnSysAPIId(pSDevSlnSysAPIId);
        return this;
    }

    /**
     * <B>PSDEVSLNSYSAPINAME</B>&nbsp;开发系统服务接口名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEVSLNSYSAPINAME = "psdevslnsysapiname";

    /**
     * 设置 开发系统服务接口名称
     * 
     * @param pSDevSlnSysAPIName
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNSYSAPINAME)
    public void setPSDevSlnSysAPIName(String pSDevSlnSysAPIName){
        this.set(FIELD_PSDEVSLNSYSAPINAME, pSDevSlnSysAPIName);
    }
    
    /**
     * 获取 开发系统服务接口名称  
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
     * 判断 开发系统服务接口名称 是否指定值，包括空值
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
     * 重置 开发系统服务接口名称
     */
    @JsonIgnore
    public void resetPSDevSlnSysAPIName(){
        this.reset(FIELD_PSDEVSLNSYSAPINAME);
    }

    /**
     * 设置 开发系统服务接口名称
     * <P>
     * 等同 {@link #setPSDevSlnSysAPIName}
     * @param pSDevSlnSysAPIName
     */
    @JsonIgnore
    public PSDevSlnSysAPIDTO psdevslnsysapiname(String pSDevSlnSysAPIName){
        this.setPSDevSlnSysAPIName(pSDevSlnSysAPIName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDevSlnSysAPIName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDevSlnSysAPIName(strName);
    }

    @JsonIgnore
    public PSDevSlnSysAPIDTO name(String strName){
        this.setPSDevSlnSysAPIName(strName);
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
    public PSDevSlnSysAPIDTO createman(String createMan){
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
    public PSDevSlnSysAPIDTO updateman(String updateMan){
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
    public PSDevSlnSysAPIDTO createdate(Timestamp createDate){
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
    public PSDevSlnSysAPIDTO updatedate(Timestamp updateDate){
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
    public PSDevSlnSysAPIDTO orgid(String orgId){
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
    public PSDevSlnSysAPIDTO deptid(String deptId){
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
    public PSDevSlnSysAPIDTO psdevslnsysname(String pSDevSlnSysName){
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
    public PSDevSlnSysAPIDTO psdevslnsysid(String pSDevSlnSysId){
        this.setPSDevSlnSysId(pSDevSlnSysId);
        return this;
    }

    /**
     * <B>VER</B>&nbsp;版本
     */
    public final static String FIELD_VER = "ver";

    /**
     * 设置 版本
     * 
     * @param ver
     * 
     */
    @JsonProperty(FIELD_VER)
    public void setVer(Integer ver){
        this.set(FIELD_VER, ver);
    }
    
    /**
     * 获取 版本  
     * @return
     */
    @JsonIgnore
    public Integer getVer(){
        Object objValue = this.get(FIELD_VER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isVerDirty(){
        if(this.contains(FIELD_VER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 版本
     */
    @JsonIgnore
    public void resetVer(){
        this.reset(FIELD_VER);
    }

    /**
     * 设置 版本
     * <P>
     * 等同 {@link #setVer}
     * @param ver
     */
    @JsonIgnore
    public PSDevSlnSysAPIDTO ver(Integer ver){
        this.setVer(ver);
        return this;
    }

    /**
     * <B>APIMDURL</B>&nbsp;接口MD路径
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_APIMDURL = "apimdurl";

    /**
     * 设置 接口MD路径
     * 
     * @param aPIMDUrl
     * 
     */
    @JsonProperty(FIELD_APIMDURL)
    public void setAPIMDUrl(String aPIMDUrl){
        this.set(FIELD_APIMDURL, aPIMDUrl);
    }
    
    /**
     * 获取 接口MD路径  
     * @return
     */
    @JsonIgnore
    public String getAPIMDUrl(){
        Object objValue = this.get(FIELD_APIMDURL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 接口MD路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAPIMDUrlDirty(){
        if(this.contains(FIELD_APIMDURL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 接口MD路径
     */
    @JsonIgnore
    public void resetAPIMDUrl(){
        this.reset(FIELD_APIMDURL);
    }

    /**
     * 设置 接口MD路径
     * <P>
     * 等同 {@link #setAPIMDUrl}
     * @param aPIMDUrl
     */
    @JsonIgnore
    public PSDevSlnSysAPIDTO apimdurl(String aPIMDUrl){
        this.setAPIMDUrl(aPIMDUrl);
        return this;
    }

    /**
     * <B>APITAG</B>&nbsp;API标记
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_APITAG = "apitag";

    /**
     * 设置 API标记
     * 
     * @param aPITag
     * 
     */
    @JsonProperty(FIELD_APITAG)
    public void setAPITag(String aPITag){
        this.set(FIELD_APITAG, aPITag);
    }
    
    /**
     * 获取 API标记  
     * @return
     */
    @JsonIgnore
    public String getAPITag(){
        Object objValue = this.get(FIELD_APITAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 API标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAPITagDirty(){
        if(this.contains(FIELD_APITAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 API标记
     */
    @JsonIgnore
    public void resetAPITag(){
        this.reset(FIELD_APITAG);
    }

    /**
     * 设置 API标记
     * <P>
     * 等同 {@link #setAPITag}
     * @param aPITag
     */
    @JsonIgnore
    public PSDevSlnSysAPIDTO apitag(String aPITag){
        this.setAPITag(aPITag);
        return this;
    }

    /**
     * <B>CFGMODEL</B>&nbsp;配置模型
     */
    public final static String FIELD_CFGMODEL = "cfgmodel";

    /**
     * 设置 配置模型
     * 
     * @param cfgModel
     * 
     */
    @JsonProperty(FIELD_CFGMODEL)
    public void setCfgModel(String cfgModel){
        this.set(FIELD_CFGMODEL, cfgModel);
    }
    
    /**
     * 获取 配置模型  
     * @return
     */
    @JsonIgnore
    public String getCfgModel(){
        Object objValue = this.get(FIELD_CFGMODEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 配置模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCfgModelDirty(){
        if(this.contains(FIELD_CFGMODEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 配置模型
     */
    @JsonIgnore
    public void resetCfgModel(){
        this.reset(FIELD_CFGMODEL);
    }

    /**
     * 设置 配置模型
     * <P>
     * 等同 {@link #setCfgModel}
     * @param cfgModel
     */
    @JsonIgnore
    public PSDevSlnSysAPIDTO cfgmodel(String cfgModel){
        this.setCfgModel(cfgModel);
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
    public PSDevSlnSysAPIDTO validflag(Integer validFlag){
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
    public PSDevSlnSysAPIDTO validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>PSSYSSERVICEAPIID</B>&nbsp;系统服务接口
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSSERVICEAPIID = "pssysserviceapiid";

    /**
     * 设置 系统服务接口
     * 
     * @param pSSysServiceAPIId
     * 
     */
    @JsonProperty(FIELD_PSSYSSERVICEAPIID)
    public void setPSSysServiceAPIId(String pSSysServiceAPIId){
        this.set(FIELD_PSSYSSERVICEAPIID, pSSysServiceAPIId);
    }
    
    /**
     * 获取 系统服务接口  
     * @return
     */
    @JsonIgnore
    public String getPSSysServiceAPIId(){
        Object objValue = this.get(FIELD_PSSYSSERVICEAPIID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统服务接口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysServiceAPIIdDirty(){
        if(this.contains(FIELD_PSSYSSERVICEAPIID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统服务接口
     */
    @JsonIgnore
    public void resetPSSysServiceAPIId(){
        this.reset(FIELD_PSSYSSERVICEAPIID);
    }

    /**
     * 设置 系统服务接口
     * <P>
     * 等同 {@link #setPSSysServiceAPIId}
     * @param pSSysServiceAPIId
     */
    @JsonIgnore
    public PSDevSlnSysAPIDTO pssysserviceapiid(String pSSysServiceAPIId){
        this.setPSSysServiceAPIId(pSSysServiceAPIId);
        return this;
    }

    /**
     * <B>PSSYSSERVICEAPINAME</B>&nbsp;系统服务接口
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSSERVICEAPINAME = "pssysserviceapiname";

    /**
     * 设置 系统服务接口
     * 
     * @param pSSysServiceAPIName
     * 
     */
    @JsonProperty(FIELD_PSSYSSERVICEAPINAME)
    public void setPSSysServiceAPIName(String pSSysServiceAPIName){
        this.set(FIELD_PSSYSSERVICEAPINAME, pSSysServiceAPIName);
    }
    
    /**
     * 获取 系统服务接口  
     * @return
     */
    @JsonIgnore
    public String getPSSysServiceAPIName(){
        Object objValue = this.get(FIELD_PSSYSSERVICEAPINAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统服务接口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysServiceAPINameDirty(){
        if(this.contains(FIELD_PSSYSSERVICEAPINAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统服务接口
     */
    @JsonIgnore
    public void resetPSSysServiceAPIName(){
        this.reset(FIELD_PSSYSSERVICEAPINAME);
    }

    /**
     * 设置 系统服务接口
     * <P>
     * 等同 {@link #setPSSysServiceAPIName}
     * @param pSSysServiceAPIName
     */
    @JsonIgnore
    public PSDevSlnSysAPIDTO pssysserviceapiname(String pSSysServiceAPIName){
        this.setPSSysServiceAPIName(pSSysServiceAPIName);
        return this;
    }

    /**
     * <B>APITYPE</B>&nbsp;接口类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.ServiceAPIType} 
     */
    public final static String FIELD_APITYPE = "apitype";

    /**
     * 设置 接口类型
     * 
     * @param aPIType
     * 
     */
    @JsonProperty(FIELD_APITYPE)
    public void setAPIType(String aPIType){
        this.set(FIELD_APITYPE, aPIType);
    }
    
    /**
     * 获取 接口类型  
     * @return
     */
    @JsonIgnore
    public String getAPIType(){
        Object objValue = this.get(FIELD_APITYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 接口类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAPITypeDirty(){
        if(this.contains(FIELD_APITYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 接口类型
     */
    @JsonIgnore
    public void resetAPIType(){
        this.reset(FIELD_APITYPE);
    }

    /**
     * 设置 接口类型
     * <P>
     * 等同 {@link #setAPIType}
     * @param aPIType
     */
    @JsonIgnore
    public PSDevSlnSysAPIDTO apitype(String aPIType){
        this.setAPIType(aPIType);
        return this;
    }

     /**
     * 设置 接口类型
     * <P>
     * 等同 {@link #setAPIType}
     * @param aPIType
     */
    @JsonIgnore
    public PSDevSlnSysAPIDTO apitype(net.ibizsys.centralstudio.util.CentralEnums.ServiceAPIType aPIType){
        if(aPIType == null){
            this.setAPIType(null);
        }
        else{
            this.setAPIType(aPIType.value);
        }
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
    public PSDevSlnSysAPIDTO memo(String memo){
        this.setMemo(memo);
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
    public PSDevSlnSysAPIDTO psdevslnid(String pSDevSlnId){
        this.setPSDevSlnId(pSDevSlnId);
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
    public PSDevSlnSysAPIDTO devsysstate(String devSysState){
        this.setDevSysState(devSysState);
        return this;
    }

    @JsonIgnore
    @Override
    public Object getSrfkey(){
        return this.getPSDevSlnSysAPIId();
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDevSlnSysAPIDTO){
            PSDevSlnSysAPIDTO dto = (PSDevSlnSysAPIDTO)iEntity;
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