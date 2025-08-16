package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSCODEITEM</B>系统代码表项 模型传输对象
 * <P>
 * 系统的代码表项模型，支持定义层级代码项
 */
public class PSCodeItemDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSCodeItemDTO(){
    }      

    /**
     * <B>BEGINVALUE</B>&nbsp;起始值
     */
    public final static String FIELD_BEGINVALUE = "beginvalue";

    /**
     * 设置 起始值
     * 
     * @param beginValue
     * 
     */
    @JsonProperty(FIELD_BEGINVALUE)
    public void setBeginValue(BigDecimal beginValue){
        this.set(FIELD_BEGINVALUE, beginValue);
    }
    
    /**
     * 获取 起始值  
     * @return
     */
    @JsonIgnore
    public BigDecimal getBeginValue(){
        Object objValue = this.get(FIELD_BEGINVALUE);
        if(objValue==null){
            return null;
        }
        return (BigDecimal)objValue;
    }

    /**
     * 判断 起始值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBeginValueDirty(){
        if(this.contains(FIELD_BEGINVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 起始值
     */
    @JsonIgnore
    public void resetBeginValue(){
        this.reset(FIELD_BEGINVALUE);
    }

    /**
     * 设置 起始值
     * <P>
     * 等同 {@link #setBeginValue}
     * @param beginValue
     */
    @JsonIgnore
    public PSCodeItemDTO beginvalue(BigDecimal beginValue){
        this.setBeginValue(beginValue);
        return this;
    }

    /**
     * <B>BKCOLOR</B>&nbsp;背景颜色
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_BKCOLOR = "bkcolor";

    /**
     * 设置 背景颜色
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
     * 设置 背景颜色
     * <P>
     * 等同 {@link #setBKColor}
     * @param bKColor
     */
    @JsonIgnore
    public PSCodeItemDTO bkcolor(String bKColor){
        this.setBKColor(bKColor);
        return this;
    }

    /**
     * <B>CODEITEMVALUE</B>&nbsp;代码项值
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_CODEITEMVALUE = "codeitemvalue";

    /**
     * 设置 代码项值
     * 
     * @param codeItemValue
     * 
     */
    @JsonProperty(FIELD_CODEITEMVALUE)
    public void setCodeItemValue(String codeItemValue){
        this.set(FIELD_CODEITEMVALUE, codeItemValue);
    }
    
    /**
     * 获取 代码项值  
     * @return
     */
    @JsonIgnore
    public String getCodeItemValue(){
        Object objValue = this.get(FIELD_CODEITEMVALUE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码项值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCodeItemValueDirty(){
        if(this.contains(FIELD_CODEITEMVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码项值
     */
    @JsonIgnore
    public void resetCodeItemValue(){
        this.reset(FIELD_CODEITEMVALUE);
    }

    /**
     * 设置 代码项值
     * <P>
     * 等同 {@link #setCodeItemValue}
     * @param codeItemValue
     */
    @JsonIgnore
    public PSCodeItemDTO codeitemvalue(String codeItemValue){
        this.setCodeItemValue(codeItemValue);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识
     * <P>
     * 字符串：最大长度 60，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_CODENAME = "codename";

    /**
     * 设置 代码标识
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
     * 设置 代码标识
     * <P>
     * 等同 {@link #setCodeName}
     * @param codeName
     */
    @JsonIgnore
    public PSCodeItemDTO codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>COLOR</B>&nbsp;颜色
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_COLOR = "color";

    /**
     * 设置 颜色
     * 
     * @param color
     * 
     */
    @JsonProperty(FIELD_COLOR)
    public void setColor(String color){
        this.set(FIELD_COLOR, color);
    }
    
    /**
     * 获取 颜色  
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
     * 判断 颜色 是否指定值，包括空值
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
     * 重置 颜色
     */
    @JsonIgnore
    public void resetColor(){
        this.reset(FIELD_COLOR);
    }

    /**
     * 设置 颜色
     * <P>
     * 等同 {@link #setColor}
     * @param color
     */
    @JsonIgnore
    public PSCodeItemDTO color(String color){
        this.setColor(color);
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
    public PSCodeItemDTO createdate(Timestamp createDate){
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
    public PSCodeItemDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DATA</B>&nbsp;代码项数据
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_DATA = "data";

    /**
     * 设置 代码项数据
     * 
     * @param data
     * 
     */
    @JsonProperty(FIELD_DATA)
    public void setData(String data){
        this.set(FIELD_DATA, data);
    }
    
    /**
     * 获取 代码项数据  
     * @return
     */
    @JsonIgnore
    public String getData(){
        Object objValue = this.get(FIELD_DATA);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码项数据 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDataDirty(){
        if(this.contains(FIELD_DATA)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码项数据
     */
    @JsonIgnore
    public void resetData(){
        this.reset(FIELD_DATA);
    }

    /**
     * 设置 代码项数据
     * <P>
     * 等同 {@link #setData}
     * @param data
     */
    @JsonIgnore
    public PSCodeItemDTO data(String data){
        this.setData(data);
        return this;
    }

    /**
     * <B>DEFAULTFLAG</B>&nbsp;默认项，指定代码项是否为代码表中的默认项，代码表只支持定义一个默认项，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEFAULTFLAG = "defaultflag";

    /**
     * 设置 默认项，详细说明：{@link #FIELD_DEFAULTFLAG}
     * 
     * @param defaultFlag
     * 
     */
    @JsonProperty(FIELD_DEFAULTFLAG)
    public void setDefaultFlag(Integer defaultFlag){
        this.set(FIELD_DEFAULTFLAG, defaultFlag);
    }
    
    /**
     * 获取 默认项  
     * @return
     */
    @JsonIgnore
    public Integer getDefaultFlag(){
        Object objValue = this.get(FIELD_DEFAULTFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefaultFlagDirty(){
        if(this.contains(FIELD_DEFAULTFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认项
     */
    @JsonIgnore
    public void resetDefaultFlag(){
        this.reset(FIELD_DEFAULTFLAG);
    }

    /**
     * 设置 默认项，详细说明：{@link #FIELD_DEFAULTFLAG}
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSCodeItemDTO defaultflag(Integer defaultFlag){
        this.setDefaultFlag(defaultFlag);
        return this;
    }

     /**
     * 设置 默认项，详细说明：{@link #FIELD_DEFAULTFLAG}
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSCodeItemDTO defaultflag(Boolean defaultFlag){
        if(defaultFlag == null){
            this.setDefaultFlag(null);
        }
        else{
            this.setDefaultFlag(defaultFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DISABLESELECT</B>&nbsp;禁止选择
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DISABLESELECT = "disableselect";

    /**
     * 设置 禁止选择
     * 
     * @param disableSelect
     * 
     */
    @JsonProperty(FIELD_DISABLESELECT)
    public void setDisableSelect(Integer disableSelect){
        this.set(FIELD_DISABLESELECT, disableSelect);
    }
    
    /**
     * 获取 禁止选择  
     * @return
     */
    @JsonIgnore
    public Integer getDisableSelect(){
        Object objValue = this.get(FIELD_DISABLESELECT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 禁止选择 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDisableSelectDirty(){
        if(this.contains(FIELD_DISABLESELECT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 禁止选择
     */
    @JsonIgnore
    public void resetDisableSelect(){
        this.reset(FIELD_DISABLESELECT);
    }

    /**
     * 设置 禁止选择
     * <P>
     * 等同 {@link #setDisableSelect}
     * @param disableSelect
     */
    @JsonIgnore
    public PSCodeItemDTO disableselect(Integer disableSelect){
        this.setDisableSelect(disableSelect);
        return this;
    }

     /**
     * 设置 禁止选择
     * <P>
     * 等同 {@link #setDisableSelect}
     * @param disableSelect
     */
    @JsonIgnore
    public PSCodeItemDTO disableselect(Boolean disableSelect){
        if(disableSelect == null){
            this.setDisableSelect(null);
        }
        else{
            this.setDisableSelect(disableSelect?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENDVALUE</B>&nbsp;结束值
     */
    public final static String FIELD_ENDVALUE = "endvalue";

    /**
     * 设置 结束值
     * 
     * @param endValue
     * 
     */
    @JsonProperty(FIELD_ENDVALUE)
    public void setEndValue(BigDecimal endValue){
        this.set(FIELD_ENDVALUE, endValue);
    }
    
    /**
     * 获取 结束值  
     * @return
     */
    @JsonIgnore
    public BigDecimal getEndValue(){
        Object objValue = this.get(FIELD_ENDVALUE);
        if(objValue==null){
            return null;
        }
        return (BigDecimal)objValue;
    }

    /**
     * 判断 结束值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEndValueDirty(){
        if(this.contains(FIELD_ENDVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 结束值
     */
    @JsonIgnore
    public void resetEndValue(){
        this.reset(FIELD_ENDVALUE);
    }

    /**
     * 设置 结束值
     * <P>
     * 等同 {@link #setEndValue}
     * @param endValue
     */
    @JsonIgnore
    public PSCodeItemDTO endvalue(BigDecimal endValue){
        this.setEndValue(endValue);
        return this;
    }

    /**
     * <B>ICONCLS</B>&nbsp;图标样式
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_ICONCLS = "iconcls";

    /**
     * 设置 图标样式
     * 
     * @param iconCls
     * 
     */
    @JsonProperty(FIELD_ICONCLS)
    public void setIconCls(String iconCls){
        this.set(FIELD_ICONCLS, iconCls);
    }
    
    /**
     * 获取 图标样式  
     * @return
     */
    @JsonIgnore
    public String getIconCls(){
        Object objValue = this.get(FIELD_ICONCLS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 图标样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIconClsDirty(){
        if(this.contains(FIELD_ICONCLS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图标样式
     */
    @JsonIgnore
    public void resetIconCls(){
        this.reset(FIELD_ICONCLS);
    }

    /**
     * 设置 图标样式
     * <P>
     * 等同 {@link #setIconCls}
     * @param iconCls
     */
    @JsonIgnore
    public PSCodeItemDTO iconcls(String iconCls){
        this.setIconCls(iconCls);
        return this;
    }

    /**
     * <B>INCBEGINVALUE</B>&nbsp;包含开始值
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_INCBEGINVALUE = "incbeginvalue";

    /**
     * 设置 包含开始值
     * 
     * @param incBeginValue
     * 
     */
    @JsonProperty(FIELD_INCBEGINVALUE)
    public void setIncBeginValue(Integer incBeginValue){
        this.set(FIELD_INCBEGINVALUE, incBeginValue);
    }
    
    /**
     * 获取 包含开始值  
     * @return
     */
    @JsonIgnore
    public Integer getIncBeginValue(){
        Object objValue = this.get(FIELD_INCBEGINVALUE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 包含开始值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIncBeginValueDirty(){
        if(this.contains(FIELD_INCBEGINVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 包含开始值
     */
    @JsonIgnore
    public void resetIncBeginValue(){
        this.reset(FIELD_INCBEGINVALUE);
    }

    /**
     * 设置 包含开始值
     * <P>
     * 等同 {@link #setIncBeginValue}
     * @param incBeginValue
     */
    @JsonIgnore
    public PSCodeItemDTO incbeginvalue(Integer incBeginValue){
        this.setIncBeginValue(incBeginValue);
        return this;
    }

     /**
     * 设置 包含开始值
     * <P>
     * 等同 {@link #setIncBeginValue}
     * @param incBeginValue
     */
    @JsonIgnore
    public PSCodeItemDTO incbeginvalue(Boolean incBeginValue){
        if(incBeginValue == null){
            this.setIncBeginValue(null);
        }
        else{
            this.setIncBeginValue(incBeginValue?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>INCENDVALUE</B>&nbsp;包含结束值
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_INCENDVALUE = "incendvalue";

    /**
     * 设置 包含结束值
     * 
     * @param incEndValue
     * 
     */
    @JsonProperty(FIELD_INCENDVALUE)
    public void setIncEndValue(Integer incEndValue){
        this.set(FIELD_INCENDVALUE, incEndValue);
    }
    
    /**
     * 获取 包含结束值  
     * @return
     */
    @JsonIgnore
    public Integer getIncEndValue(){
        Object objValue = this.get(FIELD_INCENDVALUE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 包含结束值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIncEndValueDirty(){
        if(this.contains(FIELD_INCENDVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 包含结束值
     */
    @JsonIgnore
    public void resetIncEndValue(){
        this.reset(FIELD_INCENDVALUE);
    }

    /**
     * 设置 包含结束值
     * <P>
     * 等同 {@link #setIncEndValue}
     * @param incEndValue
     */
    @JsonIgnore
    public PSCodeItemDTO incendvalue(Integer incEndValue){
        this.setIncEndValue(incEndValue);
        return this;
    }

     /**
     * 设置 包含结束值
     * <P>
     * 等同 {@link #setIncEndValue}
     * @param incEndValue
     */
    @JsonIgnore
    public PSCodeItemDTO incendvalue(Boolean incEndValue){
        if(incEndValue == null){
            this.setIncEndValue(null);
        }
        else{
            this.setIncEndValue(incEndValue?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSCodeItemDTO memo(String memo){
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
    public PSCodeItemDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PPSCODEITEMID</B>&nbsp;父代码项
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSCodeItemDTO} 
     */
    public final static String FIELD_PPSCODEITEMID = "ppscodeitemid";

    /**
     * 设置 父代码项
     * 
     * @param pPSCodeItemId
     * 
     */
    @JsonProperty(FIELD_PPSCODEITEMID)
    public void setPPSCodeItemId(String pPSCodeItemId){
        this.set(FIELD_PPSCODEITEMID, pPSCodeItemId);
    }
    
    /**
     * 获取 父代码项  
     * @return
     */
    @JsonIgnore
    public String getPPSCodeItemId(){
        Object objValue = this.get(FIELD_PPSCODEITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父代码项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSCodeItemIdDirty(){
        if(this.contains(FIELD_PPSCODEITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父代码项
     */
    @JsonIgnore
    public void resetPPSCodeItemId(){
        this.reset(FIELD_PPSCODEITEMID);
    }

    /**
     * 设置 父代码项
     * <P>
     * 等同 {@link #setPPSCodeItemId}
     * @param pPSCodeItemId
     */
    @JsonIgnore
    public PSCodeItemDTO ppscodeitemid(String pPSCodeItemId){
        this.setPPSCodeItemId(pPSCodeItemId);
        return this;
    }

    /**
     * 设置 父代码项，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPPSCodeItemId}
     * @param pSCodeItem 引用对象
     */
    @JsonIgnore
    public PSCodeItemDTO ppscodeitemid(PSCodeItemDTO pSCodeItem){
        if(pSCodeItem == null){
            this.setPPSCodeItemId(null);
            this.setPPSCodeItemName(null);
        }
        else{
            this.setPPSCodeItemId(pSCodeItem.getPSCodeItemId());
            this.setPPSCodeItemName(pSCodeItem.getPSCodeItemName());
        }
        return this;
    }

    /**
     * <B>PPSCODEITEMNAME</B>&nbsp;父代码项
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PPSCODEITEMID}
     */
    public final static String FIELD_PPSCODEITEMNAME = "ppscodeitemname";

    /**
     * 设置 父代码项
     * 
     * @param pPSCodeItemName
     * 
     */
    @JsonProperty(FIELD_PPSCODEITEMNAME)
    public void setPPSCodeItemName(String pPSCodeItemName){
        this.set(FIELD_PPSCODEITEMNAME, pPSCodeItemName);
    }
    
    /**
     * 获取 父代码项  
     * @return
     */
    @JsonIgnore
    public String getPPSCodeItemName(){
        Object objValue = this.get(FIELD_PPSCODEITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父代码项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSCodeItemNameDirty(){
        if(this.contains(FIELD_PPSCODEITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父代码项
     */
    @JsonIgnore
    public void resetPPSCodeItemName(){
        this.reset(FIELD_PPSCODEITEMNAME);
    }

    /**
     * 设置 父代码项
     * <P>
     * 等同 {@link #setPPSCodeItemName}
     * @param pPSCodeItemName
     */
    @JsonIgnore
    public PSCodeItemDTO ppscodeitemname(String pPSCodeItemName){
        this.setPPSCodeItemName(pPSCodeItemName);
        return this;
    }

    /**
     * <B>PSCODEITEMID</B>&nbsp;系统代码表项标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSCODEITEMID = "pscodeitemid";

    /**
     * 设置 系统代码表项标识
     * 
     * @param pSCodeItemId
     * 
     */
    @JsonProperty(FIELD_PSCODEITEMID)
    public void setPSCodeItemId(String pSCodeItemId){
        this.set(FIELD_PSCODEITEMID, pSCodeItemId);
    }
    
    /**
     * 获取 系统代码表项标识  
     * @return
     */
    @JsonIgnore
    public String getPSCodeItemId(){
        Object objValue = this.get(FIELD_PSCODEITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统代码表项标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCodeItemIdDirty(){
        if(this.contains(FIELD_PSCODEITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统代码表项标识
     */
    @JsonIgnore
    public void resetPSCodeItemId(){
        this.reset(FIELD_PSCODEITEMID);
    }

    /**
     * 设置 系统代码表项标识
     * <P>
     * 等同 {@link #setPSCodeItemId}
     * @param pSCodeItemId
     */
    @JsonIgnore
    public PSCodeItemDTO pscodeitemid(String pSCodeItemId){
        this.setPSCodeItemId(pSCodeItemId);
        return this;
    }

    /**
     * <B>PSCODEITEMNAME</B>&nbsp;代码项标题
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSCODEITEMNAME = "pscodeitemname";

    /**
     * 设置 代码项标题
     * 
     * @param pSCodeItemName
     * 
     */
    @JsonProperty(FIELD_PSCODEITEMNAME)
    public void setPSCodeItemName(String pSCodeItemName){
        this.set(FIELD_PSCODEITEMNAME, pSCodeItemName);
    }
    
    /**
     * 获取 代码项标题  
     * @return
     */
    @JsonIgnore
    public String getPSCodeItemName(){
        Object objValue = this.get(FIELD_PSCODEITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码项标题 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCodeItemNameDirty(){
        if(this.contains(FIELD_PSCODEITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码项标题
     */
    @JsonIgnore
    public void resetPSCodeItemName(){
        this.reset(FIELD_PSCODEITEMNAME);
    }

    /**
     * 设置 代码项标题
     * <P>
     * 等同 {@link #setPSCodeItemName}
     * @param pSCodeItemName
     */
    @JsonIgnore
    public PSCodeItemDTO pscodeitemname(String pSCodeItemName){
        this.setPSCodeItemName(pSCodeItemName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSCodeItemName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSCodeItemName(strName);
    }

    @JsonIgnore
    public PSCodeItemDTO name(String strName){
        this.setPSCodeItemName(strName);
        return this;
    }

    /**
     * <B>PSCODELISTID</B>&nbsp;系统代码表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSCodeListDTO} 
     */
    public final static String FIELD_PSCODELISTID = "pscodelistid";

    /**
     * 设置 系统代码表
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
     * 设置 系统代码表
     * <P>
     * 等同 {@link #setPSCodeListId}
     * @param pSCodeListId
     */
    @JsonIgnore
    public PSCodeItemDTO pscodelistid(String pSCodeListId){
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
    public PSCodeItemDTO pscodelistid(PSCodeListDTO pSCodeList){
        if(pSCodeList == null){
            this.setPSCodeListId(null);
            this.setPSCodeListName(null);
            this.setThresholdGroupFlag(null);
        }
        else{
            this.setPSCodeListId(pSCodeList.getPSCodeListId());
            this.setPSCodeListName(pSCodeList.getPSCodeListName());
            this.setThresholdGroupFlag(pSCodeList.getThresholdGroupFlag());
        }
        return this;
    }

    /**
     * <B>PSCODELISTNAME</B>&nbsp;系统代码表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCODELISTID}
     */
    public final static String FIELD_PSCODELISTNAME = "pscodelistname";

    /**
     * 设置 系统代码表
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
     * 设置 系统代码表
     * <P>
     * 等同 {@link #setPSCodeListName}
     * @param pSCodeListName
     */
    @JsonIgnore
    public PSCodeItemDTO pscodelistname(String pSCodeListName){
        this.setPSCodeListName(pSCodeListName);
        return this;
    }

    /**
     * <B>PSSYSCSSID</B>&nbsp;文本显示样式
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysCssDTO} 
     */
    public final static String FIELD_PSSYSCSSID = "pssyscssid";

    /**
     * 设置 文本显示样式
     * 
     * @param pSSysCssId
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSID)
    public void setPSSysCssId(String pSSysCssId){
        this.set(FIELD_PSSYSCSSID, pSSysCssId);
    }
    
    /**
     * 获取 文本显示样式  
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
     * 判断 文本显示样式 是否指定值，包括空值
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
     * 重置 文本显示样式
     */
    @JsonIgnore
    public void resetPSSysCssId(){
        this.reset(FIELD_PSSYSCSSID);
    }

    /**
     * 设置 文本显示样式
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCssId
     */
    @JsonIgnore
    public PSCodeItemDTO pssyscssid(String pSSysCssId){
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    /**
     * 设置 文本显示样式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSCodeItemDTO pssyscssid(PSSysCssDTO pSSysCss){
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
     * <B>PSSYSCSSNAME</B>&nbsp;界面样式表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSCSSID}
     */
    public final static String FIELD_PSSYSCSSNAME = "pssyscssname";

    /**
     * 设置 界面样式表
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
     * 设置 界面样式表
     * <P>
     * 等同 {@link #setPSSysCssName}
     * @param pSSysCssName
     */
    @JsonIgnore
    public PSCodeItemDTO pssyscssname(String pSSysCssName){
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    /**
     * <B>PSSYSIMAGEID</B>&nbsp;显示图标
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysImageDTO} 
     */
    public final static String FIELD_PSSYSIMAGEID = "pssysimageid";

    /**
     * 设置 显示图标
     * 
     * @param pSSysImageId
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGEID)
    public void setPSSysImageId(String pSSysImageId){
        this.set(FIELD_PSSYSIMAGEID, pSSysImageId);
    }
    
    /**
     * 获取 显示图标  
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
     * 判断 显示图标 是否指定值，包括空值
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
     * 重置 显示图标
     */
    @JsonIgnore
    public void resetPSSysImageId(){
        this.reset(FIELD_PSSYSIMAGEID);
    }

    /**
     * 设置 显示图标
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImageId
     */
    @JsonIgnore
    public PSCodeItemDTO pssysimageid(String pSSysImageId){
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    /**
     * 设置 显示图标，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImage 引用对象
     */
    @JsonIgnore
    public PSCodeItemDTO pssysimageid(PSSysImageDTO pSSysImage){
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
     * <B>PSSYSIMAGENAME</B>&nbsp;显示图标
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSIMAGEID}
     */
    public final static String FIELD_PSSYSIMAGENAME = "pssysimagename";

    /**
     * 设置 显示图标
     * 
     * @param pSSysImageName
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGENAME)
    public void setPSSysImageName(String pSSysImageName){
        this.set(FIELD_PSSYSIMAGENAME, pSSysImageName);
    }
    
    /**
     * 获取 显示图标  
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
     * 判断 显示图标 是否指定值，包括空值
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
     * 重置 显示图标
     */
    @JsonIgnore
    public void resetPSSysImageName(){
        this.reset(FIELD_PSSYSIMAGENAME);
    }

    /**
     * 设置 显示图标
     * <P>
     * 等同 {@link #setPSSysImageName}
     * @param pSSysImageName
     */
    @JsonIgnore
    public PSCodeItemDTO pssysimagename(String pSSysImageName){
        this.setPSSysImageName(pSSysImageName);
        return this;
    }

    /**
     * <B>SHORTKEY</B>&nbsp;快捷输入
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_SHORTKEY = "shortkey";

    /**
     * 设置 快捷输入
     * 
     * @param shortKey
     * 
     */
    @JsonProperty(FIELD_SHORTKEY)
    public void setShortKey(String shortKey){
        this.set(FIELD_SHORTKEY, shortKey);
    }
    
    /**
     * 获取 快捷输入  
     * @return
     */
    @JsonIgnore
    public String getShortKey(){
        Object objValue = this.get(FIELD_SHORTKEY);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 快捷输入 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isShortKeyDirty(){
        if(this.contains(FIELD_SHORTKEY)){
            return true;
        }
        return false;
    }

    /**
     * 重置 快捷输入
     */
    @JsonIgnore
    public void resetShortKey(){
        this.reset(FIELD_SHORTKEY);
    }

    /**
     * 设置 快捷输入
     * <P>
     * 等同 {@link #setShortKey}
     * @param shortKey
     */
    @JsonIgnore
    public PSCodeItemDTO shortkey(String shortKey){
        this.setShortKey(shortKey);
        return this;
    }

    /**
     * <B>SHOWASEMPTY</B>&nbsp;作为无值显示内容
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_SHOWASEMPTY = "showasempty";

    /**
     * 设置 作为无值显示内容
     * 
     * @param showAsEmpty
     * 
     */
    @JsonProperty(FIELD_SHOWASEMPTY)
    public void setShowAsEmpty(Integer showAsEmpty){
        this.set(FIELD_SHOWASEMPTY, showAsEmpty);
    }
    
    /**
     * 获取 作为无值显示内容  
     * @return
     */
    @JsonIgnore
    public Integer getShowAsEmpty(){
        Object objValue = this.get(FIELD_SHOWASEMPTY);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 作为无值显示内容 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isShowAsEmptyDirty(){
        if(this.contains(FIELD_SHOWASEMPTY)){
            return true;
        }
        return false;
    }

    /**
     * 重置 作为无值显示内容
     */
    @JsonIgnore
    public void resetShowAsEmpty(){
        this.reset(FIELD_SHOWASEMPTY);
    }

    /**
     * 设置 作为无值显示内容
     * <P>
     * 等同 {@link #setShowAsEmpty}
     * @param showAsEmpty
     */
    @JsonIgnore
    public PSCodeItemDTO showasempty(Integer showAsEmpty){
        this.setShowAsEmpty(showAsEmpty);
        return this;
    }

     /**
     * 设置 作为无值显示内容
     * <P>
     * 等同 {@link #setShowAsEmpty}
     * @param showAsEmpty
     */
    @JsonIgnore
    public PSCodeItemDTO showasempty(Boolean showAsEmpty){
        if(showAsEmpty == null){
            this.setShowAsEmpty(null);
        }
        else{
            this.setShowAsEmpty(showAsEmpty?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>TEXTPSLANRESID</B>&nbsp;标题语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSLanguageResDTO} 
     */
    public final static String FIELD_TEXTPSLANRESID = "textpslanresid";

    /**
     * 设置 标题语言资源
     * 
     * @param textPSLanResId
     * 
     */
    @JsonProperty(FIELD_TEXTPSLANRESID)
    public void setTextPSLanResId(String textPSLanResId){
        this.set(FIELD_TEXTPSLANRESID, textPSLanResId);
    }
    
    /**
     * 获取 标题语言资源  
     * @return
     */
    @JsonIgnore
    public String getTextPSLanResId(){
        Object objValue = this.get(FIELD_TEXTPSLANRESID);
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
    public boolean isTextPSLanResIdDirty(){
        if(this.contains(FIELD_TEXTPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题语言资源
     */
    @JsonIgnore
    public void resetTextPSLanResId(){
        this.reset(FIELD_TEXTPSLANRESID);
    }

    /**
     * 设置 标题语言资源
     * <P>
     * 等同 {@link #setTextPSLanResId}
     * @param textPSLanResId
     */
    @JsonIgnore
    public PSCodeItemDTO textpslanresid(String textPSLanResId){
        this.setTextPSLanResId(textPSLanResId);
        return this;
    }

    /**
     * 设置 标题语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTextPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSCodeItemDTO textpslanresid(PSLanguageResDTO pSLanguageRes){
        if(pSLanguageRes == null){
            this.setTextPSLanResId(null);
            this.setTextPSLanResName(null);
        }
        else{
            this.setTextPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setTextPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>TEXTPSLANRESNAME</B>&nbsp;标题语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TEXTPSLANRESID}
     */
    public final static String FIELD_TEXTPSLANRESNAME = "textpslanresname";

    /**
     * 设置 标题语言资源
     * 
     * @param textPSLanResName
     * 
     */
    @JsonProperty(FIELD_TEXTPSLANRESNAME)
    public void setTextPSLanResName(String textPSLanResName){
        this.set(FIELD_TEXTPSLANRESNAME, textPSLanResName);
    }
    
    /**
     * 获取 标题语言资源  
     * @return
     */
    @JsonIgnore
    public String getTextPSLanResName(){
        Object objValue = this.get(FIELD_TEXTPSLANRESNAME);
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
    public boolean isTextPSLanResNameDirty(){
        if(this.contains(FIELD_TEXTPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题语言资源
     */
    @JsonIgnore
    public void resetTextPSLanResName(){
        this.reset(FIELD_TEXTPSLANRESNAME);
    }

    /**
     * 设置 标题语言资源
     * <P>
     * 等同 {@link #setTextPSLanResName}
     * @param textPSLanResName
     */
    @JsonIgnore
    public PSCodeItemDTO textpslanresname(String textPSLanResName){
        this.setTextPSLanResName(textPSLanResName);
        return this;
    }

    /**
     * <B>THRESHOLDGROUPFLAG</B>&nbsp;THRESHOLDGROUPFLAG
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCODELISTID}
     */
    public final static String FIELD_THRESHOLDGROUPFLAG = "thresholdgroupflag";

    /**
     * 设置 THRESHOLDGROUPFLAG
     * 
     * @param thresholdGroupFlag
     * 
     */
    @JsonProperty(FIELD_THRESHOLDGROUPFLAG)
    public void setThresholdGroupFlag(Integer thresholdGroupFlag){
        this.set(FIELD_THRESHOLDGROUPFLAG, thresholdGroupFlag);
    }
    
    /**
     * 获取 THRESHOLDGROUPFLAG  
     * @return
     */
    @JsonIgnore
    public Integer getThresholdGroupFlag(){
        Object objValue = this.get(FIELD_THRESHOLDGROUPFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 THRESHOLDGROUPFLAG 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isThresholdGroupFlagDirty(){
        if(this.contains(FIELD_THRESHOLDGROUPFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 THRESHOLDGROUPFLAG
     */
    @JsonIgnore
    public void resetThresholdGroupFlag(){
        this.reset(FIELD_THRESHOLDGROUPFLAG);
    }

    /**
     * 设置 THRESHOLDGROUPFLAG
     * <P>
     * 等同 {@link #setThresholdGroupFlag}
     * @param thresholdGroupFlag
     */
    @JsonIgnore
    public PSCodeItemDTO thresholdgroupflag(Integer thresholdGroupFlag){
        this.setThresholdGroupFlag(thresholdGroupFlag);
        return this;
    }

    /**
     * <B>TIPPSLANRESID</B>&nbsp;提示语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSLanguageResDTO} 
     */
    public final static String FIELD_TIPPSLANRESID = "tippslanresid";

    /**
     * 设置 提示语言资源
     * 
     * @param tipPSLanResId
     * 
     */
    @JsonProperty(FIELD_TIPPSLANRESID)
    public void setTipPSLanResId(String tipPSLanResId){
        this.set(FIELD_TIPPSLANRESID, tipPSLanResId);
    }
    
    /**
     * 获取 提示语言资源  
     * @return
     */
    @JsonIgnore
    public String getTipPSLanResId(){
        Object objValue = this.get(FIELD_TIPPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 提示语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTipPSLanResIdDirty(){
        if(this.contains(FIELD_TIPPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 提示语言资源
     */
    @JsonIgnore
    public void resetTipPSLanResId(){
        this.reset(FIELD_TIPPSLANRESID);
    }

    /**
     * 设置 提示语言资源
     * <P>
     * 等同 {@link #setTipPSLanResId}
     * @param tipPSLanResId
     */
    @JsonIgnore
    public PSCodeItemDTO tippslanresid(String tipPSLanResId){
        this.setTipPSLanResId(tipPSLanResId);
        return this;
    }

    /**
     * 设置 提示语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTipPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSCodeItemDTO tippslanresid(PSLanguageResDTO pSLanguageRes){
        if(pSLanguageRes == null){
            this.setTipPSLanResId(null);
            this.setTipPSLanResName(null);
        }
        else{
            this.setTipPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setTipPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>TIPPSLANRESNAME</B>&nbsp;提示语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TIPPSLANRESID}
     */
    public final static String FIELD_TIPPSLANRESNAME = "tippslanresname";

    /**
     * 设置 提示语言资源
     * 
     * @param tipPSLanResName
     * 
     */
    @JsonProperty(FIELD_TIPPSLANRESNAME)
    public void setTipPSLanResName(String tipPSLanResName){
        this.set(FIELD_TIPPSLANRESNAME, tipPSLanResName);
    }
    
    /**
     * 获取 提示语言资源  
     * @return
     */
    @JsonIgnore
    public String getTipPSLanResName(){
        Object objValue = this.get(FIELD_TIPPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 提示语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTipPSLanResNameDirty(){
        if(this.contains(FIELD_TIPPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 提示语言资源
     */
    @JsonIgnore
    public void resetTipPSLanResName(){
        this.reset(FIELD_TIPPSLANRESNAME);
    }

    /**
     * 设置 提示语言资源
     * <P>
     * 等同 {@link #setTipPSLanResName}
     * @param tipPSLanResName
     */
    @JsonIgnore
    public PSCodeItemDTO tippslanresname(String tipPSLanResName){
        this.setTipPSLanResName(tipPSLanResName);
        return this;
    }

    /**
     * <B>TOOLTIPINFO</B>&nbsp;提示信息
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_TOOLTIPINFO = "tooltipinfo";

    /**
     * 设置 提示信息
     * 
     * @param tooltipInfo
     * 
     */
    @JsonProperty(FIELD_TOOLTIPINFO)
    public void setTooltipInfo(String tooltipInfo){
        this.set(FIELD_TOOLTIPINFO, tooltipInfo);
    }
    
    /**
     * 获取 提示信息  
     * @return
     */
    @JsonIgnore
    public String getTooltipInfo(){
        Object objValue = this.get(FIELD_TOOLTIPINFO);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 提示信息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTooltipInfoDirty(){
        if(this.contains(FIELD_TOOLTIPINFO)){
            return true;
        }
        return false;
    }

    /**
     * 重置 提示信息
     */
    @JsonIgnore
    public void resetTooltipInfo(){
        this.reset(FIELD_TOOLTIPINFO);
    }

    /**
     * 设置 提示信息
     * <P>
     * 等同 {@link #setTooltipInfo}
     * @param tooltipInfo
     */
    @JsonIgnore
    public PSCodeItemDTO tooltipinfo(String tooltipInfo){
        this.setTooltipInfo(tooltipInfo);
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
    public PSCodeItemDTO updatedate(Timestamp updateDate){
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
    public PSCodeItemDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
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
    public PSCodeItemDTO usercat(String userCat){
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
    public PSCodeItemDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat.value);
        }
        return this;
    }

    /**
     * <B>USERDATA</B>&nbsp;代码项标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_USERDATA = "userdata";

    /**
     * 设置 代码项标记
     * 
     * @param userData
     * 
     */
    @JsonProperty(FIELD_USERDATA)
    public void setUserData(String userData){
        this.set(FIELD_USERDATA, userData);
    }
    
    /**
     * 获取 代码项标记  
     * @return
     */
    @JsonIgnore
    public String getUserData(){
        Object objValue = this.get(FIELD_USERDATA);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码项标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserDataDirty(){
        if(this.contains(FIELD_USERDATA)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码项标记
     */
    @JsonIgnore
    public void resetUserData(){
        this.reset(FIELD_USERDATA);
    }

    /**
     * 设置 代码项标记
     * <P>
     * 等同 {@link #setUserData}
     * @param userData
     */
    @JsonIgnore
    public PSCodeItemDTO userdata(String userData){
        this.setUserData(userData);
        return this;
    }

    /**
     * <B>USERDATA2</B>&nbsp;代码项标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_USERDATA2 = "userdata2";

    /**
     * 设置 代码项标记2
     * 
     * @param userData2
     * 
     */
    @JsonProperty(FIELD_USERDATA2)
    public void setUserData2(String userData2){
        this.set(FIELD_USERDATA2, userData2);
    }
    
    /**
     * 获取 代码项标记2  
     * @return
     */
    @JsonIgnore
    public String getUserData2(){
        Object objValue = this.get(FIELD_USERDATA2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码项标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserData2Dirty(){
        if(this.contains(FIELD_USERDATA2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码项标记2
     */
    @JsonIgnore
    public void resetUserData2(){
        this.reset(FIELD_USERDATA2);
    }

    /**
     * 设置 代码项标记2
     * <P>
     * 等同 {@link #setUserData2}
     * @param userData2
     */
    @JsonIgnore
    public PSCodeItemDTO userdata2(String userData2){
        this.setUserData2(userData2);
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
    public PSCodeItemDTO userparams(String userParams){
        this.setUserParams(userParams);
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
    public PSCodeItemDTO usertag(String userTag){
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
    public PSCodeItemDTO usertag2(String userTag2){
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
    public PSCodeItemDTO usertag3(String userTag3){
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
    public PSCodeItemDTO usertag4(String userTag4){
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
    public PSCodeItemDTO validflag(Integer validFlag){
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
    public PSCodeItemDTO validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSCodeItemId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSCodeItemId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSCodeItemId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSCodeItemId(strValue);
    }

    @JsonIgnore
    public PSCodeItemDTO id(String strValue){
        this.setPSCodeItemId(strValue);
        return this;
    }


    /**
     *  系统代码表项 成员集合
     */
    public final static String FIELD_PSCODEITEMS = "pscodeitems";

    private java.util.List<net.ibizsys.centralstudio.dto.PSCodeItemDTO> pscodeitems;

    /**
     * 获取 系统代码表项 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSCODEITEMS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSCodeItemDTO> getPSCodeItems(){
        return this.pscodeitems;
    }

    /**
     * 设置 系统代码表项 成员集合  
     * @param pscodeitems
     */
    @JsonProperty(FIELD_PSCODEITEMS)
    public void setPSCodeItems(java.util.List<net.ibizsys.centralstudio.dto.PSCodeItemDTO> pscodeitems){
        this.pscodeitems = pscodeitems;
    }

    /**
     * 获取 系统代码表项 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSCodeItemDTO> getPSCodeItemsIf(){
        if(this.pscodeitems == null){
            this.pscodeitems = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSCodeItemDTO>();          
        }
        return this.pscodeitems;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSCodeItemDTO){
            PSCodeItemDTO dto = (PSCodeItemDTO)iEntity;
            dto.setPSCodeItems(this.getPSCodeItems());
        }
        super.copyTo(iEntity);
    }
}
