package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDELIST</B>实体列表 模型传输对象
 * <P>
 * 实体数据列表部件模型，定义容器、列表项及分组项的界面逻辑及数据项等处理逻辑，一般需要指定列表项的布局面板。数据列表支持定义显示内容项，表现上类似数据表格。数据列表还作为移动端的通用多数据部件模型，支持定义左滑、右滑界面行为组等移动端特征逻辑
 */
public class PSDEList extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEList(){
    }      

    /**
     * <B>ADPSDELOGICID</B>&nbsp;查询转换逻辑，指定实体列表部件使用数据集的查询上下文转换逻辑，将调用环境参数转换为数据集的调用参数
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDELogic} 
     */
    public final static String FIELD_ADPSDELOGICID = "adpsdelogicid";

    /**
     * 设置 查询转换逻辑，详细说明：{@link #FIELD_ADPSDELOGICID}
     * 
     * @param aDPSDELogicId
     * 
     */
    @JsonProperty(FIELD_ADPSDELOGICID)
    public void setADPSDELogicId(String aDPSDELogicId){
        this.set(FIELD_ADPSDELOGICID, aDPSDELogicId);
    }
    
    /**
     * 获取 查询转换逻辑  
     * @return
     */
    @JsonIgnore
    public String getADPSDELogicId(){
        Object objValue = this.get(FIELD_ADPSDELOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 查询转换逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isADPSDELogicIdDirty(){
        if(this.contains(FIELD_ADPSDELOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 查询转换逻辑
     */
    @JsonIgnore
    public void resetADPSDELogicId(){
        this.reset(FIELD_ADPSDELOGICID);
    }

    /**
     * 设置 查询转换逻辑，详细说明：{@link #FIELD_ADPSDELOGICID}
     * <P>
     * 等同 {@link #setADPSDELogicId}
     * @param aDPSDELogicId
     */
    @JsonIgnore
    public PSDEList adpsdelogicid(String aDPSDELogicId){
        this.setADPSDELogicId(aDPSDELogicId);
        return this;
    }

    /**
     * 设置 查询转换逻辑，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setADPSDELogicId}
     * @param pSDELogic 引用对象
     */
    @JsonIgnore
    public PSDEList adpsdelogicid(PSDELogic pSDELogic){
        if(pSDELogic == null){
            this.setADPSDELogicId(null);
            this.setADPSDELogicName(null);
        }
        else{
            this.setADPSDELogicId(pSDELogic.getPSDELogicId());
            this.setADPSDELogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    /**
     * <B>ADPSDELOGICNAME</B>&nbsp;查询转换逻辑，指定实体列表部件使用数据集的查询上下文转换逻辑，将调用环境参数转换为数据集的调用参数
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ADPSDELOGICID}
     */
    public final static String FIELD_ADPSDELOGICNAME = "adpsdelogicname";

    /**
     * 设置 查询转换逻辑，详细说明：{@link #FIELD_ADPSDELOGICNAME}
     * 
     * @param aDPSDELogicName
     * 
     */
    @JsonProperty(FIELD_ADPSDELOGICNAME)
    public void setADPSDELogicName(String aDPSDELogicName){
        this.set(FIELD_ADPSDELOGICNAME, aDPSDELogicName);
    }
    
    /**
     * 获取 查询转换逻辑  
     * @return
     */
    @JsonIgnore
    public String getADPSDELogicName(){
        Object objValue = this.get(FIELD_ADPSDELOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 查询转换逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isADPSDELogicNameDirty(){
        if(this.contains(FIELD_ADPSDELOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 查询转换逻辑
     */
    @JsonIgnore
    public void resetADPSDELogicName(){
        this.reset(FIELD_ADPSDELOGICNAME);
    }

    /**
     * 设置 查询转换逻辑，详细说明：{@link #FIELD_ADPSDELOGICNAME}
     * <P>
     * 等同 {@link #setADPSDELogicName}
     * @param aDPSDELogicName
     */
    @JsonIgnore
    public PSDEList adpsdelogicname(String aDPSDELogicName){
        this.setADPSDELogicName(aDPSDELogicName);
        return this;
    }

    /**
     * <B>APPENDDEITEMS</B>&nbsp;附加实体默认数据项，指定列表部件是否自动附加实体默认数据项，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_APPENDDEITEMS = "appenddeitems";

    /**
     * 设置 附加实体默认数据项，详细说明：{@link #FIELD_APPENDDEITEMS}
     * 
     * @param appendDEItems
     * 
     */
    @JsonProperty(FIELD_APPENDDEITEMS)
    public void setAppendDEItems(Integer appendDEItems){
        this.set(FIELD_APPENDDEITEMS, appendDEItems);
    }
    
    /**
     * 获取 附加实体默认数据项  
     * @return
     */
    @JsonIgnore
    public Integer getAppendDEItems(){
        Object objValue = this.get(FIELD_APPENDDEITEMS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 附加实体默认数据项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAppendDEItemsDirty(){
        if(this.contains(FIELD_APPENDDEITEMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 附加实体默认数据项
     */
    @JsonIgnore
    public void resetAppendDEItems(){
        this.reset(FIELD_APPENDDEITEMS);
    }

    /**
     * 设置 附加实体默认数据项，详细说明：{@link #FIELD_APPENDDEITEMS}
     * <P>
     * 等同 {@link #setAppendDEItems}
     * @param appendDEItems
     */
    @JsonIgnore
    public PSDEList appenddeitems(Integer appendDEItems){
        this.setAppendDEItems(appendDEItems);
        return this;
    }

     /**
     * 设置 附加实体默认数据项，详细说明：{@link #FIELD_APPENDDEITEMS}
     * <P>
     * 等同 {@link #setAppendDEItems}
     * @param appendDEItems
     */
    @JsonIgnore
    public PSDEList appenddeitems(Boolean appendDEItems){
        if(appendDEItems == null){
            this.setAppendDEItems(null);
        }
        else{
            this.setAppendDEItems(appendDEItems?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
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
    public PSDEList asyncpsdedsid(String asyncPSDEDSId){
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
    public PSDEList asyncpsdedsid(PSDEDataSet pSDEDataSet){
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
    public PSDEList asyncpsdedsname(String asyncPSDEDSName){
        this.setAsyncPSDEDSName(asyncPSDEDSName);
        return this;
    }

    /**
     * <B>BATPSDETOOLBARID</B>&nbsp;批操作工具栏，指定数据列表部件内建的批操作工具栏对象，批操作工具栏为选择数据提供操作能力
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
    public PSDEList batpsdetoolbarid(String batPSDEToolbarId){
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
    public PSDEList batpsdetoolbarid(PSDEToolbar pSDEToolbar){
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
     * <B>BATPSDETOOLBARNAME</B>&nbsp;批操作工具栏，指定数据列表部件内建的批操作工具栏对象，批操作工具栏为选择数据提供操作能力
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
    public PSDEList batpsdetoolbarname(String batPSDEToolbarName){
        this.setBatPSDEToolbarName(batPSDEToolbarName);
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
    public PSDEList busyindicator(Integer busyIndicator){
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
    public PSDEList busyindicator(Boolean busyIndicator){
        if(busyIndicator == null){
            this.setBusyIndicator(null);
        }
        else{
            this.setBusyIndicator(busyIndicator?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定列表的代码标识，需要在所在的实体中具有唯一性
     * <P>
     * 字符串：最大长度 100，由字母、数字、下划线组成，且开始必须为字母
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
    public PSDEList codename(String codeName){
        this.setCodeName(codeName);
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
    public PSDEList copypsdeactionid(String copyPSDEActionId){
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
    public PSDEList copypsdeactionid(PSDEAction pSDEAction){
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
    public PSDEList copypsdeactionname(String copyPSDEActionName){
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
    public PSDEList createdate(String createDate){
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
    public PSDEList createman(String createMan){
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
    public PSDEList createpsdeactionid(String createPSDEActionId){
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
    public PSDEList createpsdeactionid(PSDEAction pSDEAction){
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
    public PSDEList createpsdeactionname(String createPSDEActionName){
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
    public PSDEList customcond(String customCond){
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
    public PSDEList customtype(String customType){
        this.setCustomType(customType);
        return this;
    }

    /**
     * <B>EMPTYTEXT</B>&nbsp;无值显示内容，指定数据列表部件的无值显示内容，未定义时使用前端应用配置
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
    public PSDEList emptytext(String emptyText){
        this.setEmptyText(emptyText);
        return this;
    }

    /**
     * <B>EMPTYTEXTPSLANRESID</B>&nbsp;无值内容语言资源，指定数据列表部件的无值显示内容多语言资源对象，未定义时使用前端应用配置
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
    public PSDEList emptytextpslanresid(String emptyTextPSLanResId){
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
    public PSDEList emptytextpslanresid(PSLanguageRes pSLanguageRes){
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
     * <B>EMPTYTEXTPSLANRESNAME</B>&nbsp;无值内容语言资源，指定数据列表部件的无值显示内容多语言资源对象，未定义时使用前端应用配置
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
    public PSDEList emptytextpslanresname(String emptyTextPSLanResName){
        this.setEmptyTextPSLanResName(emptyTextPSLanResName);
        return this;
    }

    /**
     * <B>ENABLEEDIT</B>&nbsp;即时编辑模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.MDCtrlEditMode} 
     */
    public final static String FIELD_ENABLEEDIT = "enableedit";

    /**
     * 设置 即时编辑模式
     * 
     * @param enableEdit
     * 
     */
    @JsonProperty(FIELD_ENABLEEDIT)
    public void setEnableEdit(Integer enableEdit){
        this.set(FIELD_ENABLEEDIT, enableEdit);
    }
    
    /**
     * 获取 即时编辑模式  
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
     * 判断 即时编辑模式 是否指定值，包括空值
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
     * 重置 即时编辑模式
     */
    @JsonIgnore
    public void resetEnableEdit(){
        this.reset(FIELD_ENABLEEDIT);
    }

    /**
     * 设置 即时编辑模式
     * <P>
     * 等同 {@link #setEnableEdit}
     * @param enableEdit
     */
    @JsonIgnore
    public PSDEList enableedit(Integer enableEdit){
        this.setEnableEdit(enableEdit);
        return this;
    }

     /**
     * 设置 即时编辑模式
     * <P>
     * 等同 {@link #setEnableEdit}
     * @param enableEdit
     */
    @JsonIgnore
    public PSDEList enableedit(net.ibizsys.psmodel.core.util.PSModelEnums.MDCtrlEditMode[] enableEdit){
        if(enableEdit == null || enableEdit.length == 0){
            this.setEnableEdit(null);
        }
        else{
            int _value = 0;
            for(net.ibizsys.psmodel.core.util.PSModelEnums.MDCtrlEditMode _item : enableEdit){
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
    public PSDEList enableitempriv(Integer enableItemPriv){
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
    public PSDEList enableitempriv(Boolean enableItemPriv){
        if(enableItemPriv == null){
            this.setEnableItemPriv(null);
        }
        else{
            this.setEnableItemPriv(enableItemPriv?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEPAGINGBAR</B>&nbsp;启用分页
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.PagingMode} 
     */
    public final static String FIELD_ENABLEPAGINGBAR = "enablepagingbar";

    /**
     * 设置 启用分页
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
     * 设置 启用分页
     * <P>
     * 等同 {@link #setEnablePagingBar}
     * @param enablePagingBar
     */
    @JsonIgnore
    public PSDEList enablepagingbar(Integer enablePagingBar){
        this.setEnablePagingBar(enablePagingBar);
        return this;
    }

     /**
     * 设置 启用分页
     * <P>
     * 等同 {@link #setEnablePagingBar}
     * @param enablePagingBar
     */
    @JsonIgnore
    public PSDEList enablepagingbar(net.ibizsys.psmodel.core.util.PSModelEnums.PagingMode enablePagingBar){
        if(enablePagingBar == null){
            this.setEnablePagingBar(null);
        }
        else{
            this.setEnablePagingBar(enablePagingBar.value);
        }
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
    public PSDEList getdraftpsdeactionid(String getDraftPSDEActionId){
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
    public PSDEList getdraftpsdeactionid(PSDEAction pSDEAction){
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
     * <B>GETDRAFTPSDEACTIONNAME</B>&nbsp;获取草稿数据实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GETDRAFTPSDEACTIONID}
     */
    public final static String FIELD_GETDRAFTPSDEACTIONNAME = "getdraftpsdeactionname";

    /**
     * 设置 获取草稿数据实体行为
     * 
     * @param getDraftPSDEActionName
     * 
     */
    @JsonProperty(FIELD_GETDRAFTPSDEACTIONNAME)
    public void setGetDraftPSDEActionName(String getDraftPSDEActionName){
        this.set(FIELD_GETDRAFTPSDEACTIONNAME, getDraftPSDEActionName);
    }
    
    /**
     * 获取 获取草稿数据实体行为  
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
     * 判断 获取草稿数据实体行为 是否指定值，包括空值
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
     * 重置 获取草稿数据实体行为
     */
    @JsonIgnore
    public void resetGetDraftPSDEActionName(){
        this.reset(FIELD_GETDRAFTPSDEACTIONNAME);
    }

    /**
     * 设置 获取草稿数据实体行为
     * <P>
     * 等同 {@link #setGetDraftPSDEActionName}
     * @param getDraftPSDEActionName
     */
    @JsonIgnore
    public PSDEList getdraftpsdeactionname(String getDraftPSDEActionName){
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
    public PSDEList getpsdeactionid(String getPSDEActionId){
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
    public PSDEList getpsdeactionid(PSDEAction pSDEAction){
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
    public PSDEList getpsdeactionname(String getPSDEActionName){
        this.setGetPSDEActionName(getPSDEActionName);
        return this;
    }

    /**
     * <B>GROUPBARCLOSEMODE</B>&nbsp;分组栏关闭模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.GroupTitleBarCloseMode} 
     */
    public final static String FIELD_GROUPBARCLOSEMODE = "groupbarclosemode";

    /**
     * 设置 分组栏关闭模式
     * 
     * @param groupBarCloseMode
     * 
     */
    @JsonProperty(FIELD_GROUPBARCLOSEMODE)
    public void setGroupBarCloseMode(Integer groupBarCloseMode){
        this.set(FIELD_GROUPBARCLOSEMODE, groupBarCloseMode);
    }
    
    /**
     * 获取 分组栏关闭模式  
     * @return
     */
    @JsonIgnore
    public Integer getGroupBarCloseMode(){
        Object objValue = this.get(FIELD_GROUPBARCLOSEMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 分组栏关闭模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupBarCloseModeDirty(){
        if(this.contains(FIELD_GROUPBARCLOSEMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组栏关闭模式
     */
    @JsonIgnore
    public void resetGroupBarCloseMode(){
        this.reset(FIELD_GROUPBARCLOSEMODE);
    }

    /**
     * 设置 分组栏关闭模式
     * <P>
     * 等同 {@link #setGroupBarCloseMode}
     * @param groupBarCloseMode
     */
    @JsonIgnore
    public PSDEList groupbarclosemode(Integer groupBarCloseMode){
        this.setGroupBarCloseMode(groupBarCloseMode);
        return this;
    }

     /**
     * 设置 分组栏关闭模式
     * <P>
     * 等同 {@link #setGroupBarCloseMode}
     * @param groupBarCloseMode
     */
    @JsonIgnore
    public PSDEList groupbarclosemode(net.ibizsys.psmodel.core.util.PSModelEnums.GroupTitleBarCloseMode groupBarCloseMode){
        if(groupBarCloseMode == null){
            this.setGroupBarCloseMode(null);
        }
        else{
            this.setGroupBarCloseMode(groupBarCloseMode.value);
        }
        return this;
    }

    /**
     * <B>GROUPMODE</B>&nbsp;分组模式，指定数据列表的分组模式，未定义时为【无分组】
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
    public PSDEList groupmode(String groupMode){
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
    public PSDEList groupmode(net.ibizsys.psmodel.core.util.PSModelEnums.MDCtrlGroupMode groupMode){
        if(groupMode == null){
            this.setGroupMode(null);
        }
        else{
            this.setGroupMode(groupMode.value);
        }
        return this;
    }

    /**
     * <B>GROUPMOVEPSDEACTIONID</B>&nbsp;分组移动数据实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_GROUPMOVEPSDEACTIONID = "groupmovepsdeactionid";

    /**
     * 设置 分组移动数据实体行为
     * 
     * @param groupMovePSDEActionId
     * 
     */
    @JsonProperty(FIELD_GROUPMOVEPSDEACTIONID)
    public void setGroupMovePSDEActionId(String groupMovePSDEActionId){
        this.set(FIELD_GROUPMOVEPSDEACTIONID, groupMovePSDEActionId);
    }
    
    /**
     * 获取 分组移动数据实体行为  
     * @return
     */
    @JsonIgnore
    public String getGroupMovePSDEActionId(){
        Object objValue = this.get(FIELD_GROUPMOVEPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组移动数据实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupMovePSDEActionIdDirty(){
        if(this.contains(FIELD_GROUPMOVEPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组移动数据实体行为
     */
    @JsonIgnore
    public void resetGroupMovePSDEActionId(){
        this.reset(FIELD_GROUPMOVEPSDEACTIONID);
    }

    /**
     * 设置 分组移动数据实体行为
     * <P>
     * 等同 {@link #setGroupMovePSDEActionId}
     * @param groupMovePSDEActionId
     */
    @JsonIgnore
    public PSDEList groupmovepsdeactionid(String groupMovePSDEActionId){
        this.setGroupMovePSDEActionId(groupMovePSDEActionId);
        return this;
    }

    /**
     * 设置 分组移动数据实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setGroupMovePSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDEList groupmovepsdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setGroupMovePSDEActionId(null);
            this.setGroupMovePSDEActionName(null);
        }
        else{
            this.setGroupMovePSDEActionId(pSDEAction.getPSDEActionId());
            this.setGroupMovePSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>GROUPMOVEPSDEACTIONNAME</B>&nbsp;分组移动数据实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GROUPMOVEPSDEACTIONID}
     */
    public final static String FIELD_GROUPMOVEPSDEACTIONNAME = "groupmovepsdeactionname";

    /**
     * 设置 分组移动数据实体行为
     * 
     * @param groupMovePSDEActionName
     * 
     */
    @JsonProperty(FIELD_GROUPMOVEPSDEACTIONNAME)
    public void setGroupMovePSDEActionName(String groupMovePSDEActionName){
        this.set(FIELD_GROUPMOVEPSDEACTIONNAME, groupMovePSDEActionName);
    }
    
    /**
     * 获取 分组移动数据实体行为  
     * @return
     */
    @JsonIgnore
    public String getGroupMovePSDEActionName(){
        Object objValue = this.get(FIELD_GROUPMOVEPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组移动数据实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupMovePSDEActionNameDirty(){
        if(this.contains(FIELD_GROUPMOVEPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组移动数据实体行为
     */
    @JsonIgnore
    public void resetGroupMovePSDEActionName(){
        this.reset(FIELD_GROUPMOVEPSDEACTIONNAME);
    }

    /**
     * 设置 分组移动数据实体行为
     * <P>
     * 等同 {@link #setGroupMovePSDEActionName}
     * @param groupMovePSDEActionName
     */
    @JsonIgnore
    public PSDEList groupmovepsdeactionname(String groupMovePSDEActionName){
        this.setGroupMovePSDEActionName(groupMovePSDEActionName);
        return this;
    }

    /**
     * <B>GROUPPSCODELISTID</B>&nbsp;分组代码表，指定数据列表部件的分组代码表，未定义时使用分组属性默认的代码表对象
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
    public PSDEList grouppscodelistid(String groupPSCodeListId){
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
    public PSDEList grouppscodelistid(PSCodeList pSCodeList){
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
     * <B>GROUPPSCODELISTNAME</B>&nbsp;分组代码表，指定数据列表部件的分组代码表，未定义时使用分组属性默认的代码表对象
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
    public PSDEList grouppscodelistname(String groupPSCodeListName){
        this.setGroupPSCodeListName(groupPSCodeListName);
        return this;
    }

    /**
     * <B>GROUPPSDEFID</B>&nbsp;分组属性，数据列表部件启用数据分组功能时指定分组的属性对象
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
    public PSDEList grouppsdefid(String groupPSDEFId){
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
    public PSDEList grouppsdefid(PSDEField pSDEField){
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
     * <B>GROUPPSDEFNAME</B>&nbsp;分组属性，数据列表部件启用数据分组功能时指定分组的属性对象
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
    public PSDEList grouppsdefname(String groupPSDEFName){
        this.setGroupPSDEFName(groupPSDEFName);
        return this;
    }

    /**
     * <B>GROUPPSDEID</B>&nbsp;分组实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_GROUPPSDEID = "grouppsdeid";

    /**
     * 设置 分组实体
     * 
     * @param groupPSDEId
     * 
     */
    @JsonProperty(FIELD_GROUPPSDEID)
    public void setGroupPSDEId(String groupPSDEId){
        this.set(FIELD_GROUPPSDEID, groupPSDEId);
    }
    
    /**
     * 获取 分组实体  
     * @return
     */
    @JsonIgnore
    public String getGroupPSDEId(){
        Object objValue = this.get(FIELD_GROUPPSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSDEIdDirty(){
        if(this.contains(FIELD_GROUPPSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组实体
     */
    @JsonIgnore
    public void resetGroupPSDEId(){
        this.reset(FIELD_GROUPPSDEID);
    }

    /**
     * 设置 分组实体
     * <P>
     * 等同 {@link #setGroupPSDEId}
     * @param groupPSDEId
     */
    @JsonIgnore
    public PSDEList grouppsdeid(String groupPSDEId){
        this.setGroupPSDEId(groupPSDEId);
        return this;
    }

    /**
     * 设置 分组实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setGroupPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDEList grouppsdeid(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setGroupPSDEId(null);
            this.setGroupPSDEName(null);
        }
        else{
            this.setGroupPSDEId(pSDataEntity.getPSDataEntityId());
            this.setGroupPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>GROUPPSDENAME</B>&nbsp;分组实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GROUPPSDEID}
     */
    public final static String FIELD_GROUPPSDENAME = "grouppsdename";

    /**
     * 设置 分组实体
     * 
     * @param groupPSDEName
     * 
     */
    @JsonProperty(FIELD_GROUPPSDENAME)
    public void setGroupPSDEName(String groupPSDEName){
        this.set(FIELD_GROUPPSDENAME, groupPSDEName);
    }
    
    /**
     * 获取 分组实体  
     * @return
     */
    @JsonIgnore
    public String getGroupPSDEName(){
        Object objValue = this.get(FIELD_GROUPPSDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSDENameDirty(){
        if(this.contains(FIELD_GROUPPSDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组实体
     */
    @JsonIgnore
    public void resetGroupPSDEName(){
        this.reset(FIELD_GROUPPSDENAME);
    }

    /**
     * 设置 分组实体
     * <P>
     * 等同 {@link #setGroupPSDEName}
     * @param groupPSDEName
     */
    @JsonIgnore
    public PSDEList grouppsdename(String groupPSDEName){
        this.setGroupPSDEName(groupPSDEName);
        return this;
    }

    /**
     * <B>GROUPPSDEUAGROUPID</B>&nbsp;分组界面行为组，指定数据分组项的界面行为组对象，为分组数据提供功能操作入口
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
    public PSDEList grouppsdeuagroupid(String groupPSDEUAGroupId){
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
    public PSDEList grouppsdeuagroupid(PSDEUAGroup pSDEUAGroup){
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
     * <B>GROUPPSDEUAGROUPNAME</B>&nbsp;分组界面行为组，指定数据分组项的界面行为组对象，为分组数据提供功能操作入口
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
    public PSDEList grouppsdeuagroupname(String groupPSDEUAGroupName){
        this.setGroupPSDEUAGroupName(groupPSDEUAGroupName);
        return this;
    }

    /**
     * <B>GROUPPSSYSCSSID</B>&nbsp;分组样式表，指定数据分组项的界面样式表
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
    public PSDEList grouppssyscssid(String groupPSSysCssId){
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
    public PSDEList grouppssyscssid(PSSysCss pSSysCss){
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
     * <B>GROUPPSSYSCSSNAME</B>&nbsp;分组样式表，指定数据分组项的界面样式表
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
    public PSDEList grouppssyscssname(String groupPSSysCssName){
        this.setGroupPSSysCssName(groupPSSysCssName);
        return this;
    }

    /**
     * <B>GROUPPSSYSPFPLUGINID</B>&nbsp;分组前端插件，指定数据分组项的前端模板扩展插件
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
    public PSDEList grouppssyspfpluginid(String groupPSSysPFPluginId){
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
    public PSDEList grouppssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
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
     * <B>GROUPPSSYSPFPLUGINNAME</B>&nbsp;分组前端插件，指定数据分组项的前端模板扩展插件
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
    public PSDEList grouppssyspfpluginname(String groupPSSysPFPluginName){
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
    public PSDEList groupstyle(String groupStyle){
        this.setGroupStyle(groupStyle);
        return this;
    }

    /**
     * <B>ITEMPSSYSCSSID</B>&nbsp;默认项样式表，指定数据列表项默认样式表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCss} 
     */
    public final static String FIELD_ITEMPSSYSCSSID = "itempssyscssid";

    /**
     * 设置 默认项样式表，详细说明：{@link #FIELD_ITEMPSSYSCSSID}
     * 
     * @param itemPSSysCssId
     * 
     */
    @JsonProperty(FIELD_ITEMPSSYSCSSID)
    public void setItemPSSysCssId(String itemPSSysCssId){
        this.set(FIELD_ITEMPSSYSCSSID, itemPSSysCssId);
    }
    
    /**
     * 获取 默认项样式表  
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
     * 判断 默认项样式表 是否指定值，包括空值
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
     * 重置 默认项样式表
     */
    @JsonIgnore
    public void resetItemPSSysCssId(){
        this.reset(FIELD_ITEMPSSYSCSSID);
    }

    /**
     * 设置 默认项样式表，详细说明：{@link #FIELD_ITEMPSSYSCSSID}
     * <P>
     * 等同 {@link #setItemPSSysCssId}
     * @param itemPSSysCssId
     */
    @JsonIgnore
    public PSDEList itempssyscssid(String itemPSSysCssId){
        this.setItemPSSysCssId(itemPSSysCssId);
        return this;
    }

    /**
     * 设置 默认项样式表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setItemPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSDEList itempssyscssid(PSSysCss pSSysCss){
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
     * <B>ITEMPSSYSCSSNAME</B>&nbsp;默认项样式表，指定数据列表项默认样式表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ITEMPSSYSCSSID}
     */
    public final static String FIELD_ITEMPSSYSCSSNAME = "itempssyscssname";

    /**
     * 设置 默认项样式表，详细说明：{@link #FIELD_ITEMPSSYSCSSNAME}
     * 
     * @param itemPSSysCssName
     * 
     */
    @JsonProperty(FIELD_ITEMPSSYSCSSNAME)
    public void setItemPSSysCssName(String itemPSSysCssName){
        this.set(FIELD_ITEMPSSYSCSSNAME, itemPSSysCssName);
    }
    
    /**
     * 获取 默认项样式表  
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
     * 判断 默认项样式表 是否指定值，包括空值
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
     * 重置 默认项样式表
     */
    @JsonIgnore
    public void resetItemPSSysCssName(){
        this.reset(FIELD_ITEMPSSYSCSSNAME);
    }

    /**
     * 设置 默认项样式表，详细说明：{@link #FIELD_ITEMPSSYSCSSNAME}
     * <P>
     * 等同 {@link #setItemPSSysCssName}
     * @param itemPSSysCssName
     */
    @JsonIgnore
    public PSDEList itempssyscssname(String itemPSSysCssName){
        this.setItemPSSysCssName(itemPSSysCssName);
        return this;
    }

    /**
     * <B>ITEMPSSYSPFPLUGINID</B>&nbsp;项前端插件，指定列表项的前端模板扩展插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysPFPlugin} 
     */
    public final static String FIELD_ITEMPSSYSPFPLUGINID = "itempssyspfpluginid";

    /**
     * 设置 项前端插件，详细说明：{@link #FIELD_ITEMPSSYSPFPLUGINID}
     * 
     * @param itemPSSysPFPluginId
     * 
     */
    @JsonProperty(FIELD_ITEMPSSYSPFPLUGINID)
    public void setItemPSSysPFPluginId(String itemPSSysPFPluginId){
        this.set(FIELD_ITEMPSSYSPFPLUGINID, itemPSSysPFPluginId);
    }
    
    /**
     * 获取 项前端插件  
     * @return
     */
    @JsonIgnore
    public String getItemPSSysPFPluginId(){
        Object objValue = this.get(FIELD_ITEMPSSYSPFPLUGINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项前端插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemPSSysPFPluginIdDirty(){
        if(this.contains(FIELD_ITEMPSSYSPFPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项前端插件
     */
    @JsonIgnore
    public void resetItemPSSysPFPluginId(){
        this.reset(FIELD_ITEMPSSYSPFPLUGINID);
    }

    /**
     * 设置 项前端插件，详细说明：{@link #FIELD_ITEMPSSYSPFPLUGINID}
     * <P>
     * 等同 {@link #setItemPSSysPFPluginId}
     * @param itemPSSysPFPluginId
     */
    @JsonIgnore
    public PSDEList itempssyspfpluginid(String itemPSSysPFPluginId){
        this.setItemPSSysPFPluginId(itemPSSysPFPluginId);
        return this;
    }

    /**
     * 设置 项前端插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setItemPSSysPFPluginId}
     * @param pSSysPFPlugin 引用对象
     */
    @JsonIgnore
    public PSDEList itempssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
        if(pSSysPFPlugin == null){
            this.setItemPSSysPFPluginId(null);
            this.setItemPSSysPFPluginName(null);
        }
        else{
            this.setItemPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setItemPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    /**
     * <B>ITEMPSSYSPFPLUGINNAME</B>&nbsp;项前端插件，指定列表项的前端模板扩展插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ITEMPSSYSPFPLUGINID}
     */
    public final static String FIELD_ITEMPSSYSPFPLUGINNAME = "itempssyspfpluginname";

    /**
     * 设置 项前端插件，详细说明：{@link #FIELD_ITEMPSSYSPFPLUGINNAME}
     * 
     * @param itemPSSysPFPluginName
     * 
     */
    @JsonProperty(FIELD_ITEMPSSYSPFPLUGINNAME)
    public void setItemPSSysPFPluginName(String itemPSSysPFPluginName){
        this.set(FIELD_ITEMPSSYSPFPLUGINNAME, itemPSSysPFPluginName);
    }
    
    /**
     * 获取 项前端插件  
     * @return
     */
    @JsonIgnore
    public String getItemPSSysPFPluginName(){
        Object objValue = this.get(FIELD_ITEMPSSYSPFPLUGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项前端插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemPSSysPFPluginNameDirty(){
        if(this.contains(FIELD_ITEMPSSYSPFPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项前端插件
     */
    @JsonIgnore
    public void resetItemPSSysPFPluginName(){
        this.reset(FIELD_ITEMPSSYSPFPLUGINNAME);
    }

    /**
     * 设置 项前端插件，详细说明：{@link #FIELD_ITEMPSSYSPFPLUGINNAME}
     * <P>
     * 等同 {@link #setItemPSSysPFPluginName}
     * @param itemPSSysPFPluginName
     */
    @JsonIgnore
    public PSDEList itempssyspfpluginname(String itemPSSysPFPluginName){
        this.setItemPSSysPFPluginName(itemPSSysPFPluginName);
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;中文名称，指定数据列表部件的逻辑名称
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_LOGICNAME = "logicname";

    /**
     * 设置 中文名称，详细说明：{@link #FIELD_LOGICNAME}
     * 
     * @param logicName
     * 
     */
    @JsonProperty(FIELD_LOGICNAME)
    public void setLogicName(String logicName){
        this.set(FIELD_LOGICNAME, logicName);
    }
    
    /**
     * 获取 中文名称  
     * @return
     */
    @JsonIgnore
    public String getLogicName(){
        Object objValue = this.get(FIELD_LOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 中文名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLogicNameDirty(){
        if(this.contains(FIELD_LOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 中文名称
     */
    @JsonIgnore
    public void resetLogicName(){
        this.reset(FIELD_LOGICNAME);
    }

    /**
     * 设置 中文名称，详细说明：{@link #FIELD_LOGICNAME}
     * <P>
     * 等同 {@link #setLogicName}
     * @param logicName
     */
    @JsonIgnore
    public PSDEList logicname(String logicName){
        this.setLogicName(logicName);
        return this;
    }

    /**
     * <B>LVTAG</B>&nbsp;列表标记，指定数据列表部件的标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_LVTAG = "lvtag";

    /**
     * 设置 列表标记，详细说明：{@link #FIELD_LVTAG}
     * 
     * @param lVTag
     * 
     */
    @JsonProperty(FIELD_LVTAG)
    public void setLVTag(String lVTag){
        this.set(FIELD_LVTAG, lVTag);
    }
    
    /**
     * 获取 列表标记  
     * @return
     */
    @JsonIgnore
    public String getLVTag(){
        Object objValue = this.get(FIELD_LVTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 列表标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLVTagDirty(){
        if(this.contains(FIELD_LVTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 列表标记
     */
    @JsonIgnore
    public void resetLVTag(){
        this.reset(FIELD_LVTAG);
    }

    /**
     * 设置 列表标记，详细说明：{@link #FIELD_LVTAG}
     * <P>
     * 等同 {@link #setLVTag}
     * @param lVTag
     */
    @JsonIgnore
    public PSDEList lvtag(String lVTag){
        this.setLVTag(lVTag);
        return this;
    }

    /**
     * <B>LVTAG2</B>&nbsp;列表标记2，指定数据列表部件的标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_LVTAG2 = "lvtag2";

    /**
     * 设置 列表标记2，详细说明：{@link #FIELD_LVTAG2}
     * 
     * @param lVTag2
     * 
     */
    @JsonProperty(FIELD_LVTAG2)
    public void setLVTag2(String lVTag2){
        this.set(FIELD_LVTAG2, lVTag2);
    }
    
    /**
     * 获取 列表标记2  
     * @return
     */
    @JsonIgnore
    public String getLVTag2(){
        Object objValue = this.get(FIELD_LVTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 列表标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLVTag2Dirty(){
        if(this.contains(FIELD_LVTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 列表标记2
     */
    @JsonIgnore
    public void resetLVTag2(){
        this.reset(FIELD_LVTAG2);
    }

    /**
     * 设置 列表标记2，详细说明：{@link #FIELD_LVTAG2}
     * <P>
     * 等同 {@link #setLVTag2}
     * @param lVTag2
     */
    @JsonIgnore
    public PSDEList lvtag2(String lVTag2){
        this.setLVTag2(lVTag2);
        return this;
    }

    /**
     * <B>LVTAG3</B>&nbsp;列表标记3，指定数据列表部件的标记3
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_LVTAG3 = "lvtag3";

    /**
     * 设置 列表标记3，详细说明：{@link #FIELD_LVTAG3}
     * 
     * @param lVTag3
     * 
     */
    @JsonProperty(FIELD_LVTAG3)
    public void setLVTag3(String lVTag3){
        this.set(FIELD_LVTAG3, lVTag3);
    }
    
    /**
     * 获取 列表标记3  
     * @return
     */
    @JsonIgnore
    public String getLVTag3(){
        Object objValue = this.get(FIELD_LVTAG3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 列表标记3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLVTag3Dirty(){
        if(this.contains(FIELD_LVTAG3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 列表标记3
     */
    @JsonIgnore
    public void resetLVTag3(){
        this.reset(FIELD_LVTAG3);
    }

    /**
     * 设置 列表标记3，详细说明：{@link #FIELD_LVTAG3}
     * <P>
     * 等同 {@link #setLVTag3}
     * @param lVTag3
     */
    @JsonIgnore
    public PSDEList lvtag3(String lVTag3){
        this.setLVTag3(lVTag3);
        return this;
    }

    /**
     * <B>LVTAG4</B>&nbsp;列表标记4，指定数据列表部件的标记4
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_LVTAG4 = "lvtag4";

    /**
     * 设置 列表标记4，详细说明：{@link #FIELD_LVTAG4}
     * 
     * @param lVTag4
     * 
     */
    @JsonProperty(FIELD_LVTAG4)
    public void setLVTag4(String lVTag4){
        this.set(FIELD_LVTAG4, lVTag4);
    }
    
    /**
     * 获取 列表标记4  
     * @return
     */
    @JsonIgnore
    public String getLVTag4(){
        Object objValue = this.get(FIELD_LVTAG4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 列表标记4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLVTag4Dirty(){
        if(this.contains(FIELD_LVTAG4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 列表标记4
     */
    @JsonIgnore
    public void resetLVTag4(){
        this.reset(FIELD_LVTAG4);
    }

    /**
     * 设置 列表标记4，详细说明：{@link #FIELD_LVTAG4}
     * <P>
     * 等同 {@link #setLVTag4}
     * @param lVTag4
     */
    @JsonIgnore
    public PSDEList lvtag4(String lVTag4){
        this.setLVTag4(lVTag4);
        return this;
    }

    /**
     * <B>MEMO</B>&nbsp;备注
     * <P>
     * 字符串：最大长度 4000
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
    public PSDEList memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MINORSORTDIR</B>&nbsp;默认排序方向，指定列表对数据集合的默认排序方向，需指定默认排序属性
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
    public PSDEList minorsortdir(String minorSortDir){
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
    public PSDEList minorsortdir(net.ibizsys.psmodel.core.util.PSModelEnums.SortDir minorSortDir){
        if(minorSortDir == null){
            this.setMinorSortDir(null);
        }
        else{
            this.setMinorSortDir(minorSortDir.value);
        }
        return this;
    }

    /**
     * <B>MINORSORTPSDEFID</B>&nbsp;默认排序属性，指定列表对数据集合的默认排序属性
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
    public PSDEList minorsortpsdefid(String minorSortPSDEFId){
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
    public PSDEList minorsortpsdefid(PSDEField pSDEField){
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
     * <B>MINORSORTPSDEFNAME</B>&nbsp;默认排序属性，指定列表对数据集合的默认排序属性
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
    public PSDEList minorsortpsdefname(String minorSortPSDEFName){
        this.setMinorSortPSDEFName(minorSortPSDEFName);
        return this;
    }

    /**
     * <B>MOBLISTSTYLE</B>&nbsp;移动端列表样式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.MobMDCtrlType} 
     */
    public final static String FIELD_MOBLISTSTYLE = "mobliststyle";

    /**
     * 设置 移动端列表样式
     * 
     * @param mobListStyle
     * 
     */
    @JsonProperty(FIELD_MOBLISTSTYLE)
    public void setMobListStyle(String mobListStyle){
        this.set(FIELD_MOBLISTSTYLE, mobListStyle);
    }
    
    /**
     * 获取 移动端列表样式  
     * @return
     */
    @JsonIgnore
    public String getMobListStyle(){
        Object objValue = this.get(FIELD_MOBLISTSTYLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端列表样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobListStyleDirty(){
        if(this.contains(FIELD_MOBLISTSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端列表样式
     */
    @JsonIgnore
    public void resetMobListStyle(){
        this.reset(FIELD_MOBLISTSTYLE);
    }

    /**
     * 设置 移动端列表样式
     * <P>
     * 等同 {@link #setMobListStyle}
     * @param mobListStyle
     */
    @JsonIgnore
    public PSDEList mobliststyle(String mobListStyle){
        this.setMobListStyle(mobListStyle);
        return this;
    }

     /**
     * 设置 移动端列表样式
     * <P>
     * 等同 {@link #setMobListStyle}
     * @param mobListStyle
     */
    @JsonIgnore
    public PSDEList mobliststyle(net.ibizsys.psmodel.core.util.PSModelEnums.MobMDCtrlType mobListStyle){
        if(mobListStyle == null){
            this.setMobListStyle(null);
        }
        else{
            this.setMobListStyle(mobListStyle.value);
        }
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
    public PSDEList movepsdeactionid(String movePSDEActionId){
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
    public PSDEList movepsdeactionid(PSDEAction pSDEAction){
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
    public PSDEList movepsdeactionname(String movePSDEActionName){
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
    public PSDEList multiselect(Integer multiSelect){
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
    public PSDEList multiselect(Boolean multiSelect){
        if(multiSelect == null){
            this.setMultiSelect(null);
        }
        else{
            this.setMultiSelect(multiSelect?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>NAVPSDERID</B>&nbsp;导航视图关系，指定数据列表部件默认的导航关系，此配置在列表导航视图启用
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
    public PSDEList navpsderid(String navPSDERId){
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
    public PSDEList navpsderid(PSDER pSDER){
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
     * <B>NAVPSDERNAME</B>&nbsp;导航视图关系，指定数据列表部件默认的导航关系，此配置在列表导航视图启用
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
    public PSDEList navpsdername(String navPSDERName){
        this.setNavPSDERName(navPSDERName);
        return this;
    }

    /**
     * <B>NAVPSDEVIEWBASEID</B>&nbsp;导航视图，指定列表部件默认的导航关系视图，此配置在列表导航视图启用
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
    public PSDEList navpsdeviewbaseid(String navPSDEViewBaseId){
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
    public PSDEList navpsdeviewbaseid(PSDEViewBase pSDEViewBase){
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
     * <B>NAVPSDEVIEWBASENAME</B>&nbsp;导航视图，指定列表部件默认的导航关系视图，此配置在列表导航视图启用
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
    public PSDEList navpsdeviewbasename(String navPSDEViewBaseName){
        this.setNavPSDEViewBaseName(navPSDEViewBaseName);
        return this;
    }

    /**
     * <B>NAVVIEWFILTER</B>&nbsp;导航视图过滤项，指定数据列表部件关联导航视图的过滤项名称，导航视图一般使用应用上下文自动进行数据过滤，指定过滤项将为导航视图显示传入过滤条件
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
    public PSDEList navviewfilter(String navViewFilter){
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
    public PSDEList navviewheight(Double navViewHeight){
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
    public PSDEList navviewmaxheight(Double navViewMaxHeight){
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
    public PSDEList navviewmaxwidth(Double navViewMaxWidth){
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
    public PSDEList navviewminheight(Double navViewMinHeight){
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
    public PSDEList navviewminwidth(Double navViewMinWidth){
        this.setNavViewMinWidth(navViewMinWidth);
        return this;
    }

    /**
     * <B>NAVVIEWPARAM</B>&nbsp;导航视图参数，指定数据列表部件关联导航视图的额外参数
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
    public PSDEList navviewparam(String navViewParam){
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
    public PSDEList navviewpos(String navViewPos){
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
    public PSDEList navviewpos(net.ibizsys.psmodel.core.util.PSModelEnums.NavViewPos navViewPos){
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
    public PSDEList navviewshowmode(Integer navViewShowMode){
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
    public PSDEList navviewshowmode(net.ibizsys.psmodel.core.util.PSModelEnums.NavViewShowMode navViewShowMode){
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
    public PSDEList navviewwidth(Double navViewWidth){
        this.setNavViewWidth(navViewWidth);
        return this;
    }

    /**
     * <B>NO2PSDEUAGROUPID</B>&nbsp;右滑行为组，指定数据列表部件右滑操作的界面行为组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEUAGroup} 
     */
    public final static String FIELD_NO2PSDEUAGROUPID = "no2psdeuagroupid";

    /**
     * 设置 右滑行为组，详细说明：{@link #FIELD_NO2PSDEUAGROUPID}
     * 
     * @param no2PSDEUAGroupId
     * 
     */
    @JsonProperty(FIELD_NO2PSDEUAGROUPID)
    public void setNo2PSDEUAGroupId(String no2PSDEUAGroupId){
        this.set(FIELD_NO2PSDEUAGROUPID, no2PSDEUAGroupId);
    }
    
    /**
     * 获取 右滑行为组  
     * @return
     */
    @JsonIgnore
    public String getNo2PSDEUAGroupId(){
        Object objValue = this.get(FIELD_NO2PSDEUAGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 右滑行为组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo2PSDEUAGroupIdDirty(){
        if(this.contains(FIELD_NO2PSDEUAGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 右滑行为组
     */
    @JsonIgnore
    public void resetNo2PSDEUAGroupId(){
        this.reset(FIELD_NO2PSDEUAGROUPID);
    }

    /**
     * 设置 右滑行为组，详细说明：{@link #FIELD_NO2PSDEUAGROUPID}
     * <P>
     * 等同 {@link #setNo2PSDEUAGroupId}
     * @param no2PSDEUAGroupId
     */
    @JsonIgnore
    public PSDEList no2psdeuagroupid(String no2PSDEUAGroupId){
        this.setNo2PSDEUAGroupId(no2PSDEUAGroupId);
        return this;
    }

    /**
     * 设置 右滑行为组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNo2PSDEUAGroupId}
     * @param pSDEUAGroup 引用对象
     */
    @JsonIgnore
    public PSDEList no2psdeuagroupid(PSDEUAGroup pSDEUAGroup){
        if(pSDEUAGroup == null){
            this.setNo2PSDEUAGroupId(null);
            this.setNo2PSDEUAGroupName(null);
        }
        else{
            this.setNo2PSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setNo2PSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    /**
     * <B>NO2PSDEUAGROUPNAME</B>&nbsp;右滑行为组，指定数据列表部件右滑操作的界面行为组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NO2PSDEUAGROUPID}
     */
    public final static String FIELD_NO2PSDEUAGROUPNAME = "no2psdeuagroupname";

    /**
     * 设置 右滑行为组，详细说明：{@link #FIELD_NO2PSDEUAGROUPNAME}
     * 
     * @param no2PSDEUAGroupName
     * 
     */
    @JsonProperty(FIELD_NO2PSDEUAGROUPNAME)
    public void setNo2PSDEUAGroupName(String no2PSDEUAGroupName){
        this.set(FIELD_NO2PSDEUAGROUPNAME, no2PSDEUAGroupName);
    }
    
    /**
     * 获取 右滑行为组  
     * @return
     */
    @JsonIgnore
    public String getNo2PSDEUAGroupName(){
        Object objValue = this.get(FIELD_NO2PSDEUAGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 右滑行为组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo2PSDEUAGroupNameDirty(){
        if(this.contains(FIELD_NO2PSDEUAGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 右滑行为组
     */
    @JsonIgnore
    public void resetNo2PSDEUAGroupName(){
        this.reset(FIELD_NO2PSDEUAGROUPNAME);
    }

    /**
     * 设置 右滑行为组，详细说明：{@link #FIELD_NO2PSDEUAGROUPNAME}
     * <P>
     * 等同 {@link #setNo2PSDEUAGroupName}
     * @param no2PSDEUAGroupName
     */
    @JsonIgnore
    public PSDEList no2psdeuagroupname(String no2PSDEUAGroupName){
        this.setNo2PSDEUAGroupName(no2PSDEUAGroupName);
        return this;
    }

    /**
     * <B>NOSORT</B>&nbsp;默认禁用排序，指定是否默认禁用数据列表项的排序能力，未定义时为【否】
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
    public PSDEList nosort(Integer noSort){
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
    public PSDEList nosort(Boolean noSort){
        if(noSort == null){
            this.setNoSort(null);
        }
        else{
            this.setNoSort(noSort?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ORDERVALUEPSDEFID</B>&nbsp;排序值属性，指定数据列表部件的排序值属性，未指定时使用所在实体的默认排序值属性，启用列表行排序功能需要指定排序值属性
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
    public PSDEList ordervaluepsdefid(String orderValuePSDEFId){
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
    public PSDEList ordervaluepsdefid(PSDEField pSDEField){
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
     * <B>ORDERVALUEPSDEFNAME</B>&nbsp;排序值属性，指定数据列表部件的排序值属性，未指定时使用所在实体的默认排序值属性，启用列表行排序功能需要指定排序值属性
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
    public PSDEList ordervaluepsdefname(String orderValuePSDEFName){
        this.setOrderValuePSDEFName(orderValuePSDEFName);
        return this;
    }

    /**
     * <B>PAGESIZE</B>&nbsp;分页大小，指定数据列表的分页大小，未定义时为【1000】
     */
    public final static String FIELD_PAGESIZE = "pagesize";

    /**
     * 设置 分页大小，详细说明：{@link #FIELD_PAGESIZE}
     * 
     * @param pageSize
     * 
     */
    @JsonProperty(FIELD_PAGESIZE)
    public void setPageSize(Integer pageSize){
        this.set(FIELD_PAGESIZE, pageSize);
    }
    
    /**
     * 获取 分页大小  
     * @return
     */
    @JsonIgnore
    public Integer getPageSize(){
        Object objValue = this.get(FIELD_PAGESIZE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 分页大小 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPageSizeDirty(){
        if(this.contains(FIELD_PAGESIZE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分页大小
     */
    @JsonIgnore
    public void resetPageSize(){
        this.reset(FIELD_PAGESIZE);
    }

    /**
     * 设置 分页大小，详细说明：{@link #FIELD_PAGESIZE}
     * <P>
     * 等同 {@link #setPageSize}
     * @param pageSize
     */
    @JsonIgnore
    public PSDEList pagesize(Integer pageSize){
        this.setPageSize(pageSize);
        return this;
    }

    /**
     * <B>PSACHANDLERID</B>&nbsp;列表后台处理对象，指定数据列表部件默认的界面处理对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSACHandler} 
     */
    public final static String FIELD_PSACHANDLERID = "psachandlerid";

    /**
     * 设置 列表后台处理对象，详细说明：{@link #FIELD_PSACHANDLERID}
     * 
     * @param pSACHandlerId
     * 
     */
    @JsonProperty(FIELD_PSACHANDLERID)
    public void setPSACHandlerId(String pSACHandlerId){
        this.set(FIELD_PSACHANDLERID, pSACHandlerId);
    }
    
    /**
     * 获取 列表后台处理对象  
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
     * 判断 列表后台处理对象 是否指定值，包括空值
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
     * 重置 列表后台处理对象
     */
    @JsonIgnore
    public void resetPSACHandlerId(){
        this.reset(FIELD_PSACHANDLERID);
    }

    /**
     * 设置 列表后台处理对象，详细说明：{@link #FIELD_PSACHANDLERID}
     * <P>
     * 等同 {@link #setPSACHandlerId}
     * @param pSACHandlerId
     */
    @JsonIgnore
    public PSDEList psachandlerid(String pSACHandlerId){
        this.setPSACHandlerId(pSACHandlerId);
        return this;
    }

    /**
     * 设置 列表后台处理对象，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSACHandlerId}
     * @param pSACHandler 引用对象
     */
    @JsonIgnore
    public PSDEList psachandlerid(PSACHandler pSACHandler){
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
     * <B>PSACHANDLERNAME</B>&nbsp;界面处理对象，指定数据列表部件默认的界面处理对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSACHANDLERID}
     */
    public final static String FIELD_PSACHANDLERNAME = "psachandlername";

    /**
     * 设置 界面处理对象，详细说明：{@link #FIELD_PSACHANDLERNAME}
     * 
     * @param pSACHandlerName
     * 
     */
    @JsonProperty(FIELD_PSACHANDLERNAME)
    public void setPSACHandlerName(String pSACHandlerName){
        this.set(FIELD_PSACHANDLERNAME, pSACHandlerName);
    }
    
    /**
     * 获取 界面处理对象  
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
     * 判断 界面处理对象 是否指定值，包括空值
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
     * 重置 界面处理对象
     */
    @JsonIgnore
    public void resetPSACHandlerName(){
        this.reset(FIELD_PSACHANDLERNAME);
    }

    /**
     * 设置 界面处理对象，详细说明：{@link #FIELD_PSACHANDLERNAME}
     * <P>
     * 等同 {@link #setPSACHandlerName}
     * @param pSACHandlerName
     */
    @JsonIgnore
    public PSDEList psachandlername(String pSACHandlerName){
        this.setPSACHandlerName(pSACHandlerName);
        return this;
    }

    /**
     * <B>PSCTRLLOGICGROUPID</B>&nbsp;界面逻辑组，指定数据列表部件默认附加的部件逻辑组对象
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
    public PSDEList psctrllogicgroupid(String pSCtrlLogicGroupId){
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
    public PSDEList psctrllogicgroupid(PSCtrlLogicGroup pSCtrlLogicGroup){
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
     * <B>PSCTRLLOGICGROUPNAME</B>&nbsp;界面逻辑组，指定数据列表部件默认附加的部件逻辑组对象
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
    public PSDEList psctrllogicgroupname(String pSCtrlLogicGroupName){
        this.setPSCtrlLogicGroupName(pSCtrlLogicGroupName);
        return this;
    }

    /**
     * <B>PSCTRLMSGID</B>&nbsp;部件消息，指定数据列表部件默认的部件消息对象
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
    public PSDEList psctrlmsgid(String pSCtrlMsgId){
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
    public PSDEList psctrlmsgid(PSCtrlMsg pSCtrlMsg){
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
     * <B>PSCTRLMSGNAME</B>&nbsp;部件消息，指定数据列表部件默认的部件消息对象
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
    public PSDEList psctrlmsgname(String pSCtrlMsgName){
        this.setPSCtrlMsgName(pSCtrlMsgName);
        return this;
    }

    /**
     * <B>PSDEDSID</B>&nbsp;默认数据集合，指定数据列表部件默认使用的数据集合，来自列表所在实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataSet} 
     */
    public final static String FIELD_PSDEDSID = "psdedsid";

    /**
     * 设置 默认数据集合，详细说明：{@link #FIELD_PSDEDSID}
     * 
     * @param pSDEDSId
     * 
     */
    @JsonProperty(FIELD_PSDEDSID)
    public void setPSDEDSId(String pSDEDSId){
        this.set(FIELD_PSDEDSID, pSDEDSId);
    }
    
    /**
     * 获取 默认数据集合  
     * @return
     */
    @JsonIgnore
    public String getPSDEDSId(){
        Object objValue = this.get(FIELD_PSDEDSID);
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
    public boolean isPSDEDSIdDirty(){
        if(this.contains(FIELD_PSDEDSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认数据集合
     */
    @JsonIgnore
    public void resetPSDEDSId(){
        this.reset(FIELD_PSDEDSID);
    }

    /**
     * 设置 默认数据集合，详细说明：{@link #FIELD_PSDEDSID}
     * <P>
     * 等同 {@link #setPSDEDSId}
     * @param pSDEDSId
     */
    @JsonIgnore
    public PSDEList psdedsid(String pSDEDSId){
        this.setPSDEDSId(pSDEDSId);
        return this;
    }

    /**
     * 设置 默认数据集合，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDSId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSDEList psdedsid(PSDEDataSet pSDEDataSet){
        if(pSDEDataSet == null){
            this.setPSDEDSId(null);
            this.setPSDEDSName(null);
        }
        else{
            this.setPSDEDSId(pSDEDataSet.getPSDEDataSetId());
            this.setPSDEDSName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    /**
     * <B>PSDEDSNAME</B>&nbsp;默认数据集合，指定数据列表部件默认使用的数据集合，来自列表所在实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDSID}
     */
    public final static String FIELD_PSDEDSNAME = "psdedsname";

    /**
     * 设置 默认数据集合，详细说明：{@link #FIELD_PSDEDSNAME}
     * 
     * @param pSDEDSName
     * 
     */
    @JsonProperty(FIELD_PSDEDSNAME)
    public void setPSDEDSName(String pSDEDSName){
        this.set(FIELD_PSDEDSNAME, pSDEDSName);
    }
    
    /**
     * 获取 默认数据集合  
     * @return
     */
    @JsonIgnore
    public String getPSDEDSName(){
        Object objValue = this.get(FIELD_PSDEDSNAME);
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
    public boolean isPSDEDSNameDirty(){
        if(this.contains(FIELD_PSDEDSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认数据集合
     */
    @JsonIgnore
    public void resetPSDEDSName(){
        this.reset(FIELD_PSDEDSNAME);
    }

    /**
     * 设置 默认数据集合，详细说明：{@link #FIELD_PSDEDSNAME}
     * <P>
     * 等同 {@link #setPSDEDSName}
     * @param pSDEDSName
     */
    @JsonIgnore
    public PSDEList psdedsname(String pSDEDSName){
        this.setPSDEDSName(pSDEDSName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定数据列表部件所在的实体对象
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
    public PSDEList psdeid(String pSDEId){
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
    public PSDEList psdeid(PSDataEntity pSDataEntity){
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
     * <B>PSDELISTID</B>&nbsp;实体列表标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDELISTID = "psdelistid";

    /**
     * 设置 实体列表标识
     * 
     * @param pSDEListId
     * 
     */
    @JsonProperty(FIELD_PSDELISTID)
    public void setPSDEListId(String pSDEListId){
        this.set(FIELD_PSDELISTID, pSDEListId);
    }
    
    /**
     * 获取 实体列表标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEListId(){
        Object objValue = this.get(FIELD_PSDELISTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体列表标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEListIdDirty(){
        if(this.contains(FIELD_PSDELISTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体列表标识
     */
    @JsonIgnore
    public void resetPSDEListId(){
        this.reset(FIELD_PSDELISTID);
    }

    /**
     * 设置 实体列表标识
     * <P>
     * 等同 {@link #setPSDEListId}
     * @param pSDEListId
     */
    @JsonIgnore
    public PSDEList psdelistid(String pSDEListId){
        this.setPSDEListId(pSDEListId);
        return this;
    }

    /**
     * <B>PSDELISTNAME</B>&nbsp;实体列表标识，指定数据列表部件的标识，需在所在的实体对象中具备唯一性
     * <P>
     * 字符串：最大长度 30，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSDELISTNAME = "psdelistname";

    /**
     * 设置 实体列表标识，详细说明：{@link #FIELD_PSDELISTNAME}
     * 
     * @param pSDEListName
     * 
     */
    @JsonProperty(FIELD_PSDELISTNAME)
    public void setPSDEListName(String pSDEListName){
        this.set(FIELD_PSDELISTNAME, pSDEListName);
    }
    
    /**
     * 获取 实体列表标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEListName(){
        Object objValue = this.get(FIELD_PSDELISTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体列表标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEListNameDirty(){
        if(this.contains(FIELD_PSDELISTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体列表标识
     */
    @JsonIgnore
    public void resetPSDEListName(){
        this.reset(FIELD_PSDELISTNAME);
    }

    /**
     * 设置 实体列表标识，详细说明：{@link #FIELD_PSDELISTNAME}
     * <P>
     * 等同 {@link #setPSDEListName}
     * @param pSDEListName
     */
    @JsonIgnore
    public PSDEList psdelistname(String pSDEListName){
        this.setPSDEListName(pSDEListName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEListName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEListName(strName);
    }

    @JsonIgnore
    public PSDEList name(String strName){
        this.setPSDEListName(strName);
        return this;
    }

    /**
     * <B>PSDENAME</B>&nbsp;实体，指定数据列表部件所在的实体对象
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
    public PSDEList psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSDEUAGROUPID</B>&nbsp;左滑行为组，指定数据列表部件左滑操作的界面行为组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEUAGroup} 
     */
    public final static String FIELD_PSDEUAGROUPID = "psdeuagroupid";

    /**
     * 设置 左滑行为组，详细说明：{@link #FIELD_PSDEUAGROUPID}
     * 
     * @param pSDEUAGroupId
     * 
     */
    @JsonProperty(FIELD_PSDEUAGROUPID)
    public void setPSDEUAGroupId(String pSDEUAGroupId){
        this.set(FIELD_PSDEUAGROUPID, pSDEUAGroupId);
    }
    
    /**
     * 获取 左滑行为组  
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
     * 判断 左滑行为组 是否指定值，包括空值
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
     * 重置 左滑行为组
     */
    @JsonIgnore
    public void resetPSDEUAGroupId(){
        this.reset(FIELD_PSDEUAGROUPID);
    }

    /**
     * 设置 左滑行为组，详细说明：{@link #FIELD_PSDEUAGROUPID}
     * <P>
     * 等同 {@link #setPSDEUAGroupId}
     * @param pSDEUAGroupId
     */
    @JsonIgnore
    public PSDEList psdeuagroupid(String pSDEUAGroupId){
        this.setPSDEUAGroupId(pSDEUAGroupId);
        return this;
    }

    /**
     * 设置 左滑行为组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEUAGroupId}
     * @param pSDEUAGroup 引用对象
     */
    @JsonIgnore
    public PSDEList psdeuagroupid(PSDEUAGroup pSDEUAGroup){
        if(pSDEUAGroup == null){
            this.setPSDEUAGroupId(null);
            this.setPSDEUAGroupName(null);
        }
        else{
            this.setPSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setPSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    /**
     * <B>PSDEUAGROUPNAME</B>&nbsp;左滑行为组，指定数据列表部件左滑操作的界面行为组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEUAGROUPID}
     */
    public final static String FIELD_PSDEUAGROUPNAME = "psdeuagroupname";

    /**
     * 设置 左滑行为组，详细说明：{@link #FIELD_PSDEUAGROUPNAME}
     * 
     * @param pSDEUAGroupName
     * 
     */
    @JsonProperty(FIELD_PSDEUAGROUPNAME)
    public void setPSDEUAGroupName(String pSDEUAGroupName){
        this.set(FIELD_PSDEUAGROUPNAME, pSDEUAGroupName);
    }
    
    /**
     * 获取 左滑行为组  
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
     * 判断 左滑行为组 是否指定值，包括空值
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
     * 重置 左滑行为组
     */
    @JsonIgnore
    public void resetPSDEUAGroupName(){
        this.reset(FIELD_PSDEUAGROUPNAME);
    }

    /**
     * 设置 左滑行为组，详细说明：{@link #FIELD_PSDEUAGROUPNAME}
     * <P>
     * 等同 {@link #setPSDEUAGroupName}
     * @param pSDEUAGroupName
     */
    @JsonIgnore
    public PSDEList psdeuagroupname(String pSDEUAGroupName){
        this.setPSDEUAGroupName(pSDEUAGroupName);
        return this;
    }

    /**
     * <B>PSSYSCSSID</B>&nbsp;部件样式，指定数据列表部件的容器样式表对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCss} 
     */
    public final static String FIELD_PSSYSCSSID = "pssyscssid";

    /**
     * 设置 部件样式，详细说明：{@link #FIELD_PSSYSCSSID}
     * 
     * @param pSSysCssId
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSID)
    public void setPSSysCssId(String pSSysCssId){
        this.set(FIELD_PSSYSCSSID, pSSysCssId);
    }
    
    /**
     * 获取 部件样式  
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
     * 判断 部件样式 是否指定值，包括空值
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
     * 重置 部件样式
     */
    @JsonIgnore
    public void resetPSSysCssId(){
        this.reset(FIELD_PSSYSCSSID);
    }

    /**
     * 设置 部件样式，详细说明：{@link #FIELD_PSSYSCSSID}
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCssId
     */
    @JsonIgnore
    public PSDEList pssyscssid(String pSSysCssId){
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    /**
     * 设置 部件样式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSDEList pssyscssid(PSSysCss pSSysCss){
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
     * <B>PSSYSCSSNAME</B>&nbsp;界面样式表，指定数据列表部件的容器样式表对象
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
    public PSDEList pssyscssname(String pSSysCssName){
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端扩展插件，指定实体列表使用的前端模板扩展插件，使用插件类型【列表绘制插件】
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
    public PSDEList pssyspfpluginid(String pSSysPFPluginId){
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
    public PSDEList pssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
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
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端扩展插件，指定实体列表使用的前端模板扩展插件，使用插件类型【列表绘制插件】
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
    public PSDEList pssyspfpluginname(String pSSysPFPluginName){
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
    public PSDEList pssysreqitemid(String pSSysReqItemId){
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
    public PSDEList pssysreqitemid(PSSysReqItem pSSysReqItem){
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
    public PSDEList pssysreqitemname(String pSSysReqItemName){
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELID</B>&nbsp;项布局面板，指定数据列表项的布局面板对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysViewPanel} 
     */
    public final static String FIELD_PSSYSVIEWPANELID = "pssysviewpanelid";

    /**
     * 设置 项布局面板，详细说明：{@link #FIELD_PSSYSVIEWPANELID}
     * 
     * @param pSSysViewPanelId
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELID)
    public void setPSSysViewPanelId(String pSSysViewPanelId){
        this.set(FIELD_PSSYSVIEWPANELID, pSSysViewPanelId);
    }
    
    /**
     * 获取 项布局面板  
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
     * 判断 项布局面板 是否指定值，包括空值
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
     * 重置 项布局面板
     */
    @JsonIgnore
    public void resetPSSysViewPanelId(){
        this.reset(FIELD_PSSYSVIEWPANELID);
    }

    /**
     * 设置 项布局面板，详细说明：{@link #FIELD_PSSYSVIEWPANELID}
     * <P>
     * 等同 {@link #setPSSysViewPanelId}
     * @param pSSysViewPanelId
     */
    @JsonIgnore
    public PSDEList pssysviewpanelid(String pSSysViewPanelId){
        this.setPSSysViewPanelId(pSSysViewPanelId);
        return this;
    }

    /**
     * 设置 项布局面板，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysViewPanelId}
     * @param pSSysViewPanel 引用对象
     */
    @JsonIgnore
    public PSDEList pssysviewpanelid(PSSysViewPanel pSSysViewPanel){
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
     * <B>PSSYSVIEWPANELNAME</B>&nbsp;项布局面板，指定数据列表项的布局面板对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSVIEWPANELID}
     */
    public final static String FIELD_PSSYSVIEWPANELNAME = "pssysviewpanelname";

    /**
     * 设置 项布局面板，详细说明：{@link #FIELD_PSSYSVIEWPANELNAME}
     * 
     * @param pSSysViewPanelName
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELNAME)
    public void setPSSysViewPanelName(String pSSysViewPanelName){
        this.set(FIELD_PSSYSVIEWPANELNAME, pSSysViewPanelName);
    }
    
    /**
     * 获取 项布局面板  
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
     * 判断 项布局面板 是否指定值，包括空值
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
     * 重置 项布局面板
     */
    @JsonIgnore
    public void resetPSSysViewPanelName(){
        this.reset(FIELD_PSSYSVIEWPANELNAME);
    }

    /**
     * 设置 项布局面板，详细说明：{@link #FIELD_PSSYSVIEWPANELNAME}
     * <P>
     * 等同 {@link #setPSSysViewPanelName}
     * @param pSSysViewPanelName
     */
    @JsonIgnore
    public PSDEList pssysviewpanelname(String pSSysViewPanelName){
        this.setPSSysViewPanelName(pSSysViewPanelName);
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
    public PSDEList psviewmsggroupid(String pSViewMsgGroupId){
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
    public PSDEList psviewmsggroupid(PSViewMsgGroup pSViewMsgGroup){
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
    public PSDEList psviewmsggroupname(String pSViewMsgGroupName){
        this.setPSViewMsgGroupName(pSViewMsgGroupName);
        return this;
    }

    /**
     * <B>QUICKPSDETOOLBARID</B>&nbsp;快速操作工具栏，指定数据列表部件内建的快速操作工具栏对象，快速操作工具栏一般用于新建等无选择数据的操作
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
    public PSDEList quickpsdetoolbarid(String quickPSDEToolbarId){
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
    public PSDEList quickpsdetoolbarid(PSDEToolbar pSDEToolbar){
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
     * <B>QUICKPSDETOOLBARNAME</B>&nbsp;快速操作工具栏，指定数据列表部件内建的快速操作工具栏对象，快速操作工具栏一般用于新建等无选择数据的操作
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
    public PSDEList quickpsdetoolbarname(String quickPSDEToolbarName){
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
    public PSDEList removepsdeactionid(String removePSDEActionId){
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
    public PSDEList removepsdeactionid(PSDEAction pSDEAction){
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
    public PSDEList removepsdeactionname(String removePSDEActionName){
        this.setRemovePSDEActionName(removePSDEActionName);
        return this;
    }

    /**
     * <B>SHOWHEADER</B>&nbsp;显示头部，指定数据列表部件是否显示头部，未定义时为【是】
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
    public PSDEList showheader(Integer showHeader){
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
    public PSDEList showheader(Boolean showHeader){
        if(showHeader == null){
            this.setShowHeader(null);
        }
        else{
            this.setShowHeader(showHeader?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>SWIMLANEPSCODELISTID</B>&nbsp;泳道代码表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSCodeList} 
     */
    public final static String FIELD_SWIMLANEPSCODELISTID = "swimlanepscodelistid";

    /**
     * 设置 泳道代码表
     * 
     * @param swimlanePSCodeListId
     * 
     */
    @JsonProperty(FIELD_SWIMLANEPSCODELISTID)
    public void setSwimlanePSCodeListId(String swimlanePSCodeListId){
        this.set(FIELD_SWIMLANEPSCODELISTID, swimlanePSCodeListId);
    }
    
    /**
     * 获取 泳道代码表  
     * @return
     */
    @JsonIgnore
    public String getSwimlanePSCodeListId(){
        Object objValue = this.get(FIELD_SWIMLANEPSCODELISTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 泳道代码表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSwimlanePSCodeListIdDirty(){
        if(this.contains(FIELD_SWIMLANEPSCODELISTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 泳道代码表
     */
    @JsonIgnore
    public void resetSwimlanePSCodeListId(){
        this.reset(FIELD_SWIMLANEPSCODELISTID);
    }

    /**
     * 设置 泳道代码表
     * <P>
     * 等同 {@link #setSwimlanePSCodeListId}
     * @param swimlanePSCodeListId
     */
    @JsonIgnore
    public PSDEList swimlanepscodelistid(String swimlanePSCodeListId){
        this.setSwimlanePSCodeListId(swimlanePSCodeListId);
        return this;
    }

    /**
     * 设置 泳道代码表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setSwimlanePSCodeListId}
     * @param pSCodeList 引用对象
     */
    @JsonIgnore
    public PSDEList swimlanepscodelistid(PSCodeList pSCodeList){
        if(pSCodeList == null){
            this.setSwimlanePSCodeListId(null);
            this.setSwimlanePSCodeListName(null);
        }
        else{
            this.setSwimlanePSCodeListId(pSCodeList.getPSCodeListId());
            this.setSwimlanePSCodeListName(pSCodeList.getPSCodeListName());
        }
        return this;
    }

    /**
     * <B>SWIMLANEPSCODELISTNAME</B>&nbsp;泳道代码表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_SWIMLANEPSCODELISTID}
     */
    public final static String FIELD_SWIMLANEPSCODELISTNAME = "swimlanepscodelistname";

    /**
     * 设置 泳道代码表
     * 
     * @param swimlanePSCodeListName
     * 
     */
    @JsonProperty(FIELD_SWIMLANEPSCODELISTNAME)
    public void setSwimlanePSCodeListName(String swimlanePSCodeListName){
        this.set(FIELD_SWIMLANEPSCODELISTNAME, swimlanePSCodeListName);
    }
    
    /**
     * 获取 泳道代码表  
     * @return
     */
    @JsonIgnore
    public String getSwimlanePSCodeListName(){
        Object objValue = this.get(FIELD_SWIMLANEPSCODELISTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 泳道代码表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSwimlanePSCodeListNameDirty(){
        if(this.contains(FIELD_SWIMLANEPSCODELISTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 泳道代码表
     */
    @JsonIgnore
    public void resetSwimlanePSCodeListName(){
        this.reset(FIELD_SWIMLANEPSCODELISTNAME);
    }

    /**
     * 设置 泳道代码表
     * <P>
     * 等同 {@link #setSwimlanePSCodeListName}
     * @param swimlanePSCodeListName
     */
    @JsonIgnore
    public PSDEList swimlanepscodelistname(String swimlanePSCodeListName){
        this.setSwimlanePSCodeListName(swimlanePSCodeListName);
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
    public PSDEList updatedate(String updateDate){
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
    public PSDEList updateman(String updateMan){
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
    public PSDEList updatepsdeactionid(String updatePSDEActionId){
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
    public PSDEList updatepsdeactionid(PSDEAction pSDEAction){
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
    public PSDEList updatepsdeactionname(String updatePSDEActionName){
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
    public PSDEList user2psdeactionid(String user2PSDEActionId){
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
    public PSDEList user2psdeactionid(PSDEAction pSDEAction){
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
    public PSDEList user2psdeactionname(String user2PSDEActionName){
        this.setUser2PSDEActionName(user2PSDEActionName);
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
    public PSDEList userpsdeactionid(String userPSDEActionId){
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
    public PSDEList userpsdeactionid(PSDEAction pSDEAction){
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
     * <B>USERPSDEACTIONNAME</B>&nbsp;用户自定义实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_USERPSDEACTIONID}
     */
    public final static String FIELD_USERPSDEACTIONNAME = "userpsdeactionname";

    /**
     * 设置 用户自定义实体行为
     * 
     * @param userPSDEActionName
     * 
     */
    @JsonProperty(FIELD_USERPSDEACTIONNAME)
    public void setUserPSDEActionName(String userPSDEActionName){
        this.set(FIELD_USERPSDEACTIONNAME, userPSDEActionName);
    }
    
    /**
     * 获取 用户自定义实体行为  
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
     * 判断 用户自定义实体行为 是否指定值，包括空值
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
     * 重置 用户自定义实体行为
     */
    @JsonIgnore
    public void resetUserPSDEActionName(){
        this.reset(FIELD_USERPSDEACTIONNAME);
    }

    /**
     * 设置 用户自定义实体行为
     * <P>
     * 等同 {@link #setUserPSDEActionName}
     * @param userPSDEActionName
     */
    @JsonIgnore
    public PSDEList userpsdeactionname(String userPSDEActionName){
        this.setUserPSDEActionName(userPSDEActionName);
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
    public PSDEList usertag(String userTag){
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
    public PSDEList usertag2(String userTag2){
        this.setUserTag2(userTag2);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEListId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEListId(strValue);
    }

    @JsonIgnore
    public PSDEList id(String strValue){
        this.setPSDEListId(strValue);
        return this;
    }


    /**
     *  实体多数据部件项 成员集合
     */
    public final static String FIELD_PSDELISTITEMS = "psdelistitems";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSDEListItem> psdelistitems;

    /**
     * 获取 实体多数据部件项 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDELISTITEMS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEListItem> getPSDEListItems(){
        return this.psdelistitems;
    }

    /**
     * 设置 实体多数据部件项 成员集合  
     * @param psdelistitems
     */
    @JsonProperty(FIELD_PSDELISTITEMS)
    public void setPSDEListItems(java.util.List<net.ibizsys.psmodel.core.domain.PSDEListItem> psdelistitems){
        this.psdelistitems = psdelistitems;
    }

    /**
     * 获取 实体多数据部件项 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEListItem> getPSDEListItemsIf(){
        if(this.psdelistitems == null){
            this.psdelistitems = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSDEListItem>();          
        }
        return this.psdelistitems;
    }


    /**
     *  实体列表逻辑 成员集合
     */
    public final static String FIELD_PSDELISTLOGICS = "psdelistlogics";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSDEListLogic> psdelistlogics;

    /**
     * 获取 实体列表逻辑 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDELISTLOGICS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEListLogic> getPSDEListLogics(){
        return this.psdelistlogics;
    }

    /**
     * 设置 实体列表逻辑 成员集合  
     * @param psdelistlogics
     */
    @JsonProperty(FIELD_PSDELISTLOGICS)
    public void setPSDEListLogics(java.util.List<net.ibizsys.psmodel.core.domain.PSDEListLogic> psdelistlogics){
        this.psdelistlogics = psdelistlogics;
    }

    /**
     * 获取 实体列表逻辑 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEListLogic> getPSDEListLogicsIf(){
        if(this.psdelistlogics == null){
            this.psdelistlogics = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSDEListLogic>();          
        }
        return this.psdelistlogics;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEList){
            PSDEList model = (PSDEList)iPSModel;
            model.setPSDEListItems(this.getPSDEListItems());
            model.setPSDEListLogics(this.getPSDEListLogics());
        }
        super.copyTo(iPSModel);
    }
}
