package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSMODELFOLDERITEM</B>系统模型目录成员 模型传输对象
 * <P>
 * 
 */
public class PSSysModelFolderItem extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysModelFolderItem(){
    }      

    /**
     * <B>ALLUSERFLAG</B>&nbsp;全部用户
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ALLUSERFLAG = "alluserflag";

    /**
     * 设置 全部用户
     * 
     * @param allUserFlag
     * 
     */
    @JsonProperty(FIELD_ALLUSERFLAG)
    public void setAllUserFlag(Integer allUserFlag){
        this.set(FIELD_ALLUSERFLAG, allUserFlag);
    }
    
    /**
     * 获取 全部用户  
     * @return
     */
    @JsonIgnore
    public Integer getAllUserFlag(){
        Object objValue = this.get(FIELD_ALLUSERFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 全部用户 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAllUserFlagDirty(){
        if(this.contains(FIELD_ALLUSERFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 全部用户
     */
    @JsonIgnore
    public void resetAllUserFlag(){
        this.reset(FIELD_ALLUSERFLAG);
    }

    /**
     * 设置 全部用户
     * <P>
     * 等同 {@link #setAllUserFlag}
     * @param allUserFlag
     */
    @JsonIgnore
    public PSSysModelFolderItem alluserflag(Integer allUserFlag){
        this.setAllUserFlag(allUserFlag);
        return this;
    }

     /**
     * 设置 全部用户
     * <P>
     * 等同 {@link #setAllUserFlag}
     * @param allUserFlag
     */
    @JsonIgnore
    public PSSysModelFolderItem alluserflag(Boolean allUserFlag){
        if(allUserFlag == null){
            this.setAllUserFlag(null);
        }
        else{
            this.setAllUserFlag(allUserFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
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
    public PSSysModelFolderItem createdate(String createDate){
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
    public PSSysModelFolderItem createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DATA</B>&nbsp;数据
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_DATA = "data";

    /**
     * 设置 数据
     * 
     * @param data
     * 
     */
    @JsonProperty(FIELD_DATA)
    public void setData(String data){
        this.set(FIELD_DATA, data);
    }
    
    /**
     * 获取 数据  
     * @return
     */
    @JsonIgnore
    public String getData(){
        Object objValue = this.get(FIELD_DATA);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDataDirty(){
        if(this.contains(FIELD_DATA)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据
     */
    @JsonIgnore
    public void resetData(){
        this.reset(FIELD_DATA);
    }

    /**
     * 设置 数据
     * <P>
     * 等同 {@link #setData}
     * @param data
     */
    @JsonIgnore
    public PSSysModelFolderItem data(String data){
        this.setData(data);
        return this;
    }

    /**
     * <B>ICONCLS</B>&nbsp;图标样式表
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_ICONCLS = "iconcls";

    /**
     * 设置 图标样式表
     * 
     * @param iconCls
     * 
     */
    @JsonProperty(FIELD_ICONCLS)
    public void setIconCls(String iconCls){
        this.set(FIELD_ICONCLS, iconCls);
    }
    
    /**
     * 获取 图标样式表  
     * @return
     */
    @JsonIgnore
    public String getIconCls(){
        Object objValue = this.get(FIELD_ICONCLS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 图标样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIconClsDirty(){
        if(this.contains(FIELD_ICONCLS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图标样式表
     */
    @JsonIgnore
    public void resetIconCls(){
        this.reset(FIELD_ICONCLS);
    }

    /**
     * 设置 图标样式表
     * <P>
     * 等同 {@link #setIconCls}
     * @param iconCls
     */
    @JsonIgnore
    public PSSysModelFolderItem iconcls(String iconCls){
        this.setIconCls(iconCls);
        return this;
    }

    /**
     * <B>ITEMPARAM</B>&nbsp;成员参数
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_ITEMPARAM = "itemparam";

    /**
     * 设置 成员参数
     * 
     * @param itemParam
     * 
     */
    @JsonProperty(FIELD_ITEMPARAM)
    public void setItemParam(String itemParam){
        this.set(FIELD_ITEMPARAM, itemParam);
    }
    
    /**
     * 获取 成员参数  
     * @return
     */
    @JsonIgnore
    public String getItemParam(){
        Object objValue = this.get(FIELD_ITEMPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 成员参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemParamDirty(){
        if(this.contains(FIELD_ITEMPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 成员参数
     */
    @JsonIgnore
    public void resetItemParam(){
        this.reset(FIELD_ITEMPARAM);
    }

    /**
     * 设置 成员参数
     * <P>
     * 等同 {@link #setItemParam}
     * @param itemParam
     */
    @JsonIgnore
    public PSSysModelFolderItem itemparam(String itemParam){
        this.setItemParam(itemParam);
        return this;
    }

    /**
     * <B>ITEMPARAM2</B>&nbsp;成员参数2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_ITEMPARAM2 = "itemparam2";

    /**
     * 设置 成员参数2
     * 
     * @param itemParam2
     * 
     */
    @JsonProperty(FIELD_ITEMPARAM2)
    public void setItemParam2(String itemParam2){
        this.set(FIELD_ITEMPARAM2, itemParam2);
    }
    
    /**
     * 获取 成员参数2  
     * @return
     */
    @JsonIgnore
    public String getItemParam2(){
        Object objValue = this.get(FIELD_ITEMPARAM2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 成员参数2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemParam2Dirty(){
        if(this.contains(FIELD_ITEMPARAM2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 成员参数2
     */
    @JsonIgnore
    public void resetItemParam2(){
        this.reset(FIELD_ITEMPARAM2);
    }

    /**
     * 设置 成员参数2
     * <P>
     * 等同 {@link #setItemParam2}
     * @param itemParam2
     */
    @JsonIgnore
    public PSSysModelFolderItem itemparam2(String itemParam2){
        this.setItemParam2(itemParam2);
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
    public PSSysModelFolderItem memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;显示次序
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 显示次序
     * 
     * @param orderValue
     * 
     */
    @JsonProperty(FIELD_ORDERVALUE)
    public void setOrderValue(Integer orderValue){
        this.set(FIELD_ORDERVALUE, orderValue);
    }
    
    /**
     * 获取 显示次序  
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
     * 判断 显示次序 是否指定值，包括空值
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
     * 重置 显示次序
     */
    @JsonIgnore
    public void resetOrderValue(){
        this.reset(FIELD_ORDERVALUE);
    }

    /**
     * 设置 显示次序
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSSysModelFolderItem ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSOBJID</B>&nbsp;对象标识
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_PSOBJID = "psobjid";

    /**
     * 设置 对象标识
     * 
     * @param pSObjId
     * 
     */
    @JsonProperty(FIELD_PSOBJID)
    public void setPSObjId(String pSObjId){
        this.set(FIELD_PSOBJID, pSObjId);
    }
    
    /**
     * 获取 对象标识  
     * @return
     */
    @JsonIgnore
    public String getPSObjId(){
        Object objValue = this.get(FIELD_PSOBJID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 对象标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSObjIdDirty(){
        if(this.contains(FIELD_PSOBJID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 对象标识
     */
    @JsonIgnore
    public void resetPSObjId(){
        this.reset(FIELD_PSOBJID);
    }

    /**
     * 设置 对象标识
     * <P>
     * 等同 {@link #setPSObjId}
     * @param pSObjId
     */
    @JsonIgnore
    public PSSysModelFolderItem psobjid(String pSObjId){
        this.setPSObjId(pSObjId);
        return this;
    }

    /**
     * <B>PSOBJNAME</B>&nbsp;对象名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSOBJNAME = "psobjname";

    /**
     * 设置 对象名称
     * 
     * @param pSObjName
     * 
     */
    @JsonProperty(FIELD_PSOBJNAME)
    public void setPSObjName(String pSObjName){
        this.set(FIELD_PSOBJNAME, pSObjName);
    }
    
    /**
     * 获取 对象名称  
     * @return
     */
    @JsonIgnore
    public String getPSObjName(){
        Object objValue = this.get(FIELD_PSOBJNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 对象名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSObjNameDirty(){
        if(this.contains(FIELD_PSOBJNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 对象名称
     */
    @JsonIgnore
    public void resetPSObjName(){
        this.reset(FIELD_PSOBJNAME);
    }

    /**
     * 设置 对象名称
     * <P>
     * 等同 {@link #setPSObjName}
     * @param pSObjName
     */
    @JsonIgnore
    public PSSysModelFolderItem psobjname(String pSObjName){
        this.setPSObjName(pSObjName);
        return this;
    }

    /**
     * <B>PSOBJTYPE</B>&nbsp;成员类型
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_PSOBJTYPE = "psobjtype";

    /**
     * 设置 成员类型
     * 
     * @param pSObjType
     * 
     */
    @JsonProperty(FIELD_PSOBJTYPE)
    public void setPSObjType(String pSObjType){
        this.set(FIELD_PSOBJTYPE, pSObjType);
    }
    
    /**
     * 获取 成员类型  
     * @return
     */
    @JsonIgnore
    public String getPSObjType(){
        Object objValue = this.get(FIELD_PSOBJTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 成员类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSObjTypeDirty(){
        if(this.contains(FIELD_PSOBJTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 成员类型
     */
    @JsonIgnore
    public void resetPSObjType(){
        this.reset(FIELD_PSOBJTYPE);
    }

    /**
     * 设置 成员类型
     * <P>
     * 等同 {@link #setPSObjType}
     * @param pSObjType
     */
    @JsonIgnore
    public PSSysModelFolderItem psobjtype(String pSObjType){
        this.setPSObjType(pSObjType);
        return this;
    }

    /**
     * <B>PSOBJTYPENAME</B>&nbsp;成员类型名称
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSOBJTYPENAME = "psobjtypename";

    /**
     * 设置 成员类型名称
     * 
     * @param pSObjTypeName
     * 
     */
    @JsonProperty(FIELD_PSOBJTYPENAME)
    public void setPSObjTypeName(String pSObjTypeName){
        this.set(FIELD_PSOBJTYPENAME, pSObjTypeName);
    }
    
    /**
     * 获取 成员类型名称  
     * @return
     */
    @JsonIgnore
    public String getPSObjTypeName(){
        Object objValue = this.get(FIELD_PSOBJTYPENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 成员类型名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSObjTypeNameDirty(){
        if(this.contains(FIELD_PSOBJTYPENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 成员类型名称
     */
    @JsonIgnore
    public void resetPSObjTypeName(){
        this.reset(FIELD_PSOBJTYPENAME);
    }

    /**
     * 设置 成员类型名称
     * <P>
     * 等同 {@link #setPSObjTypeName}
     * @param pSObjTypeName
     */
    @JsonIgnore
    public PSSysModelFolderItem psobjtypename(String pSObjTypeName){
        this.setPSObjTypeName(pSObjTypeName);
        return this;
    }

    /**
     * <B>PSSYSMODELFOLDERID</B>&nbsp;模型目录
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysModelFolder} 
     */
    public final static String FIELD_PSSYSMODELFOLDERID = "pssysmodelfolderid";

    /**
     * 设置 模型目录
     * 
     * @param pSSysModelFolderId
     * 
     */
    @JsonProperty(FIELD_PSSYSMODELFOLDERID)
    public void setPSSysModelFolderId(String pSSysModelFolderId){
        this.set(FIELD_PSSYSMODELFOLDERID, pSSysModelFolderId);
    }
    
    /**
     * 获取 模型目录  
     * @return
     */
    @JsonIgnore
    public String getPSSysModelFolderId(){
        Object objValue = this.get(FIELD_PSSYSMODELFOLDERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模型目录 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysModelFolderIdDirty(){
        if(this.contains(FIELD_PSSYSMODELFOLDERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模型目录
     */
    @JsonIgnore
    public void resetPSSysModelFolderId(){
        this.reset(FIELD_PSSYSMODELFOLDERID);
    }

    /**
     * 设置 模型目录
     * <P>
     * 等同 {@link #setPSSysModelFolderId}
     * @param pSSysModelFolderId
     */
    @JsonIgnore
    public PSSysModelFolderItem pssysmodelfolderid(String pSSysModelFolderId){
        this.setPSSysModelFolderId(pSSysModelFolderId);
        return this;
    }

    /**
     * 设置 模型目录，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysModelFolderId}
     * @param pSSysModelFolder 引用对象
     */
    @JsonIgnore
    public PSSysModelFolderItem pssysmodelfolderid(PSSysModelFolder pSSysModelFolder){
        if(pSSysModelFolder == null){
            this.setPSSysModelFolderId(null);
            this.setPSSysModelFolderName(null);
        }
        else{
            this.setPSSysModelFolderId(pSSysModelFolder.getPSSysModelFolderId());
            this.setPSSysModelFolderName(pSSysModelFolder.getPSSysModelFolderName());
        }
        return this;
    }

    /**
     * <B>PSSYSMODELFOLDERITEMID</B>&nbsp;系统模型目录成员标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSMODELFOLDERITEMID = "pssysmodelfolderitemid";

    /**
     * 设置 系统模型目录成员标识
     * 
     * @param pSSysModelFolderItemId
     * 
     */
    @JsonProperty(FIELD_PSSYSMODELFOLDERITEMID)
    public void setPSSysModelFolderItemId(String pSSysModelFolderItemId){
        this.set(FIELD_PSSYSMODELFOLDERITEMID, pSSysModelFolderItemId);
    }
    
    /**
     * 获取 系统模型目录成员标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysModelFolderItemId(){
        Object objValue = this.get(FIELD_PSSYSMODELFOLDERITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统模型目录成员标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysModelFolderItemIdDirty(){
        if(this.contains(FIELD_PSSYSMODELFOLDERITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统模型目录成员标识
     */
    @JsonIgnore
    public void resetPSSysModelFolderItemId(){
        this.reset(FIELD_PSSYSMODELFOLDERITEMID);
    }

    /**
     * 设置 系统模型目录成员标识
     * <P>
     * 等同 {@link #setPSSysModelFolderItemId}
     * @param pSSysModelFolderItemId
     */
    @JsonIgnore
    public PSSysModelFolderItem pssysmodelfolderitemid(String pSSysModelFolderItemId){
        this.setPSSysModelFolderItemId(pSSysModelFolderItemId);
        return this;
    }

    /**
     * <B>PSSYSMODELFOLDERITEMNAME</B>&nbsp;名称
     * <P>
     * 字符串：最大长度 200，名称不包括路径符号
     */
    public final static String FIELD_PSSYSMODELFOLDERITEMNAME = "pssysmodelfolderitemname";

    /**
     * 设置 名称
     * 
     * @param pSSysModelFolderItemName
     * 
     */
    @JsonProperty(FIELD_PSSYSMODELFOLDERITEMNAME)
    public void setPSSysModelFolderItemName(String pSSysModelFolderItemName){
        this.set(FIELD_PSSYSMODELFOLDERITEMNAME, pSSysModelFolderItemName);
    }
    
    /**
     * 获取 名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysModelFolderItemName(){
        Object objValue = this.get(FIELD_PSSYSMODELFOLDERITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysModelFolderItemNameDirty(){
        if(this.contains(FIELD_PSSYSMODELFOLDERITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 名称
     */
    @JsonIgnore
    public void resetPSSysModelFolderItemName(){
        this.reset(FIELD_PSSYSMODELFOLDERITEMNAME);
    }

    /**
     * 设置 名称
     * <P>
     * 等同 {@link #setPSSysModelFolderItemName}
     * @param pSSysModelFolderItemName
     */
    @JsonIgnore
    public PSSysModelFolderItem pssysmodelfolderitemname(String pSSysModelFolderItemName){
        this.setPSSysModelFolderItemName(pSSysModelFolderItemName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysModelFolderItemName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysModelFolderItemName(strName);
    }

    @JsonIgnore
    public PSSysModelFolderItem name(String strName){
        this.setPSSysModelFolderItemName(strName);
        return this;
    }

    /**
     * <B>PSSYSMODELFOLDERNAME</B>&nbsp;模型目录
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSMODELFOLDERID}
     */
    public final static String FIELD_PSSYSMODELFOLDERNAME = "pssysmodelfoldername";

    /**
     * 设置 模型目录
     * 
     * @param pSSysModelFolderName
     * 
     */
    @JsonProperty(FIELD_PSSYSMODELFOLDERNAME)
    public void setPSSysModelFolderName(String pSSysModelFolderName){
        this.set(FIELD_PSSYSMODELFOLDERNAME, pSSysModelFolderName);
    }
    
    /**
     * 获取 模型目录  
     * @return
     */
    @JsonIgnore
    public String getPSSysModelFolderName(){
        Object objValue = this.get(FIELD_PSSYSMODELFOLDERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模型目录 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysModelFolderNameDirty(){
        if(this.contains(FIELD_PSSYSMODELFOLDERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模型目录
     */
    @JsonIgnore
    public void resetPSSysModelFolderName(){
        this.reset(FIELD_PSSYSMODELFOLDERNAME);
    }

    /**
     * 设置 模型目录
     * <P>
     * 等同 {@link #setPSSysModelFolderName}
     * @param pSSysModelFolderName
     */
    @JsonIgnore
    public PSSysModelFolderItem pssysmodelfoldername(String pSSysModelFolderName){
        this.setPSSysModelFolderName(pSSysModelFolderName);
        return this;
    }

    /**
     * <B>STUDIOTAG</B>&nbsp;工具标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_STUDIOTAG = "studiotag";

    /**
     * 设置 工具标记
     * 
     * @param studioTag
     * 
     */
    @JsonProperty(FIELD_STUDIOTAG)
    public void setStudioTag(String studioTag){
        this.set(FIELD_STUDIOTAG, studioTag);
    }
    
    /**
     * 获取 工具标记  
     * @return
     */
    @JsonIgnore
    public String getStudioTag(){
        Object objValue = this.get(FIELD_STUDIOTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工具标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStudioTagDirty(){
        if(this.contains(FIELD_STUDIOTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工具标记
     */
    @JsonIgnore
    public void resetStudioTag(){
        this.reset(FIELD_STUDIOTAG);
    }

    /**
     * 设置 工具标记
     * <P>
     * 等同 {@link #setStudioTag}
     * @param studioTag
     */
    @JsonIgnore
    public PSSysModelFolderItem studiotag(String studioTag){
        this.setStudioTag(studioTag);
        return this;
    }

    /**
     * <B>STUDIOTAG2</B>&nbsp;工具标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_STUDIOTAG2 = "studiotag2";

    /**
     * 设置 工具标记2
     * 
     * @param studioTag2
     * 
     */
    @JsonProperty(FIELD_STUDIOTAG2)
    public void setStudioTag2(String studioTag2){
        this.set(FIELD_STUDIOTAG2, studioTag2);
    }
    
    /**
     * 获取 工具标记2  
     * @return
     */
    @JsonIgnore
    public String getStudioTag2(){
        Object objValue = this.get(FIELD_STUDIOTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工具标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStudioTag2Dirty(){
        if(this.contains(FIELD_STUDIOTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工具标记2
     */
    @JsonIgnore
    public void resetStudioTag2(){
        this.reset(FIELD_STUDIOTAG2);
    }

    /**
     * 设置 工具标记2
     * <P>
     * 等同 {@link #setStudioTag2}
     * @param studioTag2
     */
    @JsonIgnore
    public PSSysModelFolderItem studiotag2(String studioTag2){
        this.setStudioTag2(studioTag2);
        return this;
    }

    /**
     * <B>STUDIOTYPE</B>&nbsp;工具类型
     * <P>
     * 字符串：最大长度 20
     */
    public final static String FIELD_STUDIOTYPE = "studiotype";

    /**
     * 设置 工具类型
     * 
     * @param studioType
     * 
     */
    @JsonProperty(FIELD_STUDIOTYPE)
    public void setStudioType(String studioType){
        this.set(FIELD_STUDIOTYPE, studioType);
    }
    
    /**
     * 获取 工具类型  
     * @return
     */
    @JsonIgnore
    public String getStudioType(){
        Object objValue = this.get(FIELD_STUDIOTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工具类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStudioTypeDirty(){
        if(this.contains(FIELD_STUDIOTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工具类型
     */
    @JsonIgnore
    public void resetStudioType(){
        this.reset(FIELD_STUDIOTYPE);
    }

    /**
     * 设置 工具类型
     * <P>
     * 等同 {@link #setStudioType}
     * @param studioType
     */
    @JsonIgnore
    public PSSysModelFolderItem studiotype(String studioType){
        this.setStudioType(studioType);
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
    public PSSysModelFolderItem updatedate(String updateDate){
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
    public PSSysModelFolderItem updateman(String updateMan){
        this.setUpdateMan(updateMan);
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
    public PSSysModelFolderItem usertag(String userTag){
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
    public PSSysModelFolderItem usertag2(String userTag2){
        this.setUserTag2(userTag2);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysModelFolderItemId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysModelFolderItemId(strValue);
    }

    @JsonIgnore
    public PSSysModelFolderItem id(String strValue){
        this.setPSSysModelFolderItemId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysModelFolderItem){
            PSSysModelFolderItem model = (PSSysModelFolderItem)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
