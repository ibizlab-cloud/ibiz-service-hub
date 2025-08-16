package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEGRID</B>实体表格 模型传输对象
 * <P>
 * 实体数据表格部件模型，数据表格包含表格列、表格编辑项更新等模型对象
 */
public class PSDEGrid extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEGrid(){
    }      

    /**
     * <B>AGGMODE</B>&nbsp;聚合模式，指定数据表格的聚合模式，未定义时为【无聚合】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.GridAggMode} 
     */
    public final static String FIELD_AGGMODE = "aggmode";

    /**
     * 设置 聚合模式，详细说明：{@link #FIELD_AGGMODE}
     * 
     * @param aggMode
     * 
     */
    @JsonProperty(FIELD_AGGMODE)
    public void setAggMode(String aggMode){
        this.set(FIELD_AGGMODE, aggMode);
    }
    
    /**
     * 获取 聚合模式  
     * @return
     */
    @JsonIgnore
    public String getAggMode(){
        Object objValue = this.get(FIELD_AGGMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 聚合模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAggModeDirty(){
        if(this.contains(FIELD_AGGMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 聚合模式
     */
    @JsonIgnore
    public void resetAggMode(){
        this.reset(FIELD_AGGMODE);
    }

    /**
     * 设置 聚合模式，详细说明：{@link #FIELD_AGGMODE}
     * <P>
     * 等同 {@link #setAggMode}
     * @param aggMode
     */
    @JsonIgnore
    public PSDEGrid aggmode(String aggMode){
        this.setAggMode(aggMode);
        return this;
    }

     /**
     * 设置 聚合模式，详细说明：{@link #FIELD_AGGMODE}
     * <P>
     * 等同 {@link #setAggMode}
     * @param aggMode
     */
    @JsonIgnore
    public PSDEGrid aggmode(net.ibizsys.psmodel.core.util.PSModelEnums.GridAggMode aggMode){
        if(aggMode == null){
            this.setAggMode(null);
        }
        else{
            this.setAggMode(aggMode.value);
        }
        return this;
    }

    /**
     * <B>AGGPSDEACTIONID</B>&nbsp;聚合实体行为，数据表格聚合模式为【全部远程】需指定聚合处理实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_AGGPSDEACTIONID = "aggpsdeactionid";

    /**
     * 设置 聚合实体行为，详细说明：{@link #FIELD_AGGPSDEACTIONID}
     * 
     * @param aggPSDEActionId
     * 
     */
    @JsonProperty(FIELD_AGGPSDEACTIONID)
    public void setAggPSDEActionId(String aggPSDEActionId){
        this.set(FIELD_AGGPSDEACTIONID, aggPSDEActionId);
    }
    
    /**
     * 获取 聚合实体行为  
     * @return
     */
    @JsonIgnore
    public String getAggPSDEActionId(){
        Object objValue = this.get(FIELD_AGGPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 聚合实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAggPSDEActionIdDirty(){
        if(this.contains(FIELD_AGGPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 聚合实体行为
     */
    @JsonIgnore
    public void resetAggPSDEActionId(){
        this.reset(FIELD_AGGPSDEACTIONID);
    }

    /**
     * 设置 聚合实体行为，详细说明：{@link #FIELD_AGGPSDEACTIONID}
     * <P>
     * 等同 {@link #setAggPSDEActionId}
     * @param aggPSDEActionId
     */
    @JsonIgnore
    public PSDEGrid aggpsdeactionid(String aggPSDEActionId){
        this.setAggPSDEActionId(aggPSDEActionId);
        return this;
    }

    /**
     * 设置 聚合实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setAggPSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDEGrid aggpsdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setAggPSDEActionId(null);
            this.setAggPSDEActionName(null);
        }
        else{
            this.setAggPSDEActionId(pSDEAction.getPSDEActionId());
            this.setAggPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>AGGPSDEACTIONNAME</B>&nbsp;聚合实体行为，数据表格聚合模式为【全部远程】需指定聚合处理实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_AGGPSDEACTIONID}
     */
    public final static String FIELD_AGGPSDEACTIONNAME = "aggpsdeactionname";

    /**
     * 设置 聚合实体行为，详细说明：{@link #FIELD_AGGPSDEACTIONNAME}
     * 
     * @param aggPSDEActionName
     * 
     */
    @JsonProperty(FIELD_AGGPSDEACTIONNAME)
    public void setAggPSDEActionName(String aggPSDEActionName){
        this.set(FIELD_AGGPSDEACTIONNAME, aggPSDEActionName);
    }
    
    /**
     * 获取 聚合实体行为  
     * @return
     */
    @JsonIgnore
    public String getAggPSDEActionName(){
        Object objValue = this.get(FIELD_AGGPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 聚合实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAggPSDEActionNameDirty(){
        if(this.contains(FIELD_AGGPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 聚合实体行为
     */
    @JsonIgnore
    public void resetAggPSDEActionName(){
        this.reset(FIELD_AGGPSDEACTIONNAME);
    }

    /**
     * 设置 聚合实体行为，详细说明：{@link #FIELD_AGGPSDEACTIONNAME}
     * <P>
     * 等同 {@link #setAggPSDEActionName}
     * @param aggPSDEActionName
     */
    @JsonIgnore
    public PSDEGrid aggpsdeactionname(String aggPSDEActionName){
        this.setAggPSDEActionName(aggPSDEActionName);
        return this;
    }

    /**
     * <B>AGGPSDEDSID</B>&nbsp;聚合实体数据集
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataSet} 
     */
    public final static String FIELD_AGGPSDEDSID = "aggpsdedsid";

    /**
     * 设置 聚合实体数据集
     * 
     * @param aggPSDEDSId
     * 
     */
    @JsonProperty(FIELD_AGGPSDEDSID)
    public void setAggPSDEDSId(String aggPSDEDSId){
        this.set(FIELD_AGGPSDEDSID, aggPSDEDSId);
    }
    
    /**
     * 获取 聚合实体数据集  
     * @return
     */
    @JsonIgnore
    public String getAggPSDEDSId(){
        Object objValue = this.get(FIELD_AGGPSDEDSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 聚合实体数据集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAggPSDEDSIdDirty(){
        if(this.contains(FIELD_AGGPSDEDSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 聚合实体数据集
     */
    @JsonIgnore
    public void resetAggPSDEDSId(){
        this.reset(FIELD_AGGPSDEDSID);
    }

    /**
     * 设置 聚合实体数据集
     * <P>
     * 等同 {@link #setAggPSDEDSId}
     * @param aggPSDEDSId
     */
    @JsonIgnore
    public PSDEGrid aggpsdedsid(String aggPSDEDSId){
        this.setAggPSDEDSId(aggPSDEDSId);
        return this;
    }

    /**
     * 设置 聚合实体数据集，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setAggPSDEDSId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSDEGrid aggpsdedsid(PSDEDataSet pSDEDataSet){
        if(pSDEDataSet == null){
            this.setAggPSDEDSId(null);
            this.setAggPSDEDSName(null);
        }
        else{
            this.setAggPSDEDSId(pSDEDataSet.getPSDEDataSetId());
            this.setAggPSDEDSName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    /**
     * <B>AGGPSDEDSNAME</B>&nbsp;聚合数据集
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_AGGPSDEDSID}
     */
    public final static String FIELD_AGGPSDEDSNAME = "aggpsdedsname";

    /**
     * 设置 聚合数据集
     * 
     * @param aggPSDEDSName
     * 
     */
    @JsonProperty(FIELD_AGGPSDEDSNAME)
    public void setAggPSDEDSName(String aggPSDEDSName){
        this.set(FIELD_AGGPSDEDSNAME, aggPSDEDSName);
    }
    
    /**
     * 获取 聚合数据集  
     * @return
     */
    @JsonIgnore
    public String getAggPSDEDSName(){
        Object objValue = this.get(FIELD_AGGPSDEDSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 聚合数据集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAggPSDEDSNameDirty(){
        if(this.contains(FIELD_AGGPSDEDSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 聚合数据集
     */
    @JsonIgnore
    public void resetAggPSDEDSName(){
        this.reset(FIELD_AGGPSDEDSNAME);
    }

    /**
     * 设置 聚合数据集
     * <P>
     * 等同 {@link #setAggPSDEDSName}
     * @param aggPSDEDSName
     */
    @JsonIgnore
    public PSDEGrid aggpsdedsname(String aggPSDEDSName){
        this.setAggPSDEDSName(aggPSDEDSName);
        return this;
    }

    /**
     * <B>AGGPSDEID</B>&nbsp;聚合实体，指定聚合处理实体行为所在实体对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_AGGPSDEID = "aggpsdeid";

    /**
     * 设置 聚合实体，详细说明：{@link #FIELD_AGGPSDEID}
     * 
     * @param aggPSDEId
     * 
     */
    @JsonProperty(FIELD_AGGPSDEID)
    public void setAggPSDEId(String aggPSDEId){
        this.set(FIELD_AGGPSDEID, aggPSDEId);
    }
    
    /**
     * 获取 聚合实体  
     * @return
     */
    @JsonIgnore
    public String getAggPSDEId(){
        Object objValue = this.get(FIELD_AGGPSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 聚合实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAggPSDEIdDirty(){
        if(this.contains(FIELD_AGGPSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 聚合实体
     */
    @JsonIgnore
    public void resetAggPSDEId(){
        this.reset(FIELD_AGGPSDEID);
    }

    /**
     * 设置 聚合实体，详细说明：{@link #FIELD_AGGPSDEID}
     * <P>
     * 等同 {@link #setAggPSDEId}
     * @param aggPSDEId
     */
    @JsonIgnore
    public PSDEGrid aggpsdeid(String aggPSDEId){
        this.setAggPSDEId(aggPSDEId);
        return this;
    }

    /**
     * 设置 聚合实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setAggPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDEGrid aggpsdeid(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setAggPSDEId(null);
            this.setAggPSDEName(null);
        }
        else{
            this.setAggPSDEId(pSDataEntity.getPSDataEntityId());
            this.setAggPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>AGGPSDENAME</B>&nbsp;聚合实体，指定聚合处理实体行为所在实体对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_AGGPSDEID}
     */
    public final static String FIELD_AGGPSDENAME = "aggpsdename";

    /**
     * 设置 聚合实体，详细说明：{@link #FIELD_AGGPSDENAME}
     * 
     * @param aggPSDEName
     * 
     */
    @JsonProperty(FIELD_AGGPSDENAME)
    public void setAggPSDEName(String aggPSDEName){
        this.set(FIELD_AGGPSDENAME, aggPSDEName);
    }
    
    /**
     * 获取 聚合实体  
     * @return
     */
    @JsonIgnore
    public String getAggPSDEName(){
        Object objValue = this.get(FIELD_AGGPSDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 聚合实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAggPSDENameDirty(){
        if(this.contains(FIELD_AGGPSDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 聚合实体
     */
    @JsonIgnore
    public void resetAggPSDEName(){
        this.reset(FIELD_AGGPSDENAME);
    }

    /**
     * 设置 聚合实体，详细说明：{@link #FIELD_AGGPSDENAME}
     * <P>
     * 等同 {@link #setAggPSDEName}
     * @param aggPSDEName
     */
    @JsonIgnore
    public PSDEGrid aggpsdename(String aggPSDEName){
        this.setAggPSDEName(aggPSDEName);
        return this;
    }

    /**
     * <B>AGGPSSYSVIEWPANELID</B>&nbsp;聚合布局面板
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysViewPanel} 
     */
    public final static String FIELD_AGGPSSYSVIEWPANELID = "aggpssysviewpanelid";

    /**
     * 设置 聚合布局面板
     * 
     * @param aggPSSysViewPanelId
     * 
     */
    @JsonProperty(FIELD_AGGPSSYSVIEWPANELID)
    public void setAggPSSysViewPanelId(String aggPSSysViewPanelId){
        this.set(FIELD_AGGPSSYSVIEWPANELID, aggPSSysViewPanelId);
    }
    
    /**
     * 获取 聚合布局面板  
     * @return
     */
    @JsonIgnore
    public String getAggPSSysViewPanelId(){
        Object objValue = this.get(FIELD_AGGPSSYSVIEWPANELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 聚合布局面板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAggPSSysViewPanelIdDirty(){
        if(this.contains(FIELD_AGGPSSYSVIEWPANELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 聚合布局面板
     */
    @JsonIgnore
    public void resetAggPSSysViewPanelId(){
        this.reset(FIELD_AGGPSSYSVIEWPANELID);
    }

    /**
     * 设置 聚合布局面板
     * <P>
     * 等同 {@link #setAggPSSysViewPanelId}
     * @param aggPSSysViewPanelId
     */
    @JsonIgnore
    public PSDEGrid aggpssysviewpanelid(String aggPSSysViewPanelId){
        this.setAggPSSysViewPanelId(aggPSSysViewPanelId);
        return this;
    }

    /**
     * 设置 聚合布局面板，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setAggPSSysViewPanelId}
     * @param pSSysViewPanel 引用对象
     */
    @JsonIgnore
    public PSDEGrid aggpssysviewpanelid(PSSysViewPanel pSSysViewPanel){
        if(pSSysViewPanel == null){
            this.setAggPSSysViewPanelId(null);
            this.setAggPSSysViewPanelName(null);
        }
        else{
            this.setAggPSSysViewPanelId(pSSysViewPanel.getPSSysViewPanelId());
            this.setAggPSSysViewPanelName(pSSysViewPanel.getPSSysViewPanelName());
        }
        return this;
    }

    /**
     * <B>AGGPSSYSVIEWPANELNAME</B>&nbsp;聚合布局面板
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_AGGPSSYSVIEWPANELID}
     */
    public final static String FIELD_AGGPSSYSVIEWPANELNAME = "aggpssysviewpanelname";

    /**
     * 设置 聚合布局面板
     * 
     * @param aggPSSysViewPanelName
     * 
     */
    @JsonProperty(FIELD_AGGPSSYSVIEWPANELNAME)
    public void setAggPSSysViewPanelName(String aggPSSysViewPanelName){
        this.set(FIELD_AGGPSSYSVIEWPANELNAME, aggPSSysViewPanelName);
    }
    
    /**
     * 获取 聚合布局面板  
     * @return
     */
    @JsonIgnore
    public String getAggPSSysViewPanelName(){
        Object objValue = this.get(FIELD_AGGPSSYSVIEWPANELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 聚合布局面板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAggPSSysViewPanelNameDirty(){
        if(this.contains(FIELD_AGGPSSYSVIEWPANELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 聚合布局面板
     */
    @JsonIgnore
    public void resetAggPSSysViewPanelName(){
        this.reset(FIELD_AGGPSSYSVIEWPANELNAME);
    }

    /**
     * 设置 聚合布局面板
     * <P>
     * 等同 {@link #setAggPSSysViewPanelName}
     * @param aggPSSysViewPanelName
     */
    @JsonIgnore
    public PSDEGrid aggpssysviewpanelname(String aggPSSysViewPanelName){
        this.setAggPSSysViewPanelName(aggPSSysViewPanelName);
        return this;
    }

    /**
     * <B>ASYNCPSDEDSID</B>&nbsp;异步实体数据集
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataSet} 
     */
    public final static String FIELD_ASYNCPSDEDSID = "asyncpsdedsid";

    /**
     * 设置 异步实体数据集
     * 
     * @param asyncPSDEDSId
     * 
     */
    @JsonProperty(FIELD_ASYNCPSDEDSID)
    public void setAsyncPSDEDSId(String asyncPSDEDSId){
        this.set(FIELD_ASYNCPSDEDSID, asyncPSDEDSId);
    }
    
    /**
     * 获取 异步实体数据集  
     * @return
     */
    @JsonIgnore
    public String getAsyncPSDEDSId(){
        Object objValue = this.get(FIELD_ASYNCPSDEDSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 异步实体数据集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAsyncPSDEDSIdDirty(){
        if(this.contains(FIELD_ASYNCPSDEDSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 异步实体数据集
     */
    @JsonIgnore
    public void resetAsyncPSDEDSId(){
        this.reset(FIELD_ASYNCPSDEDSID);
    }

    /**
     * 设置 异步实体数据集
     * <P>
     * 等同 {@link #setAsyncPSDEDSId}
     * @param asyncPSDEDSId
     */
    @JsonIgnore
    public PSDEGrid asyncpsdedsid(String asyncPSDEDSId){
        this.setAsyncPSDEDSId(asyncPSDEDSId);
        return this;
    }

    /**
     * 设置 异步实体数据集，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setAsyncPSDEDSId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSDEGrid asyncpsdedsid(PSDEDataSet pSDEDataSet){
        if(pSDEDataSet == null){
            this.setAsyncPSDEDSId(null);
            this.setAsyncPSDEDSName(null);
        }
        else{
            this.setAsyncPSDEDSId(pSDEDataSet.getPSDEDataSetId());
            this.setAsyncPSDEDSName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    /**
     * <B>ASYNCPSDEDSNAME</B>&nbsp;异步实体数据集
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ASYNCPSDEDSID}
     */
    public final static String FIELD_ASYNCPSDEDSNAME = "asyncpsdedsname";

    /**
     * 设置 异步实体数据集
     * 
     * @param asyncPSDEDSName
     * 
     */
    @JsonProperty(FIELD_ASYNCPSDEDSNAME)
    public void setAsyncPSDEDSName(String asyncPSDEDSName){
        this.set(FIELD_ASYNCPSDEDSNAME, asyncPSDEDSName);
    }
    
    /**
     * 获取 异步实体数据集  
     * @return
     */
    @JsonIgnore
    public String getAsyncPSDEDSName(){
        Object objValue = this.get(FIELD_ASYNCPSDEDSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 异步实体数据集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAsyncPSDEDSNameDirty(){
        if(this.contains(FIELD_ASYNCPSDEDSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 异步实体数据集
     */
    @JsonIgnore
    public void resetAsyncPSDEDSName(){
        this.reset(FIELD_ASYNCPSDEDSNAME);
    }

    /**
     * 设置 异步实体数据集
     * <P>
     * 等同 {@link #setAsyncPSDEDSName}
     * @param asyncPSDEDSName
     */
    @JsonIgnore
    public PSDEGrid asyncpsdedsname(String asyncPSDEDSName){
        this.setAsyncPSDEDSName(asyncPSDEDSName);
        return this;
    }

    /**
     * <B>BATPSDETOOLBARID</B>&nbsp;批操作工具栏，指定数据表格部件内建的批操作工具栏对象，批操作工具栏为选择数据提供操作能力
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEToolbar} 
     */
    public final static String FIELD_BATPSDETOOLBARID = "batpsdetoolbarid";

    /**
     * 设置 批操作工具栏，详细说明：{@link #FIELD_BATPSDETOOLBARID}
     * 
     * @param batPSDEToolbarId
     * 
     */
    @JsonProperty(FIELD_BATPSDETOOLBARID)
    public void setBatPSDEToolbarId(String batPSDEToolbarId){
        this.set(FIELD_BATPSDETOOLBARID, batPSDEToolbarId);
    }
    
    /**
     * 获取 批操作工具栏  
     * @return
     */
    @JsonIgnore
    public String getBatPSDEToolbarId(){
        Object objValue = this.get(FIELD_BATPSDETOOLBARID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 批操作工具栏 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBatPSDEToolbarIdDirty(){
        if(this.contains(FIELD_BATPSDETOOLBARID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 批操作工具栏
     */
    @JsonIgnore
    public void resetBatPSDEToolbarId(){
        this.reset(FIELD_BATPSDETOOLBARID);
    }

    /**
     * 设置 批操作工具栏，详细说明：{@link #FIELD_BATPSDETOOLBARID}
     * <P>
     * 等同 {@link #setBatPSDEToolbarId}
     * @param batPSDEToolbarId
     */
    @JsonIgnore
    public PSDEGrid batpsdetoolbarid(String batPSDEToolbarId){
        this.setBatPSDEToolbarId(batPSDEToolbarId);
        return this;
    }

    /**
     * 设置 批操作工具栏，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setBatPSDEToolbarId}
     * @param pSDEToolbar 引用对象
     */
    @JsonIgnore
    public PSDEGrid batpsdetoolbarid(PSDEToolbar pSDEToolbar){
        if(pSDEToolbar == null){
            this.setBatPSDEToolbarId(null);
            this.setBatPSDEToolbarName(null);
        }
        else{
            this.setBatPSDEToolbarId(pSDEToolbar.getPSDEToolbarId());
            this.setBatPSDEToolbarName(pSDEToolbar.getPSDEToolbarName());
        }
        return this;
    }

    /**
     * <B>BATPSDETOOLBARNAME</B>&nbsp;批操作工具栏，指定数据表格部件内建的批操作工具栏对象，批操作工具栏为选择数据提供操作能力
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_BATPSDETOOLBARID}
     */
    public final static String FIELD_BATPSDETOOLBARNAME = "batpsdetoolbarname";

    /**
     * 设置 批操作工具栏，详细说明：{@link #FIELD_BATPSDETOOLBARNAME}
     * 
     * @param batPSDEToolbarName
     * 
     */
    @JsonProperty(FIELD_BATPSDETOOLBARNAME)
    public void setBatPSDEToolbarName(String batPSDEToolbarName){
        this.set(FIELD_BATPSDETOOLBARNAME, batPSDEToolbarName);
    }
    
    /**
     * 获取 批操作工具栏  
     * @return
     */
    @JsonIgnore
    public String getBatPSDEToolbarName(){
        Object objValue = this.get(FIELD_BATPSDETOOLBARNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 批操作工具栏 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBatPSDEToolbarNameDirty(){
        if(this.contains(FIELD_BATPSDETOOLBARNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 批操作工具栏
     */
    @JsonIgnore
    public void resetBatPSDEToolbarName(){
        this.reset(FIELD_BATPSDETOOLBARNAME);
    }

    /**
     * 设置 批操作工具栏，详细说明：{@link #FIELD_BATPSDETOOLBARNAME}
     * <P>
     * 等同 {@link #setBatPSDEToolbarName}
     * @param batPSDEToolbarName
     */
    @JsonIgnore
    public PSDEGrid batpsdetoolbarname(String batPSDEToolbarName){
        this.setBatPSDEToolbarName(batPSDEToolbarName);
        return this;
    }

    /**
     * <B>BUFFERRENDERERMODE</B>&nbsp;缓存绘制模式，指定数据表格是否使用缓存绘制模式，未定义时为【是】。此配置为早期前端技术使用
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_BUFFERRENDERERMODE = "bufferrenderermode";

    /**
     * 设置 缓存绘制模式，详细说明：{@link #FIELD_BUFFERRENDERERMODE}
     * 
     * @param bufferRendererMode
     * 
     */
    @JsonProperty(FIELD_BUFFERRENDERERMODE)
    public void setBufferRendererMode(Integer bufferRendererMode){
        this.set(FIELD_BUFFERRENDERERMODE, bufferRendererMode);
    }
    
    /**
     * 获取 缓存绘制模式  
     * @return
     */
    @JsonIgnore
    public Integer getBufferRendererMode(){
        Object objValue = this.get(FIELD_BUFFERRENDERERMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 缓存绘制模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBufferRendererModeDirty(){
        if(this.contains(FIELD_BUFFERRENDERERMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 缓存绘制模式
     */
    @JsonIgnore
    public void resetBufferRendererMode(){
        this.reset(FIELD_BUFFERRENDERERMODE);
    }

    /**
     * 设置 缓存绘制模式，详细说明：{@link #FIELD_BUFFERRENDERERMODE}
     * <P>
     * 等同 {@link #setBufferRendererMode}
     * @param bufferRendererMode
     */
    @JsonIgnore
    public PSDEGrid bufferrenderermode(Integer bufferRendererMode){
        this.setBufferRendererMode(bufferRendererMode);
        return this;
    }

     /**
     * 设置 缓存绘制模式，详细说明：{@link #FIELD_BUFFERRENDERERMODE}
     * <P>
     * 等同 {@link #setBufferRendererMode}
     * @param bufferRendererMode
     */
    @JsonIgnore
    public PSDEGrid bufferrenderermode(Boolean bufferRendererMode){
        if(bufferRendererMode == null){
            this.setBufferRendererMode(null);
        }
        else{
            this.setBufferRendererMode(bufferRendererMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>BUSYINDICATOR</B>&nbsp;显示处理提示
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_BUSYINDICATOR = "busyindicator";

    /**
     * 设置 显示处理提示
     * 
     * @param busyIndicator
     * 
     */
    @JsonProperty(FIELD_BUSYINDICATOR)
    public void setBusyIndicator(Integer busyIndicator){
        this.set(FIELD_BUSYINDICATOR, busyIndicator);
    }
    
    /**
     * 获取 显示处理提示  
     * @return
     */
    @JsonIgnore
    public Integer getBusyIndicator(){
        Object objValue = this.get(FIELD_BUSYINDICATOR);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 显示处理提示 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBusyIndicatorDirty(){
        if(this.contains(FIELD_BUSYINDICATOR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 显示处理提示
     */
    @JsonIgnore
    public void resetBusyIndicator(){
        this.reset(FIELD_BUSYINDICATOR);
    }

    /**
     * 设置 显示处理提示
     * <P>
     * 等同 {@link #setBusyIndicator}
     * @param busyIndicator
     */
    @JsonIgnore
    public PSDEGrid busyindicator(Integer busyIndicator){
        this.setBusyIndicator(busyIndicator);
        return this;
    }

     /**
     * 设置 显示处理提示
     * <P>
     * 等同 {@link #setBusyIndicator}
     * @param busyIndicator
     */
    @JsonIgnore
    public PSDEGrid busyindicator(Boolean busyIndicator){
        if(busyIndicator == null){
            this.setBusyIndicator(null);
        }
        else{
            this.setBusyIndicator(busyIndicator?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定表格的代码标识，需要在所在的实体中具有唯一性
     * <P>
     * 字符串：最大长度 60，由字母、数字、下划线组成，且开始必须为字母
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
    public PSDEGrid codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>COLENABLEFILTER</B>&nbsp;启用列过滤器，指定数据表格列启用过滤器的模式，未定义时使用前端应用的配置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEGridColLinkMode} 
     */
    public final static String FIELD_COLENABLEFILTER = "colenablefilter";

    /**
     * 设置 启用列过滤器，详细说明：{@link #FIELD_COLENABLEFILTER}
     * 
     * @param colEnableFilter
     * 
     */
    @JsonProperty(FIELD_COLENABLEFILTER)
    public void setColEnableFilter(Integer colEnableFilter){
        this.set(FIELD_COLENABLEFILTER, colEnableFilter);
    }
    
    /**
     * 获取 启用列过滤器  
     * @return
     */
    @JsonIgnore
    public Integer getColEnableFilter(){
        Object objValue = this.get(FIELD_COLENABLEFILTER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用列过滤器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isColEnableFilterDirty(){
        if(this.contains(FIELD_COLENABLEFILTER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用列过滤器
     */
    @JsonIgnore
    public void resetColEnableFilter(){
        this.reset(FIELD_COLENABLEFILTER);
    }

    /**
     * 设置 启用列过滤器，详细说明：{@link #FIELD_COLENABLEFILTER}
     * <P>
     * 等同 {@link #setColEnableFilter}
     * @param colEnableFilter
     */
    @JsonIgnore
    public PSDEGrid colenablefilter(Integer colEnableFilter){
        this.setColEnableFilter(colEnableFilter);
        return this;
    }

     /**
     * 设置 启用列过滤器，详细说明：{@link #FIELD_COLENABLEFILTER}
     * <P>
     * 等同 {@link #setColEnableFilter}
     * @param colEnableFilter
     */
    @JsonIgnore
    public PSDEGrid colenablefilter(net.ibizsys.psmodel.core.util.PSModelEnums.DEGridColLinkMode colEnableFilter){
        if(colEnableFilter == null){
            this.setColEnableFilter(null);
        }
        else{
            this.setColEnableFilter(colEnableFilter.value);
        }
        return this;
    }

    /**
     * <B>COLENABLELINK</B>&nbsp;列启用链接，指定数据表格列启用链接的模式，未定义时使用前端应用的配置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEGridColLinkMode} 
     */
    public final static String FIELD_COLENABLELINK = "colenablelink";

    /**
     * 设置 列启用链接，详细说明：{@link #FIELD_COLENABLELINK}
     * 
     * @param colEnableLink
     * 
     */
    @JsonProperty(FIELD_COLENABLELINK)
    public void setColEnableLink(Integer colEnableLink){
        this.set(FIELD_COLENABLELINK, colEnableLink);
    }
    
    /**
     * 获取 列启用链接  
     * @return
     */
    @JsonIgnore
    public Integer getColEnableLink(){
        Object objValue = this.get(FIELD_COLENABLELINK);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 列启用链接 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isColEnableLinkDirty(){
        if(this.contains(FIELD_COLENABLELINK)){
            return true;
        }
        return false;
    }

    /**
     * 重置 列启用链接
     */
    @JsonIgnore
    public void resetColEnableLink(){
        this.reset(FIELD_COLENABLELINK);
    }

    /**
     * 设置 列启用链接，详细说明：{@link #FIELD_COLENABLELINK}
     * <P>
     * 等同 {@link #setColEnableLink}
     * @param colEnableLink
     */
    @JsonIgnore
    public PSDEGrid colenablelink(Integer colEnableLink){
        this.setColEnableLink(colEnableLink);
        return this;
    }

     /**
     * 设置 列启用链接，详细说明：{@link #FIELD_COLENABLELINK}
     * <P>
     * 等同 {@link #setColEnableLink}
     * @param colEnableLink
     */
    @JsonIgnore
    public PSDEGrid colenablelink(net.ibizsys.psmodel.core.util.PSModelEnums.DEGridColLinkMode colEnableLink){
        if(colEnableLink == null){
            this.setColEnableLink(null);
        }
        else{
            this.setColEnableLink(colEnableLink.value);
        }
        return this;
    }

    /**
     * <B>COPYPSDEACTIONID</B>&nbsp;复制数据实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_COPYPSDEACTIONID = "copypsdeactionid";

    /**
     * 设置 复制数据实体行为
     * 
     * @param copyPSDEActionId
     * 
     */
    @JsonProperty(FIELD_COPYPSDEACTIONID)
    public void setCopyPSDEActionId(String copyPSDEActionId){
        this.set(FIELD_COPYPSDEACTIONID, copyPSDEActionId);
    }
    
    /**
     * 获取 复制数据实体行为  
     * @return
     */
    @JsonIgnore
    public String getCopyPSDEActionId(){
        Object objValue = this.get(FIELD_COPYPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 复制数据实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCopyPSDEActionIdDirty(){
        if(this.contains(FIELD_COPYPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 复制数据实体行为
     */
    @JsonIgnore
    public void resetCopyPSDEActionId(){
        this.reset(FIELD_COPYPSDEACTIONID);
    }

    /**
     * 设置 复制数据实体行为
     * <P>
     * 等同 {@link #setCopyPSDEActionId}
     * @param copyPSDEActionId
     */
    @JsonIgnore
    public PSDEGrid copypsdeactionid(String copyPSDEActionId){
        this.setCopyPSDEActionId(copyPSDEActionId);
        return this;
    }

    /**
     * 设置 复制数据实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setCopyPSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDEGrid copypsdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setCopyPSDEActionId(null);
            this.setCopyPSDEActionName(null);
        }
        else{
            this.setCopyPSDEActionId(pSDEAction.getPSDEActionId());
            this.setCopyPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>COPYPSDEACTIONNAME</B>&nbsp;复制数据实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_COPYPSDEACTIONID}
     */
    public final static String FIELD_COPYPSDEACTIONNAME = "copypsdeactionname";

    /**
     * 设置 复制数据实体行为
     * 
     * @param copyPSDEActionName
     * 
     */
    @JsonProperty(FIELD_COPYPSDEACTIONNAME)
    public void setCopyPSDEActionName(String copyPSDEActionName){
        this.set(FIELD_COPYPSDEACTIONNAME, copyPSDEActionName);
    }
    
    /**
     * 获取 复制数据实体行为  
     * @return
     */
    @JsonIgnore
    public String getCopyPSDEActionName(){
        Object objValue = this.get(FIELD_COPYPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 复制数据实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCopyPSDEActionNameDirty(){
        if(this.contains(FIELD_COPYPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 复制数据实体行为
     */
    @JsonIgnore
    public void resetCopyPSDEActionName(){
        this.reset(FIELD_COPYPSDEACTIONNAME);
    }

    /**
     * 设置 复制数据实体行为
     * <P>
     * 等同 {@link #setCopyPSDEActionName}
     * @param copyPSDEActionName
     */
    @JsonIgnore
    public PSDEGrid copypsdeactionname(String copyPSDEActionName){
        this.setCopyPSDEActionName(copyPSDEActionName);
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
    public PSDEGrid createdate(String createDate){
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
    public PSDEGrid createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CREATEPSDEACTIONID</B>&nbsp;建立数据实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_CREATEPSDEACTIONID = "createpsdeactionid";

    /**
     * 设置 建立数据实体行为
     * 
     * @param createPSDEActionId
     * 
     */
    @JsonProperty(FIELD_CREATEPSDEACTIONID)
    public void setCreatePSDEActionId(String createPSDEActionId){
        this.set(FIELD_CREATEPSDEACTIONID, createPSDEActionId);
    }
    
    /**
     * 获取 建立数据实体行为  
     * @return
     */
    @JsonIgnore
    public String getCreatePSDEActionId(){
        Object objValue = this.get(FIELD_CREATEPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 建立数据实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCreatePSDEActionIdDirty(){
        if(this.contains(FIELD_CREATEPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 建立数据实体行为
     */
    @JsonIgnore
    public void resetCreatePSDEActionId(){
        this.reset(FIELD_CREATEPSDEACTIONID);
    }

    /**
     * 设置 建立数据实体行为
     * <P>
     * 等同 {@link #setCreatePSDEActionId}
     * @param createPSDEActionId
     */
    @JsonIgnore
    public PSDEGrid createpsdeactionid(String createPSDEActionId){
        this.setCreatePSDEActionId(createPSDEActionId);
        return this;
    }

    /**
     * 设置 建立数据实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setCreatePSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDEGrid createpsdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setCreatePSDEActionId(null);
            this.setCreatePSDEActionName(null);
        }
        else{
            this.setCreatePSDEActionId(pSDEAction.getPSDEActionId());
            this.setCreatePSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>CREATEPSDEACTIONNAME</B>&nbsp;建立数据实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CREATEPSDEACTIONID}
     */
    public final static String FIELD_CREATEPSDEACTIONNAME = "createpsdeactionname";

    /**
     * 设置 建立数据实体行为
     * 
     * @param createPSDEActionName
     * 
     */
    @JsonProperty(FIELD_CREATEPSDEACTIONNAME)
    public void setCreatePSDEActionName(String createPSDEActionName){
        this.set(FIELD_CREATEPSDEACTIONNAME, createPSDEActionName);
    }
    
    /**
     * 获取 建立数据实体行为  
     * @return
     */
    @JsonIgnore
    public String getCreatePSDEActionName(){
        Object objValue = this.get(FIELD_CREATEPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 建立数据实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCreatePSDEActionNameDirty(){
        if(this.contains(FIELD_CREATEPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 建立数据实体行为
     */
    @JsonIgnore
    public void resetCreatePSDEActionName(){
        this.reset(FIELD_CREATEPSDEACTIONNAME);
    }

    /**
     * 设置 建立数据实体行为
     * <P>
     * 等同 {@link #setCreatePSDEActionName}
     * @param createPSDEActionName
     */
    @JsonIgnore
    public PSDEGrid createpsdeactionname(String createPSDEActionName){
        this.setCreatePSDEActionName(createPSDEActionName);
        return this;
    }

    /**
     * <B>CUSTOMCOND</B>&nbsp;自定义条件
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_CUSTOMCOND = "customcond";

    /**
     * 设置 自定义条件
     * 
     * @param customCond
     * 
     */
    @JsonProperty(FIELD_CUSTOMCOND)
    public void setCustomCond(String customCond){
        this.set(FIELD_CUSTOMCOND, customCond);
    }
    
    /**
     * 获取 自定义条件  
     * @return
     */
    @JsonIgnore
    public String getCustomCond(){
        Object objValue = this.get(FIELD_CUSTOMCOND);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义条件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomCondDirty(){
        if(this.contains(FIELD_CUSTOMCOND)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义条件
     */
    @JsonIgnore
    public void resetCustomCond(){
        this.reset(FIELD_CUSTOMCOND);
    }

    /**
     * 设置 自定义条件
     * <P>
     * 等同 {@link #setCustomCond}
     * @param customCond
     */
    @JsonIgnore
    public PSDEGrid customcond(String customCond){
        this.setCustomCond(customCond);
        return this;
    }

    /**
     * <B>CUSTOMTYPE</B>&nbsp;自定义类型
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_CUSTOMTYPE = "customtype";

    /**
     * 设置 自定义类型
     * 
     * @param customType
     * 
     */
    @JsonProperty(FIELD_CUSTOMTYPE)
    public void setCustomType(String customType){
        this.set(FIELD_CUSTOMTYPE, customType);
    }
    
    /**
     * 获取 自定义类型  
     * @return
     */
    @JsonIgnore
    public String getCustomType(){
        Object objValue = this.get(FIELD_CUSTOMTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomTypeDirty(){
        if(this.contains(FIELD_CUSTOMTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义类型
     */
    @JsonIgnore
    public void resetCustomType(){
        this.reset(FIELD_CUSTOMTYPE);
    }

    /**
     * 设置 自定义类型
     * <P>
     * 等同 {@link #setCustomType}
     * @param customType
     */
    @JsonIgnore
    public PSDEGrid customtype(String customType){
        this.setCustomType(customType);
        return this;
    }

    /**
     * <B>EMPTYTEXT</B>&nbsp;无值显示内容，指定数据表格部件的无数据显示内容，未定义时使用前端应用配置
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_EMPTYTEXT = "emptytext";

    /**
     * 设置 无值显示内容，详细说明：{@link #FIELD_EMPTYTEXT}
     * 
     * @param emptyText
     * 
     */
    @JsonProperty(FIELD_EMPTYTEXT)
    public void setEmptyText(String emptyText){
        this.set(FIELD_EMPTYTEXT, emptyText);
    }
    
    /**
     * 获取 无值显示内容  
     * @return
     */
    @JsonIgnore
    public String getEmptyText(){
        Object objValue = this.get(FIELD_EMPTYTEXT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 无值显示内容 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEmptyTextDirty(){
        if(this.contains(FIELD_EMPTYTEXT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 无值显示内容
     */
    @JsonIgnore
    public void resetEmptyText(){
        this.reset(FIELD_EMPTYTEXT);
    }

    /**
     * 设置 无值显示内容，详细说明：{@link #FIELD_EMPTYTEXT}
     * <P>
     * 等同 {@link #setEmptyText}
     * @param emptyText
     */
    @JsonIgnore
    public PSDEGrid emptytext(String emptyText){
        this.setEmptyText(emptyText);
        return this;
    }

    /**
     * <B>EMPTYTEXTPSLANRESID</B>&nbsp;无值内容语言资源，指定数据表格部件的无值显示内容多语言资源对象，未定义时使用前端应用配置
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_EMPTYTEXTPSLANRESID = "emptytextpslanresid";

    /**
     * 设置 无值内容语言资源，详细说明：{@link #FIELD_EMPTYTEXTPSLANRESID}
     * 
     * @param emptyTextPSLanResId
     * 
     */
    @JsonProperty(FIELD_EMPTYTEXTPSLANRESID)
    public void setEmptyTextPSLanResId(String emptyTextPSLanResId){
        this.set(FIELD_EMPTYTEXTPSLANRESID, emptyTextPSLanResId);
    }
    
    /**
     * 获取 无值内容语言资源  
     * @return
     */
    @JsonIgnore
    public String getEmptyTextPSLanResId(){
        Object objValue = this.get(FIELD_EMPTYTEXTPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 无值内容语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEmptyTextPSLanResIdDirty(){
        if(this.contains(FIELD_EMPTYTEXTPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 无值内容语言资源
     */
    @JsonIgnore
    public void resetEmptyTextPSLanResId(){
        this.reset(FIELD_EMPTYTEXTPSLANRESID);
    }

    /**
     * 设置 无值内容语言资源，详细说明：{@link #FIELD_EMPTYTEXTPSLANRESID}
     * <P>
     * 等同 {@link #setEmptyTextPSLanResId}
     * @param emptyTextPSLanResId
     */
    @JsonIgnore
    public PSDEGrid emptytextpslanresid(String emptyTextPSLanResId){
        this.setEmptyTextPSLanResId(emptyTextPSLanResId);
        return this;
    }

    /**
     * 设置 无值内容语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setEmptyTextPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSDEGrid emptytextpslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setEmptyTextPSLanResId(null);
            this.setEmptyTextPSLanResName(null);
        }
        else{
            this.setEmptyTextPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setEmptyTextPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>EMPTYTEXTPSLANRESNAME</B>&nbsp;无值内容语言资源，指定数据表格部件的无值显示内容多语言资源对象，未定义时使用前端应用配置
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_EMPTYTEXTPSLANRESID}
     */
    public final static String FIELD_EMPTYTEXTPSLANRESNAME = "emptytextpslanresname";

    /**
     * 设置 无值内容语言资源，详细说明：{@link #FIELD_EMPTYTEXTPSLANRESNAME}
     * 
     * @param emptyTextPSLanResName
     * 
     */
    @JsonProperty(FIELD_EMPTYTEXTPSLANRESNAME)
    public void setEmptyTextPSLanResName(String emptyTextPSLanResName){
        this.set(FIELD_EMPTYTEXTPSLANRESNAME, emptyTextPSLanResName);
    }
    
    /**
     * 获取 无值内容语言资源  
     * @return
     */
    @JsonIgnore
    public String getEmptyTextPSLanResName(){
        Object objValue = this.get(FIELD_EMPTYTEXTPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 无值内容语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEmptyTextPSLanResNameDirty(){
        if(this.contains(FIELD_EMPTYTEXTPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 无值内容语言资源
     */
    @JsonIgnore
    public void resetEmptyTextPSLanResName(){
        this.reset(FIELD_EMPTYTEXTPSLANRESNAME);
    }

    /**
     * 设置 无值内容语言资源，详细说明：{@link #FIELD_EMPTYTEXTPSLANRESNAME}
     * <P>
     * 等同 {@link #setEmptyTextPSLanResName}
     * @param emptyTextPSLanResName
     */
    @JsonIgnore
    public PSDEGrid emptytextpslanresname(String emptyTextPSLanResName){
        this.setEmptyTextPSLanResName(emptyTextPSLanResName);
        return this;
    }

    /**
     * <B>ENABLECUSTOMIZED</B>&nbsp;支持定制
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLECUSTOMIZED = "enablecustomized";

    /**
     * 设置 支持定制
     * 
     * @param enableCustomized
     * 
     */
    @JsonProperty(FIELD_ENABLECUSTOMIZED)
    public void setEnableCustomized(Integer enableCustomized){
        this.set(FIELD_ENABLECUSTOMIZED, enableCustomized);
    }
    
    /**
     * 获取 支持定制  
     * @return
     */
    @JsonIgnore
    public Integer getEnableCustomized(){
        Object objValue = this.get(FIELD_ENABLECUSTOMIZED);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持定制 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableCustomizedDirty(){
        if(this.contains(FIELD_ENABLECUSTOMIZED)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持定制
     */
    @JsonIgnore
    public void resetEnableCustomized(){
        this.reset(FIELD_ENABLECUSTOMIZED);
    }

    /**
     * 设置 支持定制
     * <P>
     * 等同 {@link #setEnableCustomized}
     * @param enableCustomized
     */
    @JsonIgnore
    public PSDEGrid enablecustomized(Integer enableCustomized){
        this.setEnableCustomized(enableCustomized);
        return this;
    }

     /**
     * 设置 支持定制
     * <P>
     * 等同 {@link #setEnableCustomized}
     * @param enableCustomized
     */
    @JsonIgnore
    public PSDEGrid enablecustomized(Boolean enableCustomized){
        if(enableCustomized == null){
            this.setEnableCustomized(null);
        }
        else{
            this.setEnableCustomized(enableCustomized?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEEDIT</B>&nbsp;启用编辑
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.GridEditMode} 
     */
    public final static String FIELD_ENABLEEDIT = "enableedit";

    /**
     * 设置 启用编辑
     * 
     * @param enableEdit
     * 
     */
    @JsonProperty(FIELD_ENABLEEDIT)
    public void setEnableEdit(Integer enableEdit){
        this.set(FIELD_ENABLEEDIT, enableEdit);
    }
    
    /**
     * 获取 启用编辑  
     * @return
     */
    @JsonIgnore
    public Integer getEnableEdit(){
        Object objValue = this.get(FIELD_ENABLEEDIT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用编辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableEditDirty(){
        if(this.contains(FIELD_ENABLEEDIT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用编辑
     */
    @JsonIgnore
    public void resetEnableEdit(){
        this.reset(FIELD_ENABLEEDIT);
    }

    /**
     * 设置 启用编辑
     * <P>
     * 等同 {@link #setEnableEdit}
     * @param enableEdit
     */
    @JsonIgnore
    public PSDEGrid enableedit(Integer enableEdit){
        this.setEnableEdit(enableEdit);
        return this;
    }

     /**
     * 设置 启用编辑
     * <P>
     * 等同 {@link #setEnableEdit}
     * @param enableEdit
     */
    @JsonIgnore
    public PSDEGrid enableedit(net.ibizsys.psmodel.core.util.PSModelEnums.GridEditMode[] enableEdit){
        if(enableEdit == null || enableEdit.length == 0){
            this.setEnableEdit(null);
        }
        else{
            int _value = 0;
            for(net.ibizsys.psmodel.core.util.PSModelEnums.GridEditMode _item : enableEdit){
                _value |= _item.value;
            }
            this.setEnableEdit(_value);
        }
        return this;
    }

    /**
     * <B>ENABLEITEMPRIV</B>&nbsp;启用项权限控制
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEITEMPRIV = "enableitempriv";

    /**
     * 设置 启用项权限控制
     * 
     * @param enableItemPriv
     * 
     */
    @JsonProperty(FIELD_ENABLEITEMPRIV)
    public void setEnableItemPriv(Integer enableItemPriv){
        this.set(FIELD_ENABLEITEMPRIV, enableItemPriv);
    }
    
    /**
     * 获取 启用项权限控制  
     * @return
     */
    @JsonIgnore
    public Integer getEnableItemPriv(){
        Object objValue = this.get(FIELD_ENABLEITEMPRIV);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用项权限控制 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableItemPrivDirty(){
        if(this.contains(FIELD_ENABLEITEMPRIV)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用项权限控制
     */
    @JsonIgnore
    public void resetEnableItemPriv(){
        this.reset(FIELD_ENABLEITEMPRIV);
    }

    /**
     * 设置 启用项权限控制
     * <P>
     * 等同 {@link #setEnableItemPriv}
     * @param enableItemPriv
     */
    @JsonIgnore
    public PSDEGrid enableitempriv(Integer enableItemPriv){
        this.setEnableItemPriv(enableItemPriv);
        return this;
    }

     /**
     * 设置 启用项权限控制
     * <P>
     * 等同 {@link #setEnableItemPriv}
     * @param enableItemPriv
     */
    @JsonIgnore
    public PSDEGrid enableitempriv(Boolean enableItemPriv){
        if(enableItemPriv == null){
            this.setEnableItemPriv(null);
        }
        else{
            this.setEnableItemPriv(enableItemPriv?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEPAGINGBAR</B>&nbsp;启用分页，指定数据表格是否支持分页工具栏，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.PagingMode} 
     */
    public final static String FIELD_ENABLEPAGINGBAR = "enablepagingbar";

    /**
     * 设置 启用分页，详细说明：{@link #FIELD_ENABLEPAGINGBAR}
     * 
     * @param enablePagingBar
     * 
     */
    @JsonProperty(FIELD_ENABLEPAGINGBAR)
    public void setEnablePagingBar(Integer enablePagingBar){
        this.set(FIELD_ENABLEPAGINGBAR, enablePagingBar);
    }
    
    /**
     * 获取 启用分页  
     * @return
     */
    @JsonIgnore
    public Integer getEnablePagingBar(){
        Object objValue = this.get(FIELD_ENABLEPAGINGBAR);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用分页 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnablePagingBarDirty(){
        if(this.contains(FIELD_ENABLEPAGINGBAR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用分页
     */
    @JsonIgnore
    public void resetEnablePagingBar(){
        this.reset(FIELD_ENABLEPAGINGBAR);
    }

    /**
     * 设置 启用分页，详细说明：{@link #FIELD_ENABLEPAGINGBAR}
     * <P>
     * 等同 {@link #setEnablePagingBar}
     * @param enablePagingBar
     */
    @JsonIgnore
    public PSDEGrid enablepagingbar(Integer enablePagingBar){
        this.setEnablePagingBar(enablePagingBar);
        return this;
    }

     /**
     * 设置 启用分页，详细说明：{@link #FIELD_ENABLEPAGINGBAR}
     * <P>
     * 等同 {@link #setEnablePagingBar}
     * @param enablePagingBar
     */
    @JsonIgnore
    public PSDEGrid enablepagingbar(net.ibizsys.psmodel.core.util.PSModelEnums.PagingMode enablePagingBar){
        if(enablePagingBar == null){
            this.setEnablePagingBar(null);
        }
        else{
            this.setEnablePagingBar(enablePagingBar.value);
        }
        return this;
    }

    /**
     * <B>FORCEFIT</B>&nbsp;适应屏宽，指定数据表格部件是否拉伸满屏显示，未定义时使用前端应用配置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_FORCEFIT = "forcefit";

    /**
     * 设置 适应屏宽，详细说明：{@link #FIELD_FORCEFIT}
     * 
     * @param forceFit
     * 
     */
    @JsonProperty(FIELD_FORCEFIT)
    public void setForceFit(Integer forceFit){
        this.set(FIELD_FORCEFIT, forceFit);
    }
    
    /**
     * 获取 适应屏宽  
     * @return
     */
    @JsonIgnore
    public Integer getForceFit(){
        Object objValue = this.get(FIELD_FORCEFIT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 适应屏宽 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isForceFitDirty(){
        if(this.contains(FIELD_FORCEFIT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 适应屏宽
     */
    @JsonIgnore
    public void resetForceFit(){
        this.reset(FIELD_FORCEFIT);
    }

    /**
     * 设置 适应屏宽，详细说明：{@link #FIELD_FORCEFIT}
     * <P>
     * 等同 {@link #setForceFit}
     * @param forceFit
     */
    @JsonIgnore
    public PSDEGrid forcefit(Integer forceFit){
        this.setForceFit(forceFit);
        return this;
    }

     /**
     * 设置 适应屏宽，详细说明：{@link #FIELD_FORCEFIT}
     * <P>
     * 等同 {@link #setForceFit}
     * @param forceFit
     */
    @JsonIgnore
    public PSDEGrid forcefit(Boolean forceFit){
        if(forceFit == null){
            this.setForceFit(null);
        }
        else{
            this.setForceFit(forceFit?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>FROZENCOL</B>&nbsp;固定列数
     */
    public final static String FIELD_FROZENCOL = "frozencol";

    /**
     * 设置 固定列数
     * 
     * @param frozenCol
     * 
     */
    @JsonProperty(FIELD_FROZENCOL)
    public void setFrozenCol(Integer frozenCol){
        this.set(FIELD_FROZENCOL, frozenCol);
    }
    
    /**
     * 获取 固定列数  
     * @return
     */
    @JsonIgnore
    public Integer getFrozenCol(){
        Object objValue = this.get(FIELD_FROZENCOL);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 固定列数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFrozenColDirty(){
        if(this.contains(FIELD_FROZENCOL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 固定列数
     */
    @JsonIgnore
    public void resetFrozenCol(){
        this.reset(FIELD_FROZENCOL);
    }

    /**
     * 设置 固定列数
     * <P>
     * 等同 {@link #setFrozenCol}
     * @param frozenCol
     */
    @JsonIgnore
    public PSDEGrid frozencol(Integer frozenCol){
        this.setFrozenCol(frozenCol);
        return this;
    }

    /**
     * <B>FROZENLASTCOL</B>&nbsp;固定末尾列数
     */
    public final static String FIELD_FROZENLASTCOL = "frozenlastcol";

    /**
     * 设置 固定末尾列数
     * 
     * @param frozenLastCol
     * 
     */
    @JsonProperty(FIELD_FROZENLASTCOL)
    public void setFrozenLastCol(Integer frozenLastCol){
        this.set(FIELD_FROZENLASTCOL, frozenLastCol);
    }
    
    /**
     * 获取 固定末尾列数  
     * @return
     */
    @JsonIgnore
    public Integer getFrozenLastCol(){
        Object objValue = this.get(FIELD_FROZENLASTCOL);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 固定末尾列数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFrozenLastColDirty(){
        if(this.contains(FIELD_FROZENLASTCOL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 固定末尾列数
     */
    @JsonIgnore
    public void resetFrozenLastCol(){
        this.reset(FIELD_FROZENLASTCOL);
    }

    /**
     * 设置 固定末尾列数
     * <P>
     * 等同 {@link #setFrozenLastCol}
     * @param frozenLastCol
     */
    @JsonIgnore
    public PSDEGrid frozenlastcol(Integer frozenLastCol){
        this.setFrozenLastCol(frozenLastCol);
        return this;
    }

    /**
     * <B>GETDRAFTPSDEACTIONID</B>&nbsp;获取草稿数据实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_GETDRAFTPSDEACTIONID = "getdraftpsdeactionid";

    /**
     * 设置 获取草稿数据实体行为
     * 
     * @param getDraftPSDEActionId
     * 
     */
    @JsonProperty(FIELD_GETDRAFTPSDEACTIONID)
    public void setGetDraftPSDEActionId(String getDraftPSDEActionId){
        this.set(FIELD_GETDRAFTPSDEACTIONID, getDraftPSDEActionId);
    }
    
    /**
     * 获取 获取草稿数据实体行为  
     * @return
     */
    @JsonIgnore
    public String getGetDraftPSDEActionId(){
        Object objValue = this.get(FIELD_GETDRAFTPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 获取草稿数据实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGetDraftPSDEActionIdDirty(){
        if(this.contains(FIELD_GETDRAFTPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 获取草稿数据实体行为
     */
    @JsonIgnore
    public void resetGetDraftPSDEActionId(){
        this.reset(FIELD_GETDRAFTPSDEACTIONID);
    }

    /**
     * 设置 获取草稿数据实体行为
     * <P>
     * 等同 {@link #setGetDraftPSDEActionId}
     * @param getDraftPSDEActionId
     */
    @JsonIgnore
    public PSDEGrid getdraftpsdeactionid(String getDraftPSDEActionId){
        this.setGetDraftPSDEActionId(getDraftPSDEActionId);
        return this;
    }

    /**
     * 设置 获取草稿数据实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setGetDraftPSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDEGrid getdraftpsdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setGetDraftPSDEActionId(null);
            this.setGetDraftPSDEActionName(null);
        }
        else{
            this.setGetDraftPSDEActionId(pSDEAction.getPSDEActionId());
            this.setGetDraftPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>GETDRAFTPSDEACTIONNAME</B>&nbsp;获取草稿实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GETDRAFTPSDEACTIONID}
     */
    public final static String FIELD_GETDRAFTPSDEACTIONNAME = "getdraftpsdeactionname";

    /**
     * 设置 获取草稿实体行为
     * 
     * @param getDraftPSDEActionName
     * 
     */
    @JsonProperty(FIELD_GETDRAFTPSDEACTIONNAME)
    public void setGetDraftPSDEActionName(String getDraftPSDEActionName){
        this.set(FIELD_GETDRAFTPSDEACTIONNAME, getDraftPSDEActionName);
    }
    
    /**
     * 获取 获取草稿实体行为  
     * @return
     */
    @JsonIgnore
    public String getGetDraftPSDEActionName(){
        Object objValue = this.get(FIELD_GETDRAFTPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 获取草稿实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGetDraftPSDEActionNameDirty(){
        if(this.contains(FIELD_GETDRAFTPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 获取草稿实体行为
     */
    @JsonIgnore
    public void resetGetDraftPSDEActionName(){
        this.reset(FIELD_GETDRAFTPSDEACTIONNAME);
    }

    /**
     * 设置 获取草稿实体行为
     * <P>
     * 等同 {@link #setGetDraftPSDEActionName}
     * @param getDraftPSDEActionName
     */
    @JsonIgnore
    public PSDEGrid getdraftpsdeactionname(String getDraftPSDEActionName){
        this.setGetDraftPSDEActionName(getDraftPSDEActionName);
        return this;
    }

    /**
     * <B>GETPSDEACTIONID</B>&nbsp;获取数据实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_GETPSDEACTIONID = "getpsdeactionid";

    /**
     * 设置 获取数据实体行为
     * 
     * @param getPSDEActionId
     * 
     */
    @JsonProperty(FIELD_GETPSDEACTIONID)
    public void setGetPSDEActionId(String getPSDEActionId){
        this.set(FIELD_GETPSDEACTIONID, getPSDEActionId);
    }
    
    /**
     * 获取 获取数据实体行为  
     * @return
     */
    @JsonIgnore
    public String getGetPSDEActionId(){
        Object objValue = this.get(FIELD_GETPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 获取数据实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGetPSDEActionIdDirty(){
        if(this.contains(FIELD_GETPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 获取数据实体行为
     */
    @JsonIgnore
    public void resetGetPSDEActionId(){
        this.reset(FIELD_GETPSDEACTIONID);
    }

    /**
     * 设置 获取数据实体行为
     * <P>
     * 等同 {@link #setGetPSDEActionId}
     * @param getPSDEActionId
     */
    @JsonIgnore
    public PSDEGrid getpsdeactionid(String getPSDEActionId){
        this.setGetPSDEActionId(getPSDEActionId);
        return this;
    }

    /**
     * 设置 获取数据实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setGetPSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDEGrid getpsdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setGetPSDEActionId(null);
            this.setGetPSDEActionName(null);
        }
        else{
            this.setGetPSDEActionId(pSDEAction.getPSDEActionId());
            this.setGetPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>GETPSDEACTIONNAME</B>&nbsp;获取数据实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GETPSDEACTIONID}
     */
    public final static String FIELD_GETPSDEACTIONNAME = "getpsdeactionname";

    /**
     * 设置 获取数据实体行为
     * 
     * @param getPSDEActionName
     * 
     */
    @JsonProperty(FIELD_GETPSDEACTIONNAME)
    public void setGetPSDEActionName(String getPSDEActionName){
        this.set(FIELD_GETPSDEACTIONNAME, getPSDEActionName);
    }
    
    /**
     * 获取 获取数据实体行为  
     * @return
     */
    @JsonIgnore
    public String getGetPSDEActionName(){
        Object objValue = this.get(FIELD_GETPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 获取数据实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGetPSDEActionNameDirty(){
        if(this.contains(FIELD_GETPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 获取数据实体行为
     */
    @JsonIgnore
    public void resetGetPSDEActionName(){
        this.reset(FIELD_GETPSDEACTIONNAME);
    }

    /**
     * 设置 获取数据实体行为
     * <P>
     * 等同 {@link #setGetPSDEActionName}
     * @param getPSDEActionName
     */
    @JsonIgnore
    public PSDEGrid getpsdeactionname(String getPSDEActionName){
        this.setGetPSDEActionName(getPSDEActionName);
        return this;
    }

    /**
     * <B>GRIDSN</B>&nbsp;表格编号
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_GRIDSN = "gridsn";

    /**
     * 设置 表格编号
     * 
     * @param gridSN
     * 
     */
    @JsonProperty(FIELD_GRIDSN)
    public void setGridSN(String gridSN){
        this.set(FIELD_GRIDSN, gridSN);
    }
    
    /**
     * 获取 表格编号  
     * @return
     */
    @JsonIgnore
    public String getGridSN(){
        Object objValue = this.get(FIELD_GRIDSN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表格编号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGridSNDirty(){
        if(this.contains(FIELD_GRIDSN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表格编号
     */
    @JsonIgnore
    public void resetGridSN(){
        this.reset(FIELD_GRIDSN);
    }

    /**
     * 设置 表格编号
     * <P>
     * 等同 {@link #setGridSN}
     * @param gridSN
     */
    @JsonIgnore
    public PSDEGrid gridsn(String gridSN){
        this.setGridSN(gridSN);
        return this;
    }

    /**
     * <B>GRIDSTYLE</B>&nbsp;表格样式，指定表格的显示样式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.GridStyle} 
     */
    public final static String FIELD_GRIDSTYLE = "gridstyle";

    /**
     * 设置 表格样式，详细说明：{@link #FIELD_GRIDSTYLE}
     * 
     * @param gridStyle
     * 
     */
    @JsonProperty(FIELD_GRIDSTYLE)
    public void setGridStyle(String gridStyle){
        this.set(FIELD_GRIDSTYLE, gridStyle);
    }
    
    /**
     * 获取 表格样式  
     * @return
     */
    @JsonIgnore
    public String getGridStyle(){
        Object objValue = this.get(FIELD_GRIDSTYLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表格样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGridStyleDirty(){
        if(this.contains(FIELD_GRIDSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表格样式
     */
    @JsonIgnore
    public void resetGridStyle(){
        this.reset(FIELD_GRIDSTYLE);
    }

    /**
     * 设置 表格样式，详细说明：{@link #FIELD_GRIDSTYLE}
     * <P>
     * 等同 {@link #setGridStyle}
     * @param gridStyle
     */
    @JsonIgnore
    public PSDEGrid gridstyle(String gridStyle){
        this.setGridStyle(gridStyle);
        return this;
    }

     /**
     * 设置 表格样式，详细说明：{@link #FIELD_GRIDSTYLE}
     * <P>
     * 等同 {@link #setGridStyle}
     * @param gridStyle
     */
    @JsonIgnore
    public PSDEGrid gridstyle(net.ibizsys.psmodel.core.util.PSModelEnums.GridStyle gridStyle){
        if(gridStyle == null){
            this.setGridStyle(null);
        }
        else{
            this.setGridStyle(gridStyle.value);
        }
        return this;
    }

    /**
     * <B>GROUPMODE</B>&nbsp;分组模式，指定表格的分组模式，未定义时为【无分组】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.MDCtrlGroupMode} 
     */
    public final static String FIELD_GROUPMODE = "groupmode";

    /**
     * 设置 分组模式，详细说明：{@link #FIELD_GROUPMODE}
     * 
     * @param groupMode
     * 
     */
    @JsonProperty(FIELD_GROUPMODE)
    public void setGroupMode(String groupMode){
        this.set(FIELD_GROUPMODE, groupMode);
    }
    
    /**
     * 获取 分组模式  
     * @return
     */
    @JsonIgnore
    public String getGroupMode(){
        Object objValue = this.get(FIELD_GROUPMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupModeDirty(){
        if(this.contains(FIELD_GROUPMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组模式
     */
    @JsonIgnore
    public void resetGroupMode(){
        this.reset(FIELD_GROUPMODE);
    }

    /**
     * 设置 分组模式，详细说明：{@link #FIELD_GROUPMODE}
     * <P>
     * 等同 {@link #setGroupMode}
     * @param groupMode
     */
    @JsonIgnore
    public PSDEGrid groupmode(String groupMode){
        this.setGroupMode(groupMode);
        return this;
    }

     /**
     * 设置 分组模式，详细说明：{@link #FIELD_GROUPMODE}
     * <P>
     * 等同 {@link #setGroupMode}
     * @param groupMode
     */
    @JsonIgnore
    public PSDEGrid groupmode(net.ibizsys.psmodel.core.util.PSModelEnums.MDCtrlGroupMode groupMode){
        if(groupMode == null){
            this.setGroupMode(null);
        }
        else{
            this.setGroupMode(groupMode.value);
        }
        return this;
    }

    /**
     * <B>GROUPPSCODELISTID</B>&nbsp;分组代码表，指定数据表格部件的分组代码表，未定义时使用分组属性默认的代码表对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSCodeList} 
     */
    public final static String FIELD_GROUPPSCODELISTID = "grouppscodelistid";

    /**
     * 设置 分组代码表，详细说明：{@link #FIELD_GROUPPSCODELISTID}
     * 
     * @param groupPSCodeListId
     * 
     */
    @JsonProperty(FIELD_GROUPPSCODELISTID)
    public void setGroupPSCodeListId(String groupPSCodeListId){
        this.set(FIELD_GROUPPSCODELISTID, groupPSCodeListId);
    }
    
    /**
     * 获取 分组代码表  
     * @return
     */
    @JsonIgnore
    public String getGroupPSCodeListId(){
        Object objValue = this.get(FIELD_GROUPPSCODELISTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组代码表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSCodeListIdDirty(){
        if(this.contains(FIELD_GROUPPSCODELISTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组代码表
     */
    @JsonIgnore
    public void resetGroupPSCodeListId(){
        this.reset(FIELD_GROUPPSCODELISTID);
    }

    /**
     * 设置 分组代码表，详细说明：{@link #FIELD_GROUPPSCODELISTID}
     * <P>
     * 等同 {@link #setGroupPSCodeListId}
     * @param groupPSCodeListId
     */
    @JsonIgnore
    public PSDEGrid grouppscodelistid(String groupPSCodeListId){
        this.setGroupPSCodeListId(groupPSCodeListId);
        return this;
    }

    /**
     * 设置 分组代码表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setGroupPSCodeListId}
     * @param pSCodeList 引用对象
     */
    @JsonIgnore
    public PSDEGrid grouppscodelistid(PSCodeList pSCodeList){
        if(pSCodeList == null){
            this.setGroupPSCodeListId(null);
            this.setGroupPSCodeListName(null);
        }
        else{
            this.setGroupPSCodeListId(pSCodeList.getPSCodeListId());
            this.setGroupPSCodeListName(pSCodeList.getPSCodeListName());
        }
        return this;
    }

    /**
     * <B>GROUPPSCODELISTNAME</B>&nbsp;分组代码表，指定数据表格部件的分组代码表，未定义时使用分组属性默认的代码表对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GROUPPSCODELISTID}
     */
    public final static String FIELD_GROUPPSCODELISTNAME = "grouppscodelistname";

    /**
     * 设置 分组代码表，详细说明：{@link #FIELD_GROUPPSCODELISTNAME}
     * 
     * @param groupPSCodeListName
     * 
     */
    @JsonProperty(FIELD_GROUPPSCODELISTNAME)
    public void setGroupPSCodeListName(String groupPSCodeListName){
        this.set(FIELD_GROUPPSCODELISTNAME, groupPSCodeListName);
    }
    
    /**
     * 获取 分组代码表  
     * @return
     */
    @JsonIgnore
    public String getGroupPSCodeListName(){
        Object objValue = this.get(FIELD_GROUPPSCODELISTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组代码表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSCodeListNameDirty(){
        if(this.contains(FIELD_GROUPPSCODELISTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组代码表
     */
    @JsonIgnore
    public void resetGroupPSCodeListName(){
        this.reset(FIELD_GROUPPSCODELISTNAME);
    }

    /**
     * 设置 分组代码表，详细说明：{@link #FIELD_GROUPPSCODELISTNAME}
     * <P>
     * 等同 {@link #setGroupPSCodeListName}
     * @param groupPSCodeListName
     */
    @JsonIgnore
    public PSDEGrid grouppscodelistname(String groupPSCodeListName){
        this.setGroupPSCodeListName(groupPSCodeListName);
        return this;
    }

    /**
     * <B>GROUPPSDEFID</B>&nbsp;分组属性，数据表格部件启用数据分组功能时指定分组的属性对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_GROUPPSDEFID = "grouppsdefid";

    /**
     * 设置 分组属性，详细说明：{@link #FIELD_GROUPPSDEFID}
     * 
     * @param groupPSDEFId
     * 
     */
    @JsonProperty(FIELD_GROUPPSDEFID)
    public void setGroupPSDEFId(String groupPSDEFId){
        this.set(FIELD_GROUPPSDEFID, groupPSDEFId);
    }
    
    /**
     * 获取 分组属性  
     * @return
     */
    @JsonIgnore
    public String getGroupPSDEFId(){
        Object objValue = this.get(FIELD_GROUPPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSDEFIdDirty(){
        if(this.contains(FIELD_GROUPPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组属性
     */
    @JsonIgnore
    public void resetGroupPSDEFId(){
        this.reset(FIELD_GROUPPSDEFID);
    }

    /**
     * 设置 分组属性，详细说明：{@link #FIELD_GROUPPSDEFID}
     * <P>
     * 等同 {@link #setGroupPSDEFId}
     * @param groupPSDEFId
     */
    @JsonIgnore
    public PSDEGrid grouppsdefid(String groupPSDEFId){
        this.setGroupPSDEFId(groupPSDEFId);
        return this;
    }

    /**
     * 设置 分组属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setGroupPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDEGrid grouppsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setGroupPSDEFId(null);
            this.setGroupPSDEFName(null);
        }
        else{
            this.setGroupPSDEFId(pSDEField.getPSDEFieldId());
            this.setGroupPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>GROUPPSDEFNAME</B>&nbsp;分组属性，数据表格部件启用数据分组功能时指定分组的属性对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GROUPPSDEFID}
     */
    public final static String FIELD_GROUPPSDEFNAME = "grouppsdefname";

    /**
     * 设置 分组属性，详细说明：{@link #FIELD_GROUPPSDEFNAME}
     * 
     * @param groupPSDEFName
     * 
     */
    @JsonProperty(FIELD_GROUPPSDEFNAME)
    public void setGroupPSDEFName(String groupPSDEFName){
        this.set(FIELD_GROUPPSDEFNAME, groupPSDEFName);
    }
    
    /**
     * 获取 分组属性  
     * @return
     */
    @JsonIgnore
    public String getGroupPSDEFName(){
        Object objValue = this.get(FIELD_GROUPPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSDEFNameDirty(){
        if(this.contains(FIELD_GROUPPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组属性
     */
    @JsonIgnore
    public void resetGroupPSDEFName(){
        this.reset(FIELD_GROUPPSDEFNAME);
    }

    /**
     * 设置 分组属性，详细说明：{@link #FIELD_GROUPPSDEFNAME}
     * <P>
     * 等同 {@link #setGroupPSDEFName}
     * @param groupPSDEFName
     */
    @JsonIgnore
    public PSDEGrid grouppsdefname(String groupPSDEFName){
        this.setGroupPSDEFName(groupPSDEFName);
        return this;
    }

    /**
     * <B>GROUPPSDEUAGROUPID</B>&nbsp;分组界面行为组，指定数据表格部件分组项的界面行为组对象，为分组数据提供功能操作入口
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEUAGroup} 
     */
    public final static String FIELD_GROUPPSDEUAGROUPID = "grouppsdeuagroupid";

    /**
     * 设置 分组界面行为组，详细说明：{@link #FIELD_GROUPPSDEUAGROUPID}
     * 
     * @param groupPSDEUAGroupId
     * 
     */
    @JsonProperty(FIELD_GROUPPSDEUAGROUPID)
    public void setGroupPSDEUAGroupId(String groupPSDEUAGroupId){
        this.set(FIELD_GROUPPSDEUAGROUPID, groupPSDEUAGroupId);
    }
    
    /**
     * 获取 分组界面行为组  
     * @return
     */
    @JsonIgnore
    public String getGroupPSDEUAGroupId(){
        Object objValue = this.get(FIELD_GROUPPSDEUAGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组界面行为组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSDEUAGroupIdDirty(){
        if(this.contains(FIELD_GROUPPSDEUAGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组界面行为组
     */
    @JsonIgnore
    public void resetGroupPSDEUAGroupId(){
        this.reset(FIELD_GROUPPSDEUAGROUPID);
    }

    /**
     * 设置 分组界面行为组，详细说明：{@link #FIELD_GROUPPSDEUAGROUPID}
     * <P>
     * 等同 {@link #setGroupPSDEUAGroupId}
     * @param groupPSDEUAGroupId
     */
    @JsonIgnore
    public PSDEGrid grouppsdeuagroupid(String groupPSDEUAGroupId){
        this.setGroupPSDEUAGroupId(groupPSDEUAGroupId);
        return this;
    }

    /**
     * 设置 分组界面行为组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setGroupPSDEUAGroupId}
     * @param pSDEUAGroup 引用对象
     */
    @JsonIgnore
    public PSDEGrid grouppsdeuagroupid(PSDEUAGroup pSDEUAGroup){
        if(pSDEUAGroup == null){
            this.setGroupPSDEUAGroupId(null);
            this.setGroupPSDEUAGroupName(null);
        }
        else{
            this.setGroupPSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setGroupPSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    /**
     * <B>GROUPPSDEUAGROUPNAME</B>&nbsp;分组界面行为组，指定数据表格部件分组项的界面行为组对象，为分组数据提供功能操作入口
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GROUPPSDEUAGROUPID}
     */
    public final static String FIELD_GROUPPSDEUAGROUPNAME = "grouppsdeuagroupname";

    /**
     * 设置 分组界面行为组，详细说明：{@link #FIELD_GROUPPSDEUAGROUPNAME}
     * 
     * @param groupPSDEUAGroupName
     * 
     */
    @JsonProperty(FIELD_GROUPPSDEUAGROUPNAME)
    public void setGroupPSDEUAGroupName(String groupPSDEUAGroupName){
        this.set(FIELD_GROUPPSDEUAGROUPNAME, groupPSDEUAGroupName);
    }
    
    /**
     * 获取 分组界面行为组  
     * @return
     */
    @JsonIgnore
    public String getGroupPSDEUAGroupName(){
        Object objValue = this.get(FIELD_GROUPPSDEUAGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组界面行为组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSDEUAGroupNameDirty(){
        if(this.contains(FIELD_GROUPPSDEUAGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组界面行为组
     */
    @JsonIgnore
    public void resetGroupPSDEUAGroupName(){
        this.reset(FIELD_GROUPPSDEUAGROUPNAME);
    }

    /**
     * 设置 分组界面行为组，详细说明：{@link #FIELD_GROUPPSDEUAGROUPNAME}
     * <P>
     * 等同 {@link #setGroupPSDEUAGroupName}
     * @param groupPSDEUAGroupName
     */
    @JsonIgnore
    public PSDEGrid grouppsdeuagroupname(String groupPSDEUAGroupName){
        this.setGroupPSDEUAGroupName(groupPSDEUAGroupName);
        return this;
    }

    /**
     * <B>GROUPPSSYSCSSID</B>&nbsp;分组样式表，指定数据表格部件分组项的界面样式表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCss} 
     */
    public final static String FIELD_GROUPPSSYSCSSID = "grouppssyscssid";

    /**
     * 设置 分组样式表，详细说明：{@link #FIELD_GROUPPSSYSCSSID}
     * 
     * @param groupPSSysCssId
     * 
     */
    @JsonProperty(FIELD_GROUPPSSYSCSSID)
    public void setGroupPSSysCssId(String groupPSSysCssId){
        this.set(FIELD_GROUPPSSYSCSSID, groupPSSysCssId);
    }
    
    /**
     * 获取 分组样式表  
     * @return
     */
    @JsonIgnore
    public String getGroupPSSysCssId(){
        Object objValue = this.get(FIELD_GROUPPSSYSCSSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSSysCssIdDirty(){
        if(this.contains(FIELD_GROUPPSSYSCSSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组样式表
     */
    @JsonIgnore
    public void resetGroupPSSysCssId(){
        this.reset(FIELD_GROUPPSSYSCSSID);
    }

    /**
     * 设置 分组样式表，详细说明：{@link #FIELD_GROUPPSSYSCSSID}
     * <P>
     * 等同 {@link #setGroupPSSysCssId}
     * @param groupPSSysCssId
     */
    @JsonIgnore
    public PSDEGrid grouppssyscssid(String groupPSSysCssId){
        this.setGroupPSSysCssId(groupPSSysCssId);
        return this;
    }

    /**
     * 设置 分组样式表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setGroupPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSDEGrid grouppssyscssid(PSSysCss pSSysCss){
        if(pSSysCss == null){
            this.setGroupPSSysCssId(null);
            this.setGroupPSSysCssName(null);
        }
        else{
            this.setGroupPSSysCssId(pSSysCss.getPSSysCssId());
            this.setGroupPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    /**
     * <B>GROUPPSSYSCSSNAME</B>&nbsp;分组样式表，指定数据表格部件分组项的界面样式表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GROUPPSSYSCSSID}
     */
    public final static String FIELD_GROUPPSSYSCSSNAME = "grouppssyscssname";

    /**
     * 设置 分组样式表，详细说明：{@link #FIELD_GROUPPSSYSCSSNAME}
     * 
     * @param groupPSSysCssName
     * 
     */
    @JsonProperty(FIELD_GROUPPSSYSCSSNAME)
    public void setGroupPSSysCssName(String groupPSSysCssName){
        this.set(FIELD_GROUPPSSYSCSSNAME, groupPSSysCssName);
    }
    
    /**
     * 获取 分组样式表  
     * @return
     */
    @JsonIgnore
    public String getGroupPSSysCssName(){
        Object objValue = this.get(FIELD_GROUPPSSYSCSSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSSysCssNameDirty(){
        if(this.contains(FIELD_GROUPPSSYSCSSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组样式表
     */
    @JsonIgnore
    public void resetGroupPSSysCssName(){
        this.reset(FIELD_GROUPPSSYSCSSNAME);
    }

    /**
     * 设置 分组样式表，详细说明：{@link #FIELD_GROUPPSSYSCSSNAME}
     * <P>
     * 等同 {@link #setGroupPSSysCssName}
     * @param groupPSSysCssName
     */
    @JsonIgnore
    public PSDEGrid grouppssyscssname(String groupPSSysCssName){
        this.setGroupPSSysCssName(groupPSSysCssName);
        return this;
    }

    /**
     * <B>GROUPPSSYSPFPLUGINID</B>&nbsp;分组前端插件，指定数据表格部件分组项的前端模板扩展插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysPFPlugin} 
     */
    public final static String FIELD_GROUPPSSYSPFPLUGINID = "grouppssyspfpluginid";

    /**
     * 设置 分组前端插件，详细说明：{@link #FIELD_GROUPPSSYSPFPLUGINID}
     * 
     * @param groupPSSysPFPluginId
     * 
     */
    @JsonProperty(FIELD_GROUPPSSYSPFPLUGINID)
    public void setGroupPSSysPFPluginId(String groupPSSysPFPluginId){
        this.set(FIELD_GROUPPSSYSPFPLUGINID, groupPSSysPFPluginId);
    }
    
    /**
     * 获取 分组前端插件  
     * @return
     */
    @JsonIgnore
    public String getGroupPSSysPFPluginId(){
        Object objValue = this.get(FIELD_GROUPPSSYSPFPLUGINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组前端插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSSysPFPluginIdDirty(){
        if(this.contains(FIELD_GROUPPSSYSPFPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组前端插件
     */
    @JsonIgnore
    public void resetGroupPSSysPFPluginId(){
        this.reset(FIELD_GROUPPSSYSPFPLUGINID);
    }

    /**
     * 设置 分组前端插件，详细说明：{@link #FIELD_GROUPPSSYSPFPLUGINID}
     * <P>
     * 等同 {@link #setGroupPSSysPFPluginId}
     * @param groupPSSysPFPluginId
     */
    @JsonIgnore
    public PSDEGrid grouppssyspfpluginid(String groupPSSysPFPluginId){
        this.setGroupPSSysPFPluginId(groupPSSysPFPluginId);
        return this;
    }

    /**
     * 设置 分组前端插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setGroupPSSysPFPluginId}
     * @param pSSysPFPlugin 引用对象
     */
    @JsonIgnore
    public PSDEGrid grouppssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
        if(pSSysPFPlugin == null){
            this.setGroupPSSysPFPluginId(null);
            this.setGroupPSSysPFPluginName(null);
        }
        else{
            this.setGroupPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setGroupPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    /**
     * <B>GROUPPSSYSPFPLUGINNAME</B>&nbsp;分组前端插件，指定数据表格部件分组项的前端模板扩展插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GROUPPSSYSPFPLUGINID}
     */
    public final static String FIELD_GROUPPSSYSPFPLUGINNAME = "grouppssyspfpluginname";

    /**
     * 设置 分组前端插件，详细说明：{@link #FIELD_GROUPPSSYSPFPLUGINNAME}
     * 
     * @param groupPSSysPFPluginName
     * 
     */
    @JsonProperty(FIELD_GROUPPSSYSPFPLUGINNAME)
    public void setGroupPSSysPFPluginName(String groupPSSysPFPluginName){
        this.set(FIELD_GROUPPSSYSPFPLUGINNAME, groupPSSysPFPluginName);
    }
    
    /**
     * 获取 分组前端插件  
     * @return
     */
    @JsonIgnore
    public String getGroupPSSysPFPluginName(){
        Object objValue = this.get(FIELD_GROUPPSSYSPFPLUGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组前端插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSSysPFPluginNameDirty(){
        if(this.contains(FIELD_GROUPPSSYSPFPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组前端插件
     */
    @JsonIgnore
    public void resetGroupPSSysPFPluginName(){
        this.reset(FIELD_GROUPPSSYSPFPLUGINNAME);
    }

    /**
     * 设置 分组前端插件，详细说明：{@link #FIELD_GROUPPSSYSPFPLUGINNAME}
     * <P>
     * 等同 {@link #setGroupPSSysPFPluginName}
     * @param groupPSSysPFPluginName
     */
    @JsonIgnore
    public PSDEGrid grouppssyspfpluginname(String groupPSSysPFPluginName){
        this.setGroupPSSysPFPluginName(groupPSSysPFPluginName);
        return this;
    }

    /**
     * <B>GROUPSTYLE</B>&nbsp;分组样式
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_GROUPSTYLE = "groupstyle";

    /**
     * 设置 分组样式
     * 
     * @param groupStyle
     * 
     */
    @JsonProperty(FIELD_GROUPSTYLE)
    public void setGroupStyle(String groupStyle){
        this.set(FIELD_GROUPSTYLE, groupStyle);
    }
    
    /**
     * 获取 分组样式  
     * @return
     */
    @JsonIgnore
    public String getGroupStyle(){
        Object objValue = this.get(FIELD_GROUPSTYLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupStyleDirty(){
        if(this.contains(FIELD_GROUPSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组样式
     */
    @JsonIgnore
    public void resetGroupStyle(){
        this.reset(FIELD_GROUPSTYLE);
    }

    /**
     * 设置 分组样式
     * <P>
     * 等同 {@link #setGroupStyle}
     * @param groupStyle
     */
    @JsonIgnore
    public PSDEGrid groupstyle(String groupStyle){
        this.setGroupStyle(groupStyle);
        return this;
    }

    /**
     * <B>IGNOREDSITEM</B>&nbsp;忽略默认数据项，指定数据表格忽略输出的默认数据项
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.GridDefDataItem} 
     */
    public final static String FIELD_IGNOREDSITEM = "ignoredsitem";

    /**
     * 设置 忽略默认数据项，详细说明：{@link #FIELD_IGNOREDSITEM}
     * 
     * @param ignoreDSItem
     * 
     */
    @JsonProperty(FIELD_IGNOREDSITEM)
    public void setIgnoreDSItem(Integer ignoreDSItem){
        this.set(FIELD_IGNOREDSITEM, ignoreDSItem);
    }
    
    /**
     * 获取 忽略默认数据项  
     * @return
     */
    @JsonIgnore
    public Integer getIgnoreDSItem(){
        Object objValue = this.get(FIELD_IGNOREDSITEM);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 忽略默认数据项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIgnoreDSItemDirty(){
        if(this.contains(FIELD_IGNOREDSITEM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 忽略默认数据项
     */
    @JsonIgnore
    public void resetIgnoreDSItem(){
        this.reset(FIELD_IGNOREDSITEM);
    }

    /**
     * 设置 忽略默认数据项，详细说明：{@link #FIELD_IGNOREDSITEM}
     * <P>
     * 等同 {@link #setIgnoreDSItem}
     * @param ignoreDSItem
     */
    @JsonIgnore
    public PSDEGrid ignoredsitem(Integer ignoreDSItem){
        this.setIgnoreDSItem(ignoreDSItem);
        return this;
    }

     /**
     * 设置 忽略默认数据项，详细说明：{@link #FIELD_IGNOREDSITEM}
     * <P>
     * 等同 {@link #setIgnoreDSItem}
     * @param ignoreDSItem
     */
    @JsonIgnore
    public PSDEGrid ignoredsitem(net.ibizsys.psmodel.core.util.PSModelEnums.GridDefDataItem[] ignoreDSItem){
        if(ignoreDSItem == null || ignoreDSItem.length == 0){
            this.setIgnoreDSItem(null);
        }
        else{
            int _value = 0;
            for(net.ibizsys.psmodel.core.util.PSModelEnums.GridDefDataItem _item : ignoreDSItem){
                _value |= _item.value;
            }
            this.setIgnoreDSItem(_value);
        }
        return this;
    }

    /**
     * <B>ITEMPSSYSCSSID</B>&nbsp;默认行样式表，指定数据表格部件的行默认样式表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCss} 
     */
    public final static String FIELD_ITEMPSSYSCSSID = "itempssyscssid";

    /**
     * 设置 默认行样式表，详细说明：{@link #FIELD_ITEMPSSYSCSSID}
     * 
     * @param itemPSSysCssId
     * 
     */
    @JsonProperty(FIELD_ITEMPSSYSCSSID)
    public void setItemPSSysCssId(String itemPSSysCssId){
        this.set(FIELD_ITEMPSSYSCSSID, itemPSSysCssId);
    }
    
    /**
     * 获取 默认行样式表  
     * @return
     */
    @JsonIgnore
    public String getItemPSSysCssId(){
        Object objValue = this.get(FIELD_ITEMPSSYSCSSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认行样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemPSSysCssIdDirty(){
        if(this.contains(FIELD_ITEMPSSYSCSSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认行样式表
     */
    @JsonIgnore
    public void resetItemPSSysCssId(){
        this.reset(FIELD_ITEMPSSYSCSSID);
    }

    /**
     * 设置 默认行样式表，详细说明：{@link #FIELD_ITEMPSSYSCSSID}
     * <P>
     * 等同 {@link #setItemPSSysCssId}
     * @param itemPSSysCssId
     */
    @JsonIgnore
    public PSDEGrid itempssyscssid(String itemPSSysCssId){
        this.setItemPSSysCssId(itemPSSysCssId);
        return this;
    }

    /**
     * 设置 默认行样式表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setItemPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSDEGrid itempssyscssid(PSSysCss pSSysCss){
        if(pSSysCss == null){
            this.setItemPSSysCssId(null);
            this.setItemPSSysCssName(null);
        }
        else{
            this.setItemPSSysCssId(pSSysCss.getPSSysCssId());
            this.setItemPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    /**
     * <B>ITEMPSSYSCSSNAME</B>&nbsp;默认行样式表，指定数据表格部件的行默认样式表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ITEMPSSYSCSSID}
     */
    public final static String FIELD_ITEMPSSYSCSSNAME = "itempssyscssname";

    /**
     * 设置 默认行样式表，详细说明：{@link #FIELD_ITEMPSSYSCSSNAME}
     * 
     * @param itemPSSysCssName
     * 
     */
    @JsonProperty(FIELD_ITEMPSSYSCSSNAME)
    public void setItemPSSysCssName(String itemPSSysCssName){
        this.set(FIELD_ITEMPSSYSCSSNAME, itemPSSysCssName);
    }
    
    /**
     * 获取 默认行样式表  
     * @return
     */
    @JsonIgnore
    public String getItemPSSysCssName(){
        Object objValue = this.get(FIELD_ITEMPSSYSCSSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认行样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemPSSysCssNameDirty(){
        if(this.contains(FIELD_ITEMPSSYSCSSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认行样式表
     */
    @JsonIgnore
    public void resetItemPSSysCssName(){
        this.reset(FIELD_ITEMPSSYSCSSNAME);
    }

    /**
     * 设置 默认行样式表，详细说明：{@link #FIELD_ITEMPSSYSCSSNAME}
     * <P>
     * 等同 {@link #setItemPSSysCssName}
     * @param itemPSSysCssName
     */
    @JsonIgnore
    public PSDEGrid itempssyscssname(String itemPSSysCssName){
        this.setItemPSSysCssName(itemPSSysCssName);
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
    public PSDEGrid memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MINORSORTDIR</B>&nbsp;默认排序方向，指定表格对数据集合的默认排序方向，需指定默认排序属性
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SortDir} 
     */
    public final static String FIELD_MINORSORTDIR = "minorsortdir";

    /**
     * 设置 默认排序方向，详细说明：{@link #FIELD_MINORSORTDIR}
     * 
     * @param minorSortDir
     * 
     */
    @JsonProperty(FIELD_MINORSORTDIR)
    public void setMinorSortDir(String minorSortDir){
        this.set(FIELD_MINORSORTDIR, minorSortDir);
    }
    
    /**
     * 获取 默认排序方向  
     * @return
     */
    @JsonIgnore
    public String getMinorSortDir(){
        Object objValue = this.get(FIELD_MINORSORTDIR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认排序方向 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinorSortDirDirty(){
        if(this.contains(FIELD_MINORSORTDIR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认排序方向
     */
    @JsonIgnore
    public void resetMinorSortDir(){
        this.reset(FIELD_MINORSORTDIR);
    }

    /**
     * 设置 默认排序方向，详细说明：{@link #FIELD_MINORSORTDIR}
     * <P>
     * 等同 {@link #setMinorSortDir}
     * @param minorSortDir
     */
    @JsonIgnore
    public PSDEGrid minorsortdir(String minorSortDir){
        this.setMinorSortDir(minorSortDir);
        return this;
    }

     /**
     * 设置 默认排序方向，详细说明：{@link #FIELD_MINORSORTDIR}
     * <P>
     * 等同 {@link #setMinorSortDir}
     * @param minorSortDir
     */
    @JsonIgnore
    public PSDEGrid minorsortdir(net.ibizsys.psmodel.core.util.PSModelEnums.SortDir minorSortDir){
        if(minorSortDir == null){
            this.setMinorSortDir(null);
        }
        else{
            this.setMinorSortDir(minorSortDir.value);
        }
        return this;
    }

    /**
     * <B>MINORSORTPSDEFID</B>&nbsp;默认排序属性，指定表格对数据集合的默认排序属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_MINORSORTPSDEFID = "minorsortpsdefid";

    /**
     * 设置 默认排序属性，详细说明：{@link #FIELD_MINORSORTPSDEFID}
     * 
     * @param minorSortPSDEFId
     * 
     */
    @JsonProperty(FIELD_MINORSORTPSDEFID)
    public void setMinorSortPSDEFId(String minorSortPSDEFId){
        this.set(FIELD_MINORSORTPSDEFID, minorSortPSDEFId);
    }
    
    /**
     * 获取 默认排序属性  
     * @return
     */
    @JsonIgnore
    public String getMinorSortPSDEFId(){
        Object objValue = this.get(FIELD_MINORSORTPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认排序属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinorSortPSDEFIdDirty(){
        if(this.contains(FIELD_MINORSORTPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认排序属性
     */
    @JsonIgnore
    public void resetMinorSortPSDEFId(){
        this.reset(FIELD_MINORSORTPSDEFID);
    }

    /**
     * 设置 默认排序属性，详细说明：{@link #FIELD_MINORSORTPSDEFID}
     * <P>
     * 等同 {@link #setMinorSortPSDEFId}
     * @param minorSortPSDEFId
     */
    @JsonIgnore
    public PSDEGrid minorsortpsdefid(String minorSortPSDEFId){
        this.setMinorSortPSDEFId(minorSortPSDEFId);
        return this;
    }

    /**
     * 设置 默认排序属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMinorSortPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDEGrid minorsortpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setMinorSortPSDEFId(null);
            this.setMinorSortPSDEFName(null);
        }
        else{
            this.setMinorSortPSDEFId(pSDEField.getPSDEFieldId());
            this.setMinorSortPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>MINORSORTPSDEFNAME</B>&nbsp;默认排序属性，指定表格对数据集合的默认排序属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MINORSORTPSDEFID}
     */
    public final static String FIELD_MINORSORTPSDEFNAME = "minorsortpsdefname";

    /**
     * 设置 默认排序属性，详细说明：{@link #FIELD_MINORSORTPSDEFNAME}
     * 
     * @param minorSortPSDEFName
     * 
     */
    @JsonProperty(FIELD_MINORSORTPSDEFNAME)
    public void setMinorSortPSDEFName(String minorSortPSDEFName){
        this.set(FIELD_MINORSORTPSDEFNAME, minorSortPSDEFName);
    }
    
    /**
     * 获取 默认排序属性  
     * @return
     */
    @JsonIgnore
    public String getMinorSortPSDEFName(){
        Object objValue = this.get(FIELD_MINORSORTPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认排序属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinorSortPSDEFNameDirty(){
        if(this.contains(FIELD_MINORSORTPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认排序属性
     */
    @JsonIgnore
    public void resetMinorSortPSDEFName(){
        this.reset(FIELD_MINORSORTPSDEFNAME);
    }

    /**
     * 设置 默认排序属性，详细说明：{@link #FIELD_MINORSORTPSDEFNAME}
     * <P>
     * 等同 {@link #setMinorSortPSDEFName}
     * @param minorSortPSDEFName
     */
    @JsonIgnore
    public PSDEGrid minorsortpsdefname(String minorSortPSDEFName){
        this.setMinorSortPSDEFName(minorSortPSDEFName);
        return this;
    }

    /**
     * <B>MOVEPSDEACTIONID</B>&nbsp;移动数据实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_MOVEPSDEACTIONID = "movepsdeactionid";

    /**
     * 设置 移动数据实体行为
     * 
     * @param movePSDEActionId
     * 
     */
    @JsonProperty(FIELD_MOVEPSDEACTIONID)
    public void setMovePSDEActionId(String movePSDEActionId){
        this.set(FIELD_MOVEPSDEACTIONID, movePSDEActionId);
    }
    
    /**
     * 获取 移动数据实体行为  
     * @return
     */
    @JsonIgnore
    public String getMovePSDEActionId(){
        Object objValue = this.get(FIELD_MOVEPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动数据实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMovePSDEActionIdDirty(){
        if(this.contains(FIELD_MOVEPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动数据实体行为
     */
    @JsonIgnore
    public void resetMovePSDEActionId(){
        this.reset(FIELD_MOVEPSDEACTIONID);
    }

    /**
     * 设置 移动数据实体行为
     * <P>
     * 等同 {@link #setMovePSDEActionId}
     * @param movePSDEActionId
     */
    @JsonIgnore
    public PSDEGrid movepsdeactionid(String movePSDEActionId){
        this.setMovePSDEActionId(movePSDEActionId);
        return this;
    }

    /**
     * 设置 移动数据实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMovePSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDEGrid movepsdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setMovePSDEActionId(null);
            this.setMovePSDEActionName(null);
        }
        else{
            this.setMovePSDEActionId(pSDEAction.getPSDEActionId());
            this.setMovePSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>MOVEPSDEACTIONNAME</B>&nbsp;移动数据实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOVEPSDEACTIONID}
     */
    public final static String FIELD_MOVEPSDEACTIONNAME = "movepsdeactionname";

    /**
     * 设置 移动数据实体行为
     * 
     * @param movePSDEActionName
     * 
     */
    @JsonProperty(FIELD_MOVEPSDEACTIONNAME)
    public void setMovePSDEActionName(String movePSDEActionName){
        this.set(FIELD_MOVEPSDEACTIONNAME, movePSDEActionName);
    }
    
    /**
     * 获取 移动数据实体行为  
     * @return
     */
    @JsonIgnore
    public String getMovePSDEActionName(){
        Object objValue = this.get(FIELD_MOVEPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动数据实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMovePSDEActionNameDirty(){
        if(this.contains(FIELD_MOVEPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动数据实体行为
     */
    @JsonIgnore
    public void resetMovePSDEActionName(){
        this.reset(FIELD_MOVEPSDEACTIONNAME);
    }

    /**
     * 设置 移动数据实体行为
     * <P>
     * 等同 {@link #setMovePSDEActionName}
     * @param movePSDEActionName
     */
    @JsonIgnore
    public PSDEGrid movepsdeactionname(String movePSDEActionName){
        this.setMovePSDEActionName(movePSDEActionName);
        return this;
    }

    /**
     * <B>MULTISELECT</B>&nbsp;支持多选
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_MULTISELECT = "multiselect";

    /**
     * 设置 支持多选
     * 
     * @param multiSelect
     * 
     */
    @JsonProperty(FIELD_MULTISELECT)
    public void setMultiSelect(Integer multiSelect){
        this.set(FIELD_MULTISELECT, multiSelect);
    }
    
    /**
     * 获取 支持多选  
     * @return
     */
    @JsonIgnore
    public Integer getMultiSelect(){
        Object objValue = this.get(FIELD_MULTISELECT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持多选 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMultiSelectDirty(){
        if(this.contains(FIELD_MULTISELECT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持多选
     */
    @JsonIgnore
    public void resetMultiSelect(){
        this.reset(FIELD_MULTISELECT);
    }

    /**
     * 设置 支持多选
     * <P>
     * 等同 {@link #setMultiSelect}
     * @param multiSelect
     */
    @JsonIgnore
    public PSDEGrid multiselect(Integer multiSelect){
        this.setMultiSelect(multiSelect);
        return this;
    }

     /**
     * 设置 支持多选
     * <P>
     * 等同 {@link #setMultiSelect}
     * @param multiSelect
     */
    @JsonIgnore
    public PSDEGrid multiselect(Boolean multiSelect){
        if(multiSelect == null){
            this.setMultiSelect(null);
        }
        else{
            this.setMultiSelect(multiSelect?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>NAVPSDERID</B>&nbsp;导航视图关系，指定数据表格部件默认的导航关系，此配置在表格导航视图启用
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDER} 
     */
    public final static String FIELD_NAVPSDERID = "navpsderid";

    /**
     * 设置 导航视图关系，详细说明：{@link #FIELD_NAVPSDERID}
     * 
     * @param navPSDERId
     * 
     */
    @JsonProperty(FIELD_NAVPSDERID)
    public void setNavPSDERId(String navPSDERId){
        this.set(FIELD_NAVPSDERID, navPSDERId);
    }
    
    /**
     * 获取 导航视图关系  
     * @return
     */
    @JsonIgnore
    public String getNavPSDERId(){
        Object objValue = this.get(FIELD_NAVPSDERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导航视图关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavPSDERIdDirty(){
        if(this.contains(FIELD_NAVPSDERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航视图关系
     */
    @JsonIgnore
    public void resetNavPSDERId(){
        this.reset(FIELD_NAVPSDERID);
    }

    /**
     * 设置 导航视图关系，详细说明：{@link #FIELD_NAVPSDERID}
     * <P>
     * 等同 {@link #setNavPSDERId}
     * @param navPSDERId
     */
    @JsonIgnore
    public PSDEGrid navpsderid(String navPSDERId){
        this.setNavPSDERId(navPSDERId);
        return this;
    }

    /**
     * 设置 导航视图关系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNavPSDERId}
     * @param pSDER 引用对象
     */
    @JsonIgnore
    public PSDEGrid navpsderid(PSDER pSDER){
        if(pSDER == null){
            this.setNavPSDERId(null);
            this.setNavPSDERName(null);
        }
        else{
            this.setNavPSDERId(pSDER.getPSDERId());
            this.setNavPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    /**
     * <B>NAVPSDERNAME</B>&nbsp;导航视图关系，指定数据表格部件默认的导航关系，此配置在表格导航视图启用
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NAVPSDERID}
     */
    public final static String FIELD_NAVPSDERNAME = "navpsdername";

    /**
     * 设置 导航视图关系，详细说明：{@link #FIELD_NAVPSDERNAME}
     * 
     * @param navPSDERName
     * 
     */
    @JsonProperty(FIELD_NAVPSDERNAME)
    public void setNavPSDERName(String navPSDERName){
        this.set(FIELD_NAVPSDERNAME, navPSDERName);
    }
    
    /**
     * 获取 导航视图关系  
     * @return
     */
    @JsonIgnore
    public String getNavPSDERName(){
        Object objValue = this.get(FIELD_NAVPSDERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导航视图关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavPSDERNameDirty(){
        if(this.contains(FIELD_NAVPSDERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航视图关系
     */
    @JsonIgnore
    public void resetNavPSDERName(){
        this.reset(FIELD_NAVPSDERNAME);
    }

    /**
     * 设置 导航视图关系，详细说明：{@link #FIELD_NAVPSDERNAME}
     * <P>
     * 等同 {@link #setNavPSDERName}
     * @param navPSDERName
     */
    @JsonIgnore
    public PSDEGrid navpsdername(String navPSDERName){
        this.setNavPSDERName(navPSDERName);
        return this;
    }

    /**
     * <B>NAVPSDEVIEWBASEID</B>&nbsp;导航视图，指定数据表格部件默认的导航关系视图，此配置在表格导航视图启用
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_NAVPSDEVIEWBASEID = "navpsdeviewbaseid";

    /**
     * 设置 导航视图，详细说明：{@link #FIELD_NAVPSDEVIEWBASEID}
     * 
     * @param navPSDEViewBaseId
     * 
     */
    @JsonProperty(FIELD_NAVPSDEVIEWBASEID)
    public void setNavPSDEViewBaseId(String navPSDEViewBaseId){
        this.set(FIELD_NAVPSDEVIEWBASEID, navPSDEViewBaseId);
    }
    
    /**
     * 获取 导航视图  
     * @return
     */
    @JsonIgnore
    public String getNavPSDEViewBaseId(){
        Object objValue = this.get(FIELD_NAVPSDEVIEWBASEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导航视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavPSDEViewBaseIdDirty(){
        if(this.contains(FIELD_NAVPSDEVIEWBASEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航视图
     */
    @JsonIgnore
    public void resetNavPSDEViewBaseId(){
        this.reset(FIELD_NAVPSDEVIEWBASEID);
    }

    /**
     * 设置 导航视图，详细说明：{@link #FIELD_NAVPSDEVIEWBASEID}
     * <P>
     * 等同 {@link #setNavPSDEViewBaseId}
     * @param navPSDEViewBaseId
     */
    @JsonIgnore
    public PSDEGrid navpsdeviewbaseid(String navPSDEViewBaseId){
        this.setNavPSDEViewBaseId(navPSDEViewBaseId);
        return this;
    }

    /**
     * 设置 导航视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNavPSDEViewBaseId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSDEGrid navpsdeviewbaseid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setNavPSDEViewBaseId(null);
            this.setNavPSDEViewBaseName(null);
        }
        else{
            this.setNavPSDEViewBaseId(pSDEViewBase.getPSDEViewBaseId());
            this.setNavPSDEViewBaseName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>NAVPSDEVIEWBASENAME</B>&nbsp;导航视图，指定数据表格部件默认的导航关系视图，此配置在表格导航视图启用
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NAVPSDEVIEWBASEID}
     */
    public final static String FIELD_NAVPSDEVIEWBASENAME = "navpsdeviewbasename";

    /**
     * 设置 导航视图，详细说明：{@link #FIELD_NAVPSDEVIEWBASENAME}
     * 
     * @param navPSDEViewBaseName
     * 
     */
    @JsonProperty(FIELD_NAVPSDEVIEWBASENAME)
    public void setNavPSDEViewBaseName(String navPSDEViewBaseName){
        this.set(FIELD_NAVPSDEVIEWBASENAME, navPSDEViewBaseName);
    }
    
    /**
     * 获取 导航视图  
     * @return
     */
    @JsonIgnore
    public String getNavPSDEViewBaseName(){
        Object objValue = this.get(FIELD_NAVPSDEVIEWBASENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导航视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavPSDEViewBaseNameDirty(){
        if(this.contains(FIELD_NAVPSDEVIEWBASENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航视图
     */
    @JsonIgnore
    public void resetNavPSDEViewBaseName(){
        this.reset(FIELD_NAVPSDEVIEWBASENAME);
    }

    /**
     * 设置 导航视图，详细说明：{@link #FIELD_NAVPSDEVIEWBASENAME}
     * <P>
     * 等同 {@link #setNavPSDEViewBaseName}
     * @param navPSDEViewBaseName
     */
    @JsonIgnore
    public PSDEGrid navpsdeviewbasename(String navPSDEViewBaseName){
        this.setNavPSDEViewBaseName(navPSDEViewBaseName);
        return this;
    }

    /**
     * <B>NAVVIEWFILTER</B>&nbsp;导航视图过滤项，指定数据表格部件关联导航视图的过滤项名称，导航视图一般使用应用上下文自动进行数据过滤，指定过滤项将为导航视图显示传入过滤条件
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_NAVVIEWFILTER = "navviewfilter";

    /**
     * 设置 导航视图过滤项，详细说明：{@link #FIELD_NAVVIEWFILTER}
     * 
     * @param navViewFilter
     * 
     */
    @JsonProperty(FIELD_NAVVIEWFILTER)
    public void setNavViewFilter(String navViewFilter){
        this.set(FIELD_NAVVIEWFILTER, navViewFilter);
    }
    
    /**
     * 获取 导航视图过滤项  
     * @return
     */
    @JsonIgnore
    public String getNavViewFilter(){
        Object objValue = this.get(FIELD_NAVVIEWFILTER);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导航视图过滤项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavViewFilterDirty(){
        if(this.contains(FIELD_NAVVIEWFILTER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航视图过滤项
     */
    @JsonIgnore
    public void resetNavViewFilter(){
        this.reset(FIELD_NAVVIEWFILTER);
    }

    /**
     * 设置 导航视图过滤项，详细说明：{@link #FIELD_NAVVIEWFILTER}
     * <P>
     * 等同 {@link #setNavViewFilter}
     * @param navViewFilter
     */
    @JsonIgnore
    public PSDEGrid navviewfilter(String navViewFilter){
        this.setNavViewFilter(navViewFilter);
        return this;
    }

    /**
     * <B>NAVVIEWHEIGHT</B>&nbsp;导航视图高度
     */
    public final static String FIELD_NAVVIEWHEIGHT = "navviewheight";

    /**
     * 设置 导航视图高度
     * 
     * @param navViewHeight
     * 
     */
    @JsonProperty(FIELD_NAVVIEWHEIGHT)
    public void setNavViewHeight(Double navViewHeight){
        this.set(FIELD_NAVVIEWHEIGHT, navViewHeight);
    }
    
    /**
     * 获取 导航视图高度  
     * @return
     */
    @JsonIgnore
    public Double getNavViewHeight(){
        Object objValue = this.get(FIELD_NAVVIEWHEIGHT);
        if(objValue==null){
            return null;
        }
        return (Double)objValue;
    }

    /**
     * 判断 导航视图高度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavViewHeightDirty(){
        if(this.contains(FIELD_NAVVIEWHEIGHT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航视图高度
     */
    @JsonIgnore
    public void resetNavViewHeight(){
        this.reset(FIELD_NAVVIEWHEIGHT);
    }

    /**
     * 设置 导航视图高度
     * <P>
     * 等同 {@link #setNavViewHeight}
     * @param navViewHeight
     */
    @JsonIgnore
    public PSDEGrid navviewheight(Double navViewHeight){
        this.setNavViewHeight(navViewHeight);
        return this;
    }

    /**
     * <B>NAVVIEWMAXHEIGHT</B>&nbsp;导航视图最大高度
     */
    public final static String FIELD_NAVVIEWMAXHEIGHT = "navviewmaxheight";

    /**
     * 设置 导航视图最大高度
     * 
     * @param navViewMaxHeight
     * 
     */
    @JsonProperty(FIELD_NAVVIEWMAXHEIGHT)
    public void setNavViewMaxHeight(Double navViewMaxHeight){
        this.set(FIELD_NAVVIEWMAXHEIGHT, navViewMaxHeight);
    }
    
    /**
     * 获取 导航视图最大高度  
     * @return
     */
    @JsonIgnore
    public Double getNavViewMaxHeight(){
        Object objValue = this.get(FIELD_NAVVIEWMAXHEIGHT);
        if(objValue==null){
            return null;
        }
        return (Double)objValue;
    }

    /**
     * 判断 导航视图最大高度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavViewMaxHeightDirty(){
        if(this.contains(FIELD_NAVVIEWMAXHEIGHT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航视图最大高度
     */
    @JsonIgnore
    public void resetNavViewMaxHeight(){
        this.reset(FIELD_NAVVIEWMAXHEIGHT);
    }

    /**
     * 设置 导航视图最大高度
     * <P>
     * 等同 {@link #setNavViewMaxHeight}
     * @param navViewMaxHeight
     */
    @JsonIgnore
    public PSDEGrid navviewmaxheight(Double navViewMaxHeight){
        this.setNavViewMaxHeight(navViewMaxHeight);
        return this;
    }

    /**
     * <B>NAVVIEWMAXWIDTH</B>&nbsp;导航视图最大宽度
     */
    public final static String FIELD_NAVVIEWMAXWIDTH = "navviewmaxwidth";

    /**
     * 设置 导航视图最大宽度
     * 
     * @param navViewMaxWidth
     * 
     */
    @JsonProperty(FIELD_NAVVIEWMAXWIDTH)
    public void setNavViewMaxWidth(Double navViewMaxWidth){
        this.set(FIELD_NAVVIEWMAXWIDTH, navViewMaxWidth);
    }
    
    /**
     * 获取 导航视图最大宽度  
     * @return
     */
    @JsonIgnore
    public Double getNavViewMaxWidth(){
        Object objValue = this.get(FIELD_NAVVIEWMAXWIDTH);
        if(objValue==null){
            return null;
        }
        return (Double)objValue;
    }

    /**
     * 判断 导航视图最大宽度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavViewMaxWidthDirty(){
        if(this.contains(FIELD_NAVVIEWMAXWIDTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航视图最大宽度
     */
    @JsonIgnore
    public void resetNavViewMaxWidth(){
        this.reset(FIELD_NAVVIEWMAXWIDTH);
    }

    /**
     * 设置 导航视图最大宽度
     * <P>
     * 等同 {@link #setNavViewMaxWidth}
     * @param navViewMaxWidth
     */
    @JsonIgnore
    public PSDEGrid navviewmaxwidth(Double navViewMaxWidth){
        this.setNavViewMaxWidth(navViewMaxWidth);
        return this;
    }

    /**
     * <B>NAVVIEWMINHEIGHT</B>&nbsp;导航视图最小高度
     */
    public final static String FIELD_NAVVIEWMINHEIGHT = "navviewminheight";

    /**
     * 设置 导航视图最小高度
     * 
     * @param navViewMinHeight
     * 
     */
    @JsonProperty(FIELD_NAVVIEWMINHEIGHT)
    public void setNavViewMinHeight(Double navViewMinHeight){
        this.set(FIELD_NAVVIEWMINHEIGHT, navViewMinHeight);
    }
    
    /**
     * 获取 导航视图最小高度  
     * @return
     */
    @JsonIgnore
    public Double getNavViewMinHeight(){
        Object objValue = this.get(FIELD_NAVVIEWMINHEIGHT);
        if(objValue==null){
            return null;
        }
        return (Double)objValue;
    }

    /**
     * 判断 导航视图最小高度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavViewMinHeightDirty(){
        if(this.contains(FIELD_NAVVIEWMINHEIGHT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航视图最小高度
     */
    @JsonIgnore
    public void resetNavViewMinHeight(){
        this.reset(FIELD_NAVVIEWMINHEIGHT);
    }

    /**
     * 设置 导航视图最小高度
     * <P>
     * 等同 {@link #setNavViewMinHeight}
     * @param navViewMinHeight
     */
    @JsonIgnore
    public PSDEGrid navviewminheight(Double navViewMinHeight){
        this.setNavViewMinHeight(navViewMinHeight);
        return this;
    }

    /**
     * <B>NAVVIEWMINWIDTH</B>&nbsp;导航视图最小宽度
     */
    public final static String FIELD_NAVVIEWMINWIDTH = "navviewminwidth";

    /**
     * 设置 导航视图最小宽度
     * 
     * @param navViewMinWidth
     * 
     */
    @JsonProperty(FIELD_NAVVIEWMINWIDTH)
    public void setNavViewMinWidth(Double navViewMinWidth){
        this.set(FIELD_NAVVIEWMINWIDTH, navViewMinWidth);
    }
    
    /**
     * 获取 导航视图最小宽度  
     * @return
     */
    @JsonIgnore
    public Double getNavViewMinWidth(){
        Object objValue = this.get(FIELD_NAVVIEWMINWIDTH);
        if(objValue==null){
            return null;
        }
        return (Double)objValue;
    }

    /**
     * 判断 导航视图最小宽度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavViewMinWidthDirty(){
        if(this.contains(FIELD_NAVVIEWMINWIDTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航视图最小宽度
     */
    @JsonIgnore
    public void resetNavViewMinWidth(){
        this.reset(FIELD_NAVVIEWMINWIDTH);
    }

    /**
     * 设置 导航视图最小宽度
     * <P>
     * 等同 {@link #setNavViewMinWidth}
     * @param navViewMinWidth
     */
    @JsonIgnore
    public PSDEGrid navviewminwidth(Double navViewMinWidth){
        this.setNavViewMinWidth(navViewMinWidth);
        return this;
    }

    /**
     * <B>NAVVIEWPARAM</B>&nbsp;导航视图参数，指定数据表格部件关联导航视图的额外参数
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_NAVVIEWPARAM = "navviewparam";

    /**
     * 设置 导航视图参数，详细说明：{@link #FIELD_NAVVIEWPARAM}
     * 
     * @param navViewParam
     * 
     */
    @JsonProperty(FIELD_NAVVIEWPARAM)
    public void setNavViewParam(String navViewParam){
        this.set(FIELD_NAVVIEWPARAM, navViewParam);
    }
    
    /**
     * 获取 导航视图参数  
     * @return
     */
    @JsonIgnore
    public String getNavViewParam(){
        Object objValue = this.get(FIELD_NAVVIEWPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导航视图参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavViewParamDirty(){
        if(this.contains(FIELD_NAVVIEWPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航视图参数
     */
    @JsonIgnore
    public void resetNavViewParam(){
        this.reset(FIELD_NAVVIEWPARAM);
    }

    /**
     * 设置 导航视图参数，详细说明：{@link #FIELD_NAVVIEWPARAM}
     * <P>
     * 等同 {@link #setNavViewParam}
     * @param navViewParam
     */
    @JsonIgnore
    public PSDEGrid navviewparam(String navViewParam){
        this.setNavViewParam(navViewParam);
        return this;
    }

    /**
     * <B>NAVVIEWPOS</B>&nbsp;导航视图位置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.NavViewPos} 
     */
    public final static String FIELD_NAVVIEWPOS = "navviewpos";

    /**
     * 设置 导航视图位置
     * 
     * @param navViewPos
     * 
     */
    @JsonProperty(FIELD_NAVVIEWPOS)
    public void setNavViewPos(String navViewPos){
        this.set(FIELD_NAVVIEWPOS, navViewPos);
    }
    
    /**
     * 获取 导航视图位置  
     * @return
     */
    @JsonIgnore
    public String getNavViewPos(){
        Object objValue = this.get(FIELD_NAVVIEWPOS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导航视图位置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavViewPosDirty(){
        if(this.contains(FIELD_NAVVIEWPOS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航视图位置
     */
    @JsonIgnore
    public void resetNavViewPos(){
        this.reset(FIELD_NAVVIEWPOS);
    }

    /**
     * 设置 导航视图位置
     * <P>
     * 等同 {@link #setNavViewPos}
     * @param navViewPos
     */
    @JsonIgnore
    public PSDEGrid navviewpos(String navViewPos){
        this.setNavViewPos(navViewPos);
        return this;
    }

     /**
     * 设置 导航视图位置
     * <P>
     * 等同 {@link #setNavViewPos}
     * @param navViewPos
     */
    @JsonIgnore
    public PSDEGrid navviewpos(net.ibizsys.psmodel.core.util.PSModelEnums.NavViewPos navViewPos){
        if(navViewPos == null){
            this.setNavViewPos(null);
        }
        else{
            this.setNavViewPos(navViewPos.value);
        }
        return this;
    }

    /**
     * <B>NAVVIEWSHOWMODE</B>&nbsp;导航视图显示模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.NavViewShowMode} 
     */
    public final static String FIELD_NAVVIEWSHOWMODE = "navviewshowmode";

    /**
     * 设置 导航视图显示模式
     * 
     * @param navViewShowMode
     * 
     */
    @JsonProperty(FIELD_NAVVIEWSHOWMODE)
    public void setNavViewShowMode(Integer navViewShowMode){
        this.set(FIELD_NAVVIEWSHOWMODE, navViewShowMode);
    }
    
    /**
     * 获取 导航视图显示模式  
     * @return
     */
    @JsonIgnore
    public Integer getNavViewShowMode(){
        Object objValue = this.get(FIELD_NAVVIEWSHOWMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 导航视图显示模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavViewShowModeDirty(){
        if(this.contains(FIELD_NAVVIEWSHOWMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航视图显示模式
     */
    @JsonIgnore
    public void resetNavViewShowMode(){
        this.reset(FIELD_NAVVIEWSHOWMODE);
    }

    /**
     * 设置 导航视图显示模式
     * <P>
     * 等同 {@link #setNavViewShowMode}
     * @param navViewShowMode
     */
    @JsonIgnore
    public PSDEGrid navviewshowmode(Integer navViewShowMode){
        this.setNavViewShowMode(navViewShowMode);
        return this;
    }

     /**
     * 设置 导航视图显示模式
     * <P>
     * 等同 {@link #setNavViewShowMode}
     * @param navViewShowMode
     */
    @JsonIgnore
    public PSDEGrid navviewshowmode(net.ibizsys.psmodel.core.util.PSModelEnums.NavViewShowMode navViewShowMode){
        if(navViewShowMode == null){
            this.setNavViewShowMode(null);
        }
        else{
            this.setNavViewShowMode(navViewShowMode.value);
        }
        return this;
    }

    /**
     * <B>NAVVIEWWIDTH</B>&nbsp;导航视图宽度
     */
    public final static String FIELD_NAVVIEWWIDTH = "navviewwidth";

    /**
     * 设置 导航视图宽度
     * 
     * @param navViewWidth
     * 
     */
    @JsonProperty(FIELD_NAVVIEWWIDTH)
    public void setNavViewWidth(Double navViewWidth){
        this.set(FIELD_NAVVIEWWIDTH, navViewWidth);
    }
    
    /**
     * 获取 导航视图宽度  
     * @return
     */
    @JsonIgnore
    public Double getNavViewWidth(){
        Object objValue = this.get(FIELD_NAVVIEWWIDTH);
        if(objValue==null){
            return null;
        }
        return (Double)objValue;
    }

    /**
     * 判断 导航视图宽度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavViewWidthDirty(){
        if(this.contains(FIELD_NAVVIEWWIDTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航视图宽度
     */
    @JsonIgnore
    public void resetNavViewWidth(){
        this.reset(FIELD_NAVVIEWWIDTH);
    }

    /**
     * 设置 导航视图宽度
     * <P>
     * 等同 {@link #setNavViewWidth}
     * @param navViewWidth
     */
    @JsonIgnore
    public PSDEGrid navviewwidth(Double navViewWidth){
        this.setNavViewWidth(navViewWidth);
        return this;
    }

    /**
     * <B>NOSORT</B>&nbsp;默认禁用排序，指定是否默认禁用表格列的排序能力，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_NOSORT = "nosort";

    /**
     * 设置 默认禁用排序，详细说明：{@link #FIELD_NOSORT}
     * 
     * @param noSort
     * 
     */
    @JsonProperty(FIELD_NOSORT)
    public void setNoSort(Integer noSort){
        this.set(FIELD_NOSORT, noSort);
    }
    
    /**
     * 获取 默认禁用排序  
     * @return
     */
    @JsonIgnore
    public Integer getNoSort(){
        Object objValue = this.get(FIELD_NOSORT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认禁用排序 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNoSortDirty(){
        if(this.contains(FIELD_NOSORT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认禁用排序
     */
    @JsonIgnore
    public void resetNoSort(){
        this.reset(FIELD_NOSORT);
    }

    /**
     * 设置 默认禁用排序，详细说明：{@link #FIELD_NOSORT}
     * <P>
     * 等同 {@link #setNoSort}
     * @param noSort
     */
    @JsonIgnore
    public PSDEGrid nosort(Integer noSort){
        this.setNoSort(noSort);
        return this;
    }

     /**
     * 设置 默认禁用排序，详细说明：{@link #FIELD_NOSORT}
     * <P>
     * 等同 {@link #setNoSort}
     * @param noSort
     */
    @JsonIgnore
    public PSDEGrid nosort(Boolean noSort){
        if(noSort == null){
            this.setNoSort(null);
        }
        else{
            this.setNoSort(noSort?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ORDERVALUEPSDEFID</B>&nbsp;排序值属性，指定数据表格部件的排序值属性，未指定时使用所在实体的默认排序值属性，启用表格行排序功能需要指定排序值属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_ORDERVALUEPSDEFID = "ordervaluepsdefid";

    /**
     * 设置 排序值属性，详细说明：{@link #FIELD_ORDERVALUEPSDEFID}
     * 
     * @param orderValuePSDEFId
     * 
     */
    @JsonProperty(FIELD_ORDERVALUEPSDEFID)
    public void setOrderValuePSDEFId(String orderValuePSDEFId){
        this.set(FIELD_ORDERVALUEPSDEFID, orderValuePSDEFId);
    }
    
    /**
     * 获取 排序值属性  
     * @return
     */
    @JsonIgnore
    public String getOrderValuePSDEFId(){
        Object objValue = this.get(FIELD_ORDERVALUEPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 排序值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOrderValuePSDEFIdDirty(){
        if(this.contains(FIELD_ORDERVALUEPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 排序值属性
     */
    @JsonIgnore
    public void resetOrderValuePSDEFId(){
        this.reset(FIELD_ORDERVALUEPSDEFID);
    }

    /**
     * 设置 排序值属性，详细说明：{@link #FIELD_ORDERVALUEPSDEFID}
     * <P>
     * 等同 {@link #setOrderValuePSDEFId}
     * @param orderValuePSDEFId
     */
    @JsonIgnore
    public PSDEGrid ordervaluepsdefid(String orderValuePSDEFId){
        this.setOrderValuePSDEFId(orderValuePSDEFId);
        return this;
    }

    /**
     * 设置 排序值属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setOrderValuePSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDEGrid ordervaluepsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setOrderValuePSDEFId(null);
            this.setOrderValuePSDEFName(null);
        }
        else{
            this.setOrderValuePSDEFId(pSDEField.getPSDEFieldId());
            this.setOrderValuePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>ORDERVALUEPSDEFNAME</B>&nbsp;排序值属性，指定数据表格部件的排序值属性，未指定时使用所在实体的默认排序值属性，启用表格行排序功能需要指定排序值属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ORDERVALUEPSDEFID}
     */
    public final static String FIELD_ORDERVALUEPSDEFNAME = "ordervaluepsdefname";

    /**
     * 设置 排序值属性，详细说明：{@link #FIELD_ORDERVALUEPSDEFNAME}
     * 
     * @param orderValuePSDEFName
     * 
     */
    @JsonProperty(FIELD_ORDERVALUEPSDEFNAME)
    public void setOrderValuePSDEFName(String orderValuePSDEFName){
        this.set(FIELD_ORDERVALUEPSDEFNAME, orderValuePSDEFName);
    }
    
    /**
     * 获取 排序值属性  
     * @return
     */
    @JsonIgnore
    public String getOrderValuePSDEFName(){
        Object objValue = this.get(FIELD_ORDERVALUEPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 排序值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOrderValuePSDEFNameDirty(){
        if(this.contains(FIELD_ORDERVALUEPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 排序值属性
     */
    @JsonIgnore
    public void resetOrderValuePSDEFName(){
        this.reset(FIELD_ORDERVALUEPSDEFNAME);
    }

    /**
     * 设置 排序值属性，详细说明：{@link #FIELD_ORDERVALUEPSDEFNAME}
     * <P>
     * 等同 {@link #setOrderValuePSDEFName}
     * @param orderValuePSDEFName
     */
    @JsonIgnore
    public PSDEGrid ordervaluepsdefname(String orderValuePSDEFName){
        this.setOrderValuePSDEFName(orderValuePSDEFName);
        return this;
    }

    /**
     * <B>PAGINGSIZE</B>&nbsp;分页数量，启用数据表格部件分页工具栏时，指定分页的大小，未指定时为【20】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.PagingSize} 
     */
    public final static String FIELD_PAGINGSIZE = "pagingsize";

    /**
     * 设置 分页数量，详细说明：{@link #FIELD_PAGINGSIZE}
     * 
     * @param pagingSize
     * 
     */
    @JsonProperty(FIELD_PAGINGSIZE)
    public void setPagingSize(Integer pagingSize){
        this.set(FIELD_PAGINGSIZE, pagingSize);
    }
    
    /**
     * 获取 分页数量  
     * @return
     */
    @JsonIgnore
    public Integer getPagingSize(){
        Object objValue = this.get(FIELD_PAGINGSIZE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 分页数量 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPagingSizeDirty(){
        if(this.contains(FIELD_PAGINGSIZE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分页数量
     */
    @JsonIgnore
    public void resetPagingSize(){
        this.reset(FIELD_PAGINGSIZE);
    }

    /**
     * 设置 分页数量，详细说明：{@link #FIELD_PAGINGSIZE}
     * <P>
     * 等同 {@link #setPagingSize}
     * @param pagingSize
     */
    @JsonIgnore
    public PSDEGrid pagingsize(Integer pagingSize){
        this.setPagingSize(pagingSize);
        return this;
    }

     /**
     * 设置 分页数量，详细说明：{@link #FIELD_PAGINGSIZE}
     * <P>
     * 等同 {@link #setPagingSize}
     * @param pagingSize
     */
    @JsonIgnore
    public PSDEGrid pagingsize(net.ibizsys.psmodel.core.util.PSModelEnums.PagingSize pagingSize){
        if(pagingSize == null){
            this.setPagingSize(null);
        }
        else{
            this.setPagingSize(pagingSize.value);
        }
        return this;
    }

    /**
     * <B>PSACHANDLERID</B>&nbsp;处理对象，指定数据表格部件的默认界面处理对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSACHandler} 
     */
    public final static String FIELD_PSACHANDLERID = "psachandlerid";

    /**
     * 设置 处理对象，详细说明：{@link #FIELD_PSACHANDLERID}
     * 
     * @param pSACHandlerId
     * 
     */
    @JsonProperty(FIELD_PSACHANDLERID)
    public void setPSACHandlerId(String pSACHandlerId){
        this.set(FIELD_PSACHANDLERID, pSACHandlerId);
    }
    
    /**
     * 获取 处理对象  
     * @return
     */
    @JsonIgnore
    public String getPSACHandlerId(){
        Object objValue = this.get(FIELD_PSACHANDLERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 处理对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSACHandlerIdDirty(){
        if(this.contains(FIELD_PSACHANDLERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 处理对象
     */
    @JsonIgnore
    public void resetPSACHandlerId(){
        this.reset(FIELD_PSACHANDLERID);
    }

    /**
     * 设置 处理对象，详细说明：{@link #FIELD_PSACHANDLERID}
     * <P>
     * 等同 {@link #setPSACHandlerId}
     * @param pSACHandlerId
     */
    @JsonIgnore
    public PSDEGrid psachandlerid(String pSACHandlerId){
        this.setPSACHandlerId(pSACHandlerId);
        return this;
    }

    /**
     * 设置 处理对象，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSACHandlerId}
     * @param pSACHandler 引用对象
     */
    @JsonIgnore
    public PSDEGrid psachandlerid(PSACHandler pSACHandler){
        if(pSACHandler == null){
            this.setPSACHandlerId(null);
            this.setPSACHandlerName(null);
        }
        else{
            this.setPSACHandlerId(pSACHandler.getPSACHandlerId());
            this.setPSACHandlerName(pSACHandler.getPSACHandlerName());
        }
        return this;
    }

    /**
     * <B>PSACHANDLERNAME</B>&nbsp;处理对象，指定数据表格部件的默认界面处理对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSACHANDLERID}
     */
    public final static String FIELD_PSACHANDLERNAME = "psachandlername";

    /**
     * 设置 处理对象，详细说明：{@link #FIELD_PSACHANDLERNAME}
     * 
     * @param pSACHandlerName
     * 
     */
    @JsonProperty(FIELD_PSACHANDLERNAME)
    public void setPSACHandlerName(String pSACHandlerName){
        this.set(FIELD_PSACHANDLERNAME, pSACHandlerName);
    }
    
    /**
     * 获取 处理对象  
     * @return
     */
    @JsonIgnore
    public String getPSACHandlerName(){
        Object objValue = this.get(FIELD_PSACHANDLERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 处理对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSACHandlerNameDirty(){
        if(this.contains(FIELD_PSACHANDLERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 处理对象
     */
    @JsonIgnore
    public void resetPSACHandlerName(){
        this.reset(FIELD_PSACHANDLERNAME);
    }

    /**
     * 设置 处理对象，详细说明：{@link #FIELD_PSACHANDLERNAME}
     * <P>
     * 等同 {@link #setPSACHandlerName}
     * @param pSACHandlerName
     */
    @JsonIgnore
    public PSDEGrid psachandlername(String pSACHandlerName){
        this.setPSACHandlerName(pSACHandlerName);
        return this;
    }

    /**
     * <B>PSCTRLLOGICGROUPID</B>&nbsp;界面逻辑组，指定数据表格部件默认附加的部件逻辑组对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSCtrlLogicGroup} 
     */
    public final static String FIELD_PSCTRLLOGICGROUPID = "psctrllogicgroupid";

    /**
     * 设置 界面逻辑组，详细说明：{@link #FIELD_PSCTRLLOGICGROUPID}
     * 
     * @param pSCtrlLogicGroupId
     * 
     */
    @JsonProperty(FIELD_PSCTRLLOGICGROUPID)
    public void setPSCtrlLogicGroupId(String pSCtrlLogicGroupId){
        this.set(FIELD_PSCTRLLOGICGROUPID, pSCtrlLogicGroupId);
    }
    
    /**
     * 获取 界面逻辑组  
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
     * 判断 界面逻辑组 是否指定值，包括空值
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
     * 重置 界面逻辑组
     */
    @JsonIgnore
    public void resetPSCtrlLogicGroupId(){
        this.reset(FIELD_PSCTRLLOGICGROUPID);
    }

    /**
     * 设置 界面逻辑组，详细说明：{@link #FIELD_PSCTRLLOGICGROUPID}
     * <P>
     * 等同 {@link #setPSCtrlLogicGroupId}
     * @param pSCtrlLogicGroupId
     */
    @JsonIgnore
    public PSDEGrid psctrllogicgroupid(String pSCtrlLogicGroupId){
        this.setPSCtrlLogicGroupId(pSCtrlLogicGroupId);
        return this;
    }

    /**
     * 设置 界面逻辑组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSCtrlLogicGroupId}
     * @param pSCtrlLogicGroup 引用对象
     */
    @JsonIgnore
    public PSDEGrid psctrllogicgroupid(PSCtrlLogicGroup pSCtrlLogicGroup){
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
     * <B>PSCTRLLOGICGROUPNAME</B>&nbsp;界面逻辑组，指定数据表格部件默认附加的部件逻辑组对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCTRLLOGICGROUPID}
     */
    public final static String FIELD_PSCTRLLOGICGROUPNAME = "psctrllogicgroupname";

    /**
     * 设置 界面逻辑组，详细说明：{@link #FIELD_PSCTRLLOGICGROUPNAME}
     * 
     * @param pSCtrlLogicGroupName
     * 
     */
    @JsonProperty(FIELD_PSCTRLLOGICGROUPNAME)
    public void setPSCtrlLogicGroupName(String pSCtrlLogicGroupName){
        this.set(FIELD_PSCTRLLOGICGROUPNAME, pSCtrlLogicGroupName);
    }
    
    /**
     * 获取 界面逻辑组  
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
     * 判断 界面逻辑组 是否指定值，包括空值
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
     * 重置 界面逻辑组
     */
    @JsonIgnore
    public void resetPSCtrlLogicGroupName(){
        this.reset(FIELD_PSCTRLLOGICGROUPNAME);
    }

    /**
     * 设置 界面逻辑组，详细说明：{@link #FIELD_PSCTRLLOGICGROUPNAME}
     * <P>
     * 等同 {@link #setPSCtrlLogicGroupName}
     * @param pSCtrlLogicGroupName
     */
    @JsonIgnore
    public PSDEGrid psctrllogicgroupname(String pSCtrlLogicGroupName){
        this.setPSCtrlLogicGroupName(pSCtrlLogicGroupName);
        return this;
    }

    /**
     * <B>PSCTRLMSGID</B>&nbsp;部件消息，指定数据表格部件默认的部件消息对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSCtrlMsg} 
     */
    public final static String FIELD_PSCTRLMSGID = "psctrlmsgid";

    /**
     * 设置 部件消息，详细说明：{@link #FIELD_PSCTRLMSGID}
     * 
     * @param pSCtrlMsgId
     * 
     */
    @JsonProperty(FIELD_PSCTRLMSGID)
    public void setPSCtrlMsgId(String pSCtrlMsgId){
        this.set(FIELD_PSCTRLMSGID, pSCtrlMsgId);
    }
    
    /**
     * 获取 部件消息  
     * @return
     */
    @JsonIgnore
    public String getPSCtrlMsgId(){
        Object objValue = this.get(FIELD_PSCTRLMSGID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件消息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCtrlMsgIdDirty(){
        if(this.contains(FIELD_PSCTRLMSGID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件消息
     */
    @JsonIgnore
    public void resetPSCtrlMsgId(){
        this.reset(FIELD_PSCTRLMSGID);
    }

    /**
     * 设置 部件消息，详细说明：{@link #FIELD_PSCTRLMSGID}
     * <P>
     * 等同 {@link #setPSCtrlMsgId}
     * @param pSCtrlMsgId
     */
    @JsonIgnore
    public PSDEGrid psctrlmsgid(String pSCtrlMsgId){
        this.setPSCtrlMsgId(pSCtrlMsgId);
        return this;
    }

    /**
     * 设置 部件消息，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSCtrlMsgId}
     * @param pSCtrlMsg 引用对象
     */
    @JsonIgnore
    public PSDEGrid psctrlmsgid(PSCtrlMsg pSCtrlMsg){
        if(pSCtrlMsg == null){
            this.setPSCtrlMsgId(null);
            this.setPSCtrlMsgName(null);
        }
        else{
            this.setPSCtrlMsgId(pSCtrlMsg.getPSCtrlMsgId());
            this.setPSCtrlMsgName(pSCtrlMsg.getPSCtrlMsgName());
        }
        return this;
    }

    /**
     * <B>PSCTRLMSGNAME</B>&nbsp;部件消息，指定数据表格部件默认的部件消息对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCTRLMSGID}
     */
    public final static String FIELD_PSCTRLMSGNAME = "psctrlmsgname";

    /**
     * 设置 部件消息，详细说明：{@link #FIELD_PSCTRLMSGNAME}
     * 
     * @param pSCtrlMsgName
     * 
     */
    @JsonProperty(FIELD_PSCTRLMSGNAME)
    public void setPSCtrlMsgName(String pSCtrlMsgName){
        this.set(FIELD_PSCTRLMSGNAME, pSCtrlMsgName);
    }
    
    /**
     * 获取 部件消息  
     * @return
     */
    @JsonIgnore
    public String getPSCtrlMsgName(){
        Object objValue = this.get(FIELD_PSCTRLMSGNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件消息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCtrlMsgNameDirty(){
        if(this.contains(FIELD_PSCTRLMSGNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件消息
     */
    @JsonIgnore
    public void resetPSCtrlMsgName(){
        this.reset(FIELD_PSCTRLMSGNAME);
    }

    /**
     * 设置 部件消息，详细说明：{@link #FIELD_PSCTRLMSGNAME}
     * <P>
     * 等同 {@link #setPSCtrlMsgName}
     * @param pSCtrlMsgName
     */
    @JsonIgnore
    public PSDEGrid psctrlmsgname(String pSCtrlMsgName){
        this.setPSCtrlMsgName(pSCtrlMsgName);
        return this;
    }

    /**
     * <B>PSDEDATASETID</B>&nbsp;默认数据集合，指定数据表格部件的默认数据集对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataSet} 
     */
    public final static String FIELD_PSDEDATASETID = "psdedatasetid";

    /**
     * 设置 默认数据集合，详细说明：{@link #FIELD_PSDEDATASETID}
     * 
     * @param pSDEDataSetId
     * 
     */
    @JsonProperty(FIELD_PSDEDATASETID)
    public void setPSDEDataSetId(String pSDEDataSetId){
        this.set(FIELD_PSDEDATASETID, pSDEDataSetId);
    }
    
    /**
     * 获取 默认数据集合  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataSetId(){
        Object objValue = this.get(FIELD_PSDEDATASETID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认数据集合 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataSetIdDirty(){
        if(this.contains(FIELD_PSDEDATASETID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认数据集合
     */
    @JsonIgnore
    public void resetPSDEDataSetId(){
        this.reset(FIELD_PSDEDATASETID);
    }

    /**
     * 设置 默认数据集合，详细说明：{@link #FIELD_PSDEDATASETID}
     * <P>
     * 等同 {@link #setPSDEDataSetId}
     * @param pSDEDataSetId
     */
    @JsonIgnore
    public PSDEGrid psdedatasetid(String pSDEDataSetId){
        this.setPSDEDataSetId(pSDEDataSetId);
        return this;
    }

    /**
     * 设置 默认数据集合，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDataSetId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSDEGrid psdedatasetid(PSDEDataSet pSDEDataSet){
        if(pSDEDataSet == null){
            this.setPSDEDataSetId(null);
            this.setPSDEDataSetName(null);
        }
        else{
            this.setPSDEDataSetId(pSDEDataSet.getPSDEDataSetId());
            this.setPSDEDataSetName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    /**
     * <B>PSDEDATASETNAME</B>&nbsp;默认数据集合，指定数据表格部件的默认数据集对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDATASETID}
     */
    public final static String FIELD_PSDEDATASETNAME = "psdedatasetname";

    /**
     * 设置 默认数据集合，详细说明：{@link #FIELD_PSDEDATASETNAME}
     * 
     * @param pSDEDataSetName
     * 
     */
    @JsonProperty(FIELD_PSDEDATASETNAME)
    public void setPSDEDataSetName(String pSDEDataSetName){
        this.set(FIELD_PSDEDATASETNAME, pSDEDataSetName);
    }
    
    /**
     * 获取 默认数据集合  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataSetName(){
        Object objValue = this.get(FIELD_PSDEDATASETNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认数据集合 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataSetNameDirty(){
        if(this.contains(FIELD_PSDEDATASETNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认数据集合
     */
    @JsonIgnore
    public void resetPSDEDataSetName(){
        this.reset(FIELD_PSDEDATASETNAME);
    }

    /**
     * 设置 默认数据集合，详细说明：{@link #FIELD_PSDEDATASETNAME}
     * <P>
     * 等同 {@link #setPSDEDataSetName}
     * @param pSDEDataSetName
     */
    @JsonIgnore
    public PSDEGrid psdedatasetname(String pSDEDataSetName){
        this.setPSDEDataSetName(pSDEDataSetName);
        return this;
    }

    /**
     * <B>PSDEGRIDID</B>&nbsp;实体表格标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEGRIDID = "psdegridid";

    /**
     * 设置 实体表格标识
     * 
     * @param pSDEGridId
     * 
     */
    @JsonProperty(FIELD_PSDEGRIDID)
    public void setPSDEGridId(String pSDEGridId){
        this.set(FIELD_PSDEGRIDID, pSDEGridId);
    }
    
    /**
     * 获取 实体表格标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEGridId(){
        Object objValue = this.get(FIELD_PSDEGRIDID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体表格标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEGridIdDirty(){
        if(this.contains(FIELD_PSDEGRIDID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体表格标识
     */
    @JsonIgnore
    public void resetPSDEGridId(){
        this.reset(FIELD_PSDEGRIDID);
    }

    /**
     * 设置 实体表格标识
     * <P>
     * 等同 {@link #setPSDEGridId}
     * @param pSDEGridId
     */
    @JsonIgnore
    public PSDEGrid psdegridid(String pSDEGridId){
        this.setPSDEGridId(pSDEGridId);
        return this;
    }

    /**
     * <B>PSDEGRIDNAME</B>&nbsp;表格名称，指定实体数据表格的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEGRIDNAME = "psdegridname";

    /**
     * 设置 表格名称，详细说明：{@link #FIELD_PSDEGRIDNAME}
     * 
     * @param pSDEGridName
     * 
     */
    @JsonProperty(FIELD_PSDEGRIDNAME)
    public void setPSDEGridName(String pSDEGridName){
        this.set(FIELD_PSDEGRIDNAME, pSDEGridName);
    }
    
    /**
     * 获取 表格名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEGridName(){
        Object objValue = this.get(FIELD_PSDEGRIDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表格名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEGridNameDirty(){
        if(this.contains(FIELD_PSDEGRIDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表格名称
     */
    @JsonIgnore
    public void resetPSDEGridName(){
        this.reset(FIELD_PSDEGRIDNAME);
    }

    /**
     * 设置 表格名称，详细说明：{@link #FIELD_PSDEGRIDNAME}
     * <P>
     * 等同 {@link #setPSDEGridName}
     * @param pSDEGridName
     */
    @JsonIgnore
    public PSDEGrid psdegridname(String pSDEGridName){
        this.setPSDEGridName(pSDEGridName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEGridName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEGridName(strName);
    }

    @JsonIgnore
    public PSDEGrid name(String strName){
        this.setPSDEGridName(strName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定数据表格所属的实体对象
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
    public PSDEGrid psdeid(String pSDEId){
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
    public PSDEGrid psdeid(PSDataEntity pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;实体，指定数据表格所属的实体对象
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
    public PSDEGrid psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSSYSCSSID</B>&nbsp;默认样式表，指定数据表格部件的默认界面样式表对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCss} 
     */
    public final static String FIELD_PSSYSCSSID = "pssyscssid";

    /**
     * 设置 默认样式表，详细说明：{@link #FIELD_PSSYSCSSID}
     * 
     * @param pSSysCssId
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSID)
    public void setPSSysCssId(String pSSysCssId){
        this.set(FIELD_PSSYSCSSID, pSSysCssId);
    }
    
    /**
     * 获取 默认样式表  
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
     * 判断 默认样式表 是否指定值，包括空值
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
     * 重置 默认样式表
     */
    @JsonIgnore
    public void resetPSSysCssId(){
        this.reset(FIELD_PSSYSCSSID);
    }

    /**
     * 设置 默认样式表，详细说明：{@link #FIELD_PSSYSCSSID}
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCssId
     */
    @JsonIgnore
    public PSDEGrid pssyscssid(String pSSysCssId){
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    /**
     * 设置 默认样式表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSDEGrid pssyscssid(PSSysCss pSSysCss){
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
     * <B>PSSYSCSSNAME</B>&nbsp;界面样式表，指定数据表格部件的默认界面样式表对象
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
    public PSDEGrid pssyscssname(String pSSysCssName){
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELID</B>&nbsp;动态系统模型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDynaModel} 
     */
    public final static String FIELD_PSSYSDYNAMODELID = "pssysdynamodelid";

    /**
     * 设置 动态系统模型
     * 
     * @param pSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELID)
    public void setPSSysDynaModelId(String pSSysDynaModelId){
        this.set(FIELD_PSSYSDYNAMODELID, pSSysDynaModelId);
    }
    
    /**
     * 获取 动态系统模型  
     * @return
     */
    @JsonIgnore
    public String getPSSysDynaModelId(){
        Object objValue = this.get(FIELD_PSSYSDYNAMODELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 动态系统模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDynaModelIdDirty(){
        if(this.contains(FIELD_PSSYSDYNAMODELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 动态系统模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelId(){
        this.reset(FIELD_PSSYSDYNAMODELID);
    }

    /**
     * 设置 动态系统模型
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModelId
     */
    @JsonIgnore
    public PSDEGrid pssysdynamodelid(String pSSysDynaModelId){
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    /**
     * 设置 动态系统模型，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModel 引用对象
     */
    @JsonIgnore
    public PSDEGrid pssysdynamodelid(PSSysDynaModel pSSysDynaModel){
        if(pSSysDynaModel == null){
            this.setPSSysDynaModelId(null);
            this.setPSSysDynaModelName(null);
        }
        else{
            this.setPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELNAME</B>&nbsp;动态系统模型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDYNAMODELID}
     */
    public final static String FIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";

    /**
     * 设置 动态系统模型
     * 
     * @param pSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELNAME)
    public void setPSSysDynaModelName(String pSSysDynaModelName){
        this.set(FIELD_PSSYSDYNAMODELNAME, pSSysDynaModelName);
    }
    
    /**
     * 获取 动态系统模型  
     * @return
     */
    @JsonIgnore
    public String getPSSysDynaModelName(){
        Object objValue = this.get(FIELD_PSSYSDYNAMODELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 动态系统模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDynaModelNameDirty(){
        if(this.contains(FIELD_PSSYSDYNAMODELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 动态系统模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelName(){
        this.reset(FIELD_PSSYSDYNAMODELNAME);
    }

    /**
     * 设置 动态系统模型
     * <P>
     * 等同 {@link #setPSSysDynaModelName}
     * @param pSSysDynaModelName
     */
    @JsonIgnore
    public PSDEGrid pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端扩展插件，指定实体表格使用的前端模板扩展插件，使用插件类型【数据表格绘制插件】
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
    public PSDEGrid pssyspfpluginid(String pSSysPFPluginId){
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
    public PSDEGrid pssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
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
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端扩展插件，指定实体表格使用的前端模板扩展插件，使用插件类型【数据表格绘制插件】
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
    public PSDEGrid pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    /**
     * <B>PSSYSREQITEMID</B>&nbsp;系统设计需求
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysReqItem} 
     */
    public final static String FIELD_PSSYSREQITEMID = "pssysreqitemid";

    /**
     * 设置 系统设计需求
     * 
     * @param pSSysReqItemId
     * 
     */
    @JsonProperty(FIELD_PSSYSREQITEMID)
    public void setPSSysReqItemId(String pSSysReqItemId){
        this.set(FIELD_PSSYSREQITEMID, pSSysReqItemId);
    }
    
    /**
     * 获取 系统设计需求  
     * @return
     */
    @JsonIgnore
    public String getPSSysReqItemId(){
        Object objValue = this.get(FIELD_PSSYSREQITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统设计需求 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysReqItemIdDirty(){
        if(this.contains(FIELD_PSSYSREQITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统设计需求
     */
    @JsonIgnore
    public void resetPSSysReqItemId(){
        this.reset(FIELD_PSSYSREQITEMID);
    }

    /**
     * 设置 系统设计需求
     * <P>
     * 等同 {@link #setPSSysReqItemId}
     * @param pSSysReqItemId
     */
    @JsonIgnore
    public PSDEGrid pssysreqitemid(String pSSysReqItemId){
        this.setPSSysReqItemId(pSSysReqItemId);
        return this;
    }

    /**
     * 设置 系统设计需求，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysReqItemId}
     * @param pSSysReqItem 引用对象
     */
    @JsonIgnore
    public PSDEGrid pssysreqitemid(PSSysReqItem pSSysReqItem){
        if(pSSysReqItem == null){
            this.setPSSysReqItemId(null);
            this.setPSSysReqItemName(null);
        }
        else{
            this.setPSSysReqItemId(pSSysReqItem.getPSSysReqItemId());
            this.setPSSysReqItemName(pSSysReqItem.getPSSysReqItemName());
        }
        return this;
    }

    /**
     * <B>PSSYSREQITEMNAME</B>&nbsp;系统设计需求
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSREQITEMID}
     */
    public final static String FIELD_PSSYSREQITEMNAME = "pssysreqitemname";

    /**
     * 设置 系统设计需求
     * 
     * @param pSSysReqItemName
     * 
     */
    @JsonProperty(FIELD_PSSYSREQITEMNAME)
    public void setPSSysReqItemName(String pSSysReqItemName){
        this.set(FIELD_PSSYSREQITEMNAME, pSSysReqItemName);
    }
    
    /**
     * 获取 系统设计需求  
     * @return
     */
    @JsonIgnore
    public String getPSSysReqItemName(){
        Object objValue = this.get(FIELD_PSSYSREQITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统设计需求 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysReqItemNameDirty(){
        if(this.contains(FIELD_PSSYSREQITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统设计需求
     */
    @JsonIgnore
    public void resetPSSysReqItemName(){
        this.reset(FIELD_PSSYSREQITEMNAME);
    }

    /**
     * 设置 系统设计需求
     * <P>
     * 等同 {@link #setPSSysReqItemName}
     * @param pSSysReqItemName
     */
    @JsonIgnore
    public PSDEGrid pssysreqitemname(String pSSysReqItemName){
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    /**
     * <B>PSVIEWMSGGROUPID</B>&nbsp;视图消息组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSViewMsgGroup} 
     */
    public final static String FIELD_PSVIEWMSGGROUPID = "psviewmsggroupid";

    /**
     * 设置 视图消息组
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
     * 设置 视图消息组
     * <P>
     * 等同 {@link #setPSViewMsgGroupId}
     * @param pSViewMsgGroupId
     */
    @JsonIgnore
    public PSDEGrid psviewmsggroupid(String pSViewMsgGroupId){
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
    public PSDEGrid psviewmsggroupid(PSViewMsgGroup pSViewMsgGroup){
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
     * <B>PSVIEWMSGGROUPNAME</B>&nbsp;视图消息组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSVIEWMSGGROUPID}
     */
    public final static String FIELD_PSVIEWMSGGROUPNAME = "psviewmsggroupname";

    /**
     * 设置 视图消息组
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
     * 设置 视图消息组
     * <P>
     * 等同 {@link #setPSViewMsgGroupName}
     * @param pSViewMsgGroupName
     */
    @JsonIgnore
    public PSDEGrid psviewmsggroupname(String pSViewMsgGroupName){
        this.setPSViewMsgGroupName(pSViewMsgGroupName);
        return this;
    }

    /**
     * <B>QUICKPSDETOOLBARID</B>&nbsp;快速操作工具栏，指定数据表格部件内建的快速操作工具栏对象，快速操作工具栏一般用于新建等无选择数据的操作
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEToolbar} 
     */
    public final static String FIELD_QUICKPSDETOOLBARID = "quickpsdetoolbarid";

    /**
     * 设置 快速操作工具栏，详细说明：{@link #FIELD_QUICKPSDETOOLBARID}
     * 
     * @param quickPSDEToolbarId
     * 
     */
    @JsonProperty(FIELD_QUICKPSDETOOLBARID)
    public void setQuickPSDEToolbarId(String quickPSDEToolbarId){
        this.set(FIELD_QUICKPSDETOOLBARID, quickPSDEToolbarId);
    }
    
    /**
     * 获取 快速操作工具栏  
     * @return
     */
    @JsonIgnore
    public String getQuickPSDEToolbarId(){
        Object objValue = this.get(FIELD_QUICKPSDETOOLBARID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 快速操作工具栏 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isQuickPSDEToolbarIdDirty(){
        if(this.contains(FIELD_QUICKPSDETOOLBARID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 快速操作工具栏
     */
    @JsonIgnore
    public void resetQuickPSDEToolbarId(){
        this.reset(FIELD_QUICKPSDETOOLBARID);
    }

    /**
     * 设置 快速操作工具栏，详细说明：{@link #FIELD_QUICKPSDETOOLBARID}
     * <P>
     * 等同 {@link #setQuickPSDEToolbarId}
     * @param quickPSDEToolbarId
     */
    @JsonIgnore
    public PSDEGrid quickpsdetoolbarid(String quickPSDEToolbarId){
        this.setQuickPSDEToolbarId(quickPSDEToolbarId);
        return this;
    }

    /**
     * 设置 快速操作工具栏，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setQuickPSDEToolbarId}
     * @param pSDEToolbar 引用对象
     */
    @JsonIgnore
    public PSDEGrid quickpsdetoolbarid(PSDEToolbar pSDEToolbar){
        if(pSDEToolbar == null){
            this.setQuickPSDEToolbarId(null);
            this.setQuickPSDEToolbarName(null);
        }
        else{
            this.setQuickPSDEToolbarId(pSDEToolbar.getPSDEToolbarId());
            this.setQuickPSDEToolbarName(pSDEToolbar.getPSDEToolbarName());
        }
        return this;
    }

    /**
     * <B>QUICKPSDETOOLBARNAME</B>&nbsp;快速操作工具栏，指定数据表格部件内建的快速操作工具栏对象，快速操作工具栏一般用于新建等无选择数据的操作
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_QUICKPSDETOOLBARID}
     */
    public final static String FIELD_QUICKPSDETOOLBARNAME = "quickpsdetoolbarname";

    /**
     * 设置 快速操作工具栏，详细说明：{@link #FIELD_QUICKPSDETOOLBARNAME}
     * 
     * @param quickPSDEToolbarName
     * 
     */
    @JsonProperty(FIELD_QUICKPSDETOOLBARNAME)
    public void setQuickPSDEToolbarName(String quickPSDEToolbarName){
        this.set(FIELD_QUICKPSDETOOLBARNAME, quickPSDEToolbarName);
    }
    
    /**
     * 获取 快速操作工具栏  
     * @return
     */
    @JsonIgnore
    public String getQuickPSDEToolbarName(){
        Object objValue = this.get(FIELD_QUICKPSDETOOLBARNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 快速操作工具栏 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isQuickPSDEToolbarNameDirty(){
        if(this.contains(FIELD_QUICKPSDETOOLBARNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 快速操作工具栏
     */
    @JsonIgnore
    public void resetQuickPSDEToolbarName(){
        this.reset(FIELD_QUICKPSDETOOLBARNAME);
    }

    /**
     * 设置 快速操作工具栏，详细说明：{@link #FIELD_QUICKPSDETOOLBARNAME}
     * <P>
     * 等同 {@link #setQuickPSDEToolbarName}
     * @param quickPSDEToolbarName
     */
    @JsonIgnore
    public PSDEGrid quickpsdetoolbarname(String quickPSDEToolbarName){
        this.setQuickPSDEToolbarName(quickPSDEToolbarName);
        return this;
    }

    /**
     * <B>REMOVEPSDEACTIONID</B>&nbsp;删除数据实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_REMOVEPSDEACTIONID = "removepsdeactionid";

    /**
     * 设置 删除数据实体行为
     * 
     * @param removePSDEActionId
     * 
     */
    @JsonProperty(FIELD_REMOVEPSDEACTIONID)
    public void setRemovePSDEActionId(String removePSDEActionId){
        this.set(FIELD_REMOVEPSDEACTIONID, removePSDEActionId);
    }
    
    /**
     * 获取 删除数据实体行为  
     * @return
     */
    @JsonIgnore
    public String getRemovePSDEActionId(){
        Object objValue = this.get(FIELD_REMOVEPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 删除数据实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRemovePSDEActionIdDirty(){
        if(this.contains(FIELD_REMOVEPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 删除数据实体行为
     */
    @JsonIgnore
    public void resetRemovePSDEActionId(){
        this.reset(FIELD_REMOVEPSDEACTIONID);
    }

    /**
     * 设置 删除数据实体行为
     * <P>
     * 等同 {@link #setRemovePSDEActionId}
     * @param removePSDEActionId
     */
    @JsonIgnore
    public PSDEGrid removepsdeactionid(String removePSDEActionId){
        this.setRemovePSDEActionId(removePSDEActionId);
        return this;
    }

    /**
     * 设置 删除数据实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRemovePSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDEGrid removepsdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setRemovePSDEActionId(null);
            this.setRemovePSDEActionName(null);
        }
        else{
            this.setRemovePSDEActionId(pSDEAction.getPSDEActionId());
            this.setRemovePSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>REMOVEPSDEACTIONNAME</B>&nbsp;删除数据实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REMOVEPSDEACTIONID}
     */
    public final static String FIELD_REMOVEPSDEACTIONNAME = "removepsdeactionname";

    /**
     * 设置 删除数据实体行为
     * 
     * @param removePSDEActionName
     * 
     */
    @JsonProperty(FIELD_REMOVEPSDEACTIONNAME)
    public void setRemovePSDEActionName(String removePSDEActionName){
        this.set(FIELD_REMOVEPSDEACTIONNAME, removePSDEActionName);
    }
    
    /**
     * 获取 删除数据实体行为  
     * @return
     */
    @JsonIgnore
    public String getRemovePSDEActionName(){
        Object objValue = this.get(FIELD_REMOVEPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 删除数据实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRemovePSDEActionNameDirty(){
        if(this.contains(FIELD_REMOVEPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 删除数据实体行为
     */
    @JsonIgnore
    public void resetRemovePSDEActionName(){
        this.reset(FIELD_REMOVEPSDEACTIONNAME);
    }

    /**
     * 设置 删除数据实体行为
     * <P>
     * 等同 {@link #setRemovePSDEActionName}
     * @param removePSDEActionName
     */
    @JsonIgnore
    public PSDEGrid removepsdeactionname(String removePSDEActionName){
        this.setRemovePSDEActionName(removePSDEActionName);
        return this;
    }

    /**
     * <B>SHOWHEADER</B>&nbsp;显示头部，指定数据表格部件是否显示头部，未定义时为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_SHOWHEADER = "showheader";

    /**
     * 设置 显示头部，详细说明：{@link #FIELD_SHOWHEADER}
     * 
     * @param showHeader
     * 
     */
    @JsonProperty(FIELD_SHOWHEADER)
    public void setShowHeader(Integer showHeader){
        this.set(FIELD_SHOWHEADER, showHeader);
    }
    
    /**
     * 获取 显示头部  
     * @return
     */
    @JsonIgnore
    public Integer getShowHeader(){
        Object objValue = this.get(FIELD_SHOWHEADER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 显示头部 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isShowHeaderDirty(){
        if(this.contains(FIELD_SHOWHEADER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 显示头部
     */
    @JsonIgnore
    public void resetShowHeader(){
        this.reset(FIELD_SHOWHEADER);
    }

    /**
     * 设置 显示头部，详细说明：{@link #FIELD_SHOWHEADER}
     * <P>
     * 等同 {@link #setShowHeader}
     * @param showHeader
     */
    @JsonIgnore
    public PSDEGrid showheader(Integer showHeader){
        this.setShowHeader(showHeader);
        return this;
    }

     /**
     * 设置 显示头部，详细说明：{@link #FIELD_SHOWHEADER}
     * <P>
     * 等同 {@link #setShowHeader}
     * @param showHeader
     */
    @JsonIgnore
    public PSDEGrid showheader(Boolean showHeader){
        if(showHeader == null){
            this.setShowHeader(null);
        }
        else{
            this.setShowHeader(showHeader?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>SORTMODE</B>&nbsp;排序模式，指定数据表格部件的排序模式，未定义时为【远程排序】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SortMode} 
     */
    public final static String FIELD_SORTMODE = "sortmode";

    /**
     * 设置 排序模式，详细说明：{@link #FIELD_SORTMODE}
     * 
     * @param sortMode
     * 
     */
    @JsonProperty(FIELD_SORTMODE)
    public void setSortMode(String sortMode){
        this.set(FIELD_SORTMODE, sortMode);
    }
    
    /**
     * 获取 排序模式  
     * @return
     */
    @JsonIgnore
    public String getSortMode(){
        Object objValue = this.get(FIELD_SORTMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 排序模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSortModeDirty(){
        if(this.contains(FIELD_SORTMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 排序模式
     */
    @JsonIgnore
    public void resetSortMode(){
        this.reset(FIELD_SORTMODE);
    }

    /**
     * 设置 排序模式，详细说明：{@link #FIELD_SORTMODE}
     * <P>
     * 等同 {@link #setSortMode}
     * @param sortMode
     */
    @JsonIgnore
    public PSDEGrid sortmode(String sortMode){
        this.setSortMode(sortMode);
        return this;
    }

     /**
     * 设置 排序模式，详细说明：{@link #FIELD_SORTMODE}
     * <P>
     * 等同 {@link #setSortMode}
     * @param sortMode
     */
    @JsonIgnore
    public PSDEGrid sortmode(net.ibizsys.psmodel.core.util.PSModelEnums.SortMode sortMode){
        if(sortMode == null){
            this.setSortMode(null);
        }
        else{
            this.setSortMode(sortMode.value);
        }
        return this;
    }

    /**
     * <B>TREEPPSDEFID</B>&nbsp;树表父数据属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_TREEPPSDEFID = "treeppsdefid";

    /**
     * 设置 树表父数据属性
     * 
     * @param treePPSDEFId
     * 
     */
    @JsonProperty(FIELD_TREEPPSDEFID)
    public void setTreePPSDEFId(String treePPSDEFId){
        this.set(FIELD_TREEPPSDEFID, treePPSDEFId);
    }
    
    /**
     * 获取 树表父数据属性  
     * @return
     */
    @JsonIgnore
    public String getTreePPSDEFId(){
        Object objValue = this.get(FIELD_TREEPPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 树表父数据属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTreePPSDEFIdDirty(){
        if(this.contains(FIELD_TREEPPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 树表父数据属性
     */
    @JsonIgnore
    public void resetTreePPSDEFId(){
        this.reset(FIELD_TREEPPSDEFID);
    }

    /**
     * 设置 树表父数据属性
     * <P>
     * 等同 {@link #setTreePPSDEFId}
     * @param treePPSDEFId
     */
    @JsonIgnore
    public PSDEGrid treeppsdefid(String treePPSDEFId){
        this.setTreePPSDEFId(treePPSDEFId);
        return this;
    }

    /**
     * 设置 树表父数据属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTreePPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDEGrid treeppsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setTreePPSDEFId(null);
            this.setTreePPSDEFName(null);
        }
        else{
            this.setTreePPSDEFId(pSDEField.getPSDEFieldId());
            this.setTreePPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>TREEPPSDEFNAME</B>&nbsp;树表父数据属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TREEPPSDEFID}
     */
    public final static String FIELD_TREEPPSDEFNAME = "treeppsdefname";

    /**
     * 设置 树表父数据属性
     * 
     * @param treePPSDEFName
     * 
     */
    @JsonProperty(FIELD_TREEPPSDEFNAME)
    public void setTreePPSDEFName(String treePPSDEFName){
        this.set(FIELD_TREEPPSDEFNAME, treePPSDEFName);
    }
    
    /**
     * 获取 树表父数据属性  
     * @return
     */
    @JsonIgnore
    public String getTreePPSDEFName(){
        Object objValue = this.get(FIELD_TREEPPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 树表父数据属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTreePPSDEFNameDirty(){
        if(this.contains(FIELD_TREEPPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 树表父数据属性
     */
    @JsonIgnore
    public void resetTreePPSDEFName(){
        this.reset(FIELD_TREEPPSDEFNAME);
    }

    /**
     * 设置 树表父数据属性
     * <P>
     * 等同 {@link #setTreePPSDEFName}
     * @param treePPSDEFName
     */
    @JsonIgnore
    public PSDEGrid treeppsdefname(String treePPSDEFName){
        this.setTreePPSDEFName(treePPSDEFName);
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
    public PSDEGrid updatedate(String updateDate){
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
    public PSDEGrid updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>UPDATEPSDEACTIONID</B>&nbsp;更新数据实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_UPDATEPSDEACTIONID = "updatepsdeactionid";

    /**
     * 设置 更新数据实体行为
     * 
     * @param updatePSDEActionId
     * 
     */
    @JsonProperty(FIELD_UPDATEPSDEACTIONID)
    public void setUpdatePSDEActionId(String updatePSDEActionId){
        this.set(FIELD_UPDATEPSDEACTIONID, updatePSDEActionId);
    }
    
    /**
     * 获取 更新数据实体行为  
     * @return
     */
    @JsonIgnore
    public String getUpdatePSDEActionId(){
        Object objValue = this.get(FIELD_UPDATEPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 更新数据实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUpdatePSDEActionIdDirty(){
        if(this.contains(FIELD_UPDATEPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 更新数据实体行为
     */
    @JsonIgnore
    public void resetUpdatePSDEActionId(){
        this.reset(FIELD_UPDATEPSDEACTIONID);
    }

    /**
     * 设置 更新数据实体行为
     * <P>
     * 等同 {@link #setUpdatePSDEActionId}
     * @param updatePSDEActionId
     */
    @JsonIgnore
    public PSDEGrid updatepsdeactionid(String updatePSDEActionId){
        this.setUpdatePSDEActionId(updatePSDEActionId);
        return this;
    }

    /**
     * 设置 更新数据实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUpdatePSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDEGrid updatepsdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setUpdatePSDEActionId(null);
            this.setUpdatePSDEActionName(null);
        }
        else{
            this.setUpdatePSDEActionId(pSDEAction.getPSDEActionId());
            this.setUpdatePSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>UPDATEPSDEACTIONNAME</B>&nbsp;更新数据实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UPDATEPSDEACTIONID}
     */
    public final static String FIELD_UPDATEPSDEACTIONNAME = "updatepsdeactionname";

    /**
     * 设置 更新数据实体行为
     * 
     * @param updatePSDEActionName
     * 
     */
    @JsonProperty(FIELD_UPDATEPSDEACTIONNAME)
    public void setUpdatePSDEActionName(String updatePSDEActionName){
        this.set(FIELD_UPDATEPSDEACTIONNAME, updatePSDEActionName);
    }
    
    /**
     * 获取 更新数据实体行为  
     * @return
     */
    @JsonIgnore
    public String getUpdatePSDEActionName(){
        Object objValue = this.get(FIELD_UPDATEPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 更新数据实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUpdatePSDEActionNameDirty(){
        if(this.contains(FIELD_UPDATEPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 更新数据实体行为
     */
    @JsonIgnore
    public void resetUpdatePSDEActionName(){
        this.reset(FIELD_UPDATEPSDEACTIONNAME);
    }

    /**
     * 设置 更新数据实体行为
     * <P>
     * 等同 {@link #setUpdatePSDEActionName}
     * @param updatePSDEActionName
     */
    @JsonIgnore
    public PSDEGrid updatepsdeactionname(String updatePSDEActionName){
        this.setUpdatePSDEActionName(updatePSDEActionName);
        return this;
    }

    /**
     * <B>USER2PSDEACTIONID</B>&nbsp;自定义实体行为2
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_USER2PSDEACTIONID = "user2psdeactionid";

    /**
     * 设置 自定义实体行为2
     * 
     * @param user2PSDEActionId
     * 
     */
    @JsonProperty(FIELD_USER2PSDEACTIONID)
    public void setUser2PSDEActionId(String user2PSDEActionId){
        this.set(FIELD_USER2PSDEACTIONID, user2PSDEActionId);
    }
    
    /**
     * 获取 自定义实体行为2  
     * @return
     */
    @JsonIgnore
    public String getUser2PSDEActionId(){
        Object objValue = this.get(FIELD_USER2PSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义实体行为2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUser2PSDEActionIdDirty(){
        if(this.contains(FIELD_USER2PSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义实体行为2
     */
    @JsonIgnore
    public void resetUser2PSDEActionId(){
        this.reset(FIELD_USER2PSDEACTIONID);
    }

    /**
     * 设置 自定义实体行为2
     * <P>
     * 等同 {@link #setUser2PSDEActionId}
     * @param user2PSDEActionId
     */
    @JsonIgnore
    public PSDEGrid user2psdeactionid(String user2PSDEActionId){
        this.setUser2PSDEActionId(user2PSDEActionId);
        return this;
    }

    /**
     * 设置 自定义实体行为2，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUser2PSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDEGrid user2psdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setUser2PSDEActionId(null);
            this.setUser2PSDEActionName(null);
        }
        else{
            this.setUser2PSDEActionId(pSDEAction.getPSDEActionId());
            this.setUser2PSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>USER2PSDEACTIONNAME</B>&nbsp;自定义实体行为2
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_USER2PSDEACTIONID}
     */
    public final static String FIELD_USER2PSDEACTIONNAME = "user2psdeactionname";

    /**
     * 设置 自定义实体行为2
     * 
     * @param user2PSDEActionName
     * 
     */
    @JsonProperty(FIELD_USER2PSDEACTIONNAME)
    public void setUser2PSDEActionName(String user2PSDEActionName){
        this.set(FIELD_USER2PSDEACTIONNAME, user2PSDEActionName);
    }
    
    /**
     * 获取 自定义实体行为2  
     * @return
     */
    @JsonIgnore
    public String getUser2PSDEActionName(){
        Object objValue = this.get(FIELD_USER2PSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义实体行为2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUser2PSDEActionNameDirty(){
        if(this.contains(FIELD_USER2PSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义实体行为2
     */
    @JsonIgnore
    public void resetUser2PSDEActionName(){
        this.reset(FIELD_USER2PSDEACTIONNAME);
    }

    /**
     * 设置 自定义实体行为2
     * <P>
     * 等同 {@link #setUser2PSDEActionName}
     * @param user2PSDEActionName
     */
    @JsonIgnore
    public PSDEGrid user2psdeactionname(String user2PSDEActionName){
        this.setUser2PSDEActionName(user2PSDEActionName);
        return this;
    }

    /**
     * <B>USERPARAMS</B>&nbsp;自定义参数
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_USERPARAMS = "userparams";

    /**
     * 设置 自定义参数
     * 
     * @param userParams
     * 
     */
    @JsonProperty(FIELD_USERPARAMS)
    public void setUserParams(String userParams){
        this.set(FIELD_USERPARAMS, userParams);
    }
    
    /**
     * 获取 自定义参数  
     * @return
     */
    @JsonIgnore
    public String getUserParams(){
        Object objValue = this.get(FIELD_USERPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserParamsDirty(){
        if(this.contains(FIELD_USERPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义参数
     */
    @JsonIgnore
    public void resetUserParams(){
        this.reset(FIELD_USERPARAMS);
    }

    /**
     * 设置 自定义参数
     * <P>
     * 等同 {@link #setUserParams}
     * @param userParams
     */
    @JsonIgnore
    public PSDEGrid userparams(String userParams){
        this.setUserParams(userParams);
        return this;
    }

    /**
     * <B>USERPSDEACTIONID</B>&nbsp;用户自定义实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_USERPSDEACTIONID = "userpsdeactionid";

    /**
     * 设置 用户自定义实体行为
     * 
     * @param userPSDEActionId
     * 
     */
    @JsonProperty(FIELD_USERPSDEACTIONID)
    public void setUserPSDEActionId(String userPSDEActionId){
        this.set(FIELD_USERPSDEACTIONID, userPSDEActionId);
    }
    
    /**
     * 获取 用户自定义实体行为  
     * @return
     */
    @JsonIgnore
    public String getUserPSDEActionId(){
        Object objValue = this.get(FIELD_USERPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户自定义实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserPSDEActionIdDirty(){
        if(this.contains(FIELD_USERPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户自定义实体行为
     */
    @JsonIgnore
    public void resetUserPSDEActionId(){
        this.reset(FIELD_USERPSDEACTIONID);
    }

    /**
     * 设置 用户自定义实体行为
     * <P>
     * 等同 {@link #setUserPSDEActionId}
     * @param userPSDEActionId
     */
    @JsonIgnore
    public PSDEGrid userpsdeactionid(String userPSDEActionId){
        this.setUserPSDEActionId(userPSDEActionId);
        return this;
    }

    /**
     * 设置 用户自定义实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUserPSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDEGrid userpsdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setUserPSDEActionId(null);
            this.setUserPSDEActionName(null);
        }
        else{
            this.setUserPSDEActionId(pSDEAction.getPSDEActionId());
            this.setUserPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>USERPSDEACTIONNAME</B>&nbsp;自定义实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_USERPSDEACTIONID}
     */
    public final static String FIELD_USERPSDEACTIONNAME = "userpsdeactionname";

    /**
     * 设置 自定义实体行为
     * 
     * @param userPSDEActionName
     * 
     */
    @JsonProperty(FIELD_USERPSDEACTIONNAME)
    public void setUserPSDEActionName(String userPSDEActionName){
        this.set(FIELD_USERPSDEACTIONNAME, userPSDEActionName);
    }
    
    /**
     * 获取 自定义实体行为  
     * @return
     */
    @JsonIgnore
    public String getUserPSDEActionName(){
        Object objValue = this.get(FIELD_USERPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserPSDEActionNameDirty(){
        if(this.contains(FIELD_USERPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义实体行为
     */
    @JsonIgnore
    public void resetUserPSDEActionName(){
        this.reset(FIELD_USERPSDEACTIONNAME);
    }

    /**
     * 设置 自定义实体行为
     * <P>
     * 等同 {@link #setUserPSDEActionName}
     * @param userPSDEActionName
     */
    @JsonIgnore
    public PSDEGrid userpsdeactionname(String userPSDEActionName){
        this.setUserPSDEActionName(userPSDEActionName);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEGridId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEGridId(strValue);
    }

    @JsonIgnore
    public PSDEGrid id(String strValue){
        this.setPSDEGridId(strValue);
        return this;
    }


    /**
     *  实体表格列 成员集合
     */
    public final static String FIELD_PSDEGRIDCOLS = "psdegridcols";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSDEGridCol> psdegridcols;

    /**
     * 获取 实体表格列 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEGRIDCOLS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEGridCol> getPSDEGridCols(){
        return this.psdegridcols;
    }

    /**
     * 设置 实体表格列 成员集合  
     * @param psdegridcols
     */
    @JsonProperty(FIELD_PSDEGRIDCOLS)
    public void setPSDEGridCols(java.util.List<net.ibizsys.psmodel.core.domain.PSDEGridCol> psdegridcols){
        this.psdegridcols = psdegridcols;
    }

    /**
     * 获取 实体表格列 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEGridCol> getPSDEGridColsIf(){
        if(this.psdegridcols == null){
            this.psdegridcols = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSDEGridCol>();          
        }
        return this.psdegridcols;
    }


    /**
     *  表格编辑项更新模式 成员集合
     */
    public final static String FIELD_PSDEGEIUPDATES = "psdegeiupdates";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSDEGEIUpdate> psdegeiupdates;

    /**
     * 获取 表格编辑项更新模式 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEGEIUPDATES)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEGEIUpdate> getPSDEGEIUpdates(){
        return this.psdegeiupdates;
    }

    /**
     * 设置 表格编辑项更新模式 成员集合  
     * @param psdegeiupdates
     */
    @JsonProperty(FIELD_PSDEGEIUPDATES)
    public void setPSDEGEIUpdates(java.util.List<net.ibizsys.psmodel.core.domain.PSDEGEIUpdate> psdegeiupdates){
        this.psdegeiupdates = psdegeiupdates;
    }

    /**
     * 获取 表格编辑项更新模式 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEGEIUpdate> getPSDEGEIUpdatesIf(){
        if(this.psdegeiupdates == null){
            this.psdegeiupdates = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSDEGEIUpdate>();          
        }
        return this.psdegeiupdates;
    }


    /**
     *  表格编辑项值规则 成员集合
     */
    public final static String FIELD_PSDEGEIVRS = "psdegeivrs";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSDEGEIVR> psdegeivrs;

    /**
     * 获取 表格编辑项值规则 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEGEIVRS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEGEIVR> getPSDEGEIVRs(){
        return this.psdegeivrs;
    }

    /**
     * 设置 表格编辑项值规则 成员集合  
     * @param psdegeivrs
     */
    @JsonProperty(FIELD_PSDEGEIVRS)
    public void setPSDEGEIVRs(java.util.List<net.ibizsys.psmodel.core.domain.PSDEGEIVR> psdegeivrs){
        this.psdegeivrs = psdegeivrs;
    }

    /**
     * 获取 表格编辑项值规则 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEGEIVR> getPSDEGEIVRsIf(){
        if(this.psdegeivrs == null){
            this.psdegeivrs = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSDEGEIVR>();          
        }
        return this.psdegeivrs;
    }


    /**
     *  实体表格逻辑 成员集合
     */
    public final static String FIELD_PSDEGRIDLOGICS = "psdegridlogics";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSDEGridLogic> psdegridlogics;

    /**
     * 获取 实体表格逻辑 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEGRIDLOGICS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEGridLogic> getPSDEGridLogics(){
        return this.psdegridlogics;
    }

    /**
     * 设置 实体表格逻辑 成员集合  
     * @param psdegridlogics
     */
    @JsonProperty(FIELD_PSDEGRIDLOGICS)
    public void setPSDEGridLogics(java.util.List<net.ibizsys.psmodel.core.domain.PSDEGridLogic> psdegridlogics){
        this.psdegridlogics = psdegridlogics;
    }

    /**
     * 获取 实体表格逻辑 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEGridLogic> getPSDEGridLogicsIf(){
        if(this.psdegridlogics == null){
            this.psdegridlogics = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSDEGridLogic>();          
        }
        return this.psdegridlogics;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEGrid){
            PSDEGrid model = (PSDEGrid)iPSModel;
            model.setPSDEGridCols(this.getPSDEGridCols());
            model.setPSDEGEIUpdates(this.getPSDEGEIUpdates());
            model.setPSDEGEIVRs(this.getPSDEGEIVRs());
            model.setPSDEGridLogics(this.getPSDEGridLogics());
        }
        super.copyTo(iPSModel);
    }
}
