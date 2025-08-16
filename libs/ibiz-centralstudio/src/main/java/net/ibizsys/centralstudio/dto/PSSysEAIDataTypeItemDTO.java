package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSEAIDATATYPEITEM</B>集成数据类型项 模型传输对象
 * <P>
 * 
 */
public class PSSysEAIDataTypeItemDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysEAIDataTypeItemDTO(){
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
    public PSSysEAIDataTypeItemDTO codename(String codeName){
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
    public PSSysEAIDataTypeItemDTO createdate(Timestamp createDate){
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
    public PSSysEAIDataTypeItemDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DATA</B>&nbsp;项数据
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_DATA = "data";

    /**
     * 设置 项数据
     * 
     * @param data
     * 
     */
    @JsonProperty(FIELD_DATA)
    public void setData(String data){
        this.set(FIELD_DATA, data);
    }
    
    /**
     * 获取 项数据  
     * @return
     */
    @JsonIgnore
    public String getData(){
        Object objValue = this.get(FIELD_DATA);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项数据 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDataDirty(){
        if(this.contains(FIELD_DATA)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项数据
     */
    @JsonIgnore
    public void resetData(){
        this.reset(FIELD_DATA);
    }

    /**
     * 设置 项数据
     * <P>
     * 等同 {@link #setData}
     * @param data
     */
    @JsonIgnore
    public PSSysEAIDataTypeItemDTO data(String data){
        this.setData(data);
        return this;
    }

    /**
     * <B>EAIDATATYPEITEMTAG</B>&nbsp;数据类型项标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_EAIDATATYPEITEMTAG = "eaidatatypeitemtag";

    /**
     * 设置 数据类型项标记
     * 
     * @param eAIDataTypeItemTag
     * 
     */
    @JsonProperty(FIELD_EAIDATATYPEITEMTAG)
    public void setEAIDataTypeItemTag(String eAIDataTypeItemTag){
        this.set(FIELD_EAIDATATYPEITEMTAG, eAIDataTypeItemTag);
    }
    
    /**
     * 获取 数据类型项标记  
     * @return
     */
    @JsonIgnore
    public String getEAIDataTypeItemTag(){
        Object objValue = this.get(FIELD_EAIDATATYPEITEMTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据类型项标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEAIDataTypeItemTagDirty(){
        if(this.contains(FIELD_EAIDATATYPEITEMTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据类型项标记
     */
    @JsonIgnore
    public void resetEAIDataTypeItemTag(){
        this.reset(FIELD_EAIDATATYPEITEMTAG);
    }

    /**
     * 设置 数据类型项标记
     * <P>
     * 等同 {@link #setEAIDataTypeItemTag}
     * @param eAIDataTypeItemTag
     */
    @JsonIgnore
    public PSSysEAIDataTypeItemDTO eaidatatypeitemtag(String eAIDataTypeItemTag){
        this.setEAIDataTypeItemTag(eAIDataTypeItemTag);
        return this;
    }

    /**
     * <B>EAIDATATYPEITEMTAG2</B>&nbsp;数据类型项标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_EAIDATATYPEITEMTAG2 = "eaidatatypeitemtag2";

    /**
     * 设置 数据类型项标记2
     * 
     * @param eAIDataTypeItemTag2
     * 
     */
    @JsonProperty(FIELD_EAIDATATYPEITEMTAG2)
    public void setEAIDataTypeItemTag2(String eAIDataTypeItemTag2){
        this.set(FIELD_EAIDATATYPEITEMTAG2, eAIDataTypeItemTag2);
    }
    
    /**
     * 获取 数据类型项标记2  
     * @return
     */
    @JsonIgnore
    public String getEAIDataTypeItemTag2(){
        Object objValue = this.get(FIELD_EAIDATATYPEITEMTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据类型项标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEAIDataTypeItemTag2Dirty(){
        if(this.contains(FIELD_EAIDATATYPEITEMTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据类型项标记2
     */
    @JsonIgnore
    public void resetEAIDataTypeItemTag2(){
        this.reset(FIELD_EAIDATATYPEITEMTAG2);
    }

    /**
     * 设置 数据类型项标记2
     * <P>
     * 等同 {@link #setEAIDataTypeItemTag2}
     * @param eAIDataTypeItemTag2
     */
    @JsonIgnore
    public PSSysEAIDataTypeItemDTO eaidatatypeitemtag2(String eAIDataTypeItemTag2){
        this.setEAIDataTypeItemTag2(eAIDataTypeItemTag2);
        return this;
    }

    /**
     * <B>MEMO</B>&nbsp;备注
     * <P>
     * 字符串：最大长度 4000
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
    public PSSysEAIDataTypeItemDTO memo(String memo){
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
    public PSSysEAIDataTypeItemDTO ordervalue(Integer orderValue){
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
    public PSSysEAIDataTypeItemDTO pssyseaidatatypeid(String pSSysEAIDataTypeId){
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
    public PSSysEAIDataTypeItemDTO pssyseaidatatypeid(PSSysEAIDataTypeDTO pSSysEAIDataType){
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
     * <B>PSSYSEAIDATATYPEITEMID</B>&nbsp;数据类型项标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSEAIDATATYPEITEMID = "pssyseaidatatypeitemid";

    /**
     * 设置 数据类型项标识
     * 
     * @param pSSysEAIDataTypeItemId
     * 
     */
    @JsonProperty(FIELD_PSSYSEAIDATATYPEITEMID)
    public void setPSSysEAIDataTypeItemId(String pSSysEAIDataTypeItemId){
        this.set(FIELD_PSSYSEAIDATATYPEITEMID, pSSysEAIDataTypeItemId);
    }
    
    /**
     * 获取 数据类型项标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAIDataTypeItemId(){
        Object objValue = this.get(FIELD_PSSYSEAIDATATYPEITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据类型项标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAIDataTypeItemIdDirty(){
        if(this.contains(FIELD_PSSYSEAIDATATYPEITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据类型项标识
     */
    @JsonIgnore
    public void resetPSSysEAIDataTypeItemId(){
        this.reset(FIELD_PSSYSEAIDATATYPEITEMID);
    }

    /**
     * 设置 数据类型项标识
     * <P>
     * 等同 {@link #setPSSysEAIDataTypeItemId}
     * @param pSSysEAIDataTypeItemId
     */
    @JsonIgnore
    public PSSysEAIDataTypeItemDTO pssyseaidatatypeitemid(String pSSysEAIDataTypeItemId){
        this.setPSSysEAIDataTypeItemId(pSSysEAIDataTypeItemId);
        return this;
    }

    /**
     * <B>PSSYSEAIDATATYPEITEMNAME</B>&nbsp;项名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSEAIDATATYPEITEMNAME = "pssyseaidatatypeitemname";

    /**
     * 设置 项名称
     * 
     * @param pSSysEAIDataTypeItemName
     * 
     */
    @JsonProperty(FIELD_PSSYSEAIDATATYPEITEMNAME)
    public void setPSSysEAIDataTypeItemName(String pSSysEAIDataTypeItemName){
        this.set(FIELD_PSSYSEAIDATATYPEITEMNAME, pSSysEAIDataTypeItemName);
    }
    
    /**
     * 获取 项名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAIDataTypeItemName(){
        Object objValue = this.get(FIELD_PSSYSEAIDATATYPEITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAIDataTypeItemNameDirty(){
        if(this.contains(FIELD_PSSYSEAIDATATYPEITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项名称
     */
    @JsonIgnore
    public void resetPSSysEAIDataTypeItemName(){
        this.reset(FIELD_PSSYSEAIDATATYPEITEMNAME);
    }

    /**
     * 设置 项名称
     * <P>
     * 等同 {@link #setPSSysEAIDataTypeItemName}
     * @param pSSysEAIDataTypeItemName
     */
    @JsonIgnore
    public PSSysEAIDataTypeItemDTO pssyseaidatatypeitemname(String pSSysEAIDataTypeItemName){
        this.setPSSysEAIDataTypeItemName(pSSysEAIDataTypeItemName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysEAIDataTypeItemName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysEAIDataTypeItemName(strName);
    }

    @JsonIgnore
    public PSSysEAIDataTypeItemDTO name(String strName){
        this.setPSSysEAIDataTypeItemName(strName);
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
    public PSSysEAIDataTypeItemDTO pssyseaidatatypename(String pSSysEAIDataTypeName){
        this.setPSSysEAIDataTypeName(pSSysEAIDataTypeName);
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
    public PSSysEAIDataTypeItemDTO updatedate(Timestamp updateDate){
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
    public PSSysEAIDataTypeItemDTO updateman(String updateMan){
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
    public PSSysEAIDataTypeItemDTO usercat(String userCat){
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
    public PSSysEAIDataTypeItemDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat.value);
        }
        return this;
    }

    /**
     * <B>USERTAG</B>&nbsp;用户标识
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_USERTAG = "usertag";

    /**
     * 设置 用户标识
     * 
     * @param userTag
     * 
     */
    @JsonProperty(FIELD_USERTAG)
    public void setUserTag(String userTag){
        this.set(FIELD_USERTAG, userTag);
    }
    
    /**
     * 获取 用户标识  
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
     * 判断 用户标识 是否指定值，包括空值
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
     * 重置 用户标识
     */
    @JsonIgnore
    public void resetUserTag(){
        this.reset(FIELD_USERTAG);
    }

    /**
     * 设置 用户标识
     * <P>
     * 等同 {@link #setUserTag}
     * @param userTag
     */
    @JsonIgnore
    public PSSysEAIDataTypeItemDTO usertag(String userTag){
        this.setUserTag(userTag);
        return this;
    }

    /**
     * <B>USERTAG2</B>&nbsp;用户标识2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_USERTAG2 = "usertag2";

    /**
     * 设置 用户标识2
     * 
     * @param userTag2
     * 
     */
    @JsonProperty(FIELD_USERTAG2)
    public void setUserTag2(String userTag2){
        this.set(FIELD_USERTAG2, userTag2);
    }
    
    /**
     * 获取 用户标识2  
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
     * 判断 用户标识2 是否指定值，包括空值
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
     * 重置 用户标识2
     */
    @JsonIgnore
    public void resetUserTag2(){
        this.reset(FIELD_USERTAG2);
    }

    /**
     * 设置 用户标识2
     * <P>
     * 等同 {@link #setUserTag2}
     * @param userTag2
     */
    @JsonIgnore
    public PSSysEAIDataTypeItemDTO usertag2(String userTag2){
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
    public PSSysEAIDataTypeItemDTO usertag3(String userTag3){
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
    public PSSysEAIDataTypeItemDTO usertag4(String userTag4){
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
    public PSSysEAIDataTypeItemDTO validflag(Integer validFlag){
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
    public PSSysEAIDataTypeItemDTO validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>VALUE</B>&nbsp;项值
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_VALUE = "value";

    /**
     * 设置 项值
     * 
     * @param value
     * 
     */
    @JsonProperty(FIELD_VALUE)
    public void setValue(String value){
        this.set(FIELD_VALUE, value);
    }
    
    /**
     * 获取 项值  
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
     * 判断 项值 是否指定值，包括空值
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
     * 重置 项值
     */
    @JsonIgnore
    public void resetValue(){
        this.reset(FIELD_VALUE);
    }

    /**
     * 设置 项值
     * <P>
     * 等同 {@link #setValue}
     * @param value
     */
    @JsonIgnore
    public PSSysEAIDataTypeItemDTO value(String value){
        this.setValue(value);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSSysEAIDataTypeItemId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysEAIDataTypeItemId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysEAIDataTypeItemId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysEAIDataTypeItemId(strValue);
    }

    @JsonIgnore
    public PSSysEAIDataTypeItemDTO id(String strValue){
        this.setPSSysEAIDataTypeItemId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysEAIDataTypeItemDTO){
            PSSysEAIDataTypeItemDTO dto = (PSSysEAIDataTypeItemDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
