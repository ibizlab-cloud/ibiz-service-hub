package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSMODULE</B>系统模块 模型传输对象
 * <P>
 * 系统的功能模块模型，提供了按照业务或是功能对模型进行分组的能力
 */
public class PSModuleDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSModuleDTO(){
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
    public PSModuleDTO clspkgparams(String clsPkgParams){
        this.setClsPkgParams(clsPkgParams);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定系统模块的代码标识，需要在系统模块所在的模型域（系统、子系统、模型组）中具有唯一性
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
    public PSModuleDTO codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>COLOR</B>&nbsp;显示颜色，模块中实体默认的标记颜色，实体在未指定自己的标记颜色时使用该标记颜色
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_COLOR = "color";

    /**
     * 设置 显示颜色，详细说明：{@link #FIELD_COLOR}
     * 
     * @param color
     * 
     */
    @JsonProperty(FIELD_COLOR)
    public void setColor(String color){
        this.set(FIELD_COLOR, color);
    }
    
    /**
     * 获取 显示颜色  
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
     * 判断 显示颜色 是否指定值，包括空值
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
     * 重置 显示颜色
     */
    @JsonIgnore
    public void resetColor(){
        this.reset(FIELD_COLOR);
    }

    /**
     * 设置 显示颜色，详细说明：{@link #FIELD_COLOR}
     * <P>
     * 等同 {@link #setColor}
     * @param color
     */
    @JsonIgnore
    public PSModuleDTO color(String color){
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
    public PSModuleDTO createdate(Timestamp createDate){
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
    public PSModuleDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DEFAULTFLAG</B>&nbsp;默认模块，系统中的默认模块，其它模型在未指定模块归属且需要模块归属的情况下使用默认模块，默认为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEFAULTFLAG = "defaultflag";

    /**
     * 设置 默认模块，详细说明：{@link #FIELD_DEFAULTFLAG}
     * 
     * @param defaultFlag
     * 
     */
    @JsonProperty(FIELD_DEFAULTFLAG)
    public void setDefaultFlag(Integer defaultFlag){
        this.set(FIELD_DEFAULTFLAG, defaultFlag);
    }
    
    /**
     * 获取 默认模块  
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
     * 判断 默认模块 是否指定值，包括空值
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
     * 重置 默认模块
     */
    @JsonIgnore
    public void resetDefaultFlag(){
        this.reset(FIELD_DEFAULTFLAG);
    }

    /**
     * 设置 默认模块，详细说明：{@link #FIELD_DEFAULTFLAG}
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSModuleDTO defaultflag(Integer defaultFlag){
        this.setDefaultFlag(defaultFlag);
        return this;
    }

     /**
     * 设置 默认模块，详细说明：{@link #FIELD_DEFAULTFLAG}
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSModuleDTO defaultflag(Boolean defaultFlag){
        if(defaultFlag == null){
            this.setDefaultFlag(null);
        }
        else{
            this.setDefaultFlag(defaultFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DSLINK</B>&nbsp;数据源
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DataSourceLink} 
     */
    public final static String FIELD_DSLINK = "dslink";

    /**
     * 设置 数据源
     * 
     * @param dSLink
     * 
     */
    @JsonProperty(FIELD_DSLINK)
    public void setDSLink(String dSLink){
        this.set(FIELD_DSLINK, dSLink);
    }
    
    /**
     * 获取 数据源  
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
     * 判断 数据源 是否指定值，包括空值
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
     * 重置 数据源
     */
    @JsonIgnore
    public void resetDSLink(){
        this.reset(FIELD_DSLINK);
    }

    /**
     * 设置 数据源
     * <P>
     * 等同 {@link #setDSLink}
     * @param dSLink
     */
    @JsonIgnore
    public PSModuleDTO dslink(String dSLink){
        this.setDSLink(dSLink);
        return this;
    }

     /**
     * 设置 数据源
     * <P>
     * 等同 {@link #setDSLink}
     * @param dSLink
     */
    @JsonIgnore
    public PSModuleDTO dslink(net.ibizsys.model.PSModelEnums.DataSourceLink dSLink){
        if(dSLink == null){
            this.setDSLink(null);
        }
        else{
            this.setDSLink(dSLink.value);
        }
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
    public PSModuleDTO dtoformat(String dTOFormat){
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
    public PSModuleDTO dynainsttag(String dynaInstTag){
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
    public PSModuleDTO dynainsttag2(String dynaInstTag2){
        this.setDynaInstTag2(dynaInstTag2);
        return this;
    }

    /**
     * <B>LANRESTAG</B>&nbsp;语言标记前缀
     * <P>
     * 字符串：最大长度 20
     */
    public final static String FIELD_LANRESTAG = "lanrestag";

    /**
     * 设置 语言标记前缀
     * 
     * @param lanResTag
     * 
     */
    @JsonProperty(FIELD_LANRESTAG)
    public void setLanResTag(String lanResTag){
        this.set(FIELD_LANRESTAG, lanResTag);
    }
    
    /**
     * 获取 语言标记前缀  
     * @return
     */
    @JsonIgnore
    public String getLanResTag(){
        Object objValue = this.get(FIELD_LANRESTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 语言标记前缀 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLanResTagDirty(){
        if(this.contains(FIELD_LANRESTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 语言标记前缀
     */
    @JsonIgnore
    public void resetLanResTag(){
        this.reset(FIELD_LANRESTAG);
    }

    /**
     * 设置 语言标记前缀
     * <P>
     * 等同 {@link #setLanResTag}
     * @param lanResTag
     */
    @JsonIgnore
    public PSModuleDTO lanrestag(String lanResTag){
        this.setLanResTag(lanResTag);
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
    public PSModuleDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MODTAG</B>&nbsp;模块标记
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_MODTAG = "modtag";

    /**
     * 设置 模块标记
     * 
     * @param modTag
     * 
     */
    @JsonProperty(FIELD_MODTAG)
    public void setModTag(String modTag){
        this.set(FIELD_MODTAG, modTag);
    }
    
    /**
     * 获取 模块标记  
     * @return
     */
    @JsonIgnore
    public String getModTag(){
        Object objValue = this.get(FIELD_MODTAG);
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
    public boolean isModTagDirty(){
        if(this.contains(FIELD_MODTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模块标记
     */
    @JsonIgnore
    public void resetModTag(){
        this.reset(FIELD_MODTAG);
    }

    /**
     * 设置 模块标记
     * <P>
     * 等同 {@link #setModTag}
     * @param modTag
     */
    @JsonIgnore
    public PSModuleDTO modtag(String modTag){
        this.setModTag(modTag);
        return this;
    }

    /**
     * <B>MODTAG2</B>&nbsp;模块标记2
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_MODTAG2 = "modtag2";

    /**
     * 设置 模块标记2
     * 
     * @param modTag2
     * 
     */
    @JsonProperty(FIELD_MODTAG2)
    public void setModTag2(String modTag2){
        this.set(FIELD_MODTAG2, modTag2);
    }
    
    /**
     * 获取 模块标记2  
     * @return
     */
    @JsonIgnore
    public String getModTag2(){
        Object objValue = this.get(FIELD_MODTAG2);
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
    public boolean isModTag2Dirty(){
        if(this.contains(FIELD_MODTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模块标记2
     */
    @JsonIgnore
    public void resetModTag2(){
        this.reset(FIELD_MODTAG2);
    }

    /**
     * 设置 模块标记2
     * <P>
     * 等同 {@link #setModTag2}
     * @param modTag2
     */
    @JsonIgnore
    public PSModuleDTO modtag2(String modTag2){
        this.setModTag2(modTag2);
        return this;
    }

    /**
     * <B>MODTAG3</B>&nbsp;模块标记3
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_MODTAG3 = "modtag3";

    /**
     * 设置 模块标记3
     * 
     * @param modTag3
     * 
     */
    @JsonProperty(FIELD_MODTAG3)
    public void setModTag3(String modTag3){
        this.set(FIELD_MODTAG3, modTag3);
    }
    
    /**
     * 获取 模块标记3  
     * @return
     */
    @JsonIgnore
    public String getModTag3(){
        Object objValue = this.get(FIELD_MODTAG3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模块标记3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isModTag3Dirty(){
        if(this.contains(FIELD_MODTAG3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模块标记3
     */
    @JsonIgnore
    public void resetModTag3(){
        this.reset(FIELD_MODTAG3);
    }

    /**
     * 设置 模块标记3
     * <P>
     * 等同 {@link #setModTag3}
     * @param modTag3
     */
    @JsonIgnore
    public PSModuleDTO modtag3(String modTag3){
        this.setModTag3(modTag3);
        return this;
    }

    /**
     * <B>MODTAG4</B>&nbsp;模块标记4
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_MODTAG4 = "modtag4";

    /**
     * 设置 模块标记4
     * 
     * @param modTag4
     * 
     */
    @JsonProperty(FIELD_MODTAG4)
    public void setModTag4(String modTag4){
        this.set(FIELD_MODTAG4, modTag4);
    }
    
    /**
     * 获取 模块标记4  
     * @return
     */
    @JsonIgnore
    public String getModTag4(){
        Object objValue = this.get(FIELD_MODTAG4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模块标记4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isModTag4Dirty(){
        if(this.contains(FIELD_MODTAG4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模块标记4
     */
    @JsonIgnore
    public void resetModTag4(){
        this.reset(FIELD_MODTAG4);
    }

    /**
     * 设置 模块标记4
     * <P>
     * 等同 {@link #setModTag4}
     * @param modTag4
     */
    @JsonIgnore
    public PSModuleDTO modtag4(String modTag4){
        this.setModTag4(modTag4);
        return this;
    }

    /**
     * <B>MODULESN</B>&nbsp;模块编号
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_MODULESN = "modulesn";

    /**
     * 设置 模块编号
     * 
     * @param moduleSN
     * 
     */
    @JsonProperty(FIELD_MODULESN)
    public void setModuleSN(String moduleSN){
        this.set(FIELD_MODULESN, moduleSN);
    }
    
    /**
     * 获取 模块编号  
     * @return
     */
    @JsonIgnore
    public String getModuleSN(){
        Object objValue = this.get(FIELD_MODULESN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模块编号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isModuleSNDirty(){
        if(this.contains(FIELD_MODULESN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模块编号
     */
    @JsonIgnore
    public void resetModuleSN(){
        this.reset(FIELD_MODULESN);
    }

    /**
     * 设置 模块编号
     * <P>
     * 等同 {@link #setModuleSN}
     * @param moduleSN
     */
    @JsonIgnore
    public PSModuleDTO modulesn(String moduleSN){
        this.setModuleSN(moduleSN);
        return this;
    }

    /**
     * <B>NOVIEWMODE</B>&nbsp;无视图模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_NOVIEWMODE = "noviewmode";

    /**
     * 设置 无视图模式
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
     * 设置 无视图模式
     * <P>
     * 等同 {@link #setNoViewMode}
     * @param noViewMode
     */
    @JsonIgnore
    public PSModuleDTO noviewmode(Integer noViewMode){
        this.setNoViewMode(noViewMode);
        return this;
    }

     /**
     * 设置 无视图模式
     * <P>
     * 等同 {@link #setNoViewMode}
     * @param noViewMode
     */
    @JsonIgnore
    public PSModuleDTO noviewmode(Boolean noViewMode){
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
    public PSModuleDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
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
    public PSModuleDTO pkgcodename(String pKGCodeName){
        this.setPKGCodeName(pKGCodeName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSMODULEID = "psmoduleid";

    /**
     * 设置 系统模块标识
     * 
     * @param pSModuleId
     * 
     */
    @JsonProperty(FIELD_PSMODULEID)
    public void setPSModuleId(String pSModuleId){
        this.set(FIELD_PSMODULEID, pSModuleId);
    }
    
    /**
     * 获取 系统模块标识  
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
     * 判断 系统模块标识 是否指定值，包括空值
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
     * 重置 系统模块标识
     */
    @JsonIgnore
    public void resetPSModuleId(){
        this.reset(FIELD_PSMODULEID);
    }

    /**
     * 设置 系统模块标识
     * <P>
     * 等同 {@link #setPSModuleId}
     * @param pSModuleId
     */
    @JsonIgnore
    public PSModuleDTO psmoduleid(String pSModuleId){
        this.setPSModuleId(pSModuleId);
        return this;
    }

    /**
     * <B>PSMODULENAME</B>&nbsp;模块名称，指定系统模块名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSMODULENAME = "psmodulename";

    /**
     * 设置 模块名称，详细说明：{@link #FIELD_PSMODULENAME}
     * 
     * @param pSModuleName
     * 
     */
    @JsonProperty(FIELD_PSMODULENAME)
    public void setPSModuleName(String pSModuleName){
        this.set(FIELD_PSMODULENAME, pSModuleName);
    }
    
    /**
     * 获取 模块名称  
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
     * 判断 模块名称 是否指定值，包括空值
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
     * 重置 模块名称
     */
    @JsonIgnore
    public void resetPSModuleName(){
        this.reset(FIELD_PSMODULENAME);
    }

    /**
     * 设置 模块名称，详细说明：{@link #FIELD_PSMODULENAME}
     * <P>
     * 等同 {@link #setPSModuleName}
     * @param pSModuleName
     */
    @JsonIgnore
    public PSModuleDTO psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSModuleName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSModuleName(strName);
    }

    @JsonIgnore
    public PSModuleDTO name(String strName){
        this.setPSModuleName(strName);
        return this;
    }

    /**
     * <B>PSSYSMODELGROUPID</B>&nbsp;系统模型组，模块所属的模型组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysModelGroupDTO} 
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
    public PSModuleDTO pssysmodelgroupid(String pSSysModelGroupId){
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
    public PSModuleDTO pssysmodelgroupid(PSSysModelGroupDTO pSSysModelGroup){
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
     * <B>PSSYSMODELGROUPNAME</B>&nbsp;系统模型组，模块所属的模型组
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
    public PSModuleDTO pssysmodelgroupname(String pSSysModelGroupName){
        this.setPSSysModelGroupName(pSSysModelGroupName);
        return this;
    }

    /**
     * <B>PSSYSREFID</B>&nbsp;子系统，系统模块来自的子系统
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysRefDTO} 
     */
    public final static String FIELD_PSSYSREFID = "pssysrefid";

    /**
     * 设置 子系统，详细说明：{@link #FIELD_PSSYSREFID}
     * 
     * @param pSSysRefId
     * 
     */
    @JsonProperty(FIELD_PSSYSREFID)
    public void setPSSysRefId(String pSSysRefId){
        this.set(FIELD_PSSYSREFID, pSSysRefId);
    }
    
    /**
     * 获取 子系统  
     * @return
     */
    @JsonIgnore
    public String getPSSysRefId(){
        Object objValue = this.get(FIELD_PSSYSREFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 子系统 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysRefIdDirty(){
        if(this.contains(FIELD_PSSYSREFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 子系统
     */
    @JsonIgnore
    public void resetPSSysRefId(){
        this.reset(FIELD_PSSYSREFID);
    }

    /**
     * 设置 子系统，详细说明：{@link #FIELD_PSSYSREFID}
     * <P>
     * 等同 {@link #setPSSysRefId}
     * @param pSSysRefId
     */
    @JsonIgnore
    public PSModuleDTO pssysrefid(String pSSysRefId){
        this.setPSSysRefId(pSSysRefId);
        return this;
    }

    /**
     * 设置 子系统，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysRefId}
     * @param pSSysRef 引用对象
     */
    @JsonIgnore
    public PSModuleDTO pssysrefid(PSSysRefDTO pSSysRef){
        if(pSSysRef == null){
            this.setPSSysRefId(null);
            this.setPSSysRefName(null);
        }
        else{
            this.setPSSysRefId(pSSysRef.getPSSysRefId());
            this.setPSSysRefName(pSSysRef.getPSSysRefName());
        }
        return this;
    }

    /**
     * <B>PSSYSREFNAME</B>&nbsp;子系统，系统模块来自的子系统
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSREFID}
     */
    public final static String FIELD_PSSYSREFNAME = "pssysrefname";

    /**
     * 设置 子系统，详细说明：{@link #FIELD_PSSYSREFNAME}
     * 
     * @param pSSysRefName
     * 
     */
    @JsonProperty(FIELD_PSSYSREFNAME)
    public void setPSSysRefName(String pSSysRefName){
        this.set(FIELD_PSSYSREFNAME, pSSysRefName);
    }
    
    /**
     * 获取 子系统  
     * @return
     */
    @JsonIgnore
    public String getPSSysRefName(){
        Object objValue = this.get(FIELD_PSSYSREFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 子系统 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysRefNameDirty(){
        if(this.contains(FIELD_PSSYSREFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 子系统
     */
    @JsonIgnore
    public void resetPSSysRefName(){
        this.reset(FIELD_PSSYSREFNAME);
    }

    /**
     * 设置 子系统，详细说明：{@link #FIELD_PSSYSREFNAME}
     * <P>
     * 等同 {@link #setPSSysRefName}
     * @param pSSysRefName
     */
    @JsonIgnore
    public PSModuleDTO pssysrefname(String pSSysRefName){
        this.setPSSysRefName(pSSysRefName);
        return this;
    }

    /**
     * <B>PSSYSSFPUBID</B>&nbsp;后台体系，模块的后台服务体系，在多后台服务发布的场景下，未指定的模块参与每个后台服务的代码发布，指定的模块只参与指定的后台服务的代码发布
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysSFPubDTO} 
     */
    public final static String FIELD_PSSYSSFPUBID = "pssyssfpubid";

    /**
     * 设置 后台体系，详细说明：{@link #FIELD_PSSYSSFPUBID}
     * 
     * @param pSSysSFPubId
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPUBID)
    public void setPSSysSFPubId(String pSSysSFPubId){
        this.set(FIELD_PSSYSSFPUBID, pSSysSFPubId);
    }
    
    /**
     * 获取 后台体系  
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
     * 判断 后台体系 是否指定值，包括空值
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
     * 重置 后台体系
     */
    @JsonIgnore
    public void resetPSSysSFPubId(){
        this.reset(FIELD_PSSYSSFPUBID);
    }

    /**
     * 设置 后台体系，详细说明：{@link #FIELD_PSSYSSFPUBID}
     * <P>
     * 等同 {@link #setPSSysSFPubId}
     * @param pSSysSFPubId
     */
    @JsonIgnore
    public PSModuleDTO pssyssfpubid(String pSSysSFPubId){
        this.setPSSysSFPubId(pSSysSFPubId);
        return this;
    }

    /**
     * 设置 后台体系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSFPubId}
     * @param pSSysSFPub 引用对象
     */
    @JsonIgnore
    public PSModuleDTO pssyssfpubid(PSSysSFPubDTO pSSysSFPub){
        if(pSSysSFPub == null){
            this.setPSSysSFPubId(null);
            this.setPSSysSFPubName(null);
        }
        else{
            this.setPSSysSFPubId(pSSysSFPub.getPSSysSFPubId());
            this.setPSSysSFPubName(pSSysSFPub.getPSSysSFPubName());
        }
        return this;
    }

    /**
     * <B>PSSYSSFPUBNAME</B>&nbsp;后台体系，模块的后台服务体系，在多后台服务发布的场景下，未指定的模块参与每个后台服务的代码发布，指定的模块只参与指定的后台服务的代码发布
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSFPUBID}
     */
    public final static String FIELD_PSSYSSFPUBNAME = "pssyssfpubname";

    /**
     * 设置 后台体系，详细说明：{@link #FIELD_PSSYSSFPUBNAME}
     * 
     * @param pSSysSFPubName
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPUBNAME)
    public void setPSSysSFPubName(String pSSysSFPubName){
        this.set(FIELD_PSSYSSFPUBNAME, pSSysSFPubName);
    }
    
    /**
     * 获取 后台体系  
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
     * 判断 后台体系 是否指定值，包括空值
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
     * 重置 后台体系
     */
    @JsonIgnore
    public void resetPSSysSFPubName(){
        this.reset(FIELD_PSSYSSFPUBNAME);
    }

    /**
     * 设置 后台体系，详细说明：{@link #FIELD_PSSYSSFPUBNAME}
     * <P>
     * 等同 {@link #setPSSysSFPubName}
     * @param pSSysSFPubName
     */
    @JsonIgnore
    public PSModuleDTO pssyssfpubname(String pSSysSFPubName){
        this.setPSSysSFPubName(pSSysSFPubName);
        return this;
    }

    /**
     * <B>REQMODULE</B>&nbsp;需求模块
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_REQMODULE = "reqmodule";

    /**
     * 设置 需求模块
     * 
     * @param reqModule
     * 
     */
    @JsonProperty(FIELD_REQMODULE)
    public void setReqModule(Integer reqModule){
        this.set(FIELD_REQMODULE, reqModule);
    }
    
    /**
     * 获取 需求模块  
     * @return
     */
    @JsonIgnore
    public Integer getReqModule(){
        Object objValue = this.get(FIELD_REQMODULE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 需求模块 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isReqModuleDirty(){
        if(this.contains(FIELD_REQMODULE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 需求模块
     */
    @JsonIgnore
    public void resetReqModule(){
        this.reset(FIELD_REQMODULE);
    }

    /**
     * 设置 需求模块
     * <P>
     * 等同 {@link #setReqModule}
     * @param reqModule
     */
    @JsonIgnore
    public PSModuleDTO reqmodule(Integer reqModule){
        this.setReqModule(reqModule);
        return this;
    }

     /**
     * 设置 需求模块
     * <P>
     * 等同 {@link #setReqModule}
     * @param reqModule
     */
    @JsonIgnore
    public PSModuleDTO reqmodule(Boolean reqModule){
        if(reqModule == null){
            this.setReqModule(null);
        }
        else{
            this.setReqModule(reqModule?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>SERVICEAPIFLAG</B>&nbsp;服务API模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DEServiceAPIMode} 
     */
    public final static String FIELD_SERVICEAPIFLAG = "serviceapiflag";

    /**
     * 设置 服务API模式
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
     * 设置 服务API模式
     * <P>
     * 等同 {@link #setServiceAPIFlag}
     * @param serviceAPIFlag
     */
    @JsonIgnore
    public PSModuleDTO serviceapiflag(Integer serviceAPIFlag){
        this.setServiceAPIFlag(serviceAPIFlag);
        return this;
    }

     /**
     * 设置 服务API模式
     * <P>
     * 等同 {@link #setServiceAPIFlag}
     * @param serviceAPIFlag
     */
    @JsonIgnore
    public PSModuleDTO serviceapiflag(net.ibizsys.model.PSModelEnums.DEServiceAPIMode serviceAPIFlag){
        if(serviceAPIFlag == null){
            this.setServiceAPIFlag(null);
        }
        else{
            this.setServiceAPIFlag(serviceAPIFlag.value);
        }
        return this;
    }

    /**
     * <B>SHORTTAG</B>&nbsp;短标识
     * <P>
     * 字符串：最大长度 10
     */
    public final static String FIELD_SHORTTAG = "shorttag";

    /**
     * 设置 短标识
     * 
     * @param shortTag
     * 
     */
    @JsonProperty(FIELD_SHORTTAG)
    public void setShortTag(String shortTag){
        this.set(FIELD_SHORTTAG, shortTag);
    }
    
    /**
     * 获取 短标识  
     * @return
     */
    @JsonIgnore
    public String getShortTag(){
        Object objValue = this.get(FIELD_SHORTTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 短标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isShortTagDirty(){
        if(this.contains(FIELD_SHORTTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 短标识
     */
    @JsonIgnore
    public void resetShortTag(){
        this.reset(FIELD_SHORTTAG);
    }

    /**
     * 设置 短标识
     * <P>
     * 等同 {@link #setShortTag}
     * @param shortTag
     */
    @JsonIgnore
    public PSModuleDTO shorttag(String shortTag){
        this.setShortTag(shortTag);
        return this;
    }

    /**
     * <B>SUBSYSMODULE</B>&nbsp;子系统模块，系统模块是否为子系统模块，子系统模块的实体都为子系统实体，系统实体及子系统实体支持使用不同的模板
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_SUBSYSMODULE = "subsysmodule";

    /**
     * 设置 子系统模块，详细说明：{@link #FIELD_SUBSYSMODULE}
     * 
     * @param subSysModule
     * 
     */
    @JsonProperty(FIELD_SUBSYSMODULE)
    public void setSubSysModule(Integer subSysModule){
        this.set(FIELD_SUBSYSMODULE, subSysModule);
    }
    
    /**
     * 获取 子系统模块  
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
     * 判断 子系统模块 是否指定值，包括空值
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
     * 重置 子系统模块
     */
    @JsonIgnore
    public void resetSubSysModule(){
        this.reset(FIELD_SUBSYSMODULE);
    }

    /**
     * 设置 子系统模块，详细说明：{@link #FIELD_SUBSYSMODULE}
     * <P>
     * 等同 {@link #setSubSysModule}
     * @param subSysModule
     */
    @JsonIgnore
    public PSModuleDTO subsysmodule(Integer subSysModule){
        this.setSubSysModule(subSysModule);
        return this;
    }

     /**
     * 设置 子系统模块，详细说明：{@link #FIELD_SUBSYSMODULE}
     * <P>
     * 等同 {@link #setSubSysModule}
     * @param subSysModule
     */
    @JsonIgnore
    public PSModuleDTO subsysmodule(Boolean subSysModule){
        if(subSysModule == null){
            this.setSubSysModule(null);
        }
        else{
            this.setSubSysModule(subSysModule?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>SYSREFTYPE</B>&nbsp;子系统类型，子系统模块所引用的子系统类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.SysRefType} 
     */
    public final static String FIELD_SYSREFTYPE = "sysreftype";

    /**
     * 设置 子系统类型，详细说明：{@link #FIELD_SYSREFTYPE}
     * 
     * @param sysRefType
     * 
     */
    @JsonProperty(FIELD_SYSREFTYPE)
    public void setSysRefType(String sysRefType){
        this.set(FIELD_SYSREFTYPE, sysRefType);
    }
    
    /**
     * 获取 子系统类型  
     * @return
     */
    @JsonIgnore
    public String getSysRefType(){
        Object objValue = this.get(FIELD_SYSREFTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 子系统类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSysRefTypeDirty(){
        if(this.contains(FIELD_SYSREFTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 子系统类型
     */
    @JsonIgnore
    public void resetSysRefType(){
        this.reset(FIELD_SYSREFTYPE);
    }

    /**
     * 设置 子系统类型，详细说明：{@link #FIELD_SYSREFTYPE}
     * <P>
     * 等同 {@link #setSysRefType}
     * @param sysRefType
     */
    @JsonIgnore
    public PSModuleDTO sysreftype(String sysRefType){
        this.setSysRefType(sysRefType);
        return this;
    }

     /**
     * 设置 子系统类型，详细说明：{@link #FIELD_SYSREFTYPE}
     * <P>
     * 等同 {@link #setSysRefType}
     * @param sysRefType
     */
    @JsonIgnore
    public PSModuleDTO sysreftype(net.ibizsys.model.PSModelEnums.SysRefType sysRefType){
        if(sysRefType == null){
            this.setSysRefType(null);
        }
        else{
            this.setSysRefType(sysRefType.value);
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
    public PSModuleDTO updatedate(Timestamp updateDate){
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
    public PSModuleDTO updateman(String updateMan){
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
    public PSModuleDTO usercat(String userCat){
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
    public PSModuleDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSModuleDTO userparams(String userParams){
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
    public PSModuleDTO usertag(String userTag){
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
    public PSModuleDTO usertag2(String userTag2){
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
    public PSModuleDTO usertag3(String userTag3){
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
    public PSModuleDTO usertag4(String userTag4){
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
    public PSModuleDTO utilparams(String utilParams){
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
    public PSModuleDTO utiltag(String utilTag){
        this.setUtilTag(utilTag);
        return this;
    }

    /**
     * <B>UTILTYPE</B>&nbsp;功能类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.ModuleUtilType} 
     */
    public final static String FIELD_UTILTYPE = "utiltype";

    /**
     * 设置 功能类型
     * 
     * @param utilType
     * 
     */
    @JsonProperty(FIELD_UTILTYPE)
    public void setUtilType(String utilType){
        this.set(FIELD_UTILTYPE, utilType);
    }
    
    /**
     * 获取 功能类型  
     * @return
     */
    @JsonIgnore
    public String getUtilType(){
        Object objValue = this.get(FIELD_UTILTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilTypeDirty(){
        if(this.contains(FIELD_UTILTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能类型
     */
    @JsonIgnore
    public void resetUtilType(){
        this.reset(FIELD_UTILTYPE);
    }

    /**
     * 设置 功能类型
     * <P>
     * 等同 {@link #setUtilType}
     * @param utilType
     */
    @JsonIgnore
    public PSModuleDTO utiltype(String utilType){
        this.setUtilType(utilType);
        return this;
    }

     /**
     * 设置 功能类型
     * <P>
     * 等同 {@link #setUtilType}
     * @param utilType
     */
    @JsonIgnore
    public PSModuleDTO utiltype(net.ibizsys.model.PSModelEnums.ModuleUtilType utilType){
        if(utilType == null){
            this.setUtilType(null);
        }
        else{
            this.setUtilType(utilType.value);
        }
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSModuleId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSModuleId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSModuleId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSModuleId(strValue);
    }

    @JsonIgnore
    public PSModuleDTO id(String strValue){
        this.setPSModuleId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSModuleDTO){
            PSModuleDTO dto = (PSModuleDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
