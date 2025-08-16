package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSDECHARTPARAM</B>实体图表数据序列 模型传输对象
 * <P>
 * 实体图表部件的数据序列模型，定义绘制的图形，投射的坐标系及其它的表现及处理逻辑
 */
public class PSDEChartParam extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEChartParam(){
    }      

    /**
     * <B>BARCATEGORYGAP</B>&nbsp;同序列柱间间隔，指定柱状/条形图序列同一系列的柱间距离
     * <P>
     * 字符串：最大长度 20
     */
    public final static String FIELD_BARCATEGORYGAP = "barcategorygap";

    /**
     * 设置 同序列柱间间隔，详细说明：{@link #FIELD_BARCATEGORYGAP}
     * 
     * @param barCategoryGap
     * 
     */
    @JsonProperty(FIELD_BARCATEGORYGAP)
    public void setBarCategoryGap(String barCategoryGap){
        this.set(FIELD_BARCATEGORYGAP, barCategoryGap);
    }
    
    /**
     * 获取 同序列柱间间隔  
     * @return
     */
    @JsonIgnore
    public String getBarCategoryGap(){
        Object objValue = this.get(FIELD_BARCATEGORYGAP);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 同序列柱间间隔 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBarCategoryGapDirty(){
        if(this.contains(FIELD_BARCATEGORYGAP)){
            return true;
        }
        return false;
    }

    /**
     * 重置 同序列柱间间隔
     */
    @JsonIgnore
    public void resetBarCategoryGap(){
        this.reset(FIELD_BARCATEGORYGAP);
    }

    /**
     * 设置 同序列柱间间隔，详细说明：{@link #FIELD_BARCATEGORYGAP}
     * <P>
     * 等同 {@link #setBarCategoryGap}
     * @param barCategoryGap
     */
    @JsonIgnore
    public PSDEChartParam barcategorygap(String barCategoryGap){
        this.setBarCategoryGap(barCategoryGap);
        return this;
    }

    /**
     * <B>BARGAP</B>&nbsp;柱间间隔，指定柱状/条形图序列不同系列的柱间距离
     * <P>
     * 字符串：最大长度 20
     */
    public final static String FIELD_BARGAP = "bargap";

    /**
     * 设置 柱间间隔，详细说明：{@link #FIELD_BARGAP}
     * 
     * @param barGap
     * 
     */
    @JsonProperty(FIELD_BARGAP)
    public void setBarGap(String barGap){
        this.set(FIELD_BARGAP, barGap);
    }
    
    /**
     * 获取 柱间间隔  
     * @return
     */
    @JsonIgnore
    public String getBarGap(){
        Object objValue = this.get(FIELD_BARGAP);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 柱间间隔 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBarGapDirty(){
        if(this.contains(FIELD_BARGAP)){
            return true;
        }
        return false;
    }

    /**
     * 重置 柱间间隔
     */
    @JsonIgnore
    public void resetBarGap(){
        this.reset(FIELD_BARGAP);
    }

    /**
     * 设置 柱间间隔，详细说明：{@link #FIELD_BARGAP}
     * <P>
     * 等同 {@link #setBarGap}
     * @param barGap
     */
    @JsonIgnore
    public PSDEChartParam bargap(String barGap){
        this.setBarGap(barGap);
        return this;
    }

    /**
     * <B>BARMAXWIDTH</B>&nbsp;柱条最大宽度，指定柱状/条形图序列柱条的最大宽度
     * <P>
     * 字符串：最大长度 20
     */
    public final static String FIELD_BARMAXWIDTH = "barmaxwidth";

    /**
     * 设置 柱条最大宽度，详细说明：{@link #FIELD_BARMAXWIDTH}
     * 
     * @param barMaxWidth
     * 
     */
    @JsonProperty(FIELD_BARMAXWIDTH)
    public void setBarMaxWidth(String barMaxWidth){
        this.set(FIELD_BARMAXWIDTH, barMaxWidth);
    }
    
    /**
     * 获取 柱条最大宽度  
     * @return
     */
    @JsonIgnore
    public String getBarMaxWidth(){
        Object objValue = this.get(FIELD_BARMAXWIDTH);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 柱条最大宽度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBarMaxWidthDirty(){
        if(this.contains(FIELD_BARMAXWIDTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 柱条最大宽度
     */
    @JsonIgnore
    public void resetBarMaxWidth(){
        this.reset(FIELD_BARMAXWIDTH);
    }

    /**
     * 设置 柱条最大宽度，详细说明：{@link #FIELD_BARMAXWIDTH}
     * <P>
     * 等同 {@link #setBarMaxWidth}
     * @param barMaxWidth
     */
    @JsonIgnore
    public PSDEChartParam barmaxwidth(String barMaxWidth){
        this.setBarMaxWidth(barMaxWidth);
        return this;
    }

    /**
     * <B>BARMINHEIGHT</B>&nbsp;柱条最小高度，指定柱状/条形图序列柱条的最小高度
     * <P>
     * 字符串：最大长度 20
     */
    public final static String FIELD_BARMINHEIGHT = "barminheight";

    /**
     * 设置 柱条最小高度，详细说明：{@link #FIELD_BARMINHEIGHT}
     * 
     * @param barMinHeight
     * 
     */
    @JsonProperty(FIELD_BARMINHEIGHT)
    public void setBarMinHeight(String barMinHeight){
        this.set(FIELD_BARMINHEIGHT, barMinHeight);
    }
    
    /**
     * 获取 柱条最小高度  
     * @return
     */
    @JsonIgnore
    public String getBarMinHeight(){
        Object objValue = this.get(FIELD_BARMINHEIGHT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 柱条最小高度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBarMinHeightDirty(){
        if(this.contains(FIELD_BARMINHEIGHT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 柱条最小高度
     */
    @JsonIgnore
    public void resetBarMinHeight(){
        this.reset(FIELD_BARMINHEIGHT);
    }

    /**
     * 设置 柱条最小高度，详细说明：{@link #FIELD_BARMINHEIGHT}
     * <P>
     * 等同 {@link #setBarMinHeight}
     * @param barMinHeight
     */
    @JsonIgnore
    public PSDEChartParam barminheight(String barMinHeight){
        this.setBarMinHeight(barMinHeight);
        return this;
    }

    /**
     * <B>BARMINWIDTH</B>&nbsp;柱条最小宽度，指定柱状/条形图序列柱条的最小宽度
     * <P>
     * 字符串：最大长度 20
     */
    public final static String FIELD_BARMINWIDTH = "barminwidth";

    /**
     * 设置 柱条最小宽度，详细说明：{@link #FIELD_BARMINWIDTH}
     * 
     * @param barMinWidth
     * 
     */
    @JsonProperty(FIELD_BARMINWIDTH)
    public void setBarMinWidth(String barMinWidth){
        this.set(FIELD_BARMINWIDTH, barMinWidth);
    }
    
    /**
     * 获取 柱条最小宽度  
     * @return
     */
    @JsonIgnore
    public String getBarMinWidth(){
        Object objValue = this.get(FIELD_BARMINWIDTH);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 柱条最小宽度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBarMinWidthDirty(){
        if(this.contains(FIELD_BARMINWIDTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 柱条最小宽度
     */
    @JsonIgnore
    public void resetBarMinWidth(){
        this.reset(FIELD_BARMINWIDTH);
    }

    /**
     * 设置 柱条最小宽度，详细说明：{@link #FIELD_BARMINWIDTH}
     * <P>
     * 等同 {@link #setBarMinWidth}
     * @param barMinWidth
     */
    @JsonIgnore
    public PSDEChartParam barminwidth(String barMinWidth){
        this.setBarMinWidth(barMinWidth);
        return this;
    }

    /**
     * <B>BARWIDTH</B>&nbsp;柱条宽度，指定柱状/条形图序列柱条的宽度
     * <P>
     * 字符串：最大长度 20
     */
    public final static String FIELD_BARWIDTH = "barwidth";

    /**
     * 设置 柱条宽度，详细说明：{@link #FIELD_BARWIDTH}
     * 
     * @param barWidth
     * 
     */
    @JsonProperty(FIELD_BARWIDTH)
    public void setBarWidth(String barWidth){
        this.set(FIELD_BARWIDTH, barWidth);
    }
    
    /**
     * 获取 柱条宽度  
     * @return
     */
    @JsonIgnore
    public String getBarWidth(){
        Object objValue = this.get(FIELD_BARWIDTH);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 柱条宽度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBarWidthDirty(){
        if(this.contains(FIELD_BARWIDTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 柱条宽度
     */
    @JsonIgnore
    public void resetBarWidth(){
        this.reset(FIELD_BARWIDTH);
    }

    /**
     * 设置 柱条宽度，详细说明：{@link #FIELD_BARWIDTH}
     * <P>
     * 等同 {@link #setBarWidth}
     * @param barWidth
     */
    @JsonIgnore
    public PSDEChartParam barwidth(String barWidth){
        this.setBarWidth(barWidth);
        return this;
    }

    /**
     * <B>BOTTOMPOS</B>&nbsp;下方间隔，指定图形的下方间隔
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_BOTTOMPOS = "bottompos";

    /**
     * 设置 下方间隔，详细说明：{@link #FIELD_BOTTOMPOS}
     * 
     * @param bottomPos
     * 
     */
    @JsonProperty(FIELD_BOTTOMPOS)
    public void setBottomPos(String bottomPos){
        this.set(FIELD_BOTTOMPOS, bottomPos);
    }
    
    /**
     * 获取 下方间隔  
     * @return
     */
    @JsonIgnore
    public String getBottomPos(){
        Object objValue = this.get(FIELD_BOTTOMPOS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 下方间隔 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBottomPosDirty(){
        if(this.contains(FIELD_BOTTOMPOS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 下方间隔
     */
    @JsonIgnore
    public void resetBottomPos(){
        this.reset(FIELD_BOTTOMPOS);
    }

    /**
     * 设置 下方间隔，详细说明：{@link #FIELD_BOTTOMPOS}
     * <P>
     * 等同 {@link #setBottomPos}
     * @param bottomPos
     */
    @JsonIgnore
    public PSDEChartParam bottompos(String bottomPos){
        this.setBottomPos(bottomPos);
        return this;
    }

    /**
     * <B>BOXWIDTHS</B>&nbsp;盒子宽度范围
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_BOXWIDTHS = "boxwidths";

    /**
     * 设置 盒子宽度范围
     * 
     * @param boxWidths
     * 
     */
    @JsonProperty(FIELD_BOXWIDTHS)
    public void setBoxWidths(String boxWidths){
        this.set(FIELD_BOXWIDTHS, boxWidths);
    }
    
    /**
     * 获取 盒子宽度范围  
     * @return
     */
    @JsonIgnore
    public String getBoxWidths(){
        Object objValue = this.get(FIELD_BOXWIDTHS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 盒子宽度范围 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBoxWidthsDirty(){
        if(this.contains(FIELD_BOXWIDTHS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 盒子宽度范围
     */
    @JsonIgnore
    public void resetBoxWidths(){
        this.reset(FIELD_BOXWIDTHS);
    }

    /**
     * 设置 盒子宽度范围
     * <P>
     * 等同 {@link #setBoxWidths}
     * @param boxWidths
     */
    @JsonIgnore
    public PSDEChartParam boxwidths(String boxWidths){
        this.setBoxWidths(boxWidths);
        return this;
    }

    /**
     * <B>CAPPSLANRESID</B>&nbsp;标题语言资源，指定图形序列标题的多语言资源对象
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
    public PSDEChartParam cappslanresid(String capPSLanResId){
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
    public PSDEChartParam cappslanresid(PSLanguageRes pSLanguageRes){
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
     * <B>CAPPSLANRESNAME</B>&nbsp;标题语言资源，指定图形序列标题的多语言资源对象
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
    public PSDEChartParam cappslanresname(String capPSLanResName){
        this.setCapPSLanResName(capPSLanResName);
        return this;
    }

    /**
     * <B>CAPTION</B>&nbsp;标题，指定图形序列的标题
     * <P>
     * 字符串：最大长度 100
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
    public PSDEChartParam caption(String caption){
        this.setCaption(caption);
        return this;
    }

    /**
     * <B>CENTER</B>&nbsp;中心位置，指定饼图序列的中心（圆心）坐标
     * <P>
     * 字符串：最大长度 20
     */
    public final static String FIELD_CENTER = "center";

    /**
     * 设置 中心位置，详细说明：{@link #FIELD_CENTER}
     * 
     * @param center
     * 
     */
    @JsonProperty(FIELD_CENTER)
    public void setCenter(String center){
        this.set(FIELD_CENTER, center);
    }
    
    /**
     * 获取 中心位置  
     * @return
     */
    @JsonIgnore
    public String getCenter(){
        Object objValue = this.get(FIELD_CENTER);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 中心位置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCenterDirty(){
        if(this.contains(FIELD_CENTER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 中心位置
     */
    @JsonIgnore
    public void resetCenter(){
        this.reset(FIELD_CENTER);
    }

    /**
     * 设置 中心位置，详细说明：{@link #FIELD_CENTER}
     * <P>
     * 等同 {@link #setCenter}
     * @param center
     */
    @JsonIgnore
    public PSDEChartParam center(String center){
        this.setCenter(center);
        return this;
    }

    /**
     * <B>CHARTTYPE</B>&nbsp;序列类型，指定图形序列的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ChartType} 
     */
    public final static String FIELD_CHARTTYPE = "charttype";

    /**
     * 设置 序列类型，详细说明：{@link #FIELD_CHARTTYPE}
     * 
     * @param chartType
     * 
     */
    @JsonProperty(FIELD_CHARTTYPE)
    public void setChartType(String chartType){
        this.set(FIELD_CHARTTYPE, chartType);
    }
    
    /**
     * 获取 序列类型  
     * @return
     */
    @JsonIgnore
    public String getChartType(){
        Object objValue = this.get(FIELD_CHARTTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 序列类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isChartTypeDirty(){
        if(this.contains(FIELD_CHARTTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 序列类型
     */
    @JsonIgnore
    public void resetChartType(){
        this.reset(FIELD_CHARTTYPE);
    }

    /**
     * 设置 序列类型，详细说明：{@link #FIELD_CHARTTYPE}
     * <P>
     * 等同 {@link #setChartType}
     * @param chartType
     */
    @JsonIgnore
    public PSDEChartParam charttype(String chartType){
        this.setChartType(chartType);
        return this;
    }

     /**
     * 设置 序列类型，详细说明：{@link #FIELD_CHARTTYPE}
     * <P>
     * 等同 {@link #setChartType}
     * @param chartType
     */
    @JsonIgnore
    public PSDEChartParam charttype(net.ibizsys.psmodel.core.util.PSModelEnums.ChartType chartType){
        if(chartType == null){
            this.setChartType(null);
        }
        else{
            this.setChartType(chartType.value);
        }
        return this;
    }

    /**
     * <B>CLOCKWISE</B>&nbsp;顺时针，指定仪表盘序列的刻度是否是顺时针增长，未定义时为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_CLOCKWISE = "clockwise";

    /**
     * 设置 顺时针，详细说明：{@link #FIELD_CLOCKWISE}
     * 
     * @param clockWise
     * 
     */
    @JsonProperty(FIELD_CLOCKWISE)
    public void setClockWise(Integer clockWise){
        this.set(FIELD_CLOCKWISE, clockWise);
    }
    
    /**
     * 获取 顺时针  
     * @return
     */
    @JsonIgnore
    public Integer getClockWise(){
        Object objValue = this.get(FIELD_CLOCKWISE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 顺时针 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isClockWiseDirty(){
        if(this.contains(FIELD_CLOCKWISE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 顺时针
     */
    @JsonIgnore
    public void resetClockWise(){
        this.reset(FIELD_CLOCKWISE);
    }

    /**
     * 设置 顺时针，详细说明：{@link #FIELD_CLOCKWISE}
     * <P>
     * 等同 {@link #setClockWise}
     * @param clockWise
     */
    @JsonIgnore
    public PSDEChartParam clockwise(Integer clockWise){
        this.setClockWise(clockWise);
        return this;
    }

     /**
     * 设置 顺时针，详细说明：{@link #FIELD_CLOCKWISE}
     * <P>
     * 等同 {@link #setClockWise}
     * @param clockWise
     */
    @JsonIgnore
    public PSDEChartParam clockwise(Boolean clockWise){
        if(clockWise == null){
            this.setClockWise(null);
        }
        else{
            this.setClockWise(clockWise?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>COORDINATESYSTEM</B>&nbsp;坐标系，指定图形序列使用的坐标系统，不定义时自动选择
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ChartCoordinateSystem} 
     */
    public final static String FIELD_COORDINATESYSTEM = "coordinatesystem";

    /**
     * 设置 坐标系，详细说明：{@link #FIELD_COORDINATESYSTEM}
     * 
     * @param coordinateSystem
     * 
     */
    @JsonProperty(FIELD_COORDINATESYSTEM)
    public void setCoordinateSystem(String coordinateSystem){
        this.set(FIELD_COORDINATESYSTEM, coordinateSystem);
    }
    
    /**
     * 获取 坐标系  
     * @return
     */
    @JsonIgnore
    public String getCoordinateSystem(){
        Object objValue = this.get(FIELD_COORDINATESYSTEM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 坐标系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCoordinateSystemDirty(){
        if(this.contains(FIELD_COORDINATESYSTEM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 坐标系
     */
    @JsonIgnore
    public void resetCoordinateSystem(){
        this.reset(FIELD_COORDINATESYSTEM);
    }

    /**
     * 设置 坐标系，详细说明：{@link #FIELD_COORDINATESYSTEM}
     * <P>
     * 等同 {@link #setCoordinateSystem}
     * @param coordinateSystem
     */
    @JsonIgnore
    public PSDEChartParam coordinatesystem(String coordinateSystem){
        this.setCoordinateSystem(coordinateSystem);
        return this;
    }

     /**
     * 设置 坐标系，详细说明：{@link #FIELD_COORDINATESYSTEM}
     * <P>
     * 等同 {@link #setCoordinateSystem}
     * @param coordinateSystem
     */
    @JsonIgnore
    public PSDEChartParam coordinatesystem(net.ibizsys.psmodel.core.util.PSModelEnums.ChartCoordinateSystem coordinateSystem){
        if(coordinateSystem == null){
            this.setCoordinateSystem(null);
        }
        else{
            this.setCoordinateSystem(coordinateSystem.value);
        }
        return this;
    }

    /**
     * <B>COORDINATESYSTEMID</B>&nbsp;坐标系索引，指定图形序列投射的坐标系统索引，-1为自动判断，未定义时为【-1】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ChartCSIndex} 
     */
    public final static String FIELD_COORDINATESYSTEMID = "coordinatesystemid";

    /**
     * 设置 坐标系索引，详细说明：{@link #FIELD_COORDINATESYSTEMID}
     * 
     * @param coordinateSystemId
     * 
     */
    @JsonProperty(FIELD_COORDINATESYSTEMID)
    public void setCoordinateSystemId(Integer coordinateSystemId){
        this.set(FIELD_COORDINATESYSTEMID, coordinateSystemId);
    }
    
    /**
     * 获取 坐标系索引  
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
     * 判断 坐标系索引 是否指定值，包括空值
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
     * 重置 坐标系索引
     */
    @JsonIgnore
    public void resetCoordinateSystemId(){
        this.reset(FIELD_COORDINATESYSTEMID);
    }

    /**
     * 设置 坐标系索引，详细说明：{@link #FIELD_COORDINATESYSTEMID}
     * <P>
     * 等同 {@link #setCoordinateSystemId}
     * @param coordinateSystemId
     */
    @JsonIgnore
    public PSDEChartParam coordinatesystemid(Integer coordinateSystemId){
        this.setCoordinateSystemId(coordinateSystemId);
        return this;
    }

     /**
     * 设置 坐标系索引，详细说明：{@link #FIELD_COORDINATESYSTEMID}
     * <P>
     * 等同 {@link #setCoordinateSystemId}
     * @param coordinateSystemId
     */
    @JsonIgnore
    public PSDEChartParam coordinatesystemid(net.ibizsys.psmodel.core.util.PSModelEnums.ChartCSIndex coordinateSystemId){
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
    public PSDEChartParam createdate(String createDate){
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
    public PSDEChartParam createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CSPSSYSDYNAMODELID</B>&nbsp;坐标系动态模型，指定图形序列相关的坐标系得动态模型对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDynaModel} 
     */
    public final static String FIELD_CSPSSYSDYNAMODELID = "cspssysdynamodelid";

    /**
     * 设置 坐标系动态模型，详细说明：{@link #FIELD_CSPSSYSDYNAMODELID}
     * 
     * @param cSPSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_CSPSSYSDYNAMODELID)
    public void setCSPSSysDynaModelId(String cSPSSysDynaModelId){
        this.set(FIELD_CSPSSYSDYNAMODELID, cSPSSysDynaModelId);
    }
    
    /**
     * 获取 坐标系动态模型  
     * @return
     */
    @JsonIgnore
    public String getCSPSSysDynaModelId(){
        Object objValue = this.get(FIELD_CSPSSYSDYNAMODELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 坐标系动态模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCSPSSysDynaModelIdDirty(){
        if(this.contains(FIELD_CSPSSYSDYNAMODELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 坐标系动态模型
     */
    @JsonIgnore
    public void resetCSPSSysDynaModelId(){
        this.reset(FIELD_CSPSSYSDYNAMODELID);
    }

    /**
     * 设置 坐标系动态模型，详细说明：{@link #FIELD_CSPSSYSDYNAMODELID}
     * <P>
     * 等同 {@link #setCSPSSysDynaModelId}
     * @param cSPSSysDynaModelId
     */
    @JsonIgnore
    public PSDEChartParam cspssysdynamodelid(String cSPSSysDynaModelId){
        this.setCSPSSysDynaModelId(cSPSSysDynaModelId);
        return this;
    }

    /**
     * 设置 坐标系动态模型，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setCSPSSysDynaModelId}
     * @param pSSysDynaModel 引用对象
     */
    @JsonIgnore
    public PSDEChartParam cspssysdynamodelid(PSSysDynaModel pSSysDynaModel){
        if(pSSysDynaModel == null){
            this.setCSPSSysDynaModelId(null);
            this.setCSPSSysDynaModelName(null);
        }
        else{
            this.setCSPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setCSPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    /**
     * <B>CSPSSYSDYNAMODELNAME</B>&nbsp;坐标系动态模型，指定图形序列相关的坐标系得动态模型对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CSPSSYSDYNAMODELID}
     */
    public final static String FIELD_CSPSSYSDYNAMODELNAME = "cspssysdynamodelname";

    /**
     * 设置 坐标系动态模型，详细说明：{@link #FIELD_CSPSSYSDYNAMODELNAME}
     * 
     * @param cSPSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_CSPSSYSDYNAMODELNAME)
    public void setCSPSSysDynaModelName(String cSPSSysDynaModelName){
        this.set(FIELD_CSPSSYSDYNAMODELNAME, cSPSSysDynaModelName);
    }
    
    /**
     * 获取 坐标系动态模型  
     * @return
     */
    @JsonIgnore
    public String getCSPSSysDynaModelName(){
        Object objValue = this.get(FIELD_CSPSSYSDYNAMODELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 坐标系动态模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCSPSSysDynaModelNameDirty(){
        if(this.contains(FIELD_CSPSSYSDYNAMODELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 坐标系动态模型
     */
    @JsonIgnore
    public void resetCSPSSysDynaModelName(){
        this.reset(FIELD_CSPSSYSDYNAMODELNAME);
    }

    /**
     * 设置 坐标系动态模型，详细说明：{@link #FIELD_CSPSSYSDYNAMODELNAME}
     * <P>
     * 等同 {@link #setCSPSSysDynaModelName}
     * @param cSPSSysDynaModelName
     */
    @JsonIgnore
    public PSDEChartParam cspssysdynamodelname(String cSPSSysDynaModelName){
        this.setCSPSSysDynaModelName(cSPSSysDynaModelName);
        return this;
    }

    /**
     * <B>CSPSSYSPFPLUGINID</B>&nbsp;坐标系前端插件，指定坐标系前端插件使用的前端模板扩展插件，使用插件类型【图表坐标系组件绘制插件】
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysPFPlugin} 
     */
    public final static String FIELD_CSPSSYSPFPLUGINID = "cspssyspfpluginid";

    /**
     * 设置 坐标系前端插件，详细说明：{@link #FIELD_CSPSSYSPFPLUGINID}
     * 
     * @param cSPSSysPFPluginId
     * 
     */
    @JsonProperty(FIELD_CSPSSYSPFPLUGINID)
    public void setCSPSSysPFPluginId(String cSPSSysPFPluginId){
        this.set(FIELD_CSPSSYSPFPLUGINID, cSPSSysPFPluginId);
    }
    
    /**
     * 获取 坐标系前端插件  
     * @return
     */
    @JsonIgnore
    public String getCSPSSysPFPluginId(){
        Object objValue = this.get(FIELD_CSPSSYSPFPLUGINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 坐标系前端插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCSPSSysPFPluginIdDirty(){
        if(this.contains(FIELD_CSPSSYSPFPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 坐标系前端插件
     */
    @JsonIgnore
    public void resetCSPSSysPFPluginId(){
        this.reset(FIELD_CSPSSYSPFPLUGINID);
    }

    /**
     * 设置 坐标系前端插件，详细说明：{@link #FIELD_CSPSSYSPFPLUGINID}
     * <P>
     * 等同 {@link #setCSPSSysPFPluginId}
     * @param cSPSSysPFPluginId
     */
    @JsonIgnore
    public PSDEChartParam cspssyspfpluginid(String cSPSSysPFPluginId){
        this.setCSPSSysPFPluginId(cSPSSysPFPluginId);
        return this;
    }

    /**
     * 设置 坐标系前端插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setCSPSSysPFPluginId}
     * @param pSSysPFPlugin 引用对象
     */
    @JsonIgnore
    public PSDEChartParam cspssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
        if(pSSysPFPlugin == null){
            this.setCSPSSysPFPluginId(null);
            this.setCSPSSysPFPluginName(null);
        }
        else{
            this.setCSPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setCSPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    /**
     * <B>CSPSSYSPFPLUGINNAME</B>&nbsp;坐标系前端插件，指定坐标系前端插件使用的前端模板扩展插件，使用插件类型【图表坐标系组件绘制插件】
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CSPSSYSPFPLUGINID}
     */
    public final static String FIELD_CSPSSYSPFPLUGINNAME = "cspssyspfpluginname";

    /**
     * 设置 坐标系前端插件，详细说明：{@link #FIELD_CSPSSYSPFPLUGINNAME}
     * 
     * @param cSPSSysPFPluginName
     * 
     */
    @JsonProperty(FIELD_CSPSSYSPFPLUGINNAME)
    public void setCSPSSysPFPluginName(String cSPSSysPFPluginName){
        this.set(FIELD_CSPSSYSPFPLUGINNAME, cSPSSysPFPluginName);
    }
    
    /**
     * 获取 坐标系前端插件  
     * @return
     */
    @JsonIgnore
    public String getCSPSSysPFPluginName(){
        Object objValue = this.get(FIELD_CSPSSYSPFPLUGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 坐标系前端插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCSPSSysPFPluginNameDirty(){
        if(this.contains(FIELD_CSPSSYSPFPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 坐标系前端插件
     */
    @JsonIgnore
    public void resetCSPSSysPFPluginName(){
        this.reset(FIELD_CSPSSYSPFPLUGINNAME);
    }

    /**
     * 设置 坐标系前端插件，详细说明：{@link #FIELD_CSPSSYSPFPLUGINNAME}
     * <P>
     * 等同 {@link #setCSPSSysPFPluginName}
     * @param cSPSSysPFPluginName
     */
    @JsonIgnore
    public PSDEChartParam cspssyspfpluginname(String cSPSSysPFPluginName){
        this.setCSPSSysPFPluginName(cSPSSysPFPluginName);
        return this;
    }

    /**
     * <B>DATAFIELD</B>&nbsp;数据属性，指定图表序列的数据值存储属性
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_DATAFIELD = "datafield";

    /**
     * 设置 数据属性，详细说明：{@link #FIELD_DATAFIELD}
     * 
     * @param dataField
     * 
     */
    @JsonProperty(FIELD_DATAFIELD)
    public void setDataField(String dataField){
        this.set(FIELD_DATAFIELD, dataField);
    }
    
    /**
     * 获取 数据属性  
     * @return
     */
    @JsonIgnore
    public String getDataField(){
        Object objValue = this.get(FIELD_DATAFIELD);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDataFieldDirty(){
        if(this.contains(FIELD_DATAFIELD)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据属性
     */
    @JsonIgnore
    public void resetDataField(){
        this.reset(FIELD_DATAFIELD);
    }

    /**
     * 设置 数据属性，详细说明：{@link #FIELD_DATAFIELD}
     * <P>
     * 等同 {@link #setDataField}
     * @param dataField
     */
    @JsonIgnore
    public PSDEChartParam datafield(String dataField){
        this.setDataField(dataField);
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
    public PSDEChartParam dynaclass(String dynaClass){
        this.setDynaClass(dynaClass);
        return this;
    }

    /**
     * <B>ENDANGLE</B>&nbsp;结束角度，指定圆形图形的结束角度，支持仪表盘序列
     */
    public final static String FIELD_ENDANGLE = "endangle";

    /**
     * 设置 结束角度，详细说明：{@link #FIELD_ENDANGLE}
     * 
     * @param endAngle
     * 
     */
    @JsonProperty(FIELD_ENDANGLE)
    public void setEndAngle(Integer endAngle){
        this.set(FIELD_ENDANGLE, endAngle);
    }
    
    /**
     * 获取 结束角度  
     * @return
     */
    @JsonIgnore
    public Integer getEndAngle(){
        Object objValue = this.get(FIELD_ENDANGLE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 结束角度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEndAngleDirty(){
        if(this.contains(FIELD_ENDANGLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 结束角度
     */
    @JsonIgnore
    public void resetEndAngle(){
        this.reset(FIELD_ENDANGLE);
    }

    /**
     * 设置 结束角度，详细说明：{@link #FIELD_ENDANGLE}
     * <P>
     * 等同 {@link #setEndAngle}
     * @param endAngle
     */
    @JsonIgnore
    public PSDEChartParam endangle(Integer endAngle){
        this.setEndAngle(endAngle);
        return this;
    }

    /**
     * <B>EXTFIELD</B>&nbsp;扩展值属性，指定图形序列的扩展值属性
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_EXTFIELD = "extfield";

    /**
     * 设置 扩展值属性，详细说明：{@link #FIELD_EXTFIELD}
     * 
     * @param extField
     * 
     */
    @JsonProperty(FIELD_EXTFIELD)
    public void setExtField(String extField){
        this.set(FIELD_EXTFIELD, extField);
    }
    
    /**
     * 获取 扩展值属性  
     * @return
     */
    @JsonIgnore
    public String getExtField(){
        Object objValue = this.get(FIELD_EXTFIELD);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 扩展值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExtFieldDirty(){
        if(this.contains(FIELD_EXTFIELD)){
            return true;
        }
        return false;
    }

    /**
     * 重置 扩展值属性
     */
    @JsonIgnore
    public void resetExtField(){
        this.reset(FIELD_EXTFIELD);
    }

    /**
     * 设置 扩展值属性，详细说明：{@link #FIELD_EXTFIELD}
     * <P>
     * 等同 {@link #setExtField}
     * @param extField
     */
    @JsonIgnore
    public PSDEChartParam extfield(String extField){
        this.setExtField(extField);
        return this;
    }

    /**
     * <B>EXTFIELD2</B>&nbsp;扩展值2属性，指定图形序列的扩展值2属性
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_EXTFIELD2 = "extfield2";

    /**
     * 设置 扩展值2属性，详细说明：{@link #FIELD_EXTFIELD2}
     * 
     * @param extField2
     * 
     */
    @JsonProperty(FIELD_EXTFIELD2)
    public void setExtField2(String extField2){
        this.set(FIELD_EXTFIELD2, extField2);
    }
    
    /**
     * 获取 扩展值2属性  
     * @return
     */
    @JsonIgnore
    public String getExtField2(){
        Object objValue = this.get(FIELD_EXTFIELD2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 扩展值2属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExtField2Dirty(){
        if(this.contains(FIELD_EXTFIELD2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 扩展值2属性
     */
    @JsonIgnore
    public void resetExtField2(){
        this.reset(FIELD_EXTFIELD2);
    }

    /**
     * 设置 扩展值2属性，详细说明：{@link #FIELD_EXTFIELD2}
     * <P>
     * 等同 {@link #setExtField2}
     * @param extField2
     */
    @JsonIgnore
    public PSDEChartParam extfield2(String extField2){
        this.setExtField2(extField2);
        return this;
    }

    /**
     * <B>EXTFIELD3</B>&nbsp;扩展值3属性，指定图形序列的扩展值3属性
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_EXTFIELD3 = "extfield3";

    /**
     * 设置 扩展值3属性，详细说明：{@link #FIELD_EXTFIELD3}
     * 
     * @param extField3
     * 
     */
    @JsonProperty(FIELD_EXTFIELD3)
    public void setExtField3(String extField3){
        this.set(FIELD_EXTFIELD3, extField3);
    }
    
    /**
     * 获取 扩展值3属性  
     * @return
     */
    @JsonIgnore
    public String getExtField3(){
        Object objValue = this.get(FIELD_EXTFIELD3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 扩展值3属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExtField3Dirty(){
        if(this.contains(FIELD_EXTFIELD3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 扩展值3属性
     */
    @JsonIgnore
    public void resetExtField3(){
        this.reset(FIELD_EXTFIELD3);
    }

    /**
     * 设置 扩展值3属性，详细说明：{@link #FIELD_EXTFIELD3}
     * <P>
     * 等同 {@link #setExtField3}
     * @param extField3
     */
    @JsonIgnore
    public PSDEChartParam extfield3(String extField3){
        this.setExtField3(extField3);
        return this;
    }

    /**
     * <B>EXTFIELD4</B>&nbsp;扩展值4属性，指定图形序列的扩展值4属性
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_EXTFIELD4 = "extfield4";

    /**
     * 设置 扩展值4属性，详细说明：{@link #FIELD_EXTFIELD4}
     * 
     * @param extField4
     * 
     */
    @JsonProperty(FIELD_EXTFIELD4)
    public void setExtField4(String extField4){
        this.set(FIELD_EXTFIELD4, extField4);
    }
    
    /**
     * 获取 扩展值4属性  
     * @return
     */
    @JsonIgnore
    public String getExtField4(){
        Object objValue = this.get(FIELD_EXTFIELD4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 扩展值4属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExtField4Dirty(){
        if(this.contains(FIELD_EXTFIELD4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 扩展值4属性
     */
    @JsonIgnore
    public void resetExtField4(){
        this.reset(FIELD_EXTFIELD4);
    }

    /**
     * 设置 扩展值4属性，详细说明：{@link #FIELD_EXTFIELD4}
     * <P>
     * 等同 {@link #setExtField4}
     * @param extField4
     */
    @JsonIgnore
    public PSDEChartParam extfield4(String extField4){
        this.setExtField4(extField4);
        return this;
    }

    /**
     * <B>FUNNELALIGN</B>&nbsp;漏斗对齐方式，指定漏斗图形序列的漏斗对齐方式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ChartFunnelAlign} 
     */
    public final static String FIELD_FUNNELALIGN = "funnelalign";

    /**
     * 设置 漏斗对齐方式，详细说明：{@link #FIELD_FUNNELALIGN}
     * 
     * @param funnelAlign
     * 
     */
    @JsonProperty(FIELD_FUNNELALIGN)
    public void setFunnelAlign(String funnelAlign){
        this.set(FIELD_FUNNELALIGN, funnelAlign);
    }
    
    /**
     * 获取 漏斗对齐方式  
     * @return
     */
    @JsonIgnore
    public String getFunnelAlign(){
        Object objValue = this.get(FIELD_FUNNELALIGN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 漏斗对齐方式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFunnelAlignDirty(){
        if(this.contains(FIELD_FUNNELALIGN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 漏斗对齐方式
     */
    @JsonIgnore
    public void resetFunnelAlign(){
        this.reset(FIELD_FUNNELALIGN);
    }

    /**
     * 设置 漏斗对齐方式，详细说明：{@link #FIELD_FUNNELALIGN}
     * <P>
     * 等同 {@link #setFunnelAlign}
     * @param funnelAlign
     */
    @JsonIgnore
    public PSDEChartParam funnelalign(String funnelAlign){
        this.setFunnelAlign(funnelAlign);
        return this;
    }

     /**
     * 设置 漏斗对齐方式，详细说明：{@link #FIELD_FUNNELALIGN}
     * <P>
     * 等同 {@link #setFunnelAlign}
     * @param funnelAlign
     */
    @JsonIgnore
    public PSDEChartParam funnelalign(net.ibizsys.psmodel.core.util.PSModelEnums.ChartFunnelAlign funnelAlign){
        if(funnelAlign == null){
            this.setFunnelAlign(null);
        }
        else{
            this.setFunnelAlign(funnelAlign.value);
        }
        return this;
    }

    /**
     * <B>HEIGHT</B>&nbsp;高度，指定图形的高度
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_HEIGHT = "height";

    /**
     * 设置 高度，详细说明：{@link #FIELD_HEIGHT}
     * 
     * @param height
     * 
     */
    @JsonProperty(FIELD_HEIGHT)
    public void setHeight(String height){
        this.set(FIELD_HEIGHT, height);
    }
    
    /**
     * 获取 高度  
     * @return
     */
    @JsonIgnore
    public String getHeight(){
        Object objValue = this.get(FIELD_HEIGHT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 高度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHeightDirty(){
        if(this.contains(FIELD_HEIGHT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 高度
     */
    @JsonIgnore
    public void resetHeight(){
        this.reset(FIELD_HEIGHT);
    }

    /**
     * 设置 高度，详细说明：{@link #FIELD_HEIGHT}
     * <P>
     * 等同 {@link #setHeight}
     * @param height
     */
    @JsonIgnore
    public PSDEChartParam height(String height){
        this.setHeight(height);
        return this;
    }

    /**
     * <B>LEFTPOS</B>&nbsp;左侧间隔，指定图形的左侧间隔
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_LEFTPOS = "leftpos";

    /**
     * 设置 左侧间隔，详细说明：{@link #FIELD_LEFTPOS}
     * 
     * @param leftPos
     * 
     */
    @JsonProperty(FIELD_LEFTPOS)
    public void setLeftPos(String leftPos){
        this.set(FIELD_LEFTPOS, leftPos);
    }
    
    /**
     * 获取 左侧间隔  
     * @return
     */
    @JsonIgnore
    public String getLeftPos(){
        Object objValue = this.get(FIELD_LEFTPOS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 左侧间隔 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLeftPosDirty(){
        if(this.contains(FIELD_LEFTPOS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 左侧间隔
     */
    @JsonIgnore
    public void resetLeftPos(){
        this.reset(FIELD_LEFTPOS);
    }

    /**
     * 设置 左侧间隔，详细说明：{@link #FIELD_LEFTPOS}
     * <P>
     * 等同 {@link #setLeftPos}
     * @param leftPos
     */
    @JsonIgnore
    public PSDEChartParam leftpos(String leftPos){
        this.setLeftPos(leftPos);
        return this;
    }

    /**
     * <B>MAPTYPE</B>&nbsp;地图类型
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_MAPTYPE = "maptype";

    /**
     * 设置 地图类型
     * 
     * @param mapType
     * 
     */
    @JsonProperty(FIELD_MAPTYPE)
    public void setMapType(String mapType){
        this.set(FIELD_MAPTYPE, mapType);
    }
    
    /**
     * 获取 地图类型  
     * @return
     */
    @JsonIgnore
    public String getMapType(){
        Object objValue = this.get(FIELD_MAPTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 地图类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMapTypeDirty(){
        if(this.contains(FIELD_MAPTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 地图类型
     */
    @JsonIgnore
    public void resetMapType(){
        this.reset(FIELD_MAPTYPE);
    }

    /**
     * 设置 地图类型
     * <P>
     * 等同 {@link #setMapType}
     * @param mapType
     */
    @JsonIgnore
    public PSDEChartParam maptype(String mapType){
        this.setMapType(mapType);
        return this;
    }

    /**
     * <B>MAXSIZE</B>&nbsp;最大面积，指定图形序列的最大面积
     * <P>
     * 字符串：最大长度 20
     */
    public final static String FIELD_MAXSIZE = "maxsize";

    /**
     * 设置 最大面积，详细说明：{@link #FIELD_MAXSIZE}
     * 
     * @param maxSize
     * 
     */
    @JsonProperty(FIELD_MAXSIZE)
    public void setMaxSize(String maxSize){
        this.set(FIELD_MAXSIZE, maxSize);
    }
    
    /**
     * 获取 最大面积  
     * @return
     */
    @JsonIgnore
    public String getMaxSize(){
        Object objValue = this.get(FIELD_MAXSIZE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 最大面积 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMaxSizeDirty(){
        if(this.contains(FIELD_MAXSIZE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 最大面积
     */
    @JsonIgnore
    public void resetMaxSize(){
        this.reset(FIELD_MAXSIZE);
    }

    /**
     * 设置 最大面积，详细说明：{@link #FIELD_MAXSIZE}
     * <P>
     * 等同 {@link #setMaxSize}
     * @param maxSize
     */
    @JsonIgnore
    public PSDEChartParam maxsize(String maxSize){
        this.setMaxSize(maxSize);
        return this;
    }

    /**
     * <B>MAXVALUE</B>&nbsp;最大值，指定图形序列的显示最大值
     */
    public final static String FIELD_MAXVALUE = "maxvalue";

    /**
     * 设置 最大值，详细说明：{@link #FIELD_MAXVALUE}
     * 
     * @param maxValue
     * 
     */
    @JsonProperty(FIELD_MAXVALUE)
    public void setMaxValue(Integer maxValue){
        this.set(FIELD_MAXVALUE, maxValue);
    }
    
    /**
     * 获取 最大值  
     * @return
     */
    @JsonIgnore
    public Integer getMaxValue(){
        Object objValue = this.get(FIELD_MAXVALUE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 最大值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMaxValueDirty(){
        if(this.contains(FIELD_MAXVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 最大值
     */
    @JsonIgnore
    public void resetMaxValue(){
        this.reset(FIELD_MAXVALUE);
    }

    /**
     * 设置 最大值，详细说明：{@link #FIELD_MAXVALUE}
     * <P>
     * 等同 {@link #setMaxValue}
     * @param maxValue
     */
    @JsonIgnore
    public PSDEChartParam maxvalue(Integer maxValue){
        this.setMaxValue(maxValue);
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
    public PSDEChartParam memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MINANGLE</B>&nbsp;最小扇区角度，指定饼图序列的最小扇区角度[0, 360]
     */
    public final static String FIELD_MINANGLE = "minangle";

    /**
     * 设置 最小扇区角度，详细说明：{@link #FIELD_MINANGLE}
     * 
     * @param minAngle
     * 
     */
    @JsonProperty(FIELD_MINANGLE)
    public void setMinAngle(Integer minAngle){
        this.set(FIELD_MINANGLE, minAngle);
    }
    
    /**
     * 获取 最小扇区角度  
     * @return
     */
    @JsonIgnore
    public Integer getMinAngle(){
        Object objValue = this.get(FIELD_MINANGLE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 最小扇区角度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinAngleDirty(){
        if(this.contains(FIELD_MINANGLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 最小扇区角度
     */
    @JsonIgnore
    public void resetMinAngle(){
        this.reset(FIELD_MINANGLE);
    }

    /**
     * 设置 最小扇区角度，详细说明：{@link #FIELD_MINANGLE}
     * <P>
     * 等同 {@link #setMinAngle}
     * @param minAngle
     */
    @JsonIgnore
    public PSDEChartParam minangle(Integer minAngle){
        this.setMinAngle(minAngle);
        return this;
    }

    /**
     * <B>MINSHOWLABELANGLE</B>&nbsp;显示标题角度，指定饼图序列不显示标签的扇区角度
     */
    public final static String FIELD_MINSHOWLABELANGLE = "minshowlabelangle";

    /**
     * 设置 显示标题角度，详细说明：{@link #FIELD_MINSHOWLABELANGLE}
     * 
     * @param minShowLabelAngle
     * 
     */
    @JsonProperty(FIELD_MINSHOWLABELANGLE)
    public void setMinShowLabelAngle(Integer minShowLabelAngle){
        this.set(FIELD_MINSHOWLABELANGLE, minShowLabelAngle);
    }
    
    /**
     * 获取 显示标题角度  
     * @return
     */
    @JsonIgnore
    public Integer getMinShowLabelAngle(){
        Object objValue = this.get(FIELD_MINSHOWLABELANGLE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 显示标题角度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinShowLabelAngleDirty(){
        if(this.contains(FIELD_MINSHOWLABELANGLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 显示标题角度
     */
    @JsonIgnore
    public void resetMinShowLabelAngle(){
        this.reset(FIELD_MINSHOWLABELANGLE);
    }

    /**
     * 设置 显示标题角度，详细说明：{@link #FIELD_MINSHOWLABELANGLE}
     * <P>
     * 等同 {@link #setMinShowLabelAngle}
     * @param minShowLabelAngle
     */
    @JsonIgnore
    public PSDEChartParam minshowlabelangle(Integer minShowLabelAngle){
        this.setMinShowLabelAngle(minShowLabelAngle);
        return this;
    }

    /**
     * <B>MINSIZE</B>&nbsp;最小面积，指定图形序列的最小面积
     * <P>
     * 字符串：最大长度 20
     */
    public final static String FIELD_MINSIZE = "minsize";

    /**
     * 设置 最小面积，详细说明：{@link #FIELD_MINSIZE}
     * 
     * @param minSize
     * 
     */
    @JsonProperty(FIELD_MINSIZE)
    public void setMinSize(String minSize){
        this.set(FIELD_MINSIZE, minSize);
    }
    
    /**
     * 获取 最小面积  
     * @return
     */
    @JsonIgnore
    public String getMinSize(){
        Object objValue = this.get(FIELD_MINSIZE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 最小面积 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinSizeDirty(){
        if(this.contains(FIELD_MINSIZE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 最小面积
     */
    @JsonIgnore
    public void resetMinSize(){
        this.reset(FIELD_MINSIZE);
    }

    /**
     * 设置 最小面积，详细说明：{@link #FIELD_MINSIZE}
     * <P>
     * 等同 {@link #setMinSize}
     * @param minSize
     */
    @JsonIgnore
    public PSDEChartParam minsize(String minSize){
        this.setMinSize(minSize);
        return this;
    }

    /**
     * <B>MINVALUE</B>&nbsp;最小值，指定图形序列的显示最小值
     */
    public final static String FIELD_MINVALUE = "minvalue";

    /**
     * 设置 最小值，详细说明：{@link #FIELD_MINVALUE}
     * 
     * @param minValue
     * 
     */
    @JsonProperty(FIELD_MINVALUE)
    public void setMinValue(Integer minValue){
        this.set(FIELD_MINVALUE, minValue);
    }
    
    /**
     * 获取 最小值  
     * @return
     */
    @JsonIgnore
    public Integer getMinValue(){
        Object objValue = this.get(FIELD_MINVALUE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 最小值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinValueDirty(){
        if(this.contains(FIELD_MINVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 最小值
     */
    @JsonIgnore
    public void resetMinValue(){
        this.reset(FIELD_MINVALUE);
    }

    /**
     * 设置 最小值，详细说明：{@link #FIELD_MINVALUE}
     * <P>
     * 等同 {@link #setMinValue}
     * @param minValue
     */
    @JsonIgnore
    public PSDEChartParam minvalue(Integer minValue){
        this.setMinValue(minValue);
        return this;
    }

    /**
     * <B>NAVVIEWFILTER</B>&nbsp;导航视图过滤项，指定图表数据序列关联导航视图的过滤项名称，导航视图一般使用应用上下文自动进行数据过滤，指定过滤项将为导航视图显示传入过滤条件
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_NAVVIEWFILTER = "navviewfilter";

    /**
     * 设置 导航视图过滤项，详细说明：{@link #FIELD_NAVVIEWFILTER}
     * 
     * @param navViewFilter
     * 
     */
    @JsonProperty(FIELD_NAVVIEWFILTER)
    public void setNavViewFilter(String navViewFilter){
        this.set(FIELD_NAVVIEWFILTER, navViewFilter);
    }
    
    /**
     * 获取 导航视图过滤项  
     * @return
     */
    @JsonIgnore
    public String getNavViewFilter(){
        Object objValue = this.get(FIELD_NAVVIEWFILTER);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导航视图过滤项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavViewFilterDirty(){
        if(this.contains(FIELD_NAVVIEWFILTER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航视图过滤项
     */
    @JsonIgnore
    public void resetNavViewFilter(){
        this.reset(FIELD_NAVVIEWFILTER);
    }

    /**
     * 设置 导航视图过滤项，详细说明：{@link #FIELD_NAVVIEWFILTER}
     * <P>
     * 等同 {@link #setNavViewFilter}
     * @param navViewFilter
     */
    @JsonIgnore
    public PSDEChartParam navviewfilter(String navViewFilter){
        this.setNavViewFilter(navViewFilter);
        return this;
    }

    /**
     * <B>NAVVIEWPARAM</B>&nbsp;导航视图参数，指定图表数据序列关联导航视图的额外参数
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_NAVVIEWPARAM = "navviewparam";

    /**
     * 设置 导航视图参数，详细说明：{@link #FIELD_NAVVIEWPARAM}
     * 
     * @param navViewParam
     * 
     */
    @JsonProperty(FIELD_NAVVIEWPARAM)
    public void setNavViewParam(String navViewParam){
        this.set(FIELD_NAVVIEWPARAM, navViewParam);
    }
    
    /**
     * 获取 导航视图参数  
     * @return
     */
    @JsonIgnore
    public String getNavViewParam(){
        Object objValue = this.get(FIELD_NAVVIEWPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导航视图参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavViewParamDirty(){
        if(this.contains(FIELD_NAVVIEWPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航视图参数
     */
    @JsonIgnore
    public void resetNavViewParam(){
        this.reset(FIELD_NAVVIEWPARAM);
    }

    /**
     * 设置 导航视图参数，详细说明：{@link #FIELD_NAVVIEWPARAM}
     * <P>
     * 等同 {@link #setNavViewParam}
     * @param navViewParam
     */
    @JsonIgnore
    public PSDEChartParam navviewparam(String navViewParam){
        this.setNavViewParam(navViewParam);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;次序，指定图形序列的显示次序
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
    public PSDEChartParam ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSDECHARTID</B>&nbsp;实体图表，指定图形序列所在的图表对象
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
    public PSDEChartParam psdechartid(String pSDEChartId){
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
    public PSDEChartParam psdechartid(PSDEChart pSDEChart){
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
     * <B>PSDECHARTNAME</B>&nbsp;实体图表，指定图形序列所在的图表对象
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
    public PSDEChartParam psdechartname(String pSDEChartName){
        this.setPSDEChartName(pSDEChartName);
        return this;
    }

    /**
     * <B>PSDECHARTPARAMID</B>&nbsp;实体图表参数标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDECHARTPARAMID = "psdechartparamid";

    /**
     * 设置 实体图表参数标识
     * 
     * @param pSDEChartParamId
     * 
     */
    @JsonProperty(FIELD_PSDECHARTPARAMID)
    public void setPSDEChartParamId(String pSDEChartParamId){
        this.set(FIELD_PSDECHARTPARAMID, pSDEChartParamId);
    }
    
    /**
     * 获取 实体图表参数标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEChartParamId(){
        Object objValue = this.get(FIELD_PSDECHARTPARAMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体图表参数标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEChartParamIdDirty(){
        if(this.contains(FIELD_PSDECHARTPARAMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体图表参数标识
     */
    @JsonIgnore
    public void resetPSDEChartParamId(){
        this.reset(FIELD_PSDECHARTPARAMID);
    }

    /**
     * 设置 实体图表参数标识
     * <P>
     * 等同 {@link #setPSDEChartParamId}
     * @param pSDEChartParamId
     */
    @JsonIgnore
    public PSDEChartParam psdechartparamid(String pSDEChartParamId){
        this.setPSDEChartParamId(pSDEChartParamId);
        return this;
    }

    /**
     * <B>PSDECHARTPARAMNAME</B>&nbsp;序列标识，指定图形序列的标识，需在所在的图表部件中具备唯一性
     * <P>
     * 字符串：最大长度 200，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSDECHARTPARAMNAME = "psdechartparamname";

    /**
     * 设置 序列标识，详细说明：{@link #FIELD_PSDECHARTPARAMNAME}
     * 
     * @param pSDEChartParamName
     * 
     */
    @JsonProperty(FIELD_PSDECHARTPARAMNAME)
    public void setPSDEChartParamName(String pSDEChartParamName){
        this.set(FIELD_PSDECHARTPARAMNAME, pSDEChartParamName);
    }
    
    /**
     * 获取 序列标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEChartParamName(){
        Object objValue = this.get(FIELD_PSDECHARTPARAMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 序列标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEChartParamNameDirty(){
        if(this.contains(FIELD_PSDECHARTPARAMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 序列标识
     */
    @JsonIgnore
    public void resetPSDEChartParamName(){
        this.reset(FIELD_PSDECHARTPARAMNAME);
    }

    /**
     * 设置 序列标识，详细说明：{@link #FIELD_PSDECHARTPARAMNAME}
     * <P>
     * 等同 {@link #setPSDEChartParamName}
     * @param pSDEChartParamName
     */
    @JsonIgnore
    public PSDEChartParam psdechartparamname(String pSDEChartParamName){
        this.setPSDEChartParamName(pSDEChartParamName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEChartParamName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEChartParamName(strName);
    }

    @JsonIgnore
    public PSDEChartParam name(String strName){
        this.setPSDEChartParamName(strName);
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
    public PSDEChartParam psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * <B>PSDERID</B>&nbsp;导航视图关系，指定图形序列默认的导航关系，此配置在图形导航视图启用
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDER} 
     */
    public final static String FIELD_PSDERID = "psderid";

    /**
     * 设置 导航视图关系，详细说明：{@link #FIELD_PSDERID}
     * 
     * @param pSDERId
     * 
     */
    @JsonProperty(FIELD_PSDERID)
    public void setPSDERId(String pSDERId){
        this.set(FIELD_PSDERID, pSDERId);
    }
    
    /**
     * 获取 导航视图关系  
     * @return
     */
    @JsonIgnore
    public String getPSDERId(){
        Object objValue = this.get(FIELD_PSDERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导航视图关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDERIdDirty(){
        if(this.contains(FIELD_PSDERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航视图关系
     */
    @JsonIgnore
    public void resetPSDERId(){
        this.reset(FIELD_PSDERID);
    }

    /**
     * 设置 导航视图关系，详细说明：{@link #FIELD_PSDERID}
     * <P>
     * 等同 {@link #setPSDERId}
     * @param pSDERId
     */
    @JsonIgnore
    public PSDEChartParam psderid(String pSDERId){
        this.setPSDERId(pSDERId);
        return this;
    }

    /**
     * 设置 导航视图关系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDERId}
     * @param pSDER 引用对象
     */
    @JsonIgnore
    public PSDEChartParam psderid(PSDER pSDER){
        if(pSDER == null){
            this.setPSDERId(null);
            this.setPSDERName(null);
        }
        else{
            this.setPSDERId(pSDER.getPSDERId());
            this.setPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    /**
     * <B>PSDERNAME</B>&nbsp;导航视图关系，指定图形序列默认的导航关系，此配置在图形导航视图启用
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDERID}
     */
    public final static String FIELD_PSDERNAME = "psdername";

    /**
     * 设置 导航视图关系，详细说明：{@link #FIELD_PSDERNAME}
     * 
     * @param pSDERName
     * 
     */
    @JsonProperty(FIELD_PSDERNAME)
    public void setPSDERName(String pSDERName){
        this.set(FIELD_PSDERNAME, pSDERName);
    }
    
    /**
     * 获取 导航视图关系  
     * @return
     */
    @JsonIgnore
    public String getPSDERName(){
        Object objValue = this.get(FIELD_PSDERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导航视图关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDERNameDirty(){
        if(this.contains(FIELD_PSDERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航视图关系
     */
    @JsonIgnore
    public void resetPSDERName(){
        this.reset(FIELD_PSDERNAME);
    }

    /**
     * 设置 导航视图关系，详细说明：{@link #FIELD_PSDERNAME}
     * <P>
     * 等同 {@link #setPSDERName}
     * @param pSDERName
     */
    @JsonIgnore
    public PSDEChartParam psdername(String pSDERName){
        this.setPSDERName(pSDERName);
        return this;
    }

    /**
     * <B>PSDEVIEWBASEID</B>&nbsp;导航视图，指定图形序列默认的导航关系视图，此配置在图形导航视图启用
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_PSDEVIEWBASEID = "psdeviewbaseid";

    /**
     * 设置 导航视图，详细说明：{@link #FIELD_PSDEVIEWBASEID}
     * 
     * @param pSDEViewBaseId
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWBASEID)
    public void setPSDEViewBaseId(String pSDEViewBaseId){
        this.set(FIELD_PSDEVIEWBASEID, pSDEViewBaseId);
    }
    
    /**
     * 获取 导航视图  
     * @return
     */
    @JsonIgnore
    public String getPSDEViewBaseId(){
        Object objValue = this.get(FIELD_PSDEVIEWBASEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导航视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEViewBaseIdDirty(){
        if(this.contains(FIELD_PSDEVIEWBASEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航视图
     */
    @JsonIgnore
    public void resetPSDEViewBaseId(){
        this.reset(FIELD_PSDEVIEWBASEID);
    }

    /**
     * 设置 导航视图，详细说明：{@link #FIELD_PSDEVIEWBASEID}
     * <P>
     * 等同 {@link #setPSDEViewBaseId}
     * @param pSDEViewBaseId
     */
    @JsonIgnore
    public PSDEChartParam psdeviewbaseid(String pSDEViewBaseId){
        this.setPSDEViewBaseId(pSDEViewBaseId);
        return this;
    }

    /**
     * 设置 导航视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEViewBaseId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSDEChartParam psdeviewbaseid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setPSDEViewBaseId(null);
            this.setPSDEViewBaseName(null);
        }
        else{
            this.setPSDEViewBaseId(pSDEViewBase.getPSDEViewBaseId());
            this.setPSDEViewBaseName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>PSDEVIEWBASENAME</B>&nbsp;导航视图，指定图形序列默认的导航关系视图，此配置在图形导航视图启用
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVIEWBASEID}
     */
    public final static String FIELD_PSDEVIEWBASENAME = "psdeviewbasename";

    /**
     * 设置 导航视图，详细说明：{@link #FIELD_PSDEVIEWBASENAME}
     * 
     * @param pSDEViewBaseName
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWBASENAME)
    public void setPSDEViewBaseName(String pSDEViewBaseName){
        this.set(FIELD_PSDEVIEWBASENAME, pSDEViewBaseName);
    }
    
    /**
     * 获取 导航视图  
     * @return
     */
    @JsonIgnore
    public String getPSDEViewBaseName(){
        Object objValue = this.get(FIELD_PSDEVIEWBASENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导航视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEViewBaseNameDirty(){
        if(this.contains(FIELD_PSDEVIEWBASENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航视图
     */
    @JsonIgnore
    public void resetPSDEViewBaseName(){
        this.reset(FIELD_PSDEVIEWBASENAME);
    }

    /**
     * 设置 导航视图，详细说明：{@link #FIELD_PSDEVIEWBASENAME}
     * <P>
     * 等同 {@link #setPSDEViewBaseName}
     * @param pSDEViewBaseName
     */
    @JsonIgnore
    public PSDEChartParam psdeviewbasename(String pSDEViewBaseName){
        this.setPSDEViewBaseName(pSDEViewBaseName);
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELID</B>&nbsp;动态系统模型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDynaModel} 
     */
    public final static String FIELD_PSSYSDYNAMODELID = "pssysdynamodelid";

    /**
     * 设置 动态系统模型
     * 
     * @param pSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELID)
    public void setPSSysDynaModelId(String pSSysDynaModelId){
        this.set(FIELD_PSSYSDYNAMODELID, pSSysDynaModelId);
    }
    
    /**
     * 获取 动态系统模型  
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
     * 判断 动态系统模型 是否指定值，包括空值
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
     * 重置 动态系统模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelId(){
        this.reset(FIELD_PSSYSDYNAMODELID);
    }

    /**
     * 设置 动态系统模型
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModelId
     */
    @JsonIgnore
    public PSDEChartParam pssysdynamodelid(String pSSysDynaModelId){
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    /**
     * 设置 动态系统模型，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModel 引用对象
     */
    @JsonIgnore
    public PSDEChartParam pssysdynamodelid(PSSysDynaModel pSSysDynaModel){
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
     * <B>PSSYSDYNAMODELNAME</B>&nbsp;动态系统模型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDYNAMODELID}
     */
    public final static String FIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";

    /**
     * 设置 动态系统模型
     * 
     * @param pSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELNAME)
    public void setPSSysDynaModelName(String pSSysDynaModelName){
        this.set(FIELD_PSSYSDYNAMODELNAME, pSSysDynaModelName);
    }
    
    /**
     * 获取 动态系统模型  
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
     * 判断 动态系统模型 是否指定值，包括空值
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
     * 重置 动态系统模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelName(){
        this.reset(FIELD_PSSYSDYNAMODELNAME);
    }

    /**
     * 设置 动态系统模型
     * <P>
     * 等同 {@link #setPSSysDynaModelName}
     * @param pSSysDynaModelName
     */
    @JsonIgnore
    public PSDEChartParam pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端扩展插件，指定实体图表数据序列使用的前端模板扩展插件，使用插件类型【图表序列绘制插件】
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
    public PSDEChartParam pssyspfpluginid(String pSSysPFPluginId){
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
    public PSDEChartParam pssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
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
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端扩展插件，指定实体图表数据序列使用的前端模板扩展插件，使用插件类型【图表序列绘制插件】
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
    public PSDEChartParam pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    /**
     * <B>RADIUS</B>&nbsp;半径，指定圆形图形的半径，支持饼图、仪表盘序列
     * <P>
     * 字符串：最大长度 20
     */
    public final static String FIELD_RADIUS = "radius";

    /**
     * 设置 半径，详细说明：{@link #FIELD_RADIUS}
     * 
     * @param radius
     * 
     */
    @JsonProperty(FIELD_RADIUS)
    public void setRadius(String radius){
        this.set(FIELD_RADIUS, radius);
    }
    
    /**
     * 获取 半径  
     * @return
     */
    @JsonIgnore
    public String getRadius(){
        Object objValue = this.get(FIELD_RADIUS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 半径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRadiusDirty(){
        if(this.contains(FIELD_RADIUS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 半径
     */
    @JsonIgnore
    public void resetRadius(){
        this.reset(FIELD_RADIUS);
    }

    /**
     * 设置 半径，详细说明：{@link #FIELD_RADIUS}
     * <P>
     * 等同 {@link #setRadius}
     * @param radius
     */
    @JsonIgnore
    public PSDEChartParam radius(String radius){
        this.setRadius(radius);
        return this;
    }

    /**
     * <B>RIGHTPOS</B>&nbsp;右侧间隔，指定图形的右侧间隔
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_RIGHTPOS = "rightpos";

    /**
     * 设置 右侧间隔，详细说明：{@link #FIELD_RIGHTPOS}
     * 
     * @param rightPos
     * 
     */
    @JsonProperty(FIELD_RIGHTPOS)
    public void setRightPos(String rightPos){
        this.set(FIELD_RIGHTPOS, rightPos);
    }
    
    /**
     * 获取 右侧间隔  
     * @return
     */
    @JsonIgnore
    public String getRightPos(){
        Object objValue = this.get(FIELD_RIGHTPOS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 右侧间隔 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRightPosDirty(){
        if(this.contains(FIELD_RIGHTPOS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 右侧间隔
     */
    @JsonIgnore
    public void resetRightPos(){
        this.reset(FIELD_RIGHTPOS);
    }

    /**
     * 设置 右侧间隔，详细说明：{@link #FIELD_RIGHTPOS}
     * <P>
     * 等同 {@link #setRightPos}
     * @param rightPos
     */
    @JsonIgnore
    public PSDEChartParam rightpos(String rightPos){
        this.setRightPos(rightPos);
        return this;
    }

    /**
     * <B>ROSETYPE</B>&nbsp;展示南丁格尔图，指定饼图序列是否展示成南丁格尔图
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ChartPieRoseType} 
     */
    public final static String FIELD_ROSETYPE = "rosetype";

    /**
     * 设置 展示南丁格尔图，详细说明：{@link #FIELD_ROSETYPE}
     * 
     * @param roseType
     * 
     */
    @JsonProperty(FIELD_ROSETYPE)
    public void setRoseType(String roseType){
        this.set(FIELD_ROSETYPE, roseType);
    }
    
    /**
     * 获取 展示南丁格尔图  
     * @return
     */
    @JsonIgnore
    public String getRoseType(){
        Object objValue = this.get(FIELD_ROSETYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 展示南丁格尔图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRoseTypeDirty(){
        if(this.contains(FIELD_ROSETYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 展示南丁格尔图
     */
    @JsonIgnore
    public void resetRoseType(){
        this.reset(FIELD_ROSETYPE);
    }

    /**
     * 设置 展示南丁格尔图，详细说明：{@link #FIELD_ROSETYPE}
     * <P>
     * 等同 {@link #setRoseType}
     * @param roseType
     */
    @JsonIgnore
    public PSDEChartParam rosetype(String roseType){
        this.setRoseType(roseType);
        return this;
    }

     /**
     * 设置 展示南丁格尔图，详细说明：{@link #FIELD_ROSETYPE}
     * <P>
     * 等同 {@link #setRoseType}
     * @param roseType
     */
    @JsonIgnore
    public PSDEChartParam rosetype(net.ibizsys.psmodel.core.util.PSModelEnums.ChartPieRoseType roseType){
        if(roseType == null){
            this.setRoseType(null);
        }
        else{
            this.setRoseType(roseType.value);
        }
        return this;
    }

    /**
     * <B>SAMPLEDATA</B>&nbsp;示例数据，指定图形序列的示例数据，用于开发测试
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_SAMPLEDATA = "sampledata";

    /**
     * 设置 示例数据，详细说明：{@link #FIELD_SAMPLEDATA}
     * 
     * @param sampleData
     * 
     */
    @JsonProperty(FIELD_SAMPLEDATA)
    public void setSampleData(String sampleData){
        this.set(FIELD_SAMPLEDATA, sampleData);
    }
    
    /**
     * 获取 示例数据  
     * @return
     */
    @JsonIgnore
    public String getSampleData(){
        Object objValue = this.get(FIELD_SAMPLEDATA);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 示例数据 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSampleDataDirty(){
        if(this.contains(FIELD_SAMPLEDATA)){
            return true;
        }
        return false;
    }

    /**
     * 重置 示例数据
     */
    @JsonIgnore
    public void resetSampleData(){
        this.reset(FIELD_SAMPLEDATA);
    }

    /**
     * 设置 示例数据，详细说明：{@link #FIELD_SAMPLEDATA}
     * <P>
     * 等同 {@link #setSampleData}
     * @param sampleData
     */
    @JsonIgnore
    public PSDEChartParam sampledata(String sampleData){
        this.setSampleData(sampleData);
        return this;
    }

    /**
     * <B>SERIESFIELD</B>&nbsp;名称属性，指定图形序列名称的取值属性
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_SERIESFIELD = "seriesfield";

    /**
     * 设置 名称属性，详细说明：{@link #FIELD_SERIESFIELD}
     * 
     * @param seriesField
     * 
     */
    @JsonProperty(FIELD_SERIESFIELD)
    public void setSeriesField(String seriesField){
        this.set(FIELD_SERIESFIELD, seriesField);
    }
    
    /**
     * 获取 名称属性  
     * @return
     */
    @JsonIgnore
    public String getSeriesField(){
        Object objValue = this.get(FIELD_SERIESFIELD);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 名称属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSeriesFieldDirty(){
        if(this.contains(FIELD_SERIESFIELD)){
            return true;
        }
        return false;
    }

    /**
     * 重置 名称属性
     */
    @JsonIgnore
    public void resetSeriesField(){
        this.reset(FIELD_SERIESFIELD);
    }

    /**
     * 设置 名称属性，详细说明：{@link #FIELD_SERIESFIELD}
     * <P>
     * 等同 {@link #setSeriesField}
     * @param seriesField
     */
    @JsonIgnore
    public PSDEChartParam seriesfield(String seriesField){
        this.setSeriesField(seriesField);
        return this;
    }

    /**
     * <B>SERIESLAYOUTBY</B>&nbsp;结果集行列模式，指定图形序列从结果集的取值模式，未定义时为【列（Column）】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ChartSeriesLayoutBy} 
     */
    public final static String FIELD_SERIESLAYOUTBY = "serieslayoutby";

    /**
     * 设置 结果集行列模式，详细说明：{@link #FIELD_SERIESLAYOUTBY}
     * 
     * @param seriesLayoutBy
     * 
     */
    @JsonProperty(FIELD_SERIESLAYOUTBY)
    public void setSeriesLayoutBy(String seriesLayoutBy){
        this.set(FIELD_SERIESLAYOUTBY, seriesLayoutBy);
    }
    
    /**
     * 获取 结果集行列模式  
     * @return
     */
    @JsonIgnore
    public String getSeriesLayoutBy(){
        Object objValue = this.get(FIELD_SERIESLAYOUTBY);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 结果集行列模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSeriesLayoutByDirty(){
        if(this.contains(FIELD_SERIESLAYOUTBY)){
            return true;
        }
        return false;
    }

    /**
     * 重置 结果集行列模式
     */
    @JsonIgnore
    public void resetSeriesLayoutBy(){
        this.reset(FIELD_SERIESLAYOUTBY);
    }

    /**
     * 设置 结果集行列模式，详细说明：{@link #FIELD_SERIESLAYOUTBY}
     * <P>
     * 等同 {@link #setSeriesLayoutBy}
     * @param seriesLayoutBy
     */
    @JsonIgnore
    public PSDEChartParam serieslayoutby(String seriesLayoutBy){
        this.setSeriesLayoutBy(seriesLayoutBy);
        return this;
    }

     /**
     * 设置 结果集行列模式，详细说明：{@link #FIELD_SERIESLAYOUTBY}
     * <P>
     * 等同 {@link #setSeriesLayoutBy}
     * @param seriesLayoutBy
     */
    @JsonIgnore
    public PSDEChartParam serieslayoutby(net.ibizsys.psmodel.core.util.PSModelEnums.ChartSeriesLayoutBy seriesLayoutBy){
        if(seriesLayoutBy == null){
            this.setSeriesLayoutBy(null);
        }
        else{
            this.setSeriesLayoutBy(seriesLayoutBy.value);
        }
        return this;
    }

    /**
     * <B>SERIESPARAM</B>&nbsp;序列参数
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_SERIESPARAM = "seriesparam";

    /**
     * 设置 序列参数
     * 
     * @param seriesParam
     * 
     */
    @JsonProperty(FIELD_SERIESPARAM)
    public void setSeriesParam(String seriesParam){
        this.set(FIELD_SERIESPARAM, seriesParam);
    }
    
    /**
     * 获取 序列参数  
     * @return
     */
    @JsonIgnore
    public String getSeriesParam(){
        Object objValue = this.get(FIELD_SERIESPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 序列参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSeriesParamDirty(){
        if(this.contains(FIELD_SERIESPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 序列参数
     */
    @JsonIgnore
    public void resetSeriesParam(){
        this.reset(FIELD_SERIESPARAM);
    }

    /**
     * 设置 序列参数
     * <P>
     * 等同 {@link #setSeriesParam}
     * @param seriesParam
     */
    @JsonIgnore
    public PSDEChartParam seriesparam(String seriesParam){
        this.setSeriesParam(seriesParam);
        return this;
    }

    /**
     * <B>SERIESPARAM10</B>&nbsp;序列参数10
     */
    public final static String FIELD_SERIESPARAM10 = "seriesparam10";

    /**
     * 设置 序列参数10
     * 
     * @param seriesParam10
     * 
     */
    @JsonProperty(FIELD_SERIESPARAM10)
    public void setSeriesParam10(Double seriesParam10){
        this.set(FIELD_SERIESPARAM10, seriesParam10);
    }
    
    /**
     * 获取 序列参数10  
     * @return
     */
    @JsonIgnore
    public Double getSeriesParam10(){
        Object objValue = this.get(FIELD_SERIESPARAM10);
        if(objValue==null){
            return null;
        }
        return (Double)objValue;
    }

    /**
     * 判断 序列参数10 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSeriesParam10Dirty(){
        if(this.contains(FIELD_SERIESPARAM10)){
            return true;
        }
        return false;
    }

    /**
     * 重置 序列参数10
     */
    @JsonIgnore
    public void resetSeriesParam10(){
        this.reset(FIELD_SERIESPARAM10);
    }

    /**
     * 设置 序列参数10
     * <P>
     * 等同 {@link #setSeriesParam10}
     * @param seriesParam10
     */
    @JsonIgnore
    public PSDEChartParam seriesparam10(Double seriesParam10){
        this.setSeriesParam10(seriesParam10);
        return this;
    }

    /**
     * <B>SERIESPARAM11</B>&nbsp;序列参数11
     */
    public final static String FIELD_SERIESPARAM11 = "seriesparam11";

    /**
     * 设置 序列参数11
     * 
     * @param seriesParam11
     * 
     */
    @JsonProperty(FIELD_SERIESPARAM11)
    public void setSeriesParam11(Integer seriesParam11){
        this.set(FIELD_SERIESPARAM11, seriesParam11);
    }
    
    /**
     * 获取 序列参数11  
     * @return
     */
    @JsonIgnore
    public Integer getSeriesParam11(){
        Object objValue = this.get(FIELD_SERIESPARAM11);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 序列参数11 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSeriesParam11Dirty(){
        if(this.contains(FIELD_SERIESPARAM11)){
            return true;
        }
        return false;
    }

    /**
     * 重置 序列参数11
     */
    @JsonIgnore
    public void resetSeriesParam11(){
        this.reset(FIELD_SERIESPARAM11);
    }

    /**
     * 设置 序列参数11
     * <P>
     * 等同 {@link #setSeriesParam11}
     * @param seriesParam11
     */
    @JsonIgnore
    public PSDEChartParam seriesparam11(Integer seriesParam11){
        this.setSeriesParam11(seriesParam11);
        return this;
    }

    /**
     * <B>SERIESPARAM12</B>&nbsp;序列参数12
     */
    public final static String FIELD_SERIESPARAM12 = "seriesparam12";

    /**
     * 设置 序列参数12
     * 
     * @param seriesParam12
     * 
     */
    @JsonProperty(FIELD_SERIESPARAM12)
    public void setSeriesParam12(Integer seriesParam12){
        this.set(FIELD_SERIESPARAM12, seriesParam12);
    }
    
    /**
     * 获取 序列参数12  
     * @return
     */
    @JsonIgnore
    public Integer getSeriesParam12(){
        Object objValue = this.get(FIELD_SERIESPARAM12);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 序列参数12 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSeriesParam12Dirty(){
        if(this.contains(FIELD_SERIESPARAM12)){
            return true;
        }
        return false;
    }

    /**
     * 重置 序列参数12
     */
    @JsonIgnore
    public void resetSeriesParam12(){
        this.reset(FIELD_SERIESPARAM12);
    }

    /**
     * 设置 序列参数12
     * <P>
     * 等同 {@link #setSeriesParam12}
     * @param seriesParam12
     */
    @JsonIgnore
    public PSDEChartParam seriesparam12(Integer seriesParam12){
        this.setSeriesParam12(seriesParam12);
        return this;
    }

    /**
     * <B>SERIESPARAM2</B>&nbsp;序列参数2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_SERIESPARAM2 = "seriesparam2";

    /**
     * 设置 序列参数2
     * 
     * @param seriesParam2
     * 
     */
    @JsonProperty(FIELD_SERIESPARAM2)
    public void setSeriesParam2(String seriesParam2){
        this.set(FIELD_SERIESPARAM2, seriesParam2);
    }
    
    /**
     * 获取 序列参数2  
     * @return
     */
    @JsonIgnore
    public String getSeriesParam2(){
        Object objValue = this.get(FIELD_SERIESPARAM2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 序列参数2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSeriesParam2Dirty(){
        if(this.contains(FIELD_SERIESPARAM2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 序列参数2
     */
    @JsonIgnore
    public void resetSeriesParam2(){
        this.reset(FIELD_SERIESPARAM2);
    }

    /**
     * 设置 序列参数2
     * <P>
     * 等同 {@link #setSeriesParam2}
     * @param seriesParam2
     */
    @JsonIgnore
    public PSDEChartParam seriesparam2(String seriesParam2){
        this.setSeriesParam2(seriesParam2);
        return this;
    }

    /**
     * <B>SERIESPARAM3</B>&nbsp;序列参数3
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_SERIESPARAM3 = "seriesparam3";

    /**
     * 设置 序列参数3
     * 
     * @param seriesParam3
     * 
     */
    @JsonProperty(FIELD_SERIESPARAM3)
    public void setSeriesParam3(String seriesParam3){
        this.set(FIELD_SERIESPARAM3, seriesParam3);
    }
    
    /**
     * 获取 序列参数3  
     * @return
     */
    @JsonIgnore
    public String getSeriesParam3(){
        Object objValue = this.get(FIELD_SERIESPARAM3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 序列参数3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSeriesParam3Dirty(){
        if(this.contains(FIELD_SERIESPARAM3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 序列参数3
     */
    @JsonIgnore
    public void resetSeriesParam3(){
        this.reset(FIELD_SERIESPARAM3);
    }

    /**
     * 设置 序列参数3
     * <P>
     * 等同 {@link #setSeriesParam3}
     * @param seriesParam3
     */
    @JsonIgnore
    public PSDEChartParam seriesparam3(String seriesParam3){
        this.setSeriesParam3(seriesParam3);
        return this;
    }

    /**
     * <B>SERIESPARAM4</B>&nbsp;序列参数4
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_SERIESPARAM4 = "seriesparam4";

    /**
     * 设置 序列参数4
     * 
     * @param seriesParam4
     * 
     */
    @JsonProperty(FIELD_SERIESPARAM4)
    public void setSeriesParam4(String seriesParam4){
        this.set(FIELD_SERIESPARAM4, seriesParam4);
    }
    
    /**
     * 获取 序列参数4  
     * @return
     */
    @JsonIgnore
    public String getSeriesParam4(){
        Object objValue = this.get(FIELD_SERIESPARAM4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 序列参数4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSeriesParam4Dirty(){
        if(this.contains(FIELD_SERIESPARAM4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 序列参数4
     */
    @JsonIgnore
    public void resetSeriesParam4(){
        this.reset(FIELD_SERIESPARAM4);
    }

    /**
     * 设置 序列参数4
     * <P>
     * 等同 {@link #setSeriesParam4}
     * @param seriesParam4
     */
    @JsonIgnore
    public PSDEChartParam seriesparam4(String seriesParam4){
        this.setSeriesParam4(seriesParam4);
        return this;
    }

    /**
     * <B>SERIESPARAM5</B>&nbsp;序列参数5
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_SERIESPARAM5 = "seriesparam5";

    /**
     * 设置 序列参数5
     * 
     * @param seriesParam5
     * 
     */
    @JsonProperty(FIELD_SERIESPARAM5)
    public void setSeriesParam5(Integer seriesParam5){
        this.set(FIELD_SERIESPARAM5, seriesParam5);
    }
    
    /**
     * 获取 序列参数5  
     * @return
     */
    @JsonIgnore
    public Integer getSeriesParam5(){
        Object objValue = this.get(FIELD_SERIESPARAM5);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 序列参数5 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSeriesParam5Dirty(){
        if(this.contains(FIELD_SERIESPARAM5)){
            return true;
        }
        return false;
    }

    /**
     * 重置 序列参数5
     */
    @JsonIgnore
    public void resetSeriesParam5(){
        this.reset(FIELD_SERIESPARAM5);
    }

    /**
     * 设置 序列参数5
     * <P>
     * 等同 {@link #setSeriesParam5}
     * @param seriesParam5
     */
    @JsonIgnore
    public PSDEChartParam seriesparam5(Integer seriesParam5){
        this.setSeriesParam5(seriesParam5);
        return this;
    }

     /**
     * 设置 序列参数5
     * <P>
     * 等同 {@link #setSeriesParam5}
     * @param seriesParam5
     */
    @JsonIgnore
    public PSDEChartParam seriesparam5(Boolean seriesParam5){
        if(seriesParam5 == null){
            this.setSeriesParam5(null);
        }
        else{
            this.setSeriesParam5(seriesParam5?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>SERIESPARAM6</B>&nbsp;序列参数6
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_SERIESPARAM6 = "seriesparam6";

    /**
     * 设置 序列参数6
     * 
     * @param seriesParam6
     * 
     */
    @JsonProperty(FIELD_SERIESPARAM6)
    public void setSeriesParam6(Integer seriesParam6){
        this.set(FIELD_SERIESPARAM6, seriesParam6);
    }
    
    /**
     * 获取 序列参数6  
     * @return
     */
    @JsonIgnore
    public Integer getSeriesParam6(){
        Object objValue = this.get(FIELD_SERIESPARAM6);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 序列参数6 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSeriesParam6Dirty(){
        if(this.contains(FIELD_SERIESPARAM6)){
            return true;
        }
        return false;
    }

    /**
     * 重置 序列参数6
     */
    @JsonIgnore
    public void resetSeriesParam6(){
        this.reset(FIELD_SERIESPARAM6);
    }

    /**
     * 设置 序列参数6
     * <P>
     * 等同 {@link #setSeriesParam6}
     * @param seriesParam6
     */
    @JsonIgnore
    public PSDEChartParam seriesparam6(Integer seriesParam6){
        this.setSeriesParam6(seriesParam6);
        return this;
    }

     /**
     * 设置 序列参数6
     * <P>
     * 等同 {@link #setSeriesParam6}
     * @param seriesParam6
     */
    @JsonIgnore
    public PSDEChartParam seriesparam6(Boolean seriesParam6){
        if(seriesParam6 == null){
            this.setSeriesParam6(null);
        }
        else{
            this.setSeriesParam6(seriesParam6?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>SERIESPARAM7</B>&nbsp;序列参数7
     */
    public final static String FIELD_SERIESPARAM7 = "seriesparam7";

    /**
     * 设置 序列参数7
     * 
     * @param seriesParam7
     * 
     */
    @JsonProperty(FIELD_SERIESPARAM7)
    public void setSeriesParam7(Integer seriesParam7){
        this.set(FIELD_SERIESPARAM7, seriesParam7);
    }
    
    /**
     * 获取 序列参数7  
     * @return
     */
    @JsonIgnore
    public Integer getSeriesParam7(){
        Object objValue = this.get(FIELD_SERIESPARAM7);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 序列参数7 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSeriesParam7Dirty(){
        if(this.contains(FIELD_SERIESPARAM7)){
            return true;
        }
        return false;
    }

    /**
     * 重置 序列参数7
     */
    @JsonIgnore
    public void resetSeriesParam7(){
        this.reset(FIELD_SERIESPARAM7);
    }

    /**
     * 设置 序列参数7
     * <P>
     * 等同 {@link #setSeriesParam7}
     * @param seriesParam7
     */
    @JsonIgnore
    public PSDEChartParam seriesparam7(Integer seriesParam7){
        this.setSeriesParam7(seriesParam7);
        return this;
    }

    /**
     * <B>SERIESPARAM8</B>&nbsp;序列参数8
     */
    public final static String FIELD_SERIESPARAM8 = "seriesparam8";

    /**
     * 设置 序列参数8
     * 
     * @param seriesParam8
     * 
     */
    @JsonProperty(FIELD_SERIESPARAM8)
    public void setSeriesParam8(Integer seriesParam8){
        this.set(FIELD_SERIESPARAM8, seriesParam8);
    }
    
    /**
     * 获取 序列参数8  
     * @return
     */
    @JsonIgnore
    public Integer getSeriesParam8(){
        Object objValue = this.get(FIELD_SERIESPARAM8);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 序列参数8 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSeriesParam8Dirty(){
        if(this.contains(FIELD_SERIESPARAM8)){
            return true;
        }
        return false;
    }

    /**
     * 重置 序列参数8
     */
    @JsonIgnore
    public void resetSeriesParam8(){
        this.reset(FIELD_SERIESPARAM8);
    }

    /**
     * 设置 序列参数8
     * <P>
     * 等同 {@link #setSeriesParam8}
     * @param seriesParam8
     */
    @JsonIgnore
    public PSDEChartParam seriesparam8(Integer seriesParam8){
        this.setSeriesParam8(seriesParam8);
        return this;
    }

    /**
     * <B>SERIESPARAM9</B>&nbsp;序列参数9
     */
    public final static String FIELD_SERIESPARAM9 = "seriesparam9";

    /**
     * 设置 序列参数9
     * 
     * @param seriesParam9
     * 
     */
    @JsonProperty(FIELD_SERIESPARAM9)
    public void setSeriesParam9(Double seriesParam9){
        this.set(FIELD_SERIESPARAM9, seriesParam9);
    }
    
    /**
     * 获取 序列参数9  
     * @return
     */
    @JsonIgnore
    public Double getSeriesParam9(){
        Object objValue = this.get(FIELD_SERIESPARAM9);
        if(objValue==null){
            return null;
        }
        return (Double)objValue;
    }

    /**
     * 判断 序列参数9 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSeriesParam9Dirty(){
        if(this.contains(FIELD_SERIESPARAM9)){
            return true;
        }
        return false;
    }

    /**
     * 重置 序列参数9
     */
    @JsonIgnore
    public void resetSeriesParam9(){
        this.reset(FIELD_SERIESPARAM9);
    }

    /**
     * 设置 序列参数9
     * <P>
     * 等同 {@link #setSeriesParam9}
     * @param seriesParam9
     */
    @JsonIgnore
    public PSDEChartParam seriesparam9(Double seriesParam9){
        this.setSeriesParam9(seriesParam9);
        return this;
    }

    /**
     * <B>SFPSCODELISTID</B>&nbsp;序列属性代码表，指定图形序列名称属性的值转换代码表对象，将名称属性的值转换输出
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSCodeList} 
     */
    public final static String FIELD_SFPSCODELISTID = "sfpscodelistid";

    /**
     * 设置 序列属性代码表，详细说明：{@link #FIELD_SFPSCODELISTID}
     * 
     * @param sFPSCodeListId
     * 
     */
    @JsonProperty(FIELD_SFPSCODELISTID)
    public void setSFPSCodeListId(String sFPSCodeListId){
        this.set(FIELD_SFPSCODELISTID, sFPSCodeListId);
    }
    
    /**
     * 获取 序列属性代码表  
     * @return
     */
    @JsonIgnore
    public String getSFPSCodeListId(){
        Object objValue = this.get(FIELD_SFPSCODELISTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 序列属性代码表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSFPSCodeListIdDirty(){
        if(this.contains(FIELD_SFPSCODELISTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 序列属性代码表
     */
    @JsonIgnore
    public void resetSFPSCodeListId(){
        this.reset(FIELD_SFPSCODELISTID);
    }

    /**
     * 设置 序列属性代码表，详细说明：{@link #FIELD_SFPSCODELISTID}
     * <P>
     * 等同 {@link #setSFPSCodeListId}
     * @param sFPSCodeListId
     */
    @JsonIgnore
    public PSDEChartParam sfpscodelistid(String sFPSCodeListId){
        this.setSFPSCodeListId(sFPSCodeListId);
        return this;
    }

    /**
     * 设置 序列属性代码表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setSFPSCodeListId}
     * @param pSCodeList 引用对象
     */
    @JsonIgnore
    public PSDEChartParam sfpscodelistid(PSCodeList pSCodeList){
        if(pSCodeList == null){
            this.setSFPSCodeListId(null);
            this.setSFPSCodeListName(null);
        }
        else{
            this.setSFPSCodeListId(pSCodeList.getPSCodeListId());
            this.setSFPSCodeListName(pSCodeList.getPSCodeListName());
        }
        return this;
    }

    /**
     * <B>SFPSCODELISTNAME</B>&nbsp;名称属性代码表，指定图形序列名称属性的值转换代码表对象，将名称属性的值转换输出
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_SFPSCODELISTID}
     */
    public final static String FIELD_SFPSCODELISTNAME = "sfpscodelistname";

    /**
     * 设置 名称属性代码表，详细说明：{@link #FIELD_SFPSCODELISTNAME}
     * 
     * @param sFPSCodeListName
     * 
     */
    @JsonProperty(FIELD_SFPSCODELISTNAME)
    public void setSFPSCodeListName(String sFPSCodeListName){
        this.set(FIELD_SFPSCODELISTNAME, sFPSCodeListName);
    }
    
    /**
     * 获取 名称属性代码表  
     * @return
     */
    @JsonIgnore
    public String getSFPSCodeListName(){
        Object objValue = this.get(FIELD_SFPSCODELISTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 名称属性代码表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSFPSCodeListNameDirty(){
        if(this.contains(FIELD_SFPSCODELISTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 名称属性代码表
     */
    @JsonIgnore
    public void resetSFPSCodeListName(){
        this.reset(FIELD_SFPSCODELISTNAME);
    }

    /**
     * 设置 名称属性代码表，详细说明：{@link #FIELD_SFPSCODELISTNAME}
     * <P>
     * 等同 {@link #setSFPSCodeListName}
     * @param sFPSCodeListName
     */
    @JsonIgnore
    public PSDEChartParam sfpscodelistname(String sFPSCodeListName){
        this.setSFPSCodeListName(sFPSCodeListName);
        return this;
    }

    /**
     * <B>SPLITNUMBER</B>&nbsp;分割段数
     */
    public final static String FIELD_SPLITNUMBER = "splitnumber";

    /**
     * 设置 分割段数
     * 
     * @param splitNumber
     * 
     */
    @JsonProperty(FIELD_SPLITNUMBER)
    public void setSplitNumber(Integer splitNumber){
        this.set(FIELD_SPLITNUMBER, splitNumber);
    }
    
    /**
     * 获取 分割段数  
     * @return
     */
    @JsonIgnore
    public Integer getSplitNumber(){
        Object objValue = this.get(FIELD_SPLITNUMBER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 分割段数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSplitNumberDirty(){
        if(this.contains(FIELD_SPLITNUMBER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分割段数
     */
    @JsonIgnore
    public void resetSplitNumber(){
        this.reset(FIELD_SPLITNUMBER);
    }

    /**
     * 设置 分割段数
     * <P>
     * 等同 {@link #setSplitNumber}
     * @param splitNumber
     */
    @JsonIgnore
    public PSDEChartParam splitnumber(Integer splitNumber){
        this.setSplitNumber(splitNumber);
        return this;
    }

    /**
     * <B>STACK</B>&nbsp;数据堆叠
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_STACK = "stack";

    /**
     * 设置 数据堆叠
     * 
     * @param stack
     * 
     */
    @JsonProperty(FIELD_STACK)
    public void setStack(Integer stack){
        this.set(FIELD_STACK, stack);
    }
    
    /**
     * 获取 数据堆叠  
     * @return
     */
    @JsonIgnore
    public Integer getStack(){
        Object objValue = this.get(FIELD_STACK);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 数据堆叠 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStackDirty(){
        if(this.contains(FIELD_STACK)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据堆叠
     */
    @JsonIgnore
    public void resetStack(){
        this.reset(FIELD_STACK);
    }

    /**
     * 设置 数据堆叠
     * <P>
     * 等同 {@link #setStack}
     * @param stack
     */
    @JsonIgnore
    public PSDEChartParam stack(Integer stack){
        this.setStack(stack);
        return this;
    }

     /**
     * 设置 数据堆叠
     * <P>
     * 等同 {@link #setStack}
     * @param stack
     */
    @JsonIgnore
    public PSDEChartParam stack(Boolean stack){
        if(stack == null){
            this.setStack(null);
        }
        else{
            this.setStack(stack?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>STARTANGLE</B>&nbsp;起始角度，指定圆形图形的起始角度，支持饼图、仪表盘序列
     */
    public final static String FIELD_STARTANGLE = "startangle";

    /**
     * 设置 起始角度，详细说明：{@link #FIELD_STARTANGLE}
     * 
     * @param startAngle
     * 
     */
    @JsonProperty(FIELD_STARTANGLE)
    public void setStartAngle(Integer startAngle){
        this.set(FIELD_STARTANGLE, startAngle);
    }
    
    /**
     * 获取 起始角度  
     * @return
     */
    @JsonIgnore
    public Integer getStartAngle(){
        Object objValue = this.get(FIELD_STARTANGLE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 起始角度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStartAngleDirty(){
        if(this.contains(FIELD_STARTANGLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 起始角度
     */
    @JsonIgnore
    public void resetStartAngle(){
        this.reset(FIELD_STARTANGLE);
    }

    /**
     * 设置 起始角度，详细说明：{@link #FIELD_STARTANGLE}
     * <P>
     * 等同 {@link #setStartAngle}
     * @param startAngle
     */
    @JsonIgnore
    public PSDEChartParam startangle(Integer startAngle){
        this.setStartAngle(startAngle);
        return this;
    }

    /**
     * <B>STEP</B>&nbsp;阶梯线图模式
     * <P>
     * 字符串：最大长度 10
     */
    public final static String FIELD_STEP = "step";

    /**
     * 设置 阶梯线图模式
     * 
     * @param step
     * 
     */
    @JsonProperty(FIELD_STEP)
    public void setStep(String step){
        this.set(FIELD_STEP, step);
    }
    
    /**
     * 获取 阶梯线图模式  
     * @return
     */
    @JsonIgnore
    public String getStep(){
        Object objValue = this.get(FIELD_STEP);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 阶梯线图模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStepDirty(){
        if(this.contains(FIELD_STEP)){
            return true;
        }
        return false;
    }

    /**
     * 重置 阶梯线图模式
     */
    @JsonIgnore
    public void resetStep(){
        this.reset(FIELD_STEP);
    }

    /**
     * 设置 阶梯线图模式
     * <P>
     * 等同 {@link #setStep}
     * @param step
     */
    @JsonIgnore
    public PSDEChartParam step(String step){
        this.setStep(step);
        return this;
    }

    /**
     * <B>TAGFIELD</B>&nbsp;标记属性，指定图表序列的标记值存储属性
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_TAGFIELD = "tagfield";

    /**
     * 设置 标记属性，详细说明：{@link #FIELD_TAGFIELD}
     * 
     * @param tagField
     * 
     */
    @JsonProperty(FIELD_TAGFIELD)
    public void setTagField(String tagField){
        this.set(FIELD_TAGFIELD, tagField);
    }
    
    /**
     * 获取 标记属性  
     * @return
     */
    @JsonIgnore
    public String getTagField(){
        Object objValue = this.get(FIELD_TAGFIELD);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标记属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTagFieldDirty(){
        if(this.contains(FIELD_TAGFIELD)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标记属性
     */
    @JsonIgnore
    public void resetTagField(){
        this.reset(FIELD_TAGFIELD);
    }

    /**
     * 设置 标记属性，详细说明：{@link #FIELD_TAGFIELD}
     * <P>
     * 等同 {@link #setTagField}
     * @param tagField
     */
    @JsonIgnore
    public PSDEChartParam tagfield(String tagField){
        this.setTagField(tagField);
        return this;
    }

    /**
     * <B>TIMEGROUP</B>&nbsp;分组模式，指定图形序列的数据分组模式，要求按照分组的类型对原始数据进行汇聚处理
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ChartSeriesGroupMode} 
     */
    public final static String FIELD_TIMEGROUP = "timegroup";

    /**
     * 设置 分组模式，详细说明：{@link #FIELD_TIMEGROUP}
     * 
     * @param timeGroup
     * 
     */
    @JsonProperty(FIELD_TIMEGROUP)
    public void setTimeGroup(String timeGroup){
        this.set(FIELD_TIMEGROUP, timeGroup);
    }
    
    /**
     * 获取 分组模式  
     * @return
     */
    @JsonIgnore
    public String getTimeGroup(){
        Object objValue = this.get(FIELD_TIMEGROUP);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTimeGroupDirty(){
        if(this.contains(FIELD_TIMEGROUP)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组模式
     */
    @JsonIgnore
    public void resetTimeGroup(){
        this.reset(FIELD_TIMEGROUP);
    }

    /**
     * 设置 分组模式，详细说明：{@link #FIELD_TIMEGROUP}
     * <P>
     * 等同 {@link #setTimeGroup}
     * @param timeGroup
     */
    @JsonIgnore
    public PSDEChartParam timegroup(String timeGroup){
        this.setTimeGroup(timeGroup);
        return this;
    }

     /**
     * 设置 分组模式，详细说明：{@link #FIELD_TIMEGROUP}
     * <P>
     * 等同 {@link #setTimeGroup}
     * @param timeGroup
     */
    @JsonIgnore
    public PSDEChartParam timegroup(net.ibizsys.psmodel.core.util.PSModelEnums.ChartSeriesGroupMode timeGroup){
        if(timeGroup == null){
            this.setTimeGroup(null);
        }
        else{
            this.setTimeGroup(timeGroup.value);
        }
        return this;
    }

    /**
     * <B>TOPPOS</B>&nbsp;上方间隔，指定图形的上方间隔
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_TOPPOS = "toppos";

    /**
     * 设置 上方间隔，详细说明：{@link #FIELD_TOPPOS}
     * 
     * @param topPos
     * 
     */
    @JsonProperty(FIELD_TOPPOS)
    public void setTopPos(String topPos){
        this.set(FIELD_TOPPOS, topPos);
    }
    
    /**
     * 获取 上方间隔  
     * @return
     */
    @JsonIgnore
    public String getTopPos(){
        Object objValue = this.get(FIELD_TOPPOS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 上方间隔 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTopPosDirty(){
        if(this.contains(FIELD_TOPPOS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 上方间隔
     */
    @JsonIgnore
    public void resetTopPos(){
        this.reset(FIELD_TOPPOS);
    }

    /**
     * 设置 上方间隔，详细说明：{@link #FIELD_TOPPOS}
     * <P>
     * 等同 {@link #setTopPos}
     * @param topPos
     */
    @JsonIgnore
    public PSDEChartParam toppos(String topPos){
        this.setTopPos(topPos);
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
    public PSDEChartParam updatedate(String updateDate){
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
    public PSDEChartParam updateman(String updateMan){
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
    public PSDEChartParam usercat(String userCat){
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
    public PSDEChartParam usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDEChartParam userparams(String userParams){
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
    public PSDEChartParam usertag(String userTag){
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
    public PSDEChartParam usertag2(String userTag2){
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
    public PSDEChartParam usertag3(String userTag3){
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
    public PSDEChartParam usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>WIDTH</B>&nbsp;宽度，指定图形的宽度
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_WIDTH = "width";

    /**
     * 设置 宽度，详细说明：{@link #FIELD_WIDTH}
     * 
     * @param width
     * 
     */
    @JsonProperty(FIELD_WIDTH)
    public void setWidth(String width){
        this.set(FIELD_WIDTH, width);
    }
    
    /**
     * 获取 宽度  
     * @return
     */
    @JsonIgnore
    public String getWidth(){
        Object objValue = this.get(FIELD_WIDTH);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
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
     * 设置 宽度，详细说明：{@link #FIELD_WIDTH}
     * <P>
     * 等同 {@link #setWidth}
     * @param width
     */
    @JsonIgnore
    public PSDEChartParam width(String width){
        this.setWidth(width);
        return this;
    }

    /**
     * <B>XFIELD</B>&nbsp;分类属性，指定图形序列分类的取值属性
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_XFIELD = "xfield";

    /**
     * 设置 分类属性，详细说明：{@link #FIELD_XFIELD}
     * 
     * @param xField
     * 
     */
    @JsonProperty(FIELD_XFIELD)
    public void setXField(String xField){
        this.set(FIELD_XFIELD, xField);
    }
    
    /**
     * 获取 分类属性  
     * @return
     */
    @JsonIgnore
    public String getXField(){
        Object objValue = this.get(FIELD_XFIELD);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分类属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isXFieldDirty(){
        if(this.contains(FIELD_XFIELD)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分类属性
     */
    @JsonIgnore
    public void resetXField(){
        this.reset(FIELD_XFIELD);
    }

    /**
     * 设置 分类属性，详细说明：{@link #FIELD_XFIELD}
     * <P>
     * 等同 {@link #setXField}
     * @param xField
     */
    @JsonIgnore
    public PSDEChartParam xfield(String xField){
        this.setXField(xField);
        return this;
    }

    /**
     * <B>XFPSCODELISTID</B>&nbsp;分类属性代码表，指定图形序列分类属性的值转换代码表对象，将分类属性的值转换输出
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSCodeList} 
     */
    public final static String FIELD_XFPSCODELISTID = "xfpscodelistid";

    /**
     * 设置 分类属性代码表，详细说明：{@link #FIELD_XFPSCODELISTID}
     * 
     * @param xFPSCodeListId
     * 
     */
    @JsonProperty(FIELD_XFPSCODELISTID)
    public void setXFPSCodeListId(String xFPSCodeListId){
        this.set(FIELD_XFPSCODELISTID, xFPSCodeListId);
    }
    
    /**
     * 获取 分类属性代码表  
     * @return
     */
    @JsonIgnore
    public String getXFPSCodeListId(){
        Object objValue = this.get(FIELD_XFPSCODELISTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分类属性代码表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isXFPSCodeListIdDirty(){
        if(this.contains(FIELD_XFPSCODELISTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分类属性代码表
     */
    @JsonIgnore
    public void resetXFPSCodeListId(){
        this.reset(FIELD_XFPSCODELISTID);
    }

    /**
     * 设置 分类属性代码表，详细说明：{@link #FIELD_XFPSCODELISTID}
     * <P>
     * 等同 {@link #setXFPSCodeListId}
     * @param xFPSCodeListId
     */
    @JsonIgnore
    public PSDEChartParam xfpscodelistid(String xFPSCodeListId){
        this.setXFPSCodeListId(xFPSCodeListId);
        return this;
    }

    /**
     * 设置 分类属性代码表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setXFPSCodeListId}
     * @param pSCodeList 引用对象
     */
    @JsonIgnore
    public PSDEChartParam xfpscodelistid(PSCodeList pSCodeList){
        if(pSCodeList == null){
            this.setXFPSCodeListId(null);
            this.setXFPSCodeListName(null);
        }
        else{
            this.setXFPSCodeListId(pSCodeList.getPSCodeListId());
            this.setXFPSCodeListName(pSCodeList.getPSCodeListName());
        }
        return this;
    }

    /**
     * <B>XFPSCODELISTNAME</B>&nbsp;分类属性代码表，指定图形序列分类属性的值转换代码表对象，将分类属性的值转换输出
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_XFPSCODELISTID}
     */
    public final static String FIELD_XFPSCODELISTNAME = "xfpscodelistname";

    /**
     * 设置 分类属性代码表，详细说明：{@link #FIELD_XFPSCODELISTNAME}
     * 
     * @param xFPSCodeListName
     * 
     */
    @JsonProperty(FIELD_XFPSCODELISTNAME)
    public void setXFPSCodeListName(String xFPSCodeListName){
        this.set(FIELD_XFPSCODELISTNAME, xFPSCodeListName);
    }
    
    /**
     * 获取 分类属性代码表  
     * @return
     */
    @JsonIgnore
    public String getXFPSCodeListName(){
        Object objValue = this.get(FIELD_XFPSCODELISTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分类属性代码表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isXFPSCodeListNameDirty(){
        if(this.contains(FIELD_XFPSCODELISTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分类属性代码表
     */
    @JsonIgnore
    public void resetXFPSCodeListName(){
        this.reset(FIELD_XFPSCODELISTNAME);
    }

    /**
     * 设置 分类属性代码表，详细说明：{@link #FIELD_XFPSCODELISTNAME}
     * <P>
     * 等同 {@link #setXFPSCodeListName}
     * @param xFPSCodeListName
     */
    @JsonIgnore
    public PSDEChartParam xfpscodelistname(String xFPSCodeListName){
        this.setXFPSCodeListName(xFPSCodeListName);
        return this;
    }

    /**
     * <B>XPSDECHARTAXESID</B>&nbsp;X坐标轴，指定图形序列的X坐标轴对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEChartAxes} 
     */
    public final static String FIELD_XPSDECHARTAXESID = "xpsdechartaxesid";

    /**
     * 设置 X坐标轴，详细说明：{@link #FIELD_XPSDECHARTAXESID}
     * 
     * @param xPSDEChartAxesId
     * 
     */
    @JsonProperty(FIELD_XPSDECHARTAXESID)
    public void setXPSDEChartAxesId(String xPSDEChartAxesId){
        this.set(FIELD_XPSDECHARTAXESID, xPSDEChartAxesId);
    }
    
    /**
     * 获取 X坐标轴  
     * @return
     */
    @JsonIgnore
    public String getXPSDEChartAxesId(){
        Object objValue = this.get(FIELD_XPSDECHARTAXESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 X坐标轴 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isXPSDEChartAxesIdDirty(){
        if(this.contains(FIELD_XPSDECHARTAXESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 X坐标轴
     */
    @JsonIgnore
    public void resetXPSDEChartAxesId(){
        this.reset(FIELD_XPSDECHARTAXESID);
    }

    /**
     * 设置 X坐标轴，详细说明：{@link #FIELD_XPSDECHARTAXESID}
     * <P>
     * 等同 {@link #setXPSDEChartAxesId}
     * @param xPSDEChartAxesId
     */
    @JsonIgnore
    public PSDEChartParam xpsdechartaxesid(String xPSDEChartAxesId){
        this.setXPSDEChartAxesId(xPSDEChartAxesId);
        return this;
    }

    /**
     * 设置 X坐标轴，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setXPSDEChartAxesId}
     * @param pSDEChartAxes 引用对象
     */
    @JsonIgnore
    public PSDEChartParam xpsdechartaxesid(PSDEChartAxes pSDEChartAxes){
        if(pSDEChartAxes == null){
            this.setXPSDEChartAxesId(null);
            this.setXPSDEChartAxesName(null);
        }
        else{
            this.setXPSDEChartAxesId(pSDEChartAxes.getPSDEChartAxesId());
            this.setXPSDEChartAxesName(pSDEChartAxes.getPSDEChartAxesName());
        }
        return this;
    }

    /**
     * <B>XPSDECHARTAXESNAME</B>&nbsp;X坐标轴，指定图形序列的X坐标轴对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_XPSDECHARTAXESID}
     */
    public final static String FIELD_XPSDECHARTAXESNAME = "xpsdechartaxesname";

    /**
     * 设置 X坐标轴，详细说明：{@link #FIELD_XPSDECHARTAXESNAME}
     * 
     * @param xPSDEChartAxesName
     * 
     */
    @JsonProperty(FIELD_XPSDECHARTAXESNAME)
    public void setXPSDEChartAxesName(String xPSDEChartAxesName){
        this.set(FIELD_XPSDECHARTAXESNAME, xPSDEChartAxesName);
    }
    
    /**
     * 获取 X坐标轴  
     * @return
     */
    @JsonIgnore
    public String getXPSDEChartAxesName(){
        Object objValue = this.get(FIELD_XPSDECHARTAXESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 X坐标轴 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isXPSDEChartAxesNameDirty(){
        if(this.contains(FIELD_XPSDECHARTAXESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 X坐标轴
     */
    @JsonIgnore
    public void resetXPSDEChartAxesName(){
        this.reset(FIELD_XPSDECHARTAXESNAME);
    }

    /**
     * 设置 X坐标轴，详细说明：{@link #FIELD_XPSDECHARTAXESNAME}
     * <P>
     * 等同 {@link #setXPSDEChartAxesName}
     * @param xPSDEChartAxesName
     */
    @JsonIgnore
    public PSDEChartParam xpsdechartaxesname(String xPSDEChartAxesName){
        this.setXPSDEChartAxesName(xPSDEChartAxesName);
        return this;
    }

    /**
     * <B>YFIELD</B>&nbsp;值属性，指定图形序列值的取值属性
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_YFIELD = "yfield";

    /**
     * 设置 值属性，详细说明：{@link #FIELD_YFIELD}
     * 
     * @param yField
     * 
     */
    @JsonProperty(FIELD_YFIELD)
    public void setYField(String yField){
        this.set(FIELD_YFIELD, yField);
    }
    
    /**
     * 获取 值属性  
     * @return
     */
    @JsonIgnore
    public String getYField(){
        Object objValue = this.get(FIELD_YFIELD);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isYFieldDirty(){
        if(this.contains(FIELD_YFIELD)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值属性
     */
    @JsonIgnore
    public void resetYField(){
        this.reset(FIELD_YFIELD);
    }

    /**
     * 设置 值属性，详细说明：{@link #FIELD_YFIELD}
     * <P>
     * 等同 {@link #setYField}
     * @param yField
     */
    @JsonIgnore
    public PSDEChartParam yfield(String yField){
        this.setYField(yField);
        return this;
    }

    /**
     * <B>YPSDECHARTAXESID</B>&nbsp;Y坐标轴，指定图形序列的Y坐标轴对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEChartAxes} 
     */
    public final static String FIELD_YPSDECHARTAXESID = "ypsdechartaxesid";

    /**
     * 设置 Y坐标轴，详细说明：{@link #FIELD_YPSDECHARTAXESID}
     * 
     * @param yPSDEChartAxesId
     * 
     */
    @JsonProperty(FIELD_YPSDECHARTAXESID)
    public void setYPSDEChartAxesId(String yPSDEChartAxesId){
        this.set(FIELD_YPSDECHARTAXESID, yPSDEChartAxesId);
    }
    
    /**
     * 获取 Y坐标轴  
     * @return
     */
    @JsonIgnore
    public String getYPSDEChartAxesId(){
        Object objValue = this.get(FIELD_YPSDECHARTAXESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 Y坐标轴 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isYPSDEChartAxesIdDirty(){
        if(this.contains(FIELD_YPSDECHARTAXESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 Y坐标轴
     */
    @JsonIgnore
    public void resetYPSDEChartAxesId(){
        this.reset(FIELD_YPSDECHARTAXESID);
    }

    /**
     * 设置 Y坐标轴，详细说明：{@link #FIELD_YPSDECHARTAXESID}
     * <P>
     * 等同 {@link #setYPSDEChartAxesId}
     * @param yPSDEChartAxesId
     */
    @JsonIgnore
    public PSDEChartParam ypsdechartaxesid(String yPSDEChartAxesId){
        this.setYPSDEChartAxesId(yPSDEChartAxesId);
        return this;
    }

    /**
     * 设置 Y坐标轴，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setYPSDEChartAxesId}
     * @param pSDEChartAxes 引用对象
     */
    @JsonIgnore
    public PSDEChartParam ypsdechartaxesid(PSDEChartAxes pSDEChartAxes){
        if(pSDEChartAxes == null){
            this.setYPSDEChartAxesId(null);
            this.setYPSDEChartAxesName(null);
        }
        else{
            this.setYPSDEChartAxesId(pSDEChartAxes.getPSDEChartAxesId());
            this.setYPSDEChartAxesName(pSDEChartAxes.getPSDEChartAxesName());
        }
        return this;
    }

    /**
     * <B>YPSDECHARTAXESNAME</B>&nbsp;Y坐标轴，指定图形序列的Y坐标轴对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_YPSDECHARTAXESID}
     */
    public final static String FIELD_YPSDECHARTAXESNAME = "ypsdechartaxesname";

    /**
     * 设置 Y坐标轴，详细说明：{@link #FIELD_YPSDECHARTAXESNAME}
     * 
     * @param yPSDEChartAxesName
     * 
     */
    @JsonProperty(FIELD_YPSDECHARTAXESNAME)
    public void setYPSDEChartAxesName(String yPSDEChartAxesName){
        this.set(FIELD_YPSDECHARTAXESNAME, yPSDEChartAxesName);
    }
    
    /**
     * 获取 Y坐标轴  
     * @return
     */
    @JsonIgnore
    public String getYPSDEChartAxesName(){
        Object objValue = this.get(FIELD_YPSDECHARTAXESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 Y坐标轴 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isYPSDEChartAxesNameDirty(){
        if(this.contains(FIELD_YPSDECHARTAXESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 Y坐标轴
     */
    @JsonIgnore
    public void resetYPSDEChartAxesName(){
        this.reset(FIELD_YPSDECHARTAXESNAME);
    }

    /**
     * 设置 Y坐标轴，详细说明：{@link #FIELD_YPSDECHARTAXESNAME}
     * <P>
     * 等同 {@link #setYPSDEChartAxesName}
     * @param yPSDEChartAxesName
     */
    @JsonIgnore
    public PSDEChartParam ypsdechartaxesname(String yPSDEChartAxesName){
        this.setYPSDEChartAxesName(yPSDEChartAxesName);
        return this;
    }

    /**
     * <B>ZFIELD</B>&nbsp;标识属性，指定图形序列标识的取值属性
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_ZFIELD = "zfield";

    /**
     * 设置 标识属性，详细说明：{@link #FIELD_ZFIELD}
     * 
     * @param zField
     * 
     */
    @JsonProperty(FIELD_ZFIELD)
    public void setZField(String zField){
        this.set(FIELD_ZFIELD, zField);
    }
    
    /**
     * 获取 标识属性  
     * @return
     */
    @JsonIgnore
    public String getZField(){
        Object objValue = this.get(FIELD_ZFIELD);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标识属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isZFieldDirty(){
        if(this.contains(FIELD_ZFIELD)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标识属性
     */
    @JsonIgnore
    public void resetZField(){
        this.reset(FIELD_ZFIELD);
    }

    /**
     * 设置 标识属性，详细说明：{@link #FIELD_ZFIELD}
     * <P>
     * 等同 {@link #setZField}
     * @param zField
     */
    @JsonIgnore
    public PSDEChartParam zfield(String zField){
        this.setZField(zField);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEChartParamId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEChartParamId(strValue);
    }

    @JsonIgnore
    public PSDEChartParam id(String strValue){
        this.setPSDEChartParamId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEChartParam){
            PSDEChartParam model = (PSDEChartParam)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
