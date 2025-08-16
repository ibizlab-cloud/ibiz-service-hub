package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDETREECOL</B>实体树表格列 模型传输对象
 * <P>
 * 实体树视图表格列模型，支持定义属性列及操作列
 */
public class PSDETreeCol extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDETreeCol(){
    }      

    /**
     * <B>ALIGN</B>&nbsp;水平对齐，指定树表格列的水平对齐方式，未定义时操作列为【右对齐】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.GridColAlign} 
     */
    public final static String FIELD_ALIGN = "align";

    /**
     * 设置 水平对齐，详细说明：{@link #FIELD_ALIGN}
     * 
     * @param align
     * 
     */
    @JsonProperty(FIELD_ALIGN)
    public void setAlign(String align){
        this.set(FIELD_ALIGN, align);
    }
    
    /**
     * 获取 水平对齐  
     * @return
     */
    @JsonIgnore
    public String getAlign(){
        Object objValue = this.get(FIELD_ALIGN);
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
    public boolean isAlignDirty(){
        if(this.contains(FIELD_ALIGN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 水平对齐
     */
    @JsonIgnore
    public void resetAlign(){
        this.reset(FIELD_ALIGN);
    }

    /**
     * 设置 水平对齐，详细说明：{@link #FIELD_ALIGN}
     * <P>
     * 等同 {@link #setAlign}
     * @param align
     */
    @JsonIgnore
    public PSDETreeCol align(String align){
        this.setAlign(align);
        return this;
    }

     /**
     * 设置 水平对齐，详细说明：{@link #FIELD_ALIGN}
     * <P>
     * 等同 {@link #setAlign}
     * @param align
     */
    @JsonIgnore
    public PSDETreeCol align(net.ibizsys.psmodel.core.util.PSModelEnums.GridColAlign align){
        if(align == null){
            this.setAlign(null);
        }
        else{
            this.setAlign(align.value);
        }
        return this;
    }

    /**
     * <B>CAPPSLANRESID</B>&nbsp;标题语言资源，指定树表格列的标题的多语言资源对象
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
    public PSDETreeCol cappslanresid(String capPSLanResId){
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
    public PSDETreeCol cappslanresid(PSLanguageRes pSLanguageRes){
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
     * <B>CAPPSLANRESNAME</B>&nbsp;标题语言资源，指定树表格列的标题的多语言资源对象
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
    public PSDETreeCol cappslanresname(String capPSLanResName){
        this.setCapPSLanResName(capPSLanResName);
        return this;
    }

    /**
     * <B>CAPTION</B>&nbsp;标题，指定树表格列的标题
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
    public PSDETreeCol caption(String caption){
        this.setCaption(caption);
        return this;
    }

    /**
     * <B>CELLPSSYSCSSID</B>&nbsp;单元格样式，指定树表格列单元格的界面样式表对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCss} 
     */
    public final static String FIELD_CELLPSSYSCSSID = "cellpssyscssid";

    /**
     * 设置 单元格样式，详细说明：{@link #FIELD_CELLPSSYSCSSID}
     * 
     * @param cellPSSysCssId
     * 
     */
    @JsonProperty(FIELD_CELLPSSYSCSSID)
    public void setCellPSSysCssId(String cellPSSysCssId){
        this.set(FIELD_CELLPSSYSCSSID, cellPSSysCssId);
    }
    
    /**
     * 获取 单元格样式  
     * @return
     */
    @JsonIgnore
    public String getCellPSSysCssId(){
        Object objValue = this.get(FIELD_CELLPSSYSCSSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 单元格样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCellPSSysCssIdDirty(){
        if(this.contains(FIELD_CELLPSSYSCSSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 单元格样式
     */
    @JsonIgnore
    public void resetCellPSSysCssId(){
        this.reset(FIELD_CELLPSSYSCSSID);
    }

    /**
     * 设置 单元格样式，详细说明：{@link #FIELD_CELLPSSYSCSSID}
     * <P>
     * 等同 {@link #setCellPSSysCssId}
     * @param cellPSSysCssId
     */
    @JsonIgnore
    public PSDETreeCol cellpssyscssid(String cellPSSysCssId){
        this.setCellPSSysCssId(cellPSSysCssId);
        return this;
    }

    /**
     * 设置 单元格样式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setCellPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSDETreeCol cellpssyscssid(PSSysCss pSSysCss){
        if(pSSysCss == null){
            this.setCellPSSysCssId(null);
            this.setCellPSSysCssName(null);
        }
        else{
            this.setCellPSSysCssId(pSSysCss.getPSSysCssId());
            this.setCellPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    /**
     * <B>CELLPSSYSCSSNAME</B>&nbsp;单元格样式表，指定树表格列单元格的界面样式表对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CELLPSSYSCSSID}
     */
    public final static String FIELD_CELLPSSYSCSSNAME = "cellpssyscssname";

    /**
     * 设置 单元格样式表，详细说明：{@link #FIELD_CELLPSSYSCSSNAME}
     * 
     * @param cellPSSysCssName
     * 
     */
    @JsonProperty(FIELD_CELLPSSYSCSSNAME)
    public void setCellPSSysCssName(String cellPSSysCssName){
        this.set(FIELD_CELLPSSYSCSSNAME, cellPSSysCssName);
    }
    
    /**
     * 获取 单元格样式表  
     * @return
     */
    @JsonIgnore
    public String getCellPSSysCssName(){
        Object objValue = this.get(FIELD_CELLPSSYSCSSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 单元格样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCellPSSysCssNameDirty(){
        if(this.contains(FIELD_CELLPSSYSCSSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 单元格样式表
     */
    @JsonIgnore
    public void resetCellPSSysCssName(){
        this.reset(FIELD_CELLPSSYSCSSNAME);
    }

    /**
     * 设置 单元格样式表，详细说明：{@link #FIELD_CELLPSSYSCSSNAME}
     * <P>
     * 等同 {@link #setCellPSSysCssName}
     * @param cellPSSysCssName
     */
    @JsonIgnore
    public PSDETreeCol cellpssyscssname(String cellPSSysCssName){
        this.setCellPSSysCssName(cellPSSysCssName);
        return this;
    }

    /**
     * <B>COLENABLEFILTER</B>&nbsp;启用列过滤器
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEGridColLinkMode} 
     */
    public final static String FIELD_COLENABLEFILTER = "colenablefilter";

    /**
     * 设置 启用列过滤器
     * 
     * @param colEnableFilter
     * 
     */
    @JsonProperty(FIELD_COLENABLEFILTER)
    public void setColEnableFilter(Integer colEnableFilter){
        this.set(FIELD_COLENABLEFILTER, colEnableFilter);
    }
    
    /**
     * 获取 启用列过滤器  
     * @return
     */
    @JsonIgnore
    public Integer getColEnableFilter(){
        Object objValue = this.get(FIELD_COLENABLEFILTER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用列过滤器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isColEnableFilterDirty(){
        if(this.contains(FIELD_COLENABLEFILTER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用列过滤器
     */
    @JsonIgnore
    public void resetColEnableFilter(){
        this.reset(FIELD_COLENABLEFILTER);
    }

    /**
     * 设置 启用列过滤器
     * <P>
     * 等同 {@link #setColEnableFilter}
     * @param colEnableFilter
     */
    @JsonIgnore
    public PSDETreeCol colenablefilter(Integer colEnableFilter){
        this.setColEnableFilter(colEnableFilter);
        return this;
    }

     /**
     * 设置 启用列过滤器
     * <P>
     * 等同 {@link #setColEnableFilter}
     * @param colEnableFilter
     */
    @JsonIgnore
    public PSDETreeCol colenablefilter(net.ibizsys.psmodel.core.util.PSModelEnums.DEGridColLinkMode colEnableFilter){
        if(colEnableFilter == null){
            this.setColEnableFilter(null);
        }
        else{
            this.setColEnableFilter(colEnableFilter.value);
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
    public PSDETreeCol createdate(String createDate){
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
    public PSDETreeCol createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DEFAULTVALUE</B>&nbsp;默认值，指定树表格列的默认值，树节点未提供列需要的数据项时使用
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_DEFAULTVALUE = "defaultvalue";

    /**
     * 设置 默认值，详细说明：{@link #FIELD_DEFAULTVALUE}
     * 
     * @param defaultValue
     * 
     */
    @JsonProperty(FIELD_DEFAULTVALUE)
    public void setDefaultValue(String defaultValue){
        this.set(FIELD_DEFAULTVALUE, defaultValue);
    }
    
    /**
     * 获取 默认值  
     * @return
     */
    @JsonIgnore
    public String getDefaultValue(){
        Object objValue = this.get(FIELD_DEFAULTVALUE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefaultValueDirty(){
        if(this.contains(FIELD_DEFAULTVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认值
     */
    @JsonIgnore
    public void resetDefaultValue(){
        this.reset(FIELD_DEFAULTVALUE);
    }

    /**
     * 设置 默认值，详细说明：{@link #FIELD_DEFAULTVALUE}
     * <P>
     * 等同 {@link #setDefaultValue}
     * @param defaultValue
     */
    @JsonIgnore
    public PSDETreeCol defaultvalue(String defaultValue){
        this.setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <B>ENABLELINK</B>&nbsp;启用链接
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEGridColLinkMode} 
     */
    public final static String FIELD_ENABLELINK = "enablelink";

    /**
     * 设置 启用链接
     * 
     * @param enableLink
     * 
     */
    @JsonProperty(FIELD_ENABLELINK)
    public void setEnableLink(Integer enableLink){
        this.set(FIELD_ENABLELINK, enableLink);
    }
    
    /**
     * 获取 启用链接  
     * @return
     */
    @JsonIgnore
    public Integer getEnableLink(){
        Object objValue = this.get(FIELD_ENABLELINK);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用链接 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableLinkDirty(){
        if(this.contains(FIELD_ENABLELINK)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用链接
     */
    @JsonIgnore
    public void resetEnableLink(){
        this.reset(FIELD_ENABLELINK);
    }

    /**
     * 设置 启用链接
     * <P>
     * 等同 {@link #setEnableLink}
     * @param enableLink
     */
    @JsonIgnore
    public PSDETreeCol enablelink(Integer enableLink){
        this.setEnableLink(enableLink);
        return this;
    }

     /**
     * 设置 启用链接
     * <P>
     * 等同 {@link #setEnableLink}
     * @param enableLink
     */
    @JsonIgnore
    public PSDETreeCol enablelink(net.ibizsys.psmodel.core.util.PSModelEnums.DEGridColLinkMode enableLink){
        if(enableLink == null){
            this.setEnableLink(null);
        }
        else{
            this.setEnableLink(enableLink.value);
        }
        return this;
    }

    /**
     * <B>GCRPSSYSPFPLUGINID</B>&nbsp;表格列绘制器插件，指定表格列绘制器插件使用的前端模板扩展插件，使用插件类型【数据表格列绘制插件】
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysPFPlugin} 
     */
    public final static String FIELD_GCRPSSYSPFPLUGINID = "gcrpssyspfpluginid";

    /**
     * 设置 表格列绘制器插件，详细说明：{@link #FIELD_GCRPSSYSPFPLUGINID}
     * 
     * @param gCRPSSysPFPluginId
     * 
     */
    @JsonProperty(FIELD_GCRPSSYSPFPLUGINID)
    public void setGCRPSSysPFPluginId(String gCRPSSysPFPluginId){
        this.set(FIELD_GCRPSSYSPFPLUGINID, gCRPSSysPFPluginId);
    }
    
    /**
     * 获取 表格列绘制器插件  
     * @return
     */
    @JsonIgnore
    public String getGCRPSSysPFPluginId(){
        Object objValue = this.get(FIELD_GCRPSSYSPFPLUGINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表格列绘制器插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGCRPSSysPFPluginIdDirty(){
        if(this.contains(FIELD_GCRPSSYSPFPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表格列绘制器插件
     */
    @JsonIgnore
    public void resetGCRPSSysPFPluginId(){
        this.reset(FIELD_GCRPSSYSPFPLUGINID);
    }

    /**
     * 设置 表格列绘制器插件，详细说明：{@link #FIELD_GCRPSSYSPFPLUGINID}
     * <P>
     * 等同 {@link #setGCRPSSysPFPluginId}
     * @param gCRPSSysPFPluginId
     */
    @JsonIgnore
    public PSDETreeCol gcrpssyspfpluginid(String gCRPSSysPFPluginId){
        this.setGCRPSSysPFPluginId(gCRPSSysPFPluginId);
        return this;
    }

    /**
     * 设置 表格列绘制器插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setGCRPSSysPFPluginId}
     * @param pSSysPFPlugin 引用对象
     */
    @JsonIgnore
    public PSDETreeCol gcrpssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
        if(pSSysPFPlugin == null){
            this.setGCRPSSysPFPluginId(null);
            this.setGCRPSSysPFPluginName(null);
        }
        else{
            this.setGCRPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setGCRPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    /**
     * <B>GCRPSSYSPFPLUGINNAME</B>&nbsp;表格列绘制器插件，指定表格列绘制器插件使用的前端模板扩展插件，使用插件类型【数据表格列绘制插件】
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GCRPSSYSPFPLUGINID}
     */
    public final static String FIELD_GCRPSSYSPFPLUGINNAME = "gcrpssyspfpluginname";

    /**
     * 设置 表格列绘制器插件，详细说明：{@link #FIELD_GCRPSSYSPFPLUGINNAME}
     * 
     * @param gCRPSSysPFPluginName
     * 
     */
    @JsonProperty(FIELD_GCRPSSYSPFPLUGINNAME)
    public void setGCRPSSysPFPluginName(String gCRPSSysPFPluginName){
        this.set(FIELD_GCRPSSYSPFPLUGINNAME, gCRPSSysPFPluginName);
    }
    
    /**
     * 获取 表格列绘制器插件  
     * @return
     */
    @JsonIgnore
    public String getGCRPSSysPFPluginName(){
        Object objValue = this.get(FIELD_GCRPSSYSPFPLUGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表格列绘制器插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGCRPSSysPFPluginNameDirty(){
        if(this.contains(FIELD_GCRPSSYSPFPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表格列绘制器插件
     */
    @JsonIgnore
    public void resetGCRPSSysPFPluginName(){
        this.reset(FIELD_GCRPSSYSPFPLUGINNAME);
    }

    /**
     * 设置 表格列绘制器插件，详细说明：{@link #FIELD_GCRPSSYSPFPLUGINNAME}
     * <P>
     * 等同 {@link #setGCRPSSysPFPluginName}
     * @param gCRPSSysPFPluginName
     */
    @JsonIgnore
    public PSDETreeCol gcrpssyspfpluginname(String gCRPSSysPFPluginName){
        this.setGCRPSSysPFPluginName(gCRPSSysPFPluginName);
        return this;
    }

    /**
     * <B>GRIDCOLSTYLE</B>&nbsp;表格列样式，指定树表格列的样式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.GridColStype} 
     */
    public final static String FIELD_GRIDCOLSTYLE = "gridcolstyle";

    /**
     * 设置 表格列样式，详细说明：{@link #FIELD_GRIDCOLSTYLE}
     * 
     * @param gridColStyle
     * 
     */
    @JsonProperty(FIELD_GRIDCOLSTYLE)
    public void setGridColStyle(String gridColStyle){
        this.set(FIELD_GRIDCOLSTYLE, gridColStyle);
    }
    
    /**
     * 获取 表格列样式  
     * @return
     */
    @JsonIgnore
    public String getGridColStyle(){
        Object objValue = this.get(FIELD_GRIDCOLSTYLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表格列样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGridColStyleDirty(){
        if(this.contains(FIELD_GRIDCOLSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表格列样式
     */
    @JsonIgnore
    public void resetGridColStyle(){
        this.reset(FIELD_GRIDCOLSTYLE);
    }

    /**
     * 设置 表格列样式，详细说明：{@link #FIELD_GRIDCOLSTYLE}
     * <P>
     * 等同 {@link #setGridColStyle}
     * @param gridColStyle
     */
    @JsonIgnore
    public PSDETreeCol gridcolstyle(String gridColStyle){
        this.setGridColStyle(gridColStyle);
        return this;
    }

     /**
     * 设置 表格列样式，详细说明：{@link #FIELD_GRIDCOLSTYLE}
     * <P>
     * 等同 {@link #setGridColStyle}
     * @param gridColStyle
     */
    @JsonIgnore
    public PSDETreeCol gridcolstyle(net.ibizsys.psmodel.core.util.PSModelEnums.GridColStype gridColStyle){
        if(gridColStyle == null){
            this.setGridColStyle(null);
        }
        else{
            this.setGridColStyle(gridColStyle.value);
        }
        return this;
    }

    /**
     * <B>GRIDCOLTYPE</B>&nbsp;列类型，指定树表格列的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.TreeColType} 
     */
    public final static String FIELD_GRIDCOLTYPE = "gridcoltype";

    /**
     * 设置 列类型，详细说明：{@link #FIELD_GRIDCOLTYPE}
     * 
     * @param gridColType
     * 
     */
    @JsonProperty(FIELD_GRIDCOLTYPE)
    public void setGridColType(String gridColType){
        this.set(FIELD_GRIDCOLTYPE, gridColType);
    }
    
    /**
     * 获取 列类型  
     * @return
     */
    @JsonIgnore
    public String getGridColType(){
        Object objValue = this.get(FIELD_GRIDCOLTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 列类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGridColTypeDirty(){
        if(this.contains(FIELD_GRIDCOLTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 列类型
     */
    @JsonIgnore
    public void resetGridColType(){
        this.reset(FIELD_GRIDCOLTYPE);
    }

    /**
     * 设置 列类型，详细说明：{@link #FIELD_GRIDCOLTYPE}
     * <P>
     * 等同 {@link #setGridColType}
     * @param gridColType
     */
    @JsonIgnore
    public PSDETreeCol gridcoltype(String gridColType){
        this.setGridColType(gridColType);
        return this;
    }

     /**
     * 设置 列类型，详细说明：{@link #FIELD_GRIDCOLTYPE}
     * <P>
     * 等同 {@link #setGridColType}
     * @param gridColType
     */
    @JsonIgnore
    public PSDETreeCol gridcoltype(net.ibizsys.psmodel.core.util.PSModelEnums.TreeColType gridColType){
        if(gridColType == null){
            this.setGridColType(null);
        }
        else{
            this.setGridColType(gridColType.value);
        }
        return this;
    }

    /**
     * <B>HEADERPSSYSCSSID</B>&nbsp;头部样式，指定树表格列头部的界面样式表对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCss} 
     */
    public final static String FIELD_HEADERPSSYSCSSID = "headerpssyscssid";

    /**
     * 设置 头部样式，详细说明：{@link #FIELD_HEADERPSSYSCSSID}
     * 
     * @param headerPSSysCssId
     * 
     */
    @JsonProperty(FIELD_HEADERPSSYSCSSID)
    public void setHeaderPSSysCssId(String headerPSSysCssId){
        this.set(FIELD_HEADERPSSYSCSSID, headerPSSysCssId);
    }
    
    /**
     * 获取 头部样式  
     * @return
     */
    @JsonIgnore
    public String getHeaderPSSysCssId(){
        Object objValue = this.get(FIELD_HEADERPSSYSCSSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 头部样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHeaderPSSysCssIdDirty(){
        if(this.contains(FIELD_HEADERPSSYSCSSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 头部样式
     */
    @JsonIgnore
    public void resetHeaderPSSysCssId(){
        this.reset(FIELD_HEADERPSSYSCSSID);
    }

    /**
     * 设置 头部样式，详细说明：{@link #FIELD_HEADERPSSYSCSSID}
     * <P>
     * 等同 {@link #setHeaderPSSysCssId}
     * @param headerPSSysCssId
     */
    @JsonIgnore
    public PSDETreeCol headerpssyscssid(String headerPSSysCssId){
        this.setHeaderPSSysCssId(headerPSSysCssId);
        return this;
    }

    /**
     * 设置 头部样式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setHeaderPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSDETreeCol headerpssyscssid(PSSysCss pSSysCss){
        if(pSSysCss == null){
            this.setHeaderPSSysCssId(null);
            this.setHeaderPSSysCssName(null);
        }
        else{
            this.setHeaderPSSysCssId(pSSysCss.getPSSysCssId());
            this.setHeaderPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    /**
     * <B>HEADERPSSYSCSSNAME</B>&nbsp;头部样式表，指定树表格列头部的界面样式表对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_HEADERPSSYSCSSID}
     */
    public final static String FIELD_HEADERPSSYSCSSNAME = "headerpssyscssname";

    /**
     * 设置 头部样式表，详细说明：{@link #FIELD_HEADERPSSYSCSSNAME}
     * 
     * @param headerPSSysCssName
     * 
     */
    @JsonProperty(FIELD_HEADERPSSYSCSSNAME)
    public void setHeaderPSSysCssName(String headerPSSysCssName){
        this.set(FIELD_HEADERPSSYSCSSNAME, headerPSSysCssName);
    }
    
    /**
     * 获取 头部样式表  
     * @return
     */
    @JsonIgnore
    public String getHeaderPSSysCssName(){
        Object objValue = this.get(FIELD_HEADERPSSYSCSSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 头部样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHeaderPSSysCssNameDirty(){
        if(this.contains(FIELD_HEADERPSSYSCSSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 头部样式表
     */
    @JsonIgnore
    public void resetHeaderPSSysCssName(){
        this.reset(FIELD_HEADERPSSYSCSSNAME);
    }

    /**
     * 设置 头部样式表，详细说明：{@link #FIELD_HEADERPSSYSCSSNAME}
     * <P>
     * 等同 {@link #setHeaderPSSysCssName}
     * @param headerPSSysCssName
     */
    @JsonIgnore
    public PSDETreeCol headerpssyscssname(String headerPSSysCssName){
        this.setHeaderPSSysCssName(headerPSSysCssName);
        return this;
    }

    /**
     * <B>HIDEDEFAULT</B>&nbsp;默认隐藏，指定树表格列是否默认隐藏，需要用户选择输出。未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEGridColHideMode} 
     */
    public final static String FIELD_HIDEDEFAULT = "hidedefault";

    /**
     * 设置 默认隐藏，详细说明：{@link #FIELD_HIDEDEFAULT}
     * 
     * @param hideDefault
     * 
     */
    @JsonProperty(FIELD_HIDEDEFAULT)
    public void setHideDefault(Integer hideDefault){
        this.set(FIELD_HIDEDEFAULT, hideDefault);
    }
    
    /**
     * 获取 默认隐藏  
     * @return
     */
    @JsonIgnore
    public Integer getHideDefault(){
        Object objValue = this.get(FIELD_HIDEDEFAULT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认隐藏 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHideDefaultDirty(){
        if(this.contains(FIELD_HIDEDEFAULT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认隐藏
     */
    @JsonIgnore
    public void resetHideDefault(){
        this.reset(FIELD_HIDEDEFAULT);
    }

    /**
     * 设置 默认隐藏，详细说明：{@link #FIELD_HIDEDEFAULT}
     * <P>
     * 等同 {@link #setHideDefault}
     * @param hideDefault
     */
    @JsonIgnore
    public PSDETreeCol hidedefault(Integer hideDefault){
        this.setHideDefault(hideDefault);
        return this;
    }

     /**
     * 设置 默认隐藏，详细说明：{@link #FIELD_HIDEDEFAULT}
     * <P>
     * 等同 {@link #setHideDefault}
     * @param hideDefault
     */
    @JsonIgnore
    public PSDETreeCol hidedefault(net.ibizsys.psmodel.core.util.PSModelEnums.DEGridColHideMode hideDefault){
        if(hideDefault == null){
            this.setHideDefault(null);
        }
        else{
            this.setHideDefault(hideDefault.value);
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
    public PSDETreeCol memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>NOPRIVDM</B>&nbsp;无权限显示模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.NoPrivDisplayMode} 
     */
    public final static String FIELD_NOPRIVDM = "noprivdm";

    /**
     * 设置 无权限显示模式
     * 
     * @param noPrivDM
     * 
     */
    @JsonProperty(FIELD_NOPRIVDM)
    public void setNoPrivDM(Integer noPrivDM){
        this.set(FIELD_NOPRIVDM, noPrivDM);
    }
    
    /**
     * 获取 无权限显示模式  
     * @return
     */
    @JsonIgnore
    public Integer getNoPrivDM(){
        Object objValue = this.get(FIELD_NOPRIVDM);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 无权限显示模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNoPrivDMDirty(){
        if(this.contains(FIELD_NOPRIVDM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 无权限显示模式
     */
    @JsonIgnore
    public void resetNoPrivDM(){
        this.reset(FIELD_NOPRIVDM);
    }

    /**
     * 设置 无权限显示模式
     * <P>
     * 等同 {@link #setNoPrivDM}
     * @param noPrivDM
     */
    @JsonIgnore
    public PSDETreeCol noprivdm(Integer noPrivDM){
        this.setNoPrivDM(noPrivDM);
        return this;
    }

     /**
     * 设置 无权限显示模式
     * <P>
     * 等同 {@link #setNoPrivDM}
     * @param noPrivDM
     */
    @JsonIgnore
    public PSDETreeCol noprivdm(net.ibizsys.psmodel.core.util.PSModelEnums.NoPrivDisplayMode noPrivDM){
        if(noPrivDM == null){
            this.setNoPrivDM(null);
        }
        else{
            this.setNoPrivDM(noPrivDM.value);
        }
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;显示次序，指定树表格列的显示次序
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
    public PSDETreeCol ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSCODELISTID</B>&nbsp;系统代码表，指定树表格列绑定的代码表对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSCodeList} 
     */
    public final static String FIELD_PSCODELISTID = "pscodelistid";

    /**
     * 设置 系统代码表，详细说明：{@link #FIELD_PSCODELISTID}
     * 
     * @param pSCodeListId
     * 
     */
    @JsonProperty(FIELD_PSCODELISTID)
    public void setPSCodeListId(String pSCodeListId){
        this.set(FIELD_PSCODELISTID, pSCodeListId);
    }
    
    /**
     * 获取 系统代码表  
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
     * 判断 系统代码表 是否指定值，包括空值
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
     * 重置 系统代码表
     */
    @JsonIgnore
    public void resetPSCodeListId(){
        this.reset(FIELD_PSCODELISTID);
    }

    /**
     * 设置 系统代码表，详细说明：{@link #FIELD_PSCODELISTID}
     * <P>
     * 等同 {@link #setPSCodeListId}
     * @param pSCodeListId
     */
    @JsonIgnore
    public PSDETreeCol pscodelistid(String pSCodeListId){
        this.setPSCodeListId(pSCodeListId);
        return this;
    }

    /**
     * 设置 系统代码表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSCodeListId}
     * @param pSCodeList 引用对象
     */
    @JsonIgnore
    public PSDETreeCol pscodelistid(PSCodeList pSCodeList){
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
     * <B>PSCODELISTNAME</B>&nbsp;系统代码表，指定树表格列绑定的代码表对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCODELISTID}
     */
    public final static String FIELD_PSCODELISTNAME = "pscodelistname";

    /**
     * 设置 系统代码表，详细说明：{@link #FIELD_PSCODELISTNAME}
     * 
     * @param pSCodeListName
     * 
     */
    @JsonProperty(FIELD_PSCODELISTNAME)
    public void setPSCodeListName(String pSCodeListName){
        this.set(FIELD_PSCODELISTNAME, pSCodeListName);
    }
    
    /**
     * 获取 系统代码表  
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
     * 判断 系统代码表 是否指定值，包括空值
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
     * 重置 系统代码表
     */
    @JsonIgnore
    public void resetPSCodeListName(){
        this.reset(FIELD_PSCODELISTNAME);
    }

    /**
     * 设置 系统代码表，详细说明：{@link #FIELD_PSCODELISTNAME}
     * <P>
     * 等同 {@link #setPSCodeListName}
     * @param pSCodeListName
     */
    @JsonIgnore
    public PSDETreeCol pscodelistname(String pSCodeListName){
        this.setPSCodeListName(pSCodeListName);
        return this;
    }

    /**
     * <B>PSDETREECOLID</B>&nbsp;实体树表格列标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDETREECOLID = "psdetreecolid";

    /**
     * 设置 实体树表格列标识
     * 
     * @param pSDETreeColId
     * 
     */
    @JsonProperty(FIELD_PSDETREECOLID)
    public void setPSDETreeColId(String pSDETreeColId){
        this.set(FIELD_PSDETREECOLID, pSDETreeColId);
    }
    
    /**
     * 获取 实体树表格列标识  
     * @return
     */
    @JsonIgnore
    public String getPSDETreeColId(){
        Object objValue = this.get(FIELD_PSDETREECOLID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体树表格列标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDETreeColIdDirty(){
        if(this.contains(FIELD_PSDETREECOLID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体树表格列标识
     */
    @JsonIgnore
    public void resetPSDETreeColId(){
        this.reset(FIELD_PSDETREECOLID);
    }

    /**
     * 设置 实体树表格列标识
     * <P>
     * 等同 {@link #setPSDETreeColId}
     * @param pSDETreeColId
     */
    @JsonIgnore
    public PSDETreeCol psdetreecolid(String pSDETreeColId){
        this.setPSDETreeColId(pSDETreeColId);
        return this;
    }

    /**
     * <B>PSDETREECOLNAME</B>&nbsp;树表格列标识，指定树表格列的标识，需在所在的树视图中具备唯一性
     * <P>
     * 字符串：最大长度 30，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSDETREECOLNAME = "psdetreecolname";

    /**
     * 设置 树表格列标识，详细说明：{@link #FIELD_PSDETREECOLNAME}
     * 
     * @param pSDETreeColName
     * 
     */
    @JsonProperty(FIELD_PSDETREECOLNAME)
    public void setPSDETreeColName(String pSDETreeColName){
        this.set(FIELD_PSDETREECOLNAME, pSDETreeColName);
    }
    
    /**
     * 获取 树表格列标识  
     * @return
     */
    @JsonIgnore
    public String getPSDETreeColName(){
        Object objValue = this.get(FIELD_PSDETREECOLNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 树表格列标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDETreeColNameDirty(){
        if(this.contains(FIELD_PSDETREECOLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 树表格列标识
     */
    @JsonIgnore
    public void resetPSDETreeColName(){
        this.reset(FIELD_PSDETREECOLNAME);
    }

    /**
     * 设置 树表格列标识，详细说明：{@link #FIELD_PSDETREECOLNAME}
     * <P>
     * 等同 {@link #setPSDETreeColName}
     * @param pSDETreeColName
     */
    @JsonIgnore
    public PSDETreeCol psdetreecolname(String pSDETreeColName){
        this.setPSDETreeColName(pSDETreeColName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDETreeColName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDETreeColName(strName);
    }

    @JsonIgnore
    public PSDETreeCol name(String strName){
        this.setPSDETreeColName(strName);
        return this;
    }

    /**
     * <B>PSDETREEVIEWID</B>&nbsp;实体树视图，指定树表格列所在的树视图对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDETreeView} 
     */
    public final static String FIELD_PSDETREEVIEWID = "psdetreeviewid";

    /**
     * 设置 实体树视图，详细说明：{@link #FIELD_PSDETREEVIEWID}
     * 
     * @param pSDETreeViewId
     * 
     */
    @JsonProperty(FIELD_PSDETREEVIEWID)
    public void setPSDETreeViewId(String pSDETreeViewId){
        this.set(FIELD_PSDETREEVIEWID, pSDETreeViewId);
    }
    
    /**
     * 获取 实体树视图  
     * @return
     */
    @JsonIgnore
    public String getPSDETreeViewId(){
        Object objValue = this.get(FIELD_PSDETREEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体树视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDETreeViewIdDirty(){
        if(this.contains(FIELD_PSDETREEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体树视图
     */
    @JsonIgnore
    public void resetPSDETreeViewId(){
        this.reset(FIELD_PSDETREEVIEWID);
    }

    /**
     * 设置 实体树视图，详细说明：{@link #FIELD_PSDETREEVIEWID}
     * <P>
     * 等同 {@link #setPSDETreeViewId}
     * @param pSDETreeViewId
     */
    @JsonIgnore
    public PSDETreeCol psdetreeviewid(String pSDETreeViewId){
        this.setPSDETreeViewId(pSDETreeViewId);
        return this;
    }

    /**
     * 设置 实体树视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDETreeViewId}
     * @param pSDETreeView 引用对象
     */
    @JsonIgnore
    public PSDETreeCol psdetreeviewid(PSDETreeView pSDETreeView){
        if(pSDETreeView == null){
            this.setPSDETreeViewId(null);
            this.setPSDETreeViewName(null);
        }
        else{
            this.setPSDETreeViewId(pSDETreeView.getPSDETreeViewId());
            this.setPSDETreeViewName(pSDETreeView.getPSDETreeViewName());
        }
        return this;
    }

    /**
     * <B>PSDETREEVIEWNAME</B>&nbsp;实体树视图，指定树表格列所在的树视图对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDETREEVIEWID}
     */
    public final static String FIELD_PSDETREEVIEWNAME = "psdetreeviewname";

    /**
     * 设置 实体树视图，详细说明：{@link #FIELD_PSDETREEVIEWNAME}
     * 
     * @param pSDETreeViewName
     * 
     */
    @JsonProperty(FIELD_PSDETREEVIEWNAME)
    public void setPSDETreeViewName(String pSDETreeViewName){
        this.set(FIELD_PSDETREEVIEWNAME, pSDETreeViewName);
    }
    
    /**
     * 获取 实体树视图  
     * @return
     */
    @JsonIgnore
    public String getPSDETreeViewName(){
        Object objValue = this.get(FIELD_PSDETREEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体树视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDETreeViewNameDirty(){
        if(this.contains(FIELD_PSDETREEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体树视图
     */
    @JsonIgnore
    public void resetPSDETreeViewName(){
        this.reset(FIELD_PSDETREEVIEWNAME);
    }

    /**
     * 设置 实体树视图，详细说明：{@link #FIELD_PSDETREEVIEWNAME}
     * <P>
     * 等同 {@link #setPSDETreeViewName}
     * @param pSDETreeViewName
     */
    @JsonIgnore
    public PSDETreeCol psdetreeviewname(String pSDETreeViewName){
        this.setPSDETreeViewName(pSDETreeViewName);
        return this;
    }

    /**
     * <B>PSDEUAGROUPID</B>&nbsp;界面行为组，指定树表格操作列绑定的界面行为组对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEUAGroup} 
     */
    public final static String FIELD_PSDEUAGROUPID = "psdeuagroupid";

    /**
     * 设置 界面行为组，详细说明：{@link #FIELD_PSDEUAGROUPID}
     * 
     * @param pSDEUAGroupId
     * 
     */
    @JsonProperty(FIELD_PSDEUAGROUPID)
    public void setPSDEUAGroupId(String pSDEUAGroupId){
        this.set(FIELD_PSDEUAGROUPID, pSDEUAGroupId);
    }
    
    /**
     * 获取 界面行为组  
     * @return
     */
    @JsonIgnore
    public String getPSDEUAGroupId(){
        Object objValue = this.get(FIELD_PSDEUAGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面行为组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEUAGroupIdDirty(){
        if(this.contains(FIELD_PSDEUAGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面行为组
     */
    @JsonIgnore
    public void resetPSDEUAGroupId(){
        this.reset(FIELD_PSDEUAGROUPID);
    }

    /**
     * 设置 界面行为组，详细说明：{@link #FIELD_PSDEUAGROUPID}
     * <P>
     * 等同 {@link #setPSDEUAGroupId}
     * @param pSDEUAGroupId
     */
    @JsonIgnore
    public PSDETreeCol psdeuagroupid(String pSDEUAGroupId){
        this.setPSDEUAGroupId(pSDEUAGroupId);
        return this;
    }

    /**
     * 设置 界面行为组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEUAGroupId}
     * @param pSDEUAGroup 引用对象
     */
    @JsonIgnore
    public PSDETreeCol psdeuagroupid(PSDEUAGroup pSDEUAGroup){
        if(pSDEUAGroup == null){
            this.setPSDEUAGroupId(null);
            this.setPSDEUAGroupName(null);
        }
        else{
            this.setPSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setPSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    /**
     * <B>PSDEUAGROUPNAME</B>&nbsp;界面行为组，指定树表格操作列绑定的界面行为组对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEUAGROUPID}
     */
    public final static String FIELD_PSDEUAGROUPNAME = "psdeuagroupname";

    /**
     * 设置 界面行为组，详细说明：{@link #FIELD_PSDEUAGROUPNAME}
     * 
     * @param pSDEUAGroupName
     * 
     */
    @JsonProperty(FIELD_PSDEUAGROUPNAME)
    public void setPSDEUAGroupName(String pSDEUAGroupName){
        this.set(FIELD_PSDEUAGROUPNAME, pSDEUAGroupName);
    }
    
    /**
     * 获取 界面行为组  
     * @return
     */
    @JsonIgnore
    public String getPSDEUAGroupName(){
        Object objValue = this.get(FIELD_PSDEUAGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面行为组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEUAGroupNameDirty(){
        if(this.contains(FIELD_PSDEUAGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面行为组
     */
    @JsonIgnore
    public void resetPSDEUAGroupName(){
        this.reset(FIELD_PSDEUAGROUPNAME);
    }

    /**
     * 设置 界面行为组，详细说明：{@link #FIELD_PSDEUAGROUPNAME}
     * <P>
     * 等同 {@link #setPSDEUAGroupName}
     * @param pSDEUAGroupName
     */
    @JsonIgnore
    public PSDETreeCol psdeuagroupname(String pSDEUAGroupName){
        this.setPSDEUAGroupName(pSDEUAGroupName);
        return this;
    }

    /**
     * <B>PSDEUIACTIONID</B>&nbsp;实体界面行为，指定属性树表格列内置的界面行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEUIAction} 
     */
    public final static String FIELD_PSDEUIACTIONID = "psdeuiactionid";

    /**
     * 设置 实体界面行为，详细说明：{@link #FIELD_PSDEUIACTIONID}
     * 
     * @param pSDEUIActionId
     * 
     */
    @JsonProperty(FIELD_PSDEUIACTIONID)
    public void setPSDEUIActionId(String pSDEUIActionId){
        this.set(FIELD_PSDEUIACTIONID, pSDEUIActionId);
    }
    
    /**
     * 获取 实体界面行为  
     * @return
     */
    @JsonIgnore
    public String getPSDEUIActionId(){
        Object objValue = this.get(FIELD_PSDEUIACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体界面行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEUIActionIdDirty(){
        if(this.contains(FIELD_PSDEUIACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体界面行为
     */
    @JsonIgnore
    public void resetPSDEUIActionId(){
        this.reset(FIELD_PSDEUIACTIONID);
    }

    /**
     * 设置 实体界面行为，详细说明：{@link #FIELD_PSDEUIACTIONID}
     * <P>
     * 等同 {@link #setPSDEUIActionId}
     * @param pSDEUIActionId
     */
    @JsonIgnore
    public PSDETreeCol psdeuiactionid(String pSDEUIActionId){
        this.setPSDEUIActionId(pSDEUIActionId);
        return this;
    }

    /**
     * 设置 实体界面行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEUIActionId}
     * @param pSDEUIAction 引用对象
     */
    @JsonIgnore
    public PSDETreeCol psdeuiactionid(PSDEUIAction pSDEUIAction){
        if(pSDEUIAction == null){
            this.setPSDEUIActionId(null);
            this.setPSDEUIActionName(null);
        }
        else{
            this.setPSDEUIActionId(pSDEUIAction.getPSDEUIActionId());
            this.setPSDEUIActionName(pSDEUIAction.getPSDEUIActionName());
        }
        return this;
    }

    /**
     * <B>PSDEUIACTIONNAME</B>&nbsp;实体界面行为，指定属性树表格列内置的界面行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEUIACTIONID}
     */
    public final static String FIELD_PSDEUIACTIONNAME = "psdeuiactionname";

    /**
     * 设置 实体界面行为，详细说明：{@link #FIELD_PSDEUIACTIONNAME}
     * 
     * @param pSDEUIActionName
     * 
     */
    @JsonProperty(FIELD_PSDEUIACTIONNAME)
    public void setPSDEUIActionName(String pSDEUIActionName){
        this.set(FIELD_PSDEUIACTIONNAME, pSDEUIActionName);
    }
    
    /**
     * 获取 实体界面行为  
     * @return
     */
    @JsonIgnore
    public String getPSDEUIActionName(){
        Object objValue = this.get(FIELD_PSDEUIACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体界面行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEUIActionNameDirty(){
        if(this.contains(FIELD_PSDEUIACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体界面行为
     */
    @JsonIgnore
    public void resetPSDEUIActionName(){
        this.reset(FIELD_PSDEUIACTIONNAME);
    }

    /**
     * 设置 实体界面行为，详细说明：{@link #FIELD_PSDEUIACTIONNAME}
     * <P>
     * 等同 {@link #setPSDEUIActionName}
     * @param pSDEUIActionName
     */
    @JsonIgnore
    public PSDETreeCol psdeuiactionname(String pSDEUIActionName){
        this.setPSDEUIActionName(pSDEUIActionName);
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
    public PSDETreeCol pssysdynamodelid(String pSSysDynaModelId){
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
    public PSDETreeCol pssysdynamodelid(PSSysDynaModel pSSysDynaModel){
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
    public PSDETreeCol pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSSYSIMAGEID</B>&nbsp;系统图片，指定树表格列的图标对象，各类型成员按自身约定放置图标对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysImage} 
     */
    public final static String FIELD_PSSYSIMAGEID = "pssysimageid";

    /**
     * 设置 系统图片，详细说明：{@link #FIELD_PSSYSIMAGEID}
     * 
     * @param pSSysImageId
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGEID)
    public void setPSSysImageId(String pSSysImageId){
        this.set(FIELD_PSSYSIMAGEID, pSSysImageId);
    }
    
    /**
     * 获取 系统图片  
     * @return
     */
    @JsonIgnore
    public String getPSSysImageId(){
        Object objValue = this.get(FIELD_PSSYSIMAGEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统图片 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysImageIdDirty(){
        if(this.contains(FIELD_PSSYSIMAGEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统图片
     */
    @JsonIgnore
    public void resetPSSysImageId(){
        this.reset(FIELD_PSSYSIMAGEID);
    }

    /**
     * 设置 系统图片，详细说明：{@link #FIELD_PSSYSIMAGEID}
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImageId
     */
    @JsonIgnore
    public PSDETreeCol pssysimageid(String pSSysImageId){
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    /**
     * 设置 系统图片，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImage 引用对象
     */
    @JsonIgnore
    public PSDETreeCol pssysimageid(PSSysImage pSSysImage){
        if(pSSysImage == null){
            this.setPSSysImageId(null);
            this.setPSSysImageName(null);
        }
        else{
            this.setPSSysImageId(pSSysImage.getPSSysImageId());
            this.setPSSysImageName(pSSysImage.getPSSysImageName());
        }
        return this;
    }

    /**
     * <B>PSSYSIMAGENAME</B>&nbsp;系统图片，指定树表格列的图标对象，各类型成员按自身约定放置图标对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSIMAGEID}
     */
    public final static String FIELD_PSSYSIMAGENAME = "pssysimagename";

    /**
     * 设置 系统图片，详细说明：{@link #FIELD_PSSYSIMAGENAME}
     * 
     * @param pSSysImageName
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGENAME)
    public void setPSSysImageName(String pSSysImageName){
        this.set(FIELD_PSSYSIMAGENAME, pSSysImageName);
    }
    
    /**
     * 获取 系统图片  
     * @return
     */
    @JsonIgnore
    public String getPSSysImageName(){
        Object objValue = this.get(FIELD_PSSYSIMAGENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统图片 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysImageNameDirty(){
        if(this.contains(FIELD_PSSYSIMAGENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统图片
     */
    @JsonIgnore
    public void resetPSSysImageName(){
        this.reset(FIELD_PSSYSIMAGENAME);
    }

    /**
     * 设置 系统图片，详细说明：{@link #FIELD_PSSYSIMAGENAME}
     * <P>
     * 等同 {@link #setPSSysImageName}
     * @param pSSysImageName
     */
    @JsonIgnore
    public PSDETreeCol pssysimagename(String pSSysImageName){
        this.setPSSysImageName(pSSysImageName);
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
    public PSDETreeCol updatedate(String updateDate){
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
    public PSDETreeCol updateman(String updateMan){
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
    public PSDETreeCol usercat(String userCat){
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
    public PSDETreeCol usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDETreeCol usertag(String userTag){
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
    public PSDETreeCol usertag2(String userTag2){
        this.setUserTag2(userTag2);
        return this;
    }

    /**
     * <B>WIDTH</B>&nbsp;宽度，指定树表格列的宽度，未定义时为【100】
     */
    public final static String FIELD_WIDTH = "width";

    /**
     * 设置 宽度，详细说明：{@link #FIELD_WIDTH}
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
     * 设置 宽度，详细说明：{@link #FIELD_WIDTH}
     * <P>
     * 等同 {@link #setWidth}
     * @param width
     */
    @JsonIgnore
    public PSDETreeCol width(Integer width){
        this.setWidth(width);
        return this;
    }

    /**
     * <B>WIDTHUNIT</B>&nbsp;宽度单位，指定树表格列宽度的单位，未定义时为【px】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.GridColWidthUnitType} 
     */
    public final static String FIELD_WIDTHUNIT = "widthunit";

    /**
     * 设置 宽度单位，详细说明：{@link #FIELD_WIDTHUNIT}
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
     * 设置 宽度单位，详细说明：{@link #FIELD_WIDTHUNIT}
     * <P>
     * 等同 {@link #setWidthUnit}
     * @param widthUnit
     */
    @JsonIgnore
    public PSDETreeCol widthunit(String widthUnit){
        this.setWidthUnit(widthUnit);
        return this;
    }

     /**
     * 设置 宽度单位，详细说明：{@link #FIELD_WIDTHUNIT}
     * <P>
     * 等同 {@link #setWidthUnit}
     * @param widthUnit
     */
    @JsonIgnore
    public PSDETreeCol widthunit(net.ibizsys.psmodel.core.util.PSModelEnums.GridColWidthUnitType widthUnit){
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
        return this.getPSDETreeColId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDETreeColId(strValue);
    }

    @JsonIgnore
    public PSDETreeCol id(String strValue){
        this.setPSDETreeColId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDETreeCol){
            PSDETreeCol model = (PSDETreeCol)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
