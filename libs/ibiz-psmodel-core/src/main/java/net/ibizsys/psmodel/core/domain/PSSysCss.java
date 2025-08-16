package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSCSS</B>系统界面样式表 模型传输对象
 * <P>
 * 系统统一的界面样式表模型，支持定义字体、边框、背景等基本样式信息，也支持直接自定义样式内容。注意：设定的样式值需符合CSS规范
 */
public class PSSysCss extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysCss(){
    }      

    /**
     * <B>BKCOLOR</B>&nbsp;背景颜色，指定容器背景颜色
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_BKCOLOR = "bkcolor";

    /**
     * 设置 背景颜色，详细说明：{@link #FIELD_BKCOLOR}
     * 
     * @param bKColor
     * 
     */
    @JsonProperty(FIELD_BKCOLOR)
    public void setBKColor(String bKColor){
        this.set(FIELD_BKCOLOR, bKColor);
    }
    
    /**
     * 获取 背景颜色  
     * @return
     */
    @JsonIgnore
    public String getBKColor(){
        Object objValue = this.get(FIELD_BKCOLOR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 背景颜色 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBKColorDirty(){
        if(this.contains(FIELD_BKCOLOR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 背景颜色
     */
    @JsonIgnore
    public void resetBKColor(){
        this.reset(FIELD_BKCOLOR);
    }

    /**
     * 设置 背景颜色，详细说明：{@link #FIELD_BKCOLOR}
     * <P>
     * 等同 {@link #setBKColor}
     * @param bKColor
     */
    @JsonIgnore
    public PSSysCss bkcolor(String bKColor){
        this.setBKColor(bKColor);
        return this;
    }

    /**
     * <B>BORDER</B>&nbsp;边框，指定容器边框宽度
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_BORDER = "border";

    /**
     * 设置 边框，详细说明：{@link #FIELD_BORDER}
     * 
     * @param border
     * 
     */
    @JsonProperty(FIELD_BORDER)
    public void setBorder(String border){
        this.set(FIELD_BORDER, border);
    }
    
    /**
     * 获取 边框  
     * @return
     */
    @JsonIgnore
    public String getBorder(){
        Object objValue = this.get(FIELD_BORDER);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 边框 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBorderDirty(){
        if(this.contains(FIELD_BORDER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 边框
     */
    @JsonIgnore
    public void resetBorder(){
        this.reset(FIELD_BORDER);
    }

    /**
     * 设置 边框，详细说明：{@link #FIELD_BORDER}
     * <P>
     * 等同 {@link #setBorder}
     * @param border
     */
    @JsonIgnore
    public PSSysCss border(String border){
        this.setBorder(border);
        return this;
    }

    /**
     * <B>BORDERCOLOR</B>&nbsp;边框颜色，指定容器边框的颜色
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_BORDERCOLOR = "bordercolor";

    /**
     * 设置 边框颜色，详细说明：{@link #FIELD_BORDERCOLOR}
     * 
     * @param borderColor
     * 
     */
    @JsonProperty(FIELD_BORDERCOLOR)
    public void setBorderColor(String borderColor){
        this.set(FIELD_BORDERCOLOR, borderColor);
    }
    
    /**
     * 获取 边框颜色  
     * @return
     */
    @JsonIgnore
    public String getBorderColor(){
        Object objValue = this.get(FIELD_BORDERCOLOR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 边框颜色 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBorderColorDirty(){
        if(this.contains(FIELD_BORDERCOLOR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 边框颜色
     */
    @JsonIgnore
    public void resetBorderColor(){
        this.reset(FIELD_BORDERCOLOR);
    }

    /**
     * 设置 边框颜色，详细说明：{@link #FIELD_BORDERCOLOR}
     * <P>
     * 等同 {@link #setBorderColor}
     * @param borderColor
     */
    @JsonIgnore
    public PSSysCss bordercolor(String borderColor){
        this.setBorderColor(borderColor);
        return this;
    }

    /**
     * <B>BORDERSTYLE</B>&nbsp;边框样式，指定容器边框的样式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.BorderStyle} 
     */
    public final static String FIELD_BORDERSTYLE = "borderstyle";

    /**
     * 设置 边框样式，详细说明：{@link #FIELD_BORDERSTYLE}
     * 
     * @param borderStyle
     * 
     */
    @JsonProperty(FIELD_BORDERSTYLE)
    public void setBorderStyle(String borderStyle){
        this.set(FIELD_BORDERSTYLE, borderStyle);
    }
    
    /**
     * 获取 边框样式  
     * @return
     */
    @JsonIgnore
    public String getBorderStyle(){
        Object objValue = this.get(FIELD_BORDERSTYLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 边框样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBorderStyleDirty(){
        if(this.contains(FIELD_BORDERSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 边框样式
     */
    @JsonIgnore
    public void resetBorderStyle(){
        this.reset(FIELD_BORDERSTYLE);
    }

    /**
     * 设置 边框样式，详细说明：{@link #FIELD_BORDERSTYLE}
     * <P>
     * 等同 {@link #setBorderStyle}
     * @param borderStyle
     */
    @JsonIgnore
    public PSSysCss borderstyle(String borderStyle){
        this.setBorderStyle(borderStyle);
        return this;
    }

     /**
     * 设置 边框样式，详细说明：{@link #FIELD_BORDERSTYLE}
     * <P>
     * 等同 {@link #setBorderStyle}
     * @param borderStyle
     */
    @JsonIgnore
    public PSSysCss borderstyle(net.ibizsys.psmodel.core.util.PSModelEnums.BorderStyle borderStyle){
        if(borderStyle == null){
            this.setBorderStyle(null);
        }
        else{
            this.setBorderStyle(borderStyle.value);
        }
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定界面样式表的代码标识，需要在所在的模型域（系统模块或系统）中具有唯一性
     * <P>
     * 字符串：最大长度 30，由字母、数字、下划线组成，且开始必须为字母
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
    public PSSysCss codename(String codeName){
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
    public PSSysCss createdate(String createDate){
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
    public PSSysCss createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CSSCATNAME</B>&nbsp;Css分类名称
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSCSSCATID}
     */
    public final static String FIELD_CSSCATNAME = "csscatname";

    /**
     * 设置 Css分类名称
     * 
     * @param cssCatName
     * 
     */
    @JsonProperty(FIELD_CSSCATNAME)
    public void setCssCatName(String cssCatName){
        this.set(FIELD_CSSCATNAME, cssCatName);
    }
    
    /**
     * 获取 Css分类名称  
     * @return
     */
    @JsonIgnore
    public String getCssCatName(){
        Object objValue = this.get(FIELD_CSSCATNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 Css分类名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCssCatNameDirty(){
        if(this.contains(FIELD_CSSCATNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 Css分类名称
     */
    @JsonIgnore
    public void resetCssCatName(){
        this.reset(FIELD_CSSCATNAME);
    }

    /**
     * 设置 Css分类名称
     * <P>
     * 等同 {@link #setCssCatName}
     * @param cssCatName
     */
    @JsonIgnore
    public PSSysCss csscatname(String cssCatName){
        this.setCssCatName(cssCatName);
        return this;
    }

    /**
     * <B>CSSNAME</B>&nbsp;CSS名称，指定样式表的名称
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CSSNAME = "cssname";

    /**
     * 设置 CSS名称，详细说明：{@link #FIELD_CSSNAME}
     * 
     * @param cSSName
     * 
     */
    @JsonProperty(FIELD_CSSNAME)
    public void setCSSName(String cSSName){
        this.set(FIELD_CSSNAME, cSSName);
    }
    
    /**
     * 获取 CSS名称  
     * @return
     */
    @JsonIgnore
    public String getCSSName(){
        Object objValue = this.get(FIELD_CSSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 CSS名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCSSNameDirty(){
        if(this.contains(FIELD_CSSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 CSS名称
     */
    @JsonIgnore
    public void resetCSSName(){
        this.reset(FIELD_CSSNAME);
    }

    /**
     * 设置 CSS名称，详细说明：{@link #FIELD_CSSNAME}
     * <P>
     * 等同 {@link #setCSSName}
     * @param cSSName
     */
    @JsonIgnore
    public PSSysCss cssname(String cSSName){
        this.setCSSName(cSSName);
        return this;
    }

    /**
     * <B>CSSSTYLE</B>&nbsp;CSS内容，指定样式表的自定义内容
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_CSSSTYLE = "cssstyle";

    /**
     * 设置 CSS内容，详细说明：{@link #FIELD_CSSSTYLE}
     * 
     * @param cSSStyle
     * 
     */
    @JsonProperty(FIELD_CSSSTYLE)
    public void setCSSStyle(String cSSStyle){
        this.set(FIELD_CSSSTYLE, cSSStyle);
    }
    
    /**
     * 获取 CSS内容  
     * @return
     */
    @JsonIgnore
    public String getCSSStyle(){
        Object objValue = this.get(FIELD_CSSSTYLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 CSS内容 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCSSStyleDirty(){
        if(this.contains(FIELD_CSSSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 CSS内容
     */
    @JsonIgnore
    public void resetCSSStyle(){
        this.reset(FIELD_CSSSTYLE);
    }

    /**
     * 设置 CSS内容，详细说明：{@link #FIELD_CSSSTYLE}
     * <P>
     * 等同 {@link #setCSSStyle}
     * @param cSSStyle
     */
    @JsonIgnore
    public PSSysCss cssstyle(String cSSStyle){
        this.setCSSStyle(cSSStyle);
        return this;
    }

    /**
     * <B>CSSSTYLE2</B>&nbsp;CSS样式内容（长）
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_CSSSTYLE2 = "cssstyle2";

    /**
     * 设置 CSS样式内容（长）
     * 
     * @param cssStyle2
     * 
     */
    @JsonProperty(FIELD_CSSSTYLE2)
    public void setCssStyle2(String cssStyle2){
        this.set(FIELD_CSSSTYLE2, cssStyle2);
    }
    
    /**
     * 获取 CSS样式内容（长）  
     * @return
     */
    @JsonIgnore
    public String getCssStyle2(){
        Object objValue = this.get(FIELD_CSSSTYLE2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 CSS样式内容（长） 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCssStyle2Dirty(){
        if(this.contains(FIELD_CSSSTYLE2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 CSS样式内容（长）
     */
    @JsonIgnore
    public void resetCssStyle2(){
        this.reset(FIELD_CSSSTYLE2);
    }

    /**
     * 设置 CSS样式内容（长）
     * <P>
     * 等同 {@link #setCssStyle2}
     * @param cssStyle2
     */
    @JsonIgnore
    public PSSysCss cssstyle2(String cssStyle2){
        this.setCssStyle2(cssStyle2);
        return this;
    }

    /**
     * <B>FONTCOLOR</B>&nbsp;字体颜色，指定容器文本的字体颜色
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_FONTCOLOR = "fontcolor";

    /**
     * 设置 字体颜色，详细说明：{@link #FIELD_FONTCOLOR}
     * 
     * @param fontColor
     * 
     */
    @JsonProperty(FIELD_FONTCOLOR)
    public void setFontColor(String fontColor){
        this.set(FIELD_FONTCOLOR, fontColor);
    }
    
    /**
     * 获取 字体颜色  
     * @return
     */
    @JsonIgnore
    public String getFontColor(){
        Object objValue = this.get(FIELD_FONTCOLOR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 字体颜色 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFontColorDirty(){
        if(this.contains(FIELD_FONTCOLOR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 字体颜色
     */
    @JsonIgnore
    public void resetFontColor(){
        this.reset(FIELD_FONTCOLOR);
    }

    /**
     * 设置 字体颜色，详细说明：{@link #FIELD_FONTCOLOR}
     * <P>
     * 等同 {@link #setFontColor}
     * @param fontColor
     */
    @JsonIgnore
    public PSSysCss fontcolor(String fontColor){
        this.setFontColor(fontColor);
        return this;
    }

    /**
     * <B>FONTFAMILY</B>&nbsp;字体，指定容器文本的字体
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_FONTFAMILY = "fontfamily";

    /**
     * 设置 字体，详细说明：{@link #FIELD_FONTFAMILY}
     * 
     * @param fontFamily
     * 
     */
    @JsonProperty(FIELD_FONTFAMILY)
    public void setFontFamily(String fontFamily){
        this.set(FIELD_FONTFAMILY, fontFamily);
    }
    
    /**
     * 获取 字体  
     * @return
     */
    @JsonIgnore
    public String getFontFamily(){
        Object objValue = this.get(FIELD_FONTFAMILY);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 字体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFontFamilyDirty(){
        if(this.contains(FIELD_FONTFAMILY)){
            return true;
        }
        return false;
    }

    /**
     * 重置 字体
     */
    @JsonIgnore
    public void resetFontFamily(){
        this.reset(FIELD_FONTFAMILY);
    }

    /**
     * 设置 字体，详细说明：{@link #FIELD_FONTFAMILY}
     * <P>
     * 等同 {@link #setFontFamily}
     * @param fontFamily
     */
    @JsonIgnore
    public PSSysCss fontfamily(String fontFamily){
        this.setFontFamily(fontFamily);
        return this;
    }

    /**
     * <B>FONTSIZE</B>&nbsp;字体大小，指定容器文本的大小
     */
    public final static String FIELD_FONTSIZE = "fontsize";

    /**
     * 设置 字体大小，详细说明：{@link #FIELD_FONTSIZE}
     * 
     * @param fontSize
     * 
     */
    @JsonProperty(FIELD_FONTSIZE)
    public void setFontSize(Integer fontSize){
        this.set(FIELD_FONTSIZE, fontSize);
    }
    
    /**
     * 获取 字体大小  
     * @return
     */
    @JsonIgnore
    public Integer getFontSize(){
        Object objValue = this.get(FIELD_FONTSIZE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 字体大小 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFontSizeDirty(){
        if(this.contains(FIELD_FONTSIZE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 字体大小
     */
    @JsonIgnore
    public void resetFontSize(){
        this.reset(FIELD_FONTSIZE);
    }

    /**
     * 设置 字体大小，详细说明：{@link #FIELD_FONTSIZE}
     * <P>
     * 等同 {@link #setFontSize}
     * @param fontSize
     */
    @JsonIgnore
    public PSSysCss fontsize(Integer fontSize){
        this.setFontSize(fontSize);
        return this;
    }

    /**
     * <B>FONTSTYLE</B>&nbsp;字体样式，指定容器文本的样式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.FontStyle} 
     */
    public final static String FIELD_FONTSTYLE = "fontstyle";

    /**
     * 设置 字体样式，详细说明：{@link #FIELD_FONTSTYLE}
     * 
     * @param fontStyle
     * 
     */
    @JsonProperty(FIELD_FONTSTYLE)
    public void setFontStyle(Integer fontStyle){
        this.set(FIELD_FONTSTYLE, fontStyle);
    }
    
    /**
     * 获取 字体样式  
     * @return
     */
    @JsonIgnore
    public Integer getFontStyle(){
        Object objValue = this.get(FIELD_FONTSTYLE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 字体样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFontStyleDirty(){
        if(this.contains(FIELD_FONTSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 字体样式
     */
    @JsonIgnore
    public void resetFontStyle(){
        this.reset(FIELD_FONTSTYLE);
    }

    /**
     * 设置 字体样式，详细说明：{@link #FIELD_FONTSTYLE}
     * <P>
     * 等同 {@link #setFontStyle}
     * @param fontStyle
     */
    @JsonIgnore
    public PSSysCss fontstyle(Integer fontStyle){
        this.setFontStyle(fontStyle);
        return this;
    }

     /**
     * 设置 字体样式，详细说明：{@link #FIELD_FONTSTYLE}
     * <P>
     * 等同 {@link #setFontStyle}
     * @param fontStyle
     */
    @JsonIgnore
    public PSSysCss fontstyle(net.ibizsys.psmodel.core.util.PSModelEnums.FontStyle[] fontStyle){
        if(fontStyle == null || fontStyle.length == 0){
            this.setFontStyle(null);
        }
        else{
            int _value = 0;
            for(net.ibizsys.psmodel.core.util.PSModelEnums.FontStyle _item : fontStyle){
                _value |= _item.value;
            }
            this.setFontStyle(_value);
        }
        return this;
    }

    /**
     * <B>FULLCSSNAME</B>&nbsp;完整CSS样式名称
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_FULLCSSNAME = "fullcssname";

    /**
     * 设置 完整CSS样式名称
     * 
     * @param fullCssName
     * 
     */
    @JsonProperty(FIELD_FULLCSSNAME)
    public void setFullCssName(String fullCssName){
        this.set(FIELD_FULLCSSNAME, fullCssName);
    }
    
    /**
     * 获取 完整CSS样式名称  
     * @return
     */
    @JsonIgnore
    public String getFullCssName(){
        Object objValue = this.get(FIELD_FULLCSSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 完整CSS样式名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFullCssNameDirty(){
        if(this.contains(FIELD_FULLCSSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 完整CSS样式名称
     */
    @JsonIgnore
    public void resetFullCssName(){
        this.reset(FIELD_FULLCSSNAME);
    }

    /**
     * 设置 完整CSS样式名称
     * <P>
     * 等同 {@link #setFullCssName}
     * @param fullCssName
     */
    @JsonIgnore
    public PSSysCss fullcssname(String fullCssName){
        this.setFullCssName(fullCssName);
        return this;
    }

    /**
     * <B>HALIGN</B>&nbsp;水平对齐，指定容器内容的水平对齐方式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.TextAlign} 
     */
    public final static String FIELD_HALIGN = "halign";

    /**
     * 设置 水平对齐，详细说明：{@link #FIELD_HALIGN}
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
     * 设置 水平对齐，详细说明：{@link #FIELD_HALIGN}
     * <P>
     * 等同 {@link #setHAlign}
     * @param hAlign
     */
    @JsonIgnore
    public PSSysCss halign(String hAlign){
        this.setHAlign(hAlign);
        return this;
    }

     /**
     * 设置 水平对齐，详细说明：{@link #FIELD_HALIGN}
     * <P>
     * 等同 {@link #setHAlign}
     * @param hAlign
     */
    @JsonIgnore
    public PSSysCss halign(net.ibizsys.psmodel.core.util.PSModelEnums.TextAlign hAlign){
        if(hAlign == null){
            this.setHAlign(null);
        }
        else{
            this.setHAlign(hAlign.value);
        }
        return this;
    }

    /**
     * <B>MARGIN</B>&nbsp;外框间隔，指定容器的外框间隔
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_MARGIN = "margin";

    /**
     * 设置 外框间隔，详细说明：{@link #FIELD_MARGIN}
     * 
     * @param margin
     * 
     */
    @JsonProperty(FIELD_MARGIN)
    public void setMargin(String margin){
        this.set(FIELD_MARGIN, margin);
    }
    
    /**
     * 获取 外框间隔  
     * @return
     */
    @JsonIgnore
    public String getMargin(){
        Object objValue = this.get(FIELD_MARGIN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 外框间隔 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMarginDirty(){
        if(this.contains(FIELD_MARGIN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 外框间隔
     */
    @JsonIgnore
    public void resetMargin(){
        this.reset(FIELD_MARGIN);
    }

    /**
     * 设置 外框间隔，详细说明：{@link #FIELD_MARGIN}
     * <P>
     * 等同 {@link #setMargin}
     * @param margin
     */
    @JsonIgnore
    public PSSysCss margin(String margin){
        this.setMargin(margin);
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
    public PSSysCss memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>OWNERID</B>&nbsp;所有着标识
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_OWNERID = "ownerid";

    /**
     * 设置 所有着标识
     * 
     * @param ownerId
     * 
     */
    @JsonProperty(FIELD_OWNERID)
    public void setOwnerId(String ownerId){
        this.set(FIELD_OWNERID, ownerId);
    }
    
    /**
     * 获取 所有着标识  
     * @return
     */
    @JsonIgnore
    public String getOwnerId(){
        Object objValue = this.get(FIELD_OWNERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 所有着标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOwnerIdDirty(){
        if(this.contains(FIELD_OWNERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 所有着标识
     */
    @JsonIgnore
    public void resetOwnerId(){
        this.reset(FIELD_OWNERID);
    }

    /**
     * 设置 所有着标识
     * <P>
     * 等同 {@link #setOwnerId}
     * @param ownerId
     */
    @JsonIgnore
    public PSSysCss ownerid(String ownerId){
        this.setOwnerId(ownerId);
        return this;
    }

    /**
     * <B>OWNERTAG</B>&nbsp;所有者标记
     * <P>
     * 字符串：最大长度 20
     */
    public final static String FIELD_OWNERTAG = "ownertag";

    /**
     * 设置 所有者标记
     * 
     * @param ownerTag
     * 
     */
    @JsonProperty(FIELD_OWNERTAG)
    public void setOwnerTag(String ownerTag){
        this.set(FIELD_OWNERTAG, ownerTag);
    }
    
    /**
     * 获取 所有者标记  
     * @return
     */
    @JsonIgnore
    public String getOwnerTag(){
        Object objValue = this.get(FIELD_OWNERTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 所有者标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOwnerTagDirty(){
        if(this.contains(FIELD_OWNERTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 所有者标记
     */
    @JsonIgnore
    public void resetOwnerTag(){
        this.reset(FIELD_OWNERTAG);
    }

    /**
     * 设置 所有者标记
     * <P>
     * 等同 {@link #setOwnerTag}
     * @param ownerTag
     */
    @JsonIgnore
    public PSSysCss ownertag(String ownerTag){
        this.setOwnerTag(ownerTag);
        return this;
    }

    /**
     * <B>OWNERTYPE</B>&nbsp;所有着类型
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_OWNERTYPE = "ownertype";

    /**
     * 设置 所有着类型
     * 
     * @param ownerType
     * 
     */
    @JsonProperty(FIELD_OWNERTYPE)
    public void setOwnerType(String ownerType){
        this.set(FIELD_OWNERTYPE, ownerType);
    }
    
    /**
     * 获取 所有着类型  
     * @return
     */
    @JsonIgnore
    public String getOwnerType(){
        Object objValue = this.get(FIELD_OWNERTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 所有着类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOwnerTypeDirty(){
        if(this.contains(FIELD_OWNERTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 所有着类型
     */
    @JsonIgnore
    public void resetOwnerType(){
        this.reset(FIELD_OWNERTYPE);
    }

    /**
     * 设置 所有着类型
     * <P>
     * 等同 {@link #setOwnerType}
     * @param ownerType
     */
    @JsonIgnore
    public PSSysCss ownertype(String ownerType){
        this.setOwnerType(ownerType);
        return this;
    }

    /**
     * <B>PADDING</B>&nbsp;内框间隔，指定容器的内框间隔
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_PADDING = "padding";

    /**
     * 设置 内框间隔，详细说明：{@link #FIELD_PADDING}
     * 
     * @param padding
     * 
     */
    @JsonProperty(FIELD_PADDING)
    public void setPadding(String padding){
        this.set(FIELD_PADDING, padding);
    }
    
    /**
     * 获取 内框间隔  
     * @return
     */
    @JsonIgnore
    public String getPadding(){
        Object objValue = this.get(FIELD_PADDING);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 内框间隔 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPaddingDirty(){
        if(this.contains(FIELD_PADDING)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内框间隔
     */
    @JsonIgnore
    public void resetPadding(){
        this.reset(FIELD_PADDING);
    }

    /**
     * 设置 内框间隔，详细说明：{@link #FIELD_PADDING}
     * <P>
     * 等同 {@link #setPadding}
     * @param padding
     */
    @JsonIgnore
    public PSSysCss padding(String padding){
        this.setPadding(padding);
        return this;
    }

    /**
     * <B>PSCSSTEMPLID</B>&nbsp;预置界面样式表模板，指定平台预置的界面样式表
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSCSSTEMPLID = "pscsstemplid";

    /**
     * 设置 预置界面样式表模板，详细说明：{@link #FIELD_PSCSSTEMPLID}
     * 
     * @param pSCssTemplId
     * 
     */
    @JsonProperty(FIELD_PSCSSTEMPLID)
    public void setPSCssTemplId(String pSCssTemplId){
        this.set(FIELD_PSCSSTEMPLID, pSCssTemplId);
    }
    
    /**
     * 获取 预置界面样式表模板  
     * @return
     */
    @JsonIgnore
    public String getPSCssTemplId(){
        Object objValue = this.get(FIELD_PSCSSTEMPLID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预置界面样式表模板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCssTemplIdDirty(){
        if(this.contains(FIELD_PSCSSTEMPLID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预置界面样式表模板
     */
    @JsonIgnore
    public void resetPSCssTemplId(){
        this.reset(FIELD_PSCSSTEMPLID);
    }

    /**
     * 设置 预置界面样式表模板，详细说明：{@link #FIELD_PSCSSTEMPLID}
     * <P>
     * 等同 {@link #setPSCssTemplId}
     * @param pSCssTemplId
     */
    @JsonIgnore
    public PSSysCss pscsstemplid(String pSCssTemplId){
        this.setPSCssTemplId(pSCssTemplId);
        return this;
    }

    /**
     * <B>PSCSSTEMPLNAME</B>&nbsp;预置界面样式表模板，指定平台预置的界面样式表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCSSTEMPLID}
     */
    public final static String FIELD_PSCSSTEMPLNAME = "pscsstemplname";

    /**
     * 设置 预置界面样式表模板，详细说明：{@link #FIELD_PSCSSTEMPLNAME}
     * 
     * @param pSCssTemplName
     * 
     */
    @JsonProperty(FIELD_PSCSSTEMPLNAME)
    public void setPSCssTemplName(String pSCssTemplName){
        this.set(FIELD_PSCSSTEMPLNAME, pSCssTemplName);
    }
    
    /**
     * 获取 预置界面样式表模板  
     * @return
     */
    @JsonIgnore
    public String getPSCssTemplName(){
        Object objValue = this.get(FIELD_PSCSSTEMPLNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预置界面样式表模板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCssTemplNameDirty(){
        if(this.contains(FIELD_PSCSSTEMPLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预置界面样式表模板
     */
    @JsonIgnore
    public void resetPSCssTemplName(){
        this.reset(FIELD_PSCSSTEMPLNAME);
    }

    /**
     * 设置 预置界面样式表模板，详细说明：{@link #FIELD_PSCSSTEMPLNAME}
     * <P>
     * 等同 {@link #setPSCssTemplName}
     * @param pSCssTemplName
     */
    @JsonIgnore
    public PSSysCss pscsstemplname(String pSCssTemplName){
        this.setPSCssTemplName(pSCssTemplName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定系统界面样式表所在的系统模块
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSModule} 
     */
    public final static String FIELD_PSMODULEID = "psmoduleid";

    /**
     * 设置 系统模块，详细说明：{@link #FIELD_PSMODULEID}
     * 
     * @param pSModuleId
     * 
     */
    @JsonProperty(FIELD_PSMODULEID)
    public void setPSModuleId(String pSModuleId){
        this.set(FIELD_PSMODULEID, pSModuleId);
    }
    
    /**
     * 获取 系统模块  
     * @return
     */
    @JsonIgnore
    public String getPSModuleId(){
        Object objValue = this.get(FIELD_PSMODULEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统模块 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSModuleIdDirty(){
        if(this.contains(FIELD_PSMODULEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统模块
     */
    @JsonIgnore
    public void resetPSModuleId(){
        this.reset(FIELD_PSMODULEID);
    }

    /**
     * 设置 系统模块，详细说明：{@link #FIELD_PSMODULEID}
     * <P>
     * 等同 {@link #setPSModuleId}
     * @param pSModuleId
     */
    @JsonIgnore
    public PSSysCss psmoduleid(String pSModuleId){
        this.setPSModuleId(pSModuleId);
        return this;
    }

    /**
     * 设置 系统模块，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSModuleId}
     * @param pSModule 引用对象
     */
    @JsonIgnore
    public PSSysCss psmoduleid(PSModule pSModule){
        if(pSModule == null){
            this.setPSModuleId(null);
            this.setPSModuleName(null);
        }
        else{
            this.setPSModuleId(pSModule.getPSModuleId());
            this.setPSModuleName(pSModule.getPSModuleName());
        }
        return this;
    }

    /**
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定系统界面样式表所在的系统模块
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSMODULEID}
     */
    public final static String FIELD_PSMODULENAME = "psmodulename";

    /**
     * 设置 系统模块，详细说明：{@link #FIELD_PSMODULENAME}
     * 
     * @param pSModuleName
     * 
     */
    @JsonProperty(FIELD_PSMODULENAME)
    public void setPSModuleName(String pSModuleName){
        this.set(FIELD_PSMODULENAME, pSModuleName);
    }
    
    /**
     * 获取 系统模块  
     * @return
     */
    @JsonIgnore
    public String getPSModuleName(){
        Object objValue = this.get(FIELD_PSMODULENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统模块 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSModuleNameDirty(){
        if(this.contains(FIELD_PSMODULENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统模块
     */
    @JsonIgnore
    public void resetPSModuleName(){
        this.reset(FIELD_PSMODULENAME);
    }

    /**
     * 设置 系统模块，详细说明：{@link #FIELD_PSMODULENAME}
     * <P>
     * 等同 {@link #setPSModuleName}
     * @param pSModuleName
     */
    @JsonIgnore
    public PSSysCss psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSYSCSSCATID</B>&nbsp;样式表分类，指定样式表的所属分类
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCssCat} 
     */
    public final static String FIELD_PSSYSCSSCATID = "pssyscsscatid";

    /**
     * 设置 样式表分类，详细说明：{@link #FIELD_PSSYSCSSCATID}
     * 
     * @param pSSysCssCatId
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSCATID)
    public void setPSSysCssCatId(String pSSysCssCatId){
        this.set(FIELD_PSSYSCSSCATID, pSSysCssCatId);
    }
    
    /**
     * 获取 样式表分类  
     * @return
     */
    @JsonIgnore
    public String getPSSysCssCatId(){
        Object objValue = this.get(FIELD_PSSYSCSSCATID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 样式表分类 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCssCatIdDirty(){
        if(this.contains(FIELD_PSSYSCSSCATID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 样式表分类
     */
    @JsonIgnore
    public void resetPSSysCssCatId(){
        this.reset(FIELD_PSSYSCSSCATID);
    }

    /**
     * 设置 样式表分类，详细说明：{@link #FIELD_PSSYSCSSCATID}
     * <P>
     * 等同 {@link #setPSSysCssCatId}
     * @param pSSysCssCatId
     */
    @JsonIgnore
    public PSSysCss pssyscsscatid(String pSSysCssCatId){
        this.setPSSysCssCatId(pSSysCssCatId);
        return this;
    }

    /**
     * 设置 样式表分类，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCssCatId}
     * @param pSSysCssCat 引用对象
     */
    @JsonIgnore
    public PSSysCss pssyscsscatid(PSSysCssCat pSSysCssCat){
        if(pSSysCssCat == null){
            this.setCssCatName(null);
            this.setPSSysCssCatId(null);
            this.setPSSysCssCatName(null);
        }
        else{
            this.setCssCatName(pSSysCssCat.getCssCatName());
            this.setPSSysCssCatId(pSSysCssCat.getPSSysCssCatId());
            this.setPSSysCssCatName(pSSysCssCat.getPSSysCssCatName());
        }
        return this;
    }

    /**
     * <B>PSSYSCSSCATNAME</B>&nbsp;样式表分类，指定样式表的所属分类
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSCSSCATID}
     */
    public final static String FIELD_PSSYSCSSCATNAME = "pssyscsscatname";

    /**
     * 设置 样式表分类，详细说明：{@link #FIELD_PSSYSCSSCATNAME}
     * 
     * @param pSSysCssCatName
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSCATNAME)
    public void setPSSysCssCatName(String pSSysCssCatName){
        this.set(FIELD_PSSYSCSSCATNAME, pSSysCssCatName);
    }
    
    /**
     * 获取 样式表分类  
     * @return
     */
    @JsonIgnore
    public String getPSSysCssCatName(){
        Object objValue = this.get(FIELD_PSSYSCSSCATNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 样式表分类 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCssCatNameDirty(){
        if(this.contains(FIELD_PSSYSCSSCATNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 样式表分类
     */
    @JsonIgnore
    public void resetPSSysCssCatName(){
        this.reset(FIELD_PSSYSCSSCATNAME);
    }

    /**
     * 设置 样式表分类，详细说明：{@link #FIELD_PSSYSCSSCATNAME}
     * <P>
     * 等同 {@link #setPSSysCssCatName}
     * @param pSSysCssCatName
     */
    @JsonIgnore
    public PSSysCss pssyscsscatname(String pSSysCssCatName){
        this.setPSSysCssCatName(pSSysCssCatName);
        return this;
    }

    /**
     * <B>PSSYSCSSID</B>&nbsp;系统界面样式表标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSCSSID = "pssyscssid";

    /**
     * 设置 系统界面样式表标识
     * 
     * @param pSSysCssId
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSID)
    public void setPSSysCssId(String pSSysCssId){
        this.set(FIELD_PSSYSCSSID, pSSysCssId);
    }
    
    /**
     * 获取 系统界面样式表标识  
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
     * 判断 系统界面样式表标识 是否指定值，包括空值
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
     * 重置 系统界面样式表标识
     */
    @JsonIgnore
    public void resetPSSysCssId(){
        this.reset(FIELD_PSSYSCSSID);
    }

    /**
     * 设置 系统界面样式表标识
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCssId
     */
    @JsonIgnore
    public PSSysCss pssyscssid(String pSSysCssId){
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    /**
     * <B>PSSYSCSSNAME</B>&nbsp;样式表名称，指定界面样式表对象的名称，需在所在模型域（模块或系统）具备唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSCSSNAME = "pssyscssname";

    /**
     * 设置 样式表名称，详细说明：{@link #FIELD_PSSYSCSSNAME}
     * 
     * @param pSSysCssName
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSNAME)
    public void setPSSysCssName(String pSSysCssName){
        this.set(FIELD_PSSYSCSSNAME, pSSysCssName);
    }
    
    /**
     * 获取 样式表名称  
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
     * 判断 样式表名称 是否指定值，包括空值
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
     * 重置 样式表名称
     */
    @JsonIgnore
    public void resetPSSysCssName(){
        this.reset(FIELD_PSSYSCSSNAME);
    }

    /**
     * 设置 样式表名称，详细说明：{@link #FIELD_PSSYSCSSNAME}
     * <P>
     * 等同 {@link #setPSSysCssName}
     * @param pSSysCssName
     */
    @JsonIgnore
    public PSSysCss pssyscssname(String pSSysCssName){
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysCssName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysCssName(strName);
    }

    @JsonIgnore
    public PSSysCss name(String strName){
        this.setPSSysCssName(strName);
        return this;
    }

    /**
     * <B>PUBLICFLAG</B>&nbsp;公共样式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_PUBLICFLAG = "publicflag";

    /**
     * 设置 公共样式
     * 
     * @param publicFlag
     * 
     */
    @JsonProperty(FIELD_PUBLICFLAG)
    public void setPublicFlag(Integer publicFlag){
        this.set(FIELD_PUBLICFLAG, publicFlag);
    }
    
    /**
     * 获取 公共样式  
     * @return
     */
    @JsonIgnore
    public Integer getPublicFlag(){
        Object objValue = this.get(FIELD_PUBLICFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 公共样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPublicFlagDirty(){
        if(this.contains(FIELD_PUBLICFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 公共样式
     */
    @JsonIgnore
    public void resetPublicFlag(){
        this.reset(FIELD_PUBLICFLAG);
    }

    /**
     * 设置 公共样式
     * <P>
     * 等同 {@link #setPublicFlag}
     * @param publicFlag
     */
    @JsonIgnore
    public PSSysCss publicflag(Integer publicFlag){
        this.setPublicFlag(publicFlag);
        return this;
    }

     /**
     * 设置 公共样式
     * <P>
     * 等同 {@link #setPublicFlag}
     * @param publicFlag
     */
    @JsonIgnore
    public PSSysCss publicflag(Boolean publicFlag){
        if(publicFlag == null){
            this.setPublicFlag(null);
        }
        else{
            this.setPublicFlag(publicFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>SAMPLECONTENT</B>&nbsp;设计效果，IGNOREMODELV2
     */
    public final static String FIELD_SAMPLECONTENT = "samplecontent";

    /**
     * 设置 设计效果，详细说明：{@link #FIELD_SAMPLECONTENT}
     * 
     * @param sampleContent
     * 
     */
    @JsonProperty(FIELD_SAMPLECONTENT)
    public void setSampleContent(String sampleContent){
        this.set(FIELD_SAMPLECONTENT, sampleContent);
    }
    
    /**
     * 获取 设计效果  
     * @return
     */
    @JsonIgnore
    public String getSampleContent(){
        Object objValue = this.get(FIELD_SAMPLECONTENT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 设计效果 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSampleContentDirty(){
        if(this.contains(FIELD_SAMPLECONTENT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 设计效果
     */
    @JsonIgnore
    public void resetSampleContent(){
        this.reset(FIELD_SAMPLECONTENT);
    }

    /**
     * 设置 设计效果，详细说明：{@link #FIELD_SAMPLECONTENT}
     * <P>
     * 等同 {@link #setSampleContent}
     * @param sampleContent
     */
    @JsonIgnore
    public PSSysCss samplecontent(String sampleContent){
        this.setSampleContent(sampleContent);
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
    public PSSysCss updatedate(String updateDate){
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
    public PSSysCss updateman(String updateMan){
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
    public PSSysCss usercat(String userCat){
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
    public PSSysCss usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
     * 字符串：最大长度 200
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
    public PSSysCss usertag(String userTag){
        this.setUserTag(userTag);
        return this;
    }

    /**
     * <B>USERTAG2</B>&nbsp;用户标记2
     * <P>
     * 字符串：最大长度 200
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
    public PSSysCss usertag2(String userTag2){
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
    public PSSysCss usertag3(String userTag3){
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
    public PSSysCss usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>VALIGN</B>&nbsp;垂直对齐，指定容器内容的垂直对齐方式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.TextVAlign} 
     */
    public final static String FIELD_VALIGN = "valign";

    /**
     * 设置 垂直对齐，详细说明：{@link #FIELD_VALIGN}
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
     * 设置 垂直对齐，详细说明：{@link #FIELD_VALIGN}
     * <P>
     * 等同 {@link #setVAlign}
     * @param vAlign
     */
    @JsonIgnore
    public PSSysCss valign(String vAlign){
        this.setVAlign(vAlign);
        return this;
    }

     /**
     * 设置 垂直对齐，详细说明：{@link #FIELD_VALIGN}
     * <P>
     * 等同 {@link #setVAlign}
     * @param vAlign
     */
    @JsonIgnore
    public PSSysCss valign(net.ibizsys.psmodel.core.util.PSModelEnums.TextVAlign vAlign){
        if(vAlign == null){
            this.setVAlign(null);
        }
        else{
            this.setVAlign(vAlign.value);
        }
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysCssId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysCssId(strValue);
    }

    @JsonIgnore
    public PSSysCss id(String strValue){
        this.setPSSysCssId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysCss){
            PSSysCss model = (PSSysCss)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
