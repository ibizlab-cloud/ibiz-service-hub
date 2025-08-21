package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEDQCOND</B>实体数据查询条件 模型传输对象
 * <P>
 * 查询连接条件模型，支持组合、属性单项、自定义及预置条件类型，支持层级结构
 */
public class PSDEDQCond extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEDQCond(){
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
    public PSDEDQCond condtag(String condTag){
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
    public PSDEDQCond condtag2(String condTag2){
        this.setCondTag2(condTag2);
        return this;
    }

    /**
     * <B>CONDTYPE</B>&nbsp;条件类型，查询连接条件的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.CondType} 
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
    public PSDEDQCond condtype(String condType){
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
    public PSDEDQCond condtype(net.ibizsys.psmodel.core.util.PSModelEnums.CondType condType){
        if(condType == null){
            this.setCondType(null);
        }
        else{
            this.setCondType(condType.value);
        }
        return this;
    }

    /**
     * <B>CONDVALUE</B>&nbsp;条件值，指定属性条件的条件值，如指定条件变量类型则作为变量类型参数，否则按直接值处理
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
    public PSDEDQCond condvalue(String condValue){
        this.setCondValue(condValue);
        return this;
    }

    /**
     * <B>CONDVALUETEXT</B>&nbsp;值说明
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_CONDVALUETEXT = "condvaluetext";

    /**
     * 设置 值说明
     * 
     * @param condValueText
     * 
     */
    @JsonProperty(FIELD_CONDVALUETEXT)
    public void setCondValueText(String condValueText){
        this.set(FIELD_CONDVALUETEXT, condValueText);
    }
    
    /**
     * 获取 值说明  
     * @return
     */
    @JsonIgnore
    public String getCondValueText(){
        Object objValue = this.get(FIELD_CONDVALUETEXT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值说明 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCondValueTextDirty(){
        if(this.contains(FIELD_CONDVALUETEXT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值说明
     */
    @JsonIgnore
    public void resetCondValueText(){
        this.reset(FIELD_CONDVALUETEXT);
    }

    /**
     * 设置 值说明
     * <P>
     * 等同 {@link #setCondValueText}
     * @param condValueText
     */
    @JsonIgnore
    public PSDEDQCond condvaluetext(String condValueText){
        this.setCondValueText(condValueText);
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
    public PSDEDQCond createdate(String createDate){
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
    public PSDEDQCond createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CUSTOMCOND</B>&nbsp;自定义条件，指定自定义条件内容
     */
    public final static String FIELD_CUSTOMCOND = "customcond";

    /**
     * 设置 自定义条件，详细说明：{@link #FIELD_CUSTOMCOND}
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
     * 设置 自定义条件，详细说明：{@link #FIELD_CUSTOMCOND}
     * <P>
     * 等同 {@link #setCustomCond}
     * @param customCond
     */
    @JsonIgnore
    public PSDEDQCond customcond(String customCond){
        this.setCustomCond(customCond);
        return this;
    }

    /**
     * <B>CUSTOMTYPE</B>&nbsp;自定义类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.CustomCondType} 
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
    public PSDEDQCond customtype(String customType){
        this.setCustomType(customType);
        return this;
    }

     /**
     * 设置 自定义类型
     * <P>
     * 等同 {@link #setCustomType}
     * @param customType
     */
    @JsonIgnore
    public PSDEDQCond customtype(net.ibizsys.psmodel.core.util.PSModelEnums.CustomCondType customType){
        if(customType == null){
            this.setCustomType(null);
        }
        else{
            this.setCustomType(customType.value);
        }
        return this;
    }

    /**
     * <B>GROUPNOTFLAG</B>&nbsp;取反操作，指定条件逻辑是否进行取反处理，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_GROUPNOTFLAG = "groupnotflag";

    /**
     * 设置 取反操作，详细说明：{@link #FIELD_GROUPNOTFLAG}
     * 
     * @param groupNotFlag
     * 
     */
    @JsonProperty(FIELD_GROUPNOTFLAG)
    public void setGroupNotFlag(Integer groupNotFlag){
        this.set(FIELD_GROUPNOTFLAG, groupNotFlag);
    }
    
    /**
     * 获取 取反操作  
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
     * 判断 取反操作 是否指定值，包括空值
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
     * 重置 取反操作
     */
    @JsonIgnore
    public void resetGroupNotFlag(){
        this.reset(FIELD_GROUPNOTFLAG);
    }

    /**
     * 设置 取反操作，详细说明：{@link #FIELD_GROUPNOTFLAG}
     * <P>
     * 等同 {@link #setGroupNotFlag}
     * @param groupNotFlag
     */
    @JsonIgnore
    public PSDEDQCond groupnotflag(Integer groupNotFlag){
        this.setGroupNotFlag(groupNotFlag);
        return this;
    }

     /**
     * 设置 取反操作，详细说明：{@link #FIELD_GROUPNOTFLAG}
     * <P>
     * 等同 {@link #setGroupNotFlag}
     * @param groupNotFlag
     */
    @JsonIgnore
    public PSDEDQCond groupnotflag(Boolean groupNotFlag){
        if(groupNotFlag == null){
            this.setGroupNotFlag(null);
        }
        else{
            this.setGroupNotFlag(groupNotFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>GROUPOP</B>&nbsp;组合逻辑，指定组条件的逻辑
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.GroupCondOP} 
     */
    public final static String FIELD_GROUPOP = "groupop";

    /**
     * 设置 组合逻辑，详细说明：{@link #FIELD_GROUPOP}
     * 
     * @param groupOP
     * 
     */
    @JsonProperty(FIELD_GROUPOP)
    public void setGroupOP(String groupOP){
        this.set(FIELD_GROUPOP, groupOP);
    }
    
    /**
     * 获取 组合逻辑  
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
     * 判断 组合逻辑 是否指定值，包括空值
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
     * 重置 组合逻辑
     */
    @JsonIgnore
    public void resetGroupOP(){
        this.reset(FIELD_GROUPOP);
    }

    /**
     * 设置 组合逻辑，详细说明：{@link #FIELD_GROUPOP}
     * <P>
     * 等同 {@link #setGroupOP}
     * @param groupOP
     */
    @JsonIgnore
    public PSDEDQCond groupop(String groupOP){
        this.setGroupOP(groupOP);
        return this;
    }

     /**
     * 设置 组合逻辑，详细说明：{@link #FIELD_GROUPOP}
     * <P>
     * 等同 {@link #setGroupOP}
     * @param groupOP
     */
    @JsonIgnore
    public PSDEDQCond groupop(net.ibizsys.psmodel.core.util.PSModelEnums.GroupCondOP groupOP){
        if(groupOP == null){
            this.setGroupOP(null);
        }
        else{
            this.setGroupOP(groupOP.value);
        }
        return this;
    }

    /**
     * <B>IGNOREEMPTY</B>&nbsp;条件忽略模式，指定参数无值是否忽略此条件，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEDQCondIgnoreMode} 
     */
    public final static String FIELD_IGNOREEMPTY = "ignoreempty";

    /**
     * 设置 条件忽略模式，详细说明：{@link #FIELD_IGNOREEMPTY}
     * 
     * @param ignoreEmpty
     * 
     */
    @JsonProperty(FIELD_IGNOREEMPTY)
    public void setIgnoreEmpty(Integer ignoreEmpty){
        this.set(FIELD_IGNOREEMPTY, ignoreEmpty);
    }
    
    /**
     * 获取 条件忽略模式  
     * @return
     */
    @JsonIgnore
    public Integer getIgnoreEmpty(){
        Object objValue = this.get(FIELD_IGNOREEMPTY);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 条件忽略模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIgnoreEmptyDirty(){
        if(this.contains(FIELD_IGNOREEMPTY)){
            return true;
        }
        return false;
    }

    /**
     * 重置 条件忽略模式
     */
    @JsonIgnore
    public void resetIgnoreEmpty(){
        this.reset(FIELD_IGNOREEMPTY);
    }

    /**
     * 设置 条件忽略模式，详细说明：{@link #FIELD_IGNOREEMPTY}
     * <P>
     * 等同 {@link #setIgnoreEmpty}
     * @param ignoreEmpty
     */
    @JsonIgnore
    public PSDEDQCond ignoreempty(Integer ignoreEmpty){
        this.setIgnoreEmpty(ignoreEmpty);
        return this;
    }

     /**
     * 设置 条件忽略模式，详细说明：{@link #FIELD_IGNOREEMPTY}
     * <P>
     * 等同 {@link #setIgnoreEmpty}
     * @param ignoreEmpty
     */
    @JsonIgnore
    public PSDEDQCond ignoreempty(net.ibizsys.psmodel.core.util.PSModelEnums.DEDQCondIgnoreMode ignoreEmpty){
        if(ignoreEmpty == null){
            this.setIgnoreEmpty(null);
        }
        else{
            this.setIgnoreEmpty(ignoreEmpty.value);
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
    public PSDEDQCond memo(String memo){
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
    public PSDEDQCond ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PPSDEDQCONDID</B>&nbsp;父数据查询条件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDQCond} 
     */
    public final static String FIELD_PPSDEDQCONDID = "ppsdedqcondid";

    /**
     * 设置 父数据查询条件
     * 
     * @param pPSDEDQCondId
     * 
     */
    @JsonProperty(FIELD_PPSDEDQCONDID)
    public void setPPSDEDQCondId(String pPSDEDQCondId){
        this.set(FIELD_PPSDEDQCONDID, pPSDEDQCondId);
    }
    
    /**
     * 获取 父数据查询条件  
     * @return
     */
    @JsonIgnore
    public String getPPSDEDQCondId(){
        Object objValue = this.get(FIELD_PPSDEDQCONDID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父数据查询条件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSDEDQCondIdDirty(){
        if(this.contains(FIELD_PPSDEDQCONDID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父数据查询条件
     */
    @JsonIgnore
    public void resetPPSDEDQCondId(){
        this.reset(FIELD_PPSDEDQCONDID);
    }

    /**
     * 设置 父数据查询条件
     * <P>
     * 等同 {@link #setPPSDEDQCondId}
     * @param pPSDEDQCondId
     */
    @JsonIgnore
    public PSDEDQCond ppsdedqcondid(String pPSDEDQCondId){
        this.setPPSDEDQCondId(pPSDEDQCondId);
        return this;
    }

    /**
     * 设置 父数据查询条件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPPSDEDQCondId}
     * @param pSDEDQCond 引用对象
     */
    @JsonIgnore
    public PSDEDQCond ppsdedqcondid(PSDEDQCond pSDEDQCond){
        if(pSDEDQCond == null){
            this.setPPSDEDQCondId(null);
            this.setPPSDEDQCondName(null);
        }
        else{
            this.setPPSDEDQCondId(pSDEDQCond.getPSDEDQCondId());
            this.setPPSDEDQCondName(pSDEDQCond.getPSDEDQCondName());
        }
        return this;
    }

    /**
     * <B>PPSDEDQCONDNAME</B>&nbsp;父数据查询条件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PPSDEDQCONDID}
     */
    public final static String FIELD_PPSDEDQCONDNAME = "ppsdedqcondname";

    /**
     * 设置 父数据查询条件
     * 
     * @param pPSDEDQCondName
     * 
     */
    @JsonProperty(FIELD_PPSDEDQCONDNAME)
    public void setPPSDEDQCondName(String pPSDEDQCondName){
        this.set(FIELD_PPSDEDQCONDNAME, pPSDEDQCondName);
    }
    
    /**
     * 获取 父数据查询条件  
     * @return
     */
    @JsonIgnore
    public String getPPSDEDQCondName(){
        Object objValue = this.get(FIELD_PPSDEDQCONDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父数据查询条件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSDEDQCondNameDirty(){
        if(this.contains(FIELD_PPSDEDQCONDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父数据查询条件
     */
    @JsonIgnore
    public void resetPPSDEDQCondName(){
        this.reset(FIELD_PPSDEDQCONDNAME);
    }

    /**
     * 设置 父数据查询条件
     * <P>
     * 等同 {@link #setPPSDEDQCondName}
     * @param pPSDEDQCondName
     */
    @JsonIgnore
    public PSDEDQCond ppsdedqcondname(String pPSDEDQCondName){
        this.setPPSDEDQCondName(pPSDEDQCondName);
        return this;
    }

    /**
     * <B>PSDBVALUEOPID</B>&nbsp;条件符号，指定属性条件的操作符
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEDQCondOP} 
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDBValueOP} 
     */
    public final static String FIELD_PSDBVALUEOPID = "psdbvalueopid";

    /**
     * 设置 条件符号，详细说明：{@link #FIELD_PSDBVALUEOPID}
     * 
     * @param pSDBValueOPId
     * 
     */
    @JsonProperty(FIELD_PSDBVALUEOPID)
    public void setPSDBValueOPId(String pSDBValueOPId){
        this.set(FIELD_PSDBVALUEOPID, pSDBValueOPId);
    }
    
    /**
     * 获取 条件符号  
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
     * 判断 条件符号 是否指定值，包括空值
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
     * 重置 条件符号
     */
    @JsonIgnore
    public void resetPSDBValueOPId(){
        this.reset(FIELD_PSDBVALUEOPID);
    }

    /**
     * 设置 条件符号，详细说明：{@link #FIELD_PSDBVALUEOPID}
     * <P>
     * 等同 {@link #setPSDBValueOPId}
     * @param pSDBValueOPId
     */
    @JsonIgnore
    public PSDEDQCond psdbvalueopid(String pSDBValueOPId){
        this.setPSDBValueOPId(pSDBValueOPId);
        return this;
    }

    /**
     * 设置 条件符号，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDBValueOPId}
     * @param pSDBValueOP 引用对象
     */
    @JsonIgnore
    public PSDEDQCond psdbvalueopid(PSDBValueOP pSDBValueOP){
        if(pSDBValueOP == null){
            this.setPSDBValueOPId(null);
            this.setPSDBValueOPName(null);
        }
        else{
            this.setPSDBValueOPId(pSDBValueOP.getPSDBValueOPId());
            this.setPSDBValueOPName(pSDBValueOP.getPSDBValueOPName());
        }
        return this;
    }

    /**
     * <B>PSDBVALUEOPNAME</B>&nbsp;操作符号，指定属性条件的操作符
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
    public PSDEDQCond psdbvalueopname(String pSDBValueOPName){
        this.setPSDBValueOPName(pSDBValueOPName);
        return this;
    }

    /**
     * <B>PSDEDQCONDID</B>&nbsp;实体数据查询条件标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEDQCONDID = "psdedqcondid";

    /**
     * 设置 实体数据查询条件标识
     * 
     * @param pSDEDQCondId
     * 
     */
    @JsonProperty(FIELD_PSDEDQCONDID)
    public void setPSDEDQCondId(String pSDEDQCondId){
        this.set(FIELD_PSDEDQCONDID, pSDEDQCondId);
    }
    
    /**
     * 获取 实体数据查询条件标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEDQCondId(){
        Object objValue = this.get(FIELD_PSDEDQCONDID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据查询条件标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDQCondIdDirty(){
        if(this.contains(FIELD_PSDEDQCONDID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据查询条件标识
     */
    @JsonIgnore
    public void resetPSDEDQCondId(){
        this.reset(FIELD_PSDEDQCONDID);
    }

    /**
     * 设置 实体数据查询条件标识
     * <P>
     * 等同 {@link #setPSDEDQCondId}
     * @param pSDEDQCondId
     */
    @JsonIgnore
    public PSDEDQCond psdedqcondid(String pSDEDQCondId){
        this.setPSDEDQCondId(pSDEDQCondId);
        return this;
    }

    /**
     * <B>PSDEDQCONDNAME</B>&nbsp;查询条件
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEDQCONDNAME = "psdedqcondname";

    /**
     * 设置 查询条件
     * 
     * @param pSDEDQCondName
     * 
     */
    @JsonProperty(FIELD_PSDEDQCONDNAME)
    public void setPSDEDQCondName(String pSDEDQCondName){
        this.set(FIELD_PSDEDQCONDNAME, pSDEDQCondName);
    }
    
    /**
     * 获取 查询条件  
     * @return
     */
    @JsonIgnore
    public String getPSDEDQCondName(){
        Object objValue = this.get(FIELD_PSDEDQCONDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 查询条件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDQCondNameDirty(){
        if(this.contains(FIELD_PSDEDQCONDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 查询条件
     */
    @JsonIgnore
    public void resetPSDEDQCondName(){
        this.reset(FIELD_PSDEDQCONDNAME);
    }

    /**
     * 设置 查询条件
     * <P>
     * 等同 {@link #setPSDEDQCondName}
     * @param pSDEDQCondName
     */
    @JsonIgnore
    public PSDEDQCond psdedqcondname(String pSDEDQCondName){
        this.setPSDEDQCondName(pSDEDQCondName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEDQCondName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEDQCondName(strName);
    }

    @JsonIgnore
    public PSDEDQCond name(String strName){
        this.setPSDEDQCondName(strName);
        return this;
    }

    /**
     * <B>PSDEDQID</B>&nbsp;实体数据查询
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataQuery} 
     */
    public final static String FIELD_PSDEDQID = "psdedqid";

    /**
     * 设置 实体数据查询
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
     * 设置 实体数据查询
     * <P>
     * 等同 {@link #setPSDEDQId}
     * @param pSDEDQId
     */
    @JsonIgnore
    public PSDEDQCond psdedqid(String pSDEDQId){
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
    public PSDEDQCond psdedqid(PSDEDataQuery pSDEDataQuery){
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
     * <B>PSDEDQJOINID</B>&nbsp;数据查询连接
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDQJoin} 
     */
    public final static String FIELD_PSDEDQJOINID = "psdedqjoinid";

    /**
     * 设置 数据查询连接
     * 
     * @param pSDEDQJoinId
     * 
     */
    @JsonProperty(FIELD_PSDEDQJOINID)
    public void setPSDEDQJoinId(String pSDEDQJoinId){
        this.set(FIELD_PSDEDQJOINID, pSDEDQJoinId);
    }
    
    /**
     * 获取 数据查询连接  
     * @return
     */
    @JsonIgnore
    public String getPSDEDQJoinId(){
        Object objValue = this.get(FIELD_PSDEDQJOINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据查询连接 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDQJoinIdDirty(){
        if(this.contains(FIELD_PSDEDQJOINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据查询连接
     */
    @JsonIgnore
    public void resetPSDEDQJoinId(){
        this.reset(FIELD_PSDEDQJOINID);
    }

    /**
     * 设置 数据查询连接
     * <P>
     * 等同 {@link #setPSDEDQJoinId}
     * @param pSDEDQJoinId
     */
    @JsonIgnore
    public PSDEDQCond psdedqjoinid(String pSDEDQJoinId){
        this.setPSDEDQJoinId(pSDEDQJoinId);
        return this;
    }

    /**
     * 设置 数据查询连接，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDQJoinId}
     * @param pSDEDQJoin 引用对象
     */
    @JsonIgnore
    public PSDEDQCond psdedqjoinid(PSDEDQJoin pSDEDQJoin){
        if(pSDEDQJoin == null){
            this.setPSDEDQJoinId(null);
            this.setPSDEDQJoinName(null);
        }
        else{
            this.setPSDEDQJoinId(pSDEDQJoin.getPSDEDQJoinId());
            this.setPSDEDQJoinName(pSDEDQJoin.getPSDEDQJoinName());
        }
        return this;
    }

    /**
     * <B>PSDEDQJOINNAME</B>&nbsp;数据查询连接
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDQJOINID}
     */
    public final static String FIELD_PSDEDQJOINNAME = "psdedqjoinname";

    /**
     * 设置 数据查询连接
     * 
     * @param pSDEDQJoinName
     * 
     */
    @JsonProperty(FIELD_PSDEDQJOINNAME)
    public void setPSDEDQJoinName(String pSDEDQJoinName){
        this.set(FIELD_PSDEDQJOINNAME, pSDEDQJoinName);
    }
    
    /**
     * 获取 数据查询连接  
     * @return
     */
    @JsonIgnore
    public String getPSDEDQJoinName(){
        Object objValue = this.get(FIELD_PSDEDQJOINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据查询连接 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDQJoinNameDirty(){
        if(this.contains(FIELD_PSDEDQJOINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据查询连接
     */
    @JsonIgnore
    public void resetPSDEDQJoinName(){
        this.reset(FIELD_PSDEDQJOINNAME);
    }

    /**
     * 设置 数据查询连接
     * <P>
     * 等同 {@link #setPSDEDQJoinName}
     * @param pSDEDQJoinName
     */
    @JsonIgnore
    public PSDEDQCond psdedqjoinname(String pSDEDQJoinName){
        this.setPSDEDQJoinName(pSDEDQJoinName);
        return this;
    }

    /**
     * <B>PSDEDQNAME</B>&nbsp;实体数据查询
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDQID}
     */
    public final static String FIELD_PSDEDQNAME = "psdedqname";

    /**
     * 设置 实体数据查询
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
     * 设置 实体数据查询
     * <P>
     * 等同 {@link #setPSDEDQName}
     * @param pSDEDQName
     */
    @JsonIgnore
    public PSDEDQCond psdedqname(String pSDEDQName){
        this.setPSDEDQName(pSDEDQName);
        return this;
    }

    /**
     * <B>PSDEDQPDCONDID</B>&nbsp;查询预置条件
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEDQPDCONDID = "psdedqpdcondid";

    /**
     * 设置 查询预置条件
     * 
     * @param pSDEDQPDCondId
     * 
     */
    @JsonProperty(FIELD_PSDEDQPDCONDID)
    public void setPSDEDQPDCondId(String pSDEDQPDCondId){
        this.set(FIELD_PSDEDQPDCONDID, pSDEDQPDCondId);
    }
    
    /**
     * 获取 查询预置条件  
     * @return
     */
    @JsonIgnore
    public String getPSDEDQPDCondId(){
        Object objValue = this.get(FIELD_PSDEDQPDCONDID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 查询预置条件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDQPDCondIdDirty(){
        if(this.contains(FIELD_PSDEDQPDCONDID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 查询预置条件
     */
    @JsonIgnore
    public void resetPSDEDQPDCondId(){
        this.reset(FIELD_PSDEDQPDCONDID);
    }

    /**
     * 设置 查询预置条件
     * <P>
     * 等同 {@link #setPSDEDQPDCondId}
     * @param pSDEDQPDCondId
     */
    @JsonIgnore
    public PSDEDQCond psdedqpdcondid(String pSDEDQPDCondId){
        this.setPSDEDQPDCondId(pSDEDQPDCondId);
        return this;
    }

    /**
     * <B>PSDEDQPDCONDNAME</B>&nbsp;查询预置条件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDQPDCONDID}
     */
    public final static String FIELD_PSDEDQPDCONDNAME = "psdedqpdcondname";

    /**
     * 设置 查询预置条件
     * 
     * @param pSDEDQPDCondName
     * 
     */
    @JsonProperty(FIELD_PSDEDQPDCONDNAME)
    public void setPSDEDQPDCondName(String pSDEDQPDCondName){
        this.set(FIELD_PSDEDQPDCONDNAME, pSDEDQPDCondName);
    }
    
    /**
     * 获取 查询预置条件  
     * @return
     */
    @JsonIgnore
    public String getPSDEDQPDCondName(){
        Object objValue = this.get(FIELD_PSDEDQPDCONDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 查询预置条件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDQPDCondNameDirty(){
        if(this.contains(FIELD_PSDEDQPDCONDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 查询预置条件
     */
    @JsonIgnore
    public void resetPSDEDQPDCondName(){
        this.reset(FIELD_PSDEDQPDCONDNAME);
    }

    /**
     * 设置 查询预置条件
     * <P>
     * 等同 {@link #setPSDEDQPDCondName}
     * @param pSDEDQPDCondName
     */
    @JsonIgnore
    public PSDEDQCond psdedqpdcondname(String pSDEDQPDCondName){
        this.setPSDEDQPDCondName(pSDEDQPDCondName);
        return this;
    }

    /**
     * <B>PSDEFID</B>&nbsp;实体属性，指定属性条件的属性
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
    public PSDEDQCond psdefid(String pSDEFId){
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
    public PSDEDQCond psdefid(PSDEField pSDEField){
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
     * <B>PSDEFNAME</B>&nbsp;实体属性，指定属性条件的属性
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
    public PSDEDQCond psdefname(String pSDEFName){
        this.setPSDEFName(pSDEFName);
        return this;
    }

    /**
     * <B>PSSYSDBVFID</B>&nbsp;值处理，指定属性条件的属性值转换处理，如时间转化为距今天数，满足各类查询条件需求
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDBVF} 
     */
    public final static String FIELD_PSSYSDBVFID = "pssysdbvfid";

    /**
     * 设置 值处理，详细说明：{@link #FIELD_PSSYSDBVFID}
     * 
     * @param pSSysDBVFId
     * 
     */
    @JsonProperty(FIELD_PSSYSDBVFID)
    public void setPSSysDBVFId(String pSSysDBVFId){
        this.set(FIELD_PSSYSDBVFID, pSSysDBVFId);
    }
    
    /**
     * 获取 值处理  
     * @return
     */
    @JsonIgnore
    public String getPSSysDBVFId(){
        Object objValue = this.get(FIELD_PSSYSDBVFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值处理 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDBVFIdDirty(){
        if(this.contains(FIELD_PSSYSDBVFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值处理
     */
    @JsonIgnore
    public void resetPSSysDBVFId(){
        this.reset(FIELD_PSSYSDBVFID);
    }

    /**
     * 设置 值处理，详细说明：{@link #FIELD_PSSYSDBVFID}
     * <P>
     * 等同 {@link #setPSSysDBVFId}
     * @param pSSysDBVFId
     */
    @JsonIgnore
    public PSDEDQCond pssysdbvfid(String pSSysDBVFId){
        this.setPSSysDBVFId(pSSysDBVFId);
        return this;
    }

    /**
     * 设置 值处理，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDBVFId}
     * @param pSSysDBVF 引用对象
     */
    @JsonIgnore
    public PSDEDQCond pssysdbvfid(PSSysDBVF pSSysDBVF){
        if(pSSysDBVF == null){
            this.setPSSysDBVFId(null);
            this.setPSSysDBVFName(null);
        }
        else{
            this.setPSSysDBVFId(pSSysDBVF.getPSSysDBVFId());
            this.setPSSysDBVFName(pSSysDBVF.getPSSysDBVFName());
        }
        return this;
    }

    /**
     * <B>PSSYSDBVFNAME</B>&nbsp;值处理，指定属性条件的属性值转换处理，如时间转化为距今天数，满足各类查询条件需求
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDBVFID}
     */
    public final static String FIELD_PSSYSDBVFNAME = "pssysdbvfname";

    /**
     * 设置 值处理，详细说明：{@link #FIELD_PSSYSDBVFNAME}
     * 
     * @param pSSysDBVFName
     * 
     */
    @JsonProperty(FIELD_PSSYSDBVFNAME)
    public void setPSSysDBVFName(String pSSysDBVFName){
        this.set(FIELD_PSSYSDBVFNAME, pSSysDBVFName);
    }
    
    /**
     * 获取 值处理  
     * @return
     */
    @JsonIgnore
    public String getPSSysDBVFName(){
        Object objValue = this.get(FIELD_PSSYSDBVFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值处理 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDBVFNameDirty(){
        if(this.contains(FIELD_PSSYSDBVFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值处理
     */
    @JsonIgnore
    public void resetPSSysDBVFName(){
        this.reset(FIELD_PSSYSDBVFNAME);
    }

    /**
     * 设置 值处理，详细说明：{@link #FIELD_PSSYSDBVFNAME}
     * <P>
     * 等同 {@link #setPSSysDBVFName}
     * @param pSSysDBVFName
     */
    @JsonIgnore
    public PSDEDQCond pssysdbvfname(String pSSysDBVFName){
        this.setPSSysDBVFName(pSSysDBVFName);
        return this;
    }

    /**
     * <B>PSVARTYPEID</B>&nbsp;变量类型，指定条件的变量类型，条件值指定变量属性
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEDQVarType} 
     */
    public final static String FIELD_PSVARTYPEID = "psvartypeid";

    /**
     * 设置 变量类型，详细说明：{@link #FIELD_PSVARTYPEID}
     * 
     * @param pSVARTypeId
     * 
     */
    @JsonProperty(FIELD_PSVARTYPEID)
    public void setPSVARTypeId(String pSVARTypeId){
        this.set(FIELD_PSVARTYPEID, pSVARTypeId);
    }
    
    /**
     * 获取 变量类型  
     * @return
     */
    @JsonIgnore
    public String getPSVARTypeId(){
        Object objValue = this.get(FIELD_PSVARTYPEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 变量类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSVARTypeIdDirty(){
        if(this.contains(FIELD_PSVARTYPEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 变量类型
     */
    @JsonIgnore
    public void resetPSVARTypeId(){
        this.reset(FIELD_PSVARTYPEID);
    }

    /**
     * 设置 变量类型，详细说明：{@link #FIELD_PSVARTYPEID}
     * <P>
     * 等同 {@link #setPSVARTypeId}
     * @param pSVARTypeId
     */
    @JsonIgnore
    public PSDEDQCond psvartypeid(String pSVARTypeId){
        this.setPSVARTypeId(pSVARTypeId);
        return this;
    }

    /**
     * <B>PSVARTYPENAME</B>&nbsp;变量类型，指定属性条件的条件变量类型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSVARTYPEID}
     */
    public final static String FIELD_PSVARTYPENAME = "psvartypename";

    /**
     * 设置 变量类型，详细说明：{@link #FIELD_PSVARTYPENAME}
     * 
     * @param pSVARTypeName
     * 
     */
    @JsonProperty(FIELD_PSVARTYPENAME)
    public void setPSVARTypeName(String pSVARTypeName){
        this.set(FIELD_PSVARTYPENAME, pSVARTypeName);
    }
    
    /**
     * 获取 变量类型  
     * @return
     */
    @JsonIgnore
    public String getPSVARTypeName(){
        Object objValue = this.get(FIELD_PSVARTYPENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 变量类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSVARTypeNameDirty(){
        if(this.contains(FIELD_PSVARTYPENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 变量类型
     */
    @JsonIgnore
    public void resetPSVARTypeName(){
        this.reset(FIELD_PSVARTYPENAME);
    }

    /**
     * 设置 变量类型，详细说明：{@link #FIELD_PSVARTYPENAME}
     * <P>
     * 等同 {@link #setPSVARTypeName}
     * @param pSVARTypeName
     */
    @JsonIgnore
    public PSDEDQCond psvartypename(String pSVARTypeName){
        this.setPSVARTypeName(pSVARTypeName);
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
    public PSDEDQCond updatedate(String updateDate){
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
    public PSDEDQCond updateman(String updateMan){
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
    public PSDEDQCond usercat(String userCat){
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
    public PSDEDQCond usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDEDQCond usertag(String userTag){
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
    public PSDEDQCond usertag2(String userTag2){
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
    public PSDEDQCond usertag3(String userTag3){
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
    public PSDEDQCond usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEDQCondId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEDQCondId(strValue);
    }

    @JsonIgnore
    public PSDEDQCond id(String strValue){
        this.setPSDEDQCondId(strValue);
        return this;
    }


    /**
     *  实体数据查询条件 成员集合
     */
    public final static String FIELD_PSDEDQCONDS = "psdedqconds";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSDEDQCond> psdedqconds;

    /**
     * 获取 实体数据查询条件 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEDQCONDS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEDQCond> getPSDEDQConds(){
        return this.psdedqconds;
    }

    /**
     * 设置 实体数据查询条件 成员集合  
     * @param psdedqconds
     */
    @JsonProperty(FIELD_PSDEDQCONDS)
    public void setPSDEDQConds(java.util.List<net.ibizsys.psmodel.core.domain.PSDEDQCond> psdedqconds){
        this.psdedqconds = psdedqconds;
    }

    /**
     * 获取 实体数据查询条件 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEDQCond> getPSDEDQCondsIf(){
        if(this.psdedqconds == null){
            this.psdedqconds = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSDEDQCond>();          
        }
        return this.psdedqconds;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEDQCond){
            PSDEDQCond model = (PSDEDQCond)iPSModel;
            model.setPSDEDQConds(this.getPSDEDQConds());
        }
        super.copyTo(iPSModel);
    }
}
