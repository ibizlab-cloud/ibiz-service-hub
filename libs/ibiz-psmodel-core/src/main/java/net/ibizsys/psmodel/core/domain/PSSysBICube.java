package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSBICUBE</B>智能立方体 模型传输对象
 * <P>
 * 智能报表系统的核心模型，用于定义多维数据分析的立方体结构。它通过关联数据实体、数据源、维度、指标等组件，构建可进行多维钻取、反查和分析的数据立方体
 */
public class PSSysBICube extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysBICube(){
        this.setValidFlag(1);
    }      

    /**
     * <B>BICUBEOPTION</B>&nbsp;立方体选项
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.BICubeOption} 
     */
    public final static String FIELD_BICUBEOPTION = "bicubeoption";

    /**
     * 设置 立方体选项
     * 
     * @param bICubeOption
     * 
     */
    @JsonProperty(FIELD_BICUBEOPTION)
    public void setBICubeOption(Integer bICubeOption){
        this.set(FIELD_BICUBEOPTION, bICubeOption);
    }
    
    /**
     * 获取 立方体选项  
     * @return
     */
    @JsonIgnore
    public Integer getBICubeOption(){
        Object objValue = this.get(FIELD_BICUBEOPTION);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 立方体选项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBICubeOptionDirty(){
        if(this.contains(FIELD_BICUBEOPTION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 立方体选项
     */
    @JsonIgnore
    public void resetBICubeOption(){
        this.reset(FIELD_BICUBEOPTION);
    }

    /**
     * 设置 立方体选项
     * <P>
     * 等同 {@link #setBICubeOption}
     * @param bICubeOption
     */
    @JsonIgnore
    public PSSysBICube bicubeoption(Integer bICubeOption){
        this.setBICubeOption(bICubeOption);
        return this;
    }

     /**
     * 设置 立方体选项
     * <P>
     * 等同 {@link #setBICubeOption}
     * @param bICubeOption
     */
    @JsonIgnore
    public PSSysBICube bicubeoption(net.ibizsys.psmodel.core.util.PSModelEnums.BICubeOption[] bICubeOption){
        if(bICubeOption == null || bICubeOption.length == 0){
            this.setBICubeOption(null);
        }
        else{
            int _value = 0;
            for(net.ibizsys.psmodel.core.util.PSModelEnums.BICubeOption _item : bICubeOption){
                _value |= _item.value;
            }
            this.setBICubeOption(_value);
        }
        return this;
    }

    /**
     * <B>BICUBEPARAMS</B>&nbsp;智能立方体参数
     */
    public final static String FIELD_BICUBEPARAMS = "bicubeparams";

    /**
     * 设置 智能立方体参数
     * 
     * @param bICubeParams
     * 
     */
    @JsonProperty(FIELD_BICUBEPARAMS)
    public void setBICubeParams(String bICubeParams){
        this.set(FIELD_BICUBEPARAMS, bICubeParams);
    }
    
    /**
     * 获取 智能立方体参数  
     * @return
     */
    @JsonIgnore
    public String getBICubeParams(){
        Object objValue = this.get(FIELD_BICUBEPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 智能立方体参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBICubeParamsDirty(){
        if(this.contains(FIELD_BICUBEPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 智能立方体参数
     */
    @JsonIgnore
    public void resetBICubeParams(){
        this.reset(FIELD_BICUBEPARAMS);
    }

    /**
     * 设置 智能立方体参数
     * <P>
     * 等同 {@link #setBICubeParams}
     * @param bICubeParams
     */
    @JsonIgnore
    public PSSysBICube bicubeparams(String bICubeParams){
        this.setBICubeParams(bICubeParams);
        return this;
    }

    /**
     * <B>BICUBETAG</B>&nbsp;立方体标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_BICUBETAG = "bicubetag";

    /**
     * 设置 立方体标记
     * 
     * @param bICubeTag
     * 
     */
    @JsonProperty(FIELD_BICUBETAG)
    public void setBICubeTag(String bICubeTag){
        this.set(FIELD_BICUBETAG, bICubeTag);
    }
    
    /**
     * 获取 立方体标记  
     * @return
     */
    @JsonIgnore
    public String getBICubeTag(){
        Object objValue = this.get(FIELD_BICUBETAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 立方体标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBICubeTagDirty(){
        if(this.contains(FIELD_BICUBETAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 立方体标记
     */
    @JsonIgnore
    public void resetBICubeTag(){
        this.reset(FIELD_BICUBETAG);
    }

    /**
     * 设置 立方体标记
     * <P>
     * 等同 {@link #setBICubeTag}
     * @param bICubeTag
     */
    @JsonIgnore
    public PSSysBICube bicubetag(String bICubeTag){
        this.setBICubeTag(bICubeTag);
        return this;
    }

    /**
     * <B>BICUBETAG2</B>&nbsp;立方体标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_BICUBETAG2 = "bicubetag2";

    /**
     * 设置 立方体标记2
     * 
     * @param bICubeTag2
     * 
     */
    @JsonProperty(FIELD_BICUBETAG2)
    public void setBICubeTag2(String bICubeTag2){
        this.set(FIELD_BICUBETAG2, bICubeTag2);
    }
    
    /**
     * 获取 立方体标记2  
     * @return
     */
    @JsonIgnore
    public String getBICubeTag2(){
        Object objValue = this.get(FIELD_BICUBETAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 立方体标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBICubeTag2Dirty(){
        if(this.contains(FIELD_BICUBETAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 立方体标记2
     */
    @JsonIgnore
    public void resetBICubeTag2(){
        this.reset(FIELD_BICUBETAG2);
    }

    /**
     * 设置 立方体标记2
     * <P>
     * 等同 {@link #setBICubeTag2}
     * @param bICubeTag2
     */
    @JsonIgnore
    public PSSysBICube bicubetag2(String bICubeTag2){
        this.setBICubeTag2(bICubeTag2);
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
    public PSSysBICube codename(String codeName){
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
    public PSSysBICube createdate(String createDate){
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
    public PSSysBICube createman(String createMan){
        this.setCreateMan(createMan);
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
    public PSSysBICube drilldetailpsdeviewid(String drillDetailPSDEViewId){
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
    public PSSysBICube drilldetailpsdeviewid(PSDEViewBase pSDEViewBase){
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
    public PSSysBICube drilldetailpsdeviewname(String drillDetailPSDEViewName){
        this.setDrillDetailPSDEViewName(drillDetailPSDEViewName);
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
    public PSSysBICube drilldownpsdeviewid(String drillDownPSDEViewId){
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
    public PSSysBICube drilldownpsdeviewid(PSDEViewBase pSDEViewBase){
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
    public PSSysBICube drilldownpsdeviewname(String drillDownPSDEViewName){
        this.setDrillDownPSDEViewName(drillDownPSDEViewName);
        return this;
    }

    /**
     * <B>ENABLECUSTOMIZED</B>&nbsp;支持定制，指定是否支持自定义立方体维度和指标
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLECUSTOMIZED = "enablecustomized";

    /**
     * 设置 支持定制，详细说明：{@link #FIELD_ENABLECUSTOMIZED}
     * 
     * @param enableCustomized
     * 
     */
    @JsonProperty(FIELD_ENABLECUSTOMIZED)
    public void setEnableCustomized(Integer enableCustomized){
        this.set(FIELD_ENABLECUSTOMIZED, enableCustomized);
    }
    
    /**
     * 获取 支持定制  
     * @return
     */
    @JsonIgnore
    public Integer getEnableCustomized(){
        Object objValue = this.get(FIELD_ENABLECUSTOMIZED);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持定制 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableCustomizedDirty(){
        if(this.contains(FIELD_ENABLECUSTOMIZED)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持定制
     */
    @JsonIgnore
    public void resetEnableCustomized(){
        this.reset(FIELD_ENABLECUSTOMIZED);
    }

    /**
     * 设置 支持定制，详细说明：{@link #FIELD_ENABLECUSTOMIZED}
     * <P>
     * 等同 {@link #setEnableCustomized}
     * @param enableCustomized
     */
    @JsonIgnore
    public PSSysBICube enablecustomized(Integer enableCustomized){
        this.setEnableCustomized(enableCustomized);
        return this;
    }

     /**
     * 设置 支持定制，详细说明：{@link #FIELD_ENABLECUSTOMIZED}
     * <P>
     * 等同 {@link #setEnableCustomized}
     * @param enableCustomized
     */
    @JsonIgnore
    public PSSysBICube enablecustomized(Boolean enableCustomized){
        if(enableCustomized == null){
            this.setEnableCustomized(null);
        }
        else{
            this.setEnableCustomized(enableCustomized?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>KEYPSDEFID</B>&nbsp;键值属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_KEYPSDEFID = "keypsdefid";

    /**
     * 设置 键值属性
     * 
     * @param keyPSDEFId
     * 
     */
    @JsonProperty(FIELD_KEYPSDEFID)
    public void setKeyPSDEFId(String keyPSDEFId){
        this.set(FIELD_KEYPSDEFID, keyPSDEFId);
    }
    
    /**
     * 获取 键值属性  
     * @return
     */
    @JsonIgnore
    public String getKeyPSDEFId(){
        Object objValue = this.get(FIELD_KEYPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 键值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isKeyPSDEFIdDirty(){
        if(this.contains(FIELD_KEYPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 键值属性
     */
    @JsonIgnore
    public void resetKeyPSDEFId(){
        this.reset(FIELD_KEYPSDEFID);
    }

    /**
     * 设置 键值属性
     * <P>
     * 等同 {@link #setKeyPSDEFId}
     * @param keyPSDEFId
     */
    @JsonIgnore
    public PSSysBICube keypsdefid(String keyPSDEFId){
        this.setKeyPSDEFId(keyPSDEFId);
        return this;
    }

    /**
     * 设置 键值属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setKeyPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysBICube keypsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setKeyPSDEFId(null);
            this.setKeyPSDEFName(null);
        }
        else{
            this.setKeyPSDEFId(pSDEField.getPSDEFieldId());
            this.setKeyPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>KEYPSDEFNAME</B>&nbsp;键值属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_KEYPSDEFID}
     */
    public final static String FIELD_KEYPSDEFNAME = "keypsdefname";

    /**
     * 设置 键值属性
     * 
     * @param keyPSDEFName
     * 
     */
    @JsonProperty(FIELD_KEYPSDEFNAME)
    public void setKeyPSDEFName(String keyPSDEFName){
        this.set(FIELD_KEYPSDEFNAME, keyPSDEFName);
    }
    
    /**
     * 获取 键值属性  
     * @return
     */
    @JsonIgnore
    public String getKeyPSDEFName(){
        Object objValue = this.get(FIELD_KEYPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 键值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isKeyPSDEFNameDirty(){
        if(this.contains(FIELD_KEYPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 键值属性
     */
    @JsonIgnore
    public void resetKeyPSDEFName(){
        this.reset(FIELD_KEYPSDEFNAME);
    }

    /**
     * 设置 键值属性
     * <P>
     * 等同 {@link #setKeyPSDEFName}
     * @param keyPSDEFName
     */
    @JsonIgnore
    public PSSysBICube keypsdefname(String keyPSDEFName){
        this.setKeyPSDEFName(keyPSDEFName);
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
    public PSSysBICube memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PORTLETPSDEUAGROUPID</B>&nbsp;门户部件界面行为组，指定立方体门户部件默认使用的界面行为组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEUAGroup} 
     */
    public final static String FIELD_PORTLETPSDEUAGROUPID = "portletpsdeuagroupid";

    /**
     * 设置 门户部件界面行为组，详细说明：{@link #FIELD_PORTLETPSDEUAGROUPID}
     * 
     * @param portletPSDEUAGroupId
     * 
     */
    @JsonProperty(FIELD_PORTLETPSDEUAGROUPID)
    public void setPortletPSDEUAGroupId(String portletPSDEUAGroupId){
        this.set(FIELD_PORTLETPSDEUAGROUPID, portletPSDEUAGroupId);
    }
    
    /**
     * 获取 门户部件界面行为组  
     * @return
     */
    @JsonIgnore
    public String getPortletPSDEUAGroupId(){
        Object objValue = this.get(FIELD_PORTLETPSDEUAGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 门户部件界面行为组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPortletPSDEUAGroupIdDirty(){
        if(this.contains(FIELD_PORTLETPSDEUAGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 门户部件界面行为组
     */
    @JsonIgnore
    public void resetPortletPSDEUAGroupId(){
        this.reset(FIELD_PORTLETPSDEUAGROUPID);
    }

    /**
     * 设置 门户部件界面行为组，详细说明：{@link #FIELD_PORTLETPSDEUAGROUPID}
     * <P>
     * 等同 {@link #setPortletPSDEUAGroupId}
     * @param portletPSDEUAGroupId
     */
    @JsonIgnore
    public PSSysBICube portletpsdeuagroupid(String portletPSDEUAGroupId){
        this.setPortletPSDEUAGroupId(portletPSDEUAGroupId);
        return this;
    }

    /**
     * 设置 门户部件界面行为组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPortletPSDEUAGroupId}
     * @param pSDEUAGroup 引用对象
     */
    @JsonIgnore
    public PSSysBICube portletpsdeuagroupid(PSDEUAGroup pSDEUAGroup){
        if(pSDEUAGroup == null){
            this.setPortletPSDEUAGroupId(null);
            this.setPortletPSDEUAGroupName(null);
        }
        else{
            this.setPortletPSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setPortletPSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    /**
     * <B>PORTLETPSDEUAGROUPNAME</B>&nbsp;门户部件界面行为组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PORTLETPSDEUAGROUPID}
     */
    public final static String FIELD_PORTLETPSDEUAGROUPNAME = "portletpsdeuagroupname";

    /**
     * 设置 门户部件界面行为组
     * 
     * @param portletPSDEUAGroupName
     * 
     */
    @JsonProperty(FIELD_PORTLETPSDEUAGROUPNAME)
    public void setPortletPSDEUAGroupName(String portletPSDEUAGroupName){
        this.set(FIELD_PORTLETPSDEUAGROUPNAME, portletPSDEUAGroupName);
    }
    
    /**
     * 获取 门户部件界面行为组  
     * @return
     */
    @JsonIgnore
    public String getPortletPSDEUAGroupName(){
        Object objValue = this.get(FIELD_PORTLETPSDEUAGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 门户部件界面行为组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPortletPSDEUAGroupNameDirty(){
        if(this.contains(FIELD_PORTLETPSDEUAGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 门户部件界面行为组
     */
    @JsonIgnore
    public void resetPortletPSDEUAGroupName(){
        this.reset(FIELD_PORTLETPSDEUAGROUPNAME);
    }

    /**
     * 设置 门户部件界面行为组
     * <P>
     * 等同 {@link #setPortletPSDEUAGroupName}
     * @param portletPSDEUAGroupName
     */
    @JsonIgnore
    public PSSysBICube portletpsdeuagroupname(String portletPSDEUAGroupName){
        this.setPortletPSDEUAGroupName(portletPSDEUAGroupName);
        return this;
    }

    /**
     * <B>PSDEDATASETID</B>&nbsp;立方体数据源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataSet} 
     */
    public final static String FIELD_PSDEDATASETID = "psdedatasetid";

    /**
     * 设置 立方体数据源
     * 
     * @param pSDEDataSetId
     * 
     */
    @JsonProperty(FIELD_PSDEDATASETID)
    public void setPSDEDataSetId(String pSDEDataSetId){
        this.set(FIELD_PSDEDATASETID, pSDEDataSetId);
    }
    
    /**
     * 获取 立方体数据源  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataSetId(){
        Object objValue = this.get(FIELD_PSDEDATASETID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 立方体数据源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataSetIdDirty(){
        if(this.contains(FIELD_PSDEDATASETID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 立方体数据源
     */
    @JsonIgnore
    public void resetPSDEDataSetId(){
        this.reset(FIELD_PSDEDATASETID);
    }

    /**
     * 设置 立方体数据源
     * <P>
     * 等同 {@link #setPSDEDataSetId}
     * @param pSDEDataSetId
     */
    @JsonIgnore
    public PSSysBICube psdedatasetid(String pSDEDataSetId){
        this.setPSDEDataSetId(pSDEDataSetId);
        return this;
    }

    /**
     * 设置 立方体数据源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDataSetId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSSysBICube psdedatasetid(PSDEDataSet pSDEDataSet){
        if(pSDEDataSet == null){
            this.setPSDEDataSetId(null);
            this.setPSDEDataSetName(null);
        }
        else{
            this.setPSDEDataSetId(pSDEDataSet.getPSDEDataSetId());
            this.setPSDEDataSetName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    /**
     * <B>PSDEDATASETNAME</B>&nbsp;数据源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDATASETID}
     */
    public final static String FIELD_PSDEDATASETNAME = "psdedatasetname";

    /**
     * 设置 数据源
     * 
     * @param pSDEDataSetName
     * 
     */
    @JsonProperty(FIELD_PSDEDATASETNAME)
    public void setPSDEDataSetName(String pSDEDataSetName){
        this.set(FIELD_PSDEDATASETNAME, pSDEDataSetName);
    }
    
    /**
     * 获取 数据源  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataSetName(){
        Object objValue = this.get(FIELD_PSDEDATASETNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataSetNameDirty(){
        if(this.contains(FIELD_PSDEDATASETNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据源
     */
    @JsonIgnore
    public void resetPSDEDataSetName(){
        this.reset(FIELD_PSDEDATASETNAME);
    }

    /**
     * 设置 数据源
     * <P>
     * 等同 {@link #setPSDEDataSetName}
     * @param pSDEDataSetName
     */
    @JsonIgnore
    public PSSysBICube psdedatasetname(String pSDEDataSetName){
        this.setPSDEDataSetName(pSDEDataSetName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;立方体实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 立方体实体
     * 
     * @param pSDEId
     * 
     */
    @JsonProperty(FIELD_PSDEID)
    public void setPSDEId(String pSDEId){
        this.set(FIELD_PSDEID, pSDEId);
    }
    
    /**
     * 获取 立方体实体  
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
     * 判断 立方体实体 是否指定值，包括空值
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
     * 重置 立方体实体
     */
    @JsonIgnore
    public void resetPSDEId(){
        this.reset(FIELD_PSDEID);
    }

    /**
     * 设置 立方体实体
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSSysBICube psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * 设置 立方体实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSSysBICube psdeid(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setPSDEId(null);
            this.setPSDEName(null);
        }
        else{
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>PSDENAME</B>&nbsp;立方体实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_PSDENAME = "psdename";

    /**
     * 设置 立方体实体
     * 
     * @param pSDEName
     * 
     */
    @JsonProperty(FIELD_PSDENAME)
    public void setPSDEName(String pSDEName){
        this.set(FIELD_PSDENAME, pSDEName);
    }
    
    /**
     * 获取 立方体实体  
     * @return
     */
    @JsonIgnore
    public String getPSDEName(){
        Object objValue = this.get(FIELD_PSDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 立方体实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDENameDirty(){
        if(this.contains(FIELD_PSDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 立方体实体
     */
    @JsonIgnore
    public void resetPSDEName(){
        this.reset(FIELD_PSDENAME);
    }

    /**
     * 设置 立方体实体
     * <P>
     * 等同 {@link #setPSDEName}
     * @param pSDEName
     */
    @JsonIgnore
    public PSSysBICube psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSSYSBICUBEID</B>&nbsp;智能报表立方体标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSBICUBEID = "pssysbicubeid";

    /**
     * 设置 智能报表立方体标识
     * 
     * @param pSSysBICubeId
     * 
     */
    @JsonProperty(FIELD_PSSYSBICUBEID)
    public void setPSSysBICubeId(String pSSysBICubeId){
        this.set(FIELD_PSSYSBICUBEID, pSSysBICubeId);
    }
    
    /**
     * 获取 智能报表立方体标识  
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
     * 判断 智能报表立方体标识 是否指定值，包括空值
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
     * 重置 智能报表立方体标识
     */
    @JsonIgnore
    public void resetPSSysBICubeId(){
        this.reset(FIELD_PSSYSBICUBEID);
    }

    /**
     * 设置 智能报表立方体标识
     * <P>
     * 等同 {@link #setPSSysBICubeId}
     * @param pSSysBICubeId
     */
    @JsonIgnore
    public PSSysBICube pssysbicubeid(String pSSysBICubeId){
        this.setPSSysBICubeId(pSSysBICubeId);
        return this;
    }

    /**
     * <B>PSSYSBICUBENAME</B>&nbsp;立方体名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSBICUBENAME = "pssysbicubename";

    /**
     * 设置 立方体名称
     * 
     * @param pSSysBICubeName
     * 
     */
    @JsonProperty(FIELD_PSSYSBICUBENAME)
    public void setPSSysBICubeName(String pSSysBICubeName){
        this.set(FIELD_PSSYSBICUBENAME, pSSysBICubeName);
    }
    
    /**
     * 获取 立方体名称  
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
     * 判断 立方体名称 是否指定值，包括空值
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
     * 重置 立方体名称
     */
    @JsonIgnore
    public void resetPSSysBICubeName(){
        this.reset(FIELD_PSSYSBICUBENAME);
    }

    /**
     * 设置 立方体名称
     * <P>
     * 等同 {@link #setPSSysBICubeName}
     * @param pSSysBICubeName
     */
    @JsonIgnore
    public PSSysBICube pssysbicubename(String pSSysBICubeName){
        this.setPSSysBICubeName(pSSysBICubeName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysBICubeName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysBICubeName(strName);
    }

    @JsonIgnore
    public PSSysBICube name(String strName){
        this.setPSSysBICubeName(strName);
        return this;
    }

    /**
     * <B>PSSYSBISCHEMEID</B>&nbsp;智能报表体系
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysBIScheme} 
     */
    public final static String FIELD_PSSYSBISCHEMEID = "pssysbischemeid";

    /**
     * 设置 智能报表体系
     * 
     * @param pSSysBISchemeId
     * 
     */
    @JsonProperty(FIELD_PSSYSBISCHEMEID)
    public void setPSSysBISchemeId(String pSSysBISchemeId){
        this.set(FIELD_PSSYSBISCHEMEID, pSSysBISchemeId);
    }
    
    /**
     * 获取 智能报表体系  
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
     * 判断 智能报表体系 是否指定值，包括空值
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
     * 重置 智能报表体系
     */
    @JsonIgnore
    public void resetPSSysBISchemeId(){
        this.reset(FIELD_PSSYSBISCHEMEID);
    }

    /**
     * 设置 智能报表体系
     * <P>
     * 等同 {@link #setPSSysBISchemeId}
     * @param pSSysBISchemeId
     */
    @JsonIgnore
    public PSSysBICube pssysbischemeid(String pSSysBISchemeId){
        this.setPSSysBISchemeId(pSSysBISchemeId);
        return this;
    }

    /**
     * 设置 智能报表体系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysBISchemeId}
     * @param pSSysBIScheme 引用对象
     */
    @JsonIgnore
    public PSSysBICube pssysbischemeid(PSSysBIScheme pSSysBIScheme){
        if(pSSysBIScheme == null){
            this.setPSSysBISchemeId(null);
            this.setPSSysBISchemeName(null);
        }
        else{
            this.setPSSysBISchemeId(pSSysBIScheme.getPSSysBISchemeId());
            this.setPSSysBISchemeName(pSSysBIScheme.getPSSysBISchemeName());
        }
        return this;
    }

    /**
     * <B>PSSYSBISCHEMENAME</B>&nbsp;智能报表体系
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBISCHEMEID}
     */
    public final static String FIELD_PSSYSBISCHEMENAME = "pssysbischemename";

    /**
     * 设置 智能报表体系
     * 
     * @param pSSysBISchemeName
     * 
     */
    @JsonProperty(FIELD_PSSYSBISCHEMENAME)
    public void setPSSysBISchemeName(String pSSysBISchemeName){
        this.set(FIELD_PSSYSBISCHEMENAME, pSSysBISchemeName);
    }
    
    /**
     * 获取 智能报表体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysBISchemeName(){
        Object objValue = this.get(FIELD_PSSYSBISCHEMENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 智能报表体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBISchemeNameDirty(){
        if(this.contains(FIELD_PSSYSBISCHEMENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 智能报表体系
     */
    @JsonIgnore
    public void resetPSSysBISchemeName(){
        this.reset(FIELD_PSSYSBISCHEMENAME);
    }

    /**
     * 设置 智能报表体系
     * <P>
     * 等同 {@link #setPSSysBISchemeName}
     * @param pSSysBISchemeName
     */
    @JsonIgnore
    public PSSysBICube pssysbischemename(String pSSysBISchemeName){
        this.setPSSysBISchemeName(pSSysBISchemeName);
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELID</B>&nbsp;系统动态模型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDynaModel} 
     */
    public final static String FIELD_PSSYSDYNAMODELID = "pssysdynamodelid";

    /**
     * 设置 系统动态模型
     * 
     * @param pSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELID)
    public void setPSSysDynaModelId(String pSSysDynaModelId){
        this.set(FIELD_PSSYSDYNAMODELID, pSSysDynaModelId);
    }
    
    /**
     * 获取 系统动态模型  
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
     * 判断 系统动态模型 是否指定值，包括空值
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
     * 重置 系统动态模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelId(){
        this.reset(FIELD_PSSYSDYNAMODELID);
    }

    /**
     * 设置 系统动态模型
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModelId
     */
    @JsonIgnore
    public PSSysBICube pssysdynamodelid(String pSSysDynaModelId){
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    /**
     * 设置 系统动态模型，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModel 引用对象
     */
    @JsonIgnore
    public PSSysBICube pssysdynamodelid(PSSysDynaModel pSSysDynaModel){
        if(pSSysDynaModel == null){
            this.setPSSysDynaModelId(null);
            this.setPSSysDynaModelName(null);
        }
        else{
            this.setPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELNAME</B>&nbsp;系统动态模型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDYNAMODELID}
     */
    public final static String FIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";

    /**
     * 设置 系统动态模型
     * 
     * @param pSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELNAME)
    public void setPSSysDynaModelName(String pSSysDynaModelName){
        this.set(FIELD_PSSYSDYNAMODELNAME, pSSysDynaModelName);
    }
    
    /**
     * 获取 系统动态模型  
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
     * 判断 系统动态模型 是否指定值，包括空值
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
     * 重置 系统动态模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelName(){
        this.reset(FIELD_PSSYSDYNAMODELNAME);
    }

    /**
     * 设置 系统动态模型
     * <P>
     * 等同 {@link #setPSSysDynaModelName}
     * @param pSSysDynaModelName
     */
    @JsonIgnore
    public PSSysBICube pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINID</B>&nbsp;后端模板插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysSFPlugin} 
     */
    public final static String FIELD_PSSYSSFPLUGINID = "pssyssfpluginid";

    /**
     * 设置 后端模板插件
     * 
     * @param pSSysSFPluginId
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINID)
    public void setPSSysSFPluginId(String pSSysSFPluginId){
        this.set(FIELD_PSSYSSFPLUGINID, pSSysSFPluginId);
    }
    
    /**
     * 获取 后端模板插件  
     * @return
     */
    @JsonIgnore
    public String getPSSysSFPluginId(){
        Object objValue = this.get(FIELD_PSSYSSFPLUGINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后端模板插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSFPluginIdDirty(){
        if(this.contains(FIELD_PSSYSSFPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后端模板插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginId(){
        this.reset(FIELD_PSSYSSFPLUGINID);
    }

    /**
     * 设置 后端模板插件
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPluginId
     */
    @JsonIgnore
    public PSSysBICube pssyssfpluginid(String pSSysSFPluginId){
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    /**
     * 设置 后端模板插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPlugin 引用对象
     */
    @JsonIgnore
    public PSSysBICube pssyssfpluginid(PSSysSFPlugin pSSysSFPlugin){
        if(pSSysSFPlugin == null){
            this.setPSSysSFPluginId(null);
            this.setPSSysSFPluginName(null);
        }
        else{
            this.setPSSysSFPluginId(pSSysSFPlugin.getPSSysSFPluginId());
            this.setPSSysSFPluginName(pSSysSFPlugin.getPSSysSFPluginName());
        }
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINNAME</B>&nbsp;后端模板插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSFPLUGINID}
     */
    public final static String FIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";

    /**
     * 设置 后端模板插件
     * 
     * @param pSSysSFPluginName
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINNAME)
    public void setPSSysSFPluginName(String pSSysSFPluginName){
        this.set(FIELD_PSSYSSFPLUGINNAME, pSSysSFPluginName);
    }
    
    /**
     * 获取 后端模板插件  
     * @return
     */
    @JsonIgnore
    public String getPSSysSFPluginName(){
        Object objValue = this.get(FIELD_PSSYSSFPLUGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后端模板插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSFPluginNameDirty(){
        if(this.contains(FIELD_PSSYSSFPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后端模板插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginName(){
        this.reset(FIELD_PSSYSSFPLUGINNAME);
    }

    /**
     * 设置 后端模板插件
     * <P>
     * 等同 {@link #setPSSysSFPluginName}
     * @param pSSysSFPluginName
     */
    @JsonIgnore
    public PSSysBICube pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    /**
     * <B>PSSYSUNIRESID</B>&nbsp;系统统一资源，指定访问立方体需要的系统统一资源对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysUniRes} 
     */
    public final static String FIELD_PSSYSUNIRESID = "pssysuniresid";

    /**
     * 设置 系统统一资源，详细说明：{@link #FIELD_PSSYSUNIRESID}
     * 
     * @param pSSysUniResId
     * 
     */
    @JsonProperty(FIELD_PSSYSUNIRESID)
    public void setPSSysUniResId(String pSSysUniResId){
        this.set(FIELD_PSSYSUNIRESID, pSSysUniResId);
    }
    
    /**
     * 获取 系统统一资源  
     * @return
     */
    @JsonIgnore
    public String getPSSysUniResId(){
        Object objValue = this.get(FIELD_PSSYSUNIRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统统一资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUniResIdDirty(){
        if(this.contains(FIELD_PSSYSUNIRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统统一资源
     */
    @JsonIgnore
    public void resetPSSysUniResId(){
        this.reset(FIELD_PSSYSUNIRESID);
    }

    /**
     * 设置 系统统一资源，详细说明：{@link #FIELD_PSSYSUNIRESID}
     * <P>
     * 等同 {@link #setPSSysUniResId}
     * @param pSSysUniResId
     */
    @JsonIgnore
    public PSSysBICube pssysuniresid(String pSSysUniResId){
        this.setPSSysUniResId(pSSysUniResId);
        return this;
    }

    /**
     * 设置 系统统一资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysUniResId}
     * @param pSSysUniRes 引用对象
     */
    @JsonIgnore
    public PSSysBICube pssysuniresid(PSSysUniRes pSSysUniRes){
        if(pSSysUniRes == null){
            this.setPSSysUniResId(null);
            this.setPSSysUniResName(null);
        }
        else{
            this.setPSSysUniResId(pSSysUniRes.getPSSysUniResId());
            this.setPSSysUniResName(pSSysUniRes.getPSSysUniResName());
        }
        return this;
    }

    /**
     * <B>PSSYSUNIRESNAME</B>&nbsp;系统统一资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSUNIRESID}
     */
    public final static String FIELD_PSSYSUNIRESNAME = "pssysuniresname";

    /**
     * 设置 系统统一资源
     * 
     * @param pSSysUniResName
     * 
     */
    @JsonProperty(FIELD_PSSYSUNIRESNAME)
    public void setPSSysUniResName(String pSSysUniResName){
        this.set(FIELD_PSSYSUNIRESNAME, pSSysUniResName);
    }
    
    /**
     * 获取 系统统一资源  
     * @return
     */
    @JsonIgnore
    public String getPSSysUniResName(){
        Object objValue = this.get(FIELD_PSSYSUNIRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统统一资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUniResNameDirty(){
        if(this.contains(FIELD_PSSYSUNIRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统统一资源
     */
    @JsonIgnore
    public void resetPSSysUniResName(){
        this.reset(FIELD_PSSYSUNIRESNAME);
    }

    /**
     * 设置 系统统一资源
     * <P>
     * 等同 {@link #setPSSysUniResName}
     * @param pSSysUniResName
     */
    @JsonIgnore
    public PSSysBICube pssysuniresname(String pSSysUniResName){
        this.setPSSysUniResName(pSSysUniResName);
        return this;
    }

    /**
     * <B>TYPEPSDEFID</B>&nbsp;类型属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_TYPEPSDEFID = "typepsdefid";

    /**
     * 设置 类型属性
     * 
     * @param typePSDEFId
     * 
     */
    @JsonProperty(FIELD_TYPEPSDEFID)
    public void setTypePSDEFId(String typePSDEFId){
        this.set(FIELD_TYPEPSDEFID, typePSDEFId);
    }
    
    /**
     * 获取 类型属性  
     * @return
     */
    @JsonIgnore
    public String getTypePSDEFId(){
        Object objValue = this.get(FIELD_TYPEPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 类型属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTypePSDEFIdDirty(){
        if(this.contains(FIELD_TYPEPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 类型属性
     */
    @JsonIgnore
    public void resetTypePSDEFId(){
        this.reset(FIELD_TYPEPSDEFID);
    }

    /**
     * 设置 类型属性
     * <P>
     * 等同 {@link #setTypePSDEFId}
     * @param typePSDEFId
     */
    @JsonIgnore
    public PSSysBICube typepsdefid(String typePSDEFId){
        this.setTypePSDEFId(typePSDEFId);
        return this;
    }

    /**
     * 设置 类型属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTypePSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysBICube typepsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setTypePSDEFId(null);
            this.setTypePSDEFName(null);
        }
        else{
            this.setTypePSDEFId(pSDEField.getPSDEFieldId());
            this.setTypePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>TYPEPSDEFNAME</B>&nbsp;类型属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TYPEPSDEFID}
     */
    public final static String FIELD_TYPEPSDEFNAME = "typepsdefname";

    /**
     * 设置 类型属性
     * 
     * @param typePSDEFName
     * 
     */
    @JsonProperty(FIELD_TYPEPSDEFNAME)
    public void setTypePSDEFName(String typePSDEFName){
        this.set(FIELD_TYPEPSDEFNAME, typePSDEFName);
    }
    
    /**
     * 获取 类型属性  
     * @return
     */
    @JsonIgnore
    public String getTypePSDEFName(){
        Object objValue = this.get(FIELD_TYPEPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 类型属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTypePSDEFNameDirty(){
        if(this.contains(FIELD_TYPEPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 类型属性
     */
    @JsonIgnore
    public void resetTypePSDEFName(){
        this.reset(FIELD_TYPEPSDEFNAME);
    }

    /**
     * 设置 类型属性
     * <P>
     * 等同 {@link #setTypePSDEFName}
     * @param typePSDEFName
     */
    @JsonIgnore
    public PSSysBICube typepsdefname(String typePSDEFName){
        this.setTypePSDEFName(typePSDEFName);
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
    public PSSysBICube updatedate(String updateDate){
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
    public PSSysBICube updateman(String updateMan){
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
    public PSSysBICube usercat(String userCat){
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
    public PSSysBICube usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysBICube usertag(String userTag){
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
    public PSSysBICube usertag2(String userTag2){
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
    public PSSysBICube usertag3(String userTag3){
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
    public PSSysBICube usertag4(String userTag4){
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
    public PSSysBICube validflag(Integer validFlag){
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
    public PSSysBICube validflag(Boolean validFlag){
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
        return this.getPSSysBICubeId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysBICubeId(strValue);
    }

    @JsonIgnore
    public PSSysBICube id(String strValue){
        this.setPSSysBICubeId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysBICube){
            PSSysBICube model = (PSSysBICube)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
