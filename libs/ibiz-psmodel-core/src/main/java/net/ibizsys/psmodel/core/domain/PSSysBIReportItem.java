package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSBIREPORTITEM</B>智能报表项 模型传输对象
 * <P>
 * 
 */
public class PSSysBIReportItem extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysBIReportItem(){
        this.setValidFlag(1);
    }      

    /**
     * <B>AGGTYPE</B>&nbsp;聚合类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.BIMeasureAggMode} 
     */
    public final static String FIELD_AGGTYPE = "aggtype";

    /**
     * 设置 聚合类型
     * 
     * @param aggType
     * 
     */
    @JsonProperty(FIELD_AGGTYPE)
    public void setAggType(String aggType){
        this.set(FIELD_AGGTYPE, aggType);
    }
    
    /**
     * 获取 聚合类型  
     * @return
     */
    @JsonIgnore
    public String getAggType(){
        Object objValue = this.get(FIELD_AGGTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 聚合类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAggTypeDirty(){
        if(this.contains(FIELD_AGGTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 聚合类型
     */
    @JsonIgnore
    public void resetAggType(){
        this.reset(FIELD_AGGTYPE);
    }

    /**
     * 设置 聚合类型
     * <P>
     * 等同 {@link #setAggType}
     * @param aggType
     */
    @JsonIgnore
    public PSSysBIReportItem aggtype(String aggType){
        this.setAggType(aggType);
        return this;
    }

     /**
     * 设置 聚合类型
     * <P>
     * 等同 {@link #setAggType}
     * @param aggType
     */
    @JsonIgnore
    public PSSysBIReportItem aggtype(net.ibizsys.psmodel.core.util.PSModelEnums.BIMeasureAggMode aggType){
        if(aggType == null){
            this.setAggType(null);
        }
        else{
            this.setAggType(aggType.value);
        }
        return this;
    }

    /**
     * <B>BIREPITEMPARAMS</B>&nbsp;项参数
     */
    public final static String FIELD_BIREPITEMPARAMS = "birepitemparams";

    /**
     * 设置 项参数
     * 
     * @param bIRepItemParams
     * 
     */
    @JsonProperty(FIELD_BIREPITEMPARAMS)
    public void setBIRepItemParams(String bIRepItemParams){
        this.set(FIELD_BIREPITEMPARAMS, bIRepItemParams);
    }
    
    /**
     * 获取 项参数  
     * @return
     */
    @JsonIgnore
    public String getBIRepItemParams(){
        Object objValue = this.get(FIELD_BIREPITEMPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBIRepItemParamsDirty(){
        if(this.contains(FIELD_BIREPITEMPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项参数
     */
    @JsonIgnore
    public void resetBIRepItemParams(){
        this.reset(FIELD_BIREPITEMPARAMS);
    }

    /**
     * 设置 项参数
     * <P>
     * 等同 {@link #setBIRepItemParams}
     * @param bIRepItemParams
     */
    @JsonIgnore
    public PSSysBIReportItem birepitemparams(String bIRepItemParams){
        this.setBIRepItemParams(bIRepItemParams);
        return this;
    }

    /**
     * <B>BIREPITEMTAG</B>&nbsp;报表列标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_BIREPITEMTAG = "birepitemtag";

    /**
     * 设置 报表列标记
     * 
     * @param bIRepItemTag
     * 
     */
    @JsonProperty(FIELD_BIREPITEMTAG)
    public void setBIRepItemTag(String bIRepItemTag){
        this.set(FIELD_BIREPITEMTAG, bIRepItemTag);
    }
    
    /**
     * 获取 报表列标记  
     * @return
     */
    @JsonIgnore
    public String getBIRepItemTag(){
        Object objValue = this.get(FIELD_BIREPITEMTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 报表列标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBIRepItemTagDirty(){
        if(this.contains(FIELD_BIREPITEMTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 报表列标记
     */
    @JsonIgnore
    public void resetBIRepItemTag(){
        this.reset(FIELD_BIREPITEMTAG);
    }

    /**
     * 设置 报表列标记
     * <P>
     * 等同 {@link #setBIRepItemTag}
     * @param bIRepItemTag
     */
    @JsonIgnore
    public PSSysBIReportItem birepitemtag(String bIRepItemTag){
        this.setBIRepItemTag(bIRepItemTag);
        return this;
    }

    /**
     * <B>BIREPITEMTAG2</B>&nbsp;报表列标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_BIREPITEMTAG2 = "birepitemtag2";

    /**
     * 设置 报表列标记2
     * 
     * @param bIRepItemTag2
     * 
     */
    @JsonProperty(FIELD_BIREPITEMTAG2)
    public void setBIRepItemTag2(String bIRepItemTag2){
        this.set(FIELD_BIREPITEMTAG2, bIRepItemTag2);
    }
    
    /**
     * 获取 报表列标记2  
     * @return
     */
    @JsonIgnore
    public String getBIRepItemTag2(){
        Object objValue = this.get(FIELD_BIREPITEMTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 报表列标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBIRepItemTag2Dirty(){
        if(this.contains(FIELD_BIREPITEMTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 报表列标记2
     */
    @JsonIgnore
    public void resetBIRepItemTag2(){
        this.reset(FIELD_BIREPITEMTAG2);
    }

    /**
     * 设置 报表列标记2
     * <P>
     * 等同 {@link #setBIRepItemTag2}
     * @param bIRepItemTag2
     */
    @JsonIgnore
    public PSSysBIReportItem birepitemtag2(String bIRepItemTag2){
        this.setBIRepItemTag2(bIRepItemTag2);
        return this;
    }

    /**
     * <B>BIREPITEMTYPE</B>&nbsp;报表项类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.BIReportItemType} 
     */
    public final static String FIELD_BIREPITEMTYPE = "birepitemtype";

    /**
     * 设置 报表项类型
     * 
     * @param bIRepItemType
     * 
     */
    @JsonProperty(FIELD_BIREPITEMTYPE)
    public void setBIRepItemType(String bIRepItemType){
        this.set(FIELD_BIREPITEMTYPE, bIRepItemType);
    }
    
    /**
     * 获取 报表项类型  
     * @return
     */
    @JsonIgnore
    public String getBIRepItemType(){
        Object objValue = this.get(FIELD_BIREPITEMTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 报表项类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBIRepItemTypeDirty(){
        if(this.contains(FIELD_BIREPITEMTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 报表项类型
     */
    @JsonIgnore
    public void resetBIRepItemType(){
        this.reset(FIELD_BIREPITEMTYPE);
    }

    /**
     * 设置 报表项类型
     * <P>
     * 等同 {@link #setBIRepItemType}
     * @param bIRepItemType
     */
    @JsonIgnore
    public PSSysBIReportItem birepitemtype(String bIRepItemType){
        this.setBIRepItemType(bIRepItemType);
        return this;
    }

     /**
     * 设置 报表项类型
     * <P>
     * 等同 {@link #setBIRepItemType}
     * @param bIRepItemType
     */
    @JsonIgnore
    public PSSysBIReportItem birepitemtype(net.ibizsys.psmodel.core.util.PSModelEnums.BIReportItemType bIRepItemType){
        if(bIRepItemType == null){
            this.setBIRepItemType(null);
        }
        else{
            this.setBIRepItemType(bIRepItemType.value);
        }
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码名称
     * <P>
     * 字符串：最大长度 60
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
    public PSSysBIReportItem codename(String codeName){
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
    public PSSysBIReportItem createdate(String createDate){
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
    public PSSysBIReportItem createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DATA</B>&nbsp;项数据
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
    public PSSysBIReportItem data(String data){
        this.setData(data);
        return this;
    }

    /**
     * <B>HALIGN</B>&nbsp;水平对齐
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.TextAlign} 
     */
    public final static String FIELD_HALIGN = "halign";

    /**
     * 设置 水平对齐
     * 
     * @param hAlign
     * 
     */
    @JsonProperty(FIELD_HALIGN)
    public void setHAlign(String hAlign){
        this.set(FIELD_HALIGN, hAlign);
    }
    
    /**
     * 获取 水平对齐  
     * @return
     */
    @JsonIgnore
    public String getHAlign(){
        Object objValue = this.get(FIELD_HALIGN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 水平对齐 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHAlignDirty(){
        if(this.contains(FIELD_HALIGN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 水平对齐
     */
    @JsonIgnore
    public void resetHAlign(){
        this.reset(FIELD_HALIGN);
    }

    /**
     * 设置 水平对齐
     * <P>
     * 等同 {@link #setHAlign}
     * @param hAlign
     */
    @JsonIgnore
    public PSSysBIReportItem halign(String hAlign){
        this.setHAlign(hAlign);
        return this;
    }

     /**
     * 设置 水平对齐
     * <P>
     * 等同 {@link #setHAlign}
     * @param hAlign
     */
    @JsonIgnore
    public PSSysBIReportItem halign(net.ibizsys.psmodel.core.util.PSModelEnums.TextAlign hAlign){
        if(hAlign == null){
            this.setHAlign(null);
        }
        else{
            this.setHAlign(hAlign.value);
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
    public PSSysBIReportItem memo(String memo){
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
    public PSSysBIReportItem ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PLACEMENT</B>&nbsp;放置位置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.BIReportItemPlacement} 
     */
    public final static String FIELD_PLACEMENT = "placement";

    /**
     * 设置 放置位置
     * 
     * @param placement
     * 
     */
    @JsonProperty(FIELD_PLACEMENT)
    public void setPlacement(String placement){
        this.set(FIELD_PLACEMENT, placement);
    }
    
    /**
     * 获取 放置位置  
     * @return
     */
    @JsonIgnore
    public String getPlacement(){
        Object objValue = this.get(FIELD_PLACEMENT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 放置位置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPlacementDirty(){
        if(this.contains(FIELD_PLACEMENT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 放置位置
     */
    @JsonIgnore
    public void resetPlacement(){
        this.reset(FIELD_PLACEMENT);
    }

    /**
     * 设置 放置位置
     * <P>
     * 等同 {@link #setPlacement}
     * @param placement
     */
    @JsonIgnore
    public PSSysBIReportItem placement(String placement){
        this.setPlacement(placement);
        return this;
    }

     /**
     * 设置 放置位置
     * <P>
     * 等同 {@link #setPlacement}
     * @param placement
     */
    @JsonIgnore
    public PSSysBIReportItem placement(net.ibizsys.psmodel.core.util.PSModelEnums.BIReportItemPlacement placement){
        if(placement == null){
            this.setPlacement(null);
        }
        else{
            this.setPlacement(placement.value);
        }
        return this;
    }

    /**
     * <B>PLACETYPE</B>&nbsp;放置类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.BIReportItemPlaceType} 
     */
    public final static String FIELD_PLACETYPE = "placetype";

    /**
     * 设置 放置类型
     * 
     * @param placeType
     * 
     */
    @JsonProperty(FIELD_PLACETYPE)
    public void setPlaceType(String placeType){
        this.set(FIELD_PLACETYPE, placeType);
    }
    
    /**
     * 获取 放置类型  
     * @return
     */
    @JsonIgnore
    public String getPlaceType(){
        Object objValue = this.get(FIELD_PLACETYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 放置类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPlaceTypeDirty(){
        if(this.contains(FIELD_PLACETYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 放置类型
     */
    @JsonIgnore
    public void resetPlaceType(){
        this.reset(FIELD_PLACETYPE);
    }

    /**
     * 设置 放置类型
     * <P>
     * 等同 {@link #setPlaceType}
     * @param placeType
     */
    @JsonIgnore
    public PSSysBIReportItem placetype(String placeType){
        this.setPlaceType(placeType);
        return this;
    }

     /**
     * 设置 放置类型
     * <P>
     * 等同 {@link #setPlaceType}
     * @param placeType
     */
    @JsonIgnore
    public PSSysBIReportItem placetype(net.ibizsys.psmodel.core.util.PSModelEnums.BIReportItemPlaceType placeType){
        if(placeType == null){
            this.setPlaceType(null);
        }
        else{
            this.setPlaceType(placeType.value);
        }
        return this;
    }

    /**
     * <B>PPSSYSBIREPORTITEMID</B>&nbsp;父报表项
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysBIReportItem} 
     */
    public final static String FIELD_PPSSYSBIREPORTITEMID = "ppssysbireportitemid";

    /**
     * 设置 父报表项
     * 
     * @param pPSSysBIReportItemId
     * 
     */
    @JsonProperty(FIELD_PPSSYSBIREPORTITEMID)
    public void setPPSSysBIReportItemId(String pPSSysBIReportItemId){
        this.set(FIELD_PPSSYSBIREPORTITEMID, pPSSysBIReportItemId);
    }
    
    /**
     * 获取 父报表项  
     * @return
     */
    @JsonIgnore
    public String getPPSSysBIReportItemId(){
        Object objValue = this.get(FIELD_PPSSYSBIREPORTITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父报表项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSSysBIReportItemIdDirty(){
        if(this.contains(FIELD_PPSSYSBIREPORTITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父报表项
     */
    @JsonIgnore
    public void resetPPSSysBIReportItemId(){
        this.reset(FIELD_PPSSYSBIREPORTITEMID);
    }

    /**
     * 设置 父报表项
     * <P>
     * 等同 {@link #setPPSSysBIReportItemId}
     * @param pPSSysBIReportItemId
     */
    @JsonIgnore
    public PSSysBIReportItem ppssysbireportitemid(String pPSSysBIReportItemId){
        this.setPPSSysBIReportItemId(pPSSysBIReportItemId);
        return this;
    }

    /**
     * 设置 父报表项，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPPSSysBIReportItemId}
     * @param pSSysBIReportItem 引用对象
     */
    @JsonIgnore
    public PSSysBIReportItem ppssysbireportitemid(PSSysBIReportItem pSSysBIReportItem){
        if(pSSysBIReportItem == null){
            this.setPPSSysBIReportItemId(null);
            this.setPPSSysBIReportItemName(null);
        }
        else{
            this.setPPSSysBIReportItemId(pSSysBIReportItem.getPSSysBIReportItemId());
            this.setPPSSysBIReportItemName(pSSysBIReportItem.getPSSysBIReportItemName());
        }
        return this;
    }

    /**
     * <B>PPSSYSBIREPORTITEMNAME</B>&nbsp;父报表项
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PPSSYSBIREPORTITEMID}
     */
    public final static String FIELD_PPSSYSBIREPORTITEMNAME = "ppssysbireportitemname";

    /**
     * 设置 父报表项
     * 
     * @param pPSSysBIReportItemName
     * 
     */
    @JsonProperty(FIELD_PPSSYSBIREPORTITEMNAME)
    public void setPPSSysBIReportItemName(String pPSSysBIReportItemName){
        this.set(FIELD_PPSSYSBIREPORTITEMNAME, pPSSysBIReportItemName);
    }
    
    /**
     * 获取 父报表项  
     * @return
     */
    @JsonIgnore
    public String getPPSSysBIReportItemName(){
        Object objValue = this.get(FIELD_PPSSYSBIREPORTITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父报表项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSSysBIReportItemNameDirty(){
        if(this.contains(FIELD_PPSSYSBIREPORTITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父报表项
     */
    @JsonIgnore
    public void resetPPSSysBIReportItemName(){
        this.reset(FIELD_PPSSYSBIREPORTITEMNAME);
    }

    /**
     * 设置 父报表项
     * <P>
     * 等同 {@link #setPPSSysBIReportItemName}
     * @param pPSSysBIReportItemName
     */
    @JsonIgnore
    public PSSysBIReportItem ppssysbireportitemname(String pPSSysBIReportItemName){
        this.setPPSSysBIReportItemName(pPSSysBIReportItemName);
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
    public PSSysBIReportItem pssysbicubedimensionid(String pSSysBICubeDimensionId){
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
    public PSSysBIReportItem pssysbicubedimensionid(PSSysBICubeDimension pSSysBICubeDimension){
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
    public PSSysBIReportItem pssysbicubedimensionname(String pSSysBICubeDimensionName){
        this.setPSSysBICubeDimensionName(pSSysBICubeDimensionName);
        return this;
    }

    /**
     * <B>PSSYSBICUBEID</B>&nbsp;智能报表立方体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysBICube} 
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
    public PSSysBIReportItem pssysbicubeid(String pSSysBICubeId){
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
    public PSSysBIReportItem pssysbicubeid(PSSysBICube pSSysBICube){
        if(pSSysBICube == null){
            this.setPSSysBICubeId(null);
            this.setPSSysBICubeName(null);
        }
        else{
            this.setPSSysBICubeId(pSSysBICube.getPSSysBICubeId());
            this.setPSSysBICubeName(pSSysBICube.getPSSysBICubeName());
        }
        return this;
    }

    /**
     * <B>PSSYSBICUBELEVELID</B>&nbsp;立方体维度层级
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysBICubeLevel} 
     */
    public final static String FIELD_PSSYSBICUBELEVELID = "pssysbicubelevelid";

    /**
     * 设置 立方体维度层级
     * 
     * @param pSSysBICubeLevelId
     * 
     */
    @JsonProperty(FIELD_PSSYSBICUBELEVELID)
    public void setPSSysBICubeLevelId(String pSSysBICubeLevelId){
        this.set(FIELD_PSSYSBICUBELEVELID, pSSysBICubeLevelId);
    }
    
    /**
     * 获取 立方体维度层级  
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
     * 判断 立方体维度层级 是否指定值，包括空值
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
     * 重置 立方体维度层级
     */
    @JsonIgnore
    public void resetPSSysBICubeLevelId(){
        this.reset(FIELD_PSSYSBICUBELEVELID);
    }

    /**
     * 设置 立方体维度层级
     * <P>
     * 等同 {@link #setPSSysBICubeLevelId}
     * @param pSSysBICubeLevelId
     */
    @JsonIgnore
    public PSSysBIReportItem pssysbicubelevelid(String pSSysBICubeLevelId){
        this.setPSSysBICubeLevelId(pSSysBICubeLevelId);
        return this;
    }

    /**
     * 设置 立方体维度层级，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysBICubeLevelId}
     * @param pSSysBICubeLevel 引用对象
     */
    @JsonIgnore
    public PSSysBIReportItem pssysbicubelevelid(PSSysBICubeLevel pSSysBICubeLevel){
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
     * <B>PSSYSBICUBELEVELNAME</B>&nbsp;立方体维度层级
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBICUBELEVELID}
     */
    public final static String FIELD_PSSYSBICUBELEVELNAME = "pssysbicubelevelname";

    /**
     * 设置 立方体维度层级
     * 
     * @param pSSysBICubeLevelName
     * 
     */
    @JsonProperty(FIELD_PSSYSBICUBELEVELNAME)
    public void setPSSysBICubeLevelName(String pSSysBICubeLevelName){
        this.set(FIELD_PSSYSBICUBELEVELNAME, pSSysBICubeLevelName);
    }
    
    /**
     * 获取 立方体维度层级  
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
     * 判断 立方体维度层级 是否指定值，包括空值
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
     * 重置 立方体维度层级
     */
    @JsonIgnore
    public void resetPSSysBICubeLevelName(){
        this.reset(FIELD_PSSYSBICUBELEVELNAME);
    }

    /**
     * 设置 立方体维度层级
     * <P>
     * 等同 {@link #setPSSysBICubeLevelName}
     * @param pSSysBICubeLevelName
     */
    @JsonIgnore
    public PSSysBIReportItem pssysbicubelevelname(String pSSysBICubeLevelName){
        this.setPSSysBICubeLevelName(pSSysBICubeLevelName);
        return this;
    }

    /**
     * <B>PSSYSBICUBEMEASUREID</B>&nbsp;智能报表指标
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysBICubeMeasure} 
     */
    public final static String FIELD_PSSYSBICUBEMEASUREID = "pssysbicubemeasureid";

    /**
     * 设置 智能报表指标
     * 
     * @param pSSysBICubeMeasureId
     * 
     */
    @JsonProperty(FIELD_PSSYSBICUBEMEASUREID)
    public void setPSSysBICubeMeasureId(String pSSysBICubeMeasureId){
        this.set(FIELD_PSSYSBICUBEMEASUREID, pSSysBICubeMeasureId);
    }
    
    /**
     * 获取 智能报表指标  
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
     * 判断 智能报表指标 是否指定值，包括空值
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
     * 重置 智能报表指标
     */
    @JsonIgnore
    public void resetPSSysBICubeMeasureId(){
        this.reset(FIELD_PSSYSBICUBEMEASUREID);
    }

    /**
     * 设置 智能报表指标
     * <P>
     * 等同 {@link #setPSSysBICubeMeasureId}
     * @param pSSysBICubeMeasureId
     */
    @JsonIgnore
    public PSSysBIReportItem pssysbicubemeasureid(String pSSysBICubeMeasureId){
        this.setPSSysBICubeMeasureId(pSSysBICubeMeasureId);
        return this;
    }

    /**
     * 设置 智能报表指标，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysBICubeMeasureId}
     * @param pSSysBICubeMeasure 引用对象
     */
    @JsonIgnore
    public PSSysBIReportItem pssysbicubemeasureid(PSSysBICubeMeasure pSSysBICubeMeasure){
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
    public PSSysBIReportItem pssysbicubemeasurename(String pSSysBICubeMeasureName){
        this.setPSSysBICubeMeasureName(pSSysBICubeMeasureName);
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
    public PSSysBIReportItem pssysbicubename(String pSSysBICubeName){
        this.setPSSysBICubeName(pSSysBICubeName);
        return this;
    }

    /**
     * <B>PSSYSBIREPORTID</B>&nbsp;智能报表报表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysBIReport} 
     */
    public final static String FIELD_PSSYSBIREPORTID = "pssysbireportid";

    /**
     * 设置 智能报表报表
     * 
     * @param pSSysBIReportId
     * 
     */
    @JsonProperty(FIELD_PSSYSBIREPORTID)
    public void setPSSysBIReportId(String pSSysBIReportId){
        this.set(FIELD_PSSYSBIREPORTID, pSSysBIReportId);
    }
    
    /**
     * 获取 智能报表报表  
     * @return
     */
    @JsonIgnore
    public String getPSSysBIReportId(){
        Object objValue = this.get(FIELD_PSSYSBIREPORTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 智能报表报表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBIReportIdDirty(){
        if(this.contains(FIELD_PSSYSBIREPORTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 智能报表报表
     */
    @JsonIgnore
    public void resetPSSysBIReportId(){
        this.reset(FIELD_PSSYSBIREPORTID);
    }

    /**
     * 设置 智能报表报表
     * <P>
     * 等同 {@link #setPSSysBIReportId}
     * @param pSSysBIReportId
     */
    @JsonIgnore
    public PSSysBIReportItem pssysbireportid(String pSSysBIReportId){
        this.setPSSysBIReportId(pSSysBIReportId);
        return this;
    }

    /**
     * 设置 智能报表报表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysBIReportId}
     * @param pSSysBIReport 引用对象
     */
    @JsonIgnore
    public PSSysBIReportItem pssysbireportid(PSSysBIReport pSSysBIReport){
        if(pSSysBIReport == null){
            this.setPSSysBIReportId(null);
            this.setPSSysBIReportName(null);
            this.setPSSysBISchemeId(null);
        }
        else{
            this.setPSSysBIReportId(pSSysBIReport.getPSSysBIReportId());
            this.setPSSysBIReportName(pSSysBIReport.getPSSysBIReportName());
            this.setPSSysBISchemeId(pSSysBIReport.getPSSysBISchemeId());
        }
        return this;
    }

    /**
     * <B>PSSYSBIREPORTITEMID</B>&nbsp;智能报表报表项标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSBIREPORTITEMID = "pssysbireportitemid";

    /**
     * 设置 智能报表报表项标识
     * 
     * @param pSSysBIReportItemId
     * 
     */
    @JsonProperty(FIELD_PSSYSBIREPORTITEMID)
    public void setPSSysBIReportItemId(String pSSysBIReportItemId){
        this.set(FIELD_PSSYSBIREPORTITEMID, pSSysBIReportItemId);
    }
    
    /**
     * 获取 智能报表报表项标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysBIReportItemId(){
        Object objValue = this.get(FIELD_PSSYSBIREPORTITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 智能报表报表项标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBIReportItemIdDirty(){
        if(this.contains(FIELD_PSSYSBIREPORTITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 智能报表报表项标识
     */
    @JsonIgnore
    public void resetPSSysBIReportItemId(){
        this.reset(FIELD_PSSYSBIREPORTITEMID);
    }

    /**
     * 设置 智能报表报表项标识
     * <P>
     * 等同 {@link #setPSSysBIReportItemId}
     * @param pSSysBIReportItemId
     */
    @JsonIgnore
    public PSSysBIReportItem pssysbireportitemid(String pSSysBIReportItemId){
        this.setPSSysBIReportItemId(pSSysBIReportItemId);
        return this;
    }

    /**
     * <B>PSSYSBIREPORTITEMNAME</B>&nbsp;报表项标识
     * <P>
     * 字符串：最大长度 200，由字母、数字、下划线及点号组成，且开始必须字母
     */
    public final static String FIELD_PSSYSBIREPORTITEMNAME = "pssysbireportitemname";

    /**
     * 设置 报表项标识
     * 
     * @param pSSysBIReportItemName
     * 
     */
    @JsonProperty(FIELD_PSSYSBIREPORTITEMNAME)
    public void setPSSysBIReportItemName(String pSSysBIReportItemName){
        this.set(FIELD_PSSYSBIREPORTITEMNAME, pSSysBIReportItemName);
    }
    
    /**
     * 获取 报表项标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysBIReportItemName(){
        Object objValue = this.get(FIELD_PSSYSBIREPORTITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 报表项标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBIReportItemNameDirty(){
        if(this.contains(FIELD_PSSYSBIREPORTITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 报表项标识
     */
    @JsonIgnore
    public void resetPSSysBIReportItemName(){
        this.reset(FIELD_PSSYSBIREPORTITEMNAME);
    }

    /**
     * 设置 报表项标识
     * <P>
     * 等同 {@link #setPSSysBIReportItemName}
     * @param pSSysBIReportItemName
     */
    @JsonIgnore
    public PSSysBIReportItem pssysbireportitemname(String pSSysBIReportItemName){
        this.setPSSysBIReportItemName(pSSysBIReportItemName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysBIReportItemName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysBIReportItemName(strName);
    }

    @JsonIgnore
    public PSSysBIReportItem name(String strName){
        this.setPSSysBIReportItemName(strName);
        return this;
    }

    /**
     * <B>PSSYSBIREPORTNAME</B>&nbsp;智能报表报表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBIREPORTID}
     */
    public final static String FIELD_PSSYSBIREPORTNAME = "pssysbireportname";

    /**
     * 设置 智能报表报表
     * 
     * @param pSSysBIReportName
     * 
     */
    @JsonProperty(FIELD_PSSYSBIREPORTNAME)
    public void setPSSysBIReportName(String pSSysBIReportName){
        this.set(FIELD_PSSYSBIREPORTNAME, pSSysBIReportName);
    }
    
    /**
     * 获取 智能报表报表  
     * @return
     */
    @JsonIgnore
    public String getPSSysBIReportName(){
        Object objValue = this.get(FIELD_PSSYSBIREPORTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 智能报表报表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBIReportNameDirty(){
        if(this.contains(FIELD_PSSYSBIREPORTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 智能报表报表
     */
    @JsonIgnore
    public void resetPSSysBIReportName(){
        this.reset(FIELD_PSSYSBIREPORTNAME);
    }

    /**
     * 设置 智能报表报表
     * <P>
     * 等同 {@link #setPSSysBIReportName}
     * @param pSSysBIReportName
     */
    @JsonIgnore
    public PSSysBIReportItem pssysbireportname(String pSSysBIReportName){
        this.setPSSysBIReportName(pSSysBIReportName);
        return this;
    }

    /**
     * <B>PSSYSBISCHEMEID</B>&nbsp;PSSYSBISCHEMEID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBIREPORTID}
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
    public PSSysBIReportItem pssysbischemeid(String pSSysBISchemeId){
        this.setPSSysBISchemeId(pSSysBISchemeId);
        return this;
    }

    /**
     * <B>REFPSSYSBICUBEMEASUREID</B>&nbsp;相关智能报表指标
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysBICubeMeasure} 
     */
    public final static String FIELD_REFPSSYSBICUBEMEASUREID = "refpssysbicubemeasureid";

    /**
     * 设置 相关智能报表指标
     * 
     * @param refPSSysBICubeMeasureId
     * 
     */
    @JsonProperty(FIELD_REFPSSYSBICUBEMEASUREID)
    public void setRefPSSysBICubeMeasureId(String refPSSysBICubeMeasureId){
        this.set(FIELD_REFPSSYSBICUBEMEASUREID, refPSSysBICubeMeasureId);
    }
    
    /**
     * 获取 相关智能报表指标  
     * @return
     */
    @JsonIgnore
    public String getRefPSSysBICubeMeasureId(){
        Object objValue = this.get(FIELD_REFPSSYSBICUBEMEASUREID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 相关智能报表指标 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSSysBICubeMeasureIdDirty(){
        if(this.contains(FIELD_REFPSSYSBICUBEMEASUREID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 相关智能报表指标
     */
    @JsonIgnore
    public void resetRefPSSysBICubeMeasureId(){
        this.reset(FIELD_REFPSSYSBICUBEMEASUREID);
    }

    /**
     * 设置 相关智能报表指标
     * <P>
     * 等同 {@link #setRefPSSysBICubeMeasureId}
     * @param refPSSysBICubeMeasureId
     */
    @JsonIgnore
    public PSSysBIReportItem refpssysbicubemeasureid(String refPSSysBICubeMeasureId){
        this.setRefPSSysBICubeMeasureId(refPSSysBICubeMeasureId);
        return this;
    }

    /**
     * 设置 相关智能报表指标，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefPSSysBICubeMeasureId}
     * @param pSSysBICubeMeasure 引用对象
     */
    @JsonIgnore
    public PSSysBIReportItem refpssysbicubemeasureid(PSSysBICubeMeasure pSSysBICubeMeasure){
        if(pSSysBICubeMeasure == null){
            this.setRefPSSysBICubeMeasureId(null);
            this.setRefPSSysBICubeMeasureName(null);
        }
        else{
            this.setRefPSSysBICubeMeasureId(pSSysBICubeMeasure.getPSSysBICubeMeasureId());
            this.setRefPSSysBICubeMeasureName(pSSysBICubeMeasure.getPSSysBICubeMeasureName());
        }
        return this;
    }

    /**
     * <B>REFPSSYSBICUBEMEASURENAME</B>&nbsp;相关智能报表指标
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPSSYSBICUBEMEASUREID}
     */
    public final static String FIELD_REFPSSYSBICUBEMEASURENAME = "refpssysbicubemeasurename";

    /**
     * 设置 相关智能报表指标
     * 
     * @param refPSSysBICubeMeasureName
     * 
     */
    @JsonProperty(FIELD_REFPSSYSBICUBEMEASURENAME)
    public void setRefPSSysBICubeMeasureName(String refPSSysBICubeMeasureName){
        this.set(FIELD_REFPSSYSBICUBEMEASURENAME, refPSSysBICubeMeasureName);
    }
    
    /**
     * 获取 相关智能报表指标  
     * @return
     */
    @JsonIgnore
    public String getRefPSSysBICubeMeasureName(){
        Object objValue = this.get(FIELD_REFPSSYSBICUBEMEASURENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 相关智能报表指标 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSSysBICubeMeasureNameDirty(){
        if(this.contains(FIELD_REFPSSYSBICUBEMEASURENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 相关智能报表指标
     */
    @JsonIgnore
    public void resetRefPSSysBICubeMeasureName(){
        this.reset(FIELD_REFPSSYSBICUBEMEASURENAME);
    }

    /**
     * 设置 相关智能报表指标
     * <P>
     * 等同 {@link #setRefPSSysBICubeMeasureName}
     * @param refPSSysBICubeMeasureName
     */
    @JsonIgnore
    public PSSysBIReportItem refpssysbicubemeasurename(String refPSSysBICubeMeasureName){
        this.setRefPSSysBICubeMeasureName(refPSSysBICubeMeasureName);
        return this;
    }

    /**
     * <B>REFTYPE</B>&nbsp;指标引用类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.BIReportItemRefType} 
     */
    public final static String FIELD_REFTYPE = "reftype";

    /**
     * 设置 指标引用类型
     * 
     * @param refType
     * 
     */
    @JsonProperty(FIELD_REFTYPE)
    public void setRefType(String refType){
        this.set(FIELD_REFTYPE, refType);
    }
    
    /**
     * 获取 指标引用类型  
     * @return
     */
    @JsonIgnore
    public String getRefType(){
        Object objValue = this.get(FIELD_REFTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 指标引用类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefTypeDirty(){
        if(this.contains(FIELD_REFTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 指标引用类型
     */
    @JsonIgnore
    public void resetRefType(){
        this.reset(FIELD_REFTYPE);
    }

    /**
     * 设置 指标引用类型
     * <P>
     * 等同 {@link #setRefType}
     * @param refType
     */
    @JsonIgnore
    public PSSysBIReportItem reftype(String refType){
        this.setRefType(refType);
        return this;
    }

     /**
     * 设置 指标引用类型
     * <P>
     * 等同 {@link #setRefType}
     * @param refType
     */
    @JsonIgnore
    public PSSysBIReportItem reftype(net.ibizsys.psmodel.core.util.PSModelEnums.BIReportItemRefType refType){
        if(refType == null){
            this.setRefType(null);
        }
        else{
            this.setRefType(refType.value);
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
    public PSSysBIReportItem updatedate(String updateDate){
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
    public PSSysBIReportItem updateman(String updateMan){
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
    public PSSysBIReportItem usercat(String userCat){
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
    public PSSysBIReportItem usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysBIReportItem usertag(String userTag){
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
    public PSSysBIReportItem usertag2(String userTag2){
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
    public PSSysBIReportItem usertag3(String userTag3){
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
    public PSSysBIReportItem usertag4(String userTag4){
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
    public PSSysBIReportItem validflag(Integer validFlag){
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
    public PSSysBIReportItem validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>VALIGN</B>&nbsp;垂直对齐
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.TextVAlign} 
     */
    public final static String FIELD_VALIGN = "valign";

    /**
     * 设置 垂直对齐
     * 
     * @param vAlign
     * 
     */
    @JsonProperty(FIELD_VALIGN)
    public void setVAlign(String vAlign){
        this.set(FIELD_VALIGN, vAlign);
    }
    
    /**
     * 获取 垂直对齐  
     * @return
     */
    @JsonIgnore
    public String getVAlign(){
        Object objValue = this.get(FIELD_VALIGN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 垂直对齐 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isVAlignDirty(){
        if(this.contains(FIELD_VALIGN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 垂直对齐
     */
    @JsonIgnore
    public void resetVAlign(){
        this.reset(FIELD_VALIGN);
    }

    /**
     * 设置 垂直对齐
     * <P>
     * 等同 {@link #setVAlign}
     * @param vAlign
     */
    @JsonIgnore
    public PSSysBIReportItem valign(String vAlign){
        this.setVAlign(vAlign);
        return this;
    }

     /**
     * 设置 垂直对齐
     * <P>
     * 等同 {@link #setVAlign}
     * @param vAlign
     */
    @JsonIgnore
    public PSSysBIReportItem valign(net.ibizsys.psmodel.core.util.PSModelEnums.TextVAlign vAlign){
        if(vAlign == null){
            this.setVAlign(null);
        }
        else{
            this.setVAlign(vAlign.value);
        }
        return this;
    }

    /**
     * <B>VALUEFORMAT</B>&nbsp;值格式化
     * <P>
     * 字符串：最大长度 200
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
    public PSSysBIReportItem valueformat(String valueFormat){
        this.setValueFormat(valueFormat);
        return this;
    }

    /**
     * <B>WIDTH</B>&nbsp;宽度
     */
    public final static String FIELD_WIDTH = "width";

    /**
     * 设置 宽度
     * 
     * @param width
     * 
     */
    @JsonProperty(FIELD_WIDTH)
    public void setWidth(Integer width){
        this.set(FIELD_WIDTH, width);
    }
    
    /**
     * 获取 宽度  
     * @return
     */
    @JsonIgnore
    public Integer getWidth(){
        Object objValue = this.get(FIELD_WIDTH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 宽度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWidthDirty(){
        if(this.contains(FIELD_WIDTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 宽度
     */
    @JsonIgnore
    public void resetWidth(){
        this.reset(FIELD_WIDTH);
    }

    /**
     * 设置 宽度
     * <P>
     * 等同 {@link #setWidth}
     * @param width
     */
    @JsonIgnore
    public PSSysBIReportItem width(Integer width){
        this.setWidth(width);
        return this;
    }

    /**
     * <B>WIDTHUNIT</B>&nbsp;宽度单位
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.GridColWidthUnitType} 
     */
    public final static String FIELD_WIDTHUNIT = "widthunit";

    /**
     * 设置 宽度单位
     * 
     * @param widthUnit
     * 
     */
    @JsonProperty(FIELD_WIDTHUNIT)
    public void setWidthUnit(String widthUnit){
        this.set(FIELD_WIDTHUNIT, widthUnit);
    }
    
    /**
     * 获取 宽度单位  
     * @return
     */
    @JsonIgnore
    public String getWidthUnit(){
        Object objValue = this.get(FIELD_WIDTHUNIT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 宽度单位 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWidthUnitDirty(){
        if(this.contains(FIELD_WIDTHUNIT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 宽度单位
     */
    @JsonIgnore
    public void resetWidthUnit(){
        this.reset(FIELD_WIDTHUNIT);
    }

    /**
     * 设置 宽度单位
     * <P>
     * 等同 {@link #setWidthUnit}
     * @param widthUnit
     */
    @JsonIgnore
    public PSSysBIReportItem widthunit(String widthUnit){
        this.setWidthUnit(widthUnit);
        return this;
    }

     /**
     * 设置 宽度单位
     * <P>
     * 等同 {@link #setWidthUnit}
     * @param widthUnit
     */
    @JsonIgnore
    public PSSysBIReportItem widthunit(net.ibizsys.psmodel.core.util.PSModelEnums.GridColWidthUnitType widthUnit){
        if(widthUnit == null){
            this.setWidthUnit(null);
        }
        else{
            this.setWidthUnit(widthUnit.value);
        }
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysBIReportItemId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysBIReportItemId(strValue);
    }

    @JsonIgnore
    public PSSysBIReportItem id(String strValue){
        this.setPSSysBIReportItemId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysBIReportItem){
            PSSysBIReportItem model = (PSSysBIReportItem)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
