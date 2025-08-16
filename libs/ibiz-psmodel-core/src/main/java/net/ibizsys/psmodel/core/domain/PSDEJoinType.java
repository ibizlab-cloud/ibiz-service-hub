package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSDEJOINTYPE</B>云实体查询连接类型 模型传输对象
 * <P>
 * 
 */
public class PSDEJoinType extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEJoinType(){
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
    public PSDEJoinType createdate(String createDate){
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
    public PSDEJoinType createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>ICONPATH</B>&nbsp;图标路径
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_ICONPATH = "iconpath";

    /**
     * 设置 图标路径
     * 
     * @param iconPath
     * 
     */
    @JsonProperty(FIELD_ICONPATH)
    public void setIconPath(String iconPath){
        this.set(FIELD_ICONPATH, iconPath);
    }
    
    /**
     * 获取 图标路径  
     * @return
     */
    @JsonIgnore
    public String getIconPath(){
        Object objValue = this.get(FIELD_ICONPATH);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 图标路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIconPathDirty(){
        if(this.contains(FIELD_ICONPATH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图标路径
     */
    @JsonIgnore
    public void resetIconPath(){
        this.reset(FIELD_ICONPATH);
    }

    /**
     * 设置 图标路径
     * <P>
     * 等同 {@link #setIconPath}
     * @param iconPath
     */
    @JsonIgnore
    public PSDEJoinType iconpath(String iconPath){
        this.setIconPath(iconPath);
        return this;
    }

    /**
     * <B>MAINFLAG</B>&nbsp;主连接
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_MAINFLAG = "mainflag";

    /**
     * 设置 主连接
     * 
     * @param mainFlag
     * 
     */
    @JsonProperty(FIELD_MAINFLAG)
    public void setMainFlag(Integer mainFlag){
        this.set(FIELD_MAINFLAG, mainFlag);
    }
    
    /**
     * 获取 主连接  
     * @return
     */
    @JsonIgnore
    public Integer getMainFlag(){
        Object objValue = this.get(FIELD_MAINFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 主连接 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMainFlagDirty(){
        if(this.contains(FIELD_MAINFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主连接
     */
    @JsonIgnore
    public void resetMainFlag(){
        this.reset(FIELD_MAINFLAG);
    }

    /**
     * 设置 主连接
     * <P>
     * 等同 {@link #setMainFlag}
     * @param mainFlag
     */
    @JsonIgnore
    public PSDEJoinType mainflag(Integer mainFlag){
        this.setMainFlag(mainFlag);
        return this;
    }

     /**
     * 设置 主连接
     * <P>
     * 等同 {@link #setMainFlag}
     * @param mainFlag
     */
    @JsonIgnore
    public PSDEJoinType mainflag(Boolean mainFlag){
        if(mainFlag == null){
            this.setMainFlag(null);
        }
        else{
            this.setMainFlag(mainFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSDEJoinType memo(String memo){
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
    public PSDEJoinType ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSDEJOINTYPEID</B>&nbsp;连接类型标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEJOINTYPEID = "psdejointypeid";

    /**
     * 设置 连接类型标识
     * 
     * @param pSDEJoinTypeId
     * 
     */
    @JsonProperty(FIELD_PSDEJOINTYPEID)
    public void setPSDEJoinTypeId(String pSDEJoinTypeId){
        this.set(FIELD_PSDEJOINTYPEID, pSDEJoinTypeId);
    }
    
    /**
     * 获取 连接类型标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEJoinTypeId(){
        Object objValue = this.get(FIELD_PSDEJOINTYPEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 连接类型标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEJoinTypeIdDirty(){
        if(this.contains(FIELD_PSDEJOINTYPEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 连接类型标识
     */
    @JsonIgnore
    public void resetPSDEJoinTypeId(){
        this.reset(FIELD_PSDEJOINTYPEID);
    }

    /**
     * 设置 连接类型标识
     * <P>
     * 等同 {@link #setPSDEJoinTypeId}
     * @param pSDEJoinTypeId
     */
    @JsonIgnore
    public PSDEJoinType psdejointypeid(String pSDEJoinTypeId){
        this.setPSDEJoinTypeId(pSDEJoinTypeId);
        return this;
    }

    /**
     * <B>PSDEJOINTYPENAME</B>&nbsp;连接类型名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEJOINTYPENAME = "psdejointypename";

    /**
     * 设置 连接类型名称
     * 
     * @param pSDEJoinTypeName
     * 
     */
    @JsonProperty(FIELD_PSDEJOINTYPENAME)
    public void setPSDEJoinTypeName(String pSDEJoinTypeName){
        this.set(FIELD_PSDEJOINTYPENAME, pSDEJoinTypeName);
    }
    
    /**
     * 获取 连接类型名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEJoinTypeName(){
        Object objValue = this.get(FIELD_PSDEJOINTYPENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 连接类型名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEJoinTypeNameDirty(){
        if(this.contains(FIELD_PSDEJOINTYPENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 连接类型名称
     */
    @JsonIgnore
    public void resetPSDEJoinTypeName(){
        this.reset(FIELD_PSDEJOINTYPENAME);
    }

    /**
     * 设置 连接类型名称
     * <P>
     * 等同 {@link #setPSDEJoinTypeName}
     * @param pSDEJoinTypeName
     */
    @JsonIgnore
    public PSDEJoinType psdejointypename(String pSDEJoinTypeName){
        this.setPSDEJoinTypeName(pSDEJoinTypeName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEJoinTypeName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEJoinTypeName(strName);
    }

    @JsonIgnore
    public PSDEJoinType name(String strName){
        this.setPSDEJoinTypeName(strName);
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
    public PSDEJoinType updatedate(String updateDate){
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
    public PSDEJoinType updateman(String updateMan){
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
    public PSDEJoinType validflag(Integer validFlag){
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
    public PSDEJoinType validflag(Boolean validFlag){
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
        return this.getPSDEJoinTypeId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEJoinTypeId(strValue);
    }

    @JsonIgnore
    public PSDEJoinType id(String strValue){
        this.setPSDEJoinTypeId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEJoinType){
            PSDEJoinType model = (PSDEJoinType)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
