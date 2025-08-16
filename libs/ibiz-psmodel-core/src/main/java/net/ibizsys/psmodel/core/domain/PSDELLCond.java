package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSDELLCOND</B>实体处理逻辑连接条件 模型传输对象
 * <P>
 * 实体处理逻辑中的处理节点连接条件模型，支持组合、单项条件类型，支持层级结构
 */
public class PSDELLCond extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDELLCond(){
    }      

    /**
     * <B>CONDVALUE</B>&nbsp;值或属性，指定单项条件的条件值或数据对象的属性标识
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_CONDVALUE = "condvalue";

    /**
     * 设置 值或属性，详细说明：{@link #FIELD_CONDVALUE}
     * 
     * @param condValue
     * 
     */
    @JsonProperty(FIELD_CONDVALUE)
    public void setCondValue(String condValue){
        this.set(FIELD_CONDVALUE, condValue);
    }
    
    /**
     * 获取 值或属性  
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
     * 判断 值或属性 是否指定值，包括空值
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
     * 重置 值或属性
     */
    @JsonIgnore
    public void resetCondValue(){
        this.reset(FIELD_CONDVALUE);
    }

    /**
     * 设置 值或属性，详细说明：{@link #FIELD_CONDVALUE}
     * <P>
     * 等同 {@link #setCondValue}
     * @param condValue
     */
    @JsonIgnore
    public PSDELLCond condvalue(String condValue){
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
    public PSDELLCond createdate(String createDate){
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
    public PSDELLCond createman(String createMan){
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
    public PSDELLCond customdstparam(String customDSTParam){
        this.setCustomDSTParam(customDSTParam);
        return this;
    }

    /**
     * <B>DSTPARAMPSDEID</B>&nbsp;目标参数实体标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DSTPSDLPARAMID}
     */
    public final static String FIELD_DSTPARAMPSDEID = "dstparampsdeid";

    /**
     * 设置 目标参数实体标识
     * 
     * @param dstParamPSDEId
     * 
     */
    @JsonProperty(FIELD_DSTPARAMPSDEID)
    public void setDstParamPSDEId(String dstParamPSDEId){
        this.set(FIELD_DSTPARAMPSDEID, dstParamPSDEId);
    }
    
    /**
     * 获取 目标参数实体标识  
     * @return
     */
    @JsonIgnore
    public String getDstParamPSDEId(){
        Object objValue = this.get(FIELD_DSTPARAMPSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标参数实体标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstParamPSDEIdDirty(){
        if(this.contains(FIELD_DSTPARAMPSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标参数实体标识
     */
    @JsonIgnore
    public void resetDstParamPSDEId(){
        this.reset(FIELD_DSTPARAMPSDEID);
    }

    /**
     * 设置 目标参数实体标识
     * <P>
     * 等同 {@link #setDstParamPSDEId}
     * @param dstParamPSDEId
     */
    @JsonIgnore
    public PSDELLCond dstparampsdeid(String dstParamPSDEId){
        this.setDstParamPSDEId(dstParamPSDEId);
        return this;
    }

    /**
     * <B>DSTPSDEFID</B>&nbsp;目标参数名称，指定目标参数的属性，如存在自定义目标参数属性则优先使用自定义属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_DSTPSDEFID = "dstpsdefid";

    /**
     * 设置 目标参数名称，详细说明：{@link #FIELD_DSTPSDEFID}
     * 
     * @param dstPSDEFId
     * 
     */
    @JsonProperty(FIELD_DSTPSDEFID)
    public void setDstPSDEFId(String dstPSDEFId){
        this.set(FIELD_DSTPSDEFID, dstPSDEFId);
    }
    
    /**
     * 获取 目标参数名称  
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
     * 判断 目标参数名称 是否指定值，包括空值
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
     * 重置 目标参数名称
     */
    @JsonIgnore
    public void resetDstPSDEFId(){
        this.reset(FIELD_DSTPSDEFID);
    }

    /**
     * 设置 目标参数名称，详细说明：{@link #FIELD_DSTPSDEFID}
     * <P>
     * 等同 {@link #setDstPSDEFId}
     * @param dstPSDEFId
     */
    @JsonIgnore
    public PSDELLCond dstpsdefid(String dstPSDEFId){
        this.setDstPSDEFId(dstPSDEFId);
        return this;
    }

    /**
     * 设置 目标参数名称，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDstPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDELLCond dstpsdefid(PSDEField pSDEField){
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
    public PSDELLCond dstpsdefname(String dstPSDEFName){
        this.setDstPSDEFName(dstPSDEFName);
        return this;
    }

    /**
     * <B>DSTPSDLPARAMID</B>&nbsp;目标参数，指定处理逻辑连接条件的目标参数，来自当前处理逻辑的定义的参数
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDELogicParam} 
     */
    public final static String FIELD_DSTPSDLPARAMID = "dstpsdlparamid";

    /**
     * 设置 目标参数，详细说明：{@link #FIELD_DSTPSDLPARAMID}
     * 
     * @param dstPSDLParamId
     * 
     */
    @JsonProperty(FIELD_DSTPSDLPARAMID)
    public void setDstPSDLParamId(String dstPSDLParamId){
        this.set(FIELD_DSTPSDLPARAMID, dstPSDLParamId);
    }
    
    /**
     * 获取 目标参数  
     * @return
     */
    @JsonIgnore
    public String getDstPSDLParamId(){
        Object objValue = this.get(FIELD_DSTPSDLPARAMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDLParamIdDirty(){
        if(this.contains(FIELD_DSTPSDLPARAMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标参数
     */
    @JsonIgnore
    public void resetDstPSDLParamId(){
        this.reset(FIELD_DSTPSDLPARAMID);
    }

    /**
     * 设置 目标参数，详细说明：{@link #FIELD_DSTPSDLPARAMID}
     * <P>
     * 等同 {@link #setDstPSDLParamId}
     * @param dstPSDLParamId
     */
    @JsonIgnore
    public PSDELLCond dstpsdlparamid(String dstPSDLParamId){
        this.setDstPSDLParamId(dstPSDLParamId);
        return this;
    }

    /**
     * 设置 目标参数，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDstPSDLParamId}
     * @param pSDELogicParam 引用对象
     */
    @JsonIgnore
    public PSDELLCond dstpsdlparamid(PSDELogicParam pSDELogicParam){
        if(pSDELogicParam == null){
            this.setDstParamPSDEId(null);
            this.setDstPSDLParamId(null);
            this.setDstPSDLParamName(null);
        }
        else{
            this.setDstParamPSDEId(pSDELogicParam.getParamPSDEId());
            this.setDstPSDLParamId(pSDELogicParam.getPSDELogicParamId());
            this.setDstPSDLParamName(pSDELogicParam.getPSDELogicParamName());
        }
        return this;
    }

    /**
     * <B>DSTPSDLPARAMNAME</B>&nbsp;目标参数，指定处理逻辑连接条件的目标参数，来自当前处理逻辑的定义的参数
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DSTPSDLPARAMID}
     */
    public final static String FIELD_DSTPSDLPARAMNAME = "dstpsdlparamname";

    /**
     * 设置 目标参数，详细说明：{@link #FIELD_DSTPSDLPARAMNAME}
     * 
     * @param dstPSDLParamName
     * 
     */
    @JsonProperty(FIELD_DSTPSDLPARAMNAME)
    public void setDstPSDLParamName(String dstPSDLParamName){
        this.set(FIELD_DSTPSDLPARAMNAME, dstPSDLParamName);
    }
    
    /**
     * 获取 目标参数  
     * @return
     */
    @JsonIgnore
    public String getDstPSDLParamName(){
        Object objValue = this.get(FIELD_DSTPSDLPARAMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDLParamNameDirty(){
        if(this.contains(FIELD_DSTPSDLPARAMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标参数
     */
    @JsonIgnore
    public void resetDstPSDLParamName(){
        this.reset(FIELD_DSTPSDLPARAMNAME);
    }

    /**
     * 设置 目标参数，详细说明：{@link #FIELD_DSTPSDLPARAMNAME}
     * <P>
     * 等同 {@link #setDstPSDLParamName}
     * @param dstPSDLParamName
     */
    @JsonIgnore
    public PSDELLCond dstpsdlparamname(String dstPSDLParamName){
        this.setDstPSDLParamName(dstPSDLParamName);
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
    public PSDELLCond groupnotflag(Integer groupNotFlag){
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
    public PSDELLCond groupnotflag(Boolean groupNotFlag){
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
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.GroupCondOP} 
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
    public PSDELLCond groupop(String groupOP){
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
    public PSDELLCond groupop(net.ibizsys.psmodel.core.util.PSModelEnums.GroupCondOP groupOP){
        if(groupOP == null){
            this.setGroupOP(null);
        }
        else{
            this.setGroupOP(groupOP.value);
        }
        return this;
    }

    /**
     * <B>LOGICTYPE</B>&nbsp;逻辑类型，指定连接条件的逻辑类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.LogicLinkCondType} 
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
    public PSDELLCond logictype(String logicType){
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
    public PSDELLCond logictype(net.ibizsys.psmodel.core.util.PSModelEnums.LogicLinkCondType logicType){
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
    public PSDELLCond memo(String memo){
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
    public PSDELLCond ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PARAMTYPE</B>&nbsp;条件值类型，指定条件值的类型，未定义时使用【直接值】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DELLCondParamType} 
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
    public PSDELLCond paramtype(String paramType){
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
    public PSDELLCond paramtype(net.ibizsys.psmodel.core.util.PSModelEnums.DELLCondParamType paramType){
        if(paramType == null){
            this.setParamType(null);
        }
        else{
            this.setParamType(paramType.value);
        }
        return this;
    }

    /**
     * <B>PPSDELLCONDID</B>&nbsp;父条件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDELLCond} 
     */
    public final static String FIELD_PPSDELLCONDID = "ppsdellcondid";

    /**
     * 设置 父条件
     * 
     * @param pPSDELLCondId
     * 
     */
    @JsonProperty(FIELD_PPSDELLCONDID)
    public void setPPSDELLCondId(String pPSDELLCondId){
        this.set(FIELD_PPSDELLCONDID, pPSDELLCondId);
    }
    
    /**
     * 获取 父条件  
     * @return
     */
    @JsonIgnore
    public String getPPSDELLCondId(){
        Object objValue = this.get(FIELD_PPSDELLCONDID);
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
    public boolean isPPSDELLCondIdDirty(){
        if(this.contains(FIELD_PPSDELLCONDID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父条件
     */
    @JsonIgnore
    public void resetPPSDELLCondId(){
        this.reset(FIELD_PPSDELLCONDID);
    }

    /**
     * 设置 父条件
     * <P>
     * 等同 {@link #setPPSDELLCondId}
     * @param pPSDELLCondId
     */
    @JsonIgnore
    public PSDELLCond ppsdellcondid(String pPSDELLCondId){
        this.setPPSDELLCondId(pPSDELLCondId);
        return this;
    }

    /**
     * 设置 父条件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPPSDELLCondId}
     * @param pSDELLCond 引用对象
     */
    @JsonIgnore
    public PSDELLCond ppsdellcondid(PSDELLCond pSDELLCond){
        if(pSDELLCond == null){
            this.setPPSDELLCondId(null);
            this.setPPSDELLCondName(null);
        }
        else{
            this.setPPSDELLCondId(pSDELLCond.getPSDELLCondId());
            this.setPPSDELLCondName(pSDELLCond.getPSDELLCondName());
        }
        return this;
    }

    /**
     * <B>PPSDELLCONDNAME</B>&nbsp;父条件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PPSDELLCONDID}
     */
    public final static String FIELD_PPSDELLCONDNAME = "ppsdellcondname";

    /**
     * 设置 父条件
     * 
     * @param pPSDELLCondName
     * 
     */
    @JsonProperty(FIELD_PPSDELLCONDNAME)
    public void setPPSDELLCondName(String pPSDELLCondName){
        this.set(FIELD_PPSDELLCONDNAME, pPSDELLCondName);
    }
    
    /**
     * 获取 父条件  
     * @return
     */
    @JsonIgnore
    public String getPPSDELLCondName(){
        Object objValue = this.get(FIELD_PPSDELLCONDNAME);
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
    public boolean isPPSDELLCondNameDirty(){
        if(this.contains(FIELD_PPSDELLCONDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父条件
     */
    @JsonIgnore
    public void resetPPSDELLCondName(){
        this.reset(FIELD_PPSDELLCONDNAME);
    }

    /**
     * 设置 父条件
     * <P>
     * 等同 {@link #setPPSDELLCondName}
     * @param pPSDELLCondName
     */
    @JsonIgnore
    public PSDELLCond ppsdellcondname(String pPSDELLCondName){
        this.setPPSDELLCondName(pPSDELLCondName);
        return this;
    }

    /**
     * <B>PSDBVALUEOPID</B>&nbsp;值操作，直接逻辑处理连接条件的操作符
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
    public PSDELLCond psdbvalueopid(String pSDBValueOPId){
        this.setPSDBValueOPId(pSDBValueOPId);
        return this;
    }

    /**
     * <B>PSDBVALUEOPNAME</B>&nbsp;值操作，直接逻辑处理连接条件的操作符
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
    public PSDELLCond psdbvalueopname(String pSDBValueOPName){
        this.setPSDBValueOPName(pSDBValueOPName);
        return this;
    }

    /**
     * <B>PSDELLCONDID</B>&nbsp;实体处理逻辑连接条件标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDELLCONDID = "psdellcondid";

    /**
     * 设置 实体处理逻辑连接条件标识
     * 
     * @param pSDELLCondId
     * 
     */
    @JsonProperty(FIELD_PSDELLCONDID)
    public void setPSDELLCondId(String pSDELLCondId){
        this.set(FIELD_PSDELLCONDID, pSDELLCondId);
    }
    
    /**
     * 获取 实体处理逻辑连接条件标识  
     * @return
     */
    @JsonIgnore
    public String getPSDELLCondId(){
        Object objValue = this.get(FIELD_PSDELLCONDID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体处理逻辑连接条件标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDELLCondIdDirty(){
        if(this.contains(FIELD_PSDELLCONDID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体处理逻辑连接条件标识
     */
    @JsonIgnore
    public void resetPSDELLCondId(){
        this.reset(FIELD_PSDELLCONDID);
    }

    /**
     * 设置 实体处理逻辑连接条件标识
     * <P>
     * 等同 {@link #setPSDELLCondId}
     * @param pSDELLCondId
     */
    @JsonIgnore
    public PSDELLCond psdellcondid(String pSDELLCondId){
        this.setPSDELLCondId(pSDELLCondId);
        return this;
    }

    /**
     * <B>PSDELLCONDNAME</B>&nbsp;条件名称，指定条件的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDELLCONDNAME = "psdellcondname";

    /**
     * 设置 条件名称，详细说明：{@link #FIELD_PSDELLCONDNAME}
     * 
     * @param pSDELLCondName
     * 
     */
    @JsonProperty(FIELD_PSDELLCONDNAME)
    public void setPSDELLCondName(String pSDELLCondName){
        this.set(FIELD_PSDELLCONDNAME, pSDELLCondName);
    }
    
    /**
     * 获取 条件名称  
     * @return
     */
    @JsonIgnore
    public String getPSDELLCondName(){
        Object objValue = this.get(FIELD_PSDELLCONDNAME);
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
    public boolean isPSDELLCondNameDirty(){
        if(this.contains(FIELD_PSDELLCONDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 条件名称
     */
    @JsonIgnore
    public void resetPSDELLCondName(){
        this.reset(FIELD_PSDELLCONDNAME);
    }

    /**
     * 设置 条件名称，详细说明：{@link #FIELD_PSDELLCONDNAME}
     * <P>
     * 等同 {@link #setPSDELLCondName}
     * @param pSDELLCondName
     */
    @JsonIgnore
    public PSDELLCond psdellcondname(String pSDELLCondName){
        this.setPSDELLCondName(pSDELLCondName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDELLCondName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDELLCondName(strName);
    }

    @JsonIgnore
    public PSDELLCond name(String strName){
        this.setPSDELLCondName(strName);
        return this;
    }

    /**
     * <B>PSDELOGICID</B>&nbsp;实体逻辑标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDELOGICLINKID}
     */
    public final static String FIELD_PSDELOGICID = "psdelogicid";

    /**
     * 设置 实体逻辑标识
     * 
     * @param pSDElogicId
     * 
     */
    @JsonProperty(FIELD_PSDELOGICID)
    public void setPSDElogicId(String pSDElogicId){
        this.set(FIELD_PSDELOGICID, pSDElogicId);
    }
    
    /**
     * 获取 实体逻辑标识  
     * @return
     */
    @JsonIgnore
    public String getPSDElogicId(){
        Object objValue = this.get(FIELD_PSDELOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体逻辑标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDElogicIdDirty(){
        if(this.contains(FIELD_PSDELOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体逻辑标识
     */
    @JsonIgnore
    public void resetPSDElogicId(){
        this.reset(FIELD_PSDELOGICID);
    }

    /**
     * 设置 实体逻辑标识
     * <P>
     * 等同 {@link #setPSDElogicId}
     * @param pSDElogicId
     */
    @JsonIgnore
    public PSDELLCond psdelogicid(String pSDElogicId){
        this.setPSDElogicId(pSDElogicId);
        return this;
    }

    /**
     * <B>PSDELOGICLINKID</B>&nbsp;逻辑连接，指定连接条件所在的处理逻辑连接对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDELogicLink} 
     */
    public final static String FIELD_PSDELOGICLINKID = "psdelogiclinkid";

    /**
     * 设置 逻辑连接，详细说明：{@link #FIELD_PSDELOGICLINKID}
     * 
     * @param pSDELogicLinkId
     * 
     */
    @JsonProperty(FIELD_PSDELOGICLINKID)
    public void setPSDELogicLinkId(String pSDELogicLinkId){
        this.set(FIELD_PSDELOGICLINKID, pSDELogicLinkId);
    }
    
    /**
     * 获取 逻辑连接  
     * @return
     */
    @JsonIgnore
    public String getPSDELogicLinkId(){
        Object objValue = this.get(FIELD_PSDELOGICLINKID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 逻辑连接 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDELogicLinkIdDirty(){
        if(this.contains(FIELD_PSDELOGICLINKID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 逻辑连接
     */
    @JsonIgnore
    public void resetPSDELogicLinkId(){
        this.reset(FIELD_PSDELOGICLINKID);
    }

    /**
     * 设置 逻辑连接，详细说明：{@link #FIELD_PSDELOGICLINKID}
     * <P>
     * 等同 {@link #setPSDELogicLinkId}
     * @param pSDELogicLinkId
     */
    @JsonIgnore
    public PSDELLCond psdelogiclinkid(String pSDELogicLinkId){
        this.setPSDELogicLinkId(pSDELogicLinkId);
        return this;
    }

    /**
     * 设置 逻辑连接，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDELogicLinkId}
     * @param pSDELogicLink 引用对象
     */
    @JsonIgnore
    public PSDELLCond psdelogiclinkid(PSDELogicLink pSDELogicLink){
        if(pSDELogicLink == null){
            this.setPSDElogicId(null);
            this.setPSDELogicLinkId(null);
            this.setPSDELogicLinkName(null);
        }
        else{
            this.setPSDElogicId(pSDELogicLink.getPSDELogicId());
            this.setPSDELogicLinkId(pSDELogicLink.getPSDELogicLinkId());
            this.setPSDELogicLinkName(pSDELogicLink.getPSDELogicLinkName());
        }
        return this;
    }

    /**
     * <B>PSDELOGICLINKNAME</B>&nbsp;逻辑连接，指定连接条件所在的处理逻辑连接对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDELOGICLINKID}
     */
    public final static String FIELD_PSDELOGICLINKNAME = "psdelogiclinkname";

    /**
     * 设置 逻辑连接，详细说明：{@link #FIELD_PSDELOGICLINKNAME}
     * 
     * @param pSDELogicLinkName
     * 
     */
    @JsonProperty(FIELD_PSDELOGICLINKNAME)
    public void setPSDELogicLinkName(String pSDELogicLinkName){
        this.set(FIELD_PSDELOGICLINKNAME, pSDELogicLinkName);
    }
    
    /**
     * 获取 逻辑连接  
     * @return
     */
    @JsonIgnore
    public String getPSDELogicLinkName(){
        Object objValue = this.get(FIELD_PSDELOGICLINKNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 逻辑连接 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDELogicLinkNameDirty(){
        if(this.contains(FIELD_PSDELOGICLINKNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 逻辑连接
     */
    @JsonIgnore
    public void resetPSDELogicLinkName(){
        this.reset(FIELD_PSDELOGICLINKNAME);
    }

    /**
     * 设置 逻辑连接，详细说明：{@link #FIELD_PSDELOGICLINKNAME}
     * <P>
     * 等同 {@link #setPSDELogicLinkName}
     * @param pSDELogicLinkName
     */
    @JsonIgnore
    public PSDELLCond psdelogiclinkname(String pSDELogicLinkName){
        this.setPSDELogicLinkName(pSDELogicLinkName);
        return this;
    }

    /**
     * <B>SRCPSDLPARAMID</B>&nbsp;源参数
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDELogicParam} 
     */
    public final static String FIELD_SRCPSDLPARAMID = "srcpsdlparamid";

    /**
     * 设置 源参数
     * 
     * @param srcPSDLParamId
     * 
     */
    @JsonProperty(FIELD_SRCPSDLPARAMID)
    public void setSrcPSDLParamId(String srcPSDLParamId){
        this.set(FIELD_SRCPSDLPARAMID, srcPSDLParamId);
    }
    
    /**
     * 获取 源参数  
     * @return
     */
    @JsonIgnore
    public String getSrcPSDLParamId(){
        Object objValue = this.get(FIELD_SRCPSDLPARAMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 源参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSrcPSDLParamIdDirty(){
        if(this.contains(FIELD_SRCPSDLPARAMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 源参数
     */
    @JsonIgnore
    public void resetSrcPSDLParamId(){
        this.reset(FIELD_SRCPSDLPARAMID);
    }

    /**
     * 设置 源参数
     * <P>
     * 等同 {@link #setSrcPSDLParamId}
     * @param srcPSDLParamId
     */
    @JsonIgnore
    public PSDELLCond srcpsdlparamid(String srcPSDLParamId){
        this.setSrcPSDLParamId(srcPSDLParamId);
        return this;
    }

    /**
     * 设置 源参数，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setSrcPSDLParamId}
     * @param pSDELogicParam 引用对象
     */
    @JsonIgnore
    public PSDELLCond srcpsdlparamid(PSDELogicParam pSDELogicParam){
        if(pSDELogicParam == null){
            this.setSrcPSDLParamId(null);
            this.setSrcPSDLParamName(null);
        }
        else{
            this.setSrcPSDLParamId(pSDELogicParam.getPSDELogicParamId());
            this.setSrcPSDLParamName(pSDELogicParam.getPSDELogicParamName());
        }
        return this;
    }

    /**
     * <B>SRCPSDLPARAMNAME</B>&nbsp;源参数
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_SRCPSDLPARAMID}
     */
    public final static String FIELD_SRCPSDLPARAMNAME = "srcpsdlparamname";

    /**
     * 设置 源参数
     * 
     * @param srcPSDLParamName
     * 
     */
    @JsonProperty(FIELD_SRCPSDLPARAMNAME)
    public void setSrcPSDLParamName(String srcPSDLParamName){
        this.set(FIELD_SRCPSDLPARAMNAME, srcPSDLParamName);
    }
    
    /**
     * 获取 源参数  
     * @return
     */
    @JsonIgnore
    public String getSrcPSDLParamName(){
        Object objValue = this.get(FIELD_SRCPSDLPARAMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 源参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSrcPSDLParamNameDirty(){
        if(this.contains(FIELD_SRCPSDLPARAMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 源参数
     */
    @JsonIgnore
    public void resetSrcPSDLParamName(){
        this.reset(FIELD_SRCPSDLPARAMNAME);
    }

    /**
     * 设置 源参数
     * <P>
     * 等同 {@link #setSrcPSDLParamName}
     * @param srcPSDLParamName
     */
    @JsonIgnore
    public PSDELLCond srcpsdlparamname(String srcPSDLParamName){
        this.setSrcPSDLParamName(srcPSDLParamName);
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
    public PSDELLCond updatedate(String updateDate){
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
    public PSDELLCond updateman(String updateMan){
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
    public PSDELLCond usercat(String userCat){
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
    public PSDELLCond usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDELLCond usertag(String userTag){
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
    public PSDELLCond usertag2(String userTag2){
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
    public PSDELLCond usertag3(String userTag3){
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
    public PSDELLCond usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDELLCondId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDELLCondId(strValue);
    }

    @JsonIgnore
    public PSDELLCond id(String strValue){
        this.setPSDELLCondId(strValue);
        return this;
    }


    /**
     *  实体处理逻辑连接条件 成员集合
     */
    public final static String FIELD_PSDELLCONDS = "psdellconds";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSDELLCond> psdellconds;

    /**
     * 获取 实体处理逻辑连接条件 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDELLCONDS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDELLCond> getPSDELLConds(){
        return this.psdellconds;
    }

    /**
     * 设置 实体处理逻辑连接条件 成员集合  
     * @param psdellconds
     */
    @JsonProperty(FIELD_PSDELLCONDS)
    public void setPSDELLConds(java.util.List<net.ibizsys.psmodel.core.domain.PSDELLCond> psdellconds){
        this.psdellconds = psdellconds;
    }

    /**
     * 获取 实体处理逻辑连接条件 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDELLCond> getPSDELLCondsIf(){
        if(this.psdellconds == null){
            this.psdellconds = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSDELLCond>();          
        }
        return this.psdellconds;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDELLCond){
            PSDELLCond model = (PSDELLCond)iPSModel;
            model.setPSDELLConds(this.getPSDELLConds());
        }
        super.copyTo(iPSModel);
    }
}
