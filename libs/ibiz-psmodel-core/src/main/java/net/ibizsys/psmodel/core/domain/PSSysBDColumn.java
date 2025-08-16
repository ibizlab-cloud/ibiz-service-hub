package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSSYSBDCOLUMN</B>大数据表列 模型传输对象
 * <P>
 * 大数据表列模型，定义列族及相关实体属性等信息
 */
public class PSSysBDColumn extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysBDColumn(){
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定大数据列的代码标识，需要在所在的大数据表列族中具有唯一性
     * <P>
     * 字符串：最大长度 30，由字母、数字、下划线组成，且开始必须为字母
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
    public PSSysBDColumn codename(String codeName){
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
    public PSSysBDColumn createdate(String createDate){
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
    public PSSysBDColumn createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>FULLCOLNAME</B>&nbsp;完整列名，指定大数据表列的完整名称，需在所在的大数据表中具备唯一性
     * <P>
     * 字符串：最大长度 100，由字母、数字、下划线及点号组成，且开始必须字母
     */
    public final static String FIELD_FULLCOLNAME = "fullcolname";

    /**
     * 设置 完整列名，详细说明：{@link #FIELD_FULLCOLNAME}
     * 
     * @param fullColName
     * 
     */
    @JsonProperty(FIELD_FULLCOLNAME)
    public void setFullColName(String fullColName){
        this.set(FIELD_FULLCOLNAME, fullColName);
    }
    
    /**
     * 获取 完整列名  
     * @return
     */
    @JsonIgnore
    public String getFullColName(){
        Object objValue = this.get(FIELD_FULLCOLNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 完整列名 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFullColNameDirty(){
        if(this.contains(FIELD_FULLCOLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 完整列名
     */
    @JsonIgnore
    public void resetFullColName(){
        this.reset(FIELD_FULLCOLNAME);
    }

    /**
     * 设置 完整列名，详细说明：{@link #FIELD_FULLCOLNAME}
     * <P>
     * 等同 {@link #setFullColName}
     * @param fullColName
     */
    @JsonIgnore
    public PSSysBDColumn fullcolname(String fullColName){
        this.setFullColName(fullColName);
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;逻辑名称，指定大数据表列的逻辑名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_LOGICNAME = "logicname";

    /**
     * 设置 逻辑名称，详细说明：{@link #FIELD_LOGICNAME}
     * 
     * @param logicName
     * 
     */
    @JsonProperty(FIELD_LOGICNAME)
    public void setLogicName(String logicName){
        this.set(FIELD_LOGICNAME, logicName);
    }
    
    /**
     * 获取 逻辑名称  
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
     * 判断 逻辑名称 是否指定值，包括空值
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
     * 重置 逻辑名称
     */
    @JsonIgnore
    public void resetLogicName(){
        this.reset(FIELD_LOGICNAME);
    }

    /**
     * 设置 逻辑名称，详细说明：{@link #FIELD_LOGICNAME}
     * <P>
     * 等同 {@link #setLogicName}
     * @param logicName
     */
    @JsonIgnore
    public PSSysBDColumn logicname(String logicName){
        this.setLogicName(logicName);
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
    public PSSysBDColumn memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSDEFID</B>&nbsp;实体属性，指定大数据表列的相关实体属性对象
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
    public PSSysBDColumn psdefid(String pSDEFId){
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
    public PSSysBDColumn psdefid(PSDEField pSDEField){
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
     * <B>PSDEFNAME</B>&nbsp;实体属性，指定大数据表列的相关实体属性对象
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
    public PSSysBDColumn psdefname(String pSDEFName){
        this.setPSDEFName(pSDEFName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定大数据表列的相关实体对象
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
    public PSSysBDColumn psdeid(String pSDEId){
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
    public PSSysBDColumn psdeid(PSDataEntity pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;实体，指定大数据表列的相关实体对象
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
    public PSSysBDColumn psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSSYSBDCOLSETID</B>&nbsp;列族，指定大数据表列的所属列族
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysBDColSet} 
     */
    public final static String FIELD_PSSYSBDCOLSETID = "pssysbdcolsetid";

    /**
     * 设置 列族，详细说明：{@link #FIELD_PSSYSBDCOLSETID}
     * 
     * @param pSSysBDColSetId
     * 
     */
    @JsonProperty(FIELD_PSSYSBDCOLSETID)
    public void setPSSysBDColSetId(String pSSysBDColSetId){
        this.set(FIELD_PSSYSBDCOLSETID, pSSysBDColSetId);
    }
    
    /**
     * 获取 列族  
     * @return
     */
    @JsonIgnore
    public String getPSSysBDColSetId(){
        Object objValue = this.get(FIELD_PSSYSBDCOLSETID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 列族 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBDColSetIdDirty(){
        if(this.contains(FIELD_PSSYSBDCOLSETID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 列族
     */
    @JsonIgnore
    public void resetPSSysBDColSetId(){
        this.reset(FIELD_PSSYSBDCOLSETID);
    }

    /**
     * 设置 列族，详细说明：{@link #FIELD_PSSYSBDCOLSETID}
     * <P>
     * 等同 {@link #setPSSysBDColSetId}
     * @param pSSysBDColSetId
     */
    @JsonIgnore
    public PSSysBDColumn pssysbdcolsetid(String pSSysBDColSetId){
        this.setPSSysBDColSetId(pSSysBDColSetId);
        return this;
    }

    /**
     * 设置 列族，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysBDColSetId}
     * @param pSSysBDColSet 引用对象
     */
    @JsonIgnore
    public PSSysBDColumn pssysbdcolsetid(PSSysBDColSet pSSysBDColSet){
        if(pSSysBDColSet == null){
            this.setPSSysBDColSetId(null);
            this.setPSSysBDColSetName(null);
        }
        else{
            this.setPSSysBDColSetId(pSSysBDColSet.getPSSysBDColSetId());
            this.setPSSysBDColSetName(pSSysBDColSet.getPSSysBDColSetName());
        }
        return this;
    }

    /**
     * <B>PSSYSBDCOLSETNAME</B>&nbsp;列族，指定大数据表列的所属列族
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBDCOLSETID}
     */
    public final static String FIELD_PSSYSBDCOLSETNAME = "pssysbdcolsetname";

    /**
     * 设置 列族，详细说明：{@link #FIELD_PSSYSBDCOLSETNAME}
     * 
     * @param pSSysBDColSetName
     * 
     */
    @JsonProperty(FIELD_PSSYSBDCOLSETNAME)
    public void setPSSysBDColSetName(String pSSysBDColSetName){
        this.set(FIELD_PSSYSBDCOLSETNAME, pSSysBDColSetName);
    }
    
    /**
     * 获取 列族  
     * @return
     */
    @JsonIgnore
    public String getPSSysBDColSetName(){
        Object objValue = this.get(FIELD_PSSYSBDCOLSETNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 列族 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBDColSetNameDirty(){
        if(this.contains(FIELD_PSSYSBDCOLSETNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 列族
     */
    @JsonIgnore
    public void resetPSSysBDColSetName(){
        this.reset(FIELD_PSSYSBDCOLSETNAME);
    }

    /**
     * 设置 列族，详细说明：{@link #FIELD_PSSYSBDCOLSETNAME}
     * <P>
     * 等同 {@link #setPSSysBDColSetName}
     * @param pSSysBDColSetName
     */
    @JsonIgnore
    public PSSysBDColumn pssysbdcolsetname(String pSSysBDColSetName){
        this.setPSSysBDColSetName(pSSysBDColSetName);
        return this;
    }

    /**
     * <B>PSSYSBDCOLUMNID</B>&nbsp;大数据列标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSBDCOLUMNID = "pssysbdcolumnid";

    /**
     * 设置 大数据列标识
     * 
     * @param pSSysBDColumnId
     * 
     */
    @JsonProperty(FIELD_PSSYSBDCOLUMNID)
    public void setPSSysBDColumnId(String pSSysBDColumnId){
        this.set(FIELD_PSSYSBDCOLUMNID, pSSysBDColumnId);
    }
    
    /**
     * 获取 大数据列标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysBDColumnId(){
        Object objValue = this.get(FIELD_PSSYSBDCOLUMNID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 大数据列标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBDColumnIdDirty(){
        if(this.contains(FIELD_PSSYSBDCOLUMNID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 大数据列标识
     */
    @JsonIgnore
    public void resetPSSysBDColumnId(){
        this.reset(FIELD_PSSYSBDCOLUMNID);
    }

    /**
     * 设置 大数据列标识
     * <P>
     * 等同 {@link #setPSSysBDColumnId}
     * @param pSSysBDColumnId
     */
    @JsonIgnore
    public PSSysBDColumn pssysbdcolumnid(String pSSysBDColumnId){
        this.setPSSysBDColumnId(pSSysBDColumnId);
        return this;
    }

    /**
     * <B>PSSYSBDCOLUMNNAME</B>&nbsp;列名称，指定大数据表列的名称，需在所在的大数据表中具备唯一性
     * <P>
     * 字符串：最大长度 30，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSSYSBDCOLUMNNAME = "pssysbdcolumnname";

    /**
     * 设置 列名称，详细说明：{@link #FIELD_PSSYSBDCOLUMNNAME}
     * 
     * @param pSSysBDColumnName
     * 
     */
    @JsonProperty(FIELD_PSSYSBDCOLUMNNAME)
    public void setPSSysBDColumnName(String pSSysBDColumnName){
        this.set(FIELD_PSSYSBDCOLUMNNAME, pSSysBDColumnName);
    }
    
    /**
     * 获取 列名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysBDColumnName(){
        Object objValue = this.get(FIELD_PSSYSBDCOLUMNNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 列名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBDColumnNameDirty(){
        if(this.contains(FIELD_PSSYSBDCOLUMNNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 列名称
     */
    @JsonIgnore
    public void resetPSSysBDColumnName(){
        this.reset(FIELD_PSSYSBDCOLUMNNAME);
    }

    /**
     * 设置 列名称，详细说明：{@link #FIELD_PSSYSBDCOLUMNNAME}
     * <P>
     * 等同 {@link #setPSSysBDColumnName}
     * @param pSSysBDColumnName
     */
    @JsonIgnore
    public PSSysBDColumn pssysbdcolumnname(String pSSysBDColumnName){
        this.setPSSysBDColumnName(pSSysBDColumnName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysBDColumnName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysBDColumnName(strName);
    }

    @JsonIgnore
    public PSSysBDColumn name(String strName){
        this.setPSSysBDColumnName(strName);
        return this;
    }

    /**
     * <B>PSSYSBDTABLEDEID</B>&nbsp;大数据表实体，指定大数据表列相关的大数据表实体对象，列的相关属性来自大数据表实体引用的实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysBDTableDE} 
     */
    public final static String FIELD_PSSYSBDTABLEDEID = "pssysbdtabledeid";

    /**
     * 设置 大数据表实体，详细说明：{@link #FIELD_PSSYSBDTABLEDEID}
     * 
     * @param pSSysBDTableDEId
     * 
     */
    @JsonProperty(FIELD_PSSYSBDTABLEDEID)
    public void setPSSysBDTableDEId(String pSSysBDTableDEId){
        this.set(FIELD_PSSYSBDTABLEDEID, pSSysBDTableDEId);
    }
    
    /**
     * 获取 大数据表实体  
     * @return
     */
    @JsonIgnore
    public String getPSSysBDTableDEId(){
        Object objValue = this.get(FIELD_PSSYSBDTABLEDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 大数据表实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBDTableDEIdDirty(){
        if(this.contains(FIELD_PSSYSBDTABLEDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 大数据表实体
     */
    @JsonIgnore
    public void resetPSSysBDTableDEId(){
        this.reset(FIELD_PSSYSBDTABLEDEID);
    }

    /**
     * 设置 大数据表实体，详细说明：{@link #FIELD_PSSYSBDTABLEDEID}
     * <P>
     * 等同 {@link #setPSSysBDTableDEId}
     * @param pSSysBDTableDEId
     */
    @JsonIgnore
    public PSSysBDColumn pssysbdtabledeid(String pSSysBDTableDEId){
        this.setPSSysBDTableDEId(pSSysBDTableDEId);
        return this;
    }

    /**
     * 设置 大数据表实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysBDTableDEId}
     * @param pSSysBDTableDE 引用对象
     */
    @JsonIgnore
    public PSSysBDColumn pssysbdtabledeid(PSSysBDTableDE pSSysBDTableDE){
        if(pSSysBDTableDE == null){
            this.setPSSysBDTableDEId(null);
            this.setPSSysBDTableDEName(null);
        }
        else{
            this.setPSSysBDTableDEId(pSSysBDTableDE.getPSSysBDTableDEId());
            this.setPSSysBDTableDEName(pSSysBDTableDE.getPSSysBDTableDEName());
        }
        return this;
    }

    /**
     * <B>PSSYSBDTABLEDENAME</B>&nbsp;大数据表实体，指定大数据表列相关的大数据表实体对象，列的相关属性来自大数据表实体引用的实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBDTABLEDEID}
     */
    public final static String FIELD_PSSYSBDTABLEDENAME = "pssysbdtabledename";

    /**
     * 设置 大数据表实体，详细说明：{@link #FIELD_PSSYSBDTABLEDENAME}
     * 
     * @param pSSysBDTableDEName
     * 
     */
    @JsonProperty(FIELD_PSSYSBDTABLEDENAME)
    public void setPSSysBDTableDEName(String pSSysBDTableDEName){
        this.set(FIELD_PSSYSBDTABLEDENAME, pSSysBDTableDEName);
    }
    
    /**
     * 获取 大数据表实体  
     * @return
     */
    @JsonIgnore
    public String getPSSysBDTableDEName(){
        Object objValue = this.get(FIELD_PSSYSBDTABLEDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 大数据表实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBDTableDENameDirty(){
        if(this.contains(FIELD_PSSYSBDTABLEDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 大数据表实体
     */
    @JsonIgnore
    public void resetPSSysBDTableDEName(){
        this.reset(FIELD_PSSYSBDTABLEDENAME);
    }

    /**
     * 设置 大数据表实体，详细说明：{@link #FIELD_PSSYSBDTABLEDENAME}
     * <P>
     * 等同 {@link #setPSSysBDTableDEName}
     * @param pSSysBDTableDEName
     */
    @JsonIgnore
    public PSSysBDColumn pssysbdtabledename(String pSSysBDTableDEName){
        this.setPSSysBDTableDEName(pSSysBDTableDEName);
        return this;
    }

    /**
     * <B>PSSYSBDTABLEID</B>&nbsp;大数据表，指定大数据表列所属的大数据表对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysBDTable} 
     */
    public final static String FIELD_PSSYSBDTABLEID = "pssysbdtableid";

    /**
     * 设置 大数据表，详细说明：{@link #FIELD_PSSYSBDTABLEID}
     * 
     * @param pSSysBDTableId
     * 
     */
    @JsonProperty(FIELD_PSSYSBDTABLEID)
    public void setPSSysBDTableId(String pSSysBDTableId){
        this.set(FIELD_PSSYSBDTABLEID, pSSysBDTableId);
    }
    
    /**
     * 获取 大数据表  
     * @return
     */
    @JsonIgnore
    public String getPSSysBDTableId(){
        Object objValue = this.get(FIELD_PSSYSBDTABLEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 大数据表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBDTableIdDirty(){
        if(this.contains(FIELD_PSSYSBDTABLEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 大数据表
     */
    @JsonIgnore
    public void resetPSSysBDTableId(){
        this.reset(FIELD_PSSYSBDTABLEID);
    }

    /**
     * 设置 大数据表，详细说明：{@link #FIELD_PSSYSBDTABLEID}
     * <P>
     * 等同 {@link #setPSSysBDTableId}
     * @param pSSysBDTableId
     */
    @JsonIgnore
    public PSSysBDColumn pssysbdtableid(String pSSysBDTableId){
        this.setPSSysBDTableId(pSSysBDTableId);
        return this;
    }

    /**
     * 设置 大数据表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysBDTableId}
     * @param pSSysBDTable 引用对象
     */
    @JsonIgnore
    public PSSysBDColumn pssysbdtableid(PSSysBDTable pSSysBDTable){
        if(pSSysBDTable == null){
            this.setPSSysBDTableId(null);
            this.setPSSysBDTableName(null);
        }
        else{
            this.setPSSysBDTableId(pSSysBDTable.getPSSysBDTableId());
            this.setPSSysBDTableName(pSSysBDTable.getPSSysBDTableName());
        }
        return this;
    }

    /**
     * <B>PSSYSBDTABLENAME</B>&nbsp;大数据表，指定大数据表列所属的大数据表对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBDTABLEID}
     */
    public final static String FIELD_PSSYSBDTABLENAME = "pssysbdtablename";

    /**
     * 设置 大数据表，详细说明：{@link #FIELD_PSSYSBDTABLENAME}
     * 
     * @param pSSysBDTableName
     * 
     */
    @JsonProperty(FIELD_PSSYSBDTABLENAME)
    public void setPSSysBDTableName(String pSSysBDTableName){
        this.set(FIELD_PSSYSBDTABLENAME, pSSysBDTableName);
    }
    
    /**
     * 获取 大数据表  
     * @return
     */
    @JsonIgnore
    public String getPSSysBDTableName(){
        Object objValue = this.get(FIELD_PSSYSBDTABLENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 大数据表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBDTableNameDirty(){
        if(this.contains(FIELD_PSSYSBDTABLENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 大数据表
     */
    @JsonIgnore
    public void resetPSSysBDTableName(){
        this.reset(FIELD_PSSYSBDTABLENAME);
    }

    /**
     * 设置 大数据表，详细说明：{@link #FIELD_PSSYSBDTABLENAME}
     * <P>
     * 等同 {@link #setPSSysBDTableName}
     * @param pSSysBDTableName
     */
    @JsonIgnore
    public PSSysBDColumn pssysbdtablename(String pSSysBDTableName){
        this.setPSSysBDTableName(pSSysBDTableName);
        return this;
    }

    /**
     * <B>UNIONKEYVALUE</B>&nbsp;联合键值，指定大数据表列的联合键值模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.UnionKeyValueMode} 
     */
    public final static String FIELD_UNIONKEYVALUE = "unionkeyvalue";

    /**
     * 设置 联合键值，详细说明：{@link #FIELD_UNIONKEYVALUE}
     * 
     * @param unionKeyValue
     * 
     */
    @JsonProperty(FIELD_UNIONKEYVALUE)
    public void setUnionKeyValue(String unionKeyValue){
        this.set(FIELD_UNIONKEYVALUE, unionKeyValue);
    }
    
    /**
     * 获取 联合键值  
     * @return
     */
    @JsonIgnore
    public String getUnionKeyValue(){
        Object objValue = this.get(FIELD_UNIONKEYVALUE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 联合键值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUnionKeyValueDirty(){
        if(this.contains(FIELD_UNIONKEYVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 联合键值
     */
    @JsonIgnore
    public void resetUnionKeyValue(){
        this.reset(FIELD_UNIONKEYVALUE);
    }

    /**
     * 设置 联合键值，详细说明：{@link #FIELD_UNIONKEYVALUE}
     * <P>
     * 等同 {@link #setUnionKeyValue}
     * @param unionKeyValue
     */
    @JsonIgnore
    public PSSysBDColumn unionkeyvalue(String unionKeyValue){
        this.setUnionKeyValue(unionKeyValue);
        return this;
    }

     /**
     * 设置 联合键值，详细说明：{@link #FIELD_UNIONKEYVALUE}
     * <P>
     * 等同 {@link #setUnionKeyValue}
     * @param unionKeyValue
     */
    @JsonIgnore
    public PSSysBDColumn unionkeyvalue(net.ibizsys.psmodel.core.util.PSModelEnums.UnionKeyValueMode unionKeyValue){
        if(unionKeyValue == null){
            this.setUnionKeyValue(null);
        }
        else{
            this.setUnionKeyValue(unionKeyValue.value);
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
    public PSSysBDColumn updatedate(String updateDate){
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
    public PSSysBDColumn updateman(String updateMan){
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
    public PSSysBDColumn usercat(String userCat){
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
    public PSSysBDColumn usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysBDColumn usertag(String userTag){
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
    public PSSysBDColumn usertag2(String userTag2){
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
    public PSSysBDColumn usertag3(String userTag3){
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
    public PSSysBDColumn usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysBDColumnId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysBDColumnId(strValue);
    }

    @JsonIgnore
    public PSSysBDColumn id(String strValue){
        this.setPSSysBDColumnId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysBDColumn){
            PSSysBDColumn model = (PSSysBDColumn)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
