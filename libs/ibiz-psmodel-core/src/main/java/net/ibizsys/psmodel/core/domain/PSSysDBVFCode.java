package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSDBVFCODE</B>系统数据库值函数代码 模型传输对象
 * <P>
 * MODELV2
 */
public class PSSysDBVFCode extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysDBVFCode(){
    }      

    /**
     * <B>CALLCODE</B>&nbsp;调用代码
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CALLCODE = "callcode";

    /**
     * 设置 调用代码
     * 
     * @param callCode
     * 
     */
    @JsonProperty(FIELD_CALLCODE)
    public void setCallCode(String callCode){
        this.set(FIELD_CALLCODE, callCode);
    }
    
    /**
     * 获取 调用代码  
     * @return
     */
    @JsonIgnore
    public String getCallCode(){
        Object objValue = this.get(FIELD_CALLCODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 调用代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCallCodeDirty(){
        if(this.contains(FIELD_CALLCODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 调用代码
     */
    @JsonIgnore
    public void resetCallCode(){
        this.reset(FIELD_CALLCODE);
    }

    /**
     * 设置 调用代码
     * <P>
     * 等同 {@link #setCallCode}
     * @param callCode
     */
    @JsonIgnore
    public PSSysDBVFCode callcode(String callCode){
        this.setCallCode(callCode);
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
    public PSSysDBVFCode createdate(String createDate){
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
    public PSSysDBVFCode createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DBTYPE</B>&nbsp;数据库类型
     * <P>
     * 字符串：最大长度 20
     */
    public final static String FIELD_DBTYPE = "dbtype";

    /**
     * 设置 数据库类型
     * 
     * @param dBType
     * 
     */
    @JsonProperty(FIELD_DBTYPE)
    public void setDBType(String dBType){
        this.set(FIELD_DBTYPE, dBType);
    }
    
    /**
     * 获取 数据库类型  
     * @return
     */
    @JsonIgnore
    public String getDBType(){
        Object objValue = this.get(FIELD_DBTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据库类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDBTypeDirty(){
        if(this.contains(FIELD_DBTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据库类型
     */
    @JsonIgnore
    public void resetDBType(){
        this.reset(FIELD_DBTYPE);
    }

    /**
     * 设置 数据库类型
     * <P>
     * 等同 {@link #setDBType}
     * @param dBType
     */
    @JsonIgnore
    public PSSysDBVFCode dbtype(String dBType){
        this.setDBType(dBType);
        return this;
    }

    /**
     * <B>FUNCCODE</B>&nbsp;函数代码
     */
    public final static String FIELD_FUNCCODE = "funccode";

    /**
     * 设置 函数代码
     * 
     * @param funcCode
     * 
     */
    @JsonProperty(FIELD_FUNCCODE)
    public void setFuncCode(String funcCode){
        this.set(FIELD_FUNCCODE, funcCode);
    }
    
    /**
     * 获取 函数代码  
     * @return
     */
    @JsonIgnore
    public String getFuncCode(){
        Object objValue = this.get(FIELD_FUNCCODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 函数代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFuncCodeDirty(){
        if(this.contains(FIELD_FUNCCODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 函数代码
     */
    @JsonIgnore
    public void resetFuncCode(){
        this.reset(FIELD_FUNCCODE);
    }

    /**
     * 设置 函数代码
     * <P>
     * 等同 {@link #setFuncCode}
     * @param funcCode
     */
    @JsonIgnore
    public PSSysDBVFCode funccode(String funcCode){
        this.setFuncCode(funcCode);
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
    public PSSysDBVFCode memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSSYSDBVFCODEID</B>&nbsp;系统数据库值函数代码标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSDBVFCODEID = "pssysdbvfcodeid";

    /**
     * 设置 系统数据库值函数代码标识
     * 
     * @param pSSysDBVFCodeId
     * 
     */
    @JsonProperty(FIELD_PSSYSDBVFCODEID)
    public void setPSSysDBVFCodeId(String pSSysDBVFCodeId){
        this.set(FIELD_PSSYSDBVFCODEID, pSSysDBVFCodeId);
    }
    
    /**
     * 获取 系统数据库值函数代码标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysDBVFCodeId(){
        Object objValue = this.get(FIELD_PSSYSDBVFCODEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统数据库值函数代码标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDBVFCodeIdDirty(){
        if(this.contains(FIELD_PSSYSDBVFCODEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统数据库值函数代码标识
     */
    @JsonIgnore
    public void resetPSSysDBVFCodeId(){
        this.reset(FIELD_PSSYSDBVFCODEID);
    }

    /**
     * 设置 系统数据库值函数代码标识
     * <P>
     * 等同 {@link #setPSSysDBVFCodeId}
     * @param pSSysDBVFCodeId
     */
    @JsonIgnore
    public PSSysDBVFCode pssysdbvfcodeid(String pSSysDBVFCodeId){
        this.setPSSysDBVFCodeId(pSSysDBVFCodeId);
        return this;
    }

    /**
     * <B>PSSYSDBVFCODENAME</B>&nbsp;函数名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSDBVFCODENAME = "pssysdbvfcodename";

    /**
     * 设置 函数名称
     * 
     * @param pSSysDBVFCodeName
     * 
     */
    @JsonProperty(FIELD_PSSYSDBVFCODENAME)
    public void setPSSysDBVFCodeName(String pSSysDBVFCodeName){
        this.set(FIELD_PSSYSDBVFCODENAME, pSSysDBVFCodeName);
    }
    
    /**
     * 获取 函数名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysDBVFCodeName(){
        Object objValue = this.get(FIELD_PSSYSDBVFCODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 函数名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDBVFCodeNameDirty(){
        if(this.contains(FIELD_PSSYSDBVFCODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 函数名称
     */
    @JsonIgnore
    public void resetPSSysDBVFCodeName(){
        this.reset(FIELD_PSSYSDBVFCODENAME);
    }

    /**
     * 设置 函数名称
     * <P>
     * 等同 {@link #setPSSysDBVFCodeName}
     * @param pSSysDBVFCodeName
     */
    @JsonIgnore
    public PSSysDBVFCode pssysdbvfcodename(String pSSysDBVFCodeName){
        this.setPSSysDBVFCodeName(pSSysDBVFCodeName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysDBVFCodeName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysDBVFCodeName(strName);
    }

    @JsonIgnore
    public PSSysDBVFCode name(String strName){
        this.setPSSysDBVFCodeName(strName);
        return this;
    }

    /**
     * <B>PSSYSDBVFID</B>&nbsp;数据库值函数
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDBVF} 
     */
    public final static String FIELD_PSSYSDBVFID = "pssysdbvfid";

    /**
     * 设置 数据库值函数
     * 
     * @param pSSysDBVFId
     * 
     */
    @JsonProperty(FIELD_PSSYSDBVFID)
    public void setPSSysDBVFId(String pSSysDBVFId){
        this.set(FIELD_PSSYSDBVFID, pSSysDBVFId);
    }
    
    /**
     * 获取 数据库值函数  
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
     * 判断 数据库值函数 是否指定值，包括空值
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
     * 重置 数据库值函数
     */
    @JsonIgnore
    public void resetPSSysDBVFId(){
        this.reset(FIELD_PSSYSDBVFID);
    }

    /**
     * 设置 数据库值函数
     * <P>
     * 等同 {@link #setPSSysDBVFId}
     * @param pSSysDBVFId
     */
    @JsonIgnore
    public PSSysDBVFCode pssysdbvfid(String pSSysDBVFId){
        this.setPSSysDBVFId(pSSysDBVFId);
        return this;
    }

    /**
     * 设置 数据库值函数，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDBVFId}
     * @param pSSysDBVF 引用对象
     */
    @JsonIgnore
    public PSSysDBVFCode pssysdbvfid(PSSysDBVF pSSysDBVF){
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
     * <B>PSSYSDBVFNAME</B>&nbsp;数据库值函数
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDBVFID}
     */
    public final static String FIELD_PSSYSDBVFNAME = "pssysdbvfname";

    /**
     * 设置 数据库值函数
     * 
     * @param pSSysDBVFName
     * 
     */
    @JsonProperty(FIELD_PSSYSDBVFNAME)
    public void setPSSysDBVFName(String pSSysDBVFName){
        this.set(FIELD_PSSYSDBVFNAME, pSSysDBVFName);
    }
    
    /**
     * 获取 数据库值函数  
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
     * 判断 数据库值函数 是否指定值，包括空值
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
     * 重置 数据库值函数
     */
    @JsonIgnore
    public void resetPSSysDBVFName(){
        this.reset(FIELD_PSSYSDBVFNAME);
    }

    /**
     * 设置 数据库值函数
     * <P>
     * 等同 {@link #setPSSysDBVFName}
     * @param pSSysDBVFName
     */
    @JsonIgnore
    public PSSysDBVFCode pssysdbvfname(String pSSysDBVFName){
        this.setPSSysDBVFName(pSSysDBVFName);
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
    public PSSysDBVFCode updatedate(String updateDate){
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
    public PSSysDBVFCode updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysDBVFCodeId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysDBVFCodeId(strValue);
    }

    @JsonIgnore
    public PSSysDBVFCode id(String strValue){
        this.setPSSysDBVFCodeId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysDBVFCode){
            PSSysDBVFCode model = (PSSysDBVFCode)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
