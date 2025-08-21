package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDELOGICLINK</B>实体处理逻辑连接 模型传输对象
 * <P>
 * 实体处理逻辑中的处理节点连接模型，区分【业务处理逻辑】与【界面处理逻辑】
 */
public class PSDELogicLink extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDELogicLink(){
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
    public PSDELogicLink createdate(String createDate){
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
    public PSDELogicLink createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DEBUGMODE</B>&nbsp;调试模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DELogicDebugMode} 
     */
    public final static String FIELD_DEBUGMODE = "debugmode";

    /**
     * 设置 调试模式
     * 
     * @param debugMode
     * 
     */
    @JsonProperty(FIELD_DEBUGMODE)
    public void setDebugMode(Integer debugMode){
        this.set(FIELD_DEBUGMODE, debugMode);
    }
    
    /**
     * 获取 调试模式  
     * @return
     */
    @JsonIgnore
    public Integer getDebugMode(){
        Object objValue = this.get(FIELD_DEBUGMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 调试模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDebugModeDirty(){
        if(this.contains(FIELD_DEBUGMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 调试模式
     */
    @JsonIgnore
    public void resetDebugMode(){
        this.reset(FIELD_DEBUGMODE);
    }

    /**
     * 设置 调试模式
     * <P>
     * 等同 {@link #setDebugMode}
     * @param debugMode
     */
    @JsonIgnore
    public PSDELogicLink debugmode(Integer debugMode){
        this.setDebugMode(debugMode);
        return this;
    }

     /**
     * 设置 调试模式
     * <P>
     * 等同 {@link #setDebugMode}
     * @param debugMode
     */
    @JsonIgnore
    public PSDELogicLink debugmode(net.ibizsys.psmodel.core.util.PSModelEnums.DELogicDebugMode debugMode){
        if(debugMode == null){
            this.setDebugMode(null);
        }
        else{
            this.setDebugMode(debugMode.value);
        }
        return this;
    }

    /**
     * <B>DEFAULTLINK</B>&nbsp;默认连接，指定连接是否为默认连接，默认连接不作条件判断处理，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEFAULTLINK = "defaultlink";

    /**
     * 设置 默认连接，详细说明：{@link #FIELD_DEFAULTLINK}
     * 
     * @param defaultLink
     * 
     */
    @JsonProperty(FIELD_DEFAULTLINK)
    public void setDefaultLink(Integer defaultLink){
        this.set(FIELD_DEFAULTLINK, defaultLink);
    }
    
    /**
     * 获取 默认连接  
     * @return
     */
    @JsonIgnore
    public Integer getDefaultLink(){
        Object objValue = this.get(FIELD_DEFAULTLINK);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认连接 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefaultLinkDirty(){
        if(this.contains(FIELD_DEFAULTLINK)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认连接
     */
    @JsonIgnore
    public void resetDefaultLink(){
        this.reset(FIELD_DEFAULTLINK);
    }

    /**
     * 设置 默认连接，详细说明：{@link #FIELD_DEFAULTLINK}
     * <P>
     * 等同 {@link #setDefaultLink}
     * @param defaultLink
     */
    @JsonIgnore
    public PSDELogicLink defaultlink(Integer defaultLink){
        this.setDefaultLink(defaultLink);
        return this;
    }

     /**
     * 设置 默认连接，详细说明：{@link #FIELD_DEFAULTLINK}
     * <P>
     * 等同 {@link #setDefaultLink}
     * @param defaultLink
     */
    @JsonIgnore
    public PSDELogicLink defaultlink(Boolean defaultLink){
        if(defaultLink == null){
            this.setDefaultLink(null);
        }
        else{
            this.setDefaultLink(defaultLink?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DSTENDPOINT</B>&nbsp;目标端点
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_DSTENDPOINT = "dstendpoint";

    /**
     * 设置 目标端点
     * 
     * @param dstEndPoint
     * 
     */
    @JsonProperty(FIELD_DSTENDPOINT)
    public void setDstEndPoint(String dstEndPoint){
        this.set(FIELD_DSTENDPOINT, dstEndPoint);
    }
    
    /**
     * 获取 目标端点  
     * @return
     */
    @JsonIgnore
    public String getDstEndPoint(){
        Object objValue = this.get(FIELD_DSTENDPOINT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标端点 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstEndPointDirty(){
        if(this.contains(FIELD_DSTENDPOINT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标端点
     */
    @JsonIgnore
    public void resetDstEndPoint(){
        this.reset(FIELD_DSTENDPOINT);
    }

    /**
     * 设置 目标端点
     * <P>
     * 等同 {@link #setDstEndPoint}
     * @param dstEndPoint
     */
    @JsonIgnore
    public PSDELogicLink dstendpoint(String dstEndPoint){
        this.setDstEndPoint(dstEndPoint);
        return this;
    }

    /**
     * <B>DSTPSDELOGICNODEID</B>&nbsp;目标节点，指定连接的目标处理节点
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDELogicNode} 
     */
    public final static String FIELD_DSTPSDELOGICNODEID = "dstpsdelogicnodeid";

    /**
     * 设置 目标节点，详细说明：{@link #FIELD_DSTPSDELOGICNODEID}
     * 
     * @param dstPSDELogicNodeId
     * 
     */
    @JsonProperty(FIELD_DSTPSDELOGICNODEID)
    public void setDstPSDELogicNodeId(String dstPSDELogicNodeId){
        this.set(FIELD_DSTPSDELOGICNODEID, dstPSDELogicNodeId);
    }
    
    /**
     * 获取 目标节点  
     * @return
     */
    @JsonIgnore
    public String getDstPSDELogicNodeId(){
        Object objValue = this.get(FIELD_DSTPSDELOGICNODEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标节点 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDELogicNodeIdDirty(){
        if(this.contains(FIELD_DSTPSDELOGICNODEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标节点
     */
    @JsonIgnore
    public void resetDstPSDELogicNodeId(){
        this.reset(FIELD_DSTPSDELOGICNODEID);
    }

    /**
     * 设置 目标节点，详细说明：{@link #FIELD_DSTPSDELOGICNODEID}
     * <P>
     * 等同 {@link #setDstPSDELogicNodeId}
     * @param dstPSDELogicNodeId
     */
    @JsonIgnore
    public PSDELogicLink dstpsdelogicnodeid(String dstPSDELogicNodeId){
        this.setDstPSDELogicNodeId(dstPSDELogicNodeId);
        return this;
    }

    /**
     * 设置 目标节点，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDstPSDELogicNodeId}
     * @param pSDELogicNode 引用对象
     */
    @JsonIgnore
    public PSDELogicLink dstpsdelogicnodeid(PSDELogicNode pSDELogicNode){
        if(pSDELogicNode == null){
            this.setDstPSDELogicNodeId(null);
            this.setDstPSDELogicNodeName(null);
        }
        else{
            this.setDstPSDELogicNodeId(pSDELogicNode.getPSDELogicNodeId());
            this.setDstPSDELogicNodeName(pSDELogicNode.getPSDELogicNodeName());
        }
        return this;
    }

    /**
     * <B>DSTPSDELOGICNODENAME</B>&nbsp;目标节点，指定连接的目标处理节点
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DSTPSDELOGICNODEID}
     */
    public final static String FIELD_DSTPSDELOGICNODENAME = "dstpsdelogicnodename";

    /**
     * 设置 目标节点，详细说明：{@link #FIELD_DSTPSDELOGICNODENAME}
     * 
     * @param dstPSDELogicNodeName
     * 
     */
    @JsonProperty(FIELD_DSTPSDELOGICNODENAME)
    public void setDstPSDELogicNodeName(String dstPSDELogicNodeName){
        this.set(FIELD_DSTPSDELOGICNODENAME, dstPSDELogicNodeName);
    }
    
    /**
     * 获取 目标节点  
     * @return
     */
    @JsonIgnore
    public String getDstPSDELogicNodeName(){
        Object objValue = this.get(FIELD_DSTPSDELOGICNODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标节点 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDELogicNodeNameDirty(){
        if(this.contains(FIELD_DSTPSDELOGICNODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标节点
     */
    @JsonIgnore
    public void resetDstPSDELogicNodeName(){
        this.reset(FIELD_DSTPSDELOGICNODENAME);
    }

    /**
     * 设置 目标节点，详细说明：{@link #FIELD_DSTPSDELOGICNODENAME}
     * <P>
     * 等同 {@link #setDstPSDELogicNodeName}
     * @param dstPSDELogicNodeName
     */
    @JsonIgnore
    public PSDELogicLink dstpsdelogicnodename(String dstPSDELogicNodeName){
        this.setDstPSDELogicNodeName(dstPSDELogicNodeName);
        return this;
    }

    /**
     * <B>DSTPSDLPARAMID</B>&nbsp;目标参数
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDELogicParam} 
     */
    public final static String FIELD_DSTPSDLPARAMID = "dstpsdlparamid";

    /**
     * 设置 目标参数
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
     * 设置 目标参数
     * <P>
     * 等同 {@link #setDstPSDLParamId}
     * @param dstPSDLParamId
     */
    @JsonIgnore
    public PSDELogicLink dstpsdlparamid(String dstPSDLParamId){
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
    public PSDELogicLink dstpsdlparamid(PSDELogicParam pSDELogicParam){
        if(pSDELogicParam == null){
            this.setDstPSDLParamId(null);
            this.setDstPSDLParamName(null);
        }
        else{
            this.setDstPSDLParamId(pSDELogicParam.getPSDELogicParamId());
            this.setDstPSDLParamName(pSDELogicParam.getPSDELogicParamName());
        }
        return this;
    }

    /**
     * <B>DSTPSDLPARAMNAME</B>&nbsp;目标参数
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DSTPSDLPARAMID}
     */
    public final static String FIELD_DSTPSDLPARAMNAME = "dstpsdlparamname";

    /**
     * 设置 目标参数
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
     * 设置 目标参数
     * <P>
     * 等同 {@link #setDstPSDLParamName}
     * @param dstPSDLParamName
     */
    @JsonIgnore
    public PSDELogicLink dstpsdlparamname(String dstPSDLParamName){
        this.setDstPSDLParamName(dstPSDLParamName);
        return this;
    }

    /**
     * <B>LINKCOND</B>&nbsp;连接条件
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_LINKCOND = "linkcond";

    /**
     * 设置 连接条件
     * 
     * @param linkCond
     * 
     */
    @JsonProperty(FIELD_LINKCOND)
    public void setLinkCond(String linkCond){
        this.set(FIELD_LINKCOND, linkCond);
    }
    
    /**
     * 获取 连接条件  
     * @return
     */
    @JsonIgnore
    public String getLinkCond(){
        Object objValue = this.get(FIELD_LINKCOND);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 连接条件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLinkCondDirty(){
        if(this.contains(FIELD_LINKCOND)){
            return true;
        }
        return false;
    }

    /**
     * 重置 连接条件
     */
    @JsonIgnore
    public void resetLinkCond(){
        this.reset(FIELD_LINKCOND);
    }

    /**
     * 设置 连接条件
     * <P>
     * 等同 {@link #setLinkCond}
     * @param linkCond
     */
    @JsonIgnore
    public PSDELogicLink linkcond(String linkCond){
        this.setLinkCond(linkCond);
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
    public PSDELogicLink memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;排序值，指定连接的处理次序
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
    public PSDELogicLink ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSDELOGICID</B>&nbsp;实体处理逻辑，指定连接所在的处理逻辑
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDELogic} 
     */
    public final static String FIELD_PSDELOGICID = "psdelogicid";

    /**
     * 设置 实体处理逻辑，详细说明：{@link #FIELD_PSDELOGICID}
     * 
     * @param pSDELogicId
     * 
     */
    @JsonProperty(FIELD_PSDELOGICID)
    public void setPSDELogicId(String pSDELogicId){
        this.set(FIELD_PSDELOGICID, pSDELogicId);
    }
    
    /**
     * 获取 实体处理逻辑  
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
     * 判断 实体处理逻辑 是否指定值，包括空值
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
     * 重置 实体处理逻辑
     */
    @JsonIgnore
    public void resetPSDELogicId(){
        this.reset(FIELD_PSDELOGICID);
    }

    /**
     * 设置 实体处理逻辑，详细说明：{@link #FIELD_PSDELOGICID}
     * <P>
     * 等同 {@link #setPSDELogicId}
     * @param pSDELogicId
     */
    @JsonIgnore
    public PSDELogicLink psdelogicid(String pSDELogicId){
        this.setPSDELogicId(pSDELogicId);
        return this;
    }

    /**
     * 设置 实体处理逻辑，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDELogicId}
     * @param pSDELogic 引用对象
     */
    @JsonIgnore
    public PSDELogicLink psdelogicid(PSDELogic pSDELogic){
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
     * <B>PSDELOGICLINKID</B>&nbsp;实体处理逻辑连接标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDELOGICLINKID = "psdelogiclinkid";

    /**
     * 设置 实体处理逻辑连接标识
     * 
     * @param pSDELogicLinkId
     * 
     */
    @JsonProperty(FIELD_PSDELOGICLINKID)
    public void setPSDELogicLinkId(String pSDELogicLinkId){
        this.set(FIELD_PSDELOGICLINKID, pSDELogicLinkId);
    }
    
    /**
     * 获取 实体处理逻辑连接标识  
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
     * 判断 实体处理逻辑连接标识 是否指定值，包括空值
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
     * 重置 实体处理逻辑连接标识
     */
    @JsonIgnore
    public void resetPSDELogicLinkId(){
        this.reset(FIELD_PSDELOGICLINKID);
    }

    /**
     * 设置 实体处理逻辑连接标识
     * <P>
     * 等同 {@link #setPSDELogicLinkId}
     * @param pSDELogicLinkId
     */
    @JsonIgnore
    public PSDELogicLink psdelogiclinkid(String pSDELogicLinkId){
        this.setPSDELogicLinkId(pSDELogicLinkId);
        return this;
    }

    /**
     * <B>PSDELOGICLINKNAME</B>&nbsp;连接名称，逻辑连接的业务描述
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDELOGICLINKNAME = "psdelogiclinkname";

    /**
     * 设置 连接名称，详细说明：{@link #FIELD_PSDELOGICLINKNAME}
     * 
     * @param pSDELogicLinkName
     * 
     */
    @JsonProperty(FIELD_PSDELOGICLINKNAME)
    public void setPSDELogicLinkName(String pSDELogicLinkName){
        this.set(FIELD_PSDELOGICLINKNAME, pSDELogicLinkName);
    }
    
    /**
     * 获取 连接名称  
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
     * 判断 连接名称 是否指定值，包括空值
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
     * 重置 连接名称
     */
    @JsonIgnore
    public void resetPSDELogicLinkName(){
        this.reset(FIELD_PSDELOGICLINKNAME);
    }

    /**
     * 设置 连接名称，详细说明：{@link #FIELD_PSDELOGICLINKNAME}
     * <P>
     * 等同 {@link #setPSDELogicLinkName}
     * @param pSDELogicLinkName
     */
    @JsonIgnore
    public PSDELogicLink psdelogiclinkname(String pSDELogicLinkName){
        this.setPSDELogicLinkName(pSDELogicLinkName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDELogicLinkName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDELogicLinkName(strName);
    }

    @JsonIgnore
    public PSDELogicLink name(String strName){
        this.setPSDELogicLinkName(strName);
        return this;
    }

    /**
     * <B>PSDELOGICNAME</B>&nbsp;实体处理逻辑，指定连接所在的处理逻辑
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDELOGICID}
     */
    public final static String FIELD_PSDELOGICNAME = "psdelogicname";

    /**
     * 设置 实体处理逻辑，详细说明：{@link #FIELD_PSDELOGICNAME}
     * 
     * @param pSDELogicName
     * 
     */
    @JsonProperty(FIELD_PSDELOGICNAME)
    public void setPSDELogicName(String pSDELogicName){
        this.set(FIELD_PSDELOGICNAME, pSDELogicName);
    }
    
    /**
     * 获取 实体处理逻辑  
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
     * 判断 实体处理逻辑 是否指定值，包括空值
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
     * 重置 实体处理逻辑
     */
    @JsonIgnore
    public void resetPSDELogicName(){
        this.reset(FIELD_PSDELOGICNAME);
    }

    /**
     * 设置 实体处理逻辑，详细说明：{@link #FIELD_PSDELOGICNAME}
     * <P>
     * 等同 {@link #setPSDELogicName}
     * @param pSDELogicName
     */
    @JsonIgnore
    public PSDELogicLink psdelogicname(String pSDELogicName){
        this.setPSDELogicName(pSDELogicName);
        return this;
    }

    /**
     * <B>SHAPEPARAMS</B>&nbsp;形状参数
     */
    public final static String FIELD_SHAPEPARAMS = "shapeparams";

    /**
     * 设置 形状参数
     * 
     * @param shapeParams
     * 
     */
    @JsonProperty(FIELD_SHAPEPARAMS)
    public void setShapeParams(String shapeParams){
        this.set(FIELD_SHAPEPARAMS, shapeParams);
    }
    
    /**
     * 获取 形状参数  
     * @return
     */
    @JsonIgnore
    public String getShapeParams(){
        Object objValue = this.get(FIELD_SHAPEPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 形状参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isShapeParamsDirty(){
        if(this.contains(FIELD_SHAPEPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 形状参数
     */
    @JsonIgnore
    public void resetShapeParams(){
        this.reset(FIELD_SHAPEPARAMS);
    }

    /**
     * 设置 形状参数
     * <P>
     * 等同 {@link #setShapeParams}
     * @param shapeParams
     */
    @JsonIgnore
    public PSDELogicLink shapeparams(String shapeParams){
        this.setShapeParams(shapeParams);
        return this;
    }

    /**
     * <B>SRCENDPOINT</B>&nbsp;源端点
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_SRCENDPOINT = "srcendpoint";

    /**
     * 设置 源端点
     * 
     * @param srcEndPoint
     * 
     */
    @JsonProperty(FIELD_SRCENDPOINT)
    public void setSrcEndPoint(String srcEndPoint){
        this.set(FIELD_SRCENDPOINT, srcEndPoint);
    }
    
    /**
     * 获取 源端点  
     * @return
     */
    @JsonIgnore
    public String getSrcEndPoint(){
        Object objValue = this.get(FIELD_SRCENDPOINT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 源端点 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSrcEndPointDirty(){
        if(this.contains(FIELD_SRCENDPOINT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 源端点
     */
    @JsonIgnore
    public void resetSrcEndPoint(){
        this.reset(FIELD_SRCENDPOINT);
    }

    /**
     * 设置 源端点
     * <P>
     * 等同 {@link #setSrcEndPoint}
     * @param srcEndPoint
     */
    @JsonIgnore
    public PSDELogicLink srcendpoint(String srcEndPoint){
        this.setSrcEndPoint(srcEndPoint);
        return this;
    }

    /**
     * <B>SRCPSDELOGICNODEID</B>&nbsp;源节点，指定连接的源处理节点
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDELogicNode} 
     */
    public final static String FIELD_SRCPSDELOGICNODEID = "srcpsdelogicnodeid";

    /**
     * 设置 源节点，详细说明：{@link #FIELD_SRCPSDELOGICNODEID}
     * 
     * @param srcPSDELogicNodeId
     * 
     */
    @JsonProperty(FIELD_SRCPSDELOGICNODEID)
    public void setSrcPSDELogicNodeId(String srcPSDELogicNodeId){
        this.set(FIELD_SRCPSDELOGICNODEID, srcPSDELogicNodeId);
    }
    
    /**
     * 获取 源节点  
     * @return
     */
    @JsonIgnore
    public String getSrcPSDELogicNodeId(){
        Object objValue = this.get(FIELD_SRCPSDELOGICNODEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 源节点 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSrcPSDELogicNodeIdDirty(){
        if(this.contains(FIELD_SRCPSDELOGICNODEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 源节点
     */
    @JsonIgnore
    public void resetSrcPSDELogicNodeId(){
        this.reset(FIELD_SRCPSDELOGICNODEID);
    }

    /**
     * 设置 源节点，详细说明：{@link #FIELD_SRCPSDELOGICNODEID}
     * <P>
     * 等同 {@link #setSrcPSDELogicNodeId}
     * @param srcPSDELogicNodeId
     */
    @JsonIgnore
    public PSDELogicLink srcpsdelogicnodeid(String srcPSDELogicNodeId){
        this.setSrcPSDELogicNodeId(srcPSDELogicNodeId);
        return this;
    }

    /**
     * 设置 源节点，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setSrcPSDELogicNodeId}
     * @param pSDELogicNode 引用对象
     */
    @JsonIgnore
    public PSDELogicLink srcpsdelogicnodeid(PSDELogicNode pSDELogicNode){
        if(pSDELogicNode == null){
            this.setSrcPSDELogicNodeId(null);
            this.setSrcPSDELogicNodeName(null);
        }
        else{
            this.setSrcPSDELogicNodeId(pSDELogicNode.getPSDELogicNodeId());
            this.setSrcPSDELogicNodeName(pSDELogicNode.getPSDELogicNodeName());
        }
        return this;
    }

    /**
     * <B>SRCPSDELOGICNODENAME</B>&nbsp;源节点，指定连接的源处理节点
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_SRCPSDELOGICNODEID}
     */
    public final static String FIELD_SRCPSDELOGICNODENAME = "srcpsdelogicnodename";

    /**
     * 设置 源节点，详细说明：{@link #FIELD_SRCPSDELOGICNODENAME}
     * 
     * @param srcPSDELogicNodeName
     * 
     */
    @JsonProperty(FIELD_SRCPSDELOGICNODENAME)
    public void setSrcPSDELogicNodeName(String srcPSDELogicNodeName){
        this.set(FIELD_SRCPSDELOGICNODENAME, srcPSDELogicNodeName);
    }
    
    /**
     * 获取 源节点  
     * @return
     */
    @JsonIgnore
    public String getSrcPSDELogicNodeName(){
        Object objValue = this.get(FIELD_SRCPSDELOGICNODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 源节点 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSrcPSDELogicNodeNameDirty(){
        if(this.contains(FIELD_SRCPSDELOGICNODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 源节点
     */
    @JsonIgnore
    public void resetSrcPSDELogicNodeName(){
        this.reset(FIELD_SRCPSDELOGICNODENAME);
    }

    /**
     * 设置 源节点，详细说明：{@link #FIELD_SRCPSDELOGICNODENAME}
     * <P>
     * 等同 {@link #setSrcPSDELogicNodeName}
     * @param srcPSDELogicNodeName
     */
    @JsonIgnore
    public PSDELogicLink srcpsdelogicnodename(String srcPSDELogicNodeName){
        this.setSrcPSDELogicNodeName(srcPSDELogicNodeName);
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
    public PSDELogicLink updatedate(String updateDate){
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
    public PSDELogicLink updateman(String updateMan){
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
    public PSDELogicLink usercat(String userCat){
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
    public PSDELogicLink usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDELogicLink usertag(String userTag){
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
    public PSDELogicLink usertag2(String userTag2){
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
    public PSDELogicLink usertag3(String userTag3){
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
    public PSDELogicLink usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDELogicLinkId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDELogicLinkId(strValue);
    }

    @JsonIgnore
    public PSDELogicLink id(String strValue){
        this.setPSDELogicLinkId(strValue);
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
        if(iPSModel instanceof PSDELogicLink){
            PSDELogicLink model = (PSDELogicLink)iPSModel;
            model.setPSDELLConds(this.getPSDELLConds());
        }
        super.copyTo(iPSModel);
    }
}
