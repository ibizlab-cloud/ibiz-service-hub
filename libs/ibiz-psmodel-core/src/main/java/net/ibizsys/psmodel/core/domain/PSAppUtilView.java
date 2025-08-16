package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSAPPUTILVIEW</B>应用功能视图 模型传输对象
 * <P>
 * 应用功能视图模型，定义应用的预置功能视图
 */
public class PSAppUtilView extends PSAppView {

    public PSAppUtilView(){
        this.setPSAppViewType("APPUTILVIEW");
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
    public PSAppUtilView createdate(String createDate){
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
    public PSAppUtilView createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>ERRCODE</B>&nbsp;错误代码
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_ERRCODE = "errcode";

    /**
     * 设置 错误代码
     * 
     * @param errCode
     * 
     */
    @JsonProperty(FIELD_ERRCODE)
    public void setErrCode(String errCode){
        this.set(FIELD_ERRCODE, errCode);
    }
    
    /**
     * 获取 错误代码  
     * @return
     */
    @JsonIgnore
    public String getErrCode(){
        Object objValue = this.get(FIELD_ERRCODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 错误代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isErrCodeDirty(){
        if(this.contains(FIELD_ERRCODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 错误代码
     */
    @JsonIgnore
    public void resetErrCode(){
        this.reset(FIELD_ERRCODE);
    }

    /**
     * 设置 错误代码
     * <P>
     * 等同 {@link #setErrCode}
     * @param errCode
     */
    @JsonIgnore
    public PSAppUtilView errcode(String errCode){
        this.setErrCode(errCode);
        return this;
    }

    /**
     * <B>PSAPPMENUID</B>&nbsp;源应用菜单
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSAppMenu} 
     */
    public final static String FIELD_PSAPPMENUID = "psappmenuid";

    /**
     * 设置 源应用菜单
     * 
     * @param pSAppMenuId
     * 
     */
    @JsonProperty(FIELD_PSAPPMENUID)
    public void setPSAppMenuId(String pSAppMenuId){
        this.set(FIELD_PSAPPMENUID, pSAppMenuId);
    }
    
    /**
     * 获取 源应用菜单  
     * @return
     */
    @JsonIgnore
    public String getPSAppMenuId(){
        Object objValue = this.get(FIELD_PSAPPMENUID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 源应用菜单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppMenuIdDirty(){
        if(this.contains(FIELD_PSAPPMENUID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 源应用菜单
     */
    @JsonIgnore
    public void resetPSAppMenuId(){
        this.reset(FIELD_PSAPPMENUID);
    }

    /**
     * 设置 源应用菜单
     * <P>
     * 等同 {@link #setPSAppMenuId}
     * @param pSAppMenuId
     */
    @JsonIgnore
    public PSAppUtilView psappmenuid(String pSAppMenuId){
        this.setPSAppMenuId(pSAppMenuId);
        return this;
    }

    /**
     * 设置 源应用菜单，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSAppMenuId}
     * @param pSAppMenu 引用对象
     */
    @JsonIgnore
    public PSAppUtilView psappmenuid(PSAppMenu pSAppMenu){
        if(pSAppMenu == null){
            this.setPSAppMenuId(null);
            this.setPSAppMenuName(null);
        }
        else{
            this.setPSAppMenuId(pSAppMenu.getPSAppMenuId());
            this.setPSAppMenuName(pSAppMenu.getPSAppMenuName());
        }
        return this;
    }

    /**
     * <B>PSAPPMENUNAME</B>&nbsp;源应用菜单
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSAPPMENUID}
     */
    public final static String FIELD_PSAPPMENUNAME = "psappmenuname";

    /**
     * 设置 源应用菜单
     * 
     * @param pSAppMenuName
     * 
     */
    @JsonProperty(FIELD_PSAPPMENUNAME)
    public void setPSAppMenuName(String pSAppMenuName){
        this.set(FIELD_PSAPPMENUNAME, pSAppMenuName);
    }
    
    /**
     * 获取 源应用菜单  
     * @return
     */
    @JsonIgnore
    public String getPSAppMenuName(){
        Object objValue = this.get(FIELD_PSAPPMENUNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 源应用菜单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppMenuNameDirty(){
        if(this.contains(FIELD_PSAPPMENUNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 源应用菜单
     */
    @JsonIgnore
    public void resetPSAppMenuName(){
        this.reset(FIELD_PSAPPMENUNAME);
    }

    /**
     * 设置 源应用菜单
     * <P>
     * 等同 {@link #setPSAppMenuName}
     * @param pSAppMenuName
     */
    @JsonIgnore
    public PSAppUtilView psappmenuname(String pSAppMenuName){
        this.setPSAppMenuName(pSAppMenuName);
        return this;
    }

    /**
     * <B>PSAPPUTILVIEWID</B>&nbsp;应用功能视图标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSAPPUTILVIEWID = "psapputilviewid";

    /**
     * 设置 应用功能视图标识
     * 
     * @param pSAppUtilViewId
     * 
     */
    @JsonProperty(FIELD_PSAPPUTILVIEWID)
    public void setPSAppUtilViewId(String pSAppUtilViewId){
        this.set(FIELD_PSAPPUTILVIEWID, pSAppUtilViewId);
        this.set(FIELD_PSAPPVIEWID, pSAppUtilViewId);        
    }
    
    /**
     * 获取 应用功能视图标识  
     * @return
     */
    @JsonIgnore
    public String getPSAppUtilViewId(){
        Object objValue = this.get(FIELD_PSAPPUTILVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用功能视图标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppUtilViewIdDirty(){
        if(this.contains(FIELD_PSAPPUTILVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用功能视图标识
     */
    @JsonIgnore
    public void resetPSAppUtilViewId(){
        this.reset(FIELD_PSAPPUTILVIEWID);
        this.reset(FIELD_PSAPPVIEWID);        
    }

    /**
     * 设置 应用功能视图标识
     * <P>
     * 等同 {@link #setPSAppUtilViewId}
     * @param pSAppUtilViewId
     */
    @JsonIgnore
    public PSAppUtilView psapputilviewid(String pSAppUtilViewId){
        this.setPSAppUtilViewId(pSAppUtilViewId);
        return this;
    }

    /**
     * <B>PSAPPUTILVIEWNAME</B>&nbsp;代码标识，指定应用功能视图的代码标识，需在所在前端应用中具备唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSAPPUTILVIEWNAME = "psapputilviewname";

    /**
     * 设置 代码标识，详细说明：{@link #FIELD_PSAPPUTILVIEWNAME}
     * 
     * @param pSAppUtilViewName
     * 
     */
    @JsonProperty(FIELD_PSAPPUTILVIEWNAME)
    public void setPSAppUtilViewName(String pSAppUtilViewName){
        this.set(FIELD_PSAPPUTILVIEWNAME, pSAppUtilViewName);
        this.set(FIELD_PSAPPVIEWNAME, pSAppUtilViewName);        
    }
    
    /**
     * 获取 代码标识  
     * @return
     */
    @JsonIgnore
    public String getPSAppUtilViewName(){
        Object objValue = this.get(FIELD_PSAPPUTILVIEWNAME);
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
    public boolean isPSAppUtilViewNameDirty(){
        if(this.contains(FIELD_PSAPPUTILVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码标识
     */
    @JsonIgnore
    public void resetPSAppUtilViewName(){
        this.reset(FIELD_PSAPPUTILVIEWNAME);
        this.reset(FIELD_PSAPPVIEWNAME);        
    }

    /**
     * 设置 代码标识，详细说明：{@link #FIELD_PSAPPUTILVIEWNAME}
     * <P>
     * 等同 {@link #setPSAppUtilViewName}
     * @param pSAppUtilViewName
     */
    @JsonIgnore
    public PSAppUtilView psapputilviewname(String pSAppUtilViewName){
        this.setPSAppUtilViewName(pSAppUtilViewName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSAppUtilViewName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSAppUtilViewName(strName);
    }

    @JsonIgnore
    public PSAppUtilView name(String strName){
        this.setPSAppUtilViewName(strName);
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
    public PSAppUtilView updatedate(String updateDate){
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
    public PSAppUtilView updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSAppUtilViewId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSAppUtilViewId(strValue);
    }

    @JsonIgnore
    public PSAppUtilView id(String strValue){
        this.setPSAppUtilViewId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSAppUtilView){
            PSAppUtilView model = (PSAppUtilView)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
