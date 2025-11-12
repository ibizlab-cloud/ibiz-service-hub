package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSUNISTATE</B>系统状态协同 模型传输对象
 * <P>
 * 系统全局状态协同的模型，协同模型默认以zk作为功能载体，定义节点的目录及数据项：/目录1/目录2/目录3/数据标识：{状态1、状态2、...状态8}。
 */
public class PSSysUniState extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysUniState(){
        this.setValidFlag(1);
    }      

    /**
     * <B>ALLDATAFLAG</B>&nbsp;全部数据模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ALLDATAFLAG = "alldataflag";

    /**
     * 设置 全部数据模式
     * 
     * @param allDataFlag
     * 
     */
    @JsonProperty(FIELD_ALLDATAFLAG)
    public void setAllDataFlag(Integer allDataFlag){
        this.set(FIELD_ALLDATAFLAG, allDataFlag);
    }
    
    /**
     * 获取 全部数据模式  
     * @return
     */
    @JsonIgnore
    public Integer getAllDataFlag(){
        Object objValue = this.get(FIELD_ALLDATAFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 全部数据模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAllDataFlagDirty(){
        if(this.contains(FIELD_ALLDATAFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 全部数据模式
     */
    @JsonIgnore
    public void resetAllDataFlag(){
        this.reset(FIELD_ALLDATAFLAG);
    }

    /**
     * 设置 全部数据模式
     * <P>
     * 等同 {@link #setAllDataFlag}
     * @param allDataFlag
     */
    @JsonIgnore
    public PSSysUniState alldataflag(Integer allDataFlag){
        this.setAllDataFlag(allDataFlag);
        return this;
    }

     /**
     * 设置 全部数据模式
     * <P>
     * 等同 {@link #setAllDataFlag}
     * @param allDataFlag
     */
    @JsonIgnore
    public PSSysUniState alldataflag(Boolean allDataFlag){
        if(allDataFlag == null){
            this.setAllDataFlag(null);
        }
        else{
            this.setAllDataFlag(allDataFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CACHECAT</B>&nbsp;缓存分类
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_CACHECAT = "cachecat";

    /**
     * 设置 缓存分类
     * 
     * @param cacheCat
     * 
     */
    @JsonProperty(FIELD_CACHECAT)
    public void setCacheCat(String cacheCat){
        this.set(FIELD_CACHECAT, cacheCat);
    }
    
    /**
     * 获取 缓存分类  
     * @return
     */
    @JsonIgnore
    public String getCacheCat(){
        Object objValue = this.get(FIELD_CACHECAT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 缓存分类 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCacheCatDirty(){
        if(this.contains(FIELD_CACHECAT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 缓存分类
     */
    @JsonIgnore
    public void resetCacheCat(){
        this.reset(FIELD_CACHECAT);
    }

    /**
     * 设置 缓存分类
     * <P>
     * 等同 {@link #setCacheCat}
     * @param cacheCat
     */
    @JsonIgnore
    public PSSysUniState cachecat(String cacheCat){
        this.setCacheCat(cacheCat);
        return this;
    }

    /**
     * <B>CACHESCOPE</B>&nbsp;缓存范围
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_CACHESCOPE = "cachescope";

    /**
     * 设置 缓存范围
     * 
     * @param cacheScope
     * 
     */
    @JsonProperty(FIELD_CACHESCOPE)
    public void setCacheScope(String cacheScope){
        this.set(FIELD_CACHESCOPE, cacheScope);
    }
    
    /**
     * 获取 缓存范围  
     * @return
     */
    @JsonIgnore
    public String getCacheScope(){
        Object objValue = this.get(FIELD_CACHESCOPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 缓存范围 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCacheScopeDirty(){
        if(this.contains(FIELD_CACHESCOPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 缓存范围
     */
    @JsonIgnore
    public void resetCacheScope(){
        this.reset(FIELD_CACHESCOPE);
    }

    /**
     * 设置 缓存范围
     * <P>
     * 等同 {@link #setCacheScope}
     * @param cacheScope
     */
    @JsonIgnore
    public PSSysUniState cachescope(String cacheScope){
        this.setCacheScope(cacheScope);
        return this;
    }

    /**
     * <B>CACHETIMEOUT</B>&nbsp;缓存失效时长
     */
    public final static String FIELD_CACHETIMEOUT = "cachetimeout";

    /**
     * 设置 缓存失效时长
     * 
     * @param cacheTimeout
     * 
     */
    @JsonProperty(FIELD_CACHETIMEOUT)
    public void setCacheTimeout(Integer cacheTimeout){
        this.set(FIELD_CACHETIMEOUT, cacheTimeout);
    }
    
    /**
     * 获取 缓存失效时长  
     * @return
     */
    @JsonIgnore
    public Integer getCacheTimeout(){
        Object objValue = this.get(FIELD_CACHETIMEOUT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 缓存失效时长 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCacheTimeoutDirty(){
        if(this.contains(FIELD_CACHETIMEOUT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 缓存失效时长
     */
    @JsonIgnore
    public void resetCacheTimeout(){
        this.reset(FIELD_CACHETIMEOUT);
    }

    /**
     * 设置 缓存失效时长
     * <P>
     * 等同 {@link #setCacheTimeout}
     * @param cacheTimeout
     */
    @JsonIgnore
    public PSSysUniState cachetimeout(Integer cacheTimeout){
        this.setCacheTimeout(cacheTimeout);
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
    public PSSysUniState createdate(String createDate){
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
    public PSSysUniState createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CUSTOMCODE</B>&nbsp;自定义代码
     */
    public final static String FIELD_CUSTOMCODE = "customcode";

    /**
     * 设置 自定义代码
     * 
     * @param customCode
     * 
     */
    @JsonProperty(FIELD_CUSTOMCODE)
    public void setCustomCode(String customCode){
        this.set(FIELD_CUSTOMCODE, customCode);
    }
    
    /**
     * 获取 自定义代码  
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
     * 判断 自定义代码 是否指定值，包括空值
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
     * 重置 自定义代码
     */
    @JsonIgnore
    public void resetCustomCode(){
        this.reset(FIELD_CUSTOMCODE);
    }

    /**
     * 设置 自定义代码
     * <P>
     * 等同 {@link #setCustomCode}
     * @param customCode
     */
    @JsonIgnore
    public PSSysUniState customcode(String customCode){
        this.setCustomCode(customCode);
        return this;
    }

    /**
     * <B>CUSTOMMODE</B>&nbsp;脚本代码模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ScriptMode2} 
     */
    public final static String FIELD_CUSTOMMODE = "custommode";

    /**
     * 设置 脚本代码模式
     * 
     * @param customMode
     * 
     */
    @JsonProperty(FIELD_CUSTOMMODE)
    public void setCustomMode(Integer customMode){
        this.set(FIELD_CUSTOMMODE, customMode);
    }
    
    /**
     * 获取 脚本代码模式  
     * @return
     */
    @JsonIgnore
    public Integer getCustomMode(){
        Object objValue = this.get(FIELD_CUSTOMMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 脚本代码模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomModeDirty(){
        if(this.contains(FIELD_CUSTOMMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 脚本代码模式
     */
    @JsonIgnore
    public void resetCustomMode(){
        this.reset(FIELD_CUSTOMMODE);
    }

    /**
     * 设置 脚本代码模式
     * <P>
     * 等同 {@link #setCustomMode}
     * @param customMode
     */
    @JsonIgnore
    public PSSysUniState custommode(Integer customMode){
        this.setCustomMode(customMode);
        return this;
    }

     /**
     * 设置 脚本代码模式
     * <P>
     * 等同 {@link #setCustomMode}
     * @param customMode
     */
    @JsonIgnore
    public PSSysUniState custommode(net.ibizsys.psmodel.core.util.PSModelEnums.ScriptMode2 customMode){
        if(customMode == null){
            this.setCustomMode(null);
        }
        else{
            this.setCustomMode(customMode.value);
        }
        return this;
    }

    /**
     * <B>DEDEFAULTFLAG</B>&nbsp;实体默认统一状态，指定是否为当前实体的默认状态协同，未指定为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEDEFAULTFLAG = "dedefaultflag";

    /**
     * 设置 实体默认统一状态，详细说明：{@link #FIELD_DEDEFAULTFLAG}
     * 
     * @param dEDefaultFlag
     * 
     */
    @JsonProperty(FIELD_DEDEFAULTFLAG)
    public void setDEDefaultFlag(Integer dEDefaultFlag){
        this.set(FIELD_DEDEFAULTFLAG, dEDefaultFlag);
    }
    
    /**
     * 获取 实体默认统一状态  
     * @return
     */
    @JsonIgnore
    public Integer getDEDefaultFlag(){
        Object objValue = this.get(FIELD_DEDEFAULTFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 实体默认统一状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDEDefaultFlagDirty(){
        if(this.contains(FIELD_DEDEFAULTFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体默认统一状态
     */
    @JsonIgnore
    public void resetDEDefaultFlag(){
        this.reset(FIELD_DEDEFAULTFLAG);
    }

    /**
     * 设置 实体默认统一状态，详细说明：{@link #FIELD_DEDEFAULTFLAG}
     * <P>
     * 等同 {@link #setDEDefaultFlag}
     * @param dEDefaultFlag
     */
    @JsonIgnore
    public PSSysUniState dedefaultflag(Integer dEDefaultFlag){
        this.setDEDefaultFlag(dEDefaultFlag);
        return this;
    }

     /**
     * 设置 实体默认统一状态，详细说明：{@link #FIELD_DEDEFAULTFLAG}
     * <P>
     * 等同 {@link #setDEDefaultFlag}
     * @param dEDefaultFlag
     */
    @JsonIgnore
    public PSSysUniState dedefaultflag(Boolean dEDefaultFlag){
        if(dEDefaultFlag == null){
            this.setDEDefaultFlag(null);
        }
        else{
            this.setDEDefaultFlag(dEDefaultFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DELETEASUPDATE</B>&nbsp;删除作为更新操作
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DELETEASUPDATE = "deleteasupdate";

    /**
     * 设置 删除作为更新操作
     * 
     * @param deleteAsUpdate
     * 
     */
    @JsonProperty(FIELD_DELETEASUPDATE)
    public void setDeleteAsUpdate(Integer deleteAsUpdate){
        this.set(FIELD_DELETEASUPDATE, deleteAsUpdate);
    }
    
    /**
     * 获取 删除作为更新操作  
     * @return
     */
    @JsonIgnore
    public Integer getDeleteAsUpdate(){
        Object objValue = this.get(FIELD_DELETEASUPDATE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 删除作为更新操作 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDeleteAsUpdateDirty(){
        if(this.contains(FIELD_DELETEASUPDATE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 删除作为更新操作
     */
    @JsonIgnore
    public void resetDeleteAsUpdate(){
        this.reset(FIELD_DELETEASUPDATE);
    }

    /**
     * 设置 删除作为更新操作
     * <P>
     * 等同 {@link #setDeleteAsUpdate}
     * @param deleteAsUpdate
     */
    @JsonIgnore
    public PSSysUniState deleteasupdate(Integer deleteAsUpdate){
        this.setDeleteAsUpdate(deleteAsUpdate);
        return this;
    }

     /**
     * 设置 删除作为更新操作
     * <P>
     * 等同 {@link #setDeleteAsUpdate}
     * @param deleteAsUpdate
     */
    @JsonIgnore
    public PSSysUniState deleteasupdate(Boolean deleteAsUpdate){
        if(deleteAsUpdate == null){
            this.setDeleteAsUpdate(null);
        }
        else{
            this.setDeleteAsUpdate(deleteAsUpdate?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>INITPSDELOGICID</B>&nbsp;初始化逻辑
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDELogic} 
     */
    public final static String FIELD_INITPSDELOGICID = "initpsdelogicid";

    /**
     * 设置 初始化逻辑
     * 
     * @param initPSDELogicId
     * 
     */
    @JsonProperty(FIELD_INITPSDELOGICID)
    public void setInitPSDELogicId(String initPSDELogicId){
        this.set(FIELD_INITPSDELOGICID, initPSDELogicId);
    }
    
    /**
     * 获取 初始化逻辑  
     * @return
     */
    @JsonIgnore
    public String getInitPSDELogicId(){
        Object objValue = this.get(FIELD_INITPSDELOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 初始化逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isInitPSDELogicIdDirty(){
        if(this.contains(FIELD_INITPSDELOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 初始化逻辑
     */
    @JsonIgnore
    public void resetInitPSDELogicId(){
        this.reset(FIELD_INITPSDELOGICID);
    }

    /**
     * 设置 初始化逻辑
     * <P>
     * 等同 {@link #setInitPSDELogicId}
     * @param initPSDELogicId
     */
    @JsonIgnore
    public PSSysUniState initpsdelogicid(String initPSDELogicId){
        this.setInitPSDELogicId(initPSDELogicId);
        return this;
    }

    /**
     * 设置 初始化逻辑，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setInitPSDELogicId}
     * @param pSDELogic 引用对象
     */
    @JsonIgnore
    public PSSysUniState initpsdelogicid(PSDELogic pSDELogic){
        if(pSDELogic == null){
            this.setInitPSDELogicId(null);
            this.setInitPSDELogicName(null);
        }
        else{
            this.setInitPSDELogicId(pSDELogic.getPSDELogicId());
            this.setInitPSDELogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    /**
     * <B>INITPSDELOGICNAME</B>&nbsp;初始化逻辑
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_INITPSDELOGICID}
     */
    public final static String FIELD_INITPSDELOGICNAME = "initpsdelogicname";

    /**
     * 设置 初始化逻辑
     * 
     * @param initPSDELogicName
     * 
     */
    @JsonProperty(FIELD_INITPSDELOGICNAME)
    public void setInitPSDELogicName(String initPSDELogicName){
        this.set(FIELD_INITPSDELOGICNAME, initPSDELogicName);
    }
    
    /**
     * 获取 初始化逻辑  
     * @return
     */
    @JsonIgnore
    public String getInitPSDELogicName(){
        Object objValue = this.get(FIELD_INITPSDELOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 初始化逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isInitPSDELogicNameDirty(){
        if(this.contains(FIELD_INITPSDELOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 初始化逻辑
     */
    @JsonIgnore
    public void resetInitPSDELogicName(){
        this.reset(FIELD_INITPSDELOGICNAME);
    }

    /**
     * 设置 初始化逻辑
     * <P>
     * 等同 {@link #setInitPSDELogicName}
     * @param initPSDELogicName
     */
    @JsonIgnore
    public PSSysUniState initpsdelogicname(String initPSDELogicName){
        this.setInitPSDELogicName(initPSDELogicName);
        return this;
    }

    /**
     * <B>KEY2PSDEFID</B>&nbsp;目录2属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_KEY2PSDEFID = "key2psdefid";

    /**
     * 设置 目录2属性
     * 
     * @param key2PSDEFId
     * 
     */
    @JsonProperty(FIELD_KEY2PSDEFID)
    public void setKey2PSDEFId(String key2PSDEFId){
        this.set(FIELD_KEY2PSDEFID, key2PSDEFId);
    }
    
    /**
     * 获取 目录2属性  
     * @return
     */
    @JsonIgnore
    public String getKey2PSDEFId(){
        Object objValue = this.get(FIELD_KEY2PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目录2属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isKey2PSDEFIdDirty(){
        if(this.contains(FIELD_KEY2PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目录2属性
     */
    @JsonIgnore
    public void resetKey2PSDEFId(){
        this.reset(FIELD_KEY2PSDEFID);
    }

    /**
     * 设置 目录2属性
     * <P>
     * 等同 {@link #setKey2PSDEFId}
     * @param key2PSDEFId
     */
    @JsonIgnore
    public PSSysUniState key2psdefid(String key2PSDEFId){
        this.setKey2PSDEFId(key2PSDEFId);
        return this;
    }

    /**
     * 设置 目录2属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setKey2PSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysUniState key2psdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setKey2PSDEFId(null);
            this.setKey2PSDEFName(null);
        }
        else{
            this.setKey2PSDEFId(pSDEField.getPSDEFieldId());
            this.setKey2PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>KEY2PSDEFNAME</B>&nbsp;目录1属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_KEY2PSDEFID}
     */
    public final static String FIELD_KEY2PSDEFNAME = "key2psdefname";

    /**
     * 设置 目录1属性
     * 
     * @param key2PSDEFName
     * 
     */
    @JsonProperty(FIELD_KEY2PSDEFNAME)
    public void setKey2PSDEFName(String key2PSDEFName){
        this.set(FIELD_KEY2PSDEFNAME, key2PSDEFName);
    }
    
    /**
     * 获取 目录1属性  
     * @return
     */
    @JsonIgnore
    public String getKey2PSDEFName(){
        Object objValue = this.get(FIELD_KEY2PSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目录1属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isKey2PSDEFNameDirty(){
        if(this.contains(FIELD_KEY2PSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目录1属性
     */
    @JsonIgnore
    public void resetKey2PSDEFName(){
        this.reset(FIELD_KEY2PSDEFNAME);
    }

    /**
     * 设置 目录1属性
     * <P>
     * 等同 {@link #setKey2PSDEFName}
     * @param key2PSDEFName
     */
    @JsonIgnore
    public PSSysUniState key2psdefname(String key2PSDEFName){
        this.setKey2PSDEFName(key2PSDEFName);
        return this;
    }

    /**
     * <B>KEY3PSDEFID</B>&nbsp;目录2属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_KEY3PSDEFID = "key3psdefid";

    /**
     * 设置 目录2属性
     * 
     * @param key3PSDEFId
     * 
     */
    @JsonProperty(FIELD_KEY3PSDEFID)
    public void setKey3PSDEFId(String key3PSDEFId){
        this.set(FIELD_KEY3PSDEFID, key3PSDEFId);
    }
    
    /**
     * 获取 目录2属性  
     * @return
     */
    @JsonIgnore
    public String getKey3PSDEFId(){
        Object objValue = this.get(FIELD_KEY3PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目录2属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isKey3PSDEFIdDirty(){
        if(this.contains(FIELD_KEY3PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目录2属性
     */
    @JsonIgnore
    public void resetKey3PSDEFId(){
        this.reset(FIELD_KEY3PSDEFID);
    }

    /**
     * 设置 目录2属性
     * <P>
     * 等同 {@link #setKey3PSDEFId}
     * @param key3PSDEFId
     */
    @JsonIgnore
    public PSSysUniState key3psdefid(String key3PSDEFId){
        this.setKey3PSDEFId(key3PSDEFId);
        return this;
    }

    /**
     * 设置 目录2属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setKey3PSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysUniState key3psdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setKey3PSDEFId(null);
            this.setKey3PSDEFName(null);
        }
        else{
            this.setKey3PSDEFId(pSDEField.getPSDEFieldId());
            this.setKey3PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>KEY3PSDEFNAME</B>&nbsp;目录2属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_KEY3PSDEFID}
     */
    public final static String FIELD_KEY3PSDEFNAME = "key3psdefname";

    /**
     * 设置 目录2属性
     * 
     * @param key3PSDEFName
     * 
     */
    @JsonProperty(FIELD_KEY3PSDEFNAME)
    public void setKey3PSDEFName(String key3PSDEFName){
        this.set(FIELD_KEY3PSDEFNAME, key3PSDEFName);
    }
    
    /**
     * 获取 目录2属性  
     * @return
     */
    @JsonIgnore
    public String getKey3PSDEFName(){
        Object objValue = this.get(FIELD_KEY3PSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目录2属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isKey3PSDEFNameDirty(){
        if(this.contains(FIELD_KEY3PSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目录2属性
     */
    @JsonIgnore
    public void resetKey3PSDEFName(){
        this.reset(FIELD_KEY3PSDEFNAME);
    }

    /**
     * 设置 目录2属性
     * <P>
     * 等同 {@link #setKey3PSDEFName}
     * @param key3PSDEFName
     */
    @JsonIgnore
    public PSSysUniState key3psdefname(String key3PSDEFName){
        this.setKey3PSDEFName(key3PSDEFName);
        return this;
    }

    /**
     * <B>KEY4PSDEFID</B>&nbsp;目录3属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_KEY4PSDEFID = "key4psdefid";

    /**
     * 设置 目录3属性
     * 
     * @param key4PSDEFId
     * 
     */
    @JsonProperty(FIELD_KEY4PSDEFID)
    public void setKey4PSDEFId(String key4PSDEFId){
        this.set(FIELD_KEY4PSDEFID, key4PSDEFId);
    }
    
    /**
     * 获取 目录3属性  
     * @return
     */
    @JsonIgnore
    public String getKey4PSDEFId(){
        Object objValue = this.get(FIELD_KEY4PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目录3属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isKey4PSDEFIdDirty(){
        if(this.contains(FIELD_KEY4PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目录3属性
     */
    @JsonIgnore
    public void resetKey4PSDEFId(){
        this.reset(FIELD_KEY4PSDEFID);
    }

    /**
     * 设置 目录3属性
     * <P>
     * 等同 {@link #setKey4PSDEFId}
     * @param key4PSDEFId
     */
    @JsonIgnore
    public PSSysUniState key4psdefid(String key4PSDEFId){
        this.setKey4PSDEFId(key4PSDEFId);
        return this;
    }

    /**
     * 设置 目录3属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setKey4PSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysUniState key4psdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setKey4PSDEFId(null);
            this.setKey4PSDEFName(null);
        }
        else{
            this.setKey4PSDEFId(pSDEField.getPSDEFieldId());
            this.setKey4PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>KEY4PSDEFNAME</B>&nbsp;目录3属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_KEY4PSDEFID}
     */
    public final static String FIELD_KEY4PSDEFNAME = "key4psdefname";

    /**
     * 设置 目录3属性
     * 
     * @param key4PSDEFName
     * 
     */
    @JsonProperty(FIELD_KEY4PSDEFNAME)
    public void setKey4PSDEFName(String key4PSDEFName){
        this.set(FIELD_KEY4PSDEFNAME, key4PSDEFName);
    }
    
    /**
     * 获取 目录3属性  
     * @return
     */
    @JsonIgnore
    public String getKey4PSDEFName(){
        Object objValue = this.get(FIELD_KEY4PSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目录3属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isKey4PSDEFNameDirty(){
        if(this.contains(FIELD_KEY4PSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目录3属性
     */
    @JsonIgnore
    public void resetKey4PSDEFName(){
        this.reset(FIELD_KEY4PSDEFNAME);
    }

    /**
     * 设置 目录3属性
     * <P>
     * 等同 {@link #setKey4PSDEFName}
     * @param key4PSDEFName
     */
    @JsonIgnore
    public PSSysUniState key4psdefname(String key4PSDEFName){
        this.setKey4PSDEFName(key4PSDEFName);
        return this;
    }

    /**
     * <B>KEY5PSDEFID</B>&nbsp;目录4属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_KEY5PSDEFID = "key5psdefid";

    /**
     * 设置 目录4属性
     * 
     * @param key5PSDEFId
     * 
     */
    @JsonProperty(FIELD_KEY5PSDEFID)
    public void setKey5PSDEFId(String key5PSDEFId){
        this.set(FIELD_KEY5PSDEFID, key5PSDEFId);
    }
    
    /**
     * 获取 目录4属性  
     * @return
     */
    @JsonIgnore
    public String getKey5PSDEFId(){
        Object objValue = this.get(FIELD_KEY5PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目录4属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isKey5PSDEFIdDirty(){
        if(this.contains(FIELD_KEY5PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目录4属性
     */
    @JsonIgnore
    public void resetKey5PSDEFId(){
        this.reset(FIELD_KEY5PSDEFID);
    }

    /**
     * 设置 目录4属性
     * <P>
     * 等同 {@link #setKey5PSDEFId}
     * @param key5PSDEFId
     */
    @JsonIgnore
    public PSSysUniState key5psdefid(String key5PSDEFId){
        this.setKey5PSDEFId(key5PSDEFId);
        return this;
    }

    /**
     * 设置 目录4属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setKey5PSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysUniState key5psdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setKey5PSDEFId(null);
            this.setKey5PSDEFName(null);
        }
        else{
            this.setKey5PSDEFId(pSDEField.getPSDEFieldId());
            this.setKey5PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>KEY5PSDEFNAME</B>&nbsp;目录4属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_KEY5PSDEFID}
     */
    public final static String FIELD_KEY5PSDEFNAME = "key5psdefname";

    /**
     * 设置 目录4属性
     * 
     * @param key5PSDEFName
     * 
     */
    @JsonProperty(FIELD_KEY5PSDEFNAME)
    public void setKey5PSDEFName(String key5PSDEFName){
        this.set(FIELD_KEY5PSDEFNAME, key5PSDEFName);
    }
    
    /**
     * 获取 目录4属性  
     * @return
     */
    @JsonIgnore
    public String getKey5PSDEFName(){
        Object objValue = this.get(FIELD_KEY5PSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目录4属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isKey5PSDEFNameDirty(){
        if(this.contains(FIELD_KEY5PSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目录4属性
     */
    @JsonIgnore
    public void resetKey5PSDEFName(){
        this.reset(FIELD_KEY5PSDEFNAME);
    }

    /**
     * 设置 目录4属性
     * <P>
     * 等同 {@link #setKey5PSDEFName}
     * @param key5PSDEFName
     */
    @JsonIgnore
    public PSSysUniState key5psdefname(String key5PSDEFName){
        this.setKey5PSDEFName(key5PSDEFName);
        return this;
    }

    /**
     * <B>KEY6PSDEFID</B>&nbsp;目录5属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_KEY6PSDEFID = "key6psdefid";

    /**
     * 设置 目录5属性
     * 
     * @param key6PSDEFId
     * 
     */
    @JsonProperty(FIELD_KEY6PSDEFID)
    public void setKey6PSDEFId(String key6PSDEFId){
        this.set(FIELD_KEY6PSDEFID, key6PSDEFId);
    }
    
    /**
     * 获取 目录5属性  
     * @return
     */
    @JsonIgnore
    public String getKey6PSDEFId(){
        Object objValue = this.get(FIELD_KEY6PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目录5属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isKey6PSDEFIdDirty(){
        if(this.contains(FIELD_KEY6PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目录5属性
     */
    @JsonIgnore
    public void resetKey6PSDEFId(){
        this.reset(FIELD_KEY6PSDEFID);
    }

    /**
     * 设置 目录5属性
     * <P>
     * 等同 {@link #setKey6PSDEFId}
     * @param key6PSDEFId
     */
    @JsonIgnore
    public PSSysUniState key6psdefid(String key6PSDEFId){
        this.setKey6PSDEFId(key6PSDEFId);
        return this;
    }

    /**
     * 设置 目录5属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setKey6PSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysUniState key6psdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setKey6PSDEFId(null);
            this.setKey6PSDEFName(null);
        }
        else{
            this.setKey6PSDEFId(pSDEField.getPSDEFieldId());
            this.setKey6PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>KEY6PSDEFNAME</B>&nbsp;目录5属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_KEY6PSDEFID}
     */
    public final static String FIELD_KEY6PSDEFNAME = "key6psdefname";

    /**
     * 设置 目录5属性
     * 
     * @param key6PSDEFName
     * 
     */
    @JsonProperty(FIELD_KEY6PSDEFNAME)
    public void setKey6PSDEFName(String key6PSDEFName){
        this.set(FIELD_KEY6PSDEFNAME, key6PSDEFName);
    }
    
    /**
     * 获取 目录5属性  
     * @return
     */
    @JsonIgnore
    public String getKey6PSDEFName(){
        Object objValue = this.get(FIELD_KEY6PSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目录5属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isKey6PSDEFNameDirty(){
        if(this.contains(FIELD_KEY6PSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目录5属性
     */
    @JsonIgnore
    public void resetKey6PSDEFName(){
        this.reset(FIELD_KEY6PSDEFNAME);
    }

    /**
     * 设置 目录5属性
     * <P>
     * 等同 {@link #setKey6PSDEFName}
     * @param key6PSDEFName
     */
    @JsonIgnore
    public PSSysUniState key6psdefname(String key6PSDEFName){
        this.setKey6PSDEFName(key6PSDEFName);
        return this;
    }

    /**
     * <B>KEY7PSDEFID</B>&nbsp;目录6属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_KEY7PSDEFID = "key7psdefid";

    /**
     * 设置 目录6属性
     * 
     * @param key7PSDEFId
     * 
     */
    @JsonProperty(FIELD_KEY7PSDEFID)
    public void setKey7PSDEFId(String key7PSDEFId){
        this.set(FIELD_KEY7PSDEFID, key7PSDEFId);
    }
    
    /**
     * 获取 目录6属性  
     * @return
     */
    @JsonIgnore
    public String getKey7PSDEFId(){
        Object objValue = this.get(FIELD_KEY7PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目录6属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isKey7PSDEFIdDirty(){
        if(this.contains(FIELD_KEY7PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目录6属性
     */
    @JsonIgnore
    public void resetKey7PSDEFId(){
        this.reset(FIELD_KEY7PSDEFID);
    }

    /**
     * 设置 目录6属性
     * <P>
     * 等同 {@link #setKey7PSDEFId}
     * @param key7PSDEFId
     */
    @JsonIgnore
    public PSSysUniState key7psdefid(String key7PSDEFId){
        this.setKey7PSDEFId(key7PSDEFId);
        return this;
    }

    /**
     * 设置 目录6属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setKey7PSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysUniState key7psdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setKey7PSDEFId(null);
            this.setKey7PSDEFName(null);
        }
        else{
            this.setKey7PSDEFId(pSDEField.getPSDEFieldId());
            this.setKey7PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>KEY7PSDEFNAME</B>&nbsp;目录6属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_KEY7PSDEFID}
     */
    public final static String FIELD_KEY7PSDEFNAME = "key7psdefname";

    /**
     * 设置 目录6属性
     * 
     * @param key7PSDEFName
     * 
     */
    @JsonProperty(FIELD_KEY7PSDEFNAME)
    public void setKey7PSDEFName(String key7PSDEFName){
        this.set(FIELD_KEY7PSDEFNAME, key7PSDEFName);
    }
    
    /**
     * 获取 目录6属性  
     * @return
     */
    @JsonIgnore
    public String getKey7PSDEFName(){
        Object objValue = this.get(FIELD_KEY7PSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目录6属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isKey7PSDEFNameDirty(){
        if(this.contains(FIELD_KEY7PSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目录6属性
     */
    @JsonIgnore
    public void resetKey7PSDEFName(){
        this.reset(FIELD_KEY7PSDEFNAME);
    }

    /**
     * 设置 目录6属性
     * <P>
     * 等同 {@link #setKey7PSDEFName}
     * @param key7PSDEFName
     */
    @JsonIgnore
    public PSSysUniState key7psdefname(String key7PSDEFName){
        this.setKey7PSDEFName(key7PSDEFName);
        return this;
    }

    /**
     * <B>KEY8PSDEFID</B>&nbsp;目录7属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_KEY8PSDEFID = "key8psdefid";

    /**
     * 设置 目录7属性
     * 
     * @param key8PSDEFId
     * 
     */
    @JsonProperty(FIELD_KEY8PSDEFID)
    public void setKey8PSDEFId(String key8PSDEFId){
        this.set(FIELD_KEY8PSDEFID, key8PSDEFId);
    }
    
    /**
     * 获取 目录7属性  
     * @return
     */
    @JsonIgnore
    public String getKey8PSDEFId(){
        Object objValue = this.get(FIELD_KEY8PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目录7属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isKey8PSDEFIdDirty(){
        if(this.contains(FIELD_KEY8PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目录7属性
     */
    @JsonIgnore
    public void resetKey8PSDEFId(){
        this.reset(FIELD_KEY8PSDEFID);
    }

    /**
     * 设置 目录7属性
     * <P>
     * 等同 {@link #setKey8PSDEFId}
     * @param key8PSDEFId
     */
    @JsonIgnore
    public PSSysUniState key8psdefid(String key8PSDEFId){
        this.setKey8PSDEFId(key8PSDEFId);
        return this;
    }

    /**
     * 设置 目录7属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setKey8PSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysUniState key8psdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setKey8PSDEFId(null);
            this.setKey8PSDEFName(null);
        }
        else{
            this.setKey8PSDEFId(pSDEField.getPSDEFieldId());
            this.setKey8PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>KEY8PSDEFNAME</B>&nbsp;目录7属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_KEY8PSDEFID}
     */
    public final static String FIELD_KEY8PSDEFNAME = "key8psdefname";

    /**
     * 设置 目录7属性
     * 
     * @param key8PSDEFName
     * 
     */
    @JsonProperty(FIELD_KEY8PSDEFNAME)
    public void setKey8PSDEFName(String key8PSDEFName){
        this.set(FIELD_KEY8PSDEFNAME, key8PSDEFName);
    }
    
    /**
     * 获取 目录7属性  
     * @return
     */
    @JsonIgnore
    public String getKey8PSDEFName(){
        Object objValue = this.get(FIELD_KEY8PSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目录7属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isKey8PSDEFNameDirty(){
        if(this.contains(FIELD_KEY8PSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目录7属性
     */
    @JsonIgnore
    public void resetKey8PSDEFName(){
        this.reset(FIELD_KEY8PSDEFNAME);
    }

    /**
     * 设置 目录7属性
     * <P>
     * 等同 {@link #setKey8PSDEFName}
     * @param key8PSDEFName
     */
    @JsonIgnore
    public PSSysUniState key8psdefname(String key8PSDEFName){
        this.setKey8PSDEFName(key8PSDEFName);
        return this;
    }

    /**
     * <B>KEY9PSDEFID</B>&nbsp;目录8属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_KEY9PSDEFID = "key9psdefid";

    /**
     * 设置 目录8属性
     * 
     * @param key9PSDEFId
     * 
     */
    @JsonProperty(FIELD_KEY9PSDEFID)
    public void setKey9PSDEFId(String key9PSDEFId){
        this.set(FIELD_KEY9PSDEFID, key9PSDEFId);
    }
    
    /**
     * 获取 目录8属性  
     * @return
     */
    @JsonIgnore
    public String getKey9PSDEFId(){
        Object objValue = this.get(FIELD_KEY9PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目录8属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isKey9PSDEFIdDirty(){
        if(this.contains(FIELD_KEY9PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目录8属性
     */
    @JsonIgnore
    public void resetKey9PSDEFId(){
        this.reset(FIELD_KEY9PSDEFID);
    }

    /**
     * 设置 目录8属性
     * <P>
     * 等同 {@link #setKey9PSDEFId}
     * @param key9PSDEFId
     */
    @JsonIgnore
    public PSSysUniState key9psdefid(String key9PSDEFId){
        this.setKey9PSDEFId(key9PSDEFId);
        return this;
    }

    /**
     * 设置 目录8属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setKey9PSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysUniState key9psdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setKey9PSDEFId(null);
            this.setKey9PSDEFName(null);
        }
        else{
            this.setKey9PSDEFId(pSDEField.getPSDEFieldId());
            this.setKey9PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>KEY9PSDEFNAME</B>&nbsp;目录8属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_KEY9PSDEFID}
     */
    public final static String FIELD_KEY9PSDEFNAME = "key9psdefname";

    /**
     * 设置 目录8属性
     * 
     * @param key9PSDEFName
     * 
     */
    @JsonProperty(FIELD_KEY9PSDEFNAME)
    public void setKey9PSDEFName(String key9PSDEFName){
        this.set(FIELD_KEY9PSDEFNAME, key9PSDEFName);
    }
    
    /**
     * 获取 目录8属性  
     * @return
     */
    @JsonIgnore
    public String getKey9PSDEFName(){
        Object objValue = this.get(FIELD_KEY9PSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目录8属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isKey9PSDEFNameDirty(){
        if(this.contains(FIELD_KEY9PSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目录8属性
     */
    @JsonIgnore
    public void resetKey9PSDEFName(){
        this.reset(FIELD_KEY9PSDEFNAME);
    }

    /**
     * 设置 目录8属性
     * <P>
     * 等同 {@link #setKey9PSDEFName}
     * @param key9PSDEFName
     */
    @JsonIgnore
    public PSSysUniState key9psdefname(String key9PSDEFName){
        this.setKey9PSDEFName(key9PSDEFName);
        return this;
    }

    /**
     * <B>KEYFORMAT</B>&nbsp;路径格式化
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_KEYFORMAT = "keyformat";

    /**
     * 设置 路径格式化
     * 
     * @param keyFormat
     * 
     */
    @JsonProperty(FIELD_KEYFORMAT)
    public void setKeyFormat(String keyFormat){
        this.set(FIELD_KEYFORMAT, keyFormat);
    }
    
    /**
     * 获取 路径格式化  
     * @return
     */
    @JsonIgnore
    public String getKeyFormat(){
        Object objValue = this.get(FIELD_KEYFORMAT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 路径格式化 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isKeyFormatDirty(){
        if(this.contains(FIELD_KEYFORMAT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 路径格式化
     */
    @JsonIgnore
    public void resetKeyFormat(){
        this.reset(FIELD_KEYFORMAT);
    }

    /**
     * 设置 路径格式化
     * <P>
     * 等同 {@link #setKeyFormat}
     * @param keyFormat
     */
    @JsonIgnore
    public PSSysUniState keyformat(String keyFormat){
        this.setKeyFormat(keyFormat);
        return this;
    }

    /**
     * <B>KEYPSDEFID</B>&nbsp;标识属性，指定状态协同的数据标识属性，未指定时使用实体主键属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_KEYPSDEFID = "keypsdefid";

    /**
     * 设置 标识属性，详细说明：{@link #FIELD_KEYPSDEFID}
     * 
     * @param keyPSDEFId
     * 
     */
    @JsonProperty(FIELD_KEYPSDEFID)
    public void setKeyPSDEFId(String keyPSDEFId){
        this.set(FIELD_KEYPSDEFID, keyPSDEFId);
    }
    
    /**
     * 获取 标识属性  
     * @return
     */
    @JsonIgnore
    public String getKeyPSDEFId(){
        Object objValue = this.get(FIELD_KEYPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标识属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isKeyPSDEFIdDirty(){
        if(this.contains(FIELD_KEYPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标识属性
     */
    @JsonIgnore
    public void resetKeyPSDEFId(){
        this.reset(FIELD_KEYPSDEFID);
    }

    /**
     * 设置 标识属性，详细说明：{@link #FIELD_KEYPSDEFID}
     * <P>
     * 等同 {@link #setKeyPSDEFId}
     * @param keyPSDEFId
     */
    @JsonIgnore
    public PSSysUniState keypsdefid(String keyPSDEFId){
        this.setKeyPSDEFId(keyPSDEFId);
        return this;
    }

    /**
     * 设置 标识属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setKeyPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysUniState keypsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setKeyPSDEFId(null);
            this.setKeyPSDEFName(null);
        }
        else{
            this.setKeyPSDEFId(pSDEField.getPSDEFieldId());
            this.setKeyPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>KEYPSDEFNAME</B>&nbsp;标识属性，指定状态协同的数据标识属性，未指定时使用实体主键属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_KEYPSDEFID}
     */
    public final static String FIELD_KEYPSDEFNAME = "keypsdefname";

    /**
     * 设置 标识属性，详细说明：{@link #FIELD_KEYPSDEFNAME}
     * 
     * @param keyPSDEFName
     * 
     */
    @JsonProperty(FIELD_KEYPSDEFNAME)
    public void setKeyPSDEFName(String keyPSDEFName){
        this.set(FIELD_KEYPSDEFNAME, keyPSDEFName);
    }
    
    /**
     * 获取 标识属性  
     * @return
     */
    @JsonIgnore
    public String getKeyPSDEFName(){
        Object objValue = this.get(FIELD_KEYPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标识属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isKeyPSDEFNameDirty(){
        if(this.contains(FIELD_KEYPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标识属性
     */
    @JsonIgnore
    public void resetKeyPSDEFName(){
        this.reset(FIELD_KEYPSDEFNAME);
    }

    /**
     * 设置 标识属性，详细说明：{@link #FIELD_KEYPSDEFNAME}
     * <P>
     * 等同 {@link #setKeyPSDEFName}
     * @param keyPSDEFName
     */
    @JsonIgnore
    public PSSysUniState keypsdefname(String keyPSDEFName){
        this.setKeyPSDEFName(keyPSDEFName);
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
    public PSSysUniState memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MONITORFORMAT</B>&nbsp;路径监控器格式化
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_MONITORFORMAT = "monitorformat";

    /**
     * 设置 路径监控器格式化
     * 
     * @param monitorFormat
     * 
     */
    @JsonProperty(FIELD_MONITORFORMAT)
    public void setMonitorFormat(String monitorFormat){
        this.set(FIELD_MONITORFORMAT, monitorFormat);
    }
    
    /**
     * 获取 路径监控器格式化  
     * @return
     */
    @JsonIgnore
    public String getMonitorFormat(){
        Object objValue = this.get(FIELD_MONITORFORMAT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 路径监控器格式化 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMonitorFormatDirty(){
        if(this.contains(FIELD_MONITORFORMAT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 路径监控器格式化
     */
    @JsonIgnore
    public void resetMonitorFormat(){
        this.reset(FIELD_MONITORFORMAT);
    }

    /**
     * 设置 路径监控器格式化
     * <P>
     * 等同 {@link #setMonitorFormat}
     * @param monitorFormat
     */
    @JsonIgnore
    public PSSysUniState monitorformat(String monitorFormat){
        this.setMonitorFormat(monitorFormat);
        return this;
    }

    /**
     * <B>ONCHANGEPSDELOGICID</B>&nbsp;变更触发逻辑
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDELogic} 
     */
    public final static String FIELD_ONCHANGEPSDELOGICID = "onchangepsdelogicid";

    /**
     * 设置 变更触发逻辑
     * 
     * @param onChangePSDELogicId
     * 
     */
    @JsonProperty(FIELD_ONCHANGEPSDELOGICID)
    public void setOnChangePSDELogicId(String onChangePSDELogicId){
        this.set(FIELD_ONCHANGEPSDELOGICID, onChangePSDELogicId);
    }
    
    /**
     * 获取 变更触发逻辑  
     * @return
     */
    @JsonIgnore
    public String getOnChangePSDELogicId(){
        Object objValue = this.get(FIELD_ONCHANGEPSDELOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 变更触发逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOnChangePSDELogicIdDirty(){
        if(this.contains(FIELD_ONCHANGEPSDELOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 变更触发逻辑
     */
    @JsonIgnore
    public void resetOnChangePSDELogicId(){
        this.reset(FIELD_ONCHANGEPSDELOGICID);
    }

    /**
     * 设置 变更触发逻辑
     * <P>
     * 等同 {@link #setOnChangePSDELogicId}
     * @param onChangePSDELogicId
     */
    @JsonIgnore
    public PSSysUniState onchangepsdelogicid(String onChangePSDELogicId){
        this.setOnChangePSDELogicId(onChangePSDELogicId);
        return this;
    }

    /**
     * 设置 变更触发逻辑，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setOnChangePSDELogicId}
     * @param pSDELogic 引用对象
     */
    @JsonIgnore
    public PSSysUniState onchangepsdelogicid(PSDELogic pSDELogic){
        if(pSDELogic == null){
            this.setOnChangePSDELogicId(null);
            this.setOnChangePSDELogicName(null);
        }
        else{
            this.setOnChangePSDELogicId(pSDELogic.getPSDELogicId());
            this.setOnChangePSDELogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    /**
     * <B>ONCHANGEPSDELOGICNAME</B>&nbsp;变更触发逻辑
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ONCHANGEPSDELOGICID}
     */
    public final static String FIELD_ONCHANGEPSDELOGICNAME = "onchangepsdelogicname";

    /**
     * 设置 变更触发逻辑
     * 
     * @param onChangePSDELogicName
     * 
     */
    @JsonProperty(FIELD_ONCHANGEPSDELOGICNAME)
    public void setOnChangePSDELogicName(String onChangePSDELogicName){
        this.set(FIELD_ONCHANGEPSDELOGICNAME, onChangePSDELogicName);
    }
    
    /**
     * 获取 变更触发逻辑  
     * @return
     */
    @JsonIgnore
    public String getOnChangePSDELogicName(){
        Object objValue = this.get(FIELD_ONCHANGEPSDELOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 变更触发逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOnChangePSDELogicNameDirty(){
        if(this.contains(FIELD_ONCHANGEPSDELOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 变更触发逻辑
     */
    @JsonIgnore
    public void resetOnChangePSDELogicName(){
        this.reset(FIELD_ONCHANGEPSDELOGICNAME);
    }

    /**
     * 设置 变更触发逻辑
     * <P>
     * 等同 {@link #setOnChangePSDELogicName}
     * @param onChangePSDELogicName
     */
    @JsonIgnore
    public PSSysUniState onchangepsdelogicname(String onChangePSDELogicName){
        this.setOnChangePSDELogicName(onChangePSDELogicName);
        return this;
    }

    /**
     * <B>ONDELETEPSDELOGICID</B>&nbsp;删除触发逻辑
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDELogic} 
     */
    public final static String FIELD_ONDELETEPSDELOGICID = "ondeletepsdelogicid";

    /**
     * 设置 删除触发逻辑
     * 
     * @param onDeletePSDELogicId
     * 
     */
    @JsonProperty(FIELD_ONDELETEPSDELOGICID)
    public void setOnDeletePSDELogicId(String onDeletePSDELogicId){
        this.set(FIELD_ONDELETEPSDELOGICID, onDeletePSDELogicId);
    }
    
    /**
     * 获取 删除触发逻辑  
     * @return
     */
    @JsonIgnore
    public String getOnDeletePSDELogicId(){
        Object objValue = this.get(FIELD_ONDELETEPSDELOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 删除触发逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOnDeletePSDELogicIdDirty(){
        if(this.contains(FIELD_ONDELETEPSDELOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 删除触发逻辑
     */
    @JsonIgnore
    public void resetOnDeletePSDELogicId(){
        this.reset(FIELD_ONDELETEPSDELOGICID);
    }

    /**
     * 设置 删除触发逻辑
     * <P>
     * 等同 {@link #setOnDeletePSDELogicId}
     * @param onDeletePSDELogicId
     */
    @JsonIgnore
    public PSSysUniState ondeletepsdelogicid(String onDeletePSDELogicId){
        this.setOnDeletePSDELogicId(onDeletePSDELogicId);
        return this;
    }

    /**
     * 设置 删除触发逻辑，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setOnDeletePSDELogicId}
     * @param pSDELogic 引用对象
     */
    @JsonIgnore
    public PSSysUniState ondeletepsdelogicid(PSDELogic pSDELogic){
        if(pSDELogic == null){
            this.setOnDeletePSDELogicId(null);
            this.setOnDeletePSDELogicName(null);
        }
        else{
            this.setOnDeletePSDELogicId(pSDELogic.getPSDELogicId());
            this.setOnDeletePSDELogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    /**
     * <B>ONDELETEPSDELOGICNAME</B>&nbsp;删除触发逻辑
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ONDELETEPSDELOGICID}
     */
    public final static String FIELD_ONDELETEPSDELOGICNAME = "ondeletepsdelogicname";

    /**
     * 设置 删除触发逻辑
     * 
     * @param onDeletePSDELogicName
     * 
     */
    @JsonProperty(FIELD_ONDELETEPSDELOGICNAME)
    public void setOnDeletePSDELogicName(String onDeletePSDELogicName){
        this.set(FIELD_ONDELETEPSDELOGICNAME, onDeletePSDELogicName);
    }
    
    /**
     * 获取 删除触发逻辑  
     * @return
     */
    @JsonIgnore
    public String getOnDeletePSDELogicName(){
        Object objValue = this.get(FIELD_ONDELETEPSDELOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 删除触发逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOnDeletePSDELogicNameDirty(){
        if(this.contains(FIELD_ONDELETEPSDELOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 删除触发逻辑
     */
    @JsonIgnore
    public void resetOnDeletePSDELogicName(){
        this.reset(FIELD_ONDELETEPSDELOGICNAME);
    }

    /**
     * 设置 删除触发逻辑
     * <P>
     * 等同 {@link #setOnDeletePSDELogicName}
     * @param onDeletePSDELogicName
     */
    @JsonIgnore
    public PSSysUniState ondeletepsdelogicname(String onDeletePSDELogicName){
        this.setOnDeletePSDELogicName(onDeletePSDELogicName);
        return this;
    }

    /**
     * <B>PSDEDATASETID</B>&nbsp;预载数据集
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataSet} 
     */
    public final static String FIELD_PSDEDATASETID = "psdedatasetid";

    /**
     * 设置 预载数据集
     * 
     * @param pSDEDataSetId
     * 
     */
    @JsonProperty(FIELD_PSDEDATASETID)
    public void setPSDEDataSetId(String pSDEDataSetId){
        this.set(FIELD_PSDEDATASETID, pSDEDataSetId);
    }
    
    /**
     * 获取 预载数据集  
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
     * 判断 预载数据集 是否指定值，包括空值
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
     * 重置 预载数据集
     */
    @JsonIgnore
    public void resetPSDEDataSetId(){
        this.reset(FIELD_PSDEDATASETID);
    }

    /**
     * 设置 预载数据集
     * <P>
     * 等同 {@link #setPSDEDataSetId}
     * @param pSDEDataSetId
     */
    @JsonIgnore
    public PSSysUniState psdedatasetid(String pSDEDataSetId){
        this.setPSDEDataSetId(pSDEDataSetId);
        return this;
    }

    /**
     * 设置 预载数据集，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDataSetId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSSysUniState psdedatasetid(PSDEDataSet pSDEDataSet){
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
     * <B>PSDEDATASETNAME</B>&nbsp;预载数据集
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDATASETID}
     */
    public final static String FIELD_PSDEDATASETNAME = "psdedatasetname";

    /**
     * 设置 预载数据集
     * 
     * @param pSDEDataSetName
     * 
     */
    @JsonProperty(FIELD_PSDEDATASETNAME)
    public void setPSDEDataSetName(String pSDEDataSetName){
        this.set(FIELD_PSDEDATASETNAME, pSDEDataSetName);
    }
    
    /**
     * 获取 预载数据集  
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
     * 判断 预载数据集 是否指定值，包括空值
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
     * 重置 预载数据集
     */
    @JsonIgnore
    public void resetPSDEDataSetName(){
        this.reset(FIELD_PSDEDATASETNAME);
    }

    /**
     * 设置 预载数据集
     * <P>
     * 等同 {@link #setPSDEDataSetName}
     * @param pSDEDataSetName
     */
    @JsonIgnore
    public PSSysUniState psdedatasetname(String pSDEDataSetName){
        this.setPSDEDataSetName(pSDEDataSetName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;相关实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 相关实体
     * 
     * @param pSDEId
     * 
     */
    @JsonProperty(FIELD_PSDEID)
    public void setPSDEId(String pSDEId){
        this.set(FIELD_PSDEID, pSDEId);
    }
    
    /**
     * 获取 相关实体  
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
     * 判断 相关实体 是否指定值，包括空值
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
     * 重置 相关实体
     */
    @JsonIgnore
    public void resetPSDEId(){
        this.reset(FIELD_PSDEID);
    }

    /**
     * 设置 相关实体
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSSysUniState psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * 设置 相关实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSSysUniState psdeid(PSDataEntity pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;相关实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_PSDENAME = "psdename";

    /**
     * 设置 相关实体
     * 
     * @param pSDEName
     * 
     */
    @JsonProperty(FIELD_PSDENAME)
    public void setPSDEName(String pSDEName){
        this.set(FIELD_PSDENAME, pSDEName);
    }
    
    /**
     * 获取 相关实体  
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
     * 判断 相关实体 是否指定值，包括空值
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
     * 重置 相关实体
     */
    @JsonIgnore
    public void resetPSDEName(){
        this.reset(FIELD_PSDENAME);
    }

    /**
     * 设置 相关实体
     * <P>
     * 等同 {@link #setPSDEName}
     * @param pSDEName
     */
    @JsonIgnore
    public PSSysUniState psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定系统状态协同所在的系统模块
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSModule} 
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
    public PSSysUniState psmoduleid(String pSModuleId){
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
    public PSSysUniState psmoduleid(PSModule pSModule){
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
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定系统状态协同所在的系统模块
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
    public PSSysUniState psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
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
    public PSSysUniState pssyssfpluginid(String pSSysSFPluginId){
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
    public PSSysUniState pssyssfpluginid(PSSysSFPlugin pSSysSFPlugin){
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
    public PSSysUniState pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    /**
     * <B>PSSYSUNISTATEID</B>&nbsp;系统状态协同标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSUNISTATEID = "pssysunistateid";

    /**
     * 设置 系统状态协同标识
     * 
     * @param pSSysUniStateId
     * 
     */
    @JsonProperty(FIELD_PSSYSUNISTATEID)
    public void setPSSysUniStateId(String pSSysUniStateId){
        this.set(FIELD_PSSYSUNISTATEID, pSSysUniStateId);
    }
    
    /**
     * 获取 系统状态协同标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysUniStateId(){
        Object objValue = this.get(FIELD_PSSYSUNISTATEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统状态协同标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUniStateIdDirty(){
        if(this.contains(FIELD_PSSYSUNISTATEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统状态协同标识
     */
    @JsonIgnore
    public void resetPSSysUniStateId(){
        this.reset(FIELD_PSSYSUNISTATEID);
    }

    /**
     * 设置 系统状态协同标识
     * <P>
     * 等同 {@link #setPSSysUniStateId}
     * @param pSSysUniStateId
     */
    @JsonIgnore
    public PSSysUniState pssysunistateid(String pSSysUniStateId){
        this.setPSSysUniStateId(pSSysUniStateId);
        return this;
    }

    /**
     * <B>PSSYSUNISTATENAME</B>&nbsp;系统状态协同名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSUNISTATENAME = "pssysunistatename";

    /**
     * 设置 系统状态协同名称
     * 
     * @param pSSysUniStateName
     * 
     */
    @JsonProperty(FIELD_PSSYSUNISTATENAME)
    public void setPSSysUniStateName(String pSSysUniStateName){
        this.set(FIELD_PSSYSUNISTATENAME, pSSysUniStateName);
    }
    
    /**
     * 获取 系统状态协同名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysUniStateName(){
        Object objValue = this.get(FIELD_PSSYSUNISTATENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统状态协同名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUniStateNameDirty(){
        if(this.contains(FIELD_PSSYSUNISTATENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统状态协同名称
     */
    @JsonIgnore
    public void resetPSSysUniStateName(){
        this.reset(FIELD_PSSYSUNISTATENAME);
    }

    /**
     * 设置 系统状态协同名称
     * <P>
     * 等同 {@link #setPSSysUniStateName}
     * @param pSSysUniStateName
     */
    @JsonIgnore
    public PSSysUniState pssysunistatename(String pSSysUniStateName){
        this.setPSSysUniStateName(pSSysUniStateName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysUniStateName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysUniStateName(strName);
    }

    @JsonIgnore
    public PSSysUniState name(String strName){
        this.setPSSysUniStateName(strName);
        return this;
    }

    /**
     * <B>PSSYSUTILID</B>&nbsp;系统功能组件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysUtil} 
     */
    public final static String FIELD_PSSYSUTILID = "pssysutilid";

    /**
     * 设置 系统功能组件
     * 
     * @param pSSysUtilId
     * 
     */
    @JsonProperty(FIELD_PSSYSUTILID)
    public void setPSSysUtilId(String pSSysUtilId){
        this.set(FIELD_PSSYSUTILID, pSSysUtilId);
        //属性名称与代码标识不一致，设置属性名称
        this.set("pssysutildeid", pSSysUtilId);
    }
    
    /**
     * 获取 系统功能组件  
     * @return
     */
    @JsonIgnore
    public String getPSSysUtilId(){
        Object objValue = this.get(FIELD_PSSYSUTILID);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("pssysutildeid");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 系统功能组件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUtilIdDirty(){
        if(this.contains(FIELD_PSSYSUTILID)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("pssysutildeid")){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统功能组件
     */
    @JsonIgnore
    public void resetPSSysUtilId(){
        this.reset(FIELD_PSSYSUTILID);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("pssysutildeid");
    }

    /**
     * 设置 系统功能组件
     * <P>
     * 等同 {@link #setPSSysUtilId}
     * @param pSSysUtilId
     */
    @JsonIgnore
    public PSSysUniState pssysutilid(String pSSysUtilId){
        this.setPSSysUtilId(pSSysUtilId);
        return this;
    }

    /**
     * 设置 系统功能组件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysUtilId}
     * @param pSSysUtil 引用对象
     */
    @JsonIgnore
    public PSSysUniState pssysutilid(PSSysUtil pSSysUtil){
        if(pSSysUtil == null){
            this.setPSSysUtilId(null);
            this.setPSSysUtilName(null);
        }
        else{
            this.setPSSysUtilId(pSSysUtil.getPSSysUtilId());
            this.setPSSysUtilName(pSSysUtil.getPSSysUtilName());
        }
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSSysUtilDEId(){
        return this.getPSSysUtilId();
    }

    @JsonIgnore
    @Deprecated        
    public void setPSSysUtilDEId(String pSSysUtilDEId){
        this.setPSSysUtilId(pSSysUtilDEId);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSSysUtilDEIdDirty(){
        return this.isPSSysUtilIdDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSSysUtilDEId(){
        this.resetPSSysUtilId();
    }

    /**
     * <B>PSSYSUTILNAME</B>&nbsp;系统功能组件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSUTILID}
     */
    public final static String FIELD_PSSYSUTILNAME = "pssysutilname";

    /**
     * 设置 系统功能组件
     * 
     * @param pSSysUtilName
     * 
     */
    @JsonProperty(FIELD_PSSYSUTILNAME)
    public void setPSSysUtilName(String pSSysUtilName){
        this.set(FIELD_PSSYSUTILNAME, pSSysUtilName);
        //属性名称与代码标识不一致，设置属性名称
        this.set("pssysutildename", pSSysUtilName);
    }
    
    /**
     * 获取 系统功能组件  
     * @return
     */
    @JsonIgnore
    public String getPSSysUtilName(){
        Object objValue = this.get(FIELD_PSSYSUTILNAME);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("pssysutildename");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 系统功能组件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUtilNameDirty(){
        if(this.contains(FIELD_PSSYSUTILNAME)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("pssysutildename")){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统功能组件
     */
    @JsonIgnore
    public void resetPSSysUtilName(){
        this.reset(FIELD_PSSYSUTILNAME);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("pssysutildename");
    }

    /**
     * 设置 系统功能组件
     * <P>
     * 等同 {@link #setPSSysUtilName}
     * @param pSSysUtilName
     */
    @JsonIgnore
    public PSSysUniState pssysutilname(String pSSysUtilName){
        this.setPSSysUtilName(pSSysUtilName);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSSysUtilDEName(){
        return this.getPSSysUtilName();
    }

    @JsonIgnore
    @Deprecated        
    public void setPSSysUtilDEName(String pSSysUtilDEName){
        this.setPSSysUtilName(pSSysUtilDEName);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSSysUtilDENameDirty(){
        return this.isPSSysUtilNameDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSSysUtilDEName(){
        this.resetPSSysUtilName();
    }

    /**
     * <B>RELOADTIMER</B>&nbsp;数据集刷新间隔
     */
    public final static String FIELD_RELOADTIMER = "reloadtimer";

    /**
     * 设置 数据集刷新间隔
     * 
     * @param reloadTimer
     * 
     */
    @JsonProperty(FIELD_RELOADTIMER)
    public void setReloadTimer(Integer reloadTimer){
        this.set(FIELD_RELOADTIMER, reloadTimer);
    }
    
    /**
     * 获取 数据集刷新间隔  
     * @return
     */
    @JsonIgnore
    public Integer getReloadTimer(){
        Object objValue = this.get(FIELD_RELOADTIMER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 数据集刷新间隔 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isReloadTimerDirty(){
        if(this.contains(FIELD_RELOADTIMER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据集刷新间隔
     */
    @JsonIgnore
    public void resetReloadTimer(){
        this.reset(FIELD_RELOADTIMER);
    }

    /**
     * 设置 数据集刷新间隔
     * <P>
     * 等同 {@link #setReloadTimer}
     * @param reloadTimer
     */
    @JsonIgnore
    public PSSysUniState reloadtimer(Integer reloadTimer){
        this.setReloadTimer(reloadTimer);
        return this;
    }

    /**
     * <B>STATE2PSDEFID</B>&nbsp;状态2属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_STATE2PSDEFID = "state2psdefid";

    /**
     * 设置 状态2属性
     * 
     * @param state2PSDEFId
     * 
     */
    @JsonProperty(FIELD_STATE2PSDEFID)
    public void setState2PSDEFId(String state2PSDEFId){
        this.set(FIELD_STATE2PSDEFID, state2PSDEFId);
    }
    
    /**
     * 获取 状态2属性  
     * @return
     */
    @JsonIgnore
    public String getState2PSDEFId(){
        Object objValue = this.get(FIELD_STATE2PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 状态2属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isState2PSDEFIdDirty(){
        if(this.contains(FIELD_STATE2PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 状态2属性
     */
    @JsonIgnore
    public void resetState2PSDEFId(){
        this.reset(FIELD_STATE2PSDEFID);
    }

    /**
     * 设置 状态2属性
     * <P>
     * 等同 {@link #setState2PSDEFId}
     * @param state2PSDEFId
     */
    @JsonIgnore
    public PSSysUniState state2psdefid(String state2PSDEFId){
        this.setState2PSDEFId(state2PSDEFId);
        return this;
    }

    /**
     * 设置 状态2属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setState2PSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysUniState state2psdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setState2PSDEFId(null);
            this.setState2PSDEFName(null);
        }
        else{
            this.setState2PSDEFId(pSDEField.getPSDEFieldId());
            this.setState2PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>STATE2PSDEFNAME</B>&nbsp;状态2属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_STATE2PSDEFID}
     */
    public final static String FIELD_STATE2PSDEFNAME = "state2psdefname";

    /**
     * 设置 状态2属性
     * 
     * @param state2PSDEFName
     * 
     */
    @JsonProperty(FIELD_STATE2PSDEFNAME)
    public void setState2PSDEFName(String state2PSDEFName){
        this.set(FIELD_STATE2PSDEFNAME, state2PSDEFName);
    }
    
    /**
     * 获取 状态2属性  
     * @return
     */
    @JsonIgnore
    public String getState2PSDEFName(){
        Object objValue = this.get(FIELD_STATE2PSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 状态2属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isState2PSDEFNameDirty(){
        if(this.contains(FIELD_STATE2PSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 状态2属性
     */
    @JsonIgnore
    public void resetState2PSDEFName(){
        this.reset(FIELD_STATE2PSDEFNAME);
    }

    /**
     * 设置 状态2属性
     * <P>
     * 等同 {@link #setState2PSDEFName}
     * @param state2PSDEFName
     */
    @JsonIgnore
    public PSSysUniState state2psdefname(String state2PSDEFName){
        this.setState2PSDEFName(state2PSDEFName);
        return this;
    }

    /**
     * <B>STATE3PSDEFID</B>&nbsp;状态3属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_STATE3PSDEFID = "state3psdefid";

    /**
     * 设置 状态3属性
     * 
     * @param state3PSDEFId
     * 
     */
    @JsonProperty(FIELD_STATE3PSDEFID)
    public void setState3PSDEFId(String state3PSDEFId){
        this.set(FIELD_STATE3PSDEFID, state3PSDEFId);
    }
    
    /**
     * 获取 状态3属性  
     * @return
     */
    @JsonIgnore
    public String getState3PSDEFId(){
        Object objValue = this.get(FIELD_STATE3PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 状态3属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isState3PSDEFIdDirty(){
        if(this.contains(FIELD_STATE3PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 状态3属性
     */
    @JsonIgnore
    public void resetState3PSDEFId(){
        this.reset(FIELD_STATE3PSDEFID);
    }

    /**
     * 设置 状态3属性
     * <P>
     * 等同 {@link #setState3PSDEFId}
     * @param state3PSDEFId
     */
    @JsonIgnore
    public PSSysUniState state3psdefid(String state3PSDEFId){
        this.setState3PSDEFId(state3PSDEFId);
        return this;
    }

    /**
     * 设置 状态3属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setState3PSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysUniState state3psdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setState3PSDEFId(null);
            this.setState3PSDEFName(null);
        }
        else{
            this.setState3PSDEFId(pSDEField.getPSDEFieldId());
            this.setState3PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>STATE3PSDEFNAME</B>&nbsp;状态3属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_STATE3PSDEFID}
     */
    public final static String FIELD_STATE3PSDEFNAME = "state3psdefname";

    /**
     * 设置 状态3属性
     * 
     * @param state3PSDEFName
     * 
     */
    @JsonProperty(FIELD_STATE3PSDEFNAME)
    public void setState3PSDEFName(String state3PSDEFName){
        this.set(FIELD_STATE3PSDEFNAME, state3PSDEFName);
    }
    
    /**
     * 获取 状态3属性  
     * @return
     */
    @JsonIgnore
    public String getState3PSDEFName(){
        Object objValue = this.get(FIELD_STATE3PSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 状态3属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isState3PSDEFNameDirty(){
        if(this.contains(FIELD_STATE3PSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 状态3属性
     */
    @JsonIgnore
    public void resetState3PSDEFName(){
        this.reset(FIELD_STATE3PSDEFNAME);
    }

    /**
     * 设置 状态3属性
     * <P>
     * 等同 {@link #setState3PSDEFName}
     * @param state3PSDEFName
     */
    @JsonIgnore
    public PSSysUniState state3psdefname(String state3PSDEFName){
        this.setState3PSDEFName(state3PSDEFName);
        return this;
    }

    /**
     * <B>STATE4PSDEFID</B>&nbsp;状态4属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_STATE4PSDEFID = "state4psdefid";

    /**
     * 设置 状态4属性
     * 
     * @param state4PSDEFId
     * 
     */
    @JsonProperty(FIELD_STATE4PSDEFID)
    public void setState4PSDEFId(String state4PSDEFId){
        this.set(FIELD_STATE4PSDEFID, state4PSDEFId);
    }
    
    /**
     * 获取 状态4属性  
     * @return
     */
    @JsonIgnore
    public String getState4PSDEFId(){
        Object objValue = this.get(FIELD_STATE4PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 状态4属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isState4PSDEFIdDirty(){
        if(this.contains(FIELD_STATE4PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 状态4属性
     */
    @JsonIgnore
    public void resetState4PSDEFId(){
        this.reset(FIELD_STATE4PSDEFID);
    }

    /**
     * 设置 状态4属性
     * <P>
     * 等同 {@link #setState4PSDEFId}
     * @param state4PSDEFId
     */
    @JsonIgnore
    public PSSysUniState state4psdefid(String state4PSDEFId){
        this.setState4PSDEFId(state4PSDEFId);
        return this;
    }

    /**
     * 设置 状态4属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setState4PSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysUniState state4psdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setState4PSDEFId(null);
            this.setState4PSDEFName(null);
        }
        else{
            this.setState4PSDEFId(pSDEField.getPSDEFieldId());
            this.setState4PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>STATE4PSDEFNAME</B>&nbsp;状态4属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_STATE4PSDEFID}
     */
    public final static String FIELD_STATE4PSDEFNAME = "state4psdefname";

    /**
     * 设置 状态4属性
     * 
     * @param state4PSDEFName
     * 
     */
    @JsonProperty(FIELD_STATE4PSDEFNAME)
    public void setState4PSDEFName(String state4PSDEFName){
        this.set(FIELD_STATE4PSDEFNAME, state4PSDEFName);
    }
    
    /**
     * 获取 状态4属性  
     * @return
     */
    @JsonIgnore
    public String getState4PSDEFName(){
        Object objValue = this.get(FIELD_STATE4PSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 状态4属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isState4PSDEFNameDirty(){
        if(this.contains(FIELD_STATE4PSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 状态4属性
     */
    @JsonIgnore
    public void resetState4PSDEFName(){
        this.reset(FIELD_STATE4PSDEFNAME);
    }

    /**
     * 设置 状态4属性
     * <P>
     * 等同 {@link #setState4PSDEFName}
     * @param state4PSDEFName
     */
    @JsonIgnore
    public PSSysUniState state4psdefname(String state4PSDEFName){
        this.setState4PSDEFName(state4PSDEFName);
        return this;
    }

    /**
     * <B>STATE5PSDEFID</B>&nbsp;状态5属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_STATE5PSDEFID = "state5psdefid";

    /**
     * 设置 状态5属性
     * 
     * @param state5PSDEFId
     * 
     */
    @JsonProperty(FIELD_STATE5PSDEFID)
    public void setState5PSDEFId(String state5PSDEFId){
        this.set(FIELD_STATE5PSDEFID, state5PSDEFId);
    }
    
    /**
     * 获取 状态5属性  
     * @return
     */
    @JsonIgnore
    public String getState5PSDEFId(){
        Object objValue = this.get(FIELD_STATE5PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 状态5属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isState5PSDEFIdDirty(){
        if(this.contains(FIELD_STATE5PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 状态5属性
     */
    @JsonIgnore
    public void resetState5PSDEFId(){
        this.reset(FIELD_STATE5PSDEFID);
    }

    /**
     * 设置 状态5属性
     * <P>
     * 等同 {@link #setState5PSDEFId}
     * @param state5PSDEFId
     */
    @JsonIgnore
    public PSSysUniState state5psdefid(String state5PSDEFId){
        this.setState5PSDEFId(state5PSDEFId);
        return this;
    }

    /**
     * 设置 状态5属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setState5PSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysUniState state5psdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setState5PSDEFId(null);
            this.setState5PSDEFName(null);
        }
        else{
            this.setState5PSDEFId(pSDEField.getPSDEFieldId());
            this.setState5PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>STATE5PSDEFNAME</B>&nbsp;状态5属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_STATE5PSDEFID}
     */
    public final static String FIELD_STATE5PSDEFNAME = "state5psdefname";

    /**
     * 设置 状态5属性
     * 
     * @param state5PSDEFName
     * 
     */
    @JsonProperty(FIELD_STATE5PSDEFNAME)
    public void setState5PSDEFName(String state5PSDEFName){
        this.set(FIELD_STATE5PSDEFNAME, state5PSDEFName);
    }
    
    /**
     * 获取 状态5属性  
     * @return
     */
    @JsonIgnore
    public String getState5PSDEFName(){
        Object objValue = this.get(FIELD_STATE5PSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 状态5属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isState5PSDEFNameDirty(){
        if(this.contains(FIELD_STATE5PSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 状态5属性
     */
    @JsonIgnore
    public void resetState5PSDEFName(){
        this.reset(FIELD_STATE5PSDEFNAME);
    }

    /**
     * 设置 状态5属性
     * <P>
     * 等同 {@link #setState5PSDEFName}
     * @param state5PSDEFName
     */
    @JsonIgnore
    public PSSysUniState state5psdefname(String state5PSDEFName){
        this.setState5PSDEFName(state5PSDEFName);
        return this;
    }

    /**
     * <B>STATE6PSDEFID</B>&nbsp;状态6属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_STATE6PSDEFID = "state6psdefid";

    /**
     * 设置 状态6属性
     * 
     * @param state6PSDEFId
     * 
     */
    @JsonProperty(FIELD_STATE6PSDEFID)
    public void setState6PSDEFId(String state6PSDEFId){
        this.set(FIELD_STATE6PSDEFID, state6PSDEFId);
    }
    
    /**
     * 获取 状态6属性  
     * @return
     */
    @JsonIgnore
    public String getState6PSDEFId(){
        Object objValue = this.get(FIELD_STATE6PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 状态6属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isState6PSDEFIdDirty(){
        if(this.contains(FIELD_STATE6PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 状态6属性
     */
    @JsonIgnore
    public void resetState6PSDEFId(){
        this.reset(FIELD_STATE6PSDEFID);
    }

    /**
     * 设置 状态6属性
     * <P>
     * 等同 {@link #setState6PSDEFId}
     * @param state6PSDEFId
     */
    @JsonIgnore
    public PSSysUniState state6psdefid(String state6PSDEFId){
        this.setState6PSDEFId(state6PSDEFId);
        return this;
    }

    /**
     * 设置 状态6属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setState6PSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysUniState state6psdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setState6PSDEFId(null);
            this.setState6PSDEFName(null);
        }
        else{
            this.setState6PSDEFId(pSDEField.getPSDEFieldId());
            this.setState6PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>STATE6PSDEFNAME</B>&nbsp;状态6属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_STATE6PSDEFID}
     */
    public final static String FIELD_STATE6PSDEFNAME = "state6psdefname";

    /**
     * 设置 状态6属性
     * 
     * @param state6PSDEFName
     * 
     */
    @JsonProperty(FIELD_STATE6PSDEFNAME)
    public void setState6PSDEFName(String state6PSDEFName){
        this.set(FIELD_STATE6PSDEFNAME, state6PSDEFName);
    }
    
    /**
     * 获取 状态6属性  
     * @return
     */
    @JsonIgnore
    public String getState6PSDEFName(){
        Object objValue = this.get(FIELD_STATE6PSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 状态6属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isState6PSDEFNameDirty(){
        if(this.contains(FIELD_STATE6PSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 状态6属性
     */
    @JsonIgnore
    public void resetState6PSDEFName(){
        this.reset(FIELD_STATE6PSDEFNAME);
    }

    /**
     * 设置 状态6属性
     * <P>
     * 等同 {@link #setState6PSDEFName}
     * @param state6PSDEFName
     */
    @JsonIgnore
    public PSSysUniState state6psdefname(String state6PSDEFName){
        this.setState6PSDEFName(state6PSDEFName);
        return this;
    }

    /**
     * <B>STATE7PSDEFID</B>&nbsp;状态7属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_STATE7PSDEFID = "state7psdefid";

    /**
     * 设置 状态7属性
     * 
     * @param state7PSDEFId
     * 
     */
    @JsonProperty(FIELD_STATE7PSDEFID)
    public void setState7PSDEFId(String state7PSDEFId){
        this.set(FIELD_STATE7PSDEFID, state7PSDEFId);
    }
    
    /**
     * 获取 状态7属性  
     * @return
     */
    @JsonIgnore
    public String getState7PSDEFId(){
        Object objValue = this.get(FIELD_STATE7PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 状态7属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isState7PSDEFIdDirty(){
        if(this.contains(FIELD_STATE7PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 状态7属性
     */
    @JsonIgnore
    public void resetState7PSDEFId(){
        this.reset(FIELD_STATE7PSDEFID);
    }

    /**
     * 设置 状态7属性
     * <P>
     * 等同 {@link #setState7PSDEFId}
     * @param state7PSDEFId
     */
    @JsonIgnore
    public PSSysUniState state7psdefid(String state7PSDEFId){
        this.setState7PSDEFId(state7PSDEFId);
        return this;
    }

    /**
     * 设置 状态7属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setState7PSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysUniState state7psdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setState7PSDEFId(null);
            this.setState7PSDEFName(null);
        }
        else{
            this.setState7PSDEFId(pSDEField.getPSDEFieldId());
            this.setState7PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>STATE7PSDEFNAME</B>&nbsp;状态7属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_STATE7PSDEFID}
     */
    public final static String FIELD_STATE7PSDEFNAME = "state7psdefname";

    /**
     * 设置 状态7属性
     * 
     * @param state7PSDEFName
     * 
     */
    @JsonProperty(FIELD_STATE7PSDEFNAME)
    public void setState7PSDEFName(String state7PSDEFName){
        this.set(FIELD_STATE7PSDEFNAME, state7PSDEFName);
    }
    
    /**
     * 获取 状态7属性  
     * @return
     */
    @JsonIgnore
    public String getState7PSDEFName(){
        Object objValue = this.get(FIELD_STATE7PSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 状态7属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isState7PSDEFNameDirty(){
        if(this.contains(FIELD_STATE7PSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 状态7属性
     */
    @JsonIgnore
    public void resetState7PSDEFName(){
        this.reset(FIELD_STATE7PSDEFNAME);
    }

    /**
     * 设置 状态7属性
     * <P>
     * 等同 {@link #setState7PSDEFName}
     * @param state7PSDEFName
     */
    @JsonIgnore
    public PSSysUniState state7psdefname(String state7PSDEFName){
        this.setState7PSDEFName(state7PSDEFName);
        return this;
    }

    /**
     * <B>STATE8PSDEFID</B>&nbsp;状态8属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_STATE8PSDEFID = "state8psdefid";

    /**
     * 设置 状态8属性
     * 
     * @param state8PSDEFId
     * 
     */
    @JsonProperty(FIELD_STATE8PSDEFID)
    public void setState8PSDEFId(String state8PSDEFId){
        this.set(FIELD_STATE8PSDEFID, state8PSDEFId);
    }
    
    /**
     * 获取 状态8属性  
     * @return
     */
    @JsonIgnore
    public String getState8PSDEFId(){
        Object objValue = this.get(FIELD_STATE8PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 状态8属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isState8PSDEFIdDirty(){
        if(this.contains(FIELD_STATE8PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 状态8属性
     */
    @JsonIgnore
    public void resetState8PSDEFId(){
        this.reset(FIELD_STATE8PSDEFID);
    }

    /**
     * 设置 状态8属性
     * <P>
     * 等同 {@link #setState8PSDEFId}
     * @param state8PSDEFId
     */
    @JsonIgnore
    public PSSysUniState state8psdefid(String state8PSDEFId){
        this.setState8PSDEFId(state8PSDEFId);
        return this;
    }

    /**
     * 设置 状态8属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setState8PSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysUniState state8psdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setState8PSDEFId(null);
            this.setState8PSDEFName(null);
        }
        else{
            this.setState8PSDEFId(pSDEField.getPSDEFieldId());
            this.setState8PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>STATE8PSDEFNAME</B>&nbsp;状态8属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_STATE8PSDEFID}
     */
    public final static String FIELD_STATE8PSDEFNAME = "state8psdefname";

    /**
     * 设置 状态8属性
     * 
     * @param state8PSDEFName
     * 
     */
    @JsonProperty(FIELD_STATE8PSDEFNAME)
    public void setState8PSDEFName(String state8PSDEFName){
        this.set(FIELD_STATE8PSDEFNAME, state8PSDEFName);
    }
    
    /**
     * 获取 状态8属性  
     * @return
     */
    @JsonIgnore
    public String getState8PSDEFName(){
        Object objValue = this.get(FIELD_STATE8PSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 状态8属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isState8PSDEFNameDirty(){
        if(this.contains(FIELD_STATE8PSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 状态8属性
     */
    @JsonIgnore
    public void resetState8PSDEFName(){
        this.reset(FIELD_STATE8PSDEFNAME);
    }

    /**
     * 设置 状态8属性
     * <P>
     * 等同 {@link #setState8PSDEFName}
     * @param state8PSDEFName
     */
    @JsonIgnore
    public PSSysUniState state8psdefname(String state8PSDEFName){
        this.setState8PSDEFName(state8PSDEFName);
        return this;
    }

    /**
     * <B>STATEPSDEFID</B>&nbsp;状态1属性，指定状态协同的状态1属性，未指定时使用实体预置的【最后更新时间】属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_STATEPSDEFID = "statepsdefid";

    /**
     * 设置 状态1属性，详细说明：{@link #FIELD_STATEPSDEFID}
     * 
     * @param statePSDEFId
     * 
     */
    @JsonProperty(FIELD_STATEPSDEFID)
    public void setStatePSDEFId(String statePSDEFId){
        this.set(FIELD_STATEPSDEFID, statePSDEFId);
    }
    
    /**
     * 获取 状态1属性  
     * @return
     */
    @JsonIgnore
    public String getStatePSDEFId(){
        Object objValue = this.get(FIELD_STATEPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 状态1属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStatePSDEFIdDirty(){
        if(this.contains(FIELD_STATEPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 状态1属性
     */
    @JsonIgnore
    public void resetStatePSDEFId(){
        this.reset(FIELD_STATEPSDEFID);
    }

    /**
     * 设置 状态1属性，详细说明：{@link #FIELD_STATEPSDEFID}
     * <P>
     * 等同 {@link #setStatePSDEFId}
     * @param statePSDEFId
     */
    @JsonIgnore
    public PSSysUniState statepsdefid(String statePSDEFId){
        this.setStatePSDEFId(statePSDEFId);
        return this;
    }

    /**
     * 设置 状态1属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setStatePSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysUniState statepsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setStatePSDEFId(null);
            this.setStatePSDEFName(null);
        }
        else{
            this.setStatePSDEFId(pSDEField.getPSDEFieldId());
            this.setStatePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>STATEPSDEFNAME</B>&nbsp;状态1属性，指定状态协同的状态1属性，未指定时使用实体预置的【最后更新时间】属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_STATEPSDEFID}
     */
    public final static String FIELD_STATEPSDEFNAME = "statepsdefname";

    /**
     * 设置 状态1属性，详细说明：{@link #FIELD_STATEPSDEFNAME}
     * 
     * @param statePSDEFName
     * 
     */
    @JsonProperty(FIELD_STATEPSDEFNAME)
    public void setStatePSDEFName(String statePSDEFName){
        this.set(FIELD_STATEPSDEFNAME, statePSDEFName);
    }
    
    /**
     * 获取 状态1属性  
     * @return
     */
    @JsonIgnore
    public String getStatePSDEFName(){
        Object objValue = this.get(FIELD_STATEPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 状态1属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStatePSDEFNameDirty(){
        if(this.contains(FIELD_STATEPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 状态1属性
     */
    @JsonIgnore
    public void resetStatePSDEFName(){
        this.reset(FIELD_STATEPSDEFNAME);
    }

    /**
     * 设置 状态1属性，详细说明：{@link #FIELD_STATEPSDEFNAME}
     * <P>
     * 等同 {@link #setStatePSDEFName}
     * @param statePSDEFName
     */
    @JsonIgnore
    public PSSysUniState statepsdefname(String statePSDEFName){
        this.setStatePSDEFName(statePSDEFName);
        return this;
    }

    /**
     * <B>UNIQUETAG</B>&nbsp;唯一业务标识，指定系统状态协同的的业务标记，需要在所在的模型域（系统模块或系统）中具有唯一性
     * <P>
     * 字符串：最大长度 100，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_UNIQUETAG = "uniquetag";

    /**
     * 设置 唯一业务标识，详细说明：{@link #FIELD_UNIQUETAG}
     * 
     * @param uniqueTag
     * 
     */
    @JsonProperty(FIELD_UNIQUETAG)
    public void setUniqueTag(String uniqueTag){
        this.set(FIELD_UNIQUETAG, uniqueTag);
    }
    
    /**
     * 获取 唯一业务标识  
     * @return
     */
    @JsonIgnore
    public String getUniqueTag(){
        Object objValue = this.get(FIELD_UNIQUETAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 唯一业务标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUniqueTagDirty(){
        if(this.contains(FIELD_UNIQUETAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 唯一业务标识
     */
    @JsonIgnore
    public void resetUniqueTag(){
        this.reset(FIELD_UNIQUETAG);
    }

    /**
     * 设置 唯一业务标识，详细说明：{@link #FIELD_UNIQUETAG}
     * <P>
     * 等同 {@link #setUniqueTag}
     * @param uniqueTag
     */
    @JsonIgnore
    public PSSysUniState uniquetag(String uniqueTag){
        this.setUniqueTag(uniqueTag);
        return this;
    }

    /**
     * <B>UNISTATEMODE</B>&nbsp;统一状态模式
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_UNISTATEMODE = "unistatemode";

    /**
     * 设置 统一状态模式
     * 
     * @param uniStateMode
     * 
     */
    @JsonProperty(FIELD_UNISTATEMODE)
    public void setUniStateMode(String uniStateMode){
        this.set(FIELD_UNISTATEMODE, uniStateMode);
    }
    
    /**
     * 获取 统一状态模式  
     * @return
     */
    @JsonIgnore
    public String getUniStateMode(){
        Object objValue = this.get(FIELD_UNISTATEMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 统一状态模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUniStateModeDirty(){
        if(this.contains(FIELD_UNISTATEMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 统一状态模式
     */
    @JsonIgnore
    public void resetUniStateMode(){
        this.reset(FIELD_UNISTATEMODE);
    }

    /**
     * 设置 统一状态模式
     * <P>
     * 等同 {@link #setUniStateMode}
     * @param uniStateMode
     */
    @JsonIgnore
    public PSSysUniState unistatemode(String uniStateMode){
        this.setUniStateMode(uniStateMode);
        return this;
    }

    /**
     * <B>UNISTATEPARAMS</B>&nbsp;统一状态参数
     */
    public final static String FIELD_UNISTATEPARAMS = "unistateparams";

    /**
     * 设置 统一状态参数
     * 
     * @param uniStateParams
     * 
     */
    @JsonProperty(FIELD_UNISTATEPARAMS)
    public void setUniStateParams(String uniStateParams){
        this.set(FIELD_UNISTATEPARAMS, uniStateParams);
    }
    
    /**
     * 获取 统一状态参数  
     * @return
     */
    @JsonIgnore
    public String getUniStateParams(){
        Object objValue = this.get(FIELD_UNISTATEPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 统一状态参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUniStateParamsDirty(){
        if(this.contains(FIELD_UNISTATEPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 统一状态参数
     */
    @JsonIgnore
    public void resetUniStateParams(){
        this.reset(FIELD_UNISTATEPARAMS);
    }

    /**
     * 设置 统一状态参数
     * <P>
     * 等同 {@link #setUniStateParams}
     * @param uniStateParams
     */
    @JsonIgnore
    public PSSysUniState unistateparams(String uniStateParams){
        this.setUniStateParams(uniStateParams);
        return this;
    }

    /**
     * <B>UNISTATETAG</B>&nbsp;统一状态标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_UNISTATETAG = "unistatetag";

    /**
     * 设置 统一状态标记
     * 
     * @param uniStateTag
     * 
     */
    @JsonProperty(FIELD_UNISTATETAG)
    public void setUniStateTag(String uniStateTag){
        this.set(FIELD_UNISTATETAG, uniStateTag);
    }
    
    /**
     * 获取 统一状态标记  
     * @return
     */
    @JsonIgnore
    public String getUniStateTag(){
        Object objValue = this.get(FIELD_UNISTATETAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 统一状态标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUniStateTagDirty(){
        if(this.contains(FIELD_UNISTATETAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 统一状态标记
     */
    @JsonIgnore
    public void resetUniStateTag(){
        this.reset(FIELD_UNISTATETAG);
    }

    /**
     * 设置 统一状态标记
     * <P>
     * 等同 {@link #setUniStateTag}
     * @param uniStateTag
     */
    @JsonIgnore
    public PSSysUniState unistatetag(String uniStateTag){
        this.setUniStateTag(uniStateTag);
        return this;
    }

    /**
     * <B>UNISTATETAG2</B>&nbsp;统一状态标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_UNISTATETAG2 = "unistatetag2";

    /**
     * 设置 统一状态标记2
     * 
     * @param uniStateTag2
     * 
     */
    @JsonProperty(FIELD_UNISTATETAG2)
    public void setUniStateTag2(String uniStateTag2){
        this.set(FIELD_UNISTATETAG2, uniStateTag2);
    }
    
    /**
     * 获取 统一状态标记2  
     * @return
     */
    @JsonIgnore
    public String getUniStateTag2(){
        Object objValue = this.get(FIELD_UNISTATETAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 统一状态标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUniStateTag2Dirty(){
        if(this.contains(FIELD_UNISTATETAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 统一状态标记2
     */
    @JsonIgnore
    public void resetUniStateTag2(){
        this.reset(FIELD_UNISTATETAG2);
    }

    /**
     * 设置 统一状态标记2
     * <P>
     * 等同 {@link #setUniStateTag2}
     * @param uniStateTag2
     */
    @JsonIgnore
    public PSSysUniState unistatetag2(String uniStateTag2){
        this.setUniStateTag2(uniStateTag2);
        return this;
    }

    /**
     * <B>UNISTATETYPE</B>&nbsp;统一状态类型，指定协同状态的类型，默认为【实体】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.UniStateType} 
     */
    public final static String FIELD_UNISTATETYPE = "unistatetype";

    /**
     * 设置 统一状态类型，详细说明：{@link #FIELD_UNISTATETYPE}
     * 
     * @param uniStateType
     * 
     */
    @JsonProperty(FIELD_UNISTATETYPE)
    public void setUniStateType(String uniStateType){
        this.set(FIELD_UNISTATETYPE, uniStateType);
    }
    
    /**
     * 获取 统一状态类型  
     * @return
     */
    @JsonIgnore
    public String getUniStateType(){
        Object objValue = this.get(FIELD_UNISTATETYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 统一状态类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUniStateTypeDirty(){
        if(this.contains(FIELD_UNISTATETYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 统一状态类型
     */
    @JsonIgnore
    public void resetUniStateType(){
        this.reset(FIELD_UNISTATETYPE);
    }

    /**
     * 设置 统一状态类型，详细说明：{@link #FIELD_UNISTATETYPE}
     * <P>
     * 等同 {@link #setUniStateType}
     * @param uniStateType
     */
    @JsonIgnore
    public PSSysUniState unistatetype(String uniStateType){
        this.setUniStateType(uniStateType);
        return this;
    }

     /**
     * 设置 统一状态类型，详细说明：{@link #FIELD_UNISTATETYPE}
     * <P>
     * 等同 {@link #setUniStateType}
     * @param uniStateType
     */
    @JsonIgnore
    public PSSysUniState unistatetype(net.ibizsys.psmodel.core.util.PSModelEnums.UniStateType uniStateType){
        if(uniStateType == null){
            this.setUniStateType(null);
        }
        else{
            this.setUniStateType(uniStateType.value);
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
    public PSSysUniState updatedate(String updateDate){
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
    public PSSysUniState updateman(String updateMan){
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
    public PSSysUniState usercat(String userCat){
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
    public PSSysUniState usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysUniState usertag(String userTag){
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
    public PSSysUniState usertag2(String userTag2){
        this.setUserTag2(userTag2);
        return this;
    }

    /**
     * <B>USERTAG3</B>&nbsp;用户标识3
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_USERTAG3 = "usertag3";

    /**
     * 设置 用户标识3
     * 
     * @param userTag3
     * 
     */
    @JsonProperty(FIELD_USERTAG3)
    public void setUserTag3(String userTag3){
        this.set(FIELD_USERTAG3, userTag3);
    }
    
    /**
     * 获取 用户标识3  
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
     * 判断 用户标识3 是否指定值，包括空值
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
     * 重置 用户标识3
     */
    @JsonIgnore
    public void resetUserTag3(){
        this.reset(FIELD_USERTAG3);
    }

    /**
     * 设置 用户标识3
     * <P>
     * 等同 {@link #setUserTag3}
     * @param userTag3
     */
    @JsonIgnore
    public PSSysUniState usertag3(String userTag3){
        this.setUserTag3(userTag3);
        return this;
    }

    /**
     * <B>USERTAG4</B>&nbsp;用户标识4
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_USERTAG4 = "usertag4";

    /**
     * 设置 用户标识4
     * 
     * @param userTag4
     * 
     */
    @JsonProperty(FIELD_USERTAG4)
    public void setUserTag4(String userTag4){
        this.set(FIELD_USERTAG4, userTag4);
    }
    
    /**
     * 获取 用户标识4  
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
     * 判断 用户标识4 是否指定值，包括空值
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
     * 重置 用户标识4
     */
    @JsonIgnore
    public void resetUserTag4(){
        this.reset(FIELD_USERTAG4);
    }

    /**
     * 设置 用户标识4
     * <P>
     * 等同 {@link #setUserTag4}
     * @param userTag4
     */
    @JsonIgnore
    public PSSysUniState usertag4(String userTag4){
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
    public PSSysUniState validflag(Integer validFlag){
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
    public PSSysUniState validflag(Boolean validFlag){
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
        return this.getPSSysUniStateId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysUniStateId(strValue);
    }

    @JsonIgnore
    public PSSysUniState id(String strValue){
        this.setPSSysUniStateId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysUniState){
            PSSysUniState model = (PSSysUniState)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
