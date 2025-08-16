package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSMAPITEM</B>系统地图数据项 模型传输对象
 * <P>
 * 地图部件项模型，定义地图部件的子项数据源，包括子项的界面表现及处理逻辑
 */
public class PSSysMapItem extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysMapItem(){
        this.setValidFlag(1);
    }      

    /**
     * <B>ALTPSDEFID</B>&nbsp;高度属性，指定地图部件项的高度存储属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_ALTPSDEFID = "altpsdefid";

    /**
     * 设置 高度属性，详细说明：{@link #FIELD_ALTPSDEFID}
     * 
     * @param altPSDEFId
     * 
     */
    @JsonProperty(FIELD_ALTPSDEFID)
    public void setAltPSDEFId(String altPSDEFId){
        this.set(FIELD_ALTPSDEFID, altPSDEFId);
    }
    
    /**
     * 获取 高度属性  
     * @return
     */
    @JsonIgnore
    public String getAltPSDEFId(){
        Object objValue = this.get(FIELD_ALTPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 高度属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAltPSDEFIdDirty(){
        if(this.contains(FIELD_ALTPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 高度属性
     */
    @JsonIgnore
    public void resetAltPSDEFId(){
        this.reset(FIELD_ALTPSDEFID);
    }

    /**
     * 设置 高度属性，详细说明：{@link #FIELD_ALTPSDEFID}
     * <P>
     * 等同 {@link #setAltPSDEFId}
     * @param altPSDEFId
     */
    @JsonIgnore
    public PSSysMapItem altpsdefid(String altPSDEFId){
        this.setAltPSDEFId(altPSDEFId);
        return this;
    }

    /**
     * 设置 高度属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setAltPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMapItem altpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setAltPSDEFId(null);
            this.setAltPSDEFName(null);
        }
        else{
            this.setAltPSDEFId(pSDEField.getPSDEFieldId());
            this.setAltPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>ALTPSDEFNAME</B>&nbsp;高度属性，指定地图部件项的高度存储属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ALTPSDEFID}
     */
    public final static String FIELD_ALTPSDEFNAME = "altpsdefname";

    /**
     * 设置 高度属性，详细说明：{@link #FIELD_ALTPSDEFNAME}
     * 
     * @param altPSDEFName
     * 
     */
    @JsonProperty(FIELD_ALTPSDEFNAME)
    public void setAltPSDEFName(String altPSDEFName){
        this.set(FIELD_ALTPSDEFNAME, altPSDEFName);
    }
    
    /**
     * 获取 高度属性  
     * @return
     */
    @JsonIgnore
    public String getAltPSDEFName(){
        Object objValue = this.get(FIELD_ALTPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 高度属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAltPSDEFNameDirty(){
        if(this.contains(FIELD_ALTPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 高度属性
     */
    @JsonIgnore
    public void resetAltPSDEFName(){
        this.reset(FIELD_ALTPSDEFNAME);
    }

    /**
     * 设置 高度属性，详细说明：{@link #FIELD_ALTPSDEFNAME}
     * <P>
     * 等同 {@link #setAltPSDEFName}
     * @param altPSDEFName
     */
    @JsonIgnore
    public PSSysMapItem altpsdefname(String altPSDEFName){
        this.setAltPSDEFName(altPSDEFName);
        return this;
    }

    /**
     * <B>ASYNCPSDEDSID</B>&nbsp;异步实体数据集
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataSet} 
     */
    public final static String FIELD_ASYNCPSDEDSID = "asyncpsdedsid";

    /**
     * 设置 异步实体数据集
     * 
     * @param asyncPSDEDSId
     * 
     */
    @JsonProperty(FIELD_ASYNCPSDEDSID)
    public void setAsyncPSDEDSId(String asyncPSDEDSId){
        this.set(FIELD_ASYNCPSDEDSID, asyncPSDEDSId);
    }
    
    /**
     * 获取 异步实体数据集  
     * @return
     */
    @JsonIgnore
    public String getAsyncPSDEDSId(){
        Object objValue = this.get(FIELD_ASYNCPSDEDSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 异步实体数据集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAsyncPSDEDSIdDirty(){
        if(this.contains(FIELD_ASYNCPSDEDSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 异步实体数据集
     */
    @JsonIgnore
    public void resetAsyncPSDEDSId(){
        this.reset(FIELD_ASYNCPSDEDSID);
    }

    /**
     * 设置 异步实体数据集
     * <P>
     * 等同 {@link #setAsyncPSDEDSId}
     * @param asyncPSDEDSId
     */
    @JsonIgnore
    public PSSysMapItem asyncpsdedsid(String asyncPSDEDSId){
        this.setAsyncPSDEDSId(asyncPSDEDSId);
        return this;
    }

    /**
     * 设置 异步实体数据集，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setAsyncPSDEDSId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSSysMapItem asyncpsdedsid(PSDEDataSet pSDEDataSet){
        if(pSDEDataSet == null){
            this.setAsyncPSDEDSId(null);
            this.setAsyncPSDEDSName(null);
        }
        else{
            this.setAsyncPSDEDSId(pSDEDataSet.getPSDEDataSetId());
            this.setAsyncPSDEDSName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    /**
     * <B>ASYNCPSDEDSNAME</B>&nbsp;异步实体数据集
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ASYNCPSDEDSID}
     */
    public final static String FIELD_ASYNCPSDEDSNAME = "asyncpsdedsname";

    /**
     * 设置 异步实体数据集
     * 
     * @param asyncPSDEDSName
     * 
     */
    @JsonProperty(FIELD_ASYNCPSDEDSNAME)
    public void setAsyncPSDEDSName(String asyncPSDEDSName){
        this.set(FIELD_ASYNCPSDEDSNAME, asyncPSDEDSName);
    }
    
    /**
     * 获取 异步实体数据集  
     * @return
     */
    @JsonIgnore
    public String getAsyncPSDEDSName(){
        Object objValue = this.get(FIELD_ASYNCPSDEDSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 异步实体数据集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAsyncPSDEDSNameDirty(){
        if(this.contains(FIELD_ASYNCPSDEDSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 异步实体数据集
     */
    @JsonIgnore
    public void resetAsyncPSDEDSName(){
        this.reset(FIELD_ASYNCPSDEDSNAME);
    }

    /**
     * 设置 异步实体数据集
     * <P>
     * 等同 {@link #setAsyncPSDEDSName}
     * @param asyncPSDEDSName
     */
    @JsonIgnore
    public PSSysMapItem asyncpsdedsname(String asyncPSDEDSName){
        this.setAsyncPSDEDSName(asyncPSDEDSName);
        return this;
    }

    /**
     * <B>BKCOLOR</B>&nbsp;背景颜色，指定地图部件项的默认背景颜色
     * <P>
     * 字符串：最大长度 40
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
    public PSSysMapItem bkcolor(String bKColor){
        this.setBKColor(bKColor);
        return this;
    }

    /**
     * <B>BKCOLORPSDEFID</B>&nbsp;背景颜色属性，指定地图部件项的背景颜色存储属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_BKCOLORPSDEFID = "bkcolorpsdefid";

    /**
     * 设置 背景颜色属性，详细说明：{@link #FIELD_BKCOLORPSDEFID}
     * 
     * @param bKColorPSDEFId
     * 
     */
    @JsonProperty(FIELD_BKCOLORPSDEFID)
    public void setBKColorPSDEFId(String bKColorPSDEFId){
        this.set(FIELD_BKCOLORPSDEFID, bKColorPSDEFId);
    }
    
    /**
     * 获取 背景颜色属性  
     * @return
     */
    @JsonIgnore
    public String getBKColorPSDEFId(){
        Object objValue = this.get(FIELD_BKCOLORPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 背景颜色属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBKColorPSDEFIdDirty(){
        if(this.contains(FIELD_BKCOLORPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 背景颜色属性
     */
    @JsonIgnore
    public void resetBKColorPSDEFId(){
        this.reset(FIELD_BKCOLORPSDEFID);
    }

    /**
     * 设置 背景颜色属性，详细说明：{@link #FIELD_BKCOLORPSDEFID}
     * <P>
     * 等同 {@link #setBKColorPSDEFId}
     * @param bKColorPSDEFId
     */
    @JsonIgnore
    public PSSysMapItem bkcolorpsdefid(String bKColorPSDEFId){
        this.setBKColorPSDEFId(bKColorPSDEFId);
        return this;
    }

    /**
     * 设置 背景颜色属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setBKColorPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMapItem bkcolorpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setBKColorPSDEFId(null);
            this.setBKColorPSDEFName(null);
        }
        else{
            this.setBKColorPSDEFId(pSDEField.getPSDEFieldId());
            this.setBKColorPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>BKCOLORPSDEFNAME</B>&nbsp;背景颜色属性，指定地图部件项的背景颜色存储属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_BKCOLORPSDEFID}
     */
    public final static String FIELD_BKCOLORPSDEFNAME = "bkcolorpsdefname";

    /**
     * 设置 背景颜色属性，详细说明：{@link #FIELD_BKCOLORPSDEFNAME}
     * 
     * @param bKColorPSDEFName
     * 
     */
    @JsonProperty(FIELD_BKCOLORPSDEFNAME)
    public void setBKColorPSDEFName(String bKColorPSDEFName){
        this.set(FIELD_BKCOLORPSDEFNAME, bKColorPSDEFName);
    }
    
    /**
     * 获取 背景颜色属性  
     * @return
     */
    @JsonIgnore
    public String getBKColorPSDEFName(){
        Object objValue = this.get(FIELD_BKCOLORPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 背景颜色属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBKColorPSDEFNameDirty(){
        if(this.contains(FIELD_BKCOLORPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 背景颜色属性
     */
    @JsonIgnore
    public void resetBKColorPSDEFName(){
        this.reset(FIELD_BKCOLORPSDEFNAME);
    }

    /**
     * 设置 背景颜色属性，详细说明：{@link #FIELD_BKCOLORPSDEFNAME}
     * <P>
     * 等同 {@link #setBKColorPSDEFName}
     * @param bKColorPSDEFName
     */
    @JsonIgnore
    public PSSysMapItem bkcolorpsdefname(String bKColorPSDEFName){
        this.setBKColorPSDEFName(bKColorPSDEFName);
        return this;
    }

    /**
     * <B>BORDERCOLOR</B>&nbsp;边框颜色，指定地图部件项的界面边框颜色
     * <P>
     * 字符串：最大长度 40
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
    public PSSysMapItem bordercolor(String borderColor){
        this.setBorderColor(borderColor);
        return this;
    }

    /**
     * <B>BORDERWIDTH</B>&nbsp;边框宽度，指定地图部件项的界面边框宽度，未定义时为【0】
     */
    public final static String FIELD_BORDERWIDTH = "borderwidth";

    /**
     * 设置 边框宽度，详细说明：{@link #FIELD_BORDERWIDTH}
     * 
     * @param borderWidth
     * 
     */
    @JsonProperty(FIELD_BORDERWIDTH)
    public void setBorderWidth(Integer borderWidth){
        this.set(FIELD_BORDERWIDTH, borderWidth);
    }
    
    /**
     * 获取 边框宽度  
     * @return
     */
    @JsonIgnore
    public Integer getBorderWidth(){
        Object objValue = this.get(FIELD_BORDERWIDTH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 边框宽度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBorderWidthDirty(){
        if(this.contains(FIELD_BORDERWIDTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 边框宽度
     */
    @JsonIgnore
    public void resetBorderWidth(){
        this.reset(FIELD_BORDERWIDTH);
    }

    /**
     * 设置 边框宽度，详细说明：{@link #FIELD_BORDERWIDTH}
     * <P>
     * 等同 {@link #setBorderWidth}
     * @param borderWidth
     */
    @JsonIgnore
    public PSSysMapItem borderwidth(Integer borderWidth){
        this.setBorderWidth(borderWidth);
        return this;
    }

    /**
     * <B>CLSPSDEFID</B>&nbsp;样式表属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_CLSPSDEFID = "clspsdefid";

    /**
     * 设置 样式表属性
     * 
     * @param clsPSDEFId
     * 
     */
    @JsonProperty(FIELD_CLSPSDEFID)
    public void setClsPSDEFId(String clsPSDEFId){
        this.set(FIELD_CLSPSDEFID, clsPSDEFId);
    }
    
    /**
     * 获取 样式表属性  
     * @return
     */
    @JsonIgnore
    public String getClsPSDEFId(){
        Object objValue = this.get(FIELD_CLSPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 样式表属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isClsPSDEFIdDirty(){
        if(this.contains(FIELD_CLSPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 样式表属性
     */
    @JsonIgnore
    public void resetClsPSDEFId(){
        this.reset(FIELD_CLSPSDEFID);
    }

    /**
     * 设置 样式表属性
     * <P>
     * 等同 {@link #setClsPSDEFId}
     * @param clsPSDEFId
     */
    @JsonIgnore
    public PSSysMapItem clspsdefid(String clsPSDEFId){
        this.setClsPSDEFId(clsPSDEFId);
        return this;
    }

    /**
     * 设置 样式表属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setClsPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMapItem clspsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setClsPSDEFId(null);
            this.setClsPSDEFName(null);
        }
        else{
            this.setClsPSDEFId(pSDEField.getPSDEFieldId());
            this.setClsPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>CLSPSDEFNAME</B>&nbsp;样式表属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CLSPSDEFID}
     */
    public final static String FIELD_CLSPSDEFNAME = "clspsdefname";

    /**
     * 设置 样式表属性
     * 
     * @param clsPSDEFName
     * 
     */
    @JsonProperty(FIELD_CLSPSDEFNAME)
    public void setClsPSDEFName(String clsPSDEFName){
        this.set(FIELD_CLSPSDEFNAME, clsPSDEFName);
    }
    
    /**
     * 获取 样式表属性  
     * @return
     */
    @JsonIgnore
    public String getClsPSDEFName(){
        Object objValue = this.get(FIELD_CLSPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 样式表属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isClsPSDEFNameDirty(){
        if(this.contains(FIELD_CLSPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 样式表属性
     */
    @JsonIgnore
    public void resetClsPSDEFName(){
        this.reset(FIELD_CLSPSDEFNAME);
    }

    /**
     * 设置 样式表属性
     * <P>
     * 等同 {@link #setClsPSDEFName}
     * @param clsPSDEFName
     */
    @JsonIgnore
    public PSSysMapItem clspsdefname(String clsPSDEFName){
        this.setClsPSDEFName(clsPSDEFName);
        return this;
    }

    /**
     * <B>COLOR</B>&nbsp;字体颜色，指定地图部件项的默认字体颜色
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_COLOR = "color";

    /**
     * 设置 字体颜色，详细说明：{@link #FIELD_COLOR}
     * 
     * @param color
     * 
     */
    @JsonProperty(FIELD_COLOR)
    public void setColor(String color){
        this.set(FIELD_COLOR, color);
    }
    
    /**
     * 获取 字体颜色  
     * @return
     */
    @JsonIgnore
    public String getColor(){
        Object objValue = this.get(FIELD_COLOR);
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
    public boolean isColorDirty(){
        if(this.contains(FIELD_COLOR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 字体颜色
     */
    @JsonIgnore
    public void resetColor(){
        this.reset(FIELD_COLOR);
    }

    /**
     * 设置 字体颜色，详细说明：{@link #FIELD_COLOR}
     * <P>
     * 等同 {@link #setColor}
     * @param color
     */
    @JsonIgnore
    public PSSysMapItem color(String color){
        this.setColor(color);
        return this;
    }

    /**
     * <B>COLORPSDEFID</B>&nbsp;字体颜色属性，指定地图部件项的字体颜色存储属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_COLORPSDEFID = "colorpsdefid";

    /**
     * 设置 字体颜色属性，详细说明：{@link #FIELD_COLORPSDEFID}
     * 
     * @param colorPSDEFId
     * 
     */
    @JsonProperty(FIELD_COLORPSDEFID)
    public void setColorPSDEFId(String colorPSDEFId){
        this.set(FIELD_COLORPSDEFID, colorPSDEFId);
    }
    
    /**
     * 获取 字体颜色属性  
     * @return
     */
    @JsonIgnore
    public String getColorPSDEFId(){
        Object objValue = this.get(FIELD_COLORPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 字体颜色属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isColorPSDEFIdDirty(){
        if(this.contains(FIELD_COLORPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 字体颜色属性
     */
    @JsonIgnore
    public void resetColorPSDEFId(){
        this.reset(FIELD_COLORPSDEFID);
    }

    /**
     * 设置 字体颜色属性，详细说明：{@link #FIELD_COLORPSDEFID}
     * <P>
     * 等同 {@link #setColorPSDEFId}
     * @param colorPSDEFId
     */
    @JsonIgnore
    public PSSysMapItem colorpsdefid(String colorPSDEFId){
        this.setColorPSDEFId(colorPSDEFId);
        return this;
    }

    /**
     * 设置 字体颜色属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setColorPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMapItem colorpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setColorPSDEFId(null);
            this.setColorPSDEFName(null);
        }
        else{
            this.setColorPSDEFId(pSDEField.getPSDEFieldId());
            this.setColorPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>COLORPSDEFNAME</B>&nbsp;字体颜色属性，指定地图部件项的字体颜色存储属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_COLORPSDEFID}
     */
    public final static String FIELD_COLORPSDEFNAME = "colorpsdefname";

    /**
     * 设置 字体颜色属性，详细说明：{@link #FIELD_COLORPSDEFNAME}
     * 
     * @param colorPSDEFName
     * 
     */
    @JsonProperty(FIELD_COLORPSDEFNAME)
    public void setColorPSDEFName(String colorPSDEFName){
        this.set(FIELD_COLORPSDEFNAME, colorPSDEFName);
    }
    
    /**
     * 获取 字体颜色属性  
     * @return
     */
    @JsonIgnore
    public String getColorPSDEFName(){
        Object objValue = this.get(FIELD_COLORPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 字体颜色属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isColorPSDEFNameDirty(){
        if(this.contains(FIELD_COLORPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 字体颜色属性
     */
    @JsonIgnore
    public void resetColorPSDEFName(){
        this.reset(FIELD_COLORPSDEFNAME);
    }

    /**
     * 设置 字体颜色属性，详细说明：{@link #FIELD_COLORPSDEFNAME}
     * <P>
     * 等同 {@link #setColorPSDEFName}
     * @param colorPSDEFName
     */
    @JsonIgnore
    public PSSysMapItem colorpsdefname(String colorPSDEFName){
        this.setColorPSDEFName(colorPSDEFName);
        return this;
    }

    /**
     * <B>CONTENTPSDEFID</B>&nbsp;内容属性，指定地图部件项的内容存储属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_CONTENTPSDEFID = "contentpsdefid";

    /**
     * 设置 内容属性，详细说明：{@link #FIELD_CONTENTPSDEFID}
     * 
     * @param contentPSDEFId
     * 
     */
    @JsonProperty(FIELD_CONTENTPSDEFID)
    public void setContentPSDEFId(String contentPSDEFId){
        this.set(FIELD_CONTENTPSDEFID, contentPSDEFId);
    }
    
    /**
     * 获取 内容属性  
     * @return
     */
    @JsonIgnore
    public String getContentPSDEFId(){
        Object objValue = this.get(FIELD_CONTENTPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 内容属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isContentPSDEFIdDirty(){
        if(this.contains(FIELD_CONTENTPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内容属性
     */
    @JsonIgnore
    public void resetContentPSDEFId(){
        this.reset(FIELD_CONTENTPSDEFID);
    }

    /**
     * 设置 内容属性，详细说明：{@link #FIELD_CONTENTPSDEFID}
     * <P>
     * 等同 {@link #setContentPSDEFId}
     * @param contentPSDEFId
     */
    @JsonIgnore
    public PSSysMapItem contentpsdefid(String contentPSDEFId){
        this.setContentPSDEFId(contentPSDEFId);
        return this;
    }

    /**
     * 设置 内容属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setContentPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMapItem contentpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setContentPSDEFId(null);
            this.setContentPSDEFName(null);
        }
        else{
            this.setContentPSDEFId(pSDEField.getPSDEFieldId());
            this.setContentPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>CONTENTPSDEFNAME</B>&nbsp;内容属性，指定地图部件项的内容存储属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CONTENTPSDEFID}
     */
    public final static String FIELD_CONTENTPSDEFNAME = "contentpsdefname";

    /**
     * 设置 内容属性，详细说明：{@link #FIELD_CONTENTPSDEFNAME}
     * 
     * @param contentPSDEFName
     * 
     */
    @JsonProperty(FIELD_CONTENTPSDEFNAME)
    public void setContentPSDEFName(String contentPSDEFName){
        this.set(FIELD_CONTENTPSDEFNAME, contentPSDEFName);
    }
    
    /**
     * 获取 内容属性  
     * @return
     */
    @JsonIgnore
    public String getContentPSDEFName(){
        Object objValue = this.get(FIELD_CONTENTPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 内容属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isContentPSDEFNameDirty(){
        if(this.contains(FIELD_CONTENTPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内容属性
     */
    @JsonIgnore
    public void resetContentPSDEFName(){
        this.reset(FIELD_CONTENTPSDEFNAME);
    }

    /**
     * 设置 内容属性，详细说明：{@link #FIELD_CONTENTPSDEFNAME}
     * <P>
     * 等同 {@link #setContentPSDEFName}
     * @param contentPSDEFName
     */
    @JsonIgnore
    public PSSysMapItem contentpsdefname(String contentPSDEFName){
        this.setContentPSDEFName(contentPSDEFName);
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
    public PSSysMapItem createdate(String createDate){
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
    public PSSysMapItem createman(String createMan){
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
    public PSSysMapItem customcond(String customCond){
        this.setCustomCond(customCond);
        return this;
    }

    /**
     * <B>CUSTOMTYPE</B>&nbsp;自定义类型
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_CUSTOMTYPE = "customtype";

    /**
     * 设置 自定义类型
     * 
     * @param customType
     * 
     */
    @JsonProperty(FIELD_CUSTOMTYPE)
    public void setCustomType(String customType){
        this.set(FIELD_CUSTOMTYPE, customType);
    }
    
    /**
     * 获取 自定义类型  
     * @return
     */
    @JsonIgnore
    public String getCustomType(){
        Object objValue = this.get(FIELD_CUSTOMTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomTypeDirty(){
        if(this.contains(FIELD_CUSTOMTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义类型
     */
    @JsonIgnore
    public void resetCustomType(){
        this.reset(FIELD_CUSTOMTYPE);
    }

    /**
     * 设置 自定义类型
     * <P>
     * 等同 {@link #setCustomType}
     * @param customType
     */
    @JsonIgnore
    public PSSysMapItem customtype(String customType){
        this.setCustomType(customType);
        return this;
    }

    /**
     * <B>DATA2PSDEFID</B>&nbsp;数据2属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_DATA2PSDEFID = "data2psdefid";

    /**
     * 设置 数据2属性
     * 
     * @param data2PSDEFId
     * 
     */
    @JsonProperty(FIELD_DATA2PSDEFID)
    public void setData2PSDEFId(String data2PSDEFId){
        this.set(FIELD_DATA2PSDEFID, data2PSDEFId);
    }
    
    /**
     * 获取 数据2属性  
     * @return
     */
    @JsonIgnore
    public String getData2PSDEFId(){
        Object objValue = this.get(FIELD_DATA2PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据2属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isData2PSDEFIdDirty(){
        if(this.contains(FIELD_DATA2PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据2属性
     */
    @JsonIgnore
    public void resetData2PSDEFId(){
        this.reset(FIELD_DATA2PSDEFID);
    }

    /**
     * 设置 数据2属性
     * <P>
     * 等同 {@link #setData2PSDEFId}
     * @param data2PSDEFId
     */
    @JsonIgnore
    public PSSysMapItem data2psdefid(String data2PSDEFId){
        this.setData2PSDEFId(data2PSDEFId);
        return this;
    }

    /**
     * 设置 数据2属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setData2PSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMapItem data2psdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setData2PSDEFId(null);
            this.setData2PSDEFName(null);
        }
        else{
            this.setData2PSDEFId(pSDEField.getPSDEFieldId());
            this.setData2PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>DATA2PSDEFNAME</B>&nbsp;数据2属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DATA2PSDEFID}
     */
    public final static String FIELD_DATA2PSDEFNAME = "data2psdefname";

    /**
     * 设置 数据2属性
     * 
     * @param data2PSDEFName
     * 
     */
    @JsonProperty(FIELD_DATA2PSDEFNAME)
    public void setData2PSDEFName(String data2PSDEFName){
        this.set(FIELD_DATA2PSDEFNAME, data2PSDEFName);
    }
    
    /**
     * 获取 数据2属性  
     * @return
     */
    @JsonIgnore
    public String getData2PSDEFName(){
        Object objValue = this.get(FIELD_DATA2PSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据2属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isData2PSDEFNameDirty(){
        if(this.contains(FIELD_DATA2PSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据2属性
     */
    @JsonIgnore
    public void resetData2PSDEFName(){
        this.reset(FIELD_DATA2PSDEFNAME);
    }

    /**
     * 设置 数据2属性
     * <P>
     * 等同 {@link #setData2PSDEFName}
     * @param data2PSDEFName
     */
    @JsonIgnore
    public PSSysMapItem data2psdefname(String data2PSDEFName){
        this.setData2PSDEFName(data2PSDEFName);
        return this;
    }

    /**
     * <B>DATAPSDEFID</B>&nbsp;数据属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_DATAPSDEFID = "datapsdefid";

    /**
     * 设置 数据属性
     * 
     * @param dataPSDEFId
     * 
     */
    @JsonProperty(FIELD_DATAPSDEFID)
    public void setDataPSDEFId(String dataPSDEFId){
        this.set(FIELD_DATAPSDEFID, dataPSDEFId);
    }
    
    /**
     * 获取 数据属性  
     * @return
     */
    @JsonIgnore
    public String getDataPSDEFId(){
        Object objValue = this.get(FIELD_DATAPSDEFID);
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
    public boolean isDataPSDEFIdDirty(){
        if(this.contains(FIELD_DATAPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据属性
     */
    @JsonIgnore
    public void resetDataPSDEFId(){
        this.reset(FIELD_DATAPSDEFID);
    }

    /**
     * 设置 数据属性
     * <P>
     * 等同 {@link #setDataPSDEFId}
     * @param dataPSDEFId
     */
    @JsonIgnore
    public PSSysMapItem datapsdefid(String dataPSDEFId){
        this.setDataPSDEFId(dataPSDEFId);
        return this;
    }

    /**
     * 设置 数据属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDataPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMapItem datapsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setDataPSDEFId(null);
            this.setDataPSDEFName(null);
        }
        else{
            this.setDataPSDEFId(pSDEField.getPSDEFieldId());
            this.setDataPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>DATAPSDEFNAME</B>&nbsp;数据属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DATAPSDEFID}
     */
    public final static String FIELD_DATAPSDEFNAME = "datapsdefname";

    /**
     * 设置 数据属性
     * 
     * @param dataPSDEFName
     * 
     */
    @JsonProperty(FIELD_DATAPSDEFNAME)
    public void setDataPSDEFName(String dataPSDEFName){
        this.set(FIELD_DATAPSDEFNAME, dataPSDEFName);
    }
    
    /**
     * 获取 数据属性  
     * @return
     */
    @JsonIgnore
    public String getDataPSDEFName(){
        Object objValue = this.get(FIELD_DATAPSDEFNAME);
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
    public boolean isDataPSDEFNameDirty(){
        if(this.contains(FIELD_DATAPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据属性
     */
    @JsonIgnore
    public void resetDataPSDEFName(){
        this.reset(FIELD_DATAPSDEFNAME);
    }

    /**
     * 设置 数据属性
     * <P>
     * 等同 {@link #setDataPSDEFName}
     * @param dataPSDEFName
     */
    @JsonIgnore
    public PSSysMapItem datapsdefname(String dataPSDEFName){
        this.setDataPSDEFName(dataPSDEFName);
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
    public PSSysMapItem dynaclass(String dynaClass){
        this.setDynaClass(dynaClass);
        return this;
    }

    /**
     * <B>GROUPPSDEFID</B>&nbsp;分组属性，指定地图部件项的分组值存储属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_GROUPPSDEFID = "grouppsdefid";

    /**
     * 设置 分组属性，详细说明：{@link #FIELD_GROUPPSDEFID}
     * 
     * @param groupPSDEFId
     * 
     */
    @JsonProperty(FIELD_GROUPPSDEFID)
    public void setGroupPSDEFId(String groupPSDEFId){
        this.set(FIELD_GROUPPSDEFID, groupPSDEFId);
    }
    
    /**
     * 获取 分组属性  
     * @return
     */
    @JsonIgnore
    public String getGroupPSDEFId(){
        Object objValue = this.get(FIELD_GROUPPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSDEFIdDirty(){
        if(this.contains(FIELD_GROUPPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组属性
     */
    @JsonIgnore
    public void resetGroupPSDEFId(){
        this.reset(FIELD_GROUPPSDEFID);
    }

    /**
     * 设置 分组属性，详细说明：{@link #FIELD_GROUPPSDEFID}
     * <P>
     * 等同 {@link #setGroupPSDEFId}
     * @param groupPSDEFId
     */
    @JsonIgnore
    public PSSysMapItem grouppsdefid(String groupPSDEFId){
        this.setGroupPSDEFId(groupPSDEFId);
        return this;
    }

    /**
     * 设置 分组属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setGroupPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMapItem grouppsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setGroupPSDEFId(null);
            this.setGroupPSDEFName(null);
        }
        else{
            this.setGroupPSDEFId(pSDEField.getPSDEFieldId());
            this.setGroupPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>GROUPPSDEFNAME</B>&nbsp;分组属性，指定地图部件项的分组值存储属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GROUPPSDEFID}
     */
    public final static String FIELD_GROUPPSDEFNAME = "grouppsdefname";

    /**
     * 设置 分组属性，详细说明：{@link #FIELD_GROUPPSDEFNAME}
     * 
     * @param groupPSDEFName
     * 
     */
    @JsonProperty(FIELD_GROUPPSDEFNAME)
    public void setGroupPSDEFName(String groupPSDEFName){
        this.set(FIELD_GROUPPSDEFNAME, groupPSDEFName);
    }
    
    /**
     * 获取 分组属性  
     * @return
     */
    @JsonIgnore
    public String getGroupPSDEFName(){
        Object objValue = this.get(FIELD_GROUPPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSDEFNameDirty(){
        if(this.contains(FIELD_GROUPPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组属性
     */
    @JsonIgnore
    public void resetGroupPSDEFName(){
        this.reset(FIELD_GROUPPSDEFNAME);
    }

    /**
     * 设置 分组属性，详细说明：{@link #FIELD_GROUPPSDEFNAME}
     * <P>
     * 等同 {@link #setGroupPSDEFName}
     * @param groupPSDEFName
     */
    @JsonIgnore
    public PSSysMapItem grouppsdefname(String groupPSDEFName){
        this.setGroupPSDEFName(groupPSDEFName);
        return this;
    }

    /**
     * <B>GROUPPSDEUAGROUPID</B>&nbsp;分组界面行为组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEUAGroup} 
     */
    public final static String FIELD_GROUPPSDEUAGROUPID = "grouppsdeuagroupid";

    /**
     * 设置 分组界面行为组
     * 
     * @param groupPSDEUAGroupId
     * 
     */
    @JsonProperty(FIELD_GROUPPSDEUAGROUPID)
    public void setGroupPSDEUAGroupId(String groupPSDEUAGroupId){
        this.set(FIELD_GROUPPSDEUAGROUPID, groupPSDEUAGroupId);
    }
    
    /**
     * 获取 分组界面行为组  
     * @return
     */
    @JsonIgnore
    public String getGroupPSDEUAGroupId(){
        Object objValue = this.get(FIELD_GROUPPSDEUAGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组界面行为组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSDEUAGroupIdDirty(){
        if(this.contains(FIELD_GROUPPSDEUAGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组界面行为组
     */
    @JsonIgnore
    public void resetGroupPSDEUAGroupId(){
        this.reset(FIELD_GROUPPSDEUAGROUPID);
    }

    /**
     * 设置 分组界面行为组
     * <P>
     * 等同 {@link #setGroupPSDEUAGroupId}
     * @param groupPSDEUAGroupId
     */
    @JsonIgnore
    public PSSysMapItem grouppsdeuagroupid(String groupPSDEUAGroupId){
        this.setGroupPSDEUAGroupId(groupPSDEUAGroupId);
        return this;
    }

    /**
     * 设置 分组界面行为组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setGroupPSDEUAGroupId}
     * @param pSDEUAGroup 引用对象
     */
    @JsonIgnore
    public PSSysMapItem grouppsdeuagroupid(PSDEUAGroup pSDEUAGroup){
        if(pSDEUAGroup == null){
            this.setGroupPSDEUAGroupId(null);
            this.setGroupPSDEUAGroupName(null);
        }
        else{
            this.setGroupPSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setGroupPSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    /**
     * <B>GROUPPSDEUAGROUPNAME</B>&nbsp;分组界面行为组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GROUPPSDEUAGROUPID}
     */
    public final static String FIELD_GROUPPSDEUAGROUPNAME = "grouppsdeuagroupname";

    /**
     * 设置 分组界面行为组
     * 
     * @param groupPSDEUAGroupName
     * 
     */
    @JsonProperty(FIELD_GROUPPSDEUAGROUPNAME)
    public void setGroupPSDEUAGroupName(String groupPSDEUAGroupName){
        this.set(FIELD_GROUPPSDEUAGROUPNAME, groupPSDEUAGroupName);
    }
    
    /**
     * 获取 分组界面行为组  
     * @return
     */
    @JsonIgnore
    public String getGroupPSDEUAGroupName(){
        Object objValue = this.get(FIELD_GROUPPSDEUAGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组界面行为组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSDEUAGroupNameDirty(){
        if(this.contains(FIELD_GROUPPSDEUAGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组界面行为组
     */
    @JsonIgnore
    public void resetGroupPSDEUAGroupName(){
        this.reset(FIELD_GROUPPSDEUAGROUPNAME);
    }

    /**
     * 设置 分组界面行为组
     * <P>
     * 等同 {@link #setGroupPSDEUAGroupName}
     * @param groupPSDEUAGroupName
     */
    @JsonIgnore
    public PSSysMapItem grouppsdeuagroupname(String groupPSDEUAGroupName){
        this.setGroupPSDEUAGroupName(groupPSDEUAGroupName);
        return this;
    }

    /**
     * <B>ICONPSDEFID</B>&nbsp;图标属性，指定地图部件项的图标存储属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_ICONPSDEFID = "iconpsdefid";

    /**
     * 设置 图标属性，详细说明：{@link #FIELD_ICONPSDEFID}
     * 
     * @param iconPSDEFId
     * 
     */
    @JsonProperty(FIELD_ICONPSDEFID)
    public void setIconPSDEFId(String iconPSDEFId){
        this.set(FIELD_ICONPSDEFID, iconPSDEFId);
    }
    
    /**
     * 获取 图标属性  
     * @return
     */
    @JsonIgnore
    public String getIconPSDEFId(){
        Object objValue = this.get(FIELD_ICONPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 图标属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIconPSDEFIdDirty(){
        if(this.contains(FIELD_ICONPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图标属性
     */
    @JsonIgnore
    public void resetIconPSDEFId(){
        this.reset(FIELD_ICONPSDEFID);
    }

    /**
     * 设置 图标属性，详细说明：{@link #FIELD_ICONPSDEFID}
     * <P>
     * 等同 {@link #setIconPSDEFId}
     * @param iconPSDEFId
     */
    @JsonIgnore
    public PSSysMapItem iconpsdefid(String iconPSDEFId){
        this.setIconPSDEFId(iconPSDEFId);
        return this;
    }

    /**
     * 设置 图标属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setIconPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMapItem iconpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setIconPSDEFId(null);
            this.setIconPSDEFName(null);
        }
        else{
            this.setIconPSDEFId(pSDEField.getPSDEFieldId());
            this.setIconPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>ICONPSDEFNAME</B>&nbsp;图标属性，指定地图部件项的图标存储属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ICONPSDEFID}
     */
    public final static String FIELD_ICONPSDEFNAME = "iconpsdefname";

    /**
     * 设置 图标属性，详细说明：{@link #FIELD_ICONPSDEFNAME}
     * 
     * @param iconPSDEFName
     * 
     */
    @JsonProperty(FIELD_ICONPSDEFNAME)
    public void setIconPSDEFName(String iconPSDEFName){
        this.set(FIELD_ICONPSDEFNAME, iconPSDEFName);
    }
    
    /**
     * 获取 图标属性  
     * @return
     */
    @JsonIgnore
    public String getIconPSDEFName(){
        Object objValue = this.get(FIELD_ICONPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 图标属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIconPSDEFNameDirty(){
        if(this.contains(FIELD_ICONPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图标属性
     */
    @JsonIgnore
    public void resetIconPSDEFName(){
        this.reset(FIELD_ICONPSDEFNAME);
    }

    /**
     * 设置 图标属性，详细说明：{@link #FIELD_ICONPSDEFNAME}
     * <P>
     * 等同 {@link #setIconPSDEFName}
     * @param iconPSDEFName
     */
    @JsonIgnore
    public PSSysMapItem iconpsdefname(String iconPSDEFName){
        this.setIconPSDEFName(iconPSDEFName);
        return this;
    }

    /**
     * <B>ITEMSTYLE</B>&nbsp;表现样式，指定地图项的展示样式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.MapItemStyle} 
     */
    public final static String FIELD_ITEMSTYLE = "itemstyle";

    /**
     * 设置 表现样式，详细说明：{@link #FIELD_ITEMSTYLE}
     * 
     * @param itemStyle
     * 
     */
    @JsonProperty(FIELD_ITEMSTYLE)
    public void setItemStyle(String itemStyle){
        this.set(FIELD_ITEMSTYLE, itemStyle);
    }
    
    /**
     * 获取 表现样式  
     * @return
     */
    @JsonIgnore
    public String getItemStyle(){
        Object objValue = this.get(FIELD_ITEMSTYLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表现样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemStyleDirty(){
        if(this.contains(FIELD_ITEMSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表现样式
     */
    @JsonIgnore
    public void resetItemStyle(){
        this.reset(FIELD_ITEMSTYLE);
    }

    /**
     * 设置 表现样式，详细说明：{@link #FIELD_ITEMSTYLE}
     * <P>
     * 等同 {@link #setItemStyle}
     * @param itemStyle
     */
    @JsonIgnore
    public PSSysMapItem itemstyle(String itemStyle){
        this.setItemStyle(itemStyle);
        return this;
    }

     /**
     * 设置 表现样式，详细说明：{@link #FIELD_ITEMSTYLE}
     * <P>
     * 等同 {@link #setItemStyle}
     * @param itemStyle
     */
    @JsonIgnore
    public PSSysMapItem itemstyle(net.ibizsys.psmodel.core.util.PSModelEnums.MapItemStyle itemStyle){
        if(itemStyle == null){
            this.setItemStyle(null);
        }
        else{
            this.setItemStyle(itemStyle.value);
        }
        return this;
    }

    /**
     * <B>ITEMSTYLETEXT</B>&nbsp;成员样式
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_ITEMSTYLETEXT = "itemstyletext";

    /**
     * 设置 成员样式
     * 
     * @param itemStyleText
     * 
     */
    @JsonProperty(FIELD_ITEMSTYLETEXT)
    public void setItemStyleText(String itemStyleText){
        this.set(FIELD_ITEMSTYLETEXT, itemStyleText);
    }
    
    /**
     * 获取 成员样式  
     * @return
     */
    @JsonIgnore
    public String getItemStyleText(){
        Object objValue = this.get(FIELD_ITEMSTYLETEXT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 成员样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemStyleTextDirty(){
        if(this.contains(FIELD_ITEMSTYLETEXT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 成员样式
     */
    @JsonIgnore
    public void resetItemStyleText(){
        this.reset(FIELD_ITEMSTYLETEXT);
    }

    /**
     * 设置 成员样式
     * <P>
     * 等同 {@link #setItemStyleText}
     * @param itemStyleText
     */
    @JsonIgnore
    public PSSysMapItem itemstyletext(String itemStyleText){
        this.setItemStyleText(itemStyleText);
        return this;
    }

    /**
     * <B>ITEMTYPE</B>&nbsp;项类型，指定地图部件项类别，需在所在地图部件中具备唯一性
     * <P>
     * 字符串：最大长度 50，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_ITEMTYPE = "itemtype";

    /**
     * 设置 项类型，详细说明：{@link #FIELD_ITEMTYPE}
     * 
     * @param itemType
     * 
     */
    @JsonProperty(FIELD_ITEMTYPE)
    public void setItemType(String itemType){
        this.set(FIELD_ITEMTYPE, itemType);
    }
    
    /**
     * 获取 项类型  
     * @return
     */
    @JsonIgnore
    public String getItemType(){
        Object objValue = this.get(FIELD_ITEMTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemTypeDirty(){
        if(this.contains(FIELD_ITEMTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项类型
     */
    @JsonIgnore
    public void resetItemType(){
        this.reset(FIELD_ITEMTYPE);
    }

    /**
     * 设置 项类型，详细说明：{@link #FIELD_ITEMTYPE}
     * <P>
     * 等同 {@link #setItemType}
     * @param itemType
     */
    @JsonIgnore
    public PSSysMapItem itemtype(String itemType){
        this.setItemType(itemType);
        return this;
    }

    /**
     * <B>KEYPSDEFID</B>&nbsp;标识属性，指定地图部件项的标识存储属性，未定义时使用实体主键属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_KEYPSDEFID = "keypsdefid";

    /**
     * 设置 标识属性，详细说明：{@link #FIELD_KEYPSDEFID}
     * 
     * @param keyPSDEFId
     * 
     */
    @JsonProperty(FIELD_KEYPSDEFID)
    public void setKeyPSDEFId(String keyPSDEFId){
        this.set(FIELD_KEYPSDEFID, keyPSDEFId);
    }
    
    /**
     * 获取 标识属性  
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
     * 判断 标识属性 是否指定值，包括空值
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
     * 重置 标识属性
     */
    @JsonIgnore
    public void resetKeyPSDEFId(){
        this.reset(FIELD_KEYPSDEFID);
    }

    /**
     * 设置 标识属性，详细说明：{@link #FIELD_KEYPSDEFID}
     * <P>
     * 等同 {@link #setKeyPSDEFId}
     * @param keyPSDEFId
     */
    @JsonIgnore
    public PSSysMapItem keypsdefid(String keyPSDEFId){
        this.setKeyPSDEFId(keyPSDEFId);
        return this;
    }

    /**
     * 设置 标识属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setKeyPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMapItem keypsdefid(PSDEField pSDEField){
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
     * <B>KEYPSDEFNAME</B>&nbsp;标识属性，指定地图部件项的标识存储属性，未定义时使用实体主键属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_KEYPSDEFID}
     */
    public final static String FIELD_KEYPSDEFNAME = "keypsdefname";

    /**
     * 设置 标识属性，详细说明：{@link #FIELD_KEYPSDEFNAME}
     * 
     * @param keyPSDEFName
     * 
     */
    @JsonProperty(FIELD_KEYPSDEFNAME)
    public void setKeyPSDEFName(String keyPSDEFName){
        this.set(FIELD_KEYPSDEFNAME, keyPSDEFName);
    }
    
    /**
     * 获取 标识属性  
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
     * 判断 标识属性 是否指定值，包括空值
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
     * 重置 标识属性
     */
    @JsonIgnore
    public void resetKeyPSDEFName(){
        this.reset(FIELD_KEYPSDEFNAME);
    }

    /**
     * 设置 标识属性，详细说明：{@link #FIELD_KEYPSDEFNAME}
     * <P>
     * 等同 {@link #setKeyPSDEFName}
     * @param keyPSDEFName
     */
    @JsonIgnore
    public PSSysMapItem keypsdefname(String keyPSDEFName){
        this.setKeyPSDEFName(keyPSDEFName);
        return this;
    }

    /**
     * <B>LATPSDEFID</B>&nbsp;纬度属性，指定地图部件项的纬度存储属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_LATPSDEFID = "latpsdefid";

    /**
     * 设置 纬度属性，详细说明：{@link #FIELD_LATPSDEFID}
     * 
     * @param latPSDEFId
     * 
     */
    @JsonProperty(FIELD_LATPSDEFID)
    public void setLatPSDEFId(String latPSDEFId){
        this.set(FIELD_LATPSDEFID, latPSDEFId);
    }
    
    /**
     * 获取 纬度属性  
     * @return
     */
    @JsonIgnore
    public String getLatPSDEFId(){
        Object objValue = this.get(FIELD_LATPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 纬度属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLatPSDEFIdDirty(){
        if(this.contains(FIELD_LATPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 纬度属性
     */
    @JsonIgnore
    public void resetLatPSDEFId(){
        this.reset(FIELD_LATPSDEFID);
    }

    /**
     * 设置 纬度属性，详细说明：{@link #FIELD_LATPSDEFID}
     * <P>
     * 等同 {@link #setLatPSDEFId}
     * @param latPSDEFId
     */
    @JsonIgnore
    public PSSysMapItem latpsdefid(String latPSDEFId){
        this.setLatPSDEFId(latPSDEFId);
        return this;
    }

    /**
     * 设置 纬度属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setLatPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMapItem latpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setLatPSDEFId(null);
            this.setLatPSDEFName(null);
        }
        else{
            this.setLatPSDEFId(pSDEField.getPSDEFieldId());
            this.setLatPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>LATPSDEFNAME</B>&nbsp;纬度属性，指定地图部件项的纬度存储属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_LATPSDEFID}
     */
    public final static String FIELD_LATPSDEFNAME = "latpsdefname";

    /**
     * 设置 纬度属性，详细说明：{@link #FIELD_LATPSDEFNAME}
     * 
     * @param latPSDEFName
     * 
     */
    @JsonProperty(FIELD_LATPSDEFNAME)
    public void setLatPSDEFName(String latPSDEFName){
        this.set(FIELD_LATPSDEFNAME, latPSDEFName);
    }
    
    /**
     * 获取 纬度属性  
     * @return
     */
    @JsonIgnore
    public String getLatPSDEFName(){
        Object objValue = this.get(FIELD_LATPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 纬度属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLatPSDEFNameDirty(){
        if(this.contains(FIELD_LATPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 纬度属性
     */
    @JsonIgnore
    public void resetLatPSDEFName(){
        this.reset(FIELD_LATPSDEFNAME);
    }

    /**
     * 设置 纬度属性，详细说明：{@link #FIELD_LATPSDEFNAME}
     * <P>
     * 等同 {@link #setLatPSDEFName}
     * @param latPSDEFName
     */
    @JsonIgnore
    public PSSysMapItem latpsdefname(String latPSDEFName){
        this.setLatPSDEFName(latPSDEFName);
        return this;
    }

    /**
     * <B>LINKPSDEFID</B>&nbsp;链接属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_LINKPSDEFID = "linkpsdefid";

    /**
     * 设置 链接属性
     * 
     * @param linkPSDEFId
     * 
     */
    @JsonProperty(FIELD_LINKPSDEFID)
    public void setLinkPSDEFId(String linkPSDEFId){
        this.set(FIELD_LINKPSDEFID, linkPSDEFId);
    }
    
    /**
     * 获取 链接属性  
     * @return
     */
    @JsonIgnore
    public String getLinkPSDEFId(){
        Object objValue = this.get(FIELD_LINKPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 链接属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLinkPSDEFIdDirty(){
        if(this.contains(FIELD_LINKPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 链接属性
     */
    @JsonIgnore
    public void resetLinkPSDEFId(){
        this.reset(FIELD_LINKPSDEFID);
    }

    /**
     * 设置 链接属性
     * <P>
     * 等同 {@link #setLinkPSDEFId}
     * @param linkPSDEFId
     */
    @JsonIgnore
    public PSSysMapItem linkpsdefid(String linkPSDEFId){
        this.setLinkPSDEFId(linkPSDEFId);
        return this;
    }

    /**
     * 设置 链接属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setLinkPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMapItem linkpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setLinkPSDEFId(null);
            this.setLinkPSDEFName(null);
        }
        else{
            this.setLinkPSDEFId(pSDEField.getPSDEFieldId());
            this.setLinkPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>LINKPSDEFNAME</B>&nbsp;链接属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_LINKPSDEFID}
     */
    public final static String FIELD_LINKPSDEFNAME = "linkpsdefname";

    /**
     * 设置 链接属性
     * 
     * @param linkPSDEFName
     * 
     */
    @JsonProperty(FIELD_LINKPSDEFNAME)
    public void setLinkPSDEFName(String linkPSDEFName){
        this.set(FIELD_LINKPSDEFNAME, linkPSDEFName);
    }
    
    /**
     * 获取 链接属性  
     * @return
     */
    @JsonIgnore
    public String getLinkPSDEFName(){
        Object objValue = this.get(FIELD_LINKPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 链接属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLinkPSDEFNameDirty(){
        if(this.contains(FIELD_LINKPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 链接属性
     */
    @JsonIgnore
    public void resetLinkPSDEFName(){
        this.reset(FIELD_LINKPSDEFNAME);
    }

    /**
     * 设置 链接属性
     * <P>
     * 等同 {@link #setLinkPSDEFName}
     * @param linkPSDEFName
     */
    @JsonIgnore
    public PSSysMapItem linkpsdefname(String linkPSDEFName){
        this.setLinkPSDEFName(linkPSDEFName);
        return this;
    }

    /**
     * <B>LONGPSDEFID</B>&nbsp;经度属性，指定地图部件项的经度存储属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_LONGPSDEFID = "longpsdefid";

    /**
     * 设置 经度属性，详细说明：{@link #FIELD_LONGPSDEFID}
     * 
     * @param longPSDEFId
     * 
     */
    @JsonProperty(FIELD_LONGPSDEFID)
    public void setLongPSDEFId(String longPSDEFId){
        this.set(FIELD_LONGPSDEFID, longPSDEFId);
    }
    
    /**
     * 获取 经度属性  
     * @return
     */
    @JsonIgnore
    public String getLongPSDEFId(){
        Object objValue = this.get(FIELD_LONGPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 经度属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLongPSDEFIdDirty(){
        if(this.contains(FIELD_LONGPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 经度属性
     */
    @JsonIgnore
    public void resetLongPSDEFId(){
        this.reset(FIELD_LONGPSDEFID);
    }

    /**
     * 设置 经度属性，详细说明：{@link #FIELD_LONGPSDEFID}
     * <P>
     * 等同 {@link #setLongPSDEFId}
     * @param longPSDEFId
     */
    @JsonIgnore
    public PSSysMapItem longpsdefid(String longPSDEFId){
        this.setLongPSDEFId(longPSDEFId);
        return this;
    }

    /**
     * 设置 经度属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setLongPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMapItem longpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setLongPSDEFId(null);
            this.setLongPSDEFName(null);
        }
        else{
            this.setLongPSDEFId(pSDEField.getPSDEFieldId());
            this.setLongPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>LONGPSDEFNAME</B>&nbsp;经度属性，指定地图部件项的经度存储属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_LONGPSDEFID}
     */
    public final static String FIELD_LONGPSDEFNAME = "longpsdefname";

    /**
     * 设置 经度属性，详细说明：{@link #FIELD_LONGPSDEFNAME}
     * 
     * @param longPSDEFName
     * 
     */
    @JsonProperty(FIELD_LONGPSDEFNAME)
    public void setLongPSDEFName(String longPSDEFName){
        this.set(FIELD_LONGPSDEFNAME, longPSDEFName);
    }
    
    /**
     * 获取 经度属性  
     * @return
     */
    @JsonIgnore
    public String getLongPSDEFName(){
        Object objValue = this.get(FIELD_LONGPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 经度属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLongPSDEFNameDirty(){
        if(this.contains(FIELD_LONGPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 经度属性
     */
    @JsonIgnore
    public void resetLongPSDEFName(){
        this.reset(FIELD_LONGPSDEFNAME);
    }

    /**
     * 设置 经度属性，详细说明：{@link #FIELD_LONGPSDEFNAME}
     * <P>
     * 等同 {@link #setLongPSDEFName}
     * @param longPSDEFName
     */
    @JsonIgnore
    public PSSysMapItem longpsdefname(String longPSDEFName){
        this.setLongPSDEFName(longPSDEFName);
        return this;
    }

    /**
     * <B>MAXSIZE</B>&nbsp;最大节点数量，指定地图部件项最大的加载数量，-1为不限制。未定义时为【-1】
     */
    public final static String FIELD_MAXSIZE = "maxsize";

    /**
     * 设置 最大节点数量，详细说明：{@link #FIELD_MAXSIZE}
     * 
     * @param maxSize
     * 
     */
    @JsonProperty(FIELD_MAXSIZE)
    public void setMaxSize(Integer maxSize){
        this.set(FIELD_MAXSIZE, maxSize);
    }
    
    /**
     * 获取 最大节点数量  
     * @return
     */
    @JsonIgnore
    public Integer getMaxSize(){
        Object objValue = this.get(FIELD_MAXSIZE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 最大节点数量 是否指定值，包括空值
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
     * 重置 最大节点数量
     */
    @JsonIgnore
    public void resetMaxSize(){
        this.reset(FIELD_MAXSIZE);
    }

    /**
     * 设置 最大节点数量，详细说明：{@link #FIELD_MAXSIZE}
     * <P>
     * 等同 {@link #setMaxSize}
     * @param maxSize
     */
    @JsonIgnore
    public PSSysMapItem maxsize(Integer maxSize){
        this.setMaxSize(maxSize);
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
    public PSSysMapItem memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MODELOBJ</B>&nbsp;项模型对象，指定地图部件项的动态模型对象，此配置需确定各模板具体的实现方式
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_MODELOBJ = "modelobj";

    /**
     * 设置 项模型对象，详细说明：{@link #FIELD_MODELOBJ}
     * 
     * @param modelObj
     * 
     */
    @JsonProperty(FIELD_MODELOBJ)
    public void setModelObj(String modelObj){
        this.set(FIELD_MODELOBJ, modelObj);
    }
    
    /**
     * 获取 项模型对象  
     * @return
     */
    @JsonIgnore
    public String getModelObj(){
        Object objValue = this.get(FIELD_MODELOBJ);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项模型对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isModelObjDirty(){
        if(this.contains(FIELD_MODELOBJ)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项模型对象
     */
    @JsonIgnore
    public void resetModelObj(){
        this.reset(FIELD_MODELOBJ);
    }

    /**
     * 设置 项模型对象，详细说明：{@link #FIELD_MODELOBJ}
     * <P>
     * 等同 {@link #setModelObj}
     * @param modelObj
     */
    @JsonIgnore
    public PSSysMapItem modelobj(String modelObj){
        this.setModelObj(modelObj);
        return this;
    }

    /**
     * <B>MOVEPSDEACTIONID</B>&nbsp;移动数据实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_MOVEPSDEACTIONID = "movepsdeactionid";

    /**
     * 设置 移动数据实体行为
     * 
     * @param movePSDEActionId
     * 
     */
    @JsonProperty(FIELD_MOVEPSDEACTIONID)
    public void setMovePSDEActionId(String movePSDEActionId){
        this.set(FIELD_MOVEPSDEACTIONID, movePSDEActionId);
    }
    
    /**
     * 获取 移动数据实体行为  
     * @return
     */
    @JsonIgnore
    public String getMovePSDEActionId(){
        Object objValue = this.get(FIELD_MOVEPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动数据实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMovePSDEActionIdDirty(){
        if(this.contains(FIELD_MOVEPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动数据实体行为
     */
    @JsonIgnore
    public void resetMovePSDEActionId(){
        this.reset(FIELD_MOVEPSDEACTIONID);
    }

    /**
     * 设置 移动数据实体行为
     * <P>
     * 等同 {@link #setMovePSDEActionId}
     * @param movePSDEActionId
     */
    @JsonIgnore
    public PSSysMapItem movepsdeactionid(String movePSDEActionId){
        this.setMovePSDEActionId(movePSDEActionId);
        return this;
    }

    /**
     * 设置 移动数据实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMovePSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSSysMapItem movepsdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setMovePSDEActionId(null);
            this.setMovePSDEActionName(null);
        }
        else{
            this.setMovePSDEActionId(pSDEAction.getPSDEActionId());
            this.setMovePSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>MOVEPSDEACTIONNAME</B>&nbsp;移动数据实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOVEPSDEACTIONID}
     */
    public final static String FIELD_MOVEPSDEACTIONNAME = "movepsdeactionname";

    /**
     * 设置 移动数据实体行为
     * 
     * @param movePSDEActionName
     * 
     */
    @JsonProperty(FIELD_MOVEPSDEACTIONNAME)
    public void setMovePSDEActionName(String movePSDEActionName){
        this.set(FIELD_MOVEPSDEACTIONNAME, movePSDEActionName);
    }
    
    /**
     * 获取 移动数据实体行为  
     * @return
     */
    @JsonIgnore
    public String getMovePSDEActionName(){
        Object objValue = this.get(FIELD_MOVEPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动数据实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMovePSDEActionNameDirty(){
        if(this.contains(FIELD_MOVEPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动数据实体行为
     */
    @JsonIgnore
    public void resetMovePSDEActionName(){
        this.reset(FIELD_MOVEPSDEACTIONNAME);
    }

    /**
     * 设置 移动数据实体行为
     * <P>
     * 等同 {@link #setMovePSDEActionName}
     * @param movePSDEActionName
     */
    @JsonIgnore
    public PSSysMapItem movepsdeactionname(String movePSDEActionName){
        this.setMovePSDEActionName(movePSDEActionName);
        return this;
    }

    /**
     * <B>MOVEPSDEOPPRIVID</B>&nbsp;移动实体操作标识
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEOPPriv} 
     */
    public final static String FIELD_MOVEPSDEOPPRIVID = "movepsdeopprivid";

    /**
     * 设置 移动实体操作标识
     * 
     * @param movePSDEOPPrivId
     * 
     */
    @JsonProperty(FIELD_MOVEPSDEOPPRIVID)
    public void setMovePSDEOPPrivId(String movePSDEOPPrivId){
        this.set(FIELD_MOVEPSDEOPPRIVID, movePSDEOPPrivId);
    }
    
    /**
     * 获取 移动实体操作标识  
     * @return
     */
    @JsonIgnore
    public String getMovePSDEOPPrivId(){
        Object objValue = this.get(FIELD_MOVEPSDEOPPRIVID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动实体操作标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMovePSDEOPPrivIdDirty(){
        if(this.contains(FIELD_MOVEPSDEOPPRIVID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动实体操作标识
     */
    @JsonIgnore
    public void resetMovePSDEOPPrivId(){
        this.reset(FIELD_MOVEPSDEOPPRIVID);
    }

    /**
     * 设置 移动实体操作标识
     * <P>
     * 等同 {@link #setMovePSDEOPPrivId}
     * @param movePSDEOPPrivId
     */
    @JsonIgnore
    public PSSysMapItem movepsdeopprivid(String movePSDEOPPrivId){
        this.setMovePSDEOPPrivId(movePSDEOPPrivId);
        return this;
    }

    /**
     * 设置 移动实体操作标识，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMovePSDEOPPrivId}
     * @param pSDEOPPriv 引用对象
     */
    @JsonIgnore
    public PSSysMapItem movepsdeopprivid(PSDEOPPriv pSDEOPPriv){
        if(pSDEOPPriv == null){
            this.setMovePSDEOPPrivId(null);
            this.setMovePSDEOPPrivName(null);
        }
        else{
            this.setMovePSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setMovePSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    /**
     * <B>MOVEPSDEOPPRIVNAME</B>&nbsp;移动实体操作标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOVEPSDEOPPRIVID}
     */
    public final static String FIELD_MOVEPSDEOPPRIVNAME = "movepsdeopprivname";

    /**
     * 设置 移动实体操作标识
     * 
     * @param movePSDEOPPrivName
     * 
     */
    @JsonProperty(FIELD_MOVEPSDEOPPRIVNAME)
    public void setMovePSDEOPPrivName(String movePSDEOPPrivName){
        this.set(FIELD_MOVEPSDEOPPRIVNAME, movePSDEOPPrivName);
    }
    
    /**
     * 获取 移动实体操作标识  
     * @return
     */
    @JsonIgnore
    public String getMovePSDEOPPrivName(){
        Object objValue = this.get(FIELD_MOVEPSDEOPPRIVNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动实体操作标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMovePSDEOPPrivNameDirty(){
        if(this.contains(FIELD_MOVEPSDEOPPRIVNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动实体操作标识
     */
    @JsonIgnore
    public void resetMovePSDEOPPrivName(){
        this.reset(FIELD_MOVEPSDEOPPRIVNAME);
    }

    /**
     * 设置 移动实体操作标识
     * <P>
     * 等同 {@link #setMovePSDEOPPrivName}
     * @param movePSDEOPPrivName
     */
    @JsonIgnore
    public PSSysMapItem movepsdeopprivname(String movePSDEOPPrivName){
        this.setMovePSDEOPPrivName(movePSDEOPPrivName);
        return this;
    }

    /**
     * <B>NAMEPSLANRESID</B>&nbsp;名称语言资源，指定地图部件项的名称的多语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_NAMEPSLANRESID = "namepslanresid";

    /**
     * 设置 名称语言资源，详细说明：{@link #FIELD_NAMEPSLANRESID}
     * 
     * @param namePSLanResId
     * 
     */
    @JsonProperty(FIELD_NAMEPSLANRESID)
    public void setNamePSLanResId(String namePSLanResId){
        this.set(FIELD_NAMEPSLANRESID, namePSLanResId);
    }
    
    /**
     * 获取 名称语言资源  
     * @return
     */
    @JsonIgnore
    public String getNamePSLanResId(){
        Object objValue = this.get(FIELD_NAMEPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 名称语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNamePSLanResIdDirty(){
        if(this.contains(FIELD_NAMEPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 名称语言资源
     */
    @JsonIgnore
    public void resetNamePSLanResId(){
        this.reset(FIELD_NAMEPSLANRESID);
    }

    /**
     * 设置 名称语言资源，详细说明：{@link #FIELD_NAMEPSLANRESID}
     * <P>
     * 等同 {@link #setNamePSLanResId}
     * @param namePSLanResId
     */
    @JsonIgnore
    public PSSysMapItem namepslanresid(String namePSLanResId){
        this.setNamePSLanResId(namePSLanResId);
        return this;
    }

    /**
     * 设置 名称语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNamePSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSSysMapItem namepslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setNamePSLanResId(null);
            this.setNamePSLanResName(null);
        }
        else{
            this.setNamePSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setNamePSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>NAMEPSLANRESNAME</B>&nbsp;名称语言资源，指定地图部件项的名称的多语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NAMEPSLANRESID}
     */
    public final static String FIELD_NAMEPSLANRESNAME = "namepslanresname";

    /**
     * 设置 名称语言资源，详细说明：{@link #FIELD_NAMEPSLANRESNAME}
     * 
     * @param namePSLanResName
     * 
     */
    @JsonProperty(FIELD_NAMEPSLANRESNAME)
    public void setNamePSLanResName(String namePSLanResName){
        this.set(FIELD_NAMEPSLANRESNAME, namePSLanResName);
    }
    
    /**
     * 获取 名称语言资源  
     * @return
     */
    @JsonIgnore
    public String getNamePSLanResName(){
        Object objValue = this.get(FIELD_NAMEPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 名称语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNamePSLanResNameDirty(){
        if(this.contains(FIELD_NAMEPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 名称语言资源
     */
    @JsonIgnore
    public void resetNamePSLanResName(){
        this.reset(FIELD_NAMEPSLANRESNAME);
    }

    /**
     * 设置 名称语言资源，详细说明：{@link #FIELD_NAMEPSLANRESNAME}
     * <P>
     * 等同 {@link #setNamePSLanResName}
     * @param namePSLanResName
     */
    @JsonIgnore
    public PSSysMapItem namepslanresname(String namePSLanResName){
        this.setNamePSLanResName(namePSLanResName);
        return this;
    }

    /**
     * <B>NAVVIEWFILTER</B>&nbsp;导航视图过滤项，指定地图部件项关联导航视图的过滤项名称，导航视图一般使用应用上下文自动进行数据过滤，指定过滤项将为导航视图显示传入过滤条件
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
    public PSSysMapItem navviewfilter(String navViewFilter){
        this.setNavViewFilter(navViewFilter);
        return this;
    }

    /**
     * <B>NAVVIEWPARAM</B>&nbsp;导航视图参数，指定地图部件项序列关联导航视图的额外参数
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
    public PSSysMapItem navviewparam(String navViewParam){
        this.setNavViewParam(navViewParam);
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
    public PSSysMapItem ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>ORDERVALUEPSDEFID</B>&nbsp;排序属性，指定地图部件项的排序值存储属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_ORDERVALUEPSDEFID = "ordervaluepsdefid";

    /**
     * 设置 排序属性，详细说明：{@link #FIELD_ORDERVALUEPSDEFID}
     * 
     * @param orderValuePSDEFId
     * 
     */
    @JsonProperty(FIELD_ORDERVALUEPSDEFID)
    public void setOrderValuePSDEFId(String orderValuePSDEFId){
        this.set(FIELD_ORDERVALUEPSDEFID, orderValuePSDEFId);
    }
    
    /**
     * 获取 排序属性  
     * @return
     */
    @JsonIgnore
    public String getOrderValuePSDEFId(){
        Object objValue = this.get(FIELD_ORDERVALUEPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 排序属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOrderValuePSDEFIdDirty(){
        if(this.contains(FIELD_ORDERVALUEPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 排序属性
     */
    @JsonIgnore
    public void resetOrderValuePSDEFId(){
        this.reset(FIELD_ORDERVALUEPSDEFID);
    }

    /**
     * 设置 排序属性，详细说明：{@link #FIELD_ORDERVALUEPSDEFID}
     * <P>
     * 等同 {@link #setOrderValuePSDEFId}
     * @param orderValuePSDEFId
     */
    @JsonIgnore
    public PSSysMapItem ordervaluepsdefid(String orderValuePSDEFId){
        this.setOrderValuePSDEFId(orderValuePSDEFId);
        return this;
    }

    /**
     * 设置 排序属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setOrderValuePSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMapItem ordervaluepsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setOrderValuePSDEFId(null);
            this.setOrderValuePSDEFName(null);
        }
        else{
            this.setOrderValuePSDEFId(pSDEField.getPSDEFieldId());
            this.setOrderValuePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>ORDERVALUEPSDEFNAME</B>&nbsp;排序属性，指定地图部件项的排序值存储属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ORDERVALUEPSDEFID}
     */
    public final static String FIELD_ORDERVALUEPSDEFNAME = "ordervaluepsdefname";

    /**
     * 设置 排序属性，详细说明：{@link #FIELD_ORDERVALUEPSDEFNAME}
     * 
     * @param orderValuePSDEFName
     * 
     */
    @JsonProperty(FIELD_ORDERVALUEPSDEFNAME)
    public void setOrderValuePSDEFName(String orderValuePSDEFName){
        this.set(FIELD_ORDERVALUEPSDEFNAME, orderValuePSDEFName);
    }
    
    /**
     * 获取 排序属性  
     * @return
     */
    @JsonIgnore
    public String getOrderValuePSDEFName(){
        Object objValue = this.get(FIELD_ORDERVALUEPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 排序属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOrderValuePSDEFNameDirty(){
        if(this.contains(FIELD_ORDERVALUEPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 排序属性
     */
    @JsonIgnore
    public void resetOrderValuePSDEFName(){
        this.reset(FIELD_ORDERVALUEPSDEFNAME);
    }

    /**
     * 设置 排序属性，详细说明：{@link #FIELD_ORDERVALUEPSDEFNAME}
     * <P>
     * 等同 {@link #setOrderValuePSDEFName}
     * @param orderValuePSDEFName
     */
    @JsonIgnore
    public PSSysMapItem ordervaluepsdefname(String orderValuePSDEFName){
        this.setOrderValuePSDEFName(orderValuePSDEFName);
        return this;
    }

    /**
     * <B>PSDEDSID</B>&nbsp;实体数据集合，指定地图部件项供数的数据集对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataSet} 
     */
    public final static String FIELD_PSDEDSID = "psdedsid";

    /**
     * 设置 实体数据集合，详细说明：{@link #FIELD_PSDEDSID}
     * 
     * @param pSDEDSId
     * 
     */
    @JsonProperty(FIELD_PSDEDSID)
    public void setPSDEDSId(String pSDEDSId){
        this.set(FIELD_PSDEDSID, pSDEDSId);
    }
    
    /**
     * 获取 实体数据集合  
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
     * 判断 实体数据集合 是否指定值，包括空值
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
     * 重置 实体数据集合
     */
    @JsonIgnore
    public void resetPSDEDSId(){
        this.reset(FIELD_PSDEDSID);
    }

    /**
     * 设置 实体数据集合，详细说明：{@link #FIELD_PSDEDSID}
     * <P>
     * 等同 {@link #setPSDEDSId}
     * @param pSDEDSId
     */
    @JsonIgnore
    public PSSysMapItem psdedsid(String pSDEDSId){
        this.setPSDEDSId(pSDEDSId);
        return this;
    }

    /**
     * 设置 实体数据集合，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDSId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSSysMapItem psdedsid(PSDEDataSet pSDEDataSet){
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
     * <B>PSDEDSNAME</B>&nbsp;实体数据集合，指定地图部件项供数的数据集对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDSID}
     */
    public final static String FIELD_PSDEDSNAME = "psdedsname";

    /**
     * 设置 实体数据集合，详细说明：{@link #FIELD_PSDEDSNAME}
     * 
     * @param pSDEDSName
     * 
     */
    @JsonProperty(FIELD_PSDEDSNAME)
    public void setPSDEDSName(String pSDEDSName){
        this.set(FIELD_PSDEDSNAME, pSDEDSName);
    }
    
    /**
     * 获取 实体数据集合  
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
     * 判断 实体数据集合 是否指定值，包括空值
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
     * 重置 实体数据集合
     */
    @JsonIgnore
    public void resetPSDEDSName(){
        this.reset(FIELD_PSDEDSNAME);
    }

    /**
     * 设置 实体数据集合，详细说明：{@link #FIELD_PSDEDSNAME}
     * <P>
     * 等同 {@link #setPSDEDSName}
     * @param pSDEDSName
     */
    @JsonIgnore
    public PSSysMapItem psdedsname(String pSDEDSName){
        this.setPSDEDSName(pSDEDSName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定地图部件项相关的实体对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
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
    public PSSysMapItem psdeid(String pSDEId){
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
    public PSSysMapItem psdeid(PSDataEntity pSDataEntity){
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
     * <B>PSDELOGICID</B>&nbsp;上下文数据逻辑，指定地图部件项使用数据集的查询上下文转换逻辑，将调用环境参数转换为数据集的调用参数
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDELogic} 
     */
    public final static String FIELD_PSDELOGICID = "psdelogicid";

    /**
     * 设置 上下文数据逻辑，详细说明：{@link #FIELD_PSDELOGICID}
     * 
     * @param pSDELogicId
     * 
     */
    @JsonProperty(FIELD_PSDELOGICID)
    public void setPSDELogicId(String pSDELogicId){
        this.set(FIELD_PSDELOGICID, pSDELogicId);
    }
    
    /**
     * 获取 上下文数据逻辑  
     * @return
     */
    @JsonIgnore
    public String getPSDELogicId(){
        Object objValue = this.get(FIELD_PSDELOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 上下文数据逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDELogicIdDirty(){
        if(this.contains(FIELD_PSDELOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 上下文数据逻辑
     */
    @JsonIgnore
    public void resetPSDELogicId(){
        this.reset(FIELD_PSDELOGICID);
    }

    /**
     * 设置 上下文数据逻辑，详细说明：{@link #FIELD_PSDELOGICID}
     * <P>
     * 等同 {@link #setPSDELogicId}
     * @param pSDELogicId
     */
    @JsonIgnore
    public PSSysMapItem psdelogicid(String pSDELogicId){
        this.setPSDELogicId(pSDELogicId);
        return this;
    }

    /**
     * 设置 上下文数据逻辑，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDELogicId}
     * @param pSDELogic 引用对象
     */
    @JsonIgnore
    public PSSysMapItem psdelogicid(PSDELogic pSDELogic){
        if(pSDELogic == null){
            this.setPSDELogicId(null);
            this.setPSDELogicName(null);
        }
        else{
            this.setPSDELogicId(pSDELogic.getPSDELogicId());
            this.setPSDELogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    /**
     * <B>PSDELOGICNAME</B>&nbsp;上下文数据逻辑，指定地图部件项使用数据集的查询上下文转换逻辑，将调用环境参数转换为数据集的调用参数
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDELOGICID}
     */
    public final static String FIELD_PSDELOGICNAME = "psdelogicname";

    /**
     * 设置 上下文数据逻辑，详细说明：{@link #FIELD_PSDELOGICNAME}
     * 
     * @param pSDELogicName
     * 
     */
    @JsonProperty(FIELD_PSDELOGICNAME)
    public void setPSDELogicName(String pSDELogicName){
        this.set(FIELD_PSDELOGICNAME, pSDELogicName);
    }
    
    /**
     * 获取 上下文数据逻辑  
     * @return
     */
    @JsonIgnore
    public String getPSDELogicName(){
        Object objValue = this.get(FIELD_PSDELOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 上下文数据逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDELogicNameDirty(){
        if(this.contains(FIELD_PSDELOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 上下文数据逻辑
     */
    @JsonIgnore
    public void resetPSDELogicName(){
        this.reset(FIELD_PSDELOGICNAME);
    }

    /**
     * 设置 上下文数据逻辑，详细说明：{@link #FIELD_PSDELOGICNAME}
     * <P>
     * 等同 {@link #setPSDELogicName}
     * @param pSDELogicName
     */
    @JsonIgnore
    public PSSysMapItem psdelogicname(String pSDELogicName){
        this.setPSDELogicName(pSDELogicName);
        return this;
    }

    /**
     * <B>PSDENAME</B>&nbsp;实体，指定地图部件项相关的实体对象
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
    public PSSysMapItem psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSDERID</B>&nbsp;导航视图关系，指定地图部件项默认的导航关系，此配置在地图导航视图启用
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
    public PSSysMapItem psderid(String pSDERId){
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
    public PSSysMapItem psderid(PSDER pSDER){
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
     * <B>PSDERNAME</B>&nbsp;导航视图关系，指定地图部件项默认的导航关系，此配置在地图导航视图启用
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
    public PSSysMapItem psdername(String pSDERName){
        this.setPSDERName(pSDERName);
        return this;
    }

    /**
     * <B>PSDETOOLBARID</B>&nbsp;上下文菜单，指定地图部件项的上下文菜单对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEToolbar} 
     */
    public final static String FIELD_PSDETOOLBARID = "psdetoolbarid";

    /**
     * 设置 上下文菜单，详细说明：{@link #FIELD_PSDETOOLBARID}
     * 
     * @param pSDEToolbarId
     * 
     */
    @JsonProperty(FIELD_PSDETOOLBARID)
    public void setPSDEToolbarId(String pSDEToolbarId){
        this.set(FIELD_PSDETOOLBARID, pSDEToolbarId);
    }
    
    /**
     * 获取 上下文菜单  
     * @return
     */
    @JsonIgnore
    public String getPSDEToolbarId(){
        Object objValue = this.get(FIELD_PSDETOOLBARID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 上下文菜单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEToolbarIdDirty(){
        if(this.contains(FIELD_PSDETOOLBARID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 上下文菜单
     */
    @JsonIgnore
    public void resetPSDEToolbarId(){
        this.reset(FIELD_PSDETOOLBARID);
    }

    /**
     * 设置 上下文菜单，详细说明：{@link #FIELD_PSDETOOLBARID}
     * <P>
     * 等同 {@link #setPSDEToolbarId}
     * @param pSDEToolbarId
     */
    @JsonIgnore
    public PSSysMapItem psdetoolbarid(String pSDEToolbarId){
        this.setPSDEToolbarId(pSDEToolbarId);
        return this;
    }

    /**
     * 设置 上下文菜单，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEToolbarId}
     * @param pSDEToolbar 引用对象
     */
    @JsonIgnore
    public PSSysMapItem psdetoolbarid(PSDEToolbar pSDEToolbar){
        if(pSDEToolbar == null){
            this.setPSDEToolbarId(null);
            this.setPSDEToolbarName(null);
        }
        else{
            this.setPSDEToolbarId(pSDEToolbar.getPSDEToolbarId());
            this.setPSDEToolbarName(pSDEToolbar.getPSDEToolbarName());
        }
        return this;
    }

    /**
     * <B>PSDETOOLBARNAME</B>&nbsp;上下文菜单，指定地图部件项的上下文菜单对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDETOOLBARID}
     */
    public final static String FIELD_PSDETOOLBARNAME = "psdetoolbarname";

    /**
     * 设置 上下文菜单，详细说明：{@link #FIELD_PSDETOOLBARNAME}
     * 
     * @param pSDEToolbarName
     * 
     */
    @JsonProperty(FIELD_PSDETOOLBARNAME)
    public void setPSDEToolbarName(String pSDEToolbarName){
        this.set(FIELD_PSDETOOLBARNAME, pSDEToolbarName);
    }
    
    /**
     * 获取 上下文菜单  
     * @return
     */
    @JsonIgnore
    public String getPSDEToolbarName(){
        Object objValue = this.get(FIELD_PSDETOOLBARNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 上下文菜单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEToolbarNameDirty(){
        if(this.contains(FIELD_PSDETOOLBARNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 上下文菜单
     */
    @JsonIgnore
    public void resetPSDEToolbarName(){
        this.reset(FIELD_PSDETOOLBARNAME);
    }

    /**
     * 设置 上下文菜单，详细说明：{@link #FIELD_PSDETOOLBARNAME}
     * <P>
     * 等同 {@link #setPSDEToolbarName}
     * @param pSDEToolbarName
     */
    @JsonIgnore
    public PSSysMapItem psdetoolbarname(String pSDEToolbarName){
        this.setPSDEToolbarName(pSDEToolbarName);
        return this;
    }

    /**
     * <B>PSDEVIEWBASEID</B>&nbsp;详细视图，指定地图部件项默认的导航关系视图，此配置在地图导航视图启用
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_PSDEVIEWBASEID = "psdeviewbaseid";

    /**
     * 设置 详细视图，详细说明：{@link #FIELD_PSDEVIEWBASEID}
     * 
     * @param pSDEViewBaseId
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWBASEID)
    public void setPSDEViewBaseId(String pSDEViewBaseId){
        this.set(FIELD_PSDEVIEWBASEID, pSDEViewBaseId);
    }
    
    /**
     * 获取 详细视图  
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
     * 判断 详细视图 是否指定值，包括空值
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
     * 重置 详细视图
     */
    @JsonIgnore
    public void resetPSDEViewBaseId(){
        this.reset(FIELD_PSDEVIEWBASEID);
    }

    /**
     * 设置 详细视图，详细说明：{@link #FIELD_PSDEVIEWBASEID}
     * <P>
     * 等同 {@link #setPSDEViewBaseId}
     * @param pSDEViewBaseId
     */
    @JsonIgnore
    public PSSysMapItem psdeviewbaseid(String pSDEViewBaseId){
        this.setPSDEViewBaseId(pSDEViewBaseId);
        return this;
    }

    /**
     * 设置 详细视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEViewBaseId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSSysMapItem psdeviewbaseid(PSDEViewBase pSDEViewBase){
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
     * <B>PSDEVIEWBASENAME</B>&nbsp;导航视图，指定地图部件项默认的导航关系视图，此配置在地图导航视图启用
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
    public PSSysMapItem psdeviewbasename(String pSDEViewBaseName){
        this.setPSDEViewBaseName(pSDEViewBaseName);
        return this;
    }

    /**
     * <B>PSSYSCSSID</B>&nbsp;系统界面样式，指定地图部件项界面的容器样式表对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCss} 
     */
    public final static String FIELD_PSSYSCSSID = "pssyscssid";

    /**
     * 设置 系统界面样式，详细说明：{@link #FIELD_PSSYSCSSID}
     * 
     * @param pSSysCssId
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSID)
    public void setPSSysCssId(String pSSysCssId){
        this.set(FIELD_PSSYSCSSID, pSSysCssId);
    }
    
    /**
     * 获取 系统界面样式  
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
     * 判断 系统界面样式 是否指定值，包括空值
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
     * 重置 系统界面样式
     */
    @JsonIgnore
    public void resetPSSysCssId(){
        this.reset(FIELD_PSSYSCSSID);
    }

    /**
     * 设置 系统界面样式，详细说明：{@link #FIELD_PSSYSCSSID}
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCssId
     */
    @JsonIgnore
    public PSSysMapItem pssyscssid(String pSSysCssId){
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    /**
     * 设置 系统界面样式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSSysMapItem pssyscssid(PSSysCss pSSysCss){
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
     * <B>PSSYSCSSNAME</B>&nbsp;界面样式表，指定地图部件项界面的容器样式表对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSCSSID}
     */
    public final static String FIELD_PSSYSCSSNAME = "pssyscssname";

    /**
     * 设置 界面样式表，详细说明：{@link #FIELD_PSSYSCSSNAME}
     * 
     * @param pSSysCssName
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSNAME)
    public void setPSSysCssName(String pSSysCssName){
        this.set(FIELD_PSSYSCSSNAME, pSSysCssName);
    }
    
    /**
     * 获取 界面样式表  
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
     * 判断 界面样式表 是否指定值，包括空值
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
     * 重置 界面样式表
     */
    @JsonIgnore
    public void resetPSSysCssName(){
        this.reset(FIELD_PSSYSCSSNAME);
    }

    /**
     * 设置 界面样式表，详细说明：{@link #FIELD_PSSYSCSSNAME}
     * <P>
     * 等同 {@link #setPSSysCssName}
     * @param pSSysCssName
     */
    @JsonIgnore
    public PSSysMapItem pssyscssname(String pSSysCssName){
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    /**
     * <B>PSSYSIMAGEID</B>&nbsp;项图片
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysImage} 
     */
    public final static String FIELD_PSSYSIMAGEID = "pssysimageid";

    /**
     * 设置 项图片
     * 
     * @param pSSysImageId
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGEID)
    public void setPSSysImageId(String pSSysImageId){
        this.set(FIELD_PSSYSIMAGEID, pSSysImageId);
    }
    
    /**
     * 获取 项图片  
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
     * 判断 项图片 是否指定值，包括空值
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
     * 重置 项图片
     */
    @JsonIgnore
    public void resetPSSysImageId(){
        this.reset(FIELD_PSSYSIMAGEID);
    }

    /**
     * 设置 项图片
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImageId
     */
    @JsonIgnore
    public PSSysMapItem pssysimageid(String pSSysImageId){
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    /**
     * 设置 项图片，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImage 引用对象
     */
    @JsonIgnore
    public PSSysMapItem pssysimageid(PSSysImage pSSysImage){
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
     * <B>PSSYSIMAGENAME</B>&nbsp;项图片
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSIMAGEID}
     */
    public final static String FIELD_PSSYSIMAGENAME = "pssysimagename";

    /**
     * 设置 项图片
     * 
     * @param pSSysImageName
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGENAME)
    public void setPSSysImageName(String pSSysImageName){
        this.set(FIELD_PSSYSIMAGENAME, pSSysImageName);
    }
    
    /**
     * 获取 项图片  
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
     * 判断 项图片 是否指定值，包括空值
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
     * 重置 项图片
     */
    @JsonIgnore
    public void resetPSSysImageName(){
        this.reset(FIELD_PSSYSIMAGENAME);
    }

    /**
     * 设置 项图片
     * <P>
     * 等同 {@link #setPSSysImageName}
     * @param pSSysImageName
     */
    @JsonIgnore
    public PSSysMapItem pssysimagename(String pSSysImageName){
        this.setPSSysImageName(pSSysImageName);
        return this;
    }

    /**
     * <B>PSSYSMAPITEMID</B>&nbsp;系统地图数据项标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSMAPITEMID = "pssysmapitemid";

    /**
     * 设置 系统地图数据项标识
     * 
     * @param pSSysMapItemId
     * 
     */
    @JsonProperty(FIELD_PSSYSMAPITEMID)
    public void setPSSysMapItemId(String pSSysMapItemId){
        this.set(FIELD_PSSYSMAPITEMID, pSSysMapItemId);
    }
    
    /**
     * 获取 系统地图数据项标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysMapItemId(){
        Object objValue = this.get(FIELD_PSSYSMAPITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统地图数据项标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysMapItemIdDirty(){
        if(this.contains(FIELD_PSSYSMAPITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统地图数据项标识
     */
    @JsonIgnore
    public void resetPSSysMapItemId(){
        this.reset(FIELD_PSSYSMAPITEMID);
    }

    /**
     * 设置 系统地图数据项标识
     * <P>
     * 等同 {@link #setPSSysMapItemId}
     * @param pSSysMapItemId
     */
    @JsonIgnore
    public PSSysMapItem pssysmapitemid(String pSSysMapItemId){
        this.setPSSysMapItemId(pSSysMapItemId);
        return this;
    }

    /**
     * <B>PSSYSMAPITEMNAME</B>&nbsp;项名称，指定地图部件项的名称，需在所在地图部件具备唯一性
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_PSSYSMAPITEMNAME = "pssysmapitemname";

    /**
     * 设置 项名称，详细说明：{@link #FIELD_PSSYSMAPITEMNAME}
     * 
     * @param pSSysMapItemName
     * 
     */
    @JsonProperty(FIELD_PSSYSMAPITEMNAME)
    public void setPSSysMapItemName(String pSSysMapItemName){
        this.set(FIELD_PSSYSMAPITEMNAME, pSSysMapItemName);
    }
    
    /**
     * 获取 项名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysMapItemName(){
        Object objValue = this.get(FIELD_PSSYSMAPITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysMapItemNameDirty(){
        if(this.contains(FIELD_PSSYSMAPITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项名称
     */
    @JsonIgnore
    public void resetPSSysMapItemName(){
        this.reset(FIELD_PSSYSMAPITEMNAME);
    }

    /**
     * 设置 项名称，详细说明：{@link #FIELD_PSSYSMAPITEMNAME}
     * <P>
     * 等同 {@link #setPSSysMapItemName}
     * @param pSSysMapItemName
     */
    @JsonIgnore
    public PSSysMapItem pssysmapitemname(String pSSysMapItemName){
        this.setPSSysMapItemName(pSSysMapItemName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysMapItemName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysMapItemName(strName);
    }

    @JsonIgnore
    public PSSysMapItem name(String strName){
        this.setPSSysMapItemName(strName);
        return this;
    }

    /**
     * <B>PSSYSMAPVIEWID</B>&nbsp;地图部件，指定地图部件项所在的地图部件对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysMapView} 
     */
    public final static String FIELD_PSSYSMAPVIEWID = "pssysmapviewid";

    /**
     * 设置 地图部件，详细说明：{@link #FIELD_PSSYSMAPVIEWID}
     * 
     * @param pSSysMapViewId
     * 
     */
    @JsonProperty(FIELD_PSSYSMAPVIEWID)
    public void setPSSysMapViewId(String pSSysMapViewId){
        this.set(FIELD_PSSYSMAPVIEWID, pSSysMapViewId);
    }
    
    /**
     * 获取 地图部件  
     * @return
     */
    @JsonIgnore
    public String getPSSysMapViewId(){
        Object objValue = this.get(FIELD_PSSYSMAPVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 地图部件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysMapViewIdDirty(){
        if(this.contains(FIELD_PSSYSMAPVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 地图部件
     */
    @JsonIgnore
    public void resetPSSysMapViewId(){
        this.reset(FIELD_PSSYSMAPVIEWID);
    }

    /**
     * 设置 地图部件，详细说明：{@link #FIELD_PSSYSMAPVIEWID}
     * <P>
     * 等同 {@link #setPSSysMapViewId}
     * @param pSSysMapViewId
     */
    @JsonIgnore
    public PSSysMapItem pssysmapviewid(String pSSysMapViewId){
        this.setPSSysMapViewId(pSSysMapViewId);
        return this;
    }

    /**
     * 设置 地图部件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysMapViewId}
     * @param pSSysMapView 引用对象
     */
    @JsonIgnore
    public PSSysMapItem pssysmapviewid(PSSysMapView pSSysMapView){
        if(pSSysMapView == null){
            this.setPSSysMapViewId(null);
            this.setPSSysMapViewName(null);
        }
        else{
            this.setPSSysMapViewId(pSSysMapView.getPSSysMapViewId());
            this.setPSSysMapViewName(pSSysMapView.getPSSysMapViewName());
        }
        return this;
    }

    /**
     * <B>PSSYSMAPVIEWNAME</B>&nbsp;地图部件，指定地图部件项所在的地图部件对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSMAPVIEWID}
     */
    public final static String FIELD_PSSYSMAPVIEWNAME = "pssysmapviewname";

    /**
     * 设置 地图部件，详细说明：{@link #FIELD_PSSYSMAPVIEWNAME}
     * 
     * @param pSSysMapViewName
     * 
     */
    @JsonProperty(FIELD_PSSYSMAPVIEWNAME)
    public void setPSSysMapViewName(String pSSysMapViewName){
        this.set(FIELD_PSSYSMAPVIEWNAME, pSSysMapViewName);
    }
    
    /**
     * 获取 地图部件  
     * @return
     */
    @JsonIgnore
    public String getPSSysMapViewName(){
        Object objValue = this.get(FIELD_PSSYSMAPVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 地图部件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysMapViewNameDirty(){
        if(this.contains(FIELD_PSSYSMAPVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 地图部件
     */
    @JsonIgnore
    public void resetPSSysMapViewName(){
        this.reset(FIELD_PSSYSMAPVIEWNAME);
    }

    /**
     * 设置 地图部件，详细说明：{@link #FIELD_PSSYSMAPVIEWNAME}
     * <P>
     * 等同 {@link #setPSSysMapViewName}
     * @param pSSysMapViewName
     */
    @JsonIgnore
    public PSSysMapItem pssysmapviewname(String pSSysMapViewName){
        this.setPSSysMapViewName(pSSysMapViewName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端扩展插件，指定地图部件项使用的前端模板扩展插件，使用插件类型【地图部件项绘制插件】
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
    public PSSysMapItem pssyspfpluginid(String pSSysPFPluginId){
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
    public PSSysMapItem pssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
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
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端扩展插件，指定地图部件项使用的前端模板扩展插件，使用插件类型【地图部件项绘制插件】
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
    public PSSysMapItem pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    /**
     * <B>RADIUS</B>&nbsp;半径，指定地图部件项的半径，用于圆形样式使用，未定义时为【0】
     */
    public final static String FIELD_RADIUS = "radius";

    /**
     * 设置 半径，详细说明：{@link #FIELD_RADIUS}
     * 
     * @param radius
     * 
     */
    @JsonProperty(FIELD_RADIUS)
    public void setRadius(Integer radius){
        this.set(FIELD_RADIUS, radius);
    }
    
    /**
     * 获取 半径  
     * @return
     */
    @JsonIgnore
    public Integer getRadius(){
        Object objValue = this.get(FIELD_RADIUS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
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
    public PSSysMapItem radius(Integer radius){
        this.setRadius(radius);
        return this;
    }

    /**
     * <B>REMOVEPSDEACTIONID</B>&nbsp;删除实体行为，指定地图部件项的删除数据实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_REMOVEPSDEACTIONID = "removepsdeactionid";

    /**
     * 设置 删除实体行为，详细说明：{@link #FIELD_REMOVEPSDEACTIONID}
     * 
     * @param removePSDEActionId
     * 
     */
    @JsonProperty(FIELD_REMOVEPSDEACTIONID)
    public void setRemovePSDEActionId(String removePSDEActionId){
        this.set(FIELD_REMOVEPSDEACTIONID, removePSDEActionId);
    }
    
    /**
     * 获取 删除实体行为  
     * @return
     */
    @JsonIgnore
    public String getRemovePSDEActionId(){
        Object objValue = this.get(FIELD_REMOVEPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 删除实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRemovePSDEActionIdDirty(){
        if(this.contains(FIELD_REMOVEPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 删除实体行为
     */
    @JsonIgnore
    public void resetRemovePSDEActionId(){
        this.reset(FIELD_REMOVEPSDEACTIONID);
    }

    /**
     * 设置 删除实体行为，详细说明：{@link #FIELD_REMOVEPSDEACTIONID}
     * <P>
     * 等同 {@link #setRemovePSDEActionId}
     * @param removePSDEActionId
     */
    @JsonIgnore
    public PSSysMapItem removepsdeactionid(String removePSDEActionId){
        this.setRemovePSDEActionId(removePSDEActionId);
        return this;
    }

    /**
     * 设置 删除实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRemovePSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSSysMapItem removepsdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setRemovePSDEActionId(null);
            this.setRemovePSDEActionName(null);
        }
        else{
            this.setRemovePSDEActionId(pSDEAction.getPSDEActionId());
            this.setRemovePSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>REMOVEPSDEACTIONNAME</B>&nbsp;删除实体行为，指定地图部件项的删除数据实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REMOVEPSDEACTIONID}
     */
    public final static String FIELD_REMOVEPSDEACTIONNAME = "removepsdeactionname";

    /**
     * 设置 删除实体行为，详细说明：{@link #FIELD_REMOVEPSDEACTIONNAME}
     * 
     * @param removePSDEActionName
     * 
     */
    @JsonProperty(FIELD_REMOVEPSDEACTIONNAME)
    public void setRemovePSDEActionName(String removePSDEActionName){
        this.set(FIELD_REMOVEPSDEACTIONNAME, removePSDEActionName);
    }
    
    /**
     * 获取 删除实体行为  
     * @return
     */
    @JsonIgnore
    public String getRemovePSDEActionName(){
        Object objValue = this.get(FIELD_REMOVEPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 删除实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRemovePSDEActionNameDirty(){
        if(this.contains(FIELD_REMOVEPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 删除实体行为
     */
    @JsonIgnore
    public void resetRemovePSDEActionName(){
        this.reset(FIELD_REMOVEPSDEACTIONNAME);
    }

    /**
     * 设置 删除实体行为，详细说明：{@link #FIELD_REMOVEPSDEACTIONNAME}
     * <P>
     * 等同 {@link #setRemovePSDEActionName}
     * @param removePSDEActionName
     */
    @JsonIgnore
    public PSSysMapItem removepsdeactionname(String removePSDEActionName){
        this.setRemovePSDEActionName(removePSDEActionName);
        return this;
    }

    /**
     * <B>REMOVEPSDEOPPRIVID</B>&nbsp;删除实体操作标识，指定地图部件项的删除数据需要具备的操作标识
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEOPPriv} 
     */
    public final static String FIELD_REMOVEPSDEOPPRIVID = "removepsdeopprivid";

    /**
     * 设置 删除实体操作标识，详细说明：{@link #FIELD_REMOVEPSDEOPPRIVID}
     * 
     * @param removePSDEOPPrivId
     * 
     */
    @JsonProperty(FIELD_REMOVEPSDEOPPRIVID)
    public void setRemovePSDEOPPrivId(String removePSDEOPPrivId){
        this.set(FIELD_REMOVEPSDEOPPRIVID, removePSDEOPPrivId);
    }
    
    /**
     * 获取 删除实体操作标识  
     * @return
     */
    @JsonIgnore
    public String getRemovePSDEOPPrivId(){
        Object objValue = this.get(FIELD_REMOVEPSDEOPPRIVID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 删除实体操作标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRemovePSDEOPPrivIdDirty(){
        if(this.contains(FIELD_REMOVEPSDEOPPRIVID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 删除实体操作标识
     */
    @JsonIgnore
    public void resetRemovePSDEOPPrivId(){
        this.reset(FIELD_REMOVEPSDEOPPRIVID);
    }

    /**
     * 设置 删除实体操作标识，详细说明：{@link #FIELD_REMOVEPSDEOPPRIVID}
     * <P>
     * 等同 {@link #setRemovePSDEOPPrivId}
     * @param removePSDEOPPrivId
     */
    @JsonIgnore
    public PSSysMapItem removepsdeopprivid(String removePSDEOPPrivId){
        this.setRemovePSDEOPPrivId(removePSDEOPPrivId);
        return this;
    }

    /**
     * 设置 删除实体操作标识，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRemovePSDEOPPrivId}
     * @param pSDEOPPriv 引用对象
     */
    @JsonIgnore
    public PSSysMapItem removepsdeopprivid(PSDEOPPriv pSDEOPPriv){
        if(pSDEOPPriv == null){
            this.setRemovePSDEOPPrivId(null);
            this.setRemovePSDEOPPrivName(null);
        }
        else{
            this.setRemovePSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setRemovePSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    /**
     * <B>REMOVEPSDEOPPRIVNAME</B>&nbsp;删除实体操作标识，指定地图部件项的删除数据需要具备的操作标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REMOVEPSDEOPPRIVID}
     */
    public final static String FIELD_REMOVEPSDEOPPRIVNAME = "removepsdeopprivname";

    /**
     * 设置 删除实体操作标识，详细说明：{@link #FIELD_REMOVEPSDEOPPRIVNAME}
     * 
     * @param removePSDEOPPrivName
     * 
     */
    @JsonProperty(FIELD_REMOVEPSDEOPPRIVNAME)
    public void setRemovePSDEOPPrivName(String removePSDEOPPrivName){
        this.set(FIELD_REMOVEPSDEOPPRIVNAME, removePSDEOPPrivName);
    }
    
    /**
     * 获取 删除实体操作标识  
     * @return
     */
    @JsonIgnore
    public String getRemovePSDEOPPrivName(){
        Object objValue = this.get(FIELD_REMOVEPSDEOPPRIVNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 删除实体操作标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRemovePSDEOPPrivNameDirty(){
        if(this.contains(FIELD_REMOVEPSDEOPPRIVNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 删除实体操作标识
     */
    @JsonIgnore
    public void resetRemovePSDEOPPrivName(){
        this.reset(FIELD_REMOVEPSDEOPPRIVNAME);
    }

    /**
     * 设置 删除实体操作标识，详细说明：{@link #FIELD_REMOVEPSDEOPPRIVNAME}
     * <P>
     * 等同 {@link #setRemovePSDEOPPrivName}
     * @param removePSDEOPPrivName
     */
    @JsonIgnore
    public PSSysMapItem removepsdeopprivname(String removePSDEOPPrivName){
        this.setRemovePSDEOPPrivName(removePSDEOPPrivName);
        return this;
    }

    /**
     * <B>SHAPECLSPSDEFID</B>&nbsp;图形样式表属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_SHAPECLSPSDEFID = "shapeclspsdefid";

    /**
     * 设置 图形样式表属性
     * 
     * @param shapeClsPSDEFId
     * 
     */
    @JsonProperty(FIELD_SHAPECLSPSDEFID)
    public void setShapeClsPSDEFId(String shapeClsPSDEFId){
        this.set(FIELD_SHAPECLSPSDEFID, shapeClsPSDEFId);
    }
    
    /**
     * 获取 图形样式表属性  
     * @return
     */
    @JsonIgnore
    public String getShapeClsPSDEFId(){
        Object objValue = this.get(FIELD_SHAPECLSPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 图形样式表属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isShapeClsPSDEFIdDirty(){
        if(this.contains(FIELD_SHAPECLSPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图形样式表属性
     */
    @JsonIgnore
    public void resetShapeClsPSDEFId(){
        this.reset(FIELD_SHAPECLSPSDEFID);
    }

    /**
     * 设置 图形样式表属性
     * <P>
     * 等同 {@link #setShapeClsPSDEFId}
     * @param shapeClsPSDEFId
     */
    @JsonIgnore
    public PSSysMapItem shapeclspsdefid(String shapeClsPSDEFId){
        this.setShapeClsPSDEFId(shapeClsPSDEFId);
        return this;
    }

    /**
     * 设置 图形样式表属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setShapeClsPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMapItem shapeclspsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setShapeClsPSDEFId(null);
            this.setShapeClsPSDEFName(null);
        }
        else{
            this.setShapeClsPSDEFId(pSDEField.getPSDEFieldId());
            this.setShapeClsPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>SHAPECLSPSDEFNAME</B>&nbsp;图形样式表属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_SHAPECLSPSDEFID}
     */
    public final static String FIELD_SHAPECLSPSDEFNAME = "shapeclspsdefname";

    /**
     * 设置 图形样式表属性
     * 
     * @param shapeClsPSDEFName
     * 
     */
    @JsonProperty(FIELD_SHAPECLSPSDEFNAME)
    public void setShapeClsPSDEFName(String shapeClsPSDEFName){
        this.set(FIELD_SHAPECLSPSDEFNAME, shapeClsPSDEFName);
    }
    
    /**
     * 获取 图形样式表属性  
     * @return
     */
    @JsonIgnore
    public String getShapeClsPSDEFName(){
        Object objValue = this.get(FIELD_SHAPECLSPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 图形样式表属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isShapeClsPSDEFNameDirty(){
        if(this.contains(FIELD_SHAPECLSPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图形样式表属性
     */
    @JsonIgnore
    public void resetShapeClsPSDEFName(){
        this.reset(FIELD_SHAPECLSPSDEFNAME);
    }

    /**
     * 设置 图形样式表属性
     * <P>
     * 等同 {@link #setShapeClsPSDEFName}
     * @param shapeClsPSDEFName
     */
    @JsonIgnore
    public PSSysMapItem shapeclspsdefname(String shapeClsPSDEFName){
        this.setShapeClsPSDEFName(shapeClsPSDEFName);
        return this;
    }

    /**
     * <B>SHAPEDYNACLASS</B>&nbsp;图形动态样式表
     */
    public final static String FIELD_SHAPEDYNACLASS = "shapedynaclass";

    /**
     * 设置 图形动态样式表
     * 
     * @param shapeDynaClass
     * 
     */
    @JsonProperty(FIELD_SHAPEDYNACLASS)
    public void setShapeDynaClass(String shapeDynaClass){
        this.set(FIELD_SHAPEDYNACLASS, shapeDynaClass);
    }
    
    /**
     * 获取 图形动态样式表  
     * @return
     */
    @JsonIgnore
    public String getShapeDynaClass(){
        Object objValue = this.get(FIELD_SHAPEDYNACLASS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 图形动态样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isShapeDynaClassDirty(){
        if(this.contains(FIELD_SHAPEDYNACLASS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图形动态样式表
     */
    @JsonIgnore
    public void resetShapeDynaClass(){
        this.reset(FIELD_SHAPEDYNACLASS);
    }

    /**
     * 设置 图形动态样式表
     * <P>
     * 等同 {@link #setShapeDynaClass}
     * @param shapeDynaClass
     */
    @JsonIgnore
    public PSSysMapItem shapedynaclass(String shapeDynaClass){
        this.setShapeDynaClass(shapeDynaClass);
        return this;
    }

    /**
     * <B>SHAPEPSSYSCSSID</B>&nbsp;图形系统界面样式
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCss} 
     */
    public final static String FIELD_SHAPEPSSYSCSSID = "shapepssyscssid";

    /**
     * 设置 图形系统界面样式
     * 
     * @param shapePSSysCssId
     * 
     */
    @JsonProperty(FIELD_SHAPEPSSYSCSSID)
    public void setShapePSSysCssId(String shapePSSysCssId){
        this.set(FIELD_SHAPEPSSYSCSSID, shapePSSysCssId);
    }
    
    /**
     * 获取 图形系统界面样式  
     * @return
     */
    @JsonIgnore
    public String getShapePSSysCssId(){
        Object objValue = this.get(FIELD_SHAPEPSSYSCSSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 图形系统界面样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isShapePSSysCssIdDirty(){
        if(this.contains(FIELD_SHAPEPSSYSCSSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图形系统界面样式
     */
    @JsonIgnore
    public void resetShapePSSysCssId(){
        this.reset(FIELD_SHAPEPSSYSCSSID);
    }

    /**
     * 设置 图形系统界面样式
     * <P>
     * 等同 {@link #setShapePSSysCssId}
     * @param shapePSSysCssId
     */
    @JsonIgnore
    public PSSysMapItem shapepssyscssid(String shapePSSysCssId){
        this.setShapePSSysCssId(shapePSSysCssId);
        return this;
    }

    /**
     * 设置 图形系统界面样式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setShapePSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSSysMapItem shapepssyscssid(PSSysCss pSSysCss){
        if(pSSysCss == null){
            this.setShapePSSysCssId(null);
            this.setShapePSSysCssName(null);
        }
        else{
            this.setShapePSSysCssId(pSSysCss.getPSSysCssId());
            this.setShapePSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    /**
     * <B>SHAPEPSSYSCSSNAME</B>&nbsp;图形系统界面样式
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_SHAPEPSSYSCSSID}
     */
    public final static String FIELD_SHAPEPSSYSCSSNAME = "shapepssyscssname";

    /**
     * 设置 图形系统界面样式
     * 
     * @param shapePSSysCssName
     * 
     */
    @JsonProperty(FIELD_SHAPEPSSYSCSSNAME)
    public void setShapePSSysCssName(String shapePSSysCssName){
        this.set(FIELD_SHAPEPSSYSCSSNAME, shapePSSysCssName);
    }
    
    /**
     * 获取 图形系统界面样式  
     * @return
     */
    @JsonIgnore
    public String getShapePSSysCssName(){
        Object objValue = this.get(FIELD_SHAPEPSSYSCSSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 图形系统界面样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isShapePSSysCssNameDirty(){
        if(this.contains(FIELD_SHAPEPSSYSCSSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图形系统界面样式
     */
    @JsonIgnore
    public void resetShapePSSysCssName(){
        this.reset(FIELD_SHAPEPSSYSCSSNAME);
    }

    /**
     * 设置 图形系统界面样式
     * <P>
     * 等同 {@link #setShapePSSysCssName}
     * @param shapePSSysCssName
     */
    @JsonIgnore
    public PSSysMapItem shapepssyscssname(String shapePSSysCssName){
        this.setShapePSSysCssName(shapePSSysCssName);
        return this;
    }

    /**
     * <B>TAG2PSDEFID</B>&nbsp;标记属性2，指定地图部件项的标记2存储属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_TAG2PSDEFID = "tag2psdefid";

    /**
     * 设置 标记属性2，详细说明：{@link #FIELD_TAG2PSDEFID}
     * 
     * @param tag2PSDEFId
     * 
     */
    @JsonProperty(FIELD_TAG2PSDEFID)
    public void setTag2PSDEFId(String tag2PSDEFId){
        this.set(FIELD_TAG2PSDEFID, tag2PSDEFId);
    }
    
    /**
     * 获取 标记属性2  
     * @return
     */
    @JsonIgnore
    public String getTag2PSDEFId(){
        Object objValue = this.get(FIELD_TAG2PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标记属性2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTag2PSDEFIdDirty(){
        if(this.contains(FIELD_TAG2PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标记属性2
     */
    @JsonIgnore
    public void resetTag2PSDEFId(){
        this.reset(FIELD_TAG2PSDEFID);
    }

    /**
     * 设置 标记属性2，详细说明：{@link #FIELD_TAG2PSDEFID}
     * <P>
     * 等同 {@link #setTag2PSDEFId}
     * @param tag2PSDEFId
     */
    @JsonIgnore
    public PSSysMapItem tag2psdefid(String tag2PSDEFId){
        this.setTag2PSDEFId(tag2PSDEFId);
        return this;
    }

    /**
     * 设置 标记属性2，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTag2PSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMapItem tag2psdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setTag2PSDEFId(null);
            this.setTag2PSDEFName(null);
        }
        else{
            this.setTag2PSDEFId(pSDEField.getPSDEFieldId());
            this.setTag2PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>TAG2PSDEFNAME</B>&nbsp;标记属性2，指定地图部件项的标记2存储属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TAG2PSDEFID}
     */
    public final static String FIELD_TAG2PSDEFNAME = "tag2psdefname";

    /**
     * 设置 标记属性2，详细说明：{@link #FIELD_TAG2PSDEFNAME}
     * 
     * @param tag2PSDEFName
     * 
     */
    @JsonProperty(FIELD_TAG2PSDEFNAME)
    public void setTag2PSDEFName(String tag2PSDEFName){
        this.set(FIELD_TAG2PSDEFNAME, tag2PSDEFName);
    }
    
    /**
     * 获取 标记属性2  
     * @return
     */
    @JsonIgnore
    public String getTag2PSDEFName(){
        Object objValue = this.get(FIELD_TAG2PSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标记属性2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTag2PSDEFNameDirty(){
        if(this.contains(FIELD_TAG2PSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标记属性2
     */
    @JsonIgnore
    public void resetTag2PSDEFName(){
        this.reset(FIELD_TAG2PSDEFNAME);
    }

    /**
     * 设置 标记属性2，详细说明：{@link #FIELD_TAG2PSDEFNAME}
     * <P>
     * 等同 {@link #setTag2PSDEFName}
     * @param tag2PSDEFName
     */
    @JsonIgnore
    public PSSysMapItem tag2psdefname(String tag2PSDEFName){
        this.setTag2PSDEFName(tag2PSDEFName);
        return this;
    }

    /**
     * <B>TAGPSDEFID</B>&nbsp;标记属性，指定地图部件项的标记存储属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_TAGPSDEFID = "tagpsdefid";

    /**
     * 设置 标记属性，详细说明：{@link #FIELD_TAGPSDEFID}
     * 
     * @param tagPSDEFId
     * 
     */
    @JsonProperty(FIELD_TAGPSDEFID)
    public void setTagPSDEFId(String tagPSDEFId){
        this.set(FIELD_TAGPSDEFID, tagPSDEFId);
    }
    
    /**
     * 获取 标记属性  
     * @return
     */
    @JsonIgnore
    public String getTagPSDEFId(){
        Object objValue = this.get(FIELD_TAGPSDEFID);
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
    public boolean isTagPSDEFIdDirty(){
        if(this.contains(FIELD_TAGPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标记属性
     */
    @JsonIgnore
    public void resetTagPSDEFId(){
        this.reset(FIELD_TAGPSDEFID);
    }

    /**
     * 设置 标记属性，详细说明：{@link #FIELD_TAGPSDEFID}
     * <P>
     * 等同 {@link #setTagPSDEFId}
     * @param tagPSDEFId
     */
    @JsonIgnore
    public PSSysMapItem tagpsdefid(String tagPSDEFId){
        this.setTagPSDEFId(tagPSDEFId);
        return this;
    }

    /**
     * 设置 标记属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTagPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMapItem tagpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setTagPSDEFId(null);
            this.setTagPSDEFName(null);
        }
        else{
            this.setTagPSDEFId(pSDEField.getPSDEFieldId());
            this.setTagPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>TAGPSDEFNAME</B>&nbsp;标记属性，指定地图部件项的标记存储属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TAGPSDEFID}
     */
    public final static String FIELD_TAGPSDEFNAME = "tagpsdefname";

    /**
     * 设置 标记属性，详细说明：{@link #FIELD_TAGPSDEFNAME}
     * 
     * @param tagPSDEFName
     * 
     */
    @JsonProperty(FIELD_TAGPSDEFNAME)
    public void setTagPSDEFName(String tagPSDEFName){
        this.set(FIELD_TAGPSDEFNAME, tagPSDEFName);
    }
    
    /**
     * 获取 标记属性  
     * @return
     */
    @JsonIgnore
    public String getTagPSDEFName(){
        Object objValue = this.get(FIELD_TAGPSDEFNAME);
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
    public boolean isTagPSDEFNameDirty(){
        if(this.contains(FIELD_TAGPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标记属性
     */
    @JsonIgnore
    public void resetTagPSDEFName(){
        this.reset(FIELD_TAGPSDEFNAME);
    }

    /**
     * 设置 标记属性，详细说明：{@link #FIELD_TAGPSDEFNAME}
     * <P>
     * 等同 {@link #setTagPSDEFName}
     * @param tagPSDEFName
     */
    @JsonIgnore
    public PSSysMapItem tagpsdefname(String tagPSDEFName){
        this.setTagPSDEFName(tagPSDEFName);
        return this;
    }

    /**
     * <B>TEXTPSDEFID</B>&nbsp;文本属性，指定地图部件项的文本存储属性，未定义时使用实体主信息属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_TEXTPSDEFID = "textpsdefid";

    /**
     * 设置 文本属性，详细说明：{@link #FIELD_TEXTPSDEFID}
     * 
     * @param textPSDEFId
     * 
     */
    @JsonProperty(FIELD_TEXTPSDEFID)
    public void setTextPSDEFId(String textPSDEFId){
        this.set(FIELD_TEXTPSDEFID, textPSDEFId);
    }
    
    /**
     * 获取 文本属性  
     * @return
     */
    @JsonIgnore
    public String getTextPSDEFId(){
        Object objValue = this.get(FIELD_TEXTPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 文本属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTextPSDEFIdDirty(){
        if(this.contains(FIELD_TEXTPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 文本属性
     */
    @JsonIgnore
    public void resetTextPSDEFId(){
        this.reset(FIELD_TEXTPSDEFID);
    }

    /**
     * 设置 文本属性，详细说明：{@link #FIELD_TEXTPSDEFID}
     * <P>
     * 等同 {@link #setTextPSDEFId}
     * @param textPSDEFId
     */
    @JsonIgnore
    public PSSysMapItem textpsdefid(String textPSDEFId){
        this.setTextPSDEFId(textPSDEFId);
        return this;
    }

    /**
     * 设置 文本属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTextPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMapItem textpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setTextPSDEFId(null);
            this.setTextPSDEFName(null);
        }
        else{
            this.setTextPSDEFId(pSDEField.getPSDEFieldId());
            this.setTextPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>TEXTPSDEFNAME</B>&nbsp;文本属性，指定地图部件项的文本存储属性，未定义时使用实体主信息属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TEXTPSDEFID}
     */
    public final static String FIELD_TEXTPSDEFNAME = "textpsdefname";

    /**
     * 设置 文本属性，详细说明：{@link #FIELD_TEXTPSDEFNAME}
     * 
     * @param textPSDEFName
     * 
     */
    @JsonProperty(FIELD_TEXTPSDEFNAME)
    public void setTextPSDEFName(String textPSDEFName){
        this.set(FIELD_TEXTPSDEFNAME, textPSDEFName);
    }
    
    /**
     * 获取 文本属性  
     * @return
     */
    @JsonIgnore
    public String getTextPSDEFName(){
        Object objValue = this.get(FIELD_TEXTPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 文本属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTextPSDEFNameDirty(){
        if(this.contains(FIELD_TEXTPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 文本属性
     */
    @JsonIgnore
    public void resetTextPSDEFName(){
        this.reset(FIELD_TEXTPSDEFNAME);
    }

    /**
     * 设置 文本属性，详细说明：{@link #FIELD_TEXTPSDEFNAME}
     * <P>
     * 等同 {@link #setTextPSDEFName}
     * @param textPSDEFName
     */
    @JsonIgnore
    public PSSysMapItem textpsdefname(String textPSDEFName){
        this.setTextPSDEFName(textPSDEFName);
        return this;
    }

    /**
     * <B>TIMEPSDEFID</B>&nbsp;时间属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_TIMEPSDEFID = "timepsdefid";

    /**
     * 设置 时间属性
     * 
     * @param timePSDEFId
     * 
     */
    @JsonProperty(FIELD_TIMEPSDEFID)
    public void setTimePSDEFId(String timePSDEFId){
        this.set(FIELD_TIMEPSDEFID, timePSDEFId);
    }
    
    /**
     * 获取 时间属性  
     * @return
     */
    @JsonIgnore
    public String getTimePSDEFId(){
        Object objValue = this.get(FIELD_TIMEPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 时间属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTimePSDEFIdDirty(){
        if(this.contains(FIELD_TIMEPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 时间属性
     */
    @JsonIgnore
    public void resetTimePSDEFId(){
        this.reset(FIELD_TIMEPSDEFID);
    }

    /**
     * 设置 时间属性
     * <P>
     * 等同 {@link #setTimePSDEFId}
     * @param timePSDEFId
     */
    @JsonIgnore
    public PSSysMapItem timepsdefid(String timePSDEFId){
        this.setTimePSDEFId(timePSDEFId);
        return this;
    }

    /**
     * 设置 时间属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTimePSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMapItem timepsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setTimePSDEFId(null);
            this.setTimePSDEFName(null);
        }
        else{
            this.setTimePSDEFId(pSDEField.getPSDEFieldId());
            this.setTimePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>TIMEPSDEFNAME</B>&nbsp;时间属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TIMEPSDEFID}
     */
    public final static String FIELD_TIMEPSDEFNAME = "timepsdefname";

    /**
     * 设置 时间属性
     * 
     * @param timePSDEFName
     * 
     */
    @JsonProperty(FIELD_TIMEPSDEFNAME)
    public void setTimePSDEFName(String timePSDEFName){
        this.set(FIELD_TIMEPSDEFNAME, timePSDEFName);
    }
    
    /**
     * 获取 时间属性  
     * @return
     */
    @JsonIgnore
    public String getTimePSDEFName(){
        Object objValue = this.get(FIELD_TIMEPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 时间属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTimePSDEFNameDirty(){
        if(this.contains(FIELD_TIMEPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 时间属性
     */
    @JsonIgnore
    public void resetTimePSDEFName(){
        this.reset(FIELD_TIMEPSDEFNAME);
    }

    /**
     * 设置 时间属性
     * <P>
     * 等同 {@link #setTimePSDEFName}
     * @param timePSDEFName
     */
    @JsonIgnore
    public PSSysMapItem timepsdefname(String timePSDEFName){
        this.setTimePSDEFName(timePSDEFName);
        return this;
    }

    /**
     * <B>TIPSPSDEFID</B>&nbsp;提示属性，指定地图部件项的提示信息存储属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_TIPSPSDEFID = "tipspsdefid";

    /**
     * 设置 提示属性，详细说明：{@link #FIELD_TIPSPSDEFID}
     * 
     * @param tipsPSDEFId
     * 
     */
    @JsonProperty(FIELD_TIPSPSDEFID)
    public void setTipsPSDEFId(String tipsPSDEFId){
        this.set(FIELD_TIPSPSDEFID, tipsPSDEFId);
    }
    
    /**
     * 获取 提示属性  
     * @return
     */
    @JsonIgnore
    public String getTipsPSDEFId(){
        Object objValue = this.get(FIELD_TIPSPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 提示属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTipsPSDEFIdDirty(){
        if(this.contains(FIELD_TIPSPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 提示属性
     */
    @JsonIgnore
    public void resetTipsPSDEFId(){
        this.reset(FIELD_TIPSPSDEFID);
    }

    /**
     * 设置 提示属性，详细说明：{@link #FIELD_TIPSPSDEFID}
     * <P>
     * 等同 {@link #setTipsPSDEFId}
     * @param tipsPSDEFId
     */
    @JsonIgnore
    public PSSysMapItem tipspsdefid(String tipsPSDEFId){
        this.setTipsPSDEFId(tipsPSDEFId);
        return this;
    }

    /**
     * 设置 提示属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTipsPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMapItem tipspsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setTipsPSDEFId(null);
            this.setTipsPSDEFName(null);
        }
        else{
            this.setTipsPSDEFId(pSDEField.getPSDEFieldId());
            this.setTipsPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>TIPSPSDEFNAME</B>&nbsp;提示属性，指定地图部件项的提示信息存储属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TIPSPSDEFID}
     */
    public final static String FIELD_TIPSPSDEFNAME = "tipspsdefname";

    /**
     * 设置 提示属性，详细说明：{@link #FIELD_TIPSPSDEFNAME}
     * 
     * @param tipsPSDEFName
     * 
     */
    @JsonProperty(FIELD_TIPSPSDEFNAME)
    public void setTipsPSDEFName(String tipsPSDEFName){
        this.set(FIELD_TIPSPSDEFNAME, tipsPSDEFName);
    }
    
    /**
     * 获取 提示属性  
     * @return
     */
    @JsonIgnore
    public String getTipsPSDEFName(){
        Object objValue = this.get(FIELD_TIPSPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 提示属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTipsPSDEFNameDirty(){
        if(this.contains(FIELD_TIPSPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 提示属性
     */
    @JsonIgnore
    public void resetTipsPSDEFName(){
        this.reset(FIELD_TIPSPSDEFNAME);
    }

    /**
     * 设置 提示属性，详细说明：{@link #FIELD_TIPSPSDEFNAME}
     * <P>
     * 等同 {@link #setTipsPSDEFName}
     * @param tipsPSDEFName
     */
    @JsonIgnore
    public PSSysMapItem tipspsdefname(String tipsPSDEFName){
        this.setTipsPSDEFName(tipsPSDEFName);
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
    public PSSysMapItem updatedate(String updateDate){
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
    public PSSysMapItem updateman(String updateMan){
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
    public PSSysMapItem usercat(String userCat){
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
    public PSSysMapItem usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysMapItem usertag(String userTag){
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
    public PSSysMapItem usertag2(String userTag2){
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
    public PSSysMapItem usertag3(String userTag3){
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
    public PSSysMapItem usertag4(String userTag4){
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
    public PSSysMapItem validflag(Integer validFlag){
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
    public PSSysMapItem validflag(Boolean validFlag){
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
        return this.getPSSysMapItemId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysMapItemId(strValue);
    }

    @JsonIgnore
    public PSSysMapItem id(String strValue){
        this.setPSSysMapItemId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysMapItem){
            PSSysMapItem model = (PSSysMapItem)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
