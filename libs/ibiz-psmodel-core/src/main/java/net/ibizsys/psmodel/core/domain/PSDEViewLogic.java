package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSDEVIEWLOGIC</B>实体视图逻辑 模型传输对象
 * <P>
 * 实体视图的处理逻辑模型，定义视图及部件的自定义处理逻辑，增强视图类型内置处理逻辑
 */
public class PSDEViewLogic extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEViewLogic(){
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
    public PSDEViewLogic attrname(String attrName){
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
    public PSDEViewLogic createdate(String createDate){
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
    public PSDEViewLogic createman(String createMan){
        this.setCreateMan(createMan);
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
    public PSDEViewLogic customcode(String customCode){
        this.setCustomCode(customCode);
        return this;
    }

    /**
     * <B>DSTLOGICTYPE</B>&nbsp;目标逻辑类型，指定视图逻辑触发的目标逻辑类型
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
    public PSDEViewLogic dstlogictype(String dstLogicType){
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
    public PSDEViewLogic dstlogictype(net.ibizsys.psmodel.core.util.PSModelEnums.TargetUILogic dstLogicType){
        if(dstLogicType == null){
            this.setDstLogicType(null);
        }
        else{
            this.setDstLogicType(dstLogicType.value);
        }
        return this;
    }

    /**
     * <B>EVENTARG</B>&nbsp;事件参数，指定视图逻辑监控事件的额外参数
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
    public PSDEViewLogic eventarg(String eventArg){
        this.setEventArg(eventArg);
        return this;
    }

    /**
     * <B>EVENTARG2</B>&nbsp;事件参数2，指定视图逻辑监控事件的额外参数2
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
    public PSDEViewLogic eventarg2(String eventArg2){
        this.setEventArg2(eventArg2);
        return this;
    }

    /**
     * <B>EVENTNAMES</B>&nbsp;事件名称，指定视图逻辑所监控的事件清单，多个使用【;】分隔
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
    public PSDEViewLogic eventnames(String eventNames){
        this.setEventNames(eventNames);
        return this;
    }

    /**
     * <B>LOGICPARAM</B>&nbsp;逻辑标记，指定视图逻辑的标记
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
    public PSDEViewLogic logicparam(String logicParam){
        this.setLogicParam(logicParam);
        return this;
    }

    /**
     * <B>LOGICPARAM2</B>&nbsp;逻辑标记2，指定视图逻辑的标记2
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
    public PSDEViewLogic logicparam2(String logicParam2){
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
    public PSDEViewLogic memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;排序值，指定视图逻辑的初始化次序
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
    public PSDEViewLogic ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVIEWBASEID}
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 实体标识
     * 
     * @param pSDEId
     * 
     */
    @JsonProperty(FIELD_PSDEID)
    public void setPSDEId(String pSDEId){
        this.set(FIELD_PSDEID, pSDEId);
    }
    
    /**
     * 获取 实体标识  
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
     * 判断 实体标识 是否指定值，包括空值
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
     * 重置 实体标识
     */
    @JsonIgnore
    public void resetPSDEId(){
        this.reset(FIELD_PSDEID);
    }

    /**
     * 设置 实体标识
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSDEViewLogic psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * <B>PSDELOGICID</B>&nbsp;实体界面逻辑，目标逻辑类型为【实体界面逻辑】时指定视图所在实体的界面逻辑对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDELogic} 
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
    public PSDEViewLogic psdelogicid(String pSDELogicId){
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
    public PSDEViewLogic psdelogicid(PSDELogic pSDELogic){
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
     * <B>PSDELOGICNAME</B>&nbsp;实体界面逻辑，目标逻辑类型为【实体界面逻辑】时指定视图所在实体的界面逻辑对象
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
    public PSDEViewLogic psdelogicname(String pSDELogicName){
        this.setPSDELogicName(pSDELogicName);
        return this;
    }

    /**
     * <B>PSDEVIEWBASEID</B>&nbsp;实体视图，指定视图处理逻辑所在的视图对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_PSDEVIEWBASEID = "psdeviewbaseid";

    /**
     * 设置 实体视图，详细说明：{@link #FIELD_PSDEVIEWBASEID}
     * 
     * @param pSDEViewBaseId
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWBASEID)
    public void setPSDEViewBaseId(String pSDEViewBaseId){
        this.set(FIELD_PSDEVIEWBASEID, pSDEViewBaseId);
    }
    
    /**
     * 获取 实体视图  
     * @return
     */
    @JsonIgnore
    public String getPSDEViewBaseId(){
        Object objValue = this.get(FIELD_PSDEVIEWBASEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEViewBaseIdDirty(){
        if(this.contains(FIELD_PSDEVIEWBASEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体视图
     */
    @JsonIgnore
    public void resetPSDEViewBaseId(){
        this.reset(FIELD_PSDEVIEWBASEID);
    }

    /**
     * 设置 实体视图，详细说明：{@link #FIELD_PSDEVIEWBASEID}
     * <P>
     * 等同 {@link #setPSDEViewBaseId}
     * @param pSDEViewBaseId
     */
    @JsonIgnore
    public PSDEViewLogic psdeviewbaseid(String pSDEViewBaseId){
        this.setPSDEViewBaseId(pSDEViewBaseId);
        return this;
    }

    /**
     * 设置 实体视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEViewBaseId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSDEViewLogic psdeviewbaseid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setPSDEId(null);
            this.setPSDEViewBaseId(null);
            this.setPSDEViewBaseName(null);
        }
        else{
            this.setPSDEId(pSDEViewBase.getPSDEId());
            this.setPSDEViewBaseId(pSDEViewBase.getPSDEViewBaseId());
            this.setPSDEViewBaseName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>PSDEVIEWBASENAME</B>&nbsp;实体视图，指定视图处理逻辑所在的视图对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVIEWBASEID}
     */
    public final static String FIELD_PSDEVIEWBASENAME = "psdeviewbasename";

    /**
     * 设置 实体视图，详细说明：{@link #FIELD_PSDEVIEWBASENAME}
     * 
     * @param pSDEViewBaseName
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWBASENAME)
    public void setPSDEViewBaseName(String pSDEViewBaseName){
        this.set(FIELD_PSDEVIEWBASENAME, pSDEViewBaseName);
    }
    
    /**
     * 获取 实体视图  
     * @return
     */
    @JsonIgnore
    public String getPSDEViewBaseName(){
        Object objValue = this.get(FIELD_PSDEVIEWBASENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEViewBaseNameDirty(){
        if(this.contains(FIELD_PSDEVIEWBASENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体视图
     */
    @JsonIgnore
    public void resetPSDEViewBaseName(){
        this.reset(FIELD_PSDEVIEWBASENAME);
    }

    /**
     * 设置 实体视图，详细说明：{@link #FIELD_PSDEVIEWBASENAME}
     * <P>
     * 等同 {@link #setPSDEViewBaseName}
     * @param pSDEViewBaseName
     */
    @JsonIgnore
    public PSDEViewLogic psdeviewbasename(String pSDEViewBaseName){
        this.setPSDEViewBaseName(pSDEViewBaseName);
        return this;
    }

    /**
     * <B>PSDEVIEWCTRLID</B>&nbsp;事件部件，逻辑触发类型为【部件事件触发】时指定事件触发的的视图部件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewCtrl} 
     */
    public final static String FIELD_PSDEVIEWCTRLID = "psdeviewctrlid";

    /**
     * 设置 事件部件，详细说明：{@link #FIELD_PSDEVIEWCTRLID}
     * 
     * @param pSDEViewCtrlId
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWCTRLID)
    public void setPSDEViewCtrlId(String pSDEViewCtrlId){
        this.set(FIELD_PSDEVIEWCTRLID, pSDEViewCtrlId);
    }
    
    /**
     * 获取 事件部件  
     * @return
     */
    @JsonIgnore
    public String getPSDEViewCtrlId(){
        Object objValue = this.get(FIELD_PSDEVIEWCTRLID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 事件部件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEViewCtrlIdDirty(){
        if(this.contains(FIELD_PSDEVIEWCTRLID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 事件部件
     */
    @JsonIgnore
    public void resetPSDEViewCtrlId(){
        this.reset(FIELD_PSDEVIEWCTRLID);
    }

    /**
     * 设置 事件部件，详细说明：{@link #FIELD_PSDEVIEWCTRLID}
     * <P>
     * 等同 {@link #setPSDEViewCtrlId}
     * @param pSDEViewCtrlId
     */
    @JsonIgnore
    public PSDEViewLogic psdeviewctrlid(String pSDEViewCtrlId){
        this.setPSDEViewCtrlId(pSDEViewCtrlId);
        return this;
    }

    /**
     * 设置 事件部件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEViewCtrlId}
     * @param pSDEViewCtrl 引用对象
     */
    @JsonIgnore
    public PSDEViewLogic psdeviewctrlid(PSDEViewCtrl pSDEViewCtrl){
        if(pSDEViewCtrl == null){
            this.setPSDEViewCtrlId(null);
            this.setPSDEViewCtrlName(null);
        }
        else{
            this.setPSDEViewCtrlId(pSDEViewCtrl.getPSDEViewCtrlId());
            this.setPSDEViewCtrlName(pSDEViewCtrl.getPSDEViewCtrlName());
        }
        return this;
    }

    /**
     * <B>PSDEVIEWCTRLNAME</B>&nbsp;部件，逻辑触发类型为【部件事件触发】时指定事件触发的的视图部件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVIEWCTRLID}
     */
    public final static String FIELD_PSDEVIEWCTRLNAME = "psdeviewctrlname";

    /**
     * 设置 部件，详细说明：{@link #FIELD_PSDEVIEWCTRLNAME}
     * 
     * @param pSDEViewCtrlName
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWCTRLNAME)
    public void setPSDEViewCtrlName(String pSDEViewCtrlName){
        this.set(FIELD_PSDEVIEWCTRLNAME, pSDEViewCtrlName);
    }
    
    /**
     * 获取 部件  
     * @return
     */
    @JsonIgnore
    public String getPSDEViewCtrlName(){
        Object objValue = this.get(FIELD_PSDEVIEWCTRLNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEViewCtrlNameDirty(){
        if(this.contains(FIELD_PSDEVIEWCTRLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件
     */
    @JsonIgnore
    public void resetPSDEViewCtrlName(){
        this.reset(FIELD_PSDEVIEWCTRLNAME);
    }

    /**
     * 设置 部件，详细说明：{@link #FIELD_PSDEVIEWCTRLNAME}
     * <P>
     * 等同 {@link #setPSDEViewCtrlName}
     * @param pSDEViewCtrlName
     */
    @JsonIgnore
    public PSDEViewLogic psdeviewctrlname(String pSDEViewCtrlName){
        this.setPSDEViewCtrlName(pSDEViewCtrlName);
        return this;
    }

    /**
     * <B>PSDEVIEWLOGICID</B>&nbsp;实体视图逻辑标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVIEWLOGICID = "psdeviewlogicid";

    /**
     * 设置 实体视图逻辑标识
     * 
     * @param pSDEViewLogicId
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWLOGICID)
    public void setPSDEViewLogicId(String pSDEViewLogicId){
        this.set(FIELD_PSDEVIEWLOGICID, pSDEViewLogicId);
    }
    
    /**
     * 获取 实体视图逻辑标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEViewLogicId(){
        Object objValue = this.get(FIELD_PSDEVIEWLOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体视图逻辑标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEViewLogicIdDirty(){
        if(this.contains(FIELD_PSDEVIEWLOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体视图逻辑标识
     */
    @JsonIgnore
    public void resetPSDEViewLogicId(){
        this.reset(FIELD_PSDEVIEWLOGICID);
    }

    /**
     * 设置 实体视图逻辑标识
     * <P>
     * 等同 {@link #setPSDEViewLogicId}
     * @param pSDEViewLogicId
     */
    @JsonIgnore
    public PSDEViewLogic psdeviewlogicid(String pSDEViewLogicId){
        this.setPSDEViewLogicId(pSDEViewLogicId);
        return this;
    }

    /**
     * <B>PSDEVIEWLOGICNAME</B>&nbsp;处理标识，指定视图处理逻辑标识，需在所在实体视图中具有唯一性
     * <P>
     * 字符串：最大长度 20，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSDEVIEWLOGICNAME = "psdeviewlogicname";

    /**
     * 设置 处理标识，详细说明：{@link #FIELD_PSDEVIEWLOGICNAME}
     * 
     * @param pSDEViewLogicName
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWLOGICNAME)
    public void setPSDEViewLogicName(String pSDEViewLogicName){
        this.set(FIELD_PSDEVIEWLOGICNAME, pSDEViewLogicName);
    }
    
    /**
     * 获取 处理标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEViewLogicName(){
        Object objValue = this.get(FIELD_PSDEVIEWLOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 处理标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEViewLogicNameDirty(){
        if(this.contains(FIELD_PSDEVIEWLOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 处理标识
     */
    @JsonIgnore
    public void resetPSDEViewLogicName(){
        this.reset(FIELD_PSDEVIEWLOGICNAME);
    }

    /**
     * 设置 处理标识，详细说明：{@link #FIELD_PSDEVIEWLOGICNAME}
     * <P>
     * 等同 {@link #setPSDEViewLogicName}
     * @param pSDEViewLogicName
     */
    @JsonIgnore
    public PSDEViewLogic psdeviewlogicname(String pSDEViewLogicName){
        this.setPSDEViewLogicName(pSDEViewLogicName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEViewLogicName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEViewLogicName(strName);
    }

    @JsonIgnore
    public PSDEViewLogic name(String strName){
        this.setPSDEViewLogicName(strName);
        return this;
    }

    /**
     * <B>PSDEVIEWLOGICTYPE</B>&nbsp;逻辑触发类型，指定视图逻辑的触发类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ViewLogicTrigger} 
     */
    public final static String FIELD_PSDEVIEWLOGICTYPE = "psdeviewlogictype";

    /**
     * 设置 逻辑触发类型，详细说明：{@link #FIELD_PSDEVIEWLOGICTYPE}
     * 
     * @param pSDEViewLogicType
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWLOGICTYPE)
    public void setPSDEViewLogicType(String pSDEViewLogicType){
        this.set(FIELD_PSDEVIEWLOGICTYPE, pSDEViewLogicType);
    }
    
    /**
     * 获取 逻辑触发类型  
     * @return
     */
    @JsonIgnore
    public String getPSDEViewLogicType(){
        Object objValue = this.get(FIELD_PSDEVIEWLOGICTYPE);
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
    public boolean isPSDEViewLogicTypeDirty(){
        if(this.contains(FIELD_PSDEVIEWLOGICTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 逻辑触发类型
     */
    @JsonIgnore
    public void resetPSDEViewLogicType(){
        this.reset(FIELD_PSDEVIEWLOGICTYPE);
    }

    /**
     * 设置 逻辑触发类型，详细说明：{@link #FIELD_PSDEVIEWLOGICTYPE}
     * <P>
     * 等同 {@link #setPSDEViewLogicType}
     * @param pSDEViewLogicType
     */
    @JsonIgnore
    public PSDEViewLogic psdeviewlogictype(String pSDEViewLogicType){
        this.setPSDEViewLogicType(pSDEViewLogicType);
        return this;
    }

     /**
     * 设置 逻辑触发类型，详细说明：{@link #FIELD_PSDEVIEWLOGICTYPE}
     * <P>
     * 等同 {@link #setPSDEViewLogicType}
     * @param pSDEViewLogicType
     */
    @JsonIgnore
    public PSDEViewLogic psdeviewlogictype(net.ibizsys.psmodel.core.util.PSModelEnums.ViewLogicTrigger pSDEViewLogicType){
        if(pSDEViewLogicType == null){
            this.setPSDEViewLogicType(null);
        }
        else{
            this.setPSDEViewLogicType(pSDEViewLogicType.value);
        }
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
    public PSDEViewLogic pssyspfpluginid(String pSSysPFPluginId){
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
    public PSDEViewLogic pssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
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
    public PSDEViewLogic pssyspfpluginname(String pSSysPFPluginName){
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
    public PSDEViewLogic pssysviewlogicid(String pSSysViewLogicId){
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
    public PSDEViewLogic pssysviewlogicid(PSSysViewLogic pSSysViewLogic){
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
     * <B>PSSYSVIEWLOGICNAME</B>&nbsp;系统界面逻辑，目标逻辑类型为【系统界面逻辑】时指定系统定义的界面逻辑
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
    public PSDEViewLogic pssysviewlogicname(String pSSysViewLogicName){
        this.setPSSysViewLogicName(pSSysViewLogicName);
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELID</B>&nbsp;布局面板
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysViewPanel} 
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
    public PSDEViewLogic pssysviewpanelid(String pSSysViewPanelId){
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
    public PSDEViewLogic pssysviewpanelid(PSSysViewPanel pSSysViewPanel){
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
    public PSDEViewLogic pssysviewpanelname(String pSSysViewPanelName){
        this.setPSSysViewPanelName(pSSysViewPanelName);
        return this;
    }

    /**
     * <B>TIMER</B>&nbsp;计时间隔（ms），逻辑触发类型为【定时器】时指定定时触发间隔，单位为【毫秒】
     */
    public final static String FIELD_TIMER = "timer";

    /**
     * 设置 计时间隔（ms），详细说明：{@link #FIELD_TIMER}
     * 
     * @param timer
     * 
     */
    @JsonProperty(FIELD_TIMER)
    public void setTimer(Integer timer){
        this.set(FIELD_TIMER, timer);
    }
    
    /**
     * 获取 计时间隔（ms）  
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
     * 判断 计时间隔（ms） 是否指定值，包括空值
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
     * 重置 计时间隔（ms）
     */
    @JsonIgnore
    public void resetTimer(){
        this.reset(FIELD_TIMER);
    }

    /**
     * 设置 计时间隔（ms），详细说明：{@link #FIELD_TIMER}
     * <P>
     * 等同 {@link #setTimer}
     * @param timer
     */
    @JsonIgnore
    public PSDEViewLogic timer(Integer timer){
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
    public PSDEViewLogic updatedate(String updateDate){
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
    public PSDEViewLogic updateman(String updateMan){
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
    public PSDEViewLogic usercat(String userCat){
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
    public PSDEViewLogic usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDEViewLogic usertag(String userTag){
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
    public PSDEViewLogic usertag2(String userTag2){
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
    public PSDEViewLogic usertag3(String userTag3){
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
    public PSDEViewLogic usertag4(String userTag4){
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
    public PSDEViewLogic validflag(Integer validFlag){
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
    public PSDEViewLogic validflag(Boolean validFlag){
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
        return this.getPSDEViewLogicId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEViewLogicId(strValue);
    }

    @JsonIgnore
    public PSDEViewLogic id(String strValue){
        this.setPSDEViewLogicId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEViewLogic){
            PSDEViewLogic model = (PSDEViewLogic)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
