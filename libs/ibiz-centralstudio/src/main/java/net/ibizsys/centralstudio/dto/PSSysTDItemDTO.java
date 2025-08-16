package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSTDITEM</B>系统测试数据项 模型传输对象
 * <P>
 * 系统测试数据项模型，定义测试数据的数据项逻辑
 */
public class PSSysTDItemDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysTDItemDTO(){
    }      

    /**
     * <B>BADVALUE</B>&nbsp;坏值
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_BADVALUE = "badvalue";

    /**
     * 设置 坏值
     * 
     * @param badValue
     * 
     */
    @JsonProperty(FIELD_BADVALUE)
    public void setBadValue(String badValue){
        this.set(FIELD_BADVALUE, badValue);
    }
    
    /**
     * 获取 坏值  
     * @return
     */
    @JsonIgnore
    public String getBadValue(){
        Object objValue = this.get(FIELD_BADVALUE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 坏值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBadValueDirty(){
        if(this.contains(FIELD_BADVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 坏值
     */
    @JsonIgnore
    public void resetBadValue(){
        this.reset(FIELD_BADVALUE);
    }

    /**
     * 设置 坏值
     * <P>
     * 等同 {@link #setBadValue}
     * @param badValue
     */
    @JsonIgnore
    public PSSysTDItemDTO badvalue(String badValue){
        this.setBadValue(badValue);
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
    public PSSysTDItemDTO createdate(Timestamp createDate){
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
    public PSSysTDItemDTO createman(String createMan){
        this.setCreateMan(createMan);
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
    public PSSysTDItemDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;测试顺序
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 测试顺序
     * 
     * @param orderValue
     * 
     */
    @JsonProperty(FIELD_ORDERVALUE)
    public void setOrderValue(Integer orderValue){
        this.set(FIELD_ORDERVALUE, orderValue);
    }
    
    /**
     * 获取 测试顺序  
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
     * 判断 测试顺序 是否指定值，包括空值
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
     * 重置 测试顺序
     */
    @JsonIgnore
    public void resetOrderValue(){
        this.reset(FIELD_ORDERVALUE);
    }

    /**
     * 设置 测试顺序
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSSysTDItemDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSCODELISTID</B>&nbsp;引用代码表，值类型为【代码表随机值】指定数据项的相关代码表，未定义时使用相关属性的代码表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSCodeListDTO} 
     */
    public final static String FIELD_PSCODELISTID = "pscodelistid";

    /**
     * 设置 引用代码表，详细说明：{@link #FIELD_PSCODELISTID}
     * 
     * @param pSCodeListId
     * 
     */
    @JsonProperty(FIELD_PSCODELISTID)
    public void setPSCodeListId(String pSCodeListId){
        this.set(FIELD_PSCODELISTID, pSCodeListId);
    }
    
    /**
     * 获取 引用代码表  
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
     * 判断 引用代码表 是否指定值，包括空值
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
     * 重置 引用代码表
     */
    @JsonIgnore
    public void resetPSCodeListId(){
        this.reset(FIELD_PSCODELISTID);
    }

    /**
     * 设置 引用代码表，详细说明：{@link #FIELD_PSCODELISTID}
     * <P>
     * 等同 {@link #setPSCodeListId}
     * @param pSCodeListId
     */
    @JsonIgnore
    public PSSysTDItemDTO pscodelistid(String pSCodeListId){
        this.setPSCodeListId(pSCodeListId);
        return this;
    }

    /**
     * 设置 引用代码表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSCodeListId}
     * @param pSCodeList 引用对象
     */
    @JsonIgnore
    public PSSysTDItemDTO pscodelistid(PSCodeListDTO pSCodeList){
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
     * <B>PSCODELISTNAME</B>&nbsp;引用代码表，值类型为【代码表随机值】指定数据项的相关代码表，未定义时使用相关属性的代码表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCODELISTID}
     */
    public final static String FIELD_PSCODELISTNAME = "pscodelistname";

    /**
     * 设置 引用代码表，详细说明：{@link #FIELD_PSCODELISTNAME}
     * 
     * @param pSCodeListName
     * 
     */
    @JsonProperty(FIELD_PSCODELISTNAME)
    public void setPSCodeListName(String pSCodeListName){
        this.set(FIELD_PSCODELISTNAME, pSCodeListName);
    }
    
    /**
     * 获取 引用代码表  
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
     * 判断 引用代码表 是否指定值，包括空值
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
     * 重置 引用代码表
     */
    @JsonIgnore
    public void resetPSCodeListName(){
        this.reset(FIELD_PSCODELISTNAME);
    }

    /**
     * 设置 引用代码表，详细说明：{@link #FIELD_PSCODELISTNAME}
     * <P>
     * 等同 {@link #setPSCodeListName}
     * @param pSCodeListName
     */
    @JsonIgnore
    public PSSysTDItemDTO pscodelistname(String pSCodeListName){
        this.setPSCodeListName(pSCodeListName);
        return this;
    }

    /**
     * <B>PSDEFID</B>&nbsp;实体属性，指定数据项的相关实体属性
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
    public PSSysTDItemDTO psdefid(String pSDEFId){
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
    public PSSysTDItemDTO psdefid(PSDEFieldDTO pSDEField){
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
     * <B>PSDEFNAME</B>&nbsp;实体属性，指定数据项的相关实体属性
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
    public PSSysTDItemDTO psdefname(String pSDEFName){
        this.setPSDEFName(pSDEFName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSTESTDATAID}
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
    public PSSysTDItemDTO psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * <B>PSSYSSAMPLEVALUEID</B>&nbsp;系统示例值，指定数据项引用的系统示例值，值类型为【直接值】或【值范围】时当前未定义时使用系统示例值配置
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysSampleValueDTO} 
     */
    public final static String FIELD_PSSYSSAMPLEVALUEID = "pssyssamplevalueid";

    /**
     * 设置 系统示例值，详细说明：{@link #FIELD_PSSYSSAMPLEVALUEID}
     * 
     * @param pSSysSampleValueId
     * 
     */
    @JsonProperty(FIELD_PSSYSSAMPLEVALUEID)
    public void setPSSysSampleValueId(String pSSysSampleValueId){
        this.set(FIELD_PSSYSSAMPLEVALUEID, pSSysSampleValueId);
    }
    
    /**
     * 获取 系统示例值  
     * @return
     */
    @JsonIgnore
    public String getPSSysSampleValueId(){
        Object objValue = this.get(FIELD_PSSYSSAMPLEVALUEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统示例值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSampleValueIdDirty(){
        if(this.contains(FIELD_PSSYSSAMPLEVALUEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统示例值
     */
    @JsonIgnore
    public void resetPSSysSampleValueId(){
        this.reset(FIELD_PSSYSSAMPLEVALUEID);
    }

    /**
     * 设置 系统示例值，详细说明：{@link #FIELD_PSSYSSAMPLEVALUEID}
     * <P>
     * 等同 {@link #setPSSysSampleValueId}
     * @param pSSysSampleValueId
     */
    @JsonIgnore
    public PSSysTDItemDTO pssyssamplevalueid(String pSSysSampleValueId){
        this.setPSSysSampleValueId(pSSysSampleValueId);
        return this;
    }

    /**
     * 设置 系统示例值，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSampleValueId}
     * @param pSSysSampleValue 引用对象
     */
    @JsonIgnore
    public PSSysTDItemDTO pssyssamplevalueid(PSSysSampleValueDTO pSSysSampleValue){
        if(pSSysSampleValue == null){
            this.setPSSysSampleValueId(null);
            this.setPSSysSampleValueName(null);
        }
        else{
            this.setPSSysSampleValueId(pSSysSampleValue.getPSSysSampleValueId());
            this.setPSSysSampleValueName(pSSysSampleValue.getPSSysSampleValueName());
        }
        return this;
    }

    /**
     * <B>PSSYSSAMPLEVALUENAME</B>&nbsp;系统示例值，指定数据项引用的系统示例值，值类型为【直接值】或【值范围】时当前未定义时使用系统示例值配置
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSAMPLEVALUEID}
     */
    public final static String FIELD_PSSYSSAMPLEVALUENAME = "pssyssamplevaluename";

    /**
     * 设置 系统示例值，详细说明：{@link #FIELD_PSSYSSAMPLEVALUENAME}
     * 
     * @param pSSysSampleValueName
     * 
     */
    @JsonProperty(FIELD_PSSYSSAMPLEVALUENAME)
    public void setPSSysSampleValueName(String pSSysSampleValueName){
        this.set(FIELD_PSSYSSAMPLEVALUENAME, pSSysSampleValueName);
    }
    
    /**
     * 获取 系统示例值  
     * @return
     */
    @JsonIgnore
    public String getPSSysSampleValueName(){
        Object objValue = this.get(FIELD_PSSYSSAMPLEVALUENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统示例值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSampleValueNameDirty(){
        if(this.contains(FIELD_PSSYSSAMPLEVALUENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统示例值
     */
    @JsonIgnore
    public void resetPSSysSampleValueName(){
        this.reset(FIELD_PSSYSSAMPLEVALUENAME);
    }

    /**
     * 设置 系统示例值，详细说明：{@link #FIELD_PSSYSSAMPLEVALUENAME}
     * <P>
     * 等同 {@link #setPSSysSampleValueName}
     * @param pSSysSampleValueName
     */
    @JsonIgnore
    public PSSysTDItemDTO pssyssamplevaluename(String pSSysSampleValueName){
        this.setPSSysSampleValueName(pSSysSampleValueName);
        return this;
    }

    /**
     * <B>PSSYSTDITEMID</B>&nbsp;系统测试数据项标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSTDITEMID = "pssystditemid";

    /**
     * 设置 系统测试数据项标识
     * 
     * @param pSSysTDItemId
     * 
     */
    @JsonProperty(FIELD_PSSYSTDITEMID)
    public void setPSSysTDItemId(String pSSysTDItemId){
        this.set(FIELD_PSSYSTDITEMID, pSSysTDItemId);
    }
    
    /**
     * 获取 系统测试数据项标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysTDItemId(){
        Object objValue = this.get(FIELD_PSSYSTDITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统测试数据项标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysTDItemIdDirty(){
        if(this.contains(FIELD_PSSYSTDITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统测试数据项标识
     */
    @JsonIgnore
    public void resetPSSysTDItemId(){
        this.reset(FIELD_PSSYSTDITEMID);
    }

    /**
     * 设置 系统测试数据项标识
     * <P>
     * 等同 {@link #setPSSysTDItemId}
     * @param pSSysTDItemId
     */
    @JsonIgnore
    public PSSysTDItemDTO pssystditemid(String pSSysTDItemId){
        this.setPSSysTDItemId(pSSysTDItemId);
        return this;
    }

    /**
     * <B>PSSYSTDITEMNAME</B>&nbsp;数据项标识，指定数据项的标识，需在所属测试数据中具备唯一性
     * <P>
     * 字符串：最大长度 50，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSSYSTDITEMNAME = "pssystditemname";

    /**
     * 设置 数据项标识，详细说明：{@link #FIELD_PSSYSTDITEMNAME}
     * 
     * @param pSSysTDItemName
     * 
     */
    @JsonProperty(FIELD_PSSYSTDITEMNAME)
    public void setPSSysTDItemName(String pSSysTDItemName){
        this.set(FIELD_PSSYSTDITEMNAME, pSSysTDItemName);
    }
    
    /**
     * 获取 数据项标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysTDItemName(){
        Object objValue = this.get(FIELD_PSSYSTDITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据项标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysTDItemNameDirty(){
        if(this.contains(FIELD_PSSYSTDITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据项标识
     */
    @JsonIgnore
    public void resetPSSysTDItemName(){
        this.reset(FIELD_PSSYSTDITEMNAME);
    }

    /**
     * 设置 数据项标识，详细说明：{@link #FIELD_PSSYSTDITEMNAME}
     * <P>
     * 等同 {@link #setPSSysTDItemName}
     * @param pSSysTDItemName
     */
    @JsonIgnore
    public PSSysTDItemDTO pssystditemname(String pSSysTDItemName){
        this.setPSSysTDItemName(pSSysTDItemName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysTDItemName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysTDItemName(strName);
    }

    @JsonIgnore
    public PSSysTDItemDTO name(String strName){
        this.setPSSysTDItemName(strName);
        return this;
    }

    /**
     * <B>PSSYSTESTDATAID</B>&nbsp;系统测试数据，指定数据项的所属测试数据
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysTestDataDTO} 
     */
    public final static String FIELD_PSSYSTESTDATAID = "pssystestdataid";

    /**
     * 设置 系统测试数据，详细说明：{@link #FIELD_PSSYSTESTDATAID}
     * 
     * @param pSSysTestDataId
     * 
     */
    @JsonProperty(FIELD_PSSYSTESTDATAID)
    public void setPSSysTestDataId(String pSSysTestDataId){
        this.set(FIELD_PSSYSTESTDATAID, pSSysTestDataId);
    }
    
    /**
     * 获取 系统测试数据  
     * @return
     */
    @JsonIgnore
    public String getPSSysTestDataId(){
        Object objValue = this.get(FIELD_PSSYSTESTDATAID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统测试数据 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysTestDataIdDirty(){
        if(this.contains(FIELD_PSSYSTESTDATAID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统测试数据
     */
    @JsonIgnore
    public void resetPSSysTestDataId(){
        this.reset(FIELD_PSSYSTESTDATAID);
    }

    /**
     * 设置 系统测试数据，详细说明：{@link #FIELD_PSSYSTESTDATAID}
     * <P>
     * 等同 {@link #setPSSysTestDataId}
     * @param pSSysTestDataId
     */
    @JsonIgnore
    public PSSysTDItemDTO pssystestdataid(String pSSysTestDataId){
        this.setPSSysTestDataId(pSSysTestDataId);
        return this;
    }

    /**
     * 设置 系统测试数据，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysTestDataId}
     * @param pSSysTestData 引用对象
     */
    @JsonIgnore
    public PSSysTDItemDTO pssystestdataid(PSSysTestDataDTO pSSysTestData){
        if(pSSysTestData == null){
            this.setPSDEId(null);
            this.setPSSysTestDataId(null);
            this.setPSSysTestDataName(null);
        }
        else{
            this.setPSDEId(pSSysTestData.getPSDEId());
            this.setPSSysTestDataId(pSSysTestData.getPSSysTestDataId());
            this.setPSSysTestDataName(pSSysTestData.getPSSysTestDataName());
        }
        return this;
    }

    /**
     * <B>PSSYSTESTDATANAME</B>&nbsp;系统测试数据，指定数据项的所属测试数据
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSTESTDATAID}
     */
    public final static String FIELD_PSSYSTESTDATANAME = "pssystestdataname";

    /**
     * 设置 系统测试数据，详细说明：{@link #FIELD_PSSYSTESTDATANAME}
     * 
     * @param pSSysTestDataName
     * 
     */
    @JsonProperty(FIELD_PSSYSTESTDATANAME)
    public void setPSSysTestDataName(String pSSysTestDataName){
        this.set(FIELD_PSSYSTESTDATANAME, pSSysTestDataName);
    }
    
    /**
     * 获取 系统测试数据  
     * @return
     */
    @JsonIgnore
    public String getPSSysTestDataName(){
        Object objValue = this.get(FIELD_PSSYSTESTDATANAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统测试数据 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysTestDataNameDirty(){
        if(this.contains(FIELD_PSSYSTESTDATANAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统测试数据
     */
    @JsonIgnore
    public void resetPSSysTestDataName(){
        this.reset(FIELD_PSSYSTESTDATANAME);
    }

    /**
     * 设置 系统测试数据，详细说明：{@link #FIELD_PSSYSTESTDATANAME}
     * <P>
     * 等同 {@link #setPSSysTestDataName}
     * @param pSSysTestDataName
     */
    @JsonIgnore
    public PSSysTDItemDTO pssystestdataname(String pSSysTestDataName){
        this.setPSSysTestDataName(pSSysTestDataName);
        return this;
    }

    /**
     * <B>REFPSDEID</B>&nbsp;引用实体，值类型为【外键随机值】指定数据项引用的实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDataEntityDTO} 
     */
    public final static String FIELD_REFPSDEID = "refpsdeid";

    /**
     * 设置 引用实体，详细说明：{@link #FIELD_REFPSDEID}
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
     * 设置 引用实体，详细说明：{@link #FIELD_REFPSDEID}
     * <P>
     * 等同 {@link #setRefPSDEId}
     * @param refPSDEId
     */
    @JsonIgnore
    public PSSysTDItemDTO refpsdeid(String refPSDEId){
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
    public PSSysTDItemDTO refpsdeid(PSDataEntityDTO pSDataEntity){
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
     * <B>REFPSDENAME</B>&nbsp;引用实体，值类型为【外键随机值】指定数据项引用的实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPSDEID}
     */
    public final static String FIELD_REFPSDENAME = "refpsdename";

    /**
     * 设置 引用实体，详细说明：{@link #FIELD_REFPSDENAME}
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
     * 设置 引用实体，详细说明：{@link #FIELD_REFPSDENAME}
     * <P>
     * 等同 {@link #setRefPSDEName}
     * @param refPSDEName
     */
    @JsonIgnore
    public PSSysTDItemDTO refpsdename(String refPSDEName){
        this.setRefPSDEName(refPSDEName);
        return this;
    }

    /**
     * <B>REFPSSYSTESTDATAID</B>&nbsp;引用测试数据
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysTestDataDTO} 
     */
    public final static String FIELD_REFPSSYSTESTDATAID = "refpssystestdataid";

    /**
     * 设置 引用测试数据
     * 
     * @param refPSSysTestDataId
     * 
     */
    @JsonProperty(FIELD_REFPSSYSTESTDATAID)
    public void setRefPSSysTestDataId(String refPSSysTestDataId){
        this.set(FIELD_REFPSSYSTESTDATAID, refPSSysTestDataId);
    }
    
    /**
     * 获取 引用测试数据  
     * @return
     */
    @JsonIgnore
    public String getRefPSSysTestDataId(){
        Object objValue = this.get(FIELD_REFPSSYSTESTDATAID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用测试数据 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSSysTestDataIdDirty(){
        if(this.contains(FIELD_REFPSSYSTESTDATAID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用测试数据
     */
    @JsonIgnore
    public void resetRefPSSysTestDataId(){
        this.reset(FIELD_REFPSSYSTESTDATAID);
    }

    /**
     * 设置 引用测试数据
     * <P>
     * 等同 {@link #setRefPSSysTestDataId}
     * @param refPSSysTestDataId
     */
    @JsonIgnore
    public PSSysTDItemDTO refpssystestdataid(String refPSSysTestDataId){
        this.setRefPSSysTestDataId(refPSSysTestDataId);
        return this;
    }

    /**
     * 设置 引用测试数据，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefPSSysTestDataId}
     * @param pSSysTestData 引用对象
     */
    @JsonIgnore
    public PSSysTDItemDTO refpssystestdataid(PSSysTestDataDTO pSSysTestData){
        if(pSSysTestData == null){
            this.setRefPSSysTestDataId(null);
            this.setRefPSSysTestDataName(null);
        }
        else{
            this.setRefPSSysTestDataId(pSSysTestData.getPSSysTestDataId());
            this.setRefPSSysTestDataName(pSSysTestData.getPSSysTestDataName());
        }
        return this;
    }

    /**
     * <B>REFPSSYSTESTDATANAME</B>&nbsp;引用测试数据
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPSSYSTESTDATAID}
     */
    public final static String FIELD_REFPSSYSTESTDATANAME = "refpssystestdataname";

    /**
     * 设置 引用测试数据
     * 
     * @param refPSSysTestDataName
     * 
     */
    @JsonProperty(FIELD_REFPSSYSTESTDATANAME)
    public void setRefPSSysTestDataName(String refPSSysTestDataName){
        this.set(FIELD_REFPSSYSTESTDATANAME, refPSSysTestDataName);
    }
    
    /**
     * 获取 引用测试数据  
     * @return
     */
    @JsonIgnore
    public String getRefPSSysTestDataName(){
        Object objValue = this.get(FIELD_REFPSSYSTESTDATANAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用测试数据 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSSysTestDataNameDirty(){
        if(this.contains(FIELD_REFPSSYSTESTDATANAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用测试数据
     */
    @JsonIgnore
    public void resetRefPSSysTestDataName(){
        this.reset(FIELD_REFPSSYSTESTDATANAME);
    }

    /**
     * 设置 引用测试数据
     * <P>
     * 等同 {@link #setRefPSSysTestDataName}
     * @param refPSSysTestDataName
     */
    @JsonIgnore
    public PSSysTDItemDTO refpssystestdataname(String refPSSysTestDataName){
        this.setRefPSSysTestDataName(refPSSysTestDataName);
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
    public PSSysTDItemDTO updatedate(Timestamp updateDate){
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
    public PSSysTDItemDTO updateman(String updateMan){
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
    public PSSysTDItemDTO usercat(String userCat){
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
    public PSSysTDItemDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
     * 字符串：最大长度 100
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
    public PSSysTDItemDTO usertag(String userTag){
        this.setUserTag(userTag);
        return this;
    }

    /**
     * <B>USERTAG2</B>&nbsp;用户标识2
     * <P>
     * 字符串：最大长度 100
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
    public PSSysTDItemDTO usertag2(String userTag2){
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
    public PSSysTDItemDTO usertag3(String userTag3){
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
    public PSSysTDItemDTO usertag4(String userTag4){
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
    public PSSysTDItemDTO validflag(Integer validFlag){
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
    public PSSysTDItemDTO validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>VALUE</B>&nbsp;值，值类型为【直接值】指定数据项的直接值
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_VALUE = "value";

    /**
     * 设置 值，详细说明：{@link #FIELD_VALUE}
     * 
     * @param value
     * 
     */
    @JsonProperty(FIELD_VALUE)
    public void setValue(String value){
        this.set(FIELD_VALUE, value);
    }
    
    /**
     * 获取 值  
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
     * 判断 值 是否指定值，包括空值
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
     * 重置 值
     */
    @JsonIgnore
    public void resetValue(){
        this.reset(FIELD_VALUE);
    }

    /**
     * 设置 值，详细说明：{@link #FIELD_VALUE}
     * <P>
     * 等同 {@link #setValue}
     * @param value
     */
    @JsonIgnore
    public PSSysTDItemDTO value(String value){
        this.setValue(value);
        return this;
    }

    /**
     * <B>VALUERANGE</B>&nbsp;值范围，值类型为【值范围】指定数据项的值范围，多值使用【;】分隔
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_VALUERANGE = "valuerange";

    /**
     * 设置 值范围，详细说明：{@link #FIELD_VALUERANGE}
     * 
     * @param valueRange
     * 
     */
    @JsonProperty(FIELD_VALUERANGE)
    public void setValueRange(String valueRange){
        this.set(FIELD_VALUERANGE, valueRange);
    }
    
    /**
     * 获取 值范围  
     * @return
     */
    @JsonIgnore
    public String getValueRange(){
        Object objValue = this.get(FIELD_VALUERANGE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值范围 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isValueRangeDirty(){
        if(this.contains(FIELD_VALUERANGE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值范围
     */
    @JsonIgnore
    public void resetValueRange(){
        this.reset(FIELD_VALUERANGE);
    }

    /**
     * 设置 值范围，详细说明：{@link #FIELD_VALUERANGE}
     * <P>
     * 等同 {@link #setValueRange}
     * @param valueRange
     */
    @JsonIgnore
    public PSSysTDItemDTO valuerange(String valueRange){
        this.setValueRange(valueRange);
        return this;
    }

    /**
     * <B>VALUETYPE</B>&nbsp;值类型，指定测试数据项的值类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.TestDataItemValueType} 
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
    public PSSysTDItemDTO valuetype(String valueType){
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
    public PSSysTDItemDTO valuetype(net.ibizsys.model.PSModelEnums.TestDataItemValueType valueType){
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
        return this.getPSSysTDItemId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysTDItemId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysTDItemId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysTDItemId(strValue);
    }

    @JsonIgnore
    public PSSysTDItemDTO id(String strValue){
        this.setPSSysTDItemId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysTDItemDTO){
            PSSysTDItemDTO dto = (PSSysTDItemDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
