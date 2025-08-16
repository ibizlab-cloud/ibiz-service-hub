package net.ibizsys.centralstudio.dto;

import net.ibizsys.centralstudio.util.CentralEntityDTOBase;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;


public class PSDevSlnSysRefDTO extends CentralEntityDTOBase{

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
    public PSDevSlnSysRefDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>PSDEVSLNSYSREFNAME</B>&nbsp;开发系统引用名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEVSLNSYSREFNAME = "psdevslnsysrefname";

    /**
     * 设置 开发系统引用名称
     * 
     * @param pSDevSlnSysRefName
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNSYSREFNAME)
    public void setPSDevSlnSysRefName(String pSDevSlnSysRefName){
        this.set(FIELD_PSDEVSLNSYSREFNAME, pSDevSlnSysRefName);
    }
    
    /**
     * 获取 开发系统引用名称  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnSysRefName(){
        Object objValue = this.get(FIELD_PSDEVSLNSYSREFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发系统引用名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnSysRefNameDirty(){
        if(this.contains(FIELD_PSDEVSLNSYSREFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发系统引用名称
     */
    @JsonIgnore
    public void resetPSDevSlnSysRefName(){
        this.reset(FIELD_PSDEVSLNSYSREFNAME);
    }

    /**
     * 设置 开发系统引用名称
     * <P>
     * 等同 {@link #setPSDevSlnSysRefName}
     * @param pSDevSlnSysRefName
     */
    @JsonIgnore
    public PSDevSlnSysRefDTO psdevslnsysrefname(String pSDevSlnSysRefName){
        this.setPSDevSlnSysRefName(pSDevSlnSysRefName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDevSlnSysRefName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDevSlnSysRefName(strName);
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO name(String strName){
        this.setPSDevSlnSysRefName(strName);
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
    public PSDevSlnSysRefDTO updatedate(Timestamp updateDate){
        this.setUpdateDate(updateDate);
        return this;
    }

    /**
     * <B>PSDEVSLNSYSREFID</B>&nbsp;开发系统引用标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVSLNSYSREFID = "psdevslnsysrefid";

    /**
     * 设置 开发系统引用标识
     * 
     * @param pSDevSlnSysRefId
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNSYSREFID)
    public void setPSDevSlnSysRefId(String pSDevSlnSysRefId){
        this.set(FIELD_PSDEVSLNSYSREFID, pSDevSlnSysRefId);
    }
    
    /**
     * 获取 开发系统引用标识  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnSysRefId(){
        Object objValue = this.get(FIELD_PSDEVSLNSYSREFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发系统引用标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnSysRefIdDirty(){
        if(this.contains(FIELD_PSDEVSLNSYSREFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发系统引用标识
     */
    @JsonIgnore
    public void resetPSDevSlnSysRefId(){
        this.reset(FIELD_PSDEVSLNSYSREFID);
    }

    /**
     * 设置 开发系统引用标识
     * <P>
     * 等同 {@link #setPSDevSlnSysRefId}
     * @param pSDevSlnSysRefId
     */
    @JsonIgnore
    public PSDevSlnSysRefDTO psdevslnsysrefid(String pSDevSlnSysRefId){
        this.setPSDevSlnSysRefId(pSDevSlnSysRefId);
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
    public PSDevSlnSysRefDTO updateman(String updateMan){
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
    public PSDevSlnSysRefDTO createdate(Timestamp createDate){
        this.setCreateDate(createDate);
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
    public PSDevSlnSysRefDTO psdevslnid(String pSDevSlnId){
        this.setPSDevSlnId(pSDevSlnId);
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
    public PSDevSlnSysRefDTO psdevslnsysname(String pSDevSlnSysName){
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
    public PSDevSlnSysRefDTO psdevslnsysid(String pSDevSlnSysId){
        this.setPSDevSlnSysId(pSDevSlnSysId);
        return this;
    }

    /**
     * <B>REFPSDEVSLNSYSID</B>&nbsp;引用开发系统
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_REFPSDEVSLNSYSID = "refpsdevslnsysid";

    /**
     * 设置 引用开发系统
     * 
     * @param refPSDevSlnSysId
     * 
     */
    @JsonProperty(FIELD_REFPSDEVSLNSYSID)
    public void setRefPSDevSlnSysId(String refPSDevSlnSysId){
        this.set(FIELD_REFPSDEVSLNSYSID, refPSDevSlnSysId);
    }
    
    /**
     * 获取 引用开发系统  
     * @return
     */
    @JsonIgnore
    public String getRefPSDevSlnSysId(){
        Object objValue = this.get(FIELD_REFPSDEVSLNSYSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用开发系统 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDevSlnSysIdDirty(){
        if(this.contains(FIELD_REFPSDEVSLNSYSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用开发系统
     */
    @JsonIgnore
    public void resetRefPSDevSlnSysId(){
        this.reset(FIELD_REFPSDEVSLNSYSID);
    }

    /**
     * 设置 引用开发系统
     * <P>
     * 等同 {@link #setRefPSDevSlnSysId}
     * @param refPSDevSlnSysId
     */
    @JsonIgnore
    public PSDevSlnSysRefDTO refpsdevslnsysid(String refPSDevSlnSysId){
        this.setRefPSDevSlnSysId(refPSDevSlnSysId);
        return this;
    }

    /**
     * <B>REFPSDEVSLNSYSNAME</B>&nbsp;引用系统
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPSDEVSLNSYSID}
     */
    public final static String FIELD_REFPSDEVSLNSYSNAME = "refpsdevslnsysname";

    /**
     * 设置 引用系统
     * 
     * @param refPSDevSlnSysName
     * 
     */
    @JsonProperty(FIELD_REFPSDEVSLNSYSNAME)
    public void setRefPSDevSlnSysName(String refPSDevSlnSysName){
        this.set(FIELD_REFPSDEVSLNSYSNAME, refPSDevSlnSysName);
    }
    
    /**
     * 获取 引用系统  
     * @return
     */
    @JsonIgnore
    public String getRefPSDevSlnSysName(){
        Object objValue = this.get(FIELD_REFPSDEVSLNSYSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用系统 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDevSlnSysNameDirty(){
        if(this.contains(FIELD_REFPSDEVSLNSYSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用系统
     */
    @JsonIgnore
    public void resetRefPSDevSlnSysName(){
        this.reset(FIELD_REFPSDEVSLNSYSNAME);
    }

    /**
     * 设置 引用系统
     * <P>
     * 等同 {@link #setRefPSDevSlnSysName}
     * @param refPSDevSlnSysName
     */
    @JsonIgnore
    public PSDevSlnSysRefDTO refpsdevslnsysname(String refPSDevSlnSysName){
        this.setRefPSDevSlnSysName(refPSDevSlnSysName);
        return this;
    }

    /**
     * <B>REFMODE</B>&nbsp;引用标识
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.DevSysRefMode} 
     */
    public final static String FIELD_REFMODE = "refmode";

    /**
     * 设置 引用标识
     * 
     * @param refMode
     * 
     */
    @JsonProperty(FIELD_REFMODE)
    public void setRefMode(String refMode){
        this.set(FIELD_REFMODE, refMode);
    }
    
    /**
     * 获取 引用标识  
     * @return
     */
    @JsonIgnore
    public String getRefMode(){
        Object objValue = this.get(FIELD_REFMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefModeDirty(){
        if(this.contains(FIELD_REFMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用标识
     */
    @JsonIgnore
    public void resetRefMode(){
        this.reset(FIELD_REFMODE);
    }

    /**
     * 设置 引用标识
     * <P>
     * 等同 {@link #setRefMode}
     * @param refMode
     */
    @JsonIgnore
    public PSDevSlnSysRefDTO refmode(String refMode){
        this.setRefMode(refMode);
        return this;
    }

     /**
     * 设置 引用标识
     * <P>
     * 等同 {@link #setRefMode}
     * @param refMode
     */
    @JsonIgnore
    public PSDevSlnSysRefDTO refmode(net.ibizsys.centralstudio.util.CentralEnums.DevSysRefMode refMode){
        if(refMode == null){
            this.setRefMode(null);
        }
        else{
            this.setRefMode(refMode.value);
        }
        return this;
    }

    /**
     * <B>DBNAME</B>&nbsp;数据库名称
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPSDEVSLNSYSID}
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
    public PSDevSlnSysRefDTO dbname(String dBName){
        this.setDBName(dBName);
        return this;
    }

    /**
     * <B>CONNSTR</B>&nbsp;连接串
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPSDEVSLNSYSID}
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
    public PSDevSlnSysRefDTO connstr(String connStr){
        this.setConnStr(connStr);
        return this;
    }

    /**
     * <B>IGNOREIMPUIMODEL</B>&nbsp;忽略界面模型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.YesNo} 
     */
    public final static String FIELD_IGNOREIMPUIMODEL = "ignoreimpuimodel";

    /**
     * 设置 忽略界面模型
     * 
     * @param ignoreImpUIModel
     * 
     */
    @JsonProperty(FIELD_IGNOREIMPUIMODEL)
    public void setIgnoreImpUIModel(Integer ignoreImpUIModel){
        this.set(FIELD_IGNOREIMPUIMODEL, ignoreImpUIModel);
    }
    
    /**
     * 获取 忽略界面模型  
     * @return
     */
    @JsonIgnore
    public Integer getIgnoreImpUIModel(){
        Object objValue = this.get(FIELD_IGNOREIMPUIMODEL);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 忽略界面模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIgnoreImpUIModelDirty(){
        if(this.contains(FIELD_IGNOREIMPUIMODEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 忽略界面模型
     */
    @JsonIgnore
    public void resetIgnoreImpUIModel(){
        this.reset(FIELD_IGNOREIMPUIMODEL);
    }

    /**
     * 设置 忽略界面模型
     * <P>
     * 等同 {@link #setIgnoreImpUIModel}
     * @param ignoreImpUIModel
     */
    @JsonIgnore
    public PSDevSlnSysRefDTO ignoreimpuimodel(Integer ignoreImpUIModel){
        this.setIgnoreImpUIModel(ignoreImpUIModel);
        return this;
    }

     /**
     * 设置 忽略界面模型
     * <P>
     * 等同 {@link #setIgnoreImpUIModel}
     * @param ignoreImpUIModel
     */
    @JsonIgnore
    public PSDevSlnSysRefDTO ignoreimpuimodel(Boolean ignoreImpUIModel){
        if(ignoreImpUIModel == null){
            this.setIgnoreImpUIModel(null);
        }
        else{
            this.setIgnoreImpUIModel(ignoreImpUIModel?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>IGNOREIMPWFMODEL</B>&nbsp;忽略流程模型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.YesNo} 
     */
    public final static String FIELD_IGNOREIMPWFMODEL = "ignoreimpwfmodel";

    /**
     * 设置 忽略流程模型
     * 
     * @param ignoreImpWFModel
     * 
     */
    @JsonProperty(FIELD_IGNOREIMPWFMODEL)
    public void setIgnoreImpWFModel(Integer ignoreImpWFModel){
        this.set(FIELD_IGNOREIMPWFMODEL, ignoreImpWFModel);
    }
    
    /**
     * 获取 忽略流程模型  
     * @return
     */
    @JsonIgnore
    public Integer getIgnoreImpWFModel(){
        Object objValue = this.get(FIELD_IGNOREIMPWFMODEL);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 忽略流程模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIgnoreImpWFModelDirty(){
        if(this.contains(FIELD_IGNOREIMPWFMODEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 忽略流程模型
     */
    @JsonIgnore
    public void resetIgnoreImpWFModel(){
        this.reset(FIELD_IGNOREIMPWFMODEL);
    }

    /**
     * 设置 忽略流程模型
     * <P>
     * 等同 {@link #setIgnoreImpWFModel}
     * @param ignoreImpWFModel
     */
    @JsonIgnore
    public PSDevSlnSysRefDTO ignoreimpwfmodel(Integer ignoreImpWFModel){
        this.setIgnoreImpWFModel(ignoreImpWFModel);
        return this;
    }

     /**
     * 设置 忽略流程模型
     * <P>
     * 等同 {@link #setIgnoreImpWFModel}
     * @param ignoreImpWFModel
     */
    @JsonIgnore
    public PSDevSlnSysRefDTO ignoreimpwfmodel(Boolean ignoreImpWFModel){
        if(ignoreImpWFModel == null){
            this.setIgnoreImpWFModel(null);
        }
        else{
            this.setIgnoreImpWFModel(ignoreImpWFModel?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>IGNOREIMPDBMODEL</B>&nbsp;忽略数据库模型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.YesNo} 
     */
    public final static String FIELD_IGNOREIMPDBMODEL = "ignoreimpdbmodel";

    /**
     * 设置 忽略数据库模型
     * 
     * @param ignoreImpDBModel
     * 
     */
    @JsonProperty(FIELD_IGNOREIMPDBMODEL)
    public void setIgnoreImpDBModel(Integer ignoreImpDBModel){
        this.set(FIELD_IGNOREIMPDBMODEL, ignoreImpDBModel);
    }
    
    /**
     * 获取 忽略数据库模型  
     * @return
     */
    @JsonIgnore
    public Integer getIgnoreImpDBModel(){
        Object objValue = this.get(FIELD_IGNOREIMPDBMODEL);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 忽略数据库模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIgnoreImpDBModelDirty(){
        if(this.contains(FIELD_IGNOREIMPDBMODEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 忽略数据库模型
     */
    @JsonIgnore
    public void resetIgnoreImpDBModel(){
        this.reset(FIELD_IGNOREIMPDBMODEL);
    }

    /**
     * 设置 忽略数据库模型
     * <P>
     * 等同 {@link #setIgnoreImpDBModel}
     * @param ignoreImpDBModel
     */
    @JsonIgnore
    public PSDevSlnSysRefDTO ignoreimpdbmodel(Integer ignoreImpDBModel){
        this.setIgnoreImpDBModel(ignoreImpDBModel);
        return this;
    }

     /**
     * 设置 忽略数据库模型
     * <P>
     * 等同 {@link #setIgnoreImpDBModel}
     * @param ignoreImpDBModel
     */
    @JsonIgnore
    public PSDevSlnSysRefDTO ignoreimpdbmodel(Boolean ignoreImpDBModel){
        if(ignoreImpDBModel == null){
            this.setIgnoreImpDBModel(null);
        }
        else{
            this.setIgnoreImpDBModel(ignoreImpDBModel?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>LINKREPMSG</B>&nbsp;链接反馈消息
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_LINKREPMSG = "linkrepmsg";

    /**
     * 设置 链接反馈消息
     * 
     * @param linkRepMsg
     * 
     */
    @JsonProperty(FIELD_LINKREPMSG)
    public void setLinkRepMsg(String linkRepMsg){
        this.set(FIELD_LINKREPMSG, linkRepMsg);
    }
    
    /**
     * 获取 链接反馈消息  
     * @return
     */
    @JsonIgnore
    public String getLinkRepMsg(){
        Object objValue = this.get(FIELD_LINKREPMSG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 链接反馈消息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLinkRepMsgDirty(){
        if(this.contains(FIELD_LINKREPMSG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 链接反馈消息
     */
    @JsonIgnore
    public void resetLinkRepMsg(){
        this.reset(FIELD_LINKREPMSG);
    }

    /**
     * 设置 链接反馈消息
     * <P>
     * 等同 {@link #setLinkRepMsg}
     * @param linkRepMsg
     */
    @JsonIgnore
    public PSDevSlnSysRefDTO linkrepmsg(String linkRepMsg){
        this.setLinkRepMsg(linkRepMsg);
        return this;
    }

    /**
     * <B>IMPCOREMODELONLY</B>&nbsp;只导入核心模型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.YesNo} 
     */
    public final static String FIELD_IMPCOREMODELONLY = "impcoremodelonly";

    /**
     * 设置 只导入核心模型
     * 
     * @param impCoreModelOnly
     * 
     */
    @JsonProperty(FIELD_IMPCOREMODELONLY)
    public void setImpCoreModelOnly(Integer impCoreModelOnly){
        this.set(FIELD_IMPCOREMODELONLY, impCoreModelOnly);
    }
    
    /**
     * 获取 只导入核心模型  
     * @return
     */
    @JsonIgnore
    public Integer getImpCoreModelOnly(){
        Object objValue = this.get(FIELD_IMPCOREMODELONLY);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 只导入核心模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isImpCoreModelOnlyDirty(){
        if(this.contains(FIELD_IMPCOREMODELONLY)){
            return true;
        }
        return false;
    }

    /**
     * 重置 只导入核心模型
     */
    @JsonIgnore
    public void resetImpCoreModelOnly(){
        this.reset(FIELD_IMPCOREMODELONLY);
    }

    /**
     * 设置 只导入核心模型
     * <P>
     * 等同 {@link #setImpCoreModelOnly}
     * @param impCoreModelOnly
     */
    @JsonIgnore
    public PSDevSlnSysRefDTO impcoremodelonly(Integer impCoreModelOnly){
        this.setImpCoreModelOnly(impCoreModelOnly);
        return this;
    }

     /**
     * 设置 只导入核心模型
     * <P>
     * 等同 {@link #setImpCoreModelOnly}
     * @param impCoreModelOnly
     */
    @JsonIgnore
    public PSDevSlnSysRefDTO impcoremodelonly(Boolean impCoreModelOnly){
        if(impCoreModelOnly == null){
            this.setImpCoreModelOnly(null);
        }
        else{
            this.setImpCoreModelOnly(impCoreModelOnly?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>LINKFLAG</B>&nbsp;链接外部系统
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.YesNo} 
     */
    public final static String FIELD_LINKFLAG = "linkflag";

    /**
     * 设置 链接外部系统
     * 
     * @param linkFlag
     * 
     */
    @JsonProperty(FIELD_LINKFLAG)
    public void setLinkFlag(Integer linkFlag){
        this.set(FIELD_LINKFLAG, linkFlag);
    }
    
    /**
     * 获取 链接外部系统  
     * @return
     */
    @JsonIgnore
    public Integer getLinkFlag(){
        Object objValue = this.get(FIELD_LINKFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 链接外部系统 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLinkFlagDirty(){
        if(this.contains(FIELD_LINKFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 链接外部系统
     */
    @JsonIgnore
    public void resetLinkFlag(){
        this.reset(FIELD_LINKFLAG);
    }

    /**
     * 设置 链接外部系统
     * <P>
     * 等同 {@link #setLinkFlag}
     * @param linkFlag
     */
    @JsonIgnore
    public PSDevSlnSysRefDTO linkflag(Integer linkFlag){
        this.setLinkFlag(linkFlag);
        return this;
    }

     /**
     * 设置 链接外部系统
     * <P>
     * 等同 {@link #setLinkFlag}
     * @param linkFlag
     */
    @JsonIgnore
    public PSDevSlnSysRefDTO linkflag(Boolean linkFlag){
        if(linkFlag == null){
            this.setLinkFlag(null);
        }
        else{
            this.setLinkFlag(linkFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;引用次序
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 引用次序
     * 
     * @param orderValue
     * 
     */
    @JsonProperty(FIELD_ORDERVALUE)
    public void setOrderValue(Integer orderValue){
        this.set(FIELD_ORDERVALUE, orderValue);
    }
    
    /**
     * 获取 引用次序  
     * @return
     */
    @JsonIgnore
    public Integer getOrderValue(){
        Object objValue = this.get(FIELD_ORDERVALUE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 引用次序 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOrderValueDirty(){
        if(this.contains(FIELD_ORDERVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用次序
     */
    @JsonIgnore
    public void resetOrderValue(){
        this.reset(FIELD_ORDERVALUE);
    }

    /**
     * 设置 引用次序
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSDevSlnSysRefDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>USAGE</B>&nbsp;使用方式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.DevSysRefUsage} 
     */
    public final static String FIELD_USAGE = "usage";

    /**
     * 设置 使用方式
     * 
     * @param usage
     * 
     */
    @JsonProperty(FIELD_USAGE)
    public void setUsage(String usage){
        this.set(FIELD_USAGE, usage);
    }
    
    /**
     * 获取 使用方式  
     * @return
     */
    @JsonIgnore
    public String getUsage(){
        Object objValue = this.get(FIELD_USAGE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 使用方式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUsageDirty(){
        if(this.contains(FIELD_USAGE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 使用方式
     */
    @JsonIgnore
    public void resetUsage(){
        this.reset(FIELD_USAGE);
    }

    /**
     * 设置 使用方式
     * <P>
     * 等同 {@link #setUsage}
     * @param usage
     */
    @JsonIgnore
    public PSDevSlnSysRefDTO usage(String usage){
        this.setUsage(usage);
        return this;
    }

     /**
     * 设置 使用方式
     * <P>
     * 等同 {@link #setUsage}
     * @param usage
     */
    @JsonIgnore
    public PSDevSlnSysRefDTO usage(net.ibizsys.centralstudio.util.CentralEnums.DevSysRefUsage usage){
        if(usage == null){
            this.setUsage(null);
        }
        else{
            this.setUsage(usage.value);
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
    public PSDevSlnSysRefDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>LINKCODE</B>&nbsp;链接代码
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_LINKCODE = "linkcode";

    /**
     * 设置 链接代码
     * 
     * @param linkCode
     * 
     */
    @JsonProperty(FIELD_LINKCODE)
    public void setLinkCode(String linkCode){
        this.set(FIELD_LINKCODE, linkCode);
    }
    
    /**
     * 获取 链接代码  
     * @return
     */
    @JsonIgnore
    public String getLinkCode(){
        Object objValue = this.get(FIELD_LINKCODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 链接代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLinkCodeDirty(){
        if(this.contains(FIELD_LINKCODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 链接代码
     */
    @JsonIgnore
    public void resetLinkCode(){
        this.reset(FIELD_LINKCODE);
    }

    /**
     * 设置 链接代码
     * <P>
     * 等同 {@link #setLinkCode}
     * @param linkCode
     */
    @JsonIgnore
    public PSDevSlnSysRefDTO linkcode(String linkCode){
        this.setLinkCode(linkCode);
        return this;
    }

    /**
     * <B>LINKSTATE</B>&nbsp;链接状态
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.DevSysRefLinkState} 
     */
    public final static String FIELD_LINKSTATE = "linkstate";

    /**
     * 设置 链接状态
     * 
     * @param linkState
     * 
     */
    @JsonProperty(FIELD_LINKSTATE)
    public void setLinkState(Integer linkState){
        this.set(FIELD_LINKSTATE, linkState);
    }
    
    /**
     * 获取 链接状态  
     * @return
     */
    @JsonIgnore
    public Integer getLinkState(){
        Object objValue = this.get(FIELD_LINKSTATE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 链接状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLinkStateDirty(){
        if(this.contains(FIELD_LINKSTATE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 链接状态
     */
    @JsonIgnore
    public void resetLinkState(){
        this.reset(FIELD_LINKSTATE);
    }

    /**
     * 设置 链接状态
     * <P>
     * 等同 {@link #setLinkState}
     * @param linkState
     */
    @JsonIgnore
    public PSDevSlnSysRefDTO linkstate(Integer linkState){
        this.setLinkState(linkState);
        return this;
    }

     /**
     * 设置 链接状态
     * <P>
     * 等同 {@link #setLinkState}
     * @param linkState
     */
    @JsonIgnore
    public PSDevSlnSysRefDTO linkstate(net.ibizsys.centralstudio.util.CentralEnums.DevSysRefLinkState linkState){
        if(linkState == null){
            this.setLinkState(null);
        }
        else{
            this.setLinkState(linkState.value);
        }
        return this;
    }

    /**
     * <B>REFPSDEVSLNSYSSRVNAME</B>&nbsp;引用系统服务包
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPSDEVSLNSYSSRVID}
     */
    public final static String FIELD_REFPSDEVSLNSYSSRVNAME = "refpsdevslnsyssrvname";

    /**
     * 设置 引用系统服务包
     * 
     * @param refPSDevSlnSysSrvName
     * 
     */
    @JsonProperty(FIELD_REFPSDEVSLNSYSSRVNAME)
    public void setRefPSDevSlnSysSrvName(String refPSDevSlnSysSrvName){
        this.set(FIELD_REFPSDEVSLNSYSSRVNAME, refPSDevSlnSysSrvName);
    }
    
    /**
     * 获取 引用系统服务包  
     * @return
     */
    @JsonIgnore
    public String getRefPSDevSlnSysSrvName(){
        Object objValue = this.get(FIELD_REFPSDEVSLNSYSSRVNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用系统服务包 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDevSlnSysSrvNameDirty(){
        if(this.contains(FIELD_REFPSDEVSLNSYSSRVNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用系统服务包
     */
    @JsonIgnore
    public void resetRefPSDevSlnSysSrvName(){
        this.reset(FIELD_REFPSDEVSLNSYSSRVNAME);
    }

    /**
     * 设置 引用系统服务包
     * <P>
     * 等同 {@link #setRefPSDevSlnSysSrvName}
     * @param refPSDevSlnSysSrvName
     */
    @JsonIgnore
    public PSDevSlnSysRefDTO refpsdevslnsyssrvname(String refPSDevSlnSysSrvName){
        this.setRefPSDevSlnSysSrvName(refPSDevSlnSysSrvName);
        return this;
    }

    /**
     * <B>REFPSDEVSLNSYSSRVID</B>&nbsp;引用系统服务包
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_REFPSDEVSLNSYSSRVID = "refpsdevslnsyssrvid";

    /**
     * 设置 引用系统服务包
     * 
     * @param refPSDevSlnSysSrvId
     * 
     */
    @JsonProperty(FIELD_REFPSDEVSLNSYSSRVID)
    public void setRefPSDevSlnSysSrvId(String refPSDevSlnSysSrvId){
        this.set(FIELD_REFPSDEVSLNSYSSRVID, refPSDevSlnSysSrvId);
    }
    
    /**
     * 获取 引用系统服务包  
     * @return
     */
    @JsonIgnore
    public String getRefPSDevSlnSysSrvId(){
        Object objValue = this.get(FIELD_REFPSDEVSLNSYSSRVID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用系统服务包 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDevSlnSysSrvIdDirty(){
        if(this.contains(FIELD_REFPSDEVSLNSYSSRVID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用系统服务包
     */
    @JsonIgnore
    public void resetRefPSDevSlnSysSrvId(){
        this.reset(FIELD_REFPSDEVSLNSYSSRVID);
    }

    /**
     * 设置 引用系统服务包
     * <P>
     * 等同 {@link #setRefPSDevSlnSysSrvId}
     * @param refPSDevSlnSysSrvId
     */
    @JsonIgnore
    public PSDevSlnSysRefDTO refpsdevslnsyssrvid(String refPSDevSlnSysSrvId){
        this.setRefPSDevSlnSysSrvId(refPSDevSlnSysSrvId);
        return this;
    }

    @JsonIgnore
    @Override
    public Object getSrfkey(){
        return this.getPSDevSlnSysRefId();
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDevSlnSysRefDTO){
            PSDevSlnSysRefDTO dto = (PSDevSlnSysRefDTO)iEntity;
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