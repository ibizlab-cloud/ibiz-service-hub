package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSBICUBEDIMENSION</B>智能报表立方体维度 模型传输对象
 * <P>
 * 
 */
public class PSSysBICubeDimension extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysBICubeDimension(){
        this.setValidFlag(1);
    }      

    /**
     * <B>ALLHIERARCHYFLAG</B>&nbsp;全部维度层级体系
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ALLHIERARCHYFLAG = "allhierarchyflag";

    /**
     * 设置 全部维度层级体系
     * 
     * @param allHierarchyFlag
     * 
     */
    @JsonProperty(FIELD_ALLHIERARCHYFLAG)
    public void setAllHierarchyFlag(Integer allHierarchyFlag){
        this.set(FIELD_ALLHIERARCHYFLAG, allHierarchyFlag);
    }
    
    /**
     * 获取 全部维度层级体系  
     * @return
     */
    @JsonIgnore
    public Integer getAllHierarchyFlag(){
        Object objValue = this.get(FIELD_ALLHIERARCHYFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 全部维度层级体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAllHierarchyFlagDirty(){
        if(this.contains(FIELD_ALLHIERARCHYFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 全部维度层级体系
     */
    @JsonIgnore
    public void resetAllHierarchyFlag(){
        this.reset(FIELD_ALLHIERARCHYFLAG);
    }

    /**
     * 设置 全部维度层级体系
     * <P>
     * 等同 {@link #setAllHierarchyFlag}
     * @param allHierarchyFlag
     */
    @JsonIgnore
    public PSSysBICubeDimension allhierarchyflag(Integer allHierarchyFlag){
        this.setAllHierarchyFlag(allHierarchyFlag);
        return this;
    }

     /**
     * 设置 全部维度层级体系
     * <P>
     * 等同 {@link #setAllHierarchyFlag}
     * @param allHierarchyFlag
     */
    @JsonIgnore
    public PSSysBICubeDimension allhierarchyflag(Boolean allHierarchyFlag){
        if(allHierarchyFlag == null){
            this.setAllHierarchyFlag(null);
        }
        else{
            this.setAllHierarchyFlag(allHierarchyFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>BICUBEDIMENSIONTAG</B>&nbsp;立方体维度标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_BICUBEDIMENSIONTAG = "bicubedimensiontag";

    /**
     * 设置 立方体维度标记
     * 
     * @param bICubeDimensionTag
     * 
     */
    @JsonProperty(FIELD_BICUBEDIMENSIONTAG)
    public void setBICubeDimensionTag(String bICubeDimensionTag){
        this.set(FIELD_BICUBEDIMENSIONTAG, bICubeDimensionTag);
    }
    
    /**
     * 获取 立方体维度标记  
     * @return
     */
    @JsonIgnore
    public String getBICubeDimensionTag(){
        Object objValue = this.get(FIELD_BICUBEDIMENSIONTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 立方体维度标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBICubeDimensionTagDirty(){
        if(this.contains(FIELD_BICUBEDIMENSIONTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 立方体维度标记
     */
    @JsonIgnore
    public void resetBICubeDimensionTag(){
        this.reset(FIELD_BICUBEDIMENSIONTAG);
    }

    /**
     * 设置 立方体维度标记
     * <P>
     * 等同 {@link #setBICubeDimensionTag}
     * @param bICubeDimensionTag
     */
    @JsonIgnore
    public PSSysBICubeDimension bicubedimensiontag(String bICubeDimensionTag){
        this.setBICubeDimensionTag(bICubeDimensionTag);
        return this;
    }

    /**
     * <B>BICUBEDIMENSIONTAG2</B>&nbsp;立方体维度标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_BICUBEDIMENSIONTAG2 = "bicubedimensiontag2";

    /**
     * 设置 立方体维度标记2
     * 
     * @param bICubeDimensionTag2
     * 
     */
    @JsonProperty(FIELD_BICUBEDIMENSIONTAG2)
    public void setBICubeDimensionTag2(String bICubeDimensionTag2){
        this.set(FIELD_BICUBEDIMENSIONTAG2, bICubeDimensionTag2);
    }
    
    /**
     * 获取 立方体维度标记2  
     * @return
     */
    @JsonIgnore
    public String getBICubeDimensionTag2(){
        Object objValue = this.get(FIELD_BICUBEDIMENSIONTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 立方体维度标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBICubeDimensionTag2Dirty(){
        if(this.contains(FIELD_BICUBEDIMENSIONTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 立方体维度标记2
     */
    @JsonIgnore
    public void resetBICubeDimensionTag2(){
        this.reset(FIELD_BICUBEDIMENSIONTAG2);
    }

    /**
     * 设置 立方体维度标记2
     * <P>
     * 等同 {@link #setBICubeDimensionTag2}
     * @param bICubeDimensionTag2
     */
    @JsonIgnore
    public PSSysBICubeDimension bicubedimensiontag2(String bICubeDimensionTag2){
        this.setBICubeDimensionTag2(bICubeDimensionTag2);
        return this;
    }

    /**
     * <B>BIDIMENSIONTYPE</B>&nbsp;维度类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.BIDimensionType} 
     */
    public final static String FIELD_BIDIMENSIONTYPE = "bidimensiontype";

    /**
     * 设置 维度类型
     * 
     * @param bIDimensionType
     * 
     */
    @JsonProperty(FIELD_BIDIMENSIONTYPE)
    public void setBIDimensionType(String bIDimensionType){
        this.set(FIELD_BIDIMENSIONTYPE, bIDimensionType);
    }
    
    /**
     * 获取 维度类型  
     * @return
     */
    @JsonIgnore
    public String getBIDimensionType(){
        Object objValue = this.get(FIELD_BIDIMENSIONTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 维度类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBIDimensionTypeDirty(){
        if(this.contains(FIELD_BIDIMENSIONTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 维度类型
     */
    @JsonIgnore
    public void resetBIDimensionType(){
        this.reset(FIELD_BIDIMENSIONTYPE);
    }

    /**
     * 设置 维度类型
     * <P>
     * 等同 {@link #setBIDimensionType}
     * @param bIDimensionType
     */
    @JsonIgnore
    public PSSysBICubeDimension bidimensiontype(String bIDimensionType){
        this.setBIDimensionType(bIDimensionType);
        return this;
    }

     /**
     * 设置 维度类型
     * <P>
     * 等同 {@link #setBIDimensionType}
     * @param bIDimensionType
     */
    @JsonIgnore
    public PSSysBICubeDimension bidimensiontype(net.ibizsys.psmodel.core.util.PSModelEnums.BIDimensionType bIDimensionType){
        if(bIDimensionType == null){
            this.setBIDimensionType(null);
        }
        else{
            this.setBIDimensionType(bIDimensionType.value);
        }
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码名称
     * <P>
     * 字符串：最大长度 60，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_CODENAME = "codename";

    /**
     * 设置 代码名称
     * 
     * @param codeName
     * 
     */
    @JsonProperty(FIELD_CODENAME)
    public void setCodeName(String codeName){
        this.set(FIELD_CODENAME, codeName);
    }
    
    /**
     * 获取 代码名称  
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
     * 判断 代码名称 是否指定值，包括空值
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
     * 重置 代码名称
     */
    @JsonIgnore
    public void resetCodeName(){
        this.reset(FIELD_CODENAME);
    }

    /**
     * 设置 代码名称
     * <P>
     * 等同 {@link #setCodeName}
     * @param codeName
     */
    @JsonIgnore
    public PSSysBICubeDimension codename(String codeName){
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
    public PSSysBICubeDimension createdate(String createDate){
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
    public PSSysBICubeDimension createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DEFAULTFLAG</B>&nbsp;默认维度
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEFAULTFLAG = "defaultflag";

    /**
     * 设置 默认维度
     * 
     * @param defaultFlag
     * 
     */
    @JsonProperty(FIELD_DEFAULTFLAG)
    public void setDefaultFlag(Integer defaultFlag){
        this.set(FIELD_DEFAULTFLAG, defaultFlag);
    }
    
    /**
     * 获取 默认维度  
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
     * 判断 默认维度 是否指定值，包括空值
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
     * 重置 默认维度
     */
    @JsonIgnore
    public void resetDefaultFlag(){
        this.reset(FIELD_DEFAULTFLAG);
    }

    /**
     * 设置 默认维度
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSSysBICubeDimension defaultflag(Integer defaultFlag){
        this.setDefaultFlag(defaultFlag);
        return this;
    }

     /**
     * 设置 默认维度
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSSysBICubeDimension defaultflag(Boolean defaultFlag){
        if(defaultFlag == null){
            this.setDefaultFlag(null);
        }
        else{
            this.setDefaultFlag(defaultFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DIMENSIONFORMULA</B>&nbsp;维度公式
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_DIMENSIONFORMULA = "dimensionformula";

    /**
     * 设置 维度公式
     * 
     * @param dimensionFormula
     * 
     */
    @JsonProperty(FIELD_DIMENSIONFORMULA)
    public void setDimensionFormula(String dimensionFormula){
        this.set(FIELD_DIMENSIONFORMULA, dimensionFormula);
    }
    
    /**
     * 获取 维度公式  
     * @return
     */
    @JsonIgnore
    public String getDimensionFormula(){
        Object objValue = this.get(FIELD_DIMENSIONFORMULA);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 维度公式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDimensionFormulaDirty(){
        if(this.contains(FIELD_DIMENSIONFORMULA)){
            return true;
        }
        return false;
    }

    /**
     * 重置 维度公式
     */
    @JsonIgnore
    public void resetDimensionFormula(){
        this.reset(FIELD_DIMENSIONFORMULA);
    }

    /**
     * 设置 维度公式
     * <P>
     * 等同 {@link #setDimensionFormula}
     * @param dimensionFormula
     */
    @JsonIgnore
    public PSSysBICubeDimension dimensionformula(String dimensionFormula){
        this.setDimensionFormula(dimensionFormula);
        return this;
    }

    /**
     * <B>EXPANDFLAG</B>&nbsp;展开维度
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_EXPANDFLAG = "expandflag";

    /**
     * 设置 展开维度
     * 
     * @param expandFlag
     * 
     */
    @JsonProperty(FIELD_EXPANDFLAG)
    public void setExpandFlag(Integer expandFlag){
        this.set(FIELD_EXPANDFLAG, expandFlag);
    }
    
    /**
     * 获取 展开维度  
     * @return
     */
    @JsonIgnore
    public Integer getExpandFlag(){
        Object objValue = this.get(FIELD_EXPANDFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 展开维度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExpandFlagDirty(){
        if(this.contains(FIELD_EXPANDFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 展开维度
     */
    @JsonIgnore
    public void resetExpandFlag(){
        this.reset(FIELD_EXPANDFLAG);
    }

    /**
     * 设置 展开维度
     * <P>
     * 等同 {@link #setExpandFlag}
     * @param expandFlag
     */
    @JsonIgnore
    public PSSysBICubeDimension expandflag(Integer expandFlag){
        this.setExpandFlag(expandFlag);
        return this;
    }

     /**
     * 设置 展开维度
     * <P>
     * 等同 {@link #setExpandFlag}
     * @param expandFlag
     */
    @JsonIgnore
    public PSSysBICubeDimension expandflag(Boolean expandFlag){
        if(expandFlag == null){
            this.setExpandFlag(null);
        }
        else{
            this.setExpandFlag(expandFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSSysBICubeDimension memo(String memo){
        this.setMemo(memo);
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
    public PSSysBICubeDimension ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PARAMPSDEUIACTIONID</B>&nbsp;参数界面行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEUIAction} 
     */
    public final static String FIELD_PARAMPSDEUIACTIONID = "parampsdeuiactionid";

    /**
     * 设置 参数界面行为
     * 
     * @param paramPSDEUIActionId
     * 
     */
    @JsonProperty(FIELD_PARAMPSDEUIACTIONID)
    public void setParamPSDEUIActionId(String paramPSDEUIActionId){
        this.set(FIELD_PARAMPSDEUIACTIONID, paramPSDEUIActionId);
    }
    
    /**
     * 获取 参数界面行为  
     * @return
     */
    @JsonIgnore
    public String getParamPSDEUIActionId(){
        Object objValue = this.get(FIELD_PARAMPSDEUIACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数界面行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamPSDEUIActionIdDirty(){
        if(this.contains(FIELD_PARAMPSDEUIACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数界面行为
     */
    @JsonIgnore
    public void resetParamPSDEUIActionId(){
        this.reset(FIELD_PARAMPSDEUIACTIONID);
    }

    /**
     * 设置 参数界面行为
     * <P>
     * 等同 {@link #setParamPSDEUIActionId}
     * @param paramPSDEUIActionId
     */
    @JsonIgnore
    public PSSysBICubeDimension parampsdeuiactionid(String paramPSDEUIActionId){
        this.setParamPSDEUIActionId(paramPSDEUIActionId);
        return this;
    }

    /**
     * 设置 参数界面行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setParamPSDEUIActionId}
     * @param pSDEUIAction 引用对象
     */
    @JsonIgnore
    public PSSysBICubeDimension parampsdeuiactionid(PSDEUIAction pSDEUIAction){
        if(pSDEUIAction == null){
            this.setParamPSDEUIActionId(null);
            this.setParamPSDEUIActionName(null);
        }
        else{
            this.setParamPSDEUIActionId(pSDEUIAction.getPSDEUIActionId());
            this.setParamPSDEUIActionName(pSDEUIAction.getPSDEUIActionName());
        }
        return this;
    }

    /**
     * <B>PARAMPSDEUIACTIONNAME</B>&nbsp;参数界面行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PARAMPSDEUIACTIONID}
     */
    public final static String FIELD_PARAMPSDEUIACTIONNAME = "parampsdeuiactionname";

    /**
     * 设置 参数界面行为
     * 
     * @param paramPSDEUIActionName
     * 
     */
    @JsonProperty(FIELD_PARAMPSDEUIACTIONNAME)
    public void setParamPSDEUIActionName(String paramPSDEUIActionName){
        this.set(FIELD_PARAMPSDEUIACTIONNAME, paramPSDEUIActionName);
    }
    
    /**
     * 获取 参数界面行为  
     * @return
     */
    @JsonIgnore
    public String getParamPSDEUIActionName(){
        Object objValue = this.get(FIELD_PARAMPSDEUIACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数界面行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamPSDEUIActionNameDirty(){
        if(this.contains(FIELD_PARAMPSDEUIACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数界面行为
     */
    @JsonIgnore
    public void resetParamPSDEUIActionName(){
        this.reset(FIELD_PARAMPSDEUIACTIONNAME);
    }

    /**
     * 设置 参数界面行为
     * <P>
     * 等同 {@link #setParamPSDEUIActionName}
     * @param paramPSDEUIActionName
     */
    @JsonIgnore
    public PSSysBICubeDimension parampsdeuiactionname(String paramPSDEUIActionName){
        this.setParamPSDEUIActionName(paramPSDEUIActionName);
        return this;
    }

    /**
     * <B>PSCODELISTID</B>&nbsp;代码表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSCodeList} 
     */
    public final static String FIELD_PSCODELISTID = "pscodelistid";

    /**
     * 设置 代码表
     * 
     * @param pSCodeListId
     * 
     */
    @JsonProperty(FIELD_PSCODELISTID)
    public void setPSCodeListId(String pSCodeListId){
        this.set(FIELD_PSCODELISTID, pSCodeListId);
    }
    
    /**
     * 获取 代码表  
     * @return
     */
    @JsonIgnore
    public String getPSCodeListId(){
        Object objValue = this.get(FIELD_PSCODELISTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCodeListIdDirty(){
        if(this.contains(FIELD_PSCODELISTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码表
     */
    @JsonIgnore
    public void resetPSCodeListId(){
        this.reset(FIELD_PSCODELISTID);
    }

    /**
     * 设置 代码表
     * <P>
     * 等同 {@link #setPSCodeListId}
     * @param pSCodeListId
     */
    @JsonIgnore
    public PSSysBICubeDimension pscodelistid(String pSCodeListId){
        this.setPSCodeListId(pSCodeListId);
        return this;
    }

    /**
     * 设置 代码表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSCodeListId}
     * @param pSCodeList 引用对象
     */
    @JsonIgnore
    public PSSysBICubeDimension pscodelistid(PSCodeList pSCodeList){
        if(pSCodeList == null){
            this.setPSCodeListId(null);
            this.setPSCodeListName(null);
        }
        else{
            this.setPSCodeListId(pSCodeList.getPSCodeListId());
            this.setPSCodeListName(pSCodeList.getPSCodeListName());
        }
        return this;
    }

    /**
     * <B>PSCODELISTNAME</B>&nbsp;代码表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCODELISTID}
     */
    public final static String FIELD_PSCODELISTNAME = "pscodelistname";

    /**
     * 设置 代码表
     * 
     * @param pSCodeListName
     * 
     */
    @JsonProperty(FIELD_PSCODELISTNAME)
    public void setPSCodeListName(String pSCodeListName){
        this.set(FIELD_PSCODELISTNAME, pSCodeListName);
    }
    
    /**
     * 获取 代码表  
     * @return
     */
    @JsonIgnore
    public String getPSCodeListName(){
        Object objValue = this.get(FIELD_PSCODELISTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCodeListNameDirty(){
        if(this.contains(FIELD_PSCODELISTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码表
     */
    @JsonIgnore
    public void resetPSCodeListName(){
        this.reset(FIELD_PSCODELISTNAME);
    }

    /**
     * 设置 代码表
     * <P>
     * 等同 {@link #setPSCodeListName}
     * @param pSCodeListName
     */
    @JsonIgnore
    public PSSysBICubeDimension pscodelistname(String pSCodeListName){
        this.setPSCodeListName(pSCodeListName);
        return this;
    }

    /**
     * <B>PSDEFID</B>&nbsp;实体属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_PSDEFID = "psdefid";

    /**
     * 设置 实体属性
     * 
     * @param pSDEFId
     * 
     */
    @JsonProperty(FIELD_PSDEFID)
    public void setPSDEFId(String pSDEFId){
        this.set(FIELD_PSDEFID, pSDEFId);
    }
    
    /**
     * 获取 实体属性  
     * @return
     */
    @JsonIgnore
    public String getPSDEFId(){
        Object objValue = this.get(FIELD_PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFIdDirty(){
        if(this.contains(FIELD_PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体属性
     */
    @JsonIgnore
    public void resetPSDEFId(){
        this.reset(FIELD_PSDEFID);
    }

    /**
     * 设置 实体属性
     * <P>
     * 等同 {@link #setPSDEFId}
     * @param pSDEFId
     */
    @JsonIgnore
    public PSSysBICubeDimension psdefid(String pSDEFId){
        this.setPSDEFId(pSDEFId);
        return this;
    }

    /**
     * 设置 实体属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysBICubeDimension psdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setPSDEFId(null);
            this.setPSDEFName(null);
        }
        else{
            this.setPSDEFId(pSDEField.getPSDEFieldId());
            this.setPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>PSDEFNAME</B>&nbsp;实体属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFID}
     */
    public final static String FIELD_PSDEFNAME = "psdefname";

    /**
     * 设置 实体属性
     * 
     * @param pSDEFName
     * 
     */
    @JsonProperty(FIELD_PSDEFNAME)
    public void setPSDEFName(String pSDEFName){
        this.set(FIELD_PSDEFNAME, pSDEFName);
    }
    
    /**
     * 获取 实体属性  
     * @return
     */
    @JsonIgnore
    public String getPSDEFName(){
        Object objValue = this.get(FIELD_PSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFNameDirty(){
        if(this.contains(FIELD_PSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体属性
     */
    @JsonIgnore
    public void resetPSDEFName(){
        this.reset(FIELD_PSDEFNAME);
    }

    /**
     * 设置 实体属性
     * <P>
     * 等同 {@link #setPSDEFName}
     * @param pSDEFName
     */
    @JsonIgnore
    public PSSysBICubeDimension psdefname(String pSDEFName){
        this.setPSDEFName(pSDEFName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;PSDEID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBICUBEID}
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 PSDEID
     * 
     * @param pSDEId
     * 
     */
    @JsonProperty(FIELD_PSDEID)
    public void setPSDEId(String pSDEId){
        this.set(FIELD_PSDEID, pSDEId);
    }
    
    /**
     * 获取 PSDEID  
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
     * 判断 PSDEID 是否指定值，包括空值
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
     * 重置 PSDEID
     */
    @JsonIgnore
    public void resetPSDEId(){
        this.reset(FIELD_PSDEID);
    }

    /**
     * 设置 PSDEID
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSSysBICubeDimension psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * <B>PSSYSBICUBEDIMENSIONID</B>&nbsp;智能报表立方体维度标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSBICUBEDIMENSIONID = "pssysbicubedimensionid";

    /**
     * 设置 智能报表立方体维度标识
     * 
     * @param pSSysBICubeDimensionId
     * 
     */
    @JsonProperty(FIELD_PSSYSBICUBEDIMENSIONID)
    public void setPSSysBICubeDimensionId(String pSSysBICubeDimensionId){
        this.set(FIELD_PSSYSBICUBEDIMENSIONID, pSSysBICubeDimensionId);
    }
    
    /**
     * 获取 智能报表立方体维度标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysBICubeDimensionId(){
        Object objValue = this.get(FIELD_PSSYSBICUBEDIMENSIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 智能报表立方体维度标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBICubeDimensionIdDirty(){
        if(this.contains(FIELD_PSSYSBICUBEDIMENSIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 智能报表立方体维度标识
     */
    @JsonIgnore
    public void resetPSSysBICubeDimensionId(){
        this.reset(FIELD_PSSYSBICUBEDIMENSIONID);
    }

    /**
     * 设置 智能报表立方体维度标识
     * <P>
     * 等同 {@link #setPSSysBICubeDimensionId}
     * @param pSSysBICubeDimensionId
     */
    @JsonIgnore
    public PSSysBICubeDimension pssysbicubedimensionid(String pSSysBICubeDimensionId){
        this.setPSSysBICubeDimensionId(pSSysBICubeDimensionId);
        return this;
    }

    /**
     * <B>PSSYSBICUBEDIMENSIONNAME</B>&nbsp;立方体维度名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSBICUBEDIMENSIONNAME = "pssysbicubedimensionname";

    /**
     * 设置 立方体维度名称
     * 
     * @param pSSysBICubeDimensionName
     * 
     */
    @JsonProperty(FIELD_PSSYSBICUBEDIMENSIONNAME)
    public void setPSSysBICubeDimensionName(String pSSysBICubeDimensionName){
        this.set(FIELD_PSSYSBICUBEDIMENSIONNAME, pSSysBICubeDimensionName);
    }
    
    /**
     * 获取 立方体维度名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysBICubeDimensionName(){
        Object objValue = this.get(FIELD_PSSYSBICUBEDIMENSIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 立方体维度名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBICubeDimensionNameDirty(){
        if(this.contains(FIELD_PSSYSBICUBEDIMENSIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 立方体维度名称
     */
    @JsonIgnore
    public void resetPSSysBICubeDimensionName(){
        this.reset(FIELD_PSSYSBICUBEDIMENSIONNAME);
    }

    /**
     * 设置 立方体维度名称
     * <P>
     * 等同 {@link #setPSSysBICubeDimensionName}
     * @param pSSysBICubeDimensionName
     */
    @JsonIgnore
    public PSSysBICubeDimension pssysbicubedimensionname(String pSSysBICubeDimensionName){
        this.setPSSysBICubeDimensionName(pSSysBICubeDimensionName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysBICubeDimensionName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysBICubeDimensionName(strName);
    }

    @JsonIgnore
    public PSSysBICubeDimension name(String strName){
        this.setPSSysBICubeDimensionName(strName);
        return this;
    }

    /**
     * <B>PSSYSBICUBEID</B>&nbsp;智能报表立方体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysBICube} 
     */
    public final static String FIELD_PSSYSBICUBEID = "pssysbicubeid";

    /**
     * 设置 智能报表立方体
     * 
     * @param pSSysBICubeId
     * 
     */
    @JsonProperty(FIELD_PSSYSBICUBEID)
    public void setPSSysBICubeId(String pSSysBICubeId){
        this.set(FIELD_PSSYSBICUBEID, pSSysBICubeId);
    }
    
    /**
     * 获取 智能报表立方体  
     * @return
     */
    @JsonIgnore
    public String getPSSysBICubeId(){
        Object objValue = this.get(FIELD_PSSYSBICUBEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 智能报表立方体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBICubeIdDirty(){
        if(this.contains(FIELD_PSSYSBICUBEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 智能报表立方体
     */
    @JsonIgnore
    public void resetPSSysBICubeId(){
        this.reset(FIELD_PSSYSBICUBEID);
    }

    /**
     * 设置 智能报表立方体
     * <P>
     * 等同 {@link #setPSSysBICubeId}
     * @param pSSysBICubeId
     */
    @JsonIgnore
    public PSSysBICubeDimension pssysbicubeid(String pSSysBICubeId){
        this.setPSSysBICubeId(pSSysBICubeId);
        return this;
    }

    /**
     * 设置 智能报表立方体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysBICubeId}
     * @param pSSysBICube 引用对象
     */
    @JsonIgnore
    public PSSysBICubeDimension pssysbicubeid(PSSysBICube pSSysBICube){
        if(pSSysBICube == null){
            this.setPSDEId(null);
            this.setPSSysBICubeId(null);
            this.setPSSysBICubeName(null);
            this.setPSSysBISchemeId(null);
        }
        else{
            this.setPSDEId(pSSysBICube.getPSDEId());
            this.setPSSysBICubeId(pSSysBICube.getPSSysBICubeId());
            this.setPSSysBICubeName(pSSysBICube.getPSSysBICubeName());
            this.setPSSysBISchemeId(pSSysBICube.getPSSysBISchemeId());
        }
        return this;
    }

    /**
     * <B>PSSYSBICUBENAME</B>&nbsp;智能报表立方体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBICUBEID}
     */
    public final static String FIELD_PSSYSBICUBENAME = "pssysbicubename";

    /**
     * 设置 智能报表立方体
     * 
     * @param pSSysBICubeName
     * 
     */
    @JsonProperty(FIELD_PSSYSBICUBENAME)
    public void setPSSysBICubeName(String pSSysBICubeName){
        this.set(FIELD_PSSYSBICUBENAME, pSSysBICubeName);
    }
    
    /**
     * 获取 智能报表立方体  
     * @return
     */
    @JsonIgnore
    public String getPSSysBICubeName(){
        Object objValue = this.get(FIELD_PSSYSBICUBENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 智能报表立方体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBICubeNameDirty(){
        if(this.contains(FIELD_PSSYSBICUBENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 智能报表立方体
     */
    @JsonIgnore
    public void resetPSSysBICubeName(){
        this.reset(FIELD_PSSYSBICUBENAME);
    }

    /**
     * 设置 智能报表立方体
     * <P>
     * 等同 {@link #setPSSysBICubeName}
     * @param pSSysBICubeName
     */
    @JsonIgnore
    public PSSysBICubeDimension pssysbicubename(String pSSysBICubeName){
        this.setPSSysBICubeName(pSSysBICubeName);
        return this;
    }

    /**
     * <B>PSSYSBIDIMENSIONID</B>&nbsp;智能报表维度
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysBIDimension} 
     */
    public final static String FIELD_PSSYSBIDIMENSIONID = "pssysbidimensionid";

    /**
     * 设置 智能报表维度
     * 
     * @param pSSysBIDimensionId
     * 
     */
    @JsonProperty(FIELD_PSSYSBIDIMENSIONID)
    public void setPSSysBIDimensionId(String pSSysBIDimensionId){
        this.set(FIELD_PSSYSBIDIMENSIONID, pSSysBIDimensionId);
    }
    
    /**
     * 获取 智能报表维度  
     * @return
     */
    @JsonIgnore
    public String getPSSysBIDimensionId(){
        Object objValue = this.get(FIELD_PSSYSBIDIMENSIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 智能报表维度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBIDimensionIdDirty(){
        if(this.contains(FIELD_PSSYSBIDIMENSIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 智能报表维度
     */
    @JsonIgnore
    public void resetPSSysBIDimensionId(){
        this.reset(FIELD_PSSYSBIDIMENSIONID);
    }

    /**
     * 设置 智能报表维度
     * <P>
     * 等同 {@link #setPSSysBIDimensionId}
     * @param pSSysBIDimensionId
     */
    @JsonIgnore
    public PSSysBICubeDimension pssysbidimensionid(String pSSysBIDimensionId){
        this.setPSSysBIDimensionId(pSSysBIDimensionId);
        return this;
    }

    /**
     * 设置 智能报表维度，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysBIDimensionId}
     * @param pSSysBIDimension 引用对象
     */
    @JsonIgnore
    public PSSysBICubeDimension pssysbidimensionid(PSSysBIDimension pSSysBIDimension){
        if(pSSysBIDimension == null){
            this.setPSSysBIDimensionId(null);
            this.setPSSysBIDimensionName(null);
        }
        else{
            this.setPSSysBIDimensionId(pSSysBIDimension.getPSSysBIDimensionId());
            this.setPSSysBIDimensionName(pSSysBIDimension.getPSSysBIDimensionName());
        }
        return this;
    }

    /**
     * <B>PSSYSBIDIMENSIONNAME</B>&nbsp;智能报表维度
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBIDIMENSIONID}
     */
    public final static String FIELD_PSSYSBIDIMENSIONNAME = "pssysbidimensionname";

    /**
     * 设置 智能报表维度
     * 
     * @param pSSysBIDimensionName
     * 
     */
    @JsonProperty(FIELD_PSSYSBIDIMENSIONNAME)
    public void setPSSysBIDimensionName(String pSSysBIDimensionName){
        this.set(FIELD_PSSYSBIDIMENSIONNAME, pSSysBIDimensionName);
    }
    
    /**
     * 获取 智能报表维度  
     * @return
     */
    @JsonIgnore
    public String getPSSysBIDimensionName(){
        Object objValue = this.get(FIELD_PSSYSBIDIMENSIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 智能报表维度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBIDimensionNameDirty(){
        if(this.contains(FIELD_PSSYSBIDIMENSIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 智能报表维度
     */
    @JsonIgnore
    public void resetPSSysBIDimensionName(){
        this.reset(FIELD_PSSYSBIDIMENSIONNAME);
    }

    /**
     * 设置 智能报表维度
     * <P>
     * 等同 {@link #setPSSysBIDimensionName}
     * @param pSSysBIDimensionName
     */
    @JsonIgnore
    public PSSysBICubeDimension pssysbidimensionname(String pSSysBIDimensionName){
        this.setPSSysBIDimensionName(pSSysBIDimensionName);
        return this;
    }

    /**
     * <B>PSSYSBISCHEMEID</B>&nbsp;PSSYSBISCHEMEID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBICUBEID}
     */
    public final static String FIELD_PSSYSBISCHEMEID = "pssysbischemeid";

    /**
     * 设置 PSSYSBISCHEMEID
     * 
     * @param pSSysBISchemeId
     * 
     */
    @JsonProperty(FIELD_PSSYSBISCHEMEID)
    public void setPSSysBISchemeId(String pSSysBISchemeId){
        this.set(FIELD_PSSYSBISCHEMEID, pSSysBISchemeId);
    }
    
    /**
     * 获取 PSSYSBISCHEMEID  
     * @return
     */
    @JsonIgnore
    public String getPSSysBISchemeId(){
        Object objValue = this.get(FIELD_PSSYSBISCHEMEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 PSSYSBISCHEMEID 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBISchemeIdDirty(){
        if(this.contains(FIELD_PSSYSBISCHEMEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 PSSYSBISCHEMEID
     */
    @JsonIgnore
    public void resetPSSysBISchemeId(){
        this.reset(FIELD_PSSYSBISCHEMEID);
    }

    /**
     * 设置 PSSYSBISCHEMEID
     * <P>
     * 等同 {@link #setPSSysBISchemeId}
     * @param pSSysBISchemeId
     */
    @JsonIgnore
    public PSSysBICubeDimension pssysbischemeid(String pSSysBISchemeId){
        this.setPSSysBISchemeId(pSSysBISchemeId);
        return this;
    }

    /**
     * <B>PSSYSDBVFID</B>&nbsp;值处理
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDBVF} 
     */
    public final static String FIELD_PSSYSDBVFID = "pssysdbvfid";

    /**
     * 设置 值处理
     * 
     * @param pSSysDBVFId
     * 
     */
    @JsonProperty(FIELD_PSSYSDBVFID)
    public void setPSSysDBVFId(String pSSysDBVFId){
        this.set(FIELD_PSSYSDBVFID, pSSysDBVFId);
    }
    
    /**
     * 获取 值处理  
     * @return
     */
    @JsonIgnore
    public String getPSSysDBVFId(){
        Object objValue = this.get(FIELD_PSSYSDBVFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值处理 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDBVFIdDirty(){
        if(this.contains(FIELD_PSSYSDBVFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值处理
     */
    @JsonIgnore
    public void resetPSSysDBVFId(){
        this.reset(FIELD_PSSYSDBVFID);
    }

    /**
     * 设置 值处理
     * <P>
     * 等同 {@link #setPSSysDBVFId}
     * @param pSSysDBVFId
     */
    @JsonIgnore
    public PSSysBICubeDimension pssysdbvfid(String pSSysDBVFId){
        this.setPSSysDBVFId(pSSysDBVFId);
        return this;
    }

    /**
     * 设置 值处理，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDBVFId}
     * @param pSSysDBVF 引用对象
     */
    @JsonIgnore
    public PSSysBICubeDimension pssysdbvfid(PSSysDBVF pSSysDBVF){
        if(pSSysDBVF == null){
            this.setPSSysDBVFId(null);
            this.setPSSysDBVFName(null);
        }
        else{
            this.setPSSysDBVFId(pSSysDBVF.getPSSysDBVFId());
            this.setPSSysDBVFName(pSSysDBVF.getPSSysDBVFName());
        }
        return this;
    }

    /**
     * <B>PSSYSDBVFNAME</B>&nbsp;值处理
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDBVFID}
     */
    public final static String FIELD_PSSYSDBVFNAME = "pssysdbvfname";

    /**
     * 设置 值处理
     * 
     * @param pSSysDBVFName
     * 
     */
    @JsonProperty(FIELD_PSSYSDBVFNAME)
    public void setPSSysDBVFName(String pSSysDBVFName){
        this.set(FIELD_PSSYSDBVFNAME, pSSysDBVFName);
    }
    
    /**
     * 获取 值处理  
     * @return
     */
    @JsonIgnore
    public String getPSSysDBVFName(){
        Object objValue = this.get(FIELD_PSSYSDBVFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值处理 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDBVFNameDirty(){
        if(this.contains(FIELD_PSSYSDBVFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值处理
     */
    @JsonIgnore
    public void resetPSSysDBVFName(){
        this.reset(FIELD_PSSYSDBVFNAME);
    }

    /**
     * 设置 值处理
     * <P>
     * 等同 {@link #setPSSysDBVFName}
     * @param pSSysDBVFName
     */
    @JsonIgnore
    public PSSysBICubeDimension pssysdbvfname(String pSSysDBVFName){
        this.setPSSysDBVFName(pSSysDBVFName);
        return this;
    }

    /**
     * <B>STDDATATYPE</B>&nbsp;标准数据类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.StdDataType} 
     */
    public final static String FIELD_STDDATATYPE = "stddatatype";

    /**
     * 设置 标准数据类型
     * 
     * @param stdDataType
     * 
     */
    @JsonProperty(FIELD_STDDATATYPE)
    public void setStdDataType(Integer stdDataType){
        this.set(FIELD_STDDATATYPE, stdDataType);
    }
    
    /**
     * 获取 标准数据类型  
     * @return
     */
    @JsonIgnore
    public Integer getStdDataType(){
        Object objValue = this.get(FIELD_STDDATATYPE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 标准数据类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStdDataTypeDirty(){
        if(this.contains(FIELD_STDDATATYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标准数据类型
     */
    @JsonIgnore
    public void resetStdDataType(){
        this.reset(FIELD_STDDATATYPE);
    }

    /**
     * 设置 标准数据类型
     * <P>
     * 等同 {@link #setStdDataType}
     * @param stdDataType
     */
    @JsonIgnore
    public PSSysBICubeDimension stddatatype(Integer stdDataType){
        this.setStdDataType(stdDataType);
        return this;
    }

     /**
     * 设置 标准数据类型
     * <P>
     * 等同 {@link #setStdDataType}
     * @param stdDataType
     */
    @JsonIgnore
    public PSSysBICubeDimension stddatatype(net.ibizsys.psmodel.core.util.PSModelEnums.StdDataType stdDataType){
        if(stdDataType == null){
            this.setStdDataType(null);
        }
        else{
            this.setStdDataType(stdDataType.value);
        }
        return this;
    }

    /**
     * <B>TEXTPSDEFID</B>&nbsp;文本实体属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_TEXTPSDEFID = "textpsdefid";

    /**
     * 设置 文本实体属性
     * 
     * @param textPSDEFId
     * 
     */
    @JsonProperty(FIELD_TEXTPSDEFID)
    public void setTextPSDEFId(String textPSDEFId){
        this.set(FIELD_TEXTPSDEFID, textPSDEFId);
    }
    
    /**
     * 获取 文本实体属性  
     * @return
     */
    @JsonIgnore
    public String getTextPSDEFId(){
        Object objValue = this.get(FIELD_TEXTPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 文本实体属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTextPSDEFIdDirty(){
        if(this.contains(FIELD_TEXTPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 文本实体属性
     */
    @JsonIgnore
    public void resetTextPSDEFId(){
        this.reset(FIELD_TEXTPSDEFID);
    }

    /**
     * 设置 文本实体属性
     * <P>
     * 等同 {@link #setTextPSDEFId}
     * @param textPSDEFId
     */
    @JsonIgnore
    public PSSysBICubeDimension textpsdefid(String textPSDEFId){
        this.setTextPSDEFId(textPSDEFId);
        return this;
    }

    /**
     * 设置 文本实体属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTextPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysBICubeDimension textpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setTextPSDEFId(null);
            this.setTextPSDEFName(null);
        }
        else{
            this.setTextPSDEFId(pSDEField.getPSDEFieldId());
            this.setTextPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>TEXTPSDEFNAME</B>&nbsp;文本实体属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TEXTPSDEFID}
     */
    public final static String FIELD_TEXTPSDEFNAME = "textpsdefname";

    /**
     * 设置 文本实体属性
     * 
     * @param textPSDEFName
     * 
     */
    @JsonProperty(FIELD_TEXTPSDEFNAME)
    public void setTextPSDEFName(String textPSDEFName){
        this.set(FIELD_TEXTPSDEFNAME, textPSDEFName);
    }
    
    /**
     * 获取 文本实体属性  
     * @return
     */
    @JsonIgnore
    public String getTextPSDEFName(){
        Object objValue = this.get(FIELD_TEXTPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 文本实体属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTextPSDEFNameDirty(){
        if(this.contains(FIELD_TEXTPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 文本实体属性
     */
    @JsonIgnore
    public void resetTextPSDEFName(){
        this.reset(FIELD_TEXTPSDEFNAME);
    }

    /**
     * 设置 文本实体属性
     * <P>
     * 等同 {@link #setTextPSDEFName}
     * @param textPSDEFName
     */
    @JsonIgnore
    public PSSysBICubeDimension textpsdefname(String textPSDEFName){
        this.setTextPSDEFName(textPSDEFName);
        return this;
    }

    /**
     * <B>TEXTTEMPLATE</B>&nbsp;文本模板
     */
    public final static String FIELD_TEXTTEMPLATE = "texttemplate";

    /**
     * 设置 文本模板
     * 
     * @param textTemplate
     * 
     */
    @JsonProperty(FIELD_TEXTTEMPLATE)
    public void setTextTemplate(String textTemplate){
        this.set(FIELD_TEXTTEMPLATE, textTemplate);
    }
    
    /**
     * 获取 文本模板  
     * @return
     */
    @JsonIgnore
    public String getTextTemplate(){
        Object objValue = this.get(FIELD_TEXTTEMPLATE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 文本模板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTextTemplateDirty(){
        if(this.contains(FIELD_TEXTTEMPLATE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 文本模板
     */
    @JsonIgnore
    public void resetTextTemplate(){
        this.reset(FIELD_TEXTTEMPLATE);
    }

    /**
     * 设置 文本模板
     * <P>
     * 等同 {@link #setTextTemplate}
     * @param textTemplate
     */
    @JsonIgnore
    public PSSysBICubeDimension texttemplate(String textTemplate){
        this.setTextTemplate(textTemplate);
        return this;
    }

    /**
     * <B>TIPTEMPLATE</B>&nbsp;提示模板
     */
    public final static String FIELD_TIPTEMPLATE = "tiptemplate";

    /**
     * 设置 提示模板
     * 
     * @param tipTemplate
     * 
     */
    @JsonProperty(FIELD_TIPTEMPLATE)
    public void setTipTemplate(String tipTemplate){
        this.set(FIELD_TIPTEMPLATE, tipTemplate);
    }
    
    /**
     * 获取 提示模板  
     * @return
     */
    @JsonIgnore
    public String getTipTemplate(){
        Object objValue = this.get(FIELD_TIPTEMPLATE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 提示模板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTipTemplateDirty(){
        if(this.contains(FIELD_TIPTEMPLATE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 提示模板
     */
    @JsonIgnore
    public void resetTipTemplate(){
        this.reset(FIELD_TIPTEMPLATE);
    }

    /**
     * 设置 提示模板
     * <P>
     * 等同 {@link #setTipTemplate}
     * @param tipTemplate
     */
    @JsonIgnore
    public PSSysBICubeDimension tiptemplate(String tipTemplate){
        this.setTipTemplate(tipTemplate);
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
    public PSSysBICubeDimension updatedate(String updateDate){
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
    public PSSysBICubeDimension updateman(String updateMan){
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
    public PSSysBICubeDimension usercat(String userCat){
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
    public PSSysBICubeDimension usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysBICubeDimension usertag(String userTag){
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
    public PSSysBICubeDimension usertag2(String userTag2){
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
    public PSSysBICubeDimension usertag3(String userTag3){
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
    public PSSysBICubeDimension usertag4(String userTag4){
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
    public PSSysBICubeDimension validflag(Integer validFlag){
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
    public PSSysBICubeDimension validflag(Boolean validFlag){
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
        return this.getPSSysBICubeDimensionId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysBICubeDimensionId(strValue);
    }

    @JsonIgnore
    public PSSysBICubeDimension id(String strValue){
        this.setPSSysBICubeDimensionId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysBICubeDimension){
            PSSysBICubeDimension model = (PSSysBICubeDimension)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
