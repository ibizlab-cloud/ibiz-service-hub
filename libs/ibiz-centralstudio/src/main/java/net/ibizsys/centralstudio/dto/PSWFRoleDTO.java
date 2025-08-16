package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSWFROLE</B>工作流角色 模型传输对象
 * <P>
 * 工作流角色模型，定义工作流相关的角色，支持自定义、数据集合及预置类型角色
 */
public class PSWFRoleDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSWFRoleDTO(){
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定工作流角色的代码标识，需要在所在的模型域（系统模块或系统）中具有唯一性
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
    public PSWFRoleDTO codename(String codeName){
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
    public PSWFRoleDTO createdate(Timestamp createDate){
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
    public PSWFRoleDTO createman(String createMan){
        this.setCreateMan(createMan);
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
    public PSWFRoleDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSDEDSID</B>&nbsp;数据集合，工作流角色类型为【实体数据集合】时指定引用的数据集合
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO} 
     */
    public final static String FIELD_PSDEDSID = "psdedsid";

    /**
     * 设置 数据集合，详细说明：{@link #FIELD_PSDEDSID}
     * 
     * @param pSDEDSId
     * 
     */
    @JsonProperty(FIELD_PSDEDSID)
    public void setPSDEDSId(String pSDEDSId){
        this.set(FIELD_PSDEDSID, pSDEDSId);
    }
    
    /**
     * 获取 数据集合  
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
     * 判断 数据集合 是否指定值，包括空值
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
     * 重置 数据集合
     */
    @JsonIgnore
    public void resetPSDEDSId(){
        this.reset(FIELD_PSDEDSID);
    }

    /**
     * 设置 数据集合，详细说明：{@link #FIELD_PSDEDSID}
     * <P>
     * 等同 {@link #setPSDEDSId}
     * @param pSDEDSId
     */
    @JsonIgnore
    public PSWFRoleDTO psdedsid(String pSDEDSId){
        this.setPSDEDSId(pSDEDSId);
        return this;
    }

    /**
     * 设置 数据集合，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDSId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSWFRoleDTO psdedsid(PSDEDataSetDTO pSDEDataSet){
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
     * <B>PSDEDSNAME</B>&nbsp;数据集合，工作流角色类型为【实体数据集合】时指定引用的数据集合
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDSID}
     */
    public final static String FIELD_PSDEDSNAME = "psdedsname";

    /**
     * 设置 数据集合，详细说明：{@link #FIELD_PSDEDSNAME}
     * 
     * @param pSDEDSName
     * 
     */
    @JsonProperty(FIELD_PSDEDSNAME)
    public void setPSDEDSName(String pSDEDSName){
        this.set(FIELD_PSDEDSNAME, pSDEDSName);
    }
    
    /**
     * 获取 数据集合  
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
     * 判断 数据集合 是否指定值，包括空值
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
     * 重置 数据集合
     */
    @JsonIgnore
    public void resetPSDEDSName(){
        this.reset(FIELD_PSDEDSNAME);
    }

    /**
     * 设置 数据集合，详细说明：{@link #FIELD_PSDEDSNAME}
     * <P>
     * 等同 {@link #setPSDEDSName}
     * @param pSDEDSName
     */
    @JsonIgnore
    public PSWFRoleDTO psdedsname(String pSDEDSName){
        this.setPSDEDSName(pSDEDSName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，工作流角色类型为【实体数据集合】时指定引用的数据集合所在的实体
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
    public PSWFRoleDTO psdeid(String pSDEId){
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
    public PSWFRoleDTO psdeid(PSDataEntityDTO pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;实体，工作流角色类型为【实体数据集合】时指定引用的数据集合所在的实体
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
    public PSWFRoleDTO psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定工作流角色所在的系统模块
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
    public PSWFRoleDTO psmoduleid(String pSModuleId){
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
    public PSWFRoleDTO psmoduleid(PSModuleDTO pSModule){
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
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定工作流角色所在的系统模块
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
    public PSWFRoleDTO psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINID</B>&nbsp;后端模板插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysSFPluginDTO} 
     */
    public final static String FIELD_PSSYSSFPLUGINID = "pssyssfpluginid";

    /**
     * 设置 后端模板插件
     * 
     * @param pSSysSFPluginId
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINID)
    public void setPSSysSFPluginId(String pSSysSFPluginId){
        this.set(FIELD_PSSYSSFPLUGINID, pSSysSFPluginId);
    }
    
    /**
     * 获取 后端模板插件  
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
     * 判断 后端模板插件 是否指定值，包括空值
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
     * 重置 后端模板插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginId(){
        this.reset(FIELD_PSSYSSFPLUGINID);
    }

    /**
     * 设置 后端模板插件
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPluginId
     */
    @JsonIgnore
    public PSWFRoleDTO pssyssfpluginid(String pSSysSFPluginId){
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    /**
     * 设置 后端模板插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPlugin 引用对象
     */
    @JsonIgnore
    public PSWFRoleDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin){
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
     * <B>PSSYSSFPLUGINNAME</B>&nbsp;后端模板插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSFPLUGINID}
     */
    public final static String FIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";

    /**
     * 设置 后端模板插件
     * 
     * @param pSSysSFPluginName
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINNAME)
    public void setPSSysSFPluginName(String pSSysSFPluginName){
        this.set(FIELD_PSSYSSFPLUGINNAME, pSSysSFPluginName);
    }
    
    /**
     * 获取 后端模板插件  
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
     * 判断 后端模板插件 是否指定值，包括空值
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
     * 重置 后端模板插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginName(){
        this.reset(FIELD_PSSYSSFPLUGINNAME);
    }

    /**
     * 设置 后端模板插件
     * <P>
     * 等同 {@link #setPSSysSFPluginName}
     * @param pSSysSFPluginName
     */
    @JsonIgnore
    public PSWFRoleDTO pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    /**
     * <B>PSWFROLEID</B>&nbsp;工作流角色标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSWFROLEID = "pswfroleid";

    /**
     * 设置 工作流角色标识
     * 
     * @param pSWFRoleId
     * 
     */
    @JsonProperty(FIELD_PSWFROLEID)
    public void setPSWFRoleId(String pSWFRoleId){
        this.set(FIELD_PSWFROLEID, pSWFRoleId);
    }
    
    /**
     * 获取 工作流角色标识  
     * @return
     */
    @JsonIgnore
    public String getPSWFRoleId(){
        Object objValue = this.get(FIELD_PSWFROLEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工作流角色标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFRoleIdDirty(){
        if(this.contains(FIELD_PSWFROLEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工作流角色标识
     */
    @JsonIgnore
    public void resetPSWFRoleId(){
        this.reset(FIELD_PSWFROLEID);
    }

    /**
     * 设置 工作流角色标识
     * <P>
     * 等同 {@link #setPSWFRoleId}
     * @param pSWFRoleId
     */
    @JsonIgnore
    public PSWFRoleDTO pswfroleid(String pSWFRoleId){
        this.setPSWFRoleId(pSWFRoleId);
        return this;
    }

    /**
     * <B>PSWFROLENAME</B>&nbsp;角色名称，指定工作流角色的名称，需要在所在的模型域（系统模块或系统）中具有唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSWFROLENAME = "pswfrolename";

    /**
     * 设置 角色名称，详细说明：{@link #FIELD_PSWFROLENAME}
     * 
     * @param pSWFRoleName
     * 
     */
    @JsonProperty(FIELD_PSWFROLENAME)
    public void setPSWFRoleName(String pSWFRoleName){
        this.set(FIELD_PSWFROLENAME, pSWFRoleName);
    }
    
    /**
     * 获取 角色名称  
     * @return
     */
    @JsonIgnore
    public String getPSWFRoleName(){
        Object objValue = this.get(FIELD_PSWFROLENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 角色名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFRoleNameDirty(){
        if(this.contains(FIELD_PSWFROLENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 角色名称
     */
    @JsonIgnore
    public void resetPSWFRoleName(){
        this.reset(FIELD_PSWFROLENAME);
    }

    /**
     * 设置 角色名称，详细说明：{@link #FIELD_PSWFROLENAME}
     * <P>
     * 等同 {@link #setPSWFRoleName}
     * @param pSWFRoleName
     */
    @JsonIgnore
    public PSWFRoleDTO pswfrolename(String pSWFRoleName){
        this.setPSWFRoleName(pSWFRoleName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSWFRoleName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSWFRoleName(strName);
    }

    @JsonIgnore
    public PSWFRoleDTO name(String strName){
        this.setPSWFRoleName(strName);
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
    public PSWFRoleDTO updatedate(Timestamp updateDate){
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
    public PSWFRoleDTO updateman(String updateMan){
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
    public PSWFRoleDTO usercat(String userCat){
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
    public PSWFRoleDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat.value);
        }
        return this;
    }

    /**
     * <B>USERDATA</B>&nbsp;角色数据
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_USERDATA = "userdata";

    /**
     * 设置 角色数据
     * 
     * @param userData
     * 
     */
    @JsonProperty(FIELD_USERDATA)
    public void setUserData(String userData){
        this.set(FIELD_USERDATA, userData);
    }
    
    /**
     * 获取 角色数据  
     * @return
     */
    @JsonIgnore
    public String getUserData(){
        Object objValue = this.get(FIELD_USERDATA);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 角色数据 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserDataDirty(){
        if(this.contains(FIELD_USERDATA)){
            return true;
        }
        return false;
    }

    /**
     * 重置 角色数据
     */
    @JsonIgnore
    public void resetUserData(){
        this.reset(FIELD_USERDATA);
    }

    /**
     * 设置 角色数据
     * <P>
     * 等同 {@link #setUserData}
     * @param userData
     */
    @JsonIgnore
    public PSWFRoleDTO userdata(String userData){
        this.setUserData(userData);
        return this;
    }

    /**
     * <B>USERDATA2</B>&nbsp;角色数据2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_USERDATA2 = "userdata2";

    /**
     * 设置 角色数据2
     * 
     * @param userData2
     * 
     */
    @JsonProperty(FIELD_USERDATA2)
    public void setUserData2(String userData2){
        this.set(FIELD_USERDATA2, userData2);
    }
    
    /**
     * 获取 角色数据2  
     * @return
     */
    @JsonIgnore
    public String getUserData2(){
        Object objValue = this.get(FIELD_USERDATA2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 角色数据2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserData2Dirty(){
        if(this.contains(FIELD_USERDATA2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 角色数据2
     */
    @JsonIgnore
    public void resetUserData2(){
        this.reset(FIELD_USERDATA2);
    }

    /**
     * 设置 角色数据2
     * <P>
     * 等同 {@link #setUserData2}
     * @param userData2
     */
    @JsonIgnore
    public PSWFRoleDTO userdata2(String userData2){
        this.setUserData2(userData2);
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
    public PSWFRoleDTO usertag(String userTag){
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
    public PSWFRoleDTO usertag2(String userTag2){
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
    public PSWFRoleDTO usertag3(String userTag3){
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
    public PSWFRoleDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>WFROLESN</B>&nbsp;工作流角色编号，指定工作流角色的编号
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_WFROLESN = "wfrolesn";

    /**
     * 设置 工作流角色编号，详细说明：{@link #FIELD_WFROLESN}
     * 
     * @param wFRoleSN
     * 
     */
    @JsonProperty(FIELD_WFROLESN)
    public void setWFRoleSN(String wFRoleSN){
        this.set(FIELD_WFROLESN, wFRoleSN);
    }
    
    /**
     * 获取 工作流角色编号  
     * @return
     */
    @JsonIgnore
    public String getWFRoleSN(){
        Object objValue = this.get(FIELD_WFROLESN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工作流角色编号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFRoleSNDirty(){
        if(this.contains(FIELD_WFROLESN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工作流角色编号
     */
    @JsonIgnore
    public void resetWFRoleSN(){
        this.reset(FIELD_WFROLESN);
    }

    /**
     * 设置 工作流角色编号，详细说明：{@link #FIELD_WFROLESN}
     * <P>
     * 等同 {@link #setWFRoleSN}
     * @param wFRoleSN
     */
    @JsonIgnore
    public PSWFRoleDTO wfrolesn(String wFRoleSN){
        this.setWFRoleSN(wFRoleSN);
        return this;
    }

    /**
     * <B>WFROLETYPE</B>&nbsp;角色类型，指定工作流角色的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.WFRoleType} 
     */
    public final static String FIELD_WFROLETYPE = "wfroletype";

    /**
     * 设置 角色类型，详细说明：{@link #FIELD_WFROLETYPE}
     * 
     * @param wFRoleType
     * 
     */
    @JsonProperty(FIELD_WFROLETYPE)
    public void setWFRoleType(String wFRoleType){
        this.set(FIELD_WFROLETYPE, wFRoleType);
    }
    
    /**
     * 获取 角色类型  
     * @return
     */
    @JsonIgnore
    public String getWFRoleType(){
        Object objValue = this.get(FIELD_WFROLETYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 角色类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFRoleTypeDirty(){
        if(this.contains(FIELD_WFROLETYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 角色类型
     */
    @JsonIgnore
    public void resetWFRoleType(){
        this.reset(FIELD_WFROLETYPE);
    }

    /**
     * 设置 角色类型，详细说明：{@link #FIELD_WFROLETYPE}
     * <P>
     * 等同 {@link #setWFRoleType}
     * @param wFRoleType
     */
    @JsonIgnore
    public PSWFRoleDTO wfroletype(String wFRoleType){
        this.setWFRoleType(wFRoleType);
        return this;
    }

     /**
     * 设置 角色类型，详细说明：{@link #FIELD_WFROLETYPE}
     * <P>
     * 等同 {@link #setWFRoleType}
     * @param wFRoleType
     */
    @JsonIgnore
    public PSWFRoleDTO wfroletype(net.ibizsys.model.PSModelEnums.WFRoleType wFRoleType){
        if(wFRoleType == null){
            this.setWFRoleType(null);
        }
        else{
            this.setWFRoleType(wFRoleType.value);
        }
        return this;
    }

    /**
     * <B>WFUSERIDPSDEFID</B>&nbsp;用户标识属性，工作流角色类型为【实体数据集合】时指定用户标识的取值属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_WFUSERIDPSDEFID = "wfuseridpsdefid";

    /**
     * 设置 用户标识属性，详细说明：{@link #FIELD_WFUSERIDPSDEFID}
     * 
     * @param wFUserIdPSDEFId
     * 
     */
    @JsonProperty(FIELD_WFUSERIDPSDEFID)
    public void setWFUserIdPSDEFId(String wFUserIdPSDEFId){
        this.set(FIELD_WFUSERIDPSDEFID, wFUserIdPSDEFId);
    }
    
    /**
     * 获取 用户标识属性  
     * @return
     */
    @JsonIgnore
    public String getWFUserIdPSDEFId(){
        Object objValue = this.get(FIELD_WFUSERIDPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户标识属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFUserIdPSDEFIdDirty(){
        if(this.contains(FIELD_WFUSERIDPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户标识属性
     */
    @JsonIgnore
    public void resetWFUserIdPSDEFId(){
        this.reset(FIELD_WFUSERIDPSDEFID);
    }

    /**
     * 设置 用户标识属性，详细说明：{@link #FIELD_WFUSERIDPSDEFID}
     * <P>
     * 等同 {@link #setWFUserIdPSDEFId}
     * @param wFUserIdPSDEFId
     */
    @JsonIgnore
    public PSWFRoleDTO wfuseridpsdefid(String wFUserIdPSDEFId){
        this.setWFUserIdPSDEFId(wFUserIdPSDEFId);
        return this;
    }

    /**
     * 设置 用户标识属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setWFUserIdPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSWFRoleDTO wfuseridpsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setWFUserIdPSDEFId(null);
            this.setWFUserIdPSDEFName(null);
        }
        else{
            this.setWFUserIdPSDEFId(pSDEField.getPSDEFieldId());
            this.setWFUserIdPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>WFUSERIDPSDEFNAME</B>&nbsp;用户标识属性，工作流角色类型为【实体数据集合】时指定用户标识的取值属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_WFUSERIDPSDEFID}
     */
    public final static String FIELD_WFUSERIDPSDEFNAME = "wfuseridpsdefname";

    /**
     * 设置 用户标识属性，详细说明：{@link #FIELD_WFUSERIDPSDEFNAME}
     * 
     * @param wFUserIdPSDEFName
     * 
     */
    @JsonProperty(FIELD_WFUSERIDPSDEFNAME)
    public void setWFUserIdPSDEFName(String wFUserIdPSDEFName){
        this.set(FIELD_WFUSERIDPSDEFNAME, wFUserIdPSDEFName);
    }
    
    /**
     * 获取 用户标识属性  
     * @return
     */
    @JsonIgnore
    public String getWFUserIdPSDEFName(){
        Object objValue = this.get(FIELD_WFUSERIDPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户标识属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFUserIdPSDEFNameDirty(){
        if(this.contains(FIELD_WFUSERIDPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户标识属性
     */
    @JsonIgnore
    public void resetWFUserIdPSDEFName(){
        this.reset(FIELD_WFUSERIDPSDEFNAME);
    }

    /**
     * 设置 用户标识属性，详细说明：{@link #FIELD_WFUSERIDPSDEFNAME}
     * <P>
     * 等同 {@link #setWFUserIdPSDEFName}
     * @param wFUserIdPSDEFName
     */
    @JsonIgnore
    public PSWFRoleDTO wfuseridpsdefname(String wFUserIdPSDEFName){
        this.setWFUserIdPSDEFName(wFUserIdPSDEFName);
        return this;
    }

    /**
     * <B>WFUSERNAMEPSDEFID</B>&nbsp;用户名称属性，工作流角色类型为【实体数据集合】时指定用户名称的取值属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_WFUSERNAMEPSDEFID = "wfusernamepsdefid";

    /**
     * 设置 用户名称属性，详细说明：{@link #FIELD_WFUSERNAMEPSDEFID}
     * 
     * @param wFUserNamePSDEFId
     * 
     */
    @JsonProperty(FIELD_WFUSERNAMEPSDEFID)
    public void setWFUserNamePSDEFId(String wFUserNamePSDEFId){
        this.set(FIELD_WFUSERNAMEPSDEFID, wFUserNamePSDEFId);
    }
    
    /**
     * 获取 用户名称属性  
     * @return
     */
    @JsonIgnore
    public String getWFUserNamePSDEFId(){
        Object objValue = this.get(FIELD_WFUSERNAMEPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户名称属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFUserNamePSDEFIdDirty(){
        if(this.contains(FIELD_WFUSERNAMEPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户名称属性
     */
    @JsonIgnore
    public void resetWFUserNamePSDEFId(){
        this.reset(FIELD_WFUSERNAMEPSDEFID);
    }

    /**
     * 设置 用户名称属性，详细说明：{@link #FIELD_WFUSERNAMEPSDEFID}
     * <P>
     * 等同 {@link #setWFUserNamePSDEFId}
     * @param wFUserNamePSDEFId
     */
    @JsonIgnore
    public PSWFRoleDTO wfusernamepsdefid(String wFUserNamePSDEFId){
        this.setWFUserNamePSDEFId(wFUserNamePSDEFId);
        return this;
    }

    /**
     * 设置 用户名称属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setWFUserNamePSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSWFRoleDTO wfusernamepsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setWFUserNamePSDEFId(null);
            this.setWFUserNamePSDEFName(null);
        }
        else{
            this.setWFUserNamePSDEFId(pSDEField.getPSDEFieldId());
            this.setWFUserNamePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>WFUSERNAMEPSDEFNAME</B>&nbsp;用户名称属性，工作流角色类型为【实体数据集合】时指定用户名称的取值属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_WFUSERNAMEPSDEFID}
     */
    public final static String FIELD_WFUSERNAMEPSDEFNAME = "wfusernamepsdefname";

    /**
     * 设置 用户名称属性，详细说明：{@link #FIELD_WFUSERNAMEPSDEFNAME}
     * 
     * @param wFUserNamePSDEFName
     * 
     */
    @JsonProperty(FIELD_WFUSERNAMEPSDEFNAME)
    public void setWFUserNamePSDEFName(String wFUserNamePSDEFName){
        this.set(FIELD_WFUSERNAMEPSDEFNAME, wFUserNamePSDEFName);
    }
    
    /**
     * 获取 用户名称属性  
     * @return
     */
    @JsonIgnore
    public String getWFUserNamePSDEFName(){
        Object objValue = this.get(FIELD_WFUSERNAMEPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户名称属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFUserNamePSDEFNameDirty(){
        if(this.contains(FIELD_WFUSERNAMEPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户名称属性
     */
    @JsonIgnore
    public void resetWFUserNamePSDEFName(){
        this.reset(FIELD_WFUSERNAMEPSDEFNAME);
    }

    /**
     * 设置 用户名称属性，详细说明：{@link #FIELD_WFUSERNAMEPSDEFNAME}
     * <P>
     * 等同 {@link #setWFUserNamePSDEFName}
     * @param wFUserNamePSDEFName
     */
    @JsonIgnore
    public PSWFRoleDTO wfusernamepsdefname(String wFUserNamePSDEFName){
        this.setWFUserNamePSDEFName(wFUserNamePSDEFName);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSWFRoleId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSWFRoleId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSWFRoleId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSWFRoleId(strValue);
    }

    @JsonIgnore
    public PSWFRoleDTO id(String strValue){
        this.setPSWFRoleId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSWFRoleDTO){
            PSWFRoleDTO dto = (PSWFRoleDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
