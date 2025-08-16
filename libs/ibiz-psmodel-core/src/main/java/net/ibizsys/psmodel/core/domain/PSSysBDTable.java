package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSSYSBDTABLE</B>大数据库表 模型传输对象
 * <P>
 * 大数据表模型，定义大数据表的类型、默认实体等信息，同时包括了大数据表列族及列等成员模型
 */
public class PSSysBDTable extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysBDTable(){
        this.setValidFlag(1);
    }      

    /**
     * <B>BDTABLETYPE</B>&nbsp;大数据表类型，指定大数据表的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.BDTableType} 
     */
    public final static String FIELD_BDTABLETYPE = "bdtabletype";

    /**
     * 设置 大数据表类型，详细说明：{@link #FIELD_BDTABLETYPE}
     * 
     * @param bDTableType
     * 
     */
    @JsonProperty(FIELD_BDTABLETYPE)
    public void setBDTableType(Integer bDTableType){
        this.set(FIELD_BDTABLETYPE, bDTableType);
    }
    
    /**
     * 获取 大数据表类型  
     * @return
     */
    @JsonIgnore
    public Integer getBDTableType(){
        Object objValue = this.get(FIELD_BDTABLETYPE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 大数据表类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBDTableTypeDirty(){
        if(this.contains(FIELD_BDTABLETYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 大数据表类型
     */
    @JsonIgnore
    public void resetBDTableType(){
        this.reset(FIELD_BDTABLETYPE);
    }

    /**
     * 设置 大数据表类型，详细说明：{@link #FIELD_BDTABLETYPE}
     * <P>
     * 等同 {@link #setBDTableType}
     * @param bDTableType
     */
    @JsonIgnore
    public PSSysBDTable bdtabletype(Integer bDTableType){
        this.setBDTableType(bDTableType);
        return this;
    }

     /**
     * 设置 大数据表类型，详细说明：{@link #FIELD_BDTABLETYPE}
     * <P>
     * 等同 {@link #setBDTableType}
     * @param bDTableType
     */
    @JsonIgnore
    public PSSysBDTable bdtabletype(net.ibizsys.psmodel.core.util.PSModelEnums.BDTableType bDTableType){
        if(bDTableType == null){
            this.setBDTableType(null);
        }
        else{
            this.setBDTableType(bDTableType.value);
        }
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定大数据表的代码标识，需要在所在的大数据体系中具有唯一性
     * <P>
     * 字符串：最大长度 30，由字母、数字、下划线组成，且开始必须为字母
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
    public PSSysBDTable codename(String codeName){
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
    public PSSysBDTable createdate(String createDate){
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
    public PSSysBDTable createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;逻辑名称，指定大数据表的逻辑名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_LOGICNAME = "logicname";

    /**
     * 设置 逻辑名称，详细说明：{@link #FIELD_LOGICNAME}
     * 
     * @param logicName
     * 
     */
    @JsonProperty(FIELD_LOGICNAME)
    public void setLogicName(String logicName){
        this.set(FIELD_LOGICNAME, logicName);
    }
    
    /**
     * 获取 逻辑名称  
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
     * 判断 逻辑名称 是否指定值，包括空值
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
     * 重置 逻辑名称
     */
    @JsonIgnore
    public void resetLogicName(){
        this.reset(FIELD_LOGICNAME);
    }

    /**
     * 设置 逻辑名称，详细说明：{@link #FIELD_LOGICNAME}
     * <P>
     * 等同 {@link #setLogicName}
     * @param logicName
     */
    @JsonIgnore
    public PSSysBDTable logicname(String logicName){
        this.setLogicName(logicName);
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
    public PSSysBDTable memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MODELVER</B>&nbsp;模型版本
     */
    public final static String FIELD_MODELVER = "modelver";

    /**
     * 设置 模型版本
     * 
     * @param modelVer
     * 
     */
    @JsonProperty(FIELD_MODELVER)
    public void setModelVer(Integer modelVer){
        this.set(FIELD_MODELVER, modelVer);
    }
    
    /**
     * 获取 模型版本  
     * @return
     */
    @JsonIgnore
    public Integer getModelVer(){
        Object objValue = this.get(FIELD_MODELVER);
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
    public boolean isModelVerDirty(){
        if(this.contains(FIELD_MODELVER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模型版本
     */
    @JsonIgnore
    public void resetModelVer(){
        this.reset(FIELD_MODELVER);
    }

    /**
     * 设置 模型版本
     * <P>
     * 等同 {@link #setModelVer}
     * @param modelVer
     */
    @JsonIgnore
    public PSSysBDTable modelver(Integer modelVer){
        this.setModelVer(modelVer);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;默认实体，指定大数据表的默认实体对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 默认实体，详细说明：{@link #FIELD_PSDEID}
     * 
     * @param pSDEId
     * 
     */
    @JsonProperty(FIELD_PSDEID)
    public void setPSDEId(String pSDEId){
        this.set(FIELD_PSDEID, pSDEId);
    }
    
    /**
     * 获取 默认实体  
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
     * 判断 默认实体 是否指定值，包括空值
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
     * 重置 默认实体
     */
    @JsonIgnore
    public void resetPSDEId(){
        this.reset(FIELD_PSDEID);
    }

    /**
     * 设置 默认实体，详细说明：{@link #FIELD_PSDEID}
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSSysBDTable psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * 设置 默认实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSSysBDTable psdeid(PSDataEntity pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;默认实体，指定大数据表的默认实体对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_PSDENAME = "psdename";

    /**
     * 设置 默认实体，详细说明：{@link #FIELD_PSDENAME}
     * 
     * @param pSDEName
     * 
     */
    @JsonProperty(FIELD_PSDENAME)
    public void setPSDEName(String pSDEName){
        this.set(FIELD_PSDENAME, pSDEName);
    }
    
    /**
     * 获取 默认实体  
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
     * 判断 默认实体 是否指定值，包括空值
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
     * 重置 默认实体
     */
    @JsonIgnore
    public void resetPSDEName(){
        this.reset(FIELD_PSDENAME);
    }

    /**
     * 设置 默认实体，详细说明：{@link #FIELD_PSDENAME}
     * <P>
     * 等同 {@link #setPSDEName}
     * @param pSDEName
     */
    @JsonIgnore
    public PSSysBDTable psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSSYSBDMODULEID</B>&nbsp;大数据模块，指定大数据表所属的大数据模块
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysBDModule} 
     */
    public final static String FIELD_PSSYSBDMODULEID = "pssysbdmoduleid";

    /**
     * 设置 大数据模块，详细说明：{@link #FIELD_PSSYSBDMODULEID}
     * 
     * @param pSSysBDModuleId
     * 
     */
    @JsonProperty(FIELD_PSSYSBDMODULEID)
    public void setPSSysBDModuleId(String pSSysBDModuleId){
        this.set(FIELD_PSSYSBDMODULEID, pSSysBDModuleId);
    }
    
    /**
     * 获取 大数据模块  
     * @return
     */
    @JsonIgnore
    public String getPSSysBDModuleId(){
        Object objValue = this.get(FIELD_PSSYSBDMODULEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 大数据模块 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBDModuleIdDirty(){
        if(this.contains(FIELD_PSSYSBDMODULEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 大数据模块
     */
    @JsonIgnore
    public void resetPSSysBDModuleId(){
        this.reset(FIELD_PSSYSBDMODULEID);
    }

    /**
     * 设置 大数据模块，详细说明：{@link #FIELD_PSSYSBDMODULEID}
     * <P>
     * 等同 {@link #setPSSysBDModuleId}
     * @param pSSysBDModuleId
     */
    @JsonIgnore
    public PSSysBDTable pssysbdmoduleid(String pSSysBDModuleId){
        this.setPSSysBDModuleId(pSSysBDModuleId);
        return this;
    }

    /**
     * 设置 大数据模块，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysBDModuleId}
     * @param pSSysBDModule 引用对象
     */
    @JsonIgnore
    public PSSysBDTable pssysbdmoduleid(PSSysBDModule pSSysBDModule){
        if(pSSysBDModule == null){
            this.setPSSysBDModuleId(null);
            this.setPSSysBDModuleName(null);
        }
        else{
            this.setPSSysBDModuleId(pSSysBDModule.getPSSysBDModuleId());
            this.setPSSysBDModuleName(pSSysBDModule.getPSSysBDModuleName());
        }
        return this;
    }

    /**
     * <B>PSSYSBDMODULENAME</B>&nbsp;大数据模块，指定大数据表所属的大数据模块
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBDMODULEID}
     */
    public final static String FIELD_PSSYSBDMODULENAME = "pssysbdmodulename";

    /**
     * 设置 大数据模块，详细说明：{@link #FIELD_PSSYSBDMODULENAME}
     * 
     * @param pSSysBDModuleName
     * 
     */
    @JsonProperty(FIELD_PSSYSBDMODULENAME)
    public void setPSSysBDModuleName(String pSSysBDModuleName){
        this.set(FIELD_PSSYSBDMODULENAME, pSSysBDModuleName);
    }
    
    /**
     * 获取 大数据模块  
     * @return
     */
    @JsonIgnore
    public String getPSSysBDModuleName(){
        Object objValue = this.get(FIELD_PSSYSBDMODULENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 大数据模块 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBDModuleNameDirty(){
        if(this.contains(FIELD_PSSYSBDMODULENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 大数据模块
     */
    @JsonIgnore
    public void resetPSSysBDModuleName(){
        this.reset(FIELD_PSSYSBDMODULENAME);
    }

    /**
     * 设置 大数据模块，详细说明：{@link #FIELD_PSSYSBDMODULENAME}
     * <P>
     * 等同 {@link #setPSSysBDModuleName}
     * @param pSSysBDModuleName
     */
    @JsonIgnore
    public PSSysBDTable pssysbdmodulename(String pSSysBDModuleName){
        this.setPSSysBDModuleName(pSSysBDModuleName);
        return this;
    }

    /**
     * <B>PSSYSBDPARTID</B>&nbsp;大数据分区，指定大数据表所在的大数据分区
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysBDPart} 
     */
    public final static String FIELD_PSSYSBDPARTID = "pssysbdpartid";

    /**
     * 设置 大数据分区，详细说明：{@link #FIELD_PSSYSBDPARTID}
     * 
     * @param pSSysBDPartId
     * 
     */
    @JsonProperty(FIELD_PSSYSBDPARTID)
    public void setPSSysBDPartId(String pSSysBDPartId){
        this.set(FIELD_PSSYSBDPARTID, pSSysBDPartId);
    }
    
    /**
     * 获取 大数据分区  
     * @return
     */
    @JsonIgnore
    public String getPSSysBDPartId(){
        Object objValue = this.get(FIELD_PSSYSBDPARTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 大数据分区 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBDPartIdDirty(){
        if(this.contains(FIELD_PSSYSBDPARTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 大数据分区
     */
    @JsonIgnore
    public void resetPSSysBDPartId(){
        this.reset(FIELD_PSSYSBDPARTID);
    }

    /**
     * 设置 大数据分区，详细说明：{@link #FIELD_PSSYSBDPARTID}
     * <P>
     * 等同 {@link #setPSSysBDPartId}
     * @param pSSysBDPartId
     */
    @JsonIgnore
    public PSSysBDTable pssysbdpartid(String pSSysBDPartId){
        this.setPSSysBDPartId(pSSysBDPartId);
        return this;
    }

    /**
     * 设置 大数据分区，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysBDPartId}
     * @param pSSysBDPart 引用对象
     */
    @JsonIgnore
    public PSSysBDTable pssysbdpartid(PSSysBDPart pSSysBDPart){
        if(pSSysBDPart == null){
            this.setPSSysBDPartId(null);
            this.setPSSysBDPartName(null);
        }
        else{
            this.setPSSysBDPartId(pSSysBDPart.getPSSysBDPartId());
            this.setPSSysBDPartName(pSSysBDPart.getPSSysBDPartName());
        }
        return this;
    }

    /**
     * <B>PSSYSBDPARTNAME</B>&nbsp;大数据分区，指定大数据表所在的大数据分区
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBDPARTID}
     */
    public final static String FIELD_PSSYSBDPARTNAME = "pssysbdpartname";

    /**
     * 设置 大数据分区，详细说明：{@link #FIELD_PSSYSBDPARTNAME}
     * 
     * @param pSSysBDPartName
     * 
     */
    @JsonProperty(FIELD_PSSYSBDPARTNAME)
    public void setPSSysBDPartName(String pSSysBDPartName){
        this.set(FIELD_PSSYSBDPARTNAME, pSSysBDPartName);
    }
    
    /**
     * 获取 大数据分区  
     * @return
     */
    @JsonIgnore
    public String getPSSysBDPartName(){
        Object objValue = this.get(FIELD_PSSYSBDPARTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 大数据分区 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBDPartNameDirty(){
        if(this.contains(FIELD_PSSYSBDPARTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 大数据分区
     */
    @JsonIgnore
    public void resetPSSysBDPartName(){
        this.reset(FIELD_PSSYSBDPARTNAME);
    }

    /**
     * 设置 大数据分区，详细说明：{@link #FIELD_PSSYSBDPARTNAME}
     * <P>
     * 等同 {@link #setPSSysBDPartName}
     * @param pSSysBDPartName
     */
    @JsonIgnore
    public PSSysBDTable pssysbdpartname(String pSSysBDPartName){
        this.setPSSysBDPartName(pSSysBDPartName);
        return this;
    }

    /**
     * <B>PSSYSBDSCHEMEID</B>&nbsp;大数据体系，指定大数据表所属的大数据体系
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysBDScheme} 
     */
    public final static String FIELD_PSSYSBDSCHEMEID = "pssysbdschemeid";

    /**
     * 设置 大数据体系，详细说明：{@link #FIELD_PSSYSBDSCHEMEID}
     * 
     * @param pSSysBDSchemeId
     * 
     */
    @JsonProperty(FIELD_PSSYSBDSCHEMEID)
    public void setPSSysBDSchemeId(String pSSysBDSchemeId){
        this.set(FIELD_PSSYSBDSCHEMEID, pSSysBDSchemeId);
    }
    
    /**
     * 获取 大数据体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysBDSchemeId(){
        Object objValue = this.get(FIELD_PSSYSBDSCHEMEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 大数据体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBDSchemeIdDirty(){
        if(this.contains(FIELD_PSSYSBDSCHEMEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 大数据体系
     */
    @JsonIgnore
    public void resetPSSysBDSchemeId(){
        this.reset(FIELD_PSSYSBDSCHEMEID);
    }

    /**
     * 设置 大数据体系，详细说明：{@link #FIELD_PSSYSBDSCHEMEID}
     * <P>
     * 等同 {@link #setPSSysBDSchemeId}
     * @param pSSysBDSchemeId
     */
    @JsonIgnore
    public PSSysBDTable pssysbdschemeid(String pSSysBDSchemeId){
        this.setPSSysBDSchemeId(pSSysBDSchemeId);
        return this;
    }

    /**
     * 设置 大数据体系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysBDSchemeId}
     * @param pSSysBDScheme 引用对象
     */
    @JsonIgnore
    public PSSysBDTable pssysbdschemeid(PSSysBDScheme pSSysBDScheme){
        if(pSSysBDScheme == null){
            this.setPSSysBDSchemeId(null);
            this.setPSSysBDSchemeName(null);
        }
        else{
            this.setPSSysBDSchemeId(pSSysBDScheme.getPSSysBDSchemeId());
            this.setPSSysBDSchemeName(pSSysBDScheme.getPSSysBDSchemeName());
        }
        return this;
    }

    /**
     * <B>PSSYSBDSCHEMENAME</B>&nbsp;大数据体系，指定大数据表所属的大数据体系
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBDSCHEMEID}
     */
    public final static String FIELD_PSSYSBDSCHEMENAME = "pssysbdschemename";

    /**
     * 设置 大数据体系，详细说明：{@link #FIELD_PSSYSBDSCHEMENAME}
     * 
     * @param pSSysBDSchemeName
     * 
     */
    @JsonProperty(FIELD_PSSYSBDSCHEMENAME)
    public void setPSSysBDSchemeName(String pSSysBDSchemeName){
        this.set(FIELD_PSSYSBDSCHEMENAME, pSSysBDSchemeName);
    }
    
    /**
     * 获取 大数据体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysBDSchemeName(){
        Object objValue = this.get(FIELD_PSSYSBDSCHEMENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 大数据体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBDSchemeNameDirty(){
        if(this.contains(FIELD_PSSYSBDSCHEMENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 大数据体系
     */
    @JsonIgnore
    public void resetPSSysBDSchemeName(){
        this.reset(FIELD_PSSYSBDSCHEMENAME);
    }

    /**
     * 设置 大数据体系，详细说明：{@link #FIELD_PSSYSBDSCHEMENAME}
     * <P>
     * 等同 {@link #setPSSysBDSchemeName}
     * @param pSSysBDSchemeName
     */
    @JsonIgnore
    public PSSysBDTable pssysbdschemename(String pSSysBDSchemeName){
        this.setPSSysBDSchemeName(pSSysBDSchemeName);
        return this;
    }

    /**
     * <B>PSSYSBDTABLEID</B>&nbsp;大数据表标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSBDTABLEID = "pssysbdtableid";

    /**
     * 设置 大数据表标识
     * 
     * @param pSSysBDTableId
     * 
     */
    @JsonProperty(FIELD_PSSYSBDTABLEID)
    public void setPSSysBDTableId(String pSSysBDTableId){
        this.set(FIELD_PSSYSBDTABLEID, pSSysBDTableId);
    }
    
    /**
     * 获取 大数据表标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysBDTableId(){
        Object objValue = this.get(FIELD_PSSYSBDTABLEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 大数据表标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBDTableIdDirty(){
        if(this.contains(FIELD_PSSYSBDTABLEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 大数据表标识
     */
    @JsonIgnore
    public void resetPSSysBDTableId(){
        this.reset(FIELD_PSSYSBDTABLEID);
    }

    /**
     * 设置 大数据表标识
     * <P>
     * 等同 {@link #setPSSysBDTableId}
     * @param pSSysBDTableId
     */
    @JsonIgnore
    public PSSysBDTable pssysbdtableid(String pSSysBDTableId){
        this.setPSSysBDTableId(pSSysBDTableId);
        return this;
    }

    /**
     * <B>PSSYSBDTABLENAME</B>&nbsp;大数据表名称，指定大数据表名称，需在所在大数据体系中具备唯一性
     * <P>
     * 字符串：最大长度 50，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSSYSBDTABLENAME = "pssysbdtablename";

    /**
     * 设置 大数据表名称，详细说明：{@link #FIELD_PSSYSBDTABLENAME}
     * 
     * @param pSSysBDTableName
     * 
     */
    @JsonProperty(FIELD_PSSYSBDTABLENAME)
    public void setPSSysBDTableName(String pSSysBDTableName){
        this.set(FIELD_PSSYSBDTABLENAME, pSSysBDTableName);
    }
    
    /**
     * 获取 大数据表名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysBDTableName(){
        Object objValue = this.get(FIELD_PSSYSBDTABLENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 大数据表名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBDTableNameDirty(){
        if(this.contains(FIELD_PSSYSBDTABLENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 大数据表名称
     */
    @JsonIgnore
    public void resetPSSysBDTableName(){
        this.reset(FIELD_PSSYSBDTABLENAME);
    }

    /**
     * 设置 大数据表名称，详细说明：{@link #FIELD_PSSYSBDTABLENAME}
     * <P>
     * 等同 {@link #setPSSysBDTableName}
     * @param pSSysBDTableName
     */
    @JsonIgnore
    public PSSysBDTable pssysbdtablename(String pSSysBDTableName){
        this.setPSSysBDTableName(pSSysBDTableName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysBDTableName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysBDTableName(strName);
    }

    @JsonIgnore
    public PSSysBDTable name(String strName){
        this.setPSSysBDTableName(strName);
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
    public PSSysBDTable updatedate(String updateDate){
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
    public PSSysBDTable updateman(String updateMan){
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
    public PSSysBDTable usercat(String userCat){
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
    public PSSysBDTable usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysBDTable usertag(String userTag){
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
    public PSSysBDTable usertag2(String userTag2){
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
    public PSSysBDTable usertag3(String userTag3){
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
    public PSSysBDTable usertag4(String userTag4){
        this.setUserTag4(userTag4);
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
    public PSSysBDTable validflag(Integer validFlag){
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
    public PSSysBDTable validflag(Boolean validFlag){
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
        return this.getPSSysBDTableId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysBDTableId(strValue);
    }

    @JsonIgnore
    public PSSysBDTable id(String strValue){
        this.setPSSysBDTableId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysBDTable){
            PSSysBDTable model = (PSSysBDTable)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
