package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSMAPVIEW</B>系统地图部件 模型传输对象
 * <P>
 * 系统地图部件模型，定义界面表现及处理逻辑，支持多个地图项同时提供地图数据源
 */
public class PSSysMapViewDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysMapViewDTO(){
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
    public PSSysMapViewDTO busyindicator(Integer busyIndicator){
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
    public PSSysMapViewDTO busyindicator(Boolean busyIndicator){
        if(busyIndicator == null){
            this.setBusyIndicator(null);
        }
        else{
            this.setBusyIndicator(busyIndicator?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定地图部件的代码标识，需要在所在的实体中具有唯一性
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
    public PSSysMapViewDTO codename(String codeName){
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
    public PSSysMapViewDTO createdate(Timestamp createDate){
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
    public PSSysMapViewDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>EMPTYTEXT</B>&nbsp;无值显示内容，指定地图部件的无值显示内容，未定义时使用前端应用配置
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
    public PSSysMapViewDTO emptytext(String emptyText){
        this.setEmptyText(emptyText);
        return this;
    }

    /**
     * <B>EMPTYTEXTPSLANRESID</B>&nbsp;无值内容语言资源，指定地图部件的无值显示内容多语言资源对象，未定义时使用前端应用配置
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
    public PSSysMapViewDTO emptytextpslanresid(String emptyTextPSLanResId){
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
    public PSSysMapViewDTO emptytextpslanresid(PSLanguageResDTO pSLanguageRes){
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
     * <B>EMPTYTEXTPSLANRESNAME</B>&nbsp;无值内容语言资源，指定地图部件的无值显示内容多语言资源对象，未定义时使用前端应用配置
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
    public PSSysMapViewDTO emptytextpslanresname(String emptyTextPSLanResName){
        this.setEmptyTextPSLanResName(emptyTextPSLanResName);
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;逻辑名称，指定地图部件的逻辑名称
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
    public PSSysMapViewDTO logicname(String logicName){
        this.setLogicName(logicName);
        return this;
    }

    /**
     * <B>MAPVIEWSTYLE</B>&nbsp;地图部件样式，指定地图部件的样式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.MapViewStyle} 
     */
    public final static String FIELD_MAPVIEWSTYLE = "mapviewstyle";

    /**
     * 设置 地图部件样式，详细说明：{@link #FIELD_MAPVIEWSTYLE}
     * 
     * @param mapViewStyle
     * 
     */
    @JsonProperty(FIELD_MAPVIEWSTYLE)
    public void setMapViewStyle(String mapViewStyle){
        this.set(FIELD_MAPVIEWSTYLE, mapViewStyle);
    }
    
    /**
     * 获取 地图部件样式  
     * @return
     */
    @JsonIgnore
    public String getMapViewStyle(){
        Object objValue = this.get(FIELD_MAPVIEWSTYLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 地图部件样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMapViewStyleDirty(){
        if(this.contains(FIELD_MAPVIEWSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 地图部件样式
     */
    @JsonIgnore
    public void resetMapViewStyle(){
        this.reset(FIELD_MAPVIEWSTYLE);
    }

    /**
     * 设置 地图部件样式，详细说明：{@link #FIELD_MAPVIEWSTYLE}
     * <P>
     * 等同 {@link #setMapViewStyle}
     * @param mapViewStyle
     */
    @JsonIgnore
    public PSSysMapViewDTO mapviewstyle(String mapViewStyle){
        this.setMapViewStyle(mapViewStyle);
        return this;
    }

     /**
     * 设置 地图部件样式，详细说明：{@link #FIELD_MAPVIEWSTYLE}
     * <P>
     * 等同 {@link #setMapViewStyle}
     * @param mapViewStyle
     */
    @JsonIgnore
    public PSSysMapViewDTO mapviewstyle(net.ibizsys.model.PSModelEnums.MapViewStyle mapViewStyle){
        if(mapViewStyle == null){
            this.setMapViewStyle(null);
        }
        else{
            this.setMapViewStyle(mapViewStyle.value);
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
    public PSSysMapViewDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSCTRLLOGICGROUPID</B>&nbsp;界面逻辑组，指定地图部件默认附加的部件逻辑组对象
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
    public PSSysMapViewDTO psctrllogicgroupid(String pSCtrlLogicGroupId){
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
    public PSSysMapViewDTO psctrllogicgroupid(PSCtrlLogicGroupDTO pSCtrlLogicGroup){
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
     * <B>PSCTRLLOGICGROUPNAME</B>&nbsp;界面逻辑组，指定地图部件默认附加的部件逻辑组对象
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
    public PSSysMapViewDTO psctrllogicgroupname(String pSCtrlLogicGroupName){
        this.setPSCtrlLogicGroupName(pSCtrlLogicGroupName);
        return this;
    }

    /**
     * <B>PSCTRLMSGID</B>&nbsp;部件消息，指定地图部件默认的部件消息对象
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
    public PSSysMapViewDTO psctrlmsgid(String pSCtrlMsgId){
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
    public PSSysMapViewDTO psctrlmsgid(PSCtrlMsgDTO pSCtrlMsg){
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
     * <B>PSCTRLMSGNAME</B>&nbsp;部件消息，指定地图部件默认的部件消息对象
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
    public PSSysMapViewDTO psctrlmsgname(String pSCtrlMsgName){
        this.setPSCtrlMsgName(pSCtrlMsgName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定地图部件所在的实体对象
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
    public PSSysMapViewDTO psdeid(String pSDEId){
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
    public PSSysMapViewDTO psdeid(PSDataEntityDTO pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;实体，指定地图部件所在的实体对象
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
    public PSSysMapViewDTO psdename(String pSDEName){
        this.setPSDEName(pSDEName);
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
    public PSSysMapViewDTO pssyscssid(String pSSysCssId){
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
    public PSSysMapViewDTO pssyscssid(PSSysCssDTO pSSysCss){
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
    public PSSysMapViewDTO pssyscssname(String pSSysCssName){
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    /**
     * <B>PSSYSMAPVIEWID</B>&nbsp;系统地图部件标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSMAPVIEWID = "pssysmapviewid";

    /**
     * 设置 系统地图部件标识
     * 
     * @param pSSysMapViewId
     * 
     */
    @JsonProperty(FIELD_PSSYSMAPVIEWID)
    public void setPSSysMapViewId(String pSSysMapViewId){
        this.set(FIELD_PSSYSMAPVIEWID, pSSysMapViewId);
    }
    
    /**
     * 获取 系统地图部件标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysMapViewId(){
        Object objValue = this.get(FIELD_PSSYSMAPVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统地图部件标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysMapViewIdDirty(){
        if(this.contains(FIELD_PSSYSMAPVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统地图部件标识
     */
    @JsonIgnore
    public void resetPSSysMapViewId(){
        this.reset(FIELD_PSSYSMAPVIEWID);
    }

    /**
     * 设置 系统地图部件标识
     * <P>
     * 等同 {@link #setPSSysMapViewId}
     * @param pSSysMapViewId
     */
    @JsonIgnore
    public PSSysMapViewDTO pssysmapviewid(String pSSysMapViewId){
        this.setPSSysMapViewId(pSSysMapViewId);
        return this;
    }

    /**
     * <B>PSSYSMAPVIEWNAME</B>&nbsp;地图部件名称，指定地图部件的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSMAPVIEWNAME = "pssysmapviewname";

    /**
     * 设置 地图部件名称，详细说明：{@link #FIELD_PSSYSMAPVIEWNAME}
     * 
     * @param pSSysMapViewName
     * 
     */
    @JsonProperty(FIELD_PSSYSMAPVIEWNAME)
    public void setPSSysMapViewName(String pSSysMapViewName){
        this.set(FIELD_PSSYSMAPVIEWNAME, pSSysMapViewName);
    }
    
    /**
     * 获取 地图部件名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysMapViewName(){
        Object objValue = this.get(FIELD_PSSYSMAPVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 地图部件名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysMapViewNameDirty(){
        if(this.contains(FIELD_PSSYSMAPVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 地图部件名称
     */
    @JsonIgnore
    public void resetPSSysMapViewName(){
        this.reset(FIELD_PSSYSMAPVIEWNAME);
    }

    /**
     * 设置 地图部件名称，详细说明：{@link #FIELD_PSSYSMAPVIEWNAME}
     * <P>
     * 等同 {@link #setPSSysMapViewName}
     * @param pSSysMapViewName
     */
    @JsonIgnore
    public PSSysMapViewDTO pssysmapviewname(String pSSysMapViewName){
        this.setPSSysMapViewName(pSSysMapViewName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysMapViewName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysMapViewName(strName);
    }

    @JsonIgnore
    public PSSysMapViewDTO name(String strName){
        this.setPSSysMapViewName(strName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端扩展插件，指定系统地图部件使用的前端模板扩展插件，使用插件类型【地图部件绘制插件】
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
    public PSSysMapViewDTO pssyspfpluginid(String pSSysPFPluginId){
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
    public PSSysMapViewDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin){
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
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端扩展插件，指定系统地图部件使用的前端模板扩展插件，使用插件类型【地图部件绘制插件】
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
    public PSSysMapViewDTO pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
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
    public PSSysMapViewDTO updatedate(Timestamp updateDate){
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
    public PSSysMapViewDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSSysMapViewId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysMapViewId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysMapViewId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysMapViewId(strValue);
    }

    @JsonIgnore
    public PSSysMapViewDTO id(String strValue){
        this.setPSSysMapViewId(strValue);
        return this;
    }


    /**
     *  系统地图数据项 成员集合
     */
    public final static String FIELD_PSSYSMAPITEM = "pssysmapitems";

    private java.util.List<net.ibizsys.centralstudio.dto.PSSysMapItemDTO> pssysmapitems;

    /**
     * 获取 系统地图数据项 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSSYSMAPITEM)
    public java.util.List<net.ibizsys.centralstudio.dto.PSSysMapItemDTO> getPSSysMapItem(){
        return this.pssysmapitems;
    }

    /**
     * 设置 系统地图数据项 成员集合  
     * @param pssysmapitems
     */
    @JsonProperty(FIELD_PSSYSMAPITEM)
    public void setPSSysMapItem(java.util.List<net.ibizsys.centralstudio.dto.PSSysMapItemDTO> pssysmapitems){
        this.pssysmapitems = pssysmapitems;
    }

    /**
     * 获取 系统地图数据项 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSSysMapItemDTO> getPSSysMapItemIf(){
        if(this.pssysmapitems == null){
            this.pssysmapitems = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSSysMapItemDTO>();          
        }
        return this.pssysmapitems;
    }


    /**
     *  地图部件逻辑 成员集合
     */
    public final static String FIELD_PSSYSMAPLOGICS = "pssysmaplogics";

    private java.util.List<net.ibizsys.centralstudio.dto.PSSysMapLogicDTO> pssysmaplogics;

    /**
     * 获取 地图部件逻辑 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSSYSMAPLOGICS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSSysMapLogicDTO> getPSSysMapLogics(){
        return this.pssysmaplogics;
    }

    /**
     * 设置 地图部件逻辑 成员集合  
     * @param pssysmaplogics
     */
    @JsonProperty(FIELD_PSSYSMAPLOGICS)
    public void setPSSysMapLogics(java.util.List<net.ibizsys.centralstudio.dto.PSSysMapLogicDTO> pssysmaplogics){
        this.pssysmaplogics = pssysmaplogics;
    }

    /**
     * 获取 地图部件逻辑 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSSysMapLogicDTO> getPSSysMapLogicsIf(){
        if(this.pssysmaplogics == null){
            this.pssysmaplogics = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSSysMapLogicDTO>();          
        }
        return this.pssysmaplogics;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysMapViewDTO){
            PSSysMapViewDTO dto = (PSSysMapViewDTO)iEntity;
            dto.setPSSysMapItem(this.getPSSysMapItem());
            dto.setPSSysMapLogics(this.getPSSysMapLogics());
        }
        super.copyTo(iEntity);
    }
}
