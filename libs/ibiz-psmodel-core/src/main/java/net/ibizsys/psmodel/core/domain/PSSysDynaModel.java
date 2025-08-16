package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSSYSDYNAMODEL</B>系统动态模型对象 模型传输对象
 * <P>
 * 动态模型对象模型，用于补充或扩展标准模型定义。定义动态模型一般有两种形式，一种是直接以JSON内容定义，另一种则使用动态模型属性进行明细定义，使用动态模型属性定义多一层标准目录，具体使用何种形式由建模方与模型消费方自行约定
 */
public class PSSysDynaModel extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysDynaModel(){
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定系统动态模型的代码标识，需要在所在的模型域（系统模块或系统）中具有唯一性
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
    public PSSysDynaModel codename(String codeName){
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
    public PSSysDynaModel createdate(String createDate){
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
    public PSSysDynaModel createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DEFAULTFLAG</B>&nbsp;系统或模块默认，指定动态模型是否为系统或所属模型的默认动态模型，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEFAULTFLAG = "defaultflag";

    /**
     * 设置 系统或模块默认，详细说明：{@link #FIELD_DEFAULTFLAG}
     * 
     * @param defaultFlag
     * 
     */
    @JsonProperty(FIELD_DEFAULTFLAG)
    public void setDefaultFlag(Integer defaultFlag){
        this.set(FIELD_DEFAULTFLAG, defaultFlag);
    }
    
    /**
     * 获取 系统或模块默认  
     * @return
     */
    @JsonIgnore
    public Integer getDefaultFlag(){
        Object objValue = this.get(FIELD_DEFAULTFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 系统或模块默认 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefaultFlagDirty(){
        if(this.contains(FIELD_DEFAULTFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统或模块默认
     */
    @JsonIgnore
    public void resetDefaultFlag(){
        this.reset(FIELD_DEFAULTFLAG);
    }

    /**
     * 设置 系统或模块默认，详细说明：{@link #FIELD_DEFAULTFLAG}
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSSysDynaModel defaultflag(Integer defaultFlag){
        this.setDefaultFlag(defaultFlag);
        return this;
    }

     /**
     * 设置 系统或模块默认，详细说明：{@link #FIELD_DEFAULTFLAG}
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSSysDynaModel defaultflag(Boolean defaultFlag){
        if(defaultFlag == null){
            this.setDefaultFlag(null);
        }
        else{
            this.setDefaultFlag(defaultFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DTOCODENAME</B>&nbsp;DTO代码标识
     * <P>
     * 字符串：最大长度 60，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_DTOCODENAME = "dtocodename";

    /**
     * 设置 DTO代码标识
     * 
     * @param dTOCodeName
     * 
     */
    @JsonProperty(FIELD_DTOCODENAME)
    public void setDTOCodeName(String dTOCodeName){
        this.set(FIELD_DTOCODENAME, dTOCodeName);
    }
    
    /**
     * 获取 DTO代码标识  
     * @return
     */
    @JsonIgnore
    public String getDTOCodeName(){
        Object objValue = this.get(FIELD_DTOCODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 DTO代码标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDTOCodeNameDirty(){
        if(this.contains(FIELD_DTOCODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 DTO代码标识
     */
    @JsonIgnore
    public void resetDTOCodeName(){
        this.reset(FIELD_DTOCODENAME);
    }

    /**
     * 设置 DTO代码标识
     * <P>
     * 等同 {@link #setDTOCodeName}
     * @param dTOCodeName
     */
    @JsonIgnore
    public PSSysDynaModel dtocodename(String dTOCodeName){
        this.setDTOCodeName(dTOCodeName);
        return this;
    }

    /**
     * <B>DYNAMODEL</B>&nbsp;动态模型，指定动态模型的内容，一般建议使用JSON格式
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_DYNAMODEL = "dynamodel";

    /**
     * 设置 动态模型，详细说明：{@link #FIELD_DYNAMODEL}
     * 
     * @param dynaModel
     * 
     */
    @JsonProperty(FIELD_DYNAMODEL)
    public void setDynaModel(String dynaModel){
        this.set(FIELD_DYNAMODEL, dynaModel);
    }
    
    /**
     * 获取 动态模型  
     * @return
     */
    @JsonIgnore
    public String getDynaModel(){
        Object objValue = this.get(FIELD_DYNAMODEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 动态模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDynaModelDirty(){
        if(this.contains(FIELD_DYNAMODEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 动态模型
     */
    @JsonIgnore
    public void resetDynaModel(){
        this.reset(FIELD_DYNAMODEL);
    }

    /**
     * 设置 动态模型，详细说明：{@link #FIELD_DYNAMODEL}
     * <P>
     * 等同 {@link #setDynaModel}
     * @param dynaModel
     */
    @JsonIgnore
    public PSSysDynaModel dynamodel(String dynaModel){
        this.setDynaModel(dynaModel);
        return this;
    }

    /**
     * <B>DYNAMODELFMT</B>&nbsp;模型格式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DynaModelContentType} 
     */
    public final static String FIELD_DYNAMODELFMT = "dynamodelfmt";

    /**
     * 设置 模型格式
     * 
     * @param dynaModelFmt
     * 
     */
    @JsonProperty(FIELD_DYNAMODELFMT)
    public void setDynaModelFmt(String dynaModelFmt){
        this.set(FIELD_DYNAMODELFMT, dynaModelFmt);
    }
    
    /**
     * 获取 模型格式  
     * @return
     */
    @JsonIgnore
    public String getDynaModelFmt(){
        Object objValue = this.get(FIELD_DYNAMODELFMT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模型格式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDynaModelFmtDirty(){
        if(this.contains(FIELD_DYNAMODELFMT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模型格式
     */
    @JsonIgnore
    public void resetDynaModelFmt(){
        this.reset(FIELD_DYNAMODELFMT);
    }

    /**
     * 设置 模型格式
     * <P>
     * 等同 {@link #setDynaModelFmt}
     * @param dynaModelFmt
     */
    @JsonIgnore
    public PSSysDynaModel dynamodelfmt(String dynaModelFmt){
        this.setDynaModelFmt(dynaModelFmt);
        return this;
    }

     /**
     * 设置 模型格式
     * <P>
     * 等同 {@link #setDynaModelFmt}
     * @param dynaModelFmt
     */
    @JsonIgnore
    public PSSysDynaModel dynamodelfmt(net.ibizsys.psmodel.core.util.PSModelEnums.DynaModelContentType dynaModelFmt){
        if(dynaModelFmt == null){
            this.setDynaModelFmt(null);
        }
        else{
            this.setDynaModelFmt(dynaModelFmt.value);
        }
        return this;
    }

    /**
     * <B>DYNAMODELUSAGE</B>&nbsp;模型用途
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DynaModelUsage} 
     */
    public final static String FIELD_DYNAMODELUSAGE = "dynamodelusage";

    /**
     * 设置 模型用途
     * 
     * @param dynaModelUsage
     * 
     */
    @JsonProperty(FIELD_DYNAMODELUSAGE)
    public void setDynaModelUsage(String dynaModelUsage){
        this.set(FIELD_DYNAMODELUSAGE, dynaModelUsage);
    }
    
    /**
     * 获取 模型用途  
     * @return
     */
    @JsonIgnore
    public String getDynaModelUsage(){
        Object objValue = this.get(FIELD_DYNAMODELUSAGE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模型用途 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDynaModelUsageDirty(){
        if(this.contains(FIELD_DYNAMODELUSAGE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模型用途
     */
    @JsonIgnore
    public void resetDynaModelUsage(){
        this.reset(FIELD_DYNAMODELUSAGE);
    }

    /**
     * 设置 模型用途
     * <P>
     * 等同 {@link #setDynaModelUsage}
     * @param dynaModelUsage
     */
    @JsonIgnore
    public PSSysDynaModel dynamodelusage(String dynaModelUsage){
        this.setDynaModelUsage(dynaModelUsage);
        return this;
    }

     /**
     * 设置 模型用途
     * <P>
     * 等同 {@link #setDynaModelUsage}
     * @param dynaModelUsage
     */
    @JsonIgnore
    public PSSysDynaModel dynamodelusage(net.ibizsys.psmodel.core.util.PSModelEnums.DynaModelUsage dynaModelUsage){
        if(dynaModelUsage == null){
            this.setDynaModelUsage(null);
        }
        else{
            this.setDynaModelUsage(dynaModelUsage.value);
        }
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;逻辑名称，指定动态模型的逻辑名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_LOGICNAME = "logicname";

    /**
     * 设置 逻辑名称，详细说明：{@link #FIELD_LOGICNAME}
     * 
     * @param logicName
     * 
     */
    @JsonProperty(FIELD_LOGICNAME)
    public void setLogicName(String logicName){
        this.set(FIELD_LOGICNAME, logicName);
    }
    
    /**
     * 获取 逻辑名称  
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
     * 判断 逻辑名称 是否指定值，包括空值
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
     * 重置 逻辑名称
     */
    @JsonIgnore
    public void resetLogicName(){
        this.reset(FIELD_LOGICNAME);
    }

    /**
     * 设置 逻辑名称，详细说明：{@link #FIELD_LOGICNAME}
     * <P>
     * 等同 {@link #setLogicName}
     * @param logicName
     */
    @JsonIgnore
    public PSSysDynaModel logicname(String logicName){
        this.setLogicName(logicName);
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
    public PSSysDynaModel memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MODELTAG</B>&nbsp;模型标记
     * <P>
     * 字符串：最大长度 30，由字母、数字、下划线组成，且开始必须为字母
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
    public PSSysDynaModel modeltag(String modelTag){
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
    public PSSysDynaModel modeltag2(String modelTag2){
        this.setModelTag2(modelTag2);
        return this;
    }

    /**
     * <B>MODELTAG3</B>&nbsp;模型标记3
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_MODELTAG3 = "modeltag3";

    /**
     * 设置 模型标记3
     * 
     * @param modelTag3
     * 
     */
    @JsonProperty(FIELD_MODELTAG3)
    public void setModelTag3(String modelTag3){
        this.set(FIELD_MODELTAG3, modelTag3);
    }
    
    /**
     * 获取 模型标记3  
     * @return
     */
    @JsonIgnore
    public String getModelTag3(){
        Object objValue = this.get(FIELD_MODELTAG3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模型标记3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isModelTag3Dirty(){
        if(this.contains(FIELD_MODELTAG3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模型标记3
     */
    @JsonIgnore
    public void resetModelTag3(){
        this.reset(FIELD_MODELTAG3);
    }

    /**
     * 设置 模型标记3
     * <P>
     * 等同 {@link #setModelTag3}
     * @param modelTag3
     */
    @JsonIgnore
    public PSSysDynaModel modeltag3(String modelTag3){
        this.setModelTag3(modelTag3);
        return this;
    }

    /**
     * <B>MODELTAG4</B>&nbsp;模型标记4
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_MODELTAG4 = "modeltag4";

    /**
     * 设置 模型标记4
     * 
     * @param modelTag4
     * 
     */
    @JsonProperty(FIELD_MODELTAG4)
    public void setModelTag4(String modelTag4){
        this.set(FIELD_MODELTAG4, modelTag4);
    }
    
    /**
     * 获取 模型标记4  
     * @return
     */
    @JsonIgnore
    public String getModelTag4(){
        Object objValue = this.get(FIELD_MODELTAG4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模型标记4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isModelTag4Dirty(){
        if(this.contains(FIELD_MODELTAG4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模型标记4
     */
    @JsonIgnore
    public void resetModelTag4(){
        this.reset(FIELD_MODELTAG4);
    }

    /**
     * 设置 模型标记4
     * <P>
     * 等同 {@link #setModelTag4}
     * @param modelTag4
     */
    @JsonIgnore
    public PSSysDynaModel modeltag4(String modelTag4){
        this.setModelTag4(modelTag4);
        return this;
    }

    /**
     * <B>PPSSYSDYNAMODELID</B>&nbsp;父模型对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDynaModel} 
     */
    public final static String FIELD_PPSSYSDYNAMODELID = "ppssysdynamodelid";

    /**
     * 设置 父模型对象
     * 
     * @param pPSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_PPSSYSDYNAMODELID)
    public void setPPSSysDynaModelId(String pPSSysDynaModelId){
        this.set(FIELD_PPSSYSDYNAMODELID, pPSSysDynaModelId);
    }
    
    /**
     * 获取 父模型对象  
     * @return
     */
    @JsonIgnore
    public String getPPSSysDynaModelId(){
        Object objValue = this.get(FIELD_PPSSYSDYNAMODELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父模型对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSSysDynaModelIdDirty(){
        if(this.contains(FIELD_PPSSYSDYNAMODELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父模型对象
     */
    @JsonIgnore
    public void resetPPSSysDynaModelId(){
        this.reset(FIELD_PPSSYSDYNAMODELID);
    }

    /**
     * 设置 父模型对象
     * <P>
     * 等同 {@link #setPPSSysDynaModelId}
     * @param pPSSysDynaModelId
     */
    @JsonIgnore
    public PSSysDynaModel ppssysdynamodelid(String pPSSysDynaModelId){
        this.setPPSSysDynaModelId(pPSSysDynaModelId);
        return this;
    }

    /**
     * 设置 父模型对象，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPPSSysDynaModelId}
     * @param pSSysDynaModel 引用对象
     */
    @JsonIgnore
    public PSSysDynaModel ppssysdynamodelid(PSSysDynaModel pSSysDynaModel){
        if(pSSysDynaModel == null){
            this.setPPSSysDynaModelId(null);
            this.setPPSSysDynaModelName(null);
        }
        else{
            this.setPPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setPPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    /**
     * <B>PPSSYSDYNAMODELNAME</B>&nbsp;父模型对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PPSSYSDYNAMODELID}
     */
    public final static String FIELD_PPSSYSDYNAMODELNAME = "ppssysdynamodelname";

    /**
     * 设置 父模型对象
     * 
     * @param pPSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_PPSSYSDYNAMODELNAME)
    public void setPPSSysDynaModelName(String pPSSysDynaModelName){
        this.set(FIELD_PPSSYSDYNAMODELNAME, pPSSysDynaModelName);
    }
    
    /**
     * 获取 父模型对象  
     * @return
     */
    @JsonIgnore
    public String getPPSSysDynaModelName(){
        Object objValue = this.get(FIELD_PPSSYSDYNAMODELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父模型对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSSysDynaModelNameDirty(){
        if(this.contains(FIELD_PPSSYSDYNAMODELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父模型对象
     */
    @JsonIgnore
    public void resetPPSSysDynaModelName(){
        this.reset(FIELD_PPSSYSDYNAMODELNAME);
    }

    /**
     * 设置 父模型对象
     * <P>
     * 等同 {@link #setPPSSysDynaModelName}
     * @param pPSSysDynaModelName
     */
    @JsonIgnore
    public PSSysDynaModel ppssysdynamodelname(String pPSSysDynaModelName){
        this.setPPSSysDynaModelName(pPSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定系统动态模型对象所在的系统模块
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSModule} 
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
    public PSSysDynaModel psmoduleid(String pSModuleId){
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
    public PSSysDynaModel psmoduleid(PSModule pSModule){
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
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定系统动态模型对象所在的系统模块
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
    public PSSysDynaModel psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELCATID</B>&nbsp;模型分类，指定动态模型所属的动态模型分类
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDynaModelCat} 
     */
    public final static String FIELD_PSSYSDYNAMODELCATID = "pssysdynamodelcatid";

    /**
     * 设置 模型分类，详细说明：{@link #FIELD_PSSYSDYNAMODELCATID}
     * 
     * @param pSSysDynaModelCatId
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELCATID)
    public void setPSSysDynaModelCatId(String pSSysDynaModelCatId){
        this.set(FIELD_PSSYSDYNAMODELCATID, pSSysDynaModelCatId);
    }
    
    /**
     * 获取 模型分类  
     * @return
     */
    @JsonIgnore
    public String getPSSysDynaModelCatId(){
        Object objValue = this.get(FIELD_PSSYSDYNAMODELCATID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模型分类 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDynaModelCatIdDirty(){
        if(this.contains(FIELD_PSSYSDYNAMODELCATID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模型分类
     */
    @JsonIgnore
    public void resetPSSysDynaModelCatId(){
        this.reset(FIELD_PSSYSDYNAMODELCATID);
    }

    /**
     * 设置 模型分类，详细说明：{@link #FIELD_PSSYSDYNAMODELCATID}
     * <P>
     * 等同 {@link #setPSSysDynaModelCatId}
     * @param pSSysDynaModelCatId
     */
    @JsonIgnore
    public PSSysDynaModel pssysdynamodelcatid(String pSSysDynaModelCatId){
        this.setPSSysDynaModelCatId(pSSysDynaModelCatId);
        return this;
    }

    /**
     * 设置 模型分类，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDynaModelCatId}
     * @param pSSysDynaModelCat 引用对象
     */
    @JsonIgnore
    public PSSysDynaModel pssysdynamodelcatid(PSSysDynaModelCat pSSysDynaModelCat){
        if(pSSysDynaModelCat == null){
            this.setPSSysDynaModelCatId(null);
            this.setPSSysDynaModelCatName(null);
        }
        else{
            this.setPSSysDynaModelCatId(pSSysDynaModelCat.getPSSysDynaModelCatId());
            this.setPSSysDynaModelCatName(pSSysDynaModelCat.getPSSysDynaModelCatName());
        }
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELCATNAME</B>&nbsp;模型分类，指定动态模型所属的动态模型分类
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDYNAMODELCATID}
     */
    public final static String FIELD_PSSYSDYNAMODELCATNAME = "pssysdynamodelcatname";

    /**
     * 设置 模型分类，详细说明：{@link #FIELD_PSSYSDYNAMODELCATNAME}
     * 
     * @param pSSysDynaModelCatName
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELCATNAME)
    public void setPSSysDynaModelCatName(String pSSysDynaModelCatName){
        this.set(FIELD_PSSYSDYNAMODELCATNAME, pSSysDynaModelCatName);
    }
    
    /**
     * 获取 模型分类  
     * @return
     */
    @JsonIgnore
    public String getPSSysDynaModelCatName(){
        Object objValue = this.get(FIELD_PSSYSDYNAMODELCATNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模型分类 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDynaModelCatNameDirty(){
        if(this.contains(FIELD_PSSYSDYNAMODELCATNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模型分类
     */
    @JsonIgnore
    public void resetPSSysDynaModelCatName(){
        this.reset(FIELD_PSSYSDYNAMODELCATNAME);
    }

    /**
     * 设置 模型分类，详细说明：{@link #FIELD_PSSYSDYNAMODELCATNAME}
     * <P>
     * 等同 {@link #setPSSysDynaModelCatName}
     * @param pSSysDynaModelCatName
     */
    @JsonIgnore
    public PSSysDynaModel pssysdynamodelcatname(String pSSysDynaModelCatName){
        this.setPSSysDynaModelCatName(pSSysDynaModelCatName);
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELID</B>&nbsp;系统动态模型对象标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSDYNAMODELID = "pssysdynamodelid";

    /**
     * 设置 系统动态模型对象标识
     * 
     * @param pSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELID)
    public void setPSSysDynaModelId(String pSSysDynaModelId){
        this.set(FIELD_PSSYSDYNAMODELID, pSSysDynaModelId);
    }
    
    /**
     * 获取 系统动态模型对象标识  
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
     * 判断 系统动态模型对象标识 是否指定值，包括空值
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
     * 重置 系统动态模型对象标识
     */
    @JsonIgnore
    public void resetPSSysDynaModelId(){
        this.reset(FIELD_PSSYSDYNAMODELID);
    }

    /**
     * 设置 系统动态模型对象标识
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModelId
     */
    @JsonIgnore
    public PSSysDynaModel pssysdynamodelid(String pSSysDynaModelId){
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELNAME</B>&nbsp;动态模型对象名称，指定动态模型的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";

    /**
     * 设置 动态模型对象名称，详细说明：{@link #FIELD_PSSYSDYNAMODELNAME}
     * 
     * @param pSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELNAME)
    public void setPSSysDynaModelName(String pSSysDynaModelName){
        this.set(FIELD_PSSYSDYNAMODELNAME, pSSysDynaModelName);
    }
    
    /**
     * 获取 动态模型对象名称  
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
     * 判断 动态模型对象名称 是否指定值，包括空值
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
     * 重置 动态模型对象名称
     */
    @JsonIgnore
    public void resetPSSysDynaModelName(){
        this.reset(FIELD_PSSYSDYNAMODELNAME);
    }

    /**
     * 设置 动态模型对象名称，详细说明：{@link #FIELD_PSSYSDYNAMODELNAME}
     * <P>
     * 等同 {@link #setPSSysDynaModelName}
     * @param pSSysDynaModelName
     */
    @JsonIgnore
    public PSSysDynaModel pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysDynaModelName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysDynaModelName(strName);
    }

    @JsonIgnore
    public PSSysDynaModel name(String strName){
        this.setPSSysDynaModelName(strName);
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
    public PSSysDynaModel updatedate(String updateDate){
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
    public PSSysDynaModel updateman(String updateMan){
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
    public PSSysDynaModel usercat(String userCat){
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
    public PSSysDynaModel usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysDynaModel usertag(String userTag){
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
    public PSSysDynaModel usertag2(String userTag2){
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
    public PSSysDynaModel usertag3(String userTag3){
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
    public PSSysDynaModel usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysDynaModelId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysDynaModelId(strValue);
    }

    @JsonIgnore
    public PSSysDynaModel id(String strValue){
        this.setPSSysDynaModelId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysDynaModel){
            PSSysDynaModel model = (PSSysDynaModel)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
