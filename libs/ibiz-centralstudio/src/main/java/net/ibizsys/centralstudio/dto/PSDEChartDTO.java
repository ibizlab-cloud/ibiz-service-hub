package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDECHART</B>实体图表 模型传输对象
 * <P>
 * 实体图表部件模型，定义部件的表现及处理逻辑，包括图表坐标系及数据序列。图表模型参考ECharts，相关的编码值可参考ECharts说明
 */
public class PSDEChartDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSDEChartDTO(){
    }      

    /**
     * <B>ADPSDELOGICID</B>&nbsp;查询转换逻辑，指定实体图表部件使用数据集的查询上下文转换逻辑，将调用环境参数转换为数据集的调用参数
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDELogicDTO} 
     */
    public final static String FIELD_ADPSDELOGICID = "adpsdelogicid";

    /**
     * 设置 查询转换逻辑，详细说明：{@link #FIELD_ADPSDELOGICID}
     * 
     * @param aDPSDELogicId
     * 
     */
    @JsonProperty(FIELD_ADPSDELOGICID)
    public void setADPSDELogicId(String aDPSDELogicId){
        this.set(FIELD_ADPSDELOGICID, aDPSDELogicId);
    }
    
    /**
     * 获取 查询转换逻辑  
     * @return
     */
    @JsonIgnore
    public String getADPSDELogicId(){
        Object objValue = this.get(FIELD_ADPSDELOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 查询转换逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isADPSDELogicIdDirty(){
        if(this.contains(FIELD_ADPSDELOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 查询转换逻辑
     */
    @JsonIgnore
    public void resetADPSDELogicId(){
        this.reset(FIELD_ADPSDELOGICID);
    }

    /**
     * 设置 查询转换逻辑，详细说明：{@link #FIELD_ADPSDELOGICID}
     * <P>
     * 等同 {@link #setADPSDELogicId}
     * @param aDPSDELogicId
     */
    @JsonIgnore
    public PSDEChartDTO adpsdelogicid(String aDPSDELogicId){
        this.setADPSDELogicId(aDPSDELogicId);
        return this;
    }

    /**
     * 设置 查询转换逻辑，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setADPSDELogicId}
     * @param pSDELogic 引用对象
     */
    @JsonIgnore
    public PSDEChartDTO adpsdelogicid(PSDELogicDTO pSDELogic){
        if(pSDELogic == null){
            this.setADPSDELogicId(null);
            this.setADPSDELogicName(null);
        }
        else{
            this.setADPSDELogicId(pSDELogic.getPSDELogicId());
            this.setADPSDELogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    /**
     * <B>ADPSDELOGICNAME</B>&nbsp;查询转换逻辑，指定实体图表部件使用数据集的查询上下文转换逻辑，将调用环境参数转换为数据集的调用参数
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ADPSDELOGICID}
     */
    public final static String FIELD_ADPSDELOGICNAME = "adpsdelogicname";

    /**
     * 设置 查询转换逻辑，详细说明：{@link #FIELD_ADPSDELOGICNAME}
     * 
     * @param aDPSDELogicName
     * 
     */
    @JsonProperty(FIELD_ADPSDELOGICNAME)
    public void setADPSDELogicName(String aDPSDELogicName){
        this.set(FIELD_ADPSDELOGICNAME, aDPSDELogicName);
    }
    
    /**
     * 获取 查询转换逻辑  
     * @return
     */
    @JsonIgnore
    public String getADPSDELogicName(){
        Object objValue = this.get(FIELD_ADPSDELOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 查询转换逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isADPSDELogicNameDirty(){
        if(this.contains(FIELD_ADPSDELOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 查询转换逻辑
     */
    @JsonIgnore
    public void resetADPSDELogicName(){
        this.reset(FIELD_ADPSDELOGICNAME);
    }

    /**
     * 设置 查询转换逻辑，详细说明：{@link #FIELD_ADPSDELOGICNAME}
     * <P>
     * 等同 {@link #setADPSDELogicName}
     * @param aDPSDELogicName
     */
    @JsonIgnore
    public PSDEChartDTO adpsdelogicname(String aDPSDELogicName){
        this.setADPSDELogicName(aDPSDELogicName);
        return this;
    }

    /**
     * <B>BUSYINDICATOR</B>&nbsp;显示处理提示
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_BUSYINDICATOR = "busyindicator";

    /**
     * 设置 显示处理提示
     * 
     * @param busyIndicator
     * 
     */
    @JsonProperty(FIELD_BUSYINDICATOR)
    public void setBusyIndicator(Integer busyIndicator){
        this.set(FIELD_BUSYINDICATOR, busyIndicator);
    }
    
    /**
     * 获取 显示处理提示  
     * @return
     */
    @JsonIgnore
    public Integer getBusyIndicator(){
        Object objValue = this.get(FIELD_BUSYINDICATOR);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 显示处理提示 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBusyIndicatorDirty(){
        if(this.contains(FIELD_BUSYINDICATOR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 显示处理提示
     */
    @JsonIgnore
    public void resetBusyIndicator(){
        this.reset(FIELD_BUSYINDICATOR);
    }

    /**
     * 设置 显示处理提示
     * <P>
     * 等同 {@link #setBusyIndicator}
     * @param busyIndicator
     */
    @JsonIgnore
    public PSDEChartDTO busyindicator(Integer busyIndicator){
        this.setBusyIndicator(busyIndicator);
        return this;
    }

     /**
     * 设置 显示处理提示
     * <P>
     * 等同 {@link #setBusyIndicator}
     * @param busyIndicator
     */
    @JsonIgnore
    public PSDEChartDTO busyindicator(Boolean busyIndicator){
        if(busyIndicator == null){
            this.setBusyIndicator(null);
        }
        else{
            this.setBusyIndicator(busyIndicator?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CHARTTHEME</B>&nbsp;图表主题，指定图表部件的主题
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.ChartTheme} 
     */
    public final static String FIELD_CHARTTHEME = "charttheme";

    /**
     * 设置 图表主题，详细说明：{@link #FIELD_CHARTTHEME}
     * 
     * @param chartTheme
     * 
     */
    @JsonProperty(FIELD_CHARTTHEME)
    public void setChartTheme(String chartTheme){
        this.set(FIELD_CHARTTHEME, chartTheme);
    }
    
    /**
     * 获取 图表主题  
     * @return
     */
    @JsonIgnore
    public String getChartTheme(){
        Object objValue = this.get(FIELD_CHARTTHEME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 图表主题 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isChartThemeDirty(){
        if(this.contains(FIELD_CHARTTHEME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图表主题
     */
    @JsonIgnore
    public void resetChartTheme(){
        this.reset(FIELD_CHARTTHEME);
    }

    /**
     * 设置 图表主题，详细说明：{@link #FIELD_CHARTTHEME}
     * <P>
     * 等同 {@link #setChartTheme}
     * @param chartTheme
     */
    @JsonIgnore
    public PSDEChartDTO charttheme(String chartTheme){
        this.setChartTheme(chartTheme);
        return this;
    }

     /**
     * 设置 图表主题，详细说明：{@link #FIELD_CHARTTHEME}
     * <P>
     * 等同 {@link #setChartTheme}
     * @param chartTheme
     */
    @JsonIgnore
    public PSDEChartDTO charttheme(net.ibizsys.model.PSModelEnums.ChartTheme chartTheme){
        if(chartTheme == null){
            this.setChartTheme(null);
        }
        else{
            this.setChartTheme(chartTheme.value);
        }
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定图表部件的代码标识，需要在所在的实体中具有唯一性
     * <P>
     * 字符串：最大长度 100，由字母、数字、下划线组成，且开始必须为字母
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
    public PSDEChartDTO codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>COORDINATESYSTEM</B>&nbsp;坐标系，指定图表部件默认的坐标系统
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.ChartCoordinateSystem} 
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
    public PSDEChartDTO coordinatesystem(String coordinateSystem){
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
    public PSDEChartDTO coordinatesystem(net.ibizsys.model.PSModelEnums.ChartCoordinateSystem coordinateSystem){
        if(coordinateSystem == null){
            this.setCoordinateSystem(null);
        }
        else{
            this.setCoordinateSystem(coordinateSystem.value);
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
    public PSDEChartDTO createdate(Timestamp createDate){
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
    public PSDEChartDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CUSTOMCOND</B>&nbsp;自定义条件
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_CUSTOMCOND = "customcond";

    /**
     * 设置 自定义条件
     * 
     * @param customCond
     * 
     */
    @JsonProperty(FIELD_CUSTOMCOND)
    public void setCustomCond(String customCond){
        this.set(FIELD_CUSTOMCOND, customCond);
    }
    
    /**
     * 获取 自定义条件  
     * @return
     */
    @JsonIgnore
    public String getCustomCond(){
        Object objValue = this.get(FIELD_CUSTOMCOND);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义条件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomCondDirty(){
        if(this.contains(FIELD_CUSTOMCOND)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义条件
     */
    @JsonIgnore
    public void resetCustomCond(){
        this.reset(FIELD_CUSTOMCOND);
    }

    /**
     * 设置 自定义条件
     * <P>
     * 等同 {@link #setCustomCond}
     * @param customCond
     */
    @JsonIgnore
    public PSDEChartDTO customcond(String customCond){
        this.setCustomCond(customCond);
        return this;
    }

    /**
     * <B>EMPTYTEXT</B>&nbsp;无值显示内容，指定图表部件的无值显示内容，未定义时使用前端应用配置
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_EMPTYTEXT = "emptytext";

    /**
     * 设置 无值显示内容，详细说明：{@link #FIELD_EMPTYTEXT}
     * 
     * @param emptyText
     * 
     */
    @JsonProperty(FIELD_EMPTYTEXT)
    public void setEmptyText(String emptyText){
        this.set(FIELD_EMPTYTEXT, emptyText);
    }
    
    /**
     * 获取 无值显示内容  
     * @return
     */
    @JsonIgnore
    public String getEmptyText(){
        Object objValue = this.get(FIELD_EMPTYTEXT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 无值显示内容 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEmptyTextDirty(){
        if(this.contains(FIELD_EMPTYTEXT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 无值显示内容
     */
    @JsonIgnore
    public void resetEmptyText(){
        this.reset(FIELD_EMPTYTEXT);
    }

    /**
     * 设置 无值显示内容，详细说明：{@link #FIELD_EMPTYTEXT}
     * <P>
     * 等同 {@link #setEmptyText}
     * @param emptyText
     */
    @JsonIgnore
    public PSDEChartDTO emptytext(String emptyText){
        this.setEmptyText(emptyText);
        return this;
    }

    /**
     * <B>EMPTYTEXTPSLANRESID</B>&nbsp;无值内容语言资源，指定图表部件的无值显示内容多语言资源对象，未定义时使用前端应用配置
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSLanguageResDTO} 
     */
    public final static String FIELD_EMPTYTEXTPSLANRESID = "emptytextpslanresid";

    /**
     * 设置 无值内容语言资源，详细说明：{@link #FIELD_EMPTYTEXTPSLANRESID}
     * 
     * @param emptyTextPSLanResId
     * 
     */
    @JsonProperty(FIELD_EMPTYTEXTPSLANRESID)
    public void setEmptyTextPSLanResId(String emptyTextPSLanResId){
        this.set(FIELD_EMPTYTEXTPSLANRESID, emptyTextPSLanResId);
    }
    
    /**
     * 获取 无值内容语言资源  
     * @return
     */
    @JsonIgnore
    public String getEmptyTextPSLanResId(){
        Object objValue = this.get(FIELD_EMPTYTEXTPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 无值内容语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEmptyTextPSLanResIdDirty(){
        if(this.contains(FIELD_EMPTYTEXTPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 无值内容语言资源
     */
    @JsonIgnore
    public void resetEmptyTextPSLanResId(){
        this.reset(FIELD_EMPTYTEXTPSLANRESID);
    }

    /**
     * 设置 无值内容语言资源，详细说明：{@link #FIELD_EMPTYTEXTPSLANRESID}
     * <P>
     * 等同 {@link #setEmptyTextPSLanResId}
     * @param emptyTextPSLanResId
     */
    @JsonIgnore
    public PSDEChartDTO emptytextpslanresid(String emptyTextPSLanResId){
        this.setEmptyTextPSLanResId(emptyTextPSLanResId);
        return this;
    }

    /**
     * 设置 无值内容语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setEmptyTextPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSDEChartDTO emptytextpslanresid(PSLanguageResDTO pSLanguageRes){
        if(pSLanguageRes == null){
            this.setEmptyTextPSLanResId(null);
            this.setEmptyTextPSLanResName(null);
        }
        else{
            this.setEmptyTextPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setEmptyTextPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>EMPTYTEXTPSLANRESNAME</B>&nbsp;无值内容语言资源，指定图表部件的无值显示内容多语言资源对象，未定义时使用前端应用配置
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_EMPTYTEXTPSLANRESID}
     */
    public final static String FIELD_EMPTYTEXTPSLANRESNAME = "emptytextpslanresname";

    /**
     * 设置 无值内容语言资源，详细说明：{@link #FIELD_EMPTYTEXTPSLANRESNAME}
     * 
     * @param emptyTextPSLanResName
     * 
     */
    @JsonProperty(FIELD_EMPTYTEXTPSLANRESNAME)
    public void setEmptyTextPSLanResName(String emptyTextPSLanResName){
        this.set(FIELD_EMPTYTEXTPSLANRESNAME, emptyTextPSLanResName);
    }
    
    /**
     * 获取 无值内容语言资源  
     * @return
     */
    @JsonIgnore
    public String getEmptyTextPSLanResName(){
        Object objValue = this.get(FIELD_EMPTYTEXTPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 无值内容语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEmptyTextPSLanResNameDirty(){
        if(this.contains(FIELD_EMPTYTEXTPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 无值内容语言资源
     */
    @JsonIgnore
    public void resetEmptyTextPSLanResName(){
        this.reset(FIELD_EMPTYTEXTPSLANRESNAME);
    }

    /**
     * 设置 无值内容语言资源，详细说明：{@link #FIELD_EMPTYTEXTPSLANRESNAME}
     * <P>
     * 等同 {@link #setEmptyTextPSLanResName}
     * @param emptyTextPSLanResName
     */
    @JsonIgnore
    public PSDEChartDTO emptytextpslanresname(String emptyTextPSLanResName){
        this.setEmptyTextPSLanResName(emptyTextPSLanResName);
        return this;
    }

    /**
     * <B>LEGENDPOS</B>&nbsp;图例位置，指定图表部件图例的位置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.ChartTitlePos} 
     */
    public final static String FIELD_LEGENDPOS = "legendpos";

    /**
     * 设置 图例位置，详细说明：{@link #FIELD_LEGENDPOS}
     * 
     * @param legendPos
     * 
     */
    @JsonProperty(FIELD_LEGENDPOS)
    public void setLegendPos(String legendPos){
        this.set(FIELD_LEGENDPOS, legendPos);
    }
    
    /**
     * 获取 图例位置  
     * @return
     */
    @JsonIgnore
    public String getLegendPos(){
        Object objValue = this.get(FIELD_LEGENDPOS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 图例位置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLegendPosDirty(){
        if(this.contains(FIELD_LEGENDPOS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图例位置
     */
    @JsonIgnore
    public void resetLegendPos(){
        this.reset(FIELD_LEGENDPOS);
    }

    /**
     * 设置 图例位置，详细说明：{@link #FIELD_LEGENDPOS}
     * <P>
     * 等同 {@link #setLegendPos}
     * @param legendPos
     */
    @JsonIgnore
    public PSDEChartDTO legendpos(String legendPos){
        this.setLegendPos(legendPos);
        return this;
    }

     /**
     * 设置 图例位置，详细说明：{@link #FIELD_LEGENDPOS}
     * <P>
     * 等同 {@link #setLegendPos}
     * @param legendPos
     */
    @JsonIgnore
    public PSDEChartDTO legendpos(net.ibizsys.model.PSModelEnums.ChartTitlePos legendPos){
        if(legendPos == null){
            this.setLegendPos(null);
        }
        else{
            this.setLegendPos(legendPos.value);
        }
        return this;
    }

    /**
     * <B>LNPSLANRESID</B>&nbsp;标题语言资源，指定图表部件的标题的多语言资源对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSLanguageResDTO} 
     */
    public final static String FIELD_LNPSLANRESID = "lnpslanresid";

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_LNPSLANRESID}
     * 
     * @param lNPSLanResId
     * 
     */
    @JsonProperty(FIELD_LNPSLANRESID)
    public void setLNPSLanResId(String lNPSLanResId){
        this.set(FIELD_LNPSLANRESID, lNPSLanResId);
    }
    
    /**
     * 获取 标题语言资源  
     * @return
     */
    @JsonIgnore
    public String getLNPSLanResId(){
        Object objValue = this.get(FIELD_LNPSLANRESID);
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
    public boolean isLNPSLanResIdDirty(){
        if(this.contains(FIELD_LNPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题语言资源
     */
    @JsonIgnore
    public void resetLNPSLanResId(){
        this.reset(FIELD_LNPSLANRESID);
    }

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_LNPSLANRESID}
     * <P>
     * 等同 {@link #setLNPSLanResId}
     * @param lNPSLanResId
     */
    @JsonIgnore
    public PSDEChartDTO lnpslanresid(String lNPSLanResId){
        this.setLNPSLanResId(lNPSLanResId);
        return this;
    }

    /**
     * 设置 标题语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setLNPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSDEChartDTO lnpslanresid(PSLanguageResDTO pSLanguageRes){
        if(pSLanguageRes == null){
            this.setLNPSLanResId(null);
            this.setLNPSLanResName(null);
        }
        else{
            this.setLNPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setLNPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>LNPSLANRESNAME</B>&nbsp;标题语言资源，指定图表部件的标题的多语言资源对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_LNPSLANRESID}
     */
    public final static String FIELD_LNPSLANRESNAME = "lnpslanresname";

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_LNPSLANRESNAME}
     * 
     * @param lNPSLanResName
     * 
     */
    @JsonProperty(FIELD_LNPSLANRESNAME)
    public void setLNPSLanResName(String lNPSLanResName){
        this.set(FIELD_LNPSLANRESNAME, lNPSLanResName);
    }
    
    /**
     * 获取 标题语言资源  
     * @return
     */
    @JsonIgnore
    public String getLNPSLanResName(){
        Object objValue = this.get(FIELD_LNPSLANRESNAME);
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
    public boolean isLNPSLanResNameDirty(){
        if(this.contains(FIELD_LNPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题语言资源
     */
    @JsonIgnore
    public void resetLNPSLanResName(){
        this.reset(FIELD_LNPSLANRESNAME);
    }

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_LNPSLANRESNAME}
     * <P>
     * 等同 {@link #setLNPSLanResName}
     * @param lNPSLanResName
     */
    @JsonIgnore
    public PSDEChartDTO lnpslanresname(String lNPSLanResName){
        this.setLNPSLanResName(lNPSLanResName);
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;中文名称，指定图表部件的逻辑名称，一般作为视图标题
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_LOGICNAME = "logicname";

    /**
     * 设置 中文名称，详细说明：{@link #FIELD_LOGICNAME}
     * 
     * @param logicName
     * 
     */
    @JsonProperty(FIELD_LOGICNAME)
    public void setLogicName(String logicName){
        this.set(FIELD_LOGICNAME, logicName);
    }
    
    /**
     * 获取 中文名称  
     * @return
     */
    @JsonIgnore
    public String getLogicName(){
        Object objValue = this.get(FIELD_LOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 中文名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLogicNameDirty(){
        if(this.contains(FIELD_LOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 中文名称
     */
    @JsonIgnore
    public void resetLogicName(){
        this.reset(FIELD_LOGICNAME);
    }

    /**
     * 设置 中文名称，详细说明：{@link #FIELD_LOGICNAME}
     * <P>
     * 等同 {@link #setLogicName}
     * @param logicName
     */
    @JsonIgnore
    public PSDEChartDTO logicname(String logicName){
        this.setLogicName(logicName);
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
    public PSDEChartDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MINORSORTDIR</B>&nbsp;默认排序方向，指定图表对数据集合的默认排序方向，需指定默认排序属性
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.SortDir} 
     */
    public final static String FIELD_MINORSORTDIR = "minorsortdir";

    /**
     * 设置 默认排序方向，详细说明：{@link #FIELD_MINORSORTDIR}
     * 
     * @param minorSortDir
     * 
     */
    @JsonProperty(FIELD_MINORSORTDIR)
    public void setMinorSortDir(String minorSortDir){
        this.set(FIELD_MINORSORTDIR, minorSortDir);
    }
    
    /**
     * 获取 默认排序方向  
     * @return
     */
    @JsonIgnore
    public String getMinorSortDir(){
        Object objValue = this.get(FIELD_MINORSORTDIR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认排序方向 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinorSortDirDirty(){
        if(this.contains(FIELD_MINORSORTDIR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认排序方向
     */
    @JsonIgnore
    public void resetMinorSortDir(){
        this.reset(FIELD_MINORSORTDIR);
    }

    /**
     * 设置 默认排序方向，详细说明：{@link #FIELD_MINORSORTDIR}
     * <P>
     * 等同 {@link #setMinorSortDir}
     * @param minorSortDir
     */
    @JsonIgnore
    public PSDEChartDTO minorsortdir(String minorSortDir){
        this.setMinorSortDir(minorSortDir);
        return this;
    }

     /**
     * 设置 默认排序方向，详细说明：{@link #FIELD_MINORSORTDIR}
     * <P>
     * 等同 {@link #setMinorSortDir}
     * @param minorSortDir
     */
    @JsonIgnore
    public PSDEChartDTO minorsortdir(net.ibizsys.model.PSModelEnums.SortDir minorSortDir){
        if(minorSortDir == null){
            this.setMinorSortDir(null);
        }
        else{
            this.setMinorSortDir(minorSortDir.value);
        }
        return this;
    }

    /**
     * <B>MINORSORTPSDEFID</B>&nbsp;默认排序属性，指定图表部件对数据集合的默认排序属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_MINORSORTPSDEFID = "minorsortpsdefid";

    /**
     * 设置 默认排序属性，详细说明：{@link #FIELD_MINORSORTPSDEFID}
     * 
     * @param minorSortPSDEFId
     * 
     */
    @JsonProperty(FIELD_MINORSORTPSDEFID)
    public void setMinorSortPSDEFId(String minorSortPSDEFId){
        this.set(FIELD_MINORSORTPSDEFID, minorSortPSDEFId);
    }
    
    /**
     * 获取 默认排序属性  
     * @return
     */
    @JsonIgnore
    public String getMinorSortPSDEFId(){
        Object objValue = this.get(FIELD_MINORSORTPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认排序属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinorSortPSDEFIdDirty(){
        if(this.contains(FIELD_MINORSORTPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认排序属性
     */
    @JsonIgnore
    public void resetMinorSortPSDEFId(){
        this.reset(FIELD_MINORSORTPSDEFID);
    }

    /**
     * 设置 默认排序属性，详细说明：{@link #FIELD_MINORSORTPSDEFID}
     * <P>
     * 等同 {@link #setMinorSortPSDEFId}
     * @param minorSortPSDEFId
     */
    @JsonIgnore
    public PSDEChartDTO minorsortpsdefid(String minorSortPSDEFId){
        this.setMinorSortPSDEFId(minorSortPSDEFId);
        return this;
    }

    /**
     * 设置 默认排序属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMinorSortPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDEChartDTO minorsortpsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setMinorSortPSDEFId(null);
            this.setMinorSortPSDEFName(null);
        }
        else{
            this.setMinorSortPSDEFId(pSDEField.getPSDEFieldId());
            this.setMinorSortPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>MINORSORTPSDEFNAME</B>&nbsp;默认排序属性，指定图表部件对数据集合的默认排序属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MINORSORTPSDEFID}
     */
    public final static String FIELD_MINORSORTPSDEFNAME = "minorsortpsdefname";

    /**
     * 设置 默认排序属性，详细说明：{@link #FIELD_MINORSORTPSDEFNAME}
     * 
     * @param minorSortPSDEFName
     * 
     */
    @JsonProperty(FIELD_MINORSORTPSDEFNAME)
    public void setMinorSortPSDEFName(String minorSortPSDEFName){
        this.set(FIELD_MINORSORTPSDEFNAME, minorSortPSDEFName);
    }
    
    /**
     * 获取 默认排序属性  
     * @return
     */
    @JsonIgnore
    public String getMinorSortPSDEFName(){
        Object objValue = this.get(FIELD_MINORSORTPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认排序属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinorSortPSDEFNameDirty(){
        if(this.contains(FIELD_MINORSORTPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认排序属性
     */
    @JsonIgnore
    public void resetMinorSortPSDEFName(){
        this.reset(FIELD_MINORSORTPSDEFNAME);
    }

    /**
     * 设置 默认排序属性，详细说明：{@link #FIELD_MINORSORTPSDEFNAME}
     * <P>
     * 等同 {@link #setMinorSortPSDEFName}
     * @param minorSortPSDEFName
     */
    @JsonIgnore
    public PSDEChartDTO minorsortpsdefname(String minorSortPSDEFName){
        this.setMinorSortPSDEFName(minorSortPSDEFName);
        return this;
    }

    /**
     * <B>PSACHANDLERID</B>&nbsp;界面处理对象，指定图表部件默认的界面处理对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSACHandlerDTO} 
     */
    public final static String FIELD_PSACHANDLERID = "psachandlerid";

    /**
     * 设置 界面处理对象，详细说明：{@link #FIELD_PSACHANDLERID}
     * 
     * @param pSACHandlerId
     * 
     */
    @JsonProperty(FIELD_PSACHANDLERID)
    public void setPSACHandlerId(String pSACHandlerId){
        this.set(FIELD_PSACHANDLERID, pSACHandlerId);
    }
    
    /**
     * 获取 界面处理对象  
     * @return
     */
    @JsonIgnore
    public String getPSACHandlerId(){
        Object objValue = this.get(FIELD_PSACHANDLERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面处理对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSACHandlerIdDirty(){
        if(this.contains(FIELD_PSACHANDLERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面处理对象
     */
    @JsonIgnore
    public void resetPSACHandlerId(){
        this.reset(FIELD_PSACHANDLERID);
    }

    /**
     * 设置 界面处理对象，详细说明：{@link #FIELD_PSACHANDLERID}
     * <P>
     * 等同 {@link #setPSACHandlerId}
     * @param pSACHandlerId
     */
    @JsonIgnore
    public PSDEChartDTO psachandlerid(String pSACHandlerId){
        this.setPSACHandlerId(pSACHandlerId);
        return this;
    }

    /**
     * 设置 界面处理对象，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSACHandlerId}
     * @param pSACHandler 引用对象
     */
    @JsonIgnore
    public PSDEChartDTO psachandlerid(PSACHandlerDTO pSACHandler){
        if(pSACHandler == null){
            this.setPSACHandlerId(null);
            this.setPSACHandlerName(null);
        }
        else{
            this.setPSACHandlerId(pSACHandler.getPSACHandlerId());
            this.setPSACHandlerName(pSACHandler.getPSACHandlerName());
        }
        return this;
    }

    /**
     * <B>PSACHANDLERNAME</B>&nbsp;界面处理对象，指定图表部件默认的界面处理对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSACHANDLERID}
     */
    public final static String FIELD_PSACHANDLERNAME = "psachandlername";

    /**
     * 设置 界面处理对象，详细说明：{@link #FIELD_PSACHANDLERNAME}
     * 
     * @param pSACHandlerName
     * 
     */
    @JsonProperty(FIELD_PSACHANDLERNAME)
    public void setPSACHandlerName(String pSACHandlerName){
        this.set(FIELD_PSACHANDLERNAME, pSACHandlerName);
    }
    
    /**
     * 获取 界面处理对象  
     * @return
     */
    @JsonIgnore
    public String getPSACHandlerName(){
        Object objValue = this.get(FIELD_PSACHANDLERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面处理对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSACHandlerNameDirty(){
        if(this.contains(FIELD_PSACHANDLERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面处理对象
     */
    @JsonIgnore
    public void resetPSACHandlerName(){
        this.reset(FIELD_PSACHANDLERNAME);
    }

    /**
     * 设置 界面处理对象，详细说明：{@link #FIELD_PSACHANDLERNAME}
     * <P>
     * 等同 {@link #setPSACHandlerName}
     * @param pSACHandlerName
     */
    @JsonIgnore
    public PSDEChartDTO psachandlername(String pSACHandlerName){
        this.setPSACHandlerName(pSACHandlerName);
        return this;
    }

    /**
     * <B>PSCTRLLOGICGROUPID</B>&nbsp;界面逻辑组，指定图表部件默认附加的部件逻辑组对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSCtrlLogicGroupDTO} 
     */
    public final static String FIELD_PSCTRLLOGICGROUPID = "psctrllogicgroupid";

    /**
     * 设置 界面逻辑组，详细说明：{@link #FIELD_PSCTRLLOGICGROUPID}
     * 
     * @param pSCtrlLogicGroupId
     * 
     */
    @JsonProperty(FIELD_PSCTRLLOGICGROUPID)
    public void setPSCtrlLogicGroupId(String pSCtrlLogicGroupId){
        this.set(FIELD_PSCTRLLOGICGROUPID, pSCtrlLogicGroupId);
    }
    
    /**
     * 获取 界面逻辑组  
     * @return
     */
    @JsonIgnore
    public String getPSCtrlLogicGroupId(){
        Object objValue = this.get(FIELD_PSCTRLLOGICGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面逻辑组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCtrlLogicGroupIdDirty(){
        if(this.contains(FIELD_PSCTRLLOGICGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面逻辑组
     */
    @JsonIgnore
    public void resetPSCtrlLogicGroupId(){
        this.reset(FIELD_PSCTRLLOGICGROUPID);
    }

    /**
     * 设置 界面逻辑组，详细说明：{@link #FIELD_PSCTRLLOGICGROUPID}
     * <P>
     * 等同 {@link #setPSCtrlLogicGroupId}
     * @param pSCtrlLogicGroupId
     */
    @JsonIgnore
    public PSDEChartDTO psctrllogicgroupid(String pSCtrlLogicGroupId){
        this.setPSCtrlLogicGroupId(pSCtrlLogicGroupId);
        return this;
    }

    /**
     * 设置 界面逻辑组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSCtrlLogicGroupId}
     * @param pSCtrlLogicGroup 引用对象
     */
    @JsonIgnore
    public PSDEChartDTO psctrllogicgroupid(PSCtrlLogicGroupDTO pSCtrlLogicGroup){
        if(pSCtrlLogicGroup == null){
            this.setPSCtrlLogicGroupId(null);
            this.setPSCtrlLogicGroupName(null);
        }
        else{
            this.setPSCtrlLogicGroupId(pSCtrlLogicGroup.getPSCtrlLogicGroupId());
            this.setPSCtrlLogicGroupName(pSCtrlLogicGroup.getPSCtrlLogicGroupName());
        }
        return this;
    }

    /**
     * <B>PSCTRLLOGICGROUPNAME</B>&nbsp;界面逻辑组，指定图表部件默认附加的部件逻辑组对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCTRLLOGICGROUPID}
     */
    public final static String FIELD_PSCTRLLOGICGROUPNAME = "psctrllogicgroupname";

    /**
     * 设置 界面逻辑组，详细说明：{@link #FIELD_PSCTRLLOGICGROUPNAME}
     * 
     * @param pSCtrlLogicGroupName
     * 
     */
    @JsonProperty(FIELD_PSCTRLLOGICGROUPNAME)
    public void setPSCtrlLogicGroupName(String pSCtrlLogicGroupName){
        this.set(FIELD_PSCTRLLOGICGROUPNAME, pSCtrlLogicGroupName);
    }
    
    /**
     * 获取 界面逻辑组  
     * @return
     */
    @JsonIgnore
    public String getPSCtrlLogicGroupName(){
        Object objValue = this.get(FIELD_PSCTRLLOGICGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面逻辑组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCtrlLogicGroupNameDirty(){
        if(this.contains(FIELD_PSCTRLLOGICGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面逻辑组
     */
    @JsonIgnore
    public void resetPSCtrlLogicGroupName(){
        this.reset(FIELD_PSCTRLLOGICGROUPNAME);
    }

    /**
     * 设置 界面逻辑组，详细说明：{@link #FIELD_PSCTRLLOGICGROUPNAME}
     * <P>
     * 等同 {@link #setPSCtrlLogicGroupName}
     * @param pSCtrlLogicGroupName
     */
    @JsonIgnore
    public PSDEChartDTO psctrllogicgroupname(String pSCtrlLogicGroupName){
        this.setPSCtrlLogicGroupName(pSCtrlLogicGroupName);
        return this;
    }

    /**
     * <B>PSCTRLMSGID</B>&nbsp;部件消息，指定图表部件默认的部件消息对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSCtrlMsgDTO} 
     */
    public final static String FIELD_PSCTRLMSGID = "psctrlmsgid";

    /**
     * 设置 部件消息，详细说明：{@link #FIELD_PSCTRLMSGID}
     * 
     * @param pSCtrlMsgId
     * 
     */
    @JsonProperty(FIELD_PSCTRLMSGID)
    public void setPSCtrlMsgId(String pSCtrlMsgId){
        this.set(FIELD_PSCTRLMSGID, pSCtrlMsgId);
    }
    
    /**
     * 获取 部件消息  
     * @return
     */
    @JsonIgnore
    public String getPSCtrlMsgId(){
        Object objValue = this.get(FIELD_PSCTRLMSGID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件消息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCtrlMsgIdDirty(){
        if(this.contains(FIELD_PSCTRLMSGID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件消息
     */
    @JsonIgnore
    public void resetPSCtrlMsgId(){
        this.reset(FIELD_PSCTRLMSGID);
    }

    /**
     * 设置 部件消息，详细说明：{@link #FIELD_PSCTRLMSGID}
     * <P>
     * 等同 {@link #setPSCtrlMsgId}
     * @param pSCtrlMsgId
     */
    @JsonIgnore
    public PSDEChartDTO psctrlmsgid(String pSCtrlMsgId){
        this.setPSCtrlMsgId(pSCtrlMsgId);
        return this;
    }

    /**
     * 设置 部件消息，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSCtrlMsgId}
     * @param pSCtrlMsg 引用对象
     */
    @JsonIgnore
    public PSDEChartDTO psctrlmsgid(PSCtrlMsgDTO pSCtrlMsg){
        if(pSCtrlMsg == null){
            this.setPSCtrlMsgId(null);
            this.setPSCtrlMsgName(null);
        }
        else{
            this.setPSCtrlMsgId(pSCtrlMsg.getPSCtrlMsgId());
            this.setPSCtrlMsgName(pSCtrlMsg.getPSCtrlMsgName());
        }
        return this;
    }

    /**
     * <B>PSCTRLMSGNAME</B>&nbsp;部件消息，指定图表部件默认的部件消息对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCTRLMSGID}
     */
    public final static String FIELD_PSCTRLMSGNAME = "psctrlmsgname";

    /**
     * 设置 部件消息，详细说明：{@link #FIELD_PSCTRLMSGNAME}
     * 
     * @param pSCtrlMsgName
     * 
     */
    @JsonProperty(FIELD_PSCTRLMSGNAME)
    public void setPSCtrlMsgName(String pSCtrlMsgName){
        this.set(FIELD_PSCTRLMSGNAME, pSCtrlMsgName);
    }
    
    /**
     * 获取 部件消息  
     * @return
     */
    @JsonIgnore
    public String getPSCtrlMsgName(){
        Object objValue = this.get(FIELD_PSCTRLMSGNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件消息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCtrlMsgNameDirty(){
        if(this.contains(FIELD_PSCTRLMSGNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件消息
     */
    @JsonIgnore
    public void resetPSCtrlMsgName(){
        this.reset(FIELD_PSCTRLMSGNAME);
    }

    /**
     * 设置 部件消息，详细说明：{@link #FIELD_PSCTRLMSGNAME}
     * <P>
     * 等同 {@link #setPSCtrlMsgName}
     * @param pSCtrlMsgName
     */
    @JsonIgnore
    public PSDEChartDTO psctrlmsgname(String pSCtrlMsgName){
        this.setPSCtrlMsgName(pSCtrlMsgName);
        return this;
    }

    /**
     * <B>PSDECHARTID</B>&nbsp;实体图表标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDECHARTID = "psdechartid";

    /**
     * 设置 实体图表标识
     * 
     * @param pSDEChartId
     * 
     */
    @JsonProperty(FIELD_PSDECHARTID)
    public void setPSDEChartId(String pSDEChartId){
        this.set(FIELD_PSDECHARTID, pSDEChartId);
    }
    
    /**
     * 获取 实体图表标识  
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
     * 判断 实体图表标识 是否指定值，包括空值
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
     * 重置 实体图表标识
     */
    @JsonIgnore
    public void resetPSDEChartId(){
        this.reset(FIELD_PSDECHARTID);
    }

    /**
     * 设置 实体图表标识
     * <P>
     * 等同 {@link #setPSDEChartId}
     * @param pSDEChartId
     */
    @JsonIgnore
    public PSDEChartDTO psdechartid(String pSDEChartId){
        this.setPSDEChartId(pSDEChartId);
        return this;
    }

    /**
     * <B>PSDECHARTNAME</B>&nbsp;实体图表标识，指定图表部件的标识，需在所在的实体具备唯一性
     * <P>
     * 字符串：最大长度 200，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSDECHARTNAME = "psdechartname";

    /**
     * 设置 实体图表标识，详细说明：{@link #FIELD_PSDECHARTNAME}
     * 
     * @param pSDEChartName
     * 
     */
    @JsonProperty(FIELD_PSDECHARTNAME)
    public void setPSDEChartName(String pSDEChartName){
        this.set(FIELD_PSDECHARTNAME, pSDEChartName);
    }
    
    /**
     * 获取 实体图表标识  
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
     * 判断 实体图表标识 是否指定值，包括空值
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
     * 重置 实体图表标识
     */
    @JsonIgnore
    public void resetPSDEChartName(){
        this.reset(FIELD_PSDECHARTNAME);
    }

    /**
     * 设置 实体图表标识，详细说明：{@link #FIELD_PSDECHARTNAME}
     * <P>
     * 等同 {@link #setPSDEChartName}
     * @param pSDEChartName
     */
    @JsonIgnore
    public PSDEChartDTO psdechartname(String pSDEChartName){
        this.setPSDEChartName(pSDEChartName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEChartName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEChartName(strName);
    }

    @JsonIgnore
    public PSDEChartDTO name(String strName){
        this.setPSDEChartName(strName);
        return this;
    }

    /**
     * <B>PSDEDSID</B>&nbsp;默认数据集合，指定图表部件默认的数据集
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO} 
     */
    public final static String FIELD_PSDEDSID = "psdedsid";

    /**
     * 设置 默认数据集合，详细说明：{@link #FIELD_PSDEDSID}
     * 
     * @param pSDEDSId
     * 
     */
    @JsonProperty(FIELD_PSDEDSID)
    public void setPSDEDSId(String pSDEDSId){
        this.set(FIELD_PSDEDSID, pSDEDSId);
    }
    
    /**
     * 获取 默认数据集合  
     * @return
     */
    @JsonIgnore
    public String getPSDEDSId(){
        Object objValue = this.get(FIELD_PSDEDSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认数据集合 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDSIdDirty(){
        if(this.contains(FIELD_PSDEDSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认数据集合
     */
    @JsonIgnore
    public void resetPSDEDSId(){
        this.reset(FIELD_PSDEDSID);
    }

    /**
     * 设置 默认数据集合，详细说明：{@link #FIELD_PSDEDSID}
     * <P>
     * 等同 {@link #setPSDEDSId}
     * @param pSDEDSId
     */
    @JsonIgnore
    public PSDEChartDTO psdedsid(String pSDEDSId){
        this.setPSDEDSId(pSDEDSId);
        return this;
    }

    /**
     * 设置 默认数据集合，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDSId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSDEChartDTO psdedsid(PSDEDataSetDTO pSDEDataSet){
        if(pSDEDataSet == null){
            this.setPSDEDSId(null);
            this.setPSDEDSName(null);
        }
        else{
            this.setPSDEDSId(pSDEDataSet.getPSDEDataSetId());
            this.setPSDEDSName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    /**
     * <B>PSDEDSNAME</B>&nbsp;默认数据集合，指定图表部件默认的数据集
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDSID}
     */
    public final static String FIELD_PSDEDSNAME = "psdedsname";

    /**
     * 设置 默认数据集合，详细说明：{@link #FIELD_PSDEDSNAME}
     * 
     * @param pSDEDSName
     * 
     */
    @JsonProperty(FIELD_PSDEDSNAME)
    public void setPSDEDSName(String pSDEDSName){
        this.set(FIELD_PSDEDSNAME, pSDEDSName);
    }
    
    /**
     * 获取 默认数据集合  
     * @return
     */
    @JsonIgnore
    public String getPSDEDSName(){
        Object objValue = this.get(FIELD_PSDEDSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认数据集合 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDSNameDirty(){
        if(this.contains(FIELD_PSDEDSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认数据集合
     */
    @JsonIgnore
    public void resetPSDEDSName(){
        this.reset(FIELD_PSDEDSNAME);
    }

    /**
     * 设置 默认数据集合，详细说明：{@link #FIELD_PSDEDSNAME}
     * <P>
     * 等同 {@link #setPSDEDSName}
     * @param pSDEDSName
     */
    @JsonIgnore
    public PSDEChartDTO psdedsname(String pSDEDSName){
        this.setPSDEDSName(pSDEDSName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定图表部件所在的实体对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDataEntityDTO} 
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 实体，详细说明：{@link #FIELD_PSDEID}
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
     * 设置 实体，详细说明：{@link #FIELD_PSDEID}
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSDEChartDTO psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * 设置 实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDEChartDTO psdeid(PSDataEntityDTO pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;实体，指定图表部件所在的实体对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_PSDENAME = "psdename";

    /**
     * 设置 实体，详细说明：{@link #FIELD_PSDENAME}
     * 
     * @param pSDEName
     * 
     */
    @JsonProperty(FIELD_PSDENAME)
    public void setPSDEName(String pSDEName){
        this.set(FIELD_PSDENAME, pSDEName);
    }
    
    /**
     * 获取 实体  
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
     * 判断 实体 是否指定值，包括空值
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
     * 重置 实体
     */
    @JsonIgnore
    public void resetPSDEName(){
        this.reset(FIELD_PSDENAME);
    }

    /**
     * 设置 实体，详细说明：{@link #FIELD_PSDENAME}
     * <P>
     * 等同 {@link #setPSDEName}
     * @param pSDEName
     */
    @JsonIgnore
    public PSDEChartDTO psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSSYSCHARTTHEMEID</B>&nbsp;系统图表主题
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysChartThemeDTO} 
     */
    public final static String FIELD_PSSYSCHARTTHEMEID = "pssyschartthemeid";

    /**
     * 设置 系统图表主题
     * 
     * @param pSSysChartThemeId
     * 
     */
    @JsonProperty(FIELD_PSSYSCHARTTHEMEID)
    public void setPSSysChartThemeId(String pSSysChartThemeId){
        this.set(FIELD_PSSYSCHARTTHEMEID, pSSysChartThemeId);
    }
    
    /**
     * 获取 系统图表主题  
     * @return
     */
    @JsonIgnore
    public String getPSSysChartThemeId(){
        Object objValue = this.get(FIELD_PSSYSCHARTTHEMEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统图表主题 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysChartThemeIdDirty(){
        if(this.contains(FIELD_PSSYSCHARTTHEMEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统图表主题
     */
    @JsonIgnore
    public void resetPSSysChartThemeId(){
        this.reset(FIELD_PSSYSCHARTTHEMEID);
    }

    /**
     * 设置 系统图表主题
     * <P>
     * 等同 {@link #setPSSysChartThemeId}
     * @param pSSysChartThemeId
     */
    @JsonIgnore
    public PSDEChartDTO pssyschartthemeid(String pSSysChartThemeId){
        this.setPSSysChartThemeId(pSSysChartThemeId);
        return this;
    }

    /**
     * 设置 系统图表主题，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysChartThemeId}
     * @param pSSysChartTheme 引用对象
     */
    @JsonIgnore
    public PSDEChartDTO pssyschartthemeid(PSSysChartThemeDTO pSSysChartTheme){
        if(pSSysChartTheme == null){
            this.setPSSysChartThemeId(null);
            this.setPSSysChartThemeName(null);
        }
        else{
            this.setPSSysChartThemeId(pSSysChartTheme.getPSSysChartThemeId());
            this.setPSSysChartThemeName(pSSysChartTheme.getPSSysChartThemeName());
        }
        return this;
    }

    /**
     * <B>PSSYSCHARTTHEMENAME</B>&nbsp;系统图表主题
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSCHARTTHEMEID}
     */
    public final static String FIELD_PSSYSCHARTTHEMENAME = "pssyschartthemename";

    /**
     * 设置 系统图表主题
     * 
     * @param pSSysChartThemeName
     * 
     */
    @JsonProperty(FIELD_PSSYSCHARTTHEMENAME)
    public void setPSSysChartThemeName(String pSSysChartThemeName){
        this.set(FIELD_PSSYSCHARTTHEMENAME, pSSysChartThemeName);
    }
    
    /**
     * 获取 系统图表主题  
     * @return
     */
    @JsonIgnore
    public String getPSSysChartThemeName(){
        Object objValue = this.get(FIELD_PSSYSCHARTTHEMENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统图表主题 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysChartThemeNameDirty(){
        if(this.contains(FIELD_PSSYSCHARTTHEMENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统图表主题
     */
    @JsonIgnore
    public void resetPSSysChartThemeName(){
        this.reset(FIELD_PSSYSCHARTTHEMENAME);
    }

    /**
     * 设置 系统图表主题
     * <P>
     * 等同 {@link #setPSSysChartThemeName}
     * @param pSSysChartThemeName
     */
    @JsonIgnore
    public PSDEChartDTO pssyschartthemename(String pSSysChartThemeName){
        this.setPSSysChartThemeName(pSSysChartThemeName);
        return this;
    }

    /**
     * <B>PSSYSCSSID</B>&nbsp;默认样式表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysCssDTO} 
     */
    public final static String FIELD_PSSYSCSSID = "pssyscssid";

    /**
     * 设置 默认样式表
     * 
     * @param pSSysCssId
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSID)
    public void setPSSysCssId(String pSSysCssId){
        this.set(FIELD_PSSYSCSSID, pSSysCssId);
    }
    
    /**
     * 获取 默认样式表  
     * @return
     */
    @JsonIgnore
    public String getPSSysCssId(){
        Object objValue = this.get(FIELD_PSSYSCSSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCssIdDirty(){
        if(this.contains(FIELD_PSSYSCSSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认样式表
     */
    @JsonIgnore
    public void resetPSSysCssId(){
        this.reset(FIELD_PSSYSCSSID);
    }

    /**
     * 设置 默认样式表
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCssId
     */
    @JsonIgnore
    public PSDEChartDTO pssyscssid(String pSSysCssId){
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    /**
     * 设置 默认样式表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSDEChartDTO pssyscssid(PSSysCssDTO pSSysCss){
        if(pSSysCss == null){
            this.setPSSysCssId(null);
            this.setPSSysCssName(null);
        }
        else{
            this.setPSSysCssId(pSSysCss.getPSSysCssId());
            this.setPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    /**
     * <B>PSSYSCSSNAME</B>&nbsp;默认样式表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSCSSID}
     */
    public final static String FIELD_PSSYSCSSNAME = "pssyscssname";

    /**
     * 设置 默认样式表
     * 
     * @param pSSysCssName
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSNAME)
    public void setPSSysCssName(String pSSysCssName){
        this.set(FIELD_PSSYSCSSNAME, pSSysCssName);
    }
    
    /**
     * 获取 默认样式表  
     * @return
     */
    @JsonIgnore
    public String getPSSysCssName(){
        Object objValue = this.get(FIELD_PSSYSCSSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCssNameDirty(){
        if(this.contains(FIELD_PSSYSCSSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认样式表
     */
    @JsonIgnore
    public void resetPSSysCssName(){
        this.reset(FIELD_PSSYSCSSNAME);
    }

    /**
     * 设置 默认样式表
     * <P>
     * 等同 {@link #setPSSysCssName}
     * @param pSSysCssName
     */
    @JsonIgnore
    public PSDEChartDTO pssyscssname(String pSSysCssName){
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELID</B>&nbsp;系统动态模型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysDynaModelDTO} 
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
    public PSDEChartDTO pssysdynamodelid(String pSSysDynaModelId){
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
    public PSDEChartDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel){
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
    public PSDEChartDTO pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端扩展插件，指定实体图表使用的前端模板扩展插件，使用插件类型【图表绘制插件】
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysPFPluginDTO} 
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
    public PSDEChartDTO pssyspfpluginid(String pSSysPFPluginId){
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
    public PSDEChartDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin){
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
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端扩展插件，指定实体图表使用的前端模板扩展插件，使用插件类型【图表绘制插件】
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
    public PSDEChartDTO pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    /**
     * <B>PSSYSREQITEMID</B>&nbsp;系统设计需求
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysReqItemDTO} 
     */
    public final static String FIELD_PSSYSREQITEMID = "pssysreqitemid";

    /**
     * 设置 系统设计需求
     * 
     * @param pSSysReqItemId
     * 
     */
    @JsonProperty(FIELD_PSSYSREQITEMID)
    public void setPSSysReqItemId(String pSSysReqItemId){
        this.set(FIELD_PSSYSREQITEMID, pSSysReqItemId);
    }
    
    /**
     * 获取 系统设计需求  
     * @return
     */
    @JsonIgnore
    public String getPSSysReqItemId(){
        Object objValue = this.get(FIELD_PSSYSREQITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统设计需求 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysReqItemIdDirty(){
        if(this.contains(FIELD_PSSYSREQITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统设计需求
     */
    @JsonIgnore
    public void resetPSSysReqItemId(){
        this.reset(FIELD_PSSYSREQITEMID);
    }

    /**
     * 设置 系统设计需求
     * <P>
     * 等同 {@link #setPSSysReqItemId}
     * @param pSSysReqItemId
     */
    @JsonIgnore
    public PSDEChartDTO pssysreqitemid(String pSSysReqItemId){
        this.setPSSysReqItemId(pSSysReqItemId);
        return this;
    }

    /**
     * 设置 系统设计需求，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysReqItemId}
     * @param pSSysReqItem 引用对象
     */
    @JsonIgnore
    public PSDEChartDTO pssysreqitemid(PSSysReqItemDTO pSSysReqItem){
        if(pSSysReqItem == null){
            this.setPSSysReqItemId(null);
            this.setPSSysReqItemName(null);
        }
        else{
            this.setPSSysReqItemId(pSSysReqItem.getPSSysReqItemId());
            this.setPSSysReqItemName(pSSysReqItem.getPSSysReqItemName());
        }
        return this;
    }

    /**
     * <B>PSSYSREQITEMNAME</B>&nbsp;系统设计需求
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSREQITEMID}
     */
    public final static String FIELD_PSSYSREQITEMNAME = "pssysreqitemname";

    /**
     * 设置 系统设计需求
     * 
     * @param pSSysReqItemName
     * 
     */
    @JsonProperty(FIELD_PSSYSREQITEMNAME)
    public void setPSSysReqItemName(String pSSysReqItemName){
        this.set(FIELD_PSSYSREQITEMNAME, pSSysReqItemName);
    }
    
    /**
     * 获取 系统设计需求  
     * @return
     */
    @JsonIgnore
    public String getPSSysReqItemName(){
        Object objValue = this.get(FIELD_PSSYSREQITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统设计需求 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysReqItemNameDirty(){
        if(this.contains(FIELD_PSSYSREQITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统设计需求
     */
    @JsonIgnore
    public void resetPSSysReqItemName(){
        this.reset(FIELD_PSSYSREQITEMNAME);
    }

    /**
     * 设置 系统设计需求
     * <P>
     * 等同 {@link #setPSSysReqItemName}
     * @param pSSysReqItemName
     */
    @JsonIgnore
    public PSDEChartDTO pssysreqitemname(String pSSysReqItemName){
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    /**
     * <B>SHOWLEGEND</B>&nbsp;显示图例，指定图表部件是否显示图例，未定义时为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_SHOWLEGEND = "showlegend";

    /**
     * 设置 显示图例，详细说明：{@link #FIELD_SHOWLEGEND}
     * 
     * @param showLegend
     * 
     */
    @JsonProperty(FIELD_SHOWLEGEND)
    public void setShowLegend(Integer showLegend){
        this.set(FIELD_SHOWLEGEND, showLegend);
    }
    
    /**
     * 获取 显示图例  
     * @return
     */
    @JsonIgnore
    public Integer getShowLegend(){
        Object objValue = this.get(FIELD_SHOWLEGEND);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 显示图例 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isShowLegendDirty(){
        if(this.contains(FIELD_SHOWLEGEND)){
            return true;
        }
        return false;
    }

    /**
     * 重置 显示图例
     */
    @JsonIgnore
    public void resetShowLegend(){
        this.reset(FIELD_SHOWLEGEND);
    }

    /**
     * 设置 显示图例，详细说明：{@link #FIELD_SHOWLEGEND}
     * <P>
     * 等同 {@link #setShowLegend}
     * @param showLegend
     */
    @JsonIgnore
    public PSDEChartDTO showlegend(Integer showLegend){
        this.setShowLegend(showLegend);
        return this;
    }

     /**
     * 设置 显示图例，详细说明：{@link #FIELD_SHOWLEGEND}
     * <P>
     * 等同 {@link #setShowLegend}
     * @param showLegend
     */
    @JsonIgnore
    public PSDEChartDTO showlegend(Boolean showLegend){
        if(showLegend == null){
            this.setShowLegend(null);
        }
        else{
            this.setShowLegend(showLegend?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>SHOWTITLE</B>&nbsp;显示标题，指定图表部件是否显示标题，未定义时为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_SHOWTITLE = "showtitle";

    /**
     * 设置 显示标题，详细说明：{@link #FIELD_SHOWTITLE}
     * 
     * @param showTitle
     * 
     */
    @JsonProperty(FIELD_SHOWTITLE)
    public void setShowTitle(Integer showTitle){
        this.set(FIELD_SHOWTITLE, showTitle);
    }
    
    /**
     * 获取 显示标题  
     * @return
     */
    @JsonIgnore
    public Integer getShowTitle(){
        Object objValue = this.get(FIELD_SHOWTITLE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 显示标题 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isShowTitleDirty(){
        if(this.contains(FIELD_SHOWTITLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 显示标题
     */
    @JsonIgnore
    public void resetShowTitle(){
        this.reset(FIELD_SHOWTITLE);
    }

    /**
     * 设置 显示标题，详细说明：{@link #FIELD_SHOWTITLE}
     * <P>
     * 等同 {@link #setShowTitle}
     * @param showTitle
     */
    @JsonIgnore
    public PSDEChartDTO showtitle(Integer showTitle){
        this.setShowTitle(showTitle);
        return this;
    }

     /**
     * 设置 显示标题，详细说明：{@link #FIELD_SHOWTITLE}
     * <P>
     * 等同 {@link #setShowTitle}
     * @param showTitle
     */
    @JsonIgnore
    public PSDEChartDTO showtitle(Boolean showTitle){
        if(showTitle == null){
            this.setShowTitle(null);
        }
        else{
            this.setShowTitle(showTitle?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>SUBTITLE</B>&nbsp;子标题，指定图表部件的子标题
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_SUBTITLE = "subtitle";

    /**
     * 设置 子标题，详细说明：{@link #FIELD_SUBTITLE}
     * 
     * @param subTitle
     * 
     */
    @JsonProperty(FIELD_SUBTITLE)
    public void setSubTitle(String subTitle){
        this.set(FIELD_SUBTITLE, subTitle);
    }
    
    /**
     * 获取 子标题  
     * @return
     */
    @JsonIgnore
    public String getSubTitle(){
        Object objValue = this.get(FIELD_SUBTITLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 子标题 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSubTitleDirty(){
        if(this.contains(FIELD_SUBTITLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 子标题
     */
    @JsonIgnore
    public void resetSubTitle(){
        this.reset(FIELD_SUBTITLE);
    }

    /**
     * 设置 子标题，详细说明：{@link #FIELD_SUBTITLE}
     * <P>
     * 等同 {@link #setSubTitle}
     * @param subTitle
     */
    @JsonIgnore
    public PSDEChartDTO subtitle(String subTitle){
        this.setSubTitle(subTitle);
        return this;
    }

    /**
     * <B>SUBTITLEPSLANRESID</B>&nbsp;子标题语言资源，指定图表部件的子标题的多语言资源对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSLanguageResDTO} 
     */
    public final static String FIELD_SUBTITLEPSLANRESID = "subtitlepslanresid";

    /**
     * 设置 子标题语言资源，详细说明：{@link #FIELD_SUBTITLEPSLANRESID}
     * 
     * @param subTitlePSLanResId
     * 
     */
    @JsonProperty(FIELD_SUBTITLEPSLANRESID)
    public void setSubTitlePSLanResId(String subTitlePSLanResId){
        this.set(FIELD_SUBTITLEPSLANRESID, subTitlePSLanResId);
    }
    
    /**
     * 获取 子标题语言资源  
     * @return
     */
    @JsonIgnore
    public String getSubTitlePSLanResId(){
        Object objValue = this.get(FIELD_SUBTITLEPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 子标题语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSubTitlePSLanResIdDirty(){
        if(this.contains(FIELD_SUBTITLEPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 子标题语言资源
     */
    @JsonIgnore
    public void resetSubTitlePSLanResId(){
        this.reset(FIELD_SUBTITLEPSLANRESID);
    }

    /**
     * 设置 子标题语言资源，详细说明：{@link #FIELD_SUBTITLEPSLANRESID}
     * <P>
     * 等同 {@link #setSubTitlePSLanResId}
     * @param subTitlePSLanResId
     */
    @JsonIgnore
    public PSDEChartDTO subtitlepslanresid(String subTitlePSLanResId){
        this.setSubTitlePSLanResId(subTitlePSLanResId);
        return this;
    }

    /**
     * 设置 子标题语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setSubTitlePSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSDEChartDTO subtitlepslanresid(PSLanguageResDTO pSLanguageRes){
        if(pSLanguageRes == null){
            this.setSubTitlePSLanResId(null);
            this.setSubTitlePSLanResName(null);
        }
        else{
            this.setSubTitlePSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setSubTitlePSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>SUBTITLEPSLANRESNAME</B>&nbsp;子标题语言资源，指定图表部件的子标题的多语言资源对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_SUBTITLEPSLANRESID}
     */
    public final static String FIELD_SUBTITLEPSLANRESNAME = "subtitlepslanresname";

    /**
     * 设置 子标题语言资源，详细说明：{@link #FIELD_SUBTITLEPSLANRESNAME}
     * 
     * @param subTitlePSLanResName
     * 
     */
    @JsonProperty(FIELD_SUBTITLEPSLANRESNAME)
    public void setSubTitlePSLanResName(String subTitlePSLanResName){
        this.set(FIELD_SUBTITLEPSLANRESNAME, subTitlePSLanResName);
    }
    
    /**
     * 获取 子标题语言资源  
     * @return
     */
    @JsonIgnore
    public String getSubTitlePSLanResName(){
        Object objValue = this.get(FIELD_SUBTITLEPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 子标题语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSubTitlePSLanResNameDirty(){
        if(this.contains(FIELD_SUBTITLEPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 子标题语言资源
     */
    @JsonIgnore
    public void resetSubTitlePSLanResName(){
        this.reset(FIELD_SUBTITLEPSLANRESNAME);
    }

    /**
     * 设置 子标题语言资源，详细说明：{@link #FIELD_SUBTITLEPSLANRESNAME}
     * <P>
     * 等同 {@link #setSubTitlePSLanResName}
     * @param subTitlePSLanResName
     */
    @JsonIgnore
    public PSDEChartDTO subtitlepslanresname(String subTitlePSLanResName){
        this.setSubTitlePSLanResName(subTitlePSLanResName);
        return this;
    }

    /**
     * <B>TITLEPOS</B>&nbsp;标题位置，指定图表部件的标题位置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.ChartTitlePos} 
     */
    public final static String FIELD_TITLEPOS = "titlepos";

    /**
     * 设置 标题位置，详细说明：{@link #FIELD_TITLEPOS}
     * 
     * @param titlePos
     * 
     */
    @JsonProperty(FIELD_TITLEPOS)
    public void setTitlePos(String titlePos){
        this.set(FIELD_TITLEPOS, titlePos);
    }
    
    /**
     * 获取 标题位置  
     * @return
     */
    @JsonIgnore
    public String getTitlePos(){
        Object objValue = this.get(FIELD_TITLEPOS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标题位置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTitlePosDirty(){
        if(this.contains(FIELD_TITLEPOS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题位置
     */
    @JsonIgnore
    public void resetTitlePos(){
        this.reset(FIELD_TITLEPOS);
    }

    /**
     * 设置 标题位置，详细说明：{@link #FIELD_TITLEPOS}
     * <P>
     * 等同 {@link #setTitlePos}
     * @param titlePos
     */
    @JsonIgnore
    public PSDEChartDTO titlepos(String titlePos){
        this.setTitlePos(titlePos);
        return this;
    }

     /**
     * 设置 标题位置，详细说明：{@link #FIELD_TITLEPOS}
     * <P>
     * 等同 {@link #setTitlePos}
     * @param titlePos
     */
    @JsonIgnore
    public PSDEChartDTO titlepos(net.ibizsys.model.PSModelEnums.ChartTitlePos titlePos){
        if(titlePos == null){
            this.setTitlePos(null);
        }
        else{
            this.setTitlePos(titlePos.value);
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
    public PSDEChartDTO updatedate(Timestamp updateDate){
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
    public PSDEChartDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>USERPARAMS</B>&nbsp;自定义参数
     * <P>
     * 字符串：最大长度 2000
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
    public PSDEChartDTO userparams(String userParams){
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
    public PSDEChartDTO usertag(String userTag){
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
    public PSDEChartDTO usertag2(String userTag2){
        this.setUserTag2(userTag2);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSDEChartId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSDEChartId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEChartId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEChartId(strValue);
    }

    @JsonIgnore
    public PSDEChartDTO id(String strValue){
        this.setPSDEChartId(strValue);
        return this;
    }


    /**
     *  实体图表坐标轴 成员集合
     */
    public final static String FIELD_PSDECHARTAXESES = "psdechartaxes";

    private java.util.List<net.ibizsys.centralstudio.dto.PSDEChartAxesDTO> psdechartaxes;

    /**
     * 获取 实体图表坐标轴 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDECHARTAXESES)
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEChartAxesDTO> getPSDEChartAxeses(){
        return this.psdechartaxes;
    }

    /**
     * 设置 实体图表坐标轴 成员集合  
     * @param psdechartaxes
     */
    @JsonProperty(FIELD_PSDECHARTAXESES)
    public void setPSDEChartAxeses(java.util.List<net.ibizsys.centralstudio.dto.PSDEChartAxesDTO> psdechartaxes){
        this.psdechartaxes = psdechartaxes;
    }

    /**
     * 获取 实体图表坐标轴 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEChartAxesDTO> getPSDEChartAxesesIf(){
        if(this.psdechartaxes == null){
            this.psdechartaxes = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSDEChartAxesDTO>();          
        }
        return this.psdechartaxes;
    }


    /**
     *  实体图表数据序列 成员集合
     */
    public final static String FIELD_PSDECHARTPARAMS = "psdechartparams";

    private java.util.List<net.ibizsys.centralstudio.dto.PSDEChartParamDTO> psdechartparams;

    /**
     * 获取 实体图表数据序列 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDECHARTPARAMS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEChartParamDTO> getPSDEChartParams(){
        return this.psdechartparams;
    }

    /**
     * 设置 实体图表数据序列 成员集合  
     * @param psdechartparams
     */
    @JsonProperty(FIELD_PSDECHARTPARAMS)
    public void setPSDEChartParams(java.util.List<net.ibizsys.centralstudio.dto.PSDEChartParamDTO> psdechartparams){
        this.psdechartparams = psdechartparams;
    }

    /**
     * 获取 实体图表数据序列 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEChartParamDTO> getPSDEChartParamsIf(){
        if(this.psdechartparams == null){
            this.psdechartparams = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSDEChartParamDTO>();          
        }
        return this.psdechartparams;
    }


    /**
     *  实体图表逻辑 成员集合
     */
    public final static String FIELD_PSDECHARTLOGICS = "psdechartlogics";

    private java.util.List<net.ibizsys.centralstudio.dto.PSDEChartLogicDTO> psdechartlogics;

    /**
     * 获取 实体图表逻辑 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDECHARTLOGICS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEChartLogicDTO> getPSDEChartLogics(){
        return this.psdechartlogics;
    }

    /**
     * 设置 实体图表逻辑 成员集合  
     * @param psdechartlogics
     */
    @JsonProperty(FIELD_PSDECHARTLOGICS)
    public void setPSDEChartLogics(java.util.List<net.ibizsys.centralstudio.dto.PSDEChartLogicDTO> psdechartlogics){
        this.psdechartlogics = psdechartlogics;
    }

    /**
     * 获取 实体图表逻辑 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEChartLogicDTO> getPSDEChartLogicsIf(){
        if(this.psdechartlogics == null){
            this.psdechartlogics = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSDEChartLogicDTO>();          
        }
        return this.psdechartlogics;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDEChartDTO){
            PSDEChartDTO dto = (PSDEChartDTO)iEntity;
            dto.setPSDEChartAxeses(this.getPSDEChartAxeses());
            dto.setPSDEChartParams(this.getPSDEChartParams());
            dto.setPSDEChartLogics(this.getPSDEChartLogics());
        }
        super.copyTo(iEntity);
    }
}
