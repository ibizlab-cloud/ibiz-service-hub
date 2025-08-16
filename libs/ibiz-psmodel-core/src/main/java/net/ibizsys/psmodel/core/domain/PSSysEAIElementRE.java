package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSSYSEAIELEMENTRE</B>集成元素元素 模型传输对象
 * <P>
 * 
 */
public class PSSysEAIElementRE extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysEAIElementRE(){
        this.setValidFlag(1);
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
    public PSSysEAIElementRE codename(String codeName){
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
    public PSSysEAIElementRE createdate(String createDate){
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
    public PSSysEAIElementRE createman(String createMan){
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
    public PSSysEAIElementRE defaultvalue(String defaultValue){
        this.setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <B>EAIELEMENTRETYPE</B>&nbsp;引用元素类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.EAIElementREType} 
     */
    public final static String FIELD_EAIELEMENTRETYPE = "eaielementretype";

    /**
     * 设置 引用元素类型
     * 
     * @param eAIElementREType
     * 
     */
    @JsonProperty(FIELD_EAIELEMENTRETYPE)
    public void setEAIElementREType(String eAIElementREType){
        this.set(FIELD_EAIELEMENTRETYPE, eAIElementREType);
    }
    
    /**
     * 获取 引用元素类型  
     * @return
     */
    @JsonIgnore
    public String getEAIElementREType(){
        Object objValue = this.get(FIELD_EAIELEMENTRETYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用元素类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEAIElementRETypeDirty(){
        if(this.contains(FIELD_EAIELEMENTRETYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用元素类型
     */
    @JsonIgnore
    public void resetEAIElementREType(){
        this.reset(FIELD_EAIELEMENTRETYPE);
    }

    /**
     * 设置 引用元素类型
     * <P>
     * 等同 {@link #setEAIElementREType}
     * @param eAIElementREType
     */
    @JsonIgnore
    public PSSysEAIElementRE eaielementretype(String eAIElementREType){
        this.setEAIElementREType(eAIElementREType);
        return this;
    }

     /**
     * 设置 引用元素类型
     * <P>
     * 等同 {@link #setEAIElementREType}
     * @param eAIElementREType
     */
    @JsonIgnore
    public PSSysEAIElementRE eaielementretype(net.ibizsys.psmodel.core.util.PSModelEnums.EAIElementREType eAIElementREType){
        if(eAIElementREType == null){
            this.setEAIElementREType(null);
        }
        else{
            this.setEAIElementREType(eAIElementREType.value);
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
    public PSSysEAIElementRE fixedvalue(String fixedValue){
        this.setFixedValue(fixedValue);
        return this;
    }

    /**
     * <B>MAXOCCURS</B>&nbsp;最大出现次数
     */
    public final static String FIELD_MAXOCCURS = "maxoccurs";

    /**
     * 设置 最大出现次数
     * 
     * @param maxOccurs
     * 
     */
    @JsonProperty(FIELD_MAXOCCURS)
    public void setMaxOccurs(Integer maxOccurs){
        this.set(FIELD_MAXOCCURS, maxOccurs);
    }
    
    /**
     * 获取 最大出现次数  
     * @return
     */
    @JsonIgnore
    public Integer getMaxOccurs(){
        Object objValue = this.get(FIELD_MAXOCCURS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 最大出现次数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMaxOccursDirty(){
        if(this.contains(FIELD_MAXOCCURS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 最大出现次数
     */
    @JsonIgnore
    public void resetMaxOccurs(){
        this.reset(FIELD_MAXOCCURS);
    }

    /**
     * 设置 最大出现次数
     * <P>
     * 等同 {@link #setMaxOccurs}
     * @param maxOccurs
     */
    @JsonIgnore
    public PSSysEAIElementRE maxoccurs(Integer maxOccurs){
        this.setMaxOccurs(maxOccurs);
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
    public PSSysEAIElementRE memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MINOCCURS</B>&nbsp;最小出现次数
     */
    public final static String FIELD_MINOCCURS = "minoccurs";

    /**
     * 设置 最小出现次数
     * 
     * @param minOccurs
     * 
     */
    @JsonProperty(FIELD_MINOCCURS)
    public void setMinOccurs(Integer minOccurs){
        this.set(FIELD_MINOCCURS, minOccurs);
    }
    
    /**
     * 获取 最小出现次数  
     * @return
     */
    @JsonIgnore
    public Integer getMinOccurs(){
        Object objValue = this.get(FIELD_MINOCCURS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 最小出现次数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinOccursDirty(){
        if(this.contains(FIELD_MINOCCURS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 最小出现次数
     */
    @JsonIgnore
    public void resetMinOccurs(){
        this.reset(FIELD_MINOCCURS);
    }

    /**
     * 设置 最小出现次数
     * <P>
     * 等同 {@link #setMinOccurs}
     * @param minOccurs
     */
    @JsonIgnore
    public PSSysEAIElementRE minoccurs(Integer minOccurs){
        this.setMinOccurs(minOccurs);
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
    public PSSysEAIElementRE ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSSYSEAIDATATYPEID</B>&nbsp;集成数据类型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysEAIDataType} 
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
    public PSSysEAIElementRE pssyseaidatatypeid(String pSSysEAIDataTypeId){
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
    public PSSysEAIElementRE pssyseaidatatypeid(PSSysEAIDataType pSSysEAIDataType){
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
    public PSSysEAIElementRE pssyseaidatatypename(String pSSysEAIDataTypeName){
        this.setPSSysEAIDataTypeName(pSSysEAIDataTypeName);
        return this;
    }

    /**
     * <B>PSSYSEAIELEMENTID</B>&nbsp;集成元素
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysEAIElement} 
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
    public PSSysEAIElementRE pssyseaielementid(String pSSysEAIElementId){
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
    public PSSysEAIElementRE pssyseaielementid(PSSysEAIElement pSSysEAIElement){
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
    public PSSysEAIElementRE pssyseaielementname(String pSSysEAIElementName){
        this.setPSSysEAIElementName(pSSysEAIElementName);
        return this;
    }

    /**
     * <B>PSSYSEAIELEMENTREID</B>&nbsp;集成元素引用元素标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSEAIELEMENTREID = "pssyseaielementreid";

    /**
     * 设置 集成元素引用元素标识
     * 
     * @param pSSysEAIElementREId
     * 
     */
    @JsonProperty(FIELD_PSSYSEAIELEMENTREID)
    public void setPSSysEAIElementREId(String pSSysEAIElementREId){
        this.set(FIELD_PSSYSEAIELEMENTREID, pSSysEAIElementREId);
    }
    
    /**
     * 获取 集成元素引用元素标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAIElementREId(){
        Object objValue = this.get(FIELD_PSSYSEAIELEMENTREID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 集成元素引用元素标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAIElementREIdDirty(){
        if(this.contains(FIELD_PSSYSEAIELEMENTREID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 集成元素引用元素标识
     */
    @JsonIgnore
    public void resetPSSysEAIElementREId(){
        this.reset(FIELD_PSSYSEAIELEMENTREID);
    }

    /**
     * 设置 集成元素引用元素标识
     * <P>
     * 等同 {@link #setPSSysEAIElementREId}
     * @param pSSysEAIElementREId
     */
    @JsonIgnore
    public PSSysEAIElementRE pssyseaielementreid(String pSSysEAIElementREId){
        this.setPSSysEAIElementREId(pSSysEAIElementREId);
        return this;
    }

    /**
     * <B>PSSYSEAIELEMENTRENAME</B>&nbsp;引用元素名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSEAIELEMENTRENAME = "pssyseaielementrename";

    /**
     * 设置 引用元素名称
     * 
     * @param pSSysEAIElementREName
     * 
     */
    @JsonProperty(FIELD_PSSYSEAIELEMENTRENAME)
    public void setPSSysEAIElementREName(String pSSysEAIElementREName){
        this.set(FIELD_PSSYSEAIELEMENTRENAME, pSSysEAIElementREName);
    }
    
    /**
     * 获取 引用元素名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAIElementREName(){
        Object objValue = this.get(FIELD_PSSYSEAIELEMENTRENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用元素名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAIElementRENameDirty(){
        if(this.contains(FIELD_PSSYSEAIELEMENTRENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用元素名称
     */
    @JsonIgnore
    public void resetPSSysEAIElementREName(){
        this.reset(FIELD_PSSYSEAIELEMENTRENAME);
    }

    /**
     * 设置 引用元素名称
     * <P>
     * 等同 {@link #setPSSysEAIElementREName}
     * @param pSSysEAIElementREName
     */
    @JsonIgnore
    public PSSysEAIElementRE pssyseaielementrename(String pSSysEAIElementREName){
        this.setPSSysEAIElementREName(pSSysEAIElementREName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysEAIElementREName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysEAIElementREName(strName);
    }

    @JsonIgnore
    public PSSysEAIElementRE name(String strName){
        this.setPSSysEAIElementREName(strName);
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
    public PSSysEAIElementRE pssyseaischemeid(String pSSysEAISchemeId){
        this.setPSSysEAISchemeId(pSSysEAISchemeId);
        return this;
    }

    /**
     * <B>REFPSSYSEAIELEMENTID</B>&nbsp;引用集成元素
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysEAIElement} 
     */
    public final static String FIELD_REFPSSYSEAIELEMENTID = "refpssyseaielementid";

    /**
     * 设置 引用集成元素
     * 
     * @param refPSSysEAIElementId
     * 
     */
    @JsonProperty(FIELD_REFPSSYSEAIELEMENTID)
    public void setRefPSSysEAIElementId(String refPSSysEAIElementId){
        this.set(FIELD_REFPSSYSEAIELEMENTID, refPSSysEAIElementId);
    }
    
    /**
     * 获取 引用集成元素  
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
     * 判断 引用集成元素 是否指定值，包括空值
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
     * 重置 引用集成元素
     */
    @JsonIgnore
    public void resetRefPSSysEAIElementId(){
        this.reset(FIELD_REFPSSYSEAIELEMENTID);
    }

    /**
     * 设置 引用集成元素
     * <P>
     * 等同 {@link #setRefPSSysEAIElementId}
     * @param refPSSysEAIElementId
     */
    @JsonIgnore
    public PSSysEAIElementRE refpssyseaielementid(String refPSSysEAIElementId){
        this.setRefPSSysEAIElementId(refPSSysEAIElementId);
        return this;
    }

    /**
     * 设置 引用集成元素，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefPSSysEAIElementId}
     * @param pSSysEAIElement 引用对象
     */
    @JsonIgnore
    public PSSysEAIElementRE refpssyseaielementid(PSSysEAIElement pSSysEAIElement){
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
     * <B>REFPSSYSEAIELEMENTNAME</B>&nbsp;引用集成元素
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPSSYSEAIELEMENTID}
     */
    public final static String FIELD_REFPSSYSEAIELEMENTNAME = "refpssyseaielementname";

    /**
     * 设置 引用集成元素
     * 
     * @param refPSSysEAIElementName
     * 
     */
    @JsonProperty(FIELD_REFPSSYSEAIELEMENTNAME)
    public void setRefPSSysEAIElementName(String refPSSysEAIElementName){
        this.set(FIELD_REFPSSYSEAIELEMENTNAME, refPSSysEAIElementName);
    }
    
    /**
     * 获取 引用集成元素  
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
     * 判断 引用集成元素 是否指定值，包括空值
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
     * 重置 引用集成元素
     */
    @JsonIgnore
    public void resetRefPSSysEAIElementName(){
        this.reset(FIELD_REFPSSYSEAIELEMENTNAME);
    }

    /**
     * 设置 引用集成元素
     * <P>
     * 等同 {@link #setRefPSSysEAIElementName}
     * @param refPSSysEAIElementName
     */
    @JsonIgnore
    public PSSysEAIElementRE refpssyseaielementname(String refPSSysEAIElementName){
        this.setRefPSSysEAIElementName(refPSSysEAIElementName);
        return this;
    }

    /**
     * <B>RETAG</B>&nbsp;引用元素标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_RETAG = "retag";

    /**
     * 设置 引用元素标记
     * 
     * @param rETag
     * 
     */
    @JsonProperty(FIELD_RETAG)
    public void setRETag(String rETag){
        this.set(FIELD_RETAG, rETag);
    }
    
    /**
     * 获取 引用元素标记  
     * @return
     */
    @JsonIgnore
    public String getRETag(){
        Object objValue = this.get(FIELD_RETAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用元素标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRETagDirty(){
        if(this.contains(FIELD_RETAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用元素标记
     */
    @JsonIgnore
    public void resetRETag(){
        this.reset(FIELD_RETAG);
    }

    /**
     * 设置 引用元素标记
     * <P>
     * 等同 {@link #setRETag}
     * @param rETag
     */
    @JsonIgnore
    public PSSysEAIElementRE retag(String rETag){
        this.setRETag(rETag);
        return this;
    }

    /**
     * <B>RETAG2</B>&nbsp;引用元素标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_RETAG2 = "retag2";

    /**
     * 设置 引用元素标记2
     * 
     * @param rETag2
     * 
     */
    @JsonProperty(FIELD_RETAG2)
    public void setRETag2(String rETag2){
        this.set(FIELD_RETAG2, rETag2);
    }
    
    /**
     * 获取 引用元素标记2  
     * @return
     */
    @JsonIgnore
    public String getRETag2(){
        Object objValue = this.get(FIELD_RETAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用元素标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRETag2Dirty(){
        if(this.contains(FIELD_RETAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用元素标记2
     */
    @JsonIgnore
    public void resetRETag2(){
        this.reset(FIELD_RETAG2);
    }

    /**
     * 设置 引用元素标记2
     * <P>
     * 等同 {@link #setRETag2}
     * @param rETag2
     */
    @JsonIgnore
    public PSSysEAIElementRE retag2(String rETag2){
        this.setRETag2(rETag2);
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
    public PSSysEAIElementRE updatedate(String updateDate){
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
    public PSSysEAIElementRE updateman(String updateMan){
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
    public PSSysEAIElementRE usercat(String userCat){
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
    public PSSysEAIElementRE usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysEAIElementRE usertag(String userTag){
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
    public PSSysEAIElementRE usertag2(String userTag2){
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
    public PSSysEAIElementRE usertag3(String userTag3){
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
    public PSSysEAIElementRE usertag4(String userTag4){
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
    public PSSysEAIElementRE validflag(Integer validFlag){
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
    public PSSysEAIElementRE validflag(Boolean validFlag){
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
        return this.getPSSysEAIElementREId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysEAIElementREId(strValue);
    }

    @JsonIgnore
    public PSSysEAIElementRE id(String strValue){
        this.setPSSysEAIElementREId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysEAIElementRE){
            PSSysEAIElementRE model = (PSSysEAIElementRE)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
