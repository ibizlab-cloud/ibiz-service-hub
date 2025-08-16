package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSWFUTILUIACTION</B>工作流功能操作 模型传输对象
 * <P>
 * 工作流功能操作模型，定义全局流程功能操作使用的界面行为，也支持区分工作流、工作流版本进行分别定义
 */
public class PSWFUtilUIAction extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSWFUtilUIAction(){
        this.setValidFlag(1);
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
    public PSWFUtilUIAction createdate(String createDate){
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
    public PSWFUtilUIAction createman(String createMan){
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
    public PSWFUtilUIAction memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSDEUIACTIONID</B>&nbsp;系统界面行为，指定流程功能操作调用的系统界面行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEUIAction} 
     */
    public final static String FIELD_PSDEUIACTIONID = "psdeuiactionid";

    /**
     * 设置 系统界面行为，详细说明：{@link #FIELD_PSDEUIACTIONID}
     * 
     * @param pSDEUIActionId
     * 
     */
    @JsonProperty(FIELD_PSDEUIACTIONID)
    public void setPSDEUIActionId(String pSDEUIActionId){
        this.set(FIELD_PSDEUIACTIONID, pSDEUIActionId);
    }
    
    /**
     * 获取 系统界面行为  
     * @return
     */
    @JsonIgnore
    public String getPSDEUIActionId(){
        Object objValue = this.get(FIELD_PSDEUIACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统界面行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEUIActionIdDirty(){
        if(this.contains(FIELD_PSDEUIACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统界面行为
     */
    @JsonIgnore
    public void resetPSDEUIActionId(){
        this.reset(FIELD_PSDEUIACTIONID);
    }

    /**
     * 设置 系统界面行为，详细说明：{@link #FIELD_PSDEUIACTIONID}
     * <P>
     * 等同 {@link #setPSDEUIActionId}
     * @param pSDEUIActionId
     */
    @JsonIgnore
    public PSWFUtilUIAction psdeuiactionid(String pSDEUIActionId){
        this.setPSDEUIActionId(pSDEUIActionId);
        return this;
    }

    /**
     * 设置 系统界面行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEUIActionId}
     * @param pSDEUIAction 引用对象
     */
    @JsonIgnore
    public PSWFUtilUIAction psdeuiactionid(PSDEUIAction pSDEUIAction){
        if(pSDEUIAction == null){
            this.setPSDEUIActionId(null);
            this.setPSDEUIActionName(null);
        }
        else{
            this.setPSDEUIActionId(pSDEUIAction.getPSDEUIActionId());
            this.setPSDEUIActionName(pSDEUIAction.getPSDEUIActionName());
        }
        return this;
    }

    /**
     * <B>PSDEUIACTIONNAME</B>&nbsp;系统界面行为，指定流程功能操作调用的系统界面行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEUIACTIONID}
     */
    public final static String FIELD_PSDEUIACTIONNAME = "psdeuiactionname";

    /**
     * 设置 系统界面行为，详细说明：{@link #FIELD_PSDEUIACTIONNAME}
     * 
     * @param pSDEUIActionName
     * 
     */
    @JsonProperty(FIELD_PSDEUIACTIONNAME)
    public void setPSDEUIActionName(String pSDEUIActionName){
        this.set(FIELD_PSDEUIACTIONNAME, pSDEUIActionName);
    }
    
    /**
     * 获取 系统界面行为  
     * @return
     */
    @JsonIgnore
    public String getPSDEUIActionName(){
        Object objValue = this.get(FIELD_PSDEUIACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统界面行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEUIActionNameDirty(){
        if(this.contains(FIELD_PSDEUIACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统界面行为
     */
    @JsonIgnore
    public void resetPSDEUIActionName(){
        this.reset(FIELD_PSDEUIACTIONNAME);
    }

    /**
     * 设置 系统界面行为，详细说明：{@link #FIELD_PSDEUIACTIONNAME}
     * <P>
     * 等同 {@link #setPSDEUIActionName}
     * @param pSDEUIActionName
     */
    @JsonIgnore
    public PSWFUtilUIAction psdeuiactionname(String pSDEUIActionName){
        this.setPSDEUIActionName(pSDEUIActionName);
        return this;
    }

    /**
     * <B>PSSYSWFSETTINGID</B>&nbsp;工作流设置，指定流程功能操作所属的工作流设置
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysWFSetting} 
     */
    public final static String FIELD_PSSYSWFSETTINGID = "pssyswfsettingid";

    /**
     * 设置 工作流设置，详细说明：{@link #FIELD_PSSYSWFSETTINGID}
     * 
     * @param pSSysWFSettingId
     * 
     */
    @JsonProperty(FIELD_PSSYSWFSETTINGID)
    public void setPSSysWFSettingId(String pSSysWFSettingId){
        this.set(FIELD_PSSYSWFSETTINGID, pSSysWFSettingId);
    }
    
    /**
     * 获取 工作流设置  
     * @return
     */
    @JsonIgnore
    public String getPSSysWFSettingId(){
        Object objValue = this.get(FIELD_PSSYSWFSETTINGID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工作流设置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysWFSettingIdDirty(){
        if(this.contains(FIELD_PSSYSWFSETTINGID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工作流设置
     */
    @JsonIgnore
    public void resetPSSysWFSettingId(){
        this.reset(FIELD_PSSYSWFSETTINGID);
    }

    /**
     * 设置 工作流设置，详细说明：{@link #FIELD_PSSYSWFSETTINGID}
     * <P>
     * 等同 {@link #setPSSysWFSettingId}
     * @param pSSysWFSettingId
     */
    @JsonIgnore
    public PSWFUtilUIAction pssyswfsettingid(String pSSysWFSettingId){
        this.setPSSysWFSettingId(pSSysWFSettingId);
        return this;
    }

    /**
     * 设置 工作流设置，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysWFSettingId}
     * @param pSSysWFSetting 引用对象
     */
    @JsonIgnore
    public PSWFUtilUIAction pssyswfsettingid(PSSysWFSetting pSSysWFSetting){
        if(pSSysWFSetting == null){
            this.setPSSysWFSettingId(null);
            this.setPSSysWFSettingName(null);
        }
        else{
            this.setPSSysWFSettingId(pSSysWFSetting.getPSSysWFSettingId());
            this.setPSSysWFSettingName(pSSysWFSetting.getPSSysWFSettingName());
        }
        return this;
    }

    /**
     * <B>PSSYSWFSETTINGNAME</B>&nbsp;工作流设置，指定流程功能操作所属的工作流设置
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSWFSETTINGID}
     */
    public final static String FIELD_PSSYSWFSETTINGNAME = "pssyswfsettingname";

    /**
     * 设置 工作流设置，详细说明：{@link #FIELD_PSSYSWFSETTINGNAME}
     * 
     * @param pSSysWFSettingName
     * 
     */
    @JsonProperty(FIELD_PSSYSWFSETTINGNAME)
    public void setPSSysWFSettingName(String pSSysWFSettingName){
        this.set(FIELD_PSSYSWFSETTINGNAME, pSSysWFSettingName);
    }
    
    /**
     * 获取 工作流设置  
     * @return
     */
    @JsonIgnore
    public String getPSSysWFSettingName(){
        Object objValue = this.get(FIELD_PSSYSWFSETTINGNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工作流设置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysWFSettingNameDirty(){
        if(this.contains(FIELD_PSSYSWFSETTINGNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工作流设置
     */
    @JsonIgnore
    public void resetPSSysWFSettingName(){
        this.reset(FIELD_PSSYSWFSETTINGNAME);
    }

    /**
     * 设置 工作流设置，详细说明：{@link #FIELD_PSSYSWFSETTINGNAME}
     * <P>
     * 等同 {@link #setPSSysWFSettingName}
     * @param pSSysWFSettingName
     */
    @JsonIgnore
    public PSWFUtilUIAction pssyswfsettingname(String pSSysWFSettingName){
        this.setPSSysWFSettingName(pSSysWFSettingName);
        return this;
    }

    /**
     * <B>PSWFUTILUIACTIONID</B>&nbsp;工作流功能界面行为标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSWFUTILUIACTIONID = "pswfutiluiactionid";

    /**
     * 设置 工作流功能界面行为标识
     * 
     * @param pSWFUtilUIActionId
     * 
     */
    @JsonProperty(FIELD_PSWFUTILUIACTIONID)
    public void setPSWFUtilUIActionId(String pSWFUtilUIActionId){
        this.set(FIELD_PSWFUTILUIACTIONID, pSWFUtilUIActionId);
    }
    
    /**
     * 获取 工作流功能界面行为标识  
     * @return
     */
    @JsonIgnore
    public String getPSWFUtilUIActionId(){
        Object objValue = this.get(FIELD_PSWFUTILUIACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工作流功能界面行为标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFUtilUIActionIdDirty(){
        if(this.contains(FIELD_PSWFUTILUIACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工作流功能界面行为标识
     */
    @JsonIgnore
    public void resetPSWFUtilUIActionId(){
        this.reset(FIELD_PSWFUTILUIACTIONID);
    }

    /**
     * 设置 工作流功能界面行为标识
     * <P>
     * 等同 {@link #setPSWFUtilUIActionId}
     * @param pSWFUtilUIActionId
     */
    @JsonIgnore
    public PSWFUtilUIAction pswfutiluiactionid(String pSWFUtilUIActionId){
        this.setPSWFUtilUIActionId(pSWFUtilUIActionId);
        return this;
    }

    /**
     * <B>PSWFUTILUIACTIONNAME</B>&nbsp;功能操作名称，指定流程功能操作的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSWFUTILUIACTIONNAME = "pswfutiluiactionname";

    /**
     * 设置 功能操作名称，详细说明：{@link #FIELD_PSWFUTILUIACTIONNAME}
     * 
     * @param pSWFUtilUIActionName
     * 
     */
    @JsonProperty(FIELD_PSWFUTILUIACTIONNAME)
    public void setPSWFUtilUIActionName(String pSWFUtilUIActionName){
        this.set(FIELD_PSWFUTILUIACTIONNAME, pSWFUtilUIActionName);
    }
    
    /**
     * 获取 功能操作名称  
     * @return
     */
    @JsonIgnore
    public String getPSWFUtilUIActionName(){
        Object objValue = this.get(FIELD_PSWFUTILUIACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能操作名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFUtilUIActionNameDirty(){
        if(this.contains(FIELD_PSWFUTILUIACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能操作名称
     */
    @JsonIgnore
    public void resetPSWFUtilUIActionName(){
        this.reset(FIELD_PSWFUTILUIACTIONNAME);
    }

    /**
     * 设置 功能操作名称，详细说明：{@link #FIELD_PSWFUTILUIACTIONNAME}
     * <P>
     * 等同 {@link #setPSWFUtilUIActionName}
     * @param pSWFUtilUIActionName
     */
    @JsonIgnore
    public PSWFUtilUIAction pswfutiluiactionname(String pSWFUtilUIActionName){
        this.setPSWFUtilUIActionName(pSWFUtilUIActionName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSWFUtilUIActionName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSWFUtilUIActionName(strName);
    }

    @JsonIgnore
    public PSWFUtilUIAction name(String strName){
        this.setPSWFUtilUIActionName(strName);
        return this;
    }

    /**
     * <B>PSWFVERSIONID</B>&nbsp;工作流版本，指定流程功能操作相关的工作流版本，仅在指定的工作流版本启用功能操作
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSWFVersion} 
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
    public PSWFUtilUIAction pswfversionid(String pSWFVersionId){
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
    public PSWFUtilUIAction pswfversionid(PSWFVersion pSWFVersion){
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
     * <B>PSWFVERSIONNAME</B>&nbsp;工作流版本，指定流程功能操作相关的工作流版本，仅在指定的工作流版本启用功能操作
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
    public PSWFUtilUIAction pswfversionname(String pSWFVersionName){
        this.setPSWFVersionName(pSWFVersionName);
        return this;
    }

    /**
     * <B>PSWORKFLOWID</B>&nbsp;工作流，指定流程功能操作相关的系统工作流，仅在指定的工作流启用功能操作
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSWorkflow} 
     */
    public final static String FIELD_PSWORKFLOWID = "psworkflowid";

    /**
     * 设置 工作流，详细说明：{@link #FIELD_PSWORKFLOWID}
     * 
     * @param pSWorkflowId
     * 
     */
    @JsonProperty(FIELD_PSWORKFLOWID)
    public void setPSWorkflowId(String pSWorkflowId){
        this.set(FIELD_PSWORKFLOWID, pSWorkflowId);
    }
    
    /**
     * 获取 工作流  
     * @return
     */
    @JsonIgnore
    public String getPSWorkflowId(){
        Object objValue = this.get(FIELD_PSWORKFLOWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工作流 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWorkflowIdDirty(){
        if(this.contains(FIELD_PSWORKFLOWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工作流
     */
    @JsonIgnore
    public void resetPSWorkflowId(){
        this.reset(FIELD_PSWORKFLOWID);
    }

    /**
     * 设置 工作流，详细说明：{@link #FIELD_PSWORKFLOWID}
     * <P>
     * 等同 {@link #setPSWorkflowId}
     * @param pSWorkflowId
     */
    @JsonIgnore
    public PSWFUtilUIAction psworkflowid(String pSWorkflowId){
        this.setPSWorkflowId(pSWorkflowId);
        return this;
    }

    /**
     * 设置 工作流，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSWorkflowId}
     * @param pSWorkflow 引用对象
     */
    @JsonIgnore
    public PSWFUtilUIAction psworkflowid(PSWorkflow pSWorkflow){
        if(pSWorkflow == null){
            this.setPSWorkflowId(null);
            this.setPSWorkflowName(null);
        }
        else{
            this.setPSWorkflowId(pSWorkflow.getPSWorkflowId());
            this.setPSWorkflowName(pSWorkflow.getPSWorkflowName());
        }
        return this;
    }

    /**
     * <B>PSWORKFLOWNAME</B>&nbsp;工作流，指定流程功能操作相关的系统工作流，仅在指定的工作流启用功能操作
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWORKFLOWID}
     */
    public final static String FIELD_PSWORKFLOWNAME = "psworkflowname";

    /**
     * 设置 工作流，详细说明：{@link #FIELD_PSWORKFLOWNAME}
     * 
     * @param pSWorkflowName
     * 
     */
    @JsonProperty(FIELD_PSWORKFLOWNAME)
    public void setPSWorkflowName(String pSWorkflowName){
        this.set(FIELD_PSWORKFLOWNAME, pSWorkflowName);
    }
    
    /**
     * 获取 工作流  
     * @return
     */
    @JsonIgnore
    public String getPSWorkflowName(){
        Object objValue = this.get(FIELD_PSWORKFLOWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工作流 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWorkflowNameDirty(){
        if(this.contains(FIELD_PSWORKFLOWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工作流
     */
    @JsonIgnore
    public void resetPSWorkflowName(){
        this.reset(FIELD_PSWORKFLOWNAME);
    }

    /**
     * 设置 工作流，详细说明：{@link #FIELD_PSWORKFLOWNAME}
     * <P>
     * 等同 {@link #setPSWorkflowName}
     * @param pSWorkflowName
     */
    @JsonIgnore
    public PSWFUtilUIAction psworkflowname(String pSWorkflowName){
        this.setPSWorkflowName(pSWorkflowName);
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
    public PSWFUtilUIAction updatedate(String updateDate){
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
    public PSWFUtilUIAction updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>UTILTYPE</B>&nbsp;功能类型，指定流程功能操作的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.WFUtilUIActionType} 
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
    public PSWFUtilUIAction utiltype(String utilType){
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
    public PSWFUtilUIAction utiltype(net.ibizsys.psmodel.core.util.PSModelEnums.WFUtilUIActionType utilType){
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
    public PSWFUtilUIAction validflag(Integer validFlag){
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
    public PSWFUtilUIAction validflag(Boolean validFlag){
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
        return this.getPSWFUtilUIActionId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSWFUtilUIActionId(strValue);
    }

    @JsonIgnore
    public PSWFUtilUIAction id(String strValue){
        this.setPSWFUtilUIActionId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSWFUtilUIAction){
            PSWFUtilUIAction model = (PSWFUtilUIAction)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
