package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSDEDBCFG</B>实体数据库配置 模型传输对象
 * <P>
 * 实体的数据库配置模型，支持定义实体在具体数据库类型使用对象、发布开关等
 */
public class PSDEDBCfg extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEDBCfg(){
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
    public PSDEDBCfg createdate(String createDate){
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
    public PSDEDBCfg createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>EXTABLENAME</B>&nbsp;用户表
     * <P>
     * 字符串：最大长度 40，由字母、数字、下划线及点号组成，且开始必须字母
     */
    public final static String FIELD_EXTABLENAME = "extablename";

    /**
     * 设置 用户表
     * 
     * @param exTableName
     * 
     */
    @JsonProperty(FIELD_EXTABLENAME)
    public void setExTableName(String exTableName){
        this.set(FIELD_EXTABLENAME, exTableName);
    }
    
    /**
     * 获取 用户表  
     * @return
     */
    @JsonIgnore
    public String getExTableName(){
        Object objValue = this.get(FIELD_EXTABLENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExTableNameDirty(){
        if(this.contains(FIELD_EXTABLENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户表
     */
    @JsonIgnore
    public void resetExTableName(){
        this.reset(FIELD_EXTABLENAME);
    }

    /**
     * 设置 用户表
     * <P>
     * 等同 {@link #setExTableName}
     * @param exTableName
     */
    @JsonIgnore
    public PSDEDBCfg extablename(String exTableName){
        this.setExTableName(exTableName);
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
    public PSDEDBCfg memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>OBJNAMECASE</B>&nbsp;对象名称转换，指定数据库对象名称的转换处理模式，未定义使用系统数据库配置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DBObjNameCaseMode} 
     */
    public final static String FIELD_OBJNAMECASE = "objnamecase";

    /**
     * 设置 对象名称转换，详细说明：{@link #FIELD_OBJNAMECASE}
     * 
     * @param objNameCase
     * 
     */
    @JsonProperty(FIELD_OBJNAMECASE)
    public void setObjNameCase(String objNameCase){
        this.set(FIELD_OBJNAMECASE, objNameCase);
    }
    
    /**
     * 获取 对象名称转换  
     * @return
     */
    @JsonIgnore
    public String getObjNameCase(){
        Object objValue = this.get(FIELD_OBJNAMECASE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 对象名称转换 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isObjNameCaseDirty(){
        if(this.contains(FIELD_OBJNAMECASE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 对象名称转换
     */
    @JsonIgnore
    public void resetObjNameCase(){
        this.reset(FIELD_OBJNAMECASE);
    }

    /**
     * 设置 对象名称转换，详细说明：{@link #FIELD_OBJNAMECASE}
     * <P>
     * 等同 {@link #setObjNameCase}
     * @param objNameCase
     */
    @JsonIgnore
    public PSDEDBCfg objnamecase(String objNameCase){
        this.setObjNameCase(objNameCase);
        return this;
    }

     /**
     * 设置 对象名称转换，详细说明：{@link #FIELD_OBJNAMECASE}
     * <P>
     * 等同 {@link #setObjNameCase}
     * @param objNameCase
     */
    @JsonIgnore
    public PSDEDBCfg objnamecase(net.ibizsys.psmodel.core.util.PSModelEnums.DBObjNameCaseMode objNameCase){
        if(objNameCase == null){
            this.setObjNameCase(null);
        }
        else{
            this.setObjNameCase(objNameCase.value);
        }
        return this;
    }

    /**
     * <B>PSDEDBCFGID</B>&nbsp;实体数据库配置标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEDBCFGID = "psdedbcfgid";

    /**
     * 设置 实体数据库配置标识
     * 
     * @param pSDEDBCfgId
     * 
     */
    @JsonProperty(FIELD_PSDEDBCFGID)
    public void setPSDEDBCfgId(String pSDEDBCfgId){
        this.set(FIELD_PSDEDBCFGID, pSDEDBCfgId);
    }
    
    /**
     * 获取 实体数据库配置标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEDBCfgId(){
        Object objValue = this.get(FIELD_PSDEDBCFGID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据库配置标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDBCfgIdDirty(){
        if(this.contains(FIELD_PSDEDBCFGID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据库配置标识
     */
    @JsonIgnore
    public void resetPSDEDBCfgId(){
        this.reset(FIELD_PSDEDBCFGID);
    }

    /**
     * 设置 实体数据库配置标识
     * <P>
     * 等同 {@link #setPSDEDBCfgId}
     * @param pSDEDBCfgId
     */
    @JsonIgnore
    public PSDEDBCfg psdedbcfgid(String pSDEDBCfgId){
        this.setPSDEDBCfgId(pSDEDBCfgId);
        return this;
    }

    /**
     * <B>PSDEDBCFGNAME</B>&nbsp;数据库类型
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEDBCFGNAME = "psdedbcfgname";

    /**
     * 设置 数据库类型
     * 
     * @param pSDEDBCfgName
     * 
     */
    @JsonProperty(FIELD_PSDEDBCFGNAME)
    public void setPSDEDBCfgName(String pSDEDBCfgName){
        this.set(FIELD_PSDEDBCFGNAME, pSDEDBCfgName);
    }
    
    /**
     * 获取 数据库类型  
     * @return
     */
    @JsonIgnore
    public String getPSDEDBCfgName(){
        Object objValue = this.get(FIELD_PSDEDBCFGNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据库类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDBCfgNameDirty(){
        if(this.contains(FIELD_PSDEDBCFGNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据库类型
     */
    @JsonIgnore
    public void resetPSDEDBCfgName(){
        this.reset(FIELD_PSDEDBCFGNAME);
    }

    /**
     * 设置 数据库类型
     * <P>
     * 等同 {@link #setPSDEDBCfgName}
     * @param pSDEDBCfgName
     */
    @JsonIgnore
    public PSDEDBCfg psdedbcfgname(String pSDEDBCfgName){
        this.setPSDEDBCfgName(pSDEDBCfgName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEDBCfgName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEDBCfgName(strName);
    }

    @JsonIgnore
    public PSDEDBCfg name(String strName){
        this.setPSDEDBCfgName(strName);
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
    public PSDEDBCfg psdeid(String pSDEId){
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
    public PSDEDBCfg psdeid(PSDataEntity pSDataEntity){
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
    public PSDEDBCfg psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PUBMODEL</B>&nbsp;发布模型，指定是否发布当前数据库类型的数据库模型，未指定时使用系统数据库配置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_PUBMODEL = "pubmodel";

    /**
     * 设置 发布模型，详细说明：{@link #FIELD_PUBMODEL}
     * 
     * @param pubModel
     * 
     */
    @JsonProperty(FIELD_PUBMODEL)
    public void setPubModel(Integer pubModel){
        this.set(FIELD_PUBMODEL, pubModel);
    }
    
    /**
     * 获取 发布模型  
     * @return
     */
    @JsonIgnore
    public Integer getPubModel(){
        Object objValue = this.get(FIELD_PUBMODEL);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 发布模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPubModelDirty(){
        if(this.contains(FIELD_PUBMODEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 发布模型
     */
    @JsonIgnore
    public void resetPubModel(){
        this.reset(FIELD_PUBMODEL);
    }

    /**
     * 设置 发布模型，详细说明：{@link #FIELD_PUBMODEL}
     * <P>
     * 等同 {@link #setPubModel}
     * @param pubModel
     */
    @JsonIgnore
    public PSDEDBCfg pubmodel(Integer pubModel){
        this.setPubModel(pubModel);
        return this;
    }

     /**
     * 设置 发布模型，详细说明：{@link #FIELD_PUBMODEL}
     * <P>
     * 等同 {@link #setPubModel}
     * @param pubModel
     */
    @JsonIgnore
    public PSDEDBCfg pubmodel(Boolean pubModel){
        if(pubModel == null){
            this.setPubModel(null);
        }
        else{
            this.setPubModel(pubModel?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>TABLENAME</B>&nbsp;主表名称，指定实体在当前数据库类型的使用的数据表，未指定时使用实体配置的数据表
     * <P>
     * 字符串：最大长度 40，由字母、数字、下划线及点号组成，且开始必须字母
     */
    public final static String FIELD_TABLENAME = "tablename";

    /**
     * 设置 主表名称，详细说明：{@link #FIELD_TABLENAME}
     * 
     * @param tableName
     * 
     */
    @JsonProperty(FIELD_TABLENAME)
    public void setTableName(String tableName){
        this.set(FIELD_TABLENAME, tableName);
    }
    
    /**
     * 获取 主表名称  
     * @return
     */
    @JsonIgnore
    public String getTableName(){
        Object objValue = this.get(FIELD_TABLENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主表名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTableNameDirty(){
        if(this.contains(FIELD_TABLENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主表名称
     */
    @JsonIgnore
    public void resetTableName(){
        this.reset(FIELD_TABLENAME);
    }

    /**
     * 设置 主表名称，详细说明：{@link #FIELD_TABLENAME}
     * <P>
     * 等同 {@link #setTableName}
     * @param tableName
     */
    @JsonIgnore
    public PSDEDBCfg tablename(String tableName){
        this.setTableName(tableName);
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
    public PSDEDBCfg updatedate(String updateDate){
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
    public PSDEDBCfg updateman(String updateMan){
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
    public PSDEDBCfg usercat(String userCat){
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
    public PSDEDBCfg usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDEDBCfg userparams(String userParams){
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
    public PSDEDBCfg usertag(String userTag){
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
    public PSDEDBCfg usertag2(String userTag2){
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
    public PSDEDBCfg usertag3(String userTag3){
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
    public PSDEDBCfg usertag4(String userTag4){
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
    public PSDEDBCfg validflag(Integer validFlag){
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
    public PSDEDBCfg validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>VIEWNAME</B>&nbsp;视图名称，指定实体在当前数据库类型的使用的数据视图，未指定时使用实体配置的数据视图
     * <P>
     * 字符串：最大长度 40，由字母、数字、下划线及点号组成，且开始必须字母
     */
    public final static String FIELD_VIEWNAME = "viewname";

    /**
     * 设置 视图名称，详细说明：{@link #FIELD_VIEWNAME}
     * 
     * @param viewName
     * 
     */
    @JsonProperty(FIELD_VIEWNAME)
    public void setViewName(String viewName){
        this.set(FIELD_VIEWNAME, viewName);
    }
    
    /**
     * 获取 视图名称  
     * @return
     */
    @JsonIgnore
    public String getViewName(){
        Object objValue = this.get(FIELD_VIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewNameDirty(){
        if(this.contains(FIELD_VIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图名称
     */
    @JsonIgnore
    public void resetViewName(){
        this.reset(FIELD_VIEWNAME);
    }

    /**
     * 设置 视图名称，详细说明：{@link #FIELD_VIEWNAME}
     * <P>
     * 等同 {@link #setViewName}
     * @param viewName
     */
    @JsonIgnore
    public PSDEDBCfg viewname(String viewName){
        this.setViewName(viewName);
        return this;
    }

    /**
     * <B>VIEWNAME2</B>&nbsp;级别2视图名称
     * <P>
     * 字符串：最大长度 40，由字母、数字、下划线及点号组成，且开始必须字母
     */
    public final static String FIELD_VIEWNAME2 = "viewname2";

    /**
     * 设置 级别2视图名称
     * 
     * @param viewName2
     * 
     */
    @JsonProperty(FIELD_VIEWNAME2)
    public void setViewName2(String viewName2){
        this.set(FIELD_VIEWNAME2, viewName2);
    }
    
    /**
     * 获取 级别2视图名称  
     * @return
     */
    @JsonIgnore
    public String getViewName2(){
        Object objValue = this.get(FIELD_VIEWNAME2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 级别2视图名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewName2Dirty(){
        if(this.contains(FIELD_VIEWNAME2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 级别2视图名称
     */
    @JsonIgnore
    public void resetViewName2(){
        this.reset(FIELD_VIEWNAME2);
    }

    /**
     * 设置 级别2视图名称
     * <P>
     * 等同 {@link #setViewName2}
     * @param viewName2
     */
    @JsonIgnore
    public PSDEDBCfg viewname2(String viewName2){
        this.setViewName2(viewName2);
        return this;
    }

    /**
     * <B>VIEWNAME3</B>&nbsp;级别3视图名称
     * <P>
     * 字符串：最大长度 40，由字母、数字、下划线及点号组成，且开始必须字母
     */
    public final static String FIELD_VIEWNAME3 = "viewname3";

    /**
     * 设置 级别3视图名称
     * 
     * @param viewName3
     * 
     */
    @JsonProperty(FIELD_VIEWNAME3)
    public void setViewName3(String viewName3){
        this.set(FIELD_VIEWNAME3, viewName3);
    }
    
    /**
     * 获取 级别3视图名称  
     * @return
     */
    @JsonIgnore
    public String getViewName3(){
        Object objValue = this.get(FIELD_VIEWNAME3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 级别3视图名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewName3Dirty(){
        if(this.contains(FIELD_VIEWNAME3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 级别3视图名称
     */
    @JsonIgnore
    public void resetViewName3(){
        this.reset(FIELD_VIEWNAME3);
    }

    /**
     * 设置 级别3视图名称
     * <P>
     * 等同 {@link #setViewName3}
     * @param viewName3
     */
    @JsonIgnore
    public PSDEDBCfg viewname3(String viewName3){
        this.setViewName3(viewName3);
        return this;
    }

    /**
     * <B>VIEWNAME4</B>&nbsp;级别4视图名称
     * <P>
     * 字符串：最大长度 40，由字母、数字、下划线及点号组成，且开始必须字母
     */
    public final static String FIELD_VIEWNAME4 = "viewname4";

    /**
     * 设置 级别4视图名称
     * 
     * @param viewName4
     * 
     */
    @JsonProperty(FIELD_VIEWNAME4)
    public void setViewName4(String viewName4){
        this.set(FIELD_VIEWNAME4, viewName4);
    }
    
    /**
     * 获取 级别4视图名称  
     * @return
     */
    @JsonIgnore
    public String getViewName4(){
        Object objValue = this.get(FIELD_VIEWNAME4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 级别4视图名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewName4Dirty(){
        if(this.contains(FIELD_VIEWNAME4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 级别4视图名称
     */
    @JsonIgnore
    public void resetViewName4(){
        this.reset(FIELD_VIEWNAME4);
    }

    /**
     * 设置 级别4视图名称
     * <P>
     * 等同 {@link #setViewName4}
     * @param viewName4
     */
    @JsonIgnore
    public PSDEDBCfg viewname4(String viewName4){
        this.setViewName4(viewName4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEDBCfgId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEDBCfgId(strValue);
    }

    @JsonIgnore
    public PSDEDBCfg id(String strValue){
        this.setPSDEDBCfgId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEDBCfg){
            PSDEDBCfg model = (PSDEDBCfg)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
