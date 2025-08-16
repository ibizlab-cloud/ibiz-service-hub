package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSWFLINKCOND</B>流程处理连接条件 模型传输对象
 * <P>
 * 流程处理连接的条件模型，支持组合、单项条件类型，支持层级结构
 */
public class PSWFLinkCondDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSWFLinkCondDTO(){
    }      

    /**
     * <B>CONDVALUE</B>&nbsp;条件值，指定单项条件的条件值
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
    public PSWFLinkCondDTO condvalue(String condValue){
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
    public PSWFLinkCondDTO createdate(Timestamp createDate){
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
    public PSWFLinkCondDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CUSTOMDSTPARAM</B>&nbsp;自定义目标属性，指定目标参数的自定义属性
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_CUSTOMDSTPARAM = "customdstparam";

    /**
     * 设置 自定义目标属性，详细说明：{@link #FIELD_CUSTOMDSTPARAM}
     * 
     * @param customDSTParam
     * 
     */
    @JsonProperty(FIELD_CUSTOMDSTPARAM)
    public void setCustomDSTParam(String customDSTParam){
        this.set(FIELD_CUSTOMDSTPARAM, customDSTParam);
    }
    
    /**
     * 获取 自定义目标属性  
     * @return
     */
    @JsonIgnore
    public String getCustomDSTParam(){
        Object objValue = this.get(FIELD_CUSTOMDSTPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义目标属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomDSTParamDirty(){
        if(this.contains(FIELD_CUSTOMDSTPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义目标属性
     */
    @JsonIgnore
    public void resetCustomDSTParam(){
        this.reset(FIELD_CUSTOMDSTPARAM);
    }

    /**
     * 设置 自定义目标属性，详细说明：{@link #FIELD_CUSTOMDSTPARAM}
     * <P>
     * 等同 {@link #setCustomDSTParam}
     * @param customDSTParam
     */
    @JsonIgnore
    public PSWFLinkCondDTO customdstparam(String customDSTParam){
        this.setCustomDSTParam(customDSTParam);
        return this;
    }

    /**
     * <B>DSTPSDEFID</B>&nbsp;目标属性，指定目标参数的属性，如存在自定义目标参数属性则优先使用自定义属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_DSTPSDEFID = "dstpsdefid";

    /**
     * 设置 目标属性，详细说明：{@link #FIELD_DSTPSDEFID}
     * 
     * @param dstPSDEFId
     * 
     */
    @JsonProperty(FIELD_DSTPSDEFID)
    public void setDstPSDEFId(String dstPSDEFId){
        this.set(FIELD_DSTPSDEFID, dstPSDEFId);
    }
    
    /**
     * 获取 目标属性  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEFId(){
        Object objValue = this.get(FIELD_DSTPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEFIdDirty(){
        if(this.contains(FIELD_DSTPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标属性
     */
    @JsonIgnore
    public void resetDstPSDEFId(){
        this.reset(FIELD_DSTPSDEFID);
    }

    /**
     * 设置 目标属性，详细说明：{@link #FIELD_DSTPSDEFID}
     * <P>
     * 等同 {@link #setDstPSDEFId}
     * @param dstPSDEFId
     */
    @JsonIgnore
    public PSWFLinkCondDTO dstpsdefid(String dstPSDEFId){
        this.setDstPSDEFId(dstPSDEFId);
        return this;
    }

    /**
     * 设置 目标属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDstPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSWFLinkCondDTO dstpsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setDstPSDEFId(null);
            this.setDstPSDEFName(null);
        }
        else{
            this.setDstPSDEFId(pSDEField.getPSDEFieldId());
            this.setDstPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>DSTPSDEFNAME</B>&nbsp;目标属性，指定目标参数的属性，如存在自定义目标参数属性则优先使用自定义属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DSTPSDEFID}
     */
    public final static String FIELD_DSTPSDEFNAME = "dstpsdefname";

    /**
     * 设置 目标属性，详细说明：{@link #FIELD_DSTPSDEFNAME}
     * 
     * @param dstPSDEFName
     * 
     */
    @JsonProperty(FIELD_DSTPSDEFNAME)
    public void setDstPSDEFName(String dstPSDEFName){
        this.set(FIELD_DSTPSDEFNAME, dstPSDEFName);
    }
    
    /**
     * 获取 目标属性  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEFName(){
        Object objValue = this.get(FIELD_DSTPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEFNameDirty(){
        if(this.contains(FIELD_DSTPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标属性
     */
    @JsonIgnore
    public void resetDstPSDEFName(){
        this.reset(FIELD_DSTPSDEFNAME);
    }

    /**
     * 设置 目标属性，详细说明：{@link #FIELD_DSTPSDEFNAME}
     * <P>
     * 等同 {@link #setDstPSDEFName}
     * @param dstPSDEFName
     */
    @JsonIgnore
    public PSWFLinkCondDTO dstpsdefname(String dstPSDEFName){
        this.setDstPSDEFName(dstPSDEFName);
        return this;
    }

    /**
     * <B>GROUPNOTFLAG</B>&nbsp;取反操作，指定条件逻辑是否进行取反处理，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
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
    public PSWFLinkCondDTO groupnotflag(Integer groupNotFlag){
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
    public PSWFLinkCondDTO groupnotflag(Boolean groupNotFlag){
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
    public PSWFLinkCondDTO groupop(String groupOP){
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
    public PSWFLinkCondDTO groupop(net.ibizsys.model.PSModelEnums.GroupCondOP groupOP){
        if(groupOP == null){
            this.setGroupOP(null);
        }
        else{
            this.setGroupOP(groupOP.value);
        }
        return this;
    }

    /**
     * <B>LOGICTYPE</B>&nbsp;逻辑类型，指定流程处理连接条件的逻辑类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.WFLinkCondType} 
     */
    public final static String FIELD_LOGICTYPE = "logictype";

    /**
     * 设置 逻辑类型，详细说明：{@link #FIELD_LOGICTYPE}
     * 
     * @param logicType
     * 
     */
    @JsonProperty(FIELD_LOGICTYPE)
    public void setLogicType(String logicType){
        this.set(FIELD_LOGICTYPE, logicType);
    }
    
    /**
     * 获取 逻辑类型  
     * @return
     */
    @JsonIgnore
    public String getLogicType(){
        Object objValue = this.get(FIELD_LOGICTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 逻辑类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLogicTypeDirty(){
        if(this.contains(FIELD_LOGICTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 逻辑类型
     */
    @JsonIgnore
    public void resetLogicType(){
        this.reset(FIELD_LOGICTYPE);
    }

    /**
     * 设置 逻辑类型，详细说明：{@link #FIELD_LOGICTYPE}
     * <P>
     * 等同 {@link #setLogicType}
     * @param logicType
     */
    @JsonIgnore
    public PSWFLinkCondDTO logictype(String logicType){
        this.setLogicType(logicType);
        return this;
    }

     /**
     * 设置 逻辑类型，详细说明：{@link #FIELD_LOGICTYPE}
     * <P>
     * 等同 {@link #setLogicType}
     * @param logicType
     */
    @JsonIgnore
    public PSWFLinkCondDTO logictype(net.ibizsys.model.PSModelEnums.WFLinkCondType logicType){
        if(logicType == null){
            this.setLogicType(null);
        }
        else{
            this.setLogicType(logicType.value);
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
    public PSWFLinkCondDTO memo(String memo){
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
    public PSWFLinkCondDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PARAMTYPE</B>&nbsp;条件值类型，指定条件值的类型，未定义时使用【直接值】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DEFVRParamType} 
     */
    public final static String FIELD_PARAMTYPE = "paramtype";

    /**
     * 设置 条件值类型，详细说明：{@link #FIELD_PARAMTYPE}
     * 
     * @param paramType
     * 
     */
    @JsonProperty(FIELD_PARAMTYPE)
    public void setParamType(String paramType){
        this.set(FIELD_PARAMTYPE, paramType);
    }
    
    /**
     * 获取 条件值类型  
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
     * 判断 条件值类型 是否指定值，包括空值
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
     * 重置 条件值类型
     */
    @JsonIgnore
    public void resetParamType(){
        this.reset(FIELD_PARAMTYPE);
    }

    /**
     * 设置 条件值类型，详细说明：{@link #FIELD_PARAMTYPE}
     * <P>
     * 等同 {@link #setParamType}
     * @param paramType
     */
    @JsonIgnore
    public PSWFLinkCondDTO paramtype(String paramType){
        this.setParamType(paramType);
        return this;
    }

     /**
     * 设置 条件值类型，详细说明：{@link #FIELD_PARAMTYPE}
     * <P>
     * 等同 {@link #setParamType}
     * @param paramType
     */
    @JsonIgnore
    public PSWFLinkCondDTO paramtype(net.ibizsys.model.PSModelEnums.DEFVRParamType paramType){
        if(paramType == null){
            this.setParamType(null);
        }
        else{
            this.setParamType(paramType.value);
        }
        return this;
    }

    /**
     * <B>PPSWFLINKCONDID</B>&nbsp;父条件，指定流程处理连接条件的父条件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSWFLinkCondDTO} 
     */
    public final static String FIELD_PPSWFLINKCONDID = "ppswflinkcondid";

    /**
     * 设置 父条件，详细说明：{@link #FIELD_PPSWFLINKCONDID}
     * 
     * @param pPSWFLinkCondId
     * 
     */
    @JsonProperty(FIELD_PPSWFLINKCONDID)
    public void setPPSWFLinkCondId(String pPSWFLinkCondId){
        this.set(FIELD_PPSWFLINKCONDID, pPSWFLinkCondId);
    }
    
    /**
     * 获取 父条件  
     * @return
     */
    @JsonIgnore
    public String getPPSWFLinkCondId(){
        Object objValue = this.get(FIELD_PPSWFLINKCONDID);
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
    public boolean isPPSWFLinkCondIdDirty(){
        if(this.contains(FIELD_PPSWFLINKCONDID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父条件
     */
    @JsonIgnore
    public void resetPPSWFLinkCondId(){
        this.reset(FIELD_PPSWFLINKCONDID);
    }

    /**
     * 设置 父条件，详细说明：{@link #FIELD_PPSWFLINKCONDID}
     * <P>
     * 等同 {@link #setPPSWFLinkCondId}
     * @param pPSWFLinkCondId
     */
    @JsonIgnore
    public PSWFLinkCondDTO ppswflinkcondid(String pPSWFLinkCondId){
        this.setPPSWFLinkCondId(pPSWFLinkCondId);
        return this;
    }

    /**
     * 设置 父条件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPPSWFLinkCondId}
     * @param pSWFLinkCond 引用对象
     */
    @JsonIgnore
    public PSWFLinkCondDTO ppswflinkcondid(PSWFLinkCondDTO pSWFLinkCond){
        if(pSWFLinkCond == null){
            this.setPPSWFLinkCondId(null);
            this.setPPSWFLinkCondName(null);
        }
        else{
            this.setPPSWFLinkCondId(pSWFLinkCond.getPSWFLinkCondId());
            this.setPPSWFLinkCondName(pSWFLinkCond.getPSWFLinkCondName());
        }
        return this;
    }

    /**
     * <B>PPSWFLINKCONDNAME</B>&nbsp;父条件，指定流程处理连接条件的父条件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PPSWFLINKCONDID}
     */
    public final static String FIELD_PPSWFLINKCONDNAME = "ppswflinkcondname";

    /**
     * 设置 父条件，详细说明：{@link #FIELD_PPSWFLINKCONDNAME}
     * 
     * @param pPSWFLinkCondName
     * 
     */
    @JsonProperty(FIELD_PPSWFLINKCONDNAME)
    public void setPPSWFLinkCondName(String pPSWFLinkCondName){
        this.set(FIELD_PPSWFLINKCONDNAME, pPSWFLinkCondName);
    }
    
    /**
     * 获取 父条件  
     * @return
     */
    @JsonIgnore
    public String getPPSWFLinkCondName(){
        Object objValue = this.get(FIELD_PPSWFLINKCONDNAME);
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
    public boolean isPPSWFLinkCondNameDirty(){
        if(this.contains(FIELD_PPSWFLINKCONDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父条件
     */
    @JsonIgnore
    public void resetPPSWFLinkCondName(){
        this.reset(FIELD_PPSWFLINKCONDNAME);
    }

    /**
     * 设置 父条件，详细说明：{@link #FIELD_PPSWFLINKCONDNAME}
     * <P>
     * 等同 {@link #setPPSWFLinkCondName}
     * @param pPSWFLinkCondName
     */
    @JsonIgnore
    public PSWFLinkCondDTO ppswflinkcondname(String pPSWFLinkCondName){
        this.setPPSWFLinkCondName(pPSWFLinkCondName);
        return this;
    }

    /**
     * <B>PSDBVALUEOPID</B>&nbsp;值操作，指定流程处理连接条件的操作符
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDBVALUEOPID = "psdbvalueopid";

    /**
     * 设置 值操作，详细说明：{@link #FIELD_PSDBVALUEOPID}
     * 
     * @param pSDBValueOPId
     * 
     */
    @JsonProperty(FIELD_PSDBVALUEOPID)
    public void setPSDBValueOPId(String pSDBValueOPId){
        this.set(FIELD_PSDBVALUEOPID, pSDBValueOPId);
    }
    
    /**
     * 获取 值操作  
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
     * 判断 值操作 是否指定值，包括空值
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
     * 重置 值操作
     */
    @JsonIgnore
    public void resetPSDBValueOPId(){
        this.reset(FIELD_PSDBVALUEOPID);
    }

    /**
     * 设置 值操作，详细说明：{@link #FIELD_PSDBVALUEOPID}
     * <P>
     * 等同 {@link #setPSDBValueOPId}
     * @param pSDBValueOPId
     */
    @JsonIgnore
    public PSWFLinkCondDTO psdbvalueopid(String pSDBValueOPId){
        this.setPSDBValueOPId(pSDBValueOPId);
        return this;
    }

    /**
     * <B>PSDBVALUEOPNAME</B>&nbsp;值操作，指定流程处理连接条件的操作符
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDBVALUEOPID}
     */
    public final static String FIELD_PSDBVALUEOPNAME = "psdbvalueopname";

    /**
     * 设置 值操作，详细说明：{@link #FIELD_PSDBVALUEOPNAME}
     * 
     * @param pSDBValueOPName
     * 
     */
    @JsonProperty(FIELD_PSDBVALUEOPNAME)
    public void setPSDBValueOPName(String pSDBValueOPName){
        this.set(FIELD_PSDBVALUEOPNAME, pSDBValueOPName);
    }
    
    /**
     * 获取 值操作  
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
     * 判断 值操作 是否指定值，包括空值
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
     * 重置 值操作
     */
    @JsonIgnore
    public void resetPSDBValueOPName(){
        this.reset(FIELD_PSDBVALUEOPNAME);
    }

    /**
     * 设置 值操作，详细说明：{@link #FIELD_PSDBVALUEOPNAME}
     * <P>
     * 等同 {@link #setPSDBValueOPName}
     * @param pSDBValueOPName
     */
    @JsonIgnore
    public PSWFLinkCondDTO psdbvalueopname(String pSDBValueOPName){
        this.setPSDBValueOPName(pSDBValueOPName);
        return this;
    }

    /**
     * <B>PSWFLINKCONDID</B>&nbsp;流程处理连接条件标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSWFLINKCONDID = "pswflinkcondid";

    /**
     * 设置 流程处理连接条件标识
     * 
     * @param pSWFLinkCondId
     * 
     */
    @JsonProperty(FIELD_PSWFLINKCONDID)
    public void setPSWFLinkCondId(String pSWFLinkCondId){
        this.set(FIELD_PSWFLINKCONDID, pSWFLinkCondId);
    }
    
    /**
     * 获取 流程处理连接条件标识  
     * @return
     */
    @JsonIgnore
    public String getPSWFLinkCondId(){
        Object objValue = this.get(FIELD_PSWFLINKCONDID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程处理连接条件标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFLinkCondIdDirty(){
        if(this.contains(FIELD_PSWFLINKCONDID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程处理连接条件标识
     */
    @JsonIgnore
    public void resetPSWFLinkCondId(){
        this.reset(FIELD_PSWFLINKCONDID);
    }

    /**
     * 设置 流程处理连接条件标识
     * <P>
     * 等同 {@link #setPSWFLinkCondId}
     * @param pSWFLinkCondId
     */
    @JsonIgnore
    public PSWFLinkCondDTO pswflinkcondid(String pSWFLinkCondId){
        this.setPSWFLinkCondId(pSWFLinkCondId);
        return this;
    }

    /**
     * <B>PSWFLINKCONDNAME</B>&nbsp;条件名称，指定流程处理连接条件的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSWFLINKCONDNAME = "pswflinkcondname";

    /**
     * 设置 条件名称，详细说明：{@link #FIELD_PSWFLINKCONDNAME}
     * 
     * @param pSWFLinkCondName
     * 
     */
    @JsonProperty(FIELD_PSWFLINKCONDNAME)
    public void setPSWFLinkCondName(String pSWFLinkCondName){
        this.set(FIELD_PSWFLINKCONDNAME, pSWFLinkCondName);
    }
    
    /**
     * 获取 条件名称  
     * @return
     */
    @JsonIgnore
    public String getPSWFLinkCondName(){
        Object objValue = this.get(FIELD_PSWFLINKCONDNAME);
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
    public boolean isPSWFLinkCondNameDirty(){
        if(this.contains(FIELD_PSWFLINKCONDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 条件名称
     */
    @JsonIgnore
    public void resetPSWFLinkCondName(){
        this.reset(FIELD_PSWFLINKCONDNAME);
    }

    /**
     * 设置 条件名称，详细说明：{@link #FIELD_PSWFLINKCONDNAME}
     * <P>
     * 等同 {@link #setPSWFLinkCondName}
     * @param pSWFLinkCondName
     */
    @JsonIgnore
    public PSWFLinkCondDTO pswflinkcondname(String pSWFLinkCondName){
        this.setPSWFLinkCondName(pSWFLinkCondName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSWFLinkCondName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSWFLinkCondName(strName);
    }

    @JsonIgnore
    public PSWFLinkCondDTO name(String strName){
        this.setPSWFLinkCondName(strName);
        return this;
    }

    /**
     * <B>PSWFLINKID</B>&nbsp;流程连接，指定流程处理连接条件所在的流程处理连接
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSWFLinkDTO} 
     */
    public final static String FIELD_PSWFLINKID = "pswflinkid";

    /**
     * 设置 流程连接，详细说明：{@link #FIELD_PSWFLINKID}
     * 
     * @param pSWFLinkId
     * 
     */
    @JsonProperty(FIELD_PSWFLINKID)
    public void setPSWFLinkId(String pSWFLinkId){
        this.set(FIELD_PSWFLINKID, pSWFLinkId);
    }
    
    /**
     * 获取 流程连接  
     * @return
     */
    @JsonIgnore
    public String getPSWFLinkId(){
        Object objValue = this.get(FIELD_PSWFLINKID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程连接 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFLinkIdDirty(){
        if(this.contains(FIELD_PSWFLINKID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程连接
     */
    @JsonIgnore
    public void resetPSWFLinkId(){
        this.reset(FIELD_PSWFLINKID);
    }

    /**
     * 设置 流程连接，详细说明：{@link #FIELD_PSWFLINKID}
     * <P>
     * 等同 {@link #setPSWFLinkId}
     * @param pSWFLinkId
     */
    @JsonIgnore
    public PSWFLinkCondDTO pswflinkid(String pSWFLinkId){
        this.setPSWFLinkId(pSWFLinkId);
        return this;
    }

    /**
     * 设置 流程连接，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSWFLinkId}
     * @param pSWFLink 引用对象
     */
    @JsonIgnore
    public PSWFLinkCondDTO pswflinkid(PSWFLinkDTO pSWFLink){
        if(pSWFLink == null){
            this.setPSWFLinkId(null);
            this.setPSWFLinkName(null);
        }
        else{
            this.setPSWFLinkId(pSWFLink.getPSWFLinkId());
            this.setPSWFLinkName(pSWFLink.getPSWFLinkName());
        }
        return this;
    }

    /**
     * <B>PSWFLINKNAME</B>&nbsp;流程连接，指定流程处理连接条件所在的流程处理连接
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWFLINKID}
     */
    public final static String FIELD_PSWFLINKNAME = "pswflinkname";

    /**
     * 设置 流程连接，详细说明：{@link #FIELD_PSWFLINKNAME}
     * 
     * @param pSWFLinkName
     * 
     */
    @JsonProperty(FIELD_PSWFLINKNAME)
    public void setPSWFLinkName(String pSWFLinkName){
        this.set(FIELD_PSWFLINKNAME, pSWFLinkName);
    }
    
    /**
     * 获取 流程连接  
     * @return
     */
    @JsonIgnore
    public String getPSWFLinkName(){
        Object objValue = this.get(FIELD_PSWFLINKNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程连接 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFLinkNameDirty(){
        if(this.contains(FIELD_PSWFLINKNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程连接
     */
    @JsonIgnore
    public void resetPSWFLinkName(){
        this.reset(FIELD_PSWFLINKNAME);
    }

    /**
     * 设置 流程连接，详细说明：{@link #FIELD_PSWFLINKNAME}
     * <P>
     * 等同 {@link #setPSWFLinkName}
     * @param pSWFLinkName
     */
    @JsonIgnore
    public PSWFLinkCondDTO pswflinkname(String pSWFLinkName){
        this.setPSWFLinkName(pSWFLinkName);
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
    public PSWFLinkCondDTO updatedate(Timestamp updateDate){
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
    public PSWFLinkCondDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSWFLinkCondId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSWFLinkCondId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSWFLinkCondId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSWFLinkCondId(strValue);
    }

    @JsonIgnore
    public PSWFLinkCondDTO id(String strValue){
        this.setPSWFLinkCondId(strValue);
        return this;
    }


    /**
     *  流程处理连接条件 成员集合
     */
    public final static String FIELD_PSWFLINKCONDS = "pswflinkconds";

    private java.util.List<net.ibizsys.centralstudio.dto.PSWFLinkCondDTO> pswflinkconds;

    /**
     * 获取 流程处理连接条件 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSWFLINKCONDS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSWFLinkCondDTO> getPSWFLinkConds(){
        return this.pswflinkconds;
    }

    /**
     * 设置 流程处理连接条件 成员集合  
     * @param pswflinkconds
     */
    @JsonProperty(FIELD_PSWFLINKCONDS)
    public void setPSWFLinkConds(java.util.List<net.ibizsys.centralstudio.dto.PSWFLinkCondDTO> pswflinkconds){
        this.pswflinkconds = pswflinkconds;
    }

    /**
     * 获取 流程处理连接条件 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSWFLinkCondDTO> getPSWFLinkCondsIf(){
        if(this.pswflinkconds == null){
            this.pswflinkconds = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSWFLinkCondDTO>();          
        }
        return this.pswflinkconds;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSWFLinkCondDTO){
            PSWFLinkCondDTO dto = (PSWFLinkCondDTO)iEntity;
            dto.setPSWFLinkConds(this.getPSWFLinkConds());
        }
        super.copyTo(iEntity);
    }
}
