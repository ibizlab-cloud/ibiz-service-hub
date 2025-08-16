package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEDQJOIN</B>实体数据查询连接 模型传输对象
 * <P>
 * 实体查询连接模型定义数据查询的连接，支持多种连接方式
 */
public class PSDEDQJoin extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEDQJoin(){
    }      

    /**
     * <B>ALIASNAME</B>&nbsp;别名，指定查询连接的别名，当前版本引擎不支持
     * <P>
     * 字符串：最大长度 20，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_ALIASNAME = "aliasname";

    /**
     * 设置 别名，详细说明：{@link #FIELD_ALIASNAME}
     * 
     * @param aliasName
     * 
     */
    @JsonProperty(FIELD_ALIASNAME)
    public void setAliasName(String aliasName){
        this.set(FIELD_ALIASNAME, aliasName);
    }
    
    /**
     * 获取 别名  
     * @return
     */
    @JsonIgnore
    public String getAliasName(){
        Object objValue = this.get(FIELD_ALIASNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 别名 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAliasNameDirty(){
        if(this.contains(FIELD_ALIASNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 别名
     */
    @JsonIgnore
    public void resetAliasName(){
        this.reset(FIELD_ALIASNAME);
    }

    /**
     * 设置 别名，详细说明：{@link #FIELD_ALIASNAME}
     * <P>
     * 等同 {@link #setAliasName}
     * @param aliasName
     */
    @JsonIgnore
    public PSDEDQJoin aliasname(String aliasName){
        this.setAliasName(aliasName);
        return this;
    }

    /**
     * <B>CONDFLAG</B>&nbsp;是否有条件
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_CONDFLAG = "condflag";

    /**
     * 设置 是否有条件
     * 
     * @param condFlag
     * 
     */
    @JsonProperty(FIELD_CONDFLAG)
    public void setCondFlag(Integer condFlag){
        this.set(FIELD_CONDFLAG, condFlag);
    }
    
    /**
     * 获取 是否有条件  
     * @return
     */
    @JsonIgnore
    public Integer getCondFlag(){
        Object objValue = this.get(FIELD_CONDFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 是否有条件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCondFlagDirty(){
        if(this.contains(FIELD_CONDFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 是否有条件
     */
    @JsonIgnore
    public void resetCondFlag(){
        this.reset(FIELD_CONDFLAG);
    }

    /**
     * 设置 是否有条件
     * <P>
     * 等同 {@link #setCondFlag}
     * @param condFlag
     */
    @JsonIgnore
    public PSDEDQJoin condflag(Integer condFlag){
        this.setCondFlag(condFlag);
        return this;
    }

     /**
     * 设置 是否有条件
     * <P>
     * 等同 {@link #setCondFlag}
     * @param condFlag
     */
    @JsonIgnore
    public PSDEDQJoin condflag(Boolean condFlag){
        if(condFlag == null){
            this.setCondFlag(null);
        }
        else{
            this.setCondFlag(condFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
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
    public PSDEDQJoin createdate(String createDate){
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
    public PSDEDQJoin createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>EXTCOLUMNS</B>&nbsp;选择列
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_EXTCOLUMNS = "extcolumns";

    /**
     * 设置 选择列
     * 
     * @param extColumns
     * 
     */
    @JsonProperty(FIELD_EXTCOLUMNS)
    public void setExtColumns(String extColumns){
        this.set(FIELD_EXTCOLUMNS, extColumns);
    }
    
    /**
     * 获取 选择列  
     * @return
     */
    @JsonIgnore
    public String getExtColumns(){
        Object objValue = this.get(FIELD_EXTCOLUMNS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 选择列 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExtColumnsDirty(){
        if(this.contains(FIELD_EXTCOLUMNS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 选择列
     */
    @JsonIgnore
    public void resetExtColumns(){
        this.reset(FIELD_EXTCOLUMNS);
    }

    /**
     * 设置 选择列
     * <P>
     * 等同 {@link #setExtColumns}
     * @param extColumns
     */
    @JsonIgnore
    public PSDEDQJoin extcolumns(String extColumns){
        this.setExtColumns(extColumns);
        return this;
    }

    /**
     * <B>JOINPSDEID</B>&nbsp;连接实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_JOINPSDEID = "joinpsdeid";

    /**
     * 设置 连接实体
     * 
     * @param joinPSDEId
     * 
     */
    @JsonProperty(FIELD_JOINPSDEID)
    public void setJoinPSDEId(String joinPSDEId){
        this.set(FIELD_JOINPSDEID, joinPSDEId);
    }
    
    /**
     * 获取 连接实体  
     * @return
     */
    @JsonIgnore
    public String getJoinPSDEId(){
        Object objValue = this.get(FIELD_JOINPSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 连接实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isJoinPSDEIdDirty(){
        if(this.contains(FIELD_JOINPSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 连接实体
     */
    @JsonIgnore
    public void resetJoinPSDEId(){
        this.reset(FIELD_JOINPSDEID);
    }

    /**
     * 设置 连接实体
     * <P>
     * 等同 {@link #setJoinPSDEId}
     * @param joinPSDEId
     */
    @JsonIgnore
    public PSDEDQJoin joinpsdeid(String joinPSDEId){
        this.setJoinPSDEId(joinPSDEId);
        return this;
    }

    /**
     * 设置 连接实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setJoinPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDEDQJoin joinpsdeid(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setJoinPSDEId(null);
            this.setJoinPSDEName(null);
        }
        else{
            this.setJoinPSDEId(pSDataEntity.getPSDataEntityId());
            this.setJoinPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>JOINPSDENAME</B>&nbsp;连接实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_JOINPSDEID}
     */
    public final static String FIELD_JOINPSDENAME = "joinpsdename";

    /**
     * 设置 连接实体
     * 
     * @param joinPSDEName
     * 
     */
    @JsonProperty(FIELD_JOINPSDENAME)
    public void setJoinPSDEName(String joinPSDEName){
        this.set(FIELD_JOINPSDENAME, joinPSDEName);
    }
    
    /**
     * 获取 连接实体  
     * @return
     */
    @JsonIgnore
    public String getJoinPSDEName(){
        Object objValue = this.get(FIELD_JOINPSDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 连接实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isJoinPSDENameDirty(){
        if(this.contains(FIELD_JOINPSDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 连接实体
     */
    @JsonIgnore
    public void resetJoinPSDEName(){
        this.reset(FIELD_JOINPSDENAME);
    }

    /**
     * 设置 连接实体
     * <P>
     * 等同 {@link #setJoinPSDEName}
     * @param joinPSDEName
     */
    @JsonIgnore
    public PSDEDQJoin joinpsdename(String joinPSDEName){
        this.setJoinPSDEName(joinPSDEName);
        return this;
    }

    /**
     * <B>JOINTAG</B>&nbsp;连接标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_JOINTAG = "jointag";

    /**
     * 设置 连接标记
     * 
     * @param joinTag
     * 
     */
    @JsonProperty(FIELD_JOINTAG)
    public void setJoinTag(String joinTag){
        this.set(FIELD_JOINTAG, joinTag);
    }
    
    /**
     * 获取 连接标记  
     * @return
     */
    @JsonIgnore
    public String getJoinTag(){
        Object objValue = this.get(FIELD_JOINTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 连接标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isJoinTagDirty(){
        if(this.contains(FIELD_JOINTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 连接标记
     */
    @JsonIgnore
    public void resetJoinTag(){
        this.reset(FIELD_JOINTAG);
    }

    /**
     * 设置 连接标记
     * <P>
     * 等同 {@link #setJoinTag}
     * @param joinTag
     */
    @JsonIgnore
    public PSDEDQJoin jointag(String joinTag){
        this.setJoinTag(joinTag);
        return this;
    }

    /**
     * <B>JOINTAG2</B>&nbsp;连接标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_JOINTAG2 = "jointag2";

    /**
     * 设置 连接标记2
     * 
     * @param joinTag2
     * 
     */
    @JsonProperty(FIELD_JOINTAG2)
    public void setJoinTag2(String joinTag2){
        this.set(FIELD_JOINTAG2, joinTag2);
    }
    
    /**
     * 获取 连接标记2  
     * @return
     */
    @JsonIgnore
    public String getJoinTag2(){
        Object objValue = this.get(FIELD_JOINTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 连接标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isJoinTag2Dirty(){
        if(this.contains(FIELD_JOINTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 连接标记2
     */
    @JsonIgnore
    public void resetJoinTag2(){
        this.reset(FIELD_JOINTAG2);
    }

    /**
     * 设置 连接标记2
     * <P>
     * 等同 {@link #setJoinTag2}
     * @param joinTag2
     */
    @JsonIgnore
    public PSDEDQJoin jointag2(String joinTag2){
        this.setJoinTag2(joinTag2);
        return this;
    }

    /**
     * <B>MAINFLAG</B>&nbsp;主连接，指定查询连接是否为主连接，每个数据查询都有一个默认的主查询连接
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_MAINFLAG = "mainflag";

    /**
     * 设置 主连接，详细说明：{@link #FIELD_MAINFLAG}
     * 
     * @param mainFlag
     * 
     */
    @JsonProperty(FIELD_MAINFLAG)
    public void setMainFlag(Integer mainFlag){
        this.set(FIELD_MAINFLAG, mainFlag);
    }
    
    /**
     * 获取 主连接  
     * @return
     */
    @JsonIgnore
    public Integer getMainFlag(){
        Object objValue = this.get(FIELD_MAINFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 主连接 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMainFlagDirty(){
        if(this.contains(FIELD_MAINFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主连接
     */
    @JsonIgnore
    public void resetMainFlag(){
        this.reset(FIELD_MAINFLAG);
    }

    /**
     * 设置 主连接，详细说明：{@link #FIELD_MAINFLAG}
     * <P>
     * 等同 {@link #setMainFlag}
     * @param mainFlag
     */
    @JsonIgnore
    public PSDEDQJoin mainflag(Integer mainFlag){
        this.setMainFlag(mainFlag);
        return this;
    }

     /**
     * 设置 主连接，详细说明：{@link #FIELD_MAINFLAG}
     * <P>
     * 等同 {@link #setMainFlag}
     * @param mainFlag
     */
    @JsonIgnore
    public PSDEDQJoin mainflag(Boolean mainFlag){
        if(mainFlag == null){
            this.setMainFlag(null);
        }
        else{
            this.setMainFlag(mainFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSDEDQJoin memo(String memo){
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
    public PSDEDQJoin ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PJOINPSDEID</B>&nbsp;父连接实体标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PPSDEDQJOINID}
     */
    public final static String FIELD_PJOINPSDEID = "pjoinpsdeid";

    /**
     * 设置 父连接实体标识
     * 
     * @param pJoinPSDEId
     * 
     */
    @JsonProperty(FIELD_PJOINPSDEID)
    public void setPJoinPSDEId(String pJoinPSDEId){
        this.set(FIELD_PJOINPSDEID, pJoinPSDEId);
    }
    
    /**
     * 获取 父连接实体标识  
     * @return
     */
    @JsonIgnore
    public String getPJoinPSDEId(){
        Object objValue = this.get(FIELD_PJOINPSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父连接实体标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPJoinPSDEIdDirty(){
        if(this.contains(FIELD_PJOINPSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父连接实体标识
     */
    @JsonIgnore
    public void resetPJoinPSDEId(){
        this.reset(FIELD_PJOINPSDEID);
    }

    /**
     * 设置 父连接实体标识
     * <P>
     * 等同 {@link #setPJoinPSDEId}
     * @param pJoinPSDEId
     */
    @JsonIgnore
    public PSDEDQJoin pjoinpsdeid(String pJoinPSDEId){
        this.setPJoinPSDEId(pJoinPSDEId);
        return this;
    }

    /**
     * <B>PPSDEDQJOINID</B>&nbsp;父数据查询连接
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDQJoin} 
     */
    public final static String FIELD_PPSDEDQJOINID = "ppsdedqjoinid";

    /**
     * 设置 父数据查询连接
     * 
     * @param pPSDEDQJoinId
     * 
     */
    @JsonProperty(FIELD_PPSDEDQJOINID)
    public void setPPSDEDQJoinId(String pPSDEDQJoinId){
        this.set(FIELD_PPSDEDQJOINID, pPSDEDQJoinId);
    }
    
    /**
     * 获取 父数据查询连接  
     * @return
     */
    @JsonIgnore
    public String getPPSDEDQJoinId(){
        Object objValue = this.get(FIELD_PPSDEDQJOINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父数据查询连接 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSDEDQJoinIdDirty(){
        if(this.contains(FIELD_PPSDEDQJOINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父数据查询连接
     */
    @JsonIgnore
    public void resetPPSDEDQJoinId(){
        this.reset(FIELD_PPSDEDQJOINID);
    }

    /**
     * 设置 父数据查询连接
     * <P>
     * 等同 {@link #setPPSDEDQJoinId}
     * @param pPSDEDQJoinId
     */
    @JsonIgnore
    public PSDEDQJoin ppsdedqjoinid(String pPSDEDQJoinId){
        this.setPPSDEDQJoinId(pPSDEDQJoinId);
        return this;
    }

    /**
     * 设置 父数据查询连接，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPPSDEDQJoinId}
     * @param pSDEDQJoin 引用对象
     */
    @JsonIgnore
    public PSDEDQJoin ppsdedqjoinid(PSDEDQJoin pSDEDQJoin){
        if(pSDEDQJoin == null){
            this.setPJoinPSDEId(null);
            this.setPPSDEDQJoinId(null);
            this.setPPSDEDQJoinName(null);
        }
        else{
            this.setPJoinPSDEId(pSDEDQJoin.getJoinPSDEId());
            this.setPPSDEDQJoinId(pSDEDQJoin.getPSDEDQJoinId());
            this.setPPSDEDQJoinName(pSDEDQJoin.getPSDEDQJoinName());
        }
        return this;
    }

    /**
     * <B>PPSDEDQJOINNAME</B>&nbsp;父数据查询连接
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PPSDEDQJOINID}
     */
    public final static String FIELD_PPSDEDQJOINNAME = "ppsdedqjoinname";

    /**
     * 设置 父数据查询连接
     * 
     * @param pPSDEDQJoinName
     * 
     */
    @JsonProperty(FIELD_PPSDEDQJOINNAME)
    public void setPPSDEDQJoinName(String pPSDEDQJoinName){
        this.set(FIELD_PPSDEDQJOINNAME, pPSDEDQJoinName);
    }
    
    /**
     * 获取 父数据查询连接  
     * @return
     */
    @JsonIgnore
    public String getPPSDEDQJoinName(){
        Object objValue = this.get(FIELD_PPSDEDQJOINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父数据查询连接 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSDEDQJoinNameDirty(){
        if(this.contains(FIELD_PPSDEDQJOINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父数据查询连接
     */
    @JsonIgnore
    public void resetPPSDEDQJoinName(){
        this.reset(FIELD_PPSDEDQJOINNAME);
    }

    /**
     * 设置 父数据查询连接
     * <P>
     * 等同 {@link #setPPSDEDQJoinName}
     * @param pPSDEDQJoinName
     */
    @JsonIgnore
    public PSDEDQJoin ppsdedqjoinname(String pPSDEDQJoinName){
        this.setPPSDEDQJoinName(pPSDEDQJoinName);
        return this;
    }

    /**
     * <B>PSDEDQID</B>&nbsp;实体数据查询
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataQuery} 
     */
    public final static String FIELD_PSDEDQID = "psdedqid";

    /**
     * 设置 实体数据查询
     * 
     * @param pSDEDQId
     * 
     */
    @JsonProperty(FIELD_PSDEDQID)
    public void setPSDEDQId(String pSDEDQId){
        this.set(FIELD_PSDEDQID, pSDEDQId);
    }
    
    /**
     * 获取 实体数据查询  
     * @return
     */
    @JsonIgnore
    public String getPSDEDQId(){
        Object objValue = this.get(FIELD_PSDEDQID);
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
    public boolean isPSDEDQIdDirty(){
        if(this.contains(FIELD_PSDEDQID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据查询
     */
    @JsonIgnore
    public void resetPSDEDQId(){
        this.reset(FIELD_PSDEDQID);
    }

    /**
     * 设置 实体数据查询
     * <P>
     * 等同 {@link #setPSDEDQId}
     * @param pSDEDQId
     */
    @JsonIgnore
    public PSDEDQJoin psdedqid(String pSDEDQId){
        this.setPSDEDQId(pSDEDQId);
        return this;
    }

    /**
     * 设置 实体数据查询，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDQId}
     * @param pSDEDataQuery 引用对象
     */
    @JsonIgnore
    public PSDEDQJoin psdedqid(PSDEDataQuery pSDEDataQuery){
        if(pSDEDataQuery == null){
            this.setPSDEDQId(null);
            this.setPSDEDQName(null);
        }
        else{
            this.setPSDEDQId(pSDEDataQuery.getPSDEDataQueryId());
            this.setPSDEDQName(pSDEDataQuery.getPSDEDataQueryName());
        }
        return this;
    }

    /**
     * <B>PSDEDQJOINID</B>&nbsp;实体数据查询连接标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEDQJOINID = "psdedqjoinid";

    /**
     * 设置 实体数据查询连接标识
     * 
     * @param pSDEDQJoinId
     * 
     */
    @JsonProperty(FIELD_PSDEDQJOINID)
    public void setPSDEDQJoinId(String pSDEDQJoinId){
        this.set(FIELD_PSDEDQJOINID, pSDEDQJoinId);
    }
    
    /**
     * 获取 实体数据查询连接标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEDQJoinId(){
        Object objValue = this.get(FIELD_PSDEDQJOINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据查询连接标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDQJoinIdDirty(){
        if(this.contains(FIELD_PSDEDQJOINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据查询连接标识
     */
    @JsonIgnore
    public void resetPSDEDQJoinId(){
        this.reset(FIELD_PSDEDQJOINID);
    }

    /**
     * 设置 实体数据查询连接标识
     * <P>
     * 等同 {@link #setPSDEDQJoinId}
     * @param pSDEDQJoinId
     */
    @JsonIgnore
    public PSDEDQJoin psdedqjoinid(String pSDEDQJoinId){
        this.setPSDEDQJoinId(pSDEDQJoinId);
        return this;
    }

    /**
     * <B>PSDEDQJOINNAME</B>&nbsp;连接信息
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEDQJOINNAME = "psdedqjoinname";

    /**
     * 设置 连接信息
     * 
     * @param pSDEDQJoinName
     * 
     */
    @JsonProperty(FIELD_PSDEDQJOINNAME)
    public void setPSDEDQJoinName(String pSDEDQJoinName){
        this.set(FIELD_PSDEDQJOINNAME, pSDEDQJoinName);
    }
    
    /**
     * 获取 连接信息  
     * @return
     */
    @JsonIgnore
    public String getPSDEDQJoinName(){
        Object objValue = this.get(FIELD_PSDEDQJOINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 连接信息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDQJoinNameDirty(){
        if(this.contains(FIELD_PSDEDQJOINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 连接信息
     */
    @JsonIgnore
    public void resetPSDEDQJoinName(){
        this.reset(FIELD_PSDEDQJOINNAME);
    }

    /**
     * 设置 连接信息
     * <P>
     * 等同 {@link #setPSDEDQJoinName}
     * @param pSDEDQJoinName
     */
    @JsonIgnore
    public PSDEDQJoin psdedqjoinname(String pSDEDQJoinName){
        this.setPSDEDQJoinName(pSDEDQJoinName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEDQJoinName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEDQJoinName(strName);
    }

    @JsonIgnore
    public PSDEDQJoin name(String strName){
        this.setPSDEDQJoinName(strName);
        return this;
    }

    /**
     * <B>PSDEDQNAME</B>&nbsp;实体数据查询
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDQID}
     */
    public final static String FIELD_PSDEDQNAME = "psdedqname";

    /**
     * 设置 实体数据查询
     * 
     * @param pSDEDQName
     * 
     */
    @JsonProperty(FIELD_PSDEDQNAME)
    public void setPSDEDQName(String pSDEDQName){
        this.set(FIELD_PSDEDQNAME, pSDEDQName);
    }
    
    /**
     * 获取 实体数据查询  
     * @return
     */
    @JsonIgnore
    public String getPSDEDQName(){
        Object objValue = this.get(FIELD_PSDEDQNAME);
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
    public boolean isPSDEDQNameDirty(){
        if(this.contains(FIELD_PSDEDQNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据查询
     */
    @JsonIgnore
    public void resetPSDEDQName(){
        this.reset(FIELD_PSDEDQNAME);
    }

    /**
     * 设置 实体数据查询
     * <P>
     * 等同 {@link #setPSDEDQName}
     * @param pSDEDQName
     */
    @JsonIgnore
    public PSDEDQJoin psdedqname(String pSDEDQName){
        this.setPSDEDQName(pSDEDQName);
        return this;
    }

    /**
     * <B>PSDEJOINTYPEID</B>&nbsp;连接方式，直接查询连接的连接方式
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEJoinType} 
     */
    public final static String FIELD_PSDEJOINTYPEID = "psdejointypeid";

    /**
     * 设置 连接方式，详细说明：{@link #FIELD_PSDEJOINTYPEID}
     * 
     * @param pSDEJoinTypeId
     * 
     */
    @JsonProperty(FIELD_PSDEJOINTYPEID)
    public void setPSDEJoinTypeId(String pSDEJoinTypeId){
        this.set(FIELD_PSDEJOINTYPEID, pSDEJoinTypeId);
    }
    
    /**
     * 获取 连接方式  
     * @return
     */
    @JsonIgnore
    public String getPSDEJoinTypeId(){
        Object objValue = this.get(FIELD_PSDEJOINTYPEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 连接方式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEJoinTypeIdDirty(){
        if(this.contains(FIELD_PSDEJOINTYPEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 连接方式
     */
    @JsonIgnore
    public void resetPSDEJoinTypeId(){
        this.reset(FIELD_PSDEJOINTYPEID);
    }

    /**
     * 设置 连接方式，详细说明：{@link #FIELD_PSDEJOINTYPEID}
     * <P>
     * 等同 {@link #setPSDEJoinTypeId}
     * @param pSDEJoinTypeId
     */
    @JsonIgnore
    public PSDEDQJoin psdejointypeid(String pSDEJoinTypeId){
        this.setPSDEJoinTypeId(pSDEJoinTypeId);
        return this;
    }

    /**
     * 设置 连接方式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEJoinTypeId}
     * @param pSDEJoinType 引用对象
     */
    @JsonIgnore
    public PSDEDQJoin psdejointypeid(PSDEJoinType pSDEJoinType){
        if(pSDEJoinType == null){
            this.setPSDEJoinTypeId(null);
            this.setPSDEJoinTypeName(null);
        }
        else{
            this.setPSDEJoinTypeId(pSDEJoinType.getPSDEJoinTypeId());
            this.setPSDEJoinTypeName(pSDEJoinType.getPSDEJoinTypeName());
        }
        return this;
    }

    /**
     * <B>PSDEJOINTYPENAME</B>&nbsp;连接方式，直接查询连接的连接方式
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEJOINTYPEID}
     */
    public final static String FIELD_PSDEJOINTYPENAME = "psdejointypename";

    /**
     * 设置 连接方式，详细说明：{@link #FIELD_PSDEJOINTYPENAME}
     * 
     * @param pSDEJoinTypeName
     * 
     */
    @JsonProperty(FIELD_PSDEJOINTYPENAME)
    public void setPSDEJoinTypeName(String pSDEJoinTypeName){
        this.set(FIELD_PSDEJOINTYPENAME, pSDEJoinTypeName);
    }
    
    /**
     * 获取 连接方式  
     * @return
     */
    @JsonIgnore
    public String getPSDEJoinTypeName(){
        Object objValue = this.get(FIELD_PSDEJOINTYPENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 连接方式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEJoinTypeNameDirty(){
        if(this.contains(FIELD_PSDEJOINTYPENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 连接方式
     */
    @JsonIgnore
    public void resetPSDEJoinTypeName(){
        this.reset(FIELD_PSDEJOINTYPENAME);
    }

    /**
     * 设置 连接方式，详细说明：{@link #FIELD_PSDEJOINTYPENAME}
     * <P>
     * 等同 {@link #setPSDEJoinTypeName}
     * @param pSDEJoinTypeName
     */
    @JsonIgnore
    public PSDEDQJoin psdejointypename(String pSDEJoinTypeName){
        this.setPSDEJoinTypeName(pSDEJoinTypeName);
        return this;
    }

    /**
     * <B>PSDERID</B>&nbsp;实体关系，指定查询连接的连接关系
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDER} 
     */
    public final static String FIELD_PSDERID = "psderid";

    /**
     * 设置 实体关系，详细说明：{@link #FIELD_PSDERID}
     * 
     * @param pSDERId
     * 
     */
    @JsonProperty(FIELD_PSDERID)
    public void setPSDERId(String pSDERId){
        this.set(FIELD_PSDERID, pSDERId);
    }
    
    /**
     * 获取 实体关系  
     * @return
     */
    @JsonIgnore
    public String getPSDERId(){
        Object objValue = this.get(FIELD_PSDERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDERIdDirty(){
        if(this.contains(FIELD_PSDERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体关系
     */
    @JsonIgnore
    public void resetPSDERId(){
        this.reset(FIELD_PSDERID);
    }

    /**
     * 设置 实体关系，详细说明：{@link #FIELD_PSDERID}
     * <P>
     * 等同 {@link #setPSDERId}
     * @param pSDERId
     */
    @JsonIgnore
    public PSDEDQJoin psderid(String pSDERId){
        this.setPSDERId(pSDERId);
        return this;
    }

    /**
     * 设置 实体关系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDERId}
     * @param pSDER 引用对象
     */
    @JsonIgnore
    public PSDEDQJoin psderid(PSDER pSDER){
        if(pSDER == null){
            this.setPSDERId(null);
            this.setPSDERName(null);
        }
        else{
            this.setPSDERId(pSDER.getPSDERId());
            this.setPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    /**
     * <B>PSDERNAME</B>&nbsp;实体关系，指定查询连接的连接关系
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDERID}
     */
    public final static String FIELD_PSDERNAME = "psdername";

    /**
     * 设置 实体关系，详细说明：{@link #FIELD_PSDERNAME}
     * 
     * @param pSDERName
     * 
     */
    @JsonProperty(FIELD_PSDERNAME)
    public void setPSDERName(String pSDERName){
        this.set(FIELD_PSDERNAME, pSDERName);
    }
    
    /**
     * 获取 实体关系  
     * @return
     */
    @JsonIgnore
    public String getPSDERName(){
        Object objValue = this.get(FIELD_PSDERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDERNameDirty(){
        if(this.contains(FIELD_PSDERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体关系
     */
    @JsonIgnore
    public void resetPSDERName(){
        this.reset(FIELD_PSDERNAME);
    }

    /**
     * 设置 实体关系，详细说明：{@link #FIELD_PSDERNAME}
     * <P>
     * 等同 {@link #setPSDERName}
     * @param pSDERName
     */
    @JsonIgnore
    public PSDEDQJoin psdername(String pSDERName){
        this.setPSDERName(pSDERName);
        return this;
    }

    /**
     * <B>QUERYVIEWFLAG</B>&nbsp;从视图查询，指定查询连接直接使用连接实体的视图，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_QUERYVIEWFLAG = "queryviewflag";

    /**
     * 设置 从视图查询，详细说明：{@link #FIELD_QUERYVIEWFLAG}
     * 
     * @param queryViewFlag
     * 
     */
    @JsonProperty(FIELD_QUERYVIEWFLAG)
    public void setQueryViewFlag(Integer queryViewFlag){
        this.set(FIELD_QUERYVIEWFLAG, queryViewFlag);
    }
    
    /**
     * 获取 从视图查询  
     * @return
     */
    @JsonIgnore
    public Integer getQueryViewFlag(){
        Object objValue = this.get(FIELD_QUERYVIEWFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 从视图查询 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isQueryViewFlagDirty(){
        if(this.contains(FIELD_QUERYVIEWFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 从视图查询
     */
    @JsonIgnore
    public void resetQueryViewFlag(){
        this.reset(FIELD_QUERYVIEWFLAG);
    }

    /**
     * 设置 从视图查询，详细说明：{@link #FIELD_QUERYVIEWFLAG}
     * <P>
     * 等同 {@link #setQueryViewFlag}
     * @param queryViewFlag
     */
    @JsonIgnore
    public PSDEDQJoin queryviewflag(Integer queryViewFlag){
        this.setQueryViewFlag(queryViewFlag);
        return this;
    }

     /**
     * 设置 从视图查询，详细说明：{@link #FIELD_QUERYVIEWFLAG}
     * <P>
     * 等同 {@link #setQueryViewFlag}
     * @param queryViewFlag
     */
    @JsonIgnore
    public PSDEDQJoin queryviewflag(Boolean queryViewFlag){
        if(queryViewFlag == null){
            this.setQueryViewFlag(null);
        }
        else{
            this.setQueryViewFlag(queryViewFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSDEDQJoin updatedate(String updateDate){
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
    public PSDEDQJoin updateman(String updateMan){
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
    public PSDEDQJoin usercat(String userCat){
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
    public PSDEDQJoin usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDEDQJoin usertag(String userTag){
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
    public PSDEDQJoin usertag2(String userTag2){
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
    public PSDEDQJoin usertag3(String userTag3){
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
    public PSDEDQJoin usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEDQJoinId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEDQJoinId(strValue);
    }

    @JsonIgnore
    public PSDEDQJoin id(String strValue){
        this.setPSDEDQJoinId(strValue);
        return this;
    }


    /**
     *  实体数据查询连接 成员集合
     */
    public final static String FIELD_PSDEDQJOINS = "psdedqjoins";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSDEDQJoin> psdedqjoins;

    /**
     * 获取 实体数据查询连接 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEDQJOINS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEDQJoin> getPSDEDQJoins(){
        return this.psdedqjoins;
    }

    /**
     * 设置 实体数据查询连接 成员集合  
     * @param psdedqjoins
     */
    @JsonProperty(FIELD_PSDEDQJOINS)
    public void setPSDEDQJoins(java.util.List<net.ibizsys.psmodel.core.domain.PSDEDQJoin> psdedqjoins){
        this.psdedqjoins = psdedqjoins;
    }

    /**
     * 获取 实体数据查询连接 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEDQJoin> getPSDEDQJoinsIf(){
        if(this.psdedqjoins == null){
            this.psdedqjoins = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSDEDQJoin>();          
        }
        return this.psdedqjoins;
    }


    /**
     *  实体数据查询条件 成员集合
     */
    public final static String FIELD_PSDEDQCONDS = "psdedqconds";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSDEDQCond> psdedqconds;

    /**
     * 获取 实体数据查询条件 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEDQCONDS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEDQCond> getPSDEDQConds(){
        return this.psdedqconds;
    }

    /**
     * 设置 实体数据查询条件 成员集合  
     * @param psdedqconds
     */
    @JsonProperty(FIELD_PSDEDQCONDS)
    public void setPSDEDQConds(java.util.List<net.ibizsys.psmodel.core.domain.PSDEDQCond> psdedqconds){
        this.psdedqconds = psdedqconds;
    }

    /**
     * 获取 实体数据查询条件 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEDQCond> getPSDEDQCondsIf(){
        if(this.psdedqconds == null){
            this.psdedqconds = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSDEDQCond>();          
        }
        return this.psdedqconds;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEDQJoin){
            PSDEDQJoin model = (PSDEDQJoin)iPSModel;
            model.setPSDEDQJoins(this.getPSDEDQJoins());
            model.setPSDEDQConds(this.getPSDEDQConds());
        }
        super.copyTo(iPSModel);
    }
}
