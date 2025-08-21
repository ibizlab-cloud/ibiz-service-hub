package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEDATASET</B>实体数据集合 模型传输对象
 * <P>
 * 实体的数据集模型，定义实体对外提供的数据集查询能力。数据集合支持不同的类型：联合一个或多个数据查询、从代码表取数或其它预定义模式
 */
public class PSDEDataSet extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEDataSet(){
        this.setValidFlag(1);
    }      

    /**
     * <B>ACTIONHOLDER</B>&nbsp;行为持有者，指定独立提供数据集合能力的持有者，未指定时为【后台及前台】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DELogicHolder} 
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
    public PSDEDataSet actionholder(Integer actionHolder){
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
    public PSDEDataSet actionholder(net.ibizsys.psmodel.core.util.PSModelEnums.DELogicHolder actionHolder){
        if(actionHolder == null){
            this.setActionHolder(null);
        }
        else{
            this.setActionHolder(actionHolder.value);
        }
        return this;
    }

    /**
     * <B>ADPSDELOGICID</B>&nbsp;查询转换逻辑
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDELogic} 
     */
    public final static String FIELD_ADPSDELOGICID = "adpsdelogicid";

    /**
     * 设置 查询转换逻辑
     * 
     * @param aDPSDELogicId
     * 
     */
    @JsonProperty(FIELD_ADPSDELOGICID)
    public void setADPSDELogicId(String aDPSDELogicId){
        this.set(FIELD_ADPSDELOGICID, aDPSDELogicId);
    }
    
    /**
     * 获取 查询转换逻辑  
     * @return
     */
    @JsonIgnore
    public String getADPSDELogicId(){
        Object objValue = this.get(FIELD_ADPSDELOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 查询转换逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isADPSDELogicIdDirty(){
        if(this.contains(FIELD_ADPSDELOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 查询转换逻辑
     */
    @JsonIgnore
    public void resetADPSDELogicId(){
        this.reset(FIELD_ADPSDELOGICID);
    }

    /**
     * 设置 查询转换逻辑
     * <P>
     * 等同 {@link #setADPSDELogicId}
     * @param aDPSDELogicId
     */
    @JsonIgnore
    public PSDEDataSet adpsdelogicid(String aDPSDELogicId){
        this.setADPSDELogicId(aDPSDELogicId);
        return this;
    }

    /**
     * 设置 查询转换逻辑，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setADPSDELogicId}
     * @param pSDELogic 引用对象
     */
    @JsonIgnore
    public PSDEDataSet adpsdelogicid(PSDELogic pSDELogic){
        if(pSDELogic == null){
            this.setADPSDELogicId(null);
            this.setADPSDELogicName(null);
        }
        else{
            this.setADPSDELogicId(pSDELogic.getPSDELogicId());
            this.setADPSDELogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    /**
     * <B>ADPSDELOGICNAME</B>&nbsp;查询转换逻辑
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ADPSDELOGICID}
     */
    public final static String FIELD_ADPSDELOGICNAME = "adpsdelogicname";

    /**
     * 设置 查询转换逻辑
     * 
     * @param aDPSDELogicName
     * 
     */
    @JsonProperty(FIELD_ADPSDELOGICNAME)
    public void setADPSDELogicName(String aDPSDELogicName){
        this.set(FIELD_ADPSDELOGICNAME, aDPSDELogicName);
    }
    
    /**
     * 获取 查询转换逻辑  
     * @return
     */
    @JsonIgnore
    public String getADPSDELogicName(){
        Object objValue = this.get(FIELD_ADPSDELOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 查询转换逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isADPSDELogicNameDirty(){
        if(this.contains(FIELD_ADPSDELOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 查询转换逻辑
     */
    @JsonIgnore
    public void resetADPSDELogicName(){
        this.reset(FIELD_ADPSDELOGICNAME);
    }

    /**
     * 设置 查询转换逻辑
     * <P>
     * 等同 {@link #setADPSDELogicName}
     * @param aDPSDELogicName
     */
    @JsonIgnore
    public PSDEDataSet adpsdelogicname(String aDPSDELogicName){
        this.setADPSDELogicName(aDPSDELogicName);
        return this;
    }

    /**
     * <B>AFTERCODE</B>&nbsp;前端执行之后代码，定义前端在行为执行之后附加的执行代码
     */
    public final static String FIELD_AFTERCODE = "aftercode";

    /**
     * 设置 前端执行之后代码，详细说明：{@link #FIELD_AFTERCODE}
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
     * 设置 前端执行之后代码，详细说明：{@link #FIELD_AFTERCODE}
     * <P>
     * 等同 {@link #setAfterCode}
     * @param afterCode
     */
    @JsonIgnore
    public PSDEDataSet aftercode(String afterCode){
        this.setAfterCode(afterCode);
        return this;
    }

    /**
     * <B>AGGDATAPSDERID</B>&nbsp;聚合数据关系
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDER} 
     */
    public final static String FIELD_AGGDATAPSDERID = "aggdatapsderid";

    /**
     * 设置 聚合数据关系
     * 
     * @param aggDataPSDERId
     * 
     */
    @JsonProperty(FIELD_AGGDATAPSDERID)
    public void setAggDataPSDERId(String aggDataPSDERId){
        this.set(FIELD_AGGDATAPSDERID, aggDataPSDERId);
    }
    
    /**
     * 获取 聚合数据关系  
     * @return
     */
    @JsonIgnore
    public String getAggDataPSDERId(){
        Object objValue = this.get(FIELD_AGGDATAPSDERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 聚合数据关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAggDataPSDERIdDirty(){
        if(this.contains(FIELD_AGGDATAPSDERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 聚合数据关系
     */
    @JsonIgnore
    public void resetAggDataPSDERId(){
        this.reset(FIELD_AGGDATAPSDERID);
    }

    /**
     * 设置 聚合数据关系
     * <P>
     * 等同 {@link #setAggDataPSDERId}
     * @param aggDataPSDERId
     */
    @JsonIgnore
    public PSDEDataSet aggdatapsderid(String aggDataPSDERId){
        this.setAggDataPSDERId(aggDataPSDERId);
        return this;
    }

    /**
     * 设置 聚合数据关系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setAggDataPSDERId}
     * @param pSDER 引用对象
     */
    @JsonIgnore
    public PSDEDataSet aggdatapsderid(PSDER pSDER){
        if(pSDER == null){
            this.setAggDataPSDERId(null);
            this.setAggDataPSDERName(null);
        }
        else{
            this.setAggDataPSDERId(pSDER.getPSDERId());
            this.setAggDataPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    /**
     * <B>AGGDATAPSDERNAME</B>&nbsp;聚合数据关系
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_AGGDATAPSDERID}
     */
    public final static String FIELD_AGGDATAPSDERNAME = "aggdatapsdername";

    /**
     * 设置 聚合数据关系
     * 
     * @param aggDataPSDERName
     * 
     */
    @JsonProperty(FIELD_AGGDATAPSDERNAME)
    public void setAggDataPSDERName(String aggDataPSDERName){
        this.set(FIELD_AGGDATAPSDERNAME, aggDataPSDERName);
    }
    
    /**
     * 获取 聚合数据关系  
     * @return
     */
    @JsonIgnore
    public String getAggDataPSDERName(){
        Object objValue = this.get(FIELD_AGGDATAPSDERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 聚合数据关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAggDataPSDERNameDirty(){
        if(this.contains(FIELD_AGGDATAPSDERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 聚合数据关系
     */
    @JsonIgnore
    public void resetAggDataPSDERName(){
        this.reset(FIELD_AGGDATAPSDERNAME);
    }

    /**
     * 设置 聚合数据关系
     * <P>
     * 等同 {@link #setAggDataPSDERName}
     * @param aggDataPSDERName
     */
    @JsonIgnore
    public PSDEDataSet aggdatapsdername(String aggDataPSDERName){
        this.setAggDataPSDERName(aggDataPSDERName);
        return this;
    }

    /**
     * <B>BEFORECODE</B>&nbsp;前端执行之前代码，定义前端在行为执行之前附加的执行代码
     */
    public final static String FIELD_BEFORECODE = "beforecode";

    /**
     * 设置 前端执行之前代码，详细说明：{@link #FIELD_BEFORECODE}
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
     * 设置 前端执行之前代码，详细说明：{@link #FIELD_BEFORECODE}
     * <P>
     * 等同 {@link #setBeforeCode}
     * @param beforeCode
     */
    @JsonIgnore
    public PSDEDataSet beforecode(String beforeCode){
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
    public PSDEDataSet cachecat(String cacheCat){
        this.setCacheCat(cacheCat);
        return this;
    }

    /**
     * <B>CACHECHECKSTATE</B>&nbsp;缓存检查状态，启用数据集缓存，需指定系统状态协同中的状态属性，通过对比状态属性与当前缓存状态的值判断缓存是否失效
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.UniState} 
     */
    public final static String FIELD_CACHECHECKSTATE = "cachecheckstate";

    /**
     * 设置 缓存检查状态，详细说明：{@link #FIELD_CACHECHECKSTATE}
     * 
     * @param cacheCheckState
     * 
     */
    @JsonProperty(FIELD_CACHECHECKSTATE)
    public void setCacheCheckState(String cacheCheckState){
        this.set(FIELD_CACHECHECKSTATE, cacheCheckState);
    }
    
    /**
     * 获取 缓存检查状态  
     * @return
     */
    @JsonIgnore
    public String getCacheCheckState(){
        Object objValue = this.get(FIELD_CACHECHECKSTATE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 缓存检查状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCacheCheckStateDirty(){
        if(this.contains(FIELD_CACHECHECKSTATE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 缓存检查状态
     */
    @JsonIgnore
    public void resetCacheCheckState(){
        this.reset(FIELD_CACHECHECKSTATE);
    }

    /**
     * 设置 缓存检查状态，详细说明：{@link #FIELD_CACHECHECKSTATE}
     * <P>
     * 等同 {@link #setCacheCheckState}
     * @param cacheCheckState
     */
    @JsonIgnore
    public PSDEDataSet cachecheckstate(String cacheCheckState){
        this.setCacheCheckState(cacheCheckState);
        return this;
    }

     /**
     * 设置 缓存检查状态，详细说明：{@link #FIELD_CACHECHECKSTATE}
     * <P>
     * 等同 {@link #setCacheCheckState}
     * @param cacheCheckState
     */
    @JsonIgnore
    public PSDEDataSet cachecheckstate(net.ibizsys.psmodel.core.util.PSModelEnums.UniState cacheCheckState){
        if(cacheCheckState == null){
            this.setCacheCheckState(null);
        }
        else{
            this.setCacheCheckState(cacheCheckState.value);
        }
        return this;
    }

    /**
     * <B>CACHESCOPE</B>&nbsp;缓存范围，指定数据集合的缓存范围
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DECacheScope} 
     */
    public final static String FIELD_CACHESCOPE = "cachescope";

    /**
     * 设置 缓存范围，详细说明：{@link #FIELD_CACHESCOPE}
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
     * 设置 缓存范围，详细说明：{@link #FIELD_CACHESCOPE}
     * <P>
     * 等同 {@link #setCacheScope}
     * @param cacheScope
     */
    @JsonIgnore
    public PSDEDataSet cachescope(String cacheScope){
        this.setCacheScope(cacheScope);
        return this;
    }

     /**
     * 设置 缓存范围，详细说明：{@link #FIELD_CACHESCOPE}
     * <P>
     * 等同 {@link #setCacheScope}
     * @param cacheScope
     */
    @JsonIgnore
    public PSDEDataSet cachescope(net.ibizsys.psmodel.core.util.PSModelEnums.DECacheScope cacheScope){
        if(cacheScope == null){
            this.setCacheScope(null);
        }
        else{
            this.setCacheScope(cacheScope.value);
        }
        return this;
    }

    /**
     * <B>CACHESTATEPSDELOGICID</B>&nbsp;缓存状态计算逻辑，启用数据集缓存功能，需指定计算当前缓存状态的处理逻辑
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDELogic} 
     */
    public final static String FIELD_CACHESTATEPSDELOGICID = "cachestatepsdelogicid";

    /**
     * 设置 缓存状态计算逻辑，详细说明：{@link #FIELD_CACHESTATEPSDELOGICID}
     * 
     * @param cacheStatePSDELogicId
     * 
     */
    @JsonProperty(FIELD_CACHESTATEPSDELOGICID)
    public void setCacheStatePSDELogicId(String cacheStatePSDELogicId){
        this.set(FIELD_CACHESTATEPSDELOGICID, cacheStatePSDELogicId);
    }
    
    /**
     * 获取 缓存状态计算逻辑  
     * @return
     */
    @JsonIgnore
    public String getCacheStatePSDELogicId(){
        Object objValue = this.get(FIELD_CACHESTATEPSDELOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 缓存状态计算逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCacheStatePSDELogicIdDirty(){
        if(this.contains(FIELD_CACHESTATEPSDELOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 缓存状态计算逻辑
     */
    @JsonIgnore
    public void resetCacheStatePSDELogicId(){
        this.reset(FIELD_CACHESTATEPSDELOGICID);
    }

    /**
     * 设置 缓存状态计算逻辑，详细说明：{@link #FIELD_CACHESTATEPSDELOGICID}
     * <P>
     * 等同 {@link #setCacheStatePSDELogicId}
     * @param cacheStatePSDELogicId
     */
    @JsonIgnore
    public PSDEDataSet cachestatepsdelogicid(String cacheStatePSDELogicId){
        this.setCacheStatePSDELogicId(cacheStatePSDELogicId);
        return this;
    }

    /**
     * 设置 缓存状态计算逻辑，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setCacheStatePSDELogicId}
     * @param pSDELogic 引用对象
     */
    @JsonIgnore
    public PSDEDataSet cachestatepsdelogicid(PSDELogic pSDELogic){
        if(pSDELogic == null){
            this.setCacheStatePSDELogicId(null);
            this.setCacheStatePSDELogicName(null);
        }
        else{
            this.setCacheStatePSDELogicId(pSDELogic.getPSDELogicId());
            this.setCacheStatePSDELogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    /**
     * <B>CACHESTATEPSDELOGICNAME</B>&nbsp;缓存状态计算逻辑，启用数据集缓存功能，需指定计算当前缓存状态的处理逻辑
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CACHESTATEPSDELOGICID}
     */
    public final static String FIELD_CACHESTATEPSDELOGICNAME = "cachestatepsdelogicname";

    /**
     * 设置 缓存状态计算逻辑，详细说明：{@link #FIELD_CACHESTATEPSDELOGICNAME}
     * 
     * @param cacheStatePSDELogicName
     * 
     */
    @JsonProperty(FIELD_CACHESTATEPSDELOGICNAME)
    public void setCacheStatePSDELogicName(String cacheStatePSDELogicName){
        this.set(FIELD_CACHESTATEPSDELOGICNAME, cacheStatePSDELogicName);
    }
    
    /**
     * 获取 缓存状态计算逻辑  
     * @return
     */
    @JsonIgnore
    public String getCacheStatePSDELogicName(){
        Object objValue = this.get(FIELD_CACHESTATEPSDELOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 缓存状态计算逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCacheStatePSDELogicNameDirty(){
        if(this.contains(FIELD_CACHESTATEPSDELOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 缓存状态计算逻辑
     */
    @JsonIgnore
    public void resetCacheStatePSDELogicName(){
        this.reset(FIELD_CACHESTATEPSDELOGICNAME);
    }

    /**
     * 设置 缓存状态计算逻辑，详细说明：{@link #FIELD_CACHESTATEPSDELOGICNAME}
     * <P>
     * 等同 {@link #setCacheStatePSDELogicName}
     * @param cacheStatePSDELogicName
     */
    @JsonIgnore
    public PSDEDataSet cachestatepsdelogicname(String cacheStatePSDELogicName){
        this.setCacheStatePSDELogicName(cacheStatePSDELogicName);
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
    public PSDEDataSet cachetag(String cacheTag){
        this.setCacheTag(cacheTag);
        return this;
    }

    /**
     * <B>CACHETIMEOUT</B>&nbsp;缓存失效时长，指定缓存的超时时长，单位为【毫秒】，-1为永不过期，未定义时为【-1】
     */
    public final static String FIELD_CACHETIMEOUT = "cachetimeout";

    /**
     * 设置 缓存失效时长，详细说明：{@link #FIELD_CACHETIMEOUT}
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
     * 设置 缓存失效时长，详细说明：{@link #FIELD_CACHETIMEOUT}
     * <P>
     * 等同 {@link #setCacheTimeout}
     * @param cacheTimeout
     */
    @JsonIgnore
    public PSDEDataSet cachetimeout(Integer cacheTimeout){
        this.setCacheTimeout(cacheTimeout);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定数据集合的代码标识，需要在所在的实体中具有唯一性
     * <P>
     * 字符串：最大长度 60，由字母、数字、下划线组成，且开始必须为字母
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
    public PSDEDataSet codename(String codeName){
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
    public PSDEDataSet createdate(String createDate){
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
    public PSDEDataSet createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CUSTOMCODE</B>&nbsp;内联代码
     */
    public final static String FIELD_CUSTOMCODE = "customcode";

    /**
     * 设置 内联代码
     * 
     * @param customCode
     * 
     */
    @JsonProperty(FIELD_CUSTOMCODE)
    public void setCustomCode(String customCode){
        this.set(FIELD_CUSTOMCODE, customCode);
    }
    
    /**
     * 获取 内联代码  
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
     * 判断 内联代码 是否指定值，包括空值
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
     * 重置 内联代码
     */
    @JsonIgnore
    public void resetCustomCode(){
        this.reset(FIELD_CUSTOMCODE);
    }

    /**
     * 设置 内联代码
     * <P>
     * 等同 {@link #setCustomCode}
     * @param customCode
     */
    @JsonIgnore
    public PSDEDataSet customcode(String customCode){
        this.setCustomCode(customCode);
        return this;
    }

    /**
     * <B>CUSTOMMODE</B>&nbsp;脚本代码模式，进一步指定脚本代码的模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ScriptMode2} 
     */
    public final static String FIELD_CUSTOMMODE = "custommode";

    /**
     * 设置 脚本代码模式，详细说明：{@link #FIELD_CUSTOMMODE}
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
     * 设置 脚本代码模式，详细说明：{@link #FIELD_CUSTOMMODE}
     * <P>
     * 等同 {@link #setCustomMode}
     * @param customMode
     */
    @JsonIgnore
    public PSDEDataSet custommode(Integer customMode){
        this.setCustomMode(customMode);
        return this;
    }

     /**
     * 设置 脚本代码模式，详细说明：{@link #FIELD_CUSTOMMODE}
     * <P>
     * 等同 {@link #setCustomMode}
     * @param customMode
     */
    @JsonIgnore
    public PSDEDataSet custommode(net.ibizsys.psmodel.core.util.PSModelEnums.ScriptMode2 customMode){
        if(customMode == null){
            this.setCustomMode(null);
        }
        else{
            this.setCustomMode(customMode.value);
        }
        return this;
    }

    /**
     * <B>DATASETPARAMS</B>&nbsp;数据集参数
     */
    public final static String FIELD_DATASETPARAMS = "datasetparams";

    /**
     * 设置 数据集参数
     * 
     * @param dataSetParams
     * 
     */
    @JsonProperty(FIELD_DATASETPARAMS)
    public void setDataSetParams(String dataSetParams){
        this.set(FIELD_DATASETPARAMS, dataSetParams);
    }
    
    /**
     * 获取 数据集参数  
     * @return
     */
    @JsonIgnore
    public String getDataSetParams(){
        Object objValue = this.get(FIELD_DATASETPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据集参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDataSetParamsDirty(){
        if(this.contains(FIELD_DATASETPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据集参数
     */
    @JsonIgnore
    public void resetDataSetParams(){
        this.reset(FIELD_DATASETPARAMS);
    }

    /**
     * 设置 数据集参数
     * <P>
     * 等同 {@link #setDataSetParams}
     * @param dataSetParams
     */
    @JsonIgnore
    public PSDEDataSet datasetparams(String dataSetParams){
        this.setDataSetParams(dataSetParams);
        return this;
    }

    /**
     * <B>DATASETSN</B>&nbsp;数据集合编号，指定数据集合的编号
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_DATASETSN = "datasetsn";

    /**
     * 设置 数据集合编号，详细说明：{@link #FIELD_DATASETSN}
     * 
     * @param dataSetSN
     * 
     */
    @JsonProperty(FIELD_DATASETSN)
    public void setDataSetSN(String dataSetSN){
        this.set(FIELD_DATASETSN, dataSetSN);
    }
    
    /**
     * 获取 数据集合编号  
     * @return
     */
    @JsonIgnore
    public String getDataSetSN(){
        Object objValue = this.get(FIELD_DATASETSN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据集合编号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDataSetSNDirty(){
        if(this.contains(FIELD_DATASETSN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据集合编号
     */
    @JsonIgnore
    public void resetDataSetSN(){
        this.reset(FIELD_DATASETSN);
    }

    /**
     * 设置 数据集合编号，详细说明：{@link #FIELD_DATASETSN}
     * <P>
     * 等同 {@link #setDataSetSN}
     * @param dataSetSN
     */
    @JsonIgnore
    public PSDEDataSet datasetsn(String dataSetSN){
        this.setDataSetSN(dataSetSN);
        return this;
    }

    /**
     * <B>DEFAULTMODE</B>&nbsp;默认数据集，指定数据集合是否作为当前实体的默认数据集合，默认数据集合在指定了提供实体但未明确结果集合的情况下使用，未指定时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEFAULTMODE = "defaultmode";

    /**
     * 设置 默认数据集，详细说明：{@link #FIELD_DEFAULTMODE}
     * 
     * @param defaultMode
     * 
     */
    @JsonProperty(FIELD_DEFAULTMODE)
    public void setDefaultMode(Integer defaultMode){
        this.set(FIELD_DEFAULTMODE, defaultMode);
    }
    
    /**
     * 获取 默认数据集  
     * @return
     */
    @JsonIgnore
    public Integer getDefaultMode(){
        Object objValue = this.get(FIELD_DEFAULTMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认数据集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefaultModeDirty(){
        if(this.contains(FIELD_DEFAULTMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认数据集
     */
    @JsonIgnore
    public void resetDefaultMode(){
        this.reset(FIELD_DEFAULTMODE);
    }

    /**
     * 设置 默认数据集，详细说明：{@link #FIELD_DEFAULTMODE}
     * <P>
     * 等同 {@link #setDefaultMode}
     * @param defaultMode
     */
    @JsonIgnore
    public PSDEDataSet defaultmode(Integer defaultMode){
        this.setDefaultMode(defaultMode);
        return this;
    }

     /**
     * 设置 默认数据集，详细说明：{@link #FIELD_DEFAULTMODE}
     * <P>
     * 等同 {@link #setDefaultMode}
     * @param defaultMode
     */
    @JsonIgnore
    public PSDEDataSet defaultmode(Boolean defaultMode){
        if(defaultMode == null){
            this.setDefaultMode(null);
        }
        else{
            this.setDefaultMode(defaultMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DSOPTION</B>&nbsp;数据集选项
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEDataSetOption} 
     */
    public final static String FIELD_DSOPTION = "dsoption";

    /**
     * 设置 数据集选项
     * 
     * @param dSOption
     * 
     */
    @JsonProperty(FIELD_DSOPTION)
    public void setDSOption(Integer dSOption){
        this.set(FIELD_DSOPTION, dSOption);
    }
    
    /**
     * 获取 数据集选项  
     * @return
     */
    @JsonIgnore
    public Integer getDSOption(){
        Object objValue = this.get(FIELD_DSOPTION);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 数据集选项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDSOptionDirty(){
        if(this.contains(FIELD_DSOPTION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据集选项
     */
    @JsonIgnore
    public void resetDSOption(){
        this.reset(FIELD_DSOPTION);
    }

    /**
     * 设置 数据集选项
     * <P>
     * 等同 {@link #setDSOption}
     * @param dSOption
     */
    @JsonIgnore
    public PSDEDataSet dsoption(Integer dSOption){
        this.setDSOption(dSOption);
        return this;
    }

     /**
     * 设置 数据集选项
     * <P>
     * 等同 {@link #setDSOption}
     * @param dSOption
     */
    @JsonIgnore
    public PSDEDataSet dsoption(net.ibizsys.psmodel.core.util.PSModelEnums.DEDataSetOption[] dSOption){
        if(dSOption == null || dSOption.length == 0){
            this.setDSOption(null);
        }
        else{
            int _value = 0;
            for(net.ibizsys.psmodel.core.util.PSModelEnums.DEDataSetOption _item : dSOption){
                _value |= _item.value;
            }
            this.setDSOption(_value);
        }
        return this;
    }

    /**
     * <B>DSTAG</B>&nbsp;数据集合标识
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_DSTAG = "dstag";

    /**
     * 设置 数据集合标识
     * 
     * @param dSTag
     * 
     */
    @JsonProperty(FIELD_DSTAG)
    public void setDSTag(String dSTag){
        this.set(FIELD_DSTAG, dSTag);
    }
    
    /**
     * 获取 数据集合标识  
     * @return
     */
    @JsonIgnore
    public String getDSTag(){
        Object objValue = this.get(FIELD_DSTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据集合标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDSTagDirty(){
        if(this.contains(FIELD_DSTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据集合标识
     */
    @JsonIgnore
    public void resetDSTag(){
        this.reset(FIELD_DSTAG);
    }

    /**
     * 设置 数据集合标识
     * <P>
     * 等同 {@link #setDSTag}
     * @param dSTag
     */
    @JsonIgnore
    public PSDEDataSet dstag(String dSTag){
        this.setDSTag(dSTag);
        return this;
    }

    /**
     * <B>DSTAG2</B>&nbsp;数据集合标识2
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_DSTAG2 = "dstag2";

    /**
     * 设置 数据集合标识2
     * 
     * @param dSTag2
     * 
     */
    @JsonProperty(FIELD_DSTAG2)
    public void setDSTag2(String dSTag2){
        this.set(FIELD_DSTAG2, dSTag2);
    }
    
    /**
     * 获取 数据集合标识2  
     * @return
     */
    @JsonIgnore
    public String getDSTag2(){
        Object objValue = this.get(FIELD_DSTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据集合标识2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDSTag2Dirty(){
        if(this.contains(FIELD_DSTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据集合标识2
     */
    @JsonIgnore
    public void resetDSTag2(){
        this.reset(FIELD_DSTAG2);
    }

    /**
     * 设置 数据集合标识2
     * <P>
     * 等同 {@link #setDSTag2}
     * @param dSTag2
     */
    @JsonIgnore
    public PSDEDataSet dstag2(String dSTag2){
        this.setDSTag2(dSTag2);
        return this;
    }

    /**
     * <B>DSTAG3</B>&nbsp;数据集合标识3
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_DSTAG3 = "dstag3";

    /**
     * 设置 数据集合标识3
     * 
     * @param dSTag3
     * 
     */
    @JsonProperty(FIELD_DSTAG3)
    public void setDSTag3(String dSTag3){
        this.set(FIELD_DSTAG3, dSTag3);
    }
    
    /**
     * 获取 数据集合标识3  
     * @return
     */
    @JsonIgnore
    public String getDSTag3(){
        Object objValue = this.get(FIELD_DSTAG3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据集合标识3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDSTag3Dirty(){
        if(this.contains(FIELD_DSTAG3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据集合标识3
     */
    @JsonIgnore
    public void resetDSTag3(){
        this.reset(FIELD_DSTAG3);
    }

    /**
     * 设置 数据集合标识3
     * <P>
     * 等同 {@link #setDSTag3}
     * @param dSTag3
     */
    @JsonIgnore
    public PSDEDataSet dstag3(String dSTag3){
        this.setDSTag3(dSTag3);
        return this;
    }

    /**
     * <B>DSTAG4</B>&nbsp;数据集合标识4
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_DSTAG4 = "dstag4";

    /**
     * 设置 数据集合标识4
     * 
     * @param dSTag4
     * 
     */
    @JsonProperty(FIELD_DSTAG4)
    public void setDSTag4(String dSTag4){
        this.set(FIELD_DSTAG4, dSTag4);
    }
    
    /**
     * 获取 数据集合标识4  
     * @return
     */
    @JsonIgnore
    public String getDSTag4(){
        Object objValue = this.get(FIELD_DSTAG4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据集合标识4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDSTag4Dirty(){
        if(this.contains(FIELD_DSTAG4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据集合标识4
     */
    @JsonIgnore
    public void resetDSTag4(){
        this.reset(FIELD_DSTAG4);
    }

    /**
     * 设置 数据集合标识4
     * <P>
     * 等同 {@link #setDSTag4}
     * @param dSTag4
     */
    @JsonIgnore
    public PSDEDataSet dstag4(String dSTag4){
        this.setDSTag4(dSTag4);
        return this;
    }

    /**
     * <B>ENABLEAUDIT</B>&nbsp;启用访问审计
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
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
    public PSDEDataSet enableaudit(Integer enableAudit){
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
    public PSDEDataSet enableaudit(Boolean enableAudit){
        if(enableAudit == null){
            this.setEnableAudit(null);
        }
        else{
            this.setEnableAudit(enableAudit?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLECACHE</B>&nbsp;启用缓存，指定数据集合是否支持缓存，启用缓存后可进一步管理【缓存范围】，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLECACHE = "enablecache";

    /**
     * 设置 启用缓存，详细说明：{@link #FIELD_ENABLECACHE}
     * 
     * @param enableCache
     * 
     */
    @JsonProperty(FIELD_ENABLECACHE)
    public void setEnableCache(Integer enableCache){
        this.set(FIELD_ENABLECACHE, enableCache);
    }
    
    /**
     * 获取 启用缓存  
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
     * 判断 启用缓存 是否指定值，包括空值
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
     * 重置 启用缓存
     */
    @JsonIgnore
    public void resetEnableCache(){
        this.reset(FIELD_ENABLECACHE);
    }

    /**
     * 设置 启用缓存，详细说明：{@link #FIELD_ENABLECACHE}
     * <P>
     * 等同 {@link #setEnableCache}
     * @param enableCache
     */
    @JsonIgnore
    public PSDEDataSet enablecache(Integer enableCache){
        this.setEnableCache(enableCache);
        return this;
    }

     /**
     * 设置 启用缓存，详细说明：{@link #FIELD_ENABLECACHE}
     * <P>
     * 等同 {@link #setEnableCache}
     * @param enableCache
     */
    @JsonIgnore
    public PSDEDataSet enablecache(Boolean enableCache){
        if(enableCache == null){
            this.setEnableCache(null);
        }
        else{
            this.setEnableCache(enableCache?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEGROUP</B>&nbsp;启用分组，指定数据集合是否启用数据分组能力，启用数据分组时需定义分组参数或配置聚合关系，未指定时为【无】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEDataSetGroupMode} 
     */
    public final static String FIELD_ENABLEGROUP = "enablegroup";

    /**
     * 设置 启用分组，详细说明：{@link #FIELD_ENABLEGROUP}
     * 
     * @param enableGroup
     * 
     */
    @JsonProperty(FIELD_ENABLEGROUP)
    public void setEnableGroup(Integer enableGroup){
        this.set(FIELD_ENABLEGROUP, enableGroup);
    }
    
    /**
     * 获取 启用分组  
     * @return
     */
    @JsonIgnore
    public Integer getEnableGroup(){
        Object objValue = this.get(FIELD_ENABLEGROUP);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用分组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableGroupDirty(){
        if(this.contains(FIELD_ENABLEGROUP)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用分组
     */
    @JsonIgnore
    public void resetEnableGroup(){
        this.reset(FIELD_ENABLEGROUP);
    }

    /**
     * 设置 启用分组，详细说明：{@link #FIELD_ENABLEGROUP}
     * <P>
     * 等同 {@link #setEnableGroup}
     * @param enableGroup
     */
    @JsonIgnore
    public PSDEDataSet enablegroup(Integer enableGroup){
        this.setEnableGroup(enableGroup);
        return this;
    }

     /**
     * 设置 启用分组，详细说明：{@link #FIELD_ENABLEGROUP}
     * <P>
     * 等同 {@link #setEnableGroup}
     * @param enableGroup
     */
    @JsonIgnore
    public PSDEDataSet enablegroup(net.ibizsys.psmodel.core.util.PSModelEnums.DEDataSetGroupMode enableGroup){
        if(enableGroup == null){
            this.setEnableGroup(null);
        }
        else{
            this.setEnableGroup(enableGroup.value);
        }
        return this;
    }

    /**
     * <B>ENABLEORGDR</B>&nbsp;启用机构数据范围，指定数据集进行数据查询时是否附加指定机构范围，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEORGDR = "enableorgdr";

    /**
     * 设置 启用机构数据范围，详细说明：{@link #FIELD_ENABLEORGDR}
     * 
     * @param enableOrgDR
     * 
     */
    @JsonProperty(FIELD_ENABLEORGDR)
    public void setEnableOrgDR(Integer enableOrgDR){
        this.set(FIELD_ENABLEORGDR, enableOrgDR);
    }
    
    /**
     * 获取 启用机构数据范围  
     * @return
     */
    @JsonIgnore
    public Integer getEnableOrgDR(){
        Object objValue = this.get(FIELD_ENABLEORGDR);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用机构数据范围 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableOrgDRDirty(){
        if(this.contains(FIELD_ENABLEORGDR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用机构数据范围
     */
    @JsonIgnore
    public void resetEnableOrgDR(){
        this.reset(FIELD_ENABLEORGDR);
    }

    /**
     * 设置 启用机构数据范围，详细说明：{@link #FIELD_ENABLEORGDR}
     * <P>
     * 等同 {@link #setEnableOrgDR}
     * @param enableOrgDR
     */
    @JsonIgnore
    public PSDEDataSet enableorgdr(Integer enableOrgDR){
        this.setEnableOrgDR(enableOrgDR);
        return this;
    }

     /**
     * 设置 启用机构数据范围，详细说明：{@link #FIELD_ENABLEORGDR}
     * <P>
     * 等同 {@link #setEnableOrgDR}
     * @param enableOrgDR
     */
    @JsonIgnore
    public PSDEDataSet enableorgdr(Boolean enableOrgDR){
        if(enableOrgDR == null){
            this.setEnableOrgDR(null);
        }
        else{
            this.setEnableOrgDR(enableOrgDR?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLESECBC</B>&nbsp;启用部门业务代码，指定数据集进行数据查询时是否附加指定部门业务条线代码，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLESECBC = "enablesecbc";

    /**
     * 设置 启用部门业务代码，详细说明：{@link #FIELD_ENABLESECBC}
     * 
     * @param enableSecBC
     * 
     */
    @JsonProperty(FIELD_ENABLESECBC)
    public void setEnableSecBC(Integer enableSecBC){
        this.set(FIELD_ENABLESECBC, enableSecBC);
    }
    
    /**
     * 获取 启用部门业务代码  
     * @return
     */
    @JsonIgnore
    public Integer getEnableSecBC(){
        Object objValue = this.get(FIELD_ENABLESECBC);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用部门业务代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableSecBCDirty(){
        if(this.contains(FIELD_ENABLESECBC)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用部门业务代码
     */
    @JsonIgnore
    public void resetEnableSecBC(){
        this.reset(FIELD_ENABLESECBC);
    }

    /**
     * 设置 启用部门业务代码，详细说明：{@link #FIELD_ENABLESECBC}
     * <P>
     * 等同 {@link #setEnableSecBC}
     * @param enableSecBC
     */
    @JsonIgnore
    public PSDEDataSet enablesecbc(Integer enableSecBC){
        this.setEnableSecBC(enableSecBC);
        return this;
    }

     /**
     * 设置 启用部门业务代码，详细说明：{@link #FIELD_ENABLESECBC}
     * <P>
     * 等同 {@link #setEnableSecBC}
     * @param enableSecBC
     */
    @JsonIgnore
    public PSDEDataSet enablesecbc(Boolean enableSecBC){
        if(enableSecBC == null){
            this.setEnableSecBC(null);
        }
        else{
            this.setEnableSecBC(enableSecBC?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLESECDR</B>&nbsp;启用部门数据范围，指定数据集进行数据查询时是否附加指定部门范围，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLESECDR = "enablesecdr";

    /**
     * 设置 启用部门数据范围，详细说明：{@link #FIELD_ENABLESECDR}
     * 
     * @param enableSecDR
     * 
     */
    @JsonProperty(FIELD_ENABLESECDR)
    public void setEnableSecDR(Integer enableSecDR){
        this.set(FIELD_ENABLESECDR, enableSecDR);
    }
    
    /**
     * 获取 启用部门数据范围  
     * @return
     */
    @JsonIgnore
    public Integer getEnableSecDR(){
        Object objValue = this.get(FIELD_ENABLESECDR);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用部门数据范围 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableSecDRDirty(){
        if(this.contains(FIELD_ENABLESECDR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用部门数据范围
     */
    @JsonIgnore
    public void resetEnableSecDR(){
        this.reset(FIELD_ENABLESECDR);
    }

    /**
     * 设置 启用部门数据范围，详细说明：{@link #FIELD_ENABLESECDR}
     * <P>
     * 等同 {@link #setEnableSecDR}
     * @param enableSecDR
     */
    @JsonIgnore
    public PSDEDataSet enablesecdr(Integer enableSecDR){
        this.setEnableSecDR(enableSecDR);
        return this;
    }

     /**
     * 设置 启用部门数据范围，详细说明：{@link #FIELD_ENABLESECDR}
     * <P>
     * 等同 {@link #setEnableSecDR}
     * @param enableSecDR
     */
    @JsonIgnore
    public PSDEDataSet enablesecdr(Boolean enableSecDR){
        if(enableSecDR == null){
            this.setEnableSecDR(null);
        }
        else{
            this.setEnableSecDR(enableSecDR?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLETEMPDATA</B>&nbsp;支持临时数据，指定数据集合是否提供临时数据能力，此功能需要实体启用临时数据功能，一般用于关闭临时数据能力，未指定时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLETEMPDATA = "enabletempdata";

    /**
     * 设置 支持临时数据，详细说明：{@link #FIELD_ENABLETEMPDATA}
     * 
     * @param enableTempData
     * 
     */
    @JsonProperty(FIELD_ENABLETEMPDATA)
    public void setEnableTempData(Integer enableTempData){
        this.set(FIELD_ENABLETEMPDATA, enableTempData);
    }
    
    /**
     * 获取 支持临时数据  
     * @return
     */
    @JsonIgnore
    public Integer getEnableTempData(){
        Object objValue = this.get(FIELD_ENABLETEMPDATA);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持临时数据 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableTempDataDirty(){
        if(this.contains(FIELD_ENABLETEMPDATA)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持临时数据
     */
    @JsonIgnore
    public void resetEnableTempData(){
        this.reset(FIELD_ENABLETEMPDATA);
    }

    /**
     * 设置 支持临时数据，详细说明：{@link #FIELD_ENABLETEMPDATA}
     * <P>
     * 等同 {@link #setEnableTempData}
     * @param enableTempData
     */
    @JsonIgnore
    public PSDEDataSet enabletempdata(Integer enableTempData){
        this.setEnableTempData(enableTempData);
        return this;
    }

     /**
     * 设置 支持临时数据，详细说明：{@link #FIELD_ENABLETEMPDATA}
     * <P>
     * 等同 {@link #setEnableTempData}
     * @param enableTempData
     */
    @JsonIgnore
    public PSDEDataSet enabletempdata(Boolean enableTempData){
        if(enableTempData == null){
            this.setEnableTempData(null);
        }
        else{
            this.setEnableTempData(enableTempData?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEUSERDR</B>&nbsp;启用用户数据范围，指定数据集进行数据查询时是否附加当前用户身份条件，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEUSERDR = "enableuserdr";

    /**
     * 设置 启用用户数据范围，详细说明：{@link #FIELD_ENABLEUSERDR}
     * 
     * @param enableUserDR
     * 
     */
    @JsonProperty(FIELD_ENABLEUSERDR)
    public void setEnableUserDR(Integer enableUserDR){
        this.set(FIELD_ENABLEUSERDR, enableUserDR);
    }
    
    /**
     * 获取 启用用户数据范围  
     * @return
     */
    @JsonIgnore
    public Integer getEnableUserDR(){
        Object objValue = this.get(FIELD_ENABLEUSERDR);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用用户数据范围 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableUserDRDirty(){
        if(this.contains(FIELD_ENABLEUSERDR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用用户数据范围
     */
    @JsonIgnore
    public void resetEnableUserDR(){
        this.reset(FIELD_ENABLEUSERDR);
    }

    /**
     * 设置 启用用户数据范围，详细说明：{@link #FIELD_ENABLEUSERDR}
     * <P>
     * 等同 {@link #setEnableUserDR}
     * @param enableUserDR
     */
    @JsonIgnore
    public PSDEDataSet enableuserdr(Integer enableUserDR){
        this.setEnableUserDR(enableUserDR);
        return this;
    }

     /**
     * 设置 启用用户数据范围，详细说明：{@link #FIELD_ENABLEUSERDR}
     * <P>
     * 等同 {@link #setEnableUserDR}
     * @param enableUserDR
     */
    @JsonIgnore
    public PSDEDataSet enableuserdr(Boolean enableUserDR){
        if(enableUserDR == null){
            this.setEnableUserDR(null);
        }
        else{
            this.setEnableUserDR(enableUserDR?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>EXTENDMODE</B>&nbsp;扩展模式，指定实体数据集的扩展模式，此配置针对子系统实体，标记是否要对原功能进行扩展。未定义时为【无扩展】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEExtendMode} 
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
    public PSDEDataSet extendmode(Integer extendMode){
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
    public PSDEDataSet extendmode(net.ibizsys.psmodel.core.util.PSModelEnums.DEExtendMode extendMode){
        if(extendMode == null){
            this.setExtendMode(null);
        }
        else{
            this.setExtendMode(extendMode.value);
        }
        return this;
    }

    /**
     * <B>FILTERMODEL</B>&nbsp;过滤器模型
     */
    public final static String FIELD_FILTERMODEL = "filtermodel";

    /**
     * 设置 过滤器模型
     * 
     * @param filterModel
     * 
     */
    @JsonProperty(FIELD_FILTERMODEL)
    public void setFilterModel(String filterModel){
        this.set(FIELD_FILTERMODEL, filterModel);
    }
    
    /**
     * 获取 过滤器模型  
     * @return
     */
    @JsonIgnore
    public String getFilterModel(){
        Object objValue = this.get(FIELD_FILTERMODEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 过滤器模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFilterModelDirty(){
        if(this.contains(FIELD_FILTERMODEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 过滤器模型
     */
    @JsonIgnore
    public void resetFilterModel(){
        this.reset(FIELD_FILTERMODEL);
    }

    /**
     * 设置 过滤器模型
     * <P>
     * 等同 {@link #setFilterModel}
     * @param filterModel
     */
    @JsonIgnore
    public PSDEDataSet filtermodel(String filterModel){
        this.setFilterModel(filterModel);
        return this;
    }

    /**
     * <B>FINISHFLAG</B>&nbsp;是否完成
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSTASKID}
     */
    public final static String FIELD_FINISHFLAG = "finishflag";

    /**
     * 设置 是否完成
     * 
     * @param finishFlag
     * 
     */
    @JsonProperty(FIELD_FINISHFLAG)
    public void setFinishFlag(Integer finishFlag){
        this.set(FIELD_FINISHFLAG, finishFlag);
    }
    
    /**
     * 获取 是否完成  
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
     * 判断 是否完成 是否指定值，包括空值
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
     * 重置 是否完成
     */
    @JsonIgnore
    public void resetFinishFlag(){
        this.reset(FIELD_FINISHFLAG);
    }

    /**
     * 设置 是否完成
     * <P>
     * 等同 {@link #setFinishFlag}
     * @param finishFlag
     */
    @JsonIgnore
    public PSDEDataSet finishflag(Integer finishFlag){
        this.setFinishFlag(finishFlag);
        return this;
    }

    /**
     * <B>INPSDEFGROUPID</B>&nbsp;输入属性集
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEFGroup} 
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
    public PSDEDataSet inpsdefgroupid(String inPSDEFGroupId){
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
    public PSDEDataSet inpsdefgroupid(PSDEFGroup pSDEFGroup){
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
    public PSDEDataSet inpsdefgroupname(String inPSDEFGroupName){
        this.setInPSDEFGroupName(inPSDEFGroupName);
        return this;
    }

    /**
     * <B>INPSDESAMPLEDATAID</B>&nbsp;输入示例数据
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDESampleData} 
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
    public PSDEDataSet inpsdesampledataid(String inPSDESampleDataId){
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
    public PSDEDataSet inpsdesampledataid(PSDESampleData pSDESampleData){
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
    public PSDEDataSet inpsdesampledataname(String inPSDESampleDataName){
        this.setInPSDESampleDataName(inPSDESampleDataName);
        return this;
    }

    /**
     * <B>INPSSYSDYNAMODELID</B>&nbsp;输入动态模型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDynaModel} 
     */
    public final static String FIELD_INPSSYSDYNAMODELID = "inpssysdynamodelid";

    /**
     * 设置 输入动态模型
     * 
     * @param inPSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_INPSSYSDYNAMODELID)
    public void setInPSSysDynaModelId(String inPSSysDynaModelId){
        this.set(FIELD_INPSSYSDYNAMODELID, inPSSysDynaModelId);
    }
    
    /**
     * 获取 输入动态模型  
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
     * 判断 输入动态模型 是否指定值，包括空值
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
     * 重置 输入动态模型
     */
    @JsonIgnore
    public void resetInPSSysDynaModelId(){
        this.reset(FIELD_INPSSYSDYNAMODELID);
    }

    /**
     * 设置 输入动态模型
     * <P>
     * 等同 {@link #setInPSSysDynaModelId}
     * @param inPSSysDynaModelId
     */
    @JsonIgnore
    public PSDEDataSet inpssysdynamodelid(String inPSSysDynaModelId){
        this.setInPSSysDynaModelId(inPSSysDynaModelId);
        return this;
    }

    /**
     * 设置 输入动态模型，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setInPSSysDynaModelId}
     * @param pSSysDynaModel 引用对象
     */
    @JsonIgnore
    public PSDEDataSet inpssysdynamodelid(PSSysDynaModel pSSysDynaModel){
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
     * <B>INPSSYSDYNAMODELNAME</B>&nbsp;输入动态模型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_INPSSYSDYNAMODELID}
     */
    public final static String FIELD_INPSSYSDYNAMODELNAME = "inpssysdynamodelname";

    /**
     * 设置 输入动态模型
     * 
     * @param inPSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_INPSSYSDYNAMODELNAME)
    public void setInPSSysDynaModelName(String inPSSysDynaModelName){
        this.set(FIELD_INPSSYSDYNAMODELNAME, inPSSysDynaModelName);
    }
    
    /**
     * 获取 输入动态模型  
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
     * 判断 输入动态模型 是否指定值，包括空值
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
     * 重置 输入动态模型
     */
    @JsonIgnore
    public void resetInPSSysDynaModelName(){
        this.reset(FIELD_INPSSYSDYNAMODELNAME);
    }

    /**
     * 设置 输入动态模型
     * <P>
     * 等同 {@link #setInPSSysDynaModelName}
     * @param inPSSysDynaModelName
     */
    @JsonIgnore
    public PSDEDataSet inpssysdynamodelname(String inPSSysDynaModelName){
        this.setInPSSysDynaModelName(inPSSysDynaModelName);
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;中文名称
     * <P>
     * 字符串：最大长度 60
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
    public PSDEDataSet logicname(String logicName){
        this.setLogicName(logicName);
        return this;
    }

    /**
     * <B>MAJORPSDEFID</B>&nbsp;主排序属性，指定数据集的默认主排序属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_MAJORPSDEFID = "majorpsdefid";

    /**
     * 设置 主排序属性，详细说明：{@link #FIELD_MAJORPSDEFID}
     * 
     * @param majorPSDEFId
     * 
     */
    @JsonProperty(FIELD_MAJORPSDEFID)
    public void setMajorPSDEFId(String majorPSDEFId){
        this.set(FIELD_MAJORPSDEFID, majorPSDEFId);
    }
    
    /**
     * 获取 主排序属性  
     * @return
     */
    @JsonIgnore
    public String getMajorPSDEFId(){
        Object objValue = this.get(FIELD_MAJORPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主排序属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMajorPSDEFIdDirty(){
        if(this.contains(FIELD_MAJORPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主排序属性
     */
    @JsonIgnore
    public void resetMajorPSDEFId(){
        this.reset(FIELD_MAJORPSDEFID);
    }

    /**
     * 设置 主排序属性，详细说明：{@link #FIELD_MAJORPSDEFID}
     * <P>
     * 等同 {@link #setMajorPSDEFId}
     * @param majorPSDEFId
     */
    @JsonIgnore
    public PSDEDataSet majorpsdefid(String majorPSDEFId){
        this.setMajorPSDEFId(majorPSDEFId);
        return this;
    }

    /**
     * 设置 主排序属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMajorPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDEDataSet majorpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setMajorPSDEFId(null);
            this.setMajorPSDEFName(null);
        }
        else{
            this.setMajorPSDEFId(pSDEField.getPSDEFieldId());
            this.setMajorPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>MAJORPSDEFNAME</B>&nbsp;主排序属性，指定数据集的默认主排序属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MAJORPSDEFID}
     */
    public final static String FIELD_MAJORPSDEFNAME = "majorpsdefname";

    /**
     * 设置 主排序属性，详细说明：{@link #FIELD_MAJORPSDEFNAME}
     * 
     * @param majorPSDEFName
     * 
     */
    @JsonProperty(FIELD_MAJORPSDEFNAME)
    public void setMajorPSDEFName(String majorPSDEFName){
        this.set(FIELD_MAJORPSDEFNAME, majorPSDEFName);
    }
    
    /**
     * 获取 主排序属性  
     * @return
     */
    @JsonIgnore
    public String getMajorPSDEFName(){
        Object objValue = this.get(FIELD_MAJORPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主排序属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMajorPSDEFNameDirty(){
        if(this.contains(FIELD_MAJORPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主排序属性
     */
    @JsonIgnore
    public void resetMajorPSDEFName(){
        this.reset(FIELD_MAJORPSDEFNAME);
    }

    /**
     * 设置 主排序属性，详细说明：{@link #FIELD_MAJORPSDEFNAME}
     * <P>
     * 等同 {@link #setMajorPSDEFName}
     * @param majorPSDEFName
     */
    @JsonIgnore
    public PSDEDataSet majorpsdefname(String majorPSDEFName){
        this.setMajorPSDEFName(majorPSDEFName);
        return this;
    }

    /**
     * <B>MAJORSORTDIR</B>&nbsp;主排序方向，指定数据集的默认主排序方向，需要已指定主排序属性
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SortDir} 
     */
    public final static String FIELD_MAJORSORTDIR = "majorsortdir";

    /**
     * 设置 主排序方向，详细说明：{@link #FIELD_MAJORSORTDIR}
     * 
     * @param majorSortDir
     * 
     */
    @JsonProperty(FIELD_MAJORSORTDIR)
    public void setMajorSortDir(String majorSortDir){
        this.set(FIELD_MAJORSORTDIR, majorSortDir);
    }
    
    /**
     * 获取 主排序方向  
     * @return
     */
    @JsonIgnore
    public String getMajorSortDir(){
        Object objValue = this.get(FIELD_MAJORSORTDIR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主排序方向 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMajorSortDirDirty(){
        if(this.contains(FIELD_MAJORSORTDIR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主排序方向
     */
    @JsonIgnore
    public void resetMajorSortDir(){
        this.reset(FIELD_MAJORSORTDIR);
    }

    /**
     * 设置 主排序方向，详细说明：{@link #FIELD_MAJORSORTDIR}
     * <P>
     * 等同 {@link #setMajorSortDir}
     * @param majorSortDir
     */
    @JsonIgnore
    public PSDEDataSet majorsortdir(String majorSortDir){
        this.setMajorSortDir(majorSortDir);
        return this;
    }

     /**
     * 设置 主排序方向，详细说明：{@link #FIELD_MAJORSORTDIR}
     * <P>
     * 等同 {@link #setMajorSortDir}
     * @param majorSortDir
     */
    @JsonIgnore
    public PSDEDataSet majorsortdir(net.ibizsys.psmodel.core.util.PSModelEnums.SortDir majorSortDir){
        if(majorSortDir == null){
            this.setMajorSortDir(null);
        }
        else{
            this.setMajorSortDir(majorSortDir.value);
        }
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
    public PSDEDataSet memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MINORPSDEFID</B>&nbsp;从排序属性，指定数据集的默认从排序属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_MINORPSDEFID = "minorpsdefid";

    /**
     * 设置 从排序属性，详细说明：{@link #FIELD_MINORPSDEFID}
     * 
     * @param minorPSDEFId
     * 
     */
    @JsonProperty(FIELD_MINORPSDEFID)
    public void setMinorPSDEFId(String minorPSDEFId){
        this.set(FIELD_MINORPSDEFID, minorPSDEFId);
    }
    
    /**
     * 获取 从排序属性  
     * @return
     */
    @JsonIgnore
    public String getMinorPSDEFId(){
        Object objValue = this.get(FIELD_MINORPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 从排序属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinorPSDEFIdDirty(){
        if(this.contains(FIELD_MINORPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 从排序属性
     */
    @JsonIgnore
    public void resetMinorPSDEFId(){
        this.reset(FIELD_MINORPSDEFID);
    }

    /**
     * 设置 从排序属性，详细说明：{@link #FIELD_MINORPSDEFID}
     * <P>
     * 等同 {@link #setMinorPSDEFId}
     * @param minorPSDEFId
     */
    @JsonIgnore
    public PSDEDataSet minorpsdefid(String minorPSDEFId){
        this.setMinorPSDEFId(minorPSDEFId);
        return this;
    }

    /**
     * 设置 从排序属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMinorPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDEDataSet minorpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setMinorPSDEFId(null);
            this.setMinorPSDEFName(null);
        }
        else{
            this.setMinorPSDEFId(pSDEField.getPSDEFieldId());
            this.setMinorPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>MINORPSDEFNAME</B>&nbsp;从排序属性，指定数据集的默认从排序属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MINORPSDEFID}
     */
    public final static String FIELD_MINORPSDEFNAME = "minorpsdefname";

    /**
     * 设置 从排序属性，详细说明：{@link #FIELD_MINORPSDEFNAME}
     * 
     * @param minorPSDEFName
     * 
     */
    @JsonProperty(FIELD_MINORPSDEFNAME)
    public void setMinorPSDEFName(String minorPSDEFName){
        this.set(FIELD_MINORPSDEFNAME, minorPSDEFName);
    }
    
    /**
     * 获取 从排序属性  
     * @return
     */
    @JsonIgnore
    public String getMinorPSDEFName(){
        Object objValue = this.get(FIELD_MINORPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 从排序属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinorPSDEFNameDirty(){
        if(this.contains(FIELD_MINORPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 从排序属性
     */
    @JsonIgnore
    public void resetMinorPSDEFName(){
        this.reset(FIELD_MINORPSDEFNAME);
    }

    /**
     * 设置 从排序属性，详细说明：{@link #FIELD_MINORPSDEFNAME}
     * <P>
     * 等同 {@link #setMinorPSDEFName}
     * @param minorPSDEFName
     */
    @JsonIgnore
    public PSDEDataSet minorpsdefname(String minorPSDEFName){
        this.setMinorPSDEFName(minorPSDEFName);
        return this;
    }

    /**
     * <B>MINORSORTDIR</B>&nbsp;从排序方向，指定数据集的默认从排序方向，需要已指定从排序属性
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SortDir} 
     */
    public final static String FIELD_MINORSORTDIR = "minorsortdir";

    /**
     * 设置 从排序方向，详细说明：{@link #FIELD_MINORSORTDIR}
     * 
     * @param minorSortDir
     * 
     */
    @JsonProperty(FIELD_MINORSORTDIR)
    public void setMinorSortDir(String minorSortDir){
        this.set(FIELD_MINORSORTDIR, minorSortDir);
    }
    
    /**
     * 获取 从排序方向  
     * @return
     */
    @JsonIgnore
    public String getMinorSortDir(){
        Object objValue = this.get(FIELD_MINORSORTDIR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 从排序方向 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinorSortDirDirty(){
        if(this.contains(FIELD_MINORSORTDIR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 从排序方向
     */
    @JsonIgnore
    public void resetMinorSortDir(){
        this.reset(FIELD_MINORSORTDIR);
    }

    /**
     * 设置 从排序方向，详细说明：{@link #FIELD_MINORSORTDIR}
     * <P>
     * 等同 {@link #setMinorSortDir}
     * @param minorSortDir
     */
    @JsonIgnore
    public PSDEDataSet minorsortdir(String minorSortDir){
        this.setMinorSortDir(minorSortDir);
        return this;
    }

     /**
     * 设置 从排序方向，详细说明：{@link #FIELD_MINORSORTDIR}
     * <P>
     * 等同 {@link #setMinorSortDir}
     * @param minorSortDir
     */
    @JsonIgnore
    public PSDEDataSet minorsortdir(net.ibizsys.psmodel.core.util.PSModelEnums.SortDir minorSortDir){
        if(minorSortDir == null){
            this.setMinorSortDir(null);
        }
        else{
            this.setMinorSortDir(minorSortDir.value);
        }
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
    public PSDEDataSet ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>ORGDR</B>&nbsp;机构数据范围，结果集启用机构数据范围功能，指定机构的数据范围
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.OrgScope} 
     */
    public final static String FIELD_ORGDR = "orgdr";

    /**
     * 设置 机构数据范围，详细说明：{@link #FIELD_ORGDR}
     * 
     * @param orgDR
     * 
     */
    @JsonProperty(FIELD_ORGDR)
    public void setOrgDR(Integer orgDR){
        this.set(FIELD_ORGDR, orgDR);
    }
    
    /**
     * 获取 机构数据范围  
     * @return
     */
    @JsonIgnore
    public Integer getOrgDR(){
        Object objValue = this.get(FIELD_ORGDR);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 机构数据范围 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOrgDRDirty(){
        if(this.contains(FIELD_ORGDR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 机构数据范围
     */
    @JsonIgnore
    public void resetOrgDR(){
        this.reset(FIELD_ORGDR);
    }

    /**
     * 设置 机构数据范围，详细说明：{@link #FIELD_ORGDR}
     * <P>
     * 等同 {@link #setOrgDR}
     * @param orgDR
     */
    @JsonIgnore
    public PSDEDataSet orgdr(Integer orgDR){
        this.setOrgDR(orgDR);
        return this;
    }

     /**
     * 设置 机构数据范围，详细说明：{@link #FIELD_ORGDR}
     * <P>
     * 等同 {@link #setOrgDR}
     * @param orgDR
     */
    @JsonIgnore
    public PSDEDataSet orgdr(net.ibizsys.psmodel.core.util.PSModelEnums.OrgScope[] orgDR){
        if(orgDR == null || orgDR.length == 0){
            this.setOrgDR(null);
        }
        else{
            int _value = 0;
            for(net.ibizsys.psmodel.core.util.PSModelEnums.OrgScope _item : orgDR){
                _value |= _item.value;
            }
            this.setOrgDR(_value);
        }
        return this;
    }

    /**
     * <B>OUTPSDEFGROUPID</B>&nbsp;输出属性集
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEFGroup} 
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
    public PSDEDataSet outpsdefgroupid(String outPSDEFGroupId){
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
    public PSDEDataSet outpsdefgroupid(PSDEFGroup pSDEFGroup){
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
    public PSDEDataSet outpsdefgroupname(String outPSDEFGroupName){
        this.setOutPSDEFGroupName(outPSDEFGroupName);
        return this;
    }

    /**
     * <B>OUTPSDESAMPLEDATAID</B>&nbsp;输出示例数据
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDESampleData} 
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
    public PSDEDataSet outpsdesampledataid(String outPSDESampleDataId){
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
    public PSDEDataSet outpsdesampledataid(PSDESampleData pSDESampleData){
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
    public PSDEDataSet outpsdesampledataname(String outPSDESampleDataName){
        this.setOutPSDESampleDataName(outPSDESampleDataName);
        return this;
    }

    /**
     * <B>PAGESIZE</B>&nbsp;默认分页大小，指定数据集的默认分页大小，未指定时为【-1】
     */
    public final static String FIELD_PAGESIZE = "pagesize";

    /**
     * 设置 默认分页大小，详细说明：{@link #FIELD_PAGESIZE}
     * 
     * @param pageSize
     * 
     */
    @JsonProperty(FIELD_PAGESIZE)
    public void setPageSize(Integer pageSize){
        this.set(FIELD_PAGESIZE, pageSize);
    }
    
    /**
     * 获取 默认分页大小  
     * @return
     */
    @JsonIgnore
    public Integer getPageSize(){
        Object objValue = this.get(FIELD_PAGESIZE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认分页大小 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPageSizeDirty(){
        if(this.contains(FIELD_PAGESIZE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认分页大小
     */
    @JsonIgnore
    public void resetPageSize(){
        this.reset(FIELD_PAGESIZE);
    }

    /**
     * 设置 默认分页大小，详细说明：{@link #FIELD_PAGESIZE}
     * <P>
     * 等同 {@link #setPageSize}
     * @param pageSize
     */
    @JsonIgnore
    public PSDEDataSet pagesize(Integer pageSize){
        this.setPageSize(pageSize);
        return this;
    }

    /**
     * <B>PARAMTYPE</B>&nbsp;参数类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEDataSetParamMode} 
     */
    public final static String FIELD_PARAMTYPE = "paramtype";

    /**
     * 设置 参数类型
     * 
     * @param paramType
     * 
     */
    @JsonProperty(FIELD_PARAMTYPE)
    public void setParamType(Integer paramType){
        this.set(FIELD_PARAMTYPE, paramType);
    }
    
    /**
     * 获取 参数类型  
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
     * 判断 参数类型 是否指定值，包括空值
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
     * 重置 参数类型
     */
    @JsonIgnore
    public void resetParamType(){
        this.reset(FIELD_PARAMTYPE);
    }

    /**
     * 设置 参数类型
     * <P>
     * 等同 {@link #setParamType}
     * @param paramType
     */
    @JsonIgnore
    public PSDEDataSet paramtype(Integer paramType){
        this.setParamType(paramType);
        return this;
    }

     /**
     * 设置 参数类型
     * <P>
     * 等同 {@link #setParamType}
     * @param paramType
     */
    @JsonIgnore
    public PSDEDataSet paramtype(net.ibizsys.psmodel.core.util.PSModelEnums.DEDataSetParamMode paramType){
        if(paramType == null){
            this.setParamType(null);
        }
        else{
            this.setParamType(paramType.value);
        }
        return this;
    }

    /**
     * <B>POTIME</B>&nbsp;性能优化时间，指定数据集合性能优化检测时长（毫秒），超过此时长将需要进行日志等处理。未指定时为【-1】，使用默认检测时长
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
    public PSDEDataSet potime(Integer pOTime){
        this.setPOTime(pOTime);
        return this;
    }

    /**
     * <B>PREDEFINEDTYPEPARAM</B>&nbsp;预定义类型参数
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PREDEFINEDTYPEPARAM = "predefinedtypeparam";

    /**
     * 设置 预定义类型参数
     * 
     * @param predefinedTypeParam
     * 
     */
    @JsonProperty(FIELD_PREDEFINEDTYPEPARAM)
    public void setPredefinedTypeParam(String predefinedTypeParam){
        this.set(FIELD_PREDEFINEDTYPEPARAM, predefinedTypeParam);
    }
    
    /**
     * 获取 预定义类型参数  
     * @return
     */
    @JsonIgnore
    public String getPredefinedTypeParam(){
        Object objValue = this.get(FIELD_PREDEFINEDTYPEPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预定义类型参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPredefinedTypeParamDirty(){
        if(this.contains(FIELD_PREDEFINEDTYPEPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预定义类型参数
     */
    @JsonIgnore
    public void resetPredefinedTypeParam(){
        this.reset(FIELD_PREDEFINEDTYPEPARAM);
    }

    /**
     * 设置 预定义类型参数
     * <P>
     * 等同 {@link #setPredefinedTypeParam}
     * @param predefinedTypeParam
     */
    @JsonIgnore
    public PSDEDataSet predefinedtypeparam(String predefinedTypeParam){
        this.setPredefinedTypeParam(predefinedTypeParam);
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
    public PSDEDataSet predefinedtypetext(String predefinedTypeText){
        this.setPredefinedTypeText(predefinedTypeText);
        return this;
    }

    /**
     * <B>PREDEFINEDTYPE</B>&nbsp;数据集类型，指定数据集合的预定义类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEDataSetPredefinedType} 
     */
    public final static String FIELD_PREDEFINEDTYPE = "predefinedtype";

    /**
     * 设置 数据集类型，详细说明：{@link #FIELD_PREDEFINEDTYPE}
     * 
     * @param predefinedType
     * 
     */
    @JsonProperty(FIELD_PREDEFINEDTYPE)
    public void setPredefinedType(String predefinedType){
        this.set(FIELD_PREDEFINEDTYPE, predefinedType);
        //属性名称与代码标识不一致，设置属性名称
        this.set("predefinetype", predefinedType);
    }
    
    /**
     * 获取 数据集类型  
     * @return
     */
    @JsonIgnore
    public String getPredefinedType(){
        Object objValue = this.get(FIELD_PREDEFINEDTYPE);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("predefinetype");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 数据集类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPredefinedTypeDirty(){
        if(this.contains(FIELD_PREDEFINEDTYPE)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("predefinetype")){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据集类型
     */
    @JsonIgnore
    public void resetPredefinedType(){
        this.reset(FIELD_PREDEFINEDTYPE);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("predefinetype");
    }

    /**
     * 设置 数据集类型，详细说明：{@link #FIELD_PREDEFINEDTYPE}
     * <P>
     * 等同 {@link #setPredefinedType}
     * @param predefinedType
     */
    @JsonIgnore
    public PSDEDataSet predefinedtype(String predefinedType){
        this.setPredefinedType(predefinedType);
        return this;
    }

     /**
     * 设置 数据集类型，详细说明：{@link #FIELD_PREDEFINEDTYPE}
     * <P>
     * 等同 {@link #setPredefinedType}
     * @param predefinedType
     */
    @JsonIgnore
    public PSDEDataSet predefinedtype(net.ibizsys.psmodel.core.util.PSModelEnums.DEDataSetPredefinedType predefinedType){
        if(predefinedType == null){
            this.setPredefinedType(null);
        }
        else{
            this.setPredefinedType(predefinedType.value);
        }
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPredefineType(){
        return this.getPredefinedType();
    }

    @JsonIgnore
    @Deprecated        
    public void setPredefineType(String predefineType){
        this.setPredefinedType(predefineType);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPredefineTypeDirty(){
        return this.isPredefinedTypeDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPredefineType(){
        this.resetPredefinedType();
    }

    /**
     * <B>PSCODELISTID</B>&nbsp;系统代码表，数据集合预定义类型为【代码表】指定的代码表对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSCodeList} 
     */
    public final static String FIELD_PSCODELISTID = "pscodelistid";

    /**
     * 设置 系统代码表，详细说明：{@link #FIELD_PSCODELISTID}
     * 
     * @param pSCodeListId
     * 
     */
    @JsonProperty(FIELD_PSCODELISTID)
    public void setPSCodeListId(String pSCodeListId){
        this.set(FIELD_PSCODELISTID, pSCodeListId);
    }
    
    /**
     * 获取 系统代码表  
     * @return
     */
    @JsonIgnore
    public String getPSCodeListId(){
        Object objValue = this.get(FIELD_PSCODELISTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统代码表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCodeListIdDirty(){
        if(this.contains(FIELD_PSCODELISTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统代码表
     */
    @JsonIgnore
    public void resetPSCodeListId(){
        this.reset(FIELD_PSCODELISTID);
    }

    /**
     * 设置 系统代码表，详细说明：{@link #FIELD_PSCODELISTID}
     * <P>
     * 等同 {@link #setPSCodeListId}
     * @param pSCodeListId
     */
    @JsonIgnore
    public PSDEDataSet pscodelistid(String pSCodeListId){
        this.setPSCodeListId(pSCodeListId);
        return this;
    }

    /**
     * 设置 系统代码表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSCodeListId}
     * @param pSCodeList 引用对象
     */
    @JsonIgnore
    public PSDEDataSet pscodelistid(PSCodeList pSCodeList){
        if(pSCodeList == null){
            this.setPSCodeListId(null);
            this.setPSCodeListName(null);
        }
        else{
            this.setPSCodeListId(pSCodeList.getPSCodeListId());
            this.setPSCodeListName(pSCodeList.getPSCodeListName());
        }
        return this;
    }

    /**
     * <B>PSCODELISTNAME</B>&nbsp;系统代码表，数据集合预定义类型为【代码表】指定的代码表对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCODELISTID}
     */
    public final static String FIELD_PSCODELISTNAME = "pscodelistname";

    /**
     * 设置 系统代码表，详细说明：{@link #FIELD_PSCODELISTNAME}
     * 
     * @param pSCodeListName
     * 
     */
    @JsonProperty(FIELD_PSCODELISTNAME)
    public void setPSCodeListName(String pSCodeListName){
        this.set(FIELD_PSCODELISTNAME, pSCodeListName);
    }
    
    /**
     * 获取 系统代码表  
     * @return
     */
    @JsonIgnore
    public String getPSCodeListName(){
        Object objValue = this.get(FIELD_PSCODELISTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统代码表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCodeListNameDirty(){
        if(this.contains(FIELD_PSCODELISTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统代码表
     */
    @JsonIgnore
    public void resetPSCodeListName(){
        this.reset(FIELD_PSCODELISTNAME);
    }

    /**
     * 设置 系统代码表，详细说明：{@link #FIELD_PSCODELISTNAME}
     * <P>
     * 等同 {@link #setPSCodeListName}
     * @param pSCodeListName
     */
    @JsonIgnore
    public PSDEDataSet pscodelistname(String pSCodeListName){
        this.setPSCodeListName(pSCodeListName);
        return this;
    }

    /**
     * <B>PSDEDATAIMPID</B>&nbsp;实体数据导入
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataImp} 
     */
    public final static String FIELD_PSDEDATAIMPID = "psdedataimpid";

    /**
     * 设置 实体数据导入
     * 
     * @param pSDEDataImpId
     * 
     */
    @JsonProperty(FIELD_PSDEDATAIMPID)
    public void setPSDEDataImpId(String pSDEDataImpId){
        this.set(FIELD_PSDEDATAIMPID, pSDEDataImpId);
    }
    
    /**
     * 获取 实体数据导入  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataImpId(){
        Object objValue = this.get(FIELD_PSDEDATAIMPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据导入 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataImpIdDirty(){
        if(this.contains(FIELD_PSDEDATAIMPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据导入
     */
    @JsonIgnore
    public void resetPSDEDataImpId(){
        this.reset(FIELD_PSDEDATAIMPID);
    }

    /**
     * 设置 实体数据导入
     * <P>
     * 等同 {@link #setPSDEDataImpId}
     * @param pSDEDataImpId
     */
    @JsonIgnore
    public PSDEDataSet psdedataimpid(String pSDEDataImpId){
        this.setPSDEDataImpId(pSDEDataImpId);
        return this;
    }

    /**
     * 设置 实体数据导入，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDataImpId}
     * @param pSDEDataImp 引用对象
     */
    @JsonIgnore
    public PSDEDataSet psdedataimpid(PSDEDataImp pSDEDataImp){
        if(pSDEDataImp == null){
            this.setPSDEDataImpId(null);
            this.setPSDEDataImpName(null);
        }
        else{
            this.setPSDEDataImpId(pSDEDataImp.getPSDEDataImpId());
            this.setPSDEDataImpName(pSDEDataImp.getPSDEDataImpName());
        }
        return this;
    }

    /**
     * <B>PSDEDATAIMPNAME</B>&nbsp;实体数据导入
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDATAIMPID}
     */
    public final static String FIELD_PSDEDATAIMPNAME = "psdedataimpname";

    /**
     * 设置 实体数据导入
     * 
     * @param pSDEDataImpName
     * 
     */
    @JsonProperty(FIELD_PSDEDATAIMPNAME)
    public void setPSDEDataImpName(String pSDEDataImpName){
        this.set(FIELD_PSDEDATAIMPNAME, pSDEDataImpName);
    }
    
    /**
     * 获取 实体数据导入  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataImpName(){
        Object objValue = this.get(FIELD_PSDEDATAIMPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据导入 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataImpNameDirty(){
        if(this.contains(FIELD_PSDEDATAIMPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据导入
     */
    @JsonIgnore
    public void resetPSDEDataImpName(){
        this.reset(FIELD_PSDEDATAIMPNAME);
    }

    /**
     * 设置 实体数据导入
     * <P>
     * 等同 {@link #setPSDEDataImpName}
     * @param pSDEDataImpName
     */
    @JsonIgnore
    public PSDEDataSet psdedataimpname(String pSDEDataImpName){
        this.setPSDEDataImpName(pSDEDataImpName);
        return this;
    }

    /**
     * <B>PSDEDATASETID</B>&nbsp;实体数据集合标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEDATASETID = "psdedatasetid";

    /**
     * 设置 实体数据集合标识
     * 
     * @param pSDEDataSetId
     * 
     */
    @JsonProperty(FIELD_PSDEDATASETID)
    public void setPSDEDataSetId(String pSDEDataSetId){
        this.set(FIELD_PSDEDATASETID, pSDEDataSetId);
    }
    
    /**
     * 获取 实体数据集合标识  
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
     * 判断 实体数据集合标识 是否指定值，包括空值
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
     * 重置 实体数据集合标识
     */
    @JsonIgnore
    public void resetPSDEDataSetId(){
        this.reset(FIELD_PSDEDATASETID);
    }

    /**
     * 设置 实体数据集合标识
     * <P>
     * 等同 {@link #setPSDEDataSetId}
     * @param pSDEDataSetId
     */
    @JsonIgnore
    public PSDEDataSet psdedatasetid(String pSDEDataSetId){
        this.setPSDEDataSetId(pSDEDataSetId);
        return this;
    }

    /**
     * <B>PSDEDATASETNAME</B>&nbsp;数据集合标识，指定数据集合的标识，需要在所在的实体中具有唯一性
     * <P>
     * 字符串：最大长度 200，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSDEDATASETNAME = "psdedatasetname";

    /**
     * 设置 数据集合标识，详细说明：{@link #FIELD_PSDEDATASETNAME}
     * 
     * @param pSDEDataSetName
     * 
     */
    @JsonProperty(FIELD_PSDEDATASETNAME)
    public void setPSDEDataSetName(String pSDEDataSetName){
        this.set(FIELD_PSDEDATASETNAME, pSDEDataSetName);
    }
    
    /**
     * 获取 数据集合标识  
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
     * 判断 数据集合标识 是否指定值，包括空值
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
     * 重置 数据集合标识
     */
    @JsonIgnore
    public void resetPSDEDataSetName(){
        this.reset(FIELD_PSDEDATASETNAME);
    }

    /**
     * 设置 数据集合标识，详细说明：{@link #FIELD_PSDEDATASETNAME}
     * <P>
     * 等同 {@link #setPSDEDataSetName}
     * @param pSDEDataSetName
     */
    @JsonIgnore
    public PSDEDataSet psdedatasetname(String pSDEDataSetName){
        this.setPSDEDataSetName(pSDEDataSetName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEDataSetName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEDataSetName(strName);
    }

    @JsonIgnore
    public PSDEDataSet name(String strName){
        this.setPSDEDataSetName(strName);
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
    public PSDEDataSet psdeid(String pSDEId){
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
    public PSDEDataSet psdeid(PSDataEntity pSDataEntity){
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
     * <B>PSDELOGICID</B>&nbsp;实体逻辑
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDELogic} 
     */
    public final static String FIELD_PSDELOGICID = "psdelogicid";

    /**
     * 设置 实体逻辑
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
     * 设置 实体逻辑
     * <P>
     * 等同 {@link #setPSDELogicId}
     * @param pSDELogicId
     */
    @JsonIgnore
    public PSDEDataSet psdelogicid(String pSDELogicId){
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
    public PSDEDataSet psdelogicid(PSDELogic pSDELogic){
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
     * <B>PSDELOGICNAME</B>&nbsp;实体逻辑
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDELOGICID}
     */
    public final static String FIELD_PSDELOGICNAME = "psdelogicname";

    /**
     * 设置 实体逻辑
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
     * 设置 实体逻辑
     * <P>
     * 等同 {@link #setPSDELogicName}
     * @param pSDELogicName
     */
    @JsonIgnore
    public PSDEDataSet psdelogicname(String pSDELogicName){
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
    public PSDEDataSet psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSDEOPPRIVID</B>&nbsp;访问操作标识，指定访问该数据集合默认使用的实体操作标识，未指定时为【READ】
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEOPPriv} 
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
    public PSDEDataSet psdeopprivid(String pSDEOPPrivId){
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
    public PSDEDataSet psdeopprivid(PSDEOPPriv pSDEOPPriv){
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
     * <B>PSDEOPPRIVNAME</B>&nbsp;访问操作标识，指定访问该数据集合默认使用的实体操作标识，未指定时为【READ】
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
    public PSDEDataSet psdeopprivname(String pSDEOPPrivName){
        this.setPSDEOPPrivName(pSDEOPPrivName);
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
    public PSDEDataSet pssubsyssadeid(String pSSubSysSADEId){
        this.setPSSubSysSADEId(pSSubSysSADEId);
        return this;
    }

    /**
     * <B>PSSUBSYSSADETAILID</B>&nbsp;外部接口实体方法，实体支持外部接口持久化时指定结果集绑定的接口实体方法，未指定时引擎将通过代码名称尝试获取对应的接口实体方法
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSubSysSADetail} 
     */
    public final static String FIELD_PSSUBSYSSADETAILID = "pssubsyssadetailid";

    /**
     * 设置 外部接口实体方法，详细说明：{@link #FIELD_PSSUBSYSSADETAILID}
     * 
     * @param pSSubSysSADetailId
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSADETAILID)
    public void setPSSubSysSADetailId(String pSSubSysSADetailId){
        this.set(FIELD_PSSUBSYSSADETAILID, pSSubSysSADetailId);
    }
    
    /**
     * 获取 外部接口实体方法  
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
     * 判断 外部接口实体方法 是否指定值，包括空值
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
     * 重置 外部接口实体方法
     */
    @JsonIgnore
    public void resetPSSubSysSADetailId(){
        this.reset(FIELD_PSSUBSYSSADETAILID);
    }

    /**
     * 设置 外部接口实体方法，详细说明：{@link #FIELD_PSSUBSYSSADETAILID}
     * <P>
     * 等同 {@link #setPSSubSysSADetailId}
     * @param pSSubSysSADetailId
     */
    @JsonIgnore
    public PSDEDataSet pssubsyssadetailid(String pSSubSysSADetailId){
        this.setPSSubSysSADetailId(pSSubSysSADetailId);
        return this;
    }

    /**
     * 设置 外部接口实体方法，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSubSysSADetailId}
     * @param pSSubSysSADetail 引用对象
     */
    @JsonIgnore
    public PSDEDataSet pssubsyssadetailid(PSSubSysSADetail pSSubSysSADetail){
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
     * <B>PSSUBSYSSADETAILNAME</B>&nbsp;外部接口实体方法，实体支持外部接口持久化时指定结果集绑定的接口实体方法，未指定时引擎将通过代码名称尝试获取对应的接口实体方法
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
    public PSDEDataSet pssubsyssadetailname(String pSSubSysSADetailName){
        this.setPSSubSysSADetailName(pSSubSysSADetailName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端扩展插件，指定实体数据集合使用的前端模板扩展插件，使用插件类型【应用实体方法插件】
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysPFPlugin} 
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
    public PSDEDataSet pssyspfpluginid(String pSSysPFPluginId){
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
    public PSDEDataSet pssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
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
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端扩展插件，指定实体数据集合使用的前端模板扩展插件，使用插件类型【应用实体方法插件】
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
    public PSDEDataSet pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
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
    public PSDEDataSet pssysreqitemid(String pSSysReqItemId){
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
    public PSDEDataSet pssysreqitemid(PSSysReqItem pSSysReqItem){
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
    public PSDEDataSet pssysreqitemname(String pSSysReqItemName){
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINID</B>&nbsp;后台扩展插件，指定实体数据集合使用的后台模板扩展插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysSFPlugin} 
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
    public PSDEDataSet pssyssfpluginid(String pSSysSFPluginId){
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
    public PSDEDataSet pssyssfpluginid(PSSysSFPlugin pSSysSFPlugin){
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
     * <B>PSSYSSFPLUGINNAME</B>&nbsp;后台扩展插件，指定实体数据集合使用的后台模板扩展插件
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
    public PSDEDataSet pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    /**
     * <B>PSSYSUNISTATEID</B>&nbsp;系统状态协调，启用数据集缓存能力，指定系统状态协同对象用于判断缓存是否已经失效
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysUniState} 
     */
    public final static String FIELD_PSSYSUNISTATEID = "pssysunistateid";

    /**
     * 设置 系统状态协调，详细说明：{@link #FIELD_PSSYSUNISTATEID}
     * 
     * @param pSSysUniStateId
     * 
     */
    @JsonProperty(FIELD_PSSYSUNISTATEID)
    public void setPSSysUniStateId(String pSSysUniStateId){
        this.set(FIELD_PSSYSUNISTATEID, pSSysUniStateId);
    }
    
    /**
     * 获取 系统状态协调  
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
     * 判断 系统状态协调 是否指定值，包括空值
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
     * 重置 系统状态协调
     */
    @JsonIgnore
    public void resetPSSysUniStateId(){
        this.reset(FIELD_PSSYSUNISTATEID);
    }

    /**
     * 设置 系统状态协调，详细说明：{@link #FIELD_PSSYSUNISTATEID}
     * <P>
     * 等同 {@link #setPSSysUniStateId}
     * @param pSSysUniStateId
     */
    @JsonIgnore
    public PSDEDataSet pssysunistateid(String pSSysUniStateId){
        this.setPSSysUniStateId(pSSysUniStateId);
        return this;
    }

    /**
     * 设置 系统状态协调，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysUniStateId}
     * @param pSSysUniState 引用对象
     */
    @JsonIgnore
    public PSDEDataSet pssysunistateid(PSSysUniState pSSysUniState){
        if(pSSysUniState == null){
            this.setPSSysUniStateId(null);
            this.setPSSysUniStateName(null);
        }
        else{
            this.setPSSysUniStateId(pSSysUniState.getPSSysUniStateId());
            this.setPSSysUniStateName(pSSysUniState.getPSSysUniStateName());
        }
        return this;
    }

    /**
     * <B>PSSYSUNISTATENAME</B>&nbsp;系统状态协同，启用数据集缓存能力，指定系统状态协同对象用于判断缓存是否已经失效
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSUNISTATEID}
     */
    public final static String FIELD_PSSYSUNISTATENAME = "pssysunistatename";

    /**
     * 设置 系统状态协同，详细说明：{@link #FIELD_PSSYSUNISTATENAME}
     * 
     * @param pSSysUniStateName
     * 
     */
    @JsonProperty(FIELD_PSSYSUNISTATENAME)
    public void setPSSysUniStateName(String pSSysUniStateName){
        this.set(FIELD_PSSYSUNISTATENAME, pSSysUniStateName);
    }
    
    /**
     * 获取 系统状态协同  
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
     * 判断 系统状态协同 是否指定值，包括空值
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
     * 重置 系统状态协同
     */
    @JsonIgnore
    public void resetPSSysUniStateName(){
        this.reset(FIELD_PSSYSUNISTATENAME);
    }

    /**
     * 设置 系统状态协同，详细说明：{@link #FIELD_PSSYSUNISTATENAME}
     * <P>
     * 等同 {@link #setPSSysUniStateName}
     * @param pSSysUniStateName
     */
    @JsonIgnore
    public PSDEDataSet pssysunistatename(String pSSysUniStateName){
        this.setPSSysUniStateName(pSSysUniStateName);
        return this;
    }

    /**
     * <B>PSSYSUSERDRID</B>&nbsp;自定义数据范围，指定数据集使用自定义数据范围
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysUserDR} 
     */
    public final static String FIELD_PSSYSUSERDRID = "pssysuserdrid";

    /**
     * 设置 自定义数据范围，详细说明：{@link #FIELD_PSSYSUSERDRID}
     * 
     * @param pSSysUserDRId
     * 
     */
    @JsonProperty(FIELD_PSSYSUSERDRID)
    public void setPSSysUserDRId(String pSSysUserDRId){
        this.set(FIELD_PSSYSUSERDRID, pSSysUserDRId);
    }
    
    /**
     * 获取 自定义数据范围  
     * @return
     */
    @JsonIgnore
    public String getPSSysUserDRId(){
        Object objValue = this.get(FIELD_PSSYSUSERDRID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义数据范围 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUserDRIdDirty(){
        if(this.contains(FIELD_PSSYSUSERDRID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义数据范围
     */
    @JsonIgnore
    public void resetPSSysUserDRId(){
        this.reset(FIELD_PSSYSUSERDRID);
    }

    /**
     * 设置 自定义数据范围，详细说明：{@link #FIELD_PSSYSUSERDRID}
     * <P>
     * 等同 {@link #setPSSysUserDRId}
     * @param pSSysUserDRId
     */
    @JsonIgnore
    public PSDEDataSet pssysuserdrid(String pSSysUserDRId){
        this.setPSSysUserDRId(pSSysUserDRId);
        return this;
    }

    /**
     * 设置 自定义数据范围，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysUserDRId}
     * @param pSSysUserDR 引用对象
     */
    @JsonIgnore
    public PSDEDataSet pssysuserdrid(PSSysUserDR pSSysUserDR){
        if(pSSysUserDR == null){
            this.setPSSysUserDRId(null);
            this.setPSSysUserDRName(null);
        }
        else{
            this.setPSSysUserDRId(pSSysUserDR.getPSSysUserDRId());
            this.setPSSysUserDRName(pSSysUserDR.getPSSysUserDRName());
        }
        return this;
    }

    /**
     * <B>PSSYSUSERDRID2</B>&nbsp;自定义数据范围2，指定数据集使用自定义数据范围2
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysUserDR} 
     */
    public final static String FIELD_PSSYSUSERDRID2 = "pssysuserdrid2";

    /**
     * 设置 自定义数据范围2，详细说明：{@link #FIELD_PSSYSUSERDRID2}
     * 
     * @param pSSysUserDRId2
     * 
     */
    @JsonProperty(FIELD_PSSYSUSERDRID2)
    public void setPSSysUserDRId2(String pSSysUserDRId2){
        this.set(FIELD_PSSYSUSERDRID2, pSSysUserDRId2);
    }
    
    /**
     * 获取 自定义数据范围2  
     * @return
     */
    @JsonIgnore
    public String getPSSysUserDRId2(){
        Object objValue = this.get(FIELD_PSSYSUSERDRID2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义数据范围2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUserDRId2Dirty(){
        if(this.contains(FIELD_PSSYSUSERDRID2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义数据范围2
     */
    @JsonIgnore
    public void resetPSSysUserDRId2(){
        this.reset(FIELD_PSSYSUSERDRID2);
    }

    /**
     * 设置 自定义数据范围2，详细说明：{@link #FIELD_PSSYSUSERDRID2}
     * <P>
     * 等同 {@link #setPSSysUserDRId2}
     * @param pSSysUserDRId2
     */
    @JsonIgnore
    public PSDEDataSet pssysuserdrid2(String pSSysUserDRId2){
        this.setPSSysUserDRId2(pSSysUserDRId2);
        return this;
    }

    /**
     * 设置 自定义数据范围2，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysUserDRId2}
     * @param pSSysUserDR 引用对象
     */
    @JsonIgnore
    public PSDEDataSet pssysuserdrid2(PSSysUserDR pSSysUserDR){
        if(pSSysUserDR == null){
            this.setPSSysUserDRId2(null);
            this.setPSSysUserDRName2(null);
        }
        else{
            this.setPSSysUserDRId2(pSSysUserDR.getPSSysUserDRId());
            this.setPSSysUserDRName2(pSSysUserDR.getPSSysUserDRName());
        }
        return this;
    }

    /**
     * <B>PSSYSUSERDRNAME</B>&nbsp;自定义数据范围，指定数据集使用自定义数据范围
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSUSERDRID}
     */
    public final static String FIELD_PSSYSUSERDRNAME = "pssysuserdrname";

    /**
     * 设置 自定义数据范围，详细说明：{@link #FIELD_PSSYSUSERDRNAME}
     * 
     * @param pSSysUserDRName
     * 
     */
    @JsonProperty(FIELD_PSSYSUSERDRNAME)
    public void setPSSysUserDRName(String pSSysUserDRName){
        this.set(FIELD_PSSYSUSERDRNAME, pSSysUserDRName);
    }
    
    /**
     * 获取 自定义数据范围  
     * @return
     */
    @JsonIgnore
    public String getPSSysUserDRName(){
        Object objValue = this.get(FIELD_PSSYSUSERDRNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义数据范围 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUserDRNameDirty(){
        if(this.contains(FIELD_PSSYSUSERDRNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义数据范围
     */
    @JsonIgnore
    public void resetPSSysUserDRName(){
        this.reset(FIELD_PSSYSUSERDRNAME);
    }

    /**
     * 设置 自定义数据范围，详细说明：{@link #FIELD_PSSYSUSERDRNAME}
     * <P>
     * 等同 {@link #setPSSysUserDRName}
     * @param pSSysUserDRName
     */
    @JsonIgnore
    public PSDEDataSet pssysuserdrname(String pSSysUserDRName){
        this.setPSSysUserDRName(pSSysUserDRName);
        return this;
    }

    /**
     * <B>PSSYSUSERDRNAME2</B>&nbsp;自定义数据范围2，指定数据集使用自定义数据范围2
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSUSERDRID2}
     */
    public final static String FIELD_PSSYSUSERDRNAME2 = "pssysuserdrname2";

    /**
     * 设置 自定义数据范围2，详细说明：{@link #FIELD_PSSYSUSERDRNAME2}
     * 
     * @param pSSysUserDRName2
     * 
     */
    @JsonProperty(FIELD_PSSYSUSERDRNAME2)
    public void setPSSysUserDRName2(String pSSysUserDRName2){
        this.set(FIELD_PSSYSUSERDRNAME2, pSSysUserDRName2);
    }
    
    /**
     * 获取 自定义数据范围2  
     * @return
     */
    @JsonIgnore
    public String getPSSysUserDRName2(){
        Object objValue = this.get(FIELD_PSSYSUSERDRNAME2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义数据范围2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUserDRName2Dirty(){
        if(this.contains(FIELD_PSSYSUSERDRNAME2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义数据范围2
     */
    @JsonIgnore
    public void resetPSSysUserDRName2(){
        this.reset(FIELD_PSSYSUSERDRNAME2);
    }

    /**
     * 设置 自定义数据范围2，详细说明：{@link #FIELD_PSSYSUSERDRNAME2}
     * <P>
     * 等同 {@link #setPSSysUserDRName2}
     * @param pSSysUserDRName2
     */
    @JsonIgnore
    public PSDEDataSet pssysuserdrname2(String pSSysUserDRName2){
        this.setPSSysUserDRName2(pSSysUserDRName2);
        return this;
    }

    /**
     * <B>PUBMODE</B>&nbsp;默认启用服务，指定数据集合是否默认提供服务能力，未指定时使用实体定义的默认结果集服务能力
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
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
    public PSDEDataSet pubmode(Integer pubMode){
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
    public PSDEDataSet pubmode(Boolean pubMode){
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
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.RequestMethod} 
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
    public PSDEDataSet rawservicemethod(String rawServiceMethod){
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
    public PSDEDataSet rawservicemethod(net.ibizsys.psmodel.core.util.PSModelEnums.RequestMethod rawServiceMethod){
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
    public PSDEDataSet rawserviceurl(String rawServiceUrl){
        this.setRawServiceUrl(rawServiceUrl);
        return this;
    }

    /**
     * <B>REQUESTMETHOD</B>&nbsp;请求方式，指定数据集在提供服务时使用的请求方式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.RequestMethod} 
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
    public PSDEDataSet requestmethod(String requestMethod){
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
    public PSDEDataSet requestmethod(net.ibizsys.psmodel.core.util.PSModelEnums.RequestMethod requestMethod){
        if(requestMethod == null){
            this.setRequestMethod(null);
        }
        else{
            this.setRequestMethod(requestMethod.value);
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
    public PSDEDataSet requestpath(String requestPath){
        this.setRequestPath(requestPath);
        return this;
    }

    /**
     * <B>RETVALTYPE</B>&nbsp;返回值类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEDataSetRetType} 
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
    public PSDEDataSet retvaltype(String retValType){
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
    public PSDEDataSet retvaltype(net.ibizsys.psmodel.core.util.PSModelEnums.DEDataSetRetType retValType){
        if(retValType == null){
            this.setRetValType(null);
        }
        else{
            this.setRetValType(retValType.value);
        }
        return this;
    }

    /**
     * <B>SECBC</B>&nbsp;部门业务代码，结果集启用部门业务条线数据范围功能，指定部门的业务代码
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_SECBC = "secbc";

    /**
     * 设置 部门业务代码，详细说明：{@link #FIELD_SECBC}
     * 
     * @param secBC
     * 
     */
    @JsonProperty(FIELD_SECBC)
    public void setSecBC(String secBC){
        this.set(FIELD_SECBC, secBC);
    }
    
    /**
     * 获取 部门业务代码  
     * @return
     */
    @JsonIgnore
    public String getSecBC(){
        Object objValue = this.get(FIELD_SECBC);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部门业务代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSecBCDirty(){
        if(this.contains(FIELD_SECBC)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部门业务代码
     */
    @JsonIgnore
    public void resetSecBC(){
        this.reset(FIELD_SECBC);
    }

    /**
     * 设置 部门业务代码，详细说明：{@link #FIELD_SECBC}
     * <P>
     * 等同 {@link #setSecBC}
     * @param secBC
     */
    @JsonIgnore
    public PSDEDataSet secbc(String secBC){
        this.setSecBC(secBC);
        return this;
    }

    /**
     * <B>SECDR</B>&nbsp;部门数据范围，结果集启用部门数据范围功能，指定部门的数据范围
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DeptScope} 
     */
    public final static String FIELD_SECDR = "secdr";

    /**
     * 设置 部门数据范围，详细说明：{@link #FIELD_SECDR}
     * 
     * @param secDR
     * 
     */
    @JsonProperty(FIELD_SECDR)
    public void setSecDR(Integer secDR){
        this.set(FIELD_SECDR, secDR);
    }
    
    /**
     * 获取 部门数据范围  
     * @return
     */
    @JsonIgnore
    public Integer getSecDR(){
        Object objValue = this.get(FIELD_SECDR);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 部门数据范围 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSecDRDirty(){
        if(this.contains(FIELD_SECDR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部门数据范围
     */
    @JsonIgnore
    public void resetSecDR(){
        this.reset(FIELD_SECDR);
    }

    /**
     * 设置 部门数据范围，详细说明：{@link #FIELD_SECDR}
     * <P>
     * 等同 {@link #setSecDR}
     * @param secDR
     */
    @JsonIgnore
    public PSDEDataSet secdr(Integer secDR){
        this.setSecDR(secDR);
        return this;
    }

     /**
     * 设置 部门数据范围，详细说明：{@link #FIELD_SECDR}
     * <P>
     * 等同 {@link #setSecDR}
     * @param secDR
     */
    @JsonIgnore
    public PSDEDataSet secdr(net.ibizsys.psmodel.core.util.PSModelEnums.DeptScope[] secDR){
        if(secDR == null || secDR.length == 0){
            this.setSecDR(null);
        }
        else{
            int _value = 0;
            for(net.ibizsys.psmodel.core.util.PSModelEnums.DeptScope _item : secDR){
                _value |= _item.value;
            }
            this.setSecDR(_value);
        }
        return this;
    }

    /**
     * <B>SERVICECODENAME</B>&nbsp;服务代码名称
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_SERVICECODENAME = "servicecodename";

    /**
     * 设置 服务代码名称
     * 
     * @param serviceCodeName
     * 
     */
    @JsonProperty(FIELD_SERVICECODENAME)
    public void setServiceCodeName(String serviceCodeName){
        this.set(FIELD_SERVICECODENAME, serviceCodeName);
    }
    
    /**
     * 获取 服务代码名称  
     * @return
     */
    @JsonIgnore
    public String getServiceCodeName(){
        Object objValue = this.get(FIELD_SERVICECODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 服务代码名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isServiceCodeNameDirty(){
        if(this.contains(FIELD_SERVICECODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务代码名称
     */
    @JsonIgnore
    public void resetServiceCodeName(){
        this.reset(FIELD_SERVICECODENAME);
    }

    /**
     * 设置 服务代码名称
     * <P>
     * 等同 {@link #setServiceCodeName}
     * @param serviceCodeName
     */
    @JsonIgnore
    public PSDEDataSet servicecodename(String serviceCodeName){
        this.setServiceCodeName(serviceCodeName);
        return this;
    }

    /**
     * <B>SUBSYSSADETAILMODE</B>&nbsp;外部接口方法绑定
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SubSysSADEMethodBindingMode} 
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
    public PSDEDataSet subsyssadetailmode(Integer subSysSADetailMode){
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
    public PSDEDataSet subsyssadetailmode(net.ibizsys.psmodel.core.util.PSModelEnums.SubSysSADEMethodBindingMode subSysSADetailMode){
        if(subSysSADetailMode == null){
            this.setSubSysSADetailMode(null);
        }
        else{
            this.setSubSysSADetailMode(subSysSADetailMode.value);
        }
        return this;
    }

    /**
     * <B>SYSUSERDR2PARAM</B>&nbsp;自定义范围2参数，数据集启用自定义数据范围2时，进一步指定范围的参数
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_SYSUSERDR2PARAM = "sysuserdr2param";

    /**
     * 设置 自定义范围2参数，详细说明：{@link #FIELD_SYSUSERDR2PARAM}
     * 
     * @param sysUserDR2Param
     * 
     */
    @JsonProperty(FIELD_SYSUSERDR2PARAM)
    public void setSysUserDR2Param(String sysUserDR2Param){
        this.set(FIELD_SYSUSERDR2PARAM, sysUserDR2Param);
    }
    
    /**
     * 获取 自定义范围2参数  
     * @return
     */
    @JsonIgnore
    public String getSysUserDR2Param(){
        Object objValue = this.get(FIELD_SYSUSERDR2PARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义范围2参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSysUserDR2ParamDirty(){
        if(this.contains(FIELD_SYSUSERDR2PARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义范围2参数
     */
    @JsonIgnore
    public void resetSysUserDR2Param(){
        this.reset(FIELD_SYSUSERDR2PARAM);
    }

    /**
     * 设置 自定义范围2参数，详细说明：{@link #FIELD_SYSUSERDR2PARAM}
     * <P>
     * 等同 {@link #setSysUserDR2Param}
     * @param sysUserDR2Param
     */
    @JsonIgnore
    public PSDEDataSet sysuserdr2param(String sysUserDR2Param){
        this.setSysUserDR2Param(sysUserDR2Param);
        return this;
    }

    /**
     * <B>SYSUSERDRPARAM</B>&nbsp;自定义范围参数，数据集启用自定义数据范围时，进一步指定范围的参数
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_SYSUSERDRPARAM = "sysuserdrparam";

    /**
     * 设置 自定义范围参数，详细说明：{@link #FIELD_SYSUSERDRPARAM}
     * 
     * @param sysUserDRParam
     * 
     */
    @JsonProperty(FIELD_SYSUSERDRPARAM)
    public void setSysUserDRParam(String sysUserDRParam){
        this.set(FIELD_SYSUSERDRPARAM, sysUserDRParam);
    }
    
    /**
     * 获取 自定义范围参数  
     * @return
     */
    @JsonIgnore
    public String getSysUserDRParam(){
        Object objValue = this.get(FIELD_SYSUSERDRPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义范围参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSysUserDRParamDirty(){
        if(this.contains(FIELD_SYSUSERDRPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义范围参数
     */
    @JsonIgnore
    public void resetSysUserDRParam(){
        this.reset(FIELD_SYSUSERDRPARAM);
    }

    /**
     * 设置 自定义范围参数，详细说明：{@link #FIELD_SYSUSERDRPARAM}
     * <P>
     * 等同 {@link #setSysUserDRParam}
     * @param sysUserDRParam
     */
    @JsonIgnore
    public PSDEDataSet sysuserdrparam(String sysUserDRParam){
        this.setSysUserDRParam(sysUserDRParam);
        return this;
    }

    /**
     * <B>UNIONMODE</B>&nbsp;连接模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEDataSetUnionMode} 
     */
    public final static String FIELD_UNIONMODE = "unionmode";

    /**
     * 设置 连接模式
     * 
     * @param unionMode
     * 
     */
    @JsonProperty(FIELD_UNIONMODE)
    public void setUnionMode(String unionMode){
        this.set(FIELD_UNIONMODE, unionMode);
    }
    
    /**
     * 获取 连接模式  
     * @return
     */
    @JsonIgnore
    public String getUnionMode(){
        Object objValue = this.get(FIELD_UNIONMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 连接模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUnionModeDirty(){
        if(this.contains(FIELD_UNIONMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 连接模式
     */
    @JsonIgnore
    public void resetUnionMode(){
        this.reset(FIELD_UNIONMODE);
    }

    /**
     * 设置 连接模式
     * <P>
     * 等同 {@link #setUnionMode}
     * @param unionMode
     */
    @JsonIgnore
    public PSDEDataSet unionmode(String unionMode){
        this.setUnionMode(unionMode);
        return this;
    }

     /**
     * 设置 连接模式
     * <P>
     * 等同 {@link #setUnionMode}
     * @param unionMode
     */
    @JsonIgnore
    public PSDEDataSet unionmode(net.ibizsys.psmodel.core.util.PSModelEnums.DEDataSetUnionMode unionMode){
        if(unionMode == null){
            this.setUnionMode(null);
        }
        else{
            this.setUnionMode(unionMode.value);
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
    public PSDEDataSet updatedate(String updateDate){
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
    public PSDEDataSet updateman(String updateMan){
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
    public PSDEDataSet usercat(String userCat){
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
    public PSDEDataSet usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDEDataSet userparams(String userParams){
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
    public PSDEDataSet usertag(String userTag){
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
    public PSDEDataSet usertag2(String userTag2){
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
    public PSDEDataSet usertag3(String userTag3){
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
    public PSDEDataSet usertag4(String userTag4){
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
    public PSDEDataSet validflag(Integer validFlag){
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
    public PSDEDataSet validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>VIEWCOLLEVEL</B>&nbsp;视图列级别
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEDataQueryViewLevel} 
     */
    public final static String FIELD_VIEWCOLLEVEL = "viewcollevel";

    /**
     * 设置 视图列级别
     * 
     * @param viewColLevel
     * 
     */
    @JsonProperty(FIELD_VIEWCOLLEVEL)
    public void setViewColLevel(Integer viewColLevel){
        this.set(FIELD_VIEWCOLLEVEL, viewColLevel);
    }
    
    /**
     * 获取 视图列级别  
     * @return
     */
    @JsonIgnore
    public Integer getViewColLevel(){
        Object objValue = this.get(FIELD_VIEWCOLLEVEL);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 视图列级别 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewColLevelDirty(){
        if(this.contains(FIELD_VIEWCOLLEVEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图列级别
     */
    @JsonIgnore
    public void resetViewColLevel(){
        this.reset(FIELD_VIEWCOLLEVEL);
    }

    /**
     * 设置 视图列级别
     * <P>
     * 等同 {@link #setViewColLevel}
     * @param viewColLevel
     */
    @JsonIgnore
    public PSDEDataSet viewcollevel(Integer viewColLevel){
        this.setViewColLevel(viewColLevel);
        return this;
    }

     /**
     * 设置 视图列级别
     * <P>
     * 等同 {@link #setViewColLevel}
     * @param viewColLevel
     */
    @JsonIgnore
    public PSDEDataSet viewcollevel(net.ibizsys.psmodel.core.util.PSModelEnums.DEDataQueryViewLevel viewColLevel){
        if(viewColLevel == null){
            this.setViewColLevel(null);
        }
        else{
            this.setViewColLevel(viewColLevel.value);
        }
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEDataSetId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEDataSetId(strValue);
    }

    @JsonIgnore
    public PSDEDataSet id(String strValue){
        this.setPSDEDataSetId(strValue);
        return this;
    }


    /**
     *  实体数据集合参数 成员集合
     */
    public final static String FIELD_PSDEDSPARAMS = "psdedsparams";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSDEDSParam> psdedsparams;

    /**
     * 获取 实体数据集合参数 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEDSPARAMS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEDSParam> getPSDEDSParams(){
        return this.psdedsparams;
    }

    /**
     * 设置 实体数据集合参数 成员集合  
     * @param psdedsparams
     */
    @JsonProperty(FIELD_PSDEDSPARAMS)
    public void setPSDEDSParams(java.util.List<net.ibizsys.psmodel.core.domain.PSDEDSParam> psdedsparams){
        this.psdedsparams = psdedsparams;
    }

    /**
     * 获取 实体数据集合参数 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEDSParam> getPSDEDSParamsIf(){
        if(this.psdedsparams == null){
            this.psdedsparams = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSDEDSParam>();          
        }
        return this.psdedsparams;
    }


    /**
     *  实体数据集合查询 成员集合
     */
    public final static String FIELD_PSDEDSDQS = "psdedsdqs";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSDEDSDQ> psdedsdqs;

    /**
     * 获取 实体数据集合查询 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEDSDQS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEDSDQ> getPSDEDSDQs(){
        return this.psdedsdqs;
    }

    /**
     * 设置 实体数据集合查询 成员集合  
     * @param psdedsdqs
     */
    @JsonProperty(FIELD_PSDEDSDQS)
    public void setPSDEDSDQs(java.util.List<net.ibizsys.psmodel.core.domain.PSDEDSDQ> psdedsdqs){
        this.psdedsdqs = psdedsdqs;
    }

    /**
     * 获取 实体数据集合查询 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEDSDQ> getPSDEDSDQsIf(){
        if(this.psdedsdqs == null){
            this.psdedsdqs = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSDEDSDQ>();          
        }
        return this.psdedsdqs;
    }


    /**
     *  实体数据集分组参数 成员集合
     */
    public final static String FIELD_PSDEDSGRPPARAMS = "psdedsgrpparams";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSDEDSGrpParam> psdedsgrpparams;

    /**
     * 获取 实体数据集分组参数 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEDSGRPPARAMS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEDSGrpParam> getPSDEDSGrpParams(){
        return this.psdedsgrpparams;
    }

    /**
     * 设置 实体数据集分组参数 成员集合  
     * @param psdedsgrpparams
     */
    @JsonProperty(FIELD_PSDEDSGRPPARAMS)
    public void setPSDEDSGrpParams(java.util.List<net.ibizsys.psmodel.core.domain.PSDEDSGrpParam> psdedsgrpparams){
        this.psdedsgrpparams = psdedsgrpparams;
    }

    /**
     * 获取 实体数据集分组参数 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEDSGrpParam> getPSDEDSGrpParamsIf(){
        if(this.psdedsgrpparams == null){
            this.psdedsgrpparams = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSDEDSGrpParam>();          
        }
        return this.psdedsgrpparams;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEDataSet){
            PSDEDataSet model = (PSDEDataSet)iPSModel;
            model.setPSDEDSParams(this.getPSDEDSParams());
            model.setPSDEDSDQs(this.getPSDEDSDQs());
            model.setPSDEDSGrpParams(this.getPSDEDSGrpParams());
        }
        super.copyTo(iPSModel);
    }
}
