package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSVIEWPANELMODEL</B>系统面板数据模型 模型传输对象
 * <P>
 * 系统面板部件的数据项模型，定义面板部件的上下文数据对象信息，包括了键名、数据类型等。面板属性项就是绑定面板上下文数据的属性，面板成员的动态控制逻辑也基于面板上下文进行计算
 */
public class PSSysViewPanelModelDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysViewPanelModelDTO(){
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定面板部件模型项的代码标识，需在所在面板部件中具备唯一性
     * <P>
     * 字符串：最大长度 20，由字母、数字、下划线组成，且开始必须为字母
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
    public PSSysViewPanelModelDTO codename(String codeName){
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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setCreateDate(Timestamp createDate){
        this.set(FIELD_CREATEDATE, createDate);
    }
    
    /**
     * 获取 建立时间  
     * @return
     */
    @JsonIgnore
    public Timestamp getCreateDate(){
        Object objValue = this.get(FIELD_CREATEDATE);
        if(objValue==null){
            return null;
        }
        return (Timestamp)objValue;
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
    public PSSysViewPanelModelDTO createdate(Timestamp createDate){
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
    public PSSysViewPanelModelDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CTRLMODELNAME</B>&nbsp;部件模型名称
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_CTRLMODELNAME = "ctrlmodelname";

    /**
     * 设置 部件模型名称
     * 
     * @param ctrlModelName
     * 
     */
    @JsonProperty(FIELD_CTRLMODELNAME)
    public void setCtrlModelName(String ctrlModelName){
        this.set(FIELD_CTRLMODELNAME, ctrlModelName);
    }
    
    /**
     * 获取 部件模型名称  
     * @return
     */
    @JsonIgnore
    public String getCtrlModelName(){
        Object objValue = this.get(FIELD_CTRLMODELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件模型名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlModelNameDirty(){
        if(this.contains(FIELD_CTRLMODELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件模型名称
     */
    @JsonIgnore
    public void resetCtrlModelName(){
        this.reset(FIELD_CTRLMODELNAME);
    }

    /**
     * 设置 部件模型名称
     * <P>
     * 等同 {@link #setCtrlModelName}
     * @param ctrlModelName
     */
    @JsonIgnore
    public PSSysViewPanelModelDTO ctrlmodelname(String ctrlModelName){
        this.setCtrlModelName(ctrlModelName);
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
    public PSSysViewPanelModelDTO customcode(String customCode){
        this.setCustomCode(customCode);
        return this;
    }

    /**
     * <B>CUSTOMMODE</B>&nbsp;脚本代码模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_CUSTOMMODE = "custommode";

    /**
     * 设置 脚本代码模式
     * 
     * @param customMode
     * 
     */
    @JsonProperty(FIELD_CUSTOMMODE)
    public void setCustomMode(Integer customMode){
        this.set(FIELD_CUSTOMMODE, customMode);
    }
    
    /**
     * 获取 脚本代码模式  
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
     * 判断 脚本代码模式 是否指定值，包括空值
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
     * 重置 脚本代码模式
     */
    @JsonIgnore
    public void resetCustomMode(){
        this.reset(FIELD_CUSTOMMODE);
    }

    /**
     * 设置 脚本代码模式
     * <P>
     * 等同 {@link #setCustomMode}
     * @param customMode
     */
    @JsonIgnore
    public PSSysViewPanelModelDTO custommode(Integer customMode){
        this.setCustomMode(customMode);
        return this;
    }

     /**
     * 设置 脚本代码模式
     * <P>
     * 等同 {@link #setCustomMode}
     * @param customMode
     */
    @JsonIgnore
    public PSSysViewPanelModelDTO custommode(Boolean customMode){
        if(customMode == null){
            this.setCustomMode(null);
        }
        else{
            this.setCustomMode(customMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DATATYPE</B>&nbsp;数据类型，指定面板部件模型项的数据类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.CtrlModelDataType} 
     */
    public final static String FIELD_DATATYPE = "datatype";

    /**
     * 设置 数据类型，详细说明：{@link #FIELD_DATATYPE}
     * 
     * @param dataType
     * 
     */
    @JsonProperty(FIELD_DATATYPE)
    public void setDataType(String dataType){
        this.set(FIELD_DATATYPE, dataType);
    }
    
    /**
     * 获取 数据类型  
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
     * 判断 数据类型 是否指定值，包括空值
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
     * 重置 数据类型
     */
    @JsonIgnore
    public void resetDataType(){
        this.reset(FIELD_DATATYPE);
    }

    /**
     * 设置 数据类型，详细说明：{@link #FIELD_DATATYPE}
     * <P>
     * 等同 {@link #setDataType}
     * @param dataType
     */
    @JsonIgnore
    public PSSysViewPanelModelDTO datatype(String dataType){
        this.setDataType(dataType);
        return this;
    }

     /**
     * 设置 数据类型，详细说明：{@link #FIELD_DATATYPE}
     * <P>
     * 等同 {@link #setDataType}
     * @param dataType
     */
    @JsonIgnore
    public PSSysViewPanelModelDTO datatype(net.ibizsys.model.PSModelEnums.CtrlModelDataType dataType){
        if(dataType == null){
            this.setDataType(null);
        }
        else{
            this.setDataType(dataType.value);
        }
        return this;
    }

    /**
     * <B>MEMO</B>&nbsp;备注
     * <P>
     * 字符串：最大长度 1000
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
    public PSSysViewPanelModelDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MODELTAG</B>&nbsp;模型标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_MODELTAG = "modeltag";

    /**
     * 设置 模型标记
     * 
     * @param modelTag
     * 
     */
    @JsonProperty(FIELD_MODELTAG)
    public void setModelTag(String modelTag){
        this.set(FIELD_MODELTAG, modelTag);
    }
    
    /**
     * 获取 模型标记  
     * @return
     */
    @JsonIgnore
    public String getModelTag(){
        Object objValue = this.get(FIELD_MODELTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模型标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isModelTagDirty(){
        if(this.contains(FIELD_MODELTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模型标记
     */
    @JsonIgnore
    public void resetModelTag(){
        this.reset(FIELD_MODELTAG);
    }

    /**
     * 设置 模型标记
     * <P>
     * 等同 {@link #setModelTag}
     * @param modelTag
     */
    @JsonIgnore
    public PSSysViewPanelModelDTO modeltag(String modelTag){
        this.setModelTag(modelTag);
        return this;
    }

    /**
     * <B>MODELTAG2</B>&nbsp;模型标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_MODELTAG2 = "modeltag2";

    /**
     * 设置 模型标记2
     * 
     * @param modelTag2
     * 
     */
    @JsonProperty(FIELD_MODELTAG2)
    public void setModelTag2(String modelTag2){
        this.set(FIELD_MODELTAG2, modelTag2);
    }
    
    /**
     * 获取 模型标记2  
     * @return
     */
    @JsonIgnore
    public String getModelTag2(){
        Object objValue = this.get(FIELD_MODELTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模型标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isModelTag2Dirty(){
        if(this.contains(FIELD_MODELTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模型标记2
     */
    @JsonIgnore
    public void resetModelTag2(){
        this.reset(FIELD_MODELTAG2);
    }

    /**
     * 设置 模型标记2
     * <P>
     * 等同 {@link #setModelTag2}
     * @param modelTag2
     */
    @JsonIgnore
    public PSSysViewPanelModelDTO modeltag2(String modelTag2){
        this.setModelTag2(modelTag2);
        return this;
    }

    /**
     * <B>MODELTYPE</B>&nbsp;模型类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.PanelModelType} 
     */
    public final static String FIELD_MODELTYPE = "modeltype";

    /**
     * 设置 模型类型
     * 
     * @param modelType
     * 
     */
    @JsonProperty(FIELD_MODELTYPE)
    public void setModelType(String modelType){
        this.set(FIELD_MODELTYPE, modelType);
    }
    
    /**
     * 获取 模型类型  
     * @return
     */
    @JsonIgnore
    public String getModelType(){
        Object objValue = this.get(FIELD_MODELTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模型类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isModelTypeDirty(){
        if(this.contains(FIELD_MODELTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模型类型
     */
    @JsonIgnore
    public void resetModelType(){
        this.reset(FIELD_MODELTYPE);
    }

    /**
     * 设置 模型类型
     * <P>
     * 等同 {@link #setModelType}
     * @param modelType
     */
    @JsonIgnore
    public PSSysViewPanelModelDTO modeltype(String modelType){
        this.setModelType(modelType);
        return this;
    }

     /**
     * 设置 模型类型
     * <P>
     * 等同 {@link #setModelType}
     * @param modelType
     */
    @JsonIgnore
    public PSSysViewPanelModelDTO modeltype(net.ibizsys.model.PSModelEnums.PanelModelType modelType){
        if(modelType == null){
            this.setModelType(null);
        }
        else{
            this.setModelType(modelType.value);
        }
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELID</B>&nbsp;系统动态模型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysDynaModelDTO} 
     */
    public final static String FIELD_PSSYSDYNAMODELID = "pssysdynamodelid";

    /**
     * 设置 系统动态模型
     * 
     * @param pSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELID)
    public void setPSSysDynaModelId(String pSSysDynaModelId){
        this.set(FIELD_PSSYSDYNAMODELID, pSSysDynaModelId);
    }
    
    /**
     * 获取 系统动态模型  
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
     * 判断 系统动态模型 是否指定值，包括空值
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
     * 重置 系统动态模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelId(){
        this.reset(FIELD_PSSYSDYNAMODELID);
    }

    /**
     * 设置 系统动态模型
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModelId
     */
    @JsonIgnore
    public PSSysViewPanelModelDTO pssysdynamodelid(String pSSysDynaModelId){
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    /**
     * 设置 系统动态模型，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModel 引用对象
     */
    @JsonIgnore
    public PSSysViewPanelModelDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel){
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
     * <B>PSSYSDYNAMODELNAME</B>&nbsp;系统动态模型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDYNAMODELID}
     */
    public final static String FIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";

    /**
     * 设置 系统动态模型
     * 
     * @param pSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELNAME)
    public void setPSSysDynaModelName(String pSSysDynaModelName){
        this.set(FIELD_PSSYSDYNAMODELNAME, pSSysDynaModelName);
    }
    
    /**
     * 获取 系统动态模型  
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
     * 判断 系统动态模型 是否指定值，包括空值
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
     * 重置 系统动态模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelName(){
        this.reset(FIELD_PSSYSDYNAMODELNAME);
    }

    /**
     * 设置 系统动态模型
     * <P>
     * 等同 {@link #setPSSysDynaModelName}
     * @param pSSysDynaModelName
     */
    @JsonIgnore
    public PSSysViewPanelModelDTO pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELID</B>&nbsp;系统面板
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysViewPanelDTO} 
     */
    public final static String FIELD_PSSYSVIEWPANELID = "pssysviewpanelid";

    /**
     * 设置 系统面板
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
     * 设置 系统面板
     * <P>
     * 等同 {@link #setPSSysViewPanelId}
     * @param pSSysViewPanelId
     */
    @JsonIgnore
    public PSSysViewPanelModelDTO pssysviewpanelid(String pSSysViewPanelId){
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
    public PSSysViewPanelModelDTO pssysviewpanelid(PSSysViewPanelDTO pSSysViewPanel){
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
     * <B>PSSYSVIEWPANELITEMID</B>&nbsp;面板项
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysViewPanelItemDTO} 
     */
    public final static String FIELD_PSSYSVIEWPANELITEMID = "pssysviewpanelitemid";

    /**
     * 设置 面板项
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
     * 设置 面板项
     * <P>
     * 等同 {@link #setPSSysViewPanelItemId}
     * @param pSSysViewPanelItemId
     */
    @JsonIgnore
    public PSSysViewPanelModelDTO pssysviewpanelitemid(String pSSysViewPanelItemId){
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
    public PSSysViewPanelModelDTO pssysviewpanelitemid(PSSysViewPanelItemDTO pSSysViewPanelItem){
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
     * <B>PSSYSVIEWPANELITEMNAME</B>&nbsp;面板项
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSVIEWPANELITEMID}
     */
    public final static String FIELD_PSSYSVIEWPANELITEMNAME = "pssysviewpanelitemname";

    /**
     * 设置 面板项
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
     * 设置 面板项
     * <P>
     * 等同 {@link #setPSSysViewPanelItemName}
     * @param pSSysViewPanelItemName
     */
    @JsonIgnore
    public PSSysViewPanelModelDTO pssysviewpanelitemname(String pSSysViewPanelItemName){
        this.setPSSysViewPanelItemName(pSSysViewPanelItemName);
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELMODELID</B>&nbsp;系统面板逻辑标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSVIEWPANELMODELID = "pssysviewpanelmodelid";

    /**
     * 设置 系统面板逻辑标识
     * 
     * @param pSSysViewPanelModelId
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELMODELID)
    public void setPSSysViewPanelModelId(String pSSysViewPanelModelId){
        this.set(FIELD_PSSYSVIEWPANELMODELID, pSSysViewPanelModelId);
    }
    
    /**
     * 获取 系统面板逻辑标识  
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
     * 判断 系统面板逻辑标识 是否指定值，包括空值
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
     * 重置 系统面板逻辑标识
     */
    @JsonIgnore
    public void resetPSSysViewPanelModelId(){
        this.reset(FIELD_PSSYSVIEWPANELMODELID);
    }

    /**
     * 设置 系统面板逻辑标识
     * <P>
     * 等同 {@link #setPSSysViewPanelModelId}
     * @param pSSysViewPanelModelId
     */
    @JsonIgnore
    public PSSysViewPanelModelDTO pssysviewpanelmodelid(String pSSysViewPanelModelId){
        this.setPSSysViewPanelModelId(pSSysViewPanelModelId);
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELMODELNAME</B>&nbsp;名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSVIEWPANELMODELNAME = "pssysviewpanelmodelname";

    /**
     * 设置 名称
     * 
     * @param pSSysViewPanelModelName
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELMODELNAME)
    public void setPSSysViewPanelModelName(String pSSysViewPanelModelName){
        this.set(FIELD_PSSYSVIEWPANELMODELNAME, pSSysViewPanelModelName);
    }
    
    /**
     * 获取 名称  
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
     * 判断 名称 是否指定值，包括空值
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
     * 重置 名称
     */
    @JsonIgnore
    public void resetPSSysViewPanelModelName(){
        this.reset(FIELD_PSSYSVIEWPANELMODELNAME);
    }

    /**
     * 设置 名称
     * <P>
     * 等同 {@link #setPSSysViewPanelModelName}
     * @param pSSysViewPanelModelName
     */
    @JsonIgnore
    public PSSysViewPanelModelDTO pssysviewpanelmodelname(String pSSysViewPanelModelName){
        this.setPSSysViewPanelModelName(pSSysViewPanelModelName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysViewPanelModelName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysViewPanelModelName(strName);
    }

    @JsonIgnore
    public PSSysViewPanelModelDTO name(String strName){
        this.setPSSysViewPanelModelName(strName);
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELNAME</B>&nbsp;系统面板
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSVIEWPANELID}
     */
    public final static String FIELD_PSSYSVIEWPANELNAME = "pssysviewpanelname";

    /**
     * 设置 系统面板
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
     * 设置 系统面板
     * <P>
     * 等同 {@link #setPSSysViewPanelName}
     * @param pSSysViewPanelName
     */
    @JsonIgnore
    public PSSysViewPanelModelDTO pssysviewpanelname(String pSSysViewPanelName){
        this.setPSSysViewPanelName(pSSysViewPanelName);
        return this;
    }

    /**
     * <B>REFFIELDNAME</B>&nbsp;引用属性名称
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_REFFIELDNAME = "reffieldname";

    /**
     * 设置 引用属性名称
     * 
     * @param refFieldName
     * 
     */
    @JsonProperty(FIELD_REFFIELDNAME)
    public void setRefFieldName(String refFieldName){
        this.set(FIELD_REFFIELDNAME, refFieldName);
    }
    
    /**
     * 获取 引用属性名称  
     * @return
     */
    @JsonIgnore
    public String getRefFieldName(){
        Object objValue = this.get(FIELD_REFFIELDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用属性名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefFieldNameDirty(){
        if(this.contains(FIELD_REFFIELDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用属性名称
     */
    @JsonIgnore
    public void resetRefFieldName(){
        this.reset(FIELD_REFFIELDNAME);
    }

    /**
     * 设置 引用属性名称
     * <P>
     * 等同 {@link #setRefFieldName}
     * @param refFieldName
     */
    @JsonIgnore
    public PSSysViewPanelModelDTO reffieldname(String refFieldName){
        this.setRefFieldName(refFieldName);
        return this;
    }

    /**
     * <B>REFMODELNAME</B>&nbsp;引用模型名称
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_REFMODELNAME = "refmodelname";

    /**
     * 设置 引用模型名称
     * 
     * @param refModelName
     * 
     */
    @JsonProperty(FIELD_REFMODELNAME)
    public void setRefModelName(String refModelName){
        this.set(FIELD_REFMODELNAME, refModelName);
    }
    
    /**
     * 获取 引用模型名称  
     * @return
     */
    @JsonIgnore
    public String getRefModelName(){
        Object objValue = this.get(FIELD_REFMODELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用模型名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefModelNameDirty(){
        if(this.contains(FIELD_REFMODELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用模型名称
     */
    @JsonIgnore
    public void resetRefModelName(){
        this.reset(FIELD_REFMODELNAME);
    }

    /**
     * 设置 引用模型名称
     * <P>
     * 等同 {@link #setRefModelName}
     * @param refModelName
     */
    @JsonIgnore
    public PSSysViewPanelModelDTO refmodelname(String refModelName){
        this.setRefModelName(refModelName);
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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setUpdateDate(Timestamp updateDate){
        this.set(FIELD_UPDATEDATE, updateDate);
    }
    
    /**
     * 获取 更新时间  
     * @return
     */
    @JsonIgnore
    public Timestamp getUpdateDate(){
        Object objValue = this.get(FIELD_UPDATEDATE);
        if(objValue==null){
            return null;
        }
        return (Timestamp)objValue;
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
    public PSSysViewPanelModelDTO updatedate(Timestamp updateDate){
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
    public PSSysViewPanelModelDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>USERCAT</B>&nbsp;用户分类
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.ModelUserCat} 
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
    public PSSysViewPanelModelDTO usercat(String userCat){
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
    public PSSysViewPanelModelDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSSysViewPanelModelDTO usertag(String userTag){
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
    public PSSysViewPanelModelDTO usertag2(String userTag2){
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
    public PSSysViewPanelModelDTO usertag3(String userTag3){
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
    public PSSysViewPanelModelDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>VIEWMODELNAME</B>&nbsp;视图模型名称
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_VIEWMODELNAME = "viewmodelname";

    /**
     * 设置 视图模型名称
     * 
     * @param viewModelName
     * 
     */
    @JsonProperty(FIELD_VIEWMODELNAME)
    public void setViewModelName(String viewModelName){
        this.set(FIELD_VIEWMODELNAME, viewModelName);
    }
    
    /**
     * 获取 视图模型名称  
     * @return
     */
    @JsonIgnore
    public String getViewModelName(){
        Object objValue = this.get(FIELD_VIEWMODELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图模型名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewModelNameDirty(){
        if(this.contains(FIELD_VIEWMODELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图模型名称
     */
    @JsonIgnore
    public void resetViewModelName(){
        this.reset(FIELD_VIEWMODELNAME);
    }

    /**
     * 设置 视图模型名称
     * <P>
     * 等同 {@link #setViewModelName}
     * @param viewModelName
     */
    @JsonIgnore
    public PSSysViewPanelModelDTO viewmodelname(String viewModelName){
        this.setViewModelName(viewModelName);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSSysViewPanelModelId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysViewPanelModelId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysViewPanelModelId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysViewPanelModelId(strValue);
    }

    @JsonIgnore
    public PSSysViewPanelModelDTO id(String strValue){
        this.setPSSysViewPanelModelId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysViewPanelModelDTO){
            PSSysViewPanelModelDTO dto = (PSSysViewPanelModelDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
