package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSDEREPITEM</B>实体报表项 模型传输对象
 * <P>
 * 实体报表项模型，为实体报表提供复合报表模型支持
 */
public class PSDERepItem extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDERepItem(){
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
    public PSDERepItem createdate(String createDate){
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
    public PSDERepItem createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>MAJORPSDEREPORTID</B>&nbsp;主实体报表，指定报表项所在的实体报表对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEReport} 
     */
    public final static String FIELD_MAJORPSDEREPORTID = "majorpsdereportid";

    /**
     * 设置 主实体报表，详细说明：{@link #FIELD_MAJORPSDEREPORTID}
     * 
     * @param majorPSDEReportId
     * 
     */
    @JsonProperty(FIELD_MAJORPSDEREPORTID)
    public void setMajorPSDEReportId(String majorPSDEReportId){
        this.set(FIELD_MAJORPSDEREPORTID, majorPSDEReportId);
    }
    
    /**
     * 获取 主实体报表  
     * @return
     */
    @JsonIgnore
    public String getMajorPSDEReportId(){
        Object objValue = this.get(FIELD_MAJORPSDEREPORTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主实体报表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMajorPSDEReportIdDirty(){
        if(this.contains(FIELD_MAJORPSDEREPORTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主实体报表
     */
    @JsonIgnore
    public void resetMajorPSDEReportId(){
        this.reset(FIELD_MAJORPSDEREPORTID);
    }

    /**
     * 设置 主实体报表，详细说明：{@link #FIELD_MAJORPSDEREPORTID}
     * <P>
     * 等同 {@link #setMajorPSDEReportId}
     * @param majorPSDEReportId
     */
    @JsonIgnore
    public PSDERepItem majorpsdereportid(String majorPSDEReportId){
        this.setMajorPSDEReportId(majorPSDEReportId);
        return this;
    }

    /**
     * 设置 主实体报表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMajorPSDEReportId}
     * @param pSDEReport 引用对象
     */
    @JsonIgnore
    public PSDERepItem majorpsdereportid(PSDEReport pSDEReport){
        if(pSDEReport == null){
            this.setMajorPSDEReportId(null);
            this.setMajorPSDEReportName(null);
            this.setPSDEId(null);
        }
        else{
            this.setMajorPSDEReportId(pSDEReport.getPSDEReportId());
            this.setMajorPSDEReportName(pSDEReport.getPSDEReportName());
            this.setPSDEId(pSDEReport.getPSDEId());
        }
        return this;
    }

    /**
     * <B>MAJORPSDEREPORTNAME</B>&nbsp;主实体报表，指定报表项所在的实体报表对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MAJORPSDEREPORTID}
     */
    public final static String FIELD_MAJORPSDEREPORTNAME = "majorpsdereportname";

    /**
     * 设置 主实体报表，详细说明：{@link #FIELD_MAJORPSDEREPORTNAME}
     * 
     * @param majorPSDEReportName
     * 
     */
    @JsonProperty(FIELD_MAJORPSDEREPORTNAME)
    public void setMajorPSDEReportName(String majorPSDEReportName){
        this.set(FIELD_MAJORPSDEREPORTNAME, majorPSDEReportName);
    }
    
    /**
     * 获取 主实体报表  
     * @return
     */
    @JsonIgnore
    public String getMajorPSDEReportName(){
        Object objValue = this.get(FIELD_MAJORPSDEREPORTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主实体报表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMajorPSDEReportNameDirty(){
        if(this.contains(FIELD_MAJORPSDEREPORTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主实体报表
     */
    @JsonIgnore
    public void resetMajorPSDEReportName(){
        this.reset(FIELD_MAJORPSDEREPORTNAME);
    }

    /**
     * 设置 主实体报表，详细说明：{@link #FIELD_MAJORPSDEREPORTNAME}
     * <P>
     * 等同 {@link #setMajorPSDEReportName}
     * @param majorPSDEReportName
     */
    @JsonIgnore
    public PSDERepItem majorpsdereportname(String majorPSDEReportName){
        this.setMajorPSDEReportName(majorPSDEReportName);
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
    public PSDERepItem memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MINORPSDEREPORTID</B>&nbsp;从实体报表，指定报表项引用的实体报表对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEReport} 
     */
    public final static String FIELD_MINORPSDEREPORTID = "minorpsdereportid";

    /**
     * 设置 从实体报表，详细说明：{@link #FIELD_MINORPSDEREPORTID}
     * 
     * @param minorPSDEReportId
     * 
     */
    @JsonProperty(FIELD_MINORPSDEREPORTID)
    public void setMinorPSDEReportId(String minorPSDEReportId){
        this.set(FIELD_MINORPSDEREPORTID, minorPSDEReportId);
    }
    
    /**
     * 获取 从实体报表  
     * @return
     */
    @JsonIgnore
    public String getMinorPSDEReportId(){
        Object objValue = this.get(FIELD_MINORPSDEREPORTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 从实体报表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinorPSDEReportIdDirty(){
        if(this.contains(FIELD_MINORPSDEREPORTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 从实体报表
     */
    @JsonIgnore
    public void resetMinorPSDEReportId(){
        this.reset(FIELD_MINORPSDEREPORTID);
    }

    /**
     * 设置 从实体报表，详细说明：{@link #FIELD_MINORPSDEREPORTID}
     * <P>
     * 等同 {@link #setMinorPSDEReportId}
     * @param minorPSDEReportId
     */
    @JsonIgnore
    public PSDERepItem minorpsdereportid(String minorPSDEReportId){
        this.setMinorPSDEReportId(minorPSDEReportId);
        return this;
    }

    /**
     * 设置 从实体报表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMinorPSDEReportId}
     * @param pSDEReport 引用对象
     */
    @JsonIgnore
    public PSDERepItem minorpsdereportid(PSDEReport pSDEReport){
        if(pSDEReport == null){
            this.setMinorPSDEReportId(null);
            this.setMinorPSDEReportName(null);
        }
        else{
            this.setMinorPSDEReportId(pSDEReport.getPSDEReportId());
            this.setMinorPSDEReportName(pSDEReport.getPSDEReportName());
        }
        return this;
    }

    /**
     * <B>MINORPSDEREPORTNAME</B>&nbsp;从实体报表，指定报表项引用的实体报表对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MINORPSDEREPORTID}
     */
    public final static String FIELD_MINORPSDEREPORTNAME = "minorpsdereportname";

    /**
     * 设置 从实体报表，详细说明：{@link #FIELD_MINORPSDEREPORTNAME}
     * 
     * @param minorPSDEReportName
     * 
     */
    @JsonProperty(FIELD_MINORPSDEREPORTNAME)
    public void setMinorPSDEReportName(String minorPSDEReportName){
        this.set(FIELD_MINORPSDEREPORTNAME, minorPSDEReportName);
    }
    
    /**
     * 获取 从实体报表  
     * @return
     */
    @JsonIgnore
    public String getMinorPSDEReportName(){
        Object objValue = this.get(FIELD_MINORPSDEREPORTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 从实体报表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinorPSDEReportNameDirty(){
        if(this.contains(FIELD_MINORPSDEREPORTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 从实体报表
     */
    @JsonIgnore
    public void resetMinorPSDEReportName(){
        this.reset(FIELD_MINORPSDEREPORTNAME);
    }

    /**
     * 设置 从实体报表，详细说明：{@link #FIELD_MINORPSDEREPORTNAME}
     * <P>
     * 等同 {@link #setMinorPSDEReportName}
     * @param minorPSDEReportName
     */
    @JsonIgnore
    public PSDERepItem minorpsdereportname(String minorPSDEReportName){
        this.setMinorPSDEReportName(minorPSDEReportName);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;排序值，指定报表项引用的次序
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 排序值，详细说明：{@link #FIELD_ORDERVALUE}
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
     * 设置 排序值，详细说明：{@link #FIELD_ORDERVALUE}
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSDERepItem ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;PSDEID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MAJORPSDEREPORTID}
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 PSDEID
     * 
     * @param pSDEId
     * 
     */
    @JsonProperty(FIELD_PSDEID)
    public void setPSDEId(String pSDEId){
        this.set(FIELD_PSDEID, pSDEId);
    }
    
    /**
     * 获取 PSDEID  
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
     * 判断 PSDEID 是否指定值，包括空值
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
     * 重置 PSDEID
     */
    @JsonIgnore
    public void resetPSDEId(){
        this.reset(FIELD_PSDEID);
    }

    /**
     * 设置 PSDEID
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSDERepItem psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * <B>PSDEREPITEMID</B>&nbsp;实体报表项标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEREPITEMID = "psderepitemid";

    /**
     * 设置 实体报表项标识
     * 
     * @param pSDERepItemId
     * 
     */
    @JsonProperty(FIELD_PSDEREPITEMID)
    public void setPSDERepItemId(String pSDERepItemId){
        this.set(FIELD_PSDEREPITEMID, pSDERepItemId);
    }
    
    /**
     * 获取 实体报表项标识  
     * @return
     */
    @JsonIgnore
    public String getPSDERepItemId(){
        Object objValue = this.get(FIELD_PSDEREPITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体报表项标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDERepItemIdDirty(){
        if(this.contains(FIELD_PSDEREPITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体报表项标识
     */
    @JsonIgnore
    public void resetPSDERepItemId(){
        this.reset(FIELD_PSDEREPITEMID);
    }

    /**
     * 设置 实体报表项标识
     * <P>
     * 等同 {@link #setPSDERepItemId}
     * @param pSDERepItemId
     */
    @JsonIgnore
    public PSDERepItem psderepitemid(String pSDERepItemId){
        this.setPSDERepItemId(pSDERepItemId);
        return this;
    }

    /**
     * <B>PSDEREPITEMNAME</B>&nbsp;报表项标识，指定报表项的标识，需在主报表中具备唯一性
     * <P>
     * 字符串：最大长度 200，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSDEREPITEMNAME = "psderepitemname";

    /**
     * 设置 报表项标识，详细说明：{@link #FIELD_PSDEREPITEMNAME}
     * 
     * @param pSDERepItemName
     * 
     */
    @JsonProperty(FIELD_PSDEREPITEMNAME)
    public void setPSDERepItemName(String pSDERepItemName){
        this.set(FIELD_PSDEREPITEMNAME, pSDERepItemName);
    }
    
    /**
     * 获取 报表项标识  
     * @return
     */
    @JsonIgnore
    public String getPSDERepItemName(){
        Object objValue = this.get(FIELD_PSDEREPITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 报表项标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDERepItemNameDirty(){
        if(this.contains(FIELD_PSDEREPITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 报表项标识
     */
    @JsonIgnore
    public void resetPSDERepItemName(){
        this.reset(FIELD_PSDEREPITEMNAME);
    }

    /**
     * 设置 报表项标识，详细说明：{@link #FIELD_PSDEREPITEMNAME}
     * <P>
     * 等同 {@link #setPSDERepItemName}
     * @param pSDERepItemName
     */
    @JsonIgnore
    public PSDERepItem psderepitemname(String pSDERepItemName){
        this.setPSDERepItemName(pSDERepItemName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDERepItemName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDERepItemName(strName);
    }

    @JsonIgnore
    public PSDERepItem name(String strName){
        this.setPSDERepItemName(strName);
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
    public PSDERepItem updatedate(String updateDate){
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
    public PSDERepItem updateman(String updateMan){
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
    public PSDERepItem usercat(String userCat){
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
    public PSDERepItem usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDERepItem usertag(String userTag){
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
    public PSDERepItem usertag2(String userTag2){
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
    public PSDERepItem usertag3(String userTag3){
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
    public PSDERepItem usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDERepItemId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDERepItemId(strValue);
    }

    @JsonIgnore
    public PSDERepItem id(String strValue){
        this.setPSDERepItemId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDERepItem){
            PSDERepItem model = (PSDERepItem)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
