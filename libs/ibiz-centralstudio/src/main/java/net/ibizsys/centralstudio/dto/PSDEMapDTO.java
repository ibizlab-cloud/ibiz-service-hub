package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEMAP</B>实体映射 模型传输对象
 * <P>
 * 实体功能映射模型，定义实体到目标实体的功能映射，包括属性、行为、数据集及查询。实体支持定义多个功能映射，在运行态配置使用的映射
 */
public class PSDEMapDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSDEMapDTO(){
    }      

    /**
     * <B>AUTODEACTIONMAP</B>&nbsp;自动行为映射，指定是否自动进行实体行为的映射，启用将自动将当前实体未映射行为与目标实体相同行为标识的实体行为进行映射，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_AUTODEACTIONMAP = "autodeactionmap";

    /**
     * 设置 自动行为映射，详细说明：{@link #FIELD_AUTODEACTIONMAP}
     * 
     * @param autoDEActionMap
     * 
     */
    @JsonProperty(FIELD_AUTODEACTIONMAP)
    public void setAutoDEActionMap(Integer autoDEActionMap){
        this.set(FIELD_AUTODEACTIONMAP, autoDEActionMap);
    }
    
    /**
     * 获取 自动行为映射  
     * @return
     */
    @JsonIgnore
    public Integer getAutoDEActionMap(){
        Object objValue = this.get(FIELD_AUTODEACTIONMAP);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 自动行为映射 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAutoDEActionMapDirty(){
        if(this.contains(FIELD_AUTODEACTIONMAP)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自动行为映射
     */
    @JsonIgnore
    public void resetAutoDEActionMap(){
        this.reset(FIELD_AUTODEACTIONMAP);
    }

    /**
     * 设置 自动行为映射，详细说明：{@link #FIELD_AUTODEACTIONMAP}
     * <P>
     * 等同 {@link #setAutoDEActionMap}
     * @param autoDEActionMap
     */
    @JsonIgnore
    public PSDEMapDTO autodeactionmap(Integer autoDEActionMap){
        this.setAutoDEActionMap(autoDEActionMap);
        return this;
    }

     /**
     * 设置 自动行为映射，详细说明：{@link #FIELD_AUTODEACTIONMAP}
     * <P>
     * 等同 {@link #setAutoDEActionMap}
     * @param autoDEActionMap
     */
    @JsonIgnore
    public PSDEMapDTO autodeactionmap(Boolean autoDEActionMap){
        if(autoDEActionMap == null){
            this.setAutoDEActionMap(null);
        }
        else{
            this.setAutoDEActionMap(autoDEActionMap?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>AUTODEDQMAP</B>&nbsp;自动查询映射，指定是否自动进行实体数据查询的映射，启用将自动将当前实体未映射数据查询与目标实体相同数据查询标识的实体数据查询进行映射，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_AUTODEDQMAP = "autodedqmap";

    /**
     * 设置 自动查询映射，详细说明：{@link #FIELD_AUTODEDQMAP}
     * 
     * @param autoDEDQMap
     * 
     */
    @JsonProperty(FIELD_AUTODEDQMAP)
    public void setAutoDEDQMap(Integer autoDEDQMap){
        this.set(FIELD_AUTODEDQMAP, autoDEDQMap);
    }
    
    /**
     * 获取 自动查询映射  
     * @return
     */
    @JsonIgnore
    public Integer getAutoDEDQMap(){
        Object objValue = this.get(FIELD_AUTODEDQMAP);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 自动查询映射 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAutoDEDQMapDirty(){
        if(this.contains(FIELD_AUTODEDQMAP)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自动查询映射
     */
    @JsonIgnore
    public void resetAutoDEDQMap(){
        this.reset(FIELD_AUTODEDQMAP);
    }

    /**
     * 设置 自动查询映射，详细说明：{@link #FIELD_AUTODEDQMAP}
     * <P>
     * 等同 {@link #setAutoDEDQMap}
     * @param autoDEDQMap
     */
    @JsonIgnore
    public PSDEMapDTO autodedqmap(Integer autoDEDQMap){
        this.setAutoDEDQMap(autoDEDQMap);
        return this;
    }

     /**
     * 设置 自动查询映射，详细说明：{@link #FIELD_AUTODEDQMAP}
     * <P>
     * 等同 {@link #setAutoDEDQMap}
     * @param autoDEDQMap
     */
    @JsonIgnore
    public PSDEMapDTO autodedqmap(Boolean autoDEDQMap){
        if(autoDEDQMap == null){
            this.setAutoDEDQMap(null);
        }
        else{
            this.setAutoDEDQMap(autoDEDQMap?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>AUTODEDSMAP</B>&nbsp;自动结果集映射，指定是否自动进行实体数据集的映射，启用将自动将当前实体未映射数据集与目标实体相同数据集标识的实体数据集进行映射，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_AUTODEDSMAP = "autodedsmap";

    /**
     * 设置 自动结果集映射，详细说明：{@link #FIELD_AUTODEDSMAP}
     * 
     * @param autoDEDSMap
     * 
     */
    @JsonProperty(FIELD_AUTODEDSMAP)
    public void setAutoDEDSMap(Integer autoDEDSMap){
        this.set(FIELD_AUTODEDSMAP, autoDEDSMap);
    }
    
    /**
     * 获取 自动结果集映射  
     * @return
     */
    @JsonIgnore
    public Integer getAutoDEDSMap(){
        Object objValue = this.get(FIELD_AUTODEDSMAP);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 自动结果集映射 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAutoDEDSMapDirty(){
        if(this.contains(FIELD_AUTODEDSMAP)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自动结果集映射
     */
    @JsonIgnore
    public void resetAutoDEDSMap(){
        this.reset(FIELD_AUTODEDSMAP);
    }

    /**
     * 设置 自动结果集映射，详细说明：{@link #FIELD_AUTODEDSMAP}
     * <P>
     * 等同 {@link #setAutoDEDSMap}
     * @param autoDEDSMap
     */
    @JsonIgnore
    public PSDEMapDTO autodedsmap(Integer autoDEDSMap){
        this.setAutoDEDSMap(autoDEDSMap);
        return this;
    }

     /**
     * 设置 自动结果集映射，详细说明：{@link #FIELD_AUTODEDSMAP}
     * <P>
     * 等同 {@link #setAutoDEDSMap}
     * @param autoDEDSMap
     */
    @JsonIgnore
    public PSDEMapDTO autodedsmap(Boolean autoDEDSMap){
        if(autoDEDSMap == null){
            this.setAutoDEDSMap(null);
        }
        else{
            this.setAutoDEDSMap(autoDEDSMap?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>AUTODEFIELDMAP</B>&nbsp;自动属性映射，指定是否自动进行实体属性的映射，启用将自动将当前实体未映射属性与目标实体相同属性标识的实体属性进行映射，注意：主键与主信息属性优先映射。未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_AUTODEFIELDMAP = "autodefieldmap";

    /**
     * 设置 自动属性映射，详细说明：{@link #FIELD_AUTODEFIELDMAP}
     * 
     * @param autoDEFieldMap
     * 
     */
    @JsonProperty(FIELD_AUTODEFIELDMAP)
    public void setAutoDEFieldMap(Integer autoDEFieldMap){
        this.set(FIELD_AUTODEFIELDMAP, autoDEFieldMap);
    }
    
    /**
     * 获取 自动属性映射  
     * @return
     */
    @JsonIgnore
    public Integer getAutoDEFieldMap(){
        Object objValue = this.get(FIELD_AUTODEFIELDMAP);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 自动属性映射 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAutoDEFieldMapDirty(){
        if(this.contains(FIELD_AUTODEFIELDMAP)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自动属性映射
     */
    @JsonIgnore
    public void resetAutoDEFieldMap(){
        this.reset(FIELD_AUTODEFIELDMAP);
    }

    /**
     * 设置 自动属性映射，详细说明：{@link #FIELD_AUTODEFIELDMAP}
     * <P>
     * 等同 {@link #setAutoDEFieldMap}
     * @param autoDEFieldMap
     */
    @JsonIgnore
    public PSDEMapDTO autodefieldmap(Integer autoDEFieldMap){
        this.setAutoDEFieldMap(autoDEFieldMap);
        return this;
    }

     /**
     * 设置 自动属性映射，详细说明：{@link #FIELD_AUTODEFIELDMAP}
     * <P>
     * 等同 {@link #setAutoDEFieldMap}
     * @param autoDEFieldMap
     */
    @JsonIgnore
    public PSDEMapDTO autodefieldmap(Boolean autoDEFieldMap){
        if(autoDEFieldMap == null){
            this.setAutoDEFieldMap(null);
        }
        else{
            this.setAutoDEFieldMap(autoDEFieldMap?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定实体映射的代码标识，需要在所在的实体中具有唯一性
     * <P>
     * 字符串：最大长度 50，由字母、数字、下划线组成，且开始必须为字母
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
    public PSDEMapDTO codename(String codeName){
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
    public PSDEMapDTO createdate(Timestamp createDate){
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
    public PSDEMapDTO createman(String createMan){
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
    public PSDEMapDTO customcode(String customCode){
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
    public PSDEMapDTO custommode(Integer customMode){
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
    public PSDEMapDTO custommode(Boolean customMode){
        if(customMode == null){
            this.setCustomMode(null);
        }
        else{
            this.setCustomMode(customMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DEFAULTMODE</B>&nbsp;默认映射，指定实体映射是否为所在实体的默认映射，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEFAULTMODE = "defaultmode";

    /**
     * 设置 默认映射，详细说明：{@link #FIELD_DEFAULTMODE}
     * 
     * @param defaultMode
     * 
     */
    @JsonProperty(FIELD_DEFAULTMODE)
    public void setDefaultMode(Integer defaultMode){
        this.set(FIELD_DEFAULTMODE, defaultMode);
    }
    
    /**
     * 获取 默认映射  
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
     * 判断 默认映射 是否指定值，包括空值
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
     * 重置 默认映射
     */
    @JsonIgnore
    public void resetDefaultMode(){
        this.reset(FIELD_DEFAULTMODE);
    }

    /**
     * 设置 默认映射，详细说明：{@link #FIELD_DEFAULTMODE}
     * <P>
     * 等同 {@link #setDefaultMode}
     * @param defaultMode
     */
    @JsonIgnore
    public PSDEMapDTO defaultmode(Integer defaultMode){
        this.setDefaultMode(defaultMode);
        return this;
    }

     /**
     * 设置 默认映射，详细说明：{@link #FIELD_DEFAULTMODE}
     * <P>
     * 等同 {@link #setDefaultMode}
     * @param defaultMode
     */
    @JsonIgnore
    public PSDEMapDTO defaultmode(Boolean defaultMode){
        if(defaultMode == null){
            this.setDefaultMode(null);
        }
        else{
            this.setDefaultMode(defaultMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DSTPSDEID</B>&nbsp;目标实体，实体映射目标为【当前系统实体】时指定映射到的目标实体对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDataEntityDTO} 
     */
    public final static String FIELD_DSTPSDEID = "dstpsdeid";

    /**
     * 设置 目标实体，详细说明：{@link #FIELD_DSTPSDEID}
     * 
     * @param dSTPSDEId
     * 
     */
    @JsonProperty(FIELD_DSTPSDEID)
    public void setDSTPSDEId(String dSTPSDEId){
        this.set(FIELD_DSTPSDEID, dSTPSDEId);
    }
    
    /**
     * 获取 目标实体  
     * @return
     */
    @JsonIgnore
    public String getDSTPSDEId(){
        Object objValue = this.get(FIELD_DSTPSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDSTPSDEIdDirty(){
        if(this.contains(FIELD_DSTPSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标实体
     */
    @JsonIgnore
    public void resetDSTPSDEId(){
        this.reset(FIELD_DSTPSDEID);
    }

    /**
     * 设置 目标实体，详细说明：{@link #FIELD_DSTPSDEID}
     * <P>
     * 等同 {@link #setDSTPSDEId}
     * @param dSTPSDEId
     */
    @JsonIgnore
    public PSDEMapDTO dstpsdeid(String dSTPSDEId){
        this.setDSTPSDEId(dSTPSDEId);
        return this;
    }

    /**
     * 设置 目标实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDSTPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDEMapDTO dstpsdeid(PSDataEntityDTO pSDataEntity){
        if(pSDataEntity == null){
            this.setDSTPSDEId(null);
            this.setDSTPSDEName(null);
        }
        else{
            this.setDSTPSDEId(pSDataEntity.getPSDataEntityId());
            this.setDSTPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>DSTPSDENAME</B>&nbsp;目标实体，实体映射目标为【当前系统实体】时指定映射到的目标实体对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DSTPSDEID}
     */
    public final static String FIELD_DSTPSDENAME = "dstpsdename";

    /**
     * 设置 目标实体，详细说明：{@link #FIELD_DSTPSDENAME}
     * 
     * @param dSTPSDEName
     * 
     */
    @JsonProperty(FIELD_DSTPSDENAME)
    public void setDSTPSDEName(String dSTPSDEName){
        this.set(FIELD_DSTPSDENAME, dSTPSDEName);
    }
    
    /**
     * 获取 目标实体  
     * @return
     */
    @JsonIgnore
    public String getDSTPSDEName(){
        Object objValue = this.get(FIELD_DSTPSDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDSTPSDENameDirty(){
        if(this.contains(FIELD_DSTPSDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标实体
     */
    @JsonIgnore
    public void resetDSTPSDEName(){
        this.reset(FIELD_DSTPSDENAME);
    }

    /**
     * 设置 目标实体，详细说明：{@link #FIELD_DSTPSDENAME}
     * <P>
     * 等同 {@link #setDSTPSDEName}
     * @param dSTPSDEName
     */
    @JsonIgnore
    public PSDEMapDTO dstpsdename(String dSTPSDEName){
        this.setDSTPSDEName(dSTPSDEName);
        return this;
    }

    /**
     * <B>DSTPSSYSREFDEID</B>&nbsp;目标系统引用实体
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_DSTPSSYSREFDEID = "dstpssysrefdeid";

    /**
     * 设置 目标系统引用实体
     * 
     * @param dstPSSysRefDEId
     * 
     */
    @JsonProperty(FIELD_DSTPSSYSREFDEID)
    public void setDstPSSysRefDEId(String dstPSSysRefDEId){
        this.set(FIELD_DSTPSSYSREFDEID, dstPSSysRefDEId);
    }
    
    /**
     * 获取 目标系统引用实体  
     * @return
     */
    @JsonIgnore
    public String getDstPSSysRefDEId(){
        Object objValue = this.get(FIELD_DSTPSSYSREFDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标系统引用实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSSysRefDEIdDirty(){
        if(this.contains(FIELD_DSTPSSYSREFDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标系统引用实体
     */
    @JsonIgnore
    public void resetDstPSSysRefDEId(){
        this.reset(FIELD_DSTPSSYSREFDEID);
    }

    /**
     * 设置 目标系统引用实体
     * <P>
     * 等同 {@link #setDstPSSysRefDEId}
     * @param dstPSSysRefDEId
     */
    @JsonIgnore
    public PSDEMapDTO dstpssysrefdeid(String dstPSSysRefDEId){
        this.setDstPSSysRefDEId(dstPSSysRefDEId);
        return this;
    }

    /**
     * <B>DSTPSSYSREFDENAME</B>&nbsp;目标系统引用实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DSTPSSYSREFDEID}
     */
    public final static String FIELD_DSTPSSYSREFDENAME = "dstpssysrefdename";

    /**
     * 设置 目标系统引用实体
     * 
     * @param dstPSSysRefDEName
     * 
     */
    @JsonProperty(FIELD_DSTPSSYSREFDENAME)
    public void setDstPSSysRefDEName(String dstPSSysRefDEName){
        this.set(FIELD_DSTPSSYSREFDENAME, dstPSSysRefDEName);
    }
    
    /**
     * 获取 目标系统引用实体  
     * @return
     */
    @JsonIgnore
    public String getDstPSSysRefDEName(){
        Object objValue = this.get(FIELD_DSTPSSYSREFDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标系统引用实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSSysRefDENameDirty(){
        if(this.contains(FIELD_DSTPSSYSREFDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标系统引用实体
     */
    @JsonIgnore
    public void resetDstPSSysRefDEName(){
        this.reset(FIELD_DSTPSSYSREFDENAME);
    }

    /**
     * 设置 目标系统引用实体
     * <P>
     * 等同 {@link #setDstPSSysRefDEName}
     * @param dstPSSysRefDEName
     */
    @JsonIgnore
    public PSDEMapDTO dstpssysrefdename(String dstPSSysRefDEName){
        this.setDstPSSysRefDEName(dstPSSysRefDEName);
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;中文名称，指定实体映射的逻辑名称
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_LOGICNAME = "logicname";

    /**
     * 设置 中文名称，详细说明：{@link #FIELD_LOGICNAME}
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
     * 设置 中文名称，详细说明：{@link #FIELD_LOGICNAME}
     * <P>
     * 等同 {@link #setLogicName}
     * @param logicName
     */
    @JsonIgnore
    public PSDEMapDTO logicname(String logicName){
        this.setLogicName(logicName);
        return this;
    }

    /**
     * <B>MAPMODE</B>&nbsp;处理默认映射模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DEMapObjectMapMode} 
     */
    public final static String FIELD_MAPMODE = "mapmode";

    /**
     * 设置 处理默认映射模式
     * 
     * @param mapMode
     * 
     */
    @JsonProperty(FIELD_MAPMODE)
    public void setMapMode(String mapMode){
        this.set(FIELD_MAPMODE, mapMode);
    }
    
    /**
     * 获取 处理默认映射模式  
     * @return
     */
    @JsonIgnore
    public String getMapMode(){
        Object objValue = this.get(FIELD_MAPMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 处理默认映射模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMapModeDirty(){
        if(this.contains(FIELD_MAPMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 处理默认映射模式
     */
    @JsonIgnore
    public void resetMapMode(){
        this.reset(FIELD_MAPMODE);
    }

    /**
     * 设置 处理默认映射模式
     * <P>
     * 等同 {@link #setMapMode}
     * @param mapMode
     */
    @JsonIgnore
    public PSDEMapDTO mapmode(String mapMode){
        this.setMapMode(mapMode);
        return this;
    }

     /**
     * 设置 处理默认映射模式
     * <P>
     * 等同 {@link #setMapMode}
     * @param mapMode
     */
    @JsonIgnore
    public PSDEMapDTO mapmode(net.ibizsys.model.PSModelEnums.DEMapObjectMapMode mapMode){
        if(mapMode == null){
            this.setMapMode(null);
        }
        else{
            this.setMapMode(mapMode.value);
        }
        return this;
    }

    /**
     * <B>MAPTARGET</B>&nbsp;映射目标类型，指定实体功能映射的目标类型，当前仅支持【当前系统实体】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DEMapTargetType} 
     */
    public final static String FIELD_MAPTARGET = "maptarget";

    /**
     * 设置 映射目标类型，详细说明：{@link #FIELD_MAPTARGET}
     * 
     * @param mapTarget
     * 
     */
    @JsonProperty(FIELD_MAPTARGET)
    public void setMapTarget(String mapTarget){
        this.set(FIELD_MAPTARGET, mapTarget);
    }
    
    /**
     * 获取 映射目标类型  
     * @return
     */
    @JsonIgnore
    public String getMapTarget(){
        Object objValue = this.get(FIELD_MAPTARGET);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 映射目标类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMapTargetDirty(){
        if(this.contains(FIELD_MAPTARGET)){
            return true;
        }
        return false;
    }

    /**
     * 重置 映射目标类型
     */
    @JsonIgnore
    public void resetMapTarget(){
        this.reset(FIELD_MAPTARGET);
    }

    /**
     * 设置 映射目标类型，详细说明：{@link #FIELD_MAPTARGET}
     * <P>
     * 等同 {@link #setMapTarget}
     * @param mapTarget
     */
    @JsonIgnore
    public PSDEMapDTO maptarget(String mapTarget){
        this.setMapTarget(mapTarget);
        return this;
    }

     /**
     * 设置 映射目标类型，详细说明：{@link #FIELD_MAPTARGET}
     * <P>
     * 等同 {@link #setMapTarget}
     * @param mapTarget
     */
    @JsonIgnore
    public PSDEMapDTO maptarget(net.ibizsys.model.PSModelEnums.DEMapTargetType mapTarget){
        if(mapTarget == null){
            this.setMapTarget(null);
        }
        else{
            this.setMapTarget(mapTarget.value);
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
    public PSDEMapDTO memo(String memo){
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
    public PSDEMapDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PROPERTYMAP</B>&nbsp;参数映射
     */
    public final static String FIELD_PROPERTYMAP = "propertymap";

    /**
     * 设置 参数映射
     * 
     * @param propertyMap
     * 
     */
    @JsonProperty(FIELD_PROPERTYMAP)
    public void setPropertyMap(String propertyMap){
        this.set(FIELD_PROPERTYMAP, propertyMap);
    }
    
    /**
     * 获取 参数映射  
     * @return
     */
    @JsonIgnore
    public String getPropertyMap(){
        Object objValue = this.get(FIELD_PROPERTYMAP);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数映射 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPropertyMapDirty(){
        if(this.contains(FIELD_PROPERTYMAP)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数映射
     */
    @JsonIgnore
    public void resetPropertyMap(){
        this.reset(FIELD_PROPERTYMAP);
    }

    /**
     * 设置 参数映射
     * <P>
     * 等同 {@link #setPropertyMap}
     * @param propertyMap
     */
    @JsonIgnore
    public PSDEMapDTO propertymap(String propertyMap){
        this.setPropertyMap(propertyMap);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定实体映射所在的实体对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDataEntityDTO} 
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
    public PSDEMapDTO psdeid(String pSDEId){
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
    public PSDEMapDTO psdeid(PSDataEntityDTO pSDataEntity){
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
     * <B>PSDEMAPID</B>&nbsp;实体映射标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEMAPID = "psdemapid";

    /**
     * 设置 实体映射标识
     * 
     * @param pSDEMapId
     * 
     */
    @JsonProperty(FIELD_PSDEMAPID)
    public void setPSDEMapId(String pSDEMapId){
        this.set(FIELD_PSDEMAPID, pSDEMapId);
    }
    
    /**
     * 获取 实体映射标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEMapId(){
        Object objValue = this.get(FIELD_PSDEMAPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体映射标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEMapIdDirty(){
        if(this.contains(FIELD_PSDEMAPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体映射标识
     */
    @JsonIgnore
    public void resetPSDEMapId(){
        this.reset(FIELD_PSDEMAPID);
    }

    /**
     * 设置 实体映射标识
     * <P>
     * 等同 {@link #setPSDEMapId}
     * @param pSDEMapId
     */
    @JsonIgnore
    public PSDEMapDTO psdemapid(String pSDEMapId){
        this.setPSDEMapId(pSDEMapId);
        return this;
    }

    /**
     * <B>PSDEMAPNAME</B>&nbsp;实体映射名称，指定实体映射的名称，需在所在实体具备唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEMAPNAME = "psdemapname";

    /**
     * 设置 实体映射名称，详细说明：{@link #FIELD_PSDEMAPNAME}
     * 
     * @param pSDEMapName
     * 
     */
    @JsonProperty(FIELD_PSDEMAPNAME)
    public void setPSDEMapName(String pSDEMapName){
        this.set(FIELD_PSDEMAPNAME, pSDEMapName);
    }
    
    /**
     * 获取 实体映射名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEMapName(){
        Object objValue = this.get(FIELD_PSDEMAPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体映射名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEMapNameDirty(){
        if(this.contains(FIELD_PSDEMAPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体映射名称
     */
    @JsonIgnore
    public void resetPSDEMapName(){
        this.reset(FIELD_PSDEMAPNAME);
    }

    /**
     * 设置 实体映射名称，详细说明：{@link #FIELD_PSDEMAPNAME}
     * <P>
     * 等同 {@link #setPSDEMapName}
     * @param pSDEMapName
     */
    @JsonIgnore
    public PSDEMapDTO psdemapname(String pSDEMapName){
        this.setPSDEMapName(pSDEMapName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEMapName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEMapName(strName);
    }

    @JsonIgnore
    public PSDEMapDTO name(String strName){
        this.setPSDEMapName(strName);
        return this;
    }

    /**
     * <B>PSDENAME</B>&nbsp;实体，指定实体映射所在的实体对象
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
    public PSDEMapDTO psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELID</B>&nbsp;系统动态模型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysDynaModelDTO} 
     */
    public final static String FIELD_PSSYSDYNAMODELID = "pssysdynamodelid";

    /**
     * 设置 系统动态模型
     * 
     * @param pSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELID)
    public void setPSSysDynaModelId(String pSSysDynaModelId){
        this.set(FIELD_PSSYSDYNAMODELID, pSSysDynaModelId);
    }
    
    /**
     * 获取 系统动态模型  
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
     * 判断 系统动态模型 是否指定值，包括空值
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
     * 重置 系统动态模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelId(){
        this.reset(FIELD_PSSYSDYNAMODELID);
    }

    /**
     * 设置 系统动态模型
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModelId
     */
    @JsonIgnore
    public PSDEMapDTO pssysdynamodelid(String pSSysDynaModelId){
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    /**
     * 设置 系统动态模型，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModel 引用对象
     */
    @JsonIgnore
    public PSDEMapDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel){
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
     * <B>PSSYSDYNAMODELNAME</B>&nbsp;系统动态模型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDYNAMODELID}
     */
    public final static String FIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";

    /**
     * 设置 系统动态模型
     * 
     * @param pSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELNAME)
    public void setPSSysDynaModelName(String pSSysDynaModelName){
        this.set(FIELD_PSSYSDYNAMODELNAME, pSSysDynaModelName);
    }
    
    /**
     * 获取 系统动态模型  
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
     * 判断 系统动态模型 是否指定值，包括空值
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
     * 重置 系统动态模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelName(){
        this.reset(FIELD_PSSYSDYNAMODELNAME);
    }

    /**
     * 设置 系统动态模型
     * <P>
     * 等同 {@link #setPSSysDynaModelName}
     * @param pSSysDynaModelName
     */
    @JsonIgnore
    public PSDEMapDTO pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSSYSREFID</B>&nbsp;系统引用
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysRefDTO} 
     */
    public final static String FIELD_PSSYSREFID = "pssysrefid";

    /**
     * 设置 系统引用
     * 
     * @param pSSysRefId
     * 
     */
    @JsonProperty(FIELD_PSSYSREFID)
    public void setPSSysRefId(String pSSysRefId){
        this.set(FIELD_PSSYSREFID, pSSysRefId);
    }
    
    /**
     * 获取 系统引用  
     * @return
     */
    @JsonIgnore
    public String getPSSysRefId(){
        Object objValue = this.get(FIELD_PSSYSREFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统引用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysRefIdDirty(){
        if(this.contains(FIELD_PSSYSREFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统引用
     */
    @JsonIgnore
    public void resetPSSysRefId(){
        this.reset(FIELD_PSSYSREFID);
    }

    /**
     * 设置 系统引用
     * <P>
     * 等同 {@link #setPSSysRefId}
     * @param pSSysRefId
     */
    @JsonIgnore
    public PSDEMapDTO pssysrefid(String pSSysRefId){
        this.setPSSysRefId(pSSysRefId);
        return this;
    }

    /**
     * 设置 系统引用，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysRefId}
     * @param pSSysRef 引用对象
     */
    @JsonIgnore
    public PSDEMapDTO pssysrefid(PSSysRefDTO pSSysRef){
        if(pSSysRef == null){
            this.setPSSysRefId(null);
            this.setPSSysRefName(null);
        }
        else{
            this.setPSSysRefId(pSSysRef.getPSSysRefId());
            this.setPSSysRefName(pSSysRef.getPSSysRefName());
        }
        return this;
    }

    /**
     * <B>PSSYSREFNAME</B>&nbsp;系统引用
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSREFID}
     */
    public final static String FIELD_PSSYSREFNAME = "pssysrefname";

    /**
     * 设置 系统引用
     * 
     * @param pSSysRefName
     * 
     */
    @JsonProperty(FIELD_PSSYSREFNAME)
    public void setPSSysRefName(String pSSysRefName){
        this.set(FIELD_PSSYSREFNAME, pSSysRefName);
    }
    
    /**
     * 获取 系统引用  
     * @return
     */
    @JsonIgnore
    public String getPSSysRefName(){
        Object objValue = this.get(FIELD_PSSYSREFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统引用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysRefNameDirty(){
        if(this.contains(FIELD_PSSYSREFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统引用
     */
    @JsonIgnore
    public void resetPSSysRefName(){
        this.reset(FIELD_PSSYSREFNAME);
    }

    /**
     * 设置 系统引用
     * <P>
     * 等同 {@link #setPSSysRefName}
     * @param pSSysRefName
     */
    @JsonIgnore
    public PSDEMapDTO pssysrefname(String pSSysRefName){
        this.setPSSysRefName(pSSysRefName);
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
    public PSDEMapDTO pssysreqitemid(String pSSysReqItemId){
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
    public PSDEMapDTO pssysreqitemid(PSSysReqItemDTO pSSysReqItem){
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
    public PSDEMapDTO pssysreqitemname(String pSSysReqItemName){
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINID</B>&nbsp;后台扩展插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysSFPluginDTO} 
     */
    public final static String FIELD_PSSYSSFPLUGINID = "pssyssfpluginid";

    /**
     * 设置 后台扩展插件
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
     * 设置 后台扩展插件
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPluginId
     */
    @JsonIgnore
    public PSDEMapDTO pssyssfpluginid(String pSSysSFPluginId){
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
    public PSDEMapDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin){
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
     * <B>PSSYSSFPLUGINNAME</B>&nbsp;后台扩展插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSFPLUGINID}
     */
    public final static String FIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";

    /**
     * 设置 后台扩展插件
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
     * 设置 后台扩展插件
     * <P>
     * 等同 {@link #setPSSysSFPluginName}
     * @param pSSysSFPluginName
     */
    @JsonIgnore
    public PSDEMapDTO pssyssfpluginname(String pSSysSFPluginName){
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
    public PSDEMapDTO updatedate(Timestamp updateDate){
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
    public PSDEMapDTO updateman(String updateMan){
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
    public PSDEMapDTO usercat(String userCat){
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
    public PSDEMapDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSDEMapDTO usertag(String userTag){
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
    public PSDEMapDTO usertag2(String userTag2){
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
    public PSDEMapDTO usertag3(String userTag3){
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
    public PSDEMapDTO usertag4(String userTag4){
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
    public PSDEMapDTO validflag(Integer validFlag){
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
    public PSDEMapDTO validflag(Boolean validFlag){
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
        return this.getPSDEMapId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSDEMapId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEMapId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEMapId(strValue);
    }

    @JsonIgnore
    public PSDEMapDTO id(String strValue){
        this.setPSDEMapId(strValue);
        return this;
    }


    /**
     *  实体映射行为 成员集合
     */
    public final static String FIELD_PSDEMAPACTIONS = "psdemapactions";

    private java.util.List<net.ibizsys.centralstudio.dto.PSDEMapActionDTO> psdemapactions;

    /**
     * 获取 实体映射行为 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEMAPACTIONS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEMapActionDTO> getPSDEMapActions(){
        return this.psdemapactions;
    }

    /**
     * 设置 实体映射行为 成员集合  
     * @param psdemapactions
     */
    @JsonProperty(FIELD_PSDEMAPACTIONS)
    public void setPSDEMapActions(java.util.List<net.ibizsys.centralstudio.dto.PSDEMapActionDTO> psdemapactions){
        this.psdemapactions = psdemapactions;
    }

    /**
     * 获取 实体映射行为 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEMapActionDTO> getPSDEMapActionsIf(){
        if(this.psdemapactions == null){
            this.psdemapactions = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSDEMapActionDTO>();          
        }
        return this.psdemapactions;
    }


    /**
     *  实体映射属性 成员集合
     */
    public final static String FIELD_PSDEMAPDETAILS = "psdemapdetails";

    private java.util.List<net.ibizsys.centralstudio.dto.PSDEMapDetailDTO> psdemapdetails;

    /**
     * 获取 实体映射属性 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEMAPDETAILS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEMapDetailDTO> getPSDEMapDetails(){
        return this.psdemapdetails;
    }

    /**
     * 设置 实体映射属性 成员集合  
     * @param psdemapdetails
     */
    @JsonProperty(FIELD_PSDEMAPDETAILS)
    public void setPSDEMapDetails(java.util.List<net.ibizsys.centralstudio.dto.PSDEMapDetailDTO> psdemapdetails){
        this.psdemapdetails = psdemapdetails;
    }

    /**
     * 获取 实体映射属性 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEMapDetailDTO> getPSDEMapDetailsIf(){
        if(this.psdemapdetails == null){
            this.psdemapdetails = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSDEMapDetailDTO>();          
        }
        return this.psdemapdetails;
    }


    /**
     *  实体映射查询 成员集合
     */
    public final static String FIELD_PSDEMAPDQS = "psdemapdqs";

    private java.util.List<net.ibizsys.centralstudio.dto.PSDEMapDQDTO> psdemapdqs;

    /**
     * 获取 实体映射查询 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEMAPDQS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEMapDQDTO> getPSDEMapDQs(){
        return this.psdemapdqs;
    }

    /**
     * 设置 实体映射查询 成员集合  
     * @param psdemapdqs
     */
    @JsonProperty(FIELD_PSDEMAPDQS)
    public void setPSDEMapDQs(java.util.List<net.ibizsys.centralstudio.dto.PSDEMapDQDTO> psdemapdqs){
        this.psdemapdqs = psdemapdqs;
    }

    /**
     * 获取 实体映射查询 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEMapDQDTO> getPSDEMapDQsIf(){
        if(this.psdemapdqs == null){
            this.psdemapdqs = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSDEMapDQDTO>();          
        }
        return this.psdemapdqs;
    }


    /**
     *  实体映射数据集合 成员集合
     */
    public final static String FIELD_PSDEMAPDS = "psdemapds";

    private java.util.List<net.ibizsys.centralstudio.dto.PSDEMapDSDTO> psdemapds;

    /**
     * 获取 实体映射数据集合 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEMAPDS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEMapDSDTO> getPSDEMapDs(){
        return this.psdemapds;
    }

    /**
     * 设置 实体映射数据集合 成员集合  
     * @param psdemapds
     */
    @JsonProperty(FIELD_PSDEMAPDS)
    public void setPSDEMapDs(java.util.List<net.ibizsys.centralstudio.dto.PSDEMapDSDTO> psdemapds){
        this.psdemapds = psdemapds;
    }

    /**
     * 获取 实体映射数据集合 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEMapDSDTO> getPSDEMapDsIf(){
        if(this.psdemapds == null){
            this.psdemapds = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSDEMapDSDTO>();          
        }
        return this.psdemapds;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDEMapDTO){
            PSDEMapDTO dto = (PSDEMapDTO)iEntity;
            dto.setPSDEMapActions(this.getPSDEMapActions());
            dto.setPSDEMapDetails(this.getPSDEMapDetails());
            dto.setPSDEMapDQs(this.getPSDEMapDQs());
            dto.setPSDEMapDs(this.getPSDEMapDs());
        }
        super.copyTo(iEntity);
    }
}
