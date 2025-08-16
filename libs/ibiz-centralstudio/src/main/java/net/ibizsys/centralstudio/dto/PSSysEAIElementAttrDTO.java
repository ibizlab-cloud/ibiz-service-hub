package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSEAIELEMENTATTR</B>集成元素属性 模型传输对象
 * <P>
 * 
 */
public class PSSysEAIElementAttrDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysEAIElementAttrDTO(){
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
    public PSSysEAIElementAttrDTO allowempty(Integer allowEmpty){
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
    public PSSysEAIElementAttrDTO allowempty(Boolean allowEmpty){
        if(allowEmpty == null){
            this.setAllowEmpty(null);
        }
        else{
            this.setAllowEmpty(allowEmpty?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ATTRTAG</B>&nbsp;属性标记
     * <P>
     * 字符串：最大长度 200
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
    public PSSysEAIElementAttrDTO attrtag(String attrTag){
        this.setAttrTag(attrTag);
        return this;
    }

    /**
     * <B>ATTRTAG2</B>&nbsp;属性标记2
     * <P>
     * 字符串：最大长度 200
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
    public PSSysEAIElementAttrDTO attrtag2(String attrTag2){
        this.setAttrTag2(attrTag2);
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
    public PSSysEAIElementAttrDTO codename(String codeName){
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
    public PSSysEAIElementAttrDTO createdate(Timestamp createDate){
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
    public PSSysEAIElementAttrDTO createman(String createMan){
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
    public PSSysEAIElementAttrDTO defaultvalue(String defaultValue){
        this.setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <B>EAIELEMENTATTRTYPE</B>&nbsp;元素属性类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.EAIElementAttrType} 
     */
    public final static String FIELD_EAIELEMENTATTRTYPE = "eaielementattrtype";

    /**
     * 设置 元素属性类型
     * 
     * @param eAIElementAttrType
     * 
     */
    @JsonProperty(FIELD_EAIELEMENTATTRTYPE)
    public void setEAIElementAttrType(String eAIElementAttrType){
        this.set(FIELD_EAIELEMENTATTRTYPE, eAIElementAttrType);
    }
    
    /**
     * 获取 元素属性类型  
     * @return
     */
    @JsonIgnore
    public String getEAIElementAttrType(){
        Object objValue = this.get(FIELD_EAIELEMENTATTRTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 元素属性类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEAIElementAttrTypeDirty(){
        if(this.contains(FIELD_EAIELEMENTATTRTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 元素属性类型
     */
    @JsonIgnore
    public void resetEAIElementAttrType(){
        this.reset(FIELD_EAIELEMENTATTRTYPE);
    }

    /**
     * 设置 元素属性类型
     * <P>
     * 等同 {@link #setEAIElementAttrType}
     * @param eAIElementAttrType
     */
    @JsonIgnore
    public PSSysEAIElementAttrDTO eaielementattrtype(String eAIElementAttrType){
        this.setEAIElementAttrType(eAIElementAttrType);
        return this;
    }

     /**
     * 设置 元素属性类型
     * <P>
     * 等同 {@link #setEAIElementAttrType}
     * @param eAIElementAttrType
     */
    @JsonIgnore
    public PSSysEAIElementAttrDTO eaielementattrtype(net.ibizsys.model.PSModelEnums.EAIElementAttrType eAIElementAttrType){
        if(eAIElementAttrType == null){
            this.setEAIElementAttrType(null);
        }
        else{
            this.setEAIElementAttrType(eAIElementAttrType.value);
        }
        return this;
    }

    /**
     * <B>FIXEDVALUE</B>&nbsp;固定值
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_FIXEDVALUE = "fixedvalue";

    /**
     * 设置 固定值
     * 
     * @param fixedValue
     * 
     */
    @JsonProperty(FIELD_FIXEDVALUE)
    public void setFixedValue(String fixedValue){
        this.set(FIELD_FIXEDVALUE, fixedValue);
    }
    
    /**
     * 获取 固定值  
     * @return
     */
    @JsonIgnore
    public String getFixedValue(){
        Object objValue = this.get(FIELD_FIXEDVALUE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 固定值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFixedValueDirty(){
        if(this.contains(FIELD_FIXEDVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 固定值
     */
    @JsonIgnore
    public void resetFixedValue(){
        this.reset(FIELD_FIXEDVALUE);
    }

    /**
     * 设置 固定值
     * <P>
     * 等同 {@link #setFixedValue}
     * @param fixedValue
     */
    @JsonIgnore
    public PSSysEAIElementAttrDTO fixedvalue(String fixedValue){
        this.setFixedValue(fixedValue);
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
    public PSSysEAIElementAttrDTO memo(String memo){
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
    public PSSysEAIElementAttrDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSSYSEAIDATATYPEID</B>&nbsp;集成数据类型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysEAIDataTypeDTO} 
     */
    public final static String FIELD_PSSYSEAIDATATYPEID = "pssyseaidatatypeid";

    /**
     * 设置 集成数据类型
     * 
     * @param pSSysEAIDataTypeId
     * 
     */
    @JsonProperty(FIELD_PSSYSEAIDATATYPEID)
    public void setPSSysEAIDataTypeId(String pSSysEAIDataTypeId){
        this.set(FIELD_PSSYSEAIDATATYPEID, pSSysEAIDataTypeId);
    }
    
    /**
     * 获取 集成数据类型  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAIDataTypeId(){
        Object objValue = this.get(FIELD_PSSYSEAIDATATYPEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 集成数据类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAIDataTypeIdDirty(){
        if(this.contains(FIELD_PSSYSEAIDATATYPEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 集成数据类型
     */
    @JsonIgnore
    public void resetPSSysEAIDataTypeId(){
        this.reset(FIELD_PSSYSEAIDATATYPEID);
    }

    /**
     * 设置 集成数据类型
     * <P>
     * 等同 {@link #setPSSysEAIDataTypeId}
     * @param pSSysEAIDataTypeId
     */
    @JsonIgnore
    public PSSysEAIElementAttrDTO pssyseaidatatypeid(String pSSysEAIDataTypeId){
        this.setPSSysEAIDataTypeId(pSSysEAIDataTypeId);
        return this;
    }

    /**
     * 设置 集成数据类型，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysEAIDataTypeId}
     * @param pSSysEAIDataType 引用对象
     */
    @JsonIgnore
    public PSSysEAIElementAttrDTO pssyseaidatatypeid(PSSysEAIDataTypeDTO pSSysEAIDataType){
        if(pSSysEAIDataType == null){
            this.setPSSysEAIDataTypeId(null);
            this.setPSSysEAIDataTypeName(null);
        }
        else{
            this.setPSSysEAIDataTypeId(pSSysEAIDataType.getPSSysEAIDataTypeId());
            this.setPSSysEAIDataTypeName(pSSysEAIDataType.getPSSysEAIDataTypeName());
        }
        return this;
    }

    /**
     * <B>PSSYSEAIDATATYPENAME</B>&nbsp;集成数据类型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSEAIDATATYPEID}
     */
    public final static String FIELD_PSSYSEAIDATATYPENAME = "pssyseaidatatypename";

    /**
     * 设置 集成数据类型
     * 
     * @param pSSysEAIDataTypeName
     * 
     */
    @JsonProperty(FIELD_PSSYSEAIDATATYPENAME)
    public void setPSSysEAIDataTypeName(String pSSysEAIDataTypeName){
        this.set(FIELD_PSSYSEAIDATATYPENAME, pSSysEAIDataTypeName);
    }
    
    /**
     * 获取 集成数据类型  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAIDataTypeName(){
        Object objValue = this.get(FIELD_PSSYSEAIDATATYPENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 集成数据类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAIDataTypeNameDirty(){
        if(this.contains(FIELD_PSSYSEAIDATATYPENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 集成数据类型
     */
    @JsonIgnore
    public void resetPSSysEAIDataTypeName(){
        this.reset(FIELD_PSSYSEAIDATATYPENAME);
    }

    /**
     * 设置 集成数据类型
     * <P>
     * 等同 {@link #setPSSysEAIDataTypeName}
     * @param pSSysEAIDataTypeName
     */
    @JsonIgnore
    public PSSysEAIElementAttrDTO pssyseaidatatypename(String pSSysEAIDataTypeName){
        this.setPSSysEAIDataTypeName(pSSysEAIDataTypeName);
        return this;
    }

    /**
     * <B>PSSYSEAIELEMENTATTRID</B>&nbsp;集成元素属性标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSEAIELEMENTATTRID = "pssyseaielementattrid";

    /**
     * 设置 集成元素属性标识
     * 
     * @param pSSysEAIElementAttrId
     * 
     */
    @JsonProperty(FIELD_PSSYSEAIELEMENTATTRID)
    public void setPSSysEAIElementAttrId(String pSSysEAIElementAttrId){
        this.set(FIELD_PSSYSEAIELEMENTATTRID, pSSysEAIElementAttrId);
    }
    
    /**
     * 获取 集成元素属性标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAIElementAttrId(){
        Object objValue = this.get(FIELD_PSSYSEAIELEMENTATTRID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 集成元素属性标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAIElementAttrIdDirty(){
        if(this.contains(FIELD_PSSYSEAIELEMENTATTRID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 集成元素属性标识
     */
    @JsonIgnore
    public void resetPSSysEAIElementAttrId(){
        this.reset(FIELD_PSSYSEAIELEMENTATTRID);
    }

    /**
     * 设置 集成元素属性标识
     * <P>
     * 等同 {@link #setPSSysEAIElementAttrId}
     * @param pSSysEAIElementAttrId
     */
    @JsonIgnore
    public PSSysEAIElementAttrDTO pssyseaielementattrid(String pSSysEAIElementAttrId){
        this.setPSSysEAIElementAttrId(pSSysEAIElementAttrId);
        return this;
    }

    /**
     * <B>PSSYSEAIELEMENTATTRNAME</B>&nbsp;元素属性名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSEAIELEMENTATTRNAME = "pssyseaielementattrname";

    /**
     * 设置 元素属性名称
     * 
     * @param pSSysEAIElementAttrName
     * 
     */
    @JsonProperty(FIELD_PSSYSEAIELEMENTATTRNAME)
    public void setPSSysEAIElementAttrName(String pSSysEAIElementAttrName){
        this.set(FIELD_PSSYSEAIELEMENTATTRNAME, pSSysEAIElementAttrName);
    }
    
    /**
     * 获取 元素属性名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAIElementAttrName(){
        Object objValue = this.get(FIELD_PSSYSEAIELEMENTATTRNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 元素属性名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAIElementAttrNameDirty(){
        if(this.contains(FIELD_PSSYSEAIELEMENTATTRNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 元素属性名称
     */
    @JsonIgnore
    public void resetPSSysEAIElementAttrName(){
        this.reset(FIELD_PSSYSEAIELEMENTATTRNAME);
    }

    /**
     * 设置 元素属性名称
     * <P>
     * 等同 {@link #setPSSysEAIElementAttrName}
     * @param pSSysEAIElementAttrName
     */
    @JsonIgnore
    public PSSysEAIElementAttrDTO pssyseaielementattrname(String pSSysEAIElementAttrName){
        this.setPSSysEAIElementAttrName(pSSysEAIElementAttrName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysEAIElementAttrName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysEAIElementAttrName(strName);
    }

    @JsonIgnore
    public PSSysEAIElementAttrDTO name(String strName){
        this.setPSSysEAIElementAttrName(strName);
        return this;
    }

    /**
     * <B>PSSYSEAIELEMENTID</B>&nbsp;集成元素
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysEAIElementDTO} 
     */
    public final static String FIELD_PSSYSEAIELEMENTID = "pssyseaielementid";

    /**
     * 设置 集成元素
     * 
     * @param pSSysEAIElementId
     * 
     */
    @JsonProperty(FIELD_PSSYSEAIELEMENTID)
    public void setPSSysEAIElementId(String pSSysEAIElementId){
        this.set(FIELD_PSSYSEAIELEMENTID, pSSysEAIElementId);
    }
    
    /**
     * 获取 集成元素  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAIElementId(){
        Object objValue = this.get(FIELD_PSSYSEAIELEMENTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 集成元素 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAIElementIdDirty(){
        if(this.contains(FIELD_PSSYSEAIELEMENTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 集成元素
     */
    @JsonIgnore
    public void resetPSSysEAIElementId(){
        this.reset(FIELD_PSSYSEAIELEMENTID);
    }

    /**
     * 设置 集成元素
     * <P>
     * 等同 {@link #setPSSysEAIElementId}
     * @param pSSysEAIElementId
     */
    @JsonIgnore
    public PSSysEAIElementAttrDTO pssyseaielementid(String pSSysEAIElementId){
        this.setPSSysEAIElementId(pSSysEAIElementId);
        return this;
    }

    /**
     * 设置 集成元素，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysEAIElementId}
     * @param pSSysEAIElement 引用对象
     */
    @JsonIgnore
    public PSSysEAIElementAttrDTO pssyseaielementid(PSSysEAIElementDTO pSSysEAIElement){
        if(pSSysEAIElement == null){
            this.setPSSysEAIElementId(null);
            this.setPSSysEAIElementName(null);
            this.setPSSysEAISchemeId(null);
        }
        else{
            this.setPSSysEAIElementId(pSSysEAIElement.getPSSysEAIElementId());
            this.setPSSysEAIElementName(pSSysEAIElement.getPSSysEAIElementName());
            this.setPSSysEAISchemeId(pSSysEAIElement.getPSSysEAISchemeId());
        }
        return this;
    }

    /**
     * <B>PSSYSEAIELEMENTNAME</B>&nbsp;集成元素
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSEAIELEMENTID}
     */
    public final static String FIELD_PSSYSEAIELEMENTNAME = "pssyseaielementname";

    /**
     * 设置 集成元素
     * 
     * @param pSSysEAIElementName
     * 
     */
    @JsonProperty(FIELD_PSSYSEAIELEMENTNAME)
    public void setPSSysEAIElementName(String pSSysEAIElementName){
        this.set(FIELD_PSSYSEAIELEMENTNAME, pSSysEAIElementName);
    }
    
    /**
     * 获取 集成元素  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAIElementName(){
        Object objValue = this.get(FIELD_PSSYSEAIELEMENTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 集成元素 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAIElementNameDirty(){
        if(this.contains(FIELD_PSSYSEAIELEMENTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 集成元素
     */
    @JsonIgnore
    public void resetPSSysEAIElementName(){
        this.reset(FIELD_PSSYSEAIELEMENTNAME);
    }

    /**
     * 设置 集成元素
     * <P>
     * 等同 {@link #setPSSysEAIElementName}
     * @param pSSysEAIElementName
     */
    @JsonIgnore
    public PSSysEAIElementAttrDTO pssyseaielementname(String pSSysEAIElementName){
        this.setPSSysEAIElementName(pSSysEAIElementName);
        return this;
    }

    /**
     * <B>PSSYSEAISCHEMEID</B>&nbsp;PSSYSEAISCHEMEID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSEAIELEMENTID}
     */
    public final static String FIELD_PSSYSEAISCHEMEID = "pssyseaischemeid";

    /**
     * 设置 PSSYSEAISCHEMEID
     * 
     * @param pSSysEAISchemeId
     * 
     */
    @JsonProperty(FIELD_PSSYSEAISCHEMEID)
    public void setPSSysEAISchemeId(String pSSysEAISchemeId){
        this.set(FIELD_PSSYSEAISCHEMEID, pSSysEAISchemeId);
    }
    
    /**
     * 获取 PSSYSEAISCHEMEID  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAISchemeId(){
        Object objValue = this.get(FIELD_PSSYSEAISCHEMEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 PSSYSEAISCHEMEID 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAISchemeIdDirty(){
        if(this.contains(FIELD_PSSYSEAISCHEMEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 PSSYSEAISCHEMEID
     */
    @JsonIgnore
    public void resetPSSysEAISchemeId(){
        this.reset(FIELD_PSSYSEAISCHEMEID);
    }

    /**
     * 设置 PSSYSEAISCHEMEID
     * <P>
     * 等同 {@link #setPSSysEAISchemeId}
     * @param pSSysEAISchemeId
     */
    @JsonIgnore
    public PSSysEAIElementAttrDTO pssyseaischemeid(String pSSysEAISchemeId){
        this.setPSSysEAISchemeId(pSSysEAISchemeId);
        return this;
    }

    /**
     * <B>REFPSSYSEAIELEMENTID</B>&nbsp;引用属性组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysEAIElementDTO} 
     */
    public final static String FIELD_REFPSSYSEAIELEMENTID = "refpssyseaielementid";

    /**
     * 设置 引用属性组
     * 
     * @param refPSSysEAIElementId
     * 
     */
    @JsonProperty(FIELD_REFPSSYSEAIELEMENTID)
    public void setRefPSSysEAIElementId(String refPSSysEAIElementId){
        this.set(FIELD_REFPSSYSEAIELEMENTID, refPSSysEAIElementId);
    }
    
    /**
     * 获取 引用属性组  
     * @return
     */
    @JsonIgnore
    public String getRefPSSysEAIElementId(){
        Object objValue = this.get(FIELD_REFPSSYSEAIELEMENTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用属性组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSSysEAIElementIdDirty(){
        if(this.contains(FIELD_REFPSSYSEAIELEMENTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用属性组
     */
    @JsonIgnore
    public void resetRefPSSysEAIElementId(){
        this.reset(FIELD_REFPSSYSEAIELEMENTID);
    }

    /**
     * 设置 引用属性组
     * <P>
     * 等同 {@link #setRefPSSysEAIElementId}
     * @param refPSSysEAIElementId
     */
    @JsonIgnore
    public PSSysEAIElementAttrDTO refpssyseaielementid(String refPSSysEAIElementId){
        this.setRefPSSysEAIElementId(refPSSysEAIElementId);
        return this;
    }

    /**
     * 设置 引用属性组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefPSSysEAIElementId}
     * @param pSSysEAIElement 引用对象
     */
    @JsonIgnore
    public PSSysEAIElementAttrDTO refpssyseaielementid(PSSysEAIElementDTO pSSysEAIElement){
        if(pSSysEAIElement == null){
            this.setRefPSSysEAIElementId(null);
            this.setRefPSSysEAIElementName(null);
        }
        else{
            this.setRefPSSysEAIElementId(pSSysEAIElement.getPSSysEAIElementId());
            this.setRefPSSysEAIElementName(pSSysEAIElement.getPSSysEAIElementName());
        }
        return this;
    }

    /**
     * <B>REFPSSYSEAIELEMENTNAME</B>&nbsp;引用属性组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPSSYSEAIELEMENTID}
     */
    public final static String FIELD_REFPSSYSEAIELEMENTNAME = "refpssyseaielementname";

    /**
     * 设置 引用属性组
     * 
     * @param refPSSysEAIElementName
     * 
     */
    @JsonProperty(FIELD_REFPSSYSEAIELEMENTNAME)
    public void setRefPSSysEAIElementName(String refPSSysEAIElementName){
        this.set(FIELD_REFPSSYSEAIELEMENTNAME, refPSSysEAIElementName);
    }
    
    /**
     * 获取 引用属性组  
     * @return
     */
    @JsonIgnore
    public String getRefPSSysEAIElementName(){
        Object objValue = this.get(FIELD_REFPSSYSEAIELEMENTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用属性组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSSysEAIElementNameDirty(){
        if(this.contains(FIELD_REFPSSYSEAIELEMENTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用属性组
     */
    @JsonIgnore
    public void resetRefPSSysEAIElementName(){
        this.reset(FIELD_REFPSSYSEAIELEMENTNAME);
    }

    /**
     * 设置 引用属性组
     * <P>
     * 等同 {@link #setRefPSSysEAIElementName}
     * @param refPSSysEAIElementName
     */
    @JsonIgnore
    public PSSysEAIElementAttrDTO refpssyseaielementname(String refPSSysEAIElementName){
        this.setRefPSSysEAIElementName(refPSSysEAIElementName);
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
    public PSSysEAIElementAttrDTO updatedate(Timestamp updateDate){
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
    public PSSysEAIElementAttrDTO updateman(String updateMan){
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
    public PSSysEAIElementAttrDTO usercat(String userCat){
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
    public PSSysEAIElementAttrDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSSysEAIElementAttrDTO usertag(String userTag){
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
    public PSSysEAIElementAttrDTO usertag2(String userTag2){
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
    public PSSysEAIElementAttrDTO usertag3(String userTag3){
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
    public PSSysEAIElementAttrDTO usertag4(String userTag4){
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
    public PSSysEAIElementAttrDTO validflag(Integer validFlag){
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
    public PSSysEAIElementAttrDTO validflag(Boolean validFlag){
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
        return this.getPSSysEAIElementAttrId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysEAIElementAttrId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysEAIElementAttrId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysEAIElementAttrId(strValue);
    }

    @JsonIgnore
    public PSSysEAIElementAttrDTO id(String strValue){
        this.setPSSysEAIElementAttrId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysEAIElementAttrDTO){
            PSSysEAIElementAttrDTO dto = (PSSysEAIElementAttrDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
