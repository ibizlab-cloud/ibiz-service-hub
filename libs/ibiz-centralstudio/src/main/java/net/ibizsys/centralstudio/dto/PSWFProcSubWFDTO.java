package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSWFPROCSUBWF</B>流程处理子流程 模型传输对象
 * <P>
 * 流程处理节点子流程模型，为嵌套流程节点提供定义子流程的能力，包括了工作流、工作流实体及启动的数据集等信息
 */
public class PSWFProcSubWFDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSWFProcSubWFDTO(){
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定流程处理子流程的代码名称，需在所在流程处理中具备唯一性
     * <P>
     * 字符串：最大长度 20
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
    public PSWFProcSubWFDTO codename(String codeName){
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
    public PSWFProcSubWFDTO createdate(Timestamp createDate){
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
    public PSWFProcSubWFDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>EMBEDPSDEDSID</B>&nbsp;流程数据集，指定流程处理子流程嵌入的工作流实体的数据集，用于查询启动流程的数据
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO} 
     */
    public final static String FIELD_EMBEDPSDEDSID = "embedpsdedsid";

    /**
     * 设置 流程数据集，详细说明：{@link #FIELD_EMBEDPSDEDSID}
     * 
     * @param embedPSDEDSId
     * 
     */
    @JsonProperty(FIELD_EMBEDPSDEDSID)
    public void setEmbedPSDEDSId(String embedPSDEDSId){
        this.set(FIELD_EMBEDPSDEDSID, embedPSDEDSId);
    }
    
    /**
     * 获取 流程数据集  
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
     * 判断 流程数据集 是否指定值，包括空值
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
     * 重置 流程数据集
     */
    @JsonIgnore
    public void resetEmbedPSDEDSId(){
        this.reset(FIELD_EMBEDPSDEDSID);
    }

    /**
     * 设置 流程数据集，详细说明：{@link #FIELD_EMBEDPSDEDSID}
     * <P>
     * 等同 {@link #setEmbedPSDEDSId}
     * @param embedPSDEDSId
     */
    @JsonIgnore
    public PSWFProcSubWFDTO embedpsdedsid(String embedPSDEDSId){
        this.setEmbedPSDEDSId(embedPSDEDSId);
        return this;
    }

    /**
     * 设置 流程数据集，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setEmbedPSDEDSId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSWFProcSubWFDTO embedpsdedsid(PSDEDataSetDTO pSDEDataSet){
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
     * <B>EMBEDPSDEDSNAME</B>&nbsp;流程数据集，指定流程处理子流程嵌入的工作流实体的数据集，用于查询启动流程的数据
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_EMBEDPSDEDSID}
     */
    public final static String FIELD_EMBEDPSDEDSNAME = "embedpsdedsname";

    /**
     * 设置 流程数据集，详细说明：{@link #FIELD_EMBEDPSDEDSNAME}
     * 
     * @param embedPSDEDSName
     * 
     */
    @JsonProperty(FIELD_EMBEDPSDEDSNAME)
    public void setEmbedPSDEDSName(String embedPSDEDSName){
        this.set(FIELD_EMBEDPSDEDSNAME, embedPSDEDSName);
    }
    
    /**
     * 获取 流程数据集  
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
     * 判断 流程数据集 是否指定值，包括空值
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
     * 重置 流程数据集
     */
    @JsonIgnore
    public void resetEmbedPSDEDSName(){
        this.reset(FIELD_EMBEDPSDEDSNAME);
    }

    /**
     * 设置 流程数据集，详细说明：{@link #FIELD_EMBEDPSDEDSNAME}
     * <P>
     * 等同 {@link #setEmbedPSDEDSName}
     * @param embedPSDEDSName
     */
    @JsonIgnore
    public PSWFProcSubWFDTO embedpsdedsname(String embedPSDEDSName){
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
    public PSWFProcSubWFDTO embedpsdeid(String embedPSDEId){
        this.setEmbedPSDEId(embedPSDEId);
        return this;
    }

    /**
     * <B>EMBEDPSWFDEID</B>&nbsp;嵌套工作流实体，指定流程处理子流程嵌入的工作流的工作流实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSWFDEDTO} 
     */
    public final static String FIELD_EMBEDPSWFDEID = "embedpswfdeid";

    /**
     * 设置 嵌套工作流实体，详细说明：{@link #FIELD_EMBEDPSWFDEID}
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
     * 设置 嵌套工作流实体，详细说明：{@link #FIELD_EMBEDPSWFDEID}
     * <P>
     * 等同 {@link #setEmbedPSWFDEId}
     * @param embedPSWFDEId
     */
    @JsonIgnore
    public PSWFProcSubWFDTO embedpswfdeid(String embedPSWFDEId){
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
    public PSWFProcSubWFDTO embedpswfdeid(PSWFDEDTO pSWFDE){
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
     * <B>EMBEDPSWFDENAME</B>&nbsp;嵌套工作流实体，指定流程处理子流程嵌入的工作流的工作流实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_EMBEDPSWFDEID}
     */
    public final static String FIELD_EMBEDPSWFDENAME = "embedpswfdename";

    /**
     * 设置 嵌套工作流实体，详细说明：{@link #FIELD_EMBEDPSWFDENAME}
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
     * 设置 嵌套工作流实体，详细说明：{@link #FIELD_EMBEDPSWFDENAME}
     * <P>
     * 等同 {@link #setEmbedPSWFDEName}
     * @param embedPSWFDEName
     */
    @JsonIgnore
    public PSWFProcSubWFDTO embedpswfdename(String embedPSWFDEName){
        this.setEmbedPSWFDEName(embedPSWFDEName);
        return this;
    }

    /**
     * <B>EMBEDPSWFID</B>&nbsp;嵌套工作流，指定流程处理子流程嵌入的工作流
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSWorkflowDTO} 
     */
    public final static String FIELD_EMBEDPSWFID = "embedpswfid";

    /**
     * 设置 嵌套工作流，详细说明：{@link #FIELD_EMBEDPSWFID}
     * 
     * @param embedPSWFId
     * 
     */
    @JsonProperty(FIELD_EMBEDPSWFID)
    public void setEmbedPSWFId(String embedPSWFId){
        this.set(FIELD_EMBEDPSWFID, embedPSWFId);
    }
    
    /**
     * 获取 嵌套工作流  
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
     * 判断 嵌套工作流 是否指定值，包括空值
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
     * 重置 嵌套工作流
     */
    @JsonIgnore
    public void resetEmbedPSWFId(){
        this.reset(FIELD_EMBEDPSWFID);
    }

    /**
     * 设置 嵌套工作流，详细说明：{@link #FIELD_EMBEDPSWFID}
     * <P>
     * 等同 {@link #setEmbedPSWFId}
     * @param embedPSWFId
     */
    @JsonIgnore
    public PSWFProcSubWFDTO embedpswfid(String embedPSWFId){
        this.setEmbedPSWFId(embedPSWFId);
        return this;
    }

    /**
     * 设置 嵌套工作流，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setEmbedPSWFId}
     * @param pSWorkflow 引用对象
     */
    @JsonIgnore
    public PSWFProcSubWFDTO embedpswfid(PSWorkflowDTO pSWorkflow){
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
     * <B>EMBEDPSWFNAME</B>&nbsp;嵌套工作流，指定流程处理子流程嵌入的工作流
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_EMBEDPSWFID}
     */
    public final static String FIELD_EMBEDPSWFNAME = "embedpswfname";

    /**
     * 设置 嵌套工作流，详细说明：{@link #FIELD_EMBEDPSWFNAME}
     * 
     * @param embedPSWFName
     * 
     */
    @JsonProperty(FIELD_EMBEDPSWFNAME)
    public void setEmbedPSWFName(String embedPSWFName){
        this.set(FIELD_EMBEDPSWFNAME, embedPSWFName);
    }
    
    /**
     * 获取 嵌套工作流  
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
     * 判断 嵌套工作流 是否指定值，包括空值
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
     * 重置 嵌套工作流
     */
    @JsonIgnore
    public void resetEmbedPSWFName(){
        this.reset(FIELD_EMBEDPSWFNAME);
    }

    /**
     * 设置 嵌套工作流，详细说明：{@link #FIELD_EMBEDPSWFNAME}
     * <P>
     * 等同 {@link #setEmbedPSWFName}
     * @param embedPSWFName
     */
    @JsonIgnore
    public PSWFProcSubWFDTO embedpswfname(String embedPSWFName){
        this.setEmbedPSWFName(embedPSWFName);
        return this;
    }

    /**
     * <B>EMBEDPSWFVERID</B>&nbsp;嵌套工作流版本，指定流程处理子流程嵌入的工作流的版本，未指定时使用最新版本
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSWFVersionDTO} 
     */
    public final static String FIELD_EMBEDPSWFVERID = "embedpswfverid";

    /**
     * 设置 嵌套工作流版本，详细说明：{@link #FIELD_EMBEDPSWFVERID}
     * 
     * @param embedPSWFVerId
     * 
     */
    @JsonProperty(FIELD_EMBEDPSWFVERID)
    public void setEmbedPSWFVerId(String embedPSWFVerId){
        this.set(FIELD_EMBEDPSWFVERID, embedPSWFVerId);
    }
    
    /**
     * 获取 嵌套工作流版本  
     * @return
     */
    @JsonIgnore
    public String getEmbedPSWFVerId(){
        Object objValue = this.get(FIELD_EMBEDPSWFVERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 嵌套工作流版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEmbedPSWFVerIdDirty(){
        if(this.contains(FIELD_EMBEDPSWFVERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 嵌套工作流版本
     */
    @JsonIgnore
    public void resetEmbedPSWFVerId(){
        this.reset(FIELD_EMBEDPSWFVERID);
    }

    /**
     * 设置 嵌套工作流版本，详细说明：{@link #FIELD_EMBEDPSWFVERID}
     * <P>
     * 等同 {@link #setEmbedPSWFVerId}
     * @param embedPSWFVerId
     */
    @JsonIgnore
    public PSWFProcSubWFDTO embedpswfverid(String embedPSWFVerId){
        this.setEmbedPSWFVerId(embedPSWFVerId);
        return this;
    }

    /**
     * 设置 嵌套工作流版本，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setEmbedPSWFVerId}
     * @param pSWFVersion 引用对象
     */
    @JsonIgnore
    public PSWFProcSubWFDTO embedpswfverid(PSWFVersionDTO pSWFVersion){
        if(pSWFVersion == null){
            this.setEmbedPSWFVerId(null);
            this.setEmbedPSWFVerName(null);
        }
        else{
            this.setEmbedPSWFVerId(pSWFVersion.getPSWFVersionId());
            this.setEmbedPSWFVerName(pSWFVersion.getPSWFVersionName());
        }
        return this;
    }

    /**
     * <B>EMBEDPSWFVERNAME</B>&nbsp;嵌套工作流版本，指定流程处理子流程嵌入的工作流的版本，未指定时使用最新版本
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_EMBEDPSWFVERID}
     */
    public final static String FIELD_EMBEDPSWFVERNAME = "embedpswfvername";

    /**
     * 设置 嵌套工作流版本，详细说明：{@link #FIELD_EMBEDPSWFVERNAME}
     * 
     * @param embedPSWFVerName
     * 
     */
    @JsonProperty(FIELD_EMBEDPSWFVERNAME)
    public void setEmbedPSWFVerName(String embedPSWFVerName){
        this.set(FIELD_EMBEDPSWFVERNAME, embedPSWFVerName);
    }
    
    /**
     * 获取 嵌套工作流版本  
     * @return
     */
    @JsonIgnore
    public String getEmbedPSWFVerName(){
        Object objValue = this.get(FIELD_EMBEDPSWFVERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 嵌套工作流版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEmbedPSWFVerNameDirty(){
        if(this.contains(FIELD_EMBEDPSWFVERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 嵌套工作流版本
     */
    @JsonIgnore
    public void resetEmbedPSWFVerName(){
        this.reset(FIELD_EMBEDPSWFVERNAME);
    }

    /**
     * 设置 嵌套工作流版本，详细说明：{@link #FIELD_EMBEDPSWFVERNAME}
     * <P>
     * 等同 {@link #setEmbedPSWFVerName}
     * @param embedPSWFVerName
     */
    @JsonIgnore
    public PSWFProcSubWFDTO embedpswfvername(String embedPSWFVerName){
        this.setEmbedPSWFVerName(embedPSWFVerName);
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
    public PSWFProcSubWFDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSWFID</B>&nbsp;PSWFID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWFPROCESSID}
     */
    public final static String FIELD_PSWFID = "pswfid";

    /**
     * 设置 PSWFID
     * 
     * @param pSWFId
     * 
     */
    @JsonProperty(FIELD_PSWFID)
    public void setPSWFId(String pSWFId){
        this.set(FIELD_PSWFID, pSWFId);
    }
    
    /**
     * 获取 PSWFID  
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
     * 判断 PSWFID 是否指定值，包括空值
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
     * 重置 PSWFID
     */
    @JsonIgnore
    public void resetPSWFId(){
        this.reset(FIELD_PSWFID);
    }

    /**
     * 设置 PSWFID
     * <P>
     * 等同 {@link #setPSWFId}
     * @param pSWFId
     */
    @JsonIgnore
    public PSWFProcSubWFDTO pswfid(String pSWFId){
        this.setPSWFId(pSWFId);
        return this;
    }

    /**
     * <B>PSWFPROCESSID</B>&nbsp;流程处理，指定流程处理子流程所在的流程处理
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO} 
     */
    public final static String FIELD_PSWFPROCESSID = "pswfprocessid";

    /**
     * 设置 流程处理，详细说明：{@link #FIELD_PSWFPROCESSID}
     * 
     * @param pSWFProcessId
     * 
     */
    @JsonProperty(FIELD_PSWFPROCESSID)
    public void setPSWFProcessId(String pSWFProcessId){
        this.set(FIELD_PSWFPROCESSID, pSWFProcessId);
    }
    
    /**
     * 获取 流程处理  
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
     * 判断 流程处理 是否指定值，包括空值
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
     * 重置 流程处理
     */
    @JsonIgnore
    public void resetPSWFProcessId(){
        this.reset(FIELD_PSWFPROCESSID);
    }

    /**
     * 设置 流程处理，详细说明：{@link #FIELD_PSWFPROCESSID}
     * <P>
     * 等同 {@link #setPSWFProcessId}
     * @param pSWFProcessId
     */
    @JsonIgnore
    public PSWFProcSubWFDTO pswfprocessid(String pSWFProcessId){
        this.setPSWFProcessId(pSWFProcessId);
        return this;
    }

    /**
     * 设置 流程处理，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSWFProcessId}
     * @param pSWFProcess 引用对象
     */
    @JsonIgnore
    public PSWFProcSubWFDTO pswfprocessid(PSWFProcessDTO pSWFProcess){
        if(pSWFProcess == null){
            this.setPSWFId(null);
            this.setPSWFProcessId(null);
            this.setPSWFProcessName(null);
            this.setPSWFVersionId(null);
        }
        else{
            this.setPSWFId(pSWFProcess.getPSWFId());
            this.setPSWFProcessId(pSWFProcess.getPSWFProcessId());
            this.setPSWFProcessName(pSWFProcess.getPSWFProcessName());
            this.setPSWFVersionId(pSWFProcess.getPSWFVersionId());
        }
        return this;
    }

    /**
     * <B>PSWFPROCESSNAME</B>&nbsp;流程处理，指定流程处理子流程所在的流程处理
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWFPROCESSID}
     */
    public final static String FIELD_PSWFPROCESSNAME = "pswfprocessname";

    /**
     * 设置 流程处理，详细说明：{@link #FIELD_PSWFPROCESSNAME}
     * 
     * @param pSWFProcessName
     * 
     */
    @JsonProperty(FIELD_PSWFPROCESSNAME)
    public void setPSWFProcessName(String pSWFProcessName){
        this.set(FIELD_PSWFPROCESSNAME, pSWFProcessName);
    }
    
    /**
     * 获取 流程处理  
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
     * 判断 流程处理 是否指定值，包括空值
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
     * 重置 流程处理
     */
    @JsonIgnore
    public void resetPSWFProcessName(){
        this.reset(FIELD_PSWFPROCESSNAME);
    }

    /**
     * 设置 流程处理，详细说明：{@link #FIELD_PSWFPROCESSNAME}
     * <P>
     * 等同 {@link #setPSWFProcessName}
     * @param pSWFProcessName
     */
    @JsonIgnore
    public PSWFProcSubWFDTO pswfprocessname(String pSWFProcessName){
        this.setPSWFProcessName(pSWFProcessName);
        return this;
    }

    /**
     * <B>PSWFPROCSUBWFID</B>&nbsp;流程处理子流程标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSWFPROCSUBWFID = "pswfprocsubwfid";

    /**
     * 设置 流程处理子流程标识
     * 
     * @param pSWFProcSubWFId
     * 
     */
    @JsonProperty(FIELD_PSWFPROCSUBWFID)
    public void setPSWFProcSubWFId(String pSWFProcSubWFId){
        this.set(FIELD_PSWFPROCSUBWFID, pSWFProcSubWFId);
    }
    
    /**
     * 获取 流程处理子流程标识  
     * @return
     */
    @JsonIgnore
    public String getPSWFProcSubWFId(){
        Object objValue = this.get(FIELD_PSWFPROCSUBWFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程处理子流程标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFProcSubWFIdDirty(){
        if(this.contains(FIELD_PSWFPROCSUBWFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程处理子流程标识
     */
    @JsonIgnore
    public void resetPSWFProcSubWFId(){
        this.reset(FIELD_PSWFPROCSUBWFID);
    }

    /**
     * 设置 流程处理子流程标识
     * <P>
     * 等同 {@link #setPSWFProcSubWFId}
     * @param pSWFProcSubWFId
     */
    @JsonIgnore
    public PSWFProcSubWFDTO pswfprocsubwfid(String pSWFProcSubWFId){
        this.setPSWFProcSubWFId(pSWFProcSubWFId);
        return this;
    }

    /**
     * <B>PSWFPROCSUBWFNAME</B>&nbsp;子流程名称，指定流程处理子流程的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSWFPROCSUBWFNAME = "pswfprocsubwfname";

    /**
     * 设置 子流程名称，详细说明：{@link #FIELD_PSWFPROCSUBWFNAME}
     * 
     * @param pSWFProcSubWFName
     * 
     */
    @JsonProperty(FIELD_PSWFPROCSUBWFNAME)
    public void setPSWFProcSubWFName(String pSWFProcSubWFName){
        this.set(FIELD_PSWFPROCSUBWFNAME, pSWFProcSubWFName);
    }
    
    /**
     * 获取 子流程名称  
     * @return
     */
    @JsonIgnore
    public String getPSWFProcSubWFName(){
        Object objValue = this.get(FIELD_PSWFPROCSUBWFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 子流程名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFProcSubWFNameDirty(){
        if(this.contains(FIELD_PSWFPROCSUBWFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 子流程名称
     */
    @JsonIgnore
    public void resetPSWFProcSubWFName(){
        this.reset(FIELD_PSWFPROCSUBWFNAME);
    }

    /**
     * 设置 子流程名称，详细说明：{@link #FIELD_PSWFPROCSUBWFNAME}
     * <P>
     * 等同 {@link #setPSWFProcSubWFName}
     * @param pSWFProcSubWFName
     */
    @JsonIgnore
    public PSWFProcSubWFDTO pswfprocsubwfname(String pSWFProcSubWFName){
        this.setPSWFProcSubWFName(pSWFProcSubWFName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSWFProcSubWFName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSWFProcSubWFName(strName);
    }

    @JsonIgnore
    public PSWFProcSubWFDTO name(String strName){
        this.setPSWFProcSubWFName(strName);
        return this;
    }

    /**
     * <B>PSWFVERSIONID</B>&nbsp;工作流版本
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWFPROCESSID}
     */
    public final static String FIELD_PSWFVERSIONID = "pswfversionid";

    /**
     * 设置 工作流版本
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
     * 设置 工作流版本
     * <P>
     * 等同 {@link #setPSWFVersionId}
     * @param pSWFVersionId
     */
    @JsonIgnore
    public PSWFProcSubWFDTO pswfversionid(String pSWFVersionId){
        this.setPSWFVersionId(pSWFVersionId);
        return this;
    }

    /**
     * <B>SUSPENDDEFAULT</B>&nbsp;默认挂起，指定流程处理子流程是否默认挂起子流程，挂起子流程将需要通过自动或手动的方式继续流程，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_SUSPENDDEFAULT = "suspenddefault";

    /**
     * 设置 默认挂起，详细说明：{@link #FIELD_SUSPENDDEFAULT}
     * 
     * @param suspendDefault
     * 
     */
    @JsonProperty(FIELD_SUSPENDDEFAULT)
    public void setSuspendDefault(Integer suspendDefault){
        this.set(FIELD_SUSPENDDEFAULT, suspendDefault);
    }
    
    /**
     * 获取 默认挂起  
     * @return
     */
    @JsonIgnore
    public Integer getSuspendDefault(){
        Object objValue = this.get(FIELD_SUSPENDDEFAULT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认挂起 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSuspendDefaultDirty(){
        if(this.contains(FIELD_SUSPENDDEFAULT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认挂起
     */
    @JsonIgnore
    public void resetSuspendDefault(){
        this.reset(FIELD_SUSPENDDEFAULT);
    }

    /**
     * 设置 默认挂起，详细说明：{@link #FIELD_SUSPENDDEFAULT}
     * <P>
     * 等同 {@link #setSuspendDefault}
     * @param suspendDefault
     */
    @JsonIgnore
    public PSWFProcSubWFDTO suspenddefault(Integer suspendDefault){
        this.setSuspendDefault(suspendDefault);
        return this;
    }

     /**
     * 设置 默认挂起，详细说明：{@link #FIELD_SUSPENDDEFAULT}
     * <P>
     * 等同 {@link #setSuspendDefault}
     * @param suspendDefault
     */
    @JsonIgnore
    public PSWFProcSubWFDTO suspenddefault(Boolean suspendDefault){
        if(suspendDefault == null){
            this.setSuspendDefault(null);
        }
        else{
            this.setSuspendDefault(suspendDefault?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSWFProcSubWFDTO updatedate(Timestamp updateDate){
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
    public PSWFProcSubWFDTO updateman(String updateMan){
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
    public PSWFProcSubWFDTO usercat(String userCat){
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
    public PSWFProcSubWFDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat.value);
        }
        return this;
    }

    /**
     * <B>USERDATA</B>&nbsp;处理流程数据，指定流程处理子流程的数据
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_USERDATA = "userdata";

    /**
     * 设置 处理流程数据，详细说明：{@link #FIELD_USERDATA}
     * 
     * @param userData
     * 
     */
    @JsonProperty(FIELD_USERDATA)
    public void setUserData(String userData){
        this.set(FIELD_USERDATA, userData);
    }
    
    /**
     * 获取 处理流程数据  
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
     * 判断 处理流程数据 是否指定值，包括空值
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
     * 重置 处理流程数据
     */
    @JsonIgnore
    public void resetUserData(){
        this.reset(FIELD_USERDATA);
    }

    /**
     * 设置 处理流程数据，详细说明：{@link #FIELD_USERDATA}
     * <P>
     * 等同 {@link #setUserData}
     * @param userData
     */
    @JsonIgnore
    public PSWFProcSubWFDTO userdata(String userData){
        this.setUserData(userData);
        return this;
    }

    /**
     * <B>USERDATA2</B>&nbsp;处理流程数据2，指定流程处理子流程的数据2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_USERDATA2 = "userdata2";

    /**
     * 设置 处理流程数据2，详细说明：{@link #FIELD_USERDATA2}
     * 
     * @param userData2
     * 
     */
    @JsonProperty(FIELD_USERDATA2)
    public void setUserData2(String userData2){
        this.set(FIELD_USERDATA2, userData2);
    }
    
    /**
     * 获取 处理流程数据2  
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
     * 判断 处理流程数据2 是否指定值，包括空值
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
     * 重置 处理流程数据2
     */
    @JsonIgnore
    public void resetUserData2(){
        this.reset(FIELD_USERDATA2);
    }

    /**
     * 设置 处理流程数据2，详细说明：{@link #FIELD_USERDATA2}
     * <P>
     * 等同 {@link #setUserData2}
     * @param userData2
     */
    @JsonIgnore
    public PSWFProcSubWFDTO userdata2(String userData2){
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
    public PSWFProcSubWFDTO usertag(String userTag){
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
    public PSWFProcSubWFDTO usertag2(String userTag2){
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
    public PSWFProcSubWFDTO usertag3(String userTag3){
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
    public PSWFProcSubWFDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSWFProcSubWFId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSWFProcSubWFId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSWFProcSubWFId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSWFProcSubWFId(strValue);
    }

    @JsonIgnore
    public PSWFProcSubWFDTO id(String strValue){
        this.setPSWFProcSubWFId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSWFProcSubWFDTO){
            PSWFProcSubWFDTO dto = (PSWFProcSubWFDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
