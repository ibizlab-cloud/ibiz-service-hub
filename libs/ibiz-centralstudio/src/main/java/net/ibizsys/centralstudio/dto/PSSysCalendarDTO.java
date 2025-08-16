package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSCALENDAR</B>系统日历部件 模型传输对象
 * <P>
 * 系统日历部件模型，定义界面表现及处理逻辑，支持多个日历项同时提供日历数据源
 */
public class PSSysCalendarDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysCalendarDTO(){
    }      

    /**
     * <B>BATPSDETOOLBARID</B>&nbsp;批操作工具栏，指定日历部件内建的批操作工具栏对象，批操作工具栏为选择数据提供操作能力
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEToolbarDTO} 
     */
    public final static String FIELD_BATPSDETOOLBARID = "batpsdetoolbarid";

    /**
     * 设置 批操作工具栏，详细说明：{@link #FIELD_BATPSDETOOLBARID}
     * 
     * @param batPSDEToolbarId
     * 
     */
    @JsonProperty(FIELD_BATPSDETOOLBARID)
    public void setBatPSDEToolbarId(String batPSDEToolbarId){
        this.set(FIELD_BATPSDETOOLBARID, batPSDEToolbarId);
    }
    
    /**
     * 获取 批操作工具栏  
     * @return
     */
    @JsonIgnore
    public String getBatPSDEToolbarId(){
        Object objValue = this.get(FIELD_BATPSDETOOLBARID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 批操作工具栏 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBatPSDEToolbarIdDirty(){
        if(this.contains(FIELD_BATPSDETOOLBARID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 批操作工具栏
     */
    @JsonIgnore
    public void resetBatPSDEToolbarId(){
        this.reset(FIELD_BATPSDETOOLBARID);
    }

    /**
     * 设置 批操作工具栏，详细说明：{@link #FIELD_BATPSDETOOLBARID}
     * <P>
     * 等同 {@link #setBatPSDEToolbarId}
     * @param batPSDEToolbarId
     */
    @JsonIgnore
    public PSSysCalendarDTO batpsdetoolbarid(String batPSDEToolbarId){
        this.setBatPSDEToolbarId(batPSDEToolbarId);
        return this;
    }

    /**
     * 设置 批操作工具栏，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setBatPSDEToolbarId}
     * @param pSDEToolbar 引用对象
     */
    @JsonIgnore
    public PSSysCalendarDTO batpsdetoolbarid(PSDEToolbarDTO pSDEToolbar){
        if(pSDEToolbar == null){
            this.setBatPSDEToolbarId(null);
            this.setBatPSDEToolbarName(null);
        }
        else{
            this.setBatPSDEToolbarId(pSDEToolbar.getPSDEToolbarId());
            this.setBatPSDEToolbarName(pSDEToolbar.getPSDEToolbarName());
        }
        return this;
    }

    /**
     * <B>BATPSDETOOLBARNAME</B>&nbsp;批操作工具栏，指定日历部件内建的批操作工具栏对象，批操作工具栏为选择数据提供操作能力
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_BATPSDETOOLBARID}
     */
    public final static String FIELD_BATPSDETOOLBARNAME = "batpsdetoolbarname";

    /**
     * 设置 批操作工具栏，详细说明：{@link #FIELD_BATPSDETOOLBARNAME}
     * 
     * @param batPSDEToolbarName
     * 
     */
    @JsonProperty(FIELD_BATPSDETOOLBARNAME)
    public void setBatPSDEToolbarName(String batPSDEToolbarName){
        this.set(FIELD_BATPSDETOOLBARNAME, batPSDEToolbarName);
    }
    
    /**
     * 获取 批操作工具栏  
     * @return
     */
    @JsonIgnore
    public String getBatPSDEToolbarName(){
        Object objValue = this.get(FIELD_BATPSDETOOLBARNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 批操作工具栏 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBatPSDEToolbarNameDirty(){
        if(this.contains(FIELD_BATPSDETOOLBARNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 批操作工具栏
     */
    @JsonIgnore
    public void resetBatPSDEToolbarName(){
        this.reset(FIELD_BATPSDETOOLBARNAME);
    }

    /**
     * 设置 批操作工具栏，详细说明：{@link #FIELD_BATPSDETOOLBARNAME}
     * <P>
     * 等同 {@link #setBatPSDEToolbarName}
     * @param batPSDEToolbarName
     */
    @JsonIgnore
    public PSSysCalendarDTO batpsdetoolbarname(String batPSDEToolbarName){
        this.setBatPSDEToolbarName(batPSDEToolbarName);
        return this;
    }

    /**
     * <B>BUSYINDICATOR</B>&nbsp;显示处理提示
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
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
    public PSSysCalendarDTO busyindicator(Integer busyIndicator){
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
    public PSSysCalendarDTO busyindicator(Boolean busyIndicator){
        if(busyIndicator == null){
            this.setBusyIndicator(null);
        }
        else{
            this.setBusyIndicator(busyIndicator?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CALENDARSTYLE</B>&nbsp;日历部件样式，指定日历部件的内置样式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.CalendarStyle} 
     */
    public final static String FIELD_CALENDARSTYLE = "calendarstyle";

    /**
     * 设置 日历部件样式，详细说明：{@link #FIELD_CALENDARSTYLE}
     * 
     * @param calendarStyle
     * 
     */
    @JsonProperty(FIELD_CALENDARSTYLE)
    public void setCalendarStyle(String calendarStyle){
        this.set(FIELD_CALENDARSTYLE, calendarStyle);
    }
    
    /**
     * 获取 日历部件样式  
     * @return
     */
    @JsonIgnore
    public String getCalendarStyle(){
        Object objValue = this.get(FIELD_CALENDARSTYLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 日历部件样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCalendarStyleDirty(){
        if(this.contains(FIELD_CALENDARSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 日历部件样式
     */
    @JsonIgnore
    public void resetCalendarStyle(){
        this.reset(FIELD_CALENDARSTYLE);
    }

    /**
     * 设置 日历部件样式，详细说明：{@link #FIELD_CALENDARSTYLE}
     * <P>
     * 等同 {@link #setCalendarStyle}
     * @param calendarStyle
     */
    @JsonIgnore
    public PSSysCalendarDTO calendarstyle(String calendarStyle){
        this.setCalendarStyle(calendarStyle);
        return this;
    }

     /**
     * 设置 日历部件样式，详细说明：{@link #FIELD_CALENDARSTYLE}
     * <P>
     * 等同 {@link #setCalendarStyle}
     * @param calendarStyle
     */
    @JsonIgnore
    public PSSysCalendarDTO calendarstyle(net.ibizsys.model.PSModelEnums.CalendarStyle calendarStyle){
        if(calendarStyle == null){
            this.setCalendarStyle(null);
        }
        else{
            this.setCalendarStyle(calendarStyle.value);
        }
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定日历部件的代码标识，需要在所在的实体中具有唯一性
     * <P>
     * 字符串：最大长度 100
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
    public PSSysCalendarDTO codename(String codeName){
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
    public PSSysCalendarDTO createdate(Timestamp createDate){
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
    public PSSysCalendarDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>EMPTYTEXT</B>&nbsp;无值显示内容，指定日历视图部件的无值显示内容，未定义时使用前端应用配置
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_EMPTYTEXT = "emptytext";

    /**
     * 设置 无值显示内容，详细说明：{@link #FIELD_EMPTYTEXT}
     * 
     * @param emptyText
     * 
     */
    @JsonProperty(FIELD_EMPTYTEXT)
    public void setEmptyText(String emptyText){
        this.set(FIELD_EMPTYTEXT, emptyText);
    }
    
    /**
     * 获取 无值显示内容  
     * @return
     */
    @JsonIgnore
    public String getEmptyText(){
        Object objValue = this.get(FIELD_EMPTYTEXT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 无值显示内容 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEmptyTextDirty(){
        if(this.contains(FIELD_EMPTYTEXT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 无值显示内容
     */
    @JsonIgnore
    public void resetEmptyText(){
        this.reset(FIELD_EMPTYTEXT);
    }

    /**
     * 设置 无值显示内容，详细说明：{@link #FIELD_EMPTYTEXT}
     * <P>
     * 等同 {@link #setEmptyText}
     * @param emptyText
     */
    @JsonIgnore
    public PSSysCalendarDTO emptytext(String emptyText){
        this.setEmptyText(emptyText);
        return this;
    }

    /**
     * <B>EMPTYTEXTPSLANRESID</B>&nbsp;无值内容语言资源，指定日历视图部件的无值显示内容多语言资源对象，未定义时使用前端应用配置
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSLanguageResDTO} 
     */
    public final static String FIELD_EMPTYTEXTPSLANRESID = "emptytextpslanresid";

    /**
     * 设置 无值内容语言资源，详细说明：{@link #FIELD_EMPTYTEXTPSLANRESID}
     * 
     * @param emptyTextPSLanResId
     * 
     */
    @JsonProperty(FIELD_EMPTYTEXTPSLANRESID)
    public void setEmptyTextPSLanResId(String emptyTextPSLanResId){
        this.set(FIELD_EMPTYTEXTPSLANRESID, emptyTextPSLanResId);
    }
    
    /**
     * 获取 无值内容语言资源  
     * @return
     */
    @JsonIgnore
    public String getEmptyTextPSLanResId(){
        Object objValue = this.get(FIELD_EMPTYTEXTPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 无值内容语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEmptyTextPSLanResIdDirty(){
        if(this.contains(FIELD_EMPTYTEXTPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 无值内容语言资源
     */
    @JsonIgnore
    public void resetEmptyTextPSLanResId(){
        this.reset(FIELD_EMPTYTEXTPSLANRESID);
    }

    /**
     * 设置 无值内容语言资源，详细说明：{@link #FIELD_EMPTYTEXTPSLANRESID}
     * <P>
     * 等同 {@link #setEmptyTextPSLanResId}
     * @param emptyTextPSLanResId
     */
    @JsonIgnore
    public PSSysCalendarDTO emptytextpslanresid(String emptyTextPSLanResId){
        this.setEmptyTextPSLanResId(emptyTextPSLanResId);
        return this;
    }

    /**
     * 设置 无值内容语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setEmptyTextPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSSysCalendarDTO emptytextpslanresid(PSLanguageResDTO pSLanguageRes){
        if(pSLanguageRes == null){
            this.setEmptyTextPSLanResId(null);
            this.setEmptyTextPSLanResName(null);
        }
        else{
            this.setEmptyTextPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setEmptyTextPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>EMPTYTEXTPSLANRESNAME</B>&nbsp;无值内容语言资源，指定日历视图部件的无值显示内容多语言资源对象，未定义时使用前端应用配置
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_EMPTYTEXTPSLANRESID}
     */
    public final static String FIELD_EMPTYTEXTPSLANRESNAME = "emptytextpslanresname";

    /**
     * 设置 无值内容语言资源，详细说明：{@link #FIELD_EMPTYTEXTPSLANRESNAME}
     * 
     * @param emptyTextPSLanResName
     * 
     */
    @JsonProperty(FIELD_EMPTYTEXTPSLANRESNAME)
    public void setEmptyTextPSLanResName(String emptyTextPSLanResName){
        this.set(FIELD_EMPTYTEXTPSLANRESNAME, emptyTextPSLanResName);
    }
    
    /**
     * 获取 无值内容语言资源  
     * @return
     */
    @JsonIgnore
    public String getEmptyTextPSLanResName(){
        Object objValue = this.get(FIELD_EMPTYTEXTPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 无值内容语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEmptyTextPSLanResNameDirty(){
        if(this.contains(FIELD_EMPTYTEXTPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 无值内容语言资源
     */
    @JsonIgnore
    public void resetEmptyTextPSLanResName(){
        this.reset(FIELD_EMPTYTEXTPSLANRESNAME);
    }

    /**
     * 设置 无值内容语言资源，详细说明：{@link #FIELD_EMPTYTEXTPSLANRESNAME}
     * <P>
     * 等同 {@link #setEmptyTextPSLanResName}
     * @param emptyTextPSLanResName
     */
    @JsonIgnore
    public PSSysCalendarDTO emptytextpslanresname(String emptyTextPSLanResName){
        this.setEmptyTextPSLanResName(emptyTextPSLanResName);
        return this;
    }

    /**
     * <B>ENABLEEDIT</B>&nbsp;启用编辑
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEEDIT = "enableedit";

    /**
     * 设置 启用编辑
     * 
     * @param enableEdit
     * 
     */
    @JsonProperty(FIELD_ENABLEEDIT)
    public void setEnableEdit(Integer enableEdit){
        this.set(FIELD_ENABLEEDIT, enableEdit);
    }
    
    /**
     * 获取 启用编辑  
     * @return
     */
    @JsonIgnore
    public Integer getEnableEdit(){
        Object objValue = this.get(FIELD_ENABLEEDIT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用编辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableEditDirty(){
        if(this.contains(FIELD_ENABLEEDIT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用编辑
     */
    @JsonIgnore
    public void resetEnableEdit(){
        this.reset(FIELD_ENABLEEDIT);
    }

    /**
     * 设置 启用编辑
     * <P>
     * 等同 {@link #setEnableEdit}
     * @param enableEdit
     */
    @JsonIgnore
    public PSSysCalendarDTO enableedit(Integer enableEdit){
        this.setEnableEdit(enableEdit);
        return this;
    }

     /**
     * 设置 启用编辑
     * <P>
     * 等同 {@link #setEnableEdit}
     * @param enableEdit
     */
    @JsonIgnore
    public PSSysCalendarDTO enableedit(Boolean enableEdit){
        if(enableEdit == null){
            this.setEnableEdit(null);
        }
        else{
            this.setEnableEdit(enableEdit?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>GANTTFLAG</B>&nbsp;支持甘特图
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_GANTTFLAG = "ganttflag";

    /**
     * 设置 支持甘特图
     * 
     * @param ganttFlag
     * 
     */
    @JsonProperty(FIELD_GANTTFLAG)
    public void setGanttFlag(Integer ganttFlag){
        this.set(FIELD_GANTTFLAG, ganttFlag);
    }
    
    /**
     * 获取 支持甘特图  
     * @return
     */
    @JsonIgnore
    public Integer getGanttFlag(){
        Object objValue = this.get(FIELD_GANTTFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持甘特图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGanttFlagDirty(){
        if(this.contains(FIELD_GANTTFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持甘特图
     */
    @JsonIgnore
    public void resetGanttFlag(){
        this.reset(FIELD_GANTTFLAG);
    }

    /**
     * 设置 支持甘特图
     * <P>
     * 等同 {@link #setGanttFlag}
     * @param ganttFlag
     */
    @JsonIgnore
    public PSSysCalendarDTO ganttflag(Integer ganttFlag){
        this.setGanttFlag(ganttFlag);
        return this;
    }

     /**
     * 设置 支持甘特图
     * <P>
     * 等同 {@link #setGanttFlag}
     * @param ganttFlag
     */
    @JsonIgnore
    public PSSysCalendarDTO ganttflag(Boolean ganttFlag){
        if(ganttFlag == null){
            this.setGanttFlag(null);
        }
        else{
            this.setGanttFlag(ganttFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>GANTTPSSYSPFPLUGINID</B>&nbsp;甘特前端插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysPFPluginDTO} 
     */
    public final static String FIELD_GANTTPSSYSPFPLUGINID = "ganttpssyspfpluginid";

    /**
     * 设置 甘特前端插件
     * 
     * @param ganttPSSysPFPluginId
     * 
     */
    @JsonProperty(FIELD_GANTTPSSYSPFPLUGINID)
    public void setGanttPSSysPFPluginId(String ganttPSSysPFPluginId){
        this.set(FIELD_GANTTPSSYSPFPLUGINID, ganttPSSysPFPluginId);
    }
    
    /**
     * 获取 甘特前端插件  
     * @return
     */
    @JsonIgnore
    public String getGanttPSSysPFPluginId(){
        Object objValue = this.get(FIELD_GANTTPSSYSPFPLUGINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 甘特前端插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGanttPSSysPFPluginIdDirty(){
        if(this.contains(FIELD_GANTTPSSYSPFPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 甘特前端插件
     */
    @JsonIgnore
    public void resetGanttPSSysPFPluginId(){
        this.reset(FIELD_GANTTPSSYSPFPLUGINID);
    }

    /**
     * 设置 甘特前端插件
     * <P>
     * 等同 {@link #setGanttPSSysPFPluginId}
     * @param ganttPSSysPFPluginId
     */
    @JsonIgnore
    public PSSysCalendarDTO ganttpssyspfpluginid(String ganttPSSysPFPluginId){
        this.setGanttPSSysPFPluginId(ganttPSSysPFPluginId);
        return this;
    }

    /**
     * 设置 甘特前端插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setGanttPSSysPFPluginId}
     * @param pSSysPFPlugin 引用对象
     */
    @JsonIgnore
    public PSSysCalendarDTO ganttpssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin){
        if(pSSysPFPlugin == null){
            this.setGanttPSSysPFPluginId(null);
            this.setGanttPSSysPFPluginName(null);
        }
        else{
            this.setGanttPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setGanttPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    /**
     * <B>GANTTPSSYSPFPLUGINNAME</B>&nbsp;甘特前端插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GANTTPSSYSPFPLUGINID}
     */
    public final static String FIELD_GANTTPSSYSPFPLUGINNAME = "ganttpssyspfpluginname";

    /**
     * 设置 甘特前端插件
     * 
     * @param ganttPSSysPFPluginName
     * 
     */
    @JsonProperty(FIELD_GANTTPSSYSPFPLUGINNAME)
    public void setGanttPSSysPFPluginName(String ganttPSSysPFPluginName){
        this.set(FIELD_GANTTPSSYSPFPLUGINNAME, ganttPSSysPFPluginName);
    }
    
    /**
     * 获取 甘特前端插件  
     * @return
     */
    @JsonIgnore
    public String getGanttPSSysPFPluginName(){
        Object objValue = this.get(FIELD_GANTTPSSYSPFPLUGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 甘特前端插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGanttPSSysPFPluginNameDirty(){
        if(this.contains(FIELD_GANTTPSSYSPFPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 甘特前端插件
     */
    @JsonIgnore
    public void resetGanttPSSysPFPluginName(){
        this.reset(FIELD_GANTTPSSYSPFPLUGINNAME);
    }

    /**
     * 设置 甘特前端插件
     * <P>
     * 等同 {@link #setGanttPSSysPFPluginName}
     * @param ganttPSSysPFPluginName
     */
    @JsonIgnore
    public PSSysCalendarDTO ganttpssyspfpluginname(String ganttPSSysPFPluginName){
        this.setGanttPSSysPFPluginName(ganttPSSysPFPluginName);
        return this;
    }

    /**
     * <B>GANTTSTYLE</B>&nbsp;甘特部件样式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.GanttStyle} 
     */
    public final static String FIELD_GANTTSTYLE = "ganttstyle";

    /**
     * 设置 甘特部件样式
     * 
     * @param ganttStyle
     * 
     */
    @JsonProperty(FIELD_GANTTSTYLE)
    public void setGanttStyle(String ganttStyle){
        this.set(FIELD_GANTTSTYLE, ganttStyle);
    }
    
    /**
     * 获取 甘特部件样式  
     * @return
     */
    @JsonIgnore
    public String getGanttStyle(){
        Object objValue = this.get(FIELD_GANTTSTYLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 甘特部件样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGanttStyleDirty(){
        if(this.contains(FIELD_GANTTSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 甘特部件样式
     */
    @JsonIgnore
    public void resetGanttStyle(){
        this.reset(FIELD_GANTTSTYLE);
    }

    /**
     * 设置 甘特部件样式
     * <P>
     * 等同 {@link #setGanttStyle}
     * @param ganttStyle
     */
    @JsonIgnore
    public PSSysCalendarDTO ganttstyle(String ganttStyle){
        this.setGanttStyle(ganttStyle);
        return this;
    }

     /**
     * 设置 甘特部件样式
     * <P>
     * 等同 {@link #setGanttStyle}
     * @param ganttStyle
     */
    @JsonIgnore
    public PSSysCalendarDTO ganttstyle(net.ibizsys.model.PSModelEnums.GanttStyle ganttStyle){
        if(ganttStyle == null){
            this.setGanttStyle(null);
        }
        else{
            this.setGanttStyle(ganttStyle.value);
        }
        return this;
    }

    /**
     * <B>GROUPHEIGHT</B>&nbsp;分组高度
     */
    public final static String FIELD_GROUPHEIGHT = "groupheight";

    /**
     * 设置 分组高度
     * 
     * @param groupHeight
     * 
     */
    @JsonProperty(FIELD_GROUPHEIGHT)
    public void setGroupHeight(Integer groupHeight){
        this.set(FIELD_GROUPHEIGHT, groupHeight);
    }
    
    /**
     * 获取 分组高度  
     * @return
     */
    @JsonIgnore
    public Integer getGroupHeight(){
        Object objValue = this.get(FIELD_GROUPHEIGHT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 分组高度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupHeightDirty(){
        if(this.contains(FIELD_GROUPHEIGHT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组高度
     */
    @JsonIgnore
    public void resetGroupHeight(){
        this.reset(FIELD_GROUPHEIGHT);
    }

    /**
     * 设置 分组高度
     * <P>
     * 等同 {@link #setGroupHeight}
     * @param groupHeight
     */
    @JsonIgnore
    public PSSysCalendarDTO groupheight(Integer groupHeight){
        this.setGroupHeight(groupHeight);
        return this;
    }

    /**
     * <B>GROUPLAYOUT</B>&nbsp;分组布局
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.MDCtrlGroupLayout} 
     */
    public final static String FIELD_GROUPLAYOUT = "grouplayout";

    /**
     * 设置 分组布局
     * 
     * @param groupLayout
     * 
     */
    @JsonProperty(FIELD_GROUPLAYOUT)
    public void setGroupLayout(String groupLayout){
        this.set(FIELD_GROUPLAYOUT, groupLayout);
    }
    
    /**
     * 获取 分组布局  
     * @return
     */
    @JsonIgnore
    public String getGroupLayout(){
        Object objValue = this.get(FIELD_GROUPLAYOUT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组布局 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupLayoutDirty(){
        if(this.contains(FIELD_GROUPLAYOUT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组布局
     */
    @JsonIgnore
    public void resetGroupLayout(){
        this.reset(FIELD_GROUPLAYOUT);
    }

    /**
     * 设置 分组布局
     * <P>
     * 等同 {@link #setGroupLayout}
     * @param groupLayout
     */
    @JsonIgnore
    public PSSysCalendarDTO grouplayout(String groupLayout){
        this.setGroupLayout(groupLayout);
        return this;
    }

     /**
     * 设置 分组布局
     * <P>
     * 等同 {@link #setGroupLayout}
     * @param groupLayout
     */
    @JsonIgnore
    public PSSysCalendarDTO grouplayout(net.ibizsys.model.PSModelEnums.MDCtrlGroupLayout groupLayout){
        if(groupLayout == null){
            this.setGroupLayout(null);
        }
        else{
            this.setGroupLayout(groupLayout.value);
        }
        return this;
    }

    /**
     * <B>GROUPMODE</B>&nbsp;分组模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.MDCtrlGroupMode} 
     */
    public final static String FIELD_GROUPMODE = "groupmode";

    /**
     * 设置 分组模式
     * 
     * @param groupMode
     * 
     */
    @JsonProperty(FIELD_GROUPMODE)
    public void setGroupMode(String groupMode){
        this.set(FIELD_GROUPMODE, groupMode);
    }
    
    /**
     * 获取 分组模式  
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
     * 判断 分组模式 是否指定值，包括空值
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
     * 重置 分组模式
     */
    @JsonIgnore
    public void resetGroupMode(){
        this.reset(FIELD_GROUPMODE);
    }

    /**
     * 设置 分组模式
     * <P>
     * 等同 {@link #setGroupMode}
     * @param groupMode
     */
    @JsonIgnore
    public PSSysCalendarDTO groupmode(String groupMode){
        this.setGroupMode(groupMode);
        return this;
    }

     /**
     * 设置 分组模式
     * <P>
     * 等同 {@link #setGroupMode}
     * @param groupMode
     */
    @JsonIgnore
    public PSSysCalendarDTO groupmode(net.ibizsys.model.PSModelEnums.MDCtrlGroupMode groupMode){
        if(groupMode == null){
            this.setGroupMode(null);
        }
        else{
            this.setGroupMode(groupMode.value);
        }
        return this;
    }

    /**
     * <B>GROUPPSCODELISTID</B>&nbsp;分组代码表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSCodeListDTO} 
     */
    public final static String FIELD_GROUPPSCODELISTID = "grouppscodelistid";

    /**
     * 设置 分组代码表
     * 
     * @param groupPSCodeListId
     * 
     */
    @JsonProperty(FIELD_GROUPPSCODELISTID)
    public void setGroupPSCodeListId(String groupPSCodeListId){
        this.set(FIELD_GROUPPSCODELISTID, groupPSCodeListId);
    }
    
    /**
     * 获取 分组代码表  
     * @return
     */
    @JsonIgnore
    public String getGroupPSCodeListId(){
        Object objValue = this.get(FIELD_GROUPPSCODELISTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组代码表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSCodeListIdDirty(){
        if(this.contains(FIELD_GROUPPSCODELISTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组代码表
     */
    @JsonIgnore
    public void resetGroupPSCodeListId(){
        this.reset(FIELD_GROUPPSCODELISTID);
    }

    /**
     * 设置 分组代码表
     * <P>
     * 等同 {@link #setGroupPSCodeListId}
     * @param groupPSCodeListId
     */
    @JsonIgnore
    public PSSysCalendarDTO grouppscodelistid(String groupPSCodeListId){
        this.setGroupPSCodeListId(groupPSCodeListId);
        return this;
    }

    /**
     * 设置 分组代码表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setGroupPSCodeListId}
     * @param pSCodeList 引用对象
     */
    @JsonIgnore
    public PSSysCalendarDTO grouppscodelistid(PSCodeListDTO pSCodeList){
        if(pSCodeList == null){
            this.setGroupPSCodeListId(null);
            this.setGroupPSCodeListName(null);
        }
        else{
            this.setGroupPSCodeListId(pSCodeList.getPSCodeListId());
            this.setGroupPSCodeListName(pSCodeList.getPSCodeListName());
        }
        return this;
    }

    /**
     * <B>GROUPPSCODELISTNAME</B>&nbsp;分组代码表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GROUPPSCODELISTID}
     */
    public final static String FIELD_GROUPPSCODELISTNAME = "grouppscodelistname";

    /**
     * 设置 分组代码表
     * 
     * @param groupPSCodeListName
     * 
     */
    @JsonProperty(FIELD_GROUPPSCODELISTNAME)
    public void setGroupPSCodeListName(String groupPSCodeListName){
        this.set(FIELD_GROUPPSCODELISTNAME, groupPSCodeListName);
    }
    
    /**
     * 获取 分组代码表  
     * @return
     */
    @JsonIgnore
    public String getGroupPSCodeListName(){
        Object objValue = this.get(FIELD_GROUPPSCODELISTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组代码表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSCodeListNameDirty(){
        if(this.contains(FIELD_GROUPPSCODELISTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组代码表
     */
    @JsonIgnore
    public void resetGroupPSCodeListName(){
        this.reset(FIELD_GROUPPSCODELISTNAME);
    }

    /**
     * 设置 分组代码表
     * <P>
     * 等同 {@link #setGroupPSCodeListName}
     * @param groupPSCodeListName
     */
    @JsonIgnore
    public PSSysCalendarDTO grouppscodelistname(String groupPSCodeListName){
        this.setGroupPSCodeListName(groupPSCodeListName);
        return this;
    }

    /**
     * <B>GROUPPSDEFID</B>&nbsp;分组属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_GROUPPSDEFID = "grouppsdefid";

    /**
     * 设置 分组属性
     * 
     * @param groupPSDEFId
     * 
     */
    @JsonProperty(FIELD_GROUPPSDEFID)
    public void setGroupPSDEFId(String groupPSDEFId){
        this.set(FIELD_GROUPPSDEFID, groupPSDEFId);
    }
    
    /**
     * 获取 分组属性  
     * @return
     */
    @JsonIgnore
    public String getGroupPSDEFId(){
        Object objValue = this.get(FIELD_GROUPPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSDEFIdDirty(){
        if(this.contains(FIELD_GROUPPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组属性
     */
    @JsonIgnore
    public void resetGroupPSDEFId(){
        this.reset(FIELD_GROUPPSDEFID);
    }

    /**
     * 设置 分组属性
     * <P>
     * 等同 {@link #setGroupPSDEFId}
     * @param groupPSDEFId
     */
    @JsonIgnore
    public PSSysCalendarDTO grouppsdefid(String groupPSDEFId){
        this.setGroupPSDEFId(groupPSDEFId);
        return this;
    }

    /**
     * 设置 分组属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setGroupPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysCalendarDTO grouppsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setGroupPSDEFId(null);
            this.setGroupPSDEFName(null);
        }
        else{
            this.setGroupPSDEFId(pSDEField.getPSDEFieldId());
            this.setGroupPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>GROUPPSDEFNAME</B>&nbsp;分组属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GROUPPSDEFID}
     */
    public final static String FIELD_GROUPPSDEFNAME = "grouppsdefname";

    /**
     * 设置 分组属性
     * 
     * @param groupPSDEFName
     * 
     */
    @JsonProperty(FIELD_GROUPPSDEFNAME)
    public void setGroupPSDEFName(String groupPSDEFName){
        this.set(FIELD_GROUPPSDEFNAME, groupPSDEFName);
    }
    
    /**
     * 获取 分组属性  
     * @return
     */
    @JsonIgnore
    public String getGroupPSDEFName(){
        Object objValue = this.get(FIELD_GROUPPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSDEFNameDirty(){
        if(this.contains(FIELD_GROUPPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组属性
     */
    @JsonIgnore
    public void resetGroupPSDEFName(){
        this.reset(FIELD_GROUPPSDEFNAME);
    }

    /**
     * 设置 分组属性
     * <P>
     * 等同 {@link #setGroupPSDEFName}
     * @param groupPSDEFName
     */
    @JsonIgnore
    public PSSysCalendarDTO grouppsdefname(String groupPSDEFName){
        this.setGroupPSDEFName(groupPSDEFName);
        return this;
    }

    /**
     * <B>GROUPPSSYSCSSID</B>&nbsp;分组样式
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysCssDTO} 
     */
    public final static String FIELD_GROUPPSSYSCSSID = "grouppssyscssid";

    /**
     * 设置 分组样式
     * 
     * @param groupPSSysCssId
     * 
     */
    @JsonProperty(FIELD_GROUPPSSYSCSSID)
    public void setGroupPSSysCssId(String groupPSSysCssId){
        this.set(FIELD_GROUPPSSYSCSSID, groupPSSysCssId);
    }
    
    /**
     * 获取 分组样式  
     * @return
     */
    @JsonIgnore
    public String getGroupPSSysCssId(){
        Object objValue = this.get(FIELD_GROUPPSSYSCSSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSSysCssIdDirty(){
        if(this.contains(FIELD_GROUPPSSYSCSSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组样式
     */
    @JsonIgnore
    public void resetGroupPSSysCssId(){
        this.reset(FIELD_GROUPPSSYSCSSID);
    }

    /**
     * 设置 分组样式
     * <P>
     * 等同 {@link #setGroupPSSysCssId}
     * @param groupPSSysCssId
     */
    @JsonIgnore
    public PSSysCalendarDTO grouppssyscssid(String groupPSSysCssId){
        this.setGroupPSSysCssId(groupPSSysCssId);
        return this;
    }

    /**
     * 设置 分组样式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setGroupPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSSysCalendarDTO grouppssyscssid(PSSysCssDTO pSSysCss){
        if(pSSysCss == null){
            this.setGroupPSSysCssId(null);
            this.setGroupPSSysCssName(null);
        }
        else{
            this.setGroupPSSysCssId(pSSysCss.getPSSysCssId());
            this.setGroupPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    /**
     * <B>GROUPPSSYSCSSNAME</B>&nbsp;分组样式表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GROUPPSSYSCSSID}
     */
    public final static String FIELD_GROUPPSSYSCSSNAME = "grouppssyscssname";

    /**
     * 设置 分组样式表
     * 
     * @param groupPSSysCssName
     * 
     */
    @JsonProperty(FIELD_GROUPPSSYSCSSNAME)
    public void setGroupPSSysCssName(String groupPSSysCssName){
        this.set(FIELD_GROUPPSSYSCSSNAME, groupPSSysCssName);
    }
    
    /**
     * 获取 分组样式表  
     * @return
     */
    @JsonIgnore
    public String getGroupPSSysCssName(){
        Object objValue = this.get(FIELD_GROUPPSSYSCSSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSSysCssNameDirty(){
        if(this.contains(FIELD_GROUPPSSYSCSSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组样式表
     */
    @JsonIgnore
    public void resetGroupPSSysCssName(){
        this.reset(FIELD_GROUPPSSYSCSSNAME);
    }

    /**
     * 设置 分组样式表
     * <P>
     * 等同 {@link #setGroupPSSysCssName}
     * @param groupPSSysCssName
     */
    @JsonIgnore
    public PSSysCalendarDTO grouppssyscssname(String groupPSSysCssName){
        this.setGroupPSSysCssName(groupPSSysCssName);
        return this;
    }

    /**
     * <B>GROUPPSSYSPFPLUGINID</B>&nbsp;分组前端插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysPFPluginDTO} 
     */
    public final static String FIELD_GROUPPSSYSPFPLUGINID = "grouppssyspfpluginid";

    /**
     * 设置 分组前端插件
     * 
     * @param groupPSSysPFPluginId
     * 
     */
    @JsonProperty(FIELD_GROUPPSSYSPFPLUGINID)
    public void setGroupPSSysPFPluginId(String groupPSSysPFPluginId){
        this.set(FIELD_GROUPPSSYSPFPLUGINID, groupPSSysPFPluginId);
    }
    
    /**
     * 获取 分组前端插件  
     * @return
     */
    @JsonIgnore
    public String getGroupPSSysPFPluginId(){
        Object objValue = this.get(FIELD_GROUPPSSYSPFPLUGINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组前端插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSSysPFPluginIdDirty(){
        if(this.contains(FIELD_GROUPPSSYSPFPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组前端插件
     */
    @JsonIgnore
    public void resetGroupPSSysPFPluginId(){
        this.reset(FIELD_GROUPPSSYSPFPLUGINID);
    }

    /**
     * 设置 分组前端插件
     * <P>
     * 等同 {@link #setGroupPSSysPFPluginId}
     * @param groupPSSysPFPluginId
     */
    @JsonIgnore
    public PSSysCalendarDTO grouppssyspfpluginid(String groupPSSysPFPluginId){
        this.setGroupPSSysPFPluginId(groupPSSysPFPluginId);
        return this;
    }

    /**
     * 设置 分组前端插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setGroupPSSysPFPluginId}
     * @param pSSysPFPlugin 引用对象
     */
    @JsonIgnore
    public PSSysCalendarDTO grouppssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin){
        if(pSSysPFPlugin == null){
            this.setGroupPSSysPFPluginId(null);
            this.setGroupPSSysPFPluginName(null);
        }
        else{
            this.setGroupPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setGroupPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    /**
     * <B>GROUPPSSYSPFPLUGINNAME</B>&nbsp;分组前端插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GROUPPSSYSPFPLUGINID}
     */
    public final static String FIELD_GROUPPSSYSPFPLUGINNAME = "grouppssyspfpluginname";

    /**
     * 设置 分组前端插件
     * 
     * @param groupPSSysPFPluginName
     * 
     */
    @JsonProperty(FIELD_GROUPPSSYSPFPLUGINNAME)
    public void setGroupPSSysPFPluginName(String groupPSSysPFPluginName){
        this.set(FIELD_GROUPPSSYSPFPLUGINNAME, groupPSSysPFPluginName);
    }
    
    /**
     * 获取 分组前端插件  
     * @return
     */
    @JsonIgnore
    public String getGroupPSSysPFPluginName(){
        Object objValue = this.get(FIELD_GROUPPSSYSPFPLUGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组前端插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSSysPFPluginNameDirty(){
        if(this.contains(FIELD_GROUPPSSYSPFPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组前端插件
     */
    @JsonIgnore
    public void resetGroupPSSysPFPluginName(){
        this.reset(FIELD_GROUPPSSYSPFPLUGINNAME);
    }

    /**
     * 设置 分组前端插件
     * <P>
     * 等同 {@link #setGroupPSSysPFPluginName}
     * @param groupPSSysPFPluginName
     */
    @JsonIgnore
    public PSSysCalendarDTO grouppssyspfpluginname(String groupPSSysPFPluginName){
        this.setGroupPSSysPFPluginName(groupPSSysPFPluginName);
        return this;
    }

    /**
     * <B>GROUPWIDTH</B>&nbsp;分组宽度
     */
    public final static String FIELD_GROUPWIDTH = "groupwidth";

    /**
     * 设置 分组宽度
     * 
     * @param groupWidth
     * 
     */
    @JsonProperty(FIELD_GROUPWIDTH)
    public void setGroupWidth(Integer groupWidth){
        this.set(FIELD_GROUPWIDTH, groupWidth);
    }
    
    /**
     * 获取 分组宽度  
     * @return
     */
    @JsonIgnore
    public Integer getGroupWidth(){
        Object objValue = this.get(FIELD_GROUPWIDTH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 分组宽度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupWidthDirty(){
        if(this.contains(FIELD_GROUPWIDTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组宽度
     */
    @JsonIgnore
    public void resetGroupWidth(){
        this.reset(FIELD_GROUPWIDTH);
    }

    /**
     * 设置 分组宽度
     * <P>
     * 等同 {@link #setGroupWidth}
     * @param groupWidth
     */
    @JsonIgnore
    public PSSysCalendarDTO groupwidth(Integer groupWidth){
        this.setGroupWidth(groupWidth);
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;逻辑名称，指定日历视图部件的逻辑名称
     * <P>
     * 字符串：最大长度 100
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
    public PSSysCalendarDTO logicname(String logicName){
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
    public PSSysCalendarDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSCTRLLOGICGROUPID</B>&nbsp;界面逻辑组，指定日历部件默认附加的部件逻辑组对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSCtrlLogicGroupDTO} 
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
    public PSSysCalendarDTO psctrllogicgroupid(String pSCtrlLogicGroupId){
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
    public PSSysCalendarDTO psctrllogicgroupid(PSCtrlLogicGroupDTO pSCtrlLogicGroup){
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
     * <B>PSCTRLLOGICGROUPNAME</B>&nbsp;界面逻辑组，指定日历部件默认附加的部件逻辑组对象
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
    public PSSysCalendarDTO psctrllogicgroupname(String pSCtrlLogicGroupName){
        this.setPSCtrlLogicGroupName(pSCtrlLogicGroupName);
        return this;
    }

    /**
     * <B>PSCTRLMSGID</B>&nbsp;部件消息，指定日历部件默认的部件消息对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSCtrlMsgDTO} 
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
    public PSSysCalendarDTO psctrlmsgid(String pSCtrlMsgId){
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
    public PSSysCalendarDTO psctrlmsgid(PSCtrlMsgDTO pSCtrlMsg){
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
     * <B>PSCTRLMSGNAME</B>&nbsp;部件消息，指定日历部件默认的部件消息对象
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
    public PSSysCalendarDTO psctrlmsgname(String pSCtrlMsgName){
        this.setPSCtrlMsgName(pSCtrlMsgName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定日历视图部件所在的实体对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDataEntityDTO} 
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
    public PSSysCalendarDTO psdeid(String pSDEId){
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
    public PSSysCalendarDTO psdeid(PSDataEntityDTO pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;实体，指定日历视图部件所在的实体对象
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
    public PSSysCalendarDTO psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定系统日历部件所在的系统模块
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSModuleDTO} 
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
    public PSSysCalendarDTO psmoduleid(String pSModuleId){
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
    public PSSysCalendarDTO psmoduleid(PSModuleDTO pSModule){
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
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定系统日历部件所在的系统模块
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
    public PSSysCalendarDTO psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSYSAPPNAME</B>&nbsp;前端应用
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSAPPID}
     */
    public final static String FIELD_PSSYSAPPNAME = "pssysappname";

    /**
     * 设置 前端应用
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
     * 设置 前端应用
     * <P>
     * 等同 {@link #setPSSysAppName}
     * @param pSSysAppName
     */
    @JsonIgnore
    public PSSysCalendarDTO pssysappname(String pSSysAppName){
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    /**
     * <B>PSSYSCALENDARID</B>&nbsp;日历部件标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSCALENDARID = "pssyscalendarid";

    /**
     * 设置 日历部件标识
     * 
     * @param pSSysCalendarId
     * 
     */
    @JsonProperty(FIELD_PSSYSCALENDARID)
    public void setPSSysCalendarId(String pSSysCalendarId){
        this.set(FIELD_PSSYSCALENDARID, pSSysCalendarId);
    }
    
    /**
     * 获取 日历部件标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysCalendarId(){
        Object objValue = this.get(FIELD_PSSYSCALENDARID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 日历部件标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCalendarIdDirty(){
        if(this.contains(FIELD_PSSYSCALENDARID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 日历部件标识
     */
    @JsonIgnore
    public void resetPSSysCalendarId(){
        this.reset(FIELD_PSSYSCALENDARID);
    }

    /**
     * 设置 日历部件标识
     * <P>
     * 等同 {@link #setPSSysCalendarId}
     * @param pSSysCalendarId
     */
    @JsonIgnore
    public PSSysCalendarDTO pssyscalendarid(String pSSysCalendarId){
        this.setPSSysCalendarId(pSSysCalendarId);
        return this;
    }

    /**
     * <B>PSSYSCALENDARNAME</B>&nbsp;日历部件名称，指定日历视图部件的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSCALENDARNAME = "pssyscalendarname";

    /**
     * 设置 日历部件名称，详细说明：{@link #FIELD_PSSYSCALENDARNAME}
     * 
     * @param pSSysCalendarName
     * 
     */
    @JsonProperty(FIELD_PSSYSCALENDARNAME)
    public void setPSSysCalendarName(String pSSysCalendarName){
        this.set(FIELD_PSSYSCALENDARNAME, pSSysCalendarName);
    }
    
    /**
     * 获取 日历部件名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysCalendarName(){
        Object objValue = this.get(FIELD_PSSYSCALENDARNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 日历部件名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCalendarNameDirty(){
        if(this.contains(FIELD_PSSYSCALENDARNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 日历部件名称
     */
    @JsonIgnore
    public void resetPSSysCalendarName(){
        this.reset(FIELD_PSSYSCALENDARNAME);
    }

    /**
     * 设置 日历部件名称，详细说明：{@link #FIELD_PSSYSCALENDARNAME}
     * <P>
     * 等同 {@link #setPSSysCalendarName}
     * @param pSSysCalendarName
     */
    @JsonIgnore
    public PSSysCalendarDTO pssyscalendarname(String pSSysCalendarName){
        this.setPSSysCalendarName(pSSysCalendarName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysCalendarName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysCalendarName(strName);
    }

    @JsonIgnore
    public PSSysCalendarDTO name(String strName){
        this.setPSSysCalendarName(strName);
        return this;
    }

    /**
     * <B>PSSYSCSSID</B>&nbsp;默认样式表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysCssDTO} 
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
    public PSSysCalendarDTO pssyscssid(String pSSysCssId){
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
    public PSSysCalendarDTO pssyscssid(PSSysCssDTO pSSysCss){
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
    public PSSysCalendarDTO pssyscssname(String pSSysCssName){
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端扩展插件，指定系统日历部件使用的前端模板扩展插件，使用插件类型【日历部件绘制插件】
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysPFPluginDTO} 
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
    public PSSysCalendarDTO pssyspfpluginid(String pSSysPFPluginId){
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
    public PSSysCalendarDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin){
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
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端扩展插件，指定系统日历部件使用的前端模板扩展插件，使用插件类型【日历部件绘制插件】
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
    public PSSysCalendarDTO pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    /**
     * <B>QUICKPSDETOOLBARID</B>&nbsp;快速操作工具栏，指定日历部件内建的快速操作工具栏对象，快速操作工具栏一般用于新建等无选择数据的操作
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEToolbarDTO} 
     */
    public final static String FIELD_QUICKPSDETOOLBARID = "quickpsdetoolbarid";

    /**
     * 设置 快速操作工具栏，详细说明：{@link #FIELD_QUICKPSDETOOLBARID}
     * 
     * @param quickPSDEToolbarId
     * 
     */
    @JsonProperty(FIELD_QUICKPSDETOOLBARID)
    public void setQuickPSDEToolbarId(String quickPSDEToolbarId){
        this.set(FIELD_QUICKPSDETOOLBARID, quickPSDEToolbarId);
    }
    
    /**
     * 获取 快速操作工具栏  
     * @return
     */
    @JsonIgnore
    public String getQuickPSDEToolbarId(){
        Object objValue = this.get(FIELD_QUICKPSDETOOLBARID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 快速操作工具栏 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isQuickPSDEToolbarIdDirty(){
        if(this.contains(FIELD_QUICKPSDETOOLBARID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 快速操作工具栏
     */
    @JsonIgnore
    public void resetQuickPSDEToolbarId(){
        this.reset(FIELD_QUICKPSDETOOLBARID);
    }

    /**
     * 设置 快速操作工具栏，详细说明：{@link #FIELD_QUICKPSDETOOLBARID}
     * <P>
     * 等同 {@link #setQuickPSDEToolbarId}
     * @param quickPSDEToolbarId
     */
    @JsonIgnore
    public PSSysCalendarDTO quickpsdetoolbarid(String quickPSDEToolbarId){
        this.setQuickPSDEToolbarId(quickPSDEToolbarId);
        return this;
    }

    /**
     * 设置 快速操作工具栏，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setQuickPSDEToolbarId}
     * @param pSDEToolbar 引用对象
     */
    @JsonIgnore
    public PSSysCalendarDTO quickpsdetoolbarid(PSDEToolbarDTO pSDEToolbar){
        if(pSDEToolbar == null){
            this.setQuickPSDEToolbarId(null);
            this.setQuickPSDEToolbarName(null);
        }
        else{
            this.setQuickPSDEToolbarId(pSDEToolbar.getPSDEToolbarId());
            this.setQuickPSDEToolbarName(pSDEToolbar.getPSDEToolbarName());
        }
        return this;
    }

    /**
     * <B>QUICKPSDETOOLBARNAME</B>&nbsp;快速操作工具栏，指定日历部件内建的快速操作工具栏对象，快速操作工具栏一般用于新建等无选择数据的操作
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_QUICKPSDETOOLBARID}
     */
    public final static String FIELD_QUICKPSDETOOLBARNAME = "quickpsdetoolbarname";

    /**
     * 设置 快速操作工具栏，详细说明：{@link #FIELD_QUICKPSDETOOLBARNAME}
     * 
     * @param quickPSDEToolbarName
     * 
     */
    @JsonProperty(FIELD_QUICKPSDETOOLBARNAME)
    public void setQuickPSDEToolbarName(String quickPSDEToolbarName){
        this.set(FIELD_QUICKPSDETOOLBARNAME, quickPSDEToolbarName);
    }
    
    /**
     * 获取 快速操作工具栏  
     * @return
     */
    @JsonIgnore
    public String getQuickPSDEToolbarName(){
        Object objValue = this.get(FIELD_QUICKPSDETOOLBARNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 快速操作工具栏 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isQuickPSDEToolbarNameDirty(){
        if(this.contains(FIELD_QUICKPSDETOOLBARNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 快速操作工具栏
     */
    @JsonIgnore
    public void resetQuickPSDEToolbarName(){
        this.reset(FIELD_QUICKPSDETOOLBARNAME);
    }

    /**
     * 设置 快速操作工具栏，详细说明：{@link #FIELD_QUICKPSDETOOLBARNAME}
     * <P>
     * 等同 {@link #setQuickPSDEToolbarName}
     * @param quickPSDEToolbarName
     */
    @JsonIgnore
    public PSSysCalendarDTO quickpsdetoolbarname(String quickPSDEToolbarName){
        this.setQuickPSDEToolbarName(quickPSDEToolbarName);
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
    public PSSysCalendarDTO updatedate(Timestamp updateDate){
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
    public PSSysCalendarDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSSysCalendarId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysCalendarId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysCalendarId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysCalendarId(strValue);
    }

    @JsonIgnore
    public PSSysCalendarDTO id(String strValue){
        this.setPSSysCalendarId(strValue);
        return this;
    }


    /**
     *  系统日历视图项 成员集合
     */
    public final static String FIELD_PSSYSCALENDARITEMS = "pssyscalendaritems";

    private java.util.List<net.ibizsys.centralstudio.dto.PSSysCalendarItemDTO> pssyscalendaritems;

    /**
     * 获取 系统日历视图项 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSSYSCALENDARITEMS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSSysCalendarItemDTO> getPSSysCalendarItems(){
        return this.pssyscalendaritems;
    }

    /**
     * 设置 系统日历视图项 成员集合  
     * @param pssyscalendaritems
     */
    @JsonProperty(FIELD_PSSYSCALENDARITEMS)
    public void setPSSysCalendarItems(java.util.List<net.ibizsys.centralstudio.dto.PSSysCalendarItemDTO> pssyscalendaritems){
        this.pssyscalendaritems = pssyscalendaritems;
    }

    /**
     * 获取 系统日历视图项 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSSysCalendarItemDTO> getPSSysCalendarItemsIf(){
        if(this.pssyscalendaritems == null){
            this.pssyscalendaritems = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSSysCalendarItemDTO>();          
        }
        return this.pssyscalendaritems;
    }


    /**
     *  日历部件逻辑 成员集合
     */
    public final static String FIELD_PSSYSCALENDARLOGICS = "pssyscalendarlogics";

    private java.util.List<net.ibizsys.centralstudio.dto.PSSysCalendarLogicDTO> pssyscalendarlogics;

    /**
     * 获取 日历部件逻辑 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSSYSCALENDARLOGICS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSSysCalendarLogicDTO> getPSSysCalendarLogics(){
        return this.pssyscalendarlogics;
    }

    /**
     * 设置 日历部件逻辑 成员集合  
     * @param pssyscalendarlogics
     */
    @JsonProperty(FIELD_PSSYSCALENDARLOGICS)
    public void setPSSysCalendarLogics(java.util.List<net.ibizsys.centralstudio.dto.PSSysCalendarLogicDTO> pssyscalendarlogics){
        this.pssyscalendarlogics = pssyscalendarlogics;
    }

    /**
     * 获取 日历部件逻辑 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSSysCalendarLogicDTO> getPSSysCalendarLogicsIf(){
        if(this.pssyscalendarlogics == null){
            this.pssyscalendarlogics = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSSysCalendarLogicDTO>();          
        }
        return this.pssyscalendarlogics;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysCalendarDTO){
            PSSysCalendarDTO dto = (PSSysCalendarDTO)iEntity;
            dto.setPSSysCalendarItems(this.getPSSysCalendarItems());
            dto.setPSSysCalendarLogics(this.getPSSysCalendarLogics());
        }
        super.copyTo(iEntity);
    }
}
