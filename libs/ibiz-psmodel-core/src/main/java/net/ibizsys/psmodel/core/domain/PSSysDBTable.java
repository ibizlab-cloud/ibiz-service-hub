package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSDBTABLE</B>系统数据库表 模型传输对象
 * <P>
 * 关系数据表模型，定义数据表的基本信息，包括数据列对象
 */
public class PSSysDBTable extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysDBTable(){
    }      

    /**
     * <B>AUTOEXTENDMODEL</B>&nbsp;自动扩展模型，指定数据表是否自动扩展模型，未定义时为使用所在数据库体系配置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_AUTOEXTENDMODEL = "autoextendmodel";

    /**
     * 设置 自动扩展模型，详细说明：{@link #FIELD_AUTOEXTENDMODEL}
     * 
     * @param autoExtendModel
     * 
     */
    @JsonProperty(FIELD_AUTOEXTENDMODEL)
    public void setAutoExtendModel(Integer autoExtendModel){
        this.set(FIELD_AUTOEXTENDMODEL, autoExtendModel);
    }
    
    /**
     * 获取 自动扩展模型  
     * @return
     */
    @JsonIgnore
    public Integer getAutoExtendModel(){
        Object objValue = this.get(FIELD_AUTOEXTENDMODEL);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 自动扩展模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAutoExtendModelDirty(){
        if(this.contains(FIELD_AUTOEXTENDMODEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自动扩展模型
     */
    @JsonIgnore
    public void resetAutoExtendModel(){
        this.reset(FIELD_AUTOEXTENDMODEL);
    }

    /**
     * 设置 自动扩展模型，详细说明：{@link #FIELD_AUTOEXTENDMODEL}
     * <P>
     * 等同 {@link #setAutoExtendModel}
     * @param autoExtendModel
     */
    @JsonIgnore
    public PSSysDBTable autoextendmodel(Integer autoExtendModel){
        this.setAutoExtendModel(autoExtendModel);
        return this;
    }

     /**
     * 设置 自动扩展模型，详细说明：{@link #FIELD_AUTOEXTENDMODEL}
     * <P>
     * 等同 {@link #setAutoExtendModel}
     * @param autoExtendModel
     */
    @JsonIgnore
    public PSSysDBTable autoextendmodel(Boolean autoExtendModel){
        if(autoExtendModel == null){
            this.setAutoExtendModel(null);
        }
        else{
            this.setAutoExtendModel(autoExtendModel?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定数据表的代码标识，需要在所在的数据库体系中具有唯一性
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
    public PSSysDBTable codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>CODENAME2</B>&nbsp;代码标识2，指定数据表的代码标识2，需要在所在的数据库体系中具有唯一性
     * <P>
     * 字符串：最大长度 50，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_CODENAME2 = "codename2";

    /**
     * 设置 代码标识2，详细说明：{@link #FIELD_CODENAME2}
     * 
     * @param codeName2
     * 
     */
    @JsonProperty(FIELD_CODENAME2)
    public void setCodeName2(String codeName2){
        this.set(FIELD_CODENAME2, codeName2);
    }
    
    /**
     * 获取 代码标识2  
     * @return
     */
    @JsonIgnore
    public String getCodeName2(){
        Object objValue = this.get(FIELD_CODENAME2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码标识2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCodeName2Dirty(){
        if(this.contains(FIELD_CODENAME2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码标识2
     */
    @JsonIgnore
    public void resetCodeName2(){
        this.reset(FIELD_CODENAME2);
    }

    /**
     * 设置 代码标识2，详细说明：{@link #FIELD_CODENAME2}
     * <P>
     * 等同 {@link #setCodeName2}
     * @param codeName2
     */
    @JsonIgnore
    public PSSysDBTable codename2(String codeName2){
        this.setCodeName2(codeName2);
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
    public PSSysDBTable createdate(String createDate){
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
    public PSSysDBTable createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CREATESQL</B>&nbsp;建立SQL，指定数据表的建立SQL
     */
    public final static String FIELD_CREATESQL = "createsql";

    /**
     * 设置 建立SQL，详细说明：{@link #FIELD_CREATESQL}
     * 
     * @param createSql
     * 
     */
    @JsonProperty(FIELD_CREATESQL)
    public void setCreateSql(String createSql){
        this.set(FIELD_CREATESQL, createSql);
    }
    
    /**
     * 获取 建立SQL  
     * @return
     */
    @JsonIgnore
    public String getCreateSql(){
        Object objValue = this.get(FIELD_CREATESQL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 建立SQL 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCreateSqlDirty(){
        if(this.contains(FIELD_CREATESQL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 建立SQL
     */
    @JsonIgnore
    public void resetCreateSql(){
        this.reset(FIELD_CREATESQL);
    }

    /**
     * 设置 建立SQL，详细说明：{@link #FIELD_CREATESQL}
     * <P>
     * 等同 {@link #setCreateSql}
     * @param createSql
     */
    @JsonIgnore
    public PSSysDBTable createsql(String createSql){
        this.setCreateSql(createSql);
        return this;
    }

    /**
     * <B>DROPSQL</B>&nbsp;移除SQL，指定数据表的移除SQL
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_DROPSQL = "dropsql";

    /**
     * 设置 移除SQL，详细说明：{@link #FIELD_DROPSQL}
     * 
     * @param dropSql
     * 
     */
    @JsonProperty(FIELD_DROPSQL)
    public void setDropSql(String dropSql){
        this.set(FIELD_DROPSQL, dropSql);
    }
    
    /**
     * 获取 移除SQL  
     * @return
     */
    @JsonIgnore
    public String getDropSql(){
        Object objValue = this.get(FIELD_DROPSQL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移除SQL 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDropSqlDirty(){
        if(this.contains(FIELD_DROPSQL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移除SQL
     */
    @JsonIgnore
    public void resetDropSql(){
        this.reset(FIELD_DROPSQL);
    }

    /**
     * 设置 移除SQL，详细说明：{@link #FIELD_DROPSQL}
     * <P>
     * 等同 {@link #setDropSql}
     * @param dropSql
     */
    @JsonIgnore
    public PSSysDBTable dropsql(String dropSql){
        this.setDropSql(dropSql);
        return this;
    }

    /**
     * <B>DSLINK</B>&nbsp;数据源
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DataSourceLink} 
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDBSCHEMEID}
     */
    public final static String FIELD_DSLINK = "dslink";

    /**
     * 设置 数据源
     * 
     * @param dSLink
     * 
     */
    @JsonProperty(FIELD_DSLINK)
    public void setDSLink(String dSLink){
        this.set(FIELD_DSLINK, dSLink);
    }
    
    /**
     * 获取 数据源  
     * @return
     */
    @JsonIgnore
    public String getDSLink(){
        Object objValue = this.get(FIELD_DSLINK);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDSLinkDirty(){
        if(this.contains(FIELD_DSLINK)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据源
     */
    @JsonIgnore
    public void resetDSLink(){
        this.reset(FIELD_DSLINK);
    }

    /**
     * 设置 数据源
     * <P>
     * 等同 {@link #setDSLink}
     * @param dSLink
     */
    @JsonIgnore
    public PSSysDBTable dslink(String dSLink){
        this.setDSLink(dSLink);
        return this;
    }

    /**
     * <B>EXISTINGMODEL</B>&nbsp;现有结构，指定数据表是否为现有数据结构，未定义时为使用所在数据库体系配置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_EXISTINGMODEL = "existingmodel";

    /**
     * 设置 现有结构，详细说明：{@link #FIELD_EXISTINGMODEL}
     * 
     * @param existingModel
     * 
     */
    @JsonProperty(FIELD_EXISTINGMODEL)
    public void setExistingModel(Integer existingModel){
        this.set(FIELD_EXISTINGMODEL, existingModel);
    }
    
    /**
     * 获取 现有结构  
     * @return
     */
    @JsonIgnore
    public Integer getExistingModel(){
        Object objValue = this.get(FIELD_EXISTINGMODEL);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 现有结构 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExistingModelDirty(){
        if(this.contains(FIELD_EXISTINGMODEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 现有结构
     */
    @JsonIgnore
    public void resetExistingModel(){
        this.reset(FIELD_EXISTINGMODEL);
    }

    /**
     * 设置 现有结构，详细说明：{@link #FIELD_EXISTINGMODEL}
     * <P>
     * 等同 {@link #setExistingModel}
     * @param existingModel
     */
    @JsonIgnore
    public PSSysDBTable existingmodel(Integer existingModel){
        this.setExistingModel(existingModel);
        return this;
    }

     /**
     * 设置 现有结构，详细说明：{@link #FIELD_EXISTINGMODEL}
     * <P>
     * 等同 {@link #setExistingModel}
     * @param existingModel
     */
    @JsonIgnore
    public PSSysDBTable existingmodel(Boolean existingModel){
        if(existingModel == null){
            this.setExistingModel(null);
        }
        else{
            this.setExistingModel(existingModel?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;逻辑名称，指定数据表的逻辑名称
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_LOGICNAME = "logicname";

    /**
     * 设置 逻辑名称，详细说明：{@link #FIELD_LOGICNAME}
     * 
     * @param logicName
     * 
     */
    @JsonProperty(FIELD_LOGICNAME)
    public void setLogicName(String logicName){
        this.set(FIELD_LOGICNAME, logicName);
    }
    
    /**
     * 获取 逻辑名称  
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
     * 判断 逻辑名称 是否指定值，包括空值
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
     * 重置 逻辑名称
     */
    @JsonIgnore
    public void resetLogicName(){
        this.reset(FIELD_LOGICNAME);
    }

    /**
     * 设置 逻辑名称，详细说明：{@link #FIELD_LOGICNAME}
     * <P>
     * 等同 {@link #setLogicName}
     * @param logicName
     */
    @JsonIgnore
    public PSSysDBTable logicname(String logicName){
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
    public PSSysDBTable memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSSYSDBSCHEMEID</B>&nbsp;数据库体系，指定数据表所在的数据库体系
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDBScheme} 
     */
    public final static String FIELD_PSSYSDBSCHEMEID = "pssysdbschemeid";

    /**
     * 设置 数据库体系，详细说明：{@link #FIELD_PSSYSDBSCHEMEID}
     * 
     * @param pSSysDBSchemeId
     * 
     */
    @JsonProperty(FIELD_PSSYSDBSCHEMEID)
    public void setPSSysDBSchemeId(String pSSysDBSchemeId){
        this.set(FIELD_PSSYSDBSCHEMEID, pSSysDBSchemeId);
    }
    
    /**
     * 获取 数据库体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysDBSchemeId(){
        Object objValue = this.get(FIELD_PSSYSDBSCHEMEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据库体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDBSchemeIdDirty(){
        if(this.contains(FIELD_PSSYSDBSCHEMEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据库体系
     */
    @JsonIgnore
    public void resetPSSysDBSchemeId(){
        this.reset(FIELD_PSSYSDBSCHEMEID);
    }

    /**
     * 设置 数据库体系，详细说明：{@link #FIELD_PSSYSDBSCHEMEID}
     * <P>
     * 等同 {@link #setPSSysDBSchemeId}
     * @param pSSysDBSchemeId
     */
    @JsonIgnore
    public PSSysDBTable pssysdbschemeid(String pSSysDBSchemeId){
        this.setPSSysDBSchemeId(pSSysDBSchemeId);
        return this;
    }

    /**
     * 设置 数据库体系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDBSchemeId}
     * @param pSSysDBScheme 引用对象
     */
    @JsonIgnore
    public PSSysDBTable pssysdbschemeid(PSSysDBScheme pSSysDBScheme){
        if(pSSysDBScheme == null){
            this.setDSLink(null);
            this.setPSSysDBSchemeId(null);
            this.setPSSysDBSchemeName(null);
        }
        else{
            this.setDSLink(pSSysDBScheme.getDSLink());
            this.setPSSysDBSchemeId(pSSysDBScheme.getPSSysDBSchemeId());
            this.setPSSysDBSchemeName(pSSysDBScheme.getPSSysDBSchemeName());
        }
        return this;
    }

    /**
     * <B>PSSYSDBSCHEMENAME</B>&nbsp;数据库体系，指定数据表所在的数据库体系
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDBSCHEMEID}
     */
    public final static String FIELD_PSSYSDBSCHEMENAME = "pssysdbschemename";

    /**
     * 设置 数据库体系，详细说明：{@link #FIELD_PSSYSDBSCHEMENAME}
     * 
     * @param pSSysDBSchemeName
     * 
     */
    @JsonProperty(FIELD_PSSYSDBSCHEMENAME)
    public void setPSSysDBSchemeName(String pSSysDBSchemeName){
        this.set(FIELD_PSSYSDBSCHEMENAME, pSSysDBSchemeName);
    }
    
    /**
     * 获取 数据库体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysDBSchemeName(){
        Object objValue = this.get(FIELD_PSSYSDBSCHEMENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据库体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDBSchemeNameDirty(){
        if(this.contains(FIELD_PSSYSDBSCHEMENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据库体系
     */
    @JsonIgnore
    public void resetPSSysDBSchemeName(){
        this.reset(FIELD_PSSYSDBSCHEMENAME);
    }

    /**
     * 设置 数据库体系，详细说明：{@link #FIELD_PSSYSDBSCHEMENAME}
     * <P>
     * 等同 {@link #setPSSysDBSchemeName}
     * @param pSSysDBSchemeName
     */
    @JsonIgnore
    public PSSysDBTable pssysdbschemename(String pSSysDBSchemeName){
        this.setPSSysDBSchemeName(pSSysDBSchemeName);
        return this;
    }

    /**
     * <B>PSSYSDBTABLEID</B>&nbsp;系统数据库表标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSDBTABLEID = "pssysdbtableid";

    /**
     * 设置 系统数据库表标识
     * 
     * @param pSSysDBTableId
     * 
     */
    @JsonProperty(FIELD_PSSYSDBTABLEID)
    public void setPSSysDBTableId(String pSSysDBTableId){
        this.set(FIELD_PSSYSDBTABLEID, pSSysDBTableId);
    }
    
    /**
     * 获取 系统数据库表标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysDBTableId(){
        Object objValue = this.get(FIELD_PSSYSDBTABLEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统数据库表标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDBTableIdDirty(){
        if(this.contains(FIELD_PSSYSDBTABLEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统数据库表标识
     */
    @JsonIgnore
    public void resetPSSysDBTableId(){
        this.reset(FIELD_PSSYSDBTABLEID);
    }

    /**
     * 设置 系统数据库表标识
     * <P>
     * 等同 {@link #setPSSysDBTableId}
     * @param pSSysDBTableId
     */
    @JsonIgnore
    public PSSysDBTable pssysdbtableid(String pSSysDBTableId){
        this.setPSSysDBTableId(pSSysDBTableId);
        return this;
    }

    /**
     * <B>PSSYSDBTABLENAME</B>&nbsp;对象名称，指定数据表的对象名称，需在所在数据库体系具备唯一性
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSDBTABLENAME = "pssysdbtablename";

    /**
     * 设置 对象名称，详细说明：{@link #FIELD_PSSYSDBTABLENAME}
     * 
     * @param pSSysDBTableName
     * 
     */
    @JsonProperty(FIELD_PSSYSDBTABLENAME)
    public void setPSSysDBTableName(String pSSysDBTableName){
        this.set(FIELD_PSSYSDBTABLENAME, pSSysDBTableName);
    }
    
    /**
     * 获取 对象名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysDBTableName(){
        Object objValue = this.get(FIELD_PSSYSDBTABLENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 对象名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDBTableNameDirty(){
        if(this.contains(FIELD_PSSYSDBTABLENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 对象名称
     */
    @JsonIgnore
    public void resetPSSysDBTableName(){
        this.reset(FIELD_PSSYSDBTABLENAME);
    }

    /**
     * 设置 对象名称，详细说明：{@link #FIELD_PSSYSDBTABLENAME}
     * <P>
     * 等同 {@link #setPSSysDBTableName}
     * @param pSSysDBTableName
     */
    @JsonIgnore
    public PSSysDBTable pssysdbtablename(String pSSysDBTableName){
        this.setPSSysDBTableName(pSSysDBTableName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysDBTableName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysDBTableName(strName);
    }

    @JsonIgnore
    public PSSysDBTable name(String strName){
        this.setPSSysDBTableName(strName);
        return this;
    }

    /**
     * <B>TABDESC</B>&nbsp;表描述，指定数据表的描述
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_TABDESC = "tabdesc";

    /**
     * 设置 表描述，详细说明：{@link #FIELD_TABDESC}
     * 
     * @param tabDesc
     * 
     */
    @JsonProperty(FIELD_TABDESC)
    public void setTabDesc(String tabDesc){
        this.set(FIELD_TABDESC, tabDesc);
    }
    
    /**
     * 获取 表描述  
     * @return
     */
    @JsonIgnore
    public String getTabDesc(){
        Object objValue = this.get(FIELD_TABDESC);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表描述 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTabDescDirty(){
        if(this.contains(FIELD_TABDESC)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表描述
     */
    @JsonIgnore
    public void resetTabDesc(){
        this.reset(FIELD_TABDESC);
    }

    /**
     * 设置 表描述，详细说明：{@link #FIELD_TABDESC}
     * <P>
     * 等同 {@link #setTabDesc}
     * @param tabDesc
     */
    @JsonIgnore
    public PSSysDBTable tabdesc(String tabDesc){
        this.setTabDesc(tabDesc);
        return this;
    }

    /**
     * <B>TABLETAG</B>&nbsp;数据表标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_TABLETAG = "tabletag";

    /**
     * 设置 数据表标记
     * 
     * @param tableTag
     * 
     */
    @JsonProperty(FIELD_TABLETAG)
    public void setTableTag(String tableTag){
        this.set(FIELD_TABLETAG, tableTag);
    }
    
    /**
     * 获取 数据表标记  
     * @return
     */
    @JsonIgnore
    public String getTableTag(){
        Object objValue = this.get(FIELD_TABLETAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据表标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTableTagDirty(){
        if(this.contains(FIELD_TABLETAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据表标记
     */
    @JsonIgnore
    public void resetTableTag(){
        this.reset(FIELD_TABLETAG);
    }

    /**
     * 设置 数据表标记
     * <P>
     * 等同 {@link #setTableTag}
     * @param tableTag
     */
    @JsonIgnore
    public PSSysDBTable tabletag(String tableTag){
        this.setTableTag(tableTag);
        return this;
    }

    /**
     * <B>TABLETAG2</B>&nbsp;数据表标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_TABLETAG2 = "tabletag2";

    /**
     * 设置 数据表标记2
     * 
     * @param tableTag2
     * 
     */
    @JsonProperty(FIELD_TABLETAG2)
    public void setTableTag2(String tableTag2){
        this.set(FIELD_TABLETAG2, tableTag2);
    }
    
    /**
     * 获取 数据表标记2  
     * @return
     */
    @JsonIgnore
    public String getTableTag2(){
        Object objValue = this.get(FIELD_TABLETAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据表标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTableTag2Dirty(){
        if(this.contains(FIELD_TABLETAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据表标记2
     */
    @JsonIgnore
    public void resetTableTag2(){
        this.reset(FIELD_TABLETAG2);
    }

    /**
     * 设置 数据表标记2
     * <P>
     * 等同 {@link #setTableTag2}
     * @param tableTag2
     */
    @JsonIgnore
    public PSSysDBTable tabletag2(String tableTag2){
        this.setTableTag2(tableTag2);
        return this;
    }

    /**
     * <B>TABLETYPE</B>&nbsp;对象类型，指定数据表的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DBTableType} 
     */
    public final static String FIELD_TABLETYPE = "tabletype";

    /**
     * 设置 对象类型，详细说明：{@link #FIELD_TABLETYPE}
     * 
     * @param tableType
     * 
     */
    @JsonProperty(FIELD_TABLETYPE)
    public void setTableType(String tableType){
        this.set(FIELD_TABLETYPE, tableType);
    }
    
    /**
     * 获取 对象类型  
     * @return
     */
    @JsonIgnore
    public String getTableType(){
        Object objValue = this.get(FIELD_TABLETYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 对象类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTableTypeDirty(){
        if(this.contains(FIELD_TABLETYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 对象类型
     */
    @JsonIgnore
    public void resetTableType(){
        this.reset(FIELD_TABLETYPE);
    }

    /**
     * 设置 对象类型，详细说明：{@link #FIELD_TABLETYPE}
     * <P>
     * 等同 {@link #setTableType}
     * @param tableType
     */
    @JsonIgnore
    public PSSysDBTable tabletype(String tableType){
        this.setTableType(tableType);
        return this;
    }

     /**
     * 设置 对象类型，详细说明：{@link #FIELD_TABLETYPE}
     * <P>
     * 等同 {@link #setTableType}
     * @param tableType
     */
    @JsonIgnore
    public PSSysDBTable tabletype(net.ibizsys.psmodel.core.util.PSModelEnums.DBTableType tableType){
        if(tableType == null){
            this.setTableType(null);
        }
        else{
            this.setTableType(tableType.value);
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
    public PSSysDBTable updatedate(String updateDate){
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
    public PSSysDBTable updateman(String updateMan){
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
    public PSSysDBTable usercat(String userCat){
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
    public PSSysDBTable usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysDBTable usertag(String userTag){
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
    public PSSysDBTable usertag2(String userTag2){
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
    public PSSysDBTable usertag3(String userTag3){
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
    public PSSysDBTable usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysDBTableId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysDBTableId(strValue);
    }

    @JsonIgnore
    public PSSysDBTable id(String strValue){
        this.setPSSysDBTableId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysDBTable){
            PSSysDBTable model = (PSSysDBTable)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
