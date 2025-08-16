package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSCALENDARITEM</B>系统日历视图项 模型传输对象
 * <P>
 * 日历部件项模型，定义日历部件的子项数据源，包括子项的界面表现及处理逻辑
 */
public class PSSysCalendarItemDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysCalendarItemDTO(){
    }      

    /**
     * <B>BEGINPSDEFID</B>&nbsp;开始时间属性，指定日历项的开始时间存储属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_BEGINPSDEFID = "beginpsdefid";

    /**
     * 设置 开始时间属性，详细说明：{@link #FIELD_BEGINPSDEFID}
     * 
     * @param beginPSDEFId
     * 
     */
    @JsonProperty(FIELD_BEGINPSDEFID)
    public void setBeginPSDEFId(String beginPSDEFId){
        this.set(FIELD_BEGINPSDEFID, beginPSDEFId);
    }
    
    /**
     * 获取 开始时间属性  
     * @return
     */
    @JsonIgnore
    public String getBeginPSDEFId(){
        Object objValue = this.get(FIELD_BEGINPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开始时间属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBeginPSDEFIdDirty(){
        if(this.contains(FIELD_BEGINPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开始时间属性
     */
    @JsonIgnore
    public void resetBeginPSDEFId(){
        this.reset(FIELD_BEGINPSDEFID);
    }

    /**
     * 设置 开始时间属性，详细说明：{@link #FIELD_BEGINPSDEFID}
     * <P>
     * 等同 {@link #setBeginPSDEFId}
     * @param beginPSDEFId
     */
    @JsonIgnore
    public PSSysCalendarItemDTO beginpsdefid(String beginPSDEFId){
        this.setBeginPSDEFId(beginPSDEFId);
        return this;
    }

    /**
     * 设置 开始时间属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setBeginPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysCalendarItemDTO beginpsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setBeginPSDEFId(null);
            this.setBeginPSDEFName(null);
        }
        else{
            this.setBeginPSDEFId(pSDEField.getPSDEFieldId());
            this.setBeginPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>BEGINPSDEFNAME</B>&nbsp;开始时间属性，指定日历项的开始时间存储属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_BEGINPSDEFID}
     */
    public final static String FIELD_BEGINPSDEFNAME = "beginpsdefname";

    /**
     * 设置 开始时间属性，详细说明：{@link #FIELD_BEGINPSDEFNAME}
     * 
     * @param beginPSDEFName
     * 
     */
    @JsonProperty(FIELD_BEGINPSDEFNAME)
    public void setBeginPSDEFName(String beginPSDEFName){
        this.set(FIELD_BEGINPSDEFNAME, beginPSDEFName);
    }
    
    /**
     * 获取 开始时间属性  
     * @return
     */
    @JsonIgnore
    public String getBeginPSDEFName(){
        Object objValue = this.get(FIELD_BEGINPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开始时间属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBeginPSDEFNameDirty(){
        if(this.contains(FIELD_BEGINPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开始时间属性
     */
    @JsonIgnore
    public void resetBeginPSDEFName(){
        this.reset(FIELD_BEGINPSDEFNAME);
    }

    /**
     * 设置 开始时间属性，详细说明：{@link #FIELD_BEGINPSDEFNAME}
     * <P>
     * 等同 {@link #setBeginPSDEFName}
     * @param beginPSDEFName
     */
    @JsonIgnore
    public PSSysCalendarItemDTO beginpsdefname(String beginPSDEFName){
        this.setBeginPSDEFName(beginPSDEFName);
        return this;
    }

    /**
     * <B>BKCOLOR</B>&nbsp;背景颜色，指定日历项的默认背景颜色
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
    public PSSysCalendarItemDTO bkcolor(String bKColor){
        this.setBKColor(bKColor);
        return this;
    }

    /**
     * <B>BKCOLORPSDEFID</B>&nbsp;背景颜色属性，指定日历项的背景颜色存储属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
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
    public PSSysCalendarItemDTO bkcolorpsdefid(String bKColorPSDEFId){
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
    public PSSysCalendarItemDTO bkcolorpsdefid(PSDEFieldDTO pSDEField){
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
     * <B>BKCOLORPSDEFNAME</B>&nbsp;背景颜色属性，指定日历项的背景颜色存储属性
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
    public PSSysCalendarItemDTO bkcolorpsdefname(String bKColorPSDEFName){
        this.setBKColorPSDEFName(bKColorPSDEFName);
        return this;
    }

    /**
     * <B>CLSPSDEFID</B>&nbsp;样式表属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
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
    public PSSysCalendarItemDTO clspsdefid(String clsPSDEFId){
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
    public PSSysCalendarItemDTO clspsdefid(PSDEFieldDTO pSDEField){
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
    public PSSysCalendarItemDTO clspsdefname(String clsPSDEFName){
        this.setClsPSDEFName(clsPSDEFName);
        return this;
    }

    /**
     * <B>COLOR</B>&nbsp;字体颜色，指定日历项的默认字体颜色
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
    public PSSysCalendarItemDTO color(String color){
        this.setColor(color);
        return this;
    }

    /**
     * <B>COLORPSDEFID</B>&nbsp;字体颜色属性，指定日历项的字体颜色存储属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
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
    public PSSysCalendarItemDTO colorpsdefid(String colorPSDEFId){
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
    public PSSysCalendarItemDTO colorpsdefid(PSDEFieldDTO pSDEField){
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
     * <B>COLORPSDEFNAME</B>&nbsp;字体颜色属性，指定日历项的字体颜色存储属性
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
    public PSSysCalendarItemDTO colorpsdefname(String colorPSDEFName){
        this.setColorPSDEFName(colorPSDEFName);
        return this;
    }

    /**
     * <B>CONTENTPSDEFID</B>&nbsp;内容属性，指定日历项的内容存储属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
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
    public PSSysCalendarItemDTO contentpsdefid(String contentPSDEFId){
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
    public PSSysCalendarItemDTO contentpsdefid(PSDEFieldDTO pSDEField){
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
     * <B>CONTENTPSDEFNAME</B>&nbsp;内容属性，指定日历项的内容存储属性
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
    public PSSysCalendarItemDTO contentpsdefname(String contentPSDEFName){
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
    public PSSysCalendarItemDTO createdate(Timestamp createDate){
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
    public PSSysCalendarItemDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CREATEPSDEACTIONID</B>&nbsp;建立实体行为，指定日历项的建立数据实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEActionDTO} 
     */
    public final static String FIELD_CREATEPSDEACTIONID = "createpsdeactionid";

    /**
     * 设置 建立实体行为，详细说明：{@link #FIELD_CREATEPSDEACTIONID}
     * 
     * @param createPSDEActionId
     * 
     */
    @JsonProperty(FIELD_CREATEPSDEACTIONID)
    public void setCreatePSDEActionId(String createPSDEActionId){
        this.set(FIELD_CREATEPSDEACTIONID, createPSDEActionId);
    }
    
    /**
     * 获取 建立实体行为  
     * @return
     */
    @JsonIgnore
    public String getCreatePSDEActionId(){
        Object objValue = this.get(FIELD_CREATEPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 建立实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCreatePSDEActionIdDirty(){
        if(this.contains(FIELD_CREATEPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 建立实体行为
     */
    @JsonIgnore
    public void resetCreatePSDEActionId(){
        this.reset(FIELD_CREATEPSDEACTIONID);
    }

    /**
     * 设置 建立实体行为，详细说明：{@link #FIELD_CREATEPSDEACTIONID}
     * <P>
     * 等同 {@link #setCreatePSDEActionId}
     * @param createPSDEActionId
     */
    @JsonIgnore
    public PSSysCalendarItemDTO createpsdeactionid(String createPSDEActionId){
        this.setCreatePSDEActionId(createPSDEActionId);
        return this;
    }

    /**
     * 设置 建立实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setCreatePSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSSysCalendarItemDTO createpsdeactionid(PSDEActionDTO pSDEAction){
        if(pSDEAction == null){
            this.setCreatePSDEActionId(null);
            this.setCreatePSDEActionName(null);
        }
        else{
            this.setCreatePSDEActionId(pSDEAction.getPSDEActionId());
            this.setCreatePSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>CREATEPSDEACTIONNAME</B>&nbsp;建立实体行为，指定日历项的建立数据实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CREATEPSDEACTIONID}
     */
    public final static String FIELD_CREATEPSDEACTIONNAME = "createpsdeactionname";

    /**
     * 设置 建立实体行为，详细说明：{@link #FIELD_CREATEPSDEACTIONNAME}
     * 
     * @param createPSDEActionName
     * 
     */
    @JsonProperty(FIELD_CREATEPSDEACTIONNAME)
    public void setCreatePSDEActionName(String createPSDEActionName){
        this.set(FIELD_CREATEPSDEACTIONNAME, createPSDEActionName);
    }
    
    /**
     * 获取 建立实体行为  
     * @return
     */
    @JsonIgnore
    public String getCreatePSDEActionName(){
        Object objValue = this.get(FIELD_CREATEPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 建立实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCreatePSDEActionNameDirty(){
        if(this.contains(FIELD_CREATEPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 建立实体行为
     */
    @JsonIgnore
    public void resetCreatePSDEActionName(){
        this.reset(FIELD_CREATEPSDEACTIONNAME);
    }

    /**
     * 设置 建立实体行为，详细说明：{@link #FIELD_CREATEPSDEACTIONNAME}
     * <P>
     * 等同 {@link #setCreatePSDEActionName}
     * @param createPSDEActionName
     */
    @JsonIgnore
    public PSSysCalendarItemDTO createpsdeactionname(String createPSDEActionName){
        this.setCreatePSDEActionName(createPSDEActionName);
        return this;
    }

    /**
     * <B>CREATEPSDEOPPRIVID</B>&nbsp;建立实体操作标识，指定日历项的建立数据需要具备的操作标识
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEOPPrivDTO} 
     */
    public final static String FIELD_CREATEPSDEOPPRIVID = "createpsdeopprivid";

    /**
     * 设置 建立实体操作标识，详细说明：{@link #FIELD_CREATEPSDEOPPRIVID}
     * 
     * @param createPSDEOPPrivId
     * 
     */
    @JsonProperty(FIELD_CREATEPSDEOPPRIVID)
    public void setCreatePSDEOPPrivId(String createPSDEOPPrivId){
        this.set(FIELD_CREATEPSDEOPPRIVID, createPSDEOPPrivId);
    }
    
    /**
     * 获取 建立实体操作标识  
     * @return
     */
    @JsonIgnore
    public String getCreatePSDEOPPrivId(){
        Object objValue = this.get(FIELD_CREATEPSDEOPPRIVID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 建立实体操作标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCreatePSDEOPPrivIdDirty(){
        if(this.contains(FIELD_CREATEPSDEOPPRIVID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 建立实体操作标识
     */
    @JsonIgnore
    public void resetCreatePSDEOPPrivId(){
        this.reset(FIELD_CREATEPSDEOPPRIVID);
    }

    /**
     * 设置 建立实体操作标识，详细说明：{@link #FIELD_CREATEPSDEOPPRIVID}
     * <P>
     * 等同 {@link #setCreatePSDEOPPrivId}
     * @param createPSDEOPPrivId
     */
    @JsonIgnore
    public PSSysCalendarItemDTO createpsdeopprivid(String createPSDEOPPrivId){
        this.setCreatePSDEOPPrivId(createPSDEOPPrivId);
        return this;
    }

    /**
     * 设置 建立实体操作标识，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setCreatePSDEOPPrivId}
     * @param pSDEOPPriv 引用对象
     */
    @JsonIgnore
    public PSSysCalendarItemDTO createpsdeopprivid(PSDEOPPrivDTO pSDEOPPriv){
        if(pSDEOPPriv == null){
            this.setCreatePSDEOPPrivId(null);
            this.setCreatePSDEOPPrivName(null);
        }
        else{
            this.setCreatePSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setCreatePSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    /**
     * <B>CREATEPSDEOPPRIVNAME</B>&nbsp;建立实体操作标识，指定日历项的建立数据需要具备的操作标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CREATEPSDEOPPRIVID}
     */
    public final static String FIELD_CREATEPSDEOPPRIVNAME = "createpsdeopprivname";

    /**
     * 设置 建立实体操作标识，详细说明：{@link #FIELD_CREATEPSDEOPPRIVNAME}
     * 
     * @param createPSDEOPPrivName
     * 
     */
    @JsonProperty(FIELD_CREATEPSDEOPPRIVNAME)
    public void setCreatePSDEOPPrivName(String createPSDEOPPrivName){
        this.set(FIELD_CREATEPSDEOPPRIVNAME, createPSDEOPPrivName);
    }
    
    /**
     * 获取 建立实体操作标识  
     * @return
     */
    @JsonIgnore
    public String getCreatePSDEOPPrivName(){
        Object objValue = this.get(FIELD_CREATEPSDEOPPRIVNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 建立实体操作标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCreatePSDEOPPrivNameDirty(){
        if(this.contains(FIELD_CREATEPSDEOPPRIVNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 建立实体操作标识
     */
    @JsonIgnore
    public void resetCreatePSDEOPPrivName(){
        this.reset(FIELD_CREATEPSDEOPPRIVNAME);
    }

    /**
     * 设置 建立实体操作标识，详细说明：{@link #FIELD_CREATEPSDEOPPRIVNAME}
     * <P>
     * 等同 {@link #setCreatePSDEOPPrivName}
     * @param createPSDEOPPrivName
     */
    @JsonIgnore
    public PSSysCalendarItemDTO createpsdeopprivname(String createPSDEOPPrivName){
        this.setCreatePSDEOPPrivName(createPSDEOPPrivName);
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
    public PSSysCalendarItemDTO customcond(String customCond){
        this.setCustomCond(customCond);
        return this;
    }

    /**
     * <B>DATA2PSDEFID</B>&nbsp;数据2属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
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
    public PSSysCalendarItemDTO data2psdefid(String data2PSDEFId){
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
    public PSSysCalendarItemDTO data2psdefid(PSDEFieldDTO pSDEField){
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
    public PSSysCalendarItemDTO data2psdefname(String data2PSDEFName){
        this.setData2PSDEFName(data2PSDEFName);
        return this;
    }

    /**
     * <B>DATAPSDEFID</B>&nbsp;数据属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
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
    public PSSysCalendarItemDTO datapsdefid(String dataPSDEFId){
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
    public PSSysCalendarItemDTO datapsdefid(PSDEFieldDTO pSDEField){
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
    public PSSysCalendarItemDTO datapsdefname(String dataPSDEFName){
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
    public PSSysCalendarItemDTO dynaclass(String dynaClass){
        this.setDynaClass(dynaClass);
        return this;
    }

    /**
     * <B>EDITMODE</B>&nbsp;支持拖动编辑
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_EDITMODE = "editmode";

    /**
     * 设置 支持拖动编辑
     * 
     * @param editMode
     * 
     */
    @JsonProperty(FIELD_EDITMODE)
    public void setEditMode(Integer editMode){
        this.set(FIELD_EDITMODE, editMode);
    }
    
    /**
     * 获取 支持拖动编辑  
     * @return
     */
    @JsonIgnore
    public Integer getEditMode(){
        Object objValue = this.get(FIELD_EDITMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持拖动编辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEditModeDirty(){
        if(this.contains(FIELD_EDITMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持拖动编辑
     */
    @JsonIgnore
    public void resetEditMode(){
        this.reset(FIELD_EDITMODE);
    }

    /**
     * 设置 支持拖动编辑
     * <P>
     * 等同 {@link #setEditMode}
     * @param editMode
     */
    @JsonIgnore
    public PSSysCalendarItemDTO editmode(Integer editMode){
        this.setEditMode(editMode);
        return this;
    }

     /**
     * 设置 支持拖动编辑
     * <P>
     * 等同 {@link #setEditMode}
     * @param editMode
     */
    @JsonIgnore
    public PSSysCalendarItemDTO editmode(Boolean editMode){
        if(editMode == null){
            this.setEditMode(null);
        }
        else{
            this.setEditMode(editMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEVIEWACTIONS</B>&nbsp;启用项操作控制，指定日历项是否启用操作控制，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEVIEWACTIONS = "enableviewactions";

    /**
     * 设置 启用项操作控制，详细说明：{@link #FIELD_ENABLEVIEWACTIONS}
     * 
     * @param enableViewActions
     * 
     */
    @JsonProperty(FIELD_ENABLEVIEWACTIONS)
    public void setEnableViewActions(Integer enableViewActions){
        this.set(FIELD_ENABLEVIEWACTIONS, enableViewActions);
    }
    
    /**
     * 获取 启用项操作控制  
     * @return
     */
    @JsonIgnore
    public Integer getEnableViewActions(){
        Object objValue = this.get(FIELD_ENABLEVIEWACTIONS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用项操作控制 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableViewActionsDirty(){
        if(this.contains(FIELD_ENABLEVIEWACTIONS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用项操作控制
     */
    @JsonIgnore
    public void resetEnableViewActions(){
        this.reset(FIELD_ENABLEVIEWACTIONS);
    }

    /**
     * 设置 启用项操作控制，详细说明：{@link #FIELD_ENABLEVIEWACTIONS}
     * <P>
     * 等同 {@link #setEnableViewActions}
     * @param enableViewActions
     */
    @JsonIgnore
    public PSSysCalendarItemDTO enableviewactions(Integer enableViewActions){
        this.setEnableViewActions(enableViewActions);
        return this;
    }

     /**
     * 设置 启用项操作控制，详细说明：{@link #FIELD_ENABLEVIEWACTIONS}
     * <P>
     * 等同 {@link #setEnableViewActions}
     * @param enableViewActions
     */
    @JsonIgnore
    public PSSysCalendarItemDTO enableviewactions(Boolean enableViewActions){
        if(enableViewActions == null){
            this.setEnableViewActions(null);
        }
        else{
            this.setEnableViewActions(enableViewActions?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENDPSDEFID</B>&nbsp;结束时间属性，指定日历项的结束时间存储属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_ENDPSDEFID = "endpsdefid";

    /**
     * 设置 结束时间属性，详细说明：{@link #FIELD_ENDPSDEFID}
     * 
     * @param endPSDEFId
     * 
     */
    @JsonProperty(FIELD_ENDPSDEFID)
    public void setEndPSDEFId(String endPSDEFId){
        this.set(FIELD_ENDPSDEFID, endPSDEFId);
    }
    
    /**
     * 获取 结束时间属性  
     * @return
     */
    @JsonIgnore
    public String getEndPSDEFId(){
        Object objValue = this.get(FIELD_ENDPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 结束时间属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEndPSDEFIdDirty(){
        if(this.contains(FIELD_ENDPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 结束时间属性
     */
    @JsonIgnore
    public void resetEndPSDEFId(){
        this.reset(FIELD_ENDPSDEFID);
    }

    /**
     * 设置 结束时间属性，详细说明：{@link #FIELD_ENDPSDEFID}
     * <P>
     * 等同 {@link #setEndPSDEFId}
     * @param endPSDEFId
     */
    @JsonIgnore
    public PSSysCalendarItemDTO endpsdefid(String endPSDEFId){
        this.setEndPSDEFId(endPSDEFId);
        return this;
    }

    /**
     * 设置 结束时间属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setEndPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysCalendarItemDTO endpsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setEndPSDEFId(null);
            this.setEndPSDEFName(null);
        }
        else{
            this.setEndPSDEFId(pSDEField.getPSDEFieldId());
            this.setEndPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>ENDPSDEFNAME</B>&nbsp;结束时间属性，指定日历项的结束时间存储属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ENDPSDEFID}
     */
    public final static String FIELD_ENDPSDEFNAME = "endpsdefname";

    /**
     * 设置 结束时间属性，详细说明：{@link #FIELD_ENDPSDEFNAME}
     * 
     * @param endPSDEFName
     * 
     */
    @JsonProperty(FIELD_ENDPSDEFNAME)
    public void setEndPSDEFName(String endPSDEFName){
        this.set(FIELD_ENDPSDEFNAME, endPSDEFName);
    }
    
    /**
     * 获取 结束时间属性  
     * @return
     */
    @JsonIgnore
    public String getEndPSDEFName(){
        Object objValue = this.get(FIELD_ENDPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 结束时间属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEndPSDEFNameDirty(){
        if(this.contains(FIELD_ENDPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 结束时间属性
     */
    @JsonIgnore
    public void resetEndPSDEFName(){
        this.reset(FIELD_ENDPSDEFNAME);
    }

    /**
     * 设置 结束时间属性，详细说明：{@link #FIELD_ENDPSDEFNAME}
     * <P>
     * 等同 {@link #setEndPSDEFName}
     * @param endPSDEFName
     */
    @JsonIgnore
    public PSSysCalendarItemDTO endpsdefname(String endPSDEFName){
        this.setEndPSDEFName(endPSDEFName);
        return this;
    }

    /**
     * <B>FINISHPSDEFID</B>&nbsp;完成量属性，指定日历项的完成量存储属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_FINISHPSDEFID = "finishpsdefid";

    /**
     * 设置 完成量属性，详细说明：{@link #FIELD_FINISHPSDEFID}
     * 
     * @param finishPSDEFId
     * 
     */
    @JsonProperty(FIELD_FINISHPSDEFID)
    public void setFinishPSDEFId(String finishPSDEFId){
        this.set(FIELD_FINISHPSDEFID, finishPSDEFId);
    }
    
    /**
     * 获取 完成量属性  
     * @return
     */
    @JsonIgnore
    public String getFinishPSDEFId(){
        Object objValue = this.get(FIELD_FINISHPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 完成量属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFinishPSDEFIdDirty(){
        if(this.contains(FIELD_FINISHPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 完成量属性
     */
    @JsonIgnore
    public void resetFinishPSDEFId(){
        this.reset(FIELD_FINISHPSDEFID);
    }

    /**
     * 设置 完成量属性，详细说明：{@link #FIELD_FINISHPSDEFID}
     * <P>
     * 等同 {@link #setFinishPSDEFId}
     * @param finishPSDEFId
     */
    @JsonIgnore
    public PSSysCalendarItemDTO finishpsdefid(String finishPSDEFId){
        this.setFinishPSDEFId(finishPSDEFId);
        return this;
    }

    /**
     * 设置 完成量属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setFinishPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysCalendarItemDTO finishpsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setFinishPSDEFId(null);
            this.setFinishPSDEFName(null);
        }
        else{
            this.setFinishPSDEFId(pSDEField.getPSDEFieldId());
            this.setFinishPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>FINISHPSDEFNAME</B>&nbsp;完成量属性，指定日历项的完成量存储属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_FINISHPSDEFID}
     */
    public final static String FIELD_FINISHPSDEFNAME = "finishpsdefname";

    /**
     * 设置 完成量属性，详细说明：{@link #FIELD_FINISHPSDEFNAME}
     * 
     * @param finishPSDEFName
     * 
     */
    @JsonProperty(FIELD_FINISHPSDEFNAME)
    public void setFinishPSDEFName(String finishPSDEFName){
        this.set(FIELD_FINISHPSDEFNAME, finishPSDEFName);
    }
    
    /**
     * 获取 完成量属性  
     * @return
     */
    @JsonIgnore
    public String getFinishPSDEFName(){
        Object objValue = this.get(FIELD_FINISHPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 完成量属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFinishPSDEFNameDirty(){
        if(this.contains(FIELD_FINISHPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 完成量属性
     */
    @JsonIgnore
    public void resetFinishPSDEFName(){
        this.reset(FIELD_FINISHPSDEFNAME);
    }

    /**
     * 设置 完成量属性，详细说明：{@link #FIELD_FINISHPSDEFNAME}
     * <P>
     * 等同 {@link #setFinishPSDEFName}
     * @param finishPSDEFName
     */
    @JsonIgnore
    public PSSysCalendarItemDTO finishpsdefname(String finishPSDEFName){
        this.setFinishPSDEFName(finishPSDEFName);
        return this;
    }

    /**
     * <B>GANTTPSSYSPFPLUGINID</B>&nbsp;甘特前端插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysPFPluginDTO} 
     */
    public final static String FIELD_GANTTPSSYSPFPLUGINID = "ganttpssyspfpluginid";

    /**
     * 设置 甘特前端插件
     * 
     * @param ganttPSSysPFPluginId
     * 
     */
    @JsonProperty(FIELD_GANTTPSSYSPFPLUGINID)
    public void setGanttPSSysPFPluginId(String ganttPSSysPFPluginId){
        this.set(FIELD_GANTTPSSYSPFPLUGINID, ganttPSSysPFPluginId);
    }
    
    /**
     * 获取 甘特前端插件  
     * @return
     */
    @JsonIgnore
    public String getGanttPSSysPFPluginId(){
        Object objValue = this.get(FIELD_GANTTPSSYSPFPLUGINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 甘特前端插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGanttPSSysPFPluginIdDirty(){
        if(this.contains(FIELD_GANTTPSSYSPFPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 甘特前端插件
     */
    @JsonIgnore
    public void resetGanttPSSysPFPluginId(){
        this.reset(FIELD_GANTTPSSYSPFPLUGINID);
    }

    /**
     * 设置 甘特前端插件
     * <P>
     * 等同 {@link #setGanttPSSysPFPluginId}
     * @param ganttPSSysPFPluginId
     */
    @JsonIgnore
    public PSSysCalendarItemDTO ganttpssyspfpluginid(String ganttPSSysPFPluginId){
        this.setGanttPSSysPFPluginId(ganttPSSysPFPluginId);
        return this;
    }

    /**
     * 设置 甘特前端插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setGanttPSSysPFPluginId}
     * @param pSSysPFPlugin 引用对象
     */
    @JsonIgnore
    public PSSysCalendarItemDTO ganttpssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin){
        if(pSSysPFPlugin == null){
            this.setGanttPSSysPFPluginId(null);
            this.setGanttPSSysPFPluginName(null);
        }
        else{
            this.setGanttPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setGanttPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    /**
     * <B>GANTTPSSYSPFPLUGINNAME</B>&nbsp;甘特前端插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GANTTPSSYSPFPLUGINID}
     */
    public final static String FIELD_GANTTPSSYSPFPLUGINNAME = "ganttpssyspfpluginname";

    /**
     * 设置 甘特前端插件
     * 
     * @param ganttPSSysPFPluginName
     * 
     */
    @JsonProperty(FIELD_GANTTPSSYSPFPLUGINNAME)
    public void setGanttPSSysPFPluginName(String ganttPSSysPFPluginName){
        this.set(FIELD_GANTTPSSYSPFPLUGINNAME, ganttPSSysPFPluginName);
    }
    
    /**
     * 获取 甘特前端插件  
     * @return
     */
    @JsonIgnore
    public String getGanttPSSysPFPluginName(){
        Object objValue = this.get(FIELD_GANTTPSSYSPFPLUGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 甘特前端插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGanttPSSysPFPluginNameDirty(){
        if(this.contains(FIELD_GANTTPSSYSPFPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 甘特前端插件
     */
    @JsonIgnore
    public void resetGanttPSSysPFPluginName(){
        this.reset(FIELD_GANTTPSSYSPFPLUGINNAME);
    }

    /**
     * 设置 甘特前端插件
     * <P>
     * 等同 {@link #setGanttPSSysPFPluginName}
     * @param ganttPSSysPFPluginName
     */
    @JsonIgnore
    public PSSysCalendarItemDTO ganttpssyspfpluginname(String ganttPSSysPFPluginName){
        this.setGanttPSSysPFPluginName(ganttPSSysPFPluginName);
        return this;
    }

    /**
     * <B>ICONPSDEFID</B>&nbsp;图标属性，指定日历项的图标存储属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
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
    public PSSysCalendarItemDTO iconpsdefid(String iconPSDEFId){
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
    public PSSysCalendarItemDTO iconpsdefid(PSDEFieldDTO pSDEField){
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
     * <B>ICONPSDEFNAME</B>&nbsp;图标属性，指定日历项的图标存储属性
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
    public PSSysCalendarItemDTO iconpsdefname(String iconPSDEFName){
        this.setIconPSDEFName(iconPSDEFName);
        return this;
    }

    /**
     * <B>ITEMSTYLE</B>&nbsp;内置样式，指定日历项的内置式样，未定义时为【默认样式】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.CtrlDetailStyle} 
     */
    public final static String FIELD_ITEMSTYLE = "itemstyle";

    /**
     * 设置 内置样式，详细说明：{@link #FIELD_ITEMSTYLE}
     * 
     * @param itemStyle
     * 
     */
    @JsonProperty(FIELD_ITEMSTYLE)
    public void setItemStyle(String itemStyle){
        this.set(FIELD_ITEMSTYLE, itemStyle);
    }
    
    /**
     * 获取 内置样式  
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
     * 判断 内置样式 是否指定值，包括空值
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
     * 重置 内置样式
     */
    @JsonIgnore
    public void resetItemStyle(){
        this.reset(FIELD_ITEMSTYLE);
    }

    /**
     * 设置 内置样式，详细说明：{@link #FIELD_ITEMSTYLE}
     * <P>
     * 等同 {@link #setItemStyle}
     * @param itemStyle
     */
    @JsonIgnore
    public PSSysCalendarItemDTO itemstyle(String itemStyle){
        this.setItemStyle(itemStyle);
        return this;
    }

     /**
     * 设置 内置样式，详细说明：{@link #FIELD_ITEMSTYLE}
     * <P>
     * 等同 {@link #setItemStyle}
     * @param itemStyle
     */
    @JsonIgnore
    public PSSysCalendarItemDTO itemstyle(net.ibizsys.model.PSModelEnums.CtrlDetailStyle itemStyle){
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
    public PSSysCalendarItemDTO itemstyletext(String itemStyleText){
        this.setItemStyleText(itemStyleText);
        return this;
    }

    /**
     * <B>ITEMTYPE</B>&nbsp;项类型，指定日历项类别，需在所在日历部件中具备唯一性
     * <P>
     * 字符串：最大长度 20，由字母、数字、下划线组成，且开始必须为字母
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
    public PSSysCalendarItemDTO itemtype(String itemType){
        this.setItemType(itemType);
        return this;
    }

    /**
     * <B>KEYPSDEFID</B>&nbsp;标识属性，指定日历项的标识存储属性，未定义时使用日历项相关实体的主键属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
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
    public PSSysCalendarItemDTO keypsdefid(String keyPSDEFId){
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
    public PSSysCalendarItemDTO keypsdefid(PSDEFieldDTO pSDEField){
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
     * <B>KEYPSDEFNAME</B>&nbsp;标识属性，指定日历项的标识存储属性，未定义时使用日历项相关实体的主键属性
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
    public PSSysCalendarItemDTO keypsdefname(String keyPSDEFName){
        this.setKeyPSDEFName(keyPSDEFName);
        return this;
    }

    /**
     * <B>LEVELPSDEFID</B>&nbsp;级别属性，指定日历项的级别存储属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_LEVELPSDEFID = "levelpsdefid";

    /**
     * 设置 级别属性，详细说明：{@link #FIELD_LEVELPSDEFID}
     * 
     * @param levelPSDEFId
     * 
     */
    @JsonProperty(FIELD_LEVELPSDEFID)
    public void setLevelPSDEFId(String levelPSDEFId){
        this.set(FIELD_LEVELPSDEFID, levelPSDEFId);
    }
    
    /**
     * 获取 级别属性  
     * @return
     */
    @JsonIgnore
    public String getLevelPSDEFId(){
        Object objValue = this.get(FIELD_LEVELPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 级别属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLevelPSDEFIdDirty(){
        if(this.contains(FIELD_LEVELPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 级别属性
     */
    @JsonIgnore
    public void resetLevelPSDEFId(){
        this.reset(FIELD_LEVELPSDEFID);
    }

    /**
     * 设置 级别属性，详细说明：{@link #FIELD_LEVELPSDEFID}
     * <P>
     * 等同 {@link #setLevelPSDEFId}
     * @param levelPSDEFId
     */
    @JsonIgnore
    public PSSysCalendarItemDTO levelpsdefid(String levelPSDEFId){
        this.setLevelPSDEFId(levelPSDEFId);
        return this;
    }

    /**
     * 设置 级别属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setLevelPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysCalendarItemDTO levelpsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setLevelPSDEFId(null);
            this.setLevelPSDEFName(null);
        }
        else{
            this.setLevelPSDEFId(pSDEField.getPSDEFieldId());
            this.setLevelPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>LEVELPSDEFNAME</B>&nbsp;级别属性，指定日历项的级别存储属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_LEVELPSDEFID}
     */
    public final static String FIELD_LEVELPSDEFNAME = "levelpsdefname";

    /**
     * 设置 级别属性，详细说明：{@link #FIELD_LEVELPSDEFNAME}
     * 
     * @param levelPSDEFName
     * 
     */
    @JsonProperty(FIELD_LEVELPSDEFNAME)
    public void setLevelPSDEFName(String levelPSDEFName){
        this.set(FIELD_LEVELPSDEFNAME, levelPSDEFName);
    }
    
    /**
     * 获取 级别属性  
     * @return
     */
    @JsonIgnore
    public String getLevelPSDEFName(){
        Object objValue = this.get(FIELD_LEVELPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 级别属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLevelPSDEFNameDirty(){
        if(this.contains(FIELD_LEVELPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 级别属性
     */
    @JsonIgnore
    public void resetLevelPSDEFName(){
        this.reset(FIELD_LEVELPSDEFNAME);
    }

    /**
     * 设置 级别属性，详细说明：{@link #FIELD_LEVELPSDEFNAME}
     * <P>
     * 等同 {@link #setLevelPSDEFName}
     * @param levelPSDEFName
     */
    @JsonIgnore
    public PSSysCalendarItemDTO levelpsdefname(String levelPSDEFName){
        this.setLevelPSDEFName(levelPSDEFName);
        return this;
    }

    /**
     * <B>MAXSIZE</B>&nbsp;最大节点数量，指定日历项最大的加载数量，-1为不限制。未定义时为【-1】
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
    public PSSysCalendarItemDTO maxsize(Integer maxSize){
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
    public PSSysCalendarItemDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MODELOBJ</B>&nbsp;项模型对象，指定日历项的动态模型对象，此配置需确定各模板具体的实现方式
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
    public PSSysCalendarItemDTO modelobj(String modelObj){
        this.setModelObj(modelObj);
        return this;
    }

    /**
     * <B>NAMEPSLANRESID</B>&nbsp;名称语言资源，指定日历部件项的名称的多语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSLanguageResDTO} 
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
    public PSSysCalendarItemDTO namepslanresid(String namePSLanResId){
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
    public PSSysCalendarItemDTO namepslanresid(PSLanguageResDTO pSLanguageRes){
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
     * <B>NAMEPSLANRESNAME</B>&nbsp;名称语言资源，指定日历部件项的名称的多语言资源
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
    public PSSysCalendarItemDTO namepslanresname(String namePSLanResName){
        this.setNamePSLanResName(namePSLanResName);
        return this;
    }

    /**
     * <B>NAVVIEWFILTER</B>&nbsp;导航视图过滤项，指定日历数据序列关联导航视图的过滤项名称，导航视图一般使用应用上下文自动进行数据过滤，指定过滤项将为导航视图显示传入过滤条件
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
    public PSSysCalendarItemDTO navviewfilter(String navViewFilter){
        this.setNavViewFilter(navViewFilter);
        return this;
    }

    /**
     * <B>NAVVIEWPARAM</B>&nbsp;导航视图参数，指定日历数据序列关联导航视图的额外参数
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
    public PSSysCalendarItemDTO navviewparam(String navViewParam){
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
    public PSSysCalendarItemDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>ORDERVALUEPSDEFID</B>&nbsp;排序属性，指定日历项的排序值存储属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
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
    public PSSysCalendarItemDTO ordervaluepsdefid(String orderValuePSDEFId){
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
    public PSSysCalendarItemDTO ordervaluepsdefid(PSDEFieldDTO pSDEField){
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
     * <B>ORDERVALUEPSDEFNAME</B>&nbsp;排序属性，指定日历项的排序值存储属性
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
    public PSSysCalendarItemDTO ordervaluepsdefname(String orderValuePSDEFName){
        this.setOrderValuePSDEFName(orderValuePSDEFName);
        return this;
    }

    /**
     * <B>PKEYPSDEFID</B>&nbsp;父标识属性，指定日历项的父标识存储属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_PKEYPSDEFID = "pkeypsdefid";

    /**
     * 设置 父标识属性，详细说明：{@link #FIELD_PKEYPSDEFID}
     * 
     * @param pKeyPSDEFId
     * 
     */
    @JsonProperty(FIELD_PKEYPSDEFID)
    public void setPKeyPSDEFId(String pKeyPSDEFId){
        this.set(FIELD_PKEYPSDEFID, pKeyPSDEFId);
    }
    
    /**
     * 获取 父标识属性  
     * @return
     */
    @JsonIgnore
    public String getPKeyPSDEFId(){
        Object objValue = this.get(FIELD_PKEYPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父标识属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPKeyPSDEFIdDirty(){
        if(this.contains(FIELD_PKEYPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父标识属性
     */
    @JsonIgnore
    public void resetPKeyPSDEFId(){
        this.reset(FIELD_PKEYPSDEFID);
    }

    /**
     * 设置 父标识属性，详细说明：{@link #FIELD_PKEYPSDEFID}
     * <P>
     * 等同 {@link #setPKeyPSDEFId}
     * @param pKeyPSDEFId
     */
    @JsonIgnore
    public PSSysCalendarItemDTO pkeypsdefid(String pKeyPSDEFId){
        this.setPKeyPSDEFId(pKeyPSDEFId);
        return this;
    }

    /**
     * 设置 父标识属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPKeyPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysCalendarItemDTO pkeypsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setPKeyPSDEFId(null);
            this.setPKeyPSDEFName(null);
        }
        else{
            this.setPKeyPSDEFId(pSDEField.getPSDEFieldId());
            this.setPKeyPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>PKEYPSDEFNAME</B>&nbsp;父标识属性，指定日历项的父标识存储属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PKEYPSDEFID}
     */
    public final static String FIELD_PKEYPSDEFNAME = "pkeypsdefname";

    /**
     * 设置 父标识属性，详细说明：{@link #FIELD_PKEYPSDEFNAME}
     * 
     * @param pKeyPSDEFName
     * 
     */
    @JsonProperty(FIELD_PKEYPSDEFNAME)
    public void setPKeyPSDEFName(String pKeyPSDEFName){
        this.set(FIELD_PKEYPSDEFNAME, pKeyPSDEFName);
    }
    
    /**
     * 获取 父标识属性  
     * @return
     */
    @JsonIgnore
    public String getPKeyPSDEFName(){
        Object objValue = this.get(FIELD_PKEYPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父标识属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPKeyPSDEFNameDirty(){
        if(this.contains(FIELD_PKEYPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父标识属性
     */
    @JsonIgnore
    public void resetPKeyPSDEFName(){
        this.reset(FIELD_PKEYPSDEFNAME);
    }

    /**
     * 设置 父标识属性，详细说明：{@link #FIELD_PKEYPSDEFNAME}
     * <P>
     * 等同 {@link #setPKeyPSDEFName}
     * @param pKeyPSDEFName
     */
    @JsonIgnore
    public PSSysCalendarItemDTO pkeypsdefname(String pKeyPSDEFName){
        this.setPKeyPSDEFName(pKeyPSDEFName);
        return this;
    }

    /**
     * <B>PSDEDSID</B>&nbsp;数据集合，指定日历项供数的数据集对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO} 
     */
    public final static String FIELD_PSDEDSID = "psdedsid";

    /**
     * 设置 数据集合，详细说明：{@link #FIELD_PSDEDSID}
     * 
     * @param pSDEDSId
     * 
     */
    @JsonProperty(FIELD_PSDEDSID)
    public void setPSDEDSId(String pSDEDSId){
        this.set(FIELD_PSDEDSID, pSDEDSId);
    }
    
    /**
     * 获取 数据集合  
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
     * 判断 数据集合 是否指定值，包括空值
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
     * 重置 数据集合
     */
    @JsonIgnore
    public void resetPSDEDSId(){
        this.reset(FIELD_PSDEDSID);
    }

    /**
     * 设置 数据集合，详细说明：{@link #FIELD_PSDEDSID}
     * <P>
     * 等同 {@link #setPSDEDSId}
     * @param pSDEDSId
     */
    @JsonIgnore
    public PSSysCalendarItemDTO psdedsid(String pSDEDSId){
        this.setPSDEDSId(pSDEDSId);
        return this;
    }

    /**
     * 设置 数据集合，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDSId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSSysCalendarItemDTO psdedsid(PSDEDataSetDTO pSDEDataSet){
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
     * <B>PSDEDSNAME</B>&nbsp;数据集合，指定日历项供数的数据集对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDSID}
     */
    public final static String FIELD_PSDEDSNAME = "psdedsname";

    /**
     * 设置 数据集合，详细说明：{@link #FIELD_PSDEDSNAME}
     * 
     * @param pSDEDSName
     * 
     */
    @JsonProperty(FIELD_PSDEDSNAME)
    public void setPSDEDSName(String pSDEDSName){
        this.set(FIELD_PSDEDSNAME, pSDEDSName);
    }
    
    /**
     * 获取 数据集合  
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
     * 判断 数据集合 是否指定值，包括空值
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
     * 重置 数据集合
     */
    @JsonIgnore
    public void resetPSDEDSName(){
        this.reset(FIELD_PSDEDSNAME);
    }

    /**
     * 设置 数据集合，详细说明：{@link #FIELD_PSDEDSNAME}
     * <P>
     * 等同 {@link #setPSDEDSName}
     * @param pSDEDSName
     */
    @JsonIgnore
    public PSSysCalendarItemDTO psdedsname(String pSDEDSName){
        this.setPSDEDSName(pSDEDSName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定日历项相关的实体对象
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
    public PSSysCalendarItemDTO psdeid(String pSDEId){
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
    public PSSysCalendarItemDTO psdeid(PSDataEntityDTO pSDataEntity){
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
     * <B>PSDELOGICID</B>&nbsp;上下文数据逻辑，指定日历项使用数据集的查询上下文转换逻辑，将调用环境参数转换为数据集的调用参数
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDELogicDTO} 
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
    public PSSysCalendarItemDTO psdelogicid(String pSDELogicId){
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
    public PSSysCalendarItemDTO psdelogicid(PSDELogicDTO pSDELogic){
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
     * <B>PSDELOGICNAME</B>&nbsp;上下文数据逻辑，指定日历项使用数据集的查询上下文转换逻辑，将调用环境参数转换为数据集的调用参数
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
    public PSSysCalendarItemDTO psdelogicname(String pSDELogicName){
        this.setPSDELogicName(pSDELogicName);
        return this;
    }

    /**
     * <B>PSDENAME</B>&nbsp;实体，指定日历项相关的实体对象
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
    public PSSysCalendarItemDTO psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSDERID</B>&nbsp;导航关系参数，指定日历项默认的导航关系，此配置在日历导航视图启用
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDERDTO} 
     */
    public final static String FIELD_PSDERID = "psderid";

    /**
     * 设置 导航关系参数，详细说明：{@link #FIELD_PSDERID}
     * 
     * @param pSDERId
     * 
     */
    @JsonProperty(FIELD_PSDERID)
    public void setPSDERId(String pSDERId){
        this.set(FIELD_PSDERID, pSDERId);
    }
    
    /**
     * 获取 导航关系参数  
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
     * 判断 导航关系参数 是否指定值，包括空值
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
     * 重置 导航关系参数
     */
    @JsonIgnore
    public void resetPSDERId(){
        this.reset(FIELD_PSDERID);
    }

    /**
     * 设置 导航关系参数，详细说明：{@link #FIELD_PSDERID}
     * <P>
     * 等同 {@link #setPSDERId}
     * @param pSDERId
     */
    @JsonIgnore
    public PSSysCalendarItemDTO psderid(String pSDERId){
        this.setPSDERId(pSDERId);
        return this;
    }

    /**
     * 设置 导航关系参数，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDERId}
     * @param pSDER 引用对象
     */
    @JsonIgnore
    public PSSysCalendarItemDTO psderid(PSDERDTO pSDER){
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
     * <B>PSDERNAME</B>&nbsp;导航视图关系，指定日历项默认的导航关系，此配置在日历导航视图启用
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
    public PSSysCalendarItemDTO psdername(String pSDERName){
        this.setPSDERName(pSDERName);
        return this;
    }

    /**
     * <B>PSDETOOLBARID</B>&nbsp;上下文菜单，指定日历项的上下文菜单对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEToolbarDTO} 
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
    public PSSysCalendarItemDTO psdetoolbarid(String pSDEToolbarId){
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
    public PSSysCalendarItemDTO psdetoolbarid(PSDEToolbarDTO pSDEToolbar){
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
     * <B>PSDETOOLBARNAME</B>&nbsp;上下文菜单，指定日历项的上下文菜单对象
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
    public PSSysCalendarItemDTO psdetoolbarname(String pSDEToolbarName){
        this.setPSDEToolbarName(pSDEToolbarName);
        return this;
    }

    /**
     * <B>PSDEVIEWBASEID</B>&nbsp;详细视图，指定日历项默认的导航关系视图，此配置在日历导航视图启用
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEViewBaseDTO} 
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
    public PSSysCalendarItemDTO psdeviewbaseid(String pSDEViewBaseId){
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
    public PSSysCalendarItemDTO psdeviewbaseid(PSDEViewBaseDTO pSDEViewBase){
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
     * <B>PSDEVIEWBASENAME</B>&nbsp;导航视图，指定日历项默认的导航关系视图，此配置在日历导航视图启用
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
    public PSSysCalendarItemDTO psdeviewbasename(String pSDEViewBaseName){
        this.setPSDEViewBaseName(pSDEViewBaseName);
        return this;
    }

    /**
     * <B>PSSYSCALENDARID</B>&nbsp;系统日历部件，指定日历项所在的日历部件对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysCalendarDTO} 
     */
    public final static String FIELD_PSSYSCALENDARID = "pssyscalendarid";

    /**
     * 设置 系统日历部件，详细说明：{@link #FIELD_PSSYSCALENDARID}
     * 
     * @param pSSysCalendarId
     * 
     */
    @JsonProperty(FIELD_PSSYSCALENDARID)
    public void setPSSysCalendarId(String pSSysCalendarId){
        this.set(FIELD_PSSYSCALENDARID, pSSysCalendarId);
    }
    
    /**
     * 获取 系统日历部件  
     * @return
     */
    @JsonIgnore
    public String getPSSysCalendarId(){
        Object objValue = this.get(FIELD_PSSYSCALENDARID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统日历部件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCalendarIdDirty(){
        if(this.contains(FIELD_PSSYSCALENDARID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统日历部件
     */
    @JsonIgnore
    public void resetPSSysCalendarId(){
        this.reset(FIELD_PSSYSCALENDARID);
    }

    /**
     * 设置 系统日历部件，详细说明：{@link #FIELD_PSSYSCALENDARID}
     * <P>
     * 等同 {@link #setPSSysCalendarId}
     * @param pSSysCalendarId
     */
    @JsonIgnore
    public PSSysCalendarItemDTO pssyscalendarid(String pSSysCalendarId){
        this.setPSSysCalendarId(pSSysCalendarId);
        return this;
    }

    /**
     * 设置 系统日历部件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCalendarId}
     * @param pSSysCalendar 引用对象
     */
    @JsonIgnore
    public PSSysCalendarItemDTO pssyscalendarid(PSSysCalendarDTO pSSysCalendar){
        if(pSSysCalendar == null){
            this.setPSSysCalendarId(null);
            this.setPSSysCalendarName(null);
        }
        else{
            this.setPSSysCalendarId(pSSysCalendar.getPSSysCalendarId());
            this.setPSSysCalendarName(pSSysCalendar.getPSSysCalendarName());
        }
        return this;
    }

    /**
     * <B>PSSYSCALENDARITEMID</B>&nbsp;系统日历视图项标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSCALENDARITEMID = "pssyscalendaritemid";

    /**
     * 设置 系统日历视图项标识
     * 
     * @param pSSysCalendarItemId
     * 
     */
    @JsonProperty(FIELD_PSSYSCALENDARITEMID)
    public void setPSSysCalendarItemId(String pSSysCalendarItemId){
        this.set(FIELD_PSSYSCALENDARITEMID, pSSysCalendarItemId);
    }
    
    /**
     * 获取 系统日历视图项标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysCalendarItemId(){
        Object objValue = this.get(FIELD_PSSYSCALENDARITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统日历视图项标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCalendarItemIdDirty(){
        if(this.contains(FIELD_PSSYSCALENDARITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统日历视图项标识
     */
    @JsonIgnore
    public void resetPSSysCalendarItemId(){
        this.reset(FIELD_PSSYSCALENDARITEMID);
    }

    /**
     * 设置 系统日历视图项标识
     * <P>
     * 等同 {@link #setPSSysCalendarItemId}
     * @param pSSysCalendarItemId
     */
    @JsonIgnore
    public PSSysCalendarItemDTO pssyscalendaritemid(String pSSysCalendarItemId){
        this.setPSSysCalendarItemId(pSSysCalendarItemId);
        return this;
    }

    /**
     * <B>PSSYSCALENDARITEMNAME</B>&nbsp;项名称，指定日历项的名称，需在所在日历部件中具备唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSCALENDARITEMNAME = "pssyscalendaritemname";

    /**
     * 设置 项名称，详细说明：{@link #FIELD_PSSYSCALENDARITEMNAME}
     * 
     * @param pSSysCalendarItemName
     * 
     */
    @JsonProperty(FIELD_PSSYSCALENDARITEMNAME)
    public void setPSSysCalendarItemName(String pSSysCalendarItemName){
        this.set(FIELD_PSSYSCALENDARITEMNAME, pSSysCalendarItemName);
    }
    
    /**
     * 获取 项名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysCalendarItemName(){
        Object objValue = this.get(FIELD_PSSYSCALENDARITEMNAME);
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
    public boolean isPSSysCalendarItemNameDirty(){
        if(this.contains(FIELD_PSSYSCALENDARITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项名称
     */
    @JsonIgnore
    public void resetPSSysCalendarItemName(){
        this.reset(FIELD_PSSYSCALENDARITEMNAME);
    }

    /**
     * 设置 项名称，详细说明：{@link #FIELD_PSSYSCALENDARITEMNAME}
     * <P>
     * 等同 {@link #setPSSysCalendarItemName}
     * @param pSSysCalendarItemName
     */
    @JsonIgnore
    public PSSysCalendarItemDTO pssyscalendaritemname(String pSSysCalendarItemName){
        this.setPSSysCalendarItemName(pSSysCalendarItemName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysCalendarItemName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysCalendarItemName(strName);
    }

    @JsonIgnore
    public PSSysCalendarItemDTO name(String strName){
        this.setPSSysCalendarItemName(strName);
        return this;
    }

    /**
     * <B>PSSYSCALENDARNAME</B>&nbsp;系统日历部件，指定日历项所在的日历部件对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSCALENDARID}
     */
    public final static String FIELD_PSSYSCALENDARNAME = "pssyscalendarname";

    /**
     * 设置 系统日历部件，详细说明：{@link #FIELD_PSSYSCALENDARNAME}
     * 
     * @param pSSysCalendarName
     * 
     */
    @JsonProperty(FIELD_PSSYSCALENDARNAME)
    public void setPSSysCalendarName(String pSSysCalendarName){
        this.set(FIELD_PSSYSCALENDARNAME, pSSysCalendarName);
    }
    
    /**
     * 获取 系统日历部件  
     * @return
     */
    @JsonIgnore
    public String getPSSysCalendarName(){
        Object objValue = this.get(FIELD_PSSYSCALENDARNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统日历部件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCalendarNameDirty(){
        if(this.contains(FIELD_PSSYSCALENDARNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统日历部件
     */
    @JsonIgnore
    public void resetPSSysCalendarName(){
        this.reset(FIELD_PSSYSCALENDARNAME);
    }

    /**
     * 设置 系统日历部件，详细说明：{@link #FIELD_PSSYSCALENDARNAME}
     * <P>
     * 等同 {@link #setPSSysCalendarName}
     * @param pSSysCalendarName
     */
    @JsonIgnore
    public PSSysCalendarItemDTO pssyscalendarname(String pSSysCalendarName){
        this.setPSSysCalendarName(pSSysCalendarName);
        return this;
    }

    /**
     * <B>PSSYSCSSID</B>&nbsp;系统界面样式，指定日历项界面的容器样式表对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysCssDTO} 
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
    public PSSysCalendarItemDTO pssyscssid(String pSSysCssId){
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
    public PSSysCalendarItemDTO pssyscssid(PSSysCssDTO pSSysCss){
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
     * <B>PSSYSCSSNAME</B>&nbsp;界面样式表，指定日历项界面的容器样式表对象
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
    public PSSysCalendarItemDTO pssyscssname(String pSSysCssName){
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    /**
     * <B>PSSYSIMAGEID</B>&nbsp;项图片
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysImageDTO} 
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
    public PSSysCalendarItemDTO pssysimageid(String pSSysImageId){
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
    public PSSysCalendarItemDTO pssysimageid(PSSysImageDTO pSSysImage){
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
    public PSSysCalendarItemDTO pssysimagename(String pSSysImageName){
        this.setPSSysImageName(pSSysImageName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端扩展插件，指定系统日历项使用的前端模板扩展插件，使用插件类型【日历部件项绘制插件】
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
    public PSSysCalendarItemDTO pssyspfpluginid(String pSSysPFPluginId){
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
    public PSSysCalendarItemDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin){
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
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端扩展插件，指定系统日历项使用的前端模板扩展插件，使用插件类型【日历部件项绘制插件】
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
    public PSSysCalendarItemDTO pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELID</B>&nbsp;项布局面板，指定日历项自定义的布局面板
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysViewPanelDTO} 
     */
    public final static String FIELD_PSSYSVIEWPANELID = "pssysviewpanelid";

    /**
     * 设置 项布局面板，详细说明：{@link #FIELD_PSSYSVIEWPANELID}
     * 
     * @param pSSysViewPanelId
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELID)
    public void setPSSysViewPanelId(String pSSysViewPanelId){
        this.set(FIELD_PSSYSVIEWPANELID, pSSysViewPanelId);
    }
    
    /**
     * 获取 项布局面板  
     * @return
     */
    @JsonIgnore
    public String getPSSysViewPanelId(){
        Object objValue = this.get(FIELD_PSSYSVIEWPANELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项布局面板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysViewPanelIdDirty(){
        if(this.contains(FIELD_PSSYSVIEWPANELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项布局面板
     */
    @JsonIgnore
    public void resetPSSysViewPanelId(){
        this.reset(FIELD_PSSYSVIEWPANELID);
    }

    /**
     * 设置 项布局面板，详细说明：{@link #FIELD_PSSYSVIEWPANELID}
     * <P>
     * 等同 {@link #setPSSysViewPanelId}
     * @param pSSysViewPanelId
     */
    @JsonIgnore
    public PSSysCalendarItemDTO pssysviewpanelid(String pSSysViewPanelId){
        this.setPSSysViewPanelId(pSSysViewPanelId);
        return this;
    }

    /**
     * 设置 项布局面板，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysViewPanelId}
     * @param pSSysViewPanel 引用对象
     */
    @JsonIgnore
    public PSSysCalendarItemDTO pssysviewpanelid(PSSysViewPanelDTO pSSysViewPanel){
        if(pSSysViewPanel == null){
            this.setPSSysViewPanelId(null);
            this.setPSSysViewPanelName(null);
        }
        else{
            this.setPSSysViewPanelId(pSSysViewPanel.getPSSysViewPanelId());
            this.setPSSysViewPanelName(pSSysViewPanel.getPSSysViewPanelName());
        }
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELNAME</B>&nbsp;项布局面板，指定日历项自定义的布局面板
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSVIEWPANELID}
     */
    public final static String FIELD_PSSYSVIEWPANELNAME = "pssysviewpanelname";

    /**
     * 设置 项布局面板，详细说明：{@link #FIELD_PSSYSVIEWPANELNAME}
     * 
     * @param pSSysViewPanelName
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELNAME)
    public void setPSSysViewPanelName(String pSSysViewPanelName){
        this.set(FIELD_PSSYSVIEWPANELNAME, pSSysViewPanelName);
    }
    
    /**
     * 获取 项布局面板  
     * @return
     */
    @JsonIgnore
    public String getPSSysViewPanelName(){
        Object objValue = this.get(FIELD_PSSYSVIEWPANELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项布局面板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysViewPanelNameDirty(){
        if(this.contains(FIELD_PSSYSVIEWPANELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项布局面板
     */
    @JsonIgnore
    public void resetPSSysViewPanelName(){
        this.reset(FIELD_PSSYSVIEWPANELNAME);
    }

    /**
     * 设置 项布局面板，详细说明：{@link #FIELD_PSSYSVIEWPANELNAME}
     * <P>
     * 等同 {@link #setPSSysViewPanelName}
     * @param pSSysViewPanelName
     */
    @JsonIgnore
    public PSSysCalendarItemDTO pssysviewpanelname(String pSSysViewPanelName){
        this.setPSSysViewPanelName(pSSysViewPanelName);
        return this;
    }

    /**
     * <B>REMOVEPSDEACTIONID</B>&nbsp;删除实体行为，指定日历项的删除数据实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEActionDTO} 
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
    public PSSysCalendarItemDTO removepsdeactionid(String removePSDEActionId){
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
    public PSSysCalendarItemDTO removepsdeactionid(PSDEActionDTO pSDEAction){
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
     * <B>REMOVEPSDEACTIONNAME</B>&nbsp;删除实体行为，指定日历项的删除数据实体行为
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
    public PSSysCalendarItemDTO removepsdeactionname(String removePSDEActionName){
        this.setRemovePSDEActionName(removePSDEActionName);
        return this;
    }

    /**
     * <B>REMOVEPSDEOPPRIVID</B>&nbsp;删除实体操作标识，指定日历项的删除数据需要具备的操作标识
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEOPPrivDTO} 
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
    public PSSysCalendarItemDTO removepsdeopprivid(String removePSDEOPPrivId){
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
    public PSSysCalendarItemDTO removepsdeopprivid(PSDEOPPrivDTO pSDEOPPriv){
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
     * <B>REMOVEPSDEOPPRIVNAME</B>&nbsp;删除实体操作标识，指定日历项的删除数据需要具备的操作标识
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
    public PSSysCalendarItemDTO removepsdeopprivname(String removePSDEOPPrivName){
        this.setRemovePSDEOPPrivName(removePSDEOPPrivName);
        return this;
    }

    /**
     * <B>TAG2PSDEFID</B>&nbsp;标记属性2，指定日历项的标记2存储属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
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
    public PSSysCalendarItemDTO tag2psdefid(String tag2PSDEFId){
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
    public PSSysCalendarItemDTO tag2psdefid(PSDEFieldDTO pSDEField){
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
     * <B>TAG2PSDEFNAME</B>&nbsp;标记属性2，指定日历项的标记2存储属性
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
    public PSSysCalendarItemDTO tag2psdefname(String tag2PSDEFName){
        this.setTag2PSDEFName(tag2PSDEFName);
        return this;
    }

    /**
     * <B>TAGPSDEFID</B>&nbsp;标记属性，指定日历项的标记存储属性，未定义时使用日历项相关实体的主信息属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
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
    public PSSysCalendarItemDTO tagpsdefid(String tagPSDEFId){
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
    public PSSysCalendarItemDTO tagpsdefid(PSDEFieldDTO pSDEField){
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
     * <B>TAGPSDEFNAME</B>&nbsp;标记属性，指定日历项的标记存储属性，未定义时使用日历项相关实体的主信息属性
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
    public PSSysCalendarItemDTO tagpsdefname(String tagPSDEFName){
        this.setTagPSDEFName(tagPSDEFName);
        return this;
    }

    /**
     * <B>TEXTPSDEFID</B>&nbsp;文本属性，指定日历项的文本存储属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
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
    public PSSysCalendarItemDTO textpsdefid(String textPSDEFId){
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
    public PSSysCalendarItemDTO textpsdefid(PSDEFieldDTO pSDEField){
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
     * <B>TEXTPSDEFNAME</B>&nbsp;文本属性，指定日历项的文本存储属性
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
    public PSSysCalendarItemDTO textpsdefname(String textPSDEFName){
        this.setTextPSDEFName(textPSDEFName);
        return this;
    }

    /**
     * <B>TIPSPSDEFID</B>&nbsp;提示属性，指定日历项的提示存储属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
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
    public PSSysCalendarItemDTO tipspsdefid(String tipsPSDEFId){
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
    public PSSysCalendarItemDTO tipspsdefid(PSDEFieldDTO pSDEField){
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
     * <B>TIPSPSDEFNAME</B>&nbsp;提示属性，指定日历项的提示存储属性
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
    public PSSysCalendarItemDTO tipspsdefname(String tipsPSDEFName){
        this.setTipsPSDEFName(tipsPSDEFName);
        return this;
    }

    /**
     * <B>TOTALPSDEFID</B>&nbsp;总量属性，指定日历项的总量存储属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_TOTALPSDEFID = "totalpsdefid";

    /**
     * 设置 总量属性，详细说明：{@link #FIELD_TOTALPSDEFID}
     * 
     * @param totalPSDEFId
     * 
     */
    @JsonProperty(FIELD_TOTALPSDEFID)
    public void setTotalPSDEFId(String totalPSDEFId){
        this.set(FIELD_TOTALPSDEFID, totalPSDEFId);
    }
    
    /**
     * 获取 总量属性  
     * @return
     */
    @JsonIgnore
    public String getTotalPSDEFId(){
        Object objValue = this.get(FIELD_TOTALPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 总量属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTotalPSDEFIdDirty(){
        if(this.contains(FIELD_TOTALPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 总量属性
     */
    @JsonIgnore
    public void resetTotalPSDEFId(){
        this.reset(FIELD_TOTALPSDEFID);
    }

    /**
     * 设置 总量属性，详细说明：{@link #FIELD_TOTALPSDEFID}
     * <P>
     * 等同 {@link #setTotalPSDEFId}
     * @param totalPSDEFId
     */
    @JsonIgnore
    public PSSysCalendarItemDTO totalpsdefid(String totalPSDEFId){
        this.setTotalPSDEFId(totalPSDEFId);
        return this;
    }

    /**
     * 设置 总量属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTotalPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysCalendarItemDTO totalpsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setTotalPSDEFId(null);
            this.setTotalPSDEFName(null);
        }
        else{
            this.setTotalPSDEFId(pSDEField.getPSDEFieldId());
            this.setTotalPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>TOTALPSDEFNAME</B>&nbsp;总量属性，指定日历项的总量存储属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TOTALPSDEFID}
     */
    public final static String FIELD_TOTALPSDEFNAME = "totalpsdefname";

    /**
     * 设置 总量属性，详细说明：{@link #FIELD_TOTALPSDEFNAME}
     * 
     * @param totalPSDEFName
     * 
     */
    @JsonProperty(FIELD_TOTALPSDEFNAME)
    public void setTotalPSDEFName(String totalPSDEFName){
        this.set(FIELD_TOTALPSDEFNAME, totalPSDEFName);
    }
    
    /**
     * 获取 总量属性  
     * @return
     */
    @JsonIgnore
    public String getTotalPSDEFName(){
        Object objValue = this.get(FIELD_TOTALPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 总量属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTotalPSDEFNameDirty(){
        if(this.contains(FIELD_TOTALPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 总量属性
     */
    @JsonIgnore
    public void resetTotalPSDEFName(){
        this.reset(FIELD_TOTALPSDEFNAME);
    }

    /**
     * 设置 总量属性，详细说明：{@link #FIELD_TOTALPSDEFNAME}
     * <P>
     * 等同 {@link #setTotalPSDEFName}
     * @param totalPSDEFName
     */
    @JsonIgnore
    public PSSysCalendarItemDTO totalpsdefname(String totalPSDEFName){
        this.setTotalPSDEFName(totalPSDEFName);
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
    public PSSysCalendarItemDTO updatedate(Timestamp updateDate){
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
    public PSSysCalendarItemDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>UPDATEPSDEACTIONID</B>&nbsp;更新实体行为，指定日历项的更新数据实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEActionDTO} 
     */
    public final static String FIELD_UPDATEPSDEACTIONID = "updatepsdeactionid";

    /**
     * 设置 更新实体行为，详细说明：{@link #FIELD_UPDATEPSDEACTIONID}
     * 
     * @param updatePSDEActionId
     * 
     */
    @JsonProperty(FIELD_UPDATEPSDEACTIONID)
    public void setUpdatePSDEActionId(String updatePSDEActionId){
        this.set(FIELD_UPDATEPSDEACTIONID, updatePSDEActionId);
    }
    
    /**
     * 获取 更新实体行为  
     * @return
     */
    @JsonIgnore
    public String getUpdatePSDEActionId(){
        Object objValue = this.get(FIELD_UPDATEPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 更新实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUpdatePSDEActionIdDirty(){
        if(this.contains(FIELD_UPDATEPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 更新实体行为
     */
    @JsonIgnore
    public void resetUpdatePSDEActionId(){
        this.reset(FIELD_UPDATEPSDEACTIONID);
    }

    /**
     * 设置 更新实体行为，详细说明：{@link #FIELD_UPDATEPSDEACTIONID}
     * <P>
     * 等同 {@link #setUpdatePSDEActionId}
     * @param updatePSDEActionId
     */
    @JsonIgnore
    public PSSysCalendarItemDTO updatepsdeactionid(String updatePSDEActionId){
        this.setUpdatePSDEActionId(updatePSDEActionId);
        return this;
    }

    /**
     * 设置 更新实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUpdatePSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSSysCalendarItemDTO updatepsdeactionid(PSDEActionDTO pSDEAction){
        if(pSDEAction == null){
            this.setUpdatePSDEActionId(null);
            this.setUpdatePSDEActionName(null);
        }
        else{
            this.setUpdatePSDEActionId(pSDEAction.getPSDEActionId());
            this.setUpdatePSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>UPDATEPSDEACTIONNAME</B>&nbsp;更新实体行为，指定日历项的更新数据实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UPDATEPSDEACTIONID}
     */
    public final static String FIELD_UPDATEPSDEACTIONNAME = "updatepsdeactionname";

    /**
     * 设置 更新实体行为，详细说明：{@link #FIELD_UPDATEPSDEACTIONNAME}
     * 
     * @param updatePSDEActionName
     * 
     */
    @JsonProperty(FIELD_UPDATEPSDEACTIONNAME)
    public void setUpdatePSDEActionName(String updatePSDEActionName){
        this.set(FIELD_UPDATEPSDEACTIONNAME, updatePSDEActionName);
    }
    
    /**
     * 获取 更新实体行为  
     * @return
     */
    @JsonIgnore
    public String getUpdatePSDEActionName(){
        Object objValue = this.get(FIELD_UPDATEPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 更新实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUpdatePSDEActionNameDirty(){
        if(this.contains(FIELD_UPDATEPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 更新实体行为
     */
    @JsonIgnore
    public void resetUpdatePSDEActionName(){
        this.reset(FIELD_UPDATEPSDEACTIONNAME);
    }

    /**
     * 设置 更新实体行为，详细说明：{@link #FIELD_UPDATEPSDEACTIONNAME}
     * <P>
     * 等同 {@link #setUpdatePSDEActionName}
     * @param updatePSDEActionName
     */
    @JsonIgnore
    public PSSysCalendarItemDTO updatepsdeactionname(String updatePSDEActionName){
        this.setUpdatePSDEActionName(updatePSDEActionName);
        return this;
    }

    /**
     * <B>UPDATEPSDEOPPRIVID</B>&nbsp;更新实体操作标识，指定日历项的更新数据需要具备的操作标识
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEOPPrivDTO} 
     */
    public final static String FIELD_UPDATEPSDEOPPRIVID = "updatepsdeopprivid";

    /**
     * 设置 更新实体操作标识，详细说明：{@link #FIELD_UPDATEPSDEOPPRIVID}
     * 
     * @param updatePSDEOPPrivId
     * 
     */
    @JsonProperty(FIELD_UPDATEPSDEOPPRIVID)
    public void setUpdatePSDEOPPrivId(String updatePSDEOPPrivId){
        this.set(FIELD_UPDATEPSDEOPPRIVID, updatePSDEOPPrivId);
    }
    
    /**
     * 获取 更新实体操作标识  
     * @return
     */
    @JsonIgnore
    public String getUpdatePSDEOPPrivId(){
        Object objValue = this.get(FIELD_UPDATEPSDEOPPRIVID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 更新实体操作标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUpdatePSDEOPPrivIdDirty(){
        if(this.contains(FIELD_UPDATEPSDEOPPRIVID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 更新实体操作标识
     */
    @JsonIgnore
    public void resetUpdatePSDEOPPrivId(){
        this.reset(FIELD_UPDATEPSDEOPPRIVID);
    }

    /**
     * 设置 更新实体操作标识，详细说明：{@link #FIELD_UPDATEPSDEOPPRIVID}
     * <P>
     * 等同 {@link #setUpdatePSDEOPPrivId}
     * @param updatePSDEOPPrivId
     */
    @JsonIgnore
    public PSSysCalendarItemDTO updatepsdeopprivid(String updatePSDEOPPrivId){
        this.setUpdatePSDEOPPrivId(updatePSDEOPPrivId);
        return this;
    }

    /**
     * 设置 更新实体操作标识，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUpdatePSDEOPPrivId}
     * @param pSDEOPPriv 引用对象
     */
    @JsonIgnore
    public PSSysCalendarItemDTO updatepsdeopprivid(PSDEOPPrivDTO pSDEOPPriv){
        if(pSDEOPPriv == null){
            this.setUpdatePSDEOPPrivId(null);
            this.setUpdatePSDEOPPrivName(null);
        }
        else{
            this.setUpdatePSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setUpdatePSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    /**
     * <B>UPDATEPSDEOPPRIVNAME</B>&nbsp;更新实体操作标识，指定日历项的更新数据需要具备的操作标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UPDATEPSDEOPPRIVID}
     */
    public final static String FIELD_UPDATEPSDEOPPRIVNAME = "updatepsdeopprivname";

    /**
     * 设置 更新实体操作标识，详细说明：{@link #FIELD_UPDATEPSDEOPPRIVNAME}
     * 
     * @param updatePSDEOPPrivName
     * 
     */
    @JsonProperty(FIELD_UPDATEPSDEOPPRIVNAME)
    public void setUpdatePSDEOPPrivName(String updatePSDEOPPrivName){
        this.set(FIELD_UPDATEPSDEOPPRIVNAME, updatePSDEOPPrivName);
    }
    
    /**
     * 获取 更新实体操作标识  
     * @return
     */
    @JsonIgnore
    public String getUpdatePSDEOPPrivName(){
        Object objValue = this.get(FIELD_UPDATEPSDEOPPRIVNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 更新实体操作标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUpdatePSDEOPPrivNameDirty(){
        if(this.contains(FIELD_UPDATEPSDEOPPRIVNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 更新实体操作标识
     */
    @JsonIgnore
    public void resetUpdatePSDEOPPrivName(){
        this.reset(FIELD_UPDATEPSDEOPPRIVNAME);
    }

    /**
     * 设置 更新实体操作标识，详细说明：{@link #FIELD_UPDATEPSDEOPPRIVNAME}
     * <P>
     * 等同 {@link #setUpdatePSDEOPPrivName}
     * @param updatePSDEOPPrivName
     */
    @JsonIgnore
    public PSSysCalendarItemDTO updatepsdeopprivname(String updatePSDEOPPrivName){
        this.setUpdatePSDEOPPrivName(updatePSDEOPPrivName);
        return this;
    }

    /**
     * <B>USERCAT</B>&nbsp;用户分类
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.ModelUserCat} 
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
    public PSSysCalendarItemDTO usercat(String userCat){
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
    public PSSysCalendarItemDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSSysCalendarItemDTO usertag(String userTag){
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
    public PSSysCalendarItemDTO usertag2(String userTag2){
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
    public PSSysCalendarItemDTO usertag3(String userTag3){
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
    public PSSysCalendarItemDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>VALIDFLAG</B>&nbsp;启用
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
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
    public PSSysCalendarItemDTO validflag(Integer validFlag){
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
    public PSSysCalendarItemDTO validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>VIEWACTIONS</B>&nbsp;支持操作，日历项启用操作控制时，指定日历项支持的操作集合
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.CtrlUIAction} 
     */
    public final static String FIELD_VIEWACTIONS = "viewactions";

    /**
     * 设置 支持操作，详细说明：{@link #FIELD_VIEWACTIONS}
     * 
     * @param viewActions
     * 
     */
    @JsonProperty(FIELD_VIEWACTIONS)
    public void setViewActions(Integer viewActions){
        this.set(FIELD_VIEWACTIONS, viewActions);
    }
    
    /**
     * 获取 支持操作  
     * @return
     */
    @JsonIgnore
    public Integer getViewActions(){
        Object objValue = this.get(FIELD_VIEWACTIONS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持操作 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewActionsDirty(){
        if(this.contains(FIELD_VIEWACTIONS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持操作
     */
    @JsonIgnore
    public void resetViewActions(){
        this.reset(FIELD_VIEWACTIONS);
    }

    /**
     * 设置 支持操作，详细说明：{@link #FIELD_VIEWACTIONS}
     * <P>
     * 等同 {@link #setViewActions}
     * @param viewActions
     */
    @JsonIgnore
    public PSSysCalendarItemDTO viewactions(Integer viewActions){
        this.setViewActions(viewActions);
        return this;
    }

     /**
     * 设置 支持操作，详细说明：{@link #FIELD_VIEWACTIONS}
     * <P>
     * 等同 {@link #setViewActions}
     * @param viewActions
     */
    @JsonIgnore
    public PSSysCalendarItemDTO viewactions(net.ibizsys.model.PSModelEnums.CtrlUIAction[] viewActions){
        if(viewActions == null || viewActions.length == 0){
            this.setViewActions(null);
        }
        else{
            int _value = 0;
            for(net.ibizsys.model.PSModelEnums.CtrlUIAction _item : viewActions){
                _value |= _item.value;
            }
            this.setViewActions(_value);
        }
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSSysCalendarItemId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysCalendarItemId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysCalendarItemId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysCalendarItemId(strValue);
    }

    @JsonIgnore
    public PSSysCalendarItemDTO id(String strValue){
        this.setPSSysCalendarItemId(strValue);
        return this;
    }


    /**
     *  系统日历项相关视图 成员集合
     */
    public final static String FIELD_PSSYSCALENDARITEMRVS = "pssyscalendaritemrvs";

    private java.util.List<net.ibizsys.centralstudio.dto.PSSysCalendarItemRVDTO> pssyscalendaritemrvs;

    /**
     * 获取 系统日历项相关视图 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSSYSCALENDARITEMRVS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSSysCalendarItemRVDTO> getPSSysCalendarItemRVs(){
        return this.pssyscalendaritemrvs;
    }

    /**
     * 设置 系统日历项相关视图 成员集合  
     * @param pssyscalendaritemrvs
     */
    @JsonProperty(FIELD_PSSYSCALENDARITEMRVS)
    public void setPSSysCalendarItemRVs(java.util.List<net.ibizsys.centralstudio.dto.PSSysCalendarItemRVDTO> pssyscalendaritemrvs){
        this.pssyscalendaritemrvs = pssyscalendaritemrvs;
    }

    /**
     * 获取 系统日历项相关视图 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSSysCalendarItemRVDTO> getPSSysCalendarItemRVsIf(){
        if(this.pssyscalendaritemrvs == null){
            this.pssyscalendaritemrvs = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSSysCalendarItemRVDTO>();          
        }
        return this.pssyscalendaritemrvs;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysCalendarItemDTO){
            PSSysCalendarItemDTO dto = (PSSysCalendarItemDTO)iEntity;
            dto.setPSSysCalendarItemRVs(this.getPSSysCalendarItemRVs());
        }
        super.copyTo(iEntity);
    }
}
