package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSBICUBEMEASURE</B>智能报表立方体指标 模型传输对象
 * <P>
 * 
 */
public class PSSysBICubeMeasureDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysBICubeMeasureDTO(){
    }      

    /**
     * <B>BICUBEMEASURETAG</B>&nbsp;立方体指标标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_BICUBEMEASURETAG = "bicubemeasuretag";

    /**
     * 设置 立方体指标标记
     * 
     * @param bICubeMeasureTag
     * 
     */
    @JsonProperty(FIELD_BICUBEMEASURETAG)
    public void setBICubeMeasureTag(String bICubeMeasureTag){
        this.set(FIELD_BICUBEMEASURETAG, bICubeMeasureTag);
    }
    
    /**
     * 获取 立方体指标标记  
     * @return
     */
    @JsonIgnore
    public String getBICubeMeasureTag(){
        Object objValue = this.get(FIELD_BICUBEMEASURETAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 立方体指标标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBICubeMeasureTagDirty(){
        if(this.contains(FIELD_BICUBEMEASURETAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 立方体指标标记
     */
    @JsonIgnore
    public void resetBICubeMeasureTag(){
        this.reset(FIELD_BICUBEMEASURETAG);
    }

    /**
     * 设置 立方体指标标记
     * <P>
     * 等同 {@link #setBICubeMeasureTag}
     * @param bICubeMeasureTag
     */
    @JsonIgnore
    public PSSysBICubeMeasureDTO bicubemeasuretag(String bICubeMeasureTag){
        this.setBICubeMeasureTag(bICubeMeasureTag);
        return this;
    }

    /**
     * <B>BICUBEMEASURETAG2</B>&nbsp;立方体指标标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_BICUBEMEASURETAG2 = "bicubemeasuretag2";

    /**
     * 设置 立方体指标标记2
     * 
     * @param bICubeMeasureTag2
     * 
     */
    @JsonProperty(FIELD_BICUBEMEASURETAG2)
    public void setBICubeMeasureTag2(String bICubeMeasureTag2){
        this.set(FIELD_BICUBEMEASURETAG2, bICubeMeasureTag2);
    }
    
    /**
     * 获取 立方体指标标记2  
     * @return
     */
    @JsonIgnore
    public String getBICubeMeasureTag2(){
        Object objValue = this.get(FIELD_BICUBEMEASURETAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 立方体指标标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBICubeMeasureTag2Dirty(){
        if(this.contains(FIELD_BICUBEMEASURETAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 立方体指标标记2
     */
    @JsonIgnore
    public void resetBICubeMeasureTag2(){
        this.reset(FIELD_BICUBEMEASURETAG2);
    }

    /**
     * 设置 立方体指标标记2
     * <P>
     * 等同 {@link #setBICubeMeasureTag2}
     * @param bICubeMeasureTag2
     */
    @JsonIgnore
    public PSSysBICubeMeasureDTO bicubemeasuretag2(String bICubeMeasureTag2){
        this.setBICubeMeasureTag2(bICubeMeasureTag2);
        return this;
    }

    /**
     * <B>BIMEASURETYPE</B>&nbsp;指标类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.BIMeasureType} 
     */
    public final static String FIELD_BIMEASURETYPE = "bimeasuretype";

    /**
     * 设置 指标类型
     * 
     * @param bIMeasureType
     * 
     */
    @JsonProperty(FIELD_BIMEASURETYPE)
    public void setBIMeasureType(String bIMeasureType){
        this.set(FIELD_BIMEASURETYPE, bIMeasureType);
    }
    
    /**
     * 获取 指标类型  
     * @return
     */
    @JsonIgnore
    public String getBIMeasureType(){
        Object objValue = this.get(FIELD_BIMEASURETYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 指标类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBIMeasureTypeDirty(){
        if(this.contains(FIELD_BIMEASURETYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 指标类型
     */
    @JsonIgnore
    public void resetBIMeasureType(){
        this.reset(FIELD_BIMEASURETYPE);
    }

    /**
     * 设置 指标类型
     * <P>
     * 等同 {@link #setBIMeasureType}
     * @param bIMeasureType
     */
    @JsonIgnore
    public PSSysBICubeMeasureDTO bimeasuretype(String bIMeasureType){
        this.setBIMeasureType(bIMeasureType);
        return this;
    }

     /**
     * 设置 指标类型
     * <P>
     * 等同 {@link #setBIMeasureType}
     * @param bIMeasureType
     */
    @JsonIgnore
    public PSSysBICubeMeasureDTO bimeasuretype(net.ibizsys.model.PSModelEnums.BIMeasureType bIMeasureType){
        if(bIMeasureType == null){
            this.setBIMeasureType(null);
        }
        else{
            this.setBIMeasureType(bIMeasureType.value);
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
    public PSSysBICubeMeasureDTO codename(String codeName){
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
    public PSSysBICubeMeasureDTO createdate(Timestamp createDate){
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
    public PSSysBICubeMeasureDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>HIDDENDATAITEM</B>&nbsp;隐藏数据项
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_HIDDENDATAITEM = "hiddendataitem";

    /**
     * 设置 隐藏数据项
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
     * 设置 隐藏数据项
     * <P>
     * 等同 {@link #setHiddenDataItem}
     * @param hiddenDataItem
     */
    @JsonIgnore
    public PSSysBICubeMeasureDTO hiddendataitem(Integer hiddenDataItem){
        this.setHiddenDataItem(hiddenDataItem);
        return this;
    }

     /**
     * 设置 隐藏数据项
     * <P>
     * 等同 {@link #setHiddenDataItem}
     * @param hiddenDataItem
     */
    @JsonIgnore
    public PSSysBICubeMeasureDTO hiddendataitem(Boolean hiddenDataItem){
        if(hiddenDataItem == null){
            this.setHiddenDataItem(null);
        }
        else{
            this.setHiddenDataItem(hiddenDataItem?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>MEASUREFORMULA</B>&nbsp;指标公式
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_MEASUREFORMULA = "measureformula";

    /**
     * 设置 指标公式
     * 
     * @param measureFormula
     * 
     */
    @JsonProperty(FIELD_MEASUREFORMULA)
    public void setMeasureFormula(String measureFormula){
        this.set(FIELD_MEASUREFORMULA, measureFormula);
    }
    
    /**
     * 获取 指标公式  
     * @return
     */
    @JsonIgnore
    public String getMeasureFormula(){
        Object objValue = this.get(FIELD_MEASUREFORMULA);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 指标公式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMeasureFormulaDirty(){
        if(this.contains(FIELD_MEASUREFORMULA)){
            return true;
        }
        return false;
    }

    /**
     * 重置 指标公式
     */
    @JsonIgnore
    public void resetMeasureFormula(){
        this.reset(FIELD_MEASUREFORMULA);
    }

    /**
     * 设置 指标公式
     * <P>
     * 等同 {@link #setMeasureFormula}
     * @param measureFormula
     */
    @JsonIgnore
    public PSSysBICubeMeasureDTO measureformula(String measureFormula){
        this.setMeasureFormula(measureFormula);
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
    public PSSysBICubeMeasureDTO memo(String memo){
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
    public PSSysBICubeMeasureDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSDEFID</B>&nbsp;实体属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
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
    public PSSysBICubeMeasureDTO psdefid(String pSDEFId){
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
    public PSSysBICubeMeasureDTO psdefid(PSDEFieldDTO pSDEField){
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
    public PSSysBICubeMeasureDTO psdefname(String pSDEFName){
        this.setPSDEFName(pSDEFName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;PSDEID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBICUBEID}
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
    public PSSysBICubeMeasureDTO psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * <B>PSSYSBICUBEID</B>&nbsp;智能报表立方体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysBICubeDTO} 
     */
    public final static String FIELD_PSSYSBICUBEID = "pssysbicubeid";

    /**
     * 设置 智能报表立方体
     * 
     * @param pSSysBICubeId
     * 
     */
    @JsonProperty(FIELD_PSSYSBICUBEID)
    public void setPSSysBICubeId(String pSSysBICubeId){
        this.set(FIELD_PSSYSBICUBEID, pSSysBICubeId);
    }
    
    /**
     * 获取 智能报表立方体  
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
     * 判断 智能报表立方体 是否指定值，包括空值
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
     * 重置 智能报表立方体
     */
    @JsonIgnore
    public void resetPSSysBICubeId(){
        this.reset(FIELD_PSSYSBICUBEID);
    }

    /**
     * 设置 智能报表立方体
     * <P>
     * 等同 {@link #setPSSysBICubeId}
     * @param pSSysBICubeId
     */
    @JsonIgnore
    public PSSysBICubeMeasureDTO pssysbicubeid(String pSSysBICubeId){
        this.setPSSysBICubeId(pSSysBICubeId);
        return this;
    }

    /**
     * 设置 智能报表立方体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysBICubeId}
     * @param pSSysBICube 引用对象
     */
    @JsonIgnore
    public PSSysBICubeMeasureDTO pssysbicubeid(PSSysBICubeDTO pSSysBICube){
        if(pSSysBICube == null){
            this.setPSDEId(null);
            this.setPSSysBICubeId(null);
            this.setPSSysBICubeName(null);
            this.setPSSysBISchemeId(null);
        }
        else{
            this.setPSDEId(pSSysBICube.getPSDEId());
            this.setPSSysBICubeId(pSSysBICube.getPSSysBICubeId());
            this.setPSSysBICubeName(pSSysBICube.getPSSysBICubeName());
            this.setPSSysBISchemeId(pSSysBICube.getPSSysBISchemeId());
        }
        return this;
    }

    /**
     * <B>PSSYSBICUBEMEASUREID</B>&nbsp;智能报表指标标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSBICUBEMEASUREID = "pssysbicubemeasureid";

    /**
     * 设置 智能报表指标标识
     * 
     * @param pSSysBICubeMeasureId
     * 
     */
    @JsonProperty(FIELD_PSSYSBICUBEMEASUREID)
    public void setPSSysBICubeMeasureId(String pSSysBICubeMeasureId){
        this.set(FIELD_PSSYSBICUBEMEASUREID, pSSysBICubeMeasureId);
    }
    
    /**
     * 获取 智能报表指标标识  
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
     * 判断 智能报表指标标识 是否指定值，包括空值
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
     * 重置 智能报表指标标识
     */
    @JsonIgnore
    public void resetPSSysBICubeMeasureId(){
        this.reset(FIELD_PSSYSBICUBEMEASUREID);
    }

    /**
     * 设置 智能报表指标标识
     * <P>
     * 等同 {@link #setPSSysBICubeMeasureId}
     * @param pSSysBICubeMeasureId
     */
    @JsonIgnore
    public PSSysBICubeMeasureDTO pssysbicubemeasureid(String pSSysBICubeMeasureId){
        this.setPSSysBICubeMeasureId(pSSysBICubeMeasureId);
        return this;
    }

    /**
     * <B>PSSYSBICUBEMEASURENAME</B>&nbsp;立方体指标名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSBICUBEMEASURENAME = "pssysbicubemeasurename";

    /**
     * 设置 立方体指标名称
     * 
     * @param pSSysBICubeMeasureName
     * 
     */
    @JsonProperty(FIELD_PSSYSBICUBEMEASURENAME)
    public void setPSSysBICubeMeasureName(String pSSysBICubeMeasureName){
        this.set(FIELD_PSSYSBICUBEMEASURENAME, pSSysBICubeMeasureName);
    }
    
    /**
     * 获取 立方体指标名称  
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
     * 判断 立方体指标名称 是否指定值，包括空值
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
     * 重置 立方体指标名称
     */
    @JsonIgnore
    public void resetPSSysBICubeMeasureName(){
        this.reset(FIELD_PSSYSBICUBEMEASURENAME);
    }

    /**
     * 设置 立方体指标名称
     * <P>
     * 等同 {@link #setPSSysBICubeMeasureName}
     * @param pSSysBICubeMeasureName
     */
    @JsonIgnore
    public PSSysBICubeMeasureDTO pssysbicubemeasurename(String pSSysBICubeMeasureName){
        this.setPSSysBICubeMeasureName(pSSysBICubeMeasureName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysBICubeMeasureName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysBICubeMeasureName(strName);
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO name(String strName){
        this.setPSSysBICubeMeasureName(strName);
        return this;
    }

    /**
     * <B>PSSYSBICUBENAME</B>&nbsp;智能报表立方体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBICUBEID}
     */
    public final static String FIELD_PSSYSBICUBENAME = "pssysbicubename";

    /**
     * 设置 智能报表立方体
     * 
     * @param pSSysBICubeName
     * 
     */
    @JsonProperty(FIELD_PSSYSBICUBENAME)
    public void setPSSysBICubeName(String pSSysBICubeName){
        this.set(FIELD_PSSYSBICUBENAME, pSSysBICubeName);
    }
    
    /**
     * 获取 智能报表立方体  
     * @return
     */
    @JsonIgnore
    public String getPSSysBICubeName(){
        Object objValue = this.get(FIELD_PSSYSBICUBENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 智能报表立方体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBICubeNameDirty(){
        if(this.contains(FIELD_PSSYSBICUBENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 智能报表立方体
     */
    @JsonIgnore
    public void resetPSSysBICubeName(){
        this.reset(FIELD_PSSYSBICUBENAME);
    }

    /**
     * 设置 智能报表立方体
     * <P>
     * 等同 {@link #setPSSysBICubeName}
     * @param pSSysBICubeName
     */
    @JsonIgnore
    public PSSysBICubeMeasureDTO pssysbicubename(String pSSysBICubeName){
        this.setPSSysBICubeName(pSSysBICubeName);
        return this;
    }

    /**
     * <B>PSSYSBISCHEMEID</B>&nbsp;PSSYSBISCHEMEID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBICUBEID}
     */
    public final static String FIELD_PSSYSBISCHEMEID = "pssysbischemeid";

    /**
     * 设置 PSSYSBISCHEMEID
     * 
     * @param pSSysBISchemeId
     * 
     */
    @JsonProperty(FIELD_PSSYSBISCHEMEID)
    public void setPSSysBISchemeId(String pSSysBISchemeId){
        this.set(FIELD_PSSYSBISCHEMEID, pSSysBISchemeId);
    }
    
    /**
     * 获取 PSSYSBISCHEMEID  
     * @return
     */
    @JsonIgnore
    public String getPSSysBISchemeId(){
        Object objValue = this.get(FIELD_PSSYSBISCHEMEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 PSSYSBISCHEMEID 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBISchemeIdDirty(){
        if(this.contains(FIELD_PSSYSBISCHEMEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 PSSYSBISCHEMEID
     */
    @JsonIgnore
    public void resetPSSysBISchemeId(){
        this.reset(FIELD_PSSYSBISCHEMEID);
    }

    /**
     * 设置 PSSYSBISCHEMEID
     * <P>
     * 等同 {@link #setPSSysBISchemeId}
     * @param pSSysBISchemeId
     */
    @JsonIgnore
    public PSSysBICubeMeasureDTO pssysbischemeid(String pSSysBISchemeId){
        this.setPSSysBISchemeId(pSSysBISchemeId);
        return this;
    }

    /**
     * <B>PSTHRESHOLDGROUPID</B>&nbsp;阈值组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSThresholdGroupDTO} 
     */
    public final static String FIELD_PSTHRESHOLDGROUPID = "psthresholdgroupid";

    /**
     * 设置 阈值组
     * 
     * @param pSThresholdGroupId
     * 
     */
    @JsonProperty(FIELD_PSTHRESHOLDGROUPID)
    public void setPSThresholdGroupId(String pSThresholdGroupId){
        this.set(FIELD_PSTHRESHOLDGROUPID, pSThresholdGroupId);
    }
    
    /**
     * 获取 阈值组  
     * @return
     */
    @JsonIgnore
    public String getPSThresholdGroupId(){
        Object objValue = this.get(FIELD_PSTHRESHOLDGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 阈值组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSThresholdGroupIdDirty(){
        if(this.contains(FIELD_PSTHRESHOLDGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 阈值组
     */
    @JsonIgnore
    public void resetPSThresholdGroupId(){
        this.reset(FIELD_PSTHRESHOLDGROUPID);
    }

    /**
     * 设置 阈值组
     * <P>
     * 等同 {@link #setPSThresholdGroupId}
     * @param pSThresholdGroupId
     */
    @JsonIgnore
    public PSSysBICubeMeasureDTO psthresholdgroupid(String pSThresholdGroupId){
        this.setPSThresholdGroupId(pSThresholdGroupId);
        return this;
    }

    /**
     * 设置 阈值组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSThresholdGroupId}
     * @param pSThresholdGroup 引用对象
     */
    @JsonIgnore
    public PSSysBICubeMeasureDTO psthresholdgroupid(PSThresholdGroupDTO pSThresholdGroup){
        if(pSThresholdGroup == null){
            this.setPSThresholdGroupId(null);
            this.setPSThresholdGroupName(null);
        }
        else{
            this.setPSThresholdGroupId(pSThresholdGroup.getPSThresholdGroupId());
            this.setPSThresholdGroupName(pSThresholdGroup.getPSThresholdGroupName());
        }
        return this;
    }

    /**
     * <B>PSTHRESHOLDGROUPNAME</B>&nbsp;阈值组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSTHRESHOLDGROUPID}
     */
    public final static String FIELD_PSTHRESHOLDGROUPNAME = "psthresholdgroupname";

    /**
     * 设置 阈值组
     * 
     * @param pSThresholdGroupName
     * 
     */
    @JsonProperty(FIELD_PSTHRESHOLDGROUPNAME)
    public void setPSThresholdGroupName(String pSThresholdGroupName){
        this.set(FIELD_PSTHRESHOLDGROUPNAME, pSThresholdGroupName);
    }
    
    /**
     * 获取 阈值组  
     * @return
     */
    @JsonIgnore
    public String getPSThresholdGroupName(){
        Object objValue = this.get(FIELD_PSTHRESHOLDGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 阈值组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSThresholdGroupNameDirty(){
        if(this.contains(FIELD_PSTHRESHOLDGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 阈值组
     */
    @JsonIgnore
    public void resetPSThresholdGroupName(){
        this.reset(FIELD_PSTHRESHOLDGROUPNAME);
    }

    /**
     * 设置 阈值组
     * <P>
     * 等同 {@link #setPSThresholdGroupName}
     * @param pSThresholdGroupName
     */
    @JsonIgnore
    public PSSysBICubeMeasureDTO psthresholdgroupname(String pSThresholdGroupName){
        this.setPSThresholdGroupName(pSThresholdGroupName);
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
    public PSSysBICubeMeasureDTO updatedate(Timestamp updateDate){
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
    public PSSysBICubeMeasureDTO updateman(String updateMan){
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
    public PSSysBICubeMeasureDTO usercat(String userCat){
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
    public PSSysBICubeMeasureDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSSysBICubeMeasureDTO usertag(String userTag){
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
    public PSSysBICubeMeasureDTO usertag2(String userTag2){
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
    public PSSysBICubeMeasureDTO usertag3(String userTag3){
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
    public PSSysBICubeMeasureDTO usertag4(String userTag4){
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
    public PSSysBICubeMeasureDTO validflag(Integer validFlag){
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
    public PSSysBICubeMeasureDTO validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>VALUEFORMAT</B>&nbsp;值格式化
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_VALUEFORMAT = "valueformat";

    /**
     * 设置 值格式化
     * 
     * @param valueFormat
     * 
     */
    @JsonProperty(FIELD_VALUEFORMAT)
    public void setValueFormat(String valueFormat){
        this.set(FIELD_VALUEFORMAT, valueFormat);
    }
    
    /**
     * 获取 值格式化  
     * @return
     */
    @JsonIgnore
    public String getValueFormat(){
        Object objValue = this.get(FIELD_VALUEFORMAT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值格式化 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isValueFormatDirty(){
        if(this.contains(FIELD_VALUEFORMAT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值格式化
     */
    @JsonIgnore
    public void resetValueFormat(){
        this.reset(FIELD_VALUEFORMAT);
    }

    /**
     * 设置 值格式化
     * <P>
     * 等同 {@link #setValueFormat}
     * @param valueFormat
     */
    @JsonIgnore
    public PSSysBICubeMeasureDTO valueformat(String valueFormat){
        this.setValueFormat(valueFormat);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSSysBICubeMeasureId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysBICubeMeasureId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysBICubeMeasureId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysBICubeMeasureId(strValue);
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO id(String strValue){
        this.setPSSysBICubeMeasureId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysBICubeMeasureDTO){
            PSSysBICubeMeasureDTO dto = (PSSysBICubeMeasureDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
