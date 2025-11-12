package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEDATASYNC</B>实体数据同步 模型传输对象
 * <P>
 * 实体数据同步模型，定义实体数据的同步方向及同步代理，也包括了数据的导入导出处理等信息
 */
public class PSDEDataSync extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEDataSync(){
        this.setValidFlag(1);
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定实体数据同步的代码标识，需在所属实体中具有唯一性
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
    public PSDEDataSync codename(String codeName){
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
    public PSDEDataSync createdate(String createDate){
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
    public PSDEDataSync createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DENAMES</B>&nbsp;导入数据实体，额外指定实体数据同步从队列中提取的对象名称，默认为所在实体名称，多值使用【;】分隔
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_DENAMES = "denames";

    /**
     * 设置 导入数据实体，详细说明：{@link #FIELD_DENAMES}
     * 
     * @param dENames
     * 
     */
    @JsonProperty(FIELD_DENAMES)
    public void setDENames(String dENames){
        this.set(FIELD_DENAMES, dENames);
    }
    
    /**
     * 获取 导入数据实体  
     * @return
     */
    @JsonIgnore
    public String getDENames(){
        Object objValue = this.get(FIELD_DENAMES);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导入数据实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDENamesDirty(){
        if(this.contains(FIELD_DENAMES)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导入数据实体
     */
    @JsonIgnore
    public void resetDENames(){
        this.reset(FIELD_DENAMES);
    }

    /**
     * 设置 导入数据实体，详细说明：{@link #FIELD_DENAMES}
     * <P>
     * 等同 {@link #setDENames}
     * @param dENames
     */
    @JsonIgnore
    public PSDEDataSync denames(String dENames){
        this.setDENames(dENames);
        return this;
    }

    /**
     * <B>EVENTTYPE</B>&nbsp;监控同步事件，指定实体数据同步监控的同步事件
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DataSyncInformType} 
     */
    public final static String FIELD_EVENTTYPE = "eventtype";

    /**
     * 设置 监控同步事件，详细说明：{@link #FIELD_EVENTTYPE}
     * 
     * @param eventType
     * 
     */
    @JsonProperty(FIELD_EVENTTYPE)
    public void setEventType(Integer eventType){
        this.set(FIELD_EVENTTYPE, eventType);
    }
    
    /**
     * 获取 监控同步事件  
     * @return
     */
    @JsonIgnore
    public Integer getEventType(){
        Object objValue = this.get(FIELD_EVENTTYPE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 监控同步事件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEventTypeDirty(){
        if(this.contains(FIELD_EVENTTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 监控同步事件
     */
    @JsonIgnore
    public void resetEventType(){
        this.reset(FIELD_EVENTTYPE);
    }

    /**
     * 设置 监控同步事件，详细说明：{@link #FIELD_EVENTTYPE}
     * <P>
     * 等同 {@link #setEventType}
     * @param eventType
     */
    @JsonIgnore
    public PSDEDataSync eventtype(Integer eventType){
        this.setEventType(eventType);
        return this;
    }

     /**
     * 设置 监控同步事件，详细说明：{@link #FIELD_EVENTTYPE}
     * <P>
     * 等同 {@link #setEventType}
     * @param eventType
     */
    @JsonIgnore
    public PSDEDataSync eventtype(net.ibizsys.psmodel.core.util.PSModelEnums.DataSyncInformType[] eventType){
        if(eventType == null || eventType.length == 0){
            this.setEventType(null);
        }
        else{
            int _value = 0;
            for(net.ibizsys.psmodel.core.util.PSModelEnums.DataSyncInformType _item : eventType){
                _value |= _item.value;
            }
            this.setEventType(_value);
        }
        return this;
    }

    /**
     * <B>EXPORTFULL</B>&nbsp;导出关联数据，指定实体数据同步导出数据是否包括关联数据，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_EXPORTFULL = "exportfull";

    /**
     * 设置 导出关联数据，详细说明：{@link #FIELD_EXPORTFULL}
     * 
     * @param exportFull
     * 
     */
    @JsonProperty(FIELD_EXPORTFULL)
    public void setExportFull(Integer exportFull){
        this.set(FIELD_EXPORTFULL, exportFull);
    }
    
    /**
     * 获取 导出关联数据  
     * @return
     */
    @JsonIgnore
    public Integer getExportFull(){
        Object objValue = this.get(FIELD_EXPORTFULL);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 导出关联数据 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExportFullDirty(){
        if(this.contains(FIELD_EXPORTFULL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导出关联数据
     */
    @JsonIgnore
    public void resetExportFull(){
        this.reset(FIELD_EXPORTFULL);
    }

    /**
     * 设置 导出关联数据，详细说明：{@link #FIELD_EXPORTFULL}
     * <P>
     * 等同 {@link #setExportFull}
     * @param exportFull
     */
    @JsonIgnore
    public PSDEDataSync exportfull(Integer exportFull){
        this.setExportFull(exportFull);
        return this;
    }

     /**
     * 设置 导出关联数据，详细说明：{@link #FIELD_EXPORTFULL}
     * <P>
     * 等同 {@link #setExportFull}
     * @param exportFull
     */
    @JsonIgnore
    public PSDEDataSync exportfull(Boolean exportFull){
        if(exportFull == null){
            this.setExportFull(null);
        }
        else{
            this.setExportFull(exportFull?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>FILTERMODEL</B>&nbsp;过滤器模型
     */
    public final static String FIELD_FILTERMODEL = "filtermodel";

    /**
     * 设置 过滤器模型
     * 
     * @param filterModel
     * 
     */
    @JsonProperty(FIELD_FILTERMODEL)
    public void setFilterModel(String filterModel){
        this.set(FIELD_FILTERMODEL, filterModel);
    }
    
    /**
     * 获取 过滤器模型  
     * @return
     */
    @JsonIgnore
    public String getFilterModel(){
        Object objValue = this.get(FIELD_FILTERMODEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 过滤器模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFilterModelDirty(){
        if(this.contains(FIELD_FILTERMODEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 过滤器模型
     */
    @JsonIgnore
    public void resetFilterModel(){
        this.reset(FIELD_FILTERMODEL);
    }

    /**
     * 设置 过滤器模型
     * <P>
     * 等同 {@link #setFilterModel}
     * @param filterModel
     */
    @JsonIgnore
    public PSDEDataSync filtermodel(String filterModel){
        this.setFilterModel(filterModel);
        return this;
    }

    /**
     * <B>IMPORTPSDEACTIONID</B>&nbsp;导入数据行为，指定实体数据同步导入时调用的实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_IMPORTPSDEACTIONID = "importpsdeactionid";

    /**
     * 设置 导入数据行为，详细说明：{@link #FIELD_IMPORTPSDEACTIONID}
     * 
     * @param importPSDEActionId
     * 
     */
    @JsonProperty(FIELD_IMPORTPSDEACTIONID)
    public void setImportPSDEActionId(String importPSDEActionId){
        this.set(FIELD_IMPORTPSDEACTIONID, importPSDEActionId);
    }
    
    /**
     * 获取 导入数据行为  
     * @return
     */
    @JsonIgnore
    public String getImportPSDEActionId(){
        Object objValue = this.get(FIELD_IMPORTPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导入数据行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isImportPSDEActionIdDirty(){
        if(this.contains(FIELD_IMPORTPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导入数据行为
     */
    @JsonIgnore
    public void resetImportPSDEActionId(){
        this.reset(FIELD_IMPORTPSDEACTIONID);
    }

    /**
     * 设置 导入数据行为，详细说明：{@link #FIELD_IMPORTPSDEACTIONID}
     * <P>
     * 等同 {@link #setImportPSDEActionId}
     * @param importPSDEActionId
     */
    @JsonIgnore
    public PSDEDataSync importpsdeactionid(String importPSDEActionId){
        this.setImportPSDEActionId(importPSDEActionId);
        return this;
    }

    /**
     * 设置 导入数据行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setImportPSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDEDataSync importpsdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setImportPSDEActionId(null);
            this.setImportPSDEActionName(null);
        }
        else{
            this.setImportPSDEActionId(pSDEAction.getPSDEActionId());
            this.setImportPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>IMPORTPSDEACTIONNAME</B>&nbsp;导入数据行为，指定实体数据同步导入时调用的实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_IMPORTPSDEACTIONID}
     */
    public final static String FIELD_IMPORTPSDEACTIONNAME = "importpsdeactionname";

    /**
     * 设置 导入数据行为，详细说明：{@link #FIELD_IMPORTPSDEACTIONNAME}
     * 
     * @param importPSDEActionName
     * 
     */
    @JsonProperty(FIELD_IMPORTPSDEACTIONNAME)
    public void setImportPSDEActionName(String importPSDEActionName){
        this.set(FIELD_IMPORTPSDEACTIONNAME, importPSDEActionName);
    }
    
    /**
     * 获取 导入数据行为  
     * @return
     */
    @JsonIgnore
    public String getImportPSDEActionName(){
        Object objValue = this.get(FIELD_IMPORTPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导入数据行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isImportPSDEActionNameDirty(){
        if(this.contains(FIELD_IMPORTPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导入数据行为
     */
    @JsonIgnore
    public void resetImportPSDEActionName(){
        this.reset(FIELD_IMPORTPSDEACTIONNAME);
    }

    /**
     * 设置 导入数据行为，详细说明：{@link #FIELD_IMPORTPSDEACTIONNAME}
     * <P>
     * 等同 {@link #setImportPSDEActionName}
     * @param importPSDEActionName
     */
    @JsonIgnore
    public PSDEDataSync importpsdeactionname(String importPSDEActionName){
        this.setImportPSDEActionName(importPSDEActionName);
        return this;
    }

    /**
     * <B>INCUSTOMCODE</B>&nbsp;输入脚本代码，实体数据同步启用输入自定义代码模式时指定脚本代码
     */
    public final static String FIELD_INCUSTOMCODE = "incustomcode";

    /**
     * 设置 输入脚本代码，详细说明：{@link #FIELD_INCUSTOMCODE}
     * 
     * @param inCustomCode
     * 
     */
    @JsonProperty(FIELD_INCUSTOMCODE)
    public void setInCustomCode(String inCustomCode){
        this.set(FIELD_INCUSTOMCODE, inCustomCode);
    }
    
    /**
     * 获取 输入脚本代码  
     * @return
     */
    @JsonIgnore
    public String getInCustomCode(){
        Object objValue = this.get(FIELD_INCUSTOMCODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输入脚本代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isInCustomCodeDirty(){
        if(this.contains(FIELD_INCUSTOMCODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输入脚本代码
     */
    @JsonIgnore
    public void resetInCustomCode(){
        this.reset(FIELD_INCUSTOMCODE);
    }

    /**
     * 设置 输入脚本代码，详细说明：{@link #FIELD_INCUSTOMCODE}
     * <P>
     * 等同 {@link #setInCustomCode}
     * @param inCustomCode
     */
    @JsonIgnore
    public PSDEDataSync incustomcode(String inCustomCode){
        this.setInCustomCode(inCustomCode);
        return this;
    }

    /**
     * <B>INCUSTOMMODE</B>&nbsp;自定义输入代码模式，指定是否启用自定义输入代码模式，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ScriptMode} 
     */
    public final static String FIELD_INCUSTOMMODE = "incustommode";

    /**
     * 设置 自定义输入代码模式，详细说明：{@link #FIELD_INCUSTOMMODE}
     * 
     * @param inCustomMode
     * 
     */
    @JsonProperty(FIELD_INCUSTOMMODE)
    public void setInCustomMode(Integer inCustomMode){
        this.set(FIELD_INCUSTOMMODE, inCustomMode);
    }
    
    /**
     * 获取 自定义输入代码模式  
     * @return
     */
    @JsonIgnore
    public Integer getInCustomMode(){
        Object objValue = this.get(FIELD_INCUSTOMMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 自定义输入代码模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isInCustomModeDirty(){
        if(this.contains(FIELD_INCUSTOMMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义输入代码模式
     */
    @JsonIgnore
    public void resetInCustomMode(){
        this.reset(FIELD_INCUSTOMMODE);
    }

    /**
     * 设置 自定义输入代码模式，详细说明：{@link #FIELD_INCUSTOMMODE}
     * <P>
     * 等同 {@link #setInCustomMode}
     * @param inCustomMode
     */
    @JsonIgnore
    public PSDEDataSync incustommode(Integer inCustomMode){
        this.setInCustomMode(inCustomMode);
        return this;
    }

     /**
     * 设置 自定义输入代码模式，详细说明：{@link #FIELD_INCUSTOMMODE}
     * <P>
     * 等同 {@link #setInCustomMode}
     * @param inCustomMode
     */
    @JsonIgnore
    public PSDEDataSync incustommode(net.ibizsys.psmodel.core.util.PSModelEnums.ScriptMode inCustomMode){
        if(inCustomMode == null){
            this.setInCustomMode(null);
        }
        else{
            this.setInCustomMode(inCustomMode.value);
        }
        return this;
    }

    /**
     * <B>INPSDEACTIONID</B>&nbsp;输入过滤行为，指定实体数据同步导入的判断行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_INPSDEACTIONID = "inpsdeactionid";

    /**
     * 设置 输入过滤行为，详细说明：{@link #FIELD_INPSDEACTIONID}
     * 
     * @param inPSDEActionId
     * 
     */
    @JsonProperty(FIELD_INPSDEACTIONID)
    public void setInPSDEActionId(String inPSDEActionId){
        this.set(FIELD_INPSDEACTIONID, inPSDEActionId);
    }
    
    /**
     * 获取 输入过滤行为  
     * @return
     */
    @JsonIgnore
    public String getInPSDEActionId(){
        Object objValue = this.get(FIELD_INPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输入过滤行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isInPSDEActionIdDirty(){
        if(this.contains(FIELD_INPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输入过滤行为
     */
    @JsonIgnore
    public void resetInPSDEActionId(){
        this.reset(FIELD_INPSDEACTIONID);
    }

    /**
     * 设置 输入过滤行为，详细说明：{@link #FIELD_INPSDEACTIONID}
     * <P>
     * 等同 {@link #setInPSDEActionId}
     * @param inPSDEActionId
     */
    @JsonIgnore
    public PSDEDataSync inpsdeactionid(String inPSDEActionId){
        this.setInPSDEActionId(inPSDEActionId);
        return this;
    }

    /**
     * 设置 输入过滤行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setInPSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDEDataSync inpsdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setInPSDEActionId(null);
            this.setInPSDEActionName(null);
        }
        else{
            this.setInPSDEActionId(pSDEAction.getPSDEActionId());
            this.setInPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>INPSDEACTIONNAME</B>&nbsp;输入过滤行为，指定实体数据同步导入的判断行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_INPSDEACTIONID}
     */
    public final static String FIELD_INPSDEACTIONNAME = "inpsdeactionname";

    /**
     * 设置 输入过滤行为，详细说明：{@link #FIELD_INPSDEACTIONNAME}
     * 
     * @param inPSDEActionName
     * 
     */
    @JsonProperty(FIELD_INPSDEACTIONNAME)
    public void setInPSDEActionName(String inPSDEActionName){
        this.set(FIELD_INPSDEACTIONNAME, inPSDEActionName);
    }
    
    /**
     * 获取 输入过滤行为  
     * @return
     */
    @JsonIgnore
    public String getInPSDEActionName(){
        Object objValue = this.get(FIELD_INPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输入过滤行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isInPSDEActionNameDirty(){
        if(this.contains(FIELD_INPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输入过滤行为
     */
    @JsonIgnore
    public void resetInPSDEActionName(){
        this.reset(FIELD_INPSDEACTIONNAME);
    }

    /**
     * 设置 输入过滤行为，详细说明：{@link #FIELD_INPSDEACTIONNAME}
     * <P>
     * 等同 {@link #setInPSDEActionName}
     * @param inPSDEActionName
     */
    @JsonIgnore
    public PSDEDataSync inpsdeactionname(String inPSDEActionName){
        this.setInPSDEActionName(inPSDEActionName);
        return this;
    }

    /**
     * <B>INPSDEDATASETID</B>&nbsp;输入数据集，指定实体数据同步输入的过滤数据集，使用该数据集的查询条件作为输入过滤条件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataSet} 
     */
    public final static String FIELD_INPSDEDATASETID = "inpsdedatasetid";

    /**
     * 设置 输入数据集，详细说明：{@link #FIELD_INPSDEDATASETID}
     * 
     * @param inPSDEDataSetId
     * 
     */
    @JsonProperty(FIELD_INPSDEDATASETID)
    public void setInPSDEDataSetId(String inPSDEDataSetId){
        this.set(FIELD_INPSDEDATASETID, inPSDEDataSetId);
    }
    
    /**
     * 获取 输入数据集  
     * @return
     */
    @JsonIgnore
    public String getInPSDEDataSetId(){
        Object objValue = this.get(FIELD_INPSDEDATASETID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输入数据集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isInPSDEDataSetIdDirty(){
        if(this.contains(FIELD_INPSDEDATASETID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输入数据集
     */
    @JsonIgnore
    public void resetInPSDEDataSetId(){
        this.reset(FIELD_INPSDEDATASETID);
    }

    /**
     * 设置 输入数据集，详细说明：{@link #FIELD_INPSDEDATASETID}
     * <P>
     * 等同 {@link #setInPSDEDataSetId}
     * @param inPSDEDataSetId
     */
    @JsonIgnore
    public PSDEDataSync inpsdedatasetid(String inPSDEDataSetId){
        this.setInPSDEDataSetId(inPSDEDataSetId);
        return this;
    }

    /**
     * 设置 输入数据集，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setInPSDEDataSetId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSDEDataSync inpsdedatasetid(PSDEDataSet pSDEDataSet){
        if(pSDEDataSet == null){
            this.setInPSDEDataSetId(null);
            this.setInPSDEDataSetName(null);
        }
        else{
            this.setInPSDEDataSetId(pSDEDataSet.getPSDEDataSetId());
            this.setInPSDEDataSetName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    /**
     * <B>INPSDEDATASETNAME</B>&nbsp;输入数据集，指定实体数据同步输入的数据集，一般使用该数据集的查询条件作为输入过滤条件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_INPSDEDATASETID}
     */
    public final static String FIELD_INPSDEDATASETNAME = "inpsdedatasetname";

    /**
     * 设置 输入数据集，详细说明：{@link #FIELD_INPSDEDATASETNAME}
     * 
     * @param inPSDEDataSetName
     * 
     */
    @JsonProperty(FIELD_INPSDEDATASETNAME)
    public void setInPSDEDataSetName(String inPSDEDataSetName){
        this.set(FIELD_INPSDEDATASETNAME, inPSDEDataSetName);
    }
    
    /**
     * 获取 输入数据集  
     * @return
     */
    @JsonIgnore
    public String getInPSDEDataSetName(){
        Object objValue = this.get(FIELD_INPSDEDATASETNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输入数据集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isInPSDEDataSetNameDirty(){
        if(this.contains(FIELD_INPSDEDATASETNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输入数据集
     */
    @JsonIgnore
    public void resetInPSDEDataSetName(){
        this.reset(FIELD_INPSDEDATASETNAME);
    }

    /**
     * 设置 输入数据集，详细说明：{@link #FIELD_INPSDEDATASETNAME}
     * <P>
     * 等同 {@link #setInPSDEDataSetName}
     * @param inPSDEDataSetName
     */
    @JsonIgnore
    public PSDEDataSync inpsdedatasetname(String inPSDEDataSetName){
        this.setInPSDEDataSetName(inPSDEDataSetName);
        return this;
    }

    /**
     * <B>INPSSYSDATASYNCAGENTID</B>&nbsp;输入数据代理，指定实体数据同步输入使用的系统数据代理
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDataSyncAgent} 
     */
    public final static String FIELD_INPSSYSDATASYNCAGENTID = "inpssysdatasyncagentid";

    /**
     * 设置 输入数据代理，详细说明：{@link #FIELD_INPSSYSDATASYNCAGENTID}
     * 
     * @param inPSSysDataSyncAgentId
     * 
     */
    @JsonProperty(FIELD_INPSSYSDATASYNCAGENTID)
    public void setInPSSysDataSyncAgentId(String inPSSysDataSyncAgentId){
        this.set(FIELD_INPSSYSDATASYNCAGENTID, inPSSysDataSyncAgentId);
    }
    
    /**
     * 获取 输入数据代理  
     * @return
     */
    @JsonIgnore
    public String getInPSSysDataSyncAgentId(){
        Object objValue = this.get(FIELD_INPSSYSDATASYNCAGENTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输入数据代理 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isInPSSysDataSyncAgentIdDirty(){
        if(this.contains(FIELD_INPSSYSDATASYNCAGENTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输入数据代理
     */
    @JsonIgnore
    public void resetInPSSysDataSyncAgentId(){
        this.reset(FIELD_INPSSYSDATASYNCAGENTID);
    }

    /**
     * 设置 输入数据代理，详细说明：{@link #FIELD_INPSSYSDATASYNCAGENTID}
     * <P>
     * 等同 {@link #setInPSSysDataSyncAgentId}
     * @param inPSSysDataSyncAgentId
     */
    @JsonIgnore
    public PSDEDataSync inpssysdatasyncagentid(String inPSSysDataSyncAgentId){
        this.setInPSSysDataSyncAgentId(inPSSysDataSyncAgentId);
        return this;
    }

    /**
     * 设置 输入数据代理，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setInPSSysDataSyncAgentId}
     * @param pSSysDataSyncAgent 引用对象
     */
    @JsonIgnore
    public PSDEDataSync inpssysdatasyncagentid(PSSysDataSyncAgent pSSysDataSyncAgent){
        if(pSSysDataSyncAgent == null){
            this.setInPSSysDataSyncAgentId(null);
            this.setInPSSysDataSyncAgentName(null);
        }
        else{
            this.setInPSSysDataSyncAgentId(pSSysDataSyncAgent.getPSSysDataSyncAgentId());
            this.setInPSSysDataSyncAgentName(pSSysDataSyncAgent.getPSSysDataSyncAgentName());
        }
        return this;
    }

    /**
     * <B>INPSSYSDATASYNCAGENTNAME</B>&nbsp;输入数据代理，指定实体数据同步输入使用的系统数据代理
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_INPSSYSDATASYNCAGENTID}
     */
    public final static String FIELD_INPSSYSDATASYNCAGENTNAME = "inpssysdatasyncagentname";

    /**
     * 设置 输入数据代理，详细说明：{@link #FIELD_INPSSYSDATASYNCAGENTNAME}
     * 
     * @param inPSSysDataSyncAgentName
     * 
     */
    @JsonProperty(FIELD_INPSSYSDATASYNCAGENTNAME)
    public void setInPSSysDataSyncAgentName(String inPSSysDataSyncAgentName){
        this.set(FIELD_INPSSYSDATASYNCAGENTNAME, inPSSysDataSyncAgentName);
    }
    
    /**
     * 获取 输入数据代理  
     * @return
     */
    @JsonIgnore
    public String getInPSSysDataSyncAgentName(){
        Object objValue = this.get(FIELD_INPSSYSDATASYNCAGENTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输入数据代理 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isInPSSysDataSyncAgentNameDirty(){
        if(this.contains(FIELD_INPSSYSDATASYNCAGENTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输入数据代理
     */
    @JsonIgnore
    public void resetInPSSysDataSyncAgentName(){
        this.reset(FIELD_INPSSYSDATASYNCAGENTNAME);
    }

    /**
     * 设置 输入数据代理，详细说明：{@link #FIELD_INPSSYSDATASYNCAGENTNAME}
     * <P>
     * 等同 {@link #setInPSSysDataSyncAgentName}
     * @param inPSSysDataSyncAgentName
     */
    @JsonIgnore
    public PSDEDataSync inpssysdatasyncagentname(String inPSSysDataSyncAgentName){
        this.setInPSSysDataSyncAgentName(inPSSysDataSyncAgentName);
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
    public PSDEDataSync memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>OUTCUSTOMCODE</B>&nbsp;输出脚本代码，实体数据同步启用输出自定义代码模式时指定脚本代码
     */
    public final static String FIELD_OUTCUSTOMCODE = "outcustomcode";

    /**
     * 设置 输出脚本代码，详细说明：{@link #FIELD_OUTCUSTOMCODE}
     * 
     * @param outCustomCode
     * 
     */
    @JsonProperty(FIELD_OUTCUSTOMCODE)
    public void setOutCustomCode(String outCustomCode){
        this.set(FIELD_OUTCUSTOMCODE, outCustomCode);
    }
    
    /**
     * 获取 输出脚本代码  
     * @return
     */
    @JsonIgnore
    public String getOutCustomCode(){
        Object objValue = this.get(FIELD_OUTCUSTOMCODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输出脚本代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOutCustomCodeDirty(){
        if(this.contains(FIELD_OUTCUSTOMCODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输出脚本代码
     */
    @JsonIgnore
    public void resetOutCustomCode(){
        this.reset(FIELD_OUTCUSTOMCODE);
    }

    /**
     * 设置 输出脚本代码，详细说明：{@link #FIELD_OUTCUSTOMCODE}
     * <P>
     * 等同 {@link #setOutCustomCode}
     * @param outCustomCode
     */
    @JsonIgnore
    public PSDEDataSync outcustomcode(String outCustomCode){
        this.setOutCustomCode(outCustomCode);
        return this;
    }

    /**
     * <B>OUTCUSTOMMODE</B>&nbsp;自定义输出代码模式，指定是否启用自定义输出代码模式，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ScriptMode} 
     */
    public final static String FIELD_OUTCUSTOMMODE = "outcustommode";

    /**
     * 设置 自定义输出代码模式，详细说明：{@link #FIELD_OUTCUSTOMMODE}
     * 
     * @param outCustomMode
     * 
     */
    @JsonProperty(FIELD_OUTCUSTOMMODE)
    public void setOutCustomMode(Integer outCustomMode){
        this.set(FIELD_OUTCUSTOMMODE, outCustomMode);
    }
    
    /**
     * 获取 自定义输出代码模式  
     * @return
     */
    @JsonIgnore
    public Integer getOutCustomMode(){
        Object objValue = this.get(FIELD_OUTCUSTOMMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 自定义输出代码模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOutCustomModeDirty(){
        if(this.contains(FIELD_OUTCUSTOMMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义输出代码模式
     */
    @JsonIgnore
    public void resetOutCustomMode(){
        this.reset(FIELD_OUTCUSTOMMODE);
    }

    /**
     * 设置 自定义输出代码模式，详细说明：{@link #FIELD_OUTCUSTOMMODE}
     * <P>
     * 等同 {@link #setOutCustomMode}
     * @param outCustomMode
     */
    @JsonIgnore
    public PSDEDataSync outcustommode(Integer outCustomMode){
        this.setOutCustomMode(outCustomMode);
        return this;
    }

     /**
     * 设置 自定义输出代码模式，详细说明：{@link #FIELD_OUTCUSTOMMODE}
     * <P>
     * 等同 {@link #setOutCustomMode}
     * @param outCustomMode
     */
    @JsonIgnore
    public PSDEDataSync outcustommode(net.ibizsys.psmodel.core.util.PSModelEnums.ScriptMode outCustomMode){
        if(outCustomMode == null){
            this.setOutCustomMode(null);
        }
        else{
            this.setOutCustomMode(outCustomMode.value);
        }
        return this;
    }

    /**
     * <B>OUTMODE</B>&nbsp;输出模式，指定实体数据同步输出的触发模式，未定义时为【实时】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DataSyncOutMode} 
     */
    public final static String FIELD_OUTMODE = "outmode";

    /**
     * 设置 输出模式，详细说明：{@link #FIELD_OUTMODE}
     * 
     * @param outMode
     * 
     */
    @JsonProperty(FIELD_OUTMODE)
    public void setOutMode(Integer outMode){
        this.set(FIELD_OUTMODE, outMode);
    }
    
    /**
     * 获取 输出模式  
     * @return
     */
    @JsonIgnore
    public Integer getOutMode(){
        Object objValue = this.get(FIELD_OUTMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 输出模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOutModeDirty(){
        if(this.contains(FIELD_OUTMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输出模式
     */
    @JsonIgnore
    public void resetOutMode(){
        this.reset(FIELD_OUTMODE);
    }

    /**
     * 设置 输出模式，详细说明：{@link #FIELD_OUTMODE}
     * <P>
     * 等同 {@link #setOutMode}
     * @param outMode
     */
    @JsonIgnore
    public PSDEDataSync outmode(Integer outMode){
        this.setOutMode(outMode);
        return this;
    }

     /**
     * 设置 输出模式，详细说明：{@link #FIELD_OUTMODE}
     * <P>
     * 等同 {@link #setOutMode}
     * @param outMode
     */
    @JsonIgnore
    public PSDEDataSync outmode(net.ibizsys.psmodel.core.util.PSModelEnums.DataSyncOutMode outMode){
        if(outMode == null){
            this.setOutMode(null);
        }
        else{
            this.setOutMode(outMode.value);
        }
        return this;
    }

    /**
     * <B>OUTPSDEACTIONID</B>&nbsp;输出过滤行为，指定实体数据同步输出的判断行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_OUTPSDEACTIONID = "outpsdeactionid";

    /**
     * 设置 输出过滤行为，详细说明：{@link #FIELD_OUTPSDEACTIONID}
     * 
     * @param outPSDEActionId
     * 
     */
    @JsonProperty(FIELD_OUTPSDEACTIONID)
    public void setOutPSDEActionId(String outPSDEActionId){
        this.set(FIELD_OUTPSDEACTIONID, outPSDEActionId);
    }
    
    /**
     * 获取 输出过滤行为  
     * @return
     */
    @JsonIgnore
    public String getOutPSDEActionId(){
        Object objValue = this.get(FIELD_OUTPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输出过滤行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOutPSDEActionIdDirty(){
        if(this.contains(FIELD_OUTPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输出过滤行为
     */
    @JsonIgnore
    public void resetOutPSDEActionId(){
        this.reset(FIELD_OUTPSDEACTIONID);
    }

    /**
     * 设置 输出过滤行为，详细说明：{@link #FIELD_OUTPSDEACTIONID}
     * <P>
     * 等同 {@link #setOutPSDEActionId}
     * @param outPSDEActionId
     */
    @JsonIgnore
    public PSDEDataSync outpsdeactionid(String outPSDEActionId){
        this.setOutPSDEActionId(outPSDEActionId);
        return this;
    }

    /**
     * 设置 输出过滤行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setOutPSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDEDataSync outpsdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setOutPSDEActionId(null);
            this.setOutPSDEActionName(null);
        }
        else{
            this.setOutPSDEActionId(pSDEAction.getPSDEActionId());
            this.setOutPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>OUTPSDEACTIONNAME</B>&nbsp;输出过滤行为，指定实体数据同步输出的判断行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_OUTPSDEACTIONID}
     */
    public final static String FIELD_OUTPSDEACTIONNAME = "outpsdeactionname";

    /**
     * 设置 输出过滤行为，详细说明：{@link #FIELD_OUTPSDEACTIONNAME}
     * 
     * @param outPSDEActionName
     * 
     */
    @JsonProperty(FIELD_OUTPSDEACTIONNAME)
    public void setOutPSDEActionName(String outPSDEActionName){
        this.set(FIELD_OUTPSDEACTIONNAME, outPSDEActionName);
    }
    
    /**
     * 获取 输出过滤行为  
     * @return
     */
    @JsonIgnore
    public String getOutPSDEActionName(){
        Object objValue = this.get(FIELD_OUTPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输出过滤行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOutPSDEActionNameDirty(){
        if(this.contains(FIELD_OUTPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输出过滤行为
     */
    @JsonIgnore
    public void resetOutPSDEActionName(){
        this.reset(FIELD_OUTPSDEACTIONNAME);
    }

    /**
     * 设置 输出过滤行为，详细说明：{@link #FIELD_OUTPSDEACTIONNAME}
     * <P>
     * 等同 {@link #setOutPSDEActionName}
     * @param outPSDEActionName
     */
    @JsonIgnore
    public PSDEDataSync outpsdeactionname(String outPSDEActionName){
        this.setOutPSDEActionName(outPSDEActionName);
        return this;
    }

    /**
     * <B>OUTPSDEDATASETID</B>&nbsp;输出数据集，指定实体数据同步输出的过滤数据集，使用该数据集的查询条件作为输入过滤条件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataSet} 
     */
    public final static String FIELD_OUTPSDEDATASETID = "outpsdedatasetid";

    /**
     * 设置 输出数据集，详细说明：{@link #FIELD_OUTPSDEDATASETID}
     * 
     * @param outPSDEDataSetId
     * 
     */
    @JsonProperty(FIELD_OUTPSDEDATASETID)
    public void setOutPSDEDataSetId(String outPSDEDataSetId){
        this.set(FIELD_OUTPSDEDATASETID, outPSDEDataSetId);
    }
    
    /**
     * 获取 输出数据集  
     * @return
     */
    @JsonIgnore
    public String getOutPSDEDataSetId(){
        Object objValue = this.get(FIELD_OUTPSDEDATASETID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输出数据集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOutPSDEDataSetIdDirty(){
        if(this.contains(FIELD_OUTPSDEDATASETID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输出数据集
     */
    @JsonIgnore
    public void resetOutPSDEDataSetId(){
        this.reset(FIELD_OUTPSDEDATASETID);
    }

    /**
     * 设置 输出数据集，详细说明：{@link #FIELD_OUTPSDEDATASETID}
     * <P>
     * 等同 {@link #setOutPSDEDataSetId}
     * @param outPSDEDataSetId
     */
    @JsonIgnore
    public PSDEDataSync outpsdedatasetid(String outPSDEDataSetId){
        this.setOutPSDEDataSetId(outPSDEDataSetId);
        return this;
    }

    /**
     * 设置 输出数据集，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setOutPSDEDataSetId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSDEDataSync outpsdedatasetid(PSDEDataSet pSDEDataSet){
        if(pSDEDataSet == null){
            this.setOutPSDEDataSetId(null);
            this.setOutPSDEDataSetName(null);
        }
        else{
            this.setOutPSDEDataSetId(pSDEDataSet.getPSDEDataSetId());
            this.setOutPSDEDataSetName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    /**
     * <B>OUTPSDEDATASETNAME</B>&nbsp;输出数据集，指定实体数据同步输出的数据集，一般使用该数据集的查询条件作为输出过滤条件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_OUTPSDEDATASETID}
     */
    public final static String FIELD_OUTPSDEDATASETNAME = "outpsdedatasetname";

    /**
     * 设置 输出数据集，详细说明：{@link #FIELD_OUTPSDEDATASETNAME}
     * 
     * @param outPSDEDataSetName
     * 
     */
    @JsonProperty(FIELD_OUTPSDEDATASETNAME)
    public void setOutPSDEDataSetName(String outPSDEDataSetName){
        this.set(FIELD_OUTPSDEDATASETNAME, outPSDEDataSetName);
    }
    
    /**
     * 获取 输出数据集  
     * @return
     */
    @JsonIgnore
    public String getOutPSDEDataSetName(){
        Object objValue = this.get(FIELD_OUTPSDEDATASETNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输出数据集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOutPSDEDataSetNameDirty(){
        if(this.contains(FIELD_OUTPSDEDATASETNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输出数据集
     */
    @JsonIgnore
    public void resetOutPSDEDataSetName(){
        this.reset(FIELD_OUTPSDEDATASETNAME);
    }

    /**
     * 设置 输出数据集，详细说明：{@link #FIELD_OUTPSDEDATASETNAME}
     * <P>
     * 等同 {@link #setOutPSDEDataSetName}
     * @param outPSDEDataSetName
     */
    @JsonIgnore
    public PSDEDataSync outpsdedatasetname(String outPSDEDataSetName){
        this.setOutPSDEDataSetName(outPSDEDataSetName);
        return this;
    }

    /**
     * <B>OUTPSSYSDATASYNCAGENTID</B>&nbsp;输出数据代理，指定实体数据同步输出使用的系统数据代理
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDataSyncAgent} 
     */
    public final static String FIELD_OUTPSSYSDATASYNCAGENTID = "outpssysdatasyncagentid";

    /**
     * 设置 输出数据代理，详细说明：{@link #FIELD_OUTPSSYSDATASYNCAGENTID}
     * 
     * @param outPSSysDataSyncAgentId
     * 
     */
    @JsonProperty(FIELD_OUTPSSYSDATASYNCAGENTID)
    public void setOutPSSysDataSyncAgentId(String outPSSysDataSyncAgentId){
        this.set(FIELD_OUTPSSYSDATASYNCAGENTID, outPSSysDataSyncAgentId);
    }
    
    /**
     * 获取 输出数据代理  
     * @return
     */
    @JsonIgnore
    public String getOutPSSysDataSyncAgentId(){
        Object objValue = this.get(FIELD_OUTPSSYSDATASYNCAGENTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输出数据代理 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOutPSSysDataSyncAgentIdDirty(){
        if(this.contains(FIELD_OUTPSSYSDATASYNCAGENTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输出数据代理
     */
    @JsonIgnore
    public void resetOutPSSysDataSyncAgentId(){
        this.reset(FIELD_OUTPSSYSDATASYNCAGENTID);
    }

    /**
     * 设置 输出数据代理，详细说明：{@link #FIELD_OUTPSSYSDATASYNCAGENTID}
     * <P>
     * 等同 {@link #setOutPSSysDataSyncAgentId}
     * @param outPSSysDataSyncAgentId
     */
    @JsonIgnore
    public PSDEDataSync outpssysdatasyncagentid(String outPSSysDataSyncAgentId){
        this.setOutPSSysDataSyncAgentId(outPSSysDataSyncAgentId);
        return this;
    }

    /**
     * 设置 输出数据代理，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setOutPSSysDataSyncAgentId}
     * @param pSSysDataSyncAgent 引用对象
     */
    @JsonIgnore
    public PSDEDataSync outpssysdatasyncagentid(PSSysDataSyncAgent pSSysDataSyncAgent){
        if(pSSysDataSyncAgent == null){
            this.setOutPSSysDataSyncAgentId(null);
            this.setOutPSSysDataSyncAgentName(null);
        }
        else{
            this.setOutPSSysDataSyncAgentId(pSSysDataSyncAgent.getPSSysDataSyncAgentId());
            this.setOutPSSysDataSyncAgentName(pSSysDataSyncAgent.getPSSysDataSyncAgentName());
        }
        return this;
    }

    /**
     * <B>OUTPSSYSDATASYNCAGENTNAME</B>&nbsp;输出数据代理，指定实体数据同步输出使用的系统数据代理
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_OUTPSSYSDATASYNCAGENTID}
     */
    public final static String FIELD_OUTPSSYSDATASYNCAGENTNAME = "outpssysdatasyncagentname";

    /**
     * 设置 输出数据代理，详细说明：{@link #FIELD_OUTPSSYSDATASYNCAGENTNAME}
     * 
     * @param outPSSysDataSyncAgentName
     * 
     */
    @JsonProperty(FIELD_OUTPSSYSDATASYNCAGENTNAME)
    public void setOutPSSysDataSyncAgentName(String outPSSysDataSyncAgentName){
        this.set(FIELD_OUTPSSYSDATASYNCAGENTNAME, outPSSysDataSyncAgentName);
    }
    
    /**
     * 获取 输出数据代理  
     * @return
     */
    @JsonIgnore
    public String getOutPSSysDataSyncAgentName(){
        Object objValue = this.get(FIELD_OUTPSSYSDATASYNCAGENTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输出数据代理 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOutPSSysDataSyncAgentNameDirty(){
        if(this.contains(FIELD_OUTPSSYSDATASYNCAGENTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输出数据代理
     */
    @JsonIgnore
    public void resetOutPSSysDataSyncAgentName(){
        this.reset(FIELD_OUTPSSYSDATASYNCAGENTNAME);
    }

    /**
     * 设置 输出数据代理，详细说明：{@link #FIELD_OUTPSSYSDATASYNCAGENTNAME}
     * <P>
     * 等同 {@link #setOutPSSysDataSyncAgentName}
     * @param outPSSysDataSyncAgentName
     */
    @JsonIgnore
    public PSDEDataSync outpssysdatasyncagentname(String outPSSysDataSyncAgentName){
        this.setOutPSSysDataSyncAgentName(outPSSysDataSyncAgentName);
        return this;
    }

    /**
     * <B>OUTTIMER</B>&nbsp;输出间隔
     */
    public final static String FIELD_OUTTIMER = "outtimer";

    /**
     * 设置 输出间隔
     * 
     * @param outTimer
     * 
     */
    @JsonProperty(FIELD_OUTTIMER)
    public void setOutTimer(Integer outTimer){
        this.set(FIELD_OUTTIMER, outTimer);
    }
    
    /**
     * 获取 输出间隔  
     * @return
     */
    @JsonIgnore
    public Integer getOutTimer(){
        Object objValue = this.get(FIELD_OUTTIMER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 输出间隔 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOutTimerDirty(){
        if(this.contains(FIELD_OUTTIMER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输出间隔
     */
    @JsonIgnore
    public void resetOutTimer(){
        this.reset(FIELD_OUTTIMER);
    }

    /**
     * 设置 输出间隔
     * <P>
     * 等同 {@link #setOutTimer}
     * @param outTimer
     */
    @JsonIgnore
    public PSDEDataSync outtimer(Integer outTimer){
        this.setOutTimer(outTimer);
        return this;
    }

    /**
     * <B>PSDEDATASYNCID</B>&nbsp;实体数据同步标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEDATASYNCID = "psdedatasyncid";

    /**
     * 设置 实体数据同步标识
     * 
     * @param pSDEDataSyncId
     * 
     */
    @JsonProperty(FIELD_PSDEDATASYNCID)
    public void setPSDEDataSyncId(String pSDEDataSyncId){
        this.set(FIELD_PSDEDATASYNCID, pSDEDataSyncId);
    }
    
    /**
     * 获取 实体数据同步标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataSyncId(){
        Object objValue = this.get(FIELD_PSDEDATASYNCID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据同步标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataSyncIdDirty(){
        if(this.contains(FIELD_PSDEDATASYNCID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据同步标识
     */
    @JsonIgnore
    public void resetPSDEDataSyncId(){
        this.reset(FIELD_PSDEDATASYNCID);
    }

    /**
     * 设置 实体数据同步标识
     * <P>
     * 等同 {@link #setPSDEDataSyncId}
     * @param pSDEDataSyncId
     */
    @JsonIgnore
    public PSDEDataSync psdedatasyncid(String pSDEDataSyncId){
        this.setPSDEDataSyncId(pSDEDataSyncId);
        return this;
    }

    /**
     * <B>PSDEDATASYNCNAME</B>&nbsp;数据同步名称，指定实体数据同步的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEDATASYNCNAME = "psdedatasyncname";

    /**
     * 设置 数据同步名称，详细说明：{@link #FIELD_PSDEDATASYNCNAME}
     * 
     * @param pSDEDataSyncName
     * 
     */
    @JsonProperty(FIELD_PSDEDATASYNCNAME)
    public void setPSDEDataSyncName(String pSDEDataSyncName){
        this.set(FIELD_PSDEDATASYNCNAME, pSDEDataSyncName);
    }
    
    /**
     * 获取 数据同步名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataSyncName(){
        Object objValue = this.get(FIELD_PSDEDATASYNCNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据同步名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataSyncNameDirty(){
        if(this.contains(FIELD_PSDEDATASYNCNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据同步名称
     */
    @JsonIgnore
    public void resetPSDEDataSyncName(){
        this.reset(FIELD_PSDEDATASYNCNAME);
    }

    /**
     * 设置 数据同步名称，详细说明：{@link #FIELD_PSDEDATASYNCNAME}
     * <P>
     * 等同 {@link #setPSDEDataSyncName}
     * @param pSDEDataSyncName
     */
    @JsonIgnore
    public PSDEDataSync psdedatasyncname(String pSDEDataSyncName){
        this.setPSDEDataSyncName(pSDEDataSyncName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEDataSyncName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEDataSyncName(strName);
    }

    @JsonIgnore
    public PSDEDataSync name(String strName){
        this.setPSDEDataSyncName(strName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定实体数据同步所在的实体
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
    public PSDEDataSync psdeid(String pSDEId){
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
    public PSDEDataSync psdeid(PSDataEntity pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;实体，指定实体数据同步所在的实体
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
    public PSDEDataSync psdename(String pSDEName){
        this.setPSDEName(pSDEName);
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
    public PSDEDataSync pssysreqitemid(String pSSysReqItemId){
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
    public PSDEDataSync pssysreqitemid(PSSysReqItem pSSysReqItem){
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
    public PSDEDataSync pssysreqitemname(String pSSysReqItemName){
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINID</B>&nbsp;后端模板插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysSFPlugin} 
     */
    public final static String FIELD_PSSYSSFPLUGINID = "pssyssfpluginid";

    /**
     * 设置 后端模板插件
     * 
     * @param pSSysSFPluginId
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINID)
    public void setPSSysSFPluginId(String pSSysSFPluginId){
        this.set(FIELD_PSSYSSFPLUGINID, pSSysSFPluginId);
    }
    
    /**
     * 获取 后端模板插件  
     * @return
     */
    @JsonIgnore
    public String getPSSysSFPluginId(){
        Object objValue = this.get(FIELD_PSSYSSFPLUGINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后端模板插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSFPluginIdDirty(){
        if(this.contains(FIELD_PSSYSSFPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后端模板插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginId(){
        this.reset(FIELD_PSSYSSFPLUGINID);
    }

    /**
     * 设置 后端模板插件
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPluginId
     */
    @JsonIgnore
    public PSDEDataSync pssyssfpluginid(String pSSysSFPluginId){
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    /**
     * 设置 后端模板插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPlugin 引用对象
     */
    @JsonIgnore
    public PSDEDataSync pssyssfpluginid(PSSysSFPlugin pSSysSFPlugin){
        if(pSSysSFPlugin == null){
            this.setPSSysSFPluginId(null);
            this.setPSSysSFPluginName(null);
        }
        else{
            this.setPSSysSFPluginId(pSSysSFPlugin.getPSSysSFPluginId());
            this.setPSSysSFPluginName(pSSysSFPlugin.getPSSysSFPluginName());
        }
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINNAME</B>&nbsp;后端模板插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSFPLUGINID}
     */
    public final static String FIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";

    /**
     * 设置 后端模板插件
     * 
     * @param pSSysSFPluginName
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINNAME)
    public void setPSSysSFPluginName(String pSSysSFPluginName){
        this.set(FIELD_PSSYSSFPLUGINNAME, pSSysSFPluginName);
    }
    
    /**
     * 获取 后端模板插件  
     * @return
     */
    @JsonIgnore
    public String getPSSysSFPluginName(){
        Object objValue = this.get(FIELD_PSSYSSFPLUGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后端模板插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSFPluginNameDirty(){
        if(this.contains(FIELD_PSSYSSFPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后端模板插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginName(){
        this.reset(FIELD_PSSYSSFPLUGINNAME);
    }

    /**
     * 设置 后端模板插件
     * <P>
     * 等同 {@link #setPSSysSFPluginName}
     * @param pSSysSFPluginName
     */
    @JsonIgnore
    public PSDEDataSync pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    /**
     * <B>SYNCDIR</B>&nbsp;数据同步方向，指定实体数据同步的同步方向
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DataSyncDir} 
     */
    public final static String FIELD_SYNCDIR = "syncdir";

    /**
     * 设置 数据同步方向，详细说明：{@link #FIELD_SYNCDIR}
     * 
     * @param syncDir
     * 
     */
    @JsonProperty(FIELD_SYNCDIR)
    public void setSyncDir(String syncDir){
        this.set(FIELD_SYNCDIR, syncDir);
    }
    
    /**
     * 获取 数据同步方向  
     * @return
     */
    @JsonIgnore
    public String getSyncDir(){
        Object objValue = this.get(FIELD_SYNCDIR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据同步方向 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSyncDirDirty(){
        if(this.contains(FIELD_SYNCDIR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据同步方向
     */
    @JsonIgnore
    public void resetSyncDir(){
        this.reset(FIELD_SYNCDIR);
    }

    /**
     * 设置 数据同步方向，详细说明：{@link #FIELD_SYNCDIR}
     * <P>
     * 等同 {@link #setSyncDir}
     * @param syncDir
     */
    @JsonIgnore
    public PSDEDataSync syncdir(String syncDir){
        this.setSyncDir(syncDir);
        return this;
    }

     /**
     * 设置 数据同步方向，详细说明：{@link #FIELD_SYNCDIR}
     * <P>
     * 等同 {@link #setSyncDir}
     * @param syncDir
     */
    @JsonIgnore
    public PSDEDataSync syncdir(net.ibizsys.psmodel.core.util.PSModelEnums.DataSyncDir syncDir){
        if(syncDir == null){
            this.setSyncDir(null);
        }
        else{
            this.setSyncDir(syncDir.value);
        }
        return this;
    }

    /**
     * <B>SYNCEXPORT</B>&nbsp;同步导出数据
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_SYNCEXPORT = "syncexport";

    /**
     * 设置 同步导出数据
     * 
     * @param syncExport
     * 
     */
    @JsonProperty(FIELD_SYNCEXPORT)
    public void setSyncExport(Integer syncExport){
        this.set(FIELD_SYNCEXPORT, syncExport);
    }
    
    /**
     * 获取 同步导出数据  
     * @return
     */
    @JsonIgnore
    public Integer getSyncExport(){
        Object objValue = this.get(FIELD_SYNCEXPORT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 同步导出数据 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSyncExportDirty(){
        if(this.contains(FIELD_SYNCEXPORT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 同步导出数据
     */
    @JsonIgnore
    public void resetSyncExport(){
        this.reset(FIELD_SYNCEXPORT);
    }

    /**
     * 设置 同步导出数据
     * <P>
     * 等同 {@link #setSyncExport}
     * @param syncExport
     */
    @JsonIgnore
    public PSDEDataSync syncexport(Integer syncExport){
        this.setSyncExport(syncExport);
        return this;
    }

     /**
     * 设置 同步导出数据
     * <P>
     * 等同 {@link #setSyncExport}
     * @param syncExport
     */
    @JsonIgnore
    public PSDEDataSync syncexport(Boolean syncExport){
        if(syncExport == null){
            this.setSyncExport(null);
        }
        else{
            this.setSyncExport(syncExport?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSDEDataSync updatedate(String updateDate){
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
    public PSDEDataSync updateman(String updateMan){
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
    public PSDEDataSync usercat(String userCat){
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
    public PSDEDataSync usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDEDataSync usertag(String userTag){
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
    public PSDEDataSync usertag2(String userTag2){
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
    public PSDEDataSync usertag3(String userTag3){
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
    public PSDEDataSync usertag4(String userTag4){
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
    public PSDEDataSync validflag(Integer validFlag){
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
    public PSDEDataSync validflag(Boolean validFlag){
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
        return this.getPSDEDataSyncId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEDataSyncId(strValue);
    }

    @JsonIgnore
    public PSDEDataSync id(String strValue){
        this.setPSDEDataSyncId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEDataSync){
            PSDEDataSync model = (PSDEDataSync)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
