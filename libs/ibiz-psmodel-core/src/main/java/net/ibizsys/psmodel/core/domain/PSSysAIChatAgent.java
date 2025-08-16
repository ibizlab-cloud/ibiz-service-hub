package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSAICHATAGENT</B>系统AI交谈代理 模型传输对象
 * <P>
 * 
 */
public class PSSysAIChatAgent extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysAIChatAgent(){
        this.setValidFlag(1);
    }      

    /**
     * <B>AICHATAGENTPARAMS</B>&nbsp;代理参数
     */
    public final static String FIELD_AICHATAGENTPARAMS = "aichatagentparams";

    /**
     * 设置 代理参数
     * 
     * @param aIChatAgentParams
     * 
     */
    @JsonProperty(FIELD_AICHATAGENTPARAMS)
    public void setAIChatAgentParams(String aIChatAgentParams){
        this.set(FIELD_AICHATAGENTPARAMS, aIChatAgentParams);
    }
    
    /**
     * 获取 代理参数  
     * @return
     */
    @JsonIgnore
    public String getAIChatAgentParams(){
        Object objValue = this.get(FIELD_AICHATAGENTPARAMS);
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
    public boolean isAIChatAgentParamsDirty(){
        if(this.contains(FIELD_AICHATAGENTPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代理参数
     */
    @JsonIgnore
    public void resetAIChatAgentParams(){
        this.reset(FIELD_AICHATAGENTPARAMS);
    }

    /**
     * 设置 代理参数
     * <P>
     * 等同 {@link #setAIChatAgentParams}
     * @param aIChatAgentParams
     */
    @JsonIgnore
    public PSSysAIChatAgent aichatagentparams(String aIChatAgentParams){
        this.setAIChatAgentParams(aIChatAgentParams);
        return this;
    }

    /**
     * <B>AICHATAGENTTAG</B>&nbsp;代理标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_AICHATAGENTTAG = "aichatagenttag";

    /**
     * 设置 代理标记
     * 
     * @param aIChatAgentTag
     * 
     */
    @JsonProperty(FIELD_AICHATAGENTTAG)
    public void setAIChatAgentTag(String aIChatAgentTag){
        this.set(FIELD_AICHATAGENTTAG, aIChatAgentTag);
    }
    
    /**
     * 获取 代理标记  
     * @return
     */
    @JsonIgnore
    public String getAIChatAgentTag(){
        Object objValue = this.get(FIELD_AICHATAGENTTAG);
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
    public boolean isAIChatAgentTagDirty(){
        if(this.contains(FIELD_AICHATAGENTTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代理标记
     */
    @JsonIgnore
    public void resetAIChatAgentTag(){
        this.reset(FIELD_AICHATAGENTTAG);
    }

    /**
     * 设置 代理标记
     * <P>
     * 等同 {@link #setAIChatAgentTag}
     * @param aIChatAgentTag
     */
    @JsonIgnore
    public PSSysAIChatAgent aichatagenttag(String aIChatAgentTag){
        this.setAIChatAgentTag(aIChatAgentTag);
        return this;
    }

    /**
     * <B>AICHATAGENTTAG2</B>&nbsp;代理标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_AICHATAGENTTAG2 = "aichatagenttag2";

    /**
     * 设置 代理标记2
     * 
     * @param aIChatAgentTag2
     * 
     */
    @JsonProperty(FIELD_AICHATAGENTTAG2)
    public void setAIChatAgentTag2(String aIChatAgentTag2){
        this.set(FIELD_AICHATAGENTTAG2, aIChatAgentTag2);
    }
    
    /**
     * 获取 代理标记2  
     * @return
     */
    @JsonIgnore
    public String getAIChatAgentTag2(){
        Object objValue = this.get(FIELD_AICHATAGENTTAG2);
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
    public boolean isAIChatAgentTag2Dirty(){
        if(this.contains(FIELD_AICHATAGENTTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代理标记2
     */
    @JsonIgnore
    public void resetAIChatAgentTag2(){
        this.reset(FIELD_AICHATAGENTTAG2);
    }

    /**
     * 设置 代理标记2
     * <P>
     * 等同 {@link #setAIChatAgentTag2}
     * @param aIChatAgentTag2
     */
    @JsonIgnore
    public PSSysAIChatAgent aichatagenttag2(String aIChatAgentTag2){
        this.setAIChatAgentTag2(aIChatAgentTag2);
        return this;
    }

    /**
     * <B>AICHATAGENTTYPE</B>&nbsp;代理类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.AIChatAgentType} 
     */
    public final static String FIELD_AICHATAGENTTYPE = "aichatagenttype";

    /**
     * 设置 代理类型
     * 
     * @param aIChatAgentType
     * 
     */
    @JsonProperty(FIELD_AICHATAGENTTYPE)
    public void setAIChatAgentType(String aIChatAgentType){
        this.set(FIELD_AICHATAGENTTYPE, aIChatAgentType);
    }
    
    /**
     * 获取 代理类型  
     * @return
     */
    @JsonIgnore
    public String getAIChatAgentType(){
        Object objValue = this.get(FIELD_AICHATAGENTTYPE);
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
    public boolean isAIChatAgentTypeDirty(){
        if(this.contains(FIELD_AICHATAGENTTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代理类型
     */
    @JsonIgnore
    public void resetAIChatAgentType(){
        this.reset(FIELD_AICHATAGENTTYPE);
    }

    /**
     * 设置 代理类型
     * <P>
     * 等同 {@link #setAIChatAgentType}
     * @param aIChatAgentType
     */
    @JsonIgnore
    public PSSysAIChatAgent aichatagenttype(String aIChatAgentType){
        this.setAIChatAgentType(aIChatAgentType);
        return this;
    }

     /**
     * 设置 代理类型
     * <P>
     * 等同 {@link #setAIChatAgentType}
     * @param aIChatAgentType
     */
    @JsonIgnore
    public PSSysAIChatAgent aichatagenttype(net.ibizsys.psmodel.core.util.PSModelEnums.AIChatAgentType aIChatAgentType){
        if(aIChatAgentType == null){
            this.setAIChatAgentType(null);
        }
        else{
            this.setAIChatAgentType(aIChatAgentType.value);
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
    public PSSysAIChatAgent codename(String codeName){
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
    public PSSysAIChatAgent createdate(String createDate){
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
    public PSSysAIChatAgent createman(String createMan){
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
    public PSSysAIChatAgent memo(String memo){
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
    public PSSysAIChatAgent psdeid(String pSDEId){
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
    public PSSysAIChatAgent psdeid(PSDataEntity pSDataEntity){
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
    public PSSysAIChatAgent psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSSYSAICHATAGENTID</B>&nbsp;系统AI交谈代理标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSAICHATAGENTID = "pssysaichatagentid";

    /**
     * 设置 系统AI交谈代理标识
     * 
     * @param pSSysAIChatAgentId
     * 
     */
    @JsonProperty(FIELD_PSSYSAICHATAGENTID)
    public void setPSSysAIChatAgentId(String pSSysAIChatAgentId){
        this.set(FIELD_PSSYSAICHATAGENTID, pSSysAIChatAgentId);
    }
    
    /**
     * 获取 系统AI交谈代理标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysAIChatAgentId(){
        Object objValue = this.get(FIELD_PSSYSAICHATAGENTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统AI交谈代理标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysAIChatAgentIdDirty(){
        if(this.contains(FIELD_PSSYSAICHATAGENTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统AI交谈代理标识
     */
    @JsonIgnore
    public void resetPSSysAIChatAgentId(){
        this.reset(FIELD_PSSYSAICHATAGENTID);
    }

    /**
     * 设置 系统AI交谈代理标识
     * <P>
     * 等同 {@link #setPSSysAIChatAgentId}
     * @param pSSysAIChatAgentId
     */
    @JsonIgnore
    public PSSysAIChatAgent pssysaichatagentid(String pSSysAIChatAgentId){
        this.setPSSysAIChatAgentId(pSSysAIChatAgentId);
        return this;
    }

    /**
     * <B>PSSYSAICHATAGENTNAME</B>&nbsp;代理名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSAICHATAGENTNAME = "pssysaichatagentname";

    /**
     * 设置 代理名称
     * 
     * @param pSSysAIChatAgentName
     * 
     */
    @JsonProperty(FIELD_PSSYSAICHATAGENTNAME)
    public void setPSSysAIChatAgentName(String pSSysAIChatAgentName){
        this.set(FIELD_PSSYSAICHATAGENTNAME, pSSysAIChatAgentName);
    }
    
    /**
     * 获取 代理名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysAIChatAgentName(){
        Object objValue = this.get(FIELD_PSSYSAICHATAGENTNAME);
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
    public boolean isPSSysAIChatAgentNameDirty(){
        if(this.contains(FIELD_PSSYSAICHATAGENTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代理名称
     */
    @JsonIgnore
    public void resetPSSysAIChatAgentName(){
        this.reset(FIELD_PSSYSAICHATAGENTNAME);
    }

    /**
     * 设置 代理名称
     * <P>
     * 等同 {@link #setPSSysAIChatAgentName}
     * @param pSSysAIChatAgentName
     */
    @JsonIgnore
    public PSSysAIChatAgent pssysaichatagentname(String pSSysAIChatAgentName){
        this.setPSSysAIChatAgentName(pSSysAIChatAgentName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysAIChatAgentName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysAIChatAgentName(strName);
    }

    @JsonIgnore
    public PSSysAIChatAgent name(String strName){
        this.setPSSysAIChatAgentName(strName);
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
    public PSSysAIChatAgent pssysaifactoryid(String pSSysAIFactoryId){
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
    public PSSysAIChatAgent pssysaifactoryid(PSSysAIFactory pSSysAIFactory){
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
    public PSSysAIChatAgent pssysaifactoryname(String pSSysAIFactoryName){
        this.setPSSysAIFactoryName(pSSysAIFactoryName);
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
    public PSSysAIChatAgent pssyssfpluginid(String pSSysSFPluginId){
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
    public PSSysAIChatAgent pssyssfpluginid(PSSysSFPlugin pSSysSFPlugin){
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
    public PSSysAIChatAgent pssyssfpluginname(String pSSysSFPluginName){
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
    public PSSysAIChatAgent updatedate(String updateDate){
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
    public PSSysAIChatAgent updateman(String updateMan){
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
    public PSSysAIChatAgent usercat(String userCat){
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
    public PSSysAIChatAgent usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysAIChatAgent usertag(String userTag){
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
    public PSSysAIChatAgent usertag2(String userTag2){
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
    public PSSysAIChatAgent usertag3(String userTag3){
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
    public PSSysAIChatAgent usertag4(String userTag4){
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
    public PSSysAIChatAgent validflag(Integer validFlag){
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
    public PSSysAIChatAgent validflag(Boolean validFlag){
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
        return this.getPSSysAIChatAgentId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysAIChatAgentId(strValue);
    }

    @JsonIgnore
    public PSSysAIChatAgent id(String strValue){
        this.setPSSysAIChatAgentId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysAIChatAgent){
            PSSysAIChatAgent model = (PSSysAIChatAgent)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
