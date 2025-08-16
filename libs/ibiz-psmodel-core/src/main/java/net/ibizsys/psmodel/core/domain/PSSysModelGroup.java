package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSMODELGROUP</B>系统模型组 模型传输对象
 * <P>
 * 模型组解决模块模型的交换、存储问题，模块代码标识在同一个模型域要求具备唯一性，这种情况下在导入外部模型时可能会存在冲突，模型组就可以将导入的外部模型独立在一个模型域中，避免冲突
 */
public class PSSysModelGroup extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysModelGroup(){
    }      

    /**
     * <B>CLSPKGPARAMS</B>&nbsp;类包参数
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_CLSPKGPARAMS = "clspkgparams";

    /**
     * 设置 类包参数
     * 
     * @param clsPkgParams
     * 
     */
    @JsonProperty(FIELD_CLSPKGPARAMS)
    public void setClsPkgParams(String clsPkgParams){
        this.set(FIELD_CLSPKGPARAMS, clsPkgParams);
    }
    
    /**
     * 获取 类包参数  
     * @return
     */
    @JsonIgnore
    public String getClsPkgParams(){
        Object objValue = this.get(FIELD_CLSPKGPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 类包参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isClsPkgParamsDirty(){
        if(this.contains(FIELD_CLSPKGPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 类包参数
     */
    @JsonIgnore
    public void resetClsPkgParams(){
        this.reset(FIELD_CLSPKGPARAMS);
    }

    /**
     * 设置 类包参数
     * <P>
     * 等同 {@link #setClsPkgParams}
     * @param clsPkgParams
     */
    @JsonIgnore
    public PSSysModelGroup clspkgparams(String clsPkgParams){
        this.setClsPkgParams(clsPkgParams);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定系统模型组的代码标识，需要在当前系统中具有唯一性
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
    public PSSysModelGroup codename(String codeName){
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
    public PSSysModelGroup codenamemode(String codeNameMode){
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
    public PSSysModelGroup codenamemode(net.ibizsys.psmodel.core.util.PSModelEnums.CodeNameMode codeNameMode){
        if(codeNameMode == null){
            this.setCodeNameMode(null);
        }
        else{
            this.setCodeNameMode(codeNameMode.value);
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
    public PSSysModelGroup createdate(String createDate){
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
    public PSSysModelGroup createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DTOFORMAT</B>&nbsp;DTO格式化
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_DTOFORMAT = "dtoformat";

    /**
     * 设置 DTO格式化
     * 
     * @param dTOFormat
     * 
     */
    @JsonProperty(FIELD_DTOFORMAT)
    public void setDTOFormat(String dTOFormat){
        this.set(FIELD_DTOFORMAT, dTOFormat);
    }
    
    /**
     * 获取 DTO格式化  
     * @return
     */
    @JsonIgnore
    public String getDTOFormat(){
        Object objValue = this.get(FIELD_DTOFORMAT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 DTO格式化 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDTOFormatDirty(){
        if(this.contains(FIELD_DTOFORMAT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 DTO格式化
     */
    @JsonIgnore
    public void resetDTOFormat(){
        this.reset(FIELD_DTOFORMAT);
    }

    /**
     * 设置 DTO格式化
     * <P>
     * 等同 {@link #setDTOFormat}
     * @param dTOFormat
     */
    @JsonIgnore
    public PSSysModelGroup dtoformat(String dTOFormat){
        this.setDTOFormat(dTOFormat);
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
    public PSSysModelGroup dynainsttag(String dynaInstTag){
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
    public PSSysModelGroup dynainsttag2(String dynaInstTag2){
        this.setDynaInstTag2(dynaInstTag2);
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
    public PSSysModelGroup enablepql(Integer enablePQL){
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
    public PSSysModelGroup enablepql(Boolean enablePQL){
        if(enablePQL == null){
            this.setEnablePQL(null);
        }
        else{
            this.setEnablePQL(enablePQL?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>GROUPPARAMS</B>&nbsp;分组参数
     */
    public final static String FIELD_GROUPPARAMS = "groupparams";

    /**
     * 设置 分组参数
     * 
     * @param groupParams
     * 
     */
    @JsonProperty(FIELD_GROUPPARAMS)
    public void setGroupParams(String groupParams){
        this.set(FIELD_GROUPPARAMS, groupParams);
    }
    
    /**
     * 获取 分组参数  
     * @return
     */
    @JsonIgnore
    public String getGroupParams(){
        Object objValue = this.get(FIELD_GROUPPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupParamsDirty(){
        if(this.contains(FIELD_GROUPPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组参数
     */
    @JsonIgnore
    public void resetGroupParams(){
        this.reset(FIELD_GROUPPARAMS);
    }

    /**
     * 设置 分组参数
     * <P>
     * 等同 {@link #setGroupParams}
     * @param groupParams
     */
    @JsonIgnore
    public PSSysModelGroup groupparams(String groupParams){
        this.setGroupParams(groupParams);
        return this;
    }

    /**
     * <B>GROUPTAG</B>&nbsp;分组标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_GROUPTAG = "grouptag";

    /**
     * 设置 分组标记
     * 
     * @param groupTag
     * 
     */
    @JsonProperty(FIELD_GROUPTAG)
    public void setGroupTag(String groupTag){
        this.set(FIELD_GROUPTAG, groupTag);
    }
    
    /**
     * 获取 分组标记  
     * @return
     */
    @JsonIgnore
    public String getGroupTag(){
        Object objValue = this.get(FIELD_GROUPTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupTagDirty(){
        if(this.contains(FIELD_GROUPTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组标记
     */
    @JsonIgnore
    public void resetGroupTag(){
        this.reset(FIELD_GROUPTAG);
    }

    /**
     * 设置 分组标记
     * <P>
     * 等同 {@link #setGroupTag}
     * @param groupTag
     */
    @JsonIgnore
    public PSSysModelGroup grouptag(String groupTag){
        this.setGroupTag(groupTag);
        return this;
    }

    /**
     * <B>GROUPTAG2</B>&nbsp;分组标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_GROUPTAG2 = "grouptag2";

    /**
     * 设置 分组标记2
     * 
     * @param groupTag2
     * 
     */
    @JsonProperty(FIELD_GROUPTAG2)
    public void setGroupTag2(String groupTag2){
        this.set(FIELD_GROUPTAG2, groupTag2);
    }
    
    /**
     * 获取 分组标记2  
     * @return
     */
    @JsonIgnore
    public String getGroupTag2(){
        Object objValue = this.get(FIELD_GROUPTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupTag2Dirty(){
        if(this.contains(FIELD_GROUPTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组标记2
     */
    @JsonIgnore
    public void resetGroupTag2(){
        this.reset(FIELD_GROUPTAG2);
    }

    /**
     * 设置 分组标记2
     * <P>
     * 等同 {@link #setGroupTag2}
     * @param groupTag2
     */
    @JsonIgnore
    public PSSysModelGroup grouptag2(String groupTag2){
        this.setGroupTag2(groupTag2);
        return this;
    }

    /**
     * <B>GROUPTAG3</B>&nbsp;分组标记3
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_GROUPTAG3 = "grouptag3";

    /**
     * 设置 分组标记3
     * 
     * @param groupTag3
     * 
     */
    @JsonProperty(FIELD_GROUPTAG3)
    public void setGroupTag3(String groupTag3){
        this.set(FIELD_GROUPTAG3, groupTag3);
    }
    
    /**
     * 获取 分组标记3  
     * @return
     */
    @JsonIgnore
    public String getGroupTag3(){
        Object objValue = this.get(FIELD_GROUPTAG3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组标记3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupTag3Dirty(){
        if(this.contains(FIELD_GROUPTAG3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组标记3
     */
    @JsonIgnore
    public void resetGroupTag3(){
        this.reset(FIELD_GROUPTAG3);
    }

    /**
     * 设置 分组标记3
     * <P>
     * 等同 {@link #setGroupTag3}
     * @param groupTag3
     */
    @JsonIgnore
    public PSSysModelGroup grouptag3(String groupTag3){
        this.setGroupTag3(groupTag3);
        return this;
    }

    /**
     * <B>GROUPTAG4</B>&nbsp;分组标记4
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_GROUPTAG4 = "grouptag4";

    /**
     * 设置 分组标记4
     * 
     * @param groupTag4
     * 
     */
    @JsonProperty(FIELD_GROUPTAG4)
    public void setGroupTag4(String groupTag4){
        this.set(FIELD_GROUPTAG4, groupTag4);
    }
    
    /**
     * 获取 分组标记4  
     * @return
     */
    @JsonIgnore
    public String getGroupTag4(){
        Object objValue = this.get(FIELD_GROUPTAG4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组标记4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupTag4Dirty(){
        if(this.contains(FIELD_GROUPTAG4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组标记4
     */
    @JsonIgnore
    public void resetGroupTag4(){
        this.reset(FIELD_GROUPTAG4);
    }

    /**
     * 设置 分组标记4
     * <P>
     * 等同 {@link #setGroupTag4}
     * @param groupTag4
     */
    @JsonIgnore
    public PSSysModelGroup grouptag4(String groupTag4){
        this.setGroupTag4(groupTag4);
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
    public PSSysModelGroup memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PFRTOBJECTREPO</B>&nbsp;前端运行时插件仓库配置
     */
    public final static String FIELD_PFRTOBJECTREPO = "pfrtobjectrepo";

    /**
     * 设置 前端运行时插件仓库配置
     * 
     * @param pFRTObjectRepo
     * 
     */
    @JsonProperty(FIELD_PFRTOBJECTREPO)
    public void setPFRTObjectRepo(String pFRTObjectRepo){
        this.set(FIELD_PFRTOBJECTREPO, pFRTObjectRepo);
    }
    
    /**
     * 获取 前端运行时插件仓库配置  
     * @return
     */
    @JsonIgnore
    public String getPFRTObjectRepo(){
        Object objValue = this.get(FIELD_PFRTOBJECTREPO);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端运行时插件仓库配置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPFRTObjectRepoDirty(){
        if(this.contains(FIELD_PFRTOBJECTREPO)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端运行时插件仓库配置
     */
    @JsonIgnore
    public void resetPFRTObjectRepo(){
        this.reset(FIELD_PFRTOBJECTREPO);
    }

    /**
     * 设置 前端运行时插件仓库配置
     * <P>
     * 等同 {@link #setPFRTObjectRepo}
     * @param pFRTObjectRepo
     */
    @JsonIgnore
    public PSSysModelGroup pfrtobjectrepo(String pFRTObjectRepo){
        this.setPFRTObjectRepo(pFRTObjectRepo);
        return this;
    }

    /**
     * <B>PKGCODENAME</B>&nbsp;代码包名
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PKGCODENAME = "pkgcodename";

    /**
     * 设置 代码包名
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
     * 设置 代码包名
     * <P>
     * 等同 {@link #setPKGCodeName}
     * @param pKGCodeName
     */
    @JsonIgnore
    public PSSysModelGroup pkgcodename(String pKGCodeName){
        this.setPKGCodeName(pKGCodeName);
        return this;
    }

    /**
     * <B>PSSYSMODELGROUPID</B>&nbsp;系统模型组标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSMODELGROUPID = "pssysmodelgroupid";

    /**
     * 设置 系统模型组标识
     * 
     * @param pSSysModelGroupId
     * 
     */
    @JsonProperty(FIELD_PSSYSMODELGROUPID)
    public void setPSSysModelGroupId(String pSSysModelGroupId){
        this.set(FIELD_PSSYSMODELGROUPID, pSSysModelGroupId);
    }
    
    /**
     * 获取 系统模型组标识  
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
     * 判断 系统模型组标识 是否指定值，包括空值
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
     * 重置 系统模型组标识
     */
    @JsonIgnore
    public void resetPSSysModelGroupId(){
        this.reset(FIELD_PSSYSMODELGROUPID);
    }

    /**
     * 设置 系统模型组标识
     * <P>
     * 等同 {@link #setPSSysModelGroupId}
     * @param pSSysModelGroupId
     */
    @JsonIgnore
    public PSSysModelGroup pssysmodelgroupid(String pSSysModelGroupId){
        this.setPSSysModelGroupId(pSSysModelGroupId);
        return this;
    }

    /**
     * <B>PSSYSMODELGROUPNAME</B>&nbsp;系统模型组名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSMODELGROUPNAME = "pssysmodelgroupname";

    /**
     * 设置 系统模型组名称
     * 
     * @param pSSysModelGroupName
     * 
     */
    @JsonProperty(FIELD_PSSYSMODELGROUPNAME)
    public void setPSSysModelGroupName(String pSSysModelGroupName){
        this.set(FIELD_PSSYSMODELGROUPNAME, pSSysModelGroupName);
    }
    
    /**
     * 获取 系统模型组名称  
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
     * 判断 系统模型组名称 是否指定值，包括空值
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
     * 重置 系统模型组名称
     */
    @JsonIgnore
    public void resetPSSysModelGroupName(){
        this.reset(FIELD_PSSYSMODELGROUPNAME);
    }

    /**
     * 设置 系统模型组名称
     * <P>
     * 等同 {@link #setPSSysModelGroupName}
     * @param pSSysModelGroupName
     */
    @JsonIgnore
    public PSSysModelGroup pssysmodelgroupname(String pSSysModelGroupName){
        this.setPSSysModelGroupName(pSSysModelGroupName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysModelGroupName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysModelGroupName(strName);
    }

    @JsonIgnore
    public PSSysModelGroup name(String strName){
        this.setPSSysModelGroupName(strName);
        return this;
    }

    /**
     * <B>RUNTIMETYPE</B>&nbsp;运行时类型
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_RUNTIMETYPE = "runtimetype";

    /**
     * 设置 运行时类型
     * 
     * @param runtimeType
     * 
     */
    @JsonProperty(FIELD_RUNTIMETYPE)
    public void setRuntimeType(String runtimeType){
        this.set(FIELD_RUNTIMETYPE, runtimeType);
    }
    
    /**
     * 获取 运行时类型  
     * @return
     */
    @JsonIgnore
    public String getRuntimeType(){
        Object objValue = this.get(FIELD_RUNTIMETYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 运行时类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRuntimeTypeDirty(){
        if(this.contains(FIELD_RUNTIMETYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 运行时类型
     */
    @JsonIgnore
    public void resetRuntimeType(){
        this.reset(FIELD_RUNTIMETYPE);
    }

    /**
     * 设置 运行时类型
     * <P>
     * 等同 {@link #setRuntimeType}
     * @param runtimeType
     */
    @JsonIgnore
    public PSSysModelGroup runtimetype(String runtimeType){
        this.setRuntimeType(runtimeType);
        return this;
    }

    /**
     * <B>SFRTOBJECTREPO</B>&nbsp;后台运行时插件仓库配置
     */
    public final static String FIELD_SFRTOBJECTREPO = "sfrtobjectrepo";

    /**
     * 设置 后台运行时插件仓库配置
     * 
     * @param sFRTObjectRepo
     * 
     */
    @JsonProperty(FIELD_SFRTOBJECTREPO)
    public void setSFRTObjectRepo(String sFRTObjectRepo){
        this.set(FIELD_SFRTOBJECTREPO, sFRTObjectRepo);
    }
    
    /**
     * 获取 后台运行时插件仓库配置  
     * @return
     */
    @JsonIgnore
    public String getSFRTObjectRepo(){
        Object objValue = this.get(FIELD_SFRTOBJECTREPO);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台运行时插件仓库配置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSFRTObjectRepoDirty(){
        if(this.contains(FIELD_SFRTOBJECTREPO)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台运行时插件仓库配置
     */
    @JsonIgnore
    public void resetSFRTObjectRepo(){
        this.reset(FIELD_SFRTOBJECTREPO);
    }

    /**
     * 设置 后台运行时插件仓库配置
     * <P>
     * 等同 {@link #setSFRTObjectRepo}
     * @param sFRTObjectRepo
     */
    @JsonIgnore
    public PSSysModelGroup sfrtobjectrepo(String sFRTObjectRepo){
        this.setSFRTObjectRepo(sFRTObjectRepo);
        return this;
    }

    /**
     * <B>SYNCMODE</B>&nbsp;同步模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ModelSyncMode} 
     */
    public final static String FIELD_SYNCMODE = "syncmode";

    /**
     * 设置 同步模式
     * 
     * @param syncMode
     * 
     */
    @JsonProperty(FIELD_SYNCMODE)
    public void setSyncMode(String syncMode){
        this.set(FIELD_SYNCMODE, syncMode);
    }
    
    /**
     * 获取 同步模式  
     * @return
     */
    @JsonIgnore
    public String getSyncMode(){
        Object objValue = this.get(FIELD_SYNCMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 同步模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSyncModeDirty(){
        if(this.contains(FIELD_SYNCMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 同步模式
     */
    @JsonIgnore
    public void resetSyncMode(){
        this.reset(FIELD_SYNCMODE);
    }

    /**
     * 设置 同步模式
     * <P>
     * 等同 {@link #setSyncMode}
     * @param syncMode
     */
    @JsonIgnore
    public PSSysModelGroup syncmode(String syncMode){
        this.setSyncMode(syncMode);
        return this;
    }

     /**
     * 设置 同步模式
     * <P>
     * 等同 {@link #setSyncMode}
     * @param syncMode
     */
    @JsonIgnore
    public PSSysModelGroup syncmode(net.ibizsys.psmodel.core.util.PSModelEnums.ModelSyncMode syncMode){
        if(syncMode == null){
            this.setSyncMode(null);
        }
        else{
            this.setSyncMode(syncMode.value);
        }
        return this;
    }

    /**
     * <B>SYSMODELFROM</B>&nbsp;模型来源
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ModelRepoFrom} 
     */
    public final static String FIELD_SYSMODELFROM = "sysmodelfrom";

    /**
     * 设置 模型来源
     * 
     * @param sysModelFrom
     * 
     */
    @JsonProperty(FIELD_SYSMODELFROM)
    public void setSysModelFrom(String sysModelFrom){
        this.set(FIELD_SYSMODELFROM, sysModelFrom);
    }
    
    /**
     * 获取 模型来源  
     * @return
     */
    @JsonIgnore
    public String getSysModelFrom(){
        Object objValue = this.get(FIELD_SYSMODELFROM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模型来源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSysModelFromDirty(){
        if(this.contains(FIELD_SYSMODELFROM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模型来源
     */
    @JsonIgnore
    public void resetSysModelFrom(){
        this.reset(FIELD_SYSMODELFROM);
    }

    /**
     * 设置 模型来源
     * <P>
     * 等同 {@link #setSysModelFrom}
     * @param sysModelFrom
     */
    @JsonIgnore
    public PSSysModelGroup sysmodelfrom(String sysModelFrom){
        this.setSysModelFrom(sysModelFrom);
        return this;
    }

     /**
     * 设置 模型来源
     * <P>
     * 等同 {@link #setSysModelFrom}
     * @param sysModelFrom
     */
    @JsonIgnore
    public PSSysModelGroup sysmodelfrom(net.ibizsys.psmodel.core.util.PSModelEnums.ModelRepoFrom sysModelFrom){
        if(sysModelFrom == null){
            this.setSysModelFrom(null);
        }
        else{
            this.setSysModelFrom(sysModelFrom.value);
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
    public PSSysModelGroup updatedate(String updateDate){
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
    public PSSysModelGroup updateman(String updateMan){
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
    public PSSysModelGroup usercat(String userCat){
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
    public PSSysModelGroup usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysModelGroup usertag(String userTag){
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
    public PSSysModelGroup usertag2(String userTag2){
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
    public PSSysModelGroup usertag3(String userTag3){
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
    public PSSysModelGroup usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysModelGroupId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysModelGroupId(strValue);
    }

    @JsonIgnore
    public PSSysModelGroup id(String strValue){
        this.setPSSysModelGroupId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysModelGroup){
            PSSysModelGroup model = (PSSysModelGroup)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
