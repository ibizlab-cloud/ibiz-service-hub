package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEUAGROUPDETAIL</B>界面行为组成员 模型传输对象
 * <P>
 * 界面行为组成员模型，将界面行为加入到行为组中，每个界面行为只能被添加一次
 */
public class PSDEUAGroupDetail extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEUAGroupDetail(){
        this.setValidFlag(1);
    }      

    /**
     * <B>ACTIONLEVEL</B>&nbsp;行为级别，指定界面行为组成员的行为级别，行为级别用于定义界面行为的重要性，未定义时为【一般操作】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.UIActionLevel} 
     */
    public final static String FIELD_ACTIONLEVEL = "actionlevel";

    /**
     * 设置 行为级别，详细说明：{@link #FIELD_ACTIONLEVEL}
     * 
     * @param actionLevel
     * 
     */
    @JsonProperty(FIELD_ACTIONLEVEL)
    public void setActionLevel(Integer actionLevel){
        this.set(FIELD_ACTIONLEVEL, actionLevel);
    }
    
    /**
     * 获取 行为级别  
     * @return
     */
    @JsonIgnore
    public Integer getActionLevel(){
        Object objValue = this.get(FIELD_ACTIONLEVEL);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 行为级别 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionLevelDirty(){
        if(this.contains(FIELD_ACTIONLEVEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 行为级别
     */
    @JsonIgnore
    public void resetActionLevel(){
        this.reset(FIELD_ACTIONLEVEL);
    }

    /**
     * 设置 行为级别，详细说明：{@link #FIELD_ACTIONLEVEL}
     * <P>
     * 等同 {@link #setActionLevel}
     * @param actionLevel
     */
    @JsonIgnore
    public PSDEUAGroupDetail actionlevel(Integer actionLevel){
        this.setActionLevel(actionLevel);
        return this;
    }

     /**
     * 设置 行为级别，详细说明：{@link #FIELD_ACTIONLEVEL}
     * <P>
     * 等同 {@link #setActionLevel}
     * @param actionLevel
     */
    @JsonIgnore
    public PSDEUAGroupDetail actionlevel(net.ibizsys.psmodel.core.util.PSModelEnums.UIActionLevel actionLevel){
        if(actionLevel == null){
            this.setActionLevel(null);
        }
        else{
            this.setActionLevel(actionLevel.value);
        }
        return this;
    }

    /**
     * <B>ADDSEPARATOR</B>&nbsp;增加分隔栏，指定输出界面行为时是否先输出分隔栏，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ADDSEPARATOR = "addseparator";

    /**
     * 设置 增加分隔栏，详细说明：{@link #FIELD_ADDSEPARATOR}
     * 
     * @param addSeparator
     * 
     */
    @JsonProperty(FIELD_ADDSEPARATOR)
    public void setAddSeparator(Integer addSeparator){
        this.set(FIELD_ADDSEPARATOR, addSeparator);
    }
    
    /**
     * 获取 增加分隔栏  
     * @return
     */
    @JsonIgnore
    public Integer getAddSeparator(){
        Object objValue = this.get(FIELD_ADDSEPARATOR);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 增加分隔栏 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAddSeparatorDirty(){
        if(this.contains(FIELD_ADDSEPARATOR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 增加分隔栏
     */
    @JsonIgnore
    public void resetAddSeparator(){
        this.reset(FIELD_ADDSEPARATOR);
    }

    /**
     * 设置 增加分隔栏，详细说明：{@link #FIELD_ADDSEPARATOR}
     * <P>
     * 等同 {@link #setAddSeparator}
     * @param addSeparator
     */
    @JsonIgnore
    public PSDEUAGroupDetail addseparator(Integer addSeparator){
        this.setAddSeparator(addSeparator);
        return this;
    }

     /**
     * 设置 增加分隔栏，详细说明：{@link #FIELD_ADDSEPARATOR}
     * <P>
     * 等同 {@link #setAddSeparator}
     * @param addSeparator
     */
    @JsonIgnore
    public PSDEUAGroupDetail addseparator(Boolean addSeparator){
        if(addSeparator == null){
            this.setAddSeparator(null);
        }
        else{
            this.setAddSeparator(addSeparator?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>AFTERCONTENT</B>&nbsp;后置内容
     */
    public final static String FIELD_AFTERCONTENT = "aftercontent";

    /**
     * 设置 后置内容
     * 
     * @param afterContent
     * 
     */
    @JsonProperty(FIELD_AFTERCONTENT)
    public void setAfterContent(String afterContent){
        this.set(FIELD_AFTERCONTENT, afterContent);
    }
    
    /**
     * 获取 后置内容  
     * @return
     */
    @JsonIgnore
    public String getAfterContent(){
        Object objValue = this.get(FIELD_AFTERCONTENT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后置内容 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAfterContentDirty(){
        if(this.contains(FIELD_AFTERCONTENT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后置内容
     */
    @JsonIgnore
    public void resetAfterContent(){
        this.reset(FIELD_AFTERCONTENT);
    }

    /**
     * 设置 后置内容
     * <P>
     * 等同 {@link #setAfterContent}
     * @param afterContent
     */
    @JsonIgnore
    public PSDEUAGroupDetail aftercontent(String afterContent){
        this.setAfterContent(afterContent);
        return this;
    }

    /**
     * <B>AFTERITEMTYPE</B>&nbsp;后置内容类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.UAGroupDetailAppendItemType} 
     */
    public final static String FIELD_AFTERITEMTYPE = "afteritemtype";

    /**
     * 设置 后置内容类型
     * 
     * @param afterItemType
     * 
     */
    @JsonProperty(FIELD_AFTERITEMTYPE)
    public void setAfterItemType(String afterItemType){
        this.set(FIELD_AFTERITEMTYPE, afterItemType);
    }
    
    /**
     * 获取 后置内容类型  
     * @return
     */
    @JsonIgnore
    public String getAfterItemType(){
        Object objValue = this.get(FIELD_AFTERITEMTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后置内容类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAfterItemTypeDirty(){
        if(this.contains(FIELD_AFTERITEMTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后置内容类型
     */
    @JsonIgnore
    public void resetAfterItemType(){
        this.reset(FIELD_AFTERITEMTYPE);
    }

    /**
     * 设置 后置内容类型
     * <P>
     * 等同 {@link #setAfterItemType}
     * @param afterItemType
     */
    @JsonIgnore
    public PSDEUAGroupDetail afteritemtype(String afterItemType){
        this.setAfterItemType(afterItemType);
        return this;
    }

     /**
     * 设置 后置内容类型
     * <P>
     * 等同 {@link #setAfterItemType}
     * @param afterItemType
     */
    @JsonIgnore
    public PSDEUAGroupDetail afteritemtype(net.ibizsys.psmodel.core.util.PSModelEnums.UAGroupDetailAppendItemType afterItemType){
        if(afterItemType == null){
            this.setAfterItemType(null);
        }
        else{
            this.setAfterItemType(afterItemType.value);
        }
        return this;
    }

    /**
     * <B>AFTERPSSYSCSSID</B>&nbsp;后置内容样式表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCss} 
     */
    public final static String FIELD_AFTERPSSYSCSSID = "afterpssyscssid";

    /**
     * 设置 后置内容样式表
     * 
     * @param afterPSSysCssId
     * 
     */
    @JsonProperty(FIELD_AFTERPSSYSCSSID)
    public void setAfterPSSysCssId(String afterPSSysCssId){
        this.set(FIELD_AFTERPSSYSCSSID, afterPSSysCssId);
    }
    
    /**
     * 获取 后置内容样式表  
     * @return
     */
    @JsonIgnore
    public String getAfterPSSysCssId(){
        Object objValue = this.get(FIELD_AFTERPSSYSCSSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后置内容样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAfterPSSysCssIdDirty(){
        if(this.contains(FIELD_AFTERPSSYSCSSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后置内容样式表
     */
    @JsonIgnore
    public void resetAfterPSSysCssId(){
        this.reset(FIELD_AFTERPSSYSCSSID);
    }

    /**
     * 设置 后置内容样式表
     * <P>
     * 等同 {@link #setAfterPSSysCssId}
     * @param afterPSSysCssId
     */
    @JsonIgnore
    public PSDEUAGroupDetail afterpssyscssid(String afterPSSysCssId){
        this.setAfterPSSysCssId(afterPSSysCssId);
        return this;
    }

    /**
     * 设置 后置内容样式表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setAfterPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSDEUAGroupDetail afterpssyscssid(PSSysCss pSSysCss){
        if(pSSysCss == null){
            this.setAfterPSSysCssId(null);
            this.setAfterPSSysCssName(null);
        }
        else{
            this.setAfterPSSysCssId(pSSysCss.getPSSysCssId());
            this.setAfterPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    /**
     * <B>AFTERPSSYSCSSNAME</B>&nbsp;后置内容样式表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_AFTERPSSYSCSSID}
     */
    public final static String FIELD_AFTERPSSYSCSSNAME = "afterpssyscssname";

    /**
     * 设置 后置内容样式表
     * 
     * @param afterPSSysCssName
     * 
     */
    @JsonProperty(FIELD_AFTERPSSYSCSSNAME)
    public void setAfterPSSysCssName(String afterPSSysCssName){
        this.set(FIELD_AFTERPSSYSCSSNAME, afterPSSysCssName);
    }
    
    /**
     * 获取 后置内容样式表  
     * @return
     */
    @JsonIgnore
    public String getAfterPSSysCssName(){
        Object objValue = this.get(FIELD_AFTERPSSYSCSSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后置内容样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAfterPSSysCssNameDirty(){
        if(this.contains(FIELD_AFTERPSSYSCSSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后置内容样式表
     */
    @JsonIgnore
    public void resetAfterPSSysCssName(){
        this.reset(FIELD_AFTERPSSYSCSSNAME);
    }

    /**
     * 设置 后置内容样式表
     * <P>
     * 等同 {@link #setAfterPSSysCssName}
     * @param afterPSSysCssName
     */
    @JsonIgnore
    public PSDEUAGroupDetail afterpssyscssname(String afterPSSysCssName){
        this.setAfterPSSysCssName(afterPSSysCssName);
        return this;
    }

    /**
     * <B>AFTERPSSYSRESOURCEID</B>&nbsp;后置预置系统资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysResource} 
     */
    public final static String FIELD_AFTERPSSYSRESOURCEID = "afterpssysresourceid";

    /**
     * 设置 后置预置系统资源
     * 
     * @param afterPSSysResourceId
     * 
     */
    @JsonProperty(FIELD_AFTERPSSYSRESOURCEID)
    public void setAfterPSSysResourceId(String afterPSSysResourceId){
        this.set(FIELD_AFTERPSSYSRESOURCEID, afterPSSysResourceId);
    }
    
    /**
     * 获取 后置预置系统资源  
     * @return
     */
    @JsonIgnore
    public String getAfterPSSysResourceId(){
        Object objValue = this.get(FIELD_AFTERPSSYSRESOURCEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后置预置系统资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAfterPSSysResourceIdDirty(){
        if(this.contains(FIELD_AFTERPSSYSRESOURCEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后置预置系统资源
     */
    @JsonIgnore
    public void resetAfterPSSysResourceId(){
        this.reset(FIELD_AFTERPSSYSRESOURCEID);
    }

    /**
     * 设置 后置预置系统资源
     * <P>
     * 等同 {@link #setAfterPSSysResourceId}
     * @param afterPSSysResourceId
     */
    @JsonIgnore
    public PSDEUAGroupDetail afterpssysresourceid(String afterPSSysResourceId){
        this.setAfterPSSysResourceId(afterPSSysResourceId);
        return this;
    }

    /**
     * 设置 后置预置系统资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setAfterPSSysResourceId}
     * @param pSSysResource 引用对象
     */
    @JsonIgnore
    public PSDEUAGroupDetail afterpssysresourceid(PSSysResource pSSysResource){
        if(pSSysResource == null){
            this.setAfterPSSysResourceId(null);
            this.setAfterPSSysResourceName(null);
        }
        else{
            this.setAfterPSSysResourceId(pSSysResource.getPSSysResourceId());
            this.setAfterPSSysResourceName(pSSysResource.getPSSysResourceName());
        }
        return this;
    }

    /**
     * <B>AFTERPSSYSRESOURCENAME</B>&nbsp;后置预置系统资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_AFTERPSSYSRESOURCEID}
     */
    public final static String FIELD_AFTERPSSYSRESOURCENAME = "afterpssysresourcename";

    /**
     * 设置 后置预置系统资源
     * 
     * @param afterPSSysResourceName
     * 
     */
    @JsonProperty(FIELD_AFTERPSSYSRESOURCENAME)
    public void setAfterPSSysResourceName(String afterPSSysResourceName){
        this.set(FIELD_AFTERPSSYSRESOURCENAME, afterPSSysResourceName);
    }
    
    /**
     * 获取 后置预置系统资源  
     * @return
     */
    @JsonIgnore
    public String getAfterPSSysResourceName(){
        Object objValue = this.get(FIELD_AFTERPSSYSRESOURCENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后置预置系统资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAfterPSSysResourceNameDirty(){
        if(this.contains(FIELD_AFTERPSSYSRESOURCENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后置预置系统资源
     */
    @JsonIgnore
    public void resetAfterPSSysResourceName(){
        this.reset(FIELD_AFTERPSSYSRESOURCENAME);
    }

    /**
     * 设置 后置预置系统资源
     * <P>
     * 等同 {@link #setAfterPSSysResourceName}
     * @param afterPSSysResourceName
     */
    @JsonIgnore
    public PSDEUAGroupDetail afterpssysresourcename(String afterPSSysResourceName){
        this.setAfterPSSysResourceName(afterPSSysResourceName);
        return this;
    }

    /**
     * <B>BEFORECONTENT</B>&nbsp;前置内容
     */
    public final static String FIELD_BEFORECONTENT = "beforecontent";

    /**
     * 设置 前置内容
     * 
     * @param beforeContent
     * 
     */
    @JsonProperty(FIELD_BEFORECONTENT)
    public void setBeforeContent(String beforeContent){
        this.set(FIELD_BEFORECONTENT, beforeContent);
    }
    
    /**
     * 获取 前置内容  
     * @return
     */
    @JsonIgnore
    public String getBeforeContent(){
        Object objValue = this.get(FIELD_BEFORECONTENT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前置内容 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBeforeContentDirty(){
        if(this.contains(FIELD_BEFORECONTENT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前置内容
     */
    @JsonIgnore
    public void resetBeforeContent(){
        this.reset(FIELD_BEFORECONTENT);
    }

    /**
     * 设置 前置内容
     * <P>
     * 等同 {@link #setBeforeContent}
     * @param beforeContent
     */
    @JsonIgnore
    public PSDEUAGroupDetail beforecontent(String beforeContent){
        this.setBeforeContent(beforeContent);
        return this;
    }

    /**
     * <B>BEFOREITEMTYPE</B>&nbsp;前置内容类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.UAGroupDetailAppendItemType} 
     */
    public final static String FIELD_BEFOREITEMTYPE = "beforeitemtype";

    /**
     * 设置 前置内容类型
     * 
     * @param beforeItemType
     * 
     */
    @JsonProperty(FIELD_BEFOREITEMTYPE)
    public void setBeforeItemType(String beforeItemType){
        this.set(FIELD_BEFOREITEMTYPE, beforeItemType);
    }
    
    /**
     * 获取 前置内容类型  
     * @return
     */
    @JsonIgnore
    public String getBeforeItemType(){
        Object objValue = this.get(FIELD_BEFOREITEMTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前置内容类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBeforeItemTypeDirty(){
        if(this.contains(FIELD_BEFOREITEMTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前置内容类型
     */
    @JsonIgnore
    public void resetBeforeItemType(){
        this.reset(FIELD_BEFOREITEMTYPE);
    }

    /**
     * 设置 前置内容类型
     * <P>
     * 等同 {@link #setBeforeItemType}
     * @param beforeItemType
     */
    @JsonIgnore
    public PSDEUAGroupDetail beforeitemtype(String beforeItemType){
        this.setBeforeItemType(beforeItemType);
        return this;
    }

     /**
     * 设置 前置内容类型
     * <P>
     * 等同 {@link #setBeforeItemType}
     * @param beforeItemType
     */
    @JsonIgnore
    public PSDEUAGroupDetail beforeitemtype(net.ibizsys.psmodel.core.util.PSModelEnums.UAGroupDetailAppendItemType beforeItemType){
        if(beforeItemType == null){
            this.setBeforeItemType(null);
        }
        else{
            this.setBeforeItemType(beforeItemType.value);
        }
        return this;
    }

    /**
     * <B>BEFOREPSSYSCSSID</B>&nbsp;前置内容样式表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCss} 
     */
    public final static String FIELD_BEFOREPSSYSCSSID = "beforepssyscssid";

    /**
     * 设置 前置内容样式表
     * 
     * @param beforePSSysCssId
     * 
     */
    @JsonProperty(FIELD_BEFOREPSSYSCSSID)
    public void setBeforePSSysCssId(String beforePSSysCssId){
        this.set(FIELD_BEFOREPSSYSCSSID, beforePSSysCssId);
    }
    
    /**
     * 获取 前置内容样式表  
     * @return
     */
    @JsonIgnore
    public String getBeforePSSysCssId(){
        Object objValue = this.get(FIELD_BEFOREPSSYSCSSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前置内容样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBeforePSSysCssIdDirty(){
        if(this.contains(FIELD_BEFOREPSSYSCSSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前置内容样式表
     */
    @JsonIgnore
    public void resetBeforePSSysCssId(){
        this.reset(FIELD_BEFOREPSSYSCSSID);
    }

    /**
     * 设置 前置内容样式表
     * <P>
     * 等同 {@link #setBeforePSSysCssId}
     * @param beforePSSysCssId
     */
    @JsonIgnore
    public PSDEUAGroupDetail beforepssyscssid(String beforePSSysCssId){
        this.setBeforePSSysCssId(beforePSSysCssId);
        return this;
    }

    /**
     * 设置 前置内容样式表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setBeforePSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSDEUAGroupDetail beforepssyscssid(PSSysCss pSSysCss){
        if(pSSysCss == null){
            this.setBeforePSSysCssId(null);
            this.setBeforePSSysCssName(null);
        }
        else{
            this.setBeforePSSysCssId(pSSysCss.getPSSysCssId());
            this.setBeforePSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    /**
     * <B>BEFOREPSSYSCSSNAME</B>&nbsp;前置内容样式表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_BEFOREPSSYSCSSID}
     */
    public final static String FIELD_BEFOREPSSYSCSSNAME = "beforepssyscssname";

    /**
     * 设置 前置内容样式表
     * 
     * @param beforePSSysCssName
     * 
     */
    @JsonProperty(FIELD_BEFOREPSSYSCSSNAME)
    public void setBeforePSSysCssName(String beforePSSysCssName){
        this.set(FIELD_BEFOREPSSYSCSSNAME, beforePSSysCssName);
    }
    
    /**
     * 获取 前置内容样式表  
     * @return
     */
    @JsonIgnore
    public String getBeforePSSysCssName(){
        Object objValue = this.get(FIELD_BEFOREPSSYSCSSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前置内容样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBeforePSSysCssNameDirty(){
        if(this.contains(FIELD_BEFOREPSSYSCSSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前置内容样式表
     */
    @JsonIgnore
    public void resetBeforePSSysCssName(){
        this.reset(FIELD_BEFOREPSSYSCSSNAME);
    }

    /**
     * 设置 前置内容样式表
     * <P>
     * 等同 {@link #setBeforePSSysCssName}
     * @param beforePSSysCssName
     */
    @JsonIgnore
    public PSDEUAGroupDetail beforepssyscssname(String beforePSSysCssName){
        this.setBeforePSSysCssName(beforePSSysCssName);
        return this;
    }

    /**
     * <B>BEFOREPSSYSRESOURCEID</B>&nbsp;前置预置系统资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysResource} 
     */
    public final static String FIELD_BEFOREPSSYSRESOURCEID = "beforepssysresourceid";

    /**
     * 设置 前置预置系统资源
     * 
     * @param beforePSSysResourceId
     * 
     */
    @JsonProperty(FIELD_BEFOREPSSYSRESOURCEID)
    public void setBeforePSSysResourceId(String beforePSSysResourceId){
        this.set(FIELD_BEFOREPSSYSRESOURCEID, beforePSSysResourceId);
    }
    
    /**
     * 获取 前置预置系统资源  
     * @return
     */
    @JsonIgnore
    public String getBeforePSSysResourceId(){
        Object objValue = this.get(FIELD_BEFOREPSSYSRESOURCEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前置预置系统资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBeforePSSysResourceIdDirty(){
        if(this.contains(FIELD_BEFOREPSSYSRESOURCEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前置预置系统资源
     */
    @JsonIgnore
    public void resetBeforePSSysResourceId(){
        this.reset(FIELD_BEFOREPSSYSRESOURCEID);
    }

    /**
     * 设置 前置预置系统资源
     * <P>
     * 等同 {@link #setBeforePSSysResourceId}
     * @param beforePSSysResourceId
     */
    @JsonIgnore
    public PSDEUAGroupDetail beforepssysresourceid(String beforePSSysResourceId){
        this.setBeforePSSysResourceId(beforePSSysResourceId);
        return this;
    }

    /**
     * 设置 前置预置系统资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setBeforePSSysResourceId}
     * @param pSSysResource 引用对象
     */
    @JsonIgnore
    public PSDEUAGroupDetail beforepssysresourceid(PSSysResource pSSysResource){
        if(pSSysResource == null){
            this.setBeforePSSysResourceId(null);
            this.setBeforePSSysResourceName(null);
        }
        else{
            this.setBeforePSSysResourceId(pSSysResource.getPSSysResourceId());
            this.setBeforePSSysResourceName(pSSysResource.getPSSysResourceName());
        }
        return this;
    }

    /**
     * <B>BEFOREPSSYSRESOURCENAME</B>&nbsp;前置预置系统资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_BEFOREPSSYSRESOURCEID}
     */
    public final static String FIELD_BEFOREPSSYSRESOURCENAME = "beforepssysresourcename";

    /**
     * 设置 前置预置系统资源
     * 
     * @param beforePSSysResourceName
     * 
     */
    @JsonProperty(FIELD_BEFOREPSSYSRESOURCENAME)
    public void setBeforePSSysResourceName(String beforePSSysResourceName){
        this.set(FIELD_BEFOREPSSYSRESOURCENAME, beforePSSysResourceName);
    }
    
    /**
     * 获取 前置预置系统资源  
     * @return
     */
    @JsonIgnore
    public String getBeforePSSysResourceName(){
        Object objValue = this.get(FIELD_BEFOREPSSYSRESOURCENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前置预置系统资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBeforePSSysResourceNameDirty(){
        if(this.contains(FIELD_BEFOREPSSYSRESOURCENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前置预置系统资源
     */
    @JsonIgnore
    public void resetBeforePSSysResourceName(){
        this.reset(FIELD_BEFOREPSSYSRESOURCENAME);
    }

    /**
     * 设置 前置预置系统资源
     * <P>
     * 等同 {@link #setBeforePSSysResourceName}
     * @param beforePSSysResourceName
     */
    @JsonIgnore
    public PSDEUAGroupDetail beforepssysresourcename(String beforePSSysResourceName){
        this.setBeforePSSysResourceName(beforePSSysResourceName);
        return this;
    }

    /**
     * <B>BUTTONSTYLE</B>&nbsp;按钮样式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ButtonStyle} 
     */
    public final static String FIELD_BUTTONSTYLE = "buttonstyle";

    /**
     * 设置 按钮样式
     * 
     * @param buttonStyle
     * 
     */
    @JsonProperty(FIELD_BUTTONSTYLE)
    public void setButtonStyle(String buttonStyle){
        this.set(FIELD_BUTTONSTYLE, buttonStyle);
    }
    
    /**
     * 获取 按钮样式  
     * @return
     */
    @JsonIgnore
    public String getButtonStyle(){
        Object objValue = this.get(FIELD_BUTTONSTYLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 按钮样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isButtonStyleDirty(){
        if(this.contains(FIELD_BUTTONSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 按钮样式
     */
    @JsonIgnore
    public void resetButtonStyle(){
        this.reset(FIELD_BUTTONSTYLE);
    }

    /**
     * 设置 按钮样式
     * <P>
     * 等同 {@link #setButtonStyle}
     * @param buttonStyle
     */
    @JsonIgnore
    public PSDEUAGroupDetail buttonstyle(String buttonStyle){
        this.setButtonStyle(buttonStyle);
        return this;
    }

     /**
     * 设置 按钮样式
     * <P>
     * 等同 {@link #setButtonStyle}
     * @param buttonStyle
     */
    @JsonIgnore
    public PSDEUAGroupDetail buttonstyle(net.ibizsys.psmodel.core.util.PSModelEnums.ButtonStyle buttonStyle){
        if(buttonStyle == null){
            this.setButtonStyle(null);
        }
        else{
            this.setButtonStyle(buttonStyle.value);
        }
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定界面行为组成员的代码标识，需要在所在的界面行为组具有唯一性
     * <P>
     * 字符串：最大长度 30，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_CODENAME = "codename";

    /**
     * 设置 代码标识，详细说明：{@link #FIELD_CODENAME}
     * 
     * @param codeName
     * 
     */
    @JsonProperty(FIELD_CODENAME)
    public void setCodeName(String codeName){
        this.set(FIELD_CODENAME, codeName);
    }
    
    /**
     * 获取 代码标识  
     * @return
     */
    @JsonIgnore
    public String getCodeName(){
        Object objValue = this.get(FIELD_CODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCodeNameDirty(){
        if(this.contains(FIELD_CODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码标识
     */
    @JsonIgnore
    public void resetCodeName(){
        this.reset(FIELD_CODENAME);
    }

    /**
     * 设置 代码标识，详细说明：{@link #FIELD_CODENAME}
     * <P>
     * 等同 {@link #setCodeName}
     * @param codeName
     */
    @JsonIgnore
    public PSDEUAGroupDetail codename(String codeName){
        this.setCodeName(codeName);
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
    public PSDEUAGroupDetail createdate(String createDate){
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
    public PSDEUAGroupDetail createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DETAILTAG</B>&nbsp;成员标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_DETAILTAG = "detailtag";

    /**
     * 设置 成员标记
     * 
     * @param detailTag
     * 
     */
    @JsonProperty(FIELD_DETAILTAG)
    public void setDetailTag(String detailTag){
        this.set(FIELD_DETAILTAG, detailTag);
    }
    
    /**
     * 获取 成员标记  
     * @return
     */
    @JsonIgnore
    public String getDetailTag(){
        Object objValue = this.get(FIELD_DETAILTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 成员标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDetailTagDirty(){
        if(this.contains(FIELD_DETAILTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 成员标记
     */
    @JsonIgnore
    public void resetDetailTag(){
        this.reset(FIELD_DETAILTAG);
    }

    /**
     * 设置 成员标记
     * <P>
     * 等同 {@link #setDetailTag}
     * @param detailTag
     */
    @JsonIgnore
    public PSDEUAGroupDetail detailtag(String detailTag){
        this.setDetailTag(detailTag);
        return this;
    }

    /**
     * <B>DETAILTAG2</B>&nbsp;成员标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_DETAILTAG2 = "detailtag2";

    /**
     * 设置 成员标记2
     * 
     * @param detailTag2
     * 
     */
    @JsonProperty(FIELD_DETAILTAG2)
    public void setDetailTag2(String detailTag2){
        this.set(FIELD_DETAILTAG2, detailTag2);
    }
    
    /**
     * 获取 成员标记2  
     * @return
     */
    @JsonIgnore
    public String getDetailTag2(){
        Object objValue = this.get(FIELD_DETAILTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 成员标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDetailTag2Dirty(){
        if(this.contains(FIELD_DETAILTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 成员标记2
     */
    @JsonIgnore
    public void resetDetailTag2(){
        this.reset(FIELD_DETAILTAG2);
    }

    /**
     * 设置 成员标记2
     * <P>
     * 等同 {@link #setDetailTag2}
     * @param detailTag2
     */
    @JsonIgnore
    public PSDEUAGroupDetail detailtag2(String detailTag2){
        this.setDetailTag2(detailTag2);
        return this;
    }

    /**
     * <B>DETAILTYPE</B>&nbsp;成员类型，指定界面行为组成员类型，目前仅支持【实体界面行为】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.UAGroupDetailType} 
     */
    public final static String FIELD_DETAILTYPE = "detailtype";

    /**
     * 设置 成员类型，详细说明：{@link #FIELD_DETAILTYPE}
     * 
     * @param detailType
     * 
     */
    @JsonProperty(FIELD_DETAILTYPE)
    public void setDetailType(String detailType){
        this.set(FIELD_DETAILTYPE, detailType);
    }
    
    /**
     * 获取 成员类型  
     * @return
     */
    @JsonIgnore
    public String getDetailType(){
        Object objValue = this.get(FIELD_DETAILTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 成员类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDetailTypeDirty(){
        if(this.contains(FIELD_DETAILTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 成员类型
     */
    @JsonIgnore
    public void resetDetailType(){
        this.reset(FIELD_DETAILTYPE);
    }

    /**
     * 设置 成员类型，详细说明：{@link #FIELD_DETAILTYPE}
     * <P>
     * 等同 {@link #setDetailType}
     * @param detailType
     */
    @JsonIgnore
    public PSDEUAGroupDetail detailtype(String detailType){
        this.setDetailType(detailType);
        return this;
    }

     /**
     * 设置 成员类型，详细说明：{@link #FIELD_DETAILTYPE}
     * <P>
     * 等同 {@link #setDetailType}
     * @param detailType
     */
    @JsonIgnore
    public PSDEUAGroupDetail detailtype(net.ibizsys.psmodel.core.util.PSModelEnums.UAGroupDetailType detailType){
        if(detailType == null){
            this.setDetailType(null);
        }
        else{
            this.setDetailType(detailType.value);
        }
        return this;
    }

    /**
     * <B>ENABLELOGIC</B>&nbsp;启用逻辑
     */
    public final static String FIELD_ENABLELOGIC = "enablelogic";

    /**
     * 设置 启用逻辑
     * 
     * @param enableLogic
     * 
     */
    @JsonProperty(FIELD_ENABLELOGIC)
    public void setEnableLogic(String enableLogic){
        this.set(FIELD_ENABLELOGIC, enableLogic);
    }
    
    /**
     * 获取 启用逻辑  
     * @return
     */
    @JsonIgnore
    public String getEnableLogic(){
        Object objValue = this.get(FIELD_ENABLELOGIC);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 启用逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableLogicDirty(){
        if(this.contains(FIELD_ENABLELOGIC)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用逻辑
     */
    @JsonIgnore
    public void resetEnableLogic(){
        this.reset(FIELD_ENABLELOGIC);
    }

    /**
     * 设置 启用逻辑
     * <P>
     * 等同 {@link #setEnableLogic}
     * @param enableLogic
     */
    @JsonIgnore
    public PSDEUAGroupDetail enablelogic(String enableLogic){
        this.setEnableLogic(enableLogic);
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
    public PSDEUAGroupDetail memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;显示排序值，指定界面行为组成员的显示次序
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 显示排序值，详细说明：{@link #FIELD_ORDERVALUE}
     * 
     * @param orderValue
     * 
     */
    @JsonProperty(FIELD_ORDERVALUE)
    public void setOrderValue(Integer orderValue){
        this.set(FIELD_ORDERVALUE, orderValue);
    }
    
    /**
     * 获取 显示排序值  
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
     * 判断 显示排序值 是否指定值，包括空值
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
     * 重置 显示排序值
     */
    @JsonIgnore
    public void resetOrderValue(){
        this.reset(FIELD_ORDERVALUE);
    }

    /**
     * 设置 显示排序值，详细说明：{@link #FIELD_ORDERVALUE}
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSDEUAGroupDetail ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEUAGROUPID}
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
    public PSDEUAGroupDetail psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * <B>PSDEUAGROUPID</B>&nbsp;实体界面行为组，指定界面行为组成员所在的行为组对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEUAGroup} 
     */
    public final static String FIELD_PSDEUAGROUPID = "psdeuagroupid";

    /**
     * 设置 实体界面行为组，详细说明：{@link #FIELD_PSDEUAGROUPID}
     * 
     * @param pSDEUAGroupId
     * 
     */
    @JsonProperty(FIELD_PSDEUAGROUPID)
    public void setPSDEUAGroupId(String pSDEUAGroupId){
        this.set(FIELD_PSDEUAGROUPID, pSDEUAGroupId);
    }
    
    /**
     * 获取 实体界面行为组  
     * @return
     */
    @JsonIgnore
    public String getPSDEUAGroupId(){
        Object objValue = this.get(FIELD_PSDEUAGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体界面行为组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEUAGroupIdDirty(){
        if(this.contains(FIELD_PSDEUAGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体界面行为组
     */
    @JsonIgnore
    public void resetPSDEUAGroupId(){
        this.reset(FIELD_PSDEUAGROUPID);
    }

    /**
     * 设置 实体界面行为组，详细说明：{@link #FIELD_PSDEUAGROUPID}
     * <P>
     * 等同 {@link #setPSDEUAGroupId}
     * @param pSDEUAGroupId
     */
    @JsonIgnore
    public PSDEUAGroupDetail psdeuagroupid(String pSDEUAGroupId){
        this.setPSDEUAGroupId(pSDEUAGroupId);
        return this;
    }

    /**
     * 设置 实体界面行为组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEUAGroupId}
     * @param pSDEUAGroup 引用对象
     */
    @JsonIgnore
    public PSDEUAGroupDetail psdeuagroupid(PSDEUAGroup pSDEUAGroup){
        if(pSDEUAGroup == null){
            this.setPSDEId(null);
            this.setPSDEUAGroupId(null);
            this.setPSDEUAGroupName(null);
        }
        else{
            this.setPSDEId(pSDEUAGroup.getPSDEId());
            this.setPSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setPSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    /**
     * <B>PSDEUAGROUPNAME</B>&nbsp;实体界面行为组，指定界面行为组成员所在的行为组对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEUAGROUPID}
     */
    public final static String FIELD_PSDEUAGROUPNAME = "psdeuagroupname";

    /**
     * 设置 实体界面行为组，详细说明：{@link #FIELD_PSDEUAGROUPNAME}
     * 
     * @param pSDEUAGroupName
     * 
     */
    @JsonProperty(FIELD_PSDEUAGROUPNAME)
    public void setPSDEUAGroupName(String pSDEUAGroupName){
        this.set(FIELD_PSDEUAGROUPNAME, pSDEUAGroupName);
    }
    
    /**
     * 获取 实体界面行为组  
     * @return
     */
    @JsonIgnore
    public String getPSDEUAGroupName(){
        Object objValue = this.get(FIELD_PSDEUAGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体界面行为组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEUAGroupNameDirty(){
        if(this.contains(FIELD_PSDEUAGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体界面行为组
     */
    @JsonIgnore
    public void resetPSDEUAGroupName(){
        this.reset(FIELD_PSDEUAGROUPNAME);
    }

    /**
     * 设置 实体界面行为组，详细说明：{@link #FIELD_PSDEUAGROUPNAME}
     * <P>
     * 等同 {@link #setPSDEUAGroupName}
     * @param pSDEUAGroupName
     */
    @JsonIgnore
    public PSDEUAGroupDetail psdeuagroupname(String pSDEUAGroupName){
        this.setPSDEUAGroupName(pSDEUAGroupName);
        return this;
    }

    /**
     * <B>PSDEUAGRPDETAILID</B>&nbsp;实体界面行为组成员标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEUAGRPDETAILID = "psdeuagrpdetailid";

    /**
     * 设置 实体界面行为组成员标识
     * 
     * @param pSDEUAGRPDetailId
     * 
     */
    @JsonProperty(FIELD_PSDEUAGRPDETAILID)
    public void setPSDEUAGRPDetailId(String pSDEUAGRPDetailId){
        this.set(FIELD_PSDEUAGRPDETAILID, pSDEUAGRPDetailId);
    }
    
    /**
     * 获取 实体界面行为组成员标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEUAGRPDetailId(){
        Object objValue = this.get(FIELD_PSDEUAGRPDETAILID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体界面行为组成员标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEUAGRPDetailIdDirty(){
        if(this.contains(FIELD_PSDEUAGRPDETAILID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体界面行为组成员标识
     */
    @JsonIgnore
    public void resetPSDEUAGRPDetailId(){
        this.reset(FIELD_PSDEUAGRPDETAILID);
    }

    /**
     * 设置 实体界面行为组成员标识
     * <P>
     * 等同 {@link #setPSDEUAGRPDetailId}
     * @param pSDEUAGRPDetailId
     */
    @JsonIgnore
    public PSDEUAGroupDetail psdeuagrpdetailid(String pSDEUAGRPDetailId){
        this.setPSDEUAGRPDetailId(pSDEUAGRPDetailId);
        return this;
    }

    /**
     * <B>PSDEUAGRPDETAILNAME</B>&nbsp;成员名称，指定界面行为组成员的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEUAGRPDETAILNAME = "psdeuagrpdetailname";

    /**
     * 设置 成员名称，详细说明：{@link #FIELD_PSDEUAGRPDETAILNAME}
     * 
     * @param pSDEUAGRPDetailName
     * 
     */
    @JsonProperty(FIELD_PSDEUAGRPDETAILNAME)
    public void setPSDEUAGRPDetailName(String pSDEUAGRPDetailName){
        this.set(FIELD_PSDEUAGRPDETAILNAME, pSDEUAGRPDetailName);
    }
    
    /**
     * 获取 成员名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEUAGRPDetailName(){
        Object objValue = this.get(FIELD_PSDEUAGRPDETAILNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 成员名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEUAGRPDetailNameDirty(){
        if(this.contains(FIELD_PSDEUAGRPDETAILNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 成员名称
     */
    @JsonIgnore
    public void resetPSDEUAGRPDetailName(){
        this.reset(FIELD_PSDEUAGRPDETAILNAME);
    }

    /**
     * 设置 成员名称，详细说明：{@link #FIELD_PSDEUAGRPDETAILNAME}
     * <P>
     * 等同 {@link #setPSDEUAGRPDetailName}
     * @param pSDEUAGRPDetailName
     */
    @JsonIgnore
    public PSDEUAGroupDetail psdeuagrpdetailname(String pSDEUAGRPDetailName){
        this.setPSDEUAGRPDetailName(pSDEUAGRPDetailName);
        return this;
    }

    /**
     * <B>PSDEUIACTIONID</B>&nbsp;实体界面行为，指定界面行为组成员引用的界面行为对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEUIAction} 
     */
    public final static String FIELD_PSDEUIACTIONID = "psdeuiactionid";

    /**
     * 设置 实体界面行为，详细说明：{@link #FIELD_PSDEUIACTIONID}
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
     * 设置 实体界面行为，详细说明：{@link #FIELD_PSDEUIACTIONID}
     * <P>
     * 等同 {@link #setPSDEUIActionId}
     * @param pSDEUIActionId
     */
    @JsonIgnore
    public PSDEUAGroupDetail psdeuiactionid(String pSDEUIActionId){
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
    public PSDEUAGroupDetail psdeuiactionid(PSDEUIAction pSDEUIAction){
        if(pSDEUIAction == null){
            this.setPSDEUIActionId(null);
            this.setPSDEUIActionName(null);
            this.setUACaption(null);
        }
        else{
            this.setPSDEUIActionId(pSDEUIAction.getPSDEUIActionId());
            this.setPSDEUIActionName(pSDEUIAction.getPSDEUIActionName());
            this.setUACaption(pSDEUIAction.getCaption());
        }
        return this;
    }

    /**
     * <B>PSDEUIACTIONNAME</B>&nbsp;实体界面行为，指定界面行为组成员引用的界面行为对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEUIACTIONID}
     */
    public final static String FIELD_PSDEUIACTIONNAME = "psdeuiactionname";

    /**
     * 设置 实体界面行为，详细说明：{@link #FIELD_PSDEUIACTIONNAME}
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
     * 设置 实体界面行为，详细说明：{@link #FIELD_PSDEUIACTIONNAME}
     * <P>
     * 等同 {@link #setPSDEUIActionName}
     * @param pSDEUIActionName
     */
    @JsonIgnore
    public PSDEUAGroupDetail psdeuiactionname(String pSDEUIActionName){
        this.setPSDEUIActionName(pSDEUIActionName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEUIActionName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEUIActionName(strName);
    }

    @JsonIgnore
    public PSDEUAGroupDetail name(String strName){
        this.setPSDEUIActionName(strName);
        return this;
    }

    /**
     * <B>PSSYSCSSID</B>&nbsp;显示样式，指定界面行为组成员的显示样式表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCss} 
     */
    public final static String FIELD_PSSYSCSSID = "pssyscssid";

    /**
     * 设置 显示样式，详细说明：{@link #FIELD_PSSYSCSSID}
     * 
     * @param pSSysCssId
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSID)
    public void setPSSysCssId(String pSSysCssId){
        this.set(FIELD_PSSYSCSSID, pSSysCssId);
    }
    
    /**
     * 获取 显示样式  
     * @return
     */
    @JsonIgnore
    public String getPSSysCssId(){
        Object objValue = this.get(FIELD_PSSYSCSSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 显示样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCssIdDirty(){
        if(this.contains(FIELD_PSSYSCSSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 显示样式
     */
    @JsonIgnore
    public void resetPSSysCssId(){
        this.reset(FIELD_PSSYSCSSID);
    }

    /**
     * 设置 显示样式，详细说明：{@link #FIELD_PSSYSCSSID}
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCssId
     */
    @JsonIgnore
    public PSDEUAGroupDetail pssyscssid(String pSSysCssId){
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    /**
     * 设置 显示样式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSDEUAGroupDetail pssyscssid(PSSysCss pSSysCss){
        if(pSSysCss == null){
            this.setPSSysCssId(null);
            this.setPSSysCssName(null);
        }
        else{
            this.setPSSysCssId(pSSysCss.getPSSysCssId());
            this.setPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    /**
     * <B>PSSYSCSSNAME</B>&nbsp;界面样式表，指定界面行为组成员的显示样式表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSCSSID}
     */
    public final static String FIELD_PSSYSCSSNAME = "pssyscssname";

    /**
     * 设置 界面样式表，详细说明：{@link #FIELD_PSSYSCSSNAME}
     * 
     * @param pSSysCssName
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSNAME)
    public void setPSSysCssName(String pSSysCssName){
        this.set(FIELD_PSSYSCSSNAME, pSSysCssName);
    }
    
    /**
     * 获取 界面样式表  
     * @return
     */
    @JsonIgnore
    public String getPSSysCssName(){
        Object objValue = this.get(FIELD_PSSYSCSSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCssNameDirty(){
        if(this.contains(FIELD_PSSYSCSSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面样式表
     */
    @JsonIgnore
    public void resetPSSysCssName(){
        this.reset(FIELD_PSSYSCSSNAME);
    }

    /**
     * 设置 界面样式表，详细说明：{@link #FIELD_PSSYSCSSNAME}
     * <P>
     * 等同 {@link #setPSSysCssName}
     * @param pSSysCssName
     */
    @JsonIgnore
    public PSDEUAGroupDetail pssyscssname(String pSSysCssName){
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    /**
     * <B>PSSYSIMAGEID</B>&nbsp;显示图标，指定界面行为组成员的显示图标对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysImage} 
     */
    public final static String FIELD_PSSYSIMAGEID = "pssysimageid";

    /**
     * 设置 显示图标，详细说明：{@link #FIELD_PSSYSIMAGEID}
     * 
     * @param pSSysImageId
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGEID)
    public void setPSSysImageId(String pSSysImageId){
        this.set(FIELD_PSSYSIMAGEID, pSSysImageId);
    }
    
    /**
     * 获取 显示图标  
     * @return
     */
    @JsonIgnore
    public String getPSSysImageId(){
        Object objValue = this.get(FIELD_PSSYSIMAGEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 显示图标 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysImageIdDirty(){
        if(this.contains(FIELD_PSSYSIMAGEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 显示图标
     */
    @JsonIgnore
    public void resetPSSysImageId(){
        this.reset(FIELD_PSSYSIMAGEID);
    }

    /**
     * 设置 显示图标，详细说明：{@link #FIELD_PSSYSIMAGEID}
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImageId
     */
    @JsonIgnore
    public PSDEUAGroupDetail pssysimageid(String pSSysImageId){
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    /**
     * 设置 显示图标，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImage 引用对象
     */
    @JsonIgnore
    public PSDEUAGroupDetail pssysimageid(PSSysImage pSSysImage){
        if(pSSysImage == null){
            this.setPSSysImageId(null);
            this.setPSSysImageName(null);
        }
        else{
            this.setPSSysImageId(pSSysImage.getPSSysImageId());
            this.setPSSysImageName(pSSysImage.getPSSysImageName());
        }
        return this;
    }

    /**
     * <B>PSSYSIMAGENAME</B>&nbsp;显示图标，指定界面行为组成员的显示图标对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSIMAGEID}
     */
    public final static String FIELD_PSSYSIMAGENAME = "pssysimagename";

    /**
     * 设置 显示图标，详细说明：{@link #FIELD_PSSYSIMAGENAME}
     * 
     * @param pSSysImageName
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGENAME)
    public void setPSSysImageName(String pSSysImageName){
        this.set(FIELD_PSSYSIMAGENAME, pSSysImageName);
    }
    
    /**
     * 获取 显示图标  
     * @return
     */
    @JsonIgnore
    public String getPSSysImageName(){
        Object objValue = this.get(FIELD_PSSYSIMAGENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 显示图标 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysImageNameDirty(){
        if(this.contains(FIELD_PSSYSIMAGENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 显示图标
     */
    @JsonIgnore
    public void resetPSSysImageName(){
        this.reset(FIELD_PSSYSIMAGENAME);
    }

    /**
     * 设置 显示图标，详细说明：{@link #FIELD_PSSYSIMAGENAME}
     * <P>
     * 等同 {@link #setPSSysImageName}
     * @param pSSysImageName
     */
    @JsonIgnore
    public PSDEUAGroupDetail pssysimagename(String pSSysImageName){
        this.setPSSysImageName(pSSysImageName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端应用插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysPFPlugin} 
     */
    public final static String FIELD_PSSYSPFPLUGINID = "pssyspfpluginid";

    /**
     * 设置 前端应用插件
     * 
     * @param pSSysPFPluginId
     * 
     */
    @JsonProperty(FIELD_PSSYSPFPLUGINID)
    public void setPSSysPFPluginId(String pSSysPFPluginId){
        this.set(FIELD_PSSYSPFPLUGINID, pSSysPFPluginId);
    }
    
    /**
     * 获取 前端应用插件  
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
     * 判断 前端应用插件 是否指定值，包括空值
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
     * 重置 前端应用插件
     */
    @JsonIgnore
    public void resetPSSysPFPluginId(){
        this.reset(FIELD_PSSYSPFPLUGINID);
    }

    /**
     * 设置 前端应用插件
     * <P>
     * 等同 {@link #setPSSysPFPluginId}
     * @param pSSysPFPluginId
     */
    @JsonIgnore
    public PSDEUAGroupDetail pssyspfpluginid(String pSSysPFPluginId){
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    /**
     * 设置 前端应用插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysPFPluginId}
     * @param pSSysPFPlugin 引用对象
     */
    @JsonIgnore
    public PSDEUAGroupDetail pssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
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
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端应用插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSPFPLUGINID}
     */
    public final static String FIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";

    /**
     * 设置 前端应用插件
     * 
     * @param pSSysPFPluginName
     * 
     */
    @JsonProperty(FIELD_PSSYSPFPLUGINNAME)
    public void setPSSysPFPluginName(String pSSysPFPluginName){
        this.set(FIELD_PSSYSPFPLUGINNAME, pSSysPFPluginName);
    }
    
    /**
     * 获取 前端应用插件  
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
     * 判断 前端应用插件 是否指定值，包括空值
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
     * 重置 前端应用插件
     */
    @JsonIgnore
    public void resetPSSysPFPluginName(){
        this.reset(FIELD_PSSYSPFPLUGINNAME);
    }

    /**
     * 设置 前端应用插件
     * <P>
     * 等同 {@link #setPSSysPFPluginName}
     * @param pSSysPFPluginName
     */
    @JsonIgnore
    public PSDEUAGroupDetail pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    /**
     * <B>SHOWMODE</B>&nbsp;显示模式，指定界面行为组成员的默认显示模式，未定义时为【图标+短词】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.TBItemShowMode} 
     */
    public final static String FIELD_SHOWMODE = "showmode";

    /**
     * 设置 显示模式，详细说明：{@link #FIELD_SHOWMODE}
     * 
     * @param showMode
     * 
     */
    @JsonProperty(FIELD_SHOWMODE)
    public void setShowMode(String showMode){
        this.set(FIELD_SHOWMODE, showMode);
    }
    
    /**
     * 获取 显示模式  
     * @return
     */
    @JsonIgnore
    public String getShowMode(){
        Object objValue = this.get(FIELD_SHOWMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 显示模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isShowModeDirty(){
        if(this.contains(FIELD_SHOWMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 显示模式
     */
    @JsonIgnore
    public void resetShowMode(){
        this.reset(FIELD_SHOWMODE);
    }

    /**
     * 设置 显示模式，详细说明：{@link #FIELD_SHOWMODE}
     * <P>
     * 等同 {@link #setShowMode}
     * @param showMode
     */
    @JsonIgnore
    public PSDEUAGroupDetail showmode(String showMode){
        this.setShowMode(showMode);
        return this;
    }

     /**
     * 设置 显示模式，详细说明：{@link #FIELD_SHOWMODE}
     * <P>
     * 等同 {@link #setShowMode}
     * @param showMode
     */
    @JsonIgnore
    public PSDEUAGroupDetail showmode(net.ibizsys.psmodel.core.util.PSModelEnums.TBItemShowMode showMode){
        if(showMode == null){
            this.setShowMode(null);
        }
        else{
            this.setShowMode(showMode.value);
        }
        return this;
    }

    /**
     * <B>UACAPTION</B>&nbsp;行为标题
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEUIACTIONID}
     */
    public final static String FIELD_UACAPTION = "uacaption";

    /**
     * 设置 行为标题
     * 
     * @param uACaption
     * 
     */
    @JsonProperty(FIELD_UACAPTION)
    public void setUACaption(String uACaption){
        this.set(FIELD_UACAPTION, uACaption);
    }
    
    /**
     * 获取 行为标题  
     * @return
     */
    @JsonIgnore
    public String getUACaption(){
        Object objValue = this.get(FIELD_UACAPTION);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 行为标题 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUACaptionDirty(){
        if(this.contains(FIELD_UACAPTION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 行为标题
     */
    @JsonIgnore
    public void resetUACaption(){
        this.reset(FIELD_UACAPTION);
    }

    /**
     * 设置 行为标题
     * <P>
     * 等同 {@link #setUACaption}
     * @param uACaption
     */
    @JsonIgnore
    public PSDEUAGroupDetail uacaption(String uACaption){
        this.setUACaption(uACaption);
        return this;
    }

    /**
     * <B>UIACTIONPARAMS</B>&nbsp;界面行为附加参数
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_UIACTIONPARAMS = "uiactionparams";

    /**
     * 设置 界面行为附加参数
     * 
     * @param uIActionParams
     * 
     */
    @JsonProperty(FIELD_UIACTIONPARAMS)
    public void setUIActionParams(String uIActionParams){
        this.set(FIELD_UIACTIONPARAMS, uIActionParams);
    }
    
    /**
     * 获取 界面行为附加参数  
     * @return
     */
    @JsonIgnore
    public String getUIActionParams(){
        Object objValue = this.get(FIELD_UIACTIONPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面行为附加参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUIActionParamsDirty(){
        if(this.contains(FIELD_UIACTIONPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面行为附加参数
     */
    @JsonIgnore
    public void resetUIActionParams(){
        this.reset(FIELD_UIACTIONPARAMS);
    }

    /**
     * 设置 界面行为附加参数
     * <P>
     * 等同 {@link #setUIActionParams}
     * @param uIActionParams
     */
    @JsonIgnore
    public PSDEUAGroupDetail uiactionparams(String uIActionParams){
        this.setUIActionParams(uIActionParams);
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
    public PSDEUAGroupDetail updatedate(String updateDate){
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
    public PSDEUAGroupDetail updateman(String updateMan){
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
    public PSDEUAGroupDetail usercat(String userCat){
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
    public PSDEUAGroupDetail usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDEUAGroupDetail usertag(String userTag){
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
    public PSDEUAGroupDetail usertag2(String userTag2){
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
    public PSDEUAGroupDetail usertag3(String userTag3){
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
    public PSDEUAGroupDetail usertag4(String userTag4){
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
    public PSDEUAGroupDetail validflag(Integer validFlag){
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
    public PSDEUAGroupDetail validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>VISIBLELOGIC</B>&nbsp;可见逻辑
     */
    public final static String FIELD_VISIBLELOGIC = "visiblelogic";

    /**
     * 设置 可见逻辑
     * 
     * @param visibleLogic
     * 
     */
    @JsonProperty(FIELD_VISIBLELOGIC)
    public void setVisibleLogic(String visibleLogic){
        this.set(FIELD_VISIBLELOGIC, visibleLogic);
    }
    
    /**
     * 获取 可见逻辑  
     * @return
     */
    @JsonIgnore
    public String getVisibleLogic(){
        Object objValue = this.get(FIELD_VISIBLELOGIC);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 可见逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isVisibleLogicDirty(){
        if(this.contains(FIELD_VISIBLELOGIC)){
            return true;
        }
        return false;
    }

    /**
     * 重置 可见逻辑
     */
    @JsonIgnore
    public void resetVisibleLogic(){
        this.reset(FIELD_VISIBLELOGIC);
    }

    /**
     * 设置 可见逻辑
     * <P>
     * 等同 {@link #setVisibleLogic}
     * @param visibleLogic
     */
    @JsonIgnore
    public PSDEUAGroupDetail visiblelogic(String visibleLogic){
        this.setVisibleLogic(visibleLogic);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEUAGRPDetailId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEUAGRPDetailId(strValue);
    }

    @JsonIgnore
    public PSDEUAGroupDetail id(String strValue){
        this.setPSDEUAGRPDetailId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEUAGroupDetail){
            PSDEUAGroupDetail model = (PSDEUAGroupDetail)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
