package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDELIST</B>实体列表 模型传输对象
 * <P>
 * 实体数据列表部件模型，定义容器、列表项及分组项的界面逻辑及数据项等处理逻辑，一般需要指定列表项的布局面板。数据列表支持定义显示内容项，表现上类似数据表格。数据列表还作为移动端的通用多数据部件模型，支持定义左滑、右滑界面行为组等移动端特征逻辑
 */
public class PSDEListDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSDEListDTO(){
    }      

    /**
     * <B>ADPSDELOGICID</B>&nbsp;查询转换逻辑，指定实体列表部件使用数据集的查询上下文转换逻辑，将调用环境参数转换为数据集的调用参数
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDELogicDTO} 
     */
    public final static String FIELD_ADPSDELOGICID = "adpsdelogicid";

    /**
     * 设置 查询转换逻辑，详细说明：{@link #FIELD_ADPSDELOGICID}
     * 
     * @param aDPSDELogicId
     * 
     */
    @JsonProperty(FIELD_ADPSDELOGICID)
    public void setADPSDELogicId(String aDPSDELogicId){
        this.set(FIELD_ADPSDELOGICID, aDPSDELogicId);
    }
    
    /**
     * 获取 查询转换逻辑  
     * @return
     */
    @JsonIgnore
    public String getADPSDELogicId(){
        Object objValue = this.get(FIELD_ADPSDELOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 查询转换逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isADPSDELogicIdDirty(){
        if(this.contains(FIELD_ADPSDELOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 查询转换逻辑
     */
    @JsonIgnore
    public void resetADPSDELogicId(){
        this.reset(FIELD_ADPSDELOGICID);
    }

    /**
     * 设置 查询转换逻辑，详细说明：{@link #FIELD_ADPSDELOGICID}
     * <P>
     * 等同 {@link #setADPSDELogicId}
     * @param aDPSDELogicId
     */
    @JsonIgnore
    public PSDEListDTO adpsdelogicid(String aDPSDELogicId){
        this.setADPSDELogicId(aDPSDELogicId);
        return this;
    }

    /**
     * 设置 查询转换逻辑，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setADPSDELogicId}
     * @param pSDELogic 引用对象
     */
    @JsonIgnore
    public PSDEListDTO adpsdelogicid(PSDELogicDTO pSDELogic){
        if(pSDELogic == null){
            this.setADPSDELogicId(null);
            this.setADPSDELogicName(null);
        }
        else{
            this.setADPSDELogicId(pSDELogic.getPSDELogicId());
            this.setADPSDELogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    /**
     * <B>ADPSDELOGICNAME</B>&nbsp;查询转换逻辑，指定实体列表部件使用数据集的查询上下文转换逻辑，将调用环境参数转换为数据集的调用参数
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ADPSDELOGICID}
     */
    public final static String FIELD_ADPSDELOGICNAME = "adpsdelogicname";

    /**
     * 设置 查询转换逻辑，详细说明：{@link #FIELD_ADPSDELOGICNAME}
     * 
     * @param aDPSDELogicName
     * 
     */
    @JsonProperty(FIELD_ADPSDELOGICNAME)
    public void setADPSDELogicName(String aDPSDELogicName){
        this.set(FIELD_ADPSDELOGICNAME, aDPSDELogicName);
    }
    
    /**
     * 获取 查询转换逻辑  
     * @return
     */
    @JsonIgnore
    public String getADPSDELogicName(){
        Object objValue = this.get(FIELD_ADPSDELOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 查询转换逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isADPSDELogicNameDirty(){
        if(this.contains(FIELD_ADPSDELOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 查询转换逻辑
     */
    @JsonIgnore
    public void resetADPSDELogicName(){
        this.reset(FIELD_ADPSDELOGICNAME);
    }

    /**
     * 设置 查询转换逻辑，详细说明：{@link #FIELD_ADPSDELOGICNAME}
     * <P>
     * 等同 {@link #setADPSDELogicName}
     * @param aDPSDELogicName
     */
    @JsonIgnore
    public PSDEListDTO adpsdelogicname(String aDPSDELogicName){
        this.setADPSDELogicName(aDPSDELogicName);
        return this;
    }

    /**
     * <B>APPENDDEITEMS</B>&nbsp;附加实体默认数据项，指定列表部件是否自动附加实体默认数据项，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_APPENDDEITEMS = "appenddeitems";

    /**
     * 设置 附加实体默认数据项，详细说明：{@link #FIELD_APPENDDEITEMS}
     * 
     * @param appendDEItems
     * 
     */
    @JsonProperty(FIELD_APPENDDEITEMS)
    public void setAppendDEItems(Integer appendDEItems){
        this.set(FIELD_APPENDDEITEMS, appendDEItems);
    }
    
    /**
     * 获取 附加实体默认数据项  
     * @return
     */
    @JsonIgnore
    public Integer getAppendDEItems(){
        Object objValue = this.get(FIELD_APPENDDEITEMS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 附加实体默认数据项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAppendDEItemsDirty(){
        if(this.contains(FIELD_APPENDDEITEMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 附加实体默认数据项
     */
    @JsonIgnore
    public void resetAppendDEItems(){
        this.reset(FIELD_APPENDDEITEMS);
    }

    /**
     * 设置 附加实体默认数据项，详细说明：{@link #FIELD_APPENDDEITEMS}
     * <P>
     * 等同 {@link #setAppendDEItems}
     * @param appendDEItems
     */
    @JsonIgnore
    public PSDEListDTO appenddeitems(Integer appendDEItems){
        this.setAppendDEItems(appendDEItems);
        return this;
    }

     /**
     * 设置 附加实体默认数据项，详细说明：{@link #FIELD_APPENDDEITEMS}
     * <P>
     * 等同 {@link #setAppendDEItems}
     * @param appendDEItems
     */
    @JsonIgnore
    public PSDEListDTO appenddeitems(Boolean appendDEItems){
        if(appendDEItems == null){
            this.setAppendDEItems(null);
        }
        else{
            this.setAppendDEItems(appendDEItems?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>BATPSDETOOLBARID</B>&nbsp;批操作工具栏，指定数据列表部件内建的批操作工具栏对象，批操作工具栏为选择数据提供操作能力
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
    public PSDEListDTO batpsdetoolbarid(String batPSDEToolbarId){
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
    public PSDEListDTO batpsdetoolbarid(PSDEToolbarDTO pSDEToolbar){
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
     * <B>BATPSDETOOLBARNAME</B>&nbsp;批操作工具栏，指定数据列表部件内建的批操作工具栏对象，批操作工具栏为选择数据提供操作能力
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
    public PSDEListDTO batpsdetoolbarname(String batPSDEToolbarName){
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
    public PSDEListDTO busyindicator(Integer busyIndicator){
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
    public PSDEListDTO busyindicator(Boolean busyIndicator){
        if(busyIndicator == null){
            this.setBusyIndicator(null);
        }
        else{
            this.setBusyIndicator(busyIndicator?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定列表的代码标识，需要在所在的实体中具有唯一性
     * <P>
     * 字符串：最大长度 100，由字母、数字、下划线组成，且开始必须为字母
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
    public PSDEListDTO codename(String codeName){
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
    public PSDEListDTO createdate(Timestamp createDate){
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
    public PSDEListDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CUSTOMCOND</B>&nbsp;自定义条件
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_CUSTOMCOND = "customcond";

    /**
     * 设置 自定义条件
     * 
     * @param customCond
     * 
     */
    @JsonProperty(FIELD_CUSTOMCOND)
    public void setCustomCond(String customCond){
        this.set(FIELD_CUSTOMCOND, customCond);
    }
    
    /**
     * 获取 自定义条件  
     * @return
     */
    @JsonIgnore
    public String getCustomCond(){
        Object objValue = this.get(FIELD_CUSTOMCOND);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义条件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomCondDirty(){
        if(this.contains(FIELD_CUSTOMCOND)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义条件
     */
    @JsonIgnore
    public void resetCustomCond(){
        this.reset(FIELD_CUSTOMCOND);
    }

    /**
     * 设置 自定义条件
     * <P>
     * 等同 {@link #setCustomCond}
     * @param customCond
     */
    @JsonIgnore
    public PSDEListDTO customcond(String customCond){
        this.setCustomCond(customCond);
        return this;
    }

    /**
     * <B>EMPTYTEXT</B>&nbsp;无值显示内容，指定数据列表部件的无值显示内容，未定义时使用前端应用配置
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
    public PSDEListDTO emptytext(String emptyText){
        this.setEmptyText(emptyText);
        return this;
    }

    /**
     * <B>EMPTYTEXTPSLANRESID</B>&nbsp;无值内容语言资源，指定数据列表部件的无值显示内容多语言资源对象，未定义时使用前端应用配置
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
    public PSDEListDTO emptytextpslanresid(String emptyTextPSLanResId){
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
    public PSDEListDTO emptytextpslanresid(PSLanguageResDTO pSLanguageRes){
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
     * <B>EMPTYTEXTPSLANRESNAME</B>&nbsp;无值内容语言资源，指定数据列表部件的无值显示内容多语言资源对象，未定义时使用前端应用配置
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
    public PSDEListDTO emptytextpslanresname(String emptyTextPSLanResName){
        this.setEmptyTextPSLanResName(emptyTextPSLanResName);
        return this;
    }

    /**
     * <B>ENABLEEDIT</B>&nbsp;即时编辑模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.MDCtrlEditMode} 
     */
    public final static String FIELD_ENABLEEDIT = "enableedit";

    /**
     * 设置 即时编辑模式
     * 
     * @param enableEdit
     * 
     */
    @JsonProperty(FIELD_ENABLEEDIT)
    public void setEnableEdit(Integer enableEdit){
        this.set(FIELD_ENABLEEDIT, enableEdit);
    }
    
    /**
     * 获取 即时编辑模式  
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
     * 判断 即时编辑模式 是否指定值，包括空值
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
     * 重置 即时编辑模式
     */
    @JsonIgnore
    public void resetEnableEdit(){
        this.reset(FIELD_ENABLEEDIT);
    }

    /**
     * 设置 即时编辑模式
     * <P>
     * 等同 {@link #setEnableEdit}
     * @param enableEdit
     */
    @JsonIgnore
    public PSDEListDTO enableedit(Integer enableEdit){
        this.setEnableEdit(enableEdit);
        return this;
    }

     /**
     * 设置 即时编辑模式
     * <P>
     * 等同 {@link #setEnableEdit}
     * @param enableEdit
     */
    @JsonIgnore
    public PSDEListDTO enableedit(net.ibizsys.model.PSModelEnums.MDCtrlEditMode[] enableEdit){
        if(enableEdit == null || enableEdit.length == 0){
            this.setEnableEdit(null);
        }
        else{
            int _value = 0;
            for(net.ibizsys.model.PSModelEnums.MDCtrlEditMode _item : enableEdit){
                _value |= _item.value;
            }
            this.setEnableEdit(_value);
        }
        return this;
    }

    /**
     * <B>ENABLEITEMPRIV</B>&nbsp;启用项权限控制
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEITEMPRIV = "enableitempriv";

    /**
     * 设置 启用项权限控制
     * 
     * @param enableItemPriv
     * 
     */
    @JsonProperty(FIELD_ENABLEITEMPRIV)
    public void setEnableItemPriv(Integer enableItemPriv){
        this.set(FIELD_ENABLEITEMPRIV, enableItemPriv);
    }
    
    /**
     * 获取 启用项权限控制  
     * @return
     */
    @JsonIgnore
    public Integer getEnableItemPriv(){
        Object objValue = this.get(FIELD_ENABLEITEMPRIV);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用项权限控制 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableItemPrivDirty(){
        if(this.contains(FIELD_ENABLEITEMPRIV)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用项权限控制
     */
    @JsonIgnore
    public void resetEnableItemPriv(){
        this.reset(FIELD_ENABLEITEMPRIV);
    }

    /**
     * 设置 启用项权限控制
     * <P>
     * 等同 {@link #setEnableItemPriv}
     * @param enableItemPriv
     */
    @JsonIgnore
    public PSDEListDTO enableitempriv(Integer enableItemPriv){
        this.setEnableItemPriv(enableItemPriv);
        return this;
    }

     /**
     * 设置 启用项权限控制
     * <P>
     * 等同 {@link #setEnableItemPriv}
     * @param enableItemPriv
     */
    @JsonIgnore
    public PSDEListDTO enableitempriv(Boolean enableItemPriv){
        if(enableItemPriv == null){
            this.setEnableItemPriv(null);
        }
        else{
            this.setEnableItemPriv(enableItemPriv?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEPAGINGBAR</B>&nbsp;启用分页工具栏
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEPAGINGBAR = "enablepagingbar";

    /**
     * 设置 启用分页工具栏
     * 
     * @param enablePagingBar
     * 
     */
    @JsonProperty(FIELD_ENABLEPAGINGBAR)
    public void setEnablePagingBar(Integer enablePagingBar){
        this.set(FIELD_ENABLEPAGINGBAR, enablePagingBar);
    }
    
    /**
     * 获取 启用分页工具栏  
     * @return
     */
    @JsonIgnore
    public Integer getEnablePagingBar(){
        Object objValue = this.get(FIELD_ENABLEPAGINGBAR);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用分页工具栏 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnablePagingBarDirty(){
        if(this.contains(FIELD_ENABLEPAGINGBAR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用分页工具栏
     */
    @JsonIgnore
    public void resetEnablePagingBar(){
        this.reset(FIELD_ENABLEPAGINGBAR);
    }

    /**
     * 设置 启用分页工具栏
     * <P>
     * 等同 {@link #setEnablePagingBar}
     * @param enablePagingBar
     */
    @JsonIgnore
    public PSDEListDTO enablepagingbar(Integer enablePagingBar){
        this.setEnablePagingBar(enablePagingBar);
        return this;
    }

     /**
     * 设置 启用分页工具栏
     * <P>
     * 等同 {@link #setEnablePagingBar}
     * @param enablePagingBar
     */
    @JsonIgnore
    public PSDEListDTO enablepagingbar(Boolean enablePagingBar){
        if(enablePagingBar == null){
            this.setEnablePagingBar(null);
        }
        else{
            this.setEnablePagingBar(enablePagingBar?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>GROUPBARCLOSEMODE</B>&nbsp;分组栏关闭模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.GroupTitleBarCloseMode} 
     */
    public final static String FIELD_GROUPBARCLOSEMODE = "groupbarclosemode";

    /**
     * 设置 分组栏关闭模式
     * 
     * @param groupBarCloseMode
     * 
     */
    @JsonProperty(FIELD_GROUPBARCLOSEMODE)
    public void setGroupBarCloseMode(Integer groupBarCloseMode){
        this.set(FIELD_GROUPBARCLOSEMODE, groupBarCloseMode);
    }
    
    /**
     * 获取 分组栏关闭模式  
     * @return
     */
    @JsonIgnore
    public Integer getGroupBarCloseMode(){
        Object objValue = this.get(FIELD_GROUPBARCLOSEMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 分组栏关闭模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupBarCloseModeDirty(){
        if(this.contains(FIELD_GROUPBARCLOSEMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组栏关闭模式
     */
    @JsonIgnore
    public void resetGroupBarCloseMode(){
        this.reset(FIELD_GROUPBARCLOSEMODE);
    }

    /**
     * 设置 分组栏关闭模式
     * <P>
     * 等同 {@link #setGroupBarCloseMode}
     * @param groupBarCloseMode
     */
    @JsonIgnore
    public PSDEListDTO groupbarclosemode(Integer groupBarCloseMode){
        this.setGroupBarCloseMode(groupBarCloseMode);
        return this;
    }

     /**
     * 设置 分组栏关闭模式
     * <P>
     * 等同 {@link #setGroupBarCloseMode}
     * @param groupBarCloseMode
     */
    @JsonIgnore
    public PSDEListDTO groupbarclosemode(net.ibizsys.model.PSModelEnums.GroupTitleBarCloseMode groupBarCloseMode){
        if(groupBarCloseMode == null){
            this.setGroupBarCloseMode(null);
        }
        else{
            this.setGroupBarCloseMode(groupBarCloseMode.value);
        }
        return this;
    }

    /**
     * <B>GROUPMODE</B>&nbsp;分组模式，指定数据列表的分组模式，未定义时为【无分组】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.MDCtrlGroupMode} 
     */
    public final static String FIELD_GROUPMODE = "groupmode";

    /**
     * 设置 分组模式，详细说明：{@link #FIELD_GROUPMODE}
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
     * 设置 分组模式，详细说明：{@link #FIELD_GROUPMODE}
     * <P>
     * 等同 {@link #setGroupMode}
     * @param groupMode
     */
    @JsonIgnore
    public PSDEListDTO groupmode(String groupMode){
        this.setGroupMode(groupMode);
        return this;
    }

     /**
     * 设置 分组模式，详细说明：{@link #FIELD_GROUPMODE}
     * <P>
     * 等同 {@link #setGroupMode}
     * @param groupMode
     */
    @JsonIgnore
    public PSDEListDTO groupmode(net.ibizsys.model.PSModelEnums.MDCtrlGroupMode groupMode){
        if(groupMode == null){
            this.setGroupMode(null);
        }
        else{
            this.setGroupMode(groupMode.value);
        }
        return this;
    }

    /**
     * <B>GROUPPSCODELISTID</B>&nbsp;分组代码表，指定数据列表部件的分组代码表，未定义时使用分组属性默认的代码表对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSCodeListDTO} 
     */
    public final static String FIELD_GROUPPSCODELISTID = "grouppscodelistid";

    /**
     * 设置 分组代码表，详细说明：{@link #FIELD_GROUPPSCODELISTID}
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
     * 设置 分组代码表，详细说明：{@link #FIELD_GROUPPSCODELISTID}
     * <P>
     * 等同 {@link #setGroupPSCodeListId}
     * @param groupPSCodeListId
     */
    @JsonIgnore
    public PSDEListDTO grouppscodelistid(String groupPSCodeListId){
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
    public PSDEListDTO grouppscodelistid(PSCodeListDTO pSCodeList){
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
     * <B>GROUPPSCODELISTNAME</B>&nbsp;分组代码表，指定数据列表部件的分组代码表，未定义时使用分组属性默认的代码表对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GROUPPSCODELISTID}
     */
    public final static String FIELD_GROUPPSCODELISTNAME = "grouppscodelistname";

    /**
     * 设置 分组代码表，详细说明：{@link #FIELD_GROUPPSCODELISTNAME}
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
     * 设置 分组代码表，详细说明：{@link #FIELD_GROUPPSCODELISTNAME}
     * <P>
     * 等同 {@link #setGroupPSCodeListName}
     * @param groupPSCodeListName
     */
    @JsonIgnore
    public PSDEListDTO grouppscodelistname(String groupPSCodeListName){
        this.setGroupPSCodeListName(groupPSCodeListName);
        return this;
    }

    /**
     * <B>GROUPPSDEFID</B>&nbsp;分组属性，数据列表部件启用数据分组功能时指定分组的属性对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_GROUPPSDEFID = "grouppsdefid";

    /**
     * 设置 分组属性，详细说明：{@link #FIELD_GROUPPSDEFID}
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
     * 设置 分组属性，详细说明：{@link #FIELD_GROUPPSDEFID}
     * <P>
     * 等同 {@link #setGroupPSDEFId}
     * @param groupPSDEFId
     */
    @JsonIgnore
    public PSDEListDTO grouppsdefid(String groupPSDEFId){
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
    public PSDEListDTO grouppsdefid(PSDEFieldDTO pSDEField){
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
     * <B>GROUPPSDEFNAME</B>&nbsp;分组属性，数据列表部件启用数据分组功能时指定分组的属性对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GROUPPSDEFID}
     */
    public final static String FIELD_GROUPPSDEFNAME = "grouppsdefname";

    /**
     * 设置 分组属性，详细说明：{@link #FIELD_GROUPPSDEFNAME}
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
     * 设置 分组属性，详细说明：{@link #FIELD_GROUPPSDEFNAME}
     * <P>
     * 等同 {@link #setGroupPSDEFName}
     * @param groupPSDEFName
     */
    @JsonIgnore
    public PSDEListDTO grouppsdefname(String groupPSDEFName){
        this.setGroupPSDEFName(groupPSDEFName);
        return this;
    }

    /**
     * <B>GROUPPSDEUAGROUPID</B>&nbsp;分组界面行为组，指定数据分组项的界面行为组对象，为分组数据提供功能操作入口
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEUAGroupDTO} 
     */
    public final static String FIELD_GROUPPSDEUAGROUPID = "grouppsdeuagroupid";

    /**
     * 设置 分组界面行为组，详细说明：{@link #FIELD_GROUPPSDEUAGROUPID}
     * 
     * @param groupPSDEUAGroupId
     * 
     */
    @JsonProperty(FIELD_GROUPPSDEUAGROUPID)
    public void setGroupPSDEUAGroupId(String groupPSDEUAGroupId){
        this.set(FIELD_GROUPPSDEUAGROUPID, groupPSDEUAGroupId);
    }
    
    /**
     * 获取 分组界面行为组  
     * @return
     */
    @JsonIgnore
    public String getGroupPSDEUAGroupId(){
        Object objValue = this.get(FIELD_GROUPPSDEUAGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组界面行为组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSDEUAGroupIdDirty(){
        if(this.contains(FIELD_GROUPPSDEUAGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组界面行为组
     */
    @JsonIgnore
    public void resetGroupPSDEUAGroupId(){
        this.reset(FIELD_GROUPPSDEUAGROUPID);
    }

    /**
     * 设置 分组界面行为组，详细说明：{@link #FIELD_GROUPPSDEUAGROUPID}
     * <P>
     * 等同 {@link #setGroupPSDEUAGroupId}
     * @param groupPSDEUAGroupId
     */
    @JsonIgnore
    public PSDEListDTO grouppsdeuagroupid(String groupPSDEUAGroupId){
        this.setGroupPSDEUAGroupId(groupPSDEUAGroupId);
        return this;
    }

    /**
     * 设置 分组界面行为组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setGroupPSDEUAGroupId}
     * @param pSDEUAGroup 引用对象
     */
    @JsonIgnore
    public PSDEListDTO grouppsdeuagroupid(PSDEUAGroupDTO pSDEUAGroup){
        if(pSDEUAGroup == null){
            this.setGroupPSDEUAGroupId(null);
            this.setGroupPSDEUAGroupName(null);
        }
        else{
            this.setGroupPSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setGroupPSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    /**
     * <B>GROUPPSDEUAGROUPNAME</B>&nbsp;分组界面行为组，指定数据分组项的界面行为组对象，为分组数据提供功能操作入口
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GROUPPSDEUAGROUPID}
     */
    public final static String FIELD_GROUPPSDEUAGROUPNAME = "grouppsdeuagroupname";

    /**
     * 设置 分组界面行为组，详细说明：{@link #FIELD_GROUPPSDEUAGROUPNAME}
     * 
     * @param groupPSDEUAGroupName
     * 
     */
    @JsonProperty(FIELD_GROUPPSDEUAGROUPNAME)
    public void setGroupPSDEUAGroupName(String groupPSDEUAGroupName){
        this.set(FIELD_GROUPPSDEUAGROUPNAME, groupPSDEUAGroupName);
    }
    
    /**
     * 获取 分组界面行为组  
     * @return
     */
    @JsonIgnore
    public String getGroupPSDEUAGroupName(){
        Object objValue = this.get(FIELD_GROUPPSDEUAGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组界面行为组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSDEUAGroupNameDirty(){
        if(this.contains(FIELD_GROUPPSDEUAGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组界面行为组
     */
    @JsonIgnore
    public void resetGroupPSDEUAGroupName(){
        this.reset(FIELD_GROUPPSDEUAGROUPNAME);
    }

    /**
     * 设置 分组界面行为组，详细说明：{@link #FIELD_GROUPPSDEUAGROUPNAME}
     * <P>
     * 等同 {@link #setGroupPSDEUAGroupName}
     * @param groupPSDEUAGroupName
     */
    @JsonIgnore
    public PSDEListDTO grouppsdeuagroupname(String groupPSDEUAGroupName){
        this.setGroupPSDEUAGroupName(groupPSDEUAGroupName);
        return this;
    }

    /**
     * <B>GROUPPSSYSCSSID</B>&nbsp;分组样式表，指定数据分组项的界面样式表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysCssDTO} 
     */
    public final static String FIELD_GROUPPSSYSCSSID = "grouppssyscssid";

    /**
     * 设置 分组样式表，详细说明：{@link #FIELD_GROUPPSSYSCSSID}
     * 
     * @param groupPSSysCssId
     * 
     */
    @JsonProperty(FIELD_GROUPPSSYSCSSID)
    public void setGroupPSSysCssId(String groupPSSysCssId){
        this.set(FIELD_GROUPPSSYSCSSID, groupPSSysCssId);
    }
    
    /**
     * 获取 分组样式表  
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
     * 判断 分组样式表 是否指定值，包括空值
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
     * 重置 分组样式表
     */
    @JsonIgnore
    public void resetGroupPSSysCssId(){
        this.reset(FIELD_GROUPPSSYSCSSID);
    }

    /**
     * 设置 分组样式表，详细说明：{@link #FIELD_GROUPPSSYSCSSID}
     * <P>
     * 等同 {@link #setGroupPSSysCssId}
     * @param groupPSSysCssId
     */
    @JsonIgnore
    public PSDEListDTO grouppssyscssid(String groupPSSysCssId){
        this.setGroupPSSysCssId(groupPSSysCssId);
        return this;
    }

    /**
     * 设置 分组样式表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setGroupPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSDEListDTO grouppssyscssid(PSSysCssDTO pSSysCss){
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
     * <B>GROUPPSSYSCSSNAME</B>&nbsp;分组样式表，指定数据分组项的界面样式表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GROUPPSSYSCSSID}
     */
    public final static String FIELD_GROUPPSSYSCSSNAME = "grouppssyscssname";

    /**
     * 设置 分组样式表，详细说明：{@link #FIELD_GROUPPSSYSCSSNAME}
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
     * 设置 分组样式表，详细说明：{@link #FIELD_GROUPPSSYSCSSNAME}
     * <P>
     * 等同 {@link #setGroupPSSysCssName}
     * @param groupPSSysCssName
     */
    @JsonIgnore
    public PSDEListDTO grouppssyscssname(String groupPSSysCssName){
        this.setGroupPSSysCssName(groupPSSysCssName);
        return this;
    }

    /**
     * <B>GROUPPSSYSPFPLUGINID</B>&nbsp;分组前端插件，指定数据分组项的前端模板扩展插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysPFPluginDTO} 
     */
    public final static String FIELD_GROUPPSSYSPFPLUGINID = "grouppssyspfpluginid";

    /**
     * 设置 分组前端插件，详细说明：{@link #FIELD_GROUPPSSYSPFPLUGINID}
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
     * 设置 分组前端插件，详细说明：{@link #FIELD_GROUPPSSYSPFPLUGINID}
     * <P>
     * 等同 {@link #setGroupPSSysPFPluginId}
     * @param groupPSSysPFPluginId
     */
    @JsonIgnore
    public PSDEListDTO grouppssyspfpluginid(String groupPSSysPFPluginId){
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
    public PSDEListDTO grouppssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin){
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
     * <B>GROUPPSSYSPFPLUGINNAME</B>&nbsp;分组前端插件，指定数据分组项的前端模板扩展插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GROUPPSSYSPFPLUGINID}
     */
    public final static String FIELD_GROUPPSSYSPFPLUGINNAME = "grouppssyspfpluginname";

    /**
     * 设置 分组前端插件，详细说明：{@link #FIELD_GROUPPSSYSPFPLUGINNAME}
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
     * 设置 分组前端插件，详细说明：{@link #FIELD_GROUPPSSYSPFPLUGINNAME}
     * <P>
     * 等同 {@link #setGroupPSSysPFPluginName}
     * @param groupPSSysPFPluginName
     */
    @JsonIgnore
    public PSDEListDTO grouppssyspfpluginname(String groupPSSysPFPluginName){
        this.setGroupPSSysPFPluginName(groupPSSysPFPluginName);
        return this;
    }

    /**
     * <B>ITEMPSSYSCSSID</B>&nbsp;默认项样式表，指定数据列表项默认样式表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysCssDTO} 
     */
    public final static String FIELD_ITEMPSSYSCSSID = "itempssyscssid";

    /**
     * 设置 默认项样式表，详细说明：{@link #FIELD_ITEMPSSYSCSSID}
     * 
     * @param itemPSSysCssId
     * 
     */
    @JsonProperty(FIELD_ITEMPSSYSCSSID)
    public void setItemPSSysCssId(String itemPSSysCssId){
        this.set(FIELD_ITEMPSSYSCSSID, itemPSSysCssId);
    }
    
    /**
     * 获取 默认项样式表  
     * @return
     */
    @JsonIgnore
    public String getItemPSSysCssId(){
        Object objValue = this.get(FIELD_ITEMPSSYSCSSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认项样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemPSSysCssIdDirty(){
        if(this.contains(FIELD_ITEMPSSYSCSSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认项样式表
     */
    @JsonIgnore
    public void resetItemPSSysCssId(){
        this.reset(FIELD_ITEMPSSYSCSSID);
    }

    /**
     * 设置 默认项样式表，详细说明：{@link #FIELD_ITEMPSSYSCSSID}
     * <P>
     * 等同 {@link #setItemPSSysCssId}
     * @param itemPSSysCssId
     */
    @JsonIgnore
    public PSDEListDTO itempssyscssid(String itemPSSysCssId){
        this.setItemPSSysCssId(itemPSSysCssId);
        return this;
    }

    /**
     * 设置 默认项样式表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setItemPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSDEListDTO itempssyscssid(PSSysCssDTO pSSysCss){
        if(pSSysCss == null){
            this.setItemPSSysCssId(null);
            this.setItemPSSysCssName(null);
        }
        else{
            this.setItemPSSysCssId(pSSysCss.getPSSysCssId());
            this.setItemPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    /**
     * <B>ITEMPSSYSCSSNAME</B>&nbsp;默认项样式表，指定数据列表项默认样式表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ITEMPSSYSCSSID}
     */
    public final static String FIELD_ITEMPSSYSCSSNAME = "itempssyscssname";

    /**
     * 设置 默认项样式表，详细说明：{@link #FIELD_ITEMPSSYSCSSNAME}
     * 
     * @param itemPSSysCssName
     * 
     */
    @JsonProperty(FIELD_ITEMPSSYSCSSNAME)
    public void setItemPSSysCssName(String itemPSSysCssName){
        this.set(FIELD_ITEMPSSYSCSSNAME, itemPSSysCssName);
    }
    
    /**
     * 获取 默认项样式表  
     * @return
     */
    @JsonIgnore
    public String getItemPSSysCssName(){
        Object objValue = this.get(FIELD_ITEMPSSYSCSSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认项样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemPSSysCssNameDirty(){
        if(this.contains(FIELD_ITEMPSSYSCSSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认项样式表
     */
    @JsonIgnore
    public void resetItemPSSysCssName(){
        this.reset(FIELD_ITEMPSSYSCSSNAME);
    }

    /**
     * 设置 默认项样式表，详细说明：{@link #FIELD_ITEMPSSYSCSSNAME}
     * <P>
     * 等同 {@link #setItemPSSysCssName}
     * @param itemPSSysCssName
     */
    @JsonIgnore
    public PSDEListDTO itempssyscssname(String itemPSSysCssName){
        this.setItemPSSysCssName(itemPSSysCssName);
        return this;
    }

    /**
     * <B>ITEMPSSYSPFPLUGINID</B>&nbsp;项前端插件，指定列表项的前端模板扩展插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysPFPluginDTO} 
     */
    public final static String FIELD_ITEMPSSYSPFPLUGINID = "itempssyspfpluginid";

    /**
     * 设置 项前端插件，详细说明：{@link #FIELD_ITEMPSSYSPFPLUGINID}
     * 
     * @param itemPSSysPFPluginId
     * 
     */
    @JsonProperty(FIELD_ITEMPSSYSPFPLUGINID)
    public void setItemPSSysPFPluginId(String itemPSSysPFPluginId){
        this.set(FIELD_ITEMPSSYSPFPLUGINID, itemPSSysPFPluginId);
    }
    
    /**
     * 获取 项前端插件  
     * @return
     */
    @JsonIgnore
    public String getItemPSSysPFPluginId(){
        Object objValue = this.get(FIELD_ITEMPSSYSPFPLUGINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项前端插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemPSSysPFPluginIdDirty(){
        if(this.contains(FIELD_ITEMPSSYSPFPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项前端插件
     */
    @JsonIgnore
    public void resetItemPSSysPFPluginId(){
        this.reset(FIELD_ITEMPSSYSPFPLUGINID);
    }

    /**
     * 设置 项前端插件，详细说明：{@link #FIELD_ITEMPSSYSPFPLUGINID}
     * <P>
     * 等同 {@link #setItemPSSysPFPluginId}
     * @param itemPSSysPFPluginId
     */
    @JsonIgnore
    public PSDEListDTO itempssyspfpluginid(String itemPSSysPFPluginId){
        this.setItemPSSysPFPluginId(itemPSSysPFPluginId);
        return this;
    }

    /**
     * 设置 项前端插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setItemPSSysPFPluginId}
     * @param pSSysPFPlugin 引用对象
     */
    @JsonIgnore
    public PSDEListDTO itempssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin){
        if(pSSysPFPlugin == null){
            this.setItemPSSysPFPluginId(null);
            this.setItemPSSysPFPluginName(null);
        }
        else{
            this.setItemPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setItemPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    /**
     * <B>ITEMPSSYSPFPLUGINNAME</B>&nbsp;项前端插件，指定列表项的前端模板扩展插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ITEMPSSYSPFPLUGINID}
     */
    public final static String FIELD_ITEMPSSYSPFPLUGINNAME = "itempssyspfpluginname";

    /**
     * 设置 项前端插件，详细说明：{@link #FIELD_ITEMPSSYSPFPLUGINNAME}
     * 
     * @param itemPSSysPFPluginName
     * 
     */
    @JsonProperty(FIELD_ITEMPSSYSPFPLUGINNAME)
    public void setItemPSSysPFPluginName(String itemPSSysPFPluginName){
        this.set(FIELD_ITEMPSSYSPFPLUGINNAME, itemPSSysPFPluginName);
    }
    
    /**
     * 获取 项前端插件  
     * @return
     */
    @JsonIgnore
    public String getItemPSSysPFPluginName(){
        Object objValue = this.get(FIELD_ITEMPSSYSPFPLUGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项前端插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemPSSysPFPluginNameDirty(){
        if(this.contains(FIELD_ITEMPSSYSPFPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项前端插件
     */
    @JsonIgnore
    public void resetItemPSSysPFPluginName(){
        this.reset(FIELD_ITEMPSSYSPFPLUGINNAME);
    }

    /**
     * 设置 项前端插件，详细说明：{@link #FIELD_ITEMPSSYSPFPLUGINNAME}
     * <P>
     * 等同 {@link #setItemPSSysPFPluginName}
     * @param itemPSSysPFPluginName
     */
    @JsonIgnore
    public PSDEListDTO itempssyspfpluginname(String itemPSSysPFPluginName){
        this.setItemPSSysPFPluginName(itemPSSysPFPluginName);
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;中文名称，指定数据列表部件的逻辑名称
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_LOGICNAME = "logicname";

    /**
     * 设置 中文名称，详细说明：{@link #FIELD_LOGICNAME}
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
     * 设置 中文名称，详细说明：{@link #FIELD_LOGICNAME}
     * <P>
     * 等同 {@link #setLogicName}
     * @param logicName
     */
    @JsonIgnore
    public PSDEListDTO logicname(String logicName){
        this.setLogicName(logicName);
        return this;
    }

    /**
     * <B>LVTAG</B>&nbsp;列表标记，指定数据列表部件的标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_LVTAG = "lvtag";

    /**
     * 设置 列表标记，详细说明：{@link #FIELD_LVTAG}
     * 
     * @param lVTag
     * 
     */
    @JsonProperty(FIELD_LVTAG)
    public void setLVTag(String lVTag){
        this.set(FIELD_LVTAG, lVTag);
    }
    
    /**
     * 获取 列表标记  
     * @return
     */
    @JsonIgnore
    public String getLVTag(){
        Object objValue = this.get(FIELD_LVTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 列表标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLVTagDirty(){
        if(this.contains(FIELD_LVTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 列表标记
     */
    @JsonIgnore
    public void resetLVTag(){
        this.reset(FIELD_LVTAG);
    }

    /**
     * 设置 列表标记，详细说明：{@link #FIELD_LVTAG}
     * <P>
     * 等同 {@link #setLVTag}
     * @param lVTag
     */
    @JsonIgnore
    public PSDEListDTO lvtag(String lVTag){
        this.setLVTag(lVTag);
        return this;
    }

    /**
     * <B>LVTAG2</B>&nbsp;列表标记2，指定数据列表部件的标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_LVTAG2 = "lvtag2";

    /**
     * 设置 列表标记2，详细说明：{@link #FIELD_LVTAG2}
     * 
     * @param lVTag2
     * 
     */
    @JsonProperty(FIELD_LVTAG2)
    public void setLVTag2(String lVTag2){
        this.set(FIELD_LVTAG2, lVTag2);
    }
    
    /**
     * 获取 列表标记2  
     * @return
     */
    @JsonIgnore
    public String getLVTag2(){
        Object objValue = this.get(FIELD_LVTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 列表标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLVTag2Dirty(){
        if(this.contains(FIELD_LVTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 列表标记2
     */
    @JsonIgnore
    public void resetLVTag2(){
        this.reset(FIELD_LVTAG2);
    }

    /**
     * 设置 列表标记2，详细说明：{@link #FIELD_LVTAG2}
     * <P>
     * 等同 {@link #setLVTag2}
     * @param lVTag2
     */
    @JsonIgnore
    public PSDEListDTO lvtag2(String lVTag2){
        this.setLVTag2(lVTag2);
        return this;
    }

    /**
     * <B>LVTAG3</B>&nbsp;列表标记3，指定数据列表部件的标记3
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_LVTAG3 = "lvtag3";

    /**
     * 设置 列表标记3，详细说明：{@link #FIELD_LVTAG3}
     * 
     * @param lVTag3
     * 
     */
    @JsonProperty(FIELD_LVTAG3)
    public void setLVTag3(String lVTag3){
        this.set(FIELD_LVTAG3, lVTag3);
    }
    
    /**
     * 获取 列表标记3  
     * @return
     */
    @JsonIgnore
    public String getLVTag3(){
        Object objValue = this.get(FIELD_LVTAG3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 列表标记3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLVTag3Dirty(){
        if(this.contains(FIELD_LVTAG3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 列表标记3
     */
    @JsonIgnore
    public void resetLVTag3(){
        this.reset(FIELD_LVTAG3);
    }

    /**
     * 设置 列表标记3，详细说明：{@link #FIELD_LVTAG3}
     * <P>
     * 等同 {@link #setLVTag3}
     * @param lVTag3
     */
    @JsonIgnore
    public PSDEListDTO lvtag3(String lVTag3){
        this.setLVTag3(lVTag3);
        return this;
    }

    /**
     * <B>LVTAG4</B>&nbsp;列表标记4，指定数据列表部件的标记4
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_LVTAG4 = "lvtag4";

    /**
     * 设置 列表标记4，详细说明：{@link #FIELD_LVTAG4}
     * 
     * @param lVTag4
     * 
     */
    @JsonProperty(FIELD_LVTAG4)
    public void setLVTag4(String lVTag4){
        this.set(FIELD_LVTAG4, lVTag4);
    }
    
    /**
     * 获取 列表标记4  
     * @return
     */
    @JsonIgnore
    public String getLVTag4(){
        Object objValue = this.get(FIELD_LVTAG4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 列表标记4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLVTag4Dirty(){
        if(this.contains(FIELD_LVTAG4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 列表标记4
     */
    @JsonIgnore
    public void resetLVTag4(){
        this.reset(FIELD_LVTAG4);
    }

    /**
     * 设置 列表标记4，详细说明：{@link #FIELD_LVTAG4}
     * <P>
     * 等同 {@link #setLVTag4}
     * @param lVTag4
     */
    @JsonIgnore
    public PSDEListDTO lvtag4(String lVTag4){
        this.setLVTag4(lVTag4);
        return this;
    }

    /**
     * <B>MEMO</B>&nbsp;备注
     * <P>
     * 字符串：最大长度 4000
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
    public PSDEListDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MINORSORTDIR</B>&nbsp;默认排序方向，指定列表对数据集合的默认排序方向，需指定默认排序属性
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.SortDir} 
     */
    public final static String FIELD_MINORSORTDIR = "minorsortdir";

    /**
     * 设置 默认排序方向，详细说明：{@link #FIELD_MINORSORTDIR}
     * 
     * @param minorSortDir
     * 
     */
    @JsonProperty(FIELD_MINORSORTDIR)
    public void setMinorSortDir(String minorSortDir){
        this.set(FIELD_MINORSORTDIR, minorSortDir);
    }
    
    /**
     * 获取 默认排序方向  
     * @return
     */
    @JsonIgnore
    public String getMinorSortDir(){
        Object objValue = this.get(FIELD_MINORSORTDIR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认排序方向 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinorSortDirDirty(){
        if(this.contains(FIELD_MINORSORTDIR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认排序方向
     */
    @JsonIgnore
    public void resetMinorSortDir(){
        this.reset(FIELD_MINORSORTDIR);
    }

    /**
     * 设置 默认排序方向，详细说明：{@link #FIELD_MINORSORTDIR}
     * <P>
     * 等同 {@link #setMinorSortDir}
     * @param minorSortDir
     */
    @JsonIgnore
    public PSDEListDTO minorsortdir(String minorSortDir){
        this.setMinorSortDir(minorSortDir);
        return this;
    }

     /**
     * 设置 默认排序方向，详细说明：{@link #FIELD_MINORSORTDIR}
     * <P>
     * 等同 {@link #setMinorSortDir}
     * @param minorSortDir
     */
    @JsonIgnore
    public PSDEListDTO minorsortdir(net.ibizsys.model.PSModelEnums.SortDir minorSortDir){
        if(minorSortDir == null){
            this.setMinorSortDir(null);
        }
        else{
            this.setMinorSortDir(minorSortDir.value);
        }
        return this;
    }

    /**
     * <B>MINORSORTPSDEFID</B>&nbsp;默认排序属性，指定列表对数据集合的默认排序属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_MINORSORTPSDEFID = "minorsortpsdefid";

    /**
     * 设置 默认排序属性，详细说明：{@link #FIELD_MINORSORTPSDEFID}
     * 
     * @param minorSortPSDEFId
     * 
     */
    @JsonProperty(FIELD_MINORSORTPSDEFID)
    public void setMinorSortPSDEFId(String minorSortPSDEFId){
        this.set(FIELD_MINORSORTPSDEFID, minorSortPSDEFId);
    }
    
    /**
     * 获取 默认排序属性  
     * @return
     */
    @JsonIgnore
    public String getMinorSortPSDEFId(){
        Object objValue = this.get(FIELD_MINORSORTPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认排序属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinorSortPSDEFIdDirty(){
        if(this.contains(FIELD_MINORSORTPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认排序属性
     */
    @JsonIgnore
    public void resetMinorSortPSDEFId(){
        this.reset(FIELD_MINORSORTPSDEFID);
    }

    /**
     * 设置 默认排序属性，详细说明：{@link #FIELD_MINORSORTPSDEFID}
     * <P>
     * 等同 {@link #setMinorSortPSDEFId}
     * @param minorSortPSDEFId
     */
    @JsonIgnore
    public PSDEListDTO minorsortpsdefid(String minorSortPSDEFId){
        this.setMinorSortPSDEFId(minorSortPSDEFId);
        return this;
    }

    /**
     * 设置 默认排序属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMinorSortPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDEListDTO minorsortpsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setMinorSortPSDEFId(null);
            this.setMinorSortPSDEFName(null);
        }
        else{
            this.setMinorSortPSDEFId(pSDEField.getPSDEFieldId());
            this.setMinorSortPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>MINORSORTPSDEFNAME</B>&nbsp;默认排序属性，指定列表对数据集合的默认排序属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MINORSORTPSDEFID}
     */
    public final static String FIELD_MINORSORTPSDEFNAME = "minorsortpsdefname";

    /**
     * 设置 默认排序属性，详细说明：{@link #FIELD_MINORSORTPSDEFNAME}
     * 
     * @param minorSortPSDEFName
     * 
     */
    @JsonProperty(FIELD_MINORSORTPSDEFNAME)
    public void setMinorSortPSDEFName(String minorSortPSDEFName){
        this.set(FIELD_MINORSORTPSDEFNAME, minorSortPSDEFName);
    }
    
    /**
     * 获取 默认排序属性  
     * @return
     */
    @JsonIgnore
    public String getMinorSortPSDEFName(){
        Object objValue = this.get(FIELD_MINORSORTPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认排序属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinorSortPSDEFNameDirty(){
        if(this.contains(FIELD_MINORSORTPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认排序属性
     */
    @JsonIgnore
    public void resetMinorSortPSDEFName(){
        this.reset(FIELD_MINORSORTPSDEFNAME);
    }

    /**
     * 设置 默认排序属性，详细说明：{@link #FIELD_MINORSORTPSDEFNAME}
     * <P>
     * 等同 {@link #setMinorSortPSDEFName}
     * @param minorSortPSDEFName
     */
    @JsonIgnore
    public PSDEListDTO minorsortpsdefname(String minorSortPSDEFName){
        this.setMinorSortPSDEFName(minorSortPSDEFName);
        return this;
    }

    /**
     * <B>MOBLISTSTYLE</B>&nbsp;移动端列表样式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.MobMDCtrlType} 
     */
    public final static String FIELD_MOBLISTSTYLE = "mobliststyle";

    /**
     * 设置 移动端列表样式
     * 
     * @param mobListStyle
     * 
     */
    @JsonProperty(FIELD_MOBLISTSTYLE)
    public void setMobListStyle(String mobListStyle){
        this.set(FIELD_MOBLISTSTYLE, mobListStyle);
    }
    
    /**
     * 获取 移动端列表样式  
     * @return
     */
    @JsonIgnore
    public String getMobListStyle(){
        Object objValue = this.get(FIELD_MOBLISTSTYLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端列表样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobListStyleDirty(){
        if(this.contains(FIELD_MOBLISTSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端列表样式
     */
    @JsonIgnore
    public void resetMobListStyle(){
        this.reset(FIELD_MOBLISTSTYLE);
    }

    /**
     * 设置 移动端列表样式
     * <P>
     * 等同 {@link #setMobListStyle}
     * @param mobListStyle
     */
    @JsonIgnore
    public PSDEListDTO mobliststyle(String mobListStyle){
        this.setMobListStyle(mobListStyle);
        return this;
    }

     /**
     * 设置 移动端列表样式
     * <P>
     * 等同 {@link #setMobListStyle}
     * @param mobListStyle
     */
    @JsonIgnore
    public PSDEListDTO mobliststyle(net.ibizsys.model.PSModelEnums.MobMDCtrlType mobListStyle){
        if(mobListStyle == null){
            this.setMobListStyle(null);
        }
        else{
            this.setMobListStyle(mobListStyle.value);
        }
        return this;
    }

    /**
     * <B>MULTISELECT</B>&nbsp;支持多选
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_MULTISELECT = "multiselect";

    /**
     * 设置 支持多选
     * 
     * @param multiSelect
     * 
     */
    @JsonProperty(FIELD_MULTISELECT)
    public void setMultiSelect(Integer multiSelect){
        this.set(FIELD_MULTISELECT, multiSelect);
    }
    
    /**
     * 获取 支持多选  
     * @return
     */
    @JsonIgnore
    public Integer getMultiSelect(){
        Object objValue = this.get(FIELD_MULTISELECT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持多选 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMultiSelectDirty(){
        if(this.contains(FIELD_MULTISELECT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持多选
     */
    @JsonIgnore
    public void resetMultiSelect(){
        this.reset(FIELD_MULTISELECT);
    }

    /**
     * 设置 支持多选
     * <P>
     * 等同 {@link #setMultiSelect}
     * @param multiSelect
     */
    @JsonIgnore
    public PSDEListDTO multiselect(Integer multiSelect){
        this.setMultiSelect(multiSelect);
        return this;
    }

     /**
     * 设置 支持多选
     * <P>
     * 等同 {@link #setMultiSelect}
     * @param multiSelect
     */
    @JsonIgnore
    public PSDEListDTO multiselect(Boolean multiSelect){
        if(multiSelect == null){
            this.setMultiSelect(null);
        }
        else{
            this.setMultiSelect(multiSelect?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>NAVPSDERID</B>&nbsp;导航视图关系，指定数据列表部件默认的导航关系，此配置在列表导航视图启用
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDERDTO} 
     */
    public final static String FIELD_NAVPSDERID = "navpsderid";

    /**
     * 设置 导航视图关系，详细说明：{@link #FIELD_NAVPSDERID}
     * 
     * @param navPSDERId
     * 
     */
    @JsonProperty(FIELD_NAVPSDERID)
    public void setNavPSDERId(String navPSDERId){
        this.set(FIELD_NAVPSDERID, navPSDERId);
    }
    
    /**
     * 获取 导航视图关系  
     * @return
     */
    @JsonIgnore
    public String getNavPSDERId(){
        Object objValue = this.get(FIELD_NAVPSDERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导航视图关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavPSDERIdDirty(){
        if(this.contains(FIELD_NAVPSDERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航视图关系
     */
    @JsonIgnore
    public void resetNavPSDERId(){
        this.reset(FIELD_NAVPSDERID);
    }

    /**
     * 设置 导航视图关系，详细说明：{@link #FIELD_NAVPSDERID}
     * <P>
     * 等同 {@link #setNavPSDERId}
     * @param navPSDERId
     */
    @JsonIgnore
    public PSDEListDTO navpsderid(String navPSDERId){
        this.setNavPSDERId(navPSDERId);
        return this;
    }

    /**
     * 设置 导航视图关系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNavPSDERId}
     * @param pSDER 引用对象
     */
    @JsonIgnore
    public PSDEListDTO navpsderid(PSDERDTO pSDER){
        if(pSDER == null){
            this.setNavPSDERId(null);
            this.setNavPSDERName(null);
        }
        else{
            this.setNavPSDERId(pSDER.getPSDERId());
            this.setNavPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    /**
     * <B>NAVPSDERNAME</B>&nbsp;导航视图关系，指定数据列表部件默认的导航关系，此配置在列表导航视图启用
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NAVPSDERID}
     */
    public final static String FIELD_NAVPSDERNAME = "navpsdername";

    /**
     * 设置 导航视图关系，详细说明：{@link #FIELD_NAVPSDERNAME}
     * 
     * @param navPSDERName
     * 
     */
    @JsonProperty(FIELD_NAVPSDERNAME)
    public void setNavPSDERName(String navPSDERName){
        this.set(FIELD_NAVPSDERNAME, navPSDERName);
    }
    
    /**
     * 获取 导航视图关系  
     * @return
     */
    @JsonIgnore
    public String getNavPSDERName(){
        Object objValue = this.get(FIELD_NAVPSDERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导航视图关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavPSDERNameDirty(){
        if(this.contains(FIELD_NAVPSDERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航视图关系
     */
    @JsonIgnore
    public void resetNavPSDERName(){
        this.reset(FIELD_NAVPSDERNAME);
    }

    /**
     * 设置 导航视图关系，详细说明：{@link #FIELD_NAVPSDERNAME}
     * <P>
     * 等同 {@link #setNavPSDERName}
     * @param navPSDERName
     */
    @JsonIgnore
    public PSDEListDTO navpsdername(String navPSDERName){
        this.setNavPSDERName(navPSDERName);
        return this;
    }

    /**
     * <B>NAVPSDEVIEWBASEID</B>&nbsp;导航视图，指定列表部件默认的导航关系视图，此配置在列表导航视图启用
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEViewBaseDTO} 
     */
    public final static String FIELD_NAVPSDEVIEWBASEID = "navpsdeviewbaseid";

    /**
     * 设置 导航视图，详细说明：{@link #FIELD_NAVPSDEVIEWBASEID}
     * 
     * @param navPSDEViewBaseId
     * 
     */
    @JsonProperty(FIELD_NAVPSDEVIEWBASEID)
    public void setNavPSDEViewBaseId(String navPSDEViewBaseId){
        this.set(FIELD_NAVPSDEVIEWBASEID, navPSDEViewBaseId);
    }
    
    /**
     * 获取 导航视图  
     * @return
     */
    @JsonIgnore
    public String getNavPSDEViewBaseId(){
        Object objValue = this.get(FIELD_NAVPSDEVIEWBASEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导航视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavPSDEViewBaseIdDirty(){
        if(this.contains(FIELD_NAVPSDEVIEWBASEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航视图
     */
    @JsonIgnore
    public void resetNavPSDEViewBaseId(){
        this.reset(FIELD_NAVPSDEVIEWBASEID);
    }

    /**
     * 设置 导航视图，详细说明：{@link #FIELD_NAVPSDEVIEWBASEID}
     * <P>
     * 等同 {@link #setNavPSDEViewBaseId}
     * @param navPSDEViewBaseId
     */
    @JsonIgnore
    public PSDEListDTO navpsdeviewbaseid(String navPSDEViewBaseId){
        this.setNavPSDEViewBaseId(navPSDEViewBaseId);
        return this;
    }

    /**
     * 设置 导航视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNavPSDEViewBaseId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSDEListDTO navpsdeviewbaseid(PSDEViewBaseDTO pSDEViewBase){
        if(pSDEViewBase == null){
            this.setNavPSDEViewBaseId(null);
            this.setNavPSDEViewBaseName(null);
        }
        else{
            this.setNavPSDEViewBaseId(pSDEViewBase.getPSDEViewBaseId());
            this.setNavPSDEViewBaseName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>NAVPSDEVIEWBASENAME</B>&nbsp;导航视图，指定列表部件默认的导航关系视图，此配置在列表导航视图启用
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NAVPSDEVIEWBASEID}
     */
    public final static String FIELD_NAVPSDEVIEWBASENAME = "navpsdeviewbasename";

    /**
     * 设置 导航视图，详细说明：{@link #FIELD_NAVPSDEVIEWBASENAME}
     * 
     * @param navPSDEViewBaseName
     * 
     */
    @JsonProperty(FIELD_NAVPSDEVIEWBASENAME)
    public void setNavPSDEViewBaseName(String navPSDEViewBaseName){
        this.set(FIELD_NAVPSDEVIEWBASENAME, navPSDEViewBaseName);
    }
    
    /**
     * 获取 导航视图  
     * @return
     */
    @JsonIgnore
    public String getNavPSDEViewBaseName(){
        Object objValue = this.get(FIELD_NAVPSDEVIEWBASENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导航视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavPSDEViewBaseNameDirty(){
        if(this.contains(FIELD_NAVPSDEVIEWBASENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航视图
     */
    @JsonIgnore
    public void resetNavPSDEViewBaseName(){
        this.reset(FIELD_NAVPSDEVIEWBASENAME);
    }

    /**
     * 设置 导航视图，详细说明：{@link #FIELD_NAVPSDEVIEWBASENAME}
     * <P>
     * 等同 {@link #setNavPSDEViewBaseName}
     * @param navPSDEViewBaseName
     */
    @JsonIgnore
    public PSDEListDTO navpsdeviewbasename(String navPSDEViewBaseName){
        this.setNavPSDEViewBaseName(navPSDEViewBaseName);
        return this;
    }

    /**
     * <B>NAVVIEWFILTER</B>&nbsp;导航视图过滤项，指定数据列表部件关联导航视图的过滤项名称，导航视图一般使用应用上下文自动进行数据过滤，指定过滤项将为导航视图显示传入过滤条件
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_NAVVIEWFILTER = "navviewfilter";

    /**
     * 设置 导航视图过滤项，详细说明：{@link #FIELD_NAVVIEWFILTER}
     * 
     * @param navViewFilter
     * 
     */
    @JsonProperty(FIELD_NAVVIEWFILTER)
    public void setNavViewFilter(String navViewFilter){
        this.set(FIELD_NAVVIEWFILTER, navViewFilter);
    }
    
    /**
     * 获取 导航视图过滤项  
     * @return
     */
    @JsonIgnore
    public String getNavViewFilter(){
        Object objValue = this.get(FIELD_NAVVIEWFILTER);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导航视图过滤项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavViewFilterDirty(){
        if(this.contains(FIELD_NAVVIEWFILTER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航视图过滤项
     */
    @JsonIgnore
    public void resetNavViewFilter(){
        this.reset(FIELD_NAVVIEWFILTER);
    }

    /**
     * 设置 导航视图过滤项，详细说明：{@link #FIELD_NAVVIEWFILTER}
     * <P>
     * 等同 {@link #setNavViewFilter}
     * @param navViewFilter
     */
    @JsonIgnore
    public PSDEListDTO navviewfilter(String navViewFilter){
        this.setNavViewFilter(navViewFilter);
        return this;
    }

    /**
     * <B>NAVVIEWPARAM</B>&nbsp;导航视图参数，指定数据列表部件关联导航视图的额外参数
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_NAVVIEWPARAM = "navviewparam";

    /**
     * 设置 导航视图参数，详细说明：{@link #FIELD_NAVVIEWPARAM}
     * 
     * @param navViewParam
     * 
     */
    @JsonProperty(FIELD_NAVVIEWPARAM)
    public void setNavViewParam(String navViewParam){
        this.set(FIELD_NAVVIEWPARAM, navViewParam);
    }
    
    /**
     * 获取 导航视图参数  
     * @return
     */
    @JsonIgnore
    public String getNavViewParam(){
        Object objValue = this.get(FIELD_NAVVIEWPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导航视图参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavViewParamDirty(){
        if(this.contains(FIELD_NAVVIEWPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航视图参数
     */
    @JsonIgnore
    public void resetNavViewParam(){
        this.reset(FIELD_NAVVIEWPARAM);
    }

    /**
     * 设置 导航视图参数，详细说明：{@link #FIELD_NAVVIEWPARAM}
     * <P>
     * 等同 {@link #setNavViewParam}
     * @param navViewParam
     */
    @JsonIgnore
    public PSDEListDTO navviewparam(String navViewParam){
        this.setNavViewParam(navViewParam);
        return this;
    }

    /**
     * <B>NO2PSDEUAGROUPID</B>&nbsp;右滑行为组，指定数据列表部件右滑操作的界面行为组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEUAGroupDTO} 
     */
    public final static String FIELD_NO2PSDEUAGROUPID = "no2psdeuagroupid";

    /**
     * 设置 右滑行为组，详细说明：{@link #FIELD_NO2PSDEUAGROUPID}
     * 
     * @param no2PSDEUAGroupId
     * 
     */
    @JsonProperty(FIELD_NO2PSDEUAGROUPID)
    public void setNo2PSDEUAGroupId(String no2PSDEUAGroupId){
        this.set(FIELD_NO2PSDEUAGROUPID, no2PSDEUAGroupId);
    }
    
    /**
     * 获取 右滑行为组  
     * @return
     */
    @JsonIgnore
    public String getNo2PSDEUAGroupId(){
        Object objValue = this.get(FIELD_NO2PSDEUAGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 右滑行为组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo2PSDEUAGroupIdDirty(){
        if(this.contains(FIELD_NO2PSDEUAGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 右滑行为组
     */
    @JsonIgnore
    public void resetNo2PSDEUAGroupId(){
        this.reset(FIELD_NO2PSDEUAGROUPID);
    }

    /**
     * 设置 右滑行为组，详细说明：{@link #FIELD_NO2PSDEUAGROUPID}
     * <P>
     * 等同 {@link #setNo2PSDEUAGroupId}
     * @param no2PSDEUAGroupId
     */
    @JsonIgnore
    public PSDEListDTO no2psdeuagroupid(String no2PSDEUAGroupId){
        this.setNo2PSDEUAGroupId(no2PSDEUAGroupId);
        return this;
    }

    /**
     * 设置 右滑行为组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNo2PSDEUAGroupId}
     * @param pSDEUAGroup 引用对象
     */
    @JsonIgnore
    public PSDEListDTO no2psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup){
        if(pSDEUAGroup == null){
            this.setNo2PSDEUAGroupId(null);
            this.setNo2PSDEUAGroupName(null);
        }
        else{
            this.setNo2PSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setNo2PSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    /**
     * <B>NO2PSDEUAGROUPNAME</B>&nbsp;右滑行为组，指定数据列表部件右滑操作的界面行为组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NO2PSDEUAGROUPID}
     */
    public final static String FIELD_NO2PSDEUAGROUPNAME = "no2psdeuagroupname";

    /**
     * 设置 右滑行为组，详细说明：{@link #FIELD_NO2PSDEUAGROUPNAME}
     * 
     * @param no2PSDEUAGroupName
     * 
     */
    @JsonProperty(FIELD_NO2PSDEUAGROUPNAME)
    public void setNo2PSDEUAGroupName(String no2PSDEUAGroupName){
        this.set(FIELD_NO2PSDEUAGROUPNAME, no2PSDEUAGroupName);
    }
    
    /**
     * 获取 右滑行为组  
     * @return
     */
    @JsonIgnore
    public String getNo2PSDEUAGroupName(){
        Object objValue = this.get(FIELD_NO2PSDEUAGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 右滑行为组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo2PSDEUAGroupNameDirty(){
        if(this.contains(FIELD_NO2PSDEUAGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 右滑行为组
     */
    @JsonIgnore
    public void resetNo2PSDEUAGroupName(){
        this.reset(FIELD_NO2PSDEUAGROUPNAME);
    }

    /**
     * 设置 右滑行为组，详细说明：{@link #FIELD_NO2PSDEUAGROUPNAME}
     * <P>
     * 等同 {@link #setNo2PSDEUAGroupName}
     * @param no2PSDEUAGroupName
     */
    @JsonIgnore
    public PSDEListDTO no2psdeuagroupname(String no2PSDEUAGroupName){
        this.setNo2PSDEUAGroupName(no2PSDEUAGroupName);
        return this;
    }

    /**
     * <B>NOSORT</B>&nbsp;默认禁用排序，指定是否默认禁用数据列表项的排序能力，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_NOSORT = "nosort";

    /**
     * 设置 默认禁用排序，详细说明：{@link #FIELD_NOSORT}
     * 
     * @param noSort
     * 
     */
    @JsonProperty(FIELD_NOSORT)
    public void setNoSort(Integer noSort){
        this.set(FIELD_NOSORT, noSort);
    }
    
    /**
     * 获取 默认禁用排序  
     * @return
     */
    @JsonIgnore
    public Integer getNoSort(){
        Object objValue = this.get(FIELD_NOSORT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认禁用排序 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNoSortDirty(){
        if(this.contains(FIELD_NOSORT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认禁用排序
     */
    @JsonIgnore
    public void resetNoSort(){
        this.reset(FIELD_NOSORT);
    }

    /**
     * 设置 默认禁用排序，详细说明：{@link #FIELD_NOSORT}
     * <P>
     * 等同 {@link #setNoSort}
     * @param noSort
     */
    @JsonIgnore
    public PSDEListDTO nosort(Integer noSort){
        this.setNoSort(noSort);
        return this;
    }

     /**
     * 设置 默认禁用排序，详细说明：{@link #FIELD_NOSORT}
     * <P>
     * 等同 {@link #setNoSort}
     * @param noSort
     */
    @JsonIgnore
    public PSDEListDTO nosort(Boolean noSort){
        if(noSort == null){
            this.setNoSort(null);
        }
        else{
            this.setNoSort(noSort?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ORDERVALUEPSDEFID</B>&nbsp;排序值属性，指定数据列表部件的排序值属性，未指定时使用所在实体的默认排序值属性，启用列表行排序功能需要指定排序值属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_ORDERVALUEPSDEFID = "ordervaluepsdefid";

    /**
     * 设置 排序值属性，详细说明：{@link #FIELD_ORDERVALUEPSDEFID}
     * 
     * @param orderValuePSDEFId
     * 
     */
    @JsonProperty(FIELD_ORDERVALUEPSDEFID)
    public void setOrderValuePSDEFId(String orderValuePSDEFId){
        this.set(FIELD_ORDERVALUEPSDEFID, orderValuePSDEFId);
    }
    
    /**
     * 获取 排序值属性  
     * @return
     */
    @JsonIgnore
    public String getOrderValuePSDEFId(){
        Object objValue = this.get(FIELD_ORDERVALUEPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 排序值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOrderValuePSDEFIdDirty(){
        if(this.contains(FIELD_ORDERVALUEPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 排序值属性
     */
    @JsonIgnore
    public void resetOrderValuePSDEFId(){
        this.reset(FIELD_ORDERVALUEPSDEFID);
    }

    /**
     * 设置 排序值属性，详细说明：{@link #FIELD_ORDERVALUEPSDEFID}
     * <P>
     * 等同 {@link #setOrderValuePSDEFId}
     * @param orderValuePSDEFId
     */
    @JsonIgnore
    public PSDEListDTO ordervaluepsdefid(String orderValuePSDEFId){
        this.setOrderValuePSDEFId(orderValuePSDEFId);
        return this;
    }

    /**
     * 设置 排序值属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setOrderValuePSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDEListDTO ordervaluepsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setOrderValuePSDEFId(null);
            this.setOrderValuePSDEFName(null);
        }
        else{
            this.setOrderValuePSDEFId(pSDEField.getPSDEFieldId());
            this.setOrderValuePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>ORDERVALUEPSDEFNAME</B>&nbsp;排序值属性，指定数据列表部件的排序值属性，未指定时使用所在实体的默认排序值属性，启用列表行排序功能需要指定排序值属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ORDERVALUEPSDEFID}
     */
    public final static String FIELD_ORDERVALUEPSDEFNAME = "ordervaluepsdefname";

    /**
     * 设置 排序值属性，详细说明：{@link #FIELD_ORDERVALUEPSDEFNAME}
     * 
     * @param orderValuePSDEFName
     * 
     */
    @JsonProperty(FIELD_ORDERVALUEPSDEFNAME)
    public void setOrderValuePSDEFName(String orderValuePSDEFName){
        this.set(FIELD_ORDERVALUEPSDEFNAME, orderValuePSDEFName);
    }
    
    /**
     * 获取 排序值属性  
     * @return
     */
    @JsonIgnore
    public String getOrderValuePSDEFName(){
        Object objValue = this.get(FIELD_ORDERVALUEPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 排序值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOrderValuePSDEFNameDirty(){
        if(this.contains(FIELD_ORDERVALUEPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 排序值属性
     */
    @JsonIgnore
    public void resetOrderValuePSDEFName(){
        this.reset(FIELD_ORDERVALUEPSDEFNAME);
    }

    /**
     * 设置 排序值属性，详细说明：{@link #FIELD_ORDERVALUEPSDEFNAME}
     * <P>
     * 等同 {@link #setOrderValuePSDEFName}
     * @param orderValuePSDEFName
     */
    @JsonIgnore
    public PSDEListDTO ordervaluepsdefname(String orderValuePSDEFName){
        this.setOrderValuePSDEFName(orderValuePSDEFName);
        return this;
    }

    /**
     * <B>PAGESIZE</B>&nbsp;分页大小，指定数据列表的分页大小，未定义时为【1000】
     */
    public final static String FIELD_PAGESIZE = "pagesize";

    /**
     * 设置 分页大小，详细说明：{@link #FIELD_PAGESIZE}
     * 
     * @param pageSize
     * 
     */
    @JsonProperty(FIELD_PAGESIZE)
    public void setPageSize(Integer pageSize){
        this.set(FIELD_PAGESIZE, pageSize);
    }
    
    /**
     * 获取 分页大小  
     * @return
     */
    @JsonIgnore
    public Integer getPageSize(){
        Object objValue = this.get(FIELD_PAGESIZE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 分页大小 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPageSizeDirty(){
        if(this.contains(FIELD_PAGESIZE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分页大小
     */
    @JsonIgnore
    public void resetPageSize(){
        this.reset(FIELD_PAGESIZE);
    }

    /**
     * 设置 分页大小，详细说明：{@link #FIELD_PAGESIZE}
     * <P>
     * 等同 {@link #setPageSize}
     * @param pageSize
     */
    @JsonIgnore
    public PSDEListDTO pagesize(Integer pageSize){
        this.setPageSize(pageSize);
        return this;
    }

    /**
     * <B>PSACHANDLERID</B>&nbsp;列表后台处理对象，指定数据列表部件默认的界面处理对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSACHandlerDTO} 
     */
    public final static String FIELD_PSACHANDLERID = "psachandlerid";

    /**
     * 设置 列表后台处理对象，详细说明：{@link #FIELD_PSACHANDLERID}
     * 
     * @param pSACHandlerId
     * 
     */
    @JsonProperty(FIELD_PSACHANDLERID)
    public void setPSACHandlerId(String pSACHandlerId){
        this.set(FIELD_PSACHANDLERID, pSACHandlerId);
    }
    
    /**
     * 获取 列表后台处理对象  
     * @return
     */
    @JsonIgnore
    public String getPSACHandlerId(){
        Object objValue = this.get(FIELD_PSACHANDLERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 列表后台处理对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSACHandlerIdDirty(){
        if(this.contains(FIELD_PSACHANDLERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 列表后台处理对象
     */
    @JsonIgnore
    public void resetPSACHandlerId(){
        this.reset(FIELD_PSACHANDLERID);
    }

    /**
     * 设置 列表后台处理对象，详细说明：{@link #FIELD_PSACHANDLERID}
     * <P>
     * 等同 {@link #setPSACHandlerId}
     * @param pSACHandlerId
     */
    @JsonIgnore
    public PSDEListDTO psachandlerid(String pSACHandlerId){
        this.setPSACHandlerId(pSACHandlerId);
        return this;
    }

    /**
     * 设置 列表后台处理对象，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSACHandlerId}
     * @param pSACHandler 引用对象
     */
    @JsonIgnore
    public PSDEListDTO psachandlerid(PSACHandlerDTO pSACHandler){
        if(pSACHandler == null){
            this.setPSACHandlerId(null);
            this.setPSACHandlerName(null);
        }
        else{
            this.setPSACHandlerId(pSACHandler.getPSACHandlerId());
            this.setPSACHandlerName(pSACHandler.getPSACHandlerName());
        }
        return this;
    }

    /**
     * <B>PSACHANDLERNAME</B>&nbsp;界面处理对象，指定数据列表部件默认的界面处理对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSACHANDLERID}
     */
    public final static String FIELD_PSACHANDLERNAME = "psachandlername";

    /**
     * 设置 界面处理对象，详细说明：{@link #FIELD_PSACHANDLERNAME}
     * 
     * @param pSACHandlerName
     * 
     */
    @JsonProperty(FIELD_PSACHANDLERNAME)
    public void setPSACHandlerName(String pSACHandlerName){
        this.set(FIELD_PSACHANDLERNAME, pSACHandlerName);
    }
    
    /**
     * 获取 界面处理对象  
     * @return
     */
    @JsonIgnore
    public String getPSACHandlerName(){
        Object objValue = this.get(FIELD_PSACHANDLERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面处理对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSACHandlerNameDirty(){
        if(this.contains(FIELD_PSACHANDLERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面处理对象
     */
    @JsonIgnore
    public void resetPSACHandlerName(){
        this.reset(FIELD_PSACHANDLERNAME);
    }

    /**
     * 设置 界面处理对象，详细说明：{@link #FIELD_PSACHANDLERNAME}
     * <P>
     * 等同 {@link #setPSACHandlerName}
     * @param pSACHandlerName
     */
    @JsonIgnore
    public PSDEListDTO psachandlername(String pSACHandlerName){
        this.setPSACHandlerName(pSACHandlerName);
        return this;
    }

    /**
     * <B>PSCTRLLOGICGROUPID</B>&nbsp;界面逻辑组，指定数据列表部件默认附加的部件逻辑组对象
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
    public PSDEListDTO psctrllogicgroupid(String pSCtrlLogicGroupId){
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
    public PSDEListDTO psctrllogicgroupid(PSCtrlLogicGroupDTO pSCtrlLogicGroup){
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
     * <B>PSCTRLLOGICGROUPNAME</B>&nbsp;界面逻辑组，指定数据列表部件默认附加的部件逻辑组对象
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
    public PSDEListDTO psctrllogicgroupname(String pSCtrlLogicGroupName){
        this.setPSCtrlLogicGroupName(pSCtrlLogicGroupName);
        return this;
    }

    /**
     * <B>PSCTRLMSGID</B>&nbsp;部件消息，指定数据列表部件默认的部件消息对象
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
    public PSDEListDTO psctrlmsgid(String pSCtrlMsgId){
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
    public PSDEListDTO psctrlmsgid(PSCtrlMsgDTO pSCtrlMsg){
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
     * <B>PSCTRLMSGNAME</B>&nbsp;部件消息，指定数据列表部件默认的部件消息对象
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
    public PSDEListDTO psctrlmsgname(String pSCtrlMsgName){
        this.setPSCtrlMsgName(pSCtrlMsgName);
        return this;
    }

    /**
     * <B>PSDEDSID</B>&nbsp;默认数据集合，指定数据列表部件默认使用的数据集合，来自列表所在实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO} 
     */
    public final static String FIELD_PSDEDSID = "psdedsid";

    /**
     * 设置 默认数据集合，详细说明：{@link #FIELD_PSDEDSID}
     * 
     * @param pSDEDSId
     * 
     */
    @JsonProperty(FIELD_PSDEDSID)
    public void setPSDEDSId(String pSDEDSId){
        this.set(FIELD_PSDEDSID, pSDEDSId);
    }
    
    /**
     * 获取 默认数据集合  
     * @return
     */
    @JsonIgnore
    public String getPSDEDSId(){
        Object objValue = this.get(FIELD_PSDEDSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认数据集合 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDSIdDirty(){
        if(this.contains(FIELD_PSDEDSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认数据集合
     */
    @JsonIgnore
    public void resetPSDEDSId(){
        this.reset(FIELD_PSDEDSID);
    }

    /**
     * 设置 默认数据集合，详细说明：{@link #FIELD_PSDEDSID}
     * <P>
     * 等同 {@link #setPSDEDSId}
     * @param pSDEDSId
     */
    @JsonIgnore
    public PSDEListDTO psdedsid(String pSDEDSId){
        this.setPSDEDSId(pSDEDSId);
        return this;
    }

    /**
     * 设置 默认数据集合，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDSId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSDEListDTO psdedsid(PSDEDataSetDTO pSDEDataSet){
        if(pSDEDataSet == null){
            this.setPSDEDSId(null);
            this.setPSDEDSName(null);
        }
        else{
            this.setPSDEDSId(pSDEDataSet.getPSDEDataSetId());
            this.setPSDEDSName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    /**
     * <B>PSDEDSNAME</B>&nbsp;默认数据集合，指定数据列表部件默认使用的数据集合，来自列表所在实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDSID}
     */
    public final static String FIELD_PSDEDSNAME = "psdedsname";

    /**
     * 设置 默认数据集合，详细说明：{@link #FIELD_PSDEDSNAME}
     * 
     * @param pSDEDSName
     * 
     */
    @JsonProperty(FIELD_PSDEDSNAME)
    public void setPSDEDSName(String pSDEDSName){
        this.set(FIELD_PSDEDSNAME, pSDEDSName);
    }
    
    /**
     * 获取 默认数据集合  
     * @return
     */
    @JsonIgnore
    public String getPSDEDSName(){
        Object objValue = this.get(FIELD_PSDEDSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认数据集合 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDSNameDirty(){
        if(this.contains(FIELD_PSDEDSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认数据集合
     */
    @JsonIgnore
    public void resetPSDEDSName(){
        this.reset(FIELD_PSDEDSNAME);
    }

    /**
     * 设置 默认数据集合，详细说明：{@link #FIELD_PSDEDSNAME}
     * <P>
     * 等同 {@link #setPSDEDSName}
     * @param pSDEDSName
     */
    @JsonIgnore
    public PSDEListDTO psdedsname(String pSDEDSName){
        this.setPSDEDSName(pSDEDSName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定数据列表部件所在的实体对象
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
    public PSDEListDTO psdeid(String pSDEId){
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
    public PSDEListDTO psdeid(PSDataEntityDTO pSDataEntity){
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
     * <B>PSDELISTID</B>&nbsp;实体列表标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDELISTID = "psdelistid";

    /**
     * 设置 实体列表标识
     * 
     * @param pSDEListId
     * 
     */
    @JsonProperty(FIELD_PSDELISTID)
    public void setPSDEListId(String pSDEListId){
        this.set(FIELD_PSDELISTID, pSDEListId);
    }
    
    /**
     * 获取 实体列表标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEListId(){
        Object objValue = this.get(FIELD_PSDELISTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体列表标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEListIdDirty(){
        if(this.contains(FIELD_PSDELISTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体列表标识
     */
    @JsonIgnore
    public void resetPSDEListId(){
        this.reset(FIELD_PSDELISTID);
    }

    /**
     * 设置 实体列表标识
     * <P>
     * 等同 {@link #setPSDEListId}
     * @param pSDEListId
     */
    @JsonIgnore
    public PSDEListDTO psdelistid(String pSDEListId){
        this.setPSDEListId(pSDEListId);
        return this;
    }

    /**
     * <B>PSDELISTNAME</B>&nbsp;实体列表标识，指定数据列表部件的标识，需在所在的实体对象中具备唯一性
     * <P>
     * 字符串：最大长度 30，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSDELISTNAME = "psdelistname";

    /**
     * 设置 实体列表标识，详细说明：{@link #FIELD_PSDELISTNAME}
     * 
     * @param pSDEListName
     * 
     */
    @JsonProperty(FIELD_PSDELISTNAME)
    public void setPSDEListName(String pSDEListName){
        this.set(FIELD_PSDELISTNAME, pSDEListName);
    }
    
    /**
     * 获取 实体列表标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEListName(){
        Object objValue = this.get(FIELD_PSDELISTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体列表标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEListNameDirty(){
        if(this.contains(FIELD_PSDELISTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体列表标识
     */
    @JsonIgnore
    public void resetPSDEListName(){
        this.reset(FIELD_PSDELISTNAME);
    }

    /**
     * 设置 实体列表标识，详细说明：{@link #FIELD_PSDELISTNAME}
     * <P>
     * 等同 {@link #setPSDEListName}
     * @param pSDEListName
     */
    @JsonIgnore
    public PSDEListDTO psdelistname(String pSDEListName){
        this.setPSDEListName(pSDEListName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEListName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEListName(strName);
    }

    @JsonIgnore
    public PSDEListDTO name(String strName){
        this.setPSDEListName(strName);
        return this;
    }

    /**
     * <B>PSDENAME</B>&nbsp;实体，指定数据列表部件所在的实体对象
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
    public PSDEListDTO psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSDEUAGROUPID</B>&nbsp;左滑行为组，指定数据列表部件左滑操作的界面行为组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEUAGroupDTO} 
     */
    public final static String FIELD_PSDEUAGROUPID = "psdeuagroupid";

    /**
     * 设置 左滑行为组，详细说明：{@link #FIELD_PSDEUAGROUPID}
     * 
     * @param pSDEUAGroupId
     * 
     */
    @JsonProperty(FIELD_PSDEUAGROUPID)
    public void setPSDEUAGroupId(String pSDEUAGroupId){
        this.set(FIELD_PSDEUAGROUPID, pSDEUAGroupId);
    }
    
    /**
     * 获取 左滑行为组  
     * @return
     */
    @JsonIgnore
    public String getPSDEUAGroupId(){
        Object objValue = this.get(FIELD_PSDEUAGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 左滑行为组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEUAGroupIdDirty(){
        if(this.contains(FIELD_PSDEUAGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 左滑行为组
     */
    @JsonIgnore
    public void resetPSDEUAGroupId(){
        this.reset(FIELD_PSDEUAGROUPID);
    }

    /**
     * 设置 左滑行为组，详细说明：{@link #FIELD_PSDEUAGROUPID}
     * <P>
     * 等同 {@link #setPSDEUAGroupId}
     * @param pSDEUAGroupId
     */
    @JsonIgnore
    public PSDEListDTO psdeuagroupid(String pSDEUAGroupId){
        this.setPSDEUAGroupId(pSDEUAGroupId);
        return this;
    }

    /**
     * 设置 左滑行为组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEUAGroupId}
     * @param pSDEUAGroup 引用对象
     */
    @JsonIgnore
    public PSDEListDTO psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup){
        if(pSDEUAGroup == null){
            this.setPSDEUAGroupId(null);
            this.setPSDEUAGroupName(null);
        }
        else{
            this.setPSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setPSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    /**
     * <B>PSDEUAGROUPNAME</B>&nbsp;左滑行为组，指定数据列表部件左滑操作的界面行为组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEUAGROUPID}
     */
    public final static String FIELD_PSDEUAGROUPNAME = "psdeuagroupname";

    /**
     * 设置 左滑行为组，详细说明：{@link #FIELD_PSDEUAGROUPNAME}
     * 
     * @param pSDEUAGroupName
     * 
     */
    @JsonProperty(FIELD_PSDEUAGROUPNAME)
    public void setPSDEUAGroupName(String pSDEUAGroupName){
        this.set(FIELD_PSDEUAGROUPNAME, pSDEUAGroupName);
    }
    
    /**
     * 获取 左滑行为组  
     * @return
     */
    @JsonIgnore
    public String getPSDEUAGroupName(){
        Object objValue = this.get(FIELD_PSDEUAGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 左滑行为组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEUAGroupNameDirty(){
        if(this.contains(FIELD_PSDEUAGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 左滑行为组
     */
    @JsonIgnore
    public void resetPSDEUAGroupName(){
        this.reset(FIELD_PSDEUAGROUPNAME);
    }

    /**
     * 设置 左滑行为组，详细说明：{@link #FIELD_PSDEUAGROUPNAME}
     * <P>
     * 等同 {@link #setPSDEUAGroupName}
     * @param pSDEUAGroupName
     */
    @JsonIgnore
    public PSDEListDTO psdeuagroupname(String pSDEUAGroupName){
        this.setPSDEUAGroupName(pSDEUAGroupName);
        return this;
    }

    /**
     * <B>PSSYSCSSID</B>&nbsp;部件样式，指定数据列表部件的容器样式表对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysCssDTO} 
     */
    public final static String FIELD_PSSYSCSSID = "pssyscssid";

    /**
     * 设置 部件样式，详细说明：{@link #FIELD_PSSYSCSSID}
     * 
     * @param pSSysCssId
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSID)
    public void setPSSysCssId(String pSSysCssId){
        this.set(FIELD_PSSYSCSSID, pSSysCssId);
    }
    
    /**
     * 获取 部件样式  
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
     * 判断 部件样式 是否指定值，包括空值
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
     * 重置 部件样式
     */
    @JsonIgnore
    public void resetPSSysCssId(){
        this.reset(FIELD_PSSYSCSSID);
    }

    /**
     * 设置 部件样式，详细说明：{@link #FIELD_PSSYSCSSID}
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCssId
     */
    @JsonIgnore
    public PSDEListDTO pssyscssid(String pSSysCssId){
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    /**
     * 设置 部件样式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSDEListDTO pssyscssid(PSSysCssDTO pSSysCss){
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
     * <B>PSSYSCSSNAME</B>&nbsp;界面样式表，指定数据列表部件的容器样式表对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSCSSID}
     */
    public final static String FIELD_PSSYSCSSNAME = "pssyscssname";

    /**
     * 设置 界面样式表，详细说明：{@link #FIELD_PSSYSCSSNAME}
     * 
     * @param pSSysCssName
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSNAME)
    public void setPSSysCssName(String pSSysCssName){
        this.set(FIELD_PSSYSCSSNAME, pSSysCssName);
    }
    
    /**
     * 获取 界面样式表  
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
     * 判断 界面样式表 是否指定值，包括空值
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
     * 重置 界面样式表
     */
    @JsonIgnore
    public void resetPSSysCssName(){
        this.reset(FIELD_PSSYSCSSNAME);
    }

    /**
     * 设置 界面样式表，详细说明：{@link #FIELD_PSSYSCSSNAME}
     * <P>
     * 等同 {@link #setPSSysCssName}
     * @param pSSysCssName
     */
    @JsonIgnore
    public PSDEListDTO pssyscssname(String pSSysCssName){
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端扩展插件，指定实体列表使用的前端模板扩展插件，使用插件类型【列表绘制插件】
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
    public PSDEListDTO pssyspfpluginid(String pSSysPFPluginId){
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
    public PSDEListDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin){
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
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端扩展插件，指定实体列表使用的前端模板扩展插件，使用插件类型【列表绘制插件】
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
    public PSDEListDTO pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    /**
     * <B>PSSYSREQITEMID</B>&nbsp;系统设计需求
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysReqItemDTO} 
     */
    public final static String FIELD_PSSYSREQITEMID = "pssysreqitemid";

    /**
     * 设置 系统设计需求
     * 
     * @param pSSysReqItemId
     * 
     */
    @JsonProperty(FIELD_PSSYSREQITEMID)
    public void setPSSysReqItemId(String pSSysReqItemId){
        this.set(FIELD_PSSYSREQITEMID, pSSysReqItemId);
    }
    
    /**
     * 获取 系统设计需求  
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
     * 判断 系统设计需求 是否指定值，包括空值
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
     * 重置 系统设计需求
     */
    @JsonIgnore
    public void resetPSSysReqItemId(){
        this.reset(FIELD_PSSYSREQITEMID);
    }

    /**
     * 设置 系统设计需求
     * <P>
     * 等同 {@link #setPSSysReqItemId}
     * @param pSSysReqItemId
     */
    @JsonIgnore
    public PSDEListDTO pssysreqitemid(String pSSysReqItemId){
        this.setPSSysReqItemId(pSSysReqItemId);
        return this;
    }

    /**
     * 设置 系统设计需求，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysReqItemId}
     * @param pSSysReqItem 引用对象
     */
    @JsonIgnore
    public PSDEListDTO pssysreqitemid(PSSysReqItemDTO pSSysReqItem){
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
     * <B>PSSYSREQITEMNAME</B>&nbsp;系统设计需求
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSREQITEMID}
     */
    public final static String FIELD_PSSYSREQITEMNAME = "pssysreqitemname";

    /**
     * 设置 系统设计需求
     * 
     * @param pSSysReqItemName
     * 
     */
    @JsonProperty(FIELD_PSSYSREQITEMNAME)
    public void setPSSysReqItemName(String pSSysReqItemName){
        this.set(FIELD_PSSYSREQITEMNAME, pSSysReqItemName);
    }
    
    /**
     * 获取 系统设计需求  
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
     * 判断 系统设计需求 是否指定值，包括空值
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
     * 重置 系统设计需求
     */
    @JsonIgnore
    public void resetPSSysReqItemName(){
        this.reset(FIELD_PSSYSREQITEMNAME);
    }

    /**
     * 设置 系统设计需求
     * <P>
     * 等同 {@link #setPSSysReqItemName}
     * @param pSSysReqItemName
     */
    @JsonIgnore
    public PSDEListDTO pssysreqitemname(String pSSysReqItemName){
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELID</B>&nbsp;项布局面板，指定数据列表项的布局面板对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysViewPanelDTO} 
     */
    public final static String FIELD_PSSYSVIEWPANELID = "pssysviewpanelid";

    /**
     * 设置 项布局面板，详细说明：{@link #FIELD_PSSYSVIEWPANELID}
     * 
     * @param pSSysViewPanelId
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELID)
    public void setPSSysViewPanelId(String pSSysViewPanelId){
        this.set(FIELD_PSSYSVIEWPANELID, pSSysViewPanelId);
    }
    
    /**
     * 获取 项布局面板  
     * @return
     */
    @JsonIgnore
    public String getPSSysViewPanelId(){
        Object objValue = this.get(FIELD_PSSYSVIEWPANELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项布局面板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysViewPanelIdDirty(){
        if(this.contains(FIELD_PSSYSVIEWPANELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项布局面板
     */
    @JsonIgnore
    public void resetPSSysViewPanelId(){
        this.reset(FIELD_PSSYSVIEWPANELID);
    }

    /**
     * 设置 项布局面板，详细说明：{@link #FIELD_PSSYSVIEWPANELID}
     * <P>
     * 等同 {@link #setPSSysViewPanelId}
     * @param pSSysViewPanelId
     */
    @JsonIgnore
    public PSDEListDTO pssysviewpanelid(String pSSysViewPanelId){
        this.setPSSysViewPanelId(pSSysViewPanelId);
        return this;
    }

    /**
     * 设置 项布局面板，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysViewPanelId}
     * @param pSSysViewPanel 引用对象
     */
    @JsonIgnore
    public PSDEListDTO pssysviewpanelid(PSSysViewPanelDTO pSSysViewPanel){
        if(pSSysViewPanel == null){
            this.setPSSysViewPanelId(null);
            this.setPSSysViewPanelName(null);
        }
        else{
            this.setPSSysViewPanelId(pSSysViewPanel.getPSSysViewPanelId());
            this.setPSSysViewPanelName(pSSysViewPanel.getPSSysViewPanelName());
        }
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELNAME</B>&nbsp;项布局面板，指定数据列表项的布局面板对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSVIEWPANELID}
     */
    public final static String FIELD_PSSYSVIEWPANELNAME = "pssysviewpanelname";

    /**
     * 设置 项布局面板，详细说明：{@link #FIELD_PSSYSVIEWPANELNAME}
     * 
     * @param pSSysViewPanelName
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELNAME)
    public void setPSSysViewPanelName(String pSSysViewPanelName){
        this.set(FIELD_PSSYSVIEWPANELNAME, pSSysViewPanelName);
    }
    
    /**
     * 获取 项布局面板  
     * @return
     */
    @JsonIgnore
    public String getPSSysViewPanelName(){
        Object objValue = this.get(FIELD_PSSYSVIEWPANELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项布局面板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysViewPanelNameDirty(){
        if(this.contains(FIELD_PSSYSVIEWPANELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项布局面板
     */
    @JsonIgnore
    public void resetPSSysViewPanelName(){
        this.reset(FIELD_PSSYSVIEWPANELNAME);
    }

    /**
     * 设置 项布局面板，详细说明：{@link #FIELD_PSSYSVIEWPANELNAME}
     * <P>
     * 等同 {@link #setPSSysViewPanelName}
     * @param pSSysViewPanelName
     */
    @JsonIgnore
    public PSDEListDTO pssysviewpanelname(String pSSysViewPanelName){
        this.setPSSysViewPanelName(pSSysViewPanelName);
        return this;
    }

    /**
     * <B>QUICKPSDETOOLBARID</B>&nbsp;快速操作工具栏，指定数据列表部件内建的快速操作工具栏对象，快速操作工具栏一般用于新建等无选择数据的操作
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
    public PSDEListDTO quickpsdetoolbarid(String quickPSDEToolbarId){
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
    public PSDEListDTO quickpsdetoolbarid(PSDEToolbarDTO pSDEToolbar){
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
     * <B>QUICKPSDETOOLBARNAME</B>&nbsp;快速操作工具栏，指定数据列表部件内建的快速操作工具栏对象，快速操作工具栏一般用于新建等无选择数据的操作
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
    public PSDEListDTO quickpsdetoolbarname(String quickPSDEToolbarName){
        this.setQuickPSDEToolbarName(quickPSDEToolbarName);
        return this;
    }

    /**
     * <B>SHOWHEADER</B>&nbsp;显示头部，指定数据列表部件是否显示头部，未定义时为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_SHOWHEADER = "showheader";

    /**
     * 设置 显示头部，详细说明：{@link #FIELD_SHOWHEADER}
     * 
     * @param showHeader
     * 
     */
    @JsonProperty(FIELD_SHOWHEADER)
    public void setShowHeader(Integer showHeader){
        this.set(FIELD_SHOWHEADER, showHeader);
    }
    
    /**
     * 获取 显示头部  
     * @return
     */
    @JsonIgnore
    public Integer getShowHeader(){
        Object objValue = this.get(FIELD_SHOWHEADER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 显示头部 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isShowHeaderDirty(){
        if(this.contains(FIELD_SHOWHEADER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 显示头部
     */
    @JsonIgnore
    public void resetShowHeader(){
        this.reset(FIELD_SHOWHEADER);
    }

    /**
     * 设置 显示头部，详细说明：{@link #FIELD_SHOWHEADER}
     * <P>
     * 等同 {@link #setShowHeader}
     * @param showHeader
     */
    @JsonIgnore
    public PSDEListDTO showheader(Integer showHeader){
        this.setShowHeader(showHeader);
        return this;
    }

     /**
     * 设置 显示头部，详细说明：{@link #FIELD_SHOWHEADER}
     * <P>
     * 等同 {@link #setShowHeader}
     * @param showHeader
     */
    @JsonIgnore
    public PSDEListDTO showheader(Boolean showHeader){
        if(showHeader == null){
            this.setShowHeader(null);
        }
        else{
            this.setShowHeader(showHeader?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSDEListDTO updatedate(Timestamp updateDate){
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
    public PSDEListDTO updateman(String updateMan){
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
    public PSDEListDTO usertag(String userTag){
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
    public PSDEListDTO usertag2(String userTag2){
        this.setUserTag2(userTag2);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSDEListId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSDEListId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEListId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEListId(strValue);
    }

    @JsonIgnore
    public PSDEListDTO id(String strValue){
        this.setPSDEListId(strValue);
        return this;
    }


    /**
     *  实体多数据部件项 成员集合
     */
    public final static String FIELD_PSDELISTITEMS = "psdelistitems";

    private java.util.List<net.ibizsys.centralstudio.dto.PSDEListItemDTO> psdelistitems;

    /**
     * 获取 实体多数据部件项 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDELISTITEMS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEListItemDTO> getPSDEListItems(){
        return this.psdelistitems;
    }

    /**
     * 设置 实体多数据部件项 成员集合  
     * @param psdelistitems
     */
    @JsonProperty(FIELD_PSDELISTITEMS)
    public void setPSDEListItems(java.util.List<net.ibizsys.centralstudio.dto.PSDEListItemDTO> psdelistitems){
        this.psdelistitems = psdelistitems;
    }

    /**
     * 获取 实体多数据部件项 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEListItemDTO> getPSDEListItemsIf(){
        if(this.psdelistitems == null){
            this.psdelistitems = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSDEListItemDTO>();          
        }
        return this.psdelistitems;
    }


    /**
     *  实体列表逻辑 成员集合
     */
    public final static String FIELD_PSDELISTLOGICS = "psdelistlogics";

    private java.util.List<net.ibizsys.centralstudio.dto.PSDEListLogicDTO> psdelistlogics;

    /**
     * 获取 实体列表逻辑 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDELISTLOGICS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEListLogicDTO> getPSDEListLogics(){
        return this.psdelistlogics;
    }

    /**
     * 设置 实体列表逻辑 成员集合  
     * @param psdelistlogics
     */
    @JsonProperty(FIELD_PSDELISTLOGICS)
    public void setPSDEListLogics(java.util.List<net.ibizsys.centralstudio.dto.PSDEListLogicDTO> psdelistlogics){
        this.psdelistlogics = psdelistlogics;
    }

    /**
     * 获取 实体列表逻辑 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEListLogicDTO> getPSDEListLogicsIf(){
        if(this.psdelistlogics == null){
            this.psdelistlogics = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSDEListLogicDTO>();          
        }
        return this.psdelistlogics;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDEListDTO){
            PSDEListDTO dto = (PSDEListDTO)iEntity;
            dto.setPSDEListItems(this.getPSDEListItems());
            dto.setPSDEListLogics(this.getPSDEListLogics());
        }
        super.copyTo(iEntity);
    }
}
