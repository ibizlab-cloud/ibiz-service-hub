package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSWFPROCPARAM</B>流程处理参数 模型传输对象
 * <P>
 * 流程处理逻辑节点参数模型，为处理节点提供动态参数定义能力
 */
public class PSWFProcParam extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSWFProcParam(){
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
    public PSWFProcParam createdate(String createDate){
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
    public PSWFProcParam createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CUSTOMDSTDEFNAME</B>&nbsp;自定义设置属性，指定流程处理参数设置的自定义属性，在无法从实体中选择合适的属性时使用，引擎计算属性时优先使用此配置
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CUSTOMDSTDEFNAME = "customdstdefname";

    /**
     * 设置 自定义设置属性，详细说明：{@link #FIELD_CUSTOMDSTDEFNAME}
     * 
     * @param customDstDEFName
     * 
     */
    @JsonProperty(FIELD_CUSTOMDSTDEFNAME)
    public void setCustomDstDEFName(String customDstDEFName){
        this.set(FIELD_CUSTOMDSTDEFNAME, customDstDEFName);
    }
    
    /**
     * 获取 自定义设置属性  
     * @return
     */
    @JsonIgnore
    public String getCustomDstDEFName(){
        Object objValue = this.get(FIELD_CUSTOMDSTDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义设置属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomDstDEFNameDirty(){
        if(this.contains(FIELD_CUSTOMDSTDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义设置属性
     */
    @JsonIgnore
    public void resetCustomDstDEFName(){
        this.reset(FIELD_CUSTOMDSTDEFNAME);
    }

    /**
     * 设置 自定义设置属性，详细说明：{@link #FIELD_CUSTOMDSTDEFNAME}
     * <P>
     * 等同 {@link #setCustomDstDEFName}
     * @param customDstDEFName
     */
    @JsonIgnore
    public PSWFProcParam customdstdefname(String customDstDEFName){
        this.setCustomDstDEFName(customDstDEFName);
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
    public PSWFProcParam memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSDEFID</B>&nbsp;设置属性，指定流程处理参数设置的属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_PSDEFID = "psdefid";

    /**
     * 设置 设置属性，详细说明：{@link #FIELD_PSDEFID}
     * 
     * @param pSDEFId
     * 
     */
    @JsonProperty(FIELD_PSDEFID)
    public void setPSDEFId(String pSDEFId){
        this.set(FIELD_PSDEFID, pSDEFId);
    }
    
    /**
     * 获取 设置属性  
     * @return
     */
    @JsonIgnore
    public String getPSDEFId(){
        Object objValue = this.get(FIELD_PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 设置属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFIdDirty(){
        if(this.contains(FIELD_PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 设置属性
     */
    @JsonIgnore
    public void resetPSDEFId(){
        this.reset(FIELD_PSDEFID);
    }

    /**
     * 设置 设置属性，详细说明：{@link #FIELD_PSDEFID}
     * <P>
     * 等同 {@link #setPSDEFId}
     * @param pSDEFId
     */
    @JsonIgnore
    public PSWFProcParam psdefid(String pSDEFId){
        this.setPSDEFId(pSDEFId);
        return this;
    }

    /**
     * 设置 设置属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSWFProcParam psdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setPSDEFId(null);
            this.setPSDEFName(null);
        }
        else{
            this.setPSDEFId(pSDEField.getPSDEFieldId());
            this.setPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>PSDEFNAME</B>&nbsp;设置属性，指定流程处理参数设置的属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFID}
     */
    public final static String FIELD_PSDEFNAME = "psdefname";

    /**
     * 设置 设置属性，详细说明：{@link #FIELD_PSDEFNAME}
     * 
     * @param pSDEFName
     * 
     */
    @JsonProperty(FIELD_PSDEFNAME)
    public void setPSDEFName(String pSDEFName){
        this.set(FIELD_PSDEFNAME, pSDEFName);
    }
    
    /**
     * 获取 设置属性  
     * @return
     */
    @JsonIgnore
    public String getPSDEFName(){
        Object objValue = this.get(FIELD_PSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 设置属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFNameDirty(){
        if(this.contains(FIELD_PSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 设置属性
     */
    @JsonIgnore
    public void resetPSDEFName(){
        this.reset(FIELD_PSDEFNAME);
    }

    /**
     * 设置 设置属性，详细说明：{@link #FIELD_PSDEFNAME}
     * <P>
     * 等同 {@link #setPSDEFName}
     * @param pSDEFName
     */
    @JsonIgnore
    public PSWFProcParam psdefname(String pSDEFName){
        this.setPSDEFName(pSDEFName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;PSDEID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWFPROCESSID}
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 PSDEID
     * 
     * @param pSDEId
     * 
     */
    @JsonProperty(FIELD_PSDEID)
    public void setPSDEId(String pSDEId){
        this.set(FIELD_PSDEID, pSDEId);
    }
    
    /**
     * 获取 PSDEID  
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
     * 判断 PSDEID 是否指定值，包括空值
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
     * 重置 PSDEID
     */
    @JsonIgnore
    public void resetPSDEId(){
        this.reset(FIELD_PSDEID);
    }

    /**
     * 设置 PSDEID
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSWFProcParam psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * <B>PSWFPROCESSID</B>&nbsp;流程处理，指定流程处理参数所属的流程处理
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSWFProcess} 
     */
    public final static String FIELD_PSWFPROCESSID = "pswfprocessid";

    /**
     * 设置 流程处理，详细说明：{@link #FIELD_PSWFPROCESSID}
     * 
     * @param pSWFProcessId
     * 
     */
    @JsonProperty(FIELD_PSWFPROCESSID)
    public void setPSWFProcessId(String pSWFProcessId){
        this.set(FIELD_PSWFPROCESSID, pSWFProcessId);
    }
    
    /**
     * 获取 流程处理  
     * @return
     */
    @JsonIgnore
    public String getPSWFProcessId(){
        Object objValue = this.get(FIELD_PSWFPROCESSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程处理 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFProcessIdDirty(){
        if(this.contains(FIELD_PSWFPROCESSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程处理
     */
    @JsonIgnore
    public void resetPSWFProcessId(){
        this.reset(FIELD_PSWFPROCESSID);
    }

    /**
     * 设置 流程处理，详细说明：{@link #FIELD_PSWFPROCESSID}
     * <P>
     * 等同 {@link #setPSWFProcessId}
     * @param pSWFProcessId
     */
    @JsonIgnore
    public PSWFProcParam pswfprocessid(String pSWFProcessId){
        this.setPSWFProcessId(pSWFProcessId);
        return this;
    }

    /**
     * 设置 流程处理，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSWFProcessId}
     * @param pSWFProcess 引用对象
     */
    @JsonIgnore
    public PSWFProcParam pswfprocessid(PSWFProcess pSWFProcess){
        if(pSWFProcess == null){
            this.setPSDEId(null);
            this.setPSWFProcessId(null);
            this.setPSWFProcessName(null);
            this.setPSWFVersionId(null);
        }
        else{
            this.setPSDEId(pSWFProcess.getPSDEId());
            this.setPSWFProcessId(pSWFProcess.getPSWFProcessId());
            this.setPSWFProcessName(pSWFProcess.getPSWFProcessName());
            this.setPSWFVersionId(pSWFProcess.getPSWFVersionId());
        }
        return this;
    }

    /**
     * <B>PSWFPROCESSNAME</B>&nbsp;流程处理，指定流程处理参数所属的流程处理
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWFPROCESSID}
     */
    public final static String FIELD_PSWFPROCESSNAME = "pswfprocessname";

    /**
     * 设置 流程处理，详细说明：{@link #FIELD_PSWFPROCESSNAME}
     * 
     * @param pSWFProcessName
     * 
     */
    @JsonProperty(FIELD_PSWFPROCESSNAME)
    public void setPSWFProcessName(String pSWFProcessName){
        this.set(FIELD_PSWFPROCESSNAME, pSWFProcessName);
    }
    
    /**
     * 获取 流程处理  
     * @return
     */
    @JsonIgnore
    public String getPSWFProcessName(){
        Object objValue = this.get(FIELD_PSWFPROCESSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程处理 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFProcessNameDirty(){
        if(this.contains(FIELD_PSWFPROCESSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程处理
     */
    @JsonIgnore
    public void resetPSWFProcessName(){
        this.reset(FIELD_PSWFPROCESSNAME);
    }

    /**
     * 设置 流程处理，详细说明：{@link #FIELD_PSWFPROCESSNAME}
     * <P>
     * 等同 {@link #setPSWFProcessName}
     * @param pSWFProcessName
     */
    @JsonIgnore
    public PSWFProcParam pswfprocessname(String pSWFProcessName){
        this.setPSWFProcessName(pSWFProcessName);
        return this;
    }

    /**
     * <B>PSWFPROCPARAMID</B>&nbsp;流程处理参数标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSWFPROCPARAMID = "pswfprocparamid";

    /**
     * 设置 流程处理参数标识
     * 
     * @param pSWFProcParamId
     * 
     */
    @JsonProperty(FIELD_PSWFPROCPARAMID)
    public void setPSWFProcParamId(String pSWFProcParamId){
        this.set(FIELD_PSWFPROCPARAMID, pSWFProcParamId);
    }
    
    /**
     * 获取 流程处理参数标识  
     * @return
     */
    @JsonIgnore
    public String getPSWFProcParamId(){
        Object objValue = this.get(FIELD_PSWFPROCPARAMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程处理参数标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFProcParamIdDirty(){
        if(this.contains(FIELD_PSWFPROCPARAMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程处理参数标识
     */
    @JsonIgnore
    public void resetPSWFProcParamId(){
        this.reset(FIELD_PSWFPROCPARAMID);
    }

    /**
     * 设置 流程处理参数标识
     * <P>
     * 等同 {@link #setPSWFProcParamId}
     * @param pSWFProcParamId
     */
    @JsonIgnore
    public PSWFProcParam pswfprocparamid(String pSWFProcParamId){
        this.setPSWFProcParamId(pSWFProcParamId);
        return this;
    }

    /**
     * <B>PSWFPROCPARAMNAME</B>&nbsp;流程处理参数信息，指定流程处理参数的信息
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSWFPROCPARAMNAME = "pswfprocparamname";

    /**
     * 设置 流程处理参数信息，详细说明：{@link #FIELD_PSWFPROCPARAMNAME}
     * 
     * @param pSWFProcParamName
     * 
     */
    @JsonProperty(FIELD_PSWFPROCPARAMNAME)
    public void setPSWFProcParamName(String pSWFProcParamName){
        this.set(FIELD_PSWFPROCPARAMNAME, pSWFProcParamName);
    }
    
    /**
     * 获取 流程处理参数信息  
     * @return
     */
    @JsonIgnore
    public String getPSWFProcParamName(){
        Object objValue = this.get(FIELD_PSWFPROCPARAMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程处理参数信息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFProcParamNameDirty(){
        if(this.contains(FIELD_PSWFPROCPARAMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程处理参数信息
     */
    @JsonIgnore
    public void resetPSWFProcParamName(){
        this.reset(FIELD_PSWFPROCPARAMNAME);
    }

    /**
     * 设置 流程处理参数信息，详细说明：{@link #FIELD_PSWFPROCPARAMNAME}
     * <P>
     * 等同 {@link #setPSWFProcParamName}
     * @param pSWFProcParamName
     */
    @JsonIgnore
    public PSWFProcParam pswfprocparamname(String pSWFProcParamName){
        this.setPSWFProcParamName(pSWFProcParamName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSWFProcParamName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSWFProcParamName(strName);
    }

    @JsonIgnore
    public PSWFProcParam name(String strName){
        this.setPSWFProcParamName(strName);
        return this;
    }

    /**
     * <B>PSWFVERSIONID</B>&nbsp;PSWFVERSIONID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWFPROCESSID}
     */
    public final static String FIELD_PSWFVERSIONID = "pswfversionid";

    /**
     * 设置 PSWFVERSIONID
     * 
     * @param pSWFVersionId
     * 
     */
    @JsonProperty(FIELD_PSWFVERSIONID)
    public void setPSWFVersionId(String pSWFVersionId){
        this.set(FIELD_PSWFVERSIONID, pSWFVersionId);
    }
    
    /**
     * 获取 PSWFVERSIONID  
     * @return
     */
    @JsonIgnore
    public String getPSWFVersionId(){
        Object objValue = this.get(FIELD_PSWFVERSIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 PSWFVERSIONID 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFVersionIdDirty(){
        if(this.contains(FIELD_PSWFVERSIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 PSWFVERSIONID
     */
    @JsonIgnore
    public void resetPSWFVersionId(){
        this.reset(FIELD_PSWFVERSIONID);
    }

    /**
     * 设置 PSWFVERSIONID
     * <P>
     * 等同 {@link #setPSWFVersionId}
     * @param pSWFVersionId
     */
    @JsonIgnore
    public PSWFProcParam pswfversionid(String pSWFVersionId){
        this.setPSWFVersionId(pSWFVersionId);
        return this;
    }

    /**
     * <B>SRCVALUE</B>&nbsp;参数值，指定流程处理参数的参数值，如存在参数值类型则为指定类型对象的键名
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_SRCVALUE = "srcvalue";

    /**
     * 设置 参数值，详细说明：{@link #FIELD_SRCVALUE}
     * 
     * @param srcValue
     * 
     */
    @JsonProperty(FIELD_SRCVALUE)
    public void setSrcValue(String srcValue){
        this.set(FIELD_SRCVALUE, srcValue);
    }
    
    /**
     * 获取 参数值  
     * @return
     */
    @JsonIgnore
    public String getSrcValue(){
        Object objValue = this.get(FIELD_SRCVALUE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSrcValueDirty(){
        if(this.contains(FIELD_SRCVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数值
     */
    @JsonIgnore
    public void resetSrcValue(){
        this.reset(FIELD_SRCVALUE);
    }

    /**
     * 设置 参数值，详细说明：{@link #FIELD_SRCVALUE}
     * <P>
     * 等同 {@link #setSrcValue}
     * @param srcValue
     */
    @JsonIgnore
    public PSWFProcParam srcvalue(String srcValue){
        this.setSrcValue(srcValue);
        return this;
    }

    /**
     * <B>SRCVALUETYPE</B>&nbsp;参数值类型，指定流程处理参数的值类型，未定义时为直接使用参数值
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.WFProcParamValueType} 
     */
    public final static String FIELD_SRCVALUETYPE = "srcvaluetype";

    /**
     * 设置 参数值类型，详细说明：{@link #FIELD_SRCVALUETYPE}
     * 
     * @param srcValueType
     * 
     */
    @JsonProperty(FIELD_SRCVALUETYPE)
    public void setSrcValueType(String srcValueType){
        this.set(FIELD_SRCVALUETYPE, srcValueType);
    }
    
    /**
     * 获取 参数值类型  
     * @return
     */
    @JsonIgnore
    public String getSrcValueType(){
        Object objValue = this.get(FIELD_SRCVALUETYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数值类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSrcValueTypeDirty(){
        if(this.contains(FIELD_SRCVALUETYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数值类型
     */
    @JsonIgnore
    public void resetSrcValueType(){
        this.reset(FIELD_SRCVALUETYPE);
    }

    /**
     * 设置 参数值类型，详细说明：{@link #FIELD_SRCVALUETYPE}
     * <P>
     * 等同 {@link #setSrcValueType}
     * @param srcValueType
     */
    @JsonIgnore
    public PSWFProcParam srcvaluetype(String srcValueType){
        this.setSrcValueType(srcValueType);
        return this;
    }

     /**
     * 设置 参数值类型，详细说明：{@link #FIELD_SRCVALUETYPE}
     * <P>
     * 等同 {@link #setSrcValueType}
     * @param srcValueType
     */
    @JsonIgnore
    public PSWFProcParam srcvaluetype(net.ibizsys.psmodel.core.util.PSModelEnums.WFProcParamValueType srcValueType){
        if(srcValueType == null){
            this.setSrcValueType(null);
        }
        else{
            this.setSrcValueType(srcValueType.value);
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
    public PSWFProcParam updatedate(String updateDate){
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
    public PSWFProcParam updateman(String updateMan){
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
    public PSWFProcParam usercat(String userCat){
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
    public PSWFProcParam usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat.value);
        }
        return this;
    }

    /**
     * <B>USERDATA</B>&nbsp;参数数据，指定流程处理参数的数据
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_USERDATA = "userdata";

    /**
     * 设置 参数数据，详细说明：{@link #FIELD_USERDATA}
     * 
     * @param userData
     * 
     */
    @JsonProperty(FIELD_USERDATA)
    public void setUserData(String userData){
        this.set(FIELD_USERDATA, userData);
    }
    
    /**
     * 获取 参数数据  
     * @return
     */
    @JsonIgnore
    public String getUserData(){
        Object objValue = this.get(FIELD_USERDATA);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数数据 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserDataDirty(){
        if(this.contains(FIELD_USERDATA)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数数据
     */
    @JsonIgnore
    public void resetUserData(){
        this.reset(FIELD_USERDATA);
    }

    /**
     * 设置 参数数据，详细说明：{@link #FIELD_USERDATA}
     * <P>
     * 等同 {@link #setUserData}
     * @param userData
     */
    @JsonIgnore
    public PSWFProcParam userdata(String userData){
        this.setUserData(userData);
        return this;
    }

    /**
     * <B>USERDATA2</B>&nbsp;参数数据2，指定流程处理参数的数据2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_USERDATA2 = "userdata2";

    /**
     * 设置 参数数据2，详细说明：{@link #FIELD_USERDATA2}
     * 
     * @param userData2
     * 
     */
    @JsonProperty(FIELD_USERDATA2)
    public void setUserData2(String userData2){
        this.set(FIELD_USERDATA2, userData2);
    }
    
    /**
     * 获取 参数数据2  
     * @return
     */
    @JsonIgnore
    public String getUserData2(){
        Object objValue = this.get(FIELD_USERDATA2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数数据2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserData2Dirty(){
        if(this.contains(FIELD_USERDATA2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数数据2
     */
    @JsonIgnore
    public void resetUserData2(){
        this.reset(FIELD_USERDATA2);
    }

    /**
     * 设置 参数数据2，详细说明：{@link #FIELD_USERDATA2}
     * <P>
     * 等同 {@link #setUserData2}
     * @param userData2
     */
    @JsonIgnore
    public PSWFProcParam userdata2(String userData2){
        this.setUserData2(userData2);
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
    public PSWFProcParam usertag(String userTag){
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
    public PSWFProcParam usertag2(String userTag2){
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
    public PSWFProcParam usertag3(String userTag3){
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
    public PSWFProcParam usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSWFProcParamId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSWFProcParamId(strValue);
    }

    @JsonIgnore
    public PSWFProcParam id(String strValue){
        this.setPSWFProcParamId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSWFProcParam){
            PSWFProcParam model = (PSWFProcParam)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
