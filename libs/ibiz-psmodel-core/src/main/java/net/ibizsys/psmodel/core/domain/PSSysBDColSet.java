package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSSYSBDCOLSET</B>大数据表列族 模型传输对象
 * <P>
 * 大数据表列族模型，定义列族的相关信息
 */
public class PSSysBDColSet extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysBDColSet(){
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定大数据表列族的代码标识，需要在所在的大数据表中具有唯一性
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
    public PSSysBDColSet codename(String codeName){
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
    public PSSysBDColSet createdate(String createDate){
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
    public PSSysBDColSet createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DEFAULTFLAG</B>&nbsp;默认列族，指定大数据表列族是否为所在大数据表的默认列族，未定义时为【-1】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEFAULTFLAG = "defaultflag";

    /**
     * 设置 默认列族，详细说明：{@link #FIELD_DEFAULTFLAG}
     * 
     * @param defaultFlag
     * 
     */
    @JsonProperty(FIELD_DEFAULTFLAG)
    public void setDefaultFlag(Integer defaultFlag){
        this.set(FIELD_DEFAULTFLAG, defaultFlag);
    }
    
    /**
     * 获取 默认列族  
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
     * 判断 默认列族 是否指定值，包括空值
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
     * 重置 默认列族
     */
    @JsonIgnore
    public void resetDefaultFlag(){
        this.reset(FIELD_DEFAULTFLAG);
    }

    /**
     * 设置 默认列族，详细说明：{@link #FIELD_DEFAULTFLAG}
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSSysBDColSet defaultflag(Integer defaultFlag){
        this.setDefaultFlag(defaultFlag);
        return this;
    }

     /**
     * 设置 默认列族，详细说明：{@link #FIELD_DEFAULTFLAG}
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSSysBDColSet defaultflag(Boolean defaultFlag){
        if(defaultFlag == null){
            this.setDefaultFlag(null);
        }
        else{
            this.setDefaultFlag(defaultFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;逻辑名称，指定大数据表列族的逻辑名称
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
    public PSSysBDColSet logicname(String logicName){
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
    public PSSysBDColSet memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSSYSBDCOLSETID</B>&nbsp;大数据表列族标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSBDCOLSETID = "pssysbdcolsetid";

    /**
     * 设置 大数据表列族标识
     * 
     * @param pSSysBDColSetId
     * 
     */
    @JsonProperty(FIELD_PSSYSBDCOLSETID)
    public void setPSSysBDColSetId(String pSSysBDColSetId){
        this.set(FIELD_PSSYSBDCOLSETID, pSSysBDColSetId);
    }
    
    /**
     * 获取 大数据表列族标识  
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
     * 判断 大数据表列族标识 是否指定值，包括空值
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
     * 重置 大数据表列族标识
     */
    @JsonIgnore
    public void resetPSSysBDColSetId(){
        this.reset(FIELD_PSSYSBDCOLSETID);
    }

    /**
     * 设置 大数据表列族标识
     * <P>
     * 等同 {@link #setPSSysBDColSetId}
     * @param pSSysBDColSetId
     */
    @JsonIgnore
    public PSSysBDColSet pssysbdcolsetid(String pSSysBDColSetId){
        this.setPSSysBDColSetId(pSSysBDColSetId);
        return this;
    }

    /**
     * <B>PSSYSBDCOLSETNAME</B>&nbsp;列族名称，指定大数据表列族的名称，须在所在大数据表中具备唯一性
     * <P>
     * 字符串：最大长度 30，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSSYSBDCOLSETNAME = "pssysbdcolsetname";

    /**
     * 设置 列族名称，详细说明：{@link #FIELD_PSSYSBDCOLSETNAME}
     * 
     * @param pSSysBDColSetName
     * 
     */
    @JsonProperty(FIELD_PSSYSBDCOLSETNAME)
    public void setPSSysBDColSetName(String pSSysBDColSetName){
        this.set(FIELD_PSSYSBDCOLSETNAME, pSSysBDColSetName);
    }
    
    /**
     * 获取 列族名称  
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
     * 判断 列族名称 是否指定值，包括空值
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
     * 重置 列族名称
     */
    @JsonIgnore
    public void resetPSSysBDColSetName(){
        this.reset(FIELD_PSSYSBDCOLSETNAME);
    }

    /**
     * 设置 列族名称，详细说明：{@link #FIELD_PSSYSBDCOLSETNAME}
     * <P>
     * 等同 {@link #setPSSysBDColSetName}
     * @param pSSysBDColSetName
     */
    @JsonIgnore
    public PSSysBDColSet pssysbdcolsetname(String pSSysBDColSetName){
        this.setPSSysBDColSetName(pSSysBDColSetName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysBDColSetName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysBDColSetName(strName);
    }

    @JsonIgnore
    public PSSysBDColSet name(String strName){
        this.setPSSysBDColSetName(strName);
        return this;
    }

    /**
     * <B>PSSYSBDTABLEID</B>&nbsp;大数据表，指定大数据表列族所属的大数据表对象
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
    public PSSysBDColSet pssysbdtableid(String pSSysBDTableId){
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
    public PSSysBDColSet pssysbdtableid(PSSysBDTable pSSysBDTable){
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
     * <B>PSSYSBDTABLENAME</B>&nbsp;大数据表，指定大数据表列族所属的大数据表对象
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
    public PSSysBDColSet pssysbdtablename(String pSSysBDTableName){
        this.setPSSysBDTableName(pSSysBDTableName);
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
    public PSSysBDColSet updatedate(String updateDate){
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
    public PSSysBDColSet updateman(String updateMan){
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
    public PSSysBDColSet usercat(String userCat){
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
    public PSSysBDColSet usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysBDColSet usertag(String userTag){
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
    public PSSysBDColSet usertag2(String userTag2){
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
    public PSSysBDColSet usertag3(String userTag3){
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
    public PSSysBDColSet usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysBDColSetId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysBDColSetId(strValue);
    }

    @JsonIgnore
    public PSSysBDColSet id(String strValue){
        this.setPSSysBDColSetId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysBDColSet){
            PSSysBDColSet model = (PSSysBDColSet)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
