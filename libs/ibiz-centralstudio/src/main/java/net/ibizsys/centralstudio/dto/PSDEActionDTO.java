package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEACTION</B>实体行为 模型传输对象
 * <P>
 * 实体的行为模型，定义实体对外提供的操作能力。实体行为提供内置、处理逻辑及自定义等类型，支持定义行为参数及调用的检查规则，同时支持附加内外部处理逻辑
 */
public class PSDEActionDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSDEActionDTO(){
    }      

    /**
     * <B>ACTIONHOLDER</B>&nbsp;行为持有者，指定独立提供行为能力的持有者，未指定时默认为【后台及前台】,如行为类型为【处理逻辑】则由相应的处理逻辑决定，如实体启用【临时数据】则由临时数据模式决定
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DELogicHolder} 
     */
    public final static String FIELD_ACTIONHOLDER = "actionholder";

    /**
     * 设置 行为持有者，详细说明：{@link #FIELD_ACTIONHOLDER}
     * 
     * @param actionHolder
     * 
     */
    @JsonProperty(FIELD_ACTIONHOLDER)
    public void setActionHolder(Integer actionHolder){
        this.set(FIELD_ACTIONHOLDER, actionHolder);
    }
    
    /**
     * 获取 行为持有者  
     * @return
     */
    @JsonIgnore
    public Integer getActionHolder(){
        Object objValue = this.get(FIELD_ACTIONHOLDER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 行为持有者 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionHolderDirty(){
        if(this.contains(FIELD_ACTIONHOLDER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 行为持有者
     */
    @JsonIgnore
    public void resetActionHolder(){
        this.reset(FIELD_ACTIONHOLDER);
    }

    /**
     * 设置 行为持有者，详细说明：{@link #FIELD_ACTIONHOLDER}
     * <P>
     * 等同 {@link #setActionHolder}
     * @param actionHolder
     */
    @JsonIgnore
    public PSDEActionDTO actionholder(Integer actionHolder){
        this.setActionHolder(actionHolder);
        return this;
    }

     /**
     * 设置 行为持有者，详细说明：{@link #FIELD_ACTIONHOLDER}
     * <P>
     * 等同 {@link #setActionHolder}
     * @param actionHolder
     */
    @JsonIgnore
    public PSDEActionDTO actionholder(net.ibizsys.model.PSModelEnums.DELogicHolder actionHolder){
        if(actionHolder == null){
            this.setActionHolder(null);
        }
        else{
            this.setActionHolder(actionHolder.value);
        }
        return this;
    }

    /**
     * <B>ACTIONMODE</B>&nbsp;行为模式，指定行为的模式，行为模式定义了行为的目的，用于预置逻辑的附加。未指定时模型引擎将尝试自动计算，无法计算则为【未知操作】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DEActionMode} 
     */
    public final static String FIELD_ACTIONMODE = "actionmode";

    /**
     * 设置 行为模式，详细说明：{@link #FIELD_ACTIONMODE}
     * 
     * @param actionMode
     * 
     */
    @JsonProperty(FIELD_ACTIONMODE)
    public void setActionMode(String actionMode){
        this.set(FIELD_ACTIONMODE, actionMode);
    }
    
    /**
     * 获取 行为模式  
     * @return
     */
    @JsonIgnore
    public String getActionMode(){
        Object objValue = this.get(FIELD_ACTIONMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 行为模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionModeDirty(){
        if(this.contains(FIELD_ACTIONMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 行为模式
     */
    @JsonIgnore
    public void resetActionMode(){
        this.reset(FIELD_ACTIONMODE);
    }

    /**
     * 设置 行为模式，详细说明：{@link #FIELD_ACTIONMODE}
     * <P>
     * 等同 {@link #setActionMode}
     * @param actionMode
     */
    @JsonIgnore
    public PSDEActionDTO actionmode(String actionMode){
        this.setActionMode(actionMode);
        return this;
    }

     /**
     * 设置 行为模式，详细说明：{@link #FIELD_ACTIONMODE}
     * <P>
     * 等同 {@link #setActionMode}
     * @param actionMode
     */
    @JsonIgnore
    public PSDEActionDTO actionmode(net.ibizsys.model.PSModelEnums.DEActionMode actionMode){
        if(actionMode == null){
            this.setActionMode(null);
        }
        else{
            this.setActionMode(actionMode.value);
        }
        return this;
    }

    /**
     * <B>ACTIONTAG</B>&nbsp;行为标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ACTIONTAG = "actiontag";

    /**
     * 设置 行为标记
     * 
     * @param actionTag
     * 
     */
    @JsonProperty(FIELD_ACTIONTAG)
    public void setActionTag(String actionTag){
        this.set(FIELD_ACTIONTAG, actionTag);
    }
    
    /**
     * 获取 行为标记  
     * @return
     */
    @JsonIgnore
    public String getActionTag(){
        Object objValue = this.get(FIELD_ACTIONTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 行为标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionTagDirty(){
        if(this.contains(FIELD_ACTIONTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 行为标记
     */
    @JsonIgnore
    public void resetActionTag(){
        this.reset(FIELD_ACTIONTAG);
    }

    /**
     * 设置 行为标记
     * <P>
     * 等同 {@link #setActionTag}
     * @param actionTag
     */
    @JsonIgnore
    public PSDEActionDTO actiontag(String actionTag){
        this.setActionTag(actionTag);
        return this;
    }

    /**
     * <B>ACTIONTAG2</B>&nbsp;行为标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ACTIONTAG2 = "actiontag2";

    /**
     * 设置 行为标记2
     * 
     * @param actionTag2
     * 
     */
    @JsonProperty(FIELD_ACTIONTAG2)
    public void setActionTag2(String actionTag2){
        this.set(FIELD_ACTIONTAG2, actionTag2);
    }
    
    /**
     * 获取 行为标记2  
     * @return
     */
    @JsonIgnore
    public String getActionTag2(){
        Object objValue = this.get(FIELD_ACTIONTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 行为标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionTag2Dirty(){
        if(this.contains(FIELD_ACTIONTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 行为标记2
     */
    @JsonIgnore
    public void resetActionTag2(){
        this.reset(FIELD_ACTIONTAG2);
    }

    /**
     * 设置 行为标记2
     * <P>
     * 等同 {@link #setActionTag2}
     * @param actionTag2
     */
    @JsonIgnore
    public PSDEActionDTO actiontag2(String actionTag2){
        this.setActionTag2(actionTag2);
        return this;
    }

    /**
     * <B>ACTIONTAG3</B>&nbsp;行为标记3
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ACTIONTAG3 = "actiontag3";

    /**
     * 设置 行为标记3
     * 
     * @param actionTag3
     * 
     */
    @JsonProperty(FIELD_ACTIONTAG3)
    public void setActionTag3(String actionTag3){
        this.set(FIELD_ACTIONTAG3, actionTag3);
    }
    
    /**
     * 获取 行为标记3  
     * @return
     */
    @JsonIgnore
    public String getActionTag3(){
        Object objValue = this.get(FIELD_ACTIONTAG3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 行为标记3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionTag3Dirty(){
        if(this.contains(FIELD_ACTIONTAG3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 行为标记3
     */
    @JsonIgnore
    public void resetActionTag3(){
        this.reset(FIELD_ACTIONTAG3);
    }

    /**
     * 设置 行为标记3
     * <P>
     * 等同 {@link #setActionTag3}
     * @param actionTag3
     */
    @JsonIgnore
    public PSDEActionDTO actiontag3(String actionTag3){
        this.setActionTag3(actionTag3);
        return this;
    }

    /**
     * <B>ACTIONTAG4</B>&nbsp;行为标记4
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ACTIONTAG4 = "actiontag4";

    /**
     * 设置 行为标记4
     * 
     * @param actionTag4
     * 
     */
    @JsonProperty(FIELD_ACTIONTAG4)
    public void setActionTag4(String actionTag4){
        this.set(FIELD_ACTIONTAG4, actionTag4);
    }
    
    /**
     * 获取 行为标记4  
     * @return
     */
    @JsonIgnore
    public String getActionTag4(){
        Object objValue = this.get(FIELD_ACTIONTAG4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 行为标记4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionTag4Dirty(){
        if(this.contains(FIELD_ACTIONTAG4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 行为标记4
     */
    @JsonIgnore
    public void resetActionTag4(){
        this.reset(FIELD_ACTIONTAG4);
    }

    /**
     * 设置 行为标记4
     * <P>
     * 等同 {@link #setActionTag4}
     * @param actionTag4
     */
    @JsonIgnore
    public PSDEActionDTO actiontag4(String actionTag4){
        this.setActionTag4(actionTag4);
        return this;
    }

    /**
     * <B>ACTIONTYPE</B>&nbsp;行为类型，指定实体行为的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DEActionType} 
     */
    public final static String FIELD_ACTIONTYPE = "actiontype";

    /**
     * 设置 行为类型，详细说明：{@link #FIELD_ACTIONTYPE}
     * 
     * @param actionType
     * 
     */
    @JsonProperty(FIELD_ACTIONTYPE)
    public void setActionType(String actionType){
        this.set(FIELD_ACTIONTYPE, actionType);
    }
    
    /**
     * 获取 行为类型  
     * @return
     */
    @JsonIgnore
    public String getActionType(){
        Object objValue = this.get(FIELD_ACTIONTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 行为类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionTypeDirty(){
        if(this.contains(FIELD_ACTIONTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 行为类型
     */
    @JsonIgnore
    public void resetActionType(){
        this.reset(FIELD_ACTIONTYPE);
    }

    /**
     * 设置 行为类型，详细说明：{@link #FIELD_ACTIONTYPE}
     * <P>
     * 等同 {@link #setActionType}
     * @param actionType
     */
    @JsonIgnore
    public PSDEActionDTO actiontype(String actionType){
        this.setActionType(actionType);
        return this;
    }

     /**
     * 设置 行为类型，详细说明：{@link #FIELD_ACTIONTYPE}
     * <P>
     * 等同 {@link #setActionType}
     * @param actionType
     */
    @JsonIgnore
    public PSDEActionDTO actiontype(net.ibizsys.model.PSModelEnums.DEActionType actionType){
        if(actionType == null){
            this.setActionType(null);
        }
        else{
            this.setActionType(actionType.value);
        }
        return this;
    }

    /**
     * <B>AFTERCODE</B>&nbsp;前端执行之后代码
     */
    public final static String FIELD_AFTERCODE = "aftercode";

    /**
     * 设置 前端执行之后代码
     * 
     * @param afterCode
     * 
     */
    @JsonProperty(FIELD_AFTERCODE)
    public void setAfterCode(String afterCode){
        this.set(FIELD_AFTERCODE, afterCode);
    }
    
    /**
     * 获取 前端执行之后代码  
     * @return
     */
    @JsonIgnore
    public String getAfterCode(){
        Object objValue = this.get(FIELD_AFTERCODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端执行之后代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAfterCodeDirty(){
        if(this.contains(FIELD_AFTERCODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端执行之后代码
     */
    @JsonIgnore
    public void resetAfterCode(){
        this.reset(FIELD_AFTERCODE);
    }

    /**
     * 设置 前端执行之后代码
     * <P>
     * 等同 {@link #setAfterCode}
     * @param afterCode
     */
    @JsonIgnore
    public PSDEActionDTO aftercode(String afterCode){
        this.setAfterCode(afterCode);
        return this;
    }

    /**
     * <B>BATCHACTIONMODE</B>&nbsp;批操作模式，指定行为是否支持批操作模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DEActionBatchMode} 
     */
    public final static String FIELD_BATCHACTIONMODE = "batchactionmode";

    /**
     * 设置 批操作模式，详细说明：{@link #FIELD_BATCHACTIONMODE}
     * 
     * @param batchActionMode
     * 
     */
    @JsonProperty(FIELD_BATCHACTIONMODE)
    public void setBatchActionMode(Integer batchActionMode){
        this.set(FIELD_BATCHACTIONMODE, batchActionMode);
    }
    
    /**
     * 获取 批操作模式  
     * @return
     */
    @JsonIgnore
    public Integer getBatchActionMode(){
        Object objValue = this.get(FIELD_BATCHACTIONMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 批操作模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBatchActionModeDirty(){
        if(this.contains(FIELD_BATCHACTIONMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 批操作模式
     */
    @JsonIgnore
    public void resetBatchActionMode(){
        this.reset(FIELD_BATCHACTIONMODE);
    }

    /**
     * 设置 批操作模式，详细说明：{@link #FIELD_BATCHACTIONMODE}
     * <P>
     * 等同 {@link #setBatchActionMode}
     * @param batchActionMode
     */
    @JsonIgnore
    public PSDEActionDTO batchactionmode(Integer batchActionMode){
        this.setBatchActionMode(batchActionMode);
        return this;
    }

     /**
     * 设置 批操作模式，详细说明：{@link #FIELD_BATCHACTIONMODE}
     * <P>
     * 等同 {@link #setBatchActionMode}
     * @param batchActionMode
     */
    @JsonIgnore
    public PSDEActionDTO batchactionmode(net.ibizsys.model.PSModelEnums.DEActionBatchMode batchActionMode){
        if(batchActionMode == null){
            this.setBatchActionMode(null);
        }
        else{
            this.setBatchActionMode(batchActionMode.value);
        }
        return this;
    }

    /**
     * <B>BEFORECODE</B>&nbsp;前端执行之前代码
     */
    public final static String FIELD_BEFORECODE = "beforecode";

    /**
     * 设置 前端执行之前代码
     * 
     * @param beforeCode
     * 
     */
    @JsonProperty(FIELD_BEFORECODE)
    public void setBeforeCode(String beforeCode){
        this.set(FIELD_BEFORECODE, beforeCode);
    }
    
    /**
     * 获取 前端执行之前代码  
     * @return
     */
    @JsonIgnore
    public String getBeforeCode(){
        Object objValue = this.get(FIELD_BEFORECODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端执行之前代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBeforeCodeDirty(){
        if(this.contains(FIELD_BEFORECODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端执行之前代码
     */
    @JsonIgnore
    public void resetBeforeCode(){
        this.reset(FIELD_BEFORECODE);
    }

    /**
     * 设置 前端执行之前代码
     * <P>
     * 等同 {@link #setBeforeCode}
     * @param beforeCode
     */
    @JsonIgnore
    public PSDEActionDTO beforecode(String beforeCode){
        this.setBeforeCode(beforeCode);
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
    public PSDEActionDTO cachecat(String cacheCat){
        this.setCacheCat(cacheCat);
        return this;
    }

    /**
     * <B>CACHESCOPE</B>&nbsp;缓存范围
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DECacheScope} 
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
    public PSDEActionDTO cachescope(String cacheScope){
        this.setCacheScope(cacheScope);
        return this;
    }

     /**
     * 设置 缓存范围
     * <P>
     * 等同 {@link #setCacheScope}
     * @param cacheScope
     */
    @JsonIgnore
    public PSDEActionDTO cachescope(net.ibizsys.model.PSModelEnums.DECacheScope cacheScope){
        if(cacheScope == null){
            this.setCacheScope(null);
        }
        else{
            this.setCacheScope(cacheScope.value);
        }
        return this;
    }

    /**
     * <B>CACHETAG</B>&nbsp;缓存标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CACHETAG = "cachetag";

    /**
     * 设置 缓存标记
     * 
     * @param cacheTag
     * 
     */
    @JsonProperty(FIELD_CACHETAG)
    public void setCacheTag(String cacheTag){
        this.set(FIELD_CACHETAG, cacheTag);
    }
    
    /**
     * 获取 缓存标记  
     * @return
     */
    @JsonIgnore
    public String getCacheTag(){
        Object objValue = this.get(FIELD_CACHETAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 缓存标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCacheTagDirty(){
        if(this.contains(FIELD_CACHETAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 缓存标记
     */
    @JsonIgnore
    public void resetCacheTag(){
        this.reset(FIELD_CACHETAG);
    }

    /**
     * 设置 缓存标记
     * <P>
     * 等同 {@link #setCacheTag}
     * @param cacheTag
     */
    @JsonIgnore
    public PSDEActionDTO cachetag(String cacheTag){
        this.setCacheTag(cacheTag);
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
    public PSDEActionDTO cachetimeout(Integer cacheTimeout){
        this.setCacheTimeout(cacheTimeout);
        return this;
    }

    /**
     * <B>CALLEROBJ</B>&nbsp;调用对象
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_CALLEROBJ = "callerobj";

    /**
     * 设置 调用对象
     * 
     * @param callerObj
     * 
     */
    @JsonProperty(FIELD_CALLEROBJ)
    public void setCallerObj(String callerObj){
        this.set(FIELD_CALLEROBJ, callerObj);
    }
    
    /**
     * 获取 调用对象  
     * @return
     */
    @JsonIgnore
    public String getCallerObj(){
        Object objValue = this.get(FIELD_CALLEROBJ);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 调用对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCallerObjDirty(){
        if(this.contains(FIELD_CALLEROBJ)){
            return true;
        }
        return false;
    }

    /**
     * 重置 调用对象
     */
    @JsonIgnore
    public void resetCallerObj(){
        this.reset(FIELD_CALLEROBJ);
    }

    /**
     * 设置 调用对象
     * <P>
     * 等同 {@link #setCallerObj}
     * @param callerObj
     */
    @JsonIgnore
    public PSDEActionDTO callerobj(String callerObj){
        this.setCallerObj(callerObj);
        return this;
    }

    /**
     * <B>CALLTIMEOUT</B>&nbsp;调用超时，指定行为调用的超时时长，单位为【毫秒】。未定义时为【-1】
     */
    public final static String FIELD_CALLTIMEOUT = "calltimeout";

    /**
     * 设置 调用超时，详细说明：{@link #FIELD_CALLTIMEOUT}
     * 
     * @param callTimeout
     * 
     */
    @JsonProperty(FIELD_CALLTIMEOUT)
    public void setCallTimeout(Integer callTimeout){
        this.set(FIELD_CALLTIMEOUT, callTimeout);
    }
    
    /**
     * 获取 调用超时  
     * @return
     */
    @JsonIgnore
    public Integer getCallTimeout(){
        Object objValue = this.get(FIELD_CALLTIMEOUT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 调用超时 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCallTimeoutDirty(){
        if(this.contains(FIELD_CALLTIMEOUT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 调用超时
     */
    @JsonIgnore
    public void resetCallTimeout(){
        this.reset(FIELD_CALLTIMEOUT);
    }

    /**
     * 设置 调用超时，详细说明：{@link #FIELD_CALLTIMEOUT}
     * <P>
     * 等同 {@link #setCallTimeout}
     * @param callTimeout
     */
    @JsonIgnore
    public PSDEActionDTO calltimeout(Integer callTimeout){
        this.setCallTimeout(callTimeout);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定实体行为的代码标识，需要在所在的实体中具有唯一性
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
    public PSDEActionDTO codename(String codeName){
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
    public PSDEActionDTO createdate(Timestamp createDate){
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
    public PSDEActionDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CUSTOMCODE</B>&nbsp;脚本代码
     */
    public final static String FIELD_CUSTOMCODE = "customcode";

    /**
     * 设置 脚本代码
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
     * 设置 脚本代码
     * <P>
     * 等同 {@link #setCustomCode}
     * @param customCode
     */
    @JsonIgnore
    public PSDEActionDTO customcode(String customCode){
        this.setCustomCode(customCode);
        return this;
    }

    /**
     * <B>CUSTOMMODE</B>&nbsp;自定义模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_CUSTOMMODE = "custommode";

    /**
     * 设置 自定义模式
     * 
     * @param customMode
     * 
     */
    @JsonProperty(FIELD_CUSTOMMODE)
    public void setCustomMode(Integer customMode){
        this.set(FIELD_CUSTOMMODE, customMode);
    }
    
    /**
     * 获取 自定义模式  
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
     * 判断 自定义模式 是否指定值，包括空值
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
     * 重置 自定义模式
     */
    @JsonIgnore
    public void resetCustomMode(){
        this.reset(FIELD_CUSTOMMODE);
    }

    /**
     * 设置 自定义模式
     * <P>
     * 等同 {@link #setCustomMode}
     * @param customMode
     */
    @JsonIgnore
    public PSDEActionDTO custommode(Integer customMode){
        this.setCustomMode(customMode);
        return this;
    }

     /**
     * 设置 自定义模式
     * <P>
     * 等同 {@link #setCustomMode}
     * @param customMode
     */
    @JsonIgnore
    public PSDEActionDTO custommode(Boolean customMode){
        if(customMode == null){
            this.setCustomMode(null);
        }
        else{
            this.setCustomMode(customMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEAUDIT</B>&nbsp;启用访问审计
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEAUDIT = "enableaudit";

    /**
     * 设置 启用访问审计
     * 
     * @param enableAudit
     * 
     */
    @JsonProperty(FIELD_ENABLEAUDIT)
    public void setEnableAudit(Integer enableAudit){
        this.set(FIELD_ENABLEAUDIT, enableAudit);
    }
    
    /**
     * 获取 启用访问审计  
     * @return
     */
    @JsonIgnore
    public Integer getEnableAudit(){
        Object objValue = this.get(FIELD_ENABLEAUDIT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用访问审计 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableAuditDirty(){
        if(this.contains(FIELD_ENABLEAUDIT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用访问审计
     */
    @JsonIgnore
    public void resetEnableAudit(){
        this.reset(FIELD_ENABLEAUDIT);
    }

    /**
     * 设置 启用访问审计
     * <P>
     * 等同 {@link #setEnableAudit}
     * @param enableAudit
     */
    @JsonIgnore
    public PSDEActionDTO enableaudit(Integer enableAudit){
        this.setEnableAudit(enableAudit);
        return this;
    }

     /**
     * 设置 启用访问审计
     * <P>
     * 等同 {@link #setEnableAudit}
     * @param enableAudit
     */
    @JsonIgnore
    public PSDEActionDTO enableaudit(Boolean enableAudit){
        if(enableAudit == null){
            this.setEnableAudit(null);
        }
        else{
            this.setEnableAudit(enableAudit?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLECACHE</B>&nbsp;缓存模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLECACHE = "enablecache";

    /**
     * 设置 缓存模式
     * 
     * @param enableCache
     * 
     */
    @JsonProperty(FIELD_ENABLECACHE)
    public void setEnableCache(Integer enableCache){
        this.set(FIELD_ENABLECACHE, enableCache);
    }
    
    /**
     * 获取 缓存模式  
     * @return
     */
    @JsonIgnore
    public Integer getEnableCache(){
        Object objValue = this.get(FIELD_ENABLECACHE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 缓存模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableCacheDirty(){
        if(this.contains(FIELD_ENABLECACHE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 缓存模式
     */
    @JsonIgnore
    public void resetEnableCache(){
        this.reset(FIELD_ENABLECACHE);
    }

    /**
     * 设置 缓存模式
     * <P>
     * 等同 {@link #setEnableCache}
     * @param enableCache
     */
    @JsonIgnore
    public PSDEActionDTO enablecache(Integer enableCache){
        this.setEnableCache(enableCache);
        return this;
    }

     /**
     * 设置 缓存模式
     * <P>
     * 等同 {@link #setEnableCache}
     * @param enableCache
     */
    @JsonIgnore
    public PSDEActionDTO enablecache(Boolean enableCache){
        if(enableCache == null){
            this.setEnableCache(null);
        }
        else{
            this.setEnableCache(enableCache?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>EXTENDMODE</B>&nbsp;扩展模式，指定实体行为的扩展模式，此配置针对子系统实体，标记是否要对原功能进行扩展。未定义时为【无扩展】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DEExtendMode} 
     */
    public final static String FIELD_EXTENDMODE = "extendmode";

    /**
     * 设置 扩展模式，详细说明：{@link #FIELD_EXTENDMODE}
     * 
     * @param extendMode
     * 
     */
    @JsonProperty(FIELD_EXTENDMODE)
    public void setExtendMode(Integer extendMode){
        this.set(FIELD_EXTENDMODE, extendMode);
    }
    
    /**
     * 获取 扩展模式  
     * @return
     */
    @JsonIgnore
    public Integer getExtendMode(){
        Object objValue = this.get(FIELD_EXTENDMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 扩展模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExtendModeDirty(){
        if(this.contains(FIELD_EXTENDMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 扩展模式
     */
    @JsonIgnore
    public void resetExtendMode(){
        this.reset(FIELD_EXTENDMODE);
    }

    /**
     * 设置 扩展模式，详细说明：{@link #FIELD_EXTENDMODE}
     * <P>
     * 等同 {@link #setExtendMode}
     * @param extendMode
     */
    @JsonIgnore
    public PSDEActionDTO extendmode(Integer extendMode){
        this.setExtendMode(extendMode);
        return this;
    }

     /**
     * 设置 扩展模式，详细说明：{@link #FIELD_EXTENDMODE}
     * <P>
     * 等同 {@link #setExtendMode}
     * @param extendMode
     */
    @JsonIgnore
    public PSDEActionDTO extendmode(net.ibizsys.model.PSModelEnums.DEExtendMode extendMode){
        if(extendMode == null){
            this.setExtendMode(null);
        }
        else{
            this.setExtendMode(extendMode.value);
        }
        return this;
    }

    /**
     * <B>FINISHFLAG</B>&nbsp;完成标记
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSTASKID}
     */
    public final static String FIELD_FINISHFLAG = "finishflag";

    /**
     * 设置 完成标记
     * 
     * @param finishFlag
     * 
     */
    @JsonProperty(FIELD_FINISHFLAG)
    public void setFinishFlag(Integer finishFlag){
        this.set(FIELD_FINISHFLAG, finishFlag);
    }
    
    /**
     * 获取 完成标记  
     * @return
     */
    @JsonIgnore
    public Integer getFinishFlag(){
        Object objValue = this.get(FIELD_FINISHFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 完成标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFinishFlagDirty(){
        if(this.contains(FIELD_FINISHFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 完成标记
     */
    @JsonIgnore
    public void resetFinishFlag(){
        this.reset(FIELD_FINISHFLAG);
    }

    /**
     * 设置 完成标记
     * <P>
     * 等同 {@link #setFinishFlag}
     * @param finishFlag
     */
    @JsonIgnore
    public PSDEActionDTO finishflag(Integer finishFlag){
        this.setFinishFlag(finishFlag);
        return this;
    }

    /**
     * <B>INPSDEFGROUPID</B>&nbsp;输入属性集
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFGroupDTO} 
     */
    public final static String FIELD_INPSDEFGROUPID = "inpsdefgroupid";

    /**
     * 设置 输入属性集
     * 
     * @param inPSDEFGroupId
     * 
     */
    @JsonProperty(FIELD_INPSDEFGROUPID)
    public void setInPSDEFGroupId(String inPSDEFGroupId){
        this.set(FIELD_INPSDEFGROUPID, inPSDEFGroupId);
    }
    
    /**
     * 获取 输入属性集  
     * @return
     */
    @JsonIgnore
    public String getInPSDEFGroupId(){
        Object objValue = this.get(FIELD_INPSDEFGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输入属性集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isInPSDEFGroupIdDirty(){
        if(this.contains(FIELD_INPSDEFGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输入属性集
     */
    @JsonIgnore
    public void resetInPSDEFGroupId(){
        this.reset(FIELD_INPSDEFGROUPID);
    }

    /**
     * 设置 输入属性集
     * <P>
     * 等同 {@link #setInPSDEFGroupId}
     * @param inPSDEFGroupId
     */
    @JsonIgnore
    public PSDEActionDTO inpsdefgroupid(String inPSDEFGroupId){
        this.setInPSDEFGroupId(inPSDEFGroupId);
        return this;
    }

    /**
     * 设置 输入属性集，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setInPSDEFGroupId}
     * @param pSDEFGroup 引用对象
     */
    @JsonIgnore
    public PSDEActionDTO inpsdefgroupid(PSDEFGroupDTO pSDEFGroup){
        if(pSDEFGroup == null){
            this.setInPSDEFGroupId(null);
            this.setInPSDEFGroupName(null);
        }
        else{
            this.setInPSDEFGroupId(pSDEFGroup.getPSDEFGroupId());
            this.setInPSDEFGroupName(pSDEFGroup.getPSDEFGroupName());
        }
        return this;
    }

    /**
     * <B>INPSDEFGROUPNAME</B>&nbsp;输入属性集
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_INPSDEFGROUPID}
     */
    public final static String FIELD_INPSDEFGROUPNAME = "inpsdefgroupname";

    /**
     * 设置 输入属性集
     * 
     * @param inPSDEFGroupName
     * 
     */
    @JsonProperty(FIELD_INPSDEFGROUPNAME)
    public void setInPSDEFGroupName(String inPSDEFGroupName){
        this.set(FIELD_INPSDEFGROUPNAME, inPSDEFGroupName);
    }
    
    /**
     * 获取 输入属性集  
     * @return
     */
    @JsonIgnore
    public String getInPSDEFGroupName(){
        Object objValue = this.get(FIELD_INPSDEFGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输入属性集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isInPSDEFGroupNameDirty(){
        if(this.contains(FIELD_INPSDEFGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输入属性集
     */
    @JsonIgnore
    public void resetInPSDEFGroupName(){
        this.reset(FIELD_INPSDEFGROUPNAME);
    }

    /**
     * 设置 输入属性集
     * <P>
     * 等同 {@link #setInPSDEFGroupName}
     * @param inPSDEFGroupName
     */
    @JsonIgnore
    public PSDEActionDTO inpsdefgroupname(String inPSDEFGroupName){
        this.setInPSDEFGroupName(inPSDEFGroupName);
        return this;
    }

    /**
     * <B>INPSDESAMPLEDATAID</B>&nbsp;输入示例数据
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDESampleDataDTO} 
     */
    public final static String FIELD_INPSDESAMPLEDATAID = "inpsdesampledataid";

    /**
     * 设置 输入示例数据
     * 
     * @param inPSDESampleDataId
     * 
     */
    @JsonProperty(FIELD_INPSDESAMPLEDATAID)
    public void setInPSDESampleDataId(String inPSDESampleDataId){
        this.set(FIELD_INPSDESAMPLEDATAID, inPSDESampleDataId);
    }
    
    /**
     * 获取 输入示例数据  
     * @return
     */
    @JsonIgnore
    public String getInPSDESampleDataId(){
        Object objValue = this.get(FIELD_INPSDESAMPLEDATAID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输入示例数据 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isInPSDESampleDataIdDirty(){
        if(this.contains(FIELD_INPSDESAMPLEDATAID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输入示例数据
     */
    @JsonIgnore
    public void resetInPSDESampleDataId(){
        this.reset(FIELD_INPSDESAMPLEDATAID);
    }

    /**
     * 设置 输入示例数据
     * <P>
     * 等同 {@link #setInPSDESampleDataId}
     * @param inPSDESampleDataId
     */
    @JsonIgnore
    public PSDEActionDTO inpsdesampledataid(String inPSDESampleDataId){
        this.setInPSDESampleDataId(inPSDESampleDataId);
        return this;
    }

    /**
     * 设置 输入示例数据，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setInPSDESampleDataId}
     * @param pSDESampleData 引用对象
     */
    @JsonIgnore
    public PSDEActionDTO inpsdesampledataid(PSDESampleDataDTO pSDESampleData){
        if(pSDESampleData == null){
            this.setInPSDESampleDataId(null);
            this.setInPSDESampleDataName(null);
        }
        else{
            this.setInPSDESampleDataId(pSDESampleData.getPSDESampleDataId());
            this.setInPSDESampleDataName(pSDESampleData.getPSDESampleDataName());
        }
        return this;
    }

    /**
     * <B>INPSDESAMPLEDATANAME</B>&nbsp;输入示例数据
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_INPSDESAMPLEDATAID}
     */
    public final static String FIELD_INPSDESAMPLEDATANAME = "inpsdesampledataname";

    /**
     * 设置 输入示例数据
     * 
     * @param inPSDESampleDataName
     * 
     */
    @JsonProperty(FIELD_INPSDESAMPLEDATANAME)
    public void setInPSDESampleDataName(String inPSDESampleDataName){
        this.set(FIELD_INPSDESAMPLEDATANAME, inPSDESampleDataName);
    }
    
    /**
     * 获取 输入示例数据  
     * @return
     */
    @JsonIgnore
    public String getInPSDESampleDataName(){
        Object objValue = this.get(FIELD_INPSDESAMPLEDATANAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输入示例数据 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isInPSDESampleDataNameDirty(){
        if(this.contains(FIELD_INPSDESAMPLEDATANAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输入示例数据
     */
    @JsonIgnore
    public void resetInPSDESampleDataName(){
        this.reset(FIELD_INPSDESAMPLEDATANAME);
    }

    /**
     * 设置 输入示例数据
     * <P>
     * 等同 {@link #setInPSDESampleDataName}
     * @param inPSDESampleDataName
     */
    @JsonIgnore
    public PSDEActionDTO inpsdesampledataname(String inPSDESampleDataName){
        this.setInPSDESampleDataName(inPSDESampleDataName);
        return this;
    }

    /**
     * <B>INPSSYSDYNAMODELID</B>&nbsp;输入对象模型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysDynaModelDTO} 
     */
    public final static String FIELD_INPSSYSDYNAMODELID = "inpssysdynamodelid";

    /**
     * 设置 输入对象模型
     * 
     * @param inPSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_INPSSYSDYNAMODELID)
    public void setInPSSysDynaModelId(String inPSSysDynaModelId){
        this.set(FIELD_INPSSYSDYNAMODELID, inPSSysDynaModelId);
    }
    
    /**
     * 获取 输入对象模型  
     * @return
     */
    @JsonIgnore
    public String getInPSSysDynaModelId(){
        Object objValue = this.get(FIELD_INPSSYSDYNAMODELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输入对象模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isInPSSysDynaModelIdDirty(){
        if(this.contains(FIELD_INPSSYSDYNAMODELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输入对象模型
     */
    @JsonIgnore
    public void resetInPSSysDynaModelId(){
        this.reset(FIELD_INPSSYSDYNAMODELID);
    }

    /**
     * 设置 输入对象模型
     * <P>
     * 等同 {@link #setInPSSysDynaModelId}
     * @param inPSSysDynaModelId
     */
    @JsonIgnore
    public PSDEActionDTO inpssysdynamodelid(String inPSSysDynaModelId){
        this.setInPSSysDynaModelId(inPSSysDynaModelId);
        return this;
    }

    /**
     * 设置 输入对象模型，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setInPSSysDynaModelId}
     * @param pSSysDynaModel 引用对象
     */
    @JsonIgnore
    public PSDEActionDTO inpssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel){
        if(pSSysDynaModel == null){
            this.setInPSSysDynaModelId(null);
            this.setInPSSysDynaModelName(null);
        }
        else{
            this.setInPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setInPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    /**
     * <B>INPSSYSDYNAMODELNAME</B>&nbsp;输入对象模型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_INPSSYSDYNAMODELID}
     */
    public final static String FIELD_INPSSYSDYNAMODELNAME = "inpssysdynamodelname";

    /**
     * 设置 输入对象模型
     * 
     * @param inPSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_INPSSYSDYNAMODELNAME)
    public void setInPSSysDynaModelName(String inPSSysDynaModelName){
        this.set(FIELD_INPSSYSDYNAMODELNAME, inPSSysDynaModelName);
    }
    
    /**
     * 获取 输入对象模型  
     * @return
     */
    @JsonIgnore
    public String getInPSSysDynaModelName(){
        Object objValue = this.get(FIELD_INPSSYSDYNAMODELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输入对象模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isInPSSysDynaModelNameDirty(){
        if(this.contains(FIELD_INPSSYSDYNAMODELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输入对象模型
     */
    @JsonIgnore
    public void resetInPSSysDynaModelName(){
        this.reset(FIELD_INPSSYSDYNAMODELNAME);
    }

    /**
     * 设置 输入对象模型
     * <P>
     * 等同 {@link #setInPSSysDynaModelName}
     * @param inPSSysDynaModelName
     */
    @JsonIgnore
    public PSDEActionDTO inpssysdynamodelname(String inPSSysDynaModelName){
        this.setInPSSysDynaModelName(inPSSysDynaModelName);
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;中文名称
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_LOGICNAME = "logicname";

    /**
     * 设置 中文名称
     * 
     * @param logicName
     * 
     */
    @JsonProperty(FIELD_LOGICNAME)
    public void setLogicName(String logicName){
        this.set(FIELD_LOGICNAME, logicName);
    }
    
    /**
     * 获取 中文名称  
     * @return
     */
    @JsonIgnore
    public String getLogicName(){
        Object objValue = this.get(FIELD_LOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 中文名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLogicNameDirty(){
        if(this.contains(FIELD_LOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 中文名称
     */
    @JsonIgnore
    public void resetLogicName(){
        this.reset(FIELD_LOGICNAME);
    }

    /**
     * 设置 中文名称
     * <P>
     * 等同 {@link #setLogicName}
     * @param logicName
     */
    @JsonIgnore
    public PSDEActionDTO logicname(String logicName){
        this.setLogicName(logicName);
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
    public PSDEActionDTO memo(String memo){
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
    public PSDEActionDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>OUTPSDEFGROUPID</B>&nbsp;输出属性集
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFGroupDTO} 
     */
    public final static String FIELD_OUTPSDEFGROUPID = "outpsdefgroupid";

    /**
     * 设置 输出属性集
     * 
     * @param outPSDEFGroupId
     * 
     */
    @JsonProperty(FIELD_OUTPSDEFGROUPID)
    public void setOutPSDEFGroupId(String outPSDEFGroupId){
        this.set(FIELD_OUTPSDEFGROUPID, outPSDEFGroupId);
    }
    
    /**
     * 获取 输出属性集  
     * @return
     */
    @JsonIgnore
    public String getOutPSDEFGroupId(){
        Object objValue = this.get(FIELD_OUTPSDEFGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输出属性集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOutPSDEFGroupIdDirty(){
        if(this.contains(FIELD_OUTPSDEFGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输出属性集
     */
    @JsonIgnore
    public void resetOutPSDEFGroupId(){
        this.reset(FIELD_OUTPSDEFGROUPID);
    }

    /**
     * 设置 输出属性集
     * <P>
     * 等同 {@link #setOutPSDEFGroupId}
     * @param outPSDEFGroupId
     */
    @JsonIgnore
    public PSDEActionDTO outpsdefgroupid(String outPSDEFGroupId){
        this.setOutPSDEFGroupId(outPSDEFGroupId);
        return this;
    }

    /**
     * 设置 输出属性集，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setOutPSDEFGroupId}
     * @param pSDEFGroup 引用对象
     */
    @JsonIgnore
    public PSDEActionDTO outpsdefgroupid(PSDEFGroupDTO pSDEFGroup){
        if(pSDEFGroup == null){
            this.setOutPSDEFGroupId(null);
            this.setOutPSDEFGroupName(null);
        }
        else{
            this.setOutPSDEFGroupId(pSDEFGroup.getPSDEFGroupId());
            this.setOutPSDEFGroupName(pSDEFGroup.getPSDEFGroupName());
        }
        return this;
    }

    /**
     * <B>OUTPSDEFGROUPNAME</B>&nbsp;输出属性集
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_OUTPSDEFGROUPID}
     */
    public final static String FIELD_OUTPSDEFGROUPNAME = "outpsdefgroupname";

    /**
     * 设置 输出属性集
     * 
     * @param outPSDEFGroupName
     * 
     */
    @JsonProperty(FIELD_OUTPSDEFGROUPNAME)
    public void setOutPSDEFGroupName(String outPSDEFGroupName){
        this.set(FIELD_OUTPSDEFGROUPNAME, outPSDEFGroupName);
    }
    
    /**
     * 获取 输出属性集  
     * @return
     */
    @JsonIgnore
    public String getOutPSDEFGroupName(){
        Object objValue = this.get(FIELD_OUTPSDEFGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输出属性集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOutPSDEFGroupNameDirty(){
        if(this.contains(FIELD_OUTPSDEFGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输出属性集
     */
    @JsonIgnore
    public void resetOutPSDEFGroupName(){
        this.reset(FIELD_OUTPSDEFGROUPNAME);
    }

    /**
     * 设置 输出属性集
     * <P>
     * 等同 {@link #setOutPSDEFGroupName}
     * @param outPSDEFGroupName
     */
    @JsonIgnore
    public PSDEActionDTO outpsdefgroupname(String outPSDEFGroupName){
        this.setOutPSDEFGroupName(outPSDEFGroupName);
        return this;
    }

    /**
     * <B>OUTPSDESAMPLEDATAID</B>&nbsp;输出示例数据
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDESampleDataDTO} 
     */
    public final static String FIELD_OUTPSDESAMPLEDATAID = "outpsdesampledataid";

    /**
     * 设置 输出示例数据
     * 
     * @param outPSDESampleDataId
     * 
     */
    @JsonProperty(FIELD_OUTPSDESAMPLEDATAID)
    public void setOutPSDESampleDataId(String outPSDESampleDataId){
        this.set(FIELD_OUTPSDESAMPLEDATAID, outPSDESampleDataId);
    }
    
    /**
     * 获取 输出示例数据  
     * @return
     */
    @JsonIgnore
    public String getOutPSDESampleDataId(){
        Object objValue = this.get(FIELD_OUTPSDESAMPLEDATAID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输出示例数据 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOutPSDESampleDataIdDirty(){
        if(this.contains(FIELD_OUTPSDESAMPLEDATAID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输出示例数据
     */
    @JsonIgnore
    public void resetOutPSDESampleDataId(){
        this.reset(FIELD_OUTPSDESAMPLEDATAID);
    }

    /**
     * 设置 输出示例数据
     * <P>
     * 等同 {@link #setOutPSDESampleDataId}
     * @param outPSDESampleDataId
     */
    @JsonIgnore
    public PSDEActionDTO outpsdesampledataid(String outPSDESampleDataId){
        this.setOutPSDESampleDataId(outPSDESampleDataId);
        return this;
    }

    /**
     * 设置 输出示例数据，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setOutPSDESampleDataId}
     * @param pSDESampleData 引用对象
     */
    @JsonIgnore
    public PSDEActionDTO outpsdesampledataid(PSDESampleDataDTO pSDESampleData){
        if(pSDESampleData == null){
            this.setOutPSDESampleDataId(null);
            this.setOutPSDESampleDataName(null);
        }
        else{
            this.setOutPSDESampleDataId(pSDESampleData.getPSDESampleDataId());
            this.setOutPSDESampleDataName(pSDESampleData.getPSDESampleDataName());
        }
        return this;
    }

    /**
     * <B>OUTPSDESAMPLEDATANAME</B>&nbsp;输出示例数据
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_OUTPSDESAMPLEDATAID}
     */
    public final static String FIELD_OUTPSDESAMPLEDATANAME = "outpsdesampledataname";

    /**
     * 设置 输出示例数据
     * 
     * @param outPSDESampleDataName
     * 
     */
    @JsonProperty(FIELD_OUTPSDESAMPLEDATANAME)
    public void setOutPSDESampleDataName(String outPSDESampleDataName){
        this.set(FIELD_OUTPSDESAMPLEDATANAME, outPSDESampleDataName);
    }
    
    /**
     * 获取 输出示例数据  
     * @return
     */
    @JsonIgnore
    public String getOutPSDESampleDataName(){
        Object objValue = this.get(FIELD_OUTPSDESAMPLEDATANAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输出示例数据 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOutPSDESampleDataNameDirty(){
        if(this.contains(FIELD_OUTPSDESAMPLEDATANAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输出示例数据
     */
    @JsonIgnore
    public void resetOutPSDESampleDataName(){
        this.reset(FIELD_OUTPSDESAMPLEDATANAME);
    }

    /**
     * 设置 输出示例数据
     * <P>
     * 等同 {@link #setOutPSDESampleDataName}
     * @param outPSDESampleDataName
     */
    @JsonIgnore
    public PSDEActionDTO outpsdesampledataname(String outPSDESampleDataName){
        this.setOutPSDESampleDataName(outPSDESampleDataName);
        return this;
    }

    /**
     * <B>OUTPSSYSDYNAMODELID</B>&nbsp;输出对象模型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysDynaModelDTO} 
     */
    public final static String FIELD_OUTPSSYSDYNAMODELID = "outpssysdynamodelid";

    /**
     * 设置 输出对象模型
     * 
     * @param outPSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_OUTPSSYSDYNAMODELID)
    public void setOutPSSysDynaModelId(String outPSSysDynaModelId){
        this.set(FIELD_OUTPSSYSDYNAMODELID, outPSSysDynaModelId);
    }
    
    /**
     * 获取 输出对象模型  
     * @return
     */
    @JsonIgnore
    public String getOutPSSysDynaModelId(){
        Object objValue = this.get(FIELD_OUTPSSYSDYNAMODELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输出对象模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOutPSSysDynaModelIdDirty(){
        if(this.contains(FIELD_OUTPSSYSDYNAMODELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输出对象模型
     */
    @JsonIgnore
    public void resetOutPSSysDynaModelId(){
        this.reset(FIELD_OUTPSSYSDYNAMODELID);
    }

    /**
     * 设置 输出对象模型
     * <P>
     * 等同 {@link #setOutPSSysDynaModelId}
     * @param outPSSysDynaModelId
     */
    @JsonIgnore
    public PSDEActionDTO outpssysdynamodelid(String outPSSysDynaModelId){
        this.setOutPSSysDynaModelId(outPSSysDynaModelId);
        return this;
    }

    /**
     * 设置 输出对象模型，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setOutPSSysDynaModelId}
     * @param pSSysDynaModel 引用对象
     */
    @JsonIgnore
    public PSDEActionDTO outpssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel){
        if(pSSysDynaModel == null){
            this.setOutPSSysDynaModelId(null);
            this.setOutPSSysDynaModelName(null);
        }
        else{
            this.setOutPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setOutPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    /**
     * <B>OUTPSSYSDYNAMODELNAME</B>&nbsp;输出对象模型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_OUTPSSYSDYNAMODELID}
     */
    public final static String FIELD_OUTPSSYSDYNAMODELNAME = "outpssysdynamodelname";

    /**
     * 设置 输出对象模型
     * 
     * @param outPSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_OUTPSSYSDYNAMODELNAME)
    public void setOutPSSysDynaModelName(String outPSSysDynaModelName){
        this.set(FIELD_OUTPSSYSDYNAMODELNAME, outPSSysDynaModelName);
    }
    
    /**
     * 获取 输出对象模型  
     * @return
     */
    @JsonIgnore
    public String getOutPSSysDynaModelName(){
        Object objValue = this.get(FIELD_OUTPSSYSDYNAMODELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输出对象模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOutPSSysDynaModelNameDirty(){
        if(this.contains(FIELD_OUTPSSYSDYNAMODELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输出对象模型
     */
    @JsonIgnore
    public void resetOutPSSysDynaModelName(){
        this.reset(FIELD_OUTPSSYSDYNAMODELNAME);
    }

    /**
     * 设置 输出对象模型
     * <P>
     * 等同 {@link #setOutPSSysDynaModelName}
     * @param outPSSysDynaModelName
     */
    @JsonIgnore
    public PSDEActionDTO outpssysdynamodelname(String outPSSysDynaModelName){
        this.setOutPSSysDynaModelName(outPSSysDynaModelName);
        return this;
    }

    /**
     * <B>OUTREFPSDEFGROUPID</B>&nbsp;输出引用属性组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFGroupDTO} 
     */
    public final static String FIELD_OUTREFPSDEFGROUPID = "outrefpsdefgroupid";

    /**
     * 设置 输出引用属性组
     * 
     * @param outRefPSDEFGroupId
     * 
     */
    @JsonProperty(FIELD_OUTREFPSDEFGROUPID)
    public void setOutRefPSDEFGroupId(String outRefPSDEFGroupId){
        this.set(FIELD_OUTREFPSDEFGROUPID, outRefPSDEFGroupId);
    }
    
    /**
     * 获取 输出引用属性组  
     * @return
     */
    @JsonIgnore
    public String getOutRefPSDEFGroupId(){
        Object objValue = this.get(FIELD_OUTREFPSDEFGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输出引用属性组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOutRefPSDEFGroupIdDirty(){
        if(this.contains(FIELD_OUTREFPSDEFGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输出引用属性组
     */
    @JsonIgnore
    public void resetOutRefPSDEFGroupId(){
        this.reset(FIELD_OUTREFPSDEFGROUPID);
    }

    /**
     * 设置 输出引用属性组
     * <P>
     * 等同 {@link #setOutRefPSDEFGroupId}
     * @param outRefPSDEFGroupId
     */
    @JsonIgnore
    public PSDEActionDTO outrefpsdefgroupid(String outRefPSDEFGroupId){
        this.setOutRefPSDEFGroupId(outRefPSDEFGroupId);
        return this;
    }

    /**
     * 设置 输出引用属性组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setOutRefPSDEFGroupId}
     * @param pSDEFGroup 引用对象
     */
    @JsonIgnore
    public PSDEActionDTO outrefpsdefgroupid(PSDEFGroupDTO pSDEFGroup){
        if(pSDEFGroup == null){
            this.setOutRefPSDEFGroupId(null);
            this.setOutRefPSDEFGroupName(null);
        }
        else{
            this.setOutRefPSDEFGroupId(pSDEFGroup.getPSDEFGroupId());
            this.setOutRefPSDEFGroupName(pSDEFGroup.getPSDEFGroupName());
        }
        return this;
    }

    /**
     * <B>OUTREFPSDEFGROUPNAME</B>&nbsp;输出引用属性组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_OUTREFPSDEFGROUPID}
     */
    public final static String FIELD_OUTREFPSDEFGROUPNAME = "outrefpsdefgroupname";

    /**
     * 设置 输出引用属性组
     * 
     * @param outRefPSDEFGroupName
     * 
     */
    @JsonProperty(FIELD_OUTREFPSDEFGROUPNAME)
    public void setOutRefPSDEFGroupName(String outRefPSDEFGroupName){
        this.set(FIELD_OUTREFPSDEFGROUPNAME, outRefPSDEFGroupName);
    }
    
    /**
     * 获取 输出引用属性组  
     * @return
     */
    @JsonIgnore
    public String getOutRefPSDEFGroupName(){
        Object objValue = this.get(FIELD_OUTREFPSDEFGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输出引用属性组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOutRefPSDEFGroupNameDirty(){
        if(this.contains(FIELD_OUTREFPSDEFGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输出引用属性组
     */
    @JsonIgnore
    public void resetOutRefPSDEFGroupName(){
        this.reset(FIELD_OUTREFPSDEFGROUPNAME);
    }

    /**
     * 设置 输出引用属性组
     * <P>
     * 等同 {@link #setOutRefPSDEFGroupName}
     * @param outRefPSDEFGroupName
     */
    @JsonIgnore
    public PSDEActionDTO outrefpsdefgroupname(String outRefPSDEFGroupName){
        this.setOutRefPSDEFGroupName(outRefPSDEFGroupName);
        return this;
    }

    /**
     * <B>OUTREFPSDEID</B>&nbsp;输出引用实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDataEntityDTO} 
     */
    public final static String FIELD_OUTREFPSDEID = "outrefpsdeid";

    /**
     * 设置 输出引用实体
     * 
     * @param outRefPSDEId
     * 
     */
    @JsonProperty(FIELD_OUTREFPSDEID)
    public void setOutRefPSDEId(String outRefPSDEId){
        this.set(FIELD_OUTREFPSDEID, outRefPSDEId);
    }
    
    /**
     * 获取 输出引用实体  
     * @return
     */
    @JsonIgnore
    public String getOutRefPSDEId(){
        Object objValue = this.get(FIELD_OUTREFPSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输出引用实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOutRefPSDEIdDirty(){
        if(this.contains(FIELD_OUTREFPSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输出引用实体
     */
    @JsonIgnore
    public void resetOutRefPSDEId(){
        this.reset(FIELD_OUTREFPSDEID);
    }

    /**
     * 设置 输出引用实体
     * <P>
     * 等同 {@link #setOutRefPSDEId}
     * @param outRefPSDEId
     */
    @JsonIgnore
    public PSDEActionDTO outrefpsdeid(String outRefPSDEId){
        this.setOutRefPSDEId(outRefPSDEId);
        return this;
    }

    /**
     * 设置 输出引用实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setOutRefPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDEActionDTO outrefpsdeid(PSDataEntityDTO pSDataEntity){
        if(pSDataEntity == null){
            this.setOutRefPSDEId(null);
            this.setOutRefPSDEName(null);
        }
        else{
            this.setOutRefPSDEId(pSDataEntity.getPSDataEntityId());
            this.setOutRefPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>OUTREFPSDENAME</B>&nbsp;输出引用实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_OUTREFPSDEID}
     */
    public final static String FIELD_OUTREFPSDENAME = "outrefpsdename";

    /**
     * 设置 输出引用实体
     * 
     * @param outRefPSDEName
     * 
     */
    @JsonProperty(FIELD_OUTREFPSDENAME)
    public void setOutRefPSDEName(String outRefPSDEName){
        this.set(FIELD_OUTREFPSDENAME, outRefPSDEName);
    }
    
    /**
     * 获取 输出引用实体  
     * @return
     */
    @JsonIgnore
    public String getOutRefPSDEName(){
        Object objValue = this.get(FIELD_OUTREFPSDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输出引用实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOutRefPSDENameDirty(){
        if(this.contains(FIELD_OUTREFPSDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输出引用实体
     */
    @JsonIgnore
    public void resetOutRefPSDEName(){
        this.reset(FIELD_OUTREFPSDENAME);
    }

    /**
     * 设置 输出引用实体
     * <P>
     * 等同 {@link #setOutRefPSDEName}
     * @param outRefPSDEName
     */
    @JsonIgnore
    public PSDEActionDTO outrefpsdename(String outRefPSDEName){
        this.setOutRefPSDEName(outRefPSDEName);
        return this;
    }

    /**
     * <B>PARAMTYPE</B>&nbsp;参数模式，指定行为传入的参数模式，指定为【指定参数】时需额外定义参数清单。未定义时为【全部参数】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DEActionParamMode} 
     */
    public final static String FIELD_PARAMTYPE = "paramtype";

    /**
     * 设置 参数模式，详细说明：{@link #FIELD_PARAMTYPE}
     * 
     * @param paramType
     * 
     */
    @JsonProperty(FIELD_PARAMTYPE)
    public void setParamType(Integer paramType){
        this.set(FIELD_PARAMTYPE, paramType);
    }
    
    /**
     * 获取 参数模式  
     * @return
     */
    @JsonIgnore
    public Integer getParamType(){
        Object objValue = this.get(FIELD_PARAMTYPE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 参数模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamTypeDirty(){
        if(this.contains(FIELD_PARAMTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数模式
     */
    @JsonIgnore
    public void resetParamType(){
        this.reset(FIELD_PARAMTYPE);
    }

    /**
     * 设置 参数模式，详细说明：{@link #FIELD_PARAMTYPE}
     * <P>
     * 等同 {@link #setParamType}
     * @param paramType
     */
    @JsonIgnore
    public PSDEActionDTO paramtype(Integer paramType){
        this.setParamType(paramType);
        return this;
    }

     /**
     * 设置 参数模式，详细说明：{@link #FIELD_PARAMTYPE}
     * <P>
     * 等同 {@link #setParamType}
     * @param paramType
     */
    @JsonIgnore
    public PSDEActionDTO paramtype(net.ibizsys.model.PSModelEnums.DEActionParamMode paramType){
        if(paramType == null){
            this.setParamType(null);
        }
        else{
            this.setParamType(paramType.value);
        }
        return this;
    }

    /**
     * <B>POTIME</B>&nbsp;性能优化时间，指定行为性能优化检测时长（毫秒），超过此时长将需要进行日志等处理。未指定时为【-1】，使用默认检测时长
     */
    public final static String FIELD_POTIME = "potime";

    /**
     * 设置 性能优化时间，详细说明：{@link #FIELD_POTIME}
     * 
     * @param pOTime
     * 
     */
    @JsonProperty(FIELD_POTIME)
    public void setPOTime(Integer pOTime){
        this.set(FIELD_POTIME, pOTime);
    }
    
    /**
     * 获取 性能优化时间  
     * @return
     */
    @JsonIgnore
    public Integer getPOTime(){
        Object objValue = this.get(FIELD_POTIME);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 性能优化时间 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPOTimeDirty(){
        if(this.contains(FIELD_POTIME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 性能优化时间
     */
    @JsonIgnore
    public void resetPOTime(){
        this.reset(FIELD_POTIME);
    }

    /**
     * 设置 性能优化时间，详细说明：{@link #FIELD_POTIME}
     * <P>
     * 等同 {@link #setPOTime}
     * @param pOTime
     */
    @JsonIgnore
    public PSDEActionDTO potime(Integer pOTime){
        this.setPOTime(pOTime);
        return this;
    }

    /**
     * <B>PREDEFINEDTYPE</B>&nbsp;预定义类型
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_PREDEFINEDTYPE = "predefinedtype";

    /**
     * 设置 预定义类型
     * 
     * @param predefinedType
     * 
     */
    @JsonProperty(FIELD_PREDEFINEDTYPE)
    public void setPredefinedType(String predefinedType){
        this.set(FIELD_PREDEFINEDTYPE, predefinedType);
    }
    
    /**
     * 获取 预定义类型  
     * @return
     */
    @JsonIgnore
    public String getPredefinedType(){
        Object objValue = this.get(FIELD_PREDEFINEDTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预定义类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPredefinedTypeDirty(){
        if(this.contains(FIELD_PREDEFINEDTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预定义类型
     */
    @JsonIgnore
    public void resetPredefinedType(){
        this.reset(FIELD_PREDEFINEDTYPE);
    }

    /**
     * 设置 预定义类型
     * <P>
     * 等同 {@link #setPredefinedType}
     * @param predefinedType
     */
    @JsonIgnore
    public PSDEActionDTO predefinedtype(String predefinedType){
        this.setPredefinedType(predefinedType);
        return this;
    }

    /**
     * <B>PREDEFINEDTYPETEXT</B>&nbsp;预定义类型
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_PREDEFINEDTYPETEXT = "predefinedtypetext";

    /**
     * 设置 预定义类型
     * 
     * @param predefinedTypeText
     * 
     */
    @JsonProperty(FIELD_PREDEFINEDTYPETEXT)
    public void setPredefinedTypeText(String predefinedTypeText){
        this.set(FIELD_PREDEFINEDTYPETEXT, predefinedTypeText);
    }
    
    /**
     * 获取 预定义类型  
     * @return
     */
    @JsonIgnore
    public String getPredefinedTypeText(){
        Object objValue = this.get(FIELD_PREDEFINEDTYPETEXT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预定义类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPredefinedTypeTextDirty(){
        if(this.contains(FIELD_PREDEFINEDTYPETEXT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预定义类型
     */
    @JsonIgnore
    public void resetPredefinedTypeText(){
        this.reset(FIELD_PREDEFINEDTYPETEXT);
    }

    /**
     * 设置 预定义类型
     * <P>
     * 等同 {@link #setPredefinedTypeText}
     * @param predefinedTypeText
     */
    @JsonIgnore
    public PSDEActionDTO predefinedtypetext(String predefinedTypeText){
        this.setPredefinedTypeText(predefinedTypeText);
        return this;
    }

    /**
     * <B>PREPARELAST</B>&nbsp;准备最后数据
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_PREPARELAST = "preparelast";

    /**
     * 设置 准备最后数据
     * 
     * @param prepareLast
     * 
     */
    @JsonProperty(FIELD_PREPARELAST)
    public void setPrepareLast(Integer prepareLast){
        this.set(FIELD_PREPARELAST, prepareLast);
    }
    
    /**
     * 获取 准备最后数据  
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
     * 判断 准备最后数据 是否指定值，包括空值
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
     * 重置 准备最后数据
     */
    @JsonIgnore
    public void resetPrepareLast(){
        this.reset(FIELD_PREPARELAST);
    }

    /**
     * 设置 准备最后数据
     * <P>
     * 等同 {@link #setPrepareLast}
     * @param prepareLast
     */
    @JsonIgnore
    public PSDEActionDTO preparelast(Integer prepareLast){
        this.setPrepareLast(prepareLast);
        return this;
    }

     /**
     * 设置 准备最后数据
     * <P>
     * 等同 {@link #setPrepareLast}
     * @param prepareLast
     */
    @JsonIgnore
    public PSDEActionDTO preparelast(Boolean prepareLast){
        if(prepareLast == null){
            this.setPrepareLast(null);
        }
        else{
            this.setPrepareLast(prepareLast?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>PSDEACTIONID</B>&nbsp;实体行为标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEACTIONID = "psdeactionid";

    /**
     * 设置 实体行为标识
     * 
     * @param pSDEActionId
     * 
     */
    @JsonProperty(FIELD_PSDEACTIONID)
    public void setPSDEActionId(String pSDEActionId){
        this.set(FIELD_PSDEACTIONID, pSDEActionId);
    }
    
    /**
     * 获取 实体行为标识  
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
     * 判断 实体行为标识 是否指定值，包括空值
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
     * 重置 实体行为标识
     */
    @JsonIgnore
    public void resetPSDEActionId(){
        this.reset(FIELD_PSDEACTIONID);
    }

    /**
     * 设置 实体行为标识
     * <P>
     * 等同 {@link #setPSDEActionId}
     * @param pSDEActionId
     */
    @JsonIgnore
    public PSDEActionDTO psdeactionid(String pSDEActionId){
        this.setPSDEActionId(pSDEActionId);
        return this;
    }

    /**
     * <B>PSDEACTIONNAME</B>&nbsp;实体行为标识，指定实体行为的标识，需要在所在的实体中具有唯一性
     * <P>
     * 字符串：最大长度 50，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSDEACTIONNAME = "psdeactionname";

    /**
     * 设置 实体行为标识，详细说明：{@link #FIELD_PSDEACTIONNAME}
     * 
     * @param pSDEActionName
     * 
     */
    @JsonProperty(FIELD_PSDEACTIONNAME)
    public void setPSDEActionName(String pSDEActionName){
        this.set(FIELD_PSDEACTIONNAME, pSDEActionName);
    }
    
    /**
     * 获取 实体行为标识  
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
     * 判断 实体行为标识 是否指定值，包括空值
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
     * 重置 实体行为标识
     */
    @JsonIgnore
    public void resetPSDEActionName(){
        this.reset(FIELD_PSDEACTIONNAME);
    }

    /**
     * 设置 实体行为标识，详细说明：{@link #FIELD_PSDEACTIONNAME}
     * <P>
     * 等同 {@link #setPSDEActionName}
     * @param pSDEActionName
     */
    @JsonIgnore
    public PSDEActionDTO psdeactionname(String pSDEActionName){
        this.setPSDEActionName(pSDEActionName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEActionName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEActionName(strName);
    }

    @JsonIgnore
    public PSDEActionDTO name(String strName){
        this.setPSDEActionName(strName);
        return this;
    }

    /**
     * <B>PSDEACTIONTEMPLID</B>&nbsp;实体行为模板
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEActionTemplDTO} 
     */
    public final static String FIELD_PSDEACTIONTEMPLID = "psdeactiontemplid";

    /**
     * 设置 实体行为模板
     * 
     * @param pSDEActionTemplId
     * 
     */
    @JsonProperty(FIELD_PSDEACTIONTEMPLID)
    public void setPSDEActionTemplId(String pSDEActionTemplId){
        this.set(FIELD_PSDEACTIONTEMPLID, pSDEActionTemplId);
    }
    
    /**
     * 获取 实体行为模板  
     * @return
     */
    @JsonIgnore
    public String getPSDEActionTemplId(){
        Object objValue = this.get(FIELD_PSDEACTIONTEMPLID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体行为模板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEActionTemplIdDirty(){
        if(this.contains(FIELD_PSDEACTIONTEMPLID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体行为模板
     */
    @JsonIgnore
    public void resetPSDEActionTemplId(){
        this.reset(FIELD_PSDEACTIONTEMPLID);
    }

    /**
     * 设置 实体行为模板
     * <P>
     * 等同 {@link #setPSDEActionTemplId}
     * @param pSDEActionTemplId
     */
    @JsonIgnore
    public PSDEActionDTO psdeactiontemplid(String pSDEActionTemplId){
        this.setPSDEActionTemplId(pSDEActionTemplId);
        return this;
    }

    /**
     * 设置 实体行为模板，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEActionTemplId}
     * @param pSDEActionTempl 引用对象
     */
    @JsonIgnore
    public PSDEActionDTO psdeactiontemplid(PSDEActionTemplDTO pSDEActionTempl){
        if(pSDEActionTempl == null){
            this.setPSDEActionTemplId(null);
            this.setPSDEActionTemplName(null);
        }
        else{
            this.setPSDEActionTemplId(pSDEActionTempl.getPSDEActionTemplId());
            this.setPSDEActionTemplName(pSDEActionTempl.getPSDEActionTemplName());
        }
        return this;
    }

    /**
     * <B>PSDEACTIONTEMPLNAME</B>&nbsp;实体行为模板
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEACTIONTEMPLID}
     */
    public final static String FIELD_PSDEACTIONTEMPLNAME = "psdeactiontemplname";

    /**
     * 设置 实体行为模板
     * 
     * @param pSDEActionTemplName
     * 
     */
    @JsonProperty(FIELD_PSDEACTIONTEMPLNAME)
    public void setPSDEActionTemplName(String pSDEActionTemplName){
        this.set(FIELD_PSDEACTIONTEMPLNAME, pSDEActionTemplName);
    }
    
    /**
     * 获取 实体行为模板  
     * @return
     */
    @JsonIgnore
    public String getPSDEActionTemplName(){
        Object objValue = this.get(FIELD_PSDEACTIONTEMPLNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体行为模板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEActionTemplNameDirty(){
        if(this.contains(FIELD_PSDEACTIONTEMPLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体行为模板
     */
    @JsonIgnore
    public void resetPSDEActionTemplName(){
        this.reset(FIELD_PSDEACTIONTEMPLNAME);
    }

    /**
     * 设置 实体行为模板
     * <P>
     * 等同 {@link #setPSDEActionTemplName}
     * @param pSDEActionTemplName
     */
    @JsonIgnore
    public PSDEActionDTO psdeactiontemplname(String pSDEActionTemplName){
        this.setPSDEActionTemplName(pSDEActionTemplName);
        return this;
    }

    /**
     * <B>PSDEDATAQUERYID</B>&nbsp;数据查询
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEDataQueryDTO} 
     */
    public final static String FIELD_PSDEDATAQUERYID = "psdedataqueryid";

    /**
     * 设置 数据查询
     * 
     * @param pSDEDataQueryId
     * 
     */
    @JsonProperty(FIELD_PSDEDATAQUERYID)
    public void setPSDEDataQueryId(String pSDEDataQueryId){
        this.set(FIELD_PSDEDATAQUERYID, pSDEDataQueryId);
    }
    
    /**
     * 获取 数据查询  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataQueryId(){
        Object objValue = this.get(FIELD_PSDEDATAQUERYID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据查询 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataQueryIdDirty(){
        if(this.contains(FIELD_PSDEDATAQUERYID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据查询
     */
    @JsonIgnore
    public void resetPSDEDataQueryId(){
        this.reset(FIELD_PSDEDATAQUERYID);
    }

    /**
     * 设置 数据查询
     * <P>
     * 等同 {@link #setPSDEDataQueryId}
     * @param pSDEDataQueryId
     */
    @JsonIgnore
    public PSDEActionDTO psdedataqueryid(String pSDEDataQueryId){
        this.setPSDEDataQueryId(pSDEDataQueryId);
        return this;
    }

    /**
     * 设置 数据查询，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDataQueryId}
     * @param pSDEDataQuery 引用对象
     */
    @JsonIgnore
    public PSDEActionDTO psdedataqueryid(PSDEDataQueryDTO pSDEDataQuery){
        if(pSDEDataQuery == null){
            this.setPSDEDataQueryId(null);
            this.setPSDEDataQueryName(null);
        }
        else{
            this.setPSDEDataQueryId(pSDEDataQuery.getPSDEDataQueryId());
            this.setPSDEDataQueryName(pSDEDataQuery.getPSDEDataQueryName());
        }
        return this;
    }

    /**
     * <B>PSDEDATAQUERYNAME</B>&nbsp;数据查询
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDATAQUERYID}
     */
    public final static String FIELD_PSDEDATAQUERYNAME = "psdedataqueryname";

    /**
     * 设置 数据查询
     * 
     * @param pSDEDataQueryName
     * 
     */
    @JsonProperty(FIELD_PSDEDATAQUERYNAME)
    public void setPSDEDataQueryName(String pSDEDataQueryName){
        this.set(FIELD_PSDEDATAQUERYNAME, pSDEDataQueryName);
    }
    
    /**
     * 获取 数据查询  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataQueryName(){
        Object objValue = this.get(FIELD_PSDEDATAQUERYNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据查询 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataQueryNameDirty(){
        if(this.contains(FIELD_PSDEDATAQUERYNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据查询
     */
    @JsonIgnore
    public void resetPSDEDataQueryName(){
        this.reset(FIELD_PSDEDATAQUERYNAME);
    }

    /**
     * 设置 数据查询
     * <P>
     * 等同 {@link #setPSDEDataQueryName}
     * @param pSDEDataQueryName
     */
    @JsonIgnore
    public PSDEActionDTO psdedataqueryname(String pSDEDataQueryName){
        this.setPSDEDataQueryName(pSDEDataQueryName);
        return this;
    }

    /**
     * <B>PSDEDATASETID</B>&nbsp;数据集合
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO} 
     */
    public final static String FIELD_PSDEDATASETID = "psdedatasetid";

    /**
     * 设置 数据集合
     * 
     * @param pSDEDataSetId
     * 
     */
    @JsonProperty(FIELD_PSDEDATASETID)
    public void setPSDEDataSetId(String pSDEDataSetId){
        this.set(FIELD_PSDEDATASETID, pSDEDataSetId);
    }
    
    /**
     * 获取 数据集合  
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
     * 判断 数据集合 是否指定值，包括空值
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
     * 重置 数据集合
     */
    @JsonIgnore
    public void resetPSDEDataSetId(){
        this.reset(FIELD_PSDEDATASETID);
    }

    /**
     * 设置 数据集合
     * <P>
     * 等同 {@link #setPSDEDataSetId}
     * @param pSDEDataSetId
     */
    @JsonIgnore
    public PSDEActionDTO psdedatasetid(String pSDEDataSetId){
        this.setPSDEDataSetId(pSDEDataSetId);
        return this;
    }

    /**
     * 设置 数据集合，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDataSetId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSDEActionDTO psdedatasetid(PSDEDataSetDTO pSDEDataSet){
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
     * <B>PSDEDATASETNAME</B>&nbsp;数据集合
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDATASETID}
     */
    public final static String FIELD_PSDEDATASETNAME = "psdedatasetname";

    /**
     * 设置 数据集合
     * 
     * @param pSDEDataSetName
     * 
     */
    @JsonProperty(FIELD_PSDEDATASETNAME)
    public void setPSDEDataSetName(String pSDEDataSetName){
        this.set(FIELD_PSDEDATASETNAME, pSDEDataSetName);
    }
    
    /**
     * 获取 数据集合  
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
     * 判断 数据集合 是否指定值，包括空值
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
     * 重置 数据集合
     */
    @JsonIgnore
    public void resetPSDEDataSetName(){
        this.reset(FIELD_PSDEDATASETNAME);
    }

    /**
     * 设置 数据集合
     * <P>
     * 等同 {@link #setPSDEDataSetName}
     * @param pSDEDataSetName
     */
    @JsonIgnore
    public PSDEActionDTO psdedatasetname(String pSDEDataSetName){
        this.setPSDEDataSetName(pSDEDataSetName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDataEntityDTO} 
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
    public PSDEActionDTO psdeid(String pSDEId){
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
    public PSDEActionDTO psdeid(PSDataEntityDTO pSDataEntity){
        if(pSDataEntity == null){
            this.setPSDEId(null);
            this.setPSDEName(null);
            this.setPSSubSysSADEId(null);
        }
        else{
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
            this.setPSSubSysSADEId(pSDataEntity.getPSSubSysSADEId());
        }
        return this;
    }

    /**
     * <B>PSDELOGICID</B>&nbsp;实体处理逻辑，当行为类型为【处理逻辑】时指定当前实体的处理逻辑
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDELogicDTO} 
     */
    public final static String FIELD_PSDELOGICID = "psdelogicid";

    /**
     * 设置 实体处理逻辑，详细说明：{@link #FIELD_PSDELOGICID}
     * 
     * @param pSDELogicId
     * 
     */
    @JsonProperty(FIELD_PSDELOGICID)
    public void setPSDELogicId(String pSDELogicId){
        this.set(FIELD_PSDELOGICID, pSDELogicId);
    }
    
    /**
     * 获取 实体处理逻辑  
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
     * 判断 实体处理逻辑 是否指定值，包括空值
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
     * 重置 实体处理逻辑
     */
    @JsonIgnore
    public void resetPSDELogicId(){
        this.reset(FIELD_PSDELOGICID);
    }

    /**
     * 设置 实体处理逻辑，详细说明：{@link #FIELD_PSDELOGICID}
     * <P>
     * 等同 {@link #setPSDELogicId}
     * @param pSDELogicId
     */
    @JsonIgnore
    public PSDEActionDTO psdelogicid(String pSDELogicId){
        this.setPSDELogicId(pSDELogicId);
        return this;
    }

    /**
     * 设置 实体处理逻辑，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDELogicId}
     * @param pSDELogic 引用对象
     */
    @JsonIgnore
    public PSDEActionDTO psdelogicid(PSDELogicDTO pSDELogic){
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
     * <B>PSDELOGICNAME</B>&nbsp;实体处理逻辑，当行为类型为【处理逻辑】时指定当前实体的处理逻辑
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDELOGICID}
     */
    public final static String FIELD_PSDELOGICNAME = "psdelogicname";

    /**
     * 设置 实体处理逻辑，详细说明：{@link #FIELD_PSDELOGICNAME}
     * 
     * @param pSDELogicName
     * 
     */
    @JsonProperty(FIELD_PSDELOGICNAME)
    public void setPSDELogicName(String pSDELogicName){
        this.set(FIELD_PSDELOGICNAME, pSDELogicName);
    }
    
    /**
     * 获取 实体处理逻辑  
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
     * 判断 实体处理逻辑 是否指定值，包括空值
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
     * 重置 实体处理逻辑
     */
    @JsonIgnore
    public void resetPSDELogicName(){
        this.reset(FIELD_PSDELOGICNAME);
    }

    /**
     * 设置 实体处理逻辑，详细说明：{@link #FIELD_PSDELOGICNAME}
     * <P>
     * 等同 {@link #setPSDELogicName}
     * @param pSDELogicName
     */
    @JsonIgnore
    public PSDEActionDTO psdelogicname(String pSDELogicName){
        this.setPSDELogicName(pSDELogicName);
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
    public PSDEActionDTO psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSDEOPPRIVID</B>&nbsp;访问操作标识，指定调用该行为默认使用的实体操作标识，未指定时模型引擎会尝试计算
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEOPPrivDTO} 
     */
    public final static String FIELD_PSDEOPPRIVID = "psdeopprivid";

    /**
     * 设置 访问操作标识，详细说明：{@link #FIELD_PSDEOPPRIVID}
     * 
     * @param pSDEOPPrivId
     * 
     */
    @JsonProperty(FIELD_PSDEOPPRIVID)
    public void setPSDEOPPrivId(String pSDEOPPrivId){
        this.set(FIELD_PSDEOPPRIVID, pSDEOPPrivId);
    }
    
    /**
     * 获取 访问操作标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEOPPrivId(){
        Object objValue = this.get(FIELD_PSDEOPPRIVID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 访问操作标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEOPPrivIdDirty(){
        if(this.contains(FIELD_PSDEOPPRIVID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 访问操作标识
     */
    @JsonIgnore
    public void resetPSDEOPPrivId(){
        this.reset(FIELD_PSDEOPPRIVID);
    }

    /**
     * 设置 访问操作标识，详细说明：{@link #FIELD_PSDEOPPRIVID}
     * <P>
     * 等同 {@link #setPSDEOPPrivId}
     * @param pSDEOPPrivId
     */
    @JsonIgnore
    public PSDEActionDTO psdeopprivid(String pSDEOPPrivId){
        this.setPSDEOPPrivId(pSDEOPPrivId);
        return this;
    }

    /**
     * 设置 访问操作标识，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEOPPrivId}
     * @param pSDEOPPriv 引用对象
     */
    @JsonIgnore
    public PSDEActionDTO psdeopprivid(PSDEOPPrivDTO pSDEOPPriv){
        if(pSDEOPPriv == null){
            this.setPSDEOPPrivId(null);
            this.setPSDEOPPrivName(null);
        }
        else{
            this.setPSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setPSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    /**
     * <B>PSDEOPPRIVNAME</B>&nbsp;访问操作标识，指定调用该行为默认使用的实体操作标识，未指定时模型引擎会尝试计算
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEOPPRIVID}
     */
    public final static String FIELD_PSDEOPPRIVNAME = "psdeopprivname";

    /**
     * 设置 访问操作标识，详细说明：{@link #FIELD_PSDEOPPRIVNAME}
     * 
     * @param pSDEOPPrivName
     * 
     */
    @JsonProperty(FIELD_PSDEOPPRIVNAME)
    public void setPSDEOPPrivName(String pSDEOPPrivName){
        this.set(FIELD_PSDEOPPRIVNAME, pSDEOPPrivName);
    }
    
    /**
     * 获取 访问操作标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEOPPrivName(){
        Object objValue = this.get(FIELD_PSDEOPPRIVNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 访问操作标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEOPPrivNameDirty(){
        if(this.contains(FIELD_PSDEOPPRIVNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 访问操作标识
     */
    @JsonIgnore
    public void resetPSDEOPPrivName(){
        this.reset(FIELD_PSDEOPPRIVNAME);
    }

    /**
     * 设置 访问操作标识，详细说明：{@link #FIELD_PSDEOPPRIVNAME}
     * <P>
     * 等同 {@link #setPSDEOPPrivName}
     * @param pSDEOPPrivName
     */
    @JsonIgnore
    public PSDEActionDTO psdeopprivname(String pSDEOPPrivName){
        this.setPSDEOPPrivName(pSDEOPPrivName);
        return this;
    }

    /**
     * <B>PSDESYSPROCID</B>&nbsp;实体系统过程
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDESYSPROCID = "psdesysprocid";

    /**
     * 设置 实体系统过程
     * 
     * @param pSDESysProcId
     * 
     */
    @JsonProperty(FIELD_PSDESYSPROCID)
    public void setPSDESysProcId(String pSDESysProcId){
        this.set(FIELD_PSDESYSPROCID, pSDESysProcId);
    }
    
    /**
     * 获取 实体系统过程  
     * @return
     */
    @JsonIgnore
    public String getPSDESysProcId(){
        Object objValue = this.get(FIELD_PSDESYSPROCID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体系统过程 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDESysProcIdDirty(){
        if(this.contains(FIELD_PSDESYSPROCID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体系统过程
     */
    @JsonIgnore
    public void resetPSDESysProcId(){
        this.reset(FIELD_PSDESYSPROCID);
    }

    /**
     * 设置 实体系统过程
     * <P>
     * 等同 {@link #setPSDESysProcId}
     * @param pSDESysProcId
     */
    @JsonIgnore
    public PSDEActionDTO psdesysprocid(String pSDESysProcId){
        this.setPSDESysProcId(pSDESysProcId);
        return this;
    }

    /**
     * <B>PSDESYSPROCNAME</B>&nbsp;实体系统过程
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDESYSPROCID}
     */
    public final static String FIELD_PSDESYSPROCNAME = "psdesysprocname";

    /**
     * 设置 实体系统过程
     * 
     * @param pSDESysProcName
     * 
     */
    @JsonProperty(FIELD_PSDESYSPROCNAME)
    public void setPSDESysProcName(String pSDESysProcName){
        this.set(FIELD_PSDESYSPROCNAME, pSDESysProcName);
    }
    
    /**
     * 获取 实体系统过程  
     * @return
     */
    @JsonIgnore
    public String getPSDESysProcName(){
        Object objValue = this.get(FIELD_PSDESYSPROCNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体系统过程 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDESysProcNameDirty(){
        if(this.contains(FIELD_PSDESYSPROCNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体系统过程
     */
    @JsonIgnore
    public void resetPSDESysProcName(){
        this.reset(FIELD_PSDESYSPROCNAME);
    }

    /**
     * 设置 实体系统过程
     * <P>
     * 等同 {@link #setPSDESysProcName}
     * @param pSDESysProcName
     */
    @JsonIgnore
    public PSDEActionDTO psdesysprocname(String pSDESysProcName){
        this.setPSDESysProcName(pSDESysProcName);
        return this;
    }

    /**
     * <B>PSSUBSYSSADEID</B>&nbsp;PSSUBSYSSADEID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_PSSUBSYSSADEID = "pssubsyssadeid";

    /**
     * 设置 PSSUBSYSSADEID
     * 
     * @param pSSubSysSADEId
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSADEID)
    public void setPSSubSysSADEId(String pSSubSysSADEId){
        this.set(FIELD_PSSUBSYSSADEID, pSSubSysSADEId);
    }
    
    /**
     * 获取 PSSUBSYSSADEID  
     * @return
     */
    @JsonIgnore
    public String getPSSubSysSADEId(){
        Object objValue = this.get(FIELD_PSSUBSYSSADEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 PSSUBSYSSADEID 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubSysSADEIdDirty(){
        if(this.contains(FIELD_PSSUBSYSSADEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 PSSUBSYSSADEID
     */
    @JsonIgnore
    public void resetPSSubSysSADEId(){
        this.reset(FIELD_PSSUBSYSSADEID);
    }

    /**
     * 设置 PSSUBSYSSADEID
     * <P>
     * 等同 {@link #setPSSubSysSADEId}
     * @param pSSubSysSADEId
     */
    @JsonIgnore
    public PSDEActionDTO pssubsyssadeid(String pSSubSysSADEId){
        this.setPSSubSysSADEId(pSSubSysSADEId);
        return this;
    }

    /**
     * <B>PSSUBSYSSADETAILID</B>&nbsp;子系统接口成员，实体支持外部接口持久化时指定行为绑定的接口实体方法，未指定时引擎将通过代码名称尝试获取对应的接口实体方法
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSubSysSADetailDTO} 
     */
    public final static String FIELD_PSSUBSYSSADETAILID = "pssubsyssadetailid";

    /**
     * 设置 子系统接口成员，详细说明：{@link #FIELD_PSSUBSYSSADETAILID}
     * 
     * @param pSSubSysSADetailId
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSADETAILID)
    public void setPSSubSysSADetailId(String pSSubSysSADetailId){
        this.set(FIELD_PSSUBSYSSADETAILID, pSSubSysSADetailId);
    }
    
    /**
     * 获取 子系统接口成员  
     * @return
     */
    @JsonIgnore
    public String getPSSubSysSADetailId(){
        Object objValue = this.get(FIELD_PSSUBSYSSADETAILID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 子系统接口成员 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubSysSADetailIdDirty(){
        if(this.contains(FIELD_PSSUBSYSSADETAILID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 子系统接口成员
     */
    @JsonIgnore
    public void resetPSSubSysSADetailId(){
        this.reset(FIELD_PSSUBSYSSADETAILID);
    }

    /**
     * 设置 子系统接口成员，详细说明：{@link #FIELD_PSSUBSYSSADETAILID}
     * <P>
     * 等同 {@link #setPSSubSysSADetailId}
     * @param pSSubSysSADetailId
     */
    @JsonIgnore
    public PSDEActionDTO pssubsyssadetailid(String pSSubSysSADetailId){
        this.setPSSubSysSADetailId(pSSubSysSADetailId);
        return this;
    }

    /**
     * 设置 子系统接口成员，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSubSysSADetailId}
     * @param pSSubSysSADetail 引用对象
     */
    @JsonIgnore
    public PSDEActionDTO pssubsyssadetailid(PSSubSysSADetailDTO pSSubSysSADetail){
        if(pSSubSysSADetail == null){
            this.setPSSubSysSADetailId(null);
            this.setPSSubSysSADetailName(null);
        }
        else{
            this.setPSSubSysSADetailId(pSSubSysSADetail.getPSSubSysSADetailId());
            this.setPSSubSysSADetailName(pSSubSysSADetail.getPSSubSysSADetailName());
        }
        return this;
    }

    /**
     * <B>PSSUBSYSSADETAILNAME</B>&nbsp;外部接口实体方法，实体支持外部接口持久化时指定行为绑定的接口实体方法，未指定时引擎将通过代码名称尝试获取对应的接口实体方法
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSUBSYSSADETAILID}
     */
    public final static String FIELD_PSSUBSYSSADETAILNAME = "pssubsyssadetailname";

    /**
     * 设置 外部接口实体方法，详细说明：{@link #FIELD_PSSUBSYSSADETAILNAME}
     * 
     * @param pSSubSysSADetailName
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSADETAILNAME)
    public void setPSSubSysSADetailName(String pSSubSysSADetailName){
        this.set(FIELD_PSSUBSYSSADETAILNAME, pSSubSysSADetailName);
    }
    
    /**
     * 获取 外部接口实体方法  
     * @return
     */
    @JsonIgnore
    public String getPSSubSysSADetailName(){
        Object objValue = this.get(FIELD_PSSUBSYSSADETAILNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 外部接口实体方法 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubSysSADetailNameDirty(){
        if(this.contains(FIELD_PSSUBSYSSADETAILNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 外部接口实体方法
     */
    @JsonIgnore
    public void resetPSSubSysSADetailName(){
        this.reset(FIELD_PSSUBSYSSADETAILNAME);
    }

    /**
     * 设置 外部接口实体方法，详细说明：{@link #FIELD_PSSUBSYSSADETAILNAME}
     * <P>
     * 等同 {@link #setPSSubSysSADetailName}
     * @param pSSubSysSADetailName
     */
    @JsonIgnore
    public PSDEActionDTO pssubsyssadetailname(String pSSubSysSADetailName){
        this.setPSSubSysSADetailName(pSSubSysSADetailName);
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELID</B>&nbsp;动态系统模型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysDynaModelDTO} 
     */
    public final static String FIELD_PSSYSDYNAMODELID = "pssysdynamodelid";

    /**
     * 设置 动态系统模型
     * 
     * @param pSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELID)
    public void setPSSysDynaModelId(String pSSysDynaModelId){
        this.set(FIELD_PSSYSDYNAMODELID, pSSysDynaModelId);
    }
    
    /**
     * 获取 动态系统模型  
     * @return
     */
    @JsonIgnore
    public String getPSSysDynaModelId(){
        Object objValue = this.get(FIELD_PSSYSDYNAMODELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 动态系统模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDynaModelIdDirty(){
        if(this.contains(FIELD_PSSYSDYNAMODELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 动态系统模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelId(){
        this.reset(FIELD_PSSYSDYNAMODELID);
    }

    /**
     * 设置 动态系统模型
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModelId
     */
    @JsonIgnore
    public PSDEActionDTO pssysdynamodelid(String pSSysDynaModelId){
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    /**
     * 设置 动态系统模型，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModel 引用对象
     */
    @JsonIgnore
    public PSDEActionDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel){
        if(pSSysDynaModel == null){
            this.setPSSysDynaModelId(null);
            this.setPSSysDynaModelName(null);
        }
        else{
            this.setPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELNAME</B>&nbsp;动态系统模型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDYNAMODELID}
     */
    public final static String FIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";

    /**
     * 设置 动态系统模型
     * 
     * @param pSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELNAME)
    public void setPSSysDynaModelName(String pSSysDynaModelName){
        this.set(FIELD_PSSYSDYNAMODELNAME, pSSysDynaModelName);
    }
    
    /**
     * 获取 动态系统模型  
     * @return
     */
    @JsonIgnore
    public String getPSSysDynaModelName(){
        Object objValue = this.get(FIELD_PSSYSDYNAMODELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 动态系统模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDynaModelNameDirty(){
        if(this.contains(FIELD_PSSYSDYNAMODELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 动态系统模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelName(){
        this.reset(FIELD_PSSYSDYNAMODELNAME);
    }

    /**
     * 设置 动态系统模型
     * <P>
     * 等同 {@link #setPSSysDynaModelName}
     * @param pSSysDynaModelName
     */
    @JsonIgnore
    public PSDEActionDTO pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端扩展插件，指定实体行为使用的前端模板扩展插件，使用插件类型【应用实体方法插件】
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysPFPluginDTO} 
     */
    public final static String FIELD_PSSYSPFPLUGINID = "pssyspfpluginid";

    /**
     * 设置 前端扩展插件，详细说明：{@link #FIELD_PSSYSPFPLUGINID}
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
     * 设置 前端扩展插件，详细说明：{@link #FIELD_PSSYSPFPLUGINID}
     * <P>
     * 等同 {@link #setPSSysPFPluginId}
     * @param pSSysPFPluginId
     */
    @JsonIgnore
    public PSDEActionDTO pssyspfpluginid(String pSSysPFPluginId){
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
    public PSDEActionDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin){
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
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端扩展插件，指定实体行为使用的前端模板扩展插件，使用插件类型【应用实体方法插件】
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSPFPLUGINID}
     */
    public final static String FIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";

    /**
     * 设置 前端扩展插件，详细说明：{@link #FIELD_PSSYSPFPLUGINNAME}
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
     * 设置 前端扩展插件，详细说明：{@link #FIELD_PSSYSPFPLUGINNAME}
     * <P>
     * 等同 {@link #setPSSysPFPluginName}
     * @param pSSysPFPluginName
     */
    @JsonIgnore
    public PSDEActionDTO pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    /**
     * <B>PSSYSREQITEMID</B>&nbsp;系统设计需求
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysReqItemDTO} 
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
    public PSDEActionDTO pssysreqitemid(String pSSysReqItemId){
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
    public PSDEActionDTO pssysreqitemid(PSSysReqItemDTO pSSysReqItem){
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
    public PSDEActionDTO pssysreqitemname(String pSSysReqItemName){
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINID</B>&nbsp;后台扩展插件，指定实体行为使用的后台模板扩展插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysSFPluginDTO} 
     */
    public final static String FIELD_PSSYSSFPLUGINID = "pssyssfpluginid";

    /**
     * 设置 后台扩展插件，详细说明：{@link #FIELD_PSSYSSFPLUGINID}
     * 
     * @param pSSysSFPluginId
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINID)
    public void setPSSysSFPluginId(String pSSysSFPluginId){
        this.set(FIELD_PSSYSSFPLUGINID, pSSysSFPluginId);
    }
    
    /**
     * 获取 后台扩展插件  
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
     * 判断 后台扩展插件 是否指定值，包括空值
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
     * 重置 后台扩展插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginId(){
        this.reset(FIELD_PSSYSSFPLUGINID);
    }

    /**
     * 设置 后台扩展插件，详细说明：{@link #FIELD_PSSYSSFPLUGINID}
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPluginId
     */
    @JsonIgnore
    public PSDEActionDTO pssyssfpluginid(String pSSysSFPluginId){
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    /**
     * 设置 后台扩展插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPlugin 引用对象
     */
    @JsonIgnore
    public PSDEActionDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin){
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
     * <B>PSSYSSFPLUGINNAME</B>&nbsp;后台扩展插件，指定实体行为使用的后台模板扩展插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSFPLUGINID}
     */
    public final static String FIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";

    /**
     * 设置 后台扩展插件，详细说明：{@link #FIELD_PSSYSSFPLUGINNAME}
     * 
     * @param pSSysSFPluginName
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINNAME)
    public void setPSSysSFPluginName(String pSSysSFPluginName){
        this.set(FIELD_PSSYSSFPLUGINNAME, pSSysSFPluginName);
    }
    
    /**
     * 获取 后台扩展插件  
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
     * 判断 后台扩展插件 是否指定值，包括空值
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
     * 重置 后台扩展插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginName(){
        this.reset(FIELD_PSSYSSFPLUGINNAME);
    }

    /**
     * 设置 后台扩展插件，详细说明：{@link #FIELD_PSSYSSFPLUGINNAME}
     * <P>
     * 等同 {@link #setPSSysSFPluginName}
     * @param pSSysSFPluginName
     */
    @JsonIgnore
    public PSDEActionDTO pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    /**
     * <B>PUBMODE</B>&nbsp;默认启用服务，指定行为是否默认提供服务能力，未指定时使用实体定义的默认行为服务能力
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_PUBMODE = "pubmode";

    /**
     * 设置 默认启用服务，详细说明：{@link #FIELD_PUBMODE}
     * 
     * @param pubMode
     * 
     */
    @JsonProperty(FIELD_PUBMODE)
    public void setPubMode(Integer pubMode){
        this.set(FIELD_PUBMODE, pubMode);
    }
    
    /**
     * 获取 默认启用服务  
     * @return
     */
    @JsonIgnore
    public Integer getPubMode(){
        Object objValue = this.get(FIELD_PUBMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认启用服务 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPubModeDirty(){
        if(this.contains(FIELD_PUBMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认启用服务
     */
    @JsonIgnore
    public void resetPubMode(){
        this.reset(FIELD_PUBMODE);
    }

    /**
     * 设置 默认启用服务，详细说明：{@link #FIELD_PUBMODE}
     * <P>
     * 等同 {@link #setPubMode}
     * @param pubMode
     */
    @JsonIgnore
    public PSDEActionDTO pubmode(Integer pubMode){
        this.setPubMode(pubMode);
        return this;
    }

     /**
     * 设置 默认启用服务，详细说明：{@link #FIELD_PUBMODE}
     * <P>
     * 等同 {@link #setPubMode}
     * @param pubMode
     */
    @JsonIgnore
    public PSDEActionDTO pubmode(Boolean pubMode){
        if(pubMode == null){
            this.setPubMode(null);
        }
        else{
            this.setPubMode(pubMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>RAWSERVICEMETHOD</B>&nbsp;直接服务请求方式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.RequestMethod} 
     */
    public final static String FIELD_RAWSERVICEMETHOD = "rawservicemethod";

    /**
     * 设置 直接服务请求方式
     * 
     * @param rawServiceMethod
     * 
     */
    @JsonProperty(FIELD_RAWSERVICEMETHOD)
    public void setRawServiceMethod(String rawServiceMethod){
        this.set(FIELD_RAWSERVICEMETHOD, rawServiceMethod);
    }
    
    /**
     * 获取 直接服务请求方式  
     * @return
     */
    @JsonIgnore
    public String getRawServiceMethod(){
        Object objValue = this.get(FIELD_RAWSERVICEMETHOD);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 直接服务请求方式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRawServiceMethodDirty(){
        if(this.contains(FIELD_RAWSERVICEMETHOD)){
            return true;
        }
        return false;
    }

    /**
     * 重置 直接服务请求方式
     */
    @JsonIgnore
    public void resetRawServiceMethod(){
        this.reset(FIELD_RAWSERVICEMETHOD);
    }

    /**
     * 设置 直接服务请求方式
     * <P>
     * 等同 {@link #setRawServiceMethod}
     * @param rawServiceMethod
     */
    @JsonIgnore
    public PSDEActionDTO rawservicemethod(String rawServiceMethod){
        this.setRawServiceMethod(rawServiceMethod);
        return this;
    }

     /**
     * 设置 直接服务请求方式
     * <P>
     * 等同 {@link #setRawServiceMethod}
     * @param rawServiceMethod
     */
    @JsonIgnore
    public PSDEActionDTO rawservicemethod(net.ibizsys.model.PSModelEnums.RequestMethod rawServiceMethod){
        if(rawServiceMethod == null){
            this.setRawServiceMethod(null);
        }
        else{
            this.setRawServiceMethod(rawServiceMethod.value);
        }
        return this;
    }

    /**
     * <B>RAWSERVICEURL</B>&nbsp;直接服务路径
     */
    public final static String FIELD_RAWSERVICEURL = "rawserviceurl";

    /**
     * 设置 直接服务路径
     * 
     * @param rawServiceUrl
     * 
     */
    @JsonProperty(FIELD_RAWSERVICEURL)
    public void setRawServiceUrl(String rawServiceUrl){
        this.set(FIELD_RAWSERVICEURL, rawServiceUrl);
    }
    
    /**
     * 获取 直接服务路径  
     * @return
     */
    @JsonIgnore
    public String getRawServiceUrl(){
        Object objValue = this.get(FIELD_RAWSERVICEURL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 直接服务路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRawServiceUrlDirty(){
        if(this.contains(FIELD_RAWSERVICEURL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 直接服务路径
     */
    @JsonIgnore
    public void resetRawServiceUrl(){
        this.reset(FIELD_RAWSERVICEURL);
    }

    /**
     * 设置 直接服务路径
     * <P>
     * 等同 {@link #setRawServiceUrl}
     * @param rawServiceUrl
     */
    @JsonIgnore
    public PSDEActionDTO rawserviceurl(String rawServiceUrl){
        this.setRawServiceUrl(rawServiceUrl);
        return this;
    }

    /**
     * <B>REQUESTFIELD</B>&nbsp;请求属性名称，指定行为在服务参数类型为【指定属性】时属性的名称，未定义时使用实体的主键属性
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_REQUESTFIELD = "requestfield";

    /**
     * 设置 请求属性名称，详细说明：{@link #FIELD_REQUESTFIELD}
     * 
     * @param requestField
     * 
     */
    @JsonProperty(FIELD_REQUESTFIELD)
    public void setRequestField(String requestField){
        this.set(FIELD_REQUESTFIELD, requestField);
    }
    
    /**
     * 获取 请求属性名称  
     * @return
     */
    @JsonIgnore
    public String getRequestField(){
        Object objValue = this.get(FIELD_REQUESTFIELD);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 请求属性名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRequestFieldDirty(){
        if(this.contains(FIELD_REQUESTFIELD)){
            return true;
        }
        return false;
    }

    /**
     * 重置 请求属性名称
     */
    @JsonIgnore
    public void resetRequestField(){
        this.reset(FIELD_REQUESTFIELD);
    }

    /**
     * 设置 请求属性名称，详细说明：{@link #FIELD_REQUESTFIELD}
     * <P>
     * 等同 {@link #setRequestField}
     * @param requestField
     */
    @JsonIgnore
    public PSDEActionDTO requestfield(String requestField){
        this.setRequestField(requestField);
        return this;
    }

    /**
     * <B>REQUESTMETHOD</B>&nbsp;请求方式，指定行为在提供服务时使用的请求方式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.RequestMethod} 
     */
    public final static String FIELD_REQUESTMETHOD = "requestmethod";

    /**
     * 设置 请求方式，详细说明：{@link #FIELD_REQUESTMETHOD}
     * 
     * @param requestMethod
     * 
     */
    @JsonProperty(FIELD_REQUESTMETHOD)
    public void setRequestMethod(String requestMethod){
        this.set(FIELD_REQUESTMETHOD, requestMethod);
    }
    
    /**
     * 获取 请求方式  
     * @return
     */
    @JsonIgnore
    public String getRequestMethod(){
        Object objValue = this.get(FIELD_REQUESTMETHOD);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 请求方式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRequestMethodDirty(){
        if(this.contains(FIELD_REQUESTMETHOD)){
            return true;
        }
        return false;
    }

    /**
     * 重置 请求方式
     */
    @JsonIgnore
    public void resetRequestMethod(){
        this.reset(FIELD_REQUESTMETHOD);
    }

    /**
     * 设置 请求方式，详细说明：{@link #FIELD_REQUESTMETHOD}
     * <P>
     * 等同 {@link #setRequestMethod}
     * @param requestMethod
     */
    @JsonIgnore
    public PSDEActionDTO requestmethod(String requestMethod){
        this.setRequestMethod(requestMethod);
        return this;
    }

     /**
     * 设置 请求方式，详细说明：{@link #FIELD_REQUESTMETHOD}
     * <P>
     * 等同 {@link #setRequestMethod}
     * @param requestMethod
     */
    @JsonIgnore
    public PSDEActionDTO requestmethod(net.ibizsys.model.PSModelEnums.RequestMethod requestMethod){
        if(requestMethod == null){
            this.setRequestMethod(null);
        }
        else{
            this.setRequestMethod(requestMethod.value);
        }
        return this;
    }

    /**
     * <B>REQUESTPARAMTYPE</B>&nbsp;请求参数类型，指定行为在提供服务时使用的参数类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.ServiceReqParamType} 
     */
    public final static String FIELD_REQUESTPARAMTYPE = "requestparamtype";

    /**
     * 设置 请求参数类型，详细说明：{@link #FIELD_REQUESTPARAMTYPE}
     * 
     * @param requestParamType
     * 
     */
    @JsonProperty(FIELD_REQUESTPARAMTYPE)
    public void setRequestParamType(String requestParamType){
        this.set(FIELD_REQUESTPARAMTYPE, requestParamType);
    }
    
    /**
     * 获取 请求参数类型  
     * @return
     */
    @JsonIgnore
    public String getRequestParamType(){
        Object objValue = this.get(FIELD_REQUESTPARAMTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 请求参数类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRequestParamTypeDirty(){
        if(this.contains(FIELD_REQUESTPARAMTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 请求参数类型
     */
    @JsonIgnore
    public void resetRequestParamType(){
        this.reset(FIELD_REQUESTPARAMTYPE);
    }

    /**
     * 设置 请求参数类型，详细说明：{@link #FIELD_REQUESTPARAMTYPE}
     * <P>
     * 等同 {@link #setRequestParamType}
     * @param requestParamType
     */
    @JsonIgnore
    public PSDEActionDTO requestparamtype(String requestParamType){
        this.setRequestParamType(requestParamType);
        return this;
    }

     /**
     * 设置 请求参数类型，详细说明：{@link #FIELD_REQUESTPARAMTYPE}
     * <P>
     * 等同 {@link #setRequestParamType}
     * @param requestParamType
     */
    @JsonIgnore
    public PSDEActionDTO requestparamtype(net.ibizsys.model.PSModelEnums.ServiceReqParamType requestParamType){
        if(requestParamType == null){
            this.setRequestParamType(null);
        }
        else{
            this.setRequestParamType(requestParamType.value);
        }
        return this;
    }

    /**
     * <B>REQUESTPATH</B>&nbsp;请求路径
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_REQUESTPATH = "requestpath";

    /**
     * 设置 请求路径
     * 
     * @param requestPath
     * 
     */
    @JsonProperty(FIELD_REQUESTPATH)
    public void setRequestPath(String requestPath){
        this.set(FIELD_REQUESTPATH, requestPath);
    }
    
    /**
     * 获取 请求路径  
     * @return
     */
    @JsonIgnore
    public String getRequestPath(){
        Object objValue = this.get(FIELD_REQUESTPATH);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 请求路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRequestPathDirty(){
        if(this.contains(FIELD_REQUESTPATH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 请求路径
     */
    @JsonIgnore
    public void resetRequestPath(){
        this.reset(FIELD_REQUESTPATH);
    }

    /**
     * 设置 请求路径
     * <P>
     * 等同 {@link #setRequestPath}
     * @param requestPath
     */
    @JsonIgnore
    public PSDEActionDTO requestpath(String requestPath){
        this.setRequestPath(requestPath);
        return this;
    }

    /**
     * <B>RETSTDDATATYPE</B>&nbsp;返回数据类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.StdDataType} 
     */
    public final static String FIELD_RETSTDDATATYPE = "retstddatatype";

    /**
     * 设置 返回数据类型
     * 
     * @param retStdDataType
     * 
     */
    @JsonProperty(FIELD_RETSTDDATATYPE)
    public void setRetStdDataType(Integer retStdDataType){
        this.set(FIELD_RETSTDDATATYPE, retStdDataType);
    }
    
    /**
     * 获取 返回数据类型  
     * @return
     */
    @JsonIgnore
    public Integer getRetStdDataType(){
        Object objValue = this.get(FIELD_RETSTDDATATYPE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 返回数据类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRetStdDataTypeDirty(){
        if(this.contains(FIELD_RETSTDDATATYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 返回数据类型
     */
    @JsonIgnore
    public void resetRetStdDataType(){
        this.reset(FIELD_RETSTDDATATYPE);
    }

    /**
     * 设置 返回数据类型
     * <P>
     * 等同 {@link #setRetStdDataType}
     * @param retStdDataType
     */
    @JsonIgnore
    public PSDEActionDTO retstddatatype(Integer retStdDataType){
        this.setRetStdDataType(retStdDataType);
        return this;
    }

     /**
     * 设置 返回数据类型
     * <P>
     * 等同 {@link #setRetStdDataType}
     * @param retStdDataType
     */
    @JsonIgnore
    public PSDEActionDTO retstddatatype(net.ibizsys.model.PSModelEnums.StdDataType retStdDataType){
        if(retStdDataType == null){
            this.setRetStdDataType(null);
        }
        else{
            this.setRetStdDataType(retStdDataType.value);
        }
        return this;
    }

    /**
     * <B>RETVALTYPE</B>&nbsp;返回值类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DEActionRetType} 
     */
    public final static String FIELD_RETVALTYPE = "retvaltype";

    /**
     * 设置 返回值类型
     * 
     * @param retValType
     * 
     */
    @JsonProperty(FIELD_RETVALTYPE)
    public void setRetValType(String retValType){
        this.set(FIELD_RETVALTYPE, retValType);
    }
    
    /**
     * 获取 返回值类型  
     * @return
     */
    @JsonIgnore
    public String getRetValType(){
        Object objValue = this.get(FIELD_RETVALTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 返回值类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRetValTypeDirty(){
        if(this.contains(FIELD_RETVALTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 返回值类型
     */
    @JsonIgnore
    public void resetRetValType(){
        this.reset(FIELD_RETVALTYPE);
    }

    /**
     * 设置 返回值类型
     * <P>
     * 等同 {@link #setRetValType}
     * @param retValType
     */
    @JsonIgnore
    public PSDEActionDTO retvaltype(String retValType){
        this.setRetValType(retValType);
        return this;
    }

     /**
     * 设置 返回值类型
     * <P>
     * 等同 {@link #setRetValType}
     * @param retValType
     */
    @JsonIgnore
    public PSDEActionDTO retvaltype(net.ibizsys.model.PSModelEnums.DEActionRetType retValType){
        if(retValType == null){
            this.setRetValType(null);
        }
        else{
            this.setRetValType(retValType.value);
        }
        return this;
    }

    /**
     * <B>SUBSYSSADETAILMODE</B>&nbsp;外部接口方法绑定
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.SubSysSADEMethodBindingMode} 
     */
    public final static String FIELD_SUBSYSSADETAILMODE = "subsyssadetailmode";

    /**
     * 设置 外部接口方法绑定
     * 
     * @param subSysSADetailMode
     * 
     */
    @JsonProperty(FIELD_SUBSYSSADETAILMODE)
    public void setSubSysSADetailMode(Integer subSysSADetailMode){
        this.set(FIELD_SUBSYSSADETAILMODE, subSysSADetailMode);
    }
    
    /**
     * 获取 外部接口方法绑定  
     * @return
     */
    @JsonIgnore
    public Integer getSubSysSADetailMode(){
        Object objValue = this.get(FIELD_SUBSYSSADETAILMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 外部接口方法绑定 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSubSysSADetailModeDirty(){
        if(this.contains(FIELD_SUBSYSSADETAILMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 外部接口方法绑定
     */
    @JsonIgnore
    public void resetSubSysSADetailMode(){
        this.reset(FIELD_SUBSYSSADETAILMODE);
    }

    /**
     * 设置 外部接口方法绑定
     * <P>
     * 等同 {@link #setSubSysSADetailMode}
     * @param subSysSADetailMode
     */
    @JsonIgnore
    public PSDEActionDTO subsyssadetailmode(Integer subSysSADetailMode){
        this.setSubSysSADetailMode(subSysSADetailMode);
        return this;
    }

     /**
     * 设置 外部接口方法绑定
     * <P>
     * 等同 {@link #setSubSysSADetailMode}
     * @param subSysSADetailMode
     */
    @JsonIgnore
    public PSDEActionDTO subsyssadetailmode(net.ibizsys.model.PSModelEnums.SubSysSADEMethodBindingMode subSysSADetailMode){
        if(subSysSADetailMode == null){
            this.setSubSysSADetailMode(null);
        }
        else{
            this.setSubSysSADetailMode(subSysSADetailMode.value);
        }
        return this;
    }

    /**
     * <B>TESTACTIONMODE</B>&nbsp;测试行为模式，指定行为的测试行为模式，未定义时为【无测试行为】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DEActionTestActionMode} 
     */
    public final static String FIELD_TESTACTIONMODE = "testactionmode";

    /**
     * 设置 测试行为模式，详细说明：{@link #FIELD_TESTACTIONMODE}
     * 
     * @param testActionMode
     * 
     */
    @JsonProperty(FIELD_TESTACTIONMODE)
    public void setTestActionMode(Integer testActionMode){
        this.set(FIELD_TESTACTIONMODE, testActionMode);
    }
    
    /**
     * 获取 测试行为模式  
     * @return
     */
    @JsonIgnore
    public Integer getTestActionMode(){
        Object objValue = this.get(FIELD_TESTACTIONMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 测试行为模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTestActionModeDirty(){
        if(this.contains(FIELD_TESTACTIONMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 测试行为模式
     */
    @JsonIgnore
    public void resetTestActionMode(){
        this.reset(FIELD_TESTACTIONMODE);
    }

    /**
     * 设置 测试行为模式，详细说明：{@link #FIELD_TESTACTIONMODE}
     * <P>
     * 等同 {@link #setTestActionMode}
     * @param testActionMode
     */
    @JsonIgnore
    public PSDEActionDTO testactionmode(Integer testActionMode){
        this.setTestActionMode(testActionMode);
        return this;
    }

     /**
     * 设置 测试行为模式，详细说明：{@link #FIELD_TESTACTIONMODE}
     * <P>
     * 等同 {@link #setTestActionMode}
     * @param testActionMode
     */
    @JsonIgnore
    public PSDEActionDTO testactionmode(net.ibizsys.model.PSModelEnums.DEActionTestActionMode testActionMode){
        if(testActionMode == null){
            this.setTestActionMode(null);
        }
        else{
            this.setTestActionMode(testActionMode.value);
        }
        return this;
    }

    /**
     * <B>TESTCASEFLAG</B>&nbsp;默认测试单元，指定是否对行为产生测试单元，未定义时内置行为将设定为【是】，其他行为为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_TESTCASEFLAG = "testcaseflag";

    /**
     * 设置 默认测试单元，详细说明：{@link #FIELD_TESTCASEFLAG}
     * 
     * @param testCaseFlag
     * 
     */
    @JsonProperty(FIELD_TESTCASEFLAG)
    public void setTestCaseFlag(Integer testCaseFlag){
        this.set(FIELD_TESTCASEFLAG, testCaseFlag);
    }
    
    /**
     * 获取 默认测试单元  
     * @return
     */
    @JsonIgnore
    public Integer getTestCaseFlag(){
        Object objValue = this.get(FIELD_TESTCASEFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认测试单元 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTestCaseFlagDirty(){
        if(this.contains(FIELD_TESTCASEFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认测试单元
     */
    @JsonIgnore
    public void resetTestCaseFlag(){
        this.reset(FIELD_TESTCASEFLAG);
    }

    /**
     * 设置 默认测试单元，详细说明：{@link #FIELD_TESTCASEFLAG}
     * <P>
     * 等同 {@link #setTestCaseFlag}
     * @param testCaseFlag
     */
    @JsonIgnore
    public PSDEActionDTO testcaseflag(Integer testCaseFlag){
        this.setTestCaseFlag(testCaseFlag);
        return this;
    }

     /**
     * 设置 默认测试单元，详细说明：{@link #FIELD_TESTCASEFLAG}
     * <P>
     * 等同 {@link #setTestCaseFlag}
     * @param testCaseFlag
     */
    @JsonIgnore
    public PSDEActionDTO testcaseflag(Boolean testCaseFlag){
        if(testCaseFlag == null){
            this.setTestCaseFlag(null);
        }
        else{
            this.setTestCaseFlag(testCaseFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>TSMODE</B>&nbsp;事务模式，指定行为的事务模式，未定义时行为时逻辑继承的实体行为将被设定为【分布式事务】，其余为【默认】，由执行体系决定
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DEActionTSMode} 
     */
    public final static String FIELD_TSMODE = "tsmode";

    /**
     * 设置 事务模式，详细说明：{@link #FIELD_TSMODE}
     * 
     * @param tSMode
     * 
     */
    @JsonProperty(FIELD_TSMODE)
    public void setTSMode(String tSMode){
        this.set(FIELD_TSMODE, tSMode);
    }
    
    /**
     * 获取 事务模式  
     * @return
     */
    @JsonIgnore
    public String getTSMode(){
        Object objValue = this.get(FIELD_TSMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 事务模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTSModeDirty(){
        if(this.contains(FIELD_TSMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 事务模式
     */
    @JsonIgnore
    public void resetTSMode(){
        this.reset(FIELD_TSMODE);
    }

    /**
     * 设置 事务模式，详细说明：{@link #FIELD_TSMODE}
     * <P>
     * 等同 {@link #setTSMode}
     * @param tSMode
     */
    @JsonIgnore
    public PSDEActionDTO tsmode(String tSMode){
        this.setTSMode(tSMode);
        return this;
    }

     /**
     * 设置 事务模式，详细说明：{@link #FIELD_TSMODE}
     * <P>
     * 等同 {@link #setTSMode}
     * @param tSMode
     */
    @JsonIgnore
    public PSDEActionDTO tsmode(net.ibizsys.model.PSModelEnums.DEActionTSMode tSMode){
        if(tSMode == null){
            this.setTSMode(null);
        }
        else{
            this.setTSMode(tSMode.value);
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
    public PSDEActionDTO updatedate(Timestamp updateDate){
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
    public PSDEActionDTO updateman(String updateMan){
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
    public PSDEActionDTO usercat(String userCat){
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
    public PSDEActionDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat.value);
        }
        return this;
    }

    /**
     * <B>USERPARAMS</B>&nbsp;自定义参数
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_USERPARAMS = "userparams";

    /**
     * 设置 自定义参数
     * 
     * @param userParams
     * 
     */
    @JsonProperty(FIELD_USERPARAMS)
    public void setUserParams(String userParams){
        this.set(FIELD_USERPARAMS, userParams);
    }
    
    /**
     * 获取 自定义参数  
     * @return
     */
    @JsonIgnore
    public String getUserParams(){
        Object objValue = this.get(FIELD_USERPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserParamsDirty(){
        if(this.contains(FIELD_USERPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义参数
     */
    @JsonIgnore
    public void resetUserParams(){
        this.reset(FIELD_USERPARAMS);
    }

    /**
     * 设置 自定义参数
     * <P>
     * 等同 {@link #setUserParams}
     * @param userParams
     */
    @JsonIgnore
    public PSDEActionDTO userparams(String userParams){
        this.setUserParams(userParams);
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
    public PSDEActionDTO usertag(String userTag){
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
    public PSDEActionDTO usertag2(String userTag2){
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
    public PSDEActionDTO usertag3(String userTag3){
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
    public PSDEActionDTO usertag4(String userTag4){
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
    public PSDEActionDTO validflag(Integer validFlag){
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
    public PSDEActionDTO validflag(Boolean validFlag){
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
        return this.getPSDEActionId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSDEActionId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEActionId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEActionId(strValue);
    }

    @JsonIgnore
    public PSDEActionDTO id(String strValue){
        this.setPSDEActionId(strValue);
        return this;
    }


    /**
     *  实体行为参数 成员集合
     */
    public final static String FIELD_PSDEACTIONPARAMS = "psdeactionparams";

    private java.util.List<net.ibizsys.centralstudio.dto.PSDEActionParamDTO> psdeactionparams;

    /**
     * 获取 实体行为参数 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEACTIONPARAMS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEActionParamDTO> getPSDEActionParams(){
        return this.psdeactionparams;
    }

    /**
     * 设置 实体行为参数 成员集合  
     * @param psdeactionparams
     */
    @JsonProperty(FIELD_PSDEACTIONPARAMS)
    public void setPSDEActionParams(java.util.List<net.ibizsys.centralstudio.dto.PSDEActionParamDTO> psdeactionparams){
        this.psdeactionparams = psdeactionparams;
    }

    /**
     * 获取 实体行为参数 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEActionParamDTO> getPSDEActionParamsIf(){
        if(this.psdeactionparams == null){
            this.psdeactionparams = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSDEActionParamDTO>();          
        }
        return this.psdeactionparams;
    }


    /**
     *  实体行为值规则 成员集合
     */
    public final static String FIELD_PSDEACTIONVRS = "psdeactionvrs";

    private java.util.List<net.ibizsys.centralstudio.dto.PSDEActionVRDTO> psdeactionvrs;

    /**
     * 获取 实体行为值规则 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEACTIONVRS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEActionVRDTO> getPSDEActionVRs(){
        return this.psdeactionvrs;
    }

    /**
     * 设置 实体行为值规则 成员集合  
     * @param psdeactionvrs
     */
    @JsonProperty(FIELD_PSDEACTIONVRS)
    public void setPSDEActionVRs(java.util.List<net.ibizsys.centralstudio.dto.PSDEActionVRDTO> psdeactionvrs){
        this.psdeactionvrs = psdeactionvrs;
    }

    /**
     * 获取 实体行为值规则 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEActionVRDTO> getPSDEActionVRsIf(){
        if(this.psdeactionvrs == null){
            this.psdeactionvrs = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSDEActionVRDTO>();          
        }
        return this.psdeactionvrs;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDEActionDTO){
            PSDEActionDTO dto = (PSDEActionDTO)iEntity;
            dto.setPSDEActionParams(this.getPSDEActionParams());
            dto.setPSDEActionVRs(this.getPSDEActionVRs());
        }
        super.copyTo(iEntity);
    }
}
