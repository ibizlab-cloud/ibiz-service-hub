package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSTESTDATA</B>系统测试数据 模型传输对象
 * <P>
 * 系统测试数据模型，定义系统实体的数据对象，支持主状态区分
 */
public class PSSysTestDataDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysTestDataDTO(){
    }      

    /**
     * <B>BASEMODE</B>&nbsp;基础数据，指定测试数据是否为基础数据，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_BASEMODE = "basemode";

    /**
     * 设置 基础数据，详细说明：{@link #FIELD_BASEMODE}
     * 
     * @param baseMode
     * 
     */
    @JsonProperty(FIELD_BASEMODE)
    public void setBaseMode(Integer baseMode){
        this.set(FIELD_BASEMODE, baseMode);
    }
    
    /**
     * 获取 基础数据  
     * @return
     */
    @JsonIgnore
    public Integer getBaseMode(){
        Object objValue = this.get(FIELD_BASEMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 基础数据 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBaseModeDirty(){
        if(this.contains(FIELD_BASEMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 基础数据
     */
    @JsonIgnore
    public void resetBaseMode(){
        this.reset(FIELD_BASEMODE);
    }

    /**
     * 设置 基础数据，详细说明：{@link #FIELD_BASEMODE}
     * <P>
     * 等同 {@link #setBaseMode}
     * @param baseMode
     */
    @JsonIgnore
    public PSSysTestDataDTO basemode(Integer baseMode){
        this.setBaseMode(baseMode);
        return this;
    }

     /**
     * 设置 基础数据，详细说明：{@link #FIELD_BASEMODE}
     * <P>
     * 等同 {@link #setBaseMode}
     * @param baseMode
     */
    @JsonIgnore
    public PSSysTestDataDTO basemode(Boolean baseMode){
        if(baseMode == null){
            this.setBaseMode(null);
        }
        else{
            this.setBaseMode(baseMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定测试数据的代码标识，需要在所在的模型域（实体、系统模块或系统）中具有唯一性
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
    public PSSysTestDataDTO codename(String codeName){
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
    public PSSysTestDataDTO createdate(Timestamp createDate){
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
    public PSSysTestDataDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CUSTOMCODE</B>&nbsp;脚本代码，测试数据类型为【自定义代码】时指定自定义的代码
     */
    public final static String FIELD_CUSTOMCODE = "customcode";

    /**
     * 设置 脚本代码，详细说明：{@link #FIELD_CUSTOMCODE}
     * 
     * @param customCode
     * 
     */
    @JsonProperty(FIELD_CUSTOMCODE)
    public void setCustomCode(String customCode){
        this.set(FIELD_CUSTOMCODE, customCode);
    }
    
    /**
     * 获取 脚本代码  
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
     * 判断 脚本代码 是否指定值，包括空值
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
     * 重置 脚本代码
     */
    @JsonIgnore
    public void resetCustomCode(){
        this.reset(FIELD_CUSTOMCODE);
    }

    /**
     * 设置 脚本代码，详细说明：{@link #FIELD_CUSTOMCODE}
     * <P>
     * 等同 {@link #setCustomCode}
     * @param customCode
     */
    @JsonIgnore
    public PSSysTestDataDTO customcode(String customCode){
        this.setCustomCode(customCode);
        return this;
    }

    /**
     * <B>DATA</B>&nbsp;数据
     */
    public final static String FIELD_DATA = "data";

    /**
     * 设置 数据
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
     * 设置 数据
     * <P>
     * 等同 {@link #setData}
     * @param data
     */
    @JsonIgnore
    public PSSysTestDataDTO data(String data){
        this.setData(data);
        return this;
    }

    /**
     * <B>MAINPSSYSTDID</B>&nbsp;扩展测试数据
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysTestDataDTO} 
     */
    public final static String FIELD_MAINPSSYSTDID = "mainpssystdid";

    /**
     * 设置 扩展测试数据
     * 
     * @param mainPSSysTDId
     * 
     */
    @JsonProperty(FIELD_MAINPSSYSTDID)
    public void setMainPSSysTDId(String mainPSSysTDId){
        this.set(FIELD_MAINPSSYSTDID, mainPSSysTDId);
    }
    
    /**
     * 获取 扩展测试数据  
     * @return
     */
    @JsonIgnore
    public String getMainPSSysTDId(){
        Object objValue = this.get(FIELD_MAINPSSYSTDID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 扩展测试数据 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMainPSSysTDIdDirty(){
        if(this.contains(FIELD_MAINPSSYSTDID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 扩展测试数据
     */
    @JsonIgnore
    public void resetMainPSSysTDId(){
        this.reset(FIELD_MAINPSSYSTDID);
    }

    /**
     * 设置 扩展测试数据
     * <P>
     * 等同 {@link #setMainPSSysTDId}
     * @param mainPSSysTDId
     */
    @JsonIgnore
    public PSSysTestDataDTO mainpssystdid(String mainPSSysTDId){
        this.setMainPSSysTDId(mainPSSysTDId);
        return this;
    }

    /**
     * 设置 扩展测试数据，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMainPSSysTDId}
     * @param pSSysTestData 引用对象
     */
    @JsonIgnore
    public PSSysTestDataDTO mainpssystdid(PSSysTestDataDTO pSSysTestData){
        if(pSSysTestData == null){
            this.setMainPSSysTDId(null);
            this.setMainPSSysTDName(null);
        }
        else{
            this.setMainPSSysTDId(pSSysTestData.getPSSysTestDataId());
            this.setMainPSSysTDName(pSSysTestData.getPSSysTestDataName());
        }
        return this;
    }

    /**
     * <B>MAINPSSYSTDNAME</B>&nbsp;扩展测试数据
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MAINPSSYSTDID}
     */
    public final static String FIELD_MAINPSSYSTDNAME = "mainpssystdname";

    /**
     * 设置 扩展测试数据
     * 
     * @param mainPSSysTDName
     * 
     */
    @JsonProperty(FIELD_MAINPSSYSTDNAME)
    public void setMainPSSysTDName(String mainPSSysTDName){
        this.set(FIELD_MAINPSSYSTDNAME, mainPSSysTDName);
    }
    
    /**
     * 获取 扩展测试数据  
     * @return
     */
    @JsonIgnore
    public String getMainPSSysTDName(){
        Object objValue = this.get(FIELD_MAINPSSYSTDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 扩展测试数据 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMainPSSysTDNameDirty(){
        if(this.contains(FIELD_MAINPSSYSTDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 扩展测试数据
     */
    @JsonIgnore
    public void resetMainPSSysTDName(){
        this.reset(FIELD_MAINPSSYSTDNAME);
    }

    /**
     * 设置 扩展测试数据
     * <P>
     * 等同 {@link #setMainPSSysTDName}
     * @param mainPSSysTDName
     */
    @JsonIgnore
    public PSSysTestDataDTO mainpssystdname(String mainPSSysTDName){
        this.setMainPSSysTDName(mainPSSysTDName);
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
    public PSSysTestDataDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;测试顺序
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 测试顺序
     * 
     * @param orderValue
     * 
     */
    @JsonProperty(FIELD_ORDERVALUE)
    public void setOrderValue(Integer orderValue){
        this.set(FIELD_ORDERVALUE, orderValue);
    }
    
    /**
     * 获取 测试顺序  
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
     * 判断 测试顺序 是否指定值，包括空值
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
     * 重置 测试顺序
     */
    @JsonIgnore
    public void resetOrderValue(){
        this.reset(FIELD_ORDERVALUE);
    }

    /**
     * 设置 测试顺序
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSSysTestDataDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定测试数据所属的实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDataEntityDTO} 
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
    public PSSysTestDataDTO psdeid(String pSDEId){
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
    public PSSysTestDataDTO psdeid(PSDataEntityDTO pSDataEntity){
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
     * <B>PSDEMAINSTATEID</B>&nbsp;实体主状态，指定测试数据相关的实体主状态
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEMainStateDTO} 
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
    public PSSysTestDataDTO psdemainstateid(String pSDEMainStateId){
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
    public PSSysTestDataDTO psdemainstateid(PSDEMainStateDTO pSDEMainState){
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
     * <B>PSDEMAINSTATENAME</B>&nbsp;实体主状态，指定测试数据相关的实体主状态
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
    public PSSysTestDataDTO psdemainstatename(String pSDEMainStateName){
        this.setPSDEMainStateName(pSDEMainStateName);
        return this;
    }

    /**
     * <B>PSDENAME</B>&nbsp;实体，指定测试数据所属的实体
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
    public PSSysTestDataDTO psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSDESAMPLEDATAID</B>&nbsp;实体示例数据
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDESampleDataDTO} 
     */
    public final static String FIELD_PSDESAMPLEDATAID = "psdesampledataid";

    /**
     * 设置 实体示例数据
     * 
     * @param pSDESampleDataId
     * 
     */
    @JsonProperty(FIELD_PSDESAMPLEDATAID)
    public void setPSDESampleDataId(String pSDESampleDataId){
        this.set(FIELD_PSDESAMPLEDATAID, pSDESampleDataId);
    }
    
    /**
     * 获取 实体示例数据  
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
     * 判断 实体示例数据 是否指定值，包括空值
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
     * 重置 实体示例数据
     */
    @JsonIgnore
    public void resetPSDESampleDataId(){
        this.reset(FIELD_PSDESAMPLEDATAID);
    }

    /**
     * 设置 实体示例数据
     * <P>
     * 等同 {@link #setPSDESampleDataId}
     * @param pSDESampleDataId
     */
    @JsonIgnore
    public PSSysTestDataDTO psdesampledataid(String pSDESampleDataId){
        this.setPSDESampleDataId(pSDESampleDataId);
        return this;
    }

    /**
     * 设置 实体示例数据，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDESampleDataId}
     * @param pSDESampleData 引用对象
     */
    @JsonIgnore
    public PSSysTestDataDTO psdesampledataid(PSDESampleDataDTO pSDESampleData){
        if(pSDESampleData == null){
            this.setPSDESampleDataId(null);
            this.setPSDESampleDataName(null);
        }
        else{
            this.setPSDESampleDataId(pSDESampleData.getPSDESampleDataId());
            this.setPSDESampleDataName(pSDESampleData.getPSDESampleDataName());
        }
        return this;
    }

    /**
     * <B>PSDESAMPLEDATANAME</B>&nbsp;实体示例数据
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDESAMPLEDATAID}
     */
    public final static String FIELD_PSDESAMPLEDATANAME = "psdesampledataname";

    /**
     * 设置 实体示例数据
     * 
     * @param pSDESampleDataName
     * 
     */
    @JsonProperty(FIELD_PSDESAMPLEDATANAME)
    public void setPSDESampleDataName(String pSDESampleDataName){
        this.set(FIELD_PSDESAMPLEDATANAME, pSDESampleDataName);
    }
    
    /**
     * 获取 实体示例数据  
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
     * 判断 实体示例数据 是否指定值，包括空值
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
     * 重置 实体示例数据
     */
    @JsonIgnore
    public void resetPSDESampleDataName(){
        this.reset(FIELD_PSDESAMPLEDATANAME);
    }

    /**
     * 设置 实体示例数据
     * <P>
     * 等同 {@link #setPSDESampleDataName}
     * @param pSDESampleDataName
     */
    @JsonIgnore
    public PSSysTestDataDTO psdesampledataname(String pSDESampleDataName){
        this.setPSDESampleDataName(pSDESampleDataName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定系统测试数据所在的系统模块
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSModuleDTO} 
     */
    public final static String FIELD_PSMODULEID = "psmoduleid";

    /**
     * 设置 系统模块，详细说明：{@link #FIELD_PSMODULEID}
     * 
     * @param pSModuleId
     * 
     */
    @JsonProperty(FIELD_PSMODULEID)
    public void setPSModuleId(String pSModuleId){
        this.set(FIELD_PSMODULEID, pSModuleId);
    }
    
    /**
     * 获取 系统模块  
     * @return
     */
    @JsonIgnore
    public String getPSModuleId(){
        Object objValue = this.get(FIELD_PSMODULEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统模块 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSModuleIdDirty(){
        if(this.contains(FIELD_PSMODULEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统模块
     */
    @JsonIgnore
    public void resetPSModuleId(){
        this.reset(FIELD_PSMODULEID);
    }

    /**
     * 设置 系统模块，详细说明：{@link #FIELD_PSMODULEID}
     * <P>
     * 等同 {@link #setPSModuleId}
     * @param pSModuleId
     */
    @JsonIgnore
    public PSSysTestDataDTO psmoduleid(String pSModuleId){
        this.setPSModuleId(pSModuleId);
        return this;
    }

    /**
     * 设置 系统模块，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSModuleId}
     * @param pSModule 引用对象
     */
    @JsonIgnore
    public PSSysTestDataDTO psmoduleid(PSModuleDTO pSModule){
        if(pSModule == null){
            this.setPSModuleId(null);
            this.setPSModuleName(null);
        }
        else{
            this.setPSModuleId(pSModule.getPSModuleId());
            this.setPSModuleName(pSModule.getPSModuleName());
        }
        return this;
    }

    /**
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定系统测试数据所在的系统模块
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSMODULEID}
     */
    public final static String FIELD_PSMODULENAME = "psmodulename";

    /**
     * 设置 系统模块，详细说明：{@link #FIELD_PSMODULENAME}
     * 
     * @param pSModuleName
     * 
     */
    @JsonProperty(FIELD_PSMODULENAME)
    public void setPSModuleName(String pSModuleName){
        this.set(FIELD_PSMODULENAME, pSModuleName);
    }
    
    /**
     * 获取 系统模块  
     * @return
     */
    @JsonIgnore
    public String getPSModuleName(){
        Object objValue = this.get(FIELD_PSMODULENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统模块 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSModuleNameDirty(){
        if(this.contains(FIELD_PSMODULENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统模块
     */
    @JsonIgnore
    public void resetPSModuleName(){
        this.reset(FIELD_PSMODULENAME);
    }

    /**
     * 设置 系统模块，详细说明：{@link #FIELD_PSMODULENAME}
     * <P>
     * 等同 {@link #setPSModuleName}
     * @param pSModuleName
     */
    @JsonIgnore
    public PSSysTestDataDTO psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSYSREQITEMID</B>&nbsp;系统设计需求
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysReqItemDTO} 
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
    public PSSysTestDataDTO pssysreqitemid(String pSSysReqItemId){
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
    public PSSysTestDataDTO pssysreqitemid(PSSysReqItemDTO pSSysReqItem){
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
    public PSSysTestDataDTO pssysreqitemname(String pSSysReqItemName){
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    /**
     * <B>PSSYSTESTDATAID</B>&nbsp;系统测试数据标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSTESTDATAID = "pssystestdataid";

    /**
     * 设置 系统测试数据标识
     * 
     * @param pSSysTestDataId
     * 
     */
    @JsonProperty(FIELD_PSSYSTESTDATAID)
    public void setPSSysTestDataId(String pSSysTestDataId){
        this.set(FIELD_PSSYSTESTDATAID, pSSysTestDataId);
    }
    
    /**
     * 获取 系统测试数据标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysTestDataId(){
        Object objValue = this.get(FIELD_PSSYSTESTDATAID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统测试数据标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysTestDataIdDirty(){
        if(this.contains(FIELD_PSSYSTESTDATAID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统测试数据标识
     */
    @JsonIgnore
    public void resetPSSysTestDataId(){
        this.reset(FIELD_PSSYSTESTDATAID);
    }

    /**
     * 设置 系统测试数据标识
     * <P>
     * 等同 {@link #setPSSysTestDataId}
     * @param pSSysTestDataId
     */
    @JsonIgnore
    public PSSysTestDataDTO pssystestdataid(String pSSysTestDataId){
        this.setPSSysTestDataId(pSSysTestDataId);
        return this;
    }

    /**
     * <B>PSSYSTESTDATANAME</B>&nbsp;测试数据名称，指定测试数据的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSTESTDATANAME = "pssystestdataname";

    /**
     * 设置 测试数据名称，详细说明：{@link #FIELD_PSSYSTESTDATANAME}
     * 
     * @param pSSysTestDataName
     * 
     */
    @JsonProperty(FIELD_PSSYSTESTDATANAME)
    public void setPSSysTestDataName(String pSSysTestDataName){
        this.set(FIELD_PSSYSTESTDATANAME, pSSysTestDataName);
    }
    
    /**
     * 获取 测试数据名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysTestDataName(){
        Object objValue = this.get(FIELD_PSSYSTESTDATANAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 测试数据名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysTestDataNameDirty(){
        if(this.contains(FIELD_PSSYSTESTDATANAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 测试数据名称
     */
    @JsonIgnore
    public void resetPSSysTestDataName(){
        this.reset(FIELD_PSSYSTESTDATANAME);
    }

    /**
     * 设置 测试数据名称，详细说明：{@link #FIELD_PSSYSTESTDATANAME}
     * <P>
     * 等同 {@link #setPSSysTestDataName}
     * @param pSSysTestDataName
     */
    @JsonIgnore
    public PSSysTestDataDTO pssystestdataname(String pSSysTestDataName){
        this.setPSSysTestDataName(pSSysTestDataName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysTestDataName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysTestDataName(strName);
    }

    @JsonIgnore
    public PSSysTestDataDTO name(String strName){
        this.setPSSysTestDataName(strName);
        return this;
    }

    /**
     * <B>RANDOMCOUNT</B>&nbsp;随机产生数量，指定测试数据产生的随机数据数量，未定义时为【1】
     */
    public final static String FIELD_RANDOMCOUNT = "randomcount";

    /**
     * 设置 随机产生数量，详细说明：{@link #FIELD_RANDOMCOUNT}
     * 
     * @param randomCount
     * 
     */
    @JsonProperty(FIELD_RANDOMCOUNT)
    public void setRandomCount(Integer randomCount){
        this.set(FIELD_RANDOMCOUNT, randomCount);
    }
    
    /**
     * 获取 随机产生数量  
     * @return
     */
    @JsonIgnore
    public Integer getRandomCount(){
        Object objValue = this.get(FIELD_RANDOMCOUNT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 随机产生数量 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRandomCountDirty(){
        if(this.contains(FIELD_RANDOMCOUNT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 随机产生数量
     */
    @JsonIgnore
    public void resetRandomCount(){
        this.reset(FIELD_RANDOMCOUNT);
    }

    /**
     * 设置 随机产生数量，详细说明：{@link #FIELD_RANDOMCOUNT}
     * <P>
     * 等同 {@link #setRandomCount}
     * @param randomCount
     */
    @JsonIgnore
    public PSSysTestDataDTO randomcount(Integer randomCount){
        this.setRandomCount(randomCount);
        return this;
    }

    /**
     * <B>TESTDATATAG</B>&nbsp;测试数据标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_TESTDATATAG = "testdatatag";

    /**
     * 设置 测试数据标记
     * 
     * @param testDataTag
     * 
     */
    @JsonProperty(FIELD_TESTDATATAG)
    public void setTestDataTag(String testDataTag){
        this.set(FIELD_TESTDATATAG, testDataTag);
    }
    
    /**
     * 获取 测试数据标记  
     * @return
     */
    @JsonIgnore
    public String getTestDataTag(){
        Object objValue = this.get(FIELD_TESTDATATAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 测试数据标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTestDataTagDirty(){
        if(this.contains(FIELD_TESTDATATAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 测试数据标记
     */
    @JsonIgnore
    public void resetTestDataTag(){
        this.reset(FIELD_TESTDATATAG);
    }

    /**
     * 设置 测试数据标记
     * <P>
     * 等同 {@link #setTestDataTag}
     * @param testDataTag
     */
    @JsonIgnore
    public PSSysTestDataDTO testdatatag(String testDataTag){
        this.setTestDataTag(testDataTag);
        return this;
    }

    /**
     * <B>TESTDATATAG2</B>&nbsp;测试数据标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_TESTDATATAG2 = "testdatatag2";

    /**
     * 设置 测试数据标记2
     * 
     * @param testDataTag2
     * 
     */
    @JsonProperty(FIELD_TESTDATATAG2)
    public void setTestDataTag2(String testDataTag2){
        this.set(FIELD_TESTDATATAG2, testDataTag2);
    }
    
    /**
     * 获取 测试数据标记2  
     * @return
     */
    @JsonIgnore
    public String getTestDataTag2(){
        Object objValue = this.get(FIELD_TESTDATATAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 测试数据标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTestDataTag2Dirty(){
        if(this.contains(FIELD_TESTDATATAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 测试数据标记2
     */
    @JsonIgnore
    public void resetTestDataTag2(){
        this.reset(FIELD_TESTDATATAG2);
    }

    /**
     * 设置 测试数据标记2
     * <P>
     * 等同 {@link #setTestDataTag2}
     * @param testDataTag2
     */
    @JsonIgnore
    public PSSysTestDataDTO testdatatag2(String testDataTag2){
        this.setTestDataTag2(testDataTag2);
        return this;
    }

    /**
     * <B>TESTDATATYPE</B>&nbsp;测试数据类型，指定测试数据的类型，未定义时为【数据】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.TestDataType} 
     */
    public final static String FIELD_TESTDATATYPE = "testdatatype";

    /**
     * 设置 测试数据类型，详细说明：{@link #FIELD_TESTDATATYPE}
     * 
     * @param testDataType
     * 
     */
    @JsonProperty(FIELD_TESTDATATYPE)
    public void setTestDataType(String testDataType){
        this.set(FIELD_TESTDATATYPE, testDataType);
    }
    
    /**
     * 获取 测试数据类型  
     * @return
     */
    @JsonIgnore
    public String getTestDataType(){
        Object objValue = this.get(FIELD_TESTDATATYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 测试数据类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTestDataTypeDirty(){
        if(this.contains(FIELD_TESTDATATYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 测试数据类型
     */
    @JsonIgnore
    public void resetTestDataType(){
        this.reset(FIELD_TESTDATATYPE);
    }

    /**
     * 设置 测试数据类型，详细说明：{@link #FIELD_TESTDATATYPE}
     * <P>
     * 等同 {@link #setTestDataType}
     * @param testDataType
     */
    @JsonIgnore
    public PSSysTestDataDTO testdatatype(String testDataType){
        this.setTestDataType(testDataType);
        return this;
    }

     /**
     * 设置 测试数据类型，详细说明：{@link #FIELD_TESTDATATYPE}
     * <P>
     * 等同 {@link #setTestDataType}
     * @param testDataType
     */
    @JsonIgnore
    public PSSysTestDataDTO testdatatype(net.ibizsys.model.PSModelEnums.TestDataType testDataType){
        if(testDataType == null){
            this.setTestDataType(null);
        }
        else{
            this.setTestDataType(testDataType.value);
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
    public PSSysTestDataDTO updatedate(Timestamp updateDate){
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
    public PSSysTestDataDTO updateman(String updateMan){
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
    public PSSysTestDataDTO usercat(String userCat){
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
    public PSSysTestDataDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat.value);
        }
        return this;
    }

    /**
     * <B>USERFLAG</B>&nbsp;用户自建，指定测试数据是否由用户建立产生，未定义时为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_USERFLAG = "userflag";

    /**
     * 设置 用户自建，详细说明：{@link #FIELD_USERFLAG}
     * 
     * @param userFlag
     * 
     */
    @JsonProperty(FIELD_USERFLAG)
    public void setUserFlag(Integer userFlag){
        this.set(FIELD_USERFLAG, userFlag);
    }
    
    /**
     * 获取 用户自建  
     * @return
     */
    @JsonIgnore
    public Integer getUserFlag(){
        Object objValue = this.get(FIELD_USERFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 用户自建 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserFlagDirty(){
        if(this.contains(FIELD_USERFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户自建
     */
    @JsonIgnore
    public void resetUserFlag(){
        this.reset(FIELD_USERFLAG);
    }

    /**
     * 设置 用户自建，详细说明：{@link #FIELD_USERFLAG}
     * <P>
     * 等同 {@link #setUserFlag}
     * @param userFlag
     */
    @JsonIgnore
    public PSSysTestDataDTO userflag(Integer userFlag){
        this.setUserFlag(userFlag);
        return this;
    }

     /**
     * 设置 用户自建，详细说明：{@link #FIELD_USERFLAG}
     * <P>
     * 等同 {@link #setUserFlag}
     * @param userFlag
     */
    @JsonIgnore
    public PSSysTestDataDTO userflag(Boolean userFlag){
        if(userFlag == null){
            this.setUserFlag(null);
        }
        else{
            this.setUserFlag(userFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSSysTestDataDTO usertag(String userTag){
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
    public PSSysTestDataDTO usertag2(String userTag2){
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
    public PSSysTestDataDTO usertag3(String userTag3){
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
    public PSSysTestDataDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>VALIDFLAG</B>&nbsp;启用
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
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
    public PSSysTestDataDTO validflag(Integer validFlag){
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
    public PSSysTestDataDTO validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSSysTestDataId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysTestDataId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysTestDataId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysTestDataId(strValue);
    }

    @JsonIgnore
    public PSSysTestDataDTO id(String strValue){
        this.setPSSysTestDataId(strValue);
        return this;
    }


    /**
     *  系统测试数据项 成员集合
     */
    public final static String FIELD_PSSYSTDITEMS = "pssystditems";

    private java.util.List<net.ibizsys.centralstudio.dto.PSSysTDItemDTO> pssystditems;

    /**
     * 获取 系统测试数据项 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSSYSTDITEMS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSSysTDItemDTO> getPSSysTDItems(){
        return this.pssystditems;
    }

    /**
     * 设置 系统测试数据项 成员集合  
     * @param pssystditems
     */
    @JsonProperty(FIELD_PSSYSTDITEMS)
    public void setPSSysTDItems(java.util.List<net.ibizsys.centralstudio.dto.PSSysTDItemDTO> pssystditems){
        this.pssystditems = pssystditems;
    }

    /**
     * 获取 系统测试数据项 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSSysTDItemDTO> getPSSysTDItemsIf(){
        if(this.pssystditems == null){
            this.pssystditems = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSSysTDItemDTO>();          
        }
        return this.pssystditems;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysTestDataDTO){
            PSSysTestDataDTO dto = (PSSysTestDataDTO)iEntity;
            dto.setPSSysTDItems(this.getPSSysTDItems());
        }
        super.copyTo(iEntity);
    }
}
