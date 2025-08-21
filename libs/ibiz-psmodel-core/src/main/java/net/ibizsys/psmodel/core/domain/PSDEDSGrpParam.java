package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEDSGRPPARAM</B>实体数据集分组参数 模型传输对象
 * <P>
 * 实体数据集合启用分组（GROUP）是配套的分组模型，定义数据分组及聚合操作逻辑等
 */
public class PSDEDSGrpParam extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEDSGrpParam(){
    }      

    /**
     * <B>AGGMODE</B>&nbsp;聚合操作
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.AggMode} 
     */
    public final static String FIELD_AGGMODE = "aggmode";

    /**
     * 设置 聚合操作
     * 
     * @param aggMode
     * 
     */
    @JsonProperty(FIELD_AGGMODE)
    public void setAggMode(String aggMode){
        this.set(FIELD_AGGMODE, aggMode);
    }
    
    /**
     * 获取 聚合操作  
     * @return
     */
    @JsonIgnore
    public String getAggMode(){
        Object objValue = this.get(FIELD_AGGMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 聚合操作 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAggModeDirty(){
        if(this.contains(FIELD_AGGMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 聚合操作
     */
    @JsonIgnore
    public void resetAggMode(){
        this.reset(FIELD_AGGMODE);
    }

    /**
     * 设置 聚合操作
     * <P>
     * 等同 {@link #setAggMode}
     * @param aggMode
     */
    @JsonIgnore
    public PSDEDSGrpParam aggmode(String aggMode){
        this.setAggMode(aggMode);
        return this;
    }

     /**
     * 设置 聚合操作
     * <P>
     * 等同 {@link #setAggMode}
     * @param aggMode
     */
    @JsonIgnore
    public PSDEDSGrpParam aggmode(net.ibizsys.psmodel.core.util.PSModelEnums.AggMode aggMode){
        if(aggMode == null){
            this.setAggMode(null);
        }
        else{
            this.setAggMode(aggMode.value);
        }
        return this;
    }

    /**
     * <B>ALIASNAME</B>&nbsp;别名
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_ALIASNAME = "aliasname";

    /**
     * 设置 别名
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
     * 设置 别名
     * <P>
     * 等同 {@link #setAliasName}
     * @param aliasName
     */
    @JsonIgnore
    public PSDEDSGrpParam aliasname(String aliasName){
        this.setAliasName(aliasName);
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
    public PSDEDSGrpParam createdate(String createDate){
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
    public PSDEDSGrpParam createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CUSTOMDEFNAME</B>&nbsp;自定义属性，指定分组参数的自定义属性，在无法从实体中选择合适的属性或需要定义多个属性（使用【;】分隔）时使用，引擎计算分组属性时优先使用此配置
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_CUSTOMDEFNAME = "customdefname";

    /**
     * 设置 自定义属性，详细说明：{@link #FIELD_CUSTOMDEFNAME}
     * 
     * @param customDEFName
     * 
     */
    @JsonProperty(FIELD_CUSTOMDEFNAME)
    public void setCustomDEFName(String customDEFName){
        this.set(FIELD_CUSTOMDEFNAME, customDEFName);
    }
    
    /**
     * 获取 自定义属性  
     * @return
     */
    @JsonIgnore
    public String getCustomDEFName(){
        Object objValue = this.get(FIELD_CUSTOMDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomDEFNameDirty(){
        if(this.contains(FIELD_CUSTOMDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义属性
     */
    @JsonIgnore
    public void resetCustomDEFName(){
        this.reset(FIELD_CUSTOMDEFNAME);
    }

    /**
     * 设置 自定义属性，详细说明：{@link #FIELD_CUSTOMDEFNAME}
     * <P>
     * 等同 {@link #setCustomDEFName}
     * @param customDEFName
     */
    @JsonIgnore
    public PSDEDSGrpParam customdefname(String customDEFName){
        this.setCustomDEFName(customDEFName);
        return this;
    }

    /**
     * <B>GROUPCODE</B>&nbsp;直接代码
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_GROUPCODE = "groupcode";

    /**
     * 设置 直接代码
     * 
     * @param groupCode
     * 
     */
    @JsonProperty(FIELD_GROUPCODE)
    public void setGroupCode(String groupCode){
        this.set(FIELD_GROUPCODE, groupCode);
    }
    
    /**
     * 获取 直接代码  
     * @return
     */
    @JsonIgnore
    public String getGroupCode(){
        Object objValue = this.get(FIELD_GROUPCODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 直接代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupCodeDirty(){
        if(this.contains(FIELD_GROUPCODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 直接代码
     */
    @JsonIgnore
    public void resetGroupCode(){
        this.reset(FIELD_GROUPCODE);
    }

    /**
     * 设置 直接代码
     * <P>
     * 等同 {@link #setGroupCode}
     * @param groupCode
     */
    @JsonIgnore
    public PSDEDSGrpParam groupcode(String groupCode){
        this.setGroupCode(groupCode);
        return this;
    }

    /**
     * <B>GROUPFLAG</B>&nbsp;是否分组，指定分组参数是否作为分组项，未指定为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_GROUPFLAG = "groupflag";

    /**
     * 设置 是否分组，详细说明：{@link #FIELD_GROUPFLAG}
     * 
     * @param groupFlag
     * 
     */
    @JsonProperty(FIELD_GROUPFLAG)
    public void setGroupFlag(Integer groupFlag){
        this.set(FIELD_GROUPFLAG, groupFlag);
    }
    
    /**
     * 获取 是否分组  
     * @return
     */
    @JsonIgnore
    public Integer getGroupFlag(){
        Object objValue = this.get(FIELD_GROUPFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 是否分组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupFlagDirty(){
        if(this.contains(FIELD_GROUPFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 是否分组
     */
    @JsonIgnore
    public void resetGroupFlag(){
        this.reset(FIELD_GROUPFLAG);
    }

    /**
     * 设置 是否分组，详细说明：{@link #FIELD_GROUPFLAG}
     * <P>
     * 等同 {@link #setGroupFlag}
     * @param groupFlag
     */
    @JsonIgnore
    public PSDEDSGrpParam groupflag(Integer groupFlag){
        this.setGroupFlag(groupFlag);
        return this;
    }

     /**
     * 设置 是否分组，详细说明：{@link #FIELD_GROUPFLAG}
     * <P>
     * 等同 {@link #setGroupFlag}
     * @param groupFlag
     */
    @JsonIgnore
    public PSDEDSGrpParam groupflag(Boolean groupFlag){
        if(groupFlag == null){
            this.setGroupFlag(null);
        }
        else{
            this.setGroupFlag(groupFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>GROUPJOINCODE</B>&nbsp;分组连接代码
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_GROUPJOINCODE = "groupjoincode";

    /**
     * 设置 分组连接代码
     * 
     * @param groupJoinCode
     * 
     */
    @JsonProperty(FIELD_GROUPJOINCODE)
    public void setGroupJoinCode(String groupJoinCode){
        this.set(FIELD_GROUPJOINCODE, groupJoinCode);
    }
    
    /**
     * 获取 分组连接代码  
     * @return
     */
    @JsonIgnore
    public String getGroupJoinCode(){
        Object objValue = this.get(FIELD_GROUPJOINCODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组连接代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupJoinCodeDirty(){
        if(this.contains(FIELD_GROUPJOINCODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组连接代码
     */
    @JsonIgnore
    public void resetGroupJoinCode(){
        this.reset(FIELD_GROUPJOINCODE);
    }

    /**
     * 设置 分组连接代码
     * <P>
     * 等同 {@link #setGroupJoinCode}
     * @param groupJoinCode
     */
    @JsonIgnore
    public PSDEDSGrpParam groupjoincode(String groupJoinCode){
        this.setGroupJoinCode(groupJoinCode);
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
    public PSDEDSGrpParam memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORDERDIR</B>&nbsp;排序方向，指定数据集分组项的排序方向
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SortDir} 
     */
    public final static String FIELD_ORDERDIR = "orderdir";

    /**
     * 设置 排序方向，详细说明：{@link #FIELD_ORDERDIR}
     * 
     * @param orderDir
     * 
     */
    @JsonProperty(FIELD_ORDERDIR)
    public void setOrderDir(String orderDir){
        this.set(FIELD_ORDERDIR, orderDir);
    }
    
    /**
     * 获取 排序方向  
     * @return
     */
    @JsonIgnore
    public String getOrderDir(){
        Object objValue = this.get(FIELD_ORDERDIR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 排序方向 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOrderDirDirty(){
        if(this.contains(FIELD_ORDERDIR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 排序方向
     */
    @JsonIgnore
    public void resetOrderDir(){
        this.reset(FIELD_ORDERDIR);
    }

    /**
     * 设置 排序方向，详细说明：{@link #FIELD_ORDERDIR}
     * <P>
     * 等同 {@link #setOrderDir}
     * @param orderDir
     */
    @JsonIgnore
    public PSDEDSGrpParam orderdir(String orderDir){
        this.setOrderDir(orderDir);
        return this;
    }

     /**
     * 设置 排序方向，详细说明：{@link #FIELD_ORDERDIR}
     * <P>
     * 等同 {@link #setOrderDir}
     * @param orderDir
     */
    @JsonIgnore
    public PSDEDSGrpParam orderdir(net.ibizsys.psmodel.core.util.PSModelEnums.SortDir orderDir){
        if(orderDir == null){
            this.setOrderDir(null);
        }
        else{
            this.setOrderDir(orderDir.value);
        }
        return this;
    }

    /**
     * <B>PSDEDSGRPPARAMID</B>&nbsp;实体数据集分组参数标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEDSGRPPARAMID = "psdedsgrpparamid";

    /**
     * 设置 实体数据集分组参数标识
     * 
     * @param pSDEDSGrpParamId
     * 
     */
    @JsonProperty(FIELD_PSDEDSGRPPARAMID)
    public void setPSDEDSGrpParamId(String pSDEDSGrpParamId){
        this.set(FIELD_PSDEDSGRPPARAMID, pSDEDSGrpParamId);
    }
    
    /**
     * 获取 实体数据集分组参数标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEDSGrpParamId(){
        Object objValue = this.get(FIELD_PSDEDSGRPPARAMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据集分组参数标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDSGrpParamIdDirty(){
        if(this.contains(FIELD_PSDEDSGRPPARAMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据集分组参数标识
     */
    @JsonIgnore
    public void resetPSDEDSGrpParamId(){
        this.reset(FIELD_PSDEDSGRPPARAMID);
    }

    /**
     * 设置 实体数据集分组参数标识
     * <P>
     * 等同 {@link #setPSDEDSGrpParamId}
     * @param pSDEDSGrpParamId
     */
    @JsonIgnore
    public PSDEDSGrpParam psdedsgrpparamid(String pSDEDSGrpParamId){
        this.setPSDEDSGrpParamId(pSDEDSGrpParamId);
        return this;
    }

    /**
     * <B>PSDEDSGRPPARAMNAME</B>&nbsp;参数标识，指定分组参数标识，需要在所在的数据集合中具有唯一性。在未指定分组属性的情况下，引擎会尝试使用该标识获取分组属性
     * <P>
     * 字符串：最大长度 200，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSDEDSGRPPARAMNAME = "psdedsgrpparamname";

    /**
     * 设置 参数标识，详细说明：{@link #FIELD_PSDEDSGRPPARAMNAME}
     * 
     * @param pSDEDSGrpParamName
     * 
     */
    @JsonProperty(FIELD_PSDEDSGRPPARAMNAME)
    public void setPSDEDSGrpParamName(String pSDEDSGrpParamName){
        this.set(FIELD_PSDEDSGRPPARAMNAME, pSDEDSGrpParamName);
    }
    
    /**
     * 获取 参数标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEDSGrpParamName(){
        Object objValue = this.get(FIELD_PSDEDSGRPPARAMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDSGrpParamNameDirty(){
        if(this.contains(FIELD_PSDEDSGRPPARAMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数标识
     */
    @JsonIgnore
    public void resetPSDEDSGrpParamName(){
        this.reset(FIELD_PSDEDSGRPPARAMNAME);
    }

    /**
     * 设置 参数标识，详细说明：{@link #FIELD_PSDEDSGRPPARAMNAME}
     * <P>
     * 等同 {@link #setPSDEDSGrpParamName}
     * @param pSDEDSGrpParamName
     */
    @JsonIgnore
    public PSDEDSGrpParam psdedsgrpparamname(String pSDEDSGrpParamName){
        this.setPSDEDSGrpParamName(pSDEDSGrpParamName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEDSGrpParamName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEDSGrpParamName(strName);
    }

    @JsonIgnore
    public PSDEDSGrpParam name(String strName){
        this.setPSDEDSGrpParamName(strName);
        return this;
    }

    /**
     * <B>PSDEDSID</B>&nbsp;实体结果集
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataSet} 
     */
    public final static String FIELD_PSDEDSID = "psdedsid";

    /**
     * 设置 实体结果集
     * 
     * @param pSDEDSId
     * 
     */
    @JsonProperty(FIELD_PSDEDSID)
    public void setPSDEDSId(String pSDEDSId){
        this.set(FIELD_PSDEDSID, pSDEDSId);
    }
    
    /**
     * 获取 实体结果集  
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
     * 判断 实体结果集 是否指定值，包括空值
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
     * 重置 实体结果集
     */
    @JsonIgnore
    public void resetPSDEDSId(){
        this.reset(FIELD_PSDEDSID);
    }

    /**
     * 设置 实体结果集
     * <P>
     * 等同 {@link #setPSDEDSId}
     * @param pSDEDSId
     */
    @JsonIgnore
    public PSDEDSGrpParam psdedsid(String pSDEDSId){
        this.setPSDEDSId(pSDEDSId);
        return this;
    }

    /**
     * 设置 实体结果集，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDSId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSDEDSGrpParam psdedsid(PSDEDataSet pSDEDataSet){
        if(pSDEDataSet == null){
            this.setPSDEDSId(null);
            this.setPSDEDSName(null);
            this.setPSDEId(null);
        }
        else{
            this.setPSDEDSId(pSDEDataSet.getPSDEDataSetId());
            this.setPSDEDSName(pSDEDataSet.getPSDEDataSetName());
            this.setPSDEId(pSDEDataSet.getPSDEId());
        }
        return this;
    }

    /**
     * <B>PSDEDSNAME</B>&nbsp;实体结果集
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDSID}
     */
    public final static String FIELD_PSDEDSNAME = "psdedsname";

    /**
     * 设置 实体结果集
     * 
     * @param pSDEDSName
     * 
     */
    @JsonProperty(FIELD_PSDEDSNAME)
    public void setPSDEDSName(String pSDEDSName){
        this.set(FIELD_PSDEDSNAME, pSDEDSName);
    }
    
    /**
     * 获取 实体结果集  
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
     * 判断 实体结果集 是否指定值，包括空值
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
     * 重置 实体结果集
     */
    @JsonIgnore
    public void resetPSDEDSName(){
        this.reset(FIELD_PSDEDSNAME);
    }

    /**
     * 设置 实体结果集
     * <P>
     * 等同 {@link #setPSDEDSName}
     * @param pSDEDSName
     */
    @JsonIgnore
    public PSDEDSGrpParam psdedsname(String pSDEDSName){
        this.setPSDEDSName(pSDEDSName);
        return this;
    }

    /**
     * <B>PSDEFID</B>&nbsp;实体属性，指定分组参数的相关实体属性，启用分组时作为分组属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_PSDEFID = "psdefid";

    /**
     * 设置 实体属性，详细说明：{@link #FIELD_PSDEFID}
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
     * 设置 实体属性，详细说明：{@link #FIELD_PSDEFID}
     * <P>
     * 等同 {@link #setPSDEFId}
     * @param pSDEFId
     */
    @JsonIgnore
    public PSDEDSGrpParam psdefid(String pSDEFId){
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
    public PSDEDSGrpParam psdefid(PSDEField pSDEField){
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
     * <B>PSDEFNAME</B>&nbsp;实体属性，指定分组参数的相关实体属性，启用分组时作为分组属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFID}
     */
    public final static String FIELD_PSDEFNAME = "psdefname";

    /**
     * 设置 实体属性，详细说明：{@link #FIELD_PSDEFNAME}
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
     * 设置 实体属性，详细说明：{@link #FIELD_PSDEFNAME}
     * <P>
     * 等同 {@link #setPSDEFName}
     * @param pSDEFName
     */
    @JsonIgnore
    public PSDEDSGrpParam psdefname(String pSDEFName){
        this.setPSDEFName(pSDEFName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体编号
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDSID}
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 实体编号
     * 
     * @param pSDEId
     * 
     */
    @JsonProperty(FIELD_PSDEID)
    public void setPSDEId(String pSDEId){
        this.set(FIELD_PSDEID, pSDEId);
    }
    
    /**
     * 获取 实体编号  
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
     * 判断 实体编号 是否指定值，包括空值
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
     * 重置 实体编号
     */
    @JsonIgnore
    public void resetPSDEId(){
        this.reset(FIELD_PSDEID);
    }

    /**
     * 设置 实体编号
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSDEDSGrpParam psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * <B>SORTORDERVALUE</B>&nbsp;分组次序，指定数据集分组项的分组次序，默认为【-1】
     */
    public final static String FIELD_SORTORDERVALUE = "sortordervalue";

    /**
     * 设置 分组次序，详细说明：{@link #FIELD_SORTORDERVALUE}
     * 
     * @param sortOrderValue
     * 
     */
    @JsonProperty(FIELD_SORTORDERVALUE)
    public void setSortOrderValue(Integer sortOrderValue){
        this.set(FIELD_SORTORDERVALUE, sortOrderValue);
    }
    
    /**
     * 获取 分组次序  
     * @return
     */
    @JsonIgnore
    public Integer getSortOrderValue(){
        Object objValue = this.get(FIELD_SORTORDERVALUE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 分组次序 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSortOrderValueDirty(){
        if(this.contains(FIELD_SORTORDERVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组次序
     */
    @JsonIgnore
    public void resetSortOrderValue(){
        this.reset(FIELD_SORTORDERVALUE);
    }

    /**
     * 设置 分组次序，详细说明：{@link #FIELD_SORTORDERVALUE}
     * <P>
     * 等同 {@link #setSortOrderValue}
     * @param sortOrderValue
     */
    @JsonIgnore
    public PSDEDSGrpParam sortordervalue(Integer sortOrderValue){
        this.setSortOrderValue(sortOrderValue);
        return this;
    }

    /**
     * <B>STDDATATYPE</B>&nbsp;数据类型，指定数据集分组项的数据类型，一般用于指定聚合列的数据类型，未指定时使用属性的标准数据类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.StdDataType} 
     */
    public final static String FIELD_STDDATATYPE = "stddatatype";

    /**
     * 设置 数据类型，详细说明：{@link #FIELD_STDDATATYPE}
     * 
     * @param stdDataType
     * 
     */
    @JsonProperty(FIELD_STDDATATYPE)
    public void setStdDataType(Integer stdDataType){
        this.set(FIELD_STDDATATYPE, stdDataType);
    }
    
    /**
     * 获取 数据类型  
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
     * 判断 数据类型 是否指定值，包括空值
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
     * 重置 数据类型
     */
    @JsonIgnore
    public void resetStdDataType(){
        this.reset(FIELD_STDDATATYPE);
    }

    /**
     * 设置 数据类型，详细说明：{@link #FIELD_STDDATATYPE}
     * <P>
     * 等同 {@link #setStdDataType}
     * @param stdDataType
     */
    @JsonIgnore
    public PSDEDSGrpParam stddatatype(Integer stdDataType){
        this.setStdDataType(stdDataType);
        return this;
    }

     /**
     * 设置 数据类型，详细说明：{@link #FIELD_STDDATATYPE}
     * <P>
     * 等同 {@link #setStdDataType}
     * @param stdDataType
     */
    @JsonIgnore
    public PSDEDSGrpParam stddatatype(net.ibizsys.psmodel.core.util.PSModelEnums.StdDataType stdDataType){
        if(stdDataType == null){
            this.setStdDataType(null);
        }
        else{
            this.setStdDataType(stdDataType.value);
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
    public PSDEDSGrpParam updatedate(String updateDate){
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
    public PSDEDSGrpParam updateman(String updateMan){
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
    public PSDEDSGrpParam usercat(String userCat){
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
    public PSDEDSGrpParam usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat.value);
        }
        return this;
    }

    /**
     * <B>USERDATA</B>&nbsp;用户数据
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_USERDATA = "userdata";

    /**
     * 设置 用户数据
     * 
     * @param userData
     * 
     */
    @JsonProperty(FIELD_USERDATA)
    public void setUserData(String userData){
        this.set(FIELD_USERDATA, userData);
    }
    
    /**
     * 获取 用户数据  
     * @return
     */
    @JsonIgnore
    public String getUserData(){
        Object objValue = this.get(FIELD_USERDATA);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户数据 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserDataDirty(){
        if(this.contains(FIELD_USERDATA)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户数据
     */
    @JsonIgnore
    public void resetUserData(){
        this.reset(FIELD_USERDATA);
    }

    /**
     * 设置 用户数据
     * <P>
     * 等同 {@link #setUserData}
     * @param userData
     */
    @JsonIgnore
    public PSDEDSGrpParam userdata(String userData){
        this.setUserData(userData);
        return this;
    }

    /**
     * <B>USERDATA2</B>&nbsp;用户数据2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_USERDATA2 = "userdata2";

    /**
     * 设置 用户数据2
     * 
     * @param userData2
     * 
     */
    @JsonProperty(FIELD_USERDATA2)
    public void setUserData2(String userData2){
        this.set(FIELD_USERDATA2, userData2);
    }
    
    /**
     * 获取 用户数据2  
     * @return
     */
    @JsonIgnore
    public String getUserData2(){
        Object objValue = this.get(FIELD_USERDATA2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户数据2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserData2Dirty(){
        if(this.contains(FIELD_USERDATA2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户数据2
     */
    @JsonIgnore
    public void resetUserData2(){
        this.reset(FIELD_USERDATA2);
    }

    /**
     * 设置 用户数据2
     * <P>
     * 等同 {@link #setUserData2}
     * @param userData2
     */
    @JsonIgnore
    public PSDEDSGrpParam userdata2(String userData2){
        this.setUserData2(userData2);
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
    public PSDEDSGrpParam usertag(String userTag){
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
    public PSDEDSGrpParam usertag2(String userTag2){
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
    public PSDEDSGrpParam usertag3(String userTag3){
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
    public PSDEDSGrpParam usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEDSGrpParamId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEDSGrpParamId(strValue);
    }

    @JsonIgnore
    public PSDEDSGrpParam id(String strValue){
        this.setPSDEDSGrpParamId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEDSGrpParam){
            PSDEDSGrpParam model = (PSDEDSGrpParam)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
