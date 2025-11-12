package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDESAMPLEDATA</B>实体示例数据 模型传输对象
 * <P>
 * 实体示例数据模型，定义实体用于演示或测试用途的数据，包括关联的主状态及随机参数等
 */
public class PSDESampleData extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDESampleData(){
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定实体示例数据的代码标识，需在所属的实体中具备唯一性
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
    public PSDESampleData codename(String codeName){
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
    public PSDESampleData createdate(String createDate){
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
    public PSDESampleData createman(String createMan){
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
    public PSDESampleData customcode(String customCode){
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
    public PSDESampleData custommode(Integer customMode){
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
    public PSDESampleData custommode(Boolean customMode){
        if(customMode == null){
            this.setCustomMode(null);
        }
        else{
            this.setCustomMode(customMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DATA</B>&nbsp;数据，指定示例数据
     */
    public final static String FIELD_DATA = "data";

    /**
     * 设置 数据，详细说明：{@link #FIELD_DATA}
     * 
     * @param data
     * 
     */
    @JsonProperty(FIELD_DATA)
    public void setData(String data){
        this.set(FIELD_DATA, data);
    }
    
    /**
     * 获取 数据  
     * @return
     */
    @JsonIgnore
    public String getData(){
        Object objValue = this.get(FIELD_DATA);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDataDirty(){
        if(this.contains(FIELD_DATA)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据
     */
    @JsonIgnore
    public void resetData(){
        this.reset(FIELD_DATA);
    }

    /**
     * 设置 数据，详细说明：{@link #FIELD_DATA}
     * <P>
     * 等同 {@link #setData}
     * @param data
     */
    @JsonIgnore
    public PSDESampleData data(String data){
        this.setData(data);
        return this;
    }

    /**
     * <B>DATA2</B>&nbsp;数据2
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_DATA2 = "data2";

    /**
     * 设置 数据2
     * 
     * @param data2
     * 
     */
    @JsonProperty(FIELD_DATA2)
    public void setData2(String data2){
        this.set(FIELD_DATA2, data2);
    }
    
    /**
     * 获取 数据2  
     * @return
     */
    @JsonIgnore
    public String getData2(){
        Object objValue = this.get(FIELD_DATA2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isData2Dirty(){
        if(this.contains(FIELD_DATA2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据2
     */
    @JsonIgnore
    public void resetData2(){
        this.reset(FIELD_DATA2);
    }

    /**
     * 设置 数据2
     * <P>
     * 等同 {@link #setData2}
     * @param data2
     */
    @JsonIgnore
    public PSDESampleData data2(String data2){
        this.setData2(data2);
        return this;
    }

    /**
     * <B>DATATYPE</B>&nbsp;数据类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SampleDataType} 
     */
    public final static String FIELD_DATATYPE = "datatype";

    /**
     * 设置 数据类型
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
     * 设置 数据类型
     * <P>
     * 等同 {@link #setDataType}
     * @param dataType
     */
    @JsonIgnore
    public PSDESampleData datatype(String dataType){
        this.setDataType(dataType);
        return this;
    }

     /**
     * 设置 数据类型
     * <P>
     * 等同 {@link #setDataType}
     * @param dataType
     */
    @JsonIgnore
    public PSDESampleData datatype(net.ibizsys.psmodel.core.util.PSModelEnums.SampleDataType dataType){
        if(dataType == null){
            this.setDataType(null);
        }
        else{
            this.setDataType(dataType.value);
        }
        return this;
    }

    /**
     * <B>LOGICMODE</B>&nbsp;逻辑模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SampleDataLogicMode} 
     */
    public final static String FIELD_LOGICMODE = "logicmode";

    /**
     * 设置 逻辑模式
     * 
     * @param logicMode
     * 
     */
    @JsonProperty(FIELD_LOGICMODE)
    public void setLogicMode(String logicMode){
        this.set(FIELD_LOGICMODE, logicMode);
    }
    
    /**
     * 获取 逻辑模式  
     * @return
     */
    @JsonIgnore
    public String getLogicMode(){
        Object objValue = this.get(FIELD_LOGICMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 逻辑模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLogicModeDirty(){
        if(this.contains(FIELD_LOGICMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 逻辑模式
     */
    @JsonIgnore
    public void resetLogicMode(){
        this.reset(FIELD_LOGICMODE);
    }

    /**
     * 设置 逻辑模式
     * <P>
     * 等同 {@link #setLogicMode}
     * @param logicMode
     */
    @JsonIgnore
    public PSDESampleData logicmode(String logicMode){
        this.setLogicMode(logicMode);
        return this;
    }

     /**
     * 设置 逻辑模式
     * <P>
     * 等同 {@link #setLogicMode}
     * @param logicMode
     */
    @JsonIgnore
    public PSDESampleData logicmode(net.ibizsys.psmodel.core.util.PSModelEnums.SampleDataLogicMode logicMode){
        if(logicMode == null){
            this.setLogicMode(null);
        }
        else{
            this.setLogicMode(logicMode.value);
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
    public PSDESampleData memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定实体示例数据所属的实体
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
    public PSDESampleData psdeid(String pSDEId){
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
    public PSDESampleData psdeid(PSDataEntity pSDataEntity){
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
     * <B>PSDEMAINSTATEID</B>&nbsp;实体主状态，指定实体示例数据相关的实体主状态
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEMainState} 
     */
    public final static String FIELD_PSDEMAINSTATEID = "psdemainstateid";

    /**
     * 设置 实体主状态，详细说明：{@link #FIELD_PSDEMAINSTATEID}
     * 
     * @param pSDEMainStateId
     * 
     */
    @JsonProperty(FIELD_PSDEMAINSTATEID)
    public void setPSDEMainStateId(String pSDEMainStateId){
        this.set(FIELD_PSDEMAINSTATEID, pSDEMainStateId);
    }
    
    /**
     * 获取 实体主状态  
     * @return
     */
    @JsonIgnore
    public String getPSDEMainStateId(){
        Object objValue = this.get(FIELD_PSDEMAINSTATEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体主状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEMainStateIdDirty(){
        if(this.contains(FIELD_PSDEMAINSTATEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体主状态
     */
    @JsonIgnore
    public void resetPSDEMainStateId(){
        this.reset(FIELD_PSDEMAINSTATEID);
    }

    /**
     * 设置 实体主状态，详细说明：{@link #FIELD_PSDEMAINSTATEID}
     * <P>
     * 等同 {@link #setPSDEMainStateId}
     * @param pSDEMainStateId
     */
    @JsonIgnore
    public PSDESampleData psdemainstateid(String pSDEMainStateId){
        this.setPSDEMainStateId(pSDEMainStateId);
        return this;
    }

    /**
     * 设置 实体主状态，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEMainStateId}
     * @param pSDEMainState 引用对象
     */
    @JsonIgnore
    public PSDESampleData psdemainstateid(PSDEMainState pSDEMainState){
        if(pSDEMainState == null){
            this.setPSDEMainStateId(null);
            this.setPSDEMainStateName(null);
        }
        else{
            this.setPSDEMainStateId(pSDEMainState.getPSDEMainStateId());
            this.setPSDEMainStateName(pSDEMainState.getPSDEMainStateName());
        }
        return this;
    }

    /**
     * <B>PSDEMAINSTATENAME</B>&nbsp;实体主状态，指定实体示例数据相关的实体主状态
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEMAINSTATEID}
     */
    public final static String FIELD_PSDEMAINSTATENAME = "psdemainstatename";

    /**
     * 设置 实体主状态，详细说明：{@link #FIELD_PSDEMAINSTATENAME}
     * 
     * @param pSDEMainStateName
     * 
     */
    @JsonProperty(FIELD_PSDEMAINSTATENAME)
    public void setPSDEMainStateName(String pSDEMainStateName){
        this.set(FIELD_PSDEMAINSTATENAME, pSDEMainStateName);
    }
    
    /**
     * 获取 实体主状态  
     * @return
     */
    @JsonIgnore
    public String getPSDEMainStateName(){
        Object objValue = this.get(FIELD_PSDEMAINSTATENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体主状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEMainStateNameDirty(){
        if(this.contains(FIELD_PSDEMAINSTATENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体主状态
     */
    @JsonIgnore
    public void resetPSDEMainStateName(){
        this.reset(FIELD_PSDEMAINSTATENAME);
    }

    /**
     * 设置 实体主状态，详细说明：{@link #FIELD_PSDEMAINSTATENAME}
     * <P>
     * 等同 {@link #setPSDEMainStateName}
     * @param pSDEMainStateName
     */
    @JsonIgnore
    public PSDESampleData psdemainstatename(String pSDEMainStateName){
        this.setPSDEMainStateName(pSDEMainStateName);
        return this;
    }

    /**
     * <B>PSDENAME</B>&nbsp;实体，指定实体示例数据所属的实体
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
    public PSDESampleData psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSDESAMPLEDATAID</B>&nbsp;实体示例数据标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDESAMPLEDATAID = "psdesampledataid";

    /**
     * 设置 实体示例数据标识
     * 
     * @param pSDESampleDataId
     * 
     */
    @JsonProperty(FIELD_PSDESAMPLEDATAID)
    public void setPSDESampleDataId(String pSDESampleDataId){
        this.set(FIELD_PSDESAMPLEDATAID, pSDESampleDataId);
    }
    
    /**
     * 获取 实体示例数据标识  
     * @return
     */
    @JsonIgnore
    public String getPSDESampleDataId(){
        Object objValue = this.get(FIELD_PSDESAMPLEDATAID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体示例数据标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDESampleDataIdDirty(){
        if(this.contains(FIELD_PSDESAMPLEDATAID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体示例数据标识
     */
    @JsonIgnore
    public void resetPSDESampleDataId(){
        this.reset(FIELD_PSDESAMPLEDATAID);
    }

    /**
     * 设置 实体示例数据标识
     * <P>
     * 等同 {@link #setPSDESampleDataId}
     * @param pSDESampleDataId
     */
    @JsonIgnore
    public PSDESampleData psdesampledataid(String pSDESampleDataId){
        this.setPSDESampleDataId(pSDESampleDataId);
        return this;
    }

    /**
     * <B>PSDESAMPLEDATANAME</B>&nbsp;示例数据名称，指定实体示例数据的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDESAMPLEDATANAME = "psdesampledataname";

    /**
     * 设置 示例数据名称，详细说明：{@link #FIELD_PSDESAMPLEDATANAME}
     * 
     * @param pSDESampleDataName
     * 
     */
    @JsonProperty(FIELD_PSDESAMPLEDATANAME)
    public void setPSDESampleDataName(String pSDESampleDataName){
        this.set(FIELD_PSDESAMPLEDATANAME, pSDESampleDataName);
    }
    
    /**
     * 获取 示例数据名称  
     * @return
     */
    @JsonIgnore
    public String getPSDESampleDataName(){
        Object objValue = this.get(FIELD_PSDESAMPLEDATANAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 示例数据名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDESampleDataNameDirty(){
        if(this.contains(FIELD_PSDESAMPLEDATANAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 示例数据名称
     */
    @JsonIgnore
    public void resetPSDESampleDataName(){
        this.reset(FIELD_PSDESAMPLEDATANAME);
    }

    /**
     * 设置 示例数据名称，详细说明：{@link #FIELD_PSDESAMPLEDATANAME}
     * <P>
     * 等同 {@link #setPSDESampleDataName}
     * @param pSDESampleDataName
     */
    @JsonIgnore
    public PSDESampleData psdesampledataname(String pSDESampleDataName){
        this.setPSDESampleDataName(pSDESampleDataName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDESampleDataName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDESampleDataName(strName);
    }

    @JsonIgnore
    public PSDESampleData name(String strName){
        this.setPSDESampleDataName(strName);
        return this;
    }

    /**
     * <B>PSSYSREQITEMID</B>&nbsp;系统需求项
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysReqItem} 
     */
    public final static String FIELD_PSSYSREQITEMID = "pssysreqitemid";

    /**
     * 设置 系统需求项
     * 
     * @param pSSysReqItemId
     * 
     */
    @JsonProperty(FIELD_PSSYSREQITEMID)
    public void setPSSysReqItemId(String pSSysReqItemId){
        this.set(FIELD_PSSYSREQITEMID, pSSysReqItemId);
    }
    
    /**
     * 获取 系统需求项  
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
     * 判断 系统需求项 是否指定值，包括空值
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
     * 重置 系统需求项
     */
    @JsonIgnore
    public void resetPSSysReqItemId(){
        this.reset(FIELD_PSSYSREQITEMID);
    }

    /**
     * 设置 系统需求项
     * <P>
     * 等同 {@link #setPSSysReqItemId}
     * @param pSSysReqItemId
     */
    @JsonIgnore
    public PSDESampleData pssysreqitemid(String pSSysReqItemId){
        this.setPSSysReqItemId(pSSysReqItemId);
        return this;
    }

    /**
     * 设置 系统需求项，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysReqItemId}
     * @param pSSysReqItem 引用对象
     */
    @JsonIgnore
    public PSDESampleData pssysreqitemid(PSSysReqItem pSSysReqItem){
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
     * <B>PSSYSREQITEMNAME</B>&nbsp;系统需求项
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSREQITEMID}
     */
    public final static String FIELD_PSSYSREQITEMNAME = "pssysreqitemname";

    /**
     * 设置 系统需求项
     * 
     * @param pSSysReqItemName
     * 
     */
    @JsonProperty(FIELD_PSSYSREQITEMNAME)
    public void setPSSysReqItemName(String pSSysReqItemName){
        this.set(FIELD_PSSYSREQITEMNAME, pSSysReqItemName);
    }
    
    /**
     * 获取 系统需求项  
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
     * 判断 系统需求项 是否指定值，包括空值
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
     * 重置 系统需求项
     */
    @JsonIgnore
    public void resetPSSysReqItemName(){
        this.reset(FIELD_PSSYSREQITEMNAME);
    }

    /**
     * 设置 系统需求项
     * <P>
     * 等同 {@link #setPSSysReqItemName}
     * @param pSSysReqItemName
     */
    @JsonIgnore
    public PSDESampleData pssysreqitemname(String pSSysReqItemName){
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    /**
     * <B>RANDOMCNT</B>&nbsp;随机数量，指定实体示例数据的随机数量，未定义时为【1】
     */
    public final static String FIELD_RANDOMCNT = "randomcnt";

    /**
     * 设置 随机数量，详细说明：{@link #FIELD_RANDOMCNT}
     * 
     * @param randomCnt
     * 
     */
    @JsonProperty(FIELD_RANDOMCNT)
    public void setRandomCnt(Integer randomCnt){
        this.set(FIELD_RANDOMCNT, randomCnt);
        //属性名称与代码标识不一致，设置属性名称
        this.set("randomecnt", randomCnt);
    }
    
    /**
     * 获取 随机数量  
     * @return
     */
    @JsonIgnore
    public Integer getRandomCnt(){
        Object objValue = this.get(FIELD_RANDOMCNT);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("randomecnt");
            if(objValue == null){
                return null;
            }
        }
        return (Integer)objValue;
    }

    /**
     * 判断 随机数量 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRandomCntDirty(){
        if(this.contains(FIELD_RANDOMCNT)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("randomecnt")){
            return true;
        }
        return false;
    }

    /**
     * 重置 随机数量
     */
    @JsonIgnore
    public void resetRandomCnt(){
        this.reset(FIELD_RANDOMCNT);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("randomecnt");
    }

    /**
     * 设置 随机数量，详细说明：{@link #FIELD_RANDOMCNT}
     * <P>
     * 等同 {@link #setRandomCnt}
     * @param randomCnt
     */
    @JsonIgnore
    public PSDESampleData randomcnt(Integer randomCnt){
        this.setRandomCnt(randomCnt);
        return this;
    }

    /**
     * <B>RANDOMMODE</B>&nbsp;随机模式，指定实体示例数据的随机模式，未定义时为【默认】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SampleDataRandomMode} 
     */
    public final static String FIELD_RANDOMMODE = "randommode";

    /**
     * 设置 随机模式，详细说明：{@link #FIELD_RANDOMMODE}
     * 
     * @param randomMode
     * 
     */
    @JsonProperty(FIELD_RANDOMMODE)
    public void setRandomMode(String randomMode){
        this.set(FIELD_RANDOMMODE, randomMode);
    }
    
    /**
     * 获取 随机模式  
     * @return
     */
    @JsonIgnore
    public String getRandomMode(){
        Object objValue = this.get(FIELD_RANDOMMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 随机模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRandomModeDirty(){
        if(this.contains(FIELD_RANDOMMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 随机模式
     */
    @JsonIgnore
    public void resetRandomMode(){
        this.reset(FIELD_RANDOMMODE);
    }

    /**
     * 设置 随机模式，详细说明：{@link #FIELD_RANDOMMODE}
     * <P>
     * 等同 {@link #setRandomMode}
     * @param randomMode
     */
    @JsonIgnore
    public PSDESampleData randommode(String randomMode){
        this.setRandomMode(randomMode);
        return this;
    }

     /**
     * 设置 随机模式，详细说明：{@link #FIELD_RANDOMMODE}
     * <P>
     * 等同 {@link #setRandomMode}
     * @param randomMode
     */
    @JsonIgnore
    public PSDESampleData randommode(net.ibizsys.psmodel.core.util.PSModelEnums.SampleDataRandomMode randomMode){
        if(randomMode == null){
            this.setRandomMode(null);
        }
        else{
            this.setRandomMode(randomMode.value);
        }
        return this;
    }

    /**
     * <B>RANDOMPARAM</B>&nbsp;随机参数，指定实体示例数据的随机参数
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_RANDOMPARAM = "randomparam";

    /**
     * 设置 随机参数，详细说明：{@link #FIELD_RANDOMPARAM}
     * 
     * @param randomParam
     * 
     */
    @JsonProperty(FIELD_RANDOMPARAM)
    public void setRandomParam(String randomParam){
        this.set(FIELD_RANDOMPARAM, randomParam);
    }
    
    /**
     * 获取 随机参数  
     * @return
     */
    @JsonIgnore
    public String getRandomParam(){
        Object objValue = this.get(FIELD_RANDOMPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 随机参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRandomParamDirty(){
        if(this.contains(FIELD_RANDOMPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 随机参数
     */
    @JsonIgnore
    public void resetRandomParam(){
        this.reset(FIELD_RANDOMPARAM);
    }

    /**
     * 设置 随机参数，详细说明：{@link #FIELD_RANDOMPARAM}
     * <P>
     * 等同 {@link #setRandomParam}
     * @param randomParam
     */
    @JsonIgnore
    public PSDESampleData randomparam(String randomParam){
        this.setRandomParam(randomParam);
        return this;
    }

    /**
     * <B>RANDOMPARAM2</B>&nbsp;随机参数2，指定实体示例数据的随机参数2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_RANDOMPARAM2 = "randomparam2";

    /**
     * 设置 随机参数2，详细说明：{@link #FIELD_RANDOMPARAM2}
     * 
     * @param randomParam2
     * 
     */
    @JsonProperty(FIELD_RANDOMPARAM2)
    public void setRandomParam2(String randomParam2){
        this.set(FIELD_RANDOMPARAM2, randomParam2);
    }
    
    /**
     * 获取 随机参数2  
     * @return
     */
    @JsonIgnore
    public String getRandomParam2(){
        Object objValue = this.get(FIELD_RANDOMPARAM2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 随机参数2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRandomParam2Dirty(){
        if(this.contains(FIELD_RANDOMPARAM2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 随机参数2
     */
    @JsonIgnore
    public void resetRandomParam2(){
        this.reset(FIELD_RANDOMPARAM2);
    }

    /**
     * 设置 随机参数2，详细说明：{@link #FIELD_RANDOMPARAM2}
     * <P>
     * 等同 {@link #setRandomParam2}
     * @param randomParam2
     */
    @JsonIgnore
    public PSDESampleData randomparam2(String randomParam2){
        this.setRandomParam2(randomParam2);
        return this;
    }

    /**
     * <B>RANDOMPARAM3</B>&nbsp;随机参数3，指定实体示例数据的随机参数3
     */
    public final static String FIELD_RANDOMPARAM3 = "randomparam3";

    /**
     * 设置 随机参数3，详细说明：{@link #FIELD_RANDOMPARAM3}
     * 
     * @param randomParam3
     * 
     */
    @JsonProperty(FIELD_RANDOMPARAM3)
    public void setRandomParam3(Integer randomParam3){
        this.set(FIELD_RANDOMPARAM3, randomParam3);
    }
    
    /**
     * 获取 随机参数3  
     * @return
     */
    @JsonIgnore
    public Integer getRandomParam3(){
        Object objValue = this.get(FIELD_RANDOMPARAM3);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 随机参数3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRandomParam3Dirty(){
        if(this.contains(FIELD_RANDOMPARAM3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 随机参数3
     */
    @JsonIgnore
    public void resetRandomParam3(){
        this.reset(FIELD_RANDOMPARAM3);
    }

    /**
     * 设置 随机参数3，详细说明：{@link #FIELD_RANDOMPARAM3}
     * <P>
     * 等同 {@link #setRandomParam3}
     * @param randomParam3
     */
    @JsonIgnore
    public PSDESampleData randomparam3(Integer randomParam3){
        this.setRandomParam3(randomParam3);
        return this;
    }

    /**
     * <B>RANDOMPARAM4</B>&nbsp;随机参数4，指定实体示例数据的随机参数4
     */
    public final static String FIELD_RANDOMPARAM4 = "randomparam4";

    /**
     * 设置 随机参数4，详细说明：{@link #FIELD_RANDOMPARAM4}
     * 
     * @param randomParam4
     * 
     */
    @JsonProperty(FIELD_RANDOMPARAM4)
    public void setRandomParam4(Integer randomParam4){
        this.set(FIELD_RANDOMPARAM4, randomParam4);
    }
    
    /**
     * 获取 随机参数4  
     * @return
     */
    @JsonIgnore
    public Integer getRandomParam4(){
        Object objValue = this.get(FIELD_RANDOMPARAM4);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 随机参数4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRandomParam4Dirty(){
        if(this.contains(FIELD_RANDOMPARAM4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 随机参数4
     */
    @JsonIgnore
    public void resetRandomParam4(){
        this.reset(FIELD_RANDOMPARAM4);
    }

    /**
     * 设置 随机参数4，详细说明：{@link #FIELD_RANDOMPARAM4}
     * <P>
     * 等同 {@link #setRandomParam4}
     * @param randomParam4
     */
    @JsonIgnore
    public PSDESampleData randomparam4(Integer randomParam4){
        this.setRandomParam4(randomParam4);
        return this;
    }

    /**
     * <B>SDTAG</B>&nbsp;示例数据标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_SDTAG = "sdtag";

    /**
     * 设置 示例数据标记
     * 
     * @param sDTag
     * 
     */
    @JsonProperty(FIELD_SDTAG)
    public void setSDTag(String sDTag){
        this.set(FIELD_SDTAG, sDTag);
    }
    
    /**
     * 获取 示例数据标记  
     * @return
     */
    @JsonIgnore
    public String getSDTag(){
        Object objValue = this.get(FIELD_SDTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 示例数据标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSDTagDirty(){
        if(this.contains(FIELD_SDTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 示例数据标记
     */
    @JsonIgnore
    public void resetSDTag(){
        this.reset(FIELD_SDTAG);
    }

    /**
     * 设置 示例数据标记
     * <P>
     * 等同 {@link #setSDTag}
     * @param sDTag
     */
    @JsonIgnore
    public PSDESampleData sdtag(String sDTag){
        this.setSDTag(sDTag);
        return this;
    }

    /**
     * <B>SDTAG2</B>&nbsp;示例数据标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_SDTAG2 = "sdtag2";

    /**
     * 设置 示例数据标记2
     * 
     * @param sDTag2
     * 
     */
    @JsonProperty(FIELD_SDTAG2)
    public void setSDTag2(String sDTag2){
        this.set(FIELD_SDTAG2, sDTag2);
    }
    
    /**
     * 获取 示例数据标记2  
     * @return
     */
    @JsonIgnore
    public String getSDTag2(){
        Object objValue = this.get(FIELD_SDTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 示例数据标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSDTag2Dirty(){
        if(this.contains(FIELD_SDTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 示例数据标记2
     */
    @JsonIgnore
    public void resetSDTag2(){
        this.reset(FIELD_SDTAG2);
    }

    /**
     * 设置 示例数据标记2
     * <P>
     * 等同 {@link #setSDTag2}
     * @param sDTag2
     */
    @JsonIgnore
    public PSDESampleData sdtag2(String sDTag2){
        this.setSDTag2(sDTag2);
        return this;
    }

    /**
     * <B>SDTAG3</B>&nbsp;示例数据标记3
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_SDTAG3 = "sdtag3";

    /**
     * 设置 示例数据标记3
     * 
     * @param sDTag3
     * 
     */
    @JsonProperty(FIELD_SDTAG3)
    public void setSDTag3(String sDTag3){
        this.set(FIELD_SDTAG3, sDTag3);
    }
    
    /**
     * 获取 示例数据标记3  
     * @return
     */
    @JsonIgnore
    public String getSDTag3(){
        Object objValue = this.get(FIELD_SDTAG3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 示例数据标记3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSDTag3Dirty(){
        if(this.contains(FIELD_SDTAG3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 示例数据标记3
     */
    @JsonIgnore
    public void resetSDTag3(){
        this.reset(FIELD_SDTAG3);
    }

    /**
     * 设置 示例数据标记3
     * <P>
     * 等同 {@link #setSDTag3}
     * @param sDTag3
     */
    @JsonIgnore
    public PSDESampleData sdtag3(String sDTag3){
        this.setSDTag3(sDTag3);
        return this;
    }

    /**
     * <B>SDTAG4</B>&nbsp;示例数据标记4
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_SDTAG4 = "sdtag4";

    /**
     * 设置 示例数据标记4
     * 
     * @param sDTag4
     * 
     */
    @JsonProperty(FIELD_SDTAG4)
    public void setSDTag4(String sDTag4){
        this.set(FIELD_SDTAG4, sDTag4);
    }
    
    /**
     * 获取 示例数据标记4  
     * @return
     */
    @JsonIgnore
    public String getSDTag4(){
        Object objValue = this.get(FIELD_SDTAG4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 示例数据标记4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSDTag4Dirty(){
        if(this.contains(FIELD_SDTAG4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 示例数据标记4
     */
    @JsonIgnore
    public void resetSDTag4(){
        this.reset(FIELD_SDTAG4);
    }

    /**
     * 设置 示例数据标记4
     * <P>
     * 等同 {@link #setSDTag4}
     * @param sDTag4
     */
    @JsonIgnore
    public PSDESampleData sdtag4(String sDTag4){
        this.setSDTag4(sDTag4);
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
    public PSDESampleData updatedate(String updateDate){
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
    public PSDESampleData updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>USAGE</B>&nbsp;使用方式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SampleDataUsage} 
     */
    public final static String FIELD_USAGE = "usage";

    /**
     * 设置 使用方式
     * 
     * @param usage
     * 
     */
    @JsonProperty(FIELD_USAGE)
    public void setUsage(String usage){
        this.set(FIELD_USAGE, usage);
    }
    
    /**
     * 获取 使用方式  
     * @return
     */
    @JsonIgnore
    public String getUsage(){
        Object objValue = this.get(FIELD_USAGE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 使用方式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUsageDirty(){
        if(this.contains(FIELD_USAGE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 使用方式
     */
    @JsonIgnore
    public void resetUsage(){
        this.reset(FIELD_USAGE);
    }

    /**
     * 设置 使用方式
     * <P>
     * 等同 {@link #setUsage}
     * @param usage
     */
    @JsonIgnore
    public PSDESampleData usage(String usage){
        this.setUsage(usage);
        return this;
    }

     /**
     * 设置 使用方式
     * <P>
     * 等同 {@link #setUsage}
     * @param usage
     */
    @JsonIgnore
    public PSDESampleData usage(net.ibizsys.psmodel.core.util.PSModelEnums.SampleDataUsage usage){
        if(usage == null){
            this.setUsage(null);
        }
        else{
            this.setUsage(usage.value);
        }
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
    public PSDESampleData usercat(String userCat){
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
    public PSDESampleData usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDESampleData usertag(String userTag){
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
    public PSDESampleData usertag2(String userTag2){
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
    public PSDESampleData usertag3(String userTag3){
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
    public PSDESampleData usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDESampleDataId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDESampleDataId(strValue);
    }

    @JsonIgnore
    public PSDESampleData id(String strValue){
        this.setPSDESampleDataId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDESampleData){
            PSDESampleData model = (PSDESampleData)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
