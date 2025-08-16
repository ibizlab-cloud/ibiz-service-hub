package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSAIWORKERAGENT</B>系统AI工作者代理 模型传输对象
 * <P>
 * 
 */
public class PSSysAIWorkerAgent extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysAIWorkerAgent(){
        this.setValidFlag(1);
    }      

    /**
     * <B>AIWORKERAGENTPARAMS</B>&nbsp;代理参数
     */
    public final static String FIELD_AIWORKERAGENTPARAMS = "aiworkeragentparams";

    /**
     * 设置 代理参数
     * 
     * @param aIWorkerAgentParams
     * 
     */
    @JsonProperty(FIELD_AIWORKERAGENTPARAMS)
    public void setAIWorkerAgentParams(String aIWorkerAgentParams){
        this.set(FIELD_AIWORKERAGENTPARAMS, aIWorkerAgentParams);
    }
    
    /**
     * 获取 代理参数  
     * @return
     */
    @JsonIgnore
    public String getAIWorkerAgentParams(){
        Object objValue = this.get(FIELD_AIWORKERAGENTPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代理参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAIWorkerAgentParamsDirty(){
        if(this.contains(FIELD_AIWORKERAGENTPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代理参数
     */
    @JsonIgnore
    public void resetAIWorkerAgentParams(){
        this.reset(FIELD_AIWORKERAGENTPARAMS);
    }

    /**
     * 设置 代理参数
     * <P>
     * 等同 {@link #setAIWorkerAgentParams}
     * @param aIWorkerAgentParams
     */
    @JsonIgnore
    public PSSysAIWorkerAgent aiworkeragentparams(String aIWorkerAgentParams){
        this.setAIWorkerAgentParams(aIWorkerAgentParams);
        return this;
    }

    /**
     * <B>AIWORKERAGENTTAG</B>&nbsp;代理标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_AIWORKERAGENTTAG = "aiworkeragenttag";

    /**
     * 设置 代理标记
     * 
     * @param aIWorkerAgentTag
     * 
     */
    @JsonProperty(FIELD_AIWORKERAGENTTAG)
    public void setAIWorkerAgentTag(String aIWorkerAgentTag){
        this.set(FIELD_AIWORKERAGENTTAG, aIWorkerAgentTag);
    }
    
    /**
     * 获取 代理标记  
     * @return
     */
    @JsonIgnore
    public String getAIWorkerAgentTag(){
        Object objValue = this.get(FIELD_AIWORKERAGENTTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代理标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAIWorkerAgentTagDirty(){
        if(this.contains(FIELD_AIWORKERAGENTTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代理标记
     */
    @JsonIgnore
    public void resetAIWorkerAgentTag(){
        this.reset(FIELD_AIWORKERAGENTTAG);
    }

    /**
     * 设置 代理标记
     * <P>
     * 等同 {@link #setAIWorkerAgentTag}
     * @param aIWorkerAgentTag
     */
    @JsonIgnore
    public PSSysAIWorkerAgent aiworkeragenttag(String aIWorkerAgentTag){
        this.setAIWorkerAgentTag(aIWorkerAgentTag);
        return this;
    }

    /**
     * <B>AIWORKERAGENTTAG2</B>&nbsp;代理标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_AIWORKERAGENTTAG2 = "aiworkeragenttag2";

    /**
     * 设置 代理标记2
     * 
     * @param aIWorkerAgentTag2
     * 
     */
    @JsonProperty(FIELD_AIWORKERAGENTTAG2)
    public void setAIWorkerAgentTag2(String aIWorkerAgentTag2){
        this.set(FIELD_AIWORKERAGENTTAG2, aIWorkerAgentTag2);
    }
    
    /**
     * 获取 代理标记2  
     * @return
     */
    @JsonIgnore
    public String getAIWorkerAgentTag2(){
        Object objValue = this.get(FIELD_AIWORKERAGENTTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代理标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAIWorkerAgentTag2Dirty(){
        if(this.contains(FIELD_AIWORKERAGENTTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代理标记2
     */
    @JsonIgnore
    public void resetAIWorkerAgentTag2(){
        this.reset(FIELD_AIWORKERAGENTTAG2);
    }

    /**
     * 设置 代理标记2
     * <P>
     * 等同 {@link #setAIWorkerAgentTag2}
     * @param aIWorkerAgentTag2
     */
    @JsonIgnore
    public PSSysAIWorkerAgent aiworkeragenttag2(String aIWorkerAgentTag2){
        this.setAIWorkerAgentTag2(aIWorkerAgentTag2);
        return this;
    }

    /**
     * <B>AIWORKERAGENTTYPE</B>&nbsp;代理类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.AIWorkerAgentType} 
     */
    public final static String FIELD_AIWORKERAGENTTYPE = "aiworkeragenttype";

    /**
     * 设置 代理类型
     * 
     * @param aIWorkerAgentType
     * 
     */
    @JsonProperty(FIELD_AIWORKERAGENTTYPE)
    public void setAIWorkerAgentType(String aIWorkerAgentType){
        this.set(FIELD_AIWORKERAGENTTYPE, aIWorkerAgentType);
    }
    
    /**
     * 获取 代理类型  
     * @return
     */
    @JsonIgnore
    public String getAIWorkerAgentType(){
        Object objValue = this.get(FIELD_AIWORKERAGENTTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代理类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAIWorkerAgentTypeDirty(){
        if(this.contains(FIELD_AIWORKERAGENTTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代理类型
     */
    @JsonIgnore
    public void resetAIWorkerAgentType(){
        this.reset(FIELD_AIWORKERAGENTTYPE);
    }

    /**
     * 设置 代理类型
     * <P>
     * 等同 {@link #setAIWorkerAgentType}
     * @param aIWorkerAgentType
     */
    @JsonIgnore
    public PSSysAIWorkerAgent aiworkeragenttype(String aIWorkerAgentType){
        this.setAIWorkerAgentType(aIWorkerAgentType);
        return this;
    }

     /**
     * 设置 代理类型
     * <P>
     * 等同 {@link #setAIWorkerAgentType}
     * @param aIWorkerAgentType
     */
    @JsonIgnore
    public PSSysAIWorkerAgent aiworkeragenttype(net.ibizsys.psmodel.core.util.PSModelEnums.AIWorkerAgentType aIWorkerAgentType){
        if(aIWorkerAgentType == null){
            this.setAIWorkerAgentType(null);
        }
        else{
            this.setAIWorkerAgentType(aIWorkerAgentType.value);
        }
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码名称
     * <P>
     * 字符串：最大长度 60，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_CODENAME = "codename";

    /**
     * 设置 代码名称
     * 
     * @param codeName
     * 
     */
    @JsonProperty(FIELD_CODENAME)
    public void setCodeName(String codeName){
        this.set(FIELD_CODENAME, codeName);
    }
    
    /**
     * 获取 代码名称  
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
     * 判断 代码名称 是否指定值，包括空值
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
     * 重置 代码名称
     */
    @JsonIgnore
    public void resetCodeName(){
        this.reset(FIELD_CODENAME);
    }

    /**
     * 设置 代码名称
     * <P>
     * 等同 {@link #setCodeName}
     * @param codeName
     */
    @JsonIgnore
    public PSSysAIWorkerAgent codename(String codeName){
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
    public PSSysAIWorkerAgent createdate(String createDate){
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
    public PSSysAIWorkerAgent createman(String createMan){
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
    public PSSysAIWorkerAgent memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 实体
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
     * 设置 实体
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSSysAIWorkerAgent psdeid(String pSDEId){
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
    public PSSysAIWorkerAgent psdeid(PSDataEntity pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_PSDENAME = "psdename";

    /**
     * 设置 实体
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
     * 设置 实体
     * <P>
     * 等同 {@link #setPSDEName}
     * @param pSDEName
     */
    @JsonIgnore
    public PSSysAIWorkerAgent psdename(String pSDEName){
        this.setPSDEName(pSDEName);
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
    public PSSysAIWorkerAgent pssysaifactoryid(String pSSysAIFactoryId){
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
    public PSSysAIWorkerAgent pssysaifactoryid(PSSysAIFactory pSSysAIFactory){
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
    public PSSysAIWorkerAgent pssysaifactoryname(String pSSysAIFactoryName){
        this.setPSSysAIFactoryName(pSSysAIFactoryName);
        return this;
    }

    /**
     * <B>PSSYSAIWORKERAGENTID</B>&nbsp;代理标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSAIWORKERAGENTID = "pssysaiworkeragentid";

    /**
     * 设置 代理标识
     * 
     * @param pSSysAIWorkerAgentId
     * 
     */
    @JsonProperty(FIELD_PSSYSAIWORKERAGENTID)
    public void setPSSysAIWorkerAgentId(String pSSysAIWorkerAgentId){
        this.set(FIELD_PSSYSAIWORKERAGENTID, pSSysAIWorkerAgentId);
    }
    
    /**
     * 获取 代理标识  
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
     * 判断 代理标识 是否指定值，包括空值
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
     * 重置 代理标识
     */
    @JsonIgnore
    public void resetPSSysAIWorkerAgentId(){
        this.reset(FIELD_PSSYSAIWORKERAGENTID);
    }

    /**
     * 设置 代理标识
     * <P>
     * 等同 {@link #setPSSysAIWorkerAgentId}
     * @param pSSysAIWorkerAgentId
     */
    @JsonIgnore
    public PSSysAIWorkerAgent pssysaiworkeragentid(String pSSysAIWorkerAgentId){
        this.setPSSysAIWorkerAgentId(pSSysAIWorkerAgentId);
        return this;
    }

    /**
     * <B>PSSYSAIWORKERAGENTNAME</B>&nbsp;代理名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSAIWORKERAGENTNAME = "pssysaiworkeragentname";

    /**
     * 设置 代理名称
     * 
     * @param pSSysAIWorkerAgentName
     * 
     */
    @JsonProperty(FIELD_PSSYSAIWORKERAGENTNAME)
    public void setPSSysAIWorkerAgentName(String pSSysAIWorkerAgentName){
        this.set(FIELD_PSSYSAIWORKERAGENTNAME, pSSysAIWorkerAgentName);
    }
    
    /**
     * 获取 代理名称  
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
     * 判断 代理名称 是否指定值，包括空值
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
     * 重置 代理名称
     */
    @JsonIgnore
    public void resetPSSysAIWorkerAgentName(){
        this.reset(FIELD_PSSYSAIWORKERAGENTNAME);
    }

    /**
     * 设置 代理名称
     * <P>
     * 等同 {@link #setPSSysAIWorkerAgentName}
     * @param pSSysAIWorkerAgentName
     */
    @JsonIgnore
    public PSSysAIWorkerAgent pssysaiworkeragentname(String pSSysAIWorkerAgentName){
        this.setPSSysAIWorkerAgentName(pSSysAIWorkerAgentName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysAIWorkerAgentName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysAIWorkerAgentName(strName);
    }

    @JsonIgnore
    public PSSysAIWorkerAgent name(String strName){
        this.setPSSysAIWorkerAgentName(strName);
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINID</B>&nbsp;后端模板插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysSFPlugin} 
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
    public PSSysAIWorkerAgent pssyssfpluginid(String pSSysSFPluginId){
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
    public PSSysAIWorkerAgent pssyssfpluginid(PSSysSFPlugin pSSysSFPlugin){
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
    public PSSysAIWorkerAgent pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
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
    public PSSysAIWorkerAgent updatedate(String updateDate){
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
    public PSSysAIWorkerAgent updateman(String updateMan){
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
    public PSSysAIWorkerAgent usercat(String userCat){
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
    public PSSysAIWorkerAgent usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysAIWorkerAgent usertag(String userTag){
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
    public PSSysAIWorkerAgent usertag2(String userTag2){
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
    public PSSysAIWorkerAgent usertag3(String userTag3){
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
    public PSSysAIWorkerAgent usertag4(String userTag4){
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
    public PSSysAIWorkerAgent validflag(Integer validFlag){
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
    public PSSysAIWorkerAgent validflag(Boolean validFlag){
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
        return this.getPSSysAIWorkerAgentId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysAIWorkerAgentId(strValue);
    }

    @JsonIgnore
    public PSSysAIWorkerAgent id(String strValue){
        this.setPSSysAIWorkerAgentId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysAIWorkerAgent){
            PSSysAIWorkerAgent model = (PSSysAIWorkerAgent)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
