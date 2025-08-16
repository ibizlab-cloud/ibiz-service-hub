package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSSYSSFPUB</B>后台体系 模型传输对象
 * <P>
 * 系统后台模板的发布配置，由于后台模板产生的代码一般作为系统后台服务体系，所以也称为后台体系
 */
public class PSSysSFPub extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysSFPub(){
    }      

    /**
     * <B>BASECLSPARAMS</B>&nbsp;基类参数
     */
    public final static String FIELD_BASECLSPARAMS = "baseclsparams";

    /**
     * 设置 基类参数
     * 
     * @param baseClsParams
     * 
     */
    @JsonProperty(FIELD_BASECLSPARAMS)
    public void setBaseClsParams(String baseClsParams){
        this.set(FIELD_BASECLSPARAMS, baseClsParams);
    }
    
    /**
     * 获取 基类参数  
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
     * 判断 基类参数 是否指定值，包括空值
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
     * 重置 基类参数
     */
    @JsonIgnore
    public void resetBaseClsParams(){
        this.reset(FIELD_BASECLSPARAMS);
    }

    /**
     * 设置 基类参数
     * <P>
     * 等同 {@link #setBaseClsParams}
     * @param baseClsParams
     */
    @JsonIgnore
    public PSSysSFPub baseclsparams(String baseClsParams){
        this.setBaseClsParams(baseClsParams);
        return this;
    }

    /**
     * <B>BASECLSPKGCODENAME</B>&nbsp;基类代码包名，指定后台体系的运行时基类代码包名
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_BASECLSPKGCODENAME = "baseclspkgcodename";

    /**
     * 设置 基类代码包名，详细说明：{@link #FIELD_BASECLSPKGCODENAME}
     * 
     * @param baseCLSPKGCodeName
     * 
     */
    @JsonProperty(FIELD_BASECLSPKGCODENAME)
    public void setBaseCLSPKGCodeName(String baseCLSPKGCodeName){
        this.set(FIELD_BASECLSPKGCODENAME, baseCLSPKGCodeName);
    }
    
    /**
     * 获取 基类代码包名  
     * @return
     */
    @JsonIgnore
    public String getBaseCLSPKGCodeName(){
        Object objValue = this.get(FIELD_BASECLSPKGCODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 基类代码包名 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBaseCLSPKGCodeNameDirty(){
        if(this.contains(FIELD_BASECLSPKGCODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 基类代码包名
     */
    @JsonIgnore
    public void resetBaseCLSPKGCodeName(){
        this.reset(FIELD_BASECLSPKGCODENAME);
    }

    /**
     * 设置 基类代码包名，详细说明：{@link #FIELD_BASECLSPKGCODENAME}
     * <P>
     * 等同 {@link #setBaseCLSPKGCodeName}
     * @param baseCLSPKGCodeName
     */
    @JsonIgnore
    public PSSysSFPub baseclspkgcodename(String baseCLSPKGCodeName){
        this.setBaseCLSPKGCodeName(baseCLSPKGCodeName);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定后台体系的代码标识，需要在当前系统中具有唯一性
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
    public PSSysSFPub codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>CONTENTTYPE</B>&nbsp;发布内容类型，指定后台体系的内容类型，未定义时为【运行代码】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SFPubContentType} 
     */
    public final static String FIELD_CONTENTTYPE = "contenttype";

    /**
     * 设置 发布内容类型，详细说明：{@link #FIELD_CONTENTTYPE}
     * 
     * @param contentType
     * 
     */
    @JsonProperty(FIELD_CONTENTTYPE)
    public void setContentType(String contentType){
        this.set(FIELD_CONTENTTYPE, contentType);
    }
    
    /**
     * 获取 发布内容类型  
     * @return
     */
    @JsonIgnore
    public String getContentType(){
        Object objValue = this.get(FIELD_CONTENTTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 发布内容类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isContentTypeDirty(){
        if(this.contains(FIELD_CONTENTTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 发布内容类型
     */
    @JsonIgnore
    public void resetContentType(){
        this.reset(FIELD_CONTENTTYPE);
    }

    /**
     * 设置 发布内容类型，详细说明：{@link #FIELD_CONTENTTYPE}
     * <P>
     * 等同 {@link #setContentType}
     * @param contentType
     */
    @JsonIgnore
    public PSSysSFPub contenttype(String contentType){
        this.setContentType(contentType);
        return this;
    }

     /**
     * 设置 发布内容类型，详细说明：{@link #FIELD_CONTENTTYPE}
     * <P>
     * 等同 {@link #setContentType}
     * @param contentType
     */
    @JsonIgnore
    public PSSysSFPub contenttype(net.ibizsys.psmodel.core.util.PSModelEnums.SFPubContentType contentType){
        if(contentType == null){
            this.setContentType(null);
        }
        else{
            this.setContentType(contentType.value);
        }
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
    public PSSysSFPub createdate(String createDate){
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
    public PSSysSFPub createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DEFAULTPUB</B>&nbsp;默认后台服务，指定后台体系是否为当前系统的默认服务体系，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEFAULTPUB = "defaultpub";

    /**
     * 设置 默认后台服务，详细说明：{@link #FIELD_DEFAULTPUB}
     * 
     * @param defaultPub
     * 
     */
    @JsonProperty(FIELD_DEFAULTPUB)
    public void setDefaultPub(Integer defaultPub){
        this.set(FIELD_DEFAULTPUB, defaultPub);
    }
    
    /**
     * 获取 默认后台服务  
     * @return
     */
    @JsonIgnore
    public Integer getDefaultPub(){
        Object objValue = this.get(FIELD_DEFAULTPUB);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认后台服务 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefaultPubDirty(){
        if(this.contains(FIELD_DEFAULTPUB)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认后台服务
     */
    @JsonIgnore
    public void resetDefaultPub(){
        this.reset(FIELD_DEFAULTPUB);
    }

    /**
     * 设置 默认后台服务，详细说明：{@link #FIELD_DEFAULTPUB}
     * <P>
     * 等同 {@link #setDefaultPub}
     * @param defaultPub
     */
    @JsonIgnore
    public PSSysSFPub defaultpub(Integer defaultPub){
        this.setDefaultPub(defaultPub);
        return this;
    }

     /**
     * 设置 默认后台服务，详细说明：{@link #FIELD_DEFAULTPUB}
     * <P>
     * 等同 {@link #setDefaultPub}
     * @param defaultPub
     */
    @JsonIgnore
    public PSSysSFPub defaultpub(Boolean defaultPub){
        if(defaultPub == null){
            this.setDefaultPub(null);
        }
        else{
            this.setDefaultPub(defaultPub?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DOCPSSFSTYLEID</B>&nbsp;文档模板样式，后台体系发布内容为文档时，指定使用的文档模板样式
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_DOCPSSFSTYLEID = "docpssfstyleid";

    /**
     * 设置 文档模板样式，详细说明：{@link #FIELD_DOCPSSFSTYLEID}
     * 
     * @param docPSSFStyleId
     * 
     */
    @JsonProperty(FIELD_DOCPSSFSTYLEID)
    public void setDocPSSFStyleId(String docPSSFStyleId){
        this.set(FIELD_DOCPSSFSTYLEID, docPSSFStyleId);
    }
    
    /**
     * 获取 文档模板样式  
     * @return
     */
    @JsonIgnore
    public String getDocPSSFStyleId(){
        Object objValue = this.get(FIELD_DOCPSSFSTYLEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 文档模板样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDocPSSFStyleIdDirty(){
        if(this.contains(FIELD_DOCPSSFSTYLEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 文档模板样式
     */
    @JsonIgnore
    public void resetDocPSSFStyleId(){
        this.reset(FIELD_DOCPSSFSTYLEID);
    }

    /**
     * 设置 文档模板样式，详细说明：{@link #FIELD_DOCPSSFSTYLEID}
     * <P>
     * 等同 {@link #setDocPSSFStyleId}
     * @param docPSSFStyleId
     */
    @JsonIgnore
    public PSSysSFPub docpssfstyleid(String docPSSFStyleId){
        this.setDocPSSFStyleId(docPSSFStyleId);
        return this;
    }

    /**
     * <B>DOCPSSFSTYLENAME</B>&nbsp;文档模板样式，后台体系发布内容为文档时，指定使用的文档模板样式
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DOCPSSFSTYLEID}
     */
    public final static String FIELD_DOCPSSFSTYLENAME = "docpssfstylename";

    /**
     * 设置 文档模板样式，详细说明：{@link #FIELD_DOCPSSFSTYLENAME}
     * 
     * @param docPSSFStyleName
     * 
     */
    @JsonProperty(FIELD_DOCPSSFSTYLENAME)
    public void setDocPSSFStyleName(String docPSSFStyleName){
        this.set(FIELD_DOCPSSFSTYLENAME, docPSSFStyleName);
    }
    
    /**
     * 获取 文档模板样式  
     * @return
     */
    @JsonIgnore
    public String getDocPSSFStyleName(){
        Object objValue = this.get(FIELD_DOCPSSFSTYLENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 文档模板样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDocPSSFStyleNameDirty(){
        if(this.contains(FIELD_DOCPSSFSTYLENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 文档模板样式
     */
    @JsonIgnore
    public void resetDocPSSFStyleName(){
        this.reset(FIELD_DOCPSSFSTYLENAME);
    }

    /**
     * 设置 文档模板样式，详细说明：{@link #FIELD_DOCPSSFSTYLENAME}
     * <P>
     * 等同 {@link #setDocPSSFStyleName}
     * @param docPSSFStyleName
     */
    @JsonIgnore
    public PSSysSFPub docpssfstylename(String docPSSFStyleName){
        this.setDocPSSFStyleName(docPSSFStyleName);
        return this;
    }

    /**
     * <B>DYNAMODELMODE</B>&nbsp;动态模型使用
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SFPubDynaModelMode} 
     */
    public final static String FIELD_DYNAMODELMODE = "dynamodelmode";

    /**
     * 设置 动态模型使用
     * 
     * @param dynaModelMode
     * 
     */
    @JsonProperty(FIELD_DYNAMODELMODE)
    public void setDynaModelMode(String dynaModelMode){
        this.set(FIELD_DYNAMODELMODE, dynaModelMode);
    }
    
    /**
     * 获取 动态模型使用  
     * @return
     */
    @JsonIgnore
    public String getDynaModelMode(){
        Object objValue = this.get(FIELD_DYNAMODELMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 动态模型使用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDynaModelModeDirty(){
        if(this.contains(FIELD_DYNAMODELMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 动态模型使用
     */
    @JsonIgnore
    public void resetDynaModelMode(){
        this.reset(FIELD_DYNAMODELMODE);
    }

    /**
     * 设置 动态模型使用
     * <P>
     * 等同 {@link #setDynaModelMode}
     * @param dynaModelMode
     */
    @JsonIgnore
    public PSSysSFPub dynamodelmode(String dynaModelMode){
        this.setDynaModelMode(dynaModelMode);
        return this;
    }

     /**
     * 设置 动态模型使用
     * <P>
     * 等同 {@link #setDynaModelMode}
     * @param dynaModelMode
     */
    @JsonIgnore
    public PSSysSFPub dynamodelmode(net.ibizsys.psmodel.core.util.PSModelEnums.SFPubDynaModelMode dynaModelMode){
        if(dynaModelMode == null){
            this.setDynaModelMode(null);
        }
        else{
            this.setDynaModelMode(dynaModelMode.value);
        }
        return this;
    }

    /**
     * <B>GLOBALTSFLAG</B>&nbsp;启用全局事务，指定后台体系是否启用全局事务，未定义时模型引擎将判断系统中是否存在启用全局事务的实体行为的事务模式，如有设置为【是】，其它设置为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_GLOBALTSFLAG = "globaltsflag";

    /**
     * 设置 启用全局事务，详细说明：{@link #FIELD_GLOBALTSFLAG}
     * 
     * @param globalTSFlag
     * 
     */
    @JsonProperty(FIELD_GLOBALTSFLAG)
    public void setGlobalTSFlag(Integer globalTSFlag){
        this.set(FIELD_GLOBALTSFLAG, globalTSFlag);
    }
    
    /**
     * 获取 启用全局事务  
     * @return
     */
    @JsonIgnore
    public Integer getGlobalTSFlag(){
        Object objValue = this.get(FIELD_GLOBALTSFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用全局事务 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGlobalTSFlagDirty(){
        if(this.contains(FIELD_GLOBALTSFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用全局事务
     */
    @JsonIgnore
    public void resetGlobalTSFlag(){
        this.reset(FIELD_GLOBALTSFLAG);
    }

    /**
     * 设置 启用全局事务，详细说明：{@link #FIELD_GLOBALTSFLAG}
     * <P>
     * 等同 {@link #setGlobalTSFlag}
     * @param globalTSFlag
     */
    @JsonIgnore
    public PSSysSFPub globaltsflag(Integer globalTSFlag){
        this.setGlobalTSFlag(globalTSFlag);
        return this;
    }

     /**
     * 设置 启用全局事务，详细说明：{@link #FIELD_GLOBALTSFLAG}
     * <P>
     * 等同 {@link #setGlobalTSFlag}
     * @param globalTSFlag
     */
    @JsonIgnore
    public PSSysSFPub globaltsflag(Boolean globalTSFlag){
        if(globalTSFlag == null){
            this.setGlobalTSFlag(null);
        }
        else{
            this.setGlobalTSFlag(globalTSFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSSysSFPub memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PKGCODENAME</B>&nbsp;代码包名，指定后台体系的代码包名
     * <P>
     * 字符串：最大长度 200，由字母、数字、下划线及点号组成，且开始必须字母
     */
    public final static String FIELD_PKGCODENAME = "pkgcodename";

    /**
     * 设置 代码包名，详细说明：{@link #FIELD_PKGCODENAME}
     * 
     * @param pKGCodeName
     * 
     */
    @JsonProperty(FIELD_PKGCODENAME)
    public void setPKGCodeName(String pKGCodeName){
        this.set(FIELD_PKGCODENAME, pKGCodeName);
    }
    
    /**
     * 获取 代码包名  
     * @return
     */
    @JsonIgnore
    public String getPKGCodeName(){
        Object objValue = this.get(FIELD_PKGCODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码包名 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPKGCodeNameDirty(){
        if(this.contains(FIELD_PKGCODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码包名
     */
    @JsonIgnore
    public void resetPKGCodeName(){
        this.reset(FIELD_PKGCODENAME);
    }

    /**
     * 设置 代码包名，详细说明：{@link #FIELD_PKGCODENAME}
     * <P>
     * 等同 {@link #setPKGCodeName}
     * @param pKGCodeName
     */
    @JsonIgnore
    public PSSysSFPub pkgcodename(String pKGCodeName){
        this.setPKGCodeName(pKGCodeName);
        return this;
    }

    /**
     * <B>PPSSYSSFPUBID</B>&nbsp;后台体系，指定后台体系的父体系
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysSFPub} 
     */
    public final static String FIELD_PPSSYSSFPUBID = "ppssyssfpubid";

    /**
     * 设置 后台体系，详细说明：{@link #FIELD_PPSSYSSFPUBID}
     * 
     * @param pPSSysSFPubId
     * 
     */
    @JsonProperty(FIELD_PPSSYSSFPUBID)
    public void setPPSSysSFPubId(String pPSSysSFPubId){
        this.set(FIELD_PPSSYSSFPUBID, pPSSysSFPubId);
    }
    
    /**
     * 获取 后台体系  
     * @return
     */
    @JsonIgnore
    public String getPPSSysSFPubId(){
        Object objValue = this.get(FIELD_PPSSYSSFPUBID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSSysSFPubIdDirty(){
        if(this.contains(FIELD_PPSSYSSFPUBID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台体系
     */
    @JsonIgnore
    public void resetPPSSysSFPubId(){
        this.reset(FIELD_PPSSYSSFPUBID);
    }

    /**
     * 设置 后台体系，详细说明：{@link #FIELD_PPSSYSSFPUBID}
     * <P>
     * 等同 {@link #setPPSSysSFPubId}
     * @param pPSSysSFPubId
     */
    @JsonIgnore
    public PSSysSFPub ppssyssfpubid(String pPSSysSFPubId){
        this.setPPSSysSFPubId(pPSSysSFPubId);
        return this;
    }

    /**
     * 设置 后台体系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPPSSysSFPubId}
     * @param pSSysSFPub 引用对象
     */
    @JsonIgnore
    public PSSysSFPub ppssyssfpubid(PSSysSFPub pSSysSFPub){
        if(pSSysSFPub == null){
            this.setPPSSysSFPubId(null);
            this.setPPSSysSFPubName(null);
        }
        else{
            this.setPPSSysSFPubId(pSSysSFPub.getPSSysSFPubId());
            this.setPPSSysSFPubName(pSSysSFPub.getPSSysSFPubName());
        }
        return this;
    }

    /**
     * <B>PPSSYSSFPUBNAME</B>&nbsp;后台体系，指定后台体系的父体系
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PPSSYSSFPUBID}
     */
    public final static String FIELD_PPSSYSSFPUBNAME = "ppssyssfpubname";

    /**
     * 设置 后台体系，详细说明：{@link #FIELD_PPSSYSSFPUBNAME}
     * 
     * @param pPSSysSFPubName
     * 
     */
    @JsonProperty(FIELD_PPSSYSSFPUBNAME)
    public void setPPSSysSFPubName(String pPSSysSFPubName){
        this.set(FIELD_PPSSYSSFPUBNAME, pPSSysSFPubName);
    }
    
    /**
     * 获取 后台体系  
     * @return
     */
    @JsonIgnore
    public String getPPSSysSFPubName(){
        Object objValue = this.get(FIELD_PPSSYSSFPUBNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSSysSFPubNameDirty(){
        if(this.contains(FIELD_PPSSYSSFPUBNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台体系
     */
    @JsonIgnore
    public void resetPPSSysSFPubName(){
        this.reset(FIELD_PPSSYSSFPUBNAME);
    }

    /**
     * 设置 后台体系，详细说明：{@link #FIELD_PPSSYSSFPUBNAME}
     * <P>
     * 等同 {@link #setPPSSysSFPubName}
     * @param pPSSysSFPubName
     */
    @JsonIgnore
    public PSSysSFPub ppssyssfpubname(String pPSSysSFPubName){
        this.setPPSSysSFPubName(pPSSysSFPubName);
        return this;
    }

    /**
     * <B>PSSFSTYLEID</B>&nbsp;服务框架，指定后台体系使用的服务框架，服务框架的技术架构必须和系统使用的后台技术架构一致
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSFSTYLEID = "pssfstyleid";

    /**
     * 设置 服务框架，详细说明：{@link #FIELD_PSSFSTYLEID}
     * 
     * @param pSSFStyleId
     * 
     */
    @JsonProperty(FIELD_PSSFSTYLEID)
    public void setPSSFStyleId(String pSSFStyleId){
        this.set(FIELD_PSSFSTYLEID, pSSFStyleId);
    }
    
    /**
     * 获取 服务框架  
     * @return
     */
    @JsonIgnore
    public String getPSSFStyleId(){
        Object objValue = this.get(FIELD_PSSFSTYLEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 服务框架 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSFStyleIdDirty(){
        if(this.contains(FIELD_PSSFSTYLEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务框架
     */
    @JsonIgnore
    public void resetPSSFStyleId(){
        this.reset(FIELD_PSSFSTYLEID);
    }

    /**
     * 设置 服务框架，详细说明：{@link #FIELD_PSSFSTYLEID}
     * <P>
     * 等同 {@link #setPSSFStyleId}
     * @param pSSFStyleId
     */
    @JsonIgnore
    public PSSysSFPub pssfstyleid(String pSSFStyleId){
        this.setPSSFStyleId(pSSFStyleId);
        return this;
    }

    /**
     * <B>PSSFSTYLENAME</B>&nbsp;服务框架，指定后台体系使用的服务框架，服务框架的技术架构必须和系统使用的后台技术架构一致
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSFSTYLEID}
     */
    public final static String FIELD_PSSFSTYLENAME = "pssfstylename";

    /**
     * 设置 服务框架，详细说明：{@link #FIELD_PSSFSTYLENAME}
     * 
     * @param pSSFStyleName
     * 
     */
    @JsonProperty(FIELD_PSSFSTYLENAME)
    public void setPSSFStyleName(String pSSFStyleName){
        this.set(FIELD_PSSFSTYLENAME, pSSFStyleName);
    }
    
    /**
     * 获取 服务框架  
     * @return
     */
    @JsonIgnore
    public String getPSSFStyleName(){
        Object objValue = this.get(FIELD_PSSFSTYLENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 服务框架 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSFStyleNameDirty(){
        if(this.contains(FIELD_PSSFSTYLENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务框架
     */
    @JsonIgnore
    public void resetPSSFStyleName(){
        this.reset(FIELD_PSSFSTYLENAME);
    }

    /**
     * 设置 服务框架，详细说明：{@link #FIELD_PSSFSTYLENAME}
     * <P>
     * 等同 {@link #setPSSFStyleName}
     * @param pSSFStyleName
     */
    @JsonIgnore
    public PSSysSFPub pssfstylename(String pSSFStyleName){
        this.setPSSFStyleName(pSSFStyleName);
        return this;
    }

    /**
     * <B>PSSFSTYLEPARAMID</B>&nbsp;服务框架参数，指定后台体系的预定义服务框架参数，后台模板发布时引擎将注入服务框架参数，模板可根据这些参数动态控制输出内容
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSFSTYLEPARAMID = "pssfstyleparamid";

    /**
     * 设置 服务框架参数，详细说明：{@link #FIELD_PSSFSTYLEPARAMID}
     * 
     * @param pSSFStyleParamId
     * 
     */
    @JsonProperty(FIELD_PSSFSTYLEPARAMID)
    public void setPSSFStyleParamId(String pSSFStyleParamId){
        this.set(FIELD_PSSFSTYLEPARAMID, pSSFStyleParamId);
    }
    
    /**
     * 获取 服务框架参数  
     * @return
     */
    @JsonIgnore
    public String getPSSFStyleParamId(){
        Object objValue = this.get(FIELD_PSSFSTYLEPARAMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 服务框架参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSFStyleParamIdDirty(){
        if(this.contains(FIELD_PSSFSTYLEPARAMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务框架参数
     */
    @JsonIgnore
    public void resetPSSFStyleParamId(){
        this.reset(FIELD_PSSFSTYLEPARAMID);
    }

    /**
     * 设置 服务框架参数，详细说明：{@link #FIELD_PSSFSTYLEPARAMID}
     * <P>
     * 等同 {@link #setPSSFStyleParamId}
     * @param pSSFStyleParamId
     */
    @JsonIgnore
    public PSSysSFPub pssfstyleparamid(String pSSFStyleParamId){
        this.setPSSFStyleParamId(pSSFStyleParamId);
        return this;
    }

    /**
     * <B>PSSFSTYLEPARAMNAME</B>&nbsp;服务框架参数，指定后台体系的预定义服务框架参数，后台模板发布时引擎将注入服务框架参数，模板可根据这些参数动态控制输出内容
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSFSTYLEPARAMID}
     */
    public final static String FIELD_PSSFSTYLEPARAMNAME = "pssfstyleparamname";

    /**
     * 设置 服务框架参数，详细说明：{@link #FIELD_PSSFSTYLEPARAMNAME}
     * 
     * @param pSSFStyleParamName
     * 
     */
    @JsonProperty(FIELD_PSSFSTYLEPARAMNAME)
    public void setPSSFStyleParamName(String pSSFStyleParamName){
        this.set(FIELD_PSSFSTYLEPARAMNAME, pSSFStyleParamName);
    }
    
    /**
     * 获取 服务框架参数  
     * @return
     */
    @JsonIgnore
    public String getPSSFStyleParamName(){
        Object objValue = this.get(FIELD_PSSFSTYLEPARAMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 服务框架参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSFStyleParamNameDirty(){
        if(this.contains(FIELD_PSSFSTYLEPARAMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务框架参数
     */
    @JsonIgnore
    public void resetPSSFStyleParamName(){
        this.reset(FIELD_PSSFSTYLEPARAMNAME);
    }

    /**
     * 设置 服务框架参数，详细说明：{@link #FIELD_PSSFSTYLEPARAMNAME}
     * <P>
     * 等同 {@link #setPSSFStyleParamName}
     * @param pSSFStyleParamName
     */
    @JsonIgnore
    public PSSysSFPub pssfstyleparamname(String pSSFStyleParamName){
        this.setPSSFStyleParamName(pSSFStyleParamName);
        return this;
    }

    /**
     * <B>PSSFSTYLEVERID</B>&nbsp;服务框架扩展，指定后台体系的预定义服务框架扩展，此配置为早期模板保留
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSFSTYLEVERID = "pssfstyleverid";

    /**
     * 设置 服务框架扩展，详细说明：{@link #FIELD_PSSFSTYLEVERID}
     * 
     * @param pSSFStyleVerId
     * 
     */
    @JsonProperty(FIELD_PSSFSTYLEVERID)
    public void setPSSFStyleVerId(String pSSFStyleVerId){
        this.set(FIELD_PSSFSTYLEVERID, pSSFStyleVerId);
    }
    
    /**
     * 获取 服务框架扩展  
     * @return
     */
    @JsonIgnore
    public String getPSSFStyleVerId(){
        Object objValue = this.get(FIELD_PSSFSTYLEVERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 服务框架扩展 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSFStyleVerIdDirty(){
        if(this.contains(FIELD_PSSFSTYLEVERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务框架扩展
     */
    @JsonIgnore
    public void resetPSSFStyleVerId(){
        this.reset(FIELD_PSSFSTYLEVERID);
    }

    /**
     * 设置 服务框架扩展，详细说明：{@link #FIELD_PSSFSTYLEVERID}
     * <P>
     * 等同 {@link #setPSSFStyleVerId}
     * @param pSSFStyleVerId
     */
    @JsonIgnore
    public PSSysSFPub pssfstyleverid(String pSSFStyleVerId){
        this.setPSSFStyleVerId(pSSFStyleVerId);
        return this;
    }

    /**
     * <B>PSSFSTYLEVERNAME</B>&nbsp;服务框架扩展，指定后台体系的预定义服务框架扩展，此配置为早期模板保留
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSFSTYLEVERID}
     */
    public final static String FIELD_PSSFSTYLEVERNAME = "pssfstylevername";

    /**
     * 设置 服务框架扩展，详细说明：{@link #FIELD_PSSFSTYLEVERNAME}
     * 
     * @param pSSFStyleVerName
     * 
     */
    @JsonProperty(FIELD_PSSFSTYLEVERNAME)
    public void setPSSFStyleVerName(String pSSFStyleVerName){
        this.set(FIELD_PSSFSTYLEVERNAME, pSSFStyleVerName);
    }
    
    /**
     * 获取 服务框架扩展  
     * @return
     */
    @JsonIgnore
    public String getPSSFStyleVerName(){
        Object objValue = this.get(FIELD_PSSFSTYLEVERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 服务框架扩展 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSFStyleVerNameDirty(){
        if(this.contains(FIELD_PSSFSTYLEVERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务框架扩展
     */
    @JsonIgnore
    public void resetPSSFStyleVerName(){
        this.reset(FIELD_PSSFSTYLEVERNAME);
    }

    /**
     * 设置 服务框架扩展，详细说明：{@link #FIELD_PSSFSTYLEVERNAME}
     * <P>
     * 等同 {@link #setPSSFStyleVerName}
     * @param pSSFStyleVerName
     */
    @JsonIgnore
    public PSSysSFPub pssfstylevername(String pSSFStyleVerName){
        this.setPSSFStyleVerName(pSSFStyleVerName);
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
    public PSSysSFPub pssysdynamodelid(String pSSysDynaModelId){
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
    public PSSysSFPub pssysdynamodelid(PSSysDynaModel pSSysDynaModel){
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
    public PSSysSFPub pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSSYSSFPUBID</B>&nbsp;后台体系标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSSFPUBID = "pssyssfpubid";

    /**
     * 设置 后台体系标识
     * 
     * @param pSSysSFPubId
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPUBID)
    public void setPSSysSFPubId(String pSSysSFPubId){
        this.set(FIELD_PSSYSSFPUBID, pSSysSFPubId);
    }
    
    /**
     * 获取 后台体系标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysSFPubId(){
        Object objValue = this.get(FIELD_PSSYSSFPUBID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台体系标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSFPubIdDirty(){
        if(this.contains(FIELD_PSSYSSFPUBID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台体系标识
     */
    @JsonIgnore
    public void resetPSSysSFPubId(){
        this.reset(FIELD_PSSYSSFPUBID);
    }

    /**
     * 设置 后台体系标识
     * <P>
     * 等同 {@link #setPSSysSFPubId}
     * @param pSSysSFPubId
     */
    @JsonIgnore
    public PSSysSFPub pssyssfpubid(String pSSysSFPubId){
        this.setPSSysSFPubId(pSSysSFPubId);
        return this;
    }

    /**
     * <B>PSSYSSFPUBNAME</B>&nbsp;后台体系名称，指定后台体系的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSSFPUBNAME = "pssyssfpubname";

    /**
     * 设置 后台体系名称，详细说明：{@link #FIELD_PSSYSSFPUBNAME}
     * 
     * @param pSSysSFPubName
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPUBNAME)
    public void setPSSysSFPubName(String pSSysSFPubName){
        this.set(FIELD_PSSYSSFPUBNAME, pSSysSFPubName);
    }
    
    /**
     * 获取 后台体系名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysSFPubName(){
        Object objValue = this.get(FIELD_PSSYSSFPUBNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台体系名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSFPubNameDirty(){
        if(this.contains(FIELD_PSSYSSFPUBNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台体系名称
     */
    @JsonIgnore
    public void resetPSSysSFPubName(){
        this.reset(FIELD_PSSYSSFPUBNAME);
    }

    /**
     * 设置 后台体系名称，详细说明：{@link #FIELD_PSSYSSFPUBNAME}
     * <P>
     * 等同 {@link #setPSSysSFPubName}
     * @param pSSysSFPubName
     */
    @JsonIgnore
    public PSSysSFPub pssyssfpubname(String pSSysSFPubName){
        this.setPSSysSFPubName(pSSysSFPubName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysSFPubName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysSFPubName(strName);
    }

    @JsonIgnore
    public PSSysSFPub name(String strName){
        this.setPSSysSFPubName(strName);
        return this;
    }

    /**
     * <B>PUBFOLDER</B>&nbsp;服务目录，指定后台体系的服务目录
     * <P>
     * 字符串：最大长度 20，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PUBFOLDER = "pubfolder";

    /**
     * 设置 服务目录，详细说明：{@link #FIELD_PUBFOLDER}
     * 
     * @param pubFolder
     * 
     */
    @JsonProperty(FIELD_PUBFOLDER)
    public void setPubFolder(String pubFolder){
        this.set(FIELD_PUBFOLDER, pubFolder);
    }
    
    /**
     * 获取 服务目录  
     * @return
     */
    @JsonIgnore
    public String getPubFolder(){
        Object objValue = this.get(FIELD_PUBFOLDER);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 服务目录 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPubFolderDirty(){
        if(this.contains(FIELD_PUBFOLDER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务目录
     */
    @JsonIgnore
    public void resetPubFolder(){
        this.reset(FIELD_PUBFOLDER);
    }

    /**
     * 设置 服务目录，详细说明：{@link #FIELD_PUBFOLDER}
     * <P>
     * 等同 {@link #setPubFolder}
     * @param pubFolder
     */
    @JsonIgnore
    public PSSysSFPub pubfolder(String pubFolder){
        this.setPubFolder(pubFolder);
        return this;
    }

    /**
     * <B>PUBTAG</B>&nbsp;发布标记，指定后台体系的发布标记
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_PUBTAG = "pubtag";

    /**
     * 设置 发布标记，详细说明：{@link #FIELD_PUBTAG}
     * 
     * @param pubTag
     * 
     */
    @JsonProperty(FIELD_PUBTAG)
    public void setPubTag(String pubTag){
        this.set(FIELD_PUBTAG, pubTag);
    }
    
    /**
     * 获取 发布标记  
     * @return
     */
    @JsonIgnore
    public String getPubTag(){
        Object objValue = this.get(FIELD_PUBTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 发布标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPubTagDirty(){
        if(this.contains(FIELD_PUBTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 发布标记
     */
    @JsonIgnore
    public void resetPubTag(){
        this.reset(FIELD_PUBTAG);
    }

    /**
     * 设置 发布标记，详细说明：{@link #FIELD_PUBTAG}
     * <P>
     * 等同 {@link #setPubTag}
     * @param pubTag
     */
    @JsonIgnore
    public PSSysSFPub pubtag(String pubTag){
        this.setPubTag(pubTag);
        return this;
    }

    /**
     * <B>PUBTAG2</B>&nbsp;发布标记2，指定后台体系的发布标记2
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_PUBTAG2 = "pubtag2";

    /**
     * 设置 发布标记2，详细说明：{@link #FIELD_PUBTAG2}
     * 
     * @param pubTag2
     * 
     */
    @JsonProperty(FIELD_PUBTAG2)
    public void setPubTag2(String pubTag2){
        this.set(FIELD_PUBTAG2, pubTag2);
    }
    
    /**
     * 获取 发布标记2  
     * @return
     */
    @JsonIgnore
    public String getPubTag2(){
        Object objValue = this.get(FIELD_PUBTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 发布标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPubTag2Dirty(){
        if(this.contains(FIELD_PUBTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 发布标记2
     */
    @JsonIgnore
    public void resetPubTag2(){
        this.reset(FIELD_PUBTAG2);
    }

    /**
     * 设置 发布标记2，详细说明：{@link #FIELD_PUBTAG2}
     * <P>
     * 等同 {@link #setPubTag2}
     * @param pubTag2
     */
    @JsonIgnore
    public PSSysSFPub pubtag2(String pubTag2){
        this.setPubTag2(pubTag2);
        return this;
    }

    /**
     * <B>PUBTAG3</B>&nbsp;发布标记3，指定后台体系的发布标记3
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_PUBTAG3 = "pubtag3";

    /**
     * 设置 发布标记3，详细说明：{@link #FIELD_PUBTAG3}
     * 
     * @param pubTag3
     * 
     */
    @JsonProperty(FIELD_PUBTAG3)
    public void setPubTag3(String pubTag3){
        this.set(FIELD_PUBTAG3, pubTag3);
    }
    
    /**
     * 获取 发布标记3  
     * @return
     */
    @JsonIgnore
    public String getPubTag3(){
        Object objValue = this.get(FIELD_PUBTAG3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 发布标记3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPubTag3Dirty(){
        if(this.contains(FIELD_PUBTAG3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 发布标记3
     */
    @JsonIgnore
    public void resetPubTag3(){
        this.reset(FIELD_PUBTAG3);
    }

    /**
     * 设置 发布标记3，详细说明：{@link #FIELD_PUBTAG3}
     * <P>
     * 等同 {@link #setPubTag3}
     * @param pubTag3
     */
    @JsonIgnore
    public PSSysSFPub pubtag3(String pubTag3){
        this.setPubTag3(pubTag3);
        return this;
    }

    /**
     * <B>PUBTAG4</B>&nbsp;发布标记4，指定后台体系的发布标记4
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_PUBTAG4 = "pubtag4";

    /**
     * 设置 发布标记4，详细说明：{@link #FIELD_PUBTAG4}
     * 
     * @param pubTag4
     * 
     */
    @JsonProperty(FIELD_PUBTAG4)
    public void setPubTag4(String pubTag4){
        this.set(FIELD_PUBTAG4, pubTag4);
    }
    
    /**
     * 获取 发布标记4  
     * @return
     */
    @JsonIgnore
    public String getPubTag4(){
        Object objValue = this.get(FIELD_PUBTAG4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 发布标记4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPubTag4Dirty(){
        if(this.contains(FIELD_PUBTAG4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 发布标记4
     */
    @JsonIgnore
    public void resetPubTag4(){
        this.reset(FIELD_PUBTAG4);
    }

    /**
     * 设置 发布标记4，详细说明：{@link #FIELD_PUBTAG4}
     * <P>
     * 等同 {@link #setPubTag4}
     * @param pubTag4
     */
    @JsonIgnore
    public PSSysSFPub pubtag4(String pubTag4){
        this.setPubTag4(pubTag4);
        return this;
    }

    /**
     * <B>REMOVEFLAG</B>&nbsp;删除标记，后台体系需要标记为【允许删除】才允许进行删除，防止用户对关键模型进行误操作
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ModelRemoveMode} 
     */
    public final static String FIELD_REMOVEFLAG = "removeflag";

    /**
     * 设置 删除标记，详细说明：{@link #FIELD_REMOVEFLAG}
     * 
     * @param removeFlag
     * 
     */
    @JsonProperty(FIELD_REMOVEFLAG)
    public void setRemoveFlag(Integer removeFlag){
        this.set(FIELD_REMOVEFLAG, removeFlag);
    }
    
    /**
     * 获取 删除标记  
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
     * 判断 删除标记 是否指定值，包括空值
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
     * 重置 删除标记
     */
    @JsonIgnore
    public void resetRemoveFlag(){
        this.reset(FIELD_REMOVEFLAG);
    }

    /**
     * 设置 删除标记，详细说明：{@link #FIELD_REMOVEFLAG}
     * <P>
     * 等同 {@link #setRemoveFlag}
     * @param removeFlag
     */
    @JsonIgnore
    public PSSysSFPub removeflag(Integer removeFlag){
        this.setRemoveFlag(removeFlag);
        return this;
    }

     /**
     * 设置 删除标记，详细说明：{@link #FIELD_REMOVEFLAG}
     * <P>
     * 等同 {@link #setRemoveFlag}
     * @param removeFlag
     */
    @JsonIgnore
    public PSSysSFPub removeflag(net.ibizsys.psmodel.core.util.PSModelEnums.ModelRemoveMode removeFlag){
        if(removeFlag == null){
            this.setRemoveFlag(null);
        }
        else{
            this.setRemoveFlag(removeFlag.value);
        }
        return this;
    }

    /**
     * <B>STYLEPARAMS</B>&nbsp;服务框架参数，指定后台体系的服务框架参数，后台模板发布时引擎将注入服务框架参数，模板可根据这些参数动态控制输出内容
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_STYLEPARAMS = "styleparams";

    /**
     * 设置 服务框架参数，详细说明：{@link #FIELD_STYLEPARAMS}
     * 
     * @param styleParams
     * 
     */
    @JsonProperty(FIELD_STYLEPARAMS)
    public void setStyleParams(String styleParams){
        this.set(FIELD_STYLEPARAMS, styleParams);
    }
    
    /**
     * 获取 服务框架参数  
     * @return
     */
    @JsonIgnore
    public String getStyleParams(){
        Object objValue = this.get(FIELD_STYLEPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 服务框架参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStyleParamsDirty(){
        if(this.contains(FIELD_STYLEPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务框架参数
     */
    @JsonIgnore
    public void resetStyleParams(){
        this.reset(FIELD_STYLEPARAMS);
    }

    /**
     * 设置 服务框架参数，详细说明：{@link #FIELD_STYLEPARAMS}
     * <P>
     * 等同 {@link #setStyleParams}
     * @param styleParams
     */
    @JsonIgnore
    public PSSysSFPub styleparams(String styleParams){
        this.setStyleParams(styleParams);
        return this;
    }

    /**
     * <B>SUBSYSPKGFLAG</B>&nbsp;引用系统组件，指定后台体系是否输出子系统组件包，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_SUBSYSPKGFLAG = "subsyspkgflag";

    /**
     * 设置 引用系统组件，详细说明：{@link #FIELD_SUBSYSPKGFLAG}
     * 
     * @param subSysPkgFlag
     * 
     */
    @JsonProperty(FIELD_SUBSYSPKGFLAG)
    public void setSubSysPkgFlag(Integer subSysPkgFlag){
        this.set(FIELD_SUBSYSPKGFLAG, subSysPkgFlag);
    }
    
    /**
     * 获取 引用系统组件  
     * @return
     */
    @JsonIgnore
    public Integer getSubSysPkgFlag(){
        Object objValue = this.get(FIELD_SUBSYSPKGFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 引用系统组件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSubSysPkgFlagDirty(){
        if(this.contains(FIELD_SUBSYSPKGFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用系统组件
     */
    @JsonIgnore
    public void resetSubSysPkgFlag(){
        this.reset(FIELD_SUBSYSPKGFLAG);
    }

    /**
     * 设置 引用系统组件，详细说明：{@link #FIELD_SUBSYSPKGFLAG}
     * <P>
     * 等同 {@link #setSubSysPkgFlag}
     * @param subSysPkgFlag
     */
    @JsonIgnore
    public PSSysSFPub subsyspkgflag(Integer subSysPkgFlag){
        this.setSubSysPkgFlag(subSysPkgFlag);
        return this;
    }

     /**
     * 设置 引用系统组件，详细说明：{@link #FIELD_SUBSYSPKGFLAG}
     * <P>
     * 等同 {@link #setSubSysPkgFlag}
     * @param subSysPkgFlag
     */
    @JsonIgnore
    public PSSysSFPub subsyspkgflag(Boolean subSysPkgFlag){
        if(subSysPkgFlag == null){
            this.setSubSysPkgFlag(null);
        }
        else{
            this.setSubSysPkgFlag(subSysPkgFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSSysSFPub updatedate(String updateDate){
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
    public PSSysSFPub updateman(String updateMan){
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
    public PSSysSFPub usercat(String userCat){
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
    public PSSysSFPub usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysSFPub usertag(String userTag){
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
    public PSSysSFPub usertag2(String userTag2){
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
    public PSSysSFPub usertag3(String userTag3){
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
    public PSSysSFPub usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>VERSTR</B>&nbsp;版本号，指定后台体系的版本号
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_VERSTR = "verstr";

    /**
     * 设置 版本号，详细说明：{@link #FIELD_VERSTR}
     * 
     * @param verStr
     * 
     */
    @JsonProperty(FIELD_VERSTR)
    public void setVerStr(String verStr){
        this.set(FIELD_VERSTR, verStr);
    }
    
    /**
     * 获取 版本号  
     * @return
     */
    @JsonIgnore
    public String getVerStr(){
        Object objValue = this.get(FIELD_VERSTR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 版本号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isVerStrDirty(){
        if(this.contains(FIELD_VERSTR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 版本号
     */
    @JsonIgnore
    public void resetVerStr(){
        this.reset(FIELD_VERSTR);
    }

    /**
     * 设置 版本号，详细说明：{@link #FIELD_VERSTR}
     * <P>
     * 等同 {@link #setVerStr}
     * @param verStr
     */
    @JsonIgnore
    public PSSysSFPub verstr(String verStr){
        this.setVerStr(verStr);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysSFPubId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysSFPubId(strValue);
    }

    @JsonIgnore
    public PSSysSFPub id(String strValue){
        this.setPSSysSFPubId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysSFPub){
            PSSysSFPub model = (PSSysSFPub)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
