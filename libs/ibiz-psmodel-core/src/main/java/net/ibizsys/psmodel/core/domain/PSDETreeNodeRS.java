package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDETREENODERS</B>树节点关系 模型传输对象
 * <P>
 * 树数据节点关系模型，定义树节点之间的关系。树视图默认从根节点开始加载，后续按树节点关系逻辑展开加载
 */
public class PSDETreeNodeRS extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDETreeNodeRS(){
        this.setValidFlag(1);
    }      

    /**
     * <B>CHILDFILTER</B>&nbsp;子节点过滤项，指定树节点关系处理时的子节点查询时父值的过滤项名称
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_CHILDFILTER = "childfilter";

    /**
     * 设置 子节点过滤项，详细说明：{@link #FIELD_CHILDFILTER}
     * 
     * @param childFilter
     * 
     */
    @JsonProperty(FIELD_CHILDFILTER)
    public void setChildFilter(String childFilter){
        this.set(FIELD_CHILDFILTER, childFilter);
    }
    
    /**
     * 获取 子节点过滤项  
     * @return
     */
    @JsonIgnore
    public String getChildFilter(){
        Object objValue = this.get(FIELD_CHILDFILTER);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 子节点过滤项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isChildFilterDirty(){
        if(this.contains(FIELD_CHILDFILTER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 子节点过滤项
     */
    @JsonIgnore
    public void resetChildFilter(){
        this.reset(FIELD_CHILDFILTER);
    }

    /**
     * 设置 子节点过滤项，详细说明：{@link #FIELD_CHILDFILTER}
     * <P>
     * 等同 {@link #setChildFilter}
     * @param childFilter
     */
    @JsonIgnore
    public PSDETreeNodeRS childfilter(String childFilter){
        this.setChildFilter(childFilter);
        return this;
    }

    /**
     * <B>CPSDETREENODEID</B>&nbsp;子节点，指定树节点关系的子节点对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDETreeNode} 
     */
    public final static String FIELD_CPSDETREENODEID = "cpsdetreenodeid";

    /**
     * 设置 子节点，详细说明：{@link #FIELD_CPSDETREENODEID}
     * 
     * @param cPSDETreeNodeId
     * 
     */
    @JsonProperty(FIELD_CPSDETREENODEID)
    public void setCPSDETreeNodeId(String cPSDETreeNodeId){
        this.set(FIELD_CPSDETREENODEID, cPSDETreeNodeId);
    }
    
    /**
     * 获取 子节点  
     * @return
     */
    @JsonIgnore
    public String getCPSDETreeNodeId(){
        Object objValue = this.get(FIELD_CPSDETREENODEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 子节点 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCPSDETreeNodeIdDirty(){
        if(this.contains(FIELD_CPSDETREENODEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 子节点
     */
    @JsonIgnore
    public void resetCPSDETreeNodeId(){
        this.reset(FIELD_CPSDETREENODEID);
    }

    /**
     * 设置 子节点，详细说明：{@link #FIELD_CPSDETREENODEID}
     * <P>
     * 等同 {@link #setCPSDETreeNodeId}
     * @param cPSDETreeNodeId
     */
    @JsonIgnore
    public PSDETreeNodeRS cpsdetreenodeid(String cPSDETreeNodeId){
        this.setCPSDETreeNodeId(cPSDETreeNodeId);
        return this;
    }

    /**
     * 设置 子节点，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setCPSDETreeNodeId}
     * @param pSDETreeNode 引用对象
     */
    @JsonIgnore
    public PSDETreeNodeRS cpsdetreenodeid(PSDETreeNode pSDETreeNode){
        if(pSDETreeNode == null){
            this.setCPSDETreeNodeId(null);
            this.setCPSDETreeNodeName(null);
        }
        else{
            this.setCPSDETreeNodeId(pSDETreeNode.getPSDETreeNodeId());
            this.setCPSDETreeNodeName(pSDETreeNode.getPSDETreeNodeName());
        }
        return this;
    }

    /**
     * <B>CPSDETREENODENAME</B>&nbsp;子节点，指定树节点关系的子节点对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CPSDETREENODEID}
     */
    public final static String FIELD_CPSDETREENODENAME = "cpsdetreenodename";

    /**
     * 设置 子节点，详细说明：{@link #FIELD_CPSDETREENODENAME}
     * 
     * @param cPSDETreeNodeName
     * 
     */
    @JsonProperty(FIELD_CPSDETREENODENAME)
    public void setCPSDETreeNodeName(String cPSDETreeNodeName){
        this.set(FIELD_CPSDETREENODENAME, cPSDETreeNodeName);
    }
    
    /**
     * 获取 子节点  
     * @return
     */
    @JsonIgnore
    public String getCPSDETreeNodeName(){
        Object objValue = this.get(FIELD_CPSDETREENODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 子节点 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCPSDETreeNodeNameDirty(){
        if(this.contains(FIELD_CPSDETREENODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 子节点
     */
    @JsonIgnore
    public void resetCPSDETreeNodeName(){
        this.reset(FIELD_CPSDETREENODENAME);
    }

    /**
     * 设置 子节点，详细说明：{@link #FIELD_CPSDETREENODENAME}
     * <P>
     * 等同 {@link #setCPSDETreeNodeName}
     * @param cPSDETreeNodeName
     */
    @JsonIgnore
    public PSDETreeNodeRS cpsdetreenodename(String cPSDETreeNodeName){
        this.setCPSDETreeNodeName(cPSDETreeNodeName);
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
    public PSDETreeNodeRS createdate(String createDate){
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
    public PSDETreeNodeRS createman(String createMan){
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
    public PSDETreeNodeRS customcode(String customCode){
        this.setCustomCode(customCode);
        return this;
    }

    /**
     * <B>CUSTOMMODE</B>&nbsp;自定义模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_CUSTOMMODE = "custommode";

    /**
     * 设置 自定义模式
     * 
     * @param customMode
     * 
     */
    @JsonProperty(FIELD_CUSTOMMODE)
    public void setCustomMode(Integer customMode){
        this.set(FIELD_CUSTOMMODE, customMode);
    }
    
    /**
     * 获取 自定义模式  
     * @return
     */
    @JsonIgnore
    public Integer getCustomMode(){
        Object objValue = this.get(FIELD_CUSTOMMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 自定义模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomModeDirty(){
        if(this.contains(FIELD_CUSTOMMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义模式
     */
    @JsonIgnore
    public void resetCustomMode(){
        this.reset(FIELD_CUSTOMMODE);
    }

    /**
     * 设置 自定义模式
     * <P>
     * 等同 {@link #setCustomMode}
     * @param customMode
     */
    @JsonIgnore
    public PSDETreeNodeRS custommode(Integer customMode){
        this.setCustomMode(customMode);
        return this;
    }

     /**
     * 设置 自定义模式
     * <P>
     * 等同 {@link #setCustomMode}
     * @param customMode
     */
    @JsonIgnore
    public PSDETreeNodeRS custommode(Boolean customMode){
        if(customMode == null){
            this.setCustomMode(null);
        }
        else{
            this.setCustomMode(customMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSDETreeNodeRS memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;排序值，指定树节点关系的处理次序
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
    public PSDETreeNodeRS ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PPSDETREENODEID</B>&nbsp;父节点，指定树节点关系的父节点对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDETreeNode} 
     */
    public final static String FIELD_PPSDETREENODEID = "ppsdetreenodeid";

    /**
     * 设置 父节点，详细说明：{@link #FIELD_PPSDETREENODEID}
     * 
     * @param pPSDETreeNodeId
     * 
     */
    @JsonProperty(FIELD_PPSDETREENODEID)
    public void setPPSDETreeNodeId(String pPSDETreeNodeId){
        this.set(FIELD_PPSDETREENODEID, pPSDETreeNodeId);
    }
    
    /**
     * 获取 父节点  
     * @return
     */
    @JsonIgnore
    public String getPPSDETreeNodeId(){
        Object objValue = this.get(FIELD_PPSDETREENODEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父节点 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSDETreeNodeIdDirty(){
        if(this.contains(FIELD_PPSDETREENODEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父节点
     */
    @JsonIgnore
    public void resetPPSDETreeNodeId(){
        this.reset(FIELD_PPSDETREENODEID);
    }

    /**
     * 设置 父节点，详细说明：{@link #FIELD_PPSDETREENODEID}
     * <P>
     * 等同 {@link #setPPSDETreeNodeId}
     * @param pPSDETreeNodeId
     */
    @JsonIgnore
    public PSDETreeNodeRS ppsdetreenodeid(String pPSDETreeNodeId){
        this.setPPSDETreeNodeId(pPSDETreeNodeId);
        return this;
    }

    /**
     * 设置 父节点，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPPSDETreeNodeId}
     * @param pSDETreeNode 引用对象
     */
    @JsonIgnore
    public PSDETreeNodeRS ppsdetreenodeid(PSDETreeNode pSDETreeNode){
        if(pSDETreeNode == null){
            this.setPPSDETreeNodeId(null);
            this.setPPSDETreeNodeName(null);
        }
        else{
            this.setPPSDETreeNodeId(pSDETreeNode.getPSDETreeNodeId());
            this.setPPSDETreeNodeName(pSDETreeNode.getPSDETreeNodeName());
        }
        return this;
    }

    /**
     * <B>PPSDETREENODENAME</B>&nbsp;父节点，指定树节点关系的父节点对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PPSDETREENODEID}
     */
    public final static String FIELD_PPSDETREENODENAME = "ppsdetreenodename";

    /**
     * 设置 父节点，详细说明：{@link #FIELD_PPSDETREENODENAME}
     * 
     * @param pPSDETreeNodeName
     * 
     */
    @JsonProperty(FIELD_PPSDETREENODENAME)
    public void setPPSDETreeNodeName(String pPSDETreeNodeName){
        this.set(FIELD_PPSDETREENODENAME, pPSDETreeNodeName);
    }
    
    /**
     * 获取 父节点  
     * @return
     */
    @JsonIgnore
    public String getPPSDETreeNodeName(){
        Object objValue = this.get(FIELD_PPSDETREENODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父节点 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSDETreeNodeNameDirty(){
        if(this.contains(FIELD_PPSDETREENODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父节点
     */
    @JsonIgnore
    public void resetPPSDETreeNodeName(){
        this.reset(FIELD_PPSDETREENODENAME);
    }

    /**
     * 设置 父节点，详细说明：{@link #FIELD_PPSDETREENODENAME}
     * <P>
     * 等同 {@link #setPPSDETreeNodeName}
     * @param pPSDETreeNodeName
     */
    @JsonIgnore
    public PSDETreeNodeRS ppsdetreenodename(String pPSDETreeNodeName){
        this.setPPSDETreeNodeName(pPSDETreeNodeName);
        return this;
    }

    /**
     * <B>PROCESSPARAM</B>&nbsp;处理参数
     */
    public final static String FIELD_PROCESSPARAM = "processparam";

    /**
     * 设置 处理参数
     * 
     * @param processParam
     * 
     */
    @JsonProperty(FIELD_PROCESSPARAM)
    public void setProcessParam(String processParam){
        this.set(FIELD_PROCESSPARAM, processParam);
    }
    
    /**
     * 获取 处理参数  
     * @return
     */
    @JsonIgnore
    public String getProcessParam(){
        Object objValue = this.get(FIELD_PROCESSPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 处理参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isProcessParamDirty(){
        if(this.contains(FIELD_PROCESSPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 处理参数
     */
    @JsonIgnore
    public void resetProcessParam(){
        this.reset(FIELD_PROCESSPARAM);
    }

    /**
     * 设置 处理参数
     * <P>
     * 等同 {@link #setProcessParam}
     * @param processParam
     */
    @JsonIgnore
    public PSDETreeNodeRS processparam(String processParam){
        this.setProcessParam(processParam);
        return this;
    }

    /**
     * <B>PSDEACTIONID</B>&nbsp;过滤实体行为，指定树节点关系判断输出的实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_PSDEACTIONID = "psdeactionid";

    /**
     * 设置 过滤实体行为，详细说明：{@link #FIELD_PSDEACTIONID}
     * 
     * @param pSDEActionId
     * 
     */
    @JsonProperty(FIELD_PSDEACTIONID)
    public void setPSDEActionId(String pSDEActionId){
        this.set(FIELD_PSDEACTIONID, pSDEActionId);
    }
    
    /**
     * 获取 过滤实体行为  
     * @return
     */
    @JsonIgnore
    public String getPSDEActionId(){
        Object objValue = this.get(FIELD_PSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 过滤实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEActionIdDirty(){
        if(this.contains(FIELD_PSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 过滤实体行为
     */
    @JsonIgnore
    public void resetPSDEActionId(){
        this.reset(FIELD_PSDEACTIONID);
    }

    /**
     * 设置 过滤实体行为，详细说明：{@link #FIELD_PSDEACTIONID}
     * <P>
     * 等同 {@link #setPSDEActionId}
     * @param pSDEActionId
     */
    @JsonIgnore
    public PSDETreeNodeRS psdeactionid(String pSDEActionId){
        this.setPSDEActionId(pSDEActionId);
        return this;
    }

    /**
     * 设置 过滤实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDETreeNodeRS psdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setPSDEActionId(null);
            this.setPSDEActionName(null);
        }
        else{
            this.setPSDEActionId(pSDEAction.getPSDEActionId());
            this.setPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>PSDEACTIONNAME</B>&nbsp;过滤实体行为，指定树节点关系判断输出的实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEACTIONID}
     */
    public final static String FIELD_PSDEACTIONNAME = "psdeactionname";

    /**
     * 设置 过滤实体行为，详细说明：{@link #FIELD_PSDEACTIONNAME}
     * 
     * @param pSDEActionName
     * 
     */
    @JsonProperty(FIELD_PSDEACTIONNAME)
    public void setPSDEActionName(String pSDEActionName){
        this.set(FIELD_PSDEACTIONNAME, pSDEActionName);
    }
    
    /**
     * 获取 过滤实体行为  
     * @return
     */
    @JsonIgnore
    public String getPSDEActionName(){
        Object objValue = this.get(FIELD_PSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 过滤实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEActionNameDirty(){
        if(this.contains(FIELD_PSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 过滤实体行为
     */
    @JsonIgnore
    public void resetPSDEActionName(){
        this.reset(FIELD_PSDEACTIONNAME);
    }

    /**
     * 设置 过滤实体行为，详细说明：{@link #FIELD_PSDEACTIONNAME}
     * <P>
     * 等同 {@link #setPSDEActionName}
     * @param pSDEActionName
     */
    @JsonIgnore
    public PSDETreeNodeRS psdeactionname(String pSDEActionName){
        this.setPSDEActionName(pSDEActionName);
        return this;
    }

    /**
     * <B>PSDERID</B>&nbsp;实体关系，指定树节点关系相关的实体1:N关系对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDER} 
     */
    public final static String FIELD_PSDERID = "psderid";

    /**
     * 设置 实体关系，详细说明：{@link #FIELD_PSDERID}
     * 
     * @param pSDERId
     * 
     */
    @JsonProperty(FIELD_PSDERID)
    public void setPSDERId(String pSDERId){
        this.set(FIELD_PSDERID, pSDERId);
    }
    
    /**
     * 获取 实体关系  
     * @return
     */
    @JsonIgnore
    public String getPSDERId(){
        Object objValue = this.get(FIELD_PSDERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDERIdDirty(){
        if(this.contains(FIELD_PSDERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体关系
     */
    @JsonIgnore
    public void resetPSDERId(){
        this.reset(FIELD_PSDERID);
    }

    /**
     * 设置 实体关系，详细说明：{@link #FIELD_PSDERID}
     * <P>
     * 等同 {@link #setPSDERId}
     * @param pSDERId
     */
    @JsonIgnore
    public PSDETreeNodeRS psderid(String pSDERId){
        this.setPSDERId(pSDERId);
        return this;
    }

    /**
     * 设置 实体关系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDERId}
     * @param pSDER 引用对象
     */
    @JsonIgnore
    public PSDETreeNodeRS psderid(PSDER pSDER){
        if(pSDER == null){
            this.setPSDERId(null);
            this.setPSDERName(null);
        }
        else{
            this.setPSDERId(pSDER.getPSDERId());
            this.setPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    /**
     * <B>PSDERNAME</B>&nbsp;实体关系，指定树节点关系相关的实体1:N关系对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDERID}
     */
    public final static String FIELD_PSDERNAME = "psdername";

    /**
     * 设置 实体关系，详细说明：{@link #FIELD_PSDERNAME}
     * 
     * @param pSDERName
     * 
     */
    @JsonProperty(FIELD_PSDERNAME)
    public void setPSDERName(String pSDERName){
        this.set(FIELD_PSDERNAME, pSDERName);
    }
    
    /**
     * 获取 实体关系  
     * @return
     */
    @JsonIgnore
    public String getPSDERName(){
        Object objValue = this.get(FIELD_PSDERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDERNameDirty(){
        if(this.contains(FIELD_PSDERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体关系
     */
    @JsonIgnore
    public void resetPSDERName(){
        this.reset(FIELD_PSDERNAME);
    }

    /**
     * 设置 实体关系，详细说明：{@link #FIELD_PSDERNAME}
     * <P>
     * 等同 {@link #setPSDERName}
     * @param pSDERName
     */
    @JsonIgnore
    public PSDETreeNodeRS psdername(String pSDERName){
        this.setPSDERName(pSDERName);
        return this;
    }

    /**
     * <B>PSDETREENODERSID</B>&nbsp;实体树节点关系标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDETREENODERSID = "psdetreenodersid";

    /**
     * 设置 实体树节点关系标识
     * 
     * @param pSDETreeNodeRSId
     * 
     */
    @JsonProperty(FIELD_PSDETREENODERSID)
    public void setPSDETreeNodeRSId(String pSDETreeNodeRSId){
        this.set(FIELD_PSDETREENODERSID, pSDETreeNodeRSId);
    }
    
    /**
     * 获取 实体树节点关系标识  
     * @return
     */
    @JsonIgnore
    public String getPSDETreeNodeRSId(){
        Object objValue = this.get(FIELD_PSDETREENODERSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体树节点关系标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDETreeNodeRSIdDirty(){
        if(this.contains(FIELD_PSDETREENODERSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体树节点关系标识
     */
    @JsonIgnore
    public void resetPSDETreeNodeRSId(){
        this.reset(FIELD_PSDETREENODERSID);
    }

    /**
     * 设置 实体树节点关系标识
     * <P>
     * 等同 {@link #setPSDETreeNodeRSId}
     * @param pSDETreeNodeRSId
     */
    @JsonIgnore
    public PSDETreeNodeRS psdetreenodersid(String pSDETreeNodeRSId){
        this.setPSDETreeNodeRSId(pSDETreeNodeRSId);
        return this;
    }

    /**
     * <B>PSDETREENODERSNAME</B>&nbsp;实体树节点关系名称，指定实体树节点关系的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDETREENODERSNAME = "psdetreenodersname";

    /**
     * 设置 实体树节点关系名称，详细说明：{@link #FIELD_PSDETREENODERSNAME}
     * 
     * @param pSDETreeNodeRSName
     * 
     */
    @JsonProperty(FIELD_PSDETREENODERSNAME)
    public void setPSDETreeNodeRSName(String pSDETreeNodeRSName){
        this.set(FIELD_PSDETREENODERSNAME, pSDETreeNodeRSName);
    }
    
    /**
     * 获取 实体树节点关系名称  
     * @return
     */
    @JsonIgnore
    public String getPSDETreeNodeRSName(){
        Object objValue = this.get(FIELD_PSDETREENODERSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体树节点关系名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDETreeNodeRSNameDirty(){
        if(this.contains(FIELD_PSDETREENODERSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体树节点关系名称
     */
    @JsonIgnore
    public void resetPSDETreeNodeRSName(){
        this.reset(FIELD_PSDETREENODERSNAME);
    }

    /**
     * 设置 实体树节点关系名称，详细说明：{@link #FIELD_PSDETREENODERSNAME}
     * <P>
     * 等同 {@link #setPSDETreeNodeRSName}
     * @param pSDETreeNodeRSName
     */
    @JsonIgnore
    public PSDETreeNodeRS psdetreenodersname(String pSDETreeNodeRSName){
        this.setPSDETreeNodeRSName(pSDETreeNodeRSName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDETreeNodeRSName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDETreeNodeRSName(strName);
    }

    @JsonIgnore
    public PSDETreeNodeRS name(String strName){
        this.setPSDETreeNodeRSName(strName);
        return this;
    }

    /**
     * <B>PSDETREEVIEWID</B>&nbsp;实体树视图，指定树节点关系所在的树视图对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDETreeView} 
     */
    public final static String FIELD_PSDETREEVIEWID = "psdetreeviewid";

    /**
     * 设置 实体树视图，详细说明：{@link #FIELD_PSDETREEVIEWID}
     * 
     * @param pSDETreeViewId
     * 
     */
    @JsonProperty(FIELD_PSDETREEVIEWID)
    public void setPSDETreeViewId(String pSDETreeViewId){
        this.set(FIELD_PSDETREEVIEWID, pSDETreeViewId);
    }
    
    /**
     * 获取 实体树视图  
     * @return
     */
    @JsonIgnore
    public String getPSDETreeViewId(){
        Object objValue = this.get(FIELD_PSDETREEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体树视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDETreeViewIdDirty(){
        if(this.contains(FIELD_PSDETREEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体树视图
     */
    @JsonIgnore
    public void resetPSDETreeViewId(){
        this.reset(FIELD_PSDETREEVIEWID);
    }

    /**
     * 设置 实体树视图，详细说明：{@link #FIELD_PSDETREEVIEWID}
     * <P>
     * 等同 {@link #setPSDETreeViewId}
     * @param pSDETreeViewId
     */
    @JsonIgnore
    public PSDETreeNodeRS psdetreeviewid(String pSDETreeViewId){
        this.setPSDETreeViewId(pSDETreeViewId);
        return this;
    }

    /**
     * 设置 实体树视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDETreeViewId}
     * @param pSDETreeView 引用对象
     */
    @JsonIgnore
    public PSDETreeNodeRS psdetreeviewid(PSDETreeView pSDETreeView){
        if(pSDETreeView == null){
            this.setPSDETreeViewId(null);
            this.setPSDETreeViewName(null);
        }
        else{
            this.setPSDETreeViewId(pSDETreeView.getPSDETreeViewId());
            this.setPSDETreeViewName(pSDETreeView.getPSDETreeViewName());
        }
        return this;
    }

    /**
     * <B>PSDETREEVIEWNAME</B>&nbsp;实体树视图，指定树节点关系所在的树视图对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDETREEVIEWID}
     */
    public final static String FIELD_PSDETREEVIEWNAME = "psdetreeviewname";

    /**
     * 设置 实体树视图，详细说明：{@link #FIELD_PSDETREEVIEWNAME}
     * 
     * @param pSDETreeViewName
     * 
     */
    @JsonProperty(FIELD_PSDETREEVIEWNAME)
    public void setPSDETreeViewName(String pSDETreeViewName){
        this.set(FIELD_PSDETREEVIEWNAME, pSDETreeViewName);
    }
    
    /**
     * 获取 实体树视图  
     * @return
     */
    @JsonIgnore
    public String getPSDETreeViewName(){
        Object objValue = this.get(FIELD_PSDETREEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体树视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDETreeViewNameDirty(){
        if(this.contains(FIELD_PSDETREEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体树视图
     */
    @JsonIgnore
    public void resetPSDETreeViewName(){
        this.reset(FIELD_PSDETREEVIEWNAME);
    }

    /**
     * 设置 实体树视图，详细说明：{@link #FIELD_PSDETREEVIEWNAME}
     * <P>
     * 等同 {@link #setPSDETreeViewName}
     * @param pSDETreeViewName
     */
    @JsonIgnore
    public PSDETreeNodeRS psdetreeviewname(String pSDETreeViewName){
        this.setPSDETreeViewName(pSDETreeViewName);
        return this;
    }

    /**
     * <B>PVALUELEVEL</B>&nbsp;关系父值节点，指定树节点关系在计算子节点时传入的父值模式，未定义时为【上一级】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.TreeNodeRSPValueLevel} 
     */
    public final static String FIELD_PVALUELEVEL = "pvaluelevel";

    /**
     * 设置 关系父值节点，详细说明：{@link #FIELD_PVALUELEVEL}
     * 
     * @param pValueLevel
     * 
     */
    @JsonProperty(FIELD_PVALUELEVEL)
    public void setPValueLevel(Integer pValueLevel){
        this.set(FIELD_PVALUELEVEL, pValueLevel);
    }
    
    /**
     * 获取 关系父值节点  
     * @return
     */
    @JsonIgnore
    public Integer getPValueLevel(){
        Object objValue = this.get(FIELD_PVALUELEVEL);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 关系父值节点 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPValueLevelDirty(){
        if(this.contains(FIELD_PVALUELEVEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系父值节点
     */
    @JsonIgnore
    public void resetPValueLevel(){
        this.reset(FIELD_PVALUELEVEL);
    }

    /**
     * 设置 关系父值节点，详细说明：{@link #FIELD_PVALUELEVEL}
     * <P>
     * 等同 {@link #setPValueLevel}
     * @param pValueLevel
     */
    @JsonIgnore
    public PSDETreeNodeRS pvaluelevel(Integer pValueLevel){
        this.setPValueLevel(pValueLevel);
        return this;
    }

     /**
     * 设置 关系父值节点，详细说明：{@link #FIELD_PVALUELEVEL}
     * <P>
     * 等同 {@link #setPValueLevel}
     * @param pValueLevel
     */
    @JsonIgnore
    public PSDETreeNodeRS pvaluelevel(net.ibizsys.psmodel.core.util.PSModelEnums.TreeNodeRSPValueLevel pValueLevel){
        if(pValueLevel == null){
            this.setPValueLevel(null);
        }
        else{
            this.setPValueLevel(pValueLevel.value);
        }
        return this;
    }

    /**
     * <B>SEARCHMODE</B>&nbsp;支持搜索模式，指定树节点关系支持的搜索模式，未定义时为【全部启用】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.TreeNodeRSSearchMode} 
     */
    public final static String FIELD_SEARCHMODE = "searchmode";

    /**
     * 设置 支持搜索模式，详细说明：{@link #FIELD_SEARCHMODE}
     * 
     * @param searchMode
     * 
     */
    @JsonProperty(FIELD_SEARCHMODE)
    public void setSearchMode(Integer searchMode){
        this.set(FIELD_SEARCHMODE, searchMode);
    }
    
    /**
     * 获取 支持搜索模式  
     * @return
     */
    @JsonIgnore
    public Integer getSearchMode(){
        Object objValue = this.get(FIELD_SEARCHMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持搜索模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSearchModeDirty(){
        if(this.contains(FIELD_SEARCHMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持搜索模式
     */
    @JsonIgnore
    public void resetSearchMode(){
        this.reset(FIELD_SEARCHMODE);
    }

    /**
     * 设置 支持搜索模式，详细说明：{@link #FIELD_SEARCHMODE}
     * <P>
     * 等同 {@link #setSearchMode}
     * @param searchMode
     */
    @JsonIgnore
    public PSDETreeNodeRS searchmode(Integer searchMode){
        this.setSearchMode(searchMode);
        return this;
    }

     /**
     * 设置 支持搜索模式，详细说明：{@link #FIELD_SEARCHMODE}
     * <P>
     * 等同 {@link #setSearchMode}
     * @param searchMode
     */
    @JsonIgnore
    public PSDETreeNodeRS searchmode(net.ibizsys.psmodel.core.util.PSModelEnums.TreeNodeRSSearchMode searchMode){
        if(searchMode == null){
            this.setSearchMode(null);
        }
        else{
            this.setSearchMode(searchMode.value);
        }
        return this;
    }

    /**
     * <B>TYPEFILTER</B>&nbsp;类型过滤项
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_TYPEFILTER = "typefilter";

    /**
     * 设置 类型过滤项
     * 
     * @param typeFilter
     * 
     */
    @JsonProperty(FIELD_TYPEFILTER)
    public void setTypeFilter(String typeFilter){
        this.set(FIELD_TYPEFILTER, typeFilter);
    }
    
    /**
     * 获取 类型过滤项  
     * @return
     */
    @JsonIgnore
    public String getTypeFilter(){
        Object objValue = this.get(FIELD_TYPEFILTER);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 类型过滤项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTypeFilterDirty(){
        if(this.contains(FIELD_TYPEFILTER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 类型过滤项
     */
    @JsonIgnore
    public void resetTypeFilter(){
        this.reset(FIELD_TYPEFILTER);
    }

    /**
     * 设置 类型过滤项
     * <P>
     * 等同 {@link #setTypeFilter}
     * @param typeFilter
     */
    @JsonIgnore
    public PSDETreeNodeRS typefilter(String typeFilter){
        this.setTypeFilter(typeFilter);
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
    public PSDETreeNodeRS updatedate(String updateDate){
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
    public PSDETreeNodeRS updateman(String updateMan){
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
    public PSDETreeNodeRS usercat(String userCat){
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
    public PSDETreeNodeRS usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDETreeNodeRS usertag(String userTag){
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
    public PSDETreeNodeRS usertag2(String userTag2){
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
    public PSDETreeNodeRS usertag3(String userTag3){
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
    public PSDETreeNodeRS usertag4(String userTag4){
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
    public PSDETreeNodeRS validflag(Integer validFlag){
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
    public PSDETreeNodeRS validflag(Boolean validFlag){
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
        return this.getPSDETreeNodeRSId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDETreeNodeRSId(strValue);
    }

    @JsonIgnore
    public PSDETreeNodeRS id(String strValue){
        this.setPSDETreeNodeRSId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDETreeNodeRS){
            PSDETreeNodeRS model = (PSDETreeNodeRS)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
