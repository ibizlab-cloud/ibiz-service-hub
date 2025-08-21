package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDATAENTITY</B>实体 模型传输对象
 * <P>
 * 系统的业务对象模型，实体中包括了属性、关系等基本数据模型；还包括了处理逻辑；界面表现；访问控制等功能模型
 */
public class PSDataEntity extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDataEntity(){
        this.setValidFlag(1);
    }      

    /**
     * <B>ACCCTRLARCH</B>&nbsp;访问控制体系，指定实体的访问控制体系，未定义时使用系统设定
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.AccCtrlArch} 
     */
    public final static String FIELD_ACCCTRLARCH = "accctrlarch";

    /**
     * 设置 访问控制体系，详细说明：{@link #FIELD_ACCCTRLARCH}
     * 
     * @param accCtrlArch
     * 
     */
    @JsonProperty(FIELD_ACCCTRLARCH)
    public void setAccCtrlArch(Integer accCtrlArch){
        this.set(FIELD_ACCCTRLARCH, accCtrlArch);
    }
    
    /**
     * 获取 访问控制体系  
     * @return
     */
    @JsonIgnore
    public Integer getAccCtrlArch(){
        Object objValue = this.get(FIELD_ACCCTRLARCH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 访问控制体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAccCtrlArchDirty(){
        if(this.contains(FIELD_ACCCTRLARCH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 访问控制体系
     */
    @JsonIgnore
    public void resetAccCtrlArch(){
        this.reset(FIELD_ACCCTRLARCH);
    }

    /**
     * 设置 访问控制体系，详细说明：{@link #FIELD_ACCCTRLARCH}
     * <P>
     * 等同 {@link #setAccCtrlArch}
     * @param accCtrlArch
     */
    @JsonIgnore
    public PSDataEntity accctrlarch(Integer accCtrlArch){
        this.setAccCtrlArch(accCtrlArch);
        return this;
    }

     /**
     * 设置 访问控制体系，详细说明：{@link #FIELD_ACCCTRLARCH}
     * <P>
     * 等同 {@link #setAccCtrlArch}
     * @param accCtrlArch
     */
    @JsonIgnore
    public PSDataEntity accctrlarch(net.ibizsys.psmodel.core.util.PSModelEnums.AccCtrlArch accCtrlArch){
        if(accCtrlArch == null){
            this.setAccCtrlArch(null);
        }
        else{
            this.setAccCtrlArch(accCtrlArch.value);
        }
        return this;
    }

    /**
     * <B>AUDITMODE</B>&nbsp;审计模式，实体启用数据审计后，进一步指定审计的模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEDataAuditMode} 
     */
    public final static String FIELD_AUDITMODE = "auditmode";

    /**
     * 设置 审计模式，详细说明：{@link #FIELD_AUDITMODE}
     * 
     * @param auditMode
     * 
     */
    @JsonProperty(FIELD_AUDITMODE)
    public void setAuditMode(Integer auditMode){
        this.set(FIELD_AUDITMODE, auditMode);
    }
    
    /**
     * 获取 审计模式  
     * @return
     */
    @JsonIgnore
    public Integer getAuditMode(){
        Object objValue = this.get(FIELD_AUDITMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 审计模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAuditModeDirty(){
        if(this.contains(FIELD_AUDITMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 审计模式
     */
    @JsonIgnore
    public void resetAuditMode(){
        this.reset(FIELD_AUDITMODE);
    }

    /**
     * 设置 审计模式，详细说明：{@link #FIELD_AUDITMODE}
     * <P>
     * 等同 {@link #setAuditMode}
     * @param auditMode
     */
    @JsonIgnore
    public PSDataEntity auditmode(Integer auditMode){
        this.setAuditMode(auditMode);
        return this;
    }

     /**
     * 设置 审计模式，详细说明：{@link #FIELD_AUDITMODE}
     * <P>
     * 等同 {@link #setAuditMode}
     * @param auditMode
     */
    @JsonIgnore
    public PSDataEntity auditmode(net.ibizsys.psmodel.core.util.PSModelEnums.DEDataAuditMode auditMode){
        if(auditMode == null){
            this.setAuditMode(null);
        }
        else{
            this.setAuditMode(auditMode.value);
        }
        return this;
    }

    /**
     * <B>BASECLSPARAMS</B>&nbsp;发布参数，指定实体后台代码基类参数
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_BASECLSPARAMS = "baseclsparams";

    /**
     * 设置 发布参数，详细说明：{@link #FIELD_BASECLSPARAMS}
     * 
     * @param baseClsParams
     * 
     */
    @JsonProperty(FIELD_BASECLSPARAMS)
    public void setBaseClsParams(String baseClsParams){
        this.set(FIELD_BASECLSPARAMS, baseClsParams);
    }
    
    /**
     * 获取 发布参数  
     * @return
     */
    @JsonIgnore
    public String getBaseClsParams(){
        Object objValue = this.get(FIELD_BASECLSPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 发布参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBaseClsParamsDirty(){
        if(this.contains(FIELD_BASECLSPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 发布参数
     */
    @JsonIgnore
    public void resetBaseClsParams(){
        this.reset(FIELD_BASECLSPARAMS);
    }

    /**
     * 设置 发布参数，详细说明：{@link #FIELD_BASECLSPARAMS}
     * <P>
     * 等同 {@link #setBaseClsParams}
     * @param baseClsParams
     */
    @JsonIgnore
    public PSDataEntity baseclsparams(String baseClsParams){
        this.setBaseClsParams(baseClsParams);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定实体的代码标识，需要在实体所在的系统模块中具有唯一性
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
    public PSDataEntity codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>CODENAMEMODE</B>&nbsp;接口代码标识模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.CodeNameMode} 
     */
    public final static String FIELD_CODENAMEMODE = "codenamemode";

    /**
     * 设置 接口代码标识模式
     * 
     * @param codeNameMode
     * 
     */
    @JsonProperty(FIELD_CODENAMEMODE)
    public void setCodeNameMode(String codeNameMode){
        this.set(FIELD_CODENAMEMODE, codeNameMode);
    }
    
    /**
     * 获取 接口代码标识模式  
     * @return
     */
    @JsonIgnore
    public String getCodeNameMode(){
        Object objValue = this.get(FIELD_CODENAMEMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 接口代码标识模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCodeNameModeDirty(){
        if(this.contains(FIELD_CODENAMEMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 接口代码标识模式
     */
    @JsonIgnore
    public void resetCodeNameMode(){
        this.reset(FIELD_CODENAMEMODE);
    }

    /**
     * 设置 接口代码标识模式
     * <P>
     * 等同 {@link #setCodeNameMode}
     * @param codeNameMode
     */
    @JsonIgnore
    public PSDataEntity codenamemode(String codeNameMode){
        this.setCodeNameMode(codeNameMode);
        return this;
    }

     /**
     * 设置 接口代码标识模式
     * <P>
     * 等同 {@link #setCodeNameMode}
     * @param codeNameMode
     */
    @JsonIgnore
    public PSDataEntity codenamemode(net.ibizsys.psmodel.core.util.PSModelEnums.CodeNameMode codeNameMode){
        if(codeNameMode == null){
            this.setCodeNameMode(null);
        }
        else{
            this.setCodeNameMode(codeNameMode.value);
        }
        return this;
    }

    /**
     * <B>COLOR</B>&nbsp;标记颜色，指定实体的标记颜色，未定义时使用系统模块的标记颜色
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_COLOR = "color";

    /**
     * 设置 标记颜色，详细说明：{@link #FIELD_COLOR}
     * 
     * @param color
     * 
     */
    @JsonProperty(FIELD_COLOR)
    public void setColor(String color){
        this.set(FIELD_COLOR, color);
    }
    
    /**
     * 获取 标记颜色  
     * @return
     */
    @JsonIgnore
    public String getColor(){
        Object objValue = this.get(FIELD_COLOR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标记颜色 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isColorDirty(){
        if(this.contains(FIELD_COLOR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标记颜色
     */
    @JsonIgnore
    public void resetColor(){
        this.reset(FIELD_COLOR);
    }

    /**
     * 设置 标记颜色，详细说明：{@link #FIELD_COLOR}
     * <P>
     * 等同 {@link #setColor}
     * @param color
     */
    @JsonIgnore
    public PSDataEntity color(String color){
        this.setColor(color);
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
    public PSDataEntity createdate(String createDate){
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
    public PSDataEntity createman(String createMan){
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
    public PSDataEntity customcode(String customCode){
        this.setCustomCode(customCode);
        return this;
    }

    /**
     * <B>CUSTOMMODE</B>&nbsp;脚本代码模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ScriptMode2} 
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
    public PSDataEntity custommode(Integer customMode){
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
    public PSDataEntity custommode(net.ibizsys.psmodel.core.util.PSModelEnums.ScriptMode2 customMode){
        if(customMode == null){
            this.setCustomMode(null);
        }
        else{
            this.setCustomMode(customMode.value);
        }
        return this;
    }

    /**
     * <B>DATAACCMODE</B>&nbsp;访问控制模式，指定实体的访问控制模式，未定义时为【自控制】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEDataAccCtrlMode} 
     */
    public final static String FIELD_DATAACCMODE = "dataaccmode";

    /**
     * 设置 访问控制模式，详细说明：{@link #FIELD_DATAACCMODE}
     * 
     * @param dataAccMode
     * 
     */
    @JsonProperty(FIELD_DATAACCMODE)
    public void setDataAccMode(Integer dataAccMode){
        this.set(FIELD_DATAACCMODE, dataAccMode);
    }
    
    /**
     * 获取 访问控制模式  
     * @return
     */
    @JsonIgnore
    public Integer getDataAccMode(){
        Object objValue = this.get(FIELD_DATAACCMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 访问控制模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDataAccModeDirty(){
        if(this.contains(FIELD_DATAACCMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 访问控制模式
     */
    @JsonIgnore
    public void resetDataAccMode(){
        this.reset(FIELD_DATAACCMODE);
    }

    /**
     * 设置 访问控制模式，详细说明：{@link #FIELD_DATAACCMODE}
     * <P>
     * 等同 {@link #setDataAccMode}
     * @param dataAccMode
     */
    @JsonIgnore
    public PSDataEntity dataaccmode(Integer dataAccMode){
        this.setDataAccMode(dataAccMode);
        return this;
    }

     /**
     * 设置 访问控制模式，详细说明：{@link #FIELD_DATAACCMODE}
     * <P>
     * 等同 {@link #setDataAccMode}
     * @param dataAccMode
     */
    @JsonIgnore
    public PSDataEntity dataaccmode(net.ibizsys.psmodel.core.util.PSModelEnums.DEDataAccCtrlMode dataAccMode){
        if(dataAccMode == null){
            this.setDataAccMode(null);
        }
        else{
            this.setDataAccMode(dataAccMode.value);
        }
        return this;
    }

    /**
     * <B>DATACHGLOGMODE</B>&nbsp;数据变更日志模式，指定实体的数据变更日志方式，未定义时为【无日志】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEDataChgLogMode} 
     */
    public final static String FIELD_DATACHGLOGMODE = "datachglogmode";

    /**
     * 设置 数据变更日志模式，详细说明：{@link #FIELD_DATACHGLOGMODE}
     * 
     * @param dataChgLogMode
     * 
     */
    @JsonProperty(FIELD_DATACHGLOGMODE)
    public void setDataChgLogMode(Integer dataChgLogMode){
        this.set(FIELD_DATACHGLOGMODE, dataChgLogMode);
    }
    
    /**
     * 获取 数据变更日志模式  
     * @return
     */
    @JsonIgnore
    public Integer getDataChgLogMode(){
        Object objValue = this.get(FIELD_DATACHGLOGMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 数据变更日志模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDataChgLogModeDirty(){
        if(this.contains(FIELD_DATACHGLOGMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据变更日志模式
     */
    @JsonIgnore
    public void resetDataChgLogMode(){
        this.reset(FIELD_DATACHGLOGMODE);
    }

    /**
     * 设置 数据变更日志模式，详细说明：{@link #FIELD_DATACHGLOGMODE}
     * <P>
     * 等同 {@link #setDataChgLogMode}
     * @param dataChgLogMode
     */
    @JsonIgnore
    public PSDataEntity datachglogmode(Integer dataChgLogMode){
        this.setDataChgLogMode(dataChgLogMode);
        return this;
    }

     /**
     * 设置 数据变更日志模式，详细说明：{@link #FIELD_DATACHGLOGMODE}
     * <P>
     * 等同 {@link #setDataChgLogMode}
     * @param dataChgLogMode
     */
    @JsonIgnore
    public PSDataEntity datachglogmode(net.ibizsys.psmodel.core.util.PSModelEnums.DEDataChgLogMode dataChgLogMode){
        if(dataChgLogMode == null){
            this.setDataChgLogMode(null);
        }
        else{
            this.setDataChgLogMode(dataChgLogMode.value);
        }
        return this;
    }

    /**
     * <B>DATAIMPEXPFLAG</B>&nbsp;数据导入导出能力，指定实体默认的数据导入导出能力，未定义时为【导入及导出】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEDataImpExpMode} 
     */
    public final static String FIELD_DATAIMPEXPFLAG = "dataimpexpflag";

    /**
     * 设置 数据导入导出能力，详细说明：{@link #FIELD_DATAIMPEXPFLAG}
     * 
     * @param dataImpExpFlag
     * 
     */
    @JsonProperty(FIELD_DATAIMPEXPFLAG)
    public void setDataImpExpFlag(Integer dataImpExpFlag){
        this.set(FIELD_DATAIMPEXPFLAG, dataImpExpFlag);
    }
    
    /**
     * 获取 数据导入导出能力  
     * @return
     */
    @JsonIgnore
    public Integer getDataImpExpFlag(){
        Object objValue = this.get(FIELD_DATAIMPEXPFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 数据导入导出能力 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDataImpExpFlagDirty(){
        if(this.contains(FIELD_DATAIMPEXPFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据导入导出能力
     */
    @JsonIgnore
    public void resetDataImpExpFlag(){
        this.reset(FIELD_DATAIMPEXPFLAG);
    }

    /**
     * 设置 数据导入导出能力，详细说明：{@link #FIELD_DATAIMPEXPFLAG}
     * <P>
     * 等同 {@link #setDataImpExpFlag}
     * @param dataImpExpFlag
     */
    @JsonIgnore
    public PSDataEntity dataimpexpflag(Integer dataImpExpFlag){
        this.setDataImpExpFlag(dataImpExpFlag);
        return this;
    }

     /**
     * 设置 数据导入导出能力，详细说明：{@link #FIELD_DATAIMPEXPFLAG}
     * <P>
     * 等同 {@link #setDataImpExpFlag}
     * @param dataImpExpFlag
     */
    @JsonIgnore
    public PSDataEntity dataimpexpflag(net.ibizsys.psmodel.core.util.PSModelEnums.DEDataImpExpMode dataImpExpFlag){
        if(dataImpExpFlag == null){
            this.setDataImpExpFlag(null);
        }
        else{
            this.setDataImpExpFlag(dataImpExpFlag.value);
        }
        return this;
    }

    /**
     * <B>DBVER</B>&nbsp;数据结构版本
     */
    public final static String FIELD_DBVER = "dbver";

    /**
     * 设置 数据结构版本
     * 
     * @param dBVer
     * 
     */
    @JsonProperty(FIELD_DBVER)
    public void setDBVer(Integer dBVer){
        this.set(FIELD_DBVER, dBVer);
    }
    
    /**
     * 获取 数据结构版本  
     * @return
     */
    @JsonIgnore
    public Integer getDBVer(){
        Object objValue = this.get(FIELD_DBVER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 数据结构版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDBVerDirty(){
        if(this.contains(FIELD_DBVER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据结构版本
     */
    @JsonIgnore
    public void resetDBVer(){
        this.reset(FIELD_DBVER);
    }

    /**
     * 设置 数据结构版本
     * <P>
     * 等同 {@link #setDBVer}
     * @param dBVer
     */
    @JsonIgnore
    public PSDataEntity dbver(Integer dBVer){
        this.setDBVer(dBVer);
        return this;
    }

    /**
     * <B>DELOCKFLAG</B>&nbsp;全局禁止子系统导入
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DELOCKFLAG = "delockflag";

    /**
     * 设置 全局禁止子系统导入
     * 
     * @param dELockFlag
     * 
     */
    @JsonProperty(FIELD_DELOCKFLAG)
    public void setDELockFlag(Integer dELockFlag){
        this.set(FIELD_DELOCKFLAG, dELockFlag);
    }
    
    /**
     * 获取 全局禁止子系统导入  
     * @return
     */
    @JsonIgnore
    public Integer getDELockFlag(){
        Object objValue = this.get(FIELD_DELOCKFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 全局禁止子系统导入 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDELockFlagDirty(){
        if(this.contains(FIELD_DELOCKFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 全局禁止子系统导入
     */
    @JsonIgnore
    public void resetDELockFlag(){
        this.reset(FIELD_DELOCKFLAG);
    }

    /**
     * 设置 全局禁止子系统导入
     * <P>
     * 等同 {@link #setDELockFlag}
     * @param dELockFlag
     */
    @JsonIgnore
    public PSDataEntity delockflag(Integer dELockFlag){
        this.setDELockFlag(dELockFlag);
        return this;
    }

     /**
     * 设置 全局禁止子系统导入
     * <P>
     * 等同 {@link #setDELockFlag}
     * @param dELockFlag
     */
    @JsonIgnore
    public PSDataEntity delockflag(Boolean dELockFlag){
        if(dELockFlag == null){
            this.setDELockFlag(null);
        }
        else{
            this.setDELockFlag(dELockFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DESN</B>&nbsp;实体编号，指定实体的编号
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_DESN = "desn";

    /**
     * 设置 实体编号，详细说明：{@link #FIELD_DESN}
     * 
     * @param dESN
     * 
     */
    @JsonProperty(FIELD_DESN)
    public void setDESN(String dESN){
        this.set(FIELD_DESN, dESN);
    }
    
    /**
     * 获取 实体编号  
     * @return
     */
    @JsonIgnore
    public String getDESN(){
        Object objValue = this.get(FIELD_DESN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体编号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDESNDirty(){
        if(this.contains(FIELD_DESN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体编号
     */
    @JsonIgnore
    public void resetDESN(){
        this.reset(FIELD_DESN);
    }

    /**
     * 设置 实体编号，详细说明：{@link #FIELD_DESN}
     * <P>
     * 等同 {@link #setDESN}
     * @param dESN
     */
    @JsonIgnore
    public PSDataEntity desn(String dESN){
        this.setDESN(dESN);
        return this;
    }

    /**
     * <B>DETAG</B>&nbsp;实体标记，指定实体的标记
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_DETAG = "detag";

    /**
     * 设置 实体标记，详细说明：{@link #FIELD_DETAG}
     * 
     * @param dETag
     * 
     */
    @JsonProperty(FIELD_DETAG)
    public void setDETag(String dETag){
        this.set(FIELD_DETAG, dETag);
    }
    
    /**
     * 获取 实体标记  
     * @return
     */
    @JsonIgnore
    public String getDETag(){
        Object objValue = this.get(FIELD_DETAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDETagDirty(){
        if(this.contains(FIELD_DETAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体标记
     */
    @JsonIgnore
    public void resetDETag(){
        this.reset(FIELD_DETAG);
    }

    /**
     * 设置 实体标记，详细说明：{@link #FIELD_DETAG}
     * <P>
     * 等同 {@link #setDETag}
     * @param dETag
     */
    @JsonIgnore
    public PSDataEntity detag(String dETag){
        this.setDETag(dETag);
        return this;
    }

    /**
     * <B>DETAG2</B>&nbsp;实体标记2，指定实体的标记2
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_DETAG2 = "detag2";

    /**
     * 设置 实体标记2，详细说明：{@link #FIELD_DETAG2}
     * 
     * @param dETag2
     * 
     */
    @JsonProperty(FIELD_DETAG2)
    public void setDETag2(String dETag2){
        this.set(FIELD_DETAG2, dETag2);
    }
    
    /**
     * 获取 实体标记2  
     * @return
     */
    @JsonIgnore
    public String getDETag2(){
        Object objValue = this.get(FIELD_DETAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDETag2Dirty(){
        if(this.contains(FIELD_DETAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体标记2
     */
    @JsonIgnore
    public void resetDETag2(){
        this.reset(FIELD_DETAG2);
    }

    /**
     * 设置 实体标记2，详细说明：{@link #FIELD_DETAG2}
     * <P>
     * 等同 {@link #setDETag2}
     * @param dETag2
     */
    @JsonIgnore
    public PSDataEntity detag2(String dETag2){
        this.setDETag2(dETag2);
        return this;
    }

    /**
     * <B>DETYPE</B>&nbsp;实体类型，指定实体的类型，由于实体在不同的应用场合中会出现不同的性质，实体类型不作为实体的关键逻辑
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEType} 
     */
    public final static String FIELD_DETYPE = "detype";

    /**
     * 设置 实体类型，详细说明：{@link #FIELD_DETYPE}
     * 
     * @param dEType
     * 
     */
    @JsonProperty(FIELD_DETYPE)
    public void setDEType(Integer dEType){
        this.set(FIELD_DETYPE, dEType);
    }
    
    /**
     * 获取 实体类型  
     * @return
     */
    @JsonIgnore
    public Integer getDEType(){
        Object objValue = this.get(FIELD_DETYPE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 实体类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDETypeDirty(){
        if(this.contains(FIELD_DETYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体类型
     */
    @JsonIgnore
    public void resetDEType(){
        this.reset(FIELD_DETYPE);
    }

    /**
     * 设置 实体类型，详细说明：{@link #FIELD_DETYPE}
     * <P>
     * 等同 {@link #setDEType}
     * @param dEType
     */
    @JsonIgnore
    public PSDataEntity detype(Integer dEType){
        this.setDEType(dEType);
        return this;
    }

     /**
     * 设置 实体类型，详细说明：{@link #FIELD_DETYPE}
     * <P>
     * 等同 {@link #setDEType}
     * @param dEType
     */
    @JsonIgnore
    public PSDataEntity detype(net.ibizsys.psmodel.core.util.PSModelEnums.DEType dEType){
        if(dEType == null){
            this.setDEType(null);
        }
        else{
            this.setDEType(dEType.value);
        }
        return this;
    }

    /**
     * <B>DSLINK</B>&nbsp;默认数据源，指定实体数据库持久化使用的数据连接，未指定时为【默认连接】，在除【SQL】及【SQL（多模式支持）】的持久化多模式下启用SQL持久化，则需要显式指定数据连接
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DataSourceLink} 
     */
    public final static String FIELD_DSLINK = "dslink";

    /**
     * 设置 默认数据源，详细说明：{@link #FIELD_DSLINK}
     * 
     * @param dSLink
     * 
     */
    @JsonProperty(FIELD_DSLINK)
    public void setDSLink(String dSLink){
        this.set(FIELD_DSLINK, dSLink);
    }
    
    /**
     * 获取 默认数据源  
     * @return
     */
    @JsonIgnore
    public String getDSLink(){
        Object objValue = this.get(FIELD_DSLINK);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认数据源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDSLinkDirty(){
        if(this.contains(FIELD_DSLINK)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认数据源
     */
    @JsonIgnore
    public void resetDSLink(){
        this.reset(FIELD_DSLINK);
    }

    /**
     * 设置 默认数据源，详细说明：{@link #FIELD_DSLINK}
     * <P>
     * 等同 {@link #setDSLink}
     * @param dSLink
     */
    @JsonIgnore
    public PSDataEntity dslink(String dSLink){
        this.setDSLink(dSLink);
        return this;
    }

     /**
     * 设置 默认数据源，详细说明：{@link #FIELD_DSLINK}
     * <P>
     * 等同 {@link #setDSLink}
     * @param dSLink
     */
    @JsonIgnore
    public PSDataEntity dslink(net.ibizsys.psmodel.core.util.PSModelEnums.DataSourceLink dSLink){
        if(dSLink == null){
            this.setDSLink(null);
        }
        else{
            this.setDSLink(dSLink.value);
        }
        return this;
    }

    /**
     * <B>DYNAMICMODE</B>&nbsp;扩展模式，指定实体的扩展模式，此配置针对子系统实体，标记是否要对原功能进行扩展。未定义时如实体相关逻辑启用【子系统扩展】则为【子系统扩展】，否则为【无扩展】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEExtendMode} 
     */
    public final static String FIELD_DYNAMICMODE = "dynamicmode";

    /**
     * 设置 扩展模式，详细说明：{@link #FIELD_DYNAMICMODE}
     * 
     * @param dynamicMode
     * 
     */
    @JsonProperty(FIELD_DYNAMICMODE)
    public void setDynamicMode(Integer dynamicMode){
        this.set(FIELD_DYNAMICMODE, dynamicMode);
    }
    
    /**
     * 获取 扩展模式  
     * @return
     */
    @JsonIgnore
    public Integer getDynamicMode(){
        Object objValue = this.get(FIELD_DYNAMICMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 扩展模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDynamicModeDirty(){
        if(this.contains(FIELD_DYNAMICMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 扩展模式
     */
    @JsonIgnore
    public void resetDynamicMode(){
        this.reset(FIELD_DYNAMICMODE);
    }

    /**
     * 设置 扩展模式，详细说明：{@link #FIELD_DYNAMICMODE}
     * <P>
     * 等同 {@link #setDynamicMode}
     * @param dynamicMode
     */
    @JsonIgnore
    public PSDataEntity dynamicmode(Integer dynamicMode){
        this.setDynamicMode(dynamicMode);
        return this;
    }

     /**
     * 设置 扩展模式，详细说明：{@link #FIELD_DYNAMICMODE}
     * <P>
     * 等同 {@link #setDynamicMode}
     * @param dynamicMode
     */
    @JsonIgnore
    public PSDataEntity dynamicmode(net.ibizsys.psmodel.core.util.PSModelEnums.DEExtendMode dynamicMode){
        if(dynamicMode == null){
            this.setDynamicMode(null);
        }
        else{
            this.setDynamicMode(dynamicMode.value);
        }
        return this;
    }

    /**
     * <B>DYNATABLEMODE</B>&nbsp;动态表模式
     */
    public final static String FIELD_DYNATABLEMODE = "dynatablemode";

    /**
     * 设置 动态表模式
     * 
     * @param dynaTableMode
     * 
     */
    @JsonProperty(FIELD_DYNATABLEMODE)
    public void setDynaTableMode(Integer dynaTableMode){
        this.set(FIELD_DYNATABLEMODE, dynaTableMode);
    }
    
    /**
     * 获取 动态表模式  
     * @return
     */
    @JsonIgnore
    public Integer getDynaTableMode(){
        Object objValue = this.get(FIELD_DYNATABLEMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 动态表模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDynaTableModeDirty(){
        if(this.contains(FIELD_DYNATABLEMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 动态表模式
     */
    @JsonIgnore
    public void resetDynaTableMode(){
        this.reset(FIELD_DYNATABLEMODE);
    }

    /**
     * 设置 动态表模式
     * <P>
     * 等同 {@link #setDynaTableMode}
     * @param dynaTableMode
     */
    @JsonIgnore
    public PSDataEntity dynatablemode(Integer dynaTableMode){
        this.setDynaTableMode(dynaTableMode);
        return this;
    }

    /**
     * <B>ENABLEAUDIT</B>&nbsp;启用数据审计，启用数据审计将记录数据的操作日志，可在【审计模式】指定操作日志的级别
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEAUDIT = "enableaudit";

    /**
     * 设置 启用数据审计，详细说明：{@link #FIELD_ENABLEAUDIT}
     * 
     * @param enableAudit
     * 
     */
    @JsonProperty(FIELD_ENABLEAUDIT)
    public void setEnableAudit(Integer enableAudit){
        this.set(FIELD_ENABLEAUDIT, enableAudit);
    }
    
    /**
     * 获取 启用数据审计  
     * @return
     */
    @JsonIgnore
    public Integer getEnableAudit(){
        Object objValue = this.get(FIELD_ENABLEAUDIT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用数据审计 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableAuditDirty(){
        if(this.contains(FIELD_ENABLEAUDIT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用数据审计
     */
    @JsonIgnore
    public void resetEnableAudit(){
        this.reset(FIELD_ENABLEAUDIT);
    }

    /**
     * 设置 启用数据审计，详细说明：{@link #FIELD_ENABLEAUDIT}
     * <P>
     * 等同 {@link #setEnableAudit}
     * @param enableAudit
     */
    @JsonIgnore
    public PSDataEntity enableaudit(Integer enableAudit){
        this.setEnableAudit(enableAudit);
        return this;
    }

     /**
     * 设置 启用数据审计，详细说明：{@link #FIELD_ENABLEAUDIT}
     * <P>
     * 等同 {@link #setEnableAudit}
     * @param enableAudit
     */
    @JsonIgnore
    public PSDataEntity enableaudit(Boolean enableAudit){
        if(enableAudit == null){
            this.setEnableAudit(null);
        }
        else{
            this.setEnableAudit(enableAudit?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEDATAVER</B>&nbsp;启用数据版本
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEDATAVER = "enabledataver";

    /**
     * 设置 启用数据版本
     * 
     * @param enableDataVer
     * 
     */
    @JsonProperty(FIELD_ENABLEDATAVER)
    public void setEnableDataVer(Integer enableDataVer){
        this.set(FIELD_ENABLEDATAVER, enableDataVer);
    }
    
    /**
     * 获取 启用数据版本  
     * @return
     */
    @JsonIgnore
    public Integer getEnableDataVer(){
        Object objValue = this.get(FIELD_ENABLEDATAVER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用数据版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableDataVerDirty(){
        if(this.contains(FIELD_ENABLEDATAVER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用数据版本
     */
    @JsonIgnore
    public void resetEnableDataVer(){
        this.reset(FIELD_ENABLEDATAVER);
    }

    /**
     * 设置 启用数据版本
     * <P>
     * 等同 {@link #setEnableDataVer}
     * @param enableDataVer
     */
    @JsonIgnore
    public PSDataEntity enabledataver(Integer enableDataVer){
        this.setEnableDataVer(enableDataVer);
        return this;
    }

     /**
     * 设置 启用数据版本
     * <P>
     * 等同 {@link #setEnableDataVer}
     * @param enableDataVer
     */
    @JsonIgnore
    public PSDataEntity enabledataver(Boolean enableDataVer){
        if(enableDataVer == null){
            this.setEnableDataVer(null);
        }
        else{
            this.setEnableDataVer(enableDataVer?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEDEACTION</B>&nbsp;启用行为服务，指定实体中的行为是否默认启用服务能力，未指定时为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEDEACTION = "enabledeaction";

    /**
     * 设置 启用行为服务，详细说明：{@link #FIELD_ENABLEDEACTION}
     * 
     * @param enableDEAction
     * 
     */
    @JsonProperty(FIELD_ENABLEDEACTION)
    public void setEnableDEAction(Integer enableDEAction){
        this.set(FIELD_ENABLEDEACTION, enableDEAction);
    }
    
    /**
     * 获取 启用行为服务  
     * @return
     */
    @JsonIgnore
    public Integer getEnableDEAction(){
        Object objValue = this.get(FIELD_ENABLEDEACTION);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用行为服务 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableDEActionDirty(){
        if(this.contains(FIELD_ENABLEDEACTION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用行为服务
     */
    @JsonIgnore
    public void resetEnableDEAction(){
        this.reset(FIELD_ENABLEDEACTION);
    }

    /**
     * 设置 启用行为服务，详细说明：{@link #FIELD_ENABLEDEACTION}
     * <P>
     * 等同 {@link #setEnableDEAction}
     * @param enableDEAction
     */
    @JsonIgnore
    public PSDataEntity enabledeaction(Integer enableDEAction){
        this.setEnableDEAction(enableDEAction);
        return this;
    }

     /**
     * 设置 启用行为服务，详细说明：{@link #FIELD_ENABLEDEACTION}
     * <P>
     * 等同 {@link #setEnableDEAction}
     * @param enableDEAction
     */
    @JsonIgnore
    public PSDataEntity enabledeaction(Boolean enableDEAction){
        if(enableDEAction == null){
            this.setEnableDEAction(null);
        }
        else{
            this.setEnableDEAction(enableDEAction?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEDEDATASET</B>&nbsp;启用结果集服务，指定实体中的数据集是否默认启用服务能力，未指定为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEDEDATASET = "enablededataset";

    /**
     * 设置 启用结果集服务，详细说明：{@link #FIELD_ENABLEDEDATASET}
     * 
     * @param enableDEDataSet
     * 
     */
    @JsonProperty(FIELD_ENABLEDEDATASET)
    public void setEnableDEDataSet(Integer enableDEDataSet){
        this.set(FIELD_ENABLEDEDATASET, enableDEDataSet);
    }
    
    /**
     * 获取 启用结果集服务  
     * @return
     */
    @JsonIgnore
    public Integer getEnableDEDataSet(){
        Object objValue = this.get(FIELD_ENABLEDEDATASET);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用结果集服务 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableDEDataSetDirty(){
        if(this.contains(FIELD_ENABLEDEDATASET)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用结果集服务
     */
    @JsonIgnore
    public void resetEnableDEDataSet(){
        this.reset(FIELD_ENABLEDEDATASET);
    }

    /**
     * 设置 启用结果集服务，详细说明：{@link #FIELD_ENABLEDEDATASET}
     * <P>
     * 等同 {@link #setEnableDEDataSet}
     * @param enableDEDataSet
     */
    @JsonIgnore
    public PSDataEntity enablededataset(Integer enableDEDataSet){
        this.setEnableDEDataSet(enableDEDataSet);
        return this;
    }

     /**
     * 设置 启用结果集服务，详细说明：{@link #FIELD_ENABLEDEDATASET}
     * <P>
     * 等同 {@link #setEnableDEDataSet}
     * @param enableDEDataSet
     */
    @JsonIgnore
    public PSDataEntity enablededataset(Boolean enableDEDataSet){
        if(enableDEDataSet == null){
            this.setEnableDEDataSet(null);
        }
        else{
            this.setEnableDEDataSet(enableDEDataSet?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEDYNASYS</B>&nbsp;支持动态系统
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEDynaSysMode} 
     */
    public final static String FIELD_ENABLEDYNASYS = "enabledynasys";

    /**
     * 设置 支持动态系统
     * 
     * @param enableDynaSys
     * 
     */
    @JsonProperty(FIELD_ENABLEDYNASYS)
    public void setEnableDynaSys(Integer enableDynaSys){
        this.set(FIELD_ENABLEDYNASYS, enableDynaSys);
    }
    
    /**
     * 获取 支持动态系统  
     * @return
     */
    @JsonIgnore
    public Integer getEnableDynaSys(){
        Object objValue = this.get(FIELD_ENABLEDYNASYS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持动态系统 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableDynaSysDirty(){
        if(this.contains(FIELD_ENABLEDYNASYS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持动态系统
     */
    @JsonIgnore
    public void resetEnableDynaSys(){
        this.reset(FIELD_ENABLEDYNASYS);
    }

    /**
     * 设置 支持动态系统
     * <P>
     * 等同 {@link #setEnableDynaSys}
     * @param enableDynaSys
     */
    @JsonIgnore
    public PSDataEntity enabledynasys(Integer enableDynaSys){
        this.setEnableDynaSys(enableDynaSys);
        return this;
    }

     /**
     * 设置 支持动态系统
     * <P>
     * 等同 {@link #setEnableDynaSys}
     * @param enableDynaSys
     */
    @JsonIgnore
    public PSDataEntity enabledynasys(net.ibizsys.psmodel.core.util.PSModelEnums.DEDynaSysMode enableDynaSys){
        if(enableDynaSys == null){
            this.setEnableDynaSys(null);
        }
        else{
            this.setEnableDynaSys(enableDynaSys.value);
        }
        return this;
    }

    /**
     * <B>ENABLEENTITYCACHE</B>&nbsp;启用数据缓存，指定实体是否启用数据对象缓存，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEENTITYCACHE = "enableentitycache";

    /**
     * 设置 启用数据缓存，详细说明：{@link #FIELD_ENABLEENTITYCACHE}
     * 
     * @param enableEntityCache
     * 
     */
    @JsonProperty(FIELD_ENABLEENTITYCACHE)
    public void setEnableEntityCache(Integer enableEntityCache){
        this.set(FIELD_ENABLEENTITYCACHE, enableEntityCache);
    }
    
    /**
     * 获取 启用数据缓存  
     * @return
     */
    @JsonIgnore
    public Integer getEnableEntityCache(){
        Object objValue = this.get(FIELD_ENABLEENTITYCACHE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用数据缓存 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableEntityCacheDirty(){
        if(this.contains(FIELD_ENABLEENTITYCACHE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用数据缓存
     */
    @JsonIgnore
    public void resetEnableEntityCache(){
        this.reset(FIELD_ENABLEENTITYCACHE);
    }

    /**
     * 设置 启用数据缓存，详细说明：{@link #FIELD_ENABLEENTITYCACHE}
     * <P>
     * 等同 {@link #setEnableEntityCache}
     * @param enableEntityCache
     */
    @JsonIgnore
    public PSDataEntity enableentitycache(Integer enableEntityCache){
        this.setEnableEntityCache(enableEntityCache);
        return this;
    }

     /**
     * 设置 启用数据缓存，详细说明：{@link #FIELD_ENABLEENTITYCACHE}
     * <P>
     * 等同 {@link #setEnableEntityCache}
     * @param enableEntityCache
     */
    @JsonIgnore
    public PSDataEntity enableentitycache(Boolean enableEntityCache){
        if(enableEntityCache == null){
            this.setEnableEntityCache(null);
        }
        else{
            this.setEnableEntityCache(enableEntityCache?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEMOB</B>&nbsp;支持移动端，指定实体是否支持移动端，如支持移动端则初始化实体将生成默认的移动端界面部件及视图，默认为不支持
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEMOB = "enablemob";

    /**
     * 设置 支持移动端，详细说明：{@link #FIELD_ENABLEMOB}
     * 
     * @param enableMob
     * 
     */
    @JsonProperty(FIELD_ENABLEMOB)
    public void setEnableMob(Integer enableMob){
        this.set(FIELD_ENABLEMOB, enableMob);
    }
    
    /**
     * 获取 支持移动端  
     * @return
     */
    @JsonIgnore
    public Integer getEnableMob(){
        Object objValue = this.get(FIELD_ENABLEMOB);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持移动端 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableMobDirty(){
        if(this.contains(FIELD_ENABLEMOB)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持移动端
     */
    @JsonIgnore
    public void resetEnableMob(){
        this.reset(FIELD_ENABLEMOB);
    }

    /**
     * 设置 支持移动端，详细说明：{@link #FIELD_ENABLEMOB}
     * <P>
     * 等同 {@link #setEnableMob}
     * @param enableMob
     */
    @JsonIgnore
    public PSDataEntity enablemob(Integer enableMob){
        this.setEnableMob(enableMob);
        return this;
    }

     /**
     * 设置 支持移动端，详细说明：{@link #FIELD_ENABLEMOB}
     * <P>
     * 等同 {@link #setEnableMob}
     * @param enableMob
     */
    @JsonIgnore
    public PSDataEntity enablemob(Boolean enableMob){
        if(enableMob == null){
            this.setEnableMob(null);
        }
        else{
            this.setEnableMob(enableMob?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEOPNAMEMODEL</B>&nbsp;启用操作者名称模型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEOPNAMEMODEL = "enableopnamemodel";

    /**
     * 设置 启用操作者名称模型
     * 
     * @param enableOPNameModel
     * 
     */
    @JsonProperty(FIELD_ENABLEOPNAMEMODEL)
    public void setEnableOPNameModel(Integer enableOPNameModel){
        this.set(FIELD_ENABLEOPNAMEMODEL, enableOPNameModel);
    }
    
    /**
     * 获取 启用操作者名称模型  
     * @return
     */
    @JsonIgnore
    public Integer getEnableOPNameModel(){
        Object objValue = this.get(FIELD_ENABLEOPNAMEMODEL);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用操作者名称模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableOPNameModelDirty(){
        if(this.contains(FIELD_ENABLEOPNAMEMODEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用操作者名称模型
     */
    @JsonIgnore
    public void resetEnableOPNameModel(){
        this.reset(FIELD_ENABLEOPNAMEMODEL);
    }

    /**
     * 设置 启用操作者名称模型
     * <P>
     * 等同 {@link #setEnableOPNameModel}
     * @param enableOPNameModel
     */
    @JsonIgnore
    public PSDataEntity enableopnamemodel(Integer enableOPNameModel){
        this.setEnableOPNameModel(enableOPNameModel);
        return this;
    }

     /**
     * 设置 启用操作者名称模型
     * <P>
     * 等同 {@link #setEnableOPNameModel}
     * @param enableOPNameModel
     */
    @JsonIgnore
    public PSDataEntity enableopnamemodel(Boolean enableOPNameModel){
        if(enableOPNameModel == null){
            this.setEnableOPNameModel(null);
        }
        else{
            this.setEnableOPNameModel(enableOPNameModel?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEORGMODEL</B>&nbsp;启用组织模型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEORGMODEL = "enableorgmodel";

    /**
     * 设置 启用组织模型
     * 
     * @param enableOrgModel
     * 
     */
    @JsonProperty(FIELD_ENABLEORGMODEL)
    public void setEnableOrgModel(Integer enableOrgModel){
        this.set(FIELD_ENABLEORGMODEL, enableOrgModel);
    }
    
    /**
     * 获取 启用组织模型  
     * @return
     */
    @JsonIgnore
    public Integer getEnableOrgModel(){
        Object objValue = this.get(FIELD_ENABLEORGMODEL);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用组织模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableOrgModelDirty(){
        if(this.contains(FIELD_ENABLEORGMODEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用组织模型
     */
    @JsonIgnore
    public void resetEnableOrgModel(){
        this.reset(FIELD_ENABLEORGMODEL);
    }

    /**
     * 设置 启用组织模型
     * <P>
     * 等同 {@link #setEnableOrgModel}
     * @param enableOrgModel
     */
    @JsonIgnore
    public PSDataEntity enableorgmodel(Integer enableOrgModel){
        this.setEnableOrgModel(enableOrgModel);
        return this;
    }

     /**
     * 设置 启用组织模型
     * <P>
     * 等同 {@link #setEnableOrgModel}
     * @param enableOrgModel
     */
    @JsonIgnore
    public PSDataEntity enableorgmodel(Boolean enableOrgModel){
        if(enableOrgModel == null){
            this.setEnableOrgModel(null);
        }
        else{
            this.setEnableOrgModel(enableOrgModel?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEPQL</B>&nbsp;启用PQL
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEPQL = "enablepql";

    /**
     * 设置 启用PQL
     * 
     * @param enablePQL
     * 
     */
    @JsonProperty(FIELD_ENABLEPQL)
    public void setEnablePQL(Integer enablePQL){
        this.set(FIELD_ENABLEPQL, enablePQL);
    }
    
    /**
     * 获取 启用PQL  
     * @return
     */
    @JsonIgnore
    public Integer getEnablePQL(){
        Object objValue = this.get(FIELD_ENABLEPQL);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用PQL 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnablePQLDirty(){
        if(this.contains(FIELD_ENABLEPQL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用PQL
     */
    @JsonIgnore
    public void resetEnablePQL(){
        this.reset(FIELD_ENABLEPQL);
    }

    /**
     * 设置 启用PQL
     * <P>
     * 等同 {@link #setEnablePQL}
     * @param enablePQL
     */
    @JsonIgnore
    public PSDataEntity enablepql(Integer enablePQL){
        this.setEnablePQL(enablePQL);
        return this;
    }

     /**
     * 设置 启用PQL
     * <P>
     * 等同 {@link #setEnablePQL}
     * @param enablePQL
     */
    @JsonIgnore
    public PSDataEntity enablepql(Boolean enablePQL){
        if(enablePQL == null){
            this.setEnablePQL(null);
        }
        else{
            this.setEnablePQL(enablePQL?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLESELECT</B>&nbsp;支持简单查询，指定是否启用实体的简单查询服务能力，简单查询是指最基本的查询功能（SELECT），未指定为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLESELECT = "enableselect";

    /**
     * 设置 支持简单查询，详细说明：{@link #FIELD_ENABLESELECT}
     * 
     * @param enableSelect
     * 
     */
    @JsonProperty(FIELD_ENABLESELECT)
    public void setEnableSelect(Integer enableSelect){
        this.set(FIELD_ENABLESELECT, enableSelect);
    }
    
    /**
     * 获取 支持简单查询  
     * @return
     */
    @JsonIgnore
    public Integer getEnableSelect(){
        Object objValue = this.get(FIELD_ENABLESELECT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持简单查询 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableSelectDirty(){
        if(this.contains(FIELD_ENABLESELECT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持简单查询
     */
    @JsonIgnore
    public void resetEnableSelect(){
        this.reset(FIELD_ENABLESELECT);
    }

    /**
     * 设置 支持简单查询，详细说明：{@link #FIELD_ENABLESELECT}
     * <P>
     * 等同 {@link #setEnableSelect}
     * @param enableSelect
     */
    @JsonIgnore
    public PSDataEntity enableselect(Integer enableSelect){
        this.setEnableSelect(enableSelect);
        return this;
    }

     /**
     * 设置 支持简单查询，详细说明：{@link #FIELD_ENABLESELECT}
     * <P>
     * 等同 {@link #setEnableSelect}
     * @param enableSelect
     */
    @JsonIgnore
    public PSDataEntity enableselect(Boolean enableSelect){
        if(enableSelect == null){
            this.setEnableSelect(null);
        }
        else{
            this.setEnableSelect(enableSelect?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEWFMODEL</B>&nbsp;启用工作流模型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEWFMODEL = "enablewfmodel";

    /**
     * 设置 启用工作流模型
     * 
     * @param enableWFModel
     * 
     */
    @JsonProperty(FIELD_ENABLEWFMODEL)
    public void setEnableWFModel(Integer enableWFModel){
        this.set(FIELD_ENABLEWFMODEL, enableWFModel);
    }
    
    /**
     * 获取 启用工作流模型  
     * @return
     */
    @JsonIgnore
    public Integer getEnableWFModel(){
        Object objValue = this.get(FIELD_ENABLEWFMODEL);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用工作流模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableWFModelDirty(){
        if(this.contains(FIELD_ENABLEWFMODEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用工作流模型
     */
    @JsonIgnore
    public void resetEnableWFModel(){
        this.reset(FIELD_ENABLEWFMODEL);
    }

    /**
     * 设置 启用工作流模型
     * <P>
     * 等同 {@link #setEnableWFModel}
     * @param enableWFModel
     */
    @JsonIgnore
    public PSDataEntity enablewfmodel(Integer enableWFModel){
        this.setEnableWFModel(enableWFModel);
        return this;
    }

     /**
     * 设置 启用工作流模型
     * <P>
     * 等同 {@link #setEnableWFModel}
     * @param enableWFModel
     */
    @JsonIgnore
    public PSDataEntity enablewfmodel(Boolean enableWFModel){
        if(enableWFModel == null){
            this.setEnableWFModel(null);
        }
        else{
            this.setEnableWFModel(enableWFModel?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENAMULTIFORM</B>&nbsp;启用多表单，指定实体是否启用多表单展现模式，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEMultiFormMode} 
     */
    public final static String FIELD_ENAMULTIFORM = "enamultiform";

    /**
     * 设置 启用多表单，详细说明：{@link #FIELD_ENAMULTIFORM}
     * 
     * @param enaMultiForm
     * 
     */
    @JsonProperty(FIELD_ENAMULTIFORM)
    public void setEnaMultiForm(Integer enaMultiForm){
        this.set(FIELD_ENAMULTIFORM, enaMultiForm);
    }
    
    /**
     * 获取 启用多表单  
     * @return
     */
    @JsonIgnore
    public Integer getEnaMultiForm(){
        Object objValue = this.get(FIELD_ENAMULTIFORM);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用多表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnaMultiFormDirty(){
        if(this.contains(FIELD_ENAMULTIFORM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用多表单
     */
    @JsonIgnore
    public void resetEnaMultiForm(){
        this.reset(FIELD_ENAMULTIFORM);
    }

    /**
     * 设置 启用多表单，详细说明：{@link #FIELD_ENAMULTIFORM}
     * <P>
     * 等同 {@link #setEnaMultiForm}
     * @param enaMultiForm
     */
    @JsonIgnore
    public PSDataEntity enamultiform(Integer enaMultiForm){
        this.setEnaMultiForm(enaMultiForm);
        return this;
    }

     /**
     * 设置 启用多表单，详细说明：{@link #FIELD_ENAMULTIFORM}
     * <P>
     * 等同 {@link #setEnaMultiForm}
     * @param enaMultiForm
     */
    @JsonIgnore
    public PSDataEntity enamultiform(net.ibizsys.psmodel.core.util.PSModelEnums.DEMultiFormMode enaMultiForm){
        if(enaMultiForm == null){
            this.setEnaMultiForm(null);
        }
        else{
            this.setEnaMultiForm(enaMultiForm.value);
        }
        return this;
    }

    /**
     * <B>ENATEMPDATA</B>&nbsp;启用临时数据，启用临时数据为实体提供主从数据的一致性处理能力
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DETempDataHolder} 
     */
    public final static String FIELD_ENATEMPDATA = "enatempdata";

    /**
     * 设置 启用临时数据，详细说明：{@link #FIELD_ENATEMPDATA}
     * 
     * @param enaTempData
     * 
     */
    @JsonProperty(FIELD_ENATEMPDATA)
    public void setEnaTempData(Integer enaTempData){
        this.set(FIELD_ENATEMPDATA, enaTempData);
    }
    
    /**
     * 获取 启用临时数据  
     * @return
     */
    @JsonIgnore
    public Integer getEnaTempData(){
        Object objValue = this.get(FIELD_ENATEMPDATA);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用临时数据 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnaTempDataDirty(){
        if(this.contains(FIELD_ENATEMPDATA)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用临时数据
     */
    @JsonIgnore
    public void resetEnaTempData(){
        this.reset(FIELD_ENATEMPDATA);
    }

    /**
     * 设置 启用临时数据，详细说明：{@link #FIELD_ENATEMPDATA}
     * <P>
     * 等同 {@link #setEnaTempData}
     * @param enaTempData
     */
    @JsonIgnore
    public PSDataEntity enatempdata(Integer enaTempData){
        this.setEnaTempData(enaTempData);
        return this;
    }

     /**
     * 设置 启用临时数据，详细说明：{@link #FIELD_ENATEMPDATA}
     * <P>
     * 等同 {@link #setEnaTempData}
     * @param enaTempData
     */
    @JsonIgnore
    public PSDataEntity enatempdata(net.ibizsys.psmodel.core.util.PSModelEnums.DETempDataHolder enaTempData){
        if(enaTempData == null){
            this.setEnaTempData(null);
        }
        else{
            this.setEnaTempData(enaTempData.value);
        }
        return this;
    }

    /**
     * <B>ENTITYCACHETIMEOUT</B>&nbsp;数据对象缓存时长，启用实体数据对象缓存功能时指定超时时长，单位为毫秒，-1为永不超时，未定义时为【-1】
     */
    public final static String FIELD_ENTITYCACHETIMEOUT = "entitycachetimeout";

    /**
     * 设置 数据对象缓存时长，详细说明：{@link #FIELD_ENTITYCACHETIMEOUT}
     * 
     * @param entityCacheTimeout
     * 
     */
    @JsonProperty(FIELD_ENTITYCACHETIMEOUT)
    public void setEntityCacheTimeout(Integer entityCacheTimeout){
        this.set(FIELD_ENTITYCACHETIMEOUT, entityCacheTimeout);
    }
    
    /**
     * 获取 数据对象缓存时长  
     * @return
     */
    @JsonIgnore
    public Integer getEntityCacheTimeout(){
        Object objValue = this.get(FIELD_ENTITYCACHETIMEOUT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 数据对象缓存时长 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEntityCacheTimeoutDirty(){
        if(this.contains(FIELD_ENTITYCACHETIMEOUT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据对象缓存时长
     */
    @JsonIgnore
    public void resetEntityCacheTimeout(){
        this.reset(FIELD_ENTITYCACHETIMEOUT);
    }

    /**
     * 设置 数据对象缓存时长，详细说明：{@link #FIELD_ENTITYCACHETIMEOUT}
     * <P>
     * 等同 {@link #setEntityCacheTimeout}
     * @param entityCacheTimeout
     */
    @JsonIgnore
    public PSDataEntity entitycachetimeout(Integer entityCacheTimeout){
        this.setEntityCacheTimeout(entityCacheTimeout);
        return this;
    }

    /**
     * <B>EXISTINGMODEL</B>&nbsp;现有数据结构，指定实体是否基于已存在的数据模型构建，如设定为【是】则实体不会初始化默认的属性，默认为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_EXISTINGMODEL = "existingmodel";

    /**
     * 设置 现有数据结构，详细说明：{@link #FIELD_EXISTINGMODEL}
     * 
     * @param existingModel
     * 
     */
    @JsonProperty(FIELD_EXISTINGMODEL)
    public void setExistingModel(Integer existingModel){
        this.set(FIELD_EXISTINGMODEL, existingModel);
    }
    
    /**
     * 获取 现有数据结构  
     * @return
     */
    @JsonIgnore
    public Integer getExistingModel(){
        Object objValue = this.get(FIELD_EXISTINGMODEL);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 现有数据结构 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExistingModelDirty(){
        if(this.contains(FIELD_EXISTINGMODEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 现有数据结构
     */
    @JsonIgnore
    public void resetExistingModel(){
        this.reset(FIELD_EXISTINGMODEL);
    }

    /**
     * 设置 现有数据结构，详细说明：{@link #FIELD_EXISTINGMODEL}
     * <P>
     * 等同 {@link #setExistingModel}
     * @param existingModel
     */
    @JsonIgnore
    public PSDataEntity existingmodel(Integer existingModel){
        this.setExistingModel(existingModel);
        return this;
    }

     /**
     * 设置 现有数据结构，详细说明：{@link #FIELD_EXISTINGMODEL}
     * <P>
     * 等同 {@link #setExistingModel}
     * @param existingModel
     */
    @JsonIgnore
    public PSDataEntity existingmodel(Boolean existingModel){
        if(existingModel == null){
            this.setExistingModel(null);
        }
        else{
            this.setExistingModel(existingModel?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>INDEXDETYPE</B>&nbsp;索引类型，指定实体的索引类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEIndexType} 
     */
    public final static String FIELD_INDEXDETYPE = "indexdetype";

    /**
     * 设置 索引类型，详细说明：{@link #FIELD_INDEXDETYPE}
     * 
     * @param indexDEType
     * 
     */
    @JsonProperty(FIELD_INDEXDETYPE)
    public void setIndexDEType(String indexDEType){
        this.set(FIELD_INDEXDETYPE, indexDEType);
    }
    
    /**
     * 获取 索引类型  
     * @return
     */
    @JsonIgnore
    public String getIndexDEType(){
        Object objValue = this.get(FIELD_INDEXDETYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 索引类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIndexDETypeDirty(){
        if(this.contains(FIELD_INDEXDETYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 索引类型
     */
    @JsonIgnore
    public void resetIndexDEType(){
        this.reset(FIELD_INDEXDETYPE);
    }

    /**
     * 设置 索引类型，详细说明：{@link #FIELD_INDEXDETYPE}
     * <P>
     * 等同 {@link #setIndexDEType}
     * @param indexDEType
     */
    @JsonIgnore
    public PSDataEntity indexdetype(String indexDEType){
        this.setIndexDEType(indexDEType);
        return this;
    }

     /**
     * 设置 索引类型，详细说明：{@link #FIELD_INDEXDETYPE}
     * <P>
     * 等同 {@link #setIndexDEType}
     * @param indexDEType
     */
    @JsonIgnore
    public PSDataEntity indexdetype(net.ibizsys.psmodel.core.util.PSModelEnums.DEIndexType indexDEType){
        if(indexDEType == null){
            this.setIndexDEType(null);
        }
        else{
            this.setIndexDEType(indexDEType.value);
        }
        return this;
    }

    /**
     * <B>KEYRULE</B>&nbsp;联合主键模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEUnionKeyMode} 
     */
    public final static String FIELD_KEYRULE = "keyrule";

    /**
     * 设置 联合主键模式
     * 
     * @param keyRule
     * 
     */
    @JsonProperty(FIELD_KEYRULE)
    public void setKeyRule(String keyRule){
        this.set(FIELD_KEYRULE, keyRule);
    }
    
    /**
     * 获取 联合主键模式  
     * @return
     */
    @JsonIgnore
    public String getKeyRule(){
        Object objValue = this.get(FIELD_KEYRULE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 联合主键模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isKeyRuleDirty(){
        if(this.contains(FIELD_KEYRULE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 联合主键模式
     */
    @JsonIgnore
    public void resetKeyRule(){
        this.reset(FIELD_KEYRULE);
    }

    /**
     * 设置 联合主键模式
     * <P>
     * 等同 {@link #setKeyRule}
     * @param keyRule
     */
    @JsonIgnore
    public PSDataEntity keyrule(String keyRule){
        this.setKeyRule(keyRule);
        return this;
    }

     /**
     * 设置 联合主键模式
     * <P>
     * 等同 {@link #setKeyRule}
     * @param keyRule
     */
    @JsonIgnore
    public PSDataEntity keyrule(net.ibizsys.psmodel.core.util.PSModelEnums.DEUnionKeyMode keyRule){
        if(keyRule == null){
            this.setKeyRule(null);
        }
        else{
            this.setKeyRule(keyRule.value);
        }
        return this;
    }

    /**
     * <B>LNPSLANRESID</B>&nbsp;名称语言资源，指定实体逻辑名称的多语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_LNPSLANRESID = "lnpslanresid";

    /**
     * 设置 名称语言资源，详细说明：{@link #FIELD_LNPSLANRESID}
     * 
     * @param lNPSLanResId
     * 
     */
    @JsonProperty(FIELD_LNPSLANRESID)
    public void setLNPSLanResId(String lNPSLanResId){
        this.set(FIELD_LNPSLANRESID, lNPSLanResId);
    }
    
    /**
     * 获取 名称语言资源  
     * @return
     */
    @JsonIgnore
    public String getLNPSLanResId(){
        Object objValue = this.get(FIELD_LNPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 名称语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLNPSLanResIdDirty(){
        if(this.contains(FIELD_LNPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 名称语言资源
     */
    @JsonIgnore
    public void resetLNPSLanResId(){
        this.reset(FIELD_LNPSLANRESID);
    }

    /**
     * 设置 名称语言资源，详细说明：{@link #FIELD_LNPSLANRESID}
     * <P>
     * 等同 {@link #setLNPSLanResId}
     * @param lNPSLanResId
     */
    @JsonIgnore
    public PSDataEntity lnpslanresid(String lNPSLanResId){
        this.setLNPSLanResId(lNPSLanResId);
        return this;
    }

    /**
     * 设置 名称语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setLNPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSDataEntity lnpslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setLNPSLanResId(null);
            this.setLNPSLanResName(null);
        }
        else{
            this.setLNPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setLNPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>LNPSLANRESNAME</B>&nbsp;名称语言资源，指定实体逻辑名称的多语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_LNPSLANRESID}
     */
    public final static String FIELD_LNPSLANRESNAME = "lnpslanresname";

    /**
     * 设置 名称语言资源，详细说明：{@link #FIELD_LNPSLANRESNAME}
     * 
     * @param lNPSLanResName
     * 
     */
    @JsonProperty(FIELD_LNPSLANRESNAME)
    public void setLNPSLanResName(String lNPSLanResName){
        this.set(FIELD_LNPSLANRESNAME, lNPSLanResName);
    }
    
    /**
     * 获取 名称语言资源  
     * @return
     */
    @JsonIgnore
    public String getLNPSLanResName(){
        Object objValue = this.get(FIELD_LNPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 名称语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLNPSLanResNameDirty(){
        if(this.contains(FIELD_LNPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 名称语言资源
     */
    @JsonIgnore
    public void resetLNPSLanResName(){
        this.reset(FIELD_LNPSLANRESNAME);
    }

    /**
     * 设置 名称语言资源，详细说明：{@link #FIELD_LNPSLANRESNAME}
     * <P>
     * 等同 {@link #setLNPSLanResName}
     * @param lNPSLanResName
     */
    @JsonIgnore
    public PSDataEntity lnpslanresname(String lNPSLanResName){
        this.setLNPSLanResName(lNPSLanResName);
        return this;
    }

    /**
     * <B>LOGICINVALIDVALUE</B>&nbsp;逻辑无效值，在启用实体逻辑删除后，设置数据的无效值标志（删除），默认为【0】
     * <P>
     * 字符串：最大长度 10
     */
    public final static String FIELD_LOGICINVALIDVALUE = "logicinvalidvalue";

    /**
     * 设置 逻辑无效值，详细说明：{@link #FIELD_LOGICINVALIDVALUE}
     * 
     * @param logicInvalidValue
     * 
     */
    @JsonProperty(FIELD_LOGICINVALIDVALUE)
    public void setLogicInvalidValue(String logicInvalidValue){
        this.set(FIELD_LOGICINVALIDVALUE, logicInvalidValue);
    }
    
    /**
     * 获取 逻辑无效值  
     * @return
     */
    @JsonIgnore
    public String getLogicInvalidValue(){
        Object objValue = this.get(FIELD_LOGICINVALIDVALUE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 逻辑无效值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLogicInvalidValueDirty(){
        if(this.contains(FIELD_LOGICINVALIDVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 逻辑无效值
     */
    @JsonIgnore
    public void resetLogicInvalidValue(){
        this.reset(FIELD_LOGICINVALIDVALUE);
    }

    /**
     * 设置 逻辑无效值，详细说明：{@link #FIELD_LOGICINVALIDVALUE}
     * <P>
     * 等同 {@link #setLogicInvalidValue}
     * @param logicInvalidValue
     */
    @JsonIgnore
    public PSDataEntity logicinvalidvalue(String logicInvalidValue){
        this.setLogicInvalidValue(logicInvalidValue);
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;中文名称，指定实体的逻辑名称
     * <P>
     * 字符串：最大长度 60
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
    public PSDataEntity logicname(String logicName){
        this.setLogicName(logicName);
        return this;
    }

    /**
     * <B>LOGICVALID</B>&nbsp;启用逻辑删除，指定实体是否启用逻辑删除，逻辑删除是指非真实删除数据，而是对特定属性打上标记，将其排除出正常的访问数据，启用逻辑删除，还可进一步设定控制属性及标记值，默认为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_LOGICVALID = "logicvalid";

    /**
     * 设置 启用逻辑删除，详细说明：{@link #FIELD_LOGICVALID}
     * 
     * @param logicValid
     * 
     */
    @JsonProperty(FIELD_LOGICVALID)
    public void setLogicValid(Integer logicValid){
        this.set(FIELD_LOGICVALID, logicValid);
    }
    
    /**
     * 获取 启用逻辑删除  
     * @return
     */
    @JsonIgnore
    public Integer getLogicValid(){
        Object objValue = this.get(FIELD_LOGICVALID);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用逻辑删除 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLogicValidDirty(){
        if(this.contains(FIELD_LOGICVALID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用逻辑删除
     */
    @JsonIgnore
    public void resetLogicValid(){
        this.reset(FIELD_LOGICVALID);
    }

    /**
     * 设置 启用逻辑删除，详细说明：{@link #FIELD_LOGICVALID}
     * <P>
     * 等同 {@link #setLogicValid}
     * @param logicValid
     */
    @JsonIgnore
    public PSDataEntity logicvalid(Integer logicValid){
        this.setLogicValid(logicValid);
        return this;
    }

     /**
     * 设置 启用逻辑删除，详细说明：{@link #FIELD_LOGICVALID}
     * <P>
     * 等同 {@link #setLogicValid}
     * @param logicValid
     */
    @JsonIgnore
    public PSDataEntity logicvalid(Boolean logicValid){
        if(logicValid == null){
            this.setLogicValid(null);
        }
        else{
            this.setLogicValid(logicValid?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>LOGICVALIDVALUE</B>&nbsp;逻辑有效值，在启用实体逻辑删除后，设置数据的有效值标志，默认为【1】
     * <P>
     * 字符串：最大长度 10
     */
    public final static String FIELD_LOGICVALIDVALUE = "logicvalidvalue";

    /**
     * 设置 逻辑有效值，详细说明：{@link #FIELD_LOGICVALIDVALUE}
     * 
     * @param logicValidValue
     * 
     */
    @JsonProperty(FIELD_LOGICVALIDVALUE)
    public void setLogicValidValue(String logicValidValue){
        this.set(FIELD_LOGICVALIDVALUE, logicValidValue);
    }
    
    /**
     * 获取 逻辑有效值  
     * @return
     */
    @JsonIgnore
    public String getLogicValidValue(){
        Object objValue = this.get(FIELD_LOGICVALIDVALUE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 逻辑有效值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLogicValidValueDirty(){
        if(this.contains(FIELD_LOGICVALIDVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 逻辑有效值
     */
    @JsonIgnore
    public void resetLogicValidValue(){
        this.reset(FIELD_LOGICVALIDVALUE);
    }

    /**
     * 设置 逻辑有效值，详细说明：{@link #FIELD_LOGICVALIDVALUE}
     * <P>
     * 等同 {@link #setLogicValidValue}
     * @param logicValidValue
     */
    @JsonIgnore
    public PSDataEntity logicvalidvalue(String logicValidValue){
        this.setLogicValidValue(logicValidValue);
        return this;
    }

    /**
     * <B>MAXENTITYCACHECNT</B>&nbsp;最大缓存数据对象数
     */
    public final static String FIELD_MAXENTITYCACHECNT = "maxentitycachecnt";

    /**
     * 设置 最大缓存数据对象数
     * 
     * @param maxEntityCacheCnt
     * 
     */
    @JsonProperty(FIELD_MAXENTITYCACHECNT)
    public void setMaxEntityCacheCnt(Integer maxEntityCacheCnt){
        this.set(FIELD_MAXENTITYCACHECNT, maxEntityCacheCnt);
    }
    
    /**
     * 获取 最大缓存数据对象数  
     * @return
     */
    @JsonIgnore
    public Integer getMaxEntityCacheCnt(){
        Object objValue = this.get(FIELD_MAXENTITYCACHECNT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 最大缓存数据对象数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMaxEntityCacheCntDirty(){
        if(this.contains(FIELD_MAXENTITYCACHECNT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 最大缓存数据对象数
     */
    @JsonIgnore
    public void resetMaxEntityCacheCnt(){
        this.reset(FIELD_MAXENTITYCACHECNT);
    }

    /**
     * 设置 最大缓存数据对象数
     * <P>
     * 等同 {@link #setMaxEntityCacheCnt}
     * @param maxEntityCacheCnt
     */
    @JsonIgnore
    public PSDataEntity maxentitycachecnt(Integer maxEntityCacheCnt){
        this.setMaxEntityCacheCnt(maxEntityCacheCnt);
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
    public PSDataEntity memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MODCOLOR</B>&nbsp;模块颜色
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSMODULEID}
     */
    public final static String FIELD_MODCOLOR = "modcolor";

    /**
     * 设置 模块颜色
     * 
     * @param modColor
     * 
     */
    @JsonProperty(FIELD_MODCOLOR)
    public void setModColor(String modColor){
        this.set(FIELD_MODCOLOR, modColor);
    }
    
    /**
     * 获取 模块颜色  
     * @return
     */
    @JsonIgnore
    public String getModColor(){
        Object objValue = this.get(FIELD_MODCOLOR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模块颜色 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isModColorDirty(){
        if(this.contains(FIELD_MODCOLOR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模块颜色
     */
    @JsonIgnore
    public void resetModColor(){
        this.reset(FIELD_MODCOLOR);
    }

    /**
     * 设置 模块颜色
     * <P>
     * 等同 {@link #setModColor}
     * @param modColor
     */
    @JsonIgnore
    public PSDataEntity modcolor(String modColor){
        this.setModColor(modColor);
        return this;
    }

    /**
     * <B>MSACTIONLOGICFLAG</B>&nbsp;主状态行为控制模式，启用主状态的实体会对行为注入的相应的限制逻辑，控制模式是指注入逻辑的方式，未定义时使用系统的设定
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEMSActionLogicMode} 
     */
    public final static String FIELD_MSACTIONLOGICFLAG = "msactionlogicflag";

    /**
     * 设置 主状态行为控制模式，详细说明：{@link #FIELD_MSACTIONLOGICFLAG}
     * 
     * @param mSActionLogicFlag
     * 
     */
    @JsonProperty(FIELD_MSACTIONLOGICFLAG)
    public void setMSActionLogicFlag(Integer mSActionLogicFlag){
        this.set(FIELD_MSACTIONLOGICFLAG, mSActionLogicFlag);
    }
    
    /**
     * 获取 主状态行为控制模式  
     * @return
     */
    @JsonIgnore
    public Integer getMSActionLogicFlag(){
        Object objValue = this.get(FIELD_MSACTIONLOGICFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 主状态行为控制模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMSActionLogicFlagDirty(){
        if(this.contains(FIELD_MSACTIONLOGICFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主状态行为控制模式
     */
    @JsonIgnore
    public void resetMSActionLogicFlag(){
        this.reset(FIELD_MSACTIONLOGICFLAG);
    }

    /**
     * 设置 主状态行为控制模式，详细说明：{@link #FIELD_MSACTIONLOGICFLAG}
     * <P>
     * 等同 {@link #setMSActionLogicFlag}
     * @param mSActionLogicFlag
     */
    @JsonIgnore
    public PSDataEntity msactionlogicflag(Integer mSActionLogicFlag){
        this.setMSActionLogicFlag(mSActionLogicFlag);
        return this;
    }

     /**
     * 设置 主状态行为控制模式，详细说明：{@link #FIELD_MSACTIONLOGICFLAG}
     * <P>
     * 等同 {@link #setMSActionLogicFlag}
     * @param mSActionLogicFlag
     */
    @JsonIgnore
    public PSDataEntity msactionlogicflag(net.ibizsys.psmodel.core.util.PSModelEnums.DEMSActionLogicMode mSActionLogicFlag){
        if(mSActionLogicFlag == null){
            this.setMSActionLogicFlag(null);
        }
        else{
            this.setMSActionLogicFlag(mSActionLogicFlag.value);
        }
        return this;
    }

    /**
     * <B>NOVIEWMODE</B>&nbsp;无视图模式，指定实体是否不通过视图（VIEW）的方式访问数据库数据，未定义时使用系统的【无视图模式】设置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_NOVIEWMODE = "noviewmode";

    /**
     * 设置 无视图模式，详细说明：{@link #FIELD_NOVIEWMODE}
     * 
     * @param noViewMode
     * 
     */
    @JsonProperty(FIELD_NOVIEWMODE)
    public void setNoViewMode(Integer noViewMode){
        this.set(FIELD_NOVIEWMODE, noViewMode);
    }
    
    /**
     * 获取 无视图模式  
     * @return
     */
    @JsonIgnore
    public Integer getNoViewMode(){
        Object objValue = this.get(FIELD_NOVIEWMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 无视图模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNoViewModeDirty(){
        if(this.contains(FIELD_NOVIEWMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 无视图模式
     */
    @JsonIgnore
    public void resetNoViewMode(){
        this.reset(FIELD_NOVIEWMODE);
    }

    /**
     * 设置 无视图模式，详细说明：{@link #FIELD_NOVIEWMODE}
     * <P>
     * 等同 {@link #setNoViewMode}
     * @param noViewMode
     */
    @JsonIgnore
    public PSDataEntity noviewmode(Integer noViewMode){
        this.setNoViewMode(noViewMode);
        return this;
    }

     /**
     * 设置 无视图模式，详细说明：{@link #FIELD_NOVIEWMODE}
     * <P>
     * 等同 {@link #setNoViewMode}
     * @param noViewMode
     */
    @JsonIgnore
    public PSDataEntity noviewmode(Boolean noViewMode){
        if(noViewMode == null){
            this.setNoViewMode(null);
        }
        else{
            this.setNoViewMode(noViewMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;排序值
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 排序值
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
     * 设置 排序值
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSDataEntity ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSDATAENTITYID</B>&nbsp;实体标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDATAENTITYID = "psdataentityid";

    /**
     * 设置 实体标识
     * 
     * @param pSDataEntityId
     * 
     */
    @JsonProperty(FIELD_PSDATAENTITYID)
    public void setPSDataEntityId(String pSDataEntityId){
        this.set(FIELD_PSDATAENTITYID, pSDataEntityId);
    }
    
    /**
     * 获取 实体标识  
     * @return
     */
    @JsonIgnore
    public String getPSDataEntityId(){
        Object objValue = this.get(FIELD_PSDATAENTITYID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDataEntityIdDirty(){
        if(this.contains(FIELD_PSDATAENTITYID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体标识
     */
    @JsonIgnore
    public void resetPSDataEntityId(){
        this.reset(FIELD_PSDATAENTITYID);
    }

    /**
     * 设置 实体标识
     * <P>
     * 等同 {@link #setPSDataEntityId}
     * @param pSDataEntityId
     */
    @JsonIgnore
    public PSDataEntity psdataentityid(String pSDataEntityId){
        this.setPSDataEntityId(pSDataEntityId);
        return this;
    }

    /**
     * <B>PSDATAENTITYNAME</B>&nbsp;实体标识，指定实体的标识，需要在系统或所在模型组中具有唯一性
     * <P>
     * 字符串：最大长度 60，由大写字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSDATAENTITYNAME = "psdataentityname";

    /**
     * 设置 实体标识，详细说明：{@link #FIELD_PSDATAENTITYNAME}
     * 
     * @param pSDataEntityName
     * 
     */
    @JsonProperty(FIELD_PSDATAENTITYNAME)
    public void setPSDataEntityName(String pSDataEntityName){
        this.set(FIELD_PSDATAENTITYNAME, pSDataEntityName);
    }
    
    /**
     * 获取 实体标识  
     * @return
     */
    @JsonIgnore
    public String getPSDataEntityName(){
        Object objValue = this.get(FIELD_PSDATAENTITYNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDataEntityNameDirty(){
        if(this.contains(FIELD_PSDATAENTITYNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体标识
     */
    @JsonIgnore
    public void resetPSDataEntityName(){
        this.reset(FIELD_PSDATAENTITYNAME);
    }

    /**
     * 设置 实体标识，详细说明：{@link #FIELD_PSDATAENTITYNAME}
     * <P>
     * 等同 {@link #setPSDataEntityName}
     * @param pSDataEntityName
     */
    @JsonIgnore
    public PSDataEntity psdataentityname(String pSDataEntityName){
        this.setPSDataEntityName(pSDataEntityName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDataEntityName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDataEntityName(strName);
    }

    @JsonIgnore
    public PSDataEntity name(String strName){
        this.setPSDataEntityName(strName);
        return this;
    }

    /**
     * <B>PSDEFINPUTTIPSETID</B>&nbsp;默认属性输入提示集，指定实体使用的默认属性输入提示集
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEFInputTipSet} 
     */
    public final static String FIELD_PSDEFINPUTTIPSETID = "psdefinputtipsetid";

    /**
     * 设置 默认属性输入提示集，详细说明：{@link #FIELD_PSDEFINPUTTIPSETID}
     * 
     * @param pSDEFInputTipSetId
     * 
     */
    @JsonProperty(FIELD_PSDEFINPUTTIPSETID)
    public void setPSDEFInputTipSetId(String pSDEFInputTipSetId){
        this.set(FIELD_PSDEFINPUTTIPSETID, pSDEFInputTipSetId);
    }
    
    /**
     * 获取 默认属性输入提示集  
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
     * 判断 默认属性输入提示集 是否指定值，包括空值
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
     * 重置 默认属性输入提示集
     */
    @JsonIgnore
    public void resetPSDEFInputTipSetId(){
        this.reset(FIELD_PSDEFINPUTTIPSETID);
    }

    /**
     * 设置 默认属性输入提示集，详细说明：{@link #FIELD_PSDEFINPUTTIPSETID}
     * <P>
     * 等同 {@link #setPSDEFInputTipSetId}
     * @param pSDEFInputTipSetId
     */
    @JsonIgnore
    public PSDataEntity psdefinputtipsetid(String pSDEFInputTipSetId){
        this.setPSDEFInputTipSetId(pSDEFInputTipSetId);
        return this;
    }

    /**
     * 设置 默认属性输入提示集，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEFInputTipSetId}
     * @param pSDEFInputTipSet 引用对象
     */
    @JsonIgnore
    public PSDataEntity psdefinputtipsetid(PSDEFInputTipSet pSDEFInputTipSet){
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
     * <B>PSDEFINPUTTIPSETNAME</B>&nbsp;默认属性输入提示集，指定实体使用的默认属性输入提示集
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFINPUTTIPSETID}
     */
    public final static String FIELD_PSDEFINPUTTIPSETNAME = "psdefinputtipsetname";

    /**
     * 设置 默认属性输入提示集，详细说明：{@link #FIELD_PSDEFINPUTTIPSETNAME}
     * 
     * @param pSDEFInputTipSetName
     * 
     */
    @JsonProperty(FIELD_PSDEFINPUTTIPSETNAME)
    public void setPSDEFInputTipSetName(String pSDEFInputTipSetName){
        this.set(FIELD_PSDEFINPUTTIPSETNAME, pSDEFInputTipSetName);
    }
    
    /**
     * 获取 默认属性输入提示集  
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
     * 判断 默认属性输入提示集 是否指定值，包括空值
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
     * 重置 默认属性输入提示集
     */
    @JsonIgnore
    public void resetPSDEFInputTipSetName(){
        this.reset(FIELD_PSDEFINPUTTIPSETNAME);
    }

    /**
     * 设置 默认属性输入提示集，详细说明：{@link #FIELD_PSDEFINPUTTIPSETNAME}
     * <P>
     * 等同 {@link #setPSDEFInputTipSetName}
     * @param pSDEFInputTipSetName
     */
    @JsonIgnore
    public PSDataEntity psdefinputtipsetname(String pSDEFInputTipSetName){
        this.setPSDEFInputTipSetName(pSDEFInputTipSetName);
        return this;
    }

    /**
     * <B>PSDYNADETEMPLNAME</B>&nbsp;动态实体模板
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDYNADETEMPLID}
     */
    public final static String FIELD_PSDYNADETEMPLNAME = "psdynadetemplname";

    /**
     * 设置 动态实体模板
     * 
     * @param pSDynaDETemplName
     * 
     */
    @JsonProperty(FIELD_PSDYNADETEMPLNAME)
    public void setPSDynaDETemplName(String pSDynaDETemplName){
        this.set(FIELD_PSDYNADETEMPLNAME, pSDynaDETemplName);
    }
    
    /**
     * 获取 动态实体模板  
     * @return
     */
    @JsonIgnore
    public String getPSDynaDETemplName(){
        Object objValue = this.get(FIELD_PSDYNADETEMPLNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 动态实体模板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDynaDETemplNameDirty(){
        if(this.contains(FIELD_PSDYNADETEMPLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 动态实体模板
     */
    @JsonIgnore
    public void resetPSDynaDETemplName(){
        this.reset(FIELD_PSDYNADETEMPLNAME);
    }

    /**
     * 设置 动态实体模板
     * <P>
     * 等同 {@link #setPSDynaDETemplName}
     * @param pSDynaDETemplName
     */
    @JsonIgnore
    public PSDataEntity psdynadetemplname(String pSDynaDETemplName){
        this.setPSDynaDETemplName(pSDynaDETemplName);
        return this;
    }

    /**
     * <B>PSHELPMODULEID</B>&nbsp;默认帮助模块
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSHELPMODULEID = "pshelpmoduleid";

    /**
     * 设置 默认帮助模块
     * 
     * @param pSHelpModuleId
     * 
     */
    @JsonProperty(FIELD_PSHELPMODULEID)
    public void setPSHelpModuleId(String pSHelpModuleId){
        this.set(FIELD_PSHELPMODULEID, pSHelpModuleId);
    }
    
    /**
     * 获取 默认帮助模块  
     * @return
     */
    @JsonIgnore
    public String getPSHelpModuleId(){
        Object objValue = this.get(FIELD_PSHELPMODULEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认帮助模块 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSHelpModuleIdDirty(){
        if(this.contains(FIELD_PSHELPMODULEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认帮助模块
     */
    @JsonIgnore
    public void resetPSHelpModuleId(){
        this.reset(FIELD_PSHELPMODULEID);
    }

    /**
     * 设置 默认帮助模块
     * <P>
     * 等同 {@link #setPSHelpModuleId}
     * @param pSHelpModuleId
     */
    @JsonIgnore
    public PSDataEntity pshelpmoduleid(String pSHelpModuleId){
        this.setPSHelpModuleId(pSHelpModuleId);
        return this;
    }

    /**
     * <B>PSHELPMODULENAME</B>&nbsp;默认帮助模块
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSHELPMODULEID}
     */
    public final static String FIELD_PSHELPMODULENAME = "pshelpmodulename";

    /**
     * 设置 默认帮助模块
     * 
     * @param pSHelpModuleName
     * 
     */
    @JsonProperty(FIELD_PSHELPMODULENAME)
    public void setPSHelpModuleName(String pSHelpModuleName){
        this.set(FIELD_PSHELPMODULENAME, pSHelpModuleName);
    }
    
    /**
     * 获取 默认帮助模块  
     * @return
     */
    @JsonIgnore
    public String getPSHelpModuleName(){
        Object objValue = this.get(FIELD_PSHELPMODULENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认帮助模块 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSHelpModuleNameDirty(){
        if(this.contains(FIELD_PSHELPMODULENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认帮助模块
     */
    @JsonIgnore
    public void resetPSHelpModuleName(){
        this.reset(FIELD_PSHELPMODULENAME);
    }

    /**
     * 设置 默认帮助模块
     * <P>
     * 等同 {@link #setPSHelpModuleName}
     * @param pSHelpModuleName
     */
    @JsonIgnore
    public PSDataEntity pshelpmodulename(String pSHelpModuleName){
        this.setPSHelpModuleName(pSHelpModuleName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定实体所在的系统模块，某些实体配置在未指定的情况下会使用系统模块的配置。
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
    public PSDataEntity psmoduleid(String pSModuleId){
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
    public PSDataEntity psmoduleid(PSModule pSModule){
        if(pSModule == null){
            this.setModColor(null);
            this.setPSModuleId(null);
            this.setPSModuleName(null);
            this.setSubSysModule(null);
        }
        else{
            this.setModColor(pSModule.getColor());
            this.setPSModuleId(pSModule.getPSModuleId());
            this.setPSModuleName(pSModule.getPSModuleName());
            this.setSubSysModule(pSModule.getSubSysModule());
        }
        return this;
    }

    /**
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定实体所在的系统模块，某些实体配置在未指定的情况下会使用系统模块的配置。
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
    public PSDataEntity psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSUBSYSSADEID</B>&nbsp;外部接口实体，指定实体在支持外部接口持久化时使用的外部接口实体对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSubSysSADE} 
     */
    public final static String FIELD_PSSUBSYSSADEID = "pssubsyssadeid";

    /**
     * 设置 外部接口实体，详细说明：{@link #FIELD_PSSUBSYSSADEID}
     * 
     * @param pSSubSysSADEId
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSADEID)
    public void setPSSubSysSADEId(String pSSubSysSADEId){
        this.set(FIELD_PSSUBSYSSADEID, pSSubSysSADEId);
    }
    
    /**
     * 获取 外部接口实体  
     * @return
     */
    @JsonIgnore
    public String getPSSubSysSADEId(){
        Object objValue = this.get(FIELD_PSSUBSYSSADEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 外部接口实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubSysSADEIdDirty(){
        if(this.contains(FIELD_PSSUBSYSSADEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 外部接口实体
     */
    @JsonIgnore
    public void resetPSSubSysSADEId(){
        this.reset(FIELD_PSSUBSYSSADEID);
    }

    /**
     * 设置 外部接口实体，详细说明：{@link #FIELD_PSSUBSYSSADEID}
     * <P>
     * 等同 {@link #setPSSubSysSADEId}
     * @param pSSubSysSADEId
     */
    @JsonIgnore
    public PSDataEntity pssubsyssadeid(String pSSubSysSADEId){
        this.setPSSubSysSADEId(pSSubSysSADEId);
        return this;
    }

    /**
     * 设置 外部接口实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSubSysSADEId}
     * @param pSSubSysSADE 引用对象
     */
    @JsonIgnore
    public PSDataEntity pssubsyssadeid(PSSubSysSADE pSSubSysSADE){
        if(pSSubSysSADE == null){
            this.setPSSubSysSADEId(null);
            this.setPSSubSysSADEName(null);
        }
        else{
            this.setPSSubSysSADEId(pSSubSysSADE.getPSSubSysSADEId());
            this.setPSSubSysSADEName(pSSubSysSADE.getPSSubSysSADEName());
        }
        return this;
    }

    /**
     * <B>PSSUBSYSSADENAME</B>&nbsp;外部接口实体，指定实体在支持外部接口持久化时使用的外部接口实体对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSUBSYSSADEID}
     */
    public final static String FIELD_PSSUBSYSSADENAME = "pssubsyssadename";

    /**
     * 设置 外部接口实体，详细说明：{@link #FIELD_PSSUBSYSSADENAME}
     * 
     * @param pSSubSysSADEName
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSADENAME)
    public void setPSSubSysSADEName(String pSSubSysSADEName){
        this.set(FIELD_PSSUBSYSSADENAME, pSSubSysSADEName);
    }
    
    /**
     * 获取 外部接口实体  
     * @return
     */
    @JsonIgnore
    public String getPSSubSysSADEName(){
        Object objValue = this.get(FIELD_PSSUBSYSSADENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 外部接口实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubSysSADENameDirty(){
        if(this.contains(FIELD_PSSUBSYSSADENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 外部接口实体
     */
    @JsonIgnore
    public void resetPSSubSysSADEName(){
        this.reset(FIELD_PSSUBSYSSADENAME);
    }

    /**
     * 设置 外部接口实体，详细说明：{@link #FIELD_PSSUBSYSSADENAME}
     * <P>
     * 等同 {@link #setPSSubSysSADEName}
     * @param pSSubSysSADEName
     */
    @JsonIgnore
    public PSDataEntity pssubsyssadename(String pSSubSysSADEName){
        this.setPSSubSysSADEName(pSSubSysSADEName);
        return this;
    }

    /**
     * <B>PSSUBSYSSERVICEAPIID</B>&nbsp;外部服务接口，指定实体在支持外部接口持久化时使用的外部接口
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSubSysServiceAPI} 
     */
    public final static String FIELD_PSSUBSYSSERVICEAPIID = "pssubsysserviceapiid";

    /**
     * 设置 外部服务接口，详细说明：{@link #FIELD_PSSUBSYSSERVICEAPIID}
     * 
     * @param pSSubSysServiceAPIId
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSERVICEAPIID)
    public void setPSSubSysServiceAPIId(String pSSubSysServiceAPIId){
        this.set(FIELD_PSSUBSYSSERVICEAPIID, pSSubSysServiceAPIId);
    }
    
    /**
     * 获取 外部服务接口  
     * @return
     */
    @JsonIgnore
    public String getPSSubSysServiceAPIId(){
        Object objValue = this.get(FIELD_PSSUBSYSSERVICEAPIID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 外部服务接口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubSysServiceAPIIdDirty(){
        if(this.contains(FIELD_PSSUBSYSSERVICEAPIID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 外部服务接口
     */
    @JsonIgnore
    public void resetPSSubSysServiceAPIId(){
        this.reset(FIELD_PSSUBSYSSERVICEAPIID);
    }

    /**
     * 设置 外部服务接口，详细说明：{@link #FIELD_PSSUBSYSSERVICEAPIID}
     * <P>
     * 等同 {@link #setPSSubSysServiceAPIId}
     * @param pSSubSysServiceAPIId
     */
    @JsonIgnore
    public PSDataEntity pssubsysserviceapiid(String pSSubSysServiceAPIId){
        this.setPSSubSysServiceAPIId(pSSubSysServiceAPIId);
        return this;
    }

    /**
     * 设置 外部服务接口，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSubSysServiceAPIId}
     * @param pSSubSysServiceAPI 引用对象
     */
    @JsonIgnore
    public PSDataEntity pssubsysserviceapiid(PSSubSysServiceAPI pSSubSysServiceAPI){
        if(pSSubSysServiceAPI == null){
            this.setPSSubSysServiceAPIId(null);
            this.setPSSubSysServiceAPIName(null);
        }
        else{
            this.setPSSubSysServiceAPIId(pSSubSysServiceAPI.getPSSubSysServiceAPIId());
            this.setPSSubSysServiceAPIName(pSSubSysServiceAPI.getPSSubSysServiceAPIName());
        }
        return this;
    }

    /**
     * <B>PSSUBSYSSERVICEAPINAME</B>&nbsp;外部服务接口，指定实体在支持外部接口持久化时使用的外部接口
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSUBSYSSERVICEAPIID}
     */
    public final static String FIELD_PSSUBSYSSERVICEAPINAME = "pssubsysserviceapiname";

    /**
     * 设置 外部服务接口，详细说明：{@link #FIELD_PSSUBSYSSERVICEAPINAME}
     * 
     * @param pSSubSysServiceAPIName
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSERVICEAPINAME)
    public void setPSSubSysServiceAPIName(String pSSubSysServiceAPIName){
        this.set(FIELD_PSSUBSYSSERVICEAPINAME, pSSubSysServiceAPIName);
    }
    
    /**
     * 获取 外部服务接口  
     * @return
     */
    @JsonIgnore
    public String getPSSubSysServiceAPIName(){
        Object objValue = this.get(FIELD_PSSUBSYSSERVICEAPINAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 外部服务接口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubSysServiceAPINameDirty(){
        if(this.contains(FIELD_PSSUBSYSSERVICEAPINAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 外部服务接口
     */
    @JsonIgnore
    public void resetPSSubSysServiceAPIName(){
        this.reset(FIELD_PSSUBSYSSERVICEAPINAME);
    }

    /**
     * 设置 外部服务接口，详细说明：{@link #FIELD_PSSUBSYSSERVICEAPINAME}
     * <P>
     * 等同 {@link #setPSSubSysServiceAPIName}
     * @param pSSubSysServiceAPIName
     */
    @JsonIgnore
    public PSDataEntity pssubsysserviceapiname(String pSSubSysServiceAPIName){
        this.setPSSubSysServiceAPIName(pSSubSysServiceAPIName);
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELID</B>&nbsp;扩展动态模型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDynaModel} 
     */
    public final static String FIELD_PSSYSDYNAMODELID = "pssysdynamodelid";

    /**
     * 设置 扩展动态模型
     * 
     * @param pSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELID)
    public void setPSSysDynaModelId(String pSSysDynaModelId){
        this.set(FIELD_PSSYSDYNAMODELID, pSSysDynaModelId);
    }
    
    /**
     * 获取 扩展动态模型  
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
     * 判断 扩展动态模型 是否指定值，包括空值
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
     * 重置 扩展动态模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelId(){
        this.reset(FIELD_PSSYSDYNAMODELID);
    }

    /**
     * 设置 扩展动态模型
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModelId
     */
    @JsonIgnore
    public PSDataEntity pssysdynamodelid(String pSSysDynaModelId){
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    /**
     * 设置 扩展动态模型，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModel 引用对象
     */
    @JsonIgnore
    public PSDataEntity pssysdynamodelid(PSSysDynaModel pSSysDynaModel){
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
     * <B>PSSYSDYNAMODELNAME</B>&nbsp;扩展动态模型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDYNAMODELID}
     */
    public final static String FIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";

    /**
     * 设置 扩展动态模型
     * 
     * @param pSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELNAME)
    public void setPSSysDynaModelName(String pSSysDynaModelName){
        this.set(FIELD_PSSYSDYNAMODELNAME, pSSysDynaModelName);
    }
    
    /**
     * 获取 扩展动态模型  
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
     * 判断 扩展动态模型 是否指定值，包括空值
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
     * 重置 扩展动态模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelName(){
        this.reset(FIELD_PSSYSDYNAMODELNAME);
    }

    /**
     * 设置 扩展动态模型
     * <P>
     * 等同 {@link #setPSSysDynaModelName}
     * @param pSSysDynaModelName
     */
    @JsonIgnore
    public PSDataEntity pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSSYSIMAGEID</B>&nbsp;显示图标，指定实体默认的显示图标，实体视图等实体界面在需要图标且未定义图标时使用该图标
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysImage} 
     */
    public final static String FIELD_PSSYSIMAGEID = "pssysimageid";

    /**
     * 设置 显示图标，详细说明：{@link #FIELD_PSSYSIMAGEID}
     * 
     * @param pSSysImageId
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGEID)
    public void setPSSysImageId(String pSSysImageId){
        this.set(FIELD_PSSYSIMAGEID, pSSysImageId);
    }
    
    /**
     * 获取 显示图标  
     * @return
     */
    @JsonIgnore
    public String getPSSysImageId(){
        Object objValue = this.get(FIELD_PSSYSIMAGEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 显示图标 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysImageIdDirty(){
        if(this.contains(FIELD_PSSYSIMAGEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 显示图标
     */
    @JsonIgnore
    public void resetPSSysImageId(){
        this.reset(FIELD_PSSYSIMAGEID);
    }

    /**
     * 设置 显示图标，详细说明：{@link #FIELD_PSSYSIMAGEID}
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImageId
     */
    @JsonIgnore
    public PSDataEntity pssysimageid(String pSSysImageId){
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    /**
     * 设置 显示图标，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImage 引用对象
     */
    @JsonIgnore
    public PSDataEntity pssysimageid(PSSysImage pSSysImage){
        if(pSSysImage == null){
            this.setPSSysImageId(null);
            this.setPSSysImageName(null);
        }
        else{
            this.setPSSysImageId(pSSysImage.getPSSysImageId());
            this.setPSSysImageName(pSSysImage.getPSSysImageName());
        }
        return this;
    }

    /**
     * <B>PSSYSIMAGENAME</B>&nbsp;显示图标，指定实体默认的显示图标，实体视图等实体界面在需要图标且未定义图标时使用该图标
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSIMAGEID}
     */
    public final static String FIELD_PSSYSIMAGENAME = "pssysimagename";

    /**
     * 设置 显示图标，详细说明：{@link #FIELD_PSSYSIMAGENAME}
     * 
     * @param pSSysImageName
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGENAME)
    public void setPSSysImageName(String pSSysImageName){
        this.set(FIELD_PSSYSIMAGENAME, pSSysImageName);
    }
    
    /**
     * 获取 显示图标  
     * @return
     */
    @JsonIgnore
    public String getPSSysImageName(){
        Object objValue = this.get(FIELD_PSSYSIMAGENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 显示图标 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysImageNameDirty(){
        if(this.contains(FIELD_PSSYSIMAGENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 显示图标
     */
    @JsonIgnore
    public void resetPSSysImageName(){
        this.reset(FIELD_PSSYSIMAGENAME);
    }

    /**
     * 设置 显示图标，详细说明：{@link #FIELD_PSSYSIMAGENAME}
     * <P>
     * 等同 {@link #setPSSysImageName}
     * @param pSSysImageName
     */
    @JsonIgnore
    public PSDataEntity pssysimagename(String pSSysImageName){
        this.setPSSysImageName(pSSysImageName);
        return this;
    }

    /**
     * <B>PSSYSMODELGROUPID</B>&nbsp;系统模型组，指定实体的模型组，实体新建时会直接使用模块指定模型组作为实体的模型组。注意：使用模型导入模式的API调用新建实体时，需要手动设置模型组（模型导入模式时接口不会提取模块的模型组）
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysModelGroup} 
     */
    public final static String FIELD_PSSYSMODELGROUPID = "pssysmodelgroupid";

    /**
     * 设置 系统模型组，详细说明：{@link #FIELD_PSSYSMODELGROUPID}
     * 
     * @param pSSysModelGroupId
     * 
     */
    @JsonProperty(FIELD_PSSYSMODELGROUPID)
    public void setPSSysModelGroupId(String pSSysModelGroupId){
        this.set(FIELD_PSSYSMODELGROUPID, pSSysModelGroupId);
    }
    
    /**
     * 获取 系统模型组  
     * @return
     */
    @JsonIgnore
    public String getPSSysModelGroupId(){
        Object objValue = this.get(FIELD_PSSYSMODELGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统模型组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysModelGroupIdDirty(){
        if(this.contains(FIELD_PSSYSMODELGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统模型组
     */
    @JsonIgnore
    public void resetPSSysModelGroupId(){
        this.reset(FIELD_PSSYSMODELGROUPID);
    }

    /**
     * 设置 系统模型组，详细说明：{@link #FIELD_PSSYSMODELGROUPID}
     * <P>
     * 等同 {@link #setPSSysModelGroupId}
     * @param pSSysModelGroupId
     */
    @JsonIgnore
    public PSDataEntity pssysmodelgroupid(String pSSysModelGroupId){
        this.setPSSysModelGroupId(pSSysModelGroupId);
        return this;
    }

    /**
     * 设置 系统模型组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysModelGroupId}
     * @param pSSysModelGroup 引用对象
     */
    @JsonIgnore
    public PSDataEntity pssysmodelgroupid(PSSysModelGroup pSSysModelGroup){
        if(pSSysModelGroup == null){
            this.setPSSysModelGroupId(null);
            this.setPSSysModelGroupName(null);
        }
        else{
            this.setPSSysModelGroupId(pSSysModelGroup.getPSSysModelGroupId());
            this.setPSSysModelGroupName(pSSysModelGroup.getPSSysModelGroupName());
        }
        return this;
    }

    /**
     * <B>PSSYSMODELGROUPNAME</B>&nbsp;系统模型组，指定实体的模型组，实体新建时会直接使用模块指定模型组作为实体的模型组。注意：使用模型导入模式的API调用新建实体时，需要手动设置模型组（模型导入模式时接口不会提取模块的模型组）
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSMODELGROUPID}
     */
    public final static String FIELD_PSSYSMODELGROUPNAME = "pssysmodelgroupname";

    /**
     * 设置 系统模型组，详细说明：{@link #FIELD_PSSYSMODELGROUPNAME}
     * 
     * @param pSSysModelGroupName
     * 
     */
    @JsonProperty(FIELD_PSSYSMODELGROUPNAME)
    public void setPSSysModelGroupName(String pSSysModelGroupName){
        this.set(FIELD_PSSYSMODELGROUPNAME, pSSysModelGroupName);
    }
    
    /**
     * 获取 系统模型组  
     * @return
     */
    @JsonIgnore
    public String getPSSysModelGroupName(){
        Object objValue = this.get(FIELD_PSSYSMODELGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统模型组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysModelGroupNameDirty(){
        if(this.contains(FIELD_PSSYSMODELGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统模型组
     */
    @JsonIgnore
    public void resetPSSysModelGroupName(){
        this.reset(FIELD_PSSYSMODELGROUPNAME);
    }

    /**
     * 设置 系统模型组，详细说明：{@link #FIELD_PSSYSMODELGROUPNAME}
     * <P>
     * 等同 {@link #setPSSysModelGroupName}
     * @param pSSysModelGroupName
     */
    @JsonIgnore
    public PSDataEntity pssysmodelgroupname(String pSSysModelGroupName){
        this.setPSSysModelGroupName(pSSysModelGroupName);
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
    public PSDataEntity pssysreqitemid(String pSSysReqItemId){
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
    public PSDataEntity pssysreqitemid(PSSysReqItem pSSysReqItem){
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
    public PSDataEntity pssysreqitemname(String pSSysReqItemName){
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
    public PSDataEntity pssyssfpluginid(String pSSysSFPluginId){
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
    public PSDataEntity pssyssfpluginid(PSSysSFPlugin pSSysSFPlugin){
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
    public PSDataEntity pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    /**
     * <B>PSSYSUNIRESID</B>&nbsp;系统统一资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysUniRes} 
     */
    public final static String FIELD_PSSYSUNIRESID = "pssysuniresid";

    /**
     * 设置 系统统一资源
     * 
     * @param pSSysUniResId
     * 
     */
    @JsonProperty(FIELD_PSSYSUNIRESID)
    public void setPSSysUniResId(String pSSysUniResId){
        this.set(FIELD_PSSYSUNIRESID, pSSysUniResId);
    }
    
    /**
     * 获取 系统统一资源  
     * @return
     */
    @JsonIgnore
    public String getPSSysUniResId(){
        Object objValue = this.get(FIELD_PSSYSUNIRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统统一资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUniResIdDirty(){
        if(this.contains(FIELD_PSSYSUNIRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统统一资源
     */
    @JsonIgnore
    public void resetPSSysUniResId(){
        this.reset(FIELD_PSSYSUNIRESID);
    }

    /**
     * 设置 系统统一资源
     * <P>
     * 等同 {@link #setPSSysUniResId}
     * @param pSSysUniResId
     */
    @JsonIgnore
    public PSDataEntity pssysuniresid(String pSSysUniResId){
        this.setPSSysUniResId(pSSysUniResId);
        return this;
    }

    /**
     * 设置 系统统一资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysUniResId}
     * @param pSSysUniRes 引用对象
     */
    @JsonIgnore
    public PSDataEntity pssysuniresid(PSSysUniRes pSSysUniRes){
        if(pSSysUniRes == null){
            this.setPSSysUniResId(null);
            this.setPSSysUniResName(null);
        }
        else{
            this.setPSSysUniResId(pSSysUniRes.getPSSysUniResId());
            this.setPSSysUniResName(pSSysUniRes.getPSSysUniResName());
        }
        return this;
    }

    /**
     * <B>PSSYSUNIRESNAME</B>&nbsp;系统统一资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSUNIRESID}
     */
    public final static String FIELD_PSSYSUNIRESNAME = "pssysuniresname";

    /**
     * 设置 系统统一资源
     * 
     * @param pSSysUniResName
     * 
     */
    @JsonProperty(FIELD_PSSYSUNIRESNAME)
    public void setPSSysUniResName(String pSSysUniResName){
        this.set(FIELD_PSSYSUNIRESNAME, pSSysUniResName);
    }
    
    /**
     * 获取 系统统一资源  
     * @return
     */
    @JsonIgnore
    public String getPSSysUniResName(){
        Object objValue = this.get(FIELD_PSSYSUNIRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统统一资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUniResNameDirty(){
        if(this.contains(FIELD_PSSYSUNIRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统统一资源
     */
    @JsonIgnore
    public void resetPSSysUniResName(){
        this.reset(FIELD_PSSYSUNIRESNAME);
    }

    /**
     * 设置 系统统一资源
     * <P>
     * 等同 {@link #setPSSysUniResName}
     * @param pSSysUniResName
     */
    @JsonIgnore
    public PSDataEntity pssysuniresname(String pSSysUniResName){
        this.setPSSysUniResName(pSSysUniResName);
        return this;
    }

    /**
     * <B>REMOVEFLAG</B>&nbsp;删除标志，实体需要标记为【允许删除】才允许进行删除，防止用户对关键模型进行误操作
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ModelRemoveMode} 
     */
    public final static String FIELD_REMOVEFLAG = "removeflag";

    /**
     * 设置 删除标志，详细说明：{@link #FIELD_REMOVEFLAG}
     * 
     * @param removeFlag
     * 
     */
    @JsonProperty(FIELD_REMOVEFLAG)
    public void setRemoveFlag(Integer removeFlag){
        this.set(FIELD_REMOVEFLAG, removeFlag);
    }
    
    /**
     * 获取 删除标志  
     * @return
     */
    @JsonIgnore
    public Integer getRemoveFlag(){
        Object objValue = this.get(FIELD_REMOVEFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 删除标志 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRemoveFlagDirty(){
        if(this.contains(FIELD_REMOVEFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 删除标志
     */
    @JsonIgnore
    public void resetRemoveFlag(){
        this.reset(FIELD_REMOVEFLAG);
    }

    /**
     * 设置 删除标志，详细说明：{@link #FIELD_REMOVEFLAG}
     * <P>
     * 等同 {@link #setRemoveFlag}
     * @param removeFlag
     */
    @JsonIgnore
    public PSDataEntity removeflag(Integer removeFlag){
        this.setRemoveFlag(removeFlag);
        return this;
    }

     /**
     * 设置 删除标志，详细说明：{@link #FIELD_REMOVEFLAG}
     * <P>
     * 等同 {@link #setRemoveFlag}
     * @param removeFlag
     */
    @JsonIgnore
    public PSDataEntity removeflag(net.ibizsys.psmodel.core.util.PSModelEnums.ModelRemoveMode removeFlag){
        if(removeFlag == null){
            this.setRemoveFlag(null);
        }
        else{
            this.setRemoveFlag(removeFlag.value);
        }
        return this;
    }

    /**
     * <B>SAASMODE</B>&nbsp;SaaS构型，指定实体的SaaS构型，默认为【不启用】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DESaaSMode} 
     */
    public final static String FIELD_SAASMODE = "saasmode";

    /**
     * 设置 SaaS构型，详细说明：{@link #FIELD_SAASMODE}
     * 
     * @param saaSMode
     * 
     */
    @JsonProperty(FIELD_SAASMODE)
    public void setSaaSMode(Integer saaSMode){
        this.set(FIELD_SAASMODE, saaSMode);
    }
    
    /**
     * 获取 SaaS构型  
     * @return
     */
    @JsonIgnore
    public Integer getSaaSMode(){
        Object objValue = this.get(FIELD_SAASMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 SaaS构型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSaaSModeDirty(){
        if(this.contains(FIELD_SAASMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 SaaS构型
     */
    @JsonIgnore
    public void resetSaaSMode(){
        this.reset(FIELD_SAASMODE);
    }

    /**
     * 设置 SaaS构型，详细说明：{@link #FIELD_SAASMODE}
     * <P>
     * 等同 {@link #setSaaSMode}
     * @param saaSMode
     */
    @JsonIgnore
    public PSDataEntity saasmode(Integer saaSMode){
        this.setSaaSMode(saaSMode);
        return this;
    }

     /**
     * 设置 SaaS构型，详细说明：{@link #FIELD_SAASMODE}
     * <P>
     * 等同 {@link #setSaaSMode}
     * @param saaSMode
     */
    @JsonIgnore
    public PSDataEntity saasmode(net.ibizsys.psmodel.core.util.PSModelEnums.DESaaSMode saaSMode){
        if(saaSMode == null){
            this.setSaaSMode(null);
        }
        else{
            this.setSaaSMode(saaSMode.value);
        }
        return this;
    }

    /**
     * <B>SERVICEAPIFLAG</B>&nbsp;服务API模式，指定系统实体的服务接口模式，未定义时为【默认不提供】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEServiceAPIMode} 
     */
    public final static String FIELD_SERVICEAPIFLAG = "serviceapiflag";

    /**
     * 设置 服务API模式，详细说明：{@link #FIELD_SERVICEAPIFLAG}
     * 
     * @param serviceAPIFlag
     * 
     */
    @JsonProperty(FIELD_SERVICEAPIFLAG)
    public void setServiceAPIFlag(Integer serviceAPIFlag){
        this.set(FIELD_SERVICEAPIFLAG, serviceAPIFlag);
    }
    
    /**
     * 获取 服务API模式  
     * @return
     */
    @JsonIgnore
    public Integer getServiceAPIFlag(){
        Object objValue = this.get(FIELD_SERVICEAPIFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 服务API模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isServiceAPIFlagDirty(){
        if(this.contains(FIELD_SERVICEAPIFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务API模式
     */
    @JsonIgnore
    public void resetServiceAPIFlag(){
        this.reset(FIELD_SERVICEAPIFLAG);
    }

    /**
     * 设置 服务API模式，详细说明：{@link #FIELD_SERVICEAPIFLAG}
     * <P>
     * 等同 {@link #setServiceAPIFlag}
     * @param serviceAPIFlag
     */
    @JsonIgnore
    public PSDataEntity serviceapiflag(Integer serviceAPIFlag){
        this.setServiceAPIFlag(serviceAPIFlag);
        return this;
    }

     /**
     * 设置 服务API模式，详细说明：{@link #FIELD_SERVICEAPIFLAG}
     * <P>
     * 等同 {@link #setServiceAPIFlag}
     * @param serviceAPIFlag
     */
    @JsonIgnore
    public PSDataEntity serviceapiflag(net.ibizsys.psmodel.core.util.PSModelEnums.DEServiceAPIMode serviceAPIFlag){
        if(serviceAPIFlag == null){
            this.setServiceAPIFlag(null);
        }
        else{
            this.setServiceAPIFlag(serviceAPIFlag.value);
        }
        return this;
    }

    /**
     * <B>SERVICECODENAME</B>&nbsp;服务代码标识，指定实体的服务接口代码标识，未定义时默认使用实体【代码标识】
     * <P>
     * 字符串：最大长度 30，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_SERVICECODENAME = "servicecodename";

    /**
     * 设置 服务代码标识，详细说明：{@link #FIELD_SERVICECODENAME}
     * 
     * @param serviceCodeName
     * 
     */
    @JsonProperty(FIELD_SERVICECODENAME)
    public void setServiceCodeName(String serviceCodeName){
        this.set(FIELD_SERVICECODENAME, serviceCodeName);
    }
    
    /**
     * 获取 服务代码标识  
     * @return
     */
    @JsonIgnore
    public String getServiceCodeName(){
        Object objValue = this.get(FIELD_SERVICECODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 服务代码标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isServiceCodeNameDirty(){
        if(this.contains(FIELD_SERVICECODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务代码标识
     */
    @JsonIgnore
    public void resetServiceCodeName(){
        this.reset(FIELD_SERVICECODENAME);
    }

    /**
     * 设置 服务代码标识，详细说明：{@link #FIELD_SERVICECODENAME}
     * <P>
     * 等同 {@link #setServiceCodeName}
     * @param serviceCodeName
     */
    @JsonIgnore
    public PSDataEntity servicecodename(String serviceCodeName){
        this.setServiceCodeName(serviceCodeName);
        return this;
    }

    /**
     * <B>STORAGEMODE</B>&nbsp;存储模式，指定实体的数据持久化方式，实体支持同时具备多种持久化方式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEStorageType} 
     */
    public final static String FIELD_STORAGEMODE = "storagemode";

    /**
     * 设置 存储模式，详细说明：{@link #FIELD_STORAGEMODE}
     * 
     * @param storageMode
     * 
     */
    @JsonProperty(FIELD_STORAGEMODE)
    public void setStorageMode(Integer storageMode){
        this.set(FIELD_STORAGEMODE, storageMode);
    }
    
    /**
     * 获取 存储模式  
     * @return
     */
    @JsonIgnore
    public Integer getStorageMode(){
        Object objValue = this.get(FIELD_STORAGEMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 存储模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStorageModeDirty(){
        if(this.contains(FIELD_STORAGEMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 存储模式
     */
    @JsonIgnore
    public void resetStorageMode(){
        this.reset(FIELD_STORAGEMODE);
    }

    /**
     * 设置 存储模式，详细说明：{@link #FIELD_STORAGEMODE}
     * <P>
     * 等同 {@link #setStorageMode}
     * @param storageMode
     */
    @JsonIgnore
    public PSDataEntity storagemode(Integer storageMode){
        this.setStorageMode(storageMode);
        return this;
    }

     /**
     * 设置 存储模式，详细说明：{@link #FIELD_STORAGEMODE}
     * <P>
     * 等同 {@link #setStorageMode}
     * @param storageMode
     */
    @JsonIgnore
    public PSDataEntity storagemode(net.ibizsys.psmodel.core.util.PSModelEnums.DEStorageType storageMode){
        if(storageMode == null){
            this.setStorageMode(null);
        }
        else{
            this.setStorageMode(storageMode.value);
        }
        return this;
    }

    /**
     * <B>SUBSYSMODULE</B>&nbsp;子系统实体
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSMODULEID}
     */
    public final static String FIELD_SUBSYSMODULE = "subsysmodule";

    /**
     * 设置 子系统实体
     * 
     * @param subSysModule
     * 
     */
    @JsonProperty(FIELD_SUBSYSMODULE)
    public void setSubSysModule(Integer subSysModule){
        this.set(FIELD_SUBSYSMODULE, subSysModule);
    }
    
    /**
     * 获取 子系统实体  
     * @return
     */
    @JsonIgnore
    public Integer getSubSysModule(){
        Object objValue = this.get(FIELD_SUBSYSMODULE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 子系统实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSubSysModuleDirty(){
        if(this.contains(FIELD_SUBSYSMODULE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 子系统实体
     */
    @JsonIgnore
    public void resetSubSysModule(){
        this.reset(FIELD_SUBSYSMODULE);
    }

    /**
     * 设置 子系统实体
     * <P>
     * 等同 {@link #setSubSysModule}
     * @param subSysModule
     */
    @JsonIgnore
    public PSDataEntity subsysmodule(Integer subSysModule){
        this.setSubSysModule(subSysModule);
        return this;
    }

    /**
     * <B>TABLENAME</B>&nbsp;主表名称，指定实体在关系数据库持久化模式下存储的数据表
     * <P>
     * 字符串：最大长度 60，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_TABLENAME = "tablename";

    /**
     * 设置 主表名称，详细说明：{@link #FIELD_TABLENAME}
     * 
     * @param tableName
     * 
     */
    @JsonProperty(FIELD_TABLENAME)
    public void setTableName(String tableName){
        this.set(FIELD_TABLENAME, tableName);
    }
    
    /**
     * 获取 主表名称  
     * @return
     */
    @JsonIgnore
    public String getTableName(){
        Object objValue = this.get(FIELD_TABLENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主表名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTableNameDirty(){
        if(this.contains(FIELD_TABLENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主表名称
     */
    @JsonIgnore
    public void resetTableName(){
        this.reset(FIELD_TABLENAME);
    }

    /**
     * 设置 主表名称，详细说明：{@link #FIELD_TABLENAME}
     * <P>
     * 等同 {@link #setTableName}
     * @param tableName
     */
    @JsonIgnore
    public PSDataEntity tablename(String tableName){
        this.setTableName(tableName);
        return this;
    }

    /**
     * <B>TESTCASEFLAG</B>&nbsp;默认测试单元，指定实体是否默认产生实体行为的测试单元，未定义时为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_TESTCASEFLAG = "testcaseflag";

    /**
     * 设置 默认测试单元，详细说明：{@link #FIELD_TESTCASEFLAG}
     * 
     * @param testCaseFlag
     * 
     */
    @JsonProperty(FIELD_TESTCASEFLAG)
    public void setTestCaseFlag(Integer testCaseFlag){
        this.set(FIELD_TESTCASEFLAG, testCaseFlag);
    }
    
    /**
     * 获取 默认测试单元  
     * @return
     */
    @JsonIgnore
    public Integer getTestCaseFlag(){
        Object objValue = this.get(FIELD_TESTCASEFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认测试单元 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTestCaseFlagDirty(){
        if(this.contains(FIELD_TESTCASEFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认测试单元
     */
    @JsonIgnore
    public void resetTestCaseFlag(){
        this.reset(FIELD_TESTCASEFLAG);
    }

    /**
     * 设置 默认测试单元，详细说明：{@link #FIELD_TESTCASEFLAG}
     * <P>
     * 等同 {@link #setTestCaseFlag}
     * @param testCaseFlag
     */
    @JsonIgnore
    public PSDataEntity testcaseflag(Integer testCaseFlag){
        this.setTestCaseFlag(testCaseFlag);
        return this;
    }

     /**
     * 设置 默认测试单元，详细说明：{@link #FIELD_TESTCASEFLAG}
     * <P>
     * 等同 {@link #setTestCaseFlag}
     * @param testCaseFlag
     */
    @JsonIgnore
    public PSDataEntity testcaseflag(Boolean testCaseFlag){
        if(testCaseFlag == null){
            this.setTestCaseFlag(null);
        }
        else{
            this.setTestCaseFlag(testCaseFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSDataEntity updatedate(String updateDate){
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
    public PSDataEntity updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>USERACTION</B>&nbsp;默认界面行为，指定实体默认的界面行为模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEUserUIAbility} 
     */
    public final static String FIELD_USERACTION = "useraction";

    /**
     * 设置 默认界面行为，详细说明：{@link #FIELD_USERACTION}
     * 
     * @param userAction
     * 
     */
    @JsonProperty(FIELD_USERACTION)
    public void setUserAction(Integer userAction){
        this.set(FIELD_USERACTION, userAction);
    }
    
    /**
     * 获取 默认界面行为  
     * @return
     */
    @JsonIgnore
    public Integer getUserAction(){
        Object objValue = this.get(FIELD_USERACTION);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认界面行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserActionDirty(){
        if(this.contains(FIELD_USERACTION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认界面行为
     */
    @JsonIgnore
    public void resetUserAction(){
        this.reset(FIELD_USERACTION);
    }

    /**
     * 设置 默认界面行为，详细说明：{@link #FIELD_USERACTION}
     * <P>
     * 等同 {@link #setUserAction}
     * @param userAction
     */
    @JsonIgnore
    public PSDataEntity useraction(Integer userAction){
        this.setUserAction(userAction);
        return this;
    }

     /**
     * 设置 默认界面行为，详细说明：{@link #FIELD_USERACTION}
     * <P>
     * 等同 {@link #setUserAction}
     * @param userAction
     */
    @JsonIgnore
    public PSDataEntity useraction(net.ibizsys.psmodel.core.util.PSModelEnums.DEUserUIAbility[] userAction){
        if(userAction == null || userAction.length == 0){
            this.setUserAction(null);
        }
        else{
            int _value = 0;
            for(net.ibizsys.psmodel.core.util.PSModelEnums.DEUserUIAbility _item : userAction){
                _value |= _item.value;
            }
            this.setUserAction(_value);
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
    public PSDataEntity usercat(String userCat){
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
    public PSDataEntity usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat.value);
        }
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
    public PSDataEntity userparams(String userParams){
        this.setUserParams(userParams);
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
    public PSDataEntity usertag(String userTag){
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
    public PSDataEntity usertag2(String userTag2){
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
    public PSDataEntity usertag3(String userTag3){
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
    public PSDataEntity usertag4(String userTag4){
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
    public PSDataEntity validflag(Integer validFlag){
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
    public PSDataEntity validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>VIEWLEVEL</B>&nbsp;多视图模式，实体支持提供多数据库视图满足不同的使用需求，启用高级别视图默认启用所有级别比它低的视图。未指定时为【默认（全部数据）】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEFieldViewColLevel} 
     */
    public final static String FIELD_VIEWLEVEL = "viewlevel";

    /**
     * 设置 多视图模式，详细说明：{@link #FIELD_VIEWLEVEL}
     * 
     * @param viewLevel
     * 
     */
    @JsonProperty(FIELD_VIEWLEVEL)
    public void setViewLevel(Integer viewLevel){
        this.set(FIELD_VIEWLEVEL, viewLevel);
    }
    
    /**
     * 获取 多视图模式  
     * @return
     */
    @JsonIgnore
    public Integer getViewLevel(){
        Object objValue = this.get(FIELD_VIEWLEVEL);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 多视图模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewLevelDirty(){
        if(this.contains(FIELD_VIEWLEVEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 多视图模式
     */
    @JsonIgnore
    public void resetViewLevel(){
        this.reset(FIELD_VIEWLEVEL);
    }

    /**
     * 设置 多视图模式，详细说明：{@link #FIELD_VIEWLEVEL}
     * <P>
     * 等同 {@link #setViewLevel}
     * @param viewLevel
     */
    @JsonIgnore
    public PSDataEntity viewlevel(Integer viewLevel){
        this.setViewLevel(viewLevel);
        return this;
    }

     /**
     * 设置 多视图模式，详细说明：{@link #FIELD_VIEWLEVEL}
     * <P>
     * 等同 {@link #setViewLevel}
     * @param viewLevel
     */
    @JsonIgnore
    public PSDataEntity viewlevel(net.ibizsys.psmodel.core.util.PSModelEnums.DEFieldViewColLevel viewLevel){
        if(viewLevel == null){
            this.setViewLevel(null);
        }
        else{
            this.setViewLevel(viewLevel.value);
        }
        return this;
    }

    /**
     * <B>VIEWNAME</B>&nbsp;视图名称，指定实体默认的数据库视图名称
     * <P>
     * 字符串：最大长度 60，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_VIEWNAME = "viewname";

    /**
     * 设置 视图名称，详细说明：{@link #FIELD_VIEWNAME}
     * 
     * @param viewName
     * 
     */
    @JsonProperty(FIELD_VIEWNAME)
    public void setViewName(String viewName){
        this.set(FIELD_VIEWNAME, viewName);
    }
    
    /**
     * 获取 视图名称  
     * @return
     */
    @JsonIgnore
    public String getViewName(){
        Object objValue = this.get(FIELD_VIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewNameDirty(){
        if(this.contains(FIELD_VIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图名称
     */
    @JsonIgnore
    public void resetViewName(){
        this.reset(FIELD_VIEWNAME);
    }

    /**
     * 设置 视图名称，详细说明：{@link #FIELD_VIEWNAME}
     * <P>
     * 等同 {@link #setViewName}
     * @param viewName
     */
    @JsonIgnore
    public PSDataEntity viewname(String viewName){
        this.setViewName(viewName);
        return this;
    }

    /**
     * <B>VIRTUALFLAG</B>&nbsp;虚拟实体，虚拟实体一般指按照特定业务目的进行组装，不具备自有持久化能力的实体
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEVirtualMode} 
     */
    public final static String FIELD_VIRTUALFLAG = "virtualflag";

    /**
     * 设置 虚拟实体，详细说明：{@link #FIELD_VIRTUALFLAG}
     * 
     * @param virtualFlag
     * 
     */
    @JsonProperty(FIELD_VIRTUALFLAG)
    public void setVirtualFlag(Integer virtualFlag){
        this.set(FIELD_VIRTUALFLAG, virtualFlag);
    }
    
    /**
     * 获取 虚拟实体  
     * @return
     */
    @JsonIgnore
    public Integer getVirtualFlag(){
        Object objValue = this.get(FIELD_VIRTUALFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 虚拟实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isVirtualFlagDirty(){
        if(this.contains(FIELD_VIRTUALFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 虚拟实体
     */
    @JsonIgnore
    public void resetVirtualFlag(){
        this.reset(FIELD_VIRTUALFLAG);
    }

    /**
     * 设置 虚拟实体，详细说明：{@link #FIELD_VIRTUALFLAG}
     * <P>
     * 等同 {@link #setVirtualFlag}
     * @param virtualFlag
     */
    @JsonIgnore
    public PSDataEntity virtualflag(Integer virtualFlag){
        this.setVirtualFlag(virtualFlag);
        return this;
    }

     /**
     * 设置 虚拟实体，详细说明：{@link #FIELD_VIRTUALFLAG}
     * <P>
     * 等同 {@link #setVirtualFlag}
     * @param virtualFlag
     */
    @JsonIgnore
    public PSDataEntity virtualflag(net.ibizsys.psmodel.core.util.PSModelEnums.DEVirtualMode virtualFlag){
        if(virtualFlag == null){
            this.setVirtualFlag(null);
        }
        else{
            this.setVirtualFlag(virtualFlag.value);
        }
        return this;
    }

    /**
     * <B>VKEYSEPARATOR</B>&nbsp;联合主键参数
     * <P>
     * 字符串：最大长度 10
     */
    public final static String FIELD_VKEYSEPARATOR = "vkeyseparator";

    /**
     * 设置 联合主键参数
     * 
     * @param vKeySeparator
     * 
     */
    @JsonProperty(FIELD_VKEYSEPARATOR)
    public void setVKeySeparator(String vKeySeparator){
        this.set(FIELD_VKEYSEPARATOR, vKeySeparator);
    }
    
    /**
     * 获取 联合主键参数  
     * @return
     */
    @JsonIgnore
    public String getVKeySeparator(){
        Object objValue = this.get(FIELD_VKEYSEPARATOR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 联合主键参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isVKeySeparatorDirty(){
        if(this.contains(FIELD_VKEYSEPARATOR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 联合主键参数
     */
    @JsonIgnore
    public void resetVKeySeparator(){
        this.reset(FIELD_VKEYSEPARATOR);
    }

    /**
     * 设置 联合主键参数
     * <P>
     * 等同 {@link #setVKeySeparator}
     * @param vKeySeparator
     */
    @JsonIgnore
    public PSDataEntity vkeyseparator(String vKeySeparator){
        this.setVKeySeparator(vKeySeparator);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDataEntityId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDataEntityId(strValue);
    }

    @JsonIgnore
    public PSDataEntity id(String strValue){
        this.setPSDataEntityId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDataEntity){
            PSDataEntity model = (PSDataEntity)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
