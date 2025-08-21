package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSAIPIPELINEJOB</B>系统AI生产线作业 模型传输对象
 * <P>
 * 
 */
public class PSSysAIPipelineJob extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysAIPipelineJob(){
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
    public PSSysAIPipelineJob createdate(String createDate){
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
    public PSSysAIPipelineJob createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>JOBPARAMS</B>&nbsp;作业参数
     */
    public final static String FIELD_JOBPARAMS = "jobparams";

    /**
     * 设置 作业参数
     * 
     * @param jobParams
     * 
     */
    @JsonProperty(FIELD_JOBPARAMS)
    public void setJobParams(String jobParams){
        this.set(FIELD_JOBPARAMS, jobParams);
    }
    
    /**
     * 获取 作业参数  
     * @return
     */
    @JsonIgnore
    public String getJobParams(){
        Object objValue = this.get(FIELD_JOBPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 作业参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isJobParamsDirty(){
        if(this.contains(FIELD_JOBPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 作业参数
     */
    @JsonIgnore
    public void resetJobParams(){
        this.reset(FIELD_JOBPARAMS);
    }

    /**
     * 设置 作业参数
     * <P>
     * 等同 {@link #setJobParams}
     * @param jobParams
     */
    @JsonIgnore
    public PSSysAIPipelineJob jobparams(String jobParams){
        this.setJobParams(jobParams);
        return this;
    }

    /**
     * <B>JOBTAG</B>&nbsp;作业标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_JOBTAG = "jobtag";

    /**
     * 设置 作业标记
     * 
     * @param jobTag
     * 
     */
    @JsonProperty(FIELD_JOBTAG)
    public void setJobTag(String jobTag){
        this.set(FIELD_JOBTAG, jobTag);
    }
    
    /**
     * 获取 作业标记  
     * @return
     */
    @JsonIgnore
    public String getJobTag(){
        Object objValue = this.get(FIELD_JOBTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 作业标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isJobTagDirty(){
        if(this.contains(FIELD_JOBTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 作业标记
     */
    @JsonIgnore
    public void resetJobTag(){
        this.reset(FIELD_JOBTAG);
    }

    /**
     * 设置 作业标记
     * <P>
     * 等同 {@link #setJobTag}
     * @param jobTag
     */
    @JsonIgnore
    public PSSysAIPipelineJob jobtag(String jobTag){
        this.setJobTag(jobTag);
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
    public PSSysAIPipelineJob memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;排序值
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 排序值
     * 
     * @param orderValue
     * 
     */
    @JsonProperty(FIELD_ORDERVALUE)
    public void setOrderValue(Integer orderValue){
        this.set(FIELD_ORDERVALUE, orderValue);
    }
    
    /**
     * 获取 排序值  
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
     * 判断 排序值 是否指定值，包括空值
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
     * 重置 排序值
     */
    @JsonIgnore
    public void resetOrderValue(){
        this.reset(FIELD_ORDERVALUE);
    }

    /**
     * 设置 排序值
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSSysAIPipelineJob ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSDEDATASETID</B>&nbsp;作业数据集
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataSet} 
     */
    public final static String FIELD_PSDEDATASETID = "psdedatasetid";

    /**
     * 设置 作业数据集
     * 
     * @param pSDEDataSetId
     * 
     */
    @JsonProperty(FIELD_PSDEDATASETID)
    public void setPSDEDataSetId(String pSDEDataSetId){
        this.set(FIELD_PSDEDATASETID, pSDEDataSetId);
    }
    
    /**
     * 获取 作业数据集  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataSetId(){
        Object objValue = this.get(FIELD_PSDEDATASETID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 作业数据集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataSetIdDirty(){
        if(this.contains(FIELD_PSDEDATASETID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 作业数据集
     */
    @JsonIgnore
    public void resetPSDEDataSetId(){
        this.reset(FIELD_PSDEDATASETID);
    }

    /**
     * 设置 作业数据集
     * <P>
     * 等同 {@link #setPSDEDataSetId}
     * @param pSDEDataSetId
     */
    @JsonIgnore
    public PSSysAIPipelineJob psdedatasetid(String pSDEDataSetId){
        this.setPSDEDataSetId(pSDEDataSetId);
        return this;
    }

    /**
     * 设置 作业数据集，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDataSetId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSSysAIPipelineJob psdedatasetid(PSDEDataSet pSDEDataSet){
        if(pSDEDataSet == null){
            this.setPSDEDataSetId(null);
            this.setPSDEDataSetName(null);
        }
        else{
            this.setPSDEDataSetId(pSDEDataSet.getPSDEDataSetId());
            this.setPSDEDataSetName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    /**
     * <B>PSDEDATASETNAME</B>&nbsp;作业数据集
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDATASETID}
     */
    public final static String FIELD_PSDEDATASETNAME = "psdedatasetname";

    /**
     * 设置 作业数据集
     * 
     * @param pSDEDataSetName
     * 
     */
    @JsonProperty(FIELD_PSDEDATASETNAME)
    public void setPSDEDataSetName(String pSDEDataSetName){
        this.set(FIELD_PSDEDATASETNAME, pSDEDataSetName);
    }
    
    /**
     * 获取 作业数据集  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataSetName(){
        Object objValue = this.get(FIELD_PSDEDATASETNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 作业数据集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataSetNameDirty(){
        if(this.contains(FIELD_PSDEDATASETNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 作业数据集
     */
    @JsonIgnore
    public void resetPSDEDataSetName(){
        this.reset(FIELD_PSDEDATASETNAME);
    }

    /**
     * 设置 作业数据集
     * <P>
     * 等同 {@link #setPSDEDataSetName}
     * @param pSDEDataSetName
     */
    @JsonIgnore
    public PSSysAIPipelineJob psdedatasetname(String pSDEDataSetName){
        this.setPSDEDataSetName(pSDEDataSetName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;PSDEID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSAIWORKERAGENTID}
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
    public PSSysAIPipelineJob psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * <B>PSSYSAIFACTORYID</B>&nbsp;AI工厂
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysAIFactory} 
     */
    public final static String FIELD_PSSYSAIFACTORYID = "pssysaifactoryid";

    /**
     * 设置 AI工厂
     * 
     * @param pSSysAIFactoryId
     * 
     */
    @JsonProperty(FIELD_PSSYSAIFACTORYID)
    public void setPSSysAIFactoryId(String pSSysAIFactoryId){
        this.set(FIELD_PSSYSAIFACTORYID, pSSysAIFactoryId);
    }
    
    /**
     * 获取 AI工厂  
     * @return
     */
    @JsonIgnore
    public String getPSSysAIFactoryId(){
        Object objValue = this.get(FIELD_PSSYSAIFACTORYID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 AI工厂 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysAIFactoryIdDirty(){
        if(this.contains(FIELD_PSSYSAIFACTORYID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 AI工厂
     */
    @JsonIgnore
    public void resetPSSysAIFactoryId(){
        this.reset(FIELD_PSSYSAIFACTORYID);
    }

    /**
     * 设置 AI工厂
     * <P>
     * 等同 {@link #setPSSysAIFactoryId}
     * @param pSSysAIFactoryId
     */
    @JsonIgnore
    public PSSysAIPipelineJob pssysaifactoryid(String pSSysAIFactoryId){
        this.setPSSysAIFactoryId(pSSysAIFactoryId);
        return this;
    }

    /**
     * 设置 AI工厂，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysAIFactoryId}
     * @param pSSysAIFactory 引用对象
     */
    @JsonIgnore
    public PSSysAIPipelineJob pssysaifactoryid(PSSysAIFactory pSSysAIFactory){
        if(pSSysAIFactory == null){
            this.setPSSysAIFactoryId(null);
            this.setPSSysAIFactoryName(null);
        }
        else{
            this.setPSSysAIFactoryId(pSSysAIFactory.getPSSysAIFactoryId());
            this.setPSSysAIFactoryName(pSSysAIFactory.getPSSysAIFactoryName());
        }
        return this;
    }

    /**
     * <B>PSSYSAIFACTORYNAME</B>&nbsp;AI工厂
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSAIFACTORYID}
     */
    public final static String FIELD_PSSYSAIFACTORYNAME = "pssysaifactoryname";

    /**
     * 设置 AI工厂
     * 
     * @param pSSysAIFactoryName
     * 
     */
    @JsonProperty(FIELD_PSSYSAIFACTORYNAME)
    public void setPSSysAIFactoryName(String pSSysAIFactoryName){
        this.set(FIELD_PSSYSAIFACTORYNAME, pSSysAIFactoryName);
    }
    
    /**
     * 获取 AI工厂  
     * @return
     */
    @JsonIgnore
    public String getPSSysAIFactoryName(){
        Object objValue = this.get(FIELD_PSSYSAIFACTORYNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 AI工厂 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysAIFactoryNameDirty(){
        if(this.contains(FIELD_PSSYSAIFACTORYNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 AI工厂
     */
    @JsonIgnore
    public void resetPSSysAIFactoryName(){
        this.reset(FIELD_PSSYSAIFACTORYNAME);
    }

    /**
     * 设置 AI工厂
     * <P>
     * 等同 {@link #setPSSysAIFactoryName}
     * @param pSSysAIFactoryName
     */
    @JsonIgnore
    public PSSysAIPipelineJob pssysaifactoryname(String pSSysAIFactoryName){
        this.setPSSysAIFactoryName(pSSysAIFactoryName);
        return this;
    }

    /**
     * <B>PSSYSAIPIPELINEAGENTID</B>&nbsp;AI生产线代理
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysAIPipelineAgent} 
     */
    public final static String FIELD_PSSYSAIPIPELINEAGENTID = "pssysaipipelineagentid";

    /**
     * 设置 AI生产线代理
     * 
     * @param pSSysAIPipelineAgentId
     * 
     */
    @JsonProperty(FIELD_PSSYSAIPIPELINEAGENTID)
    public void setPSSysAIPipelineAgentId(String pSSysAIPipelineAgentId){
        this.set(FIELD_PSSYSAIPIPELINEAGENTID, pSSysAIPipelineAgentId);
    }
    
    /**
     * 获取 AI生产线代理  
     * @return
     */
    @JsonIgnore
    public String getPSSysAIPipelineAgentId(){
        Object objValue = this.get(FIELD_PSSYSAIPIPELINEAGENTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 AI生产线代理 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysAIPipelineAgentIdDirty(){
        if(this.contains(FIELD_PSSYSAIPIPELINEAGENTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 AI生产线代理
     */
    @JsonIgnore
    public void resetPSSysAIPipelineAgentId(){
        this.reset(FIELD_PSSYSAIPIPELINEAGENTID);
    }

    /**
     * 设置 AI生产线代理
     * <P>
     * 等同 {@link #setPSSysAIPipelineAgentId}
     * @param pSSysAIPipelineAgentId
     */
    @JsonIgnore
    public PSSysAIPipelineJob pssysaipipelineagentid(String pSSysAIPipelineAgentId){
        this.setPSSysAIPipelineAgentId(pSSysAIPipelineAgentId);
        return this;
    }

    /**
     * 设置 AI生产线代理，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysAIPipelineAgentId}
     * @param pSSysAIPipelineAgent 引用对象
     */
    @JsonIgnore
    public PSSysAIPipelineJob pssysaipipelineagentid(PSSysAIPipelineAgent pSSysAIPipelineAgent){
        if(pSSysAIPipelineAgent == null){
            this.setPSSysAIPipelineAgentId(null);
            this.setPSSysAIPipelineAgentName(null);
        }
        else{
            this.setPSSysAIPipelineAgentId(pSSysAIPipelineAgent.getPSSysAIPipelineAgentId());
            this.setPSSysAIPipelineAgentName(pSSysAIPipelineAgent.getPSSysAIPipelineAgentName());
        }
        return this;
    }

    /**
     * <B>PSSYSAIPIPELINEAGENTNAME</B>&nbsp;AI生产线代理
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSAIPIPELINEAGENTID}
     */
    public final static String FIELD_PSSYSAIPIPELINEAGENTNAME = "pssysaipipelineagentname";

    /**
     * 设置 AI生产线代理
     * 
     * @param pSSysAIPipelineAgentName
     * 
     */
    @JsonProperty(FIELD_PSSYSAIPIPELINEAGENTNAME)
    public void setPSSysAIPipelineAgentName(String pSSysAIPipelineAgentName){
        this.set(FIELD_PSSYSAIPIPELINEAGENTNAME, pSSysAIPipelineAgentName);
    }
    
    /**
     * 获取 AI生产线代理  
     * @return
     */
    @JsonIgnore
    public String getPSSysAIPipelineAgentName(){
        Object objValue = this.get(FIELD_PSSYSAIPIPELINEAGENTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 AI生产线代理 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysAIPipelineAgentNameDirty(){
        if(this.contains(FIELD_PSSYSAIPIPELINEAGENTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 AI生产线代理
     */
    @JsonIgnore
    public void resetPSSysAIPipelineAgentName(){
        this.reset(FIELD_PSSYSAIPIPELINEAGENTNAME);
    }

    /**
     * 设置 AI生产线代理
     * <P>
     * 等同 {@link #setPSSysAIPipelineAgentName}
     * @param pSSysAIPipelineAgentName
     */
    @JsonIgnore
    public PSSysAIPipelineJob pssysaipipelineagentname(String pSSysAIPipelineAgentName){
        this.setPSSysAIPipelineAgentName(pSSysAIPipelineAgentName);
        return this;
    }

    /**
     * <B>PSSYSAIPIPELINEJOBID</B>&nbsp;系统AI生产线作业标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSAIPIPELINEJOBID = "pssysaipipelinejobid";

    /**
     * 设置 系统AI生产线作业标识
     * 
     * @param pSSysAIPipelineJobId
     * 
     */
    @JsonProperty(FIELD_PSSYSAIPIPELINEJOBID)
    public void setPSSysAIPipelineJobId(String pSSysAIPipelineJobId){
        this.set(FIELD_PSSYSAIPIPELINEJOBID, pSSysAIPipelineJobId);
    }
    
    /**
     * 获取 系统AI生产线作业标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysAIPipelineJobId(){
        Object objValue = this.get(FIELD_PSSYSAIPIPELINEJOBID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统AI生产线作业标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysAIPipelineJobIdDirty(){
        if(this.contains(FIELD_PSSYSAIPIPELINEJOBID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统AI生产线作业标识
     */
    @JsonIgnore
    public void resetPSSysAIPipelineJobId(){
        this.reset(FIELD_PSSYSAIPIPELINEJOBID);
    }

    /**
     * 设置 系统AI生产线作业标识
     * <P>
     * 等同 {@link #setPSSysAIPipelineJobId}
     * @param pSSysAIPipelineJobId
     */
    @JsonIgnore
    public PSSysAIPipelineJob pssysaipipelinejobid(String pSSysAIPipelineJobId){
        this.setPSSysAIPipelineJobId(pSSysAIPipelineJobId);
        return this;
    }

    /**
     * <B>PSSYSAIPIPELINEJOBNAME</B>&nbsp;系统AI生产线作业名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSAIPIPELINEJOBNAME = "pssysaipipelinejobname";

    /**
     * 设置 系统AI生产线作业名称
     * 
     * @param pSSysAIPipelineJobName
     * 
     */
    @JsonProperty(FIELD_PSSYSAIPIPELINEJOBNAME)
    public void setPSSysAIPipelineJobName(String pSSysAIPipelineJobName){
        this.set(FIELD_PSSYSAIPIPELINEJOBNAME, pSSysAIPipelineJobName);
    }
    
    /**
     * 获取 系统AI生产线作业名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysAIPipelineJobName(){
        Object objValue = this.get(FIELD_PSSYSAIPIPELINEJOBNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统AI生产线作业名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysAIPipelineJobNameDirty(){
        if(this.contains(FIELD_PSSYSAIPIPELINEJOBNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统AI生产线作业名称
     */
    @JsonIgnore
    public void resetPSSysAIPipelineJobName(){
        this.reset(FIELD_PSSYSAIPIPELINEJOBNAME);
    }

    /**
     * 设置 系统AI生产线作业名称
     * <P>
     * 等同 {@link #setPSSysAIPipelineJobName}
     * @param pSSysAIPipelineJobName
     */
    @JsonIgnore
    public PSSysAIPipelineJob pssysaipipelinejobname(String pSSysAIPipelineJobName){
        this.setPSSysAIPipelineJobName(pSSysAIPipelineJobName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysAIPipelineJobName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysAIPipelineJobName(strName);
    }

    @JsonIgnore
    public PSSysAIPipelineJob name(String strName){
        this.setPSSysAIPipelineJobName(strName);
        return this;
    }

    /**
     * <B>PSSYSAIWORKERAGENTID</B>&nbsp;AI工作者代理
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysAIWorkerAgent} 
     */
    public final static String FIELD_PSSYSAIWORKERAGENTID = "pssysaiworkeragentid";

    /**
     * 设置 AI工作者代理
     * 
     * @param pSSysAIWorkerAgentId
     * 
     */
    @JsonProperty(FIELD_PSSYSAIWORKERAGENTID)
    public void setPSSysAIWorkerAgentId(String pSSysAIWorkerAgentId){
        this.set(FIELD_PSSYSAIWORKERAGENTID, pSSysAIWorkerAgentId);
    }
    
    /**
     * 获取 AI工作者代理  
     * @return
     */
    @JsonIgnore
    public String getPSSysAIWorkerAgentId(){
        Object objValue = this.get(FIELD_PSSYSAIWORKERAGENTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 AI工作者代理 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysAIWorkerAgentIdDirty(){
        if(this.contains(FIELD_PSSYSAIWORKERAGENTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 AI工作者代理
     */
    @JsonIgnore
    public void resetPSSysAIWorkerAgentId(){
        this.reset(FIELD_PSSYSAIWORKERAGENTID);
    }

    /**
     * 设置 AI工作者代理
     * <P>
     * 等同 {@link #setPSSysAIWorkerAgentId}
     * @param pSSysAIWorkerAgentId
     */
    @JsonIgnore
    public PSSysAIPipelineJob pssysaiworkeragentid(String pSSysAIWorkerAgentId){
        this.setPSSysAIWorkerAgentId(pSSysAIWorkerAgentId);
        return this;
    }

    /**
     * 设置 AI工作者代理，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysAIWorkerAgentId}
     * @param pSSysAIWorkerAgent 引用对象
     */
    @JsonIgnore
    public PSSysAIPipelineJob pssysaiworkeragentid(PSSysAIWorkerAgent pSSysAIWorkerAgent){
        if(pSSysAIWorkerAgent == null){
            this.setPSDEId(null);
            this.setPSSysAIWorkerAgentId(null);
            this.setPSSysAIWorkerAgentName(null);
        }
        else{
            this.setPSDEId(pSSysAIWorkerAgent.getPSDEId());
            this.setPSSysAIWorkerAgentId(pSSysAIWorkerAgent.getPSSysAIWorkerAgentId());
            this.setPSSysAIWorkerAgentName(pSSysAIWorkerAgent.getPSSysAIWorkerAgentName());
        }
        return this;
    }

    /**
     * <B>PSSYSAIWORKERAGENTNAME</B>&nbsp;AI工作者代理
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSAIWORKERAGENTID}
     */
    public final static String FIELD_PSSYSAIWORKERAGENTNAME = "pssysaiworkeragentname";

    /**
     * 设置 AI工作者代理
     * 
     * @param pSSysAIWorkerAgentName
     * 
     */
    @JsonProperty(FIELD_PSSYSAIWORKERAGENTNAME)
    public void setPSSysAIWorkerAgentName(String pSSysAIWorkerAgentName){
        this.set(FIELD_PSSYSAIWORKERAGENTNAME, pSSysAIWorkerAgentName);
    }
    
    /**
     * 获取 AI工作者代理  
     * @return
     */
    @JsonIgnore
    public String getPSSysAIWorkerAgentName(){
        Object objValue = this.get(FIELD_PSSYSAIWORKERAGENTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 AI工作者代理 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysAIWorkerAgentNameDirty(){
        if(this.contains(FIELD_PSSYSAIWORKERAGENTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 AI工作者代理
     */
    @JsonIgnore
    public void resetPSSysAIWorkerAgentName(){
        this.reset(FIELD_PSSYSAIWORKERAGENTNAME);
    }

    /**
     * 设置 AI工作者代理
     * <P>
     * 等同 {@link #setPSSysAIWorkerAgentName}
     * @param pSSysAIWorkerAgentName
     */
    @JsonIgnore
    public PSSysAIPipelineJob pssysaiworkeragentname(String pSSysAIWorkerAgentName){
        this.setPSSysAIWorkerAgentName(pSSysAIWorkerAgentName);
        return this;
    }

    /**
     * <B>STEPPSCODELISTID</B>&nbsp;作业步骤代码表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSCodeList} 
     */
    public final static String FIELD_STEPPSCODELISTID = "steppscodelistid";

    /**
     * 设置 作业步骤代码表
     * 
     * @param stepPSCodeListId
     * 
     */
    @JsonProperty(FIELD_STEPPSCODELISTID)
    public void setStepPSCodeListId(String stepPSCodeListId){
        this.set(FIELD_STEPPSCODELISTID, stepPSCodeListId);
    }
    
    /**
     * 获取 作业步骤代码表  
     * @return
     */
    @JsonIgnore
    public String getStepPSCodeListId(){
        Object objValue = this.get(FIELD_STEPPSCODELISTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 作业步骤代码表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStepPSCodeListIdDirty(){
        if(this.contains(FIELD_STEPPSCODELISTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 作业步骤代码表
     */
    @JsonIgnore
    public void resetStepPSCodeListId(){
        this.reset(FIELD_STEPPSCODELISTID);
    }

    /**
     * 设置 作业步骤代码表
     * <P>
     * 等同 {@link #setStepPSCodeListId}
     * @param stepPSCodeListId
     */
    @JsonIgnore
    public PSSysAIPipelineJob steppscodelistid(String stepPSCodeListId){
        this.setStepPSCodeListId(stepPSCodeListId);
        return this;
    }

    /**
     * 设置 作业步骤代码表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setStepPSCodeListId}
     * @param pSCodeList 引用对象
     */
    @JsonIgnore
    public PSSysAIPipelineJob steppscodelistid(PSCodeList pSCodeList){
        if(pSCodeList == null){
            this.setStepPSCodeListId(null);
            this.setStepPSCodeListName(null);
        }
        else{
            this.setStepPSCodeListId(pSCodeList.getPSCodeListId());
            this.setStepPSCodeListName(pSCodeList.getPSCodeListName());
        }
        return this;
    }

    /**
     * <B>STEPPSCODELISTNAME</B>&nbsp;作业步骤代码表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_STEPPSCODELISTID}
     */
    public final static String FIELD_STEPPSCODELISTNAME = "steppscodelistname";

    /**
     * 设置 作业步骤代码表
     * 
     * @param stepPSCodeListName
     * 
     */
    @JsonProperty(FIELD_STEPPSCODELISTNAME)
    public void setStepPSCodeListName(String stepPSCodeListName){
        this.set(FIELD_STEPPSCODELISTNAME, stepPSCodeListName);
    }
    
    /**
     * 获取 作业步骤代码表  
     * @return
     */
    @JsonIgnore
    public String getStepPSCodeListName(){
        Object objValue = this.get(FIELD_STEPPSCODELISTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 作业步骤代码表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStepPSCodeListNameDirty(){
        if(this.contains(FIELD_STEPPSCODELISTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 作业步骤代码表
     */
    @JsonIgnore
    public void resetStepPSCodeListName(){
        this.reset(FIELD_STEPPSCODELISTNAME);
    }

    /**
     * 设置 作业步骤代码表
     * <P>
     * 等同 {@link #setStepPSCodeListName}
     * @param stepPSCodeListName
     */
    @JsonIgnore
    public PSSysAIPipelineJob steppscodelistname(String stepPSCodeListName){
        this.setStepPSCodeListName(stepPSCodeListName);
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
    public PSSysAIPipelineJob updatedate(String updateDate){
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
    public PSSysAIPipelineJob updateman(String updateMan){
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
    public PSSysAIPipelineJob usercat(String userCat){
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
    public PSSysAIPipelineJob usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysAIPipelineJob usertag(String userTag){
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
    public PSSysAIPipelineJob usertag2(String userTag2){
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
    public PSSysAIPipelineJob usertag3(String userTag3){
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
    public PSSysAIPipelineJob usertag4(String userTag4){
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
    public PSSysAIPipelineJob validflag(Integer validFlag){
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
    public PSSysAIPipelineJob validflag(Boolean validFlag){
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
        return this.getPSSysAIPipelineJobId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysAIPipelineJobId(strValue);
    }

    @JsonIgnore
    public PSSysAIPipelineJob id(String strValue){
        this.setPSSysAIPipelineJobId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysAIPipelineJob){
            PSSysAIPipelineJob model = (PSSysAIPipelineJob)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
