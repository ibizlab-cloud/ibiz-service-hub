package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSSEARCHBAR</B>系统搜索栏 模型传输对象
 * <P>
 * 系统搜索栏部件模型，定义部件的表现及处理逻辑。支持为搜索栏定义快速分组项、属性过滤项等搜索功能
 */
public class PSSysSearchBar extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysSearchBar(){
    }      

    /**
     * <B>BARSTYLE</B>&nbsp;搜索栏样式，指定搜索栏的内置样式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SearchBarStyle} 
     */
    public final static String FIELD_BARSTYLE = "barstyle";

    /**
     * 设置 搜索栏样式，详细说明：{@link #FIELD_BARSTYLE}
     * 
     * @param barStyle
     * 
     */
    @JsonProperty(FIELD_BARSTYLE)
    public void setBarStyle(String barStyle){
        this.set(FIELD_BARSTYLE, barStyle);
    }
    
    /**
     * 获取 搜索栏样式  
     * @return
     */
    @JsonIgnore
    public String getBarStyle(){
        Object objValue = this.get(FIELD_BARSTYLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 搜索栏样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBarStyleDirty(){
        if(this.contains(FIELD_BARSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 搜索栏样式
     */
    @JsonIgnore
    public void resetBarStyle(){
        this.reset(FIELD_BARSTYLE);
    }

    /**
     * 设置 搜索栏样式，详细说明：{@link #FIELD_BARSTYLE}
     * <P>
     * 等同 {@link #setBarStyle}
     * @param barStyle
     */
    @JsonIgnore
    public PSSysSearchBar barstyle(String barStyle){
        this.setBarStyle(barStyle);
        return this;
    }

     /**
     * 设置 搜索栏样式，详细说明：{@link #FIELD_BARSTYLE}
     * <P>
     * 等同 {@link #setBarStyle}
     * @param barStyle
     */
    @JsonIgnore
    public PSSysSearchBar barstyle(net.ibizsys.psmodel.core.util.PSModelEnums.SearchBarStyle barStyle){
        if(barStyle == null){
            this.setBarStyle(null);
        }
        else{
            this.setBarStyle(barStyle.value);
        }
        return this;
    }

    /**
     * <B>BUSYINDICATOR</B>&nbsp;显示处理提示
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_BUSYINDICATOR = "busyindicator";

    /**
     * 设置 显示处理提示
     * 
     * @param busyIndicator
     * 
     */
    @JsonProperty(FIELD_BUSYINDICATOR)
    public void setBusyIndicator(Integer busyIndicator){
        this.set(FIELD_BUSYINDICATOR, busyIndicator);
    }
    
    /**
     * 获取 显示处理提示  
     * @return
     */
    @JsonIgnore
    public Integer getBusyIndicator(){
        Object objValue = this.get(FIELD_BUSYINDICATOR);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 显示处理提示 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBusyIndicatorDirty(){
        if(this.contains(FIELD_BUSYINDICATOR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 显示处理提示
     */
    @JsonIgnore
    public void resetBusyIndicator(){
        this.reset(FIELD_BUSYINDICATOR);
    }

    /**
     * 设置 显示处理提示
     * <P>
     * 等同 {@link #setBusyIndicator}
     * @param busyIndicator
     */
    @JsonIgnore
    public PSSysSearchBar busyindicator(Integer busyIndicator){
        this.setBusyIndicator(busyIndicator);
        return this;
    }

     /**
     * 设置 显示处理提示
     * <P>
     * 等同 {@link #setBusyIndicator}
     * @param busyIndicator
     */
    @JsonIgnore
    public PSSysSearchBar busyindicator(Boolean busyIndicator){
        if(busyIndicator == null){
            this.setBusyIndicator(null);
        }
        else{
            this.setBusyIndicator(busyIndicator?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定搜索栏的代码标识，需要在所在的实体中具有唯一性
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
    public PSSysSearchBar codename(String codeName){
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
    public PSSysSearchBar createdate(String createDate){
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
    public PSSysSearchBar createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>ENABLECUSTOMIZED</B>&nbsp;支持定制
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLECUSTOMIZED = "enablecustomized";

    /**
     * 设置 支持定制
     * 
     * @param enableCustomized
     * 
     */
    @JsonProperty(FIELD_ENABLECUSTOMIZED)
    public void setEnableCustomized(Integer enableCustomized){
        this.set(FIELD_ENABLECUSTOMIZED, enableCustomized);
    }
    
    /**
     * 获取 支持定制  
     * @return
     */
    @JsonIgnore
    public Integer getEnableCustomized(){
        Object objValue = this.get(FIELD_ENABLECUSTOMIZED);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持定制 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableCustomizedDirty(){
        if(this.contains(FIELD_ENABLECUSTOMIZED)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持定制
     */
    @JsonIgnore
    public void resetEnableCustomized(){
        this.reset(FIELD_ENABLECUSTOMIZED);
    }

    /**
     * 设置 支持定制
     * <P>
     * 等同 {@link #setEnableCustomized}
     * @param enableCustomized
     */
    @JsonIgnore
    public PSSysSearchBar enablecustomized(Integer enableCustomized){
        this.setEnableCustomized(enableCustomized);
        return this;
    }

     /**
     * 设置 支持定制
     * <P>
     * 等同 {@link #setEnableCustomized}
     * @param enableCustomized
     */
    @JsonIgnore
    public PSSysSearchBar enablecustomized(Boolean enableCustomized){
        if(enableCustomized == null){
            this.setEnableCustomized(null);
        }
        else{
            this.setEnableCustomized(enableCustomized?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEQUICKSEARCH</B>&nbsp;启用快速搜索，指定搜索栏启用快速的模式，未定义时为【默认】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SearchBarQuickSearchMode} 
     */
    public final static String FIELD_ENABLEQUICKSEARCH = "enablequicksearch";

    /**
     * 设置 启用快速搜索，详细说明：{@link #FIELD_ENABLEQUICKSEARCH}
     * 
     * @param enableQuickSearch
     * 
     */
    @JsonProperty(FIELD_ENABLEQUICKSEARCH)
    public void setEnableQuickSearch(Integer enableQuickSearch){
        this.set(FIELD_ENABLEQUICKSEARCH, enableQuickSearch);
    }
    
    /**
     * 获取 启用快速搜索  
     * @return
     */
    @JsonIgnore
    public Integer getEnableQuickSearch(){
        Object objValue = this.get(FIELD_ENABLEQUICKSEARCH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用快速搜索 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableQuickSearchDirty(){
        if(this.contains(FIELD_ENABLEQUICKSEARCH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用快速搜索
     */
    @JsonIgnore
    public void resetEnableQuickSearch(){
        this.reset(FIELD_ENABLEQUICKSEARCH);
    }

    /**
     * 设置 启用快速搜索，详细说明：{@link #FIELD_ENABLEQUICKSEARCH}
     * <P>
     * 等同 {@link #setEnableQuickSearch}
     * @param enableQuickSearch
     */
    @JsonIgnore
    public PSSysSearchBar enablequicksearch(Integer enableQuickSearch){
        this.setEnableQuickSearch(enableQuickSearch);
        return this;
    }

     /**
     * 设置 启用快速搜索，详细说明：{@link #FIELD_ENABLEQUICKSEARCH}
     * <P>
     * 等同 {@link #setEnableQuickSearch}
     * @param enableQuickSearch
     */
    @JsonIgnore
    public PSSysSearchBar enablequicksearch(net.ibizsys.psmodel.core.util.PSModelEnums.SearchBarQuickSearchMode enableQuickSearch){
        if(enableQuickSearch == null){
            this.setEnableQuickSearch(null);
        }
        else{
            this.setEnableQuickSearch(enableQuickSearch.value);
        }
        return this;
    }

    /**
     * <B>GROUPMODE</B>&nbsp;过滤组模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SearchBarGroupMode} 
     */
    public final static String FIELD_GROUPMODE = "groupmode";

    /**
     * 设置 过滤组模式
     * 
     * @param groupMode
     * 
     */
    @JsonProperty(FIELD_GROUPMODE)
    public void setGroupMode(String groupMode){
        this.set(FIELD_GROUPMODE, groupMode);
    }
    
    /**
     * 获取 过滤组模式  
     * @return
     */
    @JsonIgnore
    public String getGroupMode(){
        Object objValue = this.get(FIELD_GROUPMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 过滤组模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupModeDirty(){
        if(this.contains(FIELD_GROUPMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 过滤组模式
     */
    @JsonIgnore
    public void resetGroupMode(){
        this.reset(FIELD_GROUPMODE);
    }

    /**
     * 设置 过滤组模式
     * <P>
     * 等同 {@link #setGroupMode}
     * @param groupMode
     */
    @JsonIgnore
    public PSSysSearchBar groupmode(String groupMode){
        this.setGroupMode(groupMode);
        return this;
    }

     /**
     * 设置 过滤组模式
     * <P>
     * 等同 {@link #setGroupMode}
     * @param groupMode
     */
    @JsonIgnore
    public PSSysSearchBar groupmode(net.ibizsys.psmodel.core.util.PSModelEnums.SearchBarGroupMode groupMode){
        if(groupMode == null){
            this.setGroupMode(null);
        }
        else{
            this.setGroupMode(groupMode.value);
        }
        return this;
    }

    /**
     * <B>GROUPMORETEXT</B>&nbsp;更多分组显示文本
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_GROUPMORETEXT = "groupmoretext";

    /**
     * 设置 更多分组显示文本
     * 
     * @param groupMoreText
     * 
     */
    @JsonProperty(FIELD_GROUPMORETEXT)
    public void setGroupMoreText(String groupMoreText){
        this.set(FIELD_GROUPMORETEXT, groupMoreText);
    }
    
    /**
     * 获取 更多分组显示文本  
     * @return
     */
    @JsonIgnore
    public String getGroupMoreText(){
        Object objValue = this.get(FIELD_GROUPMORETEXT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 更多分组显示文本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupMoreTextDirty(){
        if(this.contains(FIELD_GROUPMORETEXT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 更多分组显示文本
     */
    @JsonIgnore
    public void resetGroupMoreText(){
        this.reset(FIELD_GROUPMORETEXT);
    }

    /**
     * 设置 更多分组显示文本
     * <P>
     * 等同 {@link #setGroupMoreText}
     * @param groupMoreText
     */
    @JsonIgnore
    public PSSysSearchBar groupmoretext(String groupMoreText){
        this.setGroupMoreText(groupMoreText);
        return this;
    }

    /**
     * <B>GROUPMORETEXTPSLANRESID</B>&nbsp;更多分组语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_GROUPMORETEXTPSLANRESID = "groupmoretextpslanresid";

    /**
     * 设置 更多分组语言资源
     * 
     * @param groupMoreTextPSLanResId
     * 
     */
    @JsonProperty(FIELD_GROUPMORETEXTPSLANRESID)
    public void setGroupMoreTextPSLanResId(String groupMoreTextPSLanResId){
        this.set(FIELD_GROUPMORETEXTPSLANRESID, groupMoreTextPSLanResId);
    }
    
    /**
     * 获取 更多分组语言资源  
     * @return
     */
    @JsonIgnore
    public String getGroupMoreTextPSLanResId(){
        Object objValue = this.get(FIELD_GROUPMORETEXTPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 更多分组语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupMoreTextPSLanResIdDirty(){
        if(this.contains(FIELD_GROUPMORETEXTPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 更多分组语言资源
     */
    @JsonIgnore
    public void resetGroupMoreTextPSLanResId(){
        this.reset(FIELD_GROUPMORETEXTPSLANRESID);
    }

    /**
     * 设置 更多分组语言资源
     * <P>
     * 等同 {@link #setGroupMoreTextPSLanResId}
     * @param groupMoreTextPSLanResId
     */
    @JsonIgnore
    public PSSysSearchBar groupmoretextpslanresid(String groupMoreTextPSLanResId){
        this.setGroupMoreTextPSLanResId(groupMoreTextPSLanResId);
        return this;
    }

    /**
     * 设置 更多分组语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setGroupMoreTextPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSSysSearchBar groupmoretextpslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setGroupMoreTextPSLanResId(null);
            this.setGroupMoreTextPSLanResName(null);
        }
        else{
            this.setGroupMoreTextPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setGroupMoreTextPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>GROUPMORETEXTPSLANRESNAME</B>&nbsp;更多分组语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GROUPMORETEXTPSLANRESID}
     */
    public final static String FIELD_GROUPMORETEXTPSLANRESNAME = "groupmoretextpslanresname";

    /**
     * 设置 更多分组语言资源
     * 
     * @param groupMoreTextPSLanResName
     * 
     */
    @JsonProperty(FIELD_GROUPMORETEXTPSLANRESNAME)
    public void setGroupMoreTextPSLanResName(String groupMoreTextPSLanResName){
        this.set(FIELD_GROUPMORETEXTPSLANRESNAME, groupMoreTextPSLanResName);
    }
    
    /**
     * 获取 更多分组语言资源  
     * @return
     */
    @JsonIgnore
    public String getGroupMoreTextPSLanResName(){
        Object objValue = this.get(FIELD_GROUPMORETEXTPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 更多分组语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupMoreTextPSLanResNameDirty(){
        if(this.contains(FIELD_GROUPMORETEXTPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 更多分组语言资源
     */
    @JsonIgnore
    public void resetGroupMoreTextPSLanResName(){
        this.reset(FIELD_GROUPMORETEXTPSLANRESNAME);
    }

    /**
     * 设置 更多分组语言资源
     * <P>
     * 等同 {@link #setGroupMoreTextPSLanResName}
     * @param groupMoreTextPSLanResName
     */
    @JsonIgnore
    public PSSysSearchBar groupmoretextpslanresname(String groupMoreTextPSLanResName){
        this.setGroupMoreTextPSLanResName(groupMoreTextPSLanResName);
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
    public PSSysSearchBar memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MOBFLAG</B>&nbsp;移动端搜索栏，指定搜索栏部件是否为移动端专用部件，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_MOBFLAG = "mobflag";

    /**
     * 设置 移动端搜索栏，详细说明：{@link #FIELD_MOBFLAG}
     * 
     * @param mobFlag
     * 
     */
    @JsonProperty(FIELD_MOBFLAG)
    public void setMobFlag(Integer mobFlag){
        this.set(FIELD_MOBFLAG, mobFlag);
    }
    
    /**
     * 获取 移动端搜索栏  
     * @return
     */
    @JsonIgnore
    public Integer getMobFlag(){
        Object objValue = this.get(FIELD_MOBFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 移动端搜索栏 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobFlagDirty(){
        if(this.contains(FIELD_MOBFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端搜索栏
     */
    @JsonIgnore
    public void resetMobFlag(){
        this.reset(FIELD_MOBFLAG);
    }

    /**
     * 设置 移动端搜索栏，详细说明：{@link #FIELD_MOBFLAG}
     * <P>
     * 等同 {@link #setMobFlag}
     * @param mobFlag
     */
    @JsonIgnore
    public PSSysSearchBar mobflag(Integer mobFlag){
        this.setMobFlag(mobFlag);
        return this;
    }

     /**
     * 设置 移动端搜索栏，详细说明：{@link #FIELD_MOBFLAG}
     * <P>
     * 等同 {@link #setMobFlag}
     * @param mobFlag
     */
    @JsonIgnore
    public PSSysSearchBar mobflag(Boolean mobFlag){
        if(mobFlag == null){
            this.setMobFlag(null);
        }
        else{
            this.setMobFlag(mobFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>PSCTRLLOGICGROUPID</B>&nbsp;界面逻辑组，指定搜索栏部件默认附加的部件逻辑组对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSCtrlLogicGroup} 
     */
    public final static String FIELD_PSCTRLLOGICGROUPID = "psctrllogicgroupid";

    /**
     * 设置 界面逻辑组，详细说明：{@link #FIELD_PSCTRLLOGICGROUPID}
     * 
     * @param pSCtrlLogicGroupId
     * 
     */
    @JsonProperty(FIELD_PSCTRLLOGICGROUPID)
    public void setPSCtrlLogicGroupId(String pSCtrlLogicGroupId){
        this.set(FIELD_PSCTRLLOGICGROUPID, pSCtrlLogicGroupId);
    }
    
    /**
     * 获取 界面逻辑组  
     * @return
     */
    @JsonIgnore
    public String getPSCtrlLogicGroupId(){
        Object objValue = this.get(FIELD_PSCTRLLOGICGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面逻辑组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCtrlLogicGroupIdDirty(){
        if(this.contains(FIELD_PSCTRLLOGICGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面逻辑组
     */
    @JsonIgnore
    public void resetPSCtrlLogicGroupId(){
        this.reset(FIELD_PSCTRLLOGICGROUPID);
    }

    /**
     * 设置 界面逻辑组，详细说明：{@link #FIELD_PSCTRLLOGICGROUPID}
     * <P>
     * 等同 {@link #setPSCtrlLogicGroupId}
     * @param pSCtrlLogicGroupId
     */
    @JsonIgnore
    public PSSysSearchBar psctrllogicgroupid(String pSCtrlLogicGroupId){
        this.setPSCtrlLogicGroupId(pSCtrlLogicGroupId);
        return this;
    }

    /**
     * 设置 界面逻辑组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSCtrlLogicGroupId}
     * @param pSCtrlLogicGroup 引用对象
     */
    @JsonIgnore
    public PSSysSearchBar psctrllogicgroupid(PSCtrlLogicGroup pSCtrlLogicGroup){
        if(pSCtrlLogicGroup == null){
            this.setPSCtrlLogicGroupId(null);
            this.setPSCtrlLogicGroupName(null);
        }
        else{
            this.setPSCtrlLogicGroupId(pSCtrlLogicGroup.getPSCtrlLogicGroupId());
            this.setPSCtrlLogicGroupName(pSCtrlLogicGroup.getPSCtrlLogicGroupName());
        }
        return this;
    }

    /**
     * <B>PSCTRLLOGICGROUPNAME</B>&nbsp;界面逻辑组，指定搜索栏部件默认附加的部件逻辑组对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCTRLLOGICGROUPID}
     */
    public final static String FIELD_PSCTRLLOGICGROUPNAME = "psctrllogicgroupname";

    /**
     * 设置 界面逻辑组，详细说明：{@link #FIELD_PSCTRLLOGICGROUPNAME}
     * 
     * @param pSCtrlLogicGroupName
     * 
     */
    @JsonProperty(FIELD_PSCTRLLOGICGROUPNAME)
    public void setPSCtrlLogicGroupName(String pSCtrlLogicGroupName){
        this.set(FIELD_PSCTRLLOGICGROUPNAME, pSCtrlLogicGroupName);
    }
    
    /**
     * 获取 界面逻辑组  
     * @return
     */
    @JsonIgnore
    public String getPSCtrlLogicGroupName(){
        Object objValue = this.get(FIELD_PSCTRLLOGICGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面逻辑组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCtrlLogicGroupNameDirty(){
        if(this.contains(FIELD_PSCTRLLOGICGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面逻辑组
     */
    @JsonIgnore
    public void resetPSCtrlLogicGroupName(){
        this.reset(FIELD_PSCTRLLOGICGROUPNAME);
    }

    /**
     * 设置 界面逻辑组，详细说明：{@link #FIELD_PSCTRLLOGICGROUPNAME}
     * <P>
     * 等同 {@link #setPSCtrlLogicGroupName}
     * @param pSCtrlLogicGroupName
     */
    @JsonIgnore
    public PSSysSearchBar psctrllogicgroupname(String pSCtrlLogicGroupName){
        this.setPSCtrlLogicGroupName(pSCtrlLogicGroupName);
        return this;
    }

    /**
     * <B>PSCTRLMSGID</B>&nbsp;部件消息，指定搜索栏部件默认的部件消息对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSCtrlMsg} 
     */
    public final static String FIELD_PSCTRLMSGID = "psctrlmsgid";

    /**
     * 设置 部件消息，详细说明：{@link #FIELD_PSCTRLMSGID}
     * 
     * @param pSCtrlMsgId
     * 
     */
    @JsonProperty(FIELD_PSCTRLMSGID)
    public void setPSCtrlMsgId(String pSCtrlMsgId){
        this.set(FIELD_PSCTRLMSGID, pSCtrlMsgId);
    }
    
    /**
     * 获取 部件消息  
     * @return
     */
    @JsonIgnore
    public String getPSCtrlMsgId(){
        Object objValue = this.get(FIELD_PSCTRLMSGID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件消息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCtrlMsgIdDirty(){
        if(this.contains(FIELD_PSCTRLMSGID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件消息
     */
    @JsonIgnore
    public void resetPSCtrlMsgId(){
        this.reset(FIELD_PSCTRLMSGID);
    }

    /**
     * 设置 部件消息，详细说明：{@link #FIELD_PSCTRLMSGID}
     * <P>
     * 等同 {@link #setPSCtrlMsgId}
     * @param pSCtrlMsgId
     */
    @JsonIgnore
    public PSSysSearchBar psctrlmsgid(String pSCtrlMsgId){
        this.setPSCtrlMsgId(pSCtrlMsgId);
        return this;
    }

    /**
     * 设置 部件消息，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSCtrlMsgId}
     * @param pSCtrlMsg 引用对象
     */
    @JsonIgnore
    public PSSysSearchBar psctrlmsgid(PSCtrlMsg pSCtrlMsg){
        if(pSCtrlMsg == null){
            this.setPSCtrlMsgId(null);
            this.setPSCtrlMsgName(null);
        }
        else{
            this.setPSCtrlMsgId(pSCtrlMsg.getPSCtrlMsgId());
            this.setPSCtrlMsgName(pSCtrlMsg.getPSCtrlMsgName());
        }
        return this;
    }

    /**
     * <B>PSCTRLMSGNAME</B>&nbsp;部件消息，指定搜索栏部件默认的部件消息对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCTRLMSGID}
     */
    public final static String FIELD_PSCTRLMSGNAME = "psctrlmsgname";

    /**
     * 设置 部件消息，详细说明：{@link #FIELD_PSCTRLMSGNAME}
     * 
     * @param pSCtrlMsgName
     * 
     */
    @JsonProperty(FIELD_PSCTRLMSGNAME)
    public void setPSCtrlMsgName(String pSCtrlMsgName){
        this.set(FIELD_PSCTRLMSGNAME, pSCtrlMsgName);
    }
    
    /**
     * 获取 部件消息  
     * @return
     */
    @JsonIgnore
    public String getPSCtrlMsgName(){
        Object objValue = this.get(FIELD_PSCTRLMSGNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件消息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCtrlMsgNameDirty(){
        if(this.contains(FIELD_PSCTRLMSGNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件消息
     */
    @JsonIgnore
    public void resetPSCtrlMsgName(){
        this.reset(FIELD_PSCTRLMSGNAME);
    }

    /**
     * 设置 部件消息，详细说明：{@link #FIELD_PSCTRLMSGNAME}
     * <P>
     * 等同 {@link #setPSCtrlMsgName}
     * @param pSCtrlMsgName
     */
    @JsonIgnore
    public PSSysSearchBar psctrlmsgname(String pSCtrlMsgName){
        this.setPSCtrlMsgName(pSCtrlMsgName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定搜索栏部件所属的实体对象
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
    public PSSysSearchBar psdeid(String pSDEId){
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
    public PSSysSearchBar psdeid(PSDataEntity pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;实体，指定搜索栏部件所属的实体对象
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
    public PSSysSearchBar psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定搜索栏部件所在的系统模块
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
    public PSSysSearchBar psmoduleid(String pSModuleId){
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
    public PSSysSearchBar psmoduleid(PSModule pSModule){
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
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定搜索栏部件所在的系统模块
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
    public PSSysSearchBar psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSYSCOUNTERID</B>&nbsp;系统计数器，指定搜索栏部件默认使用的计数器对象
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
    public PSSysSearchBar pssyscounterid(String pSSysCounterId){
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
    public PSSysSearchBar pssyscounterid(PSSysCounter pSSysCounter){
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
     * <B>PSSYSCOUNTERNAME</B>&nbsp;系统计数器，指定搜索栏部件默认使用的计数器对象
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
    public PSSysSearchBar pssyscountername(String pSSysCounterName){
        this.setPSSysCounterName(pSSysCounterName);
        return this;
    }

    /**
     * <B>PSSYSCSSID</B>&nbsp;默认样式表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCss} 
     */
    public final static String FIELD_PSSYSCSSID = "pssyscssid";

    /**
     * 设置 默认样式表
     * 
     * @param pSSysCssId
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSID)
    public void setPSSysCssId(String pSSysCssId){
        this.set(FIELD_PSSYSCSSID, pSSysCssId);
    }
    
    /**
     * 获取 默认样式表  
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
     * 判断 默认样式表 是否指定值，包括空值
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
     * 重置 默认样式表
     */
    @JsonIgnore
    public void resetPSSysCssId(){
        this.reset(FIELD_PSSYSCSSID);
    }

    /**
     * 设置 默认样式表
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCssId
     */
    @JsonIgnore
    public PSSysSearchBar pssyscssid(String pSSysCssId){
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    /**
     * 设置 默认样式表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSSysSearchBar pssyscssid(PSSysCss pSSysCss){
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
     * <B>PSSYSCSSNAME</B>&nbsp;默认样式表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSCSSID}
     */
    public final static String FIELD_PSSYSCSSNAME = "pssyscssname";

    /**
     * 设置 默认样式表
     * 
     * @param pSSysCssName
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSNAME)
    public void setPSSysCssName(String pSSysCssName){
        this.set(FIELD_PSSYSCSSNAME, pSSysCssName);
    }
    
    /**
     * 获取 默认样式表  
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
     * 判断 默认样式表 是否指定值，包括空值
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
     * 重置 默认样式表
     */
    @JsonIgnore
    public void resetPSSysCssName(){
        this.reset(FIELD_PSSYSCSSNAME);
    }

    /**
     * 设置 默认样式表
     * <P>
     * 等同 {@link #setPSSysCssName}
     * @param pSSysCssName
     */
    @JsonIgnore
    public PSSysSearchBar pssyscssname(String pSSysCssName){
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端扩展插件，指定系统搜索栏使用的前端模板扩展插件，使用插件类型【搜索栏绘制插件】
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysPFPlugin} 
     */
    public final static String FIELD_PSSYSPFPLUGINID = "pssyspfpluginid";

    /**
     * 设置 前端扩展插件，详细说明：{@link #FIELD_PSSYSPFPLUGINID}
     * 
     * @param pSSysPFPluginId
     * 
     */
    @JsonProperty(FIELD_PSSYSPFPLUGINID)
    public void setPSSysPFPluginId(String pSSysPFPluginId){
        this.set(FIELD_PSSYSPFPLUGINID, pSSysPFPluginId);
    }
    
    /**
     * 获取 前端扩展插件  
     * @return
     */
    @JsonIgnore
    public String getPSSysPFPluginId(){
        Object objValue = this.get(FIELD_PSSYSPFPLUGINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端扩展插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysPFPluginIdDirty(){
        if(this.contains(FIELD_PSSYSPFPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端扩展插件
     */
    @JsonIgnore
    public void resetPSSysPFPluginId(){
        this.reset(FIELD_PSSYSPFPLUGINID);
    }

    /**
     * 设置 前端扩展插件，详细说明：{@link #FIELD_PSSYSPFPLUGINID}
     * <P>
     * 等同 {@link #setPSSysPFPluginId}
     * @param pSSysPFPluginId
     */
    @JsonIgnore
    public PSSysSearchBar pssyspfpluginid(String pSSysPFPluginId){
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    /**
     * 设置 前端扩展插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysPFPluginId}
     * @param pSSysPFPlugin 引用对象
     */
    @JsonIgnore
    public PSSysSearchBar pssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
        if(pSSysPFPlugin == null){
            this.setPSSysPFPluginId(null);
            this.setPSSysPFPluginName(null);
        }
        else{
            this.setPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端扩展插件，指定系统搜索栏使用的前端模板扩展插件，使用插件类型【搜索栏绘制插件】
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSPFPLUGINID}
     */
    public final static String FIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";

    /**
     * 设置 前端扩展插件，详细说明：{@link #FIELD_PSSYSPFPLUGINNAME}
     * 
     * @param pSSysPFPluginName
     * 
     */
    @JsonProperty(FIELD_PSSYSPFPLUGINNAME)
    public void setPSSysPFPluginName(String pSSysPFPluginName){
        this.set(FIELD_PSSYSPFPLUGINNAME, pSSysPFPluginName);
    }
    
    /**
     * 获取 前端扩展插件  
     * @return
     */
    @JsonIgnore
    public String getPSSysPFPluginName(){
        Object objValue = this.get(FIELD_PSSYSPFPLUGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端扩展插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysPFPluginNameDirty(){
        if(this.contains(FIELD_PSSYSPFPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端扩展插件
     */
    @JsonIgnore
    public void resetPSSysPFPluginName(){
        this.reset(FIELD_PSSYSPFPLUGINNAME);
    }

    /**
     * 设置 前端扩展插件，详细说明：{@link #FIELD_PSSYSPFPLUGINNAME}
     * <P>
     * 等同 {@link #setPSSysPFPluginName}
     * @param pSSysPFPluginName
     */
    @JsonIgnore
    public PSSysSearchBar pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    /**
     * <B>PSSYSSEARCHBARID</B>&nbsp;系统搜索栏标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSSEARCHBARID = "pssyssearchbarid";

    /**
     * 设置 系统搜索栏标识
     * 
     * @param pSSysSearchBarId
     * 
     */
    @JsonProperty(FIELD_PSSYSSEARCHBARID)
    public void setPSSysSearchBarId(String pSSysSearchBarId){
        this.set(FIELD_PSSYSSEARCHBARID, pSSysSearchBarId);
    }
    
    /**
     * 获取 系统搜索栏标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysSearchBarId(){
        Object objValue = this.get(FIELD_PSSYSSEARCHBARID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统搜索栏标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSearchBarIdDirty(){
        if(this.contains(FIELD_PSSYSSEARCHBARID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统搜索栏标识
     */
    @JsonIgnore
    public void resetPSSysSearchBarId(){
        this.reset(FIELD_PSSYSSEARCHBARID);
    }

    /**
     * 设置 系统搜索栏标识
     * <P>
     * 等同 {@link #setPSSysSearchBarId}
     * @param pSSysSearchBarId
     */
    @JsonIgnore
    public PSSysSearchBar pssyssearchbarid(String pSSysSearchBarId){
        this.setPSSysSearchBarId(pSSysSearchBarId);
        return this;
    }

    /**
     * <B>PSSYSSEARCHBARNAME</B>&nbsp;搜索栏名称，指定搜索项部件的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSSEARCHBARNAME = "pssyssearchbarname";

    /**
     * 设置 搜索栏名称，详细说明：{@link #FIELD_PSSYSSEARCHBARNAME}
     * 
     * @param pSSysSearchBarName
     * 
     */
    @JsonProperty(FIELD_PSSYSSEARCHBARNAME)
    public void setPSSysSearchBarName(String pSSysSearchBarName){
        this.set(FIELD_PSSYSSEARCHBARNAME, pSSysSearchBarName);
    }
    
    /**
     * 获取 搜索栏名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysSearchBarName(){
        Object objValue = this.get(FIELD_PSSYSSEARCHBARNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 搜索栏名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSearchBarNameDirty(){
        if(this.contains(FIELD_PSSYSSEARCHBARNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 搜索栏名称
     */
    @JsonIgnore
    public void resetPSSysSearchBarName(){
        this.reset(FIELD_PSSYSSEARCHBARNAME);
    }

    /**
     * 设置 搜索栏名称，详细说明：{@link #FIELD_PSSYSSEARCHBARNAME}
     * <P>
     * 等同 {@link #setPSSysSearchBarName}
     * @param pSSysSearchBarName
     */
    @JsonIgnore
    public PSSysSearchBar pssyssearchbarname(String pSSysSearchBarName){
        this.setPSSysSearchBarName(pSSysSearchBarName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysSearchBarName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysSearchBarName(strName);
    }

    @JsonIgnore
    public PSSysSearchBar name(String strName){
        this.setPSSysSearchBarName(strName);
        return this;
    }

    /**
     * <B>PSVIEWMSGGROUPID</B>&nbsp;视图消息组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSViewMsgGroup} 
     */
    public final static String FIELD_PSVIEWMSGGROUPID = "psviewmsggroupid";

    /**
     * 设置 视图消息组
     * 
     * @param pSViewMsgGroupId
     * 
     */
    @JsonProperty(FIELD_PSVIEWMSGGROUPID)
    public void setPSViewMsgGroupId(String pSViewMsgGroupId){
        this.set(FIELD_PSVIEWMSGGROUPID, pSViewMsgGroupId);
    }
    
    /**
     * 获取 视图消息组  
     * @return
     */
    @JsonIgnore
    public String getPSViewMsgGroupId(){
        Object objValue = this.get(FIELD_PSVIEWMSGGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图消息组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSViewMsgGroupIdDirty(){
        if(this.contains(FIELD_PSVIEWMSGGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图消息组
     */
    @JsonIgnore
    public void resetPSViewMsgGroupId(){
        this.reset(FIELD_PSVIEWMSGGROUPID);
    }

    /**
     * 设置 视图消息组
     * <P>
     * 等同 {@link #setPSViewMsgGroupId}
     * @param pSViewMsgGroupId
     */
    @JsonIgnore
    public PSSysSearchBar psviewmsggroupid(String pSViewMsgGroupId){
        this.setPSViewMsgGroupId(pSViewMsgGroupId);
        return this;
    }

    /**
     * 设置 视图消息组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSViewMsgGroupId}
     * @param pSViewMsgGroup 引用对象
     */
    @JsonIgnore
    public PSSysSearchBar psviewmsggroupid(PSViewMsgGroup pSViewMsgGroup){
        if(pSViewMsgGroup == null){
            this.setPSViewMsgGroupId(null);
            this.setPSViewMsgGroupName(null);
        }
        else{
            this.setPSViewMsgGroupId(pSViewMsgGroup.getPSViewMsgGroupId());
            this.setPSViewMsgGroupName(pSViewMsgGroup.getPSViewMsgGroupName());
        }
        return this;
    }

    /**
     * <B>PSVIEWMSGGROUPNAME</B>&nbsp;视图消息组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSVIEWMSGGROUPID}
     */
    public final static String FIELD_PSVIEWMSGGROUPNAME = "psviewmsggroupname";

    /**
     * 设置 视图消息组
     * 
     * @param pSViewMsgGroupName
     * 
     */
    @JsonProperty(FIELD_PSVIEWMSGGROUPNAME)
    public void setPSViewMsgGroupName(String pSViewMsgGroupName){
        this.set(FIELD_PSVIEWMSGGROUPNAME, pSViewMsgGroupName);
    }
    
    /**
     * 获取 视图消息组  
     * @return
     */
    @JsonIgnore
    public String getPSViewMsgGroupName(){
        Object objValue = this.get(FIELD_PSVIEWMSGGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图消息组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSViewMsgGroupNameDirty(){
        if(this.contains(FIELD_PSVIEWMSGGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图消息组
     */
    @JsonIgnore
    public void resetPSViewMsgGroupName(){
        this.reset(FIELD_PSVIEWMSGGROUPNAME);
    }

    /**
     * 设置 视图消息组
     * <P>
     * 等同 {@link #setPSViewMsgGroupName}
     * @param pSViewMsgGroupName
     */
    @JsonIgnore
    public PSSysSearchBar psviewmsggroupname(String pSViewMsgGroupName){
        this.setPSViewMsgGroupName(pSViewMsgGroupName);
        return this;
    }

    /**
     * <B>QUICKGROUPCNT</B>&nbsp;快速分组显示数量
     */
    public final static String FIELD_QUICKGROUPCNT = "quickgroupcnt";

    /**
     * 设置 快速分组显示数量
     * 
     * @param quickGroupCnt
     * 
     */
    @JsonProperty(FIELD_QUICKGROUPCNT)
    public void setQuickGroupCnt(Integer quickGroupCnt){
        this.set(FIELD_QUICKGROUPCNT, quickGroupCnt);
    }
    
    /**
     * 获取 快速分组显示数量  
     * @return
     */
    @JsonIgnore
    public Integer getQuickGroupCnt(){
        Object objValue = this.get(FIELD_QUICKGROUPCNT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 快速分组显示数量 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isQuickGroupCntDirty(){
        if(this.contains(FIELD_QUICKGROUPCNT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 快速分组显示数量
     */
    @JsonIgnore
    public void resetQuickGroupCnt(){
        this.reset(FIELD_QUICKGROUPCNT);
    }

    /**
     * 设置 快速分组显示数量
     * <P>
     * 等同 {@link #setQuickGroupCnt}
     * @param quickGroupCnt
     */
    @JsonIgnore
    public PSSysSearchBar quickgroupcnt(Integer quickGroupCnt){
        this.setQuickGroupCnt(quickGroupCnt);
        return this;
    }

    /**
     * <B>QUICKSEARCHWIDTH</B>&nbsp;快速搜索宽度，指定快速搜索框的宽度，0为自动，未定义时为【0】
     */
    public final static String FIELD_QUICKSEARCHWIDTH = "quicksearchwidth";

    /**
     * 设置 快速搜索宽度，详细说明：{@link #FIELD_QUICKSEARCHWIDTH}
     * 
     * @param quickSearchWidth
     * 
     */
    @JsonProperty(FIELD_QUICKSEARCHWIDTH)
    public void setQuickSearchWidth(Integer quickSearchWidth){
        this.set(FIELD_QUICKSEARCHWIDTH, quickSearchWidth);
    }
    
    /**
     * 获取 快速搜索宽度  
     * @return
     */
    @JsonIgnore
    public Integer getQuickSearchWidth(){
        Object objValue = this.get(FIELD_QUICKSEARCHWIDTH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 快速搜索宽度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isQuickSearchWidthDirty(){
        if(this.contains(FIELD_QUICKSEARCHWIDTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 快速搜索宽度
     */
    @JsonIgnore
    public void resetQuickSearchWidth(){
        this.reset(FIELD_QUICKSEARCHWIDTH);
    }

    /**
     * 设置 快速搜索宽度，详细说明：{@link #FIELD_QUICKSEARCHWIDTH}
     * <P>
     * 等同 {@link #setQuickSearchWidth}
     * @param quickSearchWidth
     */
    @JsonIgnore
    public PSSysSearchBar quicksearchwidth(Integer quickSearchWidth){
        this.setQuickSearchWidth(quickSearchWidth);
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
    public PSSysSearchBar updatedate(String updateDate){
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
    public PSSysSearchBar updateman(String updateMan){
        this.setUpdateMan(updateMan);
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
    public PSSysSearchBar usertag(String userTag){
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
    public PSSysSearchBar usertag2(String userTag2){
        this.setUserTag2(userTag2);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysSearchBarId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysSearchBarId(strValue);
    }

    @JsonIgnore
    public PSSysSearchBar id(String strValue){
        this.setPSSysSearchBarId(strValue);
        return this;
    }


    /**
     *  系统搜索栏项 成员集合
     */
    public final static String FIELD_PSSYSSEARCHBARITEMS = "pssyssearchbaritems";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSSysSearchBarItem> pssyssearchbaritems;

    /**
     * 获取 系统搜索栏项 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSSYSSEARCHBARITEMS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSSysSearchBarItem> getPSSysSearchBarItems(){
        return this.pssyssearchbaritems;
    }

    /**
     * 设置 系统搜索栏项 成员集合  
     * @param pssyssearchbaritems
     */
    @JsonProperty(FIELD_PSSYSSEARCHBARITEMS)
    public void setPSSysSearchBarItems(java.util.List<net.ibizsys.psmodel.core.domain.PSSysSearchBarItem> pssyssearchbaritems){
        this.pssyssearchbaritems = pssyssearchbaritems;
    }

    /**
     * 获取 系统搜索栏项 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSSysSearchBarItem> getPSSysSearchBarItemsIf(){
        if(this.pssyssearchbaritems == null){
            this.pssyssearchbaritems = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSSysSearchBarItem>();          
        }
        return this.pssyssearchbaritems;
    }


    /**
     *  搜索栏逻辑 成员集合
     */
    public final static String FIELD_PSSYSSEARCHBARLOGICS = "pssyssearchbarlogics";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSSysSearchBarLogic> pssyssearchbarlogics;

    /**
     * 获取 搜索栏逻辑 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSSYSSEARCHBARLOGICS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSSysSearchBarLogic> getPSSysSearchBarLogics(){
        return this.pssyssearchbarlogics;
    }

    /**
     * 设置 搜索栏逻辑 成员集合  
     * @param pssyssearchbarlogics
     */
    @JsonProperty(FIELD_PSSYSSEARCHBARLOGICS)
    public void setPSSysSearchBarLogics(java.util.List<net.ibizsys.psmodel.core.domain.PSSysSearchBarLogic> pssyssearchbarlogics){
        this.pssyssearchbarlogics = pssyssearchbarlogics;
    }

    /**
     * 获取 搜索栏逻辑 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSSysSearchBarLogic> getPSSysSearchBarLogicsIf(){
        if(this.pssyssearchbarlogics == null){
            this.pssyssearchbarlogics = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSSysSearchBarLogic>();          
        }
        return this.pssyssearchbarlogics;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysSearchBar){
            PSSysSearchBar model = (PSSysSearchBar)iPSModel;
            model.setPSSysSearchBarItems(this.getPSSysSearchBarItems());
            model.setPSSysSearchBarLogics(this.getPSSysSearchBarLogics());
        }
        super.copyTo(iPSModel);
    }
}
