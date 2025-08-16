package net.ibizsys.centralstudio.dto;

import net.ibizsys.centralstudio.util.CentralEntityDTOBase;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;


public class PSDevSlnSysDTO extends CentralEntityDTOBase{

    /**
     * <B>PSDEVSLNSYSID</B>&nbsp;开发系统标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVSLNSYSID = "psdevslnsysid";

    /**
     * 设置 开发系统标识
     * 
     * @param pSDevSlnSysId
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNSYSID)
    public void setPSDevSlnSysId(String pSDevSlnSysId){
        this.set(FIELD_PSDEVSLNSYSID, pSDevSlnSysId);
    }
    
    /**
     * 获取 开发系统标识  
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
     * 判断 开发系统标识 是否指定值，包括空值
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
     * 重置 开发系统标识
     */
    @JsonIgnore
    public void resetPSDevSlnSysId(){
        this.reset(FIELD_PSDEVSLNSYSID);
    }

    /**
     * 设置 开发系统标识
     * <P>
     * 等同 {@link #setPSDevSlnSysId}
     * @param pSDevSlnSysId
     */
    @JsonIgnore
    public PSDevSlnSysDTO psdevslnsysid(String pSDevSlnSysId){
        this.setPSDevSlnSysId(pSDevSlnSysId);
        return this;
    }

    /**
     * <B>PSDEVSLNSYSNAME</B>&nbsp;系统标识
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEVSLNSYSNAME = "psdevslnsysname";

    /**
     * 设置 系统标识
     * 
     * @param pSDevSlnSysName
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNSYSNAME)
    public void setPSDevSlnSysName(String pSDevSlnSysName){
        this.set(FIELD_PSDEVSLNSYSNAME, pSDevSlnSysName);
    }
    
    /**
     * 获取 系统标识  
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
     * 判断 系统标识 是否指定值，包括空值
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
     * 重置 系统标识
     */
    @JsonIgnore
    public void resetPSDevSlnSysName(){
        this.reset(FIELD_PSDEVSLNSYSNAME);
    }

    /**
     * 设置 系统标识
     * <P>
     * 等同 {@link #setPSDevSlnSysName}
     * @param pSDevSlnSysName
     */
    @JsonIgnore
    public PSDevSlnSysDTO psdevslnsysname(String pSDevSlnSysName){
        this.setPSDevSlnSysName(pSDevSlnSysName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDevSlnSysName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDevSlnSysName(strName);
    }

    @JsonIgnore
    public PSDevSlnSysDTO name(String strName){
        this.setPSDevSlnSysName(strName);
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
    public PSDevSlnSysDTO createdate(Timestamp createDate){
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
    public PSDevSlnSysDTO updatedate(Timestamp updateDate){
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
    public PSDevSlnSysDTO createman(String createMan){
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
    public PSDevSlnSysDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>PSDEVSLNID</B>&nbsp;开放方案
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVSLNID = "psdevslnid";

    /**
     * 设置 开放方案
     * 
     * @param pSDevSlnId
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNID)
    public void setPSDevSlnId(String pSDevSlnId){
        this.set(FIELD_PSDEVSLNID, pSDevSlnId);
    }
    
    /**
     * 获取 开放方案  
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
     * 判断 开放方案 是否指定值，包括空值
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
     * 重置 开放方案
     */
    @JsonIgnore
    public void resetPSDevSlnId(){
        this.reset(FIELD_PSDEVSLNID);
    }

    /**
     * 设置 开放方案
     * <P>
     * 等同 {@link #setPSDevSlnId}
     * @param pSDevSlnId
     */
    @JsonIgnore
    public PSDevSlnSysDTO psdevslnid(String pSDevSlnId){
        this.setPSDevSlnId(pSDevSlnId);
        return this;
    }

    /**
     * <B>PSDEVSLNNAME</B>&nbsp;解决方案
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVSLNID}
     */
    public final static String FIELD_PSDEVSLNNAME = "psdevslnname";

    /**
     * 设置 解决方案
     * 
     * @param pSDevSlnName
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNNAME)
    public void setPSDevSlnName(String pSDevSlnName){
        this.set(FIELD_PSDEVSLNNAME, pSDevSlnName);
    }
    
    /**
     * 获取 解决方案  
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
     * 判断 解决方案 是否指定值，包括空值
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
     * 重置 解决方案
     */
    @JsonIgnore
    public void resetPSDevSlnName(){
        this.reset(FIELD_PSDEVSLNNAME);
    }

    /**
     * 设置 解决方案
     * <P>
     * 等同 {@link #setPSDevSlnName}
     * @param pSDevSlnName
     */
    @JsonIgnore
    public PSDevSlnSysDTO psdevslnname(String pSDevSlnName){
        this.setPSDevSlnName(pSDevSlnName);
        return this;
    }

    /**
     * <B>PSSYSMODELINSTNAME</B>&nbsp;系统模型实例
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSMODELINSTID}
     */
    public final static String FIELD_PSSYSMODELINSTNAME = "pssysmodelinstname";

    /**
     * 设置 系统模型实例
     * 
     * @param pSSysModelInstName
     * 
     */
    @JsonProperty(FIELD_PSSYSMODELINSTNAME)
    public void setPSSysModelInstName(String pSSysModelInstName){
        this.set(FIELD_PSSYSMODELINSTNAME, pSSysModelInstName);
    }
    
    /**
     * 获取 系统模型实例  
     * @return
     */
    @JsonIgnore
    public String getPSSysModelInstName(){
        Object objValue = this.get(FIELD_PSSYSMODELINSTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统模型实例 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysModelInstNameDirty(){
        if(this.contains(FIELD_PSSYSMODELINSTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统模型实例
     */
    @JsonIgnore
    public void resetPSSysModelInstName(){
        this.reset(FIELD_PSSYSMODELINSTNAME);
    }

    /**
     * 设置 系统模型实例
     * <P>
     * 等同 {@link #setPSSysModelInstName}
     * @param pSSysModelInstName
     */
    @JsonIgnore
    public PSDevSlnSysDTO pssysmodelinstname(String pSSysModelInstName){
        this.setPSSysModelInstName(pSSysModelInstName);
        return this;
    }

    /**
     * <B>PSSYSMODELINSTID</B>&nbsp;系统模型实例
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSMODELINSTID = "pssysmodelinstid";

    /**
     * 设置 系统模型实例
     * 
     * @param pSSysModelInstId
     * 
     */
    @JsonProperty(FIELD_PSSYSMODELINSTID)
    public void setPSSysModelInstId(String pSSysModelInstId){
        this.set(FIELD_PSSYSMODELINSTID, pSSysModelInstId);
    }
    
    /**
     * 获取 系统模型实例  
     * @return
     */
    @JsonIgnore
    public String getPSSysModelInstId(){
        Object objValue = this.get(FIELD_PSSYSMODELINSTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统模型实例 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysModelInstIdDirty(){
        if(this.contains(FIELD_PSSYSMODELINSTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统模型实例
     */
    @JsonIgnore
    public void resetPSSysModelInstId(){
        this.reset(FIELD_PSSYSMODELINSTID);
    }

    /**
     * 设置 系统模型实例
     * <P>
     * 等同 {@link #setPSSysModelInstId}
     * @param pSSysModelInstId
     */
    @JsonIgnore
    public PSDevSlnSysDTO pssysmodelinstid(String pSSysModelInstId){
        this.setPSSysModelInstId(pSSysModelInstId);
        return this;
    }

    /**
     * <B>PSDEVCENTERID</B>&nbsp;应用中心标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVCENTERID = "psdevcenterid";

    /**
     * 设置 应用中心标识
     * 
     * @param pSDevCenterId
     * 
     */
    @JsonProperty(FIELD_PSDEVCENTERID)
    public void setPSDevCenterId(String pSDevCenterId){
        this.set(FIELD_PSDEVCENTERID, pSDevCenterId);
    }
    
    /**
     * 获取 应用中心标识  
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
     * 判断 应用中心标识 是否指定值，包括空值
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
     * 重置 应用中心标识
     */
    @JsonIgnore
    public void resetPSDevCenterId(){
        this.reset(FIELD_PSDEVCENTERID);
    }

    /**
     * 设置 应用中心标识
     * <P>
     * 等同 {@link #setPSDevCenterId}
     * @param pSDevCenterId
     */
    @JsonIgnore
    public PSDevSlnSysDTO psdevcenterid(String pSDevCenterId){
        this.setPSDevCenterId(pSDevCenterId);
        return this;
    }

    /**
     * <B>PSDEVCENTERNAME</B>&nbsp;应用中心名称
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVCENTERID}
     */
    public final static String FIELD_PSDEVCENTERNAME = "psdevcentername";

    /**
     * 设置 应用中心名称
     * 
     * @param pSDevCenterName
     * 
     */
    @JsonProperty(FIELD_PSDEVCENTERNAME)
    public void setPSDevCenterName(String pSDevCenterName){
        this.set(FIELD_PSDEVCENTERNAME, pSDevCenterName);
    }
    
    /**
     * 获取 应用中心名称  
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
     * 判断 应用中心名称 是否指定值，包括空值
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
     * 重置 应用中心名称
     */
    @JsonIgnore
    public void resetPSDevCenterName(){
        this.reset(FIELD_PSDEVCENTERNAME);
    }

    /**
     * 设置 应用中心名称
     * <P>
     * 等同 {@link #setPSDevCenterName}
     * @param pSDevCenterName
     */
    @JsonIgnore
    public PSDevSlnSysDTO psdevcentername(String pSDevCenterName){
        this.setPSDevCenterName(pSDevCenterName);
        return this;
    }

    /**
     * <B>CONNSTR</B>&nbsp;连接串
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSMODELINSTID}
     */
    public final static String FIELD_CONNSTR = "connstr";

    /**
     * 设置 连接串
     * 
     * @param connStr
     * 
     */
    @JsonProperty(FIELD_CONNSTR)
    public void setConnStr(String connStr){
        this.set(FIELD_CONNSTR, connStr);
    }
    
    /**
     * 获取 连接串  
     * @return
     */
    @JsonIgnore
    public String getConnStr(){
        Object objValue = this.get(FIELD_CONNSTR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 连接串 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isConnStrDirty(){
        if(this.contains(FIELD_CONNSTR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 连接串
     */
    @JsonIgnore
    public void resetConnStr(){
        this.reset(FIELD_CONNSTR);
    }

    /**
     * 设置 连接串
     * <P>
     * 等同 {@link #setConnStr}
     * @param connStr
     */
    @JsonIgnore
    public PSDevSlnSysDTO connstr(String connStr){
        this.setConnStr(connStr);
        return this;
    }

    /**
     * <B>SYSTYPE</B>&nbsp;系统类型
     * <P>
     * 字符串：最大长度 20
     */
    public final static String FIELD_SYSTYPE = "systype";

    /**
     * 设置 系统类型
     * 
     * @param sysType
     * 
     */
    @JsonProperty(FIELD_SYSTYPE)
    public void setSysType(String sysType){
        this.set(FIELD_SYSTYPE, sysType);
    }
    
    /**
     * 获取 系统类型  
     * @return
     */
    @JsonIgnore
    public String getSysType(){
        Object objValue = this.get(FIELD_SYSTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSysTypeDirty(){
        if(this.contains(FIELD_SYSTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统类型
     */
    @JsonIgnore
    public void resetSysType(){
        this.reset(FIELD_SYSTYPE);
    }

    /**
     * 设置 系统类型
     * <P>
     * 等同 {@link #setSysType}
     * @param sysType
     */
    @JsonIgnore
    public PSDevSlnSysDTO systype(String sysType){
        this.setSysType(sysType);
        return this;
    }

    /**
     * <B>DBNAME</B>&nbsp;数据库名称
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSMODELINSTID}
     */
    public final static String FIELD_DBNAME = "dbname";

    /**
     * 设置 数据库名称
     * 
     * @param dBName
     * 
     */
    @JsonProperty(FIELD_DBNAME)
    public void setDBName(String dBName){
        this.set(FIELD_DBNAME, dBName);
    }
    
    /**
     * 获取 数据库名称  
     * @return
     */
    @JsonIgnore
    public String getDBName(){
        Object objValue = this.get(FIELD_DBNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据库名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDBNameDirty(){
        if(this.contains(FIELD_DBNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据库名称
     */
    @JsonIgnore
    public void resetDBName(){
        this.reset(FIELD_DBNAME);
    }

    /**
     * 设置 数据库名称
     * <P>
     * 等同 {@link #setDBName}
     * @param dBName
     */
    @JsonIgnore
    public PSDevSlnSysDTO dbname(String dBName){
        this.setDBName(dBName);
        return this;
    }

    /**
     * <B>PSDEVCENTERDBINSTID</B>&nbsp;应用中心数据库实例标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVCENTERDBINSTID = "psdevcenterdbinstid";

    /**
     * 设置 应用中心数据库实例标识
     * 
     * @param pSDevCenterDBInstId
     * 
     */
    @JsonProperty(FIELD_PSDEVCENTERDBINSTID)
    public void setPSDevCenterDBInstId(String pSDevCenterDBInstId){
        this.set(FIELD_PSDEVCENTERDBINSTID, pSDevCenterDBInstId);
    }
    
    /**
     * 获取 应用中心数据库实例标识  
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
     * 判断 应用中心数据库实例标识 是否指定值，包括空值
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
     * 重置 应用中心数据库实例标识
     */
    @JsonIgnore
    public void resetPSDevCenterDBInstId(){
        this.reset(FIELD_PSDEVCENTERDBINSTID);
    }

    /**
     * 设置 应用中心数据库实例标识
     * <P>
     * 等同 {@link #setPSDevCenterDBInstId}
     * @param pSDevCenterDBInstId
     */
    @JsonIgnore
    public PSDevSlnSysDTO psdevcenterdbinstid(String pSDevCenterDBInstId){
        this.setPSDevCenterDBInstId(pSDevCenterDBInstId);
        return this;
    }

    /**
     * <B>PSDEVCENTERDBINSTNAME</B>&nbsp;应用中心数据库实例名称
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVCENTERDBINSTID}
     */
    public final static String FIELD_PSDEVCENTERDBINSTNAME = "psdevcenterdbinstname";

    /**
     * 设置 应用中心数据库实例名称
     * 
     * @param pSDevCenterDBInstName
     * 
     */
    @JsonProperty(FIELD_PSDEVCENTERDBINSTNAME)
    public void setPSDevCenterDBInstName(String pSDevCenterDBInstName){
        this.set(FIELD_PSDEVCENTERDBINSTNAME, pSDevCenterDBInstName);
    }
    
    /**
     * 获取 应用中心数据库实例名称  
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
     * 判断 应用中心数据库实例名称 是否指定值，包括空值
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
     * 重置 应用中心数据库实例名称
     */
    @JsonIgnore
    public void resetPSDevCenterDBInstName(){
        this.reset(FIELD_PSDEVCENTERDBINSTNAME);
    }

    /**
     * 设置 应用中心数据库实例名称
     * <P>
     * 等同 {@link #setPSDevCenterDBInstName}
     * @param pSDevCenterDBInstName
     */
    @JsonIgnore
    public PSDevSlnSysDTO psdevcenterdbinstname(String pSDevCenterDBInstName){
        this.setPSDevCenterDBInstName(pSDevCenterDBInstName);
        return this;
    }

    /**
     * <B>MYSQLPSDCDBINSTID</B>&nbsp;MySQL实例
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_MYSQLPSDCDBINSTID = "mysqlpsdcdbinstid";

    /**
     * 设置 MySQL实例
     * 
     * @param mySQLPSDCDBInstId
     * 
     */
    @JsonProperty(FIELD_MYSQLPSDCDBINSTID)
    public void setMySQLPSDCDBInstId(String mySQLPSDCDBInstId){
        this.set(FIELD_MYSQLPSDCDBINSTID, mySQLPSDCDBInstId);
    }
    
    /**
     * 获取 MySQL实例  
     * @return
     */
    @JsonIgnore
    public String getMySQLPSDCDBInstId(){
        Object objValue = this.get(FIELD_MYSQLPSDCDBINSTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 MySQL实例 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMySQLPSDCDBInstIdDirty(){
        if(this.contains(FIELD_MYSQLPSDCDBINSTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 MySQL实例
     */
    @JsonIgnore
    public void resetMySQLPSDCDBInstId(){
        this.reset(FIELD_MYSQLPSDCDBINSTID);
    }

    /**
     * 设置 MySQL实例
     * <P>
     * 等同 {@link #setMySQLPSDCDBInstId}
     * @param mySQLPSDCDBInstId
     */
    @JsonIgnore
    public PSDevSlnSysDTO mysqlpsdcdbinstid(String mySQLPSDCDBInstId){
        this.setMySQLPSDCDBInstId(mySQLPSDCDBInstId);
        return this;
    }

    /**
     * <B>MSSQLPSDCDBINSTNAME</B>&nbsp;SqlServer实例
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MSSQLPSDCDBINSTID}
     */
    public final static String FIELD_MSSQLPSDCDBINSTNAME = "mssqlpsdcdbinstname";

    /**
     * 设置 SqlServer实例
     * 
     * @param mSSQLPSDCDBInstName
     * 
     */
    @JsonProperty(FIELD_MSSQLPSDCDBINSTNAME)
    public void setMSSQLPSDCDBInstName(String mSSQLPSDCDBInstName){
        this.set(FIELD_MSSQLPSDCDBINSTNAME, mSSQLPSDCDBInstName);
    }
    
    /**
     * 获取 SqlServer实例  
     * @return
     */
    @JsonIgnore
    public String getMSSQLPSDCDBInstName(){
        Object objValue = this.get(FIELD_MSSQLPSDCDBINSTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 SqlServer实例 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMSSQLPSDCDBInstNameDirty(){
        if(this.contains(FIELD_MSSQLPSDCDBINSTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 SqlServer实例
     */
    @JsonIgnore
    public void resetMSSQLPSDCDBInstName(){
        this.reset(FIELD_MSSQLPSDCDBINSTNAME);
    }

    /**
     * 设置 SqlServer实例
     * <P>
     * 等同 {@link #setMSSQLPSDCDBInstName}
     * @param mSSQLPSDCDBInstName
     */
    @JsonIgnore
    public PSDevSlnSysDTO mssqlpsdcdbinstname(String mSSQLPSDCDBInstName){
        this.setMSSQLPSDCDBInstName(mSSQLPSDCDBInstName);
        return this;
    }

    /**
     * <B>MYSQLPSDCDBINSTNAME</B>&nbsp;MySQL实例
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MYSQLPSDCDBINSTID}
     */
    public final static String FIELD_MYSQLPSDCDBINSTNAME = "mysqlpsdcdbinstname";

    /**
     * 设置 MySQL实例
     * 
     * @param mySQLPSDCDBInstName
     * 
     */
    @JsonProperty(FIELD_MYSQLPSDCDBINSTNAME)
    public void setMySQLPSDCDBInstName(String mySQLPSDCDBInstName){
        this.set(FIELD_MYSQLPSDCDBINSTNAME, mySQLPSDCDBInstName);
    }
    
    /**
     * 获取 MySQL实例  
     * @return
     */
    @JsonIgnore
    public String getMySQLPSDCDBInstName(){
        Object objValue = this.get(FIELD_MYSQLPSDCDBINSTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 MySQL实例 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMySQLPSDCDBInstNameDirty(){
        if(this.contains(FIELD_MYSQLPSDCDBINSTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 MySQL实例
     */
    @JsonIgnore
    public void resetMySQLPSDCDBInstName(){
        this.reset(FIELD_MYSQLPSDCDBINSTNAME);
    }

    /**
     * 设置 MySQL实例
     * <P>
     * 等同 {@link #setMySQLPSDCDBInstName}
     * @param mySQLPSDCDBInstName
     */
    @JsonIgnore
    public PSDevSlnSysDTO mysqlpsdcdbinstname(String mySQLPSDCDBInstName){
        this.setMySQLPSDCDBInstName(mySQLPSDCDBInstName);
        return this;
    }

    /**
     * <B>PGSQLPSDCDBINSTID</B>&nbsp;PostgreSQL实例
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PGSQLPSDCDBINSTID = "pgsqlpsdcdbinstid";

    /**
     * 设置 PostgreSQL实例
     * 
     * @param pGSQLPSDCDBInstId
     * 
     */
    @JsonProperty(FIELD_PGSQLPSDCDBINSTID)
    public void setPGSQLPSDCDBInstId(String pGSQLPSDCDBInstId){
        this.set(FIELD_PGSQLPSDCDBINSTID, pGSQLPSDCDBInstId);
    }
    
    /**
     * 获取 PostgreSQL实例  
     * @return
     */
    @JsonIgnore
    public String getPGSQLPSDCDBInstId(){
        Object objValue = this.get(FIELD_PGSQLPSDCDBINSTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 PostgreSQL实例 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPGSQLPSDCDBInstIdDirty(){
        if(this.contains(FIELD_PGSQLPSDCDBINSTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 PostgreSQL实例
     */
    @JsonIgnore
    public void resetPGSQLPSDCDBInstId(){
        this.reset(FIELD_PGSQLPSDCDBINSTID);
    }

    /**
     * 设置 PostgreSQL实例
     * <P>
     * 等同 {@link #setPGSQLPSDCDBInstId}
     * @param pGSQLPSDCDBInstId
     */
    @JsonIgnore
    public PSDevSlnSysDTO pgsqlpsdcdbinstid(String pGSQLPSDCDBInstId){
        this.setPGSQLPSDCDBInstId(pGSQLPSDCDBInstId);
        return this;
    }

    /**
     * <B>MSSQLPSDCDBINSTID</B>&nbsp;SqlServer实例
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_MSSQLPSDCDBINSTID = "mssqlpsdcdbinstid";

    /**
     * 设置 SqlServer实例
     * 
     * @param mSSQLPSDCDBInstId
     * 
     */
    @JsonProperty(FIELD_MSSQLPSDCDBINSTID)
    public void setMSSQLPSDCDBInstId(String mSSQLPSDCDBInstId){
        this.set(FIELD_MSSQLPSDCDBINSTID, mSSQLPSDCDBInstId);
    }
    
    /**
     * 获取 SqlServer实例  
     * @return
     */
    @JsonIgnore
    public String getMSSQLPSDCDBInstId(){
        Object objValue = this.get(FIELD_MSSQLPSDCDBINSTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 SqlServer实例 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMSSQLPSDCDBInstIdDirty(){
        if(this.contains(FIELD_MSSQLPSDCDBINSTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 SqlServer实例
     */
    @JsonIgnore
    public void resetMSSQLPSDCDBInstId(){
        this.reset(FIELD_MSSQLPSDCDBINSTID);
    }

    /**
     * 设置 SqlServer实例
     * <P>
     * 等同 {@link #setMSSQLPSDCDBInstId}
     * @param mSSQLPSDCDBInstId
     */
    @JsonIgnore
    public PSDevSlnSysDTO mssqlpsdcdbinstid(String mSSQLPSDCDBInstId){
        this.setMSSQLPSDCDBInstId(mSSQLPSDCDBInstId);
        return this;
    }

    /**
     * <B>PGSQLPSDCDBINSTNAME</B>&nbsp;PostgreSQL实例
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PGSQLPSDCDBINSTID}
     */
    public final static String FIELD_PGSQLPSDCDBINSTNAME = "pgsqlpsdcdbinstname";

    /**
     * 设置 PostgreSQL实例
     * 
     * @param pGSQLPSDCDBInstName
     * 
     */
    @JsonProperty(FIELD_PGSQLPSDCDBINSTNAME)
    public void setPGSQLPSDCDBInstName(String pGSQLPSDCDBInstName){
        this.set(FIELD_PGSQLPSDCDBINSTNAME, pGSQLPSDCDBInstName);
    }
    
    /**
     * 获取 PostgreSQL实例  
     * @return
     */
    @JsonIgnore
    public String getPGSQLPSDCDBInstName(){
        Object objValue = this.get(FIELD_PGSQLPSDCDBINSTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 PostgreSQL实例 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPGSQLPSDCDBInstNameDirty(){
        if(this.contains(FIELD_PGSQLPSDCDBINSTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 PostgreSQL实例
     */
    @JsonIgnore
    public void resetPGSQLPSDCDBInstName(){
        this.reset(FIELD_PGSQLPSDCDBINSTNAME);
    }

    /**
     * 设置 PostgreSQL实例
     * <P>
     * 等同 {@link #setPGSQLPSDCDBInstName}
     * @param pGSQLPSDCDBInstName
     */
    @JsonIgnore
    public PSDevSlnSysDTO pgsqlpsdcdbinstname(String pGSQLPSDCDBInstName){
        this.setPGSQLPSDCDBInstName(pGSQLPSDCDBInstName);
        return this;
    }

    /**
     * <B>ORAPSDCDBINSTNAME</B>&nbsp;Oracle实例
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ORAPSDCDBINSTID}
     */
    public final static String FIELD_ORAPSDCDBINSTNAME = "orapsdcdbinstname";

    /**
     * 设置 Oracle实例
     * 
     * @param oraPSDCDBInstName
     * 
     */
    @JsonProperty(FIELD_ORAPSDCDBINSTNAME)
    public void setOraPSDCDBInstName(String oraPSDCDBInstName){
        this.set(FIELD_ORAPSDCDBINSTNAME, oraPSDCDBInstName);
    }
    
    /**
     * 获取 Oracle实例  
     * @return
     */
    @JsonIgnore
    public String getOraPSDCDBInstName(){
        Object objValue = this.get(FIELD_ORAPSDCDBINSTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 Oracle实例 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOraPSDCDBInstNameDirty(){
        if(this.contains(FIELD_ORAPSDCDBINSTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 Oracle实例
     */
    @JsonIgnore
    public void resetOraPSDCDBInstName(){
        this.reset(FIELD_ORAPSDCDBINSTNAME);
    }

    /**
     * 设置 Oracle实例
     * <P>
     * 等同 {@link #setOraPSDCDBInstName}
     * @param oraPSDCDBInstName
     */
    @JsonIgnore
    public PSDevSlnSysDTO orapsdcdbinstname(String oraPSDCDBInstName){
        this.setOraPSDCDBInstName(oraPSDCDBInstName);
        return this;
    }

    /**
     * <B>ORAPSDCDBINSTID</B>&nbsp;Oracle实例
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ORAPSDCDBINSTID = "orapsdcdbinstid";

    /**
     * 设置 Oracle实例
     * 
     * @param oraPSDCDBInstId
     * 
     */
    @JsonProperty(FIELD_ORAPSDCDBINSTID)
    public void setOraPSDCDBInstId(String oraPSDCDBInstId){
        this.set(FIELD_ORAPSDCDBINSTID, oraPSDCDBInstId);
    }
    
    /**
     * 获取 Oracle实例  
     * @return
     */
    @JsonIgnore
    public String getOraPSDCDBInstId(){
        Object objValue = this.get(FIELD_ORAPSDCDBINSTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 Oracle实例 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOraPSDCDBInstIdDirty(){
        if(this.contains(FIELD_ORAPSDCDBINSTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 Oracle实例
     */
    @JsonIgnore
    public void resetOraPSDCDBInstId(){
        this.reset(FIELD_ORAPSDCDBINSTID);
    }

    /**
     * 设置 Oracle实例
     * <P>
     * 等同 {@link #setOraPSDCDBInstId}
     * @param oraPSDCDBInstId
     */
    @JsonIgnore
    public PSDevSlnSysDTO orapsdcdbinstid(String oraPSDCDBInstId){
        this.setOraPSDCDBInstId(oraPSDCDBInstId);
        return this;
    }

    /**
     * <B>PPASPSDCDBINSTNAME</B>&nbsp;PPAS实例
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PPASPSDCDBINSTID}
     */
    public final static String FIELD_PPASPSDCDBINSTNAME = "ppaspsdcdbinstname";

    /**
     * 设置 PPAS实例
     * 
     * @param pPASPSDCDBInstName
     * 
     */
    @JsonProperty(FIELD_PPASPSDCDBINSTNAME)
    public void setPPASPSDCDBInstName(String pPASPSDCDBInstName){
        this.set(FIELD_PPASPSDCDBINSTNAME, pPASPSDCDBInstName);
    }
    
    /**
     * 获取 PPAS实例  
     * @return
     */
    @JsonIgnore
    public String getPPASPSDCDBInstName(){
        Object objValue = this.get(FIELD_PPASPSDCDBINSTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 PPAS实例 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPASPSDCDBInstNameDirty(){
        if(this.contains(FIELD_PPASPSDCDBINSTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 PPAS实例
     */
    @JsonIgnore
    public void resetPPASPSDCDBInstName(){
        this.reset(FIELD_PPASPSDCDBINSTNAME);
    }

    /**
     * 设置 PPAS实例
     * <P>
     * 等同 {@link #setPPASPSDCDBInstName}
     * @param pPASPSDCDBInstName
     */
    @JsonIgnore
    public PSDevSlnSysDTO ppaspsdcdbinstname(String pPASPSDCDBInstName){
        this.setPPASPSDCDBInstName(pPASPSDCDBInstName);
        return this;
    }

    /**
     * <B>DB2PSDCDBINSTNAME</B>&nbsp;DB2实例
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DB2PSDCDBINSTID}
     */
    public final static String FIELD_DB2PSDCDBINSTNAME = "db2psdcdbinstname";

    /**
     * 设置 DB2实例
     * 
     * @param dB2PSDCDBInstName
     * 
     */
    @JsonProperty(FIELD_DB2PSDCDBINSTNAME)
    public void setDB2PSDCDBInstName(String dB2PSDCDBInstName){
        this.set(FIELD_DB2PSDCDBINSTNAME, dB2PSDCDBInstName);
    }
    
    /**
     * 获取 DB2实例  
     * @return
     */
    @JsonIgnore
    public String getDB2PSDCDBInstName(){
        Object objValue = this.get(FIELD_DB2PSDCDBINSTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 DB2实例 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDB2PSDCDBInstNameDirty(){
        if(this.contains(FIELD_DB2PSDCDBINSTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 DB2实例
     */
    @JsonIgnore
    public void resetDB2PSDCDBInstName(){
        this.reset(FIELD_DB2PSDCDBINSTNAME);
    }

    /**
     * 设置 DB2实例
     * <P>
     * 等同 {@link #setDB2PSDCDBInstName}
     * @param dB2PSDCDBInstName
     */
    @JsonIgnore
    public PSDevSlnSysDTO db2psdcdbinstname(String dB2PSDCDBInstName){
        this.setDB2PSDCDBInstName(dB2PSDCDBInstName);
        return this;
    }

    /**
     * <B>PPASPSDCDBINSTID</B>&nbsp;PPAS实例
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PPASPSDCDBINSTID = "ppaspsdcdbinstid";

    /**
     * 设置 PPAS实例
     * 
     * @param pPASPSDCDBInstId
     * 
     */
    @JsonProperty(FIELD_PPASPSDCDBINSTID)
    public void setPPASPSDCDBInstId(String pPASPSDCDBInstId){
        this.set(FIELD_PPASPSDCDBINSTID, pPASPSDCDBInstId);
    }
    
    /**
     * 获取 PPAS实例  
     * @return
     */
    @JsonIgnore
    public String getPPASPSDCDBInstId(){
        Object objValue = this.get(FIELD_PPASPSDCDBINSTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 PPAS实例 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPASPSDCDBInstIdDirty(){
        if(this.contains(FIELD_PPASPSDCDBINSTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 PPAS实例
     */
    @JsonIgnore
    public void resetPPASPSDCDBInstId(){
        this.reset(FIELD_PPASPSDCDBINSTID);
    }

    /**
     * 设置 PPAS实例
     * <P>
     * 等同 {@link #setPPASPSDCDBInstId}
     * @param pPASPSDCDBInstId
     */
    @JsonIgnore
    public PSDevSlnSysDTO ppaspsdcdbinstid(String pPASPSDCDBInstId){
        this.setPPASPSDCDBInstId(pPASPSDCDBInstId);
        return this;
    }

    /**
     * <B>DB2PSDCDBINSTID</B>&nbsp;DB2实例
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_DB2PSDCDBINSTID = "db2psdcdbinstid";

    /**
     * 设置 DB2实例
     * 
     * @param dB2PSDCDBInstId
     * 
     */
    @JsonProperty(FIELD_DB2PSDCDBINSTID)
    public void setDB2PSDCDBInstId(String dB2PSDCDBInstId){
        this.set(FIELD_DB2PSDCDBINSTID, dB2PSDCDBInstId);
    }
    
    /**
     * 获取 DB2实例  
     * @return
     */
    @JsonIgnore
    public String getDB2PSDCDBInstId(){
        Object objValue = this.get(FIELD_DB2PSDCDBINSTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 DB2实例 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDB2PSDCDBInstIdDirty(){
        if(this.contains(FIELD_DB2PSDCDBINSTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 DB2实例
     */
    @JsonIgnore
    public void resetDB2PSDCDBInstId(){
        this.reset(FIELD_DB2PSDCDBINSTID);
    }

    /**
     * 设置 DB2实例
     * <P>
     * 等同 {@link #setDB2PSDCDBInstId}
     * @param dB2PSDCDBInstId
     */
    @JsonIgnore
    public PSDevSlnSysDTO db2psdcdbinstid(String dB2PSDCDBInstId){
        this.setDB2PSDCDBInstId(dB2PSDCDBInstId);
        return this;
    }

    /**
     * <B>PSDEVCENTERSVNNAME</B>&nbsp;版本库
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVCENTERSVNID}
     */
    public final static String FIELD_PSDEVCENTERSVNNAME = "psdevcentersvnname";

    /**
     * 设置 版本库
     * 
     * @param pSDevCenterSVNName
     * 
     */
    @JsonProperty(FIELD_PSDEVCENTERSVNNAME)
    public void setPSDevCenterSVNName(String pSDevCenterSVNName){
        this.set(FIELD_PSDEVCENTERSVNNAME, pSDevCenterSVNName);
    }
    
    /**
     * 获取 版本库  
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
     * 判断 版本库 是否指定值，包括空值
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
     * 重置 版本库
     */
    @JsonIgnore
    public void resetPSDevCenterSVNName(){
        this.reset(FIELD_PSDEVCENTERSVNNAME);
    }

    /**
     * 设置 版本库
     * <P>
     * 等同 {@link #setPSDevCenterSVNName}
     * @param pSDevCenterSVNName
     */
    @JsonIgnore
    public PSDevSlnSysDTO psdevcentersvnname(String pSDevCenterSVNName){
        this.setPSDevCenterSVNName(pSDevCenterSVNName);
        return this;
    }

    /**
     * <B>PSDEVCENTERSVNID</B>&nbsp;版本库
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVCENTERSVNID = "psdevcentersvnid";

    /**
     * 设置 版本库
     * 
     * @param pSDevCenterSVNId
     * 
     */
    @JsonProperty(FIELD_PSDEVCENTERSVNID)
    public void setPSDevCenterSVNId(String pSDevCenterSVNId){
        this.set(FIELD_PSDEVCENTERSVNID, pSDevCenterSVNId);
    }
    
    /**
     * 获取 版本库  
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
     * 判断 版本库 是否指定值，包括空值
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
     * 重置 版本库
     */
    @JsonIgnore
    public void resetPSDevCenterSVNId(){
        this.reset(FIELD_PSDEVCENTERSVNID);
    }

    /**
     * 设置 版本库
     * <P>
     * 等同 {@link #setPSDevCenterSVNId}
     * @param pSDevCenterSVNId
     */
    @JsonIgnore
    public PSDevSlnSysDTO psdevcentersvnid(String pSDevCenterSVNId){
        this.setPSDevCenterSVNId(pSDevCenterSVNId);
        return this;
    }

    /**
     * <B>ROPSDEVCENTERSVNID</B>&nbsp;版本库（只读）
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ROPSDEVCENTERSVNID = "ropsdevcentersvnid";

    /**
     * 设置 版本库（只读）
     * 
     * @param rOPSDevCenterSVNId
     * 
     */
    @JsonProperty(FIELD_ROPSDEVCENTERSVNID)
    public void setROPSDevCenterSVNId(String rOPSDevCenterSVNId){
        this.set(FIELD_ROPSDEVCENTERSVNID, rOPSDevCenterSVNId);
    }
    
    /**
     * 获取 版本库（只读）  
     * @return
     */
    @JsonIgnore
    public String getROPSDevCenterSVNId(){
        Object objValue = this.get(FIELD_ROPSDEVCENTERSVNID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 版本库（只读） 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isROPSDevCenterSVNIdDirty(){
        if(this.contains(FIELD_ROPSDEVCENTERSVNID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 版本库（只读）
     */
    @JsonIgnore
    public void resetROPSDevCenterSVNId(){
        this.reset(FIELD_ROPSDEVCENTERSVNID);
    }

    /**
     * 设置 版本库（只读）
     * <P>
     * 等同 {@link #setROPSDevCenterSVNId}
     * @param rOPSDevCenterSVNId
     */
    @JsonIgnore
    public PSDevSlnSysDTO ropsdevcentersvnid(String rOPSDevCenterSVNId){
        this.setROPSDevCenterSVNId(rOPSDevCenterSVNId);
        return this;
    }

    /**
     * <B>ROPSDEVCENTERSVNNAME</B>&nbsp;版本库（只读）
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ROPSDEVCENTERSVNID}
     */
    public final static String FIELD_ROPSDEVCENTERSVNNAME = "ropsdevcentersvnname";

    /**
     * 设置 版本库（只读）
     * 
     * @param rOPSDevCenterSVNName
     * 
     */
    @JsonProperty(FIELD_ROPSDEVCENTERSVNNAME)
    public void setROPSDevCenterSVNName(String rOPSDevCenterSVNName){
        this.set(FIELD_ROPSDEVCENTERSVNNAME, rOPSDevCenterSVNName);
    }
    
    /**
     * 获取 版本库（只读）  
     * @return
     */
    @JsonIgnore
    public String getROPSDevCenterSVNName(){
        Object objValue = this.get(FIELD_ROPSDEVCENTERSVNNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 版本库（只读） 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isROPSDevCenterSVNNameDirty(){
        if(this.contains(FIELD_ROPSDEVCENTERSVNNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 版本库（只读）
     */
    @JsonIgnore
    public void resetROPSDevCenterSVNName(){
        this.reset(FIELD_ROPSDEVCENTERSVNNAME);
    }

    /**
     * 设置 版本库（只读）
     * <P>
     * 等同 {@link #setROPSDevCenterSVNName}
     * @param rOPSDevCenterSVNName
     */
    @JsonIgnore
    public PSDevSlnSysDTO ropsdevcentersvnname(String rOPSDevCenterSVNName){
        this.setROPSDevCenterSVNName(rOPSDevCenterSVNName);
        return this;
    }

    /**
     * <B>MODELPSDEVCENTERSVNNAME</B>&nbsp;版本库（模型）
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MODELPSDEVCENTERSVNID}
     */
    public final static String FIELD_MODELPSDEVCENTERSVNNAME = "modelpsdevcentersvnname";

    /**
     * 设置 版本库（模型）
     * 
     * @param modelPSDevCenterSVNName
     * 
     */
    @JsonProperty(FIELD_MODELPSDEVCENTERSVNNAME)
    public void setModelPSDevCenterSVNName(String modelPSDevCenterSVNName){
        this.set(FIELD_MODELPSDEVCENTERSVNNAME, modelPSDevCenterSVNName);
    }
    
    /**
     * 获取 版本库（模型）  
     * @return
     */
    @JsonIgnore
    public String getModelPSDevCenterSVNName(){
        Object objValue = this.get(FIELD_MODELPSDEVCENTERSVNNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 版本库（模型） 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isModelPSDevCenterSVNNameDirty(){
        if(this.contains(FIELD_MODELPSDEVCENTERSVNNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 版本库（模型）
     */
    @JsonIgnore
    public void resetModelPSDevCenterSVNName(){
        this.reset(FIELD_MODELPSDEVCENTERSVNNAME);
    }

    /**
     * 设置 版本库（模型）
     * <P>
     * 等同 {@link #setModelPSDevCenterSVNName}
     * @param modelPSDevCenterSVNName
     */
    @JsonIgnore
    public PSDevSlnSysDTO modelpsdevcentersvnname(String modelPSDevCenterSVNName){
        this.setModelPSDevCenterSVNName(modelPSDevCenterSVNName);
        return this;
    }

    /**
     * <B>MODELPSDEVCENTERSVNID</B>&nbsp;版本库（模型）
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_MODELPSDEVCENTERSVNID = "modelpsdevcentersvnid";

    /**
     * 设置 版本库（模型）
     * 
     * @param modelPSDevCenterSVNId
     * 
     */
    @JsonProperty(FIELD_MODELPSDEVCENTERSVNID)
    public void setModelPSDevCenterSVNId(String modelPSDevCenterSVNId){
        this.set(FIELD_MODELPSDEVCENTERSVNID, modelPSDevCenterSVNId);
    }
    
    /**
     * 获取 版本库（模型）  
     * @return
     */
    @JsonIgnore
    public String getModelPSDevCenterSVNId(){
        Object objValue = this.get(FIELD_MODELPSDEVCENTERSVNID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 版本库（模型） 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isModelPSDevCenterSVNIdDirty(){
        if(this.contains(FIELD_MODELPSDEVCENTERSVNID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 版本库（模型）
     */
    @JsonIgnore
    public void resetModelPSDevCenterSVNId(){
        this.reset(FIELD_MODELPSDEVCENTERSVNID);
    }

    /**
     * 设置 版本库（模型）
     * <P>
     * 等同 {@link #setModelPSDevCenterSVNId}
     * @param modelPSDevCenterSVNId
     */
    @JsonIgnore
    public PSDevSlnSysDTO modelpsdevcentersvnid(String modelPSDevCenterSVNId){
        this.setModelPSDevCenterSVNId(modelPSDevCenterSVNId);
        return this;
    }

    /**
     * <B>PPSDEVSLNSYSID</B>&nbsp;父系统
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PPSDEVSLNSYSID = "ppsdevslnsysid";

    /**
     * 设置 父系统
     * 
     * @param pPSDevSlnSysId
     * 
     */
    @JsonProperty(FIELD_PPSDEVSLNSYSID)
    public void setPPSDevSlnSysId(String pPSDevSlnSysId){
        this.set(FIELD_PPSDEVSLNSYSID, pPSDevSlnSysId);
    }
    
    /**
     * 获取 父系统  
     * @return
     */
    @JsonIgnore
    public String getPPSDevSlnSysId(){
        Object objValue = this.get(FIELD_PPSDEVSLNSYSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父系统 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSDevSlnSysIdDirty(){
        if(this.contains(FIELD_PPSDEVSLNSYSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父系统
     */
    @JsonIgnore
    public void resetPPSDevSlnSysId(){
        this.reset(FIELD_PPSDEVSLNSYSID);
    }

    /**
     * 设置 父系统
     * <P>
     * 等同 {@link #setPPSDevSlnSysId}
     * @param pPSDevSlnSysId
     */
    @JsonIgnore
    public PSDevSlnSysDTO ppsdevslnsysid(String pPSDevSlnSysId){
        this.setPPSDevSlnSysId(pPSDevSlnSysId);
        return this;
    }

    /**
     * <B>MAINPSDEVSLNSYSNAME</B>&nbsp;主干系统
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MAINPSDEVSLNSYSID}
     */
    public final static String FIELD_MAINPSDEVSLNSYSNAME = "mainpsdevslnsysname";

    /**
     * 设置 主干系统
     * 
     * @param mainPSDevSlnSysName
     * 
     */
    @JsonProperty(FIELD_MAINPSDEVSLNSYSNAME)
    public void setMainPSDevSlnSysName(String mainPSDevSlnSysName){
        this.set(FIELD_MAINPSDEVSLNSYSNAME, mainPSDevSlnSysName);
    }
    
    /**
     * 获取 主干系统  
     * @return
     */
    @JsonIgnore
    public String getMainPSDevSlnSysName(){
        Object objValue = this.get(FIELD_MAINPSDEVSLNSYSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主干系统 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMainPSDevSlnSysNameDirty(){
        if(this.contains(FIELD_MAINPSDEVSLNSYSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主干系统
     */
    @JsonIgnore
    public void resetMainPSDevSlnSysName(){
        this.reset(FIELD_MAINPSDEVSLNSYSNAME);
    }

    /**
     * 设置 主干系统
     * <P>
     * 等同 {@link #setMainPSDevSlnSysName}
     * @param mainPSDevSlnSysName
     */
    @JsonIgnore
    public PSDevSlnSysDTO mainpsdevslnsysname(String mainPSDevSlnSysName){
        this.setMainPSDevSlnSysName(mainPSDevSlnSysName);
        return this;
    }

    /**
     * <B>PPSDEVSLNSYSNAME</B>&nbsp;父系统
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PPSDEVSLNSYSID}
     */
    public final static String FIELD_PPSDEVSLNSYSNAME = "ppsdevslnsysname";

    /**
     * 设置 父系统
     * 
     * @param pPSDevSlnSysName
     * 
     */
    @JsonProperty(FIELD_PPSDEVSLNSYSNAME)
    public void setPPSDevSlnSysName(String pPSDevSlnSysName){
        this.set(FIELD_PPSDEVSLNSYSNAME, pPSDevSlnSysName);
    }
    
    /**
     * 获取 父系统  
     * @return
     */
    @JsonIgnore
    public String getPPSDevSlnSysName(){
        Object objValue = this.get(FIELD_PPSDEVSLNSYSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父系统 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSDevSlnSysNameDirty(){
        if(this.contains(FIELD_PPSDEVSLNSYSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父系统
     */
    @JsonIgnore
    public void resetPPSDevSlnSysName(){
        this.reset(FIELD_PPSDEVSLNSYSNAME);
    }

    /**
     * 设置 父系统
     * <P>
     * 等同 {@link #setPPSDevSlnSysName}
     * @param pPSDevSlnSysName
     */
    @JsonIgnore
    public PSDevSlnSysDTO ppsdevslnsysname(String pPSDevSlnSysName){
        this.setPPSDevSlnSysName(pPSDevSlnSysName);
        return this;
    }

    /**
     * <B>MAINPSDEVSLNSYSID</B>&nbsp;主干系统
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_MAINPSDEVSLNSYSID = "mainpsdevslnsysid";

    /**
     * 设置 主干系统
     * 
     * @param mainPSDevSlnSysId
     * 
     */
    @JsonProperty(FIELD_MAINPSDEVSLNSYSID)
    public void setMainPSDevSlnSysId(String mainPSDevSlnSysId){
        this.set(FIELD_MAINPSDEVSLNSYSID, mainPSDevSlnSysId);
    }
    
    /**
     * 获取 主干系统  
     * @return
     */
    @JsonIgnore
    public String getMainPSDevSlnSysId(){
        Object objValue = this.get(FIELD_MAINPSDEVSLNSYSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主干系统 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMainPSDevSlnSysIdDirty(){
        if(this.contains(FIELD_MAINPSDEVSLNSYSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主干系统
     */
    @JsonIgnore
    public void resetMainPSDevSlnSysId(){
        this.reset(FIELD_MAINPSDEVSLNSYSID);
    }

    /**
     * 设置 主干系统
     * <P>
     * 等同 {@link #setMainPSDevSlnSysId}
     * @param mainPSDevSlnSysId
     */
    @JsonIgnore
    public PSDevSlnSysDTO mainpsdevslnsysid(String mainPSDevSlnSysId){
        this.setMainPSDevSlnSysId(mainPSDevSlnSysId);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码名称
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_CODENAME = "codename";

    /**
     * 设置 代码名称
     * 
     * @param codeName
     * 
     */
    @JsonProperty(FIELD_CODENAME)
    public void setCodeName(String codeName){
        this.set(FIELD_CODENAME, codeName);
    }
    
    /**
     * 获取 代码名称  
     * @return
     */
    @JsonIgnore
    public String getCodeName(){
        Object objValue = this.get(FIELD_CODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCodeNameDirty(){
        if(this.contains(FIELD_CODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码名称
     */
    @JsonIgnore
    public void resetCodeName(){
        this.reset(FIELD_CODENAME);
    }

    /**
     * 设置 代码名称
     * <P>
     * 等同 {@link #setCodeName}
     * @param codeName
     */
    @JsonIgnore
    public PSDevSlnSysDTO codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;中文名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_LOGICNAME = "logicname";

    /**
     * 设置 中文名称
     * 
     * @param logicName
     * 
     */
    @JsonProperty(FIELD_LOGICNAME)
    public void setLogicName(String logicName){
        this.set(FIELD_LOGICNAME, logicName);
    }
    
    /**
     * 获取 中文名称  
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
     * 判断 中文名称 是否指定值，包括空值
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
     * 重置 中文名称
     */
    @JsonIgnore
    public void resetLogicName(){
        this.reset(FIELD_LOGICNAME);
    }

    /**
     * 设置 中文名称
     * <P>
     * 等同 {@link #setLogicName}
     * @param logicName
     */
    @JsonIgnore
    public PSDevSlnSysDTO logicname(String logicName){
        this.setLogicName(logicName);
        return this;
    }

    /**
     * <B>PSSFNAME</B>&nbsp;后台技术架构
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSFID}
     */
    public final static String FIELD_PSSFNAME = "pssfname";

    /**
     * 设置 后台技术架构
     * 
     * @param pSSFName
     * 
     */
    @JsonProperty(FIELD_PSSFNAME)
    public void setPSSFName(String pSSFName){
        this.set(FIELD_PSSFNAME, pSSFName);
    }
    
    /**
     * 获取 后台技术架构  
     * @return
     */
    @JsonIgnore
    public String getPSSFName(){
        Object objValue = this.get(FIELD_PSSFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台技术架构 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSFNameDirty(){
        if(this.contains(FIELD_PSSFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台技术架构
     */
    @JsonIgnore
    public void resetPSSFName(){
        this.reset(FIELD_PSSFNAME);
    }

    /**
     * 设置 后台技术架构
     * <P>
     * 等同 {@link #setPSSFName}
     * @param pSSFName
     */
    @JsonIgnore
    public PSDevSlnSysDTO pssfname(String pSSFName){
        this.setPSSFName(pSSFName);
        return this;
    }

    /**
     * <B>PSSFID</B>&nbsp;后台技术架构
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSFID = "pssfid";

    /**
     * 设置 后台技术架构
     * 
     * @param pSSFId
     * 
     */
    @JsonProperty(FIELD_PSSFID)
    public void setPSSFId(String pSSFId){
        this.set(FIELD_PSSFID, pSSFId);
    }
    
    /**
     * 获取 后台技术架构  
     * @return
     */
    @JsonIgnore
    public String getPSSFId(){
        Object objValue = this.get(FIELD_PSSFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台技术架构 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSFIdDirty(){
        if(this.contains(FIELD_PSSFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台技术架构
     */
    @JsonIgnore
    public void resetPSSFId(){
        this.reset(FIELD_PSSFID);
    }

    /**
     * 设置 后台技术架构
     * <P>
     * 等同 {@link #setPSSFId}
     * @param pSSFId
     */
    @JsonIgnore
    public PSDevSlnSysDTO pssfid(String pSSFId){
        this.setPSSFId(pSSFId);
        return this;
    }

    /**
     * <B>SYSVER</B>&nbsp;系统版本
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_SYSVER = "sysver";

    /**
     * 设置 系统版本
     * 
     * @param sysVer
     * 
     */
    @JsonProperty(FIELD_SYSVER)
    public void setSysVer(String sysVer){
        this.set(FIELD_SYSVER, sysVer);
    }
    
    /**
     * 获取 系统版本  
     * @return
     */
    @JsonIgnore
    public String getSysVer(){
        Object objValue = this.get(FIELD_SYSVER);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSysVerDirty(){
        if(this.contains(FIELD_SYSVER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统版本
     */
    @JsonIgnore
    public void resetSysVer(){
        this.reset(FIELD_SYSVER);
    }

    /**
     * 设置 系统版本
     * <P>
     * 等同 {@link #setSysVer}
     * @param sysVer
     */
    @JsonIgnore
    public PSDevSlnSysDTO sysver(String sysVer){
        this.setSysVer(sysVer);
        return this;
    }

    /**
     * <B>DEVSYSSTATE</B>&nbsp;开发系统状态
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.DevSysState} 
     */
    public final static String FIELD_DEVSYSSTATE = "devsysstate";

    /**
     * 设置 开发系统状态
     * 
     * @param devSysState
     * 
     */
    @JsonProperty(FIELD_DEVSYSSTATE)
    public void setDevSysState(Integer devSysState){
        this.set(FIELD_DEVSYSSTATE, devSysState);
    }
    
    /**
     * 获取 开发系统状态  
     * @return
     */
    @JsonIgnore
    public Integer getDevSysState(){
        Object objValue = this.get(FIELD_DEVSYSSTATE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
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
    public PSDevSlnSysDTO devsysstate(Integer devSysState){
        this.setDevSysState(devSysState);
        return this;
    }

     /**
     * 设置 开发系统状态
     * <P>
     * 等同 {@link #setDevSysState}
     * @param devSysState
     */
    @JsonIgnore
    public PSDevSlnSysDTO devsysstate(net.ibizsys.centralstudio.util.CentralEnums.DevSysState devSysState){
        if(devSysState == null){
            this.setDevSysState(null);
        }
        else{
            this.setDevSysState(devSysState.value);
        }
        return this;
    }

    /**
     * <B>DBVERSION</B>&nbsp;模型版本
     */
    public final static String FIELD_DBVERSION = "dbversion";

    /**
     * 设置 模型版本
     * 
     * @param dBVersion
     * 
     */
    @JsonProperty(FIELD_DBVERSION)
    public void setDBVersion(Integer dBVersion){
        this.set(FIELD_DBVERSION, dBVersion);
    }
    
    /**
     * 获取 模型版本  
     * @return
     */
    @JsonIgnore
    public Integer getDBVersion(){
        Object objValue = this.get(FIELD_DBVERSION);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 模型版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDBVersionDirty(){
        if(this.contains(FIELD_DBVERSION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模型版本
     */
    @JsonIgnore
    public void resetDBVersion(){
        this.reset(FIELD_DBVERSION);
    }

    /**
     * 设置 模型版本
     * <P>
     * 等同 {@link #setDBVersion}
     * @param dBVersion
     */
    @JsonIgnore
    public PSDevSlnSysDTO dbversion(Integer dBVersion){
        this.setDBVersion(dBVersion);
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
    public PSDevSlnSysDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ENABLEDM</B>&nbsp;启用DM
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.YesNo} 
     */
    public final static String FIELD_ENABLEDM = "enabledm";

    /**
     * 设置 启用DM
     * 
     * @param enableDM
     * 
     */
    @JsonProperty(FIELD_ENABLEDM)
    public void setEnableDM(Integer enableDM){
        this.set(FIELD_ENABLEDM, enableDM);
    }
    
    /**
     * 获取 启用DM  
     * @return
     */
    @JsonIgnore
    public Integer getEnableDM(){
        Object objValue = this.get(FIELD_ENABLEDM);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用DM 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableDMDirty(){
        if(this.contains(FIELD_ENABLEDM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用DM
     */
    @JsonIgnore
    public void resetEnableDM(){
        this.reset(FIELD_ENABLEDM);
    }

    /**
     * 设置 启用DM
     * <P>
     * 等同 {@link #setEnableDM}
     * @param enableDM
     */
    @JsonIgnore
    public PSDevSlnSysDTO enabledm(Integer enableDM){
        this.setEnableDM(enableDM);
        return this;
    }

     /**
     * 设置 启用DM
     * <P>
     * 等同 {@link #setEnableDM}
     * @param enableDM
     */
    @JsonIgnore
    public PSDevSlnSysDTO enabledm(Boolean enableDM){
        if(enableDM == null){
            this.setEnableDM(null);
        }
        else{
            this.setEnableDM(enableDM?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLECALLBACK</B>&nbsp;启用Web回调
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.YesNo} 
     */
    public final static String FIELD_ENABLECALLBACK = "enablecallback";

    /**
     * 设置 启用Web回调
     * 
     * @param enableCallback
     * 
     */
    @JsonProperty(FIELD_ENABLECALLBACK)
    public void setEnableCallback(Integer enableCallback){
        this.set(FIELD_ENABLECALLBACK, enableCallback);
    }
    
    /**
     * 获取 启用Web回调  
     * @return
     */
    @JsonIgnore
    public Integer getEnableCallback(){
        Object objValue = this.get(FIELD_ENABLECALLBACK);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用Web回调 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableCallbackDirty(){
        if(this.contains(FIELD_ENABLECALLBACK)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用Web回调
     */
    @JsonIgnore
    public void resetEnableCallback(){
        this.reset(FIELD_ENABLECALLBACK);
    }

    /**
     * 设置 启用Web回调
     * <P>
     * 等同 {@link #setEnableCallback}
     * @param enableCallback
     */
    @JsonIgnore
    public PSDevSlnSysDTO enablecallback(Integer enableCallback){
        this.setEnableCallback(enableCallback);
        return this;
    }

     /**
     * 设置 启用Web回调
     * <P>
     * 等同 {@link #setEnableCallback}
     * @param enableCallback
     */
    @JsonIgnore
    public PSDevSlnSysDTO enablecallback(Boolean enableCallback){
        if(enableCallback == null){
            this.setEnableCallback(null);
        }
        else{
            this.setEnableCallback(enableCallback?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEHBASE</B>&nbsp;支持HBase
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.YesNo} 
     */
    public final static String FIELD_ENABLEHBASE = "enablehbase";

    /**
     * 设置 支持HBase
     * 
     * @param enableHBase
     * 
     */
    @JsonProperty(FIELD_ENABLEHBASE)
    public void setEnableHBase(Integer enableHBase){
        this.set(FIELD_ENABLEHBASE, enableHBase);
    }
    
    /**
     * 获取 支持HBase  
     * @return
     */
    @JsonIgnore
    public Integer getEnableHBase(){
        Object objValue = this.get(FIELD_ENABLEHBASE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持HBase 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableHBaseDirty(){
        if(this.contains(FIELD_ENABLEHBASE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持HBase
     */
    @JsonIgnore
    public void resetEnableHBase(){
        this.reset(FIELD_ENABLEHBASE);
    }

    /**
     * 设置 支持HBase
     * <P>
     * 等同 {@link #setEnableHBase}
     * @param enableHBase
     */
    @JsonIgnore
    public PSDevSlnSysDTO enablehbase(Integer enableHBase){
        this.setEnableHBase(enableHBase);
        return this;
    }

     /**
     * 设置 支持HBase
     * <P>
     * 等同 {@link #setEnableHBase}
     * @param enableHBase
     */
    @JsonIgnore
    public PSDevSlnSysDTO enablehbase(Boolean enableHBase){
        if(enableHBase == null){
            this.setEnableHBase(null);
        }
        else{
            this.setEnableHBase(enableHBase?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEWSSERVER</B>&nbsp;支持工程服务器
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.YesNo} 
     */
    public final static String FIELD_ENABLEWSSERVER = "enablewsserver";

    /**
     * 设置 支持工程服务器
     * 
     * @param enableWSServer
     * 
     */
    @JsonProperty(FIELD_ENABLEWSSERVER)
    public void setEnableWSServer(Integer enableWSServer){
        this.set(FIELD_ENABLEWSSERVER, enableWSServer);
    }
    
    /**
     * 获取 支持工程服务器  
     * @return
     */
    @JsonIgnore
    public Integer getEnableWSServer(){
        Object objValue = this.get(FIELD_ENABLEWSSERVER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持工程服务器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableWSServerDirty(){
        if(this.contains(FIELD_ENABLEWSSERVER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持工程服务器
     */
    @JsonIgnore
    public void resetEnableWSServer(){
        this.reset(FIELD_ENABLEWSSERVER);
    }

    /**
     * 设置 支持工程服务器
     * <P>
     * 等同 {@link #setEnableWSServer}
     * @param enableWSServer
     */
    @JsonIgnore
    public PSDevSlnSysDTO enablewsserver(Integer enableWSServer){
        this.setEnableWSServer(enableWSServer);
        return this;
    }

     /**
     * 设置 支持工程服务器
     * <P>
     * 等同 {@link #setEnableWSServer}
     * @param enableWSServer
     */
    @JsonIgnore
    public PSDevSlnSysDTO enablewsserver(Boolean enableWSServer){
        if(enableWSServer == null){
            this.setEnableWSServer(null);
        }
        else{
            this.setEnableWSServer(enableWSServer?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEFOLDERKEY</B>&nbsp;启用目录键
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.YesNo} 
     */
    public final static String FIELD_ENABLEFOLDERKEY = "enablefolderkey";

    /**
     * 设置 启用目录键
     * 
     * @param enableFolderKey
     * 
     */
    @JsonProperty(FIELD_ENABLEFOLDERKEY)
    public void setEnableFolderKey(Integer enableFolderKey){
        this.set(FIELD_ENABLEFOLDERKEY, enableFolderKey);
    }
    
    /**
     * 获取 启用目录键  
     * @return
     */
    @JsonIgnore
    public Integer getEnableFolderKey(){
        Object objValue = this.get(FIELD_ENABLEFOLDERKEY);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用目录键 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableFolderKeyDirty(){
        if(this.contains(FIELD_ENABLEFOLDERKEY)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用目录键
     */
    @JsonIgnore
    public void resetEnableFolderKey(){
        this.reset(FIELD_ENABLEFOLDERKEY);
    }

    /**
     * 设置 启用目录键
     * <P>
     * 等同 {@link #setEnableFolderKey}
     * @param enableFolderKey
     */
    @JsonIgnore
    public PSDevSlnSysDTO enablefolderkey(Integer enableFolderKey){
        this.setEnableFolderKey(enableFolderKey);
        return this;
    }

     /**
     * 设置 启用目录键
     * <P>
     * 等同 {@link #setEnableFolderKey}
     * @param enableFolderKey
     */
    @JsonIgnore
    public PSDevSlnSysDTO enablefolderkey(Boolean enableFolderKey){
        if(enableFolderKey == null){
            this.setEnableFolderKey(null);
        }
        else{
            this.setEnableFolderKey(enableFolderKey?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEDB2</B>&nbsp;支持DB2
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.YesNo} 
     */
    public final static String FIELD_ENABLEDB2 = "enabledb2";

    /**
     * 设置 支持DB2
     * 
     * @param enableDB2
     * 
     */
    @JsonProperty(FIELD_ENABLEDB2)
    public void setEnableDB2(Integer enableDB2){
        this.set(FIELD_ENABLEDB2, enableDB2);
    }
    
    /**
     * 获取 支持DB2  
     * @return
     */
    @JsonIgnore
    public Integer getEnableDB2(){
        Object objValue = this.get(FIELD_ENABLEDB2);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持DB2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableDB2Dirty(){
        if(this.contains(FIELD_ENABLEDB2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持DB2
     */
    @JsonIgnore
    public void resetEnableDB2(){
        this.reset(FIELD_ENABLEDB2);
    }

    /**
     * 设置 支持DB2
     * <P>
     * 等同 {@link #setEnableDB2}
     * @param enableDB2
     */
    @JsonIgnore
    public PSDevSlnSysDTO enabledb2(Integer enableDB2){
        this.setEnableDB2(enableDB2);
        return this;
    }

     /**
     * 设置 支持DB2
     * <P>
     * 等同 {@link #setEnableDB2}
     * @param enableDB2
     */
    @JsonIgnore
    public PSDevSlnSysDTO enabledb2(Boolean enableDB2){
        if(enableDB2 == null){
            this.setEnableDB2(null);
        }
        else{
            this.setEnableDB2(enableDB2?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEPPAS</B>&nbsp;支持PPAS
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.YesNo} 
     */
    public final static String FIELD_ENABLEPPAS = "enableppas";

    /**
     * 设置 支持PPAS
     * 
     * @param enablePPAS
     * 
     */
    @JsonProperty(FIELD_ENABLEPPAS)
    public void setEnablePPAS(Integer enablePPAS){
        this.set(FIELD_ENABLEPPAS, enablePPAS);
    }
    
    /**
     * 获取 支持PPAS  
     * @return
     */
    @JsonIgnore
    public Integer getEnablePPAS(){
        Object objValue = this.get(FIELD_ENABLEPPAS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持PPAS 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnablePPASDirty(){
        if(this.contains(FIELD_ENABLEPPAS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持PPAS
     */
    @JsonIgnore
    public void resetEnablePPAS(){
        this.reset(FIELD_ENABLEPPAS);
    }

    /**
     * 设置 支持PPAS
     * <P>
     * 等同 {@link #setEnablePPAS}
     * @param enablePPAS
     */
    @JsonIgnore
    public PSDevSlnSysDTO enableppas(Integer enablePPAS){
        this.setEnablePPAS(enablePPAS);
        return this;
    }

     /**
     * 设置 支持PPAS
     * <P>
     * 等同 {@link #setEnablePPAS}
     * @param enablePPAS
     */
    @JsonIgnore
    public PSDevSlnSysDTO enableppas(Boolean enablePPAS){
        if(enablePPAS == null){
            this.setEnablePPAS(null);
        }
        else{
            this.setEnablePPAS(enablePPAS?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEPGSQL</B>&nbsp;支持PostgreSQL
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.YesNo} 
     */
    public final static String FIELD_ENABLEPGSQL = "enablepgsql";

    /**
     * 设置 支持PostgreSQL
     * 
     * @param enablePGSQL
     * 
     */
    @JsonProperty(FIELD_ENABLEPGSQL)
    public void setEnablePGSQL(Integer enablePGSQL){
        this.set(FIELD_ENABLEPGSQL, enablePGSQL);
    }
    
    /**
     * 获取 支持PostgreSQL  
     * @return
     */
    @JsonIgnore
    public Integer getEnablePGSQL(){
        Object objValue = this.get(FIELD_ENABLEPGSQL);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持PostgreSQL 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnablePGSQLDirty(){
        if(this.contains(FIELD_ENABLEPGSQL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持PostgreSQL
     */
    @JsonIgnore
    public void resetEnablePGSQL(){
        this.reset(FIELD_ENABLEPGSQL);
    }

    /**
     * 设置 支持PostgreSQL
     * <P>
     * 等同 {@link #setEnablePGSQL}
     * @param enablePGSQL
     */
    @JsonIgnore
    public PSDevSlnSysDTO enablepgsql(Integer enablePGSQL){
        this.setEnablePGSQL(enablePGSQL);
        return this;
    }

     /**
     * 设置 支持PostgreSQL
     * <P>
     * 等同 {@link #setEnablePGSQL}
     * @param enablePGSQL
     */
    @JsonIgnore
    public PSDevSlnSysDTO enablepgsql(Boolean enablePGSQL){
        if(enablePGSQL == null){
            this.setEnablePGSQL(null);
        }
        else{
            this.setEnablePGSQL(enablePGSQL?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEMYSQL5</B>&nbsp;支持MySQL5
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.YesNo} 
     */
    public final static String FIELD_ENABLEMYSQL5 = "enablemysql5";

    /**
     * 设置 支持MySQL5
     * 
     * @param enableMySQL5
     * 
     */
    @JsonProperty(FIELD_ENABLEMYSQL5)
    public void setEnableMySQL5(Integer enableMySQL5){
        this.set(FIELD_ENABLEMYSQL5, enableMySQL5);
    }
    
    /**
     * 获取 支持MySQL5  
     * @return
     */
    @JsonIgnore
    public Integer getEnableMySQL5(){
        Object objValue = this.get(FIELD_ENABLEMYSQL5);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持MySQL5 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableMySQL5Dirty(){
        if(this.contains(FIELD_ENABLEMYSQL5)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持MySQL5
     */
    @JsonIgnore
    public void resetEnableMySQL5(){
        this.reset(FIELD_ENABLEMYSQL5);
    }

    /**
     * 设置 支持MySQL5
     * <P>
     * 等同 {@link #setEnableMySQL5}
     * @param enableMySQL5
     */
    @JsonIgnore
    public PSDevSlnSysDTO enablemysql5(Integer enableMySQL5){
        this.setEnableMySQL5(enableMySQL5);
        return this;
    }

     /**
     * 设置 支持MySQL5
     * <P>
     * 等同 {@link #setEnableMySQL5}
     * @param enableMySQL5
     */
    @JsonIgnore
    public PSDevSlnSysDTO enablemysql5(Boolean enableMySQL5){
        if(enableMySQL5 == null){
            this.setEnableMySQL5(null);
        }
        else{
            this.setEnableMySQL5(enableMySQL5?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEORACLE</B>&nbsp;支持Oracle
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.YesNo} 
     */
    public final static String FIELD_ENABLEORACLE = "enableoracle";

    /**
     * 设置 支持Oracle
     * 
     * @param enableOracle
     * 
     */
    @JsonProperty(FIELD_ENABLEORACLE)
    public void setEnableOracle(Integer enableOracle){
        this.set(FIELD_ENABLEORACLE, enableOracle);
    }
    
    /**
     * 获取 支持Oracle  
     * @return
     */
    @JsonIgnore
    public Integer getEnableOracle(){
        Object objValue = this.get(FIELD_ENABLEORACLE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持Oracle 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableOracleDirty(){
        if(this.contains(FIELD_ENABLEORACLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持Oracle
     */
    @JsonIgnore
    public void resetEnableOracle(){
        this.reset(FIELD_ENABLEORACLE);
    }

    /**
     * 设置 支持Oracle
     * <P>
     * 等同 {@link #setEnableOracle}
     * @param enableOracle
     */
    @JsonIgnore
    public PSDevSlnSysDTO enableoracle(Integer enableOracle){
        this.setEnableOracle(enableOracle);
        return this;
    }

     /**
     * 设置 支持Oracle
     * <P>
     * 等同 {@link #setEnableOracle}
     * @param enableOracle
     */
    @JsonIgnore
    public PSDevSlnSysDTO enableoracle(Boolean enableOracle){
        if(enableOracle == null){
            this.setEnableOracle(null);
        }
        else{
            this.setEnableOracle(enableOracle?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEHANA</B>&nbsp;启用HANA
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.YesNo} 
     */
    public final static String FIELD_ENABLEHANA = "enablehana";

    /**
     * 设置 启用HANA
     * 
     * @param enableHANA
     * 
     */
    @JsonProperty(FIELD_ENABLEHANA)
    public void setEnableHANA(Integer enableHANA){
        this.set(FIELD_ENABLEHANA, enableHANA);
    }
    
    /**
     * 获取 启用HANA  
     * @return
     */
    @JsonIgnore
    public Integer getEnableHANA(){
        Object objValue = this.get(FIELD_ENABLEHANA);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用HANA 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableHANADirty(){
        if(this.contains(FIELD_ENABLEHANA)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用HANA
     */
    @JsonIgnore
    public void resetEnableHANA(){
        this.reset(FIELD_ENABLEHANA);
    }

    /**
     * 设置 启用HANA
     * <P>
     * 等同 {@link #setEnableHANA}
     * @param enableHANA
     */
    @JsonIgnore
    public PSDevSlnSysDTO enablehana(Integer enableHANA){
        this.setEnableHANA(enableHANA);
        return this;
    }

     /**
     * 设置 启用HANA
     * <P>
     * 等同 {@link #setEnableHANA}
     * @param enableHANA
     */
    @JsonIgnore
    public PSDevSlnSysDTO enablehana(Boolean enableHANA){
        if(enableHANA == null){
            this.setEnableHANA(null);
        }
        else{
            this.setEnableHANA(enableHANA?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLESQLSERVER</B>&nbsp;支持SqlServer
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.YesNo} 
     */
    public final static String FIELD_ENABLESQLSERVER = "enablesqlserver";

    /**
     * 设置 支持SqlServer
     * 
     * @param enableSqlServer
     * 
     */
    @JsonProperty(FIELD_ENABLESQLSERVER)
    public void setEnableSqlServer(Integer enableSqlServer){
        this.set(FIELD_ENABLESQLSERVER, enableSqlServer);
    }
    
    /**
     * 获取 支持SqlServer  
     * @return
     */
    @JsonIgnore
    public Integer getEnableSqlServer(){
        Object objValue = this.get(FIELD_ENABLESQLSERVER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持SqlServer 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableSqlServerDirty(){
        if(this.contains(FIELD_ENABLESQLSERVER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持SqlServer
     */
    @JsonIgnore
    public void resetEnableSqlServer(){
        this.reset(FIELD_ENABLESQLSERVER);
    }

    /**
     * 设置 支持SqlServer
     * <P>
     * 等同 {@link #setEnableSqlServer}
     * @param enableSqlServer
     */
    @JsonIgnore
    public PSDevSlnSysDTO enablesqlserver(Integer enableSqlServer){
        this.setEnableSqlServer(enableSqlServer);
        return this;
    }

     /**
     * 设置 支持SqlServer
     * <P>
     * 等同 {@link #setEnableSqlServer}
     * @param enableSqlServer
     */
    @JsonIgnore
    public PSDevSlnSysDTO enablesqlserver(Boolean enableSqlServer){
        if(enableSqlServer == null){
            this.setEnableSqlServer(null);
        }
        else{
            this.setEnableSqlServer(enableSqlServer?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEDEPLOYCENTER</B>&nbsp;支持部署中心
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.YesNo} 
     */
    public final static String FIELD_ENABLEDEPLOYCENTER = "enabledeploycenter";

    /**
     * 设置 支持部署中心
     * 
     * @param enableDeployCenter
     * 
     */
    @JsonProperty(FIELD_ENABLEDEPLOYCENTER)
    public void setEnableDeployCenter(Integer enableDeployCenter){
        this.set(FIELD_ENABLEDEPLOYCENTER, enableDeployCenter);
    }
    
    /**
     * 获取 支持部署中心  
     * @return
     */
    @JsonIgnore
    public Integer getEnableDeployCenter(){
        Object objValue = this.get(FIELD_ENABLEDEPLOYCENTER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持部署中心 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableDeployCenterDirty(){
        if(this.contains(FIELD_ENABLEDEPLOYCENTER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持部署中心
     */
    @JsonIgnore
    public void resetEnableDeployCenter(){
        this.reset(FIELD_ENABLEDEPLOYCENTER);
    }

    /**
     * 设置 支持部署中心
     * <P>
     * 等同 {@link #setEnableDeployCenter}
     * @param enableDeployCenter
     */
    @JsonIgnore
    public PSDevSlnSysDTO enabledeploycenter(Integer enableDeployCenter){
        this.setEnableDeployCenter(enableDeployCenter);
        return this;
    }

     /**
     * 设置 支持部署中心
     * <P>
     * 等同 {@link #setEnableDeployCenter}
     * @param enableDeployCenter
     */
    @JsonIgnore
    public PSDevSlnSysDTO enabledeploycenter(Boolean enableDeployCenter){
        if(enableDeployCenter == null){
            this.setEnableDeployCenter(null);
        }
        else{
            this.setEnableDeployCenter(enableDeployCenter?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLESQLITE</B>&nbsp;启用SQLite
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.YesNo} 
     */
    public final static String FIELD_ENABLESQLITE = "enablesqlite";

    /**
     * 设置 启用SQLite
     * 
     * @param enableSQLite
     * 
     */
    @JsonProperty(FIELD_ENABLESQLITE)
    public void setEnableSQLite(Integer enableSQLite){
        this.set(FIELD_ENABLESQLITE, enableSQLite);
    }
    
    /**
     * 获取 启用SQLite  
     * @return
     */
    @JsonIgnore
    public Integer getEnableSQLite(){
        Object objValue = this.get(FIELD_ENABLESQLITE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用SQLite 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableSQLiteDirty(){
        if(this.contains(FIELD_ENABLESQLITE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用SQLite
     */
    @JsonIgnore
    public void resetEnableSQLite(){
        this.reset(FIELD_ENABLESQLITE);
    }

    /**
     * 设置 启用SQLite
     * <P>
     * 等同 {@link #setEnableSQLite}
     * @param enableSQLite
     */
    @JsonIgnore
    public PSDevSlnSysDTO enablesqlite(Integer enableSQLite){
        this.setEnableSQLite(enableSQLite);
        return this;
    }

     /**
     * 设置 启用SQLite
     * <P>
     * 等同 {@link #setEnableSQLite}
     * @param enableSQLite
     */
    @JsonIgnore
    public PSDevSlnSysDTO enablesqlite(Boolean enableSQLite){
        if(enableSQLite == null){
            this.setEnableSQLite(null);
        }
        else{
            this.setEnableSQLite(enableSQLite?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEDYNASYS</B>&nbsp;支持动态系统
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.DynaSysTypes} 
     */
    public final static String FIELD_ENABLEDYNASYS = "enabledynasys";

    /**
     * 设置 支持动态系统
     * 
     * @param enableDynaSys
     * 
     */
    @JsonProperty(FIELD_ENABLEDYNASYS)
    public void setEnableDynaSys(Integer enableDynaSys){
        this.set(FIELD_ENABLEDYNASYS, enableDynaSys);
    }
    
    /**
     * 获取 支持动态系统  
     * @return
     */
    @JsonIgnore
    public Integer getEnableDynaSys(){
        Object objValue = this.get(FIELD_ENABLEDYNASYS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持动态系统 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableDynaSysDirty(){
        if(this.contains(FIELD_ENABLEDYNASYS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持动态系统
     */
    @JsonIgnore
    public void resetEnableDynaSys(){
        this.reset(FIELD_ENABLEDYNASYS);
    }

    /**
     * 设置 支持动态系统
     * <P>
     * 等同 {@link #setEnableDynaSys}
     * @param enableDynaSys
     */
    @JsonIgnore
    public PSDevSlnSysDTO enabledynasys(Integer enableDynaSys){
        this.setEnableDynaSys(enableDynaSys);
        return this;
    }

     /**
     * 设置 支持动态系统
     * <P>
     * 等同 {@link #setEnableDynaSys}
     * @param enableDynaSys
     */
    @JsonIgnore
    public PSDevSlnSysDTO enabledynasys(net.ibizsys.centralstudio.util.CentralEnums.DynaSysTypes enableDynaSys){
        if(enableDynaSys == null){
            this.setEnableDynaSys(null);
        }
        else{
            this.setEnableDynaSys(enableDynaSys.value);
        }
        return this;
    }

    /**
     * <B>DEPLOYSYSORGSECTORID</B>&nbsp;部署机构部门标识
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_DEPLOYSYSORGSECTORID = "deploysysorgsectorid";

    /**
     * 设置 部署机构部门标识
     * 
     * @param deploySysOrgSectorId
     * 
     */
    @JsonProperty(FIELD_DEPLOYSYSORGSECTORID)
    public void setDeploySysOrgSectorId(String deploySysOrgSectorId){
        this.set(FIELD_DEPLOYSYSORGSECTORID, deploySysOrgSectorId);
    }
    
    /**
     * 获取 部署机构部门标识  
     * @return
     */
    @JsonIgnore
    public String getDeploySysOrgSectorId(){
        Object objValue = this.get(FIELD_DEPLOYSYSORGSECTORID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部署机构部门标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDeploySysOrgSectorIdDirty(){
        if(this.contains(FIELD_DEPLOYSYSORGSECTORID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部署机构部门标识
     */
    @JsonIgnore
    public void resetDeploySysOrgSectorId(){
        this.reset(FIELD_DEPLOYSYSORGSECTORID);
    }

    /**
     * 设置 部署机构部门标识
     * <P>
     * 等同 {@link #setDeploySysOrgSectorId}
     * @param deploySysOrgSectorId
     */
    @JsonIgnore
    public PSDevSlnSysDTO deploysysorgsectorid(String deploySysOrgSectorId){
        this.setDeploySysOrgSectorId(deploySysOrgSectorId);
        return this;
    }

    /**
     * <B>DEPLOYSYSTAG2</B>&nbsp;部署系统标记2
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_DEPLOYSYSTAG2 = "deploysystag2";

    /**
     * 设置 部署系统标记2
     * 
     * @param deploySysTag2
     * 
     */
    @JsonProperty(FIELD_DEPLOYSYSTAG2)
    public void setDeploySysTag2(String deploySysTag2){
        this.set(FIELD_DEPLOYSYSTAG2, deploySysTag2);
    }
    
    /**
     * 获取 部署系统标记2  
     * @return
     */
    @JsonIgnore
    public String getDeploySysTag2(){
        Object objValue = this.get(FIELD_DEPLOYSYSTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部署系统标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDeploySysTag2Dirty(){
        if(this.contains(FIELD_DEPLOYSYSTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部署系统标记2
     */
    @JsonIgnore
    public void resetDeploySysTag2(){
        this.reset(FIELD_DEPLOYSYSTAG2);
    }

    /**
     * 设置 部署系统标记2
     * <P>
     * 等同 {@link #setDeploySysTag2}
     * @param deploySysTag2
     */
    @JsonIgnore
    public PSDevSlnSysDTO deploysystag2(String deploySysTag2){
        this.setDeploySysTag2(deploySysTag2);
        return this;
    }

    /**
     * <B>DEPLOYSYSID</B>&nbsp;部署系统标识
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_DEPLOYSYSID = "deploysysid";

    /**
     * 设置 部署系统标识
     * 
     * @param deploySysId
     * 
     */
    @JsonProperty(FIELD_DEPLOYSYSID)
    public void setDeploySysId(String deploySysId){
        this.set(FIELD_DEPLOYSYSID, deploySysId);
    }
    
    /**
     * 获取 部署系统标识  
     * @return
     */
    @JsonIgnore
    public String getDeploySysId(){
        Object objValue = this.get(FIELD_DEPLOYSYSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部署系统标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDeploySysIdDirty(){
        if(this.contains(FIELD_DEPLOYSYSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部署系统标识
     */
    @JsonIgnore
    public void resetDeploySysId(){
        this.reset(FIELD_DEPLOYSYSID);
    }

    /**
     * 设置 部署系统标识
     * <P>
     * 等同 {@link #setDeploySysId}
     * @param deploySysId
     */
    @JsonIgnore
    public PSDevSlnSysDTO deploysysid(String deploySysId){
        this.setDeploySysId(deploySysId);
        return this;
    }

    /**
     * <B>DEPLOYSYSORGID</B>&nbsp;部署机构标识
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_DEPLOYSYSORGID = "deploysysorgid";

    /**
     * 设置 部署机构标识
     * 
     * @param deploySysOrgId
     * 
     */
    @JsonProperty(FIELD_DEPLOYSYSORGID)
    public void setDeploySysOrgId(String deploySysOrgId){
        this.set(FIELD_DEPLOYSYSORGID, deploySysOrgId);
    }
    
    /**
     * 获取 部署机构标识  
     * @return
     */
    @JsonIgnore
    public String getDeploySysOrgId(){
        Object objValue = this.get(FIELD_DEPLOYSYSORGID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部署机构标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDeploySysOrgIdDirty(){
        if(this.contains(FIELD_DEPLOYSYSORGID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部署机构标识
     */
    @JsonIgnore
    public void resetDeploySysOrgId(){
        this.reset(FIELD_DEPLOYSYSORGID);
    }

    /**
     * 设置 部署机构标识
     * <P>
     * 等同 {@link #setDeploySysOrgId}
     * @param deploySysOrgId
     */
    @JsonIgnore
    public PSDevSlnSysDTO deploysysorgid(String deploySysOrgId){
        this.setDeploySysOrgId(deploySysOrgId);
        return this;
    }

    /**
     * <B>DEPLOYSYSTAG</B>&nbsp;部署系统标记
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_DEPLOYSYSTAG = "deploysystag";

    /**
     * 设置 部署系统标记
     * 
     * @param deploySysTag
     * 
     */
    @JsonProperty(FIELD_DEPLOYSYSTAG)
    public void setDeploySysTag(String deploySysTag){
        this.set(FIELD_DEPLOYSYSTAG, deploySysTag);
    }
    
    /**
     * 获取 部署系统标记  
     * @return
     */
    @JsonIgnore
    public String getDeploySysTag(){
        Object objValue = this.get(FIELD_DEPLOYSYSTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部署系统标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDeploySysTagDirty(){
        if(this.contains(FIELD_DEPLOYSYSTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部署系统标记
     */
    @JsonIgnore
    public void resetDeploySysTag(){
        this.reset(FIELD_DEPLOYSYSTAG);
    }

    /**
     * 设置 部署系统标记
     * <P>
     * 等同 {@link #setDeploySysTag}
     * @param deploySysTag
     */
    @JsonIgnore
    public PSDevSlnSysDTO deploysystag(String deploySysTag){
        this.setDeploySysTag(deploySysTag);
        return this;
    }

    /**
     * <B>DEPLOYSYSTYPE</B>&nbsp;部署系统类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.DeploySysType} 
     */
    public final static String FIELD_DEPLOYSYSTYPE = "deploysystype";

    /**
     * 设置 部署系统类型
     * 
     * @param deploySysType
     * 
     */
    @JsonProperty(FIELD_DEPLOYSYSTYPE)
    public void setDeploySysType(String deploySysType){
        this.set(FIELD_DEPLOYSYSTYPE, deploySysType);
    }
    
    /**
     * 获取 部署系统类型  
     * @return
     */
    @JsonIgnore
    public String getDeploySysType(){
        Object objValue = this.get(FIELD_DEPLOYSYSTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部署系统类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDeploySysTypeDirty(){
        if(this.contains(FIELD_DEPLOYSYSTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部署系统类型
     */
    @JsonIgnore
    public void resetDeploySysType(){
        this.reset(FIELD_DEPLOYSYSTYPE);
    }

    /**
     * 设置 部署系统类型
     * <P>
     * 等同 {@link #setDeploySysType}
     * @param deploySysType
     */
    @JsonIgnore
    public PSDevSlnSysDTO deploysystype(String deploySysType){
        this.setDeploySysType(deploySysType);
        return this;
    }

     /**
     * 设置 部署系统类型
     * <P>
     * 等同 {@link #setDeploySysType}
     * @param deploySysType
     */
    @JsonIgnore
    public PSDevSlnSysDTO deploysystype(net.ibizsys.centralstudio.util.CentralEnums.DeploySysType deploySysType){
        if(deploySysType == null){
            this.setDeploySysType(null);
        }
        else{
            this.setDeploySysType(deploySysType.value);
        }
        return this;
    }

    /**
     * <B>VCTYPE</B>&nbsp;版本类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.DevSlnSysVCType} 
     */
    public final static String FIELD_VCTYPE = "vctype";

    /**
     * 设置 版本类型
     * 
     * @param vCType
     * 
     */
    @JsonProperty(FIELD_VCTYPE)
    public void setVCType(String vCType){
        this.set(FIELD_VCTYPE, vCType);
    }
    
    /**
     * 获取 版本类型  
     * @return
     */
    @JsonIgnore
    public String getVCType(){
        Object objValue = this.get(FIELD_VCTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 版本类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isVCTypeDirty(){
        if(this.contains(FIELD_VCTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 版本类型
     */
    @JsonIgnore
    public void resetVCType(){
        this.reset(FIELD_VCTYPE);
    }

    /**
     * 设置 版本类型
     * <P>
     * 等同 {@link #setVCType}
     * @param vCType
     */
    @JsonIgnore
    public PSDevSlnSysDTO vctype(String vCType){
        this.setVCType(vCType);
        return this;
    }

     /**
     * 设置 版本类型
     * <P>
     * 等同 {@link #setVCType}
     * @param vCType
     */
    @JsonIgnore
    public PSDevSlnSysDTO vctype(net.ibizsys.centralstudio.util.CentralEnums.DevSlnSysVCType vCType){
        if(vCType == null){
            this.setVCType(null);
        }
        else{
            this.setVCType(vCType.value);
        }
        return this;
    }

    /**
     * <B>SYSFOLDER</B>&nbsp;系统目录
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_SYSFOLDER = "sysfolder";

    /**
     * 设置 系统目录
     * 
     * @param sysFolder
     * 
     */
    @JsonProperty(FIELD_SYSFOLDER)
    public void setSysFolder(String sysFolder){
        this.set(FIELD_SYSFOLDER, sysFolder);
    }
    
    /**
     * 获取 系统目录  
     * @return
     */
    @JsonIgnore
    public String getSysFolder(){
        Object objValue = this.get(FIELD_SYSFOLDER);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统目录 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSysFolderDirty(){
        if(this.contains(FIELD_SYSFOLDER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统目录
     */
    @JsonIgnore
    public void resetSysFolder(){
        this.reset(FIELD_SYSFOLDER);
    }

    /**
     * 设置 系统目录
     * <P>
     * 等同 {@link #setSysFolder}
     * @param sysFolder
     */
    @JsonIgnore
    public PSDevSlnSysDTO sysfolder(String sysFolder){
        this.setSysFolder(sysFolder);
        return this;
    }

    /**
     * <B>CODEREPOURL</B>&nbsp;代码仓库地址
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CODEREPOURL = "coderepourl";

    /**
     * 设置 代码仓库地址
     * 
     * @param codeRepoUrl
     * 
     */
    @JsonProperty(FIELD_CODEREPOURL)
    public void setCodeRepoUrl(String codeRepoUrl){
        this.set(FIELD_CODEREPOURL, codeRepoUrl);
    }
    
    /**
     * 获取 代码仓库地址  
     * @return
     */
    @JsonIgnore
    public String getCodeRepoUrl(){
        Object objValue = this.get(FIELD_CODEREPOURL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码仓库地址 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCodeRepoUrlDirty(){
        if(this.contains(FIELD_CODEREPOURL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码仓库地址
     */
    @JsonIgnore
    public void resetCodeRepoUrl(){
        this.reset(FIELD_CODEREPOURL);
    }

    /**
     * 设置 代码仓库地址
     * <P>
     * 等同 {@link #setCodeRepoUrl}
     * @param codeRepoUrl
     */
    @JsonIgnore
    public PSDevSlnSysDTO coderepourl(String codeRepoUrl){
        this.setCodeRepoUrl(codeRepoUrl);
        return this;
    }

    /**
     * <B>ROPSDEVCENTERSVNPATH</B>&nbsp;再生产仓库路径
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ROPSDEVCENTERSVNPATH = "ropsdevcentersvnpath";

    /**
     * 设置 再生产仓库路径
     * 
     * @param rOPSDevCenterSVNPath
     * 
     */
    @JsonProperty(FIELD_ROPSDEVCENTERSVNPATH)
    public void setROPSDevCenterSVNPath(String rOPSDevCenterSVNPath){
        this.set(FIELD_ROPSDEVCENTERSVNPATH, rOPSDevCenterSVNPath);
    }
    
    /**
     * 获取 再生产仓库路径  
     * @return
     */
    @JsonIgnore
    public String getROPSDevCenterSVNPath(){
        Object objValue = this.get(FIELD_ROPSDEVCENTERSVNPATH);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 再生产仓库路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isROPSDevCenterSVNPathDirty(){
        if(this.contains(FIELD_ROPSDEVCENTERSVNPATH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 再生产仓库路径
     */
    @JsonIgnore
    public void resetROPSDevCenterSVNPath(){
        this.reset(FIELD_ROPSDEVCENTERSVNPATH);
    }

    /**
     * 设置 再生产仓库路径
     * <P>
     * 等同 {@link #setROPSDevCenterSVNPath}
     * @param rOPSDevCenterSVNPath
     */
    @JsonIgnore
    public PSDevSlnSysDTO ropsdevcentersvnpath(String rOPSDevCenterSVNPath){
        this.setROPSDevCenterSVNPath(rOPSDevCenterSVNPath);
        return this;
    }

    /**
     * <B>MODELPSDEVCENTERSVNPATH</B>&nbsp;模型版本库路径
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_MODELPSDEVCENTERSVNPATH = "modelpsdevcentersvnpath";

    /**
     * 设置 模型版本库路径
     * 
     * @param modelPSDevCenterSVNPath
     * 
     */
    @JsonProperty(FIELD_MODELPSDEVCENTERSVNPATH)
    public void setModelPSDevCenterSVNPath(String modelPSDevCenterSVNPath){
        this.set(FIELD_MODELPSDEVCENTERSVNPATH, modelPSDevCenterSVNPath);
    }
    
    /**
     * 获取 模型版本库路径  
     * @return
     */
    @JsonIgnore
    public String getModelPSDevCenterSVNPath(){
        Object objValue = this.get(FIELD_MODELPSDEVCENTERSVNPATH);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模型版本库路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isModelPSDevCenterSVNPathDirty(){
        if(this.contains(FIELD_MODELPSDEVCENTERSVNPATH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模型版本库路径
     */
    @JsonIgnore
    public void resetModelPSDevCenterSVNPath(){
        this.reset(FIELD_MODELPSDEVCENTERSVNPATH);
    }

    /**
     * 设置 模型版本库路径
     * <P>
     * 等同 {@link #setModelPSDevCenterSVNPath}
     * @param modelPSDevCenterSVNPath
     */
    @JsonIgnore
    public PSDevSlnSysDTO modelpsdevcentersvnpath(String modelPSDevCenterSVNPath){
        this.setModelPSDevCenterSVNPath(modelPSDevCenterSVNPath);
        return this;
    }

    /**
     * <B>PSDEVCENTERSVNPATH</B>&nbsp;运行模型版本库路径
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVCENTERSVNPATH = "psdevcentersvnpath";

    /**
     * 设置 运行模型版本库路径
     * 
     * @param pSDevCenterSVNPath
     * 
     */
    @JsonProperty(FIELD_PSDEVCENTERSVNPATH)
    public void setPSDevCenterSVNPath(String pSDevCenterSVNPath){
        this.set(FIELD_PSDEVCENTERSVNPATH, pSDevCenterSVNPath);
    }
    
    /**
     * 获取 运行模型版本库路径  
     * @return
     */
    @JsonIgnore
    public String getPSDevCenterSVNPath(){
        Object objValue = this.get(FIELD_PSDEVCENTERSVNPATH);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 运行模型版本库路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevCenterSVNPathDirty(){
        if(this.contains(FIELD_PSDEVCENTERSVNPATH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 运行模型版本库路径
     */
    @JsonIgnore
    public void resetPSDevCenterSVNPath(){
        this.reset(FIELD_PSDEVCENTERSVNPATH);
    }

    /**
     * 设置 运行模型版本库路径
     * <P>
     * 等同 {@link #setPSDevCenterSVNPath}
     * @param pSDevCenterSVNPath
     */
    @JsonIgnore
    public PSDevSlnSysDTO psdevcentersvnpath(String pSDevCenterSVNPath){
        this.setPSDevCenterSVNPath(pSDevCenterSVNPath);
        return this;
    }

    /**
     * <B>PSDCMODELTEMPLNAME</B>&nbsp;模型规范
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDCMODELTEMPLID}
     */
    public final static String FIELD_PSDCMODELTEMPLNAME = "psdcmodeltemplname";

    /**
     * 设置 模型规范
     * 
     * @param pSDCModelTemplName
     * 
     */
    @JsonProperty(FIELD_PSDCMODELTEMPLNAME)
    public void setPSDCModelTemplName(String pSDCModelTemplName){
        this.set(FIELD_PSDCMODELTEMPLNAME, pSDCModelTemplName);
    }
    
    /**
     * 获取 模型规范  
     * @return
     */
    @JsonIgnore
    public String getPSDCModelTemplName(){
        Object objValue = this.get(FIELD_PSDCMODELTEMPLNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模型规范 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDCModelTemplNameDirty(){
        if(this.contains(FIELD_PSDCMODELTEMPLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模型规范
     */
    @JsonIgnore
    public void resetPSDCModelTemplName(){
        this.reset(FIELD_PSDCMODELTEMPLNAME);
    }

    /**
     * 设置 模型规范
     * <P>
     * 等同 {@link #setPSDCModelTemplName}
     * @param pSDCModelTemplName
     */
    @JsonIgnore
    public PSDevSlnSysDTO psdcmodeltemplname(String pSDCModelTemplName){
        this.setPSDCModelTemplName(pSDCModelTemplName);
        return this;
    }

    /**
     * <B>PSDCMODELTEMPLID</B>&nbsp;模型规范
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDCMODELTEMPLID = "psdcmodeltemplid";

    /**
     * 设置 模型规范
     * 
     * @param pSDCModelTemplId
     * 
     */
    @JsonProperty(FIELD_PSDCMODELTEMPLID)
    public void setPSDCModelTemplId(String pSDCModelTemplId){
        this.set(FIELD_PSDCMODELTEMPLID, pSDCModelTemplId);
    }
    
    /**
     * 获取 模型规范  
     * @return
     */
    @JsonIgnore
    public String getPSDCModelTemplId(){
        Object objValue = this.get(FIELD_PSDCMODELTEMPLID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模型规范 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDCModelTemplIdDirty(){
        if(this.contains(FIELD_PSDCMODELTEMPLID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模型规范
     */
    @JsonIgnore
    public void resetPSDCModelTemplId(){
        this.reset(FIELD_PSDCMODELTEMPLID);
    }

    /**
     * 设置 模型规范
     * <P>
     * 等同 {@link #setPSDCModelTemplId}
     * @param pSDCModelTemplId
     */
    @JsonIgnore
    public PSDevSlnSysDTO psdcmodeltemplid(String pSDCModelTemplId){
        this.setPSDCModelTemplId(pSDCModelTemplId);
        return this;
    }

    /**
     * <B>CODEREPOBRANCH</B>&nbsp;代码仓库分支
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CODEREPOBRANCH = "coderepobranch";

    /**
     * 设置 代码仓库分支
     * 
     * @param codeRepoBranch
     * 
     */
    @JsonProperty(FIELD_CODEREPOBRANCH)
    public void setCodeRepoBranch(String codeRepoBranch){
        this.set(FIELD_CODEREPOBRANCH, codeRepoBranch);
    }
    
    /**
     * 获取 代码仓库分支  
     * @return
     */
    @JsonIgnore
    public String getCodeRepoBranch(){
        Object objValue = this.get(FIELD_CODEREPOBRANCH);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码仓库分支 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCodeRepoBranchDirty(){
        if(this.contains(FIELD_CODEREPOBRANCH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码仓库分支
     */
    @JsonIgnore
    public void resetCodeRepoBranch(){
        this.reset(FIELD_CODEREPOBRANCH);
    }

    /**
     * 设置 代码仓库分支
     * <P>
     * 等同 {@link #setCodeRepoBranch}
     * @param codeRepoBranch
     */
    @JsonIgnore
    public PSDevSlnSysDTO coderepobranch(String codeRepoBranch){
        this.setCodeRepoBranch(codeRepoBranch);
        return this;
    }

    /**
     * <B>MODELPSDEVCENTERSVNBRANCH</B>&nbsp;模型版本库分支
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_MODELPSDEVCENTERSVNBRANCH = "modelpsdevcentersvnbranch";

    /**
     * 设置 模型版本库分支
     * 
     * @param modelPSDevCenterSVNBranch
     * 
     */
    @JsonProperty(FIELD_MODELPSDEVCENTERSVNBRANCH)
    public void setModelPSDevCenterSVNBranch(String modelPSDevCenterSVNBranch){
        this.set(FIELD_MODELPSDEVCENTERSVNBRANCH, modelPSDevCenterSVNBranch);
    }
    
    /**
     * 获取 模型版本库分支  
     * @return
     */
    @JsonIgnore
    public String getModelPSDevCenterSVNBranch(){
        Object objValue = this.get(FIELD_MODELPSDEVCENTERSVNBRANCH);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模型版本库分支 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isModelPSDevCenterSVNBranchDirty(){
        if(this.contains(FIELD_MODELPSDEVCENTERSVNBRANCH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模型版本库分支
     */
    @JsonIgnore
    public void resetModelPSDevCenterSVNBranch(){
        this.reset(FIELD_MODELPSDEVCENTERSVNBRANCH);
    }

    /**
     * 设置 模型版本库分支
     * <P>
     * 等同 {@link #setModelPSDevCenterSVNBranch}
     * @param modelPSDevCenterSVNBranch
     */
    @JsonIgnore
    public PSDevSlnSysDTO modelpsdevcentersvnbranch(String modelPSDevCenterSVNBranch){
        this.setModelPSDevCenterSVNBranch(modelPSDevCenterSVNBranch);
        return this;
    }

    /**
     * <B>PSDEVCENTERSVNBRANCH</B>&nbsp;运行模型版本库分支
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVCENTERSVNBRANCH = "psdevcentersvnbranch";

    /**
     * 设置 运行模型版本库分支
     * 
     * @param pSDevCenterSVNBranch
     * 
     */
    @JsonProperty(FIELD_PSDEVCENTERSVNBRANCH)
    public void setPSDevCenterSVNBranch(String pSDevCenterSVNBranch){
        this.set(FIELD_PSDEVCENTERSVNBRANCH, pSDevCenterSVNBranch);
    }
    
    /**
     * 获取 运行模型版本库分支  
     * @return
     */
    @JsonIgnore
    public String getPSDevCenterSVNBranch(){
        Object objValue = this.get(FIELD_PSDEVCENTERSVNBRANCH);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 运行模型版本库分支 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevCenterSVNBranchDirty(){
        if(this.contains(FIELD_PSDEVCENTERSVNBRANCH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 运行模型版本库分支
     */
    @JsonIgnore
    public void resetPSDevCenterSVNBranch(){
        this.reset(FIELD_PSDEVCENTERSVNBRANCH);
    }

    /**
     * 设置 运行模型版本库分支
     * <P>
     * 等同 {@link #setPSDevCenterSVNBranch}
     * @param pSDevCenterSVNBranch
     */
    @JsonIgnore
    public PSDevSlnSysDTO psdevcentersvnbranch(String pSDevCenterSVNBranch){
        this.setPSDevCenterSVNBranch(pSDevCenterSVNBranch);
        return this;
    }

    /**
     * <B>ROPSDEVCENTERSVNBRANCH</B>&nbsp;再生产仓库分支
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ROPSDEVCENTERSVNBRANCH = "ropsdevcentersvnbranch";

    /**
     * 设置 再生产仓库分支
     * 
     * @param rOPSDevCenterSVNBranch
     * 
     */
    @JsonProperty(FIELD_ROPSDEVCENTERSVNBRANCH)
    public void setROPSDevCenterSVNBranch(String rOPSDevCenterSVNBranch){
        this.set(FIELD_ROPSDEVCENTERSVNBRANCH, rOPSDevCenterSVNBranch);
    }
    
    /**
     * 获取 再生产仓库分支  
     * @return
     */
    @JsonIgnore
    public String getROPSDevCenterSVNBranch(){
        Object objValue = this.get(FIELD_ROPSDEVCENTERSVNBRANCH);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 再生产仓库分支 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isROPSDevCenterSVNBranchDirty(){
        if(this.contains(FIELD_ROPSDEVCENTERSVNBRANCH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 再生产仓库分支
     */
    @JsonIgnore
    public void resetROPSDevCenterSVNBranch(){
        this.reset(FIELD_ROPSDEVCENTERSVNBRANCH);
    }

    /**
     * 设置 再生产仓库分支
     * <P>
     * 等同 {@link #setROPSDevCenterSVNBranch}
     * @param rOPSDevCenterSVNBranch
     */
    @JsonIgnore
    public PSDevSlnSysDTO ropsdevcentersvnbranch(String rOPSDevCenterSVNBranch){
        this.setROPSDevCenterSVNBranch(rOPSDevCenterSVNBranch);
        return this;
    }

    @JsonIgnore
    @Override
    public Object getSrfkey(){
        return this.getPSDevSlnSysId();
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDevSlnSysDTO){
            PSDevSlnSysDTO dto = (PSDevSlnSysDTO)iEntity;
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