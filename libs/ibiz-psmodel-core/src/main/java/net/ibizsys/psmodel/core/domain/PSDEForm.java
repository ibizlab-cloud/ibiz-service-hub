package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEFORM</B>实体表单 模型传输对象
 * <P>
 * 实体表单部件模型，基于数据实体构建，专注于处理与特定实体相关的数据输入和编辑操作。支持编辑表单及搜索表单两种类型。
 */
public class PSDEForm extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEForm(){
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
    public PSDEForm busyindicator(Integer busyIndicator){
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
    public PSDEForm busyindicator(Boolean busyIndicator){
        if(busyIndicator == null){
            this.setBusyIndicator(null);
        }
        else{
            this.setBusyIndicator(busyIndicator?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，表单的代码标识，需要在所属的实体中唯一
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
    public PSDEForm codename(String codeName){
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
    public PSDEForm copypsdeactionid(String copyPSDEActionId){
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
    public PSDEForm copypsdeactionid(PSDEAction pSDEAction){
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
    public PSDEForm copypsdeactionname(String copyPSDEActionName){
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
    public PSDEForm createdate(String createDate){
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
    public PSDEForm createman(String createMan){
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
    public PSDEForm createpsdeactionid(String createPSDEActionId){
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
    public PSDEForm createpsdeactionid(PSDEAction pSDEAction){
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
    public PSDEForm createpsdeactionname(String createPSDEActionName){
        this.setCreatePSDEActionName(createPSDEActionName);
        return this;
    }

    /**
     * <B>DATATYPE</B>&nbsp;表单数据类型，编辑表单对应的数据类型，一般指索引实体（继承）类型值、多表单识别值等
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_DATATYPE = "datatype";

    /**
     * 设置 表单数据类型，详细说明：{@link #FIELD_DATATYPE}
     * 
     * @param dataType
     * 
     */
    @JsonProperty(FIELD_DATATYPE)
    public void setDataType(String dataType){
        this.set(FIELD_DATATYPE, dataType);
    }
    
    /**
     * 获取 表单数据类型  
     * @return
     */
    @JsonIgnore
    public String getDataType(){
        Object objValue = this.get(FIELD_DATATYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表单数据类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDataTypeDirty(){
        if(this.contains(FIELD_DATATYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表单数据类型
     */
    @JsonIgnore
    public void resetDataType(){
        this.reset(FIELD_DATATYPE);
    }

    /**
     * 设置 表单数据类型，详细说明：{@link #FIELD_DATATYPE}
     * <P>
     * 等同 {@link #setDataType}
     * @param dataType
     */
    @JsonIgnore
    public PSDEForm datatype(String dataType){
        this.setDataType(dataType);
        return this;
    }

    /**
     * <B>DETAILSTYLE</B>&nbsp;成员默认样式，表单成员的默认式样，成员未指定式样时将使用此配置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.CtrlDetailStyle} 
     */
    public final static String FIELD_DETAILSTYLE = "detailstyle";

    /**
     * 设置 成员默认样式，详细说明：{@link #FIELD_DETAILSTYLE}
     * 
     * @param detailStyle
     * 
     */
    @JsonProperty(FIELD_DETAILSTYLE)
    public void setDetailStyle(String detailStyle){
        this.set(FIELD_DETAILSTYLE, detailStyle);
    }
    
    /**
     * 获取 成员默认样式  
     * @return
     */
    @JsonIgnore
    public String getDetailStyle(){
        Object objValue = this.get(FIELD_DETAILSTYLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 成员默认样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDetailStyleDirty(){
        if(this.contains(FIELD_DETAILSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 成员默认样式
     */
    @JsonIgnore
    public void resetDetailStyle(){
        this.reset(FIELD_DETAILSTYLE);
    }

    /**
     * 设置 成员默认样式，详细说明：{@link #FIELD_DETAILSTYLE}
     * <P>
     * 等同 {@link #setDetailStyle}
     * @param detailStyle
     */
    @JsonIgnore
    public PSDEForm detailstyle(String detailStyle){
        this.setDetailStyle(detailStyle);
        return this;
    }

     /**
     * 设置 成员默认样式，详细说明：{@link #FIELD_DETAILSTYLE}
     * <P>
     * 等同 {@link #setDetailStyle}
     * @param detailStyle
     */
    @JsonIgnore
    public PSDEForm detailstyle(net.ibizsys.psmodel.core.util.PSModelEnums.CtrlDetailStyle detailStyle){
        if(detailStyle == null){
            this.setDetailStyle(null);
        }
        else{
            this.setDetailStyle(detailStyle.value);
        }
        return this;
    }

    /**
     * <B>ENABLEADVSEARCH</B>&nbsp;支持高级搜索，指定搜索表单是否支持高级搜索，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEADVSEARCH = "enableadvsearch";

    /**
     * 设置 支持高级搜索，详细说明：{@link #FIELD_ENABLEADVSEARCH}
     * 
     * @param enableAdvSearch
     * 
     */
    @JsonProperty(FIELD_ENABLEADVSEARCH)
    public void setEnableAdvSearch(Integer enableAdvSearch){
        this.set(FIELD_ENABLEADVSEARCH, enableAdvSearch);
    }
    
    /**
     * 获取 支持高级搜索  
     * @return
     */
    @JsonIgnore
    public Integer getEnableAdvSearch(){
        Object objValue = this.get(FIELD_ENABLEADVSEARCH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持高级搜索 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableAdvSearchDirty(){
        if(this.contains(FIELD_ENABLEADVSEARCH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持高级搜索
     */
    @JsonIgnore
    public void resetEnableAdvSearch(){
        this.reset(FIELD_ENABLEADVSEARCH);
    }

    /**
     * 设置 支持高级搜索，详细说明：{@link #FIELD_ENABLEADVSEARCH}
     * <P>
     * 等同 {@link #setEnableAdvSearch}
     * @param enableAdvSearch
     */
    @JsonIgnore
    public PSDEForm enableadvsearch(Integer enableAdvSearch){
        this.setEnableAdvSearch(enableAdvSearch);
        return this;
    }

     /**
     * 设置 支持高级搜索，详细说明：{@link #FIELD_ENABLEADVSEARCH}
     * <P>
     * 等同 {@link #setEnableAdvSearch}
     * @param enableAdvSearch
     */
    @JsonIgnore
    public PSDEForm enableadvsearch(Boolean enableAdvSearch){
        if(enableAdvSearch == null){
            this.setEnableAdvSearch(null);
        }
        else{
            this.setEnableAdvSearch(enableAdvSearch?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEAUTOSAVE</B>&nbsp;启用自动保存
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.FormAutoSaveMode} 
     */
    public final static String FIELD_ENABLEAUTOSAVE = "enableautosave";

    /**
     * 设置 启用自动保存
     * 
     * @param enableAutoSave
     * 
     */
    @JsonProperty(FIELD_ENABLEAUTOSAVE)
    public void setEnableAutoSave(Integer enableAutoSave){
        this.set(FIELD_ENABLEAUTOSAVE, enableAutoSave);
    }
    
    /**
     * 获取 启用自动保存  
     * @return
     */
    @JsonIgnore
    public Integer getEnableAutoSave(){
        Object objValue = this.get(FIELD_ENABLEAUTOSAVE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用自动保存 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableAutoSaveDirty(){
        if(this.contains(FIELD_ENABLEAUTOSAVE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用自动保存
     */
    @JsonIgnore
    public void resetEnableAutoSave(){
        this.reset(FIELD_ENABLEAUTOSAVE);
    }

    /**
     * 设置 启用自动保存
     * <P>
     * 等同 {@link #setEnableAutoSave}
     * @param enableAutoSave
     */
    @JsonIgnore
    public PSDEForm enableautosave(Integer enableAutoSave){
        this.setEnableAutoSave(enableAutoSave);
        return this;
    }

     /**
     * 设置 启用自动保存
     * <P>
     * 等同 {@link #setEnableAutoSave}
     * @param enableAutoSave
     */
    @JsonIgnore
    public PSDEForm enableautosave(net.ibizsys.psmodel.core.util.PSModelEnums.FormAutoSaveMode enableAutoSave){
        if(enableAutoSave == null){
            this.setEnableAutoSave(null);
        }
        else{
            this.setEnableAutoSave(enableAutoSave.value);
        }
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
    public PSDEForm enablecustomized(Integer enableCustomized){
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
    public PSDEForm enablecustomized(Boolean enableCustomized){
        if(enableCustomized == null){
            this.setEnableCustomized(null);
        }
        else{
            this.setEnableCustomized(enableCustomized?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEFILTERSAVE</B>&nbsp;启用过滤器保存
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEFILTERSAVE = "enablefiltersave";

    /**
     * 设置 启用过滤器保存
     * 
     * @param enableFilterSave
     * 
     */
    @JsonProperty(FIELD_ENABLEFILTERSAVE)
    public void setEnableFilterSave(Integer enableFilterSave){
        this.set(FIELD_ENABLEFILTERSAVE, enableFilterSave);
    }
    
    /**
     * 获取 启用过滤器保存  
     * @return
     */
    @JsonIgnore
    public Integer getEnableFilterSave(){
        Object objValue = this.get(FIELD_ENABLEFILTERSAVE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用过滤器保存 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableFilterSaveDirty(){
        if(this.contains(FIELD_ENABLEFILTERSAVE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用过滤器保存
     */
    @JsonIgnore
    public void resetEnableFilterSave(){
        this.reset(FIELD_ENABLEFILTERSAVE);
    }

    /**
     * 设置 启用过滤器保存
     * <P>
     * 等同 {@link #setEnableFilterSave}
     * @param enableFilterSave
     */
    @JsonIgnore
    public PSDEForm enablefiltersave(Integer enableFilterSave){
        this.setEnableFilterSave(enableFilterSave);
        return this;
    }

     /**
     * 设置 启用过滤器保存
     * <P>
     * 等同 {@link #setEnableFilterSave}
     * @param enableFilterSave
     */
    @JsonIgnore
    public PSDEForm enablefiltersave(Boolean enableFilterSave){
        if(enableFilterSave == null){
            this.setEnableFilterSave(null);
        }
        else{
            this.setEnableFilterSave(enableFilterSave?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEITEMFILTER</B>&nbsp;启用成员过滤器
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEITEMFILTER = "enableitemfilter";

    /**
     * 设置 启用成员过滤器
     * 
     * @param enableItemFilter
     * 
     */
    @JsonProperty(FIELD_ENABLEITEMFILTER)
    public void setEnableItemFilter(Integer enableItemFilter){
        this.set(FIELD_ENABLEITEMFILTER, enableItemFilter);
    }
    
    /**
     * 获取 启用成员过滤器  
     * @return
     */
    @JsonIgnore
    public Integer getEnableItemFilter(){
        Object objValue = this.get(FIELD_ENABLEITEMFILTER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用成员过滤器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableItemFilterDirty(){
        if(this.contains(FIELD_ENABLEITEMFILTER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用成员过滤器
     */
    @JsonIgnore
    public void resetEnableItemFilter(){
        this.reset(FIELD_ENABLEITEMFILTER);
    }

    /**
     * 设置 启用成员过滤器
     * <P>
     * 等同 {@link #setEnableItemFilter}
     * @param enableItemFilter
     */
    @JsonIgnore
    public PSDEForm enableitemfilter(Integer enableItemFilter){
        this.setEnableItemFilter(enableItemFilter);
        return this;
    }

     /**
     * 设置 启用成员过滤器
     * <P>
     * 等同 {@link #setEnableItemFilter}
     * @param enableItemFilter
     */
    @JsonIgnore
    public PSDEForm enableitemfilter(Boolean enableItemFilter){
        if(enableItemFilter == null){
            this.setEnableItemFilter(null);
        }
        else{
            this.setEnableItemFilter(enableItemFilter?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSDEForm enableitempriv(Integer enableItemPriv){
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
    public PSDEForm enableitempriv(Boolean enableItemPriv){
        if(enableItemPriv == null){
            this.setEnableItemPriv(null);
        }
        else{
            this.setEnableItemPriv(enableItemPriv?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>FORMITEMSTYLE</B>&nbsp;表单项默认样式，指定表单项的默认式样，表单项未指定式样时将使用此配置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.CtrlDetailStyle} 
     */
    public final static String FIELD_FORMITEMSTYLE = "formitemstyle";

    /**
     * 设置 表单项默认样式，详细说明：{@link #FIELD_FORMITEMSTYLE}
     * 
     * @param formItemStyle
     * 
     */
    @JsonProperty(FIELD_FORMITEMSTYLE)
    public void setFormItemStyle(String formItemStyle){
        this.set(FIELD_FORMITEMSTYLE, formItemStyle);
    }
    
    /**
     * 获取 表单项默认样式  
     * @return
     */
    @JsonIgnore
    public String getFormItemStyle(){
        Object objValue = this.get(FIELD_FORMITEMSTYLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表单项默认样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFormItemStyleDirty(){
        if(this.contains(FIELD_FORMITEMSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表单项默认样式
     */
    @JsonIgnore
    public void resetFormItemStyle(){
        this.reset(FIELD_FORMITEMSTYLE);
    }

    /**
     * 设置 表单项默认样式，详细说明：{@link #FIELD_FORMITEMSTYLE}
     * <P>
     * 等同 {@link #setFormItemStyle}
     * @param formItemStyle
     */
    @JsonIgnore
    public PSDEForm formitemstyle(String formItemStyle){
        this.setFormItemStyle(formItemStyle);
        return this;
    }

     /**
     * 设置 表单项默认样式，详细说明：{@link #FIELD_FORMITEMSTYLE}
     * <P>
     * 等同 {@link #setFormItemStyle}
     * @param formItemStyle
     */
    @JsonIgnore
    public PSDEForm formitemstyle(net.ibizsys.psmodel.core.util.PSModelEnums.CtrlDetailStyle formItemStyle){
        if(formItemStyle == null){
            this.setFormItemStyle(null);
        }
        else{
            this.setFormItemStyle(formItemStyle.value);
        }
        return this;
    }

    /**
     * <B>FORMNAVBAR</B>&nbsp;表单导航栏，指定在表单中输出导航栏，导航栏可以根据表单相应层级的分组进行输出，也可以根据表单成员的锚点配置进行输出。未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_FORMNAVBAR = "formnavbar";

    /**
     * 设置 表单导航栏，详细说明：{@link #FIELD_FORMNAVBAR}
     * 
     * @param formNavBar
     * 
     */
    @JsonProperty(FIELD_FORMNAVBAR)
    public void setFormNavBar(Integer formNavBar){
        this.set(FIELD_FORMNAVBAR, formNavBar);
    }
    
    /**
     * 获取 表单导航栏  
     * @return
     */
    @JsonIgnore
    public Integer getFormNavBar(){
        Object objValue = this.get(FIELD_FORMNAVBAR);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 表单导航栏 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFormNavBarDirty(){
        if(this.contains(FIELD_FORMNAVBAR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表单导航栏
     */
    @JsonIgnore
    public void resetFormNavBar(){
        this.reset(FIELD_FORMNAVBAR);
    }

    /**
     * 设置 表单导航栏，详细说明：{@link #FIELD_FORMNAVBAR}
     * <P>
     * 等同 {@link #setFormNavBar}
     * @param formNavBar
     */
    @JsonIgnore
    public PSDEForm formnavbar(Integer formNavBar){
        this.setFormNavBar(formNavBar);
        return this;
    }

     /**
     * 设置 表单导航栏，详细说明：{@link #FIELD_FORMNAVBAR}
     * <P>
     * 等同 {@link #setFormNavBar}
     * @param formNavBar
     */
    @JsonIgnore
    public PSDEForm formnavbar(Boolean formNavBar){
        if(formNavBar == null){
            this.setFormNavBar(null);
        }
        else{
            this.setFormNavBar(formNavBar?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>FORMSN</B>&nbsp;表单编号，指定表单的编号
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_FORMSN = "formsn";

    /**
     * 设置 表单编号，详细说明：{@link #FIELD_FORMSN}
     * 
     * @param formSN
     * 
     */
    @JsonProperty(FIELD_FORMSN)
    public void setFormSN(String formSN){
        this.set(FIELD_FORMSN, formSN);
    }
    
    /**
     * 获取 表单编号  
     * @return
     */
    @JsonIgnore
    public String getFormSN(){
        Object objValue = this.get(FIELD_FORMSN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表单编号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFormSNDirty(){
        if(this.contains(FIELD_FORMSN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表单编号
     */
    @JsonIgnore
    public void resetFormSN(){
        this.reset(FIELD_FORMSN);
    }

    /**
     * 设置 表单编号，详细说明：{@link #FIELD_FORMSN}
     * <P>
     * 等同 {@link #setFormSN}
     * @param formSN
     */
    @JsonIgnore
    public PSDEForm formsn(String formSN){
        this.setFormSN(formSN);
        return this;
    }

    /**
     * <B>FORMSTYLE</B>&nbsp;表单样式，指定表单的样式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.FormStyle} 
     */
    public final static String FIELD_FORMSTYLE = "formstyle";

    /**
     * 设置 表单样式，详细说明：{@link #FIELD_FORMSTYLE}
     * 
     * @param formStyle
     * 
     */
    @JsonProperty(FIELD_FORMSTYLE)
    public void setFormStyle(String formStyle){
        this.set(FIELD_FORMSTYLE, formStyle);
    }
    
    /**
     * 获取 表单样式  
     * @return
     */
    @JsonIgnore
    public String getFormStyle(){
        Object objValue = this.get(FIELD_FORMSTYLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表单样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFormStyleDirty(){
        if(this.contains(FIELD_FORMSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表单样式
     */
    @JsonIgnore
    public void resetFormStyle(){
        this.reset(FIELD_FORMSTYLE);
    }

    /**
     * 设置 表单样式，详细说明：{@link #FIELD_FORMSTYLE}
     * <P>
     * 等同 {@link #setFormStyle}
     * @param formStyle
     */
    @JsonIgnore
    public PSDEForm formstyle(String formStyle){
        this.setFormStyle(formStyle);
        return this;
    }

     /**
     * 设置 表单样式，详细说明：{@link #FIELD_FORMSTYLE}
     * <P>
     * 等同 {@link #setFormStyle}
     * @param formStyle
     */
    @JsonIgnore
    public PSDEForm formstyle(net.ibizsys.psmodel.core.util.PSModelEnums.FormStyle formStyle){
        if(formStyle == null){
            this.setFormStyle(null);
        }
        else{
            this.setFormStyle(formStyle.value);
        }
        return this;
    }

    /**
     * <B>FORMTAG</B>&nbsp;表单标记
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_FORMTAG = "formtag";

    /**
     * 设置 表单标记
     * 
     * @param formTag
     * 
     */
    @JsonProperty(FIELD_FORMTAG)
    public void setFormTag(String formTag){
        this.set(FIELD_FORMTAG, formTag);
    }
    
    /**
     * 获取 表单标记  
     * @return
     */
    @JsonIgnore
    public String getFormTag(){
        Object objValue = this.get(FIELD_FORMTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表单标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFormTagDirty(){
        if(this.contains(FIELD_FORMTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表单标记
     */
    @JsonIgnore
    public void resetFormTag(){
        this.reset(FIELD_FORMTAG);
    }

    /**
     * 设置 表单标记
     * <P>
     * 等同 {@link #setFormTag}
     * @param formTag
     */
    @JsonIgnore
    public PSDEForm formtag(String formTag){
        this.setFormTag(formTag);
        return this;
    }

    /**
     * <B>FORMTAG2</B>&nbsp;表单标记2
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_FORMTAG2 = "formtag2";

    /**
     * 设置 表单标记2
     * 
     * @param formTag2
     * 
     */
    @JsonProperty(FIELD_FORMTAG2)
    public void setFormTag2(String formTag2){
        this.set(FIELD_FORMTAG2, formTag2);
    }
    
    /**
     * 获取 表单标记2  
     * @return
     */
    @JsonIgnore
    public String getFormTag2(){
        Object objValue = this.get(FIELD_FORMTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表单标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFormTag2Dirty(){
        if(this.contains(FIELD_FORMTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表单标记2
     */
    @JsonIgnore
    public void resetFormTag2(){
        this.reset(FIELD_FORMTAG2);
    }

    /**
     * 设置 表单标记2
     * <P>
     * 等同 {@link #setFormTag2}
     * @param formTag2
     */
    @JsonIgnore
    public PSDEForm formtag2(String formTag2){
        this.setFormTag2(formTag2);
        return this;
    }

    /**
     * <B>FORMTAG3</B>&nbsp;表单标记3
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_FORMTAG3 = "formtag3";

    /**
     * 设置 表单标记3
     * 
     * @param formTag3
     * 
     */
    @JsonProperty(FIELD_FORMTAG3)
    public void setFormTag3(String formTag3){
        this.set(FIELD_FORMTAG3, formTag3);
    }
    
    /**
     * 获取 表单标记3  
     * @return
     */
    @JsonIgnore
    public String getFormTag3(){
        Object objValue = this.get(FIELD_FORMTAG3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表单标记3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFormTag3Dirty(){
        if(this.contains(FIELD_FORMTAG3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表单标记3
     */
    @JsonIgnore
    public void resetFormTag3(){
        this.reset(FIELD_FORMTAG3);
    }

    /**
     * 设置 表单标记3
     * <P>
     * 等同 {@link #setFormTag3}
     * @param formTag3
     */
    @JsonIgnore
    public PSDEForm formtag3(String formTag3){
        this.setFormTag3(formTag3);
        return this;
    }

    /**
     * <B>FORMTAG4</B>&nbsp;表单标记4
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_FORMTAG4 = "formtag4";

    /**
     * 设置 表单标记4
     * 
     * @param formTag4
     * 
     */
    @JsonProperty(FIELD_FORMTAG4)
    public void setFormTag4(String formTag4){
        this.set(FIELD_FORMTAG4, formTag4);
    }
    
    /**
     * 获取 表单标记4  
     * @return
     */
    @JsonIgnore
    public String getFormTag4(){
        Object objValue = this.get(FIELD_FORMTAG4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表单标记4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFormTag4Dirty(){
        if(this.contains(FIELD_FORMTAG4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表单标记4
     */
    @JsonIgnore
    public void resetFormTag4(){
        this.reset(FIELD_FORMTAG4);
    }

    /**
     * 设置 表单标记4
     * <P>
     * 等同 {@link #setFormTag4}
     * @param formTag4
     */
    @JsonIgnore
    public PSDEForm formtag4(String formTag4){
        this.setFormTag4(formTag4);
        return this;
    }

    /**
     * <B>FORMTYPE</B>&nbsp;表单类型，指定表单类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.FormType} 
     */
    public final static String FIELD_FORMTYPE = "formtype";

    /**
     * 设置 表单类型，详细说明：{@link #FIELD_FORMTYPE}
     * 
     * @param formType
     * 
     */
    @JsonProperty(FIELD_FORMTYPE)
    public void setFormType(String formType){
        this.set(FIELD_FORMTYPE, formType);
    }
    
    /**
     * 获取 表单类型  
     * @return
     */
    @JsonIgnore
    public String getFormType(){
        Object objValue = this.get(FIELD_FORMTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表单类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFormTypeDirty(){
        if(this.contains(FIELD_FORMTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表单类型
     */
    @JsonIgnore
    public void resetFormType(){
        this.reset(FIELD_FORMTYPE);
    }

    /**
     * 设置 表单类型，详细说明：{@link #FIELD_FORMTYPE}
     * <P>
     * 等同 {@link #setFormType}
     * @param formType
     */
    @JsonIgnore
    public PSDEForm formtype(String formType){
        this.setFormType(formType);
        return this;
    }

     /**
     * 设置 表单类型，详细说明：{@link #FIELD_FORMTYPE}
     * <P>
     * 等同 {@link #setFormType}
     * @param formType
     */
    @JsonIgnore
    public PSDEForm formtype(net.ibizsys.psmodel.core.util.PSModelEnums.FormType formType){
        if(formType == null){
            this.setFormType(null);
        }
        else{
            this.setFormType(formType.value);
        }
        return this;
    }

    /**
     * <B>FORMWIDTH</B>&nbsp;表单宽度，表单的宽度，默认为0，自适应容器宽度
     */
    public final static String FIELD_FORMWIDTH = "formwidth";

    /**
     * 设置 表单宽度，详细说明：{@link #FIELD_FORMWIDTH}
     * 
     * @param formWidth
     * 
     */
    @JsonProperty(FIELD_FORMWIDTH)
    public void setFormWidth(Integer formWidth){
        this.set(FIELD_FORMWIDTH, formWidth);
    }
    
    /**
     * 获取 表单宽度  
     * @return
     */
    @JsonIgnore
    public Integer getFormWidth(){
        Object objValue = this.get(FIELD_FORMWIDTH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 表单宽度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFormWidthDirty(){
        if(this.contains(FIELD_FORMWIDTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表单宽度
     */
    @JsonIgnore
    public void resetFormWidth(){
        this.reset(FIELD_FORMWIDTH);
    }

    /**
     * 设置 表单宽度，详细说明：{@link #FIELD_FORMWIDTH}
     * <P>
     * 等同 {@link #setFormWidth}
     * @param formWidth
     */
    @JsonIgnore
    public PSDEForm formwidth(Integer formWidth){
        this.setFormWidth(formWidth);
        return this;
    }

    /**
     * <B>FUNCMODE</B>&nbsp;功能模式，定义表单功能模式，附加相应的处理逻辑
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.FormFuncMode} 
     */
    public final static String FIELD_FUNCMODE = "funcmode";

    /**
     * 设置 功能模式，详细说明：{@link #FIELD_FUNCMODE}
     * 
     * @param funcMode
     * 
     */
    @JsonProperty(FIELD_FUNCMODE)
    public void setFuncMode(String funcMode){
        this.set(FIELD_FUNCMODE, funcMode);
    }
    
    /**
     * 获取 功能模式  
     * @return
     */
    @JsonIgnore
    public String getFuncMode(){
        Object objValue = this.get(FIELD_FUNCMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFuncModeDirty(){
        if(this.contains(FIELD_FUNCMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能模式
     */
    @JsonIgnore
    public void resetFuncMode(){
        this.reset(FIELD_FUNCMODE);
    }

    /**
     * 设置 功能模式，详细说明：{@link #FIELD_FUNCMODE}
     * <P>
     * 等同 {@link #setFuncMode}
     * @param funcMode
     */
    @JsonIgnore
    public PSDEForm funcmode(String funcMode){
        this.setFuncMode(funcMode);
        return this;
    }

     /**
     * 设置 功能模式，详细说明：{@link #FIELD_FUNCMODE}
     * <P>
     * 等同 {@link #setFuncMode}
     * @param funcMode
     */
    @JsonIgnore
    public PSDEForm funcmode(net.ibizsys.psmodel.core.util.PSModelEnums.FormFuncMode funcMode){
        if(funcMode == null){
            this.setFuncMode(null);
        }
        else{
            this.setFuncMode(funcMode.value);
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
    public PSDEForm getdraftpsdeactionid(String getDraftPSDEActionId){
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
    public PSDEForm getdraftpsdeactionid(PSDEAction pSDEAction){
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
    public PSDEForm getdraftpsdeactionname(String getDraftPSDEActionName){
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
    public PSDEForm getpsdeactionid(String getPSDEActionId){
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
    public PSDEForm getpsdeactionid(PSDEAction pSDEAction){
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
    public PSDEForm getpsdeactionname(String getPSDEActionName){
        this.setGetPSDEActionName(getPSDEActionName);
        return this;
    }

    /**
     * <B>INFOFORMFLAG</B>&nbsp;信息表单，设置信息表单模式，注意信息表单的自动转换机制仅针对未直接设置编辑器类型的表单项
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.InfoFormMode} 
     */
    public final static String FIELD_INFOFORMFLAG = "infoformflag";

    /**
     * 设置 信息表单，详细说明：{@link #FIELD_INFOFORMFLAG}
     * 
     * @param infoFormFlag
     * 
     */
    @JsonProperty(FIELD_INFOFORMFLAG)
    public void setInfoFormFlag(Integer infoFormFlag){
        this.set(FIELD_INFOFORMFLAG, infoFormFlag);
    }
    
    /**
     * 获取 信息表单  
     * @return
     */
    @JsonIgnore
    public Integer getInfoFormFlag(){
        Object objValue = this.get(FIELD_INFOFORMFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 信息表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isInfoFormFlagDirty(){
        if(this.contains(FIELD_INFOFORMFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 信息表单
     */
    @JsonIgnore
    public void resetInfoFormFlag(){
        this.reset(FIELD_INFOFORMFLAG);
    }

    /**
     * 设置 信息表单，详细说明：{@link #FIELD_INFOFORMFLAG}
     * <P>
     * 等同 {@link #setInfoFormFlag}
     * @param infoFormFlag
     */
    @JsonIgnore
    public PSDEForm infoformflag(Integer infoFormFlag){
        this.setInfoFormFlag(infoFormFlag);
        return this;
    }

     /**
     * 设置 信息表单，详细说明：{@link #FIELD_INFOFORMFLAG}
     * <P>
     * 等同 {@link #setInfoFormFlag}
     * @param infoFormFlag
     */
    @JsonIgnore
    public PSDEForm infoformflag(net.ibizsys.psmodel.core.util.PSModelEnums.InfoFormMode infoFormFlag){
        if(infoFormFlag == null){
            this.setInfoFormFlag(null);
        }
        else{
            this.setInfoFormFlag(infoFormFlag.value);
        }
        return this;
    }

    /**
     * <B>LABELWIDTH</B>&nbsp;默认标题宽度，表单项标签的默认宽度，未定义时为【130】
     */
    public final static String FIELD_LABELWIDTH = "labelwidth";

    /**
     * 设置 默认标题宽度，详细说明：{@link #FIELD_LABELWIDTH}
     * 
     * @param labelWidth
     * 
     */
    @JsonProperty(FIELD_LABELWIDTH)
    public void setLabelWidth(Integer labelWidth){
        this.set(FIELD_LABELWIDTH, labelWidth);
    }
    
    /**
     * 获取 默认标题宽度  
     * @return
     */
    @JsonIgnore
    public Integer getLabelWidth(){
        Object objValue = this.get(FIELD_LABELWIDTH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认标题宽度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLabelWidthDirty(){
        if(this.contains(FIELD_LABELWIDTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认标题宽度
     */
    @JsonIgnore
    public void resetLabelWidth(){
        this.reset(FIELD_LABELWIDTH);
    }

    /**
     * 设置 默认标题宽度，详细说明：{@link #FIELD_LABELWIDTH}
     * <P>
     * 等同 {@link #setLabelWidth}
     * @param labelWidth
     */
    @JsonIgnore
    public PSDEForm labelwidth(Integer labelWidth){
        this.setLabelWidth(labelWidth);
        return this;
    }

    /**
     * <B>LAYOUTMODE</B>&nbsp;布局模式，指定表单容器的布局模式，未定义时为`栅格布局（24列均分）`（TABLE_24COL）
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.LayoutMode} 
     */
    public final static String FIELD_LAYOUTMODE = "layoutmode";

    /**
     * 设置 布局模式，详细说明：{@link #FIELD_LAYOUTMODE}
     * 
     * @param layoutMode
     * 
     */
    @JsonProperty(FIELD_LAYOUTMODE)
    public void setLayoutMode(String layoutMode){
        this.set(FIELD_LAYOUTMODE, layoutMode);
    }
    
    /**
     * 获取 布局模式  
     * @return
     */
    @JsonIgnore
    public String getLayoutMode(){
        Object objValue = this.get(FIELD_LAYOUTMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 布局模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLayoutModeDirty(){
        if(this.contains(FIELD_LAYOUTMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 布局模式
     */
    @JsonIgnore
    public void resetLayoutMode(){
        this.reset(FIELD_LAYOUTMODE);
    }

    /**
     * 设置 布局模式，详细说明：{@link #FIELD_LAYOUTMODE}
     * <P>
     * 等同 {@link #setLayoutMode}
     * @param layoutMode
     */
    @JsonIgnore
    public PSDEForm layoutmode(String layoutMode){
        this.setLayoutMode(layoutMode);
        return this;
    }

     /**
     * 设置 布局模式，详细说明：{@link #FIELD_LAYOUTMODE}
     * <P>
     * 等同 {@link #setLayoutMode}
     * @param layoutMode
     */
    @JsonIgnore
    public PSDEForm layoutmode(net.ibizsys.psmodel.core.util.PSModelEnums.LayoutMode layoutMode){
        if(layoutMode == null){
            this.setLayoutMode(null);
        }
        else{
            this.setLayoutMode(layoutMode.value);
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
    public PSDEForm memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MOBFLAG</B>&nbsp;移动端表单，指定表单是否为移动端专用表单，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_MOBFLAG = "mobflag";

    /**
     * 设置 移动端表单，详细说明：{@link #FIELD_MOBFLAG}
     * 
     * @param mobFlag
     * 
     */
    @JsonProperty(FIELD_MOBFLAG)
    public void setMobFlag(Integer mobFlag){
        this.set(FIELD_MOBFLAG, mobFlag);
    }
    
    /**
     * 获取 移动端表单  
     * @return
     */
    @JsonIgnore
    public Integer getMobFlag(){
        Object objValue = this.get(FIELD_MOBFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 移动端表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobFlagDirty(){
        if(this.contains(FIELD_MOBFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端表单
     */
    @JsonIgnore
    public void resetMobFlag(){
        this.reset(FIELD_MOBFLAG);
    }

    /**
     * 设置 移动端表单，详细说明：{@link #FIELD_MOBFLAG}
     * <P>
     * 等同 {@link #setMobFlag}
     * @param mobFlag
     */
    @JsonIgnore
    public PSDEForm mobflag(Integer mobFlag){
        this.setMobFlag(mobFlag);
        return this;
    }

     /**
     * 设置 移动端表单，详细说明：{@link #FIELD_MOBFLAG}
     * <P>
     * 等同 {@link #setMobFlag}
     * @param mobFlag
     */
    @JsonIgnore
    public PSDEForm mobflag(Boolean mobFlag){
        if(mobFlag == null){
            this.setMobFlag(null);
        }
        else{
            this.setMobFlag(mobFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>NAVBARHEIGHT</B>&nbsp;导航栏高度
     */
    public final static String FIELD_NAVBARHEIGHT = "navbarheight";

    /**
     * 设置 导航栏高度
     * 
     * @param navBarHeight
     * 
     */
    @JsonProperty(FIELD_NAVBARHEIGHT)
    public void setNavBarHeight(Integer navBarHeight){
        this.set(FIELD_NAVBARHEIGHT, navBarHeight);
    }
    
    /**
     * 获取 导航栏高度  
     * @return
     */
    @JsonIgnore
    public Integer getNavBarHeight(){
        Object objValue = this.get(FIELD_NAVBARHEIGHT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 导航栏高度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavBarHeightDirty(){
        if(this.contains(FIELD_NAVBARHEIGHT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航栏高度
     */
    @JsonIgnore
    public void resetNavBarHeight(){
        this.reset(FIELD_NAVBARHEIGHT);
    }

    /**
     * 设置 导航栏高度
     * <P>
     * 等同 {@link #setNavBarHeight}
     * @param navBarHeight
     */
    @JsonIgnore
    public PSDEForm navbarheight(Integer navBarHeight){
        this.setNavBarHeight(navBarHeight);
        return this;
    }

    /**
     * <B>NAVBARPOS</B>&nbsp;导航栏位置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.NavBarPos} 
     */
    public final static String FIELD_NAVBARPOS = "navbarpos";

    /**
     * 设置 导航栏位置
     * 
     * @param navBarPos
     * 
     */
    @JsonProperty(FIELD_NAVBARPOS)
    public void setNavBarPos(String navBarPos){
        this.set(FIELD_NAVBARPOS, navBarPos);
    }
    
    /**
     * 获取 导航栏位置  
     * @return
     */
    @JsonIgnore
    public String getNavBarPos(){
        Object objValue = this.get(FIELD_NAVBARPOS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导航栏位置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavBarPosDirty(){
        if(this.contains(FIELD_NAVBARPOS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航栏位置
     */
    @JsonIgnore
    public void resetNavBarPos(){
        this.reset(FIELD_NAVBARPOS);
    }

    /**
     * 设置 导航栏位置
     * <P>
     * 等同 {@link #setNavBarPos}
     * @param navBarPos
     */
    @JsonIgnore
    public PSDEForm navbarpos(String navBarPos){
        this.setNavBarPos(navBarPos);
        return this;
    }

     /**
     * 设置 导航栏位置
     * <P>
     * 等同 {@link #setNavBarPos}
     * @param navBarPos
     */
    @JsonIgnore
    public PSDEForm navbarpos(net.ibizsys.psmodel.core.util.PSModelEnums.NavBarPos navBarPos){
        if(navBarPos == null){
            this.setNavBarPos(null);
        }
        else{
            this.setNavBarPos(navBarPos.value);
        }
        return this;
    }

    /**
     * <B>NAVBARPSSYSCSSID</B>&nbsp;导航栏样式表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCss} 
     */
    public final static String FIELD_NAVBARPSSYSCSSID = "navbarpssyscssid";

    /**
     * 设置 导航栏样式表
     * 
     * @param navBarPSSysCssId
     * 
     */
    @JsonProperty(FIELD_NAVBARPSSYSCSSID)
    public void setNavBarPSSysCssId(String navBarPSSysCssId){
        this.set(FIELD_NAVBARPSSYSCSSID, navBarPSSysCssId);
    }
    
    /**
     * 获取 导航栏样式表  
     * @return
     */
    @JsonIgnore
    public String getNavBarPSSysCssId(){
        Object objValue = this.get(FIELD_NAVBARPSSYSCSSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导航栏样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavBarPSSysCssIdDirty(){
        if(this.contains(FIELD_NAVBARPSSYSCSSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航栏样式表
     */
    @JsonIgnore
    public void resetNavBarPSSysCssId(){
        this.reset(FIELD_NAVBARPSSYSCSSID);
    }

    /**
     * 设置 导航栏样式表
     * <P>
     * 等同 {@link #setNavBarPSSysCssId}
     * @param navBarPSSysCssId
     */
    @JsonIgnore
    public PSDEForm navbarpssyscssid(String navBarPSSysCssId){
        this.setNavBarPSSysCssId(navBarPSSysCssId);
        return this;
    }

    /**
     * 设置 导航栏样式表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNavBarPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSDEForm navbarpssyscssid(PSSysCss pSSysCss){
        if(pSSysCss == null){
            this.setNavBarPSSysCssId(null);
            this.setNavBarPSSysCssName(null);
        }
        else{
            this.setNavBarPSSysCssId(pSSysCss.getPSSysCssId());
            this.setNavBarPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    /**
     * <B>NAVBARPSSYSCSSNAME</B>&nbsp;导航栏样式表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NAVBARPSSYSCSSID}
     */
    public final static String FIELD_NAVBARPSSYSCSSNAME = "navbarpssyscssname";

    /**
     * 设置 导航栏样式表
     * 
     * @param navBarPSSysCssName
     * 
     */
    @JsonProperty(FIELD_NAVBARPSSYSCSSNAME)
    public void setNavBarPSSysCssName(String navBarPSSysCssName){
        this.set(FIELD_NAVBARPSSYSCSSNAME, navBarPSSysCssName);
    }
    
    /**
     * 获取 导航栏样式表  
     * @return
     */
    @JsonIgnore
    public String getNavBarPSSysCssName(){
        Object objValue = this.get(FIELD_NAVBARPSSYSCSSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导航栏样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavBarPSSysCssNameDirty(){
        if(this.contains(FIELD_NAVBARPSSYSCSSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航栏样式表
     */
    @JsonIgnore
    public void resetNavBarPSSysCssName(){
        this.reset(FIELD_NAVBARPSSYSCSSNAME);
    }

    /**
     * 设置 导航栏样式表
     * <P>
     * 等同 {@link #setNavBarPSSysCssName}
     * @param navBarPSSysCssName
     */
    @JsonIgnore
    public PSDEForm navbarpssyscssname(String navBarPSSysCssName){
        this.setNavBarPSSysCssName(navBarPSSysCssName);
        return this;
    }

    /**
     * <B>NAVBARSTYLE</B>&nbsp;导航栏内置样式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.CtrlDetailStyle} 
     */
    public final static String FIELD_NAVBARSTYLE = "navbarstyle";

    /**
     * 设置 导航栏内置样式
     * 
     * @param navBarStyle
     * 
     */
    @JsonProperty(FIELD_NAVBARSTYLE)
    public void setNavBarStyle(String navBarStyle){
        this.set(FIELD_NAVBARSTYLE, navBarStyle);
    }
    
    /**
     * 获取 导航栏内置样式  
     * @return
     */
    @JsonIgnore
    public String getNavBarStyle(){
        Object objValue = this.get(FIELD_NAVBARSTYLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导航栏内置样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavBarStyleDirty(){
        if(this.contains(FIELD_NAVBARSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航栏内置样式
     */
    @JsonIgnore
    public void resetNavBarStyle(){
        this.reset(FIELD_NAVBARSTYLE);
    }

    /**
     * 设置 导航栏内置样式
     * <P>
     * 等同 {@link #setNavBarStyle}
     * @param navBarStyle
     */
    @JsonIgnore
    public PSDEForm navbarstyle(String navBarStyle){
        this.setNavBarStyle(navBarStyle);
        return this;
    }

     /**
     * 设置 导航栏内置样式
     * <P>
     * 等同 {@link #setNavBarStyle}
     * @param navBarStyle
     */
    @JsonIgnore
    public PSDEForm navbarstyle(net.ibizsys.psmodel.core.util.PSModelEnums.CtrlDetailStyle navBarStyle){
        if(navBarStyle == null){
            this.setNavBarStyle(null);
        }
        else{
            this.setNavBarStyle(navBarStyle.value);
        }
        return this;
    }

    /**
     * <B>NAVBARWIDTH</B>&nbsp;导航栏宽度
     */
    public final static String FIELD_NAVBARWIDTH = "navbarwidth";

    /**
     * 设置 导航栏宽度
     * 
     * @param navBarWidth
     * 
     */
    @JsonProperty(FIELD_NAVBARWIDTH)
    public void setNavBarWidth(Integer navBarWidth){
        this.set(FIELD_NAVBARWIDTH, navBarWidth);
    }
    
    /**
     * 获取 导航栏宽度  
     * @return
     */
    @JsonIgnore
    public Integer getNavBarWidth(){
        Object objValue = this.get(FIELD_NAVBARWIDTH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 导航栏宽度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavBarWidthDirty(){
        if(this.contains(FIELD_NAVBARWIDTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航栏宽度
     */
    @JsonIgnore
    public void resetNavBarWidth(){
        this.reset(FIELD_NAVBARWIDTH);
    }

    /**
     * 设置 导航栏宽度
     * <P>
     * 等同 {@link #setNavBarWidth}
     * @param navBarWidth
     */
    @JsonIgnore
    public PSDEForm navbarwidth(Integer navBarWidth){
        this.setNavBarWidth(navBarWidth);
        return this;
    }

    /**
     * <B>PDVTPARAM</B>&nbsp;预置表单类型参数
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PDVTPARAM = "pdvtparam";

    /**
     * 设置 预置表单类型参数
     * 
     * @param pDVTParam
     * 
     */
    @JsonProperty(FIELD_PDVTPARAM)
    public void setPDVTParam(String pDVTParam){
        this.set(FIELD_PDVTPARAM, pDVTParam);
    }
    
    /**
     * 获取 预置表单类型参数  
     * @return
     */
    @JsonIgnore
    public String getPDVTParam(){
        Object objValue = this.get(FIELD_PDVTPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预置表单类型参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPDVTParamDirty(){
        if(this.contains(FIELD_PDVTPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预置表单类型参数
     */
    @JsonIgnore
    public void resetPDVTParam(){
        this.reset(FIELD_PDVTPARAM);
    }

    /**
     * 设置 预置表单类型参数
     * <P>
     * 等同 {@link #setPDVTParam}
     * @param pDVTParam
     */
    @JsonIgnore
    public PSDEForm pdvtparam(String pDVTParam){
        this.setPDVTParam(pDVTParam);
        return this;
    }

    /**
     * <B>PSACHANDLERID</B>&nbsp;默认后台处理对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSACHandler} 
     */
    public final static String FIELD_PSACHANDLERID = "psachandlerid";

    /**
     * 设置 默认后台处理对象
     * 
     * @param pSACHandlerId
     * 
     */
    @JsonProperty(FIELD_PSACHANDLERID)
    public void setPSACHandlerId(String pSACHandlerId){
        this.set(FIELD_PSACHANDLERID, pSACHandlerId);
    }
    
    /**
     * 获取 默认后台处理对象  
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
     * 判断 默认后台处理对象 是否指定值，包括空值
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
     * 重置 默认后台处理对象
     */
    @JsonIgnore
    public void resetPSACHandlerId(){
        this.reset(FIELD_PSACHANDLERID);
    }

    /**
     * 设置 默认后台处理对象
     * <P>
     * 等同 {@link #setPSACHandlerId}
     * @param pSACHandlerId
     */
    @JsonIgnore
    public PSDEForm psachandlerid(String pSACHandlerId){
        this.setPSACHandlerId(pSACHandlerId);
        return this;
    }

    /**
     * 设置 默认后台处理对象，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSACHandlerId}
     * @param pSACHandler 引用对象
     */
    @JsonIgnore
    public PSDEForm psachandlerid(PSACHandler pSACHandler){
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
     * <B>PSACHANDLERNAME</B>&nbsp;默认处理对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSACHANDLERID}
     */
    public final static String FIELD_PSACHANDLERNAME = "psachandlername";

    /**
     * 设置 默认处理对象
     * 
     * @param pSACHandlerName
     * 
     */
    @JsonProperty(FIELD_PSACHANDLERNAME)
    public void setPSACHandlerName(String pSACHandlerName){
        this.set(FIELD_PSACHANDLERNAME, pSACHandlerName);
    }
    
    /**
     * 获取 默认处理对象  
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
     * 判断 默认处理对象 是否指定值，包括空值
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
     * 重置 默认处理对象
     */
    @JsonIgnore
    public void resetPSACHandlerName(){
        this.reset(FIELD_PSACHANDLERNAME);
    }

    /**
     * 设置 默认处理对象
     * <P>
     * 等同 {@link #setPSACHandlerName}
     * @param pSACHandlerName
     */
    @JsonIgnore
    public PSDEForm psachandlername(String pSACHandlerName){
        this.setPSACHandlerName(pSACHandlerName);
        return this;
    }

    /**
     * <B>PSCTRLLOGICGROUPID</B>&nbsp;界面逻辑组，指定表单部件默认附加的部件逻辑组对象
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
    public PSDEForm psctrllogicgroupid(String pSCtrlLogicGroupId){
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
    public PSDEForm psctrllogicgroupid(PSCtrlLogicGroup pSCtrlLogicGroup){
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
     * <B>PSCTRLLOGICGROUPNAME</B>&nbsp;界面逻辑组，指定表单部件默认附加的部件逻辑组对象
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
    public PSDEForm psctrllogicgroupname(String pSCtrlLogicGroupName){
        this.setPSCtrlLogicGroupName(pSCtrlLogicGroupName);
        return this;
    }

    /**
     * <B>PSCTRLMSGID</B>&nbsp;部件消息，指定表单部件默认的部件消息对象
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
    public PSDEForm psctrlmsgid(String pSCtrlMsgId){
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
    public PSDEForm psctrlmsgid(PSCtrlMsg pSCtrlMsg){
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
     * <B>PSCTRLMSGNAME</B>&nbsp;部件消息，指定表单部件默认的部件消息对象
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
    public PSDEForm psctrlmsgname(String pSCtrlMsgName){
        this.setPSCtrlMsgName(pSCtrlMsgName);
        return this;
    }

    /**
     * <B>PSDEFINPUTTIPSETID</B>&nbsp;系统属性输入提示集，指定实体表单部件的默认属性输入提示器对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEFInputTipSet} 
     */
    public final static String FIELD_PSDEFINPUTTIPSETID = "psdefinputtipsetid";

    /**
     * 设置 系统属性输入提示集，详细说明：{@link #FIELD_PSDEFINPUTTIPSETID}
     * 
     * @param pSDEFInputTipSetId
     * 
     */
    @JsonProperty(FIELD_PSDEFINPUTTIPSETID)
    public void setPSDEFInputTipSetId(String pSDEFInputTipSetId){
        this.set(FIELD_PSDEFINPUTTIPSETID, pSDEFInputTipSetId);
    }
    
    /**
     * 获取 系统属性输入提示集  
     * @return
     */
    @JsonIgnore
    public String getPSDEFInputTipSetId(){
        Object objValue = this.get(FIELD_PSDEFINPUTTIPSETID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统属性输入提示集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFInputTipSetIdDirty(){
        if(this.contains(FIELD_PSDEFINPUTTIPSETID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统属性输入提示集
     */
    @JsonIgnore
    public void resetPSDEFInputTipSetId(){
        this.reset(FIELD_PSDEFINPUTTIPSETID);
    }

    /**
     * 设置 系统属性输入提示集，详细说明：{@link #FIELD_PSDEFINPUTTIPSETID}
     * <P>
     * 等同 {@link #setPSDEFInputTipSetId}
     * @param pSDEFInputTipSetId
     */
    @JsonIgnore
    public PSDEForm psdefinputtipsetid(String pSDEFInputTipSetId){
        this.setPSDEFInputTipSetId(pSDEFInputTipSetId);
        return this;
    }

    /**
     * 设置 系统属性输入提示集，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEFInputTipSetId}
     * @param pSDEFInputTipSet 引用对象
     */
    @JsonIgnore
    public PSDEForm psdefinputtipsetid(PSDEFInputTipSet pSDEFInputTipSet){
        if(pSDEFInputTipSet == null){
            this.setPSDEFInputTipSetId(null);
            this.setPSDEFInputTipSetName(null);
        }
        else{
            this.setPSDEFInputTipSetId(pSDEFInputTipSet.getPSDEFInputTipSetId());
            this.setPSDEFInputTipSetName(pSDEFInputTipSet.getPSDEFInputTipSetName());
        }
        return this;
    }

    /**
     * <B>PSDEFINPUTTIPSETNAME</B>&nbsp;系统属性输入提示集，指定实体表单部件的默认属性输入提示器对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFINPUTTIPSETID}
     */
    public final static String FIELD_PSDEFINPUTTIPSETNAME = "psdefinputtipsetname";

    /**
     * 设置 系统属性输入提示集，详细说明：{@link #FIELD_PSDEFINPUTTIPSETNAME}
     * 
     * @param pSDEFInputTipSetName
     * 
     */
    @JsonProperty(FIELD_PSDEFINPUTTIPSETNAME)
    public void setPSDEFInputTipSetName(String pSDEFInputTipSetName){
        this.set(FIELD_PSDEFINPUTTIPSETNAME, pSDEFInputTipSetName);
    }
    
    /**
     * 获取 系统属性输入提示集  
     * @return
     */
    @JsonIgnore
    public String getPSDEFInputTipSetName(){
        Object objValue = this.get(FIELD_PSDEFINPUTTIPSETNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统属性输入提示集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFInputTipSetNameDirty(){
        if(this.contains(FIELD_PSDEFINPUTTIPSETNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统属性输入提示集
     */
    @JsonIgnore
    public void resetPSDEFInputTipSetName(){
        this.reset(FIELD_PSDEFINPUTTIPSETNAME);
    }

    /**
     * 设置 系统属性输入提示集，详细说明：{@link #FIELD_PSDEFINPUTTIPSETNAME}
     * <P>
     * 等同 {@link #setPSDEFInputTipSetName}
     * @param pSDEFInputTipSetName
     */
    @JsonIgnore
    public PSDEForm psdefinputtipsetname(String pSDEFInputTipSetName){
        this.setPSDEFInputTipSetName(pSDEFInputTipSetName);
        return this;
    }

    /**
     * <B>PSDEFORMID</B>&nbsp;实体表单标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEFORMID = "psdeformid";

    /**
     * 设置 实体表单标识
     * 
     * @param pSDEFormId
     * 
     */
    @JsonProperty(FIELD_PSDEFORMID)
    public void setPSDEFormId(String pSDEFormId){
        this.set(FIELD_PSDEFORMID, pSDEFormId);
    }
    
    /**
     * 获取 实体表单标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEFormId(){
        Object objValue = this.get(FIELD_PSDEFORMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体表单标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFormIdDirty(){
        if(this.contains(FIELD_PSDEFORMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体表单标识
     */
    @JsonIgnore
    public void resetPSDEFormId(){
        this.reset(FIELD_PSDEFORMID);
    }

    /**
     * 设置 实体表单标识
     * <P>
     * 等同 {@link #setPSDEFormId}
     * @param pSDEFormId
     */
    @JsonIgnore
    public PSDEForm psdeformid(String pSDEFormId){
        this.setPSDEFormId(pSDEFormId);
        return this;
    }

    /**
     * <B>PSDEFORMNAME</B>&nbsp;表单名称，指定表单名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEFORMNAME = "psdeformname";

    /**
     * 设置 表单名称，详细说明：{@link #FIELD_PSDEFORMNAME}
     * 
     * @param pSDEFormName
     * 
     */
    @JsonProperty(FIELD_PSDEFORMNAME)
    public void setPSDEFormName(String pSDEFormName){
        this.set(FIELD_PSDEFORMNAME, pSDEFormName);
    }
    
    /**
     * 获取 表单名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEFormName(){
        Object objValue = this.get(FIELD_PSDEFORMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表单名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFormNameDirty(){
        if(this.contains(FIELD_PSDEFORMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表单名称
     */
    @JsonIgnore
    public void resetPSDEFormName(){
        this.reset(FIELD_PSDEFORMNAME);
    }

    /**
     * 设置 表单名称，详细说明：{@link #FIELD_PSDEFORMNAME}
     * <P>
     * 等同 {@link #setPSDEFormName}
     * @param pSDEFormName
     */
    @JsonIgnore
    public PSDEForm psdeformname(String pSDEFormName){
        this.setPSDEFormName(pSDEFormName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEFormName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEFormName(strName);
    }

    @JsonIgnore
    public PSDEForm name(String strName){
        this.setPSDEFormName(strName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定表单所在的实体对象
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
    public PSDEForm psdeid(String pSDEId){
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
    public PSDEForm psdeid(PSDataEntity pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;实体，指定表单所在的实体对象
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
    public PSDEForm psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSDYNAINSTNAME</B>&nbsp;动态系统实例
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDYNAINSTID}
     */
    public final static String FIELD_PSDYNAINSTNAME = "psdynainstname";

    /**
     * 设置 动态系统实例
     * 
     * @param pSDynaInstName
     * 
     */
    @JsonProperty(FIELD_PSDYNAINSTNAME)
    public void setPSDynaInstName(String pSDynaInstName){
        this.set(FIELD_PSDYNAINSTNAME, pSDynaInstName);
    }
    
    /**
     * 获取 动态系统实例  
     * @return
     */
    @JsonIgnore
    public String getPSDynaInstName(){
        Object objValue = this.get(FIELD_PSDYNAINSTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 动态系统实例 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDynaInstNameDirty(){
        if(this.contains(FIELD_PSDYNAINSTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 动态系统实例
     */
    @JsonIgnore
    public void resetPSDynaInstName(){
        this.reset(FIELD_PSDYNAINSTNAME);
    }

    /**
     * 设置 动态系统实例
     * <P>
     * 等同 {@link #setPSDynaInstName}
     * @param pSDynaInstName
     */
    @JsonIgnore
    public PSDEForm psdynainstname(String pSDynaInstName){
        this.setPSDynaInstName(pSDynaInstName);
        return this;
    }

    /**
     * <B>PSPFID</B>&nbsp;前端模板
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSPF} 
     */
    public final static String FIELD_PSPFID = "pspfid";

    /**
     * 设置 前端模板
     * 
     * @param pSPFId
     * 
     */
    @JsonProperty(FIELD_PSPFID)
    public void setPSPFId(String pSPFId){
        this.set(FIELD_PSPFID, pSPFId);
    }
    
    /**
     * 获取 前端模板  
     * @return
     */
    @JsonIgnore
    public String getPSPFId(){
        Object objValue = this.get(FIELD_PSPFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端模板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSPFIdDirty(){
        if(this.contains(FIELD_PSPFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端模板
     */
    @JsonIgnore
    public void resetPSPFId(){
        this.reset(FIELD_PSPFID);
    }

    /**
     * 设置 前端模板
     * <P>
     * 等同 {@link #setPSPFId}
     * @param pSPFId
     */
    @JsonIgnore
    public PSDEForm pspfid(String pSPFId){
        this.setPSPFId(pSPFId);
        return this;
    }

    /**
     * <B>PSPFNAME</B>&nbsp;前端模板
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSPFID}
     */
    public final static String FIELD_PSPFNAME = "pspfname";

    /**
     * 设置 前端模板
     * 
     * @param pSPFName
     * 
     */
    @JsonProperty(FIELD_PSPFNAME)
    public void setPSPFName(String pSPFName){
        this.set(FIELD_PSPFNAME, pSPFName);
    }
    
    /**
     * 获取 前端模板  
     * @return
     */
    @JsonIgnore
    public String getPSPFName(){
        Object objValue = this.get(FIELD_PSPFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端模板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSPFNameDirty(){
        if(this.contains(FIELD_PSPFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端模板
     */
    @JsonIgnore
    public void resetPSPFName(){
        this.reset(FIELD_PSPFNAME);
    }

    /**
     * 设置 前端模板
     * <P>
     * 等同 {@link #setPSPFName}
     * @param pSPFName
     */
    @JsonIgnore
    public PSDEForm pspfname(String pSPFName){
        this.setPSPFName(pSPFName);
        return this;
    }

    /**
     * <B>PSSYSCOUNTERID</B>&nbsp;系统计数器
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCounter} 
     */
    public final static String FIELD_PSSYSCOUNTERID = "pssyscounterid";

    /**
     * 设置 系统计数器
     * 
     * @param pSSysCounterId
     * 
     */
    @JsonProperty(FIELD_PSSYSCOUNTERID)
    public void setPSSysCounterId(String pSSysCounterId){
        this.set(FIELD_PSSYSCOUNTERID, pSSysCounterId);
    }
    
    /**
     * 获取 系统计数器  
     * @return
     */
    @JsonIgnore
    public String getPSSysCounterId(){
        Object objValue = this.get(FIELD_PSSYSCOUNTERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统计数器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCounterIdDirty(){
        if(this.contains(FIELD_PSSYSCOUNTERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统计数器
     */
    @JsonIgnore
    public void resetPSSysCounterId(){
        this.reset(FIELD_PSSYSCOUNTERID);
    }

    /**
     * 设置 系统计数器
     * <P>
     * 等同 {@link #setPSSysCounterId}
     * @param pSSysCounterId
     */
    @JsonIgnore
    public PSDEForm pssyscounterid(String pSSysCounterId){
        this.setPSSysCounterId(pSSysCounterId);
        return this;
    }

    /**
     * 设置 系统计数器，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCounterId}
     * @param pSSysCounter 引用对象
     */
    @JsonIgnore
    public PSDEForm pssyscounterid(PSSysCounter pSSysCounter){
        if(pSSysCounter == null){
            this.setPSSysCounterId(null);
            this.setPSSysCounterName(null);
        }
        else{
            this.setPSSysCounterId(pSSysCounter.getPSSysCounterId());
            this.setPSSysCounterName(pSSysCounter.getPSSysCounterName());
        }
        return this;
    }

    /**
     * <B>PSSYSCOUNTERNAME</B>&nbsp;系统计数器
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSCOUNTERID}
     */
    public final static String FIELD_PSSYSCOUNTERNAME = "pssyscountername";

    /**
     * 设置 系统计数器
     * 
     * @param pSSysCounterName
     * 
     */
    @JsonProperty(FIELD_PSSYSCOUNTERNAME)
    public void setPSSysCounterName(String pSSysCounterName){
        this.set(FIELD_PSSYSCOUNTERNAME, pSSysCounterName);
    }
    
    /**
     * 获取 系统计数器  
     * @return
     */
    @JsonIgnore
    public String getPSSysCounterName(){
        Object objValue = this.get(FIELD_PSSYSCOUNTERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统计数器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCounterNameDirty(){
        if(this.contains(FIELD_PSSYSCOUNTERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统计数器
     */
    @JsonIgnore
    public void resetPSSysCounterName(){
        this.reset(FIELD_PSSYSCOUNTERNAME);
    }

    /**
     * 设置 系统计数器
     * <P>
     * 等同 {@link #setPSSysCounterName}
     * @param pSSysCounterName
     */
    @JsonIgnore
    public PSDEForm pssyscountername(String pSSysCounterName){
        this.setPSSysCounterName(pSSysCounterName);
        return this;
    }

    /**
     * <B>PSSYSCSSID</B>&nbsp;系统样式表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCss} 
     */
    public final static String FIELD_PSSYSCSSID = "pssyscssid";

    /**
     * 设置 系统样式表
     * 
     * @param pSSysCssId
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSID)
    public void setPSSysCssId(String pSSysCssId){
        this.set(FIELD_PSSYSCSSID, pSSysCssId);
    }
    
    /**
     * 获取 系统样式表  
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
     * 判断 系统样式表 是否指定值，包括空值
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
     * 重置 系统样式表
     */
    @JsonIgnore
    public void resetPSSysCssId(){
        this.reset(FIELD_PSSYSCSSID);
    }

    /**
     * 设置 系统样式表
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCssId
     */
    @JsonIgnore
    public PSDEForm pssyscssid(String pSSysCssId){
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    /**
     * 设置 系统样式表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSDEForm pssyscssid(PSSysCss pSSysCss){
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
     * <B>PSSYSCSSNAME</B>&nbsp;系统样式表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSCSSID}
     */
    public final static String FIELD_PSSYSCSSNAME = "pssyscssname";

    /**
     * 设置 系统样式表
     * 
     * @param pSSysCssName
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSNAME)
    public void setPSSysCssName(String pSSysCssName){
        this.set(FIELD_PSSYSCSSNAME, pSSysCssName);
    }
    
    /**
     * 获取 系统样式表  
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
     * 判断 系统样式表 是否指定值，包括空值
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
     * 重置 系统样式表
     */
    @JsonIgnore
    public void resetPSSysCssName(){
        this.reset(FIELD_PSSYSCSSNAME);
    }

    /**
     * 设置 系统样式表
     * <P>
     * 等同 {@link #setPSSysCssName}
     * @param pSSysCssName
     */
    @JsonIgnore
    public PSDEForm pssyscssname(String pSSysCssName){
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
    public PSDEForm pssysdynamodelid(String pSSysDynaModelId){
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
    public PSDEForm pssysdynamodelid(PSSysDynaModel pSSysDynaModel){
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
    public PSDEForm pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端扩展插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysPFPlugin} 
     */
    public final static String FIELD_PSSYSPFPLUGINID = "pssyspfpluginid";

    /**
     * 设置 前端扩展插件
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
     * 设置 前端扩展插件
     * <P>
     * 等同 {@link #setPSSysPFPluginId}
     * @param pSSysPFPluginId
     */
    @JsonIgnore
    public PSDEForm pssyspfpluginid(String pSSysPFPluginId){
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
    public PSDEForm pssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
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
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端扩展插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSPFPLUGINID}
     */
    public final static String FIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";

    /**
     * 设置 前端扩展插件
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
     * 设置 前端扩展插件
     * <P>
     * 等同 {@link #setPSSysPFPluginName}
     * @param pSSysPFPluginName
     */
    @JsonIgnore
    public PSDEForm pssyspfpluginname(String pSSysPFPluginName){
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
    public PSDEForm pssysreqitemid(String pSSysReqItemId){
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
    public PSDEForm pssysreqitemid(PSSysReqItem pSSysReqItem){
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
    public PSDEForm pssysreqitemname(String pSSysReqItemName){
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
    public PSDEForm psviewmsggroupid(String pSViewMsgGroupId){
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
    public PSDEForm psviewmsggroupid(PSViewMsgGroup pSViewMsgGroup){
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
    public PSDEForm psviewmsggroupname(String pSViewMsgGroupName){
        this.setPSViewMsgGroupName(pSViewMsgGroupName);
        return this;
    }

    /**
     * <B>PSWFDEID</B>&nbsp;实体工作流
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSWFDE} 
     */
    public final static String FIELD_PSWFDEID = "pswfdeid";

    /**
     * 设置 实体工作流
     * 
     * @param pSWFDEId
     * 
     */
    @JsonProperty(FIELD_PSWFDEID)
    public void setPSWFDEId(String pSWFDEId){
        this.set(FIELD_PSWFDEID, pSWFDEId);
    }
    
    /**
     * 获取 实体工作流  
     * @return
     */
    @JsonIgnore
    public String getPSWFDEId(){
        Object objValue = this.get(FIELD_PSWFDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体工作流 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFDEIdDirty(){
        if(this.contains(FIELD_PSWFDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体工作流
     */
    @JsonIgnore
    public void resetPSWFDEId(){
        this.reset(FIELD_PSWFDEID);
    }

    /**
     * 设置 实体工作流
     * <P>
     * 等同 {@link #setPSWFDEId}
     * @param pSWFDEId
     */
    @JsonIgnore
    public PSDEForm pswfdeid(String pSWFDEId){
        this.setPSWFDEId(pSWFDEId);
        return this;
    }

    /**
     * 设置 实体工作流，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSWFDEId}
     * @param pSWFDE 引用对象
     */
    @JsonIgnore
    public PSDEForm pswfdeid(PSWFDE pSWFDE){
        if(pSWFDE == null){
            this.setPSWFDEId(null);
            this.setPSWFDEName(null);
            this.setPSWFId(null);
        }
        else{
            this.setPSWFDEId(pSWFDE.getPSWFDEId());
            this.setPSWFDEName(pSWFDE.getPSWFDEName());
            this.setPSWFId(pSWFDE.getPSWFId());
        }
        return this;
    }

    /**
     * <B>PSWFDENAME</B>&nbsp;实体工作流
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWFDEID}
     */
    public final static String FIELD_PSWFDENAME = "pswfdename";

    /**
     * 设置 实体工作流
     * 
     * @param pSWFDEName
     * 
     */
    @JsonProperty(FIELD_PSWFDENAME)
    public void setPSWFDEName(String pSWFDEName){
        this.set(FIELD_PSWFDENAME, pSWFDEName);
    }
    
    /**
     * 获取 实体工作流  
     * @return
     */
    @JsonIgnore
    public String getPSWFDEName(){
        Object objValue = this.get(FIELD_PSWFDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体工作流 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFDENameDirty(){
        if(this.contains(FIELD_PSWFDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体工作流
     */
    @JsonIgnore
    public void resetPSWFDEName(){
        this.reset(FIELD_PSWFDENAME);
    }

    /**
     * 设置 实体工作流
     * <P>
     * 等同 {@link #setPSWFDEName}
     * @param pSWFDEName
     */
    @JsonIgnore
    public PSDEForm pswfdename(String pSWFDEName){
        this.setPSWFDEName(pSWFDEName);
        return this;
    }

    /**
     * <B>PSWFID</B>&nbsp;PSWFID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWFDEID}
     */
    public final static String FIELD_PSWFID = "pswfid";

    /**
     * 设置 PSWFID
     * 
     * @param pSWFId
     * 
     */
    @JsonProperty(FIELD_PSWFID)
    public void setPSWFId(String pSWFId){
        this.set(FIELD_PSWFID, pSWFId);
    }
    
    /**
     * 获取 PSWFID  
     * @return
     */
    @JsonIgnore
    public String getPSWFId(){
        Object objValue = this.get(FIELD_PSWFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 PSWFID 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFIdDirty(){
        if(this.contains(FIELD_PSWFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 PSWFID
     */
    @JsonIgnore
    public void resetPSWFId(){
        this.reset(FIELD_PSWFID);
    }

    /**
     * 设置 PSWFID
     * <P>
     * 等同 {@link #setPSWFId}
     * @param pSWFId
     */
    @JsonIgnore
    public PSDEForm pswfid(String pSWFId){
        this.setPSWFId(pSWFId);
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
    public PSDEForm removepsdeactionid(String removePSDEActionId){
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
    public PSDEForm removepsdeactionid(PSDEAction pSDEAction){
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
    public PSDEForm removepsdeactionname(String removePSDEActionName){
        this.setRemovePSDEActionName(removePSDEActionName);
        return this;
    }

    /**
     * <B>SEARCHBTNPOS</B>&nbsp;搜索按钮位置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SearchFormButtonPos} 
     */
    public final static String FIELD_SEARCHBTNPOS = "searchbtnpos";

    /**
     * 设置 搜索按钮位置
     * 
     * @param searchBtnPos
     * 
     */
    @JsonProperty(FIELD_SEARCHBTNPOS)
    public void setSearchBtnPos(String searchBtnPos){
        this.set(FIELD_SEARCHBTNPOS, searchBtnPos);
    }
    
    /**
     * 获取 搜索按钮位置  
     * @return
     */
    @JsonIgnore
    public String getSearchBtnPos(){
        Object objValue = this.get(FIELD_SEARCHBTNPOS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 搜索按钮位置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSearchBtnPosDirty(){
        if(this.contains(FIELD_SEARCHBTNPOS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 搜索按钮位置
     */
    @JsonIgnore
    public void resetSearchBtnPos(){
        this.reset(FIELD_SEARCHBTNPOS);
    }

    /**
     * 设置 搜索按钮位置
     * <P>
     * 等同 {@link #setSearchBtnPos}
     * @param searchBtnPos
     */
    @JsonIgnore
    public PSDEForm searchbtnpos(String searchBtnPos){
        this.setSearchBtnPos(searchBtnPos);
        return this;
    }

     /**
     * 设置 搜索按钮位置
     * <P>
     * 等同 {@link #setSearchBtnPos}
     * @param searchBtnPos
     */
    @JsonIgnore
    public PSDEForm searchbtnpos(net.ibizsys.psmodel.core.util.PSModelEnums.SearchFormButtonPos searchBtnPos){
        if(searchBtnPos == null){
            this.setSearchBtnPos(null);
        }
        else{
            this.setSearchBtnPos(searchBtnPos.value);
        }
        return this;
    }

    /**
     * <B>SEARCHBTNSTYLE</B>&nbsp;搜索按钮样式，搜索表单的搜索按钮样式，未定义时为【默认】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SearchFormButtonStyle} 
     */
    public final static String FIELD_SEARCHBTNSTYLE = "searchbtnstyle";

    /**
     * 设置 搜索按钮样式，详细说明：{@link #FIELD_SEARCHBTNSTYLE}
     * 
     * @param searchBtnStyle
     * 
     */
    @JsonProperty(FIELD_SEARCHBTNSTYLE)
    public void setSearchBtnStyle(String searchBtnStyle){
        this.set(FIELD_SEARCHBTNSTYLE, searchBtnStyle);
    }
    
    /**
     * 获取 搜索按钮样式  
     * @return
     */
    @JsonIgnore
    public String getSearchBtnStyle(){
        Object objValue = this.get(FIELD_SEARCHBTNSTYLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 搜索按钮样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSearchBtnStyleDirty(){
        if(this.contains(FIELD_SEARCHBTNSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 搜索按钮样式
     */
    @JsonIgnore
    public void resetSearchBtnStyle(){
        this.reset(FIELD_SEARCHBTNSTYLE);
    }

    /**
     * 设置 搜索按钮样式，详细说明：{@link #FIELD_SEARCHBTNSTYLE}
     * <P>
     * 等同 {@link #setSearchBtnStyle}
     * @param searchBtnStyle
     */
    @JsonIgnore
    public PSDEForm searchbtnstyle(String searchBtnStyle){
        this.setSearchBtnStyle(searchBtnStyle);
        return this;
    }

     /**
     * 设置 搜索按钮样式，详细说明：{@link #FIELD_SEARCHBTNSTYLE}
     * <P>
     * 等同 {@link #setSearchBtnStyle}
     * @param searchBtnStyle
     */
    @JsonIgnore
    public PSDEForm searchbtnstyle(net.ibizsys.psmodel.core.util.PSModelEnums.SearchFormButtonStyle searchBtnStyle){
        if(searchBtnStyle == null){
            this.setSearchBtnStyle(null);
        }
        else{
            this.setSearchBtnStyle(searchBtnStyle.value);
        }
        return this;
    }

    /**
     * <B>SHOWTABHEADER</B>&nbsp;显示分页头部，是否输出表单的分页头部，未定义时如仅有一个表单分页为【否】，否则为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_SHOWTABHEADER = "showtabheader";

    /**
     * 设置 显示分页头部，详细说明：{@link #FIELD_SHOWTABHEADER}
     * 
     * @param showTabHeader
     * 
     */
    @JsonProperty(FIELD_SHOWTABHEADER)
    public void setShowTabHeader(Integer showTabHeader){
        this.set(FIELD_SHOWTABHEADER, showTabHeader);
    }
    
    /**
     * 获取 显示分页头部  
     * @return
     */
    @JsonIgnore
    public Integer getShowTabHeader(){
        Object objValue = this.get(FIELD_SHOWTABHEADER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 显示分页头部 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isShowTabHeaderDirty(){
        if(this.contains(FIELD_SHOWTABHEADER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 显示分页头部
     */
    @JsonIgnore
    public void resetShowTabHeader(){
        this.reset(FIELD_SHOWTABHEADER);
    }

    /**
     * 设置 显示分页头部，详细说明：{@link #FIELD_SHOWTABHEADER}
     * <P>
     * 等同 {@link #setShowTabHeader}
     * @param showTabHeader
     */
    @JsonIgnore
    public PSDEForm showtabheader(Integer showTabHeader){
        this.setShowTabHeader(showTabHeader);
        return this;
    }

     /**
     * 设置 显示分页头部，详细说明：{@link #FIELD_SHOWTABHEADER}
     * <P>
     * 等同 {@link #setShowTabHeader}
     * @param showTabHeader
     */
    @JsonIgnore
    public PSDEForm showtabheader(Boolean showTabHeader){
        if(showTabHeader == null){
            this.setShowTabHeader(null);
        }
        else{
            this.setShowTabHeader(showTabHeader?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>TABHEADERPOS</B>&nbsp;分页头部位置，表单分页头的位置，未定义时为【上方】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.TabHeaderPos} 
     */
    public final static String FIELD_TABHEADERPOS = "tabheaderpos";

    /**
     * 设置 分页头部位置，详细说明：{@link #FIELD_TABHEADERPOS}
     * 
     * @param tabHeaderPos
     * 
     */
    @JsonProperty(FIELD_TABHEADERPOS)
    public void setTabHeaderPos(String tabHeaderPos){
        this.set(FIELD_TABHEADERPOS, tabHeaderPos);
    }
    
    /**
     * 获取 分页头部位置  
     * @return
     */
    @JsonIgnore
    public String getTabHeaderPos(){
        Object objValue = this.get(FIELD_TABHEADERPOS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分页头部位置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTabHeaderPosDirty(){
        if(this.contains(FIELD_TABHEADERPOS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分页头部位置
     */
    @JsonIgnore
    public void resetTabHeaderPos(){
        this.reset(FIELD_TABHEADERPOS);
    }

    /**
     * 设置 分页头部位置，详细说明：{@link #FIELD_TABHEADERPOS}
     * <P>
     * 等同 {@link #setTabHeaderPos}
     * @param tabHeaderPos
     */
    @JsonIgnore
    public PSDEForm tabheaderpos(String tabHeaderPos){
        this.setTabHeaderPos(tabHeaderPos);
        return this;
    }

     /**
     * 设置 分页头部位置，详细说明：{@link #FIELD_TABHEADERPOS}
     * <P>
     * 等同 {@link #setTabHeaderPos}
     * @param tabHeaderPos
     */
    @JsonIgnore
    public PSDEForm tabheaderpos(net.ibizsys.psmodel.core.util.PSModelEnums.TabHeaderPos tabHeaderPos){
        if(tabHeaderPos == null){
            this.setTabHeaderPos(null);
        }
        else{
            this.setTabHeaderPos(tabHeaderPos.value);
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
    public PSDEForm updatedate(String updateDate){
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
    public PSDEForm updateman(String updateMan){
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
    public PSDEForm updatepsdeactionid(String updatePSDEActionId){
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
    public PSDEForm updatepsdeactionid(PSDEAction pSDEAction){
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
    public PSDEForm updatepsdeactionname(String updatePSDEActionName){
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
    public PSDEForm user2psdeactionid(String user2PSDEActionId){
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
    public PSDEForm user2psdeactionid(PSDEAction pSDEAction){
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
    public PSDEForm user2psdeactionname(String user2PSDEActionName){
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
    public PSDEForm userparams(String userParams){
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
    public PSDEForm userpsdeactionid(String userPSDEActionId){
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
    public PSDEForm userpsdeactionid(PSDEAction pSDEAction){
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
    public PSDEForm userpsdeactionname(String userPSDEActionName){
        this.setUserPSDEActionName(userPSDEActionName);
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
    public PSDEForm usertag(String userTag){
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
    public PSDEForm usertag2(String userTag2){
        this.setUserTag2(userTag2);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEFormId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEFormId(strValue);
    }

    @JsonIgnore
    public PSDEForm id(String strValue){
        this.setPSDEFormId(strValue);
        return this;
    }


    /**
     *  表单成员 成员集合
     */
    public final static String FIELD_PSDEFORMDETAILS = "psdeformdetails";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSDEFormDetail> psdeformdetails;

    /**
     * 获取 表单成员 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEFORMDETAILS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEFormDetail> getPSDEFormDetails(){
        return this.psdeformdetails;
    }

    /**
     * 设置 表单成员 成员集合  
     * @param psdeformdetails
     */
    @JsonProperty(FIELD_PSDEFORMDETAILS)
    public void setPSDEFormDetails(java.util.List<net.ibizsys.psmodel.core.domain.PSDEFormDetail> psdeformdetails){
        this.psdeformdetails = psdeformdetails;
    }

    /**
     * 获取 表单成员 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEFormDetail> getPSDEFormDetailsIf(){
        if(this.psdeformdetails == null){
            this.psdeformdetails = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSDEFormDetail>();          
        }
        return this.psdeformdetails;
    }


    /**
     *  实体表单引用 成员集合
     */
    public final static String FIELD_PSDEFORMRVES = "psdeformrves";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSDEFormRF> psdeformrves;

    /**
     * 获取 实体表单引用 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEFORMRVES)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEFormRF> getPSDEFormRves(){
        return this.psdeformrves;
    }

    /**
     * 设置 实体表单引用 成员集合  
     * @param psdeformrves
     */
    @JsonProperty(FIELD_PSDEFORMRVES)
    public void setPSDEFormRves(java.util.List<net.ibizsys.psmodel.core.domain.PSDEFormRF> psdeformrves){
        this.psdeformrves = psdeformrves;
    }

    /**
     * 获取 实体表单引用 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEFormRF> getPSDEFormRvesIf(){
        if(this.psdeformrves == null){
            this.psdeformrves = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSDEFormRF>();          
        }
        return this.psdeformrves;
    }


    /**
     *  实体表单项更新 成员集合
     */
    public final static String FIELD_PSDEFIUPDATES = "psdefiupdates";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSDEFIUpdate> psdefiupdates;

    /**
     * 获取 实体表单项更新 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEFIUPDATES)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEFIUpdate> getPSDEFIUpdates(){
        return this.psdefiupdates;
    }

    /**
     * 设置 实体表单项更新 成员集合  
     * @param psdefiupdates
     */
    @JsonProperty(FIELD_PSDEFIUPDATES)
    public void setPSDEFIUpdates(java.util.List<net.ibizsys.psmodel.core.domain.PSDEFIUpdate> psdefiupdates){
        this.psdefiupdates = psdefiupdates;
    }

    /**
     * 获取 实体表单项更新 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEFIUpdate> getPSDEFIUpdatesIf(){
        if(this.psdefiupdates == null){
            this.psdefiupdates = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSDEFIUpdate>();          
        }
        return this.psdefiupdates;
    }


    /**
     *  实体表单项值规则 成员集合
     */
    public final static String FIELD_PSDEFIVRS = "psdefivrs";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSDEFIVR> psdefivrs;

    /**
     * 获取 实体表单项值规则 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEFIVRS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEFIVR> getPSDEFIVRs(){
        return this.psdefivrs;
    }

    /**
     * 设置 实体表单项值规则 成员集合  
     * @param psdefivrs
     */
    @JsonProperty(FIELD_PSDEFIVRS)
    public void setPSDEFIVRs(java.util.List<net.ibizsys.psmodel.core.domain.PSDEFIVR> psdefivrs){
        this.psdefivrs = psdefivrs;
    }

    /**
     * 获取 实体表单项值规则 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEFIVR> getPSDEFIVRsIf(){
        if(this.psdefivrs == null){
            this.psdefivrs = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSDEFIVR>();          
        }
        return this.psdefivrs;
    }


    /**
     *  实体表单逻辑 成员集合
     */
    public final static String FIELD_PSDEFORMLOGICS = "psdeformlogics";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSDEFormLogic> psdeformlogics;

    /**
     * 获取 实体表单逻辑 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEFORMLOGICS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEFormLogic> getPSDEFormLogics(){
        return this.psdeformlogics;
    }

    /**
     * 设置 实体表单逻辑 成员集合  
     * @param psdeformlogics
     */
    @JsonProperty(FIELD_PSDEFORMLOGICS)
    public void setPSDEFormLogics(java.util.List<net.ibizsys.psmodel.core.domain.PSDEFormLogic> psdeformlogics){
        this.psdeformlogics = psdeformlogics;
    }

    /**
     * 获取 实体表单逻辑 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEFormLogic> getPSDEFormLogicsIf(){
        if(this.psdeformlogics == null){
            this.psdeformlogics = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSDEFormLogic>();          
        }
        return this.psdeformlogics;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEForm){
            PSDEForm model = (PSDEForm)iPSModel;
            model.setPSDEFormDetails(this.getPSDEFormDetails());
            model.setPSDEFormRves(this.getPSDEFormRves());
            model.setPSDEFIUpdates(this.getPSDEFIUpdates());
            model.setPSDEFIVRs(this.getPSDEFIVRs());
            model.setPSDEFormLogics(this.getPSDEFormLogics());
        }
        super.copyTo(iPSModel);
    }
}
