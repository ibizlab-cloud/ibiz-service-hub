package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEGRIDCOL</B>表格列 模型传输对象
 * <P>
 * 实体数据表格列模型，提供多种列类型。支持定义分组列（多层）、列编辑项的动态逻辑等
 */
public class PSDEGridCol extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEGridCol(){
    }      

    /**
     * <B>AGGFIELD</B>&nbsp;聚合值属性，数据表格使用聚合行为时指定聚合值的取值属性名称，
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_AGGFIELD = "aggfield";

    /**
     * 设置 聚合值属性，详细说明：{@link #FIELD_AGGFIELD}
     * 
     * @param aggField
     * 
     */
    @JsonProperty(FIELD_AGGFIELD)
    public void setAggField(String aggField){
        this.set(FIELD_AGGFIELD, aggField);
    }
    
    /**
     * 获取 聚合值属性  
     * @return
     */
    @JsonIgnore
    public String getAggField(){
        Object objValue = this.get(FIELD_AGGFIELD);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 聚合值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAggFieldDirty(){
        if(this.contains(FIELD_AGGFIELD)){
            return true;
        }
        return false;
    }

    /**
     * 重置 聚合值属性
     */
    @JsonIgnore
    public void resetAggField(){
        this.reset(FIELD_AGGFIELD);
    }

    /**
     * 设置 聚合值属性，详细说明：{@link #FIELD_AGGFIELD}
     * <P>
     * 等同 {@link #setAggField}
     * @param aggField
     */
    @JsonIgnore
    public PSDEGridCol aggfield(String aggField){
        this.setAggField(aggField);
        return this;
    }

    /**
     * <B>AGGMODE</B>&nbsp;列聚合模式，指定数据列的聚合模式，未定义时为【无聚合】。需数据表格启用聚合功能
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.GridColAggMode} 
     */
    public final static String FIELD_AGGMODE = "aggmode";

    /**
     * 设置 列聚合模式，详细说明：{@link #FIELD_AGGMODE}
     * 
     * @param aggMode
     * 
     */
    @JsonProperty(FIELD_AGGMODE)
    public void setAggMode(String aggMode){
        this.set(FIELD_AGGMODE, aggMode);
    }
    
    /**
     * 获取 列聚合模式  
     * @return
     */
    @JsonIgnore
    public String getAggMode(){
        Object objValue = this.get(FIELD_AGGMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 列聚合模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAggModeDirty(){
        if(this.contains(FIELD_AGGMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 列聚合模式
     */
    @JsonIgnore
    public void resetAggMode(){
        this.reset(FIELD_AGGMODE);
    }

    /**
     * 设置 列聚合模式，详细说明：{@link #FIELD_AGGMODE}
     * <P>
     * 等同 {@link #setAggMode}
     * @param aggMode
     */
    @JsonIgnore
    public PSDEGridCol aggmode(String aggMode){
        this.setAggMode(aggMode);
        return this;
    }

     /**
     * 设置 列聚合模式，详细说明：{@link #FIELD_AGGMODE}
     * <P>
     * 等同 {@link #setAggMode}
     * @param aggMode
     */
    @JsonIgnore
    public PSDEGridCol aggmode(net.ibizsys.psmodel.core.util.PSModelEnums.GridColAggMode aggMode){
        if(aggMode == null){
            this.setAggMode(null);
        }
        else{
            this.setAggMode(aggMode.value);
        }
        return this;
    }

    /**
     * <B>AGGVALUEFORMAT</B>&nbsp;聚合值格式化，属性数据类启用聚合模式指定值格式化
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_AGGVALUEFORMAT = "aggvalueformat";

    /**
     * 设置 聚合值格式化，详细说明：{@link #FIELD_AGGVALUEFORMAT}
     * 
     * @param aggValueFormat
     * 
     */
    @JsonProperty(FIELD_AGGVALUEFORMAT)
    public void setAggValueFormat(String aggValueFormat){
        this.set(FIELD_AGGVALUEFORMAT, aggValueFormat);
    }
    
    /**
     * 获取 聚合值格式化  
     * @return
     */
    @JsonIgnore
    public String getAggValueFormat(){
        Object objValue = this.get(FIELD_AGGVALUEFORMAT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 聚合值格式化 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAggValueFormatDirty(){
        if(this.contains(FIELD_AGGVALUEFORMAT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 聚合值格式化
     */
    @JsonIgnore
    public void resetAggValueFormat(){
        this.reset(FIELD_AGGVALUEFORMAT);
    }

    /**
     * 设置 聚合值格式化，详细说明：{@link #FIELD_AGGVALUEFORMAT}
     * <P>
     * 等同 {@link #setAggValueFormat}
     * @param aggValueFormat
     */
    @JsonIgnore
    public PSDEGridCol aggvalueformat(String aggValueFormat){
        this.setAggValueFormat(aggValueFormat);
        return this;
    }

    /**
     * <B>ALIGN</B>&nbsp;水平对齐，指定列的水平对齐方式，未定义时操作列为【右对齐】
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
    public PSDEGridCol align(String align){
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
    public PSDEGridCol align(net.ibizsys.psmodel.core.util.PSModelEnums.GridColAlign align){
        if(align == null){
            this.setAlign(null);
        }
        else{
            this.setAlign(align.value);
        }
        return this;
    }

    /**
     * <B>ALLOWEMPTY</B>&nbsp;允许空输入，指定表格编辑项是否允许空输入，未定义时使用引用的属性界面模式的配置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ALLOWEMPTY = "allowempty";

    /**
     * 设置 允许空输入，详细说明：{@link #FIELD_ALLOWEMPTY}
     * 
     * @param allowEmpty
     * 
     */
    @JsonProperty(FIELD_ALLOWEMPTY)
    public void setAllowEmpty(Integer allowEmpty){
        this.set(FIELD_ALLOWEMPTY, allowEmpty);
    }
    
    /**
     * 获取 允许空输入  
     * @return
     */
    @JsonIgnore
    public Integer getAllowEmpty(){
        Object objValue = this.get(FIELD_ALLOWEMPTY);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 允许空输入 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAllowEmptyDirty(){
        if(this.contains(FIELD_ALLOWEMPTY)){
            return true;
        }
        return false;
    }

    /**
     * 重置 允许空输入
     */
    @JsonIgnore
    public void resetAllowEmpty(){
        this.reset(FIELD_ALLOWEMPTY);
    }

    /**
     * 设置 允许空输入，详细说明：{@link #FIELD_ALLOWEMPTY}
     * <P>
     * 等同 {@link #setAllowEmpty}
     * @param allowEmpty
     */
    @JsonIgnore
    public PSDEGridCol allowempty(Integer allowEmpty){
        this.setAllowEmpty(allowEmpty);
        return this;
    }

     /**
     * 设置 允许空输入，详细说明：{@link #FIELD_ALLOWEMPTY}
     * <P>
     * 等同 {@link #setAllowEmpty}
     * @param allowEmpty
     */
    @JsonIgnore
    public PSDEGridCol allowempty(Boolean allowEmpty){
        if(allowEmpty == null){
            this.setAllowEmpty(null);
        }
        else{
            this.setAllowEmpty(allowEmpty?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CAPPSLANRESID</B>&nbsp;标题语言资源，指定表格列的标题的多语言资源对象，未定义时属性表格列使用引用属性界面模式的配置
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
    public PSDEGridCol cappslanresid(String capPSLanResId){
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
    public PSDEGridCol cappslanresid(PSLanguageRes pSLanguageRes){
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
     * <B>CAPPSLANRESNAME</B>&nbsp;标题语言资源，指定表格列的标题的多语言资源对象，未定义时属性表格列使用引用属性界面模式的配置
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
    public PSDEGridCol cappslanresname(String capPSLanResName){
        this.setCapPSLanResName(capPSLanResName);
        return this;
    }

    /**
     * <B>CAPTION</B>&nbsp;标题，指定表格列的标题，未定义时属性表格列使用引用属性界面模式的配置
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
    public PSDEGridCol caption(String caption){
        this.setCaption(caption);
        return this;
    }

    /**
     * <B>CELLPSSYSCSSID</B>&nbsp;单元格样式，指定表格列单元格的界面样式表对象
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
    public PSDEGridCol cellpssyscssid(String cellPSSysCssId){
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
    public PSDEGridCol cellpssyscssid(PSSysCss pSSysCss){
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
     * <B>CELLPSSYSCSSNAME</B>&nbsp;单元格样式表，指定表格列单元格的界面样式表对象
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
    public PSDEGridCol cellpssyscssname(String cellPSSysCssName){
        this.setCellPSSysCssName(cellPSSysCssName);
        return this;
    }

    /**
     * <B>CLCONVERTMODE</B>&nbsp;代码值转换模式，指定表格数据项的代码值转换模式，未定义时为【前台】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.CodeListConvertMode} 
     */
    public final static String FIELD_CLCONVERTMODE = "clconvertmode";

    /**
     * 设置 代码值转换模式，详细说明：{@link #FIELD_CLCONVERTMODE}
     * 
     * @param cLConvertMode
     * 
     */
    @JsonProperty(FIELD_CLCONVERTMODE)
    public void setCLConvertMode(String cLConvertMode){
        this.set(FIELD_CLCONVERTMODE, cLConvertMode);
    }
    
    /**
     * 获取 代码值转换模式  
     * @return
     */
    @JsonIgnore
    public String getCLConvertMode(){
        Object objValue = this.get(FIELD_CLCONVERTMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码值转换模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCLConvertModeDirty(){
        if(this.contains(FIELD_CLCONVERTMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码值转换模式
     */
    @JsonIgnore
    public void resetCLConvertMode(){
        this.reset(FIELD_CLCONVERTMODE);
    }

    /**
     * 设置 代码值转换模式，详细说明：{@link #FIELD_CLCONVERTMODE}
     * <P>
     * 等同 {@link #setCLConvertMode}
     * @param cLConvertMode
     */
    @JsonIgnore
    public PSDEGridCol clconvertmode(String cLConvertMode){
        this.setCLConvertMode(cLConvertMode);
        return this;
    }

     /**
     * 设置 代码值转换模式，详细说明：{@link #FIELD_CLCONVERTMODE}
     * <P>
     * 等同 {@link #setCLConvertMode}
     * @param cLConvertMode
     */
    @JsonIgnore
    public PSDEGridCol clconvertmode(net.ibizsys.psmodel.core.util.PSModelEnums.CodeListConvertMode cLConvertMode){
        if(cLConvertMode == null){
            this.setCLConvertMode(null);
        }
        else{
            this.setCLConvertMode(cLConvertMode.value);
        }
        return this;
    }

    /**
     * <B>CODELISTCONFIGMODE</B>&nbsp;输出代码表模式，指定表格编辑项代码表配置的输出模式，未定义时如编辑项编辑器与引用属性界面模式一致则使用属性界面模式的配置，否则为【无】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.OutputCodeListMode} 
     */
    public final static String FIELD_CODELISTCONFIGMODE = "codelistconfigmode";

    /**
     * 设置 输出代码表模式，详细说明：{@link #FIELD_CODELISTCONFIGMODE}
     * 
     * @param codeListConfigMode
     * 
     */
    @JsonProperty(FIELD_CODELISTCONFIGMODE)
    public void setCodeListConfigMode(Integer codeListConfigMode){
        this.set(FIELD_CODELISTCONFIGMODE, codeListConfigMode);
    }
    
    /**
     * 获取 输出代码表模式  
     * @return
     */
    @JsonIgnore
    public Integer getCodeListConfigMode(){
        Object objValue = this.get(FIELD_CODELISTCONFIGMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 输出代码表模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCodeListConfigModeDirty(){
        if(this.contains(FIELD_CODELISTCONFIGMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输出代码表模式
     */
    @JsonIgnore
    public void resetCodeListConfigMode(){
        this.reset(FIELD_CODELISTCONFIGMODE);
    }

    /**
     * 设置 输出代码表模式，详细说明：{@link #FIELD_CODELISTCONFIGMODE}
     * <P>
     * 等同 {@link #setCodeListConfigMode}
     * @param codeListConfigMode
     */
    @JsonIgnore
    public PSDEGridCol codelistconfigmode(Integer codeListConfigMode){
        this.setCodeListConfigMode(codeListConfigMode);
        return this;
    }

     /**
     * 设置 输出代码表模式，详细说明：{@link #FIELD_CODELISTCONFIGMODE}
     * <P>
     * 等同 {@link #setCodeListConfigMode}
     * @param codeListConfigMode
     */
    @JsonIgnore
    public PSDEGridCol codelistconfigmode(net.ibizsys.psmodel.core.util.PSModelEnums.OutputCodeListMode codeListConfigMode){
        if(codeListConfigMode == null){
            this.setCodeListConfigMode(null);
        }
        else{
            this.setCodeListConfigMode(codeListConfigMode.value);
        }
        return this;
    }

    /**
     * <B>COLENABLELINK</B>&nbsp;列启用链接
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEGridColLinkMode} 
     */
    public final static String FIELD_COLENABLELINK = "colenablelink";

    /**
     * 设置 列启用链接
     * 
     * @param colEnableLink
     * 
     */
    @JsonProperty(FIELD_COLENABLELINK)
    public void setColEnableLink(Integer colEnableLink){
        this.set(FIELD_COLENABLELINK, colEnableLink);
    }
    
    /**
     * 获取 列启用链接  
     * @return
     */
    @JsonIgnore
    public Integer getColEnableLink(){
        Object objValue = this.get(FIELD_COLENABLELINK);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 列启用链接 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isColEnableLinkDirty(){
        if(this.contains(FIELD_COLENABLELINK)){
            return true;
        }
        return false;
    }

    /**
     * 重置 列启用链接
     */
    @JsonIgnore
    public void resetColEnableLink(){
        this.reset(FIELD_COLENABLELINK);
    }

    /**
     * 设置 列启用链接
     * <P>
     * 等同 {@link #setColEnableLink}
     * @param colEnableLink
     */
    @JsonIgnore
    public PSDEGridCol colenablelink(Integer colEnableLink){
        this.setColEnableLink(colEnableLink);
        return this;
    }

     /**
     * 设置 列启用链接
     * <P>
     * 等同 {@link #setColEnableLink}
     * @param colEnableLink
     */
    @JsonIgnore
    public PSDEGridCol colenablelink(net.ibizsys.psmodel.core.util.PSModelEnums.DEGridColLinkMode colEnableLink){
        if(colEnableLink == null){
            this.setColEnableLink(null);
        }
        else{
            this.setColEnableLink(colEnableLink.value);
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
    public PSDEGridCol createdate(String createDate){
        this.setCreateDate(createDate);
        return this;
    }

    /**
     * <B>CREATEDV</B>&nbsp;建立默认值，指定表格编辑项的建立默认值，未指定默认值类型时按直接值处理
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
    public PSDEGridCol createdv(String createDV){
        this.setCreateDV(createDV);
        return this;
    }

    /**
     * <B>CREATEDVT</B>&nbsp;新建默认值类型，指定表格编辑项的建立默认值类型，未定义时为【直接值】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.CreateDefaultValueType} 
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
    public PSDEGridCol createdvt(String createDVT){
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
    public PSDEGridCol createdvt(net.ibizsys.psmodel.core.util.PSModelEnums.CreateDefaultValueType createDVT){
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
    public PSDEGridCol createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CUSTOMCODE</B>&nbsp;自定义代码
     */
    public final static String FIELD_CUSTOMCODE = "customcode";

    /**
     * 设置 自定义代码
     * 
     * @param customCode
     * 
     */
    @JsonProperty(FIELD_CUSTOMCODE)
    public void setCustomCode(String customCode){
        this.set(FIELD_CUSTOMCODE, customCode);
    }
    
    /**
     * 获取 自定义代码  
     * @return
     */
    @JsonIgnore
    public String getCustomCode(){
        Object objValue = this.get(FIELD_CUSTOMCODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomCodeDirty(){
        if(this.contains(FIELD_CUSTOMCODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义代码
     */
    @JsonIgnore
    public void resetCustomCode(){
        this.reset(FIELD_CUSTOMCODE);
    }

    /**
     * 设置 自定义代码
     * <P>
     * 等同 {@link #setCustomCode}
     * @param customCode
     */
    @JsonIgnore
    public PSDEGridCol customcode(String customCode){
        this.setCustomCode(customCode);
        return this;
    }

    /**
     * <B>CUSTOMMODE</B>&nbsp;脚本代码模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_CUSTOMMODE = "custommode";

    /**
     * 设置 脚本代码模式
     * 
     * @param customMode
     * 
     */
    @JsonProperty(FIELD_CUSTOMMODE)
    public void setCustomMode(Integer customMode){
        this.set(FIELD_CUSTOMMODE, customMode);
    }
    
    /**
     * 获取 脚本代码模式  
     * @return
     */
    @JsonIgnore
    public Integer getCustomMode(){
        Object objValue = this.get(FIELD_CUSTOMMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 脚本代码模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomModeDirty(){
        if(this.contains(FIELD_CUSTOMMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 脚本代码模式
     */
    @JsonIgnore
    public void resetCustomMode(){
        this.reset(FIELD_CUSTOMMODE);
    }

    /**
     * 设置 脚本代码模式
     * <P>
     * 等同 {@link #setCustomMode}
     * @param customMode
     */
    @JsonIgnore
    public PSDEGridCol custommode(Integer customMode){
        this.setCustomMode(customMode);
        return this;
    }

     /**
     * 设置 脚本代码模式
     * <P>
     * 等同 {@link #setCustomMode}
     * @param customMode
     */
    @JsonIgnore
    public PSDEGridCol custommode(Boolean customMode){
        if(customMode == null){
            this.setCustomMode(null);
        }
        else{
            this.setCustomMode(customMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DATAITEMS</B>&nbsp;数据项，指定表格列绑定数据列的名称，未定义时使用当前列标识
     * <P>
     * 字符串：最大长度 300
     */
    public final static String FIELD_DATAITEMS = "dataitems";

    /**
     * 设置 数据项，详细说明：{@link #FIELD_DATAITEMS}
     * 
     * @param dataItems
     * 
     */
    @JsonProperty(FIELD_DATAITEMS)
    public void setDataItems(String dataItems){
        this.set(FIELD_DATAITEMS, dataItems);
    }
    
    /**
     * 获取 数据项  
     * @return
     */
    @JsonIgnore
    public String getDataItems(){
        Object objValue = this.get(FIELD_DATAITEMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDataItemsDirty(){
        if(this.contains(FIELD_DATAITEMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据项
     */
    @JsonIgnore
    public void resetDataItems(){
        this.reset(FIELD_DATAITEMS);
    }

    /**
     * 设置 数据项，详细说明：{@link #FIELD_DATAITEMS}
     * <P>
     * 等同 {@link #setDataItems}
     * @param dataItems
     */
    @JsonIgnore
    public PSDEGridCol dataitems(String dataItems){
        this.setDataItems(dataItems);
        return this;
    }

    /**
     * <B>EDITORPARAMS</B>&nbsp;编辑器参数，指定表格编辑项编辑器的参数，如编辑项引用的属性界面模式的配置编辑器类型与当前编辑器一致，同时附加引用的属性界面模式的编辑器参数
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_EDITORPARAMS = "editorparams";

    /**
     * 设置 编辑器参数，详细说明：{@link #FIELD_EDITORPARAMS}
     * 
     * @param editorParams
     * 
     */
    @JsonProperty(FIELD_EDITORPARAMS)
    public void setEditorParams(String editorParams){
        this.set(FIELD_EDITORPARAMS, editorParams);
    }
    
    /**
     * 获取 编辑器参数  
     * @return
     */
    @JsonIgnore
    public String getEditorParams(){
        Object objValue = this.get(FIELD_EDITORPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 编辑器参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEditorParamsDirty(){
        if(this.contains(FIELD_EDITORPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 编辑器参数
     */
    @JsonIgnore
    public void resetEditorParams(){
        this.reset(FIELD_EDITORPARAMS);
    }

    /**
     * 设置 编辑器参数，详细说明：{@link #FIELD_EDITORPARAMS}
     * <P>
     * 等同 {@link #setEditorParams}
     * @param editorParams
     */
    @JsonIgnore
    public PSDEGridCol editorparams(String editorParams){
        this.setEditorParams(editorParams);
        return this;
    }

    /**
     * <B>EDITORTYPE</B>&nbsp;编辑器类型，指定表格编辑项编辑器的类型，未定义时使用引用属性界面模式的配置
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_EDITORTYPE = "editortype";

    /**
     * 设置 编辑器类型，详细说明：{@link #FIELD_EDITORTYPE}
     * 
     * @param editorType
     * 
     */
    @JsonProperty(FIELD_EDITORTYPE)
    public void setEditorType(String editorType){
        this.set(FIELD_EDITORTYPE, editorType);
    }
    
    /**
     * 获取 编辑器类型  
     * @return
     */
    @JsonIgnore
    public String getEditorType(){
        Object objValue = this.get(FIELD_EDITORTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 编辑器类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEditorTypeDirty(){
        if(this.contains(FIELD_EDITORTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 编辑器类型
     */
    @JsonIgnore
    public void resetEditorType(){
        this.reset(FIELD_EDITORTYPE);
    }

    /**
     * 设置 编辑器类型，详细说明：{@link #FIELD_EDITORTYPE}
     * <P>
     * 等同 {@link #setEditorType}
     * @param editorType
     */
    @JsonIgnore
    public PSDEGridCol editortype(String editorType){
        this.setEditorType(editorType);
        return this;
    }

    /**
     * <B>ENABLECOND</B>&nbsp;启用条件，指定表格编辑项的静态启用条件，未定义时使用引用的属性界面模式的配置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.EditItemEnableCond} 
     */
    public final static String FIELD_ENABLECOND = "enablecond";

    /**
     * 设置 启用条件，详细说明：{@link #FIELD_ENABLECOND}
     * 
     * @param enableCond
     * 
     */
    @JsonProperty(FIELD_ENABLECOND)
    public void setEnableCond(Integer enableCond){
        this.set(FIELD_ENABLECOND, enableCond);
    }
    
    /**
     * 获取 启用条件  
     * @return
     */
    @JsonIgnore
    public Integer getEnableCond(){
        Object objValue = this.get(FIELD_ENABLECOND);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用条件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableCondDirty(){
        if(this.contains(FIELD_ENABLECOND)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用条件
     */
    @JsonIgnore
    public void resetEnableCond(){
        this.reset(FIELD_ENABLECOND);
    }

    /**
     * 设置 启用条件，详细说明：{@link #FIELD_ENABLECOND}
     * <P>
     * 等同 {@link #setEnableCond}
     * @param enableCond
     */
    @JsonIgnore
    public PSDEGridCol enablecond(Integer enableCond){
        this.setEnableCond(enableCond);
        return this;
    }

     /**
     * 设置 启用条件，详细说明：{@link #FIELD_ENABLECOND}
     * <P>
     * 等同 {@link #setEnableCond}
     * @param enableCond
     */
    @JsonIgnore
    public PSDEGridCol enablecond(net.ibizsys.psmodel.core.util.PSModelEnums.EditItemEnableCond enableCond){
        if(enableCond == null){
            this.setEnableCond(null);
        }
        else{
            this.setEnableCond(enableCond.value);
        }
        return this;
    }

    /**
     * <B>ENABLEINPUTTIP</B>&nbsp;启用输入提示
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEINPUTTIP = "enableinputtip";

    /**
     * 设置 启用输入提示
     * 
     * @param enableInputTip
     * 
     */
    @JsonProperty(FIELD_ENABLEINPUTTIP)
    public void setEnableInputTip(Integer enableInputTip){
        this.set(FIELD_ENABLEINPUTTIP, enableInputTip);
    }
    
    /**
     * 获取 启用输入提示  
     * @return
     */
    @JsonIgnore
    public Integer getEnableInputTip(){
        Object objValue = this.get(FIELD_ENABLEINPUTTIP);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用输入提示 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableInputTipDirty(){
        if(this.contains(FIELD_ENABLEINPUTTIP)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用输入提示
     */
    @JsonIgnore
    public void resetEnableInputTip(){
        this.reset(FIELD_ENABLEINPUTTIP);
    }

    /**
     * 设置 启用输入提示
     * <P>
     * 等同 {@link #setEnableInputTip}
     * @param enableInputTip
     */
    @JsonIgnore
    public PSDEGridCol enableinputtip(Integer enableInputTip){
        this.setEnableInputTip(enableInputTip);
        return this;
    }

     /**
     * 设置 启用输入提示
     * <P>
     * 等同 {@link #setEnableInputTip}
     * @param enableInputTip
     */
    @JsonIgnore
    public PSDEGridCol enableinputtip(Boolean enableInputTip){
        if(enableInputTip == null){
            this.setEnableInputTip(null);
        }
        else{
            this.setEnableInputTip(enableInputTip?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEITEMPRIV</B>&nbsp;启用列权限控制，指定表格列是否启用列权限控制，未定义时由表格列绑定的实体属性决定，无实体属性则为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEITEMPRIV = "enableitempriv";

    /**
     * 设置 启用列权限控制，详细说明：{@link #FIELD_ENABLEITEMPRIV}
     * 
     * @param enableItemPriv
     * 
     */
    @JsonProperty(FIELD_ENABLEITEMPRIV)
    public void setEnableItemPriv(Integer enableItemPriv){
        this.set(FIELD_ENABLEITEMPRIV, enableItemPriv);
    }
    
    /**
     * 获取 启用列权限控制  
     * @return
     */
    @JsonIgnore
    public Integer getEnableItemPriv(){
        Object objValue = this.get(FIELD_ENABLEITEMPRIV);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用列权限控制 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableItemPrivDirty(){
        if(this.contains(FIELD_ENABLEITEMPRIV)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用列权限控制
     */
    @JsonIgnore
    public void resetEnableItemPriv(){
        this.reset(FIELD_ENABLEITEMPRIV);
    }

    /**
     * 设置 启用列权限控制，详细说明：{@link #FIELD_ENABLEITEMPRIV}
     * <P>
     * 等同 {@link #setEnableItemPriv}
     * @param enableItemPriv
     */
    @JsonIgnore
    public PSDEGridCol enableitempriv(Integer enableItemPriv){
        this.setEnableItemPriv(enableItemPriv);
        return this;
    }

     /**
     * 设置 启用列权限控制，详细说明：{@link #FIELD_ENABLEITEMPRIV}
     * <P>
     * 等同 {@link #setEnableItemPriv}
     * @param enableItemPriv
     */
    @JsonIgnore
    public PSDEGridCol enableitempriv(Boolean enableItemPriv){
        if(enableItemPriv == null){
            this.setEnableItemPriv(null);
        }
        else{
            this.setEnableItemPriv(enableItemPriv?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLELINK</B>&nbsp;启用链接，指定表格属性列的链接模式，未定义时使用数据表格的配置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEGridColLinkMode} 
     */
    public final static String FIELD_ENABLELINK = "enablelink";

    /**
     * 设置 启用链接，详细说明：{@link #FIELD_ENABLELINK}
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
     * 设置 启用链接，详细说明：{@link #FIELD_ENABLELINK}
     * <P>
     * 等同 {@link #setEnableLink}
     * @param enableLink
     */
    @JsonIgnore
    public PSDEGridCol enablelink(Integer enableLink){
        this.setEnableLink(enableLink);
        return this;
    }

     /**
     * 设置 启用链接，详细说明：{@link #FIELD_ENABLELINK}
     * <P>
     * 等同 {@link #setEnableLink}
     * @param enableLink
     */
    @JsonIgnore
    public PSDEGridCol enablelink(net.ibizsys.psmodel.core.util.PSModelEnums.DEGridColLinkMode enableLink){
        if(enableLink == null){
            this.setEnableLink(null);
        }
        else{
            this.setEnableLink(enableLink.value);
        }
        return this;
    }

    /**
     * <B>ENABLEROWEDIT</B>&nbsp;支持行编辑，指定属性表格列是否支持行编辑功能，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEROWEDIT = "enablerowedit";

    /**
     * 设置 支持行编辑，详细说明：{@link #FIELD_ENABLEROWEDIT}
     * 
     * @param enableRowEdit
     * 
     */
    @JsonProperty(FIELD_ENABLEROWEDIT)
    public void setEnableRowEdit(Integer enableRowEdit){
        this.set(FIELD_ENABLEROWEDIT, enableRowEdit);
    }
    
    /**
     * 获取 支持行编辑  
     * @return
     */
    @JsonIgnore
    public Integer getEnableRowEdit(){
        Object objValue = this.get(FIELD_ENABLEROWEDIT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持行编辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableRowEditDirty(){
        if(this.contains(FIELD_ENABLEROWEDIT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持行编辑
     */
    @JsonIgnore
    public void resetEnableRowEdit(){
        this.reset(FIELD_ENABLEROWEDIT);
    }

    /**
     * 设置 支持行编辑，详细说明：{@link #FIELD_ENABLEROWEDIT}
     * <P>
     * 等同 {@link #setEnableRowEdit}
     * @param enableRowEdit
     */
    @JsonIgnore
    public PSDEGridCol enablerowedit(Integer enableRowEdit){
        this.setEnableRowEdit(enableRowEdit);
        return this;
    }

     /**
     * 设置 支持行编辑，详细说明：{@link #FIELD_ENABLEROWEDIT}
     * <P>
     * 等同 {@link #setEnableRowEdit}
     * @param enableRowEdit
     */
    @JsonIgnore
    public PSDEGridCol enablerowedit(Boolean enableRowEdit){
        if(enableRowEdit == null){
            this.setEnableRowEdit(null);
        }
        else{
            this.setEnableRowEdit(enableRowEdit?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSDEGridCol gcrpssyspfpluginid(String gCRPSSysPFPluginId){
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
    public PSDEGridCol gcrpssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
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
    public PSDEGridCol gcrpssyspfpluginname(String gCRPSSysPFPluginName){
        this.setGCRPSSysPFPluginName(gCRPSSysPFPluginName);
        return this;
    }

    /**
     * <B>GRIDCOLSTYLE</B>&nbsp;表格列样式，指定表格列的样式
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
    public PSDEGridCol gridcolstyle(String gridColStyle){
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
    public PSDEGridCol gridcolstyle(net.ibizsys.psmodel.core.util.PSModelEnums.GridColStype gridColStyle){
        if(gridColStyle == null){
            this.setGridColStyle(null);
        }
        else{
            this.setGridColStyle(gridColStyle.value);
        }
        return this;
    }

    /**
     * <B>GRIDCOLTYPE</B>&nbsp;列类型，指定表格列的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.GridColType} 
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
    public PSDEGridCol gridcoltype(String gridColType){
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
    public PSDEGridCol gridcoltype(net.ibizsys.psmodel.core.util.PSModelEnums.GridColType gridColType){
        if(gridColType == null){
            this.setGridColType(null);
        }
        else{
            this.setGridColType(gridColType.value);
        }
        return this;
    }

    /**
     * <B>GROUPITEM</B>&nbsp;分组项，指定表格列的默认分组项，此配置为早期模板保留
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.GridColGroupMode} 
     */
    public final static String FIELD_GROUPITEM = "groupitem";

    /**
     * 设置 分组项，详细说明：{@link #FIELD_GROUPITEM}
     * 
     * @param groupItem
     * 
     */
    @JsonProperty(FIELD_GROUPITEM)
    public void setGroupItem(String groupItem){
        this.set(FIELD_GROUPITEM, groupItem);
    }
    
    /**
     * 获取 分组项  
     * @return
     */
    @JsonIgnore
    public String getGroupItem(){
        Object objValue = this.get(FIELD_GROUPITEM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupItemDirty(){
        if(this.contains(FIELD_GROUPITEM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组项
     */
    @JsonIgnore
    public void resetGroupItem(){
        this.reset(FIELD_GROUPITEM);
    }

    /**
     * 设置 分组项，详细说明：{@link #FIELD_GROUPITEM}
     * <P>
     * 等同 {@link #setGroupItem}
     * @param groupItem
     */
    @JsonIgnore
    public PSDEGridCol groupitem(String groupItem){
        this.setGroupItem(groupItem);
        return this;
    }

     /**
     * 设置 分组项，详细说明：{@link #FIELD_GROUPITEM}
     * <P>
     * 等同 {@link #setGroupItem}
     * @param groupItem
     */
    @JsonIgnore
    public PSDEGridCol groupitem(net.ibizsys.psmodel.core.util.PSModelEnums.GridColGroupMode groupItem){
        if(groupItem == null){
            this.setGroupItem(null);
        }
        else{
            this.setGroupItem(groupItem.value);
        }
        return this;
    }

    /**
     * <B>HEADERPSSYSCSSID</B>&nbsp;头部样式，指定表格列头部的界面样式表对象
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
    public PSDEGridCol headerpssyscssid(String headerPSSysCssId){
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
    public PSDEGridCol headerpssyscssid(PSSysCss pSSysCss){
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
     * <B>HEADERPSSYSCSSNAME</B>&nbsp;头部样式表，指定表格列头部的界面样式表对象
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
    public PSDEGridCol headerpssyscssname(String headerPSSysCssName){
        this.setHeaderPSSysCssName(headerPSSysCssName);
        return this;
    }

    /**
     * <B>HIDDENDATAITEM</B>&nbsp;隐藏数据项，指定属性列是否不输出界面，仅输出数据项供其它逻辑使用。未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
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
    public PSDEGridCol hiddendataitem(Integer hiddenDataItem){
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
    public PSDEGridCol hiddendataitem(Boolean hiddenDataItem){
        if(hiddenDataItem == null){
            this.setHiddenDataItem(null);
        }
        else{
            this.setHiddenDataItem(hiddenDataItem?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>HIDEDEFAULT</B>&nbsp;默认隐藏，指定表格列是否默认隐藏，需要用户选择输出。未定义时为【否】
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
    public PSDEGridCol hidedefault(Integer hideDefault){
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
    public PSDEGridCol hidedefault(net.ibizsys.psmodel.core.util.PSModelEnums.DEGridColHideMode hideDefault){
        if(hideDefault == null){
            this.setHideDefault(null);
        }
        else{
            this.setHideDefault(hideDefault.value);
        }
        return this;
    }

    /**
     * <B>IGNOREINPUT</B>&nbsp;忽略输入值，指定编辑项的忽略输入值的方式，如编辑项启用代码值转换文本处理则直接为【建立及更新】，未定义时（1）如引用的属性界面模式存在忽略输入值配置则使用该配置（2）如表单项属性为系统属性则为【建立及更新】（3）如以上条件都不满足则为【无】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.EditItemEnableCond} 
     */
    public final static String FIELD_IGNOREINPUT = "ignoreinput";

    /**
     * 设置 忽略输入值，详细说明：{@link #FIELD_IGNOREINPUT}
     * 
     * @param ignoreInput
     * 
     */
    @JsonProperty(FIELD_IGNOREINPUT)
    public void setIgnoreInput(Integer ignoreInput){
        this.set(FIELD_IGNOREINPUT, ignoreInput);
    }
    
    /**
     * 获取 忽略输入值  
     * @return
     */
    @JsonIgnore
    public Integer getIgnoreInput(){
        Object objValue = this.get(FIELD_IGNOREINPUT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 忽略输入值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIgnoreInputDirty(){
        if(this.contains(FIELD_IGNOREINPUT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 忽略输入值
     */
    @JsonIgnore
    public void resetIgnoreInput(){
        this.reset(FIELD_IGNOREINPUT);
    }

    /**
     * 设置 忽略输入值，详细说明：{@link #FIELD_IGNOREINPUT}
     * <P>
     * 等同 {@link #setIgnoreInput}
     * @param ignoreInput
     */
    @JsonIgnore
    public PSDEGridCol ignoreinput(Integer ignoreInput){
        this.setIgnoreInput(ignoreInput);
        return this;
    }

     /**
     * 设置 忽略输入值，详细说明：{@link #FIELD_IGNOREINPUT}
     * <P>
     * 等同 {@link #setIgnoreInput}
     * @param ignoreInput
     */
    @JsonIgnore
    public PSDEGridCol ignoreinput(net.ibizsys.psmodel.core.util.PSModelEnums.EditItemEnableCond ignoreInput){
        if(ignoreInput == null){
            this.setIgnoreInput(null);
        }
        else{
            this.setIgnoreInput(ignoreInput.value);
        }
        return this;
    }

    /**
     * <B>LINKPSDEVIEWID</B>&nbsp;数据链接视图，指定属性列引用数据的链接视图对象，未定义时使用引用的属性界面模式的配置
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_LINKPSDEVIEWID = "linkpsdeviewid";

    /**
     * 设置 数据链接视图，详细说明：{@link #FIELD_LINKPSDEVIEWID}
     * 
     * @param linkPSDEViewId
     * 
     */
    @JsonProperty(FIELD_LINKPSDEVIEWID)
    public void setLinkPSDEViewId(String linkPSDEViewId){
        this.set(FIELD_LINKPSDEVIEWID, linkPSDEViewId);
    }
    
    /**
     * 获取 数据链接视图  
     * @return
     */
    @JsonIgnore
    public String getLinkPSDEViewId(){
        Object objValue = this.get(FIELD_LINKPSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据链接视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLinkPSDEViewIdDirty(){
        if(this.contains(FIELD_LINKPSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据链接视图
     */
    @JsonIgnore
    public void resetLinkPSDEViewId(){
        this.reset(FIELD_LINKPSDEVIEWID);
    }

    /**
     * 设置 数据链接视图，详细说明：{@link #FIELD_LINKPSDEVIEWID}
     * <P>
     * 等同 {@link #setLinkPSDEViewId}
     * @param linkPSDEViewId
     */
    @JsonIgnore
    public PSDEGridCol linkpsdeviewid(String linkPSDEViewId){
        this.setLinkPSDEViewId(linkPSDEViewId);
        return this;
    }

    /**
     * 设置 数据链接视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setLinkPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSDEGridCol linkpsdeviewid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setLinkPSDEViewId(null);
            this.setLinkPSDEViewName(null);
        }
        else{
            this.setLinkPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setLinkPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>LINKPSDEVIEWNAME</B>&nbsp;数据链接视图，指定属性列引用数据的链接视图对象，未定义时使用引用的属性界面模式的配置
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_LINKPSDEVIEWID}
     */
    public final static String FIELD_LINKPSDEVIEWNAME = "linkpsdeviewname";

    /**
     * 设置 数据链接视图，详细说明：{@link #FIELD_LINKPSDEVIEWNAME}
     * 
     * @param linkPSDEViewName
     * 
     */
    @JsonProperty(FIELD_LINKPSDEVIEWNAME)
    public void setLinkPSDEViewName(String linkPSDEViewName){
        this.set(FIELD_LINKPSDEVIEWNAME, linkPSDEViewName);
    }
    
    /**
     * 获取 数据链接视图  
     * @return
     */
    @JsonIgnore
    public String getLinkPSDEViewName(){
        Object objValue = this.get(FIELD_LINKPSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据链接视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLinkPSDEViewNameDirty(){
        if(this.contains(FIELD_LINKPSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据链接视图
     */
    @JsonIgnore
    public void resetLinkPSDEViewName(){
        this.reset(FIELD_LINKPSDEVIEWNAME);
    }

    /**
     * 设置 数据链接视图，详细说明：{@link #FIELD_LINKPSDEVIEWNAME}
     * <P>
     * 等同 {@link #setLinkPSDEViewName}
     * @param linkPSDEViewName
     */
    @JsonIgnore
    public PSDEGridCol linkpsdeviewname(String linkPSDEViewName){
        this.setLinkPSDEViewName(linkPSDEViewName);
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
    public PSDEGridCol memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>NEEDCODELISTCONFIG</B>&nbsp;需要提供代码表配置，指定编辑项是否需要提供代码表配置，未定义时如编辑项编辑器与引用属性界面模式一致则使用属性界面模式的配置，否则使用编辑项编辑器默认配置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_NEEDCODELISTCONFIG = "needcodelistconfig";

    /**
     * 设置 需要提供代码表配置，详细说明：{@link #FIELD_NEEDCODELISTCONFIG}
     * 
     * @param needCodeListConfig
     * 
     */
    @JsonProperty(FIELD_NEEDCODELISTCONFIG)
    public void setNeedCodeListConfig(Integer needCodeListConfig){
        this.set(FIELD_NEEDCODELISTCONFIG, needCodeListConfig);
    }
    
    /**
     * 获取 需要提供代码表配置  
     * @return
     */
    @JsonIgnore
    public Integer getNeedCodeListConfig(){
        Object objValue = this.get(FIELD_NEEDCODELISTCONFIG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 需要提供代码表配置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNeedCodeListConfigDirty(){
        if(this.contains(FIELD_NEEDCODELISTCONFIG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 需要提供代码表配置
     */
    @JsonIgnore
    public void resetNeedCodeListConfig(){
        this.reset(FIELD_NEEDCODELISTCONFIG);
    }

    /**
     * 设置 需要提供代码表配置，详细说明：{@link #FIELD_NEEDCODELISTCONFIG}
     * <P>
     * 等同 {@link #setNeedCodeListConfig}
     * @param needCodeListConfig
     */
    @JsonIgnore
    public PSDEGridCol needcodelistconfig(Integer needCodeListConfig){
        this.setNeedCodeListConfig(needCodeListConfig);
        return this;
    }

     /**
     * 设置 需要提供代码表配置，详细说明：{@link #FIELD_NEEDCODELISTCONFIG}
     * <P>
     * 等同 {@link #setNeedCodeListConfig}
     * @param needCodeListConfig
     */
    @JsonIgnore
    public PSDEGridCol needcodelistconfig(Boolean needCodeListConfig){
        if(needCodeListConfig == null){
            this.setNeedCodeListConfig(null);
        }
        else{
            this.setNeedCodeListConfig(needCodeListConfig?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
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
    public PSDEGridCol noprivdm(Integer noPrivDM){
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
    public PSDEGridCol noprivdm(net.ibizsys.psmodel.core.util.PSModelEnums.NoPrivDisplayMode noPrivDM){
        if(noPrivDM == null){
            this.setNoPrivDM(null);
        }
        else{
            this.setNoPrivDM(noPrivDM.value);
        }
        return this;
    }

    /**
     * <B>NOSORT</B>&nbsp;禁用排序，指定是否禁用表格列的排序功能，未定义时如表格部件禁用排序则禁用，否则由绑定的属性界面模式决定
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_NOSORT = "nosort";

    /**
     * 设置 禁用排序，详细说明：{@link #FIELD_NOSORT}
     * 
     * @param noSort
     * 
     */
    @JsonProperty(FIELD_NOSORT)
    public void setNoSort(Integer noSort){
        this.set(FIELD_NOSORT, noSort);
    }
    
    /**
     * 获取 禁用排序  
     * @return
     */
    @JsonIgnore
    public Integer getNoSort(){
        Object objValue = this.get(FIELD_NOSORT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 禁用排序 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNoSortDirty(){
        if(this.contains(FIELD_NOSORT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 禁用排序
     */
    @JsonIgnore
    public void resetNoSort(){
        this.reset(FIELD_NOSORT);
    }

    /**
     * 设置 禁用排序，详细说明：{@link #FIELD_NOSORT}
     * <P>
     * 等同 {@link #setNoSort}
     * @param noSort
     */
    @JsonIgnore
    public PSDEGridCol nosort(Integer noSort){
        this.setNoSort(noSort);
        return this;
    }

     /**
     * 设置 禁用排序，详细说明：{@link #FIELD_NOSORT}
     * <P>
     * 等同 {@link #setNoSort}
     * @param noSort
     */
    @JsonIgnore
    public PSDEGridCol nosort(Boolean noSort){
        if(noSort == null){
            this.setNoSort(null);
        }
        else{
            this.setNoSort(noSort?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;显示次序
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 显示次序
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
     * 设置 显示次序
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSDEGridCol ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PHPSLANRESID</B>&nbsp;占位内容语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_PHPSLANRESID = "phpslanresid";

    /**
     * 设置 占位内容语言资源
     * 
     * @param pHPSLanResId
     * 
     */
    @JsonProperty(FIELD_PHPSLANRESID)
    public void setPHPSLanResId(String pHPSLanResId){
        this.set(FIELD_PHPSLANRESID, pHPSLanResId);
    }
    
    /**
     * 获取 占位内容语言资源  
     * @return
     */
    @JsonIgnore
    public String getPHPSLanResId(){
        Object objValue = this.get(FIELD_PHPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 占位内容语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPHPSLanResIdDirty(){
        if(this.contains(FIELD_PHPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 占位内容语言资源
     */
    @JsonIgnore
    public void resetPHPSLanResId(){
        this.reset(FIELD_PHPSLANRESID);
    }

    /**
     * 设置 占位内容语言资源
     * <P>
     * 等同 {@link #setPHPSLanResId}
     * @param pHPSLanResId
     */
    @JsonIgnore
    public PSDEGridCol phpslanresid(String pHPSLanResId){
        this.setPHPSLanResId(pHPSLanResId);
        return this;
    }

    /**
     * 设置 占位内容语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPHPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSDEGridCol phpslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setPHPSLanResId(null);
            this.setPHPSLanResName(null);
        }
        else{
            this.setPHPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setPHPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>PHPSLANRESNAME</B>&nbsp;占位内容语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PHPSLANRESID}
     */
    public final static String FIELD_PHPSLANRESNAME = "phpslanresname";

    /**
     * 设置 占位内容语言资源
     * 
     * @param pHPSLanResName
     * 
     */
    @JsonProperty(FIELD_PHPSLANRESNAME)
    public void setPHPSLanResName(String pHPSLanResName){
        this.set(FIELD_PHPSLANRESNAME, pHPSLanResName);
    }
    
    /**
     * 获取 占位内容语言资源  
     * @return
     */
    @JsonIgnore
    public String getPHPSLanResName(){
        Object objValue = this.get(FIELD_PHPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 占位内容语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPHPSLanResNameDirty(){
        if(this.contains(FIELD_PHPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 占位内容语言资源
     */
    @JsonIgnore
    public void resetPHPSLanResName(){
        this.reset(FIELD_PHPSLANRESNAME);
    }

    /**
     * 设置 占位内容语言资源
     * <P>
     * 等同 {@link #setPHPSLanResName}
     * @param pHPSLanResName
     */
    @JsonIgnore
    public PSDEGridCol phpslanresname(String pHPSLanResName){
        this.setPHPSLanResName(pHPSLanResName);
        return this;
    }

    /**
     * <B>PICKUPPSDEVIEWID</B>&nbsp;选择界面视图，指定数据表格编辑项引用数据的选择视图对象，未定义时使用引用的属性界面模式的配置
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_PICKUPPSDEVIEWID = "pickuppsdeviewid";

    /**
     * 设置 选择界面视图，详细说明：{@link #FIELD_PICKUPPSDEVIEWID}
     * 
     * @param pickupPSDEViewId
     * 
     */
    @JsonProperty(FIELD_PICKUPPSDEVIEWID)
    public void setPickupPSDEViewId(String pickupPSDEViewId){
        this.set(FIELD_PICKUPPSDEVIEWID, pickupPSDEViewId);
    }
    
    /**
     * 获取 选择界面视图  
     * @return
     */
    @JsonIgnore
    public String getPickupPSDEViewId(){
        Object objValue = this.get(FIELD_PICKUPPSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 选择界面视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPickupPSDEViewIdDirty(){
        if(this.contains(FIELD_PICKUPPSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 选择界面视图
     */
    @JsonIgnore
    public void resetPickupPSDEViewId(){
        this.reset(FIELD_PICKUPPSDEVIEWID);
    }

    /**
     * 设置 选择界面视图，详细说明：{@link #FIELD_PICKUPPSDEVIEWID}
     * <P>
     * 等同 {@link #setPickupPSDEViewId}
     * @param pickupPSDEViewId
     */
    @JsonIgnore
    public PSDEGridCol pickuppsdeviewid(String pickupPSDEViewId){
        this.setPickupPSDEViewId(pickupPSDEViewId);
        return this;
    }

    /**
     * 设置 选择界面视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPickupPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSDEGridCol pickuppsdeviewid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setPickupPSDEViewId(null);
            this.setPickupPSDEViewName(null);
        }
        else{
            this.setPickupPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setPickupPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>PICKUPPSDEVIEWNAME</B>&nbsp;选择界面视图，指定数据表格编辑项引用数据的选择视图对象，未定义时使用引用的属性界面模式的配置
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PICKUPPSDEVIEWID}
     */
    public final static String FIELD_PICKUPPSDEVIEWNAME = "pickuppsdeviewname";

    /**
     * 设置 选择界面视图，详细说明：{@link #FIELD_PICKUPPSDEVIEWNAME}
     * 
     * @param pickupPSDEViewName
     * 
     */
    @JsonProperty(FIELD_PICKUPPSDEVIEWNAME)
    public void setPickupPSDEViewName(String pickupPSDEViewName){
        this.set(FIELD_PICKUPPSDEVIEWNAME, pickupPSDEViewName);
    }
    
    /**
     * 获取 选择界面视图  
     * @return
     */
    @JsonIgnore
    public String getPickupPSDEViewName(){
        Object objValue = this.get(FIELD_PICKUPPSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 选择界面视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPickupPSDEViewNameDirty(){
        if(this.contains(FIELD_PICKUPPSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 选择界面视图
     */
    @JsonIgnore
    public void resetPickupPSDEViewName(){
        this.reset(FIELD_PICKUPPSDEVIEWNAME);
    }

    /**
     * 设置 选择界面视图，详细说明：{@link #FIELD_PICKUPPSDEVIEWNAME}
     * <P>
     * 等同 {@link #setPickupPSDEViewName}
     * @param pickupPSDEViewName
     */
    @JsonIgnore
    public PSDEGridCol pickuppsdeviewname(String pickupPSDEViewName){
        this.setPickupPSDEViewName(pickupPSDEViewName);
        return this;
    }

    /**
     * <B>PLACEHOLDER</B>&nbsp;占位提示，指定数据表格编辑项编辑器的占位提示信息，未定义时使用引用的属性界面模式的配置
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PLACEHOLDER = "placeholder";

    /**
     * 设置 占位提示，详细说明：{@link #FIELD_PLACEHOLDER}
     * 
     * @param placeHolder
     * 
     */
    @JsonProperty(FIELD_PLACEHOLDER)
    public void setPlaceHolder(String placeHolder){
        this.set(FIELD_PLACEHOLDER, placeHolder);
    }
    
    /**
     * 获取 占位提示  
     * @return
     */
    @JsonIgnore
    public String getPlaceHolder(){
        Object objValue = this.get(FIELD_PLACEHOLDER);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 占位提示 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPlaceHolderDirty(){
        if(this.contains(FIELD_PLACEHOLDER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 占位提示
     */
    @JsonIgnore
    public void resetPlaceHolder(){
        this.reset(FIELD_PLACEHOLDER);
    }

    /**
     * 设置 占位提示，详细说明：{@link #FIELD_PLACEHOLDER}
     * <P>
     * 等同 {@link #setPlaceHolder}
     * @param placeHolder
     */
    @JsonIgnore
    public PSDEGridCol placeholder(String placeHolder){
        this.setPlaceHolder(placeHolder);
        return this;
    }

    /**
     * <B>PPSDEGRIDCOLID</B>&nbsp;父列，指定父表格列对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEGridCol} 
     */
    public final static String FIELD_PPSDEGRIDCOLID = "ppsdegridcolid";

    /**
     * 设置 父列，详细说明：{@link #FIELD_PPSDEGRIDCOLID}
     * 
     * @param pPSDEGridColId
     * 
     */
    @JsonProperty(FIELD_PPSDEGRIDCOLID)
    public void setPPSDEGridColId(String pPSDEGridColId){
        this.set(FIELD_PPSDEGRIDCOLID, pPSDEGridColId);
    }
    
    /**
     * 获取 父列  
     * @return
     */
    @JsonIgnore
    public String getPPSDEGridColId(){
        Object objValue = this.get(FIELD_PPSDEGRIDCOLID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父列 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSDEGridColIdDirty(){
        if(this.contains(FIELD_PPSDEGRIDCOLID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父列
     */
    @JsonIgnore
    public void resetPPSDEGridColId(){
        this.reset(FIELD_PPSDEGRIDCOLID);
    }

    /**
     * 设置 父列，详细说明：{@link #FIELD_PPSDEGRIDCOLID}
     * <P>
     * 等同 {@link #setPPSDEGridColId}
     * @param pPSDEGridColId
     */
    @JsonIgnore
    public PSDEGridCol ppsdegridcolid(String pPSDEGridColId){
        this.setPPSDEGridColId(pPSDEGridColId);
        return this;
    }

    /**
     * 设置 父列，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPPSDEGridColId}
     * @param pSDEGridCol 引用对象
     */
    @JsonIgnore
    public PSDEGridCol ppsdegridcolid(PSDEGridCol pSDEGridCol){
        if(pSDEGridCol == null){
            this.setPPSDEGridColId(null);
            this.setPPSDEGridColName(null);
        }
        else{
            this.setPPSDEGridColId(pSDEGridCol.getPSDEGridColId());
            this.setPPSDEGridColName(pSDEGridCol.getPSDEGridColName());
        }
        return this;
    }

    /**
     * <B>PPSDEGRIDCOLNAME</B>&nbsp;父列，指定父表格列对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PPSDEGRIDCOLID}
     */
    public final static String FIELD_PPSDEGRIDCOLNAME = "ppsdegridcolname";

    /**
     * 设置 父列，详细说明：{@link #FIELD_PPSDEGRIDCOLNAME}
     * 
     * @param pPSDEGridColName
     * 
     */
    @JsonProperty(FIELD_PPSDEGRIDCOLNAME)
    public void setPPSDEGridColName(String pPSDEGridColName){
        this.set(FIELD_PPSDEGRIDCOLNAME, pPSDEGridColName);
    }
    
    /**
     * 获取 父列  
     * @return
     */
    @JsonIgnore
    public String getPPSDEGridColName(){
        Object objValue = this.get(FIELD_PPSDEGRIDCOLNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父列 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSDEGridColNameDirty(){
        if(this.contains(FIELD_PPSDEGRIDCOLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父列
     */
    @JsonIgnore
    public void resetPPSDEGridColName(){
        this.reset(FIELD_PPSDEGRIDCOLNAME);
    }

    /**
     * 设置 父列，详细说明：{@link #FIELD_PPSDEGRIDCOLNAME}
     * <P>
     * 等同 {@link #setPPSDEGridColName}
     * @param pPSDEGridColName
     */
    @JsonIgnore
    public PSDEGridCol ppsdegridcolname(String pPSDEGridColName){
        this.setPPSDEGridColName(pPSDEGridColName);
        return this;
    }

    /**
     * <B>PREDEFINEDTYPE</B>&nbsp;预定义类型
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_PREDEFINEDTYPE = "predefinedtype";

    /**
     * 设置 预定义类型
     * 
     * @param predefinedType
     * 
     */
    @JsonProperty(FIELD_PREDEFINEDTYPE)
    public void setPredefinedType(String predefinedType){
        this.set(FIELD_PREDEFINEDTYPE, predefinedType);
    }
    
    /**
     * 获取 预定义类型  
     * @return
     */
    @JsonIgnore
    public String getPredefinedType(){
        Object objValue = this.get(FIELD_PREDEFINEDTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预定义类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPredefinedTypeDirty(){
        if(this.contains(FIELD_PREDEFINEDTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预定义类型
     */
    @JsonIgnore
    public void resetPredefinedType(){
        this.reset(FIELD_PREDEFINEDTYPE);
    }

    /**
     * 设置 预定义类型
     * <P>
     * 等同 {@link #setPredefinedType}
     * @param predefinedType
     */
    @JsonIgnore
    public PSDEGridCol predefinedtype(String predefinedType){
        this.setPredefinedType(predefinedType);
        return this;
    }

    /**
     * <B>PREDEFINEDTYPETEXT</B>&nbsp;预定义类型
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_PREDEFINEDTYPETEXT = "predefinedtypetext";

    /**
     * 设置 预定义类型
     * 
     * @param predefinedTypeText
     * 
     */
    @JsonProperty(FIELD_PREDEFINEDTYPETEXT)
    public void setPredefinedTypeText(String predefinedTypeText){
        this.set(FIELD_PREDEFINEDTYPETEXT, predefinedTypeText);
    }
    
    /**
     * 获取 预定义类型  
     * @return
     */
    @JsonIgnore
    public String getPredefinedTypeText(){
        Object objValue = this.get(FIELD_PREDEFINEDTYPETEXT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预定义类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPredefinedTypeTextDirty(){
        if(this.contains(FIELD_PREDEFINEDTYPETEXT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预定义类型
     */
    @JsonIgnore
    public void resetPredefinedTypeText(){
        this.reset(FIELD_PREDEFINEDTYPETEXT);
    }

    /**
     * 设置 预定义类型
     * <P>
     * 等同 {@link #setPredefinedTypeText}
     * @param predefinedTypeText
     */
    @JsonIgnore
    public PSDEGridCol predefinedtypetext(String predefinedTypeText){
        this.setPredefinedTypeText(predefinedTypeText);
        return this;
    }

    /**
     * <B>PSCODELISTID</B>&nbsp;系统代码表，指定数据表格编辑项的代码表对象，未定义时使用引用的属性界面模式的配置
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
    public PSDEGridCol pscodelistid(String pSCodeListId){
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
    public PSDEGridCol pscodelistid(PSCodeList pSCodeList){
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
     * <B>PSCODELISTNAME</B>&nbsp;系统代码表，指定数据表格编辑项的代码表对象，未定义时使用引用的属性界面模式的配置
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
    public PSDEGridCol pscodelistname(String pSCodeListName){
        this.setPSCodeListName(pSCodeListName);
        return this;
    }

    /**
     * <B>PSDEFID</B>&nbsp;实体属性，指定数据表格编辑项绑定的属性对象
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
    public PSDEGridCol psdefid(String pSDEFId){
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
    public PSDEGridCol psdefid(PSDEField pSDEField){
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
     * <B>PSDEFNAME</B>&nbsp;实体属性，指定数据表格编辑项绑定的属性对象
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
    public PSDEGridCol psdefname(String pSDEFName){
        this.setPSDEFName(pSDEFName);
        return this;
    }

    /**
     * <B>PSDEFSFITEMID</B>&nbsp;属性搜索模式
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEFSFItem} 
     */
    public final static String FIELD_PSDEFSFITEMID = "psdefsfitemid";

    /**
     * 设置 属性搜索模式
     * 
     * @param pSDEFSFItemId
     * 
     */
    @JsonProperty(FIELD_PSDEFSFITEMID)
    public void setPSDEFSFItemId(String pSDEFSFItemId){
        this.set(FIELD_PSDEFSFITEMID, pSDEFSFItemId);
    }
    
    /**
     * 获取 属性搜索模式  
     * @return
     */
    @JsonIgnore
    public String getPSDEFSFItemId(){
        Object objValue = this.get(FIELD_PSDEFSFITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性搜索模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFSFItemIdDirty(){
        if(this.contains(FIELD_PSDEFSFITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性搜索模式
     */
    @JsonIgnore
    public void resetPSDEFSFItemId(){
        this.reset(FIELD_PSDEFSFITEMID);
    }

    /**
     * 设置 属性搜索模式
     * <P>
     * 等同 {@link #setPSDEFSFItemId}
     * @param pSDEFSFItemId
     */
    @JsonIgnore
    public PSDEGridCol psdefsfitemid(String pSDEFSFItemId){
        this.setPSDEFSFItemId(pSDEFSFItemId);
        return this;
    }

    /**
     * 设置 属性搜索模式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEFSFItemId}
     * @param pSDEFSFItem 引用对象
     */
    @JsonIgnore
    public PSDEGridCol psdefsfitemid(PSDEFSFItem pSDEFSFItem){
        if(pSDEFSFItem == null){
            this.setPSDEFSFItemId(null);
            this.setPSDEFSFItemName(null);
        }
        else{
            this.setPSDEFSFItemId(pSDEFSFItem.getPSDEFSFItemId());
            this.setPSDEFSFItemName(pSDEFSFItem.getPSDEFSFItemName());
        }
        return this;
    }

    /**
     * <B>PSDEFSFITEMNAME</B>&nbsp;过滤器搜索模式
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFSFITEMID}
     */
    public final static String FIELD_PSDEFSFITEMNAME = "psdefsfitemname";

    /**
     * 设置 过滤器搜索模式
     * 
     * @param pSDEFSFItemName
     * 
     */
    @JsonProperty(FIELD_PSDEFSFITEMNAME)
    public void setPSDEFSFItemName(String pSDEFSFItemName){
        this.set(FIELD_PSDEFSFITEMNAME, pSDEFSFItemName);
    }
    
    /**
     * 获取 过滤器搜索模式  
     * @return
     */
    @JsonIgnore
    public String getPSDEFSFItemName(){
        Object objValue = this.get(FIELD_PSDEFSFITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 过滤器搜索模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFSFItemNameDirty(){
        if(this.contains(FIELD_PSDEFSFITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 过滤器搜索模式
     */
    @JsonIgnore
    public void resetPSDEFSFItemName(){
        this.reset(FIELD_PSDEFSFITEMNAME);
    }

    /**
     * 设置 过滤器搜索模式
     * <P>
     * 等同 {@link #setPSDEFSFItemName}
     * @param pSDEFSFItemName
     */
    @JsonIgnore
    public PSDEGridCol psdefsfitemname(String pSDEFSFItemName){
        this.setPSDEFSFItemName(pSDEFSFItemName);
        return this;
    }

    /**
     * <B>PSDEFUIMODEID</B>&nbsp;属性界面模式，指定数据表格项的属性界面模式，未定义时按照以下方式计算模式（1）当前应用的默认模式（2）当前应用类型的默认模式
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEFUIMode} 
     */
    public final static String FIELD_PSDEFUIMODEID = "psdefuimodeid";

    /**
     * 设置 属性界面模式，详细说明：{@link #FIELD_PSDEFUIMODEID}
     * 
     * @param pSDEFUIModeId
     * 
     */
    @JsonProperty(FIELD_PSDEFUIMODEID)
    public void setPSDEFUIModeId(String pSDEFUIModeId){
        this.set(FIELD_PSDEFUIMODEID, pSDEFUIModeId);
    }
    
    /**
     * 获取 属性界面模式  
     * @return
     */
    @JsonIgnore
    public String getPSDEFUIModeId(){
        Object objValue = this.get(FIELD_PSDEFUIMODEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性界面模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFUIModeIdDirty(){
        if(this.contains(FIELD_PSDEFUIMODEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性界面模式
     */
    @JsonIgnore
    public void resetPSDEFUIModeId(){
        this.reset(FIELD_PSDEFUIMODEID);
    }

    /**
     * 设置 属性界面模式，详细说明：{@link #FIELD_PSDEFUIMODEID}
     * <P>
     * 等同 {@link #setPSDEFUIModeId}
     * @param pSDEFUIModeId
     */
    @JsonIgnore
    public PSDEGridCol psdefuimodeid(String pSDEFUIModeId){
        this.setPSDEFUIModeId(pSDEFUIModeId);
        return this;
    }

    /**
     * 设置 属性界面模式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEFUIModeId}
     * @param pSDEFUIMode 引用对象
     */
    @JsonIgnore
    public PSDEGridCol psdefuimodeid(PSDEFUIMode pSDEFUIMode){
        if(pSDEFUIMode == null){
            this.setPSDEFUIModeId(null);
            this.setPSDEFUIModeName(null);
        }
        else{
            this.setPSDEFUIModeId(pSDEFUIMode.getPSDEFUIModeId());
            this.setPSDEFUIModeName(pSDEFUIMode.getPSDEFUIModeName());
        }
        return this;
    }

    /**
     * <B>PSDEFUIMODENAME</B>&nbsp;属性界面模式，指定数据表格项的属性界面模式，未定义时按照以下方式计算模式（1）当前应用的默认模式（2）当前应用类型的默认模式
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFUIMODEID}
     */
    public final static String FIELD_PSDEFUIMODENAME = "psdefuimodename";

    /**
     * 设置 属性界面模式，详细说明：{@link #FIELD_PSDEFUIMODENAME}
     * 
     * @param pSDEFUIModeName
     * 
     */
    @JsonProperty(FIELD_PSDEFUIMODENAME)
    public void setPSDEFUIModeName(String pSDEFUIModeName){
        this.set(FIELD_PSDEFUIMODENAME, pSDEFUIModeName);
    }
    
    /**
     * 获取 属性界面模式  
     * @return
     */
    @JsonIgnore
    public String getPSDEFUIModeName(){
        Object objValue = this.get(FIELD_PSDEFUIMODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性界面模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFUIModeNameDirty(){
        if(this.contains(FIELD_PSDEFUIMODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性界面模式
     */
    @JsonIgnore
    public void resetPSDEFUIModeName(){
        this.reset(FIELD_PSDEFUIMODENAME);
    }

    /**
     * 设置 属性界面模式，详细说明：{@link #FIELD_PSDEFUIMODENAME}
     * <P>
     * 等同 {@link #setPSDEFUIModeName}
     * @param pSDEFUIModeName
     */
    @JsonIgnore
    public PSDEGridCol psdefuimodename(String pSDEFUIModeName){
        this.setPSDEFUIModeName(pSDEFUIModeName);
        return this;
    }

    /**
     * <B>PSDEGEIUPDATEID</B>&nbsp;表格编辑项更新，指定数据表格编辑项值变化时触发的编辑项更新操作
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEGEIUpdate} 
     */
    public final static String FIELD_PSDEGEIUPDATEID = "psdegeiupdateid";

    /**
     * 设置 表格编辑项更新，详细说明：{@link #FIELD_PSDEGEIUPDATEID}
     * 
     * @param pSDEGEIUpdateId
     * 
     */
    @JsonProperty(FIELD_PSDEGEIUPDATEID)
    public void setPSDEGEIUpdateId(String pSDEGEIUpdateId){
        this.set(FIELD_PSDEGEIUPDATEID, pSDEGEIUpdateId);
    }
    
    /**
     * 获取 表格编辑项更新  
     * @return
     */
    @JsonIgnore
    public String getPSDEGEIUpdateId(){
        Object objValue = this.get(FIELD_PSDEGEIUPDATEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表格编辑项更新 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEGEIUpdateIdDirty(){
        if(this.contains(FIELD_PSDEGEIUPDATEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表格编辑项更新
     */
    @JsonIgnore
    public void resetPSDEGEIUpdateId(){
        this.reset(FIELD_PSDEGEIUPDATEID);
    }

    /**
     * 设置 表格编辑项更新，详细说明：{@link #FIELD_PSDEGEIUPDATEID}
     * <P>
     * 等同 {@link #setPSDEGEIUpdateId}
     * @param pSDEGEIUpdateId
     */
    @JsonIgnore
    public PSDEGridCol psdegeiupdateid(String pSDEGEIUpdateId){
        this.setPSDEGEIUpdateId(pSDEGEIUpdateId);
        return this;
    }

    /**
     * 设置 表格编辑项更新，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEGEIUpdateId}
     * @param pSDEGEIUpdate 引用对象
     */
    @JsonIgnore
    public PSDEGridCol psdegeiupdateid(PSDEGEIUpdate pSDEGEIUpdate){
        if(pSDEGEIUpdate == null){
            this.setPSDEGEIUpdateId(null);
            this.setPSDEGEIUpdateName(null);
        }
        else{
            this.setPSDEGEIUpdateId(pSDEGEIUpdate.getPSDEGEIUpdateId());
            this.setPSDEGEIUpdateName(pSDEGEIUpdate.getPSDEGEIUpdateName());
        }
        return this;
    }

    /**
     * <B>PSDEGEIUPDATENAME</B>&nbsp;表格编辑项更新，指定数据表格编辑项值变化时触发的编辑项更新操作
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEGEIUPDATEID}
     */
    public final static String FIELD_PSDEGEIUPDATENAME = "psdegeiupdatename";

    /**
     * 设置 表格编辑项更新，详细说明：{@link #FIELD_PSDEGEIUPDATENAME}
     * 
     * @param pSDEGEIUpdateName
     * 
     */
    @JsonProperty(FIELD_PSDEGEIUPDATENAME)
    public void setPSDEGEIUpdateName(String pSDEGEIUpdateName){
        this.set(FIELD_PSDEGEIUPDATENAME, pSDEGEIUpdateName);
    }
    
    /**
     * 获取 表格编辑项更新  
     * @return
     */
    @JsonIgnore
    public String getPSDEGEIUpdateName(){
        Object objValue = this.get(FIELD_PSDEGEIUPDATENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表格编辑项更新 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEGEIUpdateNameDirty(){
        if(this.contains(FIELD_PSDEGEIUPDATENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表格编辑项更新
     */
    @JsonIgnore
    public void resetPSDEGEIUpdateName(){
        this.reset(FIELD_PSDEGEIUPDATENAME);
    }

    /**
     * 设置 表格编辑项更新，详细说明：{@link #FIELD_PSDEGEIUPDATENAME}
     * <P>
     * 等同 {@link #setPSDEGEIUpdateName}
     * @param pSDEGEIUpdateName
     */
    @JsonIgnore
    public PSDEGridCol psdegeiupdatename(String pSDEGEIUpdateName){
        this.setPSDEGEIUpdateName(pSDEGEIUpdateName);
        return this;
    }

    /**
     * <B>PSDEGRIDCOLID</B>&nbsp;实体表格列标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEGRIDCOLID = "psdegridcolid";

    /**
     * 设置 实体表格列标识
     * 
     * @param pSDEGridColId
     * 
     */
    @JsonProperty(FIELD_PSDEGRIDCOLID)
    public void setPSDEGridColId(String pSDEGridColId){
        this.set(FIELD_PSDEGRIDCOLID, pSDEGridColId);
    }
    
    /**
     * 获取 实体表格列标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEGridColId(){
        Object objValue = this.get(FIELD_PSDEGRIDCOLID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体表格列标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEGridColIdDirty(){
        if(this.contains(FIELD_PSDEGRIDCOLID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体表格列标识
     */
    @JsonIgnore
    public void resetPSDEGridColId(){
        this.reset(FIELD_PSDEGRIDCOLID);
    }

    /**
     * 设置 实体表格列标识
     * <P>
     * 等同 {@link #setPSDEGridColId}
     * @param pSDEGridColId
     */
    @JsonIgnore
    public PSDEGridCol psdegridcolid(String pSDEGridColId){
        this.setPSDEGridColId(pSDEGridColId);
        return this;
    }

    /**
     * <B>PSDEGRIDCOLNAME</B>&nbsp;名称，指定表格列的标识，必须在所在表格部件中具备唯一性
     * <P>
     * 字符串：最大长度 200，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSDEGRIDCOLNAME = "psdegridcolname";

    /**
     * 设置 名称，详细说明：{@link #FIELD_PSDEGRIDCOLNAME}
     * 
     * @param pSDEGridColName
     * 
     */
    @JsonProperty(FIELD_PSDEGRIDCOLNAME)
    public void setPSDEGridColName(String pSDEGridColName){
        this.set(FIELD_PSDEGRIDCOLNAME, pSDEGridColName);
    }
    
    /**
     * 获取 名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEGridColName(){
        Object objValue = this.get(FIELD_PSDEGRIDCOLNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEGridColNameDirty(){
        if(this.contains(FIELD_PSDEGRIDCOLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 名称
     */
    @JsonIgnore
    public void resetPSDEGridColName(){
        this.reset(FIELD_PSDEGRIDCOLNAME);
    }

    /**
     * 设置 名称，详细说明：{@link #FIELD_PSDEGRIDCOLNAME}
     * <P>
     * 等同 {@link #setPSDEGridColName}
     * @param pSDEGridColName
     */
    @JsonIgnore
    public PSDEGridCol psdegridcolname(String pSDEGridColName){
        this.setPSDEGridColName(pSDEGridColName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEGridColName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEGridColName(strName);
    }

    @JsonIgnore
    public PSDEGridCol name(String strName){
        this.setPSDEGridColName(strName);
        return this;
    }

    /**
     * <B>PSDEGRIDID</B>&nbsp;实体表格，指定表格列所在的表格部件对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEGrid} 
     */
    public final static String FIELD_PSDEGRIDID = "psdegridid";

    /**
     * 设置 实体表格，详细说明：{@link #FIELD_PSDEGRIDID}
     * 
     * @param pSDEGridId
     * 
     */
    @JsonProperty(FIELD_PSDEGRIDID)
    public void setPSDEGridId(String pSDEGridId){
        this.set(FIELD_PSDEGRIDID, pSDEGridId);
    }
    
    /**
     * 获取 实体表格  
     * @return
     */
    @JsonIgnore
    public String getPSDEGridId(){
        Object objValue = this.get(FIELD_PSDEGRIDID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体表格 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEGridIdDirty(){
        if(this.contains(FIELD_PSDEGRIDID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体表格
     */
    @JsonIgnore
    public void resetPSDEGridId(){
        this.reset(FIELD_PSDEGRIDID);
    }

    /**
     * 设置 实体表格，详细说明：{@link #FIELD_PSDEGRIDID}
     * <P>
     * 等同 {@link #setPSDEGridId}
     * @param pSDEGridId
     */
    @JsonIgnore
    public PSDEGridCol psdegridid(String pSDEGridId){
        this.setPSDEGridId(pSDEGridId);
        return this;
    }

    /**
     * 设置 实体表格，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEGridId}
     * @param pSDEGrid 引用对象
     */
    @JsonIgnore
    public PSDEGridCol psdegridid(PSDEGrid pSDEGrid){
        if(pSDEGrid == null){
            this.setPSDEGridId(null);
            this.setPSDEGridName(null);
        }
        else{
            this.setPSDEGridId(pSDEGrid.getPSDEGridId());
            this.setPSDEGridName(pSDEGrid.getPSDEGridName());
        }
        return this;
    }

    /**
     * <B>PSDEGRIDNAME</B>&nbsp;实体表格，指定表格列所在的表格部件对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEGRIDID}
     */
    public final static String FIELD_PSDEGRIDNAME = "psdegridname";

    /**
     * 设置 实体表格，详细说明：{@link #FIELD_PSDEGRIDNAME}
     * 
     * @param pSDEGridName
     * 
     */
    @JsonProperty(FIELD_PSDEGRIDNAME)
    public void setPSDEGridName(String pSDEGridName){
        this.set(FIELD_PSDEGRIDNAME, pSDEGridName);
    }
    
    /**
     * 获取 实体表格  
     * @return
     */
    @JsonIgnore
    public String getPSDEGridName(){
        Object objValue = this.get(FIELD_PSDEGRIDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体表格 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEGridNameDirty(){
        if(this.contains(FIELD_PSDEGRIDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体表格
     */
    @JsonIgnore
    public void resetPSDEGridName(){
        this.reset(FIELD_PSDEGRIDNAME);
    }

    /**
     * 设置 实体表格，详细说明：{@link #FIELD_PSDEGRIDNAME}
     * <P>
     * 等同 {@link #setPSDEGridName}
     * @param pSDEGridName
     */
    @JsonIgnore
    public PSDEGridCol psdegridname(String pSDEGridName){
        this.setPSDEGridName(pSDEGridName);
        return this;
    }

    /**
     * <B>PSDEUAGROUPID</B>&nbsp;界面行为组，指定表格操作列绑定的界面行为组对象
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
    public PSDEGridCol psdeuagroupid(String pSDEUAGroupId){
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
    public PSDEGridCol psdeuagroupid(PSDEUAGroup pSDEUAGroup){
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
     * <B>PSDEUAGROUPNAME</B>&nbsp;界面行为组，指定表格操作列绑定的界面行为组对象
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
    public PSDEGridCol psdeuagroupname(String pSDEUAGroupName){
        this.setPSDEUAGroupName(pSDEUAGroupName);
        return this;
    }

    /**
     * <B>PSDEUIACTIONID</B>&nbsp;内置界面行为，指定属性表格列内置的界面行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEUIAction} 
     */
    public final static String FIELD_PSDEUIACTIONID = "psdeuiactionid";

    /**
     * 设置 内置界面行为，详细说明：{@link #FIELD_PSDEUIACTIONID}
     * 
     * @param pSDEUIActionId
     * 
     */
    @JsonProperty(FIELD_PSDEUIACTIONID)
    public void setPSDEUIActionId(String pSDEUIActionId){
        this.set(FIELD_PSDEUIACTIONID, pSDEUIActionId);
    }
    
    /**
     * 获取 内置界面行为  
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
     * 判断 内置界面行为 是否指定值，包括空值
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
     * 重置 内置界面行为
     */
    @JsonIgnore
    public void resetPSDEUIActionId(){
        this.reset(FIELD_PSDEUIACTIONID);
    }

    /**
     * 设置 内置界面行为，详细说明：{@link #FIELD_PSDEUIACTIONID}
     * <P>
     * 等同 {@link #setPSDEUIActionId}
     * @param pSDEUIActionId
     */
    @JsonIgnore
    public PSDEGridCol psdeuiactionid(String pSDEUIActionId){
        this.setPSDEUIActionId(pSDEUIActionId);
        return this;
    }

    /**
     * 设置 内置界面行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEUIActionId}
     * @param pSDEUIAction 引用对象
     */
    @JsonIgnore
    public PSDEGridCol psdeuiactionid(PSDEUIAction pSDEUIAction){
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
     * <B>PSDEUIACTIONNAME</B>&nbsp;内置界面行为，指定属性表格列内置的界面行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEUIACTIONID}
     */
    public final static String FIELD_PSDEUIACTIONNAME = "psdeuiactionname";

    /**
     * 设置 内置界面行为，详细说明：{@link #FIELD_PSDEUIACTIONNAME}
     * 
     * @param pSDEUIActionName
     * 
     */
    @JsonProperty(FIELD_PSDEUIACTIONNAME)
    public void setPSDEUIActionName(String pSDEUIActionName){
        this.set(FIELD_PSDEUIACTIONNAME, pSDEUIActionName);
    }
    
    /**
     * 获取 内置界面行为  
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
     * 判断 内置界面行为 是否指定值，包括空值
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
     * 重置 内置界面行为
     */
    @JsonIgnore
    public void resetPSDEUIActionName(){
        this.reset(FIELD_PSDEUIACTIONNAME);
    }

    /**
     * 设置 内置界面行为，详细说明：{@link #FIELD_PSDEUIACTIONNAME}
     * <P>
     * 等同 {@link #setPSDEUIActionName}
     * @param pSDEUIActionName
     */
    @JsonIgnore
    public PSDEGridCol psdeuiactionname(String pSDEUIActionName){
        this.setPSDEUIActionName(pSDEUIActionName);
        return this;
    }

    /**
     * <B>PSSYSDICTCATID</B>&nbsp;输入词条类别，指定数据表格编辑项编辑器使用的辅助输入词条类别对象，未定义时使用引用的属性界面模式的配置
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDictCat} 
     */
    public final static String FIELD_PSSYSDICTCATID = "pssysdictcatid";

    /**
     * 设置 输入词条类别，详细说明：{@link #FIELD_PSSYSDICTCATID}
     * 
     * @param pSSysDictCatId
     * 
     */
    @JsonProperty(FIELD_PSSYSDICTCATID)
    public void setPSSysDictCatId(String pSSysDictCatId){
        this.set(FIELD_PSSYSDICTCATID, pSSysDictCatId);
    }
    
    /**
     * 获取 输入词条类别  
     * @return
     */
    @JsonIgnore
    public String getPSSysDictCatId(){
        Object objValue = this.get(FIELD_PSSYSDICTCATID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输入词条类别 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDictCatIdDirty(){
        if(this.contains(FIELD_PSSYSDICTCATID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输入词条类别
     */
    @JsonIgnore
    public void resetPSSysDictCatId(){
        this.reset(FIELD_PSSYSDICTCATID);
    }

    /**
     * 设置 输入词条类别，详细说明：{@link #FIELD_PSSYSDICTCATID}
     * <P>
     * 等同 {@link #setPSSysDictCatId}
     * @param pSSysDictCatId
     */
    @JsonIgnore
    public PSDEGridCol pssysdictcatid(String pSSysDictCatId){
        this.setPSSysDictCatId(pSSysDictCatId);
        return this;
    }

    /**
     * 设置 输入词条类别，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDictCatId}
     * @param pSSysDictCat 引用对象
     */
    @JsonIgnore
    public PSDEGridCol pssysdictcatid(PSSysDictCat pSSysDictCat){
        if(pSSysDictCat == null){
            this.setPSSysDictCatId(null);
            this.setPSSysDictCatName(null);
        }
        else{
            this.setPSSysDictCatId(pSSysDictCat.getPSSysDictCatId());
            this.setPSSysDictCatName(pSSysDictCat.getPSSysDictCatName());
        }
        return this;
    }

    /**
     * <B>PSSYSDICTCATNAME</B>&nbsp;输入词条类别，指定数据表格编辑项编辑器使用的辅助输入词条类别对象，未定义时使用引用的属性界面模式的配置
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDICTCATID}
     */
    public final static String FIELD_PSSYSDICTCATNAME = "pssysdictcatname";

    /**
     * 设置 输入词条类别，详细说明：{@link #FIELD_PSSYSDICTCATNAME}
     * 
     * @param pSSysDictCatName
     * 
     */
    @JsonProperty(FIELD_PSSYSDICTCATNAME)
    public void setPSSysDictCatName(String pSSysDictCatName){
        this.set(FIELD_PSSYSDICTCATNAME, pSSysDictCatName);
    }
    
    /**
     * 获取 输入词条类别  
     * @return
     */
    @JsonIgnore
    public String getPSSysDictCatName(){
        Object objValue = this.get(FIELD_PSSYSDICTCATNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输入词条类别 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDictCatNameDirty(){
        if(this.contains(FIELD_PSSYSDICTCATNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输入词条类别
     */
    @JsonIgnore
    public void resetPSSysDictCatName(){
        this.reset(FIELD_PSSYSDICTCATNAME);
    }

    /**
     * 设置 输入词条类别，详细说明：{@link #FIELD_PSSYSDICTCATNAME}
     * <P>
     * 等同 {@link #setPSSysDictCatName}
     * @param pSSysDictCatName
     */
    @JsonIgnore
    public PSDEGridCol pssysdictcatname(String pSSysDictCatName){
        this.setPSSysDictCatName(pSSysDictCatName);
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
    public PSDEGridCol pssysdynamodelid(String pSSysDynaModelId){
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
    public PSDEGridCol pssysdynamodelid(PSSysDynaModel pSSysDynaModel){
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
    public PSDEGridCol pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSSYSEDITORSTYLEID</B>&nbsp;编辑器样式，指定数据表格编辑项的编辑器的扩展样式
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysEditorStyle} 
     */
    public final static String FIELD_PSSYSEDITORSTYLEID = "pssyseditorstyleid";

    /**
     * 设置 编辑器样式，详细说明：{@link #FIELD_PSSYSEDITORSTYLEID}
     * 
     * @param pSSysEditorStyleId
     * 
     */
    @JsonProperty(FIELD_PSSYSEDITORSTYLEID)
    public void setPSSysEditorStyleId(String pSSysEditorStyleId){
        this.set(FIELD_PSSYSEDITORSTYLEID, pSSysEditorStyleId);
    }
    
    /**
     * 获取 编辑器样式  
     * @return
     */
    @JsonIgnore
    public String getPSSysEditorStyleId(){
        Object objValue = this.get(FIELD_PSSYSEDITORSTYLEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 编辑器样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEditorStyleIdDirty(){
        if(this.contains(FIELD_PSSYSEDITORSTYLEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 编辑器样式
     */
    @JsonIgnore
    public void resetPSSysEditorStyleId(){
        this.reset(FIELD_PSSYSEDITORSTYLEID);
    }

    /**
     * 设置 编辑器样式，详细说明：{@link #FIELD_PSSYSEDITORSTYLEID}
     * <P>
     * 等同 {@link #setPSSysEditorStyleId}
     * @param pSSysEditorStyleId
     */
    @JsonIgnore
    public PSDEGridCol pssyseditorstyleid(String pSSysEditorStyleId){
        this.setPSSysEditorStyleId(pSSysEditorStyleId);
        return this;
    }

    /**
     * 设置 编辑器样式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysEditorStyleId}
     * @param pSSysEditorStyle 引用对象
     */
    @JsonIgnore
    public PSDEGridCol pssyseditorstyleid(PSSysEditorStyle pSSysEditorStyle){
        if(pSSysEditorStyle == null){
            this.setPSSysEditorStyleId(null);
            this.setPSSysEditorStyleName(null);
        }
        else{
            this.setPSSysEditorStyleId(pSSysEditorStyle.getPSSysEditorStyleId());
            this.setPSSysEditorStyleName(pSSysEditorStyle.getPSSysEditorStyleName());
        }
        return this;
    }

    /**
     * <B>PSSYSEDITORSTYLENAME</B>&nbsp;编辑器样式，指定数据表格编辑项的编辑器的扩展样式
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSEDITORSTYLEID}
     */
    public final static String FIELD_PSSYSEDITORSTYLENAME = "pssyseditorstylename";

    /**
     * 设置 编辑器样式，详细说明：{@link #FIELD_PSSYSEDITORSTYLENAME}
     * 
     * @param pSSysEditorStyleName
     * 
     */
    @JsonProperty(FIELD_PSSYSEDITORSTYLENAME)
    public void setPSSysEditorStyleName(String pSSysEditorStyleName){
        this.set(FIELD_PSSYSEDITORSTYLENAME, pSSysEditorStyleName);
    }
    
    /**
     * 获取 编辑器样式  
     * @return
     */
    @JsonIgnore
    public String getPSSysEditorStyleName(){
        Object objValue = this.get(FIELD_PSSYSEDITORSTYLENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 编辑器样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEditorStyleNameDirty(){
        if(this.contains(FIELD_PSSYSEDITORSTYLENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 编辑器样式
     */
    @JsonIgnore
    public void resetPSSysEditorStyleName(){
        this.reset(FIELD_PSSYSEDITORSTYLENAME);
    }

    /**
     * 设置 编辑器样式，详细说明：{@link #FIELD_PSSYSEDITORSTYLENAME}
     * <P>
     * 等同 {@link #setPSSysEditorStyleName}
     * @param pSSysEditorStyleName
     */
    @JsonIgnore
    public PSDEGridCol pssyseditorstylename(String pSSysEditorStyleName){
        this.setPSSysEditorStyleName(pSSysEditorStyleName);
        return this;
    }

    /**
     * <B>PSSYSIMAGEID</B>&nbsp;系统图片，指定数据表格列的图标对象，各类型成员按自身约定放置图标对象
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
    public PSDEGridCol pssysimageid(String pSSysImageId){
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
    public PSDEGridCol pssysimageid(PSSysImage pSSysImage){
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
     * <B>PSSYSIMAGENAME</B>&nbsp;系统图片，指定数据表格列的图标对象，各类型成员按自身约定放置图标对象
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
    public PSDEGridCol pssysimagename(String pSSysImageName){
        this.setPSSysImageName(pSSysImageName);
        return this;
    }

    /**
     * <B>RAWSERVICEMETHOD</B>&nbsp;直接服务请求方式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.RequestMethod} 
     */
    public final static String FIELD_RAWSERVICEMETHOD = "rawservicemethod";

    /**
     * 设置 直接服务请求方式
     * 
     * @param rawServiceMethod
     * 
     */
    @JsonProperty(FIELD_RAWSERVICEMETHOD)
    public void setRawServiceMethod(String rawServiceMethod){
        this.set(FIELD_RAWSERVICEMETHOD, rawServiceMethod);
    }
    
    /**
     * 获取 直接服务请求方式  
     * @return
     */
    @JsonIgnore
    public String getRawServiceMethod(){
        Object objValue = this.get(FIELD_RAWSERVICEMETHOD);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 直接服务请求方式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRawServiceMethodDirty(){
        if(this.contains(FIELD_RAWSERVICEMETHOD)){
            return true;
        }
        return false;
    }

    /**
     * 重置 直接服务请求方式
     */
    @JsonIgnore
    public void resetRawServiceMethod(){
        this.reset(FIELD_RAWSERVICEMETHOD);
    }

    /**
     * 设置 直接服务请求方式
     * <P>
     * 等同 {@link #setRawServiceMethod}
     * @param rawServiceMethod
     */
    @JsonIgnore
    public PSDEGridCol rawservicemethod(String rawServiceMethod){
        this.setRawServiceMethod(rawServiceMethod);
        return this;
    }

     /**
     * 设置 直接服务请求方式
     * <P>
     * 等同 {@link #setRawServiceMethod}
     * @param rawServiceMethod
     */
    @JsonIgnore
    public PSDEGridCol rawservicemethod(net.ibizsys.psmodel.core.util.PSModelEnums.RequestMethod rawServiceMethod){
        if(rawServiceMethod == null){
            this.setRawServiceMethod(null);
        }
        else{
            this.setRawServiceMethod(rawServiceMethod.value);
        }
        return this;
    }

    /**
     * <B>RAWSERVICEURL</B>&nbsp;直接服务路径
     */
    public final static String FIELD_RAWSERVICEURL = "rawserviceurl";

    /**
     * 设置 直接服务路径
     * 
     * @param rawServiceUrl
     * 
     */
    @JsonProperty(FIELD_RAWSERVICEURL)
    public void setRawServiceUrl(String rawServiceUrl){
        this.set(FIELD_RAWSERVICEURL, rawServiceUrl);
    }
    
    /**
     * 获取 直接服务路径  
     * @return
     */
    @JsonIgnore
    public String getRawServiceUrl(){
        Object objValue = this.get(FIELD_RAWSERVICEURL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 直接服务路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRawServiceUrlDirty(){
        if(this.contains(FIELD_RAWSERVICEURL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 直接服务路径
     */
    @JsonIgnore
    public void resetRawServiceUrl(){
        this.reset(FIELD_RAWSERVICEURL);
    }

    /**
     * 设置 直接服务路径
     * <P>
     * 等同 {@link #setRawServiceUrl}
     * @param rawServiceUrl
     */
    @JsonIgnore
    public PSDEGridCol rawserviceurl(String rawServiceUrl){
        this.setRawServiceUrl(rawServiceUrl);
        return this;
    }

    /**
     * <B>REFPSDEACMODEID</B>&nbsp;引用实体自填模式
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEACMode} 
     */
    public final static String FIELD_REFPSDEACMODEID = "refpsdeacmodeid";

    /**
     * 设置 引用实体自填模式
     * 
     * @param refPSDEACModeId
     * 
     */
    @JsonProperty(FIELD_REFPSDEACMODEID)
    public void setRefPSDEACModeId(String refPSDEACModeId){
        this.set(FIELD_REFPSDEACMODEID, refPSDEACModeId);
    }
    
    /**
     * 获取 引用实体自填模式  
     * @return
     */
    @JsonIgnore
    public String getRefPSDEACModeId(){
        Object objValue = this.get(FIELD_REFPSDEACMODEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用实体自填模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDEACModeIdDirty(){
        if(this.contains(FIELD_REFPSDEACMODEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用实体自填模式
     */
    @JsonIgnore
    public void resetRefPSDEACModeId(){
        this.reset(FIELD_REFPSDEACMODEID);
    }

    /**
     * 设置 引用实体自填模式
     * <P>
     * 等同 {@link #setRefPSDEACModeId}
     * @param refPSDEACModeId
     */
    @JsonIgnore
    public PSDEGridCol refpsdeacmodeid(String refPSDEACModeId){
        this.setRefPSDEACModeId(refPSDEACModeId);
        return this;
    }

    /**
     * 设置 引用实体自填模式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefPSDEACModeId}
     * @param pSDEACMode 引用对象
     */
    @JsonIgnore
    public PSDEGridCol refpsdeacmodeid(PSDEACMode pSDEACMode){
        if(pSDEACMode == null){
            this.setRefPSDEACModeId(null);
            this.setRefPSDEACModeName(null);
        }
        else{
            this.setRefPSDEACModeId(pSDEACMode.getPSDEACModeId());
            this.setRefPSDEACModeName(pSDEACMode.getPSDEACModeName());
        }
        return this;
    }

    /**
     * <B>REFPSDEACMODENAME</B>&nbsp;引用实体自填模式
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPSDEACMODEID}
     */
    public final static String FIELD_REFPSDEACMODENAME = "refpsdeacmodename";

    /**
     * 设置 引用实体自填模式
     * 
     * @param refPSDEACModeName
     * 
     */
    @JsonProperty(FIELD_REFPSDEACMODENAME)
    public void setRefPSDEACModeName(String refPSDEACModeName){
        this.set(FIELD_REFPSDEACMODENAME, refPSDEACModeName);
    }
    
    /**
     * 获取 引用实体自填模式  
     * @return
     */
    @JsonIgnore
    public String getRefPSDEACModeName(){
        Object objValue = this.get(FIELD_REFPSDEACMODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用实体自填模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDEACModeNameDirty(){
        if(this.contains(FIELD_REFPSDEACMODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用实体自填模式
     */
    @JsonIgnore
    public void resetRefPSDEACModeName(){
        this.reset(FIELD_REFPSDEACMODENAME);
    }

    /**
     * 设置 引用实体自填模式
     * <P>
     * 等同 {@link #setRefPSDEACModeName}
     * @param refPSDEACModeName
     */
    @JsonIgnore
    public PSDEGridCol refpsdeacmodename(String refPSDEACModeName){
        this.setRefPSDEACModeName(refPSDEACModeName);
        return this;
    }

    /**
     * <B>REFPSDEDATASETID</B>&nbsp;引用实体数据集
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataSet} 
     */
    public final static String FIELD_REFPSDEDATASETID = "refpsdedatasetid";

    /**
     * 设置 引用实体数据集
     * 
     * @param refPSDEDataSetId
     * 
     */
    @JsonProperty(FIELD_REFPSDEDATASETID)
    public void setRefPSDEDataSetId(String refPSDEDataSetId){
        this.set(FIELD_REFPSDEDATASETID, refPSDEDataSetId);
    }
    
    /**
     * 获取 引用实体数据集  
     * @return
     */
    @JsonIgnore
    public String getRefPSDEDataSetId(){
        Object objValue = this.get(FIELD_REFPSDEDATASETID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用实体数据集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDEDataSetIdDirty(){
        if(this.contains(FIELD_REFPSDEDATASETID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用实体数据集
     */
    @JsonIgnore
    public void resetRefPSDEDataSetId(){
        this.reset(FIELD_REFPSDEDATASETID);
    }

    /**
     * 设置 引用实体数据集
     * <P>
     * 等同 {@link #setRefPSDEDataSetId}
     * @param refPSDEDataSetId
     */
    @JsonIgnore
    public PSDEGridCol refpsdedatasetid(String refPSDEDataSetId){
        this.setRefPSDEDataSetId(refPSDEDataSetId);
        return this;
    }

    /**
     * 设置 引用实体数据集，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefPSDEDataSetId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSDEGridCol refpsdedatasetid(PSDEDataSet pSDEDataSet){
        if(pSDEDataSet == null){
            this.setRefPSDEDataSetId(null);
            this.setRefPSDEDataSetName(null);
        }
        else{
            this.setRefPSDEDataSetId(pSDEDataSet.getPSDEDataSetId());
            this.setRefPSDEDataSetName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    /**
     * <B>REFPSDEDATASETNAME</B>&nbsp;引用实体数据集
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPSDEDATASETID}
     */
    public final static String FIELD_REFPSDEDATASETNAME = "refpsdedatasetname";

    /**
     * 设置 引用实体数据集
     * 
     * @param refPSDEDataSetName
     * 
     */
    @JsonProperty(FIELD_REFPSDEDATASETNAME)
    public void setRefPSDEDataSetName(String refPSDEDataSetName){
        this.set(FIELD_REFPSDEDATASETNAME, refPSDEDataSetName);
    }
    
    /**
     * 获取 引用实体数据集  
     * @return
     */
    @JsonIgnore
    public String getRefPSDEDataSetName(){
        Object objValue = this.get(FIELD_REFPSDEDATASETNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用实体数据集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDEDataSetNameDirty(){
        if(this.contains(FIELD_REFPSDEDATASETNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用实体数据集
     */
    @JsonIgnore
    public void resetRefPSDEDataSetName(){
        this.reset(FIELD_REFPSDEDATASETNAME);
    }

    /**
     * 设置 引用实体数据集
     * <P>
     * 等同 {@link #setRefPSDEDataSetName}
     * @param refPSDEDataSetName
     */
    @JsonIgnore
    public PSDEGridCol refpsdedatasetname(String refPSDEDataSetName){
        this.setRefPSDEDataSetName(refPSDEDataSetName);
        return this;
    }

    /**
     * <B>REFPSDEID</B>&nbsp;引用实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_REFPSDEID = "refpsdeid";

    /**
     * 设置 引用实体
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
     * 设置 引用实体
     * <P>
     * 等同 {@link #setRefPSDEId}
     * @param refPSDEId
     */
    @JsonIgnore
    public PSDEGridCol refpsdeid(String refPSDEId){
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
    public PSDEGridCol refpsdeid(PSDataEntity pSDataEntity){
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
     * <B>REFPSDENAME</B>&nbsp;引用实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPSDEID}
     */
    public final static String FIELD_REFPSDENAME = "refpsdename";

    /**
     * 设置 引用实体
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
     * 设置 引用实体
     * <P>
     * 等同 {@link #setRefPSDEName}
     * @param refPSDEName
     */
    @JsonIgnore
    public PSDEGridCol refpsdename(String refPSDEName){
        this.setRefPSDEName(refPSDEName);
        return this;
    }

    /**
     * <B>REFPSDERID</B>&nbsp;引用实体关系，指定数据表格编辑项的引用实体关系
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDER} 
     */
    public final static String FIELD_REFPSDERID = "refpsderid";

    /**
     * 设置 引用实体关系，详细说明：{@link #FIELD_REFPSDERID}
     * 
     * @param refPSDERId
     * 
     */
    @JsonProperty(FIELD_REFPSDERID)
    public void setRefPSDERId(String refPSDERId){
        this.set(FIELD_REFPSDERID, refPSDERId);
    }
    
    /**
     * 获取 引用实体关系  
     * @return
     */
    @JsonIgnore
    public String getRefPSDERId(){
        Object objValue = this.get(FIELD_REFPSDERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用实体关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDERIdDirty(){
        if(this.contains(FIELD_REFPSDERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用实体关系
     */
    @JsonIgnore
    public void resetRefPSDERId(){
        this.reset(FIELD_REFPSDERID);
    }

    /**
     * 设置 引用实体关系，详细说明：{@link #FIELD_REFPSDERID}
     * <P>
     * 等同 {@link #setRefPSDERId}
     * @param refPSDERId
     */
    @JsonIgnore
    public PSDEGridCol refpsderid(String refPSDERId){
        this.setRefPSDERId(refPSDERId);
        return this;
    }

    /**
     * 设置 引用实体关系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefPSDERId}
     * @param pSDER 引用对象
     */
    @JsonIgnore
    public PSDEGridCol refpsderid(PSDER pSDER){
        if(pSDER == null){
            this.setRefPSDERId(null);
            this.setRefPSDERName(null);
        }
        else{
            this.setRefPSDERId(pSDER.getPSDERId());
            this.setRefPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    /**
     * <B>REFPSDERNAME</B>&nbsp;引用实体关系，指定数据表格编辑项的引用实体关系
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPSDERID}
     */
    public final static String FIELD_REFPSDERNAME = "refpsdername";

    /**
     * 设置 引用实体关系，详细说明：{@link #FIELD_REFPSDERNAME}
     * 
     * @param refPSDERName
     * 
     */
    @JsonProperty(FIELD_REFPSDERNAME)
    public void setRefPSDERName(String refPSDERName){
        this.set(FIELD_REFPSDERNAME, refPSDERName);
    }
    
    /**
     * 获取 引用实体关系  
     * @return
     */
    @JsonIgnore
    public String getRefPSDERName(){
        Object objValue = this.get(FIELD_REFPSDERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用实体关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDERNameDirty(){
        if(this.contains(FIELD_REFPSDERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用实体关系
     */
    @JsonIgnore
    public void resetRefPSDERName(){
        this.reset(FIELD_REFPSDERNAME);
    }

    /**
     * 设置 引用实体关系，详细说明：{@link #FIELD_REFPSDERNAME}
     * <P>
     * 等同 {@link #setRefPSDERName}
     * @param refPSDERName
     */
    @JsonIgnore
    public PSDEGridCol refpsdername(String refPSDERName){
        this.setRefPSDERName(refPSDERName);
        return this;
    }

    /**
     * <B>RENDERMODE</B>&nbsp;绘制模式
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_RENDERMODE = "rendermode";

    /**
     * 设置 绘制模式
     * 
     * @param renderMode
     * 
     */
    @JsonProperty(FIELD_RENDERMODE)
    public void setRenderMode(String renderMode){
        this.set(FIELD_RENDERMODE, renderMode);
    }
    
    /**
     * 获取 绘制模式  
     * @return
     */
    @JsonIgnore
    public String getRenderMode(){
        Object objValue = this.get(FIELD_RENDERMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 绘制模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRenderModeDirty(){
        if(this.contains(FIELD_RENDERMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 绘制模式
     */
    @JsonIgnore
    public void resetRenderMode(){
        this.reset(FIELD_RENDERMODE);
    }

    /**
     * 设置 绘制模式
     * <P>
     * 等同 {@link #setRenderMode}
     * @param renderMode
     */
    @JsonIgnore
    public PSDEGridCol rendermode(String renderMode){
        this.setRenderMode(renderMode);
        return this;
    }

    /**
     * <B>RENDERMODETEXT</B>&nbsp;绘制模式
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_RENDERMODETEXT = "rendermodetext";

    /**
     * 设置 绘制模式
     * 
     * @param renderModeText
     * 
     */
    @JsonProperty(FIELD_RENDERMODETEXT)
    public void setRenderModeText(String renderModeText){
        this.set(FIELD_RENDERMODETEXT, renderModeText);
    }
    
    /**
     * 获取 绘制模式  
     * @return
     */
    @JsonIgnore
    public String getRenderModeText(){
        Object objValue = this.get(FIELD_RENDERMODETEXT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 绘制模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRenderModeTextDirty(){
        if(this.contains(FIELD_RENDERMODETEXT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 绘制模式
     */
    @JsonIgnore
    public void resetRenderModeText(){
        this.reset(FIELD_RENDERMODETEXT);
    }

    /**
     * 设置 绘制模式
     * <P>
     * 等同 {@link #setRenderModeText}
     * @param renderModeText
     */
    @JsonIgnore
    public PSDEGridCol rendermodetext(String renderModeText){
        this.setRenderModeText(renderModeText);
        return this;
    }

    /**
     * <B>RESETITEMNAME</B>&nbsp;重置项名称，指定表格编辑项监控的重置项名称，重置项值变化时重置当前项
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_RESETITEMNAME = "resetitemname";

    /**
     * 设置 重置项名称，详细说明：{@link #FIELD_RESETITEMNAME}
     * 
     * @param resetItemName
     * 
     */
    @JsonProperty(FIELD_RESETITEMNAME)
    public void setResetItemName(String resetItemName){
        this.set(FIELD_RESETITEMNAME, resetItemName);
    }
    
    /**
     * 获取 重置项名称  
     * @return
     */
    @JsonIgnore
    public String getResetItemName(){
        Object objValue = this.get(FIELD_RESETITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 重置项名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isResetItemNameDirty(){
        if(this.contains(FIELD_RESETITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 重置项名称
     */
    @JsonIgnore
    public void resetResetItemName(){
        this.reset(FIELD_RESETITEMNAME);
    }

    /**
     * 设置 重置项名称，详细说明：{@link #FIELD_RESETITEMNAME}
     * <P>
     * 等同 {@link #setResetItemName}
     * @param resetItemName
     */
    @JsonIgnore
    public PSDEGridCol resetitemname(String resetItemName){
        this.setResetItemName(resetItemName);
        return this;
    }

    /**
     * <B>TREEITEM</B>&nbsp;树表列模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.GridTreeColMode} 
     */
    public final static String FIELD_TREEITEM = "treeitem";

    /**
     * 设置 树表列模式
     * 
     * @param treeItem
     * 
     */
    @JsonProperty(FIELD_TREEITEM)
    public void setTreeItem(Integer treeItem){
        this.set(FIELD_TREEITEM, treeItem);
    }
    
    /**
     * 获取 树表列模式  
     * @return
     */
    @JsonIgnore
    public Integer getTreeItem(){
        Object objValue = this.get(FIELD_TREEITEM);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 树表列模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTreeItemDirty(){
        if(this.contains(FIELD_TREEITEM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 树表列模式
     */
    @JsonIgnore
    public void resetTreeItem(){
        this.reset(FIELD_TREEITEM);
    }

    /**
     * 设置 树表列模式
     * <P>
     * 等同 {@link #setTreeItem}
     * @param treeItem
     */
    @JsonIgnore
    public PSDEGridCol treeitem(Integer treeItem){
        this.setTreeItem(treeItem);
        return this;
    }

     /**
     * 设置 树表列模式
     * <P>
     * 等同 {@link #setTreeItem}
     * @param treeItem
     */
    @JsonIgnore
    public PSDEGridCol treeitem(net.ibizsys.psmodel.core.util.PSModelEnums.GridTreeColMode treeItem){
        if(treeItem == null){
            this.setTreeItem(null);
        }
        else{
            this.setTreeItem(treeItem.value);
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
    public PSDEGridCol updatedate(String updateDate){
        this.setUpdateDate(updateDate);
        return this;
    }

    /**
     * <B>UPDATEDV</B>&nbsp;更新默认值，指定表格编辑项的更新默认值，未指定默认值类型时按直接值处理
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
    public PSDEGridCol updatedv(String updateDV){
        this.setUpdateDV(updateDV);
        return this;
    }

    /**
     * <B>UPDATEDVT</B>&nbsp;更新默认值类型，指定表格编辑项的更新默认值类型，未定义时为【直接值】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.UpdateDefaultValueType} 
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
    public PSDEGridCol updatedvt(String updateDVT){
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
    public PSDEGridCol updatedvt(net.ibizsys.psmodel.core.util.PSModelEnums.UpdateDefaultValueType updateDVT){
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
    public PSDEGridCol updateman(String updateMan){
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
    public PSDEGridCol userparams(String userParams){
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
    public PSDEGridCol usertag(String userTag){
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
    public PSDEGridCol usertag2(String userTag2){
        this.setUserTag2(userTag2);
        return this;
    }

    /**
     * <B>VALUEFORMAT</B>&nbsp;值格式化，指定属性表格列的值格式化串，未定义时使用引用的属性界面模式的配置
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_VALUEFORMAT = "valueformat";

    /**
     * 设置 值格式化，详细说明：{@link #FIELD_VALUEFORMAT}
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
     * 设置 值格式化，详细说明：{@link #FIELD_VALUEFORMAT}
     * <P>
     * 等同 {@link #setValueFormat}
     * @param valueFormat
     */
    @JsonIgnore
    public PSDEGridCol valueformat(String valueFormat){
        this.setValueFormat(valueFormat);
        return this;
    }

    /**
     * <B>VALUEITEMNAME</B>&nbsp;值项名称，编辑器实际值项回填的编辑项
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_VALUEITEMNAME = "valueitemname";

    /**
     * 设置 值项名称，详细说明：{@link #FIELD_VALUEITEMNAME}
     * 
     * @param valueItemName
     * 
     */
    @JsonProperty(FIELD_VALUEITEMNAME)
    public void setValueItemName(String valueItemName){
        this.set(FIELD_VALUEITEMNAME, valueItemName);
    }
    
    /**
     * 获取 值项名称  
     * @return
     */
    @JsonIgnore
    public String getValueItemName(){
        Object objValue = this.get(FIELD_VALUEITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值项名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isValueItemNameDirty(){
        if(this.contains(FIELD_VALUEITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值项名称
     */
    @JsonIgnore
    public void resetValueItemName(){
        this.reset(FIELD_VALUEITEMNAME);
    }

    /**
     * 设置 值项名称，详细说明：{@link #FIELD_VALUEITEMNAME}
     * <P>
     * 等同 {@link #setValueItemName}
     * @param valueItemName
     */
    @JsonIgnore
    public PSDEGridCol valueitemname(String valueItemName){
        this.setValueItemName(valueItemName);
        return this;
    }

    /**
     * <B>WIDTH</B>&nbsp;宽度，指定表格列的宽度，未定义时为【100】
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
    public PSDEGridCol width(Integer width){
        this.setWidth(width);
        return this;
    }

    /**
     * <B>WIDTHUNIT</B>&nbsp;宽度单位，指定表格列宽度的单位，未定义时为【px】
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
    public PSDEGridCol widthunit(String widthUnit){
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
    public PSDEGridCol widthunit(net.ibizsys.psmodel.core.util.PSModelEnums.GridColWidthUnitType widthUnit){
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
        return this.getPSDEGridColId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEGridColId(strValue);
    }

    @JsonIgnore
    public PSDEGridCol id(String strValue){
        this.setPSDEGridColId(strValue);
        return this;
    }


    /**
     *  表格列 成员集合
     */
    public final static String FIELD_PSDEGRIDCOLS = "psdegridcols";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSDEGridCol> psdegridcols;

    /**
     * 获取 表格列 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEGRIDCOLS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEGridCol> getPSDEGridCols(){
        return this.psdegridcols;
    }

    /**
     * 设置 表格列 成员集合  
     * @param psdegridcols
     */
    @JsonProperty(FIELD_PSDEGRIDCOLS)
    public void setPSDEGridCols(java.util.List<net.ibizsys.psmodel.core.domain.PSDEGridCol> psdegridcols){
        this.psdegridcols = psdegridcols;
    }

    /**
     * 获取 表格列 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEGridCol> getPSDEGridColsIf(){
        if(this.psdegridcols == null){
            this.psdegridcols = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSDEGridCol>();          
        }
        return this.psdegridcols;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEGridCol){
            PSDEGridCol model = (PSDEGridCol)iPSModel;
            model.setPSDEGridCols(this.getPSDEGridCols());
        }
        super.copyTo(iPSModel);
    }
}
