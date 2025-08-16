package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEDATAIMP</B>实体数据导入 模型传输对象
 * <P>
 * 实体的数据导入定义模型，为实体提供多模式的数据导入功能
 */
public class PSDEDataImp extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEDataImp(){
        this.setValidFlag(1);
    }      

    /**
     * <B>ACTIONHOLDER</B>&nbsp;行为持有者，指定独立提供数据导入能力的持有者，未指定时为【后台及前台】
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
    public PSDEDataImp actionholder(Integer actionHolder){
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
    public PSDEDataImp actionholder(net.ibizsys.psmodel.core.util.PSModelEnums.DELogicHolder actionHolder){
        if(actionHolder == null){
            this.setActionHolder(null);
        }
        else{
            this.setActionHolder(actionHolder.value);
        }
        return this;
    }

    /**
     * <B>BATCHSIZE</B>&nbsp;批处理大小，指定数据导入批操作的大小，未定义时为【1000】
     */
    public final static String FIELD_BATCHSIZE = "batchsize";

    /**
     * 设置 批处理大小，详细说明：{@link #FIELD_BATCHSIZE}
     * 
     * @param batchSize
     * 
     */
    @JsonProperty(FIELD_BATCHSIZE)
    public void setBatchSize(Integer batchSize){
        this.set(FIELD_BATCHSIZE, batchSize);
    }
    
    /**
     * 获取 批处理大小  
     * @return
     */
    @JsonIgnore
    public Integer getBatchSize(){
        Object objValue = this.get(FIELD_BATCHSIZE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 批处理大小 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBatchSizeDirty(){
        if(this.contains(FIELD_BATCHSIZE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 批处理大小
     */
    @JsonIgnore
    public void resetBatchSize(){
        this.reset(FIELD_BATCHSIZE);
    }

    /**
     * 设置 批处理大小，详细说明：{@link #FIELD_BATCHSIZE}
     * <P>
     * 等同 {@link #setBatchSize}
     * @param batchSize
     */
    @JsonIgnore
    public PSDEDataImp batchsize(Integer batchSize){
        this.setBatchSize(batchSize);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定数据导入的代码标识，需要在所在的实体中具有唯一性
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
    public PSDEDataImp codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>CONTENTTYPE</B>&nbsp;内容类型
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_CONTENTTYPE = "contenttype";

    /**
     * 设置 内容类型
     * 
     * @param contentType
     * 
     */
    @JsonProperty(FIELD_CONTENTTYPE)
    public void setContentType(String contentType){
        this.set(FIELD_CONTENTTYPE, contentType);
    }
    
    /**
     * 获取 内容类型  
     * @return
     */
    @JsonIgnore
    public String getContentType(){
        Object objValue = this.get(FIELD_CONTENTTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 内容类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isContentTypeDirty(){
        if(this.contains(FIELD_CONTENTTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内容类型
     */
    @JsonIgnore
    public void resetContentType(){
        this.reset(FIELD_CONTENTTYPE);
    }

    /**
     * 设置 内容类型
     * <P>
     * 等同 {@link #setContentType}
     * @param contentType
     */
    @JsonIgnore
    public PSDEDataImp contenttype(String contentType){
        this.setContentType(contentType);
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
    public PSDEDataImp createdate(String createDate){
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
    public PSDEDataImp createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CREATEPSDEACTIONID</B>&nbsp;建立数据行为，指定导入数据进行新建操作时调用的实体行为对象，未定义时为【CREATE】
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_CREATEPSDEACTIONID = "createpsdeactionid";

    /**
     * 设置 建立数据行为，详细说明：{@link #FIELD_CREATEPSDEACTIONID}
     * 
     * @param createPSDEActionId
     * 
     */
    @JsonProperty(FIELD_CREATEPSDEACTIONID)
    public void setCreatePSDEActionId(String createPSDEActionId){
        this.set(FIELD_CREATEPSDEACTIONID, createPSDEActionId);
    }
    
    /**
     * 获取 建立数据行为  
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
     * 判断 建立数据行为 是否指定值，包括空值
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
     * 重置 建立数据行为
     */
    @JsonIgnore
    public void resetCreatePSDEActionId(){
        this.reset(FIELD_CREATEPSDEACTIONID);
    }

    /**
     * 设置 建立数据行为，详细说明：{@link #FIELD_CREATEPSDEACTIONID}
     * <P>
     * 等同 {@link #setCreatePSDEActionId}
     * @param createPSDEActionId
     */
    @JsonIgnore
    public PSDEDataImp createpsdeactionid(String createPSDEActionId){
        this.setCreatePSDEActionId(createPSDEActionId);
        return this;
    }

    /**
     * 设置 建立数据行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setCreatePSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDEDataImp createpsdeactionid(PSDEAction pSDEAction){
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
     * <B>CREATEPSDEACTIONNAME</B>&nbsp;建立数据行为，指定导入数据进行新建操作时调用的实体行为对象，未定义时为【CREATE】
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CREATEPSDEACTIONID}
     */
    public final static String FIELD_CREATEPSDEACTIONNAME = "createpsdeactionname";

    /**
     * 设置 建立数据行为，详细说明：{@link #FIELD_CREATEPSDEACTIONNAME}
     * 
     * @param createPSDEActionName
     * 
     */
    @JsonProperty(FIELD_CREATEPSDEACTIONNAME)
    public void setCreatePSDEActionName(String createPSDEActionName){
        this.set(FIELD_CREATEPSDEACTIONNAME, createPSDEActionName);
    }
    
    /**
     * 获取 建立数据行为  
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
     * 判断 建立数据行为 是否指定值，包括空值
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
     * 重置 建立数据行为
     */
    @JsonIgnore
    public void resetCreatePSDEActionName(){
        this.reset(FIELD_CREATEPSDEACTIONNAME);
    }

    /**
     * 设置 建立数据行为，详细说明：{@link #FIELD_CREATEPSDEACTIONNAME}
     * <P>
     * 等同 {@link #setCreatePSDEActionName}
     * @param createPSDEActionName
     */
    @JsonIgnore
    public PSDEDataImp createpsdeactionname(String createPSDEActionName){
        this.setCreatePSDEActionName(createPSDEActionName);
        return this;
    }

    /**
     * <B>CREATEPSDEOPPRIVID</B>&nbsp;建立要求权限，指定导入数据进行建立操作时需要检查的实体操作标识，未定义时为【CREATE】
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
    public PSDEDataImp createpsdeopprivid(String createPSDEOPPrivId){
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
    public PSDEDataImp createpsdeopprivid(PSDEOPPriv pSDEOPPriv){
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
     * <B>CREATEPSDEOPPRIVINAME</B>&nbsp;建立要求权限，指定导入数据进行建立操作时需要检查的实体操作标识，未定义时为【CREATE】
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
    public PSDEDataImp createpsdeoppriviname(String createPSDEOPPrivIName){
        this.setCreatePSDEOPPrivIName(createPSDEOPPrivIName);
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
    public PSDEDataImp customcode(String customCode){
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
    public PSDEDataImp custommode(Integer customMode){
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
    public PSDEDataImp custommode(net.ibizsys.psmodel.core.util.PSModelEnums.ScriptMode2 customMode){
        if(customMode == null){
            this.setCustomMode(null);
        }
        else{
            this.setCustomMode(customMode.value);
        }
        return this;
    }

    /**
     * <B>DATAIMPTYPE</B>&nbsp;数据导入类型
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_DATAIMPTYPE = "dataimptype";

    /**
     * 设置 数据导入类型
     * 
     * @param dataImpType
     * 
     */
    @JsonProperty(FIELD_DATAIMPTYPE)
    public void setDataImpType(String dataImpType){
        this.set(FIELD_DATAIMPTYPE, dataImpType);
    }
    
    /**
     * 获取 数据导入类型  
     * @return
     */
    @JsonIgnore
    public String getDataImpType(){
        Object objValue = this.get(FIELD_DATAIMPTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据导入类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDataImpTypeDirty(){
        if(this.contains(FIELD_DATAIMPTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据导入类型
     */
    @JsonIgnore
    public void resetDataImpType(){
        this.reset(FIELD_DATAIMPTYPE);
    }

    /**
     * 设置 数据导入类型
     * <P>
     * 等同 {@link #setDataImpType}
     * @param dataImpType
     */
    @JsonIgnore
    public PSDEDataImp dataimptype(String dataImpType){
        this.setDataImpType(dataImpType);
        return this;
    }

    /**
     * <B>DEFAULTFLAG</B>&nbsp;默认导入，指定数据导入是否作为所在实体的默认导入模式，每个实体只允许存在一个默认数据导入，默认数据导入未定义数据项时将自动加入支持导入的实体属性。未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEFAULTFLAG = "defaultflag";

    /**
     * 设置 默认导入，详细说明：{@link #FIELD_DEFAULTFLAG}
     * 
     * @param defaultFlag
     * 
     */
    @JsonProperty(FIELD_DEFAULTFLAG)
    public void setDefaultFlag(Integer defaultFlag){
        this.set(FIELD_DEFAULTFLAG, defaultFlag);
    }
    
    /**
     * 获取 默认导入  
     * @return
     */
    @JsonIgnore
    public Integer getDefaultFlag(){
        Object objValue = this.get(FIELD_DEFAULTFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认导入 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefaultFlagDirty(){
        if(this.contains(FIELD_DEFAULTFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认导入
     */
    @JsonIgnore
    public void resetDefaultFlag(){
        this.reset(FIELD_DEFAULTFLAG);
    }

    /**
     * 设置 默认导入，详细说明：{@link #FIELD_DEFAULTFLAG}
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSDEDataImp defaultflag(Integer defaultFlag){
        this.setDefaultFlag(defaultFlag);
        return this;
    }

     /**
     * 设置 默认导入，详细说明：{@link #FIELD_DEFAULTFLAG}
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSDEDataImp defaultflag(Boolean defaultFlag){
        if(defaultFlag == null){
            this.setDefaultFlag(null);
        }
        else{
            this.setDefaultFlag(defaultFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLECUSTOMIZED</B>&nbsp;支持定制
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLECUSTOMIZED = "enablecustomized";

    /**
     * 设置 支持定制
     * 
     * @param enableCustomized
     * 
     */
    @JsonProperty(FIELD_ENABLECUSTOMIZED)
    public void setEnableCustomized(Integer enableCustomized){
        this.set(FIELD_ENABLECUSTOMIZED, enableCustomized);
    }
    
    /**
     * 获取 支持定制  
     * @return
     */
    @JsonIgnore
    public Integer getEnableCustomized(){
        Object objValue = this.get(FIELD_ENABLECUSTOMIZED);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持定制 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableCustomizedDirty(){
        if(this.contains(FIELD_ENABLECUSTOMIZED)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持定制
     */
    @JsonIgnore
    public void resetEnableCustomized(){
        this.reset(FIELD_ENABLECUSTOMIZED);
    }

    /**
     * 设置 支持定制
     * <P>
     * 等同 {@link #setEnableCustomized}
     * @param enableCustomized
     */
    @JsonIgnore
    public PSDEDataImp enablecustomized(Integer enableCustomized){
        this.setEnableCustomized(enableCustomized);
        return this;
    }

     /**
     * 设置 支持定制
     * <P>
     * 等同 {@link #setEnableCustomized}
     * @param enableCustomized
     */
    @JsonIgnore
    public PSDEDataImp enablecustomized(Boolean enableCustomized){
        if(enableCustomized == null){
            this.setEnableCustomized(null);
        }
        else{
            this.setEnableCustomized(enableCustomized?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>EXTENDMODE</B>&nbsp;扩展模式，指定实体数据导入的扩展模式，此配置针对子系统实体，标记是否要对原功能进行扩展。未定义时为【无扩展】
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
    public PSDEDataImp extendmode(Integer extendMode){
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
    public PSDEDataImp extendmode(net.ibizsys.psmodel.core.util.PSModelEnums.DEExtendMode extendMode){
        if(extendMode == null){
            this.setExtendMode(null);
        }
        else{
            this.setExtendMode(extendMode.value);
        }
        return this;
    }

    /**
     * <B>IMPPARAMS</B>&nbsp;导入参数
     */
    public final static String FIELD_IMPPARAMS = "impparams";

    /**
     * 设置 导入参数
     * 
     * @param impParams
     * 
     */
    @JsonProperty(FIELD_IMPPARAMS)
    public void setImpParams(String impParams){
        this.set(FIELD_IMPPARAMS, impParams);
    }
    
    /**
     * 获取 导入参数  
     * @return
     */
    @JsonIgnore
    public String getImpParams(){
        Object objValue = this.get(FIELD_IMPPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导入参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isImpParamsDirty(){
        if(this.contains(FIELD_IMPPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导入参数
     */
    @JsonIgnore
    public void resetImpParams(){
        this.reset(FIELD_IMPPARAMS);
    }

    /**
     * 设置 导入参数
     * <P>
     * 等同 {@link #setImpParams}
     * @param impParams
     */
    @JsonIgnore
    public PSDEDataImp impparams(String impParams){
        this.setImpParams(impParams);
        return this;
    }

    /**
     * <B>IMPTAG</B>&nbsp;导入标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_IMPTAG = "imptag";

    /**
     * 设置 导入标记
     * 
     * @param impTag
     * 
     */
    @JsonProperty(FIELD_IMPTAG)
    public void setImpTag(String impTag){
        this.set(FIELD_IMPTAG, impTag);
    }
    
    /**
     * 获取 导入标记  
     * @return
     */
    @JsonIgnore
    public String getImpTag(){
        Object objValue = this.get(FIELD_IMPTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导入标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isImpTagDirty(){
        if(this.contains(FIELD_IMPTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导入标记
     */
    @JsonIgnore
    public void resetImpTag(){
        this.reset(FIELD_IMPTAG);
    }

    /**
     * 设置 导入标记
     * <P>
     * 等同 {@link #setImpTag}
     * @param impTag
     */
    @JsonIgnore
    public PSDEDataImp imptag(String impTag){
        this.setImpTag(impTag);
        return this;
    }

    /**
     * <B>IMPTAG2</B>&nbsp;导入标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_IMPTAG2 = "imptag2";

    /**
     * 设置 导入标记2
     * 
     * @param impTag2
     * 
     */
    @JsonProperty(FIELD_IMPTAG2)
    public void setImpTag2(String impTag2){
        this.set(FIELD_IMPTAG2, impTag2);
    }
    
    /**
     * 获取 导入标记2  
     * @return
     */
    @JsonIgnore
    public String getImpTag2(){
        Object objValue = this.get(FIELD_IMPTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导入标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isImpTag2Dirty(){
        if(this.contains(FIELD_IMPTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导入标记2
     */
    @JsonIgnore
    public void resetImpTag2(){
        this.reset(FIELD_IMPTAG2);
    }

    /**
     * 设置 导入标记2
     * <P>
     * 等同 {@link #setImpTag2}
     * @param impTag2
     */
    @JsonIgnore
    public PSDEDataImp imptag2(String impTag2){
        this.setImpTag2(impTag2);
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
    public PSDEDataImp memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>POTIME</B>&nbsp;性能优化时间，指定数据导入性能优化检测时长（毫秒），超过此时长将需要进行日志等处理。未指定时为【-1】，使用默认检测时长
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
    public PSDEDataImp potime(Integer pOTime){
        this.setPOTime(pOTime);
        return this;
    }

    /**
     * <B>PSDEDATAIMPID</B>&nbsp;实体数据导入标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEDATAIMPID = "psdedataimpid";

    /**
     * 设置 实体数据导入标识
     * 
     * @param pSDEDataImpId
     * 
     */
    @JsonProperty(FIELD_PSDEDATAIMPID)
    public void setPSDEDataImpId(String pSDEDataImpId){
        this.set(FIELD_PSDEDATAIMPID, pSDEDataImpId);
    }
    
    /**
     * 获取 实体数据导入标识  
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
     * 判断 实体数据导入标识 是否指定值，包括空值
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
     * 重置 实体数据导入标识
     */
    @JsonIgnore
    public void resetPSDEDataImpId(){
        this.reset(FIELD_PSDEDATAIMPID);
    }

    /**
     * 设置 实体数据导入标识
     * <P>
     * 等同 {@link #setPSDEDataImpId}
     * @param pSDEDataImpId
     */
    @JsonIgnore
    public PSDEDataImp psdedataimpid(String pSDEDataImpId){
        this.setPSDEDataImpId(pSDEDataImpId);
        return this;
    }

    /**
     * <B>PSDEDATAIMPNAME</B>&nbsp;导入名称，指定数据导入的名称，需要在所在的实体中具有唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEDATAIMPNAME = "psdedataimpname";

    /**
     * 设置 导入名称，详细说明：{@link #FIELD_PSDEDATAIMPNAME}
     * 
     * @param pSDEDataImpName
     * 
     */
    @JsonProperty(FIELD_PSDEDATAIMPNAME)
    public void setPSDEDataImpName(String pSDEDataImpName){
        this.set(FIELD_PSDEDATAIMPNAME, pSDEDataImpName);
    }
    
    /**
     * 获取 导入名称  
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
     * 判断 导入名称 是否指定值，包括空值
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
     * 重置 导入名称
     */
    @JsonIgnore
    public void resetPSDEDataImpName(){
        this.reset(FIELD_PSDEDATAIMPNAME);
    }

    /**
     * 设置 导入名称，详细说明：{@link #FIELD_PSDEDATAIMPNAME}
     * <P>
     * 等同 {@link #setPSDEDataImpName}
     * @param pSDEDataImpName
     */
    @JsonIgnore
    public PSDEDataImp psdedataimpname(String pSDEDataImpName){
        this.setPSDEDataImpName(pSDEDataImpName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEDataImpName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEDataImpName(strName);
    }

    @JsonIgnore
    public PSDEDataImp name(String strName){
        this.setPSDEDataImpName(strName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定数据导入所属的实体对象
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
    public PSDEDataImp psdeid(String pSDEId){
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
    public PSDEDataImp psdeid(PSDataEntity pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;实体，指定数据导入所属的实体对象
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
    public PSDEDataImp psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端扩展插件，指定实体数据导入使用的前端模板扩展插件，使用插件类型【应用实体数据导入】
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
    public PSDEDataImp pssyspfpluginid(String pSSysPFPluginId){
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
    public PSDEDataImp pssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
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
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端扩展插件，指定实体数据导入使用的前端模板扩展插件，使用插件类型【应用实体数据导入】
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
    public PSDEDataImp pssyspfpluginname(String pSSysPFPluginName){
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
    public PSDEDataImp pssysreqitemid(String pSSysReqItemId){
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
    public PSDEDataImp pssysreqitemid(PSSysReqItem pSSysReqItem){
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
    public PSDEDataImp pssysreqitemname(String pSSysReqItemName){
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINID</B>&nbsp;后台扩展插件，指定实体数据导入使用的后台模板扩展插件
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
    public PSDEDataImp pssyssfpluginid(String pSSysSFPluginId){
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
    public PSDEDataImp pssyssfpluginid(PSSysSFPlugin pSSysSFPlugin){
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
     * <B>PSSYSSFPLUGINNAME</B>&nbsp;后台扩展插件，指定实体数据导入使用的后台模板扩展插件
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
    public PSDEDataImp pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    /**
     * <B>STOPWHENERROR</B>&nbsp;错误时停止导入，指定数据导入在发生错误时是否中止，未定义时为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_STOPWHENERROR = "stopwhenerror";

    /**
     * 设置 错误时停止导入，详细说明：{@link #FIELD_STOPWHENERROR}
     * 
     * @param stopWhenError
     * 
     */
    @JsonProperty(FIELD_STOPWHENERROR)
    public void setStopWhenError(Integer stopWhenError){
        this.set(FIELD_STOPWHENERROR, stopWhenError);
    }
    
    /**
     * 获取 错误时停止导入  
     * @return
     */
    @JsonIgnore
    public Integer getStopWhenError(){
        Object objValue = this.get(FIELD_STOPWHENERROR);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 错误时停止导入 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStopWhenErrorDirty(){
        if(this.contains(FIELD_STOPWHENERROR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 错误时停止导入
     */
    @JsonIgnore
    public void resetStopWhenError(){
        this.reset(FIELD_STOPWHENERROR);
    }

    /**
     * 设置 错误时停止导入，详细说明：{@link #FIELD_STOPWHENERROR}
     * <P>
     * 等同 {@link #setStopWhenError}
     * @param stopWhenError
     */
    @JsonIgnore
    public PSDEDataImp stopwhenerror(Integer stopWhenError){
        this.setStopWhenError(stopWhenError);
        return this;
    }

     /**
     * 设置 错误时停止导入，详细说明：{@link #FIELD_STOPWHENERROR}
     * <P>
     * 等同 {@link #setStopWhenError}
     * @param stopWhenError
     */
    @JsonIgnore
    public PSDEDataImp stopwhenerror(Boolean stopWhenError){
        if(stopWhenError == null){
            this.setStopWhenError(null);
        }
        else{
            this.setStopWhenError(stopWhenError?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSDEDataImp updatedate(String updateDate){
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
    public PSDEDataImp updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>UPDATEPSDEACTIONID</B>&nbsp;更新数据行为，指定导入数据进行更新操作时调用的实体行为对象，未定义时为【UPDATE】
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_UPDATEPSDEACTIONID = "updatepsdeactionid";

    /**
     * 设置 更新数据行为，详细说明：{@link #FIELD_UPDATEPSDEACTIONID}
     * 
     * @param updatePSDEActionId
     * 
     */
    @JsonProperty(FIELD_UPDATEPSDEACTIONID)
    public void setUpdatePSDEActionId(String updatePSDEActionId){
        this.set(FIELD_UPDATEPSDEACTIONID, updatePSDEActionId);
    }
    
    /**
     * 获取 更新数据行为  
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
     * 判断 更新数据行为 是否指定值，包括空值
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
     * 重置 更新数据行为
     */
    @JsonIgnore
    public void resetUpdatePSDEActionId(){
        this.reset(FIELD_UPDATEPSDEACTIONID);
    }

    /**
     * 设置 更新数据行为，详细说明：{@link #FIELD_UPDATEPSDEACTIONID}
     * <P>
     * 等同 {@link #setUpdatePSDEActionId}
     * @param updatePSDEActionId
     */
    @JsonIgnore
    public PSDEDataImp updatepsdeactionid(String updatePSDEActionId){
        this.setUpdatePSDEActionId(updatePSDEActionId);
        return this;
    }

    /**
     * 设置 更新数据行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUpdatePSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDEDataImp updatepsdeactionid(PSDEAction pSDEAction){
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
     * <B>UPDATEPSDEACTIONNAME</B>&nbsp;更新数据行为，指定导入数据进行更新操作时调用的实体行为对象，未定义时为【UPDATE】
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UPDATEPSDEACTIONID}
     */
    public final static String FIELD_UPDATEPSDEACTIONNAME = "updatepsdeactionname";

    /**
     * 设置 更新数据行为，详细说明：{@link #FIELD_UPDATEPSDEACTIONNAME}
     * 
     * @param updatePSDEActionName
     * 
     */
    @JsonProperty(FIELD_UPDATEPSDEACTIONNAME)
    public void setUpdatePSDEActionName(String updatePSDEActionName){
        this.set(FIELD_UPDATEPSDEACTIONNAME, updatePSDEActionName);
    }
    
    /**
     * 获取 更新数据行为  
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
     * 判断 更新数据行为 是否指定值，包括空值
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
     * 重置 更新数据行为
     */
    @JsonIgnore
    public void resetUpdatePSDEActionName(){
        this.reset(FIELD_UPDATEPSDEACTIONNAME);
    }

    /**
     * 设置 更新数据行为，详细说明：{@link #FIELD_UPDATEPSDEACTIONNAME}
     * <P>
     * 等同 {@link #setUpdatePSDEActionName}
     * @param updatePSDEActionName
     */
    @JsonIgnore
    public PSDEDataImp updatepsdeactionname(String updatePSDEActionName){
        this.setUpdatePSDEActionName(updatePSDEActionName);
        return this;
    }

    /**
     * <B>UPDATEPSDEOPPRIVID</B>&nbsp;更新要求权限，指定导入数据进行更新操作时需要检查的实体操作标识，未定义时为【UPDATE】
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
    public PSDEDataImp updatepsdeopprivid(String updatePSDEOPPrivId){
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
    public PSDEDataImp updatepsdeopprivid(PSDEOPPriv pSDEOPPriv){
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
     * <B>UPDATEPSDEOPPRIVNAME</B>&nbsp;更新要求权限，指定导入数据进行更新操作时需要检查的实体操作标识，未定义时为【UPDATE】
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
    public PSDEDataImp updatepsdeopprivname(String updatePSDEOPPrivName){
        this.setUpdatePSDEOPPrivName(updatePSDEOPPrivName);
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
    public PSDEDataImp usercat(String userCat){
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
    public PSDEDataImp usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDEDataImp usertag(String userTag){
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
    public PSDEDataImp usertag2(String userTag2){
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
    public PSDEDataImp usertag3(String userTag3){
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
    public PSDEDataImp usertag4(String userTag4){
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
    public PSDEDataImp validflag(Integer validFlag){
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
    public PSDEDataImp validflag(Boolean validFlag){
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
        return this.getPSDEDataImpId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEDataImpId(strValue);
    }

    @JsonIgnore
    public PSDEDataImp id(String strValue){
        this.setPSDEDataImpId(strValue);
        return this;
    }


    /**
     *  实体数据导入项 成员集合
     */
    public final static String FIELD_PSDEDATAIMPITEMS = "psdedataimpitems";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSDEDataImpItem> psdedataimpitems;

    /**
     * 获取 实体数据导入项 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEDATAIMPITEMS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEDataImpItem> getPSDEDataImpItems(){
        return this.psdedataimpitems;
    }

    /**
     * 设置 实体数据导入项 成员集合  
     * @param psdedataimpitems
     */
    @JsonProperty(FIELD_PSDEDATAIMPITEMS)
    public void setPSDEDataImpItems(java.util.List<net.ibizsys.psmodel.core.domain.PSDEDataImpItem> psdedataimpitems){
        this.psdedataimpitems = psdedataimpitems;
    }

    /**
     * 获取 实体数据导入项 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEDataImpItem> getPSDEDataImpItemsIf(){
        if(this.psdedataimpitems == null){
            this.psdedataimpitems = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSDEDataImpItem>();          
        }
        return this.psdedataimpitems;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEDataImp){
            PSDEDataImp model = (PSDEDataImp)iPSModel;
            model.setPSDEDataImpItems(this.getPSDEDataImpItems());
        }
        super.copyTo(iPSModel);
    }
}
