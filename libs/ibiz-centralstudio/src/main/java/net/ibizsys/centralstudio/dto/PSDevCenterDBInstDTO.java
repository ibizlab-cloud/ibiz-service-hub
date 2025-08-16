package net.ibizsys.centralstudio.dto;

import net.ibizsys.centralstudio.util.CentralEntityDTOBase;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;


public class PSDevCenterDBInstDTO extends CentralEntityDTOBase{

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
    public PSDevCenterDBInstDTO updateman(String updateMan){
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
    public PSDevCenterDBInstDTO createdate(Timestamp createDate){
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
    public PSDevCenterDBInstDTO updatedate(Timestamp updateDate){
        this.setUpdateDate(updateDate);
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
    public PSDevCenterDBInstDTO psdevcenterdbinstid(String pSDevCenterDBInstId){
        this.setPSDevCenterDBInstId(pSDevCenterDBInstId);
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
    public PSDevCenterDBInstDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>PSDEVCENTERDBINSTNAME</B>&nbsp;云数据库实例名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEVCENTERDBINSTNAME = "psdevcenterdbinstname";

    /**
     * 设置 云数据库实例名称
     * 
     * @param pSDevCenterDBInstName
     * 
     */
    @JsonProperty(FIELD_PSDEVCENTERDBINSTNAME)
    public void setPSDevCenterDBInstName(String pSDevCenterDBInstName){
        this.set(FIELD_PSDEVCENTERDBINSTNAME, pSDevCenterDBInstName);
    }
    
    /**
     * 获取 云数据库实例名称  
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
     * 判断 云数据库实例名称 是否指定值，包括空值
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
     * 重置 云数据库实例名称
     */
    @JsonIgnore
    public void resetPSDevCenterDBInstName(){
        this.reset(FIELD_PSDEVCENTERDBINSTNAME);
    }

    /**
     * 设置 云数据库实例名称
     * <P>
     * 等同 {@link #setPSDevCenterDBInstName}
     * @param pSDevCenterDBInstName
     */
    @JsonIgnore
    public PSDevCenterDBInstDTO psdevcenterdbinstname(String pSDevCenterDBInstName){
        this.setPSDevCenterDBInstName(pSDevCenterDBInstName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDevCenterDBInstName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDevCenterDBInstName(strName);
    }

    @JsonIgnore
    public PSDevCenterDBInstDTO name(String strName){
        this.setPSDevCenterDBInstName(strName);
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
    public PSDevCenterDBInstDTO psdevcenterid(String pSDevCenterId){
        this.setPSDevCenterId(pSDevCenterId);
        return this;
    }

    /**
     * <B>PSDEVSLNID</B>&nbsp;开发方案标识
     * <P>
     * 字符串：最大长度 100
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
    public PSDevCenterDBInstDTO psdevslnid(String pSDevSlnId){
        this.setPSDevSlnId(pSDevSlnId);
        return this;
    }

    /**
     * <B>PSDEVSLNNAME</B>&nbsp;开发方案名称
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVSLNID}
     */
    public final static String FIELD_PSDEVSLNNAME = "psdevslnname";

    /**
     * 设置 开发方案名称
     * 
     * @param pSDevSlnName
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNNAME)
    public void setPSDevSlnName(String pSDevSlnName){
        this.set(FIELD_PSDEVSLNNAME, pSDevSlnName);
    }
    
    /**
     * 获取 开发方案名称  
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
     * 判断 开发方案名称 是否指定值，包括空值
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
     * 重置 开发方案名称
     */
    @JsonIgnore
    public void resetPSDevSlnName(){
        this.reset(FIELD_PSDEVSLNNAME);
    }

    /**
     * 设置 开发方案名称
     * <P>
     * 等同 {@link #setPSDevSlnName}
     * @param pSDevSlnName
     */
    @JsonIgnore
    public PSDevCenterDBInstDTO psdevslnname(String pSDevSlnName){
        this.setPSDevSlnName(pSDevSlnName);
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
    public PSDevCenterDBInstDTO psdevcentername(String pSDevCenterName){
        this.setPSDevCenterName(pSDevCenterName);
        return this;
    }

    /**
     * <B>DBTYPE</B>&nbsp;数据库类型
     * <P>
     * 字符串：最大长度 20
     */
    public final static String FIELD_DBTYPE = "dbtype";

    /**
     * 设置 数据库类型
     * 
     * @param dBType
     * 
     */
    @JsonProperty(FIELD_DBTYPE)
    public void setDBType(String dBType){
        this.set(FIELD_DBTYPE, dBType);
    }
    
    /**
     * 获取 数据库类型  
     * @return
     */
    @JsonIgnore
    public String getDBType(){
        Object objValue = this.get(FIELD_DBTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据库类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDBTypeDirty(){
        if(this.contains(FIELD_DBTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据库类型
     */
    @JsonIgnore
    public void resetDBType(){
        this.reset(FIELD_DBTYPE);
    }

    /**
     * 设置 数据库类型
     * <P>
     * 等同 {@link #setDBType}
     * @param dBType
     */
    @JsonIgnore
    public PSDevCenterDBInstDTO dbtype(String dBType){
        this.setDBType(dBType);
        return this;
    }

    /**
     * <B>CONNSTR</B>&nbsp;连接串
     * <P>
     * 字符串：最大长度 250
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
    public PSDevCenterDBInstDTO connstr(String connStr){
        this.setConnStr(connStr);
        return this;
    }

    /**
     * <B>PASSWD</B>&nbsp;密码
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_PASSWD = "passwd";

    /**
     * 设置 密码
     * 
     * @param passwd
     * 
     */
    @JsonProperty(FIELD_PASSWD)
    public void setPasswd(String passwd){
        this.set(FIELD_PASSWD, passwd);
    }
    
    /**
     * 获取 密码  
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
     * 判断 密码 是否指定值，包括空值
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
     * 重置 密码
     */
    @JsonIgnore
    public void resetPasswd(){
        this.reset(FIELD_PASSWD);
    }

    /**
     * 设置 密码
     * <P>
     * 等同 {@link #setPasswd}
     * @param passwd
     */
    @JsonIgnore
    public PSDevCenterDBInstDTO passwd(String passwd){
        this.setPasswd(passwd);
        return this;
    }

    /**
     * <B>USERNAME</B>&nbsp;用户名
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_USERNAME = "username";

    /**
     * 设置 用户名
     * 
     * @param userName
     * 
     */
    @JsonProperty(FIELD_USERNAME)
    public void setUserName(String userName){
        this.set(FIELD_USERNAME, userName);
    }
    
    /**
     * 获取 用户名  
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
     * 判断 用户名 是否指定值，包括空值
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
     * 重置 用户名
     */
    @JsonIgnore
    public void resetUserName(){
        this.reset(FIELD_USERNAME);
    }

    /**
     * 设置 用户名
     * <P>
     * 等同 {@link #setUserName}
     * @param userName
     */
    @JsonIgnore
    public PSDevCenterDBInstDTO username(String userName){
        this.setUserName(userName);
        return this;
    }

    /**
     * <B>DBNAME</B>&nbsp;数据库名称
     * <P>
     * 字符串：最大长度 100
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
    public PSDevCenterDBInstDTO dbname(String dBName){
        this.setDBName(dBName);
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
    public PSDevCenterDBInstDTO respos(Integer resPos){
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
    public PSDevCenterDBInstDTO respos(net.ibizsys.centralstudio.util.CentralEnums.DevCenterResPos resPos){
        if(resPos == null){
            this.setResPos(null);
        }
        else{
            this.setResPos(resPos.value);
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
    public PSDevCenterDBInstDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ASSIGNSTATUS</B>&nbsp;分配状态
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ASSIGNSTATUS = "assignstatus";

    /**
     * 设置 分配状态
     * 
     * @param assignStatus
     * 
     */
    @JsonProperty(FIELD_ASSIGNSTATUS)
    public void setAssignStatus(String assignStatus){
        this.set(FIELD_ASSIGNSTATUS, assignStatus);
    }
    
    /**
     * 获取 分配状态  
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
     * 判断 分配状态 是否指定值，包括空值
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
     * 重置 分配状态
     */
    @JsonIgnore
    public void resetAssignStatus(){
        this.reset(FIELD_ASSIGNSTATUS);
    }

    /**
     * 设置 分配状态
     * <P>
     * 等同 {@link #setAssignStatus}
     * @param assignStatus
     */
    @JsonIgnore
    public PSDevCenterDBInstDTO assignstatus(String assignStatus){
        this.setAssignStatus(assignStatus);
        return this;
    }

    @JsonIgnore
    @Override
    public Object getSrfkey(){
        return this.getPSDevCenterDBInstId();
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDevCenterDBInstDTO){
            PSDevCenterDBInstDTO dto = (PSDevCenterDBInstDTO)iEntity;
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