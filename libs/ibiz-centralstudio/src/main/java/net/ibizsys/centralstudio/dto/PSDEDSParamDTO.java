package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEDSPARAM</B>实体数据集合参数 模型传输对象
 * <P>
 * 实体数据集参数模型，定义行为的调用参数以及参数的取值等逻辑
 */
public class PSDEDSParamDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSDEDSParamDTO(){
    }      

    /**
     * <B>ALLOWEMPTY</B>&nbsp;允许为空
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ALLOWEMPTY = "allowempty";

    /**
     * 设置 允许为空
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
     * 设置 允许为空
     * <P>
     * 等同 {@link #setAllowEmpty}
     * @param allowEmpty
     */
    @JsonIgnore
    public PSDEDSParamDTO allowempty(Integer allowEmpty){
        this.setAllowEmpty(allowEmpty);
        return this;
    }

     /**
     * 设置 允许为空
     * <P>
     * 等同 {@link #setAllowEmpty}
     * @param allowEmpty
     */
    @JsonIgnore
    public PSDEDSParamDTO allowempty(Boolean allowEmpty){
        if(allowEmpty == null){
            this.setAllowEmpty(null);
        }
        else{
            this.setAllowEmpty(allowEmpty?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ARRAYFLAG</B>&nbsp;是否数组
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ARRAYFLAG = "arrayflag";

    /**
     * 设置 是否数组
     * 
     * @param arrayFlag
     * 
     */
    @JsonProperty(FIELD_ARRAYFLAG)
    public void setArrayFlag(Integer arrayFlag){
        this.set(FIELD_ARRAYFLAG, arrayFlag);
    }
    
    /**
     * 获取 是否数组  
     * @return
     */
    @JsonIgnore
    public Integer getArrayFlag(){
        Object objValue = this.get(FIELD_ARRAYFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 是否数组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isArrayFlagDirty(){
        if(this.contains(FIELD_ARRAYFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 是否数组
     */
    @JsonIgnore
    public void resetArrayFlag(){
        this.reset(FIELD_ARRAYFLAG);
    }

    /**
     * 设置 是否数组
     * <P>
     * 等同 {@link #setArrayFlag}
     * @param arrayFlag
     */
    @JsonIgnore
    public PSDEDSParamDTO arrayflag(Integer arrayFlag){
        this.setArrayFlag(arrayFlag);
        return this;
    }

     /**
     * 设置 是否数组
     * <P>
     * 等同 {@link #setArrayFlag}
     * @param arrayFlag
     */
    @JsonIgnore
    public PSDEDSParamDTO arrayflag(Boolean arrayFlag){
        if(arrayFlag == null){
            this.setArrayFlag(null);
        }
        else{
            this.setArrayFlag(arrayFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码名称
     * <P>
     * 字符串：最大长度 50，由字母、数字、下划线组成，且开始必须为字母
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
    public PSDEDSParamDTO codename(String codeName){
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
    public PSDEDSParamDTO createdate(Timestamp createDate){
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
    public PSDEDSParamDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>JSONFORMAT</B>&nbsp;Json格式化
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_JSONFORMAT = "jsonformat";

    /**
     * 设置 Json格式化
     * 
     * @param jsonFormat
     * 
     */
    @JsonProperty(FIELD_JSONFORMAT)
    public void setJsonFormat(String jsonFormat){
        this.set(FIELD_JSONFORMAT, jsonFormat);
    }
    
    /**
     * 获取 Json格式化  
     * @return
     */
    @JsonIgnore
    public String getJsonFormat(){
        Object objValue = this.get(FIELD_JSONFORMAT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 Json格式化 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isJsonFormatDirty(){
        if(this.contains(FIELD_JSONFORMAT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 Json格式化
     */
    @JsonIgnore
    public void resetJsonFormat(){
        this.reset(FIELD_JSONFORMAT);
    }

    /**
     * 设置 Json格式化
     * <P>
     * 等同 {@link #setJsonFormat}
     * @param jsonFormat
     */
    @JsonIgnore
    public PSDEDSParamDTO jsonformat(String jsonFormat){
        this.setJsonFormat(jsonFormat);
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
    public PSDEDSParamDTO memo(String memo){
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
    public PSDEDSParamDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PARAMDESC</B>&nbsp;参数说明
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PARAMDESC = "paramdesc";

    /**
     * 设置 参数说明
     * 
     * @param paramDesc
     * 
     */
    @JsonProperty(FIELD_PARAMDESC)
    public void setParamDesc(String paramDesc){
        this.set(FIELD_PARAMDESC, paramDesc);
    }
    
    /**
     * 获取 参数说明  
     * @return
     */
    @JsonIgnore
    public String getParamDesc(){
        Object objValue = this.get(FIELD_PARAMDESC);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数说明 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamDescDirty(){
        if(this.contains(FIELD_PARAMDESC)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数说明
     */
    @JsonIgnore
    public void resetParamDesc(){
        this.reset(FIELD_PARAMDESC);
    }

    /**
     * 设置 参数说明
     * <P>
     * 等同 {@link #setParamDesc}
     * @param paramDesc
     */
    @JsonIgnore
    public PSDEDSParamDTO paramdesc(String paramDesc){
        this.setParamDesc(paramDesc);
        return this;
    }

    /**
     * <B>PARAMTAG</B>&nbsp;参数标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PARAMTAG = "paramtag";

    /**
     * 设置 参数标记
     * 
     * @param paramTag
     * 
     */
    @JsonProperty(FIELD_PARAMTAG)
    public void setParamTag(String paramTag){
        this.set(FIELD_PARAMTAG, paramTag);
    }
    
    /**
     * 获取 参数标记  
     * @return
     */
    @JsonIgnore
    public String getParamTag(){
        Object objValue = this.get(FIELD_PARAMTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamTagDirty(){
        if(this.contains(FIELD_PARAMTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数标记
     */
    @JsonIgnore
    public void resetParamTag(){
        this.reset(FIELD_PARAMTAG);
    }

    /**
     * 设置 参数标记
     * <P>
     * 等同 {@link #setParamTag}
     * @param paramTag
     */
    @JsonIgnore
    public PSDEDSParamDTO paramtag(String paramTag){
        this.setParamTag(paramTag);
        return this;
    }

    /**
     * <B>PARAMTAG2</B>&nbsp;参数标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PARAMTAG2 = "paramtag2";

    /**
     * 设置 参数标记2
     * 
     * @param paramTag2
     * 
     */
    @JsonProperty(FIELD_PARAMTAG2)
    public void setParamTag2(String paramTag2){
        this.set(FIELD_PARAMTAG2, paramTag2);
    }
    
    /**
     * 获取 参数标记2  
     * @return
     */
    @JsonIgnore
    public String getParamTag2(){
        Object objValue = this.get(FIELD_PARAMTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamTag2Dirty(){
        if(this.contains(FIELD_PARAMTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数标记2
     */
    @JsonIgnore
    public void resetParamTag2(){
        this.reset(FIELD_PARAMTAG2);
    }

    /**
     * 设置 参数标记2
     * <P>
     * 等同 {@link #setParamTag2}
     * @param paramTag2
     */
    @JsonIgnore
    public PSDEDSParamDTO paramtag2(String paramTag2){
        this.setParamTag2(paramTag2);
        return this;
    }

    /**
     * <B>PSDEDSID</B>&nbsp;实体数据集
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO} 
     */
    public final static String FIELD_PSDEDSID = "psdedsid";

    /**
     * 设置 实体数据集
     * 
     * @param pSDEDSId
     * 
     */
    @JsonProperty(FIELD_PSDEDSID)
    public void setPSDEDSId(String pSDEDSId){
        this.set(FIELD_PSDEDSID, pSDEDSId);
    }
    
    /**
     * 获取 实体数据集  
     * @return
     */
    @JsonIgnore
    public String getPSDEDSId(){
        Object objValue = this.get(FIELD_PSDEDSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDSIdDirty(){
        if(this.contains(FIELD_PSDEDSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据集
     */
    @JsonIgnore
    public void resetPSDEDSId(){
        this.reset(FIELD_PSDEDSID);
    }

    /**
     * 设置 实体数据集
     * <P>
     * 等同 {@link #setPSDEDSId}
     * @param pSDEDSId
     */
    @JsonIgnore
    public PSDEDSParamDTO psdedsid(String pSDEDSId){
        this.setPSDEDSId(pSDEDSId);
        return this;
    }

    /**
     * 设置 实体数据集，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDSId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSDEDSParamDTO psdedsid(PSDEDataSetDTO pSDEDataSet){
        if(pSDEDataSet == null){
            this.setPSDEDSId(null);
            this.setPSDEDSName(null);
            this.setPSDEId(null);
        }
        else{
            this.setPSDEDSId(pSDEDataSet.getPSDEDataSetId());
            this.setPSDEDSName(pSDEDataSet.getPSDEDataSetName());
            this.setPSDEId(pSDEDataSet.getPSDEId());
        }
        return this;
    }

    /**
     * <B>PSDEDSNAME</B>&nbsp;实体数据集
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDSID}
     */
    public final static String FIELD_PSDEDSNAME = "psdedsname";

    /**
     * 设置 实体数据集
     * 
     * @param pSDEDSName
     * 
     */
    @JsonProperty(FIELD_PSDEDSNAME)
    public void setPSDEDSName(String pSDEDSName){
        this.set(FIELD_PSDEDSNAME, pSDEDSName);
    }
    
    /**
     * 获取 实体数据集  
     * @return
     */
    @JsonIgnore
    public String getPSDEDSName(){
        Object objValue = this.get(FIELD_PSDEDSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDSNameDirty(){
        if(this.contains(FIELD_PSDEDSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据集
     */
    @JsonIgnore
    public void resetPSDEDSName(){
        this.reset(FIELD_PSDEDSNAME);
    }

    /**
     * 设置 实体数据集
     * <P>
     * 等同 {@link #setPSDEDSName}
     * @param pSDEDSName
     */
    @JsonIgnore
    public PSDEDSParamDTO psdedsname(String pSDEDSName){
        this.setPSDEDSName(pSDEDSName);
        return this;
    }

    /**
     * <B>PSDEDSPARAMID</B>&nbsp;实体数据集合参数标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEDSPARAMID = "psdedsparamid";

    /**
     * 设置 实体数据集合参数标识
     * 
     * @param pSDEDSParamId
     * 
     */
    @JsonProperty(FIELD_PSDEDSPARAMID)
    public void setPSDEDSParamId(String pSDEDSParamId){
        this.set(FIELD_PSDEDSPARAMID, pSDEDSParamId);
    }
    
    /**
     * 获取 实体数据集合参数标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEDSParamId(){
        Object objValue = this.get(FIELD_PSDEDSPARAMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据集合参数标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDSParamIdDirty(){
        if(this.contains(FIELD_PSDEDSPARAMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据集合参数标识
     */
    @JsonIgnore
    public void resetPSDEDSParamId(){
        this.reset(FIELD_PSDEDSPARAMID);
    }

    /**
     * 设置 实体数据集合参数标识
     * <P>
     * 等同 {@link #setPSDEDSParamId}
     * @param pSDEDSParamId
     */
    @JsonIgnore
    public PSDEDSParamDTO psdedsparamid(String pSDEDSParamId){
        this.setPSDEDSParamId(pSDEDSParamId);
        return this;
    }

    /**
     * <B>PSDEDSPARAMNAME</B>&nbsp;参数标识
     * <P>
     * 字符串：最大长度 200，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSDEDSPARAMNAME = "psdedsparamname";

    /**
     * 设置 参数标识
     * 
     * @param pSDEDSParamName
     * 
     */
    @JsonProperty(FIELD_PSDEDSPARAMNAME)
    public void setPSDEDSParamName(String pSDEDSParamName){
        this.set(FIELD_PSDEDSPARAMNAME, pSDEDSParamName);
    }
    
    /**
     * 获取 参数标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEDSParamName(){
        Object objValue = this.get(FIELD_PSDEDSPARAMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDSParamNameDirty(){
        if(this.contains(FIELD_PSDEDSPARAMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数标识
     */
    @JsonIgnore
    public void resetPSDEDSParamName(){
        this.reset(FIELD_PSDEDSPARAMNAME);
    }

    /**
     * 设置 参数标识
     * <P>
     * 等同 {@link #setPSDEDSParamName}
     * @param pSDEDSParamName
     */
    @JsonIgnore
    public PSDEDSParamDTO psdedsparamname(String pSDEDSParamName){
        this.setPSDEDSParamName(pSDEDSParamName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEDSParamName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEDSParamName(strName);
    }

    @JsonIgnore
    public PSDEDSParamDTO name(String strName){
        this.setPSDEDSParamName(strName);
        return this;
    }

    /**
     * <B>PSDEFSFITEMID</B>&nbsp;属性搜索模式
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFSFItemDTO} 
     */
    public final static String FIELD_PSDEFSFITEMID = "psdefsfitemid";

    /**
     * 设置 属性搜索模式
     * 
     * @param pSDEFSFItemId
     * 
     */
    @JsonProperty(FIELD_PSDEFSFITEMID)
    public void setPSDEFSFItemId(String pSDEFSFItemId){
        this.set(FIELD_PSDEFSFITEMID, pSDEFSFItemId);
    }
    
    /**
     * 获取 属性搜索模式  
     * @return
     */
    @JsonIgnore
    public String getPSDEFSFItemId(){
        Object objValue = this.get(FIELD_PSDEFSFITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性搜索模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFSFItemIdDirty(){
        if(this.contains(FIELD_PSDEFSFITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性搜索模式
     */
    @JsonIgnore
    public void resetPSDEFSFItemId(){
        this.reset(FIELD_PSDEFSFITEMID);
    }

    /**
     * 设置 属性搜索模式
     * <P>
     * 等同 {@link #setPSDEFSFItemId}
     * @param pSDEFSFItemId
     */
    @JsonIgnore
    public PSDEDSParamDTO psdefsfitemid(String pSDEFSFItemId){
        this.setPSDEFSFItemId(pSDEFSFItemId);
        return this;
    }

    /**
     * 设置 属性搜索模式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEFSFItemId}
     * @param pSDEFSFItem 引用对象
     */
    @JsonIgnore
    public PSDEDSParamDTO psdefsfitemid(PSDEFSFItemDTO pSDEFSFItem){
        if(pSDEFSFItem == null){
            this.setPSDEFSFItemId(null);
            this.setPSDEFSFItemName(null);
        }
        else{
            this.setPSDEFSFItemId(pSDEFSFItem.getPSDEFSFItemId());
            this.setPSDEFSFItemName(pSDEFSFItem.getPSDEFSFItemName());
        }
        return this;
    }

    /**
     * <B>PSDEFSFITEMNAME</B>&nbsp;属性搜索模式
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFSFITEMID}
     */
    public final static String FIELD_PSDEFSFITEMNAME = "psdefsfitemname";

    /**
     * 设置 属性搜索模式
     * 
     * @param pSDEFSFItemName
     * 
     */
    @JsonProperty(FIELD_PSDEFSFITEMNAME)
    public void setPSDEFSFItemName(String pSDEFSFItemName){
        this.set(FIELD_PSDEFSFITEMNAME, pSDEFSFItemName);
    }
    
    /**
     * 获取 属性搜索模式  
     * @return
     */
    @JsonIgnore
    public String getPSDEFSFItemName(){
        Object objValue = this.get(FIELD_PSDEFSFITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性搜索模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFSFItemNameDirty(){
        if(this.contains(FIELD_PSDEFSFITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性搜索模式
     */
    @JsonIgnore
    public void resetPSDEFSFItemName(){
        this.reset(FIELD_PSDEFSFITEMNAME);
    }

    /**
     * 设置 属性搜索模式
     * <P>
     * 等同 {@link #setPSDEFSFItemName}
     * @param pSDEFSFItemName
     */
    @JsonIgnore
    public PSDEDSParamDTO psdefsfitemname(String pSDEFSFItemName){
        this.setPSDEFSFItemName(pSDEFSFItemName);
        return this;
    }

    /**
     * <B>PSDEFVALUERULEID</B>&nbsp;属性值规则
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFValueRuleDTO} 
     */
    public final static String FIELD_PSDEFVALUERULEID = "psdefvalueruleid";

    /**
     * 设置 属性值规则
     * 
     * @param pSDEFValueRuleId
     * 
     */
    @JsonProperty(FIELD_PSDEFVALUERULEID)
    public void setPSDEFValueRuleId(String pSDEFValueRuleId){
        this.set(FIELD_PSDEFVALUERULEID, pSDEFValueRuleId);
    }
    
    /**
     * 获取 属性值规则  
     * @return
     */
    @JsonIgnore
    public String getPSDEFValueRuleId(){
        Object objValue = this.get(FIELD_PSDEFVALUERULEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性值规则 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFValueRuleIdDirty(){
        if(this.contains(FIELD_PSDEFVALUERULEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性值规则
     */
    @JsonIgnore
    public void resetPSDEFValueRuleId(){
        this.reset(FIELD_PSDEFVALUERULEID);
    }

    /**
     * 设置 属性值规则
     * <P>
     * 等同 {@link #setPSDEFValueRuleId}
     * @param pSDEFValueRuleId
     */
    @JsonIgnore
    public PSDEDSParamDTO psdefvalueruleid(String pSDEFValueRuleId){
        this.setPSDEFValueRuleId(pSDEFValueRuleId);
        return this;
    }

    /**
     * 设置 属性值规则，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEFValueRuleId}
     * @param pSDEFValueRule 引用对象
     */
    @JsonIgnore
    public PSDEDSParamDTO psdefvalueruleid(PSDEFValueRuleDTO pSDEFValueRule){
        if(pSDEFValueRule == null){
            this.setPSDEFValueRuleId(null);
            this.setPSDEFValueRuleName(null);
        }
        else{
            this.setPSDEFValueRuleId(pSDEFValueRule.getPSDEFValueRuleId());
            this.setPSDEFValueRuleName(pSDEFValueRule.getPSDEFValueRuleName());
        }
        return this;
    }

    /**
     * <B>PSDEFVALUERULENAME</B>&nbsp;属性值规则
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFVALUERULEID}
     */
    public final static String FIELD_PSDEFVALUERULENAME = "psdefvaluerulename";

    /**
     * 设置 属性值规则
     * 
     * @param pSDEFValueRuleName
     * 
     */
    @JsonProperty(FIELD_PSDEFVALUERULENAME)
    public void setPSDEFValueRuleName(String pSDEFValueRuleName){
        this.set(FIELD_PSDEFVALUERULENAME, pSDEFValueRuleName);
    }
    
    /**
     * 获取 属性值规则  
     * @return
     */
    @JsonIgnore
    public String getPSDEFValueRuleName(){
        Object objValue = this.get(FIELD_PSDEFVALUERULENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性值规则 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFValueRuleNameDirty(){
        if(this.contains(FIELD_PSDEFVALUERULENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性值规则
     */
    @JsonIgnore
    public void resetPSDEFValueRuleName(){
        this.reset(FIELD_PSDEFVALUERULENAME);
    }

    /**
     * 设置 属性值规则
     * <P>
     * 等同 {@link #setPSDEFValueRuleName}
     * @param pSDEFValueRuleName
     */
    @JsonIgnore
    public PSDEDSParamDTO psdefvaluerulename(String pSDEFValueRuleName){
        this.setPSDEFValueRuleName(pSDEFValueRuleName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;PSDEID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDSID}
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
    public PSDEDSParamDTO psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * <B>PSSYSVALUERULEID</B>&nbsp;值规则
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysValueRuleDTO} 
     */
    public final static String FIELD_PSSYSVALUERULEID = "pssysvalueruleid";

    /**
     * 设置 值规则
     * 
     * @param pSSysValueRuleId
     * 
     */
    @JsonProperty(FIELD_PSSYSVALUERULEID)
    public void setPSSysValueRuleId(String pSSysValueRuleId){
        this.set(FIELD_PSSYSVALUERULEID, pSSysValueRuleId);
    }
    
    /**
     * 获取 值规则  
     * @return
     */
    @JsonIgnore
    public String getPSSysValueRuleId(){
        Object objValue = this.get(FIELD_PSSYSVALUERULEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值规则 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysValueRuleIdDirty(){
        if(this.contains(FIELD_PSSYSVALUERULEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值规则
     */
    @JsonIgnore
    public void resetPSSysValueRuleId(){
        this.reset(FIELD_PSSYSVALUERULEID);
    }

    /**
     * 设置 值规则
     * <P>
     * 等同 {@link #setPSSysValueRuleId}
     * @param pSSysValueRuleId
     */
    @JsonIgnore
    public PSDEDSParamDTO pssysvalueruleid(String pSSysValueRuleId){
        this.setPSSysValueRuleId(pSSysValueRuleId);
        return this;
    }

    /**
     * 设置 值规则，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysValueRuleId}
     * @param pSSysValueRule 引用对象
     */
    @JsonIgnore
    public PSDEDSParamDTO pssysvalueruleid(PSSysValueRuleDTO pSSysValueRule){
        if(pSSysValueRule == null){
            this.setPSSysValueRuleId(null);
            this.setPSSysValueRuleName(null);
        }
        else{
            this.setPSSysValueRuleId(pSSysValueRule.getPSSysValueRuleId());
            this.setPSSysValueRuleName(pSSysValueRule.getPSSysValueRuleName());
        }
        return this;
    }

    /**
     * <B>PSSYSVALUERULENAME</B>&nbsp;值规则
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSVALUERULEID}
     */
    public final static String FIELD_PSSYSVALUERULENAME = "pssysvaluerulename";

    /**
     * 设置 值规则
     * 
     * @param pSSysValueRuleName
     * 
     */
    @JsonProperty(FIELD_PSSYSVALUERULENAME)
    public void setPSSysValueRuleName(String pSSysValueRuleName){
        this.set(FIELD_PSSYSVALUERULENAME, pSSysValueRuleName);
    }
    
    /**
     * 获取 值规则  
     * @return
     */
    @JsonIgnore
    public String getPSSysValueRuleName(){
        Object objValue = this.get(FIELD_PSSYSVALUERULENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值规则 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysValueRuleNameDirty(){
        if(this.contains(FIELD_PSSYSVALUERULENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值规则
     */
    @JsonIgnore
    public void resetPSSysValueRuleName(){
        this.reset(FIELD_PSSYSVALUERULENAME);
    }

    /**
     * 设置 值规则
     * <P>
     * 等同 {@link #setPSSysValueRuleName}
     * @param pSSysValueRuleName
     */
    @JsonIgnore
    public PSDEDSParamDTO pssysvaluerulename(String pSSysValueRuleName){
        this.setPSSysValueRuleName(pSSysValueRuleName);
        return this;
    }

    /**
     * <B>STDDATATYPE</B>&nbsp;标准数据类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.StdDataType} 
     */
    public final static String FIELD_STDDATATYPE = "stddatatype";

    /**
     * 设置 标准数据类型
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
     * 设置 标准数据类型
     * <P>
     * 等同 {@link #setStdDataType}
     * @param stdDataType
     */
    @JsonIgnore
    public PSDEDSParamDTO stddatatype(Integer stdDataType){
        this.setStdDataType(stdDataType);
        return this;
    }

     /**
     * 设置 标准数据类型
     * <P>
     * 等同 {@link #setStdDataType}
     * @param stdDataType
     */
    @JsonIgnore
    public PSDEDSParamDTO stddatatype(net.ibizsys.model.PSModelEnums.StdDataType stdDataType){
        if(stdDataType == null){
            this.setStdDataType(null);
        }
        else{
            this.setStdDataType(stdDataType.value);
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
    public PSDEDSParamDTO updatedate(Timestamp updateDate){
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
    public PSDEDSParamDTO updateman(String updateMan){
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
    public PSDEDSParamDTO usercat(String userCat){
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
    public PSDEDSParamDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSDEDSParamDTO usertag(String userTag){
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
    public PSDEDSParamDTO usertag2(String userTag2){
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
    public PSDEDSParamDTO usertag3(String userTag3){
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
    public PSDEDSParamDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>VALUE</B>&nbsp;值或属性
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_VALUE = "value";

    /**
     * 设置 值或属性
     * 
     * @param value
     * 
     */
    @JsonProperty(FIELD_VALUE)
    public void setValue(String value){
        this.set(FIELD_VALUE, value);
    }
    
    /**
     * 获取 值或属性  
     * @return
     */
    @JsonIgnore
    public String getValue(){
        Object objValue = this.get(FIELD_VALUE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值或属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isValueDirty(){
        if(this.contains(FIELD_VALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值或属性
     */
    @JsonIgnore
    public void resetValue(){
        this.reset(FIELD_VALUE);
    }

    /**
     * 设置 值或属性
     * <P>
     * 等同 {@link #setValue}
     * @param value
     */
    @JsonIgnore
    public PSDEDSParamDTO value(String value){
        this.setValue(value);
        return this;
    }

    /**
     * <B>VALUEDESC</B>&nbsp;值说明
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_VALUEDESC = "valuedesc";

    /**
     * 设置 值说明
     * 
     * @param valueDesc
     * 
     */
    @JsonProperty(FIELD_VALUEDESC)
    public void setValueDesc(String valueDesc){
        this.set(FIELD_VALUEDESC, valueDesc);
    }
    
    /**
     * 获取 值说明  
     * @return
     */
    @JsonIgnore
    public String getValueDesc(){
        Object objValue = this.get(FIELD_VALUEDESC);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值说明 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isValueDescDirty(){
        if(this.contains(FIELD_VALUEDESC)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值说明
     */
    @JsonIgnore
    public void resetValueDesc(){
        this.reset(FIELD_VALUEDESC);
    }

    /**
     * 设置 值说明
     * <P>
     * 等同 {@link #setValueDesc}
     * @param valueDesc
     */
    @JsonIgnore
    public PSDEDSParamDTO valuedesc(String valueDesc){
        this.setValueDesc(valueDesc);
        return this;
    }

    /**
     * <B>VALUETYPE</B>&nbsp;值类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DEActionParamValueType} 
     */
    public final static String FIELD_VALUETYPE = "valuetype";

    /**
     * 设置 值类型
     * 
     * @param valueType
     * 
     */
    @JsonProperty(FIELD_VALUETYPE)
    public void setValueType(String valueType){
        this.set(FIELD_VALUETYPE, valueType);
    }
    
    /**
     * 获取 值类型  
     * @return
     */
    @JsonIgnore
    public String getValueType(){
        Object objValue = this.get(FIELD_VALUETYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isValueTypeDirty(){
        if(this.contains(FIELD_VALUETYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值类型
     */
    @JsonIgnore
    public void resetValueType(){
        this.reset(FIELD_VALUETYPE);
    }

    /**
     * 设置 值类型
     * <P>
     * 等同 {@link #setValueType}
     * @param valueType
     */
    @JsonIgnore
    public PSDEDSParamDTO valuetype(String valueType){
        this.setValueType(valueType);
        return this;
    }

     /**
     * 设置 值类型
     * <P>
     * 等同 {@link #setValueType}
     * @param valueType
     */
    @JsonIgnore
    public PSDEDSParamDTO valuetype(net.ibizsys.model.PSModelEnums.DEActionParamValueType valueType){
        if(valueType == null){
            this.setValueType(null);
        }
        else{
            this.setValueType(valueType.value);
        }
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSDEDSParamId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSDEDSParamId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEDSParamId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEDSParamId(strValue);
    }

    @JsonIgnore
    public PSDEDSParamDTO id(String strValue){
        this.setPSDEDSParamId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDEDSParamDTO){
            PSDEDSParamDTO dto = (PSDEDSParamDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
