package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSVIEWPANELLOGIC</B>面板逻辑 模型传输对象
 * <P>
 * 面板处理逻辑模型，定义面板及成员的自定义交互处理逻辑
 */
public class PSSysViewPanelLogic extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysViewPanelLogic(){
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
    public PSSysViewPanelLogic attrname(String attrName){
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
    public PSSysViewPanelLogic createdate(String createDate){
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
    public PSSysViewPanelLogic createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CTRLEVENT</B>&nbsp;部件事件，指定面板逻辑所监控的事件清单，多个使用【;】分隔
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_CTRLEVENT = "ctrlevent";

    /**
     * 设置 部件事件，详细说明：{@link #FIELD_CTRLEVENT}
     * 
     * @param ctrlEvent
     * 
     */
    @JsonProperty(FIELD_CTRLEVENT)
    public void setCtrlEvent(String ctrlEvent){
        this.set(FIELD_CTRLEVENT, ctrlEvent);
    }
    
    /**
     * 获取 部件事件  
     * @return
     */
    @JsonIgnore
    public String getCtrlEvent(){
        Object objValue = this.get(FIELD_CTRLEVENT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件事件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlEventDirty(){
        if(this.contains(FIELD_CTRLEVENT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件事件
     */
    @JsonIgnore
    public void resetCtrlEvent(){
        this.reset(FIELD_CTRLEVENT);
    }

    /**
     * 设置 部件事件，详细说明：{@link #FIELD_CTRLEVENT}
     * <P>
     * 等同 {@link #setCtrlEvent}
     * @param ctrlEvent
     */
    @JsonIgnore
    public PSSysViewPanelLogic ctrlevent(String ctrlEvent){
        this.setCtrlEvent(ctrlEvent);
        return this;
    }

    /**
     * <B>CTRLEVENTARG</B>&nbsp;部件事件参数，指定面板逻辑监控事件的额外参数
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CTRLEVENTARG = "ctrleventarg";

    /**
     * 设置 部件事件参数，详细说明：{@link #FIELD_CTRLEVENTARG}
     * 
     * @param ctrlEventArg
     * 
     */
    @JsonProperty(FIELD_CTRLEVENTARG)
    public void setCtrlEventArg(String ctrlEventArg){
        this.set(FIELD_CTRLEVENTARG, ctrlEventArg);
    }
    
    /**
     * 获取 部件事件参数  
     * @return
     */
    @JsonIgnore
    public String getCtrlEventArg(){
        Object objValue = this.get(FIELD_CTRLEVENTARG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件事件参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlEventArgDirty(){
        if(this.contains(FIELD_CTRLEVENTARG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件事件参数
     */
    @JsonIgnore
    public void resetCtrlEventArg(){
        this.reset(FIELD_CTRLEVENTARG);
    }

    /**
     * 设置 部件事件参数，详细说明：{@link #FIELD_CTRLEVENTARG}
     * <P>
     * 等同 {@link #setCtrlEventArg}
     * @param ctrlEventArg
     */
    @JsonIgnore
    public PSSysViewPanelLogic ctrleventarg(String ctrlEventArg){
        this.setCtrlEventArg(ctrlEventArg);
        return this;
    }

    /**
     * <B>CTRLEVENTARG2</B>&nbsp;部件事件参数2，指定面板逻辑监控事件的额外参数2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CTRLEVENTARG2 = "ctrleventarg2";

    /**
     * 设置 部件事件参数2，详细说明：{@link #FIELD_CTRLEVENTARG2}
     * 
     * @param ctrlEventArg2
     * 
     */
    @JsonProperty(FIELD_CTRLEVENTARG2)
    public void setCtrlEventArg2(String ctrlEventArg2){
        this.set(FIELD_CTRLEVENTARG2, ctrlEventArg2);
    }
    
    /**
     * 获取 部件事件参数2  
     * @return
     */
    @JsonIgnore
    public String getCtrlEventArg2(){
        Object objValue = this.get(FIELD_CTRLEVENTARG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件事件参数2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlEventArg2Dirty(){
        if(this.contains(FIELD_CTRLEVENTARG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件事件参数2
     */
    @JsonIgnore
    public void resetCtrlEventArg2(){
        this.reset(FIELD_CTRLEVENTARG2);
    }

    /**
     * 设置 部件事件参数2，详细说明：{@link #FIELD_CTRLEVENTARG2}
     * <P>
     * 等同 {@link #setCtrlEventArg2}
     * @param ctrlEventArg2
     */
    @JsonIgnore
    public PSSysViewPanelLogic ctrleventarg2(String ctrlEventArg2){
        this.setCtrlEventArg2(ctrlEventArg2);
        return this;
    }

    /**
     * <B>CTRLEVENTNAME</B>&nbsp;部件事件名称
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CTRLEVENTNAME = "ctrleventname";

    /**
     * 设置 部件事件名称
     * 
     * @param ctrlEventName
     * 
     */
    @JsonProperty(FIELD_CTRLEVENTNAME)
    public void setCtrlEventName(String ctrlEventName){
        this.set(FIELD_CTRLEVENTNAME, ctrlEventName);
    }
    
    /**
     * 获取 部件事件名称  
     * @return
     */
    @JsonIgnore
    public String getCtrlEventName(){
        Object objValue = this.get(FIELD_CTRLEVENTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件事件名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlEventNameDirty(){
        if(this.contains(FIELD_CTRLEVENTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件事件名称
     */
    @JsonIgnore
    public void resetCtrlEventName(){
        this.reset(FIELD_CTRLEVENTNAME);
    }

    /**
     * 设置 部件事件名称
     * <P>
     * 等同 {@link #setCtrlEventName}
     * @param ctrlEventName
     */
    @JsonIgnore
    public PSSysViewPanelLogic ctrleventname(String ctrlEventName){
        this.setCtrlEventName(ctrlEventName);
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
    public PSSysViewPanelLogic customcode(String customCode){
        this.setCustomCode(customCode);
        return this;
    }

    /**
     * <B>DSTLOGICTYPE</B>&nbsp;目标逻辑类型，指定面板逻辑触发的目标逻辑类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.TargetUILogic} 
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
    public PSSysViewPanelLogic dstlogictype(String dstLogicType){
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
    public PSSysViewPanelLogic dstlogictype(net.ibizsys.psmodel.core.util.PSModelEnums.TargetUILogic dstLogicType){
        if(dstLogicType == null){
            this.setDstLogicType(null);
        }
        else{
            this.setDstLogicType(dstLogicType.value);
        }
        return this;
    }

    /**
     * <B>LAYOUTPSSYSVIEWPANELID</B>&nbsp;布局系统面板
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysViewPanel} 
     */
    public final static String FIELD_LAYOUTPSSYSVIEWPANELID = "layoutpssysviewpanelid";

    /**
     * 设置 布局系统面板
     * 
     * @param layoutPSSysViewPanelId
     * 
     */
    @JsonProperty(FIELD_LAYOUTPSSYSVIEWPANELID)
    public void setLayoutPSSysViewPanelId(String layoutPSSysViewPanelId){
        this.set(FIELD_LAYOUTPSSYSVIEWPANELID, layoutPSSysViewPanelId);
    }
    
    /**
     * 获取 布局系统面板  
     * @return
     */
    @JsonIgnore
    public String getLayoutPSSysViewPanelId(){
        Object objValue = this.get(FIELD_LAYOUTPSSYSVIEWPANELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 布局系统面板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLayoutPSSysViewPanelIdDirty(){
        if(this.contains(FIELD_LAYOUTPSSYSVIEWPANELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 布局系统面板
     */
    @JsonIgnore
    public void resetLayoutPSSysViewPanelId(){
        this.reset(FIELD_LAYOUTPSSYSVIEWPANELID);
    }

    /**
     * 设置 布局系统面板
     * <P>
     * 等同 {@link #setLayoutPSSysViewPanelId}
     * @param layoutPSSysViewPanelId
     */
    @JsonIgnore
    public PSSysViewPanelLogic layoutpssysviewpanelid(String layoutPSSysViewPanelId){
        this.setLayoutPSSysViewPanelId(layoutPSSysViewPanelId);
        return this;
    }

    /**
     * 设置 布局系统面板，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setLayoutPSSysViewPanelId}
     * @param pSSysViewPanel 引用对象
     */
    @JsonIgnore
    public PSSysViewPanelLogic layoutpssysviewpanelid(PSSysViewPanel pSSysViewPanel){
        if(pSSysViewPanel == null){
            this.setLayoutPSSysViewPanelId(null);
            this.setLayoutPSSysViewPanelName(null);
        }
        else{
            this.setLayoutPSSysViewPanelId(pSSysViewPanel.getPSSysViewPanelId());
            this.setLayoutPSSysViewPanelName(pSSysViewPanel.getPSSysViewPanelName());
        }
        return this;
    }

    /**
     * <B>LAYOUTPSSYSVIEWPANELNAME</B>&nbsp;布局系统面板
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_LAYOUTPSSYSVIEWPANELID}
     */
    public final static String FIELD_LAYOUTPSSYSVIEWPANELNAME = "layoutpssysviewpanelname";

    /**
     * 设置 布局系统面板
     * 
     * @param layoutPSSysViewPanelName
     * 
     */
    @JsonProperty(FIELD_LAYOUTPSSYSVIEWPANELNAME)
    public void setLayoutPSSysViewPanelName(String layoutPSSysViewPanelName){
        this.set(FIELD_LAYOUTPSSYSVIEWPANELNAME, layoutPSSysViewPanelName);
    }
    
    /**
     * 获取 布局系统面板  
     * @return
     */
    @JsonIgnore
    public String getLayoutPSSysViewPanelName(){
        Object objValue = this.get(FIELD_LAYOUTPSSYSVIEWPANELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 布局系统面板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLayoutPSSysViewPanelNameDirty(){
        if(this.contains(FIELD_LAYOUTPSSYSVIEWPANELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 布局系统面板
     */
    @JsonIgnore
    public void resetLayoutPSSysViewPanelName(){
        this.reset(FIELD_LAYOUTPSSYSVIEWPANELNAME);
    }

    /**
     * 设置 布局系统面板
     * <P>
     * 等同 {@link #setLayoutPSSysViewPanelName}
     * @param layoutPSSysViewPanelName
     */
    @JsonIgnore
    public PSSysViewPanelLogic layoutpssysviewpanelname(String layoutPSSysViewPanelName){
        this.setLayoutPSSysViewPanelName(layoutPSSysViewPanelName);
        return this;
    }

    /**
     * <B>LOGICPARAM</B>&nbsp;逻辑参数，指定面板逻辑的参数
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_LOGICPARAM = "logicparam";

    /**
     * 设置 逻辑参数，详细说明：{@link #FIELD_LOGICPARAM}
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
     * 设置 逻辑参数，详细说明：{@link #FIELD_LOGICPARAM}
     * <P>
     * 等同 {@link #setLogicParam}
     * @param logicParam
     */
    @JsonIgnore
    public PSSysViewPanelLogic logicparam(String logicParam){
        this.setLogicParam(logicParam);
        return this;
    }

    /**
     * <B>LOGICPARAM2</B>&nbsp;逻辑参数2，指定面板逻辑的参数2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_LOGICPARAM2 = "logicparam2";

    /**
     * 设置 逻辑参数2，详细说明：{@link #FIELD_LOGICPARAM2}
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
     * 设置 逻辑参数2，详细说明：{@link #FIELD_LOGICPARAM2}
     * <P>
     * 等同 {@link #setLogicParam2}
     * @param logicParam2
     */
    @JsonIgnore
    public PSSysViewPanelLogic logicparam2(String logicParam2){
        this.setLogicParam2(logicParam2);
        return this;
    }

    /**
     * <B>LOGICTYPE</B>&nbsp;逻辑类型，指定面板图逻辑的触发类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.PanelLogicType} 
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
    public PSSysViewPanelLogic logictype(String logicType){
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
    public PSSysViewPanelLogic logictype(net.ibizsys.psmodel.core.util.PSModelEnums.PanelLogicType logicType){
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
    public PSSysViewPanelLogic memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;排序值，指定面板逻辑的初始化次序
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
    public PSSysViewPanelLogic ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PARAMPSPANELITEMID</B>&nbsp;参数面板项
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysViewPanelItem} 
     */
    public final static String FIELD_PARAMPSPANELITEMID = "parampspanelitemid";

    /**
     * 设置 参数面板项
     * 
     * @param paramPSPanelItemId
     * 
     */
    @JsonProperty(FIELD_PARAMPSPANELITEMID)
    public void setParamPSPanelItemId(String paramPSPanelItemId){
        this.set(FIELD_PARAMPSPANELITEMID, paramPSPanelItemId);
    }
    
    /**
     * 获取 参数面板项  
     * @return
     */
    @JsonIgnore
    public String getParamPSPanelItemId(){
        Object objValue = this.get(FIELD_PARAMPSPANELITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数面板项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamPSPanelItemIdDirty(){
        if(this.contains(FIELD_PARAMPSPANELITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数面板项
     */
    @JsonIgnore
    public void resetParamPSPanelItemId(){
        this.reset(FIELD_PARAMPSPANELITEMID);
    }

    /**
     * 设置 参数面板项
     * <P>
     * 等同 {@link #setParamPSPanelItemId}
     * @param paramPSPanelItemId
     */
    @JsonIgnore
    public PSSysViewPanelLogic parampspanelitemid(String paramPSPanelItemId){
        this.setParamPSPanelItemId(paramPSPanelItemId);
        return this;
    }

    /**
     * 设置 参数面板项，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setParamPSPanelItemId}
     * @param pSSysViewPanelItem 引用对象
     */
    @JsonIgnore
    public PSSysViewPanelLogic parampspanelitemid(PSSysViewPanelItem pSSysViewPanelItem){
        if(pSSysViewPanelItem == null){
            this.setParamPSPanelItemId(null);
            this.setParamPSPanelItemName(null);
        }
        else{
            this.setParamPSPanelItemId(pSSysViewPanelItem.getPSSysViewPanelItemId());
            this.setParamPSPanelItemName(pSSysViewPanelItem.getPSSysViewPanelItemName());
        }
        return this;
    }

    /**
     * <B>PARAMPSPANELITEMNAME</B>&nbsp;参数面板项
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PARAMPSPANELITEMID}
     */
    public final static String FIELD_PARAMPSPANELITEMNAME = "parampspanelitemname";

    /**
     * 设置 参数面板项
     * 
     * @param paramPSPanelItemName
     * 
     */
    @JsonProperty(FIELD_PARAMPSPANELITEMNAME)
    public void setParamPSPanelItemName(String paramPSPanelItemName){
        this.set(FIELD_PARAMPSPANELITEMNAME, paramPSPanelItemName);
    }
    
    /**
     * 获取 参数面板项  
     * @return
     */
    @JsonIgnore
    public String getParamPSPanelItemName(){
        Object objValue = this.get(FIELD_PARAMPSPANELITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数面板项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamPSPanelItemNameDirty(){
        if(this.contains(FIELD_PARAMPSPANELITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数面板项
     */
    @JsonIgnore
    public void resetParamPSPanelItemName(){
        this.reset(FIELD_PARAMPSPANELITEMNAME);
    }

    /**
     * 设置 参数面板项
     * <P>
     * 等同 {@link #setParamPSPanelItemName}
     * @param paramPSPanelItemName
     */
    @JsonIgnore
    public PSSysViewPanelLogic parampspanelitemname(String paramPSPanelItemName){
        this.setParamPSPanelItemName(paramPSPanelItemName);
        return this;
    }

    /**
     * <B>PSAPPFUNCID</B>&nbsp;应用功能
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSAppFunc} 
     */
    public final static String FIELD_PSAPPFUNCID = "psappfuncid";

    /**
     * 设置 应用功能
     * 
     * @param pSAppFuncId
     * 
     */
    @JsonProperty(FIELD_PSAPPFUNCID)
    public void setPSAppFuncId(String pSAppFuncId){
        this.set(FIELD_PSAPPFUNCID, pSAppFuncId);
    }
    
    /**
     * 获取 应用功能  
     * @return
     */
    @JsonIgnore
    public String getPSAppFuncId(){
        Object objValue = this.get(FIELD_PSAPPFUNCID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用功能 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppFuncIdDirty(){
        if(this.contains(FIELD_PSAPPFUNCID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用功能
     */
    @JsonIgnore
    public void resetPSAppFuncId(){
        this.reset(FIELD_PSAPPFUNCID);
    }

    /**
     * 设置 应用功能
     * <P>
     * 等同 {@link #setPSAppFuncId}
     * @param pSAppFuncId
     */
    @JsonIgnore
    public PSSysViewPanelLogic psappfuncid(String pSAppFuncId){
        this.setPSAppFuncId(pSAppFuncId);
        return this;
    }

    /**
     * 设置 应用功能，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSAppFuncId}
     * @param pSAppFunc 引用对象
     */
    @JsonIgnore
    public PSSysViewPanelLogic psappfuncid(PSAppFunc pSAppFunc){
        if(pSAppFunc == null){
            this.setPSAppFuncId(null);
            this.setPSAppFuncName(null);
        }
        else{
            this.setPSAppFuncId(pSAppFunc.getPSAppFuncId());
            this.setPSAppFuncName(pSAppFunc.getPSAppFuncName());
        }
        return this;
    }

    /**
     * <B>PSAPPFUNCNAME</B>&nbsp;应用功能
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSAPPFUNCID}
     */
    public final static String FIELD_PSAPPFUNCNAME = "psappfuncname";

    /**
     * 设置 应用功能
     * 
     * @param pSAppFuncName
     * 
     */
    @JsonProperty(FIELD_PSAPPFUNCNAME)
    public void setPSAppFuncName(String pSAppFuncName){
        this.set(FIELD_PSAPPFUNCNAME, pSAppFuncName);
    }
    
    /**
     * 获取 应用功能  
     * @return
     */
    @JsonIgnore
    public String getPSAppFuncName(){
        Object objValue = this.get(FIELD_PSAPPFUNCNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用功能 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppFuncNameDirty(){
        if(this.contains(FIELD_PSAPPFUNCNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用功能
     */
    @JsonIgnore
    public void resetPSAppFuncName(){
        this.reset(FIELD_PSAPPFUNCNAME);
    }

    /**
     * 设置 应用功能
     * <P>
     * 等同 {@link #setPSAppFuncName}
     * @param pSAppFuncName
     */
    @JsonIgnore
    public PSSysViewPanelLogic psappfuncname(String pSAppFuncName){
        this.setPSAppFuncName(pSAppFuncName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，目标逻辑类型为【实体界面逻辑】时指定的界面逻辑的所在实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
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
    public PSSysViewPanelLogic psdeid(String pSDEId){
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
    public PSSysViewPanelLogic psdeid(PSDataEntity pSDataEntity){
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
     * <B>PSDELOGICID</B>&nbsp;界面处理逻辑，目标逻辑类型为【实体界面逻辑】时指定的实体界面逻辑
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDELogic} 
     */
    public final static String FIELD_PSDELOGICID = "psdelogicid";

    /**
     * 设置 界面处理逻辑，详细说明：{@link #FIELD_PSDELOGICID}
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
     * 设置 界面处理逻辑，详细说明：{@link #FIELD_PSDELOGICID}
     * <P>
     * 等同 {@link #setPSDELogicId}
     * @param pSDELogicId
     */
    @JsonIgnore
    public PSSysViewPanelLogic psdelogicid(String pSDELogicId){
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
    public PSSysViewPanelLogic psdelogicid(PSDELogic pSDELogic){
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
     * <B>PSDELOGICNAME</B>&nbsp;界面处理逻辑，目标逻辑类型为【实体界面逻辑】时指定的实体界面逻辑
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDELOGICID}
     */
    public final static String FIELD_PSDELOGICNAME = "psdelogicname";

    /**
     * 设置 界面处理逻辑，详细说明：{@link #FIELD_PSDELOGICNAME}
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
     * 设置 界面处理逻辑，详细说明：{@link #FIELD_PSDELOGICNAME}
     * <P>
     * 等同 {@link #setPSDELogicName}
     * @param pSDELogicName
     */
    @JsonIgnore
    public PSSysViewPanelLogic psdelogicname(String pSDELogicName){
        this.setPSDELogicName(pSDELogicName);
        return this;
    }

    /**
     * <B>PSDENAME</B>&nbsp;实体，目标逻辑类型为【实体界面逻辑】时指定的界面逻辑的所在实体
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
    public PSSysViewPanelLogic psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSDEUIACTIONID</B>&nbsp;调用界面行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEUIAction} 
     */
    public final static String FIELD_PSDEUIACTIONID = "psdeuiactionid";

    /**
     * 设置 调用界面行为
     * 
     * @param pSDEUIActionId
     * 
     */
    @JsonProperty(FIELD_PSDEUIACTIONID)
    public void setPSDEUIActionId(String pSDEUIActionId){
        this.set(FIELD_PSDEUIACTIONID, pSDEUIActionId);
    }
    
    /**
     * 获取 调用界面行为  
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
     * 判断 调用界面行为 是否指定值，包括空值
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
     * 重置 调用界面行为
     */
    @JsonIgnore
    public void resetPSDEUIActionId(){
        this.reset(FIELD_PSDEUIACTIONID);
    }

    /**
     * 设置 调用界面行为
     * <P>
     * 等同 {@link #setPSDEUIActionId}
     * @param pSDEUIActionId
     */
    @JsonIgnore
    public PSSysViewPanelLogic psdeuiactionid(String pSDEUIActionId){
        this.setPSDEUIActionId(pSDEUIActionId);
        return this;
    }

    /**
     * 设置 调用界面行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEUIActionId}
     * @param pSDEUIAction 引用对象
     */
    @JsonIgnore
    public PSSysViewPanelLogic psdeuiactionid(PSDEUIAction pSDEUIAction){
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
     * <B>PSDEUIACTIONNAME</B>&nbsp;调用界面行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEUIACTIONID}
     */
    public final static String FIELD_PSDEUIACTIONNAME = "psdeuiactionname";

    /**
     * 设置 调用界面行为
     * 
     * @param pSDEUIActionName
     * 
     */
    @JsonProperty(FIELD_PSDEUIACTIONNAME)
    public void setPSDEUIActionName(String pSDEUIActionName){
        this.set(FIELD_PSDEUIACTIONNAME, pSDEUIActionName);
    }
    
    /**
     * 获取 调用界面行为  
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
     * 判断 调用界面行为 是否指定值，包括空值
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
     * 重置 调用界面行为
     */
    @JsonIgnore
    public void resetPSDEUIActionName(){
        this.reset(FIELD_PSDEUIACTIONNAME);
    }

    /**
     * 设置 调用界面行为
     * <P>
     * 等同 {@link #setPSDEUIActionName}
     * @param pSDEUIActionName
     */
    @JsonIgnore
    public PSSysViewPanelLogic psdeuiactionname(String pSDEUIActionName){
        this.setPSDEUIActionName(pSDEUIActionName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端扩展插件，目标逻辑类型为【前端模板插件】时指定插件对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysPFPlugin} 
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
    public PSSysViewPanelLogic pssyspfpluginid(String pSSysPFPluginId){
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
    public PSSysViewPanelLogic pssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
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
    public PSSysViewPanelLogic pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    /**
     * <B>PSSYSVIEWLOGICID</B>&nbsp;系统视图逻辑，目标逻辑类型为【系统界面逻辑】时指定系统定义的界面逻辑
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysViewLogic} 
     */
    public final static String FIELD_PSSYSVIEWLOGICID = "pssysviewlogicid";

    /**
     * 设置 系统视图逻辑，详细说明：{@link #FIELD_PSSYSVIEWLOGICID}
     * 
     * @param pSSysViewLogicId
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWLOGICID)
    public void setPSSysViewLogicId(String pSSysViewLogicId){
        this.set(FIELD_PSSYSVIEWLOGICID, pSSysViewLogicId);
    }
    
    /**
     * 获取 系统视图逻辑  
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
     * 判断 系统视图逻辑 是否指定值，包括空值
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
     * 重置 系统视图逻辑
     */
    @JsonIgnore
    public void resetPSSysViewLogicId(){
        this.reset(FIELD_PSSYSVIEWLOGICID);
    }

    /**
     * 设置 系统视图逻辑，详细说明：{@link #FIELD_PSSYSVIEWLOGICID}
     * <P>
     * 等同 {@link #setPSSysViewLogicId}
     * @param pSSysViewLogicId
     */
    @JsonIgnore
    public PSSysViewPanelLogic pssysviewlogicid(String pSSysViewLogicId){
        this.setPSSysViewLogicId(pSSysViewLogicId);
        return this;
    }

    /**
     * 设置 系统视图逻辑，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysViewLogicId}
     * @param pSSysViewLogic 引用对象
     */
    @JsonIgnore
    public PSSysViewPanelLogic pssysviewlogicid(PSSysViewLogic pSSysViewLogic){
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
     * <B>PSSYSVIEWLOGICNAME</B>&nbsp;系统视图逻辑，目标逻辑类型为【系统界面逻辑】时指定系统定义的界面逻辑
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSVIEWLOGICID}
     */
    public final static String FIELD_PSSYSVIEWLOGICNAME = "pssysviewlogicname";

    /**
     * 设置 系统视图逻辑，详细说明：{@link #FIELD_PSSYSVIEWLOGICNAME}
     * 
     * @param pSSysViewLogicName
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWLOGICNAME)
    public void setPSSysViewLogicName(String pSSysViewLogicName){
        this.set(FIELD_PSSYSVIEWLOGICNAME, pSSysViewLogicName);
    }
    
    /**
     * 获取 系统视图逻辑  
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
     * 判断 系统视图逻辑 是否指定值，包括空值
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
     * 重置 系统视图逻辑
     */
    @JsonIgnore
    public void resetPSSysViewLogicName(){
        this.reset(FIELD_PSSYSVIEWLOGICNAME);
    }

    /**
     * 设置 系统视图逻辑，详细说明：{@link #FIELD_PSSYSVIEWLOGICNAME}
     * <P>
     * 等同 {@link #setPSSysViewLogicName}
     * @param pSSysViewLogicName
     */
    @JsonIgnore
    public PSSysViewPanelLogic pssysviewlogicname(String pSSysViewLogicName){
        this.setPSSysViewLogicName(pSSysViewLogicName);
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELID</B>&nbsp;系统面板，指定面板处理逻辑所属的面板部件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysViewPanel} 
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
    public PSSysViewPanelLogic pssysviewpanelid(String pSSysViewPanelId){
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
    public PSSysViewPanelLogic pssysviewpanelid(PSSysViewPanel pSSysViewPanel){
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
     * <B>PSSYSVIEWPANELITEMID</B>&nbsp;面板项，逻辑触发类型为【部件事件触发】时指定事件触发的的面板成员
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysViewPanelItem} 
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
    public PSSysViewPanelLogic pssysviewpanelitemid(String pSSysViewPanelItemId){
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
    public PSSysViewPanelLogic pssysviewpanelitemid(PSSysViewPanelItem pSSysViewPanelItem){
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
     * <B>PSSYSVIEWPANELITEMNAME</B>&nbsp;面板项，逻辑触发类型为【部件事件触发】时指定事件触发的的面板成员
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
    public PSSysViewPanelLogic pssysviewpanelitemname(String pSSysViewPanelItemName){
        this.setPSSysViewPanelItemName(pSSysViewPanelItemName);
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELLOGICID</B>&nbsp;系统面板逻辑标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSVIEWPANELLOGICID = "pssysviewpanellogicid";

    /**
     * 设置 系统面板逻辑标识
     * 
     * @param pSSysViewPanelLogicId
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELLOGICID)
    public void setPSSysViewPanelLogicId(String pSSysViewPanelLogicId){
        this.set(FIELD_PSSYSVIEWPANELLOGICID, pSSysViewPanelLogicId);
    }
    
    /**
     * 获取 系统面板逻辑标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysViewPanelLogicId(){
        Object objValue = this.get(FIELD_PSSYSVIEWPANELLOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统面板逻辑标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysViewPanelLogicIdDirty(){
        if(this.contains(FIELD_PSSYSVIEWPANELLOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统面板逻辑标识
     */
    @JsonIgnore
    public void resetPSSysViewPanelLogicId(){
        this.reset(FIELD_PSSYSVIEWPANELLOGICID);
    }

    /**
     * 设置 系统面板逻辑标识
     * <P>
     * 等同 {@link #setPSSysViewPanelLogicId}
     * @param pSSysViewPanelLogicId
     */
    @JsonIgnore
    public PSSysViewPanelLogic pssysviewpanellogicid(String pSSysViewPanelLogicId){
        this.setPSSysViewPanelLogicId(pSSysViewPanelLogicId);
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELLOGICNAME</B>&nbsp;逻辑标识，指定面板处理逻辑标识，需在所在面板部件中具有唯一性
     * <P>
     * 字符串：最大长度 30，由字母、数字、下划线及点号组成，且开始必须字母
     */
    public final static String FIELD_PSSYSVIEWPANELLOGICNAME = "pssysviewpanellogicname";

    /**
     * 设置 逻辑标识，详细说明：{@link #FIELD_PSSYSVIEWPANELLOGICNAME}
     * 
     * @param pSSysViewPanelLogicName
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELLOGICNAME)
    public void setPSSysViewPanelLogicName(String pSSysViewPanelLogicName){
        this.set(FIELD_PSSYSVIEWPANELLOGICNAME, pSSysViewPanelLogicName);
    }
    
    /**
     * 获取 逻辑标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysViewPanelLogicName(){
        Object objValue = this.get(FIELD_PSSYSVIEWPANELLOGICNAME);
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
    public boolean isPSSysViewPanelLogicNameDirty(){
        if(this.contains(FIELD_PSSYSVIEWPANELLOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 逻辑标识
     */
    @JsonIgnore
    public void resetPSSysViewPanelLogicName(){
        this.reset(FIELD_PSSYSVIEWPANELLOGICNAME);
    }

    /**
     * 设置 逻辑标识，详细说明：{@link #FIELD_PSSYSVIEWPANELLOGICNAME}
     * <P>
     * 等同 {@link #setPSSysViewPanelLogicName}
     * @param pSSysViewPanelLogicName
     */
    @JsonIgnore
    public PSSysViewPanelLogic pssysviewpanellogicname(String pSSysViewPanelLogicName){
        this.setPSSysViewPanelLogicName(pSSysViewPanelLogicName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysViewPanelLogicName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysViewPanelLogicName(strName);
    }

    @JsonIgnore
    public PSSysViewPanelLogic name(String strName){
        this.setPSSysViewPanelLogicName(strName);
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELMODELID</B>&nbsp;面板模型
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSVIEWPANELMODELID = "pssysviewpanelmodelid";

    /**
     * 设置 面板模型
     * 
     * @param pSSysViewPanelModelId
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELMODELID)
    public void setPSSysViewPanelModelId(String pSSysViewPanelModelId){
        this.set(FIELD_PSSYSVIEWPANELMODELID, pSSysViewPanelModelId);
    }
    
    /**
     * 获取 面板模型  
     * @return
     */
    @JsonIgnore
    public String getPSSysViewPanelModelId(){
        Object objValue = this.get(FIELD_PSSYSVIEWPANELMODELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 面板模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysViewPanelModelIdDirty(){
        if(this.contains(FIELD_PSSYSVIEWPANELMODELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板模型
     */
    @JsonIgnore
    public void resetPSSysViewPanelModelId(){
        this.reset(FIELD_PSSYSVIEWPANELMODELID);
    }

    /**
     * 设置 面板模型
     * <P>
     * 等同 {@link #setPSSysViewPanelModelId}
     * @param pSSysViewPanelModelId
     */
    @JsonIgnore
    public PSSysViewPanelLogic pssysviewpanelmodelid(String pSSysViewPanelModelId){
        this.setPSSysViewPanelModelId(pSSysViewPanelModelId);
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELMODELNAME</B>&nbsp;面板模型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSVIEWPANELMODELID}
     */
    public final static String FIELD_PSSYSVIEWPANELMODELNAME = "pssysviewpanelmodelname";

    /**
     * 设置 面板模型
     * 
     * @param pSSysViewPanelModelName
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELMODELNAME)
    public void setPSSysViewPanelModelName(String pSSysViewPanelModelName){
        this.set(FIELD_PSSYSVIEWPANELMODELNAME, pSSysViewPanelModelName);
    }
    
    /**
     * 获取 面板模型  
     * @return
     */
    @JsonIgnore
    public String getPSSysViewPanelModelName(){
        Object objValue = this.get(FIELD_PSSYSVIEWPANELMODELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 面板模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysViewPanelModelNameDirty(){
        if(this.contains(FIELD_PSSYSVIEWPANELMODELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板模型
     */
    @JsonIgnore
    public void resetPSSysViewPanelModelName(){
        this.reset(FIELD_PSSYSVIEWPANELMODELNAME);
    }

    /**
     * 设置 面板模型
     * <P>
     * 等同 {@link #setPSSysViewPanelModelName}
     * @param pSSysViewPanelModelName
     */
    @JsonIgnore
    public PSSysViewPanelLogic pssysviewpanelmodelname(String pSSysViewPanelModelName){
        this.setPSSysViewPanelModelName(pSSysViewPanelModelName);
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELNAME</B>&nbsp;系统面板，指定面板处理逻辑所属的面板部件
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
    public PSSysViewPanelLogic pssysviewpanelname(String pSSysViewPanelName){
        this.setPSSysViewPanelName(pSSysViewPanelName);
        return this;
    }

    /**
     * <B>TIMER</B>&nbsp;计时器间隔，逻辑触发类型为【定时器】时指定定时触发间隔，单位为【毫秒】
     */
    public final static String FIELD_TIMER = "timer";

    /**
     * 设置 计时器间隔，详细说明：{@link #FIELD_TIMER}
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
     * 设置 计时器间隔，详细说明：{@link #FIELD_TIMER}
     * <P>
     * 等同 {@link #setTimer}
     * @param timer
     */
    @JsonIgnore
    public PSSysViewPanelLogic timer(Integer timer){
        this.setTimer(timer);
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
    public PSSysViewPanelLogic updatedate(String updateDate){
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
    public PSSysViewPanelLogic updateman(String updateMan){
        this.setUpdateMan(updateMan);
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
    public PSSysViewPanelLogic validflag(Integer validFlag){
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
    public PSSysViewPanelLogic validflag(Boolean validFlag){
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
        return this.getPSSysViewPanelLogicId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysViewPanelLogicId(strValue);
    }

    @JsonIgnore
    public PSSysViewPanelLogic id(String strValue){
        this.setPSSysViewPanelLogicId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysViewPanelLogic){
            PSSysViewPanelLogic model = (PSSysViewPanelLogic)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
