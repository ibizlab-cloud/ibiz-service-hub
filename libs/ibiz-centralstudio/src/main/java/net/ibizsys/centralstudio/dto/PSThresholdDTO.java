package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSTHRESHOLD</B>阈值项 模型传输对象
 * <P>
 * 
 */
public class PSThresholdDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSThresholdDTO(){
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
    public PSThresholdDTO beginvalue(BigDecimal beginValue){
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
    public PSThresholdDTO bkcolor(String bKColor){
        this.setBKColor(bKColor);
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
    public PSThresholdDTO codename(String codeName){
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
    public PSThresholdDTO color(String color){
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
    public PSThresholdDTO createdate(Timestamp createDate){
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
    public PSThresholdDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DATA</B>&nbsp;阈值项数据
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_DATA = "data";

    /**
     * 设置 阈值项数据
     * 
     * @param data
     * 
     */
    @JsonProperty(FIELD_DATA)
    public void setData(String data){
        this.set(FIELD_DATA, data);
    }
    
    /**
     * 获取 阈值项数据  
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
     * 判断 阈值项数据 是否指定值，包括空值
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
     * 重置 阈值项数据
     */
    @JsonIgnore
    public void resetData(){
        this.reset(FIELD_DATA);
    }

    /**
     * 设置 阈值项数据
     * <P>
     * 等同 {@link #setData}
     * @param data
     */
    @JsonIgnore
    public PSThresholdDTO data(String data){
        this.setData(data);
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
    public PSThresholdDTO endvalue(BigDecimal endValue){
        this.setEndValue(endValue);
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
    public PSThresholdDTO incbeginvalue(Integer incBeginValue){
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
    public PSThresholdDTO incbeginvalue(Boolean incBeginValue){
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
    public PSThresholdDTO incendvalue(Integer incEndValue){
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
    public PSThresholdDTO incendvalue(Boolean incEndValue){
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
    public PSThresholdDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSSYSCSSID</B>&nbsp;界面样式表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysCssDTO} 
     */
    public final static String FIELD_PSSYSCSSID = "pssyscssid";

    /**
     * 设置 界面样式表
     * 
     * @param pSSysCssId
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSID)
    public void setPSSysCssId(String pSSysCssId){
        this.set(FIELD_PSSYSCSSID, pSSysCssId);
    }
    
    /**
     * 获取 界面样式表  
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
     * 判断 界面样式表 是否指定值，包括空值
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
     * 重置 界面样式表
     */
    @JsonIgnore
    public void resetPSSysCssId(){
        this.reset(FIELD_PSSYSCSSID);
    }

    /**
     * 设置 界面样式表
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCssId
     */
    @JsonIgnore
    public PSThresholdDTO pssyscssid(String pSSysCssId){
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    /**
     * 设置 界面样式表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSThresholdDTO pssyscssid(PSSysCssDTO pSSysCss){
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
    public PSThresholdDTO pssyscssname(String pSSysCssName){
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    /**
     * <B>PSSYSIMAGEID</B>&nbsp;阈值项图片
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysImageDTO} 
     */
    public final static String FIELD_PSSYSIMAGEID = "pssysimageid";

    /**
     * 设置 阈值项图片
     * 
     * @param pSSysImageId
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGEID)
    public void setPSSysImageId(String pSSysImageId){
        this.set(FIELD_PSSYSIMAGEID, pSSysImageId);
    }
    
    /**
     * 获取 阈值项图片  
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
     * 判断 阈值项图片 是否指定值，包括空值
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
     * 重置 阈值项图片
     */
    @JsonIgnore
    public void resetPSSysImageId(){
        this.reset(FIELD_PSSYSIMAGEID);
    }

    /**
     * 设置 阈值项图片
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImageId
     */
    @JsonIgnore
    public PSThresholdDTO pssysimageid(String pSSysImageId){
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    /**
     * 设置 阈值项图片，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImage 引用对象
     */
    @JsonIgnore
    public PSThresholdDTO pssysimageid(PSSysImageDTO pSSysImage){
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
     * <B>PSSYSIMAGENAME</B>&nbsp;阈值项图片
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSIMAGEID}
     */
    public final static String FIELD_PSSYSIMAGENAME = "pssysimagename";

    /**
     * 设置 阈值项图片
     * 
     * @param pSSysImageName
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGENAME)
    public void setPSSysImageName(String pSSysImageName){
        this.set(FIELD_PSSYSIMAGENAME, pSSysImageName);
    }
    
    /**
     * 获取 阈值项图片  
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
     * 判断 阈值项图片 是否指定值，包括空值
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
     * 重置 阈值项图片
     */
    @JsonIgnore
    public void resetPSSysImageName(){
        this.reset(FIELD_PSSYSIMAGENAME);
    }

    /**
     * 设置 阈值项图片
     * <P>
     * 等同 {@link #setPSSysImageName}
     * @param pSSysImageName
     */
    @JsonIgnore
    public PSThresholdDTO pssysimagename(String pSSysImageName){
        this.setPSSysImageName(pSSysImageName);
        return this;
    }

    /**
     * <B>PSTHRESHOLDGROUPID</B>&nbsp;阈值组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSThresholdGroupDTO} 
     */
    public final static String FIELD_PSTHRESHOLDGROUPID = "psthresholdgroupid";

    /**
     * 设置 阈值组
     * 
     * @param pSThresholdGroupId
     * 
     */
    @JsonProperty(FIELD_PSTHRESHOLDGROUPID)
    public void setPSThresholdGroupId(String pSThresholdGroupId){
        this.set(FIELD_PSTHRESHOLDGROUPID, pSThresholdGroupId);
    }
    
    /**
     * 获取 阈值组  
     * @return
     */
    @JsonIgnore
    public String getPSThresholdGroupId(){
        Object objValue = this.get(FIELD_PSTHRESHOLDGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 阈值组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSThresholdGroupIdDirty(){
        if(this.contains(FIELD_PSTHRESHOLDGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 阈值组
     */
    @JsonIgnore
    public void resetPSThresholdGroupId(){
        this.reset(FIELD_PSTHRESHOLDGROUPID);
    }

    /**
     * 设置 阈值组
     * <P>
     * 等同 {@link #setPSThresholdGroupId}
     * @param pSThresholdGroupId
     */
    @JsonIgnore
    public PSThresholdDTO psthresholdgroupid(String pSThresholdGroupId){
        this.setPSThresholdGroupId(pSThresholdGroupId);
        return this;
    }

    /**
     * 设置 阈值组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSThresholdGroupId}
     * @param pSThresholdGroup 引用对象
     */
    @JsonIgnore
    public PSThresholdDTO psthresholdgroupid(PSThresholdGroupDTO pSThresholdGroup){
        if(pSThresholdGroup == null){
            this.setPSThresholdGroupId(null);
            this.setPSThresholdGroupName(null);
        }
        else{
            this.setPSThresholdGroupId(pSThresholdGroup.getPSThresholdGroupId());
            this.setPSThresholdGroupName(pSThresholdGroup.getPSThresholdGroupName());
        }
        return this;
    }

    /**
     * <B>PSTHRESHOLDGROUPNAME</B>&nbsp;阈值组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSTHRESHOLDGROUPID}
     */
    public final static String FIELD_PSTHRESHOLDGROUPNAME = "psthresholdgroupname";

    /**
     * 设置 阈值组
     * 
     * @param pSThresholdGroupName
     * 
     */
    @JsonProperty(FIELD_PSTHRESHOLDGROUPNAME)
    public void setPSThresholdGroupName(String pSThresholdGroupName){
        this.set(FIELD_PSTHRESHOLDGROUPNAME, pSThresholdGroupName);
    }
    
    /**
     * 获取 阈值组  
     * @return
     */
    @JsonIgnore
    public String getPSThresholdGroupName(){
        Object objValue = this.get(FIELD_PSTHRESHOLDGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 阈值组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSThresholdGroupNameDirty(){
        if(this.contains(FIELD_PSTHRESHOLDGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 阈值组
     */
    @JsonIgnore
    public void resetPSThresholdGroupName(){
        this.reset(FIELD_PSTHRESHOLDGROUPNAME);
    }

    /**
     * 设置 阈值组
     * <P>
     * 等同 {@link #setPSThresholdGroupName}
     * @param pSThresholdGroupName
     */
    @JsonIgnore
    public PSThresholdDTO psthresholdgroupname(String pSThresholdGroupName){
        this.setPSThresholdGroupName(pSThresholdGroupName);
        return this;
    }

    /**
     * <B>PSTHRESHOLDID</B>&nbsp;阈值项标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSTHRESHOLDID = "psthresholdid";

    /**
     * 设置 阈值项标识
     * 
     * @param pSThresholdId
     * 
     */
    @JsonProperty(FIELD_PSTHRESHOLDID)
    public void setPSThresholdId(String pSThresholdId){
        this.set(FIELD_PSTHRESHOLDID, pSThresholdId);
    }
    
    /**
     * 获取 阈值项标识  
     * @return
     */
    @JsonIgnore
    public String getPSThresholdId(){
        Object objValue = this.get(FIELD_PSTHRESHOLDID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 阈值项标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSThresholdIdDirty(){
        if(this.contains(FIELD_PSTHRESHOLDID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 阈值项标识
     */
    @JsonIgnore
    public void resetPSThresholdId(){
        this.reset(FIELD_PSTHRESHOLDID);
    }

    /**
     * 设置 阈值项标识
     * <P>
     * 等同 {@link #setPSThresholdId}
     * @param pSThresholdId
     */
    @JsonIgnore
    public PSThresholdDTO psthresholdid(String pSThresholdId){
        this.setPSThresholdId(pSThresholdId);
        return this;
    }

    /**
     * <B>PSTHRESHOLDNAME</B>&nbsp;阈值项名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSTHRESHOLDNAME = "psthresholdname";

    /**
     * 设置 阈值项名称
     * 
     * @param pSThresholdName
     * 
     */
    @JsonProperty(FIELD_PSTHRESHOLDNAME)
    public void setPSThresholdName(String pSThresholdName){
        this.set(FIELD_PSTHRESHOLDNAME, pSThresholdName);
    }
    
    /**
     * 获取 阈值项名称  
     * @return
     */
    @JsonIgnore
    public String getPSThresholdName(){
        Object objValue = this.get(FIELD_PSTHRESHOLDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 阈值项名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSThresholdNameDirty(){
        if(this.contains(FIELD_PSTHRESHOLDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 阈值项名称
     */
    @JsonIgnore
    public void resetPSThresholdName(){
        this.reset(FIELD_PSTHRESHOLDNAME);
    }

    /**
     * 设置 阈值项名称
     * <P>
     * 等同 {@link #setPSThresholdName}
     * @param pSThresholdName
     */
    @JsonIgnore
    public PSThresholdDTO psthresholdname(String pSThresholdName){
        this.setPSThresholdName(pSThresholdName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSThresholdName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSThresholdName(strName);
    }

    @JsonIgnore
    public PSThresholdDTO name(String strName){
        this.setPSThresholdName(strName);
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
    public PSThresholdDTO textpslanresid(String textPSLanResId){
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
    public PSThresholdDTO textpslanresid(PSLanguageResDTO pSLanguageRes){
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
    public PSThresholdDTO textpslanresname(String textPSLanResName){
        this.setTextPSLanResName(textPSLanResName);
        return this;
    }

    /**
     * <B>THRESHOLDTAG</B>&nbsp;阈值标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_THRESHOLDTAG = "thresholdtag";

    /**
     * 设置 阈值标记
     * 
     * @param thresholdTag
     * 
     */
    @JsonProperty(FIELD_THRESHOLDTAG)
    public void setThresholdTag(String thresholdTag){
        this.set(FIELD_THRESHOLDTAG, thresholdTag);
    }
    
    /**
     * 获取 阈值标记  
     * @return
     */
    @JsonIgnore
    public String getThresholdTag(){
        Object objValue = this.get(FIELD_THRESHOLDTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 阈值标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isThresholdTagDirty(){
        if(this.contains(FIELD_THRESHOLDTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 阈值标记
     */
    @JsonIgnore
    public void resetThresholdTag(){
        this.reset(FIELD_THRESHOLDTAG);
    }

    /**
     * 设置 阈值标记
     * <P>
     * 等同 {@link #setThresholdTag}
     * @param thresholdTag
     */
    @JsonIgnore
    public PSThresholdDTO thresholdtag(String thresholdTag){
        this.setThresholdTag(thresholdTag);
        return this;
    }

    /**
     * <B>THRESHOLDTAG2</B>&nbsp;阈值标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_THRESHOLDTAG2 = "thresholdtag2";

    /**
     * 设置 阈值标记2
     * 
     * @param thresholdTag2
     * 
     */
    @JsonProperty(FIELD_THRESHOLDTAG2)
    public void setThresholdTag2(String thresholdTag2){
        this.set(FIELD_THRESHOLDTAG2, thresholdTag2);
    }
    
    /**
     * 获取 阈值标记2  
     * @return
     */
    @JsonIgnore
    public String getThresholdTag2(){
        Object objValue = this.get(FIELD_THRESHOLDTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 阈值标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isThresholdTag2Dirty(){
        if(this.contains(FIELD_THRESHOLDTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 阈值标记2
     */
    @JsonIgnore
    public void resetThresholdTag2(){
        this.reset(FIELD_THRESHOLDTAG2);
    }

    /**
     * 设置 阈值标记2
     * <P>
     * 等同 {@link #setThresholdTag2}
     * @param thresholdTag2
     */
    @JsonIgnore
    public PSThresholdDTO thresholdtag2(String thresholdTag2){
        this.setThresholdTag2(thresholdTag2);
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
    public PSThresholdDTO tippslanresid(String tipPSLanResId){
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
    public PSThresholdDTO tippslanresid(PSLanguageResDTO pSLanguageRes){
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
    public PSThresholdDTO tippslanresname(String tipPSLanResName){
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
    public PSThresholdDTO tooltipinfo(String tooltipInfo){
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
    public PSThresholdDTO updatedate(Timestamp updateDate){
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
    public PSThresholdDTO updateman(String updateMan){
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
    public PSThresholdDTO usercat(String userCat){
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
    public PSThresholdDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat.value);
        }
        return this;
    }

    /**
     * <B>USERTAG</B>&nbsp;用户标识
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_USERTAG = "usertag";

    /**
     * 设置 用户标识
     * 
     * @param userTag
     * 
     */
    @JsonProperty(FIELD_USERTAG)
    public void setUserTag(String userTag){
        this.set(FIELD_USERTAG, userTag);
    }
    
    /**
     * 获取 用户标识  
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
     * 判断 用户标识 是否指定值，包括空值
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
     * 重置 用户标识
     */
    @JsonIgnore
    public void resetUserTag(){
        this.reset(FIELD_USERTAG);
    }

    /**
     * 设置 用户标识
     * <P>
     * 等同 {@link #setUserTag}
     * @param userTag
     */
    @JsonIgnore
    public PSThresholdDTO usertag(String userTag){
        this.setUserTag(userTag);
        return this;
    }

    /**
     * <B>USERTAG2</B>&nbsp;用户标识2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_USERTAG2 = "usertag2";

    /**
     * 设置 用户标识2
     * 
     * @param userTag2
     * 
     */
    @JsonProperty(FIELD_USERTAG2)
    public void setUserTag2(String userTag2){
        this.set(FIELD_USERTAG2, userTag2);
    }
    
    /**
     * 获取 用户标识2  
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
     * 判断 用户标识2 是否指定值，包括空值
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
     * 重置 用户标识2
     */
    @JsonIgnore
    public void resetUserTag2(){
        this.reset(FIELD_USERTAG2);
    }

    /**
     * 设置 用户标识2
     * <P>
     * 等同 {@link #setUserTag2}
     * @param userTag2
     */
    @JsonIgnore
    public PSThresholdDTO usertag2(String userTag2){
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
    public PSThresholdDTO usertag3(String userTag3){
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
    public PSThresholdDTO usertag4(String userTag4){
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
    public PSThresholdDTO validflag(Integer validFlag){
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
    public PSThresholdDTO validflag(Boolean validFlag){
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
        return this.getPSThresholdId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSThresholdId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSThresholdId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSThresholdId(strValue);
    }

    @JsonIgnore
    public PSThresholdDTO id(String strValue){
        this.setPSThresholdId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSThresholdDTO){
            PSThresholdDTO dto = (PSThresholdDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
