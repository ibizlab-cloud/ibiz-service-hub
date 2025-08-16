package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSSYSCOUNTERITEM</B>系统计数器项 模型传输对象
 * <P>
 * 系统计数器项模型，定义计数器提供的数据项
 */
public class PSSysCounterItem extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysCounterItem(){
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
    public PSSysCounterItem createdate(String createDate){
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
    public PSSysCounterItem createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;中文名称，指定计数项的逻辑名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_LOGICNAME = "logicname";

    /**
     * 设置 中文名称，详细说明：{@link #FIELD_LOGICNAME}
     * 
     * @param logicName
     * 
     */
    @JsonProperty(FIELD_LOGICNAME)
    public void setLogicName(String logicName){
        this.set(FIELD_LOGICNAME, logicName);
    }
    
    /**
     * 获取 中文名称  
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
     * 判断 中文名称 是否指定值，包括空值
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
     * 重置 中文名称
     */
    @JsonIgnore
    public void resetLogicName(){
        this.reset(FIELD_LOGICNAME);
    }

    /**
     * 设置 中文名称，详细说明：{@link #FIELD_LOGICNAME}
     * <P>
     * 等同 {@link #setLogicName}
     * @param logicName
     */
    @JsonIgnore
    public PSSysCounterItem logicname(String logicName){
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
    public PSSysCounterItem memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSSYSCOUNTERID</B>&nbsp;系统计数器，指定计数项所在的计数器对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCounter} 
     */
    public final static String FIELD_PSSYSCOUNTERID = "pssyscounterid";

    /**
     * 设置 系统计数器，详细说明：{@link #FIELD_PSSYSCOUNTERID}
     * 
     * @param pSSysCounterId
     * 
     */
    @JsonProperty(FIELD_PSSYSCOUNTERID)
    public void setPSSysCounterId(String pSSysCounterId){
        this.set(FIELD_PSSYSCOUNTERID, pSSysCounterId);
    }
    
    /**
     * 获取 系统计数器  
     * @return
     */
    @JsonIgnore
    public String getPSSysCounterId(){
        Object objValue = this.get(FIELD_PSSYSCOUNTERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统计数器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCounterIdDirty(){
        if(this.contains(FIELD_PSSYSCOUNTERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统计数器
     */
    @JsonIgnore
    public void resetPSSysCounterId(){
        this.reset(FIELD_PSSYSCOUNTERID);
    }

    /**
     * 设置 系统计数器，详细说明：{@link #FIELD_PSSYSCOUNTERID}
     * <P>
     * 等同 {@link #setPSSysCounterId}
     * @param pSSysCounterId
     */
    @JsonIgnore
    public PSSysCounterItem pssyscounterid(String pSSysCounterId){
        this.setPSSysCounterId(pSSysCounterId);
        return this;
    }

    /**
     * 设置 系统计数器，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCounterId}
     * @param pSSysCounter 引用对象
     */
    @JsonIgnore
    public PSSysCounterItem pssyscounterid(PSSysCounter pSSysCounter){
        if(pSSysCounter == null){
            this.setPSSysCounterId(null);
            this.setPSSysCounterName(null);
        }
        else{
            this.setPSSysCounterId(pSSysCounter.getPSSysCounterId());
            this.setPSSysCounterName(pSSysCounter.getPSSysCounterName());
        }
        return this;
    }

    /**
     * <B>PSSYSCOUNTERITEMID</B>&nbsp;系统计数器项标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSCOUNTERITEMID = "pssyscounteritemid";

    /**
     * 设置 系统计数器项标识
     * 
     * @param pSSysCounterItemId
     * 
     */
    @JsonProperty(FIELD_PSSYSCOUNTERITEMID)
    public void setPSSysCounterItemId(String pSSysCounterItemId){
        this.set(FIELD_PSSYSCOUNTERITEMID, pSSysCounterItemId);
    }
    
    /**
     * 获取 系统计数器项标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysCounterItemId(){
        Object objValue = this.get(FIELD_PSSYSCOUNTERITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统计数器项标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCounterItemIdDirty(){
        if(this.contains(FIELD_PSSYSCOUNTERITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统计数器项标识
     */
    @JsonIgnore
    public void resetPSSysCounterItemId(){
        this.reset(FIELD_PSSYSCOUNTERITEMID);
    }

    /**
     * 设置 系统计数器项标识
     * <P>
     * 等同 {@link #setPSSysCounterItemId}
     * @param pSSysCounterItemId
     */
    @JsonIgnore
    public PSSysCounterItem pssyscounteritemid(String pSSysCounterItemId){
        this.setPSSysCounterItemId(pSSysCounterItemId);
        return this;
    }

    /**
     * <B>PSSYSCOUNTERITEMNAME</B>&nbsp;计数项标识，指定计数项的标识，需在所在计数器中具备唯一性
     * <P>
     * 字符串：最大长度 200，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSSYSCOUNTERITEMNAME = "pssyscounteritemname";

    /**
     * 设置 计数项标识，详细说明：{@link #FIELD_PSSYSCOUNTERITEMNAME}
     * 
     * @param pSSysCounterItemName
     * 
     */
    @JsonProperty(FIELD_PSSYSCOUNTERITEMNAME)
    public void setPSSysCounterItemName(String pSSysCounterItemName){
        this.set(FIELD_PSSYSCOUNTERITEMNAME, pSSysCounterItemName);
    }
    
    /**
     * 获取 计数项标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysCounterItemName(){
        Object objValue = this.get(FIELD_PSSYSCOUNTERITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 计数项标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCounterItemNameDirty(){
        if(this.contains(FIELD_PSSYSCOUNTERITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 计数项标识
     */
    @JsonIgnore
    public void resetPSSysCounterItemName(){
        this.reset(FIELD_PSSYSCOUNTERITEMNAME);
    }

    /**
     * 设置 计数项标识，详细说明：{@link #FIELD_PSSYSCOUNTERITEMNAME}
     * <P>
     * 等同 {@link #setPSSysCounterItemName}
     * @param pSSysCounterItemName
     */
    @JsonIgnore
    public PSSysCounterItem pssyscounteritemname(String pSSysCounterItemName){
        this.setPSSysCounterItemName(pSSysCounterItemName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysCounterItemName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysCounterItemName(strName);
    }

    @JsonIgnore
    public PSSysCounterItem name(String strName){
        this.setPSSysCounterItemName(strName);
        return this;
    }

    /**
     * <B>PSSYSCOUNTERNAME</B>&nbsp;系统计数器，指定计数项所在的计数器对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSCOUNTERID}
     */
    public final static String FIELD_PSSYSCOUNTERNAME = "pssyscountername";

    /**
     * 设置 系统计数器，详细说明：{@link #FIELD_PSSYSCOUNTERNAME}
     * 
     * @param pSSysCounterName
     * 
     */
    @JsonProperty(FIELD_PSSYSCOUNTERNAME)
    public void setPSSysCounterName(String pSSysCounterName){
        this.set(FIELD_PSSYSCOUNTERNAME, pSSysCounterName);
    }
    
    /**
     * 获取 系统计数器  
     * @return
     */
    @JsonIgnore
    public String getPSSysCounterName(){
        Object objValue = this.get(FIELD_PSSYSCOUNTERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统计数器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCounterNameDirty(){
        if(this.contains(FIELD_PSSYSCOUNTERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统计数器
     */
    @JsonIgnore
    public void resetPSSysCounterName(){
        this.reset(FIELD_PSSYSCOUNTERNAME);
    }

    /**
     * 设置 系统计数器，详细说明：{@link #FIELD_PSSYSCOUNTERNAME}
     * <P>
     * 等同 {@link #setPSSysCounterName}
     * @param pSSysCounterName
     */
    @JsonIgnore
    public PSSysCounterItem pssyscountername(String pSSysCounterName){
        this.setPSSysCounterName(pSSysCounterName);
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
    public PSSysCounterItem updatedate(String updateDate){
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
    public PSSysCounterItem updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysCounterItemId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysCounterItemId(strValue);
    }

    @JsonIgnore
    public PSSysCounterItem id(String strValue){
        this.setPSSysCounterItemId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysCounterItem){
            PSSysCounterItem model = (PSSysCounterItem)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
