package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSPORTLET</B>系统门户部件 模型传输对象
 * <P>
 * 可放置在数据看板的部件模型，定义部件的表现及处理逻辑，门户部件有多种类型，根据类型嵌入不同的成员部件
 */
public class PSSysPortlet extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysPortlet(){
    }      

    /**
     * <B>ADPSDELOGICID</B>&nbsp;查询转换逻辑，指定门户部件使用数据集的查询上下文转换逻辑，将调用环境参数转换为数据集的调用参数
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDELogic} 
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
    public PSSysPortlet adpsdelogicid(String aDPSDELogicId){
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
    public PSSysPortlet adpsdelogicid(PSDELogic pSDELogic){
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
     * <B>ADPSDELOGICNAME</B>&nbsp;查询转换逻辑，指定门户部件使用数据集的查询上下文转换逻辑，将调用环境参数转换为数据集的调用参数
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
    public PSSysPortlet adpsdelogicname(String aDPSDELogicName){
        this.setADPSDELogicName(aDPSDELogicName);
        return this;
    }

    /**
     * <B>BASECLSPARAMS</B>&nbsp;发布参数，指定门户部件后台代码基类参数
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_BASECLSPARAMS = "baseclsparams";

    /**
     * 设置 发布参数，详细说明：{@link #FIELD_BASECLSPARAMS}
     * 
     * @param baseClsParams
     * 
     */
    @JsonProperty(FIELD_BASECLSPARAMS)
    public void setBaseClsParams(String baseClsParams){
        this.set(FIELD_BASECLSPARAMS, baseClsParams);
    }
    
    /**
     * 获取 发布参数  
     * @return
     */
    @JsonIgnore
    public String getBaseClsParams(){
        Object objValue = this.get(FIELD_BASECLSPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 发布参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBaseClsParamsDirty(){
        if(this.contains(FIELD_BASECLSPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 发布参数
     */
    @JsonIgnore
    public void resetBaseClsParams(){
        this.reset(FIELD_BASECLSPARAMS);
    }

    /**
     * 设置 发布参数，详细说明：{@link #FIELD_BASECLSPARAMS}
     * <P>
     * 等同 {@link #setBaseClsParams}
     * @param baseClsParams
     */
    @JsonIgnore
    public PSSysPortlet baseclsparams(String baseClsParams){
        this.setBaseClsParams(baseClsParams);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定门户部件的代码标识，需要在所在的模型域（实体、系统模块或系统）中具有唯一性
     * <P>
     * 字符串：最大长度 50，由字母、数字、下划线组成，且开始必须为字母
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
    public PSSysPortlet codename(String codeName){
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
    public PSSysPortlet createdate(String createDate){
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
    public PSSysPortlet createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DASHBOARDSCOPE</B>&nbsp;部件应用范围，指定门户部件支持放置的数据看板类型，未定义时为【应用及实体数据看板】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DashboardScope} 
     */
    public final static String FIELD_DASHBOARDSCOPE = "dashboardscope";

    /**
     * 设置 部件应用范围，详细说明：{@link #FIELD_DASHBOARDSCOPE}
     * 
     * @param dashboardScope
     * 
     */
    @JsonProperty(FIELD_DASHBOARDSCOPE)
    public void setDashboardScope(Integer dashboardScope){
        this.set(FIELD_DASHBOARDSCOPE, dashboardScope);
    }
    
    /**
     * 获取 部件应用范围  
     * @return
     */
    @JsonIgnore
    public Integer getDashboardScope(){
        Object objValue = this.get(FIELD_DASHBOARDSCOPE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 部件应用范围 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDashboardScopeDirty(){
        if(this.contains(FIELD_DASHBOARDSCOPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件应用范围
     */
    @JsonIgnore
    public void resetDashboardScope(){
        this.reset(FIELD_DASHBOARDSCOPE);
    }

    /**
     * 设置 部件应用范围，详细说明：{@link #FIELD_DASHBOARDSCOPE}
     * <P>
     * 等同 {@link #setDashboardScope}
     * @param dashboardScope
     */
    @JsonIgnore
    public PSSysPortlet dashboardscope(Integer dashboardScope){
        this.setDashboardScope(dashboardScope);
        return this;
    }

     /**
     * 设置 部件应用范围，详细说明：{@link #FIELD_DASHBOARDSCOPE}
     * <P>
     * 等同 {@link #setDashboardScope}
     * @param dashboardScope
     */
    @JsonIgnore
    public PSSysPortlet dashboardscope(net.ibizsys.psmodel.core.util.PSModelEnums.DashboardScope dashboardScope){
        if(dashboardScope == null){
            this.setDashboardScope(null);
        }
        else{
            this.setDashboardScope(dashboardScope.value);
        }
        return this;
    }

    /**
     * <B>EMPTYTEXT</B>&nbsp;无值显示内容，指定门户部件的无值显示内容，未定义时使用前端应用配置
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
    public PSSysPortlet emptytext(String emptyText){
        this.setEmptyText(emptyText);
        return this;
    }

    /**
     * <B>EMPTYTEXTPSLANRESID</B>&nbsp;无值内容语言资源，指定门户部件的无值显示内容多语言资源对象，未定义时使用前端应用配置
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
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
    public PSSysPortlet emptytextpslanresid(String emptyTextPSLanResId){
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
    public PSSysPortlet emptytextpslanresid(PSLanguageRes pSLanguageRes){
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
     * <B>EMPTYTEXTPSLANRESNAME</B>&nbsp;无值内容语言资源，指定门户部件的无值显示内容多语言资源对象，未定义时使用前端应用配置
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
    public PSSysPortlet emptytextpslanresname(String emptyTextPSLanResName){
        this.setEmptyTextPSLanResName(emptyTextPSLanResName);
        return this;
    }

    /**
     * <B>FILTERPSDEDSID</B>&nbsp;过滤数据集合
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataSet} 
     */
    public final static String FIELD_FILTERPSDEDSID = "filterpsdedsid";

    /**
     * 设置 过滤数据集合
     * 
     * @param filterPSDEDSId
     * 
     */
    @JsonProperty(FIELD_FILTERPSDEDSID)
    public void setFilterPSDEDSId(String filterPSDEDSId){
        this.set(FIELD_FILTERPSDEDSID, filterPSDEDSId);
    }
    
    /**
     * 获取 过滤数据集合  
     * @return
     */
    @JsonIgnore
    public String getFilterPSDEDSId(){
        Object objValue = this.get(FIELD_FILTERPSDEDSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 过滤数据集合 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFilterPSDEDSIdDirty(){
        if(this.contains(FIELD_FILTERPSDEDSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 过滤数据集合
     */
    @JsonIgnore
    public void resetFilterPSDEDSId(){
        this.reset(FIELD_FILTERPSDEDSID);
    }

    /**
     * 设置 过滤数据集合
     * <P>
     * 等同 {@link #setFilterPSDEDSId}
     * @param filterPSDEDSId
     */
    @JsonIgnore
    public PSSysPortlet filterpsdedsid(String filterPSDEDSId){
        this.setFilterPSDEDSId(filterPSDEDSId);
        return this;
    }

    /**
     * 设置 过滤数据集合，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setFilterPSDEDSId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSSysPortlet filterpsdedsid(PSDEDataSet pSDEDataSet){
        if(pSDEDataSet == null){
            this.setFilterPSDEDSId(null);
            this.setFilterPSDEDSName(null);
        }
        else{
            this.setFilterPSDEDSId(pSDEDataSet.getPSDEDataSetId());
            this.setFilterPSDEDSName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    /**
     * <B>FILTERPSDEDSNAME</B>&nbsp;过滤数据集合
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_FILTERPSDEDSID}
     */
    public final static String FIELD_FILTERPSDEDSNAME = "filterpsdedsname";

    /**
     * 设置 过滤数据集合
     * 
     * @param filterPSDEDSName
     * 
     */
    @JsonProperty(FIELD_FILTERPSDEDSNAME)
    public void setFilterPSDEDSName(String filterPSDEDSName){
        this.set(FIELD_FILTERPSDEDSNAME, filterPSDEDSName);
    }
    
    /**
     * 获取 过滤数据集合  
     * @return
     */
    @JsonIgnore
    public String getFilterPSDEDSName(){
        Object objValue = this.get(FIELD_FILTERPSDEDSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 过滤数据集合 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFilterPSDEDSNameDirty(){
        if(this.contains(FIELD_FILTERPSDEDSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 过滤数据集合
     */
    @JsonIgnore
    public void resetFilterPSDEDSName(){
        this.reset(FIELD_FILTERPSDEDSNAME);
    }

    /**
     * 设置 过滤数据集合
     * <P>
     * 等同 {@link #setFilterPSDEDSName}
     * @param filterPSDEDSName
     */
    @JsonIgnore
    public PSSysPortlet filterpsdedsname(String filterPSDEDSName){
        this.setFilterPSDEDSName(filterPSDEDSName);
        return this;
    }

    /**
     * <B>GROUPEXTRACTMODE</B>&nbsp;行为组展开模式，指定门户部件对界面行为组的展开模式，未定义时为【按项展开】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.UGExtractMode} 
     */
    public final static String FIELD_GROUPEXTRACTMODE = "groupextractmode";

    /**
     * 设置 行为组展开模式，详细说明：{@link #FIELD_GROUPEXTRACTMODE}
     * 
     * @param groupExtractMode
     * 
     */
    @JsonProperty(FIELD_GROUPEXTRACTMODE)
    public void setGroupExtractMode(String groupExtractMode){
        this.set(FIELD_GROUPEXTRACTMODE, groupExtractMode);
    }
    
    /**
     * 获取 行为组展开模式  
     * @return
     */
    @JsonIgnore
    public String getGroupExtractMode(){
        Object objValue = this.get(FIELD_GROUPEXTRACTMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 行为组展开模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupExtractModeDirty(){
        if(this.contains(FIELD_GROUPEXTRACTMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 行为组展开模式
     */
    @JsonIgnore
    public void resetGroupExtractMode(){
        this.reset(FIELD_GROUPEXTRACTMODE);
    }

    /**
     * 设置 行为组展开模式，详细说明：{@link #FIELD_GROUPEXTRACTMODE}
     * <P>
     * 等同 {@link #setGroupExtractMode}
     * @param groupExtractMode
     */
    @JsonIgnore
    public PSSysPortlet groupextractmode(String groupExtractMode){
        this.setGroupExtractMode(groupExtractMode);
        return this;
    }

     /**
     * 设置 行为组展开模式，详细说明：{@link #FIELD_GROUPEXTRACTMODE}
     * <P>
     * 等同 {@link #setGroupExtractMode}
     * @param groupExtractMode
     */
    @JsonIgnore
    public PSSysPortlet groupextractmode(net.ibizsys.psmodel.core.util.PSModelEnums.UGExtractMode groupExtractMode){
        if(groupExtractMode == null){
            this.setGroupExtractMode(null);
        }
        else{
            this.setGroupExtractMode(groupExtractMode.value);
        }
        return this;
    }

    /**
     * <B>HEIGHT</B>&nbsp;高度，指定门户部件的高度，未定义时为【300】
     */
    public final static String FIELD_HEIGHT = "height";

    /**
     * 设置 高度，详细说明：{@link #FIELD_HEIGHT}
     * 
     * @param height
     * 
     */
    @JsonProperty(FIELD_HEIGHT)
    public void setHeight(Integer height){
        this.set(FIELD_HEIGHT, height);
    }
    
    /**
     * 获取 高度  
     * @return
     */
    @JsonIgnore
    public Integer getHeight(){
        Object objValue = this.get(FIELD_HEIGHT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 高度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHeightDirty(){
        if(this.contains(FIELD_HEIGHT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 高度
     */
    @JsonIgnore
    public void resetHeight(){
        this.reset(FIELD_HEIGHT);
    }

    /**
     * 设置 高度，详细说明：{@link #FIELD_HEIGHT}
     * <P>
     * 等同 {@link #setHeight}
     * @param height
     */
    @JsonIgnore
    public PSSysPortlet height(Integer height){
        this.setHeight(height);
        return this;
    }

    /**
     * <B>HTMLSHOWMODE</B>&nbsp;HTML显示模式，指定HTML内容的展示方式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.PortletHtmlShowMode} 
     */
    public final static String FIELD_HTMLSHOWMODE = "htmlshowmode";

    /**
     * 设置 HTML显示模式，详细说明：{@link #FIELD_HTMLSHOWMODE}
     * 
     * @param htmlShowMode
     * 
     */
    @JsonProperty(FIELD_HTMLSHOWMODE)
    public void setHtmlShowMode(String htmlShowMode){
        this.set(FIELD_HTMLSHOWMODE, htmlShowMode);
    }
    
    /**
     * 获取 HTML显示模式  
     * @return
     */
    @JsonIgnore
    public String getHtmlShowMode(){
        Object objValue = this.get(FIELD_HTMLSHOWMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 HTML显示模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHtmlShowModeDirty(){
        if(this.contains(FIELD_HTMLSHOWMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 HTML显示模式
     */
    @JsonIgnore
    public void resetHtmlShowMode(){
        this.reset(FIELD_HTMLSHOWMODE);
    }

    /**
     * 设置 HTML显示模式，详细说明：{@link #FIELD_HTMLSHOWMODE}
     * <P>
     * 等同 {@link #setHtmlShowMode}
     * @param htmlShowMode
     */
    @JsonIgnore
    public PSSysPortlet htmlshowmode(String htmlShowMode){
        this.setHtmlShowMode(htmlShowMode);
        return this;
    }

     /**
     * 设置 HTML显示模式，详细说明：{@link #FIELD_HTMLSHOWMODE}
     * <P>
     * 等同 {@link #setHtmlShowMode}
     * @param htmlShowMode
     */
    @JsonIgnore
    public PSSysPortlet htmlshowmode(net.ibizsys.psmodel.core.util.PSModelEnums.PortletHtmlShowMode htmlShowMode){
        if(htmlShowMode == null){
            this.setHtmlShowMode(null);
        }
        else{
            this.setHtmlShowMode(htmlShowMode.value);
        }
        return this;
    }

    /**
     * <B>HTMLURL</B>&nbsp;网页地址，门户部件类型为【网页部件】时指定页面的路径
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_HTMLURL = "htmlurl";

    /**
     * 设置 网页地址，详细说明：{@link #FIELD_HTMLURL}
     * 
     * @param htmlUrl
     * 
     */
    @JsonProperty(FIELD_HTMLURL)
    public void setHtmlUrl(String htmlUrl){
        this.set(FIELD_HTMLURL, htmlUrl);
    }
    
    /**
     * 获取 网页地址  
     * @return
     */
    @JsonIgnore
    public String getHtmlUrl(){
        Object objValue = this.get(FIELD_HTMLURL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 网页地址 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHtmlUrlDirty(){
        if(this.contains(FIELD_HTMLURL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 网页地址
     */
    @JsonIgnore
    public void resetHtmlUrl(){
        this.reset(FIELD_HTMLURL);
    }

    /**
     * 设置 网页地址，详细说明：{@link #FIELD_HTMLURL}
     * <P>
     * 等同 {@link #setHtmlUrl}
     * @param htmlUrl
     */
    @JsonIgnore
    public PSSysPortlet htmlurl(String htmlUrl){
        this.setHtmlUrl(htmlUrl);
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;标题，指定门户部件的标题
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_LOGICNAME = "logicname";

    /**
     * 设置 标题，详细说明：{@link #FIELD_LOGICNAME}
     * 
     * @param logicName
     * 
     */
    @JsonProperty(FIELD_LOGICNAME)
    public void setLogicName(String logicName){
        this.set(FIELD_LOGICNAME, logicName);
    }
    
    /**
     * 获取 标题  
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
     * 判断 标题 是否指定值，包括空值
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
     * 重置 标题
     */
    @JsonIgnore
    public void resetLogicName(){
        this.reset(FIELD_LOGICNAME);
    }

    /**
     * 设置 标题，详细说明：{@link #FIELD_LOGICNAME}
     * <P>
     * 等同 {@link #setLogicName}
     * @param logicName
     */
    @JsonIgnore
    public PSSysPortlet logicname(String logicName){
        this.setLogicName(logicName);
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
    public PSSysPortlet memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PORTLETPARAMS</B>&nbsp;部件参数
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_PORTLETPARAMS = "portletparams";

    /**
     * 设置 部件参数
     * 
     * @param portletParams
     * 
     */
    @JsonProperty(FIELD_PORTLETPARAMS)
    public void setPortletParams(String portletParams){
        this.set(FIELD_PORTLETPARAMS, portletParams);
    }
    
    /**
     * 获取 部件参数  
     * @return
     */
    @JsonIgnore
    public String getPortletParams(){
        Object objValue = this.get(FIELD_PORTLETPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPortletParamsDirty(){
        if(this.contains(FIELD_PORTLETPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件参数
     */
    @JsonIgnore
    public void resetPortletParams(){
        this.reset(FIELD_PORTLETPARAMS);
    }

    /**
     * 设置 部件参数
     * <P>
     * 等同 {@link #setPortletParams}
     * @param portletParams
     */
    @JsonIgnore
    public PSSysPortlet portletparams(String portletParams){
        this.setPortletParams(portletParams);
        return this;
    }

    /**
     * <B>PORTLETSTYLE</B>&nbsp;内置样式，指定门户部件的内置样式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.CtrlDetailStyle} 
     */
    public final static String FIELD_PORTLETSTYLE = "portletstyle";

    /**
     * 设置 内置样式，详细说明：{@link #FIELD_PORTLETSTYLE}
     * 
     * @param portletStyle
     * 
     */
    @JsonProperty(FIELD_PORTLETSTYLE)
    public void setPortletStyle(String portletStyle){
        this.set(FIELD_PORTLETSTYLE, portletStyle);
    }
    
    /**
     * 获取 内置样式  
     * @return
     */
    @JsonIgnore
    public String getPortletStyle(){
        Object objValue = this.get(FIELD_PORTLETSTYLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 内置样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPortletStyleDirty(){
        if(this.contains(FIELD_PORTLETSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内置样式
     */
    @JsonIgnore
    public void resetPortletStyle(){
        this.reset(FIELD_PORTLETSTYLE);
    }

    /**
     * 设置 内置样式，详细说明：{@link #FIELD_PORTLETSTYLE}
     * <P>
     * 等同 {@link #setPortletStyle}
     * @param portletStyle
     */
    @JsonIgnore
    public PSSysPortlet portletstyle(String portletStyle){
        this.setPortletStyle(portletStyle);
        return this;
    }

     /**
     * 设置 内置样式，详细说明：{@link #FIELD_PORTLETSTYLE}
     * <P>
     * 等同 {@link #setPortletStyle}
     * @param portletStyle
     */
    @JsonIgnore
    public PSSysPortlet portletstyle(net.ibizsys.psmodel.core.util.PSModelEnums.CtrlDetailStyle portletStyle){
        if(portletStyle == null){
            this.setPortletStyle(null);
        }
        else{
            this.setPortletStyle(portletStyle.value);
        }
        return this;
    }

    /**
     * <B>PORTLETTYPE</B>&nbsp;门户部件类型，指定门户部件的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.PortletType} 
     */
    public final static String FIELD_PORTLETTYPE = "portlettype";

    /**
     * 设置 门户部件类型，详细说明：{@link #FIELD_PORTLETTYPE}
     * 
     * @param portletType
     * 
     */
    @JsonProperty(FIELD_PORTLETTYPE)
    public void setPortletType(String portletType){
        this.set(FIELD_PORTLETTYPE, portletType);
    }
    
    /**
     * 获取 门户部件类型  
     * @return
     */
    @JsonIgnore
    public String getPortletType(){
        Object objValue = this.get(FIELD_PORTLETTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 门户部件类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPortletTypeDirty(){
        if(this.contains(FIELD_PORTLETTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 门户部件类型
     */
    @JsonIgnore
    public void resetPortletType(){
        this.reset(FIELD_PORTLETTYPE);
    }

    /**
     * 设置 门户部件类型，详细说明：{@link #FIELD_PORTLETTYPE}
     * <P>
     * 等同 {@link #setPortletType}
     * @param portletType
     */
    @JsonIgnore
    public PSSysPortlet portlettype(String portletType){
        this.setPortletType(portletType);
        return this;
    }

     /**
     * 设置 门户部件类型，详细说明：{@link #FIELD_PORTLETTYPE}
     * <P>
     * 等同 {@link #setPortletType}
     * @param portletType
     */
    @JsonIgnore
    public PSSysPortlet portlettype(net.ibizsys.psmodel.core.util.PSModelEnums.PortletType portletType){
        if(portletType == null){
            this.setPortletType(null);
        }
        else{
            this.setPortletType(portletType.value);
        }
        return this;
    }

    /**
     * <B>PSACHANDLERID</B>&nbsp;界面处理对象，指定门户部件的界面处理对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSACHandler} 
     */
    public final static String FIELD_PSACHANDLERID = "psachandlerid";

    /**
     * 设置 界面处理对象，详细说明：{@link #FIELD_PSACHANDLERID}
     * 
     * @param pSACHandlerId
     * 
     */
    @JsonProperty(FIELD_PSACHANDLERID)
    public void setPSACHandlerId(String pSACHandlerId){
        this.set(FIELD_PSACHANDLERID, pSACHandlerId);
    }
    
    /**
     * 获取 界面处理对象  
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
     * 判断 界面处理对象 是否指定值，包括空值
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
     * 重置 界面处理对象
     */
    @JsonIgnore
    public void resetPSACHandlerId(){
        this.reset(FIELD_PSACHANDLERID);
    }

    /**
     * 设置 界面处理对象，详细说明：{@link #FIELD_PSACHANDLERID}
     * <P>
     * 等同 {@link #setPSACHandlerId}
     * @param pSACHandlerId
     */
    @JsonIgnore
    public PSSysPortlet psachandlerid(String pSACHandlerId){
        this.setPSACHandlerId(pSACHandlerId);
        return this;
    }

    /**
     * 设置 界面处理对象，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSACHandlerId}
     * @param pSACHandler 引用对象
     */
    @JsonIgnore
    public PSSysPortlet psachandlerid(PSACHandler pSACHandler){
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
     * <B>PSACHANDLERNAME</B>&nbsp;界面处理对象，指定门户部件的界面处理对象
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
    public PSSysPortlet psachandlername(String pSACHandlerName){
        this.setPSACHandlerName(pSACHandlerName);
        return this;
    }

    /**
     * <B>PSAPPMENUID</B>&nbsp;应用菜单
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSAppMenu} 
     */
    public final static String FIELD_PSAPPMENUID = "psappmenuid";

    /**
     * 设置 应用菜单
     * 
     * @param pSAppMenuId
     * 
     */
    @JsonProperty(FIELD_PSAPPMENUID)
    public void setPSAppMenuId(String pSAppMenuId){
        this.set(FIELD_PSAPPMENUID, pSAppMenuId);
    }
    
    /**
     * 获取 应用菜单  
     * @return
     */
    @JsonIgnore
    public String getPSAppMenuId(){
        Object objValue = this.get(FIELD_PSAPPMENUID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用菜单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppMenuIdDirty(){
        if(this.contains(FIELD_PSAPPMENUID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用菜单
     */
    @JsonIgnore
    public void resetPSAppMenuId(){
        this.reset(FIELD_PSAPPMENUID);
    }

    /**
     * 设置 应用菜单
     * <P>
     * 等同 {@link #setPSAppMenuId}
     * @param pSAppMenuId
     */
    @JsonIgnore
    public PSSysPortlet psappmenuid(String pSAppMenuId){
        this.setPSAppMenuId(pSAppMenuId);
        return this;
    }

    /**
     * 设置 应用菜单，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSAppMenuId}
     * @param pSAppMenu 引用对象
     */
    @JsonIgnore
    public PSSysPortlet psappmenuid(PSAppMenu pSAppMenu){
        if(pSAppMenu == null){
            this.setPSAppMenuId(null);
            this.setPSAppMenuName(null);
        }
        else{
            this.setPSAppMenuId(pSAppMenu.getPSAppMenuId());
            this.setPSAppMenuName(pSAppMenu.getPSAppMenuName());
        }
        return this;
    }

    /**
     * <B>PSAPPMENUNAME</B>&nbsp;应用菜单
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSAPPMENUID}
     */
    public final static String FIELD_PSAPPMENUNAME = "psappmenuname";

    /**
     * 设置 应用菜单
     * 
     * @param pSAppMenuName
     * 
     */
    @JsonProperty(FIELD_PSAPPMENUNAME)
    public void setPSAppMenuName(String pSAppMenuName){
        this.set(FIELD_PSAPPMENUNAME, pSAppMenuName);
    }
    
    /**
     * 获取 应用菜单  
     * @return
     */
    @JsonIgnore
    public String getPSAppMenuName(){
        Object objValue = this.get(FIELD_PSAPPMENUNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用菜单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppMenuNameDirty(){
        if(this.contains(FIELD_PSAPPMENUNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用菜单
     */
    @JsonIgnore
    public void resetPSAppMenuName(){
        this.reset(FIELD_PSAPPMENUNAME);
    }

    /**
     * 设置 应用菜单
     * <P>
     * 等同 {@link #setPSAppMenuName}
     * @param pSAppMenuName
     */
    @JsonIgnore
    public PSSysPortlet psappmenuname(String pSAppMenuName){
        this.setPSAppMenuName(pSAppMenuName);
        return this;
    }

    /**
     * <B>PSAPPVIEWID</B>&nbsp;应用视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSAppView} 
     */
    public final static String FIELD_PSAPPVIEWID = "psappviewid";

    /**
     * 设置 应用视图
     * 
     * @param pSAppViewId
     * 
     */
    @JsonProperty(FIELD_PSAPPVIEWID)
    public void setPSAppViewId(String pSAppViewId){
        this.set(FIELD_PSAPPVIEWID, pSAppViewId);
    }
    
    /**
     * 获取 应用视图  
     * @return
     */
    @JsonIgnore
    public String getPSAppViewId(){
        Object objValue = this.get(FIELD_PSAPPVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppViewIdDirty(){
        if(this.contains(FIELD_PSAPPVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用视图
     */
    @JsonIgnore
    public void resetPSAppViewId(){
        this.reset(FIELD_PSAPPVIEWID);
    }

    /**
     * 设置 应用视图
     * <P>
     * 等同 {@link #setPSAppViewId}
     * @param pSAppViewId
     */
    @JsonIgnore
    public PSSysPortlet psappviewid(String pSAppViewId){
        this.setPSAppViewId(pSAppViewId);
        return this;
    }

    /**
     * 设置 应用视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSAppViewId}
     * @param pSAppView 引用对象
     */
    @JsonIgnore
    public PSSysPortlet psappviewid(PSAppView pSAppView){
        if(pSAppView == null){
            this.setPSAppViewId(null);
            this.setPSAppViewName(null);
        }
        else{
            this.setPSAppViewId(pSAppView.getPSAppViewId());
            this.setPSAppViewName(pSAppView.getPSAppViewName());
        }
        return this;
    }

    /**
     * <B>PSAPPVIEWNAME</B>&nbsp;应用视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSAPPVIEWID}
     */
    public final static String FIELD_PSAPPVIEWNAME = "psappviewname";

    /**
     * 设置 应用视图
     * 
     * @param pSAppViewName
     * 
     */
    @JsonProperty(FIELD_PSAPPVIEWNAME)
    public void setPSAppViewName(String pSAppViewName){
        this.set(FIELD_PSAPPVIEWNAME, pSAppViewName);
    }
    
    /**
     * 获取 应用视图  
     * @return
     */
    @JsonIgnore
    public String getPSAppViewName(){
        Object objValue = this.get(FIELD_PSAPPVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppViewNameDirty(){
        if(this.contains(FIELD_PSAPPVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用视图
     */
    @JsonIgnore
    public void resetPSAppViewName(){
        this.reset(FIELD_PSAPPVIEWNAME);
    }

    /**
     * 设置 应用视图
     * <P>
     * 等同 {@link #setPSAppViewName}
     * @param pSAppViewName
     */
    @JsonIgnore
    public PSSysPortlet psappviewname(String pSAppViewName){
        this.setPSAppViewName(pSAppViewName);
        return this;
    }

    /**
     * <B>PSDECHARTID</B>&nbsp;实体图表，门户部件类型为【实体图表】时指定实体图表部件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEChart} 
     */
    public final static String FIELD_PSDECHARTID = "psdechartid";

    /**
     * 设置 实体图表，详细说明：{@link #FIELD_PSDECHARTID}
     * 
     * @param pSDEChartId
     * 
     */
    @JsonProperty(FIELD_PSDECHARTID)
    public void setPSDEChartId(String pSDEChartId){
        this.set(FIELD_PSDECHARTID, pSDEChartId);
    }
    
    /**
     * 获取 实体图表  
     * @return
     */
    @JsonIgnore
    public String getPSDEChartId(){
        Object objValue = this.get(FIELD_PSDECHARTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体图表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEChartIdDirty(){
        if(this.contains(FIELD_PSDECHARTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体图表
     */
    @JsonIgnore
    public void resetPSDEChartId(){
        this.reset(FIELD_PSDECHARTID);
    }

    /**
     * 设置 实体图表，详细说明：{@link #FIELD_PSDECHARTID}
     * <P>
     * 等同 {@link #setPSDEChartId}
     * @param pSDEChartId
     */
    @JsonIgnore
    public PSSysPortlet psdechartid(String pSDEChartId){
        this.setPSDEChartId(pSDEChartId);
        return this;
    }

    /**
     * 设置 实体图表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEChartId}
     * @param pSDEChart 引用对象
     */
    @JsonIgnore
    public PSSysPortlet psdechartid(PSDEChart pSDEChart){
        if(pSDEChart == null){
            this.setPSDEChartId(null);
            this.setPSDEChartName(null);
        }
        else{
            this.setPSDEChartId(pSDEChart.getPSDEChartId());
            this.setPSDEChartName(pSDEChart.getPSDEChartName());
        }
        return this;
    }

    /**
     * <B>PSDECHARTNAME</B>&nbsp;实体图表，门户部件类型为【实体图表】时指定实体图表部件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDECHARTID}
     */
    public final static String FIELD_PSDECHARTNAME = "psdechartname";

    /**
     * 设置 实体图表，详细说明：{@link #FIELD_PSDECHARTNAME}
     * 
     * @param pSDEChartName
     * 
     */
    @JsonProperty(FIELD_PSDECHARTNAME)
    public void setPSDEChartName(String pSDEChartName){
        this.set(FIELD_PSDECHARTNAME, pSDEChartName);
    }
    
    /**
     * 获取 实体图表  
     * @return
     */
    @JsonIgnore
    public String getPSDEChartName(){
        Object objValue = this.get(FIELD_PSDECHARTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体图表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEChartNameDirty(){
        if(this.contains(FIELD_PSDECHARTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体图表
     */
    @JsonIgnore
    public void resetPSDEChartName(){
        this.reset(FIELD_PSDECHARTNAME);
    }

    /**
     * 设置 实体图表，详细说明：{@link #FIELD_PSDECHARTNAME}
     * <P>
     * 等同 {@link #setPSDEChartName}
     * @param pSDEChartName
     */
    @JsonIgnore
    public PSSysPortlet psdechartname(String pSDEChartName){
        this.setPSDEChartName(pSDEChartName);
        return this;
    }

    /**
     * <B>PSDEDATAVIEWID</B>&nbsp;实体数据视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataView} 
     */
    public final static String FIELD_PSDEDATAVIEWID = "psdedataviewid";

    /**
     * 设置 实体数据视图
     * 
     * @param pSDEDataViewId
     * 
     */
    @JsonProperty(FIELD_PSDEDATAVIEWID)
    public void setPSDEDataViewId(String pSDEDataViewId){
        this.set(FIELD_PSDEDATAVIEWID, pSDEDataViewId);
    }
    
    /**
     * 获取 实体数据视图  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataViewId(){
        Object objValue = this.get(FIELD_PSDEDATAVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataViewIdDirty(){
        if(this.contains(FIELD_PSDEDATAVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据视图
     */
    @JsonIgnore
    public void resetPSDEDataViewId(){
        this.reset(FIELD_PSDEDATAVIEWID);
    }

    /**
     * 设置 实体数据视图
     * <P>
     * 等同 {@link #setPSDEDataViewId}
     * @param pSDEDataViewId
     */
    @JsonIgnore
    public PSSysPortlet psdedataviewid(String pSDEDataViewId){
        this.setPSDEDataViewId(pSDEDataViewId);
        return this;
    }

    /**
     * 设置 实体数据视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDataViewId}
     * @param pSDEDataView 引用对象
     */
    @JsonIgnore
    public PSSysPortlet psdedataviewid(PSDEDataView pSDEDataView){
        if(pSDEDataView == null){
            this.setPSDEDataViewId(null);
            this.setPSDEDataViewName(null);
        }
        else{
            this.setPSDEDataViewId(pSDEDataView.getPSDEDataViewId());
            this.setPSDEDataViewName(pSDEDataView.getPSDEDataViewName());
        }
        return this;
    }

    /**
     * <B>PSDEDATAVIEWNAME</B>&nbsp;实体数据视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDATAVIEWID}
     */
    public final static String FIELD_PSDEDATAVIEWNAME = "psdedataviewname";

    /**
     * 设置 实体数据视图
     * 
     * @param pSDEDataViewName
     * 
     */
    @JsonProperty(FIELD_PSDEDATAVIEWNAME)
    public void setPSDEDataViewName(String pSDEDataViewName){
        this.set(FIELD_PSDEDATAVIEWNAME, pSDEDataViewName);
    }
    
    /**
     * 获取 实体数据视图  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataViewName(){
        Object objValue = this.get(FIELD_PSDEDATAVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataViewNameDirty(){
        if(this.contains(FIELD_PSDEDATAVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据视图
     */
    @JsonIgnore
    public void resetPSDEDataViewName(){
        this.reset(FIELD_PSDEDATAVIEWNAME);
    }

    /**
     * 设置 实体数据视图
     * <P>
     * 等同 {@link #setPSDEDataViewName}
     * @param pSDEDataViewName
     */
    @JsonIgnore
    public PSSysPortlet psdedataviewname(String pSDEDataViewName){
        this.setPSDEDataViewName(pSDEDataViewName);
        return this;
    }

    /**
     * <B>PSDEDSID</B>&nbsp;实体数据集合，指定门户部件使用的数据集对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataSet} 
     */
    public final static String FIELD_PSDEDSID = "psdedsid";

    /**
     * 设置 实体数据集合，详细说明：{@link #FIELD_PSDEDSID}
     * 
     * @param pSDEDSId
     * 
     */
    @JsonProperty(FIELD_PSDEDSID)
    public void setPSDEDSId(String pSDEDSId){
        this.set(FIELD_PSDEDSID, pSDEDSId);
    }
    
    /**
     * 获取 实体数据集合  
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
     * 判断 实体数据集合 是否指定值，包括空值
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
     * 重置 实体数据集合
     */
    @JsonIgnore
    public void resetPSDEDSId(){
        this.reset(FIELD_PSDEDSID);
    }

    /**
     * 设置 实体数据集合，详细说明：{@link #FIELD_PSDEDSID}
     * <P>
     * 等同 {@link #setPSDEDSId}
     * @param pSDEDSId
     */
    @JsonIgnore
    public PSSysPortlet psdedsid(String pSDEDSId){
        this.setPSDEDSId(pSDEDSId);
        return this;
    }

    /**
     * 设置 实体数据集合，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDSId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSSysPortlet psdedsid(PSDEDataSet pSDEDataSet){
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
     * <B>PSDEDSNAME</B>&nbsp;实体数据集合，指定门户部件使用的数据集对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDSID}
     */
    public final static String FIELD_PSDEDSNAME = "psdedsname";

    /**
     * 设置 实体数据集合，详细说明：{@link #FIELD_PSDEDSNAME}
     * 
     * @param pSDEDSName
     * 
     */
    @JsonProperty(FIELD_PSDEDSNAME)
    public void setPSDEDSName(String pSDEDSName){
        this.set(FIELD_PSDEDSNAME, pSDEDSName);
    }
    
    /**
     * 获取 实体数据集合  
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
     * 判断 实体数据集合 是否指定值，包括空值
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
     * 重置 实体数据集合
     */
    @JsonIgnore
    public void resetPSDEDSName(){
        this.reset(FIELD_PSDEDSNAME);
    }

    /**
     * 设置 实体数据集合，详细说明：{@link #FIELD_PSDEDSNAME}
     * <P>
     * 等同 {@link #setPSDEDSName}
     * @param pSDEDSName
     */
    @JsonIgnore
    public PSSysPortlet psdedsname(String pSDEDSName){
        this.setPSDEDSName(pSDEDSName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定门户部件所在的实体对象
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
    public PSSysPortlet psdeid(String pSDEId){
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
    public PSSysPortlet psdeid(PSDataEntity pSDataEntity){
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
     * <B>PSDELISTID</B>&nbsp;实体列表，门户部件类型为【实体列表】时指定实体数据列表部件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEList} 
     */
    public final static String FIELD_PSDELISTID = "psdelistid";

    /**
     * 设置 实体列表，详细说明：{@link #FIELD_PSDELISTID}
     * 
     * @param pSDEListId
     * 
     */
    @JsonProperty(FIELD_PSDELISTID)
    public void setPSDEListId(String pSDEListId){
        this.set(FIELD_PSDELISTID, pSDEListId);
    }
    
    /**
     * 获取 实体列表  
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
     * 判断 实体列表 是否指定值，包括空值
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
     * 重置 实体列表
     */
    @JsonIgnore
    public void resetPSDEListId(){
        this.reset(FIELD_PSDELISTID);
    }

    /**
     * 设置 实体列表，详细说明：{@link #FIELD_PSDELISTID}
     * <P>
     * 等同 {@link #setPSDEListId}
     * @param pSDEListId
     */
    @JsonIgnore
    public PSSysPortlet psdelistid(String pSDEListId){
        this.setPSDEListId(pSDEListId);
        return this;
    }

    /**
     * 设置 实体列表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEListId}
     * @param pSDEList 引用对象
     */
    @JsonIgnore
    public PSSysPortlet psdelistid(PSDEList pSDEList){
        if(pSDEList == null){
            this.setPSDEListId(null);
            this.setPSDEListName(null);
        }
        else{
            this.setPSDEListId(pSDEList.getPSDEListId());
            this.setPSDEListName(pSDEList.getPSDEListName());
        }
        return this;
    }

    /**
     * <B>PSDELISTNAME</B>&nbsp;实体列表，门户部件类型为【实体列表】时指定实体数据列表部件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDELISTID}
     */
    public final static String FIELD_PSDELISTNAME = "psdelistname";

    /**
     * 设置 实体列表，详细说明：{@link #FIELD_PSDELISTNAME}
     * 
     * @param pSDEListName
     * 
     */
    @JsonProperty(FIELD_PSDELISTNAME)
    public void setPSDEListName(String pSDEListName){
        this.set(FIELD_PSDELISTNAME, pSDEListName);
    }
    
    /**
     * 获取 实体列表  
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
     * 判断 实体列表 是否指定值，包括空值
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
     * 重置 实体列表
     */
    @JsonIgnore
    public void resetPSDEListName(){
        this.reset(FIELD_PSDELISTNAME);
    }

    /**
     * 设置 实体列表，详细说明：{@link #FIELD_PSDELISTNAME}
     * <P>
     * 等同 {@link #setPSDEListName}
     * @param pSDEListName
     */
    @JsonIgnore
    public PSSysPortlet psdelistname(String pSDEListName){
        this.setPSDEListName(pSDEListName);
        return this;
    }

    /**
     * <B>PSDENAME</B>&nbsp;实体，指定门户部件所在的实体对象
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
    public PSSysPortlet psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSDEREPORTID</B>&nbsp;实体报表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEReport} 
     */
    public final static String FIELD_PSDEREPORTID = "psdereportid";

    /**
     * 设置 实体报表
     * 
     * @param pSDEReportId
     * 
     */
    @JsonProperty(FIELD_PSDEREPORTID)
    public void setPSDEReportId(String pSDEReportId){
        this.set(FIELD_PSDEREPORTID, pSDEReportId);
    }
    
    /**
     * 获取 实体报表  
     * @return
     */
    @JsonIgnore
    public String getPSDEReportId(){
        Object objValue = this.get(FIELD_PSDEREPORTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体报表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEReportIdDirty(){
        if(this.contains(FIELD_PSDEREPORTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体报表
     */
    @JsonIgnore
    public void resetPSDEReportId(){
        this.reset(FIELD_PSDEREPORTID);
    }

    /**
     * 设置 实体报表
     * <P>
     * 等同 {@link #setPSDEReportId}
     * @param pSDEReportId
     */
    @JsonIgnore
    public PSSysPortlet psdereportid(String pSDEReportId){
        this.setPSDEReportId(pSDEReportId);
        return this;
    }

    /**
     * 设置 实体报表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEReportId}
     * @param pSDEReport 引用对象
     */
    @JsonIgnore
    public PSSysPortlet psdereportid(PSDEReport pSDEReport){
        if(pSDEReport == null){
            this.setPSDEReportId(null);
            this.setPSDEReportName(null);
        }
        else{
            this.setPSDEReportId(pSDEReport.getPSDEReportId());
            this.setPSDEReportName(pSDEReport.getPSDEReportName());
        }
        return this;
    }

    /**
     * <B>PSDEREPORTNAME</B>&nbsp;实体报表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEREPORTID}
     */
    public final static String FIELD_PSDEREPORTNAME = "psdereportname";

    /**
     * 设置 实体报表
     * 
     * @param pSDEReportName
     * 
     */
    @JsonProperty(FIELD_PSDEREPORTNAME)
    public void setPSDEReportName(String pSDEReportName){
        this.set(FIELD_PSDEREPORTNAME, pSDEReportName);
    }
    
    /**
     * 获取 实体报表  
     * @return
     */
    @JsonIgnore
    public String getPSDEReportName(){
        Object objValue = this.get(FIELD_PSDEREPORTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体报表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEReportNameDirty(){
        if(this.contains(FIELD_PSDEREPORTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体报表
     */
    @JsonIgnore
    public void resetPSDEReportName(){
        this.reset(FIELD_PSDEREPORTNAME);
    }

    /**
     * 设置 实体报表
     * <P>
     * 等同 {@link #setPSDEReportName}
     * @param pSDEReportName
     */
    @JsonIgnore
    public PSSysPortlet psdereportname(String pSDEReportName){
        this.setPSDEReportName(pSDEReportName);
        return this;
    }

    /**
     * <B>PSDETOOLBARID</B>&nbsp;工具栏，门户部件类型为【工具栏】时指定实体工具栏部件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEToolbar} 
     */
    public final static String FIELD_PSDETOOLBARID = "psdetoolbarid";

    /**
     * 设置 工具栏，详细说明：{@link #FIELD_PSDETOOLBARID}
     * 
     * @param pSDEToolbarId
     * 
     */
    @JsonProperty(FIELD_PSDETOOLBARID)
    public void setPSDEToolbarId(String pSDEToolbarId){
        this.set(FIELD_PSDETOOLBARID, pSDEToolbarId);
    }
    
    /**
     * 获取 工具栏  
     * @return
     */
    @JsonIgnore
    public String getPSDEToolbarId(){
        Object objValue = this.get(FIELD_PSDETOOLBARID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工具栏 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEToolbarIdDirty(){
        if(this.contains(FIELD_PSDETOOLBARID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工具栏
     */
    @JsonIgnore
    public void resetPSDEToolbarId(){
        this.reset(FIELD_PSDETOOLBARID);
    }

    /**
     * 设置 工具栏，详细说明：{@link #FIELD_PSDETOOLBARID}
     * <P>
     * 等同 {@link #setPSDEToolbarId}
     * @param pSDEToolbarId
     */
    @JsonIgnore
    public PSSysPortlet psdetoolbarid(String pSDEToolbarId){
        this.setPSDEToolbarId(pSDEToolbarId);
        return this;
    }

    /**
     * 设置 工具栏，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEToolbarId}
     * @param pSDEToolbar 引用对象
     */
    @JsonIgnore
    public PSSysPortlet psdetoolbarid(PSDEToolbar pSDEToolbar){
        if(pSDEToolbar == null){
            this.setPSDEToolbarId(null);
            this.setPSDEToolbarName(null);
        }
        else{
            this.setPSDEToolbarId(pSDEToolbar.getPSDEToolbarId());
            this.setPSDEToolbarName(pSDEToolbar.getPSDEToolbarName());
        }
        return this;
    }

    /**
     * <B>PSDETOOLBARNAME</B>&nbsp;工具栏，门户部件类型为【工具栏】时指定实体工具栏部件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDETOOLBARID}
     */
    public final static String FIELD_PSDETOOLBARNAME = "psdetoolbarname";

    /**
     * 设置 工具栏，详细说明：{@link #FIELD_PSDETOOLBARNAME}
     * 
     * @param pSDEToolbarName
     * 
     */
    @JsonProperty(FIELD_PSDETOOLBARNAME)
    public void setPSDEToolbarName(String pSDEToolbarName){
        this.set(FIELD_PSDETOOLBARNAME, pSDEToolbarName);
    }
    
    /**
     * 获取 工具栏  
     * @return
     */
    @JsonIgnore
    public String getPSDEToolbarName(){
        Object objValue = this.get(FIELD_PSDETOOLBARNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工具栏 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEToolbarNameDirty(){
        if(this.contains(FIELD_PSDETOOLBARNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工具栏
     */
    @JsonIgnore
    public void resetPSDEToolbarName(){
        this.reset(FIELD_PSDETOOLBARNAME);
    }

    /**
     * 设置 工具栏，详细说明：{@link #FIELD_PSDETOOLBARNAME}
     * <P>
     * 等同 {@link #setPSDEToolbarName}
     * @param pSDEToolbarName
     */
    @JsonIgnore
    public PSSysPortlet psdetoolbarname(String pSDEToolbarName){
        this.setPSDEToolbarName(pSDEToolbarName);
        return this;
    }

    /**
     * <B>PSDEUAGROUPID</B>&nbsp;界面行为组，指定门户部件的界面行为组对象，门户部件类型为【操作栏】时在部件内容区输出界面行为，其它类型在标题区绘制，为部件提供更多操作的能力
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEUAGroup} 
     */
    public final static String FIELD_PSDEUAGROUPID = "psdeuagroupid";

    /**
     * 设置 界面行为组，详细说明：{@link #FIELD_PSDEUAGROUPID}
     * 
     * @param pSDEUAGroupId
     * 
     */
    @JsonProperty(FIELD_PSDEUAGROUPID)
    public void setPSDEUAGroupId(String pSDEUAGroupId){
        this.set(FIELD_PSDEUAGROUPID, pSDEUAGroupId);
    }
    
    /**
     * 获取 界面行为组  
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
     * 判断 界面行为组 是否指定值，包括空值
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
     * 重置 界面行为组
     */
    @JsonIgnore
    public void resetPSDEUAGroupId(){
        this.reset(FIELD_PSDEUAGROUPID);
    }

    /**
     * 设置 界面行为组，详细说明：{@link #FIELD_PSDEUAGROUPID}
     * <P>
     * 等同 {@link #setPSDEUAGroupId}
     * @param pSDEUAGroupId
     */
    @JsonIgnore
    public PSSysPortlet psdeuagroupid(String pSDEUAGroupId){
        this.setPSDEUAGroupId(pSDEUAGroupId);
        return this;
    }

    /**
     * 设置 界面行为组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEUAGroupId}
     * @param pSDEUAGroup 引用对象
     */
    @JsonIgnore
    public PSSysPortlet psdeuagroupid(PSDEUAGroup pSDEUAGroup){
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
     * <B>PSDEUAGROUPNAME</B>&nbsp;界面行为组，指定门户部件的界面行为组对象，门户部件类型为【操作栏】时在部件内容区输出界面行为，其它类型在标题区绘制，为部件提供更多操作的能力
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEUAGROUPID}
     */
    public final static String FIELD_PSDEUAGROUPNAME = "psdeuagroupname";

    /**
     * 设置 界面行为组，详细说明：{@link #FIELD_PSDEUAGROUPNAME}
     * 
     * @param pSDEUAGroupName
     * 
     */
    @JsonProperty(FIELD_PSDEUAGROUPNAME)
    public void setPSDEUAGroupName(String pSDEUAGroupName){
        this.set(FIELD_PSDEUAGROUPNAME, pSDEUAGroupName);
    }
    
    /**
     * 获取 界面行为组  
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
     * 判断 界面行为组 是否指定值，包括空值
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
     * 重置 界面行为组
     */
    @JsonIgnore
    public void resetPSDEUAGroupName(){
        this.reset(FIELD_PSDEUAGROUPNAME);
    }

    /**
     * 设置 界面行为组，详细说明：{@link #FIELD_PSDEUAGROUPNAME}
     * <P>
     * 等同 {@link #setPSDEUAGroupName}
     * @param pSDEUAGroupName
     */
    @JsonIgnore
    public PSSysPortlet psdeuagroupname(String pSDEUAGroupName){
        this.setPSDEUAGroupName(pSDEUAGroupName);
        return this;
    }

    /**
     * <B>PSDEVIEWID</B>&nbsp;实体视图，门户部件类型为【实体视图】时指定实体视图对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_PSDEVIEWID = "psdeviewid";

    /**
     * 设置 实体视图，详细说明：{@link #FIELD_PSDEVIEWID}
     * 
     * @param pSDEViewId
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWID)
    public void setPSDEViewId(String pSDEViewId){
        this.set(FIELD_PSDEVIEWID, pSDEViewId);
    }
    
    /**
     * 获取 实体视图  
     * @return
     */
    @JsonIgnore
    public String getPSDEViewId(){
        Object objValue = this.get(FIELD_PSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEViewIdDirty(){
        if(this.contains(FIELD_PSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体视图
     */
    @JsonIgnore
    public void resetPSDEViewId(){
        this.reset(FIELD_PSDEVIEWID);
    }

    /**
     * 设置 实体视图，详细说明：{@link #FIELD_PSDEVIEWID}
     * <P>
     * 等同 {@link #setPSDEViewId}
     * @param pSDEViewId
     */
    @JsonIgnore
    public PSSysPortlet psdeviewid(String pSDEViewId){
        this.setPSDEViewId(pSDEViewId);
        return this;
    }

    /**
     * 设置 实体视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSSysPortlet psdeviewid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setPSDEViewId(null);
            this.setPSDEViewName(null);
        }
        else{
            this.setPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>PSDEVIEWNAME</B>&nbsp;实体视图，门户部件类型为【实体视图】时指定实体视图对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVIEWID}
     */
    public final static String FIELD_PSDEVIEWNAME = "psdeviewname";

    /**
     * 设置 实体视图，详细说明：{@link #FIELD_PSDEVIEWNAME}
     * 
     * @param pSDEViewName
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWNAME)
    public void setPSDEViewName(String pSDEViewName){
        this.set(FIELD_PSDEVIEWNAME, pSDEViewName);
    }
    
    /**
     * 获取 实体视图  
     * @return
     */
    @JsonIgnore
    public String getPSDEViewName(){
        Object objValue = this.get(FIELD_PSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEViewNameDirty(){
        if(this.contains(FIELD_PSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体视图
     */
    @JsonIgnore
    public void resetPSDEViewName(){
        this.reset(FIELD_PSDEVIEWNAME);
    }

    /**
     * 设置 实体视图，详细说明：{@link #FIELD_PSDEVIEWNAME}
     * <P>
     * 等同 {@link #setPSDEViewName}
     * @param pSDEViewName
     */
    @JsonIgnore
    public PSSysPortlet psdeviewname(String pSDEViewName){
        this.setPSDEViewName(pSDEViewName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定系统门户部件所在的系统模块
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
    public PSSysPortlet psmoduleid(String pSModuleId){
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
    public PSSysPortlet psmoduleid(PSModule pSModule){
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
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定系统门户部件所在的系统模块
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
    public PSSysPortlet psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSPORTLETID</B>&nbsp;预置门户部件，指定平台预置的门户部件
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSPORTLETID = "psportletid";

    /**
     * 设置 预置门户部件，详细说明：{@link #FIELD_PSPORTLETID}
     * 
     * @param pSPortletId
     * 
     */
    @JsonProperty(FIELD_PSPORTLETID)
    public void setPSPortletId(String pSPortletId){
        this.set(FIELD_PSPORTLETID, pSPortletId);
    }
    
    /**
     * 获取 预置门户部件  
     * @return
     */
    @JsonIgnore
    public String getPSPortletId(){
        Object objValue = this.get(FIELD_PSPORTLETID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预置门户部件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSPortletIdDirty(){
        if(this.contains(FIELD_PSPORTLETID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预置门户部件
     */
    @JsonIgnore
    public void resetPSPortletId(){
        this.reset(FIELD_PSPORTLETID);
    }

    /**
     * 设置 预置门户部件，详细说明：{@link #FIELD_PSPORTLETID}
     * <P>
     * 等同 {@link #setPSPortletId}
     * @param pSPortletId
     */
    @JsonIgnore
    public PSSysPortlet psportletid(String pSPortletId){
        this.setPSPortletId(pSPortletId);
        return this;
    }

    /**
     * <B>PSPORTLETNAME</B>&nbsp;预置门户部件，指定平台预置的门户部件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSPORTLETID}
     */
    public final static String FIELD_PSPORTLETNAME = "psportletname";

    /**
     * 设置 预置门户部件，详细说明：{@link #FIELD_PSPORTLETNAME}
     * 
     * @param pSPortletName
     * 
     */
    @JsonProperty(FIELD_PSPORTLETNAME)
    public void setPSPortletName(String pSPortletName){
        this.set(FIELD_PSPORTLETNAME, pSPortletName);
    }
    
    /**
     * 获取 预置门户部件  
     * @return
     */
    @JsonIgnore
    public String getPSPortletName(){
        Object objValue = this.get(FIELD_PSPORTLETNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预置门户部件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSPortletNameDirty(){
        if(this.contains(FIELD_PSPORTLETNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预置门户部件
     */
    @JsonIgnore
    public void resetPSPortletName(){
        this.reset(FIELD_PSPORTLETNAME);
    }

    /**
     * 设置 预置门户部件，详细说明：{@link #FIELD_PSPORTLETNAME}
     * <P>
     * 等同 {@link #setPSPortletName}
     * @param pSPortletName
     */
    @JsonIgnore
    public PSSysPortlet psportletname(String pSPortletName){
        this.setPSPortletName(pSPortletName);
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
    public PSSysPortlet pssysappname(String pSSysAppName){
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    /**
     * <B>PSSYSCALENDARID</B>&nbsp;日历部件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCalendar} 
     */
    public final static String FIELD_PSSYSCALENDARID = "pssyscalendarid";

    /**
     * 设置 日历部件
     * 
     * @param pSSysCalendarId
     * 
     */
    @JsonProperty(FIELD_PSSYSCALENDARID)
    public void setPSSysCalendarId(String pSSysCalendarId){
        this.set(FIELD_PSSYSCALENDARID, pSSysCalendarId);
    }
    
    /**
     * 获取 日历部件  
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
     * 判断 日历部件 是否指定值，包括空值
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
     * 重置 日历部件
     */
    @JsonIgnore
    public void resetPSSysCalendarId(){
        this.reset(FIELD_PSSYSCALENDARID);
    }

    /**
     * 设置 日历部件
     * <P>
     * 等同 {@link #setPSSysCalendarId}
     * @param pSSysCalendarId
     */
    @JsonIgnore
    public PSSysPortlet pssyscalendarid(String pSSysCalendarId){
        this.setPSSysCalendarId(pSSysCalendarId);
        return this;
    }

    /**
     * 设置 日历部件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCalendarId}
     * @param pSSysCalendar 引用对象
     */
    @JsonIgnore
    public PSSysPortlet pssyscalendarid(PSSysCalendar pSSysCalendar){
        if(pSSysCalendar == null){
            this.setPSSysCalendarId(null);
            this.setPSSysCalendarName(null);
        }
        else{
            this.setPSSysCalendarId(pSSysCalendar.getPSSysCalendarId());
            this.setPSSysCalendarName(pSSysCalendar.getPSSysCalendarName());
        }
        return this;
    }

    /**
     * <B>PSSYSCALENDARNAME</B>&nbsp;日历部件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSCALENDARID}
     */
    public final static String FIELD_PSSYSCALENDARNAME = "pssyscalendarname";

    /**
     * 设置 日历部件
     * 
     * @param pSSysCalendarName
     * 
     */
    @JsonProperty(FIELD_PSSYSCALENDARNAME)
    public void setPSSysCalendarName(String pSSysCalendarName){
        this.set(FIELD_PSSYSCALENDARNAME, pSSysCalendarName);
    }
    
    /**
     * 获取 日历部件  
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
     * 判断 日历部件 是否指定值，包括空值
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
     * 重置 日历部件
     */
    @JsonIgnore
    public void resetPSSysCalendarName(){
        this.reset(FIELD_PSSYSCALENDARNAME);
    }

    /**
     * 设置 日历部件
     * <P>
     * 等同 {@link #setPSSysCalendarName}
     * @param pSSysCalendarName
     */
    @JsonIgnore
    public PSSysPortlet pssyscalendarname(String pSSysCalendarName){
        this.setPSSysCalendarName(pSSysCalendarName);
        return this;
    }

    /**
     * <B>PSSYSCSSID</B>&nbsp;系统界面样式，指定门户部件的界面样式表对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCss} 
     */
    public final static String FIELD_PSSYSCSSID = "pssyscssid";

    /**
     * 设置 系统界面样式，详细说明：{@link #FIELD_PSSYSCSSID}
     * 
     * @param pSSysCssId
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSID)
    public void setPSSysCssId(String pSSysCssId){
        this.set(FIELD_PSSYSCSSID, pSSysCssId);
    }
    
    /**
     * 获取 系统界面样式  
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
     * 判断 系统界面样式 是否指定值，包括空值
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
     * 重置 系统界面样式
     */
    @JsonIgnore
    public void resetPSSysCssId(){
        this.reset(FIELD_PSSYSCSSID);
    }

    /**
     * 设置 系统界面样式，详细说明：{@link #FIELD_PSSYSCSSID}
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCssId
     */
    @JsonIgnore
    public PSSysPortlet pssyscssid(String pSSysCssId){
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    /**
     * 设置 系统界面样式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSSysPortlet pssyscssid(PSSysCss pSSysCss){
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
     * <B>PSSYSCSSNAME</B>&nbsp;界面样式表，指定门户部件的界面样式表对象
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
    public PSSysPortlet pssyscssname(String pSSysCssName){
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    /**
     * <B>PSSYSIMAGEID</B>&nbsp;系统图片，指定门户部件的图片对象，各类型的部件自行约定放置位置
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysImage} 
     */
    public final static String FIELD_PSSYSIMAGEID = "pssysimageid";

    /**
     * 设置 系统图片，详细说明：{@link #FIELD_PSSYSIMAGEID}
     * 
     * @param pSSysImageId
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGEID)
    public void setPSSysImageId(String pSSysImageId){
        this.set(FIELD_PSSYSIMAGEID, pSSysImageId);
    }
    
    /**
     * 获取 系统图片  
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
     * 判断 系统图片 是否指定值，包括空值
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
     * 重置 系统图片
     */
    @JsonIgnore
    public void resetPSSysImageId(){
        this.reset(FIELD_PSSYSIMAGEID);
    }

    /**
     * 设置 系统图片，详细说明：{@link #FIELD_PSSYSIMAGEID}
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImageId
     */
    @JsonIgnore
    public PSSysPortlet pssysimageid(String pSSysImageId){
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    /**
     * 设置 系统图片，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImage 引用对象
     */
    @JsonIgnore
    public PSSysPortlet pssysimageid(PSSysImage pSSysImage){
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
     * <B>PSSYSIMAGENAME</B>&nbsp;系统图片，指定门户部件的图片对象，各类型的部件自行约定放置位置
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSIMAGEID}
     */
    public final static String FIELD_PSSYSIMAGENAME = "pssysimagename";

    /**
     * 设置 系统图片，详细说明：{@link #FIELD_PSSYSIMAGENAME}
     * 
     * @param pSSysImageName
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGENAME)
    public void setPSSysImageName(String pSSysImageName){
        this.set(FIELD_PSSYSIMAGENAME, pSSysImageName);
    }
    
    /**
     * 获取 系统图片  
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
     * 判断 系统图片 是否指定值，包括空值
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
     * 重置 系统图片
     */
    @JsonIgnore
    public void resetPSSysImageName(){
        this.reset(FIELD_PSSYSIMAGENAME);
    }

    /**
     * 设置 系统图片，详细说明：{@link #FIELD_PSSYSIMAGENAME}
     * <P>
     * 等同 {@link #setPSSysImageName}
     * @param pSSysImageName
     */
    @JsonIgnore
    public PSSysPortlet pssysimagename(String pSSysImageName){
        this.setPSSysImageName(pSSysImageName);
        return this;
    }

    /**
     * <B>PSSYSMAPVIEWID</B>&nbsp;地图部件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysMapView} 
     */
    public final static String FIELD_PSSYSMAPVIEWID = "pssysmapviewid";

    /**
     * 设置 地图部件
     * 
     * @param pSSysMapViewId
     * 
     */
    @JsonProperty(FIELD_PSSYSMAPVIEWID)
    public void setPSSysMapViewId(String pSSysMapViewId){
        this.set(FIELD_PSSYSMAPVIEWID, pSSysMapViewId);
    }
    
    /**
     * 获取 地图部件  
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
     * 判断 地图部件 是否指定值，包括空值
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
     * 重置 地图部件
     */
    @JsonIgnore
    public void resetPSSysMapViewId(){
        this.reset(FIELD_PSSYSMAPVIEWID);
    }

    /**
     * 设置 地图部件
     * <P>
     * 等同 {@link #setPSSysMapViewId}
     * @param pSSysMapViewId
     */
    @JsonIgnore
    public PSSysPortlet pssysmapviewid(String pSSysMapViewId){
        this.setPSSysMapViewId(pSSysMapViewId);
        return this;
    }

    /**
     * 设置 地图部件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysMapViewId}
     * @param pSSysMapView 引用对象
     */
    @JsonIgnore
    public PSSysPortlet pssysmapviewid(PSSysMapView pSSysMapView){
        if(pSSysMapView == null){
            this.setPSSysMapViewId(null);
            this.setPSSysMapViewName(null);
        }
        else{
            this.setPSSysMapViewId(pSSysMapView.getPSSysMapViewId());
            this.setPSSysMapViewName(pSSysMapView.getPSSysMapViewName());
        }
        return this;
    }

    /**
     * <B>PSSYSMAPVIEWNAME</B>&nbsp;地图部件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSMAPVIEWID}
     */
    public final static String FIELD_PSSYSMAPVIEWNAME = "pssysmapviewname";

    /**
     * 设置 地图部件
     * 
     * @param pSSysMapViewName
     * 
     */
    @JsonProperty(FIELD_PSSYSMAPVIEWNAME)
    public void setPSSysMapViewName(String pSSysMapViewName){
        this.set(FIELD_PSSYSMAPVIEWNAME, pSSysMapViewName);
    }
    
    /**
     * 获取 地图部件  
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
     * 判断 地图部件 是否指定值，包括空值
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
     * 重置 地图部件
     */
    @JsonIgnore
    public void resetPSSysMapViewName(){
        this.reset(FIELD_PSSYSMAPVIEWNAME);
    }

    /**
     * 设置 地图部件
     * <P>
     * 等同 {@link #setPSSysMapViewName}
     * @param pSSysMapViewName
     */
    @JsonIgnore
    public PSSysPortlet pssysmapviewname(String pSSysMapViewName){
        this.setPSSysMapViewName(pSSysMapViewName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端扩展插件，指定系统门户部件使用的前端模板扩展插件，使用插件类型【自定义门户部件绘制插件】
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
    public PSSysPortlet pssyspfpluginid(String pSSysPFPluginId){
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
    public PSSysPortlet pssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
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
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端扩展插件，指定系统门户部件使用的前端模板扩展插件，使用插件类型【自定义门户部件绘制插件】
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
    public PSSysPortlet pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    /**
     * <B>PSSYSPORTLETCATID</B>&nbsp;部件分类，指定门户部件的分类对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysPortletCat} 
     */
    public final static String FIELD_PSSYSPORTLETCATID = "pssysportletcatid";

    /**
     * 设置 部件分类，详细说明：{@link #FIELD_PSSYSPORTLETCATID}
     * 
     * @param pSSysPortletCatId
     * 
     */
    @JsonProperty(FIELD_PSSYSPORTLETCATID)
    public void setPSSysPortletCatId(String pSSysPortletCatId){
        this.set(FIELD_PSSYSPORTLETCATID, pSSysPortletCatId);
    }
    
    /**
     * 获取 部件分类  
     * @return
     */
    @JsonIgnore
    public String getPSSysPortletCatId(){
        Object objValue = this.get(FIELD_PSSYSPORTLETCATID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件分类 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysPortletCatIdDirty(){
        if(this.contains(FIELD_PSSYSPORTLETCATID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件分类
     */
    @JsonIgnore
    public void resetPSSysPortletCatId(){
        this.reset(FIELD_PSSYSPORTLETCATID);
    }

    /**
     * 设置 部件分类，详细说明：{@link #FIELD_PSSYSPORTLETCATID}
     * <P>
     * 等同 {@link #setPSSysPortletCatId}
     * @param pSSysPortletCatId
     */
    @JsonIgnore
    public PSSysPortlet pssysportletcatid(String pSSysPortletCatId){
        this.setPSSysPortletCatId(pSSysPortletCatId);
        return this;
    }

    /**
     * 设置 部件分类，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysPortletCatId}
     * @param pSSysPortletCat 引用对象
     */
    @JsonIgnore
    public PSSysPortlet pssysportletcatid(PSSysPortletCat pSSysPortletCat){
        if(pSSysPortletCat == null){
            this.setPSSysPortletCatId(null);
            this.setPSSysPortletCatName(null);
        }
        else{
            this.setPSSysPortletCatId(pSSysPortletCat.getPSSysPortletCatId());
            this.setPSSysPortletCatName(pSSysPortletCat.getPSSysPortletCatName());
        }
        return this;
    }

    /**
     * <B>PSSYSPORTLETCATNAME</B>&nbsp;部件分类，指定门户部件的分类对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSPORTLETCATID}
     */
    public final static String FIELD_PSSYSPORTLETCATNAME = "pssysportletcatname";

    /**
     * 设置 部件分类，详细说明：{@link #FIELD_PSSYSPORTLETCATNAME}
     * 
     * @param pSSysPortletCatName
     * 
     */
    @JsonProperty(FIELD_PSSYSPORTLETCATNAME)
    public void setPSSysPortletCatName(String pSSysPortletCatName){
        this.set(FIELD_PSSYSPORTLETCATNAME, pSSysPortletCatName);
    }
    
    /**
     * 获取 部件分类  
     * @return
     */
    @JsonIgnore
    public String getPSSysPortletCatName(){
        Object objValue = this.get(FIELD_PSSYSPORTLETCATNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件分类 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysPortletCatNameDirty(){
        if(this.contains(FIELD_PSSYSPORTLETCATNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件分类
     */
    @JsonIgnore
    public void resetPSSysPortletCatName(){
        this.reset(FIELD_PSSYSPORTLETCATNAME);
    }

    /**
     * 设置 部件分类，详细说明：{@link #FIELD_PSSYSPORTLETCATNAME}
     * <P>
     * 等同 {@link #setPSSysPortletCatName}
     * @param pSSysPortletCatName
     */
    @JsonIgnore
    public PSSysPortlet pssysportletcatname(String pSSysPortletCatName){
        this.setPSSysPortletCatName(pSSysPortletCatName);
        return this;
    }

    /**
     * <B>PSSYSPORTLETID</B>&nbsp;系统门户部件标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSPORTLETID = "pssysportletid";

    /**
     * 设置 系统门户部件标识
     * 
     * @param pSSysPortletId
     * 
     */
    @JsonProperty(FIELD_PSSYSPORTLETID)
    public void setPSSysPortletId(String pSSysPortletId){
        this.set(FIELD_PSSYSPORTLETID, pSSysPortletId);
    }
    
    /**
     * 获取 系统门户部件标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysPortletId(){
        Object objValue = this.get(FIELD_PSSYSPORTLETID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统门户部件标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysPortletIdDirty(){
        if(this.contains(FIELD_PSSYSPORTLETID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统门户部件标识
     */
    @JsonIgnore
    public void resetPSSysPortletId(){
        this.reset(FIELD_PSSYSPORTLETID);
    }

    /**
     * 设置 系统门户部件标识
     * <P>
     * 等同 {@link #setPSSysPortletId}
     * @param pSSysPortletId
     */
    @JsonIgnore
    public PSSysPortlet pssysportletid(String pSSysPortletId){
        this.setPSSysPortletId(pSSysPortletId);
        return this;
    }

    /**
     * <B>PSSYSPORTLETNAME</B>&nbsp;门户部件名称，指定门户部件的名称，需要在所在的模型域（实体、系统模块或系统）中具有唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSPORTLETNAME = "pssysportletname";

    /**
     * 设置 门户部件名称，详细说明：{@link #FIELD_PSSYSPORTLETNAME}
     * 
     * @param pSSysPortletName
     * 
     */
    @JsonProperty(FIELD_PSSYSPORTLETNAME)
    public void setPSSysPortletName(String pSSysPortletName){
        this.set(FIELD_PSSYSPORTLETNAME, pSSysPortletName);
    }
    
    /**
     * 获取 门户部件名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysPortletName(){
        Object objValue = this.get(FIELD_PSSYSPORTLETNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 门户部件名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysPortletNameDirty(){
        if(this.contains(FIELD_PSSYSPORTLETNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 门户部件名称
     */
    @JsonIgnore
    public void resetPSSysPortletName(){
        this.reset(FIELD_PSSYSPORTLETNAME);
    }

    /**
     * 设置 门户部件名称，详细说明：{@link #FIELD_PSSYSPORTLETNAME}
     * <P>
     * 等同 {@link #setPSSysPortletName}
     * @param pSSysPortletName
     */
    @JsonIgnore
    public PSSysPortlet pssysportletname(String pSSysPortletName){
        this.setPSSysPortletName(pSSysPortletName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysPortletName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysPortletName(strName);
    }

    @JsonIgnore
    public PSSysPortlet name(String strName){
        this.setPSSysPortletName(strName);
        return this;
    }

    /**
     * <B>PSSYSREQITEMID</B>&nbsp;系统设计需求
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysReqItem} 
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
    public PSSysPortlet pssysreqitemid(String pSSysReqItemId){
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
    public PSSysPortlet pssysreqitemid(PSSysReqItem pSSysReqItem){
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
    public PSSysPortlet pssysreqitemname(String pSSysReqItemName){
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    /**
     * <B>PSSYSUNIRESID</B>&nbsp;系统统一资源，指定门户部件的统一资源对象，需要具备指定统一资源的用户才能加载门户部件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysUniRes} 
     */
    public final static String FIELD_PSSYSUNIRESID = "pssysuniresid";

    /**
     * 设置 系统统一资源，详细说明：{@link #FIELD_PSSYSUNIRESID}
     * 
     * @param pSSysUniResId
     * 
     */
    @JsonProperty(FIELD_PSSYSUNIRESID)
    public void setPSSysUniResId(String pSSysUniResId){
        this.set(FIELD_PSSYSUNIRESID, pSSysUniResId);
    }
    
    /**
     * 获取 系统统一资源  
     * @return
     */
    @JsonIgnore
    public String getPSSysUniResId(){
        Object objValue = this.get(FIELD_PSSYSUNIRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统统一资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUniResIdDirty(){
        if(this.contains(FIELD_PSSYSUNIRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统统一资源
     */
    @JsonIgnore
    public void resetPSSysUniResId(){
        this.reset(FIELD_PSSYSUNIRESID);
    }

    /**
     * 设置 系统统一资源，详细说明：{@link #FIELD_PSSYSUNIRESID}
     * <P>
     * 等同 {@link #setPSSysUniResId}
     * @param pSSysUniResId
     */
    @JsonIgnore
    public PSSysPortlet pssysuniresid(String pSSysUniResId){
        this.setPSSysUniResId(pSSysUniResId);
        return this;
    }

    /**
     * 设置 系统统一资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysUniResId}
     * @param pSSysUniRes 引用对象
     */
    @JsonIgnore
    public PSSysPortlet pssysuniresid(PSSysUniRes pSSysUniRes){
        if(pSSysUniRes == null){
            this.setPSSysUniResId(null);
            this.setPSSysUniResName(null);
        }
        else{
            this.setPSSysUniResId(pSSysUniRes.getPSSysUniResId());
            this.setPSSysUniResName(pSSysUniRes.getPSSysUniResName());
        }
        return this;
    }

    /**
     * <B>PSSYSUNIRESNAME</B>&nbsp;系统统一资源，指定门户部件的统一资源对象，需要具备指定统一资源的用户才能加载门户部件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSUNIRESID}
     */
    public final static String FIELD_PSSYSUNIRESNAME = "pssysuniresname";

    /**
     * 设置 系统统一资源，详细说明：{@link #FIELD_PSSYSUNIRESNAME}
     * 
     * @param pSSysUniResName
     * 
     */
    @JsonProperty(FIELD_PSSYSUNIRESNAME)
    public void setPSSysUniResName(String pSSysUniResName){
        this.set(FIELD_PSSYSUNIRESNAME, pSSysUniResName);
    }
    
    /**
     * 获取 系统统一资源  
     * @return
     */
    @JsonIgnore
    public String getPSSysUniResName(){
        Object objValue = this.get(FIELD_PSSYSUNIRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统统一资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUniResNameDirty(){
        if(this.contains(FIELD_PSSYSUNIRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统统一资源
     */
    @JsonIgnore
    public void resetPSSysUniResName(){
        this.reset(FIELD_PSSYSUNIRESNAME);
    }

    /**
     * 设置 系统统一资源，详细说明：{@link #FIELD_PSSYSUNIRESNAME}
     * <P>
     * 等同 {@link #setPSSysUniResName}
     * @param pSSysUniResName
     */
    @JsonIgnore
    public PSSysPortlet pssysuniresname(String pSSysUniResName){
        this.setPSSysUniResName(pSSysUniResName);
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELID</B>&nbsp;面板
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysViewPanel} 
     */
    public final static String FIELD_PSSYSVIEWPANELID = "pssysviewpanelid";

    /**
     * 设置 面板
     * 
     * @param pSSysViewPanelId
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELID)
    public void setPSSysViewPanelId(String pSSysViewPanelId){
        this.set(FIELD_PSSYSVIEWPANELID, pSSysViewPanelId);
    }
    
    /**
     * 获取 面板  
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
     * 判断 面板 是否指定值，包括空值
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
     * 重置 面板
     */
    @JsonIgnore
    public void resetPSSysViewPanelId(){
        this.reset(FIELD_PSSYSVIEWPANELID);
    }

    /**
     * 设置 面板
     * <P>
     * 等同 {@link #setPSSysViewPanelId}
     * @param pSSysViewPanelId
     */
    @JsonIgnore
    public PSSysPortlet pssysviewpanelid(String pSSysViewPanelId){
        this.setPSSysViewPanelId(pSSysViewPanelId);
        return this;
    }

    /**
     * 设置 面板，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysViewPanelId}
     * @param pSSysViewPanel 引用对象
     */
    @JsonIgnore
    public PSSysPortlet pssysviewpanelid(PSSysViewPanel pSSysViewPanel){
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
     * <B>PSSYSVIEWPANELNAME</B>&nbsp;面板
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSVIEWPANELID}
     */
    public final static String FIELD_PSSYSVIEWPANELNAME = "pssysviewpanelname";

    /**
     * 设置 面板
     * 
     * @param pSSysViewPanelName
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELNAME)
    public void setPSSysViewPanelName(String pSSysViewPanelName){
        this.set(FIELD_PSSYSVIEWPANELNAME, pSSysViewPanelName);
    }
    
    /**
     * 获取 面板  
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
     * 判断 面板 是否指定值，包括空值
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
     * 重置 面板
     */
    @JsonIgnore
    public void resetPSSysViewPanelName(){
        this.reset(FIELD_PSSYSVIEWPANELNAME);
    }

    /**
     * 设置 面板
     * <P>
     * 等同 {@link #setPSSysViewPanelName}
     * @param pSSysViewPanelName
     */
    @JsonIgnore
    public PSSysPortlet pssysviewpanelname(String pSSysViewPanelName){
        this.setPSSysViewPanelName(pSSysViewPanelName);
        return this;
    }

    /**
     * <B>RELOADTIMER</B>&nbsp;刷新间隔，指定门户部件的自动刷新间隔，单位为【毫秒】，0为不刷新，未定义时为【0】
     */
    public final static String FIELD_RELOADTIMER = "reloadtimer";

    /**
     * 设置 刷新间隔，详细说明：{@link #FIELD_RELOADTIMER}
     * 
     * @param reloadTimer
     * 
     */
    @JsonProperty(FIELD_RELOADTIMER)
    public void setReloadTimer(Integer reloadTimer){
        this.set(FIELD_RELOADTIMER, reloadTimer);
    }
    
    /**
     * 获取 刷新间隔  
     * @return
     */
    @JsonIgnore
    public Integer getReloadTimer(){
        Object objValue = this.get(FIELD_RELOADTIMER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 刷新间隔 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isReloadTimerDirty(){
        if(this.contains(FIELD_RELOADTIMER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 刷新间隔
     */
    @JsonIgnore
    public void resetReloadTimer(){
        this.reset(FIELD_RELOADTIMER);
    }

    /**
     * 设置 刷新间隔，详细说明：{@link #FIELD_RELOADTIMER}
     * <P>
     * 等同 {@link #setReloadTimer}
     * @param reloadTimer
     */
    @JsonIgnore
    public PSSysPortlet reloadtimer(Integer reloadTimer){
        this.setReloadTimer(reloadTimer);
        return this;
    }

    /**
     * <B>SHOWTITLEBAR</B>&nbsp;显示标题栏，指定门户部件是否显示标题栏，未定义时为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_SHOWTITLEBAR = "showtitlebar";

    /**
     * 设置 显示标题栏，详细说明：{@link #FIELD_SHOWTITLEBAR}
     * 
     * @param showTitleBar
     * 
     */
    @JsonProperty(FIELD_SHOWTITLEBAR)
    public void setShowTitleBar(Integer showTitleBar){
        this.set(FIELD_SHOWTITLEBAR, showTitleBar);
    }
    
    /**
     * 获取 显示标题栏  
     * @return
     */
    @JsonIgnore
    public Integer getShowTitleBar(){
        Object objValue = this.get(FIELD_SHOWTITLEBAR);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 显示标题栏 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isShowTitleBarDirty(){
        if(this.contains(FIELD_SHOWTITLEBAR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 显示标题栏
     */
    @JsonIgnore
    public void resetShowTitleBar(){
        this.reset(FIELD_SHOWTITLEBAR);
    }

    /**
     * 设置 显示标题栏，详细说明：{@link #FIELD_SHOWTITLEBAR}
     * <P>
     * 等同 {@link #setShowTitleBar}
     * @param showTitleBar
     */
    @JsonIgnore
    public PSSysPortlet showtitlebar(Integer showTitleBar){
        this.setShowTitleBar(showTitleBar);
        return this;
    }

     /**
     * 设置 显示标题栏，详细说明：{@link #FIELD_SHOWTITLEBAR}
     * <P>
     * 等同 {@link #setShowTitleBar}
     * @param showTitleBar
     */
    @JsonIgnore
    public PSSysPortlet showtitlebar(Boolean showTitleBar){
        if(showTitleBar == null){
            this.setShowTitleBar(null);
        }
        else{
            this.setShowTitleBar(showTitleBar?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>TEMPLENGINE</B>&nbsp;模板引擎，指定门户部件的模板引擎模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.PSTemplEngine} 
     */
    public final static String FIELD_TEMPLENGINE = "templengine";

    /**
     * 设置 模板引擎，详细说明：{@link #FIELD_TEMPLENGINE}
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
     * 设置 模板引擎，详细说明：{@link #FIELD_TEMPLENGINE}
     * <P>
     * 等同 {@link #setTemplEngine}
     * @param templEngine
     */
    @JsonIgnore
    public PSSysPortlet templengine(String templEngine){
        this.setTemplEngine(templEngine);
        return this;
    }

     /**
     * 设置 模板引擎，详细说明：{@link #FIELD_TEMPLENGINE}
     * <P>
     * 等同 {@link #setTemplEngine}
     * @param templEngine
     */
    @JsonIgnore
    public PSSysPortlet templengine(net.ibizsys.psmodel.core.util.PSModelEnums.PSTemplEngine templEngine){
        if(templEngine == null){
            this.setTemplEngine(null);
        }
        else{
            this.setTemplEngine(templEngine.value);
        }
        return this;
    }

    /**
     * <B>TITLEPSLANRESID</B>&nbsp;标题语言资源，指定门户部件标题的多语言资源对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_TITLEPSLANRESID = "titlepslanresid";

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_TITLEPSLANRESID}
     * 
     * @param titlePSLanResId
     * 
     */
    @JsonProperty(FIELD_TITLEPSLANRESID)
    public void setTitlePSLanResId(String titlePSLanResId){
        this.set(FIELD_TITLEPSLANRESID, titlePSLanResId);
    }
    
    /**
     * 获取 标题语言资源  
     * @return
     */
    @JsonIgnore
    public String getTitlePSLanResId(){
        Object objValue = this.get(FIELD_TITLEPSLANRESID);
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
    public boolean isTitlePSLanResIdDirty(){
        if(this.contains(FIELD_TITLEPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题语言资源
     */
    @JsonIgnore
    public void resetTitlePSLanResId(){
        this.reset(FIELD_TITLEPSLANRESID);
    }

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_TITLEPSLANRESID}
     * <P>
     * 等同 {@link #setTitlePSLanResId}
     * @param titlePSLanResId
     */
    @JsonIgnore
    public PSSysPortlet titlepslanresid(String titlePSLanResId){
        this.setTitlePSLanResId(titlePSLanResId);
        return this;
    }

    /**
     * 设置 标题语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTitlePSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSSysPortlet titlepslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setTitlePSLanResId(null);
            this.setTitlePSLanResName(null);
        }
        else{
            this.setTitlePSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setTitlePSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>TITLEPSLANRESNAME</B>&nbsp;标题语言资源，指定门户部件标题的多语言资源对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TITLEPSLANRESID}
     */
    public final static String FIELD_TITLEPSLANRESNAME = "titlepslanresname";

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_TITLEPSLANRESNAME}
     * 
     * @param titlePSLanResName
     * 
     */
    @JsonProperty(FIELD_TITLEPSLANRESNAME)
    public void setTitlePSLanResName(String titlePSLanResName){
        this.set(FIELD_TITLEPSLANRESNAME, titlePSLanResName);
    }
    
    /**
     * 获取 标题语言资源  
     * @return
     */
    @JsonIgnore
    public String getTitlePSLanResName(){
        Object objValue = this.get(FIELD_TITLEPSLANRESNAME);
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
    public boolean isTitlePSLanResNameDirty(){
        if(this.contains(FIELD_TITLEPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题语言资源
     */
    @JsonIgnore
    public void resetTitlePSLanResName(){
        this.reset(FIELD_TITLEPSLANRESNAME);
    }

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_TITLEPSLANRESNAME}
     * <P>
     * 等同 {@link #setTitlePSLanResName}
     * @param titlePSLanResName
     */
    @JsonIgnore
    public PSSysPortlet titlepslanresname(String titlePSLanResName){
        this.setTitlePSLanResName(titlePSLanResName);
        return this;
    }

    /**
     * <B>TITLEPSSYSPFPLUGINID</B>&nbsp;标题栏前端插件，指定门户部件标题栏前端插件使用的前端模板扩展插件，使用插件类型【门户部件标题栏绘制插件】
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysPFPlugin} 
     */
    public final static String FIELD_TITLEPSSYSPFPLUGINID = "titlepssyspfpluginid";

    /**
     * 设置 标题栏前端插件，详细说明：{@link #FIELD_TITLEPSSYSPFPLUGINID}
     * 
     * @param titlePSSysPFPluginId
     * 
     */
    @JsonProperty(FIELD_TITLEPSSYSPFPLUGINID)
    public void setTitlePSSysPFPluginId(String titlePSSysPFPluginId){
        this.set(FIELD_TITLEPSSYSPFPLUGINID, titlePSSysPFPluginId);
    }
    
    /**
     * 获取 标题栏前端插件  
     * @return
     */
    @JsonIgnore
    public String getTitlePSSysPFPluginId(){
        Object objValue = this.get(FIELD_TITLEPSSYSPFPLUGINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标题栏前端插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTitlePSSysPFPluginIdDirty(){
        if(this.contains(FIELD_TITLEPSSYSPFPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题栏前端插件
     */
    @JsonIgnore
    public void resetTitlePSSysPFPluginId(){
        this.reset(FIELD_TITLEPSSYSPFPLUGINID);
    }

    /**
     * 设置 标题栏前端插件，详细说明：{@link #FIELD_TITLEPSSYSPFPLUGINID}
     * <P>
     * 等同 {@link #setTitlePSSysPFPluginId}
     * @param titlePSSysPFPluginId
     */
    @JsonIgnore
    public PSSysPortlet titlepssyspfpluginid(String titlePSSysPFPluginId){
        this.setTitlePSSysPFPluginId(titlePSSysPFPluginId);
        return this;
    }

    /**
     * 设置 标题栏前端插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTitlePSSysPFPluginId}
     * @param pSSysPFPlugin 引用对象
     */
    @JsonIgnore
    public PSSysPortlet titlepssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
        if(pSSysPFPlugin == null){
            this.setTitlePSSysPFPluginId(null);
            this.setTitlePSSysPFPluginName(null);
        }
        else{
            this.setTitlePSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setTitlePSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    /**
     * <B>TITLEPSSYSPFPLUGINNAME</B>&nbsp;标题栏前端插件，指定门户部件标题栏前端插件使用的前端模板扩展插件，使用插件类型【门户部件标题栏绘制插件】
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TITLEPSSYSPFPLUGINID}
     */
    public final static String FIELD_TITLEPSSYSPFPLUGINNAME = "titlepssyspfpluginname";

    /**
     * 设置 标题栏前端插件，详细说明：{@link #FIELD_TITLEPSSYSPFPLUGINNAME}
     * 
     * @param titlePSSysPFPluginName
     * 
     */
    @JsonProperty(FIELD_TITLEPSSYSPFPLUGINNAME)
    public void setTitlePSSysPFPluginName(String titlePSSysPFPluginName){
        this.set(FIELD_TITLEPSSYSPFPLUGINNAME, titlePSSysPFPluginName);
    }
    
    /**
     * 获取 标题栏前端插件  
     * @return
     */
    @JsonIgnore
    public String getTitlePSSysPFPluginName(){
        Object objValue = this.get(FIELD_TITLEPSSYSPFPLUGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标题栏前端插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTitlePSSysPFPluginNameDirty(){
        if(this.contains(FIELD_TITLEPSSYSPFPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题栏前端插件
     */
    @JsonIgnore
    public void resetTitlePSSysPFPluginName(){
        this.reset(FIELD_TITLEPSSYSPFPLUGINNAME);
    }

    /**
     * 设置 标题栏前端插件，详细说明：{@link #FIELD_TITLEPSSYSPFPLUGINNAME}
     * <P>
     * 等同 {@link #setTitlePSSysPFPluginName}
     * @param titlePSSysPFPluginName
     */
    @JsonIgnore
    public PSSysPortlet titlepssyspfpluginname(String titlePSSysPFPluginName){
        this.setTitlePSSysPFPluginName(titlePSSysPFPluginName);
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
    public PSSysPortlet updatedate(String updateDate){
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
    public PSSysPortlet updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>USERTAG</B>&nbsp;用户标识
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_USERTAG = "usertag";

    /**
     * 设置 用户标识
     * 
     * @param userTag
     * 
     */
    @JsonProperty(FIELD_USERTAG)
    public void setUserTag(String userTag){
        this.set(FIELD_USERTAG, userTag);
    }
    
    /**
     * 获取 用户标识  
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
     * 判断 用户标识 是否指定值，包括空值
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
     * 重置 用户标识
     */
    @JsonIgnore
    public void resetUserTag(){
        this.reset(FIELD_USERTAG);
    }

    /**
     * 设置 用户标识
     * <P>
     * 等同 {@link #setUserTag}
     * @param userTag
     */
    @JsonIgnore
    public PSSysPortlet usertag(String userTag){
        this.setUserTag(userTag);
        return this;
    }

    /**
     * <B>USERTAG2</B>&nbsp;用户标识2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_USERTAG2 = "usertag2";

    /**
     * 设置 用户标识2
     * 
     * @param userTag2
     * 
     */
    @JsonProperty(FIELD_USERTAG2)
    public void setUserTag2(String userTag2){
        this.set(FIELD_USERTAG2, userTag2);
    }
    
    /**
     * 获取 用户标识2  
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
     * 判断 用户标识2 是否指定值，包括空值
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
     * 重置 用户标识2
     */
    @JsonIgnore
    public void resetUserTag2(){
        this.reset(FIELD_USERTAG2);
    }

    /**
     * 设置 用户标识2
     * <P>
     * 等同 {@link #setUserTag2}
     * @param userTag2
     */
    @JsonIgnore
    public PSSysPortlet usertag2(String userTag2){
        this.setUserTag2(userTag2);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysPortletId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysPortletId(strValue);
    }

    @JsonIgnore
    public PSSysPortlet id(String strValue){
        this.setPSSysPortletId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysPortlet){
            PSSysPortlet model = (PSSysPortlet)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
