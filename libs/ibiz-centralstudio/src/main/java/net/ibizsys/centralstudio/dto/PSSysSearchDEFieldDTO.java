package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSSEARCHDEFIELD</B>全文检索实体属性 模型传输对象
 * <P>
 * 全文检索实体属性的模型，定义全文检索文档与实体属性的关系
 */
public class PSSysSearchDEFieldDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysSearchDEFieldDTO(){
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定全文检索实体属性的代码标识，需在所在的全文检索实体中具备唯一性
     * <P>
     * 字符串：最大长度 50，由字母、数字、下划线组成，且开始必须为字母
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
    public PSSysSearchDEFieldDTO codename(String codeName){
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
    public PSSysSearchDEFieldDTO createdate(Timestamp createDate){
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
    public PSSysSearchDEFieldDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>FIELDTAG</B>&nbsp;属性标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_FIELDTAG = "fieldtag";

    /**
     * 设置 属性标记
     * 
     * @param fieldTag
     * 
     */
    @JsonProperty(FIELD_FIELDTAG)
    public void setFieldTag(String fieldTag){
        this.set(FIELD_FIELDTAG, fieldTag);
    }
    
    /**
     * 获取 属性标记  
     * @return
     */
    @JsonIgnore
    public String getFieldTag(){
        Object objValue = this.get(FIELD_FIELDTAG);
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
    public boolean isFieldTagDirty(){
        if(this.contains(FIELD_FIELDTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性标记
     */
    @JsonIgnore
    public void resetFieldTag(){
        this.reset(FIELD_FIELDTAG);
    }

    /**
     * 设置 属性标记
     * <P>
     * 等同 {@link #setFieldTag}
     * @param fieldTag
     */
    @JsonIgnore
    public PSSysSearchDEFieldDTO fieldtag(String fieldTag){
        this.setFieldTag(fieldTag);
        return this;
    }

    /**
     * <B>FIELDTAG2</B>&nbsp;属性标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_FIELDTAG2 = "fieldtag2";

    /**
     * 设置 属性标记2
     * 
     * @param fieldTag2
     * 
     */
    @JsonProperty(FIELD_FIELDTAG2)
    public void setFieldTag2(String fieldTag2){
        this.set(FIELD_FIELDTAG2, fieldTag2);
    }
    
    /**
     * 获取 属性标记2  
     * @return
     */
    @JsonIgnore
    public String getFieldTag2(){
        Object objValue = this.get(FIELD_FIELDTAG2);
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
    public boolean isFieldTag2Dirty(){
        if(this.contains(FIELD_FIELDTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性标记2
     */
    @JsonIgnore
    public void resetFieldTag2(){
        this.reset(FIELD_FIELDTAG2);
    }

    /**
     * 设置 属性标记2
     * <P>
     * 等同 {@link #setFieldTag2}
     * @param fieldTag2
     */
    @JsonIgnore
    public PSSysSearchDEFieldDTO fieldtag2(String fieldTag2){
        this.setFieldTag2(fieldTag2);
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
    public PSSysSearchDEFieldDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;排序，指定全文检索实体属性的排序值
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 排序，详细说明：{@link #FIELD_ORDERVALUE}
     * 
     * @param orderValue
     * 
     */
    @JsonProperty(FIELD_ORDERVALUE)
    public void setOrderValue(Integer orderValue){
        this.set(FIELD_ORDERVALUE, orderValue);
    }
    
    /**
     * 获取 排序  
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
     * 判断 排序 是否指定值，包括空值
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
     * 重置 排序
     */
    @JsonIgnore
    public void resetOrderValue(){
        this.reset(FIELD_ORDERVALUE);
    }

    /**
     * 设置 排序，详细说明：{@link #FIELD_ORDERVALUE}
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSSysSearchDEFieldDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSDEFID</B>&nbsp;实体属性，指定全文检索实体属性的实体属性对象，属性来自全文检索实体的实体对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_PSDEFID = "psdefid";

    /**
     * 设置 实体属性，详细说明：{@link #FIELD_PSDEFID}
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
     * 设置 实体属性，详细说明：{@link #FIELD_PSDEFID}
     * <P>
     * 等同 {@link #setPSDEFId}
     * @param pSDEFId
     */
    @JsonIgnore
    public PSSysSearchDEFieldDTO psdefid(String pSDEFId){
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
    public PSSysSearchDEFieldDTO psdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setPSDEFId(null);
            this.setPSDEFName(null);
            this.setPSDEId(null);
        }
        else{
            this.setPSDEFId(pSDEField.getPSDEFieldId());
            this.setPSDEFName(pSDEField.getPSDEFieldName());
            this.setPSDEId(pSDEField.getPSDEId());
        }
        return this;
    }

    /**
     * <B>PSDEFNAME</B>&nbsp;实体属性，指定全文检索实体属性的实体属性对象，属性来自全文检索实体的实体对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFID}
     */
    public final static String FIELD_PSDEFNAME = "psdefname";

    /**
     * 设置 实体属性，详细说明：{@link #FIELD_PSDEFNAME}
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
     * 设置 实体属性，详细说明：{@link #FIELD_PSDEFNAME}
     * <P>
     * 等同 {@link #setPSDEFName}
     * @param pSDEFName
     */
    @JsonIgnore
    public PSSysSearchDEFieldDTO psdefname(String pSDEFName){
        this.setPSDEFName(pSDEFName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFID}
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 实体标识
     * 
     * @param pSDEId
     * 
     */
    @JsonProperty(FIELD_PSDEID)
    public void setPSDEId(String pSDEId){
        this.set(FIELD_PSDEID, pSDEId);
    }
    
    /**
     * 获取 实体标识  
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
     * 判断 实体标识 是否指定值，包括空值
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
     * 重置 实体标识
     */
    @JsonIgnore
    public void resetPSDEId(){
        this.reset(FIELD_PSDEID);
    }

    /**
     * 设置 实体标识
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSSysSearchDEFieldDTO psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * <B>PSSYSSEARCHDEFIELDID</B>&nbsp;搜索实体属性标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSSEARCHDEFIELDID = "pssyssearchdefieldid";

    /**
     * 设置 搜索实体属性标识
     * 
     * @param pSSysSearchDEFieldId
     * 
     */
    @JsonProperty(FIELD_PSSYSSEARCHDEFIELDID)
    public void setPSSysSearchDEFieldId(String pSSysSearchDEFieldId){
        this.set(FIELD_PSSYSSEARCHDEFIELDID, pSSysSearchDEFieldId);
    }
    
    /**
     * 获取 搜索实体属性标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysSearchDEFieldId(){
        Object objValue = this.get(FIELD_PSSYSSEARCHDEFIELDID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 搜索实体属性标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSearchDEFieldIdDirty(){
        if(this.contains(FIELD_PSSYSSEARCHDEFIELDID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 搜索实体属性标识
     */
    @JsonIgnore
    public void resetPSSysSearchDEFieldId(){
        this.reset(FIELD_PSSYSSEARCHDEFIELDID);
    }

    /**
     * 设置 搜索实体属性标识
     * <P>
     * 等同 {@link #setPSSysSearchDEFieldId}
     * @param pSSysSearchDEFieldId
     */
    @JsonIgnore
    public PSSysSearchDEFieldDTO pssyssearchdefieldid(String pSSysSearchDEFieldId){
        this.setPSSysSearchDEFieldId(pSSysSearchDEFieldId);
        return this;
    }

    /**
     * <B>PSSYSSEARCHDEFIELDNAME</B>&nbsp;检索实体属性名称，指定全文检索实体属性的名称，需在所在的全文检索实体中具备唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSSEARCHDEFIELDNAME = "pssyssearchdefieldname";

    /**
     * 设置 检索实体属性名称，详细说明：{@link #FIELD_PSSYSSEARCHDEFIELDNAME}
     * 
     * @param pSSysSearchDEFieldName
     * 
     */
    @JsonProperty(FIELD_PSSYSSEARCHDEFIELDNAME)
    public void setPSSysSearchDEFieldName(String pSSysSearchDEFieldName){
        this.set(FIELD_PSSYSSEARCHDEFIELDNAME, pSSysSearchDEFieldName);
    }
    
    /**
     * 获取 检索实体属性名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysSearchDEFieldName(){
        Object objValue = this.get(FIELD_PSSYSSEARCHDEFIELDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 检索实体属性名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSearchDEFieldNameDirty(){
        if(this.contains(FIELD_PSSYSSEARCHDEFIELDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 检索实体属性名称
     */
    @JsonIgnore
    public void resetPSSysSearchDEFieldName(){
        this.reset(FIELD_PSSYSSEARCHDEFIELDNAME);
    }

    /**
     * 设置 检索实体属性名称，详细说明：{@link #FIELD_PSSYSSEARCHDEFIELDNAME}
     * <P>
     * 等同 {@link #setPSSysSearchDEFieldName}
     * @param pSSysSearchDEFieldName
     */
    @JsonIgnore
    public PSSysSearchDEFieldDTO pssyssearchdefieldname(String pSSysSearchDEFieldName){
        this.setPSSysSearchDEFieldName(pSSysSearchDEFieldName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysSearchDEFieldName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysSearchDEFieldName(strName);
    }

    @JsonIgnore
    public PSSysSearchDEFieldDTO name(String strName){
        this.setPSSysSearchDEFieldName(strName);
        return this;
    }

    /**
     * <B>PSSYSSEARCHDEID</B>&nbsp;实体搜索，指定全文检索实体属性所在的全文检索实体对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysSearchDEDTO} 
     */
    public final static String FIELD_PSSYSSEARCHDEID = "pssyssearchdeid";

    /**
     * 设置 实体搜索，详细说明：{@link #FIELD_PSSYSSEARCHDEID}
     * 
     * @param pSSysSearchDEId
     * 
     */
    @JsonProperty(FIELD_PSSYSSEARCHDEID)
    public void setPSSysSearchDEId(String pSSysSearchDEId){
        this.set(FIELD_PSSYSSEARCHDEID, pSSysSearchDEId);
    }
    
    /**
     * 获取 实体搜索  
     * @return
     */
    @JsonIgnore
    public String getPSSysSearchDEId(){
        Object objValue = this.get(FIELD_PSSYSSEARCHDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体搜索 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSearchDEIdDirty(){
        if(this.contains(FIELD_PSSYSSEARCHDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体搜索
     */
    @JsonIgnore
    public void resetPSSysSearchDEId(){
        this.reset(FIELD_PSSYSSEARCHDEID);
    }

    /**
     * 设置 实体搜索，详细说明：{@link #FIELD_PSSYSSEARCHDEID}
     * <P>
     * 等同 {@link #setPSSysSearchDEId}
     * @param pSSysSearchDEId
     */
    @JsonIgnore
    public PSSysSearchDEFieldDTO pssyssearchdeid(String pSSysSearchDEId){
        this.setPSSysSearchDEId(pSSysSearchDEId);
        return this;
    }

    /**
     * 设置 实体搜索，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSearchDEId}
     * @param pSSysSearchDE 引用对象
     */
    @JsonIgnore
    public PSSysSearchDEFieldDTO pssyssearchdeid(PSSysSearchDEDTO pSSysSearchDE){
        if(pSSysSearchDE == null){
            this.setPSSysSearchDEId(null);
            this.setPSSysSearchDEName(null);
            this.setPSSysSearchDocId(null);
        }
        else{
            this.setPSSysSearchDEId(pSSysSearchDE.getPSSysSearchDEId());
            this.setPSSysSearchDEName(pSSysSearchDE.getPSSysSearchDEName());
            this.setPSSysSearchDocId(pSSysSearchDE.getPSSysSearchDocId());
        }
        return this;
    }

    /**
     * <B>PSSYSSEARCHDENAME</B>&nbsp;全文检索实体，指定全文检索实体属性所在的全文检索实体对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSEARCHDEID}
     */
    public final static String FIELD_PSSYSSEARCHDENAME = "pssyssearchdename";

    /**
     * 设置 全文检索实体，详细说明：{@link #FIELD_PSSYSSEARCHDENAME}
     * 
     * @param pSSysSearchDEName
     * 
     */
    @JsonProperty(FIELD_PSSYSSEARCHDENAME)
    public void setPSSysSearchDEName(String pSSysSearchDEName){
        this.set(FIELD_PSSYSSEARCHDENAME, pSSysSearchDEName);
    }
    
    /**
     * 获取 全文检索实体  
     * @return
     */
    @JsonIgnore
    public String getPSSysSearchDEName(){
        Object objValue = this.get(FIELD_PSSYSSEARCHDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 全文检索实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSearchDENameDirty(){
        if(this.contains(FIELD_PSSYSSEARCHDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 全文检索实体
     */
    @JsonIgnore
    public void resetPSSysSearchDEName(){
        this.reset(FIELD_PSSYSSEARCHDENAME);
    }

    /**
     * 设置 全文检索实体，详细说明：{@link #FIELD_PSSYSSEARCHDENAME}
     * <P>
     * 等同 {@link #setPSSysSearchDEName}
     * @param pSSysSearchDEName
     */
    @JsonIgnore
    public PSSysSearchDEFieldDTO pssyssearchdename(String pSSysSearchDEName){
        this.setPSSysSearchDEName(pSSysSearchDEName);
        return this;
    }

    /**
     * <B>PSSYSSEARCHDOCID</B>&nbsp;全文检索文档
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSEARCHDEID}
     */
    public final static String FIELD_PSSYSSEARCHDOCID = "pssyssearchdocid";

    /**
     * 设置 全文检索文档
     * 
     * @param pSSysSearchDocId
     * 
     */
    @JsonProperty(FIELD_PSSYSSEARCHDOCID)
    public void setPSSysSearchDocId(String pSSysSearchDocId){
        this.set(FIELD_PSSYSSEARCHDOCID, pSSysSearchDocId);
    }
    
    /**
     * 获取 全文检索文档  
     * @return
     */
    @JsonIgnore
    public String getPSSysSearchDocId(){
        Object objValue = this.get(FIELD_PSSYSSEARCHDOCID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 全文检索文档 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSearchDocIdDirty(){
        if(this.contains(FIELD_PSSYSSEARCHDOCID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 全文检索文档
     */
    @JsonIgnore
    public void resetPSSysSearchDocId(){
        this.reset(FIELD_PSSYSSEARCHDOCID);
    }

    /**
     * 设置 全文检索文档
     * <P>
     * 等同 {@link #setPSSysSearchDocId}
     * @param pSSysSearchDocId
     */
    @JsonIgnore
    public PSSysSearchDEFieldDTO pssyssearchdocid(String pSSysSearchDocId){
        this.setPSSysSearchDocId(pSSysSearchDocId);
        return this;
    }

    /**
     * <B>PSSYSSEARCHFIELDID</B>&nbsp;索引属性，指定全文检索实体属性的检索文档属性对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysSearchFieldDTO} 
     */
    public final static String FIELD_PSSYSSEARCHFIELDID = "pssyssearchfieldid";

    /**
     * 设置 索引属性，详细说明：{@link #FIELD_PSSYSSEARCHFIELDID}
     * 
     * @param pSSysSearchFieldId
     * 
     */
    @JsonProperty(FIELD_PSSYSSEARCHFIELDID)
    public void setPSSysSearchFieldId(String pSSysSearchFieldId){
        this.set(FIELD_PSSYSSEARCHFIELDID, pSSysSearchFieldId);
    }
    
    /**
     * 获取 索引属性  
     * @return
     */
    @JsonIgnore
    public String getPSSysSearchFieldId(){
        Object objValue = this.get(FIELD_PSSYSSEARCHFIELDID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 索引属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSearchFieldIdDirty(){
        if(this.contains(FIELD_PSSYSSEARCHFIELDID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 索引属性
     */
    @JsonIgnore
    public void resetPSSysSearchFieldId(){
        this.reset(FIELD_PSSYSSEARCHFIELDID);
    }

    /**
     * 设置 索引属性，详细说明：{@link #FIELD_PSSYSSEARCHFIELDID}
     * <P>
     * 等同 {@link #setPSSysSearchFieldId}
     * @param pSSysSearchFieldId
     */
    @JsonIgnore
    public PSSysSearchDEFieldDTO pssyssearchfieldid(String pSSysSearchFieldId){
        this.setPSSysSearchFieldId(pSSysSearchFieldId);
        return this;
    }

    /**
     * 设置 索引属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSearchFieldId}
     * @param pSSysSearchField 引用对象
     */
    @JsonIgnore
    public PSSysSearchDEFieldDTO pssyssearchfieldid(PSSysSearchFieldDTO pSSysSearchField){
        if(pSSysSearchField == null){
            this.setPSSysSearchFieldId(null);
            this.setPSSysSearchFieldName(null);
        }
        else{
            this.setPSSysSearchFieldId(pSSysSearchField.getPSSysSearchFieldId());
            this.setPSSysSearchFieldName(pSSysSearchField.getPSSysSearchFieldName());
        }
        return this;
    }

    /**
     * <B>PSSYSSEARCHFIELDNAME</B>&nbsp;文档属性，指定全文检索实体属性的检索文档属性对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSEARCHFIELDID}
     */
    public final static String FIELD_PSSYSSEARCHFIELDNAME = "pssyssearchfieldname";

    /**
     * 设置 文档属性，详细说明：{@link #FIELD_PSSYSSEARCHFIELDNAME}
     * 
     * @param pSSysSearchFieldName
     * 
     */
    @JsonProperty(FIELD_PSSYSSEARCHFIELDNAME)
    public void setPSSysSearchFieldName(String pSSysSearchFieldName){
        this.set(FIELD_PSSYSSEARCHFIELDNAME, pSSysSearchFieldName);
    }
    
    /**
     * 获取 文档属性  
     * @return
     */
    @JsonIgnore
    public String getPSSysSearchFieldName(){
        Object objValue = this.get(FIELD_PSSYSSEARCHFIELDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 文档属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSearchFieldNameDirty(){
        if(this.contains(FIELD_PSSYSSEARCHFIELDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 文档属性
     */
    @JsonIgnore
    public void resetPSSysSearchFieldName(){
        this.reset(FIELD_PSSYSSEARCHFIELDNAME);
    }

    /**
     * 设置 文档属性，详细说明：{@link #FIELD_PSSYSSEARCHFIELDNAME}
     * <P>
     * 等同 {@link #setPSSysSearchFieldName}
     * @param pSSysSearchFieldName
     */
    @JsonIgnore
    public PSSysSearchDEFieldDTO pssyssearchfieldname(String pSSysSearchFieldName){
        this.setPSSysSearchFieldName(pSSysSearchFieldName);
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
    public PSSysSearchDEFieldDTO updatedate(Timestamp updateDate){
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
    public PSSysSearchDEFieldDTO updateman(String updateMan){
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
    public PSSysSearchDEFieldDTO usercat(String userCat){
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
    public PSSysSearchDEFieldDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSSysSearchDEFieldDTO usertag(String userTag){
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
    public PSSysSearchDEFieldDTO usertag2(String userTag2){
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
    public PSSysSearchDEFieldDTO usertag3(String userTag3){
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
    public PSSysSearchDEFieldDTO usertag4(String userTag4){
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
    public PSSysSearchDEFieldDTO validflag(Integer validFlag){
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
    public PSSysSearchDEFieldDTO validflag(Boolean validFlag){
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
        return this.getPSSysSearchDEFieldId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysSearchDEFieldId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysSearchDEFieldId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysSearchDEFieldId(strValue);
    }

    @JsonIgnore
    public PSSysSearchDEFieldDTO id(String strValue){
        this.setPSSysSearchDEFieldId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysSearchDEFieldDTO){
            PSSysSearchDEFieldDTO dto = (PSSysSearchDEFieldDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
