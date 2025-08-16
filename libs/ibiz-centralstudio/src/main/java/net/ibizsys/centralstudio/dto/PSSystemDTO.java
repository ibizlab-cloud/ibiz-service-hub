package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSTEM</B>系统 模型传输对象
 * <P>
 * 开发系统的顶级模型对象，定义系统的主信息及全局默认的表现或处理逻辑
 */
public class PSSystemDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSystemDTO(){
    }      

    /**
     * <B>ACCCTRLARCH</B>&nbsp;访问控制体系，指定系统默认的访问控制体系，未定义时为【运行子系统角色体系】。实体等对象未指定值时使用此配置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.AccCtrlArch} 
     */
    public final static String FIELD_ACCCTRLARCH = "accctrlarch";

    /**
     * 设置 访问控制体系，详细说明：{@link #FIELD_ACCCTRLARCH}
     * 
     * @param accCtrlArch
     * 
     */
    @JsonProperty(FIELD_ACCCTRLARCH)
    public void setAccCtrlArch(Integer accCtrlArch){
        this.set(FIELD_ACCCTRLARCH, accCtrlArch);
    }
    
    /**
     * 获取 访问控制体系  
     * @return
     */
    @JsonIgnore
    public Integer getAccCtrlArch(){
        Object objValue = this.get(FIELD_ACCCTRLARCH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 访问控制体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAccCtrlArchDirty(){
        if(this.contains(FIELD_ACCCTRLARCH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 访问控制体系
     */
    @JsonIgnore
    public void resetAccCtrlArch(){
        this.reset(FIELD_ACCCTRLARCH);
    }

    /**
     * 设置 访问控制体系，详细说明：{@link #FIELD_ACCCTRLARCH}
     * <P>
     * 等同 {@link #setAccCtrlArch}
     * @param accCtrlArch
     */
    @JsonIgnore
    public PSSystemDTO accctrlarch(Integer accCtrlArch){
        this.setAccCtrlArch(accCtrlArch);
        return this;
    }

     /**
     * 设置 访问控制体系，详细说明：{@link #FIELD_ACCCTRLARCH}
     * <P>
     * 等同 {@link #setAccCtrlArch}
     * @param accCtrlArch
     */
    @JsonIgnore
    public PSSystemDTO accctrlarch(net.ibizsys.model.PSModelEnums.AccCtrlArch accCtrlArch){
        if(accCtrlArch == null){
            this.setAccCtrlArch(null);
        }
        else{
            this.setAccCtrlArch(accCtrlArch.value);
        }
        return this;
    }

    /**
     * <B>AUTOCALCDERER</B>&nbsp;自动计算关系附加约束，指定是否自动计算1：N关系的扩展约束逻辑，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_AUTOCALCDERER = "autocalcderer";

    /**
     * 设置 自动计算关系附加约束，详细说明：{@link #FIELD_AUTOCALCDERER}
     * 
     * @param autoCalcDERER
     * 
     */
    @JsonProperty(FIELD_AUTOCALCDERER)
    public void setAutoCalcDERER(Integer autoCalcDERER){
        this.set(FIELD_AUTOCALCDERER, autoCalcDERER);
    }
    
    /**
     * 获取 自动计算关系附加约束  
     * @return
     */
    @JsonIgnore
    public Integer getAutoCalcDERER(){
        Object objValue = this.get(FIELD_AUTOCALCDERER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 自动计算关系附加约束 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAutoCalcDERERDirty(){
        if(this.contains(FIELD_AUTOCALCDERER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自动计算关系附加约束
     */
    @JsonIgnore
    public void resetAutoCalcDERER(){
        this.reset(FIELD_AUTOCALCDERER);
    }

    /**
     * 设置 自动计算关系附加约束，详细说明：{@link #FIELD_AUTOCALCDERER}
     * <P>
     * 等同 {@link #setAutoCalcDERER}
     * @param autoCalcDERER
     */
    @JsonIgnore
    public PSSystemDTO autocalcderer(Integer autoCalcDERER){
        this.setAutoCalcDERER(autoCalcDERER);
        return this;
    }

     /**
     * 设置 自动计算关系附加约束，详细说明：{@link #FIELD_AUTOCALCDERER}
     * <P>
     * 等同 {@link #setAutoCalcDERER}
     * @param autoCalcDERER
     */
    @JsonIgnore
    public PSSystemDTO autocalcderer(Boolean autoCalcDERER){
        if(autoCalcDERER == null){
            this.setAutoCalcDERER(null);
        }
        else{
            this.setAutoCalcDERER(autoCalcDERER?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>BUGFIXS</B>&nbsp;引擎问题修复，模型引擎修复选项，为避免模型引擎在修复问题时对原有系统的影响，平台允许用户选择是否修复存在问题
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.EngineBugFix} 
     */
    public final static String FIELD_BUGFIXS = "bugfixs";

    /**
     * 设置 引擎问题修复，详细说明：{@link #FIELD_BUGFIXS}
     * 
     * @param bugFixs
     * 
     */
    @JsonProperty(FIELD_BUGFIXS)
    public void setBugFixs(Integer bugFixs){
        this.set(FIELD_BUGFIXS, bugFixs);
    }
    
    /**
     * 获取 引擎问题修复  
     * @return
     */
    @JsonIgnore
    public Integer getBugFixs(){
        Object objValue = this.get(FIELD_BUGFIXS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 引擎问题修复 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBugFixsDirty(){
        if(this.contains(FIELD_BUGFIXS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引擎问题修复
     */
    @JsonIgnore
    public void resetBugFixs(){
        this.reset(FIELD_BUGFIXS);
    }

    /**
     * 设置 引擎问题修复，详细说明：{@link #FIELD_BUGFIXS}
     * <P>
     * 等同 {@link #setBugFixs}
     * @param bugFixs
     */
    @JsonIgnore
    public PSSystemDTO bugfixs(Integer bugFixs){
        this.setBugFixs(bugFixs);
        return this;
    }

     /**
     * 设置 引擎问题修复，详细说明：{@link #FIELD_BUGFIXS}
     * <P>
     * 等同 {@link #setBugFixs}
     * @param bugFixs
     */
    @JsonIgnore
    public PSSystemDTO bugfixs(net.ibizsys.model.PSModelEnums.EngineBugFix[] bugFixs){
        if(bugFixs == null || bugFixs.length == 0){
            this.setBugFixs(null);
        }
        else{
            int _value = 0;
            for(net.ibizsys.model.PSModelEnums.EngineBugFix _item : bugFixs){
                _value |= _item.value;
            }
            this.setBugFixs(_value);
        }
        return this;
    }

    /**
     * <B>CHECKMODELVER</B>&nbsp;检查模型版本
     */
    public final static String FIELD_CHECKMODELVER = "checkmodelver";

    /**
     * 设置 检查模型版本
     * 
     * @param checkModelVer
     * 
     */
    @JsonProperty(FIELD_CHECKMODELVER)
    public void setCheckModelVer(Integer checkModelVer){
        this.set(FIELD_CHECKMODELVER, checkModelVer);
    }
    
    /**
     * 获取 检查模型版本  
     * @return
     */
    @JsonIgnore
    public Integer getCheckModelVer(){
        Object objValue = this.get(FIELD_CHECKMODELVER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 检查模型版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCheckModelVerDirty(){
        if(this.contains(FIELD_CHECKMODELVER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 检查模型版本
     */
    @JsonIgnore
    public void resetCheckModelVer(){
        this.reset(FIELD_CHECKMODELVER);
    }

    /**
     * 设置 检查模型版本
     * <P>
     * 等同 {@link #setCheckModelVer}
     * @param checkModelVer
     */
    @JsonIgnore
    public PSSystemDTO checkmodelver(Integer checkModelVer){
        this.setCheckModelVer(checkModelVer);
        return this;
    }

    /**
     * <B>CLEMPTYTEXT</B>&nbsp;代码表无值显示内容，指定全局的代码表无值显示内容，代码表对象未定义时默认使用此配置
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_CLEMPTYTEXT = "clemptytext";

    /**
     * 设置 代码表无值显示内容，详细说明：{@link #FIELD_CLEMPTYTEXT}
     * 
     * @param cLEmptyText
     * 
     */
    @JsonProperty(FIELD_CLEMPTYTEXT)
    public void setCLEmptyText(String cLEmptyText){
        this.set(FIELD_CLEMPTYTEXT, cLEmptyText);
    }
    
    /**
     * 获取 代码表无值显示内容  
     * @return
     */
    @JsonIgnore
    public String getCLEmptyText(){
        Object objValue = this.get(FIELD_CLEMPTYTEXT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码表无值显示内容 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCLEmptyTextDirty(){
        if(this.contains(FIELD_CLEMPTYTEXT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码表无值显示内容
     */
    @JsonIgnore
    public void resetCLEmptyText(){
        this.reset(FIELD_CLEMPTYTEXT);
    }

    /**
     * 设置 代码表无值显示内容，详细说明：{@link #FIELD_CLEMPTYTEXT}
     * <P>
     * 等同 {@link #setCLEmptyText}
     * @param cLEmptyText
     */
    @JsonIgnore
    public PSSystemDTO clemptytext(String cLEmptyText){
        this.setCLEmptyText(cLEmptyText);
        return this;
    }

    /**
     * <B>CLEMPTYTEXTPSLANRESID</B>&nbsp;代码表无值文本语言资源，指定全局的代码表无值文本的多语言资源对象，代码表对象未定义时默认使用此配置
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSLanguageResDTO} 
     */
    public final static String FIELD_CLEMPTYTEXTPSLANRESID = "clemptytextpslanresid";

    /**
     * 设置 代码表无值文本语言资源，详细说明：{@link #FIELD_CLEMPTYTEXTPSLANRESID}
     * 
     * @param cLEmptyTextPSLanResId
     * 
     */
    @JsonProperty(FIELD_CLEMPTYTEXTPSLANRESID)
    public void setCLEmptyTextPSLanResId(String cLEmptyTextPSLanResId){
        this.set(FIELD_CLEMPTYTEXTPSLANRESID, cLEmptyTextPSLanResId);
    }
    
    /**
     * 获取 代码表无值文本语言资源  
     * @return
     */
    @JsonIgnore
    public String getCLEmptyTextPSLanResId(){
        Object objValue = this.get(FIELD_CLEMPTYTEXTPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码表无值文本语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCLEmptyTextPSLanResIdDirty(){
        if(this.contains(FIELD_CLEMPTYTEXTPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码表无值文本语言资源
     */
    @JsonIgnore
    public void resetCLEmptyTextPSLanResId(){
        this.reset(FIELD_CLEMPTYTEXTPSLANRESID);
    }

    /**
     * 设置 代码表无值文本语言资源，详细说明：{@link #FIELD_CLEMPTYTEXTPSLANRESID}
     * <P>
     * 等同 {@link #setCLEmptyTextPSLanResId}
     * @param cLEmptyTextPSLanResId
     */
    @JsonIgnore
    public PSSystemDTO clemptytextpslanresid(String cLEmptyTextPSLanResId){
        this.setCLEmptyTextPSLanResId(cLEmptyTextPSLanResId);
        return this;
    }

    /**
     * 设置 代码表无值文本语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setCLEmptyTextPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSSystemDTO clemptytextpslanresid(PSLanguageResDTO pSLanguageRes){
        if(pSLanguageRes == null){
            this.setCLEmptyTextPSLanResId(null);
            this.setCLEmptyTextPSLanResName(null);
        }
        else{
            this.setCLEmptyTextPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setCLEmptyTextPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>CLEMPTYTEXTPSLANRESNAME</B>&nbsp;代码表无值文本语言资源，指定全局的代码表无值文本的多语言资源对象，代码表对象未定义时默认使用此配置
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CLEMPTYTEXTPSLANRESID}
     */
    public final static String FIELD_CLEMPTYTEXTPSLANRESNAME = "clemptytextpslanresname";

    /**
     * 设置 代码表无值文本语言资源，详细说明：{@link #FIELD_CLEMPTYTEXTPSLANRESNAME}
     * 
     * @param cLEmptyTextPSLanResName
     * 
     */
    @JsonProperty(FIELD_CLEMPTYTEXTPSLANRESNAME)
    public void setCLEmptyTextPSLanResName(String cLEmptyTextPSLanResName){
        this.set(FIELD_CLEMPTYTEXTPSLANRESNAME, cLEmptyTextPSLanResName);
    }
    
    /**
     * 获取 代码表无值文本语言资源  
     * @return
     */
    @JsonIgnore
    public String getCLEmptyTextPSLanResName(){
        Object objValue = this.get(FIELD_CLEMPTYTEXTPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码表无值文本语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCLEmptyTextPSLanResNameDirty(){
        if(this.contains(FIELD_CLEMPTYTEXTPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码表无值文本语言资源
     */
    @JsonIgnore
    public void resetCLEmptyTextPSLanResName(){
        this.reset(FIELD_CLEMPTYTEXTPSLANRESNAME);
    }

    /**
     * 设置 代码表无值文本语言资源，详细说明：{@link #FIELD_CLEMPTYTEXTPSLANRESNAME}
     * <P>
     * 等同 {@link #setCLEmptyTextPSLanResName}
     * @param cLEmptyTextPSLanResName
     */
    @JsonIgnore
    public PSSystemDTO clemptytextpslanresname(String cLEmptyTextPSLanResName){
        this.setCLEmptyTextPSLanResName(cLEmptyTextPSLanResName);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定系统的代码标识
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
    public PSSystemDTO codename(String codeName){
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
    public PSSystemDTO createdate(Timestamp createDate){
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
    public PSSystemDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CTRLAPPENDDEITEMS</B>&nbsp;部件附加实体默认数据项
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_CTRLAPPENDDEITEMS = "ctrlappenddeitems";

    /**
     * 设置 部件附加实体默认数据项
     * 
     * @param ctrlAppendDEItems
     * 
     */
    @JsonProperty(FIELD_CTRLAPPENDDEITEMS)
    public void setCtrlAppendDEItems(Integer ctrlAppendDEItems){
        this.set(FIELD_CTRLAPPENDDEITEMS, ctrlAppendDEItems);
    }
    
    /**
     * 获取 部件附加实体默认数据项  
     * @return
     */
    @JsonIgnore
    public Integer getCtrlAppendDEItems(){
        Object objValue = this.get(FIELD_CTRLAPPENDDEITEMS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 部件附加实体默认数据项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlAppendDEItemsDirty(){
        if(this.contains(FIELD_CTRLAPPENDDEITEMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件附加实体默认数据项
     */
    @JsonIgnore
    public void resetCtrlAppendDEItems(){
        this.reset(FIELD_CTRLAPPENDDEITEMS);
    }

    /**
     * 设置 部件附加实体默认数据项
     * <P>
     * 等同 {@link #setCtrlAppendDEItems}
     * @param ctrlAppendDEItems
     */
    @JsonIgnore
    public PSSystemDTO ctrlappenddeitems(Integer ctrlAppendDEItems){
        this.setCtrlAppendDEItems(ctrlAppendDEItems);
        return this;
    }

     /**
     * 设置 部件附加实体默认数据项
     * <P>
     * 等同 {@link #setCtrlAppendDEItems}
     * @param ctrlAppendDEItems
     */
    @JsonIgnore
    public PSSystemDTO ctrlappenddeitems(Boolean ctrlAppendDEItems){
        if(ctrlAppendDEItems == null){
            this.setCtrlAppendDEItems(null);
        }
        else{
            this.setCtrlAppendDEItems(ctrlAppendDEItems?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DBTYPES</B>&nbsp;支持数据库，指定系统支持的数据库类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DBType} 
     */
    public final static String FIELD_DBTYPES = "dbtypes";

    /**
     * 设置 支持数据库，详细说明：{@link #FIELD_DBTYPES}
     * 
     * @param dBTypes
     * 
     */
    @JsonProperty(FIELD_DBTYPES)
    public void setDBTypes(String dBTypes){
        this.set(FIELD_DBTYPES, dBTypes);
    }
    
    /**
     * 获取 支持数据库  
     * @return
     */
    @JsonIgnore
    public String getDBTypes(){
        Object objValue = this.get(FIELD_DBTYPES);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 支持数据库 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDBTypesDirty(){
        if(this.contains(FIELD_DBTYPES)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持数据库
     */
    @JsonIgnore
    public void resetDBTypes(){
        this.reset(FIELD_DBTYPES);
    }

    /**
     * 设置 支持数据库，详细说明：{@link #FIELD_DBTYPES}
     * <P>
     * 等同 {@link #setDBTypes}
     * @param dBTypes
     */
    @JsonIgnore
    public PSSystemDTO dbtypes(String dBTypes){
        this.setDBTypes(dBTypes);
        return this;
    }

     /**
     * 设置 支持数据库，详细说明：{@link #FIELD_DBTYPES}
     * <P>
     * 等同 {@link #setDBTypes}
     * @param dBTypes
     */
    @JsonIgnore
    public PSSystemDTO dbtypes(net.ibizsys.model.PSModelEnums.DBType[] dBTypes){
        if(dBTypes == null || dBTypes.length == 0){
            this.setDBTypes(null);
        }
        else{
            String _value = "";
            for(net.ibizsys.model.PSModelEnums.DBType _item : dBTypes){
                if(_value.length() > 0){
                    _value += ";";
                }
                _value += _item.value;
            }
            this.setDBTypes(_value);
        }
        return this;
    }

    /**
     * <B>DEEXPMAXROWCNT</B>&nbsp;数据导出最大记录数，指定系统默认的数据导出最大记录数，过大的导出数量会导致系统负载过重，未定义时为【1000】。实体导出等对象未指定值时使用此配置
     */
    public final static String FIELD_DEEXPMAXROWCNT = "deexpmaxrowcnt";

    /**
     * 设置 数据导出最大记录数，详细说明：{@link #FIELD_DEEXPMAXROWCNT}
     * 
     * @param dEExpMaxRowCnt
     * 
     */
    @JsonProperty(FIELD_DEEXPMAXROWCNT)
    public void setDEExpMaxRowCnt(Integer dEExpMaxRowCnt){
        this.set(FIELD_DEEXPMAXROWCNT, dEExpMaxRowCnt);
    }
    
    /**
     * 获取 数据导出最大记录数  
     * @return
     */
    @JsonIgnore
    public Integer getDEExpMaxRowCnt(){
        Object objValue = this.get(FIELD_DEEXPMAXROWCNT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 数据导出最大记录数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDEExpMaxRowCntDirty(){
        if(this.contains(FIELD_DEEXPMAXROWCNT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据导出最大记录数
     */
    @JsonIgnore
    public void resetDEExpMaxRowCnt(){
        this.reset(FIELD_DEEXPMAXROWCNT);
    }

    /**
     * 设置 数据导出最大记录数，详细说明：{@link #FIELD_DEEXPMAXROWCNT}
     * <P>
     * 等同 {@link #setDEExpMaxRowCnt}
     * @param dEExpMaxRowCnt
     */
    @JsonIgnore
    public PSSystemDTO deexpmaxrowcnt(Integer dEExpMaxRowCnt){
        this.setDEExpMaxRowCnt(dEExpMaxRowCnt);
        return this;
    }

    /**
     * <B>DEFPSSYSDEPLOYID</B>&nbsp;默认系统部署标识
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_DEFPSSYSDEPLOYID = "defpssysdeployid";

    /**
     * 设置 默认系统部署标识
     * 
     * @param dEFPSSysDeployId
     * 
     */
    @JsonProperty(FIELD_DEFPSSYSDEPLOYID)
    public void setDEFPSSysDeployId(String dEFPSSysDeployId){
        this.set(FIELD_DEFPSSYSDEPLOYID, dEFPSSysDeployId);
    }
    
    /**
     * 获取 默认系统部署标识  
     * @return
     */
    @JsonIgnore
    public String getDEFPSSysDeployId(){
        Object objValue = this.get(FIELD_DEFPSSYSDEPLOYID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认系统部署标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDEFPSSysDeployIdDirty(){
        if(this.contains(FIELD_DEFPSSYSDEPLOYID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认系统部署标识
     */
    @JsonIgnore
    public void resetDEFPSSysDeployId(){
        this.reset(FIELD_DEFPSSYSDEPLOYID);
    }

    /**
     * 设置 默认系统部署标识
     * <P>
     * 等同 {@link #setDEFPSSysDeployId}
     * @param dEFPSSysDeployId
     */
    @JsonIgnore
    public PSSystemDTO defpssysdeployid(String dEFPSSysDeployId){
        this.setDEFPSSysDeployId(dEFPSSysDeployId);
        return this;
    }

    /**
     * <B>DEFSFITEMWIDTH</B>&nbsp;属性搜索项默认宽度，属性搜索项编辑器的默认宽度，未指定时为100，此属性属于引擎修复参数
     */
    public final static String FIELD_DEFSFITEMWIDTH = "defsfitemwidth";

    /**
     * 设置 属性搜索项默认宽度，详细说明：{@link #FIELD_DEFSFITEMWIDTH}
     * 
     * @param dEFSFItemWidth
     * 
     */
    @JsonProperty(FIELD_DEFSFITEMWIDTH)
    public void setDEFSFItemWidth(Integer dEFSFItemWidth){
        this.set(FIELD_DEFSFITEMWIDTH, dEFSFItemWidth);
    }
    
    /**
     * 获取 属性搜索项默认宽度  
     * @return
     */
    @JsonIgnore
    public Integer getDEFSFItemWidth(){
        Object objValue = this.get(FIELD_DEFSFITEMWIDTH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 属性搜索项默认宽度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDEFSFItemWidthDirty(){
        if(this.contains(FIELD_DEFSFITEMWIDTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性搜索项默认宽度
     */
    @JsonIgnore
    public void resetDEFSFItemWidth(){
        this.reset(FIELD_DEFSFITEMWIDTH);
    }

    /**
     * 设置 属性搜索项默认宽度，详细说明：{@link #FIELD_DEFSFITEMWIDTH}
     * <P>
     * 等同 {@link #setDEFSFItemWidth}
     * @param dEFSFItemWidth
     */
    @JsonIgnore
    public PSSystemDTO defsfitemwidth(Integer dEFSFItemWidth){
        this.setDEFSFItemWidth(dEFSFItemWidth);
        return this;
    }

    /**
     * <B>DEFSORTMODE</B>&nbsp;属性默认排序，系统默认实体属性的排序方式，再未指定属性排序值或排序值相同的情况使用该策略，默认为【属性名称】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DEFSortMode} 
     */
    public final static String FIELD_DEFSORTMODE = "defsortmode";

    /**
     * 设置 属性默认排序，详细说明：{@link #FIELD_DEFSORTMODE}
     * 
     * @param dEFSortMode
     * 
     */
    @JsonProperty(FIELD_DEFSORTMODE)
    public void setDEFSortMode(String dEFSortMode){
        this.set(FIELD_DEFSORTMODE, dEFSortMode);
    }
    
    /**
     * 获取 属性默认排序  
     * @return
     */
    @JsonIgnore
    public String getDEFSortMode(){
        Object objValue = this.get(FIELD_DEFSORTMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性默认排序 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDEFSortModeDirty(){
        if(this.contains(FIELD_DEFSORTMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性默认排序
     */
    @JsonIgnore
    public void resetDEFSortMode(){
        this.reset(FIELD_DEFSORTMODE);
    }

    /**
     * 设置 属性默认排序，详细说明：{@link #FIELD_DEFSORTMODE}
     * <P>
     * 等同 {@link #setDEFSortMode}
     * @param dEFSortMode
     */
    @JsonIgnore
    public PSSystemDTO defsortmode(String dEFSortMode){
        this.setDEFSortMode(dEFSortMode);
        return this;
    }

     /**
     * 设置 属性默认排序，详细说明：{@link #FIELD_DEFSORTMODE}
     * <P>
     * 等同 {@link #setDEFSortMode}
     * @param dEFSortMode
     */
    @JsonIgnore
    public PSSystemDTO defsortmode(net.ibizsys.model.PSModelEnums.DEFSortMode dEFSortMode){
        if(dEFSortMode == null){
            this.setDEFSortMode(null);
        }
        else{
            this.setDEFSortMode(dEFSortMode.value);
        }
        return this;
    }

    /**
     * <B>DEMSACTIONLOGICFLAG</B>&nbsp;实体主状态行为控制模式，启用主状态的实体会对行为注入的相应的限制逻辑，控制模式是指注入逻辑的方式，当前定义实体默认的控制模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DEMSActionLogicMode} 
     */
    public final static String FIELD_DEMSACTIONLOGICFLAG = "demsactionlogicflag";

    /**
     * 设置 实体主状态行为控制模式，详细说明：{@link #FIELD_DEMSACTIONLOGICFLAG}
     * 
     * @param dEMSActionLogicFlag
     * 
     */
    @JsonProperty(FIELD_DEMSACTIONLOGICFLAG)
    public void setDEMSActionLogicFlag(Integer dEMSActionLogicFlag){
        this.set(FIELD_DEMSACTIONLOGICFLAG, dEMSActionLogicFlag);
    }
    
    /**
     * 获取 实体主状态行为控制模式  
     * @return
     */
    @JsonIgnore
    public Integer getDEMSActionLogicFlag(){
        Object objValue = this.get(FIELD_DEMSACTIONLOGICFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 实体主状态行为控制模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDEMSActionLogicFlagDirty(){
        if(this.contains(FIELD_DEMSACTIONLOGICFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体主状态行为控制模式
     */
    @JsonIgnore
    public void resetDEMSActionLogicFlag(){
        this.reset(FIELD_DEMSACTIONLOGICFLAG);
    }

    /**
     * 设置 实体主状态行为控制模式，详细说明：{@link #FIELD_DEMSACTIONLOGICFLAG}
     * <P>
     * 等同 {@link #setDEMSActionLogicFlag}
     * @param dEMSActionLogicFlag
     */
    @JsonIgnore
    public PSSystemDTO demsactionlogicflag(Integer dEMSActionLogicFlag){
        this.setDEMSActionLogicFlag(dEMSActionLogicFlag);
        return this;
    }

     /**
     * 设置 实体主状态行为控制模式，详细说明：{@link #FIELD_DEMSACTIONLOGICFLAG}
     * <P>
     * 等同 {@link #setDEMSActionLogicFlag}
     * @param dEMSActionLogicFlag
     */
    @JsonIgnore
    public PSSystemDTO demsactionlogicflag(net.ibizsys.model.PSModelEnums.DEMSActionLogicMode dEMSActionLogicFlag){
        if(dEMSActionLogicFlag == null){
            this.setDEMSActionLogicFlag(null);
        }
        else{
            this.setDEMSActionLogicFlag(dEMSActionLogicFlag.value);
        }
        return this;
    }

    /**
     * <B>DOMAINNAME</B>&nbsp;应用中心域名称
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVCENTERID}
     */
    public final static String FIELD_DOMAINNAME = "domainname";

    /**
     * 设置 应用中心域名称
     * 
     * @param domainName
     * 
     */
    @JsonProperty(FIELD_DOMAINNAME)
    public void setDomainName(String domainName){
        this.set(FIELD_DOMAINNAME, domainName);
    }
    
    /**
     * 获取 应用中心域名称  
     * @return
     */
    @JsonIgnore
    public String getDomainName(){
        Object objValue = this.get(FIELD_DOMAINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用中心域名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDomainNameDirty(){
        if(this.contains(FIELD_DOMAINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用中心域名称
     */
    @JsonIgnore
    public void resetDomainName(){
        this.reset(FIELD_DOMAINNAME);
    }

    /**
     * 设置 应用中心域名称
     * <P>
     * 等同 {@link #setDomainName}
     * @param domainName
     */
    @JsonIgnore
    public PSSystemDTO domainname(String domainName){
        this.setDomainName(domainName);
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
    public PSSystemDTO dtoformat(String dTOFormat){
        this.setDTOFormat(dTOFormat);
        return this;
    }

    /**
     * <B>ENABLEDBVALUEMODE</B>&nbsp;启用数据库值插入更新模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEDBVALUEMODE = "enabledbvaluemode";

    /**
     * 设置 启用数据库值插入更新模式
     * 
     * @param enableDBValueMode
     * 
     */
    @JsonProperty(FIELD_ENABLEDBVALUEMODE)
    public void setEnableDBValueMode(Integer enableDBValueMode){
        this.set(FIELD_ENABLEDBVALUEMODE, enableDBValueMode);
    }
    
    /**
     * 获取 启用数据库值插入更新模式  
     * @return
     */
    @JsonIgnore
    public Integer getEnableDBValueMode(){
        Object objValue = this.get(FIELD_ENABLEDBVALUEMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用数据库值插入更新模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableDBValueModeDirty(){
        if(this.contains(FIELD_ENABLEDBVALUEMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用数据库值插入更新模式
     */
    @JsonIgnore
    public void resetEnableDBValueMode(){
        this.reset(FIELD_ENABLEDBVALUEMODE);
    }

    /**
     * 设置 启用数据库值插入更新模式
     * <P>
     * 等同 {@link #setEnableDBValueMode}
     * @param enableDBValueMode
     */
    @JsonIgnore
    public PSSystemDTO enabledbvaluemode(Integer enableDBValueMode){
        this.setEnableDBValueMode(enableDBValueMode);
        return this;
    }

     /**
     * 设置 启用数据库值插入更新模式
     * <P>
     * 等同 {@link #setEnableDBValueMode}
     * @param enableDBValueMode
     */
    @JsonIgnore
    public PSSystemDTO enabledbvaluemode(Boolean enableDBValueMode){
        if(enableDBValueMode == null){
            this.setEnableDBValueMode(null);
        }
        else{
            this.setEnableDBValueMode(enableDBValueMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEDEDATAVER</B>&nbsp;启用数据版本
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEDEDATAVER = "enablededataver";

    /**
     * 设置 启用数据版本
     * 
     * @param enableDEDataVer
     * 
     */
    @JsonProperty(FIELD_ENABLEDEDATAVER)
    public void setEnableDEDataVer(Integer enableDEDataVer){
        this.set(FIELD_ENABLEDEDATAVER, enableDEDataVer);
    }
    
    /**
     * 获取 启用数据版本  
     * @return
     */
    @JsonIgnore
    public Integer getEnableDEDataVer(){
        Object objValue = this.get(FIELD_ENABLEDEDATAVER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用数据版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableDEDataVerDirty(){
        if(this.contains(FIELD_ENABLEDEDATAVER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用数据版本
     */
    @JsonIgnore
    public void resetEnableDEDataVer(){
        this.reset(FIELD_ENABLEDEDATAVER);
    }

    /**
     * 设置 启用数据版本
     * <P>
     * 等同 {@link #setEnableDEDataVer}
     * @param enableDEDataVer
     */
    @JsonIgnore
    public PSSystemDTO enablededataver(Integer enableDEDataVer){
        this.setEnableDEDataVer(enableDEDataVer);
        return this;
    }

     /**
     * 设置 启用数据版本
     * <P>
     * 等同 {@link #setEnableDEDataVer}
     * @param enableDEDataVer
     */
    @JsonIgnore
    public PSSystemDTO enablededataver(Boolean enableDEDataVer){
        if(enableDEDataVer == null){
            this.setEnableDEDataVer(null);
        }
        else{
            this.setEnableDEDataVer(enableDEDataVer?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEDEFRESTRICTEDUI</B>&nbsp;启用属性限定界面逻辑，指定是否启用属性的限定界面逻辑，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEDEFRESTRICTEDUI = "enabledefrestrictedui";

    /**
     * 设置 启用属性限定界面逻辑，详细说明：{@link #FIELD_ENABLEDEFRESTRICTEDUI}
     * 
     * @param enableDEFRestrictedUI
     * 
     */
    @JsonProperty(FIELD_ENABLEDEFRESTRICTEDUI)
    public void setEnableDEFRestrictedUI(Integer enableDEFRestrictedUI){
        this.set(FIELD_ENABLEDEFRESTRICTEDUI, enableDEFRestrictedUI);
    }
    
    /**
     * 获取 启用属性限定界面逻辑  
     * @return
     */
    @JsonIgnore
    public Integer getEnableDEFRestrictedUI(){
        Object objValue = this.get(FIELD_ENABLEDEFRESTRICTEDUI);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用属性限定界面逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableDEFRestrictedUIDirty(){
        if(this.contains(FIELD_ENABLEDEFRESTRICTEDUI)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用属性限定界面逻辑
     */
    @JsonIgnore
    public void resetEnableDEFRestrictedUI(){
        this.reset(FIELD_ENABLEDEFRESTRICTEDUI);
    }

    /**
     * 设置 启用属性限定界面逻辑，详细说明：{@link #FIELD_ENABLEDEFRESTRICTEDUI}
     * <P>
     * 等同 {@link #setEnableDEFRestrictedUI}
     * @param enableDEFRestrictedUI
     */
    @JsonIgnore
    public PSSystemDTO enabledefrestrictedui(Integer enableDEFRestrictedUI){
        this.setEnableDEFRestrictedUI(enableDEFRestrictedUI);
        return this;
    }

     /**
     * 设置 启用属性限定界面逻辑，详细说明：{@link #FIELD_ENABLEDEFRESTRICTEDUI}
     * <P>
     * 等同 {@link #setEnableDEFRestrictedUI}
     * @param enableDEFRestrictedUI
     */
    @JsonIgnore
    public PSSystemDTO enabledefrestrictedui(Boolean enableDEFRestrictedUI){
        if(enableDEFRestrictedUI == null){
            this.setEnableDEFRestrictedUI(null);
        }
        else{
            this.setEnableDEFRestrictedUI(enableDEFRestrictedUI?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEDERFKEY</B>&nbsp;关系默认启用外键，指定系统实体1：N关系是否默认启用外键，未定义时为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEDERFKEY = "enablederfkey";

    /**
     * 设置 关系默认启用外键，详细说明：{@link #FIELD_ENABLEDERFKEY}
     * 
     * @param enableDERFKey
     * 
     */
    @JsonProperty(FIELD_ENABLEDERFKEY)
    public void setEnableDERFKey(Integer enableDERFKey){
        this.set(FIELD_ENABLEDERFKEY, enableDERFKey);
    }
    
    /**
     * 获取 关系默认启用外键  
     * @return
     */
    @JsonIgnore
    public Integer getEnableDERFKey(){
        Object objValue = this.get(FIELD_ENABLEDERFKEY);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 关系默认启用外键 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableDERFKeyDirty(){
        if(this.contains(FIELD_ENABLEDERFKEY)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系默认启用外键
     */
    @JsonIgnore
    public void resetEnableDERFKey(){
        this.reset(FIELD_ENABLEDERFKEY);
    }

    /**
     * 设置 关系默认启用外键，详细说明：{@link #FIELD_ENABLEDERFKEY}
     * <P>
     * 等同 {@link #setEnableDERFKey}
     * @param enableDERFKey
     */
    @JsonIgnore
    public PSSystemDTO enablederfkey(Integer enableDERFKey){
        this.setEnableDERFKey(enableDERFKey);
        return this;
    }

     /**
     * 设置 关系默认启用外键，详细说明：{@link #FIELD_ENABLEDERFKEY}
     * <P>
     * 等同 {@link #setEnableDERFKey}
     * @param enableDERFKey
     */
    @JsonIgnore
    public PSSystemDTO enablederfkey(Boolean enableDERFKey){
        if(enableDERFKey == null){
            this.setEnableDERFKey(null);
        }
        else{
            this.setEnableDERFKey(enableDERFKey?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEMULTILAN</B>&nbsp;支持多语言，指定系统是否启用多语言支持，默认为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEMULTILAN = "enablemultilan";

    /**
     * 设置 支持多语言，详细说明：{@link #FIELD_ENABLEMULTILAN}
     * 
     * @param enableMultiLan
     * 
     */
    @JsonProperty(FIELD_ENABLEMULTILAN)
    public void setEnableMultiLan(Integer enableMultiLan){
        this.set(FIELD_ENABLEMULTILAN, enableMultiLan);
    }
    
    /**
     * 获取 支持多语言  
     * @return
     */
    @JsonIgnore
    public Integer getEnableMultiLan(){
        Object objValue = this.get(FIELD_ENABLEMULTILAN);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持多语言 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableMultiLanDirty(){
        if(this.contains(FIELD_ENABLEMULTILAN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持多语言
     */
    @JsonIgnore
    public void resetEnableMultiLan(){
        this.reset(FIELD_ENABLEMULTILAN);
    }

    /**
     * 设置 支持多语言，详细说明：{@link #FIELD_ENABLEMULTILAN}
     * <P>
     * 等同 {@link #setEnableMultiLan}
     * @param enableMultiLan
     */
    @JsonIgnore
    public PSSystemDTO enablemultilan(Integer enableMultiLan){
        this.setEnableMultiLan(enableMultiLan);
        return this;
    }

     /**
     * 设置 支持多语言，详细说明：{@link #FIELD_ENABLEMULTILAN}
     * <P>
     * 等同 {@link #setEnableMultiLan}
     * @param enableMultiLan
     */
    @JsonIgnore
    public PSSystemDTO enablemultilan(Boolean enableMultiLan){
        if(enableMultiLan == null){
            this.setEnableMultiLan(null);
        }
        else{
            this.setEnableMultiLan(enableMultiLan?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEOPNAMEMODEL</B>&nbsp;启用操作者名称模型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEOPNAMEMODEL = "enableopnamemodel";

    /**
     * 设置 启用操作者名称模型
     * 
     * @param enableOPNameModel
     * 
     */
    @JsonProperty(FIELD_ENABLEOPNAMEMODEL)
    public void setEnableOPNameModel(Integer enableOPNameModel){
        this.set(FIELD_ENABLEOPNAMEMODEL, enableOPNameModel);
    }
    
    /**
     * 获取 启用操作者名称模型  
     * @return
     */
    @JsonIgnore
    public Integer getEnableOPNameModel(){
        Object objValue = this.get(FIELD_ENABLEOPNAMEMODEL);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用操作者名称模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableOPNameModelDirty(){
        if(this.contains(FIELD_ENABLEOPNAMEMODEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用操作者名称模型
     */
    @JsonIgnore
    public void resetEnableOPNameModel(){
        this.reset(FIELD_ENABLEOPNAMEMODEL);
    }

    /**
     * 设置 启用操作者名称模型
     * <P>
     * 等同 {@link #setEnableOPNameModel}
     * @param enableOPNameModel
     */
    @JsonIgnore
    public PSSystemDTO enableopnamemodel(Integer enableOPNameModel){
        this.setEnableOPNameModel(enableOPNameModel);
        return this;
    }

     /**
     * 设置 启用操作者名称模型
     * <P>
     * 等同 {@link #setEnableOPNameModel}
     * @param enableOPNameModel
     */
    @JsonIgnore
    public PSSystemDTO enableopnamemodel(Boolean enableOPNameModel){
        if(enableOPNameModel == null){
            this.setEnableOPNameModel(null);
        }
        else{
            this.setEnableOPNameModel(enableOPNameModel?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENADEFLANRESCONTENT</B>&nbsp;启用默认语言资源内容，指定是否启用语言资源默认内容，默认为【是】，语言资源的默认内容将在未找到目标语种定义时使用
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENADEFLANRESCONTENT = "enadeflanrescontent";

    /**
     * 设置 启用默认语言资源内容，详细说明：{@link #FIELD_ENADEFLANRESCONTENT}
     * 
     * @param enaDefLanResContent
     * 
     */
    @JsonProperty(FIELD_ENADEFLANRESCONTENT)
    public void setEnaDefLanResContent(Integer enaDefLanResContent){
        this.set(FIELD_ENADEFLANRESCONTENT, enaDefLanResContent);
    }
    
    /**
     * 获取 启用默认语言资源内容  
     * @return
     */
    @JsonIgnore
    public Integer getEnaDefLanResContent(){
        Object objValue = this.get(FIELD_ENADEFLANRESCONTENT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用默认语言资源内容 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnaDefLanResContentDirty(){
        if(this.contains(FIELD_ENADEFLANRESCONTENT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用默认语言资源内容
     */
    @JsonIgnore
    public void resetEnaDefLanResContent(){
        this.reset(FIELD_ENADEFLANRESCONTENT);
    }

    /**
     * 设置 启用默认语言资源内容，详细说明：{@link #FIELD_ENADEFLANRESCONTENT}
     * <P>
     * 等同 {@link #setEnaDefLanResContent}
     * @param enaDefLanResContent
     */
    @JsonIgnore
    public PSSystemDTO enadeflanrescontent(Integer enaDefLanResContent){
        this.setEnaDefLanResContent(enaDefLanResContent);
        return this;
    }

     /**
     * 设置 启用默认语言资源内容，详细说明：{@link #FIELD_ENADEFLANRESCONTENT}
     * <P>
     * 等同 {@link #setEnaDefLanResContent}
     * @param enaDefLanResContent
     */
    @JsonIgnore
    public PSSystemDTO enadeflanrescontent(Boolean enaDefLanResContent){
        if(enaDefLanResContent == null){
            this.setEnaDefLanResContent(null);
        }
        else{
            this.setEnaDefLanResContent(enaDefLanResContent?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>INITDEDEFAULT</B>&nbsp;默认初始化实体，指定建立实体时是否默认进行初始化操作，初始化操作将自动产生默认属性、界面等对象。未定义时为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_INITDEDEFAULT = "initdedefault";

    /**
     * 设置 默认初始化实体，详细说明：{@link #FIELD_INITDEDEFAULT}
     * 
     * @param initDEDefault
     * 
     */
    @JsonProperty(FIELD_INITDEDEFAULT)
    public void setInitDEDefault(Integer initDEDefault){
        this.set(FIELD_INITDEDEFAULT, initDEDefault);
    }
    
    /**
     * 获取 默认初始化实体  
     * @return
     */
    @JsonIgnore
    public Integer getInitDEDefault(){
        Object objValue = this.get(FIELD_INITDEDEFAULT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认初始化实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isInitDEDefaultDirty(){
        if(this.contains(FIELD_INITDEDEFAULT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认初始化实体
     */
    @JsonIgnore
    public void resetInitDEDefault(){
        this.reset(FIELD_INITDEDEFAULT);
    }

    /**
     * 设置 默认初始化实体，详细说明：{@link #FIELD_INITDEDEFAULT}
     * <P>
     * 等同 {@link #setInitDEDefault}
     * @param initDEDefault
     */
    @JsonIgnore
    public PSSystemDTO initdedefault(Integer initDEDefault){
        this.setInitDEDefault(initDEDefault);
        return this;
    }

     /**
     * 设置 默认初始化实体，详细说明：{@link #FIELD_INITDEDEFAULT}
     * <P>
     * 等同 {@link #setInitDEDefault}
     * @param initDEDefault
     */
    @JsonIgnore
    public PSSystemDTO initdedefault(Boolean initDEDefault){
        if(initDEDefault == null){
            this.setInitDEDefault(null);
        }
        else{
            this.setInitDEDefault(initDEDefault?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>LANRESMAXTAG</B>&nbsp;语言资源当前计数
     */
    public final static String FIELD_LANRESMAXTAG = "lanresmaxtag";

    /**
     * 设置 语言资源当前计数
     * 
     * @param lanResMaxTag
     * 
     */
    @JsonProperty(FIELD_LANRESMAXTAG)
    public void setLanResMaxTag(Integer lanResMaxTag){
        this.set(FIELD_LANRESMAXTAG, lanResMaxTag);
    }
    
    /**
     * 获取 语言资源当前计数  
     * @return
     */
    @JsonIgnore
    public Integer getLanResMaxTag(){
        Object objValue = this.get(FIELD_LANRESMAXTAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 语言资源当前计数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLanResMaxTagDirty(){
        if(this.contains(FIELD_LANRESMAXTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 语言资源当前计数
     */
    @JsonIgnore
    public void resetLanResMaxTag(){
        this.reset(FIELD_LANRESMAXTAG);
    }

    /**
     * 设置 语言资源当前计数
     * <P>
     * 等同 {@link #setLanResMaxTag}
     * @param lanResMaxTag
     */
    @JsonIgnore
    public PSSystemDTO lanresmaxtag(Integer lanResMaxTag){
        this.setLanResMaxTag(lanResMaxTag);
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;中文名称，指定系统的逻辑名称
     * <P>
     * 字符串：最大长度 200
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
    public PSSystemDTO logicname(String logicName){
        this.setLogicName(logicName);
        return this;
    }

    /**
     * <B>LOWCODEMODE</B>&nbsp;低代码模式
     */
    public final static String FIELD_LOWCODEMODE = "lowcodemode";

    /**
     * 设置 低代码模式
     * 
     * @param lowCodeMode
     * 
     */
    @JsonProperty(FIELD_LOWCODEMODE)
    public void setLowCodeMode(Integer lowCodeMode){
        this.set(FIELD_LOWCODEMODE, lowCodeMode);
    }
    
    /**
     * 获取 低代码模式  
     * @return
     */
    @JsonIgnore
    public Integer getLowCodeMode(){
        Object objValue = this.get(FIELD_LOWCODEMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 低代码模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLowCodeModeDirty(){
        if(this.contains(FIELD_LOWCODEMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 低代码模式
     */
    @JsonIgnore
    public void resetLowCodeMode(){
        this.reset(FIELD_LOWCODEMODE);
    }

    /**
     * 设置 低代码模式
     * <P>
     * 等同 {@link #setLowCodeMode}
     * @param lowCodeMode
     */
    @JsonIgnore
    public PSSystemDTO lowcodemode(Integer lowCodeMode){
        this.setLowCodeMode(lowCodeMode);
        return this;
    }

    /**
     * <B>LOWCODEOPTION</B>&nbsp;低代码配置
     */
    public final static String FIELD_LOWCODEOPTION = "lowcodeoption";

    /**
     * 设置 低代码配置
     * 
     * @param lowCodeOption
     * 
     */
    @JsonProperty(FIELD_LOWCODEOPTION)
    public void setLowCodeOption(String lowCodeOption){
        this.set(FIELD_LOWCODEOPTION, lowCodeOption);
    }
    
    /**
     * 获取 低代码配置  
     * @return
     */
    @JsonIgnore
    public String getLowCodeOption(){
        Object objValue = this.get(FIELD_LOWCODEOPTION);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 低代码配置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLowCodeOptionDirty(){
        if(this.contains(FIELD_LOWCODEOPTION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 低代码配置
     */
    @JsonIgnore
    public void resetLowCodeOption(){
        this.reset(FIELD_LOWCODEOPTION);
    }

    /**
     * 设置 低代码配置
     * <P>
     * 等同 {@link #setLowCodeOption}
     * @param lowCodeOption
     */
    @JsonIgnore
    public PSSystemDTO lowcodeoption(String lowCodeOption){
        this.setLowCodeOption(lowCodeOption);
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
    public PSSystemDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MODELV2EXPMODE</B>&nbsp;模型导出模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.ModelV2ExpMode} 
     */
    public final static String FIELD_MODELV2EXPMODE = "modelv2expmode";

    /**
     * 设置 模型导出模式
     * 
     * @param modelV2ExpMode
     * 
     */
    @JsonProperty(FIELD_MODELV2EXPMODE)
    public void setModelV2ExpMode(Integer modelV2ExpMode){
        this.set(FIELD_MODELV2EXPMODE, modelV2ExpMode);
    }
    
    /**
     * 获取 模型导出模式  
     * @return
     */
    @JsonIgnore
    public Integer getModelV2ExpMode(){
        Object objValue = this.get(FIELD_MODELV2EXPMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 模型导出模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isModelV2ExpModeDirty(){
        if(this.contains(FIELD_MODELV2EXPMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模型导出模式
     */
    @JsonIgnore
    public void resetModelV2ExpMode(){
        this.reset(FIELD_MODELV2EXPMODE);
    }

    /**
     * 设置 模型导出模式
     * <P>
     * 等同 {@link #setModelV2ExpMode}
     * @param modelV2ExpMode
     */
    @JsonIgnore
    public PSSystemDTO modelv2expmode(Integer modelV2ExpMode){
        this.setModelV2ExpMode(modelV2ExpMode);
        return this;
    }

     /**
     * 设置 模型导出模式
     * <P>
     * 等同 {@link #setModelV2ExpMode}
     * @param modelV2ExpMode
     */
    @JsonIgnore
    public PSSystemDTO modelv2expmode(net.ibizsys.model.PSModelEnums.ModelV2ExpMode[] modelV2ExpMode){
        if(modelV2ExpMode == null || modelV2ExpMode.length == 0){
            this.setModelV2ExpMode(null);
        }
        else{
            int _value = 0;
            for(net.ibizsys.model.PSModelEnums.ModelV2ExpMode _item : modelV2ExpMode){
                _value |= _item.value;
            }
            this.setModelV2ExpMode(_value);
        }
        return this;
    }

    /**
     * <B>NOVIEWMODE</B>&nbsp;无视图模式，指定系统实体默认是否不通过视图（VIEW）的方式访问数据库数据，默认为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_NOVIEWMODE = "noviewmode";

    /**
     * 设置 无视图模式，详细说明：{@link #FIELD_NOVIEWMODE}
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
     * 设置 无视图模式，详细说明：{@link #FIELD_NOVIEWMODE}
     * <P>
     * 等同 {@link #setNoViewMode}
     * @param noViewMode
     */
    @JsonIgnore
    public PSSystemDTO noviewmode(Integer noViewMode){
        this.setNoViewMode(noViewMode);
        return this;
    }

     /**
     * 设置 无视图模式，详细说明：{@link #FIELD_NOVIEWMODE}
     * <P>
     * 等同 {@link #setNoViewMode}
     * @param noViewMode
     */
    @JsonIgnore
    public PSSystemDTO noviewmode(Boolean noViewMode){
        if(noViewMode == null){
            this.setNoViewMode(null);
        }
        else{
            this.setNoViewMode(noViewMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>PIAUTOSHOWCAPTION</B>&nbsp;面板项自动显示标题
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_PIAUTOSHOWCAPTION = "piautoshowcaption";

    /**
     * 设置 面板项自动显示标题
     * 
     * @param pIAutoShowCaption
     * 
     */
    @JsonProperty(FIELD_PIAUTOSHOWCAPTION)
    public void setPIAutoShowCaption(Integer pIAutoShowCaption){
        this.set(FIELD_PIAUTOSHOWCAPTION, pIAutoShowCaption);
    }
    
    /**
     * 获取 面板项自动显示标题  
     * @return
     */
    @JsonIgnore
    public Integer getPIAutoShowCaption(){
        Object objValue = this.get(FIELD_PIAUTOSHOWCAPTION);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 面板项自动显示标题 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPIAutoShowCaptionDirty(){
        if(this.contains(FIELD_PIAUTOSHOWCAPTION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板项自动显示标题
     */
    @JsonIgnore
    public void resetPIAutoShowCaption(){
        this.reset(FIELD_PIAUTOSHOWCAPTION);
    }

    /**
     * 设置 面板项自动显示标题
     * <P>
     * 等同 {@link #setPIAutoShowCaption}
     * @param pIAutoShowCaption
     */
    @JsonIgnore
    public PSSystemDTO piautoshowcaption(Integer pIAutoShowCaption){
        this.setPIAutoShowCaption(pIAutoShowCaption);
        return this;
    }

     /**
     * 设置 面板项自动显示标题
     * <P>
     * 等同 {@link #setPIAutoShowCaption}
     * @param pIAutoShowCaption
     */
    @JsonIgnore
    public PSSystemDTO piautoshowcaption(Boolean pIAutoShowCaption){
        if(pIAutoShowCaption == null){
            this.setPIAutoShowCaption(null);
        }
        else{
            this.setPIAutoShowCaption(pIAutoShowCaption?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>PSLANGUAGEID</B>&nbsp;系统默认语言，指定系统的默认语言，默认为【中文】，标识为【ZH_CN】
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSLanguageDTO} 
     */
    public final static String FIELD_PSLANGUAGEID = "pslanguageid";

    /**
     * 设置 系统默认语言，详细说明：{@link #FIELD_PSLANGUAGEID}
     * 
     * @param pSLanguageId
     * 
     */
    @JsonProperty(FIELD_PSLANGUAGEID)
    public void setPSLanguageId(String pSLanguageId){
        this.set(FIELD_PSLANGUAGEID, pSLanguageId);
    }
    
    /**
     * 获取 系统默认语言  
     * @return
     */
    @JsonIgnore
    public String getPSLanguageId(){
        Object objValue = this.get(FIELD_PSLANGUAGEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统默认语言 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSLanguageIdDirty(){
        if(this.contains(FIELD_PSLANGUAGEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统默认语言
     */
    @JsonIgnore
    public void resetPSLanguageId(){
        this.reset(FIELD_PSLANGUAGEID);
    }

    /**
     * 设置 系统默认语言，详细说明：{@link #FIELD_PSLANGUAGEID}
     * <P>
     * 等同 {@link #setPSLanguageId}
     * @param pSLanguageId
     */
    @JsonIgnore
    public PSSystemDTO pslanguageid(String pSLanguageId){
        this.setPSLanguageId(pSLanguageId);
        return this;
    }

    /**
     * 设置 系统默认语言，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSLanguageId}
     * @param pSLanguage 引用对象
     */
    @JsonIgnore
    public PSSystemDTO pslanguageid(PSLanguageDTO pSLanguage){
        if(pSLanguage == null){
            this.setPSLanguageId(null);
            this.setPSLanguageName(null);
        }
        else{
            this.setPSLanguageId(pSLanguage.getPSLanguageId());
            this.setPSLanguageName(pSLanguage.getPSLanguageName());
        }
        return this;
    }

    /**
     * <B>PSLANGUAGENAME</B>&nbsp;系统默认语言，指定系统的默认语言，默认为【中文】，标识为【ZH_CN】
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSLANGUAGEID}
     */
    public final static String FIELD_PSLANGUAGENAME = "pslanguagename";

    /**
     * 设置 系统默认语言，详细说明：{@link #FIELD_PSLANGUAGENAME}
     * 
     * @param pSLanguageName
     * 
     */
    @JsonProperty(FIELD_PSLANGUAGENAME)
    public void setPSLanguageName(String pSLanguageName){
        this.set(FIELD_PSLANGUAGENAME, pSLanguageName);
    }
    
    /**
     * 获取 系统默认语言  
     * @return
     */
    @JsonIgnore
    public String getPSLanguageName(){
        Object objValue = this.get(FIELD_PSLANGUAGENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统默认语言 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSLanguageNameDirty(){
        if(this.contains(FIELD_PSLANGUAGENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统默认语言
     */
    @JsonIgnore
    public void resetPSLanguageName(){
        this.reset(FIELD_PSLANGUAGENAME);
    }

    /**
     * 设置 系统默认语言，详细说明：{@link #FIELD_PSLANGUAGENAME}
     * <P>
     * 等同 {@link #setPSLanguageName}
     * @param pSLanguageName
     */
    @JsonIgnore
    public PSSystemDTO pslanguagename(String pSLanguageName){
        this.setPSLanguageName(pSLanguageName);
        return this;
    }

    /**
     * <B>PSSFID</B>&nbsp;后台技术架构，指定系统使用后台技术架
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSFID = "pssfid";

    /**
     * 设置 后台技术架构，详细说明：{@link #FIELD_PSSFID}
     * 
     * @param pSSFId
     * 
     */
    @JsonProperty(FIELD_PSSFID)
    public void setPSSFId(String pSSFId){
        this.set(FIELD_PSSFID, pSSFId);
    }
    
    /**
     * 获取 后台技术架构  
     * @return
     */
    @JsonIgnore
    public String getPSSFId(){
        Object objValue = this.get(FIELD_PSSFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台技术架构 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSFIdDirty(){
        if(this.contains(FIELD_PSSFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台技术架构
     */
    @JsonIgnore
    public void resetPSSFId(){
        this.reset(FIELD_PSSFID);
    }

    /**
     * 设置 后台技术架构，详细说明：{@link #FIELD_PSSFID}
     * <P>
     * 等同 {@link #setPSSFId}
     * @param pSSFId
     */
    @JsonIgnore
    public PSSystemDTO pssfid(String pSSFId){
        this.setPSSFId(pSSFId);
        return this;
    }

    /**
     * <B>PSSFNAME</B>&nbsp;后台技术架构，指定系统使用后台技术架
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSFID}
     */
    public final static String FIELD_PSSFNAME = "pssfname";

    /**
     * 设置 后台技术架构，详细说明：{@link #FIELD_PSSFNAME}
     * 
     * @param pSSFName
     * 
     */
    @JsonProperty(FIELD_PSSFNAME)
    public void setPSSFName(String pSSFName){
        this.set(FIELD_PSSFNAME, pSSFName);
    }
    
    /**
     * 获取 后台技术架构  
     * @return
     */
    @JsonIgnore
    public String getPSSFName(){
        Object objValue = this.get(FIELD_PSSFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台技术架构 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSFNameDirty(){
        if(this.contains(FIELD_PSSFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台技术架构
     */
    @JsonIgnore
    public void resetPSSFName(){
        this.reset(FIELD_PSSFNAME);
    }

    /**
     * 设置 后台技术架构，详细说明：{@link #FIELD_PSSFNAME}
     * <P>
     * 等同 {@link #setPSSFName}
     * @param pSSFName
     */
    @JsonIgnore
    public PSSystemDTO pssfname(String pSSFName){
        this.setPSSFName(pSSFName);
        return this;
    }

    /**
     * <B>PSSYSENGINECFGID</B>&nbsp;系统引擎配置
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSENGINECFGID = "pssysenginecfgid";

    /**
     * 设置 系统引擎配置
     * 
     * @param pSSysEngineCfgId
     * 
     */
    @JsonProperty(FIELD_PSSYSENGINECFGID)
    public void setPSSysEngineCfgId(String pSSysEngineCfgId){
        this.set(FIELD_PSSYSENGINECFGID, pSSysEngineCfgId);
    }
    
    /**
     * 获取 系统引擎配置  
     * @return
     */
    @JsonIgnore
    public String getPSSysEngineCfgId(){
        Object objValue = this.get(FIELD_PSSYSENGINECFGID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统引擎配置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEngineCfgIdDirty(){
        if(this.contains(FIELD_PSSYSENGINECFGID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统引擎配置
     */
    @JsonIgnore
    public void resetPSSysEngineCfgId(){
        this.reset(FIELD_PSSYSENGINECFGID);
    }

    /**
     * 设置 系统引擎配置
     * <P>
     * 等同 {@link #setPSSysEngineCfgId}
     * @param pSSysEngineCfgId
     */
    @JsonIgnore
    public PSSystemDTO pssysenginecfgid(String pSSysEngineCfgId){
        this.setPSSysEngineCfgId(pSSysEngineCfgId);
        return this;
    }

    /**
     * <B>PSSYSENGINECFGNAME</B>&nbsp;系统引擎配置
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSENGINECFGID}
     */
    public final static String FIELD_PSSYSENGINECFGNAME = "pssysenginecfgname";

    /**
     * 设置 系统引擎配置
     * 
     * @param pSSysEngineCfgName
     * 
     */
    @JsonProperty(FIELD_PSSYSENGINECFGNAME)
    public void setPSSysEngineCfgName(String pSSysEngineCfgName){
        this.set(FIELD_PSSYSENGINECFGNAME, pSSysEngineCfgName);
    }
    
    /**
     * 获取 系统引擎配置  
     * @return
     */
    @JsonIgnore
    public String getPSSysEngineCfgName(){
        Object objValue = this.get(FIELD_PSSYSENGINECFGNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统引擎配置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEngineCfgNameDirty(){
        if(this.contains(FIELD_PSSYSENGINECFGNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统引擎配置
     */
    @JsonIgnore
    public void resetPSSysEngineCfgName(){
        this.reset(FIELD_PSSYSENGINECFGNAME);
    }

    /**
     * 设置 系统引擎配置
     * <P>
     * 等同 {@link #setPSSysEngineCfgName}
     * @param pSSysEngineCfgName
     */
    @JsonIgnore
    public PSSystemDTO pssysenginecfgname(String pSSysEngineCfgName){
        this.setPSSysEngineCfgName(pSSysEngineCfgName);
        return this;
    }

    /**
     * <B>PSSYSTEMID</B>&nbsp;系统标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSTEMID = "pssystemid";

    /**
     * 设置 系统标识
     * 
     * @param pSSystemId
     * 
     */
    @JsonProperty(FIELD_PSSYSTEMID)
    public void setPSSystemId(String pSSystemId){
        this.set(FIELD_PSSYSTEMID, pSSystemId);
    }
    
    /**
     * 获取 系统标识  
     * @return
     */
    @JsonIgnore
    public String getPSSystemId(){
        Object objValue = this.get(FIELD_PSSYSTEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSystemIdDirty(){
        if(this.contains(FIELD_PSSYSTEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统标识
     */
    @JsonIgnore
    public void resetPSSystemId(){
        this.reset(FIELD_PSSYSTEMID);
    }

    /**
     * 设置 系统标识
     * <P>
     * 等同 {@link #setPSSystemId}
     * @param pSSystemId
     */
    @JsonIgnore
    public PSSystemDTO pssystemid(String pSSystemId){
        this.setPSSystemId(pSSystemId);
        return this;
    }

    /**
     * <B>PSSYSTEMNAME</B>&nbsp;系统标识，指定系统标识，要求在所在开发方案具备唯一性
     * <P>
     * 字符串：最大长度 200，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSSYSTEMNAME = "pssystemname";

    /**
     * 设置 系统标识，详细说明：{@link #FIELD_PSSYSTEMNAME}
     * 
     * @param pSSystemName
     * 
     */
    @JsonProperty(FIELD_PSSYSTEMNAME)
    public void setPSSystemName(String pSSystemName){
        this.set(FIELD_PSSYSTEMNAME, pSSystemName);
    }
    
    /**
     * 获取 系统标识  
     * @return
     */
    @JsonIgnore
    public String getPSSystemName(){
        Object objValue = this.get(FIELD_PSSYSTEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSystemNameDirty(){
        if(this.contains(FIELD_PSSYSTEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统标识
     */
    @JsonIgnore
    public void resetPSSystemName(){
        this.reset(FIELD_PSSYSTEMNAME);
    }

    /**
     * 设置 系统标识，详细说明：{@link #FIELD_PSSYSTEMNAME}
     * <P>
     * 等同 {@link #setPSSystemName}
     * @param pSSystemName
     */
    @JsonIgnore
    public PSSystemDTO pssystemname(String pSSystemName){
        this.setPSSystemName(pSSystemName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSystemName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSystemName(strName);
    }

    @JsonIgnore
    public PSSystemDTO name(String strName){
        this.setPSSystemName(strName);
        return this;
    }

    /**
     * <B>PUBDBMODELFLAG</B>&nbsp;发布数据库模型，使用数据库持久化的实体默认发布数据库模型，默认为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_PUBDBMODELFLAG = "pubdbmodelflag";

    /**
     * 设置 发布数据库模型，详细说明：{@link #FIELD_PUBDBMODELFLAG}
     * 
     * @param pubDBModelFlag
     * 
     */
    @JsonProperty(FIELD_PUBDBMODELFLAG)
    public void setPubDBModelFlag(Integer pubDBModelFlag){
        this.set(FIELD_PUBDBMODELFLAG, pubDBModelFlag);
    }
    
    /**
     * 获取 发布数据库模型  
     * @return
     */
    @JsonIgnore
    public Integer getPubDBModelFlag(){
        Object objValue = this.get(FIELD_PUBDBMODELFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 发布数据库模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPubDBModelFlagDirty(){
        if(this.contains(FIELD_PUBDBMODELFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 发布数据库模型
     */
    @JsonIgnore
    public void resetPubDBModelFlag(){
        this.reset(FIELD_PUBDBMODELFLAG);
    }

    /**
     * 设置 发布数据库模型，详细说明：{@link #FIELD_PUBDBMODELFLAG}
     * <P>
     * 等同 {@link #setPubDBModelFlag}
     * @param pubDBModelFlag
     */
    @JsonIgnore
    public PSSystemDTO pubdbmodelflag(Integer pubDBModelFlag){
        this.setPubDBModelFlag(pubDBModelFlag);
        return this;
    }

     /**
     * 设置 发布数据库模型，详细说明：{@link #FIELD_PUBDBMODELFLAG}
     * <P>
     * 等同 {@link #setPubDBModelFlag}
     * @param pubDBModelFlag
     */
    @JsonIgnore
    public PSSystemDTO pubdbmodelflag(Boolean pubDBModelFlag){
        if(pubDBModelFlag == null){
            this.setPubDBModelFlag(null);
        }
        else{
            this.setPubDBModelFlag(pubDBModelFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>SAASMODE</B>&nbsp;SaaS构型，系统支持实体启用的SaaS构型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DESaaSMode} 
     */
    public final static String FIELD_SAASMODE = "saasmode";

    /**
     * 设置 SaaS构型，详细说明：{@link #FIELD_SAASMODE}
     * 
     * @param saaSMode
     * 
     */
    @JsonProperty(FIELD_SAASMODE)
    public void setSaaSMode(Integer saaSMode){
        this.set(FIELD_SAASMODE, saaSMode);
    }
    
    /**
     * 获取 SaaS构型  
     * @return
     */
    @JsonIgnore
    public Integer getSaaSMode(){
        Object objValue = this.get(FIELD_SAASMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 SaaS构型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSaaSModeDirty(){
        if(this.contains(FIELD_SAASMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 SaaS构型
     */
    @JsonIgnore
    public void resetSaaSMode(){
        this.reset(FIELD_SAASMODE);
    }

    /**
     * 设置 SaaS构型，详细说明：{@link #FIELD_SAASMODE}
     * <P>
     * 等同 {@link #setSaaSMode}
     * @param saaSMode
     */
    @JsonIgnore
    public PSSystemDTO saasmode(Integer saaSMode){
        this.setSaaSMode(saaSMode);
        return this;
    }

     /**
     * 设置 SaaS构型，详细说明：{@link #FIELD_SAASMODE}
     * <P>
     * 等同 {@link #setSaaSMode}
     * @param saaSMode
     */
    @JsonIgnore
    public PSSystemDTO saasmode(net.ibizsys.model.PSModelEnums.DESaaSMode saaSMode){
        if(saaSMode == null){
            this.setSaaSMode(null);
        }
        else{
            this.setSaaSMode(saaSMode.value);
        }
        return this;
    }

    /**
     * <B>SCRIPTENGINE</B>&nbsp;默认脚本引擎，指定系统默认使用的脚本引擎
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.ScriptEngine} 
     */
    public final static String FIELD_SCRIPTENGINE = "scriptengine";

    /**
     * 设置 默认脚本引擎，详细说明：{@link #FIELD_SCRIPTENGINE}
     * 
     * @param scriptEngine
     * 
     */
    @JsonProperty(FIELD_SCRIPTENGINE)
    public void setScriptEngine(String scriptEngine){
        this.set(FIELD_SCRIPTENGINE, scriptEngine);
    }
    
    /**
     * 获取 默认脚本引擎  
     * @return
     */
    @JsonIgnore
    public String getScriptEngine(){
        Object objValue = this.get(FIELD_SCRIPTENGINE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认脚本引擎 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isScriptEngineDirty(){
        if(this.contains(FIELD_SCRIPTENGINE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认脚本引擎
     */
    @JsonIgnore
    public void resetScriptEngine(){
        this.reset(FIELD_SCRIPTENGINE);
    }

    /**
     * 设置 默认脚本引擎，详细说明：{@link #FIELD_SCRIPTENGINE}
     * <P>
     * 等同 {@link #setScriptEngine}
     * @param scriptEngine
     */
    @JsonIgnore
    public PSSystemDTO scriptengine(String scriptEngine){
        this.setScriptEngine(scriptEngine);
        return this;
    }

     /**
     * 设置 默认脚本引擎，详细说明：{@link #FIELD_SCRIPTENGINE}
     * <P>
     * 等同 {@link #setScriptEngine}
     * @param scriptEngine
     */
    @JsonIgnore
    public PSSystemDTO scriptengine(net.ibizsys.model.PSModelEnums.ScriptEngine scriptEngine){
        if(scriptEngine == null){
            this.setScriptEngine(null);
        }
        else{
            this.setScriptEngine(scriptEngine.value);
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
    public PSSystemDTO serviceapiflag(Integer serviceAPIFlag){
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
    public PSSystemDTO serviceapiflag(net.ibizsys.model.PSModelEnums.DEServiceAPIMode serviceAPIFlag){
        if(serviceAPIFlag == null){
            this.setServiceAPIFlag(null);
        }
        else{
            this.setServiceAPIFlag(serviceAPIFlag.value);
        }
        return this;
    }

    /**
     * <B>SIMACTIONLOGICS</B>&nbsp;仿真行为逻辑
     */
    public final static String FIELD_SIMACTIONLOGICS = "simactionlogics";

    /**
     * 设置 仿真行为逻辑
     * 
     * @param simActionLogics
     * 
     */
    @JsonProperty(FIELD_SIMACTIONLOGICS)
    public void setSimActionLogics(Integer simActionLogics){
        this.set(FIELD_SIMACTIONLOGICS, simActionLogics);
    }
    
    /**
     * 获取 仿真行为逻辑  
     * @return
     */
    @JsonIgnore
    public Integer getSimActionLogics(){
        Object objValue = this.get(FIELD_SIMACTIONLOGICS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 仿真行为逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSimActionLogicsDirty(){
        if(this.contains(FIELD_SIMACTIONLOGICS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 仿真行为逻辑
     */
    @JsonIgnore
    public void resetSimActionLogics(){
        this.reset(FIELD_SIMACTIONLOGICS);
    }

    /**
     * 设置 仿真行为逻辑
     * <P>
     * 等同 {@link #setSimActionLogics}
     * @param simActionLogics
     */
    @JsonIgnore
    public PSSystemDTO simactionlogics(Integer simActionLogics){
        this.setSimActionLogics(simActionLogics);
        return this;
    }

    /**
     * <B>SRCPSSYSTEMID</B>&nbsp;源系统
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSystemDTO} 
     */
    public final static String FIELD_SRCPSSYSTEMID = "srcpssystemid";

    /**
     * 设置 源系统
     * 
     * @param srcPSSystemId
     * 
     */
    @JsonProperty(FIELD_SRCPSSYSTEMID)
    public void setSrcPSSystemId(String srcPSSystemId){
        this.set(FIELD_SRCPSSYSTEMID, srcPSSystemId);
    }
    
    /**
     * 获取 源系统  
     * @return
     */
    @JsonIgnore
    public String getSrcPSSystemId(){
        Object objValue = this.get(FIELD_SRCPSSYSTEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 源系统 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSrcPSSystemIdDirty(){
        if(this.contains(FIELD_SRCPSSYSTEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 源系统
     */
    @JsonIgnore
    public void resetSrcPSSystemId(){
        this.reset(FIELD_SRCPSSYSTEMID);
    }

    /**
     * 设置 源系统
     * <P>
     * 等同 {@link #setSrcPSSystemId}
     * @param srcPSSystemId
     */
    @JsonIgnore
    public PSSystemDTO srcpssystemid(String srcPSSystemId){
        this.setSrcPSSystemId(srcPSSystemId);
        return this;
    }

    /**
     * 设置 源系统，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setSrcPSSystemId}
     * @param pSSystem 引用对象
     */
    @JsonIgnore
    public PSSystemDTO srcpssystemid(PSSystemDTO pSSystem){
        if(pSSystem == null){
            this.setSrcPSSystemId(null);
            this.setSrcPSSystemName(null);
        }
        else{
            this.setSrcPSSystemId(pSSystem.getPSSystemId());
            this.setSrcPSSystemName(pSSystem.getPSSystemName());
        }
        return this;
    }

    /**
     * <B>SRCPSSYSTEMNAME</B>&nbsp;源系统
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_SRCPSSYSTEMID}
     */
    public final static String FIELD_SRCPSSYSTEMNAME = "srcpssystemname";

    /**
     * 设置 源系统
     * 
     * @param srcPSSystemName
     * 
     */
    @JsonProperty(FIELD_SRCPSSYSTEMNAME)
    public void setSrcPSSystemName(String srcPSSystemName){
        this.set(FIELD_SRCPSSYSTEMNAME, srcPSSystemName);
    }
    
    /**
     * 获取 源系统  
     * @return
     */
    @JsonIgnore
    public String getSrcPSSystemName(){
        Object objValue = this.get(FIELD_SRCPSSYSTEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 源系统 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSrcPSSystemNameDirty(){
        if(this.contains(FIELD_SRCPSSYSTEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 源系统
     */
    @JsonIgnore
    public void resetSrcPSSystemName(){
        this.reset(FIELD_SRCPSSYSTEMNAME);
    }

    /**
     * 设置 源系统
     * <P>
     * 等同 {@link #setSrcPSSystemName}
     * @param srcPSSystemName
     */
    @JsonIgnore
    public PSSystemDTO srcpssystemname(String srcPSSystemName){
        this.setSrcPSSystemName(srcPSSystemName);
        return this;
    }

    /**
     * <B>SSDEMSACTIONLOGICFLAG</B>&nbsp;子系统实体主状态行为控制模式，启用主状态的实体会对行为注入的相应的限制逻辑，控制模式是指注入逻辑的方式，当前定义子系统实体默认的控制模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DEMSActionLogicMode} 
     */
    public final static String FIELD_SSDEMSACTIONLOGICFLAG = "ssdemsactionlogicflag";

    /**
     * 设置 子系统实体主状态行为控制模式，详细说明：{@link #FIELD_SSDEMSACTIONLOGICFLAG}
     * 
     * @param sSDEMSActionLogicFlag
     * 
     */
    @JsonProperty(FIELD_SSDEMSACTIONLOGICFLAG)
    public void setSSDEMSActionLogicFlag(Integer sSDEMSActionLogicFlag){
        this.set(FIELD_SSDEMSACTIONLOGICFLAG, sSDEMSActionLogicFlag);
    }
    
    /**
     * 获取 子系统实体主状态行为控制模式  
     * @return
     */
    @JsonIgnore
    public Integer getSSDEMSActionLogicFlag(){
        Object objValue = this.get(FIELD_SSDEMSACTIONLOGICFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 子系统实体主状态行为控制模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSSDEMSActionLogicFlagDirty(){
        if(this.contains(FIELD_SSDEMSACTIONLOGICFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 子系统实体主状态行为控制模式
     */
    @JsonIgnore
    public void resetSSDEMSActionLogicFlag(){
        this.reset(FIELD_SSDEMSACTIONLOGICFLAG);
    }

    /**
     * 设置 子系统实体主状态行为控制模式，详细说明：{@link #FIELD_SSDEMSACTIONLOGICFLAG}
     * <P>
     * 等同 {@link #setSSDEMSActionLogicFlag}
     * @param sSDEMSActionLogicFlag
     */
    @JsonIgnore
    public PSSystemDTO ssdemsactionlogicflag(Integer sSDEMSActionLogicFlag){
        this.setSSDEMSActionLogicFlag(sSDEMSActionLogicFlag);
        return this;
    }

     /**
     * 设置 子系统实体主状态行为控制模式，详细说明：{@link #FIELD_SSDEMSACTIONLOGICFLAG}
     * <P>
     * 等同 {@link #setSSDEMSActionLogicFlag}
     * @param sSDEMSActionLogicFlag
     */
    @JsonIgnore
    public PSSystemDTO ssdemsactionlogicflag(net.ibizsys.model.PSModelEnums.DEMSActionLogicMode sSDEMSActionLogicFlag){
        if(sSDEMSActionLogicFlag == null){
            this.setSSDEMSActionLogicFlag(null);
        }
        else{
            this.setSSDEMSActionLogicFlag(sSDEMSActionLogicFlag.value);
        }
        return this;
    }

    /**
     * <B>SYSFOLDER</B>&nbsp;系统目录
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_SYSFOLDER = "sysfolder";

    /**
     * 设置 系统目录
     * 
     * @param sysFolder
     * 
     */
    @JsonProperty(FIELD_SYSFOLDER)
    public void setSysFolder(String sysFolder){
        this.set(FIELD_SYSFOLDER, sysFolder);
    }
    
    /**
     * 获取 系统目录  
     * @return
     */
    @JsonIgnore
    public String getSysFolder(){
        Object objValue = this.get(FIELD_SYSFOLDER);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统目录 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSysFolderDirty(){
        if(this.contains(FIELD_SYSFOLDER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统目录
     */
    @JsonIgnore
    public void resetSysFolder(){
        this.reset(FIELD_SYSFOLDER);
    }

    /**
     * 设置 系统目录
     * <P>
     * 等同 {@link #setSysFolder}
     * @param sysFolder
     */
    @JsonIgnore
    public PSSystemDTO sysfolder(String sysFolder){
        this.setSysFolder(sysFolder);
        return this;
    }

    /**
     * <B>SYSROWKEY</B>&nbsp;系统行键
     * <P>
     * 字符串：最大长度 10
     */
    public final static String FIELD_SYSROWKEY = "sysrowkey";

    /**
     * 设置 系统行键
     * 
     * @param sysRowKey
     * 
     */
    @JsonProperty(FIELD_SYSROWKEY)
    public void setSysRowKey(String sysRowKey){
        this.set(FIELD_SYSROWKEY, sysRowKey);
    }
    
    /**
     * 获取 系统行键  
     * @return
     */
    @JsonIgnore
    public String getSysRowKey(){
        Object objValue = this.get(FIELD_SYSROWKEY);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统行键 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSysRowKeyDirty(){
        if(this.contains(FIELD_SYSROWKEY)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统行键
     */
    @JsonIgnore
    public void resetSysRowKey(){
        this.reset(FIELD_SYSROWKEY);
    }

    /**
     * 设置 系统行键
     * <P>
     * 等同 {@link #setSysRowKey}
     * @param sysRowKey
     */
    @JsonIgnore
    public PSSystemDTO sysrowkey(String sysRowKey){
        this.setSysRowKey(sysRowKey);
        return this;
    }

    /**
     * <B>SYSVER</B>&nbsp;系统版本
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_SYSVER = "sysver";

    /**
     * 设置 系统版本
     * 
     * @param sysVer
     * 
     */
    @JsonProperty(FIELD_SYSVER)
    public void setSysVer(String sysVer){
        this.set(FIELD_SYSVER, sysVer);
    }
    
    /**
     * 获取 系统版本  
     * @return
     */
    @JsonIgnore
    public String getSysVer(){
        Object objValue = this.get(FIELD_SYSVER);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSysVerDirty(){
        if(this.contains(FIELD_SYSVER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统版本
     */
    @JsonIgnore
    public void resetSysVer(){
        this.reset(FIELD_SYSVER);
    }

    /**
     * 设置 系统版本
     * <P>
     * 等同 {@link #setSysVer}
     * @param sysVer
     */
    @JsonIgnore
    public PSSystemDTO sysver(String sysVer){
        this.setSysVer(sysVer);
        return this;
    }

    /**
     * <B>TAGS</B>&nbsp;标记集合
     */
    public final static String FIELD_TAGS = "tags";

    /**
     * 设置 标记集合
     * 
     * @param tags
     * 
     */
    @JsonProperty(FIELD_TAGS)
    public void setTags(String tags){
        this.set(FIELD_TAGS, tags);
    }
    
    /**
     * 获取 标记集合  
     * @return
     */
    @JsonIgnore
    public String getTags(){
        Object objValue = this.get(FIELD_TAGS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标记集合 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTagsDirty(){
        if(this.contains(FIELD_TAGS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标记集合
     */
    @JsonIgnore
    public void resetTags(){
        this.reset(FIELD_TAGS);
    }

    /**
     * 设置 标记集合
     * <P>
     * 等同 {@link #setTags}
     * @param tags
     */
    @JsonIgnore
    public PSSystemDTO tags(String tags){
        this.setTags(tags);
        return this;
    }

    /**
     * <B>TEMPLENGINE</B>&nbsp;模板引擎
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.PSTemplEngine} 
     */
    public final static String FIELD_TEMPLENGINE = "templengine";

    /**
     * 设置 模板引擎
     * 
     * @param templEngine
     * 
     */
    @JsonProperty(FIELD_TEMPLENGINE)
    public void setTemplEngine(String templEngine){
        this.set(FIELD_TEMPLENGINE, templEngine);
    }
    
    /**
     * 获取 模板引擎  
     * @return
     */
    @JsonIgnore
    public String getTemplEngine(){
        Object objValue = this.get(FIELD_TEMPLENGINE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模板引擎 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTemplEngineDirty(){
        if(this.contains(FIELD_TEMPLENGINE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模板引擎
     */
    @JsonIgnore
    public void resetTemplEngine(){
        this.reset(FIELD_TEMPLENGINE);
    }

    /**
     * 设置 模板引擎
     * <P>
     * 等同 {@link #setTemplEngine}
     * @param templEngine
     */
    @JsonIgnore
    public PSSystemDTO templengine(String templEngine){
        this.setTemplEngine(templEngine);
        return this;
    }

     /**
     * 设置 模板引擎
     * <P>
     * 等同 {@link #setTemplEngine}
     * @param templEngine
     */
    @JsonIgnore
    public PSSystemDTO templengine(net.ibizsys.model.PSModelEnums.PSTemplEngine templEngine){
        if(templEngine == null){
            this.setTemplEngine(null);
        }
        else{
            this.setTemplEngine(templEngine.value);
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
    public PSSystemDTO updatedate(Timestamp updateDate){
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
    public PSSystemDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
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
    public PSSystemDTO userparams(String userParams){
        this.setUserParams(userParams);
        return this;
    }

    /**
     * <B>VIEWUAREGMODE</B>&nbsp;视图界面行为注册
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.ViewUARegMode} 
     */
    public final static String FIELD_VIEWUAREGMODE = "viewuaregmode";

    /**
     * 设置 视图界面行为注册
     * 
     * @param viewUARegMode
     * 
     */
    @JsonProperty(FIELD_VIEWUAREGMODE)
    public void setViewUARegMode(Integer viewUARegMode){
        this.set(FIELD_VIEWUAREGMODE, viewUARegMode);
    }
    
    /**
     * 获取 视图界面行为注册  
     * @return
     */
    @JsonIgnore
    public Integer getViewUARegMode(){
        Object objValue = this.get(FIELD_VIEWUAREGMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 视图界面行为注册 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewUARegModeDirty(){
        if(this.contains(FIELD_VIEWUAREGMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图界面行为注册
     */
    @JsonIgnore
    public void resetViewUARegMode(){
        this.reset(FIELD_VIEWUAREGMODE);
    }

    /**
     * 设置 视图界面行为注册
     * <P>
     * 等同 {@link #setViewUARegMode}
     * @param viewUARegMode
     */
    @JsonIgnore
    public PSSystemDTO viewuaregmode(Integer viewUARegMode){
        this.setViewUARegMode(viewUARegMode);
        return this;
    }

     /**
     * 设置 视图界面行为注册
     * <P>
     * 等同 {@link #setViewUARegMode}
     * @param viewUARegMode
     */
    @JsonIgnore
    public PSSystemDTO viewuaregmode(net.ibizsys.model.PSModelEnums.ViewUARegMode viewUARegMode){
        if(viewUARegMode == null){
            this.setViewUARegMode(null);
        }
        else{
            this.setViewUARegMode(viewUARegMode.value);
        }
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSSystemId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSystemId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSystemId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSystemId(strValue);
    }

    @JsonIgnore
    public PSSystemDTO id(String strValue){
        this.setPSSystemId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSystemDTO){
            PSSystemDTO dto = (PSSystemDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
