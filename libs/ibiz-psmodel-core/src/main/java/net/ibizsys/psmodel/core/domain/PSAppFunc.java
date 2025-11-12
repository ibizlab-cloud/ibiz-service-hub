package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSAPPFUNC</B>应用功能 模型传输对象
 * <P>
 * 应用功能模型，定义前端应用提供的操作功能，一般绑定到应用菜单提供操作入口
 */
public class PSAppFunc extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSAppFunc(){
    }      

    /**
     * <B>APPFUNCTYPE</B>&nbsp;应用功能类型，指定应用功能的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.AppFuncType} 
     */
    public final static String FIELD_APPFUNCTYPE = "appfunctype";

    /**
     * 设置 应用功能类型，详细说明：{@link #FIELD_APPFUNCTYPE}
     * 
     * @param appFuncType
     * 
     */
    @JsonProperty(FIELD_APPFUNCTYPE)
    public void setAppFuncType(String appFuncType){
        this.set(FIELD_APPFUNCTYPE, appFuncType);
    }
    
    /**
     * 获取 应用功能类型  
     * @return
     */
    @JsonIgnore
    public String getAppFuncType(){
        Object objValue = this.get(FIELD_APPFUNCTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用功能类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAppFuncTypeDirty(){
        if(this.contains(FIELD_APPFUNCTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用功能类型
     */
    @JsonIgnore
    public void resetAppFuncType(){
        this.reset(FIELD_APPFUNCTYPE);
    }

    /**
     * 设置 应用功能类型，详细说明：{@link #FIELD_APPFUNCTYPE}
     * <P>
     * 等同 {@link #setAppFuncType}
     * @param appFuncType
     */
    @JsonIgnore
    public PSAppFunc appfunctype(String appFuncType){
        this.setAppFuncType(appFuncType);
        return this;
    }

     /**
     * 设置 应用功能类型，详细说明：{@link #FIELD_APPFUNCTYPE}
     * <P>
     * 等同 {@link #setAppFuncType}
     * @param appFuncType
     */
    @JsonIgnore
    public PSAppFunc appfunctype(net.ibizsys.psmodel.core.util.PSModelEnums.AppFuncType appFuncType){
        if(appFuncType == null){
            this.setAppFuncType(null);
        }
        else{
            this.setAppFuncType(appFuncType.value);
        }
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定应用功能的代码标识，需要在所在的前端应用中具有唯一性
     * <P>
     * 字符串：最大长度 30
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
    public PSAppFunc codename(String codeName){
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
    public PSAppFunc createdate(String createDate){
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
    public PSAppFunc createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DYNAINSTTAG</B>&nbsp;动态实例标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_DYNAINSTTAG = "dynainsttag";

    /**
     * 设置 动态实例标记
     * 
     * @param dynaInstTag
     * 
     */
    @JsonProperty(FIELD_DYNAINSTTAG)
    public void setDynaInstTag(String dynaInstTag){
        this.set(FIELD_DYNAINSTTAG, dynaInstTag);
    }
    
    /**
     * 获取 动态实例标记  
     * @return
     */
    @JsonIgnore
    public String getDynaInstTag(){
        Object objValue = this.get(FIELD_DYNAINSTTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 动态实例标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDynaInstTagDirty(){
        if(this.contains(FIELD_DYNAINSTTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 动态实例标记
     */
    @JsonIgnore
    public void resetDynaInstTag(){
        this.reset(FIELD_DYNAINSTTAG);
    }

    /**
     * 设置 动态实例标记
     * <P>
     * 等同 {@link #setDynaInstTag}
     * @param dynaInstTag
     */
    @JsonIgnore
    public PSAppFunc dynainsttag(String dynaInstTag){
        this.setDynaInstTag(dynaInstTag);
        return this;
    }

    /**
     * <B>DYNAINSTTAG2</B>&nbsp;动态实例标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_DYNAINSTTAG2 = "dynainsttag2";

    /**
     * 设置 动态实例标记2
     * 
     * @param dynaInstTag2
     * 
     */
    @JsonProperty(FIELD_DYNAINSTTAG2)
    public void setDynaInstTag2(String dynaInstTag2){
        this.set(FIELD_DYNAINSTTAG2, dynaInstTag2);
    }
    
    /**
     * 获取 动态实例标记2  
     * @return
     */
    @JsonIgnore
    public String getDynaInstTag2(){
        Object objValue = this.get(FIELD_DYNAINSTTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 动态实例标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDynaInstTag2Dirty(){
        if(this.contains(FIELD_DYNAINSTTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 动态实例标记2
     */
    @JsonIgnore
    public void resetDynaInstTag2(){
        this.reset(FIELD_DYNAINSTTAG2);
    }

    /**
     * 设置 动态实例标记2
     * <P>
     * 等同 {@link #setDynaInstTag2}
     * @param dynaInstTag2
     */
    @JsonIgnore
    public PSAppFunc dynainsttag2(String dynaInstTag2){
        this.setDynaInstTag2(dynaInstTag2);
        return this;
    }

    /**
     * <B>FUNCSN</B>&nbsp;功能编号，指定应用功能的编号
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_FUNCSN = "funcsn";

    /**
     * 设置 功能编号，详细说明：{@link #FIELD_FUNCSN}
     * 
     * @param funcSN
     * 
     */
    @JsonProperty(FIELD_FUNCSN)
    public void setFuncSN(String funcSN){
        this.set(FIELD_FUNCSN, funcSN);
    }
    
    /**
     * 获取 功能编号  
     * @return
     */
    @JsonIgnore
    public String getFuncSN(){
        Object objValue = this.get(FIELD_FUNCSN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能编号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFuncSNDirty(){
        if(this.contains(FIELD_FUNCSN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能编号
     */
    @JsonIgnore
    public void resetFuncSN(){
        this.reset(FIELD_FUNCSN);
    }

    /**
     * 设置 功能编号，详细说明：{@link #FIELD_FUNCSN}
     * <P>
     * 等同 {@link #setFuncSN}
     * @param funcSN
     */
    @JsonIgnore
    public PSAppFunc funcsn(String funcSN){
        this.setFuncSN(funcSN);
        return this;
    }

    /**
     * <B>JSCODE</B>&nbsp;JS代码，应用功能类型为【执行JavaScript】时指定执行的代码
     */
    public final static String FIELD_JSCODE = "jscode";

    /**
     * 设置 JS代码，详细说明：{@link #FIELD_JSCODE}
     * 
     * @param jSCode
     * 
     */
    @JsonProperty(FIELD_JSCODE)
    public void setJSCode(String jSCode){
        this.set(FIELD_JSCODE, jSCode);
    }
    
    /**
     * 获取 JS代码  
     * @return
     */
    @JsonIgnore
    public String getJSCode(){
        Object objValue = this.get(FIELD_JSCODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 JS代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isJSCodeDirty(){
        if(this.contains(FIELD_JSCODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 JS代码
     */
    @JsonIgnore
    public void resetJSCode(){
        this.reset(FIELD_JSCODE);
    }

    /**
     * 设置 JS代码，详细说明：{@link #FIELD_JSCODE}
     * <P>
     * 等同 {@link #setJSCode}
     * @param jSCode
     */
    @JsonIgnore
    public PSAppFunc jscode(String jSCode){
        this.setJSCode(jSCode);
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
    public PSAppFunc memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>NAMEPSLANRESID</B>&nbsp;名称语言资源，指定应用功能的名称的多语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_NAMEPSLANRESID = "namepslanresid";

    /**
     * 设置 名称语言资源，详细说明：{@link #FIELD_NAMEPSLANRESID}
     * 
     * @param namePSLanResId
     * 
     */
    @JsonProperty(FIELD_NAMEPSLANRESID)
    public void setNamePSLanResId(String namePSLanResId){
        this.set(FIELD_NAMEPSLANRESID, namePSLanResId);
    }
    
    /**
     * 获取 名称语言资源  
     * @return
     */
    @JsonIgnore
    public String getNamePSLanResId(){
        Object objValue = this.get(FIELD_NAMEPSLANRESID);
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
    public boolean isNamePSLanResIdDirty(){
        if(this.contains(FIELD_NAMEPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 名称语言资源
     */
    @JsonIgnore
    public void resetNamePSLanResId(){
        this.reset(FIELD_NAMEPSLANRESID);
    }

    /**
     * 设置 名称语言资源，详细说明：{@link #FIELD_NAMEPSLANRESID}
     * <P>
     * 等同 {@link #setNamePSLanResId}
     * @param namePSLanResId
     */
    @JsonIgnore
    public PSAppFunc namepslanresid(String namePSLanResId){
        this.setNamePSLanResId(namePSLanResId);
        return this;
    }

    /**
     * 设置 名称语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNamePSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSAppFunc namepslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setNamePSLanResId(null);
            this.setNamePSLanResName(null);
        }
        else{
            this.setNamePSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setNamePSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>NAMEPSLANRESNAME</B>&nbsp;名称语言资源，指定应用功能的名称的多语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NAMEPSLANRESID}
     */
    public final static String FIELD_NAMEPSLANRESNAME = "namepslanresname";

    /**
     * 设置 名称语言资源，详细说明：{@link #FIELD_NAMEPSLANRESNAME}
     * 
     * @param namePSLanResName
     * 
     */
    @JsonProperty(FIELD_NAMEPSLANRESNAME)
    public void setNamePSLanResName(String namePSLanResName){
        this.set(FIELD_NAMEPSLANRESNAME, namePSLanResName);
    }
    
    /**
     * 获取 名称语言资源  
     * @return
     */
    @JsonIgnore
    public String getNamePSLanResName(){
        Object objValue = this.get(FIELD_NAMEPSLANRESNAME);
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
    public boolean isNamePSLanResNameDirty(){
        if(this.contains(FIELD_NAMEPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 名称语言资源
     */
    @JsonIgnore
    public void resetNamePSLanResName(){
        this.reset(FIELD_NAMEPSLANRESNAME);
    }

    /**
     * 设置 名称语言资源，详细说明：{@link #FIELD_NAMEPSLANRESNAME}
     * <P>
     * 等同 {@link #setNamePSLanResName}
     * @param namePSLanResName
     */
    @JsonIgnore
    public PSAppFunc namepslanresname(String namePSLanResName){
        this.setNamePSLanResName(namePSLanResName);
        return this;
    }

    /**
     * <B>OPENMODE</B>&nbsp;打开方式，指定应用功能的打开方式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.AppFuncOpenMode} 
     */
    public final static String FIELD_OPENMODE = "openmode";

    /**
     * 设置 打开方式，详细说明：{@link #FIELD_OPENMODE}
     * 
     * @param openMode
     * 
     */
    @JsonProperty(FIELD_OPENMODE)
    public void setOpenMode(String openMode){
        this.set(FIELD_OPENMODE, openMode);
    }
    
    /**
     * 获取 打开方式  
     * @return
     */
    @JsonIgnore
    public String getOpenMode(){
        Object objValue = this.get(FIELD_OPENMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 打开方式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOpenModeDirty(){
        if(this.contains(FIELD_OPENMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 打开方式
     */
    @JsonIgnore
    public void resetOpenMode(){
        this.reset(FIELD_OPENMODE);
    }

    /**
     * 设置 打开方式，详细说明：{@link #FIELD_OPENMODE}
     * <P>
     * 等同 {@link #setOpenMode}
     * @param openMode
     */
    @JsonIgnore
    public PSAppFunc openmode(String openMode){
        this.setOpenMode(openMode);
        return this;
    }

     /**
     * 设置 打开方式，详细说明：{@link #FIELD_OPENMODE}
     * <P>
     * 等同 {@link #setOpenMode}
     * @param openMode
     */
    @JsonIgnore
    public PSAppFunc openmode(net.ibizsys.psmodel.core.util.PSModelEnums.AppFuncOpenMode openMode){
        if(openMode == null){
            this.setOpenMode(null);
        }
        else{
            this.setOpenMode(openMode.value);
        }
        return this;
    }

    /**
     * <B>OPENVIEWPARAM</B>&nbsp;打开视图参数，指定应用功能的打开视图参数
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_OPENVIEWPARAM = "openviewparam";

    /**
     * 设置 打开视图参数，详细说明：{@link #FIELD_OPENVIEWPARAM}
     * 
     * @param openViewParam
     * 
     */
    @JsonProperty(FIELD_OPENVIEWPARAM)
    public void setOpenViewParam(String openViewParam){
        this.set(FIELD_OPENVIEWPARAM, openViewParam);
    }
    
    /**
     * 获取 打开视图参数  
     * @return
     */
    @JsonIgnore
    public String getOpenViewParam(){
        Object objValue = this.get(FIELD_OPENVIEWPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 打开视图参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOpenViewParamDirty(){
        if(this.contains(FIELD_OPENVIEWPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 打开视图参数
     */
    @JsonIgnore
    public void resetOpenViewParam(){
        this.reset(FIELD_OPENVIEWPARAM);
    }

    /**
     * 设置 打开视图参数，详细说明：{@link #FIELD_OPENVIEWPARAM}
     * <P>
     * 等同 {@link #setOpenViewParam}
     * @param openViewParam
     */
    @JsonIgnore
    public PSAppFunc openviewparam(String openViewParam){
        this.setOpenViewParam(openViewParam);
        return this;
    }

    /**
     * <B>PAGEURL</B>&nbsp;页面路径，应用功能类型为【打开HTML页面】时指定打开的页面路径
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_PAGEURL = "pageurl";

    /**
     * 设置 页面路径，详细说明：{@link #FIELD_PAGEURL}
     * 
     * @param pageUrl
     * 
     */
    @JsonProperty(FIELD_PAGEURL)
    public void setPageUrl(String pageUrl){
        this.set(FIELD_PAGEURL, pageUrl);
    }
    
    /**
     * 获取 页面路径  
     * @return
     */
    @JsonIgnore
    public String getPageUrl(){
        Object objValue = this.get(FIELD_PAGEURL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 页面路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPageUrlDirty(){
        if(this.contains(FIELD_PAGEURL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 页面路径
     */
    @JsonIgnore
    public void resetPageUrl(){
        this.reset(FIELD_PAGEURL);
    }

    /**
     * 设置 页面路径，详细说明：{@link #FIELD_PAGEURL}
     * <P>
     * 等同 {@link #setPageUrl}
     * @param pageUrl
     */
    @JsonIgnore
    public PSAppFunc pageurl(String pageUrl){
        this.setPageUrl(pageUrl);
        return this;
    }

    /**
     * <B>PREDEFINEDTYPE</B>&nbsp;预定义类型
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_PREDEFINEDTYPE = "predefinedtype";

    /**
     * 设置 预定义类型
     * 
     * @param predefinedType
     * 
     */
    @JsonProperty(FIELD_PREDEFINEDTYPE)
    public void setPredefinedType(String predefinedType){
        this.set(FIELD_PREDEFINEDTYPE, predefinedType);
    }
    
    /**
     * 获取 预定义类型  
     * @return
     */
    @JsonIgnore
    public String getPredefinedType(){
        Object objValue = this.get(FIELD_PREDEFINEDTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预定义类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPredefinedTypeDirty(){
        if(this.contains(FIELD_PREDEFINEDTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预定义类型
     */
    @JsonIgnore
    public void resetPredefinedType(){
        this.reset(FIELD_PREDEFINEDTYPE);
    }

    /**
     * 设置 预定义类型
     * <P>
     * 等同 {@link #setPredefinedType}
     * @param predefinedType
     */
    @JsonIgnore
    public PSAppFunc predefinedtype(String predefinedType){
        this.setPredefinedType(predefinedType);
        return this;
    }

    /**
     * <B>PREDEFINEDTYPEPARAM</B>&nbsp;预定义类型参数
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PREDEFINEDTYPEPARAM = "predefinedtypeparam";

    /**
     * 设置 预定义类型参数
     * 
     * @param predefinedTypeParam
     * 
     */
    @JsonProperty(FIELD_PREDEFINEDTYPEPARAM)
    public void setPredefinedTypeParam(String predefinedTypeParam){
        this.set(FIELD_PREDEFINEDTYPEPARAM, predefinedTypeParam);
    }
    
    /**
     * 获取 预定义类型参数  
     * @return
     */
    @JsonIgnore
    public String getPredefinedTypeParam(){
        Object objValue = this.get(FIELD_PREDEFINEDTYPEPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预定义类型参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPredefinedTypeParamDirty(){
        if(this.contains(FIELD_PREDEFINEDTYPEPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预定义类型参数
     */
    @JsonIgnore
    public void resetPredefinedTypeParam(){
        this.reset(FIELD_PREDEFINEDTYPEPARAM);
    }

    /**
     * 设置 预定义类型参数
     * <P>
     * 等同 {@link #setPredefinedTypeParam}
     * @param predefinedTypeParam
     */
    @JsonIgnore
    public PSAppFunc predefinedtypeparam(String predefinedTypeParam){
        this.setPredefinedTypeParam(predefinedTypeParam);
        return this;
    }

    /**
     * <B>PSAPPFUNCID</B>&nbsp;应用功能标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSAPPFUNCID = "psappfuncid";

    /**
     * 设置 应用功能标识
     * 
     * @param pSAppFuncId
     * 
     */
    @JsonProperty(FIELD_PSAPPFUNCID)
    public void setPSAppFuncId(String pSAppFuncId){
        this.set(FIELD_PSAPPFUNCID, pSAppFuncId);
    }
    
    /**
     * 获取 应用功能标识  
     * @return
     */
    @JsonIgnore
    public String getPSAppFuncId(){
        Object objValue = this.get(FIELD_PSAPPFUNCID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用功能标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppFuncIdDirty(){
        if(this.contains(FIELD_PSAPPFUNCID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用功能标识
     */
    @JsonIgnore
    public void resetPSAppFuncId(){
        this.reset(FIELD_PSAPPFUNCID);
    }

    /**
     * 设置 应用功能标识
     * <P>
     * 等同 {@link #setPSAppFuncId}
     * @param pSAppFuncId
     */
    @JsonIgnore
    public PSAppFunc psappfuncid(String pSAppFuncId){
        this.setPSAppFuncId(pSAppFuncId);
        return this;
    }

    /**
     * <B>PSAPPFUNCNAME</B>&nbsp;应用功能名称，指定应用功能的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSAPPFUNCNAME = "psappfuncname";

    /**
     * 设置 应用功能名称，详细说明：{@link #FIELD_PSAPPFUNCNAME}
     * 
     * @param pSAppFuncName
     * 
     */
    @JsonProperty(FIELD_PSAPPFUNCNAME)
    public void setPSAppFuncName(String pSAppFuncName){
        this.set(FIELD_PSAPPFUNCNAME, pSAppFuncName);
    }
    
    /**
     * 获取 应用功能名称  
     * @return
     */
    @JsonIgnore
    public String getPSAppFuncName(){
        Object objValue = this.get(FIELD_PSAPPFUNCNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用功能名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppFuncNameDirty(){
        if(this.contains(FIELD_PSAPPFUNCNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用功能名称
     */
    @JsonIgnore
    public void resetPSAppFuncName(){
        this.reset(FIELD_PSAPPFUNCNAME);
    }

    /**
     * 设置 应用功能名称，详细说明：{@link #FIELD_PSAPPFUNCNAME}
     * <P>
     * 等同 {@link #setPSAppFuncName}
     * @param pSAppFuncName
     */
    @JsonIgnore
    public PSAppFunc psappfuncname(String pSAppFuncName){
        this.setPSAppFuncName(pSAppFuncName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSAppFuncName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSAppFuncName(strName);
    }

    @JsonIgnore
    public PSAppFunc name(String strName){
        this.setPSAppFuncName(strName);
        return this;
    }

    /**
     * <B>PSAPPDATAENTITYID</B>&nbsp;应用实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSAppDataEntity} 
     */
    public final static String FIELD_PSAPPDATAENTITYID = "psappdataentityid";

    /**
     * 设置 应用实体
     * 
     * @param pSAppDataEntityId
     * 
     */
    @JsonProperty(FIELD_PSAPPDATAENTITYID)
    public void setPSAppDataEntityId(String pSAppDataEntityId){
        this.set(FIELD_PSAPPDATAENTITYID, pSAppDataEntityId);
        //属性名称与代码标识不一致，设置属性名称
        this.set("psapplocaldeid", pSAppDataEntityId);
    }
    
    /**
     * 获取 应用实体  
     * @return
     */
    @JsonIgnore
    public String getPSAppDataEntityId(){
        Object objValue = this.get(FIELD_PSAPPDATAENTITYID);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("psapplocaldeid");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 应用实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppDataEntityIdDirty(){
        if(this.contains(FIELD_PSAPPDATAENTITYID)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("psapplocaldeid")){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用实体
     */
    @JsonIgnore
    public void resetPSAppDataEntityId(){
        this.reset(FIELD_PSAPPDATAENTITYID);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("psapplocaldeid");
    }

    /**
     * 设置 应用实体
     * <P>
     * 等同 {@link #setPSAppDataEntityId}
     * @param pSAppDataEntityId
     */
    @JsonIgnore
    public PSAppFunc psappdataentityid(String pSAppDataEntityId){
        this.setPSAppDataEntityId(pSAppDataEntityId);
        return this;
    }

    /**
     * 设置 应用实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSAppDataEntityId}
     * @param pSAppDataEntity 引用对象
     */
    @JsonIgnore
    public PSAppFunc psappdataentityid(PSAppDataEntity pSAppDataEntity){
        if(pSAppDataEntity == null){
            this.setPSAppDataEntityId(null);
            this.setPSAppDataEntityName(null);
            this.setPSDEId(null);
        }
        else{
            this.setPSAppDataEntityId(pSAppDataEntity.getPSAppDataEntityId());
            this.setPSAppDataEntityName(pSAppDataEntity.getPSAppDataEntityName());
            this.setPSDEId(pSAppDataEntity.getPSDEId());
        }
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSAppLocalDEId(){
        return this.getPSAppDataEntityId();
    }

    @JsonIgnore
    @Deprecated        
    public void setPSAppLocalDEId(String pSAppLocalDEId){
        this.setPSAppDataEntityId(pSAppLocalDEId);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSAppLocalDEIdDirty(){
        return this.isPSAppDataEntityIdDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSAppLocalDEId(){
        this.resetPSAppDataEntityId();
    }

    /**
     * <B>PSAPPDATAENTITYNAME</B>&nbsp;应用实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSAPPDATAENTITYID}
     */
    public final static String FIELD_PSAPPDATAENTITYNAME = "psappdataentityname";

    /**
     * 设置 应用实体
     * 
     * @param pSAppDataEntityName
     * 
     */
    @JsonProperty(FIELD_PSAPPDATAENTITYNAME)
    public void setPSAppDataEntityName(String pSAppDataEntityName){
        this.set(FIELD_PSAPPDATAENTITYNAME, pSAppDataEntityName);
        //属性名称与代码标识不一致，设置属性名称
        this.set("psapplocaldename", pSAppDataEntityName);
    }
    
    /**
     * 获取 应用实体  
     * @return
     */
    @JsonIgnore
    public String getPSAppDataEntityName(){
        Object objValue = this.get(FIELD_PSAPPDATAENTITYNAME);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("psapplocaldename");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 应用实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppDataEntityNameDirty(){
        if(this.contains(FIELD_PSAPPDATAENTITYNAME)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("psapplocaldename")){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用实体
     */
    @JsonIgnore
    public void resetPSAppDataEntityName(){
        this.reset(FIELD_PSAPPDATAENTITYNAME);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("psapplocaldename");
    }

    /**
     * 设置 应用实体
     * <P>
     * 等同 {@link #setPSAppDataEntityName}
     * @param pSAppDataEntityName
     */
    @JsonIgnore
    public PSAppFunc psappdataentityname(String pSAppDataEntityName){
        this.setPSAppDataEntityName(pSAppDataEntityName);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSAppLocalDEName(){
        return this.getPSAppDataEntityName();
    }

    @JsonIgnore
    @Deprecated        
    public void setPSAppLocalDEName(String pSAppLocalDEName){
        this.setPSAppDataEntityName(pSAppLocalDEName);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSAppLocalDENameDirty(){
        return this.isPSAppDataEntityNameDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSAppLocalDEName(){
        this.resetPSAppDataEntityName();
    }

    /**
     * <B>PSAPPSUBAPPNAME</B>&nbsp;子应用
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSAPPSUBAPPID}
     */
    public final static String FIELD_PSAPPSUBAPPNAME = "psappsubappname";

    /**
     * 设置 子应用
     * 
     * @param pSAppSubAppName
     * 
     */
    @JsonProperty(FIELD_PSAPPSUBAPPNAME)
    public void setPSAppSubAppName(String pSAppSubAppName){
        this.set(FIELD_PSAPPSUBAPPNAME, pSAppSubAppName);
    }
    
    /**
     * 获取 子应用  
     * @return
     */
    @JsonIgnore
    public String getPSAppSubAppName(){
        Object objValue = this.get(FIELD_PSAPPSUBAPPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 子应用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppSubAppNameDirty(){
        if(this.contains(FIELD_PSAPPSUBAPPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 子应用
     */
    @JsonIgnore
    public void resetPSAppSubAppName(){
        this.reset(FIELD_PSAPPSUBAPPNAME);
    }

    /**
     * 设置 子应用
     * <P>
     * 等同 {@link #setPSAppSubAppName}
     * @param pSAppSubAppName
     */
    @JsonIgnore
    public PSAppFunc psappsubappname(String pSAppSubAppName){
        this.setPSAppSubAppName(pSAppSubAppName);
        return this;
    }

    /**
     * <B>PSAPPVIEWID</B>&nbsp;应用视图，类型为【打开应用视图】时指定打开的应用视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSAppView} 
     */
    public final static String FIELD_PSAPPVIEWID = "psappviewid";

    /**
     * 设置 应用视图，详细说明：{@link #FIELD_PSAPPVIEWID}
     * 
     * @param pSAppViewId
     * 
     */
    @JsonProperty(FIELD_PSAPPVIEWID)
    public void setPSAppViewId(String pSAppViewId){
        this.set(FIELD_PSAPPVIEWID, pSAppViewId);
    }
    
    /**
     * 获取 应用视图  
     * @return
     */
    @JsonIgnore
    public String getPSAppViewId(){
        Object objValue = this.get(FIELD_PSAPPVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppViewIdDirty(){
        if(this.contains(FIELD_PSAPPVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用视图
     */
    @JsonIgnore
    public void resetPSAppViewId(){
        this.reset(FIELD_PSAPPVIEWID);
    }

    /**
     * 设置 应用视图，详细说明：{@link #FIELD_PSAPPVIEWID}
     * <P>
     * 等同 {@link #setPSAppViewId}
     * @param pSAppViewId
     */
    @JsonIgnore
    public PSAppFunc psappviewid(String pSAppViewId){
        this.setPSAppViewId(pSAppViewId);
        return this;
    }

    /**
     * 设置 应用视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSAppViewId}
     * @param pSAppView 引用对象
     */
    @JsonIgnore
    public PSAppFunc psappviewid(PSAppView pSAppView){
        if(pSAppView == null){
            this.setPSAppViewId(null);
            this.setPSAppViewName(null);
        }
        else{
            this.setPSAppViewId(pSAppView.getPSAppViewId());
            this.setPSAppViewName(pSAppView.getPSAppViewName());
        }
        return this;
    }

    /**
     * <B>PSAPPVIEWNAME</B>&nbsp;应用视图，应用功能类型为【打开应用视图】时指定打开的应用视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSAPPVIEWID}
     */
    public final static String FIELD_PSAPPVIEWNAME = "psappviewname";

    /**
     * 设置 应用视图，详细说明：{@link #FIELD_PSAPPVIEWNAME}
     * 
     * @param pSAppViewName
     * 
     */
    @JsonProperty(FIELD_PSAPPVIEWNAME)
    public void setPSAppViewName(String pSAppViewName){
        this.set(FIELD_PSAPPVIEWNAME, pSAppViewName);
    }
    
    /**
     * 获取 应用视图  
     * @return
     */
    @JsonIgnore
    public String getPSAppViewName(){
        Object objValue = this.get(FIELD_PSAPPVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppViewNameDirty(){
        if(this.contains(FIELD_PSAPPVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用视图
     */
    @JsonIgnore
    public void resetPSAppViewName(){
        this.reset(FIELD_PSAPPVIEWNAME);
    }

    /**
     * 设置 应用视图，详细说明：{@link #FIELD_PSAPPVIEWNAME}
     * <P>
     * 等同 {@link #setPSAppViewName}
     * @param pSAppViewName
     */
    @JsonIgnore
    public PSAppFunc psappviewname(String pSAppViewName){
        this.setPSAppViewName(pSAppViewName);
        return this;
    }

    /**
     * <B>PSDEACMODEID</B>&nbsp;实体自填模式，类型为【搜索】`SEARCH`时，指定应用实体自动填充模型作为搜索配置
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEACMode} 
     */
    public final static String FIELD_PSDEACMODEID = "psdeacmodeid";

    /**
     * 设置 实体自填模式，详细说明：{@link #FIELD_PSDEACMODEID}
     * 
     * @param pSDEACModeId
     * 
     */
    @JsonProperty(FIELD_PSDEACMODEID)
    public void setPSDEACModeId(String pSDEACModeId){
        this.set(FIELD_PSDEACMODEID, pSDEACModeId);
    }
    
    /**
     * 获取 实体自填模式  
     * @return
     */
    @JsonIgnore
    public String getPSDEACModeId(){
        Object objValue = this.get(FIELD_PSDEACMODEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体自填模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEACModeIdDirty(){
        if(this.contains(FIELD_PSDEACMODEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体自填模式
     */
    @JsonIgnore
    public void resetPSDEACModeId(){
        this.reset(FIELD_PSDEACMODEID);
    }

    /**
     * 设置 实体自填模式，详细说明：{@link #FIELD_PSDEACMODEID}
     * <P>
     * 等同 {@link #setPSDEACModeId}
     * @param pSDEACModeId
     */
    @JsonIgnore
    public PSAppFunc psdeacmodeid(String pSDEACModeId){
        this.setPSDEACModeId(pSDEACModeId);
        return this;
    }

    /**
     * 设置 实体自填模式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEACModeId}
     * @param pSDEACMode 引用对象
     */
    @JsonIgnore
    public PSAppFunc psdeacmodeid(PSDEACMode pSDEACMode){
        if(pSDEACMode == null){
            this.setPSDEACModeId(null);
            this.setPSDEACModeName(null);
        }
        else{
            this.setPSDEACModeId(pSDEACMode.getPSDEACModeId());
            this.setPSDEACModeName(pSDEACMode.getPSDEACModeName());
        }
        return this;
    }

    /**
     * <B>PSDEACMODENAME</B>&nbsp;实体自填模式，类型为【搜索】`SEARCH`时，指定应用实体自动填充模型作为搜索配置
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEACMODEID}
     */
    public final static String FIELD_PSDEACMODENAME = "psdeacmodename";

    /**
     * 设置 实体自填模式，详细说明：{@link #FIELD_PSDEACMODENAME}
     * 
     * @param pSDEACModeName
     * 
     */
    @JsonProperty(FIELD_PSDEACMODENAME)
    public void setPSDEACModeName(String pSDEACModeName){
        this.set(FIELD_PSDEACMODENAME, pSDEACModeName);
    }
    
    /**
     * 获取 实体自填模式  
     * @return
     */
    @JsonIgnore
    public String getPSDEACModeName(){
        Object objValue = this.get(FIELD_PSDEACMODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体自填模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEACModeNameDirty(){
        if(this.contains(FIELD_PSDEACMODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体自填模式
     */
    @JsonIgnore
    public void resetPSDEACModeName(){
        this.reset(FIELD_PSDEACMODENAME);
    }

    /**
     * 设置 实体自填模式，详细说明：{@link #FIELD_PSDEACMODENAME}
     * <P>
     * 等同 {@link #setPSDEACModeName}
     * @param pSDEACModeName
     */
    @JsonIgnore
    public PSAppFunc psdeacmodename(String pSDEACModeName){
        this.setPSDEACModeName(pSDEACModeName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;PSDEID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSAPPDATAENTITYID}
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
    public PSAppFunc psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * <B>PSDEUIACTIONID</B>&nbsp;界面行为，类型为【界面行为】`UIACTION`时，指定执行的应用实体界面行
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEUIAction} 
     */
    public final static String FIELD_PSDEUIACTIONID = "psdeuiactionid";

    /**
     * 设置 界面行为，详细说明：{@link #FIELD_PSDEUIACTIONID}
     * 
     * @param pSDEUIActionId
     * 
     */
    @JsonProperty(FIELD_PSDEUIACTIONID)
    public void setPSDEUIActionId(String pSDEUIActionId){
        this.set(FIELD_PSDEUIACTIONID, pSDEUIActionId);
    }
    
    /**
     * 获取 界面行为  
     * @return
     */
    @JsonIgnore
    public String getPSDEUIActionId(){
        Object objValue = this.get(FIELD_PSDEUIACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEUIActionIdDirty(){
        if(this.contains(FIELD_PSDEUIACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面行为
     */
    @JsonIgnore
    public void resetPSDEUIActionId(){
        this.reset(FIELD_PSDEUIACTIONID);
    }

    /**
     * 设置 界面行为，详细说明：{@link #FIELD_PSDEUIACTIONID}
     * <P>
     * 等同 {@link #setPSDEUIActionId}
     * @param pSDEUIActionId
     */
    @JsonIgnore
    public PSAppFunc psdeuiactionid(String pSDEUIActionId){
        this.setPSDEUIActionId(pSDEUIActionId);
        return this;
    }

    /**
     * 设置 界面行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEUIActionId}
     * @param pSDEUIAction 引用对象
     */
    @JsonIgnore
    public PSAppFunc psdeuiactionid(PSDEUIAction pSDEUIAction){
        if(pSDEUIAction == null){
            this.setPSDEUIActionId(null);
            this.setPSDEUIActionName(null);
        }
        else{
            this.setPSDEUIActionId(pSDEUIAction.getPSDEUIActionId());
            this.setPSDEUIActionName(pSDEUIAction.getPSDEUIActionName());
        }
        return this;
    }

    /**
     * <B>PSDEUIACTIONNAME</B>&nbsp;界面行为，类型为【界面行为】`UIACTION`时，指定执行的应用实体界面行
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEUIACTIONID}
     */
    public final static String FIELD_PSDEUIACTIONNAME = "psdeuiactionname";

    /**
     * 设置 界面行为，详细说明：{@link #FIELD_PSDEUIACTIONNAME}
     * 
     * @param pSDEUIActionName
     * 
     */
    @JsonProperty(FIELD_PSDEUIACTIONNAME)
    public void setPSDEUIActionName(String pSDEUIActionName){
        this.set(FIELD_PSDEUIACTIONNAME, pSDEUIActionName);
    }
    
    /**
     * 获取 界面行为  
     * @return
     */
    @JsonIgnore
    public String getPSDEUIActionName(){
        Object objValue = this.get(FIELD_PSDEUIACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEUIActionNameDirty(){
        if(this.contains(FIELD_PSDEUIACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面行为
     */
    @JsonIgnore
    public void resetPSDEUIActionName(){
        this.reset(FIELD_PSDEUIACTIONNAME);
    }

    /**
     * 设置 界面行为，详细说明：{@link #FIELD_PSDEUIACTIONNAME}
     * <P>
     * 等同 {@link #setPSDEUIActionName}
     * @param pSDEUIActionName
     */
    @JsonIgnore
    public PSAppFunc psdeuiactionname(String pSDEUIActionName){
        this.setPSDEUIActionName(pSDEUIActionName);
        return this;
    }

    /**
     * <B>PSPDTAPPFUNCID</B>&nbsp;预置应用功能，应用功能类型为【预置应用功能】时指定平台的预置应用功能
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSPDTAPPFUNCID = "pspdtappfuncid";

    /**
     * 设置 预置应用功能，详细说明：{@link #FIELD_PSPDTAPPFUNCID}
     * 
     * @param pSPDTAppFuncId
     * 
     */
    @JsonProperty(FIELD_PSPDTAPPFUNCID)
    public void setPSPDTAppFuncId(String pSPDTAppFuncId){
        this.set(FIELD_PSPDTAPPFUNCID, pSPDTAppFuncId);
    }
    
    /**
     * 获取 预置应用功能  
     * @return
     */
    @JsonIgnore
    public String getPSPDTAppFuncId(){
        Object objValue = this.get(FIELD_PSPDTAPPFUNCID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预置应用功能 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSPDTAppFuncIdDirty(){
        if(this.contains(FIELD_PSPDTAPPFUNCID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预置应用功能
     */
    @JsonIgnore
    public void resetPSPDTAppFuncId(){
        this.reset(FIELD_PSPDTAPPFUNCID);
    }

    /**
     * 设置 预置应用功能，详细说明：{@link #FIELD_PSPDTAPPFUNCID}
     * <P>
     * 等同 {@link #setPSPDTAppFuncId}
     * @param pSPDTAppFuncId
     */
    @JsonIgnore
    public PSAppFunc pspdtappfuncid(String pSPDTAppFuncId){
        this.setPSPDTAppFuncId(pSPDTAppFuncId);
        return this;
    }

    /**
     * <B>PSPDTAPPFUNCNAME</B>&nbsp;预置应用功能，应用功能类型为【预置应用功能】时指定平台的预置应用功能
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSPDTAPPFUNCID}
     */
    public final static String FIELD_PSPDTAPPFUNCNAME = "pspdtappfuncname";

    /**
     * 设置 预置应用功能，详细说明：{@link #FIELD_PSPDTAPPFUNCNAME}
     * 
     * @param pSPDTAppFuncName
     * 
     */
    @JsonProperty(FIELD_PSPDTAPPFUNCNAME)
    public void setPSPDTAppFuncName(String pSPDTAppFuncName){
        this.set(FIELD_PSPDTAPPFUNCNAME, pSPDTAppFuncName);
    }
    
    /**
     * 获取 预置应用功能  
     * @return
     */
    @JsonIgnore
    public String getPSPDTAppFuncName(){
        Object objValue = this.get(FIELD_PSPDTAPPFUNCNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预置应用功能 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSPDTAppFuncNameDirty(){
        if(this.contains(FIELD_PSPDTAPPFUNCNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预置应用功能
     */
    @JsonIgnore
    public void resetPSPDTAppFuncName(){
        this.reset(FIELD_PSPDTAPPFUNCNAME);
    }

    /**
     * 设置 预置应用功能，详细说明：{@link #FIELD_PSPDTAPPFUNCNAME}
     * <P>
     * 等同 {@link #setPSPDTAppFuncName}
     * @param pSPDTAppFuncName
     */
    @JsonIgnore
    public PSAppFunc pspdtappfuncname(String pSPDTAppFuncName){
        this.setPSPDTAppFuncName(pSPDTAppFuncName);
        return this;
    }

    /**
     * <B>PSSYSAPPID</B>&nbsp;系统应用，指定应用功能的所属的前端应用
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysApp} 
     */
    public final static String FIELD_PSSYSAPPID = "pssysappid";

    /**
     * 设置 系统应用，详细说明：{@link #FIELD_PSSYSAPPID}
     * 
     * @param pSSysAppId
     * 
     */
    @JsonProperty(FIELD_PSSYSAPPID)
    public void setPSSysAppId(String pSSysAppId){
        this.set(FIELD_PSSYSAPPID, pSSysAppId);
    }
    
    /**
     * 获取 系统应用  
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
     * 判断 系统应用 是否指定值，包括空值
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
     * 重置 系统应用
     */
    @JsonIgnore
    public void resetPSSysAppId(){
        this.reset(FIELD_PSSYSAPPID);
    }

    /**
     * 设置 系统应用，详细说明：{@link #FIELD_PSSYSAPPID}
     * <P>
     * 等同 {@link #setPSSysAppId}
     * @param pSSysAppId
     */
    @JsonIgnore
    public PSAppFunc pssysappid(String pSSysAppId){
        this.setPSSysAppId(pSSysAppId);
        return this;
    }

    /**
     * 设置 系统应用，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysAppId}
     * @param pSSysApp 引用对象
     */
    @JsonIgnore
    public PSAppFunc pssysappid(PSSysApp pSSysApp){
        if(pSSysApp == null){
            this.setPSSysAppId(null);
            this.setPSSysAppName(null);
        }
        else{
            this.setPSSysAppId(pSSysApp.getPSSysAppId());
            this.setPSSysAppName(pSSysApp.getPSSysAppName());
        }
        return this;
    }

    /**
     * <B>PSSYSAPPNAME</B>&nbsp;前端应用，指定应用功能的所属的前端应用
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSAPPID}
     */
    public final static String FIELD_PSSYSAPPNAME = "pssysappname";

    /**
     * 设置 前端应用，详细说明：{@link #FIELD_PSSYSAPPNAME}
     * 
     * @param pSSysAppName
     * 
     */
    @JsonProperty(FIELD_PSSYSAPPNAME)
    public void setPSSysAppName(String pSSysAppName){
        this.set(FIELD_PSSYSAPPNAME, pSSysAppName);
    }
    
    /**
     * 获取 前端应用  
     * @return
     */
    @JsonIgnore
    public String getPSSysAppName(){
        Object objValue = this.get(FIELD_PSSYSAPPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端应用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysAppNameDirty(){
        if(this.contains(FIELD_PSSYSAPPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端应用
     */
    @JsonIgnore
    public void resetPSSysAppName(){
        this.reset(FIELD_PSSYSAPPNAME);
    }

    /**
     * 设置 前端应用，详细说明：{@link #FIELD_PSSYSAPPNAME}
     * <P>
     * 等同 {@link #setPSSysAppName}
     * @param pSSysAppName
     */
    @JsonIgnore
    public PSAppFunc pssysappname(String pSSysAppName){
        this.setPSSysAppName(pSSysAppName);
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
    public PSAppFunc pssysreqitemid(String pSSysReqItemId){
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
    public PSAppFunc pssysreqitemid(PSSysReqItem pSSysReqItem){
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
    public PSAppFunc pssysreqitemname(String pSSysReqItemName){
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    /**
     * <B>SYSTEMFLAG</B>&nbsp;系统使用
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_SYSTEMFLAG = "systemflag";

    /**
     * 设置 系统使用
     * 
     * @param systemFlag
     * 
     */
    @JsonProperty(FIELD_SYSTEMFLAG)
    public void setSystemFlag(Integer systemFlag){
        this.set(FIELD_SYSTEMFLAG, systemFlag);
    }
    
    /**
     * 获取 系统使用  
     * @return
     */
    @JsonIgnore
    public Integer getSystemFlag(){
        Object objValue = this.get(FIELD_SYSTEMFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 系统使用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSystemFlagDirty(){
        if(this.contains(FIELD_SYSTEMFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统使用
     */
    @JsonIgnore
    public void resetSystemFlag(){
        this.reset(FIELD_SYSTEMFLAG);
    }

    /**
     * 设置 系统使用
     * <P>
     * 等同 {@link #setSystemFlag}
     * @param systemFlag
     */
    @JsonIgnore
    public PSAppFunc systemflag(Integer systemFlag){
        this.setSystemFlag(systemFlag);
        return this;
    }

     /**
     * 设置 系统使用
     * <P>
     * 等同 {@link #setSystemFlag}
     * @param systemFlag
     */
    @JsonIgnore
    public PSAppFunc systemflag(Boolean systemFlag){
        if(systemFlag == null){
            this.setSystemFlag(null);
        }
        else{
            this.setSystemFlag(systemFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>TIPPSLANRESID</B>&nbsp;提示语言资源，指定应用功能的提示信息的多语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_TIPPSLANRESID = "tippslanresid";

    /**
     * 设置 提示语言资源，详细说明：{@link #FIELD_TIPPSLANRESID}
     * 
     * @param tipPSLanResId
     * 
     */
    @JsonProperty(FIELD_TIPPSLANRESID)
    public void setTipPSLanResId(String tipPSLanResId){
        this.set(FIELD_TIPPSLANRESID, tipPSLanResId);
    }
    
    /**
     * 获取 提示语言资源  
     * @return
     */
    @JsonIgnore
    public String getTipPSLanResId(){
        Object objValue = this.get(FIELD_TIPPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 提示语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTipPSLanResIdDirty(){
        if(this.contains(FIELD_TIPPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 提示语言资源
     */
    @JsonIgnore
    public void resetTipPSLanResId(){
        this.reset(FIELD_TIPPSLANRESID);
    }

    /**
     * 设置 提示语言资源，详细说明：{@link #FIELD_TIPPSLANRESID}
     * <P>
     * 等同 {@link #setTipPSLanResId}
     * @param tipPSLanResId
     */
    @JsonIgnore
    public PSAppFunc tippslanresid(String tipPSLanResId){
        this.setTipPSLanResId(tipPSLanResId);
        return this;
    }

    /**
     * 设置 提示语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTipPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSAppFunc tippslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setTipPSLanResId(null);
            this.setTipPSLanResName(null);
        }
        else{
            this.setTipPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setTipPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>TIPPSLANRESNAME</B>&nbsp;提示语言资源，指定应用功能的提示信息的多语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TIPPSLANRESID}
     */
    public final static String FIELD_TIPPSLANRESNAME = "tippslanresname";

    /**
     * 设置 提示语言资源，详细说明：{@link #FIELD_TIPPSLANRESNAME}
     * 
     * @param tipPSLanResName
     * 
     */
    @JsonProperty(FIELD_TIPPSLANRESNAME)
    public void setTipPSLanResName(String tipPSLanResName){
        this.set(FIELD_TIPPSLANRESNAME, tipPSLanResName);
    }
    
    /**
     * 获取 提示语言资源  
     * @return
     */
    @JsonIgnore
    public String getTipPSLanResName(){
        Object objValue = this.get(FIELD_TIPPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 提示语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTipPSLanResNameDirty(){
        if(this.contains(FIELD_TIPPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 提示语言资源
     */
    @JsonIgnore
    public void resetTipPSLanResName(){
        this.reset(FIELD_TIPPSLANRESNAME);
    }

    /**
     * 设置 提示语言资源，详细说明：{@link #FIELD_TIPPSLANRESNAME}
     * <P>
     * 等同 {@link #setTipPSLanResName}
     * @param tipPSLanResName
     */
    @JsonIgnore
    public PSAppFunc tippslanresname(String tipPSLanResName){
        this.setTipPSLanResName(tipPSLanResName);
        return this;
    }

    /**
     * <B>TOOLTIPINFO</B>&nbsp;提示信息，指定应用功能的提示信息
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_TOOLTIPINFO = "tooltipinfo";

    /**
     * 设置 提示信息，详细说明：{@link #FIELD_TOOLTIPINFO}
     * 
     * @param tooltipInfo
     * 
     */
    @JsonProperty(FIELD_TOOLTIPINFO)
    public void setTooltipInfo(String tooltipInfo){
        this.set(FIELD_TOOLTIPINFO, tooltipInfo);
    }
    
    /**
     * 获取 提示信息  
     * @return
     */
    @JsonIgnore
    public String getTooltipInfo(){
        Object objValue = this.get(FIELD_TOOLTIPINFO);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 提示信息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTooltipInfoDirty(){
        if(this.contains(FIELD_TOOLTIPINFO)){
            return true;
        }
        return false;
    }

    /**
     * 重置 提示信息
     */
    @JsonIgnore
    public void resetTooltipInfo(){
        this.reset(FIELD_TOOLTIPINFO);
    }

    /**
     * 设置 提示信息，详细说明：{@link #FIELD_TOOLTIPINFO}
     * <P>
     * 等同 {@link #setTooltipInfo}
     * @param tooltipInfo
     */
    @JsonIgnore
    public PSAppFunc tooltipinfo(String tooltipInfo){
        this.setTooltipInfo(tooltipInfo);
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
    public PSAppFunc updatedate(String updateDate){
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
    public PSAppFunc updateman(String updateMan){
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
    public PSAppFunc usercat(String userCat){
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
    public PSAppFunc usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat.value);
        }
        return this;
    }

    /**
     * <B>USERDATA</B>&nbsp;功能数据，指定应用功能的数据
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_USERDATA = "userdata";

    /**
     * 设置 功能数据，详细说明：{@link #FIELD_USERDATA}
     * 
     * @param userData
     * 
     */
    @JsonProperty(FIELD_USERDATA)
    public void setUserData(String userData){
        this.set(FIELD_USERDATA, userData);
    }
    
    /**
     * 获取 功能数据  
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
     * 判断 功能数据 是否指定值，包括空值
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
     * 重置 功能数据
     */
    @JsonIgnore
    public void resetUserData(){
        this.reset(FIELD_USERDATA);
    }

    /**
     * 设置 功能数据，详细说明：{@link #FIELD_USERDATA}
     * <P>
     * 等同 {@link #setUserData}
     * @param userData
     */
    @JsonIgnore
    public PSAppFunc userdata(String userData){
        this.setUserData(userData);
        return this;
    }

    /**
     * <B>USERDATA2</B>&nbsp;功能数据2，指定应用功能的数据2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_USERDATA2 = "userdata2";

    /**
     * 设置 功能数据2，详细说明：{@link #FIELD_USERDATA2}
     * 
     * @param userData2
     * 
     */
    @JsonProperty(FIELD_USERDATA2)
    public void setUserData2(String userData2){
        this.set(FIELD_USERDATA2, userData2);
    }
    
    /**
     * 获取 功能数据2  
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
     * 判断 功能数据2 是否指定值，包括空值
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
     * 重置 功能数据2
     */
    @JsonIgnore
    public void resetUserData2(){
        this.reset(FIELD_USERDATA2);
    }

    /**
     * 设置 功能数据2，详细说明：{@link #FIELD_USERDATA2}
     * <P>
     * 等同 {@link #setUserData2}
     * @param userData2
     */
    @JsonIgnore
    public PSAppFunc userdata2(String userData2){
        this.setUserData2(userData2);
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
    public PSAppFunc userparams(String userParams){
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
    public PSAppFunc usertag(String userTag){
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
    public PSAppFunc usertag2(String userTag2){
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
    public PSAppFunc usertag3(String userTag3){
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
    public PSAppFunc usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSAppFuncId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSAppFuncId(strValue);
    }

    @JsonIgnore
    public PSAppFunc id(String strValue){
        this.setPSAppFuncId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSAppFunc){
            PSAppFunc model = (PSAppFunc)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
