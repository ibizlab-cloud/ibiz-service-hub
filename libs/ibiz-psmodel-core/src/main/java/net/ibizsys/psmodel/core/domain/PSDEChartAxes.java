package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSDECHARTAXES</B>实体图表坐标轴 模型传输对象
 * <P>
 * 实体图表部件的坐标轴模型，定义坐标轴的类型，刻度等逻辑，不同类型的坐标轴放置在不同的坐标系中
 */
public class PSDEChartAxes extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEChartAxes(){
    }      

    /**
     * <B>AXESDATA</B>&nbsp;轴数据，指定图表坐标轴的数据
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_AXESDATA = "axesdata";

    /**
     * 设置 轴数据，详细说明：{@link #FIELD_AXESDATA}
     * 
     * @param axesData
     * 
     */
    @JsonProperty(FIELD_AXESDATA)
    public void setAxesData(String axesData){
        this.set(FIELD_AXESDATA, axesData);
    }
    
    /**
     * 获取 轴数据  
     * @return
     */
    @JsonIgnore
    public String getAxesData(){
        Object objValue = this.get(FIELD_AXESDATA);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 轴数据 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAxesDataDirty(){
        if(this.contains(FIELD_AXESDATA)){
            return true;
        }
        return false;
    }

    /**
     * 重置 轴数据
     */
    @JsonIgnore
    public void resetAxesData(){
        this.reset(FIELD_AXESDATA);
    }

    /**
     * 设置 轴数据，详细说明：{@link #FIELD_AXESDATA}
     * <P>
     * 等同 {@link #setAxesData}
     * @param axesData
     */
    @JsonIgnore
    public PSDEChartAxes axesdata(String axesData){
        this.setAxesData(axesData);
        return this;
    }

    /**
     * <B>AXESDATA2</B>&nbsp;轴数据2，指定图表坐标轴的数据2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_AXESDATA2 = "axesdata2";

    /**
     * 设置 轴数据2，详细说明：{@link #FIELD_AXESDATA2}
     * 
     * @param axesData2
     * 
     */
    @JsonProperty(FIELD_AXESDATA2)
    public void setAxesData2(String axesData2){
        this.set(FIELD_AXESDATA2, axesData2);
    }
    
    /**
     * 获取 轴数据2  
     * @return
     */
    @JsonIgnore
    public String getAxesData2(){
        Object objValue = this.get(FIELD_AXESDATA2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 轴数据2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAxesData2Dirty(){
        if(this.contains(FIELD_AXESDATA2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 轴数据2
     */
    @JsonIgnore
    public void resetAxesData2(){
        this.reset(FIELD_AXESDATA2);
    }

    /**
     * 设置 轴数据2，详细说明：{@link #FIELD_AXESDATA2}
     * <P>
     * 等同 {@link #setAxesData2}
     * @param axesData2
     */
    @JsonIgnore
    public PSDEChartAxes axesdata2(String axesData2){
        this.setAxesData2(axesData2);
        return this;
    }

    /**
     * <B>AXESMAXVALUE</B>&nbsp;最大值，指定图表坐标轴刻度的最大值
     */
    public final static String FIELD_AXESMAXVALUE = "axesmaxvalue";

    /**
     * 设置 最大值，详细说明：{@link #FIELD_AXESMAXVALUE}
     * 
     * @param axesMaxValue
     * 
     */
    @JsonProperty(FIELD_AXESMAXVALUE)
    public void setAxesMaxValue(BigDecimal axesMaxValue){
        this.set(FIELD_AXESMAXVALUE, axesMaxValue);
    }
    
    /**
     * 获取 最大值  
     * @return
     */
    @JsonIgnore
    public BigDecimal getAxesMaxValue(){
        Object objValue = this.get(FIELD_AXESMAXVALUE);
        if(objValue==null){
            return null;
        }
        return (BigDecimal)objValue;
    }

    /**
     * 判断 最大值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAxesMaxValueDirty(){
        if(this.contains(FIELD_AXESMAXVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 最大值
     */
    @JsonIgnore
    public void resetAxesMaxValue(){
        this.reset(FIELD_AXESMAXVALUE);
    }

    /**
     * 设置 最大值，详细说明：{@link #FIELD_AXESMAXVALUE}
     * <P>
     * 等同 {@link #setAxesMaxValue}
     * @param axesMaxValue
     */
    @JsonIgnore
    public PSDEChartAxes axesmaxvalue(BigDecimal axesMaxValue){
        this.setAxesMaxValue(axesMaxValue);
        return this;
    }

    /**
     * <B>AXESMINVALUE</B>&nbsp;最小值，指定图表坐标轴刻度的最小值
     */
    public final static String FIELD_AXESMINVALUE = "axesminvalue";

    /**
     * 设置 最小值，详细说明：{@link #FIELD_AXESMINVALUE}
     * 
     * @param axesMinValue
     * 
     */
    @JsonProperty(FIELD_AXESMINVALUE)
    public void setAxesMinValue(BigDecimal axesMinValue){
        this.set(FIELD_AXESMINVALUE, axesMinValue);
    }
    
    /**
     * 获取 最小值  
     * @return
     */
    @JsonIgnore
    public BigDecimal getAxesMinValue(){
        Object objValue = this.get(FIELD_AXESMINVALUE);
        if(objValue==null){
            return null;
        }
        return (BigDecimal)objValue;
    }

    /**
     * 判断 最小值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAxesMinValueDirty(){
        if(this.contains(FIELD_AXESMINVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 最小值
     */
    @JsonIgnore
    public void resetAxesMinValue(){
        this.reset(FIELD_AXESMINVALUE);
    }

    /**
     * 设置 最小值，详细说明：{@link #FIELD_AXESMINVALUE}
     * <P>
     * 等同 {@link #setAxesMinValue}
     * @param axesMinValue
     */
    @JsonIgnore
    public PSDEChartAxes axesminvalue(BigDecimal axesMinValue){
        this.setAxesMinValue(axesMinValue);
        return this;
    }

    /**
     * <B>AXESPOS</B>&nbsp;坐标轴位置，指定图表坐标轴的位置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ChartAxisPos} 
     */
    public final static String FIELD_AXESPOS = "axespos";

    /**
     * 设置 坐标轴位置，详细说明：{@link #FIELD_AXESPOS}
     * 
     * @param axesPos
     * 
     */
    @JsonProperty(FIELD_AXESPOS)
    public void setAxesPos(String axesPos){
        this.set(FIELD_AXESPOS, axesPos);
    }
    
    /**
     * 获取 坐标轴位置  
     * @return
     */
    @JsonIgnore
    public String getAxesPos(){
        Object objValue = this.get(FIELD_AXESPOS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 坐标轴位置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAxesPosDirty(){
        if(this.contains(FIELD_AXESPOS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 坐标轴位置
     */
    @JsonIgnore
    public void resetAxesPos(){
        this.reset(FIELD_AXESPOS);
    }

    /**
     * 设置 坐标轴位置，详细说明：{@link #FIELD_AXESPOS}
     * <P>
     * 等同 {@link #setAxesPos}
     * @param axesPos
     */
    @JsonIgnore
    public PSDEChartAxes axespos(String axesPos){
        this.setAxesPos(axesPos);
        return this;
    }

     /**
     * 设置 坐标轴位置，详细说明：{@link #FIELD_AXESPOS}
     * <P>
     * 等同 {@link #setAxesPos}
     * @param axesPos
     */
    @JsonIgnore
    public PSDEChartAxes axespos(net.ibizsys.psmodel.core.util.PSModelEnums.ChartAxisPos axesPos){
        if(axesPos == null){
            this.setAxesPos(null);
        }
        else{
            this.setAxesPos(axesPos.value);
        }
        return this;
    }

    /**
     * <B>AXESTYPE</B>&nbsp;坐标轴类型，指定图表坐标轴标记值的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ChartAxisType} 
     */
    public final static String FIELD_AXESTYPE = "axestype";

    /**
     * 设置 坐标轴类型，详细说明：{@link #FIELD_AXESTYPE}
     * 
     * @param axesType
     * 
     */
    @JsonProperty(FIELD_AXESTYPE)
    public void setAxesType(String axesType){
        this.set(FIELD_AXESTYPE, axesType);
    }
    
    /**
     * 获取 坐标轴类型  
     * @return
     */
    @JsonIgnore
    public String getAxesType(){
        Object objValue = this.get(FIELD_AXESTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 坐标轴类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAxesTypeDirty(){
        if(this.contains(FIELD_AXESTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 坐标轴类型
     */
    @JsonIgnore
    public void resetAxesType(){
        this.reset(FIELD_AXESTYPE);
    }

    /**
     * 设置 坐标轴类型，详细说明：{@link #FIELD_AXESTYPE}
     * <P>
     * 等同 {@link #setAxesType}
     * @param axesType
     */
    @JsonIgnore
    public PSDEChartAxes axestype(String axesType){
        this.setAxesType(axesType);
        return this;
    }

     /**
     * 设置 坐标轴类型，详细说明：{@link #FIELD_AXESTYPE}
     * <P>
     * 等同 {@link #setAxesType}
     * @param axesType
     */
    @JsonIgnore
    public PSDEChartAxes axestype(net.ibizsys.psmodel.core.util.PSModelEnums.ChartAxisType axesType){
        if(axesType == null){
            this.setAxesType(null);
        }
        else{
            this.setAxesType(axesType.value);
        }
        return this;
    }

    /**
     * <B>CAPPSLANRESID</B>&nbsp;标题语言资源，指定图表坐标轴标题的多语言资源对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
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
    public PSDEChartAxes cappslanresid(String capPSLanResId){
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
    public PSDEChartAxes cappslanresid(PSLanguageRes pSLanguageRes){
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
     * <B>CAPPSLANRESNAME</B>&nbsp;标题语言资源，指定图表坐标轴标题的多语言资源对象
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
    public PSDEChartAxes cappslanresname(String capPSLanResName){
        this.setCapPSLanResName(capPSLanResName);
        return this;
    }

    /**
     * <B>CAPTION</B>&nbsp;标题，指定图表坐标轴的标题
     * <P>
     * 字符串：最大长度 50
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
    public PSDEChartAxes caption(String caption){
        this.setCaption(caption);
        return this;
    }

    /**
     * <B>COORDINATESYSTEMID</B>&nbsp;坐标系统索引，指定图表坐标轴使用的坐标系统索引，-1为自动判断，未定义时为【-1】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ChartCSIndex} 
     */
    public final static String FIELD_COORDINATESYSTEMID = "coordinatesystemid";

    /**
     * 设置 坐标系统索引，详细说明：{@link #FIELD_COORDINATESYSTEMID}
     * 
     * @param coordinateSystemId
     * 
     */
    @JsonProperty(FIELD_COORDINATESYSTEMID)
    public void setCoordinateSystemId(Integer coordinateSystemId){
        this.set(FIELD_COORDINATESYSTEMID, coordinateSystemId);
    }
    
    /**
     * 获取 坐标系统索引  
     * @return
     */
    @JsonIgnore
    public Integer getCoordinateSystemId(){
        Object objValue = this.get(FIELD_COORDINATESYSTEMID);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 坐标系统索引 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCoordinateSystemIdDirty(){
        if(this.contains(FIELD_COORDINATESYSTEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 坐标系统索引
     */
    @JsonIgnore
    public void resetCoordinateSystemId(){
        this.reset(FIELD_COORDINATESYSTEMID);
    }

    /**
     * 设置 坐标系统索引，详细说明：{@link #FIELD_COORDINATESYSTEMID}
     * <P>
     * 等同 {@link #setCoordinateSystemId}
     * @param coordinateSystemId
     */
    @JsonIgnore
    public PSDEChartAxes coordinatesystemid(Integer coordinateSystemId){
        this.setCoordinateSystemId(coordinateSystemId);
        return this;
    }

     /**
     * 设置 坐标系统索引，详细说明：{@link #FIELD_COORDINATESYSTEMID}
     * <P>
     * 等同 {@link #setCoordinateSystemId}
     * @param coordinateSystemId
     */
    @JsonIgnore
    public PSDEChartAxes coordinatesystemid(net.ibizsys.psmodel.core.util.PSModelEnums.ChartCSIndex coordinateSystemId){
        if(coordinateSystemId == null){
            this.setCoordinateSystemId(null);
        }
        else{
            this.setCoordinateSystemId(coordinateSystemId.value);
        }
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
    public PSDEChartAxes createdate(String createDate){
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
    public PSDEChartAxes createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DATASHOWMODE</B>&nbsp;数据显示方式，指定图表坐标轴的数据显示方式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ChartAxisDataShowMode} 
     */
    public final static String FIELD_DATASHOWMODE = "datashowmode";

    /**
     * 设置 数据显示方式，详细说明：{@link #FIELD_DATASHOWMODE}
     * 
     * @param dataShowMode
     * 
     */
    @JsonProperty(FIELD_DATASHOWMODE)
    public void setDataShowMode(Integer dataShowMode){
        this.set(FIELD_DATASHOWMODE, dataShowMode);
    }
    
    /**
     * 获取 数据显示方式  
     * @return
     */
    @JsonIgnore
    public Integer getDataShowMode(){
        Object objValue = this.get(FIELD_DATASHOWMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 数据显示方式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDataShowModeDirty(){
        if(this.contains(FIELD_DATASHOWMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据显示方式
     */
    @JsonIgnore
    public void resetDataShowMode(){
        this.reset(FIELD_DATASHOWMODE);
    }

    /**
     * 设置 数据显示方式，详细说明：{@link #FIELD_DATASHOWMODE}
     * <P>
     * 等同 {@link #setDataShowMode}
     * @param dataShowMode
     */
    @JsonIgnore
    public PSDEChartAxes datashowmode(Integer dataShowMode){
        this.setDataShowMode(dataShowMode);
        return this;
    }

     /**
     * 设置 数据显示方式，详细说明：{@link #FIELD_DATASHOWMODE}
     * <P>
     * 等同 {@link #setDataShowMode}
     * @param dataShowMode
     */
    @JsonIgnore
    public PSDEChartAxes datashowmode(net.ibizsys.psmodel.core.util.PSModelEnums.ChartAxisDataShowMode dataShowMode){
        if(dataShowMode == null){
            this.setDataShowMode(null);
        }
        else{
            this.setDataShowMode(dataShowMode.value);
        }
        return this;
    }

    /**
     * <B>DYNACLASS</B>&nbsp;动态样式表
     */
    public final static String FIELD_DYNACLASS = "dynaclass";

    /**
     * 设置 动态样式表
     * 
     * @param dynaClass
     * 
     */
    @JsonProperty(FIELD_DYNACLASS)
    public void setDynaClass(String dynaClass){
        this.set(FIELD_DYNACLASS, dynaClass);
    }
    
    /**
     * 获取 动态样式表  
     * @return
     */
    @JsonIgnore
    public String getDynaClass(){
        Object objValue = this.get(FIELD_DYNACLASS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 动态样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDynaClassDirty(){
        if(this.contains(FIELD_DYNACLASS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 动态样式表
     */
    @JsonIgnore
    public void resetDynaClass(){
        this.reset(FIELD_DYNACLASS);
    }

    /**
     * 设置 动态样式表
     * <P>
     * 等同 {@link #setDynaClass}
     * @param dynaClass
     */
    @JsonIgnore
    public PSDEChartAxes dynaclass(String dynaClass){
        this.setDynaClass(dynaClass);
        return this;
    }

    /**
     * <B>FIELDS</B>&nbsp;相关数据字段，指定图表坐标系的相关数据字段，多项使用【;】分隔
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_FIELDS = "fields";

    /**
     * 设置 相关数据字段，详细说明：{@link #FIELD_FIELDS}
     * 
     * @param fields
     * 
     */
    @JsonProperty(FIELD_FIELDS)
    public void setFields(String fields){
        this.set(FIELD_FIELDS, fields);
    }
    
    /**
     * 获取 相关数据字段  
     * @return
     */
    @JsonIgnore
    public String getFields(){
        Object objValue = this.get(FIELD_FIELDS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 相关数据字段 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFieldsDirty(){
        if(this.contains(FIELD_FIELDS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 相关数据字段
     */
    @JsonIgnore
    public void resetFields(){
        this.reset(FIELD_FIELDS);
    }

    /**
     * 设置 相关数据字段，详细说明：{@link #FIELD_FIELDS}
     * <P>
     * 等同 {@link #setFields}
     * @param fields
     */
    @JsonIgnore
    public PSDEChartAxes fields(String fields){
        this.setFields(fields);
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
    public PSDEChartAxes memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;次序，指定图表坐标轴的显示次序
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 次序，详细说明：{@link #FIELD_ORDERVALUE}
     * 
     * @param orderValue
     * 
     */
    @JsonProperty(FIELD_ORDERVALUE)
    public void setOrderValue(Integer orderValue){
        this.set(FIELD_ORDERVALUE, orderValue);
    }
    
    /**
     * 获取 次序  
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
     * 判断 次序 是否指定值，包括空值
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
     * 重置 次序
     */
    @JsonIgnore
    public void resetOrderValue(){
        this.reset(FIELD_ORDERVALUE);
    }

    /**
     * 设置 次序，详细说明：{@link #FIELD_ORDERVALUE}
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSDEChartAxes ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSDECHARTAXESID</B>&nbsp;实体图像维度标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDECHARTAXESID = "psdechartaxesid";

    /**
     * 设置 实体图像维度标识
     * 
     * @param pSDEChartAxesId
     * 
     */
    @JsonProperty(FIELD_PSDECHARTAXESID)
    public void setPSDEChartAxesId(String pSDEChartAxesId){
        this.set(FIELD_PSDECHARTAXESID, pSDEChartAxesId);
    }
    
    /**
     * 获取 实体图像维度标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEChartAxesId(){
        Object objValue = this.get(FIELD_PSDECHARTAXESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体图像维度标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEChartAxesIdDirty(){
        if(this.contains(FIELD_PSDECHARTAXESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体图像维度标识
     */
    @JsonIgnore
    public void resetPSDEChartAxesId(){
        this.reset(FIELD_PSDECHARTAXESID);
    }

    /**
     * 设置 实体图像维度标识
     * <P>
     * 等同 {@link #setPSDEChartAxesId}
     * @param pSDEChartAxesId
     */
    @JsonIgnore
    public PSDEChartAxes psdechartaxesid(String pSDEChartAxesId){
        this.setPSDEChartAxesId(pSDEChartAxesId);
        return this;
    }

    /**
     * <B>PSDECHARTAXESNAME</B>&nbsp;坐标轴名称，指定坐标轴的名称，需在所在图表具备唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDECHARTAXESNAME = "psdechartaxesname";

    /**
     * 设置 坐标轴名称，详细说明：{@link #FIELD_PSDECHARTAXESNAME}
     * 
     * @param pSDEChartAxesName
     * 
     */
    @JsonProperty(FIELD_PSDECHARTAXESNAME)
    public void setPSDEChartAxesName(String pSDEChartAxesName){
        this.set(FIELD_PSDECHARTAXESNAME, pSDEChartAxesName);
    }
    
    /**
     * 获取 坐标轴名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEChartAxesName(){
        Object objValue = this.get(FIELD_PSDECHARTAXESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 坐标轴名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEChartAxesNameDirty(){
        if(this.contains(FIELD_PSDECHARTAXESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 坐标轴名称
     */
    @JsonIgnore
    public void resetPSDEChartAxesName(){
        this.reset(FIELD_PSDECHARTAXESNAME);
    }

    /**
     * 设置 坐标轴名称，详细说明：{@link #FIELD_PSDECHARTAXESNAME}
     * <P>
     * 等同 {@link #setPSDEChartAxesName}
     * @param pSDEChartAxesName
     */
    @JsonIgnore
    public PSDEChartAxes psdechartaxesname(String pSDEChartAxesName){
        this.setPSDEChartAxesName(pSDEChartAxesName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEChartAxesName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEChartAxesName(strName);
    }

    @JsonIgnore
    public PSDEChartAxes name(String strName){
        this.setPSDEChartAxesName(strName);
        return this;
    }

    /**
     * <B>PSDECHARTID</B>&nbsp;实体图表，指定图表坐标轴所在的图表对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEChart} 
     */
    public final static String FIELD_PSDECHARTID = "psdechartid";

    /**
     * 设置 实体图表，详细说明：{@link #FIELD_PSDECHARTID}
     * 
     * @param pSDEChartId
     * 
     */
    @JsonProperty(FIELD_PSDECHARTID)
    public void setPSDEChartId(String pSDEChartId){
        this.set(FIELD_PSDECHARTID, pSDEChartId);
    }
    
    /**
     * 获取 实体图表  
     * @return
     */
    @JsonIgnore
    public String getPSDEChartId(){
        Object objValue = this.get(FIELD_PSDECHARTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体图表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEChartIdDirty(){
        if(this.contains(FIELD_PSDECHARTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体图表
     */
    @JsonIgnore
    public void resetPSDEChartId(){
        this.reset(FIELD_PSDECHARTID);
    }

    /**
     * 设置 实体图表，详细说明：{@link #FIELD_PSDECHARTID}
     * <P>
     * 等同 {@link #setPSDEChartId}
     * @param pSDEChartId
     */
    @JsonIgnore
    public PSDEChartAxes psdechartid(String pSDEChartId){
        this.setPSDEChartId(pSDEChartId);
        return this;
    }

    /**
     * 设置 实体图表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEChartId}
     * @param pSDEChart 引用对象
     */
    @JsonIgnore
    public PSDEChartAxes psdechartid(PSDEChart pSDEChart){
        if(pSDEChart == null){
            this.setPSDEChartId(null);
            this.setPSDEChartName(null);
            this.setPSDEId(null);
        }
        else{
            this.setPSDEChartId(pSDEChart.getPSDEChartId());
            this.setPSDEChartName(pSDEChart.getPSDEChartName());
            this.setPSDEId(pSDEChart.getPSDEId());
        }
        return this;
    }

    /**
     * <B>PSDECHARTNAME</B>&nbsp;实体图表，指定图表坐标轴所在的图表对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDECHARTID}
     */
    public final static String FIELD_PSDECHARTNAME = "psdechartname";

    /**
     * 设置 实体图表，详细说明：{@link #FIELD_PSDECHARTNAME}
     * 
     * @param pSDEChartName
     * 
     */
    @JsonProperty(FIELD_PSDECHARTNAME)
    public void setPSDEChartName(String pSDEChartName){
        this.set(FIELD_PSDECHARTNAME, pSDEChartName);
    }
    
    /**
     * 获取 实体图表  
     * @return
     */
    @JsonIgnore
    public String getPSDEChartName(){
        Object objValue = this.get(FIELD_PSDECHARTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体图表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEChartNameDirty(){
        if(this.contains(FIELD_PSDECHARTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体图表
     */
    @JsonIgnore
    public void resetPSDEChartName(){
        this.reset(FIELD_PSDECHARTNAME);
    }

    /**
     * 设置 实体图表，详细说明：{@link #FIELD_PSDECHARTNAME}
     * <P>
     * 等同 {@link #setPSDEChartName}
     * @param pSDEChartName
     */
    @JsonIgnore
    public PSDEChartAxes psdechartname(String pSDEChartName){
        this.setPSDEChartName(pSDEChartName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;PSDEID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDECHARTID}
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
    public PSDEChartAxes psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
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
    public PSDEChartAxes pssysdynamodelid(String pSSysDynaModelId){
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
    public PSDEChartAxes pssysdynamodelid(PSSysDynaModel pSSysDynaModel){
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
    public PSDEChartAxes pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端扩展插件，指定实体图表坐标轴使用的前端模板扩展插件，使用插件类型【图表坐标轴绘制插件】
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysPFPlugin} 
     */
    public final static String FIELD_PSSYSPFPLUGINID = "pssyspfpluginid";

    /**
     * 设置 前端扩展插件，详细说明：{@link #FIELD_PSSYSPFPLUGINID}
     * 
     * @param pSSysPFPluginId
     * 
     */
    @JsonProperty(FIELD_PSSYSPFPLUGINID)
    public void setPSSysPFPluginId(String pSSysPFPluginId){
        this.set(FIELD_PSSYSPFPLUGINID, pSSysPFPluginId);
    }
    
    /**
     * 获取 前端扩展插件  
     * @return
     */
    @JsonIgnore
    public String getPSSysPFPluginId(){
        Object objValue = this.get(FIELD_PSSYSPFPLUGINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端扩展插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysPFPluginIdDirty(){
        if(this.contains(FIELD_PSSYSPFPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端扩展插件
     */
    @JsonIgnore
    public void resetPSSysPFPluginId(){
        this.reset(FIELD_PSSYSPFPLUGINID);
    }

    /**
     * 设置 前端扩展插件，详细说明：{@link #FIELD_PSSYSPFPLUGINID}
     * <P>
     * 等同 {@link #setPSSysPFPluginId}
     * @param pSSysPFPluginId
     */
    @JsonIgnore
    public PSDEChartAxes pssyspfpluginid(String pSSysPFPluginId){
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    /**
     * 设置 前端扩展插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysPFPluginId}
     * @param pSSysPFPlugin 引用对象
     */
    @JsonIgnore
    public PSDEChartAxes pssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
        if(pSSysPFPlugin == null){
            this.setPSSysPFPluginId(null);
            this.setPSSysPFPluginName(null);
        }
        else{
            this.setPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端扩展插件，指定实体图表坐标轴使用的前端模板扩展插件，使用插件类型【图表坐标轴绘制插件】
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSPFPLUGINID}
     */
    public final static String FIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";

    /**
     * 设置 前端扩展插件，详细说明：{@link #FIELD_PSSYSPFPLUGINNAME}
     * 
     * @param pSSysPFPluginName
     * 
     */
    @JsonProperty(FIELD_PSSYSPFPLUGINNAME)
    public void setPSSysPFPluginName(String pSSysPFPluginName){
        this.set(FIELD_PSSYSPFPLUGINNAME, pSSysPFPluginName);
    }
    
    /**
     * 获取 前端扩展插件  
     * @return
     */
    @JsonIgnore
    public String getPSSysPFPluginName(){
        Object objValue = this.get(FIELD_PSSYSPFPLUGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端扩展插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysPFPluginNameDirty(){
        if(this.contains(FIELD_PSSYSPFPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端扩展插件
     */
    @JsonIgnore
    public void resetPSSysPFPluginName(){
        this.reset(FIELD_PSSYSPFPLUGINNAME);
    }

    /**
     * 设置 前端扩展插件，详细说明：{@link #FIELD_PSSYSPFPLUGINNAME}
     * <P>
     * 等同 {@link #setPSSysPFPluginName}
     * @param pSSysPFPluginName
     */
    @JsonIgnore
    public PSDEChartAxes pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
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
    public PSDEChartAxes updatedate(String updateDate){
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
    public PSDEChartAxes updateman(String updateMan){
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
    public PSDEChartAxes usercat(String userCat){
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
    public PSDEChartAxes usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat.value);
        }
        return this;
    }

    /**
     * <B>USERPARAMS</B>&nbsp;自定义参数
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_USERPARAMS = "userparams";

    /**
     * 设置 自定义参数
     * 
     * @param userParams
     * 
     */
    @JsonProperty(FIELD_USERPARAMS)
    public void setUserParams(String userParams){
        this.set(FIELD_USERPARAMS, userParams);
    }
    
    /**
     * 获取 自定义参数  
     * @return
     */
    @JsonIgnore
    public String getUserParams(){
        Object objValue = this.get(FIELD_USERPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserParamsDirty(){
        if(this.contains(FIELD_USERPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义参数
     */
    @JsonIgnore
    public void resetUserParams(){
        this.reset(FIELD_USERPARAMS);
    }

    /**
     * 设置 自定义参数
     * <P>
     * 等同 {@link #setUserParams}
     * @param userParams
     */
    @JsonIgnore
    public PSDEChartAxes userparams(String userParams){
        this.setUserParams(userParams);
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
    public PSDEChartAxes usertag(String userTag){
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
    public PSDEChartAxes usertag2(String userTag2){
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
    public PSDEChartAxes usertag3(String userTag3){
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
    public PSDEChartAxes usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEChartAxesId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEChartAxesId(strValue);
    }

    @JsonIgnore
    public PSDEChartAxes id(String strValue){
        this.setPSDEChartAxesId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEChartAxes){
            PSDEChartAxes model = (PSDEChartAxes)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
