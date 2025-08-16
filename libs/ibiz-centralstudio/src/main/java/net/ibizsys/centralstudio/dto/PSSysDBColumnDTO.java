package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSDBCOLUMN</B>数据库列 模型传输对象
 * <P>
 * 关系数据表数据列模型，定义数据列的类型等逻辑，如数据列为外键列，则可进一步指定引用的数据列
 */
public class PSSysDBColumnDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysDBColumnDTO(){
    }      

    /**
     * <B>ALLOWEMPTY</B>&nbsp;允许为空，指定数据列是否允许空输入，未定义时为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ALLOWEMPTY = "allowempty";

    /**
     * 设置 允许为空，详细说明：{@link #FIELD_ALLOWEMPTY}
     * 
     * @param allowEmpty
     * 
     */
    @JsonProperty(FIELD_ALLOWEMPTY)
    public void setAllowEmpty(Integer allowEmpty){
        this.set(FIELD_ALLOWEMPTY, allowEmpty);
    }
    
    /**
     * 获取 允许为空  
     * @return
     */
    @JsonIgnore
    public Integer getAllowEmpty(){
        Object objValue = this.get(FIELD_ALLOWEMPTY);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 允许为空 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAllowEmptyDirty(){
        if(this.contains(FIELD_ALLOWEMPTY)){
            return true;
        }
        return false;
    }

    /**
     * 重置 允许为空
     */
    @JsonIgnore
    public void resetAllowEmpty(){
        this.reset(FIELD_ALLOWEMPTY);
    }

    /**
     * 设置 允许为空，详细说明：{@link #FIELD_ALLOWEMPTY}
     * <P>
     * 等同 {@link #setAllowEmpty}
     * @param allowEmpty
     */
    @JsonIgnore
    public PSSysDBColumnDTO allowempty(Integer allowEmpty){
        this.setAllowEmpty(allowEmpty);
        return this;
    }

     /**
     * 设置 允许为空，详细说明：{@link #FIELD_ALLOWEMPTY}
     * <P>
     * 等同 {@link #setAllowEmpty}
     * @param allowEmpty
     */
    @JsonIgnore
    public PSSysDBColumnDTO allowempty(Boolean allowEmpty){
        if(allowEmpty == null){
            this.setAllowEmpty(null);
        }
        else{
            this.setAllowEmpty(allowEmpty?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定数据列的代码标识，需要在所在的数据表中具有唯一性
     * <P>
     * 字符串：最大长度 100，由字母、数字、下划线组成，且开始必须为字母
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
    public PSSysDBColumnDTO codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>CODENAME2</B>&nbsp;代码标识2，指定数据列的代码标识2，需要在所在的数据表中具有唯一性
     * <P>
     * 字符串：最大长度 100，由字母、数字、下划线组成，且开始必须为字母
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
    public PSSysDBColumnDTO codename2(String codeName2){
        this.setCodeName2(codeName2);
        return this;
    }

    /**
     * <B>COLDESC</B>&nbsp;列说明，指定数据列的描述信息
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_COLDESC = "coldesc";

    /**
     * 设置 列说明，详细说明：{@link #FIELD_COLDESC}
     * 
     * @param colDesc
     * 
     */
    @JsonProperty(FIELD_COLDESC)
    public void setColDesc(String colDesc){
        this.set(FIELD_COLDESC, colDesc);
    }
    
    /**
     * 获取 列说明  
     * @return
     */
    @JsonIgnore
    public String getColDesc(){
        Object objValue = this.get(FIELD_COLDESC);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 列说明 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isColDescDirty(){
        if(this.contains(FIELD_COLDESC)){
            return true;
        }
        return false;
    }

    /**
     * 重置 列说明
     */
    @JsonIgnore
    public void resetColDesc(){
        this.reset(FIELD_COLDESC);
    }

    /**
     * 设置 列说明，详细说明：{@link #FIELD_COLDESC}
     * <P>
     * 等同 {@link #setColDesc}
     * @param colDesc
     */
    @JsonIgnore
    public PSSysDBColumnDTO coldesc(String colDesc){
        this.setColDesc(colDesc);
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
    public PSSysDBColumnDTO createdate(Timestamp createDate){
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
    public PSSysDBColumnDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CREATESQL</B>&nbsp;建立SQL，指定数据列的建立SQL
     * <P>
     * 字符串：最大长度 1000
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
    public PSSysDBColumnDTO createsql(String createSql){
        this.setCreateSql(createSql);
        return this;
    }

    /**
     * <B>DATATYPE</B>&nbsp;数据类型，指定数据列的数据类型
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_DATATYPE = "datatype";

    /**
     * 设置 数据类型，详细说明：{@link #FIELD_DATATYPE}
     * 
     * @param dataType
     * 
     */
    @JsonProperty(FIELD_DATATYPE)
    public void setDataType(String dataType){
        this.set(FIELD_DATATYPE, dataType);
    }
    
    /**
     * 获取 数据类型  
     * @return
     */
    @JsonIgnore
    public String getDataType(){
        Object objValue = this.get(FIELD_DATATYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDataTypeDirty(){
        if(this.contains(FIELD_DATATYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据类型
     */
    @JsonIgnore
    public void resetDataType(){
        this.reset(FIELD_DATATYPE);
    }

    /**
     * 设置 数据类型，详细说明：{@link #FIELD_DATATYPE}
     * <P>
     * 等同 {@link #setDataType}
     * @param dataType
     */
    @JsonIgnore
    public PSSysDBColumnDTO datatype(String dataType){
        this.setDataType(dataType);
        return this;
    }

    /**
     * <B>DATATYPES</B>&nbsp;数据类型集合
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_DATATYPES = "datatypes";

    /**
     * 设置 数据类型集合
     * 
     * @param dataTypes
     * 
     */
    @JsonProperty(FIELD_DATATYPES)
    public void setDataTypes(String dataTypes){
        this.set(FIELD_DATATYPES, dataTypes);
    }
    
    /**
     * 获取 数据类型集合  
     * @return
     */
    @JsonIgnore
    public String getDataTypes(){
        Object objValue = this.get(FIELD_DATATYPES);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据类型集合 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDataTypesDirty(){
        if(this.contains(FIELD_DATATYPES)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据类型集合
     */
    @JsonIgnore
    public void resetDataTypes(){
        this.reset(FIELD_DATATYPES);
    }

    /**
     * 设置 数据类型集合
     * <P>
     * 等同 {@link #setDataTypes}
     * @param dataTypes
     */
    @JsonIgnore
    public PSSysDBColumnDTO datatypes(String dataTypes){
        this.setDataTypes(dataTypes);
        return this;
    }

    /**
     * <B>DEFAULTVALUE</B>&nbsp;数据库默认值，指定数据列的默认值
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_DEFAULTVALUE = "defaultvalue";

    /**
     * 设置 数据库默认值，详细说明：{@link #FIELD_DEFAULTVALUE}
     * 
     * @param defaultValue
     * 
     */
    @JsonProperty(FIELD_DEFAULTVALUE)
    public void setDefaultValue(String defaultValue){
        this.set(FIELD_DEFAULTVALUE, defaultValue);
    }
    
    /**
     * 获取 数据库默认值  
     * @return
     */
    @JsonIgnore
    public String getDefaultValue(){
        Object objValue = this.get(FIELD_DEFAULTVALUE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据库默认值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefaultValueDirty(){
        if(this.contains(FIELD_DEFAULTVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据库默认值
     */
    @JsonIgnore
    public void resetDefaultValue(){
        this.reset(FIELD_DEFAULTVALUE);
    }

    /**
     * 设置 数据库默认值，详细说明：{@link #FIELD_DEFAULTVALUE}
     * <P>
     * 等同 {@link #setDefaultValue}
     * @param defaultValue
     */
    @JsonIgnore
    public PSSysDBColumnDTO defaultvalue(String defaultValue){
        this.setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <B>DROPSQL</B>&nbsp;移除SQL，指定数据列的移除SQL
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
    public PSSysDBColumnDTO dropsql(String dropSql){
        this.setDropSql(dropSql);
        return this;
    }

    /**
     * <B>FKEY</B>&nbsp;外键列，指定数据列是否为外键列，外键列需要指定引用的数据表及数据列，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_FKEY = "fkey";

    /**
     * 设置 外键列，详细说明：{@link #FIELD_FKEY}
     * 
     * @param fKey
     * 
     */
    @JsonProperty(FIELD_FKEY)
    public void setFKey(Integer fKey){
        this.set(FIELD_FKEY, fKey);
    }
    
    /**
     * 获取 外键列  
     * @return
     */
    @JsonIgnore
    public Integer getFKey(){
        Object objValue = this.get(FIELD_FKEY);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 外键列 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFKeyDirty(){
        if(this.contains(FIELD_FKEY)){
            return true;
        }
        return false;
    }

    /**
     * 重置 外键列
     */
    @JsonIgnore
    public void resetFKey(){
        this.reset(FIELD_FKEY);
    }

    /**
     * 设置 外键列，详细说明：{@link #FIELD_FKEY}
     * <P>
     * 等同 {@link #setFKey}
     * @param fKey
     */
    @JsonIgnore
    public PSSysDBColumnDTO fkey(Integer fKey){
        this.setFKey(fKey);
        return this;
    }

     /**
     * 设置 外键列，详细说明：{@link #FIELD_FKEY}
     * <P>
     * 等同 {@link #setFKey}
     * @param fKey
     */
    @JsonIgnore
    public PSSysDBColumnDTO fkey(Boolean fKey){
        if(fKey == null){
            this.setFKey(null);
        }
        else{
            this.setFKey(fKey?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>IDENTITYMODE</B>&nbsp;自增标识，指定数据列是否为自增标识，一个数据表只允许定义一个自增标识列。未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_IDENTITYMODE = "identitymode";

    /**
     * 设置 自增标识，详细说明：{@link #FIELD_IDENTITYMODE}
     * 
     * @param identityMode
     * 
     */
    @JsonProperty(FIELD_IDENTITYMODE)
    public void setIdentityMode(Integer identityMode){
        this.set(FIELD_IDENTITYMODE, identityMode);
    }
    
    /**
     * 获取 自增标识  
     * @return
     */
    @JsonIgnore
    public Integer getIdentityMode(){
        Object objValue = this.get(FIELD_IDENTITYMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 自增标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIdentityModeDirty(){
        if(this.contains(FIELD_IDENTITYMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自增标识
     */
    @JsonIgnore
    public void resetIdentityMode(){
        this.reset(FIELD_IDENTITYMODE);
    }

    /**
     * 设置 自增标识，详细说明：{@link #FIELD_IDENTITYMODE}
     * <P>
     * 等同 {@link #setIdentityMode}
     * @param identityMode
     */
    @JsonIgnore
    public PSSysDBColumnDTO identitymode(Integer identityMode){
        this.setIdentityMode(identityMode);
        return this;
    }

     /**
     * 设置 自增标识，详细说明：{@link #FIELD_IDENTITYMODE}
     * <P>
     * 等同 {@link #setIdentityMode}
     * @param identityMode
     */
    @JsonIgnore
    public PSSysDBColumnDTO identitymode(Boolean identityMode){
        if(identityMode == null){
            this.setIdentityMode(null);
        }
        else{
            this.setIdentityMode(identityMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>LENGTH</B>&nbsp;长度，指定数据列的长度，未定义时为【-1】
     */
    public final static String FIELD_LENGTH = "length";

    /**
     * 设置 长度，详细说明：{@link #FIELD_LENGTH}
     * 
     * @param length
     * 
     */
    @JsonProperty(FIELD_LENGTH)
    public void setLength(Integer length){
        this.set(FIELD_LENGTH, length);
    }
    
    /**
     * 获取 长度  
     * @return
     */
    @JsonIgnore
    public Integer getLength(){
        Object objValue = this.get(FIELD_LENGTH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 长度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLengthDirty(){
        if(this.contains(FIELD_LENGTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 长度
     */
    @JsonIgnore
    public void resetLength(){
        this.reset(FIELD_LENGTH);
    }

    /**
     * 设置 长度，详细说明：{@link #FIELD_LENGTH}
     * <P>
     * 等同 {@link #setLength}
     * @param length
     */
    @JsonIgnore
    public PSSysDBColumnDTO length(Integer length){
        this.setLength(length);
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;逻辑名称，指定数据列的逻辑名称
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
    public PSSysDBColumnDTO logicname(String logicName){
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
    public PSSysDBColumnDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;排序值，指定数据列的排列次序
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 排序值，详细说明：{@link #FIELD_ORDERVALUE}
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
     * 设置 排序值，详细说明：{@link #FIELD_ORDERVALUE}
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSSysDBColumnDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PKEY</B>&nbsp;主键，指定数据列的是否为主键，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_PKEY = "pkey";

    /**
     * 设置 主键，详细说明：{@link #FIELD_PKEY}
     * 
     * @param pKey
     * 
     */
    @JsonProperty(FIELD_PKEY)
    public void setPKey(Integer pKey){
        this.set(FIELD_PKEY, pKey);
    }
    
    /**
     * 获取 主键  
     * @return
     */
    @JsonIgnore
    public Integer getPKey(){
        Object objValue = this.get(FIELD_PKEY);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 主键 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPKeyDirty(){
        if(this.contains(FIELD_PKEY)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主键
     */
    @JsonIgnore
    public void resetPKey(){
        this.reset(FIELD_PKEY);
    }

    /**
     * 设置 主键，详细说明：{@link #FIELD_PKEY}
     * <P>
     * 等同 {@link #setPKey}
     * @param pKey
     */
    @JsonIgnore
    public PSSysDBColumnDTO pkey(Integer pKey){
        this.setPKey(pKey);
        return this;
    }

     /**
     * 设置 主键，详细说明：{@link #FIELD_PKEY}
     * <P>
     * 等同 {@link #setPKey}
     * @param pKey
     */
    @JsonIgnore
    public PSSysDBColumnDTO pkey(Boolean pKey){
        if(pKey == null){
            this.setPKey(null);
        }
        else{
            this.setPKey(pKey?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>PRECISION</B>&nbsp;浮点精度，指定数据列的浮点精度，未定义时为【0】
     */
    public final static String FIELD_PRECISION = "precision";

    /**
     * 设置 浮点精度，详细说明：{@link #FIELD_PRECISION}
     * 
     * @param precision
     * 
     */
    @JsonProperty(FIELD_PRECISION)
    public void setPrecision(Integer precision){
        this.set(FIELD_PRECISION, precision);
        //属性名称与代码标识不一致，设置属性名称
        this.set("precision2", precision);
    }
    
    /**
     * 获取 浮点精度  
     * @return
     */
    @JsonIgnore
    public Integer getPrecision(){
        Object objValue = this.get(FIELD_PRECISION);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("precision2");
            if(objValue == null){
                    return null;
            }
        }
        return (Integer)objValue;
    }

    /**
     * 判断 浮点精度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPrecisionDirty(){
        if(this.contains(FIELD_PRECISION)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("precision2")){
            return true;
        }
        return false;
    }

    /**
     * 重置 浮点精度
     */
    @JsonIgnore
    public void resetPrecision(){
        this.reset(FIELD_PRECISION);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("precision2");
    }

    /**
     * 设置 浮点精度，详细说明：{@link #FIELD_PRECISION}
     * <P>
     * 等同 {@link #setPrecision}
     * @param precision
     */
    @JsonIgnore
    public PSSysDBColumnDTO precision(Integer precision){
        this.setPrecision(precision);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public Integer getPrecision2(){
        return this.getPrecision();
    }

    @JsonIgnore
    @Deprecated        
    public void setPrecision2(Integer precision2){
        this.setPrecision(precision2);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPrecision2Dirty(){
        return this.isPrecisionDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPrecision2(){
        this.resetPrecision();
    }

    /**
     * <B>PSSYSDBCOLUMNID</B>&nbsp;数据库列标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSDBCOLUMNID = "pssysdbcolumnid";

    /**
     * 设置 数据库列标识
     * 
     * @param pSSysDBColumnId
     * 
     */
    @JsonProperty(FIELD_PSSYSDBCOLUMNID)
    public void setPSSysDBColumnId(String pSSysDBColumnId){
        this.set(FIELD_PSSYSDBCOLUMNID, pSSysDBColumnId);
    }
    
    /**
     * 获取 数据库列标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysDBColumnId(){
        Object objValue = this.get(FIELD_PSSYSDBCOLUMNID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据库列标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDBColumnIdDirty(){
        if(this.contains(FIELD_PSSYSDBCOLUMNID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据库列标识
     */
    @JsonIgnore
    public void resetPSSysDBColumnId(){
        this.reset(FIELD_PSSYSDBCOLUMNID);
    }

    /**
     * 设置 数据库列标识
     * <P>
     * 等同 {@link #setPSSysDBColumnId}
     * @param pSSysDBColumnId
     */
    @JsonIgnore
    public PSSysDBColumnDTO pssysdbcolumnid(String pSSysDBColumnId){
        this.setPSSysDBColumnId(pSSysDBColumnId);
        return this;
    }

    /**
     * <B>PSSYSDBCOLUMNNAME</B>&nbsp;列名称，指定数据列的名称，需在所在的数据表中具备唯一性
     * <P>
     * 字符串：最大长度 100，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSSYSDBCOLUMNNAME = "pssysdbcolumnname";

    /**
     * 设置 列名称，详细说明：{@link #FIELD_PSSYSDBCOLUMNNAME}
     * 
     * @param pSSysDBColumnName
     * 
     */
    @JsonProperty(FIELD_PSSYSDBCOLUMNNAME)
    public void setPSSysDBColumnName(String pSSysDBColumnName){
        this.set(FIELD_PSSYSDBCOLUMNNAME, pSSysDBColumnName);
    }
    
    /**
     * 获取 列名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysDBColumnName(){
        Object objValue = this.get(FIELD_PSSYSDBCOLUMNNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 列名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDBColumnNameDirty(){
        if(this.contains(FIELD_PSSYSDBCOLUMNNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 列名称
     */
    @JsonIgnore
    public void resetPSSysDBColumnName(){
        this.reset(FIELD_PSSYSDBCOLUMNNAME);
    }

    /**
     * 设置 列名称，详细说明：{@link #FIELD_PSSYSDBCOLUMNNAME}
     * <P>
     * 等同 {@link #setPSSysDBColumnName}
     * @param pSSysDBColumnName
     */
    @JsonIgnore
    public PSSysDBColumnDTO pssysdbcolumnname(String pSSysDBColumnName){
        this.setPSSysDBColumnName(pSSysDBColumnName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysDBColumnName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysDBColumnName(strName);
    }

    @JsonIgnore
    public PSSysDBColumnDTO name(String strName){
        this.setPSSysDBColumnName(strName);
        return this;
    }

    /**
     * <B>PSSYSDBSCHEMEID</B>&nbsp;数据库体系标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDBTABLEID}
     */
    public final static String FIELD_PSSYSDBSCHEMEID = "pssysdbschemeid";

    /**
     * 设置 数据库体系标识
     * 
     * @param pSSysDBSchemeId
     * 
     */
    @JsonProperty(FIELD_PSSYSDBSCHEMEID)
    public void setPSSysDBSchemeId(String pSSysDBSchemeId){
        this.set(FIELD_PSSYSDBSCHEMEID, pSSysDBSchemeId);
    }
    
    /**
     * 获取 数据库体系标识  
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
     * 判断 数据库体系标识 是否指定值，包括空值
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
     * 重置 数据库体系标识
     */
    @JsonIgnore
    public void resetPSSysDBSchemeId(){
        this.reset(FIELD_PSSYSDBSCHEMEID);
    }

    /**
     * 设置 数据库体系标识
     * <P>
     * 等同 {@link #setPSSysDBSchemeId}
     * @param pSSysDBSchemeId
     */
    @JsonIgnore
    public PSSysDBColumnDTO pssysdbschemeid(String pSSysDBSchemeId){
        this.setPSSysDBSchemeId(pSSysDBSchemeId);
        return this;
    }

    /**
     * <B>PSSYSDBTABLEID</B>&nbsp;系统数据库表，指定数据列所在的数据表对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysDBTableDTO} 
     */
    public final static String FIELD_PSSYSDBTABLEID = "pssysdbtableid";

    /**
     * 设置 系统数据库表，详细说明：{@link #FIELD_PSSYSDBTABLEID}
     * 
     * @param pSSysDBTableId
     * 
     */
    @JsonProperty(FIELD_PSSYSDBTABLEID)
    public void setPSSysDBTableId(String pSSysDBTableId){
        this.set(FIELD_PSSYSDBTABLEID, pSSysDBTableId);
    }
    
    /**
     * 获取 系统数据库表  
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
     * 判断 系统数据库表 是否指定值，包括空值
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
     * 重置 系统数据库表
     */
    @JsonIgnore
    public void resetPSSysDBTableId(){
        this.reset(FIELD_PSSYSDBTABLEID);
    }

    /**
     * 设置 系统数据库表，详细说明：{@link #FIELD_PSSYSDBTABLEID}
     * <P>
     * 等同 {@link #setPSSysDBTableId}
     * @param pSSysDBTableId
     */
    @JsonIgnore
    public PSSysDBColumnDTO pssysdbtableid(String pSSysDBTableId){
        this.setPSSysDBTableId(pSSysDBTableId);
        return this;
    }

    /**
     * 设置 系统数据库表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDBTableId}
     * @param pSSysDBTable 引用对象
     */
    @JsonIgnore
    public PSSysDBColumnDTO pssysdbtableid(PSSysDBTableDTO pSSysDBTable){
        if(pSSysDBTable == null){
            this.setPSSysDBSchemeId(null);
            this.setPSSysDBTableId(null);
            this.setPSSysDBTableName(null);
        }
        else{
            this.setPSSysDBSchemeId(pSSysDBTable.getPSSysDBSchemeId());
            this.setPSSysDBTableId(pSSysDBTable.getPSSysDBTableId());
            this.setPSSysDBTableName(pSSysDBTable.getPSSysDBTableName());
        }
        return this;
    }

    /**
     * <B>PSSYSDBTABLENAME</B>&nbsp;数据库表，指定数据列所在的数据表对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDBTABLEID}
     */
    public final static String FIELD_PSSYSDBTABLENAME = "pssysdbtablename";

    /**
     * 设置 数据库表，详细说明：{@link #FIELD_PSSYSDBTABLENAME}
     * 
     * @param pSSysDBTableName
     * 
     */
    @JsonProperty(FIELD_PSSYSDBTABLENAME)
    public void setPSSysDBTableName(String pSSysDBTableName){
        this.set(FIELD_PSSYSDBTABLENAME, pSSysDBTableName);
    }
    
    /**
     * 获取 数据库表  
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
     * 判断 数据库表 是否指定值，包括空值
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
     * 重置 数据库表
     */
    @JsonIgnore
    public void resetPSSysDBTableName(){
        this.reset(FIELD_PSSYSDBTABLENAME);
    }

    /**
     * 设置 数据库表，详细说明：{@link #FIELD_PSSYSDBTABLENAME}
     * <P>
     * 等同 {@link #setPSSysDBTableName}
     * @param pSSysDBTableName
     */
    @JsonIgnore
    public PSSysDBColumnDTO pssysdbtablename(String pSSysDBTableName){
        this.setPSSysDBTableName(pSSysDBTableName);
        return this;
    }

    /**
     * <B>REFPSSYSDBCOLUMNID</B>&nbsp;引用数据列，数据列设置为外键列时指定引用的数据列对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysDBColumnDTO} 
     */
    public final static String FIELD_REFPSSYSDBCOLUMNID = "refpssysdbcolumnid";

    /**
     * 设置 引用数据列，详细说明：{@link #FIELD_REFPSSYSDBCOLUMNID}
     * 
     * @param refPSSysDBColumnId
     * 
     */
    @JsonProperty(FIELD_REFPSSYSDBCOLUMNID)
    public void setRefPSSysDBColumnId(String refPSSysDBColumnId){
        this.set(FIELD_REFPSSYSDBCOLUMNID, refPSSysDBColumnId);
    }
    
    /**
     * 获取 引用数据列  
     * @return
     */
    @JsonIgnore
    public String getRefPSSysDBColumnId(){
        Object objValue = this.get(FIELD_REFPSSYSDBCOLUMNID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用数据列 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSSysDBColumnIdDirty(){
        if(this.contains(FIELD_REFPSSYSDBCOLUMNID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用数据列
     */
    @JsonIgnore
    public void resetRefPSSysDBColumnId(){
        this.reset(FIELD_REFPSSYSDBCOLUMNID);
    }

    /**
     * 设置 引用数据列，详细说明：{@link #FIELD_REFPSSYSDBCOLUMNID}
     * <P>
     * 等同 {@link #setRefPSSysDBColumnId}
     * @param refPSSysDBColumnId
     */
    @JsonIgnore
    public PSSysDBColumnDTO refpssysdbcolumnid(String refPSSysDBColumnId){
        this.setRefPSSysDBColumnId(refPSSysDBColumnId);
        return this;
    }

    /**
     * 设置 引用数据列，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefPSSysDBColumnId}
     * @param pSSysDBColumn 引用对象
     */
    @JsonIgnore
    public PSSysDBColumnDTO refpssysdbcolumnid(PSSysDBColumnDTO pSSysDBColumn){
        if(pSSysDBColumn == null){
            this.setRefPSSysDBColumnId(null);
            this.setRefPSSysDBColumnName(null);
        }
        else{
            this.setRefPSSysDBColumnId(pSSysDBColumn.getPSSysDBColumnId());
            this.setRefPSSysDBColumnName(pSSysDBColumn.getPSSysDBColumnName());
        }
        return this;
    }

    /**
     * <B>REFPSSYSDBCOLUMNNAME</B>&nbsp;引用数据列，数据列设置为外键列时指定引用的数据列对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPSSYSDBCOLUMNID}
     */
    public final static String FIELD_REFPSSYSDBCOLUMNNAME = "refpssysdbcolumnname";

    /**
     * 设置 引用数据列，详细说明：{@link #FIELD_REFPSSYSDBCOLUMNNAME}
     * 
     * @param refPSSysDBColumnName
     * 
     */
    @JsonProperty(FIELD_REFPSSYSDBCOLUMNNAME)
    public void setRefPSSysDBColumnName(String refPSSysDBColumnName){
        this.set(FIELD_REFPSSYSDBCOLUMNNAME, refPSSysDBColumnName);
    }
    
    /**
     * 获取 引用数据列  
     * @return
     */
    @JsonIgnore
    public String getRefPSSysDBColumnName(){
        Object objValue = this.get(FIELD_REFPSSYSDBCOLUMNNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用数据列 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSSysDBColumnNameDirty(){
        if(this.contains(FIELD_REFPSSYSDBCOLUMNNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用数据列
     */
    @JsonIgnore
    public void resetRefPSSysDBColumnName(){
        this.reset(FIELD_REFPSSYSDBCOLUMNNAME);
    }

    /**
     * 设置 引用数据列，详细说明：{@link #FIELD_REFPSSYSDBCOLUMNNAME}
     * <P>
     * 等同 {@link #setRefPSSysDBColumnName}
     * @param refPSSysDBColumnName
     */
    @JsonIgnore
    public PSSysDBColumnDTO refpssysdbcolumnname(String refPSSysDBColumnName){
        this.setRefPSSysDBColumnName(refPSSysDBColumnName);
        return this;
    }

    /**
     * <B>REFPSSYSDBTABLEID</B>&nbsp;引用数据表，数据列设置为外键列时指定引用的数据列所在的数据表对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysDBTableDTO} 
     */
    public final static String FIELD_REFPSSYSDBTABLEID = "refpssysdbtableid";

    /**
     * 设置 引用数据表，详细说明：{@link #FIELD_REFPSSYSDBTABLEID}
     * 
     * @param refPSSysDBTableId
     * 
     */
    @JsonProperty(FIELD_REFPSSYSDBTABLEID)
    public void setRefPSSysDBTableId(String refPSSysDBTableId){
        this.set(FIELD_REFPSSYSDBTABLEID, refPSSysDBTableId);
    }
    
    /**
     * 获取 引用数据表  
     * @return
     */
    @JsonIgnore
    public String getRefPSSysDBTableId(){
        Object objValue = this.get(FIELD_REFPSSYSDBTABLEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用数据表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSSysDBTableIdDirty(){
        if(this.contains(FIELD_REFPSSYSDBTABLEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用数据表
     */
    @JsonIgnore
    public void resetRefPSSysDBTableId(){
        this.reset(FIELD_REFPSSYSDBTABLEID);
    }

    /**
     * 设置 引用数据表，详细说明：{@link #FIELD_REFPSSYSDBTABLEID}
     * <P>
     * 等同 {@link #setRefPSSysDBTableId}
     * @param refPSSysDBTableId
     */
    @JsonIgnore
    public PSSysDBColumnDTO refpssysdbtableid(String refPSSysDBTableId){
        this.setRefPSSysDBTableId(refPSSysDBTableId);
        return this;
    }

    /**
     * 设置 引用数据表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefPSSysDBTableId}
     * @param pSSysDBTable 引用对象
     */
    @JsonIgnore
    public PSSysDBColumnDTO refpssysdbtableid(PSSysDBTableDTO pSSysDBTable){
        if(pSSysDBTable == null){
            this.setRefPSSysDBTableId(null);
            this.setRefPSSysDBTableName(null);
        }
        else{
            this.setRefPSSysDBTableId(pSSysDBTable.getPSSysDBTableId());
            this.setRefPSSysDBTableName(pSSysDBTable.getPSSysDBTableName());
        }
        return this;
    }

    /**
     * <B>REFPSSYSDBTABLENAME</B>&nbsp;引用数据表，数据列设置为外键列时指定引用的数据列所在的数据表对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPSSYSDBTABLEID}
     */
    public final static String FIELD_REFPSSYSDBTABLENAME = "refpssysdbtablename";

    /**
     * 设置 引用数据表，详细说明：{@link #FIELD_REFPSSYSDBTABLENAME}
     * 
     * @param refPSSysDBTableName
     * 
     */
    @JsonProperty(FIELD_REFPSSYSDBTABLENAME)
    public void setRefPSSysDBTableName(String refPSSysDBTableName){
        this.set(FIELD_REFPSSYSDBTABLENAME, refPSSysDBTableName);
    }
    
    /**
     * 获取 引用数据表  
     * @return
     */
    @JsonIgnore
    public String getRefPSSysDBTableName(){
        Object objValue = this.get(FIELD_REFPSSYSDBTABLENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用数据表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSSysDBTableNameDirty(){
        if(this.contains(FIELD_REFPSSYSDBTABLENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用数据表
     */
    @JsonIgnore
    public void resetRefPSSysDBTableName(){
        this.reset(FIELD_REFPSSYSDBTABLENAME);
    }

    /**
     * 设置 引用数据表，详细说明：{@link #FIELD_REFPSSYSDBTABLENAME}
     * <P>
     * 等同 {@link #setRefPSSysDBTableName}
     * @param refPSSysDBTableName
     */
    @JsonIgnore
    public PSSysDBColumnDTO refpssysdbtablename(String refPSSysDBTableName){
        this.setRefPSSysDBTableName(refPSSysDBTableName);
        return this;
    }

    /**
     * <B>STDDATATYPE</B>&nbsp;标准数据类型，指定数据列的标准数据类型，未定义时为【UNKNOWN】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.StdDataType} 
     */
    public final static String FIELD_STDDATATYPE = "stddatatype";

    /**
     * 设置 标准数据类型，详细说明：{@link #FIELD_STDDATATYPE}
     * 
     * @param stdDataType
     * 
     */
    @JsonProperty(FIELD_STDDATATYPE)
    public void setStdDataType(Integer stdDataType){
        this.set(FIELD_STDDATATYPE, stdDataType);
    }
    
    /**
     * 获取 标准数据类型  
     * @return
     */
    @JsonIgnore
    public Integer getStdDataType(){
        Object objValue = this.get(FIELD_STDDATATYPE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 标准数据类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStdDataTypeDirty(){
        if(this.contains(FIELD_STDDATATYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标准数据类型
     */
    @JsonIgnore
    public void resetStdDataType(){
        this.reset(FIELD_STDDATATYPE);
    }

    /**
     * 设置 标准数据类型，详细说明：{@link #FIELD_STDDATATYPE}
     * <P>
     * 等同 {@link #setStdDataType}
     * @param stdDataType
     */
    @JsonIgnore
    public PSSysDBColumnDTO stddatatype(Integer stdDataType){
        this.setStdDataType(stdDataType);
        return this;
    }

     /**
     * 设置 标准数据类型，详细说明：{@link #FIELD_STDDATATYPE}
     * <P>
     * 等同 {@link #setStdDataType}
     * @param stdDataType
     */
    @JsonIgnore
    public PSSysDBColumnDTO stddatatype(net.ibizsys.model.PSModelEnums.StdDataType stdDataType){
        if(stdDataType == null){
            this.setStdDataType(null);
        }
        else{
            this.setStdDataType(stdDataType.value);
        }
        return this;
    }

    /**
     * <B>UNSIGNEDMODE</B>&nbsp;无符号，指定数据列是否为无符号数据类型，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_UNSIGNEDMODE = "unsignedmode";

    /**
     * 设置 无符号，详细说明：{@link #FIELD_UNSIGNEDMODE}
     * 
     * @param unsignedMode
     * 
     */
    @JsonProperty(FIELD_UNSIGNEDMODE)
    public void setUnsignedMode(Integer unsignedMode){
        this.set(FIELD_UNSIGNEDMODE, unsignedMode);
    }
    
    /**
     * 获取 无符号  
     * @return
     */
    @JsonIgnore
    public Integer getUnsignedMode(){
        Object objValue = this.get(FIELD_UNSIGNEDMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 无符号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUnsignedModeDirty(){
        if(this.contains(FIELD_UNSIGNEDMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 无符号
     */
    @JsonIgnore
    public void resetUnsignedMode(){
        this.reset(FIELD_UNSIGNEDMODE);
    }

    /**
     * 设置 无符号，详细说明：{@link #FIELD_UNSIGNEDMODE}
     * <P>
     * 等同 {@link #setUnsignedMode}
     * @param unsignedMode
     */
    @JsonIgnore
    public PSSysDBColumnDTO unsignedmode(Integer unsignedMode){
        this.setUnsignedMode(unsignedMode);
        return this;
    }

     /**
     * 设置 无符号，详细说明：{@link #FIELD_UNSIGNEDMODE}
     * <P>
     * 等同 {@link #setUnsignedMode}
     * @param unsignedMode
     */
    @JsonIgnore
    public PSSysDBColumnDTO unsignedmode(Boolean unsignedMode){
        if(unsignedMode == null){
            this.setUnsignedMode(null);
        }
        else{
            this.setUnsignedMode(unsignedMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSSysDBColumnDTO updatedate(Timestamp updateDate){
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
    public PSSysDBColumnDTO updateman(String updateMan){
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
    public PSSysDBColumnDTO usercat(String userCat){
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
    public PSSysDBColumnDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSSysDBColumnDTO usertag(String userTag){
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
    public PSSysDBColumnDTO usertag2(String userTag2){
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
    public PSSysDBColumnDTO usertag3(String userTag3){
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
    public PSSysDBColumnDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSSysDBColumnId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysDBColumnId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysDBColumnId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysDBColumnId(strValue);
    }

    @JsonIgnore
    public PSSysDBColumnDTO id(String strValue){
        this.setPSSysDBColumnId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysDBColumnDTO){
            PSSysDBColumnDTO dto = (PSSysDBColumnDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
