package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEDQCODE</B>实体数据查询代码 模型传输对象
 * <P>
 * 实体数据查询代码模型，存放模型引擎对数据查询模型编译后的查询代码，支持自定义。实体查询代码模型包括了查询代码表达式及查询代码条件模型
 */
public class PSDEDQCodeDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSDEDQCodeDTO(){
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
    public PSDEDQCodeDTO createdate(Timestamp createDate){
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
    public PSDEDQCodeDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DBTYPE</B>&nbsp;数据库类型，指定数据查询代码对对应的数据库类型
     * <P>
     * 字符串：最大长度 20
     */
    public final static String FIELD_DBTYPE = "dbtype";

    /**
     * 设置 数据库类型，详细说明：{@link #FIELD_DBTYPE}
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
     * 设置 数据库类型，详细说明：{@link #FIELD_DBTYPE}
     * <P>
     * 等同 {@link #setDBType}
     * @param dBType
     */
    @JsonIgnore
    public PSDEDQCodeDTO dbtype(String dBType){
        this.setDBType(dBType);
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
    public PSDEDQCodeDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSDEDQCODEID</B>&nbsp;实体数据查询代码标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEDQCODEID = "psdedqcodeid";

    /**
     * 设置 实体数据查询代码标识
     * 
     * @param pSDEDQCodeId
     * 
     */
    @JsonProperty(FIELD_PSDEDQCODEID)
    public void setPSDEDQCodeId(String pSDEDQCodeId){
        this.set(FIELD_PSDEDQCODEID, pSDEDQCodeId);
    }
    
    /**
     * 获取 实体数据查询代码标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEDQCodeId(){
        Object objValue = this.get(FIELD_PSDEDQCODEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据查询代码标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDQCodeIdDirty(){
        if(this.contains(FIELD_PSDEDQCODEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据查询代码标识
     */
    @JsonIgnore
    public void resetPSDEDQCodeId(){
        this.reset(FIELD_PSDEDQCODEID);
    }

    /**
     * 设置 实体数据查询代码标识
     * <P>
     * 等同 {@link #setPSDEDQCodeId}
     * @param pSDEDQCodeId
     */
    @JsonIgnore
    public PSDEDQCodeDTO psdedqcodeid(String pSDEDQCodeId){
        this.setPSDEDQCodeId(pSDEDQCodeId);
        return this;
    }

    /**
     * <B>PSDEDQCODENAME</B>&nbsp;查询代码标识
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEDQCODENAME = "psdedqcodename";

    /**
     * 设置 查询代码标识
     * 
     * @param pSDEDQCodeName
     * 
     */
    @JsonProperty(FIELD_PSDEDQCODENAME)
    public void setPSDEDQCodeName(String pSDEDQCodeName){
        this.set(FIELD_PSDEDQCODENAME, pSDEDQCodeName);
    }
    
    /**
     * 获取 查询代码标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEDQCodeName(){
        Object objValue = this.get(FIELD_PSDEDQCODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 查询代码标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDQCodeNameDirty(){
        if(this.contains(FIELD_PSDEDQCODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 查询代码标识
     */
    @JsonIgnore
    public void resetPSDEDQCodeName(){
        this.reset(FIELD_PSDEDQCODENAME);
    }

    /**
     * 设置 查询代码标识
     * <P>
     * 等同 {@link #setPSDEDQCodeName}
     * @param pSDEDQCodeName
     */
    @JsonIgnore
    public PSDEDQCodeDTO psdedqcodename(String pSDEDQCodeName){
        this.setPSDEDQCodeName(pSDEDQCodeName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEDQCodeName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEDQCodeName(strName);
    }

    @JsonIgnore
    public PSDEDQCodeDTO name(String strName){
        this.setPSDEDQCodeName(strName);
        return this;
    }

    /**
     * <B>PSDEDQID</B>&nbsp;实体数据查询
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEDataQueryDTO} 
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
    public PSDEDQCodeDTO psdedqid(String pSDEDQId){
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
    public PSDEDQCodeDTO psdedqid(PSDEDataQueryDTO pSDEDataQuery){
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
    public PSDEDQCodeDTO psdedqname(String pSDEDQName){
        this.setPSDEDQName(pSDEDQName);
        return this;
    }

    /**
     * <B>QUERYCODE</B>&nbsp;查询代码，模型引擎对数据查询编译的代码
     */
    public final static String FIELD_QUERYCODE = "querycode";

    /**
     * 设置 查询代码，详细说明：{@link #FIELD_QUERYCODE}
     * 
     * @param queryCode
     * 
     */
    @JsonProperty(FIELD_QUERYCODE)
    public void setQueryCode(String queryCode){
        this.set(FIELD_QUERYCODE, queryCode);
    }
    
    /**
     * 获取 查询代码  
     * @return
     */
    @JsonIgnore
    public String getQueryCode(){
        Object objValue = this.get(FIELD_QUERYCODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 查询代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isQueryCodeDirty(){
        if(this.contains(FIELD_QUERYCODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 查询代码
     */
    @JsonIgnore
    public void resetQueryCode(){
        this.reset(FIELD_QUERYCODE);
    }

    /**
     * 设置 查询代码，详细说明：{@link #FIELD_QUERYCODE}
     * <P>
     * 等同 {@link #setQueryCode}
     * @param queryCode
     */
    @JsonIgnore
    public PSDEDQCodeDTO querycode(String queryCode){
        this.setQueryCode(queryCode);
        return this;
    }

    /**
     * <B>QUERYCODETEMP</B>&nbsp;临时模式查询代码，模型引擎对数据查询编译的代码，临时数据模式
     */
    public final static String FIELD_QUERYCODETEMP = "querycodetemp";

    /**
     * 设置 临时模式查询代码，详细说明：{@link #FIELD_QUERYCODETEMP}
     * 
     * @param queryCodeTemp
     * 
     */
    @JsonProperty(FIELD_QUERYCODETEMP)
    public void setQueryCodeTemp(String queryCodeTemp){
        this.set(FIELD_QUERYCODETEMP, queryCodeTemp);
    }
    
    /**
     * 获取 临时模式查询代码  
     * @return
     */
    @JsonIgnore
    public String getQueryCodeTemp(){
        Object objValue = this.get(FIELD_QUERYCODETEMP);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 临时模式查询代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isQueryCodeTempDirty(){
        if(this.contains(FIELD_QUERYCODETEMP)){
            return true;
        }
        return false;
    }

    /**
     * 重置 临时模式查询代码
     */
    @JsonIgnore
    public void resetQueryCodeTemp(){
        this.reset(FIELD_QUERYCODETEMP);
    }

    /**
     * 设置 临时模式查询代码，详细说明：{@link #FIELD_QUERYCODETEMP}
     * <P>
     * 等同 {@link #setQueryCodeTemp}
     * @param queryCodeTemp
     */
    @JsonIgnore
    public PSDEDQCodeDTO querycodetemp(String queryCodeTemp){
        this.setQueryCodeTemp(queryCodeTemp);
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
    public PSDEDQCodeDTO updatedate(Timestamp updateDate){
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
    public PSDEDQCodeDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>USERQUERYCODE</B>&nbsp;用户查询代码，指定自定义的数据查询代码，自定义代码将被优先使用
     */
    public final static String FIELD_USERQUERYCODE = "userquerycode";

    /**
     * 设置 用户查询代码，详细说明：{@link #FIELD_USERQUERYCODE}
     * 
     * @param userQueryCode
     * 
     */
    @JsonProperty(FIELD_USERQUERYCODE)
    public void setUserQueryCode(String userQueryCode){
        this.set(FIELD_USERQUERYCODE, userQueryCode);
    }
    
    /**
     * 获取 用户查询代码  
     * @return
     */
    @JsonIgnore
    public String getUserQueryCode(){
        Object objValue = this.get(FIELD_USERQUERYCODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户查询代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserQueryCodeDirty(){
        if(this.contains(FIELD_USERQUERYCODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户查询代码
     */
    @JsonIgnore
    public void resetUserQueryCode(){
        this.reset(FIELD_USERQUERYCODE);
    }

    /**
     * 设置 用户查询代码，详细说明：{@link #FIELD_USERQUERYCODE}
     * <P>
     * 等同 {@link #setUserQueryCode}
     * @param userQueryCode
     */
    @JsonIgnore
    public PSDEDQCodeDTO userquerycode(String userQueryCode){
        this.setUserQueryCode(userQueryCode);
        return this;
    }

    /**
     * <B>USERQUERYCODE2</B>&nbsp;用户临时查询代码，指定自定义的数据查询代码，临时数据模型，自定义代码将被优先使用
     */
    public final static String FIELD_USERQUERYCODE2 = "userquerycode2";

    /**
     * 设置 用户临时查询代码，详细说明：{@link #FIELD_USERQUERYCODE2}
     * 
     * @param userQueryCode2
     * 
     */
    @JsonProperty(FIELD_USERQUERYCODE2)
    public void setUserQueryCode2(String userQueryCode2){
        this.set(FIELD_USERQUERYCODE2, userQueryCode2);
    }
    
    /**
     * 获取 用户临时查询代码  
     * @return
     */
    @JsonIgnore
    public String getUserQueryCode2(){
        Object objValue = this.get(FIELD_USERQUERYCODE2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户临时查询代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserQueryCode2Dirty(){
        if(this.contains(FIELD_USERQUERYCODE2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户临时查询代码
     */
    @JsonIgnore
    public void resetUserQueryCode2(){
        this.reset(FIELD_USERQUERYCODE2);
    }

    /**
     * 设置 用户临时查询代码，详细说明：{@link #FIELD_USERQUERYCODE2}
     * <P>
     * 等同 {@link #setUserQueryCode2}
     * @param userQueryCode2
     */
    @JsonIgnore
    public PSDEDQCodeDTO userquerycode2(String userQueryCode2){
        this.setUserQueryCode2(userQueryCode2);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSDEDQCodeId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSDEDQCodeId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEDQCodeId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEDQCodeId(strValue);
    }

    @JsonIgnore
    public PSDEDQCodeDTO id(String strValue){
        this.setPSDEDQCodeId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDEDQCodeDTO){
            PSDEDQCodeDTO dto = (PSDEDQCodeDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
