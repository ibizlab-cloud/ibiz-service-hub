package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSSUBSYSSADERS</B>外部接口实体关系 模型传输对象
 * <P>
 * 外部接口实体关系模型，定义外部服务接口实体之间的关系
 */
public class PSSubSysSADERS extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSubSysSADERS(){
        this.setValidFlag(1);
    }      

    /**
     * <B>ARRAYFLAG</B>&nbsp;是否数组，指定外部接口实体对象关系是否为数组模式，未定义时为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ARRAYFLAG = "arrayflag";

    /**
     * 设置 是否数组，详细说明：{@link #FIELD_ARRAYFLAG}
     * 
     * @param arrayFlag
     * 
     */
    @JsonProperty(FIELD_ARRAYFLAG)
    public void setArrayFlag(Integer arrayFlag){
        this.set(FIELD_ARRAYFLAG, arrayFlag);
    }
    
    /**
     * 获取 是否数组  
     * @return
     */
    @JsonIgnore
    public Integer getArrayFlag(){
        Object objValue = this.get(FIELD_ARRAYFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 是否数组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isArrayFlagDirty(){
        if(this.contains(FIELD_ARRAYFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 是否数组
     */
    @JsonIgnore
    public void resetArrayFlag(){
        this.reset(FIELD_ARRAYFLAG);
    }

    /**
     * 设置 是否数组，详细说明：{@link #FIELD_ARRAYFLAG}
     * <P>
     * 等同 {@link #setArrayFlag}
     * @param arrayFlag
     */
    @JsonIgnore
    public PSSubSysSADERS arrayflag(Integer arrayFlag){
        this.setArrayFlag(arrayFlag);
        return this;
    }

     /**
     * 设置 是否数组，详细说明：{@link #FIELD_ARRAYFLAG}
     * <P>
     * 等同 {@link #setArrayFlag}
     * @param arrayFlag
     */
    @JsonIgnore
    public PSSubSysSADERS arrayflag(Boolean arrayFlag){
        if(arrayFlag == null){
            this.setArrayFlag(null);
        }
        else{
            this.setArrayFlag(arrayFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CHILDFILTER</B>&nbsp;自定义关系项，指定外部服务接口实体关系的父值的过滤项名称
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_CHILDFILTER = "childfilter";

    /**
     * 设置 自定义关系项，详细说明：{@link #FIELD_CHILDFILTER}
     * 
     * @param childFilter
     * 
     */
    @JsonProperty(FIELD_CHILDFILTER)
    public void setChildFilter(String childFilter){
        this.set(FIELD_CHILDFILTER, childFilter);
    }
    
    /**
     * 获取 自定义关系项  
     * @return
     */
    @JsonIgnore
    public String getChildFilter(){
        Object objValue = this.get(FIELD_CHILDFILTER);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义关系项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isChildFilterDirty(){
        if(this.contains(FIELD_CHILDFILTER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义关系项
     */
    @JsonIgnore
    public void resetChildFilter(){
        this.reset(FIELD_CHILDFILTER);
    }

    /**
     * 设置 自定义关系项，详细说明：{@link #FIELD_CHILDFILTER}
     * <P>
     * 等同 {@link #setChildFilter}
     * @param childFilter
     */
    @JsonIgnore
    public PSSubSysSADERS childfilter(String childFilter){
        this.setChildFilter(childFilter);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定外部接口实体关系的代码标识，需要在主接口实体中具有唯一性
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
    public PSSubSysSADERS codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>CODENAME2</B>&nbsp;代码标识2，指定外部接口实体关系的代码标识2，需要在主接口实体中具有唯一性
     * <P>
     * 字符串：最大长度 50，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_CODENAME2 = "codename2";

    /**
     * 设置 代码标识2，详细说明：{@link #FIELD_CODENAME2}
     * 
     * @param codeName2
     * 
     */
    @JsonProperty(FIELD_CODENAME2)
    public void setCodeName2(String codeName2){
        this.set(FIELD_CODENAME2, codeName2);
    }
    
    /**
     * 获取 代码标识2  
     * @return
     */
    @JsonIgnore
    public String getCodeName2(){
        Object objValue = this.get(FIELD_CODENAME2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码标识2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCodeName2Dirty(){
        if(this.contains(FIELD_CODENAME2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码标识2
     */
    @JsonIgnore
    public void resetCodeName2(){
        this.reset(FIELD_CODENAME2);
    }

    /**
     * 设置 代码标识2，详细说明：{@link #FIELD_CODENAME2}
     * <P>
     * 等同 {@link #setCodeName2}
     * @param codeName2
     */
    @JsonIgnore
    public PSSubSysSADERS codename2(String codeName2){
        this.setCodeName2(codeName2);
        return this;
    }

    /**
     * <B>CPSSUBSYSSADEID</B>&nbsp;从接口实体，指定外部接口实体关系的从接口实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSubSysSADE} 
     */
    public final static String FIELD_CPSSUBSYSSADEID = "cpssubsyssadeid";

    /**
     * 设置 从接口实体，详细说明：{@link #FIELD_CPSSUBSYSSADEID}
     * 
     * @param cPSSubSysSADEId
     * 
     */
    @JsonProperty(FIELD_CPSSUBSYSSADEID)
    public void setCPSSubSysSADEId(String cPSSubSysSADEId){
        this.set(FIELD_CPSSUBSYSSADEID, cPSSubSysSADEId);
    }
    
    /**
     * 获取 从接口实体  
     * @return
     */
    @JsonIgnore
    public String getCPSSubSysSADEId(){
        Object objValue = this.get(FIELD_CPSSUBSYSSADEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 从接口实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCPSSubSysSADEIdDirty(){
        if(this.contains(FIELD_CPSSUBSYSSADEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 从接口实体
     */
    @JsonIgnore
    public void resetCPSSubSysSADEId(){
        this.reset(FIELD_CPSSUBSYSSADEID);
    }

    /**
     * 设置 从接口实体，详细说明：{@link #FIELD_CPSSUBSYSSADEID}
     * <P>
     * 等同 {@link #setCPSSubSysSADEId}
     * @param cPSSubSysSADEId
     */
    @JsonIgnore
    public PSSubSysSADERS cpssubsyssadeid(String cPSSubSysSADEId){
        this.setCPSSubSysSADEId(cPSSubSysSADEId);
        return this;
    }

    /**
     * 设置 从接口实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setCPSSubSysSADEId}
     * @param pSSubSysSADE 引用对象
     */
    @JsonIgnore
    public PSSubSysSADERS cpssubsyssadeid(PSSubSysSADE pSSubSysSADE){
        if(pSSubSysSADE == null){
            this.setCPSSubSysSADEId(null);
            this.setCPSSubSysSADEName(null);
        }
        else{
            this.setCPSSubSysSADEId(pSSubSysSADE.getPSSubSysSADEId());
            this.setCPSSubSysSADEName(pSSubSysSADE.getPSSubSysSADEName());
        }
        return this;
    }

    /**
     * <B>CPSSUBSYSSADENAME</B>&nbsp;从接口实体，指定外部接口实体关系的从接口实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CPSSUBSYSSADEID}
     */
    public final static String FIELD_CPSSUBSYSSADENAME = "cpssubsyssadename";

    /**
     * 设置 从接口实体，详细说明：{@link #FIELD_CPSSUBSYSSADENAME}
     * 
     * @param cPSSubSysSADEName
     * 
     */
    @JsonProperty(FIELD_CPSSUBSYSSADENAME)
    public void setCPSSubSysSADEName(String cPSSubSysSADEName){
        this.set(FIELD_CPSSUBSYSSADENAME, cPSSubSysSADEName);
    }
    
    /**
     * 获取 从接口实体  
     * @return
     */
    @JsonIgnore
    public String getCPSSubSysSADEName(){
        Object objValue = this.get(FIELD_CPSSUBSYSSADENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 从接口实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCPSSubSysSADENameDirty(){
        if(this.contains(FIELD_CPSSUBSYSSADENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 从接口实体
     */
    @JsonIgnore
    public void resetCPSSubSysSADEName(){
        this.reset(FIELD_CPSSUBSYSSADENAME);
    }

    /**
     * 设置 从接口实体，详细说明：{@link #FIELD_CPSSUBSYSSADENAME}
     * <P>
     * 等同 {@link #setCPSSubSysSADEName}
     * @param cPSSubSysSADEName
     */
    @JsonIgnore
    public PSSubSysSADERS cpssubsyssadename(String cPSSubSysSADEName){
        this.setCPSSubSysSADEName(cPSSubSysSADEName);
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
    public PSSubSysSADERS createdate(String createDate){
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
    public PSSubSysSADERS createman(String createMan){
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
    public PSSubSysSADERS memo(String memo){
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
    public PSSubSysSADERS ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PPSSUBSYSSADEID</B>&nbsp;主接口实体，指定外部接口实体关系的主接口实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSubSysSADE} 
     */
    public final static String FIELD_PPSSUBSYSSADEID = "ppssubsyssadeid";

    /**
     * 设置 主接口实体，详细说明：{@link #FIELD_PPSSUBSYSSADEID}
     * 
     * @param pPSSubSysSADEId
     * 
     */
    @JsonProperty(FIELD_PPSSUBSYSSADEID)
    public void setPPSSubSysSADEId(String pPSSubSysSADEId){
        this.set(FIELD_PPSSUBSYSSADEID, pPSSubSysSADEId);
    }
    
    /**
     * 获取 主接口实体  
     * @return
     */
    @JsonIgnore
    public String getPPSSubSysSADEId(){
        Object objValue = this.get(FIELD_PPSSUBSYSSADEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主接口实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSSubSysSADEIdDirty(){
        if(this.contains(FIELD_PPSSUBSYSSADEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主接口实体
     */
    @JsonIgnore
    public void resetPPSSubSysSADEId(){
        this.reset(FIELD_PPSSUBSYSSADEID);
    }

    /**
     * 设置 主接口实体，详细说明：{@link #FIELD_PPSSUBSYSSADEID}
     * <P>
     * 等同 {@link #setPPSSubSysSADEId}
     * @param pPSSubSysSADEId
     */
    @JsonIgnore
    public PSSubSysSADERS ppssubsyssadeid(String pPSSubSysSADEId){
        this.setPPSSubSysSADEId(pPSSubSysSADEId);
        return this;
    }

    /**
     * 设置 主接口实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPPSSubSysSADEId}
     * @param pSSubSysSADE 引用对象
     */
    @JsonIgnore
    public PSSubSysSADERS ppssubsyssadeid(PSSubSysSADE pSSubSysSADE){
        if(pSSubSysSADE == null){
            this.setPPSSubSysSADEId(null);
            this.setPPSSubSysSADEName(null);
        }
        else{
            this.setPPSSubSysSADEId(pSSubSysSADE.getPSSubSysSADEId());
            this.setPPSSubSysSADEName(pSSubSysSADE.getPSSubSysSADEName());
        }
        return this;
    }

    /**
     * <B>PPSSUBSYSSADENAME</B>&nbsp;主接口实体，指定外部接口实体关系的主接口实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PPSSUBSYSSADEID}
     */
    public final static String FIELD_PPSSUBSYSSADENAME = "ppssubsyssadename";

    /**
     * 设置 主接口实体，详细说明：{@link #FIELD_PPSSUBSYSSADENAME}
     * 
     * @param pPSSubSysSADEName
     * 
     */
    @JsonProperty(FIELD_PPSSUBSYSSADENAME)
    public void setPPSSubSysSADEName(String pPSSubSysSADEName){
        this.set(FIELD_PPSSUBSYSSADENAME, pPSSubSysSADEName);
    }
    
    /**
     * 获取 主接口实体  
     * @return
     */
    @JsonIgnore
    public String getPPSSubSysSADEName(){
        Object objValue = this.get(FIELD_PPSSUBSYSSADENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主接口实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSSubSysSADENameDirty(){
        if(this.contains(FIELD_PPSSUBSYSSADENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主接口实体
     */
    @JsonIgnore
    public void resetPPSSubSysSADEName(){
        this.reset(FIELD_PPSSUBSYSSADENAME);
    }

    /**
     * 设置 主接口实体，详细说明：{@link #FIELD_PPSSUBSYSSADENAME}
     * <P>
     * 等同 {@link #setPPSSubSysSADEName}
     * @param pPSSubSysSADEName
     */
    @JsonIgnore
    public PSSubSysSADERS ppssubsyssadename(String pPSSubSysSADEName){
        this.setPPSSubSysSADEName(pPSSubSysSADEName);
        return this;
    }

    /**
     * <B>PSSUBSYSSADERSID</B>&nbsp;子系统接口实体关系标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSUBSYSSADERSID = "pssubsyssadersid";

    /**
     * 设置 子系统接口实体关系标识
     * 
     * @param pSSubSysSADERSId
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSADERSID)
    public void setPSSubSysSADERSId(String pSSubSysSADERSId){
        this.set(FIELD_PSSUBSYSSADERSID, pSSubSysSADERSId);
    }
    
    /**
     * 获取 子系统接口实体关系标识  
     * @return
     */
    @JsonIgnore
    public String getPSSubSysSADERSId(){
        Object objValue = this.get(FIELD_PSSUBSYSSADERSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 子系统接口实体关系标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubSysSADERSIdDirty(){
        if(this.contains(FIELD_PSSUBSYSSADERSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 子系统接口实体关系标识
     */
    @JsonIgnore
    public void resetPSSubSysSADERSId(){
        this.reset(FIELD_PSSUBSYSSADERSID);
    }

    /**
     * 设置 子系统接口实体关系标识
     * <P>
     * 等同 {@link #setPSSubSysSADERSId}
     * @param pSSubSysSADERSId
     */
    @JsonIgnore
    public PSSubSysSADERS pssubsyssadersid(String pSSubSysSADERSId){
        this.setPSSubSysSADERSId(pSSubSysSADERSId);
        return this;
    }

    /**
     * <B>PSSUBSYSSADERSNAME</B>&nbsp;关系名称，指定外部接口实体关系的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSUBSYSSADERSNAME = "pssubsyssadersname";

    /**
     * 设置 关系名称，详细说明：{@link #FIELD_PSSUBSYSSADERSNAME}
     * 
     * @param pSSubSysSADERSName
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSADERSNAME)
    public void setPSSubSysSADERSName(String pSSubSysSADERSName){
        this.set(FIELD_PSSUBSYSSADERSNAME, pSSubSysSADERSName);
    }
    
    /**
     * 获取 关系名称  
     * @return
     */
    @JsonIgnore
    public String getPSSubSysSADERSName(){
        Object objValue = this.get(FIELD_PSSUBSYSSADERSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubSysSADERSNameDirty(){
        if(this.contains(FIELD_PSSUBSYSSADERSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系名称
     */
    @JsonIgnore
    public void resetPSSubSysSADERSName(){
        this.reset(FIELD_PSSUBSYSSADERSNAME);
    }

    /**
     * 设置 关系名称，详细说明：{@link #FIELD_PSSUBSYSSADERSNAME}
     * <P>
     * 等同 {@link #setPSSubSysSADERSName}
     * @param pSSubSysSADERSName
     */
    @JsonIgnore
    public PSSubSysSADERS pssubsyssadersname(String pSSubSysSADERSName){
        this.setPSSubSysSADERSName(pSSubSysSADERSName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSubSysSADERSName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSubSysSADERSName(strName);
    }

    @JsonIgnore
    public PSSubSysSADERS name(String strName){
        this.setPSSubSysSADERSName(strName);
        return this;
    }

    /**
     * <B>PSSUBSYSSERVICEAPIID</B>&nbsp;外部服务接口，指定外部接口实体关系所属的外部服务接口
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSubSysServiceAPI} 
     */
    public final static String FIELD_PSSUBSYSSERVICEAPIID = "pssubsysserviceapiid";

    /**
     * 设置 外部服务接口，详细说明：{@link #FIELD_PSSUBSYSSERVICEAPIID}
     * 
     * @param pSSubSysServiceAPIId
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSERVICEAPIID)
    public void setPSSubSysServiceAPIId(String pSSubSysServiceAPIId){
        this.set(FIELD_PSSUBSYSSERVICEAPIID, pSSubSysServiceAPIId);
    }
    
    /**
     * 获取 外部服务接口  
     * @return
     */
    @JsonIgnore
    public String getPSSubSysServiceAPIId(){
        Object objValue = this.get(FIELD_PSSUBSYSSERVICEAPIID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 外部服务接口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubSysServiceAPIIdDirty(){
        if(this.contains(FIELD_PSSUBSYSSERVICEAPIID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 外部服务接口
     */
    @JsonIgnore
    public void resetPSSubSysServiceAPIId(){
        this.reset(FIELD_PSSUBSYSSERVICEAPIID);
    }

    /**
     * 设置 外部服务接口，详细说明：{@link #FIELD_PSSUBSYSSERVICEAPIID}
     * <P>
     * 等同 {@link #setPSSubSysServiceAPIId}
     * @param pSSubSysServiceAPIId
     */
    @JsonIgnore
    public PSSubSysSADERS pssubsysserviceapiid(String pSSubSysServiceAPIId){
        this.setPSSubSysServiceAPIId(pSSubSysServiceAPIId);
        return this;
    }

    /**
     * 设置 外部服务接口，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSubSysServiceAPIId}
     * @param pSSubSysServiceAPI 引用对象
     */
    @JsonIgnore
    public PSSubSysSADERS pssubsysserviceapiid(PSSubSysServiceAPI pSSubSysServiceAPI){
        if(pSSubSysServiceAPI == null){
            this.setPSSubSysServiceAPIId(null);
            this.setPSSubSysServiceAPIName(null);
        }
        else{
            this.setPSSubSysServiceAPIId(pSSubSysServiceAPI.getPSSubSysServiceAPIId());
            this.setPSSubSysServiceAPIName(pSSubSysServiceAPI.getPSSubSysServiceAPIName());
        }
        return this;
    }

    /**
     * <B>PSSUBSYSSERVICEAPINAME</B>&nbsp;外部服务接口，指定外部接口实体关系所属的外部服务接口
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSUBSYSSERVICEAPIID}
     */
    public final static String FIELD_PSSUBSYSSERVICEAPINAME = "pssubsysserviceapiname";

    /**
     * 设置 外部服务接口，详细说明：{@link #FIELD_PSSUBSYSSERVICEAPINAME}
     * 
     * @param pSSubSysServiceAPIName
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSERVICEAPINAME)
    public void setPSSubSysServiceAPIName(String pSSubSysServiceAPIName){
        this.set(FIELD_PSSUBSYSSERVICEAPINAME, pSSubSysServiceAPIName);
    }
    
    /**
     * 获取 外部服务接口  
     * @return
     */
    @JsonIgnore
    public String getPSSubSysServiceAPIName(){
        Object objValue = this.get(FIELD_PSSUBSYSSERVICEAPINAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 外部服务接口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubSysServiceAPINameDirty(){
        if(this.contains(FIELD_PSSUBSYSSERVICEAPINAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 外部服务接口
     */
    @JsonIgnore
    public void resetPSSubSysServiceAPIName(){
        this.reset(FIELD_PSSUBSYSSERVICEAPINAME);
    }

    /**
     * 设置 外部服务接口，详细说明：{@link #FIELD_PSSUBSYSSERVICEAPINAME}
     * <P>
     * 等同 {@link #setPSSubSysServiceAPIName}
     * @param pSSubSysServiceAPIName
     */
    @JsonIgnore
    public PSSubSysSADERS pssubsysserviceapiname(String pSSubSysServiceAPIName){
        this.setPSSubSysServiceAPIName(pSSubSysServiceAPIName);
        return this;
    }

    /**
     * <B>RSTAG</B>&nbsp;关系标记，指定外部接口实体关系的标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_RSTAG = "rstag";

    /**
     * 设置 关系标记，详细说明：{@link #FIELD_RSTAG}
     * 
     * @param rSTag
     * 
     */
    @JsonProperty(FIELD_RSTAG)
    public void setRSTag(String rSTag){
        this.set(FIELD_RSTAG, rSTag);
    }
    
    /**
     * 获取 关系标记  
     * @return
     */
    @JsonIgnore
    public String getRSTag(){
        Object objValue = this.get(FIELD_RSTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRSTagDirty(){
        if(this.contains(FIELD_RSTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系标记
     */
    @JsonIgnore
    public void resetRSTag(){
        this.reset(FIELD_RSTAG);
    }

    /**
     * 设置 关系标记，详细说明：{@link #FIELD_RSTAG}
     * <P>
     * 等同 {@link #setRSTag}
     * @param rSTag
     */
    @JsonIgnore
    public PSSubSysSADERS rstag(String rSTag){
        this.setRSTag(rSTag);
        return this;
    }

    /**
     * <B>RSTAG2</B>&nbsp;关系标记2，指定外部接口实体关系的标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_RSTAG2 = "rstag2";

    /**
     * 设置 关系标记2，详细说明：{@link #FIELD_RSTAG2}
     * 
     * @param rSTag2
     * 
     */
    @JsonProperty(FIELD_RSTAG2)
    public void setRSTag2(String rSTag2){
        this.set(FIELD_RSTAG2, rSTag2);
    }
    
    /**
     * 获取 关系标记2  
     * @return
     */
    @JsonIgnore
    public String getRSTag2(){
        Object objValue = this.get(FIELD_RSTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRSTag2Dirty(){
        if(this.contains(FIELD_RSTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系标记2
     */
    @JsonIgnore
    public void resetRSTag2(){
        this.reset(FIELD_RSTAG2);
    }

    /**
     * 设置 关系标记2，详细说明：{@link #FIELD_RSTAG2}
     * <P>
     * 等同 {@link #setRSTag2}
     * @param rSTag2
     */
    @JsonIgnore
    public PSSubSysSADERS rstag2(String rSTag2){
        this.setRSTag2(rSTag2);
        return this;
    }

    /**
     * <B>TYPEFILTER</B>&nbsp;类型过滤项
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_TYPEFILTER = "typefilter";

    /**
     * 设置 类型过滤项
     * 
     * @param typeFilter
     * 
     */
    @JsonProperty(FIELD_TYPEFILTER)
    public void setTypeFilter(String typeFilter){
        this.set(FIELD_TYPEFILTER, typeFilter);
    }
    
    /**
     * 获取 类型过滤项  
     * @return
     */
    @JsonIgnore
    public String getTypeFilter(){
        Object objValue = this.get(FIELD_TYPEFILTER);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 类型过滤项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTypeFilterDirty(){
        if(this.contains(FIELD_TYPEFILTER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 类型过滤项
     */
    @JsonIgnore
    public void resetTypeFilter(){
        this.reset(FIELD_TYPEFILTER);
    }

    /**
     * 设置 类型过滤项
     * <P>
     * 等同 {@link #setTypeFilter}
     * @param typeFilter
     */
    @JsonIgnore
    public PSSubSysSADERS typefilter(String typeFilter){
        this.setTypeFilter(typeFilter);
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
    public PSSubSysSADERS updatedate(String updateDate){
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
    public PSSubSysSADERS updateman(String updateMan){
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
    public PSSubSysSADERS usercat(String userCat){
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
    public PSSubSysSADERS usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSubSysSADERS usertag(String userTag){
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
    public PSSubSysSADERS usertag2(String userTag2){
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
    public PSSubSysSADERS usertag3(String userTag3){
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
    public PSSubSysSADERS usertag4(String userTag4){
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
    public PSSubSysSADERS validflag(Integer validFlag){
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
    public PSSubSysSADERS validflag(Boolean validFlag){
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
        return this.getPSSubSysSADERSId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSubSysSADERSId(strValue);
    }

    @JsonIgnore
    public PSSubSysSADERS id(String strValue){
        this.setPSSubSysSADERSId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSubSysSADERS){
            PSSubSysSADERS model = (PSSubSysSADERS)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
