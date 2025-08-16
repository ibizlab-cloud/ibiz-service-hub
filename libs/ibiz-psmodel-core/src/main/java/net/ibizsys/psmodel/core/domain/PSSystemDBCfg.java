package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSSYSTEMDBCFG</B>系统数据库 模型传输对象
 * <P>
 * 系统的关系数据库配置模型，定义指定数据库类型的默认配置参数，包括是否发布外键、视图等
 */
public class PSSystemDBCfg extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSystemDBCfg(){
    }      

    /**
     * <B>APPENDSCHEMA</B>&nbsp;附加模式名称，指定发布的数据库模型是否附加模式名称，默认为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_APPENDSCHEMA = "appendschema";

    /**
     * 设置 附加模式名称，详细说明：{@link #FIELD_APPENDSCHEMA}
     * 
     * @param appendSchema
     * 
     */
    @JsonProperty(FIELD_APPENDSCHEMA)
    public void setAppendSchema(Integer appendSchema){
        this.set(FIELD_APPENDSCHEMA, appendSchema);
    }
    
    /**
     * 获取 附加模式名称  
     * @return
     */
    @JsonIgnore
    public Integer getAppendSchema(){
        Object objValue = this.get(FIELD_APPENDSCHEMA);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 附加模式名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAppendSchemaDirty(){
        if(this.contains(FIELD_APPENDSCHEMA)){
            return true;
        }
        return false;
    }

    /**
     * 重置 附加模式名称
     */
    @JsonIgnore
    public void resetAppendSchema(){
        this.reset(FIELD_APPENDSCHEMA);
    }

    /**
     * 设置 附加模式名称，详细说明：{@link #FIELD_APPENDSCHEMA}
     * <P>
     * 等同 {@link #setAppendSchema}
     * @param appendSchema
     */
    @JsonIgnore
    public PSSystemDBCfg appendschema(Integer appendSchema){
        this.setAppendSchema(appendSchema);
        return this;
    }

     /**
     * 设置 附加模式名称，详细说明：{@link #FIELD_APPENDSCHEMA}
     * <P>
     * 等同 {@link #setAppendSchema}
     * @param appendSchema
     */
    @JsonIgnore
    public PSSystemDBCfg appendschema(Boolean appendSchema){
        if(appendSchema == null){
            this.setAppendSchema(null);
        }
        else{
            this.setAppendSchema(appendSchema?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
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
    public PSSystemDBCfg createdate(String createDate){
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
    public PSSystemDBCfg createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DBSCHEMANAME</B>&nbsp;数据库模式名称，指定数据库的模式名称
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_DBSCHEMANAME = "dbschemaname";

    /**
     * 设置 数据库模式名称，详细说明：{@link #FIELD_DBSCHEMANAME}
     * 
     * @param dBSchemaName
     * 
     */
    @JsonProperty(FIELD_DBSCHEMANAME)
    public void setDBSchemaName(String dBSchemaName){
        this.set(FIELD_DBSCHEMANAME, dBSchemaName);
    }
    
    /**
     * 获取 数据库模式名称  
     * @return
     */
    @JsonIgnore
    public String getDBSchemaName(){
        Object objValue = this.get(FIELD_DBSCHEMANAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据库模式名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDBSchemaNameDirty(){
        if(this.contains(FIELD_DBSCHEMANAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据库模式名称
     */
    @JsonIgnore
    public void resetDBSchemaName(){
        this.reset(FIELD_DBSCHEMANAME);
    }

    /**
     * 设置 数据库模式名称，详细说明：{@link #FIELD_DBSCHEMANAME}
     * <P>
     * 等同 {@link #setDBSchemaName}
     * @param dBSchemaName
     */
    @JsonIgnore
    public PSSystemDBCfg dbschemaname(String dBSchemaName){
        this.setDBSchemaName(dBSchemaName);
        return this;
    }

    /**
     * <B>DEFAULTFLAG</B>&nbsp;默认数据源，指定数据源是否为当前系统的默认数据源，默认为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEFAULTFLAG = "defaultflag";

    /**
     * 设置 默认数据源，详细说明：{@link #FIELD_DEFAULTFLAG}
     * 
     * @param defaultFlag
     * 
     */
    @JsonProperty(FIELD_DEFAULTFLAG)
    public void setDefaultFlag(Integer defaultFlag){
        this.set(FIELD_DEFAULTFLAG, defaultFlag);
    }
    
    /**
     * 获取 默认数据源  
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
     * 判断 默认数据源 是否指定值，包括空值
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
     * 重置 默认数据源
     */
    @JsonIgnore
    public void resetDefaultFlag(){
        this.reset(FIELD_DEFAULTFLAG);
    }

    /**
     * 设置 默认数据源，详细说明：{@link #FIELD_DEFAULTFLAG}
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSSystemDBCfg defaultflag(Integer defaultFlag){
        this.setDefaultFlag(defaultFlag);
        return this;
    }

     /**
     * 设置 默认数据源，详细说明：{@link #FIELD_DEFAULTFLAG}
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSSystemDBCfg defaultflag(Boolean defaultFlag){
        if(defaultFlag == null){
            this.setDefaultFlag(null);
        }
        else{
            this.setDefaultFlag(defaultFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSSystemDBCfg memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>NO2PSDBDEVINSTID</B>&nbsp;云平台数据库实例2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_NO2PSDBDEVINSTID = "no2psdbdevinstid";

    /**
     * 设置 云平台数据库实例2
     * 
     * @param no2PSDBDevInstId
     * 
     */
    @JsonProperty(FIELD_NO2PSDBDEVINSTID)
    public void setNo2PSDBDevInstId(String no2PSDBDevInstId){
        this.set(FIELD_NO2PSDBDEVINSTID, no2PSDBDevInstId);
    }
    
    /**
     * 获取 云平台数据库实例2  
     * @return
     */
    @JsonIgnore
    public String getNo2PSDBDevInstId(){
        Object objValue = this.get(FIELD_NO2PSDBDEVINSTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 云平台数据库实例2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo2PSDBDevInstIdDirty(){
        if(this.contains(FIELD_NO2PSDBDEVINSTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 云平台数据库实例2
     */
    @JsonIgnore
    public void resetNo2PSDBDevInstId(){
        this.reset(FIELD_NO2PSDBDEVINSTID);
    }

    /**
     * 设置 云平台数据库实例2
     * <P>
     * 等同 {@link #setNo2PSDBDevInstId}
     * @param no2PSDBDevInstId
     */
    @JsonIgnore
    public PSSystemDBCfg no2psdbdevinstid(String no2PSDBDevInstId){
        this.setNo2PSDBDevInstId(no2PSDBDevInstId);
        return this;
    }

    /**
     * <B>NO2PSDBDEVINSTNAME</B>&nbsp;云平台数据库实例2
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NO2PSDBDEVINSTID}
     */
    public final static String FIELD_NO2PSDBDEVINSTNAME = "no2psdbdevinstname";

    /**
     * 设置 云平台数据库实例2
     * 
     * @param no2PSDBDevInstName
     * 
     */
    @JsonProperty(FIELD_NO2PSDBDEVINSTNAME)
    public void setNo2PSDBDevInstName(String no2PSDBDevInstName){
        this.set(FIELD_NO2PSDBDEVINSTNAME, no2PSDBDevInstName);
    }
    
    /**
     * 获取 云平台数据库实例2  
     * @return
     */
    @JsonIgnore
    public String getNo2PSDBDevInstName(){
        Object objValue = this.get(FIELD_NO2PSDBDEVINSTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 云平台数据库实例2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo2PSDBDevInstNameDirty(){
        if(this.contains(FIELD_NO2PSDBDEVINSTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 云平台数据库实例2
     */
    @JsonIgnore
    public void resetNo2PSDBDevInstName(){
        this.reset(FIELD_NO2PSDBDEVINSTNAME);
    }

    /**
     * 设置 云平台数据库实例2
     * <P>
     * 等同 {@link #setNo2PSDBDevInstName}
     * @param no2PSDBDevInstName
     */
    @JsonIgnore
    public PSSystemDBCfg no2psdbdevinstname(String no2PSDBDevInstName){
        this.setNo2PSDBDevInstName(no2PSDBDevInstName);
        return this;
    }

    /**
     * <B>NO2PSDCDBINSTID</B>&nbsp;应用中心数据库实例2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_NO2PSDCDBINSTID = "no2psdcdbinstid";

    /**
     * 设置 应用中心数据库实例2
     * 
     * @param no2PSDCDBInstId
     * 
     */
    @JsonProperty(FIELD_NO2PSDCDBINSTID)
    public void setNo2PSDCDBInstId(String no2PSDCDBInstId){
        this.set(FIELD_NO2PSDCDBINSTID, no2PSDCDBInstId);
    }
    
    /**
     * 获取 应用中心数据库实例2  
     * @return
     */
    @JsonIgnore
    public String getNo2PSDCDBInstId(){
        Object objValue = this.get(FIELD_NO2PSDCDBINSTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用中心数据库实例2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo2PSDCDBInstIdDirty(){
        if(this.contains(FIELD_NO2PSDCDBINSTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用中心数据库实例2
     */
    @JsonIgnore
    public void resetNo2PSDCDBInstId(){
        this.reset(FIELD_NO2PSDCDBINSTID);
    }

    /**
     * 设置 应用中心数据库实例2
     * <P>
     * 等同 {@link #setNo2PSDCDBInstId}
     * @param no2PSDCDBInstId
     */
    @JsonIgnore
    public PSSystemDBCfg no2psdcdbinstid(String no2PSDCDBInstId){
        this.setNo2PSDCDBInstId(no2PSDCDBInstId);
        return this;
    }

    /**
     * <B>NO2PSDCDBINSTNAME</B>&nbsp;应用中心数据库实例2
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NO2PSDCDBINSTID}
     */
    public final static String FIELD_NO2PSDCDBINSTNAME = "no2psdcdbinstname";

    /**
     * 设置 应用中心数据库实例2
     * 
     * @param no2PSDCDBInstName
     * 
     */
    @JsonProperty(FIELD_NO2PSDCDBINSTNAME)
    public void setNo2PSDCDBInstName(String no2PSDCDBInstName){
        this.set(FIELD_NO2PSDCDBINSTNAME, no2PSDCDBInstName);
    }
    
    /**
     * 获取 应用中心数据库实例2  
     * @return
     */
    @JsonIgnore
    public String getNo2PSDCDBInstName(){
        Object objValue = this.get(FIELD_NO2PSDCDBINSTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用中心数据库实例2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo2PSDCDBInstNameDirty(){
        if(this.contains(FIELD_NO2PSDCDBINSTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用中心数据库实例2
     */
    @JsonIgnore
    public void resetNo2PSDCDBInstName(){
        this.reset(FIELD_NO2PSDCDBINSTNAME);
    }

    /**
     * 设置 应用中心数据库实例2
     * <P>
     * 等同 {@link #setNo2PSDCDBInstName}
     * @param no2PSDCDBInstName
     */
    @JsonIgnore
    public PSSystemDBCfg no2psdcdbinstname(String no2PSDCDBInstName){
        this.setNo2PSDCDBInstName(no2PSDCDBInstName);
        return this;
    }

    /**
     * <B>NULLVALORDER</B>&nbsp;空值排序，指定数据源在数据库排序时处理空值的方式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DBNullValueOrderMode} 
     */
    public final static String FIELD_NULLVALORDER = "nullvalorder";

    /**
     * 设置 空值排序，详细说明：{@link #FIELD_NULLVALORDER}
     * 
     * @param nullValOrder
     * 
     */
    @JsonProperty(FIELD_NULLVALORDER)
    public void setNullValOrder(String nullValOrder){
        this.set(FIELD_NULLVALORDER, nullValOrder);
    }
    
    /**
     * 获取 空值排序  
     * @return
     */
    @JsonIgnore
    public String getNullValOrder(){
        Object objValue = this.get(FIELD_NULLVALORDER);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 空值排序 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNullValOrderDirty(){
        if(this.contains(FIELD_NULLVALORDER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 空值排序
     */
    @JsonIgnore
    public void resetNullValOrder(){
        this.reset(FIELD_NULLVALORDER);
    }

    /**
     * 设置 空值排序，详细说明：{@link #FIELD_NULLVALORDER}
     * <P>
     * 等同 {@link #setNullValOrder}
     * @param nullValOrder
     */
    @JsonIgnore
    public PSSystemDBCfg nullvalorder(String nullValOrder){
        this.setNullValOrder(nullValOrder);
        return this;
    }

     /**
     * 设置 空值排序，详细说明：{@link #FIELD_NULLVALORDER}
     * <P>
     * 等同 {@link #setNullValOrder}
     * @param nullValOrder
     */
    @JsonIgnore
    public PSSystemDBCfg nullvalorder(net.ibizsys.psmodel.core.util.PSModelEnums.DBNullValueOrderMode nullValOrder){
        if(nullValOrder == null){
            this.setNullValOrder(null);
        }
        else{
            this.setNullValOrder(nullValOrder.value);
        }
        return this;
    }

    /**
     * <B>OBJNAMECASE</B>&nbsp;对象名称转换，指定数据库对象名称的转换处理模式，未定义为【默认】
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
    public PSSystemDBCfg objnamecase(String objNameCase){
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
    public PSSystemDBCfg objnamecase(net.ibizsys.psmodel.core.util.PSModelEnums.DBObjNameCaseMode objNameCase){
        if(objNameCase == null){
            this.setObjNameCase(null);
        }
        else{
            this.setObjNameCase(objNameCase.value);
        }
        return this;
    }

    /**
     * <B>PSDBDEVINSTID</B>&nbsp;开发数据库实例
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDBDEVINSTID = "psdbdevinstid";

    /**
     * 设置 开发数据库实例
     * 
     * @param pSDBDevInstId
     * 
     */
    @JsonProperty(FIELD_PSDBDEVINSTID)
    public void setPSDBDevInstId(String pSDBDevInstId){
        this.set(FIELD_PSDBDEVINSTID, pSDBDevInstId);
    }
    
    /**
     * 获取 开发数据库实例  
     * @return
     */
    @JsonIgnore
    public String getPSDBDevInstId(){
        Object objValue = this.get(FIELD_PSDBDEVINSTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发数据库实例 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDBDevInstIdDirty(){
        if(this.contains(FIELD_PSDBDEVINSTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发数据库实例
     */
    @JsonIgnore
    public void resetPSDBDevInstId(){
        this.reset(FIELD_PSDBDEVINSTID);
    }

    /**
     * 设置 开发数据库实例
     * <P>
     * 等同 {@link #setPSDBDevInstId}
     * @param pSDBDevInstId
     */
    @JsonIgnore
    public PSSystemDBCfg psdbdevinstid(String pSDBDevInstId){
        this.setPSDBDevInstId(pSDBDevInstId);
        return this;
    }

    /**
     * <B>PSDBDEVINSTNAME</B>&nbsp;开发数据库实例
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDBDEVINSTID}
     */
    public final static String FIELD_PSDBDEVINSTNAME = "psdbdevinstname";

    /**
     * 设置 开发数据库实例
     * 
     * @param pSDBDevInstName
     * 
     */
    @JsonProperty(FIELD_PSDBDEVINSTNAME)
    public void setPSDBDevInstName(String pSDBDevInstName){
        this.set(FIELD_PSDBDEVINSTNAME, pSDBDevInstName);
    }
    
    /**
     * 获取 开发数据库实例  
     * @return
     */
    @JsonIgnore
    public String getPSDBDevInstName(){
        Object objValue = this.get(FIELD_PSDBDEVINSTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发数据库实例 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDBDevInstNameDirty(){
        if(this.contains(FIELD_PSDBDEVINSTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发数据库实例
     */
    @JsonIgnore
    public void resetPSDBDevInstName(){
        this.reset(FIELD_PSDBDEVINSTNAME);
    }

    /**
     * 设置 开发数据库实例
     * <P>
     * 等同 {@link #setPSDBDevInstName}
     * @param pSDBDevInstName
     */
    @JsonIgnore
    public PSSystemDBCfg psdbdevinstname(String pSDBDevInstName){
        this.setPSDBDevInstName(pSDBDevInstName);
        return this;
    }

    /**
     * <B>PSDEVCENTERDBINSTID</B>&nbsp;数据库实例
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVCENTERDBINSTID = "psdevcenterdbinstid";

    /**
     * 设置 数据库实例
     * 
     * @param pSDevCenterDBInstId
     * 
     */
    @JsonProperty(FIELD_PSDEVCENTERDBINSTID)
    public void setPSDevCenterDBInstId(String pSDevCenterDBInstId){
        this.set(FIELD_PSDEVCENTERDBINSTID, pSDevCenterDBInstId);
    }
    
    /**
     * 获取 数据库实例  
     * @return
     */
    @JsonIgnore
    public String getPSDevCenterDBInstId(){
        Object objValue = this.get(FIELD_PSDEVCENTERDBINSTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据库实例 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevCenterDBInstIdDirty(){
        if(this.contains(FIELD_PSDEVCENTERDBINSTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据库实例
     */
    @JsonIgnore
    public void resetPSDevCenterDBInstId(){
        this.reset(FIELD_PSDEVCENTERDBINSTID);
    }

    /**
     * 设置 数据库实例
     * <P>
     * 等同 {@link #setPSDevCenterDBInstId}
     * @param pSDevCenterDBInstId
     */
    @JsonIgnore
    public PSSystemDBCfg psdevcenterdbinstid(String pSDevCenterDBInstId){
        this.setPSDevCenterDBInstId(pSDevCenterDBInstId);
        return this;
    }

    /**
     * <B>PSDEVCENTERDBINSTNAME</B>&nbsp;数据库实例
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVCENTERDBINSTID}
     */
    public final static String FIELD_PSDEVCENTERDBINSTNAME = "psdevcenterdbinstname";

    /**
     * 设置 数据库实例
     * 
     * @param pSDevCenterDBInstName
     * 
     */
    @JsonProperty(FIELD_PSDEVCENTERDBINSTNAME)
    public void setPSDevCenterDBInstName(String pSDevCenterDBInstName){
        this.set(FIELD_PSDEVCENTERDBINSTNAME, pSDevCenterDBInstName);
    }
    
    /**
     * 获取 数据库实例  
     * @return
     */
    @JsonIgnore
    public String getPSDevCenterDBInstName(){
        Object objValue = this.get(FIELD_PSDEVCENTERDBINSTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据库实例 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevCenterDBInstNameDirty(){
        if(this.contains(FIELD_PSDEVCENTERDBINSTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据库实例
     */
    @JsonIgnore
    public void resetPSDevCenterDBInstName(){
        this.reset(FIELD_PSDEVCENTERDBINSTNAME);
    }

    /**
     * 设置 数据库实例
     * <P>
     * 等同 {@link #setPSDevCenterDBInstName}
     * @param pSDevCenterDBInstName
     */
    @JsonIgnore
    public PSSystemDBCfg psdevcenterdbinstname(String pSDevCenterDBInstName){
        this.setPSDevCenterDBInstName(pSDevCenterDBInstName);
        return this;
    }

    /**
     * <B>PSSYSTEMDBCFGID</B>&nbsp;系统数据库配置标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSTEMDBCFGID = "pssystemdbcfgid";

    /**
     * 设置 系统数据库配置标识
     * 
     * @param pSSystemDBCfgId
     * 
     */
    @JsonProperty(FIELD_PSSYSTEMDBCFGID)
    public void setPSSystemDBCfgId(String pSSystemDBCfgId){
        this.set(FIELD_PSSYSTEMDBCFGID, pSSystemDBCfgId);
    }
    
    /**
     * 获取 系统数据库配置标识  
     * @return
     */
    @JsonIgnore
    public String getPSSystemDBCfgId(){
        Object objValue = this.get(FIELD_PSSYSTEMDBCFGID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统数据库配置标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSystemDBCfgIdDirty(){
        if(this.contains(FIELD_PSSYSTEMDBCFGID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统数据库配置标识
     */
    @JsonIgnore
    public void resetPSSystemDBCfgId(){
        this.reset(FIELD_PSSYSTEMDBCFGID);
    }

    /**
     * 设置 系统数据库配置标识
     * <P>
     * 等同 {@link #setPSSystemDBCfgId}
     * @param pSSystemDBCfgId
     */
    @JsonIgnore
    public PSSystemDBCfg pssystemdbcfgid(String pSSystemDBCfgId){
        this.setPSSystemDBCfgId(pSSystemDBCfgId);
        return this;
    }

    /**
     * <B>PSSYSTEMDBCFGNAME</B>&nbsp;数据库类型，指定系统数据库配置的数据库类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DBType} 
     */
    public final static String FIELD_PSSYSTEMDBCFGNAME = "pssystemdbcfgname";

    /**
     * 设置 数据库类型，详细说明：{@link #FIELD_PSSYSTEMDBCFGNAME}
     * 
     * @param pSSystemDBCfgName
     * 
     */
    @JsonProperty(FIELD_PSSYSTEMDBCFGNAME)
    public void setPSSystemDBCfgName(String pSSystemDBCfgName){
        this.set(FIELD_PSSYSTEMDBCFGNAME, pSSystemDBCfgName);
    }
    
    /**
     * 获取 数据库类型  
     * @return
     */
    @JsonIgnore
    public String getPSSystemDBCfgName(){
        Object objValue = this.get(FIELD_PSSYSTEMDBCFGNAME);
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
    public boolean isPSSystemDBCfgNameDirty(){
        if(this.contains(FIELD_PSSYSTEMDBCFGNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据库类型
     */
    @JsonIgnore
    public void resetPSSystemDBCfgName(){
        this.reset(FIELD_PSSYSTEMDBCFGNAME);
    }

    /**
     * 设置 数据库类型，详细说明：{@link #FIELD_PSSYSTEMDBCFGNAME}
     * <P>
     * 等同 {@link #setPSSystemDBCfgName}
     * @param pSSystemDBCfgName
     */
    @JsonIgnore
    public PSSystemDBCfg pssystemdbcfgname(String pSSystemDBCfgName){
        this.setPSSystemDBCfgName(pSSystemDBCfgName);
        return this;
    }

     /**
     * 设置 数据库类型，详细说明：{@link #FIELD_PSSYSTEMDBCFGNAME}
     * <P>
     * 等同 {@link #setPSSystemDBCfgName}
     * @param pSSystemDBCfgName
     */
    @JsonIgnore
    public PSSystemDBCfg pssystemdbcfgname(net.ibizsys.psmodel.core.util.PSModelEnums.DBType pSSystemDBCfgName){
        if(pSSystemDBCfgName == null){
            this.setPSSystemDBCfgName(null);
        }
        else{
            this.setPSSystemDBCfgName(pSSystemDBCfgName.value);
        }
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSystemDBCfgName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSystemDBCfgName(strName);
    }

    @JsonIgnore
    public PSSystemDBCfg name(String strName){
        this.setPSSystemDBCfgName(strName);
        return this;
    }

    /**
     * <B>PUBCOMMENTFLAG</B>&nbsp;发布模型注释，指定当前数据库类型发布的数据库模型是否包括注释，未指定为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_PUBCOMMENTFLAG = "pubcommentflag";

    /**
     * 设置 发布模型注释，详细说明：{@link #FIELD_PUBCOMMENTFLAG}
     * 
     * @param pubCommentFlag
     * 
     */
    @JsonProperty(FIELD_PUBCOMMENTFLAG)
    public void setPubCommentFlag(Integer pubCommentFlag){
        this.set(FIELD_PUBCOMMENTFLAG, pubCommentFlag);
    }
    
    /**
     * 获取 发布模型注释  
     * @return
     */
    @JsonIgnore
    public Integer getPubCommentFlag(){
        Object objValue = this.get(FIELD_PUBCOMMENTFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 发布模型注释 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPubCommentFlagDirty(){
        if(this.contains(FIELD_PUBCOMMENTFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 发布模型注释
     */
    @JsonIgnore
    public void resetPubCommentFlag(){
        this.reset(FIELD_PUBCOMMENTFLAG);
    }

    /**
     * 设置 发布模型注释，详细说明：{@link #FIELD_PUBCOMMENTFLAG}
     * <P>
     * 等同 {@link #setPubCommentFlag}
     * @param pubCommentFlag
     */
    @JsonIgnore
    public PSSystemDBCfg pubcommentflag(Integer pubCommentFlag){
        this.setPubCommentFlag(pubCommentFlag);
        return this;
    }

     /**
     * 设置 发布模型注释，详细说明：{@link #FIELD_PUBCOMMENTFLAG}
     * <P>
     * 等同 {@link #setPubCommentFlag}
     * @param pubCommentFlag
     */
    @JsonIgnore
    public PSSystemDBCfg pubcommentflag(Boolean pubCommentFlag){
        if(pubCommentFlag == null){
            this.setPubCommentFlag(null);
        }
        else{
            this.setPubCommentFlag(pubCommentFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>PUBDBMODELFLAG</B>&nbsp;发布数据库模型，指定是否发布当前数据库类型的数据库模型，未指定为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_PUBDBMODELFLAG = "pubdbmodelflag";

    /**
     * 设置 发布数据库模型，详细说明：{@link #FIELD_PUBDBMODELFLAG}
     * 
     * @param pubDBModelFlag
     * 
     */
    @JsonProperty(FIELD_PUBDBMODELFLAG)
    public void setPubDBModelFlag(Integer pubDBModelFlag){
        this.set(FIELD_PUBDBMODELFLAG, pubDBModelFlag);
    }
    
    /**
     * 获取 发布数据库模型  
     * @return
     */
    @JsonIgnore
    public Integer getPubDBModelFlag(){
        Object objValue = this.get(FIELD_PUBDBMODELFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 发布数据库模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPubDBModelFlagDirty(){
        if(this.contains(FIELD_PUBDBMODELFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 发布数据库模型
     */
    @JsonIgnore
    public void resetPubDBModelFlag(){
        this.reset(FIELD_PUBDBMODELFLAG);
    }

    /**
     * 设置 发布数据库模型，详细说明：{@link #FIELD_PUBDBMODELFLAG}
     * <P>
     * 等同 {@link #setPubDBModelFlag}
     * @param pubDBModelFlag
     */
    @JsonIgnore
    public PSSystemDBCfg pubdbmodelflag(Integer pubDBModelFlag){
        this.setPubDBModelFlag(pubDBModelFlag);
        return this;
    }

     /**
     * 设置 发布数据库模型，详细说明：{@link #FIELD_PUBDBMODELFLAG}
     * <P>
     * 等同 {@link #setPubDBModelFlag}
     * @param pubDBModelFlag
     */
    @JsonIgnore
    public PSSystemDBCfg pubdbmodelflag(Boolean pubDBModelFlag){
        if(pubDBModelFlag == null){
            this.setPubDBModelFlag(null);
        }
        else{
            this.setPubDBModelFlag(pubDBModelFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>PUBFKEYFLAG</B>&nbsp;发布外键，指定当前数据库类型发布的数据库模型是否包括外键，未指定为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_PUBFKEYFLAG = "pubfkeyflag";

    /**
     * 设置 发布外键，详细说明：{@link #FIELD_PUBFKEYFLAG}
     * 
     * @param pubFKeyFlag
     * 
     */
    @JsonProperty(FIELD_PUBFKEYFLAG)
    public void setPubFKeyFlag(Integer pubFKeyFlag){
        this.set(FIELD_PUBFKEYFLAG, pubFKeyFlag);
    }
    
    /**
     * 获取 发布外键  
     * @return
     */
    @JsonIgnore
    public Integer getPubFKeyFlag(){
        Object objValue = this.get(FIELD_PUBFKEYFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 发布外键 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPubFKeyFlagDirty(){
        if(this.contains(FIELD_PUBFKEYFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 发布外键
     */
    @JsonIgnore
    public void resetPubFKeyFlag(){
        this.reset(FIELD_PUBFKEYFLAG);
    }

    /**
     * 设置 发布外键，详细说明：{@link #FIELD_PUBFKEYFLAG}
     * <P>
     * 等同 {@link #setPubFKeyFlag}
     * @param pubFKeyFlag
     */
    @JsonIgnore
    public PSSystemDBCfg pubfkeyflag(Integer pubFKeyFlag){
        this.setPubFKeyFlag(pubFKeyFlag);
        return this;
    }

     /**
     * 设置 发布外键，详细说明：{@link #FIELD_PUBFKEYFLAG}
     * <P>
     * 等同 {@link #setPubFKeyFlag}
     * @param pubFKeyFlag
     */
    @JsonIgnore
    public PSSystemDBCfg pubfkeyflag(Boolean pubFKeyFlag){
        if(pubFKeyFlag == null){
            this.setPubFKeyFlag(null);
        }
        else{
            this.setPubFKeyFlag(pubFKeyFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>PUBINDEXFLAG</B>&nbsp;发布索引，指定当前数据库类型发布的数据库模型是否包括索引，未指定为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_PUBINDEXFLAG = "pubindexflag";

    /**
     * 设置 发布索引，详细说明：{@link #FIELD_PUBINDEXFLAG}
     * 
     * @param pubIndexFlag
     * 
     */
    @JsonProperty(FIELD_PUBINDEXFLAG)
    public void setPubIndexFlag(Integer pubIndexFlag){
        this.set(FIELD_PUBINDEXFLAG, pubIndexFlag);
    }
    
    /**
     * 获取 发布索引  
     * @return
     */
    @JsonIgnore
    public Integer getPubIndexFlag(){
        Object objValue = this.get(FIELD_PUBINDEXFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 发布索引 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPubIndexFlagDirty(){
        if(this.contains(FIELD_PUBINDEXFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 发布索引
     */
    @JsonIgnore
    public void resetPubIndexFlag(){
        this.reset(FIELD_PUBINDEXFLAG);
    }

    /**
     * 设置 发布索引，详细说明：{@link #FIELD_PUBINDEXFLAG}
     * <P>
     * 等同 {@link #setPubIndexFlag}
     * @param pubIndexFlag
     */
    @JsonIgnore
    public PSSystemDBCfg pubindexflag(Integer pubIndexFlag){
        this.setPubIndexFlag(pubIndexFlag);
        return this;
    }

     /**
     * 设置 发布索引，详细说明：{@link #FIELD_PUBINDEXFLAG}
     * <P>
     * 等同 {@link #setPubIndexFlag}
     * @param pubIndexFlag
     */
    @JsonIgnore
    public PSSystemDBCfg pubindexflag(Boolean pubIndexFlag){
        if(pubIndexFlag == null){
            this.setPubIndexFlag(null);
        }
        else{
            this.setPubIndexFlag(pubIndexFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>PUBVIEWFLAG</B>&nbsp;发布视图，指定当前数据库类型发布的数据库模型是否包括视图，未指定为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_PUBVIEWFLAG = "pubviewflag";

    /**
     * 设置 发布视图，详细说明：{@link #FIELD_PUBVIEWFLAG}
     * 
     * @param pubViewFlag
     * 
     */
    @JsonProperty(FIELD_PUBVIEWFLAG)
    public void setPubViewFlag(Integer pubViewFlag){
        this.set(FIELD_PUBVIEWFLAG, pubViewFlag);
    }
    
    /**
     * 获取 发布视图  
     * @return
     */
    @JsonIgnore
    public Integer getPubViewFlag(){
        Object objValue = this.get(FIELD_PUBVIEWFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 发布视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPubViewFlagDirty(){
        if(this.contains(FIELD_PUBVIEWFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 发布视图
     */
    @JsonIgnore
    public void resetPubViewFlag(){
        this.reset(FIELD_PUBVIEWFLAG);
    }

    /**
     * 设置 发布视图，详细说明：{@link #FIELD_PUBVIEWFLAG}
     * <P>
     * 等同 {@link #setPubViewFlag}
     * @param pubViewFlag
     */
    @JsonIgnore
    public PSSystemDBCfg pubviewflag(Integer pubViewFlag){
        this.setPubViewFlag(pubViewFlag);
        return this;
    }

     /**
     * 设置 发布视图，详细说明：{@link #FIELD_PUBVIEWFLAG}
     * <P>
     * 等同 {@link #setPubViewFlag}
     * @param pubViewFlag
     */
    @JsonIgnore
    public PSSystemDBCfg pubviewflag(Boolean pubViewFlag){
        if(pubViewFlag == null){
            this.setPubViewFlag(null);
        }
        else{
            this.setPubViewFlag(pubViewFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>RESREADYTIME</B>&nbsp;资源就绪时间
     */
    public final static String FIELD_RESREADYTIME = "resreadytime";

    /**
     * 设置 资源就绪时间
     * 
     * @param resReadyTime
     * 
     */
    @JsonProperty(FIELD_RESREADYTIME)
    public void setResReadyTime(String resReadyTime){
        this.set(FIELD_RESREADYTIME, resReadyTime);
    }
    
    /**
     * 获取 资源就绪时间  
     * @return
     */
    @JsonIgnore
    public String getResReadyTime(){
        Object objValue = this.get(FIELD_RESREADYTIME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 资源就绪时间 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isResReadyTimeDirty(){
        if(this.contains(FIELD_RESREADYTIME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 资源就绪时间
     */
    @JsonIgnore
    public void resetResReadyTime(){
        this.reset(FIELD_RESREADYTIME);
    }

    /**
     * 设置 资源就绪时间
     * <P>
     * 等同 {@link #setResReadyTime}
     * @param resReadyTime
     */
    @JsonIgnore
    public PSSystemDBCfg resreadytime(String resReadyTime){
        this.setResReadyTime(resReadyTime);
        return this;
    }

    /**
     * <B>TABSPACE</B>&nbsp;默认表空间名称，指定当前数据库类型默认的表空间
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_TABSPACE = "tabspace";

    /**
     * 设置 默认表空间名称，详细说明：{@link #FIELD_TABSPACE}
     * 
     * @param tabSpace
     * 
     */
    @JsonProperty(FIELD_TABSPACE)
    public void setTabSpace(String tabSpace){
        this.set(FIELD_TABSPACE, tabSpace);
    }
    
    /**
     * 获取 默认表空间名称  
     * @return
     */
    @JsonIgnore
    public String getTabSpace(){
        Object objValue = this.get(FIELD_TABSPACE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认表空间名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTabSpaceDirty(){
        if(this.contains(FIELD_TABSPACE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认表空间名称
     */
    @JsonIgnore
    public void resetTabSpace(){
        this.reset(FIELD_TABSPACE);
    }

    /**
     * 设置 默认表空间名称，详细说明：{@link #FIELD_TABSPACE}
     * <P>
     * 等同 {@link #setTabSpace}
     * @param tabSpace
     */
    @JsonIgnore
    public PSSystemDBCfg tabspace(String tabSpace){
        this.setTabSpace(tabSpace);
        return this;
    }

    /**
     * <B>TABSPACE2</B>&nbsp;表空间2名称
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_TABSPACE2 = "tabspace2";

    /**
     * 设置 表空间2名称
     * 
     * @param tabSpace2
     * 
     */
    @JsonProperty(FIELD_TABSPACE2)
    public void setTabSpace2(String tabSpace2){
        this.set(FIELD_TABSPACE2, tabSpace2);
    }
    
    /**
     * 获取 表空间2名称  
     * @return
     */
    @JsonIgnore
    public String getTabSpace2(){
        Object objValue = this.get(FIELD_TABSPACE2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表空间2名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTabSpace2Dirty(){
        if(this.contains(FIELD_TABSPACE2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表空间2名称
     */
    @JsonIgnore
    public void resetTabSpace2(){
        this.reset(FIELD_TABSPACE2);
    }

    /**
     * 设置 表空间2名称
     * <P>
     * 等同 {@link #setTabSpace2}
     * @param tabSpace2
     */
    @JsonIgnore
    public PSSystemDBCfg tabspace2(String tabSpace2){
        this.setTabSpace2(tabSpace2);
        return this;
    }

    /**
     * <B>TABSPACE3</B>&nbsp;表空间3名称
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_TABSPACE3 = "tabspace3";

    /**
     * 设置 表空间3名称
     * 
     * @param tabSpace3
     * 
     */
    @JsonProperty(FIELD_TABSPACE3)
    public void setTabSpace3(String tabSpace3){
        this.set(FIELD_TABSPACE3, tabSpace3);
    }
    
    /**
     * 获取 表空间3名称  
     * @return
     */
    @JsonIgnore
    public String getTabSpace3(){
        Object objValue = this.get(FIELD_TABSPACE3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表空间3名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTabSpace3Dirty(){
        if(this.contains(FIELD_TABSPACE3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表空间3名称
     */
    @JsonIgnore
    public void resetTabSpace3(){
        this.reset(FIELD_TABSPACE3);
    }

    /**
     * 设置 表空间3名称
     * <P>
     * 等同 {@link #setTabSpace3}
     * @param tabSpace3
     */
    @JsonIgnore
    public PSSystemDBCfg tabspace3(String tabSpace3){
        this.setTabSpace3(tabSpace3);
        return this;
    }

    /**
     * <B>TABSPACE4</B>&nbsp;表空间4名称
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_TABSPACE4 = "tabspace4";

    /**
     * 设置 表空间4名称
     * 
     * @param tabSpace4
     * 
     */
    @JsonProperty(FIELD_TABSPACE4)
    public void setTabSpace4(String tabSpace4){
        this.set(FIELD_TABSPACE4, tabSpace4);
    }
    
    /**
     * 获取 表空间4名称  
     * @return
     */
    @JsonIgnore
    public String getTabSpace4(){
        Object objValue = this.get(FIELD_TABSPACE4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表空间4名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTabSpace4Dirty(){
        if(this.contains(FIELD_TABSPACE4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表空间4名称
     */
    @JsonIgnore
    public void resetTabSpace4(){
        this.reset(FIELD_TABSPACE4);
    }

    /**
     * 设置 表空间4名称
     * <P>
     * 等同 {@link #setTabSpace4}
     * @param tabSpace4
     */
    @JsonIgnore
    public PSSystemDBCfg tabspace4(String tabSpace4){
        this.setTabSpace4(tabSpace4);
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
    public PSSystemDBCfg updatedate(String updateDate){
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
    public PSSystemDBCfg updateman(String updateMan){
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
    public PSSystemDBCfg usercat(String userCat){
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
    public PSSystemDBCfg usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSystemDBCfg userparams(String userParams){
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
    public PSSystemDBCfg usertag(String userTag){
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
    public PSSystemDBCfg usertag2(String userTag2){
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
    public PSSystemDBCfg usertag3(String userTag3){
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
    public PSSystemDBCfg usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSystemDBCfgId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSystemDBCfgId(strValue);
    }

    @JsonIgnore
    public PSSystemDBCfg id(String strValue){
        this.setPSSystemDBCfgId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSystemDBCfg){
            PSSystemDBCfg model = (PSSystemDBCfg)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
