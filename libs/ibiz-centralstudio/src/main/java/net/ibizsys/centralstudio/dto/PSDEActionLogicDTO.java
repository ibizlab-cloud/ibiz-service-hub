package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEACTIONLOGIC</B>实体行为逻辑 模型传输对象
 * <P>
 * 实体行为附加逻辑模型，支持在实体行为上以不同模式附加内部处理逻辑或外部行为。处理逻辑一般作为实体内部逻辑，所以不直接附加外部实体的处理逻辑（行为可以包含逻辑）
 */
public class PSDEActionLogicDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSDEActionLogicDTO(){
    }      

    /**
     * <B>ATTACHMODE</B>&nbsp;附加模式，指定附加到行为的模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DEActionLogicAttachMode} 
     */
    public final static String FIELD_ATTACHMODE = "attachmode";

    /**
     * 设置 附加模式，详细说明：{@link #FIELD_ATTACHMODE}
     * 
     * @param attachMode
     * 
     */
    @JsonProperty(FIELD_ATTACHMODE)
    public void setAttachMode(String attachMode){
        this.set(FIELD_ATTACHMODE, attachMode);
    }
    
    /**
     * 获取 附加模式  
     * @return
     */
    @JsonIgnore
    public String getAttachMode(){
        Object objValue = this.get(FIELD_ATTACHMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 附加模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAttachModeDirty(){
        if(this.contains(FIELD_ATTACHMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 附加模式
     */
    @JsonIgnore
    public void resetAttachMode(){
        this.reset(FIELD_ATTACHMODE);
    }

    /**
     * 设置 附加模式，详细说明：{@link #FIELD_ATTACHMODE}
     * <P>
     * 等同 {@link #setAttachMode}
     * @param attachMode
     */
    @JsonIgnore
    public PSDEActionLogicDTO attachmode(String attachMode){
        this.setAttachMode(attachMode);
        return this;
    }

     /**
     * 设置 附加模式，详细说明：{@link #FIELD_ATTACHMODE}
     * <P>
     * 等同 {@link #setAttachMode}
     * @param attachMode
     */
    @JsonIgnore
    public PSDEActionLogicDTO attachmode(net.ibizsys.model.PSModelEnums.DEActionLogicAttachMode attachMode){
        if(attachMode == null){
            this.setAttachMode(null);
        }
        else{
            this.setAttachMode(attachMode.value);
        }
        return this;
    }

    /**
     * <B>CLONEPARAMFLAG</B>&nbsp;克隆参数传入，指定是否克隆传递给附加逻辑的参数，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_CLONEPARAMFLAG = "cloneparamflag";

    /**
     * 设置 克隆参数传入，详细说明：{@link #FIELD_CLONEPARAMFLAG}
     * 
     * @param cloneParamFlag
     * 
     */
    @JsonProperty(FIELD_CLONEPARAMFLAG)
    public void setCloneParamFlag(Integer cloneParamFlag){
        this.set(FIELD_CLONEPARAMFLAG, cloneParamFlag);
    }
    
    /**
     * 获取 克隆参数传入  
     * @return
     */
    @JsonIgnore
    public Integer getCloneParamFlag(){
        Object objValue = this.get(FIELD_CLONEPARAMFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 克隆参数传入 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCloneParamFlagDirty(){
        if(this.contains(FIELD_CLONEPARAMFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 克隆参数传入
     */
    @JsonIgnore
    public void resetCloneParamFlag(){
        this.reset(FIELD_CLONEPARAMFLAG);
    }

    /**
     * 设置 克隆参数传入，详细说明：{@link #FIELD_CLONEPARAMFLAG}
     * <P>
     * 等同 {@link #setCloneParamFlag}
     * @param cloneParamFlag
     */
    @JsonIgnore
    public PSDEActionLogicDTO cloneparamflag(Integer cloneParamFlag){
        this.setCloneParamFlag(cloneParamFlag);
        return this;
    }

     /**
     * 设置 克隆参数传入，详细说明：{@link #FIELD_CLONEPARAMFLAG}
     * <P>
     * 等同 {@link #setCloneParamFlag}
     * @param cloneParamFlag
     */
    @JsonIgnore
    public PSDEActionLogicDTO cloneparamflag(Boolean cloneParamFlag){
        if(cloneParamFlag == null){
            this.setCloneParamFlag(null);
        }
        else{
            this.setCloneParamFlag(cloneParamFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定行为附加逻辑的代码标识，需要在所附加的实体行为中具有唯一性
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
    public PSDEActionLogicDTO codename(String codeName){
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
    public PSDEActionLogicDTO createdate(Timestamp createDate){
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
    public PSDEActionLogicDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CUSTOMCODE</B>&nbsp;脚本代码，附加逻辑类型为脚本代码时指定触发的脚本代码
     */
    public final static String FIELD_CUSTOMCODE = "customcode";

    /**
     * 设置 脚本代码，详细说明：{@link #FIELD_CUSTOMCODE}
     * 
     * @param customCode
     * 
     */
    @JsonProperty(FIELD_CUSTOMCODE)
    public void setCustomCode(String customCode){
        this.set(FIELD_CUSTOMCODE, customCode);
    }
    
    /**
     * 获取 脚本代码  
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
     * 判断 脚本代码 是否指定值，包括空值
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
     * 重置 脚本代码
     */
    @JsonIgnore
    public void resetCustomCode(){
        this.reset(FIELD_CUSTOMCODE);
    }

    /**
     * 设置 脚本代码，详细说明：{@link #FIELD_CUSTOMCODE}
     * <P>
     * 等同 {@link #setCustomCode}
     * @param customCode
     */
    @JsonIgnore
    public PSDEActionLogicDTO customcode(String customCode){
        this.setCustomCode(customCode);
        return this;
    }

    /**
     * <B>DATASYNCEVENT</B>&nbsp;同步事件
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DataSyncInformType} 
     */
    public final static String FIELD_DATASYNCEVENT = "datasyncevent";

    /**
     * 设置 同步事件
     * 
     * @param dataSyncEvent
     * 
     */
    @JsonProperty(FIELD_DATASYNCEVENT)
    public void setDataSyncEvent(Integer dataSyncEvent){
        this.set(FIELD_DATASYNCEVENT, dataSyncEvent);
    }
    
    /**
     * 获取 同步事件  
     * @return
     */
    @JsonIgnore
    public Integer getDataSyncEvent(){
        Object objValue = this.get(FIELD_DATASYNCEVENT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 同步事件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDataSyncEventDirty(){
        if(this.contains(FIELD_DATASYNCEVENT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 同步事件
     */
    @JsonIgnore
    public void resetDataSyncEvent(){
        this.reset(FIELD_DATASYNCEVENT);
    }

    /**
     * 设置 同步事件
     * <P>
     * 等同 {@link #setDataSyncEvent}
     * @param dataSyncEvent
     */
    @JsonIgnore
    public PSDEActionLogicDTO datasyncevent(Integer dataSyncEvent){
        this.setDataSyncEvent(dataSyncEvent);
        return this;
    }

     /**
     * 设置 同步事件
     * <P>
     * 等同 {@link #setDataSyncEvent}
     * @param dataSyncEvent
     */
    @JsonIgnore
    public PSDEActionLogicDTO datasyncevent(net.ibizsys.model.PSModelEnums.DataSyncInformType dataSyncEvent){
        if(dataSyncEvent == null){
            this.setDataSyncEvent(null);
        }
        else{
            this.setDataSyncEvent(dataSyncEvent.value);
        }
        return this;
    }

    /**
     * <B>DSTPSDEACTIONID</B>&nbsp;目标行为，附加逻辑为外部实体行为时指定的实体行为对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEActionDTO} 
     */
    public final static String FIELD_DSTPSDEACTIONID = "dstpsdeactionid";

    /**
     * 设置 目标行为，详细说明：{@link #FIELD_DSTPSDEACTIONID}
     * 
     * @param dstPSDEActionId
     * 
     */
    @JsonProperty(FIELD_DSTPSDEACTIONID)
    public void setDstPSDEActionId(String dstPSDEActionId){
        this.set(FIELD_DSTPSDEACTIONID, dstPSDEActionId);
    }
    
    /**
     * 获取 目标行为  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEActionId(){
        Object objValue = this.get(FIELD_DSTPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEActionIdDirty(){
        if(this.contains(FIELD_DSTPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标行为
     */
    @JsonIgnore
    public void resetDstPSDEActionId(){
        this.reset(FIELD_DSTPSDEACTIONID);
    }

    /**
     * 设置 目标行为，详细说明：{@link #FIELD_DSTPSDEACTIONID}
     * <P>
     * 等同 {@link #setDstPSDEActionId}
     * @param dstPSDEActionId
     */
    @JsonIgnore
    public PSDEActionLogicDTO dstpsdeactionid(String dstPSDEActionId){
        this.setDstPSDEActionId(dstPSDEActionId);
        return this;
    }

    /**
     * 设置 目标行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDstPSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDEActionLogicDTO dstpsdeactionid(PSDEActionDTO pSDEAction){
        if(pSDEAction == null){
            this.setDstPSDEActionId(null);
            this.setDstPSDEActionName(null);
        }
        else{
            this.setDstPSDEActionId(pSDEAction.getPSDEActionId());
            this.setDstPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>DSTPSDEACTIONNAME</B>&nbsp;目标行为，附加逻辑为外部实体行为时指定的实体行为对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DSTPSDEACTIONID}
     */
    public final static String FIELD_DSTPSDEACTIONNAME = "dstpsdeactionname";

    /**
     * 设置 目标行为，详细说明：{@link #FIELD_DSTPSDEACTIONNAME}
     * 
     * @param dstPSDEActionName
     * 
     */
    @JsonProperty(FIELD_DSTPSDEACTIONNAME)
    public void setDstPSDEActionName(String dstPSDEActionName){
        this.set(FIELD_DSTPSDEACTIONNAME, dstPSDEActionName);
    }
    
    /**
     * 获取 目标行为  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEActionName(){
        Object objValue = this.get(FIELD_DSTPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEActionNameDirty(){
        if(this.contains(FIELD_DSTPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标行为
     */
    @JsonIgnore
    public void resetDstPSDEActionName(){
        this.reset(FIELD_DSTPSDEACTIONNAME);
    }

    /**
     * 设置 目标行为，详细说明：{@link #FIELD_DSTPSDEACTIONNAME}
     * <P>
     * 等同 {@link #setDstPSDEActionName}
     * @param dstPSDEActionName
     */
    @JsonIgnore
    public PSDEActionLogicDTO dstpsdeactionname(String dstPSDEActionName){
        this.setDstPSDEActionName(dstPSDEActionName);
        return this;
    }

    /**
     * <B>DSTPSDEDATAQUERYID</B>&nbsp;目标查询
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEDataQueryDTO} 
     */
    public final static String FIELD_DSTPSDEDATAQUERYID = "dstpsdedataqueryid";

    /**
     * 设置 目标查询
     * 
     * @param dstPSDEDataQueryId
     * 
     */
    @JsonProperty(FIELD_DSTPSDEDATAQUERYID)
    public void setDstPSDEDataQueryId(String dstPSDEDataQueryId){
        this.set(FIELD_DSTPSDEDATAQUERYID, dstPSDEDataQueryId);
    }
    
    /**
     * 获取 目标查询  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEDataQueryId(){
        Object objValue = this.get(FIELD_DSTPSDEDATAQUERYID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标查询 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEDataQueryIdDirty(){
        if(this.contains(FIELD_DSTPSDEDATAQUERYID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标查询
     */
    @JsonIgnore
    public void resetDstPSDEDataQueryId(){
        this.reset(FIELD_DSTPSDEDATAQUERYID);
    }

    /**
     * 设置 目标查询
     * <P>
     * 等同 {@link #setDstPSDEDataQueryId}
     * @param dstPSDEDataQueryId
     */
    @JsonIgnore
    public PSDEActionLogicDTO dstpsdedataqueryid(String dstPSDEDataQueryId){
        this.setDstPSDEDataQueryId(dstPSDEDataQueryId);
        return this;
    }

    /**
     * 设置 目标查询，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDstPSDEDataQueryId}
     * @param pSDEDataQuery 引用对象
     */
    @JsonIgnore
    public PSDEActionLogicDTO dstpsdedataqueryid(PSDEDataQueryDTO pSDEDataQuery){
        if(pSDEDataQuery == null){
            this.setDstPSDEDataQueryId(null);
            this.setDstPSDEDataQueryName(null);
        }
        else{
            this.setDstPSDEDataQueryId(pSDEDataQuery.getPSDEDataQueryId());
            this.setDstPSDEDataQueryName(pSDEDataQuery.getPSDEDataQueryName());
        }
        return this;
    }

    /**
     * <B>DSTPSDEDATAQUERYNAME</B>&nbsp;目标查询
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DSTPSDEDATAQUERYID}
     */
    public final static String FIELD_DSTPSDEDATAQUERYNAME = "dstpsdedataqueryname";

    /**
     * 设置 目标查询
     * 
     * @param dstPSDEDataQueryName
     * 
     */
    @JsonProperty(FIELD_DSTPSDEDATAQUERYNAME)
    public void setDstPSDEDataQueryName(String dstPSDEDataQueryName){
        this.set(FIELD_DSTPSDEDATAQUERYNAME, dstPSDEDataQueryName);
    }
    
    /**
     * 获取 目标查询  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEDataQueryName(){
        Object objValue = this.get(FIELD_DSTPSDEDATAQUERYNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标查询 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEDataQueryNameDirty(){
        if(this.contains(FIELD_DSTPSDEDATAQUERYNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标查询
     */
    @JsonIgnore
    public void resetDstPSDEDataQueryName(){
        this.reset(FIELD_DSTPSDEDATAQUERYNAME);
    }

    /**
     * 设置 目标查询
     * <P>
     * 等同 {@link #setDstPSDEDataQueryName}
     * @param dstPSDEDataQueryName
     */
    @JsonIgnore
    public PSDEActionLogicDTO dstpsdedataqueryname(String dstPSDEDataQueryName){
        this.setDstPSDEDataQueryName(dstPSDEDataQueryName);
        return this;
    }

    /**
     * <B>DSTPSDEDATASETID</B>&nbsp;目标结果集
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO} 
     */
    public final static String FIELD_DSTPSDEDATASETID = "dstpsdedatasetid";

    /**
     * 设置 目标结果集
     * 
     * @param dstPSDEDataSetId
     * 
     */
    @JsonProperty(FIELD_DSTPSDEDATASETID)
    public void setDstPSDEDataSetId(String dstPSDEDataSetId){
        this.set(FIELD_DSTPSDEDATASETID, dstPSDEDataSetId);
    }
    
    /**
     * 获取 目标结果集  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEDataSetId(){
        Object objValue = this.get(FIELD_DSTPSDEDATASETID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标结果集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEDataSetIdDirty(){
        if(this.contains(FIELD_DSTPSDEDATASETID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标结果集
     */
    @JsonIgnore
    public void resetDstPSDEDataSetId(){
        this.reset(FIELD_DSTPSDEDATASETID);
    }

    /**
     * 设置 目标结果集
     * <P>
     * 等同 {@link #setDstPSDEDataSetId}
     * @param dstPSDEDataSetId
     */
    @JsonIgnore
    public PSDEActionLogicDTO dstpsdedatasetid(String dstPSDEDataSetId){
        this.setDstPSDEDataSetId(dstPSDEDataSetId);
        return this;
    }

    /**
     * 设置 目标结果集，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDstPSDEDataSetId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSDEActionLogicDTO dstpsdedatasetid(PSDEDataSetDTO pSDEDataSet){
        if(pSDEDataSet == null){
            this.setDstPSDEDataSetId(null);
            this.setDstPSDEDataSetName(null);
        }
        else{
            this.setDstPSDEDataSetId(pSDEDataSet.getPSDEDataSetId());
            this.setDstPSDEDataSetName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    /**
     * <B>DSTPSDEDATASETNAME</B>&nbsp;目标结果集
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DSTPSDEDATASETID}
     */
    public final static String FIELD_DSTPSDEDATASETNAME = "dstpsdedatasetname";

    /**
     * 设置 目标结果集
     * 
     * @param dstPSDEDataSetName
     * 
     */
    @JsonProperty(FIELD_DSTPSDEDATASETNAME)
    public void setDstPSDEDataSetName(String dstPSDEDataSetName){
        this.set(FIELD_DSTPSDEDATASETNAME, dstPSDEDataSetName);
    }
    
    /**
     * 获取 目标结果集  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEDataSetName(){
        Object objValue = this.get(FIELD_DSTPSDEDATASETNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标结果集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEDataSetNameDirty(){
        if(this.contains(FIELD_DSTPSDEDATASETNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标结果集
     */
    @JsonIgnore
    public void resetDstPSDEDataSetName(){
        this.reset(FIELD_DSTPSDEDATASETNAME);
    }

    /**
     * 设置 目标结果集
     * <P>
     * 等同 {@link #setDstPSDEDataSetName}
     * @param dstPSDEDataSetName
     */
    @JsonIgnore
    public PSDEActionLogicDTO dstpsdedatasetname(String dstPSDEDataSetName){
        this.setDstPSDEDataSetName(dstPSDEDataSetName);
        return this;
    }

    /**
     * <B>DSTPSDEID</B>&nbsp;目标实体，附加逻辑为外部实体行为时指定的实体行为所在实体对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDataEntityDTO} 
     */
    public final static String FIELD_DSTPSDEID = "dstpsdeid";

    /**
     * 设置 目标实体，详细说明：{@link #FIELD_DSTPSDEID}
     * 
     * @param dstPSDEId
     * 
     */
    @JsonProperty(FIELD_DSTPSDEID)
    public void setDstPSDEId(String dstPSDEId){
        this.set(FIELD_DSTPSDEID, dstPSDEId);
    }
    
    /**
     * 获取 目标实体  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEId(){
        Object objValue = this.get(FIELD_DSTPSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEIdDirty(){
        if(this.contains(FIELD_DSTPSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标实体
     */
    @JsonIgnore
    public void resetDstPSDEId(){
        this.reset(FIELD_DSTPSDEID);
    }

    /**
     * 设置 目标实体，详细说明：{@link #FIELD_DSTPSDEID}
     * <P>
     * 等同 {@link #setDstPSDEId}
     * @param dstPSDEId
     */
    @JsonIgnore
    public PSDEActionLogicDTO dstpsdeid(String dstPSDEId){
        this.setDstPSDEId(dstPSDEId);
        return this;
    }

    /**
     * 设置 目标实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDstPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDEActionLogicDTO dstpsdeid(PSDataEntityDTO pSDataEntity){
        if(pSDataEntity == null){
            this.setDstPSDEId(null);
            this.setDstPSDEName(null);
        }
        else{
            this.setDstPSDEId(pSDataEntity.getPSDataEntityId());
            this.setDstPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>DSTPSDENAME</B>&nbsp;目标实体，附加逻辑为外部实体行为时指定的实体行为所在实体对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DSTPSDEID}
     */
    public final static String FIELD_DSTPSDENAME = "dstpsdename";

    /**
     * 设置 目标实体，详细说明：{@link #FIELD_DSTPSDENAME}
     * 
     * @param dstPSDEName
     * 
     */
    @JsonProperty(FIELD_DSTPSDENAME)
    public void setDstPSDEName(String dstPSDEName){
        this.set(FIELD_DSTPSDENAME, dstPSDEName);
    }
    
    /**
     * 获取 目标实体  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEName(){
        Object objValue = this.get(FIELD_DSTPSDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDENameDirty(){
        if(this.contains(FIELD_DSTPSDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标实体
     */
    @JsonIgnore
    public void resetDstPSDEName(){
        this.reset(FIELD_DSTPSDENAME);
    }

    /**
     * 设置 目标实体，详细说明：{@link #FIELD_DSTPSDENAME}
     * <P>
     * 等同 {@link #setDstPSDEName}
     * @param dstPSDEName
     */
    @JsonIgnore
    public PSDEActionLogicDTO dstpsdename(String dstPSDEName){
        this.setDstPSDEName(dstPSDEName);
        return this;
    }

    /**
     * <B>ERRORCODE</B>&nbsp;错误代码
     */
    public final static String FIELD_ERRORCODE = "errorcode";

    /**
     * 设置 错误代码
     * 
     * @param errorCode
     * 
     */
    @JsonProperty(FIELD_ERRORCODE)
    public void setErrorCode(Integer errorCode){
        this.set(FIELD_ERRORCODE, errorCode);
    }
    
    /**
     * 获取 错误代码  
     * @return
     */
    @JsonIgnore
    public Integer getErrorCode(){
        Object objValue = this.get(FIELD_ERRORCODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 错误代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isErrorCodeDirty(){
        if(this.contains(FIELD_ERRORCODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 错误代码
     */
    @JsonIgnore
    public void resetErrorCode(){
        this.reset(FIELD_ERRORCODE);
    }

    /**
     * 设置 错误代码
     * <P>
     * 等同 {@link #setErrorCode}
     * @param errorCode
     */
    @JsonIgnore
    public PSDEActionLogicDTO errorcode(Integer errorCode){
        this.setErrorCode(errorCode);
        return this;
    }

    /**
     * <B>ERRORMSG</B>&nbsp;错误消息
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_ERRORMSG = "errormsg";

    /**
     * 设置 错误消息
     * 
     * @param errorMsg
     * 
     */
    @JsonProperty(FIELD_ERRORMSG)
    public void setErrorMsg(String errorMsg){
        this.set(FIELD_ERRORMSG, errorMsg);
    }
    
    /**
     * 获取 错误消息  
     * @return
     */
    @JsonIgnore
    public String getErrorMsg(){
        Object objValue = this.get(FIELD_ERRORMSG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 错误消息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isErrorMsgDirty(){
        if(this.contains(FIELD_ERRORMSG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 错误消息
     */
    @JsonIgnore
    public void resetErrorMsg(){
        this.reset(FIELD_ERRORMSG);
    }

    /**
     * 设置 错误消息
     * <P>
     * 等同 {@link #setErrorMsg}
     * @param errorMsg
     */
    @JsonIgnore
    public PSDEActionLogicDTO errormsg(String errorMsg){
        this.setErrorMsg(errorMsg);
        return this;
    }

    /**
     * <B>ERRORPSLANRESID</B>&nbsp;错误消息语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSLanguageResDTO} 
     */
    public final static String FIELD_ERRORPSLANRESID = "errorpslanresid";

    /**
     * 设置 错误消息语言资源
     * 
     * @param errorPSLanResId
     * 
     */
    @JsonProperty(FIELD_ERRORPSLANRESID)
    public void setErrorPSLanResId(String errorPSLanResId){
        this.set(FIELD_ERRORPSLANRESID, errorPSLanResId);
    }
    
    /**
     * 获取 错误消息语言资源  
     * @return
     */
    @JsonIgnore
    public String getErrorPSLanResId(){
        Object objValue = this.get(FIELD_ERRORPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 错误消息语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isErrorPSLanResIdDirty(){
        if(this.contains(FIELD_ERRORPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 错误消息语言资源
     */
    @JsonIgnore
    public void resetErrorPSLanResId(){
        this.reset(FIELD_ERRORPSLANRESID);
    }

    /**
     * 设置 错误消息语言资源
     * <P>
     * 等同 {@link #setErrorPSLanResId}
     * @param errorPSLanResId
     */
    @JsonIgnore
    public PSDEActionLogicDTO errorpslanresid(String errorPSLanResId){
        this.setErrorPSLanResId(errorPSLanResId);
        return this;
    }

    /**
     * 设置 错误消息语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setErrorPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSDEActionLogicDTO errorpslanresid(PSLanguageResDTO pSLanguageRes){
        if(pSLanguageRes == null){
            this.setErrorPSLanResId(null);
            this.setErrorPSLanResName(null);
        }
        else{
            this.setErrorPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setErrorPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>ERRORPSLANRESNAME</B>&nbsp;错误消息语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ERRORPSLANRESID}
     */
    public final static String FIELD_ERRORPSLANRESNAME = "errorpslanresname";

    /**
     * 设置 错误消息语言资源
     * 
     * @param errorPSLanResName
     * 
     */
    @JsonProperty(FIELD_ERRORPSLANRESNAME)
    public void setErrorPSLanResName(String errorPSLanResName){
        this.set(FIELD_ERRORPSLANRESNAME, errorPSLanResName);
    }
    
    /**
     * 获取 错误消息语言资源  
     * @return
     */
    @JsonIgnore
    public String getErrorPSLanResName(){
        Object objValue = this.get(FIELD_ERRORPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 错误消息语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isErrorPSLanResNameDirty(){
        if(this.contains(FIELD_ERRORPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 错误消息语言资源
     */
    @JsonIgnore
    public void resetErrorPSLanResName(){
        this.reset(FIELD_ERRORPSLANRESNAME);
    }

    /**
     * 设置 错误消息语言资源
     * <P>
     * 等同 {@link #setErrorPSLanResName}
     * @param errorPSLanResName
     */
    @JsonIgnore
    public PSDEActionLogicDTO errorpslanresname(String errorPSLanResName){
        this.setErrorPSLanResName(errorPSLanResName);
        return this;
    }

    /**
     * <B>EXCEPTIONOBJ</B>&nbsp;异常对象
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_EXCEPTIONOBJ = "exceptionobj";

    /**
     * 设置 异常对象
     * 
     * @param exceptionObj
     * 
     */
    @JsonProperty(FIELD_EXCEPTIONOBJ)
    public void setExceptionObj(String exceptionObj){
        this.set(FIELD_EXCEPTIONOBJ, exceptionObj);
    }
    
    /**
     * 获取 异常对象  
     * @return
     */
    @JsonIgnore
    public String getExceptionObj(){
        Object objValue = this.get(FIELD_EXCEPTIONOBJ);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 异常对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExceptionObjDirty(){
        if(this.contains(FIELD_EXCEPTIONOBJ)){
            return true;
        }
        return false;
    }

    /**
     * 重置 异常对象
     */
    @JsonIgnore
    public void resetExceptionObj(){
        this.reset(FIELD_EXCEPTIONOBJ);
    }

    /**
     * 设置 异常对象
     * <P>
     * 等同 {@link #setExceptionObj}
     * @param exceptionObj
     */
    @JsonIgnore
    public PSDEActionLogicDTO exceptionobj(String exceptionObj){
        this.setExceptionObj(exceptionObj);
        return this;
    }

    /**
     * <B>IGNOREEXCEPTION</B>&nbsp;忽略异常，指定是否忽略调用附加逻辑时发生的异常，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_IGNOREEXCEPTION = "ignoreexception";

    /**
     * 设置 忽略异常，详细说明：{@link #FIELD_IGNOREEXCEPTION}
     * 
     * @param ignoreException
     * 
     */
    @JsonProperty(FIELD_IGNOREEXCEPTION)
    public void setIgnoreException(Integer ignoreException){
        this.set(FIELD_IGNOREEXCEPTION, ignoreException);
    }
    
    /**
     * 获取 忽略异常  
     * @return
     */
    @JsonIgnore
    public Integer getIgnoreException(){
        Object objValue = this.get(FIELD_IGNOREEXCEPTION);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 忽略异常 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIgnoreExceptionDirty(){
        if(this.contains(FIELD_IGNOREEXCEPTION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 忽略异常
     */
    @JsonIgnore
    public void resetIgnoreException(){
        this.reset(FIELD_IGNOREEXCEPTION);
    }

    /**
     * 设置 忽略异常，详细说明：{@link #FIELD_IGNOREEXCEPTION}
     * <P>
     * 等同 {@link #setIgnoreException}
     * @param ignoreException
     */
    @JsonIgnore
    public PSDEActionLogicDTO ignoreexception(Integer ignoreException){
        this.setIgnoreException(ignoreException);
        return this;
    }

     /**
     * 设置 忽略异常，详细说明：{@link #FIELD_IGNOREEXCEPTION}
     * <P>
     * 等同 {@link #setIgnoreException}
     * @param ignoreException
     */
    @JsonIgnore
    public PSDEActionLogicDTO ignoreexception(Boolean ignoreException){
        if(ignoreException == null){
            this.setIgnoreException(null);
        }
        else{
            this.setIgnoreException(ignoreException?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>INTERNALLOGIC</B>&nbsp;逻辑类型，指定附加到当前行为的逻辑类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DEActionLogicType} 
     */
    public final static String FIELD_INTERNALLOGIC = "internallogic";

    /**
     * 设置 逻辑类型，详细说明：{@link #FIELD_INTERNALLOGIC}
     * 
     * @param internalLogic
     * 
     */
    @JsonProperty(FIELD_INTERNALLOGIC)
    public void setInternalLogic(Integer internalLogic){
        this.set(FIELD_INTERNALLOGIC, internalLogic);
    }
    
    /**
     * 获取 逻辑类型  
     * @return
     */
    @JsonIgnore
    public Integer getInternalLogic(){
        Object objValue = this.get(FIELD_INTERNALLOGIC);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 逻辑类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isInternalLogicDirty(){
        if(this.contains(FIELD_INTERNALLOGIC)){
            return true;
        }
        return false;
    }

    /**
     * 重置 逻辑类型
     */
    @JsonIgnore
    public void resetInternalLogic(){
        this.reset(FIELD_INTERNALLOGIC);
    }

    /**
     * 设置 逻辑类型，详细说明：{@link #FIELD_INTERNALLOGIC}
     * <P>
     * 等同 {@link #setInternalLogic}
     * @param internalLogic
     */
    @JsonIgnore
    public PSDEActionLogicDTO internallogic(Integer internalLogic){
        this.setInternalLogic(internalLogic);
        return this;
    }

     /**
     * 设置 逻辑类型，详细说明：{@link #FIELD_INTERNALLOGIC}
     * <P>
     * 等同 {@link #setInternalLogic}
     * @param internalLogic
     */
    @JsonIgnore
    public PSDEActionLogicDTO internallogic(net.ibizsys.model.PSModelEnums.DEActionLogicType internalLogic){
        if(internalLogic == null){
            this.setInternalLogic(null);
        }
        else{
            this.setInternalLogic(internalLogic.value);
        }
        return this;
    }

    /**
     * <B>LOGICHOLDER</B>&nbsp;逻辑所有者，指定附加逻辑功能的持有者，未指定时由附加的行为或逻辑决定（如存在），默认为【后台】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DELogicHolder} 
     */
    public final static String FIELD_LOGICHOLDER = "logicholder";

    /**
     * 设置 逻辑所有者，详细说明：{@link #FIELD_LOGICHOLDER}
     * 
     * @param logicHolder
     * 
     */
    @JsonProperty(FIELD_LOGICHOLDER)
    public void setLogicHolder(Integer logicHolder){
        this.set(FIELD_LOGICHOLDER, logicHolder);
    }
    
    /**
     * 获取 逻辑所有者  
     * @return
     */
    @JsonIgnore
    public Integer getLogicHolder(){
        Object objValue = this.get(FIELD_LOGICHOLDER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 逻辑所有者 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLogicHolderDirty(){
        if(this.contains(FIELD_LOGICHOLDER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 逻辑所有者
     */
    @JsonIgnore
    public void resetLogicHolder(){
        this.reset(FIELD_LOGICHOLDER);
    }

    /**
     * 设置 逻辑所有者，详细说明：{@link #FIELD_LOGICHOLDER}
     * <P>
     * 等同 {@link #setLogicHolder}
     * @param logicHolder
     */
    @JsonIgnore
    public PSDEActionLogicDTO logicholder(Integer logicHolder){
        this.setLogicHolder(logicHolder);
        return this;
    }

     /**
     * 设置 逻辑所有者，详细说明：{@link #FIELD_LOGICHOLDER}
     * <P>
     * 等同 {@link #setLogicHolder}
     * @param logicHolder
     */
    @JsonIgnore
    public PSDEActionLogicDTO logicholder(net.ibizsys.model.PSModelEnums.DELogicHolder logicHolder){
        if(logicHolder == null){
            this.setLogicHolder(null);
        }
        else{
            this.setLogicHolder(logicHolder.value);
        }
        return this;
    }

    /**
     * <B>MAJORPSDERID</B>&nbsp;主关系
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDERDTO} 
     */
    public final static String FIELD_MAJORPSDERID = "majorpsderid";

    /**
     * 设置 主关系
     * 
     * @param majorPSDERId
     * 
     */
    @JsonProperty(FIELD_MAJORPSDERID)
    public void setMajorPSDERId(String majorPSDERId){
        this.set(FIELD_MAJORPSDERID, majorPSDERId);
    }
    
    /**
     * 获取 主关系  
     * @return
     */
    @JsonIgnore
    public String getMajorPSDERId(){
        Object objValue = this.get(FIELD_MAJORPSDERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMajorPSDERIdDirty(){
        if(this.contains(FIELD_MAJORPSDERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主关系
     */
    @JsonIgnore
    public void resetMajorPSDERId(){
        this.reset(FIELD_MAJORPSDERID);
    }

    /**
     * 设置 主关系
     * <P>
     * 等同 {@link #setMajorPSDERId}
     * @param majorPSDERId
     */
    @JsonIgnore
    public PSDEActionLogicDTO majorpsderid(String majorPSDERId){
        this.setMajorPSDERId(majorPSDERId);
        return this;
    }

    /**
     * 设置 主关系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMajorPSDERId}
     * @param pSDER 引用对象
     */
    @JsonIgnore
    public PSDEActionLogicDTO majorpsderid(PSDERDTO pSDER){
        if(pSDER == null){
            this.setMajorPSDERId(null);
            this.setMajorPSDERName(null);
        }
        else{
            this.setMajorPSDERId(pSDER.getPSDERId());
            this.setMajorPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    /**
     * <B>MAJORPSDERNAME</B>&nbsp;主关系
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MAJORPSDERID}
     */
    public final static String FIELD_MAJORPSDERNAME = "majorpsdername";

    /**
     * 设置 主关系
     * 
     * @param majorPSDERName
     * 
     */
    @JsonProperty(FIELD_MAJORPSDERNAME)
    public void setMajorPSDERName(String majorPSDERName){
        this.set(FIELD_MAJORPSDERNAME, majorPSDERName);
    }
    
    /**
     * 获取 主关系  
     * @return
     */
    @JsonIgnore
    public String getMajorPSDERName(){
        Object objValue = this.get(FIELD_MAJORPSDERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMajorPSDERNameDirty(){
        if(this.contains(FIELD_MAJORPSDERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主关系
     */
    @JsonIgnore
    public void resetMajorPSDERName(){
        this.reset(FIELD_MAJORPSDERNAME);
    }

    /**
     * 设置 主关系
     * <P>
     * 等同 {@link #setMajorPSDERName}
     * @param majorPSDERName
     */
    @JsonIgnore
    public PSDEActionLogicDTO majorpsdername(String majorPSDERName){
        this.setMajorPSDERName(majorPSDERName);
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
    public PSDEActionLogicDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MINORPSDERID</B>&nbsp;从关系
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDERDTO} 
     */
    public final static String FIELD_MINORPSDERID = "minorpsderid";

    /**
     * 设置 从关系
     * 
     * @param minorPSDERId
     * 
     */
    @JsonProperty(FIELD_MINORPSDERID)
    public void setMinorPSDERId(String minorPSDERId){
        this.set(FIELD_MINORPSDERID, minorPSDERId);
    }
    
    /**
     * 获取 从关系  
     * @return
     */
    @JsonIgnore
    public String getMinorPSDERId(){
        Object objValue = this.get(FIELD_MINORPSDERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 从关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinorPSDERIdDirty(){
        if(this.contains(FIELD_MINORPSDERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 从关系
     */
    @JsonIgnore
    public void resetMinorPSDERId(){
        this.reset(FIELD_MINORPSDERID);
    }

    /**
     * 设置 从关系
     * <P>
     * 等同 {@link #setMinorPSDERId}
     * @param minorPSDERId
     */
    @JsonIgnore
    public PSDEActionLogicDTO minorpsderid(String minorPSDERId){
        this.setMinorPSDERId(minorPSDERId);
        return this;
    }

    /**
     * 设置 从关系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMinorPSDERId}
     * @param pSDER 引用对象
     */
    @JsonIgnore
    public PSDEActionLogicDTO minorpsderid(PSDERDTO pSDER){
        if(pSDER == null){
            this.setMinorPSDERId(null);
            this.setMinorPSDERName(null);
        }
        else{
            this.setMinorPSDERId(pSDER.getPSDERId());
            this.setMinorPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    /**
     * <B>MINORPSDERNAME</B>&nbsp;从关系
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MINORPSDERID}
     */
    public final static String FIELD_MINORPSDERNAME = "minorpsdername";

    /**
     * 设置 从关系
     * 
     * @param minorPSDERName
     * 
     */
    @JsonProperty(FIELD_MINORPSDERNAME)
    public void setMinorPSDERName(String minorPSDERName){
        this.set(FIELD_MINORPSDERNAME, minorPSDERName);
    }
    
    /**
     * 获取 从关系  
     * @return
     */
    @JsonIgnore
    public String getMinorPSDERName(){
        Object objValue = this.get(FIELD_MINORPSDERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 从关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinorPSDERNameDirty(){
        if(this.contains(FIELD_MINORPSDERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 从关系
     */
    @JsonIgnore
    public void resetMinorPSDERName(){
        this.reset(FIELD_MINORPSDERNAME);
    }

    /**
     * 设置 从关系
     * <P>
     * 等同 {@link #setMinorPSDERName}
     * @param minorPSDERName
     */
    @JsonIgnore
    public PSDEActionLogicDTO minorpsdername(String minorPSDERName){
        this.setMinorPSDERName(minorPSDERName);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;附加次序，指定逻辑的附加次序
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 附加次序，详细说明：{@link #FIELD_ORDERVALUE}
     * 
     * @param orderValue
     * 
     */
    @JsonProperty(FIELD_ORDERVALUE)
    public void setOrderValue(Integer orderValue){
        this.set(FIELD_ORDERVALUE, orderValue);
    }
    
    /**
     * 获取 附加次序  
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
     * 判断 附加次序 是否指定值，包括空值
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
     * 重置 附加次序
     */
    @JsonIgnore
    public void resetOrderValue(){
        this.reset(FIELD_ORDERVALUE);
    }

    /**
     * 设置 附加次序，详细说明：{@link #FIELD_ORDERVALUE}
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSDEActionLogicDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PREPARELAST</B>&nbsp;需要准备最后数据，指定行为附加逻辑是否需要行为准备操作之前的数据，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_PREPARELAST = "preparelast";

    /**
     * 设置 需要准备最后数据，详细说明：{@link #FIELD_PREPARELAST}
     * 
     * @param prepareLast
     * 
     */
    @JsonProperty(FIELD_PREPARELAST)
    public void setPrepareLast(Integer prepareLast){
        this.set(FIELD_PREPARELAST, prepareLast);
    }
    
    /**
     * 获取 需要准备最后数据  
     * @return
     */
    @JsonIgnore
    public Integer getPrepareLast(){
        Object objValue = this.get(FIELD_PREPARELAST);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 需要准备最后数据 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPrepareLastDirty(){
        if(this.contains(FIELD_PREPARELAST)){
            return true;
        }
        return false;
    }

    /**
     * 重置 需要准备最后数据
     */
    @JsonIgnore
    public void resetPrepareLast(){
        this.reset(FIELD_PREPARELAST);
    }

    /**
     * 设置 需要准备最后数据，详细说明：{@link #FIELD_PREPARELAST}
     * <P>
     * 等同 {@link #setPrepareLast}
     * @param prepareLast
     */
    @JsonIgnore
    public PSDEActionLogicDTO preparelast(Integer prepareLast){
        this.setPrepareLast(prepareLast);
        return this;
    }

     /**
     * 设置 需要准备最后数据，详细说明：{@link #FIELD_PREPARELAST}
     * <P>
     * 等同 {@link #setPrepareLast}
     * @param prepareLast
     */
    @JsonIgnore
    public PSDEActionLogicDTO preparelast(Boolean prepareLast){
        if(prepareLast == null){
            this.setPrepareLast(null);
        }
        else{
            this.setPrepareLast(prepareLast?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>PROPERTYMAP</B>&nbsp;参数映射
     */
    public final static String FIELD_PROPERTYMAP = "propertymap";

    /**
     * 设置 参数映射
     * 
     * @param propertyMap
     * 
     */
    @JsonProperty(FIELD_PROPERTYMAP)
    public void setPropertyMap(String propertyMap){
        this.set(FIELD_PROPERTYMAP, propertyMap);
    }
    
    /**
     * 获取 参数映射  
     * @return
     */
    @JsonIgnore
    public String getPropertyMap(){
        Object objValue = this.get(FIELD_PROPERTYMAP);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数映射 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPropertyMapDirty(){
        if(this.contains(FIELD_PROPERTYMAP)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数映射
     */
    @JsonIgnore
    public void resetPropertyMap(){
        this.reset(FIELD_PROPERTYMAP);
    }

    /**
     * 设置 参数映射
     * <P>
     * 等同 {@link #setPropertyMap}
     * @param propertyMap
     */
    @JsonIgnore
    public PSDEActionLogicDTO propertymap(String propertyMap){
        this.setPropertyMap(propertyMap);
        return this;
    }

    /**
     * <B>PSDEACTIONID</B>&nbsp;实体行为，指定宿主实体行为对象
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
    public PSDEActionLogicDTO psdeactionid(String pSDEActionId){
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
    public PSDEActionLogicDTO psdeactionid(PSDEActionDTO pSDEAction){
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
     * <B>PSDEACTIONLOGICID</B>&nbsp;实体行为逻辑标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEACTIONLOGICID = "psdeactionlogicid";

    /**
     * 设置 实体行为逻辑标识
     * 
     * @param pSDEActionLogicId
     * 
     */
    @JsonProperty(FIELD_PSDEACTIONLOGICID)
    public void setPSDEActionLogicId(String pSDEActionLogicId){
        this.set(FIELD_PSDEACTIONLOGICID, pSDEActionLogicId);
    }
    
    /**
     * 获取 实体行为逻辑标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEActionLogicId(){
        Object objValue = this.get(FIELD_PSDEACTIONLOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体行为逻辑标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEActionLogicIdDirty(){
        if(this.contains(FIELD_PSDEACTIONLOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体行为逻辑标识
     */
    @JsonIgnore
    public void resetPSDEActionLogicId(){
        this.reset(FIELD_PSDEACTIONLOGICID);
    }

    /**
     * 设置 实体行为逻辑标识
     * <P>
     * 等同 {@link #setPSDEActionLogicId}
     * @param pSDEActionLogicId
     */
    @JsonIgnore
    public PSDEActionLogicDTO psdeactionlogicid(String pSDEActionLogicId){
        this.setPSDEActionLogicId(pSDEActionLogicId);
        return this;
    }

    /**
     * <B>PSDEACTIONLOGICNAME</B>&nbsp;逻辑名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEACTIONLOGICNAME = "psdeactionlogicname";

    /**
     * 设置 逻辑名称
     * 
     * @param pSDEActionLogicName
     * 
     */
    @JsonProperty(FIELD_PSDEACTIONLOGICNAME)
    public void setPSDEActionLogicName(String pSDEActionLogicName){
        this.set(FIELD_PSDEACTIONLOGICNAME, pSDEActionLogicName);
    }
    
    /**
     * 获取 逻辑名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEActionLogicName(){
        Object objValue = this.get(FIELD_PSDEACTIONLOGICNAME);
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
    public boolean isPSDEActionLogicNameDirty(){
        if(this.contains(FIELD_PSDEACTIONLOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 逻辑名称
     */
    @JsonIgnore
    public void resetPSDEActionLogicName(){
        this.reset(FIELD_PSDEACTIONLOGICNAME);
    }

    /**
     * 设置 逻辑名称
     * <P>
     * 等同 {@link #setPSDEActionLogicName}
     * @param pSDEActionLogicName
     */
    @JsonIgnore
    public PSDEActionLogicDTO psdeactionlogicname(String pSDEActionLogicName){
        this.setPSDEActionLogicName(pSDEActionLogicName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEActionLogicName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEActionLogicName(strName);
    }

    @JsonIgnore
    public PSDEActionLogicDTO name(String strName){
        this.setPSDEActionLogicName(strName);
        return this;
    }

    /**
     * <B>PSDEACTIONNAME</B>&nbsp;实体行为，指定宿主实体行为对象
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
    public PSDEActionLogicDTO psdeactionname(String pSDEActionName){
        this.setPSDEActionName(pSDEActionName);
        return this;
    }

    /**
     * <B>PSDEDATASYNCID</B>&nbsp;实体数据同步
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEDataSyncDTO} 
     */
    public final static String FIELD_PSDEDATASYNCID = "psdedatasyncid";

    /**
     * 设置 实体数据同步
     * 
     * @param pSDEDataSyncId
     * 
     */
    @JsonProperty(FIELD_PSDEDATASYNCID)
    public void setPSDEDataSyncId(String pSDEDataSyncId){
        this.set(FIELD_PSDEDATASYNCID, pSDEDataSyncId);
    }
    
    /**
     * 获取 实体数据同步  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataSyncId(){
        Object objValue = this.get(FIELD_PSDEDATASYNCID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据同步 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataSyncIdDirty(){
        if(this.contains(FIELD_PSDEDATASYNCID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据同步
     */
    @JsonIgnore
    public void resetPSDEDataSyncId(){
        this.reset(FIELD_PSDEDATASYNCID);
    }

    /**
     * 设置 实体数据同步
     * <P>
     * 等同 {@link #setPSDEDataSyncId}
     * @param pSDEDataSyncId
     */
    @JsonIgnore
    public PSDEActionLogicDTO psdedatasyncid(String pSDEDataSyncId){
        this.setPSDEDataSyncId(pSDEDataSyncId);
        return this;
    }

    /**
     * 设置 实体数据同步，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDataSyncId}
     * @param pSDEDataSync 引用对象
     */
    @JsonIgnore
    public PSDEActionLogicDTO psdedatasyncid(PSDEDataSyncDTO pSDEDataSync){
        if(pSDEDataSync == null){
            this.setPSDEDataSyncId(null);
            this.setPSDEDataSyncName(null);
        }
        else{
            this.setPSDEDataSyncId(pSDEDataSync.getPSDEDataSyncId());
            this.setPSDEDataSyncName(pSDEDataSync.getPSDEDataSyncName());
        }
        return this;
    }

    /**
     * <B>PSDEDATASYNCNAME</B>&nbsp;实体数据同步
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDATASYNCID}
     */
    public final static String FIELD_PSDEDATASYNCNAME = "psdedatasyncname";

    /**
     * 设置 实体数据同步
     * 
     * @param pSDEDataSyncName
     * 
     */
    @JsonProperty(FIELD_PSDEDATASYNCNAME)
    public void setPSDEDataSyncName(String pSDEDataSyncName){
        this.set(FIELD_PSDEDATASYNCNAME, pSDEDataSyncName);
    }
    
    /**
     * 获取 实体数据同步  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataSyncName(){
        Object objValue = this.get(FIELD_PSDEDATASYNCNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据同步 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataSyncNameDirty(){
        if(this.contains(FIELD_PSDEDATASYNCNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据同步
     */
    @JsonIgnore
    public void resetPSDEDataSyncName(){
        this.reset(FIELD_PSDEDATASYNCNAME);
    }

    /**
     * 设置 实体数据同步
     * <P>
     * 等同 {@link #setPSDEDataSyncName}
     * @param pSDEDataSyncName
     */
    @JsonIgnore
    public PSDEActionLogicDTO psdedatasyncname(String pSDEDataSyncName){
        this.setPSDEDataSyncName(pSDEDataSyncName);
        return this;
    }

    /**
     * <B>PSDEFID</B>&nbsp;实体属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_PSDEFID = "psdefid";

    /**
     * 设置 实体属性
     * 
     * @param pSDEFId
     * 
     */
    @JsonProperty(FIELD_PSDEFID)
    public void setPSDEFId(String pSDEFId){
        this.set(FIELD_PSDEFID, pSDEFId);
    }
    
    /**
     * 获取 实体属性  
     * @return
     */
    @JsonIgnore
    public String getPSDEFId(){
        Object objValue = this.get(FIELD_PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFIdDirty(){
        if(this.contains(FIELD_PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体属性
     */
    @JsonIgnore
    public void resetPSDEFId(){
        this.reset(FIELD_PSDEFID);
    }

    /**
     * 设置 实体属性
     * <P>
     * 等同 {@link #setPSDEFId}
     * @param pSDEFId
     */
    @JsonIgnore
    public PSDEActionLogicDTO psdefid(String pSDEFId){
        this.setPSDEFId(pSDEFId);
        return this;
    }

    /**
     * 设置 实体属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDEActionLogicDTO psdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setPSDEFId(null);
            this.setPSDEFName(null);
        }
        else{
            this.setPSDEFId(pSDEField.getPSDEFieldId());
            this.setPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>PSDEFNAME</B>&nbsp;实体属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFID}
     */
    public final static String FIELD_PSDEFNAME = "psdefname";

    /**
     * 设置 实体属性
     * 
     * @param pSDEFName
     * 
     */
    @JsonProperty(FIELD_PSDEFNAME)
    public void setPSDEFName(String pSDEFName){
        this.set(FIELD_PSDEFNAME, pSDEFName);
    }
    
    /**
     * 获取 实体属性  
     * @return
     */
    @JsonIgnore
    public String getPSDEFName(){
        Object objValue = this.get(FIELD_PSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFNameDirty(){
        if(this.contains(FIELD_PSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体属性
     */
    @JsonIgnore
    public void resetPSDEFName(){
        this.reset(FIELD_PSDEFNAME);
    }

    /**
     * 设置 实体属性
     * <P>
     * 等同 {@link #setPSDEFName}
     * @param pSDEFName
     */
    @JsonIgnore
    public PSDEActionLogicDTO psdefname(String pSDEFName){
        this.setPSDEFName(pSDEFName);
        return this;
    }

    /**
     * <B>PSDEFVALUERULEID</B>&nbsp;属性值规则
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFValueRuleDTO} 
     */
    public final static String FIELD_PSDEFVALUERULEID = "psdefvalueruleid";

    /**
     * 设置 属性值规则
     * 
     * @param pSDEFValueRuleId
     * 
     */
    @JsonProperty(FIELD_PSDEFVALUERULEID)
    public void setPSDEFValueRuleId(String pSDEFValueRuleId){
        this.set(FIELD_PSDEFVALUERULEID, pSDEFValueRuleId);
    }
    
    /**
     * 获取 属性值规则  
     * @return
     */
    @JsonIgnore
    public String getPSDEFValueRuleId(){
        Object objValue = this.get(FIELD_PSDEFVALUERULEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性值规则 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFValueRuleIdDirty(){
        if(this.contains(FIELD_PSDEFVALUERULEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性值规则
     */
    @JsonIgnore
    public void resetPSDEFValueRuleId(){
        this.reset(FIELD_PSDEFVALUERULEID);
    }

    /**
     * 设置 属性值规则
     * <P>
     * 等同 {@link #setPSDEFValueRuleId}
     * @param pSDEFValueRuleId
     */
    @JsonIgnore
    public PSDEActionLogicDTO psdefvalueruleid(String pSDEFValueRuleId){
        this.setPSDEFValueRuleId(pSDEFValueRuleId);
        return this;
    }

    /**
     * 设置 属性值规则，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEFValueRuleId}
     * @param pSDEFValueRule 引用对象
     */
    @JsonIgnore
    public PSDEActionLogicDTO psdefvalueruleid(PSDEFValueRuleDTO pSDEFValueRule){
        if(pSDEFValueRule == null){
            this.setPSDEFValueRuleId(null);
            this.setPSDEFValueRuleName(null);
        }
        else{
            this.setPSDEFValueRuleId(pSDEFValueRule.getPSDEFValueRuleId());
            this.setPSDEFValueRuleName(pSDEFValueRule.getPSDEFValueRuleName());
        }
        return this;
    }

    /**
     * <B>PSDEFVALUERULENAME</B>&nbsp;属性值规则
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFVALUERULEID}
     */
    public final static String FIELD_PSDEFVALUERULENAME = "psdefvaluerulename";

    /**
     * 设置 属性值规则
     * 
     * @param pSDEFValueRuleName
     * 
     */
    @JsonProperty(FIELD_PSDEFVALUERULENAME)
    public void setPSDEFValueRuleName(String pSDEFValueRuleName){
        this.set(FIELD_PSDEFVALUERULENAME, pSDEFValueRuleName);
    }
    
    /**
     * 获取 属性值规则  
     * @return
     */
    @JsonIgnore
    public String getPSDEFValueRuleName(){
        Object objValue = this.get(FIELD_PSDEFVALUERULENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性值规则 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFValueRuleNameDirty(){
        if(this.contains(FIELD_PSDEFVALUERULENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性值规则
     */
    @JsonIgnore
    public void resetPSDEFValueRuleName(){
        this.reset(FIELD_PSDEFVALUERULENAME);
    }

    /**
     * 设置 属性值规则
     * <P>
     * 等同 {@link #setPSDEFValueRuleName}
     * @param pSDEFValueRuleName
     */
    @JsonIgnore
    public PSDEActionLogicDTO psdefvaluerulename(String pSDEFValueRuleName){
        this.setPSDEFValueRuleName(pSDEFValueRuleName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定宿主行为对象所在的实体
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
    public PSDEActionLogicDTO psdeid(String pSDEId){
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
    public PSDEActionLogicDTO psdeid(PSDataEntityDTO pSDataEntity){
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
     * <B>PSDELOGICID</B>&nbsp;实体逻辑，附加逻辑为内部处理逻辑时指定的当前实体处理逻辑对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDELogicDTO} 
     */
    public final static String FIELD_PSDELOGICID = "psdelogicid";

    /**
     * 设置 实体逻辑，详细说明：{@link #FIELD_PSDELOGICID}
     * 
     * @param pSDELogicId
     * 
     */
    @JsonProperty(FIELD_PSDELOGICID)
    public void setPSDELogicId(String pSDELogicId){
        this.set(FIELD_PSDELOGICID, pSDELogicId);
    }
    
    /**
     * 获取 实体逻辑  
     * @return
     */
    @JsonIgnore
    public String getPSDELogicId(){
        Object objValue = this.get(FIELD_PSDELOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDELogicIdDirty(){
        if(this.contains(FIELD_PSDELOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体逻辑
     */
    @JsonIgnore
    public void resetPSDELogicId(){
        this.reset(FIELD_PSDELOGICID);
    }

    /**
     * 设置 实体逻辑，详细说明：{@link #FIELD_PSDELOGICID}
     * <P>
     * 等同 {@link #setPSDELogicId}
     * @param pSDELogicId
     */
    @JsonIgnore
    public PSDEActionLogicDTO psdelogicid(String pSDELogicId){
        this.setPSDELogicId(pSDELogicId);
        return this;
    }

    /**
     * 设置 实体逻辑，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDELogicId}
     * @param pSDELogic 引用对象
     */
    @JsonIgnore
    public PSDEActionLogicDTO psdelogicid(PSDELogicDTO pSDELogic){
        if(pSDELogic == null){
            this.setPSDELogicId(null);
            this.setPSDELogicName(null);
        }
        else{
            this.setPSDELogicId(pSDELogic.getPSDELogicId());
            this.setPSDELogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    /**
     * <B>PSDELOGICNAME</B>&nbsp;实体逻辑，附加逻辑为内部处理逻辑时指定的当前实体处理逻辑对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDELOGICID}
     */
    public final static String FIELD_PSDELOGICNAME = "psdelogicname";

    /**
     * 设置 实体逻辑，详细说明：{@link #FIELD_PSDELOGICNAME}
     * 
     * @param pSDELogicName
     * 
     */
    @JsonProperty(FIELD_PSDELOGICNAME)
    public void setPSDELogicName(String pSDELogicName){
        this.set(FIELD_PSDELOGICNAME, pSDELogicName);
    }
    
    /**
     * 获取 实体逻辑  
     * @return
     */
    @JsonIgnore
    public String getPSDELogicName(){
        Object objValue = this.get(FIELD_PSDELOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDELogicNameDirty(){
        if(this.contains(FIELD_PSDELOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体逻辑
     */
    @JsonIgnore
    public void resetPSDELogicName(){
        this.reset(FIELD_PSDELOGICNAME);
    }

    /**
     * 设置 实体逻辑，详细说明：{@link #FIELD_PSDELOGICNAME}
     * <P>
     * 等同 {@link #setPSDELogicName}
     * @param pSDELogicName
     */
    @JsonIgnore
    public PSDEActionLogicDTO psdelogicname(String pSDELogicName){
        this.setPSDELogicName(pSDELogicName);
        return this;
    }

    /**
     * <B>PSDEMAINSTATEID</B>&nbsp;主状态
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEMainStateDTO} 
     */
    public final static String FIELD_PSDEMAINSTATEID = "psdemainstateid";

    /**
     * 设置 主状态
     * 
     * @param pSDEMainStateId
     * 
     */
    @JsonProperty(FIELD_PSDEMAINSTATEID)
    public void setPSDEMainStateId(String pSDEMainStateId){
        this.set(FIELD_PSDEMAINSTATEID, pSDEMainStateId);
    }
    
    /**
     * 获取 主状态  
     * @return
     */
    @JsonIgnore
    public String getPSDEMainStateId(){
        Object objValue = this.get(FIELD_PSDEMAINSTATEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEMainStateIdDirty(){
        if(this.contains(FIELD_PSDEMAINSTATEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主状态
     */
    @JsonIgnore
    public void resetPSDEMainStateId(){
        this.reset(FIELD_PSDEMAINSTATEID);
    }

    /**
     * 设置 主状态
     * <P>
     * 等同 {@link #setPSDEMainStateId}
     * @param pSDEMainStateId
     */
    @JsonIgnore
    public PSDEActionLogicDTO psdemainstateid(String pSDEMainStateId){
        this.setPSDEMainStateId(pSDEMainStateId);
        return this;
    }

    /**
     * 设置 主状态，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEMainStateId}
     * @param pSDEMainState 引用对象
     */
    @JsonIgnore
    public PSDEActionLogicDTO psdemainstateid(PSDEMainStateDTO pSDEMainState){
        if(pSDEMainState == null){
            this.setPSDEMainStateId(null);
            this.setPSDEMainStateName(null);
        }
        else{
            this.setPSDEMainStateId(pSDEMainState.getPSDEMainStateId());
            this.setPSDEMainStateName(pSDEMainState.getPSDEMainStateName());
        }
        return this;
    }

    /**
     * <B>PSDEMAINSTATENAME</B>&nbsp;主状态
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEMAINSTATEID}
     */
    public final static String FIELD_PSDEMAINSTATENAME = "psdemainstatename";

    /**
     * 设置 主状态
     * 
     * @param pSDEMainStateName
     * 
     */
    @JsonProperty(FIELD_PSDEMAINSTATENAME)
    public void setPSDEMainStateName(String pSDEMainStateName){
        this.set(FIELD_PSDEMAINSTATENAME, pSDEMainStateName);
    }
    
    /**
     * 获取 主状态  
     * @return
     */
    @JsonIgnore
    public String getPSDEMainStateName(){
        Object objValue = this.get(FIELD_PSDEMAINSTATENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEMainStateNameDirty(){
        if(this.contains(FIELD_PSDEMAINSTATENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主状态
     */
    @JsonIgnore
    public void resetPSDEMainStateName(){
        this.reset(FIELD_PSDEMAINSTATENAME);
    }

    /**
     * 设置 主状态
     * <P>
     * 等同 {@link #setPSDEMainStateName}
     * @param pSDEMainStateName
     */
    @JsonIgnore
    public PSDEActionLogicDTO psdemainstatename(String pSDEMainStateName){
        this.setPSDEMainStateName(pSDEMainStateName);
        return this;
    }

    /**
     * <B>PSDENAME</B>&nbsp;实体，指定宿主行为对象所在的实体
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
    public PSDEActionLogicDTO psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSDENOTIFYID</B>&nbsp;实体通知，附加逻辑类型为实体通知时指定调用的实体通知对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDENotifyDTO} 
     */
    public final static String FIELD_PSDENOTIFYID = "psdenotifyid";

    /**
     * 设置 实体通知，详细说明：{@link #FIELD_PSDENOTIFYID}
     * 
     * @param pSDENotifyId
     * 
     */
    @JsonProperty(FIELD_PSDENOTIFYID)
    public void setPSDENotifyId(String pSDENotifyId){
        this.set(FIELD_PSDENOTIFYID, pSDENotifyId);
    }
    
    /**
     * 获取 实体通知  
     * @return
     */
    @JsonIgnore
    public String getPSDENotifyId(){
        Object objValue = this.get(FIELD_PSDENOTIFYID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体通知 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDENotifyIdDirty(){
        if(this.contains(FIELD_PSDENOTIFYID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体通知
     */
    @JsonIgnore
    public void resetPSDENotifyId(){
        this.reset(FIELD_PSDENOTIFYID);
    }

    /**
     * 设置 实体通知，详细说明：{@link #FIELD_PSDENOTIFYID}
     * <P>
     * 等同 {@link #setPSDENotifyId}
     * @param pSDENotifyId
     */
    @JsonIgnore
    public PSDEActionLogicDTO psdenotifyid(String pSDENotifyId){
        this.setPSDENotifyId(pSDENotifyId);
        return this;
    }

    /**
     * 设置 实体通知，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDENotifyId}
     * @param pSDENotify 引用对象
     */
    @JsonIgnore
    public PSDEActionLogicDTO psdenotifyid(PSDENotifyDTO pSDENotify){
        if(pSDENotify == null){
            this.setPSDENotifyId(null);
            this.setPSDENotifyName(null);
        }
        else{
            this.setPSDENotifyId(pSDENotify.getPSDENotifyId());
            this.setPSDENotifyName(pSDENotify.getPSDENotifyName());
        }
        return this;
    }

    /**
     * <B>PSDENOTIFYNAME</B>&nbsp;实体通知，附加逻辑类型为实体通知时指定调用的实体通知对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDENOTIFYID}
     */
    public final static String FIELD_PSDENOTIFYNAME = "psdenotifyname";

    /**
     * 设置 实体通知，详细说明：{@link #FIELD_PSDENOTIFYNAME}
     * 
     * @param pSDENotifyName
     * 
     */
    @JsonProperty(FIELD_PSDENOTIFYNAME)
    public void setPSDENotifyName(String pSDENotifyName){
        this.set(FIELD_PSDENOTIFYNAME, pSDENotifyName);
    }
    
    /**
     * 获取 实体通知  
     * @return
     */
    @JsonIgnore
    public String getPSDENotifyName(){
        Object objValue = this.get(FIELD_PSDENOTIFYNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体通知 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDENotifyNameDirty(){
        if(this.contains(FIELD_PSDENOTIFYNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体通知
     */
    @JsonIgnore
    public void resetPSDENotifyName(){
        this.reset(FIELD_PSDENOTIFYNAME);
    }

    /**
     * 设置 实体通知，详细说明：{@link #FIELD_PSDENOTIFYNAME}
     * <P>
     * 等同 {@link #setPSDENotifyName}
     * @param pSDENotifyName
     */
    @JsonIgnore
    public PSDEActionLogicDTO psdenotifyname(String pSDENotifyName){
        this.setPSDENotifyName(pSDENotifyName);
        return this;
    }

    /**
     * <B>PSSYSDELOGICNODEID</B>&nbsp;系统逻辑处理节点
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysDELogicNodeDTO} 
     */
    public final static String FIELD_PSSYSDELOGICNODEID = "pssysdelogicnodeid";

    /**
     * 设置 系统逻辑处理节点
     * 
     * @param pSSysDELogicNodeId
     * 
     */
    @JsonProperty(FIELD_PSSYSDELOGICNODEID)
    public void setPSSysDELogicNodeId(String pSSysDELogicNodeId){
        this.set(FIELD_PSSYSDELOGICNODEID, pSSysDELogicNodeId);
    }
    
    /**
     * 获取 系统逻辑处理节点  
     * @return
     */
    @JsonIgnore
    public String getPSSysDELogicNodeId(){
        Object objValue = this.get(FIELD_PSSYSDELOGICNODEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统逻辑处理节点 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDELogicNodeIdDirty(){
        if(this.contains(FIELD_PSSYSDELOGICNODEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统逻辑处理节点
     */
    @JsonIgnore
    public void resetPSSysDELogicNodeId(){
        this.reset(FIELD_PSSYSDELOGICNODEID);
    }

    /**
     * 设置 系统逻辑处理节点
     * <P>
     * 等同 {@link #setPSSysDELogicNodeId}
     * @param pSSysDELogicNodeId
     */
    @JsonIgnore
    public PSDEActionLogicDTO pssysdelogicnodeid(String pSSysDELogicNodeId){
        this.setPSSysDELogicNodeId(pSSysDELogicNodeId);
        return this;
    }

    /**
     * 设置 系统逻辑处理节点，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDELogicNodeId}
     * @param pSSysDELogicNode 引用对象
     */
    @JsonIgnore
    public PSDEActionLogicDTO pssysdelogicnodeid(PSSysDELogicNodeDTO pSSysDELogicNode){
        if(pSSysDELogicNode == null){
            this.setPSSysDELogicNodeId(null);
            this.setPSSysDELogicNodeName(null);
        }
        else{
            this.setPSSysDELogicNodeId(pSSysDELogicNode.getPSSysDELogicNodeId());
            this.setPSSysDELogicNodeName(pSSysDELogicNode.getPSSysDELogicNodeName());
        }
        return this;
    }

    /**
     * <B>PSSYSDELOGICNODENAME</B>&nbsp;系统逻辑处理节点
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDELOGICNODEID}
     */
    public final static String FIELD_PSSYSDELOGICNODENAME = "pssysdelogicnodename";

    /**
     * 设置 系统逻辑处理节点
     * 
     * @param pSSysDELogicNodeName
     * 
     */
    @JsonProperty(FIELD_PSSYSDELOGICNODENAME)
    public void setPSSysDELogicNodeName(String pSSysDELogicNodeName){
        this.set(FIELD_PSSYSDELOGICNODENAME, pSSysDELogicNodeName);
    }
    
    /**
     * 获取 系统逻辑处理节点  
     * @return
     */
    @JsonIgnore
    public String getPSSysDELogicNodeName(){
        Object objValue = this.get(FIELD_PSSYSDELOGICNODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统逻辑处理节点 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDELogicNodeNameDirty(){
        if(this.contains(FIELD_PSSYSDELOGICNODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统逻辑处理节点
     */
    @JsonIgnore
    public void resetPSSysDELogicNodeName(){
        this.reset(FIELD_PSSYSDELOGICNODENAME);
    }

    /**
     * 设置 系统逻辑处理节点
     * <P>
     * 等同 {@link #setPSSysDELogicNodeName}
     * @param pSSysDELogicNodeName
     */
    @JsonIgnore
    public PSDEActionLogicDTO pssysdelogicnodename(String pSSysDELogicNodeName){
        this.setPSSysDELogicNodeName(pSSysDELogicNodeName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端扩展插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysPFPluginDTO} 
     */
    public final static String FIELD_PSSYSPFPLUGINID = "pssyspfpluginid";

    /**
     * 设置 前端扩展插件
     * 
     * @param pSSysPFPluginId
     * 
     */
    @JsonProperty(FIELD_PSSYSPFPLUGINID)
    public void setPSSysPFPluginId(String pSSysPFPluginId){
        this.set(FIELD_PSSYSPFPLUGINID, pSSysPFPluginId);
    }
    
    /**
     * 获取 前端扩展插件  
     * @return
     */
    @JsonIgnore
    public String getPSSysPFPluginId(){
        Object objValue = this.get(FIELD_PSSYSPFPLUGINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端扩展插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysPFPluginIdDirty(){
        if(this.contains(FIELD_PSSYSPFPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端扩展插件
     */
    @JsonIgnore
    public void resetPSSysPFPluginId(){
        this.reset(FIELD_PSSYSPFPLUGINID);
    }

    /**
     * 设置 前端扩展插件
     * <P>
     * 等同 {@link #setPSSysPFPluginId}
     * @param pSSysPFPluginId
     */
    @JsonIgnore
    public PSDEActionLogicDTO pssyspfpluginid(String pSSysPFPluginId){
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    /**
     * 设置 前端扩展插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysPFPluginId}
     * @param pSSysPFPlugin 引用对象
     */
    @JsonIgnore
    public PSDEActionLogicDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin){
        if(pSSysPFPlugin == null){
            this.setPSSysPFPluginId(null);
            this.setPSSysPFPluginName(null);
        }
        else{
            this.setPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端扩展插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSPFPLUGINID}
     */
    public final static String FIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";

    /**
     * 设置 前端扩展插件
     * 
     * @param pSSysPFPluginName
     * 
     */
    @JsonProperty(FIELD_PSSYSPFPLUGINNAME)
    public void setPSSysPFPluginName(String pSSysPFPluginName){
        this.set(FIELD_PSSYSPFPLUGINNAME, pSSysPFPluginName);
    }
    
    /**
     * 获取 前端扩展插件  
     * @return
     */
    @JsonIgnore
    public String getPSSysPFPluginName(){
        Object objValue = this.get(FIELD_PSSYSPFPLUGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端扩展插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysPFPluginNameDirty(){
        if(this.contains(FIELD_PSSYSPFPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端扩展插件
     */
    @JsonIgnore
    public void resetPSSysPFPluginName(){
        this.reset(FIELD_PSSYSPFPLUGINNAME);
    }

    /**
     * 设置 前端扩展插件
     * <P>
     * 等同 {@link #setPSSysPFPluginName}
     * @param pSSysPFPluginName
     */
    @JsonIgnore
    public PSDEActionLogicDTO pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    /**
     * <B>PSSYSSEQUENCEID</B>&nbsp;系统值序列
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysSequenceDTO} 
     */
    public final static String FIELD_PSSYSSEQUENCEID = "pssyssequenceid";

    /**
     * 设置 系统值序列
     * 
     * @param pSSysSequenceId
     * 
     */
    @JsonProperty(FIELD_PSSYSSEQUENCEID)
    public void setPSSysSequenceId(String pSSysSequenceId){
        this.set(FIELD_PSSYSSEQUENCEID, pSSysSequenceId);
    }
    
    /**
     * 获取 系统值序列  
     * @return
     */
    @JsonIgnore
    public String getPSSysSequenceId(){
        Object objValue = this.get(FIELD_PSSYSSEQUENCEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统值序列 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSequenceIdDirty(){
        if(this.contains(FIELD_PSSYSSEQUENCEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统值序列
     */
    @JsonIgnore
    public void resetPSSysSequenceId(){
        this.reset(FIELD_PSSYSSEQUENCEID);
    }

    /**
     * 设置 系统值序列
     * <P>
     * 等同 {@link #setPSSysSequenceId}
     * @param pSSysSequenceId
     */
    @JsonIgnore
    public PSDEActionLogicDTO pssyssequenceid(String pSSysSequenceId){
        this.setPSSysSequenceId(pSSysSequenceId);
        return this;
    }

    /**
     * 设置 系统值序列，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSequenceId}
     * @param pSSysSequence 引用对象
     */
    @JsonIgnore
    public PSDEActionLogicDTO pssyssequenceid(PSSysSequenceDTO pSSysSequence){
        if(pSSysSequence == null){
            this.setPSSysSequenceId(null);
            this.setPSSysSequenceName(null);
        }
        else{
            this.setPSSysSequenceId(pSSysSequence.getPSSysSequenceId());
            this.setPSSysSequenceName(pSSysSequence.getPSSysSequenceName());
        }
        return this;
    }

    /**
     * <B>PSSYSSEQUENCENAME</B>&nbsp;系统值序列
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSEQUENCEID}
     */
    public final static String FIELD_PSSYSSEQUENCENAME = "pssyssequencename";

    /**
     * 设置 系统值序列
     * 
     * @param pSSysSequenceName
     * 
     */
    @JsonProperty(FIELD_PSSYSSEQUENCENAME)
    public void setPSSysSequenceName(String pSSysSequenceName){
        this.set(FIELD_PSSYSSEQUENCENAME, pSSysSequenceName);
    }
    
    /**
     * 获取 系统值序列  
     * @return
     */
    @JsonIgnore
    public String getPSSysSequenceName(){
        Object objValue = this.get(FIELD_PSSYSSEQUENCENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统值序列 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSequenceNameDirty(){
        if(this.contains(FIELD_PSSYSSEQUENCENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统值序列
     */
    @JsonIgnore
    public void resetPSSysSequenceName(){
        this.reset(FIELD_PSSYSSEQUENCENAME);
    }

    /**
     * 设置 系统值序列
     * <P>
     * 等同 {@link #setPSSysSequenceName}
     * @param pSSysSequenceName
     */
    @JsonIgnore
    public PSDEActionLogicDTO pssyssequencename(String pSSysSequenceName){
        this.setPSSysSequenceName(pSSysSequenceName);
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINID</B>&nbsp;后端扩展插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysSFPluginDTO} 
     */
    public final static String FIELD_PSSYSSFPLUGINID = "pssyssfpluginid";

    /**
     * 设置 后端扩展插件
     * 
     * @param pSSysSFPluginId
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINID)
    public void setPSSysSFPluginId(String pSSysSFPluginId){
        this.set(FIELD_PSSYSSFPLUGINID, pSSysSFPluginId);
    }
    
    /**
     * 获取 后端扩展插件  
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
     * 判断 后端扩展插件 是否指定值，包括空值
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
     * 重置 后端扩展插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginId(){
        this.reset(FIELD_PSSYSSFPLUGINID);
    }

    /**
     * 设置 后端扩展插件
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPluginId
     */
    @JsonIgnore
    public PSDEActionLogicDTO pssyssfpluginid(String pSSysSFPluginId){
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    /**
     * 设置 后端扩展插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPlugin 引用对象
     */
    @JsonIgnore
    public PSDEActionLogicDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin){
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
     * <B>PSSYSSFPLUGINNAME</B>&nbsp;后端扩展插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSFPLUGINID}
     */
    public final static String FIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";

    /**
     * 设置 后端扩展插件
     * 
     * @param pSSysSFPluginName
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINNAME)
    public void setPSSysSFPluginName(String pSSysSFPluginName){
        this.set(FIELD_PSSYSSFPLUGINNAME, pSSysSFPluginName);
    }
    
    /**
     * 获取 后端扩展插件  
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
     * 判断 后端扩展插件 是否指定值，包括空值
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
     * 重置 后端扩展插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginName(){
        this.reset(FIELD_PSSYSSFPLUGINNAME);
    }

    /**
     * 设置 后端扩展插件
     * <P>
     * 等同 {@link #setPSSysSFPluginName}
     * @param pSSysSFPluginName
     */
    @JsonIgnore
    public PSDEActionLogicDTO pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    /**
     * <B>PSSYSTRANSLATORID</B>&nbsp;系统值转换器
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysTranslatorDTO} 
     */
    public final static String FIELD_PSSYSTRANSLATORID = "pssystranslatorid";

    /**
     * 设置 系统值转换器
     * 
     * @param pSSysTranslatorId
     * 
     */
    @JsonProperty(FIELD_PSSYSTRANSLATORID)
    public void setPSSysTranslatorId(String pSSysTranslatorId){
        this.set(FIELD_PSSYSTRANSLATORID, pSSysTranslatorId);
    }
    
    /**
     * 获取 系统值转换器  
     * @return
     */
    @JsonIgnore
    public String getPSSysTranslatorId(){
        Object objValue = this.get(FIELD_PSSYSTRANSLATORID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统值转换器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysTranslatorIdDirty(){
        if(this.contains(FIELD_PSSYSTRANSLATORID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统值转换器
     */
    @JsonIgnore
    public void resetPSSysTranslatorId(){
        this.reset(FIELD_PSSYSTRANSLATORID);
    }

    /**
     * 设置 系统值转换器
     * <P>
     * 等同 {@link #setPSSysTranslatorId}
     * @param pSSysTranslatorId
     */
    @JsonIgnore
    public PSDEActionLogicDTO pssystranslatorid(String pSSysTranslatorId){
        this.setPSSysTranslatorId(pSSysTranslatorId);
        return this;
    }

    /**
     * 设置 系统值转换器，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysTranslatorId}
     * @param pSSysTranslator 引用对象
     */
    @JsonIgnore
    public PSDEActionLogicDTO pssystranslatorid(PSSysTranslatorDTO pSSysTranslator){
        if(pSSysTranslator == null){
            this.setPSSysTranslatorId(null);
            this.setPSSysTranslatorName(null);
        }
        else{
            this.setPSSysTranslatorId(pSSysTranslator.getPSSysTranslatorId());
            this.setPSSysTranslatorName(pSSysTranslator.getPSSysTranslatorName());
        }
        return this;
    }

    /**
     * <B>PSSYSTRANSLATORNAME</B>&nbsp;系统值转换器
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSTRANSLATORID}
     */
    public final static String FIELD_PSSYSTRANSLATORNAME = "pssystranslatorname";

    /**
     * 设置 系统值转换器
     * 
     * @param pSSysTranslatorName
     * 
     */
    @JsonProperty(FIELD_PSSYSTRANSLATORNAME)
    public void setPSSysTranslatorName(String pSSysTranslatorName){
        this.set(FIELD_PSSYSTRANSLATORNAME, pSSysTranslatorName);
    }
    
    /**
     * 获取 系统值转换器  
     * @return
     */
    @JsonIgnore
    public String getPSSysTranslatorName(){
        Object objValue = this.get(FIELD_PSSYSTRANSLATORNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统值转换器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysTranslatorNameDirty(){
        if(this.contains(FIELD_PSSYSTRANSLATORNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统值转换器
     */
    @JsonIgnore
    public void resetPSSysTranslatorName(){
        this.reset(FIELD_PSSYSTRANSLATORNAME);
    }

    /**
     * 设置 系统值转换器
     * <P>
     * 等同 {@link #setPSSysTranslatorName}
     * @param pSSysTranslatorName
     */
    @JsonIgnore
    public PSDEActionLogicDTO pssystranslatorname(String pSSysTranslatorName){
        this.setPSSysTranslatorName(pSSysTranslatorName);
        return this;
    }

    /**
     * <B>PSSYSVALUERULEID</B>&nbsp;值规则
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysValueRuleDTO} 
     */
    public final static String FIELD_PSSYSVALUERULEID = "pssysvalueruleid";

    /**
     * 设置 值规则
     * 
     * @param pSSysValueRuleId
     * 
     */
    @JsonProperty(FIELD_PSSYSVALUERULEID)
    public void setPSSysValueRuleId(String pSSysValueRuleId){
        this.set(FIELD_PSSYSVALUERULEID, pSSysValueRuleId);
    }
    
    /**
     * 获取 值规则  
     * @return
     */
    @JsonIgnore
    public String getPSSysValueRuleId(){
        Object objValue = this.get(FIELD_PSSYSVALUERULEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值规则 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysValueRuleIdDirty(){
        if(this.contains(FIELD_PSSYSVALUERULEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值规则
     */
    @JsonIgnore
    public void resetPSSysValueRuleId(){
        this.reset(FIELD_PSSYSVALUERULEID);
    }

    /**
     * 设置 值规则
     * <P>
     * 等同 {@link #setPSSysValueRuleId}
     * @param pSSysValueRuleId
     */
    @JsonIgnore
    public PSDEActionLogicDTO pssysvalueruleid(String pSSysValueRuleId){
        this.setPSSysValueRuleId(pSSysValueRuleId);
        return this;
    }

    /**
     * 设置 值规则，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysValueRuleId}
     * @param pSSysValueRule 引用对象
     */
    @JsonIgnore
    public PSDEActionLogicDTO pssysvalueruleid(PSSysValueRuleDTO pSSysValueRule){
        if(pSSysValueRule == null){
            this.setPSSysValueRuleId(null);
            this.setPSSysValueRuleName(null);
        }
        else{
            this.setPSSysValueRuleId(pSSysValueRule.getPSSysValueRuleId());
            this.setPSSysValueRuleName(pSSysValueRule.getPSSysValueRuleName());
        }
        return this;
    }

    /**
     * <B>PSSYSVALUERULENAME</B>&nbsp;值规则
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSVALUERULEID}
     */
    public final static String FIELD_PSSYSVALUERULENAME = "pssysvaluerulename";

    /**
     * 设置 值规则
     * 
     * @param pSSysValueRuleName
     * 
     */
    @JsonProperty(FIELD_PSSYSVALUERULENAME)
    public void setPSSysValueRuleName(String pSSysValueRuleName){
        this.set(FIELD_PSSYSVALUERULENAME, pSSysValueRuleName);
    }
    
    /**
     * 获取 值规则  
     * @return
     */
    @JsonIgnore
    public String getPSSysValueRuleName(){
        Object objValue = this.get(FIELD_PSSYSVALUERULENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值规则 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysValueRuleNameDirty(){
        if(this.contains(FIELD_PSSYSVALUERULENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值规则
     */
    @JsonIgnore
    public void resetPSSysValueRuleName(){
        this.reset(FIELD_PSSYSVALUERULENAME);
    }

    /**
     * 设置 值规则
     * <P>
     * 等同 {@link #setPSSysValueRuleName}
     * @param pSSysValueRuleName
     */
    @JsonIgnore
    public PSDEActionLogicDTO pssysvaluerulename(String pSSysValueRuleName){
        this.setPSSysValueRuleName(pSSysValueRuleName);
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
    public PSDEActionLogicDTO updatedate(Timestamp updateDate){
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
    public PSDEActionLogicDTO updateman(String updateMan){
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
    public PSDEActionLogicDTO usercat(String userCat){
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
    public PSDEActionLogicDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSDEActionLogicDTO usertag(String userTag){
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
    public PSDEActionLogicDTO usertag2(String userTag2){
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
    public PSDEActionLogicDTO usertag3(String userTag3){
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
    public PSDEActionLogicDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>VALIDFLAG</B>&nbsp;启用
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
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
    public PSDEActionLogicDTO validflag(Integer validFlag){
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
    public PSDEActionLogicDTO validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSDEActionLogicId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSDEActionLogicId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEActionLogicId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEActionLogicId(strValue);
    }

    @JsonIgnore
    public PSDEActionLogicDTO id(String strValue){
        this.setPSDEActionLogicId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDEActionLogicDTO){
            PSDEActionLogicDTO dto = (PSDEActionLogicDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
