package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSERMAP</B>系统ER图 模型传输对象
 * <P>
 * 
 */
public class PSSysERMapDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysERMapDTO(){
    }      

    /**
     * <B>ALLENTITYFLAG</B>&nbsp;全部实体
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ALLENTITYFLAG = "allentityflag";

    /**
     * 设置 全部实体
     * 
     * @param allEntityFlag
     * 
     */
    @JsonProperty(FIELD_ALLENTITYFLAG)
    public void setAllEntityFlag(Integer allEntityFlag){
        this.set(FIELD_ALLENTITYFLAG, allEntityFlag);
    }
    
    /**
     * 获取 全部实体  
     * @return
     */
    @JsonIgnore
    public Integer getAllEntityFlag(){
        Object objValue = this.get(FIELD_ALLENTITYFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 全部实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAllEntityFlagDirty(){
        if(this.contains(FIELD_ALLENTITYFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 全部实体
     */
    @JsonIgnore
    public void resetAllEntityFlag(){
        this.reset(FIELD_ALLENTITYFLAG);
    }

    /**
     * 设置 全部实体
     * <P>
     * 等同 {@link #setAllEntityFlag}
     * @param allEntityFlag
     */
    @JsonIgnore
    public PSSysERMapDTO allentityflag(Integer allEntityFlag){
        this.setAllEntityFlag(allEntityFlag);
        return this;
    }

     /**
     * 设置 全部实体
     * <P>
     * 等同 {@link #setAllEntityFlag}
     * @param allEntityFlag
     */
    @JsonIgnore
    public PSSysERMapDTO allentityflag(Boolean allEntityFlag){
        if(allEntityFlag == null){
            this.setAllEntityFlag(null);
        }
        else{
            this.setAllEntityFlag(allEntityFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定ER图的代码标识，需要在所在的模型域（系统模块或系统）中具有唯一性
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
    public PSSysERMapDTO codename(String codeName){
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
    public PSSysERMapDTO createdate(Timestamp createDate){
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
    public PSSysERMapDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DEFVIEWMODE</B>&nbsp;默认显示视图
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.ERMapViewMode} 
     */
    public final static String FIELD_DEFVIEWMODE = "defviewmode";

    /**
     * 设置 默认显示视图
     * 
     * @param defViewMode
     * 
     */
    @JsonProperty(FIELD_DEFVIEWMODE)
    public void setDefViewMode(String defViewMode){
        this.set(FIELD_DEFVIEWMODE, defViewMode);
    }
    
    /**
     * 获取 默认显示视图  
     * @return
     */
    @JsonIgnore
    public String getDefViewMode(){
        Object objValue = this.get(FIELD_DEFVIEWMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认显示视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefViewModeDirty(){
        if(this.contains(FIELD_DEFVIEWMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认显示视图
     */
    @JsonIgnore
    public void resetDefViewMode(){
        this.reset(FIELD_DEFVIEWMODE);
    }

    /**
     * 设置 默认显示视图
     * <P>
     * 等同 {@link #setDefViewMode}
     * @param defViewMode
     */
    @JsonIgnore
    public PSSysERMapDTO defviewmode(String defViewMode){
        this.setDefViewMode(defViewMode);
        return this;
    }

     /**
     * 设置 默认显示视图
     * <P>
     * 等同 {@link #setDefViewMode}
     * @param defViewMode
     */
    @JsonIgnore
    public PSSysERMapDTO defviewmode(net.ibizsys.model.PSModelEnums.ERMapViewMode defViewMode){
        if(defViewMode == null){
            this.setDefViewMode(null);
        }
        else{
            this.setDefViewMode(defViewMode.value);
        }
        return this;
    }

    /**
     * <B>INCSUBSYSFLAG</B>&nbsp;包括子系统
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_INCSUBSYSFLAG = "incsubsysflag";

    /**
     * 设置 包括子系统
     * 
     * @param incSubSysFlag
     * 
     */
    @JsonProperty(FIELD_INCSUBSYSFLAG)
    public void setIncSubSysFlag(Integer incSubSysFlag){
        this.set(FIELD_INCSUBSYSFLAG, incSubSysFlag);
    }
    
    /**
     * 获取 包括子系统  
     * @return
     */
    @JsonIgnore
    public Integer getIncSubSysFlag(){
        Object objValue = this.get(FIELD_INCSUBSYSFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 包括子系统 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIncSubSysFlagDirty(){
        if(this.contains(FIELD_INCSUBSYSFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 包括子系统
     */
    @JsonIgnore
    public void resetIncSubSysFlag(){
        this.reset(FIELD_INCSUBSYSFLAG);
    }

    /**
     * 设置 包括子系统
     * <P>
     * 等同 {@link #setIncSubSysFlag}
     * @param incSubSysFlag
     */
    @JsonIgnore
    public PSSysERMapDTO incsubsysflag(Integer incSubSysFlag){
        this.setIncSubSysFlag(incSubSysFlag);
        return this;
    }

     /**
     * 设置 包括子系统
     * <P>
     * 等同 {@link #setIncSubSysFlag}
     * @param incSubSysFlag
     */
    @JsonIgnore
    public PSSysERMapDTO incsubsysflag(Boolean incSubSysFlag){
        if(incSubSysFlag == null){
            this.setIncSubSysFlag(null);
        }
        else{
            this.setIncSubSysFlag(incSubSysFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>MAPTAG</B>&nbsp;图例标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_MAPTAG = "maptag";

    /**
     * 设置 图例标记
     * 
     * @param mapTag
     * 
     */
    @JsonProperty(FIELD_MAPTAG)
    public void setMapTag(String mapTag){
        this.set(FIELD_MAPTAG, mapTag);
    }
    
    /**
     * 获取 图例标记  
     * @return
     */
    @JsonIgnore
    public String getMapTag(){
        Object objValue = this.get(FIELD_MAPTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 图例标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMapTagDirty(){
        if(this.contains(FIELD_MAPTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图例标记
     */
    @JsonIgnore
    public void resetMapTag(){
        this.reset(FIELD_MAPTAG);
    }

    /**
     * 设置 图例标记
     * <P>
     * 等同 {@link #setMapTag}
     * @param mapTag
     */
    @JsonIgnore
    public PSSysERMapDTO maptag(String mapTag){
        this.setMapTag(mapTag);
        return this;
    }

    /**
     * <B>MAPTAG2</B>&nbsp;图例标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_MAPTAG2 = "maptag2";

    /**
     * 设置 图例标记2
     * 
     * @param mapTag2
     * 
     */
    @JsonProperty(FIELD_MAPTAG2)
    public void setMapTag2(String mapTag2){
        this.set(FIELD_MAPTAG2, mapTag2);
    }
    
    /**
     * 获取 图例标记2  
     * @return
     */
    @JsonIgnore
    public String getMapTag2(){
        Object objValue = this.get(FIELD_MAPTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 图例标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMapTag2Dirty(){
        if(this.contains(FIELD_MAPTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图例标记2
     */
    @JsonIgnore
    public void resetMapTag2(){
        this.reset(FIELD_MAPTAG2);
    }

    /**
     * 设置 图例标记2
     * <P>
     * 等同 {@link #setMapTag2}
     * @param mapTag2
     */
    @JsonIgnore
    public PSSysERMapDTO maptag2(String mapTag2){
        this.setMapTag2(mapTag2);
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
    public PSSysERMapDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定系统ER图所在的系统模块
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
    public PSSysERMapDTO psmoduleid(String pSModuleId){
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
    public PSSysERMapDTO psmoduleid(PSModuleDTO pSModule){
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
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定系统ER图所在的系统模块
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
    public PSSysERMapDTO psmodulename(String pSModuleName){
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
    public PSSysERMapDTO pssysappname(String pSSysAppName){
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    /**
     * <B>PSSYSERMAPID</B>&nbsp;系统ER图标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSERMAPID = "pssysermapid";

    /**
     * 设置 系统ER图标识
     * 
     * @param pSSysERMapId
     * 
     */
    @JsonProperty(FIELD_PSSYSERMAPID)
    public void setPSSysERMapId(String pSSysERMapId){
        this.set(FIELD_PSSYSERMAPID, pSSysERMapId);
    }
    
    /**
     * 获取 系统ER图标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysERMapId(){
        Object objValue = this.get(FIELD_PSSYSERMAPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统ER图标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysERMapIdDirty(){
        if(this.contains(FIELD_PSSYSERMAPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统ER图标识
     */
    @JsonIgnore
    public void resetPSSysERMapId(){
        this.reset(FIELD_PSSYSERMAPID);
    }

    /**
     * 设置 系统ER图标识
     * <P>
     * 等同 {@link #setPSSysERMapId}
     * @param pSSysERMapId
     */
    @JsonIgnore
    public PSSysERMapDTO pssysermapid(String pSSysERMapId){
        this.setPSSysERMapId(pSSysERMapId);
        return this;
    }

    /**
     * <B>PSSYSERMAPNAME</B>&nbsp;系统ER图名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSERMAPNAME = "pssysermapname";

    /**
     * 设置 系统ER图名称
     * 
     * @param pSSysERMapName
     * 
     */
    @JsonProperty(FIELD_PSSYSERMAPNAME)
    public void setPSSysERMapName(String pSSysERMapName){
        this.set(FIELD_PSSYSERMAPNAME, pSSysERMapName);
    }
    
    /**
     * 获取 系统ER图名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysERMapName(){
        Object objValue = this.get(FIELD_PSSYSERMAPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统ER图名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysERMapNameDirty(){
        if(this.contains(FIELD_PSSYSERMAPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统ER图名称
     */
    @JsonIgnore
    public void resetPSSysERMapName(){
        this.reset(FIELD_PSSYSERMAPNAME);
    }

    /**
     * 设置 系统ER图名称
     * <P>
     * 等同 {@link #setPSSysERMapName}
     * @param pSSysERMapName
     */
    @JsonIgnore
    public PSSysERMapDTO pssysermapname(String pSSysERMapName){
        this.setPSSysERMapName(pSSysERMapName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysERMapName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysERMapName(strName);
    }

    @JsonIgnore
    public PSSysERMapDTO name(String strName){
        this.setPSSysERMapName(strName);
        return this;
    }

    /**
     * <B>SHAPEPARAMS</B>&nbsp;形状参数
     */
    public final static String FIELD_SHAPEPARAMS = "shapeparams";

    /**
     * 设置 形状参数
     * 
     * @param shapeParams
     * 
     */
    @JsonProperty(FIELD_SHAPEPARAMS)
    public void setShapeParams(String shapeParams){
        this.set(FIELD_SHAPEPARAMS, shapeParams);
    }
    
    /**
     * 获取 形状参数  
     * @return
     */
    @JsonIgnore
    public String getShapeParams(){
        Object objValue = this.get(FIELD_SHAPEPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 形状参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isShapeParamsDirty(){
        if(this.contains(FIELD_SHAPEPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 形状参数
     */
    @JsonIgnore
    public void resetShapeParams(){
        this.reset(FIELD_SHAPEPARAMS);
    }

    /**
     * 设置 形状参数
     * <P>
     * 等同 {@link #setShapeParams}
     * @param shapeParams
     */
    @JsonIgnore
    public PSSysERMapDTO shapeparams(String shapeParams){
        this.setShapeParams(shapeParams);
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
    public PSSysERMapDTO updatedate(Timestamp updateDate){
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
    public PSSysERMapDTO updateman(String updateMan){
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
    public PSSysERMapDTO usercat(String userCat){
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
    public PSSysERMapDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSSysERMapDTO usertag(String userTag){
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
    public PSSysERMapDTO usertag2(String userTag2){
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
    public PSSysERMapDTO usertag3(String userTag3){
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
    public PSSysERMapDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSSysERMapId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysERMapId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysERMapId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysERMapId(strValue);
    }

    @JsonIgnore
    public PSSysERMapDTO id(String strValue){
        this.setPSSysERMapId(strValue);
        return this;
    }


    /**
     *  系统ER图节点 成员集合
     */
    public final static String FIELD_PSSYSERMAPNODES = "pssysermapnodes";

    private java.util.List<net.ibizsys.centralstudio.dto.PSSysERMapNodeDTO> pssysermapnodes;

    /**
     * 获取 系统ER图节点 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSSYSERMAPNODES)
    public java.util.List<net.ibizsys.centralstudio.dto.PSSysERMapNodeDTO> getPSSysERMapNodes(){
        return this.pssysermapnodes;
    }

    /**
     * 设置 系统ER图节点 成员集合  
     * @param pssysermapnodes
     */
    @JsonProperty(FIELD_PSSYSERMAPNODES)
    public void setPSSysERMapNodes(java.util.List<net.ibizsys.centralstudio.dto.PSSysERMapNodeDTO> pssysermapnodes){
        this.pssysermapnodes = pssysermapnodes;
    }

    /**
     * 获取 系统ER图节点 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSSysERMapNodeDTO> getPSSysERMapNodesIf(){
        if(this.pssysermapnodes == null){
            this.pssysermapnodes = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSSysERMapNodeDTO>();          
        }
        return this.pssysermapnodes;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysERMapDTO){
            PSSysERMapDTO dto = (PSSysERMapDTO)iEntity;
            dto.setPSSysERMapNodes(this.getPSSysERMapNodes());
        }
        super.copyTo(iEntity);
    }
}
