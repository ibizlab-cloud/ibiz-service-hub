package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSCTRLLOGICGRPDETAIL</B>部件逻辑组成员 模型传输对象
 * <P>
 * 部件逻辑组成员模型，定义具体的逻辑配置，包括了触发类型，触发逻辑等
 */
public class PSCtrlLogicGrpDetailDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSCtrlLogicGrpDetailDTO(){
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
    public PSCtrlLogicGrpDetailDTO attrname(String attrName){
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
    public PSCtrlLogicGrpDetailDTO createdate(Timestamp createDate){
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
    public PSCtrlLogicGrpDetailDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CTRLNAME</B>&nbsp;部件名称，指定挂接事件的部件名称，未定义时使用当前部件
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_CTRLNAME = "ctrlname";

    /**
     * 设置 部件名称，详细说明：{@link #FIELD_CTRLNAME}
     * 
     * @param ctrlName
     * 
     */
    @JsonProperty(FIELD_CTRLNAME)
    public void setCtrlName(String ctrlName){
        this.set(FIELD_CTRLNAME, ctrlName);
    }
    
    /**
     * 获取 部件名称  
     * @return
     */
    @JsonIgnore
    public String getCtrlName(){
        Object objValue = this.get(FIELD_CTRLNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlNameDirty(){
        if(this.contains(FIELD_CTRLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件名称
     */
    @JsonIgnore
    public void resetCtrlName(){
        this.reset(FIELD_CTRLNAME);
    }

    /**
     * 设置 部件名称，详细说明：{@link #FIELD_CTRLNAME}
     * <P>
     * 等同 {@link #setCtrlName}
     * @param ctrlName
     */
    @JsonIgnore
    public PSCtrlLogicGrpDetailDTO ctrlname(String ctrlName){
        this.setCtrlName(ctrlName);
        return this;
    }

    /**
     * <B>CUSTOMCODE</B>&nbsp;脚本代码
     */
    public final static String FIELD_CUSTOMCODE = "customcode";

    /**
     * 设置 脚本代码
     * 
     * @param customCode
     * 
     */
    @JsonProperty(FIELD_CUSTOMCODE)
    public void setCustomCode(String customCode){
        this.set(FIELD_CUSTOMCODE, customCode);
    }
    
    /**
     * 获取 脚本代码  
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
     * 判断 脚本代码 是否指定值，包括空值
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
     * 重置 脚本代码
     */
    @JsonIgnore
    public void resetCustomCode(){
        this.reset(FIELD_CUSTOMCODE);
    }

    /**
     * 设置 脚本代码
     * <P>
     * 等同 {@link #setCustomCode}
     * @param customCode
     */
    @JsonIgnore
    public PSCtrlLogicGrpDetailDTO customcode(String customCode){
        this.setCustomCode(customCode);
        return this;
    }

    /**
     * <B>DSTLOGICTYPE</B>&nbsp;目标逻辑类型，指定触发的目标逻辑类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.TargetUILogic} 
     */
    public final static String FIELD_DSTLOGICTYPE = "dstlogictype";

    /**
     * 设置 目标逻辑类型，详细说明：{@link #FIELD_DSTLOGICTYPE}
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
     * 设置 目标逻辑类型，详细说明：{@link #FIELD_DSTLOGICTYPE}
     * <P>
     * 等同 {@link #setDstLogicType}
     * @param dstLogicType
     */
    @JsonIgnore
    public PSCtrlLogicGrpDetailDTO dstlogictype(String dstLogicType){
        this.setDstLogicType(dstLogicType);
        return this;
    }

     /**
     * 设置 目标逻辑类型，详细说明：{@link #FIELD_DSTLOGICTYPE}
     * <P>
     * 等同 {@link #setDstLogicType}
     * @param dstLogicType
     */
    @JsonIgnore
    public PSCtrlLogicGrpDetailDTO dstlogictype(net.ibizsys.model.PSModelEnums.TargetUILogic dstLogicType){
        if(dstLogicType == null){
            this.setDstLogicType(null);
        }
        else{
            this.setDstLogicType(dstLogicType.value);
        }
        return this;
    }

    /**
     * <B>EVENTARG</B>&nbsp;事件参数，指定事件的参数
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_EVENTARG = "eventarg";

    /**
     * 设置 事件参数，详细说明：{@link #FIELD_EVENTARG}
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
     * 设置 事件参数，详细说明：{@link #FIELD_EVENTARG}
     * <P>
     * 等同 {@link #setEventArg}
     * @param eventArg
     */
    @JsonIgnore
    public PSCtrlLogicGrpDetailDTO eventarg(String eventArg){
        this.setEventArg(eventArg);
        return this;
    }

    /**
     * <B>EVENTARG2</B>&nbsp;事件参数2，指定事件的参数2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_EVENTARG2 = "eventarg2";

    /**
     * 设置 事件参数2，详细说明：{@link #FIELD_EVENTARG2}
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
     * 设置 事件参数2，详细说明：{@link #FIELD_EVENTARG2}
     * <P>
     * 等同 {@link #setEventArg2}
     * @param eventArg2
     */
    @JsonIgnore
    public PSCtrlLogicGrpDetailDTO eventarg2(String eventArg2){
        this.setEventArg2(eventArg2);
        return this;
    }

    /**
     * <B>EVENTNAMES</B>&nbsp;事件名称，指定挂接的事件名称清单，多值使用【;】分隔，可进一步在事件参数中指定额外参数
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_EVENTNAMES = "eventnames";

    /**
     * 设置 事件名称，详细说明：{@link #FIELD_EVENTNAMES}
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
     * 设置 事件名称，详细说明：{@link #FIELD_EVENTNAMES}
     * <P>
     * 等同 {@link #setEventNames}
     * @param eventNames
     */
    @JsonIgnore
    public PSCtrlLogicGrpDetailDTO eventnames(String eventNames){
        this.setEventNames(eventNames);
        return this;
    }

    /**
     * <B>ITEMNAME</B>&nbsp;项名称
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ITEMNAME = "itemname";

    /**
     * 设置 项名称
     * 
     * @param itemName
     * 
     */
    @JsonProperty(FIELD_ITEMNAME)
    public void setItemName(String itemName){
        this.set(FIELD_ITEMNAME, itemName);
    }
    
    /**
     * 获取 项名称  
     * @return
     */
    @JsonIgnore
    public String getItemName(){
        Object objValue = this.get(FIELD_ITEMNAME);
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
    public boolean isItemNameDirty(){
        if(this.contains(FIELD_ITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项名称
     */
    @JsonIgnore
    public void resetItemName(){
        this.reset(FIELD_ITEMNAME);
    }

    /**
     * 设置 项名称
     * <P>
     * 等同 {@link #setItemName}
     * @param itemName
     */
    @JsonIgnore
    public PSCtrlLogicGrpDetailDTO itemname(String itemName){
        this.setItemName(itemName);
        return this;
    }

    /**
     * <B>LOGICPARAM</B>&nbsp;逻辑标记，指定逻辑的标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_LOGICPARAM = "logicparam";

    /**
     * 设置 逻辑标记，详细说明：{@link #FIELD_LOGICPARAM}
     * 
     * @param logicParam
     * 
     */
    @JsonProperty(FIELD_LOGICPARAM)
    public void setLogicParam(String logicParam){
        this.set(FIELD_LOGICPARAM, logicParam);
    }
    
    /**
     * 获取 逻辑标记  
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
     * 判断 逻辑标记 是否指定值，包括空值
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
     * 重置 逻辑标记
     */
    @JsonIgnore
    public void resetLogicParam(){
        this.reset(FIELD_LOGICPARAM);
    }

    /**
     * 设置 逻辑标记，详细说明：{@link #FIELD_LOGICPARAM}
     * <P>
     * 等同 {@link #setLogicParam}
     * @param logicParam
     */
    @JsonIgnore
    public PSCtrlLogicGrpDetailDTO logicparam(String logicParam){
        this.setLogicParam(logicParam);
        return this;
    }

    /**
     * <B>LOGICPARAM2</B>&nbsp;逻辑标记2，指定逻辑的标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_LOGICPARAM2 = "logicparam2";

    /**
     * 设置 逻辑标记2，详细说明：{@link #FIELD_LOGICPARAM2}
     * 
     * @param logicParam2
     * 
     */
    @JsonProperty(FIELD_LOGICPARAM2)
    public void setLogicParam2(String logicParam2){
        this.set(FIELD_LOGICPARAM2, logicParam2);
    }
    
    /**
     * 获取 逻辑标记2  
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
     * 判断 逻辑标记2 是否指定值，包括空值
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
     * 重置 逻辑标记2
     */
    @JsonIgnore
    public void resetLogicParam2(){
        this.reset(FIELD_LOGICPARAM2);
    }

    /**
     * 设置 逻辑标记2，详细说明：{@link #FIELD_LOGICPARAM2}
     * <P>
     * 等同 {@link #setLogicParam2}
     * @param logicParam2
     */
    @JsonIgnore
    public PSCtrlLogicGrpDetailDTO logicparam2(String logicParam2){
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
    public PSCtrlLogicGrpDetailDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;排序值，指定部件逻辑的加载次序，按升序处理
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 排序值，详细说明：{@link #FIELD_ORDERVALUE}
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
     * 设置 排序值，详细说明：{@link #FIELD_ORDERVALUE}
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSCtrlLogicGrpDetailDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSCTRLLOGICGROUPID</B>&nbsp;部件逻辑组，指定部件逻辑所在的逻辑组对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSCtrlLogicGroupDTO} 
     */
    public final static String FIELD_PSCTRLLOGICGROUPID = "psctrllogicgroupid";

    /**
     * 设置 部件逻辑组，详细说明：{@link #FIELD_PSCTRLLOGICGROUPID}
     * 
     * @param pSCtrlLogicGroupId
     * 
     */
    @JsonProperty(FIELD_PSCTRLLOGICGROUPID)
    public void setPSCtrlLogicGroupId(String pSCtrlLogicGroupId){
        this.set(FIELD_PSCTRLLOGICGROUPID, pSCtrlLogicGroupId);
    }
    
    /**
     * 获取 部件逻辑组  
     * @return
     */
    @JsonIgnore
    public String getPSCtrlLogicGroupId(){
        Object objValue = this.get(FIELD_PSCTRLLOGICGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件逻辑组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCtrlLogicGroupIdDirty(){
        if(this.contains(FIELD_PSCTRLLOGICGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件逻辑组
     */
    @JsonIgnore
    public void resetPSCtrlLogicGroupId(){
        this.reset(FIELD_PSCTRLLOGICGROUPID);
    }

    /**
     * 设置 部件逻辑组，详细说明：{@link #FIELD_PSCTRLLOGICGROUPID}
     * <P>
     * 等同 {@link #setPSCtrlLogicGroupId}
     * @param pSCtrlLogicGroupId
     */
    @JsonIgnore
    public PSCtrlLogicGrpDetailDTO psctrllogicgroupid(String pSCtrlLogicGroupId){
        this.setPSCtrlLogicGroupId(pSCtrlLogicGroupId);
        return this;
    }

    /**
     * 设置 部件逻辑组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSCtrlLogicGroupId}
     * @param pSCtrlLogicGroup 引用对象
     */
    @JsonIgnore
    public PSCtrlLogicGrpDetailDTO psctrllogicgroupid(PSCtrlLogicGroupDTO pSCtrlLogicGroup){
        if(pSCtrlLogicGroup == null){
            this.setPSCtrlLogicGroupId(null);
            this.setPSCtrlLogicGroupName(null);
        }
        else{
            this.setPSCtrlLogicGroupId(pSCtrlLogicGroup.getPSCtrlLogicGroupId());
            this.setPSCtrlLogicGroupName(pSCtrlLogicGroup.getPSCtrlLogicGroupName());
        }
        return this;
    }

    /**
     * <B>PSCTRLLOGICGROUPNAME</B>&nbsp;部件逻辑组，指定部件逻辑所在的逻辑组对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCTRLLOGICGROUPID}
     */
    public final static String FIELD_PSCTRLLOGICGROUPNAME = "psctrllogicgroupname";

    /**
     * 设置 部件逻辑组，详细说明：{@link #FIELD_PSCTRLLOGICGROUPNAME}
     * 
     * @param pSCtrlLogicGroupName
     * 
     */
    @JsonProperty(FIELD_PSCTRLLOGICGROUPNAME)
    public void setPSCtrlLogicGroupName(String pSCtrlLogicGroupName){
        this.set(FIELD_PSCTRLLOGICGROUPNAME, pSCtrlLogicGroupName);
    }
    
    /**
     * 获取 部件逻辑组  
     * @return
     */
    @JsonIgnore
    public String getPSCtrlLogicGroupName(){
        Object objValue = this.get(FIELD_PSCTRLLOGICGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件逻辑组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCtrlLogicGroupNameDirty(){
        if(this.contains(FIELD_PSCTRLLOGICGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件逻辑组
     */
    @JsonIgnore
    public void resetPSCtrlLogicGroupName(){
        this.reset(FIELD_PSCTRLLOGICGROUPNAME);
    }

    /**
     * 设置 部件逻辑组，详细说明：{@link #FIELD_PSCTRLLOGICGROUPNAME}
     * <P>
     * 等同 {@link #setPSCtrlLogicGroupName}
     * @param pSCtrlLogicGroupName
     */
    @JsonIgnore
    public PSCtrlLogicGrpDetailDTO psctrllogicgroupname(String pSCtrlLogicGroupName){
        this.setPSCtrlLogicGroupName(pSCtrlLogicGroupName);
        return this;
    }

    /**
     * <B>PSCTRLLOGICGRPDETAILID</B>&nbsp;部件逻辑组成员标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSCTRLLOGICGRPDETAILID = "psctrllogicgrpdetailid";

    /**
     * 设置 部件逻辑组成员标识
     * 
     * @param pSCtrlLogicGrpDetailId
     * 
     */
    @JsonProperty(FIELD_PSCTRLLOGICGRPDETAILID)
    public void setPSCtrlLogicGrpDetailId(String pSCtrlLogicGrpDetailId){
        this.set(FIELD_PSCTRLLOGICGRPDETAILID, pSCtrlLogicGrpDetailId);
    }
    
    /**
     * 获取 部件逻辑组成员标识  
     * @return
     */
    @JsonIgnore
    public String getPSCtrlLogicGrpDetailId(){
        Object objValue = this.get(FIELD_PSCTRLLOGICGRPDETAILID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件逻辑组成员标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCtrlLogicGrpDetailIdDirty(){
        if(this.contains(FIELD_PSCTRLLOGICGRPDETAILID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件逻辑组成员标识
     */
    @JsonIgnore
    public void resetPSCtrlLogicGrpDetailId(){
        this.reset(FIELD_PSCTRLLOGICGRPDETAILID);
    }

    /**
     * 设置 部件逻辑组成员标识
     * <P>
     * 等同 {@link #setPSCtrlLogicGrpDetailId}
     * @param pSCtrlLogicGrpDetailId
     */
    @JsonIgnore
    public PSCtrlLogicGrpDetailDTO psctrllogicgrpdetailid(String pSCtrlLogicGrpDetailId){
        this.setPSCtrlLogicGrpDetailId(pSCtrlLogicGrpDetailId);
        return this;
    }

    /**
     * <B>PSCTRLLOGICGRPDETAILNAME</B>&nbsp;成员标识，指定部件逻辑的标识，需在所在的部件逻辑组具备唯一性
     * <P>
     * 字符串：最大长度 50，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSCTRLLOGICGRPDETAILNAME = "psctrllogicgrpdetailname";

    /**
     * 设置 成员标识，详细说明：{@link #FIELD_PSCTRLLOGICGRPDETAILNAME}
     * 
     * @param pSCtrlLogicGrpDetailName
     * 
     */
    @JsonProperty(FIELD_PSCTRLLOGICGRPDETAILNAME)
    public void setPSCtrlLogicGrpDetailName(String pSCtrlLogicGrpDetailName){
        this.set(FIELD_PSCTRLLOGICGRPDETAILNAME, pSCtrlLogicGrpDetailName);
    }
    
    /**
     * 获取 成员标识  
     * @return
     */
    @JsonIgnore
    public String getPSCtrlLogicGrpDetailName(){
        Object objValue = this.get(FIELD_PSCTRLLOGICGRPDETAILNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 成员标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCtrlLogicGrpDetailNameDirty(){
        if(this.contains(FIELD_PSCTRLLOGICGRPDETAILNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 成员标识
     */
    @JsonIgnore
    public void resetPSCtrlLogicGrpDetailName(){
        this.reset(FIELD_PSCTRLLOGICGRPDETAILNAME);
    }

    /**
     * 设置 成员标识，详细说明：{@link #FIELD_PSCTRLLOGICGRPDETAILNAME}
     * <P>
     * 等同 {@link #setPSCtrlLogicGrpDetailName}
     * @param pSCtrlLogicGrpDetailName
     */
    @JsonIgnore
    public PSCtrlLogicGrpDetailDTO psctrllogicgrpdetailname(String pSCtrlLogicGrpDetailName){
        this.setPSCtrlLogicGrpDetailName(pSCtrlLogicGrpDetailName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSCtrlLogicGrpDetailName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSCtrlLogicGrpDetailName(strName);
    }

    @JsonIgnore
    public PSCtrlLogicGrpDetailDTO name(String strName){
        this.setPSCtrlLogicGrpDetailName(strName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，目标逻辑类型为【实体界面逻辑】时指定实体界面逻辑所在实体对象
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
    public PSCtrlLogicGrpDetailDTO psdeid(String pSDEId){
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
    public PSCtrlLogicGrpDetailDTO psdeid(PSDataEntityDTO pSDataEntity){
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
     * <B>PSDELOGICID</B>&nbsp;实体界面逻辑，目标逻辑类型为【实体界面逻辑】时指定实体界面逻辑对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDELogicDTO} 
     */
    public final static String FIELD_PSDELOGICID = "psdelogicid";

    /**
     * 设置 实体界面逻辑，详细说明：{@link #FIELD_PSDELOGICID}
     * 
     * @param pSDELogicId
     * 
     */
    @JsonProperty(FIELD_PSDELOGICID)
    public void setPSDELogicId(String pSDELogicId){
        this.set(FIELD_PSDELOGICID, pSDELogicId);
    }
    
    /**
     * 获取 实体界面逻辑  
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
     * 判断 实体界面逻辑 是否指定值，包括空值
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
     * 重置 实体界面逻辑
     */
    @JsonIgnore
    public void resetPSDELogicId(){
        this.reset(FIELD_PSDELOGICID);
    }

    /**
     * 设置 实体界面逻辑，详细说明：{@link #FIELD_PSDELOGICID}
     * <P>
     * 等同 {@link #setPSDELogicId}
     * @param pSDELogicId
     */
    @JsonIgnore
    public PSCtrlLogicGrpDetailDTO psdelogicid(String pSDELogicId){
        this.setPSDELogicId(pSDELogicId);
        return this;
    }

    /**
     * 设置 实体界面逻辑，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDELogicId}
     * @param pSDELogic 引用对象
     */
    @JsonIgnore
    public PSCtrlLogicGrpDetailDTO psdelogicid(PSDELogicDTO pSDELogic){
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
     * <B>PSDELOGICNAME</B>&nbsp;实体界面逻辑，目标逻辑类型为【实体界面逻辑】时指定实体界面逻辑对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDELOGICID}
     */
    public final static String FIELD_PSDELOGICNAME = "psdelogicname";

    /**
     * 设置 实体界面逻辑，详细说明：{@link #FIELD_PSDELOGICNAME}
     * 
     * @param pSDELogicName
     * 
     */
    @JsonProperty(FIELD_PSDELOGICNAME)
    public void setPSDELogicName(String pSDELogicName){
        this.set(FIELD_PSDELOGICNAME, pSDELogicName);
    }
    
    /**
     * 获取 实体界面逻辑  
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
     * 判断 实体界面逻辑 是否指定值，包括空值
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
     * 重置 实体界面逻辑
     */
    @JsonIgnore
    public void resetPSDELogicName(){
        this.reset(FIELD_PSDELOGICNAME);
    }

    /**
     * 设置 实体界面逻辑，详细说明：{@link #FIELD_PSDELOGICNAME}
     * <P>
     * 等同 {@link #setPSDELogicName}
     * @param pSDELogicName
     */
    @JsonIgnore
    public PSCtrlLogicGrpDetailDTO psdelogicname(String pSDELogicName){
        this.setPSDELogicName(pSDELogicName);
        return this;
    }

    /**
     * <B>PSDENAME</B>&nbsp;实体，目标逻辑类型为【实体界面逻辑】时指定实体界面逻辑所在实体对象
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
    public PSCtrlLogicGrpDetailDTO psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSDEUIACTIONID</B>&nbsp;界面行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEUIActionDTO} 
     */
    public final static String FIELD_PSDEUIACTIONID = "psdeuiactionid";

    /**
     * 设置 界面行为
     * 
     * @param pSDEUIActionId
     * 
     */
    @JsonProperty(FIELD_PSDEUIACTIONID)
    public void setPSDEUIActionId(String pSDEUIActionId){
        this.set(FIELD_PSDEUIACTIONID, pSDEUIActionId);
    }
    
    /**
     * 获取 界面行为  
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
     * 判断 界面行为 是否指定值，包括空值
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
     * 重置 界面行为
     */
    @JsonIgnore
    public void resetPSDEUIActionId(){
        this.reset(FIELD_PSDEUIACTIONID);
    }

    /**
     * 设置 界面行为
     * <P>
     * 等同 {@link #setPSDEUIActionId}
     * @param pSDEUIActionId
     */
    @JsonIgnore
    public PSCtrlLogicGrpDetailDTO psdeuiactionid(String pSDEUIActionId){
        this.setPSDEUIActionId(pSDEUIActionId);
        return this;
    }

    /**
     * 设置 界面行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEUIActionId}
     * @param pSDEUIAction 引用对象
     */
    @JsonIgnore
    public PSCtrlLogicGrpDetailDTO psdeuiactionid(PSDEUIActionDTO pSDEUIAction){
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
     * <B>PSDEUIACTIONNAME</B>&nbsp;界面行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEUIACTIONID}
     */
    public final static String FIELD_PSDEUIACTIONNAME = "psdeuiactionname";

    /**
     * 设置 界面行为
     * 
     * @param pSDEUIActionName
     * 
     */
    @JsonProperty(FIELD_PSDEUIACTIONNAME)
    public void setPSDEUIActionName(String pSDEUIActionName){
        this.set(FIELD_PSDEUIACTIONNAME, pSDEUIActionName);
    }
    
    /**
     * 获取 界面行为  
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
     * 判断 界面行为 是否指定值，包括空值
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
     * 重置 界面行为
     */
    @JsonIgnore
    public void resetPSDEUIActionName(){
        this.reset(FIELD_PSDEUIACTIONNAME);
    }

    /**
     * 设置 界面行为
     * <P>
     * 等同 {@link #setPSDEUIActionName}
     * @param pSDEUIActionName
     */
    @JsonIgnore
    public PSCtrlLogicGrpDetailDTO psdeuiactionname(String pSDEUIActionName){
        this.setPSDEUIActionName(pSDEUIActionName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端扩展插件，目标逻辑类型为【前端模板插件】时指定插件对象
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
    public PSCtrlLogicGrpDetailDTO pssyspfpluginid(String pSSysPFPluginId){
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
    public PSCtrlLogicGrpDetailDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin){
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
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端扩展插件，目标逻辑类型为【前端模板插件】时指定插件对象
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
    public PSCtrlLogicGrpDetailDTO pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    /**
     * <B>PSSYSVIEWLOGICID</B>&nbsp;系统预置界面逻辑，目标逻辑类型为【系统界面逻辑】时指定系统定义的界面逻辑对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysViewLogicDTO} 
     */
    public final static String FIELD_PSSYSVIEWLOGICID = "pssysviewlogicid";

    /**
     * 设置 系统预置界面逻辑，详细说明：{@link #FIELD_PSSYSVIEWLOGICID}
     * 
     * @param pSSysViewLogicId
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWLOGICID)
    public void setPSSysViewLogicId(String pSSysViewLogicId){
        this.set(FIELD_PSSYSVIEWLOGICID, pSSysViewLogicId);
    }
    
    /**
     * 获取 系统预置界面逻辑  
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
     * 判断 系统预置界面逻辑 是否指定值，包括空值
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
     * 重置 系统预置界面逻辑
     */
    @JsonIgnore
    public void resetPSSysViewLogicId(){
        this.reset(FIELD_PSSYSVIEWLOGICID);
    }

    /**
     * 设置 系统预置界面逻辑，详细说明：{@link #FIELD_PSSYSVIEWLOGICID}
     * <P>
     * 等同 {@link #setPSSysViewLogicId}
     * @param pSSysViewLogicId
     */
    @JsonIgnore
    public PSCtrlLogicGrpDetailDTO pssysviewlogicid(String pSSysViewLogicId){
        this.setPSSysViewLogicId(pSSysViewLogicId);
        return this;
    }

    /**
     * 设置 系统预置界面逻辑，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysViewLogicId}
     * @param pSSysViewLogic 引用对象
     */
    @JsonIgnore
    public PSCtrlLogicGrpDetailDTO pssysviewlogicid(PSSysViewLogicDTO pSSysViewLogic){
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
     * <B>PSSYSVIEWLOGICNAME</B>&nbsp;系统界面逻辑，目标逻辑类型为【系统界面逻辑】时指定系统定义的界面逻辑对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSVIEWLOGICID}
     */
    public final static String FIELD_PSSYSVIEWLOGICNAME = "pssysviewlogicname";

    /**
     * 设置 系统界面逻辑，详细说明：{@link #FIELD_PSSYSVIEWLOGICNAME}
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
     * 设置 系统界面逻辑，详细说明：{@link #FIELD_PSSYSVIEWLOGICNAME}
     * <P>
     * 等同 {@link #setPSSysViewLogicName}
     * @param pSSysViewLogicName
     */
    @JsonIgnore
    public PSCtrlLogicGrpDetailDTO pssysviewlogicname(String pSSysViewLogicName){
        this.setPSSysViewLogicName(pSSysViewLogicName);
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELID</B>&nbsp;布局面板
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysViewPanelDTO} 
     */
    public final static String FIELD_PSSYSVIEWPANELID = "pssysviewpanelid";

    /**
     * 设置 布局面板
     * 
     * @param pSSysViewPanelId
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELID)
    public void setPSSysViewPanelId(String pSSysViewPanelId){
        this.set(FIELD_PSSYSVIEWPANELID, pSSysViewPanelId);
    }
    
    /**
     * 获取 布局面板  
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
     * 判断 布局面板 是否指定值，包括空值
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
     * 重置 布局面板
     */
    @JsonIgnore
    public void resetPSSysViewPanelId(){
        this.reset(FIELD_PSSYSVIEWPANELID);
    }

    /**
     * 设置 布局面板
     * <P>
     * 等同 {@link #setPSSysViewPanelId}
     * @param pSSysViewPanelId
     */
    @JsonIgnore
    public PSCtrlLogicGrpDetailDTO pssysviewpanelid(String pSSysViewPanelId){
        this.setPSSysViewPanelId(pSSysViewPanelId);
        return this;
    }

    /**
     * 设置 布局面板，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysViewPanelId}
     * @param pSSysViewPanel 引用对象
     */
    @JsonIgnore
    public PSCtrlLogicGrpDetailDTO pssysviewpanelid(PSSysViewPanelDTO pSSysViewPanel){
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
     * <B>PSSYSVIEWPANELNAME</B>&nbsp;布局面板
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSVIEWPANELID}
     */
    public final static String FIELD_PSSYSVIEWPANELNAME = "pssysviewpanelname";

    /**
     * 设置 布局面板
     * 
     * @param pSSysViewPanelName
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELNAME)
    public void setPSSysViewPanelName(String pSSysViewPanelName){
        this.set(FIELD_PSSYSVIEWPANELNAME, pSSysViewPanelName);
    }
    
    /**
     * 获取 布局面板  
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
     * 判断 布局面板 是否指定值，包括空值
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
     * 重置 布局面板
     */
    @JsonIgnore
    public void resetPSSysViewPanelName(){
        this.reset(FIELD_PSSYSVIEWPANELNAME);
    }

    /**
     * 设置 布局面板
     * <P>
     * 等同 {@link #setPSSysViewPanelName}
     * @param pSSysViewPanelName
     */
    @JsonIgnore
    public PSCtrlLogicGrpDetailDTO pssysviewpanelname(String pSSysViewPanelName){
        this.setPSSysViewPanelName(pSSysViewPanelName);
        return this;
    }

    /**
     * <B>TIMER</B>&nbsp;计时器间隔（ms），逻辑触发类型为【定时器】时指定定时触发间隔，单位为【毫秒】
     */
    public final static String FIELD_TIMER = "timer";

    /**
     * 设置 计时器间隔（ms），详细说明：{@link #FIELD_TIMER}
     * 
     * @param timer
     * 
     */
    @JsonProperty(FIELD_TIMER)
    public void setTimer(Integer timer){
        this.set(FIELD_TIMER, timer);
    }
    
    /**
     * 获取 计时器间隔（ms）  
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
     * 判断 计时器间隔（ms） 是否指定值，包括空值
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
     * 重置 计时器间隔（ms）
     */
    @JsonIgnore
    public void resetTimer(){
        this.reset(FIELD_TIMER);
    }

    /**
     * 设置 计时器间隔（ms），详细说明：{@link #FIELD_TIMER}
     * <P>
     * 等同 {@link #setTimer}
     * @param timer
     */
    @JsonIgnore
    public PSCtrlLogicGrpDetailDTO timer(Integer timer){
        this.setTimer(timer);
        return this;
    }

    /**
     * <B>TRIGGERTYPE</B>&nbsp;触发类型，指定逻辑的触发类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.UILogicTriggerType} 
     */
    public final static String FIELD_TRIGGERTYPE = "triggertype";

    /**
     * 设置 触发类型，详细说明：{@link #FIELD_TRIGGERTYPE}
     * 
     * @param triggerType
     * 
     */
    @JsonProperty(FIELD_TRIGGERTYPE)
    public void setTriggerType(String triggerType){
        this.set(FIELD_TRIGGERTYPE, triggerType);
    }
    
    /**
     * 获取 触发类型  
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
     * 判断 触发类型 是否指定值，包括空值
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
     * 重置 触发类型
     */
    @JsonIgnore
    public void resetTriggerType(){
        this.reset(FIELD_TRIGGERTYPE);
    }

    /**
     * 设置 触发类型，详细说明：{@link #FIELD_TRIGGERTYPE}
     * <P>
     * 等同 {@link #setTriggerType}
     * @param triggerType
     */
    @JsonIgnore
    public PSCtrlLogicGrpDetailDTO triggertype(String triggerType){
        this.setTriggerType(triggerType);
        return this;
    }

     /**
     * 设置 触发类型，详细说明：{@link #FIELD_TRIGGERTYPE}
     * <P>
     * 等同 {@link #setTriggerType}
     * @param triggerType
     */
    @JsonIgnore
    public PSCtrlLogicGrpDetailDTO triggertype(net.ibizsys.model.PSModelEnums.UILogicTriggerType triggerType){
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
    public PSCtrlLogicGrpDetailDTO updatedate(Timestamp updateDate){
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
    public PSCtrlLogicGrpDetailDTO updateman(String updateMan){
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
    public PSCtrlLogicGrpDetailDTO usercat(String userCat){
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
    public PSCtrlLogicGrpDetailDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSCtrlLogicGrpDetailDTO usertag(String userTag){
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
    public PSCtrlLogicGrpDetailDTO usertag2(String userTag2){
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
    public PSCtrlLogicGrpDetailDTO usertag3(String userTag3){
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
    public PSCtrlLogicGrpDetailDTO usertag4(String userTag4){
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
    public PSCtrlLogicGrpDetailDTO validflag(Integer validFlag){
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
    public PSCtrlLogicGrpDetailDTO validflag(Boolean validFlag){
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
        return this.getPSCtrlLogicGrpDetailId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSCtrlLogicGrpDetailId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSCtrlLogicGrpDetailId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSCtrlLogicGrpDetailId(strValue);
    }

    @JsonIgnore
    public PSCtrlLogicGrpDetailDTO id(String strValue){
        this.setPSCtrlLogicGrpDetailId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSCtrlLogicGrpDetailDTO){
            PSCtrlLogicGrpDetailDTO dto = (PSCtrlLogicGrpDetailDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
