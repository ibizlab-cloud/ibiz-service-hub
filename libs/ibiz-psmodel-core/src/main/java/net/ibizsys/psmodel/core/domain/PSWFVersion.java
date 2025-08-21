package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSWFVERSION</B>流程定义版本 模型传输对象
 * <P>
 * 工作流版本模型，定义工作流不同版本的执行流程
 */
public class PSWFVersion extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSWFVersion(){
        this.setValidFlag(1);
    }      

    /**
     * <B>ACTIVITIMODEL</B>&nbsp;Activiti流程模型
     */
    public final static String FIELD_ACTIVITIMODEL = "activitimodel";

    /**
     * 设置 Activiti流程模型
     * 
     * @param activitiModel
     * 
     */
    @JsonProperty(FIELD_ACTIVITIMODEL)
    public void setActivitiModel(String activitiModel){
        this.set(FIELD_ACTIVITIMODEL, activitiModel);
    }
    
    /**
     * 获取 Activiti流程模型  
     * @return
     */
    @JsonIgnore
    public String getActivitiModel(){
        Object objValue = this.get(FIELD_ACTIVITIMODEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 Activiti流程模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActivitiModelDirty(){
        if(this.contains(FIELD_ACTIVITIMODEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 Activiti流程模型
     */
    @JsonIgnore
    public void resetActivitiModel(){
        this.reset(FIELD_ACTIVITIMODEL);
    }

    /**
     * 设置 Activiti流程模型
     * <P>
     * 等同 {@link #setActivitiModel}
     * @param activitiModel
     */
    @JsonIgnore
    public PSWFVersion activitimodel(String activitiModel){
        this.setActivitiModel(activitiModel);
        return this;
    }

    /**
     * <B>BPMNMODEL</B>&nbsp;BPMN模型
     */
    public final static String FIELD_BPMNMODEL = "bpmnmodel";

    /**
     * 设置 BPMN模型
     * 
     * @param bPMNModel
     * 
     */
    @JsonProperty(FIELD_BPMNMODEL)
    public void setBPMNModel(String bPMNModel){
        this.set(FIELD_BPMNMODEL, bPMNModel);
    }
    
    /**
     * 获取 BPMN模型  
     * @return
     */
    @JsonIgnore
    public String getBPMNModel(){
        Object objValue = this.get(FIELD_BPMNMODEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 BPMN模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBPMNModelDirty(){
        if(this.contains(FIELD_BPMNMODEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 BPMN模型
     */
    @JsonIgnore
    public void resetBPMNModel(){
        this.reset(FIELD_BPMNMODEL);
    }

    /**
     * 设置 BPMN模型
     * <P>
     * 等同 {@link #setBPMNModel}
     * @param bPMNModel
     */
    @JsonIgnore
    public PSWFVersion bpmnmodel(String bPMNModel){
        this.setBPMNModel(bPMNModel);
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
    public PSWFVersion createdate(String createDate){
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
    public PSWFVersion createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DYNAWFVER</B>&nbsp;版本号
     */
    public final static String FIELD_DYNAWFVER = "dynawfver";

    /**
     * 设置 版本号
     * 
     * @param dynaWFVer
     * 
     */
    @JsonProperty(FIELD_DYNAWFVER)
    public void setDynaWFVer(Integer dynaWFVer){
        this.set(FIELD_DYNAWFVER, dynaWFVer);
    }
    
    /**
     * 获取 版本号  
     * @return
     */
    @JsonIgnore
    public Integer getDynaWFVer(){
        Object objValue = this.get(FIELD_DYNAWFVER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 版本号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDynaWFVerDirty(){
        if(this.contains(FIELD_DYNAWFVER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 版本号
     */
    @JsonIgnore
    public void resetDynaWFVer(){
        this.reset(FIELD_DYNAWFVER);
    }

    /**
     * 设置 版本号
     * <P>
     * 等同 {@link #setDynaWFVer}
     * @param dynaWFVer
     */
    @JsonIgnore
    public PSWFVersion dynawfver(Integer dynaWFVer){
        this.setDynaWFVer(dynaWFVer);
        return this;
    }

    /**
     * <B>ENABLEDYNASYS</B>&nbsp;支持动态系统
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
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
    public PSWFVersion enabledynasys(Integer enableDynaSys){
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
    public PSWFVersion enabledynasys(Boolean enableDynaSys){
        if(enableDynaSys == null){
            this.setEnableDynaSys(null);
        }
        else{
            this.setEnableDynaSys(enableDynaSys?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLELOG</B>&nbsp;启用自动备份，指定工作流版本是否启用自动备份，启用自动备份每次变更时都会保留一个版本，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLELOG = "enablelog";

    /**
     * 设置 启用自动备份，详细说明：{@link #FIELD_ENABLELOG}
     * 
     * @param enableLog
     * 
     */
    @JsonProperty(FIELD_ENABLELOG)
    public void setEnableLog(Integer enableLog){
        this.set(FIELD_ENABLELOG, enableLog);
    }
    
    /**
     * 获取 启用自动备份  
     * @return
     */
    @JsonIgnore
    public Integer getEnableLog(){
        Object objValue = this.get(FIELD_ENABLELOG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用自动备份 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableLogDirty(){
        if(this.contains(FIELD_ENABLELOG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用自动备份
     */
    @JsonIgnore
    public void resetEnableLog(){
        this.reset(FIELD_ENABLELOG);
    }

    /**
     * 设置 启用自动备份，详细说明：{@link #FIELD_ENABLELOG}
     * <P>
     * 等同 {@link #setEnableLog}
     * @param enableLog
     */
    @JsonIgnore
    public PSWFVersion enablelog(Integer enableLog){
        this.setEnableLog(enableLog);
        return this;
    }

     /**
     * 设置 启用自动备份，详细说明：{@link #FIELD_ENABLELOG}
     * <P>
     * 等同 {@link #setEnableLog}
     * @param enableLog
     */
    @JsonIgnore
    public PSWFVersion enablelog(Boolean enableLog){
        if(enableLog == null){
            this.setEnableLog(null);
        }
        else{
            this.setEnableLog(enableLog?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>LASTBACKDATATAG</B>&nbsp;最后备份数据标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_LASTBACKDATATAG = "lastbackdatatag";

    /**
     * 设置 最后备份数据标记
     * 
     * @param lastBackDataTag
     * 
     */
    @JsonProperty(FIELD_LASTBACKDATATAG)
    public void setLastBackDataTag(String lastBackDataTag){
        this.set(FIELD_LASTBACKDATATAG, lastBackDataTag);
    }
    
    /**
     * 获取 最后备份数据标记  
     * @return
     */
    @JsonIgnore
    public String getLastBackDataTag(){
        Object objValue = this.get(FIELD_LASTBACKDATATAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 最后备份数据标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLastBackDataTagDirty(){
        if(this.contains(FIELD_LASTBACKDATATAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 最后备份数据标记
     */
    @JsonIgnore
    public void resetLastBackDataTag(){
        this.reset(FIELD_LASTBACKDATATAG);
    }

    /**
     * 设置 最后备份数据标记
     * <P>
     * 等同 {@link #setLastBackDataTag}
     * @param lastBackDataTag
     */
    @JsonIgnore
    public PSWFVersion lastbackdatatag(String lastBackDataTag){
        this.setLastBackDataTag(lastBackDataTag);
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
    public PSWFVersion memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSDYNAINSTNAME</B>&nbsp;动态实例
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDYNAINSTID}
     */
    public final static String FIELD_PSDYNAINSTNAME = "psdynainstname";

    /**
     * 设置 动态实例
     * 
     * @param pSDynaInstName
     * 
     */
    @JsonProperty(FIELD_PSDYNAINSTNAME)
    public void setPSDynaInstName(String pSDynaInstName){
        this.set(FIELD_PSDYNAINSTNAME, pSDynaInstName);
    }
    
    /**
     * 获取 动态实例  
     * @return
     */
    @JsonIgnore
    public String getPSDynaInstName(){
        Object objValue = this.get(FIELD_PSDYNAINSTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 动态实例 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDynaInstNameDirty(){
        if(this.contains(FIELD_PSDYNAINSTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 动态实例
     */
    @JsonIgnore
    public void resetPSDynaInstName(){
        this.reset(FIELD_PSDYNAINSTNAME);
    }

    /**
     * 设置 动态实例
     * <P>
     * 等同 {@link #setPSDynaInstName}
     * @param pSDynaInstName
     */
    @JsonIgnore
    public PSWFVersion psdynainstname(String pSDynaInstName){
        this.setPSDynaInstName(pSDynaInstName);
        return this;
    }

    /**
     * <B>PSDYNAWFVERINSTID</B>&nbsp;动态工作流版本实例标识
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_PSDYNAWFVERINSTID = "psdynawfverinstid";

    /**
     * 设置 动态工作流版本实例标识
     * 
     * @param pSDynaWFVerInstId
     * 
     */
    @JsonProperty(FIELD_PSDYNAWFVERINSTID)
    public void setPSDynaWFVerInstId(String pSDynaWFVerInstId){
        this.set(FIELD_PSDYNAWFVERINSTID, pSDynaWFVerInstId);
    }
    
    /**
     * 获取 动态工作流版本实例标识  
     * @return
     */
    @JsonIgnore
    public String getPSDynaWFVerInstId(){
        Object objValue = this.get(FIELD_PSDYNAWFVERINSTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 动态工作流版本实例标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDynaWFVerInstIdDirty(){
        if(this.contains(FIELD_PSDYNAWFVERINSTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 动态工作流版本实例标识
     */
    @JsonIgnore
    public void resetPSDynaWFVerInstId(){
        this.reset(FIELD_PSDYNAWFVERINSTID);
    }

    /**
     * 设置 动态工作流版本实例标识
     * <P>
     * 等同 {@link #setPSDynaWFVerInstId}
     * @param pSDynaWFVerInstId
     */
    @JsonIgnore
    public PSWFVersion psdynawfverinstid(String pSDynaWFVerInstId){
        this.setPSDynaWFVerInstId(pSDynaWFVerInstId);
        return this;
    }

    /**
     * <B>PSDYNAWFVERINSTNAME</B>&nbsp;动态工作流版本实例
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDYNAWFVERINSTNAME = "psdynawfverinstname";

    /**
     * 设置 动态工作流版本实例
     * 
     * @param pSDynaWFVerInstName
     * 
     */
    @JsonProperty(FIELD_PSDYNAWFVERINSTNAME)
    public void setPSDynaWFVerInstName(String pSDynaWFVerInstName){
        this.set(FIELD_PSDYNAWFVERINSTNAME, pSDynaWFVerInstName);
    }
    
    /**
     * 获取 动态工作流版本实例  
     * @return
     */
    @JsonIgnore
    public String getPSDynaWFVerInstName(){
        Object objValue = this.get(FIELD_PSDYNAWFVERINSTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 动态工作流版本实例 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDynaWFVerInstNameDirty(){
        if(this.contains(FIELD_PSDYNAWFVERINSTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 动态工作流版本实例
     */
    @JsonIgnore
    public void resetPSDynaWFVerInstName(){
        this.reset(FIELD_PSDYNAWFVERINSTNAME);
    }

    /**
     * 设置 动态工作流版本实例
     * <P>
     * 等同 {@link #setPSDynaWFVerInstName}
     * @param pSDynaWFVerInstName
     */
    @JsonIgnore
    public PSWFVersion psdynawfverinstname(String pSDynaWFVerInstName){
        this.setPSDynaWFVerInstName(pSDynaWFVerInstName);
        return this;
    }

    /**
     * <B>PSDYNAWFVERNAME</B>&nbsp;动态工作流版本
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDYNAWFVERID}
     */
    public final static String FIELD_PSDYNAWFVERNAME = "psdynawfvername";

    /**
     * 设置 动态工作流版本
     * 
     * @param pSDynaWFVerName
     * 
     */
    @JsonProperty(FIELD_PSDYNAWFVERNAME)
    public void setPSDynaWFVerName(String pSDynaWFVerName){
        this.set(FIELD_PSDYNAWFVERNAME, pSDynaWFVerName);
    }
    
    /**
     * 获取 动态工作流版本  
     * @return
     */
    @JsonIgnore
    public String getPSDynaWFVerName(){
        Object objValue = this.get(FIELD_PSDYNAWFVERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 动态工作流版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDynaWFVerNameDirty(){
        if(this.contains(FIELD_PSDYNAWFVERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 动态工作流版本
     */
    @JsonIgnore
    public void resetPSDynaWFVerName(){
        this.reset(FIELD_PSDYNAWFVERNAME);
    }

    /**
     * 设置 动态工作流版本
     * <P>
     * 等同 {@link #setPSDynaWFVerName}
     * @param pSDynaWFVerName
     */
    @JsonIgnore
    public PSWFVersion psdynawfvername(String pSDynaWFVerName){
        this.setPSDynaWFVerName(pSDynaWFVerName);
        return this;
    }

    /**
     * <B>PSSYSREQITEMID</B>&nbsp;系统设计需求
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysReqItem} 
     */
    public final static String FIELD_PSSYSREQITEMID = "pssysreqitemid";

    /**
     * 设置 系统设计需求
     * 
     * @param pSSysReqItemId
     * 
     */
    @JsonProperty(FIELD_PSSYSREQITEMID)
    public void setPSSysReqItemId(String pSSysReqItemId){
        this.set(FIELD_PSSYSREQITEMID, pSSysReqItemId);
    }
    
    /**
     * 获取 系统设计需求  
     * @return
     */
    @JsonIgnore
    public String getPSSysReqItemId(){
        Object objValue = this.get(FIELD_PSSYSREQITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统设计需求 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysReqItemIdDirty(){
        if(this.contains(FIELD_PSSYSREQITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统设计需求
     */
    @JsonIgnore
    public void resetPSSysReqItemId(){
        this.reset(FIELD_PSSYSREQITEMID);
    }

    /**
     * 设置 系统设计需求
     * <P>
     * 等同 {@link #setPSSysReqItemId}
     * @param pSSysReqItemId
     */
    @JsonIgnore
    public PSWFVersion pssysreqitemid(String pSSysReqItemId){
        this.setPSSysReqItemId(pSSysReqItemId);
        return this;
    }

    /**
     * 设置 系统设计需求，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysReqItemId}
     * @param pSSysReqItem 引用对象
     */
    @JsonIgnore
    public PSWFVersion pssysreqitemid(PSSysReqItem pSSysReqItem){
        if(pSSysReqItem == null){
            this.setPSSysReqItemId(null);
            this.setPSSysReqItemName(null);
        }
        else{
            this.setPSSysReqItemId(pSSysReqItem.getPSSysReqItemId());
            this.setPSSysReqItemName(pSSysReqItem.getPSSysReqItemName());
        }
        return this;
    }

    /**
     * <B>PSSYSREQITEMNAME</B>&nbsp;系统设计需求
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSREQITEMID}
     */
    public final static String FIELD_PSSYSREQITEMNAME = "pssysreqitemname";

    /**
     * 设置 系统设计需求
     * 
     * @param pSSysReqItemName
     * 
     */
    @JsonProperty(FIELD_PSSYSREQITEMNAME)
    public void setPSSysReqItemName(String pSSysReqItemName){
        this.set(FIELD_PSSYSREQITEMNAME, pSSysReqItemName);
    }
    
    /**
     * 获取 系统设计需求  
     * @return
     */
    @JsonIgnore
    public String getPSSysReqItemName(){
        Object objValue = this.get(FIELD_PSSYSREQITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统设计需求 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysReqItemNameDirty(){
        if(this.contains(FIELD_PSSYSREQITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统设计需求
     */
    @JsonIgnore
    public void resetPSSysReqItemName(){
        this.reset(FIELD_PSSYSREQITEMNAME);
    }

    /**
     * 设置 系统设计需求
     * <P>
     * 等同 {@link #setPSSysReqItemName}
     * @param pSSysReqItemName
     */
    @JsonIgnore
    public PSWFVersion pssysreqitemname(String pSSysReqItemName){
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    /**
     * <B>PSSYSWFMODEID</B>&nbsp;工作流模式，指定工作流版本相关的工作流模式
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysWFMode} 
     */
    public final static String FIELD_PSSYSWFMODEID = "pssyswfmodeid";

    /**
     * 设置 工作流模式，详细说明：{@link #FIELD_PSSYSWFMODEID}
     * 
     * @param pSSysWFModeId
     * 
     */
    @JsonProperty(FIELD_PSSYSWFMODEID)
    public void setPSSysWFModeId(String pSSysWFModeId){
        this.set(FIELD_PSSYSWFMODEID, pSSysWFModeId);
    }
    
    /**
     * 获取 工作流模式  
     * @return
     */
    @JsonIgnore
    public String getPSSysWFModeId(){
        Object objValue = this.get(FIELD_PSSYSWFMODEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工作流模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysWFModeIdDirty(){
        if(this.contains(FIELD_PSSYSWFMODEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工作流模式
     */
    @JsonIgnore
    public void resetPSSysWFModeId(){
        this.reset(FIELD_PSSYSWFMODEID);
    }

    /**
     * 设置 工作流模式，详细说明：{@link #FIELD_PSSYSWFMODEID}
     * <P>
     * 等同 {@link #setPSSysWFModeId}
     * @param pSSysWFModeId
     */
    @JsonIgnore
    public PSWFVersion pssyswfmodeid(String pSSysWFModeId){
        this.setPSSysWFModeId(pSSysWFModeId);
        return this;
    }

    /**
     * 设置 工作流模式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysWFModeId}
     * @param pSSysWFMode 引用对象
     */
    @JsonIgnore
    public PSWFVersion pssyswfmodeid(PSSysWFMode pSSysWFMode){
        if(pSSysWFMode == null){
            this.setPSSysWFModeId(null);
            this.setPSSysWFModeName(null);
            this.setWFMode(null);
        }
        else{
            this.setPSSysWFModeId(pSSysWFMode.getPSSysWFModeId());
            this.setPSSysWFModeName(pSSysWFMode.getPSSysWFModeName());
            this.setWFMode(pSSysWFMode.getWFMode());
        }
        return this;
    }

    /**
     * <B>PSSYSWFMODENAME</B>&nbsp;工作流模式，指定工作流版本相关的工作流模式
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSWFMODEID}
     */
    public final static String FIELD_PSSYSWFMODENAME = "pssyswfmodename";

    /**
     * 设置 工作流模式，详细说明：{@link #FIELD_PSSYSWFMODENAME}
     * 
     * @param pSSysWFModeName
     * 
     */
    @JsonProperty(FIELD_PSSYSWFMODENAME)
    public void setPSSysWFModeName(String pSSysWFModeName){
        this.set(FIELD_PSSYSWFMODENAME, pSSysWFModeName);
    }
    
    /**
     * 获取 工作流模式  
     * @return
     */
    @JsonIgnore
    public String getPSSysWFModeName(){
        Object objValue = this.get(FIELD_PSSYSWFMODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工作流模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysWFModeNameDirty(){
        if(this.contains(FIELD_PSSYSWFMODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工作流模式
     */
    @JsonIgnore
    public void resetPSSysWFModeName(){
        this.reset(FIELD_PSSYSWFMODENAME);
    }

    /**
     * 设置 工作流模式，详细说明：{@link #FIELD_PSSYSWFMODENAME}
     * <P>
     * 等同 {@link #setPSSysWFModeName}
     * @param pSSysWFModeName
     */
    @JsonIgnore
    public PSWFVersion pssyswfmodename(String pSSysWFModeName){
        this.setPSSysWFModeName(pSSysWFModeName);
        return this;
    }

    /**
     * <B>PSWFID</B>&nbsp;工作流，指定工作流版本所属的工作流
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSWorkflow} 
     */
    public final static String FIELD_PSWFID = "pswfid";

    /**
     * 设置 工作流，详细说明：{@link #FIELD_PSWFID}
     * 
     * @param pSWFId
     * 
     */
    @JsonProperty(FIELD_PSWFID)
    public void setPSWFId(String pSWFId){
        this.set(FIELD_PSWFID, pSWFId);
    }
    
    /**
     * 获取 工作流  
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
     * 判断 工作流 是否指定值，包括空值
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
     * 重置 工作流
     */
    @JsonIgnore
    public void resetPSWFId(){
        this.reset(FIELD_PSWFID);
    }

    /**
     * 设置 工作流，详细说明：{@link #FIELD_PSWFID}
     * <P>
     * 等同 {@link #setPSWFId}
     * @param pSWFId
     */
    @JsonIgnore
    public PSWFVersion pswfid(String pSWFId){
        this.setPSWFId(pSWFId);
        return this;
    }

    /**
     * 设置 工作流，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSWFId}
     * @param pSWorkflow 引用对象
     */
    @JsonIgnore
    public PSWFVersion pswfid(PSWorkflow pSWorkflow){
        if(pSWorkflow == null){
            this.setPSWFId(null);
            this.setPSWFName(null);
            this.setWFEngineType(null);
        }
        else{
            this.setPSWFId(pSWorkflow.getPSWorkflowId());
            this.setPSWFName(pSWorkflow.getPSWorkflowName());
            this.setWFEngineType(pSWorkflow.getWFEngineType());
        }
        return this;
    }

    /**
     * <B>PSWFNAME</B>&nbsp;工作流，指定工作流版本所属的工作流
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWFID}
     */
    public final static String FIELD_PSWFNAME = "pswfname";

    /**
     * 设置 工作流，详细说明：{@link #FIELD_PSWFNAME}
     * 
     * @param pSWFName
     * 
     */
    @JsonProperty(FIELD_PSWFNAME)
    public void setPSWFName(String pSWFName){
        this.set(FIELD_PSWFNAME, pSWFName);
    }
    
    /**
     * 获取 工作流  
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
     * 判断 工作流 是否指定值，包括空值
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
     * 重置 工作流
     */
    @JsonIgnore
    public void resetPSWFName(){
        this.reset(FIELD_PSWFNAME);
    }

    /**
     * 设置 工作流，详细说明：{@link #FIELD_PSWFNAME}
     * <P>
     * 等同 {@link #setPSWFName}
     * @param pSWFName
     */
    @JsonIgnore
    public PSWFVersion pswfname(String pSWFName){
        this.setPSWFName(pSWFName);
        return this;
    }

    /**
     * <B>PSWFVERSIONID</B>&nbsp;工作流版本标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSWFVERSIONID = "pswfversionid";

    /**
     * 设置 工作流版本标识
     * 
     * @param pSWFVersionId
     * 
     */
    @JsonProperty(FIELD_PSWFVERSIONID)
    public void setPSWFVersionId(String pSWFVersionId){
        this.set(FIELD_PSWFVERSIONID, pSWFVersionId);
    }
    
    /**
     * 获取 工作流版本标识  
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
     * 判断 工作流版本标识 是否指定值，包括空值
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
     * 重置 工作流版本标识
     */
    @JsonIgnore
    public void resetPSWFVersionId(){
        this.reset(FIELD_PSWFVERSIONID);
    }

    /**
     * 设置 工作流版本标识
     * <P>
     * 等同 {@link #setPSWFVersionId}
     * @param pSWFVersionId
     */
    @JsonIgnore
    public PSWFVersion pswfversionid(String pSWFVersionId){
        this.setPSWFVersionId(pSWFVersionId);
        return this;
    }

    /**
     * <B>PSWFVERSIONNAME</B>&nbsp;工作流版本名称，指定工作流版本的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSWFVERSIONNAME = "pswfversionname";

    /**
     * 设置 工作流版本名称，详细说明：{@link #FIELD_PSWFVERSIONNAME}
     * 
     * @param pSWFVersionName
     * 
     */
    @JsonProperty(FIELD_PSWFVERSIONNAME)
    public void setPSWFVersionName(String pSWFVersionName){
        this.set(FIELD_PSWFVERSIONNAME, pSWFVersionName);
    }
    
    /**
     * 获取 工作流版本名称  
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
     * 判断 工作流版本名称 是否指定值，包括空值
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
     * 重置 工作流版本名称
     */
    @JsonIgnore
    public void resetPSWFVersionName(){
        this.reset(FIELD_PSWFVERSIONNAME);
    }

    /**
     * 设置 工作流版本名称，详细说明：{@link #FIELD_PSWFVERSIONNAME}
     * <P>
     * 等同 {@link #setPSWFVersionName}
     * @param pSWFVersionName
     */
    @JsonIgnore
    public PSWFVersion pswfversionname(String pSWFVersionName){
        this.setPSWFVersionName(pSWFVersionName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSWFVersionName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSWFVersionName(strName);
    }

    @JsonIgnore
    public PSWFVersion name(String strName){
        this.setPSWFVersionName(strName);
        return this;
    }

    /**
     * <B>REMOVEFLAG</B>&nbsp;删除标记，流程版本需要标记为【允许删除】才允许进行删除，防止用户对关键模型进行误操作
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ModelRemoveMode} 
     */
    public final static String FIELD_REMOVEFLAG = "removeflag";

    /**
     * 设置 删除标记，详细说明：{@link #FIELD_REMOVEFLAG}
     * 
     * @param removeFlag
     * 
     */
    @JsonProperty(FIELD_REMOVEFLAG)
    public void setRemoveFlag(Integer removeFlag){
        this.set(FIELD_REMOVEFLAG, removeFlag);
    }
    
    /**
     * 获取 删除标记  
     * @return
     */
    @JsonIgnore
    public Integer getRemoveFlag(){
        Object objValue = this.get(FIELD_REMOVEFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 删除标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRemoveFlagDirty(){
        if(this.contains(FIELD_REMOVEFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 删除标记
     */
    @JsonIgnore
    public void resetRemoveFlag(){
        this.reset(FIELD_REMOVEFLAG);
    }

    /**
     * 设置 删除标记，详细说明：{@link #FIELD_REMOVEFLAG}
     * <P>
     * 等同 {@link #setRemoveFlag}
     * @param removeFlag
     */
    @JsonIgnore
    public PSWFVersion removeflag(Integer removeFlag){
        this.setRemoveFlag(removeFlag);
        return this;
    }

     /**
     * 设置 删除标记，详细说明：{@link #FIELD_REMOVEFLAG}
     * <P>
     * 等同 {@link #setRemoveFlag}
     * @param removeFlag
     */
    @JsonIgnore
    public PSWFVersion removeflag(net.ibizsys.psmodel.core.util.PSModelEnums.ModelRemoveMode removeFlag){
        if(removeFlag == null){
            this.setRemoveFlag(null);
        }
        else{
            this.setRemoveFlag(removeFlag.value);
        }
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
    public PSWFVersion updatedate(String updateDate){
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
    public PSWFVersion updateman(String updateMan){
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
    public PSWFVersion usercat(String userCat){
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
    public PSWFVersion usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSWFVersion usertag(String userTag){
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
    public PSWFVersion usertag2(String userTag2){
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
    public PSWFVersion usertag3(String userTag3){
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
    public PSWFVersion usertag4(String userTag4){
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
    public PSWFVersion validflag(Integer validFlag){
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
    public PSWFVersion validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>VERTAG</B>&nbsp;版本标记，指定工作流版本的标记
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_VERTAG = "vertag";

    /**
     * 设置 版本标记，详细说明：{@link #FIELD_VERTAG}
     * 
     * @param verTag
     * 
     */
    @JsonProperty(FIELD_VERTAG)
    public void setVerTag(String verTag){
        this.set(FIELD_VERTAG, verTag);
    }
    
    /**
     * 获取 版本标记  
     * @return
     */
    @JsonIgnore
    public String getVerTag(){
        Object objValue = this.get(FIELD_VERTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 版本标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isVerTagDirty(){
        if(this.contains(FIELD_VERTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 版本标记
     */
    @JsonIgnore
    public void resetVerTag(){
        this.reset(FIELD_VERTAG);
    }

    /**
     * 设置 版本标记，详细说明：{@link #FIELD_VERTAG}
     * <P>
     * 等同 {@link #setVerTag}
     * @param verTag
     */
    @JsonIgnore
    public PSWFVersion vertag(String verTag){
        this.setVerTag(verTag);
        return this;
    }

    /**
     * <B>VERTAG2</B>&nbsp;版本标记2，指定工作流版本的标记2
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_VERTAG2 = "vertag2";

    /**
     * 设置 版本标记2，详细说明：{@link #FIELD_VERTAG2}
     * 
     * @param verTag2
     * 
     */
    @JsonProperty(FIELD_VERTAG2)
    public void setVerTag2(String verTag2){
        this.set(FIELD_VERTAG2, verTag2);
    }
    
    /**
     * 获取 版本标记2  
     * @return
     */
    @JsonIgnore
    public String getVerTag2(){
        Object objValue = this.get(FIELD_VERTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 版本标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isVerTag2Dirty(){
        if(this.contains(FIELD_VERTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 版本标记2
     */
    @JsonIgnore
    public void resetVerTag2(){
        this.reset(FIELD_VERTAG2);
    }

    /**
     * 设置 版本标记2，详细说明：{@link #FIELD_VERTAG2}
     * <P>
     * 等同 {@link #setVerTag2}
     * @param verTag2
     */
    @JsonIgnore
    public PSWFVersion vertag2(String verTag2){
        this.setVerTag2(verTag2);
        return this;
    }

    /**
     * <B>WFENGINETYPE</B>&nbsp;引擎类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.WFEngineType} 
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWFID}
     */
    public final static String FIELD_WFENGINETYPE = "wfenginetype";

    /**
     * 设置 引擎类型
     * 
     * @param wFEngineType
     * 
     */
    @JsonProperty(FIELD_WFENGINETYPE)
    public void setWFEngineType(String wFEngineType){
        this.set(FIELD_WFENGINETYPE, wFEngineType);
    }
    
    /**
     * 获取 引擎类型  
     * @return
     */
    @JsonIgnore
    public String getWFEngineType(){
        Object objValue = this.get(FIELD_WFENGINETYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引擎类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFEngineTypeDirty(){
        if(this.contains(FIELD_WFENGINETYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引擎类型
     */
    @JsonIgnore
    public void resetWFEngineType(){
        this.reset(FIELD_WFENGINETYPE);
    }

    /**
     * 设置 引擎类型
     * <P>
     * 等同 {@link #setWFEngineType}
     * @param wFEngineType
     */
    @JsonIgnore
    public PSWFVersion wfenginetype(String wFEngineType){
        this.setWFEngineType(wFEngineType);
        return this;
    }

    /**
     * <B>WFMODE</B>&nbsp;流程模式
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSWFMODEID}
     */
    public final static String FIELD_WFMODE = "wfmode";

    /**
     * 设置 流程模式
     * 
     * @param wFMode
     * 
     */
    @JsonProperty(FIELD_WFMODE)
    public void setWFMode(String wFMode){
        this.set(FIELD_WFMODE, wFMode);
    }
    
    /**
     * 获取 流程模式  
     * @return
     */
    @JsonIgnore
    public String getWFMode(){
        Object objValue = this.get(FIELD_WFMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFModeDirty(){
        if(this.contains(FIELD_WFMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程模式
     */
    @JsonIgnore
    public void resetWFMode(){
        this.reset(FIELD_WFMODE);
    }

    /**
     * 设置 流程模式
     * <P>
     * 等同 {@link #setWFMode}
     * @param wFMode
     */
    @JsonIgnore
    public PSWFVersion wfmode(String wFMode){
        this.setWFMode(wFMode);
        return this;
    }

    /**
     * <B>WFSTEPPSCODELISTID</B>&nbsp;流程步骤代码表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSCodeList} 
     */
    public final static String FIELD_WFSTEPPSCODELISTID = "wfsteppscodelistid";

    /**
     * 设置 流程步骤代码表
     * 
     * @param wFStepPSCodeListId
     * 
     */
    @JsonProperty(FIELD_WFSTEPPSCODELISTID)
    public void setWFStepPSCodeListId(String wFStepPSCodeListId){
        this.set(FIELD_WFSTEPPSCODELISTID, wFStepPSCodeListId);
    }
    
    /**
     * 获取 流程步骤代码表  
     * @return
     */
    @JsonIgnore
    public String getWFStepPSCodeListId(){
        Object objValue = this.get(FIELD_WFSTEPPSCODELISTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程步骤代码表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFStepPSCodeListIdDirty(){
        if(this.contains(FIELD_WFSTEPPSCODELISTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程步骤代码表
     */
    @JsonIgnore
    public void resetWFStepPSCodeListId(){
        this.reset(FIELD_WFSTEPPSCODELISTID);
    }

    /**
     * 设置 流程步骤代码表
     * <P>
     * 等同 {@link #setWFStepPSCodeListId}
     * @param wFStepPSCodeListId
     */
    @JsonIgnore
    public PSWFVersion wfsteppscodelistid(String wFStepPSCodeListId){
        this.setWFStepPSCodeListId(wFStepPSCodeListId);
        return this;
    }

    /**
     * 设置 流程步骤代码表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setWFStepPSCodeListId}
     * @param pSCodeList 引用对象
     */
    @JsonIgnore
    public PSWFVersion wfsteppscodelistid(PSCodeList pSCodeList){
        if(pSCodeList == null){
            this.setWFStepPSCodeListId(null);
            this.setWFStepPSCodeListName(null);
        }
        else{
            this.setWFStepPSCodeListId(pSCodeList.getPSCodeListId());
            this.setWFStepPSCodeListName(pSCodeList.getPSCodeListName());
        }
        return this;
    }

    /**
     * <B>WFSTEPPSCODELISTNAME</B>&nbsp;流程步骤代码表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_WFSTEPPSCODELISTID}
     */
    public final static String FIELD_WFSTEPPSCODELISTNAME = "wfsteppscodelistname";

    /**
     * 设置 流程步骤代码表
     * 
     * @param wFStepPSCodeListName
     * 
     */
    @JsonProperty(FIELD_WFSTEPPSCODELISTNAME)
    public void setWFStepPSCodeListName(String wFStepPSCodeListName){
        this.set(FIELD_WFSTEPPSCODELISTNAME, wFStepPSCodeListName);
    }
    
    /**
     * 获取 流程步骤代码表  
     * @return
     */
    @JsonIgnore
    public String getWFStepPSCodeListName(){
        Object objValue = this.get(FIELD_WFSTEPPSCODELISTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程步骤代码表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFStepPSCodeListNameDirty(){
        if(this.contains(FIELD_WFSTEPPSCODELISTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程步骤代码表
     */
    @JsonIgnore
    public void resetWFStepPSCodeListName(){
        this.reset(FIELD_WFSTEPPSCODELISTNAME);
    }

    /**
     * 设置 流程步骤代码表
     * <P>
     * 等同 {@link #setWFStepPSCodeListName}
     * @param wFStepPSCodeListName
     */
    @JsonIgnore
    public PSWFVersion wfsteppscodelistname(String wFStepPSCodeListName){
        this.setWFStepPSCodeListName(wFStepPSCodeListName);
        return this;
    }

    /**
     * <B>WFVERMODE</B>&nbsp;应用模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.WFVerMode} 
     */
    public final static String FIELD_WFVERMODE = "wfvermode";

    /**
     * 设置 应用模式
     * 
     * @param wFVerMode
     * 
     */
    @JsonProperty(FIELD_WFVERMODE)
    public void setWFVerMode(String wFVerMode){
        this.set(FIELD_WFVERMODE, wFVerMode);
    }
    
    /**
     * 获取 应用模式  
     * @return
     */
    @JsonIgnore
    public String getWFVerMode(){
        Object objValue = this.get(FIELD_WFVERMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFVerModeDirty(){
        if(this.contains(FIELD_WFVERMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用模式
     */
    @JsonIgnore
    public void resetWFVerMode(){
        this.reset(FIELD_WFVERMODE);
    }

    /**
     * 设置 应用模式
     * <P>
     * 等同 {@link #setWFVerMode}
     * @param wFVerMode
     */
    @JsonIgnore
    public PSWFVersion wfvermode(String wFVerMode){
        this.setWFVerMode(wFVerMode);
        return this;
    }

     /**
     * 设置 应用模式
     * <P>
     * 等同 {@link #setWFVerMode}
     * @param wFVerMode
     */
    @JsonIgnore
    public PSWFVersion wfvermode(net.ibizsys.psmodel.core.util.PSModelEnums.WFVerMode wFVerMode){
        if(wFVerMode == null){
            this.setWFVerMode(null);
        }
        else{
            this.setWFVerMode(wFVerMode.value);
        }
        return this;
    }

    /**
     * <B>WFVERSION</B>&nbsp;版本号，指定工作流版本的版本号，需在所在的工作流中具备唯一性
     */
    public final static String FIELD_WFVERSION = "wfversion";

    /**
     * 设置 版本号，详细说明：{@link #FIELD_WFVERSION}
     * 
     * @param wFVersion
     * 
     */
    @JsonProperty(FIELD_WFVERSION)
    public void setWFVersion(Integer wFVersion){
        this.set(FIELD_WFVERSION, wFVersion);
    }
    
    /**
     * 获取 版本号  
     * @return
     */
    @JsonIgnore
    public Integer getWFVersion(){
        Object objValue = this.get(FIELD_WFVERSION);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 版本号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFVersionDirty(){
        if(this.contains(FIELD_WFVERSION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 版本号
     */
    @JsonIgnore
    public void resetWFVersion(){
        this.reset(FIELD_WFVERSION);
    }

    /**
     * 设置 版本号，详细说明：{@link #FIELD_WFVERSION}
     * <P>
     * 等同 {@link #setWFVersion}
     * @param wFVersion
     */
    @JsonIgnore
    public PSWFVersion wfversion(Integer wFVersion){
        this.setWFVersion(wFVersion);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSWFVersionId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSWFVersionId(strValue);
    }

    @JsonIgnore
    public PSWFVersion id(String strValue){
        this.setPSWFVersionId(strValue);
        return this;
    }


    /**
     *  流程处理节点 成员集合
     */
    public final static String FIELD_PSWFPROCESSES = "pswfprocesses";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSWFProcess> pswfprocesses;

    /**
     * 获取 流程处理节点 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSWFPROCESSES)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSWFProcess> getPSWFProcesses(){
        return this.pswfprocesses;
    }

    /**
     * 设置 流程处理节点 成员集合  
     * @param pswfprocesses
     */
    @JsonProperty(FIELD_PSWFPROCESSES)
    public void setPSWFProcesses(java.util.List<net.ibizsys.psmodel.core.domain.PSWFProcess> pswfprocesses){
        this.pswfprocesses = pswfprocesses;
    }

    /**
     * 获取 流程处理节点 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSWFProcess> getPSWFProcessesIf(){
        if(this.pswfprocesses == null){
            this.pswfprocesses = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSWFProcess>();          
        }
        return this.pswfprocesses;
    }


    /**
     *  流程处理连接 成员集合
     */
    public final static String FIELD_PSWFLINKS = "pswflinks";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSWFLink> pswflinks;

    /**
     * 获取 流程处理连接 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSWFLINKS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSWFLink> getPSWFLinks(){
        return this.pswflinks;
    }

    /**
     * 设置 流程处理连接 成员集合  
     * @param pswflinks
     */
    @JsonProperty(FIELD_PSWFLINKS)
    public void setPSWFLinks(java.util.List<net.ibizsys.psmodel.core.domain.PSWFLink> pswflinks){
        this.pswflinks = pswflinks;
    }

    /**
     * 获取 流程处理连接 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSWFLink> getPSWFLinksIf(){
        if(this.pswflinks == null){
            this.pswflinks = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSWFLink>();          
        }
        return this.pswflinks;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSWFVersion){
            PSWFVersion model = (PSWFVersion)iPSModel;
            model.setPSWFProcesses(this.getPSWFProcesses());
            model.setPSWFLinks(this.getPSWFLinks());
        }
        super.copyTo(iPSModel);
    }
}
