package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEUTIL</B>实体功能配置 模型传输对象
 * <P>
 * 实体的功能配置模型，定义指定实体功能配置参数及相关的实体信息
 */
public class PSDEUtil extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEUtil(){
        this.setValidFlag(1);
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定实体功能配置的代码标识，需要在所在的实体中具有唯一性
     * <P>
     * 字符串：最大长度 50，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_CODENAME = "codename";

    /**
     * 设置 代码标识，详细说明：{@link #FIELD_CODENAME}
     * 
     * @param codeName
     * 
     */
    @JsonProperty(FIELD_CODENAME)
    public void setCodeName(String codeName){
        this.set(FIELD_CODENAME, codeName);
    }
    
    /**
     * 获取 代码标识  
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
     * 判断 代码标识 是否指定值，包括空值
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
     * 重置 代码标识
     */
    @JsonIgnore
    public void resetCodeName(){
        this.reset(FIELD_CODENAME);
    }

    /**
     * 设置 代码标识，详细说明：{@link #FIELD_CODENAME}
     * <P>
     * 等同 {@link #setCodeName}
     * @param codeName
     */
    @JsonIgnore
    public PSDEUtil codename(String codeName){
        this.setCodeName(codeName);
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
    public void setCreateDate(String createDate){
        this.set(FIELD_CREATEDATE, createDate);
    }
    
    /**
     * 获取 建立时间  
     * @return
     */
    @JsonIgnore
    public String getCreateDate(){
        Object objValue = this.get(FIELD_CREATEDATE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
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
    public PSDEUtil createdate(String createDate){
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
    public PSDEUtil createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>EXTENDMODE</B>&nbsp;扩展模式，指定实体功能配置的扩展模式，此配置针对子系统实体，标记是否要对原功能进行扩展。未定义时为【无扩展】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEExtendMode} 
     */
    public final static String FIELD_EXTENDMODE = "extendmode";

    /**
     * 设置 扩展模式，详细说明：{@link #FIELD_EXTENDMODE}
     * 
     * @param extendMode
     * 
     */
    @JsonProperty(FIELD_EXTENDMODE)
    public void setExtendMode(Integer extendMode){
        this.set(FIELD_EXTENDMODE, extendMode);
    }
    
    /**
     * 获取 扩展模式  
     * @return
     */
    @JsonIgnore
    public Integer getExtendMode(){
        Object objValue = this.get(FIELD_EXTENDMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 扩展模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExtendModeDirty(){
        if(this.contains(FIELD_EXTENDMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 扩展模式
     */
    @JsonIgnore
    public void resetExtendMode(){
        this.reset(FIELD_EXTENDMODE);
    }

    /**
     * 设置 扩展模式，详细说明：{@link #FIELD_EXTENDMODE}
     * <P>
     * 等同 {@link #setExtendMode}
     * @param extendMode
     */
    @JsonIgnore
    public PSDEUtil extendmode(Integer extendMode){
        this.setExtendMode(extendMode);
        return this;
    }

     /**
     * 设置 扩展模式，详细说明：{@link #FIELD_EXTENDMODE}
     * <P>
     * 等同 {@link #setExtendMode}
     * @param extendMode
     */
    @JsonIgnore
    public PSDEUtil extendmode(net.ibizsys.psmodel.core.util.PSModelEnums.DEExtendMode extendMode){
        if(extendMode == null){
            this.setExtendMode(null);
        }
        else{
            this.setExtendMode(extendMode.value);
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
    public PSDEUtil memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定实体功能配置所属的实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 实体，详细说明：{@link #FIELD_PSDEID}
     * 
     * @param pSDEId
     * 
     */
    @JsonProperty(FIELD_PSDEID)
    public void setPSDEId(String pSDEId){
        this.set(FIELD_PSDEID, pSDEId);
    }
    
    /**
     * 获取 实体  
     * @return
     */
    @JsonIgnore
    public String getPSDEId(){
        Object objValue = this.get(FIELD_PSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEIdDirty(){
        if(this.contains(FIELD_PSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体
     */
    @JsonIgnore
    public void resetPSDEId(){
        this.reset(FIELD_PSDEID);
    }

    /**
     * 设置 实体，详细说明：{@link #FIELD_PSDEID}
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSDEUtil psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * 设置 实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDEUtil psdeid(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setPSDEId(null);
            this.setPSDEName(null);
        }
        else{
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>PSDENAME</B>&nbsp;实体，指定实体功能配置所属的实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_PSDENAME = "psdename";

    /**
     * 设置 实体，详细说明：{@link #FIELD_PSDENAME}
     * 
     * @param pSDEName
     * 
     */
    @JsonProperty(FIELD_PSDENAME)
    public void setPSDEName(String pSDEName){
        this.set(FIELD_PSDENAME, pSDEName);
    }
    
    /**
     * 获取 实体  
     * @return
     */
    @JsonIgnore
    public String getPSDEName(){
        Object objValue = this.get(FIELD_PSDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDENameDirty(){
        if(this.contains(FIELD_PSDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体
     */
    @JsonIgnore
    public void resetPSDEName(){
        this.reset(FIELD_PSDENAME);
    }

    /**
     * 设置 实体，详细说明：{@link #FIELD_PSDENAME}
     * <P>
     * 等同 {@link #setPSDEName}
     * @param pSDEName
     */
    @JsonIgnore
    public PSDEUtil psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSDEUTILID</B>&nbsp;实体功能实体标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEUTILID = "psdeutilid";

    /**
     * 设置 实体功能实体标识
     * 
     * @param pSDEUtilId
     * 
     */
    @JsonProperty(FIELD_PSDEUTILID)
    public void setPSDEUtilId(String pSDEUtilId){
        this.set(FIELD_PSDEUTILID, pSDEUtilId);
        //属性名称与代码标识不一致，设置属性名称
        this.set("psdeutildeid", pSDEUtilId);
    }
    
    /**
     * 获取 实体功能实体标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEUtilId(){
        Object objValue = this.get(FIELD_PSDEUTILID);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("psdeutildeid");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 实体功能实体标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEUtilIdDirty(){
        if(this.contains(FIELD_PSDEUTILID)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("psdeutildeid")){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体功能实体标识
     */
    @JsonIgnore
    public void resetPSDEUtilId(){
        this.reset(FIELD_PSDEUTILID);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("psdeutildeid");
    }

    /**
     * 设置 实体功能实体标识
     * <P>
     * 等同 {@link #setPSDEUtilId}
     * @param pSDEUtilId
     */
    @JsonIgnore
    public PSDEUtil psdeutilid(String pSDEUtilId){
        this.setPSDEUtilId(pSDEUtilId);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSDEUtilDEId(){
        return this.getPSDEUtilId();
    }

    @JsonIgnore
    @Deprecated        
    public void setPSDEUtilDEId(String pSDEUtilDEId){
        this.setPSDEUtilId(pSDEUtilDEId);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSDEUtilDEIdDirty(){
        return this.isPSDEUtilIdDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSDEUtilDEId(){
        this.resetPSDEUtilId();
    }

    /**
     * <B>PSDEUTILNAME</B>&nbsp;功能配置名称，指定实体功能配置的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEUTILNAME = "psdeutilname";

    /**
     * 设置 功能配置名称，详细说明：{@link #FIELD_PSDEUTILNAME}
     * 
     * @param pSDEUtilName
     * 
     */
    @JsonProperty(FIELD_PSDEUTILNAME)
    public void setPSDEUtilName(String pSDEUtilName){
        this.set(FIELD_PSDEUTILNAME, pSDEUtilName);
        //属性名称与代码标识不一致，设置属性名称
        this.set("psdeutildename", pSDEUtilName);
    }
    
    /**
     * 获取 功能配置名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEUtilName(){
        Object objValue = this.get(FIELD_PSDEUTILNAME);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("psdeutildename");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 功能配置名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEUtilNameDirty(){
        if(this.contains(FIELD_PSDEUTILNAME)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("psdeutildename")){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能配置名称
     */
    @JsonIgnore
    public void resetPSDEUtilName(){
        this.reset(FIELD_PSDEUTILNAME);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("psdeutildename");
    }

    /**
     * 设置 功能配置名称，详细说明：{@link #FIELD_PSDEUTILNAME}
     * <P>
     * 等同 {@link #setPSDEUtilName}
     * @param pSDEUtilName
     */
    @JsonIgnore
    public PSDEUtil psdeutilname(String pSDEUtilName){
        this.setPSDEUtilName(pSDEUtilName);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSDEUtilDEName(){
        return this.getPSDEUtilName();
    }

    @JsonIgnore
    @Deprecated        
    public void setPSDEUtilDEName(String pSDEUtilDEName){
        this.setPSDEUtilName(pSDEUtilDEName);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSDEUtilDENameDirty(){
        return this.isPSDEUtilNameDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSDEUtilDEName(){
        this.resetPSDEUtilName();
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEUtilName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEUtilName(strName);
    }

    @JsonIgnore
    public PSDEUtil name(String strName){
        this.setPSDEUtilName(strName);
        return this;
    }

    /**
     * <B>PSSUBSYSSERVICEAPIID</B>&nbsp;子系统服务接口
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSubSysServiceAPI} 
     */
    public final static String FIELD_PSSUBSYSSERVICEAPIID = "pssubsysserviceapiid";

    /**
     * 设置 子系统服务接口
     * 
     * @param pSSubSysServiceAPIId
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSERVICEAPIID)
    public void setPSSubSysServiceAPIId(String pSSubSysServiceAPIId){
        this.set(FIELD_PSSUBSYSSERVICEAPIID, pSSubSysServiceAPIId);
    }
    
    /**
     * 获取 子系统服务接口  
     * @return
     */
    @JsonIgnore
    public String getPSSubSysServiceAPIId(){
        Object objValue = this.get(FIELD_PSSUBSYSSERVICEAPIID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 子系统服务接口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubSysServiceAPIIdDirty(){
        if(this.contains(FIELD_PSSUBSYSSERVICEAPIID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 子系统服务接口
     */
    @JsonIgnore
    public void resetPSSubSysServiceAPIId(){
        this.reset(FIELD_PSSUBSYSSERVICEAPIID);
    }

    /**
     * 设置 子系统服务接口
     * <P>
     * 等同 {@link #setPSSubSysServiceAPIId}
     * @param pSSubSysServiceAPIId
     */
    @JsonIgnore
    public PSDEUtil pssubsysserviceapiid(String pSSubSysServiceAPIId){
        this.setPSSubSysServiceAPIId(pSSubSysServiceAPIId);
        return this;
    }

    /**
     * 设置 子系统服务接口，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSubSysServiceAPIId}
     * @param pSSubSysServiceAPI 引用对象
     */
    @JsonIgnore
    public PSDEUtil pssubsysserviceapiid(PSSubSysServiceAPI pSSubSysServiceAPI){
        if(pSSubSysServiceAPI == null){
            this.setPSSubSysServiceAPIId(null);
            this.setPSSubSysServiceAPIName(null);
        }
        else{
            this.setPSSubSysServiceAPIId(pSSubSysServiceAPI.getPSSubSysServiceAPIId());
            this.setPSSubSysServiceAPIName(pSSubSysServiceAPI.getPSSubSysServiceAPIName());
        }
        return this;
    }

    /**
     * <B>PSSUBSYSSERVICEAPINAME</B>&nbsp;子系统服务接口
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSUBSYSSERVICEAPIID}
     */
    public final static String FIELD_PSSUBSYSSERVICEAPINAME = "pssubsysserviceapiname";

    /**
     * 设置 子系统服务接口
     * 
     * @param pSSubSysServiceAPIName
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSERVICEAPINAME)
    public void setPSSubSysServiceAPIName(String pSSubSysServiceAPIName){
        this.set(FIELD_PSSUBSYSSERVICEAPINAME, pSSubSysServiceAPIName);
    }
    
    /**
     * 获取 子系统服务接口  
     * @return
     */
    @JsonIgnore
    public String getPSSubSysServiceAPIName(){
        Object objValue = this.get(FIELD_PSSUBSYSSERVICEAPINAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 子系统服务接口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubSysServiceAPINameDirty(){
        if(this.contains(FIELD_PSSUBSYSSERVICEAPINAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 子系统服务接口
     */
    @JsonIgnore
    public void resetPSSubSysServiceAPIName(){
        this.reset(FIELD_PSSUBSYSSERVICEAPINAME);
    }

    /**
     * 设置 子系统服务接口
     * <P>
     * 等同 {@link #setPSSubSysServiceAPIName}
     * @param pSSubSysServiceAPIName
     */
    @JsonIgnore
    public PSDEUtil pssubsysserviceapiname(String pSSubSysServiceAPIName){
        this.setPSSubSysServiceAPIName(pSSubSysServiceAPIName);
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELID</B>&nbsp;系统动态模型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDynaModel} 
     */
    public final static String FIELD_PSSYSDYNAMODELID = "pssysdynamodelid";

    /**
     * 设置 系统动态模型
     * 
     * @param pSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELID)
    public void setPSSysDynaModelId(String pSSysDynaModelId){
        this.set(FIELD_PSSYSDYNAMODELID, pSSysDynaModelId);
    }
    
    /**
     * 获取 系统动态模型  
     * @return
     */
    @JsonIgnore
    public String getPSSysDynaModelId(){
        Object objValue = this.get(FIELD_PSSYSDYNAMODELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统动态模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDynaModelIdDirty(){
        if(this.contains(FIELD_PSSYSDYNAMODELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统动态模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelId(){
        this.reset(FIELD_PSSYSDYNAMODELID);
    }

    /**
     * 设置 系统动态模型
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModelId
     */
    @JsonIgnore
    public PSDEUtil pssysdynamodelid(String pSSysDynaModelId){
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    /**
     * 设置 系统动态模型，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModel 引用对象
     */
    @JsonIgnore
    public PSDEUtil pssysdynamodelid(PSSysDynaModel pSSysDynaModel){
        if(pSSysDynaModel == null){
            this.setPSSysDynaModelId(null);
            this.setPSSysDynaModelName(null);
        }
        else{
            this.setPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELNAME</B>&nbsp;系统动态模型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDYNAMODELID}
     */
    public final static String FIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";

    /**
     * 设置 系统动态模型
     * 
     * @param pSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELNAME)
    public void setPSSysDynaModelName(String pSSysDynaModelName){
        this.set(FIELD_PSSYSDYNAMODELNAME, pSSysDynaModelName);
    }
    
    /**
     * 获取 系统动态模型  
     * @return
     */
    @JsonIgnore
    public String getPSSysDynaModelName(){
        Object objValue = this.get(FIELD_PSSYSDYNAMODELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统动态模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDynaModelNameDirty(){
        if(this.contains(FIELD_PSSYSDYNAMODELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统动态模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelName(){
        this.reset(FIELD_PSSYSDYNAMODELNAME);
    }

    /**
     * 设置 系统动态模型
     * <P>
     * 等同 {@link #setPSSysDynaModelName}
     * @param pSSysDynaModelName
     */
    @JsonIgnore
    public PSDEUtil pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINID</B>&nbsp;后台扩展插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysSFPlugin} 
     */
    public final static String FIELD_PSSYSSFPLUGINID = "pssyssfpluginid";

    /**
     * 设置 后台扩展插件
     * 
     * @param pSSysSFPluginId
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINID)
    public void setPSSysSFPluginId(String pSSysSFPluginId){
        this.set(FIELD_PSSYSSFPLUGINID, pSSysSFPluginId);
    }
    
    /**
     * 获取 后台扩展插件  
     * @return
     */
    @JsonIgnore
    public String getPSSysSFPluginId(){
        Object objValue = this.get(FIELD_PSSYSSFPLUGINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台扩展插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSFPluginIdDirty(){
        if(this.contains(FIELD_PSSYSSFPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台扩展插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginId(){
        this.reset(FIELD_PSSYSSFPLUGINID);
    }

    /**
     * 设置 后台扩展插件
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPluginId
     */
    @JsonIgnore
    public PSDEUtil pssyssfpluginid(String pSSysSFPluginId){
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    /**
     * 设置 后台扩展插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPlugin 引用对象
     */
    @JsonIgnore
    public PSDEUtil pssyssfpluginid(PSSysSFPlugin pSSysSFPlugin){
        if(pSSysSFPlugin == null){
            this.setPSSysSFPluginId(null);
            this.setPSSysSFPluginName(null);
        }
        else{
            this.setPSSysSFPluginId(pSSysSFPlugin.getPSSysSFPluginId());
            this.setPSSysSFPluginName(pSSysSFPlugin.getPSSysSFPluginName());
        }
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINNAME</B>&nbsp;后台扩展插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSFPLUGINID}
     */
    public final static String FIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";

    /**
     * 设置 后台扩展插件
     * 
     * @param pSSysSFPluginName
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINNAME)
    public void setPSSysSFPluginName(String pSSysSFPluginName){
        this.set(FIELD_PSSYSSFPLUGINNAME, pSSysSFPluginName);
    }
    
    /**
     * 获取 后台扩展插件  
     * @return
     */
    @JsonIgnore
    public String getPSSysSFPluginName(){
        Object objValue = this.get(FIELD_PSSYSSFPLUGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台扩展插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSFPluginNameDirty(){
        if(this.contains(FIELD_PSSYSSFPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台扩展插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginName(){
        this.reset(FIELD_PSSYSSFPLUGINNAME);
    }

    /**
     * 设置 后台扩展插件
     * <P>
     * 等同 {@link #setPSSysSFPluginName}
     * @param pSSysSFPluginName
     */
    @JsonIgnore
    public PSDEUtil pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
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
    public void setUpdateDate(String updateDate){
        this.set(FIELD_UPDATEDATE, updateDate);
    }
    
    /**
     * 获取 更新时间  
     * @return
     */
    @JsonIgnore
    public String getUpdateDate(){
        Object objValue = this.get(FIELD_UPDATEDATE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
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
    public PSDEUtil updatedate(String updateDate){
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
    public PSDEUtil updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>USERCAT</B>&nbsp;用户分类
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat} 
     */
    public final static String FIELD_USERCAT = "usercat";

    /**
     * 设置 用户分类
     * 
     * @param userCat
     * 
     */
    @JsonProperty(FIELD_USERCAT)
    public void setUserCat(String userCat){
        this.set(FIELD_USERCAT, userCat);
    }
    
    /**
     * 获取 用户分类  
     * @return
     */
    @JsonIgnore
    public String getUserCat(){
        Object objValue = this.get(FIELD_USERCAT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户分类 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserCatDirty(){
        if(this.contains(FIELD_USERCAT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户分类
     */
    @JsonIgnore
    public void resetUserCat(){
        this.reset(FIELD_USERCAT);
    }

    /**
     * 设置 用户分类
     * <P>
     * 等同 {@link #setUserCat}
     * @param userCat
     */
    @JsonIgnore
    public PSDEUtil usercat(String userCat){
        this.setUserCat(userCat);
        return this;
    }

     /**
     * 设置 用户分类
     * <P>
     * 等同 {@link #setUserCat}
     * @param userCat
     */
    @JsonIgnore
    public PSDEUtil usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat.value);
        }
        return this;
    }

    /**
     * <B>USERTAG</B>&nbsp;用户标记
     * <P>
     * 字符串：最大长度 100
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
    public PSDEUtil usertag(String userTag){
        this.setUserTag(userTag);
        return this;
    }

    /**
     * <B>USERTAG2</B>&nbsp;用户标记2
     * <P>
     * 字符串：最大长度 100
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
    public PSDEUtil usertag2(String userTag2){
        this.setUserTag2(userTag2);
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
    public PSDEUtil usertag3(String userTag3){
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
    public PSDEUtil usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>UTILOBJ</B>&nbsp;功能对象，指定实体功能配置的程序组件对象，可独立完成功能或是作为代码基类对象
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_UTILOBJ = "utilobj";

    /**
     * 设置 功能对象，详细说明：{@link #FIELD_UTILOBJ}
     * 
     * @param utilObj
     * 
     */
    @JsonProperty(FIELD_UTILOBJ)
    public void setUtilObj(String utilObj){
        this.set(FIELD_UTILOBJ, utilObj);
    }
    
    /**
     * 获取 功能对象  
     * @return
     */
    @JsonIgnore
    public String getUtilObj(){
        Object objValue = this.get(FIELD_UTILOBJ);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilObjDirty(){
        if(this.contains(FIELD_UTILOBJ)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能对象
     */
    @JsonIgnore
    public void resetUtilObj(){
        this.reset(FIELD_UTILOBJ);
    }

    /**
     * 设置 功能对象，详细说明：{@link #FIELD_UTILOBJ}
     * <P>
     * 等同 {@link #setUtilObj}
     * @param utilObj
     */
    @JsonIgnore
    public PSDEUtil utilobj(String utilObj){
        this.setUtilObj(utilObj);
        return this;
    }

    /**
     * <B>UTILPARAM</B>&nbsp;功能参数
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_UTILPARAM = "utilparam";

    /**
     * 设置 功能参数
     * 
     * @param utilParam
     * 
     */
    @JsonProperty(FIELD_UTILPARAM)
    public void setUtilParam(String utilParam){
        this.set(FIELD_UTILPARAM, utilParam);
    }
    
    /**
     * 获取 功能参数  
     * @return
     */
    @JsonIgnore
    public String getUtilParam(){
        Object objValue = this.get(FIELD_UTILPARAM);
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
    public boolean isUtilParamDirty(){
        if(this.contains(FIELD_UTILPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能参数
     */
    @JsonIgnore
    public void resetUtilParam(){
        this.reset(FIELD_UTILPARAM);
    }

    /**
     * 设置 功能参数
     * <P>
     * 等同 {@link #setUtilParam}
     * @param utilParam
     */
    @JsonIgnore
    public PSDEUtil utilparam(String utilParam){
        this.setUtilParam(utilParam);
        return this;
    }

    /**
     * <B>UTILPARAM10</B>&nbsp;功能参数10
     */
    public final static String FIELD_UTILPARAM10 = "utilparam10";

    /**
     * 设置 功能参数10
     * 
     * @param utilParam10
     * 
     */
    @JsonProperty(FIELD_UTILPARAM10)
    public void setUtilParam10(Integer utilParam10){
        this.set(FIELD_UTILPARAM10, utilParam10);
    }
    
    /**
     * 获取 功能参数10  
     * @return
     */
    @JsonIgnore
    public Integer getUtilParam10(){
        Object objValue = this.get(FIELD_UTILPARAM10);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 功能参数10 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilParam10Dirty(){
        if(this.contains(FIELD_UTILPARAM10)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能参数10
     */
    @JsonIgnore
    public void resetUtilParam10(){
        this.reset(FIELD_UTILPARAM10);
    }

    /**
     * 设置 功能参数10
     * <P>
     * 等同 {@link #setUtilParam10}
     * @param utilParam10
     */
    @JsonIgnore
    public PSDEUtil utilparam10(Integer utilParam10){
        this.setUtilParam10(utilParam10);
        return this;
    }

    /**
     * <B>UTILPARAM11</B>&nbsp;功能参数11
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_UTILPARAM11 = "utilparam11";

    /**
     * 设置 功能参数11
     * 
     * @param utilParam11
     * 
     */
    @JsonProperty(FIELD_UTILPARAM11)
    public void setUtilParam11(String utilParam11){
        this.set(FIELD_UTILPARAM11, utilParam11);
    }
    
    /**
     * 获取 功能参数11  
     * @return
     */
    @JsonIgnore
    public String getUtilParam11(){
        Object objValue = this.get(FIELD_UTILPARAM11);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能参数11 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilParam11Dirty(){
        if(this.contains(FIELD_UTILPARAM11)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能参数11
     */
    @JsonIgnore
    public void resetUtilParam11(){
        this.reset(FIELD_UTILPARAM11);
    }

    /**
     * 设置 功能参数11
     * <P>
     * 等同 {@link #setUtilParam11}
     * @param utilParam11
     */
    @JsonIgnore
    public PSDEUtil utilparam11(String utilParam11){
        this.setUtilParam11(utilParam11);
        return this;
    }

    /**
     * <B>UTILPARAM12</B>&nbsp;功能参数12
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_UTILPARAM12 = "utilparam12";

    /**
     * 设置 功能参数12
     * 
     * @param utilParam12
     * 
     */
    @JsonProperty(FIELD_UTILPARAM12)
    public void setUtilParam12(String utilParam12){
        this.set(FIELD_UTILPARAM12, utilParam12);
    }
    
    /**
     * 获取 功能参数12  
     * @return
     */
    @JsonIgnore
    public String getUtilParam12(){
        Object objValue = this.get(FIELD_UTILPARAM12);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能参数12 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilParam12Dirty(){
        if(this.contains(FIELD_UTILPARAM12)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能参数12
     */
    @JsonIgnore
    public void resetUtilParam12(){
        this.reset(FIELD_UTILPARAM12);
    }

    /**
     * 设置 功能参数12
     * <P>
     * 等同 {@link #setUtilParam12}
     * @param utilParam12
     */
    @JsonIgnore
    public PSDEUtil utilparam12(String utilParam12){
        this.setUtilParam12(utilParam12);
        return this;
    }

    /**
     * <B>UTILPARAM2</B>&nbsp;功能参数2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_UTILPARAM2 = "utilparam2";

    /**
     * 设置 功能参数2
     * 
     * @param utilParam2
     * 
     */
    @JsonProperty(FIELD_UTILPARAM2)
    public void setUtilParam2(String utilParam2){
        this.set(FIELD_UTILPARAM2, utilParam2);
    }
    
    /**
     * 获取 功能参数2  
     * @return
     */
    @JsonIgnore
    public String getUtilParam2(){
        Object objValue = this.get(FIELD_UTILPARAM2);
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
    public boolean isUtilParam2Dirty(){
        if(this.contains(FIELD_UTILPARAM2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能参数2
     */
    @JsonIgnore
    public void resetUtilParam2(){
        this.reset(FIELD_UTILPARAM2);
    }

    /**
     * 设置 功能参数2
     * <P>
     * 等同 {@link #setUtilParam2}
     * @param utilParam2
     */
    @JsonIgnore
    public PSDEUtil utilparam2(String utilParam2){
        this.setUtilParam2(utilParam2);
        return this;
    }

    /**
     * <B>UTILPARAM3</B>&nbsp;功能参数3
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_UTILPARAM3 = "utilparam3";

    /**
     * 设置 功能参数3
     * 
     * @param utilParam3
     * 
     */
    @JsonProperty(FIELD_UTILPARAM3)
    public void setUtilParam3(String utilParam3){
        this.set(FIELD_UTILPARAM3, utilParam3);
    }
    
    /**
     * 获取 功能参数3  
     * @return
     */
    @JsonIgnore
    public String getUtilParam3(){
        Object objValue = this.get(FIELD_UTILPARAM3);
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
    public boolean isUtilParam3Dirty(){
        if(this.contains(FIELD_UTILPARAM3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能参数3
     */
    @JsonIgnore
    public void resetUtilParam3(){
        this.reset(FIELD_UTILPARAM3);
    }

    /**
     * 设置 功能参数3
     * <P>
     * 等同 {@link #setUtilParam3}
     * @param utilParam3
     */
    @JsonIgnore
    public PSDEUtil utilparam3(String utilParam3){
        this.setUtilParam3(utilParam3);
        return this;
    }

    /**
     * <B>UTILPARAM4</B>&nbsp;功能参数4
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_UTILPARAM4 = "utilparam4";

    /**
     * 设置 功能参数4
     * 
     * @param utilParam4
     * 
     */
    @JsonProperty(FIELD_UTILPARAM4)
    public void setUtilParam4(String utilParam4){
        this.set(FIELD_UTILPARAM4, utilParam4);
    }
    
    /**
     * 获取 功能参数4  
     * @return
     */
    @JsonIgnore
    public String getUtilParam4(){
        Object objValue = this.get(FIELD_UTILPARAM4);
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
    public boolean isUtilParam4Dirty(){
        if(this.contains(FIELD_UTILPARAM4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能参数4
     */
    @JsonIgnore
    public void resetUtilParam4(){
        this.reset(FIELD_UTILPARAM4);
    }

    /**
     * 设置 功能参数4
     * <P>
     * 等同 {@link #setUtilParam4}
     * @param utilParam4
     */
    @JsonIgnore
    public PSDEUtil utilparam4(String utilParam4){
        this.setUtilParam4(utilParam4);
        return this;
    }

    /**
     * <B>UTILPARAM5</B>&nbsp;功能参数5
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_UTILPARAM5 = "utilparam5";

    /**
     * 设置 功能参数5
     * 
     * @param utilParam5
     * 
     */
    @JsonProperty(FIELD_UTILPARAM5)
    public void setUtilParam5(Integer utilParam5){
        this.set(FIELD_UTILPARAM5, utilParam5);
    }
    
    /**
     * 获取 功能参数5  
     * @return
     */
    @JsonIgnore
    public Integer getUtilParam5(){
        Object objValue = this.get(FIELD_UTILPARAM5);
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
    public boolean isUtilParam5Dirty(){
        if(this.contains(FIELD_UTILPARAM5)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能参数5
     */
    @JsonIgnore
    public void resetUtilParam5(){
        this.reset(FIELD_UTILPARAM5);
    }

    /**
     * 设置 功能参数5
     * <P>
     * 等同 {@link #setUtilParam5}
     * @param utilParam5
     */
    @JsonIgnore
    public PSDEUtil utilparam5(Integer utilParam5){
        this.setUtilParam5(utilParam5);
        return this;
    }

     /**
     * 设置 功能参数5
     * <P>
     * 等同 {@link #setUtilParam5}
     * @param utilParam5
     */
    @JsonIgnore
    public PSDEUtil utilparam5(Boolean utilParam5){
        if(utilParam5 == null){
            this.setUtilParam5(null);
        }
        else{
            this.setUtilParam5(utilParam5?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>UTILPARAM6</B>&nbsp;功能参数6
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_UTILPARAM6 = "utilparam6";

    /**
     * 设置 功能参数6
     * 
     * @param utilParam6
     * 
     */
    @JsonProperty(FIELD_UTILPARAM6)
    public void setUtilParam6(Integer utilParam6){
        this.set(FIELD_UTILPARAM6, utilParam6);
    }
    
    /**
     * 获取 功能参数6  
     * @return
     */
    @JsonIgnore
    public Integer getUtilParam6(){
        Object objValue = this.get(FIELD_UTILPARAM6);
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
    public boolean isUtilParam6Dirty(){
        if(this.contains(FIELD_UTILPARAM6)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能参数6
     */
    @JsonIgnore
    public void resetUtilParam6(){
        this.reset(FIELD_UTILPARAM6);
    }

    /**
     * 设置 功能参数6
     * <P>
     * 等同 {@link #setUtilParam6}
     * @param utilParam6
     */
    @JsonIgnore
    public PSDEUtil utilparam6(Integer utilParam6){
        this.setUtilParam6(utilParam6);
        return this;
    }

     /**
     * 设置 功能参数6
     * <P>
     * 等同 {@link #setUtilParam6}
     * @param utilParam6
     */
    @JsonIgnore
    public PSDEUtil utilparam6(Boolean utilParam6){
        if(utilParam6 == null){
            this.setUtilParam6(null);
        }
        else{
            this.setUtilParam6(utilParam6?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>UTILPARAM7</B>&nbsp;功能参数7
     */
    public final static String FIELD_UTILPARAM7 = "utilparam7";

    /**
     * 设置 功能参数7
     * 
     * @param utilParam7
     * 
     */
    @JsonProperty(FIELD_UTILPARAM7)
    public void setUtilParam7(Integer utilParam7){
        this.set(FIELD_UTILPARAM7, utilParam7);
    }
    
    /**
     * 获取 功能参数7  
     * @return
     */
    @JsonIgnore
    public Integer getUtilParam7(){
        Object objValue = this.get(FIELD_UTILPARAM7);
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
    public boolean isUtilParam7Dirty(){
        if(this.contains(FIELD_UTILPARAM7)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能参数7
     */
    @JsonIgnore
    public void resetUtilParam7(){
        this.reset(FIELD_UTILPARAM7);
    }

    /**
     * 设置 功能参数7
     * <P>
     * 等同 {@link #setUtilParam7}
     * @param utilParam7
     */
    @JsonIgnore
    public PSDEUtil utilparam7(Integer utilParam7){
        this.setUtilParam7(utilParam7);
        return this;
    }

    /**
     * <B>UTILPARAM8</B>&nbsp;功能参数8
     */
    public final static String FIELD_UTILPARAM8 = "utilparam8";

    /**
     * 设置 功能参数8
     * 
     * @param utilParam8
     * 
     */
    @JsonProperty(FIELD_UTILPARAM8)
    public void setUtilParam8(Integer utilParam8){
        this.set(FIELD_UTILPARAM8, utilParam8);
    }
    
    /**
     * 获取 功能参数8  
     * @return
     */
    @JsonIgnore
    public Integer getUtilParam8(){
        Object objValue = this.get(FIELD_UTILPARAM8);
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
    public boolean isUtilParam8Dirty(){
        if(this.contains(FIELD_UTILPARAM8)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能参数8
     */
    @JsonIgnore
    public void resetUtilParam8(){
        this.reset(FIELD_UTILPARAM8);
    }

    /**
     * 设置 功能参数8
     * <P>
     * 等同 {@link #setUtilParam8}
     * @param utilParam8
     */
    @JsonIgnore
    public PSDEUtil utilparam8(Integer utilParam8){
        this.setUtilParam8(utilParam8);
        return this;
    }

    /**
     * <B>UTILPARAM9</B>&nbsp;功能参数9
     */
    public final static String FIELD_UTILPARAM9 = "utilparam9";

    /**
     * 设置 功能参数9
     * 
     * @param utilParam9
     * 
     */
    @JsonProperty(FIELD_UTILPARAM9)
    public void setUtilParam9(Integer utilParam9){
        this.set(FIELD_UTILPARAM9, utilParam9);
    }
    
    /**
     * 获取 功能参数9  
     * @return
     */
    @JsonIgnore
    public Integer getUtilParam9(){
        Object objValue = this.get(FIELD_UTILPARAM9);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 功能参数9 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilParam9Dirty(){
        if(this.contains(FIELD_UTILPARAM9)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能参数9
     */
    @JsonIgnore
    public void resetUtilParam9(){
        this.reset(FIELD_UTILPARAM9);
    }

    /**
     * 设置 功能参数9
     * <P>
     * 等同 {@link #setUtilParam9}
     * @param utilParam9
     */
    @JsonIgnore
    public PSDEUtil utilparam9(Integer utilParam9){
        this.setUtilParam9(utilParam9);
        return this;
    }

    /**
     * <B>UTILPARAMS</B>&nbsp;功能参数，指定实体功能配置的功能参数集合
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_UTILPARAMS = "utilparams";

    /**
     * 设置 功能参数，详细说明：{@link #FIELD_UTILPARAMS}
     * 
     * @param utilParams
     * 
     */
    @JsonProperty(FIELD_UTILPARAMS)
    public void setUtilParams(String utilParams){
        this.set(FIELD_UTILPARAMS, utilParams);
    }
    
    /**
     * 获取 功能参数  
     * @return
     */
    @JsonIgnore
    public String getUtilParams(){
        Object objValue = this.get(FIELD_UTILPARAMS);
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
    public boolean isUtilParamsDirty(){
        if(this.contains(FIELD_UTILPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能参数
     */
    @JsonIgnore
    public void resetUtilParams(){
        this.reset(FIELD_UTILPARAMS);
    }

    /**
     * 设置 功能参数，详细说明：{@link #FIELD_UTILPARAMS}
     * <P>
     * 等同 {@link #setUtilParams}
     * @param utilParams
     */
    @JsonIgnore
    public PSDEUtil utilparams(String utilParams){
        this.setUtilParams(utilParams);
        return this;
    }

    /**
     * <B>UTILPSDE10ID</B>&nbsp;功能实体10
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_UTILPSDE10ID = "utilpsde10id";

    /**
     * 设置 功能实体10
     * 
     * @param utilPSDE10Id
     * 
     */
    @JsonProperty(FIELD_UTILPSDE10ID)
    public void setUtilPSDE10Id(String utilPSDE10Id){
        this.set(FIELD_UTILPSDE10ID, utilPSDE10Id);
    }
    
    /**
     * 获取 功能实体10  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE10Id(){
        Object objValue = this.get(FIELD_UTILPSDE10ID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体10 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE10IdDirty(){
        if(this.contains(FIELD_UTILPSDE10ID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体10
     */
    @JsonIgnore
    public void resetUtilPSDE10Id(){
        this.reset(FIELD_UTILPSDE10ID);
    }

    /**
     * 设置 功能实体10
     * <P>
     * 等同 {@link #setUtilPSDE10Id}
     * @param utilPSDE10Id
     */
    @JsonIgnore
    public PSDEUtil utilpsde10id(String utilPSDE10Id){
        this.setUtilPSDE10Id(utilPSDE10Id);
        return this;
    }

    /**
     * 设置 功能实体10，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUtilPSDE10Id}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDEUtil utilpsde10id(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setUtilPSDE10Id(null);
            this.setUtilPSDE10Name(null);
        }
        else{
            this.setUtilPSDE10Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE10Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>UTILPSDE10NAME</B>&nbsp;功能实体10
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UTILPSDE10ID}
     */
    public final static String FIELD_UTILPSDE10NAME = "utilpsde10name";

    /**
     * 设置 功能实体10
     * 
     * @param utilPSDE10Name
     * 
     */
    @JsonProperty(FIELD_UTILPSDE10NAME)
    public void setUtilPSDE10Name(String utilPSDE10Name){
        this.set(FIELD_UTILPSDE10NAME, utilPSDE10Name);
    }
    
    /**
     * 获取 功能实体10  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE10Name(){
        Object objValue = this.get(FIELD_UTILPSDE10NAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体10 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE10NameDirty(){
        if(this.contains(FIELD_UTILPSDE10NAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体10
     */
    @JsonIgnore
    public void resetUtilPSDE10Name(){
        this.reset(FIELD_UTILPSDE10NAME);
    }

    /**
     * 设置 功能实体10
     * <P>
     * 等同 {@link #setUtilPSDE10Name}
     * @param utilPSDE10Name
     */
    @JsonIgnore
    public PSDEUtil utilpsde10name(String utilPSDE10Name){
        this.setUtilPSDE10Name(utilPSDE10Name);
        return this;
    }

    /**
     * <B>UTILPSDE11ID</B>&nbsp;功能实体11
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_UTILPSDE11ID = "utilpsde11id";

    /**
     * 设置 功能实体11
     * 
     * @param utilPSDE11Id
     * 
     */
    @JsonProperty(FIELD_UTILPSDE11ID)
    public void setUtilPSDE11Id(String utilPSDE11Id){
        this.set(FIELD_UTILPSDE11ID, utilPSDE11Id);
    }
    
    /**
     * 获取 功能实体11  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE11Id(){
        Object objValue = this.get(FIELD_UTILPSDE11ID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体11 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE11IdDirty(){
        if(this.contains(FIELD_UTILPSDE11ID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体11
     */
    @JsonIgnore
    public void resetUtilPSDE11Id(){
        this.reset(FIELD_UTILPSDE11ID);
    }

    /**
     * 设置 功能实体11
     * <P>
     * 等同 {@link #setUtilPSDE11Id}
     * @param utilPSDE11Id
     */
    @JsonIgnore
    public PSDEUtil utilpsde11id(String utilPSDE11Id){
        this.setUtilPSDE11Id(utilPSDE11Id);
        return this;
    }

    /**
     * 设置 功能实体11，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUtilPSDE11Id}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDEUtil utilpsde11id(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setUtilPSDE11Id(null);
            this.setUtilPSDE11Name(null);
        }
        else{
            this.setUtilPSDE11Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE11Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>UTILPSDE11NAME</B>&nbsp;功能实体11
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UTILPSDE11ID}
     */
    public final static String FIELD_UTILPSDE11NAME = "utilpsde11name";

    /**
     * 设置 功能实体11
     * 
     * @param utilPSDE11Name
     * 
     */
    @JsonProperty(FIELD_UTILPSDE11NAME)
    public void setUtilPSDE11Name(String utilPSDE11Name){
        this.set(FIELD_UTILPSDE11NAME, utilPSDE11Name);
    }
    
    /**
     * 获取 功能实体11  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE11Name(){
        Object objValue = this.get(FIELD_UTILPSDE11NAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体11 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE11NameDirty(){
        if(this.contains(FIELD_UTILPSDE11NAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体11
     */
    @JsonIgnore
    public void resetUtilPSDE11Name(){
        this.reset(FIELD_UTILPSDE11NAME);
    }

    /**
     * 设置 功能实体11
     * <P>
     * 等同 {@link #setUtilPSDE11Name}
     * @param utilPSDE11Name
     */
    @JsonIgnore
    public PSDEUtil utilpsde11name(String utilPSDE11Name){
        this.setUtilPSDE11Name(utilPSDE11Name);
        return this;
    }

    /**
     * <B>UTILPSDE12ID</B>&nbsp;功能实体12
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_UTILPSDE12ID = "utilpsde12id";

    /**
     * 设置 功能实体12
     * 
     * @param utilPSDE12Id
     * 
     */
    @JsonProperty(FIELD_UTILPSDE12ID)
    public void setUtilPSDE12Id(String utilPSDE12Id){
        this.set(FIELD_UTILPSDE12ID, utilPSDE12Id);
    }
    
    /**
     * 获取 功能实体12  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE12Id(){
        Object objValue = this.get(FIELD_UTILPSDE12ID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体12 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE12IdDirty(){
        if(this.contains(FIELD_UTILPSDE12ID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体12
     */
    @JsonIgnore
    public void resetUtilPSDE12Id(){
        this.reset(FIELD_UTILPSDE12ID);
    }

    /**
     * 设置 功能实体12
     * <P>
     * 等同 {@link #setUtilPSDE12Id}
     * @param utilPSDE12Id
     */
    @JsonIgnore
    public PSDEUtil utilpsde12id(String utilPSDE12Id){
        this.setUtilPSDE12Id(utilPSDE12Id);
        return this;
    }

    /**
     * 设置 功能实体12，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUtilPSDE12Id}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDEUtil utilpsde12id(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setUtilPSDE12Id(null);
            this.setUtilPSDE12Name(null);
        }
        else{
            this.setUtilPSDE12Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE12Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>UTILPSDE12NAME</B>&nbsp;功能实体12
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UTILPSDE12ID}
     */
    public final static String FIELD_UTILPSDE12NAME = "utilpsde12name";

    /**
     * 设置 功能实体12
     * 
     * @param utilPSDE12Name
     * 
     */
    @JsonProperty(FIELD_UTILPSDE12NAME)
    public void setUtilPSDE12Name(String utilPSDE12Name){
        this.set(FIELD_UTILPSDE12NAME, utilPSDE12Name);
    }
    
    /**
     * 获取 功能实体12  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE12Name(){
        Object objValue = this.get(FIELD_UTILPSDE12NAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体12 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE12NameDirty(){
        if(this.contains(FIELD_UTILPSDE12NAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体12
     */
    @JsonIgnore
    public void resetUtilPSDE12Name(){
        this.reset(FIELD_UTILPSDE12NAME);
    }

    /**
     * 设置 功能实体12
     * <P>
     * 等同 {@link #setUtilPSDE12Name}
     * @param utilPSDE12Name
     */
    @JsonIgnore
    public PSDEUtil utilpsde12name(String utilPSDE12Name){
        this.setUtilPSDE12Name(utilPSDE12Name);
        return this;
    }

    /**
     * <B>UTILPSDE13ID</B>&nbsp;功能实体13
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_UTILPSDE13ID = "utilpsde13id";

    /**
     * 设置 功能实体13
     * 
     * @param utilPSDE13Id
     * 
     */
    @JsonProperty(FIELD_UTILPSDE13ID)
    public void setUtilPSDE13Id(String utilPSDE13Id){
        this.set(FIELD_UTILPSDE13ID, utilPSDE13Id);
    }
    
    /**
     * 获取 功能实体13  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE13Id(){
        Object objValue = this.get(FIELD_UTILPSDE13ID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体13 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE13IdDirty(){
        if(this.contains(FIELD_UTILPSDE13ID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体13
     */
    @JsonIgnore
    public void resetUtilPSDE13Id(){
        this.reset(FIELD_UTILPSDE13ID);
    }

    /**
     * 设置 功能实体13
     * <P>
     * 等同 {@link #setUtilPSDE13Id}
     * @param utilPSDE13Id
     */
    @JsonIgnore
    public PSDEUtil utilpsde13id(String utilPSDE13Id){
        this.setUtilPSDE13Id(utilPSDE13Id);
        return this;
    }

    /**
     * 设置 功能实体13，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUtilPSDE13Id}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDEUtil utilpsde13id(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setUtilPSDE13Id(null);
            this.setUtilPSDE13Name(null);
        }
        else{
            this.setUtilPSDE13Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE13Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>UTILPSDE13NAME</B>&nbsp;功能实体13
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UTILPSDE13ID}
     */
    public final static String FIELD_UTILPSDE13NAME = "utilpsde13name";

    /**
     * 设置 功能实体13
     * 
     * @param utilPSDE13Name
     * 
     */
    @JsonProperty(FIELD_UTILPSDE13NAME)
    public void setUtilPSDE13Name(String utilPSDE13Name){
        this.set(FIELD_UTILPSDE13NAME, utilPSDE13Name);
    }
    
    /**
     * 获取 功能实体13  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE13Name(){
        Object objValue = this.get(FIELD_UTILPSDE13NAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体13 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE13NameDirty(){
        if(this.contains(FIELD_UTILPSDE13NAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体13
     */
    @JsonIgnore
    public void resetUtilPSDE13Name(){
        this.reset(FIELD_UTILPSDE13NAME);
    }

    /**
     * 设置 功能实体13
     * <P>
     * 等同 {@link #setUtilPSDE13Name}
     * @param utilPSDE13Name
     */
    @JsonIgnore
    public PSDEUtil utilpsde13name(String utilPSDE13Name){
        this.setUtilPSDE13Name(utilPSDE13Name);
        return this;
    }

    /**
     * <B>UTILPSDE14ID</B>&nbsp;功能实体14
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_UTILPSDE14ID = "utilpsde14id";

    /**
     * 设置 功能实体14
     * 
     * @param utilPSDE14Id
     * 
     */
    @JsonProperty(FIELD_UTILPSDE14ID)
    public void setUtilPSDE14Id(String utilPSDE14Id){
        this.set(FIELD_UTILPSDE14ID, utilPSDE14Id);
    }
    
    /**
     * 获取 功能实体14  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE14Id(){
        Object objValue = this.get(FIELD_UTILPSDE14ID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体14 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE14IdDirty(){
        if(this.contains(FIELD_UTILPSDE14ID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体14
     */
    @JsonIgnore
    public void resetUtilPSDE14Id(){
        this.reset(FIELD_UTILPSDE14ID);
    }

    /**
     * 设置 功能实体14
     * <P>
     * 等同 {@link #setUtilPSDE14Id}
     * @param utilPSDE14Id
     */
    @JsonIgnore
    public PSDEUtil utilpsde14id(String utilPSDE14Id){
        this.setUtilPSDE14Id(utilPSDE14Id);
        return this;
    }

    /**
     * 设置 功能实体14，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUtilPSDE14Id}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDEUtil utilpsde14id(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setUtilPSDE14Id(null);
            this.setUtilPSDE14Name(null);
        }
        else{
            this.setUtilPSDE14Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE14Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>UTILPSDE14NAME</B>&nbsp;功能实体14
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UTILPSDE14ID}
     */
    public final static String FIELD_UTILPSDE14NAME = "utilpsde14name";

    /**
     * 设置 功能实体14
     * 
     * @param utilPSDE14Name
     * 
     */
    @JsonProperty(FIELD_UTILPSDE14NAME)
    public void setUtilPSDE14Name(String utilPSDE14Name){
        this.set(FIELD_UTILPSDE14NAME, utilPSDE14Name);
    }
    
    /**
     * 获取 功能实体14  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE14Name(){
        Object objValue = this.get(FIELD_UTILPSDE14NAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体14 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE14NameDirty(){
        if(this.contains(FIELD_UTILPSDE14NAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体14
     */
    @JsonIgnore
    public void resetUtilPSDE14Name(){
        this.reset(FIELD_UTILPSDE14NAME);
    }

    /**
     * 设置 功能实体14
     * <P>
     * 等同 {@link #setUtilPSDE14Name}
     * @param utilPSDE14Name
     */
    @JsonIgnore
    public PSDEUtil utilpsde14name(String utilPSDE14Name){
        this.setUtilPSDE14Name(utilPSDE14Name);
        return this;
    }

    /**
     * <B>UTILPSDE15ID</B>&nbsp;功能实体15
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_UTILPSDE15ID = "utilpsde15id";

    /**
     * 设置 功能实体15
     * 
     * @param utilPSDE15Id
     * 
     */
    @JsonProperty(FIELD_UTILPSDE15ID)
    public void setUtilPSDE15Id(String utilPSDE15Id){
        this.set(FIELD_UTILPSDE15ID, utilPSDE15Id);
    }
    
    /**
     * 获取 功能实体15  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE15Id(){
        Object objValue = this.get(FIELD_UTILPSDE15ID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体15 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE15IdDirty(){
        if(this.contains(FIELD_UTILPSDE15ID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体15
     */
    @JsonIgnore
    public void resetUtilPSDE15Id(){
        this.reset(FIELD_UTILPSDE15ID);
    }

    /**
     * 设置 功能实体15
     * <P>
     * 等同 {@link #setUtilPSDE15Id}
     * @param utilPSDE15Id
     */
    @JsonIgnore
    public PSDEUtil utilpsde15id(String utilPSDE15Id){
        this.setUtilPSDE15Id(utilPSDE15Id);
        return this;
    }

    /**
     * 设置 功能实体15，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUtilPSDE15Id}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDEUtil utilpsde15id(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setUtilPSDE15Id(null);
            this.setUtilPSDE15Name(null);
        }
        else{
            this.setUtilPSDE15Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE15Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>UTILPSDE15NAME</B>&nbsp;功能实体15
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UTILPSDE15ID}
     */
    public final static String FIELD_UTILPSDE15NAME = "utilpsde15name";

    /**
     * 设置 功能实体15
     * 
     * @param utilPSDE15Name
     * 
     */
    @JsonProperty(FIELD_UTILPSDE15NAME)
    public void setUtilPSDE15Name(String utilPSDE15Name){
        this.set(FIELD_UTILPSDE15NAME, utilPSDE15Name);
    }
    
    /**
     * 获取 功能实体15  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE15Name(){
        Object objValue = this.get(FIELD_UTILPSDE15NAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体15 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE15NameDirty(){
        if(this.contains(FIELD_UTILPSDE15NAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体15
     */
    @JsonIgnore
    public void resetUtilPSDE15Name(){
        this.reset(FIELD_UTILPSDE15NAME);
    }

    /**
     * 设置 功能实体15
     * <P>
     * 等同 {@link #setUtilPSDE15Name}
     * @param utilPSDE15Name
     */
    @JsonIgnore
    public PSDEUtil utilpsde15name(String utilPSDE15Name){
        this.setUtilPSDE15Name(utilPSDE15Name);
        return this;
    }

    /**
     * <B>UTILPSDE16ID</B>&nbsp;功能实体16
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_UTILPSDE16ID = "utilpsde16id";

    /**
     * 设置 功能实体16
     * 
     * @param utilPSDE16Id
     * 
     */
    @JsonProperty(FIELD_UTILPSDE16ID)
    public void setUtilPSDE16Id(String utilPSDE16Id){
        this.set(FIELD_UTILPSDE16ID, utilPSDE16Id);
    }
    
    /**
     * 获取 功能实体16  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE16Id(){
        Object objValue = this.get(FIELD_UTILPSDE16ID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体16 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE16IdDirty(){
        if(this.contains(FIELD_UTILPSDE16ID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体16
     */
    @JsonIgnore
    public void resetUtilPSDE16Id(){
        this.reset(FIELD_UTILPSDE16ID);
    }

    /**
     * 设置 功能实体16
     * <P>
     * 等同 {@link #setUtilPSDE16Id}
     * @param utilPSDE16Id
     */
    @JsonIgnore
    public PSDEUtil utilpsde16id(String utilPSDE16Id){
        this.setUtilPSDE16Id(utilPSDE16Id);
        return this;
    }

    /**
     * 设置 功能实体16，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUtilPSDE16Id}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDEUtil utilpsde16id(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setUtilPSDE16Id(null);
            this.setUtilPSDE16Name(null);
        }
        else{
            this.setUtilPSDE16Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE16Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>UTILPSDE16NAME</B>&nbsp;功能实体16
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UTILPSDE16ID}
     */
    public final static String FIELD_UTILPSDE16NAME = "utilpsde16name";

    /**
     * 设置 功能实体16
     * 
     * @param utilPSDE16Name
     * 
     */
    @JsonProperty(FIELD_UTILPSDE16NAME)
    public void setUtilPSDE16Name(String utilPSDE16Name){
        this.set(FIELD_UTILPSDE16NAME, utilPSDE16Name);
    }
    
    /**
     * 获取 功能实体16  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE16Name(){
        Object objValue = this.get(FIELD_UTILPSDE16NAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体16 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE16NameDirty(){
        if(this.contains(FIELD_UTILPSDE16NAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体16
     */
    @JsonIgnore
    public void resetUtilPSDE16Name(){
        this.reset(FIELD_UTILPSDE16NAME);
    }

    /**
     * 设置 功能实体16
     * <P>
     * 等同 {@link #setUtilPSDE16Name}
     * @param utilPSDE16Name
     */
    @JsonIgnore
    public PSDEUtil utilpsde16name(String utilPSDE16Name){
        this.setUtilPSDE16Name(utilPSDE16Name);
        return this;
    }

    /**
     * <B>UTILPSDE17ID</B>&nbsp;功能实体17
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_UTILPSDE17ID = "utilpsde17id";

    /**
     * 设置 功能实体17
     * 
     * @param utilPSDE17Id
     * 
     */
    @JsonProperty(FIELD_UTILPSDE17ID)
    public void setUtilPSDE17Id(String utilPSDE17Id){
        this.set(FIELD_UTILPSDE17ID, utilPSDE17Id);
    }
    
    /**
     * 获取 功能实体17  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE17Id(){
        Object objValue = this.get(FIELD_UTILPSDE17ID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体17 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE17IdDirty(){
        if(this.contains(FIELD_UTILPSDE17ID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体17
     */
    @JsonIgnore
    public void resetUtilPSDE17Id(){
        this.reset(FIELD_UTILPSDE17ID);
    }

    /**
     * 设置 功能实体17
     * <P>
     * 等同 {@link #setUtilPSDE17Id}
     * @param utilPSDE17Id
     */
    @JsonIgnore
    public PSDEUtil utilpsde17id(String utilPSDE17Id){
        this.setUtilPSDE17Id(utilPSDE17Id);
        return this;
    }

    /**
     * 设置 功能实体17，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUtilPSDE17Id}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDEUtil utilpsde17id(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setUtilPSDE17Id(null);
            this.setUtilPSDE17Name(null);
        }
        else{
            this.setUtilPSDE17Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE17Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>UTILPSDE17NAME</B>&nbsp;功能实体17
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UTILPSDE17ID}
     */
    public final static String FIELD_UTILPSDE17NAME = "utilpsde17name";

    /**
     * 设置 功能实体17
     * 
     * @param utilPSDE17Name
     * 
     */
    @JsonProperty(FIELD_UTILPSDE17NAME)
    public void setUtilPSDE17Name(String utilPSDE17Name){
        this.set(FIELD_UTILPSDE17NAME, utilPSDE17Name);
    }
    
    /**
     * 获取 功能实体17  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE17Name(){
        Object objValue = this.get(FIELD_UTILPSDE17NAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体17 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE17NameDirty(){
        if(this.contains(FIELD_UTILPSDE17NAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体17
     */
    @JsonIgnore
    public void resetUtilPSDE17Name(){
        this.reset(FIELD_UTILPSDE17NAME);
    }

    /**
     * 设置 功能实体17
     * <P>
     * 等同 {@link #setUtilPSDE17Name}
     * @param utilPSDE17Name
     */
    @JsonIgnore
    public PSDEUtil utilpsde17name(String utilPSDE17Name){
        this.setUtilPSDE17Name(utilPSDE17Name);
        return this;
    }

    /**
     * <B>UTILPSDE18ID</B>&nbsp;功能实体18
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_UTILPSDE18ID = "utilpsde18id";

    /**
     * 设置 功能实体18
     * 
     * @param utilPSDE18Id
     * 
     */
    @JsonProperty(FIELD_UTILPSDE18ID)
    public void setUtilPSDE18Id(String utilPSDE18Id){
        this.set(FIELD_UTILPSDE18ID, utilPSDE18Id);
    }
    
    /**
     * 获取 功能实体18  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE18Id(){
        Object objValue = this.get(FIELD_UTILPSDE18ID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体18 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE18IdDirty(){
        if(this.contains(FIELD_UTILPSDE18ID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体18
     */
    @JsonIgnore
    public void resetUtilPSDE18Id(){
        this.reset(FIELD_UTILPSDE18ID);
    }

    /**
     * 设置 功能实体18
     * <P>
     * 等同 {@link #setUtilPSDE18Id}
     * @param utilPSDE18Id
     */
    @JsonIgnore
    public PSDEUtil utilpsde18id(String utilPSDE18Id){
        this.setUtilPSDE18Id(utilPSDE18Id);
        return this;
    }

    /**
     * 设置 功能实体18，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUtilPSDE18Id}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDEUtil utilpsde18id(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setUtilPSDE18Id(null);
            this.setUtilPSDE18Name(null);
        }
        else{
            this.setUtilPSDE18Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE18Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>UTILPSDE18NAME</B>&nbsp;功能实体18
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UTILPSDE18ID}
     */
    public final static String FIELD_UTILPSDE18NAME = "utilpsde18name";

    /**
     * 设置 功能实体18
     * 
     * @param utilPSDE18Name
     * 
     */
    @JsonProperty(FIELD_UTILPSDE18NAME)
    public void setUtilPSDE18Name(String utilPSDE18Name){
        this.set(FIELD_UTILPSDE18NAME, utilPSDE18Name);
    }
    
    /**
     * 获取 功能实体18  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE18Name(){
        Object objValue = this.get(FIELD_UTILPSDE18NAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体18 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE18NameDirty(){
        if(this.contains(FIELD_UTILPSDE18NAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体18
     */
    @JsonIgnore
    public void resetUtilPSDE18Name(){
        this.reset(FIELD_UTILPSDE18NAME);
    }

    /**
     * 设置 功能实体18
     * <P>
     * 等同 {@link #setUtilPSDE18Name}
     * @param utilPSDE18Name
     */
    @JsonIgnore
    public PSDEUtil utilpsde18name(String utilPSDE18Name){
        this.setUtilPSDE18Name(utilPSDE18Name);
        return this;
    }

    /**
     * <B>UTILPSDE19ID</B>&nbsp;功能实体19
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_UTILPSDE19ID = "utilpsde19id";

    /**
     * 设置 功能实体19
     * 
     * @param utilPSDE19Id
     * 
     */
    @JsonProperty(FIELD_UTILPSDE19ID)
    public void setUtilPSDE19Id(String utilPSDE19Id){
        this.set(FIELD_UTILPSDE19ID, utilPSDE19Id);
    }
    
    /**
     * 获取 功能实体19  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE19Id(){
        Object objValue = this.get(FIELD_UTILPSDE19ID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体19 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE19IdDirty(){
        if(this.contains(FIELD_UTILPSDE19ID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体19
     */
    @JsonIgnore
    public void resetUtilPSDE19Id(){
        this.reset(FIELD_UTILPSDE19ID);
    }

    /**
     * 设置 功能实体19
     * <P>
     * 等同 {@link #setUtilPSDE19Id}
     * @param utilPSDE19Id
     */
    @JsonIgnore
    public PSDEUtil utilpsde19id(String utilPSDE19Id){
        this.setUtilPSDE19Id(utilPSDE19Id);
        return this;
    }

    /**
     * 设置 功能实体19，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUtilPSDE19Id}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDEUtil utilpsde19id(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setUtilPSDE19Id(null);
            this.setUtilPSDE19Name(null);
        }
        else{
            this.setUtilPSDE19Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE19Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>UTILPSDE19NAME</B>&nbsp;功能实体19
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UTILPSDE19ID}
     */
    public final static String FIELD_UTILPSDE19NAME = "utilpsde19name";

    /**
     * 设置 功能实体19
     * 
     * @param utilPSDE19Name
     * 
     */
    @JsonProperty(FIELD_UTILPSDE19NAME)
    public void setUtilPSDE19Name(String utilPSDE19Name){
        this.set(FIELD_UTILPSDE19NAME, utilPSDE19Name);
    }
    
    /**
     * 获取 功能实体19  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE19Name(){
        Object objValue = this.get(FIELD_UTILPSDE19NAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体19 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE19NameDirty(){
        if(this.contains(FIELD_UTILPSDE19NAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体19
     */
    @JsonIgnore
    public void resetUtilPSDE19Name(){
        this.reset(FIELD_UTILPSDE19NAME);
    }

    /**
     * 设置 功能实体19
     * <P>
     * 等同 {@link #setUtilPSDE19Name}
     * @param utilPSDE19Name
     */
    @JsonIgnore
    public PSDEUtil utilpsde19name(String utilPSDE19Name){
        this.setUtilPSDE19Name(utilPSDE19Name);
        return this;
    }

    /**
     * <B>UTILPSDE20ID</B>&nbsp;功能实体20
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_UTILPSDE20ID = "utilpsde20id";

    /**
     * 设置 功能实体20
     * 
     * @param utilPSDE20Id
     * 
     */
    @JsonProperty(FIELD_UTILPSDE20ID)
    public void setUtilPSDE20Id(String utilPSDE20Id){
        this.set(FIELD_UTILPSDE20ID, utilPSDE20Id);
    }
    
    /**
     * 获取 功能实体20  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE20Id(){
        Object objValue = this.get(FIELD_UTILPSDE20ID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体20 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE20IdDirty(){
        if(this.contains(FIELD_UTILPSDE20ID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体20
     */
    @JsonIgnore
    public void resetUtilPSDE20Id(){
        this.reset(FIELD_UTILPSDE20ID);
    }

    /**
     * 设置 功能实体20
     * <P>
     * 等同 {@link #setUtilPSDE20Id}
     * @param utilPSDE20Id
     */
    @JsonIgnore
    public PSDEUtil utilpsde20id(String utilPSDE20Id){
        this.setUtilPSDE20Id(utilPSDE20Id);
        return this;
    }

    /**
     * 设置 功能实体20，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUtilPSDE20Id}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDEUtil utilpsde20id(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setUtilPSDE20Id(null);
            this.setUtilPSDE20Name(null);
        }
        else{
            this.setUtilPSDE20Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE20Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>UTILPSDE20NAME</B>&nbsp;功能实体20
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UTILPSDE20ID}
     */
    public final static String FIELD_UTILPSDE20NAME = "utilpsde20name";

    /**
     * 设置 功能实体20
     * 
     * @param utilPSDE20Name
     * 
     */
    @JsonProperty(FIELD_UTILPSDE20NAME)
    public void setUtilPSDE20Name(String utilPSDE20Name){
        this.set(FIELD_UTILPSDE20NAME, utilPSDE20Name);
    }
    
    /**
     * 获取 功能实体20  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE20Name(){
        Object objValue = this.get(FIELD_UTILPSDE20NAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体20 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE20NameDirty(){
        if(this.contains(FIELD_UTILPSDE20NAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体20
     */
    @JsonIgnore
    public void resetUtilPSDE20Name(){
        this.reset(FIELD_UTILPSDE20NAME);
    }

    /**
     * 设置 功能实体20
     * <P>
     * 等同 {@link #setUtilPSDE20Name}
     * @param utilPSDE20Name
     */
    @JsonIgnore
    public PSDEUtil utilpsde20name(String utilPSDE20Name){
        this.setUtilPSDE20Name(utilPSDE20Name);
        return this;
    }

    /**
     * <B>UTILPSDE2ID</B>&nbsp;相关实体2，指定实体功能配置的相关实体2
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_UTILPSDE2ID = "utilpsde2id";

    /**
     * 设置 相关实体2，详细说明：{@link #FIELD_UTILPSDE2ID}
     * 
     * @param utilPSDE2Id
     * 
     */
    @JsonProperty(FIELD_UTILPSDE2ID)
    public void setUtilPSDE2Id(String utilPSDE2Id){
        this.set(FIELD_UTILPSDE2ID, utilPSDE2Id);
    }
    
    /**
     * 获取 相关实体2  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE2Id(){
        Object objValue = this.get(FIELD_UTILPSDE2ID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 相关实体2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE2IdDirty(){
        if(this.contains(FIELD_UTILPSDE2ID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 相关实体2
     */
    @JsonIgnore
    public void resetUtilPSDE2Id(){
        this.reset(FIELD_UTILPSDE2ID);
    }

    /**
     * 设置 相关实体2，详细说明：{@link #FIELD_UTILPSDE2ID}
     * <P>
     * 等同 {@link #setUtilPSDE2Id}
     * @param utilPSDE2Id
     */
    @JsonIgnore
    public PSDEUtil utilpsde2id(String utilPSDE2Id){
        this.setUtilPSDE2Id(utilPSDE2Id);
        return this;
    }

    /**
     * 设置 相关实体2，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUtilPSDE2Id}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDEUtil utilpsde2id(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setUtilPSDE2Id(null);
            this.setUtilPSDE2Name(null);
        }
        else{
            this.setUtilPSDE2Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE2Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>UTILPSDE2NAME</B>&nbsp;相关实体2，指定实体功能配置的相关实体2
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UTILPSDE2ID}
     */
    public final static String FIELD_UTILPSDE2NAME = "utilpsde2name";

    /**
     * 设置 相关实体2，详细说明：{@link #FIELD_UTILPSDE2NAME}
     * 
     * @param utilPSDE2Name
     * 
     */
    @JsonProperty(FIELD_UTILPSDE2NAME)
    public void setUtilPSDE2Name(String utilPSDE2Name){
        this.set(FIELD_UTILPSDE2NAME, utilPSDE2Name);
    }
    
    /**
     * 获取 相关实体2  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE2Name(){
        Object objValue = this.get(FIELD_UTILPSDE2NAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 相关实体2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE2NameDirty(){
        if(this.contains(FIELD_UTILPSDE2NAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 相关实体2
     */
    @JsonIgnore
    public void resetUtilPSDE2Name(){
        this.reset(FIELD_UTILPSDE2NAME);
    }

    /**
     * 设置 相关实体2，详细说明：{@link #FIELD_UTILPSDE2NAME}
     * <P>
     * 等同 {@link #setUtilPSDE2Name}
     * @param utilPSDE2Name
     */
    @JsonIgnore
    public PSDEUtil utilpsde2name(String utilPSDE2Name){
        this.setUtilPSDE2Name(utilPSDE2Name);
        return this;
    }

    /**
     * <B>UTILPSDE3ID</B>&nbsp;功能实体3
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_UTILPSDE3ID = "utilpsde3id";

    /**
     * 设置 功能实体3
     * 
     * @param utilPSDE3Id
     * 
     */
    @JsonProperty(FIELD_UTILPSDE3ID)
    public void setUtilPSDE3Id(String utilPSDE3Id){
        this.set(FIELD_UTILPSDE3ID, utilPSDE3Id);
    }
    
    /**
     * 获取 功能实体3  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE3Id(){
        Object objValue = this.get(FIELD_UTILPSDE3ID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE3IdDirty(){
        if(this.contains(FIELD_UTILPSDE3ID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体3
     */
    @JsonIgnore
    public void resetUtilPSDE3Id(){
        this.reset(FIELD_UTILPSDE3ID);
    }

    /**
     * 设置 功能实体3
     * <P>
     * 等同 {@link #setUtilPSDE3Id}
     * @param utilPSDE3Id
     */
    @JsonIgnore
    public PSDEUtil utilpsde3id(String utilPSDE3Id){
        this.setUtilPSDE3Id(utilPSDE3Id);
        return this;
    }

    /**
     * 设置 功能实体3，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUtilPSDE3Id}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDEUtil utilpsde3id(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setUtilPSDE3Id(null);
            this.setUtilPSDE3Name(null);
        }
        else{
            this.setUtilPSDE3Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE3Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>UTILPSDE3NAME</B>&nbsp;功能实体3
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UTILPSDE3ID}
     */
    public final static String FIELD_UTILPSDE3NAME = "utilpsde3name";

    /**
     * 设置 功能实体3
     * 
     * @param utilPSDE3Name
     * 
     */
    @JsonProperty(FIELD_UTILPSDE3NAME)
    public void setUtilPSDE3Name(String utilPSDE3Name){
        this.set(FIELD_UTILPSDE3NAME, utilPSDE3Name);
    }
    
    /**
     * 获取 功能实体3  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE3Name(){
        Object objValue = this.get(FIELD_UTILPSDE3NAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE3NameDirty(){
        if(this.contains(FIELD_UTILPSDE3NAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体3
     */
    @JsonIgnore
    public void resetUtilPSDE3Name(){
        this.reset(FIELD_UTILPSDE3NAME);
    }

    /**
     * 设置 功能实体3
     * <P>
     * 等同 {@link #setUtilPSDE3Name}
     * @param utilPSDE3Name
     */
    @JsonIgnore
    public PSDEUtil utilpsde3name(String utilPSDE3Name){
        this.setUtilPSDE3Name(utilPSDE3Name);
        return this;
    }

    /**
     * <B>UTILPSDE4ID</B>&nbsp;功能实体4
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_UTILPSDE4ID = "utilpsde4id";

    /**
     * 设置 功能实体4
     * 
     * @param utilPSDE4Id
     * 
     */
    @JsonProperty(FIELD_UTILPSDE4ID)
    public void setUtilPSDE4Id(String utilPSDE4Id){
        this.set(FIELD_UTILPSDE4ID, utilPSDE4Id);
    }
    
    /**
     * 获取 功能实体4  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE4Id(){
        Object objValue = this.get(FIELD_UTILPSDE4ID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE4IdDirty(){
        if(this.contains(FIELD_UTILPSDE4ID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体4
     */
    @JsonIgnore
    public void resetUtilPSDE4Id(){
        this.reset(FIELD_UTILPSDE4ID);
    }

    /**
     * 设置 功能实体4
     * <P>
     * 等同 {@link #setUtilPSDE4Id}
     * @param utilPSDE4Id
     */
    @JsonIgnore
    public PSDEUtil utilpsde4id(String utilPSDE4Id){
        this.setUtilPSDE4Id(utilPSDE4Id);
        return this;
    }

    /**
     * 设置 功能实体4，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUtilPSDE4Id}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDEUtil utilpsde4id(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setUtilPSDE4Id(null);
            this.setUtilPSDE4Name(null);
        }
        else{
            this.setUtilPSDE4Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE4Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>UTILPSDE4NAME</B>&nbsp;功能实体4
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UTILPSDE4ID}
     */
    public final static String FIELD_UTILPSDE4NAME = "utilpsde4name";

    /**
     * 设置 功能实体4
     * 
     * @param utilPSDE4Name
     * 
     */
    @JsonProperty(FIELD_UTILPSDE4NAME)
    public void setUtilPSDE4Name(String utilPSDE4Name){
        this.set(FIELD_UTILPSDE4NAME, utilPSDE4Name);
    }
    
    /**
     * 获取 功能实体4  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE4Name(){
        Object objValue = this.get(FIELD_UTILPSDE4NAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE4NameDirty(){
        if(this.contains(FIELD_UTILPSDE4NAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体4
     */
    @JsonIgnore
    public void resetUtilPSDE4Name(){
        this.reset(FIELD_UTILPSDE4NAME);
    }

    /**
     * 设置 功能实体4
     * <P>
     * 等同 {@link #setUtilPSDE4Name}
     * @param utilPSDE4Name
     */
    @JsonIgnore
    public PSDEUtil utilpsde4name(String utilPSDE4Name){
        this.setUtilPSDE4Name(utilPSDE4Name);
        return this;
    }

    /**
     * <B>UTILPSDE5ID</B>&nbsp;功能实体5
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_UTILPSDE5ID = "utilpsde5id";

    /**
     * 设置 功能实体5
     * 
     * @param utilPSDE5Id
     * 
     */
    @JsonProperty(FIELD_UTILPSDE5ID)
    public void setUtilPSDE5Id(String utilPSDE5Id){
        this.set(FIELD_UTILPSDE5ID, utilPSDE5Id);
    }
    
    /**
     * 获取 功能实体5  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE5Id(){
        Object objValue = this.get(FIELD_UTILPSDE5ID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体5 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE5IdDirty(){
        if(this.contains(FIELD_UTILPSDE5ID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体5
     */
    @JsonIgnore
    public void resetUtilPSDE5Id(){
        this.reset(FIELD_UTILPSDE5ID);
    }

    /**
     * 设置 功能实体5
     * <P>
     * 等同 {@link #setUtilPSDE5Id}
     * @param utilPSDE5Id
     */
    @JsonIgnore
    public PSDEUtil utilpsde5id(String utilPSDE5Id){
        this.setUtilPSDE5Id(utilPSDE5Id);
        return this;
    }

    /**
     * 设置 功能实体5，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUtilPSDE5Id}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDEUtil utilpsde5id(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setUtilPSDE5Id(null);
            this.setUtilPSDE5Name(null);
        }
        else{
            this.setUtilPSDE5Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE5Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>UTILPSDE5NAME</B>&nbsp;功能实体5
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UTILPSDE5ID}
     */
    public final static String FIELD_UTILPSDE5NAME = "utilpsde5name";

    /**
     * 设置 功能实体5
     * 
     * @param utilPSDE5Name
     * 
     */
    @JsonProperty(FIELD_UTILPSDE5NAME)
    public void setUtilPSDE5Name(String utilPSDE5Name){
        this.set(FIELD_UTILPSDE5NAME, utilPSDE5Name);
    }
    
    /**
     * 获取 功能实体5  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE5Name(){
        Object objValue = this.get(FIELD_UTILPSDE5NAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体5 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE5NameDirty(){
        if(this.contains(FIELD_UTILPSDE5NAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体5
     */
    @JsonIgnore
    public void resetUtilPSDE5Name(){
        this.reset(FIELD_UTILPSDE5NAME);
    }

    /**
     * 设置 功能实体5
     * <P>
     * 等同 {@link #setUtilPSDE5Name}
     * @param utilPSDE5Name
     */
    @JsonIgnore
    public PSDEUtil utilpsde5name(String utilPSDE5Name){
        this.setUtilPSDE5Name(utilPSDE5Name);
        return this;
    }

    /**
     * <B>UTILPSDE6ID</B>&nbsp;功能实体6
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_UTILPSDE6ID = "utilpsde6id";

    /**
     * 设置 功能实体6
     * 
     * @param utilPSDE6Id
     * 
     */
    @JsonProperty(FIELD_UTILPSDE6ID)
    public void setUtilPSDE6Id(String utilPSDE6Id){
        this.set(FIELD_UTILPSDE6ID, utilPSDE6Id);
    }
    
    /**
     * 获取 功能实体6  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE6Id(){
        Object objValue = this.get(FIELD_UTILPSDE6ID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体6 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE6IdDirty(){
        if(this.contains(FIELD_UTILPSDE6ID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体6
     */
    @JsonIgnore
    public void resetUtilPSDE6Id(){
        this.reset(FIELD_UTILPSDE6ID);
    }

    /**
     * 设置 功能实体6
     * <P>
     * 等同 {@link #setUtilPSDE6Id}
     * @param utilPSDE6Id
     */
    @JsonIgnore
    public PSDEUtil utilpsde6id(String utilPSDE6Id){
        this.setUtilPSDE6Id(utilPSDE6Id);
        return this;
    }

    /**
     * 设置 功能实体6，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUtilPSDE6Id}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDEUtil utilpsde6id(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setUtilPSDE6Id(null);
            this.setUtilPSDE6Name(null);
        }
        else{
            this.setUtilPSDE6Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE6Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>UTILPSDE6NAME</B>&nbsp;功能实体6
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UTILPSDE6ID}
     */
    public final static String FIELD_UTILPSDE6NAME = "utilpsde6name";

    /**
     * 设置 功能实体6
     * 
     * @param utilPSDE6Name
     * 
     */
    @JsonProperty(FIELD_UTILPSDE6NAME)
    public void setUtilPSDE6Name(String utilPSDE6Name){
        this.set(FIELD_UTILPSDE6NAME, utilPSDE6Name);
    }
    
    /**
     * 获取 功能实体6  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE6Name(){
        Object objValue = this.get(FIELD_UTILPSDE6NAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体6 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE6NameDirty(){
        if(this.contains(FIELD_UTILPSDE6NAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体6
     */
    @JsonIgnore
    public void resetUtilPSDE6Name(){
        this.reset(FIELD_UTILPSDE6NAME);
    }

    /**
     * 设置 功能实体6
     * <P>
     * 等同 {@link #setUtilPSDE6Name}
     * @param utilPSDE6Name
     */
    @JsonIgnore
    public PSDEUtil utilpsde6name(String utilPSDE6Name){
        this.setUtilPSDE6Name(utilPSDE6Name);
        return this;
    }

    /**
     * <B>UTILPSDE7ID</B>&nbsp;功能实体7
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_UTILPSDE7ID = "utilpsde7id";

    /**
     * 设置 功能实体7
     * 
     * @param utilPSDE7Id
     * 
     */
    @JsonProperty(FIELD_UTILPSDE7ID)
    public void setUtilPSDE7Id(String utilPSDE7Id){
        this.set(FIELD_UTILPSDE7ID, utilPSDE7Id);
    }
    
    /**
     * 获取 功能实体7  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE7Id(){
        Object objValue = this.get(FIELD_UTILPSDE7ID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体7 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE7IdDirty(){
        if(this.contains(FIELD_UTILPSDE7ID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体7
     */
    @JsonIgnore
    public void resetUtilPSDE7Id(){
        this.reset(FIELD_UTILPSDE7ID);
    }

    /**
     * 设置 功能实体7
     * <P>
     * 等同 {@link #setUtilPSDE7Id}
     * @param utilPSDE7Id
     */
    @JsonIgnore
    public PSDEUtil utilpsde7id(String utilPSDE7Id){
        this.setUtilPSDE7Id(utilPSDE7Id);
        return this;
    }

    /**
     * 设置 功能实体7，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUtilPSDE7Id}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDEUtil utilpsde7id(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setUtilPSDE7Id(null);
            this.setUtilPSDE7Name(null);
        }
        else{
            this.setUtilPSDE7Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE7Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>UTILPSDE7NAME</B>&nbsp;功能实体7
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UTILPSDE7ID}
     */
    public final static String FIELD_UTILPSDE7NAME = "utilpsde7name";

    /**
     * 设置 功能实体7
     * 
     * @param utilPSDE7Name
     * 
     */
    @JsonProperty(FIELD_UTILPSDE7NAME)
    public void setUtilPSDE7Name(String utilPSDE7Name){
        this.set(FIELD_UTILPSDE7NAME, utilPSDE7Name);
    }
    
    /**
     * 获取 功能实体7  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE7Name(){
        Object objValue = this.get(FIELD_UTILPSDE7NAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体7 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE7NameDirty(){
        if(this.contains(FIELD_UTILPSDE7NAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体7
     */
    @JsonIgnore
    public void resetUtilPSDE7Name(){
        this.reset(FIELD_UTILPSDE7NAME);
    }

    /**
     * 设置 功能实体7
     * <P>
     * 等同 {@link #setUtilPSDE7Name}
     * @param utilPSDE7Name
     */
    @JsonIgnore
    public PSDEUtil utilpsde7name(String utilPSDE7Name){
        this.setUtilPSDE7Name(utilPSDE7Name);
        return this;
    }

    /**
     * <B>UTILPSDE8ID</B>&nbsp;功能实体8
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_UTILPSDE8ID = "utilpsde8id";

    /**
     * 设置 功能实体8
     * 
     * @param utilPSDE8Id
     * 
     */
    @JsonProperty(FIELD_UTILPSDE8ID)
    public void setUtilPSDE8Id(String utilPSDE8Id){
        this.set(FIELD_UTILPSDE8ID, utilPSDE8Id);
    }
    
    /**
     * 获取 功能实体8  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE8Id(){
        Object objValue = this.get(FIELD_UTILPSDE8ID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体8 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE8IdDirty(){
        if(this.contains(FIELD_UTILPSDE8ID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体8
     */
    @JsonIgnore
    public void resetUtilPSDE8Id(){
        this.reset(FIELD_UTILPSDE8ID);
    }

    /**
     * 设置 功能实体8
     * <P>
     * 等同 {@link #setUtilPSDE8Id}
     * @param utilPSDE8Id
     */
    @JsonIgnore
    public PSDEUtil utilpsde8id(String utilPSDE8Id){
        this.setUtilPSDE8Id(utilPSDE8Id);
        return this;
    }

    /**
     * 设置 功能实体8，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUtilPSDE8Id}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDEUtil utilpsde8id(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setUtilPSDE8Id(null);
            this.setUtilPSDE8Name(null);
        }
        else{
            this.setUtilPSDE8Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE8Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>UTILPSDE8NAME</B>&nbsp;功能实体8
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UTILPSDE8ID}
     */
    public final static String FIELD_UTILPSDE8NAME = "utilpsde8name";

    /**
     * 设置 功能实体8
     * 
     * @param utilPSDE8Name
     * 
     */
    @JsonProperty(FIELD_UTILPSDE8NAME)
    public void setUtilPSDE8Name(String utilPSDE8Name){
        this.set(FIELD_UTILPSDE8NAME, utilPSDE8Name);
    }
    
    /**
     * 获取 功能实体8  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE8Name(){
        Object objValue = this.get(FIELD_UTILPSDE8NAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体8 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE8NameDirty(){
        if(this.contains(FIELD_UTILPSDE8NAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体8
     */
    @JsonIgnore
    public void resetUtilPSDE8Name(){
        this.reset(FIELD_UTILPSDE8NAME);
    }

    /**
     * 设置 功能实体8
     * <P>
     * 等同 {@link #setUtilPSDE8Name}
     * @param utilPSDE8Name
     */
    @JsonIgnore
    public PSDEUtil utilpsde8name(String utilPSDE8Name){
        this.setUtilPSDE8Name(utilPSDE8Name);
        return this;
    }

    /**
     * <B>UTILPSDE9ID</B>&nbsp;功能实体9，指定实体功能配置的相关实体9
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_UTILPSDE9ID = "utilpsde9id";

    /**
     * 设置 功能实体9，详细说明：{@link #FIELD_UTILPSDE9ID}
     * 
     * @param utilPSDE9Id
     * 
     */
    @JsonProperty(FIELD_UTILPSDE9ID)
    public void setUtilPSDE9Id(String utilPSDE9Id){
        this.set(FIELD_UTILPSDE9ID, utilPSDE9Id);
    }
    
    /**
     * 获取 功能实体9  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE9Id(){
        Object objValue = this.get(FIELD_UTILPSDE9ID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体9 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE9IdDirty(){
        if(this.contains(FIELD_UTILPSDE9ID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体9
     */
    @JsonIgnore
    public void resetUtilPSDE9Id(){
        this.reset(FIELD_UTILPSDE9ID);
    }

    /**
     * 设置 功能实体9，详细说明：{@link #FIELD_UTILPSDE9ID}
     * <P>
     * 等同 {@link #setUtilPSDE9Id}
     * @param utilPSDE9Id
     */
    @JsonIgnore
    public PSDEUtil utilpsde9id(String utilPSDE9Id){
        this.setUtilPSDE9Id(utilPSDE9Id);
        return this;
    }

    /**
     * 设置 功能实体9，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUtilPSDE9Id}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDEUtil utilpsde9id(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setUtilPSDE9Id(null);
            this.setUtilPSDE9Name(null);
        }
        else{
            this.setUtilPSDE9Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE9Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>UTILPSDE9NAME</B>&nbsp;功能实体9，指定实体功能配置的相关实体9
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UTILPSDE9ID}
     */
    public final static String FIELD_UTILPSDE9NAME = "utilpsde9name";

    /**
     * 设置 功能实体9，详细说明：{@link #FIELD_UTILPSDE9NAME}
     * 
     * @param utilPSDE9Name
     * 
     */
    @JsonProperty(FIELD_UTILPSDE9NAME)
    public void setUtilPSDE9Name(String utilPSDE9Name){
        this.set(FIELD_UTILPSDE9NAME, utilPSDE9Name);
    }
    
    /**
     * 获取 功能实体9  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE9Name(){
        Object objValue = this.get(FIELD_UTILPSDE9NAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体9 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE9NameDirty(){
        if(this.contains(FIELD_UTILPSDE9NAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体9
     */
    @JsonIgnore
    public void resetUtilPSDE9Name(){
        this.reset(FIELD_UTILPSDE9NAME);
    }

    /**
     * 设置 功能实体9，详细说明：{@link #FIELD_UTILPSDE9NAME}
     * <P>
     * 等同 {@link #setUtilPSDE9Name}
     * @param utilPSDE9Name
     */
    @JsonIgnore
    public PSDEUtil utilpsde9name(String utilPSDE9Name){
        this.setUtilPSDE9Name(utilPSDE9Name);
        return this;
    }

    /**
     * <B>UTILPSDEID</B>&nbsp;相关实体，指定实体功能配置的相关实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_UTILPSDEID = "utilpsdeid";

    /**
     * 设置 相关实体，详细说明：{@link #FIELD_UTILPSDEID}
     * 
     * @param utilPSDEId
     * 
     */
    @JsonProperty(FIELD_UTILPSDEID)
    public void setUtilPSDEId(String utilPSDEId){
        this.set(FIELD_UTILPSDEID, utilPSDEId);
    }
    
    /**
     * 获取 相关实体  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDEId(){
        Object objValue = this.get(FIELD_UTILPSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 相关实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDEIdDirty(){
        if(this.contains(FIELD_UTILPSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 相关实体
     */
    @JsonIgnore
    public void resetUtilPSDEId(){
        this.reset(FIELD_UTILPSDEID);
    }

    /**
     * 设置 相关实体，详细说明：{@link #FIELD_UTILPSDEID}
     * <P>
     * 等同 {@link #setUtilPSDEId}
     * @param utilPSDEId
     */
    @JsonIgnore
    public PSDEUtil utilpsdeid(String utilPSDEId){
        this.setUtilPSDEId(utilPSDEId);
        return this;
    }

    /**
     * 设置 相关实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUtilPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDEUtil utilpsdeid(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setUtilPSDEId(null);
            this.setUtilPSDEName(null);
        }
        else{
            this.setUtilPSDEId(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>UTILPSDENAME</B>&nbsp;相关实体，指定实体功能配置的相关实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UTILPSDEID}
     */
    public final static String FIELD_UTILPSDENAME = "utilpsdename";

    /**
     * 设置 相关实体，详细说明：{@link #FIELD_UTILPSDENAME}
     * 
     * @param utilPSDEName
     * 
     */
    @JsonProperty(FIELD_UTILPSDENAME)
    public void setUtilPSDEName(String utilPSDEName){
        this.set(FIELD_UTILPSDENAME, utilPSDEName);
    }
    
    /**
     * 获取 相关实体  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDEName(){
        Object objValue = this.get(FIELD_UTILPSDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 相关实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDENameDirty(){
        if(this.contains(FIELD_UTILPSDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 相关实体
     */
    @JsonIgnore
    public void resetUtilPSDEName(){
        this.reset(FIELD_UTILPSDENAME);
    }

    /**
     * 设置 相关实体，详细说明：{@link #FIELD_UTILPSDENAME}
     * <P>
     * 等同 {@link #setUtilPSDEName}
     * @param utilPSDEName
     */
    @JsonIgnore
    public PSDEUtil utilpsdename(String utilPSDEName){
        this.setUtilPSDEName(utilPSDEName);
        return this;
    }

    /**
     * <B>UTILTAG</B>&nbsp;功能标记，指定实体功能配置的标记，需在所属实体的同一功能类型中具备唯一性
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_UTILTAG = "utiltag";

    /**
     * 设置 功能标记，详细说明：{@link #FIELD_UTILTAG}
     * 
     * @param utilTag
     * 
     */
    @JsonProperty(FIELD_UTILTAG)
    public void setUtilTag(String utilTag){
        this.set(FIELD_UTILTAG, utilTag);
    }
    
    /**
     * 获取 功能标记  
     * @return
     */
    @JsonIgnore
    public String getUtilTag(){
        Object objValue = this.get(FIELD_UTILTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilTagDirty(){
        if(this.contains(FIELD_UTILTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能标记
     */
    @JsonIgnore
    public void resetUtilTag(){
        this.reset(FIELD_UTILTAG);
    }

    /**
     * 设置 功能标记，详细说明：{@link #FIELD_UTILTAG}
     * <P>
     * 等同 {@link #setUtilTag}
     * @param utilTag
     */
    @JsonIgnore
    public PSDEUtil utiltag(String utilTag){
        this.setUtilTag(utilTag);
        return this;
    }

    /**
     * <B>UTILTAG2</B>&nbsp;功能标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_UTILTAG2 = "utiltag2";

    /**
     * 设置 功能标记2
     * 
     * @param utilTag2
     * 
     */
    @JsonProperty(FIELD_UTILTAG2)
    public void setUtilTag2(String utilTag2){
        this.set(FIELD_UTILTAG2, utilTag2);
    }
    
    /**
     * 获取 功能标记2  
     * @return
     */
    @JsonIgnore
    public String getUtilTag2(){
        Object objValue = this.get(FIELD_UTILTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilTag2Dirty(){
        if(this.contains(FIELD_UTILTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能标记2
     */
    @JsonIgnore
    public void resetUtilTag2(){
        this.reset(FIELD_UTILTAG2);
    }

    /**
     * 设置 功能标记2
     * <P>
     * 等同 {@link #setUtilTag2}
     * @param utilTag2
     */
    @JsonIgnore
    public PSDEUtil utiltag2(String utilTag2){
        this.setUtilTag2(utilTag2);
        return this;
    }

    /**
     * <B>UTILTYPE</B>&nbsp;功能类型，指定实体功能配置的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEUtilType} 
     */
    public final static String FIELD_UTILTYPE = "utiltype";

    /**
     * 设置 功能类型，详细说明：{@link #FIELD_UTILTYPE}
     * 
     * @param utilType
     * 
     */
    @JsonProperty(FIELD_UTILTYPE)
    public void setUtilType(String utilType){
        this.set(FIELD_UTILTYPE, utilType);
    }
    
    /**
     * 获取 功能类型  
     * @return
     */
    @JsonIgnore
    public String getUtilType(){
        Object objValue = this.get(FIELD_UTILTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilTypeDirty(){
        if(this.contains(FIELD_UTILTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能类型
     */
    @JsonIgnore
    public void resetUtilType(){
        this.reset(FIELD_UTILTYPE);
    }

    /**
     * 设置 功能类型，详细说明：{@link #FIELD_UTILTYPE}
     * <P>
     * 等同 {@link #setUtilType}
     * @param utilType
     */
    @JsonIgnore
    public PSDEUtil utiltype(String utilType){
        this.setUtilType(utilType);
        return this;
    }

     /**
     * 设置 功能类型，详细说明：{@link #FIELD_UTILTYPE}
     * <P>
     * 等同 {@link #setUtilType}
     * @param utilType
     */
    @JsonIgnore
    public PSDEUtil utiltype(net.ibizsys.psmodel.core.util.PSModelEnums.DEUtilType utilType){
        if(utilType == null){
            this.setUtilType(null);
        }
        else{
            this.setUtilType(utilType.value);
        }
        return this;
    }

    /**
     * <B>VALIDFLAG</B>&nbsp;启用
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
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
    public PSDEUtil validflag(Integer validFlag){
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
    public PSDEUtil validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEUtilId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEUtilId(strValue);
    }

    @JsonIgnore
    public PSDEUtil id(String strValue){
        this.setPSDEUtilId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEUtil){
            PSDEUtil model = (PSDEUtil)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
