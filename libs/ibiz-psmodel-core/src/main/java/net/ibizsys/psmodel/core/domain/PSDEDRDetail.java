package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEDRDETAIL</B>实体界面组成员 模型传输对象
 * <P>
 * 实体界面组成员模型，将实体关系界面或系统预定义视图添加到实体界面组，并定义分组、显示次序等信息
 */
public class PSDEDRDetail extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEDRDetail(){
        this.setValidFlag(1);
    }      

    /**
     * <B>CAPPSLANRESID</B>&nbsp;标题语言资源，指定关系界面组成员标题的多语言资源对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_CAPPSLANRESID = "cappslanresid";

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_CAPPSLANRESID}
     * 
     * @param capPSLanResId
     * 
     */
    @JsonProperty(FIELD_CAPPSLANRESID)
    public void setCapPSLanResId(String capPSLanResId){
        this.set(FIELD_CAPPSLANRESID, capPSLanResId);
    }
    
    /**
     * 获取 标题语言资源  
     * @return
     */
    @JsonIgnore
    public String getCapPSLanResId(){
        Object objValue = this.get(FIELD_CAPPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标题语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCapPSLanResIdDirty(){
        if(this.contains(FIELD_CAPPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题语言资源
     */
    @JsonIgnore
    public void resetCapPSLanResId(){
        this.reset(FIELD_CAPPSLANRESID);
    }

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_CAPPSLANRESID}
     * <P>
     * 等同 {@link #setCapPSLanResId}
     * @param capPSLanResId
     */
    @JsonIgnore
    public PSDEDRDetail cappslanresid(String capPSLanResId){
        this.setCapPSLanResId(capPSLanResId);
        return this;
    }

    /**
     * 设置 标题语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setCapPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSDEDRDetail cappslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setCapPSLanResId(null);
            this.setCapPSLanResName(null);
        }
        else{
            this.setCapPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setCapPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>CAPPSLANRESNAME</B>&nbsp;标题语言资源，指定关系界面组成员标题的多语言资源对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CAPPSLANRESID}
     */
    public final static String FIELD_CAPPSLANRESNAME = "cappslanresname";

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_CAPPSLANRESNAME}
     * 
     * @param capPSLanResName
     * 
     */
    @JsonProperty(FIELD_CAPPSLANRESNAME)
    public void setCapPSLanResName(String capPSLanResName){
        this.set(FIELD_CAPPSLANRESNAME, capPSLanResName);
    }
    
    /**
     * 获取 标题语言资源  
     * @return
     */
    @JsonIgnore
    public String getCapPSLanResName(){
        Object objValue = this.get(FIELD_CAPPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标题语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCapPSLanResNameDirty(){
        if(this.contains(FIELD_CAPPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题语言资源
     */
    @JsonIgnore
    public void resetCapPSLanResName(){
        this.reset(FIELD_CAPPSLANRESNAME);
    }

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_CAPPSLANRESNAME}
     * <P>
     * 等同 {@link #setCapPSLanResName}
     * @param capPSLanResName
     */
    @JsonIgnore
    public PSDEDRDetail cappslanresname(String capPSLanResName){
        this.setCapPSLanResName(capPSLanResName);
        return this;
    }

    /**
     * <B>CAPTION</B>&nbsp;标题，指定关系界面组成员的标题，未定义时使用引用界面（关系界面或预定义视图）的定义
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CAPTION = "caption";

    /**
     * 设置 标题，详细说明：{@link #FIELD_CAPTION}
     * 
     * @param caption
     * 
     */
    @JsonProperty(FIELD_CAPTION)
    public void setCaption(String caption){
        this.set(FIELD_CAPTION, caption);
    }
    
    /**
     * 获取 标题  
     * @return
     */
    @JsonIgnore
    public String getCaption(){
        Object objValue = this.get(FIELD_CAPTION);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标题 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCaptionDirty(){
        if(this.contains(FIELD_CAPTION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题
     */
    @JsonIgnore
    public void resetCaption(){
        this.reset(FIELD_CAPTION);
    }

    /**
     * 设置 标题，详细说明：{@link #FIELD_CAPTION}
     * <P>
     * 等同 {@link #setCaption}
     * @param caption
     */
    @JsonIgnore
    public PSDEDRDetail caption(String caption){
        this.setCaption(caption);
        return this;
    }

    /**
     * <B>COUNTERID</B>&nbsp;计数项标识，指定关系界面组成员的计数标识，未定义时使用引用界面（关系界面或预定义视图）的定义
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_COUNTERID = "counterid";

    /**
     * 设置 计数项标识，详细说明：{@link #FIELD_COUNTERID}
     * 
     * @param counterId
     * 
     */
    @JsonProperty(FIELD_COUNTERID)
    public void setCounterId(String counterId){
        this.set(FIELD_COUNTERID, counterId);
    }
    
    /**
     * 获取 计数项标识  
     * @return
     */
    @JsonIgnore
    public String getCounterId(){
        Object objValue = this.get(FIELD_COUNTERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 计数项标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCounterIdDirty(){
        if(this.contains(FIELD_COUNTERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 计数项标识
     */
    @JsonIgnore
    public void resetCounterId(){
        this.reset(FIELD_COUNTERID);
    }

    /**
     * 设置 计数项标识，详细说明：{@link #FIELD_COUNTERID}
     * <P>
     * 等同 {@link #setCounterId}
     * @param counterId
     */
    @JsonIgnore
    public PSDEDRDetail counterid(String counterId){
        this.setCounterId(counterId);
        return this;
    }

    /**
     * <B>COUNTERMODE</B>&nbsp;计数显示模式，关系界面项指定数据项标识启用计数能力，可进一步指定计数显示模式，未定义时使用引用关系界面的定义，无引用关系界面时为【默认】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.TreeNodeCounterMode} 
     */
    public final static String FIELD_COUNTERMODE = "countermode";

    /**
     * 设置 计数显示模式，详细说明：{@link #FIELD_COUNTERMODE}
     * 
     * @param counterMode
     * 
     */
    @JsonProperty(FIELD_COUNTERMODE)
    public void setCounterMode(Integer counterMode){
        this.set(FIELD_COUNTERMODE, counterMode);
    }
    
    /**
     * 获取 计数显示模式  
     * @return
     */
    @JsonIgnore
    public Integer getCounterMode(){
        Object objValue = this.get(FIELD_COUNTERMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 计数显示模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCounterModeDirty(){
        if(this.contains(FIELD_COUNTERMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 计数显示模式
     */
    @JsonIgnore
    public void resetCounterMode(){
        this.reset(FIELD_COUNTERMODE);
    }

    /**
     * 设置 计数显示模式，详细说明：{@link #FIELD_COUNTERMODE}
     * <P>
     * 等同 {@link #setCounterMode}
     * @param counterMode
     */
    @JsonIgnore
    public PSDEDRDetail countermode(Integer counterMode){
        this.setCounterMode(counterMode);
        return this;
    }

     /**
     * 设置 计数显示模式，详细说明：{@link #FIELD_COUNTERMODE}
     * <P>
     * 等同 {@link #setCounterMode}
     * @param counterMode
     */
    @JsonIgnore
    public PSDEDRDetail countermode(net.ibizsys.psmodel.core.util.PSModelEnums.TreeNodeCounterMode counterMode){
        if(counterMode == null){
            this.setCounterMode(null);
        }
        else{
            this.setCounterMode(counterMode.value);
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
    public PSDEDRDetail createdate(String createDate){
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
    public PSDEDRDetail createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DATA</B>&nbsp;项数据
     */
    public final static String FIELD_DATA = "data";

    /**
     * 设置 项数据
     * 
     * @param data
     * 
     */
    @JsonProperty(FIELD_DATA)
    public void setData(String data){
        this.set(FIELD_DATA, data);
    }
    
    /**
     * 获取 项数据  
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
     * 判断 项数据 是否指定值，包括空值
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
     * 重置 项数据
     */
    @JsonIgnore
    public void resetData(){
        this.reset(FIELD_DATA);
    }

    /**
     * 设置 项数据
     * <P>
     * 等同 {@link #setData}
     * @param data
     */
    @JsonIgnore
    public PSDEDRDetail data(String data){
        this.setData(data);
        return this;
    }

    /**
     * <B>DETAILTAG</B>&nbsp;成员标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_DETAILTAG = "detailtag";

    /**
     * 设置 成员标记
     * 
     * @param detailTag
     * 
     */
    @JsonProperty(FIELD_DETAILTAG)
    public void setDetailTag(String detailTag){
        this.set(FIELD_DETAILTAG, detailTag);
    }
    
    /**
     * 获取 成员标记  
     * @return
     */
    @JsonIgnore
    public String getDetailTag(){
        Object objValue = this.get(FIELD_DETAILTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 成员标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDetailTagDirty(){
        if(this.contains(FIELD_DETAILTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 成员标记
     */
    @JsonIgnore
    public void resetDetailTag(){
        this.reset(FIELD_DETAILTAG);
    }

    /**
     * 设置 成员标记
     * <P>
     * 等同 {@link #setDetailTag}
     * @param detailTag
     */
    @JsonIgnore
    public PSDEDRDetail detailtag(String detailTag){
        this.setDetailTag(detailTag);
        return this;
    }

    /**
     * <B>DETAILTAG2</B>&nbsp;成员标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_DETAILTAG2 = "detailtag2";

    /**
     * 设置 成员标记2
     * 
     * @param detailTag2
     * 
     */
    @JsonProperty(FIELD_DETAILTAG2)
    public void setDetailTag2(String detailTag2){
        this.set(FIELD_DETAILTAG2, detailTag2);
    }
    
    /**
     * 获取 成员标记2  
     * @return
     */
    @JsonIgnore
    public String getDetailTag2(){
        Object objValue = this.get(FIELD_DETAILTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 成员标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDetailTag2Dirty(){
        if(this.contains(FIELD_DETAILTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 成员标记2
     */
    @JsonIgnore
    public void resetDetailTag2(){
        this.reset(FIELD_DETAILTAG2);
    }

    /**
     * 设置 成员标记2
     * <P>
     * 等同 {@link #setDetailTag2}
     * @param detailTag2
     */
    @JsonIgnore
    public PSDEDRDetail detailtag2(String detailTag2){
        this.setDetailTag2(detailTag2);
        return this;
    }

    /**
     * <B>DETAILTYPE</B>&nbsp;成员类型，指定引用的关系界面类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEDRDetailType} 
     */
    public final static String FIELD_DETAILTYPE = "detailtype";

    /**
     * 设置 成员类型，详细说明：{@link #FIELD_DETAILTYPE}
     * 
     * @param detailType
     * 
     */
    @JsonProperty(FIELD_DETAILTYPE)
    public void setDetailType(String detailType){
        this.set(FIELD_DETAILTYPE, detailType);
    }
    
    /**
     * 获取 成员类型  
     * @return
     */
    @JsonIgnore
    public String getDetailType(){
        Object objValue = this.get(FIELD_DETAILTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 成员类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDetailTypeDirty(){
        if(this.contains(FIELD_DETAILTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 成员类型
     */
    @JsonIgnore
    public void resetDetailType(){
        this.reset(FIELD_DETAILTYPE);
    }

    /**
     * 设置 成员类型，详细说明：{@link #FIELD_DETAILTYPE}
     * <P>
     * 等同 {@link #setDetailType}
     * @param detailType
     */
    @JsonIgnore
    public PSDEDRDetail detailtype(String detailType){
        this.setDetailType(detailType);
        return this;
    }

     /**
     * 设置 成员类型，详细说明：{@link #FIELD_DETAILTYPE}
     * <P>
     * 等同 {@link #setDetailType}
     * @param detailType
     */
    @JsonIgnore
    public PSDEDRDetail detailtype(net.ibizsys.psmodel.core.util.PSModelEnums.DEDRDetailType detailType){
        if(detailType == null){
            this.setDetailType(null);
        }
        else{
            this.setDetailType(detailType.value);
        }
        return this;
    }

    /**
     * <B>ENABLEMODE</B>&nbsp;启用模式，指定关系界面组成员的启用模式，未定义时如存在关系界面则使用关系界面定义，否则为【全部启用】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEDRDetailEnableMode} 
     */
    public final static String FIELD_ENABLEMODE = "enablemode";

    /**
     * 设置 启用模式，详细说明：{@link #FIELD_ENABLEMODE}
     * 
     * @param enableMode
     * 
     */
    @JsonProperty(FIELD_ENABLEMODE)
    public void setEnableMode(String enableMode){
        this.set(FIELD_ENABLEMODE, enableMode);
    }
    
    /**
     * 获取 启用模式  
     * @return
     */
    @JsonIgnore
    public String getEnableMode(){
        Object objValue = this.get(FIELD_ENABLEMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 启用模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableModeDirty(){
        if(this.contains(FIELD_ENABLEMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用模式
     */
    @JsonIgnore
    public void resetEnableMode(){
        this.reset(FIELD_ENABLEMODE);
    }

    /**
     * 设置 启用模式，详细说明：{@link #FIELD_ENABLEMODE}
     * <P>
     * 等同 {@link #setEnableMode}
     * @param enableMode
     */
    @JsonIgnore
    public PSDEDRDetail enablemode(String enableMode){
        this.setEnableMode(enableMode);
        return this;
    }

     /**
     * 设置 启用模式，详细说明：{@link #FIELD_ENABLEMODE}
     * <P>
     * 等同 {@link #setEnableMode}
     * @param enableMode
     */
    @JsonIgnore
    public PSDEDRDetail enablemode(net.ibizsys.psmodel.core.util.PSModelEnums.DEDRDetailEnableMode enableMode){
        if(enableMode == null){
            this.setEnableMode(null);
        }
        else{
            this.setEnableMode(enableMode.value);
        }
        return this;
    }

    /**
     * <B>GROUPORDERVALUE</B>&nbsp;分组排序值
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDRGROUPID}
     */
    public final static String FIELD_GROUPORDERVALUE = "groupordervalue";

    /**
     * 设置 分组排序值
     * 
     * @param groupOrderValue
     * 
     */
    @JsonProperty(FIELD_GROUPORDERVALUE)
    public void setGroupOrderValue(Integer groupOrderValue){
        this.set(FIELD_GROUPORDERVALUE, groupOrderValue);
    }
    
    /**
     * 获取 分组排序值  
     * @return
     */
    @JsonIgnore
    public Integer getGroupOrderValue(){
        Object objValue = this.get(FIELD_GROUPORDERVALUE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 分组排序值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupOrderValueDirty(){
        if(this.contains(FIELD_GROUPORDERVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组排序值
     */
    @JsonIgnore
    public void resetGroupOrderValue(){
        this.reset(FIELD_GROUPORDERVALUE);
    }

    /**
     * 设置 分组排序值
     * <P>
     * 等同 {@link #setGroupOrderValue}
     * @param groupOrderValue
     */
    @JsonIgnore
    public PSDEDRDetail groupordervalue(Integer groupOrderValue){
        this.setGroupOrderValue(groupOrderValue);
        return this;
    }

    /**
     * <B>HEADERPSSYSPFPLUGINID</B>&nbsp;头部应用插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysPFPlugin} 
     */
    public final static String FIELD_HEADERPSSYSPFPLUGINID = "headerpssyspfpluginid";

    /**
     * 设置 头部应用插件
     * 
     * @param headerPSSysPFPluginId
     * 
     */
    @JsonProperty(FIELD_HEADERPSSYSPFPLUGINID)
    public void setHeaderPSSysPFPluginId(String headerPSSysPFPluginId){
        this.set(FIELD_HEADERPSSYSPFPLUGINID, headerPSSysPFPluginId);
    }
    
    /**
     * 获取 头部应用插件  
     * @return
     */
    @JsonIgnore
    public String getHeaderPSSysPFPluginId(){
        Object objValue = this.get(FIELD_HEADERPSSYSPFPLUGINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 头部应用插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHeaderPSSysPFPluginIdDirty(){
        if(this.contains(FIELD_HEADERPSSYSPFPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 头部应用插件
     */
    @JsonIgnore
    public void resetHeaderPSSysPFPluginId(){
        this.reset(FIELD_HEADERPSSYSPFPLUGINID);
    }

    /**
     * 设置 头部应用插件
     * <P>
     * 等同 {@link #setHeaderPSSysPFPluginId}
     * @param headerPSSysPFPluginId
     */
    @JsonIgnore
    public PSDEDRDetail headerpssyspfpluginid(String headerPSSysPFPluginId){
        this.setHeaderPSSysPFPluginId(headerPSSysPFPluginId);
        return this;
    }

    /**
     * 设置 头部应用插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setHeaderPSSysPFPluginId}
     * @param pSSysPFPlugin 引用对象
     */
    @JsonIgnore
    public PSDEDRDetail headerpssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
        if(pSSysPFPlugin == null){
            this.setHeaderPSSysPFPluginId(null);
            this.setHeaderPSSysPFPluginName(null);
        }
        else{
            this.setHeaderPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setHeaderPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    /**
     * <B>HEADERPSSYSPFPLUGINNAME</B>&nbsp;头部应用插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_HEADERPSSYSPFPLUGINID}
     */
    public final static String FIELD_HEADERPSSYSPFPLUGINNAME = "headerpssyspfpluginname";

    /**
     * 设置 头部应用插件
     * 
     * @param headerPSSysPFPluginName
     * 
     */
    @JsonProperty(FIELD_HEADERPSSYSPFPLUGINNAME)
    public void setHeaderPSSysPFPluginName(String headerPSSysPFPluginName){
        this.set(FIELD_HEADERPSSYSPFPLUGINNAME, headerPSSysPFPluginName);
    }
    
    /**
     * 获取 头部应用插件  
     * @return
     */
    @JsonIgnore
    public String getHeaderPSSysPFPluginName(){
        Object objValue = this.get(FIELD_HEADERPSSYSPFPLUGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 头部应用插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHeaderPSSysPFPluginNameDirty(){
        if(this.contains(FIELD_HEADERPSSYSPFPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 头部应用插件
     */
    @JsonIgnore
    public void resetHeaderPSSysPFPluginName(){
        this.reset(FIELD_HEADERPSSYSPFPLUGINNAME);
    }

    /**
     * 设置 头部应用插件
     * <P>
     * 等同 {@link #setHeaderPSSysPFPluginName}
     * @param headerPSSysPFPluginName
     */
    @JsonIgnore
    public PSDEDRDetail headerpssyspfpluginname(String headerPSSysPFPluginName){
        this.setHeaderPSSysPFPluginName(headerPSSysPFPluginName);
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
    public PSDEDRDetail memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;排序值，指定关系界面组成员的显示次序
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
    public PSDEDRDetail ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSDEDRDETAILID</B>&nbsp;实体关系界面组成员标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEDRDETAILID = "psdedrdetailid";

    /**
     * 设置 实体关系界面组成员标识
     * 
     * @param pSDEDRDetailId
     * 
     */
    @JsonProperty(FIELD_PSDEDRDETAILID)
    public void setPSDEDRDetailId(String pSDEDRDetailId){
        this.set(FIELD_PSDEDRDETAILID, pSDEDRDetailId);
    }
    
    /**
     * 获取 实体关系界面组成员标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEDRDetailId(){
        Object objValue = this.get(FIELD_PSDEDRDETAILID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体关系界面组成员标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDRDetailIdDirty(){
        if(this.contains(FIELD_PSDEDRDETAILID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体关系界面组成员标识
     */
    @JsonIgnore
    public void resetPSDEDRDetailId(){
        this.reset(FIELD_PSDEDRDETAILID);
    }

    /**
     * 设置 实体关系界面组成员标识
     * <P>
     * 等同 {@link #setPSDEDRDetailId}
     * @param pSDEDRDetailId
     */
    @JsonIgnore
    public PSDEDRDetail psdedrdetailid(String pSDEDRDetailId){
        this.setPSDEDRDetailId(pSDEDRDetailId);
        return this;
    }

    /**
     * <B>PSDEDRDETAILNAME</B>&nbsp;成员标识，指定关系界面组成员标识，需要在所在的关系界面组中具有唯一性
     * <P>
     * 字符串：最大长度 20，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSDEDRDETAILNAME = "psdedrdetailname";

    /**
     * 设置 成员标识，详细说明：{@link #FIELD_PSDEDRDETAILNAME}
     * 
     * @param pSDEDRDetailName
     * 
     */
    @JsonProperty(FIELD_PSDEDRDETAILNAME)
    public void setPSDEDRDetailName(String pSDEDRDetailName){
        this.set(FIELD_PSDEDRDETAILNAME, pSDEDRDetailName);
    }
    
    /**
     * 获取 成员标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEDRDetailName(){
        Object objValue = this.get(FIELD_PSDEDRDETAILNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 成员标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDRDetailNameDirty(){
        if(this.contains(FIELD_PSDEDRDETAILNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 成员标识
     */
    @JsonIgnore
    public void resetPSDEDRDetailName(){
        this.reset(FIELD_PSDEDRDETAILNAME);
    }

    /**
     * 设置 成员标识，详细说明：{@link #FIELD_PSDEDRDETAILNAME}
     * <P>
     * 等同 {@link #setPSDEDRDetailName}
     * @param pSDEDRDetailName
     */
    @JsonIgnore
    public PSDEDRDetail psdedrdetailname(String pSDEDRDetailName){
        this.setPSDEDRDetailName(pSDEDRDetailName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEDRDetailName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEDRDetailName(strName);
    }

    @JsonIgnore
    public PSDEDRDetail name(String strName){
        this.setPSDEDRDetailName(strName);
        return this;
    }

    /**
     * <B>PSDEDRGROUPID</B>&nbsp;界面分组，指定关系界面组成员的显示分组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDRGroup} 
     */
    public final static String FIELD_PSDEDRGROUPID = "psdedrgroupid";

    /**
     * 设置 界面分组，详细说明：{@link #FIELD_PSDEDRGROUPID}
     * 
     * @param pSDEDRGroupId
     * 
     */
    @JsonProperty(FIELD_PSDEDRGROUPID)
    public void setPSDEDRGroupId(String pSDEDRGroupId){
        this.set(FIELD_PSDEDRGROUPID, pSDEDRGroupId);
    }
    
    /**
     * 获取 界面分组  
     * @return
     */
    @JsonIgnore
    public String getPSDEDRGroupId(){
        Object objValue = this.get(FIELD_PSDEDRGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面分组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDRGroupIdDirty(){
        if(this.contains(FIELD_PSDEDRGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面分组
     */
    @JsonIgnore
    public void resetPSDEDRGroupId(){
        this.reset(FIELD_PSDEDRGROUPID);
    }

    /**
     * 设置 界面分组，详细说明：{@link #FIELD_PSDEDRGROUPID}
     * <P>
     * 等同 {@link #setPSDEDRGroupId}
     * @param pSDEDRGroupId
     */
    @JsonIgnore
    public PSDEDRDetail psdedrgroupid(String pSDEDRGroupId){
        this.setPSDEDRGroupId(pSDEDRGroupId);
        return this;
    }

    /**
     * 设置 界面分组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDRGroupId}
     * @param pSDEDRGroup 引用对象
     */
    @JsonIgnore
    public PSDEDRDetail psdedrgroupid(PSDEDRGroup pSDEDRGroup){
        if(pSDEDRGroup == null){
            this.setGroupOrderValue(null);
            this.setPSDEDRGroupId(null);
            this.setPSDEDRGroupName(null);
        }
        else{
            this.setGroupOrderValue(pSDEDRGroup.getOrderValue());
            this.setPSDEDRGroupId(pSDEDRGroup.getPSDEDRGroupId());
            this.setPSDEDRGroupName(pSDEDRGroup.getPSDEDRGroupName());
        }
        return this;
    }

    /**
     * <B>PSDEDRGROUPNAME</B>&nbsp;关系分组，指定关系界面组成员的显示分组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDRGROUPID}
     */
    public final static String FIELD_PSDEDRGROUPNAME = "psdedrgroupname";

    /**
     * 设置 关系分组，详细说明：{@link #FIELD_PSDEDRGROUPNAME}
     * 
     * @param pSDEDRGroupName
     * 
     */
    @JsonProperty(FIELD_PSDEDRGROUPNAME)
    public void setPSDEDRGroupName(String pSDEDRGroupName){
        this.set(FIELD_PSDEDRGROUPNAME, pSDEDRGroupName);
    }
    
    /**
     * 获取 关系分组  
     * @return
     */
    @JsonIgnore
    public String getPSDEDRGroupName(){
        Object objValue = this.get(FIELD_PSDEDRGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系分组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDRGroupNameDirty(){
        if(this.contains(FIELD_PSDEDRGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系分组
     */
    @JsonIgnore
    public void resetPSDEDRGroupName(){
        this.reset(FIELD_PSDEDRGROUPNAME);
    }

    /**
     * 设置 关系分组，详细说明：{@link #FIELD_PSDEDRGROUPNAME}
     * <P>
     * 等同 {@link #setPSDEDRGroupName}
     * @param pSDEDRGroupName
     */
    @JsonIgnore
    public PSDEDRDetail psdedrgroupname(String pSDEDRGroupName){
        this.setPSDEDRGroupName(pSDEDRGroupName);
        return this;
    }

    /**
     * <B>PSDEDRID</B>&nbsp;关系界面组，指定关系界面组成员所在的关系界面组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataRelation} 
     */
    public final static String FIELD_PSDEDRID = "psdedrid";

    /**
     * 设置 关系界面组，详细说明：{@link #FIELD_PSDEDRID}
     * 
     * @param pSDEDRId
     * 
     */
    @JsonProperty(FIELD_PSDEDRID)
    public void setPSDEDRId(String pSDEDRId){
        this.set(FIELD_PSDEDRID, pSDEDRId);
    }
    
    /**
     * 获取 关系界面组  
     * @return
     */
    @JsonIgnore
    public String getPSDEDRId(){
        Object objValue = this.get(FIELD_PSDEDRID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系界面组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDRIdDirty(){
        if(this.contains(FIELD_PSDEDRID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系界面组
     */
    @JsonIgnore
    public void resetPSDEDRId(){
        this.reset(FIELD_PSDEDRID);
    }

    /**
     * 设置 关系界面组，详细说明：{@link #FIELD_PSDEDRID}
     * <P>
     * 等同 {@link #setPSDEDRId}
     * @param pSDEDRId
     */
    @JsonIgnore
    public PSDEDRDetail psdedrid(String pSDEDRId){
        this.setPSDEDRId(pSDEDRId);
        return this;
    }

    /**
     * 设置 关系界面组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDRId}
     * @param pSDEDataRelation 引用对象
     */
    @JsonIgnore
    public PSDEDRDetail psdedrid(PSDEDataRelation pSDEDataRelation){
        if(pSDEDataRelation == null){
            this.setPSDEDRId(null);
            this.setPSDEDRName(null);
            this.setPSDEId(null);
        }
        else{
            this.setPSDEDRId(pSDEDataRelation.getPSDEDataRelationId());
            this.setPSDEDRName(pSDEDataRelation.getPSDEDataRelationName());
            this.setPSDEId(pSDEDataRelation.getPSDEId());
        }
        return this;
    }

    /**
     * <B>PSDEDRITEMID</B>&nbsp;实体关系界面，成员类型为【关系界面】时指定来自当前实体的关系界面对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDRItem} 
     */
    public final static String FIELD_PSDEDRITEMID = "psdedritemid";

    /**
     * 设置 实体关系界面，详细说明：{@link #FIELD_PSDEDRITEMID}
     * 
     * @param pSDEDRItemId
     * 
     */
    @JsonProperty(FIELD_PSDEDRITEMID)
    public void setPSDEDRItemId(String pSDEDRItemId){
        this.set(FIELD_PSDEDRITEMID, pSDEDRItemId);
    }
    
    /**
     * 获取 实体关系界面  
     * @return
     */
    @JsonIgnore
    public String getPSDEDRItemId(){
        Object objValue = this.get(FIELD_PSDEDRITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体关系界面 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDRItemIdDirty(){
        if(this.contains(FIELD_PSDEDRITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体关系界面
     */
    @JsonIgnore
    public void resetPSDEDRItemId(){
        this.reset(FIELD_PSDEDRITEMID);
    }

    /**
     * 设置 实体关系界面，详细说明：{@link #FIELD_PSDEDRITEMID}
     * <P>
     * 等同 {@link #setPSDEDRItemId}
     * @param pSDEDRItemId
     */
    @JsonIgnore
    public PSDEDRDetail psdedritemid(String pSDEDRItemId){
        this.setPSDEDRItemId(pSDEDRItemId);
        return this;
    }

    /**
     * 设置 实体关系界面，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDRItemId}
     * @param pSDEDRItem 引用对象
     */
    @JsonIgnore
    public PSDEDRDetail psdedritemid(PSDEDRItem pSDEDRItem){
        if(pSDEDRItem == null){
            this.setPSDEDRItemId(null);
            this.setPSDEDRItemName(null);
        }
        else{
            this.setPSDEDRItemId(pSDEDRItem.getPSDEDRItemId());
            this.setPSDEDRItemName(pSDEDRItem.getPSDEDRItemName());
        }
        return this;
    }

    /**
     * <B>PSDEDRITEMNAME</B>&nbsp;关系界面，成员类型为【关系界面】时指定来自当前实体的关系界面对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDRITEMID}
     */
    public final static String FIELD_PSDEDRITEMNAME = "psdedritemname";

    /**
     * 设置 关系界面，详细说明：{@link #FIELD_PSDEDRITEMNAME}
     * 
     * @param pSDEDRItemName
     * 
     */
    @JsonProperty(FIELD_PSDEDRITEMNAME)
    public void setPSDEDRItemName(String pSDEDRItemName){
        this.set(FIELD_PSDEDRITEMNAME, pSDEDRItemName);
    }
    
    /**
     * 获取 关系界面  
     * @return
     */
    @JsonIgnore
    public String getPSDEDRItemName(){
        Object objValue = this.get(FIELD_PSDEDRITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系界面 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDRItemNameDirty(){
        if(this.contains(FIELD_PSDEDRITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系界面
     */
    @JsonIgnore
    public void resetPSDEDRItemName(){
        this.reset(FIELD_PSDEDRITEMNAME);
    }

    /**
     * 设置 关系界面，详细说明：{@link #FIELD_PSDEDRITEMNAME}
     * <P>
     * 等同 {@link #setPSDEDRItemName}
     * @param pSDEDRItemName
     */
    @JsonIgnore
    public PSDEDRDetail psdedritemname(String pSDEDRItemName){
        this.setPSDEDRItemName(pSDEDRItemName);
        return this;
    }

    /**
     * <B>PSDEDRNAME</B>&nbsp;关系界面组，指定关系界面组成员所在的关系界面组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDRID}
     */
    public final static String FIELD_PSDEDRNAME = "psdedrname";

    /**
     * 设置 关系界面组，详细说明：{@link #FIELD_PSDEDRNAME}
     * 
     * @param pSDEDRName
     * 
     */
    @JsonProperty(FIELD_PSDEDRNAME)
    public void setPSDEDRName(String pSDEDRName){
        this.set(FIELD_PSDEDRNAME, pSDEDRName);
    }
    
    /**
     * 获取 关系界面组  
     * @return
     */
    @JsonIgnore
    public String getPSDEDRName(){
        Object objValue = this.get(FIELD_PSDEDRNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系界面组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDRNameDirty(){
        if(this.contains(FIELD_PSDEDRNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系界面组
     */
    @JsonIgnore
    public void resetPSDEDRName(){
        this.reset(FIELD_PSDEDRNAME);
    }

    /**
     * 设置 关系界面组，详细说明：{@link #FIELD_PSDEDRNAME}
     * <P>
     * 等同 {@link #setPSDEDRName}
     * @param pSDEDRName
     */
    @JsonIgnore
    public PSDEDRDetail psdedrname(String pSDEDRName){
        this.setPSDEDRName(pSDEDRName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体编号
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDRID}
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 实体编号
     * 
     * @param pSDEId
     * 
     */
    @JsonProperty(FIELD_PSDEID)
    public void setPSDEId(String pSDEId){
        this.set(FIELD_PSDEID, pSDEId);
    }
    
    /**
     * 获取 实体编号  
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
     * 判断 实体编号 是否指定值，包括空值
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
     * 重置 实体编号
     */
    @JsonIgnore
    public void resetPSDEId(){
        this.reset(FIELD_PSDEID);
    }

    /**
     * 设置 实体编号
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSDEDRDetail psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * <B>PSDEOPPRIVID</B>&nbsp;实体操作标识，关系界面组成员启用模式为【操作标识】时指定关联的实体操作标识，未定义时使用关系界面的定义
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEOPPriv} 
     */
    public final static String FIELD_PSDEOPPRIVID = "psdeopprivid";

    /**
     * 设置 实体操作标识，详细说明：{@link #FIELD_PSDEOPPRIVID}
     * 
     * @param pSDEOPPrivId
     * 
     */
    @JsonProperty(FIELD_PSDEOPPRIVID)
    public void setPSDEOPPrivId(String pSDEOPPrivId){
        this.set(FIELD_PSDEOPPRIVID, pSDEOPPrivId);
    }
    
    /**
     * 获取 实体操作标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEOPPrivId(){
        Object objValue = this.get(FIELD_PSDEOPPRIVID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体操作标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEOPPrivIdDirty(){
        if(this.contains(FIELD_PSDEOPPRIVID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体操作标识
     */
    @JsonIgnore
    public void resetPSDEOPPrivId(){
        this.reset(FIELD_PSDEOPPRIVID);
    }

    /**
     * 设置 实体操作标识，详细说明：{@link #FIELD_PSDEOPPRIVID}
     * <P>
     * 等同 {@link #setPSDEOPPrivId}
     * @param pSDEOPPrivId
     */
    @JsonIgnore
    public PSDEDRDetail psdeopprivid(String pSDEOPPrivId){
        this.setPSDEOPPrivId(pSDEOPPrivId);
        return this;
    }

    /**
     * 设置 实体操作标识，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEOPPrivId}
     * @param pSDEOPPriv 引用对象
     */
    @JsonIgnore
    public PSDEDRDetail psdeopprivid(PSDEOPPriv pSDEOPPriv){
        if(pSDEOPPriv == null){
            this.setPSDEOPPrivId(null);
            this.setPSDEOPPrivName(null);
        }
        else{
            this.setPSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setPSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    /**
     * <B>PSDEOPPRIVNAME</B>&nbsp;实体操作标识，关系界面组成员启用模式为【操作标识】时指定关联的实体操作标识，未定义时使用关系界面的定义
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEOPPRIVID}
     */
    public final static String FIELD_PSDEOPPRIVNAME = "psdeopprivname";

    /**
     * 设置 实体操作标识，详细说明：{@link #FIELD_PSDEOPPRIVNAME}
     * 
     * @param pSDEOPPrivName
     * 
     */
    @JsonProperty(FIELD_PSDEOPPRIVNAME)
    public void setPSDEOPPrivName(String pSDEOPPrivName){
        this.set(FIELD_PSDEOPPRIVNAME, pSDEOPPrivName);
    }
    
    /**
     * 获取 实体操作标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEOPPrivName(){
        Object objValue = this.get(FIELD_PSDEOPPRIVNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体操作标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEOPPrivNameDirty(){
        if(this.contains(FIELD_PSDEOPPRIVNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体操作标识
     */
    @JsonIgnore
    public void resetPSDEOPPrivName(){
        this.reset(FIELD_PSDEOPPRIVNAME);
    }

    /**
     * 设置 实体操作标识，详细说明：{@link #FIELD_PSDEOPPRIVNAME}
     * <P>
     * 等同 {@link #setPSDEOPPrivName}
     * @param pSDEOPPrivName
     */
    @JsonIgnore
    public PSDEDRDetail psdeopprivname(String pSDEOPPrivName){
        this.setPSDEOPPrivName(pSDEOPPrivName);
        return this;
    }

    /**
     * <B>PSDETREEVIEWID</B>&nbsp;数据树视图，指定关系界面分组成员的更多关系数据展示树视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDETreeView} 
     */
    public final static String FIELD_PSDETREEVIEWID = "psdetreeviewid";

    /**
     * 设置 数据树视图，详细说明：{@link #FIELD_PSDETREEVIEWID}
     * 
     * @param pSDETreeViewId
     * 
     */
    @JsonProperty(FIELD_PSDETREEVIEWID)
    public void setPSDETreeViewId(String pSDETreeViewId){
        this.set(FIELD_PSDETREEVIEWID, pSDETreeViewId);
    }
    
    /**
     * 获取 数据树视图  
     * @return
     */
    @JsonIgnore
    public String getPSDETreeViewId(){
        Object objValue = this.get(FIELD_PSDETREEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据树视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDETreeViewIdDirty(){
        if(this.contains(FIELD_PSDETREEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据树视图
     */
    @JsonIgnore
    public void resetPSDETreeViewId(){
        this.reset(FIELD_PSDETREEVIEWID);
    }

    /**
     * 设置 数据树视图，详细说明：{@link #FIELD_PSDETREEVIEWID}
     * <P>
     * 等同 {@link #setPSDETreeViewId}
     * @param pSDETreeViewId
     */
    @JsonIgnore
    public PSDEDRDetail psdetreeviewid(String pSDETreeViewId){
        this.setPSDETreeViewId(pSDETreeViewId);
        return this;
    }

    /**
     * 设置 数据树视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDETreeViewId}
     * @param pSDETreeView 引用对象
     */
    @JsonIgnore
    public PSDEDRDetail psdetreeviewid(PSDETreeView pSDETreeView){
        if(pSDETreeView == null){
            this.setPSDETreeViewId(null);
            this.setPSDETreeViewName(null);
        }
        else{
            this.setPSDETreeViewId(pSDETreeView.getPSDETreeViewId());
            this.setPSDETreeViewName(pSDETreeView.getPSDETreeViewName());
        }
        return this;
    }

    /**
     * <B>PSDETREEVIEWNAME</B>&nbsp;数据树视图，指定关系界面分组成员的更多关系数据展示树视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDETREEVIEWID}
     */
    public final static String FIELD_PSDETREEVIEWNAME = "psdetreeviewname";

    /**
     * 设置 数据树视图，详细说明：{@link #FIELD_PSDETREEVIEWNAME}
     * 
     * @param pSDETreeViewName
     * 
     */
    @JsonProperty(FIELD_PSDETREEVIEWNAME)
    public void setPSDETreeViewName(String pSDETreeViewName){
        this.set(FIELD_PSDETREEVIEWNAME, pSDETreeViewName);
    }
    
    /**
     * 获取 数据树视图  
     * @return
     */
    @JsonIgnore
    public String getPSDETreeViewName(){
        Object objValue = this.get(FIELD_PSDETREEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据树视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDETreeViewNameDirty(){
        if(this.contains(FIELD_PSDETREEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据树视图
     */
    @JsonIgnore
    public void resetPSDETreeViewName(){
        this.reset(FIELD_PSDETREEVIEWNAME);
    }

    /**
     * 设置 数据树视图，详细说明：{@link #FIELD_PSDETREEVIEWNAME}
     * <P>
     * 等同 {@link #setPSDETreeViewName}
     * @param pSDETreeViewName
     */
    @JsonIgnore
    public PSDEDRDetail psdetreeviewname(String pSDETreeViewName){
        this.setPSDETreeViewName(pSDETreeViewName);
        return this;
    }

    /**
     * <B>PSSYSCSSID</B>&nbsp;系统样式表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCss} 
     */
    public final static String FIELD_PSSYSCSSID = "pssyscssid";

    /**
     * 设置 系统样式表
     * 
     * @param pSSysCssId
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSID)
    public void setPSSysCssId(String pSSysCssId){
        this.set(FIELD_PSSYSCSSID, pSSysCssId);
    }
    
    /**
     * 获取 系统样式表  
     * @return
     */
    @JsonIgnore
    public String getPSSysCssId(){
        Object objValue = this.get(FIELD_PSSYSCSSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCssIdDirty(){
        if(this.contains(FIELD_PSSYSCSSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统样式表
     */
    @JsonIgnore
    public void resetPSSysCssId(){
        this.reset(FIELD_PSSYSCSSID);
    }

    /**
     * 设置 系统样式表
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCssId
     */
    @JsonIgnore
    public PSDEDRDetail pssyscssid(String pSSysCssId){
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    /**
     * 设置 系统样式表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSDEDRDetail pssyscssid(PSSysCss pSSysCss){
        if(pSSysCss == null){
            this.setPSSysCssId(null);
            this.setPSSysCssName(null);
        }
        else{
            this.setPSSysCssId(pSSysCss.getPSSysCssId());
            this.setPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    /**
     * <B>PSSYSCSSNAME</B>&nbsp;系统样式表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSCSSID}
     */
    public final static String FIELD_PSSYSCSSNAME = "pssyscssname";

    /**
     * 设置 系统样式表
     * 
     * @param pSSysCssName
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSNAME)
    public void setPSSysCssName(String pSSysCssName){
        this.set(FIELD_PSSYSCSSNAME, pSSysCssName);
    }
    
    /**
     * 获取 系统样式表  
     * @return
     */
    @JsonIgnore
    public String getPSSysCssName(){
        Object objValue = this.get(FIELD_PSSYSCSSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCssNameDirty(){
        if(this.contains(FIELD_PSSYSCSSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统样式表
     */
    @JsonIgnore
    public void resetPSSysCssName(){
        this.reset(FIELD_PSSYSCSSNAME);
    }

    /**
     * 设置 系统样式表
     * <P>
     * 等同 {@link #setPSSysCssName}
     * @param pSSysCssName
     */
    @JsonIgnore
    public PSDEDRDetail pssyscssname(String pSSysCssName){
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    /**
     * <B>PSSYSIMAGEID</B>&nbsp;显示图标资源，指定关系界面组成员的展示图标，未定义时使用关系界面的定义
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysImage} 
     */
    public final static String FIELD_PSSYSIMAGEID = "pssysimageid";

    /**
     * 设置 显示图标资源，详细说明：{@link #FIELD_PSSYSIMAGEID}
     * 
     * @param pSSysImageId
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGEID)
    public void setPSSysImageId(String pSSysImageId){
        this.set(FIELD_PSSYSIMAGEID, pSSysImageId);
    }
    
    /**
     * 获取 显示图标资源  
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
     * 判断 显示图标资源 是否指定值，包括空值
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
     * 重置 显示图标资源
     */
    @JsonIgnore
    public void resetPSSysImageId(){
        this.reset(FIELD_PSSYSIMAGEID);
    }

    /**
     * 设置 显示图标资源，详细说明：{@link #FIELD_PSSYSIMAGEID}
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImageId
     */
    @JsonIgnore
    public PSDEDRDetail pssysimageid(String pSSysImageId){
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    /**
     * 设置 显示图标资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImage 引用对象
     */
    @JsonIgnore
    public PSDEDRDetail pssysimageid(PSSysImage pSSysImage){
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
     * <B>PSSYSIMAGENAME</B>&nbsp;显示图标资源，指定关系界面组成员的展示图标，未定义时使用关系界面的定义
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSIMAGEID}
     */
    public final static String FIELD_PSSYSIMAGENAME = "pssysimagename";

    /**
     * 设置 显示图标资源，详细说明：{@link #FIELD_PSSYSIMAGENAME}
     * 
     * @param pSSysImageName
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGENAME)
    public void setPSSysImageName(String pSSysImageName){
        this.set(FIELD_PSSYSIMAGENAME, pSSysImageName);
    }
    
    /**
     * 获取 显示图标资源  
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
     * 判断 显示图标资源 是否指定值，包括空值
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
     * 重置 显示图标资源
     */
    @JsonIgnore
    public void resetPSSysImageName(){
        this.reset(FIELD_PSSYSIMAGENAME);
    }

    /**
     * 设置 显示图标资源，详细说明：{@link #FIELD_PSSYSIMAGENAME}
     * <P>
     * 等同 {@link #setPSSysImageName}
     * @param pSSysImageName
     */
    @JsonIgnore
    public PSDEDRDetail pssysimagename(String pSSysImageName){
        this.setPSSysImageName(pSSysImageName);
        return this;
    }

    /**
     * <B>PSSYSPDTVIEWID</B>&nbsp;系统预置视图，关系界面组成员类型为【预置视图】时指定当前系统定义的预置视图对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysPDTView} 
     */
    public final static String FIELD_PSSYSPDTVIEWID = "pssyspdtviewid";

    /**
     * 设置 系统预置视图，详细说明：{@link #FIELD_PSSYSPDTVIEWID}
     * 
     * @param pSSysPDTViewId
     * 
     */
    @JsonProperty(FIELD_PSSYSPDTVIEWID)
    public void setPSSysPDTViewId(String pSSysPDTViewId){
        this.set(FIELD_PSSYSPDTVIEWID, pSSysPDTViewId);
    }
    
    /**
     * 获取 系统预置视图  
     * @return
     */
    @JsonIgnore
    public String getPSSysPDTViewId(){
        Object objValue = this.get(FIELD_PSSYSPDTVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统预置视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysPDTViewIdDirty(){
        if(this.contains(FIELD_PSSYSPDTVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统预置视图
     */
    @JsonIgnore
    public void resetPSSysPDTViewId(){
        this.reset(FIELD_PSSYSPDTVIEWID);
    }

    /**
     * 设置 系统预置视图，详细说明：{@link #FIELD_PSSYSPDTVIEWID}
     * <P>
     * 等同 {@link #setPSSysPDTViewId}
     * @param pSSysPDTViewId
     */
    @JsonIgnore
    public PSDEDRDetail pssyspdtviewid(String pSSysPDTViewId){
        this.setPSSysPDTViewId(pSSysPDTViewId);
        return this;
    }

    /**
     * 设置 系统预置视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysPDTViewId}
     * @param pSSysPDTView 引用对象
     */
    @JsonIgnore
    public PSDEDRDetail pssyspdtviewid(PSSysPDTView pSSysPDTView){
        if(pSSysPDTView == null){
            this.setPSSysPDTViewId(null);
            this.setPSSysPDTViewName(null);
        }
        else{
            this.setPSSysPDTViewId(pSSysPDTView.getPSSysPDTViewId());
            this.setPSSysPDTViewName(pSSysPDTView.getPSSysPDTViewName());
        }
        return this;
    }

    /**
     * <B>PSSYSPDTVIEWNAME</B>&nbsp;系统预置视图，关系界面组成员类型为【预置视图】时指定当前系统定义的预置视图对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSPDTVIEWID}
     */
    public final static String FIELD_PSSYSPDTVIEWNAME = "pssyspdtviewname";

    /**
     * 设置 系统预置视图，详细说明：{@link #FIELD_PSSYSPDTVIEWNAME}
     * 
     * @param pSSysPDTViewName
     * 
     */
    @JsonProperty(FIELD_PSSYSPDTVIEWNAME)
    public void setPSSysPDTViewName(String pSSysPDTViewName){
        this.set(FIELD_PSSYSPDTVIEWNAME, pSSysPDTViewName);
    }
    
    /**
     * 获取 系统预置视图  
     * @return
     */
    @JsonIgnore
    public String getPSSysPDTViewName(){
        Object objValue = this.get(FIELD_PSSYSPDTVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统预置视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysPDTViewNameDirty(){
        if(this.contains(FIELD_PSSYSPDTVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统预置视图
     */
    @JsonIgnore
    public void resetPSSysPDTViewName(){
        this.reset(FIELD_PSSYSPDTVIEWNAME);
    }

    /**
     * 设置 系统预置视图，详细说明：{@link #FIELD_PSSYSPDTVIEWNAME}
     * <P>
     * 等同 {@link #setPSSysPDTViewName}
     * @param pSSysPDTViewName
     */
    @JsonIgnore
    public PSDEDRDetail pssyspdtviewname(String pSSysPDTViewName){
        this.setPSSysPDTViewName(pSSysPDTViewName);
        return this;
    }

    /**
     * <B>TESTCUSTOMCODE</B>&nbsp;判断自定义代码
     */
    public final static String FIELD_TESTCUSTOMCODE = "testcustomcode";

    /**
     * 设置 判断自定义代码
     * 
     * @param testCustomCode
     * 
     */
    @JsonProperty(FIELD_TESTCUSTOMCODE)
    public void setTestCustomCode(String testCustomCode){
        this.set(FIELD_TESTCUSTOMCODE, testCustomCode);
    }
    
    /**
     * 获取 判断自定义代码  
     * @return
     */
    @JsonIgnore
    public String getTestCustomCode(){
        Object objValue = this.get(FIELD_TESTCUSTOMCODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 判断自定义代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTestCustomCodeDirty(){
        if(this.contains(FIELD_TESTCUSTOMCODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 判断自定义代码
     */
    @JsonIgnore
    public void resetTestCustomCode(){
        this.reset(FIELD_TESTCUSTOMCODE);
    }

    /**
     * 设置 判断自定义代码
     * <P>
     * 等同 {@link #setTestCustomCode}
     * @param testCustomCode
     */
    @JsonIgnore
    public PSDEDRDetail testcustomcode(String testCustomCode){
        this.setTestCustomCode(testCustomCode);
        return this;
    }

    /**
     * <B>TESTPSDEACTIONID</B>&nbsp;判断启用实体行为，关系界面组成员启用模式为【实体行为判断】时指定判断的实体行为，未定义时使用关系界面的定义
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_TESTPSDEACTIONID = "testpsdeactionid";

    /**
     * 设置 判断启用实体行为，详细说明：{@link #FIELD_TESTPSDEACTIONID}
     * 
     * @param testPSDEActionId
     * 
     */
    @JsonProperty(FIELD_TESTPSDEACTIONID)
    public void setTestPSDEActionId(String testPSDEActionId){
        this.set(FIELD_TESTPSDEACTIONID, testPSDEActionId);
    }
    
    /**
     * 获取 判断启用实体行为  
     * @return
     */
    @JsonIgnore
    public String getTestPSDEActionId(){
        Object objValue = this.get(FIELD_TESTPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 判断启用实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTestPSDEActionIdDirty(){
        if(this.contains(FIELD_TESTPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 判断启用实体行为
     */
    @JsonIgnore
    public void resetTestPSDEActionId(){
        this.reset(FIELD_TESTPSDEACTIONID);
    }

    /**
     * 设置 判断启用实体行为，详细说明：{@link #FIELD_TESTPSDEACTIONID}
     * <P>
     * 等同 {@link #setTestPSDEActionId}
     * @param testPSDEActionId
     */
    @JsonIgnore
    public PSDEDRDetail testpsdeactionid(String testPSDEActionId){
        this.setTestPSDEActionId(testPSDEActionId);
        return this;
    }

    /**
     * 设置 判断启用实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTestPSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDEDRDetail testpsdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setTestPSDEActionId(null);
            this.setTestPSDEActionName(null);
        }
        else{
            this.setTestPSDEActionId(pSDEAction.getPSDEActionId());
            this.setTestPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>TESTPSDEACTIONNAME</B>&nbsp;判断启用实体行为，关系界面组成员启用模式为【实体行为判断】时指定判断的实体行为，未定义时使用关系界面的定义
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TESTPSDEACTIONID}
     */
    public final static String FIELD_TESTPSDEACTIONNAME = "testpsdeactionname";

    /**
     * 设置 判断启用实体行为，详细说明：{@link #FIELD_TESTPSDEACTIONNAME}
     * 
     * @param testPSDEActionName
     * 
     */
    @JsonProperty(FIELD_TESTPSDEACTIONNAME)
    public void setTestPSDEActionName(String testPSDEActionName){
        this.set(FIELD_TESTPSDEACTIONNAME, testPSDEActionName);
    }
    
    /**
     * 获取 判断启用实体行为  
     * @return
     */
    @JsonIgnore
    public String getTestPSDEActionName(){
        Object objValue = this.get(FIELD_TESTPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 判断启用实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTestPSDEActionNameDirty(){
        if(this.contains(FIELD_TESTPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 判断启用实体行为
     */
    @JsonIgnore
    public void resetTestPSDEActionName(){
        this.reset(FIELD_TESTPSDEACTIONNAME);
    }

    /**
     * 设置 判断启用实体行为，详细说明：{@link #FIELD_TESTPSDEACTIONNAME}
     * <P>
     * 等同 {@link #setTestPSDEActionName}
     * @param testPSDEActionName
     */
    @JsonIgnore
    public PSDEDRDetail testpsdeactionname(String testPSDEActionName){
        this.setTestPSDEActionName(testPSDEActionName);
        return this;
    }

    /**
     * <B>TESTPSDELOGICID</B>&nbsp;判断输出实体逻辑
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDELogic} 
     */
    public final static String FIELD_TESTPSDELOGICID = "testpsdelogicid";

    /**
     * 设置 判断输出实体逻辑
     * 
     * @param testPSDELogicId
     * 
     */
    @JsonProperty(FIELD_TESTPSDELOGICID)
    public void setTestPSDELogicId(String testPSDELogicId){
        this.set(FIELD_TESTPSDELOGICID, testPSDELogicId);
    }
    
    /**
     * 获取 判断输出实体逻辑  
     * @return
     */
    @JsonIgnore
    public String getTestPSDELogicId(){
        Object objValue = this.get(FIELD_TESTPSDELOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 判断输出实体逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTestPSDELogicIdDirty(){
        if(this.contains(FIELD_TESTPSDELOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 判断输出实体逻辑
     */
    @JsonIgnore
    public void resetTestPSDELogicId(){
        this.reset(FIELD_TESTPSDELOGICID);
    }

    /**
     * 设置 判断输出实体逻辑
     * <P>
     * 等同 {@link #setTestPSDELogicId}
     * @param testPSDELogicId
     */
    @JsonIgnore
    public PSDEDRDetail testpsdelogicid(String testPSDELogicId){
        this.setTestPSDELogicId(testPSDELogicId);
        return this;
    }

    /**
     * 设置 判断输出实体逻辑，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTestPSDELogicId}
     * @param pSDELogic 引用对象
     */
    @JsonIgnore
    public PSDEDRDetail testpsdelogicid(PSDELogic pSDELogic){
        if(pSDELogic == null){
            this.setTestPSDELogicId(null);
            this.setTestPSDELogicName(null);
        }
        else{
            this.setTestPSDELogicId(pSDELogic.getPSDELogicId());
            this.setTestPSDELogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    /**
     * <B>TESTPSDELOGICNAME</B>&nbsp;判断输出实体逻辑
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TESTPSDELOGICID}
     */
    public final static String FIELD_TESTPSDELOGICNAME = "testpsdelogicname";

    /**
     * 设置 判断输出实体逻辑
     * 
     * @param testPSDELogicName
     * 
     */
    @JsonProperty(FIELD_TESTPSDELOGICNAME)
    public void setTestPSDELogicName(String testPSDELogicName){
        this.set(FIELD_TESTPSDELOGICNAME, testPSDELogicName);
    }
    
    /**
     * 获取 判断输出实体逻辑  
     * @return
     */
    @JsonIgnore
    public String getTestPSDELogicName(){
        Object objValue = this.get(FIELD_TESTPSDELOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 判断输出实体逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTestPSDELogicNameDirty(){
        if(this.contains(FIELD_TESTPSDELOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 判断输出实体逻辑
     */
    @JsonIgnore
    public void resetTestPSDELogicName(){
        this.reset(FIELD_TESTPSDELOGICNAME);
    }

    /**
     * 设置 判断输出实体逻辑
     * <P>
     * 等同 {@link #setTestPSDELogicName}
     * @param testPSDELogicName
     */
    @JsonIgnore
    public PSDEDRDetail testpsdelogicname(String testPSDELogicName){
        this.setTestPSDELogicName(testPSDELogicName);
        return this;
    }

    /**
     * <B>TIPPSLANRESID</B>&nbsp;提示语言资源，指定关系界面组成员提示信息的多语言资源对象，未定义时使用引用界面的定义
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
    public PSDEDRDetail tippslanresid(String tipPSLanResId){
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
    public PSDEDRDetail tippslanresid(PSLanguageRes pSLanguageRes){
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
     * <B>TIPPSLANRESNAME</B>&nbsp;提示语言资源，指定关系界面组成员提示信息的多语言资源对象，未定义时使用引用界面的定义
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
    public PSDEDRDetail tippslanresname(String tipPSLanResName){
        this.setTipPSLanResName(tipPSLanResName);
        return this;
    }

    /**
     * <B>TOOLTIPINFO</B>&nbsp;提示信息，指定关系界面组成员的提示信息，未定义时使用引用界面的定义
     * <P>
     * 字符串：最大长度 2000
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
    public PSDEDRDetail tooltipinfo(String tooltipInfo){
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
    public PSDEDRDetail updatedate(String updateDate){
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
    public PSDEDRDetail updateman(String updateMan){
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
    public PSDEDRDetail usercat(String userCat){
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
    public PSDEDRDetail usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDEDRDetail usertag(String userTag){
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
    public PSDEDRDetail usertag2(String userTag2){
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
    public PSDEDRDetail usertag3(String userTag3){
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
    public PSDEDRDetail usertag4(String userTag4){
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
    public PSDEDRDetail validflag(Integer validFlag){
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
    public PSDEDRDetail validflag(Boolean validFlag){
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
        return this.getPSDEDRDetailId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEDRDetailId(strValue);
    }

    @JsonIgnore
    public PSDEDRDetail id(String strValue){
        this.setPSDEDRDetailId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEDRDetail){
            PSDEDRDetail model = (PSDEDRDetail)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
