package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSTESTMODULE</B>测试模块 模型传输对象
 * <P>
 * 测试模块模型，定义项目测试中的模块
 */
public class PSSysTestModuleDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysTestModuleDTO(){
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定测试项目模块的代码标识，需要在所在的测试项目中具有唯一性
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
    public PSSysTestModuleDTO codename(String codeName){
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
    public PSSysTestModuleDTO createdate(Timestamp createDate){
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
    public PSSysTestModuleDTO createman(String createMan){
        this.setCreateMan(createMan);
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
    public PSSysTestModuleDTO data(String data){
        this.setData(data);
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
    public PSSysTestModuleDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MODULETAG</B>&nbsp;模块标记，指定测试项目模块的标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_MODULETAG = "moduletag";

    /**
     * 设置 模块标记，详细说明：{@link #FIELD_MODULETAG}
     * 
     * @param moduleTag
     * 
     */
    @JsonProperty(FIELD_MODULETAG)
    public void setModuleTag(String moduleTag){
        this.set(FIELD_MODULETAG, moduleTag);
    }
    
    /**
     * 获取 模块标记  
     * @return
     */
    @JsonIgnore
    public String getModuleTag(){
        Object objValue = this.get(FIELD_MODULETAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模块标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isModuleTagDirty(){
        if(this.contains(FIELD_MODULETAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模块标记
     */
    @JsonIgnore
    public void resetModuleTag(){
        this.reset(FIELD_MODULETAG);
    }

    /**
     * 设置 模块标记，详细说明：{@link #FIELD_MODULETAG}
     * <P>
     * 等同 {@link #setModuleTag}
     * @param moduleTag
     */
    @JsonIgnore
    public PSSysTestModuleDTO moduletag(String moduleTag){
        this.setModuleTag(moduleTag);
        return this;
    }

    /**
     * <B>MODULETAG2</B>&nbsp;模块标记2，指定测试项目模块的标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_MODULETAG2 = "moduletag2";

    /**
     * 设置 模块标记2，详细说明：{@link #FIELD_MODULETAG2}
     * 
     * @param moduleTag2
     * 
     */
    @JsonProperty(FIELD_MODULETAG2)
    public void setModuleTag2(String moduleTag2){
        this.set(FIELD_MODULETAG2, moduleTag2);
    }
    
    /**
     * 获取 模块标记2  
     * @return
     */
    @JsonIgnore
    public String getModuleTag2(){
        Object objValue = this.get(FIELD_MODULETAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模块标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isModuleTag2Dirty(){
        if(this.contains(FIELD_MODULETAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模块标记2
     */
    @JsonIgnore
    public void resetModuleTag2(){
        this.reset(FIELD_MODULETAG2);
    }

    /**
     * 设置 模块标记2，详细说明：{@link #FIELD_MODULETAG2}
     * <P>
     * 等同 {@link #setModuleTag2}
     * @param moduleTag2
     */
    @JsonIgnore
    public PSSysTestModuleDTO moduletag2(String moduleTag2){
        this.setModuleTag2(moduleTag2);
        return this;
    }

    /**
     * <B>MODULETYPE</B>&nbsp;模块类型，指定测试项目模块的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.TestModuleType} 
     */
    public final static String FIELD_MODULETYPE = "moduletype";

    /**
     * 设置 模块类型，详细说明：{@link #FIELD_MODULETYPE}
     * 
     * @param moduleType
     * 
     */
    @JsonProperty(FIELD_MODULETYPE)
    public void setModuleType(String moduleType){
        this.set(FIELD_MODULETYPE, moduleType);
    }
    
    /**
     * 获取 模块类型  
     * @return
     */
    @JsonIgnore
    public String getModuleType(){
        Object objValue = this.get(FIELD_MODULETYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模块类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isModuleTypeDirty(){
        if(this.contains(FIELD_MODULETYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模块类型
     */
    @JsonIgnore
    public void resetModuleType(){
        this.reset(FIELD_MODULETYPE);
    }

    /**
     * 设置 模块类型，详细说明：{@link #FIELD_MODULETYPE}
     * <P>
     * 等同 {@link #setModuleType}
     * @param moduleType
     */
    @JsonIgnore
    public PSSysTestModuleDTO moduletype(String moduleType){
        this.setModuleType(moduleType);
        return this;
    }

     /**
     * 设置 模块类型，详细说明：{@link #FIELD_MODULETYPE}
     * <P>
     * 等同 {@link #setModuleType}
     * @param moduleType
     */
    @JsonIgnore
    public PSSysTestModuleDTO moduletype(net.ibizsys.model.PSModelEnums.TestModuleType moduleType){
        if(moduleType == null){
            this.setModuleType(null);
        }
        else{
            this.setModuleType(moduleType.value);
        }
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;排序值，指定测试项目模块的显示次序
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
    public PSSysTestModuleDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PPSSYSTESTMODULEID</B>&nbsp;父测试模块
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysTestModuleDTO} 
     */
    public final static String FIELD_PPSSYSTESTMODULEID = "ppssystestmoduleid";

    /**
     * 设置 父测试模块
     * 
     * @param pPSSysTestModuleId
     * 
     */
    @JsonProperty(FIELD_PPSSYSTESTMODULEID)
    public void setPPSSysTestModuleId(String pPSSysTestModuleId){
        this.set(FIELD_PPSSYSTESTMODULEID, pPSSysTestModuleId);
    }
    
    /**
     * 获取 父测试模块  
     * @return
     */
    @JsonIgnore
    public String getPPSSysTestModuleId(){
        Object objValue = this.get(FIELD_PPSSYSTESTMODULEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父测试模块 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSSysTestModuleIdDirty(){
        if(this.contains(FIELD_PPSSYSTESTMODULEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父测试模块
     */
    @JsonIgnore
    public void resetPPSSysTestModuleId(){
        this.reset(FIELD_PPSSYSTESTMODULEID);
    }

    /**
     * 设置 父测试模块
     * <P>
     * 等同 {@link #setPPSSysTestModuleId}
     * @param pPSSysTestModuleId
     */
    @JsonIgnore
    public PSSysTestModuleDTO ppssystestmoduleid(String pPSSysTestModuleId){
        this.setPPSSysTestModuleId(pPSSysTestModuleId);
        return this;
    }

    /**
     * 设置 父测试模块，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPPSSysTestModuleId}
     * @param pSSysTestModule 引用对象
     */
    @JsonIgnore
    public PSSysTestModuleDTO ppssystestmoduleid(PSSysTestModuleDTO pSSysTestModule){
        if(pSSysTestModule == null){
            this.setPPSSysTestModuleId(null);
            this.setPPSSysTestModuleName(null);
        }
        else{
            this.setPPSSysTestModuleId(pSSysTestModule.getPSSysTestModuleId());
            this.setPPSSysTestModuleName(pSSysTestModule.getPSSysTestModuleName());
        }
        return this;
    }

    /**
     * <B>PPSSYSTESTMODULENAME</B>&nbsp;父测试模块
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PPSSYSTESTMODULEID}
     */
    public final static String FIELD_PPSSYSTESTMODULENAME = "ppssystestmodulename";

    /**
     * 设置 父测试模块
     * 
     * @param pPSSysTestModuleName
     * 
     */
    @JsonProperty(FIELD_PPSSYSTESTMODULENAME)
    public void setPPSSysTestModuleName(String pPSSysTestModuleName){
        this.set(FIELD_PPSSYSTESTMODULENAME, pPSSysTestModuleName);
    }
    
    /**
     * 获取 父测试模块  
     * @return
     */
    @JsonIgnore
    public String getPPSSysTestModuleName(){
        Object objValue = this.get(FIELD_PPSSYSTESTMODULENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父测试模块 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSSysTestModuleNameDirty(){
        if(this.contains(FIELD_PPSSYSTESTMODULENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父测试模块
     */
    @JsonIgnore
    public void resetPPSSysTestModuleName(){
        this.reset(FIELD_PPSSYSTESTMODULENAME);
    }

    /**
     * 设置 父测试模块
     * <P>
     * 等同 {@link #setPPSSysTestModuleName}
     * @param pPSSysTestModuleName
     */
    @JsonIgnore
    public PSSysTestModuleDTO ppssystestmodulename(String pPSSysTestModuleName){
        this.setPPSSysTestModuleName(pPSSysTestModuleName);
        return this;
    }

    /**
     * <B>PSSYSAPPID</B>&nbsp;应用标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSTESTPRJID}
     */
    public final static String FIELD_PSSYSAPPID = "pssysappid";

    /**
     * 设置 应用标识
     * 
     * @param pSSysAppId
     * 
     */
    @JsonProperty(FIELD_PSSYSAPPID)
    public void setPSSysAppId(String pSSysAppId){
        this.set(FIELD_PSSYSAPPID, pSSysAppId);
    }
    
    /**
     * 获取 应用标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysAppId(){
        Object objValue = this.get(FIELD_PSSYSAPPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysAppIdDirty(){
        if(this.contains(FIELD_PSSYSAPPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用标识
     */
    @JsonIgnore
    public void resetPSSysAppId(){
        this.reset(FIELD_PSSYSAPPID);
    }

    /**
     * 设置 应用标识
     * <P>
     * 等同 {@link #setPSSysAppId}
     * @param pSSysAppId
     */
    @JsonIgnore
    public PSSysTestModuleDTO pssysappid(String pSSysAppId){
        this.setPSSysAppId(pSSysAppId);
        return this;
    }

    /**
     * <B>PSSYSSERVICEAPIID</B>&nbsp;系统服务接口标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSTESTPRJID}
     */
    public final static String FIELD_PSSYSSERVICEAPIID = "pssysserviceapiid";

    /**
     * 设置 系统服务接口标识
     * 
     * @param pSSysServiceAPIId
     * 
     */
    @JsonProperty(FIELD_PSSYSSERVICEAPIID)
    public void setPSSysServiceAPIId(String pSSysServiceAPIId){
        this.set(FIELD_PSSYSSERVICEAPIID, pSSysServiceAPIId);
    }
    
    /**
     * 获取 系统服务接口标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysServiceAPIId(){
        Object objValue = this.get(FIELD_PSSYSSERVICEAPIID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统服务接口标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysServiceAPIIdDirty(){
        if(this.contains(FIELD_PSSYSSERVICEAPIID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统服务接口标识
     */
    @JsonIgnore
    public void resetPSSysServiceAPIId(){
        this.reset(FIELD_PSSYSSERVICEAPIID);
    }

    /**
     * 设置 系统服务接口标识
     * <P>
     * 等同 {@link #setPSSysServiceAPIId}
     * @param pSSysServiceAPIId
     */
    @JsonIgnore
    public PSSysTestModuleDTO pssysserviceapiid(String pSSysServiceAPIId){
        this.setPSSysServiceAPIId(pSSysServiceAPIId);
        return this;
    }

    /**
     * <B>PSSYSTESTDATAID</B>&nbsp;测试数据
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysTestDataDTO} 
     */
    public final static String FIELD_PSSYSTESTDATAID = "pssystestdataid";

    /**
     * 设置 测试数据
     * 
     * @param pSSysTestDataId
     * 
     */
    @JsonProperty(FIELD_PSSYSTESTDATAID)
    public void setPSSysTestDataId(String pSSysTestDataId){
        this.set(FIELD_PSSYSTESTDATAID, pSSysTestDataId);
    }
    
    /**
     * 获取 测试数据  
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
     * 判断 测试数据 是否指定值，包括空值
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
     * 重置 测试数据
     */
    @JsonIgnore
    public void resetPSSysTestDataId(){
        this.reset(FIELD_PSSYSTESTDATAID);
    }

    /**
     * 设置 测试数据
     * <P>
     * 等同 {@link #setPSSysTestDataId}
     * @param pSSysTestDataId
     */
    @JsonIgnore
    public PSSysTestModuleDTO pssystestdataid(String pSSysTestDataId){
        this.setPSSysTestDataId(pSSysTestDataId);
        return this;
    }

    /**
     * 设置 测试数据，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysTestDataId}
     * @param pSSysTestData 引用对象
     */
    @JsonIgnore
    public PSSysTestModuleDTO pssystestdataid(PSSysTestDataDTO pSSysTestData){
        if(pSSysTestData == null){
            this.setPSSysTestDataId(null);
            this.setPSSysTestDataName(null);
        }
        else{
            this.setPSSysTestDataId(pSSysTestData.getPSSysTestDataId());
            this.setPSSysTestDataName(pSSysTestData.getPSSysTestDataName());
        }
        return this;
    }

    /**
     * <B>PSSYSTESTDATANAME</B>&nbsp;测试数据
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSTESTDATAID}
     */
    public final static String FIELD_PSSYSTESTDATANAME = "pssystestdataname";

    /**
     * 设置 测试数据
     * 
     * @param pSSysTestDataName
     * 
     */
    @JsonProperty(FIELD_PSSYSTESTDATANAME)
    public void setPSSysTestDataName(String pSSysTestDataName){
        this.set(FIELD_PSSYSTESTDATANAME, pSSysTestDataName);
    }
    
    /**
     * 获取 测试数据  
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
     * 判断 测试数据 是否指定值，包括空值
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
     * 重置 测试数据
     */
    @JsonIgnore
    public void resetPSSysTestDataName(){
        this.reset(FIELD_PSSYSTESTDATANAME);
    }

    /**
     * 设置 测试数据
     * <P>
     * 等同 {@link #setPSSysTestDataName}
     * @param pSSysTestDataName
     */
    @JsonIgnore
    public PSSysTestModuleDTO pssystestdataname(String pSSysTestDataName){
        this.setPSSysTestDataName(pSSysTestDataName);
        return this;
    }

    /**
     * <B>PSSYSTESTMODULEID</B>&nbsp;测试模块标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSTESTMODULEID = "pssystestmoduleid";

    /**
     * 设置 测试模块标识
     * 
     * @param pSSysTestModuleId
     * 
     */
    @JsonProperty(FIELD_PSSYSTESTMODULEID)
    public void setPSSysTestModuleId(String pSSysTestModuleId){
        this.set(FIELD_PSSYSTESTMODULEID, pSSysTestModuleId);
    }
    
    /**
     * 获取 测试模块标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysTestModuleId(){
        Object objValue = this.get(FIELD_PSSYSTESTMODULEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 测试模块标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysTestModuleIdDirty(){
        if(this.contains(FIELD_PSSYSTESTMODULEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 测试模块标识
     */
    @JsonIgnore
    public void resetPSSysTestModuleId(){
        this.reset(FIELD_PSSYSTESTMODULEID);
    }

    /**
     * 设置 测试模块标识
     * <P>
     * 等同 {@link #setPSSysTestModuleId}
     * @param pSSysTestModuleId
     */
    @JsonIgnore
    public PSSysTestModuleDTO pssystestmoduleid(String pSSysTestModuleId){
        this.setPSSysTestModuleId(pSSysTestModuleId);
        return this;
    }

    /**
     * <B>PSSYSTESTMODULENAME</B>&nbsp;测试模块名称，指定测试项目模块的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSTESTMODULENAME = "pssystestmodulename";

    /**
     * 设置 测试模块名称，详细说明：{@link #FIELD_PSSYSTESTMODULENAME}
     * 
     * @param pSSysTestModuleName
     * 
     */
    @JsonProperty(FIELD_PSSYSTESTMODULENAME)
    public void setPSSysTestModuleName(String pSSysTestModuleName){
        this.set(FIELD_PSSYSTESTMODULENAME, pSSysTestModuleName);
    }
    
    /**
     * 获取 测试模块名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysTestModuleName(){
        Object objValue = this.get(FIELD_PSSYSTESTMODULENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 测试模块名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysTestModuleNameDirty(){
        if(this.contains(FIELD_PSSYSTESTMODULENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 测试模块名称
     */
    @JsonIgnore
    public void resetPSSysTestModuleName(){
        this.reset(FIELD_PSSYSTESTMODULENAME);
    }

    /**
     * 设置 测试模块名称，详细说明：{@link #FIELD_PSSYSTESTMODULENAME}
     * <P>
     * 等同 {@link #setPSSysTestModuleName}
     * @param pSSysTestModuleName
     */
    @JsonIgnore
    public PSSysTestModuleDTO pssystestmodulename(String pSSysTestModuleName){
        this.setPSSysTestModuleName(pSSysTestModuleName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysTestModuleName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysTestModuleName(strName);
    }

    @JsonIgnore
    public PSSysTestModuleDTO name(String strName){
        this.setPSSysTestModuleName(strName);
        return this;
    }

    /**
     * <B>PSSYSTESTPRJID</B>&nbsp;测试项目，指定测试项目模块所属的测试项目
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysTestPrjDTO} 
     */
    public final static String FIELD_PSSYSTESTPRJID = "pssystestprjid";

    /**
     * 设置 测试项目，详细说明：{@link #FIELD_PSSYSTESTPRJID}
     * 
     * @param pSSysTestPrjId
     * 
     */
    @JsonProperty(FIELD_PSSYSTESTPRJID)
    public void setPSSysTestPrjId(String pSSysTestPrjId){
        this.set(FIELD_PSSYSTESTPRJID, pSSysTestPrjId);
    }
    
    /**
     * 获取 测试项目  
     * @return
     */
    @JsonIgnore
    public String getPSSysTestPrjId(){
        Object objValue = this.get(FIELD_PSSYSTESTPRJID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 测试项目 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysTestPrjIdDirty(){
        if(this.contains(FIELD_PSSYSTESTPRJID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 测试项目
     */
    @JsonIgnore
    public void resetPSSysTestPrjId(){
        this.reset(FIELD_PSSYSTESTPRJID);
    }

    /**
     * 设置 测试项目，详细说明：{@link #FIELD_PSSYSTESTPRJID}
     * <P>
     * 等同 {@link #setPSSysTestPrjId}
     * @param pSSysTestPrjId
     */
    @JsonIgnore
    public PSSysTestModuleDTO pssystestprjid(String pSSysTestPrjId){
        this.setPSSysTestPrjId(pSSysTestPrjId);
        return this;
    }

    /**
     * 设置 测试项目，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysTestPrjId}
     * @param pSSysTestPrj 引用对象
     */
    @JsonIgnore
    public PSSysTestModuleDTO pssystestprjid(PSSysTestPrjDTO pSSysTestPrj){
        if(pSSysTestPrj == null){
            this.setPSSysAppId(null);
            this.setPSSysServiceAPIId(null);
            this.setPSSysTestPrjId(null);
            this.setPSSysTestPrjName(null);
        }
        else{
            this.setPSSysAppId(pSSysTestPrj.getPSSysAppId());
            this.setPSSysServiceAPIId(pSSysTestPrj.getPSSysServiceAPIId());
            this.setPSSysTestPrjId(pSSysTestPrj.getPSSysTestPrjId());
            this.setPSSysTestPrjName(pSSysTestPrj.getPSSysTestPrjName());
        }
        return this;
    }

    /**
     * <B>PSSYSTESTPRJNAME</B>&nbsp;测试项目，指定测试项目模块所属的测试项目
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSTESTPRJID}
     */
    public final static String FIELD_PSSYSTESTPRJNAME = "pssystestprjname";

    /**
     * 设置 测试项目，详细说明：{@link #FIELD_PSSYSTESTPRJNAME}
     * 
     * @param pSSysTestPrjName
     * 
     */
    @JsonProperty(FIELD_PSSYSTESTPRJNAME)
    public void setPSSysTestPrjName(String pSSysTestPrjName){
        this.set(FIELD_PSSYSTESTPRJNAME, pSSysTestPrjName);
    }
    
    /**
     * 获取 测试项目  
     * @return
     */
    @JsonIgnore
    public String getPSSysTestPrjName(){
        Object objValue = this.get(FIELD_PSSYSTESTPRJNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 测试项目 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysTestPrjNameDirty(){
        if(this.contains(FIELD_PSSYSTESTPRJNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 测试项目
     */
    @JsonIgnore
    public void resetPSSysTestPrjName(){
        this.reset(FIELD_PSSYSTESTPRJNAME);
    }

    /**
     * 设置 测试项目，详细说明：{@link #FIELD_PSSYSTESTPRJNAME}
     * <P>
     * 等同 {@link #setPSSysTestPrjName}
     * @param pSSysTestPrjName
     */
    @JsonIgnore
    public PSSysTestModuleDTO pssystestprjname(String pSSysTestPrjName){
        this.setPSSysTestPrjName(pSSysTestPrjName);
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
    public PSSysTestModuleDTO updatedate(Timestamp updateDate){
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
    public PSSysTestModuleDTO updateman(String updateMan){
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
    public PSSysTestModuleDTO usercat(String userCat){
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
    public PSSysTestModuleDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat.value);
        }
        return this;
    }

    /**
     * <B>USERPARAMS</B>&nbsp;用户自定义参数
     */
    public final static String FIELD_USERPARAMS = "userparams";

    /**
     * 设置 用户自定义参数
     * 
     * @param userParams
     * 
     */
    @JsonProperty(FIELD_USERPARAMS)
    public void setUserParams(String userParams){
        this.set(FIELD_USERPARAMS, userParams);
    }
    
    /**
     * 获取 用户自定义参数  
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
     * 判断 用户自定义参数 是否指定值，包括空值
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
     * 重置 用户自定义参数
     */
    @JsonIgnore
    public void resetUserParams(){
        this.reset(FIELD_USERPARAMS);
    }

    /**
     * 设置 用户自定义参数
     * <P>
     * 等同 {@link #setUserParams}
     * @param userParams
     */
    @JsonIgnore
    public PSSysTestModuleDTO userparams(String userParams){
        this.setUserParams(userParams);
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
    public PSSysTestModuleDTO usertag(String userTag){
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
    public PSSysTestModuleDTO usertag2(String userTag2){
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
    public PSSysTestModuleDTO usertag3(String userTag3){
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
    public PSSysTestModuleDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>UTILPARAMS</B>&nbsp;功能参数
     */
    public final static String FIELD_UTILPARAMS = "utilparams";

    /**
     * 设置 功能参数
     * 
     * @param utilParams
     * 
     */
    @JsonProperty(FIELD_UTILPARAMS)
    public void setUtilParams(String utilParams){
        this.set(FIELD_UTILPARAMS, utilParams);
    }
    
    /**
     * 获取 功能参数  
     * @return
     */
    @JsonIgnore
    public String getUtilParams(){
        Object objValue = this.get(FIELD_UTILPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilParamsDirty(){
        if(this.contains(FIELD_UTILPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能参数
     */
    @JsonIgnore
    public void resetUtilParams(){
        this.reset(FIELD_UTILPARAMS);
    }

    /**
     * 设置 功能参数
     * <P>
     * 等同 {@link #setUtilParams}
     * @param utilParams
     */
    @JsonIgnore
    public PSSysTestModuleDTO utilparams(String utilParams){
        this.setUtilParams(utilParams);
        return this;
    }

    /**
     * <B>UTILTAG</B>&nbsp;功能标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_UTILTAG = "utiltag";

    /**
     * 设置 功能标记
     * 
     * @param utilTag
     * 
     */
    @JsonProperty(FIELD_UTILTAG)
    public void setUtilTag(String utilTag){
        this.set(FIELD_UTILTAG, utilTag);
    }
    
    /**
     * 获取 功能标记  
     * @return
     */
    @JsonIgnore
    public String getUtilTag(){
        Object objValue = this.get(FIELD_UTILTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilTagDirty(){
        if(this.contains(FIELD_UTILTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能标记
     */
    @JsonIgnore
    public void resetUtilTag(){
        this.reset(FIELD_UTILTAG);
    }

    /**
     * 设置 功能标记
     * <P>
     * 等同 {@link #setUtilTag}
     * @param utilTag
     */
    @JsonIgnore
    public PSSysTestModuleDTO utiltag(String utilTag){
        this.setUtilTag(utilTag);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSSysTestModuleId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysTestModuleId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysTestModuleId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysTestModuleId(strValue);
    }

    @JsonIgnore
    public PSSysTestModuleDTO id(String strValue){
        this.setPSSysTestModuleId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysTestModuleDTO){
            PSSysTestModuleDTO dto = (PSSysTestModuleDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
