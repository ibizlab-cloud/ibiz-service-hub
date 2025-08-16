package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEDRGROUP</B>实体关系界面分组 模型传输对象
 * <P>
 * 实体关系界面分组模型，定义实体的关系界面的分组信息
 */
public class PSDEDRGroup extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEDRGroup(){
    }      

    /**
     * <B>CAPPSLANRESID</B>&nbsp;标题语言资源，指定标题的多语言资源对象
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
    public PSDEDRGroup cappslanresid(String capPSLanResId){
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
    public PSDEDRGroup cappslanresid(PSLanguageRes pSLanguageRes){
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
     * <B>CAPPSLANRESNAME</B>&nbsp;标题语言资源，指定标题的多语言资源对象
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
    public PSDEDRGroup cappslanresname(String capPSLanResName){
        this.setCapPSLanResName(capPSLanResName);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定关系界面分组的代码标识，需要在所在的实体中具有唯一性
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
    public PSDEDRGroup codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>COUNTERID</B>&nbsp;计数器标识
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_COUNTERID = "counterid";

    /**
     * 设置 计数器标识
     * 
     * @param counterId
     * 
     */
    @JsonProperty(FIELD_COUNTERID)
    public void setCounterId(String counterId){
        this.set(FIELD_COUNTERID, counterId);
    }
    
    /**
     * 获取 计数器标识  
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
     * 判断 计数器标识 是否指定值，包括空值
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
     * 重置 计数器标识
     */
    @JsonIgnore
    public void resetCounterId(){
        this.reset(FIELD_COUNTERID);
    }

    /**
     * 设置 计数器标识
     * <P>
     * 等同 {@link #setCounterId}
     * @param counterId
     */
    @JsonIgnore
    public PSDEDRGroup counterid(String counterId){
        this.setCounterId(counterId);
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
    public PSDEDRGroup createdate(String createDate){
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
    public PSDEDRGroup createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>GROUPTAG</B>&nbsp;分组标记
     * <P>
     * 字符串：最大长度 100
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
    public PSDEDRGroup grouptag(String groupTag){
        this.setGroupTag(groupTag);
        return this;
    }

    /**
     * <B>GROUPTAG2</B>&nbsp;分组标记2
     * <P>
     * 字符串：最大长度 100
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
    public PSDEDRGroup grouptag2(String groupTag2){
        this.setGroupTag2(groupTag2);
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
    public PSDEDRGroup headerpssyspfpluginid(String headerPSSysPFPluginId){
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
    public PSDEDRGroup headerpssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
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
    public PSDEDRGroup headerpssyspfpluginname(String headerPSSysPFPluginName){
        this.setHeaderPSSysPFPluginName(headerPSSysPFPluginName);
        return this;
    }

    /**
     * <B>HIDDENFLAG</B>&nbsp;隐藏分组，指定是否隐藏分组，在关系栏部件隐藏分组将不输出分组目录，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_HIDDENFLAG = "hiddenflag";

    /**
     * 设置 隐藏分组，详细说明：{@link #FIELD_HIDDENFLAG}
     * 
     * @param hiddenFlag
     * 
     */
    @JsonProperty(FIELD_HIDDENFLAG)
    public void setHiddenFlag(Integer hiddenFlag){
        this.set(FIELD_HIDDENFLAG, hiddenFlag);
    }
    
    /**
     * 获取 隐藏分组  
     * @return
     */
    @JsonIgnore
    public Integer getHiddenFlag(){
        Object objValue = this.get(FIELD_HIDDENFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 隐藏分组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHiddenFlagDirty(){
        if(this.contains(FIELD_HIDDENFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 隐藏分组
     */
    @JsonIgnore
    public void resetHiddenFlag(){
        this.reset(FIELD_HIDDENFLAG);
    }

    /**
     * 设置 隐藏分组，详细说明：{@link #FIELD_HIDDENFLAG}
     * <P>
     * 等同 {@link #setHiddenFlag}
     * @param hiddenFlag
     */
    @JsonIgnore
    public PSDEDRGroup hiddenflag(Integer hiddenFlag){
        this.setHiddenFlag(hiddenFlag);
        return this;
    }

     /**
     * 设置 隐藏分组，详细说明：{@link #FIELD_HIDDENFLAG}
     * <P>
     * 等同 {@link #setHiddenFlag}
     * @param hiddenFlag
     */
    @JsonIgnore
    public PSDEDRGroup hiddenflag(Boolean hiddenFlag){
        if(hiddenFlag == null){
            this.setHiddenFlag(null);
        }
        else{
            this.setHiddenFlag(hiddenFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSDEDRGroup memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;默认显示次序，指定分组的默认显示次序
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 默认显示次序，详细说明：{@link #FIELD_ORDERVALUE}
     * 
     * @param orderValue
     * 
     */
    @JsonProperty(FIELD_ORDERVALUE)
    public void setOrderValue(Integer orderValue){
        this.set(FIELD_ORDERVALUE, orderValue);
    }
    
    /**
     * 获取 默认显示次序  
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
     * 判断 默认显示次序 是否指定值，包括空值
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
     * 重置 默认显示次序
     */
    @JsonIgnore
    public void resetOrderValue(){
        this.reset(FIELD_ORDERVALUE);
    }

    /**
     * 设置 默认显示次序，详细说明：{@link #FIELD_ORDERVALUE}
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSDEDRGroup ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSDEDRGROUPID</B>&nbsp;实体数据关系分组标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEDRGROUPID = "psdedrgroupid";

    /**
     * 设置 实体数据关系分组标识
     * 
     * @param pSDEDRGroupId
     * 
     */
    @JsonProperty(FIELD_PSDEDRGROUPID)
    public void setPSDEDRGroupId(String pSDEDRGroupId){
        this.set(FIELD_PSDEDRGROUPID, pSDEDRGroupId);
    }
    
    /**
     * 获取 实体数据关系分组标识  
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
     * 判断 实体数据关系分组标识 是否指定值，包括空值
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
     * 重置 实体数据关系分组标识
     */
    @JsonIgnore
    public void resetPSDEDRGroupId(){
        this.reset(FIELD_PSDEDRGROUPID);
    }

    /**
     * 设置 实体数据关系分组标识
     * <P>
     * 等同 {@link #setPSDEDRGroupId}
     * @param pSDEDRGroupId
     */
    @JsonIgnore
    public PSDEDRGroup psdedrgroupid(String pSDEDRGroupId){
        this.setPSDEDRGroupId(pSDEDRGroupId);
        return this;
    }

    /**
     * <B>PSDEDRGROUPNAME</B>&nbsp;分组标题，指定分组标题
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEDRGROUPNAME = "psdedrgroupname";

    /**
     * 设置 分组标题，详细说明：{@link #FIELD_PSDEDRGROUPNAME}
     * 
     * @param pSDEDRGroupName
     * 
     */
    @JsonProperty(FIELD_PSDEDRGROUPNAME)
    public void setPSDEDRGroupName(String pSDEDRGroupName){
        this.set(FIELD_PSDEDRGROUPNAME, pSDEDRGroupName);
    }
    
    /**
     * 获取 分组标题  
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
     * 判断 分组标题 是否指定值，包括空值
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
     * 重置 分组标题
     */
    @JsonIgnore
    public void resetPSDEDRGroupName(){
        this.reset(FIELD_PSDEDRGROUPNAME);
    }

    /**
     * 设置 分组标题，详细说明：{@link #FIELD_PSDEDRGROUPNAME}
     * <P>
     * 等同 {@link #setPSDEDRGroupName}
     * @param pSDEDRGroupName
     */
    @JsonIgnore
    public PSDEDRGroup psdedrgroupname(String pSDEDRGroupName){
        this.setPSDEDRGroupName(pSDEDRGroupName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEDRGroupName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEDRGroupName(strName);
    }

    @JsonIgnore
    public PSDEDRGroup name(String strName){
        this.setPSDEDRGroupName(strName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定关系界面分组所在实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 实体，详细说明：{@link #FIELD_PSDEID}
     * 
     * @param pSDEId
     * 
     */
    @JsonProperty(FIELD_PSDEID)
    public void setPSDEId(String pSDEId){
        this.set(FIELD_PSDEID, pSDEId);
    }
    
    /**
     * 获取 实体  
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
     * 判断 实体 是否指定值，包括空值
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
     * 重置 实体
     */
    @JsonIgnore
    public void resetPSDEId(){
        this.reset(FIELD_PSDEID);
    }

    /**
     * 设置 实体，详细说明：{@link #FIELD_PSDEID}
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSDEDRGroup psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * 设置 实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDEDRGroup psdeid(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setPSDEId(null);
            this.setPSDEName(null);
        }
        else{
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>PSDENAME</B>&nbsp;实体，指定关系界面分组所在实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_PSDENAME = "psdename";

    /**
     * 设置 实体，详细说明：{@link #FIELD_PSDENAME}
     * 
     * @param pSDEName
     * 
     */
    @JsonProperty(FIELD_PSDENAME)
    public void setPSDEName(String pSDEName){
        this.set(FIELD_PSDENAME, pSDEName);
    }
    
    /**
     * 获取 实体  
     * @return
     */
    @JsonIgnore
    public String getPSDEName(){
        Object objValue = this.get(FIELD_PSDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDENameDirty(){
        if(this.contains(FIELD_PSDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体
     */
    @JsonIgnore
    public void resetPSDEName(){
        this.reset(FIELD_PSDENAME);
    }

    /**
     * 设置 实体，详细说明：{@link #FIELD_PSDENAME}
     * <P>
     * 等同 {@link #setPSDEName}
     * @param pSDEName
     */
    @JsonIgnore
    public PSDEDRGroup psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSSYSCOUNTERID</B>&nbsp;系统计数器，指定分组默认使用的计数器对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCounter} 
     */
    public final static String FIELD_PSSYSCOUNTERID = "pssyscounterid";

    /**
     * 设置 系统计数器，详细说明：{@link #FIELD_PSSYSCOUNTERID}
     * 
     * @param pSSysCounterId
     * 
     */
    @JsonProperty(FIELD_PSSYSCOUNTERID)
    public void setPSSysCounterId(String pSSysCounterId){
        this.set(FIELD_PSSYSCOUNTERID, pSSysCounterId);
    }
    
    /**
     * 获取 系统计数器  
     * @return
     */
    @JsonIgnore
    public String getPSSysCounterId(){
        Object objValue = this.get(FIELD_PSSYSCOUNTERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统计数器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCounterIdDirty(){
        if(this.contains(FIELD_PSSYSCOUNTERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统计数器
     */
    @JsonIgnore
    public void resetPSSysCounterId(){
        this.reset(FIELD_PSSYSCOUNTERID);
    }

    /**
     * 设置 系统计数器，详细说明：{@link #FIELD_PSSYSCOUNTERID}
     * <P>
     * 等同 {@link #setPSSysCounterId}
     * @param pSSysCounterId
     */
    @JsonIgnore
    public PSDEDRGroup pssyscounterid(String pSSysCounterId){
        this.setPSSysCounterId(pSSysCounterId);
        return this;
    }

    /**
     * 设置 系统计数器，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCounterId}
     * @param pSSysCounter 引用对象
     */
    @JsonIgnore
    public PSDEDRGroup pssyscounterid(PSSysCounter pSSysCounter){
        if(pSSysCounter == null){
            this.setPSSysCounterId(null);
            this.setPSSysCounterName(null);
        }
        else{
            this.setPSSysCounterId(pSSysCounter.getPSSysCounterId());
            this.setPSSysCounterName(pSSysCounter.getPSSysCounterName());
        }
        return this;
    }

    /**
     * <B>PSSYSCOUNTERNAME</B>&nbsp;系统计数器，指定分组默认使用的计数器对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSCOUNTERID}
     */
    public final static String FIELD_PSSYSCOUNTERNAME = "pssyscountername";

    /**
     * 设置 系统计数器，详细说明：{@link #FIELD_PSSYSCOUNTERNAME}
     * 
     * @param pSSysCounterName
     * 
     */
    @JsonProperty(FIELD_PSSYSCOUNTERNAME)
    public void setPSSysCounterName(String pSSysCounterName){
        this.set(FIELD_PSSYSCOUNTERNAME, pSSysCounterName);
    }
    
    /**
     * 获取 系统计数器  
     * @return
     */
    @JsonIgnore
    public String getPSSysCounterName(){
        Object objValue = this.get(FIELD_PSSYSCOUNTERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统计数器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCounterNameDirty(){
        if(this.contains(FIELD_PSSYSCOUNTERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统计数器
     */
    @JsonIgnore
    public void resetPSSysCounterName(){
        this.reset(FIELD_PSSYSCOUNTERNAME);
    }

    /**
     * 设置 系统计数器，详细说明：{@link #FIELD_PSSYSCOUNTERNAME}
     * <P>
     * 等同 {@link #setPSSysCounterName}
     * @param pSSysCounterName
     */
    @JsonIgnore
    public PSDEDRGroup pssyscountername(String pSSysCounterName){
        this.setPSSysCounterName(pSSysCounterName);
        return this;
    }

    /**
     * <B>PSSYSIMAGEID</B>&nbsp;分组显示图标，指定分组图标默认使用的图片对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysImage} 
     */
    public final static String FIELD_PSSYSIMAGEID = "pssysimageid";

    /**
     * 设置 分组显示图标，详细说明：{@link #FIELD_PSSYSIMAGEID}
     * 
     * @param pSSysImageId
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGEID)
    public void setPSSysImageId(String pSSysImageId){
        this.set(FIELD_PSSYSIMAGEID, pSSysImageId);
    }
    
    /**
     * 获取 分组显示图标  
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
     * 判断 分组显示图标 是否指定值，包括空值
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
     * 重置 分组显示图标
     */
    @JsonIgnore
    public void resetPSSysImageId(){
        this.reset(FIELD_PSSYSIMAGEID);
    }

    /**
     * 设置 分组显示图标，详细说明：{@link #FIELD_PSSYSIMAGEID}
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImageId
     */
    @JsonIgnore
    public PSDEDRGroup pssysimageid(String pSSysImageId){
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    /**
     * 设置 分组显示图标，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImage 引用对象
     */
    @JsonIgnore
    public PSDEDRGroup pssysimageid(PSSysImage pSSysImage){
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
     * <B>PSSYSIMAGENAME</B>&nbsp;分组显示图标，指定分组图标默认使用的图片对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSIMAGEID}
     */
    public final static String FIELD_PSSYSIMAGENAME = "pssysimagename";

    /**
     * 设置 分组显示图标，详细说明：{@link #FIELD_PSSYSIMAGENAME}
     * 
     * @param pSSysImageName
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGENAME)
    public void setPSSysImageName(String pSSysImageName){
        this.set(FIELD_PSSYSIMAGENAME, pSSysImageName);
    }
    
    /**
     * 获取 分组显示图标  
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
     * 判断 分组显示图标 是否指定值，包括空值
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
     * 重置 分组显示图标
     */
    @JsonIgnore
    public void resetPSSysImageName(){
        this.reset(FIELD_PSSYSIMAGENAME);
    }

    /**
     * 设置 分组显示图标，详细说明：{@link #FIELD_PSSYSIMAGENAME}
     * <P>
     * 等同 {@link #setPSSysImageName}
     * @param pSSysImageName
     */
    @JsonIgnore
    public PSDEDRGroup pssysimagename(String pSSysImageName){
        this.setPSSysImageName(pSSysImageName);
        return this;
    }

    /**
     * <B>TIPPSLANRESID</B>&nbsp;提示语言资源，指定分组提示信息的多语言资源对象
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
    public PSDEDRGroup tippslanresid(String tipPSLanResId){
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
    public PSDEDRGroup tippslanresid(PSLanguageRes pSLanguageRes){
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
     * <B>TIPPSLANRESNAME</B>&nbsp;提示语言资源，指定分组提示信息的多语言资源对象
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
    public PSDEDRGroup tippslanresname(String tipPSLanResName){
        this.setTipPSLanResName(tipPSLanResName);
        return this;
    }

    /**
     * <B>TOOLTIPINFO</B>&nbsp;提示信息，指定分组的提示信息
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
    public PSDEDRGroup tooltipinfo(String tooltipInfo){
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
    public PSDEDRGroup updatedate(String updateDate){
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
    public PSDEDRGroup updateman(String updateMan){
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
    public PSDEDRGroup usercat(String userCat){
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
    public PSDEDRGroup usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDEDRGroup userparams(String userParams){
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
    public PSDEDRGroup usertag(String userTag){
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
    public PSDEDRGroup usertag2(String userTag2){
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
    public PSDEDRGroup usertag3(String userTag3){
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
    public PSDEDRGroup usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEDRGroupId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEDRGroupId(strValue);
    }

    @JsonIgnore
    public PSDEDRGroup id(String strValue){
        this.setPSDEDRGroupId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEDRGroup){
            PSDEDRGroup model = (PSDEDRGroup)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
