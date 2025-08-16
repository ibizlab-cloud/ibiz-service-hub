package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEUAGROUP</B>实体界面行为组 模型传输对象
 * <P>
 * 实体界面行为的集合模型，组装一个或多个界面行为对象
 */
public class PSDEUAGroupDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSDEUAGroupDTO(){
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定界面行为组的代码标识，需要在所在的模型域（实体、系统模块或系统）中具有唯一性
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
    public PSDEUAGroupDTO codename(String codeName){
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
    public PSDEUAGroupDTO createdate(Timestamp createDate){
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
    public PSDEUAGroupDTO createman(String createMan){
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
    public PSDEUAGroupDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定界面行为组所在的实体对象
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
    public PSDEUAGroupDTO psdeid(String pSDEId){
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
    public PSDEUAGroupDTO psdeid(PSDataEntityDTO pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;实体，指定界面行为组所在的实体对象
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
    public PSDEUAGroupDTO psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSDEUAGROUPID</B>&nbsp;实体界面行为组标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEUAGROUPID = "psdeuagroupid";

    /**
     * 设置 实体界面行为组标识
     * 
     * @param pSDEUAGroupId
     * 
     */
    @JsonProperty(FIELD_PSDEUAGROUPID)
    public void setPSDEUAGroupId(String pSDEUAGroupId){
        this.set(FIELD_PSDEUAGROUPID, pSDEUAGroupId);
    }
    
    /**
     * 获取 实体界面行为组标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEUAGroupId(){
        Object objValue = this.get(FIELD_PSDEUAGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体界面行为组标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEUAGroupIdDirty(){
        if(this.contains(FIELD_PSDEUAGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体界面行为组标识
     */
    @JsonIgnore
    public void resetPSDEUAGroupId(){
        this.reset(FIELD_PSDEUAGROUPID);
    }

    /**
     * 设置 实体界面行为组标识
     * <P>
     * 等同 {@link #setPSDEUAGroupId}
     * @param pSDEUAGroupId
     */
    @JsonIgnore
    public PSDEUAGroupDTO psdeuagroupid(String pSDEUAGroupId){
        this.setPSDEUAGroupId(pSDEUAGroupId);
        return this;
    }

    /**
     * <B>PSDEUAGROUPNAME</B>&nbsp;界面行为组名称，指定界面行为组的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEUAGROUPNAME = "psdeuagroupname";

    /**
     * 设置 界面行为组名称，详细说明：{@link #FIELD_PSDEUAGROUPNAME}
     * 
     * @param pSDEUAGroupName
     * 
     */
    @JsonProperty(FIELD_PSDEUAGROUPNAME)
    public void setPSDEUAGroupName(String pSDEUAGroupName){
        this.set(FIELD_PSDEUAGROUPNAME, pSDEUAGroupName);
    }
    
    /**
     * 获取 界面行为组名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEUAGroupName(){
        Object objValue = this.get(FIELD_PSDEUAGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面行为组名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEUAGroupNameDirty(){
        if(this.contains(FIELD_PSDEUAGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面行为组名称
     */
    @JsonIgnore
    public void resetPSDEUAGroupName(){
        this.reset(FIELD_PSDEUAGROUPNAME);
    }

    /**
     * 设置 界面行为组名称，详细说明：{@link #FIELD_PSDEUAGROUPNAME}
     * <P>
     * 等同 {@link #setPSDEUAGroupName}
     * @param pSDEUAGroupName
     */
    @JsonIgnore
    public PSDEUAGroupDTO psdeuagroupname(String pSDEUAGroupName){
        this.setPSDEUAGroupName(pSDEUAGroupName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEUAGroupName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEUAGroupName(strName);
    }

    @JsonIgnore
    public PSDEUAGroupDTO name(String strName){
        this.setPSDEUAGroupName(strName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定实体界面行为组所在的系统模块
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
    public PSDEUAGroupDTO psmoduleid(String pSModuleId){
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
    public PSDEUAGroupDTO psmoduleid(PSModuleDTO pSModule){
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
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定实体界面行为组所在的系统模块
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
    public PSDEUAGroupDTO psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSWFID</B>&nbsp;系统流程，指定工作流界面行为组所在的工作流对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSWorkflowDTO} 
     */
    public final static String FIELD_PSWFID = "pswfid";

    /**
     * 设置 系统流程，详细说明：{@link #FIELD_PSWFID}
     * 
     * @param pSWFId
     * 
     */
    @JsonProperty(FIELD_PSWFID)
    public void setPSWFId(String pSWFId){
        this.set(FIELD_PSWFID, pSWFId);
    }
    
    /**
     * 获取 系统流程  
     * @return
     */
    @JsonIgnore
    public String getPSWFId(){
        Object objValue = this.get(FIELD_PSWFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统流程 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFIdDirty(){
        if(this.contains(FIELD_PSWFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统流程
     */
    @JsonIgnore
    public void resetPSWFId(){
        this.reset(FIELD_PSWFID);
    }

    /**
     * 设置 系统流程，详细说明：{@link #FIELD_PSWFID}
     * <P>
     * 等同 {@link #setPSWFId}
     * @param pSWFId
     */
    @JsonIgnore
    public PSDEUAGroupDTO pswfid(String pSWFId){
        this.setPSWFId(pSWFId);
        return this;
    }

    /**
     * 设置 系统流程，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSWFId}
     * @param pSWorkflow 引用对象
     */
    @JsonIgnore
    public PSDEUAGroupDTO pswfid(PSWorkflowDTO pSWorkflow){
        if(pSWorkflow == null){
            this.setPSWFId(null);
            this.setPSWFName(null);
        }
        else{
            this.setPSWFId(pSWorkflow.getPSWorkflowId());
            this.setPSWFName(pSWorkflow.getPSWorkflowName());
        }
        return this;
    }

    /**
     * <B>PSWFNAME</B>&nbsp;系统流程，指定工作流界面行为组所在的工作流对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWFID}
     */
    public final static String FIELD_PSWFNAME = "pswfname";

    /**
     * 设置 系统流程，详细说明：{@link #FIELD_PSWFNAME}
     * 
     * @param pSWFName
     * 
     */
    @JsonProperty(FIELD_PSWFNAME)
    public void setPSWFName(String pSWFName){
        this.set(FIELD_PSWFNAME, pSWFName);
    }
    
    /**
     * 获取 系统流程  
     * @return
     */
    @JsonIgnore
    public String getPSWFName(){
        Object objValue = this.get(FIELD_PSWFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统流程 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFNameDirty(){
        if(this.contains(FIELD_PSWFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统流程
     */
    @JsonIgnore
    public void resetPSWFName(){
        this.reset(FIELD_PSWFNAME);
    }

    /**
     * 设置 系统流程，详细说明：{@link #FIELD_PSWFNAME}
     * <P>
     * 等同 {@link #setPSWFName}
     * @param pSWFName
     */
    @JsonIgnore
    public PSDEUAGroupDTO pswfname(String pSWFName){
        this.setPSWFName(pSWFName);
        return this;
    }

    /**
     * <B>PSWFPROCESSID</B>&nbsp;流程处理标识
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO} 
     */
    public final static String FIELD_PSWFPROCESSID = "pswfprocessid";

    /**
     * 设置 流程处理标识
     * 
     * @param pSWFProcessId
     * 
     */
    @JsonProperty(FIELD_PSWFPROCESSID)
    public void setPSWFProcessId(String pSWFProcessId){
        this.set(FIELD_PSWFPROCESSID, pSWFProcessId);
    }
    
    /**
     * 获取 流程处理标识  
     * @return
     */
    @JsonIgnore
    public String getPSWFProcessId(){
        Object objValue = this.get(FIELD_PSWFPROCESSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程处理标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFProcessIdDirty(){
        if(this.contains(FIELD_PSWFPROCESSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程处理标识
     */
    @JsonIgnore
    public void resetPSWFProcessId(){
        this.reset(FIELD_PSWFPROCESSID);
    }

    /**
     * 设置 流程处理标识
     * <P>
     * 等同 {@link #setPSWFProcessId}
     * @param pSWFProcessId
     */
    @JsonIgnore
    public PSDEUAGroupDTO pswfprocessid(String pSWFProcessId){
        this.setPSWFProcessId(pSWFProcessId);
        return this;
    }

    /**
     * 设置 流程处理标识，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSWFProcessId}
     * @param pSWFProcess 引用对象
     */
    @JsonIgnore
    public PSDEUAGroupDTO pswfprocessid(PSWFProcessDTO pSWFProcess){
        if(pSWFProcess == null){
            this.setPSWFProcessId(null);
        }
        else{
            this.setPSWFProcessId(pSWFProcess.getPSWFProcessId());
        }
        return this;
    }

    /**
     * <B>PSWFPROCESSNAME</B>&nbsp;流程处理名称，指定工作流界面行为组所在的流程处理对象
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSWFPROCESSNAME = "pswfprocessname";

    /**
     * 设置 流程处理名称，详细说明：{@link #FIELD_PSWFPROCESSNAME}
     * 
     * @param pSWFProcessName
     * 
     */
    @JsonProperty(FIELD_PSWFPROCESSNAME)
    public void setPSWFProcessName(String pSWFProcessName){
        this.set(FIELD_PSWFPROCESSNAME, pSWFProcessName);
    }
    
    /**
     * 获取 流程处理名称  
     * @return
     */
    @JsonIgnore
    public String getPSWFProcessName(){
        Object objValue = this.get(FIELD_PSWFPROCESSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程处理名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFProcessNameDirty(){
        if(this.contains(FIELD_PSWFPROCESSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程处理名称
     */
    @JsonIgnore
    public void resetPSWFProcessName(){
        this.reset(FIELD_PSWFPROCESSNAME);
    }

    /**
     * 设置 流程处理名称，详细说明：{@link #FIELD_PSWFPROCESSNAME}
     * <P>
     * 等同 {@link #setPSWFProcessName}
     * @param pSWFProcessName
     */
    @JsonIgnore
    public PSDEUAGroupDTO pswfprocessname(String pSWFProcessName){
        this.setPSWFProcessName(pSWFProcessName);
        return this;
    }

    /**
     * <B>PSWFVERSIONID</B>&nbsp;工作流版本，指定工作流界面行为组所在的流程版本对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSWFVersionDTO} 
     */
    public final static String FIELD_PSWFVERSIONID = "pswfversionid";

    /**
     * 设置 工作流版本，详细说明：{@link #FIELD_PSWFVERSIONID}
     * 
     * @param pSWFVersionId
     * 
     */
    @JsonProperty(FIELD_PSWFVERSIONID)
    public void setPSWFVersionId(String pSWFVersionId){
        this.set(FIELD_PSWFVERSIONID, pSWFVersionId);
    }
    
    /**
     * 获取 工作流版本  
     * @return
     */
    @JsonIgnore
    public String getPSWFVersionId(){
        Object objValue = this.get(FIELD_PSWFVERSIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工作流版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFVersionIdDirty(){
        if(this.contains(FIELD_PSWFVERSIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工作流版本
     */
    @JsonIgnore
    public void resetPSWFVersionId(){
        this.reset(FIELD_PSWFVERSIONID);
    }

    /**
     * 设置 工作流版本，详细说明：{@link #FIELD_PSWFVERSIONID}
     * <P>
     * 等同 {@link #setPSWFVersionId}
     * @param pSWFVersionId
     */
    @JsonIgnore
    public PSDEUAGroupDTO pswfversionid(String pSWFVersionId){
        this.setPSWFVersionId(pSWFVersionId);
        return this;
    }

    /**
     * 设置 工作流版本，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSWFVersionId}
     * @param pSWFVersion 引用对象
     */
    @JsonIgnore
    public PSDEUAGroupDTO pswfversionid(PSWFVersionDTO pSWFVersion){
        if(pSWFVersion == null){
            this.setPSWFVersionId(null);
            this.setPSWFVersionName(null);
        }
        else{
            this.setPSWFVersionId(pSWFVersion.getPSWFVersionId());
            this.setPSWFVersionName(pSWFVersion.getPSWFVersionName());
        }
        return this;
    }

    /**
     * <B>PSWFVERSIONNAME</B>&nbsp;工作流版本，指定工作流界面行为组所在的流程版本对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWFVERSIONID}
     */
    public final static String FIELD_PSWFVERSIONNAME = "pswfversionname";

    /**
     * 设置 工作流版本，详细说明：{@link #FIELD_PSWFVERSIONNAME}
     * 
     * @param pSWFVersionName
     * 
     */
    @JsonProperty(FIELD_PSWFVERSIONNAME)
    public void setPSWFVersionName(String pSWFVersionName){
        this.set(FIELD_PSWFVERSIONNAME, pSWFVersionName);
    }
    
    /**
     * 获取 工作流版本  
     * @return
     */
    @JsonIgnore
    public String getPSWFVersionName(){
        Object objValue = this.get(FIELD_PSWFVERSIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工作流版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFVersionNameDirty(){
        if(this.contains(FIELD_PSWFVERSIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工作流版本
     */
    @JsonIgnore
    public void resetPSWFVersionName(){
        this.reset(FIELD_PSWFVERSIONNAME);
    }

    /**
     * 设置 工作流版本，详细说明：{@link #FIELD_PSWFVERSIONNAME}
     * <P>
     * 等同 {@link #setPSWFVersionName}
     * @param pSWFVersionName
     */
    @JsonIgnore
    public PSDEUAGroupDTO pswfversionname(String pSWFVersionName){
        this.setPSWFVersionName(pSWFVersionName);
        return this;
    }

    /**
     * <B>UAGROUPPARAM</B>&nbsp;行为组参数
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_UAGROUPPARAM = "uagroupparam";

    /**
     * 设置 行为组参数
     * 
     * @param uAGroupParam
     * 
     */
    @JsonProperty(FIELD_UAGROUPPARAM)
    public void setUAGroupParam(String uAGroupParam){
        this.set(FIELD_UAGROUPPARAM, uAGroupParam);
    }
    
    /**
     * 获取 行为组参数  
     * @return
     */
    @JsonIgnore
    public String getUAGroupParam(){
        Object objValue = this.get(FIELD_UAGROUPPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 行为组参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUAGroupParamDirty(){
        if(this.contains(FIELD_UAGROUPPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 行为组参数
     */
    @JsonIgnore
    public void resetUAGroupParam(){
        this.reset(FIELD_UAGROUPPARAM);
    }

    /**
     * 设置 行为组参数
     * <P>
     * 等同 {@link #setUAGroupParam}
     * @param uAGroupParam
     */
    @JsonIgnore
    public PSDEUAGroupDTO uagroupparam(String uAGroupParam){
        this.setUAGroupParam(uAGroupParam);
        return this;
    }

    /**
     * <B>UAGTAG</B>&nbsp;行为组标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_UAGTAG = "uagtag";

    /**
     * 设置 行为组标记
     * 
     * @param uAGTag
     * 
     */
    @JsonProperty(FIELD_UAGTAG)
    public void setUAGTag(String uAGTag){
        this.set(FIELD_UAGTAG, uAGTag);
    }
    
    /**
     * 获取 行为组标记  
     * @return
     */
    @JsonIgnore
    public String getUAGTag(){
        Object objValue = this.get(FIELD_UAGTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 行为组标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUAGTagDirty(){
        if(this.contains(FIELD_UAGTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 行为组标记
     */
    @JsonIgnore
    public void resetUAGTag(){
        this.reset(FIELD_UAGTAG);
    }

    /**
     * 设置 行为组标记
     * <P>
     * 等同 {@link #setUAGTag}
     * @param uAGTag
     */
    @JsonIgnore
    public PSDEUAGroupDTO uagtag(String uAGTag){
        this.setUAGTag(uAGTag);
        return this;
    }

    /**
     * <B>UAGTAG2</B>&nbsp;行为组标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_UAGTAG2 = "uagtag2";

    /**
     * 设置 行为组标记2
     * 
     * @param uAGTag2
     * 
     */
    @JsonProperty(FIELD_UAGTAG2)
    public void setUAGTag2(String uAGTag2){
        this.set(FIELD_UAGTAG2, uAGTag2);
    }
    
    /**
     * 获取 行为组标记2  
     * @return
     */
    @JsonIgnore
    public String getUAGTag2(){
        Object objValue = this.get(FIELD_UAGTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 行为组标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUAGTag2Dirty(){
        if(this.contains(FIELD_UAGTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 行为组标记2
     */
    @JsonIgnore
    public void resetUAGTag2(){
        this.reset(FIELD_UAGTAG2);
    }

    /**
     * 设置 行为组标记2
     * <P>
     * 等同 {@link #setUAGTag2}
     * @param uAGTag2
     */
    @JsonIgnore
    public PSDEUAGroupDTO uagtag2(String uAGTag2){
        this.setUAGTag2(uAGTag2);
        return this;
    }

    /**
     * <B>UAGTAG3</B>&nbsp;行为组标记3
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_UAGTAG3 = "uagtag3";

    /**
     * 设置 行为组标记3
     * 
     * @param uAGTag3
     * 
     */
    @JsonProperty(FIELD_UAGTAG3)
    public void setUAGTag3(String uAGTag3){
        this.set(FIELD_UAGTAG3, uAGTag3);
    }
    
    /**
     * 获取 行为组标记3  
     * @return
     */
    @JsonIgnore
    public String getUAGTag3(){
        Object objValue = this.get(FIELD_UAGTAG3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 行为组标记3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUAGTag3Dirty(){
        if(this.contains(FIELD_UAGTAG3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 行为组标记3
     */
    @JsonIgnore
    public void resetUAGTag3(){
        this.reset(FIELD_UAGTAG3);
    }

    /**
     * 设置 行为组标记3
     * <P>
     * 等同 {@link #setUAGTag3}
     * @param uAGTag3
     */
    @JsonIgnore
    public PSDEUAGroupDTO uagtag3(String uAGTag3){
        this.setUAGTag3(uAGTag3);
        return this;
    }

    /**
     * <B>UAGTAG4</B>&nbsp;行为组标记4
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_UAGTAG4 = "uagtag4";

    /**
     * 设置 行为组标记4
     * 
     * @param uAGTag4
     * 
     */
    @JsonProperty(FIELD_UAGTAG4)
    public void setUAGTag4(String uAGTag4){
        this.set(FIELD_UAGTAG4, uAGTag4);
    }
    
    /**
     * 获取 行为组标记4  
     * @return
     */
    @JsonIgnore
    public String getUAGTag4(){
        Object objValue = this.get(FIELD_UAGTAG4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 行为组标记4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUAGTag4Dirty(){
        if(this.contains(FIELD_UAGTAG4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 行为组标记4
     */
    @JsonIgnore
    public void resetUAGTag4(){
        this.reset(FIELD_UAGTAG4);
    }

    /**
     * 设置 行为组标记4
     * <P>
     * 等同 {@link #setUAGTag4}
     * @param uAGTag4
     */
    @JsonIgnore
    public PSDEUAGroupDTO uagtag4(String uAGTag4){
        this.setUAGTag4(uAGTag4);
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
    public PSDEUAGroupDTO updatedate(Timestamp updateDate){
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
    public PSDEUAGroupDTO updateman(String updateMan){
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
    public PSDEUAGroupDTO usercat(String userCat){
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
    public PSDEUAGroupDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat.value);
        }
        return this;
    }

    /**
     * <B>USERREFFLAG</B>&nbsp;用户引用标志
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_USERREFFLAG = "userrefflag";

    /**
     * 设置 用户引用标志
     * 
     * @param userRefFlag
     * 
     */
    @JsonProperty(FIELD_USERREFFLAG)
    public void setUserRefFlag(Integer userRefFlag){
        this.set(FIELD_USERREFFLAG, userRefFlag);
    }
    
    /**
     * 获取 用户引用标志  
     * @return
     */
    @JsonIgnore
    public Integer getUserRefFlag(){
        Object objValue = this.get(FIELD_USERREFFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 用户引用标志 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserRefFlagDirty(){
        if(this.contains(FIELD_USERREFFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户引用标志
     */
    @JsonIgnore
    public void resetUserRefFlag(){
        this.reset(FIELD_USERREFFLAG);
    }

    /**
     * 设置 用户引用标志
     * <P>
     * 等同 {@link #setUserRefFlag}
     * @param userRefFlag
     */
    @JsonIgnore
    public PSDEUAGroupDTO userrefflag(Integer userRefFlag){
        this.setUserRefFlag(userRefFlag);
        return this;
    }

     /**
     * 设置 用户引用标志
     * <P>
     * 等同 {@link #setUserRefFlag}
     * @param userRefFlag
     */
    @JsonIgnore
    public PSDEUAGroupDTO userrefflag(Boolean userRefFlag){
        if(userRefFlag == null){
            this.setUserRefFlag(null);
        }
        else{
            this.setUserRefFlag(userRefFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSDEUAGroupDTO usertag(String userTag){
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
    public PSDEUAGroupDTO usertag2(String userTag2){
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
    public PSDEUAGroupDTO usertag3(String userTag3){
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
    public PSDEUAGroupDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSDEUAGroupId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSDEUAGroupId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEUAGroupId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEUAGroupId(strValue);
    }

    @JsonIgnore
    public PSDEUAGroupDTO id(String strValue){
        this.setPSDEUAGroupId(strValue);
        return this;
    }


    /**
     *  实体界面行为组成员 成员集合
     */
    public final static String FIELD_PSDEUAGRPDETAILS = "psdeuagrpdetails";

    private java.util.List<net.ibizsys.centralstudio.dto.PSDEUAGroupDetailDTO> psdeuagrpdetails;

    /**
     * 获取 实体界面行为组成员 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEUAGRPDETAILS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEUAGroupDetailDTO> getPSDEUAGrpDetails(){
        return this.psdeuagrpdetails;
    }

    /**
     * 设置 实体界面行为组成员 成员集合  
     * @param psdeuagrpdetails
     */
    @JsonProperty(FIELD_PSDEUAGRPDETAILS)
    public void setPSDEUAGrpDetails(java.util.List<net.ibizsys.centralstudio.dto.PSDEUAGroupDetailDTO> psdeuagrpdetails){
        this.psdeuagrpdetails = psdeuagrpdetails;
    }

    /**
     * 获取 实体界面行为组成员 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEUAGroupDetailDTO> getPSDEUAGrpDetailsIf(){
        if(this.psdeuagrpdetails == null){
            this.psdeuagrpdetails = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSDEUAGroupDetailDTO>();          
        }
        return this.psdeuagrpdetails;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDEUAGroupDTO){
            PSDEUAGroupDTO dto = (PSDEUAGroupDTO)iEntity;
            dto.setPSDEUAGrpDetails(this.getPSDEUAGrpDetails());
        }
        super.copyTo(iEntity);
    }
}
