package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSBIAGGCOLUMN</B>智能报表聚合数据列 模型传输对象
 * <P>
 * 
 */
public class PSSysBIAggColumn extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysBIAggColumn(){
        this.setValidFlag(1);
    }      

    /**
     * <B>BIAGGCOLUMNTAG</B>&nbsp;聚合数据列标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_BIAGGCOLUMNTAG = "biaggcolumntag";

    /**
     * 设置 聚合数据列标记
     * 
     * @param bIAggColumnTag
     * 
     */
    @JsonProperty(FIELD_BIAGGCOLUMNTAG)
    public void setBIAggColumnTag(String bIAggColumnTag){
        this.set(FIELD_BIAGGCOLUMNTAG, bIAggColumnTag);
    }
    
    /**
     * 获取 聚合数据列标记  
     * @return
     */
    @JsonIgnore
    public String getBIAggColumnTag(){
        Object objValue = this.get(FIELD_BIAGGCOLUMNTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 聚合数据列标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBIAggColumnTagDirty(){
        if(this.contains(FIELD_BIAGGCOLUMNTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 聚合数据列标记
     */
    @JsonIgnore
    public void resetBIAggColumnTag(){
        this.reset(FIELD_BIAGGCOLUMNTAG);
    }

    /**
     * 设置 聚合数据列标记
     * <P>
     * 等同 {@link #setBIAggColumnTag}
     * @param bIAggColumnTag
     */
    @JsonIgnore
    public PSSysBIAggColumn biaggcolumntag(String bIAggColumnTag){
        this.setBIAggColumnTag(bIAggColumnTag);
        return this;
    }

    /**
     * <B>BIAGGCOLUMNTAG2</B>&nbsp;聚合数据列标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_BIAGGCOLUMNTAG2 = "biaggcolumntag2";

    /**
     * 设置 聚合数据列标记2
     * 
     * @param bIAggColumnTag2
     * 
     */
    @JsonProperty(FIELD_BIAGGCOLUMNTAG2)
    public void setBIAggColumnTag2(String bIAggColumnTag2){
        this.set(FIELD_BIAGGCOLUMNTAG2, bIAggColumnTag2);
    }
    
    /**
     * 获取 聚合数据列标记2  
     * @return
     */
    @JsonIgnore
    public String getBIAggColumnTag2(){
        Object objValue = this.get(FIELD_BIAGGCOLUMNTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 聚合数据列标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBIAggColumnTag2Dirty(){
        if(this.contains(FIELD_BIAGGCOLUMNTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 聚合数据列标记2
     */
    @JsonIgnore
    public void resetBIAggColumnTag2(){
        this.reset(FIELD_BIAGGCOLUMNTAG2);
    }

    /**
     * 设置 聚合数据列标记2
     * <P>
     * 等同 {@link #setBIAggColumnTag2}
     * @param bIAggColumnTag2
     */
    @JsonIgnore
    public PSSysBIAggColumn biaggcolumntag2(String bIAggColumnTag2){
        this.setBIAggColumnTag2(bIAggColumnTag2);
        return this;
    }

    /**
     * <B>BIAGGCOLUMNTYPE</B>&nbsp;聚合列类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.BIAggColumnType} 
     */
    public final static String FIELD_BIAGGCOLUMNTYPE = "biaggcolumntype";

    /**
     * 设置 聚合列类型
     * 
     * @param bIAggColumnType
     * 
     */
    @JsonProperty(FIELD_BIAGGCOLUMNTYPE)
    public void setBIAggColumnType(String bIAggColumnType){
        this.set(FIELD_BIAGGCOLUMNTYPE, bIAggColumnType);
    }
    
    /**
     * 获取 聚合列类型  
     * @return
     */
    @JsonIgnore
    public String getBIAggColumnType(){
        Object objValue = this.get(FIELD_BIAGGCOLUMNTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 聚合列类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBIAggColumnTypeDirty(){
        if(this.contains(FIELD_BIAGGCOLUMNTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 聚合列类型
     */
    @JsonIgnore
    public void resetBIAggColumnType(){
        this.reset(FIELD_BIAGGCOLUMNTYPE);
    }

    /**
     * 设置 聚合列类型
     * <P>
     * 等同 {@link #setBIAggColumnType}
     * @param bIAggColumnType
     */
    @JsonIgnore
    public PSSysBIAggColumn biaggcolumntype(String bIAggColumnType){
        this.setBIAggColumnType(bIAggColumnType);
        return this;
    }

     /**
     * 设置 聚合列类型
     * <P>
     * 等同 {@link #setBIAggColumnType}
     * @param bIAggColumnType
     */
    @JsonIgnore
    public PSSysBIAggColumn biaggcolumntype(net.ibizsys.psmodel.core.util.PSModelEnums.BIAggColumnType bIAggColumnType){
        if(bIAggColumnType == null){
            this.setBIAggColumnType(null);
        }
        else{
            this.setBIAggColumnType(bIAggColumnType.value);
        }
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码名称
     * <P>
     * 字符串：最大长度 60，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_CODENAME = "codename";

    /**
     * 设置 代码名称
     * 
     * @param codeName
     * 
     */
    @JsonProperty(FIELD_CODENAME)
    public void setCodeName(String codeName){
        this.set(FIELD_CODENAME, codeName);
    }
    
    /**
     * 获取 代码名称  
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
     * 判断 代码名称 是否指定值，包括空值
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
     * 重置 代码名称
     */
    @JsonIgnore
    public void resetCodeName(){
        this.reset(FIELD_CODENAME);
    }

    /**
     * 设置 代码名称
     * <P>
     * 等同 {@link #setCodeName}
     * @param codeName
     */
    @JsonIgnore
    public PSSysBIAggColumn codename(String codeName){
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
    public PSSysBIAggColumn createdate(String createDate){
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
    public PSSysBIAggColumn createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DEFAULTVALUE</B>&nbsp;默认值
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_DEFAULTVALUE = "defaultvalue";

    /**
     * 设置 默认值
     * 
     * @param defaultValue
     * 
     */
    @JsonProperty(FIELD_DEFAULTVALUE)
    public void setDefaultValue(String defaultValue){
        this.set(FIELD_DEFAULTVALUE, defaultValue);
    }
    
    /**
     * 获取 默认值  
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
     * 判断 默认值 是否指定值，包括空值
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
     * 重置 默认值
     */
    @JsonIgnore
    public void resetDefaultValue(){
        this.reset(FIELD_DEFAULTVALUE);
    }

    /**
     * 设置 默认值
     * <P>
     * 等同 {@link #setDefaultValue}
     * @param defaultValue
     */
    @JsonIgnore
    public PSSysBIAggColumn defaultvalue(String defaultValue){
        this.setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <B>DEFAULTVALUETYPE</B>&nbsp;默认值类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEFDefaultValueType} 
     */
    public final static String FIELD_DEFAULTVALUETYPE = "defaultvaluetype";

    /**
     * 设置 默认值类型
     * 
     * @param defaultValueType
     * 
     */
    @JsonProperty(FIELD_DEFAULTVALUETYPE)
    public void setDefaultValueType(String defaultValueType){
        this.set(FIELD_DEFAULTVALUETYPE, defaultValueType);
        //属性名称与代码标识不一致，设置属性名称
        this.set("dvt", defaultValueType);
    }
    
    /**
     * 获取 默认值类型  
     * @return
     */
    @JsonIgnore
    public String getDefaultValueType(){
        Object objValue = this.get(FIELD_DEFAULTVALUETYPE);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("dvt");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 默认值类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefaultValueTypeDirty(){
        if(this.contains(FIELD_DEFAULTVALUETYPE)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("dvt")){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认值类型
     */
    @JsonIgnore
    public void resetDefaultValueType(){
        this.reset(FIELD_DEFAULTVALUETYPE);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("dvt");
    }

    /**
     * 设置 默认值类型
     * <P>
     * 等同 {@link #setDefaultValueType}
     * @param defaultValueType
     */
    @JsonIgnore
    public PSSysBIAggColumn defaultvaluetype(String defaultValueType){
        this.setDefaultValueType(defaultValueType);
        return this;
    }

     /**
     * 设置 默认值类型
     * <P>
     * 等同 {@link #setDefaultValueType}
     * @param defaultValueType
     */
    @JsonIgnore
    public PSSysBIAggColumn defaultvaluetype(net.ibizsys.psmodel.core.util.PSModelEnums.DEFDefaultValueType defaultValueType){
        if(defaultValueType == null){
            this.setDefaultValueType(null);
        }
        else{
            this.setDefaultValueType(defaultValueType.value);
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
    public PSSysBIAggColumn memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSDEFID</B>&nbsp;实体属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_PSDEFID = "psdefid";

    /**
     * 设置 实体属性
     * 
     * @param pSDEFId
     * 
     */
    @JsonProperty(FIELD_PSDEFID)
    public void setPSDEFId(String pSDEFId){
        this.set(FIELD_PSDEFID, pSDEFId);
    }
    
    /**
     * 获取 实体属性  
     * @return
     */
    @JsonIgnore
    public String getPSDEFId(){
        Object objValue = this.get(FIELD_PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFIdDirty(){
        if(this.contains(FIELD_PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体属性
     */
    @JsonIgnore
    public void resetPSDEFId(){
        this.reset(FIELD_PSDEFID);
    }

    /**
     * 设置 实体属性
     * <P>
     * 等同 {@link #setPSDEFId}
     * @param pSDEFId
     */
    @JsonIgnore
    public PSSysBIAggColumn psdefid(String pSDEFId){
        this.setPSDEFId(pSDEFId);
        return this;
    }

    /**
     * 设置 实体属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysBIAggColumn psdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setPSDEFId(null);
            this.setPSDEFName(null);
        }
        else{
            this.setPSDEFId(pSDEField.getPSDEFieldId());
            this.setPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>PSDEFNAME</B>&nbsp;实体属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFID}
     */
    public final static String FIELD_PSDEFNAME = "psdefname";

    /**
     * 设置 实体属性
     * 
     * @param pSDEFName
     * 
     */
    @JsonProperty(FIELD_PSDEFNAME)
    public void setPSDEFName(String pSDEFName){
        this.set(FIELD_PSDEFNAME, pSDEFName);
    }
    
    /**
     * 获取 实体属性  
     * @return
     */
    @JsonIgnore
    public String getPSDEFName(){
        Object objValue = this.get(FIELD_PSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFNameDirty(){
        if(this.contains(FIELD_PSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体属性
     */
    @JsonIgnore
    public void resetPSDEFName(){
        this.reset(FIELD_PSDEFNAME);
    }

    /**
     * 设置 实体属性
     * <P>
     * 等同 {@link #setPSDEFName}
     * @param pSDEFName
     */
    @JsonIgnore
    public PSSysBIAggColumn psdefname(String pSDEFName){
        this.setPSDEFName(pSDEFName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;PSDEID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBIAGGTABLEID}
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 PSDEID
     * 
     * @param pSDEId
     * 
     */
    @JsonProperty(FIELD_PSDEID)
    public void setPSDEId(String pSDEId){
        this.set(FIELD_PSDEID, pSDEId);
    }
    
    /**
     * 获取 PSDEID  
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
     * 判断 PSDEID 是否指定值，包括空值
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
     * 重置 PSDEID
     */
    @JsonIgnore
    public void resetPSDEId(){
        this.reset(FIELD_PSDEID);
    }

    /**
     * 设置 PSDEID
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSSysBIAggColumn psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * <B>PSSYSBIAGGCOLUMNID</B>&nbsp;智能报表聚合数据列标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSBIAGGCOLUMNID = "pssysbiaggcolumnid";

    /**
     * 设置 智能报表聚合数据列标识
     * 
     * @param pSSysBIAggColumnId
     * 
     */
    @JsonProperty(FIELD_PSSYSBIAGGCOLUMNID)
    public void setPSSysBIAggColumnId(String pSSysBIAggColumnId){
        this.set(FIELD_PSSYSBIAGGCOLUMNID, pSSysBIAggColumnId);
    }
    
    /**
     * 获取 智能报表聚合数据列标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysBIAggColumnId(){
        Object objValue = this.get(FIELD_PSSYSBIAGGCOLUMNID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 智能报表聚合数据列标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBIAggColumnIdDirty(){
        if(this.contains(FIELD_PSSYSBIAGGCOLUMNID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 智能报表聚合数据列标识
     */
    @JsonIgnore
    public void resetPSSysBIAggColumnId(){
        this.reset(FIELD_PSSYSBIAGGCOLUMNID);
    }

    /**
     * 设置 智能报表聚合数据列标识
     * <P>
     * 等同 {@link #setPSSysBIAggColumnId}
     * @param pSSysBIAggColumnId
     */
    @JsonIgnore
    public PSSysBIAggColumn pssysbiaggcolumnid(String pSSysBIAggColumnId){
        this.setPSSysBIAggColumnId(pSSysBIAggColumnId);
        return this;
    }

    /**
     * <B>PSSYSBIAGGCOLUMNNAME</B>&nbsp;聚合数据列名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSBIAGGCOLUMNNAME = "pssysbiaggcolumnname";

    /**
     * 设置 聚合数据列名称
     * 
     * @param pSSysBIAggColumnName
     * 
     */
    @JsonProperty(FIELD_PSSYSBIAGGCOLUMNNAME)
    public void setPSSysBIAggColumnName(String pSSysBIAggColumnName){
        this.set(FIELD_PSSYSBIAGGCOLUMNNAME, pSSysBIAggColumnName);
    }
    
    /**
     * 获取 聚合数据列名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysBIAggColumnName(){
        Object objValue = this.get(FIELD_PSSYSBIAGGCOLUMNNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 聚合数据列名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBIAggColumnNameDirty(){
        if(this.contains(FIELD_PSSYSBIAGGCOLUMNNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 聚合数据列名称
     */
    @JsonIgnore
    public void resetPSSysBIAggColumnName(){
        this.reset(FIELD_PSSYSBIAGGCOLUMNNAME);
    }

    /**
     * 设置 聚合数据列名称
     * <P>
     * 等同 {@link #setPSSysBIAggColumnName}
     * @param pSSysBIAggColumnName
     */
    @JsonIgnore
    public PSSysBIAggColumn pssysbiaggcolumnname(String pSSysBIAggColumnName){
        this.setPSSysBIAggColumnName(pSSysBIAggColumnName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysBIAggColumnName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysBIAggColumnName(strName);
    }

    @JsonIgnore
    public PSSysBIAggColumn name(String strName){
        this.setPSSysBIAggColumnName(strName);
        return this;
    }

    /**
     * <B>PSSYSBIAGGTABLEID</B>&nbsp;智能报表聚合数据
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysBIAggTable} 
     */
    public final static String FIELD_PSSYSBIAGGTABLEID = "pssysbiaggtableid";

    /**
     * 设置 智能报表聚合数据
     * 
     * @param pSSysBIAggTableId
     * 
     */
    @JsonProperty(FIELD_PSSYSBIAGGTABLEID)
    public void setPSSysBIAggTableId(String pSSysBIAggTableId){
        this.set(FIELD_PSSYSBIAGGTABLEID, pSSysBIAggTableId);
    }
    
    /**
     * 获取 智能报表聚合数据  
     * @return
     */
    @JsonIgnore
    public String getPSSysBIAggTableId(){
        Object objValue = this.get(FIELD_PSSYSBIAGGTABLEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 智能报表聚合数据 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBIAggTableIdDirty(){
        if(this.contains(FIELD_PSSYSBIAGGTABLEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 智能报表聚合数据
     */
    @JsonIgnore
    public void resetPSSysBIAggTableId(){
        this.reset(FIELD_PSSYSBIAGGTABLEID);
    }

    /**
     * 设置 智能报表聚合数据
     * <P>
     * 等同 {@link #setPSSysBIAggTableId}
     * @param pSSysBIAggTableId
     */
    @JsonIgnore
    public PSSysBIAggColumn pssysbiaggtableid(String pSSysBIAggTableId){
        this.setPSSysBIAggTableId(pSSysBIAggTableId);
        return this;
    }

    /**
     * 设置 智能报表聚合数据，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysBIAggTableId}
     * @param pSSysBIAggTable 引用对象
     */
    @JsonIgnore
    public PSSysBIAggColumn pssysbiaggtableid(PSSysBIAggTable pSSysBIAggTable){
        if(pSSysBIAggTable == null){
            this.setPSDEId(null);
            this.setPSSysBIAggTableId(null);
            this.setPSSysBIAggTableName(null);
            this.setPSSysBICubeId(null);
        }
        else{
            this.setPSDEId(pSSysBIAggTable.getPSDEId());
            this.setPSSysBIAggTableId(pSSysBIAggTable.getPSSysBIAggTableId());
            this.setPSSysBIAggTableName(pSSysBIAggTable.getPSSysBIAggTableName());
            this.setPSSysBICubeId(pSSysBIAggTable.getPSSysBICubeId());
        }
        return this;
    }

    /**
     * <B>PSSYSBIAGGTABLENAME</B>&nbsp;智能报表聚合数据
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBIAGGTABLEID}
     */
    public final static String FIELD_PSSYSBIAGGTABLENAME = "pssysbiaggtablename";

    /**
     * 设置 智能报表聚合数据
     * 
     * @param pSSysBIAggTableName
     * 
     */
    @JsonProperty(FIELD_PSSYSBIAGGTABLENAME)
    public void setPSSysBIAggTableName(String pSSysBIAggTableName){
        this.set(FIELD_PSSYSBIAGGTABLENAME, pSSysBIAggTableName);
    }
    
    /**
     * 获取 智能报表聚合数据  
     * @return
     */
    @JsonIgnore
    public String getPSSysBIAggTableName(){
        Object objValue = this.get(FIELD_PSSYSBIAGGTABLENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 智能报表聚合数据 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBIAggTableNameDirty(){
        if(this.contains(FIELD_PSSYSBIAGGTABLENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 智能报表聚合数据
     */
    @JsonIgnore
    public void resetPSSysBIAggTableName(){
        this.reset(FIELD_PSSYSBIAGGTABLENAME);
    }

    /**
     * 设置 智能报表聚合数据
     * <P>
     * 等同 {@link #setPSSysBIAggTableName}
     * @param pSSysBIAggTableName
     */
    @JsonIgnore
    public PSSysBIAggColumn pssysbiaggtablename(String pSSysBIAggTableName){
        this.setPSSysBIAggTableName(pSSysBIAggTableName);
        return this;
    }

    /**
     * <B>PSSYSBICUBEDIMENSIONID</B>&nbsp;智能报表立方体维度
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysBICubeDimension} 
     */
    public final static String FIELD_PSSYSBICUBEDIMENSIONID = "pssysbicubedimensionid";

    /**
     * 设置 智能报表立方体维度
     * 
     * @param pSSysBICubeDimensionId
     * 
     */
    @JsonProperty(FIELD_PSSYSBICUBEDIMENSIONID)
    public void setPSSysBICubeDimensionId(String pSSysBICubeDimensionId){
        this.set(FIELD_PSSYSBICUBEDIMENSIONID, pSSysBICubeDimensionId);
    }
    
    /**
     * 获取 智能报表立方体维度  
     * @return
     */
    @JsonIgnore
    public String getPSSysBICubeDimensionId(){
        Object objValue = this.get(FIELD_PSSYSBICUBEDIMENSIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 智能报表立方体维度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBICubeDimensionIdDirty(){
        if(this.contains(FIELD_PSSYSBICUBEDIMENSIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 智能报表立方体维度
     */
    @JsonIgnore
    public void resetPSSysBICubeDimensionId(){
        this.reset(FIELD_PSSYSBICUBEDIMENSIONID);
    }

    /**
     * 设置 智能报表立方体维度
     * <P>
     * 等同 {@link #setPSSysBICubeDimensionId}
     * @param pSSysBICubeDimensionId
     */
    @JsonIgnore
    public PSSysBIAggColumn pssysbicubedimensionid(String pSSysBICubeDimensionId){
        this.setPSSysBICubeDimensionId(pSSysBICubeDimensionId);
        return this;
    }

    /**
     * 设置 智能报表立方体维度，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysBICubeDimensionId}
     * @param pSSysBICubeDimension 引用对象
     */
    @JsonIgnore
    public PSSysBIAggColumn pssysbicubedimensionid(PSSysBICubeDimension pSSysBICubeDimension){
        if(pSSysBICubeDimension == null){
            this.setPSSysBICubeDimensionId(null);
            this.setPSSysBICubeDimensionName(null);
        }
        else{
            this.setPSSysBICubeDimensionId(pSSysBICubeDimension.getPSSysBICubeDimensionId());
            this.setPSSysBICubeDimensionName(pSSysBICubeDimension.getPSSysBICubeDimensionName());
        }
        return this;
    }

    /**
     * <B>PSSYSBICUBEDIMENSIONNAME</B>&nbsp;立方体维度
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBICUBEDIMENSIONID}
     */
    public final static String FIELD_PSSYSBICUBEDIMENSIONNAME = "pssysbicubedimensionname";

    /**
     * 设置 立方体维度
     * 
     * @param pSSysBICubeDimensionName
     * 
     */
    @JsonProperty(FIELD_PSSYSBICUBEDIMENSIONNAME)
    public void setPSSysBICubeDimensionName(String pSSysBICubeDimensionName){
        this.set(FIELD_PSSYSBICUBEDIMENSIONNAME, pSSysBICubeDimensionName);
    }
    
    /**
     * 获取 立方体维度  
     * @return
     */
    @JsonIgnore
    public String getPSSysBICubeDimensionName(){
        Object objValue = this.get(FIELD_PSSYSBICUBEDIMENSIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 立方体维度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBICubeDimensionNameDirty(){
        if(this.contains(FIELD_PSSYSBICUBEDIMENSIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 立方体维度
     */
    @JsonIgnore
    public void resetPSSysBICubeDimensionName(){
        this.reset(FIELD_PSSYSBICUBEDIMENSIONNAME);
    }

    /**
     * 设置 立方体维度
     * <P>
     * 等同 {@link #setPSSysBICubeDimensionName}
     * @param pSSysBICubeDimensionName
     */
    @JsonIgnore
    public PSSysBIAggColumn pssysbicubedimensionname(String pSSysBICubeDimensionName){
        this.setPSSysBICubeDimensionName(pSSysBICubeDimensionName);
        return this;
    }

    /**
     * <B>PSSYSBICUBEID</B>&nbsp;PSSYSBICUBEID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBIAGGTABLEID}
     */
    public final static String FIELD_PSSYSBICUBEID = "pssysbicubeid";

    /**
     * 设置 PSSYSBICUBEID
     * 
     * @param pSSysBICubeId
     * 
     */
    @JsonProperty(FIELD_PSSYSBICUBEID)
    public void setPSSysBICubeId(String pSSysBICubeId){
        this.set(FIELD_PSSYSBICUBEID, pSSysBICubeId);
    }
    
    /**
     * 获取 PSSYSBICUBEID  
     * @return
     */
    @JsonIgnore
    public String getPSSysBICubeId(){
        Object objValue = this.get(FIELD_PSSYSBICUBEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 PSSYSBICUBEID 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBICubeIdDirty(){
        if(this.contains(FIELD_PSSYSBICUBEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 PSSYSBICUBEID
     */
    @JsonIgnore
    public void resetPSSysBICubeId(){
        this.reset(FIELD_PSSYSBICUBEID);
    }

    /**
     * 设置 PSSYSBICUBEID
     * <P>
     * 等同 {@link #setPSSysBICubeId}
     * @param pSSysBICubeId
     */
    @JsonIgnore
    public PSSysBIAggColumn pssysbicubeid(String pSSysBICubeId){
        this.setPSSysBICubeId(pSSysBICubeId);
        return this;
    }

    /**
     * <B>PSSYSBICUBELEVELID</B>&nbsp;维度层级
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysBICubeLevel} 
     */
    public final static String FIELD_PSSYSBICUBELEVELID = "pssysbicubelevelid";

    /**
     * 设置 维度层级
     * 
     * @param pSSysBICubeLevelId
     * 
     */
    @JsonProperty(FIELD_PSSYSBICUBELEVELID)
    public void setPSSysBICubeLevelId(String pSSysBICubeLevelId){
        this.set(FIELD_PSSYSBICUBELEVELID, pSSysBICubeLevelId);
    }
    
    /**
     * 获取 维度层级  
     * @return
     */
    @JsonIgnore
    public String getPSSysBICubeLevelId(){
        Object objValue = this.get(FIELD_PSSYSBICUBELEVELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 维度层级 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBICubeLevelIdDirty(){
        if(this.contains(FIELD_PSSYSBICUBELEVELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 维度层级
     */
    @JsonIgnore
    public void resetPSSysBICubeLevelId(){
        this.reset(FIELD_PSSYSBICUBELEVELID);
    }

    /**
     * 设置 维度层级
     * <P>
     * 等同 {@link #setPSSysBICubeLevelId}
     * @param pSSysBICubeLevelId
     */
    @JsonIgnore
    public PSSysBIAggColumn pssysbicubelevelid(String pSSysBICubeLevelId){
        this.setPSSysBICubeLevelId(pSSysBICubeLevelId);
        return this;
    }

    /**
     * 设置 维度层级，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysBICubeLevelId}
     * @param pSSysBICubeLevel 引用对象
     */
    @JsonIgnore
    public PSSysBIAggColumn pssysbicubelevelid(PSSysBICubeLevel pSSysBICubeLevel){
        if(pSSysBICubeLevel == null){
            this.setPSSysBICubeLevelId(null);
            this.setPSSysBICubeLevelName(null);
        }
        else{
            this.setPSSysBICubeLevelId(pSSysBICubeLevel.getPSSysBICubeLevelId());
            this.setPSSysBICubeLevelName(pSSysBICubeLevel.getPSSysBICubeLevelName());
        }
        return this;
    }

    /**
     * <B>PSSYSBICUBELEVELNAME</B>&nbsp;维度层级
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBICUBELEVELID}
     */
    public final static String FIELD_PSSYSBICUBELEVELNAME = "pssysbicubelevelname";

    /**
     * 设置 维度层级
     * 
     * @param pSSysBICubeLevelName
     * 
     */
    @JsonProperty(FIELD_PSSYSBICUBELEVELNAME)
    public void setPSSysBICubeLevelName(String pSSysBICubeLevelName){
        this.set(FIELD_PSSYSBICUBELEVELNAME, pSSysBICubeLevelName);
    }
    
    /**
     * 获取 维度层级  
     * @return
     */
    @JsonIgnore
    public String getPSSysBICubeLevelName(){
        Object objValue = this.get(FIELD_PSSYSBICUBELEVELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 维度层级 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBICubeLevelNameDirty(){
        if(this.contains(FIELD_PSSYSBICUBELEVELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 维度层级
     */
    @JsonIgnore
    public void resetPSSysBICubeLevelName(){
        this.reset(FIELD_PSSYSBICUBELEVELNAME);
    }

    /**
     * 设置 维度层级
     * <P>
     * 等同 {@link #setPSSysBICubeLevelName}
     * @param pSSysBICubeLevelName
     */
    @JsonIgnore
    public PSSysBIAggColumn pssysbicubelevelname(String pSSysBICubeLevelName){
        this.setPSSysBICubeLevelName(pSSysBICubeLevelName);
        return this;
    }

    /**
     * <B>PSSYSBICUBEMEASUREID</B>&nbsp;立方体指标
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysBICubeMeasure} 
     */
    public final static String FIELD_PSSYSBICUBEMEASUREID = "pssysbicubemeasureid";

    /**
     * 设置 立方体指标
     * 
     * @param pSSysBICubeMeasureId
     * 
     */
    @JsonProperty(FIELD_PSSYSBICUBEMEASUREID)
    public void setPSSysBICubeMeasureId(String pSSysBICubeMeasureId){
        this.set(FIELD_PSSYSBICUBEMEASUREID, pSSysBICubeMeasureId);
    }
    
    /**
     * 获取 立方体指标  
     * @return
     */
    @JsonIgnore
    public String getPSSysBICubeMeasureId(){
        Object objValue = this.get(FIELD_PSSYSBICUBEMEASUREID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 立方体指标 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBICubeMeasureIdDirty(){
        if(this.contains(FIELD_PSSYSBICUBEMEASUREID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 立方体指标
     */
    @JsonIgnore
    public void resetPSSysBICubeMeasureId(){
        this.reset(FIELD_PSSYSBICUBEMEASUREID);
    }

    /**
     * 设置 立方体指标
     * <P>
     * 等同 {@link #setPSSysBICubeMeasureId}
     * @param pSSysBICubeMeasureId
     */
    @JsonIgnore
    public PSSysBIAggColumn pssysbicubemeasureid(String pSSysBICubeMeasureId){
        this.setPSSysBICubeMeasureId(pSSysBICubeMeasureId);
        return this;
    }

    /**
     * 设置 立方体指标，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysBICubeMeasureId}
     * @param pSSysBICubeMeasure 引用对象
     */
    @JsonIgnore
    public PSSysBIAggColumn pssysbicubemeasureid(PSSysBICubeMeasure pSSysBICubeMeasure){
        if(pSSysBICubeMeasure == null){
            this.setPSSysBICubeMeasureId(null);
            this.setPSSysBICubeMeasureName(null);
        }
        else{
            this.setPSSysBICubeMeasureId(pSSysBICubeMeasure.getPSSysBICubeMeasureId());
            this.setPSSysBICubeMeasureName(pSSysBICubeMeasure.getPSSysBICubeMeasureName());
        }
        return this;
    }

    /**
     * <B>PSSYSBICUBEMEASURENAME</B>&nbsp;立方体指标
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBICUBEMEASUREID}
     */
    public final static String FIELD_PSSYSBICUBEMEASURENAME = "pssysbicubemeasurename";

    /**
     * 设置 立方体指标
     * 
     * @param pSSysBICubeMeasureName
     * 
     */
    @JsonProperty(FIELD_PSSYSBICUBEMEASURENAME)
    public void setPSSysBICubeMeasureName(String pSSysBICubeMeasureName){
        this.set(FIELD_PSSYSBICUBEMEASURENAME, pSSysBICubeMeasureName);
    }
    
    /**
     * 获取 立方体指标  
     * @return
     */
    @JsonIgnore
    public String getPSSysBICubeMeasureName(){
        Object objValue = this.get(FIELD_PSSYSBICUBEMEASURENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 立方体指标 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBICubeMeasureNameDirty(){
        if(this.contains(FIELD_PSSYSBICUBEMEASURENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 立方体指标
     */
    @JsonIgnore
    public void resetPSSysBICubeMeasureName(){
        this.reset(FIELD_PSSYSBICUBEMEASURENAME);
    }

    /**
     * 设置 立方体指标
     * <P>
     * 等同 {@link #setPSSysBICubeMeasureName}
     * @param pSSysBICubeMeasureName
     */
    @JsonIgnore
    public PSSysBIAggColumn pssysbicubemeasurename(String pSSysBICubeMeasureName){
        this.setPSSysBICubeMeasureName(pSSysBICubeMeasureName);
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
    public PSSysBIAggColumn updatedate(String updateDate){
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
    public PSSysBIAggColumn updateman(String updateMan){
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
    public PSSysBIAggColumn usercat(String userCat){
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
    public PSSysBIAggColumn usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysBIAggColumn usertag(String userTag){
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
    public PSSysBIAggColumn usertag2(String userTag2){
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
    public PSSysBIAggColumn usertag3(String userTag3){
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
    public PSSysBIAggColumn usertag4(String userTag4){
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
    public PSSysBIAggColumn validflag(Integer validFlag){
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
    public PSSysBIAggColumn validflag(Boolean validFlag){
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
        return this.getPSSysBIAggColumnId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysBIAggColumnId(strValue);
    }

    @JsonIgnore
    public PSSysBIAggColumn id(String strValue){
        this.setPSSysBIAggColumnId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysBIAggColumn){
            PSSysBIAggColumn model = (PSSysBIAggColumn)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
