package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSBACKSERVICE</B>系统后台任务 模型传输对象
 * <P>
 * 系统的后台作业任务模型，定义作业组件或是调用的实体行为信息
 */
public class PSSysBackServiceDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysBackServiceDTO(){
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定系统后台任务的代码标识，需要在所在的模型域（系统模块或系统）中具有唯一性
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
    public PSSysBackServiceDTO codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>CONTAINERTAG</B>&nbsp;容器标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CONTAINERTAG = "containertag";

    /**
     * 设置 容器标记
     * 
     * @param containerTag
     * 
     */
    @JsonProperty(FIELD_CONTAINERTAG)
    public void setContainerTag(String containerTag){
        this.set(FIELD_CONTAINERTAG, containerTag);
    }
    
    /**
     * 获取 容器标记  
     * @return
     */
    @JsonIgnore
    public String getContainerTag(){
        Object objValue = this.get(FIELD_CONTAINERTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 容器标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isContainerTagDirty(){
        if(this.contains(FIELD_CONTAINERTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 容器标记
     */
    @JsonIgnore
    public void resetContainerTag(){
        this.reset(FIELD_CONTAINERTAG);
    }

    /**
     * 设置 容器标记
     * <P>
     * 等同 {@link #setContainerTag}
     * @param containerTag
     */
    @JsonIgnore
    public PSSysBackServiceDTO containertag(String containerTag){
        this.setContainerTag(containerTag);
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
    public PSSysBackServiceDTO createdate(Timestamp createDate){
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
    public PSSysBackServiceDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CUSTOMCODE</B>&nbsp;自定义代码
     */
    public final static String FIELD_CUSTOMCODE = "customcode";

    /**
     * 设置 自定义代码
     * 
     * @param customCode
     * 
     */
    @JsonProperty(FIELD_CUSTOMCODE)
    public void setCustomCode(String customCode){
        this.set(FIELD_CUSTOMCODE, customCode);
    }
    
    /**
     * 获取 自定义代码  
     * @return
     */
    @JsonIgnore
    public String getCustomCode(){
        Object objValue = this.get(FIELD_CUSTOMCODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomCodeDirty(){
        if(this.contains(FIELD_CUSTOMCODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义代码
     */
    @JsonIgnore
    public void resetCustomCode(){
        this.reset(FIELD_CUSTOMCODE);
    }

    /**
     * 设置 自定义代码
     * <P>
     * 等同 {@link #setCustomCode}
     * @param customCode
     */
    @JsonIgnore
    public PSSysBackServiceDTO customcode(String customCode){
        this.setCustomCode(customCode);
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
    public PSSysBackServiceDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PREDEFINEDTYPE</B>&nbsp;预置类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.PredefinedBackendTaskType} 
     */
    public final static String FIELD_PREDEFINEDTYPE = "predefinedtype";

    /**
     * 设置 预置类型
     * 
     * @param predefinedType
     * 
     */
    @JsonProperty(FIELD_PREDEFINEDTYPE)
    public void setPredefinedType(String predefinedType){
        this.set(FIELD_PREDEFINEDTYPE, predefinedType);
    }
    
    /**
     * 获取 预置类型  
     * @return
     */
    @JsonIgnore
    public String getPredefinedType(){
        Object objValue = this.get(FIELD_PREDEFINEDTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预置类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPredefinedTypeDirty(){
        if(this.contains(FIELD_PREDEFINEDTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预置类型
     */
    @JsonIgnore
    public void resetPredefinedType(){
        this.reset(FIELD_PREDEFINEDTYPE);
    }

    /**
     * 设置 预置类型
     * <P>
     * 等同 {@link #setPredefinedType}
     * @param predefinedType
     */
    @JsonIgnore
    public PSSysBackServiceDTO predefinedtype(String predefinedType){
        this.setPredefinedType(predefinedType);
        return this;
    }

     /**
     * 设置 预置类型
     * <P>
     * 等同 {@link #setPredefinedType}
     * @param predefinedType
     */
    @JsonIgnore
    public PSSysBackServiceDTO predefinedtype(net.ibizsys.model.PSModelEnums.PredefinedBackendTaskType predefinedType){
        if(predefinedType == null){
            this.setPredefinedType(null);
        }
        else{
            this.setPredefinedType(predefinedType.value);
        }
        return this;
    }

    /**
     * <B>PSBACKSERVICEID</B>&nbsp;平台预置任务，指定后台任务来源的平台预置任务
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSBACKSERVICEID = "psbackserviceid";

    /**
     * 设置 平台预置任务，详细说明：{@link #FIELD_PSBACKSERVICEID}
     * 
     * @param pSBackServiceId
     * 
     */
    @JsonProperty(FIELD_PSBACKSERVICEID)
    public void setPSBackServiceId(String pSBackServiceId){
        this.set(FIELD_PSBACKSERVICEID, pSBackServiceId);
    }
    
    /**
     * 获取 平台预置任务  
     * @return
     */
    @JsonIgnore
    public String getPSBackServiceId(){
        Object objValue = this.get(FIELD_PSBACKSERVICEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 平台预置任务 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSBackServiceIdDirty(){
        if(this.contains(FIELD_PSBACKSERVICEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 平台预置任务
     */
    @JsonIgnore
    public void resetPSBackServiceId(){
        this.reset(FIELD_PSBACKSERVICEID);
    }

    /**
     * 设置 平台预置任务，详细说明：{@link #FIELD_PSBACKSERVICEID}
     * <P>
     * 等同 {@link #setPSBackServiceId}
     * @param pSBackServiceId
     */
    @JsonIgnore
    public PSSysBackServiceDTO psbackserviceid(String pSBackServiceId){
        this.setPSBackServiceId(pSBackServiceId);
        return this;
    }

    /**
     * <B>PSBACKSERVICENAME</B>&nbsp;平台预置任务，指定后台任务来源的平台预置任务
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSBACKSERVICEID}
     */
    public final static String FIELD_PSBACKSERVICENAME = "psbackservicename";

    /**
     * 设置 平台预置任务，详细说明：{@link #FIELD_PSBACKSERVICENAME}
     * 
     * @param pSBackServiceName
     * 
     */
    @JsonProperty(FIELD_PSBACKSERVICENAME)
    public void setPSBackServiceName(String pSBackServiceName){
        this.set(FIELD_PSBACKSERVICENAME, pSBackServiceName);
    }
    
    /**
     * 获取 平台预置任务  
     * @return
     */
    @JsonIgnore
    public String getPSBackServiceName(){
        Object objValue = this.get(FIELD_PSBACKSERVICENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 平台预置任务 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSBackServiceNameDirty(){
        if(this.contains(FIELD_PSBACKSERVICENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 平台预置任务
     */
    @JsonIgnore
    public void resetPSBackServiceName(){
        this.reset(FIELD_PSBACKSERVICENAME);
    }

    /**
     * 设置 平台预置任务，详细说明：{@link #FIELD_PSBACKSERVICENAME}
     * <P>
     * 等同 {@link #setPSBackServiceName}
     * @param pSBackServiceName
     */
    @JsonIgnore
    public PSSysBackServiceDTO psbackservicename(String pSBackServiceName){
        this.setPSBackServiceName(pSBackServiceName);
        return this;
    }

    /**
     * <B>PSDEACTIONID</B>&nbsp;实体行为，指定后台任务调用的实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEActionDTO} 
     */
    public final static String FIELD_PSDEACTIONID = "psdeactionid";

    /**
     * 设置 实体行为，详细说明：{@link #FIELD_PSDEACTIONID}
     * 
     * @param pSDEActionId
     * 
     */
    @JsonProperty(FIELD_PSDEACTIONID)
    public void setPSDEActionId(String pSDEActionId){
        this.set(FIELD_PSDEACTIONID, pSDEActionId);
    }
    
    /**
     * 获取 实体行为  
     * @return
     */
    @JsonIgnore
    public String getPSDEActionId(){
        Object objValue = this.get(FIELD_PSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEActionIdDirty(){
        if(this.contains(FIELD_PSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体行为
     */
    @JsonIgnore
    public void resetPSDEActionId(){
        this.reset(FIELD_PSDEACTIONID);
    }

    /**
     * 设置 实体行为，详细说明：{@link #FIELD_PSDEACTIONID}
     * <P>
     * 等同 {@link #setPSDEActionId}
     * @param pSDEActionId
     */
    @JsonIgnore
    public PSSysBackServiceDTO psdeactionid(String pSDEActionId){
        this.setPSDEActionId(pSDEActionId);
        return this;
    }

    /**
     * 设置 实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSSysBackServiceDTO psdeactionid(PSDEActionDTO pSDEAction){
        if(pSDEAction == null){
            this.setPSDEActionId(null);
            this.setPSDEActionName(null);
        }
        else{
            this.setPSDEActionId(pSDEAction.getPSDEActionId());
            this.setPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>PSDEACTIONNAME</B>&nbsp;实体行为，指定后台任务调用的实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEACTIONID}
     */
    public final static String FIELD_PSDEACTIONNAME = "psdeactionname";

    /**
     * 设置 实体行为，详细说明：{@link #FIELD_PSDEACTIONNAME}
     * 
     * @param pSDEActionName
     * 
     */
    @JsonProperty(FIELD_PSDEACTIONNAME)
    public void setPSDEActionName(String pSDEActionName){
        this.set(FIELD_PSDEACTIONNAME, pSDEActionName);
    }
    
    /**
     * 获取 实体行为  
     * @return
     */
    @JsonIgnore
    public String getPSDEActionName(){
        Object objValue = this.get(FIELD_PSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEActionNameDirty(){
        if(this.contains(FIELD_PSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体行为
     */
    @JsonIgnore
    public void resetPSDEActionName(){
        this.reset(FIELD_PSDEACTIONNAME);
    }

    /**
     * 设置 实体行为，详细说明：{@link #FIELD_PSDEACTIONNAME}
     * <P>
     * 等同 {@link #setPSDEActionName}
     * @param pSDEActionName
     */
    @JsonIgnore
    public PSSysBackServiceDTO psdeactionname(String pSDEActionName){
        this.setPSDEActionName(pSDEActionName);
        return this;
    }

    /**
     * <B>PSDEDSID</B>&nbsp;数据集
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO} 
     */
    public final static String FIELD_PSDEDSID = "psdedsid";

    /**
     * 设置 数据集
     * 
     * @param pSDEDSId
     * 
     */
    @JsonProperty(FIELD_PSDEDSID)
    public void setPSDEDSId(String pSDEDSId){
        this.set(FIELD_PSDEDSID, pSDEDSId);
    }
    
    /**
     * 获取 数据集  
     * @return
     */
    @JsonIgnore
    public String getPSDEDSId(){
        Object objValue = this.get(FIELD_PSDEDSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDSIdDirty(){
        if(this.contains(FIELD_PSDEDSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据集
     */
    @JsonIgnore
    public void resetPSDEDSId(){
        this.reset(FIELD_PSDEDSID);
    }

    /**
     * 设置 数据集
     * <P>
     * 等同 {@link #setPSDEDSId}
     * @param pSDEDSId
     */
    @JsonIgnore
    public PSSysBackServiceDTO psdedsid(String pSDEDSId){
        this.setPSDEDSId(pSDEDSId);
        return this;
    }

    /**
     * 设置 数据集，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDSId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSSysBackServiceDTO psdedsid(PSDEDataSetDTO pSDEDataSet){
        if(pSDEDataSet == null){
            this.setPSDEDSId(null);
            this.setPSDEDSName(null);
        }
        else{
            this.setPSDEDSId(pSDEDataSet.getPSDEDataSetId());
            this.setPSDEDSName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    /**
     * <B>PSDEDSNAME</B>&nbsp;实体数据集
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDSID}
     */
    public final static String FIELD_PSDEDSNAME = "psdedsname";

    /**
     * 设置 实体数据集
     * 
     * @param pSDEDSName
     * 
     */
    @JsonProperty(FIELD_PSDEDSNAME)
    public void setPSDEDSName(String pSDEDSName){
        this.set(FIELD_PSDEDSNAME, pSDEDSName);
    }
    
    /**
     * 获取 实体数据集  
     * @return
     */
    @JsonIgnore
    public String getPSDEDSName(){
        Object objValue = this.get(FIELD_PSDEDSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDSNameDirty(){
        if(this.contains(FIELD_PSDEDSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据集
     */
    @JsonIgnore
    public void resetPSDEDSName(){
        this.reset(FIELD_PSDEDSNAME);
    }

    /**
     * 设置 实体数据集
     * <P>
     * 等同 {@link #setPSDEDSName}
     * @param pSDEDSName
     */
    @JsonIgnore
    public PSSysBackServiceDTO psdedsname(String pSDEDSName){
        this.setPSDEDSName(pSDEDSName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定后台任务调用的实体行为的所在实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDataEntityDTO} 
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
    public PSSysBackServiceDTO psdeid(String pSDEId){
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
    public PSSysBackServiceDTO psdeid(PSDataEntityDTO pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;实体，指定后台任务调用的实体行为的所在实体
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
    public PSSysBackServiceDTO psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定系统后台任务所在的系统模块
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSModuleDTO} 
     */
    public final static String FIELD_PSMODULEID = "psmoduleid";

    /**
     * 设置 系统模块，详细说明：{@link #FIELD_PSMODULEID}
     * 
     * @param pSModuleId
     * 
     */
    @JsonProperty(FIELD_PSMODULEID)
    public void setPSModuleId(String pSModuleId){
        this.set(FIELD_PSMODULEID, pSModuleId);
    }
    
    /**
     * 获取 系统模块  
     * @return
     */
    @JsonIgnore
    public String getPSModuleId(){
        Object objValue = this.get(FIELD_PSMODULEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统模块 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSModuleIdDirty(){
        if(this.contains(FIELD_PSMODULEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统模块
     */
    @JsonIgnore
    public void resetPSModuleId(){
        this.reset(FIELD_PSMODULEID);
    }

    /**
     * 设置 系统模块，详细说明：{@link #FIELD_PSMODULEID}
     * <P>
     * 等同 {@link #setPSModuleId}
     * @param pSModuleId
     */
    @JsonIgnore
    public PSSysBackServiceDTO psmoduleid(String pSModuleId){
        this.setPSModuleId(pSModuleId);
        return this;
    }

    /**
     * 设置 系统模块，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSModuleId}
     * @param pSModule 引用对象
     */
    @JsonIgnore
    public PSSysBackServiceDTO psmoduleid(PSModuleDTO pSModule){
        if(pSModule == null){
            this.setPSModuleId(null);
            this.setPSModuleName(null);
        }
        else{
            this.setPSModuleId(pSModule.getPSModuleId());
            this.setPSModuleName(pSModule.getPSModuleName());
        }
        return this;
    }

    /**
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定系统后台任务所在的系统模块
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSMODULEID}
     */
    public final static String FIELD_PSMODULENAME = "psmodulename";

    /**
     * 设置 系统模块，详细说明：{@link #FIELD_PSMODULENAME}
     * 
     * @param pSModuleName
     * 
     */
    @JsonProperty(FIELD_PSMODULENAME)
    public void setPSModuleName(String pSModuleName){
        this.set(FIELD_PSMODULENAME, pSModuleName);
    }
    
    /**
     * 获取 系统模块  
     * @return
     */
    @JsonIgnore
    public String getPSModuleName(){
        Object objValue = this.get(FIELD_PSMODULENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统模块 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSModuleNameDirty(){
        if(this.contains(FIELD_PSMODULENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统模块
     */
    @JsonIgnore
    public void resetPSModuleName(){
        this.reset(FIELD_PSMODULENAME);
    }

    /**
     * 设置 系统模块，详细说明：{@link #FIELD_PSMODULENAME}
     * <P>
     * 等同 {@link #setPSModuleName}
     * @param pSModuleName
     */
    @JsonIgnore
    public PSSysBackServiceDTO psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSYSBACKSERVICEID</B>&nbsp;系统后台任务标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSBACKSERVICEID = "pssysbackserviceid";

    /**
     * 设置 系统后台任务标识
     * 
     * @param pSSysBackServiceId
     * 
     */
    @JsonProperty(FIELD_PSSYSBACKSERVICEID)
    public void setPSSysBackServiceId(String pSSysBackServiceId){
        this.set(FIELD_PSSYSBACKSERVICEID, pSSysBackServiceId);
    }
    
    /**
     * 获取 系统后台任务标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysBackServiceId(){
        Object objValue = this.get(FIELD_PSSYSBACKSERVICEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统后台任务标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBackServiceIdDirty(){
        if(this.contains(FIELD_PSSYSBACKSERVICEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统后台任务标识
     */
    @JsonIgnore
    public void resetPSSysBackServiceId(){
        this.reset(FIELD_PSSYSBACKSERVICEID);
    }

    /**
     * 设置 系统后台任务标识
     * <P>
     * 等同 {@link #setPSSysBackServiceId}
     * @param pSSysBackServiceId
     */
    @JsonIgnore
    public PSSysBackServiceDTO pssysbackserviceid(String pSSysBackServiceId){
        this.setPSSysBackServiceId(pSSysBackServiceId);
        return this;
    }

    /**
     * <B>PSSYSBACKSERVICENAME</B>&nbsp;后台任务名称，指定后台任务的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSBACKSERVICENAME = "pssysbackservicename";

    /**
     * 设置 后台任务名称，详细说明：{@link #FIELD_PSSYSBACKSERVICENAME}
     * 
     * @param pSSysBackServiceName
     * 
     */
    @JsonProperty(FIELD_PSSYSBACKSERVICENAME)
    public void setPSSysBackServiceName(String pSSysBackServiceName){
        this.set(FIELD_PSSYSBACKSERVICENAME, pSSysBackServiceName);
    }
    
    /**
     * 获取 后台任务名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysBackServiceName(){
        Object objValue = this.get(FIELD_PSSYSBACKSERVICENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台任务名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBackServiceNameDirty(){
        if(this.contains(FIELD_PSSYSBACKSERVICENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台任务名称
     */
    @JsonIgnore
    public void resetPSSysBackServiceName(){
        this.reset(FIELD_PSSYSBACKSERVICENAME);
    }

    /**
     * 设置 后台任务名称，详细说明：{@link #FIELD_PSSYSBACKSERVICENAME}
     * <P>
     * 等同 {@link #setPSSysBackServiceName}
     * @param pSSysBackServiceName
     */
    @JsonIgnore
    public PSSysBackServiceDTO pssysbackservicename(String pSSysBackServiceName){
        this.setPSSysBackServiceName(pSSysBackServiceName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysBackServiceName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysBackServiceName(strName);
    }

    @JsonIgnore
    public PSSysBackServiceDTO name(String strName){
        this.setPSSysBackServiceName(strName);
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELID</B>&nbsp;动态系统模型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysDynaModelDTO} 
     */
    public final static String FIELD_PSSYSDYNAMODELID = "pssysdynamodelid";

    /**
     * 设置 动态系统模型
     * 
     * @param pSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELID)
    public void setPSSysDynaModelId(String pSSysDynaModelId){
        this.set(FIELD_PSSYSDYNAMODELID, pSSysDynaModelId);
    }
    
    /**
     * 获取 动态系统模型  
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
     * 判断 动态系统模型 是否指定值，包括空值
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
     * 重置 动态系统模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelId(){
        this.reset(FIELD_PSSYSDYNAMODELID);
    }

    /**
     * 设置 动态系统模型
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModelId
     */
    @JsonIgnore
    public PSSysBackServiceDTO pssysdynamodelid(String pSSysDynaModelId){
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    /**
     * 设置 动态系统模型，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModel 引用对象
     */
    @JsonIgnore
    public PSSysBackServiceDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel){
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
     * <B>PSSYSDYNAMODELNAME</B>&nbsp;动态系统模型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDYNAMODELID}
     */
    public final static String FIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";

    /**
     * 设置 动态系统模型
     * 
     * @param pSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELNAME)
    public void setPSSysDynaModelName(String pSSysDynaModelName){
        this.set(FIELD_PSSYSDYNAMODELNAME, pSSysDynaModelName);
    }
    
    /**
     * 获取 动态系统模型  
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
     * 判断 动态系统模型 是否指定值，包括空值
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
     * 重置 动态系统模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelName(){
        this.reset(FIELD_PSSYSDYNAMODELNAME);
    }

    /**
     * 设置 动态系统模型
     * <P>
     * 等同 {@link #setPSSysDynaModelName}
     * @param pSSysDynaModelName
     */
    @JsonIgnore
    public PSSysBackServiceDTO pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINID</B>&nbsp;后台扩展插件，指定后台作业使用的后台模板扩展插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysSFPluginDTO} 
     */
    public final static String FIELD_PSSYSSFPLUGINID = "pssyssfpluginid";

    /**
     * 设置 后台扩展插件，详细说明：{@link #FIELD_PSSYSSFPLUGINID}
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
     * 设置 后台扩展插件，详细说明：{@link #FIELD_PSSYSSFPLUGINID}
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPluginId
     */
    @JsonIgnore
    public PSSysBackServiceDTO pssyssfpluginid(String pSSysSFPluginId){
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
    public PSSysBackServiceDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin){
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
     * <B>PSSYSSFPLUGINNAME</B>&nbsp;后台扩展插件，指定后台作业使用的后台模板扩展插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSFPLUGINID}
     */
    public final static String FIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";

    /**
     * 设置 后台扩展插件，详细说明：{@link #FIELD_PSSYSSFPLUGINNAME}
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
     * 设置 后台扩展插件，详细说明：{@link #FIELD_PSSYSSFPLUGINNAME}
     * <P>
     * 等同 {@link #setPSSysSFPluginName}
     * @param pSSysSFPluginName
     */
    @JsonIgnore
    public PSSysBackServiceDTO pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    /**
     * <B>PSSYSUTILDEID</B>&nbsp;系统功能组件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysUtilDTO} 
     */
    public final static String FIELD_PSSYSUTILDEID = "pssysutildeid";

    /**
     * 设置 系统功能组件
     * 
     * @param pSSysUtilDEId
     * 
     */
    @JsonProperty(FIELD_PSSYSUTILDEID)
    public void setPSSysUtilDEId(String pSSysUtilDEId){
        this.set(FIELD_PSSYSUTILDEID, pSSysUtilDEId);
    }
    
    /**
     * 获取 系统功能组件  
     * @return
     */
    @JsonIgnore
    public String getPSSysUtilDEId(){
        Object objValue = this.get(FIELD_PSSYSUTILDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统功能组件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUtilDEIdDirty(){
        if(this.contains(FIELD_PSSYSUTILDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统功能组件
     */
    @JsonIgnore
    public void resetPSSysUtilDEId(){
        this.reset(FIELD_PSSYSUTILDEID);
    }

    /**
     * 设置 系统功能组件
     * <P>
     * 等同 {@link #setPSSysUtilDEId}
     * @param pSSysUtilDEId
     */
    @JsonIgnore
    public PSSysBackServiceDTO pssysutildeid(String pSSysUtilDEId){
        this.setPSSysUtilDEId(pSSysUtilDEId);
        return this;
    }

    /**
     * 设置 系统功能组件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysUtilDEId}
     * @param pSSysUtil 引用对象
     */
    @JsonIgnore
    public PSSysBackServiceDTO pssysutildeid(PSSysUtilDTO pSSysUtil){
        if(pSSysUtil == null){
            this.setPSSysUtilDEId(null);
            this.setPSSysUtilDEName(null);
        }
        else{
            this.setPSSysUtilDEId(pSSysUtil.getPSSysUtilId());
            this.setPSSysUtilDEName(pSSysUtil.getPSSysUtilName());
        }
        return this;
    }

    /**
     * <B>PSSYSUTILDENAME</B>&nbsp;系统功能组件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSUTILDEID}
     */
    public final static String FIELD_PSSYSUTILDENAME = "pssysutildename";

    /**
     * 设置 系统功能组件
     * 
     * @param pSSysUtilDEName
     * 
     */
    @JsonProperty(FIELD_PSSYSUTILDENAME)
    public void setPSSysUtilDEName(String pSSysUtilDEName){
        this.set(FIELD_PSSYSUTILDENAME, pSSysUtilDEName);
    }
    
    /**
     * 获取 系统功能组件  
     * @return
     */
    @JsonIgnore
    public String getPSSysUtilDEName(){
        Object objValue = this.get(FIELD_PSSYSUTILDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统功能组件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUtilDENameDirty(){
        if(this.contains(FIELD_PSSYSUTILDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统功能组件
     */
    @JsonIgnore
    public void resetPSSysUtilDEName(){
        this.reset(FIELD_PSSYSUTILDENAME);
    }

    /**
     * 设置 系统功能组件
     * <P>
     * 等同 {@link #setPSSysUtilDEName}
     * @param pSSysUtilDEName
     */
    @JsonIgnore
    public PSSysBackServiceDTO pssysutildename(String pSSysUtilDEName){
        this.setPSSysUtilDEName(pSSysUtilDEName);
        return this;
    }

    /**
     * <B>RUNORDER</B>&nbsp;启动次序，指定后台作业的启动次序
     */
    public final static String FIELD_RUNORDER = "runorder";

    /**
     * 设置 启动次序，详细说明：{@link #FIELD_RUNORDER}
     * 
     * @param runOrder
     * 
     */
    @JsonProperty(FIELD_RUNORDER)
    public void setRunOrder(Integer runOrder){
        this.set(FIELD_RUNORDER, runOrder);
    }
    
    /**
     * 获取 启动次序  
     * @return
     */
    @JsonIgnore
    public Integer getRunOrder(){
        Object objValue = this.get(FIELD_RUNORDER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启动次序 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRunOrderDirty(){
        if(this.contains(FIELD_RUNORDER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启动次序
     */
    @JsonIgnore
    public void resetRunOrder(){
        this.reset(FIELD_RUNORDER);
    }

    /**
     * 设置 启动次序，详细说明：{@link #FIELD_RUNORDER}
     * <P>
     * 等同 {@link #setRunOrder}
     * @param runOrder
     */
    @JsonIgnore
    public PSSysBackServiceDTO runorder(Integer runOrder){
        this.setRunOrder(runOrder);
        return this;
    }

    /**
     * <B>SERVICECONTAINER</B>&nbsp;服务容器，指定后台作业的运行容器
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.BackendTaskContainer} 
     */
    public final static String FIELD_SERVICECONTAINER = "servicecontainer";

    /**
     * 设置 服务容器，详细说明：{@link #FIELD_SERVICECONTAINER}
     * 
     * @param serviceContainer
     * 
     */
    @JsonProperty(FIELD_SERVICECONTAINER)
    public void setServiceContainer(String serviceContainer){
        this.set(FIELD_SERVICECONTAINER, serviceContainer);
    }
    
    /**
     * 获取 服务容器  
     * @return
     */
    @JsonIgnore
    public String getServiceContainer(){
        Object objValue = this.get(FIELD_SERVICECONTAINER);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 服务容器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isServiceContainerDirty(){
        if(this.contains(FIELD_SERVICECONTAINER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务容器
     */
    @JsonIgnore
    public void resetServiceContainer(){
        this.reset(FIELD_SERVICECONTAINER);
    }

    /**
     * 设置 服务容器，详细说明：{@link #FIELD_SERVICECONTAINER}
     * <P>
     * 等同 {@link #setServiceContainer}
     * @param serviceContainer
     */
    @JsonIgnore
    public PSSysBackServiceDTO servicecontainer(String serviceContainer){
        this.setServiceContainer(serviceContainer);
        return this;
    }

     /**
     * 设置 服务容器，详细说明：{@link #FIELD_SERVICECONTAINER}
     * <P>
     * 等同 {@link #setServiceContainer}
     * @param serviceContainer
     */
    @JsonIgnore
    public PSSysBackServiceDTO servicecontainer(net.ibizsys.model.PSModelEnums.BackendTaskContainer serviceContainer){
        if(serviceContainer == null){
            this.setServiceContainer(null);
        }
        else{
            this.setServiceContainer(serviceContainer.value);
        }
        return this;
    }

    /**
     * <B>SERVICEOBJ</B>&nbsp;服务对象，指定后台作业的组件对象名称
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_SERVICEOBJ = "serviceobj";

    /**
     * 设置 服务对象，详细说明：{@link #FIELD_SERVICEOBJ}
     * 
     * @param serviceObj
     * 
     */
    @JsonProperty(FIELD_SERVICEOBJ)
    public void setServiceObj(String serviceObj){
        this.set(FIELD_SERVICEOBJ, serviceObj);
    }
    
    /**
     * 获取 服务对象  
     * @return
     */
    @JsonIgnore
    public String getServiceObj(){
        Object objValue = this.get(FIELD_SERVICEOBJ);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 服务对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isServiceObjDirty(){
        if(this.contains(FIELD_SERVICEOBJ)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务对象
     */
    @JsonIgnore
    public void resetServiceObj(){
        this.reset(FIELD_SERVICEOBJ);
    }

    /**
     * 设置 服务对象，详细说明：{@link #FIELD_SERVICEOBJ}
     * <P>
     * 等同 {@link #setServiceObj}
     * @param serviceObj
     */
    @JsonIgnore
    public PSSysBackServiceDTO serviceobj(String serviceObj){
        this.setServiceObj(serviceObj);
        return this;
    }

    /**
     * <B>SERVICEPARAMS</B>&nbsp;后台作业参数，指定后台作业的参数
     */
    public final static String FIELD_SERVICEPARAMS = "serviceparams";

    /**
     * 设置 后台作业参数，详细说明：{@link #FIELD_SERVICEPARAMS}
     * 
     * @param serviceParams
     * 
     */
    @JsonProperty(FIELD_SERVICEPARAMS)
    public void setServiceParams(String serviceParams){
        this.set(FIELD_SERVICEPARAMS, serviceParams);
    }
    
    /**
     * 获取 后台作业参数  
     * @return
     */
    @JsonIgnore
    public String getServiceParams(){
        Object objValue = this.get(FIELD_SERVICEPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台作业参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isServiceParamsDirty(){
        if(this.contains(FIELD_SERVICEPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台作业参数
     */
    @JsonIgnore
    public void resetServiceParams(){
        this.reset(FIELD_SERVICEPARAMS);
    }

    /**
     * 设置 后台作业参数，详细说明：{@link #FIELD_SERVICEPARAMS}
     * <P>
     * 等同 {@link #setServiceParams}
     * @param serviceParams
     */
    @JsonIgnore
    public PSSysBackServiceDTO serviceparams(String serviceParams){
        this.setServiceParams(serviceParams);
        return this;
    }

    /**
     * <B>SERVICEPOLICY</B>&nbsp;服务策略，指定后台作业的运行策略
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_SERVICEPOLICY = "servicepolicy";

    /**
     * 设置 服务策略，详细说明：{@link #FIELD_SERVICEPOLICY}
     * 
     * @param servicePolicy
     * 
     */
    @JsonProperty(FIELD_SERVICEPOLICY)
    public void setServicePolicy(String servicePolicy){
        this.set(FIELD_SERVICEPOLICY, servicePolicy);
    }
    
    /**
     * 获取 服务策略  
     * @return
     */
    @JsonIgnore
    public String getServicePolicy(){
        Object objValue = this.get(FIELD_SERVICEPOLICY);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 服务策略 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isServicePolicyDirty(){
        if(this.contains(FIELD_SERVICEPOLICY)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务策略
     */
    @JsonIgnore
    public void resetServicePolicy(){
        this.reset(FIELD_SERVICEPOLICY);
    }

    /**
     * 设置 服务策略，详细说明：{@link #FIELD_SERVICEPOLICY}
     * <P>
     * 等同 {@link #setServicePolicy}
     * @param servicePolicy
     */
    @JsonIgnore
    public PSSysBackServiceDTO servicepolicy(String servicePolicy){
        this.setServicePolicy(servicePolicy);
        return this;
    }

    /**
     * <B>SERVICEPOLICY2</B>&nbsp;服务策略2，指定后台作业的运行策略2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_SERVICEPOLICY2 = "servicepolicy2";

    /**
     * 设置 服务策略2，详细说明：{@link #FIELD_SERVICEPOLICY2}
     * 
     * @param servicePolicy2
     * 
     */
    @JsonProperty(FIELD_SERVICEPOLICY2)
    public void setServicePolicy2(String servicePolicy2){
        this.set(FIELD_SERVICEPOLICY2, servicePolicy2);
    }
    
    /**
     * 获取 服务策略2  
     * @return
     */
    @JsonIgnore
    public String getServicePolicy2(){
        Object objValue = this.get(FIELD_SERVICEPOLICY2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 服务策略2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isServicePolicy2Dirty(){
        if(this.contains(FIELD_SERVICEPOLICY2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务策略2
     */
    @JsonIgnore
    public void resetServicePolicy2(){
        this.reset(FIELD_SERVICEPOLICY2);
    }

    /**
     * 设置 服务策略2，详细说明：{@link #FIELD_SERVICEPOLICY2}
     * <P>
     * 等同 {@link #setServicePolicy2}
     * @param servicePolicy2
     */
    @JsonIgnore
    public PSSysBackServiceDTO servicepolicy2(String servicePolicy2){
        this.setServicePolicy2(servicePolicy2);
        return this;
    }

    /**
     * <B>SERVICETAG</B>&nbsp;服务标记，指定后台作业的标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_SERVICETAG = "servicetag";

    /**
     * 设置 服务标记，详细说明：{@link #FIELD_SERVICETAG}
     * 
     * @param serviceTag
     * 
     */
    @JsonProperty(FIELD_SERVICETAG)
    public void setServiceTag(String serviceTag){
        this.set(FIELD_SERVICETAG, serviceTag);
    }
    
    /**
     * 获取 服务标记  
     * @return
     */
    @JsonIgnore
    public String getServiceTag(){
        Object objValue = this.get(FIELD_SERVICETAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 服务标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isServiceTagDirty(){
        if(this.contains(FIELD_SERVICETAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务标记
     */
    @JsonIgnore
    public void resetServiceTag(){
        this.reset(FIELD_SERVICETAG);
    }

    /**
     * 设置 服务标记，详细说明：{@link #FIELD_SERVICETAG}
     * <P>
     * 等同 {@link #setServiceTag}
     * @param serviceTag
     */
    @JsonIgnore
    public PSSysBackServiceDTO servicetag(String serviceTag){
        this.setServiceTag(serviceTag);
        return this;
    }

    /**
     * <B>SERVICETAG2</B>&nbsp;服务标记2，指定后台作业的标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_SERVICETAG2 = "servicetag2";

    /**
     * 设置 服务标记2，详细说明：{@link #FIELD_SERVICETAG2}
     * 
     * @param serviceTag2
     * 
     */
    @JsonProperty(FIELD_SERVICETAG2)
    public void setServiceTag2(String serviceTag2){
        this.set(FIELD_SERVICETAG2, serviceTag2);
    }
    
    /**
     * 获取 服务标记2  
     * @return
     */
    @JsonIgnore
    public String getServiceTag2(){
        Object objValue = this.get(FIELD_SERVICETAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 服务标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isServiceTag2Dirty(){
        if(this.contains(FIELD_SERVICETAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务标记2
     */
    @JsonIgnore
    public void resetServiceTag2(){
        this.reset(FIELD_SERVICETAG2);
    }

    /**
     * 设置 服务标记2，详细说明：{@link #FIELD_SERVICETAG2}
     * <P>
     * 等同 {@link #setServiceTag2}
     * @param serviceTag2
     */
    @JsonIgnore
    public PSSysBackServiceDTO servicetag2(String serviceTag2){
        this.setServiceTag2(serviceTag2);
        return this;
    }

    /**
     * <B>STARTMODE</B>&nbsp;启动模式，指定后台任务的启动模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.BackendTaskStartMode} 
     */
    public final static String FIELD_STARTMODE = "startmode";

    /**
     * 设置 启动模式，详细说明：{@link #FIELD_STARTMODE}
     * 
     * @param startMode
     * 
     */
    @JsonProperty(FIELD_STARTMODE)
    public void setStartMode(String startMode){
        this.set(FIELD_STARTMODE, startMode);
    }
    
    /**
     * 获取 启动模式  
     * @return
     */
    @JsonIgnore
    public String getStartMode(){
        Object objValue = this.get(FIELD_STARTMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 启动模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStartModeDirty(){
        if(this.contains(FIELD_STARTMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启动模式
     */
    @JsonIgnore
    public void resetStartMode(){
        this.reset(FIELD_STARTMODE);
    }

    /**
     * 设置 启动模式，详细说明：{@link #FIELD_STARTMODE}
     * <P>
     * 等同 {@link #setStartMode}
     * @param startMode
     */
    @JsonIgnore
    public PSSysBackServiceDTO startmode(String startMode){
        this.setStartMode(startMode);
        return this;
    }

     /**
     * 设置 启动模式，详细说明：{@link #FIELD_STARTMODE}
     * <P>
     * 等同 {@link #setStartMode}
     * @param startMode
     */
    @JsonIgnore
    public PSSysBackServiceDTO startmode(net.ibizsys.model.PSModelEnums.BackendTaskStartMode startMode){
        if(startMode == null){
            this.setStartMode(null);
        }
        else{
            this.setStartMode(startMode.value);
        }
        return this;
    }

    /**
     * <B>TASKTYPE</B>&nbsp;任务类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.BackendTaskType} 
     */
    public final static String FIELD_TASKTYPE = "tasktype";

    /**
     * 设置 任务类型
     * 
     * @param taskType
     * 
     */
    @JsonProperty(FIELD_TASKTYPE)
    public void setTaskType(String taskType){
        this.set(FIELD_TASKTYPE, taskType);
    }
    
    /**
     * 获取 任务类型  
     * @return
     */
    @JsonIgnore
    public String getTaskType(){
        Object objValue = this.get(FIELD_TASKTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 任务类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTaskTypeDirty(){
        if(this.contains(FIELD_TASKTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 任务类型
     */
    @JsonIgnore
    public void resetTaskType(){
        this.reset(FIELD_TASKTYPE);
    }

    /**
     * 设置 任务类型
     * <P>
     * 等同 {@link #setTaskType}
     * @param taskType
     */
    @JsonIgnore
    public PSSysBackServiceDTO tasktype(String taskType){
        this.setTaskType(taskType);
        return this;
    }

     /**
     * 设置 任务类型
     * <P>
     * 等同 {@link #setTaskType}
     * @param taskType
     */
    @JsonIgnore
    public PSSysBackServiceDTO tasktype(net.ibizsys.model.PSModelEnums.BackendTaskType taskType){
        if(taskType == null){
            this.setTaskType(null);
        }
        else{
            this.setTaskType(taskType.value);
        }
        return this;
    }

    /**
     * <B>TIMERMODE</B>&nbsp;定时触发模式，指定后台任务是否使用定时触发模式，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_TIMERMODE = "timermode";

    /**
     * 设置 定时触发模式，详细说明：{@link #FIELD_TIMERMODE}
     * 
     * @param timerMode
     * 
     */
    @JsonProperty(FIELD_TIMERMODE)
    public void setTimerMode(Integer timerMode){
        this.set(FIELD_TIMERMODE, timerMode);
    }
    
    /**
     * 获取 定时触发模式  
     * @return
     */
    @JsonIgnore
    public Integer getTimerMode(){
        Object objValue = this.get(FIELD_TIMERMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 定时触发模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTimerModeDirty(){
        if(this.contains(FIELD_TIMERMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 定时触发模式
     */
    @JsonIgnore
    public void resetTimerMode(){
        this.reset(FIELD_TIMERMODE);
    }

    /**
     * 设置 定时触发模式，详细说明：{@link #FIELD_TIMERMODE}
     * <P>
     * 等同 {@link #setTimerMode}
     * @param timerMode
     */
    @JsonIgnore
    public PSSysBackServiceDTO timermode(Integer timerMode){
        this.setTimerMode(timerMode);
        return this;
    }

     /**
     * 设置 定时触发模式，详细说明：{@link #FIELD_TIMERMODE}
     * <P>
     * 等同 {@link #setTimerMode}
     * @param timerMode
     */
    @JsonIgnore
    public PSSysBackServiceDTO timermode(Boolean timerMode){
        if(timerMode == null){
            this.setTimerMode(null);
        }
        else{
            this.setTimerMode(timerMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>TIMERPOLICY</B>&nbsp;定时策略，后台任务指定为定时触发模式时指定定时策略
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_TIMERPOLICY = "timerpolicy";

    /**
     * 设置 定时策略，详细说明：{@link #FIELD_TIMERPOLICY}
     * 
     * @param timerPolicy
     * 
     */
    @JsonProperty(FIELD_TIMERPOLICY)
    public void setTimerPolicy(String timerPolicy){
        this.set(FIELD_TIMERPOLICY, timerPolicy);
    }
    
    /**
     * 获取 定时策略  
     * @return
     */
    @JsonIgnore
    public String getTimerPolicy(){
        Object objValue = this.get(FIELD_TIMERPOLICY);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 定时策略 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTimerPolicyDirty(){
        if(this.contains(FIELD_TIMERPOLICY)){
            return true;
        }
        return false;
    }

    /**
     * 重置 定时策略
     */
    @JsonIgnore
    public void resetTimerPolicy(){
        this.reset(FIELD_TIMERPOLICY);
    }

    /**
     * 设置 定时策略，详细说明：{@link #FIELD_TIMERPOLICY}
     * <P>
     * 等同 {@link #setTimerPolicy}
     * @param timerPolicy
     */
    @JsonIgnore
    public PSSysBackServiceDTO timerpolicy(String timerPolicy){
        this.setTimerPolicy(timerPolicy);
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
    public PSSysBackServiceDTO updatedate(Timestamp updateDate){
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
    public PSSysBackServiceDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>USERCAT</B>&nbsp;用户分类
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.ModelUserCat} 
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
    public PSSysBackServiceDTO usercat(String userCat){
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
    public PSSysBackServiceDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat.value);
        }
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
    public PSSysBackServiceDTO userparams(String userParams){
        this.setUserParams(userParams);
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
    public PSSysBackServiceDTO usertag(String userTag){
        this.setUserTag(userTag);
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
    public PSSysBackServiceDTO usertag2(String userTag2){
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
    public PSSysBackServiceDTO usertag3(String userTag3){
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
    public PSSysBackServiceDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSSysBackServiceId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysBackServiceId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysBackServiceId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysBackServiceId(strValue);
    }

    @JsonIgnore
    public PSSysBackServiceDTO id(String strValue){
        this.setPSSysBackServiceId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysBackServiceDTO){
            PSSysBackServiceDTO dto = (PSSysBackServiceDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
