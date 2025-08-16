package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSDEDQCODEEXP</B>实体查询代码表达式 模型传输对象
 * <P>
 * 查询代码表达式模型，存放模型引擎对数据查询模型编译后的属性表达式，在查询代码上附加属性查询条件必须知道属性的查询表达式
 */
public class PSDEDQCodeExp extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEDQCodeExp(){
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
    public PSDEDQCodeExp createdate(String createDate){
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
    public PSDEDQCodeExp createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>EXPCODE</B>&nbsp;表达式代码，指定实际的表达式代码
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_EXPCODE = "expcode";

    /**
     * 设置 表达式代码，详细说明：{@link #FIELD_EXPCODE}
     * 
     * @param expCode
     * 
     */
    @JsonProperty(FIELD_EXPCODE)
    public void setExpCode(String expCode){
        this.set(FIELD_EXPCODE, expCode);
    }
    
    /**
     * 获取 表达式代码  
     * @return
     */
    @JsonIgnore
    public String getExpCode(){
        Object objValue = this.get(FIELD_EXPCODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表达式代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExpCodeDirty(){
        if(this.contains(FIELD_EXPCODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表达式代码
     */
    @JsonIgnore
    public void resetExpCode(){
        this.reset(FIELD_EXPCODE);
    }

    /**
     * 设置 表达式代码，详细说明：{@link #FIELD_EXPCODE}
     * <P>
     * 等同 {@link #setExpCode}
     * @param expCode
     */
    @JsonIgnore
    public PSDEDQCodeExp expcode(String expCode){
        this.setExpCode(expCode);
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
    public PSDEDQCodeExp memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;查询次序
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 查询次序
     * 
     * @param orderValue
     * 
     */
    @JsonProperty(FIELD_ORDERVALUE)
    public void setOrderValue(Integer orderValue){
        this.set(FIELD_ORDERVALUE, orderValue);
    }
    
    /**
     * 获取 查询次序  
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
     * 判断 查询次序 是否指定值，包括空值
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
     * 重置 查询次序
     */
    @JsonIgnore
    public void resetOrderValue(){
        this.reset(FIELD_ORDERVALUE);
    }

    /**
     * 设置 查询次序
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSDEDQCodeExp ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSDEDQCODEEXPID</B>&nbsp;实体查询代码表达式标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEDQCODEEXPID = "psdedqcodeexpid";

    /**
     * 设置 实体查询代码表达式标识
     * 
     * @param pSDEDQCodeExpId
     * 
     */
    @JsonProperty(FIELD_PSDEDQCODEEXPID)
    public void setPSDEDQCodeExpId(String pSDEDQCodeExpId){
        this.set(FIELD_PSDEDQCODEEXPID, pSDEDQCodeExpId);
    }
    
    /**
     * 获取 实体查询代码表达式标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEDQCodeExpId(){
        Object objValue = this.get(FIELD_PSDEDQCODEEXPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体查询代码表达式标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDQCodeExpIdDirty(){
        if(this.contains(FIELD_PSDEDQCODEEXPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体查询代码表达式标识
     */
    @JsonIgnore
    public void resetPSDEDQCodeExpId(){
        this.reset(FIELD_PSDEDQCODEEXPID);
    }

    /**
     * 设置 实体查询代码表达式标识
     * <P>
     * 等同 {@link #setPSDEDQCodeExpId}
     * @param pSDEDQCodeExpId
     */
    @JsonIgnore
    public PSDEDQCodeExp psdedqcodeexpid(String pSDEDQCodeExpId){
        this.setPSDEDQCodeExpId(pSDEDQCodeExpId);
        return this;
    }

    /**
     * <B>PSDEDQCODEEXPNAME</B>&nbsp;表达式名称，指定查询表达式名称，一般为属性名称，需要在所在的查询代码中具有唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEDQCODEEXPNAME = "psdedqcodeexpname";

    /**
     * 设置 表达式名称，详细说明：{@link #FIELD_PSDEDQCODEEXPNAME}
     * 
     * @param pSDEDQCodeExpName
     * 
     */
    @JsonProperty(FIELD_PSDEDQCODEEXPNAME)
    public void setPSDEDQCodeExpName(String pSDEDQCodeExpName){
        this.set(FIELD_PSDEDQCODEEXPNAME, pSDEDQCodeExpName);
    }
    
    /**
     * 获取 表达式名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEDQCodeExpName(){
        Object objValue = this.get(FIELD_PSDEDQCODEEXPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表达式名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDQCodeExpNameDirty(){
        if(this.contains(FIELD_PSDEDQCODEEXPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表达式名称
     */
    @JsonIgnore
    public void resetPSDEDQCodeExpName(){
        this.reset(FIELD_PSDEDQCODEEXPNAME);
    }

    /**
     * 设置 表达式名称，详细说明：{@link #FIELD_PSDEDQCODEEXPNAME}
     * <P>
     * 等同 {@link #setPSDEDQCodeExpName}
     * @param pSDEDQCodeExpName
     */
    @JsonIgnore
    public PSDEDQCodeExp psdedqcodeexpname(String pSDEDQCodeExpName){
        this.setPSDEDQCodeExpName(pSDEDQCodeExpName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEDQCodeExpName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEDQCodeExpName(strName);
    }

    @JsonIgnore
    public PSDEDQCodeExp name(String strName){
        this.setPSDEDQCodeExpName(strName);
        return this;
    }

    /**
     * <B>PSDEDQCODEID</B>&nbsp;实体查询代码
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDQCode} 
     */
    public final static String FIELD_PSDEDQCODEID = "psdedqcodeid";

    /**
     * 设置 实体查询代码
     * 
     * @param pSDEDQCodeId
     * 
     */
    @JsonProperty(FIELD_PSDEDQCODEID)
    public void setPSDEDQCodeId(String pSDEDQCodeId){
        this.set(FIELD_PSDEDQCODEID, pSDEDQCodeId);
    }
    
    /**
     * 获取 实体查询代码  
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
     * 判断 实体查询代码 是否指定值，包括空值
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
     * 重置 实体查询代码
     */
    @JsonIgnore
    public void resetPSDEDQCodeId(){
        this.reset(FIELD_PSDEDQCODEID);
    }

    /**
     * 设置 实体查询代码
     * <P>
     * 等同 {@link #setPSDEDQCodeId}
     * @param pSDEDQCodeId
     */
    @JsonIgnore
    public PSDEDQCodeExp psdedqcodeid(String pSDEDQCodeId){
        this.setPSDEDQCodeId(pSDEDQCodeId);
        return this;
    }

    /**
     * 设置 实体查询代码，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDQCodeId}
     * @param pSDEDQCode 引用对象
     */
    @JsonIgnore
    public PSDEDQCodeExp psdedqcodeid(PSDEDQCode pSDEDQCode){
        if(pSDEDQCode == null){
            this.setPSDEDQCodeId(null);
            this.setPSDEDQCodeName(null);
        }
        else{
            this.setPSDEDQCodeId(pSDEDQCode.getPSDEDQCodeId());
            this.setPSDEDQCodeName(pSDEDQCode.getPSDEDQCodeName());
        }
        return this;
    }

    /**
     * <B>PSDEDQCODENAME</B>&nbsp;实体查询代码
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDQCODEID}
     */
    public final static String FIELD_PSDEDQCODENAME = "psdedqcodename";

    /**
     * 设置 实体查询代码
     * 
     * @param pSDEDQCodeName
     * 
     */
    @JsonProperty(FIELD_PSDEDQCODENAME)
    public void setPSDEDQCodeName(String pSDEDQCodeName){
        this.set(FIELD_PSDEDQCODENAME, pSDEDQCodeName);
    }
    
    /**
     * 获取 实体查询代码  
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
     * 判断 实体查询代码 是否指定值，包括空值
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
     * 重置 实体查询代码
     */
    @JsonIgnore
    public void resetPSDEDQCodeName(){
        this.reset(FIELD_PSDEDQCODENAME);
    }

    /**
     * 设置 实体查询代码
     * <P>
     * 等同 {@link #setPSDEDQCodeName}
     * @param pSDEDQCodeName
     */
    @JsonIgnore
    public PSDEDQCodeExp psdedqcodename(String pSDEDQCodeName){
        this.setPSDEDQCodeName(pSDEDQCodeName);
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
    public PSDEDQCodeExp updatedate(String updateDate){
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
    public PSDEDQCodeExp updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEDQCodeExpId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEDQCodeExpId(strValue);
    }

    @JsonIgnore
    public PSDEDQCodeExp id(String strValue){
        this.setPSDEDQCodeExpId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEDQCodeExp){
            PSDEDQCodeExp model = (PSDEDQCodeExp)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
