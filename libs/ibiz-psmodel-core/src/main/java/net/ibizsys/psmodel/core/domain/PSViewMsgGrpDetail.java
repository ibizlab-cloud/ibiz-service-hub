package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSVIEWMSGGRPDETAIL</B>视图消息组成员 模型传输对象
 * <P>
 * 视图消息组成员模型，将视图消息加入到消息组中，一个视图消息只能被加入一次
 */
public class PSViewMsgGrpDetail extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSViewMsgGrpDetail(){
        this.setValidFlag(1);
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
    public PSViewMsgGrpDetail createdate(String createDate){
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
    public PSViewMsgGrpDetail createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DYNAMICMODE</B>&nbsp;视图消息类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ViewMsgDynamicMode} 
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSVIEWMSGID}
     */
    public final static String FIELD_DYNAMICMODE = "dynamicmode";

    /**
     * 设置 视图消息类型
     * 
     * @param dynamicMode
     * 
     */
    @JsonProperty(FIELD_DYNAMICMODE)
    public void setDynamicMode(Integer dynamicMode){
        this.set(FIELD_DYNAMICMODE, dynamicMode);
    }
    
    /**
     * 获取 视图消息类型  
     * @return
     */
    @JsonIgnore
    public Integer getDynamicMode(){
        Object objValue = this.get(FIELD_DYNAMICMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 视图消息类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDynamicModeDirty(){
        if(this.contains(FIELD_DYNAMICMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图消息类型
     */
    @JsonIgnore
    public void resetDynamicMode(){
        this.reset(FIELD_DYNAMICMODE);
    }

    /**
     * 设置 视图消息类型
     * <P>
     * 等同 {@link #setDynamicMode}
     * @param dynamicMode
     */
    @JsonIgnore
    public PSViewMsgGrpDetail dynamicmode(Integer dynamicMode){
        this.setDynamicMode(dynamicMode);
        return this;
    }

    /**
     * <B>ENABLEMODE</B>&nbsp;启用模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ViewMsgEnableMode} 
     */
    public final static String FIELD_ENABLEMODE = "enablemode";

    /**
     * 设置 启用模式
     * 
     * @param enableMode
     * 
     */
    @JsonProperty(FIELD_ENABLEMODE)
    public void setEnableMode(String enableMode){
        this.set(FIELD_ENABLEMODE, enableMode);
    }
    
    /**
     * 获取 启用模式  
     * @return
     */
    @JsonIgnore
    public String getEnableMode(){
        Object objValue = this.get(FIELD_ENABLEMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 启用模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableModeDirty(){
        if(this.contains(FIELD_ENABLEMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用模式
     */
    @JsonIgnore
    public void resetEnableMode(){
        this.reset(FIELD_ENABLEMODE);
    }

    /**
     * 设置 启用模式
     * <P>
     * 等同 {@link #setEnableMode}
     * @param enableMode
     */
    @JsonIgnore
    public PSViewMsgGrpDetail enablemode(String enableMode){
        this.setEnableMode(enableMode);
        return this;
    }

     /**
     * 设置 启用模式
     * <P>
     * 等同 {@link #setEnableMode}
     * @param enableMode
     */
    @JsonIgnore
    public PSViewMsgGrpDetail enablemode(net.ibizsys.psmodel.core.util.PSModelEnums.ViewMsgEnableMode enableMode){
        if(enableMode == null){
            this.setEnableMode(null);
        }
        else{
            this.setEnableMode(enableMode.value);
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
    public PSViewMsgGrpDetail memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MSGPOS</B>&nbsp;消息位置，额外指定视图消息的显示位置，未定义时使用视图消息默认配置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ViewMsgPos} 
     */
    public final static String FIELD_MSGPOS = "msgpos";

    /**
     * 设置 消息位置，详细说明：{@link #FIELD_MSGPOS}
     * 
     * @param msgPos
     * 
     */
    @JsonProperty(FIELD_MSGPOS)
    public void setMsgPos(String msgPos){
        this.set(FIELD_MSGPOS, msgPos);
    }
    
    /**
     * 获取 消息位置  
     * @return
     */
    @JsonIgnore
    public String getMsgPos(){
        Object objValue = this.get(FIELD_MSGPOS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 消息位置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMsgPosDirty(){
        if(this.contains(FIELD_MSGPOS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 消息位置
     */
    @JsonIgnore
    public void resetMsgPos(){
        this.reset(FIELD_MSGPOS);
    }

    /**
     * 设置 消息位置，详细说明：{@link #FIELD_MSGPOS}
     * <P>
     * 等同 {@link #setMsgPos}
     * @param msgPos
     */
    @JsonIgnore
    public PSViewMsgGrpDetail msgpos(String msgPos){
        this.setMsgPos(msgPos);
        return this;
    }

     /**
     * 设置 消息位置，详细说明：{@link #FIELD_MSGPOS}
     * <P>
     * 等同 {@link #setMsgPos}
     * @param msgPos
     */
    @JsonIgnore
    public PSViewMsgGrpDetail msgpos(net.ibizsys.psmodel.core.util.PSModelEnums.ViewMsgPos msgPos){
        if(msgPos == null){
            this.setMsgPos(null);
        }
        else{
            this.setMsgPos(msgPos.value);
        }
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;排序值，额外指定视图消息的排序值，未定义时使用视图消息默认配置
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
    public PSViewMsgGrpDetail ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSVIEWMSGGROUPID</B>&nbsp;视图消息组，指定成员所在的视图消息组对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSViewMsgGroup} 
     */
    public final static String FIELD_PSVIEWMSGGROUPID = "psviewmsggroupid";

    /**
     * 设置 视图消息组，详细说明：{@link #FIELD_PSVIEWMSGGROUPID}
     * 
     * @param pSViewMsgGroupId
     * 
     */
    @JsonProperty(FIELD_PSVIEWMSGGROUPID)
    public void setPSViewMsgGroupId(String pSViewMsgGroupId){
        this.set(FIELD_PSVIEWMSGGROUPID, pSViewMsgGroupId);
    }
    
    /**
     * 获取 视图消息组  
     * @return
     */
    @JsonIgnore
    public String getPSViewMsgGroupId(){
        Object objValue = this.get(FIELD_PSVIEWMSGGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图消息组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSViewMsgGroupIdDirty(){
        if(this.contains(FIELD_PSVIEWMSGGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图消息组
     */
    @JsonIgnore
    public void resetPSViewMsgGroupId(){
        this.reset(FIELD_PSVIEWMSGGROUPID);
    }

    /**
     * 设置 视图消息组，详细说明：{@link #FIELD_PSVIEWMSGGROUPID}
     * <P>
     * 等同 {@link #setPSViewMsgGroupId}
     * @param pSViewMsgGroupId
     */
    @JsonIgnore
    public PSViewMsgGrpDetail psviewmsggroupid(String pSViewMsgGroupId){
        this.setPSViewMsgGroupId(pSViewMsgGroupId);
        return this;
    }

    /**
     * 设置 视图消息组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSViewMsgGroupId}
     * @param pSViewMsgGroup 引用对象
     */
    @JsonIgnore
    public PSViewMsgGrpDetail psviewmsggroupid(PSViewMsgGroup pSViewMsgGroup){
        if(pSViewMsgGroup == null){
            this.setPSViewMsgGroupId(null);
            this.setPSViewMsgGroupName(null);
        }
        else{
            this.setPSViewMsgGroupId(pSViewMsgGroup.getPSViewMsgGroupId());
            this.setPSViewMsgGroupName(pSViewMsgGroup.getPSViewMsgGroupName());
        }
        return this;
    }

    /**
     * <B>PSVIEWMSGGROUPNAME</B>&nbsp;视图消息组，指定成员所在的视图消息组对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSVIEWMSGGROUPID}
     */
    public final static String FIELD_PSVIEWMSGGROUPNAME = "psviewmsggroupname";

    /**
     * 设置 视图消息组，详细说明：{@link #FIELD_PSVIEWMSGGROUPNAME}
     * 
     * @param pSViewMsgGroupName
     * 
     */
    @JsonProperty(FIELD_PSVIEWMSGGROUPNAME)
    public void setPSViewMsgGroupName(String pSViewMsgGroupName){
        this.set(FIELD_PSVIEWMSGGROUPNAME, pSViewMsgGroupName);
    }
    
    /**
     * 获取 视图消息组  
     * @return
     */
    @JsonIgnore
    public String getPSViewMsgGroupName(){
        Object objValue = this.get(FIELD_PSVIEWMSGGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图消息组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSViewMsgGroupNameDirty(){
        if(this.contains(FIELD_PSVIEWMSGGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图消息组
     */
    @JsonIgnore
    public void resetPSViewMsgGroupName(){
        this.reset(FIELD_PSVIEWMSGGROUPNAME);
    }

    /**
     * 设置 视图消息组，详细说明：{@link #FIELD_PSVIEWMSGGROUPNAME}
     * <P>
     * 等同 {@link #setPSViewMsgGroupName}
     * @param pSViewMsgGroupName
     */
    @JsonIgnore
    public PSViewMsgGrpDetail psviewmsggroupname(String pSViewMsgGroupName){
        this.setPSViewMsgGroupName(pSViewMsgGroupName);
        return this;
    }

    /**
     * <B>PSVIEWMSGGRPDETAILID</B>&nbsp;视图消息成员标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSVIEWMSGGRPDETAILID = "psviewmsggrpdetailid";

    /**
     * 设置 视图消息成员标识
     * 
     * @param pSViewMsgGrpDetailId
     * 
     */
    @JsonProperty(FIELD_PSVIEWMSGGRPDETAILID)
    public void setPSViewMsgGrpDetailId(String pSViewMsgGrpDetailId){
        this.set(FIELD_PSVIEWMSGGRPDETAILID, pSViewMsgGrpDetailId);
    }
    
    /**
     * 获取 视图消息成员标识  
     * @return
     */
    @JsonIgnore
    public String getPSViewMsgGrpDetailId(){
        Object objValue = this.get(FIELD_PSVIEWMSGGRPDETAILID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图消息成员标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSViewMsgGrpDetailIdDirty(){
        if(this.contains(FIELD_PSVIEWMSGGRPDETAILID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图消息成员标识
     */
    @JsonIgnore
    public void resetPSViewMsgGrpDetailId(){
        this.reset(FIELD_PSVIEWMSGGRPDETAILID);
    }

    /**
     * 设置 视图消息成员标识
     * <P>
     * 等同 {@link #setPSViewMsgGrpDetailId}
     * @param pSViewMsgGrpDetailId
     */
    @JsonIgnore
    public PSViewMsgGrpDetail psviewmsggrpdetailid(String pSViewMsgGrpDetailId){
        this.setPSViewMsgGrpDetailId(pSViewMsgGrpDetailId);
        return this;
    }

    /**
     * <B>PSVIEWMSGID</B>&nbsp;视图消息，指定加入到消息组的视图消息对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSViewMsg} 
     */
    public final static String FIELD_PSVIEWMSGID = "psviewmsgid";

    /**
     * 设置 视图消息，详细说明：{@link #FIELD_PSVIEWMSGID}
     * 
     * @param pSViewMsgId
     * 
     */
    @JsonProperty(FIELD_PSVIEWMSGID)
    public void setPSViewMsgId(String pSViewMsgId){
        this.set(FIELD_PSVIEWMSGID, pSViewMsgId);
    }
    
    /**
     * 获取 视图消息  
     * @return
     */
    @JsonIgnore
    public String getPSViewMsgId(){
        Object objValue = this.get(FIELD_PSVIEWMSGID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图消息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSViewMsgIdDirty(){
        if(this.contains(FIELD_PSVIEWMSGID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图消息
     */
    @JsonIgnore
    public void resetPSViewMsgId(){
        this.reset(FIELD_PSVIEWMSGID);
    }

    /**
     * 设置 视图消息，详细说明：{@link #FIELD_PSVIEWMSGID}
     * <P>
     * 等同 {@link #setPSViewMsgId}
     * @param pSViewMsgId
     */
    @JsonIgnore
    public PSViewMsgGrpDetail psviewmsgid(String pSViewMsgId){
        this.setPSViewMsgId(pSViewMsgId);
        return this;
    }

    /**
     * 设置 视图消息，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSViewMsgId}
     * @param pSViewMsg 引用对象
     */
    @JsonIgnore
    public PSViewMsgGrpDetail psviewmsgid(PSViewMsg pSViewMsg){
        if(pSViewMsg == null){
            this.setDynamicMode(null);
            this.setPSViewMsgId(null);
            this.setPSViewMsgName(null);
        }
        else{
            this.setDynamicMode(pSViewMsg.getDynamicMode());
            this.setPSViewMsgId(pSViewMsg.getPSViewMsgId());
            this.setPSViewMsgName(pSViewMsg.getPSViewMsgName());
        }
        return this;
    }

    /**
     * <B>PSVIEWMSGNAME</B>&nbsp;视图消息，指定加入到消息组的视图消息对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSVIEWMSGID}
     */
    public final static String FIELD_PSVIEWMSGNAME = "psviewmsgname";

    /**
     * 设置 视图消息，详细说明：{@link #FIELD_PSVIEWMSGNAME}
     * 
     * @param pSViewMsgName
     * 
     */
    @JsonProperty(FIELD_PSVIEWMSGNAME)
    public void setPSViewMsgName(String pSViewMsgName){
        this.set(FIELD_PSVIEWMSGNAME, pSViewMsgName);
    }
    
    /**
     * 获取 视图消息  
     * @return
     */
    @JsonIgnore
    public String getPSViewMsgName(){
        Object objValue = this.get(FIELD_PSVIEWMSGNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图消息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSViewMsgNameDirty(){
        if(this.contains(FIELD_PSVIEWMSGNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图消息
     */
    @JsonIgnore
    public void resetPSViewMsgName(){
        this.reset(FIELD_PSVIEWMSGNAME);
    }

    /**
     * 设置 视图消息，详细说明：{@link #FIELD_PSVIEWMSGNAME}
     * <P>
     * 等同 {@link #setPSViewMsgName}
     * @param pSViewMsgName
     */
    @JsonIgnore
    public PSViewMsgGrpDetail psviewmsgname(String pSViewMsgName){
        this.setPSViewMsgName(pSViewMsgName);
        return this;
    }

    /**
     * <B>TESTCUSTOMCODE</B>&nbsp;判断自定义代码
     */
    public final static String FIELD_TESTCUSTOMCODE = "testcustomcode";

    /**
     * 设置 判断自定义代码
     * 
     * @param testCustomCode
     * 
     */
    @JsonProperty(FIELD_TESTCUSTOMCODE)
    public void setTestCustomCode(String testCustomCode){
        this.set(FIELD_TESTCUSTOMCODE, testCustomCode);
    }
    
    /**
     * 获取 判断自定义代码  
     * @return
     */
    @JsonIgnore
    public String getTestCustomCode(){
        Object objValue = this.get(FIELD_TESTCUSTOMCODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 判断自定义代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTestCustomCodeDirty(){
        if(this.contains(FIELD_TESTCUSTOMCODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 判断自定义代码
     */
    @JsonIgnore
    public void resetTestCustomCode(){
        this.reset(FIELD_TESTCUSTOMCODE);
    }

    /**
     * 设置 判断自定义代码
     * <P>
     * 等同 {@link #setTestCustomCode}
     * @param testCustomCode
     */
    @JsonIgnore
    public PSViewMsgGrpDetail testcustomcode(String testCustomCode){
        this.setTestCustomCode(testCustomCode);
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
    public PSViewMsgGrpDetail updatedate(String updateDate){
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
    public PSViewMsgGrpDetail updateman(String updateMan){
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
    public PSViewMsgGrpDetail usercat(String userCat){
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
    public PSViewMsgGrpDetail usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSViewMsgGrpDetail usertag(String userTag){
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
    public PSViewMsgGrpDetail usertag2(String userTag2){
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
    public PSViewMsgGrpDetail usertag3(String userTag3){
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
    public PSViewMsgGrpDetail usertag4(String userTag4){
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
    public PSViewMsgGrpDetail validflag(Integer validFlag){
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
    public PSViewMsgGrpDetail validflag(Boolean validFlag){
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
        return this.getPSViewMsgGrpDetailId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSViewMsgGrpDetailId(strValue);
    }

    @JsonIgnore
    public PSViewMsgGrpDetail id(String strValue){
        this.setPSViewMsgGrpDetailId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSViewMsgGrpDetail){
            PSViewMsgGrpDetail model = (PSViewMsgGrpDetail)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
