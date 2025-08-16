package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSVTRV</B>云平台视图类型关联视图 模型传输对象
 * <P>
 * 
 */
public class PSVTRV extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSVTRV(){
        this.setValidFlag(1);
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
    public PSVTRV createdate(String createDate){
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
    public PSVTRV createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DEFAULTFLAG</B>&nbsp;默认数据
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEFAULTFLAG = "defaultflag";

    /**
     * 设置 默认数据
     * 
     * @param defaultFlag
     * 
     */
    @JsonProperty(FIELD_DEFAULTFLAG)
    public void setDefaultFlag(Integer defaultFlag){
        this.set(FIELD_DEFAULTFLAG, defaultFlag);
    }
    
    /**
     * 获取 默认数据  
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
     * 判断 默认数据 是否指定值，包括空值
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
     * 重置 默认数据
     */
    @JsonIgnore
    public void resetDefaultFlag(){
        this.reset(FIELD_DEFAULTFLAG);
    }

    /**
     * 设置 默认数据
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSVTRV defaultflag(Integer defaultFlag){
        this.setDefaultFlag(defaultFlag);
        return this;
    }

     /**
     * 设置 默认数据
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSVTRV defaultflag(Boolean defaultFlag){
        if(defaultFlag == null){
            this.setDefaultFlag(null);
        }
        else{
            this.setDefaultFlag(defaultFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DEFVIEWTYPE</B>&nbsp;预置视图类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.PredefinedViewType} 
     */
    public final static String FIELD_DEFVIEWTYPE = "defviewtype";

    /**
     * 设置 预置视图类型
     * 
     * @param dEFViewType
     * 
     */
    @JsonProperty(FIELD_DEFVIEWTYPE)
    public void setDEFViewType(String dEFViewType){
        this.set(FIELD_DEFVIEWTYPE, dEFViewType);
    }
    
    /**
     * 获取 预置视图类型  
     * @return
     */
    @JsonIgnore
    public String getDEFViewType(){
        Object objValue = this.get(FIELD_DEFVIEWTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预置视图类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDEFViewTypeDirty(){
        if(this.contains(FIELD_DEFVIEWTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预置视图类型
     */
    @JsonIgnore
    public void resetDEFViewType(){
        this.reset(FIELD_DEFVIEWTYPE);
    }

    /**
     * 设置 预置视图类型
     * <P>
     * 等同 {@link #setDEFViewType}
     * @param dEFViewType
     */
    @JsonIgnore
    public PSVTRV defviewtype(String dEFViewType){
        this.setDEFViewType(dEFViewType);
        return this;
    }

     /**
     * 设置 预置视图类型
     * <P>
     * 等同 {@link #setDEFViewType}
     * @param dEFViewType
     */
    @JsonIgnore
    public PSVTRV defviewtype(net.ibizsys.psmodel.core.util.PSModelEnums.PredefinedViewType dEFViewType){
        if(dEFViewType == null){
            this.setDEFViewType(null);
        }
        else{
            this.setDEFViewType(dEFViewType.value);
        }
        return this;
    }

    /**
     * <B>DYNADEFVIEWTYPE</B>&nbsp;动态预置视图类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.PredefinedViewType} 
     */
    public final static String FIELD_DYNADEFVIEWTYPE = "dynadefviewtype";

    /**
     * 设置 动态预置视图类型
     * 
     * @param dynaDEFViewType
     * 
     */
    @JsonProperty(FIELD_DYNADEFVIEWTYPE)
    public void setDynaDEFViewType(String dynaDEFViewType){
        this.set(FIELD_DYNADEFVIEWTYPE, dynaDEFViewType);
    }
    
    /**
     * 获取 动态预置视图类型  
     * @return
     */
    @JsonIgnore
    public String getDynaDEFViewType(){
        Object objValue = this.get(FIELD_DYNADEFVIEWTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 动态预置视图类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDynaDEFViewTypeDirty(){
        if(this.contains(FIELD_DYNADEFVIEWTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 动态预置视图类型
     */
    @JsonIgnore
    public void resetDynaDEFViewType(){
        this.reset(FIELD_DYNADEFVIEWTYPE);
    }

    /**
     * 设置 动态预置视图类型
     * <P>
     * 等同 {@link #setDynaDEFViewType}
     * @param dynaDEFViewType
     */
    @JsonIgnore
    public PSVTRV dynadefviewtype(String dynaDEFViewType){
        this.setDynaDEFViewType(dynaDEFViewType);
        return this;
    }

     /**
     * 设置 动态预置视图类型
     * <P>
     * 等同 {@link #setDynaDEFViewType}
     * @param dynaDEFViewType
     */
    @JsonIgnore
    public PSVTRV dynadefviewtype(net.ibizsys.psmodel.core.util.PSModelEnums.PredefinedViewType dynaDEFViewType){
        if(dynaDEFViewType == null){
            this.setDynaDEFViewType(null);
        }
        else{
            this.setDynaDEFViewType(dynaDEFViewType.value);
        }
        return this;
    }

    /**
     * <B>ENABLEDYNATOOL</B>&nbsp;支持动态工具
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEDYNATOOL = "enabledynatool";

    /**
     * 设置 支持动态工具
     * 
     * @param enableDynaTool
     * 
     */
    @JsonProperty(FIELD_ENABLEDYNATOOL)
    public void setEnableDynaTool(Integer enableDynaTool){
        this.set(FIELD_ENABLEDYNATOOL, enableDynaTool);
    }
    
    /**
     * 获取 支持动态工具  
     * @return
     */
    @JsonIgnore
    public Integer getEnableDynaTool(){
        Object objValue = this.get(FIELD_ENABLEDYNATOOL);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持动态工具 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableDynaToolDirty(){
        if(this.contains(FIELD_ENABLEDYNATOOL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持动态工具
     */
    @JsonIgnore
    public void resetEnableDynaTool(){
        this.reset(FIELD_ENABLEDYNATOOL);
    }

    /**
     * 设置 支持动态工具
     * <P>
     * 等同 {@link #setEnableDynaTool}
     * @param enableDynaTool
     */
    @JsonIgnore
    public PSVTRV enabledynatool(Integer enableDynaTool){
        this.setEnableDynaTool(enableDynaTool);
        return this;
    }

     /**
     * 设置 支持动态工具
     * <P>
     * 等同 {@link #setEnableDynaTool}
     * @param enableDynaTool
     */
    @JsonIgnore
    public PSVTRV enabledynatool(Boolean enableDynaTool){
        if(enableDynaTool == null){
            this.setEnableDynaTool(null);
        }
        else{
            this.setEnableDynaTool(enableDynaTool?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;中文名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_LOGICNAME = "logicname";

    /**
     * 设置 中文名称
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
     * 设置 中文名称
     * <P>
     * 等同 {@link #setLogicName}
     * @param logicName
     */
    @JsonIgnore
    public PSVTRV logicname(String logicName){
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
    public PSVTRV memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSVIEWTYPEID</B>&nbsp;视图类型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSViewType} 
     */
    public final static String FIELD_PSVIEWTYPEID = "psviewtypeid";

    /**
     * 设置 视图类型
     * 
     * @param pSViewTypeId
     * 
     */
    @JsonProperty(FIELD_PSVIEWTYPEID)
    public void setPSViewTypeId(String pSViewTypeId){
        this.set(FIELD_PSVIEWTYPEID, pSViewTypeId);
    }
    
    /**
     * 获取 视图类型  
     * @return
     */
    @JsonIgnore
    public String getPSViewTypeId(){
        Object objValue = this.get(FIELD_PSVIEWTYPEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSViewTypeIdDirty(){
        if(this.contains(FIELD_PSVIEWTYPEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图类型
     */
    @JsonIgnore
    public void resetPSViewTypeId(){
        this.reset(FIELD_PSVIEWTYPEID);
    }

    /**
     * 设置 视图类型
     * <P>
     * 等同 {@link #setPSViewTypeId}
     * @param pSViewTypeId
     */
    @JsonIgnore
    public PSVTRV psviewtypeid(String pSViewTypeId){
        this.setPSViewTypeId(pSViewTypeId);
        return this;
    }

    /**
     * 设置 视图类型，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSViewTypeId}
     * @param pSViewType 引用对象
     */
    @JsonIgnore
    public PSVTRV psviewtypeid(PSViewType pSViewType){
        if(pSViewType == null){
            this.setPSViewTypeId(null);
            this.setPSViewTypeName(null);
        }
        else{
            this.setPSViewTypeId(pSViewType.getPSViewTypeId());
            this.setPSViewTypeName(pSViewType.getPSViewTypeName());
        }
        return this;
    }

    /**
     * <B>PSVIEWTYPENAME</B>&nbsp;视图类型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSVIEWTYPEID}
     */
    public final static String FIELD_PSVIEWTYPENAME = "psviewtypename";

    /**
     * 设置 视图类型
     * 
     * @param pSViewTypeName
     * 
     */
    @JsonProperty(FIELD_PSVIEWTYPENAME)
    public void setPSViewTypeName(String pSViewTypeName){
        this.set(FIELD_PSVIEWTYPENAME, pSViewTypeName);
    }
    
    /**
     * 获取 视图类型  
     * @return
     */
    @JsonIgnore
    public String getPSViewTypeName(){
        Object objValue = this.get(FIELD_PSVIEWTYPENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSViewTypeNameDirty(){
        if(this.contains(FIELD_PSVIEWTYPENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图类型
     */
    @JsonIgnore
    public void resetPSViewTypeName(){
        this.reset(FIELD_PSVIEWTYPENAME);
    }

    /**
     * 设置 视图类型
     * <P>
     * 等同 {@link #setPSViewTypeName}
     * @param pSViewTypeName
     */
    @JsonIgnore
    public PSVTRV psviewtypename(String pSViewTypeName){
        this.setPSViewTypeName(pSViewTypeName);
        return this;
    }

    /**
     * <B>PSVTRVID</B>&nbsp;云平台视图类型关联视图标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSVTRVID = "psvtrvid";

    /**
     * 设置 云平台视图类型关联视图标识
     * 
     * @param pSVTRVId
     * 
     */
    @JsonProperty(FIELD_PSVTRVID)
    public void setPSVTRVId(String pSVTRVId){
        this.set(FIELD_PSVTRVID, pSVTRVId);
    }
    
    /**
     * 获取 云平台视图类型关联视图标识  
     * @return
     */
    @JsonIgnore
    public String getPSVTRVId(){
        Object objValue = this.get(FIELD_PSVTRVID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 云平台视图类型关联视图标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSVTRVIdDirty(){
        if(this.contains(FIELD_PSVTRVID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 云平台视图类型关联视图标识
     */
    @JsonIgnore
    public void resetPSVTRVId(){
        this.reset(FIELD_PSVTRVID);
    }

    /**
     * 设置 云平台视图类型关联视图标识
     * <P>
     * 等同 {@link #setPSVTRVId}
     * @param pSVTRVId
     */
    @JsonIgnore
    public PSVTRV psvtrvid(String pSVTRVId){
        this.setPSVTRVId(pSVTRVId);
        return this;
    }

    /**
     * <B>PSVTRVNAME</B>&nbsp;视图引用模式
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSVTRVNAME = "psvtrvname";

    /**
     * 设置 视图引用模式
     * 
     * @param pSVTRVName
     * 
     */
    @JsonProperty(FIELD_PSVTRVNAME)
    public void setPSVTRVName(String pSVTRVName){
        this.set(FIELD_PSVTRVNAME, pSVTRVName);
    }
    
    /**
     * 获取 视图引用模式  
     * @return
     */
    @JsonIgnore
    public String getPSVTRVName(){
        Object objValue = this.get(FIELD_PSVTRVNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图引用模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSVTRVNameDirty(){
        if(this.contains(FIELD_PSVTRVNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图引用模式
     */
    @JsonIgnore
    public void resetPSVTRVName(){
        this.reset(FIELD_PSVTRVNAME);
    }

    /**
     * 设置 视图引用模式
     * <P>
     * 等同 {@link #setPSVTRVName}
     * @param pSVTRVName
     */
    @JsonIgnore
    public PSVTRV psvtrvname(String pSVTRVName){
        this.setPSVTRVName(pSVTRVName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSVTRVName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSVTRVName(strName);
    }

    @JsonIgnore
    public PSVTRV name(String strName){
        this.setPSVTRVName(strName);
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
    public PSVTRV updatedate(String updateDate){
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
    public PSVTRV updateman(String updateMan){
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
    public PSVTRV usercat(String userCat){
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
    public PSVTRV usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSVTRV usertag(String userTag){
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
    public PSVTRV usertag2(String userTag2){
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
    public PSVTRV usertag3(String userTag3){
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
    public PSVTRV usertag4(String userTag4){
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
    public PSVTRV validflag(Integer validFlag){
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
    public PSVTRV validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSVTRVId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSVTRVId(strValue);
    }

    @JsonIgnore
    public PSVTRV id(String strValue){
        this.setPSVTRVId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSVTRV){
            PSVTRV model = (PSVTRV)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
