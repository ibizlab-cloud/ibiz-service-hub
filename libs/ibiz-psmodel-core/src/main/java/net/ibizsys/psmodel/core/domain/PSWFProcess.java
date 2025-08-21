package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSWFPROCESS</B>流程处理 模型传输对象
 * <P>
 * 流程处理节点模型，定义流程处理的逻辑信息，支持多种类型，也包括了设计界面图元展示信息
 */
public class PSWFProcess extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSWFProcess(){
    }      

    /**
     * <B>ASYNCMODE</B>&nbsp;异步处理，指定流程处理是否以异步的方式进行，异步处理不等待处理结束而直接返回，为定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ASYNCMODE = "asyncmode";

    /**
     * 设置 异步处理，详细说明：{@link #FIELD_ASYNCMODE}
     * 
     * @param asyncMode
     * 
     */
    @JsonProperty(FIELD_ASYNCMODE)
    public void setAsyncMode(Integer asyncMode){
        this.set(FIELD_ASYNCMODE, asyncMode);
    }
    
    /**
     * 获取 异步处理  
     * @return
     */
    @JsonIgnore
    public Integer getAsyncMode(){
        Object objValue = this.get(FIELD_ASYNCMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 异步处理 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAsyncModeDirty(){
        if(this.contains(FIELD_ASYNCMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 异步处理
     */
    @JsonIgnore
    public void resetAsyncMode(){
        this.reset(FIELD_ASYNCMODE);
    }

    /**
     * 设置 异步处理，详细说明：{@link #FIELD_ASYNCMODE}
     * <P>
     * 等同 {@link #setAsyncMode}
     * @param asyncMode
     */
    @JsonIgnore
    public PSWFProcess asyncmode(Integer asyncMode){
        this.setAsyncMode(asyncMode);
        return this;
    }

     /**
     * 设置 异步处理，详细说明：{@link #FIELD_ASYNCMODE}
     * <P>
     * 等同 {@link #setAsyncMode}
     * @param asyncMode
     */
    @JsonIgnore
    public PSWFProcess asyncmode(Boolean asyncMode){
        if(asyncMode == null){
            this.setAsyncMode(null);
        }
        else{
            this.setAsyncMode(asyncMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定流程处理的代码标识，需要在所在的流程版本中具有唯一性
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
    public PSWFProcess codename(String codeName){
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
    public PSWFProcess createdate(String createDate){
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
    public PSWFProcess createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>EDITFIELDS</B>&nbsp;编辑相关属性
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_EDITFIELDS = "editfields";

    /**
     * 设置 编辑相关属性
     * 
     * @param editFields
     * 
     */
    @JsonProperty(FIELD_EDITFIELDS)
    public void setEditFields(String editFields){
        this.set(FIELD_EDITFIELDS, editFields);
    }
    
    /**
     * 获取 编辑相关属性  
     * @return
     */
    @JsonIgnore
    public String getEditFields(){
        Object objValue = this.get(FIELD_EDITFIELDS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 编辑相关属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEditFieldsDirty(){
        if(this.contains(FIELD_EDITFIELDS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 编辑相关属性
     */
    @JsonIgnore
    public void resetEditFields(){
        this.reset(FIELD_EDITFIELDS);
    }

    /**
     * 设置 编辑相关属性
     * <P>
     * 等同 {@link #setEditFields}
     * @param editFields
     */
    @JsonIgnore
    public PSWFProcess editfields(String editFields){
        this.setEditFields(editFields);
        return this;
    }

    /**
     * <B>EDITFLAG</B>&nbsp;支持编辑，指定流程处理是否提供对数据的编辑能力，未定义时为【不支持】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.WFProcessEditMode} 
     */
    public final static String FIELD_EDITFLAG = "editflag";

    /**
     * 设置 支持编辑，详细说明：{@link #FIELD_EDITFLAG}
     * 
     * @param editFlag
     * 
     */
    @JsonProperty(FIELD_EDITFLAG)
    public void setEditFlag(Integer editFlag){
        this.set(FIELD_EDITFLAG, editFlag);
    }
    
    /**
     * 获取 支持编辑  
     * @return
     */
    @JsonIgnore
    public Integer getEditFlag(){
        Object objValue = this.get(FIELD_EDITFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持编辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEditFlagDirty(){
        if(this.contains(FIELD_EDITFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持编辑
     */
    @JsonIgnore
    public void resetEditFlag(){
        this.reset(FIELD_EDITFLAG);
    }

    /**
     * 设置 支持编辑，详细说明：{@link #FIELD_EDITFLAG}
     * <P>
     * 等同 {@link #setEditFlag}
     * @param editFlag
     */
    @JsonIgnore
    public PSWFProcess editflag(Integer editFlag){
        this.setEditFlag(editFlag);
        return this;
    }

     /**
     * 设置 支持编辑，详细说明：{@link #FIELD_EDITFLAG}
     * <P>
     * 等同 {@link #setEditFlag}
     * @param editFlag
     */
    @JsonIgnore
    public PSWFProcess editflag(net.ibizsys.psmodel.core.util.PSModelEnums.WFProcessEditMode editFlag){
        if(editFlag == null){
            this.setEditFlag(null);
        }
        else{
            this.setEditFlag(editFlag.value);
        }
        return this;
    }

    /**
     * <B>EDITPSDEFGROUPID</B>&nbsp;编辑相关属性组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEFGroup} 
     */
    public final static String FIELD_EDITPSDEFGROUPID = "editpsdefgroupid";

    /**
     * 设置 编辑相关属性组
     * 
     * @param editPSDEFGroupId
     * 
     */
    @JsonProperty(FIELD_EDITPSDEFGROUPID)
    public void setEditPSDEFGroupId(String editPSDEFGroupId){
        this.set(FIELD_EDITPSDEFGROUPID, editPSDEFGroupId);
    }
    
    /**
     * 获取 编辑相关属性组  
     * @return
     */
    @JsonIgnore
    public String getEditPSDEFGroupId(){
        Object objValue = this.get(FIELD_EDITPSDEFGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 编辑相关属性组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEditPSDEFGroupIdDirty(){
        if(this.contains(FIELD_EDITPSDEFGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 编辑相关属性组
     */
    @JsonIgnore
    public void resetEditPSDEFGroupId(){
        this.reset(FIELD_EDITPSDEFGROUPID);
    }

    /**
     * 设置 编辑相关属性组
     * <P>
     * 等同 {@link #setEditPSDEFGroupId}
     * @param editPSDEFGroupId
     */
    @JsonIgnore
    public PSWFProcess editpsdefgroupid(String editPSDEFGroupId){
        this.setEditPSDEFGroupId(editPSDEFGroupId);
        return this;
    }

    /**
     * 设置 编辑相关属性组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setEditPSDEFGroupId}
     * @param pSDEFGroup 引用对象
     */
    @JsonIgnore
    public PSWFProcess editpsdefgroupid(PSDEFGroup pSDEFGroup){
        if(pSDEFGroup == null){
            this.setEditPSDEFGroupId(null);
            this.setEditPSDEFGroupName(null);
        }
        else{
            this.setEditPSDEFGroupId(pSDEFGroup.getPSDEFGroupId());
            this.setEditPSDEFGroupName(pSDEFGroup.getPSDEFGroupName());
        }
        return this;
    }

    /**
     * <B>EDITPSDEFGROUPNAME</B>&nbsp;编辑相关属性组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_EDITPSDEFGROUPID}
     */
    public final static String FIELD_EDITPSDEFGROUPNAME = "editpsdefgroupname";

    /**
     * 设置 编辑相关属性组
     * 
     * @param editPSDEFGroupName
     * 
     */
    @JsonProperty(FIELD_EDITPSDEFGROUPNAME)
    public void setEditPSDEFGroupName(String editPSDEFGroupName){
        this.set(FIELD_EDITPSDEFGROUPNAME, editPSDEFGroupName);
    }
    
    /**
     * 获取 编辑相关属性组  
     * @return
     */
    @JsonIgnore
    public String getEditPSDEFGroupName(){
        Object objValue = this.get(FIELD_EDITPSDEFGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 编辑相关属性组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEditPSDEFGroupNameDirty(){
        if(this.contains(FIELD_EDITPSDEFGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 编辑相关属性组
     */
    @JsonIgnore
    public void resetEditPSDEFGroupName(){
        this.reset(FIELD_EDITPSDEFGROUPNAME);
    }

    /**
     * 设置 编辑相关属性组
     * <P>
     * 等同 {@link #setEditPSDEFGroupName}
     * @param editPSDEFGroupName
     */
    @JsonIgnore
    public PSWFProcess editpsdefgroupname(String editPSDEFGroupName){
        this.setEditPSDEFGroupName(editPSDEFGroupName);
        return this;
    }

    /**
     * <B>EMBEDPSDEDSID</B>&nbsp;嵌套实体数据集
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataSet} 
     */
    public final static String FIELD_EMBEDPSDEDSID = "embedpsdedsid";

    /**
     * 设置 嵌套实体数据集
     * 
     * @param embedPSDEDSId
     * 
     */
    @JsonProperty(FIELD_EMBEDPSDEDSID)
    public void setEmbedPSDEDSId(String embedPSDEDSId){
        this.set(FIELD_EMBEDPSDEDSID, embedPSDEDSId);
    }
    
    /**
     * 获取 嵌套实体数据集  
     * @return
     */
    @JsonIgnore
    public String getEmbedPSDEDSId(){
        Object objValue = this.get(FIELD_EMBEDPSDEDSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 嵌套实体数据集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEmbedPSDEDSIdDirty(){
        if(this.contains(FIELD_EMBEDPSDEDSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 嵌套实体数据集
     */
    @JsonIgnore
    public void resetEmbedPSDEDSId(){
        this.reset(FIELD_EMBEDPSDEDSID);
    }

    /**
     * 设置 嵌套实体数据集
     * <P>
     * 等同 {@link #setEmbedPSDEDSId}
     * @param embedPSDEDSId
     */
    @JsonIgnore
    public PSWFProcess embedpsdedsid(String embedPSDEDSId){
        this.setEmbedPSDEDSId(embedPSDEDSId);
        return this;
    }

    /**
     * 设置 嵌套实体数据集，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setEmbedPSDEDSId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSWFProcess embedpsdedsid(PSDEDataSet pSDEDataSet){
        if(pSDEDataSet == null){
            this.setEmbedPSDEDSId(null);
            this.setEmbedPSDEDSName(null);
        }
        else{
            this.setEmbedPSDEDSId(pSDEDataSet.getPSDEDataSetId());
            this.setEmbedPSDEDSName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    /**
     * <B>EMBEDPSDEDSNAME</B>&nbsp;嵌套实体数据集
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_EMBEDPSDEDSID}
     */
    public final static String FIELD_EMBEDPSDEDSNAME = "embedpsdedsname";

    /**
     * 设置 嵌套实体数据集
     * 
     * @param embedPSDEDSName
     * 
     */
    @JsonProperty(FIELD_EMBEDPSDEDSNAME)
    public void setEmbedPSDEDSName(String embedPSDEDSName){
        this.set(FIELD_EMBEDPSDEDSNAME, embedPSDEDSName);
    }
    
    /**
     * 获取 嵌套实体数据集  
     * @return
     */
    @JsonIgnore
    public String getEmbedPSDEDSName(){
        Object objValue = this.get(FIELD_EMBEDPSDEDSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 嵌套实体数据集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEmbedPSDEDSNameDirty(){
        if(this.contains(FIELD_EMBEDPSDEDSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 嵌套实体数据集
     */
    @JsonIgnore
    public void resetEmbedPSDEDSName(){
        this.reset(FIELD_EMBEDPSDEDSNAME);
    }

    /**
     * 设置 嵌套实体数据集
     * <P>
     * 等同 {@link #setEmbedPSDEDSName}
     * @param embedPSDEDSName
     */
    @JsonIgnore
    public PSWFProcess embedpsdedsname(String embedPSDEDSName){
        this.setEmbedPSDEDSName(embedPSDEDSName);
        return this;
    }

    /**
     * <B>EMBEDPSDEID</B>&nbsp;EMBEDPSDEID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_EMBEDPSWFDEID}
     */
    public final static String FIELD_EMBEDPSDEID = "embedpsdeid";

    /**
     * 设置 EMBEDPSDEID
     * 
     * @param embedPSDEId
     * 
     */
    @JsonProperty(FIELD_EMBEDPSDEID)
    public void setEmbedPSDEId(String embedPSDEId){
        this.set(FIELD_EMBEDPSDEID, embedPSDEId);
    }
    
    /**
     * 获取 EMBEDPSDEID  
     * @return
     */
    @JsonIgnore
    public String getEmbedPSDEId(){
        Object objValue = this.get(FIELD_EMBEDPSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 EMBEDPSDEID 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEmbedPSDEIdDirty(){
        if(this.contains(FIELD_EMBEDPSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 EMBEDPSDEID
     */
    @JsonIgnore
    public void resetEmbedPSDEId(){
        this.reset(FIELD_EMBEDPSDEID);
    }

    /**
     * 设置 EMBEDPSDEID
     * <P>
     * 等同 {@link #setEmbedPSDEId}
     * @param embedPSDEId
     */
    @JsonIgnore
    public PSWFProcess embedpsdeid(String embedPSDEId){
        this.setEmbedPSDEId(embedPSDEId);
        return this;
    }

    /**
     * <B>EMBEDPSWFDEID</B>&nbsp;嵌套工作流实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSWFDE} 
     */
    public final static String FIELD_EMBEDPSWFDEID = "embedpswfdeid";

    /**
     * 设置 嵌套工作流实体
     * 
     * @param embedPSWFDEId
     * 
     */
    @JsonProperty(FIELD_EMBEDPSWFDEID)
    public void setEmbedPSWFDEId(String embedPSWFDEId){
        this.set(FIELD_EMBEDPSWFDEID, embedPSWFDEId);
    }
    
    /**
     * 获取 嵌套工作流实体  
     * @return
     */
    @JsonIgnore
    public String getEmbedPSWFDEId(){
        Object objValue = this.get(FIELD_EMBEDPSWFDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 嵌套工作流实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEmbedPSWFDEIdDirty(){
        if(this.contains(FIELD_EMBEDPSWFDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 嵌套工作流实体
     */
    @JsonIgnore
    public void resetEmbedPSWFDEId(){
        this.reset(FIELD_EMBEDPSWFDEID);
    }

    /**
     * 设置 嵌套工作流实体
     * <P>
     * 等同 {@link #setEmbedPSWFDEId}
     * @param embedPSWFDEId
     */
    @JsonIgnore
    public PSWFProcess embedpswfdeid(String embedPSWFDEId){
        this.setEmbedPSWFDEId(embedPSWFDEId);
        return this;
    }

    /**
     * 设置 嵌套工作流实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setEmbedPSWFDEId}
     * @param pSWFDE 引用对象
     */
    @JsonIgnore
    public PSWFProcess embedpswfdeid(PSWFDE pSWFDE){
        if(pSWFDE == null){
            this.setEmbedPSDEId(null);
            this.setEmbedPSWFDEId(null);
            this.setEmbedPSWFDEName(null);
        }
        else{
            this.setEmbedPSDEId(pSWFDE.getPSDEId());
            this.setEmbedPSWFDEId(pSWFDE.getPSWFDEId());
            this.setEmbedPSWFDEName(pSWFDE.getPSWFDEName());
        }
        return this;
    }

    /**
     * <B>EMBEDPSWFDENAME</B>&nbsp;嵌套工作流实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_EMBEDPSWFDEID}
     */
    public final static String FIELD_EMBEDPSWFDENAME = "embedpswfdename";

    /**
     * 设置 嵌套工作流实体
     * 
     * @param embedPSWFDEName
     * 
     */
    @JsonProperty(FIELD_EMBEDPSWFDENAME)
    public void setEmbedPSWFDEName(String embedPSWFDEName){
        this.set(FIELD_EMBEDPSWFDENAME, embedPSWFDEName);
    }
    
    /**
     * 获取 嵌套工作流实体  
     * @return
     */
    @JsonIgnore
    public String getEmbedPSWFDEName(){
        Object objValue = this.get(FIELD_EMBEDPSWFDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 嵌套工作流实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEmbedPSWFDENameDirty(){
        if(this.contains(FIELD_EMBEDPSWFDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 嵌套工作流实体
     */
    @JsonIgnore
    public void resetEmbedPSWFDEName(){
        this.reset(FIELD_EMBEDPSWFDENAME);
    }

    /**
     * 设置 嵌套工作流实体
     * <P>
     * 等同 {@link #setEmbedPSWFDEName}
     * @param embedPSWFDEName
     */
    @JsonIgnore
    public PSWFProcess embedpswfdename(String embedPSWFDEName){
        this.setEmbedPSWFDEName(embedPSWFDEName);
        return this;
    }

    /**
     * <B>EMBEDPSWFID</B>&nbsp;嵌套流程，指定流程处理启动的外部工作流
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSWorkflow} 
     */
    public final static String FIELD_EMBEDPSWFID = "embedpswfid";

    /**
     * 设置 嵌套流程，详细说明：{@link #FIELD_EMBEDPSWFID}
     * 
     * @param embedPSWFId
     * 
     */
    @JsonProperty(FIELD_EMBEDPSWFID)
    public void setEmbedPSWFId(String embedPSWFId){
        this.set(FIELD_EMBEDPSWFID, embedPSWFId);
    }
    
    /**
     * 获取 嵌套流程  
     * @return
     */
    @JsonIgnore
    public String getEmbedPSWFId(){
        Object objValue = this.get(FIELD_EMBEDPSWFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 嵌套流程 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEmbedPSWFIdDirty(){
        if(this.contains(FIELD_EMBEDPSWFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 嵌套流程
     */
    @JsonIgnore
    public void resetEmbedPSWFId(){
        this.reset(FIELD_EMBEDPSWFID);
    }

    /**
     * 设置 嵌套流程，详细说明：{@link #FIELD_EMBEDPSWFID}
     * <P>
     * 等同 {@link #setEmbedPSWFId}
     * @param embedPSWFId
     */
    @JsonIgnore
    public PSWFProcess embedpswfid(String embedPSWFId){
        this.setEmbedPSWFId(embedPSWFId);
        return this;
    }

    /**
     * 设置 嵌套流程，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setEmbedPSWFId}
     * @param pSWorkflow 引用对象
     */
    @JsonIgnore
    public PSWFProcess embedpswfid(PSWorkflow pSWorkflow){
        if(pSWorkflow == null){
            this.setEmbedPSWFId(null);
            this.setEmbedPSWFName(null);
        }
        else{
            this.setEmbedPSWFId(pSWorkflow.getPSWorkflowId());
            this.setEmbedPSWFName(pSWorkflow.getPSWorkflowName());
        }
        return this;
    }

    /**
     * <B>EMBEDPSWFNAME</B>&nbsp;调用工作流，指定流程处理启动的外部工作流
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_EMBEDPSWFID}
     */
    public final static String FIELD_EMBEDPSWFNAME = "embedpswfname";

    /**
     * 设置 调用工作流，详细说明：{@link #FIELD_EMBEDPSWFNAME}
     * 
     * @param embedPSWFName
     * 
     */
    @JsonProperty(FIELD_EMBEDPSWFNAME)
    public void setEmbedPSWFName(String embedPSWFName){
        this.set(FIELD_EMBEDPSWFNAME, embedPSWFName);
    }
    
    /**
     * 获取 调用工作流  
     * @return
     */
    @JsonIgnore
    public String getEmbedPSWFName(){
        Object objValue = this.get(FIELD_EMBEDPSWFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 调用工作流 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEmbedPSWFNameDirty(){
        if(this.contains(FIELD_EMBEDPSWFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 调用工作流
     */
    @JsonIgnore
    public void resetEmbedPSWFName(){
        this.reset(FIELD_EMBEDPSWFNAME);
    }

    /**
     * 设置 调用工作流，详细说明：{@link #FIELD_EMBEDPSWFNAME}
     * <P>
     * 等同 {@link #setEmbedPSWFName}
     * @param embedPSWFName
     */
    @JsonIgnore
    public PSWFProcess embedpswfname(String embedPSWFName){
        this.setEmbedPSWFName(embedPSWFName);
        return this;
    }

    /**
     * <B>ENABLEMOBILE</B>&nbsp;支持移动端操作，支持当前流程处理是否允许从移动端完成，未定义时为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEMOBILE = "enablemobile";

    /**
     * 设置 支持移动端操作，详细说明：{@link #FIELD_ENABLEMOBILE}
     * 
     * @param enableMobile
     * 
     */
    @JsonProperty(FIELD_ENABLEMOBILE)
    public void setEnableMobile(Integer enableMobile){
        this.set(FIELD_ENABLEMOBILE, enableMobile);
    }
    
    /**
     * 获取 支持移动端操作  
     * @return
     */
    @JsonIgnore
    public Integer getEnableMobile(){
        Object objValue = this.get(FIELD_ENABLEMOBILE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持移动端操作 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableMobileDirty(){
        if(this.contains(FIELD_ENABLEMOBILE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持移动端操作
     */
    @JsonIgnore
    public void resetEnableMobile(){
        this.reset(FIELD_ENABLEMOBILE);
    }

    /**
     * 设置 支持移动端操作，详细说明：{@link #FIELD_ENABLEMOBILE}
     * <P>
     * 等同 {@link #setEnableMobile}
     * @param enableMobile
     */
    @JsonIgnore
    public PSWFProcess enablemobile(Integer enableMobile){
        this.setEnableMobile(enableMobile);
        return this;
    }

     /**
     * 设置 支持移动端操作，详细说明：{@link #FIELD_ENABLEMOBILE}
     * <P>
     * 等同 {@link #setEnableMobile}
     * @param enableMobile
     */
    @JsonIgnore
    public PSWFProcess enablemobile(Boolean enableMobile){
        if(enableMobile == null){
            this.setEnableMobile(null);
        }
        else{
            this.setEnableMobile(enableMobile?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLETIMEOUT</B>&nbsp;启用超时，指定流程处理是否启用超时，启用超时将在时间到达后跳转至指定的处理，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLETIMEOUT = "enabletimeout";

    /**
     * 设置 启用超时，详细说明：{@link #FIELD_ENABLETIMEOUT}
     * 
     * @param enableTimeout
     * 
     */
    @JsonProperty(FIELD_ENABLETIMEOUT)
    public void setEnableTimeout(Integer enableTimeout){
        this.set(FIELD_ENABLETIMEOUT, enableTimeout);
    }
    
    /**
     * 获取 启用超时  
     * @return
     */
    @JsonIgnore
    public Integer getEnableTimeout(){
        Object objValue = this.get(FIELD_ENABLETIMEOUT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用超时 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableTimeoutDirty(){
        if(this.contains(FIELD_ENABLETIMEOUT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用超时
     */
    @JsonIgnore
    public void resetEnableTimeout(){
        this.reset(FIELD_ENABLETIMEOUT);
    }

    /**
     * 设置 启用超时，详细说明：{@link #FIELD_ENABLETIMEOUT}
     * <P>
     * 等同 {@link #setEnableTimeout}
     * @param enableTimeout
     */
    @JsonIgnore
    public PSWFProcess enabletimeout(Integer enableTimeout){
        this.setEnableTimeout(enableTimeout);
        return this;
    }

     /**
     * 设置 启用超时，详细说明：{@link #FIELD_ENABLETIMEOUT}
     * <P>
     * 等同 {@link #setEnableTimeout}
     * @param enableTimeout
     */
    @JsonIgnore
    public PSWFProcess enabletimeout(Boolean enableTimeout){
        if(enableTimeout == null){
            this.setEnableTimeout(null);
        }
        else{
            this.setEnableTimeout(enableTimeout?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>EXITSTATENAME</B>&nbsp;退出切换状态名称
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_EXITSTATENAME = "exitstatename";

    /**
     * 设置 退出切换状态名称
     * 
     * @param exitStateName
     * 
     */
    @JsonProperty(FIELD_EXITSTATENAME)
    public void setExitStateName(String exitStateName){
        this.set(FIELD_EXITSTATENAME, exitStateName);
    }
    
    /**
     * 获取 退出切换状态名称  
     * @return
     */
    @JsonIgnore
    public String getExitStateName(){
        Object objValue = this.get(FIELD_EXITSTATENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 退出切换状态名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExitStateNameDirty(){
        if(this.contains(FIELD_EXITSTATENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 退出切换状态名称
     */
    @JsonIgnore
    public void resetExitStateName(){
        this.reset(FIELD_EXITSTATENAME);
    }

    /**
     * 设置 退出切换状态名称
     * <P>
     * 等同 {@link #setExitStateName}
     * @param exitStateName
     */
    @JsonIgnore
    public PSWFProcess exitstatename(String exitStateName){
        this.setExitStateName(exitStateName);
        return this;
    }

    /**
     * <B>EXITSTATEVALUE</B>&nbsp;退出切换状态
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_EXITSTATEVALUE = "exitstatevalue";

    /**
     * 设置 退出切换状态
     * 
     * @param exitStateValue
     * 
     */
    @JsonProperty(FIELD_EXITSTATEVALUE)
    public void setExitStateValue(String exitStateValue){
        this.set(FIELD_EXITSTATEVALUE, exitStateValue);
    }
    
    /**
     * 获取 退出切换状态  
     * @return
     */
    @JsonIgnore
    public String getExitStateValue(){
        Object objValue = this.get(FIELD_EXITSTATEVALUE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 退出切换状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExitStateValueDirty(){
        if(this.contains(FIELD_EXITSTATEVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 退出切换状态
     */
    @JsonIgnore
    public void resetExitStateValue(){
        this.reset(FIELD_EXITSTATEVALUE);
    }

    /**
     * 设置 退出切换状态
     * <P>
     * 等同 {@link #setExitStateValue}
     * @param exitStateValue
     */
    @JsonIgnore
    public PSWFProcess exitstatevalue(String exitStateValue){
        this.setExitStateValue(exitStateValue);
        return this;
    }

    /**
     * <B>FORMCODENAME</B>&nbsp;表单标记
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFORMID}
     */
    public final static String FIELD_FORMCODENAME = "formcodename";

    /**
     * 设置 表单标记
     * 
     * @param formCodeName
     * 
     */
    @JsonProperty(FIELD_FORMCODENAME)
    public void setFormCodeName(String formCodeName){
        this.set(FIELD_FORMCODENAME, formCodeName);
    }
    
    /**
     * 获取 表单标记  
     * @return
     */
    @JsonIgnore
    public String getFormCodeName(){
        Object objValue = this.get(FIELD_FORMCODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表单标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFormCodeNameDirty(){
        if(this.contains(FIELD_FORMCODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表单标记
     */
    @JsonIgnore
    public void resetFormCodeName(){
        this.reset(FIELD_FORMCODENAME);
    }

    /**
     * 设置 表单标记
     * <P>
     * 等同 {@link #setFormCodeName}
     * @param formCodeName
     */
    @JsonIgnore
    public PSWFProcess formcodename(String formCodeName){
        this.setFormCodeName(formCodeName);
        return this;
    }

    /**
     * <B>HEIGHT</B>&nbsp;图形高度，指定流程处理在流程设计界面的图元高度，未定义时为【100】
     */
    public final static String FIELD_HEIGHT = "height";

    /**
     * 设置 图形高度，详细说明：{@link #FIELD_HEIGHT}
     * 
     * @param height
     * 
     */
    @JsonProperty(FIELD_HEIGHT)
    public void setHeight(Integer height){
        this.set(FIELD_HEIGHT, height);
    }
    
    /**
     * 获取 图形高度  
     * @return
     */
    @JsonIgnore
    public Integer getHeight(){
        Object objValue = this.get(FIELD_HEIGHT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 图形高度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHeightDirty(){
        if(this.contains(FIELD_HEIGHT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图形高度
     */
    @JsonIgnore
    public void resetHeight(){
        this.reset(FIELD_HEIGHT);
    }

    /**
     * 设置 图形高度，详细说明：{@link #FIELD_HEIGHT}
     * <P>
     * 等同 {@link #setHeight}
     * @param height
     */
    @JsonIgnore
    public PSWFProcess height(Integer height){
        this.setHeight(height);
        return this;
    }

    /**
     * <B>ICONPATH</B>&nbsp;图标路径，指定流程处理在流程设计界面的图元图标路径
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_ICONPATH = "iconpath";

    /**
     * 设置 图标路径，详细说明：{@link #FIELD_ICONPATH}
     * 
     * @param iconPath
     * 
     */
    @JsonProperty(FIELD_ICONPATH)
    public void setIconPath(String iconPath){
        this.set(FIELD_ICONPATH, iconPath);
    }
    
    /**
     * 获取 图标路径  
     * @return
     */
    @JsonIgnore
    public String getIconPath(){
        Object objValue = this.get(FIELD_ICONPATH);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 图标路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIconPathDirty(){
        if(this.contains(FIELD_ICONPATH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图标路径
     */
    @JsonIgnore
    public void resetIconPath(){
        this.reset(FIELD_ICONPATH);
    }

    /**
     * 设置 图标路径，详细说明：{@link #FIELD_ICONPATH}
     * <P>
     * 等同 {@link #setIconPath}
     * @param iconPath
     */
    @JsonIgnore
    public PSWFProcess iconpath(String iconPath){
        this.setIconPath(iconPath);
        return this;
    }

    /**
     * <B>LEFTPOS</B>&nbsp;左坐标，指定流程处理在流程设计界面的图元的左上角X值，未定义时为【0】
     */
    public final static String FIELD_LEFTPOS = "leftpos";

    /**
     * 设置 左坐标，详细说明：{@link #FIELD_LEFTPOS}
     * 
     * @param leftPos
     * 
     */
    @JsonProperty(FIELD_LEFTPOS)
    public void setLeftPos(Integer leftPos){
        this.set(FIELD_LEFTPOS, leftPos);
    }
    
    /**
     * 获取 左坐标  
     * @return
     */
    @JsonIgnore
    public Integer getLeftPos(){
        Object objValue = this.get(FIELD_LEFTPOS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 左坐标 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLeftPosDirty(){
        if(this.contains(FIELD_LEFTPOS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 左坐标
     */
    @JsonIgnore
    public void resetLeftPos(){
        this.reset(FIELD_LEFTPOS);
    }

    /**
     * 设置 左坐标，详细说明：{@link #FIELD_LEFTPOS}
     * <P>
     * 等同 {@link #setLeftPos}
     * @param leftPos
     */
    @JsonIgnore
    public PSWFProcess leftpos(Integer leftPos){
        this.setLeftPos(leftPos);
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
    public PSWFProcess memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MEMOFIELD</B>&nbsp;处理意见字段，指定交互流程处理的处理意见属性名称，处理意见属性值更新使用附加的形式
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_MEMOFIELD = "memofield";

    /**
     * 设置 处理意见字段，详细说明：{@link #FIELD_MEMOFIELD}
     * 
     * @param memoField
     * 
     */
    @JsonProperty(FIELD_MEMOFIELD)
    public void setMemoField(String memoField){
        this.set(FIELD_MEMOFIELD, memoField);
    }
    
    /**
     * 获取 处理意见字段  
     * @return
     */
    @JsonIgnore
    public String getMemoField(){
        Object objValue = this.get(FIELD_MEMOFIELD);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 处理意见字段 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMemoFieldDirty(){
        if(this.contains(FIELD_MEMOFIELD)){
            return true;
        }
        return false;
    }

    /**
     * 重置 处理意见字段
     */
    @JsonIgnore
    public void resetMemoField(){
        this.reset(FIELD_MEMOFIELD);
    }

    /**
     * 设置 处理意见字段，详细说明：{@link #FIELD_MEMOFIELD}
     * <P>
     * 等同 {@link #setMemoField}
     * @param memoField
     */
    @JsonIgnore
    public PSWFProcess memofield(String memoField){
        this.setMemoField(memoField);
        return this;
    }

    /**
     * <B>MOBFORMCODENAME</B>&nbsp;移动端表单标记
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOBPSDEFORMID}
     */
    public final static String FIELD_MOBFORMCODENAME = "mobformcodename";

    /**
     * 设置 移动端表单标记
     * 
     * @param mobFormCodeName
     * 
     */
    @JsonProperty(FIELD_MOBFORMCODENAME)
    public void setMobFormCodeName(String mobFormCodeName){
        this.set(FIELD_MOBFORMCODENAME, mobFormCodeName);
    }
    
    /**
     * 获取 移动端表单标记  
     * @return
     */
    @JsonIgnore
    public String getMobFormCodeName(){
        Object objValue = this.get(FIELD_MOBFORMCODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端表单标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobFormCodeNameDirty(){
        if(this.contains(FIELD_MOBFORMCODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端表单标记
     */
    @JsonIgnore
    public void resetMobFormCodeName(){
        this.reset(FIELD_MOBFORMCODENAME);
    }

    /**
     * 设置 移动端表单标记
     * <P>
     * 等同 {@link #setMobFormCodeName}
     * @param mobFormCodeName
     */
    @JsonIgnore
    public PSWFProcess mobformcodename(String mobFormCodeName){
        this.setMobFormCodeName(mobFormCodeName);
        return this;
    }

    /**
     * <B>MOBPSDEFORMID</B>&nbsp;移动端流程表单，指定交互流程处理的移动端交互表单
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEForm} 
     */
    public final static String FIELD_MOBPSDEFORMID = "mobpsdeformid";

    /**
     * 设置 移动端流程表单，详细说明：{@link #FIELD_MOBPSDEFORMID}
     * 
     * @param mobPSDEFormId
     * 
     */
    @JsonProperty(FIELD_MOBPSDEFORMID)
    public void setMobPSDEFormId(String mobPSDEFormId){
        this.set(FIELD_MOBPSDEFORMID, mobPSDEFormId);
    }
    
    /**
     * 获取 移动端流程表单  
     * @return
     */
    @JsonIgnore
    public String getMobPSDEFormId(){
        Object objValue = this.get(FIELD_MOBPSDEFORMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端流程表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobPSDEFormIdDirty(){
        if(this.contains(FIELD_MOBPSDEFORMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端流程表单
     */
    @JsonIgnore
    public void resetMobPSDEFormId(){
        this.reset(FIELD_MOBPSDEFORMID);
    }

    /**
     * 设置 移动端流程表单，详细说明：{@link #FIELD_MOBPSDEFORMID}
     * <P>
     * 等同 {@link #setMobPSDEFormId}
     * @param mobPSDEFormId
     */
    @JsonIgnore
    public PSWFProcess mobpsdeformid(String mobPSDEFormId){
        this.setMobPSDEFormId(mobPSDEFormId);
        return this;
    }

    /**
     * 设置 移动端流程表单，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMobPSDEFormId}
     * @param pSDEForm 引用对象
     */
    @JsonIgnore
    public PSWFProcess mobpsdeformid(PSDEForm pSDEForm){
        if(pSDEForm == null){
            this.setMobFormCodeName(null);
            this.setMobPSDEFormId(null);
            this.setMobPSDEFormName(null);
        }
        else{
            this.setMobFormCodeName(pSDEForm.getCodeName());
            this.setMobPSDEFormId(pSDEForm.getPSDEFormId());
            this.setMobPSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    /**
     * <B>MOBPSDEFORMNAME</B>&nbsp;移动端流程表单，指定交互流程处理的移动端交互表单
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOBPSDEFORMID}
     */
    public final static String FIELD_MOBPSDEFORMNAME = "mobpsdeformname";

    /**
     * 设置 移动端流程表单，详细说明：{@link #FIELD_MOBPSDEFORMNAME}
     * 
     * @param mobPSDEFormName
     * 
     */
    @JsonProperty(FIELD_MOBPSDEFORMNAME)
    public void setMobPSDEFormName(String mobPSDEFormName){
        this.set(FIELD_MOBPSDEFORMNAME, mobPSDEFormName);
    }
    
    /**
     * 获取 移动端流程表单  
     * @return
     */
    @JsonIgnore
    public String getMobPSDEFormName(){
        Object objValue = this.get(FIELD_MOBPSDEFORMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端流程表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobPSDEFormNameDirty(){
        if(this.contains(FIELD_MOBPSDEFORMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端流程表单
     */
    @JsonIgnore
    public void resetMobPSDEFormName(){
        this.reset(FIELD_MOBPSDEFORMNAME);
    }

    /**
     * 设置 移动端流程表单，详细说明：{@link #FIELD_MOBPSDEFORMNAME}
     * <P>
     * 等同 {@link #setMobPSDEFormName}
     * @param mobPSDEFormName
     */
    @JsonIgnore
    public PSWFProcess mobpsdeformname(String mobPSDEFormName){
        this.setMobPSDEFormName(mobPSDEFormName);
        return this;
    }

    /**
     * <B>MOBPSDEUAGROUPID</B>&nbsp;移动端附加界面行为组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEUAGroup} 
     */
    public final static String FIELD_MOBPSDEUAGROUPID = "mobpsdeuagroupid";

    /**
     * 设置 移动端附加界面行为组
     * 
     * @param mobPSDEUAGroupId
     * 
     */
    @JsonProperty(FIELD_MOBPSDEUAGROUPID)
    public void setMobPSDEUAGroupId(String mobPSDEUAGroupId){
        this.set(FIELD_MOBPSDEUAGROUPID, mobPSDEUAGroupId);
    }
    
    /**
     * 获取 移动端附加界面行为组  
     * @return
     */
    @JsonIgnore
    public String getMobPSDEUAGroupId(){
        Object objValue = this.get(FIELD_MOBPSDEUAGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端附加界面行为组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobPSDEUAGroupIdDirty(){
        if(this.contains(FIELD_MOBPSDEUAGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端附加界面行为组
     */
    @JsonIgnore
    public void resetMobPSDEUAGroupId(){
        this.reset(FIELD_MOBPSDEUAGROUPID);
    }

    /**
     * 设置 移动端附加界面行为组
     * <P>
     * 等同 {@link #setMobPSDEUAGroupId}
     * @param mobPSDEUAGroupId
     */
    @JsonIgnore
    public PSWFProcess mobpsdeuagroupid(String mobPSDEUAGroupId){
        this.setMobPSDEUAGroupId(mobPSDEUAGroupId);
        return this;
    }

    /**
     * 设置 移动端附加界面行为组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMobPSDEUAGroupId}
     * @param pSDEUAGroup 引用对象
     */
    @JsonIgnore
    public PSWFProcess mobpsdeuagroupid(PSDEUAGroup pSDEUAGroup){
        if(pSDEUAGroup == null){
            this.setMobPSDEUAGroupId(null);
            this.setMobPSDEUAGroupName(null);
            this.setMobUAGroupCodeName(null);
        }
        else{
            this.setMobPSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setMobPSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
            this.setMobUAGroupCodeName(pSDEUAGroup.getCodeName());
        }
        return this;
    }

    /**
     * <B>MOBPSDEUAGROUPNAME</B>&nbsp;移动端附加界面行为组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOBPSDEUAGROUPID}
     */
    public final static String FIELD_MOBPSDEUAGROUPNAME = "mobpsdeuagroupname";

    /**
     * 设置 移动端附加界面行为组
     * 
     * @param mobPSDEUAGroupName
     * 
     */
    @JsonProperty(FIELD_MOBPSDEUAGROUPNAME)
    public void setMobPSDEUAGroupName(String mobPSDEUAGroupName){
        this.set(FIELD_MOBPSDEUAGROUPNAME, mobPSDEUAGroupName);
    }
    
    /**
     * 获取 移动端附加界面行为组  
     * @return
     */
    @JsonIgnore
    public String getMobPSDEUAGroupName(){
        Object objValue = this.get(FIELD_MOBPSDEUAGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端附加界面行为组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobPSDEUAGroupNameDirty(){
        if(this.contains(FIELD_MOBPSDEUAGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端附加界面行为组
     */
    @JsonIgnore
    public void resetMobPSDEUAGroupName(){
        this.reset(FIELD_MOBPSDEUAGROUPNAME);
    }

    /**
     * 设置 移动端附加界面行为组
     * <P>
     * 等同 {@link #setMobPSDEUAGroupName}
     * @param mobPSDEUAGroupName
     */
    @JsonIgnore
    public PSWFProcess mobpsdeuagroupname(String mobPSDEUAGroupName){
        this.setMobPSDEUAGroupName(mobPSDEUAGroupName);
        return this;
    }

    /**
     * <B>MOBPSDEVIEWID</B>&nbsp;移动端操作视图，指定流程处理人机交互时使用的移动端端操作视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_MOBPSDEVIEWID = "mobpsdeviewid";

    /**
     * 设置 移动端操作视图，详细说明：{@link #FIELD_MOBPSDEVIEWID}
     * 
     * @param mobPSDEViewId
     * 
     */
    @JsonProperty(FIELD_MOBPSDEVIEWID)
    public void setMobPSDEViewId(String mobPSDEViewId){
        this.set(FIELD_MOBPSDEVIEWID, mobPSDEViewId);
    }
    
    /**
     * 获取 移动端操作视图  
     * @return
     */
    @JsonIgnore
    public String getMobPSDEViewId(){
        Object objValue = this.get(FIELD_MOBPSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端操作视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobPSDEViewIdDirty(){
        if(this.contains(FIELD_MOBPSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端操作视图
     */
    @JsonIgnore
    public void resetMobPSDEViewId(){
        this.reset(FIELD_MOBPSDEVIEWID);
    }

    /**
     * 设置 移动端操作视图，详细说明：{@link #FIELD_MOBPSDEVIEWID}
     * <P>
     * 等同 {@link #setMobPSDEViewId}
     * @param mobPSDEViewId
     */
    @JsonIgnore
    public PSWFProcess mobpsdeviewid(String mobPSDEViewId){
        this.setMobPSDEViewId(mobPSDEViewId);
        return this;
    }

    /**
     * 设置 移动端操作视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMobPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSWFProcess mobpsdeviewid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setMobPSDEViewId(null);
            this.setMobPSDEViewName(null);
        }
        else{
            this.setMobPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setMobPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>MOBPSDEVIEWNAME</B>&nbsp;移动端操作视图，指定流程处理人机交互时使用的移动端端操作视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOBPSDEVIEWID}
     */
    public final static String FIELD_MOBPSDEVIEWNAME = "mobpsdeviewname";

    /**
     * 设置 移动端操作视图，详细说明：{@link #FIELD_MOBPSDEVIEWNAME}
     * 
     * @param mobPSDEViewName
     * 
     */
    @JsonProperty(FIELD_MOBPSDEVIEWNAME)
    public void setMobPSDEViewName(String mobPSDEViewName){
        this.set(FIELD_MOBPSDEVIEWNAME, mobPSDEViewName);
    }
    
    /**
     * 获取 移动端操作视图  
     * @return
     */
    @JsonIgnore
    public String getMobPSDEViewName(){
        Object objValue = this.get(FIELD_MOBPSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端操作视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobPSDEViewNameDirty(){
        if(this.contains(FIELD_MOBPSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端操作视图
     */
    @JsonIgnore
    public void resetMobPSDEViewName(){
        this.reset(FIELD_MOBPSDEVIEWNAME);
    }

    /**
     * 设置 移动端操作视图，详细说明：{@link #FIELD_MOBPSDEVIEWNAME}
     * <P>
     * 等同 {@link #setMobPSDEViewName}
     * @param mobPSDEViewName
     */
    @JsonIgnore
    public PSWFProcess mobpsdeviewname(String mobPSDEViewName){
        this.setMobPSDEViewName(mobPSDEViewName);
        return this;
    }

    /**
     * <B>MOBPSDYNADEVIEWTEMPLID</B>&nbsp;移动端动态实体视图模板标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOBPSDEVIEWID}
     */
    public final static String FIELD_MOBPSDYNADEVIEWTEMPLID = "mobpsdynadeviewtemplid";

    /**
     * 设置 移动端动态实体视图模板标识
     * 
     * @param mobPSDynaDEViewTemplId
     * 
     */
    @JsonProperty(FIELD_MOBPSDYNADEVIEWTEMPLID)
    public void setMobPSDynaDEViewTemplId(String mobPSDynaDEViewTemplId){
        this.set(FIELD_MOBPSDYNADEVIEWTEMPLID, mobPSDynaDEViewTemplId);
    }
    
    /**
     * 获取 移动端动态实体视图模板标识  
     * @return
     */
    @JsonIgnore
    public String getMobPSDynaDEViewTemplId(){
        Object objValue = this.get(FIELD_MOBPSDYNADEVIEWTEMPLID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端动态实体视图模板标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobPSDynaDEViewTemplIdDirty(){
        if(this.contains(FIELD_MOBPSDYNADEVIEWTEMPLID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端动态实体视图模板标识
     */
    @JsonIgnore
    public void resetMobPSDynaDEViewTemplId(){
        this.reset(FIELD_MOBPSDYNADEVIEWTEMPLID);
    }

    /**
     * 设置 移动端动态实体视图模板标识
     * <P>
     * 等同 {@link #setMobPSDynaDEViewTemplId}
     * @param mobPSDynaDEViewTemplId
     */
    @JsonIgnore
    public PSWFProcess mobpsdynadeviewtemplid(String mobPSDynaDEViewTemplId){
        this.setMobPSDynaDEViewTemplId(mobPSDynaDEViewTemplId);
        return this;
    }

    /**
     * <B>MOBUAGROUPCODENAME</B>&nbsp;移动端附加界面行为组代码标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOBPSDEUAGROUPID}
     */
    public final static String FIELD_MOBUAGROUPCODENAME = "mobuagroupcodename";

    /**
     * 设置 移动端附加界面行为组代码标识
     * 
     * @param mobUAGroupCodeName
     * 
     */
    @JsonProperty(FIELD_MOBUAGROUPCODENAME)
    public void setMobUAGroupCodeName(String mobUAGroupCodeName){
        this.set(FIELD_MOBUAGROUPCODENAME, mobUAGroupCodeName);
    }
    
    /**
     * 获取 移动端附加界面行为组代码标识  
     * @return
     */
    @JsonIgnore
    public String getMobUAGroupCodeName(){
        Object objValue = this.get(FIELD_MOBUAGROUPCODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端附加界面行为组代码标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobUAGroupCodeNameDirty(){
        if(this.contains(FIELD_MOBUAGROUPCODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端附加界面行为组代码标识
     */
    @JsonIgnore
    public void resetMobUAGroupCodeName(){
        this.reset(FIELD_MOBUAGROUPCODENAME);
    }

    /**
     * 设置 移动端附加界面行为组代码标识
     * <P>
     * 等同 {@link #setMobUAGroupCodeName}
     * @param mobUAGroupCodeName
     */
    @JsonIgnore
    public PSWFProcess mobuagroupcodename(String mobUAGroupCodeName){
        this.setMobUAGroupCodeName(mobUAGroupCodeName);
        return this;
    }

    /**
     * <B>MOBUTIL2FORMCODENAME</B>&nbsp;移动端功能2表单标记
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOBUTIL2PSDEFORMID}
     */
    public final static String FIELD_MOBUTIL2FORMCODENAME = "mobutil2formcodename";

    /**
     * 设置 移动端功能2表单标记
     * 
     * @param mobUtil2FormCodeName
     * 
     */
    @JsonProperty(FIELD_MOBUTIL2FORMCODENAME)
    public void setMobUtil2FormCodeName(String mobUtil2FormCodeName){
        this.set(FIELD_MOBUTIL2FORMCODENAME, mobUtil2FormCodeName);
    }
    
    /**
     * 获取 移动端功能2表单标记  
     * @return
     */
    @JsonIgnore
    public String getMobUtil2FormCodeName(){
        Object objValue = this.get(FIELD_MOBUTIL2FORMCODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端功能2表单标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobUtil2FormCodeNameDirty(){
        if(this.contains(FIELD_MOBUTIL2FORMCODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端功能2表单标记
     */
    @JsonIgnore
    public void resetMobUtil2FormCodeName(){
        this.reset(FIELD_MOBUTIL2FORMCODENAME);
    }

    /**
     * 设置 移动端功能2表单标记
     * <P>
     * 等同 {@link #setMobUtil2FormCodeName}
     * @param mobUtil2FormCodeName
     */
    @JsonIgnore
    public PSWFProcess mobutil2formcodename(String mobUtil2FormCodeName){
        this.setMobUtil2FormCodeName(mobUtil2FormCodeName);
        return this;
    }

    /**
     * <B>MOBUTIL2PSDEFORMID</B>&nbsp;移动端后加签表单
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEForm} 
     */
    public final static String FIELD_MOBUTIL2PSDEFORMID = "mobutil2psdeformid";

    /**
     * 设置 移动端后加签表单
     * 
     * @param mobUtil2PSDEFormId
     * 
     */
    @JsonProperty(FIELD_MOBUTIL2PSDEFORMID)
    public void setMobUtil2PSDEFormId(String mobUtil2PSDEFormId){
        this.set(FIELD_MOBUTIL2PSDEFORMID, mobUtil2PSDEFormId);
    }
    
    /**
     * 获取 移动端后加签表单  
     * @return
     */
    @JsonIgnore
    public String getMobUtil2PSDEFormId(){
        Object objValue = this.get(FIELD_MOBUTIL2PSDEFORMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端后加签表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobUtil2PSDEFormIdDirty(){
        if(this.contains(FIELD_MOBUTIL2PSDEFORMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端后加签表单
     */
    @JsonIgnore
    public void resetMobUtil2PSDEFormId(){
        this.reset(FIELD_MOBUTIL2PSDEFORMID);
    }

    /**
     * 设置 移动端后加签表单
     * <P>
     * 等同 {@link #setMobUtil2PSDEFormId}
     * @param mobUtil2PSDEFormId
     */
    @JsonIgnore
    public PSWFProcess mobutil2psdeformid(String mobUtil2PSDEFormId){
        this.setMobUtil2PSDEFormId(mobUtil2PSDEFormId);
        return this;
    }

    /**
     * 设置 移动端后加签表单，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMobUtil2PSDEFormId}
     * @param pSDEForm 引用对象
     */
    @JsonIgnore
    public PSWFProcess mobutil2psdeformid(PSDEForm pSDEForm){
        if(pSDEForm == null){
            this.setMobUtil2FormCodeName(null);
            this.setMobUtil2PSDEFormId(null);
            this.setMobUtil2PSDEFormName(null);
        }
        else{
            this.setMobUtil2FormCodeName(pSDEForm.getCodeName());
            this.setMobUtil2PSDEFormId(pSDEForm.getPSDEFormId());
            this.setMobUtil2PSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    /**
     * <B>MOBUTIL2PSDEFORMNAME</B>&nbsp;移动端后加签表单
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOBUTIL2PSDEFORMID}
     */
    public final static String FIELD_MOBUTIL2PSDEFORMNAME = "mobutil2psdeformname";

    /**
     * 设置 移动端后加签表单
     * 
     * @param mobUtil2PSDEFormName
     * 
     */
    @JsonProperty(FIELD_MOBUTIL2PSDEFORMNAME)
    public void setMobUtil2PSDEFormName(String mobUtil2PSDEFormName){
        this.set(FIELD_MOBUTIL2PSDEFORMNAME, mobUtil2PSDEFormName);
    }
    
    /**
     * 获取 移动端后加签表单  
     * @return
     */
    @JsonIgnore
    public String getMobUtil2PSDEFormName(){
        Object objValue = this.get(FIELD_MOBUTIL2PSDEFORMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端后加签表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobUtil2PSDEFormNameDirty(){
        if(this.contains(FIELD_MOBUTIL2PSDEFORMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端后加签表单
     */
    @JsonIgnore
    public void resetMobUtil2PSDEFormName(){
        this.reset(FIELD_MOBUTIL2PSDEFORMNAME);
    }

    /**
     * 设置 移动端后加签表单
     * <P>
     * 等同 {@link #setMobUtil2PSDEFormName}
     * @param mobUtil2PSDEFormName
     */
    @JsonIgnore
    public PSWFProcess mobutil2psdeformname(String mobUtil2PSDEFormName){
        this.setMobUtil2PSDEFormName(mobUtil2PSDEFormName);
        return this;
    }

    /**
     * <B>MOBUTIL3FORMCODENAME</B>&nbsp;移动端功能3表单标记
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOBUTIL3PSDEFORMID}
     */
    public final static String FIELD_MOBUTIL3FORMCODENAME = "mobutil3formcodename";

    /**
     * 设置 移动端功能3表单标记
     * 
     * @param mobUtil3FormCodeName
     * 
     */
    @JsonProperty(FIELD_MOBUTIL3FORMCODENAME)
    public void setMobUtil3FormCodeName(String mobUtil3FormCodeName){
        this.set(FIELD_MOBUTIL3FORMCODENAME, mobUtil3FormCodeName);
    }
    
    /**
     * 获取 移动端功能3表单标记  
     * @return
     */
    @JsonIgnore
    public String getMobUtil3FormCodeName(){
        Object objValue = this.get(FIELD_MOBUTIL3FORMCODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端功能3表单标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobUtil3FormCodeNameDirty(){
        if(this.contains(FIELD_MOBUTIL3FORMCODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端功能3表单标记
     */
    @JsonIgnore
    public void resetMobUtil3FormCodeName(){
        this.reset(FIELD_MOBUTIL3FORMCODENAME);
    }

    /**
     * 设置 移动端功能3表单标记
     * <P>
     * 等同 {@link #setMobUtil3FormCodeName}
     * @param mobUtil3FormCodeName
     */
    @JsonIgnore
    public PSWFProcess mobutil3formcodename(String mobUtil3FormCodeName){
        this.setMobUtil3FormCodeName(mobUtil3FormCodeName);
        return this;
    }

    /**
     * <B>MOBUTIL3PSDEFORMID</B>&nbsp;移动端转办表单
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEForm} 
     */
    public final static String FIELD_MOBUTIL3PSDEFORMID = "mobutil3psdeformid";

    /**
     * 设置 移动端转办表单
     * 
     * @param mobUtil3PSDEFormId
     * 
     */
    @JsonProperty(FIELD_MOBUTIL3PSDEFORMID)
    public void setMobUtil3PSDEFormId(String mobUtil3PSDEFormId){
        this.set(FIELD_MOBUTIL3PSDEFORMID, mobUtil3PSDEFormId);
    }
    
    /**
     * 获取 移动端转办表单  
     * @return
     */
    @JsonIgnore
    public String getMobUtil3PSDEFormId(){
        Object objValue = this.get(FIELD_MOBUTIL3PSDEFORMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端转办表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobUtil3PSDEFormIdDirty(){
        if(this.contains(FIELD_MOBUTIL3PSDEFORMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端转办表单
     */
    @JsonIgnore
    public void resetMobUtil3PSDEFormId(){
        this.reset(FIELD_MOBUTIL3PSDEFORMID);
    }

    /**
     * 设置 移动端转办表单
     * <P>
     * 等同 {@link #setMobUtil3PSDEFormId}
     * @param mobUtil3PSDEFormId
     */
    @JsonIgnore
    public PSWFProcess mobutil3psdeformid(String mobUtil3PSDEFormId){
        this.setMobUtil3PSDEFormId(mobUtil3PSDEFormId);
        return this;
    }

    /**
     * 设置 移动端转办表单，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMobUtil3PSDEFormId}
     * @param pSDEForm 引用对象
     */
    @JsonIgnore
    public PSWFProcess mobutil3psdeformid(PSDEForm pSDEForm){
        if(pSDEForm == null){
            this.setMobUtil3FormCodeName(null);
            this.setMobUtil3PSDEFormId(null);
            this.setMobUtil3PSDEFormName(null);
        }
        else{
            this.setMobUtil3FormCodeName(pSDEForm.getCodeName());
            this.setMobUtil3PSDEFormId(pSDEForm.getPSDEFormId());
            this.setMobUtil3PSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    /**
     * <B>MOBUTIL3PSDEFORMNAME</B>&nbsp;移动端转办表单
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOBUTIL3PSDEFORMID}
     */
    public final static String FIELD_MOBUTIL3PSDEFORMNAME = "mobutil3psdeformname";

    /**
     * 设置 移动端转办表单
     * 
     * @param mobUtil3PSDEFormName
     * 
     */
    @JsonProperty(FIELD_MOBUTIL3PSDEFORMNAME)
    public void setMobUtil3PSDEFormName(String mobUtil3PSDEFormName){
        this.set(FIELD_MOBUTIL3PSDEFORMNAME, mobUtil3PSDEFormName);
    }
    
    /**
     * 获取 移动端转办表单  
     * @return
     */
    @JsonIgnore
    public String getMobUtil3PSDEFormName(){
        Object objValue = this.get(FIELD_MOBUTIL3PSDEFORMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端转办表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobUtil3PSDEFormNameDirty(){
        if(this.contains(FIELD_MOBUTIL3PSDEFORMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端转办表单
     */
    @JsonIgnore
    public void resetMobUtil3PSDEFormName(){
        this.reset(FIELD_MOBUTIL3PSDEFORMNAME);
    }

    /**
     * 设置 移动端转办表单
     * <P>
     * 等同 {@link #setMobUtil3PSDEFormName}
     * @param mobUtil3PSDEFormName
     */
    @JsonIgnore
    public PSWFProcess mobutil3psdeformname(String mobUtil3PSDEFormName){
        this.setMobUtil3PSDEFormName(mobUtil3PSDEFormName);
        return this;
    }

    /**
     * <B>MOBUTIL4FORMCODENAME</B>&nbsp;移动端功能4表单标记
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOBUTIL4PSDEFORMID}
     */
    public final static String FIELD_MOBUTIL4FORMCODENAME = "mobutil4formcodename";

    /**
     * 设置 移动端功能4表单标记
     * 
     * @param mobUtil4FormCodeName
     * 
     */
    @JsonProperty(FIELD_MOBUTIL4FORMCODENAME)
    public void setMobUtil4FormCodeName(String mobUtil4FormCodeName){
        this.set(FIELD_MOBUTIL4FORMCODENAME, mobUtil4FormCodeName);
    }
    
    /**
     * 获取 移动端功能4表单标记  
     * @return
     */
    @JsonIgnore
    public String getMobUtil4FormCodeName(){
        Object objValue = this.get(FIELD_MOBUTIL4FORMCODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端功能4表单标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobUtil4FormCodeNameDirty(){
        if(this.contains(FIELD_MOBUTIL4FORMCODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端功能4表单标记
     */
    @JsonIgnore
    public void resetMobUtil4FormCodeName(){
        this.reset(FIELD_MOBUTIL4FORMCODENAME);
    }

    /**
     * 设置 移动端功能4表单标记
     * <P>
     * 等同 {@link #setMobUtil4FormCodeName}
     * @param mobUtil4FormCodeName
     */
    @JsonIgnore
    public PSWFProcess mobutil4formcodename(String mobUtil4FormCodeName){
        this.setMobUtil4FormCodeName(mobUtil4FormCodeName);
        return this;
    }

    /**
     * <B>MOBUTIL4PSDEFORMID</B>&nbsp;移动端功能表单4
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEForm} 
     */
    public final static String FIELD_MOBUTIL4PSDEFORMID = "mobutil4psdeformid";

    /**
     * 设置 移动端功能表单4
     * 
     * @param mobUtil4PSDEFormId
     * 
     */
    @JsonProperty(FIELD_MOBUTIL4PSDEFORMID)
    public void setMobUtil4PSDEFormId(String mobUtil4PSDEFormId){
        this.set(FIELD_MOBUTIL4PSDEFORMID, mobUtil4PSDEFormId);
    }
    
    /**
     * 获取 移动端功能表单4  
     * @return
     */
    @JsonIgnore
    public String getMobUtil4PSDEFormId(){
        Object objValue = this.get(FIELD_MOBUTIL4PSDEFORMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端功能表单4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobUtil4PSDEFormIdDirty(){
        if(this.contains(FIELD_MOBUTIL4PSDEFORMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端功能表单4
     */
    @JsonIgnore
    public void resetMobUtil4PSDEFormId(){
        this.reset(FIELD_MOBUTIL4PSDEFORMID);
    }

    /**
     * 设置 移动端功能表单4
     * <P>
     * 等同 {@link #setMobUtil4PSDEFormId}
     * @param mobUtil4PSDEFormId
     */
    @JsonIgnore
    public PSWFProcess mobutil4psdeformid(String mobUtil4PSDEFormId){
        this.setMobUtil4PSDEFormId(mobUtil4PSDEFormId);
        return this;
    }

    /**
     * 设置 移动端功能表单4，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMobUtil4PSDEFormId}
     * @param pSDEForm 引用对象
     */
    @JsonIgnore
    public PSWFProcess mobutil4psdeformid(PSDEForm pSDEForm){
        if(pSDEForm == null){
            this.setMobUtil4FormCodeName(null);
            this.setMobUtil4PSDEFormId(null);
            this.setMobUtil4PSDEFormName(null);
        }
        else{
            this.setMobUtil4FormCodeName(pSDEForm.getCodeName());
            this.setMobUtil4PSDEFormId(pSDEForm.getPSDEFormId());
            this.setMobUtil4PSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    /**
     * <B>MOBUTIL4PSDEFORMNAME</B>&nbsp;移动端功能表单4
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOBUTIL4PSDEFORMID}
     */
    public final static String FIELD_MOBUTIL4PSDEFORMNAME = "mobutil4psdeformname";

    /**
     * 设置 移动端功能表单4
     * 
     * @param mobUtil4PSDEFormName
     * 
     */
    @JsonProperty(FIELD_MOBUTIL4PSDEFORMNAME)
    public void setMobUtil4PSDEFormName(String mobUtil4PSDEFormName){
        this.set(FIELD_MOBUTIL4PSDEFORMNAME, mobUtil4PSDEFormName);
    }
    
    /**
     * 获取 移动端功能表单4  
     * @return
     */
    @JsonIgnore
    public String getMobUtil4PSDEFormName(){
        Object objValue = this.get(FIELD_MOBUTIL4PSDEFORMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端功能表单4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobUtil4PSDEFormNameDirty(){
        if(this.contains(FIELD_MOBUTIL4PSDEFORMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端功能表单4
     */
    @JsonIgnore
    public void resetMobUtil4PSDEFormName(){
        this.reset(FIELD_MOBUTIL4PSDEFORMNAME);
    }

    /**
     * 设置 移动端功能表单4
     * <P>
     * 等同 {@link #setMobUtil4PSDEFormName}
     * @param mobUtil4PSDEFormName
     */
    @JsonIgnore
    public PSWFProcess mobutil4psdeformname(String mobUtil4PSDEFormName){
        this.setMobUtil4PSDEFormName(mobUtil4PSDEFormName);
        return this;
    }

    /**
     * <B>MOBUTIL5FORMCODENAME</B>&nbsp;移动端功能5表单标记
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOBUTIL5PSDEFORMID}
     */
    public final static String FIELD_MOBUTIL5FORMCODENAME = "mobutil5formcodename";

    /**
     * 设置 移动端功能5表单标记
     * 
     * @param mobUtil5FormCodeName
     * 
     */
    @JsonProperty(FIELD_MOBUTIL5FORMCODENAME)
    public void setMobUtil5FormCodeName(String mobUtil5FormCodeName){
        this.set(FIELD_MOBUTIL5FORMCODENAME, mobUtil5FormCodeName);
    }
    
    /**
     * 获取 移动端功能5表单标记  
     * @return
     */
    @JsonIgnore
    public String getMobUtil5FormCodeName(){
        Object objValue = this.get(FIELD_MOBUTIL5FORMCODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端功能5表单标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobUtil5FormCodeNameDirty(){
        if(this.contains(FIELD_MOBUTIL5FORMCODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端功能5表单标记
     */
    @JsonIgnore
    public void resetMobUtil5FormCodeName(){
        this.reset(FIELD_MOBUTIL5FORMCODENAME);
    }

    /**
     * 设置 移动端功能5表单标记
     * <P>
     * 等同 {@link #setMobUtil5FormCodeName}
     * @param mobUtil5FormCodeName
     */
    @JsonIgnore
    public PSWFProcess mobutil5formcodename(String mobUtil5FormCodeName){
        this.setMobUtil5FormCodeName(mobUtil5FormCodeName);
        return this;
    }

    /**
     * <B>MOBUTIL5PSDEFORMID</B>&nbsp;移动端功能表单5
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEForm} 
     */
    public final static String FIELD_MOBUTIL5PSDEFORMID = "mobutil5psdeformid";

    /**
     * 设置 移动端功能表单5
     * 
     * @param mobUtil5PSDEFormId
     * 
     */
    @JsonProperty(FIELD_MOBUTIL5PSDEFORMID)
    public void setMobUtil5PSDEFormId(String mobUtil5PSDEFormId){
        this.set(FIELD_MOBUTIL5PSDEFORMID, mobUtil5PSDEFormId);
    }
    
    /**
     * 获取 移动端功能表单5  
     * @return
     */
    @JsonIgnore
    public String getMobUtil5PSDEFormId(){
        Object objValue = this.get(FIELD_MOBUTIL5PSDEFORMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端功能表单5 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobUtil5PSDEFormIdDirty(){
        if(this.contains(FIELD_MOBUTIL5PSDEFORMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端功能表单5
     */
    @JsonIgnore
    public void resetMobUtil5PSDEFormId(){
        this.reset(FIELD_MOBUTIL5PSDEFORMID);
    }

    /**
     * 设置 移动端功能表单5
     * <P>
     * 等同 {@link #setMobUtil5PSDEFormId}
     * @param mobUtil5PSDEFormId
     */
    @JsonIgnore
    public PSWFProcess mobutil5psdeformid(String mobUtil5PSDEFormId){
        this.setMobUtil5PSDEFormId(mobUtil5PSDEFormId);
        return this;
    }

    /**
     * 设置 移动端功能表单5，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMobUtil5PSDEFormId}
     * @param pSDEForm 引用对象
     */
    @JsonIgnore
    public PSWFProcess mobutil5psdeformid(PSDEForm pSDEForm){
        if(pSDEForm == null){
            this.setMobUtil5FormCodeName(null);
            this.setMobUtil5PSDEFormId(null);
            this.setMobUtil5PSDEFormName(null);
        }
        else{
            this.setMobUtil5FormCodeName(pSDEForm.getCodeName());
            this.setMobUtil5PSDEFormId(pSDEForm.getPSDEFormId());
            this.setMobUtil5PSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    /**
     * <B>MOBUTIL5PSDEFORMNAME</B>&nbsp;移动端功能表单5
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOBUTIL5PSDEFORMID}
     */
    public final static String FIELD_MOBUTIL5PSDEFORMNAME = "mobutil5psdeformname";

    /**
     * 设置 移动端功能表单5
     * 
     * @param mobUtil5PSDEFormName
     * 
     */
    @JsonProperty(FIELD_MOBUTIL5PSDEFORMNAME)
    public void setMobUtil5PSDEFormName(String mobUtil5PSDEFormName){
        this.set(FIELD_MOBUTIL5PSDEFORMNAME, mobUtil5PSDEFormName);
    }
    
    /**
     * 获取 移动端功能表单5  
     * @return
     */
    @JsonIgnore
    public String getMobUtil5PSDEFormName(){
        Object objValue = this.get(FIELD_MOBUTIL5PSDEFORMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端功能表单5 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobUtil5PSDEFormNameDirty(){
        if(this.contains(FIELD_MOBUTIL5PSDEFORMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端功能表单5
     */
    @JsonIgnore
    public void resetMobUtil5PSDEFormName(){
        this.reset(FIELD_MOBUTIL5PSDEFORMNAME);
    }

    /**
     * 设置 移动端功能表单5
     * <P>
     * 等同 {@link #setMobUtil5PSDEFormName}
     * @param mobUtil5PSDEFormName
     */
    @JsonIgnore
    public PSWFProcess mobutil5psdeformname(String mobUtil5PSDEFormName){
        this.setMobUtil5PSDEFormName(mobUtil5PSDEFormName);
        return this;
    }

    /**
     * <B>MOBUTILFORMCODENAME</B>&nbsp;移动端功能表单标记
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOBUTILPSDEFORMID}
     */
    public final static String FIELD_MOBUTILFORMCODENAME = "mobutilformcodename";

    /**
     * 设置 移动端功能表单标记
     * 
     * @param mobUtilFormCodeName
     * 
     */
    @JsonProperty(FIELD_MOBUTILFORMCODENAME)
    public void setMobUtilFormCodeName(String mobUtilFormCodeName){
        this.set(FIELD_MOBUTILFORMCODENAME, mobUtilFormCodeName);
    }
    
    /**
     * 获取 移动端功能表单标记  
     * @return
     */
    @JsonIgnore
    public String getMobUtilFormCodeName(){
        Object objValue = this.get(FIELD_MOBUTILFORMCODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端功能表单标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobUtilFormCodeNameDirty(){
        if(this.contains(FIELD_MOBUTILFORMCODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端功能表单标记
     */
    @JsonIgnore
    public void resetMobUtilFormCodeName(){
        this.reset(FIELD_MOBUTILFORMCODENAME);
    }

    /**
     * 设置 移动端功能表单标记
     * <P>
     * 等同 {@link #setMobUtilFormCodeName}
     * @param mobUtilFormCodeName
     */
    @JsonIgnore
    public PSWFProcess mobutilformcodename(String mobUtilFormCodeName){
        this.setMobUtilFormCodeName(mobUtilFormCodeName);
        return this;
    }

    /**
     * <B>MOBUTILPSDEFORMID</B>&nbsp;移动端前加签表单
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEForm} 
     */
    public final static String FIELD_MOBUTILPSDEFORMID = "mobutilpsdeformid";

    /**
     * 设置 移动端前加签表单
     * 
     * @param mobUtilPSDEFormId
     * 
     */
    @JsonProperty(FIELD_MOBUTILPSDEFORMID)
    public void setMobUtilPSDEFormId(String mobUtilPSDEFormId){
        this.set(FIELD_MOBUTILPSDEFORMID, mobUtilPSDEFormId);
    }
    
    /**
     * 获取 移动端前加签表单  
     * @return
     */
    @JsonIgnore
    public String getMobUtilPSDEFormId(){
        Object objValue = this.get(FIELD_MOBUTILPSDEFORMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端前加签表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobUtilPSDEFormIdDirty(){
        if(this.contains(FIELD_MOBUTILPSDEFORMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端前加签表单
     */
    @JsonIgnore
    public void resetMobUtilPSDEFormId(){
        this.reset(FIELD_MOBUTILPSDEFORMID);
    }

    /**
     * 设置 移动端前加签表单
     * <P>
     * 等同 {@link #setMobUtilPSDEFormId}
     * @param mobUtilPSDEFormId
     */
    @JsonIgnore
    public PSWFProcess mobutilpsdeformid(String mobUtilPSDEFormId){
        this.setMobUtilPSDEFormId(mobUtilPSDEFormId);
        return this;
    }

    /**
     * 设置 移动端前加签表单，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMobUtilPSDEFormId}
     * @param pSDEForm 引用对象
     */
    @JsonIgnore
    public PSWFProcess mobutilpsdeformid(PSDEForm pSDEForm){
        if(pSDEForm == null){
            this.setMobUtilFormCodeName(null);
            this.setMobUtilPSDEFormId(null);
            this.setMobUtilPSDEFormName(null);
        }
        else{
            this.setMobUtilFormCodeName(pSDEForm.getCodeName());
            this.setMobUtilPSDEFormId(pSDEForm.getPSDEFormId());
            this.setMobUtilPSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    /**
     * <B>MOBUTILPSDEFORMNAME</B>&nbsp;移动端前加签表单
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOBUTILPSDEFORMID}
     */
    public final static String FIELD_MOBUTILPSDEFORMNAME = "mobutilpsdeformname";

    /**
     * 设置 移动端前加签表单
     * 
     * @param mobUtilPSDEFormName
     * 
     */
    @JsonProperty(FIELD_MOBUTILPSDEFORMNAME)
    public void setMobUtilPSDEFormName(String mobUtilPSDEFormName){
        this.set(FIELD_MOBUTILPSDEFORMNAME, mobUtilPSDEFormName);
    }
    
    /**
     * 获取 移动端前加签表单  
     * @return
     */
    @JsonIgnore
    public String getMobUtilPSDEFormName(){
        Object objValue = this.get(FIELD_MOBUTILPSDEFORMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端前加签表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobUtilPSDEFormNameDirty(){
        if(this.contains(FIELD_MOBUTILPSDEFORMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端前加签表单
     */
    @JsonIgnore
    public void resetMobUtilPSDEFormName(){
        this.reset(FIELD_MOBUTILPSDEFORMNAME);
    }

    /**
     * 设置 移动端前加签表单
     * <P>
     * 等同 {@link #setMobUtilPSDEFormName}
     * @param mobUtilPSDEFormName
     */
    @JsonIgnore
    public PSWFProcess mobutilpsdeformname(String mobUtilPSDEFormName){
        this.setMobUtilPSDEFormName(mobUtilPSDEFormName);
        return this;
    }

    /**
     * <B>MOBWFEDITVIEWTYPE</B>&nbsp;移动端流程编辑视图类型，指定流程处理使用的移动端流程编辑视图类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEMobWFEditViewType} 
     */
    public final static String FIELD_MOBWFEDITVIEWTYPE = "mobwfeditviewtype";

    /**
     * 设置 移动端流程编辑视图类型，详细说明：{@link #FIELD_MOBWFEDITVIEWTYPE}
     * 
     * @param mobWFEditViewType
     * 
     */
    @JsonProperty(FIELD_MOBWFEDITVIEWTYPE)
    public void setMobWFEditViewType(String mobWFEditViewType){
        this.set(FIELD_MOBWFEDITVIEWTYPE, mobWFEditViewType);
    }
    
    /**
     * 获取 移动端流程编辑视图类型  
     * @return
     */
    @JsonIgnore
    public String getMobWFEditViewType(){
        Object objValue = this.get(FIELD_MOBWFEDITVIEWTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端流程编辑视图类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobWFEditViewTypeDirty(){
        if(this.contains(FIELD_MOBWFEDITVIEWTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端流程编辑视图类型
     */
    @JsonIgnore
    public void resetMobWFEditViewType(){
        this.reset(FIELD_MOBWFEDITVIEWTYPE);
    }

    /**
     * 设置 移动端流程编辑视图类型，详细说明：{@link #FIELD_MOBWFEDITVIEWTYPE}
     * <P>
     * 等同 {@link #setMobWFEditViewType}
     * @param mobWFEditViewType
     */
    @JsonIgnore
    public PSWFProcess mobwfeditviewtype(String mobWFEditViewType){
        this.setMobWFEditViewType(mobWFEditViewType);
        return this;
    }

     /**
     * 设置 移动端流程编辑视图类型，详细说明：{@link #FIELD_MOBWFEDITVIEWTYPE}
     * <P>
     * 等同 {@link #setMobWFEditViewType}
     * @param mobWFEditViewType
     */
    @JsonIgnore
    public PSWFProcess mobwfeditviewtype(net.ibizsys.psmodel.core.util.PSModelEnums.DEMobWFEditViewType mobWFEditViewType){
        if(mobWFEditViewType == null){
            this.setMobWFEditViewType(null);
        }
        else{
            this.setMobWFEditViewType(mobWFEditViewType.value);
        }
        return this;
    }

    /**
     * <B>MODELID</B>&nbsp;模型标识
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_MODELID = "modelid";

    /**
     * 设置 模型标识
     * 
     * @param modelId
     * 
     */
    @JsonProperty(FIELD_MODELID)
    public void setModelId(String modelId){
        this.set(FIELD_MODELID, modelId);
    }
    
    /**
     * 获取 模型标识  
     * @return
     */
    @JsonIgnore
    public String getModelId(){
        Object objValue = this.get(FIELD_MODELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模型标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isModelIdDirty(){
        if(this.contains(FIELD_MODELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模型标识
     */
    @JsonIgnore
    public void resetModelId(){
        this.reset(FIELD_MODELID);
    }

    /**
     * 设置 模型标识
     * <P>
     * 等同 {@link #setModelId}
     * @param modelId
     */
    @JsonIgnore
    public PSWFProcess modelid(String modelId){
        this.setModelId(modelId);
        return this;
    }

    /**
     * <B>MSGTYPE</B>&nbsp;通知消息类型，指定交互流程处理发送通知的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.InfomMsgType} 
     */
    public final static String FIELD_MSGTYPE = "msgtype";

    /**
     * 设置 通知消息类型，详细说明：{@link #FIELD_MSGTYPE}
     * 
     * @param msgType
     * 
     */
    @JsonProperty(FIELD_MSGTYPE)
    public void setMsgType(Integer msgType){
        this.set(FIELD_MSGTYPE, msgType);
    }
    
    /**
     * 获取 通知消息类型  
     * @return
     */
    @JsonIgnore
    public Integer getMsgType(){
        Object objValue = this.get(FIELD_MSGTYPE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 通知消息类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMsgTypeDirty(){
        if(this.contains(FIELD_MSGTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 通知消息类型
     */
    @JsonIgnore
    public void resetMsgType(){
        this.reset(FIELD_MSGTYPE);
    }

    /**
     * 设置 通知消息类型，详细说明：{@link #FIELD_MSGTYPE}
     * <P>
     * 等同 {@link #setMsgType}
     * @param msgType
     */
    @JsonIgnore
    public PSWFProcess msgtype(Integer msgType){
        this.setMsgType(msgType);
        return this;
    }

     /**
     * 设置 通知消息类型，详细说明：{@link #FIELD_MSGTYPE}
     * <P>
     * 等同 {@link #setMsgType}
     * @param msgType
     */
    @JsonIgnore
    public PSWFProcess msgtype(net.ibizsys.psmodel.core.util.PSModelEnums.InfomMsgType[] msgType){
        if(msgType == null || msgType.length == 0){
            this.setMsgType(null);
        }
        else{
            int _value = 0;
            for(net.ibizsys.psmodel.core.util.PSModelEnums.InfomMsgType _item : msgType){
                _value |= _item.value;
            }
            this.setMsgType(_value);
        }
        return this;
    }

    /**
     * <B>MULTIINSTMODE</B>&nbsp;多实例模式，指定流程处理的多实例模式，未定义时为【无】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.WFProcMultiInstMode} 
     */
    public final static String FIELD_MULTIINSTMODE = "multiinstmode";

    /**
     * 设置 多实例模式，详细说明：{@link #FIELD_MULTIINSTMODE}
     * 
     * @param multiInstMode
     * 
     */
    @JsonProperty(FIELD_MULTIINSTMODE)
    public void setMultiInstMode(String multiInstMode){
        this.set(FIELD_MULTIINSTMODE, multiInstMode);
    }
    
    /**
     * 获取 多实例模式  
     * @return
     */
    @JsonIgnore
    public String getMultiInstMode(){
        Object objValue = this.get(FIELD_MULTIINSTMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 多实例模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMultiInstModeDirty(){
        if(this.contains(FIELD_MULTIINSTMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 多实例模式
     */
    @JsonIgnore
    public void resetMultiInstMode(){
        this.reset(FIELD_MULTIINSTMODE);
    }

    /**
     * 设置 多实例模式，详细说明：{@link #FIELD_MULTIINSTMODE}
     * <P>
     * 等同 {@link #setMultiInstMode}
     * @param multiInstMode
     */
    @JsonIgnore
    public PSWFProcess multiinstmode(String multiInstMode){
        this.setMultiInstMode(multiInstMode);
        return this;
    }

     /**
     * 设置 多实例模式，详细说明：{@link #FIELD_MULTIINSTMODE}
     * <P>
     * 等同 {@link #setMultiInstMode}
     * @param multiInstMode
     */
    @JsonIgnore
    public PSWFProcess multiinstmode(net.ibizsys.psmodel.core.util.PSModelEnums.WFProcMultiInstMode multiInstMode){
        if(multiInstMode == null){
            this.setMultiInstMode(null);
        }
        else{
            this.setMultiInstMode(multiInstMode.value);
        }
        return this;
    }

    /**
     * <B>NAMEPSLANRESID</B>&nbsp;名称语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_NAMEPSLANRESID = "namepslanresid";

    /**
     * 设置 名称语言资源
     * 
     * @param namePSLanResId
     * 
     */
    @JsonProperty(FIELD_NAMEPSLANRESID)
    public void setNamePSLanResId(String namePSLanResId){
        this.set(FIELD_NAMEPSLANRESID, namePSLanResId);
    }
    
    /**
     * 获取 名称语言资源  
     * @return
     */
    @JsonIgnore
    public String getNamePSLanResId(){
        Object objValue = this.get(FIELD_NAMEPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 名称语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNamePSLanResIdDirty(){
        if(this.contains(FIELD_NAMEPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 名称语言资源
     */
    @JsonIgnore
    public void resetNamePSLanResId(){
        this.reset(FIELD_NAMEPSLANRESID);
    }

    /**
     * 设置 名称语言资源
     * <P>
     * 等同 {@link #setNamePSLanResId}
     * @param namePSLanResId
     */
    @JsonIgnore
    public PSWFProcess namepslanresid(String namePSLanResId){
        this.setNamePSLanResId(namePSLanResId);
        return this;
    }

    /**
     * 设置 名称语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNamePSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSWFProcess namepslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setNamePSLanResId(null);
            this.setNamePSLanResName(null);
        }
        else{
            this.setNamePSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setNamePSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>NAMEPSLANRESNAME</B>&nbsp;名称语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NAMEPSLANRESID}
     */
    public final static String FIELD_NAMEPSLANRESNAME = "namepslanresname";

    /**
     * 设置 名称语言资源
     * 
     * @param namePSLanResName
     * 
     */
    @JsonProperty(FIELD_NAMEPSLANRESNAME)
    public void setNamePSLanResName(String namePSLanResName){
        this.set(FIELD_NAMEPSLANRESNAME, namePSLanResName);
    }
    
    /**
     * 获取 名称语言资源  
     * @return
     */
    @JsonIgnore
    public String getNamePSLanResName(){
        Object objValue = this.get(FIELD_NAMEPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 名称语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNamePSLanResNameDirty(){
        if(this.contains(FIELD_NAMEPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 名称语言资源
     */
    @JsonIgnore
    public void resetNamePSLanResName(){
        this.reset(FIELD_NAMEPSLANRESNAME);
    }

    /**
     * 设置 名称语言资源
     * <P>
     * 等同 {@link #setNamePSLanResName}
     * @param namePSLanResName
     */
    @JsonIgnore
    public PSWFProcess namepslanresname(String namePSLanResName){
        this.setNamePSLanResName(namePSLanResName);
        return this;
    }

    /**
     * <B>NORMALPROCTYPE</B>&nbsp;常规处理类型，指定常规流程处理的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.WFServiceProcType} 
     */
    public final static String FIELD_NORMALPROCTYPE = "normalproctype";

    /**
     * 设置 常规处理类型，详细说明：{@link #FIELD_NORMALPROCTYPE}
     * 
     * @param normalProcType
     * 
     */
    @JsonProperty(FIELD_NORMALPROCTYPE)
    public void setNormalProcType(String normalProcType){
        this.set(FIELD_NORMALPROCTYPE, normalProcType);
    }
    
    /**
     * 获取 常规处理类型  
     * @return
     */
    @JsonIgnore
    public String getNormalProcType(){
        Object objValue = this.get(FIELD_NORMALPROCTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 常规处理类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNormalProcTypeDirty(){
        if(this.contains(FIELD_NORMALPROCTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 常规处理类型
     */
    @JsonIgnore
    public void resetNormalProcType(){
        this.reset(FIELD_NORMALPROCTYPE);
    }

    /**
     * 设置 常规处理类型，详细说明：{@link #FIELD_NORMALPROCTYPE}
     * <P>
     * 等同 {@link #setNormalProcType}
     * @param normalProcType
     */
    @JsonIgnore
    public PSWFProcess normalproctype(String normalProcType){
        this.setNormalProcType(normalProcType);
        return this;
    }

     /**
     * 设置 常规处理类型，详细说明：{@link #FIELD_NORMALPROCTYPE}
     * <P>
     * 等同 {@link #setNormalProcType}
     * @param normalProcType
     */
    @JsonIgnore
    public PSWFProcess normalproctype(net.ibizsys.psmodel.core.util.PSModelEnums.WFServiceProcType normalProcType){
        if(normalProcType == null){
            this.setNormalProcType(null);
        }
        else{
            this.setNormalProcType(normalProcType.value);
        }
        return this;
    }

    /**
     * <B>PREDEFINEDACTIONS</B>&nbsp;额外流程操作，指定交互流程处理的附加系统流程操作
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.WFUtilUIActionType} 
     */
    public final static String FIELD_PREDEFINEDACTIONS = "predefinedactions";

    /**
     * 设置 额外流程操作，详细说明：{@link #FIELD_PREDEFINEDACTIONS}
     * 
     * @param predefinedActions
     * 
     */
    @JsonProperty(FIELD_PREDEFINEDACTIONS)
    public void setPredefinedActions(String predefinedActions){
        this.set(FIELD_PREDEFINEDACTIONS, predefinedActions);
    }
    
    /**
     * 获取 额外流程操作  
     * @return
     */
    @JsonIgnore
    public String getPredefinedActions(){
        Object objValue = this.get(FIELD_PREDEFINEDACTIONS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 额外流程操作 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPredefinedActionsDirty(){
        if(this.contains(FIELD_PREDEFINEDACTIONS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 额外流程操作
     */
    @JsonIgnore
    public void resetPredefinedActions(){
        this.reset(FIELD_PREDEFINEDACTIONS);
    }

    /**
     * 设置 额外流程操作，详细说明：{@link #FIELD_PREDEFINEDACTIONS}
     * <P>
     * 等同 {@link #setPredefinedActions}
     * @param predefinedActions
     */
    @JsonIgnore
    public PSWFProcess predefinedactions(String predefinedActions){
        this.setPredefinedActions(predefinedActions);
        return this;
    }

     /**
     * 设置 额外流程操作，详细说明：{@link #FIELD_PREDEFINEDACTIONS}
     * <P>
     * 等同 {@link #setPredefinedActions}
     * @param predefinedActions
     */
    @JsonIgnore
    public PSWFProcess predefinedactions(net.ibizsys.psmodel.core.util.PSModelEnums.WFUtilUIActionType[] predefinedActions){
        if(predefinedActions == null || predefinedActions.length == 0){
            this.setPredefinedActions(null);
        }
        else{
            String _value = "";
            for(net.ibizsys.psmodel.core.util.PSModelEnums.WFUtilUIActionType _item : predefinedActions){
                if(_value.length() > 0){
                    _value += ";";
                }
                _value += _item.value;
            }
            this.setPredefinedActions(_value);
        }
        return this;
    }

    /**
     * <B>PSDEACTIONID</B>&nbsp;实体行为，常规流程处理类型为【调用实体行为】时指定调用的实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
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
    public PSWFProcess psdeactionid(String pSDEActionId){
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
    public PSWFProcess psdeactionid(PSDEAction pSDEAction){
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
     * <B>PSDEACTIONNAME</B>&nbsp;实体行为，常规流程处理类型为【调用实体行为】时指定调用的实体行为
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
    public PSWFProcess psdeactionname(String pSDEActionName){
        this.setPSDEActionName(pSDEActionName);
        return this;
    }

    /**
     * <B>PSDEFORMID</B>&nbsp;流程表单，指定交互流程处理的桌面端交互表单
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEForm} 
     */
    public final static String FIELD_PSDEFORMID = "psdeformid";

    /**
     * 设置 流程表单，详细说明：{@link #FIELD_PSDEFORMID}
     * 
     * @param pSDEFormId
     * 
     */
    @JsonProperty(FIELD_PSDEFORMID)
    public void setPSDEFormId(String pSDEFormId){
        this.set(FIELD_PSDEFORMID, pSDEFormId);
    }
    
    /**
     * 获取 流程表单  
     * @return
     */
    @JsonIgnore
    public String getPSDEFormId(){
        Object objValue = this.get(FIELD_PSDEFORMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFormIdDirty(){
        if(this.contains(FIELD_PSDEFORMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程表单
     */
    @JsonIgnore
    public void resetPSDEFormId(){
        this.reset(FIELD_PSDEFORMID);
    }

    /**
     * 设置 流程表单，详细说明：{@link #FIELD_PSDEFORMID}
     * <P>
     * 等同 {@link #setPSDEFormId}
     * @param pSDEFormId
     */
    @JsonIgnore
    public PSWFProcess psdeformid(String pSDEFormId){
        this.setPSDEFormId(pSDEFormId);
        return this;
    }

    /**
     * 设置 流程表单，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEFormId}
     * @param pSDEForm 引用对象
     */
    @JsonIgnore
    public PSWFProcess psdeformid(PSDEForm pSDEForm){
        if(pSDEForm == null){
            this.setFormCodeName(null);
            this.setPSDEFormId(null);
            this.setPSDEFormName(null);
        }
        else{
            this.setFormCodeName(pSDEForm.getCodeName());
            this.setPSDEFormId(pSDEForm.getPSDEFormId());
            this.setPSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    /**
     * <B>PSDEFORMNAME</B>&nbsp;流程表单，指定交互流程处理的桌面端交互表单
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFORMID}
     */
    public final static String FIELD_PSDEFORMNAME = "psdeformname";

    /**
     * 设置 流程表单，详细说明：{@link #FIELD_PSDEFORMNAME}
     * 
     * @param pSDEFormName
     * 
     */
    @JsonProperty(FIELD_PSDEFORMNAME)
    public void setPSDEFormName(String pSDEFormName){
        this.set(FIELD_PSDEFORMNAME, pSDEFormName);
    }
    
    /**
     * 获取 流程表单  
     * @return
     */
    @JsonIgnore
    public String getPSDEFormName(){
        Object objValue = this.get(FIELD_PSDEFORMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFormNameDirty(){
        if(this.contains(FIELD_PSDEFORMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程表单
     */
    @JsonIgnore
    public void resetPSDEFormName(){
        this.reset(FIELD_PSDEFORMNAME);
    }

    /**
     * 设置 流程表单，详细说明：{@link #FIELD_PSDEFORMNAME}
     * <P>
     * 等同 {@link #setPSDEFormName}
     * @param pSDEFormName
     */
    @JsonIgnore
    public PSWFProcess psdeformname(String pSDEFormName){
        this.setPSDEFormName(pSDEFormName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;PSDEID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWFDEID}
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 PSDEID
     * 
     * @param pSDEId
     * 
     */
    @JsonProperty(FIELD_PSDEID)
    public void setPSDEId(String pSDEId){
        this.set(FIELD_PSDEID, pSDEId);
    }
    
    /**
     * 获取 PSDEID  
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
     * 判断 PSDEID 是否指定值，包括空值
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
     * 重置 PSDEID
     */
    @JsonIgnore
    public void resetPSDEId(){
        this.reset(FIELD_PSDEID);
    }

    /**
     * 设置 PSDEID
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSWFProcess psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * <B>PSDEUAGROUPID</B>&nbsp;附加界面行为组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEUAGroup} 
     */
    public final static String FIELD_PSDEUAGROUPID = "psdeuagroupid";

    /**
     * 设置 附加界面行为组
     * 
     * @param pSDEUAGroupId
     * 
     */
    @JsonProperty(FIELD_PSDEUAGROUPID)
    public void setPSDEUAGroupId(String pSDEUAGroupId){
        this.set(FIELD_PSDEUAGROUPID, pSDEUAGroupId);
    }
    
    /**
     * 获取 附加界面行为组  
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
     * 判断 附加界面行为组 是否指定值，包括空值
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
     * 重置 附加界面行为组
     */
    @JsonIgnore
    public void resetPSDEUAGroupId(){
        this.reset(FIELD_PSDEUAGROUPID);
    }

    /**
     * 设置 附加界面行为组
     * <P>
     * 等同 {@link #setPSDEUAGroupId}
     * @param pSDEUAGroupId
     */
    @JsonIgnore
    public PSWFProcess psdeuagroupid(String pSDEUAGroupId){
        this.setPSDEUAGroupId(pSDEUAGroupId);
        return this;
    }

    /**
     * 设置 附加界面行为组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEUAGroupId}
     * @param pSDEUAGroup 引用对象
     */
    @JsonIgnore
    public PSWFProcess psdeuagroupid(PSDEUAGroup pSDEUAGroup){
        if(pSDEUAGroup == null){
            this.setPSDEUAGroupId(null);
            this.setPSDEUAGroupName(null);
            this.setUAGroupCodeName(null);
        }
        else{
            this.setPSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setPSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
            this.setUAGroupCodeName(pSDEUAGroup.getCodeName());
        }
        return this;
    }

    /**
     * <B>PSDEUAGROUPNAME</B>&nbsp;附加界面行为组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEUAGROUPID}
     */
    public final static String FIELD_PSDEUAGROUPNAME = "psdeuagroupname";

    /**
     * 设置 附加界面行为组
     * 
     * @param pSDEUAGroupName
     * 
     */
    @JsonProperty(FIELD_PSDEUAGROUPNAME)
    public void setPSDEUAGroupName(String pSDEUAGroupName){
        this.set(FIELD_PSDEUAGROUPNAME, pSDEUAGroupName);
    }
    
    /**
     * 获取 附加界面行为组  
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
     * 判断 附加界面行为组 是否指定值，包括空值
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
     * 重置 附加界面行为组
     */
    @JsonIgnore
    public void resetPSDEUAGroupName(){
        this.reset(FIELD_PSDEUAGROUPNAME);
    }

    /**
     * 设置 附加界面行为组
     * <P>
     * 等同 {@link #setPSDEUAGroupName}
     * @param pSDEUAGroupName
     */
    @JsonIgnore
    public PSWFProcess psdeuagroupname(String pSDEUAGroupName){
        this.setPSDEUAGroupName(pSDEUAGroupName);
        return this;
    }

    /**
     * <B>PSDEVIEWBASEID</B>&nbsp;操作视图，指定流程处理人机交互时使用的桌面端操作视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_PSDEVIEWBASEID = "psdeviewbaseid";

    /**
     * 设置 操作视图，详细说明：{@link #FIELD_PSDEVIEWBASEID}
     * 
     * @param pSDEViewBaseId
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWBASEID)
    public void setPSDEViewBaseId(String pSDEViewBaseId){
        this.set(FIELD_PSDEVIEWBASEID, pSDEViewBaseId);
    }
    
    /**
     * 获取 操作视图  
     * @return
     */
    @JsonIgnore
    public String getPSDEViewBaseId(){
        Object objValue = this.get(FIELD_PSDEVIEWBASEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEViewBaseIdDirty(){
        if(this.contains(FIELD_PSDEVIEWBASEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作视图
     */
    @JsonIgnore
    public void resetPSDEViewBaseId(){
        this.reset(FIELD_PSDEVIEWBASEID);
    }

    /**
     * 设置 操作视图，详细说明：{@link #FIELD_PSDEVIEWBASEID}
     * <P>
     * 等同 {@link #setPSDEViewBaseId}
     * @param pSDEViewBaseId
     */
    @JsonIgnore
    public PSWFProcess psdeviewbaseid(String pSDEViewBaseId){
        this.setPSDEViewBaseId(pSDEViewBaseId);
        return this;
    }

    /**
     * 设置 操作视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEViewBaseId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSWFProcess psdeviewbaseid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setPSDEViewBaseId(null);
            this.setPSDEViewBaseName(null);
        }
        else{
            this.setPSDEViewBaseId(pSDEViewBase.getPSDEViewBaseId());
            this.setPSDEViewBaseName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>PSDEVIEWBASENAME</B>&nbsp;操作视图，指定流程处理人机交互时使用的桌面端操作视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVIEWBASEID}
     */
    public final static String FIELD_PSDEVIEWBASENAME = "psdeviewbasename";

    /**
     * 设置 操作视图，详细说明：{@link #FIELD_PSDEVIEWBASENAME}
     * 
     * @param pSDEViewBaseName
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWBASENAME)
    public void setPSDEViewBaseName(String pSDEViewBaseName){
        this.set(FIELD_PSDEVIEWBASENAME, pSDEViewBaseName);
    }
    
    /**
     * 获取 操作视图  
     * @return
     */
    @JsonIgnore
    public String getPSDEViewBaseName(){
        Object objValue = this.get(FIELD_PSDEVIEWBASENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEViewBaseNameDirty(){
        if(this.contains(FIELD_PSDEVIEWBASENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作视图
     */
    @JsonIgnore
    public void resetPSDEViewBaseName(){
        this.reset(FIELD_PSDEVIEWBASENAME);
    }

    /**
     * 设置 操作视图，详细说明：{@link #FIELD_PSDEVIEWBASENAME}
     * <P>
     * 等同 {@link #setPSDEViewBaseName}
     * @param pSDEViewBaseName
     */
    @JsonIgnore
    public PSWFProcess psdeviewbasename(String pSDEViewBaseName){
        this.setPSDEViewBaseName(pSDEViewBaseName);
        return this;
    }

    /**
     * <B>PSDYNADEVIEWTEMPLID</B>&nbsp;动态实体视图模板标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVIEWBASEID}
     */
    public final static String FIELD_PSDYNADEVIEWTEMPLID = "psdynadeviewtemplid";

    /**
     * 设置 动态实体视图模板标识
     * 
     * @param pSDynaDEViewTemplId
     * 
     */
    @JsonProperty(FIELD_PSDYNADEVIEWTEMPLID)
    public void setPSDynaDEViewTemplId(String pSDynaDEViewTemplId){
        this.set(FIELD_PSDYNADEVIEWTEMPLID, pSDynaDEViewTemplId);
    }
    
    /**
     * 获取 动态实体视图模板标识  
     * @return
     */
    @JsonIgnore
    public String getPSDynaDEViewTemplId(){
        Object objValue = this.get(FIELD_PSDYNADEVIEWTEMPLID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 动态实体视图模板标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDynaDEViewTemplIdDirty(){
        if(this.contains(FIELD_PSDYNADEVIEWTEMPLID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 动态实体视图模板标识
     */
    @JsonIgnore
    public void resetPSDynaDEViewTemplId(){
        this.reset(FIELD_PSDYNADEVIEWTEMPLID);
    }

    /**
     * 设置 动态实体视图模板标识
     * <P>
     * 等同 {@link #setPSDynaDEViewTemplId}
     * @param pSDynaDEViewTemplId
     */
    @JsonIgnore
    public PSWFProcess psdynadeviewtemplid(String pSDynaDEViewTemplId){
        this.setPSDynaDEViewTemplId(pSDynaDEViewTemplId);
        return this;
    }

    /**
     * <B>PSSYSMSGTEMPLID</B>&nbsp;发送消息模板，指定交互流程处理发送通知的消息模板
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysMsgTempl} 
     */
    public final static String FIELD_PSSYSMSGTEMPLID = "pssysmsgtemplid";

    /**
     * 设置 发送消息模板，详细说明：{@link #FIELD_PSSYSMSGTEMPLID}
     * 
     * @param pSSysMsgTemplId
     * 
     */
    @JsonProperty(FIELD_PSSYSMSGTEMPLID)
    public void setPSSysMsgTemplId(String pSSysMsgTemplId){
        this.set(FIELD_PSSYSMSGTEMPLID, pSSysMsgTemplId);
    }
    
    /**
     * 获取 发送消息模板  
     * @return
     */
    @JsonIgnore
    public String getPSSysMsgTemplId(){
        Object objValue = this.get(FIELD_PSSYSMSGTEMPLID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 发送消息模板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysMsgTemplIdDirty(){
        if(this.contains(FIELD_PSSYSMSGTEMPLID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 发送消息模板
     */
    @JsonIgnore
    public void resetPSSysMsgTemplId(){
        this.reset(FIELD_PSSYSMSGTEMPLID);
    }

    /**
     * 设置 发送消息模板，详细说明：{@link #FIELD_PSSYSMSGTEMPLID}
     * <P>
     * 等同 {@link #setPSSysMsgTemplId}
     * @param pSSysMsgTemplId
     */
    @JsonIgnore
    public PSWFProcess pssysmsgtemplid(String pSSysMsgTemplId){
        this.setPSSysMsgTemplId(pSSysMsgTemplId);
        return this;
    }

    /**
     * 设置 发送消息模板，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysMsgTemplId}
     * @param pSSysMsgTempl 引用对象
     */
    @JsonIgnore
    public PSWFProcess pssysmsgtemplid(PSSysMsgTempl pSSysMsgTempl){
        if(pSSysMsgTempl == null){
            this.setPSSysMsgTemplId(null);
            this.setPSSysMsgTemplName(null);
        }
        else{
            this.setPSSysMsgTemplId(pSSysMsgTempl.getPSSysMsgTemplId());
            this.setPSSysMsgTemplName(pSSysMsgTempl.getPSSysMsgTemplName());
        }
        return this;
    }

    /**
     * <B>PSSYSMSGTEMPLNAME</B>&nbsp;发送消息模板，指定交互流程处理发送通知的消息模板
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSMSGTEMPLID}
     */
    public final static String FIELD_PSSYSMSGTEMPLNAME = "pssysmsgtemplname";

    /**
     * 设置 发送消息模板，详细说明：{@link #FIELD_PSSYSMSGTEMPLNAME}
     * 
     * @param pSSysMsgTemplName
     * 
     */
    @JsonProperty(FIELD_PSSYSMSGTEMPLNAME)
    public void setPSSysMsgTemplName(String pSSysMsgTemplName){
        this.set(FIELD_PSSYSMSGTEMPLNAME, pSSysMsgTemplName);
    }
    
    /**
     * 获取 发送消息模板  
     * @return
     */
    @JsonIgnore
    public String getPSSysMsgTemplName(){
        Object objValue = this.get(FIELD_PSSYSMSGTEMPLNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 发送消息模板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysMsgTemplNameDirty(){
        if(this.contains(FIELD_PSSYSMSGTEMPLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 发送消息模板
     */
    @JsonIgnore
    public void resetPSSysMsgTemplName(){
        this.reset(FIELD_PSSYSMSGTEMPLNAME);
    }

    /**
     * 设置 发送消息模板，详细说明：{@link #FIELD_PSSYSMSGTEMPLNAME}
     * <P>
     * 等同 {@link #setPSSysMsgTemplName}
     * @param pSSysMsgTemplName
     */
    @JsonIgnore
    public PSWFProcess pssysmsgtemplname(String pSSysMsgTemplName){
        this.setPSSysMsgTemplName(pSSysMsgTemplName);
        return this;
    }

    /**
     * <B>PSWFDEID</B>&nbsp;流程实体，指定流程处理使用的工作流实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSWFDE} 
     */
    public final static String FIELD_PSWFDEID = "pswfdeid";

    /**
     * 设置 流程实体，详细说明：{@link #FIELD_PSWFDEID}
     * 
     * @param pSWFDEId
     * 
     */
    @JsonProperty(FIELD_PSWFDEID)
    public void setPSWFDEId(String pSWFDEId){
        this.set(FIELD_PSWFDEID, pSWFDEId);
    }
    
    /**
     * 获取 流程实体  
     * @return
     */
    @JsonIgnore
    public String getPSWFDEId(){
        Object objValue = this.get(FIELD_PSWFDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFDEIdDirty(){
        if(this.contains(FIELD_PSWFDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程实体
     */
    @JsonIgnore
    public void resetPSWFDEId(){
        this.reset(FIELD_PSWFDEID);
    }

    /**
     * 设置 流程实体，详细说明：{@link #FIELD_PSWFDEID}
     * <P>
     * 等同 {@link #setPSWFDEId}
     * @param pSWFDEId
     */
    @JsonIgnore
    public PSWFProcess pswfdeid(String pSWFDEId){
        this.setPSWFDEId(pSWFDEId);
        return this;
    }

    /**
     * 设置 流程实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSWFDEId}
     * @param pSWFDE 引用对象
     */
    @JsonIgnore
    public PSWFProcess pswfdeid(PSWFDE pSWFDE){
        if(pSWFDE == null){
            this.setPSDEId(null);
            this.setPSWFDEId(null);
            this.setPSWFDEName(null);
        }
        else{
            this.setPSDEId(pSWFDE.getPSDEId());
            this.setPSWFDEId(pSWFDE.getPSWFDEId());
            this.setPSWFDEName(pSWFDE.getPSWFDEName());
        }
        return this;
    }

    /**
     * <B>PSWFDENAME</B>&nbsp;工作流实体，指定流程处理使用的工作流实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWFDEID}
     */
    public final static String FIELD_PSWFDENAME = "pswfdename";

    /**
     * 设置 工作流实体，详细说明：{@link #FIELD_PSWFDENAME}
     * 
     * @param pSWFDEName
     * 
     */
    @JsonProperty(FIELD_PSWFDENAME)
    public void setPSWFDEName(String pSWFDEName){
        this.set(FIELD_PSWFDENAME, pSWFDEName);
    }
    
    /**
     * 获取 工作流实体  
     * @return
     */
    @JsonIgnore
    public String getPSWFDEName(){
        Object objValue = this.get(FIELD_PSWFDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工作流实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFDENameDirty(){
        if(this.contains(FIELD_PSWFDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工作流实体
     */
    @JsonIgnore
    public void resetPSWFDEName(){
        this.reset(FIELD_PSWFDENAME);
    }

    /**
     * 设置 工作流实体，详细说明：{@link #FIELD_PSWFDENAME}
     * <P>
     * 等同 {@link #setPSWFDEName}
     * @param pSWFDEName
     */
    @JsonIgnore
    public PSWFProcess pswfdename(String pSWFDEName){
        this.setPSWFDEName(pSWFDEName);
        return this;
    }

    /**
     * <B>PSWFID</B>&nbsp;工作流，指定流程处理所属的工作流
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
    public PSWFProcess pswfid(String pSWFId){
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
    public PSWFProcess pswfid(PSWorkflow pSWorkflow){
        if(pSWorkflow == null){
            this.setPSWFId(null);
        }
        else{
            this.setPSWFId(pSWorkflow.getPSWorkflowId());
        }
        return this;
    }

    /**
     * <B>PSWFPROCESSID</B>&nbsp;流程处理标识
     * <P>
     * 字符串：最大长度 100
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
    public PSWFProcess pswfprocessid(String pSWFProcessId){
        this.setPSWFProcessId(pSWFProcessId);
        return this;
    }

    /**
     * <B>PSWFPROCESSNAME</B>&nbsp;流程处理名称，指定流程处理节点的名称
     * <P>
     * 字符串：最大长度 200
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
    public PSWFProcess pswfprocessname(String pSWFProcessName){
        this.setPSWFProcessName(pSWFProcessName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSWFProcessName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSWFProcessName(strName);
    }

    @JsonIgnore
    public PSWFProcess name(String strName){
        this.setPSWFProcessName(strName);
        return this;
    }

    /**
     * <B>PSWFVERSIONID</B>&nbsp;工作流版本，指定流程处理所属的工作流版本
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
    public PSWFProcess pswfversionid(String pSWFVersionId){
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
    public PSWFProcess pswfversionid(PSWFVersion pSWFVersion){
        if(pSWFVersion == null){
            this.setPSWFVersionId(null);
            this.setPSWFVersionName(null);
            this.setWFEngineType(null);
        }
        else{
            this.setPSWFVersionId(pSWFVersion.getPSWFVersionId());
            this.setPSWFVersionName(pSWFVersion.getPSWFVersionName());
            this.setWFEngineType(pSWFVersion.getWFEngineType());
        }
        return this;
    }

    /**
     * <B>PSWFVERSIONNAME</B>&nbsp;工作流版本，指定流程处理所属的工作流版本
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
    public PSWFProcess pswfversionname(String pSWFVersionName){
        this.setPSWFVersionName(pSWFVersionName);
        return this;
    }

    /**
     * <B>PSWFWORKTIMEID</B>&nbsp;工作时间，指定流程处理使用的工作流时间
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSWFWorkTime} 
     */
    public final static String FIELD_PSWFWORKTIMEID = "pswfworktimeid";

    /**
     * 设置 工作时间，详细说明：{@link #FIELD_PSWFWORKTIMEID}
     * 
     * @param pSWFWorkTimeId
     * 
     */
    @JsonProperty(FIELD_PSWFWORKTIMEID)
    public void setPSWFWorkTimeId(String pSWFWorkTimeId){
        this.set(FIELD_PSWFWORKTIMEID, pSWFWorkTimeId);
    }
    
    /**
     * 获取 工作时间  
     * @return
     */
    @JsonIgnore
    public String getPSWFWorkTimeId(){
        Object objValue = this.get(FIELD_PSWFWORKTIMEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工作时间 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFWorkTimeIdDirty(){
        if(this.contains(FIELD_PSWFWORKTIMEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工作时间
     */
    @JsonIgnore
    public void resetPSWFWorkTimeId(){
        this.reset(FIELD_PSWFWORKTIMEID);
    }

    /**
     * 设置 工作时间，详细说明：{@link #FIELD_PSWFWORKTIMEID}
     * <P>
     * 等同 {@link #setPSWFWorkTimeId}
     * @param pSWFWorkTimeId
     */
    @JsonIgnore
    public PSWFProcess pswfworktimeid(String pSWFWorkTimeId){
        this.setPSWFWorkTimeId(pSWFWorkTimeId);
        return this;
    }

    /**
     * 设置 工作时间，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSWFWorkTimeId}
     * @param pSWFWorkTime 引用对象
     */
    @JsonIgnore
    public PSWFProcess pswfworktimeid(PSWFWorkTime pSWFWorkTime){
        if(pSWFWorkTime == null){
            this.setPSWFWorkTimeId(null);
            this.setPSWFWorkTimeName(null);
        }
        else{
            this.setPSWFWorkTimeId(pSWFWorkTime.getPSWFWorkTimeId());
            this.setPSWFWorkTimeName(pSWFWorkTime.getPSWFWorkTimeName());
        }
        return this;
    }

    /**
     * <B>PSWFWORKTIMENAME</B>&nbsp;工作时间，指定流程处理使用的工作流时间
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWFWORKTIMEID}
     */
    public final static String FIELD_PSWFWORKTIMENAME = "pswfworktimename";

    /**
     * 设置 工作时间，详细说明：{@link #FIELD_PSWFWORKTIMENAME}
     * 
     * @param pSWFWorkTimeName
     * 
     */
    @JsonProperty(FIELD_PSWFWORKTIMENAME)
    public void setPSWFWorkTimeName(String pSWFWorkTimeName){
        this.set(FIELD_PSWFWORKTIMENAME, pSWFWorkTimeName);
    }
    
    /**
     * 获取 工作时间  
     * @return
     */
    @JsonIgnore
    public String getPSWFWorkTimeName(){
        Object objValue = this.get(FIELD_PSWFWORKTIMENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工作时间 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFWorkTimeNameDirty(){
        if(this.contains(FIELD_PSWFWORKTIMENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工作时间
     */
    @JsonIgnore
    public void resetPSWFWorkTimeName(){
        this.reset(FIELD_PSWFWORKTIMENAME);
    }

    /**
     * 设置 工作时间，详细说明：{@link #FIELD_PSWFWORKTIMENAME}
     * <P>
     * 等同 {@link #setPSWFWorkTimeName}
     * @param pSWFWorkTimeName
     */
    @JsonIgnore
    public PSWFProcess pswfworktimename(String pSWFWorkTimeName){
        this.setPSWFWorkTimeName(pSWFWorkTimeName);
        return this;
    }

    /**
     * <B>REFPSWFVERSIONID</B>&nbsp;引用工作流版本，指定流程处理引用工作流版本
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSWFVersion} 
     */
    public final static String FIELD_REFPSWFVERSIONID = "refpswfversionid";

    /**
     * 设置 引用工作流版本，详细说明：{@link #FIELD_REFPSWFVERSIONID}
     * 
     * @param refPSWFVersionId
     * 
     */
    @JsonProperty(FIELD_REFPSWFVERSIONID)
    public void setRefPSWFVersionId(String refPSWFVersionId){
        this.set(FIELD_REFPSWFVERSIONID, refPSWFVersionId);
    }
    
    /**
     * 获取 引用工作流版本  
     * @return
     */
    @JsonIgnore
    public String getRefPSWFVersionId(){
        Object objValue = this.get(FIELD_REFPSWFVERSIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用工作流版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSWFVersionIdDirty(){
        if(this.contains(FIELD_REFPSWFVERSIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用工作流版本
     */
    @JsonIgnore
    public void resetRefPSWFVersionId(){
        this.reset(FIELD_REFPSWFVERSIONID);
    }

    /**
     * 设置 引用工作流版本，详细说明：{@link #FIELD_REFPSWFVERSIONID}
     * <P>
     * 等同 {@link #setRefPSWFVersionId}
     * @param refPSWFVersionId
     */
    @JsonIgnore
    public PSWFProcess refpswfversionid(String refPSWFVersionId){
        this.setRefPSWFVersionId(refPSWFVersionId);
        return this;
    }

    /**
     * 设置 引用工作流版本，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefPSWFVersionId}
     * @param pSWFVersion 引用对象
     */
    @JsonIgnore
    public PSWFProcess refpswfversionid(PSWFVersion pSWFVersion){
        if(pSWFVersion == null){
            this.setRefPSWFVersionId(null);
            this.setRefPSWFVersionName(null);
        }
        else{
            this.setRefPSWFVersionId(pSWFVersion.getPSWFVersionId());
            this.setRefPSWFVersionName(pSWFVersion.getPSWFVersionName());
        }
        return this;
    }

    /**
     * <B>REFPSWFVERSIONNAME</B>&nbsp;引用工作流版本，指定流程处理引用工作流版本
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPSWFVERSIONID}
     */
    public final static String FIELD_REFPSWFVERSIONNAME = "refpswfversionname";

    /**
     * 设置 引用工作流版本，详细说明：{@link #FIELD_REFPSWFVERSIONNAME}
     * 
     * @param refPSWFVersionName
     * 
     */
    @JsonProperty(FIELD_REFPSWFVERSIONNAME)
    public void setRefPSWFVersionName(String refPSWFVersionName){
        this.set(FIELD_REFPSWFVERSIONNAME, refPSWFVersionName);
    }
    
    /**
     * 获取 引用工作流版本  
     * @return
     */
    @JsonIgnore
    public String getRefPSWFVersionName(){
        Object objValue = this.get(FIELD_REFPSWFVERSIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用工作流版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSWFVersionNameDirty(){
        if(this.contains(FIELD_REFPSWFVERSIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用工作流版本
     */
    @JsonIgnore
    public void resetRefPSWFVersionName(){
        this.reset(FIELD_REFPSWFVERSIONNAME);
    }

    /**
     * 设置 引用工作流版本，详细说明：{@link #FIELD_REFPSWFVERSIONNAME}
     * <P>
     * 等同 {@link #setRefPSWFVersionName}
     * @param refPSWFVersionName
     */
    @JsonIgnore
    public PSWFProcess refpswfversionname(String refPSWFVersionName){
        this.setRefPSWFVersionName(refPSWFVersionName);
        return this;
    }

    /**
     * <B>SENDINFORM</B>&nbsp;发送通知，指定流程处理是否向相关的处理人发送通知，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_SENDINFORM = "sendinform";

    /**
     * 设置 发送通知，详细说明：{@link #FIELD_SENDINFORM}
     * 
     * @param sendInform
     * 
     */
    @JsonProperty(FIELD_SENDINFORM)
    public void setSendInform(Integer sendInform){
        this.set(FIELD_SENDINFORM, sendInform);
    }
    
    /**
     * 获取 发送通知  
     * @return
     */
    @JsonIgnore
    public Integer getSendInform(){
        Object objValue = this.get(FIELD_SENDINFORM);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 发送通知 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSendInformDirty(){
        if(this.contains(FIELD_SENDINFORM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 发送通知
     */
    @JsonIgnore
    public void resetSendInform(){
        this.reset(FIELD_SENDINFORM);
    }

    /**
     * 设置 发送通知，详细说明：{@link #FIELD_SENDINFORM}
     * <P>
     * 等同 {@link #setSendInform}
     * @param sendInform
     */
    @JsonIgnore
    public PSWFProcess sendinform(Integer sendInform){
        this.setSendInform(sendInform);
        return this;
    }

     /**
     * 设置 发送通知，详细说明：{@link #FIELD_SENDINFORM}
     * <P>
     * 等同 {@link #setSendInform}
     * @param sendInform
     */
    @JsonIgnore
    public PSWFProcess sendinform(Boolean sendInform){
        if(sendInform == null){
            this.setSendInform(null);
        }
        else{
            this.setSendInform(sendInform?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>SHAPEPARAMS</B>&nbsp;形状参数
     */
    public final static String FIELD_SHAPEPARAMS = "shapeparams";

    /**
     * 设置 形状参数
     * 
     * @param shapeParams
     * 
     */
    @JsonProperty(FIELD_SHAPEPARAMS)
    public void setShapeParams(String shapeParams){
        this.set(FIELD_SHAPEPARAMS, shapeParams);
    }
    
    /**
     * 获取 形状参数  
     * @return
     */
    @JsonIgnore
    public String getShapeParams(){
        Object objValue = this.get(FIELD_SHAPEPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 形状参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isShapeParamsDirty(){
        if(this.contains(FIELD_SHAPEPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 形状参数
     */
    @JsonIgnore
    public void resetShapeParams(){
        this.reset(FIELD_SHAPEPARAMS);
    }

    /**
     * 设置 形状参数
     * <P>
     * 等同 {@link #setShapeParams}
     * @param shapeParams
     */
    @JsonIgnore
    public PSWFProcess shapeparams(String shapeParams){
        this.setShapeParams(shapeParams);
        return this;
    }

    /**
     * <B>TIMEOUT</B>&nbsp;超时时长，指定流程处理超时的时长，需同时指定时间单位
     */
    public final static String FIELD_TIMEOUT = "timeout";

    /**
     * 设置 超时时长，详细说明：{@link #FIELD_TIMEOUT}
     * 
     * @param timeout
     * 
     */
    @JsonProperty(FIELD_TIMEOUT)
    public void setTimeout(Integer timeout){
        this.set(FIELD_TIMEOUT, timeout);
    }
    
    /**
     * 获取 超时时长  
     * @return
     */
    @JsonIgnore
    public Integer getTimeout(){
        Object objValue = this.get(FIELD_TIMEOUT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 超时时长 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTimeoutDirty(){
        if(this.contains(FIELD_TIMEOUT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 超时时长
     */
    @JsonIgnore
    public void resetTimeout(){
        this.reset(FIELD_TIMEOUT);
    }

    /**
     * 设置 超时时长，详细说明：{@link #FIELD_TIMEOUT}
     * <P>
     * 等同 {@link #setTimeout}
     * @param timeout
     */
    @JsonIgnore
    public PSWFProcess timeout(Integer timeout){
        this.setTimeout(timeout);
        return this;
    }

    /**
     * <B>TIMEOUTPSDEFID</B>&nbsp;动态超时属性，指定流程处理动态超时值所在的属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_TIMEOUTPSDEFID = "timeoutpsdefid";

    /**
     * 设置 动态超时属性，详细说明：{@link #FIELD_TIMEOUTPSDEFID}
     * 
     * @param timeoutPSDEFId
     * 
     */
    @JsonProperty(FIELD_TIMEOUTPSDEFID)
    public void setTimeoutPSDEFId(String timeoutPSDEFId){
        this.set(FIELD_TIMEOUTPSDEFID, timeoutPSDEFId);
    }
    
    /**
     * 获取 动态超时属性  
     * @return
     */
    @JsonIgnore
    public String getTimeoutPSDEFId(){
        Object objValue = this.get(FIELD_TIMEOUTPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 动态超时属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTimeoutPSDEFIdDirty(){
        if(this.contains(FIELD_TIMEOUTPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 动态超时属性
     */
    @JsonIgnore
    public void resetTimeoutPSDEFId(){
        this.reset(FIELD_TIMEOUTPSDEFID);
    }

    /**
     * 设置 动态超时属性，详细说明：{@link #FIELD_TIMEOUTPSDEFID}
     * <P>
     * 等同 {@link #setTimeoutPSDEFId}
     * @param timeoutPSDEFId
     */
    @JsonIgnore
    public PSWFProcess timeoutpsdefid(String timeoutPSDEFId){
        this.setTimeoutPSDEFId(timeoutPSDEFId);
        return this;
    }

    /**
     * 设置 动态超时属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTimeoutPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSWFProcess timeoutpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setTimeoutPSDEFId(null);
            this.setTimeoutPSDEFName(null);
        }
        else{
            this.setTimeoutPSDEFId(pSDEField.getPSDEFieldId());
            this.setTimeoutPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>TIMEOUTPSDEFNAME</B>&nbsp;动态超时属性，指定流程处理动态超时值所在的属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TIMEOUTPSDEFID}
     */
    public final static String FIELD_TIMEOUTPSDEFNAME = "timeoutpsdefname";

    /**
     * 设置 动态超时属性，详细说明：{@link #FIELD_TIMEOUTPSDEFNAME}
     * 
     * @param timeoutPSDEFName
     * 
     */
    @JsonProperty(FIELD_TIMEOUTPSDEFNAME)
    public void setTimeoutPSDEFName(String timeoutPSDEFName){
        this.set(FIELD_TIMEOUTPSDEFNAME, timeoutPSDEFName);
    }
    
    /**
     * 获取 动态超时属性  
     * @return
     */
    @JsonIgnore
    public String getTimeoutPSDEFName(){
        Object objValue = this.get(FIELD_TIMEOUTPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 动态超时属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTimeoutPSDEFNameDirty(){
        if(this.contains(FIELD_TIMEOUTPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 动态超时属性
     */
    @JsonIgnore
    public void resetTimeoutPSDEFName(){
        this.reset(FIELD_TIMEOUTPSDEFNAME);
    }

    /**
     * 设置 动态超时属性，详细说明：{@link #FIELD_TIMEOUTPSDEFNAME}
     * <P>
     * 等同 {@link #setTimeoutPSDEFName}
     * @param timeoutPSDEFName
     */
    @JsonIgnore
    public PSWFProcess timeoutpsdefname(String timeoutPSDEFName){
        this.setTimeoutPSDEFName(timeoutPSDEFName);
        return this;
    }

    /**
     * <B>TIMEOUTTYPE</B>&nbsp;超时类型，指定流程处理超时的时间单位
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.WFTimeoutType} 
     */
    public final static String FIELD_TIMEOUTTYPE = "timeouttype";

    /**
     * 设置 超时类型，详细说明：{@link #FIELD_TIMEOUTTYPE}
     * 
     * @param timeoutType
     * 
     */
    @JsonProperty(FIELD_TIMEOUTTYPE)
    public void setTimeoutType(String timeoutType){
        this.set(FIELD_TIMEOUTTYPE, timeoutType);
    }
    
    /**
     * 获取 超时类型  
     * @return
     */
    @JsonIgnore
    public String getTimeoutType(){
        Object objValue = this.get(FIELD_TIMEOUTTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 超时类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTimeoutTypeDirty(){
        if(this.contains(FIELD_TIMEOUTTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 超时类型
     */
    @JsonIgnore
    public void resetTimeoutType(){
        this.reset(FIELD_TIMEOUTTYPE);
    }

    /**
     * 设置 超时类型，详细说明：{@link #FIELD_TIMEOUTTYPE}
     * <P>
     * 等同 {@link #setTimeoutType}
     * @param timeoutType
     */
    @JsonIgnore
    public PSWFProcess timeouttype(String timeoutType){
        this.setTimeoutType(timeoutType);
        return this;
    }

     /**
     * 设置 超时类型，详细说明：{@link #FIELD_TIMEOUTTYPE}
     * <P>
     * 等同 {@link #setTimeoutType}
     * @param timeoutType
     */
    @JsonIgnore
    public PSWFProcess timeouttype(net.ibizsys.psmodel.core.util.PSModelEnums.WFTimeoutType timeoutType){
        if(timeoutType == null){
            this.setTimeoutType(null);
        }
        else{
            this.setTimeoutType(timeoutType.value);
        }
        return this;
    }

    /**
     * <B>TOPPOS</B>&nbsp;上坐标，指定流程处理在流程设计界面的图元的左上角Y值，未定义时为【0】
     */
    public final static String FIELD_TOPPOS = "toppos";

    /**
     * 设置 上坐标，详细说明：{@link #FIELD_TOPPOS}
     * 
     * @param topPos
     * 
     */
    @JsonProperty(FIELD_TOPPOS)
    public void setTopPos(Integer topPos){
        this.set(FIELD_TOPPOS, topPos);
    }
    
    /**
     * 获取 上坐标  
     * @return
     */
    @JsonIgnore
    public Integer getTopPos(){
        Object objValue = this.get(FIELD_TOPPOS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 上坐标 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTopPosDirty(){
        if(this.contains(FIELD_TOPPOS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 上坐标
     */
    @JsonIgnore
    public void resetTopPos(){
        this.reset(FIELD_TOPPOS);
    }

    /**
     * 设置 上坐标，详细说明：{@link #FIELD_TOPPOS}
     * <P>
     * 等同 {@link #setTopPos}
     * @param topPos
     */
    @JsonIgnore
    public PSWFProcess toppos(Integer topPos){
        this.setTopPos(topPos);
        return this;
    }

    /**
     * <B>UAGROUPCODENAME</B>&nbsp;附加界面行为组代码标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEUAGROUPID}
     */
    public final static String FIELD_UAGROUPCODENAME = "uagroupcodename";

    /**
     * 设置 附加界面行为组代码标识
     * 
     * @param uAGroupCodeName
     * 
     */
    @JsonProperty(FIELD_UAGROUPCODENAME)
    public void setUAGroupCodeName(String uAGroupCodeName){
        this.set(FIELD_UAGROUPCODENAME, uAGroupCodeName);
    }
    
    /**
     * 获取 附加界面行为组代码标识  
     * @return
     */
    @JsonIgnore
    public String getUAGroupCodeName(){
        Object objValue = this.get(FIELD_UAGROUPCODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 附加界面行为组代码标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUAGroupCodeNameDirty(){
        if(this.contains(FIELD_UAGROUPCODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 附加界面行为组代码标识
     */
    @JsonIgnore
    public void resetUAGroupCodeName(){
        this.reset(FIELD_UAGROUPCODENAME);
    }

    /**
     * 设置 附加界面行为组代码标识
     * <P>
     * 等同 {@link #setUAGroupCodeName}
     * @param uAGroupCodeName
     */
    @JsonIgnore
    public PSWFProcess uagroupcodename(String uAGroupCodeName){
        this.setUAGroupCodeName(uAGroupCodeName);
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
    public PSWFProcess updatedate(String updateDate){
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
    public PSWFProcess updateman(String updateMan){
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
    public PSWFProcess usercat(String userCat){
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
    public PSWFProcess usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat.value);
        }
        return this;
    }

    /**
     * <B>USERDATA</B>&nbsp;处理数据，指定流程处理自定义的处理数据
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_USERDATA = "userdata";

    /**
     * 设置 处理数据，详细说明：{@link #FIELD_USERDATA}
     * 
     * @param userData
     * 
     */
    @JsonProperty(FIELD_USERDATA)
    public void setUserData(String userData){
        this.set(FIELD_USERDATA, userData);
    }
    
    /**
     * 获取 处理数据  
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
     * 判断 处理数据 是否指定值，包括空值
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
     * 重置 处理数据
     */
    @JsonIgnore
    public void resetUserData(){
        this.reset(FIELD_USERDATA);
    }

    /**
     * 设置 处理数据，详细说明：{@link #FIELD_USERDATA}
     * <P>
     * 等同 {@link #setUserData}
     * @param userData
     */
    @JsonIgnore
    public PSWFProcess userdata(String userData){
        this.setUserData(userData);
        return this;
    }

    /**
     * <B>USERDATA2</B>&nbsp;处理数据2，指定流程处理自定义的处理数据2
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_USERDATA2 = "userdata2";

    /**
     * 设置 处理数据2，详细说明：{@link #FIELD_USERDATA2}
     * 
     * @param userData2
     * 
     */
    @JsonProperty(FIELD_USERDATA2)
    public void setUserData2(String userData2){
        this.set(FIELD_USERDATA2, userData2);
    }
    
    /**
     * 获取 处理数据2  
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
     * 判断 处理数据2 是否指定值，包括空值
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
     * 重置 处理数据2
     */
    @JsonIgnore
    public void resetUserData2(){
        this.reset(FIELD_USERDATA2);
    }

    /**
     * 设置 处理数据2，详细说明：{@link #FIELD_USERDATA2}
     * <P>
     * 等同 {@link #setUserData2}
     * @param userData2
     */
    @JsonIgnore
    public PSWFProcess userdata2(String userData2){
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
    public PSWFProcess usertag(String userTag){
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
    public PSWFProcess usertag2(String userTag2){
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
    public PSWFProcess usertag3(String userTag3){
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
    public PSWFProcess usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>UTIL2FORMCODENAME</B>&nbsp;功能2表单标记
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UTIL2PSDEFORMID}
     */
    public final static String FIELD_UTIL2FORMCODENAME = "util2formcodename";

    /**
     * 设置 功能2表单标记
     * 
     * @param util2FormCodeName
     * 
     */
    @JsonProperty(FIELD_UTIL2FORMCODENAME)
    public void setUtil2FormCodeName(String util2FormCodeName){
        this.set(FIELD_UTIL2FORMCODENAME, util2FormCodeName);
    }
    
    /**
     * 获取 功能2表单标记  
     * @return
     */
    @JsonIgnore
    public String getUtil2FormCodeName(){
        Object objValue = this.get(FIELD_UTIL2FORMCODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能2表单标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtil2FormCodeNameDirty(){
        if(this.contains(FIELD_UTIL2FORMCODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能2表单标记
     */
    @JsonIgnore
    public void resetUtil2FormCodeName(){
        this.reset(FIELD_UTIL2FORMCODENAME);
    }

    /**
     * 设置 功能2表单标记
     * <P>
     * 等同 {@link #setUtil2FormCodeName}
     * @param util2FormCodeName
     */
    @JsonIgnore
    public PSWFProcess util2formcodename(String util2FormCodeName){
        this.setUtil2FormCodeName(util2FormCodeName);
        return this;
    }

    /**
     * <B>UTIL2PSDEFORMID</B>&nbsp;后加签表单
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEForm} 
     */
    public final static String FIELD_UTIL2PSDEFORMID = "util2psdeformid";

    /**
     * 设置 后加签表单
     * 
     * @param util2PSDEFormId
     * 
     */
    @JsonProperty(FIELD_UTIL2PSDEFORMID)
    public void setUtil2PSDEFormId(String util2PSDEFormId){
        this.set(FIELD_UTIL2PSDEFORMID, util2PSDEFormId);
    }
    
    /**
     * 获取 后加签表单  
     * @return
     */
    @JsonIgnore
    public String getUtil2PSDEFormId(){
        Object objValue = this.get(FIELD_UTIL2PSDEFORMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后加签表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtil2PSDEFormIdDirty(){
        if(this.contains(FIELD_UTIL2PSDEFORMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后加签表单
     */
    @JsonIgnore
    public void resetUtil2PSDEFormId(){
        this.reset(FIELD_UTIL2PSDEFORMID);
    }

    /**
     * 设置 后加签表单
     * <P>
     * 等同 {@link #setUtil2PSDEFormId}
     * @param util2PSDEFormId
     */
    @JsonIgnore
    public PSWFProcess util2psdeformid(String util2PSDEFormId){
        this.setUtil2PSDEFormId(util2PSDEFormId);
        return this;
    }

    /**
     * 设置 后加签表单，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUtil2PSDEFormId}
     * @param pSDEForm 引用对象
     */
    @JsonIgnore
    public PSWFProcess util2psdeformid(PSDEForm pSDEForm){
        if(pSDEForm == null){
            this.setUtil2FormCodeName(null);
            this.setUtil2PSDEFormId(null);
            this.setUtil2PSDEFormName(null);
        }
        else{
            this.setUtil2FormCodeName(pSDEForm.getCodeName());
            this.setUtil2PSDEFormId(pSDEForm.getPSDEFormId());
            this.setUtil2PSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    /**
     * <B>UTIL2PSDEFORMNAME</B>&nbsp;后加签表单
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UTIL2PSDEFORMID}
     */
    public final static String FIELD_UTIL2PSDEFORMNAME = "util2psdeformname";

    /**
     * 设置 后加签表单
     * 
     * @param util2PSDEFormName
     * 
     */
    @JsonProperty(FIELD_UTIL2PSDEFORMNAME)
    public void setUtil2PSDEFormName(String util2PSDEFormName){
        this.set(FIELD_UTIL2PSDEFORMNAME, util2PSDEFormName);
    }
    
    /**
     * 获取 后加签表单  
     * @return
     */
    @JsonIgnore
    public String getUtil2PSDEFormName(){
        Object objValue = this.get(FIELD_UTIL2PSDEFORMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后加签表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtil2PSDEFormNameDirty(){
        if(this.contains(FIELD_UTIL2PSDEFORMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后加签表单
     */
    @JsonIgnore
    public void resetUtil2PSDEFormName(){
        this.reset(FIELD_UTIL2PSDEFORMNAME);
    }

    /**
     * 设置 后加签表单
     * <P>
     * 等同 {@link #setUtil2PSDEFormName}
     * @param util2PSDEFormName
     */
    @JsonIgnore
    public PSWFProcess util2psdeformname(String util2PSDEFormName){
        this.setUtil2PSDEFormName(util2PSDEFormName);
        return this;
    }

    /**
     * <B>UTIL3FORMCODENAME</B>&nbsp;功能3表单标记
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UTIL3PSDEFORMID}
     */
    public final static String FIELD_UTIL3FORMCODENAME = "util3formcodename";

    /**
     * 设置 功能3表单标记
     * 
     * @param util3FormCodeName
     * 
     */
    @JsonProperty(FIELD_UTIL3FORMCODENAME)
    public void setUtil3FormCodeName(String util3FormCodeName){
        this.set(FIELD_UTIL3FORMCODENAME, util3FormCodeName);
    }
    
    /**
     * 获取 功能3表单标记  
     * @return
     */
    @JsonIgnore
    public String getUtil3FormCodeName(){
        Object objValue = this.get(FIELD_UTIL3FORMCODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能3表单标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtil3FormCodeNameDirty(){
        if(this.contains(FIELD_UTIL3FORMCODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能3表单标记
     */
    @JsonIgnore
    public void resetUtil3FormCodeName(){
        this.reset(FIELD_UTIL3FORMCODENAME);
    }

    /**
     * 设置 功能3表单标记
     * <P>
     * 等同 {@link #setUtil3FormCodeName}
     * @param util3FormCodeName
     */
    @JsonIgnore
    public PSWFProcess util3formcodename(String util3FormCodeName){
        this.setUtil3FormCodeName(util3FormCodeName);
        return this;
    }

    /**
     * <B>UTIL3PSDEFORMID</B>&nbsp;转办表单
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEForm} 
     */
    public final static String FIELD_UTIL3PSDEFORMID = "util3psdeformid";

    /**
     * 设置 转办表单
     * 
     * @param util3PSDEFormId
     * 
     */
    @JsonProperty(FIELD_UTIL3PSDEFORMID)
    public void setUtil3PSDEFormId(String util3PSDEFormId){
        this.set(FIELD_UTIL3PSDEFORMID, util3PSDEFormId);
    }
    
    /**
     * 获取 转办表单  
     * @return
     */
    @JsonIgnore
    public String getUtil3PSDEFormId(){
        Object objValue = this.get(FIELD_UTIL3PSDEFORMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 转办表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtil3PSDEFormIdDirty(){
        if(this.contains(FIELD_UTIL3PSDEFORMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 转办表单
     */
    @JsonIgnore
    public void resetUtil3PSDEFormId(){
        this.reset(FIELD_UTIL3PSDEFORMID);
    }

    /**
     * 设置 转办表单
     * <P>
     * 等同 {@link #setUtil3PSDEFormId}
     * @param util3PSDEFormId
     */
    @JsonIgnore
    public PSWFProcess util3psdeformid(String util3PSDEFormId){
        this.setUtil3PSDEFormId(util3PSDEFormId);
        return this;
    }

    /**
     * 设置 转办表单，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUtil3PSDEFormId}
     * @param pSDEForm 引用对象
     */
    @JsonIgnore
    public PSWFProcess util3psdeformid(PSDEForm pSDEForm){
        if(pSDEForm == null){
            this.setUtil3FormCodeName(null);
            this.setUtil3PSDEFormId(null);
            this.setUtil3PSDEFormName(null);
        }
        else{
            this.setUtil3FormCodeName(pSDEForm.getCodeName());
            this.setUtil3PSDEFormId(pSDEForm.getPSDEFormId());
            this.setUtil3PSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    /**
     * <B>UTIL3PSDEFORMNAME</B>&nbsp;转办表单
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UTIL3PSDEFORMID}
     */
    public final static String FIELD_UTIL3PSDEFORMNAME = "util3psdeformname";

    /**
     * 设置 转办表单
     * 
     * @param util3PSDEFormName
     * 
     */
    @JsonProperty(FIELD_UTIL3PSDEFORMNAME)
    public void setUtil3PSDEFormName(String util3PSDEFormName){
        this.set(FIELD_UTIL3PSDEFORMNAME, util3PSDEFormName);
    }
    
    /**
     * 获取 转办表单  
     * @return
     */
    @JsonIgnore
    public String getUtil3PSDEFormName(){
        Object objValue = this.get(FIELD_UTIL3PSDEFORMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 转办表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtil3PSDEFormNameDirty(){
        if(this.contains(FIELD_UTIL3PSDEFORMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 转办表单
     */
    @JsonIgnore
    public void resetUtil3PSDEFormName(){
        this.reset(FIELD_UTIL3PSDEFORMNAME);
    }

    /**
     * 设置 转办表单
     * <P>
     * 等同 {@link #setUtil3PSDEFormName}
     * @param util3PSDEFormName
     */
    @JsonIgnore
    public PSWFProcess util3psdeformname(String util3PSDEFormName){
        this.setUtil3PSDEFormName(util3PSDEFormName);
        return this;
    }

    /**
     * <B>UTIL4FORMCODENAME</B>&nbsp;功能4表单标记
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UTIL4PSDEFORMID}
     */
    public final static String FIELD_UTIL4FORMCODENAME = "util4formcodename";

    /**
     * 设置 功能4表单标记
     * 
     * @param util4FormCodeName
     * 
     */
    @JsonProperty(FIELD_UTIL4FORMCODENAME)
    public void setUtil4FormCodeName(String util4FormCodeName){
        this.set(FIELD_UTIL4FORMCODENAME, util4FormCodeName);
    }
    
    /**
     * 获取 功能4表单标记  
     * @return
     */
    @JsonIgnore
    public String getUtil4FormCodeName(){
        Object objValue = this.get(FIELD_UTIL4FORMCODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能4表单标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtil4FormCodeNameDirty(){
        if(this.contains(FIELD_UTIL4FORMCODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能4表单标记
     */
    @JsonIgnore
    public void resetUtil4FormCodeName(){
        this.reset(FIELD_UTIL4FORMCODENAME);
    }

    /**
     * 设置 功能4表单标记
     * <P>
     * 等同 {@link #setUtil4FormCodeName}
     * @param util4FormCodeName
     */
    @JsonIgnore
    public PSWFProcess util4formcodename(String util4FormCodeName){
        this.setUtil4FormCodeName(util4FormCodeName);
        return this;
    }

    /**
     * <B>UTIL4PSDEFORMID</B>&nbsp;功能表单4
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEForm} 
     */
    public final static String FIELD_UTIL4PSDEFORMID = "util4psdeformid";

    /**
     * 设置 功能表单4
     * 
     * @param util4PSDEFormId
     * 
     */
    @JsonProperty(FIELD_UTIL4PSDEFORMID)
    public void setUtil4PSDEFormId(String util4PSDEFormId){
        this.set(FIELD_UTIL4PSDEFORMID, util4PSDEFormId);
    }
    
    /**
     * 获取 功能表单4  
     * @return
     */
    @JsonIgnore
    public String getUtil4PSDEFormId(){
        Object objValue = this.get(FIELD_UTIL4PSDEFORMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能表单4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtil4PSDEFormIdDirty(){
        if(this.contains(FIELD_UTIL4PSDEFORMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能表单4
     */
    @JsonIgnore
    public void resetUtil4PSDEFormId(){
        this.reset(FIELD_UTIL4PSDEFORMID);
    }

    /**
     * 设置 功能表单4
     * <P>
     * 等同 {@link #setUtil4PSDEFormId}
     * @param util4PSDEFormId
     */
    @JsonIgnore
    public PSWFProcess util4psdeformid(String util4PSDEFormId){
        this.setUtil4PSDEFormId(util4PSDEFormId);
        return this;
    }

    /**
     * 设置 功能表单4，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUtil4PSDEFormId}
     * @param pSDEForm 引用对象
     */
    @JsonIgnore
    public PSWFProcess util4psdeformid(PSDEForm pSDEForm){
        if(pSDEForm == null){
            this.setUtil4FormCodeName(null);
            this.setUtil4PSDEFormId(null);
            this.setUtil4PSDEFormName(null);
        }
        else{
            this.setUtil4FormCodeName(pSDEForm.getCodeName());
            this.setUtil4PSDEFormId(pSDEForm.getPSDEFormId());
            this.setUtil4PSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    /**
     * <B>UTIL4PSDEFORMNAME</B>&nbsp;功能表单4
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UTIL4PSDEFORMID}
     */
    public final static String FIELD_UTIL4PSDEFORMNAME = "util4psdeformname";

    /**
     * 设置 功能表单4
     * 
     * @param util4PSDEFormName
     * 
     */
    @JsonProperty(FIELD_UTIL4PSDEFORMNAME)
    public void setUtil4PSDEFormName(String util4PSDEFormName){
        this.set(FIELD_UTIL4PSDEFORMNAME, util4PSDEFormName);
    }
    
    /**
     * 获取 功能表单4  
     * @return
     */
    @JsonIgnore
    public String getUtil4PSDEFormName(){
        Object objValue = this.get(FIELD_UTIL4PSDEFORMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能表单4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtil4PSDEFormNameDirty(){
        if(this.contains(FIELD_UTIL4PSDEFORMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能表单4
     */
    @JsonIgnore
    public void resetUtil4PSDEFormName(){
        this.reset(FIELD_UTIL4PSDEFORMNAME);
    }

    /**
     * 设置 功能表单4
     * <P>
     * 等同 {@link #setUtil4PSDEFormName}
     * @param util4PSDEFormName
     */
    @JsonIgnore
    public PSWFProcess util4psdeformname(String util4PSDEFormName){
        this.setUtil4PSDEFormName(util4PSDEFormName);
        return this;
    }

    /**
     * <B>UTIL5FORMCODENAME</B>&nbsp;功能5表单标记
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UTIL5PSDEFORMID}
     */
    public final static String FIELD_UTIL5FORMCODENAME = "util5formcodename";

    /**
     * 设置 功能5表单标记
     * 
     * @param util5FormCodeName
     * 
     */
    @JsonProperty(FIELD_UTIL5FORMCODENAME)
    public void setUtil5FormCodeName(String util5FormCodeName){
        this.set(FIELD_UTIL5FORMCODENAME, util5FormCodeName);
    }
    
    /**
     * 获取 功能5表单标记  
     * @return
     */
    @JsonIgnore
    public String getUtil5FormCodeName(){
        Object objValue = this.get(FIELD_UTIL5FORMCODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能5表单标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtil5FormCodeNameDirty(){
        if(this.contains(FIELD_UTIL5FORMCODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能5表单标记
     */
    @JsonIgnore
    public void resetUtil5FormCodeName(){
        this.reset(FIELD_UTIL5FORMCODENAME);
    }

    /**
     * 设置 功能5表单标记
     * <P>
     * 等同 {@link #setUtil5FormCodeName}
     * @param util5FormCodeName
     */
    @JsonIgnore
    public PSWFProcess util5formcodename(String util5FormCodeName){
        this.setUtil5FormCodeName(util5FormCodeName);
        return this;
    }

    /**
     * <B>UTIL5PSDEFORMID</B>&nbsp;功能表单5
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEForm} 
     */
    public final static String FIELD_UTIL5PSDEFORMID = "util5psdeformid";

    /**
     * 设置 功能表单5
     * 
     * @param util5PSDEFormId
     * 
     */
    @JsonProperty(FIELD_UTIL5PSDEFORMID)
    public void setUtil5PSDEFormId(String util5PSDEFormId){
        this.set(FIELD_UTIL5PSDEFORMID, util5PSDEFormId);
    }
    
    /**
     * 获取 功能表单5  
     * @return
     */
    @JsonIgnore
    public String getUtil5PSDEFormId(){
        Object objValue = this.get(FIELD_UTIL5PSDEFORMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能表单5 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtil5PSDEFormIdDirty(){
        if(this.contains(FIELD_UTIL5PSDEFORMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能表单5
     */
    @JsonIgnore
    public void resetUtil5PSDEFormId(){
        this.reset(FIELD_UTIL5PSDEFORMID);
    }

    /**
     * 设置 功能表单5
     * <P>
     * 等同 {@link #setUtil5PSDEFormId}
     * @param util5PSDEFormId
     */
    @JsonIgnore
    public PSWFProcess util5psdeformid(String util5PSDEFormId){
        this.setUtil5PSDEFormId(util5PSDEFormId);
        return this;
    }

    /**
     * 设置 功能表单5，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUtil5PSDEFormId}
     * @param pSDEForm 引用对象
     */
    @JsonIgnore
    public PSWFProcess util5psdeformid(PSDEForm pSDEForm){
        if(pSDEForm == null){
            this.setUtil5FormCodeName(null);
            this.setUtil5PSDEFormId(null);
            this.setUtil5PSDEFormName(null);
        }
        else{
            this.setUtil5FormCodeName(pSDEForm.getCodeName());
            this.setUtil5PSDEFormId(pSDEForm.getPSDEFormId());
            this.setUtil5PSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    /**
     * <B>UTIL5PSDEFORMNAME</B>&nbsp;功能表单5
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UTIL5PSDEFORMID}
     */
    public final static String FIELD_UTIL5PSDEFORMNAME = "util5psdeformname";

    /**
     * 设置 功能表单5
     * 
     * @param util5PSDEFormName
     * 
     */
    @JsonProperty(FIELD_UTIL5PSDEFORMNAME)
    public void setUtil5PSDEFormName(String util5PSDEFormName){
        this.set(FIELD_UTIL5PSDEFORMNAME, util5PSDEFormName);
    }
    
    /**
     * 获取 功能表单5  
     * @return
     */
    @JsonIgnore
    public String getUtil5PSDEFormName(){
        Object objValue = this.get(FIELD_UTIL5PSDEFORMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能表单5 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtil5PSDEFormNameDirty(){
        if(this.contains(FIELD_UTIL5PSDEFORMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能表单5
     */
    @JsonIgnore
    public void resetUtil5PSDEFormName(){
        this.reset(FIELD_UTIL5PSDEFORMNAME);
    }

    /**
     * 设置 功能表单5
     * <P>
     * 等同 {@link #setUtil5PSDEFormName}
     * @param util5PSDEFormName
     */
    @JsonIgnore
    public PSWFProcess util5psdeformname(String util5PSDEFormName){
        this.setUtil5PSDEFormName(util5PSDEFormName);
        return this;
    }

    /**
     * <B>UTILFORMCODENAME</B>&nbsp;功能表单标记
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UTILPSDEFORMID}
     */
    public final static String FIELD_UTILFORMCODENAME = "utilformcodename";

    /**
     * 设置 功能表单标记
     * 
     * @param utilFormCodeName
     * 
     */
    @JsonProperty(FIELD_UTILFORMCODENAME)
    public void setUtilFormCodeName(String utilFormCodeName){
        this.set(FIELD_UTILFORMCODENAME, utilFormCodeName);
    }
    
    /**
     * 获取 功能表单标记  
     * @return
     */
    @JsonIgnore
    public String getUtilFormCodeName(){
        Object objValue = this.get(FIELD_UTILFORMCODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能表单标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilFormCodeNameDirty(){
        if(this.contains(FIELD_UTILFORMCODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能表单标记
     */
    @JsonIgnore
    public void resetUtilFormCodeName(){
        this.reset(FIELD_UTILFORMCODENAME);
    }

    /**
     * 设置 功能表单标记
     * <P>
     * 等同 {@link #setUtilFormCodeName}
     * @param utilFormCodeName
     */
    @JsonIgnore
    public PSWFProcess utilformcodename(String utilFormCodeName){
        this.setUtilFormCodeName(utilFormCodeName);
        return this;
    }

    /**
     * <B>UTILPSDEFORMID</B>&nbsp;前加签表单
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEForm} 
     */
    public final static String FIELD_UTILPSDEFORMID = "utilpsdeformid";

    /**
     * 设置 前加签表单
     * 
     * @param utilPSDEFormId
     * 
     */
    @JsonProperty(FIELD_UTILPSDEFORMID)
    public void setUtilPSDEFormId(String utilPSDEFormId){
        this.set(FIELD_UTILPSDEFORMID, utilPSDEFormId);
    }
    
    /**
     * 获取 前加签表单  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDEFormId(){
        Object objValue = this.get(FIELD_UTILPSDEFORMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前加签表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDEFormIdDirty(){
        if(this.contains(FIELD_UTILPSDEFORMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前加签表单
     */
    @JsonIgnore
    public void resetUtilPSDEFormId(){
        this.reset(FIELD_UTILPSDEFORMID);
    }

    /**
     * 设置 前加签表单
     * <P>
     * 等同 {@link #setUtilPSDEFormId}
     * @param utilPSDEFormId
     */
    @JsonIgnore
    public PSWFProcess utilpsdeformid(String utilPSDEFormId){
        this.setUtilPSDEFormId(utilPSDEFormId);
        return this;
    }

    /**
     * 设置 前加签表单，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUtilPSDEFormId}
     * @param pSDEForm 引用对象
     */
    @JsonIgnore
    public PSWFProcess utilpsdeformid(PSDEForm pSDEForm){
        if(pSDEForm == null){
            this.setUtilFormCodeName(null);
            this.setUtilPSDEFormId(null);
            this.setUtilPSDEFormName(null);
        }
        else{
            this.setUtilFormCodeName(pSDEForm.getCodeName());
            this.setUtilPSDEFormId(pSDEForm.getPSDEFormId());
            this.setUtilPSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    /**
     * <B>UTILPSDEFORMNAME</B>&nbsp;前加签表单
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UTILPSDEFORMID}
     */
    public final static String FIELD_UTILPSDEFORMNAME = "utilpsdeformname";

    /**
     * 设置 前加签表单
     * 
     * @param utilPSDEFormName
     * 
     */
    @JsonProperty(FIELD_UTILPSDEFORMNAME)
    public void setUtilPSDEFormName(String utilPSDEFormName){
        this.set(FIELD_UTILPSDEFORMNAME, utilPSDEFormName);
    }
    
    /**
     * 获取 前加签表单  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDEFormName(){
        Object objValue = this.get(FIELD_UTILPSDEFORMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前加签表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDEFormNameDirty(){
        if(this.contains(FIELD_UTILPSDEFORMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前加签表单
     */
    @JsonIgnore
    public void resetUtilPSDEFormName(){
        this.reset(FIELD_UTILPSDEFORMNAME);
    }

    /**
     * 设置 前加签表单
     * <P>
     * 等同 {@link #setUtilPSDEFormName}
     * @param utilPSDEFormName
     */
    @JsonIgnore
    public PSWFProcess utilpsdeformname(String utilPSDEFormName){
        this.setUtilPSDEFormName(utilPSDEFormName);
        return this;
    }

    /**
     * <B>WFEDITVIEWTYPE</B>&nbsp;流程编辑视图类型，指定流程处理使用的桌面端流程编辑视图类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEWFEditViewType} 
     */
    public final static String FIELD_WFEDITVIEWTYPE = "wfeditviewtype";

    /**
     * 设置 流程编辑视图类型，详细说明：{@link #FIELD_WFEDITVIEWTYPE}
     * 
     * @param wFEditViewType
     * 
     */
    @JsonProperty(FIELD_WFEDITVIEWTYPE)
    public void setWFEditViewType(String wFEditViewType){
        this.set(FIELD_WFEDITVIEWTYPE, wFEditViewType);
    }
    
    /**
     * 获取 流程编辑视图类型  
     * @return
     */
    @JsonIgnore
    public String getWFEditViewType(){
        Object objValue = this.get(FIELD_WFEDITVIEWTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程编辑视图类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFEditViewTypeDirty(){
        if(this.contains(FIELD_WFEDITVIEWTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程编辑视图类型
     */
    @JsonIgnore
    public void resetWFEditViewType(){
        this.reset(FIELD_WFEDITVIEWTYPE);
    }

    /**
     * 设置 流程编辑视图类型，详细说明：{@link #FIELD_WFEDITVIEWTYPE}
     * <P>
     * 等同 {@link #setWFEditViewType}
     * @param wFEditViewType
     */
    @JsonIgnore
    public PSWFProcess wfeditviewtype(String wFEditViewType){
        this.setWFEditViewType(wFEditViewType);
        return this;
    }

     /**
     * 设置 流程编辑视图类型，详细说明：{@link #FIELD_WFEDITVIEWTYPE}
     * <P>
     * 等同 {@link #setWFEditViewType}
     * @param wFEditViewType
     */
    @JsonIgnore
    public PSWFProcess wfeditviewtype(net.ibizsys.psmodel.core.util.PSModelEnums.DEWFEditViewType wFEditViewType){
        if(wFEditViewType == null){
            this.setWFEditViewType(null);
        }
        else{
            this.setWFEditViewType(wFEditViewType.value);
        }
        return this;
    }

    /**
     * <B>WFENGINETYPE</B>&nbsp;引擎类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.WFEngineType} 
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWFVERSIONID}
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
    public PSWFProcess wfenginetype(String wFEngineType){
        this.setWFEngineType(wFEngineType);
        return this;
    }

    /**
     * <B>WFPROCESSTYPE</B>&nbsp;流程处理类型，指定流程处理节点的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.WFProcessType} 
     */
    public final static String FIELD_WFPROCESSTYPE = "wfprocesstype";

    /**
     * 设置 流程处理类型，详细说明：{@link #FIELD_WFPROCESSTYPE}
     * 
     * @param wFProcessType
     * 
     */
    @JsonProperty(FIELD_WFPROCESSTYPE)
    public void setWFProcessType(String wFProcessType){
        this.set(FIELD_WFPROCESSTYPE, wFProcessType);
    }
    
    /**
     * 获取 流程处理类型  
     * @return
     */
    @JsonIgnore
    public String getWFProcessType(){
        Object objValue = this.get(FIELD_WFPROCESSTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程处理类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFProcessTypeDirty(){
        if(this.contains(FIELD_WFPROCESSTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程处理类型
     */
    @JsonIgnore
    public void resetWFProcessType(){
        this.reset(FIELD_WFPROCESSTYPE);
    }

    /**
     * 设置 流程处理类型，详细说明：{@link #FIELD_WFPROCESSTYPE}
     * <P>
     * 等同 {@link #setWFProcessType}
     * @param wFProcessType
     */
    @JsonIgnore
    public PSWFProcess wfprocesstype(String wFProcessType){
        this.setWFProcessType(wFProcessType);
        return this;
    }

     /**
     * 设置 流程处理类型，详细说明：{@link #FIELD_WFPROCESSTYPE}
     * <P>
     * 等同 {@link #setWFProcessType}
     * @param wFProcessType
     */
    @JsonIgnore
    public PSWFProcess wfprocesstype(net.ibizsys.psmodel.core.util.PSModelEnums.WFProcessType wFProcessType){
        if(wFProcessType == null){
            this.setWFProcessType(null);
        }
        else{
            this.setWFProcessType(wFProcessType.value);
        }
        return this;
    }

    /**
     * <B>WFSTEPVALUE</B>&nbsp;流程步骤值，指定流程处理对应的步骤值
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_WFSTEPVALUE = "wfstepvalue";

    /**
     * 设置 流程步骤值，详细说明：{@link #FIELD_WFSTEPVALUE}
     * 
     * @param wFStepValue
     * 
     */
    @JsonProperty(FIELD_WFSTEPVALUE)
    public void setWFStepValue(String wFStepValue){
        this.set(FIELD_WFSTEPVALUE, wFStepValue);
    }
    
    /**
     * 获取 流程步骤值  
     * @return
     */
    @JsonIgnore
    public String getWFStepValue(){
        Object objValue = this.get(FIELD_WFSTEPVALUE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程步骤值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFStepValueDirty(){
        if(this.contains(FIELD_WFSTEPVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程步骤值
     */
    @JsonIgnore
    public void resetWFStepValue(){
        this.reset(FIELD_WFSTEPVALUE);
    }

    /**
     * 设置 流程步骤值，详细说明：{@link #FIELD_WFSTEPVALUE}
     * <P>
     * 等同 {@link #setWFStepValue}
     * @param wFStepValue
     */
    @JsonIgnore
    public PSWFProcess wfstepvalue(String wFStepValue){
        this.setWFStepValue(wFStepValue);
        return this;
    }

    /**
     * <B>WIDTH</B>&nbsp;图形宽度，指定流程处理在流程设计界面的图元宽度，未定义时为【100】
     */
    public final static String FIELD_WIDTH = "width";

    /**
     * 设置 图形宽度，详细说明：{@link #FIELD_WIDTH}
     * 
     * @param width
     * 
     */
    @JsonProperty(FIELD_WIDTH)
    public void setWidth(Integer width){
        this.set(FIELD_WIDTH, width);
    }
    
    /**
     * 获取 图形宽度  
     * @return
     */
    @JsonIgnore
    public Integer getWidth(){
        Object objValue = this.get(FIELD_WIDTH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 图形宽度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWidthDirty(){
        if(this.contains(FIELD_WIDTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图形宽度
     */
    @JsonIgnore
    public void resetWidth(){
        this.reset(FIELD_WIDTH);
    }

    /**
     * 设置 图形宽度，详细说明：{@link #FIELD_WIDTH}
     * <P>
     * 等同 {@link #setWidth}
     * @param width
     */
    @JsonIgnore
    public PSWFProcess width(Integer width){
        this.setWidth(width);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSWFProcessId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSWFProcessId(strValue);
    }

    @JsonIgnore
    public PSWFProcess id(String strValue){
        this.setPSWFProcessId(strValue);
        return this;
    }


    /**
     *  流程处理角色 成员集合
     */
    public final static String FIELD_PSWFPROCROLES = "pswfprocroles";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSWFProcRole> pswfprocroles;

    /**
     * 获取 流程处理角色 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSWFPROCROLES)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSWFProcRole> getPSWFProcRoles(){
        return this.pswfprocroles;
    }

    /**
     * 设置 流程处理角色 成员集合  
     * @param pswfprocroles
     */
    @JsonProperty(FIELD_PSWFPROCROLES)
    public void setPSWFProcRoles(java.util.List<net.ibizsys.psmodel.core.domain.PSWFProcRole> pswfprocroles){
        this.pswfprocroles = pswfprocroles;
    }

    /**
     * 获取 流程处理角色 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSWFProcRole> getPSWFProcRolesIf(){
        if(this.pswfprocroles == null){
            this.pswfprocroles = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSWFProcRole>();          
        }
        return this.pswfprocroles;
    }


    /**
     *  流程处理子流程 成员集合
     */
    public final static String FIELD_PSWFPROCSUBWFS = "pswfprocsubwfs";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSWFProcSubWF> pswfprocsubwfs;

    /**
     * 获取 流程处理子流程 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSWFPROCSUBWFS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSWFProcSubWF> getPSWFProcSubWFs(){
        return this.pswfprocsubwfs;
    }

    /**
     * 设置 流程处理子流程 成员集合  
     * @param pswfprocsubwfs
     */
    @JsonProperty(FIELD_PSWFPROCSUBWFS)
    public void setPSWFProcSubWFs(java.util.List<net.ibizsys.psmodel.core.domain.PSWFProcSubWF> pswfprocsubwfs){
        this.pswfprocsubwfs = pswfprocsubwfs;
    }

    /**
     * 获取 流程处理子流程 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSWFProcSubWF> getPSWFProcSubWFsIf(){
        if(this.pswfprocsubwfs == null){
            this.pswfprocsubwfs = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSWFProcSubWF>();          
        }
        return this.pswfprocsubwfs;
    }


    /**
     *  流程处理参数 成员集合
     */
    public final static String FIELD_PSWFPROCPARAMS = "pswfprocparams";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSWFProcParam> pswfprocparams;

    /**
     * 获取 流程处理参数 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSWFPROCPARAMS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSWFProcParam> getPSWFProcParams(){
        return this.pswfprocparams;
    }

    /**
     * 设置 流程处理参数 成员集合  
     * @param pswfprocparams
     */
    @JsonProperty(FIELD_PSWFPROCPARAMS)
    public void setPSWFProcParams(java.util.List<net.ibizsys.psmodel.core.domain.PSWFProcParam> pswfprocparams){
        this.pswfprocparams = pswfprocparams;
    }

    /**
     * 获取 流程处理参数 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSWFProcParam> getPSWFProcParamsIf(){
        if(this.pswfprocparams == null){
            this.pswfprocparams = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSWFProcParam>();          
        }
        return this.pswfprocparams;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSWFProcess){
            PSWFProcess model = (PSWFProcess)iPSModel;
            model.setPSWFProcRoles(this.getPSWFProcRoles());
            model.setPSWFProcSubWFs(this.getPSWFProcSubWFs());
            model.setPSWFProcParams(this.getPSWFProcParams());
        }
        super.copyTo(iPSModel);
    }
    
    
    
    
    
    /**
     * <B>VIEWCODENAME</B>&nbsp;操作视图标记
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVIEWBASEID}
     */
    public final static String FIELD_VIEWCODENAME = "viewcodename";

    /**
     * 设置 操作视图标记
     * 
     * @param viewCodeName
     * 
     */
    @JsonProperty(FIELD_VIEWCODENAME)
    public void setViewCodeName(String viewCodeName){
        this.set(FIELD_VIEWCODENAME, viewCodeName);
    }
    
    /**
     * 获取 操作视图标记  
     * @return
     */
    @JsonIgnore
    public String getViewCodeName(){
        Object objValue = this.get(FIELD_VIEWCODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作视图标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewCodeNameDirty(){
        if(this.contains(FIELD_VIEWCODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作视图标记
     */
    @JsonIgnore
    public void resetViewCodeName(){
        this.reset(FIELD_VIEWCODENAME);
    }

    /**
     * 设置 操作视图标记
     * <P>
     * 等同 {@link #setViewCodeName}
     * @param viewCodeName
     */
    @JsonIgnore
    public PSWFProcess viewcodename(String viewCodeName){
        this.setViewCodeName(viewCodeName);
        return this;
    }

    /**
     * <B>MOBVIEWCODENAME</B>&nbsp;移动端操作视图标记
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOBPSDEVIEWID}
     */
    public final static String FIELD_MOBVIEWCODENAME = "mobviewcodename";

    /**
     * 设置 移动端操作视图标记
     * 
     * @param mobViewCodeName
     * 
     */
    @JsonProperty(FIELD_MOBVIEWCODENAME)
    public void setMobViewCodeName(String mobViewCodeName){
        this.set(FIELD_MOBVIEWCODENAME, mobViewCodeName);
    }
    
    /**
     * 获取 移动端操作视图标记  
     * @return
     */
    @JsonIgnore
    public String getMobViewCodeName(){
        Object objValue = this.get(FIELD_MOBVIEWCODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端操作视图标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobViewCodeNameDirty(){
        if(this.contains(FIELD_MOBVIEWCODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端操作视图标记
     */
    @JsonIgnore
    public void resetMobViewCodeName(){
        this.reset(FIELD_MOBVIEWCODENAME);
    }

    /**
     * 设置 移动端操作视图标记
     * <P>
     * 等同 {@link #setMobViewCodeName}
     * @param mobViewCodeName
     */
    @JsonIgnore
    public PSWFProcess mobviewcodename(String mobViewCodeName){
        this.setMobViewCodeName(mobViewCodeName);
        return this;
    }
}
