package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSBICUBEMEASURE</B>智能立方体指标 模型传输对象
 * <P>
 * 智能报表立方体核心模型，用于定义多维分析中的指标。它支持常规指标和动态计算指标，允许配置聚合方式、数据格式、钻取行为等，并与视图、代码表等组件关联
 */
public class PSSysBICubeMeasure extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysBICubeMeasure(){
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
    public PSSysBICubeMeasure aggtype(String aggType){
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
    public PSSysBICubeMeasure aggtype(net.ibizsys.psmodel.core.util.PSModelEnums.BIMeasureAggMode aggType){
        if(aggType == null){
            this.setAggType(null);
        }
        else{
            this.setAggType(aggType.value);
        }
        return this;
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
    public PSSysBICubeMeasure bicubemeasuretag(String bICubeMeasureTag){
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
    public PSSysBICubeMeasure bicubemeasuretag2(String bICubeMeasureTag2){
        this.setBICubeMeasureTag2(bICubeMeasureTag2);
        return this;
    }

    /**
     * <B>BIMEASUREGROUP</B>&nbsp;BI指标组
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_BIMEASUREGROUP = "bimeasuregroup";

    /**
     * 设置 BI指标组
     * 
     * @param bIMeasureGroup
     * 
     */
    @JsonProperty(FIELD_BIMEASUREGROUP)
    public void setBIMeasureGroup(String bIMeasureGroup){
        this.set(FIELD_BIMEASUREGROUP, bIMeasureGroup);
    }
    
    /**
     * 获取 BI指标组  
     * @return
     */
    @JsonIgnore
    public String getBIMeasureGroup(){
        Object objValue = this.get(FIELD_BIMEASUREGROUP);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 BI指标组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBIMeasureGroupDirty(){
        if(this.contains(FIELD_BIMEASUREGROUP)){
            return true;
        }
        return false;
    }

    /**
     * 重置 BI指标组
     */
    @JsonIgnore
    public void resetBIMeasureGroup(){
        this.reset(FIELD_BIMEASUREGROUP);
    }

    /**
     * 设置 BI指标组
     * <P>
     * 等同 {@link #setBIMeasureGroup}
     * @param bIMeasureGroup
     */
    @JsonIgnore
    public PSSysBICubeMeasure bimeasuregroup(String bIMeasureGroup){
        this.setBIMeasureGroup(bIMeasureGroup);
        return this;
    }

    /**
     * <B>BIMEASURETYPE</B>&nbsp;指标类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.BIMeasureType} 
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
    public PSSysBICubeMeasure bimeasuretype(String bIMeasureType){
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
    public PSSysBICubeMeasure bimeasuretype(net.ibizsys.psmodel.core.util.PSModelEnums.BIMeasureType bIMeasureType){
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
    public PSSysBICubeMeasure codename(String codeName){
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
    public PSSysBICubeMeasure createdate(String createDate){
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
    public PSSysBICubeMeasure createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DRILLDETAILCUSTOMCOND</B>&nbsp;反查自定义条件
     */
    public final static String FIELD_DRILLDETAILCUSTOMCOND = "drilldetailcustomcond";

    /**
     * 设置 反查自定义条件
     * 
     * @param drillDetailCustomCond
     * 
     */
    @JsonProperty(FIELD_DRILLDETAILCUSTOMCOND)
    public void setDrillDetailCustomCond(String drillDetailCustomCond){
        this.set(FIELD_DRILLDETAILCUSTOMCOND, drillDetailCustomCond);
    }
    
    /**
     * 获取 反查自定义条件  
     * @return
     */
    @JsonIgnore
    public String getDrillDetailCustomCond(){
        Object objValue = this.get(FIELD_DRILLDETAILCUSTOMCOND);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 反查自定义条件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDrillDetailCustomCondDirty(){
        if(this.contains(FIELD_DRILLDETAILCUSTOMCOND)){
            return true;
        }
        return false;
    }

    /**
     * 重置 反查自定义条件
     */
    @JsonIgnore
    public void resetDrillDetailCustomCond(){
        this.reset(FIELD_DRILLDETAILCUSTOMCOND);
    }

    /**
     * 设置 反查自定义条件
     * <P>
     * 等同 {@link #setDrillDetailCustomCond}
     * @param drillDetailCustomCond
     */
    @JsonIgnore
    public PSSysBICubeMeasure drilldetailcustomcond(String drillDetailCustomCond){
        this.setDrillDetailCustomCond(drillDetailCustomCond);
        return this;
    }

    /**
     * <B>DRILLDETAILCUSTOMTYPE</B>&nbsp;反查条件类型
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_DRILLDETAILCUSTOMTYPE = "drilldetailcustomtype";

    /**
     * 设置 反查条件类型
     * 
     * @param drillDetailCustomType
     * 
     */
    @JsonProperty(FIELD_DRILLDETAILCUSTOMTYPE)
    public void setDrillDetailCustomType(String drillDetailCustomType){
        this.set(FIELD_DRILLDETAILCUSTOMTYPE, drillDetailCustomType);
    }
    
    /**
     * 获取 反查条件类型  
     * @return
     */
    @JsonIgnore
    public String getDrillDetailCustomType(){
        Object objValue = this.get(FIELD_DRILLDETAILCUSTOMTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 反查条件类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDrillDetailCustomTypeDirty(){
        if(this.contains(FIELD_DRILLDETAILCUSTOMTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 反查条件类型
     */
    @JsonIgnore
    public void resetDrillDetailCustomType(){
        this.reset(FIELD_DRILLDETAILCUSTOMTYPE);
    }

    /**
     * 设置 反查条件类型
     * <P>
     * 等同 {@link #setDrillDetailCustomType}
     * @param drillDetailCustomType
     */
    @JsonIgnore
    public PSSysBICubeMeasure drilldetailcustomtype(String drillDetailCustomType){
        this.setDrillDetailCustomType(drillDetailCustomType);
        return this;
    }

    /**
     * <B>DRILLDETAILPSDEVIEWID</B>&nbsp;反查展示视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_DRILLDETAILPSDEVIEWID = "drilldetailpsdeviewid";

    /**
     * 设置 反查展示视图
     * 
     * @param drillDetailPSDEViewId
     * 
     */
    @JsonProperty(FIELD_DRILLDETAILPSDEVIEWID)
    public void setDrillDetailPSDEViewId(String drillDetailPSDEViewId){
        this.set(FIELD_DRILLDETAILPSDEVIEWID, drillDetailPSDEViewId);
    }
    
    /**
     * 获取 反查展示视图  
     * @return
     */
    @JsonIgnore
    public String getDrillDetailPSDEViewId(){
        Object objValue = this.get(FIELD_DRILLDETAILPSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 反查展示视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDrillDetailPSDEViewIdDirty(){
        if(this.contains(FIELD_DRILLDETAILPSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 反查展示视图
     */
    @JsonIgnore
    public void resetDrillDetailPSDEViewId(){
        this.reset(FIELD_DRILLDETAILPSDEVIEWID);
    }

    /**
     * 设置 反查展示视图
     * <P>
     * 等同 {@link #setDrillDetailPSDEViewId}
     * @param drillDetailPSDEViewId
     */
    @JsonIgnore
    public PSSysBICubeMeasure drilldetailpsdeviewid(String drillDetailPSDEViewId){
        this.setDrillDetailPSDEViewId(drillDetailPSDEViewId);
        return this;
    }

    /**
     * 设置 反查展示视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDrillDetailPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSSysBICubeMeasure drilldetailpsdeviewid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setDrillDetailPSDEViewId(null);
            this.setDrillDetailPSDEViewName(null);
        }
        else{
            this.setDrillDetailPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setDrillDetailPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>DRILLDETAILPSDEVIEWNAME</B>&nbsp;反查展示视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DRILLDETAILPSDEVIEWID}
     */
    public final static String FIELD_DRILLDETAILPSDEVIEWNAME = "drilldetailpsdeviewname";

    /**
     * 设置 反查展示视图
     * 
     * @param drillDetailPSDEViewName
     * 
     */
    @JsonProperty(FIELD_DRILLDETAILPSDEVIEWNAME)
    public void setDrillDetailPSDEViewName(String drillDetailPSDEViewName){
        this.set(FIELD_DRILLDETAILPSDEVIEWNAME, drillDetailPSDEViewName);
    }
    
    /**
     * 获取 反查展示视图  
     * @return
     */
    @JsonIgnore
    public String getDrillDetailPSDEViewName(){
        Object objValue = this.get(FIELD_DRILLDETAILPSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 反查展示视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDrillDetailPSDEViewNameDirty(){
        if(this.contains(FIELD_DRILLDETAILPSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 反查展示视图
     */
    @JsonIgnore
    public void resetDrillDetailPSDEViewName(){
        this.reset(FIELD_DRILLDETAILPSDEVIEWNAME);
    }

    /**
     * 设置 反查展示视图
     * <P>
     * 等同 {@link #setDrillDetailPSDEViewName}
     * @param drillDetailPSDEViewName
     */
    @JsonIgnore
    public PSSysBICubeMeasure drilldetailpsdeviewname(String drillDetailPSDEViewName){
        this.setDrillDetailPSDEViewName(drillDetailPSDEViewName);
        return this;
    }

    /**
     * <B>DRILLDOWNCUSTOMCOND</B>&nbsp;钻取自定义条件
     */
    public final static String FIELD_DRILLDOWNCUSTOMCOND = "drilldowncustomcond";

    /**
     * 设置 钻取自定义条件
     * 
     * @param drillDownCustomCond
     * 
     */
    @JsonProperty(FIELD_DRILLDOWNCUSTOMCOND)
    public void setDrillDownCustomCond(String drillDownCustomCond){
        this.set(FIELD_DRILLDOWNCUSTOMCOND, drillDownCustomCond);
    }
    
    /**
     * 获取 钻取自定义条件  
     * @return
     */
    @JsonIgnore
    public String getDrillDownCustomCond(){
        Object objValue = this.get(FIELD_DRILLDOWNCUSTOMCOND);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 钻取自定义条件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDrillDownCustomCondDirty(){
        if(this.contains(FIELD_DRILLDOWNCUSTOMCOND)){
            return true;
        }
        return false;
    }

    /**
     * 重置 钻取自定义条件
     */
    @JsonIgnore
    public void resetDrillDownCustomCond(){
        this.reset(FIELD_DRILLDOWNCUSTOMCOND);
    }

    /**
     * 设置 钻取自定义条件
     * <P>
     * 等同 {@link #setDrillDownCustomCond}
     * @param drillDownCustomCond
     */
    @JsonIgnore
    public PSSysBICubeMeasure drilldowncustomcond(String drillDownCustomCond){
        this.setDrillDownCustomCond(drillDownCustomCond);
        return this;
    }

    /**
     * <B>DRILLDOWNCUSTOMTYPE</B>&nbsp;钻取条件类型
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_DRILLDOWNCUSTOMTYPE = "drilldowncustomtype";

    /**
     * 设置 钻取条件类型
     * 
     * @param drillDownCustomType
     * 
     */
    @JsonProperty(FIELD_DRILLDOWNCUSTOMTYPE)
    public void setDrillDownCustomType(String drillDownCustomType){
        this.set(FIELD_DRILLDOWNCUSTOMTYPE, drillDownCustomType);
    }
    
    /**
     * 获取 钻取条件类型  
     * @return
     */
    @JsonIgnore
    public String getDrillDownCustomType(){
        Object objValue = this.get(FIELD_DRILLDOWNCUSTOMTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 钻取条件类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDrillDownCustomTypeDirty(){
        if(this.contains(FIELD_DRILLDOWNCUSTOMTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 钻取条件类型
     */
    @JsonIgnore
    public void resetDrillDownCustomType(){
        this.reset(FIELD_DRILLDOWNCUSTOMTYPE);
    }

    /**
     * 设置 钻取条件类型
     * <P>
     * 等同 {@link #setDrillDownCustomType}
     * @param drillDownCustomType
     */
    @JsonIgnore
    public PSSysBICubeMeasure drilldowncustomtype(String drillDownCustomType){
        this.setDrillDownCustomType(drillDownCustomType);
        return this;
    }

    /**
     * <B>DRILLDOWNPSDEVIEWID</B>&nbsp;下钻展示视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_DRILLDOWNPSDEVIEWID = "drilldownpsdeviewid";

    /**
     * 设置 下钻展示视图
     * 
     * @param drillDownPSDEViewId
     * 
     */
    @JsonProperty(FIELD_DRILLDOWNPSDEVIEWID)
    public void setDrillDownPSDEViewId(String drillDownPSDEViewId){
        this.set(FIELD_DRILLDOWNPSDEVIEWID, drillDownPSDEViewId);
    }
    
    /**
     * 获取 下钻展示视图  
     * @return
     */
    @JsonIgnore
    public String getDrillDownPSDEViewId(){
        Object objValue = this.get(FIELD_DRILLDOWNPSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 下钻展示视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDrillDownPSDEViewIdDirty(){
        if(this.contains(FIELD_DRILLDOWNPSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 下钻展示视图
     */
    @JsonIgnore
    public void resetDrillDownPSDEViewId(){
        this.reset(FIELD_DRILLDOWNPSDEVIEWID);
    }

    /**
     * 设置 下钻展示视图
     * <P>
     * 等同 {@link #setDrillDownPSDEViewId}
     * @param drillDownPSDEViewId
     */
    @JsonIgnore
    public PSSysBICubeMeasure drilldownpsdeviewid(String drillDownPSDEViewId){
        this.setDrillDownPSDEViewId(drillDownPSDEViewId);
        return this;
    }

    /**
     * 设置 下钻展示视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDrillDownPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSSysBICubeMeasure drilldownpsdeviewid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setDrillDownPSDEViewId(null);
            this.setDrillDownPSDEViewName(null);
        }
        else{
            this.setDrillDownPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setDrillDownPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>DRILLDOWNPSDEVIEWNAME</B>&nbsp;下钻展示视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DRILLDOWNPSDEVIEWID}
     */
    public final static String FIELD_DRILLDOWNPSDEVIEWNAME = "drilldownpsdeviewname";

    /**
     * 设置 下钻展示视图
     * 
     * @param drillDownPSDEViewName
     * 
     */
    @JsonProperty(FIELD_DRILLDOWNPSDEVIEWNAME)
    public void setDrillDownPSDEViewName(String drillDownPSDEViewName){
        this.set(FIELD_DRILLDOWNPSDEVIEWNAME, drillDownPSDEViewName);
    }
    
    /**
     * 获取 下钻展示视图  
     * @return
     */
    @JsonIgnore
    public String getDrillDownPSDEViewName(){
        Object objValue = this.get(FIELD_DRILLDOWNPSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 下钻展示视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDrillDownPSDEViewNameDirty(){
        if(this.contains(FIELD_DRILLDOWNPSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 下钻展示视图
     */
    @JsonIgnore
    public void resetDrillDownPSDEViewName(){
        this.reset(FIELD_DRILLDOWNPSDEVIEWNAME);
    }

    /**
     * 设置 下钻展示视图
     * <P>
     * 等同 {@link #setDrillDownPSDEViewName}
     * @param drillDownPSDEViewName
     */
    @JsonIgnore
    public PSSysBICubeMeasure drilldownpsdeviewname(String drillDownPSDEViewName){
        this.setDrillDownPSDEViewName(drillDownPSDEViewName);
        return this;
    }

    /**
     * <B>HIDDENDATAITEM</B>&nbsp;隐藏数据项
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
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
    public PSSysBICubeMeasure hiddendataitem(Integer hiddenDataItem){
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
    public PSSysBICubeMeasure hiddendataitem(Boolean hiddenDataItem){
        if(hiddenDataItem == null){
            this.setHiddenDataItem(null);
        }
        else{
            this.setHiddenDataItem(hiddenDataItem?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
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
    public PSSysBICubeMeasure jsonformat(String jsonFormat){
        this.setJsonFormat(jsonFormat);
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
    public PSSysBICubeMeasure measureformula(String measureFormula){
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
    public PSSysBICubeMeasure memo(String memo){
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
    public PSSysBICubeMeasure ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PARAMPSDEUIACTIONID</B>&nbsp;参数界面行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEUIAction} 
     */
    public final static String FIELD_PARAMPSDEUIACTIONID = "parampsdeuiactionid";

    /**
     * 设置 参数界面行为
     * 
     * @param paramPSDEUIActionId
     * 
     */
    @JsonProperty(FIELD_PARAMPSDEUIACTIONID)
    public void setParamPSDEUIActionId(String paramPSDEUIActionId){
        this.set(FIELD_PARAMPSDEUIACTIONID, paramPSDEUIActionId);
    }
    
    /**
     * 获取 参数界面行为  
     * @return
     */
    @JsonIgnore
    public String getParamPSDEUIActionId(){
        Object objValue = this.get(FIELD_PARAMPSDEUIACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数界面行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamPSDEUIActionIdDirty(){
        if(this.contains(FIELD_PARAMPSDEUIACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数界面行为
     */
    @JsonIgnore
    public void resetParamPSDEUIActionId(){
        this.reset(FIELD_PARAMPSDEUIACTIONID);
    }

    /**
     * 设置 参数界面行为
     * <P>
     * 等同 {@link #setParamPSDEUIActionId}
     * @param paramPSDEUIActionId
     */
    @JsonIgnore
    public PSSysBICubeMeasure parampsdeuiactionid(String paramPSDEUIActionId){
        this.setParamPSDEUIActionId(paramPSDEUIActionId);
        return this;
    }

    /**
     * 设置 参数界面行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setParamPSDEUIActionId}
     * @param pSDEUIAction 引用对象
     */
    @JsonIgnore
    public PSSysBICubeMeasure parampsdeuiactionid(PSDEUIAction pSDEUIAction){
        if(pSDEUIAction == null){
            this.setParamPSDEUIActionId(null);
            this.setParamPSDEUIActionName(null);
        }
        else{
            this.setParamPSDEUIActionId(pSDEUIAction.getPSDEUIActionId());
            this.setParamPSDEUIActionName(pSDEUIAction.getPSDEUIActionName());
        }
        return this;
    }

    /**
     * <B>PARAMPSDEUIACTIONNAME</B>&nbsp;参数界面行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PARAMPSDEUIACTIONID}
     */
    public final static String FIELD_PARAMPSDEUIACTIONNAME = "parampsdeuiactionname";

    /**
     * 设置 参数界面行为
     * 
     * @param paramPSDEUIActionName
     * 
     */
    @JsonProperty(FIELD_PARAMPSDEUIACTIONNAME)
    public void setParamPSDEUIActionName(String paramPSDEUIActionName){
        this.set(FIELD_PARAMPSDEUIACTIONNAME, paramPSDEUIActionName);
    }
    
    /**
     * 获取 参数界面行为  
     * @return
     */
    @JsonIgnore
    public String getParamPSDEUIActionName(){
        Object objValue = this.get(FIELD_PARAMPSDEUIACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数界面行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamPSDEUIActionNameDirty(){
        if(this.contains(FIELD_PARAMPSDEUIACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数界面行为
     */
    @JsonIgnore
    public void resetParamPSDEUIActionName(){
        this.reset(FIELD_PARAMPSDEUIACTIONNAME);
    }

    /**
     * 设置 参数界面行为
     * <P>
     * 等同 {@link #setParamPSDEUIActionName}
     * @param paramPSDEUIActionName
     */
    @JsonIgnore
    public PSSysBICubeMeasure parampsdeuiactionname(String paramPSDEUIActionName){
        this.setParamPSDEUIActionName(paramPSDEUIActionName);
        return this;
    }

    /**
     * <B>PSCODELISTID</B>&nbsp;阈值代码表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSCodeList} 
     */
    public final static String FIELD_PSCODELISTID = "pscodelistid";

    /**
     * 设置 阈值代码表
     * 
     * @param pSCodeListId
     * 
     */
    @JsonProperty(FIELD_PSCODELISTID)
    public void setPSCodeListId(String pSCodeListId){
        this.set(FIELD_PSCODELISTID, pSCodeListId);
    }
    
    /**
     * 获取 阈值代码表  
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
     * 判断 阈值代码表 是否指定值，包括空值
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
     * 重置 阈值代码表
     */
    @JsonIgnore
    public void resetPSCodeListId(){
        this.reset(FIELD_PSCODELISTID);
    }

    /**
     * 设置 阈值代码表
     * <P>
     * 等同 {@link #setPSCodeListId}
     * @param pSCodeListId
     */
    @JsonIgnore
    public PSSysBICubeMeasure pscodelistid(String pSCodeListId){
        this.setPSCodeListId(pSCodeListId);
        return this;
    }

    /**
     * 设置 阈值代码表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSCodeListId}
     * @param pSCodeList 引用对象
     */
    @JsonIgnore
    public PSSysBICubeMeasure pscodelistid(PSCodeList pSCodeList){
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
     * <B>PSCODELISTNAME</B>&nbsp;阈值代码表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCODELISTID}
     */
    public final static String FIELD_PSCODELISTNAME = "pscodelistname";

    /**
     * 设置 阈值代码表
     * 
     * @param pSCodeListName
     * 
     */
    @JsonProperty(FIELD_PSCODELISTNAME)
    public void setPSCodeListName(String pSCodeListName){
        this.set(FIELD_PSCODELISTNAME, pSCodeListName);
    }
    
    /**
     * 获取 阈值代码表  
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
     * 判断 阈值代码表 是否指定值，包括空值
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
     * 重置 阈值代码表
     */
    @JsonIgnore
    public void resetPSCodeListName(){
        this.reset(FIELD_PSCODELISTNAME);
    }

    /**
     * 设置 阈值代码表
     * <P>
     * 等同 {@link #setPSCodeListName}
     * @param pSCodeListName
     */
    @JsonIgnore
    public PSSysBICubeMeasure pscodelistname(String pSCodeListName){
        this.setPSCodeListName(pSCodeListName);
        return this;
    }

    /**
     * <B>PSDEFID</B>&nbsp;实体属性，指定常规指标相关的属性，
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
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
    public PSSysBICubeMeasure psdefid(String pSDEFId){
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
    public PSSysBICubeMeasure psdefid(PSDEField pSDEField){
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
    public PSSysBICubeMeasure psdefname(String pSDEFName){
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
    public PSSysBICubeMeasure psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
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
    public PSSysBICubeMeasure pssysbicubeid(String pSSysBICubeId){
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
    public PSSysBICubeMeasure pssysbicubeid(PSSysBICube pSSysBICube){
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
    public PSSysBICubeMeasure pssysbicubemeasureid(String pSSysBICubeMeasureId){
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
    public PSSysBICubeMeasure pssysbicubemeasurename(String pSSysBICubeMeasureName){
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
    public PSSysBICubeMeasure name(String strName){
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
    public PSSysBICubeMeasure pssysbicubename(String pSSysBICubeName){
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
    public PSSysBICubeMeasure pssysbischemeid(String pSSysBISchemeId){
        this.setPSSysBISchemeId(pSSysBISchemeId);
        return this;
    }

    /**
     * <B>PSSYSTRANSLATORID</B>&nbsp;值转换器
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysTranslator} 
     */
    public final static String FIELD_PSSYSTRANSLATORID = "pssystranslatorid";

    /**
     * 设置 值转换器
     * 
     * @param pSSysTranslatorId
     * 
     */
    @JsonProperty(FIELD_PSSYSTRANSLATORID)
    public void setPSSysTranslatorId(String pSSysTranslatorId){
        this.set(FIELD_PSSYSTRANSLATORID, pSSysTranslatorId);
    }
    
    /**
     * 获取 值转换器  
     * @return
     */
    @JsonIgnore
    public String getPSSysTranslatorId(){
        Object objValue = this.get(FIELD_PSSYSTRANSLATORID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值转换器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysTranslatorIdDirty(){
        if(this.contains(FIELD_PSSYSTRANSLATORID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值转换器
     */
    @JsonIgnore
    public void resetPSSysTranslatorId(){
        this.reset(FIELD_PSSYSTRANSLATORID);
    }

    /**
     * 设置 值转换器
     * <P>
     * 等同 {@link #setPSSysTranslatorId}
     * @param pSSysTranslatorId
     */
    @JsonIgnore
    public PSSysBICubeMeasure pssystranslatorid(String pSSysTranslatorId){
        this.setPSSysTranslatorId(pSSysTranslatorId);
        return this;
    }

    /**
     * 设置 值转换器，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysTranslatorId}
     * @param pSSysTranslator 引用对象
     */
    @JsonIgnore
    public PSSysBICubeMeasure pssystranslatorid(PSSysTranslator pSSysTranslator){
        if(pSSysTranslator == null){
            this.setPSSysTranslatorId(null);
            this.setPSSysTranslatorName(null);
        }
        else{
            this.setPSSysTranslatorId(pSSysTranslator.getPSSysTranslatorId());
            this.setPSSysTranslatorName(pSSysTranslator.getPSSysTranslatorName());
        }
        return this;
    }

    /**
     * <B>PSSYSTRANSLATORNAME</B>&nbsp;值转换器
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSTRANSLATORID}
     */
    public final static String FIELD_PSSYSTRANSLATORNAME = "pssystranslatorname";

    /**
     * 设置 值转换器
     * 
     * @param pSSysTranslatorName
     * 
     */
    @JsonProperty(FIELD_PSSYSTRANSLATORNAME)
    public void setPSSysTranslatorName(String pSSysTranslatorName){
        this.set(FIELD_PSSYSTRANSLATORNAME, pSSysTranslatorName);
    }
    
    /**
     * 获取 值转换器  
     * @return
     */
    @JsonIgnore
    public String getPSSysTranslatorName(){
        Object objValue = this.get(FIELD_PSSYSTRANSLATORNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值转换器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysTranslatorNameDirty(){
        if(this.contains(FIELD_PSSYSTRANSLATORNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值转换器
     */
    @JsonIgnore
    public void resetPSSysTranslatorName(){
        this.reset(FIELD_PSSYSTRANSLATORNAME);
    }

    /**
     * 设置 值转换器
     * <P>
     * 等同 {@link #setPSSysTranslatorName}
     * @param pSSysTranslatorName
     */
    @JsonIgnore
    public PSSysBICubeMeasure pssystranslatorname(String pSSysTranslatorName){
        this.setPSSysTranslatorName(pSSysTranslatorName);
        return this;
    }

    /**
     * <B>STDDATATYPE</B>&nbsp;标准数据类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.StdDataType} 
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
    public PSSysBICubeMeasure stddatatype(Integer stdDataType){
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
    public PSSysBICubeMeasure stddatatype(net.ibizsys.psmodel.core.util.PSModelEnums.StdDataType stdDataType){
        if(stdDataType == null){
            this.setStdDataType(null);
        }
        else{
            this.setStdDataType(stdDataType.value);
        }
        return this;
    }

    /**
     * <B>TEXTTEMPLATE</B>&nbsp;文本模板
     */
    public final static String FIELD_TEXTTEMPLATE = "texttemplate";

    /**
     * 设置 文本模板
     * 
     * @param textTemplate
     * 
     */
    @JsonProperty(FIELD_TEXTTEMPLATE)
    public void setTextTemplate(String textTemplate){
        this.set(FIELD_TEXTTEMPLATE, textTemplate);
    }
    
    /**
     * 获取 文本模板  
     * @return
     */
    @JsonIgnore
    public String getTextTemplate(){
        Object objValue = this.get(FIELD_TEXTTEMPLATE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 文本模板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTextTemplateDirty(){
        if(this.contains(FIELD_TEXTTEMPLATE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 文本模板
     */
    @JsonIgnore
    public void resetTextTemplate(){
        this.reset(FIELD_TEXTTEMPLATE);
    }

    /**
     * 设置 文本模板
     * <P>
     * 等同 {@link #setTextTemplate}
     * @param textTemplate
     */
    @JsonIgnore
    public PSSysBICubeMeasure texttemplate(String textTemplate){
        this.setTextTemplate(textTemplate);
        return this;
    }

    /**
     * <B>TIPTEMPLATE</B>&nbsp;提示模板
     */
    public final static String FIELD_TIPTEMPLATE = "tiptemplate";

    /**
     * 设置 提示模板
     * 
     * @param tipTemplate
     * 
     */
    @JsonProperty(FIELD_TIPTEMPLATE)
    public void setTipTemplate(String tipTemplate){
        this.set(FIELD_TIPTEMPLATE, tipTemplate);
    }
    
    /**
     * 获取 提示模板  
     * @return
     */
    @JsonIgnore
    public String getTipTemplate(){
        Object objValue = this.get(FIELD_TIPTEMPLATE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 提示模板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTipTemplateDirty(){
        if(this.contains(FIELD_TIPTEMPLATE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 提示模板
     */
    @JsonIgnore
    public void resetTipTemplate(){
        this.reset(FIELD_TIPTEMPLATE);
    }

    /**
     * 设置 提示模板
     * <P>
     * 等同 {@link #setTipTemplate}
     * @param tipTemplate
     */
    @JsonIgnore
    public PSSysBICubeMeasure tiptemplate(String tipTemplate){
        this.setTipTemplate(tipTemplate);
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
    public PSSysBICubeMeasure updatedate(String updateDate){
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
    public PSSysBICubeMeasure updateman(String updateMan){
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
    public PSSysBICubeMeasure usercat(String userCat){
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
    public PSSysBICubeMeasure usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysBICubeMeasure usertag(String userTag){
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
    public PSSysBICubeMeasure usertag2(String userTag2){
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
    public PSSysBICubeMeasure usertag3(String userTag3){
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
    public PSSysBICubeMeasure usertag4(String userTag4){
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
    public PSSysBICubeMeasure validflag(Integer validFlag){
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
    public PSSysBICubeMeasure validflag(Boolean validFlag){
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
    public PSSysBICubeMeasure valueformat(String valueFormat){
        this.setValueFormat(valueFormat);
        return this;
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
    public PSSysBICubeMeasure id(String strValue){
        this.setPSSysBICubeMeasureId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysBICubeMeasure){
            PSSysBICubeMeasure model = (PSSysBICubeMeasure)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
