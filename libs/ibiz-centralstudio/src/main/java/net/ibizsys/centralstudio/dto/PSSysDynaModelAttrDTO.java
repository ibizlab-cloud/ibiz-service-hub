package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSDYNAMODELATTR</B>系统动态模型属性 模型传输对象
 * <P>
 * 动态模型的属性模型，为动态模型提供条目化定义维度
 */
public class PSSysDynaModelAttrDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysDynaModelAttrDTO(){
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
    public PSSysDynaModelAttrDTO allowempty(Integer allowEmpty){
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
    public PSSysDynaModelAttrDTO allowempty(Boolean allowEmpty){
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
    public PSSysDynaModelAttrDTO arrayflag(Integer arrayFlag){
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
    public PSSysDynaModelAttrDTO arrayflag(Boolean arrayFlag){
        if(arrayFlag == null){
            this.setArrayFlag(null);
        }
        else{
            this.setArrayFlag(arrayFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ATTRTAG</B>&nbsp;属性标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ATTRTAG = "attrtag";

    /**
     * 设置 属性标记
     * 
     * @param attrTag
     * 
     */
    @JsonProperty(FIELD_ATTRTAG)
    public void setAttrTag(String attrTag){
        this.set(FIELD_ATTRTAG, attrTag);
    }
    
    /**
     * 获取 属性标记  
     * @return
     */
    @JsonIgnore
    public String getAttrTag(){
        Object objValue = this.get(FIELD_ATTRTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAttrTagDirty(){
        if(this.contains(FIELD_ATTRTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性标记
     */
    @JsonIgnore
    public void resetAttrTag(){
        this.reset(FIELD_ATTRTAG);
    }

    /**
     * 设置 属性标记
     * <P>
     * 等同 {@link #setAttrTag}
     * @param attrTag
     */
    @JsonIgnore
    public PSSysDynaModelAttrDTO attrtag(String attrTag){
        this.setAttrTag(attrTag);
        return this;
    }

    /**
     * <B>ATTRTAG2</B>&nbsp;属性标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ATTRTAG2 = "attrtag2";

    /**
     * 设置 属性标记2
     * 
     * @param attrTag2
     * 
     */
    @JsonProperty(FIELD_ATTRTAG2)
    public void setAttrTag2(String attrTag2){
        this.set(FIELD_ATTRTAG2, attrTag2);
    }
    
    /**
     * 获取 属性标记2  
     * @return
     */
    @JsonIgnore
    public String getAttrTag2(){
        Object objValue = this.get(FIELD_ATTRTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAttrTag2Dirty(){
        if(this.contains(FIELD_ATTRTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性标记2
     */
    @JsonIgnore
    public void resetAttrTag2(){
        this.reset(FIELD_ATTRTAG2);
    }

    /**
     * 设置 属性标记2
     * <P>
     * 等同 {@link #setAttrTag2}
     * @param attrTag2
     */
    @JsonIgnore
    public PSSysDynaModelAttrDTO attrtag2(String attrTag2){
        this.setAttrTag2(attrTag2);
        return this;
    }

    /**
     * <B>ATTRVALUE</B>&nbsp;属性值，属性值类型为【直接值】时指定属性的值
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_ATTRVALUE = "attrvalue";

    /**
     * 设置 属性值，详细说明：{@link #FIELD_ATTRVALUE}
     * 
     * @param attrValue
     * 
     */
    @JsonProperty(FIELD_ATTRVALUE)
    public void setAttrValue(String attrValue){
        this.set(FIELD_ATTRVALUE, attrValue);
    }
    
    /**
     * 获取 属性值  
     * @return
     */
    @JsonIgnore
    public String getAttrValue(){
        Object objValue = this.get(FIELD_ATTRVALUE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAttrValueDirty(){
        if(this.contains(FIELD_ATTRVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性值
     */
    @JsonIgnore
    public void resetAttrValue(){
        this.reset(FIELD_ATTRVALUE);
    }

    /**
     * 设置 属性值，详细说明：{@link #FIELD_ATTRVALUE}
     * <P>
     * 等同 {@link #setAttrValue}
     * @param attrValue
     */
    @JsonIgnore
    public PSSysDynaModelAttrDTO attrvalue(String attrValue){
        this.setAttrValue(attrValue);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CODENAME = "codename";

    /**
     * 设置 代码标识
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
     * 设置 代码标识
     * <P>
     * 等同 {@link #setCodeName}
     * @param codeName
     */
    @JsonIgnore
    public PSSysDynaModelAttrDTO codename(String codeName){
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
    public PSSysDynaModelAttrDTO createdate(Timestamp createDate){
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
    public PSSysDynaModelAttrDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DYNAMODELUSAGE</B>&nbsp;DYNAMODELUSAGE
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DynaModelUsage} 
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDYNAMODELID}
     */
    public final static String FIELD_DYNAMODELUSAGE = "dynamodelusage";

    /**
     * 设置 DYNAMODELUSAGE
     * 
     * @param dynaModelUsage
     * 
     */
    @JsonProperty(FIELD_DYNAMODELUSAGE)
    public void setDynaModelUsage(String dynaModelUsage){
        this.set(FIELD_DYNAMODELUSAGE, dynaModelUsage);
    }
    
    /**
     * 获取 DYNAMODELUSAGE  
     * @return
     */
    @JsonIgnore
    public String getDynaModelUsage(){
        Object objValue = this.get(FIELD_DYNAMODELUSAGE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 DYNAMODELUSAGE 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDynaModelUsageDirty(){
        if(this.contains(FIELD_DYNAMODELUSAGE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 DYNAMODELUSAGE
     */
    @JsonIgnore
    public void resetDynaModelUsage(){
        this.reset(FIELD_DYNAMODELUSAGE);
    }

    /**
     * 设置 DYNAMODELUSAGE
     * <P>
     * 等同 {@link #setDynaModelUsage}
     * @param dynaModelUsage
     */
    @JsonIgnore
    public PSSysDynaModelAttrDTO dynamodelusage(String dynaModelUsage){
        this.setDynaModelUsage(dynaModelUsage);
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
    public PSSysDynaModelAttrDTO jsonformat(String jsonFormat){
        this.setJsonFormat(jsonFormat);
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;逻辑名称，指定动态模型属性的逻辑名称
     * <P>
     * 字符串：最大长度 200
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
    public PSSysDynaModelAttrDTO logicname(String logicName){
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
    public PSSysDynaModelAttrDTO memo(String memo){
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
    public PSSysDynaModelAttrDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSCODELISTID</B>&nbsp;代码表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSCodeListDTO} 
     */
    public final static String FIELD_PSCODELISTID = "pscodelistid";

    /**
     * 设置 代码表
     * 
     * @param pSCodeListId
     * 
     */
    @JsonProperty(FIELD_PSCODELISTID)
    public void setPSCodeListId(String pSCodeListId){
        this.set(FIELD_PSCODELISTID, pSCodeListId);
    }
    
    /**
     * 获取 代码表  
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
     * 判断 代码表 是否指定值，包括空值
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
     * 重置 代码表
     */
    @JsonIgnore
    public void resetPSCodeListId(){
        this.reset(FIELD_PSCODELISTID);
    }

    /**
     * 设置 代码表
     * <P>
     * 等同 {@link #setPSCodeListId}
     * @param pSCodeListId
     */
    @JsonIgnore
    public PSSysDynaModelAttrDTO pscodelistid(String pSCodeListId){
        this.setPSCodeListId(pSCodeListId);
        return this;
    }

    /**
     * 设置 代码表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSCodeListId}
     * @param pSCodeList 引用对象
     */
    @JsonIgnore
    public PSSysDynaModelAttrDTO pscodelistid(PSCodeListDTO pSCodeList){
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
     * <B>PSCODELISTNAME</B>&nbsp;代码表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCODELISTID}
     */
    public final static String FIELD_PSCODELISTNAME = "pscodelistname";

    /**
     * 设置 代码表
     * 
     * @param pSCodeListName
     * 
     */
    @JsonProperty(FIELD_PSCODELISTNAME)
    public void setPSCodeListName(String pSCodeListName){
        this.set(FIELD_PSCODELISTNAME, pSCodeListName);
    }
    
    /**
     * 获取 代码表  
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
     * 判断 代码表 是否指定值，包括空值
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
     * 重置 代码表
     */
    @JsonIgnore
    public void resetPSCodeListName(){
        this.reset(FIELD_PSCODELISTNAME);
    }

    /**
     * 设置 代码表
     * <P>
     * 等同 {@link #setPSCodeListName}
     * @param pSCodeListName
     */
    @JsonIgnore
    public PSSysDynaModelAttrDTO pscodelistname(String pSCodeListName){
        this.setPSCodeListName(pSCodeListName);
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELATTRID</B>&nbsp;系统动态模型属性标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSDYNAMODELATTRID = "pssysdynamodelattrid";

    /**
     * 设置 系统动态模型属性标识
     * 
     * @param pSSysDynaModelAttrId
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELATTRID)
    public void setPSSysDynaModelAttrId(String pSSysDynaModelAttrId){
        this.set(FIELD_PSSYSDYNAMODELATTRID, pSSysDynaModelAttrId);
    }
    
    /**
     * 获取 系统动态模型属性标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysDynaModelAttrId(){
        Object objValue = this.get(FIELD_PSSYSDYNAMODELATTRID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统动态模型属性标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDynaModelAttrIdDirty(){
        if(this.contains(FIELD_PSSYSDYNAMODELATTRID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统动态模型属性标识
     */
    @JsonIgnore
    public void resetPSSysDynaModelAttrId(){
        this.reset(FIELD_PSSYSDYNAMODELATTRID);
    }

    /**
     * 设置 系统动态模型属性标识
     * <P>
     * 等同 {@link #setPSSysDynaModelAttrId}
     * @param pSSysDynaModelAttrId
     */
    @JsonIgnore
    public PSSysDynaModelAttrDTO pssysdynamodelattrid(String pSSysDynaModelAttrId){
        this.setPSSysDynaModelAttrId(pSSysDynaModelAttrId);
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELATTRNAME</B>&nbsp;属性名称，指定动态模型属性的名称，需在所属的动态模型对象中具备唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSDYNAMODELATTRNAME = "pssysdynamodelattrname";

    /**
     * 设置 属性名称，详细说明：{@link #FIELD_PSSYSDYNAMODELATTRNAME}
     * 
     * @param pSSysDynaModelAttrName
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELATTRNAME)
    public void setPSSysDynaModelAttrName(String pSSysDynaModelAttrName){
        this.set(FIELD_PSSYSDYNAMODELATTRNAME, pSSysDynaModelAttrName);
    }
    
    /**
     * 获取 属性名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysDynaModelAttrName(){
        Object objValue = this.get(FIELD_PSSYSDYNAMODELATTRNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDynaModelAttrNameDirty(){
        if(this.contains(FIELD_PSSYSDYNAMODELATTRNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性名称
     */
    @JsonIgnore
    public void resetPSSysDynaModelAttrName(){
        this.reset(FIELD_PSSYSDYNAMODELATTRNAME);
    }

    /**
     * 设置 属性名称，详细说明：{@link #FIELD_PSSYSDYNAMODELATTRNAME}
     * <P>
     * 等同 {@link #setPSSysDynaModelAttrName}
     * @param pSSysDynaModelAttrName
     */
    @JsonIgnore
    public PSSysDynaModelAttrDTO pssysdynamodelattrname(String pSSysDynaModelAttrName){
        this.setPSSysDynaModelAttrName(pSSysDynaModelAttrName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysDynaModelAttrName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysDynaModelAttrName(strName);
    }

    @JsonIgnore
    public PSSysDynaModelAttrDTO name(String strName){
        this.setPSSysDynaModelAttrName(strName);
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELID</B>&nbsp;动态模型对象，指定动态模型属性所属的模型对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysDynaModelDTO} 
     */
    public final static String FIELD_PSSYSDYNAMODELID = "pssysdynamodelid";

    /**
     * 设置 动态模型对象，详细说明：{@link #FIELD_PSSYSDYNAMODELID}
     * 
     * @param pSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELID)
    public void setPSSysDynaModelId(String pSSysDynaModelId){
        this.set(FIELD_PSSYSDYNAMODELID, pSSysDynaModelId);
    }
    
    /**
     * 获取 动态模型对象  
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
     * 判断 动态模型对象 是否指定值，包括空值
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
     * 重置 动态模型对象
     */
    @JsonIgnore
    public void resetPSSysDynaModelId(){
        this.reset(FIELD_PSSYSDYNAMODELID);
    }

    /**
     * 设置 动态模型对象，详细说明：{@link #FIELD_PSSYSDYNAMODELID}
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModelId
     */
    @JsonIgnore
    public PSSysDynaModelAttrDTO pssysdynamodelid(String pSSysDynaModelId){
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    /**
     * 设置 动态模型对象，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModel 引用对象
     */
    @JsonIgnore
    public PSSysDynaModelAttrDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel){
        if(pSSysDynaModel == null){
            this.setDynaModelUsage(null);
            this.setPSSysDynaModelId(null);
            this.setPSSysDynaModelName(null);
        }
        else{
            this.setDynaModelUsage(pSSysDynaModel.getDynaModelUsage());
            this.setPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELNAME</B>&nbsp;动态模型对象，指定动态模型属性所属的模型对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDYNAMODELID}
     */
    public final static String FIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";

    /**
     * 设置 动态模型对象，详细说明：{@link #FIELD_PSSYSDYNAMODELNAME}
     * 
     * @param pSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELNAME)
    public void setPSSysDynaModelName(String pSSysDynaModelName){
        this.set(FIELD_PSSYSDYNAMODELNAME, pSSysDynaModelName);
    }
    
    /**
     * 获取 动态模型对象  
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
     * 判断 动态模型对象 是否指定值，包括空值
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
     * 重置 动态模型对象
     */
    @JsonIgnore
    public void resetPSSysDynaModelName(){
        this.reset(FIELD_PSSYSDYNAMODELNAME);
    }

    /**
     * 设置 动态模型对象，详细说明：{@link #FIELD_PSSYSDYNAMODELNAME}
     * <P>
     * 等同 {@link #setPSSysDynaModelName}
     * @param pSSysDynaModelName
     */
    @JsonIgnore
    public PSSysDynaModelAttrDTO pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
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
    public PSSysDynaModelAttrDTO pssysvalueruleid(String pSSysValueRuleId){
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
    public PSSysDynaModelAttrDTO pssysvalueruleid(PSSysValueRuleDTO pSSysValueRule){
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
    public PSSysDynaModelAttrDTO pssysvaluerulename(String pSSysValueRuleName){
        this.setPSSysValueRuleName(pSSysValueRuleName);
        return this;
    }

    /**
     * <B>REFPSDEFGROUPID</B>&nbsp;引用实体属性组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFGroupDTO} 
     */
    public final static String FIELD_REFPSDEFGROUPID = "refpsdefgroupid";

    /**
     * 设置 引用实体属性组
     * 
     * @param refPSDEFGroupId
     * 
     */
    @JsonProperty(FIELD_REFPSDEFGROUPID)
    public void setRefPSDEFGroupId(String refPSDEFGroupId){
        this.set(FIELD_REFPSDEFGROUPID, refPSDEFGroupId);
    }
    
    /**
     * 获取 引用实体属性组  
     * @return
     */
    @JsonIgnore
    public String getRefPSDEFGroupId(){
        Object objValue = this.get(FIELD_REFPSDEFGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用实体属性组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDEFGroupIdDirty(){
        if(this.contains(FIELD_REFPSDEFGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用实体属性组
     */
    @JsonIgnore
    public void resetRefPSDEFGroupId(){
        this.reset(FIELD_REFPSDEFGROUPID);
    }

    /**
     * 设置 引用实体属性组
     * <P>
     * 等同 {@link #setRefPSDEFGroupId}
     * @param refPSDEFGroupId
     */
    @JsonIgnore
    public PSSysDynaModelAttrDTO refpsdefgroupid(String refPSDEFGroupId){
        this.setRefPSDEFGroupId(refPSDEFGroupId);
        return this;
    }

    /**
     * 设置 引用实体属性组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefPSDEFGroupId}
     * @param pSDEFGroup 引用对象
     */
    @JsonIgnore
    public PSSysDynaModelAttrDTO refpsdefgroupid(PSDEFGroupDTO pSDEFGroup){
        if(pSDEFGroup == null){
            this.setRefPSDEFGroupId(null);
            this.setRefPSDEFGroupName(null);
        }
        else{
            this.setRefPSDEFGroupId(pSDEFGroup.getPSDEFGroupId());
            this.setRefPSDEFGroupName(pSDEFGroup.getPSDEFGroupName());
        }
        return this;
    }

    /**
     * <B>REFPSDEFGROUPNAME</B>&nbsp;引用实体属性组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPSDEFGROUPID}
     */
    public final static String FIELD_REFPSDEFGROUPNAME = "refpsdefgroupname";

    /**
     * 设置 引用实体属性组
     * 
     * @param refPSDEFGroupName
     * 
     */
    @JsonProperty(FIELD_REFPSDEFGROUPNAME)
    public void setRefPSDEFGroupName(String refPSDEFGroupName){
        this.set(FIELD_REFPSDEFGROUPNAME, refPSDEFGroupName);
    }
    
    /**
     * 获取 引用实体属性组  
     * @return
     */
    @JsonIgnore
    public String getRefPSDEFGroupName(){
        Object objValue = this.get(FIELD_REFPSDEFGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用实体属性组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDEFGroupNameDirty(){
        if(this.contains(FIELD_REFPSDEFGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用实体属性组
     */
    @JsonIgnore
    public void resetRefPSDEFGroupName(){
        this.reset(FIELD_REFPSDEFGROUPNAME);
    }

    /**
     * 设置 引用实体属性组
     * <P>
     * 等同 {@link #setRefPSDEFGroupName}
     * @param refPSDEFGroupName
     */
    @JsonIgnore
    public PSSysDynaModelAttrDTO refpsdefgroupname(String refPSDEFGroupName){
        this.setRefPSDEFGroupName(refPSDEFGroupName);
        return this;
    }

    /**
     * <B>REFPSDEID</B>&nbsp;引用实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDataEntityDTO} 
     */
    public final static String FIELD_REFPSDEID = "refpsdeid";

    /**
     * 设置 引用实体
     * 
     * @param refPSDEId
     * 
     */
    @JsonProperty(FIELD_REFPSDEID)
    public void setRefPSDEId(String refPSDEId){
        this.set(FIELD_REFPSDEID, refPSDEId);
    }
    
    /**
     * 获取 引用实体  
     * @return
     */
    @JsonIgnore
    public String getRefPSDEId(){
        Object objValue = this.get(FIELD_REFPSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDEIdDirty(){
        if(this.contains(FIELD_REFPSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用实体
     */
    @JsonIgnore
    public void resetRefPSDEId(){
        this.reset(FIELD_REFPSDEID);
    }

    /**
     * 设置 引用实体
     * <P>
     * 等同 {@link #setRefPSDEId}
     * @param refPSDEId
     */
    @JsonIgnore
    public PSSysDynaModelAttrDTO refpsdeid(String refPSDEId){
        this.setRefPSDEId(refPSDEId);
        return this;
    }

    /**
     * 设置 引用实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSSysDynaModelAttrDTO refpsdeid(PSDataEntityDTO pSDataEntity){
        if(pSDataEntity == null){
            this.setRefPSDEId(null);
            this.setRefPSDEName(null);
        }
        else{
            this.setRefPSDEId(pSDataEntity.getPSDataEntityId());
            this.setRefPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>REFPSDENAME</B>&nbsp;引用实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPSDEID}
     */
    public final static String FIELD_REFPSDENAME = "refpsdename";

    /**
     * 设置 引用实体
     * 
     * @param refPSDEName
     * 
     */
    @JsonProperty(FIELD_REFPSDENAME)
    public void setRefPSDEName(String refPSDEName){
        this.set(FIELD_REFPSDENAME, refPSDEName);
    }
    
    /**
     * 获取 引用实体  
     * @return
     */
    @JsonIgnore
    public String getRefPSDEName(){
        Object objValue = this.get(FIELD_REFPSDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDENameDirty(){
        if(this.contains(FIELD_REFPSDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用实体
     */
    @JsonIgnore
    public void resetRefPSDEName(){
        this.reset(FIELD_REFPSDENAME);
    }

    /**
     * 设置 引用实体
     * <P>
     * 等同 {@link #setRefPSDEName}
     * @param refPSDEName
     */
    @JsonIgnore
    public PSSysDynaModelAttrDTO refpsdename(String refPSDEName){
        this.setRefPSDEName(refPSDEName);
        return this;
    }

    /**
     * <B>REFPSSYSDYNAMODELID</B>&nbsp;引用模型对象，属性值类型为【对象】时指定属性引用的动态模型对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysDynaModelDTO} 
     */
    public final static String FIELD_REFPSSYSDYNAMODELID = "refpssysdynamodelid";

    /**
     * 设置 引用模型对象，详细说明：{@link #FIELD_REFPSSYSDYNAMODELID}
     * 
     * @param refPSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_REFPSSYSDYNAMODELID)
    public void setRefPSSysDynaModelId(String refPSSysDynaModelId){
        this.set(FIELD_REFPSSYSDYNAMODELID, refPSSysDynaModelId);
    }
    
    /**
     * 获取 引用模型对象  
     * @return
     */
    @JsonIgnore
    public String getRefPSSysDynaModelId(){
        Object objValue = this.get(FIELD_REFPSSYSDYNAMODELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用模型对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSSysDynaModelIdDirty(){
        if(this.contains(FIELD_REFPSSYSDYNAMODELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用模型对象
     */
    @JsonIgnore
    public void resetRefPSSysDynaModelId(){
        this.reset(FIELD_REFPSSYSDYNAMODELID);
    }

    /**
     * 设置 引用模型对象，详细说明：{@link #FIELD_REFPSSYSDYNAMODELID}
     * <P>
     * 等同 {@link #setRefPSSysDynaModelId}
     * @param refPSSysDynaModelId
     */
    @JsonIgnore
    public PSSysDynaModelAttrDTO refpssysdynamodelid(String refPSSysDynaModelId){
        this.setRefPSSysDynaModelId(refPSSysDynaModelId);
        return this;
    }

    /**
     * 设置 引用模型对象，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefPSSysDynaModelId}
     * @param pSSysDynaModel 引用对象
     */
    @JsonIgnore
    public PSSysDynaModelAttrDTO refpssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel){
        if(pSSysDynaModel == null){
            this.setRefPSSysDynaModelId(null);
            this.setRefPSSysDynaModelName(null);
        }
        else{
            this.setRefPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setRefPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    /**
     * <B>REFPSSYSDYNAMODELNAME</B>&nbsp;引用模型对象，属性值类型为【对象】时指定属性引用的动态模型对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPSSYSDYNAMODELID}
     */
    public final static String FIELD_REFPSSYSDYNAMODELNAME = "refpssysdynamodelname";

    /**
     * 设置 引用模型对象，详细说明：{@link #FIELD_REFPSSYSDYNAMODELNAME}
     * 
     * @param refPSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_REFPSSYSDYNAMODELNAME)
    public void setRefPSSysDynaModelName(String refPSSysDynaModelName){
        this.set(FIELD_REFPSSYSDYNAMODELNAME, refPSSysDynaModelName);
    }
    
    /**
     * 获取 引用模型对象  
     * @return
     */
    @JsonIgnore
    public String getRefPSSysDynaModelName(){
        Object objValue = this.get(FIELD_REFPSSYSDYNAMODELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用模型对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSSysDynaModelNameDirty(){
        if(this.contains(FIELD_REFPSSYSDYNAMODELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用模型对象
     */
    @JsonIgnore
    public void resetRefPSSysDynaModelName(){
        this.reset(FIELD_REFPSSYSDYNAMODELNAME);
    }

    /**
     * 设置 引用模型对象，详细说明：{@link #FIELD_REFPSSYSDYNAMODELNAME}
     * <P>
     * 等同 {@link #setRefPSSysDynaModelName}
     * @param refPSSysDynaModelName
     */
    @JsonIgnore
    public PSSysDynaModelAttrDTO refpssysdynamodelname(String refPSSysDynaModelName){
        this.setRefPSSysDynaModelName(refPSSysDynaModelName);
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
    public PSSysDynaModelAttrDTO stddatatype(Integer stdDataType){
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
    public PSSysDynaModelAttrDTO stddatatype(net.ibizsys.model.PSModelEnums.StdDataType stdDataType){
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
    public PSSysDynaModelAttrDTO updatedate(Timestamp updateDate){
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
    public PSSysDynaModelAttrDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
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
    public PSSysDynaModelAttrDTO validflag(Integer validFlag){
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
    public PSSysDynaModelAttrDTO validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>VALUETYPE</B>&nbsp;值类型，指定属性值的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DynaModelAttrValueType} 
     */
    public final static String FIELD_VALUETYPE = "valuetype";

    /**
     * 设置 值类型，详细说明：{@link #FIELD_VALUETYPE}
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
     * 设置 值类型，详细说明：{@link #FIELD_VALUETYPE}
     * <P>
     * 等同 {@link #setValueType}
     * @param valueType
     */
    @JsonIgnore
    public PSSysDynaModelAttrDTO valuetype(String valueType){
        this.setValueType(valueType);
        return this;
    }

     /**
     * 设置 值类型，详细说明：{@link #FIELD_VALUETYPE}
     * <P>
     * 等同 {@link #setValueType}
     * @param valueType
     */
    @JsonIgnore
    public PSSysDynaModelAttrDTO valuetype(net.ibizsys.model.PSModelEnums.DynaModelAttrValueType valueType){
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
        return this.getPSSysDynaModelAttrId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysDynaModelAttrId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysDynaModelAttrId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysDynaModelAttrId(strValue);
    }

    @JsonIgnore
    public PSSysDynaModelAttrDTO id(String strValue){
        this.setPSSysDynaModelAttrId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysDynaModelAttrDTO){
            PSSysDynaModelAttrDTO dto = (PSSysDynaModelAttrDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
