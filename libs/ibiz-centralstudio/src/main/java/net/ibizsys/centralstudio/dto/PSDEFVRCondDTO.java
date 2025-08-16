package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEFVRCOND</B>实体属性值规则项 模型传输对象
 * <P>
 * 属性值规则条件模型，支持组合、预置的单项检查类型，支持层级结构
 */
public class PSDEFVRCondDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSDEFVRCondDTO(){
    }      

    /**
     * <B>CONDTAG</B>&nbsp;条件标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CONDTAG = "condtag";

    /**
     * 设置 条件标记
     * 
     * @param condTag
     * 
     */
    @JsonProperty(FIELD_CONDTAG)
    public void setCondTag(String condTag){
        this.set(FIELD_CONDTAG, condTag);
    }
    
    /**
     * 获取 条件标记  
     * @return
     */
    @JsonIgnore
    public String getCondTag(){
        Object objValue = this.get(FIELD_CONDTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 条件标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCondTagDirty(){
        if(this.contains(FIELD_CONDTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 条件标记
     */
    @JsonIgnore
    public void resetCondTag(){
        this.reset(FIELD_CONDTAG);
    }

    /**
     * 设置 条件标记
     * <P>
     * 等同 {@link #setCondTag}
     * @param condTag
     */
    @JsonIgnore
    public PSDEFVRCondDTO condtag(String condTag){
        this.setCondTag(condTag);
        return this;
    }

    /**
     * <B>CONDTAG2</B>&nbsp;条件标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CONDTAG2 = "condtag2";

    /**
     * 设置 条件标记2
     * 
     * @param condTag2
     * 
     */
    @JsonProperty(FIELD_CONDTAG2)
    public void setCondTag2(String condTag2){
        this.set(FIELD_CONDTAG2, condTag2);
    }
    
    /**
     * 获取 条件标记2  
     * @return
     */
    @JsonIgnore
    public String getCondTag2(){
        Object objValue = this.get(FIELD_CONDTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 条件标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCondTag2Dirty(){
        if(this.contains(FIELD_CONDTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 条件标记2
     */
    @JsonIgnore
    public void resetCondTag2(){
        this.reset(FIELD_CONDTAG2);
    }

    /**
     * 设置 条件标记2
     * <P>
     * 等同 {@link #setCondTag2}
     * @param condTag2
     */
    @JsonIgnore
    public PSDEFVRCondDTO condtag2(String condTag2){
        this.setCondTag2(condTag2);
        return this;
    }

    /**
     * <B>CONDTYPE</B>&nbsp;条件类型，指定值规则条件项的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DEFVRType} 
     */
    public final static String FIELD_CONDTYPE = "condtype";

    /**
     * 设置 条件类型，详细说明：{@link #FIELD_CONDTYPE}
     * 
     * @param condType
     * 
     */
    @JsonProperty(FIELD_CONDTYPE)
    public void setCondType(String condType){
        this.set(FIELD_CONDTYPE, condType);
    }
    
    /**
     * 获取 条件类型  
     * @return
     */
    @JsonIgnore
    public String getCondType(){
        Object objValue = this.get(FIELD_CONDTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 条件类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCondTypeDirty(){
        if(this.contains(FIELD_CONDTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 条件类型
     */
    @JsonIgnore
    public void resetCondType(){
        this.reset(FIELD_CONDTYPE);
    }

    /**
     * 设置 条件类型，详细说明：{@link #FIELD_CONDTYPE}
     * <P>
     * 等同 {@link #setCondType}
     * @param condType
     */
    @JsonIgnore
    public PSDEFVRCondDTO condtype(String condType){
        this.setCondType(condType);
        return this;
    }

     /**
     * 设置 条件类型，详细说明：{@link #FIELD_CONDTYPE}
     * <P>
     * 等同 {@link #setCondType}
     * @param condType
     */
    @JsonIgnore
    public PSDEFVRCondDTO condtype(net.ibizsys.model.PSModelEnums.DEFVRType condType){
        if(condType == null){
            this.setCondType(null);
        }
        else{
            this.setCondType(condType.value);
        }
        return this;
    }

    /**
     * <B>CONDVALUE</B>&nbsp;条件值，指定简单值规则的条件值
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_CONDVALUE = "condvalue";

    /**
     * 设置 条件值，详细说明：{@link #FIELD_CONDVALUE}
     * 
     * @param condValue
     * 
     */
    @JsonProperty(FIELD_CONDVALUE)
    public void setCondValue(String condValue){
        this.set(FIELD_CONDVALUE, condValue);
    }
    
    /**
     * 获取 条件值  
     * @return
     */
    @JsonIgnore
    public String getCondValue(){
        Object objValue = this.get(FIELD_CONDVALUE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 条件值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCondValueDirty(){
        if(this.contains(FIELD_CONDVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 条件值
     */
    @JsonIgnore
    public void resetCondValue(){
        this.reset(FIELD_CONDVALUE);
    }

    /**
     * 设置 条件值，详细说明：{@link #FIELD_CONDVALUE}
     * <P>
     * 等同 {@link #setCondValue}
     * @param condValue
     */
    @JsonIgnore
    public PSDEFVRCondDTO condvalue(String condValue){
        this.setCondValue(condValue);
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
    public PSDEFVRCondDTO createdate(Timestamp createDate){
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
    public PSDEFVRCondDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CUSTOMDEFNAME</B>&nbsp;属性名称，指定值规则条件的自定义属性，在无法从实体中选择合适的属性时使用，引擎计算属性时优先使用此配置
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_CUSTOMDEFNAME = "customdefname";

    /**
     * 设置 属性名称，详细说明：{@link #FIELD_CUSTOMDEFNAME}
     * 
     * @param customDEFName
     * 
     */
    @JsonProperty(FIELD_CUSTOMDEFNAME)
    public void setCustomDEFName(String customDEFName){
        this.set(FIELD_CUSTOMDEFNAME, customDEFName);
    }
    
    /**
     * 获取 属性名称  
     * @return
     */
    @JsonIgnore
    public String getCustomDEFName(){
        Object objValue = this.get(FIELD_CUSTOMDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomDEFNameDirty(){
        if(this.contains(FIELD_CUSTOMDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性名称
     */
    @JsonIgnore
    public void resetCustomDEFName(){
        this.reset(FIELD_CUSTOMDEFNAME);
    }

    /**
     * 设置 属性名称，详细说明：{@link #FIELD_CUSTOMDEFNAME}
     * <P>
     * 等同 {@link #setCustomDEFName}
     * @param customDEFName
     */
    @JsonIgnore
    public PSDEFVRCondDTO customdefname(String customDEFName){
        this.setCustomDEFName(customDEFName);
        return this;
    }

    /**
     * <B>EXTMAJORPSDEFID</B>&nbsp;数据集实体附加约束属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_EXTMAJORPSDEFID = "extmajorpsdefid";

    /**
     * 设置 数据集实体附加约束属性
     * 
     * @param extMajorPSDEFId
     * 
     */
    @JsonProperty(FIELD_EXTMAJORPSDEFID)
    public void setExtMajorPSDEFId(String extMajorPSDEFId){
        this.set(FIELD_EXTMAJORPSDEFID, extMajorPSDEFId);
    }
    
    /**
     * 获取 数据集实体附加约束属性  
     * @return
     */
    @JsonIgnore
    public String getExtMajorPSDEFId(){
        Object objValue = this.get(FIELD_EXTMAJORPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据集实体附加约束属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExtMajorPSDEFIdDirty(){
        if(this.contains(FIELD_EXTMAJORPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据集实体附加约束属性
     */
    @JsonIgnore
    public void resetExtMajorPSDEFId(){
        this.reset(FIELD_EXTMAJORPSDEFID);
    }

    /**
     * 设置 数据集实体附加约束属性
     * <P>
     * 等同 {@link #setExtMajorPSDEFId}
     * @param extMajorPSDEFId
     */
    @JsonIgnore
    public PSDEFVRCondDTO extmajorpsdefid(String extMajorPSDEFId){
        this.setExtMajorPSDEFId(extMajorPSDEFId);
        return this;
    }

    /**
     * 设置 数据集实体附加约束属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setExtMajorPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDEFVRCondDTO extmajorpsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setExtMajorPSDEFId(null);
            this.setExtMajorPSDEFName(null);
        }
        else{
            this.setExtMajorPSDEFId(pSDEField.getPSDEFieldId());
            this.setExtMajorPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>EXTMAJORPSDEFNAME</B>&nbsp;数据集实体附加约束属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_EXTMAJORPSDEFID}
     */
    public final static String FIELD_EXTMAJORPSDEFNAME = "extmajorpsdefname";

    /**
     * 设置 数据集实体附加约束属性
     * 
     * @param extMajorPSDEFName
     * 
     */
    @JsonProperty(FIELD_EXTMAJORPSDEFNAME)
    public void setExtMajorPSDEFName(String extMajorPSDEFName){
        this.set(FIELD_EXTMAJORPSDEFNAME, extMajorPSDEFName);
    }
    
    /**
     * 获取 数据集实体附加约束属性  
     * @return
     */
    @JsonIgnore
    public String getExtMajorPSDEFName(){
        Object objValue = this.get(FIELD_EXTMAJORPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据集实体附加约束属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExtMajorPSDEFNameDirty(){
        if(this.contains(FIELD_EXTMAJORPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据集实体附加约束属性
     */
    @JsonIgnore
    public void resetExtMajorPSDEFName(){
        this.reset(FIELD_EXTMAJORPSDEFNAME);
    }

    /**
     * 设置 数据集实体附加约束属性
     * <P>
     * 等同 {@link #setExtMajorPSDEFName}
     * @param extMajorPSDEFName
     */
    @JsonIgnore
    public PSDEFVRCondDTO extmajorpsdefname(String extMajorPSDEFName){
        this.setExtMajorPSDEFName(extMajorPSDEFName);
        return this;
    }

    /**
     * <B>EXTMINORPSDEFID</B>&nbsp;当前实体附加约束属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_EXTMINORPSDEFID = "extminorpsdefid";

    /**
     * 设置 当前实体附加约束属性
     * 
     * @param extMinorPSDEFId
     * 
     */
    @JsonProperty(FIELD_EXTMINORPSDEFID)
    public void setExtMinorPSDEFId(String extMinorPSDEFId){
        this.set(FIELD_EXTMINORPSDEFID, extMinorPSDEFId);
    }
    
    /**
     * 获取 当前实体附加约束属性  
     * @return
     */
    @JsonIgnore
    public String getExtMinorPSDEFId(){
        Object objValue = this.get(FIELD_EXTMINORPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 当前实体附加约束属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExtMinorPSDEFIdDirty(){
        if(this.contains(FIELD_EXTMINORPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 当前实体附加约束属性
     */
    @JsonIgnore
    public void resetExtMinorPSDEFId(){
        this.reset(FIELD_EXTMINORPSDEFID);
    }

    /**
     * 设置 当前实体附加约束属性
     * <P>
     * 等同 {@link #setExtMinorPSDEFId}
     * @param extMinorPSDEFId
     */
    @JsonIgnore
    public PSDEFVRCondDTO extminorpsdefid(String extMinorPSDEFId){
        this.setExtMinorPSDEFId(extMinorPSDEFId);
        return this;
    }

    /**
     * 设置 当前实体附加约束属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setExtMinorPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDEFVRCondDTO extminorpsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setExtMinorPSDEFId(null);
            this.setExtMinorPSDEFName(null);
        }
        else{
            this.setExtMinorPSDEFId(pSDEField.getPSDEFieldId());
            this.setExtMinorPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>EXTMINORPSDEFNAME</B>&nbsp;当前实体附加约束属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_EXTMINORPSDEFID}
     */
    public final static String FIELD_EXTMINORPSDEFNAME = "extminorpsdefname";

    /**
     * 设置 当前实体附加约束属性
     * 
     * @param extMinorPSDEFName
     * 
     */
    @JsonProperty(FIELD_EXTMINORPSDEFNAME)
    public void setExtMinorPSDEFName(String extMinorPSDEFName){
        this.set(FIELD_EXTMINORPSDEFNAME, extMinorPSDEFName);
    }
    
    /**
     * 获取 当前实体附加约束属性  
     * @return
     */
    @JsonIgnore
    public String getExtMinorPSDEFName(){
        Object objValue = this.get(FIELD_EXTMINORPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 当前实体附加约束属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExtMinorPSDEFNameDirty(){
        if(this.contains(FIELD_EXTMINORPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 当前实体附加约束属性
     */
    @JsonIgnore
    public void resetExtMinorPSDEFName(){
        this.reset(FIELD_EXTMINORPSDEFNAME);
    }

    /**
     * 设置 当前实体附加约束属性
     * <P>
     * 等同 {@link #setExtMinorPSDEFName}
     * @param extMinorPSDEFName
     */
    @JsonIgnore
    public PSDEFVRCondDTO extminorpsdefname(String extMinorPSDEFName){
        this.setExtMinorPSDEFName(extMinorPSDEFName);
        return this;
    }

    /**
     * <B>GROUPNOTFLAG</B>&nbsp;逻辑取反，指定条件逻辑是否进行取反处理，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_GROUPNOTFLAG = "groupnotflag";

    /**
     * 设置 逻辑取反，详细说明：{@link #FIELD_GROUPNOTFLAG}
     * 
     * @param groupNotFlag
     * 
     */
    @JsonProperty(FIELD_GROUPNOTFLAG)
    public void setGroupNotFlag(Integer groupNotFlag){
        this.set(FIELD_GROUPNOTFLAG, groupNotFlag);
    }
    
    /**
     * 获取 逻辑取反  
     * @return
     */
    @JsonIgnore
    public Integer getGroupNotFlag(){
        Object objValue = this.get(FIELD_GROUPNOTFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 逻辑取反 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupNotFlagDirty(){
        if(this.contains(FIELD_GROUPNOTFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 逻辑取反
     */
    @JsonIgnore
    public void resetGroupNotFlag(){
        this.reset(FIELD_GROUPNOTFLAG);
    }

    /**
     * 设置 逻辑取反，详细说明：{@link #FIELD_GROUPNOTFLAG}
     * <P>
     * 等同 {@link #setGroupNotFlag}
     * @param groupNotFlag
     */
    @JsonIgnore
    public PSDEFVRCondDTO groupnotflag(Integer groupNotFlag){
        this.setGroupNotFlag(groupNotFlag);
        return this;
    }

     /**
     * 设置 逻辑取反，详细说明：{@link #FIELD_GROUPNOTFLAG}
     * <P>
     * 等同 {@link #setGroupNotFlag}
     * @param groupNotFlag
     */
    @JsonIgnore
    public PSDEFVRCondDTO groupnotflag(Boolean groupNotFlag){
        if(groupNotFlag == null){
            this.setGroupNotFlag(null);
        }
        else{
            this.setGroupNotFlag(groupNotFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>GROUPOP</B>&nbsp;组合方式，指定组条件的逻辑
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.GroupCondOP} 
     */
    public final static String FIELD_GROUPOP = "groupop";

    /**
     * 设置 组合方式，详细说明：{@link #FIELD_GROUPOP}
     * 
     * @param groupOP
     * 
     */
    @JsonProperty(FIELD_GROUPOP)
    public void setGroupOP(String groupOP){
        this.set(FIELD_GROUPOP, groupOP);
    }
    
    /**
     * 获取 组合方式  
     * @return
     */
    @JsonIgnore
    public String getGroupOP(){
        Object objValue = this.get(FIELD_GROUPOP);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 组合方式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupOPDirty(){
        if(this.contains(FIELD_GROUPOP)){
            return true;
        }
        return false;
    }

    /**
     * 重置 组合方式
     */
    @JsonIgnore
    public void resetGroupOP(){
        this.reset(FIELD_GROUPOP);
    }

    /**
     * 设置 组合方式，详细说明：{@link #FIELD_GROUPOP}
     * <P>
     * 等同 {@link #setGroupOP}
     * @param groupOP
     */
    @JsonIgnore
    public PSDEFVRCondDTO groupop(String groupOP){
        this.setGroupOP(groupOP);
        return this;
    }

     /**
     * 设置 组合方式，详细说明：{@link #FIELD_GROUPOP}
     * <P>
     * 等同 {@link #setGroupOP}
     * @param groupOP
     */
    @JsonIgnore
    public PSDEFVRCondDTO groupop(net.ibizsys.model.PSModelEnums.GroupCondOP groupOP){
        if(groupOP == null){
            this.setGroupOP(null);
        }
        else{
            this.setGroupOP(groupOP.value);
        }
        return this;
    }

    /**
     * <B>KEYCONDFLAG</B>&nbsp;关键条件，指定条件项是否为关键条件，关键条件在逻辑不满足时将判定整个规则失败，不管是否被或（OR）的条件组包括。未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_KEYCONDFLAG = "keycondflag";

    /**
     * 设置 关键条件，详细说明：{@link #FIELD_KEYCONDFLAG}
     * 
     * @param keyCondFlag
     * 
     */
    @JsonProperty(FIELD_KEYCONDFLAG)
    public void setKeyCondFlag(Integer keyCondFlag){
        this.set(FIELD_KEYCONDFLAG, keyCondFlag);
    }
    
    /**
     * 获取 关键条件  
     * @return
     */
    @JsonIgnore
    public Integer getKeyCondFlag(){
        Object objValue = this.get(FIELD_KEYCONDFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 关键条件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isKeyCondFlagDirty(){
        if(this.contains(FIELD_KEYCONDFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关键条件
     */
    @JsonIgnore
    public void resetKeyCondFlag(){
        this.reset(FIELD_KEYCONDFLAG);
    }

    /**
     * 设置 关键条件，详细说明：{@link #FIELD_KEYCONDFLAG}
     * <P>
     * 等同 {@link #setKeyCondFlag}
     * @param keyCondFlag
     */
    @JsonIgnore
    public PSDEFVRCondDTO keycondflag(Integer keyCondFlag){
        this.setKeyCondFlag(keyCondFlag);
        return this;
    }

     /**
     * 设置 关键条件，详细说明：{@link #FIELD_KEYCONDFLAG}
     * <P>
     * 等同 {@link #setKeyCondFlag}
     * @param keyCondFlag
     */
    @JsonIgnore
    public PSDEFVRCondDTO keycondflag(Boolean keyCondFlag){
        if(keyCondFlag == null){
            this.setKeyCondFlag(null);
        }
        else{
            this.setKeyCondFlag(keyCondFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>MAJORPSDEDSID</B>&nbsp;数据集，指定数据集范围条件的数据集合
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO} 
     */
    public final static String FIELD_MAJORPSDEDSID = "majorpsdedsid";

    /**
     * 设置 数据集，详细说明：{@link #FIELD_MAJORPSDEDSID}
     * 
     * @param majorPSDEDSId
     * 
     */
    @JsonProperty(FIELD_MAJORPSDEDSID)
    public void setMajorPSDEDSId(String majorPSDEDSId){
        this.set(FIELD_MAJORPSDEDSID, majorPSDEDSId);
        //属性名称与代码标识不一致，设置属性名称
        this.set("majorpsdedstid", majorPSDEDSId);
    }
    
    /**
     * 获取 数据集  
     * @return
     */
    @JsonIgnore
    public String getMajorPSDEDSId(){
        Object objValue = this.get(FIELD_MAJORPSDEDSID);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("majorpsdedstid");
            if(objValue == null){
                    return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 数据集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMajorPSDEDSIdDirty(){
        if(this.contains(FIELD_MAJORPSDEDSID)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("majorpsdedstid")){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据集
     */
    @JsonIgnore
    public void resetMajorPSDEDSId(){
        this.reset(FIELD_MAJORPSDEDSID);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("majorpsdedstid");
    }

    /**
     * 设置 数据集，详细说明：{@link #FIELD_MAJORPSDEDSID}
     * <P>
     * 等同 {@link #setMajorPSDEDSId}
     * @param majorPSDEDSId
     */
    @JsonIgnore
    public PSDEFVRCondDTO majorpsdedsid(String majorPSDEDSId){
        this.setMajorPSDEDSId(majorPSDEDSId);
        return this;
    }

    /**
     * 设置 数据集，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMajorPSDEDSId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSDEFVRCondDTO majorpsdedsid(PSDEDataSetDTO pSDEDataSet){
        if(pSDEDataSet == null){
            this.setMajorPSDEDSId(null);
            this.setMajorPSDEDSName(null);
        }
        else{
            this.setMajorPSDEDSId(pSDEDataSet.getPSDEDataSetId());
            this.setMajorPSDEDSName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    /**
     * <B>MAJORPSDEDSNAME</B>&nbsp;数据集，指定数据集范围条件的数据集合
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MAJORPSDEDSID}
     */
    public final static String FIELD_MAJORPSDEDSNAME = "majorpsdedsname";

    /**
     * 设置 数据集，详细说明：{@link #FIELD_MAJORPSDEDSNAME}
     * 
     * @param majorPSDEDSName
     * 
     */
    @JsonProperty(FIELD_MAJORPSDEDSNAME)
    public void setMajorPSDEDSName(String majorPSDEDSName){
        this.set(FIELD_MAJORPSDEDSNAME, majorPSDEDSName);
        //属性名称与代码标识不一致，设置属性名称
        this.set("majorpsdedstname", majorPSDEDSName);
    }
    
    /**
     * 获取 数据集  
     * @return
     */
    @JsonIgnore
    public String getMajorPSDEDSName(){
        Object objValue = this.get(FIELD_MAJORPSDEDSNAME);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("majorpsdedstname");
            if(objValue == null){
                    return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 数据集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMajorPSDEDSNameDirty(){
        if(this.contains(FIELD_MAJORPSDEDSNAME)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("majorpsdedstname")){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据集
     */
    @JsonIgnore
    public void resetMajorPSDEDSName(){
        this.reset(FIELD_MAJORPSDEDSNAME);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("majorpsdedstname");
    }

    /**
     * 设置 数据集，详细说明：{@link #FIELD_MAJORPSDEDSNAME}
     * <P>
     * 等同 {@link #setMajorPSDEDSName}
     * @param majorPSDEDSName
     */
    @JsonIgnore
    public PSDEFVRCondDTO majorpsdedsname(String majorPSDEDSName){
        this.setMajorPSDEDSName(majorPSDEDSName);
        return this;
    }

    /**
     * <B>MAJORPSDEID</B>&nbsp;数据集实体，指定数据集范围条件的数据集合所在的实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDataEntityDTO} 
     */
    public final static String FIELD_MAJORPSDEID = "majorpsdeid";

    /**
     * 设置 数据集实体，详细说明：{@link #FIELD_MAJORPSDEID}
     * 
     * @param majorPSDEId
     * 
     */
    @JsonProperty(FIELD_MAJORPSDEID)
    public void setMajorPSDEId(String majorPSDEId){
        this.set(FIELD_MAJORPSDEID, majorPSDEId);
    }
    
    /**
     * 获取 数据集实体  
     * @return
     */
    @JsonIgnore
    public String getMajorPSDEId(){
        Object objValue = this.get(FIELD_MAJORPSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据集实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMajorPSDEIdDirty(){
        if(this.contains(FIELD_MAJORPSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据集实体
     */
    @JsonIgnore
    public void resetMajorPSDEId(){
        this.reset(FIELD_MAJORPSDEID);
    }

    /**
     * 设置 数据集实体，详细说明：{@link #FIELD_MAJORPSDEID}
     * <P>
     * 等同 {@link #setMajorPSDEId}
     * @param majorPSDEId
     */
    @JsonIgnore
    public PSDEFVRCondDTO majorpsdeid(String majorPSDEId){
        this.setMajorPSDEId(majorPSDEId);
        return this;
    }

    /**
     * 设置 数据集实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMajorPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDEFVRCondDTO majorpsdeid(PSDataEntityDTO pSDataEntity){
        if(pSDataEntity == null){
            this.setMajorPSDEId(null);
            this.setMajorPSDEName(null);
        }
        else{
            this.setMajorPSDEId(pSDataEntity.getPSDataEntityId());
            this.setMajorPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>MAJORPSDENAME</B>&nbsp;数据集实体，指定数据集范围条件的数据集合所在的实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MAJORPSDEID}
     */
    public final static String FIELD_MAJORPSDENAME = "majorpsdename";

    /**
     * 设置 数据集实体，详细说明：{@link #FIELD_MAJORPSDENAME}
     * 
     * @param majorPSDEName
     * 
     */
    @JsonProperty(FIELD_MAJORPSDENAME)
    public void setMajorPSDEName(String majorPSDEName){
        this.set(FIELD_MAJORPSDENAME, majorPSDEName);
    }
    
    /**
     * 获取 数据集实体  
     * @return
     */
    @JsonIgnore
    public String getMajorPSDEName(){
        Object objValue = this.get(FIELD_MAJORPSDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据集实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMajorPSDENameDirty(){
        if(this.contains(FIELD_MAJORPSDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据集实体
     */
    @JsonIgnore
    public void resetMajorPSDEName(){
        this.reset(FIELD_MAJORPSDENAME);
    }

    /**
     * 设置 数据集实体，详细说明：{@link #FIELD_MAJORPSDENAME}
     * <P>
     * 等同 {@link #setMajorPSDEName}
     * @param majorPSDEName
     */
    @JsonIgnore
    public PSDEFVRCondDTO majorpsdename(String majorPSDEName){
        this.setMajorPSDEName(majorPSDEName);
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
    public PSDEFVRCondDTO memo(String memo){
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
    public PSDEFVRCondDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PARAM</B>&nbsp;参数1，指定条件动态参数，由各条件类型解释
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_PARAM = "param";

    /**
     * 设置 参数1，详细说明：{@link #FIELD_PARAM}
     * 
     * @param param
     * 
     */
    @JsonProperty(FIELD_PARAM)
    public void setParam(String param){
        this.set(FIELD_PARAM, param);
    }
    
    /**
     * 获取 参数1  
     * @return
     */
    @JsonIgnore
    public String getParam(){
        Object objValue = this.get(FIELD_PARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数1 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamDirty(){
        if(this.contains(FIELD_PARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数1
     */
    @JsonIgnore
    public void resetParam(){
        this.reset(FIELD_PARAM);
    }

    /**
     * 设置 参数1，详细说明：{@link #FIELD_PARAM}
     * <P>
     * 等同 {@link #setParam}
     * @param param
     */
    @JsonIgnore
    public PSDEFVRCondDTO param(String param){
        this.setParam(param);
        return this;
    }

    /**
     * <B>PARAM10</B>&nbsp;参数10，指定条件动态参数10，由各条件类型解释
     */
    public final static String FIELD_PARAM10 = "param10";

    /**
     * 设置 参数10，详细说明：{@link #FIELD_PARAM10}
     * 
     * @param param10
     * 
     */
    @JsonProperty(FIELD_PARAM10)
    public void setParam10(Integer param10){
        this.set(FIELD_PARAM10, param10);
    }
    
    /**
     * 获取 参数10  
     * @return
     */
    @JsonIgnore
    public Integer getParam10(){
        Object objValue = this.get(FIELD_PARAM10);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 参数10 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParam10Dirty(){
        if(this.contains(FIELD_PARAM10)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数10
     */
    @JsonIgnore
    public void resetParam10(){
        this.reset(FIELD_PARAM10);
    }

    /**
     * 设置 参数10，详细说明：{@link #FIELD_PARAM10}
     * <P>
     * 等同 {@link #setParam10}
     * @param param10
     */
    @JsonIgnore
    public PSDEFVRCondDTO param10(Integer param10){
        this.setParam10(param10);
        return this;
    }

    /**
     * <B>PARAM2</B>&nbsp;参数2，指定条件动态参数2，由各条件类型解释
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_PARAM2 = "param2";

    /**
     * 设置 参数2，详细说明：{@link #FIELD_PARAM2}
     * 
     * @param param2
     * 
     */
    @JsonProperty(FIELD_PARAM2)
    public void setParam2(String param2){
        this.set(FIELD_PARAM2, param2);
    }
    
    /**
     * 获取 参数2  
     * @return
     */
    @JsonIgnore
    public String getParam2(){
        Object objValue = this.get(FIELD_PARAM2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParam2Dirty(){
        if(this.contains(FIELD_PARAM2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数2
     */
    @JsonIgnore
    public void resetParam2(){
        this.reset(FIELD_PARAM2);
    }

    /**
     * 设置 参数2，详细说明：{@link #FIELD_PARAM2}
     * <P>
     * 等同 {@link #setParam2}
     * @param param2
     */
    @JsonIgnore
    public PSDEFVRCondDTO param2(String param2){
        this.setParam2(param2);
        return this;
    }

    /**
     * <B>PARAM3</B>&nbsp;参数3，指定条件动态参数3，由各条件类型解释
     */
    public final static String FIELD_PARAM3 = "param3";

    /**
     * 设置 参数3，详细说明：{@link #FIELD_PARAM3}
     * 
     * @param param3
     * 
     */
    @JsonProperty(FIELD_PARAM3)
    public void setParam3(Integer param3){
        this.set(FIELD_PARAM3, param3);
    }
    
    /**
     * 获取 参数3  
     * @return
     */
    @JsonIgnore
    public Integer getParam3(){
        Object objValue = this.get(FIELD_PARAM3);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 参数3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParam3Dirty(){
        if(this.contains(FIELD_PARAM3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数3
     */
    @JsonIgnore
    public void resetParam3(){
        this.reset(FIELD_PARAM3);
    }

    /**
     * 设置 参数3，详细说明：{@link #FIELD_PARAM3}
     * <P>
     * 等同 {@link #setParam3}
     * @param param3
     */
    @JsonIgnore
    public PSDEFVRCondDTO param3(Integer param3){
        this.setParam3(param3);
        return this;
    }

    /**
     * <B>PARAM4</B>&nbsp;参数4，指定条件动态参数4，由各条件类型解释
     */
    public final static String FIELD_PARAM4 = "param4";

    /**
     * 设置 参数4，详细说明：{@link #FIELD_PARAM4}
     * 
     * @param param4
     * 
     */
    @JsonProperty(FIELD_PARAM4)
    public void setParam4(Integer param4){
        this.set(FIELD_PARAM4, param4);
    }
    
    /**
     * 获取 参数4  
     * @return
     */
    @JsonIgnore
    public Integer getParam4(){
        Object objValue = this.get(FIELD_PARAM4);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 参数4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParam4Dirty(){
        if(this.contains(FIELD_PARAM4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数4
     */
    @JsonIgnore
    public void resetParam4(){
        this.reset(FIELD_PARAM4);
    }

    /**
     * 设置 参数4，详细说明：{@link #FIELD_PARAM4}
     * <P>
     * 等同 {@link #setParam4}
     * @param param4
     */
    @JsonIgnore
    public PSDEFVRCondDTO param4(Integer param4){
        this.setParam4(param4);
        return this;
    }

    /**
     * <B>PARAM5</B>&nbsp;参数5，指定条件动态参数5，由各条件类型解释
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_PARAM5 = "param5";

    /**
     * 设置 参数5，详细说明：{@link #FIELD_PARAM5}
     * 
     * @param param5
     * 
     */
    @JsonProperty(FIELD_PARAM5)
    public void setParam5(Integer param5){
        this.set(FIELD_PARAM5, param5);
    }
    
    /**
     * 获取 参数5  
     * @return
     */
    @JsonIgnore
    public Integer getParam5(){
        Object objValue = this.get(FIELD_PARAM5);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 参数5 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParam5Dirty(){
        if(this.contains(FIELD_PARAM5)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数5
     */
    @JsonIgnore
    public void resetParam5(){
        this.reset(FIELD_PARAM5);
    }

    /**
     * 设置 参数5，详细说明：{@link #FIELD_PARAM5}
     * <P>
     * 等同 {@link #setParam5}
     * @param param5
     */
    @JsonIgnore
    public PSDEFVRCondDTO param5(Integer param5){
        this.setParam5(param5);
        return this;
    }

     /**
     * 设置 参数5，详细说明：{@link #FIELD_PARAM5}
     * <P>
     * 等同 {@link #setParam5}
     * @param param5
     */
    @JsonIgnore
    public PSDEFVRCondDTO param5(Boolean param5){
        if(param5 == null){
            this.setParam5(null);
        }
        else{
            this.setParam5(param5?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>PARAM6</B>&nbsp;参数6，指定条件动态参数6，由各条件类型解释
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_PARAM6 = "param6";

    /**
     * 设置 参数6，详细说明：{@link #FIELD_PARAM6}
     * 
     * @param param6
     * 
     */
    @JsonProperty(FIELD_PARAM6)
    public void setParam6(Integer param6){
        this.set(FIELD_PARAM6, param6);
    }
    
    /**
     * 获取 参数6  
     * @return
     */
    @JsonIgnore
    public Integer getParam6(){
        Object objValue = this.get(FIELD_PARAM6);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 参数6 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParam6Dirty(){
        if(this.contains(FIELD_PARAM6)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数6
     */
    @JsonIgnore
    public void resetParam6(){
        this.reset(FIELD_PARAM6);
    }

    /**
     * 设置 参数6，详细说明：{@link #FIELD_PARAM6}
     * <P>
     * 等同 {@link #setParam6}
     * @param param6
     */
    @JsonIgnore
    public PSDEFVRCondDTO param6(Integer param6){
        this.setParam6(param6);
        return this;
    }

     /**
     * 设置 参数6，详细说明：{@link #FIELD_PARAM6}
     * <P>
     * 等同 {@link #setParam6}
     * @param param6
     */
    @JsonIgnore
    public PSDEFVRCondDTO param6(Boolean param6){
        if(param6 == null){
            this.setParam6(null);
        }
        else{
            this.setParam6(param6?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>PARAM7</B>&nbsp;参数7，指定条件动态参数7，由各条件类型解释
     */
    public final static String FIELD_PARAM7 = "param7";

    /**
     * 设置 参数7，详细说明：{@link #FIELD_PARAM7}
     * 
     * @param param7
     * 
     */
    @JsonProperty(FIELD_PARAM7)
    public void setParam7(BigDecimal param7){
        this.set(FIELD_PARAM7, param7);
    }
    
    /**
     * 获取 参数7  
     * @return
     */
    @JsonIgnore
    public BigDecimal getParam7(){
        Object objValue = this.get(FIELD_PARAM7);
        if(objValue==null){
            return null;
        }
        return (BigDecimal)objValue;
    }

    /**
     * 判断 参数7 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParam7Dirty(){
        if(this.contains(FIELD_PARAM7)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数7
     */
    @JsonIgnore
    public void resetParam7(){
        this.reset(FIELD_PARAM7);
    }

    /**
     * 设置 参数7，详细说明：{@link #FIELD_PARAM7}
     * <P>
     * 等同 {@link #setParam7}
     * @param param7
     */
    @JsonIgnore
    public PSDEFVRCondDTO param7(BigDecimal param7){
        this.setParam7(param7);
        return this;
    }

    /**
     * <B>PARAM8</B>&nbsp;参数8，指定条件动态参数8，由各条件类型解释
     */
    public final static String FIELD_PARAM8 = "param8";

    /**
     * 设置 参数8，详细说明：{@link #FIELD_PARAM8}
     * 
     * @param param8
     * 
     */
    @JsonProperty(FIELD_PARAM8)
    public void setParam8(BigDecimal param8){
        this.set(FIELD_PARAM8, param8);
    }
    
    /**
     * 获取 参数8  
     * @return
     */
    @JsonIgnore
    public BigDecimal getParam8(){
        Object objValue = this.get(FIELD_PARAM8);
        if(objValue==null){
            return null;
        }
        return (BigDecimal)objValue;
    }

    /**
     * 判断 参数8 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParam8Dirty(){
        if(this.contains(FIELD_PARAM8)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数8
     */
    @JsonIgnore
    public void resetParam8(){
        this.reset(FIELD_PARAM8);
    }

    /**
     * 设置 参数8，详细说明：{@link #FIELD_PARAM8}
     * <P>
     * 等同 {@link #setParam8}
     * @param param8
     */
    @JsonIgnore
    public PSDEFVRCondDTO param8(BigDecimal param8){
        this.setParam8(param8);
        return this;
    }

    /**
     * <B>PARAM9</B>&nbsp;参数9，指定条件动态参数9，由各条件类型解释
     */
    public final static String FIELD_PARAM9 = "param9";

    /**
     * 设置 参数9，详细说明：{@link #FIELD_PARAM9}
     * 
     * @param param9
     * 
     */
    @JsonProperty(FIELD_PARAM9)
    public void setParam9(Integer param9){
        this.set(FIELD_PARAM9, param9);
    }
    
    /**
     * 获取 参数9  
     * @return
     */
    @JsonIgnore
    public Integer getParam9(){
        Object objValue = this.get(FIELD_PARAM9);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 参数9 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParam9Dirty(){
        if(this.contains(FIELD_PARAM9)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数9
     */
    @JsonIgnore
    public void resetParam9(){
        this.reset(FIELD_PARAM9);
    }

    /**
     * 设置 参数9，详细说明：{@link #FIELD_PARAM9}
     * <P>
     * 等同 {@link #setParam9}
     * @param param9
     */
    @JsonIgnore
    public PSDEFVRCondDTO param9(Integer param9){
        this.setParam9(param9);
        return this;
    }

    /**
     * <B>PARAMTYPE</B>&nbsp;参数类型，指定条件参数类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DEFVRParamType} 
     */
    public final static String FIELD_PARAMTYPE = "paramtype";

    /**
     * 设置 参数类型，详细说明：{@link #FIELD_PARAMTYPE}
     * 
     * @param paramType
     * 
     */
    @JsonProperty(FIELD_PARAMTYPE)
    public void setParamType(String paramType){
        this.set(FIELD_PARAMTYPE, paramType);
    }
    
    /**
     * 获取 参数类型  
     * @return
     */
    @JsonIgnore
    public String getParamType(){
        Object objValue = this.get(FIELD_PARAMTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamTypeDirty(){
        if(this.contains(FIELD_PARAMTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数类型
     */
    @JsonIgnore
    public void resetParamType(){
        this.reset(FIELD_PARAMTYPE);
    }

    /**
     * 设置 参数类型，详细说明：{@link #FIELD_PARAMTYPE}
     * <P>
     * 等同 {@link #setParamType}
     * @param paramType
     */
    @JsonIgnore
    public PSDEFVRCondDTO paramtype(String paramType){
        this.setParamType(paramType);
        return this;
    }

     /**
     * 设置 参数类型，详细说明：{@link #FIELD_PARAMTYPE}
     * <P>
     * 等同 {@link #setParamType}
     * @param paramType
     */
    @JsonIgnore
    public PSDEFVRCondDTO paramtype(net.ibizsys.model.PSModelEnums.DEFVRParamType paramType){
        if(paramType == null){
            this.setParamType(null);
        }
        else{
            this.setParamType(paramType.value);
        }
        return this;
    }

    /**
     * <B>PPSDEFVRCONDID</B>&nbsp;父条件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFVRCondDTO} 
     */
    public final static String FIELD_PPSDEFVRCONDID = "ppsdefvrcondid";

    /**
     * 设置 父条件
     * 
     * @param pPSDEFVRCondId
     * 
     */
    @JsonProperty(FIELD_PPSDEFVRCONDID)
    public void setPPSDEFVRCondId(String pPSDEFVRCondId){
        this.set(FIELD_PPSDEFVRCONDID, pPSDEFVRCondId);
    }
    
    /**
     * 获取 父条件  
     * @return
     */
    @JsonIgnore
    public String getPPSDEFVRCondId(){
        Object objValue = this.get(FIELD_PPSDEFVRCONDID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父条件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSDEFVRCondIdDirty(){
        if(this.contains(FIELD_PPSDEFVRCONDID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父条件
     */
    @JsonIgnore
    public void resetPPSDEFVRCondId(){
        this.reset(FIELD_PPSDEFVRCONDID);
    }

    /**
     * 设置 父条件
     * <P>
     * 等同 {@link #setPPSDEFVRCondId}
     * @param pPSDEFVRCondId
     */
    @JsonIgnore
    public PSDEFVRCondDTO ppsdefvrcondid(String pPSDEFVRCondId){
        this.setPPSDEFVRCondId(pPSDEFVRCondId);
        return this;
    }

    /**
     * 设置 父条件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPPSDEFVRCondId}
     * @param pSDEFVRCond 引用对象
     */
    @JsonIgnore
    public PSDEFVRCondDTO ppsdefvrcondid(PSDEFVRCondDTO pSDEFVRCond){
        if(pSDEFVRCond == null){
            this.setPPSDEFVRCondId(null);
            this.setPPSDEFVRCondName(null);
        }
        else{
            this.setPPSDEFVRCondId(pSDEFVRCond.getPSDEFVRCondId());
            this.setPPSDEFVRCondName(pSDEFVRCond.getPSDEFVRCondName());
        }
        return this;
    }

    /**
     * <B>PPSDEFVRCONDNAME</B>&nbsp;父条件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PPSDEFVRCONDID}
     */
    public final static String FIELD_PPSDEFVRCONDNAME = "ppsdefvrcondname";

    /**
     * 设置 父条件
     * 
     * @param pPSDEFVRCondName
     * 
     */
    @JsonProperty(FIELD_PPSDEFVRCONDNAME)
    public void setPPSDEFVRCondName(String pPSDEFVRCondName){
        this.set(FIELD_PPSDEFVRCONDNAME, pPSDEFVRCondName);
    }
    
    /**
     * 获取 父条件  
     * @return
     */
    @JsonIgnore
    public String getPPSDEFVRCondName(){
        Object objValue = this.get(FIELD_PPSDEFVRCONDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父条件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSDEFVRCondNameDirty(){
        if(this.contains(FIELD_PPSDEFVRCONDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父条件
     */
    @JsonIgnore
    public void resetPPSDEFVRCondName(){
        this.reset(FIELD_PPSDEFVRCONDNAME);
    }

    /**
     * 设置 父条件
     * <P>
     * 等同 {@link #setPPSDEFVRCondName}
     * @param pPSDEFVRCondName
     */
    @JsonIgnore
    public PSDEFVRCondDTO ppsdefvrcondname(String pPSDEFVRCondName){
        this.setPPSDEFVRCondName(pPSDEFVRCondName);
        return this;
    }

    /**
     * <B>PSDBVALUEOPID</B>&nbsp;操作符号，指定值规则条件的操作符
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDBVALUEOPID = "psdbvalueopid";

    /**
     * 设置 操作符号，详细说明：{@link #FIELD_PSDBVALUEOPID}
     * 
     * @param pSDBValueOPId
     * 
     */
    @JsonProperty(FIELD_PSDBVALUEOPID)
    public void setPSDBValueOPId(String pSDBValueOPId){
        this.set(FIELD_PSDBVALUEOPID, pSDBValueOPId);
    }
    
    /**
     * 获取 操作符号  
     * @return
     */
    @JsonIgnore
    public String getPSDBValueOPId(){
        Object objValue = this.get(FIELD_PSDBVALUEOPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作符号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDBValueOPIdDirty(){
        if(this.contains(FIELD_PSDBVALUEOPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作符号
     */
    @JsonIgnore
    public void resetPSDBValueOPId(){
        this.reset(FIELD_PSDBVALUEOPID);
    }

    /**
     * 设置 操作符号，详细说明：{@link #FIELD_PSDBVALUEOPID}
     * <P>
     * 等同 {@link #setPSDBValueOPId}
     * @param pSDBValueOPId
     */
    @JsonIgnore
    public PSDEFVRCondDTO psdbvalueopid(String pSDBValueOPId){
        this.setPSDBValueOPId(pSDBValueOPId);
        return this;
    }

    /**
     * <B>PSDBVALUEOPNAME</B>&nbsp;操作符号，指定值规则条件的操作符
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDBVALUEOPID}
     */
    public final static String FIELD_PSDBVALUEOPNAME = "psdbvalueopname";

    /**
     * 设置 操作符号，详细说明：{@link #FIELD_PSDBVALUEOPNAME}
     * 
     * @param pSDBValueOPName
     * 
     */
    @JsonProperty(FIELD_PSDBVALUEOPNAME)
    public void setPSDBValueOPName(String pSDBValueOPName){
        this.set(FIELD_PSDBVALUEOPNAME, pSDBValueOPName);
    }
    
    /**
     * 获取 操作符号  
     * @return
     */
    @JsonIgnore
    public String getPSDBValueOPName(){
        Object objValue = this.get(FIELD_PSDBVALUEOPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作符号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDBValueOPNameDirty(){
        if(this.contains(FIELD_PSDBVALUEOPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作符号
     */
    @JsonIgnore
    public void resetPSDBValueOPName(){
        this.reset(FIELD_PSDBVALUEOPNAME);
    }

    /**
     * 设置 操作符号，详细说明：{@link #FIELD_PSDBVALUEOPNAME}
     * <P>
     * 等同 {@link #setPSDBValueOPName}
     * @param pSDBValueOPName
     */
    @JsonIgnore
    public PSDEFVRCondDTO psdbvalueopname(String pSDBValueOPName){
        this.setPSDBValueOPName(pSDBValueOPName);
        return this;
    }

    /**
     * <B>PSDEDQID</B>&nbsp;实体数据查询，指定计数使用的实体数据查询
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEDataQueryDTO} 
     */
    public final static String FIELD_PSDEDQID = "psdedqid";

    /**
     * 设置 实体数据查询，详细说明：{@link #FIELD_PSDEDQID}
     * 
     * @param pSDEDQId
     * 
     */
    @JsonProperty(FIELD_PSDEDQID)
    public void setPSDEDQId(String pSDEDQId){
        this.set(FIELD_PSDEDQID, pSDEDQId);
    }
    
    /**
     * 获取 实体数据查询  
     * @return
     */
    @JsonIgnore
    public String getPSDEDQId(){
        Object objValue = this.get(FIELD_PSDEDQID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据查询 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDQIdDirty(){
        if(this.contains(FIELD_PSDEDQID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据查询
     */
    @JsonIgnore
    public void resetPSDEDQId(){
        this.reset(FIELD_PSDEDQID);
    }

    /**
     * 设置 实体数据查询，详细说明：{@link #FIELD_PSDEDQID}
     * <P>
     * 等同 {@link #setPSDEDQId}
     * @param pSDEDQId
     */
    @JsonIgnore
    public PSDEFVRCondDTO psdedqid(String pSDEDQId){
        this.setPSDEDQId(pSDEDQId);
        return this;
    }

    /**
     * 设置 实体数据查询，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDQId}
     * @param pSDEDataQuery 引用对象
     */
    @JsonIgnore
    public PSDEFVRCondDTO psdedqid(PSDEDataQueryDTO pSDEDataQuery){
        if(pSDEDataQuery == null){
            this.setPSDEDQId(null);
            this.setPSDEDQName(null);
        }
        else{
            this.setPSDEDQId(pSDEDataQuery.getPSDEDataQueryId());
            this.setPSDEDQName(pSDEDataQuery.getPSDEDataQueryName());
        }
        return this;
    }

    /**
     * <B>PSDEDQNAME</B>&nbsp;实体数据查询，指定计数使用的实体数据查询
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDQID}
     */
    public final static String FIELD_PSDEDQNAME = "psdedqname";

    /**
     * 设置 实体数据查询，详细说明：{@link #FIELD_PSDEDQNAME}
     * 
     * @param pSDEDQName
     * 
     */
    @JsonProperty(FIELD_PSDEDQNAME)
    public void setPSDEDQName(String pSDEDQName){
        this.set(FIELD_PSDEDQNAME, pSDEDQName);
    }
    
    /**
     * 获取 实体数据查询  
     * @return
     */
    @JsonIgnore
    public String getPSDEDQName(){
        Object objValue = this.get(FIELD_PSDEDQNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据查询 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDQNameDirty(){
        if(this.contains(FIELD_PSDEDQNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据查询
     */
    @JsonIgnore
    public void resetPSDEDQName(){
        this.reset(FIELD_PSDEDQNAME);
    }

    /**
     * 设置 实体数据查询，详细说明：{@link #FIELD_PSDEDQNAME}
     * <P>
     * 等同 {@link #setPSDEDQName}
     * @param pSDEDQName
     */
    @JsonIgnore
    public PSDEFVRCondDTO psdedqname(String pSDEDQName){
        this.setPSDEDQName(pSDEDQName);
        return this;
    }

    /**
     * <B>PSDEFID</B>&nbsp;实体属性，指定值规则条件的判断属性，不指定时使用值规则的属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
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
    public PSDEFVRCondDTO psdefid(String pSDEFId){
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
    public PSDEFVRCondDTO psdefid(PSDEFieldDTO pSDEField){
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
     * <B>PSDEFNAME</B>&nbsp;实体属性，指定值规则条件的判断属性，不指定时使用值规则的属性
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
    public PSDEFVRCondDTO psdefname(String pSDEFName){
        this.setPSDEFName(pSDEFName);
        return this;
    }

    /**
     * <B>PSDEFVRCONDID</B>&nbsp;实体属性值规则条件标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEFVRCONDID = "psdefvrcondid";

    /**
     * 设置 实体属性值规则条件标识
     * 
     * @param pSDEFVRCondId
     * 
     */
    @JsonProperty(FIELD_PSDEFVRCONDID)
    public void setPSDEFVRCondId(String pSDEFVRCondId){
        this.set(FIELD_PSDEFVRCONDID, pSDEFVRCondId);
    }
    
    /**
     * 获取 实体属性值规则条件标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEFVRCondId(){
        Object objValue = this.get(FIELD_PSDEFVRCONDID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体属性值规则条件标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFVRCondIdDirty(){
        if(this.contains(FIELD_PSDEFVRCONDID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体属性值规则条件标识
     */
    @JsonIgnore
    public void resetPSDEFVRCondId(){
        this.reset(FIELD_PSDEFVRCONDID);
    }

    /**
     * 设置 实体属性值规则条件标识
     * <P>
     * 等同 {@link #setPSDEFVRCondId}
     * @param pSDEFVRCondId
     */
    @JsonIgnore
    public PSDEFVRCondDTO psdefvrcondid(String pSDEFVRCondId){
        this.setPSDEFVRCondId(pSDEFVRCondId);
        return this;
    }

    /**
     * <B>PSDEFVRCONDNAME</B>&nbsp;条件名称，指定值规则条件名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEFVRCONDNAME = "psdefvrcondname";

    /**
     * 设置 条件名称，详细说明：{@link #FIELD_PSDEFVRCONDNAME}
     * 
     * @param pSDEFVRCondName
     * 
     */
    @JsonProperty(FIELD_PSDEFVRCONDNAME)
    public void setPSDEFVRCondName(String pSDEFVRCondName){
        this.set(FIELD_PSDEFVRCONDNAME, pSDEFVRCondName);
    }
    
    /**
     * 获取 条件名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEFVRCondName(){
        Object objValue = this.get(FIELD_PSDEFVRCONDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 条件名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFVRCondNameDirty(){
        if(this.contains(FIELD_PSDEFVRCONDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 条件名称
     */
    @JsonIgnore
    public void resetPSDEFVRCondName(){
        this.reset(FIELD_PSDEFVRCONDNAME);
    }

    /**
     * 设置 条件名称，详细说明：{@link #FIELD_PSDEFVRCONDNAME}
     * <P>
     * 等同 {@link #setPSDEFVRCondName}
     * @param pSDEFVRCondName
     */
    @JsonIgnore
    public PSDEFVRCondDTO psdefvrcondname(String pSDEFVRCondName){
        this.setPSDEFVRCondName(pSDEFVRCondName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEFVRCondName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEFVRCondName(strName);
    }

    @JsonIgnore
    public PSDEFVRCondDTO name(String strName){
        this.setPSDEFVRCondName(strName);
        return this;
    }

    /**
     * <B>PSDEFVRID</B>&nbsp;属性值规则，指定条件所在的值规则对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFValueRuleDTO} 
     */
    public final static String FIELD_PSDEFVRID = "psdefvrid";

    /**
     * 设置 属性值规则，详细说明：{@link #FIELD_PSDEFVRID}
     * 
     * @param pSDEFVRId
     * 
     */
    @JsonProperty(FIELD_PSDEFVRID)
    public void setPSDEFVRId(String pSDEFVRId){
        this.set(FIELD_PSDEFVRID, pSDEFVRId);
    }
    
    /**
     * 获取 属性值规则  
     * @return
     */
    @JsonIgnore
    public String getPSDEFVRId(){
        Object objValue = this.get(FIELD_PSDEFVRID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性值规则 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFVRIdDirty(){
        if(this.contains(FIELD_PSDEFVRID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性值规则
     */
    @JsonIgnore
    public void resetPSDEFVRId(){
        this.reset(FIELD_PSDEFVRID);
    }

    /**
     * 设置 属性值规则，详细说明：{@link #FIELD_PSDEFVRID}
     * <P>
     * 等同 {@link #setPSDEFVRId}
     * @param pSDEFVRId
     */
    @JsonIgnore
    public PSDEFVRCondDTO psdefvrid(String pSDEFVRId){
        this.setPSDEFVRId(pSDEFVRId);
        return this;
    }

    /**
     * 设置 属性值规则，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEFVRId}
     * @param pSDEFValueRule 引用对象
     */
    @JsonIgnore
    public PSDEFVRCondDTO psdefvrid(PSDEFValueRuleDTO pSDEFValueRule){
        if(pSDEFValueRule == null){
            this.setPSDEFVRId(null);
            this.setPSDEFVRName(null);
        }
        else{
            this.setPSDEFVRId(pSDEFValueRule.getPSDEFValueRuleId());
            this.setPSDEFVRName(pSDEFValueRule.getPSDEFValueRuleName());
        }
        return this;
    }

    /**
     * <B>PSDEFVRNAME</B>&nbsp;属性值规则，指定条件所在的值规则对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFVRID}
     */
    public final static String FIELD_PSDEFVRNAME = "psdefvrname";

    /**
     * 设置 属性值规则，详细说明：{@link #FIELD_PSDEFVRNAME}
     * 
     * @param pSDEFVRName
     * 
     */
    @JsonProperty(FIELD_PSDEFVRNAME)
    public void setPSDEFVRName(String pSDEFVRName){
        this.set(FIELD_PSDEFVRNAME, pSDEFVRName);
    }
    
    /**
     * 获取 属性值规则  
     * @return
     */
    @JsonIgnore
    public String getPSDEFVRName(){
        Object objValue = this.get(FIELD_PSDEFVRNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性值规则 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFVRNameDirty(){
        if(this.contains(FIELD_PSDEFVRNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性值规则
     */
    @JsonIgnore
    public void resetPSDEFVRName(){
        this.reset(FIELD_PSDEFVRNAME);
    }

    /**
     * 设置 属性值规则，详细说明：{@link #FIELD_PSDEFVRNAME}
     * <P>
     * 等同 {@link #setPSDEFVRName}
     * @param pSDEFVRName
     */
    @JsonIgnore
    public PSDEFVRCondDTO psdefvrname(String pSDEFVRName){
        this.setPSDEFVRName(pSDEFVRName);
        return this;
    }

    /**
     * <B>PSSYSVALUERULEID</B>&nbsp;系统值规则，指定系统值规则检查条件的系统值规则
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysValueRuleDTO} 
     */
    public final static String FIELD_PSSYSVALUERULEID = "pssysvalueruleid";

    /**
     * 设置 系统值规则，详细说明：{@link #FIELD_PSSYSVALUERULEID}
     * 
     * @param pSSysValueRuleId
     * 
     */
    @JsonProperty(FIELD_PSSYSVALUERULEID)
    public void setPSSysValueRuleId(String pSSysValueRuleId){
        this.set(FIELD_PSSYSVALUERULEID, pSSysValueRuleId);
    }
    
    /**
     * 获取 系统值规则  
     * @return
     */
    @JsonIgnore
    public String getPSSysValueRuleId(){
        Object objValue = this.get(FIELD_PSSYSVALUERULEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统值规则 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysValueRuleIdDirty(){
        if(this.contains(FIELD_PSSYSVALUERULEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统值规则
     */
    @JsonIgnore
    public void resetPSSysValueRuleId(){
        this.reset(FIELD_PSSYSVALUERULEID);
    }

    /**
     * 设置 系统值规则，详细说明：{@link #FIELD_PSSYSVALUERULEID}
     * <P>
     * 等同 {@link #setPSSysValueRuleId}
     * @param pSSysValueRuleId
     */
    @JsonIgnore
    public PSDEFVRCondDTO pssysvalueruleid(String pSSysValueRuleId){
        this.setPSSysValueRuleId(pSSysValueRuleId);
        return this;
    }

    /**
     * 设置 系统值规则，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysValueRuleId}
     * @param pSSysValueRule 引用对象
     */
    @JsonIgnore
    public PSDEFVRCondDTO pssysvalueruleid(PSSysValueRuleDTO pSSysValueRule){
        if(pSSysValueRule == null){
            this.setPSSysValueRuleId(null);
            this.setPSSysValueRuleName(null);
        }
        else{
            this.setPSSysValueRuleId(pSSysValueRule.getPSSysValueRuleId());
            this.setPSSysValueRuleName(pSSysValueRule.getPSSysValueRuleName());
        }
        return this;
    }

    /**
     * <B>PSSYSVALUERULENAME</B>&nbsp;系统值规则，指定系统值规则检查条件的系统值规则
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSVALUERULEID}
     */
    public final static String FIELD_PSSYSVALUERULENAME = "pssysvaluerulename";

    /**
     * 设置 系统值规则，详细说明：{@link #FIELD_PSSYSVALUERULENAME}
     * 
     * @param pSSysValueRuleName
     * 
     */
    @JsonProperty(FIELD_PSSYSVALUERULENAME)
    public void setPSSysValueRuleName(String pSSysValueRuleName){
        this.set(FIELD_PSSYSVALUERULENAME, pSSysValueRuleName);
    }
    
    /**
     * 获取 系统值规则  
     * @return
     */
    @JsonIgnore
    public String getPSSysValueRuleName(){
        Object objValue = this.get(FIELD_PSSYSVALUERULENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统值规则 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysValueRuleNameDirty(){
        if(this.contains(FIELD_PSSYSVALUERULENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统值规则
     */
    @JsonIgnore
    public void resetPSSysValueRuleName(){
        this.reset(FIELD_PSSYSVALUERULENAME);
    }

    /**
     * 设置 系统值规则，详细说明：{@link #FIELD_PSSYSVALUERULENAME}
     * <P>
     * 等同 {@link #setPSSysValueRuleName}
     * @param pSSysValueRuleName
     */
    @JsonIgnore
    public PSDEFVRCondDTO pssysvaluerulename(String pSSysValueRuleName){
        this.setPSSysValueRuleName(pSSysValueRuleName);
        return this;
    }

    /**
     * <B>RIPSLANRESID</B>&nbsp;规则信息语言资源，指定规则信息的多语言资源对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSLanguageResDTO} 
     */
    public final static String FIELD_RIPSLANRESID = "ripslanresid";

    /**
     * 设置 规则信息语言资源，详细说明：{@link #FIELD_RIPSLANRESID}
     * 
     * @param rIPSLanResId
     * 
     */
    @JsonProperty(FIELD_RIPSLANRESID)
    public void setRIPSLanResId(String rIPSLanResId){
        this.set(FIELD_RIPSLANRESID, rIPSLanResId);
    }
    
    /**
     * 获取 规则信息语言资源  
     * @return
     */
    @JsonIgnore
    public String getRIPSLanResId(){
        Object objValue = this.get(FIELD_RIPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 规则信息语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRIPSLanResIdDirty(){
        if(this.contains(FIELD_RIPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 规则信息语言资源
     */
    @JsonIgnore
    public void resetRIPSLanResId(){
        this.reset(FIELD_RIPSLANRESID);
    }

    /**
     * 设置 规则信息语言资源，详细说明：{@link #FIELD_RIPSLANRESID}
     * <P>
     * 等同 {@link #setRIPSLanResId}
     * @param rIPSLanResId
     */
    @JsonIgnore
    public PSDEFVRCondDTO ripslanresid(String rIPSLanResId){
        this.setRIPSLanResId(rIPSLanResId);
        return this;
    }

    /**
     * 设置 规则信息语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRIPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSDEFVRCondDTO ripslanresid(PSLanguageResDTO pSLanguageRes){
        if(pSLanguageRes == null){
            this.setRIPSLanResId(null);
            this.setRIPSLanResName(null);
        }
        else{
            this.setRIPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setRIPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>RIPSLANRESNAME</B>&nbsp;规则信息语言资源，指定规则信息的多语言资源对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_RIPSLANRESID}
     */
    public final static String FIELD_RIPSLANRESNAME = "ripslanresname";

    /**
     * 设置 规则信息语言资源，详细说明：{@link #FIELD_RIPSLANRESNAME}
     * 
     * @param rIPSLanResName
     * 
     */
    @JsonProperty(FIELD_RIPSLANRESNAME)
    public void setRIPSLanResName(String rIPSLanResName){
        this.set(FIELD_RIPSLANRESNAME, rIPSLanResName);
    }
    
    /**
     * 获取 规则信息语言资源  
     * @return
     */
    @JsonIgnore
    public String getRIPSLanResName(){
        Object objValue = this.get(FIELD_RIPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 规则信息语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRIPSLanResNameDirty(){
        if(this.contains(FIELD_RIPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 规则信息语言资源
     */
    @JsonIgnore
    public void resetRIPSLanResName(){
        this.reset(FIELD_RIPSLANRESNAME);
    }

    /**
     * 设置 规则信息语言资源，详细说明：{@link #FIELD_RIPSLANRESNAME}
     * <P>
     * 等同 {@link #setRIPSLanResName}
     * @param rIPSLanResName
     */
    @JsonIgnore
    public PSDEFVRCondDTO ripslanresname(String rIPSLanResName){
        this.setRIPSLanResName(rIPSLanResName);
        return this;
    }

    /**
     * <B>RULEINFO</B>&nbsp;规则信息，指定值规则条件的规则信息，不指定时模型引擎将根据条件配置自动计算
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_RULEINFO = "ruleinfo";

    /**
     * 设置 规则信息，详细说明：{@link #FIELD_RULEINFO}
     * 
     * @param ruleInfo
     * 
     */
    @JsonProperty(FIELD_RULEINFO)
    public void setRuleInfo(String ruleInfo){
        this.set(FIELD_RULEINFO, ruleInfo);
    }
    
    /**
     * 获取 规则信息  
     * @return
     */
    @JsonIgnore
    public String getRuleInfo(){
        Object objValue = this.get(FIELD_RULEINFO);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 规则信息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRuleInfoDirty(){
        if(this.contains(FIELD_RULEINFO)){
            return true;
        }
        return false;
    }

    /**
     * 重置 规则信息
     */
    @JsonIgnore
    public void resetRuleInfo(){
        this.reset(FIELD_RULEINFO);
    }

    /**
     * 设置 规则信息，详细说明：{@link #FIELD_RULEINFO}
     * <P>
     * 等同 {@link #setRuleInfo}
     * @param ruleInfo
     */
    @JsonIgnore
    public PSDEFVRCondDTO ruleinfo(String ruleInfo){
        this.setRuleInfo(ruleInfo);
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
    public PSDEFVRCondDTO updatedate(Timestamp updateDate){
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
    public PSDEFVRCondDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
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
    public PSDEFVRCondDTO usertag(String userTag){
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
    public PSDEFVRCondDTO usertag2(String userTag2){
        this.setUserTag2(userTag2);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSDEFVRCondId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSDEFVRCondId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEFVRCondId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEFVRCondId(strValue);
    }

    @JsonIgnore
    public PSDEFVRCondDTO id(String strValue){
        this.setPSDEFVRCondId(strValue);
        return this;
    }


    /**
     *  实体属性值规则项 成员集合
     */
    public final static String FIELD_PSDEFVRCONDS = "psdefvrconds";

    private java.util.List<net.ibizsys.centralstudio.dto.PSDEFVRCondDTO> psdefvrconds;

    /**
     * 获取 实体属性值规则项 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEFVRCONDS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEFVRCondDTO> getPSDEFVRConds(){
        return this.psdefvrconds;
    }

    /**
     * 设置 实体属性值规则项 成员集合  
     * @param psdefvrconds
     */
    @JsonProperty(FIELD_PSDEFVRCONDS)
    public void setPSDEFVRConds(java.util.List<net.ibizsys.centralstudio.dto.PSDEFVRCondDTO> psdefvrconds){
        this.psdefvrconds = psdefvrconds;
    }

    /**
     * 获取 实体属性值规则项 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEFVRCondDTO> getPSDEFVRCondsIf(){
        if(this.psdefvrconds == null){
            this.psdefvrconds = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSDEFVRCondDTO>();          
        }
        return this.psdefvrconds;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDEFVRCondDTO){
            PSDEFVRCondDTO dto = (PSDEFVRCondDTO)iEntity;
            dto.setPSDEFVRConds(this.getPSDEFVRConds());
        }
        super.copyTo(iEntity);
    }
}
