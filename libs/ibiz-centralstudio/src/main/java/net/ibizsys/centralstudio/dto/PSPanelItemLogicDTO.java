package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSPANELITEMLOGIC</B>面板项逻辑 模型传输对象
 * <P>
 * 面板部件的动态逻辑模型，为面板成员提供动态的显示隐藏控制逻辑，支持组合、单项条件类型，支持层级逻辑结构
 */
public class PSPanelItemLogicDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSPanelItemLogicDTO(){
    }      

    /**
     * <B>CONDOP</B>&nbsp;条件操作，指定面板项逻辑条件的操作符
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_CONDOP = "condop";

    /**
     * 设置 条件操作，详细说明：{@link #FIELD_CONDOP}
     * 
     * @param condOp
     * 
     */
    @JsonProperty(FIELD_CONDOP)
    public void setCondOp(String condOp){
        this.set(FIELD_CONDOP, condOp);
    }
    
    /**
     * 获取 条件操作  
     * @return
     */
    @JsonIgnore
    public String getCondOp(){
        Object objValue = this.get(FIELD_CONDOP);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 条件操作 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCondOpDirty(){
        if(this.contains(FIELD_CONDOP)){
            return true;
        }
        return false;
    }

    /**
     * 重置 条件操作
     */
    @JsonIgnore
    public void resetCondOp(){
        this.reset(FIELD_CONDOP);
    }

    /**
     * 设置 条件操作，详细说明：{@link #FIELD_CONDOP}
     * <P>
     * 等同 {@link #setCondOp}
     * @param condOp
     */
    @JsonIgnore
    public PSPanelItemLogicDTO condop(String condOp){
        this.setCondOp(condOp);
        return this;
    }

    /**
     * <B>CONDVALUE</B>&nbsp;条件值，指定单项逻辑的条件值
     * <P>
     * 字符串：最大长度 500
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
    public PSPanelItemLogicDTO condvalue(String condValue){
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
    public PSPanelItemLogicDTO createdate(Timestamp createDate){
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
    public PSPanelItemLogicDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CUSTOMCODE</B>&nbsp;自定义代码
     */
    public final static String FIELD_CUSTOMCODE = "customcode";

    /**
     * 设置 自定义代码
     * 
     * @param customCode
     * 
     */
    @JsonProperty(FIELD_CUSTOMCODE)
    public void setCustomCode(String customCode){
        this.set(FIELD_CUSTOMCODE, customCode);
    }
    
    /**
     * 获取 自定义代码  
     * @return
     */
    @JsonIgnore
    public String getCustomCode(){
        Object objValue = this.get(FIELD_CUSTOMCODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomCodeDirty(){
        if(this.contains(FIELD_CUSTOMCODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义代码
     */
    @JsonIgnore
    public void resetCustomCode(){
        this.reset(FIELD_CUSTOMCODE);
    }

    /**
     * 设置 自定义代码
     * <P>
     * 等同 {@link #setCustomCode}
     * @param customCode
     */
    @JsonIgnore
    public PSPanelItemLogicDTO customcode(String customCode){
        this.setCustomCode(customCode);
        return this;
    }

    /**
     * <B>DSTFIELDNAME</B>&nbsp;面板模型属性，指定单项逻辑判断的面板模型的名称
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_DSTFIELDNAME = "dstfieldname";

    /**
     * 设置 面板模型属性，详细说明：{@link #FIELD_DSTFIELDNAME}
     * 
     * @param dstFieldName
     * 
     */
    @JsonProperty(FIELD_DSTFIELDNAME)
    public void setDstFieldName(String dstFieldName){
        this.set(FIELD_DSTFIELDNAME, dstFieldName);
    }
    
    /**
     * 获取 面板模型属性  
     * @return
     */
    @JsonIgnore
    public String getDstFieldName(){
        Object objValue = this.get(FIELD_DSTFIELDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 面板模型属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstFieldNameDirty(){
        if(this.contains(FIELD_DSTFIELDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板模型属性
     */
    @JsonIgnore
    public void resetDstFieldName(){
        this.reset(FIELD_DSTFIELDNAME);
    }

    /**
     * 设置 面板模型属性，详细说明：{@link #FIELD_DSTFIELDNAME}
     * <P>
     * 等同 {@link #setDstFieldName}
     * @param dstFieldName
     */
    @JsonIgnore
    public PSPanelItemLogicDTO dstfieldname(String dstFieldName){
        this.setDstFieldName(dstFieldName);
        return this;
    }

    /**
     * <B>DSTPSPANELMODELID</B>&nbsp;目标面板逻辑参数
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysViewPanelModelDTO} 
     */
    public final static String FIELD_DSTPSPANELMODELID = "dstpspanelmodelid";

    /**
     * 设置 目标面板逻辑参数
     * 
     * @param dstPSPanelModelId
     * 
     */
    @JsonProperty(FIELD_DSTPSPANELMODELID)
    public void setDstPSPanelModelId(String dstPSPanelModelId){
        this.set(FIELD_DSTPSPANELMODELID, dstPSPanelModelId);
    }
    
    /**
     * 获取 目标面板逻辑参数  
     * @return
     */
    @JsonIgnore
    public String getDstPSPanelModelId(){
        Object objValue = this.get(FIELD_DSTPSPANELMODELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标面板逻辑参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSPanelModelIdDirty(){
        if(this.contains(FIELD_DSTPSPANELMODELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标面板逻辑参数
     */
    @JsonIgnore
    public void resetDstPSPanelModelId(){
        this.reset(FIELD_DSTPSPANELMODELID);
    }

    /**
     * 设置 目标面板逻辑参数
     * <P>
     * 等同 {@link #setDstPSPanelModelId}
     * @param dstPSPanelModelId
     */
    @JsonIgnore
    public PSPanelItemLogicDTO dstpspanelmodelid(String dstPSPanelModelId){
        this.setDstPSPanelModelId(dstPSPanelModelId);
        return this;
    }

    /**
     * 设置 目标面板逻辑参数，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDstPSPanelModelId}
     * @param pSSysViewPanelModel 引用对象
     */
    @JsonIgnore
    public PSPanelItemLogicDTO dstpspanelmodelid(PSSysViewPanelModelDTO pSSysViewPanelModel){
        if(pSSysViewPanelModel == null){
            this.setDstPSPanelModelId(null);
            this.setDstPSPanelModelName(null);
        }
        else{
            this.setDstPSPanelModelId(pSSysViewPanelModel.getPSSysViewPanelModelId());
            this.setDstPSPanelModelName(pSSysViewPanelModel.getPSSysViewPanelModelName());
        }
        return this;
    }

    /**
     * <B>DSTPSPANELMODELNAME</B>&nbsp;目标模型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DSTPSPANELMODELID}
     */
    public final static String FIELD_DSTPSPANELMODELNAME = "dstpspanelmodelname";

    /**
     * 设置 目标模型
     * 
     * @param dstPSPanelModelName
     * 
     */
    @JsonProperty(FIELD_DSTPSPANELMODELNAME)
    public void setDstPSPanelModelName(String dstPSPanelModelName){
        this.set(FIELD_DSTPSPANELMODELNAME, dstPSPanelModelName);
    }
    
    /**
     * 获取 目标模型  
     * @return
     */
    @JsonIgnore
    public String getDstPSPanelModelName(){
        Object objValue = this.get(FIELD_DSTPSPANELMODELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSPanelModelNameDirty(){
        if(this.contains(FIELD_DSTPSPANELMODELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标模型
     */
    @JsonIgnore
    public void resetDstPSPanelModelName(){
        this.reset(FIELD_DSTPSPANELMODELNAME);
    }

    /**
     * 设置 目标模型
     * <P>
     * 等同 {@link #setDstPSPanelModelName}
     * @param dstPSPanelModelName
     */
    @JsonIgnore
    public PSPanelItemLogicDTO dstpspanelmodelname(String dstPSPanelModelName){
        this.setDstPSPanelModelName(dstPSPanelModelName);
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
    public PSPanelItemLogicDTO groupnotflag(Integer groupNotFlag){
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
    public PSPanelItemLogicDTO groupnotflag(Boolean groupNotFlag){
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
    public PSPanelItemLogicDTO groupop(String groupOP){
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
    public PSPanelItemLogicDTO groupop(net.ibizsys.model.PSModelEnums.GroupCondOP groupOP){
        if(groupOP == null){
            this.setGroupOP(null);
        }
        else{
            this.setGroupOP(groupOP.value);
        }
        return this;
    }

    /**
     * <B>LOGICCAT</B>&nbsp;逻辑分类，指定面板部件动态逻辑的分类
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.CtrlDetailLogicCat} 
     */
    public final static String FIELD_LOGICCAT = "logiccat";

    /**
     * 设置 逻辑分类，详细说明：{@link #FIELD_LOGICCAT}
     * 
     * @param logicCat
     * 
     */
    @JsonProperty(FIELD_LOGICCAT)
    public void setLogicCat(String logicCat){
        this.set(FIELD_LOGICCAT, logicCat);
    }
    
    /**
     * 获取 逻辑分类  
     * @return
     */
    @JsonIgnore
    public String getLogicCat(){
        Object objValue = this.get(FIELD_LOGICCAT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 逻辑分类 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLogicCatDirty(){
        if(this.contains(FIELD_LOGICCAT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 逻辑分类
     */
    @JsonIgnore
    public void resetLogicCat(){
        this.reset(FIELD_LOGICCAT);
    }

    /**
     * 设置 逻辑分类，详细说明：{@link #FIELD_LOGICCAT}
     * <P>
     * 等同 {@link #setLogicCat}
     * @param logicCat
     */
    @JsonIgnore
    public PSPanelItemLogicDTO logiccat(String logicCat){
        this.setLogicCat(logicCat);
        return this;
    }

     /**
     * 设置 逻辑分类，详细说明：{@link #FIELD_LOGICCAT}
     * <P>
     * 等同 {@link #setLogicCat}
     * @param logicCat
     */
    @JsonIgnore
    public PSPanelItemLogicDTO logiccat(net.ibizsys.model.PSModelEnums.CtrlDetailLogicCat logicCat){
        if(logicCat == null){
            this.setLogicCat(null);
        }
        else{
            this.setLogicCat(logicCat.value);
        }
        return this;
    }

    /**
     * <B>LOGICTYPE</B>&nbsp;逻辑类型，指定面板动态逻辑的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.FormDetailLogicType} 
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
    public PSPanelItemLogicDTO logictype(String logicType){
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
    public PSPanelItemLogicDTO logictype(net.ibizsys.model.PSModelEnums.FormDetailLogicType logicType){
        if(logicType == null){
            this.setLogicType(null);
        }
        else{
            this.setLogicType(logicType.value);
        }
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
    public PSPanelItemLogicDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PPSPANELITEMLOGICID</B>&nbsp;父逻辑，指定面板逻辑的父逻辑项
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSPanelItemLogicDTO} 
     */
    public final static String FIELD_PPSPANELITEMLOGICID = "ppspanelitemlogicid";

    /**
     * 设置 父逻辑，详细说明：{@link #FIELD_PPSPANELITEMLOGICID}
     * 
     * @param pPSPanelItemLogicId
     * 
     */
    @JsonProperty(FIELD_PPSPANELITEMLOGICID)
    public void setPPSPanelItemLogicId(String pPSPanelItemLogicId){
        this.set(FIELD_PPSPANELITEMLOGICID, pPSPanelItemLogicId);
    }
    
    /**
     * 获取 父逻辑  
     * @return
     */
    @JsonIgnore
    public String getPPSPanelItemLogicId(){
        Object objValue = this.get(FIELD_PPSPANELITEMLOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSPanelItemLogicIdDirty(){
        if(this.contains(FIELD_PPSPANELITEMLOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父逻辑
     */
    @JsonIgnore
    public void resetPPSPanelItemLogicId(){
        this.reset(FIELD_PPSPANELITEMLOGICID);
    }

    /**
     * 设置 父逻辑，详细说明：{@link #FIELD_PPSPANELITEMLOGICID}
     * <P>
     * 等同 {@link #setPPSPanelItemLogicId}
     * @param pPSPanelItemLogicId
     */
    @JsonIgnore
    public PSPanelItemLogicDTO ppspanelitemlogicid(String pPSPanelItemLogicId){
        this.setPPSPanelItemLogicId(pPSPanelItemLogicId);
        return this;
    }

    /**
     * 设置 父逻辑，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPPSPanelItemLogicId}
     * @param pSPanelItemLogic 引用对象
     */
    @JsonIgnore
    public PSPanelItemLogicDTO ppspanelitemlogicid(PSPanelItemLogicDTO pSPanelItemLogic){
        if(pSPanelItemLogic == null){
            this.setPPSPanelItemLogicId(null);
            this.setPPSPanelItemLogicName(null);
        }
        else{
            this.setPPSPanelItemLogicId(pSPanelItemLogic.getPSPanelItemLogicId());
            this.setPPSPanelItemLogicName(pSPanelItemLogic.getPSPanelItemLogicName());
        }
        return this;
    }

    /**
     * <B>PPSPANELITEMLOGICNAME</B>&nbsp;父逻辑，指定面板逻辑的父逻辑项
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PPSPANELITEMLOGICID}
     */
    public final static String FIELD_PPSPANELITEMLOGICNAME = "ppspanelitemlogicname";

    /**
     * 设置 父逻辑，详细说明：{@link #FIELD_PPSPANELITEMLOGICNAME}
     * 
     * @param pPSPanelItemLogicName
     * 
     */
    @JsonProperty(FIELD_PPSPANELITEMLOGICNAME)
    public void setPPSPanelItemLogicName(String pPSPanelItemLogicName){
        this.set(FIELD_PPSPANELITEMLOGICNAME, pPSPanelItemLogicName);
    }
    
    /**
     * 获取 父逻辑  
     * @return
     */
    @JsonIgnore
    public String getPPSPanelItemLogicName(){
        Object objValue = this.get(FIELD_PPSPANELITEMLOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSPanelItemLogicNameDirty(){
        if(this.contains(FIELD_PPSPANELITEMLOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父逻辑
     */
    @JsonIgnore
    public void resetPPSPanelItemLogicName(){
        this.reset(FIELD_PPSPANELITEMLOGICNAME);
    }

    /**
     * 设置 父逻辑，详细说明：{@link #FIELD_PPSPANELITEMLOGICNAME}
     * <P>
     * 等同 {@link #setPPSPanelItemLogicName}
     * @param pPSPanelItemLogicName
     */
    @JsonIgnore
    public PSPanelItemLogicDTO ppspanelitemlogicname(String pPSPanelItemLogicName){
        this.setPPSPanelItemLogicName(pPSPanelItemLogicName);
        return this;
    }

    /**
     * <B>PSPANELITEMLOGICID</B>&nbsp;面板项逻辑标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSPANELITEMLOGICID = "pspanelitemlogicid";

    /**
     * 设置 面板项逻辑标识
     * 
     * @param pSPanelItemLogicId
     * 
     */
    @JsonProperty(FIELD_PSPANELITEMLOGICID)
    public void setPSPanelItemLogicId(String pSPanelItemLogicId){
        this.set(FIELD_PSPANELITEMLOGICID, pSPanelItemLogicId);
    }
    
    /**
     * 获取 面板项逻辑标识  
     * @return
     */
    @JsonIgnore
    public String getPSPanelItemLogicId(){
        Object objValue = this.get(FIELD_PSPANELITEMLOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 面板项逻辑标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSPanelItemLogicIdDirty(){
        if(this.contains(FIELD_PSPANELITEMLOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板项逻辑标识
     */
    @JsonIgnore
    public void resetPSPanelItemLogicId(){
        this.reset(FIELD_PSPANELITEMLOGICID);
    }

    /**
     * 设置 面板项逻辑标识
     * <P>
     * 等同 {@link #setPSPanelItemLogicId}
     * @param pSPanelItemLogicId
     */
    @JsonIgnore
    public PSPanelItemLogicDTO pspanelitemlogicid(String pSPanelItemLogicId){
        this.setPSPanelItemLogicId(pSPanelItemLogicId);
        return this;
    }

    /**
     * <B>PSPANELITEMLOGICNAME</B>&nbsp;面板项逻辑名称，指定面板逻辑项的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSPANELITEMLOGICNAME = "pspanelitemlogicname";

    /**
     * 设置 面板项逻辑名称，详细说明：{@link #FIELD_PSPANELITEMLOGICNAME}
     * 
     * @param pSPanelItemLogicName
     * 
     */
    @JsonProperty(FIELD_PSPANELITEMLOGICNAME)
    public void setPSPanelItemLogicName(String pSPanelItemLogicName){
        this.set(FIELD_PSPANELITEMLOGICNAME, pSPanelItemLogicName);
    }
    
    /**
     * 获取 面板项逻辑名称  
     * @return
     */
    @JsonIgnore
    public String getPSPanelItemLogicName(){
        Object objValue = this.get(FIELD_PSPANELITEMLOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 面板项逻辑名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSPanelItemLogicNameDirty(){
        if(this.contains(FIELD_PSPANELITEMLOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板项逻辑名称
     */
    @JsonIgnore
    public void resetPSPanelItemLogicName(){
        this.reset(FIELD_PSPANELITEMLOGICNAME);
    }

    /**
     * 设置 面板项逻辑名称，详细说明：{@link #FIELD_PSPANELITEMLOGICNAME}
     * <P>
     * 等同 {@link #setPSPanelItemLogicName}
     * @param pSPanelItemLogicName
     */
    @JsonIgnore
    public PSPanelItemLogicDTO pspanelitemlogicname(String pSPanelItemLogicName){
        this.setPSPanelItemLogicName(pSPanelItemLogicName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSPanelItemLogicName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSPanelItemLogicName(strName);
    }

    @JsonIgnore
    public PSPanelItemLogicDTO name(String strName){
        this.setPSPanelItemLogicName(strName);
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELID</B>&nbsp;系统面板，指定面板逻辑所在的面板对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysViewPanelDTO} 
     */
    public final static String FIELD_PSSYSVIEWPANELID = "pssysviewpanelid";

    /**
     * 设置 系统面板，详细说明：{@link #FIELD_PSSYSVIEWPANELID}
     * 
     * @param pSSysViewPanelId
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELID)
    public void setPSSysViewPanelId(String pSSysViewPanelId){
        this.set(FIELD_PSSYSVIEWPANELID, pSSysViewPanelId);
    }
    
    /**
     * 获取 系统面板  
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
     * 判断 系统面板 是否指定值，包括空值
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
     * 重置 系统面板
     */
    @JsonIgnore
    public void resetPSSysViewPanelId(){
        this.reset(FIELD_PSSYSVIEWPANELID);
    }

    /**
     * 设置 系统面板，详细说明：{@link #FIELD_PSSYSVIEWPANELID}
     * <P>
     * 等同 {@link #setPSSysViewPanelId}
     * @param pSSysViewPanelId
     */
    @JsonIgnore
    public PSPanelItemLogicDTO pssysviewpanelid(String pSSysViewPanelId){
        this.setPSSysViewPanelId(pSSysViewPanelId);
        return this;
    }

    /**
     * 设置 系统面板，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysViewPanelId}
     * @param pSSysViewPanel 引用对象
     */
    @JsonIgnore
    public PSPanelItemLogicDTO pssysviewpanelid(PSSysViewPanelDTO pSSysViewPanel){
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
     * <B>PSSYSVIEWPANELITEMID</B>&nbsp;面板项，指定面板逻辑所在的面板项
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysViewPanelItemDTO} 
     */
    public final static String FIELD_PSSYSVIEWPANELITEMID = "pssysviewpanelitemid";

    /**
     * 设置 面板项，详细说明：{@link #FIELD_PSSYSVIEWPANELITEMID}
     * 
     * @param pSSysViewPanelItemId
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELITEMID)
    public void setPSSysViewPanelItemId(String pSSysViewPanelItemId){
        this.set(FIELD_PSSYSVIEWPANELITEMID, pSSysViewPanelItemId);
    }
    
    /**
     * 获取 面板项  
     * @return
     */
    @JsonIgnore
    public String getPSSysViewPanelItemId(){
        Object objValue = this.get(FIELD_PSSYSVIEWPANELITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 面板项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysViewPanelItemIdDirty(){
        if(this.contains(FIELD_PSSYSVIEWPANELITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板项
     */
    @JsonIgnore
    public void resetPSSysViewPanelItemId(){
        this.reset(FIELD_PSSYSVIEWPANELITEMID);
    }

    /**
     * 设置 面板项，详细说明：{@link #FIELD_PSSYSVIEWPANELITEMID}
     * <P>
     * 等同 {@link #setPSSysViewPanelItemId}
     * @param pSSysViewPanelItemId
     */
    @JsonIgnore
    public PSPanelItemLogicDTO pssysviewpanelitemid(String pSSysViewPanelItemId){
        this.setPSSysViewPanelItemId(pSSysViewPanelItemId);
        return this;
    }

    /**
     * 设置 面板项，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysViewPanelItemId}
     * @param pSSysViewPanelItem 引用对象
     */
    @JsonIgnore
    public PSPanelItemLogicDTO pssysviewpanelitemid(PSSysViewPanelItemDTO pSSysViewPanelItem){
        if(pSSysViewPanelItem == null){
            this.setPSSysViewPanelItemId(null);
            this.setPSSysViewPanelItemName(null);
        }
        else{
            this.setPSSysViewPanelItemId(pSSysViewPanelItem.getPSSysViewPanelItemId());
            this.setPSSysViewPanelItemName(pSSysViewPanelItem.getPSSysViewPanelItemName());
        }
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELITEMNAME</B>&nbsp;面板项，指定面板逻辑所在的面板项
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSVIEWPANELITEMID}
     */
    public final static String FIELD_PSSYSVIEWPANELITEMNAME = "pssysviewpanelitemname";

    /**
     * 设置 面板项，详细说明：{@link #FIELD_PSSYSVIEWPANELITEMNAME}
     * 
     * @param pSSysViewPanelItemName
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELITEMNAME)
    public void setPSSysViewPanelItemName(String pSSysViewPanelItemName){
        this.set(FIELD_PSSYSVIEWPANELITEMNAME, pSSysViewPanelItemName);
    }
    
    /**
     * 获取 面板项  
     * @return
     */
    @JsonIgnore
    public String getPSSysViewPanelItemName(){
        Object objValue = this.get(FIELD_PSSYSVIEWPANELITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 面板项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysViewPanelItemNameDirty(){
        if(this.contains(FIELD_PSSYSVIEWPANELITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板项
     */
    @JsonIgnore
    public void resetPSSysViewPanelItemName(){
        this.reset(FIELD_PSSYSVIEWPANELITEMNAME);
    }

    /**
     * 设置 面板项，详细说明：{@link #FIELD_PSSYSVIEWPANELITEMNAME}
     * <P>
     * 等同 {@link #setPSSysViewPanelItemName}
     * @param pSSysViewPanelItemName
     */
    @JsonIgnore
    public PSPanelItemLogicDTO pssysviewpanelitemname(String pSSysViewPanelItemName){
        this.setPSSysViewPanelItemName(pSSysViewPanelItemName);
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELNAME</B>&nbsp;系统面板，指定面板逻辑所在的面板对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSVIEWPANELID}
     */
    public final static String FIELD_PSSYSVIEWPANELNAME = "pssysviewpanelname";

    /**
     * 设置 系统面板，详细说明：{@link #FIELD_PSSYSVIEWPANELNAME}
     * 
     * @param pSSysViewPanelName
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELNAME)
    public void setPSSysViewPanelName(String pSSysViewPanelName){
        this.set(FIELD_PSSYSVIEWPANELNAME, pSSysViewPanelName);
    }
    
    /**
     * 获取 系统面板  
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
     * 判断 系统面板 是否指定值，包括空值
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
     * 重置 系统面板
     */
    @JsonIgnore
    public void resetPSSysViewPanelName(){
        this.reset(FIELD_PSSYSVIEWPANELNAME);
    }

    /**
     * 设置 系统面板，详细说明：{@link #FIELD_PSSYSVIEWPANELNAME}
     * <P>
     * 等同 {@link #setPSSysViewPanelName}
     * @param pSSysViewPanelName
     */
    @JsonIgnore
    public PSPanelItemLogicDTO pssysviewpanelname(String pSSysViewPanelName){
        this.setPSSysViewPanelName(pSSysViewPanelName);
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
    public PSPanelItemLogicDTO updatedate(Timestamp updateDate){
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
    public PSPanelItemLogicDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSPanelItemLogicId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSPanelItemLogicId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSPanelItemLogicId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSPanelItemLogicId(strValue);
    }

    @JsonIgnore
    public PSPanelItemLogicDTO id(String strValue){
        this.setPSPanelItemLogicId(strValue);
        return this;
    }


    /**
     *  面板项逻辑 成员集合
     */
    public final static String FIELD_PSPANELITEMLOGICS = "pspanelitemlogics";

    private java.util.List<net.ibizsys.centralstudio.dto.PSPanelItemLogicDTO> pspanelitemlogics;

    /**
     * 获取 面板项逻辑 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSPANELITEMLOGICS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSPanelItemLogicDTO> getPSPanelItemLogics(){
        return this.pspanelitemlogics;
    }

    /**
     * 设置 面板项逻辑 成员集合  
     * @param pspanelitemlogics
     */
    @JsonProperty(FIELD_PSPANELITEMLOGICS)
    public void setPSPanelItemLogics(java.util.List<net.ibizsys.centralstudio.dto.PSPanelItemLogicDTO> pspanelitemlogics){
        this.pspanelitemlogics = pspanelitemlogics;
    }

    /**
     * 获取 面板项逻辑 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSPanelItemLogicDTO> getPSPanelItemLogicsIf(){
        if(this.pspanelitemlogics == null){
            this.pspanelitemlogics = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSPanelItemLogicDTO>();          
        }
        return this.pspanelitemlogics;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSPanelItemLogicDTO){
            PSPanelItemLogicDTO dto = (PSPanelItemLogicDTO)iEntity;
            dto.setPSPanelItemLogics(this.getPSPanelItemLogics());
        }
        super.copyTo(iEntity);
    }
}
