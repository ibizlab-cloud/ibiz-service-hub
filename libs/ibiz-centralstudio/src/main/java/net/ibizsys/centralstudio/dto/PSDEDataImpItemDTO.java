package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEDATAIMPITEM</B>实体数据导入项 模型传输对象
 * <P>
 * 实体数据导入成员项模型，定义相关的属性、默认值等导入处理配置信息
 */
public class PSDEDataImpItemDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSDEDataImpItemDTO(){
    }      

    /**
     * <B>CAPPSLANRESID</B>&nbsp;标题语言资源，指定导入项的标题的多语言资源对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSLanguageResDTO} 
     */
    public final static String FIELD_CAPPSLANRESID = "cappslanresid";

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_CAPPSLANRESID}
     * 
     * @param capPSLanResId
     * 
     */
    @JsonProperty(FIELD_CAPPSLANRESID)
    public void setCapPSLanResId(String capPSLanResId){
        this.set(FIELD_CAPPSLANRESID, capPSLanResId);
    }
    
    /**
     * 获取 标题语言资源  
     * @return
     */
    @JsonIgnore
    public String getCapPSLanResId(){
        Object objValue = this.get(FIELD_CAPPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标题语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCapPSLanResIdDirty(){
        if(this.contains(FIELD_CAPPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题语言资源
     */
    @JsonIgnore
    public void resetCapPSLanResId(){
        this.reset(FIELD_CAPPSLANRESID);
    }

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_CAPPSLANRESID}
     * <P>
     * 等同 {@link #setCapPSLanResId}
     * @param capPSLanResId
     */
    @JsonIgnore
    public PSDEDataImpItemDTO cappslanresid(String capPSLanResId){
        this.setCapPSLanResId(capPSLanResId);
        return this;
    }

    /**
     * 设置 标题语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setCapPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSDEDataImpItemDTO cappslanresid(PSLanguageResDTO pSLanguageRes){
        if(pSLanguageRes == null){
            this.setCapPSLanResId(null);
            this.setCapPSLanResName(null);
        }
        else{
            this.setCapPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setCapPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>CAPPSLANRESNAME</B>&nbsp;标题语言资源，指定导入项的标题的多语言资源对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CAPPSLANRESID}
     */
    public final static String FIELD_CAPPSLANRESNAME = "cappslanresname";

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_CAPPSLANRESNAME}
     * 
     * @param capPSLanResName
     * 
     */
    @JsonProperty(FIELD_CAPPSLANRESNAME)
    public void setCapPSLanResName(String capPSLanResName){
        this.set(FIELD_CAPPSLANRESNAME, capPSLanResName);
    }
    
    /**
     * 获取 标题语言资源  
     * @return
     */
    @JsonIgnore
    public String getCapPSLanResName(){
        Object objValue = this.get(FIELD_CAPPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标题语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCapPSLanResNameDirty(){
        if(this.contains(FIELD_CAPPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题语言资源
     */
    @JsonIgnore
    public void resetCapPSLanResName(){
        this.reset(FIELD_CAPPSLANRESNAME);
    }

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_CAPPSLANRESNAME}
     * <P>
     * 等同 {@link #setCapPSLanResName}
     * @param capPSLanResName
     */
    @JsonIgnore
    public PSDEDataImpItemDTO cappslanresname(String capPSLanResName){
        this.setCapPSLanResName(capPSLanResName);
        return this;
    }

    /**
     * <B>CAPTION</B>&nbsp;标题，指定导入项的标题、未定义时使用属性的导入标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_CAPTION = "caption";

    /**
     * 设置 标题，详细说明：{@link #FIELD_CAPTION}
     * 
     * @param caption
     * 
     */
    @JsonProperty(FIELD_CAPTION)
    public void setCaption(String caption){
        this.set(FIELD_CAPTION, caption);
    }
    
    /**
     * 获取 标题  
     * @return
     */
    @JsonIgnore
    public String getCaption(){
        Object objValue = this.get(FIELD_CAPTION);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标题 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCaptionDirty(){
        if(this.contains(FIELD_CAPTION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题
     */
    @JsonIgnore
    public void resetCaption(){
        this.reset(FIELD_CAPTION);
    }

    /**
     * 设置 标题，详细说明：{@link #FIELD_CAPTION}
     * <P>
     * 等同 {@link #setCaption}
     * @param caption
     */
    @JsonIgnore
    public PSDEDataImpItemDTO caption(String caption){
        this.setCaption(caption);
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
    public PSDEDataImpItemDTO createdate(Timestamp createDate){
        this.setCreateDate(createDate);
        return this;
    }

    /**
     * <B>CREATEDV</B>&nbsp;建立默认值，指定导入项的建立默认值，未指定默认值类型时按直接值处理
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_CREATEDV = "createdv";

    /**
     * 设置 建立默认值，详细说明：{@link #FIELD_CREATEDV}
     * 
     * @param createDV
     * 
     */
    @JsonProperty(FIELD_CREATEDV)
    public void setCreateDV(String createDV){
        this.set(FIELD_CREATEDV, createDV);
    }
    
    /**
     * 获取 建立默认值  
     * @return
     */
    @JsonIgnore
    public String getCreateDV(){
        Object objValue = this.get(FIELD_CREATEDV);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 建立默认值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCreateDVDirty(){
        if(this.contains(FIELD_CREATEDV)){
            return true;
        }
        return false;
    }

    /**
     * 重置 建立默认值
     */
    @JsonIgnore
    public void resetCreateDV(){
        this.reset(FIELD_CREATEDV);
    }

    /**
     * 设置 建立默认值，详细说明：{@link #FIELD_CREATEDV}
     * <P>
     * 等同 {@link #setCreateDV}
     * @param createDV
     */
    @JsonIgnore
    public PSDEDataImpItemDTO createdv(String createDV){
        this.setCreateDV(createDV);
        return this;
    }

    /**
     * <B>CREATEDVT</B>&nbsp;新建默认值类型，指定导入项的建立默认值类型，未定义时为【直接值】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.CreateDefaultValueType} 
     */
    public final static String FIELD_CREATEDVT = "createdvt";

    /**
     * 设置 新建默认值类型，详细说明：{@link #FIELD_CREATEDVT}
     * 
     * @param createDVT
     * 
     */
    @JsonProperty(FIELD_CREATEDVT)
    public void setCreateDVT(String createDVT){
        this.set(FIELD_CREATEDVT, createDVT);
    }
    
    /**
     * 获取 新建默认值类型  
     * @return
     */
    @JsonIgnore
    public String getCreateDVT(){
        Object objValue = this.get(FIELD_CREATEDVT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 新建默认值类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCreateDVTDirty(){
        if(this.contains(FIELD_CREATEDVT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 新建默认值类型
     */
    @JsonIgnore
    public void resetCreateDVT(){
        this.reset(FIELD_CREATEDVT);
    }

    /**
     * 设置 新建默认值类型，详细说明：{@link #FIELD_CREATEDVT}
     * <P>
     * 等同 {@link #setCreateDVT}
     * @param createDVT
     */
    @JsonIgnore
    public PSDEDataImpItemDTO createdvt(String createDVT){
        this.setCreateDVT(createDVT);
        return this;
    }

     /**
     * 设置 新建默认值类型，详细说明：{@link #FIELD_CREATEDVT}
     * <P>
     * 等同 {@link #setCreateDVT}
     * @param createDVT
     */
    @JsonIgnore
    public PSDEDataImpItemDTO createdvt(net.ibizsys.model.PSModelEnums.CreateDefaultValueType createDVT){
        if(createDVT == null){
            this.setCreateDVT(null);
        }
        else{
            this.setCreateDVT(createDVT.value);
        }
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
    public PSDEDataImpItemDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>HIDDENDATAITEM</B>&nbsp;隐藏数据项，指定导入项是否为隐藏数据项，隐藏数据项使用默认值填充到导入数据中，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_HIDDENDATAITEM = "hiddendataitem";

    /**
     * 设置 隐藏数据项，详细说明：{@link #FIELD_HIDDENDATAITEM}
     * 
     * @param hiddenDataItem
     * 
     */
    @JsonProperty(FIELD_HIDDENDATAITEM)
    public void setHiddenDataItem(Integer hiddenDataItem){
        this.set(FIELD_HIDDENDATAITEM, hiddenDataItem);
    }
    
    /**
     * 获取 隐藏数据项  
     * @return
     */
    @JsonIgnore
    public Integer getHiddenDataItem(){
        Object objValue = this.get(FIELD_HIDDENDATAITEM);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 隐藏数据项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHiddenDataItemDirty(){
        if(this.contains(FIELD_HIDDENDATAITEM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 隐藏数据项
     */
    @JsonIgnore
    public void resetHiddenDataItem(){
        this.reset(FIELD_HIDDENDATAITEM);
    }

    /**
     * 设置 隐藏数据项，详细说明：{@link #FIELD_HIDDENDATAITEM}
     * <P>
     * 等同 {@link #setHiddenDataItem}
     * @param hiddenDataItem
     */
    @JsonIgnore
    public PSDEDataImpItemDTO hiddendataitem(Integer hiddenDataItem){
        this.setHiddenDataItem(hiddenDataItem);
        return this;
    }

     /**
     * 设置 隐藏数据项，详细说明：{@link #FIELD_HIDDENDATAITEM}
     * <P>
     * 等同 {@link #setHiddenDataItem}
     * @param hiddenDataItem
     */
    @JsonIgnore
    public PSDEDataImpItemDTO hiddendataitem(Boolean hiddenDataItem){
        if(hiddenDataItem == null){
            this.setHiddenDataItem(null);
        }
        else{
            this.setHiddenDataItem(hiddenDataItem?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>KEYFLAG</B>&nbsp;数据识别属性，指定导入项是否作为数据的识别属性，如存在识别属性（一个或多个）导入时将先判断是否存在，再进行建立或更新操作。未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_KEYFLAG = "keyflag";

    /**
     * 设置 数据识别属性，详细说明：{@link #FIELD_KEYFLAG}
     * 
     * @param keyFlag
     * 
     */
    @JsonProperty(FIELD_KEYFLAG)
    public void setKeyFlag(Integer keyFlag){
        this.set(FIELD_KEYFLAG, keyFlag);
    }
    
    /**
     * 获取 数据识别属性  
     * @return
     */
    @JsonIgnore
    public Integer getKeyFlag(){
        Object objValue = this.get(FIELD_KEYFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 数据识别属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isKeyFlagDirty(){
        if(this.contains(FIELD_KEYFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据识别属性
     */
    @JsonIgnore
    public void resetKeyFlag(){
        this.reset(FIELD_KEYFLAG);
    }

    /**
     * 设置 数据识别属性，详细说明：{@link #FIELD_KEYFLAG}
     * <P>
     * 等同 {@link #setKeyFlag}
     * @param keyFlag
     */
    @JsonIgnore
    public PSDEDataImpItemDTO keyflag(Integer keyFlag){
        this.setKeyFlag(keyFlag);
        return this;
    }

     /**
     * 设置 数据识别属性，详细说明：{@link #FIELD_KEYFLAG}
     * <P>
     * 等同 {@link #setKeyFlag}
     * @param keyFlag
     */
    @JsonIgnore
    public PSDEDataImpItemDTO keyflag(Boolean keyFlag){
        if(keyFlag == null){
            this.setKeyFlag(null);
        }
        else{
            this.setKeyFlag(keyFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSDEDataImpItemDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;显示次序，指定导入项的显示次序
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 显示次序，详细说明：{@link #FIELD_ORDERVALUE}
     * 
     * @param orderValue
     * 
     */
    @JsonProperty(FIELD_ORDERVALUE)
    public void setOrderValue(Integer orderValue){
        this.set(FIELD_ORDERVALUE, orderValue);
    }
    
    /**
     * 获取 显示次序  
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
     * 判断 显示次序 是否指定值，包括空值
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
     * 重置 显示次序
     */
    @JsonIgnore
    public void resetOrderValue(){
        this.reset(FIELD_ORDERVALUE);
    }

    /**
     * 设置 显示次序，详细说明：{@link #FIELD_ORDERVALUE}
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSDEDataImpItemDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSCODELISTID</B>&nbsp;代码表，指定导入项使用的代码表，导入项存在代码表则会将导入内容进行值转换处理。未定义时使用属性的代码表对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSCodeListDTO} 
     */
    public final static String FIELD_PSCODELISTID = "pscodelistid";

    /**
     * 设置 代码表，详细说明：{@link #FIELD_PSCODELISTID}
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
     * 设置 代码表，详细说明：{@link #FIELD_PSCODELISTID}
     * <P>
     * 等同 {@link #setPSCodeListId}
     * @param pSCodeListId
     */
    @JsonIgnore
    public PSDEDataImpItemDTO pscodelistid(String pSCodeListId){
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
    public PSDEDataImpItemDTO pscodelistid(PSCodeListDTO pSCodeList){
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
     * <B>PSCODELISTNAME</B>&nbsp;代码表，指定导入项使用的代码表，导入项存在代码表则会将导入内容进行值转换处理。未定义时使用属性的代码表对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCODELISTID}
     */
    public final static String FIELD_PSCODELISTNAME = "pscodelistname";

    /**
     * 设置 代码表，详细说明：{@link #FIELD_PSCODELISTNAME}
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
     * 设置 代码表，详细说明：{@link #FIELD_PSCODELISTNAME}
     * <P>
     * 等同 {@link #setPSCodeListName}
     * @param pSCodeListName
     */
    @JsonIgnore
    public PSDEDataImpItemDTO pscodelistname(String pSCodeListName){
        this.setPSCodeListName(pSCodeListName);
        return this;
    }

    /**
     * <B>PSDEDATAIMPID</B>&nbsp;实体数据导入，指定导入项所在的数据导入对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEDataImpDTO} 
     */
    public final static String FIELD_PSDEDATAIMPID = "psdedataimpid";

    /**
     * 设置 实体数据导入，详细说明：{@link #FIELD_PSDEDATAIMPID}
     * 
     * @param pSDEDataImpId
     * 
     */
    @JsonProperty(FIELD_PSDEDATAIMPID)
    public void setPSDEDataImpId(String pSDEDataImpId){
        this.set(FIELD_PSDEDATAIMPID, pSDEDataImpId);
    }
    
    /**
     * 获取 实体数据导入  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataImpId(){
        Object objValue = this.get(FIELD_PSDEDATAIMPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据导入 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataImpIdDirty(){
        if(this.contains(FIELD_PSDEDATAIMPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据导入
     */
    @JsonIgnore
    public void resetPSDEDataImpId(){
        this.reset(FIELD_PSDEDATAIMPID);
    }

    /**
     * 设置 实体数据导入，详细说明：{@link #FIELD_PSDEDATAIMPID}
     * <P>
     * 等同 {@link #setPSDEDataImpId}
     * @param pSDEDataImpId
     */
    @JsonIgnore
    public PSDEDataImpItemDTO psdedataimpid(String pSDEDataImpId){
        this.setPSDEDataImpId(pSDEDataImpId);
        return this;
    }

    /**
     * 设置 实体数据导入，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDataImpId}
     * @param pSDEDataImp 引用对象
     */
    @JsonIgnore
    public PSDEDataImpItemDTO psdedataimpid(PSDEDataImpDTO pSDEDataImp){
        if(pSDEDataImp == null){
            this.setPSDEDataImpId(null);
            this.setPSDEDataImpName(null);
            this.setPSDEId(null);
        }
        else{
            this.setPSDEDataImpId(pSDEDataImp.getPSDEDataImpId());
            this.setPSDEDataImpName(pSDEDataImp.getPSDEDataImpName());
            this.setPSDEId(pSDEDataImp.getPSDEId());
        }
        return this;
    }

    /**
     * <B>PSDEDATAIMPITEMID</B>&nbsp;实体数据导入项标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEDATAIMPITEMID = "psdedataimpitemid";

    /**
     * 设置 实体数据导入项标识
     * 
     * @param pSDEDataImpItemId
     * 
     */
    @JsonProperty(FIELD_PSDEDATAIMPITEMID)
    public void setPSDEDataImpItemId(String pSDEDataImpItemId){
        this.set(FIELD_PSDEDATAIMPITEMID, pSDEDataImpItemId);
    }
    
    /**
     * 获取 实体数据导入项标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataImpItemId(){
        Object objValue = this.get(FIELD_PSDEDATAIMPITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据导入项标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataImpItemIdDirty(){
        if(this.contains(FIELD_PSDEDATAIMPITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据导入项标识
     */
    @JsonIgnore
    public void resetPSDEDataImpItemId(){
        this.reset(FIELD_PSDEDATAIMPITEMID);
    }

    /**
     * 设置 实体数据导入项标识
     * <P>
     * 等同 {@link #setPSDEDataImpItemId}
     * @param pSDEDataImpItemId
     */
    @JsonIgnore
    public PSDEDataImpItemDTO psdedataimpitemid(String pSDEDataImpItemId){
        this.setPSDEDataImpItemId(pSDEDataImpItemId);
        return this;
    }

    /**
     * <B>PSDEDATAIMPITEMNAME</B>&nbsp;导入项标识
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEDATAIMPITEMNAME = "psdedataimpitemname";

    /**
     * 设置 导入项标识
     * 
     * @param pSDEDataImpItemName
     * 
     */
    @JsonProperty(FIELD_PSDEDATAIMPITEMNAME)
    public void setPSDEDataImpItemName(String pSDEDataImpItemName){
        this.set(FIELD_PSDEDATAIMPITEMNAME, pSDEDataImpItemName);
    }
    
    /**
     * 获取 导入项标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataImpItemName(){
        Object objValue = this.get(FIELD_PSDEDATAIMPITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导入项标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataImpItemNameDirty(){
        if(this.contains(FIELD_PSDEDATAIMPITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导入项标识
     */
    @JsonIgnore
    public void resetPSDEDataImpItemName(){
        this.reset(FIELD_PSDEDATAIMPITEMNAME);
    }

    /**
     * 设置 导入项标识
     * <P>
     * 等同 {@link #setPSDEDataImpItemName}
     * @param pSDEDataImpItemName
     */
    @JsonIgnore
    public PSDEDataImpItemDTO psdedataimpitemname(String pSDEDataImpItemName){
        this.setPSDEDataImpItemName(pSDEDataImpItemName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEDataImpItemName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEDataImpItemName(strName);
    }

    @JsonIgnore
    public PSDEDataImpItemDTO name(String strName){
        this.setPSDEDataImpItemName(strName);
        return this;
    }

    /**
     * <B>PSDEDATAIMPNAME</B>&nbsp;实体数据导入，指定导入项所在的数据导入对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDATAIMPID}
     */
    public final static String FIELD_PSDEDATAIMPNAME = "psdedataimpname";

    /**
     * 设置 实体数据导入，详细说明：{@link #FIELD_PSDEDATAIMPNAME}
     * 
     * @param pSDEDataImpName
     * 
     */
    @JsonProperty(FIELD_PSDEDATAIMPNAME)
    public void setPSDEDataImpName(String pSDEDataImpName){
        this.set(FIELD_PSDEDATAIMPNAME, pSDEDataImpName);
    }
    
    /**
     * 获取 实体数据导入  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataImpName(){
        Object objValue = this.get(FIELD_PSDEDATAIMPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据导入 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataImpNameDirty(){
        if(this.contains(FIELD_PSDEDATAIMPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据导入
     */
    @JsonIgnore
    public void resetPSDEDataImpName(){
        this.reset(FIELD_PSDEDATAIMPNAME);
    }

    /**
     * 设置 实体数据导入，详细说明：{@link #FIELD_PSDEDATAIMPNAME}
     * <P>
     * 等同 {@link #setPSDEDataImpName}
     * @param pSDEDataImpName
     */
    @JsonIgnore
    public PSDEDataImpItemDTO psdedataimpname(String pSDEDataImpName){
        this.setPSDEDataImpName(pSDEDataImpName);
        return this;
    }

    /**
     * <B>PSDEFID</B>&nbsp;实体属性，指定导入项相关的实体属性对象
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
    public PSDEDataImpItemDTO psdefid(String pSDEFId){
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
    public PSDEDataImpItemDTO psdefid(PSDEFieldDTO pSDEField){
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
     * <B>PSDEFNAME</B>&nbsp;实体属性，指定导入项相关的实体属性对象
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
    public PSDEDataImpItemDTO psdefname(String pSDEFName){
        this.setPSDEFName(pSDEFName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDATAIMPID}
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 实体
     * 
     * @param pSDEId
     * 
     */
    @JsonProperty(FIELD_PSDEID)
    public void setPSDEId(String pSDEId){
        this.set(FIELD_PSDEID, pSDEId);
    }
    
    /**
     * 获取 实体  
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
     * 判断 实体 是否指定值，包括空值
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
     * 重置 实体
     */
    @JsonIgnore
    public void resetPSDEId(){
        this.reset(FIELD_PSDEID);
    }

    /**
     * 设置 实体
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSDEDataImpItemDTO psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
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
    public PSDEDataImpItemDTO updatedate(Timestamp updateDate){
        this.setUpdateDate(updateDate);
        return this;
    }

    /**
     * <B>UPDATEDV</B>&nbsp;更新默认值，指定导入项的更新默认值，未指定默认值类型时按直接值处理
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_UPDATEDV = "updatedv";

    /**
     * 设置 更新默认值，详细说明：{@link #FIELD_UPDATEDV}
     * 
     * @param updateDV
     * 
     */
    @JsonProperty(FIELD_UPDATEDV)
    public void setUpdateDV(String updateDV){
        this.set(FIELD_UPDATEDV, updateDV);
    }
    
    /**
     * 获取 更新默认值  
     * @return
     */
    @JsonIgnore
    public String getUpdateDV(){
        Object objValue = this.get(FIELD_UPDATEDV);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 更新默认值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUpdateDVDirty(){
        if(this.contains(FIELD_UPDATEDV)){
            return true;
        }
        return false;
    }

    /**
     * 重置 更新默认值
     */
    @JsonIgnore
    public void resetUpdateDV(){
        this.reset(FIELD_UPDATEDV);
    }

    /**
     * 设置 更新默认值，详细说明：{@link #FIELD_UPDATEDV}
     * <P>
     * 等同 {@link #setUpdateDV}
     * @param updateDV
     */
    @JsonIgnore
    public PSDEDataImpItemDTO updatedv(String updateDV){
        this.setUpdateDV(updateDV);
        return this;
    }

    /**
     * <B>UPDATEDVT</B>&nbsp;更新默认值类型，指定导入项的更新默认值类型，未定义时为【直接值】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.CreateDefaultValueType} 
     */
    public final static String FIELD_UPDATEDVT = "updatedvt";

    /**
     * 设置 更新默认值类型，详细说明：{@link #FIELD_UPDATEDVT}
     * 
     * @param updateDVT
     * 
     */
    @JsonProperty(FIELD_UPDATEDVT)
    public void setUpdateDVT(String updateDVT){
        this.set(FIELD_UPDATEDVT, updateDVT);
    }
    
    /**
     * 获取 更新默认值类型  
     * @return
     */
    @JsonIgnore
    public String getUpdateDVT(){
        Object objValue = this.get(FIELD_UPDATEDVT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 更新默认值类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUpdateDVTDirty(){
        if(this.contains(FIELD_UPDATEDVT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 更新默认值类型
     */
    @JsonIgnore
    public void resetUpdateDVT(){
        this.reset(FIELD_UPDATEDVT);
    }

    /**
     * 设置 更新默认值类型，详细说明：{@link #FIELD_UPDATEDVT}
     * <P>
     * 等同 {@link #setUpdateDVT}
     * @param updateDVT
     */
    @JsonIgnore
    public PSDEDataImpItemDTO updatedvt(String updateDVT){
        this.setUpdateDVT(updateDVT);
        return this;
    }

     /**
     * 设置 更新默认值类型，详细说明：{@link #FIELD_UPDATEDVT}
     * <P>
     * 等同 {@link #setUpdateDVT}
     * @param updateDVT
     */
    @JsonIgnore
    public PSDEDataImpItemDTO updatedvt(net.ibizsys.model.PSModelEnums.CreateDefaultValueType updateDVT){
        if(updateDVT == null){
            this.setUpdateDVT(null);
        }
        else{
            this.setUpdateDVT(updateDVT.value);
        }
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
    public PSDEDataImpItemDTO updateman(String updateMan){
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
    public PSDEDataImpItemDTO usercat(String userCat){
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
    public PSDEDataImpItemDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSDEDataImpItemDTO usertag(String userTag){
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
    public PSDEDataImpItemDTO usertag2(String userTag2){
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
    public PSDEDataImpItemDTO usertag3(String userTag3){
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
    public PSDEDataImpItemDTO usertag4(String userTag4){
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
    public PSDEDataImpItemDTO validflag(Integer validFlag){
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
    public PSDEDataImpItemDTO validflag(Boolean validFlag){
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
        return this.getPSDEDataImpItemId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSDEDataImpItemId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEDataImpItemId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEDataImpItemId(strValue);
    }

    @JsonIgnore
    public PSDEDataImpItemDTO id(String strValue){
        this.setPSDEDataImpItemId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDEDataImpItemDTO){
            PSDEDataImpItemDTO dto = (PSDEDataImpItemDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
