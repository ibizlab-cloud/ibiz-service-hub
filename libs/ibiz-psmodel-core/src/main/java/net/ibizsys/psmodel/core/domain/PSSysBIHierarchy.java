package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSBIHIERARCHY</B>智能报表维度体系 模型传输对象
 * <P>
 * 智能报表系统中用于定义维度层级结构的核心模型，支持实体型（如组织架构）和时间型（如年-月-日）层级体系。它通过关联代码表、实体属性或自定义层级，构建多维分析中的钻取路径，并与立方体维度层级关联，实现数据的分层展示与分析
 */
public class PSSysBIHierarchy extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysBIHierarchy(){
        this.setValidFlag(1);
    }      

    /**
     * <B>ALLCAPTION</B>&nbsp;全部成员标题
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_ALLCAPTION = "allcaption";

    /**
     * 设置 全部成员标题
     * 
     * @param allCaption
     * 
     */
    @JsonProperty(FIELD_ALLCAPTION)
    public void setAllCaption(String allCaption){
        this.set(FIELD_ALLCAPTION, allCaption);
    }
    
    /**
     * 获取 全部成员标题  
     * @return
     */
    @JsonIgnore
    public String getAllCaption(){
        Object objValue = this.get(FIELD_ALLCAPTION);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 全部成员标题 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAllCaptionDirty(){
        if(this.contains(FIELD_ALLCAPTION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 全部成员标题
     */
    @JsonIgnore
    public void resetAllCaption(){
        this.reset(FIELD_ALLCAPTION);
    }

    /**
     * 设置 全部成员标题
     * <P>
     * 等同 {@link #setAllCaption}
     * @param allCaption
     */
    @JsonIgnore
    public PSSysBIHierarchy allcaption(String allCaption){
        this.setAllCaption(allCaption);
        return this;
    }

    /**
     * <B>BIHIERARCHYTAG</B>&nbsp;维度体系标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_BIHIERARCHYTAG = "bihierarchytag";

    /**
     * 设置 维度体系标记
     * 
     * @param bIHierarchyTag
     * 
     */
    @JsonProperty(FIELD_BIHIERARCHYTAG)
    public void setBIHierarchyTag(String bIHierarchyTag){
        this.set(FIELD_BIHIERARCHYTAG, bIHierarchyTag);
    }
    
    /**
     * 获取 维度体系标记  
     * @return
     */
    @JsonIgnore
    public String getBIHierarchyTag(){
        Object objValue = this.get(FIELD_BIHIERARCHYTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 维度体系标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBIHierarchyTagDirty(){
        if(this.contains(FIELD_BIHIERARCHYTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 维度体系标记
     */
    @JsonIgnore
    public void resetBIHierarchyTag(){
        this.reset(FIELD_BIHIERARCHYTAG);
    }

    /**
     * 设置 维度体系标记
     * <P>
     * 等同 {@link #setBIHierarchyTag}
     * @param bIHierarchyTag
     */
    @JsonIgnore
    public PSSysBIHierarchy bihierarchytag(String bIHierarchyTag){
        this.setBIHierarchyTag(bIHierarchyTag);
        return this;
    }

    /**
     * <B>BIHIERARCHYTAG2</B>&nbsp;维度体系标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_BIHIERARCHYTAG2 = "bihierarchytag2";

    /**
     * 设置 维度体系标记2
     * 
     * @param bIHierarchyTag2
     * 
     */
    @JsonProperty(FIELD_BIHIERARCHYTAG2)
    public void setBIHierarchyTag2(String bIHierarchyTag2){
        this.set(FIELD_BIHIERARCHYTAG2, bIHierarchyTag2);
    }
    
    /**
     * 获取 维度体系标记2  
     * @return
     */
    @JsonIgnore
    public String getBIHierarchyTag2(){
        Object objValue = this.get(FIELD_BIHIERARCHYTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 维度体系标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBIHierarchyTag2Dirty(){
        if(this.contains(FIELD_BIHIERARCHYTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 维度体系标记2
     */
    @JsonIgnore
    public void resetBIHierarchyTag2(){
        this.reset(FIELD_BIHIERARCHYTAG2);
    }

    /**
     * 设置 维度体系标记2
     * <P>
     * 等同 {@link #setBIHierarchyTag2}
     * @param bIHierarchyTag2
     */
    @JsonIgnore
    public PSSysBIHierarchy bihierarchytag2(String bIHierarchyTag2){
        this.setBIHierarchyTag2(bIHierarchyTag2);
        return this;
    }

    /**
     * <B>BIHIERARCHYTYPE</B>&nbsp;体系类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.BIHierarchyType} 
     */
    public final static String FIELD_BIHIERARCHYTYPE = "bihierarchytype";

    /**
     * 设置 体系类型
     * 
     * @param bIHierarchyType
     * 
     */
    @JsonProperty(FIELD_BIHIERARCHYTYPE)
    public void setBIHierarchyType(String bIHierarchyType){
        this.set(FIELD_BIHIERARCHYTYPE, bIHierarchyType);
    }
    
    /**
     * 获取 体系类型  
     * @return
     */
    @JsonIgnore
    public String getBIHierarchyType(){
        Object objValue = this.get(FIELD_BIHIERARCHYTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 体系类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBIHierarchyTypeDirty(){
        if(this.contains(FIELD_BIHIERARCHYTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 体系类型
     */
    @JsonIgnore
    public void resetBIHierarchyType(){
        this.reset(FIELD_BIHIERARCHYTYPE);
    }

    /**
     * 设置 体系类型
     * <P>
     * 等同 {@link #setBIHierarchyType}
     * @param bIHierarchyType
     */
    @JsonIgnore
    public PSSysBIHierarchy bihierarchytype(String bIHierarchyType){
        this.setBIHierarchyType(bIHierarchyType);
        return this;
    }

     /**
     * 设置 体系类型
     * <P>
     * 等同 {@link #setBIHierarchyType}
     * @param bIHierarchyType
     */
    @JsonIgnore
    public PSSysBIHierarchy bihierarchytype(net.ibizsys.psmodel.core.util.PSModelEnums.BIHierarchyType bIHierarchyType){
        if(bIHierarchyType == null){
            this.setBIHierarchyType(null);
        }
        else{
            this.setBIHierarchyType(bIHierarchyType.value);
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
    public PSSysBIHierarchy codename(String codeName){
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
    public PSSysBIHierarchy createdate(String createDate){
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
    public PSSysBIHierarchy createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>HASALL</B>&nbsp;全部成员
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_HASALL = "hasall";

    /**
     * 设置 全部成员
     * 
     * @param hasAll
     * 
     */
    @JsonProperty(FIELD_HASALL)
    public void setHasAll(Integer hasAll){
        this.set(FIELD_HASALL, hasAll);
    }
    
    /**
     * 获取 全部成员  
     * @return
     */
    @JsonIgnore
    public Integer getHasAll(){
        Object objValue = this.get(FIELD_HASALL);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 全部成员 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHasAllDirty(){
        if(this.contains(FIELD_HASALL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 全部成员
     */
    @JsonIgnore
    public void resetHasAll(){
        this.reset(FIELD_HASALL);
    }

    /**
     * 设置 全部成员
     * <P>
     * 等同 {@link #setHasAll}
     * @param hasAll
     */
    @JsonIgnore
    public PSSysBIHierarchy hasall(Integer hasAll){
        this.setHasAll(hasAll);
        return this;
    }

     /**
     * 设置 全部成员
     * <P>
     * 等同 {@link #setHasAll}
     * @param hasAll
     */
    @JsonIgnore
    public PSSysBIHierarchy hasall(Boolean hasAll){
        if(hasAll == null){
            this.setHasAll(null);
        }
        else{
            this.setHasAll(hasAll?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSSysBIHierarchy memo(String memo){
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
    public PSSysBIHierarchy ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSCODELISTID</B>&nbsp;层级代码表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSCodeList} 
     */
    public final static String FIELD_PSCODELISTID = "pscodelistid";

    /**
     * 设置 层级代码表
     * 
     * @param pSCodeListId
     * 
     */
    @JsonProperty(FIELD_PSCODELISTID)
    public void setPSCodeListId(String pSCodeListId){
        this.set(FIELD_PSCODELISTID, pSCodeListId);
    }
    
    /**
     * 获取 层级代码表  
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
     * 判断 层级代码表 是否指定值，包括空值
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
     * 重置 层级代码表
     */
    @JsonIgnore
    public void resetPSCodeListId(){
        this.reset(FIELD_PSCODELISTID);
    }

    /**
     * 设置 层级代码表
     * <P>
     * 等同 {@link #setPSCodeListId}
     * @param pSCodeListId
     */
    @JsonIgnore
    public PSSysBIHierarchy pscodelistid(String pSCodeListId){
        this.setPSCodeListId(pSCodeListId);
        return this;
    }

    /**
     * 设置 层级代码表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSCodeListId}
     * @param pSCodeList 引用对象
     */
    @JsonIgnore
    public PSSysBIHierarchy pscodelistid(PSCodeList pSCodeList){
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
     * <B>PSCODELISTNAME</B>&nbsp;层级代码表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCODELISTID}
     */
    public final static String FIELD_PSCODELISTNAME = "pscodelistname";

    /**
     * 设置 层级代码表
     * 
     * @param pSCodeListName
     * 
     */
    @JsonProperty(FIELD_PSCODELISTNAME)
    public void setPSCodeListName(String pSCodeListName){
        this.set(FIELD_PSCODELISTNAME, pSCodeListName);
    }
    
    /**
     * 获取 层级代码表  
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
     * 判断 层级代码表 是否指定值，包括空值
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
     * 重置 层级代码表
     */
    @JsonIgnore
    public void resetPSCodeListName(){
        this.reset(FIELD_PSCODELISTNAME);
    }

    /**
     * 设置 层级代码表
     * <P>
     * 等同 {@link #setPSCodeListName}
     * @param pSCodeListName
     */
    @JsonIgnore
    public PSSysBIHierarchy pscodelistname(String pSCodeListName){
        this.setPSCodeListName(pSCodeListName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 实体
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
     * 设置 实体
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSSysBIHierarchy psdeid(String pSDEId){
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
    public PSSysBIHierarchy psdeid(PSDataEntity pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_PSDENAME = "psdename";

    /**
     * 设置 实体
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
     * 设置 实体
     * <P>
     * 等同 {@link #setPSDEName}
     * @param pSDEName
     */
    @JsonIgnore
    public PSSysBIHierarchy psdename(String pSDEName){
        this.setPSDEName(pSDEName);
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
    public PSSysBIHierarchy pssysbidimensionid(String pSSysBIDimensionId){
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
    public PSSysBIHierarchy pssysbidimensionid(PSSysBIDimension pSSysBIDimension){
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
    public PSSysBIHierarchy pssysbidimensionname(String pSSysBIDimensionName){
        this.setPSSysBIDimensionName(pSSysBIDimensionName);
        return this;
    }

    /**
     * <B>PSSYSBIHIERARCHYID</B>&nbsp;智能报表维度体系标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSBIHIERARCHYID = "pssysbihierarchyid";

    /**
     * 设置 智能报表维度体系标识
     * 
     * @param pSSysBIHierarchyId
     * 
     */
    @JsonProperty(FIELD_PSSYSBIHIERARCHYID)
    public void setPSSysBIHierarchyId(String pSSysBIHierarchyId){
        this.set(FIELD_PSSYSBIHIERARCHYID, pSSysBIHierarchyId);
    }
    
    /**
     * 获取 智能报表维度体系标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysBIHierarchyId(){
        Object objValue = this.get(FIELD_PSSYSBIHIERARCHYID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 智能报表维度体系标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBIHierarchyIdDirty(){
        if(this.contains(FIELD_PSSYSBIHIERARCHYID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 智能报表维度体系标识
     */
    @JsonIgnore
    public void resetPSSysBIHierarchyId(){
        this.reset(FIELD_PSSYSBIHIERARCHYID);
    }

    /**
     * 设置 智能报表维度体系标识
     * <P>
     * 等同 {@link #setPSSysBIHierarchyId}
     * @param pSSysBIHierarchyId
     */
    @JsonIgnore
    public PSSysBIHierarchy pssysbihierarchyid(String pSSysBIHierarchyId){
        this.setPSSysBIHierarchyId(pSSysBIHierarchyId);
        return this;
    }

    /**
     * <B>PSSYSBIHIERARCHYNAME</B>&nbsp;维度体系名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSBIHIERARCHYNAME = "pssysbihierarchyname";

    /**
     * 设置 维度体系名称
     * 
     * @param pSSysBIHierarchyName
     * 
     */
    @JsonProperty(FIELD_PSSYSBIHIERARCHYNAME)
    public void setPSSysBIHierarchyName(String pSSysBIHierarchyName){
        this.set(FIELD_PSSYSBIHIERARCHYNAME, pSSysBIHierarchyName);
    }
    
    /**
     * 获取 维度体系名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysBIHierarchyName(){
        Object objValue = this.get(FIELD_PSSYSBIHIERARCHYNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 维度体系名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBIHierarchyNameDirty(){
        if(this.contains(FIELD_PSSYSBIHIERARCHYNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 维度体系名称
     */
    @JsonIgnore
    public void resetPSSysBIHierarchyName(){
        this.reset(FIELD_PSSYSBIHIERARCHYNAME);
    }

    /**
     * 设置 维度体系名称
     * <P>
     * 等同 {@link #setPSSysBIHierarchyName}
     * @param pSSysBIHierarchyName
     */
    @JsonIgnore
    public PSSysBIHierarchy pssysbihierarchyname(String pSSysBIHierarchyName){
        this.setPSSysBIHierarchyName(pSSysBIHierarchyName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysBIHierarchyName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysBIHierarchyName(strName);
    }

    @JsonIgnore
    public PSSysBIHierarchy name(String strName){
        this.setPSSysBIHierarchyName(strName);
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
    public PSSysBIHierarchy updatedate(String updateDate){
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
    public PSSysBIHierarchy updateman(String updateMan){
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
    public PSSysBIHierarchy usercat(String userCat){
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
    public PSSysBIHierarchy usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysBIHierarchy usertag(String userTag){
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
    public PSSysBIHierarchy usertag2(String userTag2){
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
    public PSSysBIHierarchy usertag3(String userTag3){
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
    public PSSysBIHierarchy usertag4(String userTag4){
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
    public PSSysBIHierarchy validflag(Integer validFlag){
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
    public PSSysBIHierarchy validflag(Boolean validFlag){
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
        return this.getPSSysBIHierarchyId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysBIHierarchyId(strValue);
    }

    @JsonIgnore
    public PSSysBIHierarchy id(String strValue){
        this.setPSSysBIHierarchyId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysBIHierarchy){
            PSSysBIHierarchy model = (PSSysBIHierarchy)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
