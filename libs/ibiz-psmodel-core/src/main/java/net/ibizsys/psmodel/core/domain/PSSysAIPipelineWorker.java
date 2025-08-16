package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSAIPIPELINEWORKER</B>AI生产线工作者 模型传输对象
 * <P>
 * 
 */
public class PSSysAIPipelineWorker extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysAIPipelineWorker(){
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
    public PSSysAIPipelineWorker createdate(String createDate){
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
    public PSSysAIPipelineWorker createman(String createMan){
        this.setCreateMan(createMan);
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
    public PSSysAIPipelineWorker memo(String memo){
        this.setMemo(memo);
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
    public PSSysAIPipelineWorker pssysaifactoryid(String pSSysAIFactoryId){
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
    public PSSysAIPipelineWorker pssysaifactoryid(PSSysAIFactory pSSysAIFactory){
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
    public PSSysAIPipelineWorker pssysaifactoryname(String pSSysAIFactoryName){
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
    public PSSysAIPipelineWorker pssysaipipelineagentid(String pSSysAIPipelineAgentId){
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
    public PSSysAIPipelineWorker pssysaipipelineagentid(PSSysAIPipelineAgent pSSysAIPipelineAgent){
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
    public PSSysAIPipelineWorker pssysaipipelineagentname(String pSSysAIPipelineAgentName){
        this.setPSSysAIPipelineAgentName(pSSysAIPipelineAgentName);
        return this;
    }

    /**
     * <B>PSSYSAIPIPELINEWORKERID</B>&nbsp;AI生产线工作者标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSAIPIPELINEWORKERID = "pssysaipipelineworkerid";

    /**
     * 设置 AI生产线工作者标识
     * 
     * @param pSSysAIPipelineWorkerId
     * 
     */
    @JsonProperty(FIELD_PSSYSAIPIPELINEWORKERID)
    public void setPSSysAIPipelineWorkerId(String pSSysAIPipelineWorkerId){
        this.set(FIELD_PSSYSAIPIPELINEWORKERID, pSSysAIPipelineWorkerId);
    }
    
    /**
     * 获取 AI生产线工作者标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysAIPipelineWorkerId(){
        Object objValue = this.get(FIELD_PSSYSAIPIPELINEWORKERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 AI生产线工作者标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysAIPipelineWorkerIdDirty(){
        if(this.contains(FIELD_PSSYSAIPIPELINEWORKERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 AI生产线工作者标识
     */
    @JsonIgnore
    public void resetPSSysAIPipelineWorkerId(){
        this.reset(FIELD_PSSYSAIPIPELINEWORKERID);
    }

    /**
     * 设置 AI生产线工作者标识
     * <P>
     * 等同 {@link #setPSSysAIPipelineWorkerId}
     * @param pSSysAIPipelineWorkerId
     */
    @JsonIgnore
    public PSSysAIPipelineWorker pssysaipipelineworkerid(String pSSysAIPipelineWorkerId){
        this.setPSSysAIPipelineWorkerId(pSSysAIPipelineWorkerId);
        return this;
    }

    /**
     * <B>PSSYSAIPIPELINEWORKERNAME</B>&nbsp;AI生产线工作者名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSAIPIPELINEWORKERNAME = "pssysaipipelineworkername";

    /**
     * 设置 AI生产线工作者名称
     * 
     * @param pSSysAIPipelineWorkerName
     * 
     */
    @JsonProperty(FIELD_PSSYSAIPIPELINEWORKERNAME)
    public void setPSSysAIPipelineWorkerName(String pSSysAIPipelineWorkerName){
        this.set(FIELD_PSSYSAIPIPELINEWORKERNAME, pSSysAIPipelineWorkerName);
    }
    
    /**
     * 获取 AI生产线工作者名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysAIPipelineWorkerName(){
        Object objValue = this.get(FIELD_PSSYSAIPIPELINEWORKERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 AI生产线工作者名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysAIPipelineWorkerNameDirty(){
        if(this.contains(FIELD_PSSYSAIPIPELINEWORKERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 AI生产线工作者名称
     */
    @JsonIgnore
    public void resetPSSysAIPipelineWorkerName(){
        this.reset(FIELD_PSSYSAIPIPELINEWORKERNAME);
    }

    /**
     * 设置 AI生产线工作者名称
     * <P>
     * 等同 {@link #setPSSysAIPipelineWorkerName}
     * @param pSSysAIPipelineWorkerName
     */
    @JsonIgnore
    public PSSysAIPipelineWorker pssysaipipelineworkername(String pSSysAIPipelineWorkerName){
        this.setPSSysAIPipelineWorkerName(pSSysAIPipelineWorkerName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysAIPipelineWorkerName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysAIPipelineWorkerName(strName);
    }

    @JsonIgnore
    public PSSysAIPipelineWorker name(String strName){
        this.setPSSysAIPipelineWorkerName(strName);
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
    public PSSysAIPipelineWorker pssysaiworkeragentid(String pSSysAIWorkerAgentId){
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
    public PSSysAIPipelineWorker pssysaiworkeragentid(PSSysAIWorkerAgent pSSysAIWorkerAgent){
        if(pSSysAIWorkerAgent == null){
            this.setPSSysAIWorkerAgentId(null);
            this.setPSSysAIWorkerAgentName(null);
        }
        else{
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
    public PSSysAIPipelineWorker pssysaiworkeragentname(String pSSysAIWorkerAgentName){
        this.setPSSysAIWorkerAgentName(pSSysAIWorkerAgentName);
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
    public PSSysAIPipelineWorker updatedate(String updateDate){
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
    public PSSysAIPipelineWorker updateman(String updateMan){
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
    public PSSysAIPipelineWorker usercat(String userCat){
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
    public PSSysAIPipelineWorker usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysAIPipelineWorker usertag(String userTag){
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
    public PSSysAIPipelineWorker usertag2(String userTag2){
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
    public PSSysAIPipelineWorker usertag3(String userTag3){
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
    public PSSysAIPipelineWorker usertag4(String userTag4){
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
    public PSSysAIPipelineWorker validflag(Integer validFlag){
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
    public PSSysAIPipelineWorker validflag(Boolean validFlag){
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
        return this.getPSSysAIPipelineWorkerId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysAIPipelineWorkerId(strValue);
    }

    @JsonIgnore
    public PSSysAIPipelineWorker id(String strValue){
        this.setPSSysAIPipelineWorkerId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysAIPipelineWorker){
            PSSysAIPipelineWorker model = (PSSysAIPipelineWorker)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
