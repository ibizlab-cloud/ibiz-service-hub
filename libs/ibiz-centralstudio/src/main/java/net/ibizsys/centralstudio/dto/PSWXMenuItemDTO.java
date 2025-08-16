package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSWXMENUITEM</B>微信菜单项 模型传输对象
 * <P>
 * 微信菜单项模型，定义菜单项的显示内容及触发的菜单功能
 */
public class PSWXMenuItemDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSWXMenuItemDTO(){
    }      

    /**
     * <B>CAPTION</B>&nbsp;标题，指定微信菜单项的标题
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CAPTION = "caption";

    /**
     * 设置 标题，详细说明：{@link #FIELD_CAPTION}
     * 
     * @param caption
     * 
     */
    @JsonProperty(FIELD_CAPTION)
    public void setCaption(String caption){
        this.set(FIELD_CAPTION, caption);
    }
    
    /**
     * 获取 标题  
     * @return
     */
    @JsonIgnore
    public String getCaption(){
        Object objValue = this.get(FIELD_CAPTION);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标题 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCaptionDirty(){
        if(this.contains(FIELD_CAPTION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题
     */
    @JsonIgnore
    public void resetCaption(){
        this.reset(FIELD_CAPTION);
    }

    /**
     * 设置 标题，详细说明：{@link #FIELD_CAPTION}
     * <P>
     * 等同 {@link #setCaption}
     * @param caption
     */
    @JsonIgnore
    public PSWXMenuItemDTO caption(String caption){
        this.setCaption(caption);
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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setCreateDate(Timestamp createDate){
        this.set(FIELD_CREATEDATE, createDate);
    }
    
    /**
     * 获取 建立时间  
     * @return
     */
    @JsonIgnore
    public Timestamp getCreateDate(){
        Object objValue = this.get(FIELD_CREATEDATE);
        if(objValue==null){
            return null;
        }
        return (Timestamp)objValue;
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
    public PSWXMenuItemDTO createdate(Timestamp createDate){
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
    public PSWXMenuItemDTO createman(String createMan){
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
    public PSWXMenuItemDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;显示次序，指定微信菜单项的显示次序
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 显示次序，详细说明：{@link #FIELD_ORDERVALUE}
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
     * 设置 显示次序，详细说明：{@link #FIELD_ORDERVALUE}
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSWXMenuItemDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PPSWXMENUITEMID</B>&nbsp;父菜单项，指定微信菜单项的父菜单项
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSWXMenuItemDTO} 
     */
    public final static String FIELD_PPSWXMENUITEMID = "ppswxmenuitemid";

    /**
     * 设置 父菜单项，详细说明：{@link #FIELD_PPSWXMENUITEMID}
     * 
     * @param pPSWXMenuItemId
     * 
     */
    @JsonProperty(FIELD_PPSWXMENUITEMID)
    public void setPPSWXMenuItemId(String pPSWXMenuItemId){
        this.set(FIELD_PPSWXMENUITEMID, pPSWXMenuItemId);
    }
    
    /**
     * 获取 父菜单项  
     * @return
     */
    @JsonIgnore
    public String getPPSWXMenuItemId(){
        Object objValue = this.get(FIELD_PPSWXMENUITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父菜单项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSWXMenuItemIdDirty(){
        if(this.contains(FIELD_PPSWXMENUITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父菜单项
     */
    @JsonIgnore
    public void resetPPSWXMenuItemId(){
        this.reset(FIELD_PPSWXMENUITEMID);
    }

    /**
     * 设置 父菜单项，详细说明：{@link #FIELD_PPSWXMENUITEMID}
     * <P>
     * 等同 {@link #setPPSWXMenuItemId}
     * @param pPSWXMenuItemId
     */
    @JsonIgnore
    public PSWXMenuItemDTO ppswxmenuitemid(String pPSWXMenuItemId){
        this.setPPSWXMenuItemId(pPSWXMenuItemId);
        return this;
    }

    /**
     * 设置 父菜单项，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPPSWXMenuItemId}
     * @param pSWXMenuItem 引用对象
     */
    @JsonIgnore
    public PSWXMenuItemDTO ppswxmenuitemid(PSWXMenuItemDTO pSWXMenuItem){
        if(pSWXMenuItem == null){
            this.setPPSWXMenuItemId(null);
            this.setPPSWXMenuItemName(null);
        }
        else{
            this.setPPSWXMenuItemId(pSWXMenuItem.getPSWXMenuItemId());
            this.setPPSWXMenuItemName(pSWXMenuItem.getPSWXMenuItemName());
        }
        return this;
    }

    /**
     * <B>PPSWXMENUITEMNAME</B>&nbsp;父菜单项，指定微信菜单项的父菜单项
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PPSWXMENUITEMID}
     */
    public final static String FIELD_PPSWXMENUITEMNAME = "ppswxmenuitemname";

    /**
     * 设置 父菜单项，详细说明：{@link #FIELD_PPSWXMENUITEMNAME}
     * 
     * @param pPSWXMenuItemName
     * 
     */
    @JsonProperty(FIELD_PPSWXMENUITEMNAME)
    public void setPPSWXMenuItemName(String pPSWXMenuItemName){
        this.set(FIELD_PPSWXMENUITEMNAME, pPSWXMenuItemName);
    }
    
    /**
     * 获取 父菜单项  
     * @return
     */
    @JsonIgnore
    public String getPPSWXMenuItemName(){
        Object objValue = this.get(FIELD_PPSWXMENUITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父菜单项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSWXMenuItemNameDirty(){
        if(this.contains(FIELD_PPSWXMENUITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父菜单项
     */
    @JsonIgnore
    public void resetPPSWXMenuItemName(){
        this.reset(FIELD_PPSWXMENUITEMNAME);
    }

    /**
     * 设置 父菜单项，详细说明：{@link #FIELD_PPSWXMENUITEMNAME}
     * <P>
     * 等同 {@link #setPPSWXMenuItemName}
     * @param pPSWXMenuItemName
     */
    @JsonIgnore
    public PSWXMenuItemDTO ppswxmenuitemname(String pPSWXMenuItemName){
        this.setPPSWXMenuItemName(pPSWXMenuItemName);
        return this;
    }

    /**
     * <B>PSWXMENUFUNCID</B>&nbsp;微信菜单功能，指定微信菜单项触发的菜单功能
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSWXMenuFuncDTO} 
     */
    public final static String FIELD_PSWXMENUFUNCID = "pswxmenufuncid";

    /**
     * 设置 微信菜单功能，详细说明：{@link #FIELD_PSWXMENUFUNCID}
     * 
     * @param pSWXMenuFuncId
     * 
     */
    @JsonProperty(FIELD_PSWXMENUFUNCID)
    public void setPSWXMenuFuncId(String pSWXMenuFuncId){
        this.set(FIELD_PSWXMENUFUNCID, pSWXMenuFuncId);
    }
    
    /**
     * 获取 微信菜单功能  
     * @return
     */
    @JsonIgnore
    public String getPSWXMenuFuncId(){
        Object objValue = this.get(FIELD_PSWXMENUFUNCID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 微信菜单功能 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWXMenuFuncIdDirty(){
        if(this.contains(FIELD_PSWXMENUFUNCID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 微信菜单功能
     */
    @JsonIgnore
    public void resetPSWXMenuFuncId(){
        this.reset(FIELD_PSWXMENUFUNCID);
    }

    /**
     * 设置 微信菜单功能，详细说明：{@link #FIELD_PSWXMENUFUNCID}
     * <P>
     * 等同 {@link #setPSWXMenuFuncId}
     * @param pSWXMenuFuncId
     */
    @JsonIgnore
    public PSWXMenuItemDTO pswxmenufuncid(String pSWXMenuFuncId){
        this.setPSWXMenuFuncId(pSWXMenuFuncId);
        return this;
    }

    /**
     * 设置 微信菜单功能，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSWXMenuFuncId}
     * @param pSWXMenuFunc 引用对象
     */
    @JsonIgnore
    public PSWXMenuItemDTO pswxmenufuncid(PSWXMenuFuncDTO pSWXMenuFunc){
        if(pSWXMenuFunc == null){
            this.setPSWXMenuFuncId(null);
            this.setPSWXMenuFuncName(null);
        }
        else{
            this.setPSWXMenuFuncId(pSWXMenuFunc.getPSWXMenuFuncId());
            this.setPSWXMenuFuncName(pSWXMenuFunc.getPSWXMenuFuncName());
        }
        return this;
    }

    /**
     * <B>PSWXMENUFUNCNAME</B>&nbsp;微信菜单功能，指定微信菜单项触发的菜单功能
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWXMENUFUNCID}
     */
    public final static String FIELD_PSWXMENUFUNCNAME = "pswxmenufuncname";

    /**
     * 设置 微信菜单功能，详细说明：{@link #FIELD_PSWXMENUFUNCNAME}
     * 
     * @param pSWXMenuFuncName
     * 
     */
    @JsonProperty(FIELD_PSWXMENUFUNCNAME)
    public void setPSWXMenuFuncName(String pSWXMenuFuncName){
        this.set(FIELD_PSWXMENUFUNCNAME, pSWXMenuFuncName);
    }
    
    /**
     * 获取 微信菜单功能  
     * @return
     */
    @JsonIgnore
    public String getPSWXMenuFuncName(){
        Object objValue = this.get(FIELD_PSWXMENUFUNCNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 微信菜单功能 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWXMenuFuncNameDirty(){
        if(this.contains(FIELD_PSWXMENUFUNCNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 微信菜单功能
     */
    @JsonIgnore
    public void resetPSWXMenuFuncName(){
        this.reset(FIELD_PSWXMENUFUNCNAME);
    }

    /**
     * 设置 微信菜单功能，详细说明：{@link #FIELD_PSWXMENUFUNCNAME}
     * <P>
     * 等同 {@link #setPSWXMenuFuncName}
     * @param pSWXMenuFuncName
     */
    @JsonIgnore
    public PSWXMenuItemDTO pswxmenufuncname(String pSWXMenuFuncName){
        this.setPSWXMenuFuncName(pSWXMenuFuncName);
        return this;
    }

    /**
     * <B>PSWXMENUID</B>&nbsp;微信菜单，指定微信菜单项所属的微信菜单
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSWXMenuDTO} 
     */
    public final static String FIELD_PSWXMENUID = "pswxmenuid";

    /**
     * 设置 微信菜单，详细说明：{@link #FIELD_PSWXMENUID}
     * 
     * @param pSWXMenuId
     * 
     */
    @JsonProperty(FIELD_PSWXMENUID)
    public void setPSWXMenuId(String pSWXMenuId){
        this.set(FIELD_PSWXMENUID, pSWXMenuId);
    }
    
    /**
     * 获取 微信菜单  
     * @return
     */
    @JsonIgnore
    public String getPSWXMenuId(){
        Object objValue = this.get(FIELD_PSWXMENUID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 微信菜单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWXMenuIdDirty(){
        if(this.contains(FIELD_PSWXMENUID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 微信菜单
     */
    @JsonIgnore
    public void resetPSWXMenuId(){
        this.reset(FIELD_PSWXMENUID);
    }

    /**
     * 设置 微信菜单，详细说明：{@link #FIELD_PSWXMENUID}
     * <P>
     * 等同 {@link #setPSWXMenuId}
     * @param pSWXMenuId
     */
    @JsonIgnore
    public PSWXMenuItemDTO pswxmenuid(String pSWXMenuId){
        this.setPSWXMenuId(pSWXMenuId);
        return this;
    }

    /**
     * 设置 微信菜单，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSWXMenuId}
     * @param pSWXMenu 引用对象
     */
    @JsonIgnore
    public PSWXMenuItemDTO pswxmenuid(PSWXMenuDTO pSWXMenu){
        if(pSWXMenu == null){
            this.setPSWXMenuId(null);
            this.setPSWXMenuName(null);
        }
        else{
            this.setPSWXMenuId(pSWXMenu.getPSWXMenuId());
            this.setPSWXMenuName(pSWXMenu.getPSWXMenuName());
        }
        return this;
    }

    /**
     * <B>PSWXMENUITEMID</B>&nbsp;微信菜单项标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSWXMENUITEMID = "pswxmenuitemid";

    /**
     * 设置 微信菜单项标识
     * 
     * @param pSWXMenuItemId
     * 
     */
    @JsonProperty(FIELD_PSWXMENUITEMID)
    public void setPSWXMenuItemId(String pSWXMenuItemId){
        this.set(FIELD_PSWXMENUITEMID, pSWXMenuItemId);
    }
    
    /**
     * 获取 微信菜单项标识  
     * @return
     */
    @JsonIgnore
    public String getPSWXMenuItemId(){
        Object objValue = this.get(FIELD_PSWXMENUITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 微信菜单项标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWXMenuItemIdDirty(){
        if(this.contains(FIELD_PSWXMENUITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 微信菜单项标识
     */
    @JsonIgnore
    public void resetPSWXMenuItemId(){
        this.reset(FIELD_PSWXMENUITEMID);
    }

    /**
     * 设置 微信菜单项标识
     * <P>
     * 等同 {@link #setPSWXMenuItemId}
     * @param pSWXMenuItemId
     */
    @JsonIgnore
    public PSWXMenuItemDTO pswxmenuitemid(String pSWXMenuItemId){
        this.setPSWXMenuItemId(pSWXMenuItemId);
        return this;
    }

    /**
     * <B>PSWXMENUITEMNAME</B>&nbsp;菜单项名称，指定微信菜单项的名称，需在所属微信菜单中具备唯一性
     * <P>
     * 字符串：最大长度 30，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSWXMENUITEMNAME = "pswxmenuitemname";

    /**
     * 设置 菜单项名称，详细说明：{@link #FIELD_PSWXMENUITEMNAME}
     * 
     * @param pSWXMenuItemName
     * 
     */
    @JsonProperty(FIELD_PSWXMENUITEMNAME)
    public void setPSWXMenuItemName(String pSWXMenuItemName){
        this.set(FIELD_PSWXMENUITEMNAME, pSWXMenuItemName);
    }
    
    /**
     * 获取 菜单项名称  
     * @return
     */
    @JsonIgnore
    public String getPSWXMenuItemName(){
        Object objValue = this.get(FIELD_PSWXMENUITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 菜单项名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWXMenuItemNameDirty(){
        if(this.contains(FIELD_PSWXMENUITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 菜单项名称
     */
    @JsonIgnore
    public void resetPSWXMenuItemName(){
        this.reset(FIELD_PSWXMENUITEMNAME);
    }

    /**
     * 设置 菜单项名称，详细说明：{@link #FIELD_PSWXMENUITEMNAME}
     * <P>
     * 等同 {@link #setPSWXMenuItemName}
     * @param pSWXMenuItemName
     */
    @JsonIgnore
    public PSWXMenuItemDTO pswxmenuitemname(String pSWXMenuItemName){
        this.setPSWXMenuItemName(pSWXMenuItemName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSWXMenuItemName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSWXMenuItemName(strName);
    }

    @JsonIgnore
    public PSWXMenuItemDTO name(String strName){
        this.setPSWXMenuItemName(strName);
        return this;
    }

    /**
     * <B>PSWXMENUNAME</B>&nbsp;微信菜单，指定微信菜单项所属的微信菜单
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWXMENUID}
     */
    public final static String FIELD_PSWXMENUNAME = "pswxmenuname";

    /**
     * 设置 微信菜单，详细说明：{@link #FIELD_PSWXMENUNAME}
     * 
     * @param pSWXMenuName
     * 
     */
    @JsonProperty(FIELD_PSWXMENUNAME)
    public void setPSWXMenuName(String pSWXMenuName){
        this.set(FIELD_PSWXMENUNAME, pSWXMenuName);
    }
    
    /**
     * 获取 微信菜单  
     * @return
     */
    @JsonIgnore
    public String getPSWXMenuName(){
        Object objValue = this.get(FIELD_PSWXMENUNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 微信菜单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWXMenuNameDirty(){
        if(this.contains(FIELD_PSWXMENUNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 微信菜单
     */
    @JsonIgnore
    public void resetPSWXMenuName(){
        this.reset(FIELD_PSWXMENUNAME);
    }

    /**
     * 设置 微信菜单，详细说明：{@link #FIELD_PSWXMENUNAME}
     * <P>
     * 等同 {@link #setPSWXMenuName}
     * @param pSWXMenuName
     */
    @JsonIgnore
    public PSWXMenuItemDTO pswxmenuname(String pSWXMenuName){
        this.setPSWXMenuName(pSWXMenuName);
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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setUpdateDate(Timestamp updateDate){
        this.set(FIELD_UPDATEDATE, updateDate);
    }
    
    /**
     * 获取 更新时间  
     * @return
     */
    @JsonIgnore
    public Timestamp getUpdateDate(){
        Object objValue = this.get(FIELD_UPDATEDATE);
        if(objValue==null){
            return null;
        }
        return (Timestamp)objValue;
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
    public PSWXMenuItemDTO updatedate(Timestamp updateDate){
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
    public PSWXMenuItemDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>USERCAT</B>&nbsp;用户分类
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.ModelUserCat} 
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
    public PSWXMenuItemDTO usercat(String userCat){
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
    public PSWXMenuItemDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSWXMenuItemDTO usertag(String userTag){
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
    public PSWXMenuItemDTO usertag2(String userTag2){
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
    public PSWXMenuItemDTO usertag3(String userTag3){
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
    public PSWXMenuItemDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSWXMenuItemId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSWXMenuItemId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSWXMenuItemId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSWXMenuItemId(strValue);
    }

    @JsonIgnore
    public PSWXMenuItemDTO id(String strValue){
        this.setPSWXMenuItemId(strValue);
        return this;
    }


    /**
     *  微信菜单项 成员集合
     */
    public final static String FIELD_PSWXMENUITEMS = "pswxmenuitems";

    private java.util.List<net.ibizsys.centralstudio.dto.PSWXMenuItemDTO> pswxmenuitems;

    /**
     * 获取 微信菜单项 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSWXMENUITEMS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSWXMenuItemDTO> getPSWXMenuItems(){
        return this.pswxmenuitems;
    }

    /**
     * 设置 微信菜单项 成员集合  
     * @param pswxmenuitems
     */
    @JsonProperty(FIELD_PSWXMENUITEMS)
    public void setPSWXMenuItems(java.util.List<net.ibizsys.centralstudio.dto.PSWXMenuItemDTO> pswxmenuitems){
        this.pswxmenuitems = pswxmenuitems;
    }

    /**
     * 获取 微信菜单项 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSWXMenuItemDTO> getPSWXMenuItemsIf(){
        if(this.pswxmenuitems == null){
            this.pswxmenuitems = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSWXMenuItemDTO>();          
        }
        return this.pswxmenuitems;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSWXMenuItemDTO){
            PSWXMenuItemDTO dto = (PSWXMenuItemDTO)iEntity;
            dto.setPSWXMenuItems(this.getPSWXMenuItems());
        }
        super.copyTo(iEntity);
    }
}
