package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSSYSCALENDARITEMRV</B>系统日历项相关视图 模型传输对象
 * <P>
 * 
 */
public class PSSysCalendarItemRV extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysCalendarItemRV(){
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
    public PSSysCalendarItemRV createdate(String createDate){
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
    public PSSysCalendarItemRV createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>MEMO</B>&nbsp;备注
     * <P>
     * 字符串：最大长度 4000
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
    public PSSysCalendarItemRV memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSDEVIEWBASEID</B>&nbsp;实体视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_PSDEVIEWBASEID = "psdeviewbaseid";

    /**
     * 设置 实体视图
     * 
     * @param pSDEViewBaseId
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWBASEID)
    public void setPSDEViewBaseId(String pSDEViewBaseId){
        this.set(FIELD_PSDEVIEWBASEID, pSDEViewBaseId);
    }
    
    /**
     * 获取 实体视图  
     * @return
     */
    @JsonIgnore
    public String getPSDEViewBaseId(){
        Object objValue = this.get(FIELD_PSDEVIEWBASEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEViewBaseIdDirty(){
        if(this.contains(FIELD_PSDEVIEWBASEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体视图
     */
    @JsonIgnore
    public void resetPSDEViewBaseId(){
        this.reset(FIELD_PSDEVIEWBASEID);
    }

    /**
     * 设置 实体视图
     * <P>
     * 等同 {@link #setPSDEViewBaseId}
     * @param pSDEViewBaseId
     */
    @JsonIgnore
    public PSSysCalendarItemRV psdeviewbaseid(String pSDEViewBaseId){
        this.setPSDEViewBaseId(pSDEViewBaseId);
        return this;
    }

    /**
     * 设置 实体视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEViewBaseId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSSysCalendarItemRV psdeviewbaseid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setPSDEViewBaseId(null);
            this.setPSDEViewBaseName(null);
        }
        else{
            this.setPSDEViewBaseId(pSDEViewBase.getPSDEViewBaseId());
            this.setPSDEViewBaseName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>PSDEVIEWBASENAME</B>&nbsp;实体视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVIEWBASEID}
     */
    public final static String FIELD_PSDEVIEWBASENAME = "psdeviewbasename";

    /**
     * 设置 实体视图
     * 
     * @param pSDEViewBaseName
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWBASENAME)
    public void setPSDEViewBaseName(String pSDEViewBaseName){
        this.set(FIELD_PSDEVIEWBASENAME, pSDEViewBaseName);
    }
    
    /**
     * 获取 实体视图  
     * @return
     */
    @JsonIgnore
    public String getPSDEViewBaseName(){
        Object objValue = this.get(FIELD_PSDEVIEWBASENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEViewBaseNameDirty(){
        if(this.contains(FIELD_PSDEVIEWBASENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体视图
     */
    @JsonIgnore
    public void resetPSDEViewBaseName(){
        this.reset(FIELD_PSDEVIEWBASENAME);
    }

    /**
     * 设置 实体视图
     * <P>
     * 等同 {@link #setPSDEViewBaseName}
     * @param pSDEViewBaseName
     */
    @JsonIgnore
    public PSSysCalendarItemRV psdeviewbasename(String pSDEViewBaseName){
        this.setPSDEViewBaseName(pSDEViewBaseName);
        return this;
    }

    /**
     * <B>PSSYSCALENDARID</B>&nbsp;系统日历部件标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSCALENDARITEMID}
     */
    public final static String FIELD_PSSYSCALENDARID = "pssyscalendarid";

    /**
     * 设置 系统日历部件标识
     * 
     * @param pSSysCalendarId
     * 
     */
    @JsonProperty(FIELD_PSSYSCALENDARID)
    public void setPSSysCalendarId(String pSSysCalendarId){
        this.set(FIELD_PSSYSCALENDARID, pSSysCalendarId);
    }
    
    /**
     * 获取 系统日历部件标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysCalendarId(){
        Object objValue = this.get(FIELD_PSSYSCALENDARID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统日历部件标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCalendarIdDirty(){
        if(this.contains(FIELD_PSSYSCALENDARID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统日历部件标识
     */
    @JsonIgnore
    public void resetPSSysCalendarId(){
        this.reset(FIELD_PSSYSCALENDARID);
    }

    /**
     * 设置 系统日历部件标识
     * <P>
     * 等同 {@link #setPSSysCalendarId}
     * @param pSSysCalendarId
     */
    @JsonIgnore
    public PSSysCalendarItemRV pssyscalendarid(String pSSysCalendarId){
        this.setPSSysCalendarId(pSSysCalendarId);
        return this;
    }

    /**
     * <B>PSSYSCALENDARITEMID</B>&nbsp;日历项
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCalendarItem} 
     */
    public final static String FIELD_PSSYSCALENDARITEMID = "pssyscalendaritemid";

    /**
     * 设置 日历项
     * 
     * @param pSSysCalendarItemId
     * 
     */
    @JsonProperty(FIELD_PSSYSCALENDARITEMID)
    public void setPSSysCalendarItemId(String pSSysCalendarItemId){
        this.set(FIELD_PSSYSCALENDARITEMID, pSSysCalendarItemId);
    }
    
    /**
     * 获取 日历项  
     * @return
     */
    @JsonIgnore
    public String getPSSysCalendarItemId(){
        Object objValue = this.get(FIELD_PSSYSCALENDARITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 日历项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCalendarItemIdDirty(){
        if(this.contains(FIELD_PSSYSCALENDARITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 日历项
     */
    @JsonIgnore
    public void resetPSSysCalendarItemId(){
        this.reset(FIELD_PSSYSCALENDARITEMID);
    }

    /**
     * 设置 日历项
     * <P>
     * 等同 {@link #setPSSysCalendarItemId}
     * @param pSSysCalendarItemId
     */
    @JsonIgnore
    public PSSysCalendarItemRV pssyscalendaritemid(String pSSysCalendarItemId){
        this.setPSSysCalendarItemId(pSSysCalendarItemId);
        return this;
    }

    /**
     * 设置 日历项，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCalendarItemId}
     * @param pSSysCalendarItem 引用对象
     */
    @JsonIgnore
    public PSSysCalendarItemRV pssyscalendaritemid(PSSysCalendarItem pSSysCalendarItem){
        if(pSSysCalendarItem == null){
            this.setPSSysCalendarId(null);
            this.setPSSysCalendarItemId(null);
            this.setPSSysCalendarItemName(null);
        }
        else{
            this.setPSSysCalendarId(pSSysCalendarItem.getPSSysCalendarId());
            this.setPSSysCalendarItemId(pSSysCalendarItem.getPSSysCalendarItemId());
            this.setPSSysCalendarItemName(pSSysCalendarItem.getPSSysCalendarItemName());
        }
        return this;
    }

    /**
     * <B>PSSYSCALENDARITEMNAME</B>&nbsp;日历项
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSCALENDARITEMID}
     */
    public final static String FIELD_PSSYSCALENDARITEMNAME = "pssyscalendaritemname";

    /**
     * 设置 日历项
     * 
     * @param pSSysCalendarItemName
     * 
     */
    @JsonProperty(FIELD_PSSYSCALENDARITEMNAME)
    public void setPSSysCalendarItemName(String pSSysCalendarItemName){
        this.set(FIELD_PSSYSCALENDARITEMNAME, pSSysCalendarItemName);
    }
    
    /**
     * 获取 日历项  
     * @return
     */
    @JsonIgnore
    public String getPSSysCalendarItemName(){
        Object objValue = this.get(FIELD_PSSYSCALENDARITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 日历项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCalendarItemNameDirty(){
        if(this.contains(FIELD_PSSYSCALENDARITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 日历项
     */
    @JsonIgnore
    public void resetPSSysCalendarItemName(){
        this.reset(FIELD_PSSYSCALENDARITEMNAME);
    }

    /**
     * 设置 日历项
     * <P>
     * 等同 {@link #setPSSysCalendarItemName}
     * @param pSSysCalendarItemName
     */
    @JsonIgnore
    public PSSysCalendarItemRV pssyscalendaritemname(String pSSysCalendarItemName){
        this.setPSSysCalendarItemName(pSSysCalendarItemName);
        return this;
    }

    /**
     * <B>PSSYSCALENDARITEMRVID</B>&nbsp;系统日历项相关视图标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSCALENDARITEMRVID = "pssyscalendaritemrvid";

    /**
     * 设置 系统日历项相关视图标识
     * 
     * @param pSSysCalendarItemRVId
     * 
     */
    @JsonProperty(FIELD_PSSYSCALENDARITEMRVID)
    public void setPSSysCalendarItemRVId(String pSSysCalendarItemRVId){
        this.set(FIELD_PSSYSCALENDARITEMRVID, pSSysCalendarItemRVId);
    }
    
    /**
     * 获取 系统日历项相关视图标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysCalendarItemRVId(){
        Object objValue = this.get(FIELD_PSSYSCALENDARITEMRVID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统日历项相关视图标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCalendarItemRVIdDirty(){
        if(this.contains(FIELD_PSSYSCALENDARITEMRVID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统日历项相关视图标识
     */
    @JsonIgnore
    public void resetPSSysCalendarItemRVId(){
        this.reset(FIELD_PSSYSCALENDARITEMRVID);
    }

    /**
     * 设置 系统日历项相关视图标识
     * <P>
     * 等同 {@link #setPSSysCalendarItemRVId}
     * @param pSSysCalendarItemRVId
     */
    @JsonIgnore
    public PSSysCalendarItemRV pssyscalendaritemrvid(String pSSysCalendarItemRVId){
        this.setPSSysCalendarItemRVId(pSSysCalendarItemRVId);
        return this;
    }

    /**
     * <B>PSSYSCALENDARITEMRVNAME</B>&nbsp;引用模式
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_PSSYSCALENDARITEMRVNAME = "pssyscalendaritemrvname";

    /**
     * 设置 引用模式
     * 
     * @param pSSysCalendarItemRVName
     * 
     */
    @JsonProperty(FIELD_PSSYSCALENDARITEMRVNAME)
    public void setPSSysCalendarItemRVName(String pSSysCalendarItemRVName){
        this.set(FIELD_PSSYSCALENDARITEMRVNAME, pSSysCalendarItemRVName);
    }
    
    /**
     * 获取 引用模式  
     * @return
     */
    @JsonIgnore
    public String getPSSysCalendarItemRVName(){
        Object objValue = this.get(FIELD_PSSYSCALENDARITEMRVNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCalendarItemRVNameDirty(){
        if(this.contains(FIELD_PSSYSCALENDARITEMRVNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用模式
     */
    @JsonIgnore
    public void resetPSSysCalendarItemRVName(){
        this.reset(FIELD_PSSYSCALENDARITEMRVNAME);
    }

    /**
     * 设置 引用模式
     * <P>
     * 等同 {@link #setPSSysCalendarItemRVName}
     * @param pSSysCalendarItemRVName
     */
    @JsonIgnore
    public PSSysCalendarItemRV pssyscalendaritemrvname(String pSSysCalendarItemRVName){
        this.setPSSysCalendarItemRVName(pSSysCalendarItemRVName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysCalendarItemRVName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysCalendarItemRVName(strName);
    }

    @JsonIgnore
    public PSSysCalendarItemRV name(String strName){
        this.setPSSysCalendarItemRVName(strName);
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
    public PSSysCalendarItemRV updatedate(String updateDate){
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
    public PSSysCalendarItemRV updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>VIEWPARAMS</B>&nbsp;视图参数
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_VIEWPARAMS = "viewparams";

    /**
     * 设置 视图参数
     * 
     * @param viewParams
     * 
     */
    @JsonProperty(FIELD_VIEWPARAMS)
    public void setViewParams(String viewParams){
        this.set(FIELD_VIEWPARAMS, viewParams);
    }
    
    /**
     * 获取 视图参数  
     * @return
     */
    @JsonIgnore
    public String getViewParams(){
        Object objValue = this.get(FIELD_VIEWPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewParamsDirty(){
        if(this.contains(FIELD_VIEWPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图参数
     */
    @JsonIgnore
    public void resetViewParams(){
        this.reset(FIELD_VIEWPARAMS);
    }

    /**
     * 设置 视图参数
     * <P>
     * 等同 {@link #setViewParams}
     * @param viewParams
     */
    @JsonIgnore
    public PSSysCalendarItemRV viewparams(String viewParams){
        this.setViewParams(viewParams);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysCalendarItemRVId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysCalendarItemRVId(strValue);
    }

    @JsonIgnore
    public PSSysCalendarItemRV id(String strValue){
        this.setPSSysCalendarItemRVId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysCalendarItemRV){
            PSSysCalendarItemRV model = (PSSysCalendarItemRV)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
