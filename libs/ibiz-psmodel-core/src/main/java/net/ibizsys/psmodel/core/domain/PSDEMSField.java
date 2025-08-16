package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSDEMSFIELD</B>实体主状态属性 模型传输对象
 * <P>
 * 主状态属性控制模型，定义主状态控制的实体属性
 */
public class PSDEMSField extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEMSField(){
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
    public PSDEMSField createdate(String createDate){
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
    public PSDEMSField createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DEFAULTVALUE</B>&nbsp;默认值
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_DEFAULTVALUE = "defaultvalue";

    /**
     * 设置 默认值
     * 
     * @param defaultValue
     * 
     */
    @JsonProperty(FIELD_DEFAULTVALUE)
    public void setDefaultValue(String defaultValue){
        this.set(FIELD_DEFAULTVALUE, defaultValue);
    }
    
    /**
     * 获取 默认值  
     * @return
     */
    @JsonIgnore
    public String getDefaultValue(){
        Object objValue = this.get(FIELD_DEFAULTVALUE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefaultValueDirty(){
        if(this.contains(FIELD_DEFAULTVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认值
     */
    @JsonIgnore
    public void resetDefaultValue(){
        this.reset(FIELD_DEFAULTVALUE);
    }

    /**
     * 设置 默认值
     * <P>
     * 等同 {@link #setDefaultValue}
     * @param defaultValue
     */
    @JsonIgnore
    public PSDEMSField defaultvalue(String defaultValue){
        this.setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <B>DEFAULTVALUETYPE</B>&nbsp;默认值类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEFDefaultValueType} 
     */
    public final static String FIELD_DEFAULTVALUETYPE = "defaultvaluetype";

    /**
     * 设置 默认值类型
     * 
     * @param defaultValueType
     * 
     */
    @JsonProperty(FIELD_DEFAULTVALUETYPE)
    public void setDefaultValueType(String defaultValueType){
        this.set(FIELD_DEFAULTVALUETYPE, defaultValueType);
        //属性名称与代码标识不一致，设置属性名称
        this.set("dvt", defaultValueType);
    }
    
    /**
     * 获取 默认值类型  
     * @return
     */
    @JsonIgnore
    public String getDefaultValueType(){
        Object objValue = this.get(FIELD_DEFAULTVALUETYPE);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("dvt");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 默认值类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefaultValueTypeDirty(){
        if(this.contains(FIELD_DEFAULTVALUETYPE)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("dvt")){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认值类型
     */
    @JsonIgnore
    public void resetDefaultValueType(){
        this.reset(FIELD_DEFAULTVALUETYPE);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("dvt");
    }

    /**
     * 设置 默认值类型
     * <P>
     * 等同 {@link #setDefaultValueType}
     * @param defaultValueType
     */
    @JsonIgnore
    public PSDEMSField defaultvaluetype(String defaultValueType){
        this.setDefaultValueType(defaultValueType);
        return this;
    }

     /**
     * 设置 默认值类型
     * <P>
     * 等同 {@link #setDefaultValueType}
     * @param defaultValueType
     */
    @JsonIgnore
    public PSDEMSField defaultvaluetype(net.ibizsys.psmodel.core.util.PSModelEnums.DEFDefaultValueType defaultValueType){
        if(defaultValueType == null){
            this.setDefaultValueType(null);
        }
        else{
            this.setDefaultValueType(defaultValueType.value);
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
    public PSDEMSField memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSDEFID</B>&nbsp;实体属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_PSDEFID = "psdefid";

    /**
     * 设置 实体属性
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
     * 设置 实体属性
     * <P>
     * 等同 {@link #setPSDEFId}
     * @param pSDEFId
     */
    @JsonIgnore
    public PSDEMSField psdefid(String pSDEFId){
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
    public PSDEMSField psdefid(PSDEField pSDEField){
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
     * <B>PSDEFNAME</B>&nbsp;实体属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFID}
     */
    public final static String FIELD_PSDEFNAME = "psdefname";

    /**
     * 设置 实体属性
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
     * 设置 实体属性
     * <P>
     * 等同 {@link #setPSDEFName}
     * @param pSDEFName
     */
    @JsonIgnore
    public PSDEMSField psdefname(String pSDEFName){
        this.setPSDEFName(pSDEFName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEMSID}
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
    public PSDEMSField psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * <B>PSDEMSFIELDID</B>&nbsp;实体主状态属性标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEMSFIELDID = "psdemsfieldid";

    /**
     * 设置 实体主状态属性标识
     * 
     * @param pSDEMSFieldId
     * 
     */
    @JsonProperty(FIELD_PSDEMSFIELDID)
    public void setPSDEMSFieldId(String pSDEMSFieldId){
        this.set(FIELD_PSDEMSFIELDID, pSDEMSFieldId);
    }
    
    /**
     * 获取 实体主状态属性标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEMSFieldId(){
        Object objValue = this.get(FIELD_PSDEMSFIELDID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体主状态属性标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEMSFieldIdDirty(){
        if(this.contains(FIELD_PSDEMSFIELDID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体主状态属性标识
     */
    @JsonIgnore
    public void resetPSDEMSFieldId(){
        this.reset(FIELD_PSDEMSFIELDID);
    }

    /**
     * 设置 实体主状态属性标识
     * <P>
     * 等同 {@link #setPSDEMSFieldId}
     * @param pSDEMSFieldId
     */
    @JsonIgnore
    public PSDEMSField psdemsfieldid(String pSDEMSFieldId){
        this.setPSDEMSFieldId(pSDEMSFieldId);
        return this;
    }

    /**
     * <B>PSDEMSFIELDNAME</B>&nbsp;主状态属性名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEMSFIELDNAME = "psdemsfieldname";

    /**
     * 设置 主状态属性名称
     * 
     * @param pSDEMSFieldName
     * 
     */
    @JsonProperty(FIELD_PSDEMSFIELDNAME)
    public void setPSDEMSFieldName(String pSDEMSFieldName){
        this.set(FIELD_PSDEMSFIELDNAME, pSDEMSFieldName);
    }
    
    /**
     * 获取 主状态属性名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEMSFieldName(){
        Object objValue = this.get(FIELD_PSDEMSFIELDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主状态属性名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEMSFieldNameDirty(){
        if(this.contains(FIELD_PSDEMSFIELDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主状态属性名称
     */
    @JsonIgnore
    public void resetPSDEMSFieldName(){
        this.reset(FIELD_PSDEMSFIELDNAME);
    }

    /**
     * 设置 主状态属性名称
     * <P>
     * 等同 {@link #setPSDEMSFieldName}
     * @param pSDEMSFieldName
     */
    @JsonIgnore
    public PSDEMSField psdemsfieldname(String pSDEMSFieldName){
        this.setPSDEMSFieldName(pSDEMSFieldName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEMSFieldName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEMSFieldName(strName);
    }

    @JsonIgnore
    public PSDEMSField name(String strName){
        this.setPSDEMSFieldName(strName);
        return this;
    }

    /**
     * <B>PSDEMSID</B>&nbsp;实体主状态
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEMainState} 
     */
    public final static String FIELD_PSDEMSID = "psdemsid";

    /**
     * 设置 实体主状态
     * 
     * @param pSDEMSId
     * 
     */
    @JsonProperty(FIELD_PSDEMSID)
    public void setPSDEMSId(String pSDEMSId){
        this.set(FIELD_PSDEMSID, pSDEMSId);
    }
    
    /**
     * 获取 实体主状态  
     * @return
     */
    @JsonIgnore
    public String getPSDEMSId(){
        Object objValue = this.get(FIELD_PSDEMSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体主状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEMSIdDirty(){
        if(this.contains(FIELD_PSDEMSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体主状态
     */
    @JsonIgnore
    public void resetPSDEMSId(){
        this.reset(FIELD_PSDEMSID);
    }

    /**
     * 设置 实体主状态
     * <P>
     * 等同 {@link #setPSDEMSId}
     * @param pSDEMSId
     */
    @JsonIgnore
    public PSDEMSField psdemsid(String pSDEMSId){
        this.setPSDEMSId(pSDEMSId);
        return this;
    }

    /**
     * 设置 实体主状态，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEMSId}
     * @param pSDEMainState 引用对象
     */
    @JsonIgnore
    public PSDEMSField psdemsid(PSDEMainState pSDEMainState){
        if(pSDEMainState == null){
            this.setPSDEId(null);
            this.setPSDEMSId(null);
            this.setPSDEMSName(null);
        }
        else{
            this.setPSDEId(pSDEMainState.getPSDEId());
            this.setPSDEMSId(pSDEMainState.getPSDEMainStateId());
            this.setPSDEMSName(pSDEMainState.getPSDEMainStateName());
        }
        return this;
    }

    /**
     * <B>PSDEMSNAME</B>&nbsp;实体主状态
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEMSID}
     */
    public final static String FIELD_PSDEMSNAME = "psdemsname";

    /**
     * 设置 实体主状态
     * 
     * @param pSDEMSName
     * 
     */
    @JsonProperty(FIELD_PSDEMSNAME)
    public void setPSDEMSName(String pSDEMSName){
        this.set(FIELD_PSDEMSNAME, pSDEMSName);
    }
    
    /**
     * 获取 实体主状态  
     * @return
     */
    @JsonIgnore
    public String getPSDEMSName(){
        Object objValue = this.get(FIELD_PSDEMSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体主状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEMSNameDirty(){
        if(this.contains(FIELD_PSDEMSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体主状态
     */
    @JsonIgnore
    public void resetPSDEMSName(){
        this.reset(FIELD_PSDEMSNAME);
    }

    /**
     * 设置 实体主状态
     * <P>
     * 等同 {@link #setPSDEMSName}
     * @param pSDEMSName
     */
    @JsonIgnore
    public PSDEMSField psdemsname(String pSDEMSName){
        this.setPSDEMSName(pSDEMSName);
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
    public PSDEMSField updatedate(String updateDate){
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
    public PSDEMSField updateman(String updateMan){
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
    public PSDEMSField usercat(String userCat){
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
    public PSDEMSField usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDEMSField usertag(String userTag){
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
    public PSDEMSField usertag2(String userTag2){
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
    public PSDEMSField usertag3(String userTag3){
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
    public PSDEMSField usertag4(String userTag4){
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
    public PSDEMSField validflag(Integer validFlag){
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
    public PSDEMSField validflag(Boolean validFlag){
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
        return this.getPSDEMSFieldId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEMSFieldId(strValue);
    }

    @JsonIgnore
    public PSDEMSField id(String strValue){
        this.setPSDEMSFieldId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEMSField){
            PSDEMSField model = (PSDEMSField)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
