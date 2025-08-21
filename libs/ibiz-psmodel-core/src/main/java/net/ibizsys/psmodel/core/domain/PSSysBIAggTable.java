package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSBIAGGTABLE</B>智能报表聚合数据 模型传输对象
 * <P>
 * 智能报表系统中用于定义数据聚合逻辑的核心模型，支持预计算聚合或实时动态聚合，以提升查询性能和分析效率。它基于宽表实体构建聚合数据集，并与立方体、报表体系深度集成，实现高性能多维分析
 */
public class PSSysBIAggTable extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysBIAggTable(){
        this.setValidFlag(1);
    }      

    /**
     * <B>BIAGGTABLEMODE</B>&nbsp;聚合表模式
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_BIAGGTABLEMODE = "biaggtablemode";

    /**
     * 设置 聚合表模式
     * 
     * @param bIAggTableMode
     * 
     */
    @JsonProperty(FIELD_BIAGGTABLEMODE)
    public void setBIAggTableMode(String bIAggTableMode){
        this.set(FIELD_BIAGGTABLEMODE, bIAggTableMode);
    }
    
    /**
     * 获取 聚合表模式  
     * @return
     */
    @JsonIgnore
    public String getBIAggTableMode(){
        Object objValue = this.get(FIELD_BIAGGTABLEMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 聚合表模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBIAggTableModeDirty(){
        if(this.contains(FIELD_BIAGGTABLEMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 聚合表模式
     */
    @JsonIgnore
    public void resetBIAggTableMode(){
        this.reset(FIELD_BIAGGTABLEMODE);
    }

    /**
     * 设置 聚合表模式
     * <P>
     * 等同 {@link #setBIAggTableMode}
     * @param bIAggTableMode
     */
    @JsonIgnore
    public PSSysBIAggTable biaggtablemode(String bIAggTableMode){
        this.setBIAggTableMode(bIAggTableMode);
        return this;
    }

    /**
     * <B>BIAGGTABLEOPTION</B>&nbsp;智能报表聚合表选项
     */
    public final static String FIELD_BIAGGTABLEOPTION = "biaggtableoption";

    /**
     * 设置 智能报表聚合表选项
     * 
     * @param bIAggTableOption
     * 
     */
    @JsonProperty(FIELD_BIAGGTABLEOPTION)
    public void setBIAggTableOption(Integer bIAggTableOption){
        this.set(FIELD_BIAGGTABLEOPTION, bIAggTableOption);
    }
    
    /**
     * 获取 智能报表聚合表选项  
     * @return
     */
    @JsonIgnore
    public Integer getBIAggTableOption(){
        Object objValue = this.get(FIELD_BIAGGTABLEOPTION);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 智能报表聚合表选项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBIAggTableOptionDirty(){
        if(this.contains(FIELD_BIAGGTABLEOPTION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 智能报表聚合表选项
     */
    @JsonIgnore
    public void resetBIAggTableOption(){
        this.reset(FIELD_BIAGGTABLEOPTION);
    }

    /**
     * 设置 智能报表聚合表选项
     * <P>
     * 等同 {@link #setBIAggTableOption}
     * @param bIAggTableOption
     */
    @JsonIgnore
    public PSSysBIAggTable biaggtableoption(Integer bIAggTableOption){
        this.setBIAggTableOption(bIAggTableOption);
        return this;
    }

    /**
     * <B>BIAGGTABLEPARAMS</B>&nbsp;智能报表聚合表参数
     */
    public final static String FIELD_BIAGGTABLEPARAMS = "biaggtableparams";

    /**
     * 设置 智能报表聚合表参数
     * 
     * @param bIAggTableParams
     * 
     */
    @JsonProperty(FIELD_BIAGGTABLEPARAMS)
    public void setBIAggTableParams(String bIAggTableParams){
        this.set(FIELD_BIAGGTABLEPARAMS, bIAggTableParams);
    }
    
    /**
     * 获取 智能报表聚合表参数  
     * @return
     */
    @JsonIgnore
    public String getBIAggTableParams(){
        Object objValue = this.get(FIELD_BIAGGTABLEPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 智能报表聚合表参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBIAggTableParamsDirty(){
        if(this.contains(FIELD_BIAGGTABLEPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 智能报表聚合表参数
     */
    @JsonIgnore
    public void resetBIAggTableParams(){
        this.reset(FIELD_BIAGGTABLEPARAMS);
    }

    /**
     * 设置 智能报表聚合表参数
     * <P>
     * 等同 {@link #setBIAggTableParams}
     * @param bIAggTableParams
     */
    @JsonIgnore
    public PSSysBIAggTable biaggtableparams(String bIAggTableParams){
        this.setBIAggTableParams(bIAggTableParams);
        return this;
    }

    /**
     * <B>BIAGGTABLETAG</B>&nbsp;聚合数据标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_BIAGGTABLETAG = "biaggtabletag";

    /**
     * 设置 聚合数据标记
     * 
     * @param bIAggTableTag
     * 
     */
    @JsonProperty(FIELD_BIAGGTABLETAG)
    public void setBIAggTableTag(String bIAggTableTag){
        this.set(FIELD_BIAGGTABLETAG, bIAggTableTag);
    }
    
    /**
     * 获取 聚合数据标记  
     * @return
     */
    @JsonIgnore
    public String getBIAggTableTag(){
        Object objValue = this.get(FIELD_BIAGGTABLETAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 聚合数据标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBIAggTableTagDirty(){
        if(this.contains(FIELD_BIAGGTABLETAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 聚合数据标记
     */
    @JsonIgnore
    public void resetBIAggTableTag(){
        this.reset(FIELD_BIAGGTABLETAG);
    }

    /**
     * 设置 聚合数据标记
     * <P>
     * 等同 {@link #setBIAggTableTag}
     * @param bIAggTableTag
     */
    @JsonIgnore
    public PSSysBIAggTable biaggtabletag(String bIAggTableTag){
        this.setBIAggTableTag(bIAggTableTag);
        return this;
    }

    /**
     * <B>BIAGGTABLETAG2</B>&nbsp;聚合数据标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_BIAGGTABLETAG2 = "biaggtabletag2";

    /**
     * 设置 聚合数据标记2
     * 
     * @param bIAggTableTag2
     * 
     */
    @JsonProperty(FIELD_BIAGGTABLETAG2)
    public void setBIAggTableTag2(String bIAggTableTag2){
        this.set(FIELD_BIAGGTABLETAG2, bIAggTableTag2);
    }
    
    /**
     * 获取 聚合数据标记2  
     * @return
     */
    @JsonIgnore
    public String getBIAggTableTag2(){
        Object objValue = this.get(FIELD_BIAGGTABLETAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 聚合数据标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBIAggTableTag2Dirty(){
        if(this.contains(FIELD_BIAGGTABLETAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 聚合数据标记2
     */
    @JsonIgnore
    public void resetBIAggTableTag2(){
        this.reset(FIELD_BIAGGTABLETAG2);
    }

    /**
     * 设置 聚合数据标记2
     * <P>
     * 等同 {@link #setBIAggTableTag2}
     * @param bIAggTableTag2
     */
    @JsonIgnore
    public PSSysBIAggTable biaggtabletag2(String bIAggTableTag2){
        this.setBIAggTableTag2(bIAggTableTag2);
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
    public PSSysBIAggTable codename(String codeName){
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
    public PSSysBIAggTable createdate(String createDate){
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
    public PSSysBIAggTable createman(String createMan){
        this.setCreateMan(createMan);
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
    public PSSysBIAggTable memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSDEDATAQUERYID</B>&nbsp;实体数据查询
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataQuery} 
     */
    public final static String FIELD_PSDEDATAQUERYID = "psdedataqueryid";

    /**
     * 设置 实体数据查询
     * 
     * @param pSDEDataQueryId
     * 
     */
    @JsonProperty(FIELD_PSDEDATAQUERYID)
    public void setPSDEDataQueryId(String pSDEDataQueryId){
        this.set(FIELD_PSDEDATAQUERYID, pSDEDataQueryId);
    }
    
    /**
     * 获取 实体数据查询  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataQueryId(){
        Object objValue = this.get(FIELD_PSDEDATAQUERYID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据查询 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataQueryIdDirty(){
        if(this.contains(FIELD_PSDEDATAQUERYID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据查询
     */
    @JsonIgnore
    public void resetPSDEDataQueryId(){
        this.reset(FIELD_PSDEDATAQUERYID);
    }

    /**
     * 设置 实体数据查询
     * <P>
     * 等同 {@link #setPSDEDataQueryId}
     * @param pSDEDataQueryId
     */
    @JsonIgnore
    public PSSysBIAggTable psdedataqueryid(String pSDEDataQueryId){
        this.setPSDEDataQueryId(pSDEDataQueryId);
        return this;
    }

    /**
     * 设置 实体数据查询，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDataQueryId}
     * @param pSDEDataQuery 引用对象
     */
    @JsonIgnore
    public PSSysBIAggTable psdedataqueryid(PSDEDataQuery pSDEDataQuery){
        if(pSDEDataQuery == null){
            this.setPSDEDataQueryId(null);
            this.setPSDEDataQueryName(null);
        }
        else{
            this.setPSDEDataQueryId(pSDEDataQuery.getPSDEDataQueryId());
            this.setPSDEDataQueryName(pSDEDataQuery.getPSDEDataQueryName());
        }
        return this;
    }

    /**
     * <B>PSDEDATAQUERYNAME</B>&nbsp;实体数据查询
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDATAQUERYID}
     */
    public final static String FIELD_PSDEDATAQUERYNAME = "psdedataqueryname";

    /**
     * 设置 实体数据查询
     * 
     * @param pSDEDataQueryName
     * 
     */
    @JsonProperty(FIELD_PSDEDATAQUERYNAME)
    public void setPSDEDataQueryName(String pSDEDataQueryName){
        this.set(FIELD_PSDEDATAQUERYNAME, pSDEDataQueryName);
    }
    
    /**
     * 获取 实体数据查询  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataQueryName(){
        Object objValue = this.get(FIELD_PSDEDATAQUERYNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据查询 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataQueryNameDirty(){
        if(this.contains(FIELD_PSDEDATAQUERYNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据查询
     */
    @JsonIgnore
    public void resetPSDEDataQueryName(){
        this.reset(FIELD_PSDEDATAQUERYNAME);
    }

    /**
     * 设置 实体数据查询
     * <P>
     * 等同 {@link #setPSDEDataQueryName}
     * @param pSDEDataQueryName
     */
    @JsonIgnore
    public PSSysBIAggTable psdedataqueryname(String pSDEDataQueryName){
        this.setPSDEDataQueryName(pSDEDataQueryName);
        return this;
    }

    /**
     * <B>PSDEDATASETID</B>&nbsp;数据源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataSet} 
     */
    public final static String FIELD_PSDEDATASETID = "psdedatasetid";

    /**
     * 设置 数据源
     * 
     * @param pSDEDataSetId
     * 
     */
    @JsonProperty(FIELD_PSDEDATASETID)
    public void setPSDEDataSetId(String pSDEDataSetId){
        this.set(FIELD_PSDEDATASETID, pSDEDataSetId);
    }
    
    /**
     * 获取 数据源  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataSetId(){
        Object objValue = this.get(FIELD_PSDEDATASETID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataSetIdDirty(){
        if(this.contains(FIELD_PSDEDATASETID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据源
     */
    @JsonIgnore
    public void resetPSDEDataSetId(){
        this.reset(FIELD_PSDEDATASETID);
    }

    /**
     * 设置 数据源
     * <P>
     * 等同 {@link #setPSDEDataSetId}
     * @param pSDEDataSetId
     */
    @JsonIgnore
    public PSSysBIAggTable psdedatasetid(String pSDEDataSetId){
        this.setPSDEDataSetId(pSDEDataSetId);
        return this;
    }

    /**
     * 设置 数据源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDataSetId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSSysBIAggTable psdedatasetid(PSDEDataSet pSDEDataSet){
        if(pSDEDataSet == null){
            this.setPSDEDataSetId(null);
            this.setPSDEDataSetName(null);
        }
        else{
            this.setPSDEDataSetId(pSDEDataSet.getPSDEDataSetId());
            this.setPSDEDataSetName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    /**
     * <B>PSDEDATASETNAME</B>&nbsp;数据源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDATASETID}
     */
    public final static String FIELD_PSDEDATASETNAME = "psdedatasetname";

    /**
     * 设置 数据源
     * 
     * @param pSDEDataSetName
     * 
     */
    @JsonProperty(FIELD_PSDEDATASETNAME)
    public void setPSDEDataSetName(String pSDEDataSetName){
        this.set(FIELD_PSDEDATASETNAME, pSDEDataSetName);
    }
    
    /**
     * 获取 数据源  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataSetName(){
        Object objValue = this.get(FIELD_PSDEDATASETNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataSetNameDirty(){
        if(this.contains(FIELD_PSDEDATASETNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据源
     */
    @JsonIgnore
    public void resetPSDEDataSetName(){
        this.reset(FIELD_PSDEDATASETNAME);
    }

    /**
     * 设置 数据源
     * <P>
     * 等同 {@link #setPSDEDataSetName}
     * @param pSDEDataSetName
     */
    @JsonIgnore
    public PSSysBIAggTable psdedatasetname(String pSDEDataSetName){
        this.setPSDEDataSetName(pSDEDataSetName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;宽表实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 宽表实体
     * 
     * @param pSDEId
     * 
     */
    @JsonProperty(FIELD_PSDEID)
    public void setPSDEId(String pSDEId){
        this.set(FIELD_PSDEID, pSDEId);
    }
    
    /**
     * 获取 宽表实体  
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
     * 判断 宽表实体 是否指定值，包括空值
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
     * 重置 宽表实体
     */
    @JsonIgnore
    public void resetPSDEId(){
        this.reset(FIELD_PSDEID);
    }

    /**
     * 设置 宽表实体
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSSysBIAggTable psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * 设置 宽表实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSSysBIAggTable psdeid(PSDataEntity pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;宽表实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_PSDENAME = "psdename";

    /**
     * 设置 宽表实体
     * 
     * @param pSDEName
     * 
     */
    @JsonProperty(FIELD_PSDENAME)
    public void setPSDEName(String pSDEName){
        this.set(FIELD_PSDENAME, pSDEName);
    }
    
    /**
     * 获取 宽表实体  
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
     * 判断 宽表实体 是否指定值，包括空值
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
     * 重置 宽表实体
     */
    @JsonIgnore
    public void resetPSDEName(){
        this.reset(FIELD_PSDENAME);
    }

    /**
     * 设置 宽表实体
     * <P>
     * 等同 {@link #setPSDEName}
     * @param pSDEName
     */
    @JsonIgnore
    public PSSysBIAggTable psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSSYSBIAGGTABLEID</B>&nbsp;聚合数据标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSBIAGGTABLEID = "pssysbiaggtableid";

    /**
     * 设置 聚合数据标识
     * 
     * @param pSSysBIAggTableId
     * 
     */
    @JsonProperty(FIELD_PSSYSBIAGGTABLEID)
    public void setPSSysBIAggTableId(String pSSysBIAggTableId){
        this.set(FIELD_PSSYSBIAGGTABLEID, pSSysBIAggTableId);
    }
    
    /**
     * 获取 聚合数据标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysBIAggTableId(){
        Object objValue = this.get(FIELD_PSSYSBIAGGTABLEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 聚合数据标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBIAggTableIdDirty(){
        if(this.contains(FIELD_PSSYSBIAGGTABLEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 聚合数据标识
     */
    @JsonIgnore
    public void resetPSSysBIAggTableId(){
        this.reset(FIELD_PSSYSBIAGGTABLEID);
    }

    /**
     * 设置 聚合数据标识
     * <P>
     * 等同 {@link #setPSSysBIAggTableId}
     * @param pSSysBIAggTableId
     */
    @JsonIgnore
    public PSSysBIAggTable pssysbiaggtableid(String pSSysBIAggTableId){
        this.setPSSysBIAggTableId(pSSysBIAggTableId);
        return this;
    }

    /**
     * <B>PSSYSBIAGGTABLENAME</B>&nbsp;聚合数据名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSBIAGGTABLENAME = "pssysbiaggtablename";

    /**
     * 设置 聚合数据名称
     * 
     * @param pSSysBIAggTableName
     * 
     */
    @JsonProperty(FIELD_PSSYSBIAGGTABLENAME)
    public void setPSSysBIAggTableName(String pSSysBIAggTableName){
        this.set(FIELD_PSSYSBIAGGTABLENAME, pSSysBIAggTableName);
    }
    
    /**
     * 获取 聚合数据名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysBIAggTableName(){
        Object objValue = this.get(FIELD_PSSYSBIAGGTABLENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 聚合数据名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBIAggTableNameDirty(){
        if(this.contains(FIELD_PSSYSBIAGGTABLENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 聚合数据名称
     */
    @JsonIgnore
    public void resetPSSysBIAggTableName(){
        this.reset(FIELD_PSSYSBIAGGTABLENAME);
    }

    /**
     * 设置 聚合数据名称
     * <P>
     * 等同 {@link #setPSSysBIAggTableName}
     * @param pSSysBIAggTableName
     */
    @JsonIgnore
    public PSSysBIAggTable pssysbiaggtablename(String pSSysBIAggTableName){
        this.setPSSysBIAggTableName(pSSysBIAggTableName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysBIAggTableName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysBIAggTableName(strName);
    }

    @JsonIgnore
    public PSSysBIAggTable name(String strName){
        this.setPSSysBIAggTableName(strName);
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
    public PSSysBIAggTable pssysbicubeid(String pSSysBICubeId){
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
    public PSSysBIAggTable pssysbicubeid(PSSysBICube pSSysBICube){
        if(pSSysBICube == null){
            this.setPSSysBICubeId(null);
            this.setPSSysBICubeName(null);
        }
        else{
            this.setPSSysBICubeId(pSSysBICube.getPSSysBICubeId());
            this.setPSSysBICubeName(pSSysBICube.getPSSysBICubeName());
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
    public PSSysBIAggTable pssysbicubename(String pSSysBICubeName){
        this.setPSSysBICubeName(pSSysBICubeName);
        return this;
    }

    /**
     * <B>PSSYSBISCHEMEID</B>&nbsp;智能报表体系
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysBIScheme} 
     */
    public final static String FIELD_PSSYSBISCHEMEID = "pssysbischemeid";

    /**
     * 设置 智能报表体系
     * 
     * @param pSSysBISchemeId
     * 
     */
    @JsonProperty(FIELD_PSSYSBISCHEMEID)
    public void setPSSysBISchemeId(String pSSysBISchemeId){
        this.set(FIELD_PSSYSBISCHEMEID, pSSysBISchemeId);
    }
    
    /**
     * 获取 智能报表体系  
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
     * 判断 智能报表体系 是否指定值，包括空值
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
     * 重置 智能报表体系
     */
    @JsonIgnore
    public void resetPSSysBISchemeId(){
        this.reset(FIELD_PSSYSBISCHEMEID);
    }

    /**
     * 设置 智能报表体系
     * <P>
     * 等同 {@link #setPSSysBISchemeId}
     * @param pSSysBISchemeId
     */
    @JsonIgnore
    public PSSysBIAggTable pssysbischemeid(String pSSysBISchemeId){
        this.setPSSysBISchemeId(pSSysBISchemeId);
        return this;
    }

    /**
     * 设置 智能报表体系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysBISchemeId}
     * @param pSSysBIScheme 引用对象
     */
    @JsonIgnore
    public PSSysBIAggTable pssysbischemeid(PSSysBIScheme pSSysBIScheme){
        if(pSSysBIScheme == null){
            this.setPSSysBISchemeId(null);
            this.setPSSysBISchemeName(null);
        }
        else{
            this.setPSSysBISchemeId(pSSysBIScheme.getPSSysBISchemeId());
            this.setPSSysBISchemeName(pSSysBIScheme.getPSSysBISchemeName());
        }
        return this;
    }

    /**
     * <B>PSSYSBISCHEMENAME</B>&nbsp;智能报表体系
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBISCHEMEID}
     */
    public final static String FIELD_PSSYSBISCHEMENAME = "pssysbischemename";

    /**
     * 设置 智能报表体系
     * 
     * @param pSSysBISchemeName
     * 
     */
    @JsonProperty(FIELD_PSSYSBISCHEMENAME)
    public void setPSSysBISchemeName(String pSSysBISchemeName){
        this.set(FIELD_PSSYSBISCHEMENAME, pSSysBISchemeName);
    }
    
    /**
     * 获取 智能报表体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysBISchemeName(){
        Object objValue = this.get(FIELD_PSSYSBISCHEMENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 智能报表体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBISchemeNameDirty(){
        if(this.contains(FIELD_PSSYSBISCHEMENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 智能报表体系
     */
    @JsonIgnore
    public void resetPSSysBISchemeName(){
        this.reset(FIELD_PSSYSBISCHEMENAME);
    }

    /**
     * 设置 智能报表体系
     * <P>
     * 等同 {@link #setPSSysBISchemeName}
     * @param pSSysBISchemeName
     */
    @JsonIgnore
    public PSSysBIAggTable pssysbischemename(String pSSysBISchemeName){
        this.setPSSysBISchemeName(pSSysBISchemeName);
        return this;
    }

    /**
     * <B>REALTIMEMODE</B>&nbsp;实时处理
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_REALTIMEMODE = "realtimemode";

    /**
     * 设置 实时处理
     * 
     * @param realTimeMode
     * 
     */
    @JsonProperty(FIELD_REALTIMEMODE)
    public void setRealTimeMode(Integer realTimeMode){
        this.set(FIELD_REALTIMEMODE, realTimeMode);
    }
    
    /**
     * 获取 实时处理  
     * @return
     */
    @JsonIgnore
    public Integer getRealTimeMode(){
        Object objValue = this.get(FIELD_REALTIMEMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 实时处理 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRealTimeModeDirty(){
        if(this.contains(FIELD_REALTIMEMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实时处理
     */
    @JsonIgnore
    public void resetRealTimeMode(){
        this.reset(FIELD_REALTIMEMODE);
    }

    /**
     * 设置 实时处理
     * <P>
     * 等同 {@link #setRealTimeMode}
     * @param realTimeMode
     */
    @JsonIgnore
    public PSSysBIAggTable realtimemode(Integer realTimeMode){
        this.setRealTimeMode(realTimeMode);
        return this;
    }

     /**
     * 设置 实时处理
     * <P>
     * 等同 {@link #setRealTimeMode}
     * @param realTimeMode
     */
    @JsonIgnore
    public PSSysBIAggTable realtimemode(Boolean realTimeMode){
        if(realTimeMode == null){
            this.setRealTimeMode(null);
        }
        else{
            this.setRealTimeMode(realTimeMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSSysBIAggTable updatedate(String updateDate){
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
    public PSSysBIAggTable updateman(String updateMan){
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
    public PSSysBIAggTable usercat(String userCat){
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
    public PSSysBIAggTable usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysBIAggTable usertag(String userTag){
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
    public PSSysBIAggTable usertag2(String userTag2){
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
    public PSSysBIAggTable usertag3(String userTag3){
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
    public PSSysBIAggTable usertag4(String userTag4){
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
    public PSSysBIAggTable validflag(Integer validFlag){
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
    public PSSysBIAggTable validflag(Boolean validFlag){
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
        return this.getPSSysBIAggTableId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysBIAggTableId(strValue);
    }

    @JsonIgnore
    public PSSysBIAggTable id(String strValue){
        this.setPSSysBIAggTableId(strValue);
        return this;
    }


    /**
     *  智能报表聚合数据列 成员集合
     */
    public final static String FIELD_PSSYSBIAGGCOLUMNS = "pssysbiaggcolumns";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSSysBIAggColumn> pssysbiaggcolumns;

    /**
     * 获取 智能报表聚合数据列 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSSYSBIAGGCOLUMNS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSSysBIAggColumn> getPSSysBIAggColumns(){
        return this.pssysbiaggcolumns;
    }

    /**
     * 设置 智能报表聚合数据列 成员集合  
     * @param pssysbiaggcolumns
     */
    @JsonProperty(FIELD_PSSYSBIAGGCOLUMNS)
    public void setPSSysBIAggColumns(java.util.List<net.ibizsys.psmodel.core.domain.PSSysBIAggColumn> pssysbiaggcolumns){
        this.pssysbiaggcolumns = pssysbiaggcolumns;
    }

    /**
     * 获取 智能报表聚合数据列 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSSysBIAggColumn> getPSSysBIAggColumnsIf(){
        if(this.pssysbiaggcolumns == null){
            this.pssysbiaggcolumns = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSSysBIAggColumn>();          
        }
        return this.pssysbiaggcolumns;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysBIAggTable){
            PSSysBIAggTable model = (PSSysBIAggTable)iPSModel;
            model.setPSSysBIAggColumns(this.getPSSysBIAggColumns());
        }
        super.copyTo(iPSModel);
    }
}
