package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSDEWIZARDLOGIC</B>实体向导逻辑 模型传输对象
 * <P>
 * 
 */
public class PSDEWizardLogic extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEWizardLogic(){
        this.setValidFlag(1);
    }      

    /**
     * <B>ATTRNAME</B>&nbsp;属性名称
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ATTRNAME = "attrname";

    /**
     * 设置 属性名称
     * 
     * @param attrName
     * 
     */
    @JsonProperty(FIELD_ATTRNAME)
    public void setAttrName(String attrName){
        this.set(FIELD_ATTRNAME, attrName);
    }
    
    /**
     * 获取 属性名称  
     * @return
     */
    @JsonIgnore
    public String getAttrName(){
        Object objValue = this.get(FIELD_ATTRNAME);
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
    public boolean isAttrNameDirty(){
        if(this.contains(FIELD_ATTRNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性名称
     */
    @JsonIgnore
    public void resetAttrName(){
        this.reset(FIELD_ATTRNAME);
    }

    /**
     * 设置 属性名称
     * <P>
     * 等同 {@link #setAttrName}
     * @param attrName
     */
    @JsonIgnore
    public PSDEWizardLogic attrname(String attrName){
        this.setAttrName(attrName);
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
    public PSDEWizardLogic createdate(String createDate){
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
    public PSDEWizardLogic createman(String createMan){
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
    public PSDEWizardLogic customcode(String customCode){
        this.setCustomCode(customCode);
        return this;
    }

    /**
     * <B>DSTLOGICTYPE</B>&nbsp;目标逻辑类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.TargetUILogic} 
     */
    public final static String FIELD_DSTLOGICTYPE = "dstlogictype";

    /**
     * 设置 目标逻辑类型
     * 
     * @param dstLogicType
     * 
     */
    @JsonProperty(FIELD_DSTLOGICTYPE)
    public void setDstLogicType(String dstLogicType){
        this.set(FIELD_DSTLOGICTYPE, dstLogicType);
    }
    
    /**
     * 获取 目标逻辑类型  
     * @return
     */
    @JsonIgnore
    public String getDstLogicType(){
        Object objValue = this.get(FIELD_DSTLOGICTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标逻辑类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstLogicTypeDirty(){
        if(this.contains(FIELD_DSTLOGICTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标逻辑类型
     */
    @JsonIgnore
    public void resetDstLogicType(){
        this.reset(FIELD_DSTLOGICTYPE);
    }

    /**
     * 设置 目标逻辑类型
     * <P>
     * 等同 {@link #setDstLogicType}
     * @param dstLogicType
     */
    @JsonIgnore
    public PSDEWizardLogic dstlogictype(String dstLogicType){
        this.setDstLogicType(dstLogicType);
        return this;
    }

     /**
     * 设置 目标逻辑类型
     * <P>
     * 等同 {@link #setDstLogicType}
     * @param dstLogicType
     */
    @JsonIgnore
    public PSDEWizardLogic dstlogictype(net.ibizsys.psmodel.core.util.PSModelEnums.TargetUILogic dstLogicType){
        if(dstLogicType == null){
            this.setDstLogicType(null);
        }
        else{
            this.setDstLogicType(dstLogicType.value);
        }
        return this;
    }

    /**
     * <B>EVENTARG</B>&nbsp;事件参数
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_EVENTARG = "eventarg";

    /**
     * 设置 事件参数
     * 
     * @param eventArg
     * 
     */
    @JsonProperty(FIELD_EVENTARG)
    public void setEventArg(String eventArg){
        this.set(FIELD_EVENTARG, eventArg);
    }
    
    /**
     * 获取 事件参数  
     * @return
     */
    @JsonIgnore
    public String getEventArg(){
        Object objValue = this.get(FIELD_EVENTARG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 事件参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEventArgDirty(){
        if(this.contains(FIELD_EVENTARG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 事件参数
     */
    @JsonIgnore
    public void resetEventArg(){
        this.reset(FIELD_EVENTARG);
    }

    /**
     * 设置 事件参数
     * <P>
     * 等同 {@link #setEventArg}
     * @param eventArg
     */
    @JsonIgnore
    public PSDEWizardLogic eventarg(String eventArg){
        this.setEventArg(eventArg);
        return this;
    }

    /**
     * <B>EVENTARG2</B>&nbsp;事件参数2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_EVENTARG2 = "eventarg2";

    /**
     * 设置 事件参数2
     * 
     * @param eventArg2
     * 
     */
    @JsonProperty(FIELD_EVENTARG2)
    public void setEventArg2(String eventArg2){
        this.set(FIELD_EVENTARG2, eventArg2);
    }
    
    /**
     * 获取 事件参数2  
     * @return
     */
    @JsonIgnore
    public String getEventArg2(){
        Object objValue = this.get(FIELD_EVENTARG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 事件参数2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEventArg2Dirty(){
        if(this.contains(FIELD_EVENTARG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 事件参数2
     */
    @JsonIgnore
    public void resetEventArg2(){
        this.reset(FIELD_EVENTARG2);
    }

    /**
     * 设置 事件参数2
     * <P>
     * 等同 {@link #setEventArg2}
     * @param eventArg2
     */
    @JsonIgnore
    public PSDEWizardLogic eventarg2(String eventArg2){
        this.setEventArg2(eventArg2);
        return this;
    }

    /**
     * <B>EVENTNAMES</B>&nbsp;事件名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_EVENTNAMES = "eventnames";

    /**
     * 设置 事件名称
     * 
     * @param eventNames
     * 
     */
    @JsonProperty(FIELD_EVENTNAMES)
    public void setEventNames(String eventNames){
        this.set(FIELD_EVENTNAMES, eventNames);
    }
    
    /**
     * 获取 事件名称  
     * @return
     */
    @JsonIgnore
    public String getEventNames(){
        Object objValue = this.get(FIELD_EVENTNAMES);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 事件名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEventNamesDirty(){
        if(this.contains(FIELD_EVENTNAMES)){
            return true;
        }
        return false;
    }

    /**
     * 重置 事件名称
     */
    @JsonIgnore
    public void resetEventNames(){
        this.reset(FIELD_EVENTNAMES);
    }

    /**
     * 设置 事件名称
     * <P>
     * 等同 {@link #setEventNames}
     * @param eventNames
     */
    @JsonIgnore
    public PSDEWizardLogic eventnames(String eventNames){
        this.setEventNames(eventNames);
        return this;
    }

    /**
     * <B>LOGICPARAM</B>&nbsp;逻辑参数
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_LOGICPARAM = "logicparam";

    /**
     * 设置 逻辑参数
     * 
     * @param logicParam
     * 
     */
    @JsonProperty(FIELD_LOGICPARAM)
    public void setLogicParam(String logicParam){
        this.set(FIELD_LOGICPARAM, logicParam);
    }
    
    /**
     * 获取 逻辑参数  
     * @return
     */
    @JsonIgnore
    public String getLogicParam(){
        Object objValue = this.get(FIELD_LOGICPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 逻辑参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLogicParamDirty(){
        if(this.contains(FIELD_LOGICPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 逻辑参数
     */
    @JsonIgnore
    public void resetLogicParam(){
        this.reset(FIELD_LOGICPARAM);
    }

    /**
     * 设置 逻辑参数
     * <P>
     * 等同 {@link #setLogicParam}
     * @param logicParam
     */
    @JsonIgnore
    public PSDEWizardLogic logicparam(String logicParam){
        this.setLogicParam(logicParam);
        return this;
    }

    /**
     * <B>LOGICPARAM2</B>&nbsp;逻辑参数2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_LOGICPARAM2 = "logicparam2";

    /**
     * 设置 逻辑参数2
     * 
     * @param logicParam2
     * 
     */
    @JsonProperty(FIELD_LOGICPARAM2)
    public void setLogicParam2(String logicParam2){
        this.set(FIELD_LOGICPARAM2, logicParam2);
    }
    
    /**
     * 获取 逻辑参数2  
     * @return
     */
    @JsonIgnore
    public String getLogicParam2(){
        Object objValue = this.get(FIELD_LOGICPARAM2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 逻辑参数2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLogicParam2Dirty(){
        if(this.contains(FIELD_LOGICPARAM2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 逻辑参数2
     */
    @JsonIgnore
    public void resetLogicParam2(){
        this.reset(FIELD_LOGICPARAM2);
    }

    /**
     * 设置 逻辑参数2
     * <P>
     * 等同 {@link #setLogicParam2}
     * @param logicParam2
     */
    @JsonIgnore
    public PSDEWizardLogic logicparam2(String logicParam2){
        this.setLogicParam2(logicParam2);
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
    public PSDEWizardLogic memo(String memo){
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
    public PSDEWizardLogic ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
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
    public PSDEWizardLogic psdeid(String pSDEId){
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
    public PSDEWizardLogic psdeid(PSDataEntity pSDataEntity){
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
     * <B>PSDELOGICID</B>&nbsp;界面处理逻辑
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDELogic} 
     */
    public final static String FIELD_PSDELOGICID = "psdelogicid";

    /**
     * 设置 界面处理逻辑
     * 
     * @param pSDELogicId
     * 
     */
    @JsonProperty(FIELD_PSDELOGICID)
    public void setPSDELogicId(String pSDELogicId){
        this.set(FIELD_PSDELOGICID, pSDELogicId);
    }
    
    /**
     * 获取 界面处理逻辑  
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
     * 判断 界面处理逻辑 是否指定值，包括空值
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
     * 重置 界面处理逻辑
     */
    @JsonIgnore
    public void resetPSDELogicId(){
        this.reset(FIELD_PSDELOGICID);
    }

    /**
     * 设置 界面处理逻辑
     * <P>
     * 等同 {@link #setPSDELogicId}
     * @param pSDELogicId
     */
    @JsonIgnore
    public PSDEWizardLogic psdelogicid(String pSDELogicId){
        this.setPSDELogicId(pSDELogicId);
        return this;
    }

    /**
     * 设置 界面处理逻辑，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDELogicId}
     * @param pSDELogic 引用对象
     */
    @JsonIgnore
    public PSDEWizardLogic psdelogicid(PSDELogic pSDELogic){
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
     * <B>PSDELOGICNAME</B>&nbsp;界面处理逻辑
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDELOGICID}
     */
    public final static String FIELD_PSDELOGICNAME = "psdelogicname";

    /**
     * 设置 界面处理逻辑
     * 
     * @param pSDELogicName
     * 
     */
    @JsonProperty(FIELD_PSDELOGICNAME)
    public void setPSDELogicName(String pSDELogicName){
        this.set(FIELD_PSDELOGICNAME, pSDELogicName);
    }
    
    /**
     * 获取 界面处理逻辑  
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
     * 判断 界面处理逻辑 是否指定值，包括空值
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
     * 重置 界面处理逻辑
     */
    @JsonIgnore
    public void resetPSDELogicName(){
        this.reset(FIELD_PSDELOGICNAME);
    }

    /**
     * 设置 界面处理逻辑
     * <P>
     * 等同 {@link #setPSDELogicName}
     * @param pSDELogicName
     */
    @JsonIgnore
    public PSDEWizardLogic psdelogicname(String pSDELogicName){
        this.setPSDELogicName(pSDELogicName);
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
    public PSDEWizardLogic psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSDEUIACTIONID</B>&nbsp;实体界面行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEUIAction} 
     */
    public final static String FIELD_PSDEUIACTIONID = "psdeuiactionid";

    /**
     * 设置 实体界面行为
     * 
     * @param pSDEUIActionId
     * 
     */
    @JsonProperty(FIELD_PSDEUIACTIONID)
    public void setPSDEUIActionId(String pSDEUIActionId){
        this.set(FIELD_PSDEUIACTIONID, pSDEUIActionId);
    }
    
    /**
     * 获取 实体界面行为  
     * @return
     */
    @JsonIgnore
    public String getPSDEUIActionId(){
        Object objValue = this.get(FIELD_PSDEUIACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体界面行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEUIActionIdDirty(){
        if(this.contains(FIELD_PSDEUIACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体界面行为
     */
    @JsonIgnore
    public void resetPSDEUIActionId(){
        this.reset(FIELD_PSDEUIACTIONID);
    }

    /**
     * 设置 实体界面行为
     * <P>
     * 等同 {@link #setPSDEUIActionId}
     * @param pSDEUIActionId
     */
    @JsonIgnore
    public PSDEWizardLogic psdeuiactionid(String pSDEUIActionId){
        this.setPSDEUIActionId(pSDEUIActionId);
        return this;
    }

    /**
     * 设置 实体界面行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEUIActionId}
     * @param pSDEUIAction 引用对象
     */
    @JsonIgnore
    public PSDEWizardLogic psdeuiactionid(PSDEUIAction pSDEUIAction){
        if(pSDEUIAction == null){
            this.setPSDEUIActionId(null);
            this.setPSDEUIActionName(null);
        }
        else{
            this.setPSDEUIActionId(pSDEUIAction.getPSDEUIActionId());
            this.setPSDEUIActionName(pSDEUIAction.getPSDEUIActionName());
        }
        return this;
    }

    /**
     * <B>PSDEUIACTIONNAME</B>&nbsp;实体界面行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEUIACTIONID}
     */
    public final static String FIELD_PSDEUIACTIONNAME = "psdeuiactionname";

    /**
     * 设置 实体界面行为
     * 
     * @param pSDEUIActionName
     * 
     */
    @JsonProperty(FIELD_PSDEUIACTIONNAME)
    public void setPSDEUIActionName(String pSDEUIActionName){
        this.set(FIELD_PSDEUIACTIONNAME, pSDEUIActionName);
    }
    
    /**
     * 获取 实体界面行为  
     * @return
     */
    @JsonIgnore
    public String getPSDEUIActionName(){
        Object objValue = this.get(FIELD_PSDEUIACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体界面行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEUIActionNameDirty(){
        if(this.contains(FIELD_PSDEUIACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体界面行为
     */
    @JsonIgnore
    public void resetPSDEUIActionName(){
        this.reset(FIELD_PSDEUIACTIONNAME);
    }

    /**
     * 设置 实体界面行为
     * <P>
     * 等同 {@link #setPSDEUIActionName}
     * @param pSDEUIActionName
     */
    @JsonIgnore
    public PSDEWizardLogic psdeuiactionname(String pSDEUIActionName){
        this.setPSDEUIActionName(pSDEUIActionName);
        return this;
    }

    /**
     * <B>PSDEWIZARDFORMID</B>&nbsp;向导表单
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEWizardForm} 
     */
    public final static String FIELD_PSDEWIZARDFORMID = "psdewizardformid";

    /**
     * 设置 向导表单
     * 
     * @param pSDEWizardFormId
     * 
     */
    @JsonProperty(FIELD_PSDEWIZARDFORMID)
    public void setPSDEWizardFormId(String pSDEWizardFormId){
        this.set(FIELD_PSDEWIZARDFORMID, pSDEWizardFormId);
    }
    
    /**
     * 获取 向导表单  
     * @return
     */
    @JsonIgnore
    public String getPSDEWizardFormId(){
        Object objValue = this.get(FIELD_PSDEWIZARDFORMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 向导表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEWizardFormIdDirty(){
        if(this.contains(FIELD_PSDEWIZARDFORMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 向导表单
     */
    @JsonIgnore
    public void resetPSDEWizardFormId(){
        this.reset(FIELD_PSDEWIZARDFORMID);
    }

    /**
     * 设置 向导表单
     * <P>
     * 等同 {@link #setPSDEWizardFormId}
     * @param pSDEWizardFormId
     */
    @JsonIgnore
    public PSDEWizardLogic psdewizardformid(String pSDEWizardFormId){
        this.setPSDEWizardFormId(pSDEWizardFormId);
        return this;
    }

    /**
     * 设置 向导表单，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEWizardFormId}
     * @param pSDEWizardForm 引用对象
     */
    @JsonIgnore
    public PSDEWizardLogic psdewizardformid(PSDEWizardForm pSDEWizardForm){
        if(pSDEWizardForm == null){
            this.setPSDEWizardFormId(null);
            this.setPSDEWizardFormName(null);
        }
        else{
            this.setPSDEWizardFormId(pSDEWizardForm.getPSDEWizardFormId());
            this.setPSDEWizardFormName(pSDEWizardForm.getPSDEWizardFormName());
        }
        return this;
    }

    /**
     * <B>PSDEWIZARDFORMNAME</B>&nbsp;向导表单
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEWIZARDFORMID}
     */
    public final static String FIELD_PSDEWIZARDFORMNAME = "psdewizardformname";

    /**
     * 设置 向导表单
     * 
     * @param pSDEWizardFormName
     * 
     */
    @JsonProperty(FIELD_PSDEWIZARDFORMNAME)
    public void setPSDEWizardFormName(String pSDEWizardFormName){
        this.set(FIELD_PSDEWIZARDFORMNAME, pSDEWizardFormName);
    }
    
    /**
     * 获取 向导表单  
     * @return
     */
    @JsonIgnore
    public String getPSDEWizardFormName(){
        Object objValue = this.get(FIELD_PSDEWIZARDFORMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 向导表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEWizardFormNameDirty(){
        if(this.contains(FIELD_PSDEWIZARDFORMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 向导表单
     */
    @JsonIgnore
    public void resetPSDEWizardFormName(){
        this.reset(FIELD_PSDEWIZARDFORMNAME);
    }

    /**
     * 设置 向导表单
     * <P>
     * 等同 {@link #setPSDEWizardFormName}
     * @param pSDEWizardFormName
     */
    @JsonIgnore
    public PSDEWizardLogic psdewizardformname(String pSDEWizardFormName){
        this.setPSDEWizardFormName(pSDEWizardFormName);
        return this;
    }

    /**
     * <B>PSDEWIZARDID</B>&nbsp;实体向导
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEWizard} 
     */
    public final static String FIELD_PSDEWIZARDID = "psdewizardid";

    /**
     * 设置 实体向导
     * 
     * @param pSDEWizardId
     * 
     */
    @JsonProperty(FIELD_PSDEWIZARDID)
    public void setPSDEWizardId(String pSDEWizardId){
        this.set(FIELD_PSDEWIZARDID, pSDEWizardId);
    }
    
    /**
     * 获取 实体向导  
     * @return
     */
    @JsonIgnore
    public String getPSDEWizardId(){
        Object objValue = this.get(FIELD_PSDEWIZARDID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体向导 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEWizardIdDirty(){
        if(this.contains(FIELD_PSDEWIZARDID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体向导
     */
    @JsonIgnore
    public void resetPSDEWizardId(){
        this.reset(FIELD_PSDEWIZARDID);
    }

    /**
     * 设置 实体向导
     * <P>
     * 等同 {@link #setPSDEWizardId}
     * @param pSDEWizardId
     */
    @JsonIgnore
    public PSDEWizardLogic psdewizardid(String pSDEWizardId){
        this.setPSDEWizardId(pSDEWizardId);
        return this;
    }

    /**
     * 设置 实体向导，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEWizardId}
     * @param pSDEWizard 引用对象
     */
    @JsonIgnore
    public PSDEWizardLogic psdewizardid(PSDEWizard pSDEWizard){
        if(pSDEWizard == null){
            this.setPSDEWizardId(null);
            this.setPSDEWizardName(null);
        }
        else{
            this.setPSDEWizardId(pSDEWizard.getPSDEWizardId());
            this.setPSDEWizardName(pSDEWizard.getPSDEWizardName());
        }
        return this;
    }

    /**
     * <B>PSDEWIZARDLOGICID</B>&nbsp;实体向导逻辑标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEWIZARDLOGICID = "psdewizardlogicid";

    /**
     * 设置 实体向导逻辑标识
     * 
     * @param pSDEWizardLogicId
     * 
     */
    @JsonProperty(FIELD_PSDEWIZARDLOGICID)
    public void setPSDEWizardLogicId(String pSDEWizardLogicId){
        this.set(FIELD_PSDEWIZARDLOGICID, pSDEWizardLogicId);
    }
    
    /**
     * 获取 实体向导逻辑标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEWizardLogicId(){
        Object objValue = this.get(FIELD_PSDEWIZARDLOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体向导逻辑标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEWizardLogicIdDirty(){
        if(this.contains(FIELD_PSDEWIZARDLOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体向导逻辑标识
     */
    @JsonIgnore
    public void resetPSDEWizardLogicId(){
        this.reset(FIELD_PSDEWIZARDLOGICID);
    }

    /**
     * 设置 实体向导逻辑标识
     * <P>
     * 等同 {@link #setPSDEWizardLogicId}
     * @param pSDEWizardLogicId
     */
    @JsonIgnore
    public PSDEWizardLogic psdewizardlogicid(String pSDEWizardLogicId){
        this.setPSDEWizardLogicId(pSDEWizardLogicId);
        return this;
    }

    /**
     * <B>PSDEWIZARDLOGICNAME</B>&nbsp;逻辑标识
     * <P>
     * 字符串：最大长度 30，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSDEWIZARDLOGICNAME = "psdewizardlogicname";

    /**
     * 设置 逻辑标识
     * 
     * @param pSDEWizardLogicName
     * 
     */
    @JsonProperty(FIELD_PSDEWIZARDLOGICNAME)
    public void setPSDEWizardLogicName(String pSDEWizardLogicName){
        this.set(FIELD_PSDEWIZARDLOGICNAME, pSDEWizardLogicName);
    }
    
    /**
     * 获取 逻辑标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEWizardLogicName(){
        Object objValue = this.get(FIELD_PSDEWIZARDLOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 逻辑标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEWizardLogicNameDirty(){
        if(this.contains(FIELD_PSDEWIZARDLOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 逻辑标识
     */
    @JsonIgnore
    public void resetPSDEWizardLogicName(){
        this.reset(FIELD_PSDEWIZARDLOGICNAME);
    }

    /**
     * 设置 逻辑标识
     * <P>
     * 等同 {@link #setPSDEWizardLogicName}
     * @param pSDEWizardLogicName
     */
    @JsonIgnore
    public PSDEWizardLogic psdewizardlogicname(String pSDEWizardLogicName){
        this.setPSDEWizardLogicName(pSDEWizardLogicName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEWizardLogicName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEWizardLogicName(strName);
    }

    @JsonIgnore
    public PSDEWizardLogic name(String strName){
        this.setPSDEWizardLogicName(strName);
        return this;
    }

    /**
     * <B>PSDEWIZARDNAME</B>&nbsp;实体向导
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEWIZARDID}
     */
    public final static String FIELD_PSDEWIZARDNAME = "psdewizardname";

    /**
     * 设置 实体向导
     * 
     * @param pSDEWizardName
     * 
     */
    @JsonProperty(FIELD_PSDEWIZARDNAME)
    public void setPSDEWizardName(String pSDEWizardName){
        this.set(FIELD_PSDEWIZARDNAME, pSDEWizardName);
    }
    
    /**
     * 获取 实体向导  
     * @return
     */
    @JsonIgnore
    public String getPSDEWizardName(){
        Object objValue = this.get(FIELD_PSDEWIZARDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体向导 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEWizardNameDirty(){
        if(this.contains(FIELD_PSDEWIZARDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体向导
     */
    @JsonIgnore
    public void resetPSDEWizardName(){
        this.reset(FIELD_PSDEWIZARDNAME);
    }

    /**
     * 设置 实体向导
     * <P>
     * 等同 {@link #setPSDEWizardName}
     * @param pSDEWizardName
     */
    @JsonIgnore
    public PSDEWizardLogic psdewizardname(String pSDEWizardName){
        this.setPSDEWizardName(pSDEWizardName);
        return this;
    }

    /**
     * <B>PSDEWIZARDSTEPID</B>&nbsp;向导步骤
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEWizardStep} 
     */
    public final static String FIELD_PSDEWIZARDSTEPID = "psdewizardstepid";

    /**
     * 设置 向导步骤
     * 
     * @param pSDEWizardStepId
     * 
     */
    @JsonProperty(FIELD_PSDEWIZARDSTEPID)
    public void setPSDEWizardStepId(String pSDEWizardStepId){
        this.set(FIELD_PSDEWIZARDSTEPID, pSDEWizardStepId);
    }
    
    /**
     * 获取 向导步骤  
     * @return
     */
    @JsonIgnore
    public String getPSDEWizardStepId(){
        Object objValue = this.get(FIELD_PSDEWIZARDSTEPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 向导步骤 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEWizardStepIdDirty(){
        if(this.contains(FIELD_PSDEWIZARDSTEPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 向导步骤
     */
    @JsonIgnore
    public void resetPSDEWizardStepId(){
        this.reset(FIELD_PSDEWIZARDSTEPID);
    }

    /**
     * 设置 向导步骤
     * <P>
     * 等同 {@link #setPSDEWizardStepId}
     * @param pSDEWizardStepId
     */
    @JsonIgnore
    public PSDEWizardLogic psdewizardstepid(String pSDEWizardStepId){
        this.setPSDEWizardStepId(pSDEWizardStepId);
        return this;
    }

    /**
     * 设置 向导步骤，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEWizardStepId}
     * @param pSDEWizardStep 引用对象
     */
    @JsonIgnore
    public PSDEWizardLogic psdewizardstepid(PSDEWizardStep pSDEWizardStep){
        if(pSDEWizardStep == null){
            this.setPSDEWizardStepId(null);
            this.setPSDEWizardStepName(null);
        }
        else{
            this.setPSDEWizardStepId(pSDEWizardStep.getPSDEWizardStepId());
            this.setPSDEWizardStepName(pSDEWizardStep.getPSDEWizardStepName());
        }
        return this;
    }

    /**
     * <B>PSDEWIZARDSTEPNAME</B>&nbsp;向导步骤
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEWIZARDSTEPID}
     */
    public final static String FIELD_PSDEWIZARDSTEPNAME = "psdewizardstepname";

    /**
     * 设置 向导步骤
     * 
     * @param pSDEWizardStepName
     * 
     */
    @JsonProperty(FIELD_PSDEWIZARDSTEPNAME)
    public void setPSDEWizardStepName(String pSDEWizardStepName){
        this.set(FIELD_PSDEWIZARDSTEPNAME, pSDEWizardStepName);
    }
    
    /**
     * 获取 向导步骤  
     * @return
     */
    @JsonIgnore
    public String getPSDEWizardStepName(){
        Object objValue = this.get(FIELD_PSDEWIZARDSTEPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 向导步骤 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEWizardStepNameDirty(){
        if(this.contains(FIELD_PSDEWIZARDSTEPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 向导步骤
     */
    @JsonIgnore
    public void resetPSDEWizardStepName(){
        this.reset(FIELD_PSDEWIZARDSTEPNAME);
    }

    /**
     * 设置 向导步骤
     * <P>
     * 等同 {@link #setPSDEWizardStepName}
     * @param pSDEWizardStepName
     */
    @JsonIgnore
    public PSDEWizardLogic psdewizardstepname(String pSDEWizardStepName){
        this.setPSDEWizardStepName(pSDEWizardStepName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端扩展插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysPFPlugin} 
     */
    public final static String FIELD_PSSYSPFPLUGINID = "pssyspfpluginid";

    /**
     * 设置 前端扩展插件
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
     * 设置 前端扩展插件
     * <P>
     * 等同 {@link #setPSSysPFPluginId}
     * @param pSSysPFPluginId
     */
    @JsonIgnore
    public PSDEWizardLogic pssyspfpluginid(String pSSysPFPluginId){
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
    public PSDEWizardLogic pssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
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
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端扩展插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSPFPLUGINID}
     */
    public final static String FIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";

    /**
     * 设置 前端扩展插件
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
     * 设置 前端扩展插件
     * <P>
     * 等同 {@link #setPSSysPFPluginName}
     * @param pSSysPFPluginName
     */
    @JsonIgnore
    public PSDEWizardLogic pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    /**
     * <B>PSSYSVIEWLOGICID</B>&nbsp;系统界面逻辑
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysViewLogic} 
     */
    public final static String FIELD_PSSYSVIEWLOGICID = "pssysviewlogicid";

    /**
     * 设置 系统界面逻辑
     * 
     * @param pSSysViewLogicId
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWLOGICID)
    public void setPSSysViewLogicId(String pSSysViewLogicId){
        this.set(FIELD_PSSYSVIEWLOGICID, pSSysViewLogicId);
    }
    
    /**
     * 获取 系统界面逻辑  
     * @return
     */
    @JsonIgnore
    public String getPSSysViewLogicId(){
        Object objValue = this.get(FIELD_PSSYSVIEWLOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统界面逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysViewLogicIdDirty(){
        if(this.contains(FIELD_PSSYSVIEWLOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统界面逻辑
     */
    @JsonIgnore
    public void resetPSSysViewLogicId(){
        this.reset(FIELD_PSSYSVIEWLOGICID);
    }

    /**
     * 设置 系统界面逻辑
     * <P>
     * 等同 {@link #setPSSysViewLogicId}
     * @param pSSysViewLogicId
     */
    @JsonIgnore
    public PSDEWizardLogic pssysviewlogicid(String pSSysViewLogicId){
        this.setPSSysViewLogicId(pSSysViewLogicId);
        return this;
    }

    /**
     * 设置 系统界面逻辑，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysViewLogicId}
     * @param pSSysViewLogic 引用对象
     */
    @JsonIgnore
    public PSDEWizardLogic pssysviewlogicid(PSSysViewLogic pSSysViewLogic){
        if(pSSysViewLogic == null){
            this.setPSSysViewLogicId(null);
            this.setPSSysViewLogicName(null);
        }
        else{
            this.setPSSysViewLogicId(pSSysViewLogic.getPSSysViewLogicId());
            this.setPSSysViewLogicName(pSSysViewLogic.getPSSysViewLogicName());
        }
        return this;
    }

    /**
     * <B>PSSYSVIEWLOGICNAME</B>&nbsp;系统界面逻辑
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSVIEWLOGICID}
     */
    public final static String FIELD_PSSYSVIEWLOGICNAME = "pssysviewlogicname";

    /**
     * 设置 系统界面逻辑
     * 
     * @param pSSysViewLogicName
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWLOGICNAME)
    public void setPSSysViewLogicName(String pSSysViewLogicName){
        this.set(FIELD_PSSYSVIEWLOGICNAME, pSSysViewLogicName);
    }
    
    /**
     * 获取 系统界面逻辑  
     * @return
     */
    @JsonIgnore
    public String getPSSysViewLogicName(){
        Object objValue = this.get(FIELD_PSSYSVIEWLOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统界面逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysViewLogicNameDirty(){
        if(this.contains(FIELD_PSSYSVIEWLOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统界面逻辑
     */
    @JsonIgnore
    public void resetPSSysViewLogicName(){
        this.reset(FIELD_PSSYSVIEWLOGICNAME);
    }

    /**
     * 设置 系统界面逻辑
     * <P>
     * 等同 {@link #setPSSysViewLogicName}
     * @param pSSysViewLogicName
     */
    @JsonIgnore
    public PSDEWizardLogic pssysviewlogicname(String pSSysViewLogicName){
        this.setPSSysViewLogicName(pSSysViewLogicName);
        return this;
    }

    /**
     * <B>TIMER</B>&nbsp;计时器间隔
     */
    public final static String FIELD_TIMER = "timer";

    /**
     * 设置 计时器间隔
     * 
     * @param timer
     * 
     */
    @JsonProperty(FIELD_TIMER)
    public void setTimer(Integer timer){
        this.set(FIELD_TIMER, timer);
    }
    
    /**
     * 获取 计时器间隔  
     * @return
     */
    @JsonIgnore
    public Integer getTimer(){
        Object objValue = this.get(FIELD_TIMER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 计时器间隔 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTimerDirty(){
        if(this.contains(FIELD_TIMER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 计时器间隔
     */
    @JsonIgnore
    public void resetTimer(){
        this.reset(FIELD_TIMER);
    }

    /**
     * 设置 计时器间隔
     * <P>
     * 等同 {@link #setTimer}
     * @param timer
     */
    @JsonIgnore
    public PSDEWizardLogic timer(Integer timer){
        this.setTimer(timer);
        return this;
    }

    /**
     * <B>TRIGGERTYPE</B>&nbsp;逻辑触发类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ViewLogicTrigger} 
     */
    public final static String FIELD_TRIGGERTYPE = "triggertype";

    /**
     * 设置 逻辑触发类型
     * 
     * @param triggerType
     * 
     */
    @JsonProperty(FIELD_TRIGGERTYPE)
    public void setTriggerType(String triggerType){
        this.set(FIELD_TRIGGERTYPE, triggerType);
    }
    
    /**
     * 获取 逻辑触发类型  
     * @return
     */
    @JsonIgnore
    public String getTriggerType(){
        Object objValue = this.get(FIELD_TRIGGERTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 逻辑触发类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTriggerTypeDirty(){
        if(this.contains(FIELD_TRIGGERTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 逻辑触发类型
     */
    @JsonIgnore
    public void resetTriggerType(){
        this.reset(FIELD_TRIGGERTYPE);
    }

    /**
     * 设置 逻辑触发类型
     * <P>
     * 等同 {@link #setTriggerType}
     * @param triggerType
     */
    @JsonIgnore
    public PSDEWizardLogic triggertype(String triggerType){
        this.setTriggerType(triggerType);
        return this;
    }

     /**
     * 设置 逻辑触发类型
     * <P>
     * 等同 {@link #setTriggerType}
     * @param triggerType
     */
    @JsonIgnore
    public PSDEWizardLogic triggertype(net.ibizsys.psmodel.core.util.PSModelEnums.ViewLogicTrigger triggerType){
        if(triggerType == null){
            this.setTriggerType(null);
        }
        else{
            this.setTriggerType(triggerType.value);
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
    public PSDEWizardLogic updatedate(String updateDate){
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
    public PSDEWizardLogic updateman(String updateMan){
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
    public PSDEWizardLogic usercat(String userCat){
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
    public PSDEWizardLogic usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDEWizardLogic usertag(String userTag){
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
    public PSDEWizardLogic usertag2(String userTag2){
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
    public PSDEWizardLogic usertag3(String userTag3){
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
    public PSDEWizardLogic usertag4(String userTag4){
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
    public PSDEWizardLogic validflag(Integer validFlag){
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
    public PSDEWizardLogic validflag(Boolean validFlag){
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
        return this.getPSDEWizardLogicId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEWizardLogicId(strValue);
    }

    @JsonIgnore
    public PSDEWizardLogic id(String strValue){
        this.setPSDEWizardLogicId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEWizardLogic){
            PSDEWizardLogic model = (PSDEWizardLogic)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
