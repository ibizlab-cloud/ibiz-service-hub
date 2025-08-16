package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSACHANDLER</B>界面处理对象 模型传输对象
 * <P>
 * 界面处理配置模型，定义界面部件或视图的请求响应处理逻辑
 */
public class PSACHandler extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSACHandler(){
    }      

    /**
     * <B>CACHESCOPE</B>&nbsp;缓存范围，指定界面处理对象对响应内容的缓存范围，未定义时为【无】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.CtrlHandlerCacheScope} 
     */
    public final static String FIELD_CACHESCOPE = "cachescope";

    /**
     * 设置 缓存范围，详细说明：{@link #FIELD_CACHESCOPE}
     * 
     * @param cacheScope
     * 
     */
    @JsonProperty(FIELD_CACHESCOPE)
    public void setCacheScope(Integer cacheScope){
        this.set(FIELD_CACHESCOPE, cacheScope);
    }
    
    /**
     * 获取 缓存范围  
     * @return
     */
    @JsonIgnore
    public Integer getCacheScope(){
        Object objValue = this.get(FIELD_CACHESCOPE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
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
    public PSACHandler cachescope(Integer cacheScope){
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
    public PSACHandler cachescope(net.ibizsys.psmodel.core.util.PSModelEnums.CtrlHandlerCacheScope cacheScope){
        if(cacheScope == null){
            this.setCacheScope(null);
        }
        else{
            this.setCacheScope(cacheScope.value);
        }
        return this;
    }

    /**
     * <B>CACHETIMEOUT</B>&nbsp;缓存超时时长，指定界面处理对象启用缓存时的缓存的时长，单位为【毫秒】，-1为永不过期，未定义时为【-1】
     */
    public final static String FIELD_CACHETIMEOUT = "cachetimeout";

    /**
     * 设置 缓存超时时长，详细说明：{@link #FIELD_CACHETIMEOUT}
     * 
     * @param cacheTimeout
     * 
     */
    @JsonProperty(FIELD_CACHETIMEOUT)
    public void setCacheTimeout(Integer cacheTimeout){
        this.set(FIELD_CACHETIMEOUT, cacheTimeout);
    }
    
    /**
     * 获取 缓存超时时长  
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
     * 判断 缓存超时时长 是否指定值，包括空值
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
     * 重置 缓存超时时长
     */
    @JsonIgnore
    public void resetCacheTimeout(){
        this.reset(FIELD_CACHETIMEOUT);
    }

    /**
     * 设置 缓存超时时长，详细说明：{@link #FIELD_CACHETIMEOUT}
     * <P>
     * 等同 {@link #setCacheTimeout}
     * @param cacheTimeout
     */
    @JsonIgnore
    public PSACHandler cachetimeout(Integer cacheTimeout){
        this.setCacheTimeout(cacheTimeout);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定界面处理器的代码标识，需要在所在的模型域（实体、系统模块或系统）中具有唯一性
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
    public PSACHandler codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>COPYPSDEACTIONID</B>&nbsp;复制数据实体行为，指定界面处理对象提供复制数据功能的实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_COPYPSDEACTIONID = "copypsdeactionid";

    /**
     * 设置 复制数据实体行为，详细说明：{@link #FIELD_COPYPSDEACTIONID}
     * 
     * @param copyPSDEActionId
     * 
     */
    @JsonProperty(FIELD_COPYPSDEACTIONID)
    public void setCopyPSDEActionId(String copyPSDEActionId){
        this.set(FIELD_COPYPSDEACTIONID, copyPSDEActionId);
    }
    
    /**
     * 获取 复制数据实体行为  
     * @return
     */
    @JsonIgnore
    public String getCopyPSDEActionId(){
        Object objValue = this.get(FIELD_COPYPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 复制数据实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCopyPSDEActionIdDirty(){
        if(this.contains(FIELD_COPYPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 复制数据实体行为
     */
    @JsonIgnore
    public void resetCopyPSDEActionId(){
        this.reset(FIELD_COPYPSDEACTIONID);
    }

    /**
     * 设置 复制数据实体行为，详细说明：{@link #FIELD_COPYPSDEACTIONID}
     * <P>
     * 等同 {@link #setCopyPSDEActionId}
     * @param copyPSDEActionId
     */
    @JsonIgnore
    public PSACHandler copypsdeactionid(String copyPSDEActionId){
        this.setCopyPSDEActionId(copyPSDEActionId);
        return this;
    }

    /**
     * 设置 复制数据实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setCopyPSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSACHandler copypsdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setCopyPSDEActionId(null);
            this.setCopyPSDEActionName(null);
        }
        else{
            this.setCopyPSDEActionId(pSDEAction.getPSDEActionId());
            this.setCopyPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>COPYPSDEACTIONNAME</B>&nbsp;复制数据实体行为，指定界面处理对象提供复制数据功能的实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_COPYPSDEACTIONID}
     */
    public final static String FIELD_COPYPSDEACTIONNAME = "copypsdeactionname";

    /**
     * 设置 复制数据实体行为，详细说明：{@link #FIELD_COPYPSDEACTIONNAME}
     * 
     * @param copyPSDEActionName
     * 
     */
    @JsonProperty(FIELD_COPYPSDEACTIONNAME)
    public void setCopyPSDEActionName(String copyPSDEActionName){
        this.set(FIELD_COPYPSDEACTIONNAME, copyPSDEActionName);
    }
    
    /**
     * 获取 复制数据实体行为  
     * @return
     */
    @JsonIgnore
    public String getCopyPSDEActionName(){
        Object objValue = this.get(FIELD_COPYPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 复制数据实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCopyPSDEActionNameDirty(){
        if(this.contains(FIELD_COPYPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 复制数据实体行为
     */
    @JsonIgnore
    public void resetCopyPSDEActionName(){
        this.reset(FIELD_COPYPSDEACTIONNAME);
    }

    /**
     * 设置 复制数据实体行为，详细说明：{@link #FIELD_COPYPSDEACTIONNAME}
     * <P>
     * 等同 {@link #setCopyPSDEActionName}
     * @param copyPSDEActionName
     */
    @JsonIgnore
    public PSACHandler copypsdeactionname(String copyPSDEActionName){
        this.setCopyPSDEActionName(copyPSDEActionName);
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
    public PSACHandler createdate(String createDate){
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
    public PSACHandler createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CREATEPSDEACTIONID</B>&nbsp;建立数据实体行为，指定界面处理对象提供建立数据功能的实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_CREATEPSDEACTIONID = "createpsdeactionid";

    /**
     * 设置 建立数据实体行为，详细说明：{@link #FIELD_CREATEPSDEACTIONID}
     * 
     * @param createPSDEActionId
     * 
     */
    @JsonProperty(FIELD_CREATEPSDEACTIONID)
    public void setCreatePSDEActionId(String createPSDEActionId){
        this.set(FIELD_CREATEPSDEACTIONID, createPSDEActionId);
    }
    
    /**
     * 获取 建立数据实体行为  
     * @return
     */
    @JsonIgnore
    public String getCreatePSDEActionId(){
        Object objValue = this.get(FIELD_CREATEPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 建立数据实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCreatePSDEActionIdDirty(){
        if(this.contains(FIELD_CREATEPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 建立数据实体行为
     */
    @JsonIgnore
    public void resetCreatePSDEActionId(){
        this.reset(FIELD_CREATEPSDEACTIONID);
    }

    /**
     * 设置 建立数据实体行为，详细说明：{@link #FIELD_CREATEPSDEACTIONID}
     * <P>
     * 等同 {@link #setCreatePSDEActionId}
     * @param createPSDEActionId
     */
    @JsonIgnore
    public PSACHandler createpsdeactionid(String createPSDEActionId){
        this.setCreatePSDEActionId(createPSDEActionId);
        return this;
    }

    /**
     * 设置 建立数据实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setCreatePSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSACHandler createpsdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setCreatePSDEActionId(null);
            this.setCreatePSDEActionName(null);
        }
        else{
            this.setCreatePSDEActionId(pSDEAction.getPSDEActionId());
            this.setCreatePSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>CREATEPSDEACTIONNAME</B>&nbsp;建立数据实体行为，指定界面处理对象提供建立数据功能的实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CREATEPSDEACTIONID}
     */
    public final static String FIELD_CREATEPSDEACTIONNAME = "createpsdeactionname";

    /**
     * 设置 建立数据实体行为，详细说明：{@link #FIELD_CREATEPSDEACTIONNAME}
     * 
     * @param createPSDEActionName
     * 
     */
    @JsonProperty(FIELD_CREATEPSDEACTIONNAME)
    public void setCreatePSDEActionName(String createPSDEActionName){
        this.set(FIELD_CREATEPSDEACTIONNAME, createPSDEActionName);
    }
    
    /**
     * 获取 建立数据实体行为  
     * @return
     */
    @JsonIgnore
    public String getCreatePSDEActionName(){
        Object objValue = this.get(FIELD_CREATEPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 建立数据实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCreatePSDEActionNameDirty(){
        if(this.contains(FIELD_CREATEPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 建立数据实体行为
     */
    @JsonIgnore
    public void resetCreatePSDEActionName(){
        this.reset(FIELD_CREATEPSDEACTIONNAME);
    }

    /**
     * 设置 建立数据实体行为，详细说明：{@link #FIELD_CREATEPSDEACTIONNAME}
     * <P>
     * 等同 {@link #setCreatePSDEActionName}
     * @param createPSDEActionName
     */
    @JsonIgnore
    public PSACHandler createpsdeactionname(String createPSDEActionName){
        this.setCreatePSDEActionName(createPSDEActionName);
        return this;
    }

    /**
     * <B>CREATEPSDEOPPRIVID</B>&nbsp;建立要求权限，指定界面处理对象建立数据需要具备的操作标识
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEOPPriv} 
     */
    public final static String FIELD_CREATEPSDEOPPRIVID = "createpsdeopprivid";

    /**
     * 设置 建立要求权限，详细说明：{@link #FIELD_CREATEPSDEOPPRIVID}
     * 
     * @param createPSDEOPPrivId
     * 
     */
    @JsonProperty(FIELD_CREATEPSDEOPPRIVID)
    public void setCreatePSDEOPPrivId(String createPSDEOPPrivId){
        this.set(FIELD_CREATEPSDEOPPRIVID, createPSDEOPPrivId);
    }
    
    /**
     * 获取 建立要求权限  
     * @return
     */
    @JsonIgnore
    public String getCreatePSDEOPPrivId(){
        Object objValue = this.get(FIELD_CREATEPSDEOPPRIVID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 建立要求权限 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCreatePSDEOPPrivIdDirty(){
        if(this.contains(FIELD_CREATEPSDEOPPRIVID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 建立要求权限
     */
    @JsonIgnore
    public void resetCreatePSDEOPPrivId(){
        this.reset(FIELD_CREATEPSDEOPPRIVID);
    }

    /**
     * 设置 建立要求权限，详细说明：{@link #FIELD_CREATEPSDEOPPRIVID}
     * <P>
     * 等同 {@link #setCreatePSDEOPPrivId}
     * @param createPSDEOPPrivId
     */
    @JsonIgnore
    public PSACHandler createpsdeopprivid(String createPSDEOPPrivId){
        this.setCreatePSDEOPPrivId(createPSDEOPPrivId);
        return this;
    }

    /**
     * 设置 建立要求权限，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setCreatePSDEOPPrivId}
     * @param pSDEOPPriv 引用对象
     */
    @JsonIgnore
    public PSACHandler createpsdeopprivid(PSDEOPPriv pSDEOPPriv){
        if(pSDEOPPriv == null){
            this.setCreatePSDEOPPrivId(null);
            this.setCreatePSDEOPPrivIName(null);
        }
        else{
            this.setCreatePSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setCreatePSDEOPPrivIName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    /**
     * <B>CREATEPSDEOPPRIVINAME</B>&nbsp;建立要求权限，指定界面处理对象建立数据需要具备的操作标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CREATEPSDEOPPRIVID}
     */
    public final static String FIELD_CREATEPSDEOPPRIVINAME = "createpsdeoppriviname";

    /**
     * 设置 建立要求权限，详细说明：{@link #FIELD_CREATEPSDEOPPRIVINAME}
     * 
     * @param createPSDEOPPrivIName
     * 
     */
    @JsonProperty(FIELD_CREATEPSDEOPPRIVINAME)
    public void setCreatePSDEOPPrivIName(String createPSDEOPPrivIName){
        this.set(FIELD_CREATEPSDEOPPRIVINAME, createPSDEOPPrivIName);
    }
    
    /**
     * 获取 建立要求权限  
     * @return
     */
    @JsonIgnore
    public String getCreatePSDEOPPrivIName(){
        Object objValue = this.get(FIELD_CREATEPSDEOPPRIVINAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 建立要求权限 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCreatePSDEOPPrivINameDirty(){
        if(this.contains(FIELD_CREATEPSDEOPPRIVINAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 建立要求权限
     */
    @JsonIgnore
    public void resetCreatePSDEOPPrivIName(){
        this.reset(FIELD_CREATEPSDEOPPRIVINAME);
    }

    /**
     * 设置 建立要求权限，详细说明：{@link #FIELD_CREATEPSDEOPPRIVINAME}
     * <P>
     * 等同 {@link #setCreatePSDEOPPrivIName}
     * @param createPSDEOPPrivIName
     */
    @JsonIgnore
    public PSACHandler createpsdeoppriviname(String createPSDEOPPrivIName){
        this.setCreatePSDEOPPrivIName(createPSDEOPPrivIName);
        return this;
    }

    /**
     * <B>CREATETIMEOUT</B>&nbsp;建立超时，指定界面处理对象建立数据的超时时长，单位为【毫秒】，-1为永不过期，未定义时为【-1】
     */
    public final static String FIELD_CREATETIMEOUT = "createtimeout";

    /**
     * 设置 建立超时，详细说明：{@link #FIELD_CREATETIMEOUT}
     * 
     * @param createTimeout
     * 
     */
    @JsonProperty(FIELD_CREATETIMEOUT)
    public void setCreateTimeout(Integer createTimeout){
        this.set(FIELD_CREATETIMEOUT, createTimeout);
    }
    
    /**
     * 获取 建立超时  
     * @return
     */
    @JsonIgnore
    public Integer getCreateTimeout(){
        Object objValue = this.get(FIELD_CREATETIMEOUT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 建立超时 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCreateTimeoutDirty(){
        if(this.contains(FIELD_CREATETIMEOUT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 建立超时
     */
    @JsonIgnore
    public void resetCreateTimeout(){
        this.reset(FIELD_CREATETIMEOUT);
    }

    /**
     * 设置 建立超时，详细说明：{@link #FIELD_CREATETIMEOUT}
     * <P>
     * 等同 {@link #setCreateTimeout}
     * @param createTimeout
     */
    @JsonIgnore
    public PSACHandler createtimeout(Integer createTimeout){
        this.setCreateTimeout(createTimeout);
        return this;
    }

    /**
     * <B>CTRLTYPE</B>&nbsp;部件类型，指定界面处理对象相关的部件类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.CtrlType} 
     */
    public final static String FIELD_CTRLTYPE = "ctrltype";

    /**
     * 设置 部件类型，详细说明：{@link #FIELD_CTRLTYPE}
     * 
     * @param ctrlType
     * 
     */
    @JsonProperty(FIELD_CTRLTYPE)
    public void setCtrlType(String ctrlType){
        this.set(FIELD_CTRLTYPE, ctrlType);
    }
    
    /**
     * 获取 部件类型  
     * @return
     */
    @JsonIgnore
    public String getCtrlType(){
        Object objValue = this.get(FIELD_CTRLTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlTypeDirty(){
        if(this.contains(FIELD_CTRLTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件类型
     */
    @JsonIgnore
    public void resetCtrlType(){
        this.reset(FIELD_CTRLTYPE);
    }

    /**
     * 设置 部件类型，详细说明：{@link #FIELD_CTRLTYPE}
     * <P>
     * 等同 {@link #setCtrlType}
     * @param ctrlType
     */
    @JsonIgnore
    public PSACHandler ctrltype(String ctrlType){
        this.setCtrlType(ctrlType);
        return this;
    }

     /**
     * 设置 部件类型，详细说明：{@link #FIELD_CTRLTYPE}
     * <P>
     * 等同 {@link #setCtrlType}
     * @param ctrlType
     */
    @JsonIgnore
    public PSACHandler ctrltype(net.ibizsys.psmodel.core.util.PSModelEnums.CtrlType ctrlType){
        if(ctrlType == null){
            this.setCtrlType(null);
        }
        else{
            this.setCtrlType(ctrlType.value);
        }
        return this;
    }

    /**
     * <B>CUSTOMCOND</B>&nbsp;自定义条件
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_CUSTOMCOND = "customcond";

    /**
     * 设置 自定义条件
     * 
     * @param customCond
     * 
     */
    @JsonProperty(FIELD_CUSTOMCOND)
    public void setCustomCond(String customCond){
        this.set(FIELD_CUSTOMCOND, customCond);
    }
    
    /**
     * 获取 自定义条件  
     * @return
     */
    @JsonIgnore
    public String getCustomCond(){
        Object objValue = this.get(FIELD_CUSTOMCOND);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义条件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomCondDirty(){
        if(this.contains(FIELD_CUSTOMCOND)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义条件
     */
    @JsonIgnore
    public void resetCustomCond(){
        this.reset(FIELD_CUSTOMCOND);
    }

    /**
     * 设置 自定义条件
     * <P>
     * 等同 {@link #setCustomCond}
     * @param customCond
     */
    @JsonIgnore
    public PSACHandler customcond(String customCond){
        this.setCustomCond(customCond);
        return this;
    }

    /**
     * <B>CUSTOMTYPE</B>&nbsp;自定义类型
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_CUSTOMTYPE = "customtype";

    /**
     * 设置 自定义类型
     * 
     * @param customType
     * 
     */
    @JsonProperty(FIELD_CUSTOMTYPE)
    public void setCustomType(String customType){
        this.set(FIELD_CUSTOMTYPE, customType);
    }
    
    /**
     * 获取 自定义类型  
     * @return
     */
    @JsonIgnore
    public String getCustomType(){
        Object objValue = this.get(FIELD_CUSTOMTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomTypeDirty(){
        if(this.contains(FIELD_CUSTOMTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义类型
     */
    @JsonIgnore
    public void resetCustomType(){
        this.reset(FIELD_CUSTOMTYPE);
    }

    /**
     * 设置 自定义类型
     * <P>
     * 等同 {@link #setCustomType}
     * @param customType
     */
    @JsonIgnore
    public PSACHandler customtype(String customType){
        this.setCustomType(customType);
        return this;
    }

    /**
     * <B>ENABLECACHE</B>&nbsp;启用缓存，指定界面处理对象是否启用缓存，未定义时为【否】
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
    public PSACHandler enablecache(Integer enableCache){
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
    public PSACHandler enablecache(Boolean enableCache){
        if(enableCache == null){
            this.setEnableCache(null);
        }
        else{
            this.setEnableCache(enableCache?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEORGDR</B>&nbsp;启用机构数据范围，指定界面部件进行数据查询时是否附加指定机构范围，未定义时为【否】
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
    public PSACHandler enableorgdr(Integer enableOrgDR){
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
    public PSACHandler enableorgdr(Boolean enableOrgDR){
        if(enableOrgDR == null){
            this.setEnableOrgDR(null);
        }
        else{
            this.setEnableOrgDR(enableOrgDR?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLESECBC</B>&nbsp;启用部门业务代码，指定界面部件进行数据查询时是否附加指定部门业务条线代码，未定义时为【否】
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
    public PSACHandler enablesecbc(Integer enableSecBC){
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
    public PSACHandler enablesecbc(Boolean enableSecBC){
        if(enableSecBC == null){
            this.setEnableSecBC(null);
        }
        else{
            this.setEnableSecBC(enableSecBC?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLESECDR</B>&nbsp;启用部门数据范围，指定界面部件进行数据查询时是否附加指定部门范围，未定义时为【否】
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
    public PSACHandler enablesecdr(Integer enableSecDR){
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
    public PSACHandler enablesecdr(Boolean enableSecDR){
        if(enableSecDR == null){
            this.setEnableSecDR(null);
        }
        else{
            this.setEnableSecDR(enableSecDR?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEUSERDR</B>&nbsp;启用用户数据范围，指定界面部件进行数据查询时是否附加当前用户身份条件，未定义时为【否】
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
    public PSACHandler enableuserdr(Integer enableUserDR){
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
    public PSACHandler enableuserdr(Boolean enableUserDR){
        if(enableUserDR == null){
            this.setEnableUserDR(null);
        }
        else{
            this.setEnableUserDR(enableUserDR?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>EXPORTPSDEOPPRIVID</B>&nbsp;导出要求权限，指定界面处理对象导出数据需要具备的操作标识
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEOPPriv} 
     */
    public final static String FIELD_EXPORTPSDEOPPRIVID = "exportpsdeopprivid";

    /**
     * 设置 导出要求权限，详细说明：{@link #FIELD_EXPORTPSDEOPPRIVID}
     * 
     * @param exportPSDEOPPrivId
     * 
     */
    @JsonProperty(FIELD_EXPORTPSDEOPPRIVID)
    public void setExportPSDEOPPrivId(String exportPSDEOPPrivId){
        this.set(FIELD_EXPORTPSDEOPPRIVID, exportPSDEOPPrivId);
    }
    
    /**
     * 获取 导出要求权限  
     * @return
     */
    @JsonIgnore
    public String getExportPSDEOPPrivId(){
        Object objValue = this.get(FIELD_EXPORTPSDEOPPRIVID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导出要求权限 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExportPSDEOPPrivIdDirty(){
        if(this.contains(FIELD_EXPORTPSDEOPPRIVID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导出要求权限
     */
    @JsonIgnore
    public void resetExportPSDEOPPrivId(){
        this.reset(FIELD_EXPORTPSDEOPPRIVID);
    }

    /**
     * 设置 导出要求权限，详细说明：{@link #FIELD_EXPORTPSDEOPPRIVID}
     * <P>
     * 等同 {@link #setExportPSDEOPPrivId}
     * @param exportPSDEOPPrivId
     */
    @JsonIgnore
    public PSACHandler exportpsdeopprivid(String exportPSDEOPPrivId){
        this.setExportPSDEOPPrivId(exportPSDEOPPrivId);
        return this;
    }

    /**
     * 设置 导出要求权限，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setExportPSDEOPPrivId}
     * @param pSDEOPPriv 引用对象
     */
    @JsonIgnore
    public PSACHandler exportpsdeopprivid(PSDEOPPriv pSDEOPPriv){
        if(pSDEOPPriv == null){
            this.setExportPSDEOPPrivId(null);
            this.setExportPSDEOPPrivName(null);
        }
        else{
            this.setExportPSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setExportPSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    /**
     * <B>EXPORTPSDEOPPRIVNAME</B>&nbsp;导出要求权限，指定界面处理对象导出数据需要具备的操作标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_EXPORTPSDEOPPRIVID}
     */
    public final static String FIELD_EXPORTPSDEOPPRIVNAME = "exportpsdeopprivname";

    /**
     * 设置 导出要求权限，详细说明：{@link #FIELD_EXPORTPSDEOPPRIVNAME}
     * 
     * @param exportPSDEOPPrivName
     * 
     */
    @JsonProperty(FIELD_EXPORTPSDEOPPRIVNAME)
    public void setExportPSDEOPPrivName(String exportPSDEOPPrivName){
        this.set(FIELD_EXPORTPSDEOPPRIVNAME, exportPSDEOPPrivName);
        //属性名称与代码标识不一致，设置属性名称
        this.set("exportpsdeoppriviname", exportPSDEOPPrivName);
    }
    
    /**
     * 获取 导出要求权限  
     * @return
     */
    @JsonIgnore
    public String getExportPSDEOPPrivName(){
        Object objValue = this.get(FIELD_EXPORTPSDEOPPRIVNAME);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("exportpsdeoppriviname");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 导出要求权限 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExportPSDEOPPrivNameDirty(){
        if(this.contains(FIELD_EXPORTPSDEOPPRIVNAME)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("exportpsdeoppriviname")){
            return true;
        }
        return false;
    }

    /**
     * 重置 导出要求权限
     */
    @JsonIgnore
    public void resetExportPSDEOPPrivName(){
        this.reset(FIELD_EXPORTPSDEOPPRIVNAME);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("exportpsdeoppriviname");
    }

    /**
     * 设置 导出要求权限，详细说明：{@link #FIELD_EXPORTPSDEOPPRIVNAME}
     * <P>
     * 等同 {@link #setExportPSDEOPPrivName}
     * @param exportPSDEOPPrivName
     */
    @JsonIgnore
    public PSACHandler exportpsdeopprivname(String exportPSDEOPPrivName){
        this.setExportPSDEOPPrivName(exportPSDEOPPrivName);
        return this;
    }

    /**
     * <B>FETCHTIMEOUT</B>&nbsp;查询超时，指定界面处理对象查询数据的超时时长，单位为【毫秒】，-1为永不过期，未定义时为【-1】
     */
    public final static String FIELD_FETCHTIMEOUT = "fetchtimeout";

    /**
     * 设置 查询超时，详细说明：{@link #FIELD_FETCHTIMEOUT}
     * 
     * @param fetchTimeout
     * 
     */
    @JsonProperty(FIELD_FETCHTIMEOUT)
    public void setFetchTimeout(Integer fetchTimeout){
        this.set(FIELD_FETCHTIMEOUT, fetchTimeout);
    }
    
    /**
     * 获取 查询超时  
     * @return
     */
    @JsonIgnore
    public Integer getFetchTimeout(){
        Object objValue = this.get(FIELD_FETCHTIMEOUT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 查询超时 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFetchTimeoutDirty(){
        if(this.contains(FIELD_FETCHTIMEOUT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 查询超时
     */
    @JsonIgnore
    public void resetFetchTimeout(){
        this.reset(FIELD_FETCHTIMEOUT);
    }

    /**
     * 设置 查询超时，详细说明：{@link #FIELD_FETCHTIMEOUT}
     * <P>
     * 等同 {@link #setFetchTimeout}
     * @param fetchTimeout
     */
    @JsonIgnore
    public PSACHandler fetchtimeout(Integer fetchTimeout){
        this.setFetchTimeout(fetchTimeout);
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
    public PSACHandler finishflag(Integer finishFlag){
        this.setFinishFlag(finishFlag);
        return this;
    }

    /**
     * <B>GETDRAFTPSDEACTIONID</B>&nbsp;获取草稿数据实体行为，指定界面处理对象提供获取草稿数据功能的实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_GETDRAFTPSDEACTIONID = "getdraftpsdeactionid";

    /**
     * 设置 获取草稿数据实体行为，详细说明：{@link #FIELD_GETDRAFTPSDEACTIONID}
     * 
     * @param getDraftPSDEActionId
     * 
     */
    @JsonProperty(FIELD_GETDRAFTPSDEACTIONID)
    public void setGetDraftPSDEActionId(String getDraftPSDEActionId){
        this.set(FIELD_GETDRAFTPSDEACTIONID, getDraftPSDEActionId);
    }
    
    /**
     * 获取 获取草稿数据实体行为  
     * @return
     */
    @JsonIgnore
    public String getGetDraftPSDEActionId(){
        Object objValue = this.get(FIELD_GETDRAFTPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 获取草稿数据实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGetDraftPSDEActionIdDirty(){
        if(this.contains(FIELD_GETDRAFTPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 获取草稿数据实体行为
     */
    @JsonIgnore
    public void resetGetDraftPSDEActionId(){
        this.reset(FIELD_GETDRAFTPSDEACTIONID);
    }

    /**
     * 设置 获取草稿数据实体行为，详细说明：{@link #FIELD_GETDRAFTPSDEACTIONID}
     * <P>
     * 等同 {@link #setGetDraftPSDEActionId}
     * @param getDraftPSDEActionId
     */
    @JsonIgnore
    public PSACHandler getdraftpsdeactionid(String getDraftPSDEActionId){
        this.setGetDraftPSDEActionId(getDraftPSDEActionId);
        return this;
    }

    /**
     * 设置 获取草稿数据实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setGetDraftPSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSACHandler getdraftpsdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setGetDraftPSDEActionId(null);
            this.setGetDraftPSDEActionName(null);
        }
        else{
            this.setGetDraftPSDEActionId(pSDEAction.getPSDEActionId());
            this.setGetDraftPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>GETDRAFTPSDEACTIONNAME</B>&nbsp;获取草稿实体行为，指定界面处理对象提供获取草稿数据功能的实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GETDRAFTPSDEACTIONID}
     */
    public final static String FIELD_GETDRAFTPSDEACTIONNAME = "getdraftpsdeactionname";

    /**
     * 设置 获取草稿实体行为，详细说明：{@link #FIELD_GETDRAFTPSDEACTIONNAME}
     * 
     * @param getDraftPSDEActionName
     * 
     */
    @JsonProperty(FIELD_GETDRAFTPSDEACTIONNAME)
    public void setGetDraftPSDEActionName(String getDraftPSDEActionName){
        this.set(FIELD_GETDRAFTPSDEACTIONNAME, getDraftPSDEActionName);
    }
    
    /**
     * 获取 获取草稿实体行为  
     * @return
     */
    @JsonIgnore
    public String getGetDraftPSDEActionName(){
        Object objValue = this.get(FIELD_GETDRAFTPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 获取草稿实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGetDraftPSDEActionNameDirty(){
        if(this.contains(FIELD_GETDRAFTPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 获取草稿实体行为
     */
    @JsonIgnore
    public void resetGetDraftPSDEActionName(){
        this.reset(FIELD_GETDRAFTPSDEACTIONNAME);
    }

    /**
     * 设置 获取草稿实体行为，详细说明：{@link #FIELD_GETDRAFTPSDEACTIONNAME}
     * <P>
     * 等同 {@link #setGetDraftPSDEActionName}
     * @param getDraftPSDEActionName
     */
    @JsonIgnore
    public PSACHandler getdraftpsdeactionname(String getDraftPSDEActionName){
        this.setGetDraftPSDEActionName(getDraftPSDEActionName);
        return this;
    }

    /**
     * <B>GETPSDEACTIONID</B>&nbsp;获取数据实体行为，指定界面处理对象提供获取数据功能的实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_GETPSDEACTIONID = "getpsdeactionid";

    /**
     * 设置 获取数据实体行为，详细说明：{@link #FIELD_GETPSDEACTIONID}
     * 
     * @param getPSDEActionId
     * 
     */
    @JsonProperty(FIELD_GETPSDEACTIONID)
    public void setGetPSDEActionId(String getPSDEActionId){
        this.set(FIELD_GETPSDEACTIONID, getPSDEActionId);
    }
    
    /**
     * 获取 获取数据实体行为  
     * @return
     */
    @JsonIgnore
    public String getGetPSDEActionId(){
        Object objValue = this.get(FIELD_GETPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 获取数据实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGetPSDEActionIdDirty(){
        if(this.contains(FIELD_GETPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 获取数据实体行为
     */
    @JsonIgnore
    public void resetGetPSDEActionId(){
        this.reset(FIELD_GETPSDEACTIONID);
    }

    /**
     * 设置 获取数据实体行为，详细说明：{@link #FIELD_GETPSDEACTIONID}
     * <P>
     * 等同 {@link #setGetPSDEActionId}
     * @param getPSDEActionId
     */
    @JsonIgnore
    public PSACHandler getpsdeactionid(String getPSDEActionId){
        this.setGetPSDEActionId(getPSDEActionId);
        return this;
    }

    /**
     * 设置 获取数据实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setGetPSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSACHandler getpsdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setGetPSDEActionId(null);
            this.setGetPSDEActionName(null);
        }
        else{
            this.setGetPSDEActionId(pSDEAction.getPSDEActionId());
            this.setGetPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>GETPSDEACTIONNAME</B>&nbsp;获取数据实体行为，指定界面处理对象提供获取数据功能的实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GETPSDEACTIONID}
     */
    public final static String FIELD_GETPSDEACTIONNAME = "getpsdeactionname";

    /**
     * 设置 获取数据实体行为，详细说明：{@link #FIELD_GETPSDEACTIONNAME}
     * 
     * @param getPSDEActionName
     * 
     */
    @JsonProperty(FIELD_GETPSDEACTIONNAME)
    public void setGetPSDEActionName(String getPSDEActionName){
        this.set(FIELD_GETPSDEACTIONNAME, getPSDEActionName);
    }
    
    /**
     * 获取 获取数据实体行为  
     * @return
     */
    @JsonIgnore
    public String getGetPSDEActionName(){
        Object objValue = this.get(FIELD_GETPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 获取数据实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGetPSDEActionNameDirty(){
        if(this.contains(FIELD_GETPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 获取数据实体行为
     */
    @JsonIgnore
    public void resetGetPSDEActionName(){
        this.reset(FIELD_GETPSDEACTIONNAME);
    }

    /**
     * 设置 获取数据实体行为，详细说明：{@link #FIELD_GETPSDEACTIONNAME}
     * <P>
     * 等同 {@link #setGetPSDEActionName}
     * @param getPSDEActionName
     */
    @JsonIgnore
    public PSACHandler getpsdeactionname(String getPSDEActionName){
        this.setGetPSDEActionName(getPSDEActionName);
        return this;
    }

    /**
     * <B>GETTIMEOUT</B>&nbsp;获取超时，指定界面处理对象获取数据的超时时长，单位为【毫秒】，-1为永不过期，未定义时为【-1】
     */
    public final static String FIELD_GETTIMEOUT = "gettimeout";

    /**
     * 设置 获取超时，详细说明：{@link #FIELD_GETTIMEOUT}
     * 
     * @param getTimeout
     * 
     */
    @JsonProperty(FIELD_GETTIMEOUT)
    public void setGetTimeout(Integer getTimeout){
        this.set(FIELD_GETTIMEOUT, getTimeout);
    }
    
    /**
     * 获取 获取超时  
     * @return
     */
    @JsonIgnore
    public Integer getGetTimeout(){
        Object objValue = this.get(FIELD_GETTIMEOUT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 获取超时 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGetTimeoutDirty(){
        if(this.contains(FIELD_GETTIMEOUT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 获取超时
     */
    @JsonIgnore
    public void resetGetTimeout(){
        this.reset(FIELD_GETTIMEOUT);
    }

    /**
     * 设置 获取超时，详细说明：{@link #FIELD_GETTIMEOUT}
     * <P>
     * 等同 {@link #setGetTimeout}
     * @param getTimeout
     */
    @JsonIgnore
    public PSACHandler gettimeout(Integer getTimeout){
        this.setGetTimeout(getTimeout);
        return this;
    }

    /**
     * <B>GROUPMOVEPSDEACTIONID</B>&nbsp;分组移动实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_GROUPMOVEPSDEACTIONID = "groupmovepsdeactionid";

    /**
     * 设置 分组移动实体行为
     * 
     * @param groupMovePSDEActionId
     * 
     */
    @JsonProperty(FIELD_GROUPMOVEPSDEACTIONID)
    public void setGroupMovePSDEActionId(String groupMovePSDEActionId){
        this.set(FIELD_GROUPMOVEPSDEACTIONID, groupMovePSDEActionId);
    }
    
    /**
     * 获取 分组移动实体行为  
     * @return
     */
    @JsonIgnore
    public String getGroupMovePSDEActionId(){
        Object objValue = this.get(FIELD_GROUPMOVEPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组移动实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupMovePSDEActionIdDirty(){
        if(this.contains(FIELD_GROUPMOVEPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组移动实体行为
     */
    @JsonIgnore
    public void resetGroupMovePSDEActionId(){
        this.reset(FIELD_GROUPMOVEPSDEACTIONID);
    }

    /**
     * 设置 分组移动实体行为
     * <P>
     * 等同 {@link #setGroupMovePSDEActionId}
     * @param groupMovePSDEActionId
     */
    @JsonIgnore
    public PSACHandler groupmovepsdeactionid(String groupMovePSDEActionId){
        this.setGroupMovePSDEActionId(groupMovePSDEActionId);
        return this;
    }

    /**
     * 设置 分组移动实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setGroupMovePSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSACHandler groupmovepsdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setGroupMovePSDEActionId(null);
            this.setGroupMovePSDEActionName(null);
        }
        else{
            this.setGroupMovePSDEActionId(pSDEAction.getPSDEActionId());
            this.setGroupMovePSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>GROUPMOVEPSDEACTIONNAME</B>&nbsp;分组移动实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GROUPMOVEPSDEACTIONID}
     */
    public final static String FIELD_GROUPMOVEPSDEACTIONNAME = "groupmovepsdeactionname";

    /**
     * 设置 分组移动实体行为
     * 
     * @param groupMovePSDEActionName
     * 
     */
    @JsonProperty(FIELD_GROUPMOVEPSDEACTIONNAME)
    public void setGroupMovePSDEActionName(String groupMovePSDEActionName){
        this.set(FIELD_GROUPMOVEPSDEACTIONNAME, groupMovePSDEActionName);
    }
    
    /**
     * 获取 分组移动实体行为  
     * @return
     */
    @JsonIgnore
    public String getGroupMovePSDEActionName(){
        Object objValue = this.get(FIELD_GROUPMOVEPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组移动实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupMovePSDEActionNameDirty(){
        if(this.contains(FIELD_GROUPMOVEPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组移动实体行为
     */
    @JsonIgnore
    public void resetGroupMovePSDEActionName(){
        this.reset(FIELD_GROUPMOVEPSDEACTIONNAME);
    }

    /**
     * 设置 分组移动实体行为
     * <P>
     * 等同 {@link #setGroupMovePSDEActionName}
     * @param groupMovePSDEActionName
     */
    @JsonIgnore
    public PSACHandler groupmovepsdeactionname(String groupMovePSDEActionName){
        this.setGroupMovePSDEActionName(groupMovePSDEActionName);
        return this;
    }

    /**
     * <B>GROUPPSDEID</B>&nbsp;分组实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_GROUPPSDEID = "grouppsdeid";

    /**
     * 设置 分组实体
     * 
     * @param groupPSDEId
     * 
     */
    @JsonProperty(FIELD_GROUPPSDEID)
    public void setGroupPSDEId(String groupPSDEId){
        this.set(FIELD_GROUPPSDEID, groupPSDEId);
    }
    
    /**
     * 获取 分组实体  
     * @return
     */
    @JsonIgnore
    public String getGroupPSDEId(){
        Object objValue = this.get(FIELD_GROUPPSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSDEIdDirty(){
        if(this.contains(FIELD_GROUPPSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组实体
     */
    @JsonIgnore
    public void resetGroupPSDEId(){
        this.reset(FIELD_GROUPPSDEID);
    }

    /**
     * 设置 分组实体
     * <P>
     * 等同 {@link #setGroupPSDEId}
     * @param groupPSDEId
     */
    @JsonIgnore
    public PSACHandler grouppsdeid(String groupPSDEId){
        this.setGroupPSDEId(groupPSDEId);
        return this;
    }

    /**
     * 设置 分组实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setGroupPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSACHandler grouppsdeid(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setGroupPSDEId(null);
            this.setGroupPSDEName(null);
        }
        else{
            this.setGroupPSDEId(pSDataEntity.getPSDataEntityId());
            this.setGroupPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>GROUPPSDENAME</B>&nbsp;分组实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GROUPPSDEID}
     */
    public final static String FIELD_GROUPPSDENAME = "grouppsdename";

    /**
     * 设置 分组实体
     * 
     * @param groupPSDEName
     * 
     */
    @JsonProperty(FIELD_GROUPPSDENAME)
    public void setGroupPSDEName(String groupPSDEName){
        this.set(FIELD_GROUPPSDENAME, groupPSDEName);
    }
    
    /**
     * 获取 分组实体  
     * @return
     */
    @JsonIgnore
    public String getGroupPSDEName(){
        Object objValue = this.get(FIELD_GROUPPSDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSDENameDirty(){
        if(this.contains(FIELD_GROUPPSDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组实体
     */
    @JsonIgnore
    public void resetGroupPSDEName(){
        this.reset(FIELD_GROUPPSDENAME);
    }

    /**
     * 设置 分组实体
     * <P>
     * 等同 {@link #setGroupPSDEName}
     * @param groupPSDEName
     */
    @JsonIgnore
    public PSACHandler grouppsdename(String groupPSDEName){
        this.setGroupPSDEName(groupPSDEName);
        return this;
    }

    /**
     * <B>HANDLEROBJ</B>&nbsp;处理对象
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_HANDLEROBJ = "handlerobj";

    /**
     * 设置 处理对象
     * 
     * @param handlerObj
     * 
     */
    @JsonProperty(FIELD_HANDLEROBJ)
    public void setHandlerObj(String handlerObj){
        this.set(FIELD_HANDLEROBJ, handlerObj);
    }
    
    /**
     * 获取 处理对象  
     * @return
     */
    @JsonIgnore
    public String getHandlerObj(){
        Object objValue = this.get(FIELD_HANDLEROBJ);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 处理对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHandlerObjDirty(){
        if(this.contains(FIELD_HANDLEROBJ)){
            return true;
        }
        return false;
    }

    /**
     * 重置 处理对象
     */
    @JsonIgnore
    public void resetHandlerObj(){
        this.reset(FIELD_HANDLEROBJ);
    }

    /**
     * 设置 处理对象
     * <P>
     * 等同 {@link #setHandlerObj}
     * @param handlerObj
     */
    @JsonIgnore
    public PSACHandler handlerobj(String handlerObj){
        this.setHandlerObj(handlerObj);
        return this;
    }

    /**
     * <B>HANDLEROBJ2</B>&nbsp;工作流视图处理对象
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_HANDLEROBJ2 = "handlerobj2";

    /**
     * 设置 工作流视图处理对象
     * 
     * @param handlerObj2
     * 
     */
    @JsonProperty(FIELD_HANDLEROBJ2)
    public void setHandlerObj2(String handlerObj2){
        this.set(FIELD_HANDLEROBJ2, handlerObj2);
    }
    
    /**
     * 获取 工作流视图处理对象  
     * @return
     */
    @JsonIgnore
    public String getHandlerObj2(){
        Object objValue = this.get(FIELD_HANDLEROBJ2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工作流视图处理对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHandlerObj2Dirty(){
        if(this.contains(FIELD_HANDLEROBJ2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工作流视图处理对象
     */
    @JsonIgnore
    public void resetHandlerObj2(){
        this.reset(FIELD_HANDLEROBJ2);
    }

    /**
     * 设置 工作流视图处理对象
     * <P>
     * 等同 {@link #setHandlerObj2}
     * @param handlerObj2
     */
    @JsonIgnore
    public PSACHandler handlerobj2(String handlerObj2){
        this.setHandlerObj2(handlerObj2);
        return this;
    }

    /**
     * <B>HANDLERPARAMS</B>&nbsp;处理器动态参数
     */
    public final static String FIELD_HANDLERPARAMS = "handlerparams";

    /**
     * 设置 处理器动态参数
     * 
     * @param handlerParams
     * 
     */
    @JsonProperty(FIELD_HANDLERPARAMS)
    public void setHandlerParams(String handlerParams){
        this.set(FIELD_HANDLERPARAMS, handlerParams);
    }
    
    /**
     * 获取 处理器动态参数  
     * @return
     */
    @JsonIgnore
    public String getHandlerParams(){
        Object objValue = this.get(FIELD_HANDLERPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 处理器动态参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHandlerParamsDirty(){
        if(this.contains(FIELD_HANDLERPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 处理器动态参数
     */
    @JsonIgnore
    public void resetHandlerParams(){
        this.reset(FIELD_HANDLERPARAMS);
    }

    /**
     * 设置 处理器动态参数
     * <P>
     * 等同 {@link #setHandlerParams}
     * @param handlerParams
     */
    @JsonIgnore
    public PSACHandler handlerparams(String handlerParams){
        this.setHandlerParams(handlerParams);
        return this;
    }

    /**
     * <B>HANDLERTAG</B>&nbsp;处理对象标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_HANDLERTAG = "handlertag";

    /**
     * 设置 处理对象标记
     * 
     * @param handlerTag
     * 
     */
    @JsonProperty(FIELD_HANDLERTAG)
    public void setHandlerTag(String handlerTag){
        this.set(FIELD_HANDLERTAG, handlerTag);
    }
    
    /**
     * 获取 处理对象标记  
     * @return
     */
    @JsonIgnore
    public String getHandlerTag(){
        Object objValue = this.get(FIELD_HANDLERTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 处理对象标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHandlerTagDirty(){
        if(this.contains(FIELD_HANDLERTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 处理对象标记
     */
    @JsonIgnore
    public void resetHandlerTag(){
        this.reset(FIELD_HANDLERTAG);
    }

    /**
     * 设置 处理对象标记
     * <P>
     * 等同 {@link #setHandlerTag}
     * @param handlerTag
     */
    @JsonIgnore
    public PSACHandler handlertag(String handlerTag){
        this.setHandlerTag(handlerTag);
        return this;
    }

    /**
     * <B>HANDLERTAG2</B>&nbsp;处理对象标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_HANDLERTAG2 = "handlertag2";

    /**
     * 设置 处理对象标记2
     * 
     * @param handlerTag2
     * 
     */
    @JsonProperty(FIELD_HANDLERTAG2)
    public void setHandlerTag2(String handlerTag2){
        this.set(FIELD_HANDLERTAG2, handlerTag2);
    }
    
    /**
     * 获取 处理对象标记2  
     * @return
     */
    @JsonIgnore
    public String getHandlerTag2(){
        Object objValue = this.get(FIELD_HANDLERTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 处理对象标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHandlerTag2Dirty(){
        if(this.contains(FIELD_HANDLERTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 处理对象标记2
     */
    @JsonIgnore
    public void resetHandlerTag2(){
        this.reset(FIELD_HANDLERTAG2);
    }

    /**
     * 设置 处理对象标记2
     * <P>
     * 等同 {@link #setHandlerTag2}
     * @param handlerTag2
     */
    @JsonIgnore
    public PSACHandler handlertag2(String handlerTag2){
        this.setHandlerTag2(handlerTag2);
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
    public PSACHandler memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MOVEPSDEACTIONID</B>&nbsp;移动数据实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_MOVEPSDEACTIONID = "movepsdeactionid";

    /**
     * 设置 移动数据实体行为
     * 
     * @param movePSDEActionId
     * 
     */
    @JsonProperty(FIELD_MOVEPSDEACTIONID)
    public void setMovePSDEActionId(String movePSDEActionId){
        this.set(FIELD_MOVEPSDEACTIONID, movePSDEActionId);
    }
    
    /**
     * 获取 移动数据实体行为  
     * @return
     */
    @JsonIgnore
    public String getMovePSDEActionId(){
        Object objValue = this.get(FIELD_MOVEPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动数据实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMovePSDEActionIdDirty(){
        if(this.contains(FIELD_MOVEPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动数据实体行为
     */
    @JsonIgnore
    public void resetMovePSDEActionId(){
        this.reset(FIELD_MOVEPSDEACTIONID);
    }

    /**
     * 设置 移动数据实体行为
     * <P>
     * 等同 {@link #setMovePSDEActionId}
     * @param movePSDEActionId
     */
    @JsonIgnore
    public PSACHandler movepsdeactionid(String movePSDEActionId){
        this.setMovePSDEActionId(movePSDEActionId);
        return this;
    }

    /**
     * 设置 移动数据实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMovePSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSACHandler movepsdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setMovePSDEActionId(null);
            this.setMovePSDEActionName(null);
        }
        else{
            this.setMovePSDEActionId(pSDEAction.getPSDEActionId());
            this.setMovePSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>MOVEPSDEACTIONNAME</B>&nbsp;移动数据实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOVEPSDEACTIONID}
     */
    public final static String FIELD_MOVEPSDEACTIONNAME = "movepsdeactionname";

    /**
     * 设置 移动数据实体行为
     * 
     * @param movePSDEActionName
     * 
     */
    @JsonProperty(FIELD_MOVEPSDEACTIONNAME)
    public void setMovePSDEActionName(String movePSDEActionName){
        this.set(FIELD_MOVEPSDEACTIONNAME, movePSDEActionName);
    }
    
    /**
     * 获取 移动数据实体行为  
     * @return
     */
    @JsonIgnore
    public String getMovePSDEActionName(){
        Object objValue = this.get(FIELD_MOVEPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动数据实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMovePSDEActionNameDirty(){
        if(this.contains(FIELD_MOVEPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动数据实体行为
     */
    @JsonIgnore
    public void resetMovePSDEActionName(){
        this.reset(FIELD_MOVEPSDEACTIONNAME);
    }

    /**
     * 设置 移动数据实体行为
     * <P>
     * 等同 {@link #setMovePSDEActionName}
     * @param movePSDEActionName
     */
    @JsonIgnore
    public PSACHandler movepsdeactionname(String movePSDEActionName){
        this.setMovePSDEActionName(movePSDEActionName);
        return this;
    }

    /**
     * <B>ORGDR</B>&nbsp;机构数据范围，界面部件启用机构数据范围功能，指定机构的数据范围
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
    public PSACHandler orgdr(Integer orgDR){
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
    public PSACHandler orgdr(net.ibizsys.psmodel.core.util.PSModelEnums.OrgScope[] orgDR){
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
     * <B>PSACHANDLERID</B>&nbsp;部件后台处理标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSACHANDLERID = "psachandlerid";

    /**
     * 设置 部件后台处理标识
     * 
     * @param pSACHandlerId
     * 
     */
    @JsonProperty(FIELD_PSACHANDLERID)
    public void setPSACHandlerId(String pSACHandlerId){
        this.set(FIELD_PSACHANDLERID, pSACHandlerId);
    }
    
    /**
     * 获取 部件后台处理标识  
     * @return
     */
    @JsonIgnore
    public String getPSACHandlerId(){
        Object objValue = this.get(FIELD_PSACHANDLERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件后台处理标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSACHandlerIdDirty(){
        if(this.contains(FIELD_PSACHANDLERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件后台处理标识
     */
    @JsonIgnore
    public void resetPSACHandlerId(){
        this.reset(FIELD_PSACHANDLERID);
    }

    /**
     * 设置 部件后台处理标识
     * <P>
     * 等同 {@link #setPSACHandlerId}
     * @param pSACHandlerId
     */
    @JsonIgnore
    public PSACHandler psachandlerid(String pSACHandlerId){
        this.setPSACHandlerId(pSACHandlerId);
        return this;
    }

    /**
     * <B>PSACHANDLERNAME</B>&nbsp;处理对象名称，指定界面处理对象的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSACHANDLERNAME = "psachandlername";

    /**
     * 设置 处理对象名称，详细说明：{@link #FIELD_PSACHANDLERNAME}
     * 
     * @param pSACHandlerName
     * 
     */
    @JsonProperty(FIELD_PSACHANDLERNAME)
    public void setPSACHandlerName(String pSACHandlerName){
        this.set(FIELD_PSACHANDLERNAME, pSACHandlerName);
    }
    
    /**
     * 获取 处理对象名称  
     * @return
     */
    @JsonIgnore
    public String getPSACHandlerName(){
        Object objValue = this.get(FIELD_PSACHANDLERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 处理对象名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSACHandlerNameDirty(){
        if(this.contains(FIELD_PSACHANDLERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 处理对象名称
     */
    @JsonIgnore
    public void resetPSACHandlerName(){
        this.reset(FIELD_PSACHANDLERNAME);
    }

    /**
     * 设置 处理对象名称，详细说明：{@link #FIELD_PSACHANDLERNAME}
     * <P>
     * 等同 {@link #setPSACHandlerName}
     * @param pSACHandlerName
     */
    @JsonIgnore
    public PSACHandler psachandlername(String pSACHandlerName){
        this.setPSACHandlerName(pSACHandlerName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSACHandlerName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSACHandlerName(strName);
    }

    @JsonIgnore
    public PSACHandler name(String strName){
        this.setPSACHandlerName(strName);
        return this;
    }

    /**
     * <B>PSDEDATASETID</B>&nbsp;数据集合，指定界面处理对象查询数据使用的结果集对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataSet} 
     */
    public final static String FIELD_PSDEDATASETID = "psdedatasetid";

    /**
     * 设置 数据集合，详细说明：{@link #FIELD_PSDEDATASETID}
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
     * 设置 数据集合，详细说明：{@link #FIELD_PSDEDATASETID}
     * <P>
     * 等同 {@link #setPSDEDataSetId}
     * @param pSDEDataSetId
     */
    @JsonIgnore
    public PSACHandler psdedatasetid(String pSDEDataSetId){
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
    public PSACHandler psdedatasetid(PSDEDataSet pSDEDataSet){
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
     * <B>PSDEDATASETNAME</B>&nbsp;数据集合，指定界面处理对象查询数据使用的结果集对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDATASETID}
     */
    public final static String FIELD_PSDEDATASETNAME = "psdedatasetname";

    /**
     * 设置 数据集合，详细说明：{@link #FIELD_PSDEDATASETNAME}
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
     * 设置 数据集合，详细说明：{@link #FIELD_PSDEDATASETNAME}
     * <P>
     * 等同 {@link #setPSDEDataSetName}
     * @param pSDEDataSetName
     */
    @JsonIgnore
    public PSACHandler psdedatasetname(String pSDEDataSetName){
        this.setPSDEDataSetName(pSDEDataSetName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定界面处理对象相关的实体对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
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
    public PSACHandler psdeid(String pSDEId){
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
    public PSACHandler psdeid(PSDataEntity pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;实体，指定界面处理对象相关的实体对象
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
    public PSACHandler psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定部件后台处理所在的系统模块
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
    public PSACHandler psmoduleid(String pSModuleId){
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
    public PSACHandler psmoduleid(PSModule pSModule){
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
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定部件后台处理所在的系统模块
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
    public PSACHandler psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSFACHANDLERID</B>&nbsp;系统服务部件处理器，指定平台的预置处理器对象
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSFACHANDLERID = "pssfachandlerid";

    /**
     * 设置 系统服务部件处理器，详细说明：{@link #FIELD_PSSFACHANDLERID}
     * 
     * @param pSSFACHandlerId
     * 
     */
    @JsonProperty(FIELD_PSSFACHANDLERID)
    public void setPSSFACHandlerId(String pSSFACHandlerId){
        this.set(FIELD_PSSFACHANDLERID, pSSFACHandlerId);
    }
    
    /**
     * 获取 系统服务部件处理器  
     * @return
     */
    @JsonIgnore
    public String getPSSFACHandlerId(){
        Object objValue = this.get(FIELD_PSSFACHANDLERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统服务部件处理器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSFACHandlerIdDirty(){
        if(this.contains(FIELD_PSSFACHANDLERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统服务部件处理器
     */
    @JsonIgnore
    public void resetPSSFACHandlerId(){
        this.reset(FIELD_PSSFACHANDLERID);
    }

    /**
     * 设置 系统服务部件处理器，详细说明：{@link #FIELD_PSSFACHANDLERID}
     * <P>
     * 等同 {@link #setPSSFACHandlerId}
     * @param pSSFACHandlerId
     */
    @JsonIgnore
    public PSACHandler pssfachandlerid(String pSSFACHandlerId){
        this.setPSSFACHandlerId(pSSFACHandlerId);
        return this;
    }

    /**
     * <B>PSSFACHANDLERNAME</B>&nbsp;平台预置处理器，指定平台的预置处理器对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSFACHANDLERID}
     */
    public final static String FIELD_PSSFACHANDLERNAME = "pssfachandlername";

    /**
     * 设置 平台预置处理器，详细说明：{@link #FIELD_PSSFACHANDLERNAME}
     * 
     * @param pSSFACHandlerName
     * 
     */
    @JsonProperty(FIELD_PSSFACHANDLERNAME)
    public void setPSSFACHandlerName(String pSSFACHandlerName){
        this.set(FIELD_PSSFACHANDLERNAME, pSSFACHandlerName);
    }
    
    /**
     * 获取 平台预置处理器  
     * @return
     */
    @JsonIgnore
    public String getPSSFACHandlerName(){
        Object objValue = this.get(FIELD_PSSFACHANDLERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 平台预置处理器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSFACHandlerNameDirty(){
        if(this.contains(FIELD_PSSFACHANDLERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 平台预置处理器
     */
    @JsonIgnore
    public void resetPSSFACHandlerName(){
        this.reset(FIELD_PSSFACHANDLERNAME);
    }

    /**
     * 设置 平台预置处理器，详细说明：{@link #FIELD_PSSFACHANDLERNAME}
     * <P>
     * 等同 {@link #setPSSFACHandlerName}
     * @param pSSFACHandlerName
     */
    @JsonIgnore
    public PSACHandler pssfachandlername(String pSSFACHandlerName){
        this.setPSSFACHandlerName(pSSFACHandlerName);
        return this;
    }

    /**
     * <B>PSSFID</B>&nbsp;后台服务体系标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSFACHANDLERID}
     */
    public final static String FIELD_PSSFID = "pssfid";

    /**
     * 设置 后台服务体系标识
     * 
     * @param pSSFId
     * 
     */
    @JsonProperty(FIELD_PSSFID)
    public void setPSSFId(String pSSFId){
        this.set(FIELD_PSSFID, pSSFId);
    }
    
    /**
     * 获取 后台服务体系标识  
     * @return
     */
    @JsonIgnore
    public String getPSSFId(){
        Object objValue = this.get(FIELD_PSSFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台服务体系标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSFIdDirty(){
        if(this.contains(FIELD_PSSFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台服务体系标识
     */
    @JsonIgnore
    public void resetPSSFId(){
        this.reset(FIELD_PSSFID);
    }

    /**
     * 设置 后台服务体系标识
     * <P>
     * 等同 {@link #setPSSFId}
     * @param pSSFId
     */
    @JsonIgnore
    public PSACHandler pssfid(String pSSFId){
        this.setPSSFId(pSSFId);
        return this;
    }

    /**
     * <B>PSSFNAME</B>&nbsp;后台服务体系
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSFACHANDLERID}
     */
    public final static String FIELD_PSSFNAME = "pssfname";

    /**
     * 设置 后台服务体系
     * 
     * @param pSSFName
     * 
     */
    @JsonProperty(FIELD_PSSFNAME)
    public void setPSSFName(String pSSFName){
        this.set(FIELD_PSSFNAME, pSSFName);
    }
    
    /**
     * 获取 后台服务体系  
     * @return
     */
    @JsonIgnore
    public String getPSSFName(){
        Object objValue = this.get(FIELD_PSSFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台服务体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSFNameDirty(){
        if(this.contains(FIELD_PSSFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台服务体系
     */
    @JsonIgnore
    public void resetPSSFName(){
        this.reset(FIELD_PSSFNAME);
    }

    /**
     * 设置 后台服务体系
     * <P>
     * 等同 {@link #setPSSFName}
     * @param pSSFName
     */
    @JsonIgnore
    public PSACHandler pssfname(String pSSFName){
        this.setPSSFName(pSSFName);
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELID</B>&nbsp;扩展动态模型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDynaModel} 
     */
    public final static String FIELD_PSSYSDYNAMODELID = "pssysdynamodelid";

    /**
     * 设置 扩展动态模型
     * 
     * @param pSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELID)
    public void setPSSysDynaModelId(String pSSysDynaModelId){
        this.set(FIELD_PSSYSDYNAMODELID, pSSysDynaModelId);
    }
    
    /**
     * 获取 扩展动态模型  
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
     * 判断 扩展动态模型 是否指定值，包括空值
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
     * 重置 扩展动态模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelId(){
        this.reset(FIELD_PSSYSDYNAMODELID);
    }

    /**
     * 设置 扩展动态模型
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModelId
     */
    @JsonIgnore
    public PSACHandler pssysdynamodelid(String pSSysDynaModelId){
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    /**
     * 设置 扩展动态模型，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModel 引用对象
     */
    @JsonIgnore
    public PSACHandler pssysdynamodelid(PSSysDynaModel pSSysDynaModel){
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
     * <B>PSSYSDYNAMODELNAME</B>&nbsp;扩展动态模型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDYNAMODELID}
     */
    public final static String FIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";

    /**
     * 设置 扩展动态模型
     * 
     * @param pSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELNAME)
    public void setPSSysDynaModelName(String pSSysDynaModelName){
        this.set(FIELD_PSSYSDYNAMODELNAME, pSSysDynaModelName);
    }
    
    /**
     * 获取 扩展动态模型  
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
     * 判断 扩展动态模型 是否指定值，包括空值
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
     * 重置 扩展动态模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelName(){
        this.reset(FIELD_PSSYSDYNAMODELNAME);
    }

    /**
     * 设置 扩展动态模型
     * <P>
     * 等同 {@link #setPSSysDynaModelName}
     * @param pSSysDynaModelName
     */
    @JsonIgnore
    public PSACHandler pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
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
    public PSACHandler pssysreqitemid(String pSSysReqItemId){
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
    public PSACHandler pssysreqitemid(PSSysReqItem pSSysReqItem){
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
    public PSACHandler pssysreqitemname(String pSSysReqItemName){
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    /**
     * <B>PSSYSUNISTATEID</B>&nbsp;缓存统一状态，界面处理器启用数据集缓存能力，指定系统状态协同对象用于判断缓存是否已经失效
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysUniState} 
     */
    public final static String FIELD_PSSYSUNISTATEID = "pssysunistateid";

    /**
     * 设置 缓存统一状态，详细说明：{@link #FIELD_PSSYSUNISTATEID}
     * 
     * @param pSSysUniStateId
     * 
     */
    @JsonProperty(FIELD_PSSYSUNISTATEID)
    public void setPSSysUniStateId(String pSSysUniStateId){
        this.set(FIELD_PSSYSUNISTATEID, pSSysUniStateId);
    }
    
    /**
     * 获取 缓存统一状态  
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
     * 判断 缓存统一状态 是否指定值，包括空值
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
     * 重置 缓存统一状态
     */
    @JsonIgnore
    public void resetPSSysUniStateId(){
        this.reset(FIELD_PSSYSUNISTATEID);
    }

    /**
     * 设置 缓存统一状态，详细说明：{@link #FIELD_PSSYSUNISTATEID}
     * <P>
     * 等同 {@link #setPSSysUniStateId}
     * @param pSSysUniStateId
     */
    @JsonIgnore
    public PSACHandler pssysunistateid(String pSSysUniStateId){
        this.setPSSysUniStateId(pSSysUniStateId);
        return this;
    }

    /**
     * 设置 缓存统一状态，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysUniStateId}
     * @param pSSysUniState 引用对象
     */
    @JsonIgnore
    public PSACHandler pssysunistateid(PSSysUniState pSSysUniState){
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
     * <B>PSSYSUNISTATENAME</B>&nbsp;缓存统一状态，界面处理器启用数据集缓存能力，指定系统状态协同对象用于判断缓存是否已经失效
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSUNISTATEID}
     */
    public final static String FIELD_PSSYSUNISTATENAME = "pssysunistatename";

    /**
     * 设置 缓存统一状态，详细说明：{@link #FIELD_PSSYSUNISTATENAME}
     * 
     * @param pSSysUniStateName
     * 
     */
    @JsonProperty(FIELD_PSSYSUNISTATENAME)
    public void setPSSysUniStateName(String pSSysUniStateName){
        this.set(FIELD_PSSYSUNISTATENAME, pSSysUniStateName);
    }
    
    /**
     * 获取 缓存统一状态  
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
     * 判断 缓存统一状态 是否指定值，包括空值
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
     * 重置 缓存统一状态
     */
    @JsonIgnore
    public void resetPSSysUniStateName(){
        this.reset(FIELD_PSSYSUNISTATENAME);
    }

    /**
     * 设置 缓存统一状态，详细说明：{@link #FIELD_PSSYSUNISTATENAME}
     * <P>
     * 等同 {@link #setPSSysUniStateName}
     * @param pSSysUniStateName
     */
    @JsonIgnore
    public PSACHandler pssysunistatename(String pSSysUniStateName){
        this.setPSSysUniStateName(pSSysUniStateName);
        return this;
    }

    /**
     * <B>PSSYSUSERDRID</B>&nbsp;自定义数据范围，指定界面部件进行数据查询时使用的自定义数据范围
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
    public PSACHandler pssysuserdrid(String pSSysUserDRId){
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
    public PSACHandler pssysuserdrid(PSSysUserDR pSSysUserDR){
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
     * <B>PSSYSUSERDRID2</B>&nbsp;自定义数据范围2，指定界面部件进行数据查询时使用的自定义数据范围2
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
    public PSACHandler pssysuserdrid2(String pSSysUserDRId2){
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
    public PSACHandler pssysuserdrid2(PSSysUserDR pSSysUserDR){
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
     * <B>PSSYSUSERDRNAME</B>&nbsp;自定义数据范围，指定界面部件进行数据查询时使用的自定义数据范围
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
    public PSACHandler pssysuserdrname(String pSSysUserDRName){
        this.setPSSysUserDRName(pSSysUserDRName);
        return this;
    }

    /**
     * <B>PSSYSUSERDRNAME2</B>&nbsp;自定义数据范围2，指定界面部件进行数据查询时使用的自定义数据范围2
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
    public PSACHandler pssysuserdrname2(String pSSysUserDRName2){
        this.setPSSysUserDRName2(pSSysUserDRName2);
        return this;
    }

    /**
     * <B>READPSDEOPPRIVID</B>&nbsp;读取要求权限，指定界面处理对象读取数据需要具备的操作标识
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEOPPriv} 
     */
    public final static String FIELD_READPSDEOPPRIVID = "readpsdeopprivid";

    /**
     * 设置 读取要求权限，详细说明：{@link #FIELD_READPSDEOPPRIVID}
     * 
     * @param readPSDEOPPrivId
     * 
     */
    @JsonProperty(FIELD_READPSDEOPPRIVID)
    public void setReadPSDEOPPrivId(String readPSDEOPPrivId){
        this.set(FIELD_READPSDEOPPRIVID, readPSDEOPPrivId);
    }
    
    /**
     * 获取 读取要求权限  
     * @return
     */
    @JsonIgnore
    public String getReadPSDEOPPrivId(){
        Object objValue = this.get(FIELD_READPSDEOPPRIVID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 读取要求权限 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isReadPSDEOPPrivIdDirty(){
        if(this.contains(FIELD_READPSDEOPPRIVID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 读取要求权限
     */
    @JsonIgnore
    public void resetReadPSDEOPPrivId(){
        this.reset(FIELD_READPSDEOPPRIVID);
    }

    /**
     * 设置 读取要求权限，详细说明：{@link #FIELD_READPSDEOPPRIVID}
     * <P>
     * 等同 {@link #setReadPSDEOPPrivId}
     * @param readPSDEOPPrivId
     */
    @JsonIgnore
    public PSACHandler readpsdeopprivid(String readPSDEOPPrivId){
        this.setReadPSDEOPPrivId(readPSDEOPPrivId);
        return this;
    }

    /**
     * 设置 读取要求权限，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setReadPSDEOPPrivId}
     * @param pSDEOPPriv 引用对象
     */
    @JsonIgnore
    public PSACHandler readpsdeopprivid(PSDEOPPriv pSDEOPPriv){
        if(pSDEOPPriv == null){
            this.setReadPSDEOPPrivId(null);
            this.setReadPSDEOPPrivName(null);
        }
        else{
            this.setReadPSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setReadPSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    /**
     * <B>READPSDEOPPRIVNAME</B>&nbsp;读取要求权限，指定界面处理对象读取数据需要具备的操作标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_READPSDEOPPRIVID}
     */
    public final static String FIELD_READPSDEOPPRIVNAME = "readpsdeopprivname";

    /**
     * 设置 读取要求权限，详细说明：{@link #FIELD_READPSDEOPPRIVNAME}
     * 
     * @param readPSDEOPPrivName
     * 
     */
    @JsonProperty(FIELD_READPSDEOPPRIVNAME)
    public void setReadPSDEOPPrivName(String readPSDEOPPrivName){
        this.set(FIELD_READPSDEOPPRIVNAME, readPSDEOPPrivName);
    }
    
    /**
     * 获取 读取要求权限  
     * @return
     */
    @JsonIgnore
    public String getReadPSDEOPPrivName(){
        Object objValue = this.get(FIELD_READPSDEOPPRIVNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 读取要求权限 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isReadPSDEOPPrivNameDirty(){
        if(this.contains(FIELD_READPSDEOPPRIVNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 读取要求权限
     */
    @JsonIgnore
    public void resetReadPSDEOPPrivName(){
        this.reset(FIELD_READPSDEOPPRIVNAME);
    }

    /**
     * 设置 读取要求权限，详细说明：{@link #FIELD_READPSDEOPPRIVNAME}
     * <P>
     * 等同 {@link #setReadPSDEOPPrivName}
     * @param readPSDEOPPrivName
     */
    @JsonIgnore
    public PSACHandler readpsdeopprivname(String readPSDEOPPrivName){
        this.setReadPSDEOPPrivName(readPSDEOPPrivName);
        return this;
    }

    /**
     * <B>REMOVEPSDEACTIONID</B>&nbsp;删除数据实体行为，指定界面处理对象提供删除数据功能的实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_REMOVEPSDEACTIONID = "removepsdeactionid";

    /**
     * 设置 删除数据实体行为，详细说明：{@link #FIELD_REMOVEPSDEACTIONID}
     * 
     * @param removePSDEActionId
     * 
     */
    @JsonProperty(FIELD_REMOVEPSDEACTIONID)
    public void setRemovePSDEActionId(String removePSDEActionId){
        this.set(FIELD_REMOVEPSDEACTIONID, removePSDEActionId);
    }
    
    /**
     * 获取 删除数据实体行为  
     * @return
     */
    @JsonIgnore
    public String getRemovePSDEActionId(){
        Object objValue = this.get(FIELD_REMOVEPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 删除数据实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRemovePSDEActionIdDirty(){
        if(this.contains(FIELD_REMOVEPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 删除数据实体行为
     */
    @JsonIgnore
    public void resetRemovePSDEActionId(){
        this.reset(FIELD_REMOVEPSDEACTIONID);
    }

    /**
     * 设置 删除数据实体行为，详细说明：{@link #FIELD_REMOVEPSDEACTIONID}
     * <P>
     * 等同 {@link #setRemovePSDEActionId}
     * @param removePSDEActionId
     */
    @JsonIgnore
    public PSACHandler removepsdeactionid(String removePSDEActionId){
        this.setRemovePSDEActionId(removePSDEActionId);
        return this;
    }

    /**
     * 设置 删除数据实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRemovePSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSACHandler removepsdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setRemovePSDEActionId(null);
            this.setRemovePSDEActionName(null);
        }
        else{
            this.setRemovePSDEActionId(pSDEAction.getPSDEActionId());
            this.setRemovePSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>REMOVEPSDEACTIONNAME</B>&nbsp;删除数据实体行为，指定界面处理对象提供删除数据功能的实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REMOVEPSDEACTIONID}
     */
    public final static String FIELD_REMOVEPSDEACTIONNAME = "removepsdeactionname";

    /**
     * 设置 删除数据实体行为，详细说明：{@link #FIELD_REMOVEPSDEACTIONNAME}
     * 
     * @param removePSDEActionName
     * 
     */
    @JsonProperty(FIELD_REMOVEPSDEACTIONNAME)
    public void setRemovePSDEActionName(String removePSDEActionName){
        this.set(FIELD_REMOVEPSDEACTIONNAME, removePSDEActionName);
    }
    
    /**
     * 获取 删除数据实体行为  
     * @return
     */
    @JsonIgnore
    public String getRemovePSDEActionName(){
        Object objValue = this.get(FIELD_REMOVEPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 删除数据实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRemovePSDEActionNameDirty(){
        if(this.contains(FIELD_REMOVEPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 删除数据实体行为
     */
    @JsonIgnore
    public void resetRemovePSDEActionName(){
        this.reset(FIELD_REMOVEPSDEACTIONNAME);
    }

    /**
     * 设置 删除数据实体行为，详细说明：{@link #FIELD_REMOVEPSDEACTIONNAME}
     * <P>
     * 等同 {@link #setRemovePSDEActionName}
     * @param removePSDEActionName
     */
    @JsonIgnore
    public PSACHandler removepsdeactionname(String removePSDEActionName){
        this.setRemovePSDEActionName(removePSDEActionName);
        return this;
    }

    /**
     * <B>REMOVEPSDEOPPRIVID</B>&nbsp;删除要求权限，指定界面处理对象删除数据需要具备的操作标识
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEOPPriv} 
     */
    public final static String FIELD_REMOVEPSDEOPPRIVID = "removepsdeopprivid";

    /**
     * 设置 删除要求权限，详细说明：{@link #FIELD_REMOVEPSDEOPPRIVID}
     * 
     * @param removePSDEOPPrivId
     * 
     */
    @JsonProperty(FIELD_REMOVEPSDEOPPRIVID)
    public void setRemovePSDEOPPrivId(String removePSDEOPPrivId){
        this.set(FIELD_REMOVEPSDEOPPRIVID, removePSDEOPPrivId);
    }
    
    /**
     * 获取 删除要求权限  
     * @return
     */
    @JsonIgnore
    public String getRemovePSDEOPPrivId(){
        Object objValue = this.get(FIELD_REMOVEPSDEOPPRIVID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 删除要求权限 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRemovePSDEOPPrivIdDirty(){
        if(this.contains(FIELD_REMOVEPSDEOPPRIVID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 删除要求权限
     */
    @JsonIgnore
    public void resetRemovePSDEOPPrivId(){
        this.reset(FIELD_REMOVEPSDEOPPRIVID);
    }

    /**
     * 设置 删除要求权限，详细说明：{@link #FIELD_REMOVEPSDEOPPRIVID}
     * <P>
     * 等同 {@link #setRemovePSDEOPPrivId}
     * @param removePSDEOPPrivId
     */
    @JsonIgnore
    public PSACHandler removepsdeopprivid(String removePSDEOPPrivId){
        this.setRemovePSDEOPPrivId(removePSDEOPPrivId);
        return this;
    }

    /**
     * 设置 删除要求权限，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRemovePSDEOPPrivId}
     * @param pSDEOPPriv 引用对象
     */
    @JsonIgnore
    public PSACHandler removepsdeopprivid(PSDEOPPriv pSDEOPPriv){
        if(pSDEOPPriv == null){
            this.setRemovePSDEOPPrivId(null);
            this.setRemovePSDEOPPrivName(null);
        }
        else{
            this.setRemovePSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setRemovePSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    /**
     * <B>REMOVEPSDEOPPRIVNAME</B>&nbsp;删除要求权限，指定界面处理对象删除数据需要具备的操作标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REMOVEPSDEOPPRIVID}
     */
    public final static String FIELD_REMOVEPSDEOPPRIVNAME = "removepsdeopprivname";

    /**
     * 设置 删除要求权限，详细说明：{@link #FIELD_REMOVEPSDEOPPRIVNAME}
     * 
     * @param removePSDEOPPrivName
     * 
     */
    @JsonProperty(FIELD_REMOVEPSDEOPPRIVNAME)
    public void setRemovePSDEOPPrivName(String removePSDEOPPrivName){
        this.set(FIELD_REMOVEPSDEOPPRIVNAME, removePSDEOPPrivName);
    }
    
    /**
     * 获取 删除要求权限  
     * @return
     */
    @JsonIgnore
    public String getRemovePSDEOPPrivName(){
        Object objValue = this.get(FIELD_REMOVEPSDEOPPRIVNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 删除要求权限 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRemovePSDEOPPrivNameDirty(){
        if(this.contains(FIELD_REMOVEPSDEOPPRIVNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 删除要求权限
     */
    @JsonIgnore
    public void resetRemovePSDEOPPrivName(){
        this.reset(FIELD_REMOVEPSDEOPPRIVNAME);
    }

    /**
     * 设置 删除要求权限，详细说明：{@link #FIELD_REMOVEPSDEOPPRIVNAME}
     * <P>
     * 等同 {@link #setRemovePSDEOPPrivName}
     * @param removePSDEOPPrivName
     */
    @JsonIgnore
    public PSACHandler removepsdeopprivname(String removePSDEOPPrivName){
        this.setRemovePSDEOPPrivName(removePSDEOPPrivName);
        return this;
    }

    /**
     * <B>REMOVETIMEOUT</B>&nbsp;删除超时，指定界面处理对象删除数据的超时时长，单位为【毫秒】，-1为永不过期，未定义时为【-1】
     */
    public final static String FIELD_REMOVETIMEOUT = "removetimeout";

    /**
     * 设置 删除超时，详细说明：{@link #FIELD_REMOVETIMEOUT}
     * 
     * @param removeTimeout
     * 
     */
    @JsonProperty(FIELD_REMOVETIMEOUT)
    public void setRemoveTimeout(Integer removeTimeout){
        this.set(FIELD_REMOVETIMEOUT, removeTimeout);
    }
    
    /**
     * 获取 删除超时  
     * @return
     */
    @JsonIgnore
    public Integer getRemoveTimeout(){
        Object objValue = this.get(FIELD_REMOVETIMEOUT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 删除超时 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRemoveTimeoutDirty(){
        if(this.contains(FIELD_REMOVETIMEOUT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 删除超时
     */
    @JsonIgnore
    public void resetRemoveTimeout(){
        this.reset(FIELD_REMOVETIMEOUT);
    }

    /**
     * 设置 删除超时，详细说明：{@link #FIELD_REMOVETIMEOUT}
     * <P>
     * 等同 {@link #setRemoveTimeout}
     * @param removeTimeout
     */
    @JsonIgnore
    public PSACHandler removetimeout(Integer removeTimeout){
        this.setRemoveTimeout(removeTimeout);
        return this;
    }

    /**
     * <B>SECBC</B>&nbsp;部门业务代码，界面部件启用部门业务条线数据范围功能，指定部门的业务代码
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
    public PSACHandler secbc(String secBC){
        this.setSecBC(secBC);
        return this;
    }

    /**
     * <B>SECDR</B>&nbsp;部门数据范围，界面部件启用部门数据范围功能，指定部门的数据范围
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
    public PSACHandler secdr(Integer secDR){
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
    public PSACHandler secdr(net.ibizsys.psmodel.core.util.PSModelEnums.DeptScope[] secDR){
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
     * <B>SYSUSERDR2PARAM</B>&nbsp;自定义范围2参数，界面部件启用自定义数据范围2时，进一步指定范围的参数
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
    public PSACHandler sysuserdr2param(String sysUserDR2Param){
        this.setSysUserDR2Param(sysUserDR2Param);
        return this;
    }

    /**
     * <B>SYSUSERDRPARAM</B>&nbsp;自定义范围参数，界面部件启用自定义数据范围时，进一步指定范围的参数
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
    public PSACHandler sysuserdrparam(String sysUserDRParam){
        this.setSysUserDRParam(sysUserDRParam);
        return this;
    }

    /**
     * <B>TEMPMODE</B>&nbsp;临时数据模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.TempDataMode} 
     */
    public final static String FIELD_TEMPMODE = "tempmode";

    /**
     * 设置 临时数据模式
     * 
     * @param tempMode
     * 
     */
    @JsonProperty(FIELD_TEMPMODE)
    public void setTempMode(Integer tempMode){
        this.set(FIELD_TEMPMODE, tempMode);
    }
    
    /**
     * 获取 临时数据模式  
     * @return
     */
    @JsonIgnore
    public Integer getTempMode(){
        Object objValue = this.get(FIELD_TEMPMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 临时数据模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTempModeDirty(){
        if(this.contains(FIELD_TEMPMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 临时数据模式
     */
    @JsonIgnore
    public void resetTempMode(){
        this.reset(FIELD_TEMPMODE);
    }

    /**
     * 设置 临时数据模式
     * <P>
     * 等同 {@link #setTempMode}
     * @param tempMode
     */
    @JsonIgnore
    public PSACHandler tempmode(Integer tempMode){
        this.setTempMode(tempMode);
        return this;
    }

     /**
     * 设置 临时数据模式
     * <P>
     * 等同 {@link #setTempMode}
     * @param tempMode
     */
    @JsonIgnore
    public PSACHandler tempmode(net.ibizsys.psmodel.core.util.PSModelEnums.TempDataMode tempMode){
        if(tempMode == null){
            this.setTempMode(null);
        }
        else{
            this.setTempMode(tempMode.value);
        }
        return this;
    }

    /**
     * <B>UNISTATEFIELD</B>&nbsp;统一状态监控属性，界面处理器启用数据集缓存能力，指定系统状态协同对象中的监控属性
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_UNISTATEFIELD = "unistatefield";

    /**
     * 设置 统一状态监控属性，详细说明：{@link #FIELD_UNISTATEFIELD}
     * 
     * @param uniStateField
     * 
     */
    @JsonProperty(FIELD_UNISTATEFIELD)
    public void setUniStateField(String uniStateField){
        this.set(FIELD_UNISTATEFIELD, uniStateField);
    }
    
    /**
     * 获取 统一状态监控属性  
     * @return
     */
    @JsonIgnore
    public String getUniStateField(){
        Object objValue = this.get(FIELD_UNISTATEFIELD);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 统一状态监控属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUniStateFieldDirty(){
        if(this.contains(FIELD_UNISTATEFIELD)){
            return true;
        }
        return false;
    }

    /**
     * 重置 统一状态监控属性
     */
    @JsonIgnore
    public void resetUniStateField(){
        this.reset(FIELD_UNISTATEFIELD);
    }

    /**
     * 设置 统一状态监控属性，详细说明：{@link #FIELD_UNISTATEFIELD}
     * <P>
     * 等同 {@link #setUniStateField}
     * @param uniStateField
     */
    @JsonIgnore
    public PSACHandler unistatefield(String uniStateField){
        this.setUniStateField(uniStateField);
        return this;
    }

    /**
     * <B>UNISTATEKEYVALUE</B>&nbsp;统一状态数据标识，界面处理器启用数据集缓存能力，指定系统状态协同对象中的数据标识
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_UNISTATEKEYVALUE = "unistatekeyvalue";

    /**
     * 设置 统一状态数据标识，详细说明：{@link #FIELD_UNISTATEKEYVALUE}
     * 
     * @param uniStateKeyValue
     * 
     */
    @JsonProperty(FIELD_UNISTATEKEYVALUE)
    public void setUniStateKeyValue(String uniStateKeyValue){
        this.set(FIELD_UNISTATEKEYVALUE, uniStateKeyValue);
    }
    
    /**
     * 获取 统一状态数据标识  
     * @return
     */
    @JsonIgnore
    public String getUniStateKeyValue(){
        Object objValue = this.get(FIELD_UNISTATEKEYVALUE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 统一状态数据标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUniStateKeyValueDirty(){
        if(this.contains(FIELD_UNISTATEKEYVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 统一状态数据标识
     */
    @JsonIgnore
    public void resetUniStateKeyValue(){
        this.reset(FIELD_UNISTATEKEYVALUE);
    }

    /**
     * 设置 统一状态数据标识，详细说明：{@link #FIELD_UNISTATEKEYVALUE}
     * <P>
     * 等同 {@link #setUniStateKeyValue}
     * @param uniStateKeyValue
     */
    @JsonIgnore
    public PSACHandler unistatekeyvalue(String uniStateKeyValue){
        this.setUniStateKeyValue(uniStateKeyValue);
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
    public PSACHandler updatedate(String updateDate){
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
    public PSACHandler updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>UPDATEPSDEACTIONID</B>&nbsp;更新数据实体行为，指定界面处理对象提供更新数据功能的实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_UPDATEPSDEACTIONID = "updatepsdeactionid";

    /**
     * 设置 更新数据实体行为，详细说明：{@link #FIELD_UPDATEPSDEACTIONID}
     * 
     * @param updatePSDEActionId
     * 
     */
    @JsonProperty(FIELD_UPDATEPSDEACTIONID)
    public void setUpdatePSDEActionId(String updatePSDEActionId){
        this.set(FIELD_UPDATEPSDEACTIONID, updatePSDEActionId);
    }
    
    /**
     * 获取 更新数据实体行为  
     * @return
     */
    @JsonIgnore
    public String getUpdatePSDEActionId(){
        Object objValue = this.get(FIELD_UPDATEPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 更新数据实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUpdatePSDEActionIdDirty(){
        if(this.contains(FIELD_UPDATEPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 更新数据实体行为
     */
    @JsonIgnore
    public void resetUpdatePSDEActionId(){
        this.reset(FIELD_UPDATEPSDEACTIONID);
    }

    /**
     * 设置 更新数据实体行为，详细说明：{@link #FIELD_UPDATEPSDEACTIONID}
     * <P>
     * 等同 {@link #setUpdatePSDEActionId}
     * @param updatePSDEActionId
     */
    @JsonIgnore
    public PSACHandler updatepsdeactionid(String updatePSDEActionId){
        this.setUpdatePSDEActionId(updatePSDEActionId);
        return this;
    }

    /**
     * 设置 更新数据实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUpdatePSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSACHandler updatepsdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setUpdatePSDEActionId(null);
            this.setUpdatePSDEActionName(null);
        }
        else{
            this.setUpdatePSDEActionId(pSDEAction.getPSDEActionId());
            this.setUpdatePSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>UPDATEPSDEACTIONNAME</B>&nbsp;更新数据实体行为，指定界面处理对象提供更新数据功能的实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UPDATEPSDEACTIONID}
     */
    public final static String FIELD_UPDATEPSDEACTIONNAME = "updatepsdeactionname";

    /**
     * 设置 更新数据实体行为，详细说明：{@link #FIELD_UPDATEPSDEACTIONNAME}
     * 
     * @param updatePSDEActionName
     * 
     */
    @JsonProperty(FIELD_UPDATEPSDEACTIONNAME)
    public void setUpdatePSDEActionName(String updatePSDEActionName){
        this.set(FIELD_UPDATEPSDEACTIONNAME, updatePSDEActionName);
    }
    
    /**
     * 获取 更新数据实体行为  
     * @return
     */
    @JsonIgnore
    public String getUpdatePSDEActionName(){
        Object objValue = this.get(FIELD_UPDATEPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 更新数据实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUpdatePSDEActionNameDirty(){
        if(this.contains(FIELD_UPDATEPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 更新数据实体行为
     */
    @JsonIgnore
    public void resetUpdatePSDEActionName(){
        this.reset(FIELD_UPDATEPSDEACTIONNAME);
    }

    /**
     * 设置 更新数据实体行为，详细说明：{@link #FIELD_UPDATEPSDEACTIONNAME}
     * <P>
     * 等同 {@link #setUpdatePSDEActionName}
     * @param updatePSDEActionName
     */
    @JsonIgnore
    public PSACHandler updatepsdeactionname(String updatePSDEActionName){
        this.setUpdatePSDEActionName(updatePSDEActionName);
        return this;
    }

    /**
     * <B>UPDATEPSDEOPPRIVID</B>&nbsp;更新要求权限，指定界面处理对象更新数据需要具备的操作标识
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEOPPriv} 
     */
    public final static String FIELD_UPDATEPSDEOPPRIVID = "updatepsdeopprivid";

    /**
     * 设置 更新要求权限，详细说明：{@link #FIELD_UPDATEPSDEOPPRIVID}
     * 
     * @param updatePSDEOPPrivId
     * 
     */
    @JsonProperty(FIELD_UPDATEPSDEOPPRIVID)
    public void setUpdatePSDEOPPrivId(String updatePSDEOPPrivId){
        this.set(FIELD_UPDATEPSDEOPPRIVID, updatePSDEOPPrivId);
    }
    
    /**
     * 获取 更新要求权限  
     * @return
     */
    @JsonIgnore
    public String getUpdatePSDEOPPrivId(){
        Object objValue = this.get(FIELD_UPDATEPSDEOPPRIVID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 更新要求权限 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUpdatePSDEOPPrivIdDirty(){
        if(this.contains(FIELD_UPDATEPSDEOPPRIVID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 更新要求权限
     */
    @JsonIgnore
    public void resetUpdatePSDEOPPrivId(){
        this.reset(FIELD_UPDATEPSDEOPPRIVID);
    }

    /**
     * 设置 更新要求权限，详细说明：{@link #FIELD_UPDATEPSDEOPPRIVID}
     * <P>
     * 等同 {@link #setUpdatePSDEOPPrivId}
     * @param updatePSDEOPPrivId
     */
    @JsonIgnore
    public PSACHandler updatepsdeopprivid(String updatePSDEOPPrivId){
        this.setUpdatePSDEOPPrivId(updatePSDEOPPrivId);
        return this;
    }

    /**
     * 设置 更新要求权限，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUpdatePSDEOPPrivId}
     * @param pSDEOPPriv 引用对象
     */
    @JsonIgnore
    public PSACHandler updatepsdeopprivid(PSDEOPPriv pSDEOPPriv){
        if(pSDEOPPriv == null){
            this.setUpdatePSDEOPPrivId(null);
            this.setUpdatePSDEOPPrivName(null);
        }
        else{
            this.setUpdatePSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setUpdatePSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    /**
     * <B>UPDATEPSDEOPPRIVNAME</B>&nbsp;更新要求权限，指定界面处理对象更新数据需要具备的操作标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UPDATEPSDEOPPRIVID}
     */
    public final static String FIELD_UPDATEPSDEOPPRIVNAME = "updatepsdeopprivname";

    /**
     * 设置 更新要求权限，详细说明：{@link #FIELD_UPDATEPSDEOPPRIVNAME}
     * 
     * @param updatePSDEOPPrivName
     * 
     */
    @JsonProperty(FIELD_UPDATEPSDEOPPRIVNAME)
    public void setUpdatePSDEOPPrivName(String updatePSDEOPPrivName){
        this.set(FIELD_UPDATEPSDEOPPRIVNAME, updatePSDEOPPrivName);
    }
    
    /**
     * 获取 更新要求权限  
     * @return
     */
    @JsonIgnore
    public String getUpdatePSDEOPPrivName(){
        Object objValue = this.get(FIELD_UPDATEPSDEOPPRIVNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 更新要求权限 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUpdatePSDEOPPrivNameDirty(){
        if(this.contains(FIELD_UPDATEPSDEOPPRIVNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 更新要求权限
     */
    @JsonIgnore
    public void resetUpdatePSDEOPPrivName(){
        this.reset(FIELD_UPDATEPSDEOPPRIVNAME);
    }

    /**
     * 设置 更新要求权限，详细说明：{@link #FIELD_UPDATEPSDEOPPRIVNAME}
     * <P>
     * 等同 {@link #setUpdatePSDEOPPrivName}
     * @param updatePSDEOPPrivName
     */
    @JsonIgnore
    public PSACHandler updatepsdeopprivname(String updatePSDEOPPrivName){
        this.setUpdatePSDEOPPrivName(updatePSDEOPPrivName);
        return this;
    }

    /**
     * <B>UPDATETIMEOUT</B>&nbsp;更新超时，指定界面处理对象更新数据的超时时长，单位为【毫秒】，-1为永不过期，未定义时为【-1】
     */
    public final static String FIELD_UPDATETIMEOUT = "updatetimeout";

    /**
     * 设置 更新超时，详细说明：{@link #FIELD_UPDATETIMEOUT}
     * 
     * @param updateTimeout
     * 
     */
    @JsonProperty(FIELD_UPDATETIMEOUT)
    public void setUpdateTimeout(Integer updateTimeout){
        this.set(FIELD_UPDATETIMEOUT, updateTimeout);
    }
    
    /**
     * 获取 更新超时  
     * @return
     */
    @JsonIgnore
    public Integer getUpdateTimeout(){
        Object objValue = this.get(FIELD_UPDATETIMEOUT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 更新超时 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUpdateTimeoutDirty(){
        if(this.contains(FIELD_UPDATETIMEOUT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 更新超时
     */
    @JsonIgnore
    public void resetUpdateTimeout(){
        this.reset(FIELD_UPDATETIMEOUT);
    }

    /**
     * 设置 更新超时，详细说明：{@link #FIELD_UPDATETIMEOUT}
     * <P>
     * 等同 {@link #setUpdateTimeout}
     * @param updateTimeout
     */
    @JsonIgnore
    public PSACHandler updatetimeout(Integer updateTimeout){
        this.setUpdateTimeout(updateTimeout);
        return this;
    }

    /**
     * <B>USER2PSDEACTIONID</B>&nbsp;自定义实体行为2，指定界面处理对象提供自定义功能的实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_USER2PSDEACTIONID = "user2psdeactionid";

    /**
     * 设置 自定义实体行为2，详细说明：{@link #FIELD_USER2PSDEACTIONID}
     * 
     * @param user2PSDEActionId
     * 
     */
    @JsonProperty(FIELD_USER2PSDEACTIONID)
    public void setUser2PSDEActionId(String user2PSDEActionId){
        this.set(FIELD_USER2PSDEACTIONID, user2PSDEActionId);
    }
    
    /**
     * 获取 自定义实体行为2  
     * @return
     */
    @JsonIgnore
    public String getUser2PSDEActionId(){
        Object objValue = this.get(FIELD_USER2PSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义实体行为2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUser2PSDEActionIdDirty(){
        if(this.contains(FIELD_USER2PSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义实体行为2
     */
    @JsonIgnore
    public void resetUser2PSDEActionId(){
        this.reset(FIELD_USER2PSDEACTIONID);
    }

    /**
     * 设置 自定义实体行为2，详细说明：{@link #FIELD_USER2PSDEACTIONID}
     * <P>
     * 等同 {@link #setUser2PSDEActionId}
     * @param user2PSDEActionId
     */
    @JsonIgnore
    public PSACHandler user2psdeactionid(String user2PSDEActionId){
        this.setUser2PSDEActionId(user2PSDEActionId);
        return this;
    }

    /**
     * 设置 自定义实体行为2，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUser2PSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSACHandler user2psdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setUser2PSDEActionId(null);
            this.setUser2PSDEActionName(null);
        }
        else{
            this.setUser2PSDEActionId(pSDEAction.getPSDEActionId());
            this.setUser2PSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>USER2PSDEACTIONNAME</B>&nbsp;自定义实体行为2，指定界面处理对象提供自定义功能的实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_USER2PSDEACTIONID}
     */
    public final static String FIELD_USER2PSDEACTIONNAME = "user2psdeactionname";

    /**
     * 设置 自定义实体行为2，详细说明：{@link #FIELD_USER2PSDEACTIONNAME}
     * 
     * @param user2PSDEActionName
     * 
     */
    @JsonProperty(FIELD_USER2PSDEACTIONNAME)
    public void setUser2PSDEActionName(String user2PSDEActionName){
        this.set(FIELD_USER2PSDEACTIONNAME, user2PSDEActionName);
    }
    
    /**
     * 获取 自定义实体行为2  
     * @return
     */
    @JsonIgnore
    public String getUser2PSDEActionName(){
        Object objValue = this.get(FIELD_USER2PSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义实体行为2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUser2PSDEActionNameDirty(){
        if(this.contains(FIELD_USER2PSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义实体行为2
     */
    @JsonIgnore
    public void resetUser2PSDEActionName(){
        this.reset(FIELD_USER2PSDEACTIONNAME);
    }

    /**
     * 设置 自定义实体行为2，详细说明：{@link #FIELD_USER2PSDEACTIONNAME}
     * <P>
     * 等同 {@link #setUser2PSDEActionName}
     * @param user2PSDEActionName
     */
    @JsonIgnore
    public PSACHandler user2psdeactionname(String user2PSDEActionName){
        this.setUser2PSDEActionName(user2PSDEActionName);
        return this;
    }

    /**
     * <B>USER2PSDEOPPRIVID</B>&nbsp;自定义权限2，指定界面处理对象自定义操作2需要具备的操作标识
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEOPPriv} 
     */
    public final static String FIELD_USER2PSDEOPPRIVID = "user2psdeopprivid";

    /**
     * 设置 自定义权限2，详细说明：{@link #FIELD_USER2PSDEOPPRIVID}
     * 
     * @param user2PSDEOPPrivId
     * 
     */
    @JsonProperty(FIELD_USER2PSDEOPPRIVID)
    public void setUser2PSDEOPPrivId(String user2PSDEOPPrivId){
        this.set(FIELD_USER2PSDEOPPRIVID, user2PSDEOPPrivId);
    }
    
    /**
     * 获取 自定义权限2  
     * @return
     */
    @JsonIgnore
    public String getUser2PSDEOPPrivId(){
        Object objValue = this.get(FIELD_USER2PSDEOPPRIVID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义权限2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUser2PSDEOPPrivIdDirty(){
        if(this.contains(FIELD_USER2PSDEOPPRIVID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义权限2
     */
    @JsonIgnore
    public void resetUser2PSDEOPPrivId(){
        this.reset(FIELD_USER2PSDEOPPRIVID);
    }

    /**
     * 设置 自定义权限2，详细说明：{@link #FIELD_USER2PSDEOPPRIVID}
     * <P>
     * 等同 {@link #setUser2PSDEOPPrivId}
     * @param user2PSDEOPPrivId
     */
    @JsonIgnore
    public PSACHandler user2psdeopprivid(String user2PSDEOPPrivId){
        this.setUser2PSDEOPPrivId(user2PSDEOPPrivId);
        return this;
    }

    /**
     * 设置 自定义权限2，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUser2PSDEOPPrivId}
     * @param pSDEOPPriv 引用对象
     */
    @JsonIgnore
    public PSACHandler user2psdeopprivid(PSDEOPPriv pSDEOPPriv){
        if(pSDEOPPriv == null){
            this.setUser2PSDEOPPrivId(null);
            this.setUser2PSDEOPPrivName(null);
        }
        else{
            this.setUser2PSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setUser2PSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    /**
     * <B>USER2PSDEOPPRIVNAME</B>&nbsp;自定义权限2，指定界面处理对象自定义操作2需要具备的操作标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_USER2PSDEOPPRIVID}
     */
    public final static String FIELD_USER2PSDEOPPRIVNAME = "user2psdeopprivname";

    /**
     * 设置 自定义权限2，详细说明：{@link #FIELD_USER2PSDEOPPRIVNAME}
     * 
     * @param user2PSDEOPPrivName
     * 
     */
    @JsonProperty(FIELD_USER2PSDEOPPRIVNAME)
    public void setUser2PSDEOPPrivName(String user2PSDEOPPrivName){
        this.set(FIELD_USER2PSDEOPPRIVNAME, user2PSDEOPPrivName);
        //属性名称与代码标识不一致，设置属性名称
        this.set("user2psdeoppriviname", user2PSDEOPPrivName);
    }
    
    /**
     * 获取 自定义权限2  
     * @return
     */
    @JsonIgnore
    public String getUser2PSDEOPPrivName(){
        Object objValue = this.get(FIELD_USER2PSDEOPPRIVNAME);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("user2psdeoppriviname");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义权限2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUser2PSDEOPPrivNameDirty(){
        if(this.contains(FIELD_USER2PSDEOPPRIVNAME)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("user2psdeoppriviname")){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义权限2
     */
    @JsonIgnore
    public void resetUser2PSDEOPPrivName(){
        this.reset(FIELD_USER2PSDEOPPRIVNAME);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("user2psdeoppriviname");
    }

    /**
     * 设置 自定义权限2，详细说明：{@link #FIELD_USER2PSDEOPPRIVNAME}
     * <P>
     * 等同 {@link #setUser2PSDEOPPrivName}
     * @param user2PSDEOPPrivName
     */
    @JsonIgnore
    public PSACHandler user2psdeopprivname(String user2PSDEOPPrivName){
        this.setUser2PSDEOPPrivName(user2PSDEOPPrivName);
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
    public PSACHandler usercat(String userCat){
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
    public PSACHandler usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSACHandler userparams(String userParams){
        this.setUserParams(userParams);
        return this;
    }

    /**
     * <B>USERPSDEACTIONID</B>&nbsp;自定义实体行为，指定界面处理对象提供自定义功能2的实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_USERPSDEACTIONID = "userpsdeactionid";

    /**
     * 设置 自定义实体行为，详细说明：{@link #FIELD_USERPSDEACTIONID}
     * 
     * @param userPSDEActionId
     * 
     */
    @JsonProperty(FIELD_USERPSDEACTIONID)
    public void setUserPSDEActionId(String userPSDEActionId){
        this.set(FIELD_USERPSDEACTIONID, userPSDEActionId);
    }
    
    /**
     * 获取 自定义实体行为  
     * @return
     */
    @JsonIgnore
    public String getUserPSDEActionId(){
        Object objValue = this.get(FIELD_USERPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserPSDEActionIdDirty(){
        if(this.contains(FIELD_USERPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义实体行为
     */
    @JsonIgnore
    public void resetUserPSDEActionId(){
        this.reset(FIELD_USERPSDEACTIONID);
    }

    /**
     * 设置 自定义实体行为，详细说明：{@link #FIELD_USERPSDEACTIONID}
     * <P>
     * 等同 {@link #setUserPSDEActionId}
     * @param userPSDEActionId
     */
    @JsonIgnore
    public PSACHandler userpsdeactionid(String userPSDEActionId){
        this.setUserPSDEActionId(userPSDEActionId);
        return this;
    }

    /**
     * 设置 自定义实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUserPSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSACHandler userpsdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setUserPSDEActionId(null);
            this.setUserPSDEActionName(null);
        }
        else{
            this.setUserPSDEActionId(pSDEAction.getPSDEActionId());
            this.setUserPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>USERPSDEACTIONNAME</B>&nbsp;自定义实体行为，指定界面处理对象提供自定义功能2的实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_USERPSDEACTIONID}
     */
    public final static String FIELD_USERPSDEACTIONNAME = "userpsdeactionname";

    /**
     * 设置 自定义实体行为，详细说明：{@link #FIELD_USERPSDEACTIONNAME}
     * 
     * @param userPSDEActionName
     * 
     */
    @JsonProperty(FIELD_USERPSDEACTIONNAME)
    public void setUserPSDEActionName(String userPSDEActionName){
        this.set(FIELD_USERPSDEACTIONNAME, userPSDEActionName);
    }
    
    /**
     * 获取 自定义实体行为  
     * @return
     */
    @JsonIgnore
    public String getUserPSDEActionName(){
        Object objValue = this.get(FIELD_USERPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserPSDEActionNameDirty(){
        if(this.contains(FIELD_USERPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义实体行为
     */
    @JsonIgnore
    public void resetUserPSDEActionName(){
        this.reset(FIELD_USERPSDEACTIONNAME);
    }

    /**
     * 设置 自定义实体行为，详细说明：{@link #FIELD_USERPSDEACTIONNAME}
     * <P>
     * 等同 {@link #setUserPSDEActionName}
     * @param userPSDEActionName
     */
    @JsonIgnore
    public PSACHandler userpsdeactionname(String userPSDEActionName){
        this.setUserPSDEActionName(userPSDEActionName);
        return this;
    }

    /**
     * <B>USERPSDEOPPRIVID</B>&nbsp;自定义权限，指定界面处理对象自定义操作需要具备的操作标识
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEOPPriv} 
     */
    public final static String FIELD_USERPSDEOPPRIVID = "userpsdeopprivid";

    /**
     * 设置 自定义权限，详细说明：{@link #FIELD_USERPSDEOPPRIVID}
     * 
     * @param userPSDEOPPrivId
     * 
     */
    @JsonProperty(FIELD_USERPSDEOPPRIVID)
    public void setUserPSDEOPPrivId(String userPSDEOPPrivId){
        this.set(FIELD_USERPSDEOPPRIVID, userPSDEOPPrivId);
    }
    
    /**
     * 获取 自定义权限  
     * @return
     */
    @JsonIgnore
    public String getUserPSDEOPPrivId(){
        Object objValue = this.get(FIELD_USERPSDEOPPRIVID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义权限 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserPSDEOPPrivIdDirty(){
        if(this.contains(FIELD_USERPSDEOPPRIVID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义权限
     */
    @JsonIgnore
    public void resetUserPSDEOPPrivId(){
        this.reset(FIELD_USERPSDEOPPRIVID);
    }

    /**
     * 设置 自定义权限，详细说明：{@link #FIELD_USERPSDEOPPRIVID}
     * <P>
     * 等同 {@link #setUserPSDEOPPrivId}
     * @param userPSDEOPPrivId
     */
    @JsonIgnore
    public PSACHandler userpsdeopprivid(String userPSDEOPPrivId){
        this.setUserPSDEOPPrivId(userPSDEOPPrivId);
        return this;
    }

    /**
     * 设置 自定义权限，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUserPSDEOPPrivId}
     * @param pSDEOPPriv 引用对象
     */
    @JsonIgnore
    public PSACHandler userpsdeopprivid(PSDEOPPriv pSDEOPPriv){
        if(pSDEOPPriv == null){
            this.setUserPSDEOPPrivId(null);
            this.setUserPSDEOPPrivName(null);
        }
        else{
            this.setUserPSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setUserPSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    /**
     * <B>USERPSDEOPPRIVNAME</B>&nbsp;自定义权限，指定界面处理对象自定义操作需要具备的操作标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_USERPSDEOPPRIVID}
     */
    public final static String FIELD_USERPSDEOPPRIVNAME = "userpsdeopprivname";

    /**
     * 设置 自定义权限，详细说明：{@link #FIELD_USERPSDEOPPRIVNAME}
     * 
     * @param userPSDEOPPrivName
     * 
     */
    @JsonProperty(FIELD_USERPSDEOPPRIVNAME)
    public void setUserPSDEOPPrivName(String userPSDEOPPrivName){
        this.set(FIELD_USERPSDEOPPRIVNAME, userPSDEOPPrivName);
        //属性名称与代码标识不一致，设置属性名称
        this.set("userpsdeoppriviname", userPSDEOPPrivName);
    }
    
    /**
     * 获取 自定义权限  
     * @return
     */
    @JsonIgnore
    public String getUserPSDEOPPrivName(){
        Object objValue = this.get(FIELD_USERPSDEOPPRIVNAME);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("userpsdeoppriviname");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义权限 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserPSDEOPPrivNameDirty(){
        if(this.contains(FIELD_USERPSDEOPPRIVNAME)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("userpsdeoppriviname")){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义权限
     */
    @JsonIgnore
    public void resetUserPSDEOPPrivName(){
        this.reset(FIELD_USERPSDEOPPRIVNAME);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("userpsdeoppriviname");
    }

    /**
     * 设置 自定义权限，详细说明：{@link #FIELD_USERPSDEOPPRIVNAME}
     * <P>
     * 等同 {@link #setUserPSDEOPPrivName}
     * @param userPSDEOPPrivName
     */
    @JsonIgnore
    public PSACHandler userpsdeopprivname(String userPSDEOPPrivName){
        this.setUserPSDEOPPrivName(userPSDEOPPrivName);
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
    public PSACHandler usertag(String userTag){
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
    public PSACHandler usertag2(String userTag2){
        this.setUserTag2(userTag2);
        return this;
    }

    /**
     * <B>USERTAG3</B>&nbsp;用户标记3
     * <P>
     * 字符串：最大长度 100
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
    public PSACHandler usertag3(String userTag3){
        this.setUserTag3(userTag3);
        return this;
    }

    /**
     * <B>USERTAG4</B>&nbsp;用户标记4
     * <P>
     * 字符串：最大长度 100
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
    public PSACHandler usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSACHandlerId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSACHandlerId(strValue);
    }

    @JsonIgnore
    public PSACHandler id(String strValue){
        this.setPSACHandlerId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSACHandler){
            PSACHandler model = (PSACHandler)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
