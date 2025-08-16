package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDBVALUEOP</B>数据库值操作符 模型传输对象
 * <P>
 * 
 */
public class PSDBValueOP extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDBValueOP(){
        this.setValidFlag(1);
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
    public PSDBValueOP createdate(String createDate){
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
    public PSDBValueOP createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DBFLAG</B>&nbsp;数据库操作
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DBFLAG = "dbflag";

    /**
     * 设置 数据库操作
     * 
     * @param dBFlag
     * 
     */
    @JsonProperty(FIELD_DBFLAG)
    public void setDBFlag(Integer dBFlag){
        this.set(FIELD_DBFLAG, dBFlag);
    }
    
    /**
     * 获取 数据库操作  
     * @return
     */
    @JsonIgnore
    public Integer getDBFlag(){
        Object objValue = this.get(FIELD_DBFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 数据库操作 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDBFlagDirty(){
        if(this.contains(FIELD_DBFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据库操作
     */
    @JsonIgnore
    public void resetDBFlag(){
        this.reset(FIELD_DBFLAG);
    }

    /**
     * 设置 数据库操作
     * <P>
     * 等同 {@link #setDBFlag}
     * @param dBFlag
     */
    @JsonIgnore
    public PSDBValueOP dbflag(Integer dBFlag){
        this.setDBFlag(dBFlag);
        return this;
    }

     /**
     * 设置 数据库操作
     * <P>
     * 等同 {@link #setDBFlag}
     * @param dBFlag
     */
    @JsonIgnore
    public PSDBValueOP dbflag(Boolean dBFlag){
        if(dBFlag == null){
            this.setDBFlag(null);
        }
        else{
            this.setDBFlag(dBFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DLFLAG</B>&nbsp;开发语言操作
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DLFLAG = "dlflag";

    /**
     * 设置 开发语言操作
     * 
     * @param dLFlag
     * 
     */
    @JsonProperty(FIELD_DLFLAG)
    public void setDLFlag(Integer dLFlag){
        this.set(FIELD_DLFLAG, dLFlag);
    }
    
    /**
     * 获取 开发语言操作  
     * @return
     */
    @JsonIgnore
    public Integer getDLFlag(){
        Object objValue = this.get(FIELD_DLFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 开发语言操作 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDLFlagDirty(){
        if(this.contains(FIELD_DLFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发语言操作
     */
    @JsonIgnore
    public void resetDLFlag(){
        this.reset(FIELD_DLFLAG);
    }

    /**
     * 设置 开发语言操作
     * <P>
     * 等同 {@link #setDLFlag}
     * @param dLFlag
     */
    @JsonIgnore
    public PSDBValueOP dlflag(Integer dLFlag){
        this.setDLFlag(dLFlag);
        return this;
    }

     /**
     * 设置 开发语言操作
     * <P>
     * 等同 {@link #setDLFlag}
     * @param dLFlag
     */
    @JsonIgnore
    public PSDBValueOP dlflag(Boolean dLFlag){
        if(dLFlag == null){
            this.setDLFlag(null);
        }
        else{
            this.setDLFlag(dLFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSDBValueOP memo(String memo){
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
    public PSDBValueOP ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSDBVALUEOPID</B>&nbsp;操作符标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDBVALUEOPID = "psdbvalueopid";

    /**
     * 设置 操作符标识
     * 
     * @param pSDBValueOPId
     * 
     */
    @JsonProperty(FIELD_PSDBVALUEOPID)
    public void setPSDBValueOPId(String pSDBValueOPId){
        this.set(FIELD_PSDBVALUEOPID, pSDBValueOPId);
    }
    
    /**
     * 获取 操作符标识  
     * @return
     */
    @JsonIgnore
    public String getPSDBValueOPId(){
        Object objValue = this.get(FIELD_PSDBVALUEOPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作符标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDBValueOPIdDirty(){
        if(this.contains(FIELD_PSDBVALUEOPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作符标识
     */
    @JsonIgnore
    public void resetPSDBValueOPId(){
        this.reset(FIELD_PSDBVALUEOPID);
    }

    /**
     * 设置 操作符标识
     * <P>
     * 等同 {@link #setPSDBValueOPId}
     * @param pSDBValueOPId
     */
    @JsonIgnore
    public PSDBValueOP psdbvalueopid(String pSDBValueOPId){
        this.setPSDBValueOPId(pSDBValueOPId);
        return this;
    }

    /**
     * <B>PSDBVALUEOPNAME</B>&nbsp;操作符名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDBVALUEOPNAME = "psdbvalueopname";

    /**
     * 设置 操作符名称
     * 
     * @param pSDBValueOPName
     * 
     */
    @JsonProperty(FIELD_PSDBVALUEOPNAME)
    public void setPSDBValueOPName(String pSDBValueOPName){
        this.set(FIELD_PSDBVALUEOPNAME, pSDBValueOPName);
    }
    
    /**
     * 获取 操作符名称  
     * @return
     */
    @JsonIgnore
    public String getPSDBValueOPName(){
        Object objValue = this.get(FIELD_PSDBVALUEOPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作符名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDBValueOPNameDirty(){
        if(this.contains(FIELD_PSDBVALUEOPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作符名称
     */
    @JsonIgnore
    public void resetPSDBValueOPName(){
        this.reset(FIELD_PSDBVALUEOPNAME);
    }

    /**
     * 设置 操作符名称
     * <P>
     * 等同 {@link #setPSDBValueOPName}
     * @param pSDBValueOPName
     */
    @JsonIgnore
    public PSDBValueOP psdbvalueopname(String pSDBValueOPName){
        this.setPSDBValueOPName(pSDBValueOPName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDBValueOPName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDBValueOPName(strName);
    }

    @JsonIgnore
    public PSDBValueOP name(String strName){
        this.setPSDBValueOPName(strName);
        return this;
    }

    /**
     * <B>SIMPLENAME</B>&nbsp;简单名称
     * <P>
     * 字符串：最大长度 20
     */
    public final static String FIELD_SIMPLENAME = "simplename";

    /**
     * 设置 简单名称
     * 
     * @param simpleName
     * 
     */
    @JsonProperty(FIELD_SIMPLENAME)
    public void setSimpleName(String simpleName){
        this.set(FIELD_SIMPLENAME, simpleName);
    }
    
    /**
     * 获取 简单名称  
     * @return
     */
    @JsonIgnore
    public String getSimpleName(){
        Object objValue = this.get(FIELD_SIMPLENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 简单名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSimpleNameDirty(){
        if(this.contains(FIELD_SIMPLENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 简单名称
     */
    @JsonIgnore
    public void resetSimpleName(){
        this.reset(FIELD_SIMPLENAME);
    }

    /**
     * 设置 简单名称
     * <P>
     * 等同 {@link #setSimpleName}
     * @param simpleName
     */
    @JsonIgnore
    public PSDBValueOP simplename(String simpleName){
        this.setSimpleName(simpleName);
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
    public PSDBValueOP updatedate(String updateDate){
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
    public PSDBValueOP updateman(String updateMan){
        this.setUpdateMan(updateMan);
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
    public PSDBValueOP validflag(Integer validFlag){
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
    public PSDBValueOP validflag(Boolean validFlag){
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
        return this.getPSDBValueOPId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDBValueOPId(strValue);
    }

    @JsonIgnore
    public PSDBValueOP id(String strValue){
        this.setPSDBValueOPId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDBValueOP){
            PSDBValueOP model = (PSDBValueOP)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
