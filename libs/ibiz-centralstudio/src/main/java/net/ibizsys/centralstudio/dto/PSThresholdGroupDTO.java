package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSTHRESHOLDGROUP</B>阈值组 模型传输对象
 * <P>
 * 
 */
public class PSThresholdGroupDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSThresholdGroupDTO(){
    }      

    /**
     * <B>BEGINVALUEPSDEFID</B>&nbsp;开始值属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_BEGINVALUEPSDEFID = "beginvaluepsdefid";

    /**
     * 设置 开始值属性
     * 
     * @param beginValuePSDEFId
     * 
     */
    @JsonProperty(FIELD_BEGINVALUEPSDEFID)
    public void setBeginValuePSDEFId(String beginValuePSDEFId){
        this.set(FIELD_BEGINVALUEPSDEFID, beginValuePSDEFId);
    }
    
    /**
     * 获取 开始值属性  
     * @return
     */
    @JsonIgnore
    public String getBeginValuePSDEFId(){
        Object objValue = this.get(FIELD_BEGINVALUEPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开始值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBeginValuePSDEFIdDirty(){
        if(this.contains(FIELD_BEGINVALUEPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开始值属性
     */
    @JsonIgnore
    public void resetBeginValuePSDEFId(){
        this.reset(FIELD_BEGINVALUEPSDEFID);
    }

    /**
     * 设置 开始值属性
     * <P>
     * 等同 {@link #setBeginValuePSDEFId}
     * @param beginValuePSDEFId
     */
    @JsonIgnore
    public PSThresholdGroupDTO beginvaluepsdefid(String beginValuePSDEFId){
        this.setBeginValuePSDEFId(beginValuePSDEFId);
        return this;
    }

    /**
     * 设置 开始值属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setBeginValuePSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSThresholdGroupDTO beginvaluepsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setBeginValuePSDEFId(null);
            this.setBeginValuePSDEFName(null);
        }
        else{
            this.setBeginValuePSDEFId(pSDEField.getPSDEFieldId());
            this.setBeginValuePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>BEGINVALUEPSDEFNAME</B>&nbsp;开始值属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_BEGINVALUEPSDEFID}
     */
    public final static String FIELD_BEGINVALUEPSDEFNAME = "beginvaluepsdefname";

    /**
     * 设置 开始值属性
     * 
     * @param beginValuePSDEFName
     * 
     */
    @JsonProperty(FIELD_BEGINVALUEPSDEFNAME)
    public void setBeginValuePSDEFName(String beginValuePSDEFName){
        this.set(FIELD_BEGINVALUEPSDEFNAME, beginValuePSDEFName);
    }
    
    /**
     * 获取 开始值属性  
     * @return
     */
    @JsonIgnore
    public String getBeginValuePSDEFName(){
        Object objValue = this.get(FIELD_BEGINVALUEPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开始值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBeginValuePSDEFNameDirty(){
        if(this.contains(FIELD_BEGINVALUEPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开始值属性
     */
    @JsonIgnore
    public void resetBeginValuePSDEFName(){
        this.reset(FIELD_BEGINVALUEPSDEFNAME);
    }

    /**
     * 设置 开始值属性
     * <P>
     * 等同 {@link #setBeginValuePSDEFName}
     * @param beginValuePSDEFName
     */
    @JsonIgnore
    public PSThresholdGroupDTO beginvaluepsdefname(String beginValuePSDEFName){
        this.setBeginValuePSDEFName(beginValuePSDEFName);
        return this;
    }

    /**
     * <B>BKCOLORPSDEFID</B>&nbsp;背景颜色值属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_BKCOLORPSDEFID = "bkcolorpsdefid";

    /**
     * 设置 背景颜色值属性
     * 
     * @param bKColorPSDEFId
     * 
     */
    @JsonProperty(FIELD_BKCOLORPSDEFID)
    public void setBKColorPSDEFId(String bKColorPSDEFId){
        this.set(FIELD_BKCOLORPSDEFID, bKColorPSDEFId);
    }
    
    /**
     * 获取 背景颜色值属性  
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
     * 判断 背景颜色值属性 是否指定值，包括空值
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
     * 重置 背景颜色值属性
     */
    @JsonIgnore
    public void resetBKColorPSDEFId(){
        this.reset(FIELD_BKCOLORPSDEFID);
    }

    /**
     * 设置 背景颜色值属性
     * <P>
     * 等同 {@link #setBKColorPSDEFId}
     * @param bKColorPSDEFId
     */
    @JsonIgnore
    public PSThresholdGroupDTO bkcolorpsdefid(String bKColorPSDEFId){
        this.setBKColorPSDEFId(bKColorPSDEFId);
        return this;
    }

    /**
     * 设置 背景颜色值属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setBKColorPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSThresholdGroupDTO bkcolorpsdefid(PSDEFieldDTO pSDEField){
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
     * <B>BKCOLORPSDEFNAME</B>&nbsp;背景颜色值属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_BKCOLORPSDEFID}
     */
    public final static String FIELD_BKCOLORPSDEFNAME = "bkcolorpsdefname";

    /**
     * 设置 背景颜色值属性
     * 
     * @param bKColorPSDEFName
     * 
     */
    @JsonProperty(FIELD_BKCOLORPSDEFNAME)
    public void setBKColorPSDEFName(String bKColorPSDEFName){
        this.set(FIELD_BKCOLORPSDEFNAME, bKColorPSDEFName);
    }
    
    /**
     * 获取 背景颜色值属性  
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
     * 判断 背景颜色值属性 是否指定值，包括空值
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
     * 重置 背景颜色值属性
     */
    @JsonIgnore
    public void resetBKColorPSDEFName(){
        this.reset(FIELD_BKCOLORPSDEFNAME);
    }

    /**
     * 设置 背景颜色值属性
     * <P>
     * 等同 {@link #setBKColorPSDEFName}
     * @param bKColorPSDEFName
     */
    @JsonIgnore
    public PSThresholdGroupDTO bkcolorpsdefname(String bKColorPSDEFName){
        this.setBKColorPSDEFName(bKColorPSDEFName);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码名称
     * <P>
     * 字符串：最大长度 50，由字母、数字、下划线组成，且开始必须为字母
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
    public PSThresholdGroupDTO codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>COLORPSDEFID</B>&nbsp;颜色值属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_COLORPSDEFID = "colorpsdefid";

    /**
     * 设置 颜色值属性
     * 
     * @param colorPSDEFId
     * 
     */
    @JsonProperty(FIELD_COLORPSDEFID)
    public void setColorPSDEFId(String colorPSDEFId){
        this.set(FIELD_COLORPSDEFID, colorPSDEFId);
    }
    
    /**
     * 获取 颜色值属性  
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
     * 判断 颜色值属性 是否指定值，包括空值
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
     * 重置 颜色值属性
     */
    @JsonIgnore
    public void resetColorPSDEFId(){
        this.reset(FIELD_COLORPSDEFID);
    }

    /**
     * 设置 颜色值属性
     * <P>
     * 等同 {@link #setColorPSDEFId}
     * @param colorPSDEFId
     */
    @JsonIgnore
    public PSThresholdGroupDTO colorpsdefid(String colorPSDEFId){
        this.setColorPSDEFId(colorPSDEFId);
        return this;
    }

    /**
     * 设置 颜色值属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setColorPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSThresholdGroupDTO colorpsdefid(PSDEFieldDTO pSDEField){
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
     * <B>COLORPSDEFNAME</B>&nbsp;颜色值属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_COLORPSDEFID}
     */
    public final static String FIELD_COLORPSDEFNAME = "colorpsdefname";

    /**
     * 设置 颜色值属性
     * 
     * @param colorPSDEFName
     * 
     */
    @JsonProperty(FIELD_COLORPSDEFNAME)
    public void setColorPSDEFName(String colorPSDEFName){
        this.set(FIELD_COLORPSDEFNAME, colorPSDEFName);
    }
    
    /**
     * 获取 颜色值属性  
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
     * 判断 颜色值属性 是否指定值，包括空值
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
     * 重置 颜色值属性
     */
    @JsonIgnore
    public void resetColorPSDEFName(){
        this.reset(FIELD_COLORPSDEFNAME);
    }

    /**
     * 设置 颜色值属性
     * <P>
     * 等同 {@link #setColorPSDEFName}
     * @param colorPSDEFName
     */
    @JsonIgnore
    public PSThresholdGroupDTO colorpsdefname(String colorPSDEFName){
        this.setColorPSDEFName(colorPSDEFName);
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
    public PSThresholdGroupDTO createdate(Timestamp createDate){
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
    public PSThresholdGroupDTO createman(String createMan){
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
    public PSThresholdGroupDTO customcond(String customCond){
        this.setCustomCond(customCond);
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
    public PSThresholdGroupDTO datapsdefid(String dataPSDEFId){
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
    public PSThresholdGroupDTO datapsdefid(PSDEFieldDTO pSDEField){
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
    public PSThresholdGroupDTO datapsdefname(String dataPSDEFName){
        this.setDataPSDEFName(dataPSDEFName);
        return this;
    }

    /**
     * <B>ENDVALUEPSDEFID</B>&nbsp;结束值属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_ENDVALUEPSDEFID = "endvaluepsdefid";

    /**
     * 设置 结束值属性
     * 
     * @param endValuePSDEFId
     * 
     */
    @JsonProperty(FIELD_ENDVALUEPSDEFID)
    public void setEndValuePSDEFId(String endValuePSDEFId){
        this.set(FIELD_ENDVALUEPSDEFID, endValuePSDEFId);
    }
    
    /**
     * 获取 结束值属性  
     * @return
     */
    @JsonIgnore
    public String getEndValuePSDEFId(){
        Object objValue = this.get(FIELD_ENDVALUEPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 结束值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEndValuePSDEFIdDirty(){
        if(this.contains(FIELD_ENDVALUEPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 结束值属性
     */
    @JsonIgnore
    public void resetEndValuePSDEFId(){
        this.reset(FIELD_ENDVALUEPSDEFID);
    }

    /**
     * 设置 结束值属性
     * <P>
     * 等同 {@link #setEndValuePSDEFId}
     * @param endValuePSDEFId
     */
    @JsonIgnore
    public PSThresholdGroupDTO endvaluepsdefid(String endValuePSDEFId){
        this.setEndValuePSDEFId(endValuePSDEFId);
        return this;
    }

    /**
     * 设置 结束值属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setEndValuePSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSThresholdGroupDTO endvaluepsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setEndValuePSDEFId(null);
            this.setEndValuePSDEFName(null);
        }
        else{
            this.setEndValuePSDEFId(pSDEField.getPSDEFieldId());
            this.setEndValuePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>ENDVALUEPSDEFNAME</B>&nbsp;结束值属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ENDVALUEPSDEFID}
     */
    public final static String FIELD_ENDVALUEPSDEFNAME = "endvaluepsdefname";

    /**
     * 设置 结束值属性
     * 
     * @param endValuePSDEFName
     * 
     */
    @JsonProperty(FIELD_ENDVALUEPSDEFNAME)
    public void setEndValuePSDEFName(String endValuePSDEFName){
        this.set(FIELD_ENDVALUEPSDEFNAME, endValuePSDEFName);
    }
    
    /**
     * 获取 结束值属性  
     * @return
     */
    @JsonIgnore
    public String getEndValuePSDEFName(){
        Object objValue = this.get(FIELD_ENDVALUEPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 结束值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEndValuePSDEFNameDirty(){
        if(this.contains(FIELD_ENDVALUEPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 结束值属性
     */
    @JsonIgnore
    public void resetEndValuePSDEFName(){
        this.reset(FIELD_ENDVALUEPSDEFNAME);
    }

    /**
     * 设置 结束值属性
     * <P>
     * 等同 {@link #setEndValuePSDEFName}
     * @param endValuePSDEFName
     */
    @JsonIgnore
    public PSThresholdGroupDTO endvaluepsdefname(String endValuePSDEFName){
        this.setEndValuePSDEFName(endValuePSDEFName);
        return this;
    }

    /**
     * <B>ICONCLSPSDEFID</B>&nbsp;图标样式属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_ICONCLSPSDEFID = "iconclspsdefid";

    /**
     * 设置 图标样式属性
     * 
     * @param iconClsPSDEFId
     * 
     */
    @JsonProperty(FIELD_ICONCLSPSDEFID)
    public void setIconClsPSDEFId(String iconClsPSDEFId){
        this.set(FIELD_ICONCLSPSDEFID, iconClsPSDEFId);
    }
    
    /**
     * 获取 图标样式属性  
     * @return
     */
    @JsonIgnore
    public String getIconClsPSDEFId(){
        Object objValue = this.get(FIELD_ICONCLSPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 图标样式属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIconClsPSDEFIdDirty(){
        if(this.contains(FIELD_ICONCLSPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图标样式属性
     */
    @JsonIgnore
    public void resetIconClsPSDEFId(){
        this.reset(FIELD_ICONCLSPSDEFID);
    }

    /**
     * 设置 图标样式属性
     * <P>
     * 等同 {@link #setIconClsPSDEFId}
     * @param iconClsPSDEFId
     */
    @JsonIgnore
    public PSThresholdGroupDTO iconclspsdefid(String iconClsPSDEFId){
        this.setIconClsPSDEFId(iconClsPSDEFId);
        return this;
    }

    /**
     * 设置 图标样式属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setIconClsPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSThresholdGroupDTO iconclspsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setIconClsPSDEFId(null);
            this.setIconClsPSDEFName(null);
        }
        else{
            this.setIconClsPSDEFId(pSDEField.getPSDEFieldId());
            this.setIconClsPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>ICONCLSPSDEFNAME</B>&nbsp;图标样式属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ICONCLSPSDEFID}
     */
    public final static String FIELD_ICONCLSPSDEFNAME = "iconclspsdefname";

    /**
     * 设置 图标样式属性
     * 
     * @param iconClsPSDEFName
     * 
     */
    @JsonProperty(FIELD_ICONCLSPSDEFNAME)
    public void setIconClsPSDEFName(String iconClsPSDEFName){
        this.set(FIELD_ICONCLSPSDEFNAME, iconClsPSDEFName);
    }
    
    /**
     * 获取 图标样式属性  
     * @return
     */
    @JsonIgnore
    public String getIconClsPSDEFName(){
        Object objValue = this.get(FIELD_ICONCLSPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 图标样式属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIconClsPSDEFNameDirty(){
        if(this.contains(FIELD_ICONCLSPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图标样式属性
     */
    @JsonIgnore
    public void resetIconClsPSDEFName(){
        this.reset(FIELD_ICONCLSPSDEFNAME);
    }

    /**
     * 设置 图标样式属性
     * <P>
     * 等同 {@link #setIconClsPSDEFName}
     * @param iconClsPSDEFName
     */
    @JsonIgnore
    public PSThresholdGroupDTO iconclspsdefname(String iconClsPSDEFName){
        this.setIconClsPSDEFName(iconClsPSDEFName);
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
    public PSThresholdGroupDTO incbeginvalue(Integer incBeginValue){
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
    public PSThresholdGroupDTO incbeginvalue(Boolean incBeginValue){
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
    public PSThresholdGroupDTO incendvalue(Integer incEndValue){
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
    public PSThresholdGroupDTO incendvalue(Boolean incEndValue){
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
    public PSThresholdGroupDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSDEDSID</B>&nbsp;实体数据集
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO} 
     */
    public final static String FIELD_PSDEDSID = "psdedsid";

    /**
     * 设置 实体数据集
     * 
     * @param pSDEDSId
     * 
     */
    @JsonProperty(FIELD_PSDEDSID)
    public void setPSDEDSId(String pSDEDSId){
        this.set(FIELD_PSDEDSID, pSDEDSId);
    }
    
    /**
     * 获取 实体数据集  
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
     * 判断 实体数据集 是否指定值，包括空值
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
     * 重置 实体数据集
     */
    @JsonIgnore
    public void resetPSDEDSId(){
        this.reset(FIELD_PSDEDSID);
    }

    /**
     * 设置 实体数据集
     * <P>
     * 等同 {@link #setPSDEDSId}
     * @param pSDEDSId
     */
    @JsonIgnore
    public PSThresholdGroupDTO psdedsid(String pSDEDSId){
        this.setPSDEDSId(pSDEDSId);
        return this;
    }

    /**
     * 设置 实体数据集，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDSId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSThresholdGroupDTO psdedsid(PSDEDataSetDTO pSDEDataSet){
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
     * <B>PSDEDSNAME</B>&nbsp;实体数据集
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDSID}
     */
    public final static String FIELD_PSDEDSNAME = "psdedsname";

    /**
     * 设置 实体数据集
     * 
     * @param pSDEDSName
     * 
     */
    @JsonProperty(FIELD_PSDEDSNAME)
    public void setPSDEDSName(String pSDEDSName){
        this.set(FIELD_PSDEDSNAME, pSDEDSName);
    }
    
    /**
     * 获取 实体数据集  
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
     * 判断 实体数据集 是否指定值，包括空值
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
     * 重置 实体数据集
     */
    @JsonIgnore
    public void resetPSDEDSName(){
        this.reset(FIELD_PSDEDSNAME);
    }

    /**
     * 设置 实体数据集
     * <P>
     * 等同 {@link #setPSDEDSName}
     * @param pSDEDSName
     */
    @JsonIgnore
    public PSThresholdGroupDTO psdedsname(String pSDEDSName){
        this.setPSDEDSName(pSDEDSName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDataEntityDTO} 
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 实体
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
     * 设置 实体
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSThresholdGroupDTO psdeid(String pSDEId){
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
    public PSThresholdGroupDTO psdeid(PSDataEntityDTO pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_PSDENAME = "psdename";

    /**
     * 设置 实体
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
     * 设置 实体
     * <P>
     * 等同 {@link #setPSDEName}
     * @param pSDEName
     */
    @JsonIgnore
    public PSThresholdGroupDTO psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSModuleDTO} 
     */
    public final static String FIELD_PSMODULEID = "psmoduleid";

    /**
     * 设置 系统模块
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
     * 设置 系统模块
     * <P>
     * 等同 {@link #setPSModuleId}
     * @param pSModuleId
     */
    @JsonIgnore
    public PSThresholdGroupDTO psmoduleid(String pSModuleId){
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
    public PSThresholdGroupDTO psmoduleid(PSModuleDTO pSModule){
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
     * <B>PSMODULENAME</B>&nbsp;系统模块
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSMODULEID}
     */
    public final static String FIELD_PSMODULENAME = "psmodulename";

    /**
     * 设置 系统模块
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
     * 设置 系统模块
     * <P>
     * 等同 {@link #setPSModuleName}
     * @param pSModuleName
     */
    @JsonIgnore
    public PSThresholdGroupDTO psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
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
    public PSThresholdGroupDTO pssysdynamodelid(String pSSysDynaModelId){
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
    public PSThresholdGroupDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel){
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
    public PSThresholdGroupDTO pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSTHRESHOLDGROUPID</B>&nbsp;阈值组标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSTHRESHOLDGROUPID = "psthresholdgroupid";

    /**
     * 设置 阈值组标识
     * 
     * @param pSThresholdGroupId
     * 
     */
    @JsonProperty(FIELD_PSTHRESHOLDGROUPID)
    public void setPSThresholdGroupId(String pSThresholdGroupId){
        this.set(FIELD_PSTHRESHOLDGROUPID, pSThresholdGroupId);
    }
    
    /**
     * 获取 阈值组标识  
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
     * 判断 阈值组标识 是否指定值，包括空值
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
     * 重置 阈值组标识
     */
    @JsonIgnore
    public void resetPSThresholdGroupId(){
        this.reset(FIELD_PSTHRESHOLDGROUPID);
    }

    /**
     * 设置 阈值组标识
     * <P>
     * 等同 {@link #setPSThresholdGroupId}
     * @param pSThresholdGroupId
     */
    @JsonIgnore
    public PSThresholdGroupDTO psthresholdgroupid(String pSThresholdGroupId){
        this.setPSThresholdGroupId(pSThresholdGroupId);
        return this;
    }

    /**
     * <B>PSTHRESHOLDGROUPNAME</B>&nbsp;阈值组名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSTHRESHOLDGROUPNAME = "psthresholdgroupname";

    /**
     * 设置 阈值组名称
     * 
     * @param pSThresholdGroupName
     * 
     */
    @JsonProperty(FIELD_PSTHRESHOLDGROUPNAME)
    public void setPSThresholdGroupName(String pSThresholdGroupName){
        this.set(FIELD_PSTHRESHOLDGROUPNAME, pSThresholdGroupName);
    }
    
    /**
     * 获取 阈值组名称  
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
     * 判断 阈值组名称 是否指定值，包括空值
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
     * 重置 阈值组名称
     */
    @JsonIgnore
    public void resetPSThresholdGroupName(){
        this.reset(FIELD_PSTHRESHOLDGROUPNAME);
    }

    /**
     * 设置 阈值组名称
     * <P>
     * 等同 {@link #setPSThresholdGroupName}
     * @param pSThresholdGroupName
     */
    @JsonIgnore
    public PSThresholdGroupDTO psthresholdgroupname(String pSThresholdGroupName){
        this.setPSThresholdGroupName(pSThresholdGroupName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSThresholdGroupName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSThresholdGroupName(strName);
    }

    @JsonIgnore
    public PSThresholdGroupDTO name(String strName){
        this.setPSThresholdGroupName(strName);
        return this;
    }

    /**
     * <B>TEXTPSDEFID</B>&nbsp;文本属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_TEXTPSDEFID = "textpsdefid";

    /**
     * 设置 文本属性
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
     * 设置 文本属性
     * <P>
     * 等同 {@link #setTextPSDEFId}
     * @param textPSDEFId
     */
    @JsonIgnore
    public PSThresholdGroupDTO textpsdefid(String textPSDEFId){
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
    public PSThresholdGroupDTO textpsdefid(PSDEFieldDTO pSDEField){
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
     * <B>TEXTPSDEFNAME</B>&nbsp;文本属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TEXTPSDEFID}
     */
    public final static String FIELD_TEXTPSDEFNAME = "textpsdefname";

    /**
     * 设置 文本属性
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
     * 设置 文本属性
     * <P>
     * 等同 {@link #setTextPSDEFName}
     * @param textPSDEFName
     */
    @JsonIgnore
    public PSThresholdGroupDTO textpsdefname(String textPSDEFName){
        this.setTextPSDEFName(textPSDEFName);
        return this;
    }

    /**
     * <B>THRESHOLDGROUPTAG</B>&nbsp;阈值组标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_THRESHOLDGROUPTAG = "thresholdgrouptag";

    /**
     * 设置 阈值组标记
     * 
     * @param thresholdGroupTag
     * 
     */
    @JsonProperty(FIELD_THRESHOLDGROUPTAG)
    public void setThresholdGroupTag(String thresholdGroupTag){
        this.set(FIELD_THRESHOLDGROUPTAG, thresholdGroupTag);
    }
    
    /**
     * 获取 阈值组标记  
     * @return
     */
    @JsonIgnore
    public String getThresholdGroupTag(){
        Object objValue = this.get(FIELD_THRESHOLDGROUPTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 阈值组标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isThresholdGroupTagDirty(){
        if(this.contains(FIELD_THRESHOLDGROUPTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 阈值组标记
     */
    @JsonIgnore
    public void resetThresholdGroupTag(){
        this.reset(FIELD_THRESHOLDGROUPTAG);
    }

    /**
     * 设置 阈值组标记
     * <P>
     * 等同 {@link #setThresholdGroupTag}
     * @param thresholdGroupTag
     */
    @JsonIgnore
    public PSThresholdGroupDTO thresholdgrouptag(String thresholdGroupTag){
        this.setThresholdGroupTag(thresholdGroupTag);
        return this;
    }

    /**
     * <B>THRESHOLDGROUPTAG2</B>&nbsp;阈值组标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_THRESHOLDGROUPTAG2 = "thresholdgrouptag2";

    /**
     * 设置 阈值组标记2
     * 
     * @param thresholdGroupTag2
     * 
     */
    @JsonProperty(FIELD_THRESHOLDGROUPTAG2)
    public void setThresholdGroupTag2(String thresholdGroupTag2){
        this.set(FIELD_THRESHOLDGROUPTAG2, thresholdGroupTag2);
    }
    
    /**
     * 获取 阈值组标记2  
     * @return
     */
    @JsonIgnore
    public String getThresholdGroupTag2(){
        Object objValue = this.get(FIELD_THRESHOLDGROUPTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 阈值组标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isThresholdGroupTag2Dirty(){
        if(this.contains(FIELD_THRESHOLDGROUPTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 阈值组标记2
     */
    @JsonIgnore
    public void resetThresholdGroupTag2(){
        this.reset(FIELD_THRESHOLDGROUPTAG2);
    }

    /**
     * 设置 阈值组标记2
     * <P>
     * 等同 {@link #setThresholdGroupTag2}
     * @param thresholdGroupTag2
     */
    @JsonIgnore
    public PSThresholdGroupDTO thresholdgrouptag2(String thresholdGroupTag2){
        this.setThresholdGroupTag2(thresholdGroupTag2);
        return this;
    }

    /**
     * <B>THRESHOLDGROUPTYPE</B>&nbsp;阈值组类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.ThresholdGroupType} 
     */
    public final static String FIELD_THRESHOLDGROUPTYPE = "thresholdgrouptype";

    /**
     * 设置 阈值组类型
     * 
     * @param thresholdGroupType
     * 
     */
    @JsonProperty(FIELD_THRESHOLDGROUPTYPE)
    public void setThresholdGroupType(String thresholdGroupType){
        this.set(FIELD_THRESHOLDGROUPTYPE, thresholdGroupType);
    }
    
    /**
     * 获取 阈值组类型  
     * @return
     */
    @JsonIgnore
    public String getThresholdGroupType(){
        Object objValue = this.get(FIELD_THRESHOLDGROUPTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 阈值组类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isThresholdGroupTypeDirty(){
        if(this.contains(FIELD_THRESHOLDGROUPTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 阈值组类型
     */
    @JsonIgnore
    public void resetThresholdGroupType(){
        this.reset(FIELD_THRESHOLDGROUPTYPE);
    }

    /**
     * 设置 阈值组类型
     * <P>
     * 等同 {@link #setThresholdGroupType}
     * @param thresholdGroupType
     */
    @JsonIgnore
    public PSThresholdGroupDTO thresholdgrouptype(String thresholdGroupType){
        this.setThresholdGroupType(thresholdGroupType);
        return this;
    }

     /**
     * 设置 阈值组类型
     * <P>
     * 等同 {@link #setThresholdGroupType}
     * @param thresholdGroupType
     */
    @JsonIgnore
    public PSThresholdGroupDTO thresholdgrouptype(net.ibizsys.model.PSModelEnums.ThresholdGroupType thresholdGroupType){
        if(thresholdGroupType == null){
            this.setThresholdGroupType(null);
        }
        else{
            this.setThresholdGroupType(thresholdGroupType.value);
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
    public PSThresholdGroupDTO updatedate(Timestamp updateDate){
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
    public PSThresholdGroupDTO updateman(String updateMan){
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
    public PSThresholdGroupDTO usercat(String userCat){
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
    public PSThresholdGroupDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
     * 字符串：最大长度 100
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
    public PSThresholdGroupDTO usertag(String userTag){
        this.setUserTag(userTag);
        return this;
    }

    /**
     * <B>USERTAG2</B>&nbsp;用户标识2
     * <P>
     * 字符串：最大长度 100
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
    public PSThresholdGroupDTO usertag2(String userTag2){
        this.setUserTag2(userTag2);
        return this;
    }

    /**
     * <B>USERTAG3</B>&nbsp;用户标识3
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_USERTAG3 = "usertag3";

    /**
     * 设置 用户标识3
     * 
     * @param userTag3
     * 
     */
    @JsonProperty(FIELD_USERTAG3)
    public void setUserTag3(String userTag3){
        this.set(FIELD_USERTAG3, userTag3);
    }
    
    /**
     * 获取 用户标识3  
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
     * 判断 用户标识3 是否指定值，包括空值
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
     * 重置 用户标识3
     */
    @JsonIgnore
    public void resetUserTag3(){
        this.reset(FIELD_USERTAG3);
    }

    /**
     * 设置 用户标识3
     * <P>
     * 等同 {@link #setUserTag3}
     * @param userTag3
     */
    @JsonIgnore
    public PSThresholdGroupDTO usertag3(String userTag3){
        this.setUserTag3(userTag3);
        return this;
    }

    /**
     * <B>USERTAG4</B>&nbsp;用户标识4
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_USERTAG4 = "usertag4";

    /**
     * 设置 用户标识4
     * 
     * @param userTag4
     * 
     */
    @JsonProperty(FIELD_USERTAG4)
    public void setUserTag4(String userTag4){
        this.set(FIELD_USERTAG4, userTag4);
    }
    
    /**
     * 获取 用户标识4  
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
     * 判断 用户标识4 是否指定值，包括空值
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
     * 重置 用户标识4
     */
    @JsonIgnore
    public void resetUserTag4(){
        this.reset(FIELD_USERTAG4);
    }

    /**
     * 设置 用户标识4
     * <P>
     * 等同 {@link #setUserTag4}
     * @param userTag4
     */
    @JsonIgnore
    public PSThresholdGroupDTO usertag4(String userTag4){
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
    public PSThresholdGroupDTO validflag(Integer validFlag){
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
    public PSThresholdGroupDTO validflag(Boolean validFlag){
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
        return this.getPSThresholdGroupId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSThresholdGroupId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSThresholdGroupId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSThresholdGroupId(strValue);
    }

    @JsonIgnore
    public PSThresholdGroupDTO id(String strValue){
        this.setPSThresholdGroupId(strValue);
        return this;
    }


    /**
     *  阈值项 成员集合
     */
    public final static String FIELD_PSTHRESHOLDS = "psthresholds";

    private java.util.List<net.ibizsys.centralstudio.dto.PSThresholdDTO> psthresholds;

    /**
     * 获取 阈值项 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSTHRESHOLDS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSThresholdDTO> getPSThresholds(){
        return this.psthresholds;
    }

    /**
     * 设置 阈值项 成员集合  
     * @param psthresholds
     */
    @JsonProperty(FIELD_PSTHRESHOLDS)
    public void setPSThresholds(java.util.List<net.ibizsys.centralstudio.dto.PSThresholdDTO> psthresholds){
        this.psthresholds = psthresholds;
    }

    /**
     * 获取 阈值项 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSThresholdDTO> getPSThresholdsIf(){
        if(this.psthresholds == null){
            this.psthresholds = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSThresholdDTO>();          
        }
        return this.psthresholds;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSThresholdGroupDTO){
            PSThresholdGroupDTO dto = (PSThresholdGroupDTO)iEntity;
            dto.setPSThresholds(this.getPSThresholds());
        }
        super.copyTo(iEntity);
    }
}
